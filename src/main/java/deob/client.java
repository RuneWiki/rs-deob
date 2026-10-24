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
public final class client extends AMZQHNGA {

	@ObfuscatedName("client.K")
	public int field50 = -1;

	@ObfuscatedName("client.L")
	public int field51 = -1;

	@ObfuscatedName("client.T")
	public int field59 = -1;

	@ObfuscatedName("client.U")
	public NUXITFPR[] field60 = new NUXITFPR[100];

	@ObfuscatedName("client.X")
	public volatile boolean field63 = false;

	@ObfuscatedName("client.eb")
	public int field69 = -1;

	@ObfuscatedName("client.hb")
	public int[][] field71 = new int[104][104];

	@ObfuscatedName("client.ib")
	public String field72 = "";

	@ObfuscatedName("client.mb")
	public boolean field74 = false;

	@ObfuscatedName("client.qb")
	public int field78 = -1;

	@ObfuscatedName("client.tb")
	public int[] field80 = new int[33];

	@ObfuscatedName("client.wb")
	public int field82 = 0x23201B;

	@ObfuscatedName("client.xb")
	public int[] field83 = new int[5];

	@ObfuscatedName("client.yb")
	public int field84 = -1;

	@ObfuscatedName("client.Hb")
	public String field92 = "";

	@ObfuscatedName("client.Ib")
	public String field93 = "";

	@ObfuscatedName("client.Kb")
	public NUXITFPR[] field94 = new NUXITFPR[32];

	@ObfuscatedName("client.Wb")
	public int field106 = 50;

	@ObfuscatedName("client.Xb")
	public int[] field107 = new int[field106];

	@ObfuscatedName("client.Yb")
	public int[] field108 = new int[field106];

	@ObfuscatedName("client.Zb")
	public int[] field109 = new int[field106];

	@ObfuscatedName("client.ac")
	public int[] field110 = new int[field106];

	@ObfuscatedName("client.bc")
	public int[] field111 = new int[field106];

	@ObfuscatedName("client.cc")
	public int[] field112 = new int[field106];

	@ObfuscatedName("client.dc")
	public int[] field113 = new int[field106];

	@ObfuscatedName("client.ec")
	public String[] field114 = new String[field106];

	@ObfuscatedName("client.kc")
	public int[] field118 = new int[4000];

	@ObfuscatedName("client.lc")
	public int[] field119 = new int[4000];

	@ObfuscatedName("client.mc")
	public int field120 = -1;

	@ObfuscatedName("client.oc")
	public byte[] field122 = new byte[16384];

	@ObfuscatedName("client.uc")
	public String[] field126 = new String[5];

	@ObfuscatedName("client.vc")
	public boolean[] field127 = new boolean[5];

	@ObfuscatedName("client.wc")
	public boolean field128 = false;

	@ObfuscatedName("client.xc")
	public int field129 = -1;

	@ObfuscatedName("client.Dc")
	public int[][] field134 = new int[104][104];

	@ObfuscatedName("client.Fc")
	public NUXITFPR[] field136 = new NUXITFPR[32];

	@ObfuscatedName("client.Hc")
	public int[] field138 = new int[100];

	@ObfuscatedName("client.Ic")
	public String[] field139 = new String[100];

	@ObfuscatedName("client.Jc")
	public String[] field140 = new String[100];

	@ObfuscatedName("client.Kc")
	public VYBZTNTY[][][] field141 = new VYBZTNTY[4][104][104];

	@ObfuscatedName("client.Mc")
	public int[] field142 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Oc")
	public int field144 = 2;

	@ObfuscatedName("client.cd")
	public NUXITFPR[] field156 = new NUXITFPR[8];

	@ObfuscatedName("client.fd")
	public boolean field159 = false;

	@ObfuscatedName("client.nd")
	public boolean field166 = false;

	@ObfuscatedName("client.od")
	public int field167 = -1;

	@ObfuscatedName("client.vd")
	public int field171 = 1;

	@ObfuscatedName("client.zd")
	public final int field175 = 100;

	@ObfuscatedName("client.Ad")
	public int[] field176 = new int[100];

	@ObfuscatedName("client.Fd")
	public String[] field179 = new String[200];

	@ObfuscatedName("client.Gd")
	public int[] field180 = new int[200];

	@ObfuscatedName("client.Sd")
	public int[] field190 = new int[5];

	@ObfuscatedName("client.Td")
	public boolean field191 = false;

	@ObfuscatedName("client.Ud")
	public boolean field192 = true;

	@ObfuscatedName("client.Vd")
	public int[] field193 = new int[5];

	@ObfuscatedName("client.ee")
	public CRC32 field202 = new CRC32();

	@ObfuscatedName("client.ge")
	public boolean[] field204 = new boolean[5];

	@ObfuscatedName("client.ie")
	public boolean field206 = false;

	@ObfuscatedName("client.le")
	public boolean field208 = true;

	@ObfuscatedName("client.me")
	public long[] field209 = new long[200];

	@ObfuscatedName("client.oe")
	public int field211 = 0x766654;

	@ObfuscatedName("client.ye")
	public boolean field220 = true;

	@ObfuscatedName("client.ze")
	public VYBZTNTY field221 = new VYBZTNTY();

	@ObfuscatedName("client.Ae")
	public NUXITFPR[] field222 = new NUXITFPR[1000];

	@ObfuscatedName("client.Ce")
	public int[] field223 = new int[5];

	@ObfuscatedName("client.De")
	public GHHPHSRU field224 = GHHPHSRU.method190(1);

	@ObfuscatedName("client.Ee")
	public XBMRDXRN[] field225 = new XBMRDXRN[4];

	@ObfuscatedName("client.Fe")
	public boolean field226 = false;

	@ObfuscatedName("client.Ge")
	public String[] field227 = new String[500];

	@ObfuscatedName("client.Ke")
	public String field231 = "";

	@ObfuscatedName("client.Ne")
	public int[] field233 = new int[MPJJINEH.field982];

	@ObfuscatedName("client.Oe")
	public boolean field234 = false;

	@ObfuscatedName("client.Pe")
	public boolean field235 = false;

	@ObfuscatedName("client.Qe")
	public boolean field236 = false;

	@ObfuscatedName("client.Ze")
	public boolean field245 = false;

	@ObfuscatedName("client.hf")
	public int field252 = -1;

	@ObfuscatedName("client.of")
	public int field258 = 2;

	@ObfuscatedName("client.uf")
	public boolean field264 = false;

	@ObfuscatedName("client.Gf")
	public boolean field276 = false;

	@ObfuscatedName("client.Kf")
	public int[] field279 = new int[1000];

	@ObfuscatedName("client.Lf")
	public int[] field280 = new int[1000];

	@ObfuscatedName("client.Mf")
	public KZTQXFDC[] field281 = new KZTQXFDC[2];

	@ObfuscatedName("client.Of")
	public int[] field283 = new int[MPJJINEH.field982];

	@ObfuscatedName("client.Xf")
	public String field292 = "";

	@ObfuscatedName("client.Yf")
	public String field293 = "";

	@ObfuscatedName("client.cg")
	public int[] field296 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.dg")
	public int[] field297 = new int[5];

	@ObfuscatedName("client.fg")
	public int[] field298 = new int[50];

	@ObfuscatedName("client.hg")
	public EKHKDMUP field300 = new EKHKDMUP();

	@ObfuscatedName("client.ig")
	public int field301 = -1;

	@ObfuscatedName("client.jg")
	public int field302 = -1;

	@ObfuscatedName("client.kg")
	public boolean field303 = false;

	@ObfuscatedName("client.og")
	public NUXITFPR[] field306 = new NUXITFPR[20];

	@ObfuscatedName("client.pg")
	public int[] field307 = new int[151];

	@ObfuscatedName("client.sg")
	public int[] field310 = new int[MPJJINEH.field982];

	@ObfuscatedName("client.yg")
	public int[][][] field314 = new int[4][13][13];

	@ObfuscatedName("client.zg")
	public int[] field315 = new int[500];

	@ObfuscatedName("client.Ag")
	public int[] field316 = new int[500];

	@ObfuscatedName("client.Bg")
	public int[] field317 = new int[500];

	@ObfuscatedName("client.Cg")
	public int[] field318 = new int[500];

	@ObfuscatedName("client.Fg")
	public boolean field320 = false;

	@ObfuscatedName("client.Jg")
	public boolean field324 = false;

	@ObfuscatedName("client.Ng")
	public String field328 = "";

	@ObfuscatedName("client.Og")
	public VYBZTNTY field329 = new VYBZTNTY();

	@ObfuscatedName("client.Qg")
	public volatile boolean field331 = false;

	@ObfuscatedName("client.Zg")
	public String field340 = "";

	@ObfuscatedName("client.ah")
	public int[] field341 = new int[50];

	@ObfuscatedName("client.bh")
	public int[] field342 = new int[7];

	@ObfuscatedName("client.ch")
	public GHHPHSRU field343 = GHHPHSRU.method190(1);

	@ObfuscatedName("client.dh")
	public volatile boolean field344 = false;

	@ObfuscatedName("client.fh")
	public int[] field346 = new int[151];

	@ObfuscatedName("client.gh")
	public VYBZTNTY field347 = new VYBZTNTY();

	@ObfuscatedName("client.kh")
	public boolean field351 = false;

	@ObfuscatedName("client.lh")
	public String field352 = "";

	@ObfuscatedName("client.oh")
	public boolean field355 = false;

	@ObfuscatedName("client.qh")
	public boolean field357 = true;

	@ObfuscatedName("client.rh")
	public final int[] field358 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.sh")
	public int field359 = -1;

	@ObfuscatedName("client.th")
	public GHHPHSRU field360 = new GHHPHSRU(new byte[5000]);

	@ObfuscatedName("client.uh")
	public LJAXEEYT[] field361 = new LJAXEEYT[16384];

	@ObfuscatedName("client.wh")
	public int[] field363 = new int[16384];

	@ObfuscatedName("client.yh")
	public boolean field365 = true;

	@ObfuscatedName("client.Gh")
	public int field370 = 0x332D25;

	@ObfuscatedName("client.Jh")
	public int field373 = 0x4D4233;

	@ObfuscatedName("client.Rh")
	public int field381 = -1;

	@ObfuscatedName("client.Uh")
	public boolean field384 = false;

	@ObfuscatedName("client.Wh")
	public int field386 = 1;

	@ObfuscatedName("client.Yh")
	public boolean field388 = false;

	@ObfuscatedName("client.ei")
	public int[] field393 = new int[50];

	@ObfuscatedName("client.hi")
	public int field395 = 78;

	@ObfuscatedName("client.li")
	public int field398 = 2048;

	@ObfuscatedName("client.mi")
	public int field399 = 2047;

	@ObfuscatedName("client.ni")
	public EJJAKGTE[] field400 = new EJJAKGTE[field398];

	@ObfuscatedName("client.pi")
	public int[] field402 = new int[field398];

	@ObfuscatedName("client.ri")
	public int[] field404 = new int[field398];

	@ObfuscatedName("client.si")
	public GHHPHSRU[] field405 = new GHHPHSRU[field398];

	@ObfuscatedName("client.wi")
	public KZTQXFDC[] field408 = new KZTQXFDC[13];

	@ObfuscatedName("client.Ii")
	public boolean field419 = false;

	@ObfuscatedName("client.Ki")
	public int field421 = -1;

	@ObfuscatedName("client.Oi")
	public int[] field424 = new int[1000];

	@ObfuscatedName("client.Si")
	public XEGQQHIM[] field428 = new XEGQQHIM[5];

	@ObfuscatedName("client.Ti")
	public long[] field429 = new long[100];

	@ObfuscatedName("client.Ui")
	public int field430 = 128;

	@ObfuscatedName("client.jj")
	public int[][] field442 = new int[104][104];

	@ObfuscatedName("client.kj")
	public int field443 = -1;

	@ObfuscatedName("client.sj")
	public GHHPHSRU field450 = GHHPHSRU.method190(1);

	@ObfuscatedName("client.Aj")
	public int field457 = 3;

	@ObfuscatedName("client.Cj")
	public boolean field459 = false;

	@ObfuscatedName("client.Fj")
	public int field462 = 2;

	@ObfuscatedName("client.Ij")
	public KZTQXFDC[] field465 = new KZTQXFDC[100];

	@ObfuscatedName("client.Jj")
	public int[] field466 = new int[2000];

	@ObfuscatedName("client.Rj")
	public NUXITFPR[] field471 = new NUXITFPR[32];

	@ObfuscatedName("client.Xj")
	public int[] field476 = new int[9];

	@ObfuscatedName("client.Yj")
	public int[] field477 = new int[2000];

	@ObfuscatedName("client.Zj")
	public int[] field478 = new int[256];

	@ObfuscatedName("client.ak")
	public int[] field479 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.lk")
	public int[] field490 = new int[33];

	@ObfuscatedName("client.W")
	public static String field62 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Gc")
	public static BigInteger field137 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ed")
	public static int[] field158 = new int[32];

	@ObfuscatedName("client.Cd")
	public static BigInteger field177 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Re")
	public static int field237 = 10;

	@ObfuscatedName("client.Te")
	public static boolean field239 = true;

	@ObfuscatedName("client.Qh")
	public static final int[] field380 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.mj")
	public static final int[][] field444 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Dj")
	public static int[] field460 = new int[99];

	@ObfuscatedName("client.Qb")
	public int field100;

	@ObfuscatedName("client.Rb")
	public int field101;

	@ObfuscatedName("client.Sb")
	public int field102;

	@ObfuscatedName("client.Tb")
	public int field103;

	@ObfuscatedName("client.Ub")
	public int field104;

	@ObfuscatedName("client.Vb")
	public int field105;

	@ObfuscatedName("client.ic")
	public int field117;

	@ObfuscatedName("client.nc")
	public int field121;

	@ObfuscatedName("client.qc")
	public int field124;

	@ObfuscatedName("client.sc")
	public int field125;

	@ObfuscatedName("client.yc")
	public int field130;

	@ObfuscatedName("client.zc")
	public int field131;

	@ObfuscatedName("client.Ac")
	public static int field132;

	@ObfuscatedName("client.Cc")
	public static int field133;

	@ObfuscatedName("client.Ec")
	public int field135;

	@ObfuscatedName("client.Nc")
	public int field143;

	@ObfuscatedName("client.Yc")
	public int field152;

	@ObfuscatedName("client.Zc")
	public static int field153;

	@ObfuscatedName("client.ad")
	public int field154;

	@ObfuscatedName("client.bd")
	public int field155;

	@ObfuscatedName("client.dd")
	public int field157;

	@ObfuscatedName("client.gd")
	public int field160;

	@ObfuscatedName("client.hd")
	public int field161;

	@ObfuscatedName("client.id")
	public int field162;

	@ObfuscatedName("client.jd")
	public int field163;

	@ObfuscatedName("client.ld")
	public int field164;

	@ObfuscatedName("client.md")
	public int field165;

	@ObfuscatedName("client.pd")
	public int field168;

	@ObfuscatedName("client.td")
	public static int field169;

	@ObfuscatedName("client.ud")
	public int field170;

	@ObfuscatedName("client.wd")
	public int field172;

	@ObfuscatedName("client.xd")
	public int field173;

	@ObfuscatedName("client.yd")
	public int field174;

	@ObfuscatedName("client.Dd")
	public static int field178;

	@ObfuscatedName("client.Hd")
	public int field181;

	@ObfuscatedName("client.Id")
	public int field182;

	@ObfuscatedName("client.Jd")
	public int field183;

	@ObfuscatedName("client.Kd")
	public int field184;

	@ObfuscatedName("client.Ld")
	public int field185;

	@ObfuscatedName("client.Pd")
	public int field188;

	@ObfuscatedName("client.Qd")
	public static int field189;

	@ObfuscatedName("client.Wd")
	public int field194;

	@ObfuscatedName("client.Xd")
	public int field195;

	@ObfuscatedName("client.de")
	public int field201;

	@ObfuscatedName("client.fe")
	public int field203;

	@ObfuscatedName("client.he")
	public int field205;

	@ObfuscatedName("client.ne")
	public int field210;

	@ObfuscatedName("client.pe")
	public int field212;

	@ObfuscatedName("client.te")
	public int field215;

	@ObfuscatedName("client.ue")
	public int field216;

	@ObfuscatedName("client.ve")
	public int field217;

	@ObfuscatedName("client.we")
	public int field218;

	@ObfuscatedName("client.xe")
	public int field219;

	@ObfuscatedName("client.He")
	public int field228;

	@ObfuscatedName("client.Ie")
	public int field229;

	@ObfuscatedName("client.Je")
	public int field230;

	@ObfuscatedName("client.Se")
	public static int field238;

	@ObfuscatedName("client.bf")
	public int field246;

	@ObfuscatedName("client.cf")
	public int field247;

	@ObfuscatedName("client.df")
	public int field248;

	@ObfuscatedName("client.ef")
	public int field249;

	@ObfuscatedName("client.gf")
	public int field251;

	@ObfuscatedName("client.jf")
	public int field253;

	@ObfuscatedName("client.nf")
	public int field257;

	@ObfuscatedName("client.pf")
	public int field259;

	@ObfuscatedName("client.qf")
	public int field260;

	@ObfuscatedName("client.rf")
	public int field261;

	@ObfuscatedName("client.sf")
	public int field262;

	@ObfuscatedName("client.tf")
	public int field263;

	@ObfuscatedName("client.Ef")
	public static int field274;

	@ObfuscatedName("client.Ff")
	public int field275;

	@ObfuscatedName("client.If")
	public int field277;

	@ObfuscatedName("client.Jf")
	public int field278;

	@ObfuscatedName("client.Nf")
	public int field282;

	@ObfuscatedName("client.Pf")
	public static int field284;

	@ObfuscatedName("client.Qf")
	public static int field285;

	@ObfuscatedName("client.Rf")
	public int field286;

	@ObfuscatedName("client.Sf")
	public int field287;

	@ObfuscatedName("client.Tf")
	public int field288;

	@ObfuscatedName("client.Uf")
	public int field289;

	@ObfuscatedName("client.Vf")
	public int field290;

	@ObfuscatedName("client.Wf")
	public int field291;

	@ObfuscatedName("client.bg")
	public int field295;

	@ObfuscatedName("client.gg")
	public int field299;

	@ObfuscatedName("client.mg")
	public int field304;

	@ObfuscatedName("client.ng")
	public int field305;

	@ObfuscatedName("client.ug")
	public int field311;

	@ObfuscatedName("client.xg")
	public int field313;

	@ObfuscatedName("client.Dg")
	public int field319;

	@ObfuscatedName("client.Gg")
	public int field321;

	@ObfuscatedName("client.Hg")
	public int field322;

	@ObfuscatedName("client.Ig")
	public int field323;

	@ObfuscatedName("client.Kg")
	public int field325;

	@ObfuscatedName("client.Lg")
	public int field326;

	@ObfuscatedName("client.Mg")
	public int field327;

	@ObfuscatedName("client.Pg")
	public int field330;

	@ObfuscatedName("client.Rg")
	public int field332;

	@ObfuscatedName("client.Sg")
	public int field333;

	@ObfuscatedName("client.Tg")
	public int field334;

	@ObfuscatedName("client.Xg")
	public static int field338;

	@ObfuscatedName("client.Yg")
	public int field339;

	@ObfuscatedName("client.eh")
	public int field345;

	@ObfuscatedName("client.hh")
	public int field348;

	@ObfuscatedName("client.ih")
	public int field349;

	@ObfuscatedName("client.jh")
	public int field350;

	@ObfuscatedName("client.ph")
	public int field356;

	@ObfuscatedName("client.vh")
	public int field362;

	@ObfuscatedName("client.xh")
	public int field364;

	@ObfuscatedName("client.Bh")
	public int field367;

	@ObfuscatedName("client.Dh")
	public int field368;

	@ObfuscatedName("client.Ih")
	public static int field372;

	@ObfuscatedName("client.Kh")
	public int field374;

	@ObfuscatedName("client.Lh")
	public int field375;

	@ObfuscatedName("client.Mh")
	public int field376;

	@ObfuscatedName("client.Nh")
	public int field377;

	@ObfuscatedName("client.Oh")
	public int field378;

	@ObfuscatedName("client.Ph")
	public int field379;

	@ObfuscatedName("client.Sh")
	public static int field382;

	@ObfuscatedName("client.Th")
	public int field383;

	@ObfuscatedName("client.Vh")
	public int field385;

	@ObfuscatedName("client.Xh")
	public int field387;

	@ObfuscatedName("client.Zh")
	public int field389;

	@ObfuscatedName("client.ai")
	public int field390;

	@ObfuscatedName("client.bi")
	public int field391;

	@ObfuscatedName("client.gi")
	public int field394;

	@ObfuscatedName("client.ii")
	public int field396;

	@ObfuscatedName("client.ki")
	public static int field397;

	@ObfuscatedName("client.oi")
	public int field401;

	@ObfuscatedName("client.qi")
	public int field403;

	@ObfuscatedName("client.vi")
	public static int field407;

	@ObfuscatedName("client.yi")
	public int field409;

	@ObfuscatedName("client.zi")
	public int field410;

	@ObfuscatedName("client.Ai")
	public int field411;

	@ObfuscatedName("client.Bi")
	public int field412;

	@ObfuscatedName("client.Ci")
	public int field413;

	@ObfuscatedName("client.Ji")
	public static int field420;

	@ObfuscatedName("client.Ni")
	public int field423;

	@ObfuscatedName("client.Pi")
	public int field425;

	@ObfuscatedName("client.Qi")
	public int field426;

	@ObfuscatedName("client.Vi")
	public int field431;

	@ObfuscatedName("client.Wi")
	public int field432;

	@ObfuscatedName("client.Xi")
	public int field433;

	@ObfuscatedName("client.Zi")
	public int field434;

	@ObfuscatedName("client.ij")
	public int field441;

	@ObfuscatedName("client.nj")
	public int field445;

	@ObfuscatedName("client.oj")
	public int field446;

	@ObfuscatedName("client.pj")
	public int field447;

	@ObfuscatedName("client.qj")
	public int field448;

	@ObfuscatedName("client.yj")
	public int field456;

	@ObfuscatedName("client.Bj")
	public int field458;

	@ObfuscatedName("client.Ej")
	public int field461;

	@ObfuscatedName("client.Gj")
	public static int field463;

	@ObfuscatedName("client.Kj")
	public int field467;

	@ObfuscatedName("client.Nj")
	public int field468;

	@ObfuscatedName("client.Oj")
	public int field469;

	@ObfuscatedName("client.Pj")
	public int field470;

	@ObfuscatedName("client.N")
	public int field53;

	@ObfuscatedName("client.O")
	public int field54;

	@ObfuscatedName("client.gb")
	public int field70;

	@ObfuscatedName("client.ub")
	public static int field81;

	@ObfuscatedName("client.zb")
	public int field85;

	@ObfuscatedName("client.Ab")
	public int field86;

	@ObfuscatedName("client.Bb")
	public int field87;

	@ObfuscatedName("client.Cb")
	public int field88;

	@ObfuscatedName("client.Db")
	public int field89;

	@ObfuscatedName("client.Eb")
	public int field90;

	@ObfuscatedName("client.Fb")
	public int field91;

	@ObfuscatedName("client.Nb")
	public int field97;

	@ObfuscatedName("client.Ob")
	public int field98;

	@ObfuscatedName("client.Pb")
	public int field99;

	@ObfuscatedName("client.ff")
	public long field250;

	@ObfuscatedName("client.Eh")
	public long field369;

	@ObfuscatedName("client.Hh")
	public long field371;

	@ObfuscatedName("client.ui")
	public long field406;

	@ObfuscatedName("client.bk")
	public long field480;

	@ObfuscatedName("client.Di")
	public DTIATKJO field414;

	@ObfuscatedName("client.Z")
	public static EJJAKGTE field65;

	@ObfuscatedName("client.Pc")
	public KZTQXFDC field145;

	@ObfuscatedName("client.Qc")
	public KZTQXFDC field146;

	@ObfuscatedName("client.Yd")
	public KZTQXFDC field196;

	@ObfuscatedName("client.Zd")
	public KZTQXFDC field197;

	@ObfuscatedName("client.ae")
	public KZTQXFDC field198;

	@ObfuscatedName("client.be")
	public KZTQXFDC field199;

	@ObfuscatedName("client.ce")
	public KZTQXFDC field200;

	@ObfuscatedName("client.qg")
	public KZTQXFDC field308;

	@ObfuscatedName("client.rg")
	public KZTQXFDC field309;

	@ObfuscatedName("client.bj")
	public KZTQXFDC field435;

	@ObfuscatedName("client.cj")
	public KZTQXFDC field436;

	@ObfuscatedName("client.dj")
	public KZTQXFDC field437;

	@ObfuscatedName("client.ej")
	public KZTQXFDC field438;

	@ObfuscatedName("client.fj")
	public KZTQXFDC field439;

	@ObfuscatedName("client.Sj")
	public KZTQXFDC field472;

	@ObfuscatedName("client.Tj")
	public KZTQXFDC field473;

	@ObfuscatedName("client.Uj")
	public KZTQXFDC field474;

	@ObfuscatedName("client.nb")
	public KZTQXFDC field75;

	@ObfuscatedName("client.ob")
	public KZTQXFDC field76;

	@ObfuscatedName("client.pb")
	public KZTQXFDC field77;

	@ObfuscatedName("client.je")
	public LXDDKEZF field207;

	@ObfuscatedName("client.pc")
	public NUXITFPR field123;

	@ObfuscatedName("client.re")
	public NUXITFPR field213;

	@ObfuscatedName("client.se")
	public NUXITFPR field214;

	@ObfuscatedName("client.wg")
	public NUXITFPR field312;

	@ObfuscatedName("client.mh")
	public NUXITFPR field353;

	@ObfuscatedName("client.nh")
	public NUXITFPR field354;

	@ObfuscatedName("client.Ri")
	public NUXITFPR field427;

	@ObfuscatedName("client.tj")
	public NUXITFPR field451;

	@ObfuscatedName("client.uj")
	public NUXITFPR field452;

	@ObfuscatedName("client.vj")
	public NUXITFPR field453;

	@ObfuscatedName("client.wj")
	public NUXITFPR field454;

	@ObfuscatedName("client.xj")
	public NUXITFPR field455;

	@ObfuscatedName("client.Wj")
	public NUXITFPR field475;

	@ObfuscatedName("client.Lb")
	public NUXITFPR field95;

	@ObfuscatedName("client.Mb")
	public NUXITFPR field96;

	@ObfuscatedName("client.Ei")
	public THSQSAVT field415;

	@ObfuscatedName("client.Fi")
	public THSQSAVT field416;

	@ObfuscatedName("client.Gi")
	public THSQSAVT field417;

	@ObfuscatedName("client.Hi")
	public THSQSAVT field418;

	@ObfuscatedName("client.Sc")
	public TZRNBMTC field147;

	@ObfuscatedName("client.Tc")
	public TZRNBMTC field148;

	@ObfuscatedName("client.Uc")
	public TZRNBMTC field149;

	@ObfuscatedName("client.Vc")
	public TZRNBMTC field150;

	@ObfuscatedName("client.vf")
	public TZRNBMTC field265;

	@ObfuscatedName("client.wf")
	public TZRNBMTC field266;

	@ObfuscatedName("client.xf")
	public TZRNBMTC field267;

	@ObfuscatedName("client.yf")
	public TZRNBMTC field268;

	@ObfuscatedName("client.zf")
	public TZRNBMTC field269;

	@ObfuscatedName("client.Af")
	public TZRNBMTC field270;

	@ObfuscatedName("client.Bf")
	public TZRNBMTC field271;

	@ObfuscatedName("client.Cf")
	public TZRNBMTC field272;

	@ObfuscatedName("client.Df")
	public TZRNBMTC field273;

	@ObfuscatedName("client.ck")
	public TZRNBMTC field481;

	@ObfuscatedName("client.dk")
	public TZRNBMTC field482;

	@ObfuscatedName("client.ek")
	public TZRNBMTC field483;

	@ObfuscatedName("client.fk")
	public TZRNBMTC field484;

	@ObfuscatedName("client.gk")
	public TZRNBMTC field485;

	@ObfuscatedName("client.hk")
	public TZRNBMTC field486;

	@ObfuscatedName("client.ik")
	public TZRNBMTC field487;

	@ObfuscatedName("client.jk")
	public TZRNBMTC field488;

	@ObfuscatedName("client.kk")
	public TZRNBMTC field489;

	@ObfuscatedName("client.ab")
	public TZRNBMTC field66;

	@ObfuscatedName("client.bb")
	public TZRNBMTC field67;

	@ObfuscatedName("client.cb")
	public TZRNBMTC field68;

	@ObfuscatedName("client.sb")
	public WBHAMUQI field79;

	@ObfuscatedName("client.jb")
	public XZFDFADG field73;

	@ObfuscatedName("client.gc")
	public YQNDWKQR field115;

	@ObfuscatedName("client.Zf")
	public ZEOHBQWT field294;

	@ObfuscatedName("client.hc")
	public String field116;

	@ObfuscatedName("client.Ug")
	public String field335;

	@ObfuscatedName("client.rj")
	public String field449;

	@ObfuscatedName("client.V")
	public String field61;

	@ObfuscatedName("client.Xc")
	public Socket field151;

	@ObfuscatedName("client.Ue")
	public static boolean field240;

	@ObfuscatedName("client.zh")
	public static boolean field366;

	@ObfuscatedName("client.Mi")
	public static boolean field422;

	@ObfuscatedName("client.hj")
	public static boolean field440;

	@ObfuscatedName("client.Nd")
	public int[] field186;

	@ObfuscatedName("client.Od")
	public int[] field187;

	@ObfuscatedName("client.Ve")
	public int[] field241;

	@ObfuscatedName("client.We")
	public int[] field242;

	@ObfuscatedName("client.Xe")
	public int[] field243;

	@ObfuscatedName("client.Ye")
	public int[] field244;

	@ObfuscatedName("client.kf")
	public int[] field254;

	@ObfuscatedName("client.lf")
	public int[] field255;

	@ObfuscatedName("client.mf")
	public int[] field256;

	@ObfuscatedName("client.Vg")
	public int[] field336;

	@ObfuscatedName("client.Wg")
	public int[] field337;

	@ObfuscatedName("client.P")
	public int[] field55;

	@ObfuscatedName("client.Q")
	public int[] field56;

	@ObfuscatedName("client.R")
	public int[] field57;

	@ObfuscatedName("client.S")
	public int[] field58;

	@ObfuscatedName("client.Hj")
	public KZTQXFDC[] field464;

	@ObfuscatedName("client.Le")
	public byte[][] field232;

	@ObfuscatedName("client.M")
	public byte[][] field52;

	@ObfuscatedName("client.ci")
	public byte[][][] field392;

