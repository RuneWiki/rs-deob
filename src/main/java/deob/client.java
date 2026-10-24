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
public final class client extends ZAMJOSBM {

	@ObfuscatedName("client.J")
	public boolean field64 = false;

	@ObfuscatedName("client.M")
	public int[] field67 = new int[151];

	@ObfuscatedName("client.P")
	public UFHMHWIH[] field70 = new UFHMHWIH[1000];

	@ObfuscatedName("client.S")
	public String field73 = "";

	@ObfuscatedName("client.T")
	public boolean field74 = false;

	@ObfuscatedName("client.X")
	public volatile boolean field78 = false;

	@ObfuscatedName("client.bb")
	public int[] field82 = new int[50];

	@ObfuscatedName("client.cb")
	public int field83 = -1;

	@ObfuscatedName("client.ib")
	public UFHMHWIH[] field88 = new UFHMHWIH[20];

	@ObfuscatedName("client.lb")
	public int[][] field91 = new int[104][104];

	@ObfuscatedName("client.mb")
	public byte[] field92 = new byte[16384];

	@ObfuscatedName("client.nb")
	public int[][] field93 = new int[104][104];

	@ObfuscatedName("client.pb")
	public boolean field95 = false;

	@ObfuscatedName("client.ub")
	public PUBJBHOK field100 = new PUBJBHOK();

	@ObfuscatedName("client.xb")
	public int field102 = -1;

	@ObfuscatedName("client.yb")
	public int field103 = -1;

	@ObfuscatedName("client.Bb")
	public boolean field105 = true;

	@ObfuscatedName("client.Cb")
	public boolean field106 = false;

	@ObfuscatedName("client.Db")
	public String field107 = "";

	@ObfuscatedName("client.Eb")
	public boolean field108 = false;

	@ObfuscatedName("client.Hb")
	public boolean field111 = false;

	@ObfuscatedName("client.Mb")
	public PUBJBHOK field116 = new PUBJBHOK();

	@ObfuscatedName("client.Ob")
	public int[] field118 = new int[XMFVYOPE.field1279];

	@ObfuscatedName("client.Pb")
	public MQZHAILV field119 = new MQZHAILV(new byte[5000]);

	@ObfuscatedName("client.Qb")
	public OQGXHJNH[] field120 = new OQGXHJNH[16384];

	@ObfuscatedName("client.Sb")
	public int[] field122 = new int[16384];

	@ObfuscatedName("client.Tb")
	public boolean field123 = true;

	@ObfuscatedName("client.Ub")
	public String[] field124 = new String[500];

	@ObfuscatedName("client.Wb")
	public String field126 = "";

	@ObfuscatedName("client.Xb")
	public String field127 = "";

	@ObfuscatedName("client.cc")
	public int[] field131 = new int[256];

	@ObfuscatedName("client.lc")
	public int field139 = -1;

	@ObfuscatedName("client.sc")
	public boolean field146 = true;

	@ObfuscatedName("client.uc")
	public String field147 = "";

	@ObfuscatedName("client.Bc")
	public long[] field154 = new long[100];

	@ObfuscatedName("client.Lc")
	public int[] field164 = new int[33];

	@ObfuscatedName("client.Pc")
	public PUBJBHOK field167 = new PUBJBHOK();

	@ObfuscatedName("client.Rc")
	public int field168 = -1;

	@ObfuscatedName("client.Sc")
	public String field169 = "";

	@ObfuscatedName("client.Xc")
	public int[] field172 = new int[50];

	@ObfuscatedName("client.hd")
	public MQZHAILV field181 = MQZHAILV.method313(1);

	@ObfuscatedName("client.jd")
	public volatile boolean field182 = false;

	@ObfuscatedName("client.ld")
	public int field184 = 50;

	@ObfuscatedName("client.md")
	public int[] field185 = new int[field184];

	@ObfuscatedName("client.nd")
	public int[] field186 = new int[field184];

	@ObfuscatedName("client.od")
	public int[] field187 = new int[field184];

	@ObfuscatedName("client.pd")
	public int[] field188 = new int[field184];

	@ObfuscatedName("client.qd")
	public int[] field189 = new int[field184];

	@ObfuscatedName("client.rd")
	public int[] field190 = new int[field184];

	@ObfuscatedName("client.sd")
	public int[] field191 = new int[field184];

	@ObfuscatedName("client.td")
	public String[] field192 = new String[field184];

	@ObfuscatedName("client.Ad")
	public int[][] field199 = new int[104][104];

	@ObfuscatedName("client.Dd")
	public int field201 = 1;

	@ObfuscatedName("client.Ed")
	public boolean field202 = false;

	@ObfuscatedName("client.Hd")
	public volatile boolean field205 = false;

	@ObfuscatedName("client.Jd")
	public String[] field206 = new String[5];

	@ObfuscatedName("client.Kd")
	public boolean[] field207 = new boolean[5];

	@ObfuscatedName("client.Ld")
	public int[] field208 = new int[2000];

	@ObfuscatedName("client.Nd")
	public int field209 = 3;

	@ObfuscatedName("client.Qd")
	public int[][][] field211 = new int[4][13][13];

	@ObfuscatedName("client.Rd")
	public MPYOQJPZ[] field212 = new MPYOQJPZ[4];

	@ObfuscatedName("client.Td")
	public TDQUELMV field214 = new TDQUELMV();

	@ObfuscatedName("client.Ud")
	public boolean field215 = false;

	@ObfuscatedName("client.Xd")
	public int[] field218 = new int[33];

	@ObfuscatedName("client.ae")
	public boolean field221 = false;

	@ObfuscatedName("client.ge")
	public HQETDHHW[] field225 = new HQETDHHW[2];

	@ObfuscatedName("client.he")
	public MQZHAILV field226 = MQZHAILV.method313(1);

	@ObfuscatedName("client.ie")
	public int[] field227 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.je")
	public UFHMHWIH[] field228 = new UFHMHWIH[8];

	@ObfuscatedName("client.ke")
	public boolean field229 = false;

	@ObfuscatedName("client.ye")
	public boolean[] field243 = new boolean[5];

	@ObfuscatedName("client.Ae")
	public boolean field245 = false;

	@ObfuscatedName("client.Be")
	public int field246 = 0x766654;

	@ObfuscatedName("client.Fe")
	public int field248 = 2;

	@ObfuscatedName("client.Le")
	public int field254 = 0x4D4233;

	@ObfuscatedName("client.Ne")
	public int field256 = 2;

	@ObfuscatedName("client.Pe")
	public int[] field258 = new int[1000];

	@ObfuscatedName("client.Re")
	public int[] field260 = new int[9];

	@ObfuscatedName("client.Se")
	public int[] field261 = new int[151];

	@ObfuscatedName("client.Te")
	public int[] field262 = new int[100];

	@ObfuscatedName("client.Ue")
	public String[] field263 = new String[100];

	@ObfuscatedName("client.Ve")
	public String[] field264 = new String[100];

	@ObfuscatedName("client.We")
	public int[] field265 = new int[7];

	@ObfuscatedName("client.cf")
	public int field271 = -1;

	@ObfuscatedName("client.mf")
	public MQZHAILV field280 = MQZHAILV.method313(1);

	@ObfuscatedName("client.Pf")
	public int field307 = 78;

	@ObfuscatedName("client.Sf")
	public int[] field310 = new int[50];

	@ObfuscatedName("client.Xf")
	public int field315 = -1;

	@ObfuscatedName("client.cg")
	public boolean field320 = false;

	@ObfuscatedName("client.eg")
	public boolean field322 = false;

	@ObfuscatedName("client.fg")
	public int[] field323 = new int[5];

	@ObfuscatedName("client.gg")
	public int[] field324 = new int[500];

	@ObfuscatedName("client.hg")
	public int[] field325 = new int[500];

	@ObfuscatedName("client.ig")
	public int[] field326 = new int[500];

	@ObfuscatedName("client.jg")
	public int[] field327 = new int[500];

	@ObfuscatedName("client.lg")
	public int[] field329 = new int[1000];

	@ObfuscatedName("client.mg")
	public int[] field330 = new int[1000];

	@ObfuscatedName("client.ng")
	public String field331 = "";

	@ObfuscatedName("client.og")
	public String field332 = "";

	@ObfuscatedName("client.rg")
	public boolean field334 = true;

	@ObfuscatedName("client.sg")
	public int[] field335 = new int[5];

	@ObfuscatedName("client.Bg")
	public boolean field341 = false;

	@ObfuscatedName("client.Fg")
	public int[] field343 = new int[5];

	@ObfuscatedName("client.Hg")
	public int field345 = 128;

	@ObfuscatedName("client.Qg")
	public HQETDHHW[] field354 = new HQETDHHW[100];

	@ObfuscatedName("client.Tg")
	public boolean field356 = false;

	@ObfuscatedName("client.Zg")
	public boolean field359 = false;

	@ObfuscatedName("client.bh")
	public int field360 = -1;

	@ObfuscatedName("client.hh")
	public UFHMHWIH[] field365 = new UFHMHWIH[20];

	@ObfuscatedName("client.jh")
	public CRC32 field367 = new CRC32();

	@ObfuscatedName("client.kh")
	public UFHMHWIH[] field368 = new UFHMHWIH[100];

	@ObfuscatedName("client.rh")
	public int field373 = -1;

	@ObfuscatedName("client.th")
	public int field375 = 1;

	@ObfuscatedName("client.vh")
	public boolean field376 = false;

	@ObfuscatedName("client.wh")
	public int field377 = -1;

	@ObfuscatedName("client.xh")
	public String[] field378 = new String[200];

	@ObfuscatedName("client.zh")
	public int field380 = -1;

	@ObfuscatedName("client.Ah")
	public int field381 = -1;

	@ObfuscatedName("client.Ch")
	public boolean field383 = false;

	@ObfuscatedName("client.Dh")
	public String field384 = "";

	@ObfuscatedName("client.Eh")
	public int[] field385 = new int[200];

	@ObfuscatedName("client.Jh")
	public boolean field389 = false;

	@ObfuscatedName("client.Kh")
	public boolean field390 = false;

	@ObfuscatedName("client.Yh")
	public boolean field402 = true;

	@ObfuscatedName("client.ci")
	public int field404 = 2048;

	@ObfuscatedName("client.di")
	public int field405 = 2047;

	@ObfuscatedName("client.ei")
	public KWSXZIVG[] field406 = new KWSXZIVG[field404];

	@ObfuscatedName("client.gi")
	public int[] field408 = new int[field404];

	@ObfuscatedName("client.ii")
	public int[] field410 = new int[field404];

	@ObfuscatedName("client.ji")
	public MQZHAILV[] field411 = new MQZHAILV[field404];

	@ObfuscatedName("client.ki")
	public int field412 = 0x332D25;

	@ObfuscatedName("client.mi")
	public int[] field414 = new int[XMFVYOPE.field1279];

	@ObfuscatedName("client.oi")
	public int field416 = 2;

	@ObfuscatedName("client.qi")
	public int[] field418 = new int[XMFVYOPE.field1279];

	@ObfuscatedName("client.yi")
	public int field426 = 0x23201B;

	@ObfuscatedName("client.Ai")
	public final int field427 = 100;

	@ObfuscatedName("client.Bi")
	public int[] field428 = new int[100];

	@ObfuscatedName("client.Di")
	public long[] field430 = new long[200];

	@ObfuscatedName("client.Ei")
	public int[] field431 = new int[4000];

	@ObfuscatedName("client.Fi")
	public int[] field432 = new int[4000];

	@ObfuscatedName("client.dj")
	public boolean field454 = false;

	@ObfuscatedName("client.ej")
	public int[] field455 = new int[2000];

	@ObfuscatedName("client.gj")
	public int[] field457 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.hj")
	public HQETDHHW[] field458 = new HQETDHHW[13];

	@ObfuscatedName("client.rj")
	public int field465 = -1;

	@ObfuscatedName("client.uj")
	public int[] field467 = new int[5];

	@ObfuscatedName("client.Dj")
	public boolean field476 = false;

	@ObfuscatedName("client.Gj")
	public PUBJBHOK[][][] field479 = new PUBJBHOK[4][104][104];

	@ObfuscatedName("client.Hj")
	public XWXMLCDO[] field480 = new XWXMLCDO[5];

	@ObfuscatedName("client.Jj")
	public int field482 = -1;

	@ObfuscatedName("client.Mj")
	public int[] field485 = new int[5];

	@ObfuscatedName("client.Nj")
	public final int[] field486 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ib")
	public static final int[] field112 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Uc")
	public static final int[][] field170 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Vd")
	public static BigInteger field216 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.le")
	public static BigInteger field230 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ke")
	public static int[] field253 = new int[32];

	@ObfuscatedName("client.dg")
	public static int[] field321 = new int[99];

	@ObfuscatedName("client.xg")
	public static int field337 = 10;

	@ObfuscatedName("client.zg")
	public static boolean field339 = true;

	@ObfuscatedName("client.qj")
	public static String field464 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.vb")
	public int field101;

	@ObfuscatedName("client.Ab")
	public int field104;

	@ObfuscatedName("client.Fb")
	public int field109;

	@ObfuscatedName("client.Gb")
	public int field110;

	@ObfuscatedName("client.Jb")
	public int field113;

	@ObfuscatedName("client.Kb")
	public int field114;

	@ObfuscatedName("client.Lb")
	public int field115;

	@ObfuscatedName("client.Nb")
	public int field117;

	@ObfuscatedName("client.Rb")
	public int field121;

	@ObfuscatedName("client.Zb")
	public static int field128;

	@ObfuscatedName("client.ac")
	public int field129;

	@ObfuscatedName("client.ec")
	public int field132;

	@ObfuscatedName("client.fc")
	public int field133;

	@ObfuscatedName("client.gc")
	public int field134;

	@ObfuscatedName("client.hc")
	public int field135;

	@ObfuscatedName("client.jc")
	public int field137;

	@ObfuscatedName("client.kc")
	public int field138;

	@ObfuscatedName("client.nc")
	public static int field141;

	@ObfuscatedName("client.Mc")
	public int field165;

	@ObfuscatedName("client.Oc")
	public int field166;

	@ObfuscatedName("client.bd")
	public int field175;

	@ObfuscatedName("client.cd")
	public int field176;

	@ObfuscatedName("client.dd")
	public int field177;

	@ObfuscatedName("client.ed")
	public int field178;

	@ObfuscatedName("client.fd")
	public int field179;

	@ObfuscatedName("client.gd")
	public int field180;

	@ObfuscatedName("client.kd")
	public int field183;

	@ObfuscatedName("client.wd")
	public int field195;

	@ObfuscatedName("client.xd")
	public int field196;

	@ObfuscatedName("client.yd")
	public int field197;

	@ObfuscatedName("client.zd")
	public int field198;

	@ObfuscatedName("client.Cd")
	public int field200;

	@ObfuscatedName("client.Fd")
	public int field203;

	@ObfuscatedName("client.Gd")
	public static int field204;

	@ObfuscatedName("client.Od")
	public int field210;

	@ObfuscatedName("client.Sd")
	public int field213;

	@ObfuscatedName("client.Zd")
	public int field220;

	@ObfuscatedName("client.de")
	public static int field222;

	@ObfuscatedName("client.me")
	public static int field231;

	@ObfuscatedName("client.ne")
	public int field232;

	@ObfuscatedName("client.oe")
	public int field233;

	@ObfuscatedName("client.pe")
	public int field234;

	@ObfuscatedName("client.qe")
	public int field235;

	@ObfuscatedName("client.re")
	public int field236;

	@ObfuscatedName("client.se")
	public int field237;

	@ObfuscatedName("client.te")
	public int field238;

	@ObfuscatedName("client.ue")
	public int field239;

	@ObfuscatedName("client.ve")
	public int field240;

	@ObfuscatedName("client.we")
	public int field241;

	@ObfuscatedName("client.xe")
	public int field242;

	@ObfuscatedName("client.ze")
	public int field244;

	@ObfuscatedName("client.Ee")
	public int field247;

	@ObfuscatedName("client.He")
	public int field250;

	@ObfuscatedName("client.Me")
	public int field255;

	@ObfuscatedName("client.Oe")
	public int field257;

	@ObfuscatedName("client.df")
	public int field272;

	@ObfuscatedName("client.ef")
	public int field273;

	@ObfuscatedName("client.ff")
	public int field274;

	@ObfuscatedName("client.gf")
	public int field275;

	@ObfuscatedName("client.hf")
	public int field276;

	@ObfuscatedName("client.jf")
	public int field277;

	@ObfuscatedName("client.kf")
	public int field278;

	@ObfuscatedName("client.lf")
	public int field279;

	@ObfuscatedName("client.wf")
	public int field290;

	@ObfuscatedName("client.xf")
	public int field291;

	@ObfuscatedName("client.yf")
	public int field292;

	@ObfuscatedName("client.zf")
	public int field293;

	@ObfuscatedName("client.Af")
	public int field294;

	@ObfuscatedName("client.Bf")
	public int field295;

	@ObfuscatedName("client.Cf")
	public int field296;

	@ObfuscatedName("client.If")
	public int field300;

	@ObfuscatedName("client.Jf")
	public int field301;

	@ObfuscatedName("client.Qf")
	public int field308;

	@ObfuscatedName("client.Rf")
	public int field309;

	@ObfuscatedName("client.Yf")
	public int field316;

	@ObfuscatedName("client.Zf")
	public int field317;

	@ObfuscatedName("client.bg")
	public int field319;

	@ObfuscatedName("client.kg")
	public int field328;

	@ObfuscatedName("client.tg")
	public static int field336;

	@ObfuscatedName("client.yg")
	public static int field338;

	@ObfuscatedName("client.Cg")
	public int field342;

	@ObfuscatedName("client.Gg")
	public int field344;

	@ObfuscatedName("client.Ig")
	public int field346;

	@ObfuscatedName("client.Jg")
	public int field347;

	@ObfuscatedName("client.Kg")
	public int field348;

	@ObfuscatedName("client.Lg")
	public int field349;

	@ObfuscatedName("client.Mg")
	public int field350;

	@ObfuscatedName("client.Ng")
	public int field351;

	@ObfuscatedName("client.Og")
	public int field352;

	@ObfuscatedName("client.Rg")
	public int field355;

	@ObfuscatedName("client.Ug")
	public int field357;

	@ObfuscatedName("client.Xg")
	public int field358;

	@ObfuscatedName("client.ch")
	public int field361;

	@ObfuscatedName("client.eh")
	public static int field362;

	@ObfuscatedName("client.fh")
	public int field363;

	@ObfuscatedName("client.gh")
	public int field364;

	@ObfuscatedName("client.ih")
	public int field366;

	@ObfuscatedName("client.lh")
	public int field369;

	@ObfuscatedName("client.mh")
	public int field370;

	@ObfuscatedName("client.nh")
	public int field371;

	@ObfuscatedName("client.oh")
	public int field372;

	@ObfuscatedName("client.sh")
	public int field374;

	@ObfuscatedName("client.yh")
	public int field379;

	@ObfuscatedName("client.Bh")
	public static int field382;

	@ObfuscatedName("client.Fh")
	public int field386;

	@ObfuscatedName("client.Ih")
	public static int field388;

	@ObfuscatedName("client.Mh")
	public int field391;

	@ObfuscatedName("client.Nh")
	public int field392;

	@ObfuscatedName("client.Oh")
	public int field393;

	@ObfuscatedName("client.Ph")
	public int field394;

	@ObfuscatedName("client.Qh")
	public int field395;

	@ObfuscatedName("client.Xh")
	public static int field401;

	@ObfuscatedName("client.bi")
	public int field403;

	@ObfuscatedName("client.fi")
	public int field407;

	@ObfuscatedName("client.hi")
	public int field409;

	@ObfuscatedName("client.li")
	public static int field413;

	@ObfuscatedName("client.ni")
	public int field415;

	@ObfuscatedName("client.pi")
	public int field417;

	@ObfuscatedName("client.ui")
	public int field422;

	@ObfuscatedName("client.vi")
	public int field423;

	@ObfuscatedName("client.wi")
	public int field424;

	@ObfuscatedName("client.Gi")
	public int field433;

	@ObfuscatedName("client.Ii")
	public int field434;

	@ObfuscatedName("client.Ji")
	public int field435;

	@ObfuscatedName("client.Ki")
	public int field436;

	@ObfuscatedName("client.Li")
	public int field437;

	@ObfuscatedName("client.Mi")
	public int field438;

	@ObfuscatedName("client.Ri")
	public int field443;

	@ObfuscatedName("client.Ti")
	public int field444;

	@ObfuscatedName("client.Ui")
	public int field445;

	@ObfuscatedName("client.Vi")
	public int field446;

	@ObfuscatedName("client.Wi")
	public int field447;

	@ObfuscatedName("client.Xi")
	public int field448;

	@ObfuscatedName("client.Yi")
	public int field449;

	@ObfuscatedName("client.Zi")
	public int field450;

	@ObfuscatedName("client.aj")
	public int field451;

	@ObfuscatedName("client.bj")
	public int field452;

	@ObfuscatedName("client.cj")
	public int field453;

	@ObfuscatedName("client.fj")
	public int field456;

	@ObfuscatedName("client.ij")
	public int field459;

	@ObfuscatedName("client.mj")
	public static int field462;

	@ObfuscatedName("client.oj")
	public static int field463;

	@ObfuscatedName("client.Aj")
	public int field473;

	@ObfuscatedName("client.Bj")
	public int field474;

	@ObfuscatedName("client.Cj")
	public int field475;

	@ObfuscatedName("client.Fj")
	public int field478;

	@ObfuscatedName("client.Ij")
	public int field481;

	@ObfuscatedName("client.Kj")
	public int field483;

	@ObfuscatedName("client.Lj")
	public int field484;

	@ObfuscatedName("client.K")
	public int field65;

	@ObfuscatedName("client.O")
	public int field69;

	@ObfuscatedName("client.Q")
	public int field71;

	@ObfuscatedName("client.R")
	public int field72;

	@ObfuscatedName("client.eb")
	public static int field84;

	@ObfuscatedName("client.hb")
	public static int field87;

	@ObfuscatedName("client.jb")
	public int field89;

	@ObfuscatedName("client.kb")
	public int field90;

	@ObfuscatedName("client.ob")
	public int field94;

	@ObfuscatedName("client.qb")
	public int field96;

	@ObfuscatedName("client.Df")
	public long field297;

	@ObfuscatedName("client.Tf")
	public long field311;

	@ObfuscatedName("client.jj")
	public long field460;

	@ObfuscatedName("client.L")
	public long field66;

	@ObfuscatedName("client.N")
	public long field68;

	@ObfuscatedName("client.oc")
	public CPJIVKZX field142;

	@ObfuscatedName("client.pc")
	public CPJIVKZX field143;

	@ObfuscatedName("client.qc")
	public CPJIVKZX field144;

	@ObfuscatedName("client.rc")
	public CPJIVKZX field145;

	@ObfuscatedName("client.Cc")
	public CPJIVKZX field155;

	@ObfuscatedName("client.Dc")
	public CPJIVKZX field156;

	@ObfuscatedName("client.Ec")
	public CPJIVKZX field157;

	@ObfuscatedName("client.Fc")
	public CPJIVKZX field158;

	@ObfuscatedName("client.Gc")
	public CPJIVKZX field159;

	@ObfuscatedName("client.Hc")
	public CPJIVKZX field160;

	@ObfuscatedName("client.Ic")
	public CPJIVKZX field161;

	@ObfuscatedName("client.Jc")
	public CPJIVKZX field162;

	@ObfuscatedName("client.Kc")
	public CPJIVKZX field163;

	@ObfuscatedName("client.nf")
	public CPJIVKZX field281;

	@ObfuscatedName("client.of")
	public CPJIVKZX field282;

	@ObfuscatedName("client.pf")
	public CPJIVKZX field283;

	@ObfuscatedName("client.qf")
	public CPJIVKZX field284;

	@ObfuscatedName("client.rf")
	public CPJIVKZX field285;

	@ObfuscatedName("client.sf")
	public CPJIVKZX field286;

	@ObfuscatedName("client.tf")
	public CPJIVKZX field287;

	@ObfuscatedName("client.uf")
	public CPJIVKZX field288;

	@ObfuscatedName("client.vf")
	public CPJIVKZX field289;

	@ObfuscatedName("client.Y")
	public CPJIVKZX field79;

	@ObfuscatedName("client.Z")
	public CPJIVKZX field80;

	@ObfuscatedName("client.ab")
	public CPJIVKZX field81;

	@ObfuscatedName("client.Pg")
	public CXFTMSCH field353;

	@ObfuscatedName("client.vc")
	public HQETDHHW field148;

	@ObfuscatedName("client.wc")
	public HQETDHHW field149;

	@ObfuscatedName("client.xc")
	public HQETDHHW field150;

	@ObfuscatedName("client.yc")
	public HQETDHHW field151;

	@ObfuscatedName("client.zc")
	public HQETDHHW field152;

	@ObfuscatedName("client.Kf")
	public HQETDHHW field302;

	@ObfuscatedName("client.Lf")
	public HQETDHHW field303;

	@ObfuscatedName("client.Mf")
	public HQETDHHW field304;

	@ObfuscatedName("client.Nf")
	public HQETDHHW field305;

	@ObfuscatedName("client.Of")
	public HQETDHHW field306;

	@ObfuscatedName("client.Sh")
	public HQETDHHW field396;

	@ObfuscatedName("client.Th")
	public HQETDHHW field397;

	@ObfuscatedName("client.ri")
	public HQETDHHW field419;

	@ObfuscatedName("client.si")
	public HQETDHHW field420;

	@ObfuscatedName("client.ti")
	public HQETDHHW field421;

	@ObfuscatedName("client.fb")
	public HQETDHHW field85;

	@ObfuscatedName("client.gb")
	public HQETDHHW field86;

	@ObfuscatedName("client.rb")
	public HQETDHHW field97;

	@ObfuscatedName("client.sb")
	public HQETDHHW field98;

	@ObfuscatedName("client.tb")
	public HQETDHHW field99;

	@ObfuscatedName("client.bc")
	public static KWSXZIVG field130;

	@ObfuscatedName("client.pg")
	public RCWDZCCF field333;

	@ObfuscatedName("client.Wd")
	public RGNQYESN field217;

	@ObfuscatedName("client.Xe")
	public RGWSJTPO field266;

	@ObfuscatedName("client.Ye")
	public RGWSJTPO field267;

	@ObfuscatedName("client.Ze")
	public RGWSJTPO field268;

	@ObfuscatedName("client.af")
	public RGWSJTPO field269;

	@ObfuscatedName("client.Yc")
	public UFHMHWIH field173;

	@ObfuscatedName("client.Zc")
	public UFHMHWIH field174;

	@ObfuscatedName("client.ee")
	public UFHMHWIH field223;

	@ObfuscatedName("client.fe")
	public UFHMHWIH field224;

	@ObfuscatedName("client.Ge")
	public UFHMHWIH field249;

	@ObfuscatedName("client.bf")
	public UFHMHWIH field270;

	@ObfuscatedName("client.ag")
	public UFHMHWIH field318;

	@ObfuscatedName("client.vj")
	public UFHMHWIH field468;

	@ObfuscatedName("client.wj")
	public UFHMHWIH field469;

	@ObfuscatedName("client.xj")
	public UFHMHWIH field470;

	@ObfuscatedName("client.yj")
	public UFHMHWIH field471;

	@ObfuscatedName("client.zj")
	public UFHMHWIH field472;

	@ObfuscatedName("client.V")
	public UFHMHWIH field76;

	@ObfuscatedName("client.W")
	public UFHMHWIH field77;

	@ObfuscatedName("client.Vb")
	public UTXVFWKJ field125;

	@ObfuscatedName("client.Ac")
	public WMEYNQIL field153;

	@ObfuscatedName("client.Ff")
	public YCBPJRVN field298;

	@ObfuscatedName("client.ic")
	public String field136;

	@ObfuscatedName("client.Wc")
	public String field171;

	@ObfuscatedName("client.Yd")
	public String field219;

	@ObfuscatedName("client.xi")
	public String field425;

	@ObfuscatedName("client.Ej")
	public Socket field477;

	@ObfuscatedName("client.Gf")
	public static boolean field299;

	@ObfuscatedName("client.Ag")
	public static boolean field340;

	@ObfuscatedName("client.tj")
	public static boolean field466;

	@ObfuscatedName("client.U")
	public static boolean field75;

	@ObfuscatedName("client.ud")
	public int[] field193;

	@ObfuscatedName("client.vd")
	public int[] field194;

	@ObfuscatedName("client.Ie")
	public int[] field251;

	@ObfuscatedName("client.Je")
	public int[] field252;

	@ObfuscatedName("client.Uf")
	public int[] field312;

	@ObfuscatedName("client.Vf")
	public int[] field313;

	@ObfuscatedName("client.Wf")
	public int[] field314;

	@ObfuscatedName("client.Uh")
	public int[] field398;

	@ObfuscatedName("client.Vh")
	public int[] field399;

	@ObfuscatedName("client.Wh")
	public int[] field400;

	@ObfuscatedName("client.Ni")
	public int[] field439;

	@ObfuscatedName("client.Oi")
	public int[] field440;

	@ObfuscatedName("client.Pi")
	public int[] field441;

	@ObfuscatedName("client.Qi")
	public int[] field442;

	@ObfuscatedName("client.Ci")
	public HQETDHHW[] field429;

	@ObfuscatedName("client.mc")
	public byte[][] field140;

	@ObfuscatedName("client.Qe")
	public byte[][] field259;

	@ObfuscatedName("client.lj")
	public byte[][][] field461;

	@ObfuscatedName("client.Gh")
	public int[][][] field387;