	@ObfuscatedName("client.Y")
	public int[][][] field64;

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field238 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method20() {
		if (field265 == null) {
			field10 = null;
			field150 = null;
			field148 = null;
			field147 = null;
			field149 = null;
			field66 = null;
			field67 = null;
			field68 = null;
			field268 = new TZRNBMTC(128, method11(), 265);
			JNJDBENA.method286();
			field269 = new TZRNBMTC(128, method11(), 265);
			JNJDBENA.method286();
			field265 = new TZRNBMTC(509, method11(), 171);
			JNJDBENA.method286();
			field266 = new TZRNBMTC(360, method11(), 132);
			JNJDBENA.method286();
			field267 = new TZRNBMTC(360, method11(), 200);
			JNJDBENA.method286();
			field270 = new TZRNBMTC(202, method11(), 238);
			JNJDBENA.method286();
			field271 = new TZRNBMTC(203, method11(), 238);
			JNJDBENA.method286();
			field272 = new TZRNBMTC(74, method11(), 94);
			JNJDBENA.method286();
			field273 = new TZRNBMTC(75, method11(), 94);
			JNJDBENA.method286();

			if (field414 != null) {
				method82();
				method25();
			}

			field276 = true;
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method21() {
		if (field240 && field124 == 2 && PMCVBMMY.field1120 != field91) {
			method77("Loading - please wait.", null);
			field124 = 1;
			field369 = System.currentTimeMillis();
		}

		if (field124 == 1) {
			int var1 = method22();
			if (var1 != 0 && System.currentTimeMillis() - field369 > 360000L) {
				signlink.reporterror(field92 + " glcfb " + field250 + "," + var1 + "," + field240 + "," + field428[0] + "," + field73.method568() + "," + field91 + "," + field154 + "," + field155);
				field369 = System.currentTimeMillis();
			}
		}

		if (field124 == 2 && field91 != field359) {
			field359 = field91;
			method72(field91);
		}
	}

	@ObfuscatedName("client.b(Z)I")
	public final int method22() {
		for (int var1 = 0; var1 < field232.length; var1++) {
			if (field232[var1] == null && field255[var1] != -1) {
				return -1;
			}

			if (field52[var1] == null && field256[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field232.length; var3++) {
			byte[] var4 = field52[var3];
			if (var4 != null) {
				int var5 = (field254[var3] >> 8) * 64 - field99;
				int var6 = (field254[var3] & 0xFF) * 64 - field100;
				if (field166) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= PMCVBMMY.method435(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field191) {
			return -4;
		} else {
			field124 = 2;
			PMCVBMMY.field1120 = field91;
			method73();
			field343.method191(211);
			return 0;
		}
	}

	@ObfuscatedName("client.a(LEKHKDMUP;ZI)I")
	public final int method23(EKHKDMUP arg0, int arg1) {
		if (arg0.field610 == null || arg1 >= arg0.field610.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field610[arg1];
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
					var8 = field310[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field233[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field283[var3[var5++]];
				}

				if (var7 == 4) {
					EKHKDMUP var10 = EKHKDMUP.method174(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ZKNJTNWP.field1475 && (!ZKNJTNWP.method590(var11).field1511 || field239)) {
						for (int var12 = 0; var12 < var10.field574.length; var12++) {
							if (var11 + 1 == var10.field574[var12]) {
								var8 += var10.field633[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field477[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field460[field233[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field477[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field65.field568;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < MPJJINEH.field982; var13++) {
						if (MPJJINEH.field984[var13]) {
							var8 += field233[var13];
						}
					}
				}

				if (var7 == 10) {
					EKHKDMUP var14 = EKHKDMUP.method174(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ZKNJTNWP.field1475 && (!ZKNJTNWP.method590(var15).field1511 || field239)) {
						for (int var16 = 0; var16 < var14.field574.length; var16++) {
							if (var14.field574[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field277;
				}

				if (var7 == 12) {
					var8 = field367;
				}

				if (var7 == 13) {
					int var17 = field477[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					OIEBXCSN var20 = OIEBXCSN.field1019[var19];
					int var21 = var20.field1021;
					int var22 = var20.field1022;
					int var23 = var20.field1023;
					int var24 = field158[var23 - var22];
					var8 = field477[var21] >> var22 & var24;
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
					var8 = (field65.field741 >> 7) + field99;
				}

				if (var7 == 19) {
					var8 = (field65.field742 >> 7) + field100;
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

	@ObfuscatedName("client.a(ILEKHKDMUP;)Z")
	public final boolean method24(EKHKDMUP arg0) {
		if (arg0.field626 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field626.length; var2++) {
			int var3 = method23(arg0, var2);
			int var4 = arg0.field591[var2];
			if (arg0.field626[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field626[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field626[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field253 = arg0;
		field116 = arg1;
		method20();

		if (field414 == null) {
			super.method13(arg0, arg1);
		} else {
			field267.method492();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field417.method473(var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			JNJDBENA.method289(var3 / 2 - 152, 304, var6, 0x8C1111, 34);
			JNJDBENA.method289(var3 / 2 - 151, 302, var6 + 1, 0, 32);
			JNJDBENA.method288(var3 / 2 - 150, var6 + 2, arg0 * 3, 0x8C1111, 30);
			JNJDBENA.method288(arg0 * 3 + var3 / 2 - 150, var6 + 2, 300 - arg0 * 3, 0, 30);
			field417.method473(var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF, arg1);
			field267.method493(171, 202, field9);

			if (field276) {
				field276 = false;

				if (!field63) {
					field268.method493(0, 0, field9);
					field269.method493(0, 637, field9);
				}

				field265.method493(0, 128, field9);
				field266.method493(371, 202, field9);
				field270.method493(265, 0, field9);
				field271.method493(265, 562, field9);
				field272.method493(171, 128, field9);
				field273.method493(171, 562, field9);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method25() {
		field145 = new KZTQXFDC(field414, "titlebox", 0);
		field146 = new KZTQXFDC(field414, "titlebutton", 0);
		field464 = new KZTQXFDC[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field464[var1] = new KZTQXFDC(field414, "runes", var1);
		}

		field213 = new NUXITFPR(128, 265);
		field214 = new NUXITFPR(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field213.field995[var2] = field268.field1278[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field214.field995[var3] = field269.field1278[var3];
		}

		field56 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field56[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field56[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field56[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field56[var7 + 192] = 0xFFFFFF;
		}

		field57 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field57[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field57[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field57[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field57[var11 + 192] = 0xFFFFFF;
		}

		field58 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field58[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field58[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field58[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field58[var15 + 192] = 0xFFFFFF;
		}

		field55 = new int[256];
		field186 = new int[32768];
		field187 = new int[32768];
		method103(null);
		field336 = new int[32768];
		field337 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field63) {
			field344 = true;
			field63 = true;
			method12(this, 2);
		}
	}

	public final void init() {
		field237 = Integer.parseInt(getParameter("nodeid"));
		field238 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method71();
		} else {
			method146();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field239 = false;
		} else {
			field239 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method26() {
		if (field183 == 0) {
			int var1 = field23;
			if (field332 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field264) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field375 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field375 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field375 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field376 - 10 || var2 > field378 + field376 + 10 || var3 < field377 - 10 || var3 > field379 + field377 + 10) {
						field264 = false;

						if (field375 == 1) {
							field384 = true;
						}

						if (field375 == 2) {
							field303 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field376;
					int var5 = field377;
					int var6 = field378;
					int var7 = field24;
					int var8 = field25;
					if (field375 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field375 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field375 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field389; var10++) {
						int var11 = (field389 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method140(var9);
					}

					field264 = false;

					if (field375 == 1) {
						field384 = true;
					}

					if (field375 == 2) {
						field303 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field389 > 0) {
					int var12 = field317[field389 - 1];
					if (var12 == 592 || var12 == 637 || var12 == 148 || var12 == 708 || var12 == 306 || var12 == 17 || var12 == 994 || var12 == 840 || var12 == 68 || var12 == 910 || var12 == 874 || var12 == 1893) {
						int var13 = field315[field389 - 1];
						int var14 = field316[field389 - 1];
						EKHKDMUP var15 = EKHKDMUP.method174(var14);
						if (var15.field616 || var15.field640) {
							field324 = false;
							field456 = 0;
							field181 = var14;
							field182 = var13;
							field183 = 2;
							field184 = field24;
							field185 = field25;

							if (EKHKDMUP.method174(var14).field597 == field69) {
								field183 = 1;
							}

							if (EKHKDMUP.method174(var14).field597 == field59) {
								field183 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field230 == 1 || method66(field389 - 1)) && field389 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field389 > 0) {
					method140(field389 - 1);
				}

				if (var1 != 2 || field389 <= 0) {
					return;
				}

				method120();
			}
		}
	}

	@ObfuscatedName("client.a(LGHHPHSRU;II)V")
	public final void method27(GHHPHSRU arg0, int arg1) {
		arg0.method212();
		int var3 = arg0.method213(1);
		if (var3 != 0) {
			int var4 = arg0.method213(2);
			if (var4 == 0) {
				field404[field403++] = field399;
			} else if (var4 == 1) {
				int var5 = arg0.method213(3);
				field65.method241(false, var5);
				int var6 = arg0.method213(1);
				if (var6 == 1) {
					field404[field403++] = field399;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method213(3);
				field65.method241(true, var7);
				int var8 = arg0.method213(3);
				field65.method241(true, var8);
				int var9 = arg0.method213(1);
				if (var9 == 1) {
					field404[field403++] = field399;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method213(1);
				if (var10 == 1) {
					field404[field403++] = field399;
				}

				int var11 = arg0.method213(7);
				int var12 = arg0.method213(7);
				field91 = arg0.method213(2);
				int var13 = arg0.method213(1);
				field65.method242(var12, var11, var13 == 1);
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method28(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.d(I)V")
	public final void method29() {
		int var1 = field409 * 128 + 64;
		int var2 = field410 * 128 + 64;
		int var3 = method34(var2, field91, var1) - field411;

		if (field286 < var1) {
			field286 += (var1 - field286) * field413 / 1000 + field412;
			if (field286 > var1) {
				field286 = var1;
			}
		}

		if (field286 > var1) {
			field286 -= (field286 - var1) * field413 / 1000 + field412;
			if (field286 < var1) {
				field286 = var1;
			}
		}

		if (field287 < var3) {
			field287 += (var3 - field287) * field413 / 1000 + field412;
			if (field287 > var3) {
				field287 = var3;
			}
		}

		if (field287 > var3) {
			field287 -= (field287 - var3) * field413 / 1000 + field412;
			if (field287 < var3) {
				field287 = var3;
			}
		}

		if (field288 < var2) {
			field288 += (var2 - field288) * field413 / 1000 + field412;
			if (field288 > var2) {
				field288 = var2;
			}
		}

		if (field288 > var2) {
			field288 -= (field288 - var2) * field413 / 1000 + field412;
			if (field288 < var2) {
				field288 = var2;
			}
		}

		field274++;
		if (field274 > 1352) {
			field274 = 0;
			field343.method191(91);
			field343.method192(0);
			int var4 = field343.field667;
			field343.method193(49556);
			field343.method192((int) (Math.random() * 256.0D));
			field343.method192((int) (Math.random() * 256.0D));
			field343.method192(217);
			field343.method192((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field343.method192(78);
			}

			field343.method193(22816);
			field343.method193((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field343.method192(35);
			}

			field343.method192((int) (Math.random() * 256.0D));
			field343.method201(field343.field667 - var4);
		}

		int var5 = field259 * 128 + 64;
		int var6 = field260 * 128 + 64;
		int var7 = method34(var6, field91, var5) - field261;
		int var8 = var5 - field286;
		int var9 = var7 - field287;
		int var10 = var6 - field288;
		int var11 = (int) Math.sqrt(var8 * var8 + var10 * var10);
		int var12 = (int) (Math.atan2(var9, var11) * 325.949D) & 0x7FF;
		int var13 = (int) (Math.atan2(var8, var10) * -325.949D) & 0x7FF;

		if (var12 < 128) {
			var12 = 128;
		}

		if (var12 > 383) {
			var12 = 383;
		}

		if (field289 < var12) {
			field289 += (var12 - field289) * field263 / 1000 + field262;
			if (field289 > var12) {
				field289 = var12;
			}
		}

		if (field289 > var12) {
			field289 -= (field289 - var12) * field263 / 1000 + field262;
			if (field289 < var12) {
				field289 = var12;
			}
		}

		int var14 = var13 - field290;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 > 0) {
			field290 += field263 * var14 / 1000 + field262;
			field290 &= 0x7FF;
		}

		if (var14 < 0) {
			field290 -= -var14 * field263 / 1000 + field262;
			field290 &= 0x7FF;
		}

		int var15 = var13 - field290;
		if (var15 > 1024) {
			var15 -= 2048;
		}

		if (var15 < -1024) {
			var15 += 2048;
		}

		if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
			field290 = var13;
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method30() {
		MKWUPJYP.field954.method509();
		MKWUPJYP.field945.method509();
		DDJHHGTJ.field506.method509();
		ZKNJTNWP.field1498.method509();
		ZKNJTNWP.field1514.method509();
		EJJAKGTE.field560.method509();
		BYUDODIR.field46.method509();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZLjava/lang/String;I)V")
	public final void method31(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field120 != -1) {
			field61 = arg1;
			field23 = 0;
		}

		if (field59 == -1) {
			field303 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field138[var4] = field138[var4 - 1];
			field139[var4] = field139[var4 - 1];
			field140[var4] = field140[var4 - 1];
		}

		field138[0] = arg2;
		field139[0] = arg0;
		field140[0] = arg1;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method32() {
		for (int var1 = -1; var1 < field401; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field399;
			} else {
				var2 = field402[var1];
			}

			EJJAKGTE var3 = field400[var2];
			if (var3 != null && var3.field728 > 0) {
				var3.field728--;
				if (var3.field728 == 0) {
					var3.field734 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field362; var4++) {
			int var5 = field363[var4];
			LJAXEEYT var6 = field361[var5];
			if (var6 != null && var6.field728 > 0) {
				var6.field728--;
				if (var6.field728 == 0) {
					var6.field734 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILGHHPHSRU;B)V")
	public final void method33(int arg0, GHHPHSRU arg1) {
		for (int var3 = 0; var3 < field403; var3++) {
			int var4 = field404[var3];
			LJAXEEYT var5 = field361[var4];
			int var6 = arg1.method202();
			if ((var6 & 0x20) != 0) {
				int var7 = arg1.method202();
				int var8 = arg1.method202();
				var5.method243(var8, var7, field372);
				var5.field773 = field372 + 300;
				var5.field774 = arg1.method223();
				var5.field775 = arg1.method221();
			}

			if ((var6 & 0x1) != 0) {
				int var9 = arg1.method204();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg1.method222();
				if (var5.field736 == var9 && var9 != -1) {
					int var11 = VYCKCNXO.field1339[var9].field1353;
					if (var11 == 1) {
						var5.field737 = 0;
						var5.field738 = 0;
						var5.field739 = var10;
						var5.field740 = 0;
					}

					if (var11 == 2) {
						var5.field740 = 0;
					}
				} else if (var9 == -1 || var5.field736 == -1 || VYCKCNXO.field1339[var9].field1347 >= VYCKCNXO.field1339[var5.field736].field1347) {
					var5.field736 = var9;
					var5.field737 = 0;
					var5.field738 = 0;
					var5.field739 = var10;
					var5.field740 = 0;
					var5.field763 = var5.field762;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field856 = DDJHHGTJ.method162(arg1.method230());
				var5.field753 = var5.field856.field503;
				var5.field764 = var5.field856.field504;
				var5.field776 = var5.field856.field511;
				var5.field777 = var5.field856.field525;
				var5.field778 = var5.field856.field516;
				var5.field779 = var5.field856.field513;
				var5.field765 = var5.field856.field531;
			}

			if ((var6 & 0x4) != 0) {
				var5.field734 = arg1.method209();
				var5.field728 = 100;
			}

			if ((var6 & 0x80) != 0) {
				int var12 = arg1.method222();
				int var13 = arg1.method221();
				var5.method243(var13, var12, field372);
				var5.field773 = field372 + 300;
				var5.field774 = arg1.method221();
				var5.field775 = arg1.method222();
			}

			if ((var6 & 0x2) != 0) {
				var5.field771 = arg1.method231();
				var5.field772 = arg1.method231();
			}

			if ((var6 & 0x40) != 0) {
				var5.field756 = arg1.method231();
				int var14 = arg1.method236();
				var5.field760 = var14 >> 16;
				var5.field759 = (var14 & 0xFFFF) + field372;
				var5.field757 = 0;
				var5.field758 = 0;

				if (var5.field759 > field372) {
					var5.field757 = -1;
				}

				if (var5.field756 == 0xFFFF) {
					var5.field756 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field770 = arg1.method204();
				if (var5.field770 == 0xFFFF) {
					var5.field770 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method34(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field392[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field64[var6][var4][var5] + field64[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field64[var6][var4][var5 + 1] + field64[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method35() {
		if (field205 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field431 + field143 & 0x7FF;
				int var4 = QAMTFDSD.field1150[var3];
				int var5 = QAMTFDSD.field1151[var3];
				var4 = (field170 + 256) * var4 >> 8;
				var5 = (field170 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field65.field741 + var6 >> 7;
				int var9 = field65.field742 - var7 >> 7;
				boolean var10 = method64(var9, 0, var8, 0, 0, 0, 1, true, field65.field732[0], 0, field65.field733[0]);
				if (var10) {
					field343.method192(var1);
					field343.method192(var2);
					field343.method193(field431);
					field343.method192(57);
					field343.method192(field143);
					field343.method192(field170);
					field343.method192(89);
					field343.method193(field65.field741);
					field343.method193(field65.field742);
					field343.method192(field164);
					field343.method192(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method36(byte[] arg0, boolean arg1) {
		if (field208) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(ZILNUXITFPR;I)V")
	public final void method37(int arg0, NUXITFPR arg1, int arg2) {
		int var4 = field431 + field143 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = OQIGXOFQ.field1097[var4];
			int var7 = OQIGXOFQ.field1098[var4];
			var6 = var6 * 256 / (field170 + 256);
			var7 = var7 * 256 / (field170 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method382(var8 + 94 + 4 - arg1.field1000 / 2, field76, 83 - var9 - arg1.field1001 / 2 - 4);
			} else {
				arg1.method376(83 - var9 - arg1.field1001 / 2 - 4, var8 + 94 - arg1.field1000 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method38() {
		field147.method492();
		QAMTFDSD.field1152 = field242;
		field75.method300(0, 0);

		if (field167 != -1) {
			method122(0, 0, EKHKDMUP.method174(field167), 0);
		} else if (field479[field457] != -1) {
			method122(0, 0, EKHKDMUP.method174(field479[field457]), 0);
		}

		if (field264 && field375 == 1) {
			method90();
		}

		field147.method493(205, 553, field9);
		field149.method492();
		QAMTFDSD.field1152 = field243;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method39(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.h(B)V")
	public final void method40() {
		field331 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field63) {
				field201++;
				method115();
				method115();
				method111();
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

		field331 = false;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method41() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(BILNUXITFPR;I)V")
	public final void method42(int arg0, NUXITFPR arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field431 + field143 & 0x7FF;
			int var6 = OQIGXOFQ.field1097[var5];
			int var7 = OQIGXOFQ.field1098[var5];
			var6 = var6 * 256 / (field170 + 256);
			var7 = var7 * 256 / (field170 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field123.method381(15, 83 - var13 - 20, var10, 20, 256, 20, 15, var12 + 94 + 4 - 10);
		} else {
			method37(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method43(int arg0) {
		if (!field240) {
			for (int var2 = 0; var2 < field296.length; var2++) {
				int var3 = field296[var2];
				if (QAMTFDSD.field1160[var3] >= arg0) {
					KZTQXFDC var4 = QAMTFDSD.field1154[var3];
					int var5 = var4.field851 * var4.field850 - 1;
					int var6 = field305 * var4.field850 * 2;
					byte[] var7 = var4.field848;
					byte[] var8 = field122;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field848 = var8;
					field122 = var7;
					QAMTFDSD.method454(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method44() {
		if (field124 == 2) {
			for (FNOFBEYP var1 = (FNOFBEYP) field221.method519(); var1 != null; var1 = (FNOFBEYP) field221.method521()) {
				if (var1.field657 > 0) {
					var1.field657--;
				}

				if (var1.field657 != 0) {
					if (var1.field661 > 0) {
						var1.field661--;
					}

					if (var1.field661 == 0 && var1.field664 >= 1 && var1.field665 >= 1 && var1.field664 <= 102 && var1.field665 <= 102 && (var1.field658 < 0 || PMCVBMMY.method426(var1.field660, var1.field658))) {
						method88(var1.field663, var1.field658, var1.field660, var1.field662, var1.field665, var1.field664, var1.field659);
						var1.field661 = -1;

						if (var1.field658 == var1.field654 && var1.field654 == -1) {
							var1.method19();
						} else if (var1.field658 == var1.field654 && var1.field659 == var1.field655 && var1.field660 == var1.field656) {
							var1.method19();
						}
					}
				} else if (var1.field654 < 0 || PMCVBMMY.method426(var1.field656, var1.field654)) {
					method88(var1.field663, var1.field654, var1.field656, var1.field662, var1.field665, var1.field664, var1.field655);
					var1.method19();
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method45() {
		field159 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field342[var1] = -1;
			for (int var2 = 0; var2 < FGIDBWCJ.field646; var2++) {
				if (!FGIDBWCJ.field647[var2].field653 && FGIDBWCJ.field647[var2].field648 == var1 + (field357 ? 0 : 7)) {
					field342[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method46() {
		int var1 = 3;
		if (field289 < 310) {
			int var2 = field286 >> 7;
			int var3 = field288 >> 7;
			int var4 = field65.field741 >> 7;
			int var5 = field65.field742 >> 7;

			if ((field392[field91][var2][var3] & 0x4) != 0) {
				var1 = field91;
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

					if ((field392[field91][var2][var3] & 0x4) != 0) {
						var1 = field91;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field392[field91][var2][var3] & 0x4) != 0) {
							var1 = field91;
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

					if ((field392[field91][var2][var3] & 0x4) != 0) {
						var1 = field91;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field392[field91][var2][var3] & 0x4) != 0) {
							var1 = field91;
						}
					}
				}
			}
		}

		if ((field392[field91][field65.field741 >> 7][field65.field742 >> 7] & 0x4) != 0) {
			var1 = field91;
		}

		return var1;
	}

	@ObfuscatedName("client.j(I)I")
	public final int method47() {
		int var1 = method34(field288, field91, field286);
		if (var1 - field287 < 800 && (field392[field91][field286 >> 7][field288 >> 7] & 0x4) != 0) {
			return field91;
		}

		return 3;
	}

	@ObfuscatedName("client.k(I)Ljava/lang/String;")
	public final String method48() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IILGHHPHSRU;)V")
	public final void method49(int arg0, GHHPHSRU arg1) {
		field423 = 0;
		field403 = 0;
		method97(arg0, arg1);
		method153(arg0, arg1);
		method33(arg0, arg1);

		for (int var3 = 0; var3 < field423; var3++) {
			int var4 = field424[var3];
			if (field372 != field361[var4].field752) {
				field361[var4].field856 = null;
				field361[var4] = null;
			}
		}

		if (arg1.field667 != arg0) {
			signlink.reporterror(field92 + " size mismatch in getnpcpos - pos:" + arg1.field667 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field362; var5++) {
			if (field361[field363[var5]] == null) {
				signlink.reporterror(field92 + " null entry in npc list - pos:" + var5 + " size:" + field362);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZIIIII)V")
	public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = OQIGXOFQ.field1097[var7];
			int var13 = OQIGXOFQ.field1098[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = OQIGXOFQ.field1097[var8];
			int var16 = OQIGXOFQ.field1098[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field286 = arg5 - var9;
		field287 = arg1 - var10;
		field288 = arg2 - var11;
		field289 = arg4;
		field290 = arg0;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method51() {
		for (RFQAJLME var1 = (RFQAJLME) field329.method519(); var1 != null; var1 = (RFQAJLME) field329.method521()) {
			if (field91 != var1.field1195 || var1.field1200) {
				var1.method19();
			} else if (field372 >= var1.field1199) {
				var1.method469(field305);

				if (var1.field1200) {
					var1.method19();
				} else {
					field207.method320(var1, var1.field1196, var1.field1197, -1, var1.field1198, false, 60, 0, var1.field1195);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method52(long arg0) {
		if (arg0 != 0L) {
			if (field188 >= 100) {
				method31("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = VSUIHULP.method514(VSUIHULP.method511(arg0));
				for (int var4 = 0; var4 < field188; var4++) {
					if (field429[var4] == arg0) {
						method31("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field228; var5++) {
					if (field209[var5] == arg0) {
						method31("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field429[field188++] = arg0;
				field384 = true;
				field343.method191(122);
				field343.method198(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field115 != null) {
				field115.method583();
			}
		} catch (Exception var1) {
		}

		field115 = null;
		method41();

		if (field294 != null) {
			field294.field1461 = false;
		}

		field294 = null;
		field73.method572();
		field73 = null;
		field360 = null;
		field343 = null;
		field450 = null;
		field224 = null;
		field254 = null;
		field232 = null;
		field52 = null;
		field255 = null;
		field256 = null;
		field64 = null;
		field392 = null;
		field207 = null;
		field225 = null;
		field442 = null;
		field71 = null;
		field118 = null;
		field119 = null;
		field122 = null;
		field147 = null;
		field148 = null;
		field149 = null;
		field150 = null;
		field66 = null;
		field67 = null;
		field68 = null;
		field481 = null;
		field482 = null;
		field483 = null;
		field484 = null;
		field485 = null;
		field486 = null;
		field487 = null;
		field488 = null;
		field489 = null;
		field75 = null;
		field76 = null;
		field77 = null;
		field472 = null;
		field473 = null;
		field474 = null;
		field408 = null;
		field196 = null;
		field197 = null;
		field198 = null;
		field199 = null;
		field200 = null;
		field435 = null;
		field436 = null;
		field437 = null;
		field438 = null;
		field439 = null;
		field312 = null;
		field306 = null;
		field136 = null;
		field471 = null;
		field94 = null;
		field156 = null;
		field475 = null;
		field451 = null;
		field452 = null;
		field453 = null;
		field454 = null;
		field455 = null;
		field465 = null;
		field60 = null;
		field134 = null;
		field400 = null;
		field402 = null;
		field404 = null;
		field405 = null;
		field424 = null;
		field361 = null;
		field363 = null;
		field141 = null;
		field221 = null;
		field347 = null;
		field329 = null;
		field315 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field227 = null;
		field477 = null;
		field279 = null;
		field280 = null;
		field222 = null;
		field427 = null;
		field179 = null;
		field209 = null;
		field180 = null;
		field268 = null;
		field269 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field270 = null;
		field271 = null;
		field272 = null;
		field273 = null;
		method86();
		MKWUPJYP.method368();
		DDJHHGTJ.method160();
		ZKNJTNWP.method591();
		EKHKDMUP.method177();
		PQRCEBTR.field1129 = null;
		FGIDBWCJ.field647 = null;
		MSISJZUY.field985 = null;
		VYCKCNXO.field1339 = null;
		BYUDODIR.field34 = null;
		BYUDODIR.field46 = null;
		QORKDXHW.field1177 = null;
		field10 = null;
		EJJAKGTE.field560 = null;
		QAMTFDSD.method447();
		LXDDKEZF.method308();
		OQIGXOFQ.method387();
		XZZTWOGF.method580();
		System.gc();
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

	@ObfuscatedName("client.f(Z)V")
	public final void method53() {
		field105 = 0;
		for (int var1 = -1; var1 < field401 + field362; var1++) {
			GSULPWKR var2;
			if (var1 == -1) {
				var2 = field65;
			} else if (var1 < field401) {
				var2 = field400[field402[var1]];
			} else {
				var2 = field361[field363[var1 - field401]];
			}

			if (var2 != null && var2.method169()) {
				if (var2 instanceof LJAXEEYT) {
					DDJHHGTJ var3 = ((LJAXEEYT) var2).field856;
					if (var3.field518 != null) {
						var3 = var3.method164();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field401) {
					DDJHHGTJ var6 = ((LJAXEEYT) var2).field856;
					if (var6.field502 >= 0 && var6.field502 < field471.length) {
						method131(var2.field754 + 15, var2);

						if (field301 > -1) {
							field471[var6.field502].method376(field302 - 30, field301 - 12);
						}
					}

					if (field168 == 1 && field363[var1 - field401] == field391 && field372 % 20 < 10) {
						method131(var2.field754 + 15, var2);

						if (field301 > -1) {
							field94[0].method376(field302 - 28, field301 - 12);
						}
					}
				} else {
					int var4 = 30;
					EJJAKGTE var5 = (EJJAKGTE) var2;
					if (var5.field565 != -1 || var5.field551 != -1) {
						method131(var2.field754 + 15, var2);

						if (field301 > -1) {
							if (var5.field565 != -1) {
								field136[var5.field565].method376(field302 - var4, field301 - 12);
								var4 += 25;
							}

							if (var5.field551 != -1) {
								field471[var5.field551].method376(field302 - var4, field301 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field168 == 10 && field402[var1] == field458) {
						method131(var2.field754 + 15, var2);

						if (field301 > -1) {
							field94[1].method376(field302 - var4, field301 - 12);
						}
					}
				}

				if (var2.field734 != null && (var1 >= field401 || field394 == 0 || field394 == 3 || field394 == 1 && method83(((EJJAKGTE) var2).field552))) {
					method131(var2.field754, var2);

					if (field301 > -1 && field105 < field106) {
						field110[field105] = field417.method476(var2.field734) / 2;
						field109[field105] = field417.field1261;
						field107[field105] = field301;
						field108[field105] = field302;
						field111[field105] = var2.field761;
						field112[field105] = var2.field780;
						field113[field105] = var2.field728;
						field114[field105++] = var2.field734;

						if (field157 == 0 && var2.field780 >= 1 && var2.field780 <= 3) {
							field109[field105] += 10;
							field108[field105] += 5;
						}

						if (field157 == 0 && var2.field780 == 4) {
							field110[field105] = 60;
						}

						if (field157 == 0 && var2.field780 == 5) {
							field109[field105] += 5;
						}
					}
				}

				if (var2.field773 > field372) {
					method131(var2.field754 + 15, var2);

					if (field301 > -1) {
						int var7 = var2.field774 * 30 / var2.field775;
						if (var7 > 30) {
							var7 = 30;
						}

						JNJDBENA.method288(field301 - 15, field302 - 3, var7, 0xFF00, 5);
						JNJDBENA.method288(field301 + var7 - 15, field302 - 3, 30 - var7, 0xFF0000, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field769[var8] > field372) {
						method131(var2.field754 / 2, var2);

						if (field301 > -1) {
							if (var8 == 1) {
								field302 -= 20;
							}

							if (var8 == 2) {
								field301 -= 15;
								field302 -= 10;
							}

							if (var8 == 3) {
								field301 += 15;
								field302 -= 10;
							}

							field306[var2.field768[var8]].method376(field302 - 12, field301 - 12);
							field415.method473(field302 + 4, field301, 0, String.valueOf(var2.field767[var8]));
							field415.method473(field302 + 3, field301 - 1, 0xFFFFFF, String.valueOf(var2.field767[var8]));
						}
					}
				}
			}
		}

		field133++;
		if (field133 > 1950) {
			field133 = 0;
			field343.method191(218);
			field343.method192(0);
			int var9 = field343.field667;
			field343.method193(40201);

			if ((int) (Math.random() * 2.0D) == 0) {
				field343.method192(138);
			}

			field343.method192((int) (Math.random() * 256.0D));
			field343.method192(149);
			field343.method193(26766);
			field343.method192((int) (Math.random() * 256.0D));
			field343.method193(33876);

			if ((int) (Math.random() * 2.0D) == 0) {
				field343.method192(53);
			}

			field343.method192((int) (Math.random() * 256.0D));
			field343.method193(20471);
			field343.method201(field343.field667 - var9);
		}

		for (int var10 = 0; var10 < field105; var10++) {
			int var11 = field107[var10];
			int var12 = field108[var10];
			int var13 = field110[var10];
			int var14 = field109[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field108[var16] - field109[var16] && var12 - var14 < field108[var16] + 2 && var11 - var13 < field110[var16] + field107[var16] && var11 + var13 > field107[var16] - field110[var16] && field108[var16] - field109[var16] < var12) {
						var12 = field108[var16] - field109[var16];
						var15 = true;
					}
				}
			}

			field301 = field107[var10];
			field302 = field108[var10] = var12;
			String var17 = field114[var10];
			if (field157 == 0) {
				int var18 = 0xFFFF00;
				if (field111[var10] < 6) {
					var18 = field142[field111[var10]];
				}

				if (field111[var10] == 6) {
					var18 = field70 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field111[var10] == 7) {
					var18 = field70 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field111[var10] == 8) {
					var18 = field70 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field111[var10] == 9) {
					int var19 = 150 - field113[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field111[var10] == 10) {
					int var20 = 150 - field113[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field111[var10] == 11) {
					int var21 = 150 - field113[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field112[var10] == 0) {
					field417.method473(field302 + 1, field301, 0, var17);
					field417.method473(field302, field301, var18, var17);
				}

				if (field112[var10] == 1) {
					field417.method478(field70, field302 + 1, field301, var17, 0);
					field417.method478(field70, field302, field301, var17, var18);
				}

				if (field112[var10] == 2) {
					field417.method479(field70, field301, field302 + 1, var17, 0);
					field417.method479(field70, field301, field302, var17, var18);
				}

				if (field112[var10] == 3) {
					field417.method480(field302 + 1, field301, 150 - field113[var10], field70, var17, 0);
					field417.method480(field302, field301, 150 - field113[var10], field70, var17, var18);
				}

				if (field112[var10] == 4) {
					int var22 = field417.method476(var17);
					int var23 = (150 - field113[var10]) * (var22 + 100) / 150;
					JNJDBENA.method285(field301 - 50, 0, 334, field301 + 50);
					field417.method477(0, var17, field302 + 1, field301 + 50 - var23);
					field417.method477(var18, var17, field302, field301 + 50 - var23);
					JNJDBENA.method284();
				}

				if (field112[var10] == 5) {
					int var24 = 150 - field113[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					JNJDBENA.method285(0, field302 - field417.field1261 - 1, field302 + 5, 512);
					field417.method473(field302 + var25 + 1, field301, 0, var17);
					field417.method473(field302 + var25, field301, var18, var17);
					JNJDBENA.method284();
				}
			} else {
				field417.method473(field302 + 1, field301, 0, var17);
				field417.method473(field302, field301, 0xFFFF00, var17);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method54() {
		if (field152 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field152 = 3;
				field282 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field292 = "";
				field293 = "Enter your username & password.";
				field152 = 2;
				field282 = 0;
			}
		} else if (field152 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field282 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field282 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field85 = 0;
				method152(field92, field93, false);

				if (field206) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field152 = 0;
				field92 = "";
				field93 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field62.length(); var10++) {
					if (var8 == field62.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field282 == 0) {
					if (var8 == 8 && field92.length() > 0) {
						field92 = field92.substring(0, field92.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field282 = 1;
					}

					if (var9) {
						field92 = field92 + (char) var8;
					}

					if (field92.length() > 12) {
						field92 = field92.substring(0, 12);
					}
				} else if (field282 == 1) {
					if (var8 == 8 && field93.length() > 0) {
						field93 = field93.substring(0, field93.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field282 = 0;
					}

					if (var9) {
						field93 = field93 + (char) var8;
					}

					if (field93.length() > 20) {
						field93 = field93.substring(0, 20);
					}
				}
			}
		} else if (field152 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field152 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method55() {
		if (field150 == null) {
			method86();
			field10 = null;
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field272 = null;
			field273 = null;
			field150 = new TZRNBMTC(479, method11(), 96);
			field148 = new TZRNBMTC(172, method11(), 156);
			JNJDBENA.method286();
			field76.method300(0, 0);
			field147 = new TZRNBMTC(190, method11(), 261);
			field149 = new TZRNBMTC(512, method11(), 334);
			JNJDBENA.method286();
			field66 = new TZRNBMTC(496, method11(), 50);
			field67 = new TZRNBMTC(269, method11(), 37);
			field68 = new TZRNBMTC(249, method11(), 45);
			field276 = true;
			field149.method492();
			QAMTFDSD.field1152 = field243;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field366) {
			field320 = true;
		} else {
			field366 = true;
			boolean var1 = false;
			String var2 = method48();
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
						field428[var3] = new XEGQQHIM(var3 + 1, signlink.cache_idx[var3], 500000, signlink.cache_dat);
					}
				}

				try {
					method91();
					field414 = method157(field476[1], "title", "title screen", 25, 1);
					field415 = new THSQSAVT(field414, "p11_full", false);
					field416 = new THSQSAVT(field414, "p12_full", false);
					field417 = new THSQSAVT(field414, "b12_full", false);
					field418 = new THSQSAVT(field414, "q8_full", true);
					method82();
					method25();
					DTIATKJO var4 = method157(field476[2], "config", "config", 30, 2);
					DTIATKJO var5 = method157(field476[3], "interface", "interface", 35, 3);
					DTIATKJO var6 = method157(field476[4], "media", "2d graphics", 40, 4);
					DTIATKJO var7 = method157(field476[6], "textures", "textures", 45, 6);
					DTIATKJO var8 = method157(field476[7], "wordenc", "chat system", 50, 7);
					DTIATKJO var9 = method157(field476[8], "sounds", "sound effects", 55, 8);
					field392 = new byte[4][104][104];
					field64 = new int[4][105][105];
					field207 = new LXDDKEZF(4, 104, 104, field64);

					for (int var10 = 0; var10 < 4; var10++) {
						field225[var10] = new XBMRDXRN(104, 104);
					}

					field427 = new NUXITFPR(512, 512);
					DTIATKJO var11 = method157(field476[5], "versionlist", "update list", 60, 5);
					method13(60, "Connecting to update server");
					field73 = new XZFDFADG();
					field73.method571(var11, this);
					XZZTWOGF.method578(field73.method564());
					OQIGXOFQ.method388(field73.method563(0), field73);

					if (!field240) {
						field364 = 0;
						field365 = true;
						field73.method576(2, field364);

						while (field73.method568() > 0) {
							method78();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field73.field1423 > 3) {
								method105("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field73.method563(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field73.method576(1, var13);
					}

					while (field73.method568() > 0) {
						int var14 = var12 - field73.method568();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method78();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field73.field1423 > 3) {
							method105("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field73.method563(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field73.method562(var16);
						if ((var17 & 0x1) != 0) {
							field73.method576(0, var16);
						}
					}

					int var18 = field73.method568();
					while (field73.method568() > 0) {
						int var19 = var18 - field73.method568();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method78();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field428[0] != null) {
						method13(75, "Requesting maps");
						field73.method576(3, field73.method561(48, 47, 0));
						field73.method576(3, field73.method561(48, 47, 1));
						field73.method576(3, field73.method561(48, 48, 0));
						field73.method576(3, field73.method561(48, 48, 1));
						field73.method576(3, field73.method561(48, 49, 0));
						field73.method576(3, field73.method561(48, 49, 1));
						field73.method576(3, field73.method561(47, 47, 0));
						field73.method576(3, field73.method561(47, 47, 1));
						field73.method576(3, field73.method561(47, 48, 0));
						field73.method576(3, field73.method561(47, 48, 1));
						field73.method576(3, field73.method561(148, 48, 0));
						field73.method576(3, field73.method561(148, 48, 1));
						int var20 = field73.method568();
						while (field73.method568() > 0) {
							int var21 = var20 - field73.method568();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method78();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field73.method563(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field73.method562(var23);
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
							field73.method569(0, var25, var23);
						}
					}

					field73.method560(field239);

					if (!field240) {
						int var26 = field73.method563(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field73.method558(var27)) {
								field73.method569(2, (byte) 1, var27);
							}
						}
					}

					method13(80, "Unpacking media");
					field75 = new KZTQXFDC(var6, "invback", 0);
					field77 = new KZTQXFDC(var6, "chatback", 0);
					field76 = new KZTQXFDC(var6, "mapback", 0);
					field472 = new KZTQXFDC(var6, "backbase1", 0);
					field473 = new KZTQXFDC(var6, "backbase2", 0);
					field474 = new KZTQXFDC(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field408[var28] = new KZTQXFDC(var6, "sideicons", var28);
					}

					field312 = new NUXITFPR(var6, "compass", 0);
					field123 = new NUXITFPR(var6, "mapedge", 0);
					field123.method373();

					for (int var29 = 0; var29 < 72; var29++) {
						field465[var29] = new KZTQXFDC(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field60[var30] = new NUXITFPR(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field306[var31] = new NUXITFPR(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field136[var32] = new NUXITFPR(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field471[var33] = new NUXITFPR(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field94[var34] = new NUXITFPR(var6, "headicons_hint", var34);
					}

					field475 = new NUXITFPR(var6, "overlay_multiway", 0);
					field95 = new NUXITFPR(var6, "mapmarker", 0);
					field96 = new NUXITFPR(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field156[var35] = new NUXITFPR(var6, "cross", var35);
					}

					field451 = new NUXITFPR(var6, "mapdots", 0);
					field452 = new NUXITFPR(var6, "mapdots", 1);
					field453 = new NUXITFPR(var6, "mapdots", 2);
					field454 = new NUXITFPR(var6, "mapdots", 3);
					field455 = new NUXITFPR(var6, "mapdots", 4);
					field308 = new KZTQXFDC(var6, "scrollbar", 0);
					field309 = new KZTQXFDC(var6, "scrollbar", 1);
					field196 = new KZTQXFDC(var6, "redstone1", 0);
					field197 = new KZTQXFDC(var6, "redstone2", 0);
					field198 = new KZTQXFDC(var6, "redstone3", 0);
					field199 = new KZTQXFDC(var6, "redstone1", 0);
					field199.method297();
					field200 = new KZTQXFDC(var6, "redstone2", 0);
					field200.method297();
					field435 = new KZTQXFDC(var6, "redstone1", 0);
					field435.method298();
					field436 = new KZTQXFDC(var6, "redstone2", 0);
					field436.method298();
					field437 = new KZTQXFDC(var6, "redstone3", 0);
					field437.method298();
					field438 = new KZTQXFDC(var6, "redstone1", 0);
					field438.method297();
					field438.method298();
					field439 = new KZTQXFDC(var6, "redstone2", 0);
					field439.method297();
					field439.method298();

					for (int var36 = 0; var36 < 2; var36++) {
						field281[var36] = new KZTQXFDC(var6, "mod_icons", var36);
					}

					NUXITFPR var37 = new NUXITFPR(var6, "backleft1", 0);
					field481 = new TZRNBMTC(var37.field996, method11(), var37.field997);
					var37.method374(0, 0);
					NUXITFPR var38 = new NUXITFPR(var6, "backleft2", 0);
					field482 = new TZRNBMTC(var38.field996, method11(), var38.field997);
					var38.method374(0, 0);
					NUXITFPR var39 = new NUXITFPR(var6, "backright1", 0);
					field483 = new TZRNBMTC(var39.field996, method11(), var39.field997);
					var39.method374(0, 0);
					NUXITFPR var40 = new NUXITFPR(var6, "backright2", 0);
					field484 = new TZRNBMTC(var40.field996, method11(), var40.field997);
					var40.method374(0, 0);
					NUXITFPR var41 = new NUXITFPR(var6, "backtop1", 0);
					field485 = new TZRNBMTC(var41.field996, method11(), var41.field997);
					var41.method374(0, 0);
					NUXITFPR var42 = new NUXITFPR(var6, "backvmid1", 0);
					field486 = new TZRNBMTC(var42.field996, method11(), var42.field997);
					var42.method374(0, 0);
					NUXITFPR var43 = new NUXITFPR(var6, "backvmid2", 0);
					field487 = new TZRNBMTC(var43.field996, method11(), var43.field997);
					var43.method374(0, 0);
					NUXITFPR var44 = new NUXITFPR(var6, "backvmid3", 0);
					field488 = new TZRNBMTC(var44.field996, method11(), var44.field997);
					var44.method374(0, 0);
					NUXITFPR var45 = new NUXITFPR(var6, "backhmid2", 0);
					field489 = new TZRNBMTC(var45.field996, method11(), var45.field997);
					var45.method374(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field60[var50] != null) {
							field60[var50].method372(var48 + var49, var46 + var49, var47 + var49);
						}

						if (field465[var50] != null) {
							field465[var50].method299(var48 + var49, var46 + var49, var47 + var49);
						}
					}

					method13(83, "Unpacking textures");
					QAMTFDSD.method452(var7);
					QAMTFDSD.method456(0.8D);
					QAMTFDSD.method451(20);
					method13(86, "Unpacking config");
					VYCKCNXO.method524(var4);
					MKWUPJYP.method369(var4);
					PQRCEBTR.method443(var4);
					ZKNJTNWP.method600(var4);
					DDJHHGTJ.method165(var4);
					FGIDBWCJ.method184(var4);
					BYUDODIR.method16(var4);
					QORKDXHW.method467(var4);
					OIEBXCSN.method385(var4);
					ZKNJTNWP.field1474 = field239;

					if (!field240) {
						method13(90, "Unpacking sounds");
						byte[] var51 = var9.method168("sounds.dat", null);
						GHHPHSRU var52 = new GHHPHSRU(var51);
						VYSYBHPS.method527(var52);
					}

					method13(95, "Unpacking interfaces");
					THSQSAVT[] var53 = new THSQSAVT[] { field415, field416, field417, field418 };
					EKHKDMUP.method176(var53, var5, var6);
					method13(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field76.field848[field76.field850 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field490[var54] = var55;
						field80[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field76.field848[field76.field850 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field307[var58 - 5] = var59 - 25;
						field346[var58 - 5] = var60 - var59;
					}

					QAMTFDSD.method449(503, 765);
					field244 = QAMTFDSD.field1152;
					QAMTFDSD.method449(96, 479);
					field241 = QAMTFDSD.field1152;
					QAMTFDSD.method449(261, 190);
					field242 = QAMTFDSD.field1152;
					QAMTFDSD.method449(334, 512);
					field243 = QAMTFDSD.field1152;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = QAMTFDSD.field1150[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					LXDDKEZF.method345(500, 334, 512, var62, 800);
					HGSXEUXP.method245(var8);
					field294 = new ZEOHBQWT(this);
					method12(field294, 10);
					WYAAPLJP.field1369 = this;
					MKWUPJYP.field978 = this;
					DDJHHGTJ.field530 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field116 + " " + field253);
					field234 = true;
				}
			} else {
				field226 = true;
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.m(I)V")
	public final void method56() {
		for (FNOFBEYP var1 = (FNOFBEYP) field221.method519(); var1 != null; var1 = (FNOFBEYP) field221.method521()) {
			if (var1.field657 == -1) {
				var1.field661 = 0;
				method137(var1);
			} else {
				var1.method19();
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method57() {
		if (field203 != 0) {
			THSQSAVT var1 = field416;
			int var2 = 0;
			if (field212 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field140[var3] != null) {
					int var4 = field138[var3];
					String var5 = field139[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field311 == 0 || field311 == 1 && method83(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method477(0, "From", var7, var8);
						var1.method477(0xFFFF, "From", var7 - 1, var8);
						int var11 = var8 + var1.method475("From ");
						if (var6 == 1) {
							field281[0].method300(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field281[1].method300(var7 - 12, var11);
							var11 += 14;
						}

						var1.method477(0, var5 + ": " + field140[var3], var7, var11);
						var1.method477(0xFFFF, var5 + ": " + field140[var3], var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field311 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method477(0, field140[var3], var9, 4);
						var1.method477(0xFFFF, field140[var3], var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field311 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method477(0, "To " + var5 + ": " + field140[var3], var10, 4);
						var1.method477(0xFFFF, "To " + var5 + ": " + field140[var3], var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field207.method335(arg4, arg3, arg2);
		if (var6 != 0) {
			int var7 = field207.method339(arg4, arg3, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field427.field995;
			int var12 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			MKWUPJYP var14 = MKWUPJYP.method365(var13);
			if (var14.field942 == -1) {
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
				KZTQXFDC var15 = field465[var14.field942];
				if (var15 != null) {
					int var16 = (var14.field980 * 4 - var15.field850) / 2;
					int var17 = (var14.field975 * 4 - var15.field851) / 2;
					var15.method300((104 - arg2 - var14.field975) * 4 + var17 + 48, arg3 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field207.method337(arg4, arg3, arg2);
		if (var18 != 0) {
			int var19 = field207.method339(arg4, arg3, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			MKWUPJYP var23 = MKWUPJYP.method365(var22);
			if (var23.field942 != -1) {
				KZTQXFDC var24 = field465[var23.field942];
				if (var24 != null) {
					int var25 = (var23.field980 * 4 - var24.field850) / 2;
					int var26 = (var23.field975 * 4 - var24.field851) / 2;
					var24.method300((104 - arg2 - var23.field975) * 4 + var26 + 48, arg3 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field427.field995;
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

		int var30 = field207.method338(arg4, arg3, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			MKWUPJYP var32 = MKWUPJYP.method365(var31);
			if (var32.field942 != -1) {
				KZTQXFDC var33 = field465[var32.field942];
				if (var33 != null) {
					int var34 = (var32.field980 * 4 - var33.field850) / 2;
					int var35 = (var32.field975 * 4 - var33.field851) / 2;
					var33.method300((104 - arg2 - var32.field975) * 4 + var35 + 48, arg3 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method59(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field188; var3++) {
				if (field429[var3] == arg0) {
					field188--;
					field384 = true;

					for (int var4 = var3; var4 < field188; var4++) {
						field429[var4] = field429[var4 + 1];
					}

					field343.method191(140);
					field343.method198(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method60(int arg0) {
		int var2 = QORKDXHW.field1177[arg0].field1185;
		if (var2 != 0) {
			int var3 = field477[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					QAMTFDSD.method456(0.9D);
				}

				if (var3 == 2) {
					QAMTFDSD.method456(0.8D);
				}

				if (var3 == 3) {
					QAMTFDSD.method456(0.7D);
				}

				if (var3 == 4) {
					QAMTFDSD.method456(0.6D);
				}

				ZKNJTNWP.field1514.method509();
				field276 = true;
			}

			if (var2 == 3) {
				boolean var4 = field208;

				if (var3 == 0) {
					method136(0, field208);
					field208 = true;
				}

				if (var3 == 1) {
					method136(-400, field208);
					field208 = true;
				}

				if (var3 == 2) {
					method136(-800, field208);
					field208 = true;
				}

				if (var3 == 3) {
					method136(-1200, field208);
					field208 = true;
				}

				if (var3 == 4) {
					field208 = false;
				}

				if (field208 != var4 && !field240) {
					if (field208) {
						field364 = field84;
						field365 = true;
						field73.method576(2, field364);
					} else {
						method41();
					}

					field356 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field220 = true;
					method61(0);
				}

				if (var3 == 1) {
					field220 = true;
					method61(-400);
				}

				if (var3 == 2) {
					field220 = true;
					method61(-800);
				}

				if (var3 == 3) {
					field220 = true;
					method61(-1200);
				}

				if (var3 == 4) {
					field220 = false;
				}
			}

			if (var2 == 5) {
				field230 = var3;
			}

			if (var2 == 6) {
				field157 = var3;
			}

			if (var2 == 8) {
				field203 = var3;
				field303 = true;
			}

			if (var2 == 9) {
				field125 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method61(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method62() {
		if (field203 != 0) {
			int var1 = 0;
			if (field212 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field140[var2] != null) {
					int var3 = field138[var2];
					String var4 = field139[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field311 == 0 || field311 == 1 && method83(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field416.method475("From:  " + var4 + field140[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field468 >= 1) {
									field227[field389] = "Report abuse @whi@" + var4;
									field317[field389] = 2279;
									field389++;
								}

								field227[field389] = "Add ignore @whi@" + var4;
								field317[field389] = 2275;
								field389++;
								field227[field389] = "Add friend @whi@" + var4;
								field317[field389] = 2691;
								field389++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field311 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method63(String arg0) throws IOException {
		if (field74) {
			if (field151 != null) {
				try {
					field151.close();
				} catch (Exception var4) {
				}

				field151 = null;
			}

			field151 = method119(43595);
			field151.setSoTimeout(10000);
			InputStream var2 = field151.getInputStream();
			OutputStream var3 = field151.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IIIIIBIIZIII)Z")
	public final boolean method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field442[var14][var15] = 0;
				field71[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg10;
		field442[arg8][arg10] = 99;
		field71[arg8][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field118[var18] = arg8;
		int var35 = var18 + 1;
		field119[var18] = arg10;
		boolean var20 = false;
		int var21 = field118.length;
		int[][] var22 = field225[field91].field1394;
		while (var35 != var19) {
			var16 = field118[var19];
			var17 = field119[var19];
			var19 = (var19 + 1) % var21;

			if (arg2 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field225[field91].method546(arg1 - 1, var16, arg5, arg0, arg2, var17)) {
					var20 = true;
					break;
				}

				if (arg1 < 10 && field225[field91].method547(arg5, arg0, var16, arg1 - 1, var17, arg2)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg9 != 0 && field225[field91].method548(arg3, arg4, arg9, arg0, var17, var16, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field71[var16][var17] + 1;
			if (var16 > 0 && field442[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field118[var35] = var16 - 1;
				field119[var35] = var17;
				var35 = (var35 + 1) % var21;
				field442[var16 - 1][var17] = 2;
				field71[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field442[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field118[var35] = var16 + 1;
				field119[var35] = var17;
				var35 = (var35 + 1) % var21;
				field442[var16 + 1][var17] = 8;
				field71[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field442[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field118[var35] = var16;
				field119[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field442[var16][var17 - 1] = 1;
				field71[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field442[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field118[var35] = var16;
				field119[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field442[var16][var17 + 1] = 4;
				field71[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field442[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field118[var35] = var16 - 1;
				field119[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field442[var16 - 1][var17 - 1] = 3;
				field71[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field442[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field118[var35] = var16 + 1;
				field119[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field442[var16 + 1][var17 - 1] = 9;
				field71[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field442[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field118[var35] = var16 - 1;
				field119[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field442[var16 - 1][var17 + 1] = 6;
				field71[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field442[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field118[var35] = var16 + 1;
				field119[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field442[var16 + 1][var17 + 1] = 12;
				field71[var16 + 1][var17 + 1] = var23;
			}
		}

		field164 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg2 - var25; var26 <= arg2 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field71[var26][var27] < var24) {
								var24 = field71[var26][var27];
								var16 = var26;
								var17 = var27;
								field164 = 1;
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
		field118[var28] = var16;
		int var36 = var28 + 1;
		field119[var28] = var17;
		int var29;
		int var30 = var29 = field442[var16][var17];
		while (arg8 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field118[var36] = var16;
				field119[var36++] = var17;
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

			var30 = field442[var16][var17];
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
		int var32 = field118[var36];
		int var33 = field119[var36];

		if (arg6 == 0) {
			field343.method191(3);
			field343.method192(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field343.method191(234);
			field343.method192(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field343.method191(104);
			field343.method192(var31 + var31 + 3);
		}

		field343.method193(field100 + var33);
		field343.method226(field99 + var32);
		field425 = field118[0];
		field426 = field119[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field343.method192(field118[var36] - var32);
			field343.method220(field119[var36] - var33);
		}

		field343.method219(field27[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method65() {
		field150.method492();
		QAMTFDSD.field1152 = field241;
		field77.method300(0, 0);

		if (field388) {
			field417.method473(40, 239, 0, field352);
			field417.method473(60, 239, 128, field231 + "*");
		} else if (field295 == 1) {
			field417.method473(40, 239, 0, "Enter amount:");
			field417.method473(60, 239, 128, field340 + "*");
		} else if (field295 == 2) {
			field417.method473(40, 239, 0, "Enter name:");
			field417.method473(60, 239, 128, field340 + "*");
		} else if (field61 != null) {
			field417.method473(40, 239, 0, field61);
			field417.method473(60, 239, 128, "Click to continue");
		} else if (field59 != -1) {
			method122(0, 0, EKHKDMUP.method174(field59), 0);
		} else if (field120 == -1) {
			THSQSAVT var1 = field416;
			int var2 = 0;
			JNJDBENA.method285(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field140[var3] != null) {
					int var4 = field138[var3];
					int var5 = field210 + 70 - var2 * 14;
					String var6 = field139[var3];
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
							var1.method477(0, field140[var3], var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field394 == 0 || field394 == 1 && method83(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field281[0].method300(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field281[1].method300(var5 - 12, var8);
								var8 += 14;
							}

							var1.method477(0, var6 + ":", var5, var8);
							var8 += var1.method475(var6) + 8;
							var1.method477(255, field140[var3], var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field203 == 0 && (var4 == 7 || field311 == 0 || field311 == 1 && method83(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method477(0, "From", var5, var9);
							int var11 = var9 + var1.method475("From ");
							if (var7 == 1) {
								field281[0].method300(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field281[1].method300(var5 - 12, var11);
								var11 += 14;
							}

							var1.method477(0, var6 + ":", var5, var11);
							var11 += var1.method475(var6) + 8;
							var1.method477(0x800000, field140[var3], var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field165 == 0 || field165 == 1 && method83(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method477(0x800080, var6 + " " + field140[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field203 == 0 && field311 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method477(0x800000, field140[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field203 == 0 && field311 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method477(0, "To " + var6 + ":", var5, 4);
							var1.method477(0x800000, field140[var3], var5, var1.method475("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field165 == 0 || field165 == 1 && method83(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method477(0x7E3200, var6 + " " + field140[var3], var5, 4);
						}

						var2++;
					}
				}
			}

			JNJDBENA.method284();
			field395 = var2 * 14 + 7;
			if (field395 < 78) {
				field395 = 78;
			}

			method102(77, 463, 0, field395 - field210 - 77, field395);
			String var10;
			if (field65 == null || field65.field552 == null) {
				var10 = VSUIHULP.method514(field92);
			} else {
				var10 = field65.field552;
			}

			var1.method477(0, var10 + ":", 90, 4);
			var1.method477(255, field328 + "*", 90, var1.method475(var10 + ": ") + 6);
			JNJDBENA.method291(0, 479, 0, 77);
		} else {
			method122(0, 0, EKHKDMUP.method174(field120), 0);
		}

		if (field264 && field375 == 2) {
			method90();
		}

		field150.method493(357, 17, field9);
		field149.method492();
		QAMTFDSD.field1152 = field243;
	}

	@ObfuscatedName("client.b(BI)Z")
	public final boolean method66(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field317[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 691) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(ILEKHKDMUP;)Z")
	public final boolean method67(EKHKDMUP arg0) {
		int var2 = arg0.field631;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field227[field389] = "Remove @whi@" + arg0.field612;
				field317[field389] = 266;
				field389++;
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

		field227[field389] = "Remove @whi@" + field179[var2];
		field317[field389] = 739;
		field389++;
		field227[field389] = "Message @whi@" + field179[var2];
		field317[field389] = 633;
		field389++;
		return true;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method68() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field394 = (field394 + 1) % 4;
				field245 = true;
				field303 = true;
				field343.method191(198);
				field343.method192(field394);
				field343.method192(field311);
				field343.method192(field165);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field311 = (field311 + 1) % 3;
				field245 = true;
				field303 = true;
				field343.method191(198);
				field343.method192(field394);
				field343.method192(field311);
				field343.method192(field165);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field165 = (field165 + 1) % 3;
				field245 = true;
				field303 = true;
				field343.method191(198);
				field343.method192(field394);
				field343.method192(field311);
				field343.method192(field165);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field69 == -1) {
					method154();
					field72 = "";
					field128 = false;
					field78 = field69 = EKHKDMUP.field618;
				} else {
					method31("", "Please close the interface you have open before using 'report abuse'", 0);
				}
			}

			field189++;
			if (field189 > 92) {
				field189 = 0;
				field343.method191(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		FNOFBEYP var10 = null;
		for (FNOFBEYP var11 = (FNOFBEYP) field221.method519(); var11 != null; var11 = (FNOFBEYP) field221.method521()) {
			if (var11.field662 == arg1 && var11.field664 == arg3 && var11.field665 == arg6 && var11.field663 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new FNOFBEYP();
			var10.field662 = arg1;
			var10.field663 = arg2;
			var10.field664 = arg3;
			var10.field665 = arg6;
			method137(var10);
			field221.method516(var10);
		}

		var10.field658 = arg5;
		var10.field660 = arg7;
		var10.field659 = arg8;
		var10.field661 = arg4;
		var10.field657 = arg0;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method70(boolean arg0) {
		for (int var2 = 0; var2 < field362; var2++) {
			LJAXEEYT var3 = field361[field363[var2]];
			int var4 = (field363[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method169() && var3.field856.field524 == arg0 && var3.field856.method161()) {
				int var5 = var3.field741 >> 7;
				int var6 = var3.field742 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field753 == 1 && (var3.field741 & 0x7F) == 0x40 && (var3.field742 & 0x7F) == 0x40) {
						if (field134[var5][var6] == field70) {
							continue;
						}

						field134[var5][var6] = field70;
					}

					if (!var3.field856.field497) {
						var4 += Integer.MIN_VALUE;
					}

					field207.method320(var3, var3.field741, var3.field742, var4, method34(var3.field742, field91, var3.field741), var3.field727, (var3.field753 - 1) * 64 + 60, var3.field743, field91);
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 345);

			if (arg0.length == 5) {
				field237 = Integer.parseInt(arg0[0]);
				field238 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method71();
				} else if (arg0[2].equals("highmem")) {
					method146();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field239 = false;
				} else if (arg0[3].equals("members")) {
					field239 = true;
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

	@ObfuscatedName("client.q(I)V")
	public static final void method71() {
		LXDDKEZF.field872 = true;
		QAMTFDSD.field1141 = true;
		field240 = true;
		PMCVBMMY.field1110 = true;
		MKWUPJYP.field956 = true;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method72(int arg0) {
		int[] var2 = field427.field995;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field392[arg0][var7][var5] & 0x18) == 0) {
					field207.method344(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field392[arg0 + 1][var7][var5] & 0x8) != 0) {
					field207.method344(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field427.method371();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field392[arg0][var11][var10] & 0x18) == 0) {
					method58(var9, var8, var10, var11, arg0);
				}

				if (arg0 < 3 && (field392[arg0 + 1][var11][var10] & 0x8) != 0) {
					method58(var9, var8, var10, var11, arg0 + 1);
				}
			}
		}

		if (field149 != null) {
			field149.method492();
			QAMTFDSD.field1152 = field243;
		}

		field278 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field207.method338(field91, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = MKWUPJYP.method365(var14).field970;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field225[field91].field1394;
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

						field222[field278] = field60[var15];
						field279[field278] = var16;
						field280[field278] = var17;
						field278++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method73() {
		try {
			field359 = -1;
			field329.method523();
			field347.method523();
			QAMTFDSD.method450();
			method30();
			field207.method309();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field225[var1].method537();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field392[var2][var3][var4] = 0;
					}
				}
			}

			PMCVBMMY var5 = new PMCVBMMY(field392, field64, 104, 104);
			int var6 = field232.length;
			field343.method191(135);

			if (!field166) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field254[var7] >> 8) * 64 - field99;
					int var9 = (field254[var7] & 0xFF) * 64 - field100;
					byte[] var10 = field232[var7];
					if (var10 != null) {
						var5.method421((field155 - 6) * 8, (field154 - 6) * 8, field225, var8, var9, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field254[var11] >> 8) * 64 - field99;
					int var13 = (field254[var11] & 0xFF) * 64 - field100;
					byte[] var14 = field232[var11];
					if (var14 == null && field155 < 800) {
						var5.method423(var12, 64, 64, var13);
					}
				}

				field343.method191(135);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field52[var15];
					if (var16 != null) {
						int var17 = (field254[var15] >> 8) * 64 - field99;
						int var18 = (field254[var15] & 0xFF) * 64 - field100;
						var5.method419(var18, field225, var16, field207, var17);
					}
				}
			}

			if (field166) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field314[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field254.length; var28++) {
									if (field254[var28] == var27 && field232[var28] != null) {
										var5.method418(var21 * 8, var20 * 8, (var25 & 0x7) * 8, field225, (var26 & 0x7) * 8, var19, var23, field232[var28], var24);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field314[0][var29][var30];
						if (var31 == -1) {
							var5.method423(var29 * 8, 8, 8, var30 * 8);
						}
					}
				}

				field343.method191(135);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field314[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field254.length; var41++) {
									if (field254[var41] == var40 && field52[var41] != null) {
										var5.method420(field225, var37, (var38 & 0x7) * 8, (var39 & 0x7) * 8, var33 * 8, var32, field207, var34 * 8, var36, field52[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field343.method191(135);
			var5.method417(field207, field225);

			if (field149 != null) {
				field149.method492();
				QAMTFDSD.field1152 = field243;
			}

			field343.method191(135);
			int var42 = PMCVBMMY.field1111;
			if (var42 > field91) {
				var42 = field91;
			}

			if (var42 < field91 - 1) {
				int var43 = field91 - 1;
			}

			if (field240) {
				field207.method310(PMCVBMMY.field1111);
			} else {
				field207.method310(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method134(var44, var45);
				}
			}

			field284++;
			if (field284 > 55) {
				field284 = 0;
				field343.method191(124);
			}

			method56();
		} catch (Exception var58) {
		}

		MKWUPJYP.field954.method509();

		if (field12 != null) {
			field343.method191(158);
			field343.method196(1057001181);
		}

		if (field240 && signlink.cache_dat != null) {
			int var47 = field73.method563(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field73.method562(var48);
				if ((var49 & 0x79) == 0) {
					OQIGXOFQ.method390(var48);
				}
			}
		}

		System.gc();
		QAMTFDSD.method451(20);
		field73.method570();
		int var50 = (field154 - 6) / 8 - 1;
		int var51 = (field154 + 6) / 8 + 1;
		int var52 = (field155 - 6) / 8 - 1;
		int var53 = (field155 + 6) / 8 + 1;
		if (field459) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field73.method561(var55, var54, 0);
					if (var56 != -1) {
						field73.method577(var56, 3);
					}

					int var57 = field73.method561(var55, var54, 1);
					if (var57 != -1) {
						field73.method577(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method74() {
		if (field219 > 0) {
			method76();
		} else {
			method77("Connection lost", "Please wait - attempting to reestablish");
			field205 = 0;
			field425 = 0;
			YQNDWKQR var1 = field115;
			field206 = false;
			field85 = 0;
			method152(field92, field93, true);

			if (!field206) {
				method76();
			}

			try {
				var1.method583();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BLDDJHHGTJ;III)V")
	public final void method75(DDJHHGTJ arg0, int arg1, int arg2, int arg3) {
		if (field389 < 400) {
			if (arg0.field518 != null) {
				arg0 = arg0.method164();
			}

			if (arg0 != null && arg0.field497) {
				String var5 = arg0.field526;
				if (arg0.field521 != 0) {
					var5 = var5 + method147(field65.field568, arg0.field521) + " (level-" + arg0.field521 + ")";
				}

				if (field445 == 1) {
					field227[field389] = "Use " + field449 + " with @yel@" + var5;
					field317[field389] = 237;
					field318[field389] = arg1;
					field315[field389] = arg3;
					field316[field389] = arg2;
					field389++;
				} else if (field332 != 1) {
					if (arg0.field496 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field496[var6] != null && !arg0.field496[var6].equalsIgnoreCase("attack")) {
								field227[field389] = arg0.field496[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field317[field389] = 886;
								}

								if (var6 == 1) {
									field317[field389] = 645;
								}

								if (var6 == 2) {
									field317[field389] = 723;
								}

								if (var6 == 3) {
									field317[field389] = 667;
								}

								if (var6 == 4) {
									field317[field389] = 423;
								}

								field318[field389] = arg1;
								field315[field389] = arg3;
								field316[field389] = arg2;
								field389++;
							}
						}
					}

					if (arg0.field496 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field496[var7] != null && arg0.field496[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field521 > field65.field568) {
									var8 = 2000;
								}

								field227[field389] = arg0.field496[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field317[field389] = var8 + 886;
								}

								if (var7 == 1) {
									field317[field389] = var8 + 645;
								}

								if (var7 == 2) {
									field317[field389] = var8 + 723;
								}

								if (var7 == 3) {
									field317[field389] = var8 + 667;
								}

								if (var7 == 4) {
									field317[field389] = var8 + 423;
								}

								field318[field389] = arg1;
								field315[field389] = arg3;
								field316[field389] = arg2;
								field389++;
							}
						}
					}

					field227[field389] = "Examine @yel@" + var5;
					field317[field389] = 1892;
					field318[field389] = arg1;
					field315[field389] = arg3;
					field316[field389] = arg2;
					field389++;
				} else if ((field334 & 0x2) == 2) {
					field227[field389] = field335 + " @yel@" + var5;
					field317[field389] = 893;
					field318[field389] = arg1;
					field315[field389] = arg3;
					field316[field389] = arg2;
					field389++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method76() {
		try {
			if (field115 != null) {
				field115.method583();
			}
		} catch (Exception var2) {
		}

		field115 = null;
		field206 = false;
		field152 = 0;
		field92 = "";
		field93 = "";
		method30();
		field207.method309();

		for (int var1 = 0; var1 < 4; var1++) {
			field225[var1].method537();
		}

		System.gc();
		method41();
		field84 = -1;
		field364 = -1;
		field356 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method77(String arg0, String arg1) {
		if (field149 != null) {
			field149.method492();
			QAMTFDSD.field1152 = field243;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field416.method473(var3, 257, 0, arg0);
			field416.method473(var3 - 1, 256, 0xFFFFFF, arg0);
			var3 += 15;
			if (arg1 != null) {
				field416.method473(var3, 257, 0, arg1);
				field416.method473(var3 - 1, 256, 0xFFFFFF, arg1);
			}

			field149.method493(4, 4, field9);
		} else if (field10 != null) {
			field10.method492();
			QAMTFDSD.field1152 = field244;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			JNJDBENA.method288(383 - var5 / 2, var4 - 5 - var6 / 2, var5, 0, var6);
			JNJDBENA.method289(383 - var5 / 2, var5, var4 - var6 / 2 - 5, 0xFFFFFF, var6);

			if (arg1 != null) {
				var4 -= 7;
			}

			field416.method473(var4, 383, 0, arg0);
			field416.method473(var4 - 1, 382, 0xFFFFFF, arg0);
			var4 += 15;
			if (arg1 != null) {
				field416.method473(var4, 383, 0, arg1);
				field416.method473(var4 - 1, 382, 0xFFFFFF, arg1);
			}

			field10.method493(0, 0, field9);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method78() {
		while (true) {
			RPOURQXY var1 = field73.method557();
			if (var1 == null) {
				return;
			}

			if (var1.field1229 == 0) {
				OQIGXOFQ.method389(var1.field1227, var1.field1228);

				if ((field73.method562(var1.field1227) & 0x62) != 0) {
					field384 = true;

					if (field59 != -1 || field120 != -1) {
						field303 = true;
					}
				}
			}

			if (var1.field1229 == 1 && var1.field1228 != null) {
				XZZTWOGF.method579(var1.field1228);
			}

			if (var1.field1229 == 2 && field364 == var1.field1227 && var1.field1228 != null) {
				method36(var1.field1228, field365);
			}

			if (var1.field1229 == 3 && field124 == 1) {
				for (int var2 = 0; var2 < field232.length; var2++) {
					if (field255[var2] == var1.field1227) {
						field232[var2] = var1.field1228;

						if (var1.field1228 == null) {
							field255[var2] = -1;
						}

						break;
					}

					if (field256[var2] == var1.field1227) {
						field52[var2] = var1.field1228;

						if (var1.field1228 == null) {
							field256[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1229 == 93 && field73.method567(var1.field1227)) {
				PMCVBMMY.method436(field73, new GHHPHSRU(var1.field1228));
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method79(int arg0, int arg1) {
		boolean var3 = false;
		EKHKDMUP var4 = EKHKDMUP.method174(arg1);
		for (int var5 = 0; var5 < var4.field581.length && var4.field581[var5] != -1; var5++) {
			EKHKDMUP var6 = EKHKDMUP.method174(var4.field581[var5]);
			if (var6.field625 == 1) {
				var3 |= method79(arg0, var6.field632);
			}

			if (var6.field625 == 6 && (var6.field579 != -1 || var6.field580 != -1)) {
				boolean var7 = method24(var6);
				int var8;
				if (var7) {
					var8 = var6.field580;
				} else {
					var8 = var6.field579;
				}

				if (var8 != -1) {
					VYCKCNXO var9 = VYCKCNXO.field1339[var8];
					var6.field622 += arg0;
					while (var6.field622 > var9.method525(var6.field644)) {
						var6.field622 -= var9.method525(var6.field644) + 1;
						var6.field644++;
						if (var6.field644 >= var9.field1340) {
							var6.field644 -= var9.field1344;
							if (var6.field644 < 0 || var6.field644 >= var9.field1340) {
								var6.field644 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field625 == 6 && var6.field578 != 0) {
				int var10 = var6.field578 >> 16;
				int var11 = var6.field578 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field614 = var6.field614 + var10 & 0x7FF;
				var6.field615 = var6.field615 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(I[BZ)Z")
	public final boolean method80(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(IIB)V")
	public final void method81(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field140[var4] != null) {
				int var5 = field138[var4];
				int var6 = field210 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field139[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field394 == 0 || field394 == 1 && method83(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field65.field552)) {
						if (field468 >= 1) {
							field227[field389] = "Report abuse @whi@" + var7;
							field317[field389] = 279;
							field389++;
						}

						field227[field389] = "Add ignore @whi@" + var7;
						field317[field389] = 275;
						field389++;
						field227[field389] = "Add friend @whi@" + var7;
						field317[field389] = 691;
						field389++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field203 == 0 && (var5 == 7 || field311 == 0 || field311 == 1 && method83(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field468 >= 1) {
							field227[field389] = "Report abuse @whi@" + var7;
							field317[field389] = 279;
							field389++;
						}

						field227[field389] = "Add ignore @whi@" + var7;
						field317[field389] = 275;
						field389++;
						field227[field389] = "Add friend @whi@" + var7;
						field317[field389] = 691;
						field389++;
					}

					var3++;
				}

				if (var5 == 4 && (field165 == 0 || field165 == 1 && method83(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field227[field389] = "Accept trade @whi@" + var7;
						field317[field389] = 532;
						field389++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field203 == 0 && field311 < 2) {
					var3++;
				}

				if (var5 == 8 && (field165 == 0 || field165 == 1 && method83(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field227[field389] = "Accept challenge @whi@" + var7;
						field317[field389] = 938;
						field389++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method82() {
		byte[] var1 = field414.method168("title.dat", null);
		NUXITFPR var2 = new NUXITFPR(var1, this);
		field268.method492();
		var2.method374(0, 0);
		field269.method492();
		var2.method374(0, -637);
		field265.method492();
		var2.method374(0, -128);
		field266.method492();
		var2.method374(-371, -202);
		field267.method492();
		var2.method374(-171, -202);
		field270.method492();
		var2.method374(-265, 0);
		field271.method492();
		var2.method374(-265, -562);
		field272.method492();
		var2.method374(-171, -128);
		field273.method492();
		var2.method374(-171, -562);
		int[] var3 = new int[var2.field996];
		for (int var4 = 0; var4 < var2.field997; var4++) {
			for (int var5 = 0; var5 < var2.field996; var5++) {
				var3[var5] = var2.field995[var2.field996 * var4 + var2.field996 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field996; var6++) {
				var2.field995[var2.field996 * var4 + var6] = var3[var6];
			}
		}

		field268.method492();
		var2.method374(0, 382);
		field269.method492();
		var2.method374(0, -255);
		field265.method492();
		var2.method374(0, 254);
		field266.method492();
		var2.method374(-371, 180);
		field267.method492();
		var2.method374(-171, 180);
		field270.method492();
		var2.method374(-265, 382);
		field271.method492();
		var2.method374(-265, -180);
		field272.method492();
		var2.method374(-171, 254);
		field273.method492();
		var2.method374(-171, -180);
		NUXITFPR var7 = new NUXITFPR(field414, "logo", 0);
		field265.method492();
		var7.method376(18, 382 - var7.field996 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method83(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field228; var2++) {
			if (arg0.equalsIgnoreCase(field179[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field65.field552)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(LEKHKDMUP;B)Z")
	public final boolean method84(EKHKDMUP arg0) {
		int var2 = arg0.field631;
		if (field229 == 2) {
			if (var2 == 201) {
				field303 = true;
				field295 = 0;
				field388 = true;
				field231 = "";
				field291 = 1;
				field352 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field303 = true;
				field295 = 0;
				field388 = true;
				field231 = "";
				field291 = 2;
				field352 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field219 = 250;
			return true;
		}

		if (var2 == 501) {
			field303 = true;
			field295 = 0;
			field388 = true;
			field231 = "";
			field291 = 4;
			field352 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field303 = true;
			field295 = 0;
			field388 = true;
			field231 = "";
			field291 = 5;
			field352 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field342[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = FGIDBWCJ.field646 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= FGIDBWCJ.field646) {
							var5 = 0;
						}
					}

					if (!FGIDBWCJ.field647[var5].field653 && FGIDBWCJ.field647[var5].field648 == var3 + (field357 ? 0 : 7)) {
						break;
					}
				}

				field342[var3] = var5;
				field159 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field193[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field444[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field444[var6].length) {
					var8 = 0;
				}
			}

			field193[var6] = var8;
			field159 = true;
		}

		if (var2 == 324 && !field357) {
			field357 = true;
			method45();
		}

		if (var2 == 325 && field357) {
			field357 = false;
			method45();
		}

		if (var2 == 326) {
			field343.method191(25);
			field343.method192(field357 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field343.method192(field342[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field343.method192(field193[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field128 = !field128;
		}

		if (var2 >= 601 && var2 <= 613) {
			method154();

			if (field72.length() > 0) {
				field343.method191(195);
				field343.method198(VSUIHULP.method510(field72));
				field343.method192(var2 - 601);
				field343.method192(field128 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(IILGHHPHSRU;)V")
	public final void method85(int arg0, GHHPHSRU arg1) {
		field423 = 0;
		field403 = 0;
		method27(arg1, arg0);
		method118(arg1, arg0);
		method148(arg0, arg1);
		method143(arg1, arg0);

		for (int var3 = 0; var3 < field423; var3++) {
			int var4 = field424[var3];
			if (field372 != field400[var4].field752) {
				field400[var4] = null;
			}
		}

		if (arg1.field667 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field667 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field401; var5++) {
			if (field400[field402[var5]] == null) {
				signlink.reporterror(field92 + " null entry in pl list - pos:" + var5 + " size:" + field401);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method86() {
		field63 = false;
		while (field331) {
			field63 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field145 = null;
		field146 = null;
		field464 = null;
		field55 = null;
		field56 = null;
		field57 = null;
		field58 = null;
		field186 = null;
		field187 = null;
		field336 = null;
		field337 = null;
		field213 = null;
		field214 = null;
	}

	@ObfuscatedName("client.a(LEJJAKGTE;IIII)V")
	public final void method87(EJJAKGTE arg0, int arg1, int arg2, int arg3) {
		if (field65 != arg0 && field389 < 400) {
			String var5;
			if (arg0.field547 == 0) {
				var5 = arg0.field552 + method147(field65.field568, arg0.field568) + " (level-" + arg0.field568 + ")";
			} else {
				var5 = arg0.field552 + " (skill-" + arg0.field547 + ")";
			}

			if (field445 == 1) {
				field227[field389] = "Use " + field449 + " with @whi@" + var5;
				field317[field389] = 395;
				field318[field389] = arg2;
				field315[field389] = arg1;
				field316[field389] = arg3;
				field389++;
			} else if (field332 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field126[var6] != null) {
						field227[field389] = field126[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field126[var6].equalsIgnoreCase("attack")) {
							if (arg0.field568 > field65.field568) {
								var7 = 2000;
							}

							if (field65.field550 != 0 && arg0.field550 != 0) {
								if (field65.field550 == arg0.field550) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field127[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field317[field389] = var7 + 134;
						}

						if (var6 == 1) {
							field317[field389] = var7 + 473;
						}

						if (var6 == 2) {
							field317[field389] = var7 + 261;
						}

						if (var6 == 3) {
							field317[field389] = var7 + 554;
						}

						if (var6 == 4) {
							field317[field389] = var7 + 778;
						}

						field318[field389] = arg2;
						field315[field389] = arg1;
						field316[field389] = arg3;
						field389++;
					}
				}
			} else if ((field334 & 0x8) == 8) {
				field227[field389] = field335 + " @whi@" + var5;
				field317[field389] = 681;
				field318[field389] = arg2;
				field315[field389] = arg1;
				field316[field389] = arg3;
				field389++;
			}

			for (int var8 = 0; var8 < field389; var8++) {
				if (field317[var8] == 506) {
					field227[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
			if (field240 && field91 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field207.method335(arg3, arg5, arg4);
			}

			if (arg0 == 1) {
				var8 = field207.method336(arg3, arg4, arg5);
			}

			if (arg0 == 2) {
				var8 = field207.method337(arg3, arg5, arg4);
			}

			if (arg0 == 3) {
				var8 = field207.method338(arg3, arg5, arg4);
			}

			if (var8 != 0) {
				int var12 = field207.method339(arg3, arg5, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field207.method326(arg4, arg5, arg3);
					MKWUPJYP var16 = MKWUPJYP.method365(var13);
					if (var16.field940) {
						field225[arg3].method542(arg4, var14, var15, arg5, var16.field957);
					}
				}

				if (arg0 == 1) {
					field207.method327(arg3, arg5, arg4);
				}

				if (arg0 == 2) {
					field207.method328(arg3, arg4, arg5);
					MKWUPJYP var17 = MKWUPJYP.method365(var13);
					if (var17.field980 + arg5 > 103 || var17.field980 + arg4 > 103 || var17.field975 + arg5 > 103 || var17.field975 + arg4 > 103) {
						return;
					}

					if (var17.field940) {
						field225[arg3].method543(arg5, arg4, var15, var17.field957, var17.field975, var17.field980);
					}
				}

				if (arg0 == 3) {
					field207.method329(arg5, arg4, arg3);
					MKWUPJYP var18 = MKWUPJYP.method365(var13);
					if (var18.field940 && var18.field948) {
						field225[arg3].method545(arg4, arg5);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field392[1][arg5][arg4] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				PMCVBMMY.method425(arg6, field207, field64, arg1, field225[arg3], arg4, arg2, arg5, arg3, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIBIILEKHKDMUP;III)V")
	public final void method89(int arg0, int arg1, int arg2, int arg3, EKHKDMUP arg4, int arg5, int arg6, int arg7) {
		if (field236) {
			field383 = 32;
		} else {
			field383 = 0;
		}

		field236 = false;
		if (arg7 >= arg3 && arg7 < arg3 + 16 && arg5 >= arg6 && arg5 < arg6 + 16) {
			arg4.field596 -= field251 * 4;

			if (arg1 == 1) {
				field384 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field303 = true;
			}
		} else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg5 >= arg2 + arg6 - 16 && arg5 < arg2 + arg6) {
			arg4.field596 += field251 * 4;

			if (arg1 == 1) {
				field384 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field303 = true;
			}
		} else if (arg7 >= arg3 - field383 && arg7 < arg3 + field383 + 16 && arg5 >= arg6 + 16 && arg5 < arg2 + arg6 - 16 && field251 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg6 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg4.field596 = (arg0 - arg2) * var10 / var11;

			if (arg1 == 1) {
				field384 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field303 = true;
			}

			field236 = true;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method90() {
		int var1 = field376;
		int var2 = field377;
		int var3 = field378;
		int var4 = field379;
		int var5 = 0x5D5447;
		JNJDBENA.method288(var1, var2, var3, var5, var4);
		JNJDBENA.method288(var1 + 1, var2 + 1, var3 - 2, 0, 16);
		JNJDBENA.method289(var1 + 1, var3 - 2, var2 + 18, 0, var4 - 19);
		field417.method477(var5, "Choose Option", var2 + 14, var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field375 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field375 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field375 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field389; var8++) {
			int var9 = (field389 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field417.method481(var1 + 3, field227[var8], var10, var9, true);
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method91() {
		int var1 = 5;
		field476[8] = 0;
		int var2 = 0;
		while (field476[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method63("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 345);
				GHHPHSRU var5 = new GHHPHSRU(new byte[40]);
				var4.readFully(var5.field666, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field476[var6] = var5.method207();
				}

				int var7 = var5.method207();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field476[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field476[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field476[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field476[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field476[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field476[8] == 0) {
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

				field74 = !field74;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method92(int arg0) {
		EKHKDMUP.method183(arg0);
	}

	@ObfuscatedName("client.m(B)V")
	public final void method93() {
		field70++;
		method106(true);
		method70(true);
		method106(false);
		method70(false);
		method95();
		method51();

		if (!field355) {
			int var1 = field430;
			if (field299 / 256 > var1) {
				var1 = field299 / 256;
			}

			if (field204[4] && field83[4] + 128 > var1) {
				var1 = field83[4] + 128;
			}

			int var2 = field431 + field385 & 0x7FF;
			method50(var2, method34(field65.field742, field91, field65.field741) - 50, field349, var1 * 3 + 600, var1, field348);
		}

		int var3;
		if (field355) {
			var3 = method47();
		} else {
			var3 = method46();
		}

		int var4 = field286;
		int var5 = field287;
		int var6 = field288;
		int var7 = field289;
		int var8 = field290;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field204[var9]) {
				int var10 = (int) (Math.random() * (field190[var9] * 2 + 1) + Math.sin(field223[var9] / 100.0D * field297[var9]) * field83[var9] - field190[var9]);
				if (var9 == 0) {
					field286 += var10;
				}

				if (var9 == 1) {
					field287 += var10;
				}

				if (var9 == 2) {
					field288 += var10;
				}

				if (var9 == 3) {
					field290 = field290 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field289 += var10;
					if (field289 < 128) {
						field289 = 128;
					}

					if (field289 > 383) {
						field289 = 383;
					}
				}
			}
		}

		int var11 = QAMTFDSD.field1161;
		OQIGXOFQ.field1092 = true;
		OQIGXOFQ.field1095 = 0;
		OQIGXOFQ.field1093 = field17 - 4;
		OQIGXOFQ.field1094 = field18 - 4;
		JNJDBENA.method286();
		field207.method348(field287, field290, field288, var3, field289, field286);
		field207.method323();
		method53();
		method145();
		method43(var11);
		method151();
		field149.method493(4, 4, field9);
		field286 = var4;
		field287 = var5;
		field288 = var6;
		field289 = var7;
		field290 = var8;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method94(boolean arg0) {
		method20();
		field267.method492();
		field145.method300(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field152 == 0) {
			int var4 = var3 / 2 + 80;
			field415.method474(true, 0x75A9A9, var4, field73.field1422, var2 / 2);
			int var5 = var3 / 2 - 20;
			field417.method474(true, 0xFFFF00, var5, "Welcome to RuneScape", var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field146.method300(var7 - 20, var6 - 73);
			field417.method474(true, 0xFFFFFF, var7 + 5, "New User", var6);
			int var8 = var2 / 2 + 80;
			field146.method300(var7 - 20, var8 - 73);
			field417.method474(true, 0xFFFFFF, var7 + 5, "Existing User", var8);
		}

		if (field152 == 2) {
			int var9 = var3 / 2 - 40;
			if (field292.length() > 0) {
				field417.method474(true, 0xFFFF00, var9 - 15, field292, var2 / 2);
				field417.method474(true, 0xFFFF00, var9, field293, var2 / 2);
				var9 += 30;
			} else {
				field417.method474(true, 0xFFFF00, var9 - 7, field293, var2 / 2);
				var9 += 30;
			}

			field417.method481(var2 / 2 - 90, "Username: " + field92 + (field282 == 0 & field372 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, true);
			var9 += 15;
			field417.method481(var2 / 2 - 88, "Password: " + VSUIHULP.method515(field93) + (field282 == 1 & field372 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field146.method300(var11 - 20, var10 - 73);
				field417.method474(true, 0xFFFFFF, var11 + 5, "Login", var10);
				int var12 = var2 / 2 + 80;
				field146.method300(var11 - 20, var12 - 73);
				field417.method474(true, 0xFFFFFF, var11 + 5, "Cancel", var12);
			}
		}

		if (field152 == 3) {
			field417.method474(true, 0xFFFF00, var3 / 2 - 60, "Create a free account", var2 / 2);
			int var13 = var3 / 2 - 35;
			field417.method474(true, 0xFFFFFF, var13, "To create a new account you need to", var2 / 2);
			var13 += 15;
			field417.method474(true, 0xFFFFFF, var13, "go back to the main RuneScape webpage", var2 / 2);
			var13 += 15;
			field417.method474(true, 0xFFFFFF, var13, "and choose the 'create account'", var2 / 2);
			var13 += 15;
			field417.method474(true, 0xFFFFFF, var13, "button near the top of that page.", var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field146.method300(var15 - 20, var14 - 73);
			field417.method474(true, 0xFFFFFF, var15 + 5, "Cancel", var14);
		}

		field267.method493(171, 202, field9);

		if (field276) {
			field276 = false;
			field265.method493(0, 128, field9);
			field266.method493(371, 202, field9);
			field270.method493(265, 0, field9);
			field271.method493(265, 562, field9);
			field272.method493(171, 128, field9);
			field273.method493(171, 562, field9);
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method10() {
		field276 = true;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method95() {
		for (SCWHDOGN var1 = (SCWHDOGN) field347.method519(); var1 != null; var1 = (SCWHDOGN) field347.method521()) {
			if (field91 != var1.field1235 || field372 > var1.field1244) {
				var1.method19();
			} else if (field372 >= var1.field1243) {
				if (var1.field1254 > 0) {
					LJAXEEYT var2 = field361[var1.field1254 - 1];
					if (var2 != null && var2.field741 >= 0 && var2.field741 < 13312 && var2.field742 >= 0 && var2.field742 < 13312) {
						var1.method471(method34(var2.field742, var1.field1235, var2.field741) - var1.field1242, field372, var2.field742, var2.field741);
					}
				}

				if (var1.field1254 < 0) {
					int var3 = -var1.field1254 - 1;
					EJJAKGTE var4;
					if (field443 == var3) {
						var4 = field65;
					} else {
						var4 = field400[var3];
					}

					if (var4 != null && var4.field741 >= 0 && var4.field741 < 13312 && var4.field742 >= 0 && var4.field742 < 13312) {
						var1.method471(method34(var4.field742, var1.field1235, var4.field741) - var1.field1242, field372, var4.field742, var4.field741);
					}
				}

				var1.method470(field305);
				field207.method320(var1, (int) var1.field1248, (int) var1.field1249, -1, (int) var1.field1250, false, 60, var1.field1246, field91);
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method96() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field234) {
			field63 = false;
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

		if (field226) {
			field63 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field320) {
			field63 = false;
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

	@ObfuscatedName("client.a(IZLGHHPHSRU;)V")
	public final void method97(int arg0, GHHPHSRU arg1) {
		arg1.method212();
		int var3 = arg1.method213(8);
		if (var3 < field362) {
			for (int var4 = var3; var4 < field362; var4++) {
				field424[field423++] = field363[var4];
			}
		}

		if (var3 > field362) {
			signlink.reporterror(field92 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field362 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field363[var5];
			LJAXEEYT var7 = field361[var6];
			int var8 = arg1.method213(1);
			if (var8 == 0) {
				field363[field362++] = var6;
				var7.field752 = field372;
			} else {
				int var9 = arg1.method213(2);
				if (var9 == 0) {
					field363[field362++] = var6;
					var7.field752 = field372;
					field404[field403++] = var6;
				} else if (var9 == 1) {
					field363[field362++] = var6;
					var7.field752 = field372;
					int var10 = arg1.method213(3);
					var7.method241(false, var10);
					int var11 = arg1.method213(1);
					if (var11 == 1) {
						field404[field403++] = var6;
					}
				} else if (var9 == 2) {
					field363[field362++] = var6;
					var7.field752 = field372;
					int var12 = arg1.method213(3);
					var7.method241(true, var12);
					int var13 = arg1.method213(3);
					var7.method241(true, var13);
					int var14 = arg1.method213(1);
					if (var14 == 1) {
						field404[field403++] = var6;
					}
				} else if (var9 == 3) {
					field424[field423++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method98() {
		field313 = 0;
		int var1 = (field65.field741 >> 7) + field99;
		int var2 = (field65.field742 >> 7) + field100;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field313 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field313 = 1;
		}

		if (field313 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field313 = 0;
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method99() {
		for (int var1 = -1; var1 < field401; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field399;
			} else {
				var2 = field402[var1];
			}

			EJJAKGTE var3 = field400[var2];
			if (var3 != null) {
				method124(1, var3);
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method100(int arg0) {
		EKHKDMUP var2 = EKHKDMUP.method174(arg0);
		for (int var3 = 0; var3 < var2.field581.length && var2.field581[var3] != -1; var3++) {
			EKHKDMUP var4 = EKHKDMUP.method174(var2.field581[var3]);
			if (var4.field625 == 1) {
				method100(var4.field632);
			}

			var4.field644 = 0;
			var4.field622 = 0;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method101(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field228; var3++) {
				if (field209[var3] == arg0) {
					field228--;
					field384 = true;

					for (int var4 = var3; var4 < field228; var4++) {
						field179[var4] = field179[var4 + 1];
						field180[var4] = field180[var4 + 1];
						field209[var4] = field209[var4 + 1];
					}

					field343.method191(250);
					field343.method198(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field308.method300(arg2, arg1);
		field309.method300(arg0 + arg2 - 16, arg1);
		JNJDBENA.method288(arg1, arg2 + 16, 16, field82, arg0 - 32);
		int var6 = (arg0 - 32) * arg0 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg3 / (arg4 - arg0);
		JNJDBENA.method288(arg1, arg2 + var7 + 16, 16, field373, var6);
		JNJDBENA.method293(var6, field211, arg1, arg2 + var7 + 16);
		JNJDBENA.method293(var6, field211, arg1 + 1, arg2 + 16 + var7);
		JNJDBENA.method291(arg1, 16, field211, arg2 + var7 + 16);
		JNJDBENA.method291(arg1, 16, field211, arg2 + var7 + 17);
		JNJDBENA.method293(var6, field370, arg1 + 15, arg2 + 16 + var7);
		JNJDBENA.method293(var6 - 1, field370, arg1 + 14, arg2 + 17 + var7);
		JNJDBENA.method291(arg1, 16, field370, arg2 + var7 + var6 + 15);
		JNJDBENA.method291(arg1 + 1, 15, field370, arg2 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.a(LKZTQXFDC;I)V")
	public final void method103(KZTQXFDC arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field186.length; var3++) {
			field186[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field186[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field187[var9] = (field186[var9 - 1] + field186[var9 + 1] + field186[var9 - 128] + field186[var9 + 128]) / 4;
				}
			}

			int[] var10 = field186;
			field186 = field187;
			field187 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field851; var12++) {
				for (int var13 = 0; var13 < arg0.field850; var13++) {
					if (arg0.field848[var11++] != 0) {
						int var14 = var13 + arg0.field852 + 16;
						int var15 = var12 + arg0.field853 + 16;
						int var16 = (var15 << 7) + var14;
						field186[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)Z")
	public final boolean method104(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field207.method339(field91, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			MKWUPJYP var8 = MKWUPJYP.method365(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field980;
				var10 = var8.field975;
			} else {
				var9 = var8.field975;
				var10 = var8.field980;
			}

			int var11 = var8.field941;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method64(arg0, 0, arg2, var9, var11, 0, 2, false, field65.field732[0], var10, field65.field733[0]);
		} else {
			method64(arg0, var6 + 1, arg2, 0, 0, var7, 2, false, field65.field732[0], 0, field65.field733[0]);
		}

		field246 = field24;
		field247 = field25;
		field249 = 2;
		field248 = 0;
		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method105(String arg0) {
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

	@ObfuscatedName("client.b(ZZ)V")
	public final void method106(boolean arg0) {
		if (field65.field741 >> 7 == field425 && field65.field742 >> 7 == field426) {
			field425 = 0;
		}

		int var2 = field401;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			EJJAKGTE var4;
			int var5;
			if (arg0) {
				var4 = field65;
				var5 = field399 << 14;
			} else {
				var4 = field400[field402[var3]];
				var5 = field402[var3] << 14;
			}

			if (var4 != null && var4.method169()) {
				var4.field559 = false;
				if ((field240 && field401 > 50 || field401 > 200) && !arg0 && var4.field765 == var4.field729) {
					var4.field559 = true;
				}

				int var6 = var4.field741 >> 7;
				int var7 = var4.field742 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field558 == null || field372 < var4.field566 || field372 >= var4.field567) {
						if ((var4.field741 & 0x7F) == 0x40 && (var4.field742 & 0x7F) == 0x40) {
							if (field134[var6][var7] == field70) {
								continue;
							}

							field134[var6][var7] = field70;
						}

						var4.field571 = method34(var4.field742, field91, var4.field741);
						field207.method320(var4, var4.field741, var4.field742, var5, var4.field571, var4.field727, 60, var4.field743, field91);
					} else {
						var4.field559 = false;
						var4.field571 = method34(var4.field742, field91, var4.field741);
						field207.method321(var4.field743, var4.field563, var5, var4.field742, var4, field91, var4.field571, var4.field562, var4.field564, 60, var4.field561, var4.field741);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method107(int arg0) {
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

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field320 && !field234 && !field226) {
			field372++;

			if (field206) {
				method142();
			} else {
				method54();
			}

			method78();
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method108() {
		field148.method492();

		if (field205 == 2) {
			byte[] var1 = field76.field848;
			int[] var2 = JNJDBENA.field809;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field312.method380(field80, 25, 33, 25, 0, 0, 33, field431, 256, field490);
			field149.method492();
			QAMTFDSD.field1152 = field243;
		} else {
			int var5 = field431 + field143 & 0x7FF;
			int var6 = field65.field741 / 32 + 48;
			int var7 = 464 - field65.field742 / 32;
			field427.method380(field346, var6, 146, var7, 5, 25, 151, var5, field170 + 256, field307);
			field312.method380(field80, 25, 33, 25, 0, 0, 33, field431, 256, field490);

			for (int var8 = 0; var8 < field278; var8++) {
				int var9 = field279[var8] * 4 + 2 - field65.field741 / 32;
				int var10 = field280[var8] * 4 + 2 - field65.field742 / 32;
				method37(var10, field222[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					VYBZTNTY var13 = field141[field91][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field65.field741 / 32;
						int var15 = var12 * 4 + 2 - field65.field742 / 32;
						method37(var15, field451, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field362; var16++) {
				LJAXEEYT var17 = field361[field363[var16]];
				if (var17 != null && var17.method169()) {
					DDJHHGTJ var18 = var17.field856;
					if (var18.field518 != null) {
						var18 = var18.method164();
					}

					if (var18 != null && var18.field514 && var18.field497) {
						int var19 = var17.field741 / 32 - field65.field741 / 32;
						int var20 = var17.field742 / 32 - field65.field742 / 32;
						method37(var20, field452, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field401; var21++) {
				EJJAKGTE var22 = field400[field402[var21]];
				if (var22 != null && var22.method169()) {
					int var23 = var22.field741 / 32 - field65.field741 / 32;
					int var24 = var22.field742 / 32 - field65.field742 / 32;
					boolean var25 = false;
					long var26 = VSUIHULP.method510(var22.field552);
					for (int var28 = 0; var28 < field228; var28++) {
						if (field209[var28] == var26 && field180[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field65.field550 != 0 && var22.field550 != 0 && field65.field550 == var22.field550) {
						var29 = true;
					}

					if (var25) {
						method37(var24, field454, var23);
					} else if (var29) {
						method37(var24, field455, var23);
					} else {
						method37(var24, field453, var23);
					}
				}
			}

			if (field168 != 0 && field372 % 20 < 10) {
				if (field168 == 1 && field391 >= 0 && field391 < field361.length) {
					LJAXEEYT var30 = field361[field391];
					if (var30 != null) {
						int var31 = var30.field741 / 32 - field65.field741 / 32;
						int var32 = var30.field742 / 32 - field65.field742 / 32;
						method42(var31, field96, var32);
					}
				}

				if (field168 == 2) {
					int var33 = (field86 - field99) * 4 + 2 - field65.field741 / 32;
					int var34 = (field87 - field100) * 4 + 2 - field65.field742 / 32;
					method42(var33, field96, var34);
				}

				if (field168 == 10 && field458 >= 0 && field458 < field400.length) {
					EJJAKGTE var35 = field400[field458];
					if (var35 != null) {
						int var36 = var35.field741 / 32 - field65.field741 / 32;
						int var37 = var35.field742 / 32 - field65.field742 / 32;
						method42(var36, field96, var37);
					}
				}
			}

			if (field425 != 0) {
				int var38 = field425 * 4 + 2 - field65.field741 / 32;
				int var39 = field426 * 4 + 2 - field65.field742 / 32;
				method37(var39, field95, var38);
			}

			JNJDBENA.method288(97, 78, 3, 0xFFFFFF, 3);
			field149.method492();
			QAMTFDSD.field1152 = field243;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method109() {
		if (field183 == 0) {
			field227[0] = "Cancel";
			field317[0] = 1152;
			field389 = 1;
			if (field252 == -1) {
				method62();
				field387 = 0;
				field434 = 0;

				if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
					if (field69 == -1) {
						method156();
					} else {
						method117(0, 4, field17, field18, 4, 0, EKHKDMUP.method174(field69));
					}
				}

				if (field390 != field387) {
					field390 = field387;
				}

				if (field434 != field194) {
					field194 = field434;
				}

				field387 = 0;
				field434 = 0;

				if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
					if (field167 != -1) {
						method117(0, 553, field17, field18, 205, 1, EKHKDMUP.method174(field167));
					} else if (field479[field457] != -1) {
						method117(0, 553, field17, field18, 205, 1, EKHKDMUP.method174(field479[field457]));
					}
				}

				if (field387 != field345) {
					field384 = true;
					field345 = field387;
				}

				if (field434 != field135) {
					field384 = true;
					field135 = field434;
				}

				field387 = 0;
				field434 = 0;

				if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
					if (field59 != -1) {
						method117(0, 17, field17, field18, 357, 2, EKHKDMUP.method174(field59));
					} else if (field120 != -1) {
						method117(0, 17, field17, field18, 357, 3, EKHKDMUP.method174(field120));
					} else if (field18 < 434 && field17 < 426) {
						method81(field18 - 357, field17 - 17);
					}
				}

				if ((field59 != -1 || field120 != -1) && field387 != field323) {
					field303 = true;
					field323 = field387;
				}

				if ((field59 != -1 || field120 != -1) && field434 != field117) {
					field303 = true;
					field117 = field434;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field389 - 1; var2++) {
						if (field317[var2] < 1000 && field317[var2 + 1] > 1000) {
							String var3 = field227[var2];
							field227[var2] = field227[var2 + 1];
							field227[var2 + 1] = var3;
							int var4 = field317[var2];
							field317[var2] = field317[var2 + 1];
							field317[var2 + 1] = var4;
							int var5 = field315[var2];
							field315[var2] = field315[var2 + 1];
							field315[var2 + 1] = var5;
							int var6 = field316[var2];
							field316[var2] = field316[var2 + 1];
							field316[var2 + 1] = var6;
							int var7 = field318[var2];
							field318[var2] = field318[var2 + 1];
							field318[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field387 = 0;
				field434 = 0;
				method117(0, 0, field17, field18, 0, 0, EKHKDMUP.method174(field252));

				if (field390 != field387) {
					field390 = field387;
				}

				if (field434 != field194) {
					field194 = field434;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method110() {
		field132++;
		if (field132 > 90) {
			field132 = 0;
			field343.method191(238);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field69 != -1 && field78 == field69) {
						break;
					}

					if (field388) {
						if (var1 >= 32 && var1 <= 122 && field231.length() < 80) {
							field231 = field231 + (char) var1;
							field303 = true;
						}

						if (var1 == 8 && field231.length() > 0) {
							field231 = field231.substring(0, field231.length() - 1);
							field303 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field388 = false;
							field303 = true;

							if (field291 == 1) {
								long var2 = VSUIHULP.method510(field231);
								method138(var2);
							}

							if (field291 == 2 && field228 > 0) {
								long var4 = VSUIHULP.method510(field231);
								method101(var4);
							}

							if (field291 == 3 && field231.length() > 0) {
								field343.method191(44);
								field343.method192(0);
								int var6 = field343.field667;
								field343.method198(field371);
								QFWDHRAY.method465(field231, field343);
								field343.method201(field343.field667 - var6);
								field231 = QFWDHRAY.method466(field231);
								field231 = HGSXEUXP.method255(field231);
								method31(VSUIHULP.method514(VSUIHULP.method511(field371)), field231, 6);

								if (field311 == 2) {
									field311 = 1;
									field245 = true;
									field343.method191(198);
									field343.method192(field394);
									field343.method192(field311);
									field343.method192(field165);
								}
							}

							if (field291 == 4 && field188 < 100) {
								long var7 = VSUIHULP.method510(field231);
								method52(var7);
							}

							if (field291 == 5 && field188 > 0) {
								long var9 = VSUIHULP.method510(field231);
								method59(var9);
							}
						}
					} else if (field295 == 1) {
						if (var1 >= 48 && var1 <= 57 && field340.length() < 10) {
							field340 = field340 + (char) var1;
							field303 = true;
						}

						if (var1 == 8 && field340.length() > 0) {
							field340 = field340.substring(0, field340.length() - 1);
							field303 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field340.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field340);
								} catch (Exception var21) {
								}

								field343.method191(240);
								field343.method196(var11);
							}

							field295 = 0;
							field303 = true;
						}
					} else if (field295 == 2) {
						if (var1 >= 32 && var1 <= 122 && field340.length() < 12) {
							field340 = field340 + (char) var1;
							field303 = true;
						}

						if (var1 == 8 && field340.length() > 0) {
							field340 = field340.substring(0, field340.length() - 1);
							field303 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field340.length() > 0) {
								field343.method191(89);
								field343.method198(VSUIHULP.method510(field340));
							}

							field295 = 0;
							field303 = true;
						}
					} else if (field59 == -1 && field252 == -1) {
						if (var1 >= 32 && var1 <= 122 && field328.length() < 80) {
							field328 = field328 + (char) var1;
							field303 = true;
						}

						if (var1 == 8 && field328.length() > 0) {
							field328 = field328.substring(0, field328.length() - 1);
							field303 = true;
						}

						if ((var1 == 13 || var1 == 10) && field328.length() > 0) {
							if (field468 == 2) {
								if (field328.equals("::clientdrop")) {
									method74();
								}

								if (field328.equals("::lag")) {
									method116();
								}

								if (field328.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field73.method563(2); var12++) {
										field73.method569(2, (byte) 1, var12);
									}
								}

								if (field328.equals("::fpson")) {
									field440 = true;
								}

								if (field328.equals("::fpsoff")) {
									field440 = false;
								}

								if (field328.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field225[var13].field1394[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field328.startsWith("::")) {
								field343.method191(221);
								field343.method192(field328.length() - 1);
								field343.method199(field328.substring(2));
							} else {
								String var16 = field328.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field328 = field328.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field328 = field328.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field328 = field328.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field328 = field328.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field328 = field328.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field328 = field328.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field328 = field328.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field328 = field328.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field328 = field328.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field328 = field328.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field328 = field328.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field328 = field328.substring(6);
								}

								String var18 = field328.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field328 = field328.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field328 = field328.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field328 = field328.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field328 = field328.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field328 = field328.substring(6);
								}

								field343.method191(204);
								field343.method192(0);
								int var20 = field343.field667;
								field343.method218(var17);
								field360.field667 = 0;
								QFWDHRAY.method465(field328, field360);
								field343.method238(field360.field666, 0, field360.field667);
								field343.method192(var19);
								field343.method201(field343.field667 - var20);
								field328 = QFWDHRAY.method466(field328);
								field328 = HGSXEUXP.method255(field328);
								field65.field734 = field328;
								field65.field761 = var17;
								field65.field780 = var19;
								field65.field728 = 150;

								if (field468 == 2) {
									method31("@cr2@" + field65.field552, field65.field734, 2);
								} else if (field468 == 1) {
									method31("@cr1@" + field65.field552, field65.field734, 2);
								} else {
									method31(field65.field552, field65.field734, 2);
								}

								if (field394 == 2) {
									field394 = 3;
									field245 = true;
									field343.method191(198);
									field343.method192(field394);
									field343.method192(field311);
									field343.method192(field165);
								}
							}

							field328 = "";
							field303 = true;
						}
					}
				}

				if (var1 == 8 && field72.length() > 0) {
					field72 = field72.substring(0, field72.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field72.length() < 12) {
				field72 = field72 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method111() {
		short var1 = 256;

		if (field130 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field130 > 768) {
					field55[var2] = method139(field57[var2], field56[var2], 1024 - field130);
				} else if (field130 > 256) {
					field55[var2] = field57[var2];
				} else {
					field55[var2] = method139(field56[var2], field57[var2], 256 - field130);
				}
			}
		} else if (field131 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field131 > 768) {
					field55[var3] = method139(field58[var3], field56[var3], 1024 - field131);
				} else if (field131 > 256) {
					field55[var3] = field58[var3];
				} else {
					field55[var3] = method139(field56[var3], field58[var3], 256 - field131);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field55[var4] = field56[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field268.field1278[var5] = field213.field995[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field478[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field336[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field55[var12];
					int var15 = field268.field1278[var7];
					field268.field1278[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field268.method493(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field269.field1278[var16] = field214.field995[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field478[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field336[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field55[var23];
					int var26 = field269.field1278[var18];
					field269.field1278[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field269.method493(0, 637, field9);
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method112() {
		if (field389 >= 2 || field445 != 0 || field332 != 0) {
			String var1;
			if (field445 == 1 && field389 < 2) {
				var1 = "Use " + field449 + " with...";
			} else if (field332 == 1 && field389 < 2) {
				var1 = field335 + "...";
			} else {
				var1 = field227[field389 - 1];
			}

			if (field389 > 2) {
				var1 = var1 + "@whi@ / " + (field389 - 2) + " more options";
			}

			field417.method482(field372 / 1000, 0xFFFFFF, true, 4, var1, 15);
		}
	}

	@ObfuscatedName("client.b(LEKHKDMUP;B)V")
	public final void method113(EKHKDMUP arg0) {
		int var2 = arg0.field631;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field229 == 0) {
				arg0.field612 = "Loading friend list";
				arg0.field636 = 0;
			} else if (var2 == 1 && field229 == 1) {
				arg0.field612 = "Connecting to friendserver";
				arg0.field636 = 0;
			} else if (var2 == 2 && field229 != 2) {
				arg0.field612 = "Please wait...";
				arg0.field636 = 0;
			} else {
				int var3 = field228;
				if (field229 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field612 = "";
					arg0.field636 = 0;
				} else {
					arg0.field612 = field179[var2];
					arg0.field636 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field228;
			if (field229 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field612 = "";
				arg0.field636 = 0;
			} else {
				if (field180[var2] == 0) {
					arg0.field612 = "@red@Offline";
				} else if (field180[var2] < 200) {
					if (field180[var2] == field237) {
						arg0.field612 = "@gre@World-" + (field180[var2] - 9);
					} else {
						arg0.field612 = "@yel@World-" + (field180[var2] - 9);
					}
				} else if (field180[var2] == field237) {
					arg0.field612 = "@gre@Classic" + (field180[var2] - 219);
				} else {
					arg0.field612 = "@yel@Classic" + (field180[var2] - 219);
				}

				arg0.field636 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field228;
			if (field229 != 2) {
				var5 = 0;
			}

			arg0.field576 = var5 * 15 + 20;
			if (arg0.field576 <= arg0.field609) {
				arg0.field576 = arg0.field609 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field229 == 0) {
				arg0.field612 = "Loading ignore list";
				arg0.field636 = 0;
			} else if (var2 == 1 && field229 == 0) {
				arg0.field612 = "Please wait...";
				arg0.field636 = 0;
			} else {
				int var6 = field188;
				if (field229 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field612 = "";
					arg0.field636 = 0;
				} else {
					arg0.field612 = VSUIHULP.method514(VSUIHULP.method511(field429[var2]));
					arg0.field636 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field576 = field188 * 15 + 20;
			if (arg0.field576 <= arg0.field609) {
				arg0.field576 = arg0.field609 + 1;
			}
		} else if (var2 == 327) {
			arg0.field614 = 150;
			arg0.field615 = (int) (Math.sin(field372 / 40.0D) * 256.0D) & 0x7FF;

			if (field159) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field342[var7];
					if (var8 >= 0 && !FGIDBWCJ.field647[var8].method186()) {
						return;
					}
				}

				field159 = false;
				OQIGXOFQ[] var9 = new OQIGXOFQ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field342[var11];
					if (var12 >= 0) {
						var9[var10++] = FGIDBWCJ.field647[var12].method187();
					}
				}

				OQIGXOFQ var13 = new OQIGXOFQ(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field193[var14] != 0) {
						var13.method405(field444[var14][0], field444[var14][field193[var14]]);

						if (var14 == 1) {
							var13.method405(field380[0], field380[field193[var14]]);
						}
					}
				}

				var13.method398();
				var13.method399(VYCKCNXO.field1339[field65.field765].field1341[0]);
				var13.method408(64, 850, -30, -50, -30, true);
				arg0.field587 = 5;
				arg0.field588 = 0;
				EKHKDMUP.method175(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field353 == null) {
				field353 = arg0.field621;
				field354 = arg0.field629;
			}

			if (field357) {
				arg0.field621 = field354;
			} else {
				arg0.field621 = field353;
			}
		} else if (var2 == 325) {
			if (field353 == null) {
				field353 = arg0.field621;
				field354 = arg0.field629;
			}

			if (field357) {
				arg0.field621 = field353;
			} else {
				arg0.field621 = field354;
			}
		} else if (var2 == 600) {
			arg0.field612 = field72;
			if (field372 % 20 < 10) {
				arg0.field612 = arg0.field612 + "|";
			} else {
				arg0.field612 = arg0.field612 + " ";
			}
		} else if (var2 == 620) {
			if (field468 < 1) {
				arg0.field612 = "";
			} else if (field128) {
				arg0.field624 = 0xFF0000;
				arg0.field612 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field624 = 0xFFFFFF;
				arg0.field612 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field467 - field174;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field612 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field195 == 0) {
				arg0.field612 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field195 <= field467) {
				arg0.field612 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method114(field195);
			} else {
				int var17 = field467 + 14 - field195;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field612 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method114(field195) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field319 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field319 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field319 + " unread messages";
			}

			arg0.field612 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field441 > 0 && field441 <= field467 + 10) {
				arg0.field612 = "Last password change:\\n@gre@" + method114(field441);
			} else {
				arg0.field612 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field374 == 0) {
				arg0.field612 = "You have not yet set\\nany contact details.";
			}

			if (field374 == 1) {
				arg0.field612 = "Contact Details Last Set:\\n@gre@" + method114(field368);
			}

			if (field374 == 2) {
				arg0.field612 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field97 > 2 && !field239) {
				arg0.field612 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field97 > 2) {
				arg0.field612 = "\\n\\nYou have @gre@" + field97 + "@yel@ days of\\nmember credit remaining.";
			} else if (field97 > 0) {
				arg0.field612 = "You have @gre@" + field97 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field612 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field97 > 2 && !field239) {
				arg0.field612 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field97 > 0) {
				arg0.field612 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field612 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field195 > field467) {
				arg0.field612 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field612 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public final String method114(int arg0) {
		if (arg0 > field467 + 10) {
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

	@ObfuscatedName("client.s(B)V")
	public final void method115() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field336[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field336[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field337[var10] = (field336[var10 - 1] + field336[var10 + 1] + field336[var10 - 128] + field336[var10 + 128]) / 4;
			}
		}

		field103 += 128;
		if (field103 > field186.length) {
			field103 -= field186.length;
			int var11 = (int) (Math.random() * 12.0D);
			method103(field464[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field337[var14 + 128] - field186[field103 + var14 & field186.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field336[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field478[var16] = field478[var16 + 1];
		}

		field478[var1 - 1] = (int) (Math.sin(field372 / 14.0D) * 16.0D + Math.sin(field372 / 15.0D) * 14.0D + Math.sin(field372 / 16.0D) * 12.0D);

		if (field130 > 0) {
			field130 -= 4;
		}

		if (field131 > 0) {
			field131 -= 4;
		}

		if (field130 == 0 && field131 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field130 = 1024;
			}

			if (var17 == 1) {
				field131 = 1024;
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

	@ObfuscatedName("client.t(B)V")
	public void method116() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field201);

		if (field73 != null) {
			System.out.println("Od-cycle:" + field73.field1432);
		}

		System.out.println("loop-cycle:" + field372);
		System.out.println("draw-cycle:" + field285);
		System.out.println("ptype:" + field216);
		System.out.println("psize:" + field215);

		if (field115 != null) {
			field115.method588();
		}

		field6 = true;
	}

	@ObfuscatedName("client.e(B)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.a(IIIIIIILEKHKDMUP;)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, EKHKDMUP arg6) {
		if (arg6.field625 == 0 && arg6.field581 != null && !arg6.field617 && (arg2 >= arg1 && arg3 >= arg4 && arg2 <= arg6.field583 + arg1 && arg3 <= arg6.field609 + arg4)) {
			int var8 = arg6.field581.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg6.field598[var9] + arg1;
				int var11 = arg6.field600[var9] + arg4 - arg0;
				EKHKDMUP var12 = EKHKDMUP.method174(arg6.field581[var9]);
				var10 += var12.field584;
				var11 += var12.field585;
				if ((var12.field594 >= 0 || var12.field637 != 0) && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
					if (var12.field594 >= 0) {
						field387 = var12.field594;
					} else {
						field387 = var12.field632;
					}
				}

				if (var12.field625 == 8 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
					field434 = var12.field632;
				}

				if (var12.field625 == 0) {
					method117(var12.field596, var10, arg2, arg3, var11, arg5, var12);

					if (var12.field576 > var12.field609) {
						method89(var12.field576, arg5, var12.field609, var12.field583 + var10, var12, arg3, var11, arg2);
					}
				} else {
					if (var12.field636 == 1 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						boolean var13 = false;
						if (var12.field631 != 0) {
							var13 = method67(var12);
						}

						if (!var13) {
							field227[field389] = var12.field603;
							field317[field389] = 663;
							field316[field389] = var12.field632;
							field389++;
						}
					}

					if (var12.field636 == 2 && field332 == 0 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						String var14 = var12.field595;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field227[field389] = var14 + " @gre@" + var12.field575;
						field317[field389] = 896;
						field316[field389] = var12.field632;
						field389++;
					}

					if (var12.field636 == 3 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						field227[field389] = "Close";

						if (arg5 == 3) {
							field317[field389] = 951;
						} else {
							field317[field389] = 838;
						}

						field316[field389] = var12.field632;
						field389++;
					}

					if (var12.field636 == 4 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						field227[field389] = var12.field603;
						field317[field389] = 241;
						field316[field389] = var12.field632;
						field389++;
					}

					if (var12.field636 == 5 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						field227[field389] = var12.field603;
						field317[field389] = 507;
						field316[field389] = var12.field632;
						field389++;
					}

					if (var12.field636 == 6 && !field235 && arg2 >= var10 && arg3 >= var11 && arg2 < var12.field583 + var10 && arg3 < var12.field609 + var11) {
						field227[field389] = var12.field603;
						field317[field389] = 338;
						field316[field389] = var12.field632;
						field389++;
					}

					if (var12.field625 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field609; var16++) {
							for (int var17 = 0; var17 < var12.field583; var17++) {
								int var18 = (var12.field639 + 32) * var17 + var10;
								int var19 = (var12.field638 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field645[var15];
									var19 += var12.field601[var15];
								}

								if (arg2 >= var18 && arg3 >= var19 && arg2 < var18 + 32 && arg3 < var19 + 32) {
									field469 = var15;
									field470 = var12.field632;

									if (var12.field574[var15] > 0) {
										ZKNJTNWP var20 = ZKNJTNWP.method590(var12.field574[var15] - 1);
										if (field445 == 1 && var12.field608) {
											if (field447 != var12.field632 || field446 != var15) {
												field227[field389] = "Use " + field449 + " with @lre@" + var20.field1482;
												field317[field389] = 775;
												field318[field389] = var20.field1485;
												field315[field389] = var15;
												field316[field389] = var12.field632;
												field389++;
											}
										} else if (field332 != 1 || !var12.field608) {
											if (var12.field608) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1493 != null && var20.field1493[var21] != null) {
														field227[field389] = var20.field1493[var21] + " @lre@" + var20.field1482;

														if (var21 == 3) {
															field317[field389] = 68;
														}

														if (var21 == 4) {
															field317[field389] = 910;
														}

														field318[field389] = var20.field1485;
														field315[field389] = var15;
														field316[field389] = var12.field632;
														field389++;
													} else if (var21 == 4) {
														field227[field389] = "Drop @lre@" + var20.field1482;
														field317[field389] = 910;
														field318[field389] = var20.field1485;
														field315[field389] = var15;
														field316[field389] = var12.field632;
														field389++;
													}
												}
											}

											if (var12.field641) {
												field227[field389] = "Use @lre@" + var20.field1482;
												field317[field389] = 874;
												field318[field389] = var20.field1485;
												field315[field389] = var15;
												field316[field389] = var12.field632;
												field389++;
											}

											if (var12.field608 && var20.field1493 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1493[var22] != null) {
														field227[field389] = var20.field1493[var22] + " @lre@" + var20.field1482;

														if (var22 == 0) {
															field317[field389] = 17;
														}

														if (var22 == 1) {
															field317[field389] = 994;
														}

														if (var22 == 2) {
															field317[field389] = 840;
														}

														field318[field389] = var20.field1485;
														field315[field389] = var15;
														field316[field389] = var12.field632;
														field389++;
													}
												}
											}

											if (var12.field623 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field623[var23] != null) {
														field227[field389] = var12.field623[var23] + " @lre@" + var20.field1482;

														if (var23 == 0) {
															field317[field389] = 592;
														}

														if (var23 == 1) {
															field317[field389] = 637;
														}

														if (var23 == 2) {
															field317[field389] = 148;
														}

														if (var23 == 3) {
															field317[field389] = 708;
														}

														if (var23 == 4) {
															field317[field389] = 306;
														}

														field318[field389] = var20.field1485;
														field315[field389] = var15;
														field316[field389] = var12.field632;
														field389++;
													}
												}
											}

											field227[field389] = "Examine @lre@" + var20.field1482;
											field317[field389] = 1893;
											field318[field389] = var20.field1485;
											field315[field389] = var15;
											field316[field389] = var12.field632;
											field389++;
										} else if ((field334 & 0x10) == 0x10) {
											field227[field389] = field335 + " @lre@" + var20.field1482;
											field317[field389] = 39;
											field318[field389] = var20.field1485;
											field315[field389] = var15;
											field316[field389] = var12.field632;
											field389++;
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

	@ObfuscatedName("client.b(LGHHPHSRU;II)V")
	public final void method118(GHHPHSRU arg0, int arg1) {
		int var3 = arg0.method213(8);
		if (var3 < field401) {
			for (int var4 = var3; var4 < field401; var4++) {
				field424[field423++] = field402[var4];
			}
		}

		if (var3 > field401) {
			signlink.reporterror(field92 + " Too many players");
			throw new RuntimeException("eek");
		}

		field401 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field402[var5];
			EJJAKGTE var7 = field400[var6];
			int var8 = arg0.method213(1);
			if (var8 == 0) {
				field402[field401++] = var6;
				var7.field752 = field372;
			} else {
				int var9 = arg0.method213(2);
				if (var9 == 0) {
					field402[field401++] = var6;
					var7.field752 = field372;
					field404[field403++] = var6;
				} else if (var9 == 1) {
					field402[field401++] = var6;
					var7.field752 = field372;
					int var10 = arg0.method213(3);
					var7.method241(false, var10);
					int var11 = arg0.method213(1);
					if (var11 == 1) {
						field404[field403++] = var6;
					}
				} else if (var9 == 2) {
					field402[field401++] = var6;
					var7.field752 = field372;
					int var12 = arg0.method213(3);
					var7.method241(true, var12);
					int var13 = arg0.method213(3);
					var7.method241(true, var13);
					int var14 = arg0.method213(1);
					if (var14 == 1) {
						field404[field403++] = var6;
					}
				} else if (var9 == 3) {
					field424[field423++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method119(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	public final void run() {
		if (field344) {
			method40();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method120() {
		int var1 = field417.method475("Choose Option");
		for (int var2 = 0; var2 < field389; var2++) {
			int var3 = field417.method475(field227[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field389 * 15 + 21;
		if (field24 > 4 && field25 > 4 && field24 < 516 && field25 < 338) {
			int var5 = field24 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field25 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field264 = true;
			field375 = 0;
			field376 = var5;
			field377 = var6;
			field378 = var1;
			field379 = field389 * 15 + 22;
		}

		if (field24 > 553 && field25 > 205 && field24 < 743 && field25 < 466) {
			int var7 = field24 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field25 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field264 = true;
			field375 = 1;
			field376 = var7;
			field377 = var8;
			field378 = var1;
			field379 = field389 * 15 + 22;
		}

		if (field24 > 17 && field25 > 357 && field24 < 496 && field25 < 453) {
			int var9 = field24 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field25 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field264 = true;
			field375 = 2;
			field376 = var9;
			field377 = var10;
			field378 = var1;
			field379 = field389 * 15 + 22;
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method121() {
		if (field10 == null) {
			method86();
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field272 = null;
			field273 = null;
			field150 = null;
			field148 = null;
			field147 = null;
			field149 = null;
			field66 = null;
			field67 = null;
			field68 = null;
			field10 = new TZRNBMTC(765, method11(), 503);
			field276 = true;
		}
	}

	@ObfuscatedName("client.a(IIILEKHKDMUP;I)V")
	public final void method122(int arg0, int arg1, EKHKDMUP arg2, int arg3) {
		if (arg2.field625 == 0 && arg2.field581 != null && (!arg2.field617 || field390 == arg2.field632 || field345 == arg2.field632 || field323 == arg2.field632)) {
			int var5 = JNJDBENA.field814;
			int var6 = JNJDBENA.field812;
			int var7 = JNJDBENA.field815;
			int var8 = JNJDBENA.field813;
			JNJDBENA.method285(arg0, arg1, arg2.field609 + arg1, arg2.field583 + arg0);
			int var9 = arg2.field581.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field598[var10] + arg0;
				int var12 = arg2.field600[var10] + arg1 - arg3;
				EKHKDMUP var13 = EKHKDMUP.method174(arg2.field581[var10]);
				var11 += var13.field584;
				var12 += var13.field585;

				if (var13.field631 > 0) {
					method113(var13);
				}

				if (var13.field625 == 0) {
					if (var13.field596 > var13.field576 - var13.field609) {
						var13.field596 = var13.field576 - var13.field609;
					}

					if (var13.field596 < 0) {
						var13.field596 = 0;
					}

					method122(var11, var12, var13, var13.field596);

					if (var13.field576 > var13.field609) {
						method102(var13.field609, var13.field583 + var11, var12, var13.field596, var13.field576);
					}
				} else if (var13.field625 != 1) {
					if (var13.field625 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field609; var15++) {
							for (int var16 = 0; var16 < var13.field583; var16++) {
								int var17 = (var13.field639 + 32) * var16 + var11;
								int var18 = (var13.field638 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field645[var14];
									var18 += var13.field601[var14];
								}

								if (var13.field574[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field574[var14] - 1;
									if (var17 > JNJDBENA.field814 - 32 && var17 < JNJDBENA.field815 && var18 > JNJDBENA.field812 - 32 && var18 < JNJDBENA.field813 || field183 != 0 && field182 == var14) {
										int var22 = 0;
										if (field445 == 1 && field446 == var14 && field447 == var13.field632) {
											var22 = 0xFFFFFF;
										}

										NUXITFPR var23 = ZKNJTNWP.method592(var22, var13.field633[var14], var21);
										if (var23 != null) {
											if (field183 != 0 && field182 == var14 && field181 == var13.field632) {
												var19 = field17 - field184;
												var20 = field18 - field185;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field456 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method378(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < JNJDBENA.field812 && arg2.field596 > 0) {
													int var24 = (JNJDBENA.field812 - var18 - var20) * field305 / 3;
													if (var24 > field305 * 10) {
														var24 = field305 * 10;
													}

													if (var24 > arg2.field596) {
														var24 = arg2.field596;
													}

													arg2.field596 -= var24;
													field185 += var24;
												}

												if (var18 + var20 + 32 > JNJDBENA.field813 && arg2.field596 < arg2.field576 - arg2.field609) {
													int var25 = (var18 + var20 + 32 - JNJDBENA.field813) * field305 / 3;
													if (var25 > field305 * 10) {
														var25 = field305 * 10;
													}

													if (var25 > arg2.field576 - arg2.field609 - arg2.field596) {
														var25 = arg2.field576 - arg2.field609 - arg2.field596;
													}

													arg2.field596 += var25;
													field185 -= var25;
												}
											} else if (field163 != 0 && field162 == var14 && field161 == var13.field632) {
												var23.method378(var17, 128, var18);
											} else {
												var23.method376(var18, var17);
											}

											if (var23.field1000 == 33 || var13.field633[var14] != 1) {
												int var26 = var13.field633[var14];
												field415.method477(0, method39(var26), var18 + var20 + 10, var17 + 1 + var19);
												field415.method477(0xFFFF00, method39(var26), var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field619 != null && var14 < 20) {
									NUXITFPR var27 = var13.field619[var14];
									if (var27 != null) {
										var27.method376(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field625 == 3) {
						boolean var28 = false;
						if (field323 == var13.field632 || field345 == var13.field632 || field390 == var13.field632) {
							var28 = true;
						}

						int var29;
						if (method24(var13)) {
							var29 = var13.field593;
							if (var28 && var13.field592 != 0) {
								var29 = var13.field592;
							}
						} else {
							var29 = var13.field624;
							if (var28 && var13.field637 != 0) {
								var29 = var13.field637;
							}
						}

						if (var13.field606 == 0) {
							if (var13.field604) {
								JNJDBENA.method288(var11, var12, var13.field583, var29, var13.field609);
							} else {
								JNJDBENA.method289(var11, var13.field583, var12, var29, var13.field609);
							}
						} else if (var13.field604) {
							JNJDBENA.method287(256 - (var13.field606 & 0xFF), var13.field583, var29, var11, var12, var13.field609);
						} else {
							JNJDBENA.method290(256 - (var13.field606 & 0xFF), var13.field609, var13.field583, var12, var11, var29);
						}
					} else if (var13.field625 == 4) {
						THSQSAVT var30 = var13.field589;
						String var31 = var13.field612;
						boolean var32 = false;
						if (field323 == var13.field632 || field345 == var13.field632 || field390 == var13.field632) {
							var32 = true;
						}

						int var33;
						if (method24(var13)) {
							var33 = var13.field593;
							if (var32 && var13.field592 != 0) {
								var33 = var13.field592;
							}

							if (var13.field590.length() > 0) {
								var31 = var13.field590;
							}
						} else {
							var33 = var13.field624;
							if (var32 && var13.field637 != 0) {
								var33 = var13.field637;
							}
						}

						if (var13.field636 == 6 && field235) {
							var31 = "Please wait...";
							var33 = var13.field624;
						}

						if (JNJDBENA.field810 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1261 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method28(method23(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method28(method23(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method28(method23(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method28(method23(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method28(method23(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field586) {
								var30.method474(var13.field627, var33, var34, var41, var13.field583 / 2 + var11);
							} else {
								var30.method481(var11, var41, var33, var34, var13.field627);
							}

							var34 += var30.field1261;
						}
					} else if (var13.field625 == 5) {
						NUXITFPR var42;
						if (method24(var13)) {
							var42 = var13.field629;
						} else {
							var42 = var13.field621;
						}

						if (var42 != null) {
							var42.method376(var12, var11);
						}
					} else if (var13.field625 == 6) {
						int var43 = QAMTFDSD.field1146;
						int var44 = QAMTFDSD.field1147;
						QAMTFDSD.field1146 = var13.field583 / 2 + var11;
						QAMTFDSD.field1147 = var13.field609 / 2 + var12;
						int var45 = QAMTFDSD.field1150[var13.field614] * var13.field613 >> 16;
						int var46 = QAMTFDSD.field1151[var13.field614] * var13.field613 >> 16;
						boolean var47 = method24(var13);
						int var48;
						if (var47) {
							var48 = var13.field580;
						} else {
							var48 = var13.field579;
						}

						OQIGXOFQ var49;
						if (var48 == -1) {
							var49 = var13.method181(var47, -1, -1);
						} else {
							VYCKCNXO var50 = VYCKCNXO.field1339[var48];
							var49 = var13.method181(var47, var50.field1341[var13.field644], var50.field1342[var13.field644]);
						}

						if (var49 != null) {
							var49.method411(0, var13.field615, 0, var13.field614, 0, var45, var46);
						}

						QAMTFDSD.field1146 = var43;
						QAMTFDSD.field1147 = var44;
					} else {
						if (var13.field625 == 7) {
							THSQSAVT var51 = var13.field589;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field609; var53++) {
								for (int var54 = 0; var54 < var13.field583; var54++) {
									if (var13.field574[var52] > 0) {
										ZKNJTNWP var55 = ZKNJTNWP.method590(var13.field574[var52] - 1);
										String var56 = var55.field1482;
										if (var55.field1508 || var13.field633[var52] != 1) {
											var56 = var56 + " x" + method107(var13.field633[var52]);
										}

										int var57 = (var13.field639 + 115) * var54 + var11;
										int var58 = (var13.field638 + 12) * var53 + var12;
										if (var13.field586) {
											var51.method474(var13.field627, var13.field624, var58, var56, var13.field583 / 2 + var57);
										} else {
											var51.method481(var57, var56, var13.field624, var58, var13.field627);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field625 == 8 && (field117 == var13.field632 || field135 == var13.field632 || field194 == var13.field632) && field339 == 100) {
							int var59 = 0;
							int var60 = 0;
							THSQSAVT var61 = field416;
							String var62 = var13.field612;
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

								int var65 = var61.method475(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1261 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field583 + var11 - var59 - 5;
							int var67 = var13.field609 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field583 + arg0) {
								var66 = arg2.field583 + arg0 - var59;
							}

							JNJDBENA.method288(var66, var67, var59, 0xFFFFA0, var60);
							JNJDBENA.method289(var66, var59, var67, 0, var60);
							String var68 = var13.field612;
							int var69 = var61.field1261 + var67 + 2;
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

								var61.method481(var66 + 3, var71, 0, var69, false);
								var69 += var61.field1261 + 1;
							}
						}
					}
				}
			}

			JNJDBENA.method285(var5, var6, var8, var7);
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method123() {
		for (int var1 = 0; var1 < field362; var1++) {
			int var2 = field363[var1];
			LJAXEEYT var3 = field361[var2];
			if (var3 != null) {
				method124(var3.field856.field503, var3);
			}
		}
	}

	@ObfuscatedName("client.a(BILGSULPWKR;)V")
	public final void method124(int arg0, GSULPWKR arg1) {
		if (arg1.field741 < 128 || arg1.field742 < 128 || arg1.field741 >= 13184 || arg1.field742 >= 13184) {
			arg1.field736 = -1;
			arg1.field756 = -1;
			arg1.field748 = 0;
			arg1.field749 = 0;
			arg1.field741 = arg1.field732[0] * 128 + arg1.field753 * 64;
			arg1.field742 = arg1.field733[0] * 128 + arg1.field753 * 64;
			arg1.method244();
		}

		if (field65 == arg1 && (arg1.field741 < 1536 || arg1.field742 < 1536 || arg1.field741 >= 11776 || arg1.field742 >= 11776)) {
			arg1.field736 = -1;
			arg1.field756 = -1;
			arg1.field748 = 0;
			arg1.field749 = 0;
			arg1.field741 = arg1.field732[0] * 128 + arg1.field753 * 64;
			arg1.field742 = arg1.field733[0] * 128 + arg1.field753 * 64;
			arg1.method244();
		}

		if (arg1.field748 > field372) {
			method125(arg1);
		} else if (arg1.field749 >= field372) {
			method126(arg1);
		} else {
			method127(arg1);
		}

		method128(arg1);
		method129(arg1);
	}

	@ObfuscatedName("client.a(LGSULPWKR;Z)V")
	public final void method125(GSULPWKR arg0) {
		int var2 = arg0.field748 - field372;
		int var3 = arg0.field753 * 64 + arg0.field744 * 128;
		int var4 = arg0.field753 * 64 + arg0.field746 * 128;
		arg0.field741 += (var3 - arg0.field741) / var2;
		arg0.field742 += (var4 - arg0.field742) / var2;
		arg0.field755 = 0;

		if (arg0.field750 == 0) {
			arg0.field751 = 1024;
		}

		if (arg0.field750 == 1) {
			arg0.field751 = 1536;
		}

		if (arg0.field750 == 2) {
			arg0.field751 = 0;
		}

		if (arg0.field750 == 3) {
			arg0.field751 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLGSULPWKR;)V")
	public final void method126(GSULPWKR arg0) {
		if (field372 == arg0.field749 || arg0.field736 == -1 || arg0.field739 != 0 || arg0.field738 + 1 > VYCKCNXO.field1339[arg0.field736].method525(arg0.field737)) {
			int var2 = arg0.field749 - arg0.field748;
			int var3 = field372 - arg0.field748;
			int var4 = arg0.field753 * 64 + arg0.field744 * 128;
			int var5 = arg0.field753 * 64 + arg0.field746 * 128;
			int var6 = arg0.field753 * 64 + arg0.field745 * 128;
			int var7 = arg0.field753 * 64 + arg0.field747 * 128;
			arg0.field741 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field742 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field755 = 0;

		if (arg0.field750 == 0) {
			arg0.field751 = 1024;
		}

		if (arg0.field750 == 1) {
			arg0.field751 = 1536;
		}

		if (arg0.field750 == 2) {
			arg0.field751 = 0;
		}

		if (arg0.field750 == 3) {
			arg0.field751 = 512;
		}

		arg0.field743 = arg0.field751;
	}

	@ObfuscatedName("client.a(LGSULPWKR;I)V")
	public final void method127(GSULPWKR arg0) {
		arg0.field729 = arg0.field765;
		if (arg0.field762 == 0) {
			arg0.field755 = 0;
		} else {
			if (arg0.field736 != -1 && arg0.field739 == 0) {
				VYCKCNXO var2 = VYCKCNXO.field1339[arg0.field736];
				if (arg0.field763 > 0 && var2.field1351 == 0) {
					arg0.field755++;
					return;
				}

				if (arg0.field763 <= 0 && var2.field1352 == 0) {
					arg0.field755++;
					return;
				}
			}

			int var3 = arg0.field741;
			int var4 = arg0.field742;
			int var5 = arg0.field732[arg0.field762 - 1] * 128 + arg0.field753 * 64;
			int var6 = arg0.field733[arg0.field762 - 1] * 128 + arg0.field753 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field751 = 1280;
					} else if (var4 > var6) {
						arg0.field751 = 1792;
					} else {
						arg0.field751 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field751 = 768;
					} else if (var4 > var6) {
						arg0.field751 = 256;
					} else {
						arg0.field751 = 512;
					}
				} else if (var4 < var6) {
					arg0.field751 = 1024;
				} else {
					arg0.field751 = 0;
				}

				int var7 = arg0.field751 - arg0.field743 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field777;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field776;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field779;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field778;
				}

				if (var8 == -1) {
					var8 = arg0.field776;
				}

				arg0.field729 = var8;
				int var9 = 4;
				if (arg0.field751 != arg0.field743 && arg0.field770 == -1 && arg0.field764 != 0) {
					var9 = 2;
				}

				if (arg0.field762 > 2) {
					var9 = 6;
				}

				if (arg0.field762 > 3) {
					var9 = 8;
				}

				if (arg0.field755 > 0 && arg0.field762 > 1) {
					var9 = 8;
					arg0.field755--;
				}

				if (arg0.field781[arg0.field762 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field776 == arg0.field729 && arg0.field735 != -1) {
					arg0.field729 = arg0.field735;
				}

				if (var3 < var5) {
					arg0.field741 += var9;
					if (arg0.field741 > var5) {
						arg0.field741 = var5;
					}
				} else if (var3 > var5) {
					arg0.field741 -= var9;
					if (arg0.field741 < var5) {
						arg0.field741 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field742 += var9;
					if (arg0.field742 > var6) {
						arg0.field742 = var6;
					}
				} else if (var4 > var6) {
					arg0.field742 -= var9;
					if (arg0.field742 < var6) {
						arg0.field742 = var6;
					}
				}

				if (arg0.field741 == var5 && arg0.field742 == var6) {
					arg0.field762--;

					if (arg0.field763 > 0) {
						arg0.field763--;
						return;
					}
				}
			} else {
				arg0.field741 = var5;
				arg0.field742 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILGSULPWKR;)V")
	public final void method128(GSULPWKR arg0) {
		if (arg0.field764 != 0) {
			if (arg0.field770 != -1 && arg0.field770 < 32768) {
				LJAXEEYT var2 = field361[arg0.field770];
				if (var2 != null) {
					int var3 = arg0.field741 - var2.field741;
					int var4 = arg0.field742 - var2.field742;
					if (var3 != 0 || var4 != 0) {
						arg0.field751 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field770 >= 32768) {
				int var5 = arg0.field770 - 32768;
				if (field443 == var5) {
					var5 = field399;
				}

				EJJAKGTE var6 = field400[var5];
				if (var6 != null) {
					int var7 = arg0.field741 - var6.field741;
					int var8 = arg0.field742 - var6.field742;
					if (var7 != 0 || var8 != 0) {
						arg0.field751 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field771 != 0 || arg0.field772 != 0) && (arg0.field762 == 0 || arg0.field755 > 0)) {
				int var9 = arg0.field741 - (arg0.field771 - field99 - field99) * 64;
				int var10 = arg0.field742 - (arg0.field772 - field100 - field100) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field751 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field771 = 0;
				arg0.field772 = 0;
			}

			int var11 = arg0.field751 - arg0.field743 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field764 || var11 > 2048 - arg0.field764) {
					arg0.field743 = arg0.field751;
				} else if (var11 > 1024) {
					arg0.field743 -= arg0.field764;
				} else {
					arg0.field743 += arg0.field764;
				}

				arg0.field743 &= 0x7FF;
				if (arg0.field765 == arg0.field729 && arg0.field751 != arg0.field743) {
					if (arg0.field766 != -1) {
						arg0.field729 = arg0.field766;
						return;
					}

					arg0.field729 = arg0.field776;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZLGSULPWKR;)V")
	public final void method129(GSULPWKR arg0) {
		arg0.field727 = false;

		if (arg0.field729 != -1) {
			VYCKCNXO var2 = VYCKCNXO.field1339[arg0.field729];
			arg0.field731++;
			if (arg0.field730 < var2.field1340 && arg0.field731 > var2.method525(arg0.field730)) {
				arg0.field731 = 0;
				arg0.field730++;
			}

			if (arg0.field730 >= var2.field1340) {
				arg0.field731 = 0;
				arg0.field730 = 0;
			}
		}

		if (arg0.field756 != -1 && field372 >= arg0.field759) {
			if (arg0.field757 < 0) {
				arg0.field757 = 0;
			}

			VYCKCNXO var3 = BYUDODIR.field34[arg0.field756].field38;
			arg0.field758++;
			while (arg0.field757 < var3.field1340 && arg0.field758 > var3.method525(arg0.field757)) {
				arg0.field758 -= var3.method525(arg0.field757);
				arg0.field757++;
			}

			if (arg0.field757 >= var3.field1340 && (arg0.field757 < 0 || arg0.field757 >= var3.field1340)) {
				arg0.field756 = -1;
			}
		}

		if (arg0.field736 != -1 && arg0.field739 <= 1) {
			VYCKCNXO var4 = VYCKCNXO.field1339[arg0.field736];
			if (var4.field1351 == 1 && arg0.field763 > 0 && arg0.field748 <= field372 && arg0.field749 < field372) {
				arg0.field739 = 1;
				return;
			}
		}

		if (arg0.field736 != -1 && arg0.field739 == 0) {
			VYCKCNXO var5 = VYCKCNXO.field1339[arg0.field736];
			arg0.field738++;
			while (arg0.field737 < var5.field1340 && arg0.field738 > var5.method525(arg0.field737)) {
				arg0.field738 -= var5.method525(arg0.field737);
				arg0.field737++;
			}

			if (arg0.field737 >= var5.field1340) {
				arg0.field737 -= var5.field1344;
				arg0.field740++;
				if (arg0.field740 >= var5.field1350) {
					arg0.field736 = -1;
				}

				if (arg0.field737 < 0 || arg0.field737 >= var5.field1340) {
					arg0.field736 = -1;
				}
			}

			arg0.field727 = var5.field1346;
		}

		if (arg0.field739 > 0) {
			arg0.field739--;
		}
	}

	@ObfuscatedName("client.u(B)V")
	public final void method130() {
		if (field252 == -1 || field124 != 2 && field10 == null) {
			if (field276) {
				method55();
				field276 = false;
				field481.method493(4, 0, field9);
				field482.method493(357, 0, field9);
				field483.method493(4, 722, field9);
				field484.method493(205, 743, field9);
				field485.method493(0, 0, field9);
				field486.method493(4, 516, field9);
				field487.method493(205, 516, field9);
				field488.method493(357, 496, field9);
				field489.method493(338, 0, field9);
				field384 = true;
				field303 = true;
				field419 = true;
				field245 = true;

				if (field124 != 2) {
					field149.method493(4, 4, field9);
					field148.method493(4, 550, field9);
				}
			}

			if (field124 == 2) {
				method93();
			}

			if (field264 && field375 == 1) {
				field384 = true;
			}

			if (field167 != -1) {
				boolean var3 = method79(field305, field167);
				if (var3) {
					field384 = true;
				}
			}

			if (field163 == 2) {
				field384 = true;
			}

			if (field183 == 2) {
				field384 = true;
			}

			if (field384) {
				method38();
				field384 = false;
			}

			if (field59 == -1) {
				field300.field596 = field395 - field210 - 77;

				if (field17 > 448 && field17 < 560 && field18 > 332) {
					method89(field395, -1, 77, 463, field300, field18 - 357, 0, field17 - 17);
				}

				int var4 = field395 - field300.field596 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field395 - 77) {
					var4 = field395 - 77;
				}

				if (field210 != var4) {
					field210 = var4;
					field303 = true;
				}
			}

			if (field59 != -1) {
				boolean var5 = method79(field305, field59);
				if (var5) {
					field303 = true;
				}
			}

			if (field163 == 3) {
				field303 = true;
			}

			if (field183 == 3) {
				field303 = true;
			}

			if (field61 != null) {
				field303 = true;
			}

			if (field264 && field375 == 2) {
				field303 = true;
			}

			if (field303) {
				method65();
				field303 = false;
			}

			if (field124 == 2) {
				method108();
				field148.method493(4, 550, field9);
			}

			if (field381 != -1) {
				field419 = true;
			}

			if (field419) {
				if (field381 != -1 && field457 == field381) {
					field381 = -1;
					field343.method191(119);
					field343.method192(field457);
				}

				field419 = false;
				field68.method492();
				field474.method300(0, 0);

				if (field167 == -1) {
					if (field479[field457] != -1) {
						if (field457 == 0) {
							field196.method300(10, 22);
						}

						if (field457 == 1) {
							field197.method300(8, 54);
						}

						if (field457 == 2) {
							field197.method300(8, 82);
						}

						if (field457 == 3) {
							field198.method300(8, 110);
						}

						if (field457 == 4) {
							field200.method300(8, 153);
						}

						if (field457 == 5) {
							field200.method300(8, 181);
						}

						if (field457 == 6) {
							field199.method300(9, 209);
						}
					}

					if (field479[0] != -1 && (field381 != 0 || field372 % 20 < 10)) {
						field408[0].method300(13, 29);
					}

					if (field479[1] != -1 && (field381 != 1 || field372 % 20 < 10)) {
						field408[1].method300(11, 53);
					}

					if (field479[2] != -1 && (field381 != 2 || field372 % 20 < 10)) {
						field408[2].method300(11, 82);
					}

					if (field479[3] != -1 && (field381 != 3 || field372 % 20 < 10)) {
						field408[3].method300(12, 115);
					}

					if (field479[4] != -1 && (field381 != 4 || field372 % 20 < 10)) {
						field408[4].method300(13, 153);
					}

					if (field479[5] != -1 && (field381 != 5 || field372 % 20 < 10)) {
						field408[5].method300(11, 180);
					}

					if (field479[6] != -1 && (field381 != 6 || field372 % 20 < 10)) {
						field408[6].method300(13, 208);
					}
				}

				field68.method493(160, 516, field9);
				field169++;
				if (field169 > 77) {
					field169 = 0;
					field343.method191(116);
				}

				field67.method492();
				field473.method300(0, 0);

				if (field167 == -1) {
					if (field479[field457] != -1) {
						if (field457 == 7) {
							field435.method300(0, 42);
						}

						if (field457 == 8) {
							field436.method300(0, 74);
						}

						if (field457 == 9) {
							field436.method300(0, 102);
						}

						if (field457 == 10) {
							field437.method300(1, 130);
						}

						if (field457 == 11) {
							field439.method300(0, 173);
						}

						if (field457 == 12) {
							field439.method300(0, 201);
						}

						if (field457 == 13) {
							field438.method300(0, 229);
						}
					}

					if (field479[8] != -1 && (field381 != 8 || field372 % 20 < 10)) {
						field408[7].method300(2, 74);
					}

					if (field479[9] != -1 && (field381 != 9 || field372 % 20 < 10)) {
						field408[8].method300(3, 102);
					}

					if (field479[10] != -1 && (field381 != 10 || field372 % 20 < 10)) {
						field408[9].method300(4, 137);
					}

					if (field479[11] != -1 && (field381 != 11 || field372 % 20 < 10)) {
						field408[10].method300(2, 174);
					}

					if (field479[12] != -1 && (field381 != 12 || field372 % 20 < 10)) {
						field408[11].method300(2, 201);
					}

					if (field479[13] != -1 && (field381 != 13 || field372 % 20 < 10)) {
						field408[12].method300(2, 226);
					}
				}

				field67.method493(466, 496, field9);
				field149.method492();
				QAMTFDSD.field1152 = field243;
			}

			if (field245) {
				field245 = false;
				field66.method492();
				field472.method300(0, 0);
				field416.method474(true, 0xFFFFFF, 28, "Public chat", 55);

				if (field394 == 0) {
					field416.method474(true, 0xFF00, 41, "On", 55);
				}

				if (field394 == 1) {
					field416.method474(true, 0xFFFF00, 41, "Friends", 55);
				}

				if (field394 == 2) {
					field416.method474(true, 0xFF0000, 41, "Off", 55);
				}

				if (field394 == 3) {
					field416.method474(true, 0xFFFF, 41, "Hide", 55);
				}

				field416.method474(true, 0xFFFFFF, 28, "Private chat", 184);

				if (field311 == 0) {
					field416.method474(true, 0xFF00, 41, "On", 184);
				}

				if (field311 == 1) {
					field416.method474(true, 0xFFFF00, 41, "Friends", 184);
				}

				if (field311 == 2) {
					field416.method474(true, 0xFF0000, 41, "Off", 184);
				}

				field416.method474(true, 0xFFFFFF, 28, "Trade/compete", 324);

				if (field165 == 0) {
					field416.method474(true, 0xFF00, 41, "On", 324);
				}

				if (field165 == 1) {
					field416.method474(true, 0xFFFF00, 41, "Friends", 324);
				}

				if (field165 == 2) {
					field416.method474(true, 0xFF0000, 41, "Off", 324);
				}

				field416.method474(true, 0xFFFFFF, 33, "Report abuse", 458);
				field66.method493(453, 0, field9);
				field149.method492();
				QAMTFDSD.field1152 = field243;
			}

			field305 = 0;
		} else {
			if (field124 == 2) {
				method79(field305, field252);

				if (field129 != -1) {
					method79(field305, field129);
				}

				field305 = 0;
				method121();
				field10.method492();
				QAMTFDSD.field1152 = field244;
				JNJDBENA.method286();
				field276 = true;
				EKHKDMUP var1 = EKHKDMUP.method174(field252);
				if (var1.field583 == 512 && var1.field609 == 334 && var1.field625 == 0) {
					var1.field583 = 765;
					var1.field609 = 503;
				}

				method122(0, 0, var1, 0);

				if (field129 != -1) {
					EKHKDMUP var2 = EKHKDMUP.method174(field129);
					if (var2.field583 == 512 && var2.field609 == 334 && var2.field625 == 0) {
						var2.field583 = 765;
						var2.field609 = 503;
					}

					method122(0, 0, var2, 0);
				}

				if (field264) {
					method90();
				} else {
					method109();
					method112();
				}
			}

			field10.method493(0, 0, field9);
		}
	}

	@ObfuscatedName("client.a(ILGSULPWKR;Z)V")
	public final void method131(int arg0, GSULPWKR arg1) {
		method132(arg1.field741, arg1.field742, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method132(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method34(arg1, field91, arg0) - arg2;
			arg0 -= field286;
			var4 -= field287;
			arg1 -= field288;
			int var5 = OQIGXOFQ.field1097[field289];
			int var6 = OQIGXOFQ.field1098[field289];
			int var7 = OQIGXOFQ.field1097[field290];
			int var8 = OQIGXOFQ.field1098[field290];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field301 = (var9 << 9) / arg1 + QAMTFDSD.field1146;
				field302 = (var11 << 9) / arg1 + QAMTFDSD.field1147;
			} else {
				field301 = -1;
				field302 = -1;
			}
		} else {
			field301 = -1;
			field302 = -1;
		}
	}

	@ObfuscatedName("client.a(IILGHHPHSRU;LEJJAKGTE;B)V")
	public final void method133(int arg0, int arg1, GHHPHSRU arg2, EJJAKGTE arg3) {
		if ((arg0 & 0x40) != 0) {
			arg3.field770 = arg2.method230();
			if (arg3.field770 == 0xFFFF) {
				arg3.field770 = -1;
			}
		}

		if ((arg0 & 0x8) != 0) {
			arg3.field771 = arg2.method230();
			arg3.field772 = arg2.method230();
		}

		if ((arg0 & 0x20) != 0) {
			int var5 = arg2.method229();
			int var6 = arg2.method202();
			int var7 = arg2.method223();
			int var8 = arg2.field667;

			if (arg3.field552 != null && arg3.field570) {
				long var9 = VSUIHULP.method510(arg3.field552);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field188; var12++) {
						if (field429[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field313 == 0) {
					try {
						field360.field667 = 0;
						arg2.method239(var7, field360.field666, 0);
						field360.field667 = 0;
						String var13 = QFWDHRAY.method464(field360, var7);
						var13 = HGSXEUXP.method255(var13);
						arg3.field734 = var13;
						arg3.field761 = var5 >> 8;
						arg3.field780 = var5 & 0xFF;
						arg3.field728 = 150;

						if (var6 == 2 || var6 == 3) {
							method31("@cr2@" + arg3.field552, var13, 1);
						} else if (var6 == 1) {
							method31("@cr1@" + arg3.field552, var13, 1);
						} else {
							method31(arg3.field552, var13, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field667 = var7 + var8;
		}

		if ((arg0 & 0x1) != 0) {
			arg3.field734 = arg2.method209();
			if (arg3.field734.charAt(0) == '~') {
				arg3.field734 = arg3.field734.substring(1);
				method31(arg3.field552, arg3.field734, 2);
			} else if (field65 == arg3) {
				method31(arg3.field552, arg3.field734, 2);
			}

			arg3.field761 = 0;
			arg3.field780 = 0;
			arg3.field728 = 150;
		}

		if ((arg0 & 0x4) != 0) {
			int var15 = arg2.method223();
			byte[] var16 = new byte[var15];
			GHHPHSRU var17 = new GHHPHSRU(var16);
			arg2.method240(var15, 0, var16);
			field405[arg1] = var17;
			arg3.method173(var17);
		}

		if ((arg0 & 0x200) != 0) {
			arg3.field756 = arg2.method229();
			int var18 = arg2.method237();
			arg3.field760 = var18 >> 16;
			arg3.field759 = (var18 & 0xFFFF) + field372;
			arg3.field757 = 0;
			arg3.field758 = 0;

			if (arg3.field759 > field372) {
				arg3.field757 = -1;
			}

			if (arg3.field756 == 0xFFFF) {
				arg3.field756 = -1;
			}
		}

		if ((arg0 & 0x400) != 0) {
			int var19 = arg2.method202();
			int var20 = arg2.method202();
			arg3.method243(var20, var19, field372);
			arg3.field773 = field372 + 300;
			arg3.field774 = arg2.method221();
			arg3.field775 = arg2.method221();
		}

		if ((arg0 & 0x2) != 0) {
			int var21 = arg2.method204();
			if (var21 == 0xFFFF) {
				var21 = -1;
			}

			int var22 = arg2.method202();
			if (arg3.field736 == var21 && var21 != -1) {
				int var23 = VYCKCNXO.field1339[var21].field1353;
				if (var23 == 1) {
					arg3.field737 = 0;
					arg3.field738 = 0;
					arg3.field739 = var22;
					arg3.field740 = 0;
				}

				if (var23 == 2) {
					arg3.field740 = 0;
				}
			} else if (var21 == -1 || arg3.field736 == -1 || VYCKCNXO.field1339[var21].field1347 >= VYCKCNXO.field1339[arg3.field736].field1347) {
				arg3.field736 = var21;
				arg3.field737 = 0;
				arg3.field738 = 0;
				arg3.field739 = var22;
				arg3.field740 = 0;
				arg3.field763 = arg3.field762;
			}
		}

		if ((arg0 & 0x80) != 0) {
			int var24 = arg2.method221();
			int var25 = arg2.method223();
			arg3.method243(var25, var24, field372);
			arg3.field773 = field372 + 300;
			arg3.field774 = arg2.method202();
			arg3.field775 = arg2.method202();
		}

		if ((arg0 & 0x100) != 0) {
			arg3.field744 = arg2.method222();
			arg3.field746 = arg2.method223();
			arg3.field745 = arg2.method222();
			arg3.field747 = arg2.method223();
			arg3.field748 = arg2.method204() + field372;
			arg3.field749 = arg2.method229() + field372;
			arg3.field750 = arg2.method222();
			arg3.method244();
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method134(int arg0, int arg1) {
		VYBZTNTY var3 = field141[field91][arg0][arg1];
		if (var3 == null) {
			field207.method330(field91, arg0, arg1);
		} else {
			int var4 = -99999999;
			HMUIJBAH var5 = null;
			for (HMUIJBAH var6 = (HMUIJBAH) var3.method519(); var6 != null; var6 = (HMUIJBAH) var3.method521()) {
				ZKNJTNWP var7 = ZKNJTNWP.method590(var6.field789);
				int var8 = var7.field1494;
				if (var7.field1508) {
					var8 = (var6.field790 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method517(var5);
			HMUIJBAH var9 = null;
			HMUIJBAH var10 = null;
			for (HMUIJBAH var11 = (HMUIJBAH) var3.method519(); var11 != null; var11 = (HMUIJBAH) var3.method521()) {
				if (var5.field789 != var11.field789 && var9 == null) {
					var9 = var11;
				}

				if (var5.field789 != var11.field789 && var9.field789 != var11.field789 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field207.method316(field91, arg1, var12, arg0, var5, method34(arg1 * 128 + 64, field91, arg0 * 128 + 64), var10, var9);
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method135() {
		try {
			int var1 = field65.field741 + field461;
			int var2 = field65.field742 + field257;
			if (field348 - var1 < -500 || field348 - var1 > 500 || field349 - var2 < -500 || field349 - var2 > 500) {
				field348 = var1;
				field349 = var2;
			}

			if (field348 != var1) {
				field348 += (var1 - field348) / 16;
			}

			if (field349 != var2) {
				field349 += (var2 - field349) / 16;
			}

			if (field27[1] == 1) {
				field432 += (-field432 - 24) / 2;
			} else if (field27[2] == 1) {
				field432 += (24 - field432) / 2;
			} else {
				field432 /= 2;
			}

			if (field27[3] == 1) {
				field433 += (12 - field433) / 2;
			} else if (field27[4] == 1) {
				field433 += (-field433 - 12) / 2;
			} else {
				field433 /= 2;
			}

			field431 = field432 / 2 + field431 & 0x7FF;
			field430 += field433 / 2;
			if (field430 < 128) {
				field430 = 128;
			}

			if (field430 > 383) {
				field430 = 383;
			}

			int var3 = field348 >> 7;
			int var4 = field349 >> 7;
			int var5 = method34(field349, field91, field348);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field91;
						if (var9 < 3 && (field392[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field64[var9][var7][var8];
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

			if (var11 > field299) {
				field299 += (var11 - field299) / 24;
			} else if (var11 < field299) {
				field299 += (var11 - field299) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field65.field741 + "," + field65.field742 + "," + field348 + "," + field349 + "," + field154 + "," + field155 + "," + field99 + "," + field100);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method136(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ZLFNOFBEYP;)V")
	public final void method137(FNOFBEYP arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field663 == 0) {
			var2 = field207.method335(arg0.field662, arg0.field664, arg0.field665);
		}

		if (arg0.field663 == 1) {
			var2 = field207.method336(arg0.field662, arg0.field665, arg0.field664);
		}

		if (arg0.field663 == 2) {
			var2 = field207.method337(arg0.field662, arg0.field664, arg0.field665);
		}

		if (arg0.field663 == 3) {
			var2 = field207.method338(arg0.field662, arg0.field664, arg0.field665);
		}

		if (var2 != 0) {
			int var6 = field207.method339(arg0.field662, arg0.field664, arg0.field665, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field654 = var3;
		arg0.field656 = var4;
		arg0.field655 = var5;
	}

	@ObfuscatedName("client.b(JB)V")
	public final void method138(long arg0) {
		if (arg0 != 0L) {
			if (field228 >= 100 && field104 != 1) {
				method31("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field228 >= 200) {
				method31("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = VSUIHULP.method514(VSUIHULP.method511(arg0));
				for (int var4 = 0; var4 < field228; var4++) {
					if (field209[var4] == arg0) {
						method31("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field188; var5++) {
					if (field429[var5] == arg0) {
						method31("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field65.field552)) {
					field179[field228] = var3;
					field209[field228] = arg0;
					field180[field228] = 0;
					field228++;
					field384 = true;
					field343.method191(177);
					field343.method198(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method9() {
		if (field320 || field234 || field226) {
			method96();
		} else {
			field285++;

			if (field206) {
				method130();
			} else {
				method94(false);
			}

			field251 = 0;
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method139(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.c(IB)V")
	public final void method140(int arg0) {
		if (arg0 >= 0) {
			if (field295 != 0) {
				field295 = 0;
				field303 = true;
			}

			int var2 = field315[arg0];
			int var3 = field316[arg0];
			int var4 = field317[arg0];
			int var5 = field318[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 775) {
				field343.method191(182);
				field343.method193(var2);
				field343.method193(field448);
				field343.method227(var3);
				field343.method193(field446);
				field343.method228(var5);
				field343.method228(field447);
				field160 = 0;
				field161 = var3;
				field162 = var2;
				field163 = 2;
				if (EKHKDMUP.method174(var3).field597 == field69) {
					field163 = 1;
				}

				if (EKHKDMUP.method174(var3).field597 == field59) {
					field163 = 3;
				}
			}

			if (var4 == 658) {
				boolean var6 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
				if (!var6) {
					method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
				}

				field246 = field24;
				field247 = field25;
				field249 = 2;
				field248 = 0;
				field343.method191(189);
				field343.method193(field100 + var3);
				field343.method226(var5);
				field343.method193(field99 + var2);
			}

			if (var4 == 595) {
				boolean var8 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
				if (!var8) {
					method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
				}

				field246 = field24;
				field247 = field25;
				field249 = 2;
				field248 = 0;

				if ((field100 & 0x3) == 0) {
					field420++;
				}

				if (field420 >= 84) {
					field343.method191(48);
					field343.method196(0);
					field420 = 0;
				}

				field343.method191(8);
				field343.method193(field99 + var2);
				field343.method227(field100 + var3);
				field343.method227(var5);
			}

			if (var4 == 39) {
				field343.method191(84);
				field343.method193(var5);
				field343.method226(field333);
				field343.method193(var3);
				field343.method226(var2);
				field160 = 0;
				field161 = var3;
				field162 = var2;
				field163 = 2;
				if (EKHKDMUP.method174(var3).field597 == field69) {
					field163 = 1;
				}

				if (EKHKDMUP.method174(var3).field597 == field59) {
					field163 = 3;
				}
			}

			if (var4 == 687) {
				boolean var10 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
				if (!var10) {
					method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
				}

				field246 = field24;
				field247 = field25;
				field249 = 2;
				field248 = 0;
				field407 += field99;
				if (field407 >= 132) {
					field343.method191(205);
					field343.method196(0);
					field407 = 0;
				}

				field343.method191(57);
				field343.method226(field99 + var2);
				field343.method226(var5);
				field343.method228(field100 + var3);
			}

			if (var4 == 1893) {
				ZKNJTNWP var12 = ZKNJTNWP.method590(var5);
				EKHKDMUP var13 = EKHKDMUP.method174(var3);
				String var14;
				if (var13 != null && var13.field633[var2] >= 100000) {
					var14 = var13.field633[var2] + " x " + var12.field1482;
				} else if (var12.field1487 == null) {
					var14 = "It's a " + var12.field1482 + ".";
				} else {
					var14 = new String(var12.field1487);
				}

				method31("", var14, 0);
			}

			if (var4 == 261) {
				EJJAKGTE var15 = field400[var5];
				if (var15 != null) {
					method64(var15.field733[0], 0, var15.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
					field246 = field24;
					field247 = field25;
					field249 = 2;
					field248 = 0;
					field343.method191(188);
					field343.method226(var5);
				}
			}

			if (var4 == 1408) {
				ZKNJTNWP var16 = ZKNJTNWP.method590(var5);
				String var17;
				if (var16.field1487 == null) {
					var17 = "It's a " + var16.field1482 + ".";
				} else {
					var17 = new String(var16.field1487);
				}

				method31("", var17, 0);
			}

			if (var4 == 886) {
				LJAXEEYT var18 = field361[var5];
				if (var18 != null) {
					method64(var18.field733[0], 0, var18.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
					field246 = field24;
					field247 = field25;
					field249 = 2;
					field248 = 0;
					field343.method191(212);
					field343.method228(var5);
				}
			}

			if (var4 == 723) {
				LJAXEEYT var19 = field361[var5];
				if (var19 != null) {
					method64(var19.field733[0], 0, var19.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
					field246 = field24;
					field247 = field25;
					field249 = 2;
					field248 = 0;
					field343.method191(81);
					field343.method227(var5);
				}
			}

			if (var4 == 337) {
				method104(var3, var5, var2);
				field343.method191(75);
				field343.method227(field99 + var2);
				field343.method193(field100 + var3);
				field343.method227(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 1892) {
				LJAXEEYT var20 = field361[var5];
				if (var20 != null) {
					DDJHHGTJ var21 = var20.field856;
					if (var21.field518 != null) {
						var21 = var21.method164();
					}

					if (var21 != null) {
						String var22;
						if (var21.field505 == null) {
							var22 = "It's a " + var21.field526 + ".";
						} else {
							var22 = new String(var21.field505);
						}

						method31("", var22, 0);
					}
				}
			}

			if (var4 == 506) {
				if (field264) {
					field207.method347(var2 - 4, var3 - 4);
				} else {
					field207.method347(field24 - 4, field25 - 4);
				}
			}

			if (var4 == 838) {
				method154();
			}

			if (var4 == 708) {
				if ((var5 & 0x3) == 0) {
					field463++;
				}

				if (field463 >= 102) {
					field343.method191(106);
					field343.method196(0);
					field463 = 0;
				}

				field343.method191(136);
				field343.method228(var5);
				field343.method227(var2);
				field343.method227(var3);
				field160 = 0;
				field161 = var3;
				field162 = var2;
				field163 = 2;
				if (EKHKDMUP.method174(var3).field597 == field69) {
					field163 = 1;
				}

				if (EKHKDMUP.method174(var3).field597 == field59) {
					field163 = 3;
				}
			}

			if (var4 == 473) {
				EJJAKGTE var23 = field400[var5];
				if (var23 != null) {
					method64(var23.field733[0], 0, var23.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
					field246 = field24;
					field247 = field25;
					field249 = 2;
					field248 = 0;
					field343.method191(12);
					field343.method226(var5);
				}
			}

			if (var4 == 148) {
				field343.method191(58);
				field343.method193(var3);
				field343.method228(var2);
				field343.method226(var5);
				field160 = 0;
				field161 = var3;
				field162 = var2;
				field163 = 2;
				if (EKHKDMUP.method174(var3).field597 == field69) {
					field163 = 1;
				}

				if (EKHKDMUP.method174(var3).field597 == field59) {
					field163 = 3;
				}
			}

			if (var4 == 1586) {
				method104(var3, var5, var2);
				field343.method191(109);
				field343.method228(var5 >> 14 & 0x7FFF);
				field343.method226(field100 + var3);
				field343.method193(field99 + var2);
			}

			if (var4 == 484 && method104(var3, var5, var2)) {
				field343.method191(245);
				field343.method226(field99 + var2);
				field343.method227(field447);
				field343.method228(field446);
				field343.method193(var5 >> 14 & 0x7FFF);
				field343.method226(field448);
				field343.method228(field100 + var3);
			}

			if (var4 == 910) {
				field343.method191(206);
				field343.method193(var2);
				field343.method228(var5);
				field343.method226(var3);
				field160 = 0;
				field161 = var3;
				field162 = var2;
				field163 = 2;
				if (EKHKDMUP.method174(var3).field597 == field69) {
					field163 = 1;
				}

				if (EKHKDMUP.method174(var3).field597 == field59) {
					field163 = 3;
				}
			}

			if (var4 == 893) {
				LJAXEEYT var24 = field361[var5];
				if (var24 != null) {
					method64(var24.field733[0], 0, var24.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
					field246 = field24;
					field247 = field25;
					field249 = 2;
					field248 = 0;
					field343.method191(232);
					field343.method226(field333);
					field343.method228(var5);
				}
			}

			if (var4 == 230) {
				boolean var25 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
				if (!var25) {
					method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
				}

				field246 = field24;
				field247 = field25;
				field249 = 2;
				field248 = 0;
				field343.method191(46);
				field343.method228(var5);
				field343.method226(field99 + var2);
				field343.method228(field100 + var3);
			}

			if (var4 == 874) {
				field445 = 1;
				field446 = var2;
				field447 = var3;
				field448 = var5;
				field449 = ZKNJTNWP.method590(var5).field1482;
				field332 = 0;
				field384 = true;
			} else {
				if (var4 == 778) {
					EJJAKGTE var27 = field400[var5];
					if (var27 != null) {
						method64(var27.field733[0], 0, var27.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
						field246 = field24;
						field247 = field25;
						field249 = 2;
						field248 = 0;
						field343.method191(41);
						field343.method226(var5);
					}
				}

				if (var4 == 554) {
					EJJAKGTE var28 = field400[var5];
					if (var28 != null) {
						method64(var28.field733[0], 0, var28.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
						field246 = field24;
						field247 = field25;
						field249 = 2;
						field248 = 0;
						field178++;
						if (field178 >= 145) {
							field343.method191(64);
							field343.method192(5);
							field178 = 0;
						}

						field343.method191(68);
						field343.method193(var5);
					}
				}

				if (var4 == 896) {
					EKHKDMUP var29 = EKHKDMUP.method174(var3);
					field332 = 1;
					field333 = var3;
					field334 = var29.field630;
					field445 = 0;
					field384 = true;
					String var30 = var29.field595;
					if (var30.indexOf(" ") != -1) {
						var30 = var30.substring(0, var30.indexOf(" "));
					}

					String var31 = var29.field595;
					if (var31.indexOf(" ") != -1) {
						var31 = var31.substring(var31.indexOf(" ") + 1);
					}

					field335 = var30 + " " + var29.field575 + " " + var31;

					if (field334 == 16) {
						field384 = true;
						field457 = 3;
						field419 = true;
					}
				} else {
					if (var4 == 633) {
						String var32 = field227[arg0];
						int var33 = var32.indexOf("@whi@");
						if (var33 != -1) {
							long var34 = VSUIHULP.method510(var32.substring(var33 + 5).trim());
							int var36 = -1;
							for (int var37 = 0; var37 < field228; var37++) {
								if (field209[var37] == var34) {
									var36 = var37;
									break;
								}
							}

							if (var36 != -1 && field180[var36] > 0) {
								field303 = true;
								field295 = 0;
								field388 = true;
								field231 = "";
								field291 = 3;
								field371 = field209[var36];
								field352 = "Enter message to send to " + field179[var36];
							}
						}
					}

					if (var4 == 994) {
						field343.method191(87);
						field343.method227(var2);
						field343.method227(var5);
						field343.method228(var3);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 645) {
						LJAXEEYT var38 = field361[var5];
						if (var38 != null) {
							method64(var38.field733[0], 0, var38.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(18);
							field343.method193(var5);
						}
					}

					if (var4 == 1138) {
						int var39 = var5 >> 14 & 0x7FFF;
						MKWUPJYP var40 = MKWUPJYP.method365(var39);
						String var41;
						if (var40.field936 == null) {
							var41 = "It's a " + var40.field964 + ".";
						} else {
							var41 = new String(var40.field936);
						}

						method31("", var41, 0);
					}

					if (var4 == 840) {
						field343.method191(247);
						field343.method226(var2);
						field343.method227(var3);
						field343.method193(var5);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 670) {
						boolean var42 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
						if (!var42) {
							method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
						}

						field246 = field24;
						field247 = field25;
						field249 = 2;
						field248 = 0;
						field343.method191(185);
						field343.method228(var5);
						field343.method227(field100 + var3);
						field343.method227(field99 + var2);
					}

					if (var4 == 667) {
						LJAXEEYT var44 = field361[var5];
						if (var44 != null) {
							method64(var44.field733[0], 0, var44.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(170);
							field343.method227(var5);
						}
					}

					if (var4 == 395) {
						EJJAKGTE var45 = field400[var5];
						if (var45 != null) {
							method64(var45.field733[0], 0, var45.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(149);
							field343.method227(var5);
							field343.method193(field446);
							field343.method227(field447);
							field343.method227(field448);
						}
					}

					if (var4 == 134) {
						EJJAKGTE var46 = field400[var5];
						if (var46 != null) {
							method64(var46.field733[0], 0, var46.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(171);
							field343.method228(var5);
						}
					}

					if (var4 == 507) {
						field343.method191(27);
						field343.method193(var3);
						EKHKDMUP var47 = EKHKDMUP.method174(var3);
						if (var47.field610 != null && var47.field610[0][0] == 5) {
							int var48 = var47.field610[0][1];
							if (field477[var48] != var47.field591[0]) {
								field477[var48] = var47.field591[0];
								method60(var48);
								field384 = true;
							}
						}
					}

					if (var4 == 637) {
						field343.method191(54);
						field343.method227(var5);
						field343.method226(var2);
						field343.method226(var3);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 951) {
						method92(field120);
						field120 = -1;
						field303 = true;
					}

					if (var4 == 681) {
						EJJAKGTE var49 = field400[var5];
						if (var49 != null) {
							method64(var49.field733[0], 0, var49.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(45);
							field343.method193(field333);
							field343.method227(var5);
						}
					}

					if (var4 == 592) {
						field343.method191(121);
						field343.method226(var2);
						field343.method226(var5);
						field343.method227(var3);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 807 && method104(var3, var5, var2)) {
						field343.method191(155);
						field343.method227(var5 >> 14 & 0x7FFF);
						field343.method228(field100 + var3);
						field343.method228(field99 + var2);
						field343.method193(field333);
					}

					if (var4 == 532 || var4 == 938) {
						String var50 = field227[arg0];
						int var51 = var50.indexOf("@whi@");
						if (var51 != -1) {
							var50 = var50.substring(var51 + 5).trim();
							String var52 = VSUIHULP.method514(VSUIHULP.method511(VSUIHULP.method510(var50)));
							boolean var53 = false;
							for (int var54 = 0; var54 < field401; var54++) {
								EJJAKGTE var55 = field400[field402[var54]];
								if (var55 != null && var55.field552 != null && var55.field552.equalsIgnoreCase(var52)) {
									method64(var55.field733[0], 0, var55.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);

									if (var4 == 532) {
										field178++;
										if (field178 >= 145) {
											field343.method191(64);
											field343.method192(5);
											field178 = 0;
										}

										field343.method191(68);
										field343.method193(field402[var54]);
									}

									if (var4 == 938) {
										field343.method191(171);
										field343.method228(field402[var54]);
									}

									var53 = true;
									break;
								}
							}

							if (!var53) {
								method31("", "Unable to find " + var52, 0);
							}
						}
					}

					if (var4 == 663) {
						EKHKDMUP var56 = EKHKDMUP.method174(var3);
						boolean var57 = true;
						if (var56.field631 > 0) {
							var57 = method84(var56);
						}

						if (var57) {
							field343.method191(27);
							field343.method193(var3);
						}
					}

					if (var4 == 17) {
						field343.method191(161);
						field343.method227(var5);
						field343.method193(var2);
						field343.method228(var3);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 78) {
						boolean var58 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
						if (!var58) {
							method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
						}

						field246 = field24;
						field247 = field25;
						field249 = 2;
						field248 = 0;
						field343.method191(96);
						field343.method227(field333);
						field343.method226(var5);
						field343.method193(field100 + var3);
						field343.method228(field99 + var2);
					}

					if (var4 == 237) {
						LJAXEEYT var60 = field361[var5];
						if (var60 != null) {
							method64(var60.field733[0], 0, var60.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(62);
							field343.method226(var5);
							field343.method226(field447);
							field343.method227(field448);
							field343.method193(field446);
						}
					}

					if (var4 == 496) {
						if ((var3 & 0x3) == 0) {
							field382++;
						}

						if (field382 >= 94) {
							field343.method191(209);
							field343.method192(102);
							field382 = 0;
						}

						method104(var3, var5, var2);
						field343.method191(202);
						field343.method193(field99 + var2);
						field343.method228(var5 >> 14 & 0x7FFF);
						field343.method193(field100 + var3);
					}

					if (var4 == 338 && !field235) {
						field343.method191(24);
						field343.method193(var3);
						field235 = true;
					}

					if (var4 == 423) {
						LJAXEEYT var61 = field361[var5];
						if (var61 != null) {
							method64(var61.field733[0], 0, var61.field732[0], 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
							field246 = field24;
							field247 = field25;
							field249 = 2;
							field248 = 0;
							field343.method191(32);
							field343.method228(var5);
						}
					}

					if (var4 == 846) {
						method104(var3, var5, var2);
						field343.method191(83);
						field343.method226(field100 + var3);
						field343.method228(field99 + var2);
						field343.method226(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 68) {
						field343.method191(74);
						field343.method226(var5);
						field343.method228(var3);
						field343.method227(var2);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 538) {
						field153 += var5;
						if (field153 >= 136) {
							field343.method191(237);
							field153 = 0;
						}

						method104(var3, var5, var2);
						field343.method191(93);
						field343.method228(var5 >> 14 & 0x7FFF);
						field343.method226(field100 + var3);
						field343.method227(field99 + var2);
					}

					if (var4 == 306) {
						field343.method191(159);
						field343.method193(var3);
						field343.method226(var5);
						field343.method193(var2);
						field160 = 0;
						field161 = var3;
						field162 = var2;
						field163 = 2;
						if (EKHKDMUP.method174(var3).field597 == field69) {
							field163 = 1;
						}

						if (EKHKDMUP.method174(var3).field597 == field59) {
							field163 = 3;
						}
					}

					if (var4 == 241) {
						field343.method191(27);
						field343.method193(var3);
						EKHKDMUP var62 = EKHKDMUP.method174(var3);
						if (var62.field610 != null && var62.field610[0][0] == 5) {
							int var63 = var62.field610[0][1];
							field477[var63] = 1 - field477[var63];
							method60(var63);
							field384 = true;
						}
					}

					if (var4 == 279) {
						String var64 = field227[arg0];
						int var65 = var64.indexOf("@whi@");
						if (var65 != -1) {
							if (field69 == -1) {
								method154();
								field72 = var64.substring(var65 + 5).trim();
								field128 = false;
								field78 = field69 = EKHKDMUP.field618;
							} else {
								method31("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}

					if (var4 == 691 || var4 == 275 || var4 == 739 || var4 == 266) {
						String var66 = field227[arg0];
						int var67 = var66.indexOf("@whi@");
						if (var67 != -1) {
							long var68 = VSUIHULP.method510(var66.substring(var67 + 5).trim());
							if (var4 == 691) {
								method138(var68);
							}

							if (var4 == 275) {
								method52(var68);
							}

							if (var4 == 739) {
								method101(var68);
							}

							if (var4 == 266) {
								method59(var68);
							}
						}
					}

					if (var4 == 383) {
						boolean var70 = method64(var3, 0, var2, 0, 0, 0, 2, false, field65.field732[0], 0, field65.field733[0]);
						if (!var70) {
							method64(var3, 0, var2, 1, 0, 0, 2, false, field65.field732[0], 1, field65.field733[0]);
						}

						field246 = field24;
						field247 = field25;
						field249 = 2;
						field248 = 0;
						field343.method191(199);
						field343.method193(field448);
						field343.method193(field446);
						field343.method227(field99 + var2);
						field343.method228(field447);
						field343.method228(field100 + var3);
						field343.method226(var5);
					}

					field445 = 0;
					field332 = 0;
					field384 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IILGHHPHSRU;)V")
	public final void method141(int arg0, GHHPHSRU arg1) {
		if (arg0 == 246) {
			int var3 = arg1.method202();
			int var4 = (var3 >> 4 & 0x7) + field321;
			int var5 = (var3 & 0x7) + field322;
			int var6 = arg1.method204();
			int var7 = arg1.method202();
			int var8 = var7 >> 4 & 0xF;
			int var9 = var7 & 0x7;
			if (field65.field732[0] >= var4 - var8 && field65.field732[0] <= var4 + var8 && field65.field733[0] >= var5 - var8 && field65.field733[0] <= var5 + var8 && field220 && !field240 && field304 < 50) {
				field298[field304] = var6;
				field393[field304] = var9;
				field341[field304] = VYSYBHPS.field1356[var6];
				field304++;
			}
		}

		if (arg0 == 225) {
			int var10 = arg1.method202();
			int var11 = (var10 >> 4 & 0x7) + field321;
			int var12 = (var10 & 0x7) + field322;
			int var13 = arg1.method204();
			int var14 = arg1.method204();
			int var15 = arg1.method204();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
				VYBZTNTY var16 = field141[field91][var11][var12];
				if (var16 != null) {
					for (HMUIJBAH var17 = (HMUIJBAH) var16.method519(); var17 != null; var17 = (HMUIJBAH) var16.method521()) {
						if ((var13 & 0x7FFF) == var17.field789 && var17.field790 == var14) {
							var17.field790 = var15;
							break;
						}
					}

					method134(var11, var12);
				}
			}
		} else if (arg0 == 35) {
			int var18 = arg1.method230();
			int var19 = arg1.method223();
			int var20 = (var19 >> 4 & 0x7) + field321;
			int var21 = (var19 & 0x7) + field322;
			int var22 = arg1.method221();
			int var23 = var22 >> 2;
			int var24 = var22 & 0x3;
			int var25 = field358[var23];
			if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
				method69(-1, field91, var25, var20, 0, var18, var21, var23, var24);
			}
		} else if (arg0 == 234) {
			int var26 = arg1.method222();
			int var27 = var26 >> 2;
			int var28 = var26 & 0x3;
			int var29 = field358[var27];
			int var30 = arg1.method231();
			int var31 = arg1.method222();
			int var32 = (var31 >> 4 & 0x7) + field321;
			int var33 = (var31 & 0x7) + field322;
			if (var32 >= 0 && var33 >= 0 && var32 < 103 && var33 < 103) {
				int var34 = field64[field91][var32][var33];
				int var35 = field64[field91][var32 + 1][var33];
				int var36 = field64[field91][var32 + 1][var33 + 1];
				int var37 = field64[field91][var32][var33 + 1];
				if (var29 == 0) {
					QCULKYGQ var38 = field207.method331(field91, var32, var33);
					if (var38 != null) {
						int var39 = var38.field1171 >> 14 & 0x7FFF;
						if (var27 == 2) {
							var38.field1169 = new WYAAPLJP(var36, var39, false, var35, var28 + 4, var34, 2, var30, var37);
							var38.field1170 = new WYAAPLJP(var36, var39, false, var35, var28 + 1 & 0x3, var34, 2, var30, var37);
						} else {
							var38.field1169 = new WYAAPLJP(var36, var39, false, var35, var28, var34, var27, var30, var37);
						}
					}
				}

				if (var29 == 1) {
					WZAEKEON var40 = field207.method332(field91, var33, var32);
					if (var40 != null) {
						var40.field1387 = new WYAAPLJP(var36, var40.field1388 >> 14 & 0x7FFF, false, var35, 0, var34, 4, var30, var37);
					}
				}

				if (var29 == 2) {
					NYMSLUOV var41 = field207.method333(field91, var32, var33);

					if (var27 == 11) {
						var27 = 10;
					}

					if (var41 != null) {
						var41.field1006 = new WYAAPLJP(var36, var41.field1014 >> 14 & 0x7FFF, false, var35, var28, var34, var27, var30, var37);
					}
				}

				if (var29 == 3) {
					KNBGMPOZ var42 = field207.method334(field91, var33, var32);
					if (var42 != null) {
						var42.field822 = new WYAAPLJP(var36, var42.field823 >> 14 & 0x7FFF, false, var35, var28, var34, 22, var30, var37);
					}
				}
			}
		} else if (arg0 == 59) {
			int var43 = arg1.method222();
			int var44 = (var43 >> 4 & 0x7) + field321;
			int var45 = (var43 & 0x7) + field322;
			int var46 = arg1.method204();
			if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
				VYBZTNTY var47 = field141[field91][var44][var45];
				if (var47 != null) {
					for (HMUIJBAH var48 = (HMUIJBAH) var47.method519(); var48 != null; var48 = (HMUIJBAH) var47.method521()) {
						if ((var46 & 0x7FFF) == var48.field789) {
							var48.method19();
							break;
						}
					}

					if (var47.method519() == null) {
						field141[field91][var44][var45] = null;
					}

					method134(var44, var45);
				}
			}
		} else if (arg0 == 191) {
			int var49 = arg1.method202();
			int var50 = (var49 >> 4 & 0x7) + field321;
			int var51 = (var49 & 0x7) + field322;
			int var52 = var50 + arg1.method203();
			int var53 = var51 + arg1.method203();
			int var54 = arg1.method205();
			int var55 = arg1.method204();
			int var56 = arg1.method202() * 4;
			int var57 = arg1.method202() * 4;
			int var58 = arg1.method204();
			int var59 = arg1.method204();
			int var60 = arg1.method202();
			int var61 = arg1.method202();
			if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var55 != 0xFFFF) {
				var50 = var50 * 128 + 64;
				var51 = var51 * 128 + 64;
				var52 = var52 * 128 + 64;
				var53 = var53 * 128 + 64;
				SCWHDOGN var62 = new SCWHDOGN(field91, var54, field372 + var59, var55, var50, var57, field372 + var58, var61, method34(var51, field91, var50) - var56, var51, var60);
				var62.method471(method34(var53, field91, var52) - var57, field372 + var58, var53, var52);
				field347.method516(var62);
			}
		} else if (arg0 == 18) {
			int var63 = arg1.method202();
			int var64 = (var63 >> 4 & 0x7) + field321;
			int var65 = (var63 & 0x7) + field322;
			int var66 = arg1.method204();
			int var67 = arg1.method202();
			int var68 = arg1.method204();
			if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
				var64 = var64 * 128 + 64;
				var65 = var65 * 128 + 64;
				RFQAJLME var69 = new RFQAJLME(field91, var68, var65, method34(var65, field91, var64) - var67, field372, var66, var64);
				field329.method516(var69);
			}
		} else if (arg0 == 249) {
			int var70 = arg1.method204();
			int var71 = arg1.method230();
			int var72 = arg1.method222();
			int var73 = (var72 >> 4 & 0x7) + field321;
			int var74 = (var72 & 0x7) + field322;
			int var75 = arg1.method231();
			if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && field443 != var75) {
				HMUIJBAH var76 = new HMUIJBAH();
				var76.field789 = var70;
				var76.field790 = var71;

				if (field141[field91][var73][var74] == null) {
					field141[field91][var73][var74] = new VYBZTNTY();
				}

				field141[field91][var73][var74].method516(var76);
				method134(var73, var74);
			}
		} else if (arg0 == 80) {
			int var77 = arg1.method229();
			int var78 = arg1.method223();
			int var79 = (var78 >> 4 & 0x7) + field321;
			int var80 = (var78 & 0x7) + field322;
			int var81 = arg1.method231();
			if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
				HMUIJBAH var82 = new HMUIJBAH();
				var82.field789 = var77;
				var82.field790 = var81;

				if (field141[field91][var79][var80] == null) {
					field141[field91][var79][var80] = new VYBZTNTY();
				}

				field141[field91][var79][var80].method516(var82);
				method134(var79, var80);
			}
		} else if (arg0 == 213) {
			int var83 = arg1.method223();
			int var84 = var83 >> 2;
			int var85 = var83 & 0x3;
			int var86 = field358[var84];
			int var87 = arg1.method222();
			int var88 = (var87 >> 4 & 0x7) + field321;
			int var89 = (var87 & 0x7) + field322;
			if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
				method69(-1, field91, var86, var88, 0, -1, var89, var84, var85);
			}
		} else if (arg0 == 195) {
			byte var90 = arg1.method203();
			int var91 = arg1.method229();
			int var92 = arg1.method230();
			byte var93 = arg1.method224();
			int var94 = arg1.method231();
			byte var95 = arg1.method225();
			byte var96 = arg1.method224();
			int var97 = arg1.method230();
			int var98 = arg1.method222();
			int var99 = var98 >> 2;
			int var100 = var98 & 0x3;
			int var101 = field358[var99];
			int var102 = arg1.method221();
			int var103 = (var102 >> 4 & 0x7) + field321;
			int var104 = (var102 & 0x7) + field322;
			EJJAKGTE var105;
			if (field443 == var92) {
				var105 = field65;
			} else {
				var105 = field400[var92];
			}

			if (var105 != null) {
				MKWUPJYP var106 = MKWUPJYP.method365(var91);
				int var107 = field64[field91][var103][var104];
				int var108 = field64[field91][var103 + 1][var104];
				int var109 = field64[field91][var103 + 1][var104 + 1];
				int var110 = field64[field91][var103][var104 + 1];
				OQIGXOFQ var111 = var106.method361(var99, var100, var107, var108, var109, var110, -1);
				if (var111 != null) {
					method69(var94 + 1, field91, var101, var103, var97 + 1, -1, var104, 0, 0);
					var105.field566 = field372 + var97;
					var105.field567 = field372 + var94;
					var105.field558 = var111;
					int var112 = var106.field980;
					int var113 = var106.field975;
					if (var100 == 1 || var100 == 3) {
						var112 = var106.field975;
						var113 = var106.field980;
					}

					var105.field555 = var103 * 128 + var112 * 64;
					var105.field557 = var104 * 128 + var113 * 64;
					var105.field556 = method34(var105.field557, field91, var105.field555);

					if (var96 > var90) {
						byte var114 = var96;
						var96 = var90;
						var90 = var114;
					}

					if (var95 > var93) {
						byte var115 = var95;
						var95 = var93;
						var93 = var115;
					}

					var105.field561 = var96 + var103;
					var105.field563 = var90 + var103;
					var105.field562 = var95 + var104;
					var105.field564 = var93 + var104;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method142() {
		if (field212 > 1) {
			field212--;
		}

		if (field219 > 0) {
			field219--;
		}

		for (int var1 = 0; var1 < 5 && method150(); var1++) {
		}

		if (field206) {
			synchronized (field294.field1465) {
				if (!field422) {
					field294.field1464 = 0;
				} else if (field23 != 0 || field294.field1464 >= 40) {
					field343.method191(210);
					field343.method192(0);
					int var3 = field343.field667;
					int var4 = 0;
					for (int var5 = 0; var5 < field294.field1464 && var3 - field343.field667 < 240; var5++) {
						var4++;
						int var6 = field294.field1462[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field294.field1460[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field294.field1462[var5] == -1 && field294.field1460[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field172 != var7 || field173 != var6) {
							int var9 = var7 - field172;
							field172 = var7;
							int var10 = var6 - field173;
							field173 = var6;

							if (field121 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field343.method193((field121 << 12) + (var9 << 6) + var10);
								field121 = 0;
							} else if (field121 < 8) {
								field343.method195((field121 << 19) + var8 + 0x800000);
								field121 = 0;
							} else {
								field343.method196((field121 << 19) + var8 - 0x40000000);
								field121 = 0;
							}
						} else if (field121 < 2047) {
							field121++;
						}
					}

					field343.method201(field343.field667 - var3);

					if (var4 >= field294.field1464) {
						field294.field1464 = 0;
					} else {
						field294.field1464 -= var4;
						for (int var11 = 0; var11 < field294.field1464; var11++) {
							field294.field1460[var11] = field294.field1460[var4 + var11];
							field294.field1462[var11] = field294.field1462[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field480) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field480 = field26;
				int var14 = field25;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field24;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field23 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field343.method191(14);
				field343.method235((var17 << 19) + (var18 << 20) + var16);
			}

			if (field350 > 0) {
				field350--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field351 = true;
			}

			if (field351 && field350 <= 0) {
				field350 = 20;
				field351 = false;
				field343.method191(55);
				field343.method228(field430);
				field343.method228(field431);
			}

			if (field14 && !field192) {
				field192 = true;
				field343.method191(235);
				field343.method192(1);
			}

			if (!field14 && field192) {
				field192 = false;
				field343.method191(235);
				field343.method192(0);
			}

			method21();
			method44();
			method155();
			field217++;
			if (field217 > 750) {
				method74();
			}

			method99();
			method123();
			method32();
			field305++;

			if (field249 != 0) {
				field248 += 20;
				if (field248 >= 400) {
					field249 = 0;
				}
			}

			if (field163 != 0) {
				field160++;
				if (field160 >= 15) {
					if (field163 == 2) {
						field384 = true;
					}

					if (field163 == 3) {
						field303 = true;
					}

					field163 = 0;
				}
			}

			if (field183 != 0) {
				field456++;

				if (field17 > field184 + 5 || field17 < field184 - 5 || field18 > field185 + 5 || field18 < field185 - 5) {
					field324 = true;
				}

				if (field16 == 0) {
					if (field183 == 2) {
						field384 = true;
					}

					if (field183 == 3) {
						field303 = true;
					}

					field183 = 0;

					if (field324 && field456 >= 5) {
						field470 = -1;
						method109();

						if (field470 == field181 && field469 != field182) {
							EKHKDMUP var19 = EKHKDMUP.method174(field181);
							byte var20 = 0;
							if (field125 == 1 && var19.field631 == 206) {
								var20 = 1;
							}

							if (var19.field574[field469] <= 0) {
								var20 = 0;
							}

							if (var19.field640) {
								int var21 = field182;
								int var22 = field469;
								var19.field574[var22] = var19.field574[var21];
								var19.field633[var22] = var19.field633[var21];
								var19.field574[var21] = -1;
								var19.field633[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field182;
								int var24 = field469;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method182(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method182(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method182(field469, field182);
							}

							field343.method191(139);
							field343.method227(field469);
							field343.method193(field182);
							field343.method227(field181);
							field343.method220(var20);
						}
					} else if ((field230 == 1 || method66(field389 - 1)) && field389 > 2) {
						method120();
					} else if (field389 > 0) {
						method140(field389 - 1);
					}

					field160 = 10;
					field23 = 0;
				}
			}

			if (LXDDKEZF.field906 != -1) {
				int var25 = LXDDKEZF.field906;
				int var26 = LXDDKEZF.field907;
				boolean var27 = method64(var26, 0, var25, 0, 0, 0, 0, true, field65.field732[0], 0, field65.field733[0]);
				LXDDKEZF.field906 = -1;

				if (var27) {
					field246 = field24;
					field247 = field25;
					field249 = 1;
					field248 = 0;
				}
			}

			if (field23 == 1 && field61 != null) {
				field61 = null;
				field303 = true;
				field23 = 0;
			}

			method26();

			if (field252 == -1) {
				method35();
				method149();
				method68();
			}

			if (field16 == 1 || field23 == 1) {
				field251++;
			}

			if (field117 == 0 && field135 == 0 && field194 == 0) {
				if (field339 > 0) {
					field339--;
				}
			} else if (field339 < 100) {
				field339++;
				if (field339 == 100) {
					if (field117 != 0) {
						field303 = true;
					}

					if (field135 != 0) {
						field384 = true;
					}
				}
			}

			if (field124 == 2) {
				method135();
			}

			if (field124 == 2 && field355) {
				method29();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field297[var28]++;
			}

			method110();
			field338++;
			if (field338 > 101) {
				field338 = 0;
				field343.method191(39);
				field343.method196(0);
			}

			field15++;
			if (field15 > 4500) {
				field219 = 250;
				field15 -= 500;
				field343.method191(50);
			}

			field98++;
			if (field98 > 500) {
				field98 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field461 += field462;
				}

				if ((var29 & 0x2) == 2) {
					field257 += field258;
				}

				if ((var29 & 0x4) == 4) {
					field385 += field386;
				}
			}

			if (field461 < -50) {
				field462 = 2;
			}

			if (field461 > 50) {
				field462 = -2;
			}

			if (field257 < -55) {
				field258 = 2;
			}

			if (field257 > 55) {
				field258 = -2;
			}

			if (field385 < -40) {
				field386 = 1;
			}

			if (field385 > 40) {
				field386 = -1;
			}

			field275++;
			if (field275 > 500) {
				field275 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field143 += field144;
				}

				if ((var30 & 0x2) == 2) {
					field170 += field171;
				}
			}

			if (field143 < -60) {
				field144 = 2;
			}

			if (field143 > 60) {
				field144 = -2;
			}

			if (field170 < -20) {
				field171 = 1;
			}

			if (field170 > 10) {
				field171 = -1;
			}

			field218++;
			if (field218 > 50) {
				field343.method191(135);
			}

			try {
				if (field115 != null && field343.field667 > 0) {
					field115.method587(field343.field666, 0, field343.field667);
					field343.field667 = 0;
					field218 = 0;
				}
			} catch (IOException var32) {
				method74();
			} catch (Exception var33) {
				method76();
			}
		}
	}

	@ObfuscatedName("client.c(LGHHPHSRU;II)V")
	public final void method143(GHHPHSRU arg0, int arg1) {
		for (int var3 = 0; var3 < field403; var3++) {
			int var4 = field404[var3];
			EJJAKGTE var5 = field400[var4];
			int var6 = arg0.method202();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method202() << 8;
			}

			method133(var6, var4, arg0, var5);
		}
	}

	@ObfuscatedName("client.v(B)Z")
	public final boolean method144() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.w(B)V")
	public final void method145() {
		if (field168 == 2) {
			method132((field86 - field99 << 7) + field89, (field87 - field100 << 7) + field90, field88 * 2);

			if (field301 > -1 && field372 % 20 < 10) {
				field94[0].method376(field302 - 28, field301 - 12);
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public static final void method146() {
		LXDDKEZF.field872 = false;
		QAMTFDSD.field1141 = false;
		field240 = false;
		PMCVBMMY.field1110 = false;
		MKWUPJYP.field956 = false;
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method147(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ZILGHHPHSRU;)V")
	public final void method148(int arg0, GHHPHSRU arg1) {
		while (arg1.field668 + 10 < arg0 * 8) {
			int var3 = arg1.method213(11);
			if (var3 == 2047) {
				break;
			}

			if (field400[var3] == null) {
				field400[var3] = new EJJAKGTE();
				if (field405[var3] != null) {
					field400[var3].method173(field405[var3]);
				}
			}

			field402[field401++] = var3;
			EJJAKGTE var4 = field400[var3];
			var4.field752 = field372;
			int var5 = arg1.method213(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method213(1);
			int var7 = arg1.method213(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method213(1);
			if (var8 == 1) {
				field404[field403++] = var3;
			}

			var4.method242(field65.field732[0] + var5, field65.field733[0] + var7, var6 == 1);
		}

		arg1.method214();
	}

	@ObfuscatedName("client.x(B)V")
	public final void method149() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field479[0] != -1) {
				field384 = true;
				field457 = 0;
				field419 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field479[1] != -1) {
				field384 = true;
				field457 = 1;
				field419 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field479[2] != -1) {
				field384 = true;
				field457 = 2;
				field419 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field479[3] != -1) {
				field384 = true;
				field457 = 3;
				field419 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field479[4] != -1) {
				field384 = true;
				field457 = 4;
				field419 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field479[5] != -1) {
				field384 = true;
				field457 = 5;
				field419 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field479[6] != -1) {
				field384 = true;
				field457 = 6;
				field419 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field479[7] != -1) {
				field384 = true;
				field457 = 7;
				field419 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field479[8] != -1) {
				field384 = true;
				field457 = 8;
				field419 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field479[9] != -1) {
				field384 = true;
				field457 = 9;
				field419 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field479[10] != -1) {
				field384 = true;
				field457 = 10;
				field419 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field479[11] != -1) {
				field384 = true;
				field457 = 11;
				field419 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field479[12] != -1) {
				field384 = true;
				field457 = 12;
				field419 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field479[13] != -1) {
				field384 = true;
				field457 = 13;
				field419 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.y(B)Z")
	public final boolean method150() {
		if (field115 == null) {
			return false;
		}

		try {
			int var1 = field115.method585();
			if (var1 == 0) {
				return false;
			}

			if (field216 == -1) {
				field115.method586(field224.field666, 0, 1);
				field216 = field224.field666[0] & 0xFF;
				if (field79 != null) {
					field216 = field216 - field79.method533() & 0xFF;
				}

				field215 = XOUZVKCI.field1401[field216];
				var1--;
			}

			if (field215 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field115.method586(field224.field666, 0, 1);
				field215 = field224.field666[0] & 0xFF;
				var1--;
			}

			if (field215 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field115.method586(field224.field666, 0, 2);
				field224.field667 = 0;
				field215 = field224.method204();
				var1 -= 2;
			}

			if (var1 < field215) {
				return false;
			}

			field224.field667 = 0;
			field115.method586(field224.field666, 0, field215);
			field217 = 0;
			field327 = field326;
			field326 = field325;
			field325 = field216;

			if (field216 == 102) {
				method49(field215, field224);
				field216 = -1;
				return true;
			}

			if (field216 == 148) {
				int var2 = field224.method204();
				int var3 = field224.method231();
				EKHKDMUP.method174(var3).field587 = 2;
				EKHKDMUP.method174(var3).field588 = var2;
				field216 = -1;
				return true;
			}

			if (field216 == 193) {
				int var4 = field224.method229();
				int var5 = field224.method204();
				int var6 = field224.method230();
				EKHKDMUP.method174(var6).field578 = (var4 << 16) + var5;
				field216 = -1;
				return true;
			}

			if (field216 == 220) {
				int var7 = field224.method204();
				int var8 = field224.method202();
				int var9 = field224.method204();
				if (field220 && !field240 && field304 < 50) {
					field298[field304] = var7;
					field393[field304] = var8;
					field341[field304] = VYSYBHPS.field1356[var7] + var9;
					field304++;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 109) {
				method76();
				field216 = -1;
				return false;
			}

			if (field216 == 212) {
				field168 = field224.method202();
				if (field168 == 1) {
					field391 = field224.method204();
				}

				if (field168 >= 2 && field168 <= 6) {
					if (field168 == 2) {
						field89 = 64;
						field90 = 64;
					}

					if (field168 == 3) {
						field89 = 0;
						field90 = 64;
					}

					if (field168 == 4) {
						field89 = 128;
						field90 = 64;
					}

					if (field168 == 5) {
						field89 = 64;
						field90 = 0;
					}

					if (field168 == 6) {
						field89 = 64;
						field90 = 128;
					}

					field168 = 2;
					field86 = field224.method204();
					field87 = field224.method204();
					field88 = field224.method202();
				}

				if (field168 == 10) {
					field458 = field224.method204();
				}

				field216 = -1;
				return true;
			}

			if (field216 == 130) {
				field388 = false;
				field295 = 2;
				field340 = "";
				field303 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 124) {
				if (field457 == 12) {
					field384 = true;
				}

				field367 = field224.method205();
				field216 = -1;
				return true;
			}

			if (field216 == 3) {
				int var10 = field224.method230();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				if (field84 != var10 && field208 && !field240 && field356 == 0) {
					field364 = var10;
					field365 = true;
					field73.method576(2, field364);
				}

				field84 = var10;
				field216 = -1;
				return true;
			}

			if (field216 == 62) {
				int var11 = field224.method234();
				int var12 = field224.method231();
				if (field208 && !field240) {
					field364 = var12;
					field365 = false;
					field73.method576(2, field364);
					field356 = var11;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 70) {
				int var13 = field224.method231();
				int var14 = field224.method233();
				EKHKDMUP var15 = EKHKDMUP.method174(var13);
				if (var15.field579 != var14 || var14 == -1) {
					var15.field579 = var14;
					var15.field644 = 0;
					var15.field622 = 0;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 37) {
				field322 = field224.method221();
				field321 = field224.method222();
				field216 = -1;
				return true;
			}

			if (field216 == 163) {
				field229 = field224.method202();
				field384 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 117) {
				field394 = field224.method202();
				field311 = field224.method202();
				field165 = field224.method202();
				field245 = true;
				field303 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 228) {
				int var16 = field224.method231();
				int var17 = field224.method230();

				if (field59 != -1) {
					method92(field59);
					field59 = -1;
					field303 = true;
				}

				if (field252 != -1) {
					method92(field252);
					field252 = -1;
					field276 = true;
				}

				if (field129 != -1) {
					method92(field129);
					field129 = -1;
				}

				if (field69 != var16) {
					method92(field69);
					field69 = var16;
				}

				if (field167 != var17) {
					method92(field167);
					field167 = var17;
				}

				if (field295 != 0) {
					field295 = 0;
					field303 = true;
				}

				field384 = true;
				field419 = true;
				field235 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 211) {
				int var18 = field224.method204();
				method100(var18);

				if (field59 != -1) {
					method92(field59);
					field59 = -1;
					field303 = true;
				}

				if (field252 != -1) {
					method92(field252);
					field252 = -1;
					field276 = true;
				}

				if (field129 != -1) {
					method92(field129);
					field129 = -1;
				}

				if (field69 != -1) {
					method92(field69);
					field69 = -1;
				}

				if (field167 != var18) {
					method92(field167);
					field167 = var18;
				}

				if (field295 != 0) {
					field295 = 0;
					field303 = true;
				}

				field384 = true;
				field419 = true;
				field235 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 36) {
				field355 = true;
				field409 = field224.method202();
				field410 = field224.method202();
				field411 = field224.method204();
				field412 = field224.method202();
				field413 = field224.method202();
				if (field413 >= 100) {
					field286 = field409 * 128 + 64;
					field288 = field410 * 128 + 64;
					field287 = method34(field288, field91, field286) - field411;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 178) {
				field443 = field224.method204();
				field104 = field224.method202();
				field216 = -1;
				return true;
			}

			if (field216 == 251) {
				if (field167 != -1) {
					method92(field167);
					field167 = -1;
					field384 = true;
					field419 = true;
				}

				if (field59 != -1) {
					method92(field59);
					field59 = -1;
					field303 = true;
				}

				if (field252 != -1) {
					method92(field252);
					field252 = -1;
					field276 = true;
				}

				if (field129 != -1) {
					method92(field129);
					field129 = -1;
				}

				if (field69 != -1) {
					method92(field69);
					field69 = -1;
				}

				if (field295 != 0) {
					field295 = 0;
					field303 = true;
				}

				field235 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 122 || field216 == 159) {
				int var19 = field154;
				int var20 = field155;
				if (field216 == 122) {
					var20 = field224.method229();
					var19 = field224.method230();
					field166 = false;
				}

				if (field216 == 159) {
					field224.method212();

					for (int var21 = 0; var21 < 4; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							for (int var23 = 0; var23 < 13; var23++) {
								int var24 = field224.method213(1);
								if (var24 == 1) {
									field314[var21][var22][var23] = field224.method213(26);
								} else {
									field314[var21][var22][var23] = -1;
								}
							}
						}
					}

					field224.method214();
					var19 = field224.method230();
					var20 = field224.method230();
					field166 = true;
				}

				if (field154 == var19 && field155 == var20 && field124 == 2) {
					field216 = -1;
					return true;
				}

				field154 = var19;
				field155 = var20;
				field99 = (field154 - 6) * 8;
				field100 = (field155 - 6) * 8;
				field459 = false;
				if ((field154 / 8 == 48 || field154 / 8 == 49) && field155 / 8 == 48) {
					field459 = true;
				}

				if (field154 / 8 == 48 && field155 / 8 == 148) {
					field459 = true;
				}

				field124 = 1;
				field369 = System.currentTimeMillis();
				method77("Loading - please wait.", null);

				if (field216 == 122) {
					int var25 = 0;
					for (int var26 = (field154 - 6) / 8; var26 <= (field154 + 6) / 8; var26++) {
						for (int var27 = (field155 - 6) / 8; var27 <= (field155 + 6) / 8; var27++) {
							var25++;
						}
					}

					field232 = new byte[var25][];
					field52 = new byte[var25][];
					field254 = new int[var25];
					field255 = new int[var25];
					field256 = new int[var25];
					int var28 = 0;
					for (int var29 = (field154 - 6) / 8; var29 <= (field154 + 6) / 8; var29++) {
						for (int var30 = (field155 - 6) / 8; var30 <= (field155 + 6) / 8; var30++) {
							field254[var28] = (var29 << 8) + var30;

							if (field459 && (var30 == 49 || var30 == 149 || var30 == 147 || var29 == 50 || var29 == 49 && var30 == 47)) {
								field255[var28] = -1;
								field256[var28] = -1;
								var28++;
							} else {
								int var31 = field255[var28] = field73.method561(var30, var29, 0);
								if (var31 != -1) {
									field73.method576(3, var31);
								}

								int var32 = field256[var28] = field73.method561(var30, var29, 1);
								if (var32 != -1) {
									field73.method576(3, var32);
								}

								var28++;
							}
						}
					}
				}

				if (field216 == 159) {
					int var33 = 0;
					int[] var34 = new int[676];
					for (int var35 = 0; var35 < 4; var35++) {
						for (int var36 = 0; var36 < 13; var36++) {
							for (int var37 = 0; var37 < 13; var37++) {
								int var38 = field314[var35][var36][var37];
								if (var38 != -1) {
									int var39 = var38 >> 14 & 0x3FF;
									int var40 = var38 >> 3 & 0x7FF;
									int var41 = (var39 / 8 << 8) + var40 / 8;
									for (int var42 = 0; var42 < var33; var42++) {
										if (var34[var42] == var41) {
											var41 = -1;
											break;
										}
									}

									if (var41 != -1) {
										var34[var33++] = var41;
									}
								}
							}
						}
					}

					field232 = new byte[var33][];
					field52 = new byte[var33][];
					field254 = new int[var33];
					field255 = new int[var33];
					field256 = new int[var33];
					for (int var43 = 0; var43 < var33; var43++) {
						int var44 = field254[var43] = var34[var43];
						int var45 = var44 >> 8 & 0xFF;
						int var46 = var44 & 0xFF;
						int var47 = field255[var43] = field73.method561(var46, var45, 0);
						if (var47 != -1) {
							field73.method576(3, var47);
						}

						int var48 = field256[var43] = field73.method561(var46, var45, 1);
						if (var48 != -1) {
							field73.method576(3, var48);
						}
					}
				}

				int var49 = field99 - field101;
				int var50 = field100 - field102;
				field101 = field99;
				field102 = field100;

				for (int var51 = 0; var51 < 16384; var51++) {
					LJAXEEYT var52 = field361[var51];
					if (var52 != null) {
						for (int var53 = 0; var53 < 10; var53++) {
							var52.field732[var53] -= var49;
							var52.field733[var53] -= var50;
						}

						var52.field741 -= var49 * 128;
						var52.field742 -= var50 * 128;
					}
				}

				for (int var54 = 0; var54 < field398; var54++) {
					EJJAKGTE var55 = field400[var54];
					if (var55 != null) {
						for (int var56 = 0; var56 < 10; var56++) {
							var55.field732[var56] -= var49;
							var55.field733[var56] -= var50;
						}

						var55.field741 -= var49 * 128;
						var55.field742 -= var50 * 128;
					}
				}

				field191 = true;
				byte var57 = 0;
				byte var58 = 104;
				byte var59 = 1;
				if (var49 < 0) {
					var57 = 103;
					var58 = -1;
					var59 = -1;
				}

				byte var60 = 0;
				byte var61 = 104;
				byte var62 = 1;
				if (var50 < 0) {
					var60 = 103;
					var61 = -1;
					var62 = -1;
				}

				for (int var63 = var57; var63 != var58; var63 += var59) {
					for (int var64 = var60; var64 != var61; var64 += var62) {
						int var65 = var49 + var63;
						int var66 = var50 + var64;
						for (int var67 = 0; var67 < 4; var67++) {
							if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
								field141[var67][var63][var64] = field141[var67][var65][var66];
							} else {
								field141[var67][var63][var64] = null;
							}
						}
					}
				}

				for (FNOFBEYP var68 = (FNOFBEYP) field221.method519(); var68 != null; var68 = (FNOFBEYP) field221.method521()) {
					var68.field664 -= var49;
					var68.field665 -= var50;
					if (var68.field664 < 0 || var68.field665 < 0 || var68.field664 >= 104 || var68.field665 >= 104) {
						var68.method19();
					}
				}

				if (field425 != 0) {
					field425 -= var49;
					field426 -= var50;
				}

				field355 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 97) {
				for (int var69 = 0; var69 < field477.length; var69++) {
					if (field477[var69] != field466[var69]) {
						field477[var69] = field466[var69];
						method60(var69);
						field384 = true;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 146) {
				field388 = false;
				field295 = 1;
				field340 = "";
				field303 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 57) {
				field381 = field224.method222();
				if (field457 == field381) {
					if (field381 == 3) {
						field457 = 1;
					} else {
						field457 = 3;
					}

					field384 = true;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 21) {
				String var70 = field224.method209();
				if (var70.endsWith(":tradereq:")) {
					String var71 = var70.substring(0, var70.indexOf(":"));
					long var72 = VSUIHULP.method510(var71);
					boolean var74 = false;
					for (int var75 = 0; var75 < field188; var75++) {
						if (field429[var75] == var72) {
							var74 = true;
							break;
						}
					}

					if (!var74 && field313 == 0) {
						method31(var71, "wishes to trade with you.", 4);
					}
				} else if (var70.endsWith(":duelreq:")) {
					String var76 = var70.substring(0, var70.indexOf(":"));
					long var77 = VSUIHULP.method510(var76);
					boolean var79 = false;
					for (int var80 = 0; var80 < field188; var80++) {
						if (field429[var80] == var77) {
							var79 = true;
							break;
						}
					}

					if (!var79 && field313 == 0) {
						method31(var76, "wishes to duel with you.", 8);
					}
				} else if (var70.endsWith(":chalreq:")) {
					String var81 = var70.substring(0, var70.indexOf(":"));
					long var82 = VSUIHULP.method510(var81);
					boolean var84 = false;
					for (int var85 = 0; var85 < field188; var85++) {
						if (field429[var85] == var82) {
							var84 = true;
							break;
						}
					}

					if (!var84 && field313 == 0) {
						String var86 = var70.substring(var70.indexOf(":") + 1, var70.length() - 9);
						method31(var81, var86, 8);
					}
				} else {
					method31("", var70, 0);
				}

				field216 = -1;
				return true;
			}

			if (field216 == 42) {
				field212 = field224.method231() * 30;
				field216 = -1;
				return true;
			}

			if (field216 == 69) {
				int var87 = field224.method229();
				int var88 = field224.method207();
				field466[var87] = var88;

				if (field477[var87] != var88) {
					field477[var87] = var88;
					method60(var87);
					field384 = true;

					if (field120 != -1) {
						field303 = true;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 86) {
				for (int var89 = 0; var89 < field400.length; var89++) {
					if (field400[var89] != null) {
						field400[var89].field736 = -1;
					}
				}

				for (int var90 = 0; var90 < field361.length; var90++) {
					if (field361[var90] != null) {
						field361[var90].field736 = -1;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 33) {
				int var91 = field224.method204();
				int var92 = field224.method231();
				int var93 = var91 >> 10 & 0x1F;
				int var94 = var91 >> 5 & 0x1F;
				int var95 = var91 & 0x1F;
				EKHKDMUP.method174(var92).field624 = (var95 << 3) + (var93 << 19) + (var94 << 11);
				field216 = -1;
				return true;
			}

			if (field216 == 41) {
				int var96 = field224.method230();
				int var97 = field224.method231();
				method100(var96);

				if (var97 != -1) {
					method100(var97);
				}

				if (field69 != -1) {
					method92(field69);
					field69 = -1;
				}

				if (field167 != -1) {
					method92(field167);
					field167 = -1;
				}

				if (field59 != -1) {
					method92(field59);
					field59 = -1;
				}

				if (field252 != var96) {
					method92(field252);
					field252 = var96;
				}

				if (field129 != var96) {
					method92(field129);
					field129 = var97;
				}

				field295 = 0;
				field235 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 171) {
				int var98 = field224.method232();
				if (var98 >= 0) {
					method100(var98);
				}

				if (field51 != var98) {
					method92(field51);
					field51 = var98;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 73) {
				int var99 = field224.method231();
				int var100 = field224.method230();
				int var101 = field224.method231();
				int var102 = field224.method230();
				EKHKDMUP.method174(var101).field614 = var102;
				EKHKDMUP.method174(var101).field615 = var99;
				EKHKDMUP.method174(var101).field613 = var100;
				field216 = -1;
				return true;
			}

			if (field216 == 89) {
				long var103 = field224.method208();
				int var105 = field224.method207();
				int var106 = field224.method202();
				boolean var107 = false;
				for (int var108 = 0; var108 < 100; var108++) {
					if (field176[var108] == var105) {
						var107 = true;
						break;
					}
				}

				if (var106 <= 1) {
					for (int var109 = 0; var109 < field188; var109++) {
						if (field429[var109] == var103) {
							var107 = true;
							break;
						}
					}
				}

				if (!var107 && field313 == 0) {
					try {
						field176[field54] = var105;
						field54 = (field54 + 1) % 100;
						String var110 = QFWDHRAY.method464(field224, field215 - 13);
						if (var106 != 3) {
							var110 = HGSXEUXP.method255(var110);
						}

						if (var106 == 2 || var106 == 3) {
							method31("@cr2@" + VSUIHULP.method514(VSUIHULP.method511(var103)), var110, 7);
						} else if (var106 == 1) {
							method31("@cr1@" + VSUIHULP.method514(VSUIHULP.method511(var103)), var110, 7);
						} else {
							method31(VSUIHULP.method514(VSUIHULP.method511(var103)), var110, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 138) {
				int var112 = field224.method230();
				EKHKDMUP.method174(var112).field587 = 3;

				if (field65.field549 == null) {
					EKHKDMUP.method174(var112).field588 = (field65.field548[11] << 5) + (field65.field548[8] << 10) + (field65.field548[0] << 15) + (field65.field554[0] << 25) + (field65.field554[4] << 20) + field65.field548[1];
				} else {
					EKHKDMUP.method174(var112).field588 = (int) (field65.field549.field527 + 0x12345678L);
				}

				field216 = -1;
				return true;
			}

			if (field216 == 240) {
				int var113 = field224.method229();
				int var114 = field224.method230();
				EKHKDMUP var115 = EKHKDMUP.method174(var114);
				if (var115 != null && var115.field625 == 0) {
					if (var113 < 0) {
						var113 = 0;
					}

					if (var113 > var115.field576 - var115.field609) {
						var113 = var115.field576 - var115.field609;
					}

					var115.field596 = var113;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 176) {
				int var116 = field224.method230();
				int var117 = field224.method230();
				EKHKDMUP.method174(var116).field587 = 1;
				EKHKDMUP.method174(var116).field588 = var117;
				field216 = -1;
				return true;
			}

			if (field216 == 67) {
				int var118 = field224.method202();
				int var119 = field224.method202();
				int var120 = field224.method202();
				int var121 = field224.method202();
				field204[var118] = true;
				field190[var118] = var119;
				field83[var118] = var120;
				field223[var118] = var121;
				field297[var118] = 0;
				field216 = -1;
				return true;
			}

			if (field216 == 137) {
				if (field457 == 12) {
					field384 = true;
				}

				field277 = field224.method202();
				field216 = -1;
				return true;
			}

			if (field216 == 129) {
				method85(field215, field224);
				field191 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 16) {
				field384 = true;
				int var122 = field224.method204();
				EKHKDMUP var123 = EKHKDMUP.method174(var122);
				int var124 = field224.method204();
				for (int var125 = 0; var125 < var124; var125++) {
					var123.field574[var125] = field224.method231();
					int var126 = field224.method221();
					if (var126 == 255) {
						var126 = field224.method237();
					}

					var123.field633[var125] = var126;
				}

				for (int var127 = var124; var127 < var123.field574.length; var127++) {
					var123.field574[var127] = 0;
					var123.field633[var127] = 0;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 210) {
				field205 = field224.method202();
				field216 = -1;
				return true;
			}

			if (field216 == 166) {
				field321 = field224.method223();
				field322 = field224.method221();

				while (field224.field667 < field215) {
					int var128 = field224.method202();
					method141(var128, field224);
				}

				field216 = -1;
				return true;
			}

			if (field216 == 105) {
				int var129 = field224.method229();
				EKHKDMUP var130 = EKHKDMUP.method174(var129);
				for (int var131 = 0; var131 < var130.field574.length; var131++) {
					var130.field574[var131] = -1;
					var130.field574[var131] = 0;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 72) {
				int var132 = field224.method205();
				if (field120 != var132) {
					method92(field120);
					field120 = var132;
				}

				field303 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 46) {
				int var133 = field224.method221();
				int var134 = field224.method229();
				if (var134 == 0xFFFF) {
					var134 = -1;
				}

				if (field479[var133] != var134) {
					method92(field479[var133]);
					field479[var133] = var134;
				}

				field384 = true;
				field419 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 239) {
				int var135 = field224.method230();
				String var136 = field224.method209();
				EKHKDMUP.method174(var135).field612 = var136;

				if (field479[field457] == EKHKDMUP.method174(var135).field597) {
					field384 = true;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 29) {
				int var137 = field224.method231();
				boolean var138 = field224.method223() == 1;
				EKHKDMUP.method174(var137).field617 = var138;
				field216 = -1;
				return true;
			}

			if (field216 == 186) {
				int var139 = field224.method232();
				int var140 = field224.method231();
				int var141 = field224.method232();
				EKHKDMUP var142 = EKHKDMUP.method174(var140);
				var142.field584 = var141;
				var142.field585 = var139;
				field216 = -1;
				return true;
			}

			if (field216 == 99) {
				int var143 = field224.method230();
				method100(var143);

				if (field167 != -1) {
					method92(field167);
					field167 = -1;
					field384 = true;
					field419 = true;
				}

				if (field252 != -1) {
					method92(field252);
					field252 = -1;
					field276 = true;
				}

				if (field129 != -1) {
					method92(field129);
					field129 = -1;
				}

				if (field69 != -1) {
					method92(field69);
					field69 = -1;
				}

				if (field59 != var143) {
					method92(field59);
					field59 = var143;
				}

				field235 = false;
				field303 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 156) {
				field425 = 0;
				field216 = -1;
				return true;
			}

			if (field216 == 246 || field216 == 225 || field216 == 195 || field216 == 249 || field216 == 18 || field216 == 191 || field216 == 59 || field216 == 80 || field216 == 234 || field216 == 213 || field216 == 35) {
				method141(field216, field224);
				field216 = -1;
				return true;
			}

			if (field216 == 207) {
				String var144 = field224.method209();
				int var145 = field224.method202();
				int var146 = field224.method202();
				if (var145 >= 1 && var145 <= 5) {
					if (var144.equalsIgnoreCase("null")) {
						var144 = null;
					}

					field126[var145 - 1] = var144;
					field127[var145 - 1] = var146 == 0;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 76) {
				field355 = false;

				for (int var147 = 0; var147 < 5; var147++) {
					field204[var147] = false;
				}

				field216 = -1;
				return true;
			}

			if (field216 == 222) {
				field188 = field215 / 8;
				for (int var148 = 0; var148 < field188; var148++) {
					field429[var148] = field224.method208();
				}

				field216 = -1;
				return true;
			}

			if (field216 == 61) {
				field396 = field224.method202();
				field216 = -1;
				return true;
			}

			if (field216 == 217) {
				int var149 = field224.method230();
				int var150 = field224.method204();
				int var151 = field224.method231();

				if (var150 == 0xFFFF) {
					EKHKDMUP.method174(var149).field587 = 0;
					field216 = -1;
					return true;
				}

				ZKNJTNWP var152 = ZKNJTNWP.method590(var150);
				EKHKDMUP.method174(var149).field587 = 4;
				EKHKDMUP.method174(var149).field588 = var150;
				EKHKDMUP.method174(var149).field614 = var152.field1490;
				EKHKDMUP.method174(var149).field615 = var152.field1478;
				EKHKDMUP.method174(var149).field613 = var152.field1486 * 100 / var151;
				field216 = -1;
				return true;
			}

			if (field216 == 199) {
				long var153 = field224.method208();
				int var155 = field224.method202();
				String var156 = VSUIHULP.method514(VSUIHULP.method511(var153));
				for (int var157 = 0; var157 < field228; var157++) {
					if (field209[var157] == var153) {
						if (field180[var157] != var155) {
							field180[var157] = var155;
							field384 = true;

							if (var155 > 0) {
								method31("", var156 + " has logged in.", 5);
							}

							if (var155 == 0) {
								method31("", var156 + " has logged out.", 5);
							}
						}

						var156 = null;
						break;
					}
				}

				if (var156 != null && field228 < 200) {
					field209[field228] = var153;
					field179[field228] = var156;
					field180[field228] = var155;
					field228++;
					field384 = true;
				}

				boolean var158 = false;
				while (!var158) {
					var158 = true;
					for (int var159 = 0; var159 < field228 - 1; var159++) {
						if (field180[var159] != field237 && field180[var159 + 1] == field237 || field180[var159] == 0 && field180[var159 + 1] != 0) {
							int var160 = field180[var159];
							field180[var159] = field180[var159 + 1];
							field180[var159 + 1] = var160;
							String var161 = field179[var159];
							field179[var159] = field179[var159 + 1];
							field179[var159 + 1] = var161;
							long var162 = field209[var159];
							field209[var159] = field209[var159 + 1];
							field209[var159 + 1] = var162;
							field384 = true;
							var158 = false;
						}
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 27) {
				field384 = true;
				int var164 = field224.method204();
				EKHKDMUP var165 = EKHKDMUP.method174(var164);
				while (field224.field667 < field215) {
					int var166 = field224.method216();
					int var167 = field224.method204();
					int var168 = field224.method202();
					if (var168 == 255) {
						var168 = field224.method207();
					}

					if (var166 >= 0 && var166 < var165.field574.length) {
						var165.field574[var166] = var167;
						var165.field633[var166] = var168;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 90) {
				field321 = field224.method223();
				field322 = field224.method202();
				for (int var169 = field321; var169 < field321 + 8; var169++) {
					for (int var170 = field322; var170 < field322 + 8; var170++) {
						if (field141[field91][var169][var170] != null) {
							field141[field91][var169][var170] = null;
							method134(var169, var170);
						}
					}
				}

				for (FNOFBEYP var171 = (FNOFBEYP) field221.method519(); var171 != null; var171 = (FNOFBEYP) field221.method521()) {
					if (var171.field664 >= field321 && var171.field664 < field321 + 8 && var171.field665 >= field322 && var171.field665 < field322 + 8 && field91 == var171.field662) {
						var171.field657 = 0;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 135) {
				int var172 = field224.method204();
				method100(var172);

				if (field167 != -1) {
					method92(field167);
					field167 = -1;
					field384 = true;
					field419 = true;
				}

				if (field59 != -1) {
					method92(field59);
					field59 = -1;
					field303 = true;
				}

				if (field252 != -1) {
					method92(field252);
					field252 = -1;
					field276 = true;
				}

				if (field129 != -1) {
					method92(field129);
					field129 = -1;
				}

				if (field69 != var172) {
					method92(field69);
					field69 = var172;
				}

				if (field295 != 0) {
					field295 = 0;
					field303 = true;
				}

				field235 = false;
				field216 = -1;
				return true;
			}

			if (field216 == 181) {
				field384 = true;
				int var173 = field224.method237();
				int var174 = field224.method222();
				int var175 = field224.method221();
				field283[var175] = var173;
				field310[var175] = var174;
				field233[var175] = 1;
				for (int var176 = 0; var176 < 98; var176++) {
					if (var173 >= field460[var176]) {
						field233[var175] = var176 + 2;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 2) {
				field457 = field224.method221();
				field384 = true;
				field419 = true;
				field216 = -1;
				return true;
			}

			if (field216 == 101) {
				field467 = field224.method231();
				field53 = field224.method236();
				field195 = field224.method229();
				field319 = field224.method204();
				field374 = field224.method202();
				field224.method231();
				field97 = field224.method204();
				field224.method230();
				field441 = field224.method230();
				field368 = field224.method231();
				field174 = field224.method229();
				signlink.dnslookup(VSUIHULP.method513(field53));
				field216 = -1;
				return true;
			}

			if (field216 == 31) {
				field355 = true;
				field259 = field224.method202();
				field260 = field224.method202();
				field261 = field224.method204();
				field262 = field224.method202();
				field263 = field224.method202();
				if (field263 >= 100) {
					int var177 = field259 * 128 + 64;
					int var178 = field260 * 128 + 64;
					int var179 = method34(var178, field91, var177) - field261;
					int var180 = var177 - field286;
					int var181 = var179 - field287;
					int var182 = var178 - field288;
					int var183 = (int) Math.sqrt(var180 * var180 + var182 * var182);
					field289 = (int) (Math.atan2(var181, var183) * 325.949D) & 0x7FF;
					field290 = (int) (Math.atan2(var180, var182) * -325.949D) & 0x7FF;

					if (field289 < 128) {
						field289 = 128;
					}

					if (field289 > 383) {
						field289 = 383;
					}
				}

				field216 = -1;
				return true;
			}

			if (field216 == 232) {
				int var184 = field224.method231();
				byte var185 = field224.method224();
				field466[var184] = var185;

				if (field477[var184] != var185) {
					field477[var184] = var185;
					method60(var184);
					field384 = true;

					if (field120 != -1) {
						field303 = true;
					}
				}

				field216 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field216 + "," + field215 + " - " + field326 + "," + field327);
			method76();
		} catch (IOException var190) {
			method74();
		} catch (Exception var191) {
			String var187 = "T2 - " + field216 + "," + field326 + "," + field327 + " - " + field215 + "," + (field65.field732[0] + field99) + "," + (field65.field733[0] + field100) + " - ";
			for (int var188 = 0; var188 < field215 && var188 < 50; var188++) {
				var187 = var187 + field224.field666[var188] + ",";
			}

			signlink.reporterror(var187);
			method76();
		}

		return true;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method151() {
		method57();

		if (field249 == 1) {
			field156[field248 / 100].method376(field247 - 8 - 4, field246 - 8 - 4);
		}

		if (field249 == 2) {
			field156[field248 / 100 + 4].method376(field247 - 8 - 4, field246 - 8 - 4);
			field397++;
			if (field397 > 52) {
				field397 = 0;
				field343.method191(103);
			}
		}

		if (field51 != -1) {
			method79(field305, field51);
			method122(0, 0, EKHKDMUP.method174(field51), 0);
		}

		if (field69 != -1) {
			method79(field305, field69);
			method122(0, 0, EKHKDMUP.method174(field69), 0);
		}

		method98();

		if (!field264) {
			method109();
			method112();
		} else if (field375 == 0) {
			method90();
		}

		if (field396 == 1) {
			field475.method376(296, 472);
		}

		if (field440) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 30 && field240) {
				var3 = 0xFF0000;
			}

			if (field5 < 20 && !field240) {
				var3 = 0xFF0000;
			}

			field416.method472(var3, var1, var2, "Fps:" + field5);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field240) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field240) {
				int var8 = 0xFF0000;
			}

			field416.method472(0xFFFF00, var1, var2, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field212 != 0) {
			int var9 = field212 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field416.method477(0xFFFF00, "System update in: " + var10 + ":0" + var9, 329, 4);
			} else {
				field416.method477(0xFFFF00, "System update in: " + var10 + ":" + var9, 329, 4);
			}

			field81++;
			if (field81 > 77) {
				field81 = 0;
				field343.method191(29);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method152(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field292 = "";
				field293 = "Connecting to server...";
				method94(true);
			}

			field115 = new YQNDWKQR(this, method119(field238 + 43594));
			long var4 = VSUIHULP.method510(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field343.field667 = 0;
			field343.method192(14);
			field343.method192(var6);
			field115.method587(field343.field666, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field115.method584();
			}

			int var8 = field115.method584();
			int var9 = var8;

			if (var8 == 0) {
				field115.method586(field224.field666, 0, 8);
				field224.field667 = 0;
				field250 = field224.method208();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field250 >> 32), (int) field250 };
				field343.field667 = 0;
				field343.method192(10);
				field343.method196(var10[0]);
				field343.method196(var10[1]);
				field343.method196(var10[2]);
				field343.method196(var10[3]);
				field343.method196(signlink.uid);
				field343.method199(arg0);
				field343.method199(arg1);
				field343.method217(field177, field137);
				field450.field667 = 0;

				if (arg2) {
					field450.method192(18);
				} else {
					field450.method192(16);
				}

				field450.method192(field343.field667 + 36 + 1 + 1 + 2);
				field450.method192(255);
				field450.method193(345);
				field450.method192(field240 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field450.method196(field476[var11]);
				}

				field450.method200(field343.field666, 0, field343.field667);
				field343.field671 = new WBHAMUQI(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field79 = new WBHAMUQI(var10);
				field115.method587(field450.field666, 0, field450.field667);
				var8 = field115.method584();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method152(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field468 = field115.method584();
				field422 = field115.method584() == 1;
				field480 = 0L;
				field121 = 0;
				field294.field1464 = 0;
				field14 = true;
				field192 = true;
				field206 = true;
				field343.field667 = 0;
				field224.field667 = 0;
				field216 = -1;
				field325 = -1;
				field326 = -1;
				field327 = -1;
				field215 = 0;
				field217 = 0;
				field212 = 0;
				field219 = 0;
				field168 = 0;
				field389 = 0;
				field264 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field140[var13] = null;
				}

				field445 = 0;
				field332 = 0;
				field124 = 0;
				field304 = 0;
				field461 = (int) (Math.random() * 100.0D) - 50;
				field257 = (int) (Math.random() * 110.0D) - 55;
				field385 = (int) (Math.random() * 80.0D) - 40;
				field143 = (int) (Math.random() * 120.0D) - 60;
				field170 = (int) (Math.random() * 30.0D) - 20;
				field431 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field205 = 0;
				field359 = -1;
				field425 = 0;
				field426 = 0;
				field401 = 0;
				field362 = 0;

				for (int var14 = 0; var14 < field398; var14++) {
					field400[var14] = null;
					field405[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field361[var15] = null;
				}

				field65 = field400[field399] = new EJJAKGTE();
				field347.method523();
				field329.method523();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field141[var16][var17][var18] = null;
						}
					}
				}

				field221 = new VYBZTNTY();
				field229 = 0;
				field228 = 0;
				method92(field120);
				field120 = -1;
				method92(field59);
				field59 = -1;
				method92(field69);
				field69 = -1;
				method92(field252);
				field252 = -1;
				method92(field129);
				field129 = -1;
				method92(field167);
				field167 = -1;
				method92(field51);
				field51 = -1;
				field235 = false;
				field457 = 3;
				field295 = 0;
				field264 = false;
				field388 = false;
				field61 = null;
				field396 = 0;
				field381 = -1;
				field357 = true;
				method45();

				for (int var19 = 0; var19 < 5; var19++) {
					field193[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field126[var20] = null;
					field127[var20] = false;
				}

				field420 = 0;
				field463 = 0;
				field153 = 0;
				field382 = 0;
				field407 = 0;
				field178 = 0;
				method55();
			} else if (var8 == 3) {
				field292 = "";
				field293 = "Invalid username or password.";
			} else if (var8 == 4) {
				field292 = "Your account has been disabled.";
				field293 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field292 = "Your account is already logged in.";
				field293 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field292 = "RuneScape has been updated!";
				field293 = "Please reload this page.";
			} else if (var8 == 7) {
				field292 = "This world is full.";
				field293 = "Please use a different world.";
			} else if (var8 == 8) {
				field292 = "Unable to connect.";
				field293 = "Login server offline.";
			} else if (var8 == 9) {
				field292 = "Login limit exceeded.";
				field293 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field292 = "Unable to connect.";
				field293 = "Bad session id.";
			} else if (var8 == 11) {
				field292 = "Login server rejected session.";
				field293 = "Please try again.";
			} else if (var8 == 12) {
				field292 = "You need a members account to login to this world.";
				field293 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field292 = "Could not complete login.";
				field293 = "Please try using a different world.";
			} else if (var8 == 14) {
				field292 = "The server is being updated.";
				field293 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field206 = true;
				field343.field667 = 0;
				field224.field667 = 0;
				field216 = -1;
				field325 = -1;
				field326 = -1;
				field327 = -1;
				field215 = 0;
				field217 = 0;
				field212 = 0;
				field389 = 0;
				field264 = false;
				field369 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field292 = "Login attempts exceeded.";
				field293 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field292 = "You are standing in a members-only area.";
				field293 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field292 = "Invalid loginserver requested";
				field293 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field115.method584();
				for (var21 += 3; var21 >= 0; var21--) {
					field292 = "You have only just left another world";
					field293 = "Your profile will be transferred in: " + var21;
					method94(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method152(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field292 = "Malformed login packet.";
				field293 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field292 = "Unexpected server response";
				field293 = "Please try using a different world.";
			} else if (var9 != 0) {
				field292 = "No response from server";
				field293 = "Please try using a different world.";
			} else if (field85 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field85++;
				method152(arg0, arg1, arg2);
			} else {
				field292 = "No response from loginserver";
				field293 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field292 = "";
			field293 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILGHHPHSRU;Z)V")
	public final void method153(int arg0, GHHPHSRU arg1) {
		while (arg1.field668 + 21 < arg0 * 8) {
			int var3 = arg1.method213(14);
			if (var3 == 16383) {
				break;
			}

			if (field361[var3] == null) {
				field361[var3] = new LJAXEEYT();
			}

			LJAXEEYT var4 = field361[var3];
			field363[field362++] = var3;
			var4.field752 = field372;
			int var5 = arg1.method213(1);
			if (var5 == 1) {
				field404[field403++] = var3;
			}

			int var6 = arg1.method213(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.field856 = DDJHHGTJ.method162(arg1.method213(12));
			int var7 = arg1.method213(1);
			int var8 = arg1.method213(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field753 = var4.field856.field503;
			var4.field764 = var4.field856.field504;
			var4.field776 = var4.field856.field511;
			var4.field777 = var4.field856.field525;
			var4.field778 = var4.field856.field516;
			var4.field779 = var4.field856.field513;
			var4.field765 = var4.field856.field531;
			var4.method242(field65.field732[0] + var8, field65.field733[0] + var6, var7 == 1);
		}

		arg1.method214();
	}

	@ObfuscatedName("client.C(I)V")
	public final void method154() {
		field343.method191(47);

		if (field167 != -1) {
			method92(field167);
			field167 = -1;
			field384 = true;
			field235 = false;
			field419 = true;
		}

		if (field59 != -1) {
			method92(field59);
			field59 = -1;
			field303 = true;
			field235 = false;
		}

		if (field252 != -1) {
			method92(field252);
			field252 = -1;
			field276 = true;
		}

		if (field129 != -1) {
			method92(field129);
			field129 = -1;
		}

		if (field69 != -1) {
			method92(field69);
			field69 = -1;
		}
	}

	@ObfuscatedName("client.z(B)V")
	public final void method155() {
		for (int var1 = 0; var1 < field304; var1++) {
			if (field341[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field298[var1] != field50 || field393[var1] != field421) {
						GHHPHSRU var3 = VYSYBHPS.method528(field393[var1], field298[var1]);
						if (System.currentTimeMillis() + var3.field667 / 22 > field330 / 22 + field406) {
							field330 = var3.field667;
							field406 = System.currentTimeMillis();

							if (method80(var3.field667, var3.field666)) {
								field50 = field298[var1];
								field421 = field393[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method144()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field341[var1] != -5) {
					field341[var1] = -5;
				} else {
					field304--;
					for (int var5 = var1; var5 < field304; var5++) {
						field298[var5] = field298[var5 + 1];
						field393[var5] = field393[var5 + 1];
						field341[var5] = field341[var5 + 1];
					}

					var1--;
				}
			} else {
				field341[var1]--;
			}
		}

		if (field356 > 0) {
			field356 -= 20;
			if (field356 < 0) {
				field356 = 0;
			}

			if (field356 == 0 && field208 && !field240) {
				field364 = field84;
				field365 = true;
				field73.method576(2, field364);
				return;
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method156() {
		if (field445 == 0 && field332 == 0) {
			field227[field389] = "Walk here";
			field317[field389] = 506;
			field315[field389] = field17;
			field316[field389] = field18;
			field389++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < OQIGXOFQ.field1095; var2++) {
			int var3 = OQIGXOFQ.field1096[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field207.method339(field91, var4, var5, var3) >= 0) {
					MKWUPJYP var8 = MKWUPJYP.method365(var7);
					if (var8.field968 != null) {
						var8 = var8.method370();
					}

					if (var8 == null) {
						continue;
					}

					if (field445 == 1) {
						field227[field389] = "Use " + field449 + " with @cya@" + var8.field964;
						field317[field389] = 484;
						field318[field389] = var3;
						field315[field389] = var4;
						field316[field389] = var5;
						field389++;
					} else if (field332 != 1) {
						if (var8.field952 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field952[var9] != null) {
									field227[field389] = var8.field952[var9] + " @cya@" + var8.field964;

									if (var9 == 0) {
										field317[field389] = 538;
									}

									if (var9 == 1) {
										field317[field389] = 337;
									}

									if (var9 == 2) {
										field317[field389] = 496;
									}

									if (var9 == 3) {
										field317[field389] = 846;
									}

									if (var9 == 4) {
										field317[field389] = 1586;
									}

									field318[field389] = var3;
									field315[field389] = var4;
									field316[field389] = var5;
									field389++;
								}
							}
						}

						field227[field389] = "Examine @cya@" + var8.field964;
						field317[field389] = 1138;
						field318[field389] = var8.field955 << 14;
						field315[field389] = var4;
						field316[field389] = var5;
						field389++;
					} else if ((field334 & 0x4) == 4) {
						field227[field389] = field335 + " @cya@" + var8.field964;
						field317[field389] = 807;
						field318[field389] = var3;
						field315[field389] = var4;
						field316[field389] = var5;
						field389++;
					}
				}

				if (var6 == 1) {
					LJAXEEYT var10 = field361[var7];
					if (var10.field856.field503 == 1 && (var10.field741 & 0x7F) == 0x40 && (var10.field742 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field362; var11++) {
							LJAXEEYT var12 = field361[field363[var11]];
							if (var12 != null && var10 != var12 && var12.field856.field503 == 1 && var10.field741 == var12.field741 && var10.field742 == var12.field742) {
								method75(var12.field856, field363[var11], var5, var4);
							}
						}

						for (int var13 = 0; var13 < field401; var13++) {
							EJJAKGTE var14 = field400[field402[var13]];
							if (var14 != null && var10.field741 == var14.field741 && var10.field742 == var14.field742) {
								method87(var14, var4, field402[var13], var5);
							}
						}
					}

					method75(var10.field856, var7, var5, var4);
				}

				if (var6 == 0) {
					EJJAKGTE var15 = field400[var7];
					if ((var15.field741 & 0x7F) == 0x40 && (var15.field742 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field362; var16++) {
							LJAXEEYT var17 = field361[field363[var16]];
							if (var17 != null && var17.field856.field503 == 1 && var15.field741 == var17.field741 && var15.field742 == var17.field742) {
								method75(var17.field856, field363[var16], var5, var4);
							}
						}

						for (int var18 = 0; var18 < field401; var18++) {
							EJJAKGTE var19 = field400[field402[var18]];
							if (var19 != null && var15 != var19 && var15.field741 == var19.field741 && var15.field742 == var19.field742) {
								method87(var19, var4, field402[var18], var5);
							}
						}
					}

					method87(var15, var4, var7, var5);
				}

				if (var6 == 3) {
					VYBZTNTY var20 = field141[field91][var4][var5];
					if (var20 != null) {
						for (HMUIJBAH var21 = (HMUIJBAH) var20.method520(); var21 != null; var21 = (HMUIJBAH) var20.method522()) {
							ZKNJTNWP var22 = ZKNJTNWP.method590(var21.field789);
							if (field445 == 1) {
								field227[field389] = "Use " + field449 + " with @lre@" + var22.field1482;
								field317[field389] = 383;
								field318[field389] = var21.field789;
								field315[field389] = var4;
								field316[field389] = var5;
								field389++;
							} else if (field332 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1505 != null && var22.field1505[var23] != null) {
										field227[field389] = var22.field1505[var23] + " @lre@" + var22.field1482;

										if (var23 == 0) {
											field317[field389] = 230;
										}

										if (var23 == 1) {
											field317[field389] = 658;
										}

										if (var23 == 2) {
											field317[field389] = 595;
										}

										if (var23 == 3) {
											field317[field389] = 670;
										}

										if (var23 == 4) {
											field317[field389] = 687;
										}

										field318[field389] = var21.field789;
										field315[field389] = var4;
										field316[field389] = var5;
										field389++;
									} else if (var23 == 2) {
										field227[field389] = "Take @lre@" + var22.field1482;
										field317[field389] = 595;
										field318[field389] = var21.field789;
										field315[field389] = var4;
										field316[field389] = var5;
										field389++;
									}
								}

								field227[field389] = "Examine @lre@" + var22.field1482;
								field317[field389] = 1408;
								field318[field389] = var21.field789;
								field315[field389] = var4;
								field316[field389] = var5;
								field389++;
							} else if ((field334 & 0x1) == 1) {
								field227[field389] = field335 + " @lre@" + var22.field1482;
								field317[field389] = 78;
								field318[field389] = var21.field789;
								field315[field389] = var4;
								field316[field389] = var5;
								field389++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;III)LDTIATKJO;")
	public final DTIATKJO method157(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field428[0] != null) {
				var6 = field428[0].method549(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field202.reset();
			field202.update(var6);
			int var8 = (int) field202.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new DTIATKJO(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg3, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method63(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				GHHPHSRU var16 = new GHHPHSRU(var15);
				var16.field667 = 3;
				int var17 = var16.method206() + 6;
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
						method13(arg3, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field428[0] != null) {
						field428[0].method550(arg4, var6, var6.length);
					}
				} catch (Exception var28) {
					field428[0] = null;
				}

				if (var6 != null) {
					field202.reset();
					field202.update(var6);
					int var23 = (int) field202.getValue();
					if (arg0 != var23) {
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

				field74 = !field74;
			}
		}

		return new DTIATKJO(var6);
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field158[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field460[var3] = var2 / 4;
		}
	}
}