	@ObfuscatedName("client.a(ILTDQUELMV;B)I")
	public final int method20(int arg0, TDQUELMV arg1) {
		if (arg1.field1073 == null || arg0 >= arg1.field1073.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1073[arg0];
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
					var8 = field118[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field418[var3[var5++]];
				}

				if (var7 == 4) {
					TDQUELMV var10 = TDQUELMV.field1070[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < CBASPZKU.field36 && (!CBASPZKU.method13(var11).field42 || field339)) {
						for (int var12 = 0; var12 < var10.field1116.length; var12++) {
							if (var11 + 1 == var10.field1116[var12]) {
								var8 += var10.field1084[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field208[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field321[field118[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field208[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field130.field755;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < XMFVYOPE.field1279; var13++) {
						if (XMFVYOPE.field1281[var13]) {
							var8 += field118[var13];
						}
					}
				}

				if (var7 == 10) {
					TDQUELMV var14 = TDQUELMV.field1070[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < CBASPZKU.field36 && (!CBASPZKU.method13(var15).field42 || field339)) {
						for (int var16 = 0; var16 < var14.field1116.length; var16++) {
							if (var14.field1116[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field372;
				}

				if (var7 == 12) {
					var8 = field361;
				}

				if (var7 == 13) {
					int var17 = field208[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					CYAEJBRE var20 = CYAEJBRE.field553[var19];
					int var21 = var20.field555;
					int var22 = var20.field556;
					int var23 = var20.field557;
					int var24 = field253[var23 - var22];
					var8 = field208[var21] >> var22 & var24;
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
					var8 = (field130.field1019 >> 7) + field444;
				}

				if (var7 == 19) {
					var8 = (field130.field1020 >> 7) + field445;
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
			if (field1423 != null) {
				return new URL("http://127.0.0.1:" + (field338 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method21(boolean arg0) {
		for (int var2 = 0; var2 < field121; var2++) {
			OQGXHJNH var3 = field120[field122[var2]];
			int var4 = (field122[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method273() && var3.field815.field528 == arg0) {
				int var5 = var3.field1019 >> 7;
				int var6 = var3.field1020 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1055 == 1 && (var3.field1019 & 0x7F) == 0x40 && (var3.field1020 & 0x7F) == 0x40) {
						if (field93[var5][var6] == field197) {
							continue;
						}

						field93[var5][var6] = field197;
					}

					if (!var3.field815.field515) {
						var4 += Integer.MIN_VALUE;
					}

					field217.method417(var3.field1020, var3.field1019, (var3.field1055 - 1) * 64 + 60, method24(var3.field1019, var3.field1020, field379), var3, field379, var3.field1043, var3.field1021, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIZBI)Z")
	public final boolean method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field91[var14][var15] = 0;
				field199[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg10;
		field91[arg6][arg10] = 99;
		field199[arg6][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field431[var18] = arg6;
		int var35 = var18 + 1;
		field432[var18] = arg10;
		boolean var20 = false;
		int var21 = field431.length;
		int[][] var22 = field212[field379].field795;
		while (var35 != var19) {
			var16 = field431[var19];
			var17 = field432[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && field212[field379].method310(arg5, arg7, var16, arg1, var17, arg4 - 1)) {
					var20 = true;
					break;
				}

				if (arg4 < 10 && field212[field379].method311(var16, arg7, arg4 - 1, var17, arg5, arg1)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg3 != 0 && field212[field379].method312(var17, var16, arg0, arg3, arg5, arg8, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field199[var16][var17] + 1;
			if (var16 > 0 && field91[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17;
				var35 = (var35 + 1) % var21;
				field91[var16 - 1][var17] = 2;
				field199[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field91[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17;
				var35 = (var35 + 1) % var21;
				field91[var16 + 1][var17] = 8;
				field199[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field91[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field91[var16][var17 - 1] = 1;
				field199[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field91[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field91[var16][var17 + 1] = 4;
				field199[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field91[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field91[var16 - 1][var17 - 1] = 3;
				field199[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field91[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field91[var16 + 1][var17 - 1] = 9;
				field199[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field91[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field91[var16 - 1][var17 + 1] = 6;
				field199[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field91[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field91[var16 + 1][var17 + 1] = 12;
				field199[var16 + 1][var17 + 1] = var23;
			}
		}

		field483 = 0;
		if (!var20) {
			if (arg9) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg5 - var25; var26 <= arg5 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field199[var26][var27] < var24) {
								var24 = field199[var26][var27];
								var16 = var26;
								var17 = var27;
								field483 = 1;
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
		field431[var28] = var16;
		int var36 = var28 + 1;
		field432[var28] = var17;
		int var29;
		int var30 = var29 = field91[var16][var17];
		while (arg6 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field431[var36] = var16;
				field432[var36++] = var17;
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

			var30 = field91[var16][var17];
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
		int var32 = field431[var36];
		int var33 = field432[var36];

		if (arg2 == 0) {
			field280.method314(63);
			field280.method315(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field280.method314(83);
			field280.method315(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field280.method314(118);
			field280.method315(var31 + var31 + 3);
		}

		field280.method351(field444 + var32);
		field280.method315(field1438[5] == 1 ? 1 : 0);
		field316 = field431[0];
		field317 = field432[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field280.method341(field431[var36] - var32);
			field280.method343(field432[var36] - var33);
		}

		field280.method351(field445 + var33);
		return true;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method23() {
		if (field417 != 0) {
			RGWSJTPO var1 = field267;
			int var2 = 0;
			if (field96 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field264[var3] != null) {
					int var4 = field262[var3];
					String var5 = field263[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field101 == 0 || field101 == 1 && method43(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method462(0, "From", var7, var8);
						var1.method462(0xFFFF, "From", var7 - 1, var8);
						int var11 = var8 + var1.method460("From ");
						if (var6 == 1) {
							field225[0].method246(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field225[1].method246(var11, var7 - 12);
							var11 += 14;
						}

						var1.method462(0, var5 + ": " + field264[var3], var7, var11);
						var1.method462(0xFFFF, var5 + ": " + field264[var3], var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field101 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method462(0, field264[var3], var9, 4);
						var1.method462(0xFFFF, field264[var3], var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field101 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method462(0, "To " + var5 + ": " + field264[var3], var10, 4);
						var1.method462(0xFFFF, "To " + var5 + ": " + field264[var3], var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method24(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field461[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field387[var6][var4][var5] + field387[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field387[var6][var4][var5 + 1] + field387[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;)V")
	public final void method25(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field380 != -1) {
			field171 = arg2;
			field1434 = 0;
		}

		if (field271 == -1) {
			field359 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field262[var4] = field262[var4 - 1];
			field263[var4] = field263[var4 - 1];
			field264[var4] = field264[var4 - 1];
		}

		field262[0] = arg1;
		field263[0] = arg0;
		field264[0] = arg2;
	}

	@ObfuscatedName("client.a(ILHQETDHHW;)V")
	public final void method26(HQETDHHW arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field251.length; var3++) {
			field251[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field251[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field252[var9] = (field251[var9 - 1] + field251[var9 + 1] + field251[var9 - 128] + field251[var9 + 128]) / 4;
				}
			}

			int[] var10 = field251;
			field251 = field252;
			field252 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field651; var12++) {
				for (int var13 = 0; var13 < arg0.field650; var13++) {
					if (arg0.field648[var11++] != 0) {
						int var14 = var13 + arg0.field652 + 16;
						int var15 = var12 + arg0.field653 + 16;
						int var16 = (var15 << 7) + var14;
						field251[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method27() {
		method23();

		if (field395 == 1) {
			field228[field394 / 100].method498(field392 - 8 - 4, field393 - 8 - 4);
		}

		if (field395 == 2) {
			field228[field394 / 100 + 4].method498(field392 - 8 - 4, field393 - 8 - 4);
		}

		if (field360 != -1) {
			method61(field403, field360);
			method137(0, 0, TDQUELMV.field1070[field360], 0);
		}

		if (field315 != -1) {
			method61(field403, field315);
			method137(0, 0, TDQUELMV.field1070[field315], 0);
		}

		method145();

		if (!field64) {
			method66();
			method31();
		} else if (field232 == 0) {
			method60();
		}

		if (field195 == 1) {
			field365[1].method498(472, 296);
		}

		if (field75) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1416 < 15) {
				var3 = 0xFF0000;
			}

			field267.method457(var3, "Fps:" + field1416, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field340) {
				int var7 = 0xFF0000;
			}

			field267.method457(0xFFFF00, "Mem:" + var5 + "k", var2, var1);
			var2 += 15;
		}

		if (field96 != 0) {
			int var8 = field96 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field267.method462(0xFFFF00, "System update in: " + var9 + ":0" + var8, 329, 4);
			} else {
				field267.method462(0xFFFF00, "System update in: " + var9 + ":" + var8, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method28() {
		if (field438 > 0) {
			method147();
		} else {
			field144.method172();
			field267.method458(144, 0, 257, "Connection lost");
			field267.method458(143, 0xFFFFFF, 256, "Connection lost");
			field267.method458(159, 0, 257, "Please wait - attempting to reestablish");
			field267.method458(158, 0xFFFFFF, 256, "Please wait - attempting to reestablish");
			field144.method173(field1420, 4, 4);
			field210 = 0;
			field316 = 0;
			WMEYNQIL var1 = field153;
			field95 = false;
			field220 = 0;
			method132(field331, field332, true);

			if (!field95) {
				method147();
			}

			try {
				var1.method514();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ZILMQZHAILV;)V")
	public final void method29(int arg0, MQZHAILV arg1) {
		field257 = 0;
		field409 = 0;
		method69(arg1, arg0);
		method85(arg0, arg1);
		method142(arg0, arg1);

		for (int var3 = 0; var3 < field257; var3++) {
			int var4 = field258[var3];
			if (field336 != field120[var4].field1022) {
				field120[var4].field815 = null;
				field120[var4] = null;
			}
		}

		if (arg1.field797 != arg0) {
			signlink.reporterror(field331 + " size mismatch in getnpcpos - pos:" + arg1.field797 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field121; var5++) {
			if (field120[field122[var5]] == null) {
				signlink.reporterror(field331 + " null entry in npc list - pos:" + var5 + " size:" + field121);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;ILjava/lang/String;I)LCXFTMSCH;")
	public final CXFTMSCH method30(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field480[0] != null) {
				var6 = field480[0].method520(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field367.reset();
			field367.update(var6);
			int var8 = (int) field367.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new CXFTMSCH(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method87("Requesting " + arg3, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method135(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				MQZHAILV var16 = new MQZHAILV(var15);
				var16.field797 = 3;
				int var17 = var16.method329() + 6;
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
						method87("Loading " + arg3 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field480[0] != null) {
						field480[0].method521(arg4, var6, var6.length);
					}
				} catch (Exception var28) {
					field480[0] = null;
				}

				if (var6 != null) {
					field367.reset();
					field367.update(var6);
					int var23 = (int) field367.getValue();
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
						method87("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method87(var11 + " - Retrying in " + var25, arg2);
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

				field202 = !field202;
			}
		}

		return new CXFTMSCH(var6);
	}

	@ObfuscatedName("client.c(B)V")
	public final void method31() {
		if (field137 >= 2 || field132 != 0 || field422 != 0) {
			String var1;
			if (field132 == 1 && field137 < 2) {
				var1 = "Use " + field136 + " with...";
			} else if (field422 == 1 && field137 < 2) {
				var1 = field425 + "...";
			} else {
				var1 = field124[field137 - 1];
			}

			if (field137 > 2) {
				var1 = var1 + "@whi@ / " + (field137 - 2) + " more options";
			}

			field268.method467(var1, true, 4, 0xFFFFFF, 15, field336 / 1000);
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field396.method246(arg2, arg4);
		field397.method246(arg2, arg1 + arg4 - 16);
		JJCVVTJN.method258(16, arg2, field426, arg4 + 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg3 - arg1);
		JJCVVTJN.method258(16, arg2, field254, arg4 + var7 + 16, var6);
		JJCVVTJN.method263(var6, field246, arg4 + var7 + 16, arg2);
		JJCVVTJN.method263(var6, field246, arg4 + var7 + 16, arg2 + 1);
		JJCVVTJN.method261(field246, arg2, 16, arg4 + var7 + 16);
		JJCVVTJN.method261(field246, arg2, 16, arg4 + var7 + 17);
		JJCVVTJN.method263(var6, field412, arg4 + var7 + 16, arg2 + 15);
		JJCVVTJN.method263(var6 - 1, field412, arg4 + var7 + 17, arg2 + 14);
		JJCVVTJN.method261(field412, arg2, 16, arg4 + var7 + var6 + 15);
		JJCVVTJN.method261(field412, arg2 + 1, 15, arg4 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method33(int arg0, int arg1) {
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

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.d(B)V")
	public static final void method34() {
		RGNQYESN.field911 = true;
		QSZFQZON.field882 = true;
		field340 = true;
		MPWDIIUH.field790 = true;
		ZXOFSHYE.field1485 = true;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method35() {
		for (YVZOKMUV var1 = (YVZOKMUV) field167.method376(); var1 != null; var1 = (YVZOKMUV) field167.method378()) {
			if (field379 != var1.field1335 || var1.field1334) {
				var1.method492();
			} else if (field336 >= var1.field1332) {
				var1.method546(field403);

				if (var1.field1334) {
					var1.method492();
				} else {
					field217.method417(var1.field1337, var1.field1336, 60, var1.field1338, var1, var1.field1335, false, 0, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method36() {
		if (field210 == 0 && field1434 == 1) {
			int var1 = field1435 - 25 - 550;
			int var2 = field1436 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field346 + field247 & 0x7FF;
				int var4 = QSZFQZON.field891[var3];
				int var5 = QSZFQZON.field892[var3];
				var4 = (field374 + 256) * var4 >> 8;
				var5 = (field374 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field130.field1019 + var6 >> 7;
				int var9 = field130.field1020 - var7 >> 7;
				boolean var10 = method22(0, var9, 1, 0, 0, var8, field130.field1041[0], 0, 0, true, field130.field1042[0]);
				if (var10) {
					field280.method315(var1);
					field280.method315(var2);
					field280.method316(field346);
					field280.method315(57);
					field280.method315(field247);
					field280.method315(field374);
					field280.method315(89);
					field280.method316(field130.field1019);
					field280.method316(field130.field1020);
					field280.method315(field483);
					field280.method315(63);
				}
			}

			field128++;
			if (field128 > 82) {
				field128 = 0;
				field280.method314(84);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IBI)V")
	public final void method37(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field264[var4] != null) {
				int var5 = field262[var4];
				int var6 = field237 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field263[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field456 == 0 || field456 == 1 && method43(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field130.field737)) {
						if (field165 >= 1) {
							field124[field137] = "Report abuse @whi@" + var7;
							field326[field137] = 140;
							field137++;
						}

						field124[field137] = "Add ignore @whi@" + var7;
						field326[field137] = 633;
						field137++;
						field124[field137] = "Add friend @whi@" + var7;
						field326[field137] = 539;
						field137++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field417 == 0 && (var5 == 7 || field101 == 0 || field101 == 1 && method43(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field165 >= 1) {
							field124[field137] = "Report abuse @whi@" + var7;
							field326[field137] = 140;
							field137++;
						}

						field124[field137] = "Add ignore @whi@" + var7;
						field326[field137] = 633;
						field137++;
						field124[field137] = "Add friend @whi@" + var7;
						field326[field137] = 539;
						field137++;
					}

					var3++;
				}

				if (var5 == 4 && (field309 == 0 || field309 == 1 && method43(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field124[field137] = "Accept trade @whi@" + var7;
						field326[field137] = 744;
						field137++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field417 == 0 && field101 < 2) {
					var3++;
				}

				if (var5 == 8 && (field309 == 0 || field309 == 1 && method43(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field124[field137] = "Accept challenge @whi@" + var7;
						field326[field137] = 862;
						field137++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LTDQUELMV;I)V")
	public final void method38(TDQUELMV arg0) {
		int var2 = arg0.field1074;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field296 == 0) {
				arg0.field1126 = "Loading friend list";
				arg0.field1101 = 0;
			} else if (var2 == 1 && field296 == 1) {
				arg0.field1126 = "Connecting to friendserver";
				arg0.field1101 = 0;
			} else if (var2 == 2 && field296 != 2) {
				arg0.field1126 = "Please wait...";
				arg0.field1101 = 0;
			} else {
				int var3 = field295;
				if (field296 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1126 = "";
					arg0.field1101 = 0;
				} else {
					arg0.field1126 = field378[var2];
					arg0.field1101 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field295;
			if (field296 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1126 = "";
				arg0.field1101 = 0;
			} else {
				if (field385[var2] == 0) {
					arg0.field1126 = "@red@Offline";
				} else if (field385[var2] < 200) {
					if (field385[var2] == field337) {
						arg0.field1126 = "@gre@World-" + (field385[var2] - 9);
					} else {
						arg0.field1126 = "@yel@World-" + (field385[var2] - 9);
					}
				} else if (field385[var2] == field337) {
					arg0.field1126 = "@gre@Classic" + (field385[var2] - 219);
				} else {
					arg0.field1126 = "@yel@Classic" + (field385[var2] - 219);
				}

				arg0.field1101 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field295;
			if (field296 != 2) {
				var5 = 0;
			}

			arg0.field1129 = var5 * 15 + 20;
			if (arg0.field1129 <= arg0.field1076) {
				arg0.field1129 = arg0.field1076 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field296 == 0) {
				arg0.field1126 = "Loading ignore list";
				arg0.field1101 = 0;
			} else if (var2 == 1 && field296 == 0) {
				arg0.field1126 = "Please wait...";
				arg0.field1101 = 0;
			} else {
				int var6 = field94;
				if (field296 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1126 = "";
					arg0.field1101 = 0;
				} else {
					arg0.field1126 = PMUEFTAP.method371(PMUEFTAP.method368(field154[var2]));
					arg0.field1101 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1129 = field94 * 15 + 20;
			if (arg0.field1129 <= arg0.field1076) {
				arg0.field1129 = arg0.field1076 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1079 = 150;
			arg0.field1080 = (int) (Math.sin(field336 / 40.0D) * 256.0D) & 0x7FF;

			if (field221) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field265[var7];
					if (var8 >= 0 && !LNSFKVMU.field759[var8].method276()) {
						return;
					}
				}

				field221 = false;
				YYHPBDED[] var9 = new YYHPBDED[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field265[var11];
					if (var12 >= 0) {
						var9[var10++] = LNSFKVMU.field759[var12].method277();
					}
				}

				YYHPBDED var13 = new YYHPBDED(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field485[var14] != 0) {
						var13.method565(field170[var14][0], field170[var14][field485[var14]]);

						if (var14 == 1) {
							var13.method565(field112[0], field112[field485[var14]]);
						}
					}
				}

				var13.method558();
				var13.method559(JFYFSKVR.field659[field130.field1052].field661[0]);
				var13.method568(64, 850, -30, -50, -30, true);
				arg0.field1119 = 5;
				arg0.field1120 = 0;
				TDQUELMV.method486(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field223 == null) {
				field223 = arg0.field1075;
				field224 = arg0.field1111;
			}

			if (field402) {
				arg0.field1075 = field224;
			} else {
				arg0.field1075 = field223;
			}
		} else if (var2 == 325) {
			if (field223 == null) {
				field223 = arg0.field1075;
				field224 = arg0.field1111;
			}

			if (field402) {
				arg0.field1075 = field223;
			} else {
				arg0.field1075 = field224;
			}
		} else if (var2 == 600) {
			arg0.field1126 = field169;
			if (field336 % 20 < 10) {
				arg0.field1126 = arg0.field1126 + "|";
			} else {
				arg0.field1126 = arg0.field1126 + " ";
			}
		} else if (var2 == 613) {
			if (field165 < 1) {
				arg0.field1126 = "";
			} else if (field322) {
				arg0.field1105 = 0xFF0000;
				arg0.field1126 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1105 = 0xFFFFFF;
				arg0.field1126 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field319 == 0) {
				arg0.field1126 = "";
			} else {
				String var15;
				if (field89 == 0) {
					var15 = "earlier today";
				} else if (field89 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field89 + " days ago";
				}

				arg0.field1126 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field198 == 0) {
				arg0.field1126 = "0 unread messages";
				arg0.field1105 = 0xFFFF00;
			}

			if (field198 == 1) {
				arg0.field1126 = "1 unread message";
				arg0.field1105 = 0xFF00;
			}

			if (field198 > 1) {
				arg0.field1126 = field198 + " unread messages";
				arg0.field1105 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field117 == 201) {
				if (field481 == 1) {
					arg0.field1126 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1126 = "";
				}
			} else if (field117 == 200) {
				arg0.field1126 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field117 == 0) {
					var16 = "Earlier today";
				} else if (field117 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field117 + " days ago";
				}

				arg0.field1126 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field117 == 201) {
				if (field481 == 1) {
					arg0.field1126 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1126 = "";
				}
			} else if (field117 == 200) {
				arg0.field1126 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1126 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field117 == 201) {
				if (field481 == 1) {
					arg0.field1126 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1126 = "";
				}
			} else if (field117 == 200) {
				arg0.field1126 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1126 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method39(int arg0) {
		int var2 = CNLXCYXM.field488[arg0].field496;
		if (var2 != 0) {
			int var3 = field208[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					QSZFQZON.method394(0.9D);
				}

				if (var3 == 2) {
					QSZFQZON.method394(0.8D);
				}

				if (var3 == 3) {
					QSZFQZON.method394(0.7D);
				}

				if (var3 == 4) {
					QSZFQZON.method394(0.6D);
				}

				CBASPZKU.field40.method223();
				field245 = true;
			}

			if (var2 == 3) {
				boolean var4 = field146;

				if (var3 == 0) {
					method73(field146, 0);
					field146 = true;
				}

				if (var3 == 1) {
					method73(field146, -400);
					field146 = true;
				}

				if (var3 == 2) {
					method73(field146, -800);
					field146 = true;
				}

				if (var3 == 3) {
					method73(field146, -1200);
					field146 = true;
				}

				if (var3 == 4) {
					field146 = false;
				}

				if (field146 != var4 && !field340) {
					if (field146) {
						field104 = field373;
						field105 = true;
						field298.method533(2, field104);
					} else {
						method160();
					}

					field484 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field334 = true;
					method151(0);
				}

				if (var3 == 1) {
					field334 = true;
					method151(-400);
				}

				if (var3 == 2) {
					field334 = true;
					method151(-800);
				}

				if (var3 == 3) {
					field334 = true;
					method151(-1200);
				}

				if (var3 == 4) {
					field334 = false;
				}
			}

			if (var2 == 5) {
				field453 = var3;
			}

			if (var2 == 6) {
				field90 = var3;
			}

			if (var2 == 8) {
				field417 = var3;
				field359 = true;
			}

			if (var2 == 9) {
				field166 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public static final String method40(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.j(I)V")
	public void method41() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field175);

		if (field298 != null) {
			System.out.println("Od-cycle:" + field298.field1302);
		}

		System.out.println("loop-cycle:" + field336);
		System.out.println("draw-cycle:" + field413);
		System.out.println("ptype:" + field435);
		System.out.println("psize:" + field434);

		if (field153 != null) {
			field153.method519();
		}

		field1417 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method42() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1423 != null) {
			return field1423;
		}

		return this;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method43(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field295; var2++) {
			if (arg0.equalsIgnoreCase(field378[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field130.field737)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method44(int arg0) {
		TDQUELMV var2 = TDQUELMV.field1070[arg0];
		for (int var3 = 0; var3 < var2.field1122.length && var2.field1122[var3] != -1; var3++) {
			TDQUELMV var4 = TDQUELMV.field1070[var2.field1122[var3]];
			if (var4.field1110 == 1) {
				method44(var4.field1093);
			}

			var4.field1128 = 0;
			var4.field1069 = 0;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method45() {
		short var1 = 256;

		if (field363 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field363 > 768) {
					field439[var2] = method126(field441[var2], 1024 - field363, field440[var2]);
				} else if (field363 > 256) {
					field439[var2] = field441[var2];
				} else {
					field439[var2] = method126(field440[var2], 256 - field363, field441[var2]);
				}
			}
		} else if (field364 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field364 > 768) {
					field439[var3] = method126(field442[var3], 1024 - field364, field440[var3]);
				} else if (field364 > 256) {
					field439[var3] = field442[var3];
				} else {
					field439[var3] = method126(field440[var3], 256 - field364, field442[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field439[var4] = field440[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field158.field539[var5] = field173.field1148[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field131[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field193[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field439[var12];
					int var15 = field158.field539[var7];
					field158.field539[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field158.method173(field1420, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field159.field539[var16] = field174.field1148[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field131[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field193[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field439[var23];
					int var26 = field159.field539[var18];
					field159.field539[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field159.method173(field1420, 637, 0);
	}

	@ObfuscatedName("client.d(I)V")
	public final void method46() {
		field245 = true;
	}

	@ObfuscatedName("client.a(BIII)Z")
	public final boolean method47(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field217.method436(field379, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			ZXOFSHYE var8 = ZXOFSHYE.method588(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1472;
				var10 = var8.field1488;
			} else {
				var9 = var8.field1488;
				var10 = var8.field1472;
			}

			int var11 = var8.field1458;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method22(var11, arg0, 2, var10, 0, arg1, field130.field1041[0], 0, var9, false, field130.field1042[0]);
		} else {
			method22(0, arg0, 2, 0, var6 + 1, arg1, field130.field1041[0], var7, 0, false, field130.field1042[0]);
		}

		field392 = field1435;
		field393 = field1436;
		field395 = 2;
		field394 = 0;
		return true;
	}

	@ObfuscatedName("client.b(Z)Z")
	public final boolean method48() {
		if (field153 == null) {
			return false;
		}

		try {
			int var1 = field153.method516();
			if (var1 == 0) {
				return false;
			}

			if (field435 == -1) {
				field153.method517(field226.field796, 0, 1);
				field435 = field226.field796[0] & 0xFF;
				if (field333 != null) {
					field435 = field435 - field333.method402() & 0xFF;
				}

				field434 = NNMLACDF.field810[field435];
				var1--;
			}

			if (field434 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field153.method517(field226.field796, 0, 1);
				field434 = field226.field796[0] & 0xFF;
				var1--;
			}

			if (field434 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field153.method517(field226.field796, 0, 2);
				field226.field797 = 0;
				field434 = field226.method327();
				var1 -= 2;
			}

			if (var1 < field434) {
				return false;
			}

			field226.field797 = 0;
			field153.method517(field226.field796, 0, field434);
			field436 = 0;
			field115 = field114;
			field114 = field113;
			field113 = field435;

			if (field435 == 88) {
				int var2 = field226.method354();
				int var3 = field226.method352();
				int var4 = field226.method327();
				int var5 = field226.method354();
				TDQUELMV.field1070[var3].field1079 = var2;
				TDQUELMV.field1070[var3].field1080 = var5;
				TDQUELMV.field1070[var3].field1078 = var4;
				field435 = -1;
				return true;
			}

			if (field435 == 105) {
				method147();
				field435 = -1;
				return false;
			}

			if (field435 == 95) {
				int var6 = field226.method352();
				int var7 = field226.method352();
				TDQUELMV.field1070[var6].field1119 = 2;
				TDQUELMV.field1070[var6].field1120 = var7;
				field435 = -1;
				return true;
			}

			if (field435 == 182) {
				String var8 = field226.method332();
				int var9 = field226.method353();
				TDQUELMV.field1070[var9].field1126 = var8;

				if (field227[field209] == TDQUELMV.field1070[var9].field1083) {
					field390 = true;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 41) {
				method29(field434, field226);
				field435 = -1;
				return true;
			}

			if (field435 == 24) {
				int var10 = field226.method327();
				boolean var11 = field226.method325() == 1;
				TDQUELMV.field1070[var10].field1103 = var11;
				field435 = -1;
				return true;
			}

			if (field435 == 118) {
				int var12 = field226.method327();
				method44(var12);

				if (field482 != -1) {
					field482 = -1;
					field390 = true;
					field108 = true;
				}

				field271 = var12;
				field359 = true;
				field315 = -1;
				field320 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 75) {
				field456 = field226.method325();
				field101 = field226.method325();
				field309 = field226.method325();
				field111 = true;
				field359 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 127) {
				int var13 = field226.method327();
				int var14 = field226.method352();
				int var15 = var14 >> 10 & 0x1F;
				int var16 = var14 >> 5 & 0x1F;
				int var17 = var14 & 0x1F;
				TDQUELMV.field1070[var13].field1105 = (var17 << 3) + (var15 << 19) + (var16 << 11);
				field435 = -1;
				return true;
			}

			if (field435 == 197) {
				long var18 = field226.method331();
				int var20 = field226.method330();
				int var21 = field226.method325();
				boolean var22 = false;
				for (int var23 = 0; var23 < 100; var23++) {
					if (field428[var23] == var20) {
						var22 = true;
						break;
					}
				}

				if (var21 <= 1) {
					for (int var24 = 0; var24 < field94; var24++) {
						if (field154[var24] == var18) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field459 == 0) {
					try {
						field428[field358] = var20;
						field358 = (field358 + 1) % 100;
						String var25 = FBVMIMMU.method230(field434 - 13, field226);
						if (var21 != 3) {
							var25 = DDVOVWJV.method193(var25);
						}

						if (var21 == 2 || var21 == 3) {
							method25("@cr2@" + PMUEFTAP.method371(PMUEFTAP.method368(var18)), 7, var25);
						} else if (var21 == 1) {
							method25("@cr1@" + PMUEFTAP.method371(PMUEFTAP.method368(var18)), 7, var25);
						} else {
							method25(PMUEFTAP.method371(PMUEFTAP.method368(var18)), 3, var25);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 59) {
				field110 = field226.method325();
				field109 = field226.method345();
				for (int var27 = field109; var27 < field109 + 8; var27++) {
					for (int var28 = field110; var28 < field110 + 8; var28++) {
						if (field479[field379][var27][var28] != null) {
							field479[field379][var27][var28] = null;
							method94(var27, var28);
						}
					}
				}

				for (UTGRLTTT var29 = (UTGRLTTT) field116.method376(); var29 != null; var29 = (UTGRLTTT) field116.method378()) {
					if (var29.field1164 >= field109 && var29.field1164 < field109 + 8 && var29.field1165 >= field110 && var29.field1165 < field110 + 8 && field379 == var29.field1162) {
						var29.field1166 = 0;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 213) {
				field391 = field226.method325();
				field465 = field226.method353();
				field435 = -1;
				return true;
			}

			if (field435 == 47) {
				int var30 = field226.method327();
				int var31 = field226.method353();
				int var32 = field226.method354();
				if (var32 == 0xFFFF) {
					TDQUELMV.field1070[var30].field1119 = 0;
					field435 = -1;
					return true;
				}

				CBASPZKU var33 = CBASPZKU.method13(var32);
				TDQUELMV.field1070[var30].field1119 = 4;
				TDQUELMV.field1070[var30].field1120 = var32;
				TDQUELMV.field1070[var30].field1079 = var33.field33;
				TDQUELMV.field1070[var30].field1080 = var33.field58;
				TDQUELMV.field1070[var30].field1078 = var33.field31 * 100 / var31;
				field435 = -1;
				return true;
			}

			if (field435 == 23) {
				int var34 = field226.method354();
				int var35 = field226.method352();
				int var36 = field226.method353();
				TDQUELMV.field1070[var34].field1077 = (var36 << 16) + var35;
				field435 = -1;
				return true;
			}

			if (field435 == 221) {
				field96 = field226.method354() * 30;
				field435 = -1;
				return true;
			}

			if (field435 == 161) {
				int var37 = field226.method353();
				int var38 = field226.method352();
				TDQUELMV.field1070[var38].field1119 = 1;
				TDQUELMV.field1070[var38].field1120 = var37;
				field435 = -1;
				return true;
			}

			if (field435 == 156) {
				int var39 = field226.method327();
				TDQUELMV var40 = TDQUELMV.field1070[var39];
				for (int var41 = 0; var41 < var40.field1116.length; var41++) {
					var40.field1116[var41] = -1;
					var40.field1116[var41] = 0;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 240) {
				field110 = field226.method344();
				field109 = field226.method346();
				field435 = -1;
				return true;
			}

			if (field435 == 235) {
				int var42 = field226.method346();
				int var43 = field226.method353();
				if (var43 == 0xFFFF) {
					var43 = -1;
				}

				field227[var42] = var43;
				field390 = true;
				field108 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 34) {
				int var44 = field226.method353();
				method44(var44);

				if (field482 != -1) {
					field482 = -1;
					field390 = true;
					field108 = true;
				}

				if (field271 != -1) {
					field271 = -1;
					field359 = true;
				}

				if (field138 != 0) {
					field138 = 0;
					field359 = true;
				}

				field315 = var44;
				field320 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 13) {
				field229 = false;
				field138 = 2;
				field384 = "";
				field359 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 96) {
				String var45 = field226.method332();
				if (var45.endsWith(":tradereq:")) {
					String var46 = var45.substring(0, var45.indexOf(":"));
					long var47 = PMUEFTAP.method367(var46);
					boolean var49 = false;
					for (int var50 = 0; var50 < field94; var50++) {
						if (field154[var50] == var47) {
							var49 = true;
							break;
						}
					}

					if (!var49 && field459 == 0) {
						method25(var46, 4, "wishes to trade with you.");
					}
				} else if (var45.endsWith(":duelreq:")) {
					String var51 = var45.substring(0, var45.indexOf(":"));
					long var52 = PMUEFTAP.method367(var51);
					boolean var54 = false;
					for (int var55 = 0; var55 < field94; var55++) {
						if (field154[var55] == var52) {
							var54 = true;
							break;
						}
					}

					if (!var54 && field459 == 0) {
						method25(var51, 8, "wishes to duel with you.");
					}
				} else if (var45.endsWith(":chalreq:")) {
					String var56 = var45.substring(0, var45.indexOf(":"));
					long var57 = PMUEFTAP.method367(var56);
					boolean var59 = false;
					for (int var60 = 0; var60 < field94; var60++) {
						if (field154[var60] == var57) {
							var59 = true;
							break;
						}
					}

					if (!var59 && field459 == 0) {
						String var61 = var45.substring(var45.indexOf(":") + 1, var45.length() - 9);
						method25(var56, 8, var61);
					}
				} else {
					method25("", 0, var45);
				}

				field435 = -1;
				return true;
			}

			if (field435 == 1) {
				for (int var62 = 0; var62 < field406.length; var62++) {
					if (field406[var62] != null) {
						field406[var62].field1047 = -1;
					}
				}

				for (int var63 = 0; var63 < field120.length; var63++) {
					if (field120[var63] != null) {
						field120[var63].field1047 = -1;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 64) {
				field94 = field434 / 8;
				for (int var64 = 0; var64 < field94; var64++) {
					field154[var64] = field226.method331();
				}

				field435 = -1;
				return true;
			}

			if (field435 == 116) {
				int var65 = field226.method355();
				int var66 = field226.method357();
				int var67 = field226.method354();
				TDQUELMV var68 = TDQUELMV.field1070[var67];
				var68.field1102 = var66;
				var68.field1121 = var65;
				field435 = -1;
				return true;
			}

			if (field435 == 27) {
				field383 = true;
				field273 = field226.method325();
				field274 = field226.method325();
				field275 = field226.method327();
				field276 = field226.method325();
				field277 = field226.method325();
				if (field277 >= 100) {
					int var69 = field273 * 128 + 64;
					int var70 = field274 * 128 + 64;
					int var71 = method24(var69, var70, field379) - field275;
					int var72 = var69 - field238;
					int var73 = var71 - field239;
					int var74 = var70 - field240;
					int var75 = (int) Math.sqrt(var72 * var72 + var74 * var74);
					field241 = (int) (Math.atan2(var73, var75) * 325.949D) & 0x7FF;
					field242 = (int) (Math.atan2(var72, var74) * -325.949D) & 0x7FF;

					if (field241 < 128) {
						field241 = 128;
					}

					if (field241 > 383) {
						field241 = 383;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 77) {
				field316 = 0;
				field435 = -1;
				return true;
			}

			if (field435 == 162) {
				if (field482 != -1) {
					field482 = -1;
					field390 = true;
					field108 = true;
				}

				if (field271 != -1) {
					field271 = -1;
					field359 = true;
				}

				if (field138 != 0) {
					field138 = 0;
					field359 = true;
				}

				field315 = -1;
				field320 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 15 || field435 == 46) {
				int var76 = field278;
				int var77 = field279;
				if (field435 == 15) {
					var77 = field226.method327();
					var76 = field226.method352();
					field376 = false;
				}

				if (field435 == 46) {
					var77 = field226.method353();
					field226.method335();

					for (int var78 = 0; var78 < 4; var78++) {
						for (int var79 = 0; var79 < 13; var79++) {
							for (int var80 = 0; var80 < 13; var80++) {
								int var81 = field226.method336(1);
								if (var81 == 1) {
									field211[var78][var79][var80] = field226.method336(26);
								} else {
									field211[var78][var79][var80] = -1;
								}
							}
						}
					}

					field226.method337();
					var76 = field226.method327();
					field376 = true;
				}

				if (field278 == var76 && field279 == var77 && field443 == 2) {
					field435 = -1;
					return true;
				}

				field278 = var76;
				field279 = var77;
				field444 = (field278 - 6) * 8;
				field445 = (field279 - 6) * 8;
				field341 = false;
				if ((field278 / 8 == 48 || field278 / 8 == 49) && field279 / 8 == 48) {
					field341 = true;
				}

				if (field278 / 8 == 48 && field279 / 8 == 148) {
					field341 = true;
				}

				field443 = 1;
				field460 = System.currentTimeMillis();
				field144.method172();
				field267.method458(151, 0, 257, "Loading - please wait.");
				field267.method458(150, 0xFFFFFF, 256, "Loading - please wait.");
				field144.method173(field1420, 4, 4);

				if (field435 == 15) {
					int var82 = 0;
					for (int var83 = (field278 - 6) / 8; var83 <= (field278 + 6) / 8; var83++) {
						for (int var84 = (field279 - 6) / 8; var84 <= (field279 + 6) / 8; var84++) {
							var82++;
						}
					}

					field259 = new byte[var82][];
					field140 = new byte[var82][];
					field398 = new int[var82];
					field399 = new int[var82];
					field400 = new int[var82];
					int var85 = 0;
					for (int var86 = (field278 - 6) / 8; var86 <= (field278 + 6) / 8; var86++) {
						for (int var87 = (field279 - 6) / 8; var87 <= (field279 + 6) / 8; var87++) {
							field398[var85] = (var86 << 8) + var87;

							if (field341 && (var87 == 49 || var87 == 149 || var87 == 147 || var86 == 50 || var86 == 49 && var87 == 47)) {
								field399[var85] = -1;
								field400[var85] = -1;
								var85++;
							} else {
								int var88 = field399[var85] = field298.method531(var86, 0, var87);
								if (var88 != -1) {
									field298.method533(3, var88);
								}

								int var89 = field400[var85] = field298.method531(var86, 1, var87);
								if (var89 != -1) {
									field298.method533(3, var89);
								}

								var85++;
							}
						}
					}
				}

				if (field435 == 46) {
					int var90 = 0;
					int[] var91 = new int[676];
					for (int var92 = 0; var92 < 4; var92++) {
						for (int var93 = 0; var93 < 13; var93++) {
							for (int var94 = 0; var94 < 13; var94++) {
								int var95 = field211[var92][var93][var94];
								if (var95 != -1) {
									int var96 = var95 >> 14 & 0x3FF;
									int var97 = var95 >> 3 & 0x7FF;
									int var98 = (var96 / 8 << 8) + var97 / 8;
									for (int var99 = 0; var99 < var90; var99++) {
										if (var91[var99] == var98) {
											var98 = -1;
											break;
										}
									}

									if (var98 != -1) {
										var91[var90++] = var98;
									}
								}
							}
						}
					}

					field259 = new byte[var90][];
					field140 = new byte[var90][];
					field398 = new int[var90];
					field399 = new int[var90];
					field400 = new int[var90];
					for (int var100 = 0; var100 < var90; var100++) {
						int var101 = field398[var100] = var91[var100];
						int var102 = var101 >> 8 & 0xFF;
						int var103 = var101 & 0xFF;
						int var104 = field399[var100] = field298.method531(var102, 0, var103);
						if (var104 != -1) {
							field298.method533(3, var104);
						}

						int var105 = field400[var100] = field298.method531(var102, 1, var103);
						if (var105 != -1) {
							field298.method533(3, var105);
						}
					}
				}

				int var106 = field444 - field446;
				int var107 = field445 - field447;
				field446 = field444;
				field447 = field445;

				for (int var108 = 0; var108 < 16384; var108++) {
					OQGXHJNH var109 = field120[var108];
					if (var109 != null) {
						for (int var110 = 0; var110 < 10; var110++) {
							var109.field1041[var110] -= var106;
							var109.field1042[var110] -= var107;
						}

						var109.field1019 -= var106 * 128;
						var109.field1020 -= var107 * 128;
					}
				}

				for (int var111 = 0; var111 < field404; var111++) {
					KWSXZIVG var112 = field406[var111];
					if (var112 != null) {
						for (int var113 = 0; var113 < 10; var113++) {
							var112.field1041[var113] -= var106;
							var112.field1042[var113] -= var107;
						}

						var112.field1019 -= var106 * 128;
						var112.field1020 -= var107 * 128;
					}
				}

				field74 = true;
				byte var114 = 0;
				byte var115 = 104;
				byte var116 = 1;
				if (var106 < 0) {
					var114 = 103;
					var115 = -1;
					var116 = -1;
				}

				byte var117 = 0;
				byte var118 = 104;
				byte var119 = 1;
				if (var107 < 0) {
					var117 = 103;
					var118 = -1;
					var119 = -1;
				}

				for (int var120 = var114; var120 != var115; var120 += var116) {
					for (int var121 = var117; var121 != var118; var121 += var119) {
						int var122 = var106 + var120;
						int var123 = var107 + var121;
						for (int var124 = 0; var124 < 4; var124++) {
							if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
								field479[var124][var120][var121] = field479[var124][var122][var123];
							} else {
								field479[var124][var120][var121] = null;
							}
						}
					}
				}

				for (UTGRLTTT var125 = (UTGRLTTT) field116.method376(); var125 != null; var125 = (UTGRLTTT) field116.method378()) {
					var125.field1164 -= var106;
					var125.field1165 -= var107;
					if (var125.field1164 < 0 || var125.field1165 < 0 || var125.field1164 >= 104 || var125.field1165 >= 104) {
						var125.method492();
					}
				}

				if (field316 != 0) {
					field316 -= var106;
					field317 -= var107;
				}

				field383 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 9) {
				int var126 = field226.method325();
				int var127 = field226.method325();
				int var128 = field226.method325();
				int var129 = field226.method325();
				field243[var126] = true;
				field323[var126] = var127;
				field335[var126] = var128;
				field467[var126] = var129;
				field343[var126] = 0;
				field435 = -1;
				return true;
			}

			if (field435 == 86) {
				int var130 = field226.method354();
				int var131 = field226.method360();
				field455[var130] = var131;

				if (field208[var130] != var131) {
					field208[var130] = var131;
					method39(var130);
					field390 = true;

					if (field380 != -1) {
						field359 = true;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 232) {
				field168 = field226.method344();
				if (field209 == field168) {
					if (field168 == 3) {
						field209 = 1;
					} else {
						field209 = 3;
					}

					field390 = true;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 102) {
				int var132 = field226.method353();
				TDQUELMV.field1070[var132].field1119 = 3;

				if (field130.field743 == null) {
					TDQUELMV.field1070[var132].field1120 = (field130.field757[11] << 5) + (field130.field757[8] << 10) + (field130.field757[0] << 15) + (field130.field742[0] << 25) + (field130.field742[4] << 20) + field130.field757[1];
				} else {
					TDQUELMV.field1070[var132].field1120 = (int) (field130.field743.field537 + 0x12345678L);
				}

				field435 = -1;
				return true;
			}

			if (field435 == 10) {
				field390 = true;
				int var133 = field226.method346();
				int var134 = field226.method360();
				int var135 = field226.method345();
				field418[var133] = var134;
				field414[var133] = var135;
				field118[var133] = 1;
				for (int var136 = 0; var136 < 98; var136++) {
					if (var134 >= field321[var136]) {
						field118[var133] = var136 + 2;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 178) {
				field195 = field226.method325();
				field435 = -1;
				return true;
			}

			if (field435 == 183) {
				field110 = field226.method325();
				field109 = field226.method344();

				while (field226.field797 < field434) {
					int var137 = field226.method325();
					method51(var137, field226);
				}

				field435 = -1;
				return true;
			}

			if (field435 == 173) {
				int var138 = field226.method354();
				byte var139 = field226.method348();
				field455[var138] = var139;

				if (field208[var138] != var139) {
					field208[var138] = var139;
					method39(var138);
					field390 = true;

					if (field380 != -1) {
						field359 = true;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 31) {
				if (field209 == 12) {
					field390 = true;
				}

				field372 = field226.method325();
				field435 = -1;
				return true;
			}

			if (field435 == 36) {
				field203 = field226.method325();
				if (field203 == 1) {
					field65 = field226.method327();
				}

				if (field203 >= 2 && field203 <= 6) {
					if (field203 == 2) {
						field293 = 64;
						field294 = 64;
					}

					if (field203 == 3) {
						field293 = 0;
						field294 = 64;
					}

					if (field203 == 4) {
						field293 = 128;
						field294 = 64;
					}

					if (field203 == 5) {
						field293 = 64;
						field294 = 0;
					}

					if (field203 == 6) {
						field293 = 64;
						field294 = 128;
					}

					field203 = 2;
					field290 = field226.method327();
					field291 = field226.method327();
					field292 = field226.method325();
				}

				if (field203 == 10) {
					field357 = field226.method327();
				}

				field435 = -1;
				return true;
			}

			if (field435 == 123) {
				field383 = false;

				for (int var140 = 0; var140 < 5; var140++) {
					field243[var140] = false;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 228) {
				long var141 = field226.method331();
				int var143 = field226.method325();
				String var144 = PMUEFTAP.method371(PMUEFTAP.method368(var141));
				for (int var145 = 0; var145 < field295; var145++) {
					if (field430[var145] == var141) {
						if (field385[var145] != var143) {
							field385[var145] = var143;
							field390 = true;

							if (var143 > 0) {
								method25("", 5, var144 + " has logged in.");
							}

							if (var143 == 0) {
								method25("", 5, var144 + " has logged out.");
							}
						}

						var144 = null;
						break;
					}
				}

				if (var144 != null && field295 < 200) {
					field430[field295] = var141;
					field378[field295] = var144;
					field385[field295] = var143;
					field295++;
					field390 = true;
				}

				boolean var146 = false;
				while (!var146) {
					var146 = true;
					for (int var147 = 0; var147 < field295 - 1; var147++) {
						if (field385[var147] != field337 && field385[var147 + 1] == field337 || field385[var147] == 0 && field385[var147 + 1] != 0) {
							int var148 = field385[var147];
							field385[var147] = field385[var147 + 1];
							field385[var147 + 1] = var148;
							String var149 = field378[var147];
							field378[var147] = field378[var147 + 1];
							field378[var147 + 1] = var149;
							long var150 = field430[var147];
							field430[var147] = field430[var147 + 1];
							field430[var147 + 1] = var150;
							field390 = true;
							var146 = false;
						}
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 233) {
				field210 = field226.method325();
				field435 = -1;
				return true;
			}

			if (field435 == 187) {
				field229 = false;
				field138 = 1;
				field384 = "";
				field359 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 209) {
				String var152 = field226.method332();
				int var153 = field226.method325();
				int var154 = field226.method325();
				if (var154 >= 1 && var154 <= 5) {
					if (var152.equalsIgnoreCase("null")) {
						var152 = null;
					}

					field206[var154 - 1] = var152;
					field207[var154 - 1] = var153 == 0;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 111) {
				method136(field226, field434);
				field74 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 199) {
				field209 = field226.method344();
				field390 = true;
				field108 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 143) {
				int var155 = field226.method328();
				field380 = var155;
				field359 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 4) {
				field296 = field226.method325();
				field390 = true;
				field435 = -1;
				return true;
			}

			if (field435 == 247) {
				int var156 = field226.method327();
				int var157 = field226.method354();

				if (field271 != -1) {
					field271 = -1;
					field359 = true;
				}

				if (field138 != 0) {
					field138 = 0;
					field359 = true;
				}

				field315 = var157;
				field482 = var156;
				field390 = true;
				field108 = true;
				field320 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 254) {
				if (field209 == 12) {
					field390 = true;
				}

				field361 = field226.method328();
				field435 = -1;
				return true;
			}

			if (field435 == 100) {
				int var158 = field226.method353();
				if (var158 == 0xFFFF) {
					var158 = -1;
				}

				if (field373 != var158 && field146 && !field340 && field484 == 0) {
					field104 = var158;
					field105 = true;
					field298.method533(2, field104);
				}

				field373 = var158;
				field435 = -1;
				return true;
			}

			if (field435 == 126) {
				int var159 = field226.method358();
				int var160 = field226.method353();
				if (field146 && !field340) {
					field104 = var160;
					field105 = false;
					field298.method533(2, field104);
					field484 = var159;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 91) {
				int var161 = field226.method357();
				if (var161 >= 0) {
					method44(var161);
				}

				field360 = var161;
				field435 = -1;
				return true;
			}

			if (field435 == 124) {
				int var162 = field226.method352();
				method44(var162);

				if (field271 != -1) {
					field271 = -1;
					field359 = true;
				}

				if (field138 != 0) {
					field138 = 0;
					field359 = true;
				}

				field482 = var162;
				field390 = true;
				field108 = true;
				field315 = -1;
				field320 = false;
				field435 = -1;
				return true;
			}

			if (field435 == 163) {
				field390 = true;
				int var163 = field226.method327();
				TDQUELMV var164 = TDQUELMV.field1070[var163];
				while (field226.field797 < field434) {
					int var165 = field226.method339();
					int var166 = field226.method327();
					int var167 = field226.method325();
					if (var167 == 255) {
						var167 = field226.method330();
					}

					if (var165 >= 0 && var165 < var164.field1116.length) {
						var164.field1116[var165] = var166;
						var164.field1084[var165] = var167;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 42) {
				field390 = true;
				int var168 = field226.method327();
				TDQUELMV var169 = TDQUELMV.field1070[var168];
				int var170 = field226.method327();
				for (int var171 = 0; var171 < var170; var171++) {
					var169.field1116[var171] = field226.method327();
					int var172 = field226.method344();
					if (var172 == 255) {
						var172 = field226.method360();
					}

					var169.field1084[var171] = var172;
				}

				for (int var173 = var170; var173 < var169.field1116.length; var173++) {
					var169.field1116[var173] = 0;
					var169.field1084[var173] = 0;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 198) {
				int var174 = field226.method327();
				int var175 = field226.method325();
				int var176 = field226.method327();
				if (field334 && !field340 && field308 < 50) {
					field172[field308] = var174;
					field82[field308] = var175;
					field310[field308] = ETTRSMMZ.field576[var174] + var176;
					field308++;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 76) {
				field319 = field226.method330();
				field117 = field226.method346();
				field89 = field226.method354();
				field481 = field226.method345();
				field198 = field226.method327();

				if (field319 != 0 && field315 == -1) {
					signlink.dnslookup(PMUEFTAP.method370(field319));
					method128();
					short var177 = 650;
					if (field117 != 201 || field481 == 1) {
						var177 = 655;
					}

					field169 = "";
					field322 = false;

					for (int var178 = 0; var178 < TDQUELMV.field1070.length; var178++) {
						if (TDQUELMV.field1070[var178] != null && TDQUELMV.field1070[var178].field1074 == var177) {
							field315 = TDQUELMV.field1070[var178].field1083;
							break;
						}
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 241) {
				for (int var179 = 0; var179 < field208.length; var179++) {
					if (field455[var179] != field208[var179]) {
						field208[var179] = field455[var179];
						method39(var179);
						field390 = true;
					}
				}

				field435 = -1;
				return true;
			}

			if (field435 == 145) {
				int var180 = field226.method354();
				int var181 = field226.method352();
				TDQUELMV var182 = TDQUELMV.field1070[var181];
				if (var182 != null && var182.field1110 == 0) {
					if (var180 < 0) {
						var180 = 0;
					}

					if (var180 > var182.field1129 - var182.field1076) {
						var180 = var182.field1129 - var182.field1076;
					}

					var182.field1131 = var180;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 189 || field435 == 192 || field435 == 152 || field435 == 51 || field435 == 50 || field435 == 110 || field435 == 211 || field435 == 48 || field435 == 249 || field435 == 172 || field435 == 251) {
				method51(field435, field226);
				field435 = -1;
				return true;
			}

			if (field435 == 52) {
				int var183 = field226.method327();
				int var184 = field226.method356();
				TDQUELMV var185 = TDQUELMV.field1070[var183];
				var185.field1113 = var184;

				if (var184 == -1) {
					var185.field1128 = 0;
					var185.field1069 = 0;
				}

				field435 = -1;
				return true;
			}

			if (field435 == 205) {
				field383 = true;
				field448 = field226.method325();
				field449 = field226.method325();
				field450 = field226.method327();
				field451 = field226.method325();
				field452 = field226.method325();
				if (field452 >= 100) {
					field238 = field448 * 128 + 64;
					field240 = field449 * 128 + 64;
					field239 = method24(field238, field240, field379) - field450;
				}

				field435 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field435 + "," + field434 + " - " + field114 + "," + field115);
			method147();
		} catch (IOException var190) {
			method28();
		} catch (Exception var191) {
			String var187 = "T2 - " + field435 + "," + field114 + "," + field115 + " - " + field434 + "," + (field130.field1041[0] + field444) + "," + (field130.field1042[0] + field445) + " - ";
			for (int var188 = 0; var188 < field434 && var188 < 50; var188++) {
				var187 = var187 + field226.field796[var188] + ",";
			}

			signlink.reporterror(var187);
			method147();
		}

		return true;
	}

	@ObfuscatedName("client.a(LUTGRLTTT;I)V")
	public final void method49(UTGRLTTT arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1163 == 0) {
			var2 = field217.method432(arg0.field1162, arg0.field1164, arg0.field1165);
		}

		if (arg0.field1163 == 1) {
			var2 = field217.method433(arg0.field1165, arg0.field1162, arg0.field1164);
		}

		if (arg0.field1163 == 2) {
			var2 = field217.method434(arg0.field1162, arg0.field1164, arg0.field1165);
		}

		if (arg0.field1163 == 3) {
			var2 = field217.method435(arg0.field1162, arg0.field1164, arg0.field1165);
		}

		if (var2 != 0) {
			int var6 = field217.method436(arg0.field1162, arg0.field1164, arg0.field1165, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1156 = var3;
		arg0.field1158 = var4;
		arg0.field1157 = var5;
	}

	@ObfuscatedName("client.c(Z)Z")
	public final boolean method50() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IILMQZHAILV;)V")
	public final void method51(int arg0, MQZHAILV arg1) {
		if (arg0 == 172) {
			int var3 = arg1.method344();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field486[var4];
			int var7 = arg1.method345();
			int var8 = (var7 >> 4 & 0x7) + field109;
			int var9 = (var7 & 0x7) + field110;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				method98(0, var4, field379, -1, var5, -1, var9, var8, var6);
			}
		} else if (arg0 == 50) {
			int var10 = arg1.method325();
			int var11 = (var10 >> 4 & 0x7) + field109;
			int var12 = (var10 & 0x7) + field110;
			int var13 = arg1.method327();
			int var14 = arg1.method325();
			int var15 = arg1.method327();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
				var11 = var11 * 128 + 64;
				var12 = var12 * 128 + 64;
				YVZOKMUV var16 = new YVZOKMUV(field336, var12, var13, method24(var11, var12, field379) - var14, field379, var15, var11);
				field167.method373(var16);
			}
		} else if (arg0 == 48) {
			int var17 = arg1.method354();
			int var18 = arg1.method354();
			int var19 = arg1.method325();
			int var20 = (var19 >> 4 & 0x7) + field109;
			int var21 = (var19 & 0x7) + field110;
			if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
				XVTADERI var22 = new XVTADERI();
				var22.field1283 = var17;
				var22.field1282 = var18;

				if (field479[field379][var20][var21] == null) {
					field479[field379][var20][var21] = new PUBJBHOK();
				}

				field479[field379][var20][var21].method373(var22);
				method94(var20, var21);
			}
		} else if (arg0 == 249) {
			int var23 = arg1.method346();
			int var24 = (var23 >> 4 & 0x7) + field109;
			int var25 = (var23 & 0x7) + field110;
			int var26 = arg1.method346();
			int var27 = var26 >> 2;
			int var28 = var26 & 0x3;
			int var29 = field486[var27];
			int var30 = arg1.method327();
			if (var24 >= 0 && var25 >= 0 && var24 < 103 && var25 < 103) {
				int var31 = field387[field379][var24][var25];
				int var32 = field387[field379][var24 + 1][var25];
				int var33 = field387[field379][var24 + 1][var25 + 1];
				int var34 = field387[field379][var24][var25 + 1];
				if (var29 == 0) {
					UDINYNOF var35 = field217.method428(var24, field379, var25);
					if (var35 != null) {
						int var36 = var35.field1146 >> 14 & 0x7FFF;
						if (var27 == 2) {
							var35.field1144 = new UYLEXXVQ(var32, var34, var30, var36, var33, var28 + 4, var31, false, 2);
							var35.field1145 = new UYLEXXVQ(var32, var34, var30, var36, var33, var28 + 1 & 0x3, var31, false, 2);
						} else {
							var35.field1144 = new UYLEXXVQ(var32, var34, var30, var36, var33, var28, var31, false, var27);
						}
					}
				}

				if (var29 == 1) {
					FESTVVBZ var37 = field217.method429(var25, var24, field379);
					if (var37 != null) {
						var37.field619 = new UYLEXXVQ(var32, var34, var30, var37.field620 >> 14 & 0x7FFF, var33, 0, var31, false, 4);
					}
				}

				if (var29 == 2) {
					PNVHROUP var38 = field217.method430(var24, var25, field379);

					if (var27 == 11) {
						var27 = 10;
					}

					if (var38 != null) {
						var38.field838 = new UYLEXXVQ(var32, var34, var30, var38.field846 >> 14 & 0x7FFF, var33, var28, var31, false, var27);
					}
				}

				if (var29 == 3) {
					ETYRIJEZ var39 = field217.method431(var24, var25, field379);
					if (var39 != null) {
						var39.field585 = new UYLEXXVQ(var32, var34, var30, var39.field586 >> 14 & 0x7FFF, var33, var28, var31, false, 22);
					}
				}
			}
		} else if (arg0 == 51) {
			int var40 = arg1.method344();
			int var41 = (var40 >> 4 & 0x7) + field109;
			int var42 = (var40 & 0x7) + field110;
			int var43 = arg1.method327();
			int var44 = arg1.method327();
			int var45 = arg1.method354();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && field465 != var44) {
				XVTADERI var46 = new XVTADERI();
				var46.field1283 = var45;
				var46.field1282 = var43;

				if (field479[field379][var41][var42] == null) {
					field479[field379][var41][var42] = new PUBJBHOK();
				}

				field479[field379][var41][var42].method373(var46);
				method94(var41, var42);
			}
		} else {
			if (arg0 == 189) {
				int var47 = arg1.method325();
				int var48 = (var47 >> 4 & 0x7) + field109;
				int var49 = (var47 & 0x7) + field110;
				int var50 = arg1.method327();
				int var51 = arg1.method325();
				int var52 = var51 >> 4 & 0xF;
				int var53 = var51 & 0x7;
				if (field130.field1041[0] >= var48 - var52 && field130.field1041[0] <= var48 + var52 && field130.field1042[0] >= var49 - var52 && field130.field1042[0] <= var49 + var52 && field334 && !field340 && field308 < 50) {
					field172[field308] = var50;
					field82[field308] = var53;
					field310[field308] = ETTRSMMZ.field576[var50];
					field308++;
				}
			}

			if (arg0 == 192) {
				int var54 = arg1.method325();
				int var55 = (var54 >> 4 & 0x7) + field109;
				int var56 = (var54 & 0x7) + field110;
				int var57 = arg1.method327();
				int var58 = arg1.method327();
				int var59 = arg1.method327();
				if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
					PUBJBHOK var60 = field479[field379][var55][var56];
					if (var60 != null) {
						for (XVTADERI var61 = (XVTADERI) var60.method376(); var61 != null; var61 = (XVTADERI) var60.method378()) {
							if ((var57 & 0x7FFF) == var61.field1283 && var61.field1282 == var58) {
								var61.field1282 = var59;
								break;
							}
						}

						method94(var55, var56);
					}
				}
			} else if (arg0 == 110) {
				int var62 = arg1.method325();
				int var63 = (var62 >> 4 & 0x7) + field109;
				int var64 = (var62 & 0x7) + field110;
				int var65 = var63 + arg1.method326();
				int var66 = var64 + arg1.method326();
				int var67 = arg1.method328();
				int var68 = arg1.method327();
				int var69 = arg1.method325() * 4;
				int var70 = arg1.method325() * 4;
				int var71 = arg1.method327();
				int var72 = arg1.method327();
				int var73 = arg1.method325();
				int var74 = arg1.method325();
				if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104 && var68 != 0xFFFF) {
					var63 = var63 * 128 + 64;
					var64 = var64 * 128 + 64;
					var65 = var65 * 128 + 64;
					var66 = var66 * 128 + 64;
					VGUAJUPX var75 = new VGUAJUPX(var67, field379, var70, field336 + var72, var68, var74, var73, var63, field336 + var71, method24(var63, var64, field379) - var69, var64);
					var75.method507(var66, method24(var65, var66, field379) - var70, var65, field336 + var71);
					field100.method373(var75);
				}
			} else if (arg0 == 251) {
				int var76 = arg1.method327();
				int var77 = arg1.method325();
				int var78 = var77 >> 2;
				int var79 = var77 & 0x3;
				int var80 = field486[var78];
				int var81 = arg1.method325();
				int var82 = (var81 >> 4 & 0x7) + field109;
				int var83 = (var81 & 0x7) + field110;
				if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
					method98(0, var78, field379, -1, var79, var76, var83, var82, var80);
				}
			} else if (arg0 == 211) {
				int var84 = arg1.method354();
				int var85 = arg1.method345();
				int var86 = (var85 >> 4 & 0x7) + field109;
				int var87 = (var85 & 0x7) + field110;
				if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
					PUBJBHOK var88 = field479[field379][var86][var87];
					if (var88 != null) {
						for (XVTADERI var89 = (XVTADERI) var88.method376(); var89 != null; var89 = (XVTADERI) var88.method378()) {
							if ((var84 & 0x7FFF) == var89.field1283) {
								var89.method492();
								break;
							}
						}

						if (var88.method376() == null) {
							field479[field379][var86][var87] = null;
						}

						method94(var86, var87);
					}
				}
			} else if (arg0 == 152) {
				int var90 = arg1.method354();
				byte var91 = arg1.method347();
				byte var92 = arg1.method347();
				int var93 = arg1.method327();
				byte var94 = arg1.method348();
				int var95 = arg1.method325();
				int var96 = (var95 >> 4 & 0x7) + field109;
				int var97 = (var95 & 0x7) + field110;
				byte var98 = arg1.method326();
				int var99 = arg1.method354();
				int var100 = arg1.method354();
				int var101 = arg1.method346();
				int var102 = var101 >> 2;
				int var103 = var101 & 0x3;
				int var104 = field486[var102];
				KWSXZIVG var105;
				if (field465 == var99) {
					var105 = field130;
				} else {
					var105 = field406[var99];
				}

				if (var105 != null) {
					ZXOFSHYE var106 = ZXOFSHYE.method588(var90);
					int var107 = field387[field379][var96][var97];
					int var108 = field387[field379][var96 + 1][var97];
					int var109 = field387[field379][var96 + 1][var97 + 1];
					int var110 = field387[field379][var96][var97 + 1];
					YYHPBDED var111 = var106.method586(var102, var103, var107, var108, var109, var110, -1);
					if (var111 != null) {
						method98(var100 + 1, 0, field379, var93 + 1, 0, -1, var97, var96, var104);
						var105.field752 = field336 + var100;
						var105.field753 = field336 + var93;
						var105.field747 = var111;
						int var112 = var106.field1472;
						int var113 = var106.field1488;
						if (var103 == 1 || var103 == 3) {
							var112 = var106.field1488;
							var113 = var106.field1472;
						}

						var105.field744 = var96 * 128 + var112 * 64;
						var105.field746 = var97 * 128 + var113 * 64;
						var105.field745 = method24(var105.field744, var105.field746, field379);

						if (var94 > var92) {
							byte var114 = var94;
							var94 = var92;
							var92 = var114;
						}

						if (var91 > var98) {
							byte var115 = var91;
							var91 = var98;
							var98 = var115;
						}

						var105.field748 = var94 + var96;
						var105.field750 = var92 + var96;
						var105.field749 = var91 + var97;
						var105.field751 = var97 + var98;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method52() {
		if (field443 == 2) {
			for (UTGRLTTT var1 = (UTGRLTTT) field116.method376(); var1 != null; var1 = (UTGRLTTT) field116.method378()) {
				if (var1.field1166 > 0) {
					var1.field1166--;
				}

				if (var1.field1166 != 0) {
					if (var1.field1155 > 0) {
						var1.field1155--;
					}

					if (var1.field1155 == 0 && var1.field1164 >= 1 && var1.field1165 >= 1 && var1.field1164 <= 102 && var1.field1165 <= 102 && (var1.field1159 < 0 || MPWDIIUH.method281(var1.field1159, var1.field1161))) {
						method141(var1.field1160, var1.field1159, var1.field1162, var1.field1165, var1.field1161, var1.field1164, var1.field1163);
						var1.field1155 = -1;

						if (var1.field1159 == var1.field1156 && var1.field1156 == -1) {
							var1.method492();
						} else if (var1.field1159 == var1.field1156 && var1.field1160 == var1.field1157 && var1.field1161 == var1.field1158) {
							var1.method492();
						}
					}
				} else if (var1.field1156 < 0 || MPWDIIUH.method281(var1.field1156, var1.field1158)) {
					method141(var1.field1157, var1.field1156, var1.field1162, var1.field1165, var1.field1158, var1.field1164, var1.field1163);
					var1.method492();
				}
			}

			field463++;
			if (field463 > 1729) {
				field463 = 0;
				field280.method314(150);
				field280.method315(0);
				int var2 = field280.field797;

				if ((int) (Math.random() * 2.0D) == 0) {
					field280.method316(29185);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field280.method316(16136);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field280.method316(49565);
				}

				field280.method316(39160);

				if ((int) (Math.random() * 2.0D) == 0) {
					field280.method315(97);
				}

				field280.method316((int) (Math.random() * 65536.0D));
				field280.method316(7669);
				field280.method316(55494);
				field280.method316(52743);

				if ((int) (Math.random() * 2.0D) == 0) {
					field280.method315(155);
				}

				field280.method324(field280.field797 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method53(String arg0) {
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

	@ObfuscatedName("client.l(I)V")
	public final void method54() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field193[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field193[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field194[var10] = (field193[var10 - 1] + field193[var10 + 1] + field193[var10 - 128] + field193[var10 + 128]) / 4;
			}
		}

		field250 += 128;
		if (field250 > field251.length) {
			field250 -= field251.length;
			int var11 = (int) (Math.random() * 12.0D);
			method26(field429[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field194[var14 + 128] - field251[field250 + var14 & field251.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field193[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field131[var16] = field131[var16 + 1];
		}

		field131[var1 - 1] = (int) (Math.sin(field336 / 14.0D) * 16.0D + Math.sin(field336 / 15.0D) * 14.0D + Math.sin(field336 / 16.0D) * 12.0D);

		if (field363 > 0) {
			field363 -= 4;
		}

		if (field364 > 0) {
			field364 -= 4;
		}

		if (field363 == 0 && field364 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field363 = 1024;
			}

			if (var17 == 1) {
				field364 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public static final void method55() {
		RGNQYESN.field911 = false;
		QSZFQZON.field882 = false;
		field340 = false;
		MPWDIIUH.field790 = false;
		ZXOFSHYE.field1485 = false;
	}

	@ObfuscatedName("client.a(LUFHMHWIH;IZI)V")
	public final void method56(UFHMHWIH arg0, int arg1, int arg2) {
		int var4 = field346 + field247 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = YYHPBDED.field1408[var4];
			int var7 = YYHPBDED.field1409[var4];
			var6 = var6 * 256 / (field374 + 256);
			var7 = var7 * 256 / (field374 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method504(var8 + 94 + 4 - arg0.field1153 / 2, field98, 83 - var9 - arg0.field1154 / 2 - 4);
			} else {
				arg0.method498(var8 + 94 + 4 - arg0.field1153 / 2, 83 - var9 - arg0.field1154 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.n(I)Ljava/net/Socket;")
	public final Socket method57(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method58() {
		Graphics var1 = method42().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method579(1);

		if (field454) {
			field182 = false;
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

		if (field106) {
			field182 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field215) {
			field182 = false;
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

	@ObfuscatedName("client.a(IILCOIHKGSL;II)V")
	public final void method59(int arg0, int arg1, COIHKGSL arg2, int arg3) {
		if (field137 < 400) {
			if (arg2.field518 != null) {
				arg2 = arg2.method167();
			}

			if (arg2 != null && arg2.field515) {
				String var5 = arg2.field523;
				if (arg2.field502 != 0) {
					var5 = var5 + method33(arg2.field502, field130.field755) + " (level-" + arg2.field502 + ")";
				}

				if (field132 == 1) {
					field124[field137] = "Use " + field136 + " with @yel@" + var5;
					field326[field137] = 345;
					field327[field137] = arg3;
					field324[field137] = arg1;
					field325[field137] = arg0;
					field137++;
				} else if (field422 != 1) {
					if (arg2.field520 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field520[var6] != null && !arg2.field520[var6].equalsIgnoreCase("attack")) {
								field124[field137] = arg2.field520[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field326[field137] = 205;
								}

								if (var6 == 1) {
									field326[field137] = 475;
								}

								if (var6 == 2) {
									field326[field137] = 677;
								}

								if (var6 == 3) {
									field326[field137] = 381;
								}

								if (var6 == 4) {
									field326[field137] = 939;
								}

								field327[field137] = arg3;
								field324[field137] = arg1;
								field325[field137] = arg0;
								field137++;
							}
						}
					}

					if (arg2.field520 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field520[var7] != null && arg2.field520[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field502 > field130.field755) {
									var8 = 2000;
								}

								field124[field137] = arg2.field520[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field326[field137] = var8 + 205;
								}

								if (var7 == 1) {
									field326[field137] = var8 + 475;
								}

								if (var7 == 2) {
									field326[field137] = var8 + 677;
								}

								if (var7 == 3) {
									field326[field137] = var8 + 381;
								}

								if (var7 == 4) {
									field326[field137] = var8 + 939;
								}

								field327[field137] = arg3;
								field324[field137] = arg1;
								field325[field137] = arg0;
								field137++;
							}
						}
					}

					field124[field137] = "Examine @yel@" + var5;
					field326[field137] = 1520;
					field327[field137] = arg3;
					field324[field137] = arg1;
					field325[field137] = arg0;
					field137++;
				} else if ((field424 & 0x2) == 2) {
					field124[field137] = field425 + " @yel@" + var5;
					field326[field137] = 214;
					field327[field137] = arg3;
					field324[field137] = arg1;
					field325[field137] = arg0;
					field137++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method60() {
		int var1 = field233;
		int var2 = field234;
		int var3 = field235;
		int var4 = field236;
		int var5 = 0x5D5447;
		JJCVVTJN.method258(var3, var1, var5, var2, var4);
		JJCVVTJN.method258(var3 - 2, var1 + 1, 0, var2 + 1, 16);
		JJCVVTJN.method259(var1 + 1, var2 + 18, 0, var4 - 19, var3 - 2);
		field268.method462(var5, "Choose Option", var2 + 14, var1 + 3);
		int var6 = field1428;
		int var7 = field1429;
		if (field232 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field232 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field232 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field137; var8++) {
			int var9 = (field137 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field268.method466(var9, true, field124[var8], var1 + 3, var10);
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method61(int arg0, int arg1) {
		boolean var3 = false;
		TDQUELMV var4 = TDQUELMV.field1070[arg1];
		for (int var5 = 0; var5 < var4.field1122.length && var4.field1122[var5] != -1; var5++) {
			TDQUELMV var6 = TDQUELMV.field1070[var4.field1122[var5]];
			if (var6.field1110 == 1) {
				var3 |= method61(arg0, var6.field1093);
			}

			if (var6.field1110 == 6 && (var6.field1113 != -1 || var6.field1114 != -1)) {
				boolean var7 = method127(var6);
				int var8;
				if (var7) {
					var8 = var6.field1114;
				} else {
					var8 = var6.field1113;
				}

				if (var8 != -1) {
					JFYFSKVR var9 = JFYFSKVR.field659[var8];
					var6.field1069 += arg0;
					while (var6.field1069 > var9.method251(var6.field1128)) {
						var6.field1069 -= var9.method251(var6.field1128) + 1;
						var6.field1128++;
						if (var6.field1128 >= var9.field660) {
							var6.field1128 -= var9.field664;
							if (var6.field1128 < 0 || var6.field1128 >= var9.field660) {
								var6.field1128 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1110 == 6 && var6.field1077 != 0) {
				int var10 = var6.field1077 >> 16;
				int var11 = var6.field1077 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1079 = var6.field1079 + var10 & 0x7FF;
				var6.field1080 = var6.field1080 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method62() {
		if (field132 == 0 && field422 == 0) {
			field124[field137] = "Walk here";
			field326[field137] = 672;
			field324[field137] = field1428;
			field325[field137] = field1429;
			field137++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < YYHPBDED.field1406; var2++) {
			int var3 = YYHPBDED.field1407[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field217.method436(field379, var4, var5, var3) >= 0) {
					ZXOFSHYE var8 = ZXOFSHYE.method588(var7);
					if (var8.field1456 != null) {
						var8 = var8.method589();
					}

					if (var8 == null) {
						continue;
					}

					if (field132 == 1) {
						field124[field137] = "Use " + field136 + " with @cya@" + var8.field1466;
						field326[field137] = 37;
						field327[field137] = var3;
						field324[field137] = var4;
						field325[field137] = var5;
						field137++;
					} else if (field422 != 1) {
						if (var8.field1459 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1459[var9] != null) {
									field124[field137] = var8.field1459[var9] + " @cya@" + var8.field1466;

									if (var9 == 0) {
										field326[field137] = 276;
									}

									if (var9 == 1) {
										field326[field137] = 413;
									}

									if (var9 == 2) {
										field326[field137] = 899;
									}

									if (var9 == 3) {
										field326[field137] = 115;
									}

									if (var9 == 4) {
										field326[field137] = 1161;
									}

									field327[field137] = var3;
									field324[field137] = var4;
									field325[field137] = var5;
									field137++;
								}
							}
						}

						field124[field137] = "Examine @cya@" + var8.field1466;
						field326[field137] = 1230;
						field327[field137] = var8.field1470 << 14;
						field324[field137] = var4;
						field325[field137] = var5;
						field137++;
					} else if ((field424 & 0x4) == 4) {
						field124[field137] = field425 + " @cya@" + var8.field1466;
						field326[field137] = 337;
						field327[field137] = var3;
						field324[field137] = var4;
						field325[field137] = var5;
						field137++;
					}
				}

				if (var6 == 1) {
					OQGXHJNH var10 = field120[var7];
					if (var10.field815.field526 == 1 && (var10.field1019 & 0x7F) == 0x40 && (var10.field1020 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field121; var11++) {
							OQGXHJNH var12 = field120[field122[var11]];
							if (var12 != null && var10 != var12 && var12.field815.field526 == 1 && var10.field1019 == var12.field1019 && var10.field1020 == var12.field1020) {
								method59(var5, var4, var12.field815, field122[var11]);
							}
						}

						for (int var13 = 0; var13 < field407; var13++) {
							KWSXZIVG var14 = field406[field408[var13]];
							if (var14 != null && var10.field1019 == var14.field1019 && var10.field1020 == var14.field1020) {
								method153(var14, var5, field408[var13], var4);
							}
						}
					}

					method59(var5, var4, var10.field815, var7);
				}

				if (var6 == 0) {
					KWSXZIVG var15 = field406[var7];
					if ((var15.field1019 & 0x7F) == 0x40 && (var15.field1020 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field121; var16++) {
							OQGXHJNH var17 = field120[field122[var16]];
							if (var17 != null && var17.field815.field526 == 1 && var15.field1019 == var17.field1019 && var15.field1020 == var17.field1020) {
								method59(var5, var4, var17.field815, field122[var16]);
							}
						}

						for (int var18 = 0; var18 < field407; var18++) {
							KWSXZIVG var19 = field406[field408[var18]];
							if (var19 != null && var15 != var19 && var15.field1019 == var19.field1019 && var15.field1020 == var19.field1020) {
								method153(var19, var5, field408[var18], var4);
							}
						}
					}

					method153(var15, var5, var7, var4);
				}

				if (var6 == 3) {
					PUBJBHOK var20 = field479[field379][var4][var5];
					if (var20 != null) {
						for (XVTADERI var21 = (XVTADERI) var20.method377(); var21 != null; var21 = (XVTADERI) var20.method379()) {
							CBASPZKU var22 = CBASPZKU.method13(var21.field1283);
							if (field132 == 1) {
								field124[field137] = "Use " + field136 + " with @lre@" + var22.field37;
								field326[field137] = 782;
								field327[field137] = var21.field1283;
								field324[field137] = var4;
								field325[field137] = var5;
								field137++;
							} else if (field422 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field16 != null && var22.field16[var23] != null) {
										field124[field137] = var22.field16[var23] + " @lre@" + var22.field37;

										if (var23 == 0) {
											field326[field137] = 60;
										}

										if (var23 == 1) {
											field326[field137] = 50;
										}

										if (var23 == 2) {
											field326[field137] = 814;
										}

										if (var23 == 3) {
											field326[field137] = 415;
										}

										if (var23 == 4) {
											field326[field137] = 516;
										}

										field327[field137] = var21.field1283;
										field324[field137] = var4;
										field325[field137] = var5;
										field137++;
									} else if (var23 == 2) {
										field124[field137] = "Take @lre@" + var22.field37;
										field326[field137] = 814;
										field327[field137] = var21.field1283;
										field324[field137] = var4;
										field325[field137] = var5;
										field137++;
									}
								}

								field124[field137] = "Examine @lre@" + var22.field37;
								field326[field137] = 1566;
								field327[field137] = var21.field1283;
								field324[field137] = var4;
								field325[field137] = var5;
								field137++;
							} else if ((field424 & 0x1) == 1) {
								field124[field137] = field425 + " @lre@" + var22.field37;
								field326[field137] = 461;
								field327[field137] = var21.field1283;
								field324[field137] = var4;
								field325[field137] = var5;
								field137++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method63() {
		if (!field215 && !field454 && !field106) {
			field336++;

			if (field95) {
				method155();
			} else {
				method125();
			}

			method121();
		}
	}

	@ObfuscatedName("client.b(LTDQUELMV;I)Z")
	public final boolean method64(TDQUELMV arg0) {
		int var2 = arg0.field1074;
		if (field296 == 2) {
			if (var2 == 201) {
				field359 = true;
				field138 = 0;
				field229 = true;
				field73 = "";
				field69 = 1;
				field107 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field359 = true;
				field138 = 0;
				field229 = true;
				field73 = "";
				field69 = 2;
				field107 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field438 = 250;
			return true;
		}

		if (var2 == 501) {
			field359 = true;
			field138 = 0;
			field229 = true;
			field73 = "";
			field69 = 4;
			field107 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field359 = true;
			field138 = 0;
			field229 = true;
			field73 = "";
			field69 = 5;
			field107 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field265[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = LNSFKVMU.field758 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= LNSFKVMU.field758) {
							var5 = 0;
						}
					}

					if (!LNSFKVMU.field759[var5].field765 && LNSFKVMU.field759[var5].field760 == var3 + (field402 ? 0 : 7)) {
						break;
					}
				}

				field265[var3] = var5;
				field221 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field485[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field170[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field170[var6].length) {
					var8 = 0;
				}
			}

			field485[var6] = var8;
			field221 = true;
		}

		if (var2 == 324 && !field402) {
			field402 = true;
			method100();
		}

		if (var2 == 325 && field402) {
			field402 = false;
			method100();
		}

		if (var2 == 326) {
			field280.method314(203);
			field280.method315(field402 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field280.method315(field265[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field280.method315(field485[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field322 = !field322;
		}

		if (var2 >= 601 && var2 <= 612) {
			method128();

			if (field169.length() > 0) {
				field280.method314(129);
				field280.method321(PMUEFTAP.method367(field169));
				field280.method315(var2 - 601);
				field280.method315(field322 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(LMQZHAILV;IILKWSXZIVG;I)V")
	public final void method65(MQZHAILV arg0, int arg1, KWSXZIVG arg2, int arg3) {
		if ((arg3 & 0x100) != 0) {
			arg2.field1027 = arg0.method325();
			arg2.field1029 = arg0.method325();
			arg2.field1028 = arg0.method325();
			arg2.field1030 = arg0.method344();
			arg2.field1031 = arg0.method352() + field336;
			arg2.field1032 = arg0.method352() + field336;
			arg2.field1033 = arg0.method344();
			arg2.method478();
		}

		if ((arg3 & 0x20) != 0) {
			int var5 = arg0.method354();
			int var6 = arg0.method325();
			int var7 = arg0.method344();
			int var8 = arg0.field797;

			if (arg2.field737 != null && arg2.field739) {
				long var9 = PMUEFTAP.method367(arg2.field737);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field94; var12++) {
						if (field154[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field459 == 0) {
					try {
						field119.field797 = 0;
						arg0.method362(field119.field796, 0, var7);
						field119.field797 = 0;
						String var13 = FBVMIMMU.method230(var7, field119);
						var13 = DDVOVWJV.method193(var13);
						arg2.field1034 = var13;
						arg2.field1056 = var5 >> 8;
						arg2.field1035 = var5 & 0xFF;
						arg2.field1061 = 150;

						if (var6 == 2 || var6 == 3) {
							method25("@cr2@" + arg2.field737, 1, var13);
						} else if (var6 == 1) {
							method25("@cr1@" + arg2.field737, 1, var13);
						} else {
							method25(arg2.field737, 2, var13);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field797 = var7 + var8;
		}

		if ((arg3 & 0x40) != 0) {
			int var15 = arg0.method346();
			int var16 = arg0.method345();
			arg2.method477(field336, var15, var16);
			arg2.field1064 = field336 + 300;
			arg2.field1065 = arg0.method344();
			arg2.field1066 = arg0.method345();
		}

		if ((arg3 & 0x4) != 0) {
			arg2.field1034 = arg0.method332();
			if (arg2.field1034.charAt(0) == '~') {
				arg2.field1034 = arg2.field1034.substring(1);
				method25(arg2.field737, 2, arg2.field1034);
			} else if (field130 == arg2) {
				method25(arg2.field737, 2, arg2.field1034);
			}

			arg2.field1056 = 0;
			arg2.field1035 = 0;
			arg2.field1061 = 150;
		}

		if ((arg3 & 0x2) != 0) {
			arg2.field1045 = arg0.method327();
			arg2.field1046 = arg0.method352();
		}

		if ((arg3 & 0x200) != 0) {
			int var17 = arg0.method346();
			int var18 = arg0.method346();
			arg2.method477(field336, var17, var18);
			arg2.field1064 = field336 + 300;
			arg2.field1065 = arg0.method346();
			arg2.field1066 = arg0.method344();
		}

		if ((arg3 & 0x1) != 0) {
			int var19 = arg0.method345();
			byte[] var20 = new byte[var19];
			MQZHAILV var21 = new MQZHAILV(var20);
			arg0.method334(0, var19, var20);
			field411[arg1] = var21;
			arg2.method270(var21);
		}

		if ((arg3 & 0x8) != 0) {
			int var22 = arg0.method354();
			if (var22 == 0xFFFF) {
				var22 = -1;
			}

			int var23 = arg0.method346();
			if (arg2.field1047 == var22 && var22 != -1) {
				int var24 = JFYFSKVR.field659[var22].field673;
				if (var24 == 1) {
					arg2.field1048 = 0;
					arg2.field1049 = 0;
					arg2.field1050 = var23;
					arg2.field1051 = 0;
				}

				if (var24 == 2) {
					arg2.field1051 = 0;
				}
			} else if (var22 == -1 || arg2.field1047 == -1 || JFYFSKVR.field659[var22].field667 >= JFYFSKVR.field659[arg2.field1047].field667) {
				arg2.field1047 = var22;
				arg2.field1048 = 0;
				arg2.field1049 = 0;
				arg2.field1050 = var23;
				arg2.field1051 = 0;
				arg2.field1044 = arg2.field1054;
			}
		}

		if ((arg3 & 0x400) != 0) {
			arg2.field1013 = arg0.method354();
			int var25 = arg0.method361();
			arg2.field1017 = var25 >> 16;
			arg2.field1016 = (var25 & 0xFFFF) + field336;
			arg2.field1014 = 0;
			arg2.field1015 = 0;

			if (arg2.field1016 > field336) {
				arg2.field1014 = -1;
			}

			if (arg2.field1013 == 0xFFFF) {
				arg2.field1013 = -1;
			}
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field1026 = arg0.method353();
			if (arg2.field1026 == 0xFFFF) {
				arg2.field1026 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method66() {
		if (field178 == 0) {
			field124[0] = "Cancel";
			field326[0] = 1113;
			field137 = 1;
			method91();
			field213 = 0;

			if (field1428 > 4 && field1429 > 4 && field1428 < 516 && field1429 < 338) {
				if (field315 == -1) {
					method62();
				} else {
					method103(TDQUELMV.field1070[field315], 4, field1429, 0, 4, field1428);
				}
			}

			if (field433 != field213) {
				field433 = field213;
			}

			field213 = 0;

			if (field1428 > 553 && field1429 > 205 && field1428 < 743 && field1429 < 466) {
				if (field482 != -1) {
					method103(TDQUELMV.field1070[field482], 553, field1429, 0, 205, field1428);
				} else if (field227[field209] != -1) {
					method103(TDQUELMV.field1070[field227[field209]], 553, field1429, 0, 205, field1428);
				}
			}

			if (field344 != field213) {
				field390 = true;
				field344 = field213;
			}

			field213 = 0;

			if (field1428 > 17 && field1429 > 357 && field1428 < 496 && field1429 < 453) {
				if (field271 != -1) {
					method103(TDQUELMV.field1070[field271], 17, field1429, 0, 357, field1428);
				} else if (field1429 < 434 && field1428 < 426) {
					method37(field1428 - 17, field1429 - 357);
				}
			}

			if (field271 != -1 && field355 != field213) {
				field359 = true;
				field355 = field213;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field137 - 1; var2++) {
					if (field326[var2] < 1000 && field326[var2 + 1] > 1000) {
						String var3 = field124[var2];
						field124[var2] = field124[var2 + 1];
						field124[var2 + 1] = var3;
						int var4 = field326[var2];
						field326[var2] = field326[var2 + 1];
						field326[var2 + 1] = var4;
						int var5 = field324[var2];
						field324[var2] = field324[var2 + 1];
						field324[var2 + 1] = var5;
						int var6 = field325[var2];
						field325[var2] = field325[var2 + 1];
						field325[var2 + 1] = var6;
						int var7 = field327[var2];
						field327[var2] = field327[var2 + 1];
						field327[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public static final String method67(int arg0) {
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

	@ObfuscatedName("client.e(B)V")
	public final void method68() {
		if (field145 == null) {
			method131();
			field1421 = null;
			field155 = null;
			field156 = null;
			field157 = null;
			field158 = null;
			field159 = null;
			field160 = null;
			field161 = null;
			field162 = null;
			field163 = null;
			field145 = new CPJIVKZX(479, 96, method42());
			field143 = new CPJIVKZX(172, 156, method42());
			JJCVVTJN.method256();
			field98.method246(0, 0);
			field142 = new CPJIVKZX(190, 261, method42());
			field144 = new CPJIVKZX(512, 334, method42());
			JJCVVTJN.method256();
			field79 = new CPJIVKZX(496, 50, method42());
			field80 = new CPJIVKZX(269, 37, method42());
			field81 = new CPJIVKZX(249, 45, method42());
			field245 = true;
		}
	}

	@ObfuscatedName("client.a(LMQZHAILV;ZI)V")
	public final void method69(MQZHAILV arg0, int arg1) {
		arg0.method335();
		int var3 = arg0.method336(8);
		if (var3 < field121) {
			for (int var4 = var3; var4 < field121; var4++) {
				field258[field257++] = field122[var4];
			}
		}

		if (var3 > field121) {
			signlink.reporterror(field331 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field121 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field122[var5];
			OQGXHJNH var7 = field120[var6];
			int var8 = arg0.method336(1);
			if (var8 == 0) {
				field122[field121++] = var6;
				var7.field1022 = field336;
			} else {
				int var9 = arg0.method336(2);
				if (var9 == 0) {
					field122[field121++] = var6;
					var7.field1022 = field336;
					field410[field409++] = var6;
				} else if (var9 == 1) {
					field122[field121++] = var6;
					var7.field1022 = field336;
					int var10 = arg0.method336(3);
					var7.method479(false, var10);
					int var11 = arg0.method336(1);
					if (var11 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 2) {
					field122[field121++] = var6;
					var7.field1022 = field336;
					int var12 = arg0.method336(3);
					var7.method479(true, var12);
					int var13 = arg0.method336(3);
					var7.method479(true, var13);
					int var14 = arg0.method336(1);
					if (var14 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 3) {
					field258[field257++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method70() {
		method87("Starting up", 20);

		if (signlink.sunjava) {
			field1414 = 5;
		}

		if (field466) {
			field215 = true;
		} else {
			field466 = true;
			boolean var1 = false;
			String var2 = method115();
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
						field480[var3] = new XWXMLCDO(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					method90();
					field353 = method30(field260[1], "title", 25, "title screen", 1);
					field266 = new RGWSJTPO("p11_full", false, field353);
					field267 = new RGWSJTPO("p12_full", false, field353);
					field268 = new RGWSJTPO("b12_full", false, field353);
					field269 = new RGWSJTPO("q8_full", true, field353);
					method156();
					method140();
					CXFTMSCH var4 = method30(field260[2], "config", 30, "config", 2);
					CXFTMSCH var5 = method30(field260[3], "interface", 35, "interface", 3);
					CXFTMSCH var6 = method30(field260[4], "media", 40, "2d graphics", 4);
					CXFTMSCH var7 = method30(field260[6], "textures", 45, "textures", 6);
					CXFTMSCH var8 = method30(field260[7], "wordenc", 50, "chat system", 7);
					CXFTMSCH var9 = method30(field260[8], "sounds", 55, "sound effects", 8);
					field461 = new byte[4][104][104];
					field387 = new int[4][105][105];
					field217 = new RGNQYESN(104, field387, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field212[var10] = new MPYOQJPZ(104, 104);
					}

					field318 = new UFHMHWIH(512, 512);
					CXFTMSCH var11 = method30(field260[5], "versionlist", 60, "update list", 5);
					method87("Connecting to update server", 60);
					field298 = new YCBPJRVN();
					field298.method536(var11, this);
					VPISXBMB.method509(field298.method543());
					YYHPBDED.method548(field298.method535(0), field298);

					if (!field340) {
						field104 = 0;
						try {
							field104 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field105 = true;
						field298.method533(2, field104);

						while (field298.method541() > 0) {
							method121();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field298.field1311 > 3) {
								method53("ondemand");
								return;
							}
						}
					}

					method87("Requesting animations", 65);
					int var12 = field298.method535(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field298.method533(1, var13);
					}

					while (field298.method541() > 0) {
						int var14 = var12 - field298.method541();
						if (var14 > 0) {
							method87("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method121();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field298.field1311 > 3) {
							method53("ondemand");
							return;
						}
					}

					method87("Requesting models", 70);
					int var15 = field298.method535(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field298.method540(var16);
						if ((var17 & 0x1) != 0) {
							field298.method533(0, var16);
						}
					}

					int var18 = field298.method541();
					while (field298.method541() > 0) {
						int var19 = var18 - field298.method541();
						if (var19 > 0) {
							method87("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method121();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field480[0] != null) {
						method87("Requesting maps", 75);
						field298.method533(3, field298.method531(47, 0, 48));
						field298.method533(3, field298.method531(47, 1, 48));
						field298.method533(3, field298.method531(48, 0, 48));
						field298.method533(3, field298.method531(48, 1, 48));
						field298.method533(3, field298.method531(49, 0, 48));
						field298.method533(3, field298.method531(49, 1, 48));
						field298.method533(3, field298.method531(47, 0, 47));
						field298.method533(3, field298.method531(47, 1, 47));
						field298.method533(3, field298.method531(48, 0, 47));
						field298.method533(3, field298.method531(48, 1, 47));
						field298.method533(3, field298.method531(48, 0, 148));
						field298.method533(3, field298.method531(48, 1, 148));
						int var20 = field298.method541();
						while (field298.method541() > 0) {
							int var21 = var20 - field298.method541();
							if (var21 > 0) {
								method87("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method121();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field298.method535(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field298.method540(var23);
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
							field298.method525(var23, var25, 0);
						}
					}

					field298.method526(field339);

					if (!field340) {
						int var26 = field298.method535(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field298.method528(var27)) {
								field298.method525(var27, (byte) 1, 2);
							}
						}
					}

					method87("Unpacking media", 80);
					field97 = new HQETDHHW(var6, "invback", 0);
					field99 = new HQETDHHW(var6, "chatback", 0);
					field98 = new HQETDHHW(var6, "mapback", 0);
					field419 = new HQETDHHW(var6, "backbase1", 0);
					field420 = new HQETDHHW(var6, "backbase2", 0);
					field421 = new HQETDHHW(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field458[var28] = new HQETDHHW(var6, "sideicons", var28);
					}

					field249 = new UFHMHWIH(var6, "compass", 0);
					field270 = new UFHMHWIH(var6, "mapedge", 0);
					field270.method495();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field354[var29] = new HQETDHHW(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field368[var30] = new UFHMHWIH(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field88[var31] = new UFHMHWIH(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field365[var32] = new UFHMHWIH(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field76 = new UFHMHWIH(var6, "mapmarker", 0);
					field77 = new UFHMHWIH(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field228[var33] = new UFHMHWIH(var6, "cross", var33);
					}

					field468 = new UFHMHWIH(var6, "mapdots", 0);
					field469 = new UFHMHWIH(var6, "mapdots", 1);
					field470 = new UFHMHWIH(var6, "mapdots", 2);
					field471 = new UFHMHWIH(var6, "mapdots", 3);
					field472 = new UFHMHWIH(var6, "mapdots", 4);
					field396 = new HQETDHHW(var6, "scrollbar", 0);
					field397 = new HQETDHHW(var6, "scrollbar", 1);
					field302 = new HQETDHHW(var6, "redstone1", 0);
					field303 = new HQETDHHW(var6, "redstone2", 0);
					field304 = new HQETDHHW(var6, "redstone3", 0);
					field305 = new HQETDHHW(var6, "redstone1", 0);
					field305.method243();
					field306 = new HQETDHHW(var6, "redstone2", 0);
					field306.method243();
					field148 = new HQETDHHW(var6, "redstone1", 0);
					field148.method244();
					field149 = new HQETDHHW(var6, "redstone2", 0);
					field149.method244();
					field150 = new HQETDHHW(var6, "redstone3", 0);
					field150.method244();
					field151 = new HQETDHHW(var6, "redstone1", 0);
					field151.method243();
					field151.method244();
					field152 = new HQETDHHW(var6, "redstone2", 0);
					field152.method243();
					field152.method244();

					for (int var34 = 0; var34 < 2; var34++) {
						field225[var34] = new HQETDHHW(var6, "mod_icons", var34);
					}

					UFHMHWIH var35 = new UFHMHWIH(var6, "backleft1", 0);
					field281 = new CPJIVKZX(var35.field1149, var35.field1150, method42());
					var35.method496(0, 0);
					UFHMHWIH var36 = new UFHMHWIH(var6, "backleft2", 0);
					field282 = new CPJIVKZX(var36.field1149, var36.field1150, method42());
					var36.method496(0, 0);
					UFHMHWIH var37 = new UFHMHWIH(var6, "backright1", 0);
					field283 = new CPJIVKZX(var37.field1149, var37.field1150, method42());
					var37.method496(0, 0);
					UFHMHWIH var38 = new UFHMHWIH(var6, "backright2", 0);
					field284 = new CPJIVKZX(var38.field1149, var38.field1150, method42());
					var38.method496(0, 0);
					UFHMHWIH var39 = new UFHMHWIH(var6, "backtop1", 0);
					field285 = new CPJIVKZX(var39.field1149, var39.field1150, method42());
					var39.method496(0, 0);
					UFHMHWIH var40 = new UFHMHWIH(var6, "backvmid1", 0);
					field286 = new CPJIVKZX(var40.field1149, var40.field1150, method42());
					var40.method496(0, 0);
					UFHMHWIH var41 = new UFHMHWIH(var6, "backvmid2", 0);
					field287 = new CPJIVKZX(var41.field1149, var41.field1150, method42());
					var41.method496(0, 0);
					UFHMHWIH var42 = new UFHMHWIH(var6, "backvmid3", 0);
					field288 = new CPJIVKZX(var42.field1149, var42.field1150, method42());
					var42.method496(0, 0);
					UFHMHWIH var43 = new UFHMHWIH(var6, "backhmid2", 0);
					field289 = new CPJIVKZX(var43.field1149, var43.field1150, method42());
					var43.method496(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field368[var48] != null) {
							field368[var48].method494(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field354[var48] != null) {
							field354[var48].method245(var46 + var47, var44 + var47, var45 + var47);
						}
					}

					method87("Unpacking textures", 83);
					QSZFQZON.method390(var7);
					QSZFQZON.method394(0.8D);
					QSZFQZON.method389(20);
					method87("Unpacking config", 86);
					JFYFSKVR.method250(var4);
					ZXOFSHYE.method590(var4);
					BXKOBEWK.method3(var4);
					CBASPZKU.method7(var4);
					COIHKGSL.method168(var4);
					LNSFKVMU.method274(var4);
					OQOGSGFM.method364(var4);
					CNLXCYXM.method162(var4);
					CYAEJBRE.method177(var4);
					CBASPZKU.field18 = field339;

					if (!field340) {
						method87("Unpacking sounds", 90);
						byte[] var49 = var9.method176("sounds.dat", null);
						MQZHAILV var50 = new MQZHAILV(var49);
						ETTRSMMZ.method224(var50);
					}

					method87("Unpacking interfaces", 95);
					RGWSJTPO[] var51 = new RGWSJTPO[] { field266, field267, field268, field269 };
					TDQUELMV.method489(var51, var6, var5);
					method87("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field98.field648[field98.field650 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field218[var52] = var53;
						field164[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field98.field648[field98.field650 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field261[var56 - 5] = var57 - 25;
						field67[var56 - 5] = var58 - var57;
					}

					QSZFQZON.method387(479, 96);
					field312 = QSZFQZON.field893;
					QSZFQZON.method387(190, 261);
					field313 = QSZFQZON.field893;
					QSZFQZON.method387(512, 334);
					field314 = QSZFQZON.field893;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = QSZFQZON.field891[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					RGNQYESN.method442(512, 500, 800, var60, 334);
					DDVOVWJV.method183(var8);
					field125 = new UTXVFWKJ(this);
					method97(field125, 10);
					UYLEXXVQ.field1186 = this;
					ZXOFSHYE.field1452 = this;
					COIHKGSL.field513 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field219 + " " + field300);
					field454 = true;
				}
			} else {
				field106 = true;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method71() {
		field183 = 0;
		for (int var1 = -1; var1 < field407 + field121; var1++) {
			SXZSKNOI var2;
			if (var1 == -1) {
				var2 = field130;
			} else if (var1 < field407) {
				var2 = field406[field408[var1]];
			} else {
				var2 = field120[field122[var1 - field407]];
			}

			if (var2 != null && var2.method273()) {
				if (var2 instanceof OQGXHJNH) {
					COIHKGSL var3 = ((OQGXHJNH) var2).field815;
					if (var3.field518 != null) {
						var3 = var3.method167();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field407) {
					COIHKGSL var7 = ((OQGXHJNH) var2).field815;
					if (var7.field512 >= 0 && var7.field512 < field365.length) {
						method88(var2.field1063 + 15, var2);

						if (field102 > -1) {
							field365[var7.field512].method498(field102 - 12, field103 - 30);
						}
					}

					if (field203 == 1 && field122[var1 - field407] == field65 && field336 % 20 < 10) {
						method88(var2.field1063 + 15, var2);

						if (field102 > -1) {
							field365[2].method498(field102 - 12, field103 - 28);
						}
					}
				} else {
					int var4 = 30;
					KWSXZIVG var5 = (KWSXZIVG) var2;
					if (var5.field754 != 0) {
						method88(var2.field1063 + 15, var2);

						if (field102 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field754 & 1 << var6) != 0) {
									field365[var6].method498(field102 - 12, field103 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field203 == 10 && field408[var1] == field357) {
						method88(var2.field1063 + 15, var2);

						if (field102 > -1) {
							field365[7].method498(field102 - 12, field103 - var4);
						}
					}
				}

				if (var2.field1034 != null && (var1 >= field407 || field456 == 0 || field456 == 3 || field456 == 1 && method43(((KWSXZIVG) var2).field737))) {
					method88(var2.field1063, var2);

					if (field102 > -1 && field183 < field184) {
						field188[field183] = field268.method461(var2.field1034) / 2;
						field187[field183] = field268.field980;
						field185[field183] = field102;
						field186[field183] = field103;
						field189[field183] = var2.field1056;
						field190[field183] = var2.field1035;
						field191[field183] = var2.field1061;
						field192[field183++] = var2.field1034;

						if (field90 == 0 && var2.field1035 >= 1 && var2.field1035 <= 3) {
							field187[field183] += 10;
							field186[field183] += 5;
						}

						if (field90 == 0 && var2.field1035 == 4) {
							field188[field183] = 60;
						}

						if (field90 == 0 && var2.field1035 == 5) {
							field187[field183] += 5;
						}
					}
				}

				if (var2.field1064 > field336) {
					method88(var2.field1063 + 15, var2);

					if (field102 > -1) {
						int var8 = var2.field1065 * 30 / var2.field1066;
						if (var8 > 30) {
							var8 = 30;
						}

						JJCVVTJN.method258(var8, field102 - 15, 0xFF00, field103 - 3, 5);
						JJCVVTJN.method258(30 - var8, field102 - 15 + var8, 0xFF0000, field103 - 3, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1025[var9] > field336) {
						method88(var2.field1063 / 2, var2);

						if (field102 > -1) {
							if (var9 == 1) {
								field103 -= 20;
							}

							if (var9 == 2) {
								field102 -= 15;
								field103 -= 10;
							}

							if (var9 == 3) {
								field102 += 15;
								field103 -= 10;
							}

							field88[var2.field1024[var9]].method498(field102 - 12, field103 - 12);
							field266.method458(field103 + 4, 0, field102, String.valueOf(var2.field1023[var9]));
							field266.method458(field103 + 3, 0xFFFFFF, field102 - 1, String.valueOf(var2.field1023[var9]));
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field183; var10++) {
			int var11 = field185[var10];
			int var12 = field186[var10];
			int var13 = field188[var10];
			int var14 = field187[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field186[var16] - field187[var16] && var12 - var14 < field186[var16] + 2 && var11 - var13 < field188[var16] + field185[var16] && var11 + var13 > field185[var16] - field188[var16] && field186[var16] - field187[var16] < var12) {
						var12 = field186[var16] - field187[var16];
						var15 = true;
					}
				}
			}

			field102 = field185[var10];
			field103 = field186[var10] = var12;
			String var17 = field192[var10];
			if (field90 == 0) {
				int var18 = 0xFFFF00;
				if (field189[var10] < 6) {
					var18 = field457[field189[var10]];
				}

				if (field189[var10] == 6) {
					var18 = field197 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field189[var10] == 7) {
					var18 = field197 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field189[var10] == 8) {
					var18 = field197 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field189[var10] == 9) {
					int var19 = 150 - field191[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field189[var10] == 10) {
					int var20 = 150 - field191[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field189[var10] == 11) {
					int var21 = 150 - field191[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field190[var10] == 0) {
					field268.method458(field103 + 1, 0, field102, var17);
					field268.method458(field103, var18, field102, var17);
				}

				if (field190[var10] == 1) {
					field268.method463(field197, field102, 0, var17, field103 + 1);
					field268.method463(field197, field102, var18, var17, field103);
				}

				if (field190[var10] == 2) {
					field268.method464(field103 + 1, field102, field197, 0, var17);
					field268.method464(field103, field102, field197, var18, var17);
				}

				if (field190[var10] == 3) {
					field268.method465(field197, 0, field102, field103 + 1, var17, 150 - field191[var10]);
					field268.method465(field197, var18, field102, field103, var17, 150 - field191[var10]);
				}

				if (field190[var10] == 4) {
					int var22 = field268.method461(var17);
					int var23 = (150 - field191[var10]) * (var22 + 100) / 150;
					JJCVVTJN.method255(334, 0, field102 + 50, field102 - 50);
					field268.method462(0, var17, field103 + 1, field102 + 50 - var23);
					field268.method462(var18, var17, field103, field102 + 50 - var23);
					JJCVVTJN.method254();
				}

				if (field190[var10] == 5) {
					int var24 = 150 - field191[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					JJCVVTJN.method255(field103 + 5, field103 - field268.field980 - 1, 512, 0);
					field268.method458(field103 + var25 + 1, 0, field102, var17);
					field268.method458(field103 + var25, var18, field102, var17);
					JJCVVTJN.method254();
				}
			} else {
				field268.method458(field103 + 1, 0, field102, var17);
				field268.method458(field103, 0xFFFF00, field102, var17);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method72() {
		int var1 = field268.method460("Choose Option");
		for (int var2 = 0; var2 < field137; var2++) {
			int var3 = field268.method460(field124[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field137 * 15 + 21;
		if (field1435 > 4 && field1436 > 4 && field1435 < 516 && field1436 < 338) {
			int var5 = field1435 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1436 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field64 = true;
			field232 = 0;
			field233 = var5;
			field234 = var6;
			field235 = var1;
			field236 = field137 * 15 + 22;
		}

		if (field1435 > 553 && field1436 > 205 && field1435 < 743 && field1436 < 466) {
			int var7 = field1435 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1436 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field64 = true;
			field232 = 1;
			field233 = var7;
			field234 = var8;
			field235 = var1;
			field236 = field137 * 15 + 22;
		}

		if (field1435 > 17 && field1436 > 357 && field1435 < 496 && field1436 < 453) {
			int var9 = field1435 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1436 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field64 = true;
			field232 = 2;
			field233 = var9;
			field234 = var10;
			field235 = var1;
			field236 = field137 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method73(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method74() {
		for (UTGRLTTT var1 = (UTGRLTTT) field116.method376(); var1 != null; var1 = (UTGRLTTT) field116.method378()) {
			if (var1.field1166 == -1) {
				var1.field1155 = 0;
				method49(var1);
			} else {
				var1.method492();
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method75() {
		if (field340 && field443 == 2 && MPWDIIUH.field781 != field379) {
			field144.method172();
			field267.method458(151, 0, 257, "Loading - please wait.");
			field267.method458(150, 0xFFFFFF, 256, "Loading - please wait.");
			field144.method173(field1420, 4, 4);
			field443 = 1;
			field460 = System.currentTimeMillis();
		}

		if (field443 == 1) {
			int var1 = method76();
			if (var1 != 0 && System.currentTimeMillis() - field460 > 360000L) {
				signlink.reporterror(field331 + " glcfb " + field66 + "," + var1 + "," + field340 + "," + field480[0] + "," + field298.method541() + "," + field379 + "," + field278 + "," + field279);
				field460 = System.currentTimeMillis();
			}
		}

		if (field443 == 2 && field379 != field377) {
			field377 = field379;
			method104(field379);
		}
	}

	@ObfuscatedName("client.s(I)I")
	public final int method76() {
		for (int var1 = 0; var1 < field259.length; var1++) {
			if (field259[var1] == null && field399[var1] != -1) {
				return -1;
			}

			if (field140[var1] == null && field400[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field259.length; var3++) {
			byte[] var4 = field140[var3];
			if (var4 != null) {
				int var5 = (field398[var3] >> 8) * 64 - field444;
				int var6 = (field398[var3] & 0xFF) * 64 - field445;
				if (field376) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= MPWDIIUH.method285(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field74) {
			return -4;
		} else {
			field443 = 2;
			MPWDIIUH.field781 = field379;
			method105();
			field280.method314(47);
			return 0;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method77() {
		field142.method172();
		QSZFQZON.field893 = field313;
		field97.method246(0, 0);

		if (field482 != -1) {
			method137(0, 0, TDQUELMV.field1070[field482], 0);
		} else if (field227[field209] != -1) {
			method137(0, 0, TDQUELMV.field1070[field227[field209]], 0);
		}

		if (field64 && field232 == 1) {
			method60();
		}

		field142.method173(field1420, 553, 205);
		field144.method172();
		QSZFQZON.field893 = field314;
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method78(boolean arg0) {
		method146();
		field157.method172();
		field85.method246(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field478 == 0) {
			int var4 = var3 / 2 + 80;
			field266.method459(field298.field1327, 0x75A9A9, true, var2 / 2, var4);
			int var5 = var3 / 2 - 20;
			field268.method459("Welcome to RuneScape", 0xFFFF00, true, var2 / 2, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field86.method246(var6 - 73, var7 - 20);
			field268.method459("New User", 0xFFFFFF, true, var6, var7 + 5);
			int var8 = var2 / 2 + 80;
			field86.method246(var8 - 73, var7 - 20);
			field268.method459("Existing User", 0xFFFFFF, true, var8, var7 + 5);
		}

		if (field478 == 2) {
			int var9 = var3 / 2 - 40;
			if (field126.length() > 0) {
				field268.method459(field126, 0xFFFF00, true, var2 / 2, var9 - 15);
				field268.method459(field127, 0xFFFF00, true, var2 / 2, var9);
				var9 += 30;
			} else {
				field268.method459(field127, 0xFFFF00, true, var2 / 2, var9 - 7);
				var9 += 30;
			}

			field268.method466(var9, true, "Username: " + field331 + (field366 == 0 & field336 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, 0xFFFFFF);
			var9 += 15;
			field268.method466(var9, true, "Password: " + PMUEFTAP.method372(field332) + (field366 == 1 & field336 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field86.method246(var10 - 73, var11 - 20);
				field268.method459("Login", 0xFFFFFF, true, var10, var11 + 5);
				int var12 = var2 / 2 + 80;
				field86.method246(var12 - 73, var11 - 20);
				field268.method459("Cancel", 0xFFFFFF, true, var12, var11 + 5);
			}
		}

		if (field478 == 3) {
			field268.method459("Create a free account", 0xFFFF00, true, var2 / 2, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field268.method459("To create a new account you need to", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field268.method459("go back to the main RuneScape webpage", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field268.method459("and choose the red 'create account'", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field268.method459("button at the top right of that page.", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field86.method246(var14 - 73, var15 - 20);
			field268.method459("Cancel", 0xFFFFFF, true, var14, var15 + 5);
		}

		field157.method173(field1420, 202, 171);

		if (field245) {
			field245 = false;
			field155.method173(field1420, 128, 0);
			field156.method173(field1420, 202, 371);
			field160.method173(field1420, 0, 265);
			field161.method173(field1420, 562, 265);
			field162.method173(field1420, 128, 171);
			field163.method173(field1420, 562, 171);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method79() {
		while (true) {
			int var1 = method580();
			if (var1 == -1) {
				return;
			}

			if (field315 != -1 && field381 == field315) {
				if (var1 == 8 && field169.length() > 0) {
					field169 = field169.substring(0, field169.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field169.length() < 12) {
					field169 = field169 + (char) var1;
				}
			} else if (field229) {
				if (var1 >= 32 && var1 <= 122 && field73.length() < 80) {
					field73 = field73 + (char) var1;
					field359 = true;
				}

				if (var1 == 8 && field73.length() > 0) {
					field73 = field73.substring(0, field73.length() - 1);
					field359 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field229 = false;
					field359 = true;

					if (field69 == 1) {
						long var2 = PMUEFTAP.method367(field73);
						method106(var2);
					}

					if (field69 == 2 && field295 > 0) {
						long var4 = PMUEFTAP.method367(field73);
						method84(var4);
					}

					if (field69 == 3 && field73.length() > 0) {
						field280.method314(187);
						field280.method315(0);
						int var6 = field280.field797;
						field280.method321(field311);
						FBVMIMMU.method231(field73, field280);
						field280.method324(field280.field797 - var6);
						field73 = FBVMIMMU.method232(field73);
						field73 = DDVOVWJV.method193(field73);
						method25(PMUEFTAP.method371(PMUEFTAP.method368(field311)), 6, field73);

						if (field101 == 2) {
							field101 = 1;
							field111 = true;
							field280.method314(59);
							field280.method315(field456);
							field280.method315(field101);
							field280.method315(field309);
						}
					}

					if (field69 == 4 && field94 < 100) {
						long var7 = PMUEFTAP.method367(field73);
						method129(var7);
					}

					if (field69 == 5 && field94 > 0) {
						long var9 = PMUEFTAP.method367(field73);
						method150(var9);
					}
				}
			} else if (field138 == 1) {
				if (var1 >= 48 && var1 <= 57 && field384.length() < 10) {
					field384 = field384 + (char) var1;
					field359 = true;
				}

				if (var1 == 8 && field384.length() > 0) {
					field384 = field384.substring(0, field384.length() - 1);
					field359 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field384.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field384);
						} catch (Exception var21) {
						}

						field280.method314(1);
						field280.method319(var11);
					}

					field138 = 0;
					field359 = true;
				}
			} else if (field138 == 2) {
				if (var1 >= 32 && var1 <= 122 && field384.length() < 12) {
					field384 = field384 + (char) var1;
					field359 = true;
				}

				if (var1 == 8 && field384.length() > 0) {
					field384 = field384.substring(0, field384.length() - 1);
					field359 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field384.length() > 0) {
						field280.method314(109);
						field280.method321(PMUEFTAP.method367(field384));
					}

					field138 = 0;
					field359 = true;
				}
			} else if (field271 == -1) {
				if (var1 >= 32 && var1 <= 122 && field147.length() < 80) {
					field147 = field147 + (char) var1;
					field359 = true;
				}

				if (var1 == 8 && field147.length() > 0) {
					field147 = field147.substring(0, field147.length() - 1);
					field359 = true;
				}

				if ((var1 == 13 || var1 == 10) && field147.length() > 0) {
					if (field165 == 2) {
						if (field147.equals("::clientdrop")) {
							method28();
						}

						if (field147.equals("::lag")) {
							method41();
						}

						if (field147.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field298.method535(2); var12++) {
								field298.method525(var12, (byte) 1, 2);
							}
						}

						if (field147.equals("::fpson")) {
							field75 = true;
						}

						if (field147.equals("::fpsoff")) {
							field75 = false;
						}

						if (field147.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field212[var13].field795[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field147.startsWith("::")) {
						field280.method314(20);
						field280.method315(field147.length() - 1);
						field280.method322(field147.substring(2));
					} else {
						String var16 = field147.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field147 = field147.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field147 = field147.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field147 = field147.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field147 = field147.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field147 = field147.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field147 = field147.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field147 = field147.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field147 = field147.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field147 = field147.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field147 = field147.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field147 = field147.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field147 = field147.substring(6);
						}

						String var18 = field147.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field147 = field147.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field147 = field147.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field147 = field147.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field147 = field147.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field147 = field147.substring(6);
						}

						field280.method314(246);
						field280.method315(0);
						int var20 = field280.field797;
						field280.method343(var19);
						field119.field797 = 0;
						FBVMIMMU.method231(field147, field119);
						field280.method323(0, field119.field796, field119.field797);
						field280.method315(var17);
						field280.method324(field280.field797 - var20);
						field147 = FBVMIMMU.method232(field147);
						field147 = DDVOVWJV.method193(field147);
						field130.field1034 = field147;
						field130.field1056 = var17;
						field130.field1035 = var19;
						field130.field1061 = 150;

						if (field165 == 2) {
							method25("@cr2@" + field130.field737, 2, field130.field1034);
						} else if (field165 == 1) {
							method25("@cr1@" + field130.field737, 2, field130.field1034);
						} else {
							method25(field130.field737, 2, field130.field1034);
						}

						if (field456 == 2) {
							field456 = 3;
							field111 = true;
							field280.method314(59);
							field280.method315(field456);
							field280.method315(field101);
							field280.method315(field309);
						}
					}

					field147 = "";
					field359 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = YYHPBDED.field1408[var7];
			int var13 = YYHPBDED.field1409[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = YYHPBDED.field1408[var8];
			int var16 = YYHPBDED.field1409[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field238 = arg3 - var9;
		field239 = arg1 - var10;
		field240 = arg0 - var11;
		field241 = arg4;
		field242 = arg2;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method81() {
		for (int var1 = 0; var1 < field308; var1++) {
			if (field310[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field172[var1] != field139 || field82[var1] != field83) {
						MQZHAILV var3 = ETTRSMMZ.method225(field82[var1], field172[var1]);
						if (System.currentTimeMillis() + var3.field797 / 22 > field196 / 22 + field297) {
							field196 = var3.field797;
							field297 = System.currentTimeMillis();

							if (method148(var3.field796, var3.field797)) {
								field139 = field172[var1];
								field83 = field82[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method50()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field310[var1] != -5) {
					field310[var1] = -5;
				} else {
					field308--;
					for (int var5 = var1; var5 < field308; var5++) {
						field172[var5] = field172[var5 + 1];
						field82[var5] = field82[var5 + 1];
						field310[var5] = field310[var5 + 1];
					}

					var1--;
				}
			} else {
				field310[var1]--;
			}
		}

		if (field484 > 0) {
			field484 -= 20;
			if (field484 < 0) {
				field484 = 0;
			}

			if (field484 == 0 && field146 && !field340) {
				field104 = field373;
				field105 = true;
				field298.method533(2, field104);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method82() {
		field78 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field182) {
				field175++;
				method54();
				method54();
				method45();
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

	@ObfuscatedName("client.i(Z)V")
	public final void method83() {
		if (field203 == 2) {
			method89(field292 * 2, (field291 - field445 << 7) + field294, (field290 - field444 << 7) + field293);

			if (field102 > -1 && field336 % 20 < 10) {
				field365[2].method498(field102 - 12, field103 - 28);
			}
		}
	}

	public final void init() {
		field337 = Integer.parseInt(getParameter("nodeid"));
		field338 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method34();
		} else {
			method55();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field339 = false;
		} else {
			field339 = true;
		}

		method577(765, 503);
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method84(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field295; var3++) {
				if (field430[var3] == arg0) {
					field295--;
					field390 = true;

					for (int var4 = var3; var4 < field295; var4++) {
						field378[var4] = field378[var4 + 1];
						field385[var4] = field385[var4 + 1];
						field430[var4] = field430[var4 + 1];
					}

					field280.method314(168);
					field280.method321(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILMQZHAILV;)V")
	public final void method85(int arg0, MQZHAILV arg1) {
		while (arg1.field798 + 21 < arg0 * 8) {
			int var3 = arg1.method336(14);
			if (var3 == 16383) {
				break;
			}

			if (field120[var3] == null) {
				field120[var3] = new OQGXHJNH();
			}

			OQGXHJNH var4 = field120[var3];
			field122[field121++] = var3;
			var4.field1022 = field336;
			int var5 = arg1.method336(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method336(1);
			if (var6 == 1) {
				field410[field409++] = var3;
			}

			var4.field815 = COIHKGSL.method171(arg1.method336(12));
			int var7 = arg1.method336(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method336(1);
			var4.field1055 = var4.field815.field526;
			var4.field1018 = var4.field815.field534;
			var4.field1036 = var4.field815.field517;
			var4.field1037 = var4.field815.field531;
			var4.field1038 = var4.field815.field532;
			var4.field1039 = var4.field815.field516;
			var4.field1052 = var4.field815.field530;
			var4.method480(field130.field1041[0] + var7, field130.field1042[0] + var5, var8 == 1);
		}

		arg1.method337();
	}

	@ObfuscatedName("client.u(I)V")
	public final void method86() {
		field143.method172();

		if (field210 == 2) {
			byte[] var1 = field98.field648;
			int[] var2 = JJCVVTJN.field675;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field249.method502(25, field164, 256, field218, 33, 33, 25, 0, 0, field346);
			field144.method172();
		} else {
			int var5 = field346 + field247 & 0x7FF;
			int var6 = field130.field1019 / 32 + 48;
			int var7 = 464 - field130.field1020 / 32;
			field318.method502(var6, field67, field374 + 256, field261, 146, 151, var7, 5, 25, var5);
			field249.method502(25, field164, 256, field218, 33, 33, 25, 0, 0, field346);

			for (int var8 = 0; var8 < field328; var8++) {
				int var9 = field329[var8] * 4 + 2 - field130.field1019 / 32;
				int var10 = field330[var8] * 4 + 2 - field130.field1020 / 32;
				method56(field70[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					PUBJBHOK var13 = field479[field379][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field130.field1019 / 32;
						int var15 = var12 * 4 + 2 - field130.field1020 / 32;
						method56(field468, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field121; var16++) {
				OQGXHJNH var17 = field120[field122[var16]];
				if (var17 != null && var17.method273()) {
					COIHKGSL var18 = var17.field815;
					if (var18.field518 != null) {
						var18 = var18.method167();
					}

					if (var18 != null && var18.field536 && var18.field515) {
						int var19 = var17.field1019 / 32 - field130.field1019 / 32;
						int var20 = var17.field1020 / 32 - field130.field1020 / 32;
						method56(field469, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field407; var21++) {
				KWSXZIVG var22 = field406[field408[var21]];
				if (var22 != null && var22.method273()) {
					int var23 = var22.field1019 / 32 - field130.field1019 / 32;
					int var24 = var22.field1020 / 32 - field130.field1020 / 32;
					boolean var25 = false;
					long var26 = PMUEFTAP.method367(var22.field737);
					for (int var28 = 0; var28 < field295; var28++) {
						if (field430[var28] == var26 && field385[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field130.field733 != 0 && var22.field733 != 0 && field130.field733 == var22.field733) {
						var29 = true;
					}

					if (var25) {
						method56(field471, var23, var24);
					} else if (var29) {
						method56(field472, var23, var24);
					} else {
						method56(field470, var23, var24);
					}
				}
			}

			if (field203 != 0 && field336 % 20 < 10) {
				if (field203 == 1 && field65 >= 0 && field65 < field120.length) {
					OQGXHJNH var30 = field120[field65];
					if (var30 != null) {
						int var31 = var30.field1019 / 32 - field130.field1019 / 32;
						int var32 = var30.field1020 / 32 - field130.field1020 / 32;
						method93(field77, var32, var31);
					}
				}

				if (field203 == 2) {
					int var33 = (field290 - field444) * 4 + 2 - field130.field1019 / 32;
					int var34 = (field291 - field445) * 4 + 2 - field130.field1020 / 32;
					method93(field77, var34, var33);
				}

				if (field203 == 10 && field357 >= 0 && field357 < field406.length) {
					KWSXZIVG var35 = field406[field357];
					if (var35 != null) {
						int var36 = var35.field1019 / 32 - field130.field1019 / 32;
						int var37 = var35.field1020 / 32 - field130.field1020 / 32;
						method93(field77, var37, var36);
					}
				}
			}

			if (field316 != 0) {
				int var38 = field316 * 4 + 2 - field130.field1019 / 32;
				int var39 = field317 * 4 + 2 - field130.field1020 / 32;
				method56(field76, var38, var39);
			}

			JJCVVTJN.method258(3, 97, 0xFFFFFF, 78, 3);
			field144.method172();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method87(String arg0, int arg1) {
		field300 = arg1;
		field219 = arg0;
		method146();

		if (field353 == null) {
			super.method87(arg0, arg1);
		} else {
			field157.method172();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field268.method458(var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			JJCVVTJN.method259(var3 / 2 - 152, var6, 0x8C1111, 34, 304);
			JJCVVTJN.method259(var3 / 2 - 151, var6 + 1, 0, 32, 302);
			JJCVVTJN.method258(arg1 * 3, var3 / 2 - 150, 0x8C1111, var6 + 2, 30);
			JJCVVTJN.method258(300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), 0, var6 + 2, 30);
			field268.method458(var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2, arg0);
			field157.method173(field1420, 202, 171);

			if (field245) {
				field245 = false;

				if (!field182) {
					field158.method173(field1420, 0, 0);
					field159.method173(field1420, 637, 0);
				}

				field155.method173(field1420, 128, 0);
				field156.method173(field1420, 202, 371);
				field160.method173(field1420, 0, 265);
				field161.method173(field1420, 562, 265);
				field162.method173(field1420, 128, 171);
				field163.method173(field1420, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.a(IZLSXZSKNOI;)V")
	public final void method88(int arg0, SXZSKNOI arg1) {
		method89(arg0, arg1.field1020, arg1.field1019);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method89(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method24(arg2, arg1, field379) - arg0;
			arg2 -= field238;
			var4 -= field239;
			arg1 -= field240;
			int var5 = YYHPBDED.field1408[field241];
			int var6 = YYHPBDED.field1409[field241];
			int var7 = YYHPBDED.field1408[field242];
			int var8 = YYHPBDED.field1409[field242];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field102 = (var9 << 9) / arg1 + QSZFQZON.field887;
				field103 = (var11 << 9) / arg1 + QSZFQZON.field888;
			} else {
				field102 = -1;
				field103 = -1;
			}
		} else {
			field102 = -1;
			field103 = -1;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method90() {
		int var1 = 5;
		field260[8] = 0;
		int var2 = 0;
		while (field260[8] == 0) {
			String var3 = "Unknown problem";
			method87("Connecting to web server", 20);

			try {
				DataInputStream var4 = method135("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 329);
				MQZHAILV var5 = new MQZHAILV(new byte[40]);
				var4.readFully(var5.field796, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field260[var6] = var5.method330();
				}

				int var7 = var5.method330();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field260[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field260[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field260[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field260[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field260[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field260[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method87("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method87(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field202 = !field202;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method91() {
		if (field417 != 0) {
			int var1 = 0;
			if (field96 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field264[var2] != null) {
					int var3 = field262[var2];
					String var4 = field263[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field101 == 0 || field101 == 1 && method43(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1428 > 4 && field1429 - 4 > var8 - 10 && field1429 - 4 <= var8 + 3) {
							int var9 = field267.method460("From:  " + var4 + field264[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1428 < var9 + 4) {
								if (field165 >= 1) {
									field124[field137] = "Report abuse @whi@" + var4;
									field326[field137] = 2140;
									field137++;
								}

								field124[field137] = "Add ignore @whi@" + var4;
								field326[field137] = 2633;
								field137++;
								field124[field137] = "Add friend @whi@" + var4;
								field326[field137] = 2539;
								field137++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field101 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLTDQUELMV;)Z")
	public final boolean method92(TDQUELMV arg0) {
		int var2 = arg0.field1074;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field124[field137] = "Remove @whi@" + arg0.field1126;
				field326[field137] = 128;
				field137++;
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

		field124[field137] = "Remove @whi@" + field378[var2];
		field326[field137] = 361;
		field137++;
		field124[field137] = "Message @whi@" + field378[var2];
		field326[field137] = 704;
		field137++;
		return true;
	}

	@ObfuscatedName("client.a(LUFHMHWIH;IIB)V")
	public final void method93(UFHMHWIH arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field346 + field247 & 0x7FF;
			int var6 = YYHPBDED.field1408[var5];
			int var7 = YYHPBDED.field1409[var5];
			var6 = var6 * 256 / (field374 + 256);
			var7 = var7 * 256 / (field374 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field270.method503(20, var12 + 94 + 4 - 10, 15, 20, 83 - var13 - 20, var10, 256, 15);
		} else {
			method56(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method94(int arg0, int arg1) {
		PUBJBHOK var3 = field479[field379][arg0][arg1];
		if (var3 == null) {
			field217.method427(field379, arg0, arg1);
		} else {
			int var4 = -99999999;
			XVTADERI var5 = null;
			for (XVTADERI var6 = (XVTADERI) var3.method376(); var6 != null; var6 = (XVTADERI) var3.method378()) {
				CBASPZKU var7 = CBASPZKU.method13(var6.field1283);
				int var8 = var7.field46;
				if (var7.field22) {
					var8 = (var6.field1282 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method374(var5);
			XVTADERI var9 = null;
			XVTADERI var10 = null;
			for (XVTADERI var11 = (XVTADERI) var3.method376(); var11 != null; var11 = (XVTADERI) var3.method378()) {
				if (var5.field1283 != var11.field1283 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1283 != var11.field1283 && var9.field1283 != var11.field1283 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field217.method413(arg0, arg1, var12, var9, method24(arg0 * 128 + 64, arg1 * 128 + 64, field379), var10, field379, var5);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method95() {
		if (field178 == 0) {
			int var1 = field1434;
			if (field422 == 1 && field1435 >= 516 && field1436 >= 160 && field1435 <= 765 && field1436 <= 205) {
				var1 = 0;
			}

			if (field64) {
				if (var1 != 1) {
					int var2 = field1428;
					int var3 = field1429;
					if (field232 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field232 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field232 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field233 - 10 || var2 > field235 + field233 + 10 || var3 < field234 - 10 || var3 > field236 + field234 + 10) {
						field64 = false;

						if (field232 == 1) {
							field390 = true;
						}

						if (field232 == 2) {
							field359 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field233;
					int var5 = field234;
					int var6 = field235;
					int var7 = field1435;
					int var8 = field1436;
					if (field232 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field232 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field232 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field137; var10++) {
						int var11 = (field137 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method119(var9);
					}

					field64 = false;

					if (field232 == 1) {
						field390 = true;
					}

					if (field232 == 2) {
						field359 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field137 > 0) {
					int var12 = field326[field137 - 1];
					if (var12 == 616 || var12 == 245 || var12 == 823 || var12 == 962 || var12 == 598 || var12 == 758 || var12 == 344 || var12 == 63 || var12 == 803 || var12 == 664 || var12 == 157 || var12 == 1339) {
						int var13 = field324[field137 - 1];
						int var14 = field325[field137 - 1];
						TDQUELMV var15 = TDQUELMV.field1070[var14];
						if (var15.field1099 || var15.field1133) {
							field356 = false;
							field386 = 0;
							field176 = var14;
							field177 = var13;
							field178 = 2;
							field179 = field1435;
							field180 = field1436;

							if (TDQUELMV.field1070[var14].field1083 == field315) {
								field178 = 1;
							}

							if (TDQUELMV.field1070[var14].field1083 == field271) {
								field178 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field453 == 1 || method143(field137 - 1)) && field137 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field137 > 0) {
					method119(field137 - 1);
				}

				if (var1 != 2 || field137 <= 0) {
					return;
				}

				method72();
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method96() {
		signlink.reporterror = false;

		try {
			if (field153 != null) {
				field153.method514();
			}
		} catch (Exception var1) {
		}

		field153 = null;
		method160();

		if (field125 != null) {
			field125.field1172 = false;
		}

		field125 = null;
		field298.method538();
		field298 = null;
		field119 = null;
		field280 = null;
		field181 = null;
		field226 = null;
		field398 = null;
		field259 = null;
		field140 = null;
		field399 = null;
		field400 = null;
		field387 = null;
		field461 = null;
		field217 = null;
		field212 = null;
		field91 = null;
		field199 = null;
		field431 = null;
		field432 = null;
		field92 = null;
		field142 = null;
		field143 = null;
		field144 = null;
		field145 = null;
		field79 = null;
		field80 = null;
		field81 = null;
		field281 = null;
		field282 = null;
		field283 = null;
		field284 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field97 = null;
		field98 = null;
		field99 = null;
		field419 = null;
		field420 = null;
		field421 = null;
		field458 = null;
		field302 = null;
		field303 = null;
		field304 = null;
		field305 = null;
		field306 = null;
		field148 = null;
		field149 = null;
		field150 = null;
		field151 = null;
		field152 = null;
		field249 = null;
		field88 = null;
		field365 = null;
		field228 = null;
		field468 = null;
		field469 = null;
		field470 = null;
		field471 = null;
		field472 = null;
		field354 = null;
		field368 = null;
		field93 = null;
		field406 = null;
		field408 = null;
		field410 = null;
		field411 = null;
		field258 = null;
		field120 = null;
		field122 = null;
		field479 = null;
		field116 = null;
		field100 = null;
		field167 = null;
		field324 = null;
		field325 = null;
		field326 = null;
		field327 = null;
		field124 = null;
		field208 = null;
		field329 = null;
		field330 = null;
		field70 = null;
		field318 = null;
		field378 = null;
		field430 = null;
		field385 = null;
		field158 = null;
		field159 = null;
		field155 = null;
		field156 = null;
		field157 = null;
		field160 = null;
		field161 = null;
		field162 = null;
		field163 = null;
		method131();
		ZXOFSHYE.method591();
		COIHKGSL.method170();
		CBASPZKU.method9();
		BXKOBEWK.field4 = null;
		LNSFKVMU.field759 = null;
		TDQUELMV.field1070 = null;
		KNKCZWKA.field715 = null;
		JFYFSKVR.field659 = null;
		OQOGSGFM.field817 = null;
		OQOGSGFM.field829 = null;
		CNLXCYXM.field488 = null;
		field1421 = null;
		KWSXZIVG.field741 = null;
		QSZFQZON.method385();
		RGNQYESN.method405();
		YYHPBDED.method547();
		VPISXBMB.method511();
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method97(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method97(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 329);

			if (arg0.length == 5) {
				field337 = Integer.parseInt(arg0[0]);
				field338 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method34();
				} else if (arg0[2].equals("highmem")) {
					method55();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field339 = false;
				} else if (arg0[3].equals("members")) {
					field339 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method576(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		UTGRLTTT var10 = null;
		for (UTGRLTTT var11 = (UTGRLTTT) field116.method376(); var11 != null; var11 = (UTGRLTTT) field116.method378()) {
			if (var11.field1162 == arg2 && var11.field1164 == arg7 && var11.field1165 == arg6 && var11.field1163 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new UTGRLTTT();
			var10.field1162 = arg2;
			var10.field1163 = arg8;
			var10.field1164 = arg7;
			var10.field1165 = arg6;
			method49(var10);
			field116.method373(var10);
		}

		var10.field1159 = arg5;
		var10.field1161 = arg1;
		var10.field1160 = arg4;
		var10.field1155 = arg0;
		var10.field1166 = arg3;
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field217.method432(arg0, arg2, arg3);
		if (var6 != 0) {
			int var7 = field217.method436(arg0, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field318.field1148;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			ZXOFSHYE var14 = ZXOFSHYE.method588(var13);
			if (var14.field1480 == -1) {
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
				HQETDHHW var15 = field354[var14.field1480];
				if (var15 != null) {
					int var16 = (var14.field1472 * 4 - var15.field650) / 2;
					int var17 = (var14.field1488 * 4 - var15.field651) / 2;
					var15.method246(arg2 * 4 + var16 + 48, (104 - arg3 - var14.field1488) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field217.method434(arg0, arg2, arg3);
		if (var18 != 0) {
			int var19 = field217.method436(arg0, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			ZXOFSHYE var23 = ZXOFSHYE.method588(var22);
			if (var23.field1480 != -1) {
				HQETDHHW var24 = field354[var23.field1480];
				if (var24 != null) {
					int var25 = (var23.field1472 * 4 - var24.field650) / 2;
					int var26 = (var23.field1488 * 4 - var24.field651) / 2;
					var24.method246(arg2 * 4 + var25 + 48, (104 - arg3 - var23.field1488) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field318.field1148;
				int var29 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field217.method435(arg0, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			ZXOFSHYE var32 = ZXOFSHYE.method588(var31);
			if (var32.field1480 != -1) {
				HQETDHHW var33 = field354[var32.field1480];
				if (var33 != null) {
					int var34 = (var32.field1472 * 4 - var33.field650) / 2;
					int var35 = (var32.field1488 * 4 - var33.field651) / 2;
					var33.method246(arg2 * 4 + var34 + 48, (104 - arg3 - var32.field1488) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method100() {
		field221 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field265[var1] = -1;
			for (int var2 = 0; var2 < LNSFKVMU.field758; var2++) {
				if (!LNSFKVMU.field759[var2].field765 && LNSFKVMU.field759[var2].field760 == var1 + (field402 ? 0 : 7)) {
					field265[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method101(boolean arg0) {
		if (field130.field1019 >> 7 == field316 && field130.field1020 >> 7 == field317) {
			field316 = 0;
		}

		int var2 = field407;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			KWSXZIVG var4;
			int var5;
			if (arg0) {
				var4 = field130;
				var5 = field405 << 14;
			} else {
				var4 = field406[field408[var3]];
				var5 = field408[var3] << 14;
			}

			if (var4 != null && var4.method273()) {
				var4.field736 = false;
				if ((field340 && field407 > 50 || field407 > 200) && !arg0 && var4.field1058 == var4.field1052) {
					var4.field736 = true;
				}

				int var6 = var4.field1019 >> 7;
				int var7 = var4.field1020 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field747 == null || field336 < var4.field752 || field336 >= var4.field753) {
						if ((var4.field1019 & 0x7F) == 0x40 && (var4.field1020 & 0x7F) == 0x40) {
							if (field93[var6][var7] == field197) {
								continue;
							}

							field93[var6][var7] = field197;
						}

						var4.field740 = method24(var4.field1019, var4.field1020, field379);
						field217.method417(var4.field1020, var4.field1019, 60, var4.field740, var4, field379, var4.field1043, var4.field1021, var5);
					} else {
						var4.field736 = false;
						var4.field740 = method24(var4.field1019, var4.field1020, field379);
						field217.method418(var4.field749, var5, field379, var4.field750, var4.field1019, var4.field740, var4.field1020, var4.field1021, var4.field748, var4.field751, 60, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB[B)V")
	public final void method102(boolean arg0, byte[] arg1) {
		if (field146) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(LTDQUELMV;IIZIII)V")
	public final void method103(TDQUELMV arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field1110 == 0 && arg0.field1122 != null && !arg0.field1103 && (arg5 >= arg1 && arg2 >= arg4 && arg5 <= arg0.field1123 + arg1 && arg2 <= arg0.field1076 + arg4)) {
			int var7 = arg0.field1122.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field1091[var8] + arg1;
				int var10 = arg0.field1127[var8] + arg4 - arg3;
				TDQUELMV var11 = TDQUELMV.field1070[arg0.field1122[var8]];
				var9 += var11.field1102;
				var10 += var11.field1121;
				if ((var11.field1112 >= 0 || var11.field1100 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
					if (var11.field1112 >= 0) {
						field213 = var11.field1112;
					} else {
						field213 = var11.field1093;
					}
				}

				if (var11.field1110 == 0) {
					method103(var11, var9, arg2, var11.field1131, var10, arg5);

					if (var11.field1129 > var11.field1076) {
						method159(arg2, var10, var11, var11.field1129, var11.field1076, true, arg5, var11.field1123 + var9);
					}
				} else {
					if (var11.field1101 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						boolean var12 = false;
						if (var11.field1074 != 0) {
							var12 = method92(var11);
						}

						if (!var12) {
							field124[field137] = var11.field1072;
							field326[field137] = 938;
							field325[field137] = var11.field1093;
							field137++;
						}
					}

					if (var11.field1101 == 2 && field422 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						String var13 = var11.field1135;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field124[field137] = var13 + " @gre@" + var11.field1085;
						field326[field137] = 836;
						field325[field137] = var11.field1093;
						field137++;
					}

					if (var11.field1101 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						field124[field137] = "Close";
						field326[field137] = 148;
						field325[field137] = var11.field1093;
						field137++;
					}

					if (var11.field1101 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						field124[field137] = var11.field1072;
						field326[field137] = 469;
						field325[field137] = var11.field1093;
						field137++;
					}

					if (var11.field1101 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						field124[field137] = var11.field1072;
						field326[field137] = 913;
						field325[field137] = var11.field1093;
						field137++;
					}

					if (var11.field1101 == 6 && !field320 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1123 + var9 && arg2 < var11.field1076 + var10) {
						field124[field137] = var11.field1072;
						field326[field137] = 488;
						field325[field137] = var11.field1093;
						field137++;
					}

					if (var11.field1110 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1076; var15++) {
							for (int var16 = 0; var16 < var11.field1123; var16++) {
								int var17 = (var11.field1125 + 32) * var16 + var9;
								int var18 = (var11.field1118 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1134[var14];
									var18 += var11.field1108[var14];
								}

								if (arg5 >= var17 && arg2 >= var18 && arg5 < var17 + 32 && arg2 < var18 + 32) {
									field369 = var14;
									field370 = var11.field1093;

									if (var11.field1116[var14] > 0) {
										CBASPZKU var19 = CBASPZKU.method13(var11.field1116[var14] - 1);
										if (field132 == 1 && var11.field1115) {
											if (field134 != var11.field1093 || field133 != var14) {
												field124[field137] = "Use " + field136 + " with @lre@" + var19.field37;
												field326[field137] = 543;
												field327[field137] = var19.field43;
												field324[field137] = var14;
												field325[field137] = var11.field1093;
												field137++;
											}
										} else if (field422 != 1 || !var11.field1115) {
											if (var11.field1115) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field61 != null && var19.field61[var20] != null) {
														field124[field137] = var19.field61[var20] + " @lre@" + var19.field37;

														if (var20 == 3) {
															field326[field137] = 803;
														}

														if (var20 == 4) {
															field326[field137] = 664;
														}

														field327[field137] = var19.field43;
														field324[field137] = var14;
														field325[field137] = var11.field1093;
														field137++;
													} else if (var20 == 4) {
														field124[field137] = "Drop @lre@" + var19.field37;
														field326[field137] = 664;
														field327[field137] = var19.field43;
														field324[field137] = var14;
														field325[field137] = var11.field1093;
														field137++;
													}
												}
											}

											if (var11.field1095) {
												field124[field137] = "Use @lre@" + var19.field37;
												field326[field137] = 157;
												field327[field137] = var19.field43;
												field324[field137] = var14;
												field325[field137] = var11.field1093;
												field137++;
											}

											if (var11.field1115 && var19.field61 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field61[var21] != null) {
														field124[field137] = var19.field61[var21] + " @lre@" + var19.field37;

														if (var21 == 0) {
															field326[field137] = 758;
														}

														if (var21 == 1) {
															field326[field137] = 344;
														}

														if (var21 == 2) {
															field326[field137] = 63;
														}

														field327[field137] = var19.field43;
														field324[field137] = var14;
														field325[field137] = var11.field1093;
														field137++;
													}
												}
											}

											if (var11.field1081 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1081[var22] != null) {
														field124[field137] = var11.field1081[var22] + " @lre@" + var19.field37;

														if (var22 == 0) {
															field326[field137] = 616;
														}

														if (var22 == 1) {
															field326[field137] = 245;
														}

														if (var22 == 2) {
															field326[field137] = 823;
														}

														if (var22 == 3) {
															field326[field137] = 962;
														}

														if (var22 == 4) {
															field326[field137] = 598;
														}

														field327[field137] = var19.field43;
														field324[field137] = var14;
														field325[field137] = var11.field1093;
														field137++;
													}
												}
											}

											field124[field137] = "Examine @lre@" + var19.field37;
											field326[field137] = 1339;
											field327[field137] = var19.field43;
											field324[field137] = var14;
											field325[field137] = var11.field1093;
											field137++;
										} else if ((field424 & 0x10) == 0x10) {
											field124[field137] = field425 + " @lre@" + var19.field37;
											field326[field137] = 65;
											field327[field137] = var19.field43;
											field324[field137] = var14;
											field325[field137] = var11.field1093;
											field137++;
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

	@ObfuscatedName("client.e(ZI)V")
	public final void method104(int arg0) {
		int[] var2 = field318.field1148;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field461[arg0][var7][var5] & 0x18) == 0) {
					field217.method441(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field461[arg0 + 1][var7][var5] & 0x8) != 0) {
					field217.method441(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field318.method493();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field461[arg0][var11][var10] & 0x18) == 0) {
					method99(arg0, var8, var11, var10, var9);
				}

				if (arg0 < 3 && (field461[arg0 + 1][var11][var10] & 0x8) != 0) {
					method99(arg0 + 1, var8, var11, var10, var9);
				}
			}
		}

		field144.method172();
		field328 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field217.method435(field379, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = ZXOFSHYE.method588(var14).field1469;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field212[field379].field795;
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

						field70[field328] = field368[var15];
						field329[field328] = var16;
						field330[field328] = var17;
						field328++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method105() {
		try {
			field377 = -1;
			field167.method380();
			field100.method380();
			QSZFQZON.method388();
			method116();
			field217.method406();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field212[var1].method301();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field461[var2][var3][var4] = 0;
					}
				}
			}

			MPWDIIUH var5 = new MPWDIIUH(field387, 104, 104, field461);
			int var6 = field259.length;
			field280.method314(65);

			if (!field376) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field398[var7] >> 8) * 64 - field444;
					int var9 = (field398[var7] & 0xFF) * 64 - field445;
					byte[] var10 = field259[var7];
					if (var10 != null) {
						var5.method282(var9, (field279 - 6) * 8, field212, var10, (field278 - 6) * 8, var8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field398[var11] >> 8) * 64 - field444;
					int var13 = (field398[var11] & 0xFF) * 64 - field445;
					byte[] var14 = field259[var11];
					if (var14 == null && field279 < 800) {
						var5.method297(64, 64, var12, var13);
					}
				}

				field382++;
				if (field382 > 83) {
					field382 = 0;
					field280.method314(231);
				}

				field280.method314(65);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field140[var15];
					if (var16 != null) {
						int var17 = (field398[var15] >> 8) * 64 - field444;
						int var18 = (field398[var15] & 0xFF) * 64 - field445;
						var5.method296(var16, var18, var17, field212, field217);
					}
				}
			}

			if (field376) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field211[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field398.length; var28++) {
									if (field398[var28] == var27 && field259[var28] != null) {
										var5.method291(var19, field259[var28], var21 * 8, var23, (var26 & 0x7) * 8, var20 * 8, (var25 & 0x7) * 8, var24, field212);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field211[0][var29][var30];
						if (var31 == -1) {
							var5.method297(8, 8, var29 * 8, var30 * 8);
						}
					}
				}

				field280.method314(65);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field211[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field398.length; var41++) {
									if (field398[var41] == var40 && field140[var41] != null) {
										var5.method293(field140[var41], (var39 & 0x7) * 8, var37, var34 * 8, var36, field217, (var38 & 0x7) * 8, var32, var33 * 8, field212);
										break;
									}
								}
							}
						}
					}
				}
			}

			field280.method314(65);
			var5.method300(field212, field217);
			field144.method172();
			field280.method314(65);
			int var42 = MPWDIIUH.field783;
			if (var42 > field379) {
				var42 = field379;
			}

			if (var42 < field379 - 1) {
				int var43 = field379 - 1;
			}

			if (field340) {
				field217.method407(MPWDIIUH.field783);
			} else {
				field217.method407(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method94(var44, var45);
				}
			}

			method74();
		} catch (Exception var58) {
		}

		ZXOFSHYE.field1455.method223();

		if (field1423 != null) {
			field280.method314(221);
			field280.method319(1057001181);
		}

		if (field340 && signlink.cache_dat != null) {
			int var47 = field298.method535(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field298.method540(var48);
				if ((var49 & 0x79) == 0) {
					YYHPBDED.method550(var48);
				}
			}
		}

		System.gc();
		QSZFQZON.method389(20);
		field298.method537();
		int var50 = (field278 - 6) / 8 - 1;
		int var51 = (field278 + 6) / 8 + 1;
		int var52 = (field279 - 6) / 8 - 1;
		int var53 = (field279 + 6) / 8 + 1;
		if (field341) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field298.method531(var54, 0, var55);
					if (var56 != -1) {
						field298.method524(var56, 3);
					}

					int var57 = field298.method531(var54, 1, var55);
					if (var57 != -1) {
						field298.method524(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method106(long arg0) {
		if (arg0 != 0L) {
			if (field295 >= 100 && field391 != 1) {
				method25("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field295 >= 200) {
				method25("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = PMUEFTAP.method371(PMUEFTAP.method368(arg0));
				for (int var4 = 0; var4 < field295; var4++) {
					if (field430[var4] == arg0) {
						method25("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field94; var5++) {
					if (field154[var5] == arg0) {
						method25("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field130.field737)) {
					field378[field295] = var3;
					field430[field295] = arg0;
					field385[field295] = 0;
					field295++;
					field390 = true;
					field280.method314(227);
					field280.method321(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method107() {
		for (int var1 = 0; var1 < field121; var1++) {
			int var2 = field122[var1];
			OQGXHJNH var3 = field120[var2];
			if (var3 != null) {
				method108(var3.field815.field526, var3);
			}
		}
	}

	@ObfuscatedName("client.a(BILSXZSKNOI;)V")
	public final void method108(int arg0, SXZSKNOI arg1) {
		if (arg1.field1019 < 128 || arg1.field1020 < 128 || arg1.field1019 >= 13184 || arg1.field1020 >= 13184) {
			arg1.field1047 = -1;
			arg1.field1013 = -1;
			arg1.field1031 = 0;
			arg1.field1032 = 0;
			arg1.field1019 = arg1.field1041[0] * 128 + arg1.field1055 * 64;
			arg1.field1020 = arg1.field1042[0] * 128 + arg1.field1055 * 64;
			arg1.method478();
		}

		if (field130 == arg1 && (arg1.field1019 < 1536 || arg1.field1020 < 1536 || arg1.field1019 >= 11776 || arg1.field1020 >= 11776)) {
			arg1.field1047 = -1;
			arg1.field1013 = -1;
			arg1.field1031 = 0;
			arg1.field1032 = 0;
			arg1.field1019 = arg1.field1041[0] * 128 + arg1.field1055 * 64;
			arg1.field1020 = arg1.field1042[0] * 128 + arg1.field1055 * 64;
			arg1.method478();
		}

		if (arg1.field1031 > field336) {
			method109(arg1);
		} else if (arg1.field1032 >= field336) {
			method110(arg1);
		} else {
			method111(arg1);
		}

		method112(arg1);
		method113(arg1);
	}

	@ObfuscatedName("client.a(ILSXZSKNOI;)V")
	public final void method109(SXZSKNOI arg0) {
		int var2 = arg0.field1031 - field336;
		int var3 = arg0.field1055 * 64 + arg0.field1027 * 128;
		int var4 = arg0.field1055 * 64 + arg0.field1029 * 128;
		arg0.field1019 += (var3 - arg0.field1019) / var2;
		arg0.field1020 += (var4 - arg0.field1020) / var2;
		arg0.field1062 = 0;

		if (arg0.field1033 == 0) {
			arg0.field1012 = 1024;
		}

		if (arg0.field1033 == 1) {
			arg0.field1012 = 1536;
		}

		if (arg0.field1033 == 2) {
			arg0.field1012 = 0;
		}

		if (arg0.field1033 == 3) {
			arg0.field1012 = 512;
		}
	}

	@ObfuscatedName("client.a(LSXZSKNOI;I)V")
	public final void method110(SXZSKNOI arg0) {
		if (field336 == arg0.field1032 || arg0.field1047 == -1 || arg0.field1050 != 0 || arg0.field1049 + 1 > JFYFSKVR.field659[arg0.field1047].method251(arg0.field1048)) {
			int var2 = arg0.field1032 - arg0.field1031;
			int var3 = field336 - arg0.field1031;
			int var4 = arg0.field1055 * 64 + arg0.field1027 * 128;
			int var5 = arg0.field1055 * 64 + arg0.field1029 * 128;
			int var6 = arg0.field1055 * 64 + arg0.field1028 * 128;
			int var7 = arg0.field1055 * 64 + arg0.field1030 * 128;
			arg0.field1019 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1020 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1062 = 0;

		if (arg0.field1033 == 0) {
			arg0.field1012 = 1024;
		}

		if (arg0.field1033 == 1) {
			arg0.field1012 = 1536;
		}

		if (arg0.field1033 == 2) {
			arg0.field1012 = 0;
		}

		if (arg0.field1033 == 3) {
			arg0.field1012 = 512;
		}

		arg0.field1021 = arg0.field1012;
	}

	@ObfuscatedName("client.a(BLSXZSKNOI;)V")
	public final void method111(SXZSKNOI arg0) {
		arg0.field1058 = arg0.field1052;
		if (arg0.field1054 == 0) {
			arg0.field1062 = 0;
		} else {
			if (arg0.field1047 != -1 && arg0.field1050 == 0) {
				JFYFSKVR var2 = JFYFSKVR.field659[arg0.field1047];
				if (arg0.field1044 > 0 && var2.field671 == 0) {
					arg0.field1062++;
					return;
				}

				if (arg0.field1044 <= 0 && var2.field672 == 0) {
					arg0.field1062++;
					return;
				}
			}

			int var3 = arg0.field1019;
			int var4 = arg0.field1020;
			int var5 = arg0.field1041[arg0.field1054 - 1] * 128 + arg0.field1055 * 64;
			int var6 = arg0.field1042[arg0.field1054 - 1] * 128 + arg0.field1055 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1012 = 1280;
					} else if (var4 > var6) {
						arg0.field1012 = 1792;
					} else {
						arg0.field1012 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1012 = 768;
					} else if (var4 > var6) {
						arg0.field1012 = 256;
					} else {
						arg0.field1012 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1012 = 1024;
				} else {
					arg0.field1012 = 0;
				}

				int var7 = arg0.field1012 - arg0.field1021 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1037;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1036;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1039;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1038;
				}

				if (var8 == -1) {
					var8 = arg0.field1036;
				}

				arg0.field1058 = var8;
				int var9 = 4;
				if (arg0.field1021 != arg0.field1012 && arg0.field1026 == -1 && arg0.field1018 != 0) {
					var9 = 2;
				}

				if (arg0.field1054 > 2) {
					var9 = 6;
				}

				if (arg0.field1054 > 3) {
					var9 = 8;
				}

				if (arg0.field1062 > 0 && arg0.field1054 > 1) {
					var9 = 8;
					arg0.field1062--;
				}

				if (arg0.field1057[arg0.field1054 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1058 == arg0.field1036 && arg0.field1040 != -1) {
					arg0.field1058 = arg0.field1040;
				}

				if (var3 < var5) {
					arg0.field1019 += var9;
					if (arg0.field1019 > var5) {
						arg0.field1019 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1019 -= var9;
					if (arg0.field1019 < var5) {
						arg0.field1019 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1020 += var9;
					if (arg0.field1020 > var6) {
						arg0.field1020 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1020 -= var9;
					if (arg0.field1020 < var6) {
						arg0.field1020 = var6;
					}
				}

				if (arg0.field1019 == var5 && arg0.field1020 == var6) {
					arg0.field1054--;

					if (arg0.field1044 > 0) {
						arg0.field1044--;
						return;
					}
				}
			} else {
				arg0.field1019 = var5;
				arg0.field1020 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ILSXZSKNOI;)V")
	public final void method112(SXZSKNOI arg0) {
		if (arg0.field1018 != 0) {
			if (arg0.field1026 != -1 && arg0.field1026 < 32768) {
				OQGXHJNH var2 = field120[arg0.field1026];
				if (var2 != null) {
					int var3 = arg0.field1019 - var2.field1019;
					int var4 = arg0.field1020 - var2.field1020;
					if (var3 != 0 || var4 != 0) {
						arg0.field1012 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1026 >= 32768) {
				int var5 = arg0.field1026 - 32768;
				if (field465 == var5) {
					var5 = field405;
				}

				KWSXZIVG var6 = field406[var5];
				if (var6 != null) {
					int var7 = arg0.field1019 - var6.field1019;
					int var8 = arg0.field1020 - var6.field1020;
					if (var7 != 0 || var8 != 0) {
						arg0.field1012 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1045 != 0 || arg0.field1046 != 0) && (arg0.field1054 == 0 || arg0.field1062 > 0)) {
				int var9 = arg0.field1019 - (arg0.field1045 - field444 - field444) * 64;
				int var10 = arg0.field1020 - (arg0.field1046 - field445 - field445) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1012 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1045 = 0;
				arg0.field1046 = 0;
			}

			int var11 = arg0.field1012 - arg0.field1021 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1018 || var11 > 2048 - arg0.field1018) {
					arg0.field1021 = arg0.field1012;
				} else if (var11 > 1024) {
					arg0.field1021 -= arg0.field1018;
				} else {
					arg0.field1021 += arg0.field1018;
				}

				arg0.field1021 &= 0x7FF;
				if (arg0.field1058 == arg0.field1052 && arg0.field1021 != arg0.field1012) {
					if (arg0.field1053 != -1) {
						arg0.field1058 = arg0.field1053;
						return;
					}

					arg0.field1058 = arg0.field1036;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LSXZSKNOI;B)V")
	public final void method113(SXZSKNOI arg0) {
		arg0.field1043 = false;

		if (arg0.field1058 != -1) {
			JFYFSKVR var2 = JFYFSKVR.field659[arg0.field1058];
			arg0.field1060++;
			if (arg0.field1059 < var2.field660 && arg0.field1060 > var2.method251(arg0.field1059)) {
				arg0.field1060 = 0;
				arg0.field1059++;
			}

			if (arg0.field1059 >= var2.field660) {
				arg0.field1060 = 0;
				arg0.field1059 = 0;
			}
		}

		if (arg0.field1013 != -1 && field336 >= arg0.field1016) {
			if (arg0.field1014 < 0) {
				arg0.field1014 = 0;
			}

			JFYFSKVR var3 = OQOGSGFM.field817[arg0.field1013].field821;
			arg0.field1015++;
			while (arg0.field1014 < var3.field660 && arg0.field1015 > var3.method251(arg0.field1014)) {
				arg0.field1015 -= var3.method251(arg0.field1014);
				arg0.field1014++;
			}

			if (arg0.field1014 >= var3.field660 && (arg0.field1014 < 0 || arg0.field1014 >= var3.field660)) {
				arg0.field1013 = -1;
			}
		}

		if (arg0.field1047 != -1 && arg0.field1050 <= 1) {
			JFYFSKVR var4 = JFYFSKVR.field659[arg0.field1047];
			if (var4.field671 == 1 && arg0.field1044 > 0 && arg0.field1031 <= field336 && arg0.field1032 < field336) {
				arg0.field1050 = 1;
				return;
			}
		}

		if (arg0.field1047 != -1 && arg0.field1050 == 0) {
			JFYFSKVR var5 = JFYFSKVR.field659[arg0.field1047];
			arg0.field1049++;
			while (arg0.field1048 < var5.field660 && arg0.field1049 > var5.method251(arg0.field1048)) {
				arg0.field1049 -= var5.method251(arg0.field1048);
				arg0.field1048++;
			}

			if (arg0.field1048 >= var5.field660) {
				arg0.field1048 -= var5.field664;
				arg0.field1051++;
				if (arg0.field1051 >= var5.field670) {
					arg0.field1047 = -1;
				}

				if (arg0.field1048 < 0 || arg0.field1048 >= var5.field660) {
					arg0.field1047 = -1;
				}
			}

			arg0.field1043 = var5.field666;
		}

		if (arg0.field1050 > 0) {
			arg0.field1050--;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method114() {
		if (field245) {
			field245 = false;
			field281.method173(field1420, 0, 4);
			field282.method173(field1420, 0, 357);
			field283.method173(field1420, 722, 4);
			field284.method173(field1420, 743, 205);
			field285.method173(field1420, 0, 0);
			field286.method173(field1420, 516, 4);
			field287.method173(field1420, 516, 205);
			field288.method173(field1420, 496, 357);
			field289.method173(field1420, 0, 338);
			field390 = true;
			field359 = true;
			field108 = true;
			field111 = true;

			if (field443 != 2) {
				field144.method173(field1420, 4, 4);
				field143.method173(field1420, 550, 4);
			}
		}

		if (field443 == 2) {
			method139();
		}

		if (field64 && field232 == 1) {
			field390 = true;
		}

		if (field482 != -1) {
			boolean var1 = method61(field403, field482);
			if (var1) {
				field390 = true;
			}
		}

		if (field352 == 2) {
			field390 = true;
		}

		if (field178 == 2) {
			field390 = true;
		}

		if (field390) {
			method77();
			field390 = false;
		}

		field222++;
		if (field222 > 1564) {
			field222 = 0;
			field280.method314(56);
			field280.method315(0);
			int var2 = field280.field797;

			if ((int) (Math.random() * 2.0D) == 0) {
				field280.method316(64019);
			}

			field280.method316(12441);
			field280.method315((int) (Math.random() * 256.0D));
			field280.method316((int) (Math.random() * 65536.0D));
			field280.method315((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field280.method316(63947);
			}

			field280.method316(43979);
			field280.method316(32368);
			field280.method316((int) (Math.random() * 65536.0D));
			field280.method315((int) (Math.random() * 256.0D));
			field280.method324(field280.field797 - var2);
		}

		if (field271 == -1) {
			field214.field1131 = field307 - field237 - 77;

			if (field1428 > 448 && field1428 < 560 && field1429 > 332) {
				method159(field1429 - 357, 0, field214, field307, 77, false, field1428 - 17, 463);
			}

			int var3 = field307 - field214.field1131 - 77;
			if (var3 < 0) {
				var3 = 0;
			}

			if (var3 > field307 - 77) {
				var3 = field307 - 77;
			}

			if (field237 != var3) {
				field237 = var3;
				field359 = true;
			}
		}

		if (field271 != -1) {
			boolean var4 = method61(field403, field271);
			if (var4) {
				field359 = true;
			}
		}

		if (field352 == 3) {
			field359 = true;
		}

		if (field178 == 3) {
			field359 = true;
		}

		if (field171 != null) {
			field359 = true;
		}

		if (field64 && field232 == 2) {
			field359 = true;
		}

		if (field359) {
			method124();
			field359 = false;
		}

		if (field443 == 2) {
			method86();
			field143.method173(field1420, 550, 4);
		}

		if (field168 != -1) {
			field108 = true;
		}

		if (field108) {
			if (field168 != -1 && field209 == field168) {
				field168 = -1;
				field280.method314(114);
				field280.method315(field209);
			}

			field108 = false;
			field81.method172();
			field421.method246(0, 0);

			if (field482 == -1) {
				if (field227[field209] != -1) {
					if (field209 == 0) {
						field302.method246(22, 10);
					}

					if (field209 == 1) {
						field303.method246(54, 8);
					}

					if (field209 == 2) {
						field303.method246(82, 8);
					}

					if (field209 == 3) {
						field304.method246(110, 8);
					}

					if (field209 == 4) {
						field306.method246(153, 8);
					}

					if (field209 == 5) {
						field306.method246(181, 8);
					}

					if (field209 == 6) {
						field305.method246(209, 9);
					}
				}

				if (field227[0] != -1 && (field168 != 0 || field336 % 20 < 10)) {
					field458[0].method246(29, 13);
				}

				if (field227[1] != -1 && (field168 != 1 || field336 % 20 < 10)) {
					field458[1].method246(53, 11);
				}

				if (field227[2] != -1 && (field168 != 2 || field336 % 20 < 10)) {
					field458[2].method246(82, 11);
				}

				if (field227[3] != -1 && (field168 != 3 || field336 % 20 < 10)) {
					field458[3].method246(115, 12);
				}

				if (field227[4] != -1 && (field168 != 4 || field336 % 20 < 10)) {
					field458[4].method246(153, 13);
				}

				if (field227[5] != -1 && (field168 != 5 || field336 % 20 < 10)) {
					field458[5].method246(180, 11);
				}

				if (field227[6] != -1 && (field168 != 6 || field336 % 20 < 10)) {
					field458[6].method246(208, 13);
				}
			}

			field81.method173(field1420, 516, 160);
			field80.method172();
			field420.method246(0, 0);

			if (field482 == -1) {
				if (field227[field209] != -1) {
					if (field209 == 7) {
						field148.method246(42, 0);
					}

					if (field209 == 8) {
						field149.method246(74, 0);
					}

					if (field209 == 9) {
						field149.method246(102, 0);
					}

					if (field209 == 10) {
						field150.method246(130, 1);
					}

					if (field209 == 11) {
						field152.method246(173, 0);
					}

					if (field209 == 12) {
						field152.method246(201, 0);
					}

					if (field209 == 13) {
						field151.method246(229, 0);
					}
				}

				if (field227[8] != -1 && (field168 != 8 || field336 % 20 < 10)) {
					field458[7].method246(74, 2);
				}

				if (field227[9] != -1 && (field168 != 9 || field336 % 20 < 10)) {
					field458[8].method246(102, 3);
				}

				if (field227[10] != -1 && (field168 != 10 || field336 % 20 < 10)) {
					field458[9].method246(137, 4);
				}

				if (field227[11] != -1 && (field168 != 11 || field336 % 20 < 10)) {
					field458[10].method246(174, 2);
				}

				if (field227[12] != -1 && (field168 != 12 || field336 % 20 < 10)) {
					field458[11].method246(201, 2);
				}

				if (field227[13] != -1 && (field168 != 13 || field336 % 20 < 10)) {
					field458[12].method246(226, 2);
				}
			}

			field80.method173(field1420, 496, 466);
			field144.method172();
		}

		if (field111) {
			field111 = false;
			field79.method172();
			field419.method246(0, 0);
			field267.method459("Public chat", 0xFFFFFF, true, 55, 28);

			if (field456 == 0) {
				field267.method459("On", 0xFF00, true, 55, 41);
			}

			if (field456 == 1) {
				field267.method459("Friends", 0xFFFF00, true, 55, 41);
			}

			if (field456 == 2) {
				field267.method459("Off", 0xFF0000, true, 55, 41);
			}

			if (field456 == 3) {
				field267.method459("Hide", 0xFFFF, true, 55, 41);
			}

			field267.method459("Private chat", 0xFFFFFF, true, 184, 28);

			if (field101 == 0) {
				field267.method459("On", 0xFF00, true, 184, 41);
			}

			if (field101 == 1) {
				field267.method459("Friends", 0xFFFF00, true, 184, 41);
			}

			if (field101 == 2) {
				field267.method459("Off", 0xFF0000, true, 184, 41);
			}

			field267.method459("Trade/compete", 0xFFFFFF, true, 324, 28);

			if (field309 == 0) {
				field267.method459("On", 0xFF00, true, 324, 41);
			}

			if (field309 == 1) {
				field267.method459("Friends", 0xFFFF00, true, 324, 41);
			}

			if (field309 == 2) {
				field267.method459("Off", 0xFF0000, true, 324, 41);
			}

			field267.method459("Report abuse", 0xFFFFFF, true, 458, 33);
			field79.method173(field1420, 0, 453);
			field144.method172();
		}

		field403 = 0;
	}

	@ObfuscatedName("client.A(I)Ljava/lang/String;")
	public final String method115() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1423 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method116() {
		ZXOFSHYE.field1455.method223();
		ZXOFSHYE.field1462.method223();
		COIHKGSL.field511.method223();
		CBASPZKU.field54.method223();
		CBASPZKU.field40.method223();
		KWSXZIVG.field741.method223();
		OQOGSGFM.field829.method223();
	}

	@ObfuscatedName("client.a(ILMQZHAILV;I)V")
	public final void method117(MQZHAILV arg0, int arg1) {
		arg0.method335();
		int var3 = arg0.method336(1);
		if (var3 != 0) {
			int var4 = arg0.method336(2);
			if (var4 == 0) {
				field410[field409++] = field405;
			} else if (var4 == 1) {
				int var5 = arg0.method336(3);
				field130.method479(false, var5);
				int var6 = arg0.method336(1);
				if (var6 == 1) {
					field410[field409++] = field405;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method336(3);
				field130.method479(true, var7);
				int var8 = arg0.method336(3);
				field130.method479(true, var8);
				int var9 = arg0.method336(1);
				if (var9 == 1) {
					field410[field409++] = field405;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method336(7);
				int var11 = arg0.method336(7);
				field379 = arg0.method336(2);
				int var12 = arg0.method336(1);
				if (var12 == 1) {
					field410[field409++] = field405;
				}

				int var13 = arg0.method336(1);
				field130.method480(var10, var11, var13 == 1);
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method118() {
		try {
			int var1 = field130.field1019 + field415;
			int var2 = field130.field1020 + field255;
			if (field473 - var1 < -500 || field473 - var1 > 500 || field474 - var2 < -500 || field474 - var2 > 500) {
				field473 = var1;
				field474 = var2;
			}

			if (field473 != var1) {
				field473 += (var1 - field473) / 16;
			}

			if (field474 != var2) {
				field474 += (var2 - field474) / 16;
			}

			if (field1438[1] == 1) {
				field347 += (-field347 - 24) / 2;
			} else if (field1438[2] == 1) {
				field347 += (24 - field347) / 2;
			} else {
				field347 /= 2;
			}

			if (field1438[3] == 1) {
				field348 += (12 - field348) / 2;
			} else if (field1438[4] == 1) {
				field348 += (-field348 - 12) / 2;
			} else {
				field348 /= 2;
			}

			field346 = field347 / 2 + field346 & 0x7FF;
			field345 += field348 / 2;
			if (field345 < 128) {
				field345 = 128;
			}

			if (field345 > 383) {
				field345 = 383;
			}

			int var3 = field473 >> 7;
			int var4 = field474 >> 7;
			int var5 = method24(field473, field474, field379);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field379;
						if (var9 < 3 && (field461[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field387[var9][var7][var8];
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

			if (var11 > field129) {
				field129 += (var11 - field129) / 24;
			} else if (var11 < field129) {
				field129 += (var11 - field129) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field130.field1019 + "," + field130.field1020 + "," + field473 + "," + field474 + "," + field278 + "," + field279 + "," + field444 + "," + field445);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method119(int arg0) {
		if (arg0 >= 0) {
			if (field138 != 0) {
				field138 = 0;
				field359 = true;
			}

			int var2 = field324[arg0];
			int var3 = field325[arg0];
			int var4 = field326[arg0];
			int var5 = field327[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 214) {
				OQGXHJNH var6 = field120[var5];
				if (var6 != null) {
					method22(0, var6.field1042[0], 2, 1, 0, var6.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(44);
					field280.method316(var5);
					field280.method351(field423);
				}
			}

			if (var4 == 337 && method47(var3, var2, var5)) {
				field280.method314(149);
				field280.method351(field444 + var2);
				field280.method350(var5 >> 14 & 0x7FFF);
				field280.method316(field423);
				field280.method316(field445 + var3);
			}

			if (var4 == 115) {
				method47(var3, var2, var5);
				field280.method314(75);
				field280.method349(field444 + var2);
				field280.method351(var5 >> 14 & 0x7FFF);
				field280.method349(field445 + var3);
			}

			if (var4 == 245) {
				field280.method314(228);
				field280.method316(var2);
				field280.method316(var3);
				field280.method316(var5);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 1161) {
				method47(var3, var2, var5);
				field280.method314(136);
				field280.method349(field444 + var2);
				field280.method316(field445 + var3);
				field280.method349(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 488 && !field320) {
				field280.method314(60);
				field280.method316(var3);
				field320 = true;
			}

			if (var4 == 803) {
				field280.method314(39);
				field280.method351(var5);
				field280.method349(var2);
				field280.method351(var3);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 899) {
				method47(var3, var2, var5);
				field280.method314(97);
				field280.method351(field444 + var2);
				field280.method351(var5 >> 14 & 0x7FFF);
				field280.method316(field445 + var3);
			}

			if (var4 == 677) {
				OQGXHJNH var7 = field120[var5];
				if (var7 != null) {
					method22(0, var7.field1042[0], 2, 1, 0, var7.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field388++;
					if (field388 >= 90) {
						field280.method314(11);
						field280.method316(19580);
						field388 = 0;
					}

					field280.method314(139);
					field280.method351(var5);
				}
			}

			if (var4 == 140) {
				String var8 = field124[arg0];
				int var9 = var8.indexOf("@whi@");
				if (var9 != -1) {
					if (field315 == -1) {
						method128();
						field169 = var8.substring(var9 + 5).trim();
						field322 = false;

						for (int var10 = 0; var10 < TDQUELMV.field1070.length; var10++) {
							if (TDQUELMV.field1070[var10] != null && TDQUELMV.field1070[var10].field1074 == 600) {
								field381 = field315 = TDQUELMV.field1070[var10].field1083;
								break;
							}
						}
					} else {
						method25("", 0, "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 672) {
				if (field64) {
					field217.method444(var2 - 4, var3 - 4);
				} else {
					field217.method444(field1435 - 4, field1436 - 4);
				}
			}

			if (var4 == 755) {
				KWSXZIVG var11 = field406[var5];
				if (var11 != null) {
					method22(0, var11.field1042[0], 2, 1, 0, var11.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(22);
					field280.method316(var5);
				}
			}

			if (var4 == 148) {
				method128();
			}

			if (var4 == 50) {
				boolean var12 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
				if (!var12) {
					method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
				}

				field392 = field1435;
				field393 = field1436;
				field395 = 2;
				field394 = 0;
				field280.method314(14);
				field280.method349(field445 + var3);
				field280.method316(var5);
				field280.method349(field444 + var2);
			}

			if (var4 == 469) {
				field280.method314(249);
				field280.method316(var3);
				TDQUELMV var14 = TDQUELMV.field1070[var3];
				if (var14.field1073 != null && var14.field1073[0][0] == 5) {
					int var15 = var14.field1073[0][1];
					field208[var15] = 1 - field208[var15];
					method39(var15);
					field390 = true;
				}
			}

			if (var4 == 510) {
				KWSXZIVG var16 = field406[var5];
				if (var16 != null) {
					method22(0, var16.field1042[0], 2, 1, 0, var16.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(175);
					field280.method316(var5);
				}
			}

			if (var4 == 704) {
				String var17 = field124[arg0];
				int var18 = var17.indexOf("@whi@");
				if (var18 != -1) {
					long var19 = PMUEFTAP.method367(var17.substring(var18 + 5).trim());
					int var21 = -1;
					for (int var22 = 0; var22 < field295; var22++) {
						if (field430[var22] == var19) {
							var21 = var22;
							break;
						}
					}

					if (var21 != -1 && field385[var21] > 0) {
						field359 = true;
						field138 = 0;
						field229 = true;
						field73 = "";
						field69 = 3;
						field311 = field430[var21];
						field107 = "Enter message to send to " + field378[var21];
					}
				}
			}

			if (var4 == 539 || var4 == 633 || var4 == 361 || var4 == 128) {
				String var23 = field124[arg0];
				int var24 = var23.indexOf("@whi@");
				if (var24 != -1) {
					long var25 = PMUEFTAP.method367(var23.substring(var24 + 5).trim());
					if (var4 == 539) {
						method106(var25);
					}

					if (var4 == 633) {
						method129(var25);
					}

					if (var4 == 361) {
						method84(var25);
					}

					if (var4 == 128) {
						method150(var25);
					}
				}
			}

			if (var4 == 957) {
				KWSXZIVG var27 = field406[var5];
				if (var27 != null) {
					method22(0, var27.field1042[0], 2, 1, 0, var27.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(213);
					field280.method350(field133);
					field280.method351(field135);
					field280.method349(field134);
					field280.method316(var5);
				}
			}

			if (var4 == 1520) {
				OQGXHJNH var28 = field120[var5];
				if (var28 != null) {
					COIHKGSL var29 = var28.field815;
					if (var29.field518 != null) {
						var29 = var29.method167();
					}

					if (var29 != null) {
						String var30;
						if (var29.field504 == null) {
							var30 = "It's a " + var29.field523 + ".";
						} else {
							var30 = new String(var29.field504);
						}

						method25("", 0, var30);
					}
				}
			}

			if (var4 == 962) {
				field280.method314(140);
				field280.method350(var5);
				field280.method316(var3);
				field280.method316(var2);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 782) {
				boolean var31 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
				if (!var31) {
					method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
				}

				field392 = field1435;
				field393 = field1436;
				field395 = 2;
				field394 = 0;
				field280.method314(43);
				field280.method349(field445 + var3);
				field280.method351(field444 + var2);
				field280.method349(field135);
				field280.method350(field134);
				field280.method316(var5);
				field280.method316(field133);
			}

			if (var4 == 1566) {
				CBASPZKU var33 = CBASPZKU.method13(var5);
				String var34;
				if (var33.field27 == null) {
					var34 = "It's a " + var33.field37 + ".";
				} else {
					var34 = new String(var33.field27);
				}

				method25("", 0, var34);
			}

			if (var4 == 60) {
				boolean var35 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
				if (!var35) {
					method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
				}

				field392 = field1435;
				field393 = field1436;
				field395 = 2;
				field394 = 0;
				field280.method314(134);
				field280.method351(field445 + var3);
				field280.method316(var5);
				field280.method316(field444 + var2);
			}

			if (var4 == 475) {
				OQGXHJNH var37 = field120[var5];
				if (var37 != null) {
					method22(0, var37.field1042[0], 2, 1, 0, var37.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;

					if ((var5 & 0x3) == 0) {
						field362++;
					}

					if (field362 >= 128) {
						field280.method314(174);
						field280.method316(18260);
						field362 = 0;
					}

					field280.method314(238);
					field280.method351(var5);
				}
			}

			if (var4 == 527) {
				KWSXZIVG var38 = field406[var5];
				if (var38 != null) {
					method22(0, var38.field1042[0], 2, 1, 0, var38.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(98);
					field280.method316(var5);
				}
			}

			if (var4 == 543) {
				field280.method314(199);
				field280.method316(field133);
				field280.method349(field134);
				field280.method316(var5);
				field280.method316(field135);
				field280.method350(var2);
				field280.method350(var3);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 461) {
				boolean var39 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
				if (!var39) {
					method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
				}

				field392 = field1435;
				field393 = field1436;
				field395 = 2;
				field394 = 0;
				field280.method314(254);
				field280.method351(field423);
				field280.method351(field444 + var2);
				field280.method349(var5);
				field280.method350(field445 + var3);
			}

			if (var4 == 938) {
				TDQUELMV var41 = TDQUELMV.field1070[var3];
				boolean var42 = true;
				if (var41.field1074 > 0) {
					var42 = method64(var41);
				}

				if (var42) {
					field280.method314(249);
					field280.method316(var3);
				}
			}

			if (var4 == 381) {
				OQGXHJNH var43 = field120[var5];
				if (var43 != null) {
					method22(0, var43.field1042[0], 2, 1, 0, var43.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;

					if ((var5 & 0x3) == 0) {
						field204++;
					}

					if (field204 >= 91) {
						field280.method314(24);
						field280.method315(48);
						field204 = 0;
					}

					field280.method314(173);
					field280.method351(var5);
				}
			}

			if (var4 == 65) {
				field280.method314(67);
				field280.method350(var2);
				field280.method350(var5);
				field280.method349(var3);
				field280.method351(field423);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 913) {
				field280.method314(249);
				field280.method316(var3);
				TDQUELMV var44 = TDQUELMV.field1070[var3];
				if (var44.field1073 != null && var44.field1073[0][0] == 5) {
					int var45 = var44.field1073[0][1];
					if (field208[var45] != var44.field1109[0]) {
						field208[var45] = var44.field1109[0];
						method39(var45);
						field390 = true;
					}
				}
			}

			if (var4 == 616) {
				field280.method314(240);
				field280.method351(var3);
				field280.method351(var5);
				field280.method350(var2);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 88) {
				KWSXZIVG var46 = field406[var5];
				if (var46 != null) {
					method22(0, var46.field1042[0], 2, 1, 0, var46.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(5);
					field280.method316(var5);
					field280.method351(field423);
				}
			}

			if (var4 == 205) {
				OQGXHJNH var47 = field120[var5];
				if (var47 != null) {
					method22(0, var47.field1042[0], 2, 1, 0, var47.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(45);
					field280.method316(var5);
				}
			}

			if (var4 == 664) {
				field280.method314(94);
				field280.method316(var3);
				field280.method349(var5);
				field280.method316(var2);
				field349 = 0;
				field350 = var3;
				field351 = var2;
				field352 = 2;
				if (TDQUELMV.field1070[var3].field1083 == field315) {
					field352 = 1;
				}

				if (TDQUELMV.field1070[var3].field1083 == field271) {
					field352 = 3;
				}
			}

			if (var4 == 836) {
				TDQUELMV var48 = TDQUELMV.field1070[var3];
				field422 = 1;
				field423 = var3;
				field424 = var48.field1092;
				field132 = 0;
				field390 = true;
				String var49 = var48.field1135;
				if (var49.indexOf(" ") != -1) {
					var49 = var49.substring(0, var49.indexOf(" "));
				}

				String var50 = var48.field1135;
				if (var50.indexOf(" ") != -1) {
					var50 = var50.substring(var50.indexOf(" ") + 1);
				}

				field425 = var49 + " " + var48.field1085 + " " + var50;

				if (field424 == 16) {
					field390 = true;
					field209 = 3;
					field108 = true;
				}
			} else {
				if (var4 == 32) {
					KWSXZIVG var51 = field406[var5];
					if (var51 != null) {
						method22(0, var51.field1042[0], 2, 1, 0, var51.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
						field392 = field1435;
						field393 = field1436;
						field395 = 2;
						field394 = 0;
						field280.method314(30);
						field280.method350(var5);
					}
				}

				if (var4 == 814) {
					boolean var52 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
					if (!var52) {
						method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
					}

					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(27);
					field280.method349(field445 + var3);
					field280.method349(var5);
					field280.method316(field444 + var2);
				}

				if (var4 == 415) {
					boolean var54 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
					if (!var54) {
						method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
					}

					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field280.method314(234);
					field280.method316(field444 + var2);
					field280.method350(var5);
					field280.method316(field445 + var3);
				}

				if (var4 == 344) {
					if ((var2 & 0x3) == 0) {
						field231++;
					}

					if (field231 >= 113) {
						field280.method314(218);
						field280.method319(0);
						field231 = 0;
					}

					field280.method314(162);
					field280.method316(var5);
					field280.method350(var3);
					field280.method316(var2);
					field349 = 0;
					field350 = var3;
					field351 = var2;
					field352 = 2;
					if (TDQUELMV.field1070[var3].field1083 == field315) {
						field352 = 1;
					}

					if (TDQUELMV.field1070[var3].field1083 == field271) {
						field352 = 3;
					}
				}

				if (var4 == 531) {
					KWSXZIVG var56 = field406[var5];
					if (var56 != null) {
						method22(0, var56.field1042[0], 2, 1, 0, var56.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
						field392 = field1435;
						field393 = field1436;
						field395 = 2;
						field394 = 0;
						field280.method314(53);
						field280.method351(var5);
					}
				}

				if (var4 == 823) {
					field280.method314(184);
					field280.method350(var5);
					field280.method349(var2);
					field280.method349(var3);
					field349 = 0;
					field350 = var3;
					field351 = var2;
					field352 = 2;
					if (TDQUELMV.field1070[var3].field1083 == field315) {
						field352 = 1;
					}

					if (TDQUELMV.field1070[var3].field1083 == field271) {
						field352 = 3;
					}
				}

				if (var4 == 413) {
					method47(var3, var2, var5);
					field280.method314(101);
					field280.method350(var5 >> 14 & 0x7FFF);
					field280.method351(field445 + var3);
					field280.method316(field444 + var2);
				}

				if (var4 == 516) {
					boolean var57 = method22(0, var3, 2, 0, 0, var2, field130.field1041[0], 0, 0, false, field130.field1042[0]);
					if (!var57) {
						method22(0, var3, 2, 1, 0, var2, field130.field1041[0], 0, 1, false, field130.field1042[0]);
					}

					field392 = field1435;
					field393 = field1436;
					field395 = 2;
					field394 = 0;
					field401++;
					if (field401 >= 101) {
						field280.method314(85);
						field280.method315(68);
						field401 = 0;
					}

					field280.method314(241);
					field280.method350(field445 + var3);
					field280.method351(field444 + var2);
					field280.method349(var5);
				}

				if (var4 == 276) {
					field141 += var3;
					if (field141 >= 117) {
						field280.method314(151);
						field280.method316(22816);
						field141 = 0;
					}

					method47(var3, var2, var5);
					field280.method314(226);
					field280.method350(field444 + var2);
					field280.method316(field445 + var3);
					field280.method349(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 758) {
					field280.method314(64);
					field280.method316(var2);
					field280.method351(var5);
					field280.method316(var3);
					field349 = 0;
					field350 = var3;
					field351 = var2;
					field352 = 2;
					if (TDQUELMV.field1070[var3].field1083 == field315) {
						field352 = 1;
					}

					if (TDQUELMV.field1070[var3].field1083 == field271) {
						field352 = 3;
					}
				}

				if (var4 == 598) {
					field280.method314(167);
					field280.method351(var2);
					field280.method316(var5);
					field280.method316(var3);
					field349 = 0;
					field350 = var3;
					field351 = var2;
					field352 = 2;
					if (TDQUELMV.field1070[var3].field1083 == field315) {
						field352 = 1;
					}

					if (TDQUELMV.field1070[var3].field1083 == field271) {
						field352 = 3;
					}
				}

				if (var4 == 63) {
					field84++;
					if (field84 >= 121) {
						field280.method314(205);
						field280.method318(0xC93944);
						field84 = 0;
					}

					field280.method314(253);
					field280.method351(var3);
					field280.method316(var2);
					field280.method349(var5);
					field349 = 0;
					field350 = var3;
					field351 = var2;
					field352 = 2;
					if (TDQUELMV.field1070[var3].field1083 == field315) {
						field352 = 1;
					}

					if (TDQUELMV.field1070[var3].field1083 == field271) {
						field352 = 3;
					}
				}

				if (var4 == 1230) {
					int var59 = var5 >> 14 & 0x7FFF;
					ZXOFSHYE var60 = ZXOFSHYE.method588(var59);
					String var61;
					if (var60.field1484 == null) {
						var61 = "It's a " + var60.field1466 + ".";
					} else {
						var61 = new String(var60.field1484);
					}

					method25("", 0, var61);
				}

				if (var4 == 37 && method47(var3, var2, var5)) {
					field280.method314(2);
					field280.method351(field445 + var3);
					field280.method350(field135);
					field280.method351(field134);
					field280.method316(field133);
					field280.method316(var5 >> 14 & 0x7FFF);
					field280.method349(field444 + var2);
				}

				if (var4 == 345) {
					OQGXHJNH var62 = field120[var5];
					if (var62 != null) {
						method22(0, var62.field1042[0], 2, 1, 0, var62.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
						field392 = field1435;
						field393 = field1436;
						field395 = 2;
						field394 = 0;
						field280.method314(87);
						field280.method316(field135);
						field280.method316(var5);
						field280.method351(field134);
						field280.method316(field133);
					}
				}

				if (var4 == 939) {
					OQGXHJNH var63 = field120[var5];
					if (var63 != null) {
						method22(0, var63.field1042[0], 2, 1, 0, var63.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);
						field392 = field1435;
						field393 = field1436;
						field395 = 2;
						field394 = 0;
						field280.method314(76);
						field280.method351(var5);
					}
				}

				if (var4 == 157) {
					field132 = 1;
					field133 = var2;
					field134 = var3;
					field135 = var5;
					field136 = CBASPZKU.method13(var5).field37;
					field422 = 0;
					field390 = true;
				} else {
					if (var4 == 744 || var4 == 862) {
						String var64 = field124[arg0];
						int var65 = var64.indexOf("@whi@");
						if (var65 != -1) {
							var64 = var64.substring(var65 + 5).trim();
							String var66 = PMUEFTAP.method371(PMUEFTAP.method368(PMUEFTAP.method367(var64)));
							boolean var67 = false;
							for (int var68 = 0; var68 < field407; var68++) {
								KWSXZIVG var69 = field406[field408[var68]];
								if (var69 != null && var69.field737 != null && var69.field737.equalsIgnoreCase(var66)) {
									method22(0, var69.field1042[0], 2, 1, 0, var69.field1041[0], field130.field1041[0], 0, 1, false, field130.field1042[0]);

									if (var4 == 744) {
										field280.method314(53);
										field280.method351(field408[var68]);
									}

									if (var4 == 862) {
										field280.method314(98);
										field280.method316(field408[var68]);
									}

									var67 = true;
									break;
								}
							}

							if (!var67) {
								method25("", 0, "Unable to find " + var66);
							}
						}
					}

					if (var4 == 1339) {
						CBASPZKU var70 = CBASPZKU.method13(var5);
						TDQUELMV var71 = TDQUELMV.field1070[var3];
						String var72;
						if (var71 != null && var71.field1084[var2] >= 100000) {
							var72 = var71.field1084[var2] + " x " + var70.field37;
						} else if (var70.field27 == null) {
							var72 = "It's a " + var70.field37 + ".";
						} else {
							var72 = new String(var70.field27);
						}

						method25("", 0, var72);
					}

					field132 = 0;
					field422 = 0;
					field390 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method120() {
		for (int var1 = -1; var1 < field407; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field405;
			} else {
				var2 = field408[var1];
			}

			KWSXZIVG var3 = field406[var2];
			if (var3 != null && var3.field1061 > 0) {
				var3.field1061--;
				if (var3.field1061 == 0) {
					var3.field1034 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field121; var4++) {
			int var5 = field122[var4];
			OQGXHJNH var6 = field120[var5];
			if (var6 != null && var6.field1061 > 0) {
				var6.field1061--;
				if (var6.field1061 == 0) {
					var6.field1034 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method121() {
		while (true) {
			JLWEKARN var1 = field298.method534();
			if (var1 == null) {
				return;
			}

			if (var1.field687 == 0) {
				YYHPBDED.method549(var1.field689, var1.field688);

				if ((field298.method540(var1.field689) & 0x62) != 0) {
					field390 = true;

					if (field271 != -1) {
						field359 = true;
					}
				}
			}

			if (var1.field687 == 1 && var1.field688 != null) {
				VPISXBMB.method510(var1.field688);
			}

			if (var1.field687 == 2 && field104 == var1.field689 && var1.field688 != null) {
				method102(field105, var1.field688);
			}

			if (var1.field687 == 3 && field443 == 1) {
				for (int var2 = 0; var2 < field259.length; var2++) {
					if (field399[var2] == var1.field689) {
						field259[var2] = var1.field688;

						if (var1.field688 == null) {
							field399[var2] = -1;
						}

						break;
					}

					if (field400[var2] == var1.field689) {
						field140[var2] = var1.field688;

						if (var1.field688 == null) {
							field400[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field687 == 93 && field298.method542(var1.field689)) {
				MPWDIIUH.method287(new MQZHAILV(var1.field688), field298);
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method122(int arg0) {
		if (!field340) {
			if (QSZFQZON.field901[17] >= arg0) {
				HQETDHHW var2 = QSZFQZON.field895[17];
				int var3 = var2.field651 * var2.field650 - 1;
				int var4 = field403 * var2.field650 * 2;
				byte[] var5 = var2.field648;
				byte[] var6 = field92;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field648 = var6;
				field92 = var5;
				QSZFQZON.method392(17);
			}

			if (QSZFQZON.field901[24] >= arg0) {
				HQETDHHW var8 = QSZFQZON.field895[24];
				int var9 = var8.field651 * var8.field650 - 1;
				int var10 = field403 * var8.field650 * 2;
				byte[] var11 = var8.field648;
				byte[] var12 = field92;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field648 = var12;
				field92 = var11;
				QSZFQZON.method392(24);
			}

			if (QSZFQZON.field901[34] >= arg0) {
				HQETDHHW var14 = QSZFQZON.field895[34];
				int var15 = var14.field651 * var14.field650 - 1;
				int var16 = field403 * var14.field650 * 2;
				byte[] var17 = var14.field648;
				byte[] var18 = field92;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field648 = var18;
				field92 = var17;
				QSZFQZON.method392(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(LMQZHAILV;ZI)V")
	public final void method123(MQZHAILV arg0, int arg1) {
		int var3 = arg0.method336(8);
		if (var3 < field407) {
			for (int var4 = var3; var4 < field407; var4++) {
				field258[field257++] = field408[var4];
			}
		}

		if (var3 > field407) {
			signlink.reporterror(field331 + " Too many players");
			throw new RuntimeException("eek");
		}

		field407 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field408[var5];
			KWSXZIVG var7 = field406[var6];
			int var8 = arg0.method336(1);
			if (var8 == 0) {
				field408[field407++] = var6;
				var7.field1022 = field336;
			} else {
				int var9 = arg0.method336(2);
				if (var9 == 0) {
					field408[field407++] = var6;
					var7.field1022 = field336;
					field410[field409++] = var6;
				} else if (var9 == 1) {
					field408[field407++] = var6;
					var7.field1022 = field336;
					int var10 = arg0.method336(3);
					var7.method479(false, var10);
					int var11 = arg0.method336(1);
					if (var11 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 2) {
					field408[field407++] = var6;
					var7.field1022 = field336;
					int var12 = arg0.method336(3);
					var7.method479(true, var12);
					int var13 = arg0.method336(3);
					var7.method479(true, var13);
					int var14 = arg0.method336(1);
					if (var14 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 3) {
					field258[field257++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method124() {
		field145.method172();
		QSZFQZON.field893 = field312;
		field99.method246(0, 0);

		if (field229) {
			field268.method458(40, 0, 239, field107);
			field268.method458(60, 128, 239, field73 + "*");
		} else if (field138 == 1) {
			field268.method458(40, 0, 239, "Enter amount:");
			field268.method458(60, 128, 239, field384 + "*");
		} else if (field138 == 2) {
			field268.method458(40, 0, 239, "Enter name:");
			field268.method458(60, 128, 239, field384 + "*");
		} else if (field171 != null) {
			field268.method458(40, 0, 239, field171);
			field268.method458(60, 128, 239, "Click to continue");
		} else if (field271 != -1) {
			method137(0, 0, TDQUELMV.field1070[field271], 0);
		} else if (field380 == -1) {
			RGWSJTPO var1 = field267;
			int var2 = 0;
			JJCVVTJN.method255(77, 0, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field264[var3] != null) {
					int var4 = field262[var3];
					int var5 = field237 + 70 - var2 * 14;
					String var6 = field263[var3];
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
							var1.method462(0, field264[var3], var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field456 == 0 || field456 == 1 && method43(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field225[0].method246(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field225[1].method246(var8, var5 - 12);
								var8 += 14;
							}

							var1.method462(0, var6 + ":", var5, var8);
							var8 += var1.method460(var6) + 8;
							var1.method462(255, field264[var3], var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field417 == 0 && (var4 == 7 || field101 == 0 || field101 == 1 && method43(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method462(0, "From", var5, var9);
							int var11 = var9 + var1.method460("From ");
							if (var7 == 1) {
								field225[0].method246(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field225[1].method246(var11, var5 - 12);
								var11 += 14;
							}

							var1.method462(0, var6 + ":", var5, var11);
							var11 += var1.method460(var6) + 8;
							var1.method462(0x800000, field264[var3], var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field309 == 0 || field309 == 1 && method43(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method462(0x800080, var6 + " " + field264[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field417 == 0 && field101 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method462(0x800000, field264[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field417 == 0 && field101 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method462(0, "To " + var6 + ":", var5, 4);
							var1.method462(0x800000, field264[var3], var5, var1.method460("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field309 == 0 || field309 == 1 && method43(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method462(0x7E3200, var6 + " " + field264[var3], var5, 4);
						}

						var2++;
					}
				}
			}

			JJCVVTJN.method254();
			field307 = var2 * 14 + 7;
			if (field307 < 78) {
				field307 = 78;
			}

			method32(field307 - field237 - 77, 77, 463, field307, 0);
			String var10;
			if (field130 == null || field130.field737 == null) {
				var10 = PMUEFTAP.method371(field331);
			} else {
				var10 = field130.field737;
			}

			var1.method462(0, var10 + ":", 90, 4);
			var1.method462(255, field147 + "*", 90, var1.method460(var10 + ": ") + 6);
			JJCVVTJN.method261(0, 0, 479, 77);
		} else {
			method137(0, 0, TDQUELMV.field1070[field380], 0);
		}

		if (field64 && field232 == 2) {
			method60();
		}

		field145.method173(field1420, 17, 357);
		field144.method172();
		QSZFQZON.field893 = field314;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method125() {
		if (field478 == 0) {
			int var1 = field1418 / 2 - 80;
			int var2 = field1419 / 2 + 20;
			var2 += 20;
			if (field1434 == 1 && field1435 >= var1 - 75 && field1435 <= var1 + 75 && field1436 >= var2 - 20 && field1436 <= var2 + 20) {
				field478 = 3;
				field366 = 0;
			}

			int var3 = field1418 / 2 + 80;
			if (field1434 == 1 && field1435 >= var3 - 75 && field1435 <= var3 + 75 && field1436 >= var2 - 20 && field1436 <= var2 + 20) {
				field126 = "";
				field127 = "Enter your username & password.";
				field478 = 2;
				field366 = 0;
			}
		} else if (field478 == 2) {
			int var4 = field1419 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1434 == 1 && field1436 >= var4 - 15 && field1436 < var4) {
				field366 = 0;
			}

			var4 += 15;
			if (field1434 == 1 && field1436 >= var4 - 15 && field1436 < var4) {
				field366 = 1;
			}

			var4 += 15;
			int var5 = field1418 / 2 - 80;
			int var6 = field1419 / 2 + 50;
			var6 += 20;
			if (field1434 == 1 && field1435 >= var5 - 75 && field1435 <= var5 + 75 && field1436 >= var6 - 20 && field1436 <= var6 + 20) {
				field220 = 0;
				method132(field331, field332, false);

				if (field95) {
					return;
				}
			}

			int var7 = field1418 / 2 + 80;
			if (field1434 == 1 && field1435 >= var7 - 75 && field1435 <= var7 + 75 && field1436 >= var6 - 20 && field1436 <= var6 + 20) {
				field478 = 0;
				field331 = "";
				field332 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method580();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field464.length(); var10++) {
					if (var8 == field464.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field366 == 0) {
					if (var8 == 8 && field331.length() > 0) {
						field331 = field331.substring(0, field331.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field366 = 1;
					}

					if (var9) {
						field331 = field331 + (char) var8;
					}

					if (field331.length() > 12) {
						field331 = field331.substring(0, 12);
					}
				} else if (field366 == 1) {
					if (var8 == 8 && field332.length() > 0) {
						field332 = field332.substring(0, field332.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field366 = 0;
					}

					if (var9) {
						field332 = field332 + (char) var8;
					}

					if (field332.length() > 20) {
						field332 = field332.substring(0, 20);
					}
				}
			}
		} else if (field478 == 3) {
			int var11 = field1418 / 2;
			int var12 = field1419 / 2 + 50;
			var12 += 20;
			if (field1434 == 1 && field1435 >= var11 - 75 && field1435 <= var11 + 75 && field1436 >= var12 - 20 && field1436 <= var12 + 20) {
				field478 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method126(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	public final void run() {
		if (field205) {
			method82();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(BLTDQUELMV;)Z")
	public final boolean method127(TDQUELMV arg0) {
		if (arg0.field1132 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1132.length; var2++) {
			int var3 = method20(var2, arg0);
			int var4 = arg0.field1109[var2];
			if (arg0.field1132[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1132[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1132[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method128() {
		field280.method314(10);

		if (field482 != -1) {
			field482 = -1;
			field390 = true;
			field320 = false;
			field108 = true;
		}

		if (field271 != -1) {
			field271 = -1;
			field359 = true;
			field320 = false;
		}

		field315 = -1;
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method129(long arg0) {
		if (arg0 != 0L) {
			if (field94 >= 100) {
				method25("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = PMUEFTAP.method371(PMUEFTAP.method368(arg0));
				for (int var4 = 0; var4 < field94; var4++) {
					if (field154[var4] == arg0) {
						method25("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field295; var5++) {
					if (field430[var5] == arg0) {
						method25("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field154[field94++] = arg0;
				field390 = true;
				field280.method314(171);
				field280.method321(arg0);
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method130(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.j(B)V")
	public final void method131() {
		field182 = false;
		while (field78) {
			field182 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field85 = null;
		field86 = null;
		field429 = null;
		field439 = null;
		field440 = null;
		field441 = null;
		field442 = null;
		field251 = null;
		field252 = null;
		field193 = null;
		field194 = null;
		field173 = null;
		field174 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method132(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field126 = "";
				field127 = "Connecting to server...";
				method78(true);
			}

			field153 = new WMEYNQIL(method57(field338 + 43594), this);
			long var4 = PMUEFTAP.method367(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field280.field797 = 0;
			field280.method315(14);
			field280.method315(var6);
			field153.method518(field280.field796, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field153.method515();
			}

			int var8 = field153.method515();
			int var9 = var8;

			if (var8 == 0) {
				field153.method517(field226.field796, 0, 8);
				field226.field797 = 0;
				field66 = field226.method331();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field66 >> 32), (int) field66 };
				field280.field797 = 0;
				field280.method315(10);
				field280.method319(var10[0]);
				field280.method319(var10[1]);
				field280.method319(var10[2]);
				field280.method319(var10[3]);
				field280.method319(signlink.uid);
				field280.method322(arg0);
				field280.method322(arg1);
				field280.method340(field230, field216);
				field181.field797 = 0;

				if (arg2) {
					field181.method315(18);
				} else {
					field181.method315(16);
				}

				field181.method315(field280.field797 + 36 + 1 + 1 + 2);
				field181.method315(255);
				field181.method316(329);
				field181.method315(field340 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field181.method319(field260[var11]);
				}

				field181.method323(0, field280.field796, field280.field797);
				field280.field801 = new RCWDZCCF(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field333 = new RCWDZCCF(var10);
				field153.method518(field181.field796, 0, field181.field797);
				var8 = field153.method515();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method132(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field165 = field153.method515();
				field299 = field153.method515() == 1;
				field68 = 0L;
				field301 = 0;
				field125.field1168 = 0;
				field1425 = true;
				field123 = true;
				field95 = true;
				field280.field797 = 0;
				field226.field797 = 0;
				field435 = -1;
				field113 = -1;
				field114 = -1;
				field115 = -1;
				field434 = 0;
				field436 = 0;
				field96 = 0;
				field438 = 0;
				field203 = 0;
				field137 = 0;
				field64 = false;
				field1426 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field264[var13] = null;
				}

				field132 = 0;
				field422 = 0;
				field443 = 0;
				field308 = 0;
				field415 = (int) (Math.random() * 100.0D) - 50;
				field255 = (int) (Math.random() * 110.0D) - 55;
				field200 = (int) (Math.random() * 80.0D) - 40;
				field247 = (int) (Math.random() * 120.0D) - 60;
				field374 = (int) (Math.random() * 30.0D) - 20;
				field346 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field210 = 0;
				field377 = -1;
				field316 = 0;
				field317 = 0;
				field407 = 0;
				field121 = 0;

				for (int var14 = 0; var14 < field404; var14++) {
					field406[var14] = null;
					field411[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field120[var15] = null;
				}

				field130 = field406[field405] = new KWSXZIVG();
				field100.method380();
				field167.method380();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field479[var16][var17][var18] = null;
						}
					}
				}

				field116 = new PUBJBHOK();
				field296 = 0;
				field295 = 0;
				field380 = -1;
				field271 = -1;
				field315 = -1;
				field482 = -1;
				field360 = -1;
				field320 = false;
				field209 = 3;
				field138 = 0;
				field64 = false;
				field229 = false;
				field171 = null;
				field195 = 0;
				field168 = -1;
				field402 = true;
				method100();

				for (int var19 = 0; var19 < 5; var19++) {
					field485[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field206[var20] = null;
					field207[var20] = false;
				}

				field231 = 0;
				field362 = 0;
				field204 = 0;
				field401 = 0;
				field388 = 0;
				field141 = 0;
				field84 = 0;
				method68();
			} else if (var8 == 3) {
				field126 = "";
				field127 = "Invalid username or password.";
			} else if (var8 == 4) {
				field126 = "Your account has been disabled.";
				field127 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field126 = "Your account is already logged in.";
				field127 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field126 = "RuneScape has been updated!";
				field127 = "Please reload this page.";
			} else if (var8 == 7) {
				field126 = "This world is full.";
				field127 = "Please use a different world.";
			} else if (var8 == 8) {
				field126 = "Unable to connect.";
				field127 = "Login server offline.";
			} else if (var8 == 9) {
				field126 = "Login limit exceeded.";
				field127 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field126 = "Unable to connect.";
				field127 = "Bad session id.";
			} else if (var8 == 11) {
				field127 = "Login server rejected session.";
				field127 = "Please try again.";
			} else if (var8 == 12) {
				field126 = "You need a members account to login to this world.";
				field127 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field126 = "Could not complete login.";
				field127 = "Please try using a different world.";
			} else if (var8 == 14) {
				field126 = "The server is being updated.";
				field127 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field95 = true;
				field280.field797 = 0;
				field226.field797 = 0;
				field435 = -1;
				field113 = -1;
				field114 = -1;
				field115 = -1;
				field434 = 0;
				field436 = 0;
				field96 = 0;
				field137 = 0;
				field64 = false;
				field460 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field126 = "Login attempts exceeded.";
				field127 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field126 = "You are standing in a members-only area.";
				field127 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field126 = "Invalid loginserver requested";
				field127 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field153.method515();
				for (var21 += 3; var21 >= 0; var21--) {
					field126 = "You have only just left another world";
					field127 = "Your profile will be transferred in: " + var21;
					method78(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method132(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field126 = "Unexpected server response";
				field127 = "Please try using a different world.";
			} else if (var9 != 0) {
				field126 = "No response from server";
				field127 = "Please try using a different world.";
			} else if (field220 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field220++;
				method132(arg0, arg1, arg2);
			} else {
				field126 = "No response from loginserver";
				field127 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field126 = "";
			field127 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.b(IILMQZHAILV;)V")
	public final void method133(int arg0, MQZHAILV arg1) {
		for (int var3 = 0; var3 < field409; var3++) {
			int var4 = field410[var3];
			KWSXZIVG var5 = field406[var4];
			int var6 = arg1.method325();
			if ((var6 & 0x10) != 0) {
				var6 += arg1.method325() << 8;
			}

			method65(arg1, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method134() {
		int var1 = field448 * 128 + 64;
		int var2 = field449 * 128 + 64;
		int var3 = method24(var1, var2, field379) - field450;

		if (field238 < var1) {
			field238 += (var1 - field238) * field452 / 1000 + field451;
			if (field238 > var1) {
				field238 = var1;
			}
		}

		if (field238 > var1) {
			field238 -= (field238 - var1) * field452 / 1000 + field451;
			if (field238 < var1) {
				field238 = var1;
			}
		}

		if (field239 < var3) {
			field239 += (var3 - field239) * field452 / 1000 + field451;
			if (field239 > var3) {
				field239 = var3;
			}
		}

		if (field239 > var3) {
			field239 -= (field239 - var3) * field452 / 1000 + field451;
			if (field239 < var3) {
				field239 = var3;
			}
		}

		if (field240 < var2) {
			field240 += (var2 - field240) * field452 / 1000 + field451;
			if (field240 > var2) {
				field240 = var2;
			}
		}

		if (field240 > var2) {
			field240 -= (field240 - var2) * field452 / 1000 + field451;
			if (field240 < var2) {
				field240 = var2;
			}
		}

		int var4 = field273 * 128 + 64;
		int var5 = field274 * 128 + 64;
		int var6 = method24(var4, var5, field379) - field275;
		int var7 = var4 - field238;
		int var8 = var6 - field239;
		int var9 = var5 - field240;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field241 < var11) {
			field241 += (var11 - field241) * field277 / 1000 + field276;
			if (field241 > var11) {
				field241 = var11;
			}
		}

		if (field241 > var11) {
			field241 -= (field241 - var11) * field277 / 1000 + field276;
			if (field241 < var11) {
				field241 = var11;
			}
		}

		int var13 = var12 - field242;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field242 += field277 * var13 / 1000 + field276;
			field242 &= 0x7FF;
		}

		if (var13 < 0) {
			field242 -= -var13 * field277 / 1000 + field276;
			field242 &= 0x7FF;
		}

		int var14 = var12 - field242;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field242 = var12;
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method135(String arg0) throws IOException {
		if (field202) {
			if (field477 != null) {
				try {
					field477.close();
				} catch (Exception var4) {
				}

				field477 = null;
			}

			field477 = method57(43595);
			field477.setSoTimeout(10000);
			InputStream var2 = field477.getInputStream();
			OutputStream var3 = field477.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(BLMQZHAILV;I)V")
	public final void method136(MQZHAILV arg0, int arg1) {
		field257 = 0;
		field409 = 0;
		method117(arg0, arg1);
		method123(arg0, arg1);
		method149(arg0, arg1);
		method133(arg1, arg0);

		for (int var3 = 0; var3 < field257; var3++) {
			int var4 = field258[var3];
			if (field336 != field406[var4].field1022) {
				field406[var4] = null;
			}
		}

		if (arg0.field797 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field797 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field407; var5++) {
			if (field406[field408[var5]] == null) {
				signlink.reporterror(field331 + " null entry in pl list - pos:" + var5 + " size:" + field407);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(BIILTDQUELMV;I)V")
	public final void method137(int arg0, int arg1, TDQUELMV arg2, int arg3) {
		if (arg2.field1110 == 0 && arg2.field1122 != null && (!arg2.field1103 || field433 == arg2.field1093 || field344 == arg2.field1093 || field355 == arg2.field1093)) {
			int var5 = JJCVVTJN.field680;
			int var6 = JJCVVTJN.field678;
			int var7 = JJCVVTJN.field681;
			int var8 = JJCVVTJN.field679;
			JJCVVTJN.method255(arg2.field1076 + arg3, arg3, arg2.field1123 + arg1, arg1);
			int var9 = arg2.field1122.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1091[var10] + arg1;
				int var12 = arg2.field1127[var10] + arg3 - arg0;
				TDQUELMV var13 = TDQUELMV.field1070[arg2.field1122[var10]];
				var11 += var13.field1102;
				var12 += var13.field1121;

				if (var13.field1074 > 0) {
					method38(var13);
				}

				if (var13.field1110 == 0) {
					if (var13.field1131 > var13.field1129 - var13.field1076) {
						var13.field1131 = var13.field1129 - var13.field1076;
					}

					if (var13.field1131 < 0) {
						var13.field1131 = 0;
					}

					method137(var13.field1131, var11, var13, var12);

					if (var13.field1129 > var13.field1076) {
						method32(var13.field1131, var13.field1076, var13.field1123 + var11, var13.field1129, var12);
					}
				} else if (var13.field1110 != 1) {
					if (var13.field1110 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1076; var15++) {
							for (int var16 = 0; var16 < var13.field1123; var16++) {
								int var17 = (var13.field1125 + 32) * var16 + var11;
								int var18 = (var13.field1118 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1134[var14];
									var18 += var13.field1108[var14];
								}

								if (var13.field1116[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1116[var14] - 1;
									if (var17 > JJCVVTJN.field680 - 32 && var17 < JJCVVTJN.field681 && var18 > JJCVVTJN.field678 - 32 && var18 < JJCVVTJN.field679 || field178 != 0 && field177 == var14) {
										int var22 = 0;
										if (field132 == 1 && field133 == var14 && field134 == var13.field1093) {
											var22 = 0xFFFFFF;
										}

										UFHMHWIH var23 = CBASPZKU.method14(var22, var13.field1084[var14], var21);
										if (var23 != null) {
											if (field178 != 0 && field177 == var14 && field176 == var13.field1093) {
												var19 = field1428 - field179;
												var20 = field1429 - field180;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field386 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method500(128, var17 + var19, var18 + var20);

												if (var18 + var20 < JJCVVTJN.field678 && arg2.field1131 > 0) {
													int var24 = (JJCVVTJN.field678 - var18 - var20) * field403 / 3;
													if (var24 > field403 * 10) {
														var24 = field403 * 10;
													}

													if (var24 > arg2.field1131) {
														var24 = arg2.field1131;
													}

													arg2.field1131 -= var24;
													field180 += var24;
												}

												if (var18 + var20 + 32 > JJCVVTJN.field679 && arg2.field1131 < arg2.field1129 - arg2.field1076) {
													int var25 = (var18 + var20 + 32 - JJCVVTJN.field679) * field403 / 3;
													if (var25 > field403 * 10) {
														var25 = field403 * 10;
													}

													if (var25 > arg2.field1129 - arg2.field1076 - arg2.field1131) {
														var25 = arg2.field1129 - arg2.field1076 - arg2.field1131;
													}

													arg2.field1131 += var25;
													field180 -= var25;
												}
											} else if (field352 != 0 && field351 == var14 && field350 == var13.field1093) {
												var23.method500(128, var17, var18);
											} else {
												var23.method498(var17, var18);
											}

											if (var23.field1153 == 33 || var13.field1084[var14] != 1) {
												int var26 = var13.field1084[var14];
												field266.method462(0, method40(var26), var18 + var20 + 10, var17 + 1 + var19);
												field266.method462(0xFFFF00, method40(var26), var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field1086 != null && var14 < 20) {
									UFHMHWIH var27 = var13.field1086[var14];
									if (var27 != null) {
										var27.method498(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1110 == 3) {
						boolean var28 = false;
						if (field355 == var13.field1093 || field344 == var13.field1093 || field433 == var13.field1093) {
							var28 = true;
						}

						int var29;
						if (method127(var13)) {
							var29 = var13.field1124;
							if (var28 && var13.field1082 != 0) {
								var29 = var13.field1082;
							}
						} else {
							var29 = var13.field1105;
							if (var28 && var13.field1100 != 0) {
								var29 = var13.field1100;
							}
						}

						if (var13.field1097 == 0) {
							if (var13.field1071) {
								JJCVVTJN.method258(var13.field1123, var11, var29, var12, var13.field1076);
							} else {
								JJCVVTJN.method259(var11, var12, var29, var13.field1076, var13.field1123);
							}
						} else if (var13.field1071) {
							JJCVVTJN.method257(256 - (var13.field1097 & 0xFF), var13.field1123, var12, var29, var11, var13.field1076);
						} else {
							JJCVVTJN.method260(var12, var13.field1076, 256 - (var13.field1097 & 0xFF), var13.field1123, var11, var29);
						}
					} else if (var13.field1110 == 4) {
						RGWSJTPO var30 = var13.field1107;
						String var31 = var13.field1126;
						boolean var32 = false;
						if (field355 == var13.field1093 || field344 == var13.field1093 || field433 == var13.field1093) {
							var32 = true;
						}

						int var33;
						if (method127(var13)) {
							var33 = var13.field1124;
							if (var32 && var13.field1082 != 0) {
								var33 = var13.field1082;
							}

							if (var13.field1094.length() > 0) {
								var31 = var13.field1094;
							}
						} else {
							var33 = var13.field1105;
							if (var32 && var13.field1100 != 0) {
								var33 = var13.field1100;
							}
						}

						if (var13.field1101 == 6 && field320) {
							var31 = "Please wait...";
							var33 = var13.field1105;
						}

						if (JJCVVTJN.field676 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field980 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method130(method20(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method130(method20(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method130(method20(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method130(method20(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method130(method20(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1104) {
								var30.method459(var41, var33, var13.field1089, var13.field1123 / 2 + var11, var34);
							} else {
								var30.method466(var34, var13.field1089, var41, var11, var33);
							}

							var34 += var30.field980;
						}
					} else if (var13.field1110 == 5) {
						UFHMHWIH var42;
						if (method127(var13)) {
							var42 = var13.field1111;
						} else {
							var42 = var13.field1075;
						}

						if (var42 != null) {
							var42.method498(var11, var12);
						}
					} else if (var13.field1110 == 6) {
						int var43 = QSZFQZON.field887;
						int var44 = QSZFQZON.field888;
						QSZFQZON.field887 = var13.field1123 / 2 + var11;
						QSZFQZON.field888 = var13.field1076 / 2 + var12;
						int var45 = QSZFQZON.field891[var13.field1079] * var13.field1078 >> 16;
						int var46 = QSZFQZON.field892[var13.field1079] * var13.field1078 >> 16;
						boolean var47 = method127(var13);
						int var48;
						if (var47) {
							var48 = var13.field1114;
						} else {
							var48 = var13.field1113;
						}

						YYHPBDED var49;
						if (var48 == -1) {
							var49 = var13.method488(-1, var47, -1);
						} else {
							JFYFSKVR var50 = JFYFSKVR.field659[var48];
							var49 = var13.method488(var50.field661[var13.field1128], var47, var50.field662[var13.field1128]);
						}

						if (var49 != null) {
							var49.method571(0, var13.field1080, 0, var13.field1079, 0, var45, var46);
						}

						QSZFQZON.field887 = var43;
						QSZFQZON.field888 = var44;
					} else if (var13.field1110 == 7) {
						RGWSJTPO var51 = var13.field1107;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1076; var53++) {
							for (int var54 = 0; var54 < var13.field1123; var54++) {
								if (var13.field1116[var52] > 0) {
									CBASPZKU var55 = CBASPZKU.method13(var13.field1116[var52] - 1);
									String var56 = var55.field37;
									if (var55.field22 || var13.field1084[var52] != 1) {
										var56 = var56 + " x" + method67(var13.field1084[var52]);
									}

									int var57 = (var13.field1125 + 115) * var54 + var11;
									int var58 = (var13.field1118 + 12) * var53 + var12;
									if (var13.field1104) {
										var51.method459(var56, var13.field1105, var13.field1089, var13.field1123 / 2 + var57, var58);
									} else {
										var51.method466(var58, var13.field1089, var56, var57, var13.field1105);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			JJCVVTJN.method255(var8, var6, var7, var5);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method138() {
		for (VGUAJUPX var1 = (VGUAJUPX) field100.method376(); var1 != null; var1 = (VGUAJUPX) field100.method378()) {
			if (field379 != var1.field1197 || field336 > var1.field1202) {
				var1.method492();
			} else if (field336 >= var1.field1201) {
				if (var1.field1205 > 0) {
					OQGXHJNH var2 = field120[var1.field1205 - 1];
					if (var2 != null && var2.field1019 >= 0 && var2.field1019 < 13312 && var2.field1020 >= 0 && var2.field1020 < 13312) {
						var1.method507(var2.field1020, method24(var2.field1019, var2.field1020, var1.field1197) - var1.field1196, var2.field1019, field336);
					}
				}

				if (var1.field1205 < 0) {
					int var3 = -var1.field1205 - 1;
					KWSXZIVG var4;
					if (field465 == var3) {
						var4 = field130;
					} else {
						var4 = field406[var3];
					}

					if (var4 != null && var4.field1019 >= 0 && var4.field1019 < 13312 && var4.field1020 >= 0 && var4.field1020 < 13312) {
						var1.method507(var4.field1020, method24(var4.field1019, var4.field1020, var1.field1197) - var1.field1196, var4.field1019, field336);
					}
				}

				var1.method508(field403);
				field217.method417((int) var1.field1188, (int) var1.field1187, 60, (int) var1.field1189, var1, field379, false, var1.field1190, -1);
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method139() {
		field197++;
		method101(true);
		method21(true);
		method101(false);
		method21(false);
		method138();
		method35();

		if (!field383) {
			int var1 = field345;
			if (field129 / 256 > var1) {
				var1 = field129 / 256;
			}

			if (field243[4] && field335[4] + 128 > var1) {
				var1 = field335[4] + 128;
			}

			int var2 = field346 + field200 & 0x7FF;
			method80(field474, method24(field130.field1019, field130.field1020, field379) - 50, var2, field473, var1, var1 * 3 + 600);
			field462++;
			if (field462 > 116) {
				field462 = 0;
				field280.method314(243);
				field280.method315(68);
			}
		}

		int var3;
		if (field383) {
			var3 = method158();
		} else {
			var3 = method157();
		}

		int var4 = field238;
		int var5 = field239;
		int var6 = field240;
		int var7 = field241;
		int var8 = field242;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field243[var9]) {
				int var10 = (int) (Math.random() * (field323[var9] * 2 + 1) + Math.sin(field467[var9] / 100.0D * field343[var9]) * field335[var9] - field323[var9]);
				if (var9 == 0) {
					field238 += var10;
				}

				if (var9 == 1) {
					field239 += var10;
				}

				if (var9 == 2) {
					field240 += var10;
				}

				if (var9 == 3) {
					field242 = field242 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field241 += var10;
					if (field241 < 128) {
						field241 = 128;
					}

					if (field241 > 383) {
						field241 = 383;
					}
				}
			}
		}

		int var11 = QSZFQZON.field902;
		YYHPBDED.field1403 = true;
		YYHPBDED.field1406 = 0;
		YYHPBDED.field1404 = field1428 - 4;
		YYHPBDED.field1405 = field1429 - 4;
		JJCVVTJN.method256();
		field217.method445(field240, var3, field238, field239, field242, field241);
		field217.method420();
		method71();
		method83();
		method122(var11);
		method27();
		field144.method173(field1420, 4, 4);
		field238 = var4;
		field239 = var5;
		field240 = var6;
		field241 = var7;
		field242 = var8;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method140() {
		field85 = new HQETDHHW(field353, "titlebox", 0);
		field86 = new HQETDHHW(field353, "titlebutton", 0);
		field429 = new HQETDHHW[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field429[var2] = new HQETDHHW(field353, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field429[var3] = new HQETDHHW(field353, "runes", (var3 & 0x3) + 12);
			}
		}

		field173 = new UFHMHWIH(128, 265);
		field174 = new UFHMHWIH(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field173.field1148[var4] = field158.field539[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field174.field1148[var5] = field159.field539[var5];
		}

		field440 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field440[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field440[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field440[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field440[var9 + 192] = 0xFFFFFF;
		}

		field441 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field441[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field441[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field441[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field441[var13 + 192] = 0xFFFFFF;
		}

		field442 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field442[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field442[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field442[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field442[var17 + 192] = 0xFFFFFF;
		}

		field439 = new int[256];
		field251 = new int[32768];
		field252 = new int[32768];
		method26(null);
		field193 = new int[32768];
		field194 = new int[32768];
		method87("Connecting to fileserver", 10);

		if (!field182) {
			field205 = true;
			field182 = true;
			method97(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
			if (field340 && field379 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field217.method432(arg2, arg5, arg3);
			}

			if (arg6 == 1) {
				var8 = field217.method433(arg3, arg2, arg5);
			}

			if (arg6 == 2) {
				var8 = field217.method434(arg2, arg5, arg3);
			}

			if (arg6 == 3) {
				var8 = field217.method435(arg2, arg5, arg3);
			}

			if (var8 != 0) {
				int var12 = field217.method436(arg2, arg5, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field217.method423(arg3, arg2, arg5);
					ZXOFSHYE var16 = ZXOFSHYE.method588(var13);
					if (var16.field1450) {
						field212[arg2].method306(var16.field1476, arg5, arg3, var14, var15);
					}
				}

				if (arg6 == 1) {
					field217.method424(arg5, arg3, arg2);
				}

				if (arg6 == 2) {
					field217.method425(arg5, arg2, arg3);
					ZXOFSHYE var17 = ZXOFSHYE.method588(var13);
					if (var17.field1472 + arg5 > 103 || var17.field1472 + arg3 > 103 || var17.field1488 + arg5 > 103 || var17.field1488 + arg3 > 103) {
						return;
					}

					if (var17.field1450) {
						field212[arg2].method307(var15, arg3, var17.field1488, var17.field1476, arg5, var17.field1472);
					}
				}

				if (arg6 == 3) {
					field217.method426(arg3, arg5, arg2);
					ZXOFSHYE var18 = ZXOFSHYE.method588(var13);
					if (var18.field1450 && var18.field1448) {
						field212[arg2].method309(arg3, arg5);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field461[1][arg5][arg3] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				MPWDIIUH.method290(arg0, arg2, arg1, arg3, field217, var19, field212[arg2], arg4, field387, arg5);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILMQZHAILV;I)V")
	public final void method142(int arg0, MQZHAILV arg1) {
		for (int var3 = 0; var3 < field409; var3++) {
			int var4 = field410[var3];
			OQGXHJNH var5 = field120[var4];
			int var6 = arg1.method325();
			if ((var6 & 0x80) != 0) {
				var5.field1026 = arg1.method352();
				if (var5.field1026 == 0xFFFF) {
					var5.field1026 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field1045 = arg1.method352();
				var5.field1046 = arg1.method327();
			}

			if ((var6 & 0x2) != 0) {
				var5.field1013 = arg1.method353();
				int var7 = arg1.method361();
				var5.field1017 = var7 >> 16;
				var5.field1016 = (var7 & 0xFFFF) + field336;
				var5.field1014 = 0;
				var5.field1015 = 0;

				if (var5.field1016 > field336) {
					var5.field1014 = -1;
				}

				if (var5.field1013 == 0xFFFF) {
					var5.field1013 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var8 = arg1.method346();
				int var9 = arg1.method345();
				var5.method477(field336, var8, var9);
				var5.field1064 = field336 + 300;
				var5.field1065 = arg1.method346();
				var5.field1066 = arg1.method346();
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg1.method346();
				int var11 = arg1.method346();
				var5.method477(field336, var10, var11);
				var5.field1064 = field336 + 300;
				var5.field1065 = arg1.method325();
				var5.field1066 = arg1.method345();
			}

			if ((var6 & 0x4) != 0) {
				int var12 = arg1.method354();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method325();
				if (var5.field1047 == var12 && var12 != -1) {
					int var14 = JFYFSKVR.field659[var12].field673;
					if (var14 == 1) {
						var5.field1048 = 0;
						var5.field1049 = 0;
						var5.field1050 = var13;
						var5.field1051 = 0;
					}

					if (var14 == 2) {
						var5.field1051 = 0;
					}
				} else if (var12 == -1 || var5.field1047 == -1 || JFYFSKVR.field659[var12].field667 >= JFYFSKVR.field659[var5.field1047].field667) {
					var5.field1047 = var12;
					var5.field1048 = 0;
					var5.field1049 = 0;
					var5.field1050 = var13;
					var5.field1051 = 0;
					var5.field1044 = var5.field1054;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field815 = COIHKGSL.method171(arg1.method352());
				var5.field1055 = var5.field815.field526;
				var5.field1018 = var5.field815.field534;
				var5.field1036 = var5.field815.field517;
				var5.field1037 = var5.field815.field531;
				var5.field1038 = var5.field815.field532;
				var5.field1039 = var5.field815.field516;
				var5.field1052 = var5.field815.field530;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1034 = arg1.method332();
				var5.field1061 = 100;
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method143(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field326[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 539) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method144() {
		if (field1434 == 1) {
			if (field1435 >= 6 && field1435 <= 106 && field1436 >= 467 && field1436 <= 499) {
				field456 = (field456 + 1) % 4;
				field111 = true;
				field359 = true;
				field280.method314(59);
				field280.method315(field456);
				field280.method315(field101);
				field280.method315(field309);
			}

			if (field1435 >= 135 && field1435 <= 235 && field1436 >= 467 && field1436 <= 499) {
				field101 = (field101 + 1) % 3;
				field111 = true;
				field359 = true;
				field280.method314(59);
				field280.method315(field456);
				field280.method315(field101);
				field280.method315(field309);
			}

			if (field1435 >= 273 && field1435 <= 373 && field1436 >= 467 && field1436 <= 499) {
				field309 = (field309 + 1) % 3;
				field111 = true;
				field359 = true;
				field280.method314(59);
				field280.method315(field456);
				field280.method315(field101);
				field280.method315(field309);
			}

			if (field1435 >= 412 && field1435 <= 512 && field1436 >= 467 && field1436 <= 499) {
				if (field315 == -1) {
					method128();
					field169 = "";
					field322 = false;

					for (int var1 = 0; var1 < TDQUELMV.field1070.length; var1++) {
						if (TDQUELMV.field1070[var1] != null && TDQUELMV.field1070[var1].field1074 == 600) {
							field381 = field315 = TDQUELMV.field1070[var1].field1083;
							break;
						}
					}
				} else {
					method25("", 0, "Please close the interface you have open before using 'report abuse'");
				}
			}

			field87++;
			if (field87 > 81) {
				field87 = 0;
				field280.method314(92);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method145() {
		field459 = 0;
		int var1 = (field130.field1019 >> 7) + field444;
		int var2 = (field130.field1020 >> 7) + field445;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field459 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field459 = 1;
		}

		if (field459 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field459 = 0;
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method146() {
		if (field155 == null) {
			field1421 = null;
			field145 = null;
			field143 = null;
			field142 = null;
			field144 = null;
			field79 = null;
			field80 = null;
			field81 = null;
			field158 = new CPJIVKZX(128, 265, method42());
			JJCVVTJN.method256();
			field159 = new CPJIVKZX(128, 265, method42());
			JJCVVTJN.method256();
			field155 = new CPJIVKZX(509, 171, method42());
			JJCVVTJN.method256();
			field156 = new CPJIVKZX(360, 132, method42());
			JJCVVTJN.method256();
			field157 = new CPJIVKZX(360, 200, method42());
			JJCVVTJN.method256();
			field160 = new CPJIVKZX(202, 238, method42());
			JJCVVTJN.method256();
			field161 = new CPJIVKZX(203, 238, method42());
			JJCVVTJN.method256();
			field162 = new CPJIVKZX(74, 94, method42());
			JJCVVTJN.method256();
			field163 = new CPJIVKZX(75, 94, method42());
			JJCVVTJN.method256();

			if (field353 != null) {
				method156();
				method140();
			}

			field245 = true;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method147() {
		try {
			if (field153 != null) {
				field153.method514();
			}
		} catch (Exception var2) {
		}

		field153 = null;
		field95 = false;
		field478 = 0;
		field331 = "";
		field332 = "";
		method116();
		field217.method406();

		for (int var1 = 0; var1 < 4; var1++) {
			field212[var1].method301();
		}

		System.gc();
		method160();
		field373 = -1;
		field104 = -1;
		field484 = 0;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method148(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(LMQZHAILV;BI)V")
	public final void method149(MQZHAILV arg0, int arg1) {
		while (arg0.field798 + 10 < arg1 * 8) {
			int var3 = arg0.method336(11);
			if (var3 == 2047) {
				break;
			}

			if (field406[var3] == null) {
				field406[var3] = new KWSXZIVG();
				if (field411[var3] != null) {
					field406[var3].method270(field411[var3]);
				}
			}

			field408[field407++] = var3;
			KWSXZIVG var4 = field406[var3];
			var4.field1022 = field336;
			int var5 = arg0.method336(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method336(1);
			if (var6 == 1) {
				field410[field409++] = var3;
			}

			int var7 = arg0.method336(1);
			int var8 = arg0.method336(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method480(field130.field1041[0] + var5, field130.field1042[0] + var8, var7 == 1);
		}

		arg0.method337();
	}

	@ObfuscatedName("client.d(IJ)V")
	public final void method150(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field94; var3++) {
				if (field154[var3] == arg0) {
					field94--;
					field390 = true;

					for (int var4 = var3; var4 < field94; var4++) {
						field154[var4] = field154[var4 + 1];
					}

					field280.method314(127);
					field280.method321(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method151(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method152() {
		if (field215 || field454 || field106) {
			method58();
		} else {
			field413++;

			if (field95) {
				method114();
			} else {
				method78(false);
			}

			field371 = 0;
		}
	}

	@ObfuscatedName("client.a(LKWSXZIVG;IIII)V")
	public final void method153(KWSXZIVG arg0, int arg1, int arg2, int arg3) {
		if (field130 != arg0 && field137 < 400) {
			String var5;
			if (arg0.field734 == 0) {
				var5 = arg0.field737 + method33(arg0.field755, field130.field755) + " (level-" + arg0.field755 + ")";
			} else {
				var5 = arg0.field737 + " (skill-" + arg0.field734 + ")";
			}

			if (field132 == 1) {
				field124[field137] = "Use " + field136 + " with @whi@" + var5;
				field326[field137] = 957;
				field327[field137] = arg2;
				field324[field137] = arg3;
				field325[field137] = arg1;
				field137++;
			} else if (field422 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field206[var6] != null) {
						field124[field137] = field206[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field206[var6].equalsIgnoreCase("attack")) {
							if (arg0.field755 > field130.field755) {
								var7 = 2000;
							}

							if (field130.field733 != 0 && arg0.field733 != 0) {
								if (field130.field733 == arg0.field733) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field207[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field326[field137] = var7 + 527;
						}

						if (var6 == 1) {
							field326[field137] = var7 + 755;
						}

						if (var6 == 2) {
							field326[field137] = var7 + 510;
						}

						if (var6 == 3) {
							field326[field137] = var7 + 531;
						}

						if (var6 == 4) {
							field326[field137] = var7 + 32;
						}

						field327[field137] = arg2;
						field324[field137] = arg3;
						field325[field137] = arg1;
						field137++;
					}
				}
			} else if ((field424 & 0x8) == 8) {
				field124[field137] = field425 + " @whi@" + var5;
				field326[field137] = 88;
				field327[field137] = arg2;
				field324[field137] = arg3;
				field325[field137] = arg1;
				field137++;
			}

			for (int var8 = 0; var8 < field137; var8++) {
				if (field326[var8] == 672) {
					field124[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method154() {
		if (field1434 == 1) {
			if (field1435 >= 539 && field1435 <= 573 && field1436 >= 169 && field1436 < 205 && field227[0] != -1) {
				field390 = true;
				field209 = 0;
				field108 = true;
			}

			if (field1435 >= 569 && field1435 <= 599 && field1436 >= 168 && field1436 < 205 && field227[1] != -1) {
				field390 = true;
				field209 = 1;
				field108 = true;
			}

			if (field1435 >= 597 && field1435 <= 627 && field1436 >= 168 && field1436 < 205 && field227[2] != -1) {
				field390 = true;
				field209 = 2;
				field108 = true;
			}

			if (field1435 >= 625 && field1435 <= 669 && field1436 >= 168 && field1436 < 203 && field227[3] != -1) {
				field390 = true;
				field209 = 3;
				field108 = true;
			}

			if (field1435 >= 666 && field1435 <= 696 && field1436 >= 168 && field1436 < 205 && field227[4] != -1) {
				field390 = true;
				field209 = 4;
				field108 = true;
			}

			if (field1435 >= 694 && field1435 <= 724 && field1436 >= 168 && field1436 < 205 && field227[5] != -1) {
				field390 = true;
				field209 = 5;
				field108 = true;
			}

			if (field1435 >= 722 && field1435 <= 756 && field1436 >= 169 && field1436 < 205 && field227[6] != -1) {
				field390 = true;
				field209 = 6;
				field108 = true;
			}

			if (field1435 >= 540 && field1435 <= 574 && field1436 >= 466 && field1436 < 502 && field227[7] != -1) {
				field390 = true;
				field209 = 7;
				field108 = true;
			}

			if (field1435 >= 572 && field1435 <= 602 && field1436 >= 466 && field1436 < 503 && field227[8] != -1) {
				field390 = true;
				field209 = 8;
				field108 = true;
			}

			if (field1435 >= 599 && field1435 <= 629 && field1436 >= 466 && field1436 < 503 && field227[9] != -1) {
				field390 = true;
				field209 = 9;
				field108 = true;
			}

			if (field1435 >= 627 && field1435 <= 671 && field1436 >= 467 && field1436 < 502 && field227[10] != -1) {
				field390 = true;
				field209 = 10;
				field108 = true;
			}

			if (field1435 >= 669 && field1435 <= 699 && field1436 >= 466 && field1436 < 503 && field227[11] != -1) {
				field390 = true;
				field209 = 11;
				field108 = true;
			}

			if (field1435 >= 696 && field1435 <= 726 && field1436 >= 466 && field1436 < 503 && field227[12] != -1) {
				field390 = true;
				field209 = 12;
				field108 = true;
			}

			if (field1435 >= 724 && field1435 <= 758 && field1436 >= 466 && field1436 < 502 && field227[13] != -1) {
				field390 = true;
				field209 = 13;
				field108 = true;
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

	@ObfuscatedName("client.J(I)V")
	public final void method155() {
		if (field96 > 1) {
			field96--;
		}

		if (field438 > 0) {
			field438--;
		}

		for (int var1 = 0; var1 < 5 && method48(); var1++) {
		}

		if (field95) {
			synchronized (field125.field1170) {
				if (!field299) {
					field125.field1168 = 0;
				} else if (field1434 != 0 || field125.field1168 >= 40) {
					field280.method314(17);
					field280.method315(0);
					int var3 = field280.field797;
					int var4 = 0;
					for (int var5 = 0; var5 < field125.field1168 && var3 - field280.field797 < 240; var5++) {
						var4++;
						int var6 = field125.field1167[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field125.field1169[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field125.field1167[var5] == -1 && field125.field1169[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field71 != var7 || field72 != var6) {
							int var9 = var7 - field71;
							field71 = var7;
							int var10 = var6 - field72;
							field72 = var6;

							if (field301 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field280.method316((field301 << 12) + (var9 << 6) + var10);
								field301 = 0;
							} else if (field301 < 8) {
								field280.method318((field301 << 19) + var8 + 0x800000);
								field301 = 0;
							} else {
								field280.method319((field301 << 19) + var8 - 0x40000000);
								field301 = 0;
							}
						} else if (field301 < 2047) {
							field301++;
						}
					}

					field280.method324(field280.field797 - var3);

					if (var4 >= field125.field1168) {
						field125.field1168 = 0;
					} else {
						field125.field1168 -= var4;
						for (int var11 = 0; var11 < field125.field1168; var11++) {
							field125.field1169[var11] = field125.field1169[var4 + var11];
							field125.field1167[var11] = field125.field1167[var4 + var11];
						}
					}
				}
			}

			if (field1434 != 0) {
				long var12 = (field1437 - field68) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field68 = field1437;
				int var14 = field1436;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1435;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1434 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field280.method314(81);
				field280.method359((var17 << 19) + (var18 << 20) + var16);
			}

			if (field475 > 0) {
				field475--;
			}

			if (field1438[1] == 1 || field1438[2] == 1 || field1438[3] == 1 || field1438[4] == 1) {
				field476 = true;
			}

			if (field476 && field475 <= 0) {
				field475 = 20;
				field476 = false;
				field280.method314(74);
				field280.method351(field346);
				field280.method350(field345);
			}

			if (field1425 && !field123) {
				field123 = true;
				field280.method314(82);
				field280.method315(1);
			}

			if (!field1425 && field123) {
				field123 = false;
				field280.method314(82);
				field280.method315(0);
			}

			method75();
			method52();
			method81();
			field436++;
			if (field436 > 750) {
				method28();
			}

			method161();
			method107();
			method120();
			field403++;

			if (field395 != 0) {
				field394 += 20;
				if (field394 >= 400) {
					field395 = 0;
				}
			}

			if (field352 != 0) {
				field349++;
				if (field349 >= 15) {
					if (field352 == 2) {
						field390 = true;
					}

					if (field352 == 3) {
						field359 = true;
					}

					field352 = 0;
				}
			}

			if (field178 != 0) {
				field386++;

				if (field1428 > field179 + 5 || field1428 < field179 - 5 || field1429 > field180 + 5 || field1429 < field180 - 5) {
					field356 = true;
				}

				if (field1427 == 0) {
					if (field178 == 2) {
						field390 = true;
					}

					if (field178 == 3) {
						field359 = true;
					}

					field178 = 0;

					if (field356 && field386 >= 5) {
						field370 = -1;
						method66();

						if (field370 == field176 && field369 != field177) {
							TDQUELMV var19 = TDQUELMV.field1070[field176];
							byte var20 = 0;
							if (field166 == 1 && var19.field1074 == 206) {
								var20 = 1;
							}

							if (var19.field1116[field369] <= 0) {
								var20 = 0;
							}

							if (var19.field1133) {
								int var21 = field177;
								int var22 = field369;
								var19.field1116[var22] = var19.field1116[var21];
								var19.field1084[var22] = var19.field1084[var21];
								var19.field1116[var21] = -1;
								var19.field1084[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field177;
								int var24 = field369;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method487(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method487(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method487(field369, field177);
							}

							field280.method314(138);
							field280.method316(field369);
							field280.method349(field177);
							field280.method342(var20);
							field280.method349(field176);
						}
					} else if ((field453 == 1 || method143(field137 - 1)) && field137 > 2) {
						method72();
					} else if (field137 > 0) {
						method119(field137 - 1);
					}

					field349 = 10;
					field1434 = 0;
				}
			}

			if (RGNQYESN.field945 != -1) {
				int var25 = RGNQYESN.field945;
				int var26 = RGNQYESN.field946;
				boolean var27 = method22(0, var26, 0, 0, 0, var25, field130.field1041[0], 0, 0, true, field130.field1042[0]);
				RGNQYESN.field945 = -1;

				if (var27) {
					field392 = field1435;
					field393 = field1436;
					field395 = 1;
					field394 = 0;
				}
			}

			if (field1434 == 1 && field171 != null) {
				field171 = null;
				field359 = true;
				field1434 = 0;
			}

			method95();
			method36();
			method154();
			method144();

			if (field1427 == 1 || field1434 == 1) {
				field371++;
			}

			if (field443 == 2) {
				method118();
			}

			if (field443 == 2 && field383) {
				method134();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field343[var28]++;
			}

			method79();
			field1426++;
			if (field1426 > 4500) {
				field438 = 250;
				field1426 -= 500;
				field280.method314(111);
			}

			field342++;
			if (field342 > 500) {
				field342 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field415 += field416;
				}

				if ((var29 & 0x2) == 2) {
					field255 += field256;
				}

				if ((var29 & 0x4) == 4) {
					field200 += field201;
				}
			}

			if (field415 < -50) {
				field416 = 2;
			}

			if (field415 > 50) {
				field416 = -2;
			}

			if (field255 < -55) {
				field256 = 2;
			}

			if (field255 > 55) {
				field256 = -2;
			}

			if (field200 < -40) {
				field201 = 1;
			}

			if (field200 > 40) {
				field201 = -1;
			}

			field244++;
			if (field244 > 500) {
				field244 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field247 += field248;
				}

				if ((var30 & 0x2) == 2) {
					field374 += field375;
				}
			}

			if (field247 < -60) {
				field248 = 2;
			}

			if (field247 > 60) {
				field248 = -2;
			}

			if (field374 < -20) {
				field375 = 1;
			}

			if (field374 > 10) {
				field375 = -1;
			}

			field437++;
			if (field437 > 50) {
				field280.method314(65);
			}

			try {
				if (field153 != null && field280.field797 > 0) {
					field153.method518(field280.field796, 0, field280.field797);
					field280.field797 = 0;
					field437 = 0;
				}
			} catch (IOException var32) {
				method28();
			} catch (Exception var33) {
				method147();
			}
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method156() {
		byte[] var1 = field353.method176("title.dat", null);
		UFHMHWIH var2 = new UFHMHWIH(var1, this);
		field158.method172();
		var2.method496(0, 0);
		field159.method172();
		var2.method496(0, -637);
		field155.method172();
		var2.method496(0, -128);
		field156.method172();
		var2.method496(-371, -202);
		field157.method172();
		var2.method496(-171, -202);
		field160.method172();
		var2.method496(-265, 0);
		field161.method172();
		var2.method496(-265, -562);
		field162.method172();
		var2.method496(-171, -128);
		field163.method172();
		var2.method496(-171, -562);
		int[] var3 = new int[var2.field1149];
		for (int var4 = 0; var4 < var2.field1150; var4++) {
			for (int var5 = 0; var5 < var2.field1149; var5++) {
				var3[var5] = var2.field1148[var2.field1149 * var4 + var2.field1149 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1149; var6++) {
				var2.field1148[var2.field1149 * var4 + var6] = var3[var6];
			}
		}

		field158.method172();
		var2.method496(0, 382);
		field159.method172();
		var2.method496(0, -255);
		field155.method172();
		var2.method496(0, 254);
		field156.method172();
		var2.method496(-371, 180);
		field157.method172();
		var2.method496(-171, 180);
		field160.method172();
		var2.method496(-265, 382);
		field161.method172();
		var2.method496(-265, -180);
		field162.method172();
		var2.method496(-171, 254);
		field163.method172();
		var2.method496(-171, -180);
		UFHMHWIH var7 = new UFHMHWIH(field353, "logo", 0);
		field155.method172();
		var7.method498(382 - var7.field1149 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.l(B)I")
	public final int method157() {
		int var1 = 3;
		if (field241 < 310) {
			int var2 = field238 >> 7;
			int var3 = field240 >> 7;
			int var4 = field130.field1019 >> 7;
			int var5 = field130.field1020 >> 7;

			if ((field461[field379][var2][var3] & 0x4) != 0) {
				var1 = field379;
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

					if ((field461[field379][var2][var3] & 0x4) != 0) {
						var1 = field379;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field461[field379][var2][var3] & 0x4) != 0) {
							var1 = field379;
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

					if ((field461[field379][var2][var3] & 0x4) != 0) {
						var1 = field379;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field461[field379][var2][var3] & 0x4) != 0) {
							var1 = field379;
						}
					}
				}
			}
		}

		if ((field461[field379][field130.field1019 >> 7][field130.field1020 >> 7] & 0x4) != 0) {
			var1 = field379;
		}

		return var1;
	}

	@ObfuscatedName("client.K(I)I")
	public final int method158() {
		int var1 = method24(field238, field240, field379);
		if (var1 - field239 < 800 && (field461[field379][field238 >> 7][field240 >> 7] & 0x4) != 0) {
			return field379;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IILTDQUELMV;IIZIII)V")
	public final void method159(int arg0, int arg1, TDQUELMV arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (field389) {
			field272 = 32;
		} else {
			field272 = 0;
		}

		field389 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg0 >= arg1 && arg0 < arg1 + 16) {
			arg2.field1131 -= field371 * 4;

			if (arg5) {
				field390 = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg0 >= arg1 + arg4 - 16 && arg0 < arg1 + arg4) {
			arg2.field1131 += field371 * 4;

			if (arg5) {
				field390 = true;
				return;
			}
		} else if (arg6 >= arg7 - field272 && arg6 < arg7 + field272 + 16 && arg0 >= arg1 + 16 && arg0 < arg1 + arg4 - 16 && field371 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg1 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg2.field1131 = (arg3 - arg4) * var10 / var11;

			if (arg5) {
				field390 = true;
			}

			field389 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method160() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.s(Z)V")
	public final void method161() {
		for (int var1 = -1; var1 < field407; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field405;
			} else {
				var2 = field408[var1];
			}

			KWSXZIVG var3 = field406[var2];
			if (var3 != null) {
				method108(1, var3);
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field253[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field321[var3] = var2 / 4;
		}
	}
}
