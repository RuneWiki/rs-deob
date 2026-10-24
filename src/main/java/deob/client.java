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
public final class client extends PXJVLLTT {

	@ObfuscatedName("client.L")
	public int[] field118 = new int[33];

	@ObfuscatedName("client.M")
	public int[] field119 = new int[TXBKOMSP.field1309];

	@ObfuscatedName("client.O")
	public boolean field121 = false;

	@ObfuscatedName("client.P")
	public String field122 = "";

	@ObfuscatedName("client.Q")
	public String field123 = "";

	@ObfuscatedName("client.Y")
	public boolean field131 = false;

	@ObfuscatedName("client.Z")
	public TTFRDWZK[] field132 = new TTFRDWZK[32];

	@ObfuscatedName("client.ab")
	public boolean field133 = false;

	@ObfuscatedName("client.bb")
	public PKHWFJLM field134 = PKHWFJLM.method318(1);

	@ObfuscatedName("client.cb")
	public boolean[] field135 = new boolean[5];

	@ObfuscatedName("client.ib")
	public int field141 = -1;

	@ObfuscatedName("client.jb")
	public int field142 = -1;

	@ObfuscatedName("client.kb")
	public int[] field143 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.mb")
	public boolean field145 = false;

	@ObfuscatedName("client.wb")
	public boolean field153 = true;

	@ObfuscatedName("client.Cb")
	public boolean field157 = false;

	@ObfuscatedName("client.Fb")
	public int[] field160 = new int[151];

	@ObfuscatedName("client.Hb")
	public boolean field162 = false;

	@ObfuscatedName("client.Ib")
	public String field163 = "";

	@ObfuscatedName("client.Jb")
	public int[][][] field164 = new int[4][13][13];

	@ObfuscatedName("client.Kb")
	public int[] field165 = new int[2000];

	@ObfuscatedName("client.Lb")
	public int[] field166 = new int[256];

	@ObfuscatedName("client.Mb")
	public final int[] field167 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Pb")
	public int[] field169 = new int[TXBKOMSP.field1309];

	@ObfuscatedName("client.Qb")
	public int field170 = 0x23201B;

	@ObfuscatedName("client.Sb")
	public final int field172 = 100;

	@ObfuscatedName("client.Tb")
	public int[] field173 = new int[100];

	@ObfuscatedName("client.Wb")
	public int[] field174 = new int[50];

	@ObfuscatedName("client.dc")
	public long[] field180 = new long[100];

	@ObfuscatedName("client.gc")
	public int field182 = 2;

	@ObfuscatedName("client.hc")
	public int[] field183 = new int[5];

	@ObfuscatedName("client.ic")
	public boolean field184 = false;

	@ObfuscatedName("client.jc")
	public boolean field185 = false;

	@ObfuscatedName("client.kc")
	public int[] field186 = new int[5];

	@ObfuscatedName("client.lc")
	public UEUHLQTT field187 = new UEUHLQTT();

	@ObfuscatedName("client.oc")
	public int[] field190 = new int[100];

	@ObfuscatedName("client.pc")
	public String[] field191 = new String[100];

	@ObfuscatedName("client.qc")
	public String[] field192 = new String[100];

	@ObfuscatedName("client.rc")
	public volatile boolean field193 = false;

	@ObfuscatedName("client.sc")
	public boolean field194 = false;

	@ObfuscatedName("client.wc")
	public UEUHLQTT field197 = new UEUHLQTT();

	@ObfuscatedName("client.xc")
	public int[] field198 = new int[TXBKOMSP.field1309];

	@ObfuscatedName("client.Ec")
	public int field204 = 2;

	@ObfuscatedName("client.Hc")
	public boolean field207 = false;

	@ObfuscatedName("client.Kc")
	public int field209 = 1;

	@ObfuscatedName("client.Sc")
	public TJMGSZMW[] field216 = new TJMGSZMW[4];

	@ObfuscatedName("client.Zc")
	public int field223 = -1;

	@ObfuscatedName("client.bd")
	public int[] field225 = new int[1000];

	@ObfuscatedName("client.cd")
	public int[] field226 = new int[1000];

	@ObfuscatedName("client.hd")
	public TTFRDWZK[] field229 = new TTFRDWZK[20];

	@ObfuscatedName("client.id")
	public int[] field230 = new int[9];

	@ObfuscatedName("client.kd")
	public int field232 = 2;

	@ObfuscatedName("client.rd")
	public int[] field236 = new int[5];

	@ObfuscatedName("client.sd")
	public SFAIBATY[] field237 = new SFAIBATY[100];

	@ObfuscatedName("client.Gd")
	public String field250 = "";

	@ObfuscatedName("client.Hd")
	public String field251 = "";

	@ObfuscatedName("client.Id")
	public UEUHLQTT field252 = new UEUHLQTT();

	@ObfuscatedName("client.Kd")
	public boolean field254 = true;

	@ObfuscatedName("client.Md")
	public int field256 = 3;

	@ObfuscatedName("client.Od")
	public boolean field258 = false;

	@ObfuscatedName("client.Qd")
	public String field260 = "";

	@ObfuscatedName("client.Rd")
	public long[] field261 = new long[200];

	@ObfuscatedName("client.Vd")
	public int[] field264 = new int[33];

	@ObfuscatedName("client.Xd")
	public int[] field266 = new int[151];

	@ObfuscatedName("client.Yd")
	public int field267 = 78;

	@ObfuscatedName("client.de")
	public boolean field270 = false;

	@ObfuscatedName("client.ee")
	public PKHWFJLM field271 = PKHWFJLM.method318(1);

	@ObfuscatedName("client.je")
	public boolean field276 = false;

	@ObfuscatedName("client.ke")
	public boolean field277 = false;

	@ObfuscatedName("client.me")
	public int field279 = 1;

	@ObfuscatedName("client.ne")
	public String field280 = "";

	@ObfuscatedName("client.pe")
	public int[] field282 = new int[200];

	@ObfuscatedName("client.te")
	public SFAIBATY[] field284 = new SFAIBATY[13];

	@ObfuscatedName("client.we")
	public int field286 = -1;

	@ObfuscatedName("client.xe")
	public UEUHLQTT[][][] field287 = new UEUHLQTT[4][104][104];

	@ObfuscatedName("client.Ee")
	public boolean field294 = false;

	@ObfuscatedName("client.Ge")
	public int field296 = -1;

	@ObfuscatedName("client.Re")
	public int field305 = -1;

	@ObfuscatedName("client.Ue")
	public int field308 = -1;

	@ObfuscatedName("client.df")
	public PKHWFJLM field316 = new PKHWFJLM(new byte[5000]);

	@ObfuscatedName("client.ef")
	public PDAYFSBN[] field317 = new PDAYFSBN[16384];

	@ObfuscatedName("client.gf")
	public int[] field319 = new int[16384];

	@ObfuscatedName("client.hf")
	public int field320 = 128;

	@ObfuscatedName("client.mf")
	public TTFRDWZK[] field324 = new TTFRDWZK[1000];

	@ObfuscatedName("client.pf")
	public TTFRDWZK[] field327 = new TTFRDWZK[32];

	@ObfuscatedName("client.rf")
	public int field329 = -1;

	@ObfuscatedName("client.vf")
	public String[] field333 = new String[500];

	@ObfuscatedName("client.yf")
	public boolean field336 = true;

	@ObfuscatedName("client.zf")
	public int[] field337 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Df")
	public SFAIBATY[] field341 = new SFAIBATY[2];

	@ObfuscatedName("client.Gf")
	public String field343 = "";

	@ObfuscatedName("client.Hf")
	public int[] field344 = new int[2000];

	@ObfuscatedName("client.Jf")
	public volatile boolean field346 = false;

	@ObfuscatedName("client.Qf")
	public TTFRDWZK[] field353 = new TTFRDWZK[100];

	@ObfuscatedName("client.fg")
	public int field368 = 0x766654;

	@ObfuscatedName("client.lg")
	public TTFRDWZK[] field373 = new TTFRDWZK[32];

	@ObfuscatedName("client.ng")
	public boolean field374 = false;

	@ObfuscatedName("client.tg")
	public String field380 = "";

	@ObfuscatedName("client.vg")
	public int field381 = -1;

	@ObfuscatedName("client.yg")
	public CRC32 field384 = new CRC32();

	@ObfuscatedName("client.Ag")
	public int field386 = 50;

	@ObfuscatedName("client.Bg")
	public int[] field387 = new int[field386];

	@ObfuscatedName("client.Cg")
	public int[] field388 = new int[field386];

	@ObfuscatedName("client.Dg")
	public int[] field389 = new int[field386];

	@ObfuscatedName("client.Eg")
	public int[] field390 = new int[field386];

	@ObfuscatedName("client.Fg")
	public int[] field391 = new int[field386];

	@ObfuscatedName("client.Gg")
	public int[] field392 = new int[field386];

	@ObfuscatedName("client.Hg")
	public int[] field393 = new int[field386];

	@ObfuscatedName("client.Ig")
	public String[] field394 = new String[field386];

	@ObfuscatedName("client.Jg")
	public boolean field395 = false;

	@ObfuscatedName("client.Kg")
	public String[] field396 = new String[200];

	@ObfuscatedName("client.Og")
	public int field399 = 2048;

	@ObfuscatedName("client.Pg")
	public int field400 = 2047;

	@ObfuscatedName("client.Qg")
	public QGDSNXKJ[] field401 = new QGDSNXKJ[field399];

	@ObfuscatedName("client.Sg")
	public int[] field403 = new int[field399];

	@ObfuscatedName("client.Ug")
	public int[] field405 = new int[field399];

	@ObfuscatedName("client.Vg")
	public PKHWFJLM[] field406 = new PKHWFJLM[field399];

	@ObfuscatedName("client.gh")
	public int field416 = 0x4D4233;

	@ObfuscatedName("client.xh")
	public int[] field432 = new int[1000];

	@ObfuscatedName("client.Bh")
	public int[][] field435 = new int[104][104];

	@ObfuscatedName("client.Dh")
	public int field436 = -1;

	@ObfuscatedName("client.Eh")
	public volatile boolean field437 = false;

	@ObfuscatedName("client.Gh")
	public byte[] field439 = new byte[16384];

	@ObfuscatedName("client.Ih")
	public int[][] field440 = new int[104][104];

	@ObfuscatedName("client.Jh")
	public int[][] field441 = new int[104][104];

	@ObfuscatedName("client.Nh")
	public boolean field445 = false;

	@ObfuscatedName("client.Oh")
	public int field446 = -1;

	@ObfuscatedName("client.bi")
	public int field459 = -1;

	@ObfuscatedName("client.ci")
	public int[] field460 = new int[5];

	@ObfuscatedName("client.di")
	public TTFRDWZK[] field461 = new TTFRDWZK[8];

	@ObfuscatedName("client.ei")
	public int field462 = -1;

	@ObfuscatedName("client.si")
	public int[] field475 = new int[50];

	@ObfuscatedName("client.ui")
	public boolean field477 = true;

	@ObfuscatedName("client.vi")
	public UZKSGXIW[] field478 = new UZKSGXIW[5];

	@ObfuscatedName("client.xi")
	public int field480 = -1;

	@ObfuscatedName("client.Mi")
	public boolean field492 = false;

	@ObfuscatedName("client.Ni")
	public PKHWFJLM field493 = PKHWFJLM.method318(1);

	@ObfuscatedName("client.Pi")
	public int[] field495 = new int[5];

	@ObfuscatedName("client.Vi")
	public RRTTGXYM field501 = new RRTTGXYM();

	@ObfuscatedName("client.Zi")
	public int[] field505 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.aj")
	public int field506 = -1;

	@ObfuscatedName("client.bj")
	public int field507 = -1;

	@ObfuscatedName("client.dj")
	public boolean field509 = false;

	@ObfuscatedName("client.ej")
	public boolean field510 = true;

	@ObfuscatedName("client.ij")
	public String[] field514 = new String[5];

	@ObfuscatedName("client.jj")
	public boolean[] field515 = new boolean[5];

	@ObfuscatedName("client.qj")
	public int[] field521 = new int[7];

	@ObfuscatedName("client.rj")
	public boolean field522 = false;

	@ObfuscatedName("client.tj")
	public int[] field524 = new int[50];

	@ObfuscatedName("client.wj")
	public int[] field527 = new int[500];

	@ObfuscatedName("client.xj")
	public int[] field528 = new int[500];

	@ObfuscatedName("client.yj")
	public int[] field529 = new int[500];

	@ObfuscatedName("client.zj")
	public int[] field530 = new int[500];

	@ObfuscatedName("client.Ej")
	public int field535 = 0x332D25;

	@ObfuscatedName("client.Qj")
	public int[] field547 = new int[4000];

	@ObfuscatedName("client.Rj")
	public int[] field548 = new int[4000];

	@ObfuscatedName("client.Vj")
	public boolean field552 = false;

	@ObfuscatedName("client.ac")
	public static int[] field178 = new int[32];

	@ObfuscatedName("client.Tc")
	public static int[] field217 = new int[99];

	@ObfuscatedName("client.Td")
	public static BigInteger field262 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Vh")
	public static BigInteger field453 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ti")
	public static final int[] field476 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Wi")
	public static String field502 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Xi")
	public static final int[][] field503 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Wj")
	public static int field553 = 10;

	@ObfuscatedName("client.Yj")
	public static boolean field555 = true;

	@ObfuscatedName("client.J")
	public int field116;

	@ObfuscatedName("client.K")
	public int field117;

	@ObfuscatedName("client.N")
	public static int field120;

	@ObfuscatedName("client.R")
	public int field124;

	@ObfuscatedName("client.S")
	public int field125;

	@ObfuscatedName("client.T")
	public int field126;

	@ObfuscatedName("client.U")
	public int field127;

	@ObfuscatedName("client.V")
	public int field128;

	@ObfuscatedName("client.W")
	public int field129;

	@ObfuscatedName("client.X")
	public int field130;

	@ObfuscatedName("client.db")
	public int field136;

	@ObfuscatedName("client.eb")
	public int field137;

	@ObfuscatedName("client.fb")
	public int field138;

	@ObfuscatedName("client.lb")
	public int field144;

	@ObfuscatedName("client.nb")
	public int field146;

	@ObfuscatedName("client.ob")
	public int field147;

	@ObfuscatedName("client.pb")
	public int field148;

	@ObfuscatedName("client.qb")
	public int field149;

	@ObfuscatedName("client.sb")
	public int field150;

	@ObfuscatedName("client.tb")
	public int field151;

	@ObfuscatedName("client.ub")
	public int field152;

	@ObfuscatedName("client.Db")
	public static int field158;

	@ObfuscatedName("client.Eb")
	public int field159;

	@ObfuscatedName("client.Gb")
	public int field161;

	@ObfuscatedName("client.Ob")
	public int field168;

	@ObfuscatedName("client.Rb")
	public int field171;

	@ObfuscatedName("client.Xb")
	public int field175;

	@ObfuscatedName("client.Yb")
	public int field176;

	@ObfuscatedName("client.Zb")
	public int field177;

	@ObfuscatedName("client.fc")
	public int field181;

	@ObfuscatedName("client.nc")
	public int field189;

	@ObfuscatedName("client.tc")
	public int field195;

	@ObfuscatedName("client.yc")
	public int field199;

	@ObfuscatedName("client.zc")
	public int field200;

	@ObfuscatedName("client.Ac")
	public int field201;

	@ObfuscatedName("client.Bc")
	public int field202;

	@ObfuscatedName("client.Dc")
	public int field203;

	@ObfuscatedName("client.Jc")
	public int field208;

	@ObfuscatedName("client.Lc")
	public int field210;

	@ObfuscatedName("client.Qc")
	public static int field215;

	@ObfuscatedName("client.Uc")
	public int field218;

	@ObfuscatedName("client.Vc")
	public int field219;

	@ObfuscatedName("client.Wc")
	public int field220;

	@ObfuscatedName("client.Xc")
	public static int field221;

	@ObfuscatedName("client.Yc")
	public int field222;

	@ObfuscatedName("client.ad")
	public int field224;

	@ObfuscatedName("client.fd")
	public int field227;

	@ObfuscatedName("client.jd")
	public int field231;

	@ObfuscatedName("client.ld")
	public int field233;

	@ObfuscatedName("client.vd")
	public int field239;

	@ObfuscatedName("client.wd")
	public int field240;

	@ObfuscatedName("client.xd")
	public int field241;

	@ObfuscatedName("client.yd")
	public int field242;

	@ObfuscatedName("client.zd")
	public int field243;

	@ObfuscatedName("client.Ad")
	public int field244;

	@ObfuscatedName("client.Bd")
	public int field245;

	@ObfuscatedName("client.Cd")
	public int field246;

	@ObfuscatedName("client.Ed")
	public int field248;

	@ObfuscatedName("client.Jd")
	public int field253;

	@ObfuscatedName("client.Nd")
	public int field257;

	@ObfuscatedName("client.Pd")
	public static int field259;

	@ObfuscatedName("client.Ud")
	public static int field263;

	@ObfuscatedName("client.Wd")
	public static int field265;

	@ObfuscatedName("client.be")
	public int field268;

	@ObfuscatedName("client.ie")
	public static int field275;

	@ObfuscatedName("client.le")
	public int field278;

	@ObfuscatedName("client.qe")
	public int field283;

	@ObfuscatedName("client.ze")
	public int field289;

	@ObfuscatedName("client.Ae")
	public int field290;

	@ObfuscatedName("client.Be")
	public int field291;

	@ObfuscatedName("client.Ce")
	public int field292;

	@ObfuscatedName("client.De")
	public int field293;

	@ObfuscatedName("client.Fe")
	public int field295;

	@ObfuscatedName("client.Le")
	public int field299;

	@ObfuscatedName("client.Ve")
	public static int field309;

	@ObfuscatedName("client.Ye")
	public int field311;

	@ObfuscatedName("client.Ze")
	public int field312;

	@ObfuscatedName("client.af")
	public int field313;

	@ObfuscatedName("client.bf")
	public int field314;

	@ObfuscatedName("client.cf")
	public int field315;

	@ObfuscatedName("client.ff")
	public int field318;

	@ObfuscatedName("client.jf")
	public int field321;

	@ObfuscatedName("client.kf")
	public int field322;

	@ObfuscatedName("client.lf")
	public int field323;

	@ObfuscatedName("client.qf")
	public int field328;

	@ObfuscatedName("client.tf")
	public static int field331;

	@ObfuscatedName("client.uf")
	public int field332;

	@ObfuscatedName("client.wf")
	public static int field334;

	@ObfuscatedName("client.xf")
	public int field335;

	@ObfuscatedName("client.Ef")
	public static int field342;

	@ObfuscatedName("client.If")
	public int field345;

	@ObfuscatedName("client.Lf")
	public int field348;

	@ObfuscatedName("client.Mf")
	public int field349;

	@ObfuscatedName("client.Nf")
	public int field350;

	@ObfuscatedName("client.Of")
	public int field351;

	@ObfuscatedName("client.ag")
	public int field363;

	@ObfuscatedName("client.bg")
	public int field364;

	@ObfuscatedName("client.cg")
	public int field365;

	@ObfuscatedName("client.dg")
	public int field366;

	@ObfuscatedName("client.eg")
	public int field367;

	@ObfuscatedName("client.og")
	public int field375;

	@ObfuscatedName("client.pg")
	public int field376;

	@ObfuscatedName("client.qg")
	public int field377;

	@ObfuscatedName("client.rg")
	public int field378;

	@ObfuscatedName("client.sg")
	public int field379;

	@ObfuscatedName("client.wg")
	public int field382;

	@ObfuscatedName("client.zg")
	public int field385;

	@ObfuscatedName("client.Mg")
	public int field397;

	@ObfuscatedName("client.Ng")
	public int field398;

	@ObfuscatedName("client.Rg")
	public int field402;

	@ObfuscatedName("client.Tg")
	public int field404;

	@ObfuscatedName("client.Xg")
	public int field408;

	@ObfuscatedName("client.Yg")
	public int field409;

	@ObfuscatedName("client.Zg")
	public int field410;

	@ObfuscatedName("client.ah")
	public int field411;

	@ObfuscatedName("client.bh")
	public int field412;

	@ObfuscatedName("client.ch")
	public int field413;

	@ObfuscatedName("client.fh")
	public static int field415;

	@ObfuscatedName("client.wh")
	public int field431;

	@ObfuscatedName("client.yh")
	public int field433;

	@ObfuscatedName("client.Fh")
	public int field438;

	@ObfuscatedName("client.Kh")
	public int field442;

	@ObfuscatedName("client.Lh")
	public int field443;

	@ObfuscatedName("client.Mh")
	public int field444;

	@ObfuscatedName("client.Ph")
	public int field447;

	@ObfuscatedName("client.Qh")
	public int field448;

	@ObfuscatedName("client.Rh")
	public int field449;

	@ObfuscatedName("client.Sh")
	public int field450;

	@ObfuscatedName("client.Th")
	public int field451;

	@ObfuscatedName("client.Uh")
	public int field452;

	@ObfuscatedName("client.Wh")
	public int field454;

	@ObfuscatedName("client.Xh")
	public int field455;

	@ObfuscatedName("client.Yh")
	public int field456;

	@ObfuscatedName("client.Zh")
	public int field457;

	@ObfuscatedName("client.ai")
	public int field458;

	@ObfuscatedName("client.fi")
	public int field463;

	@ObfuscatedName("client.li")
	public static int field468;

	@ObfuscatedName("client.mi")
	public int field469;

	@ObfuscatedName("client.ni")
	public int field470;

	@ObfuscatedName("client.oi")
	public int field471;

	@ObfuscatedName("client.pi")
	public int field472;

	@ObfuscatedName("client.qi")
	public int field473;

	@ObfuscatedName("client.ri")
	public int field474;

	@ObfuscatedName("client.wi")
	public int field479;

	@ObfuscatedName("client.zi")
	public int field482;

	@ObfuscatedName("client.Bi")
	public int field483;

	@ObfuscatedName("client.Ci")
	public int field484;

	@ObfuscatedName("client.Ei")
	public int field486;

	@ObfuscatedName("client.Oi")
	public int field494;

	@ObfuscatedName("client.Qi")
	public int field496;

	@ObfuscatedName("client.Ri")
	public static int field497;

	@ObfuscatedName("client.Ui")
	public int field500;

	@ObfuscatedName("client.Yi")
	public int field504;

	@ObfuscatedName("client.cj")
	public int field508;

	@ObfuscatedName("client.hj")
	public int field513;

	@ObfuscatedName("client.mj")
	public int field517;

	@ObfuscatedName("client.nj")
	public int field518;

	@ObfuscatedName("client.oj")
	public int field519;

	@ObfuscatedName("client.uj")
	public int field525;

	@ObfuscatedName("client.vj")
	public int field526;

	@ObfuscatedName("client.Aj")
	public int field531;

	@ObfuscatedName("client.Bj")
	public int field532;

	@ObfuscatedName("client.Cj")
	public int field533;

	@ObfuscatedName("client.Fj")
	public int field536;

	@ObfuscatedName("client.Jj")
	public int field540;

	@ObfuscatedName("client.Pj")
	public int field546;

	@ObfuscatedName("client.Sj")
	public static int field549;

	@ObfuscatedName("client.Tj")
	public static int field550;

	@ObfuscatedName("client.Uj")
	public int field551;

	@ObfuscatedName("client.Xj")
	public static int field554;

	@ObfuscatedName("client.ak")
	public static int field557;

	@ObfuscatedName("client.ud")
	public long field238;

	@ObfuscatedName("client.ce")
	public long field269;

	@ObfuscatedName("client.Wg")
	public long field407;

	@ObfuscatedName("client.eh")
	public long field414;

	@ObfuscatedName("client.sj")
	public long field523;

	@ObfuscatedName("client.gi")
	public BDJKVJZU field464;

	@ObfuscatedName("client.hi")
	public BDJKVJZU field465;

	@ObfuscatedName("client.ii")
	public BDJKVJZU field466;

	@ObfuscatedName("client.ji")
	public BDJKVJZU field467;

	@ObfuscatedName("client.zb")
	public BEVLZSVU field154;

	@ObfuscatedName("client.Ab")
	public BEVLZSVU field155;

	@ObfuscatedName("client.Bb")
	public BEVLZSVU field156;

	@ObfuscatedName("client.Rf")
	public BEVLZSVU field354;

	@ObfuscatedName("client.Sf")
	public BEVLZSVU field355;

	@ObfuscatedName("client.Tf")
	public BEVLZSVU field356;

	@ObfuscatedName("client.Uf")
	public BEVLZSVU field357;

	@ObfuscatedName("client.Vf")
	public BEVLZSVU field358;

	@ObfuscatedName("client.Wf")
	public BEVLZSVU field359;

	@ObfuscatedName("client.Xf")
	public BEVLZSVU field360;

	@ObfuscatedName("client.Yf")
	public BEVLZSVU field361;

	@ObfuscatedName("client.Zf")
	public BEVLZSVU field362;

	@ObfuscatedName("client.gg")
	public BEVLZSVU field369;

	@ObfuscatedName("client.hg")
	public BEVLZSVU field370;

	@ObfuscatedName("client.ig")
	public BEVLZSVU field371;

	@ObfuscatedName("client.jg")
	public BEVLZSVU field372;

	@ObfuscatedName("client.hh")
	public BEVLZSVU field417;

	@ObfuscatedName("client.ih")
	public BEVLZSVU field418;

	@ObfuscatedName("client.jh")
	public BEVLZSVU field419;

	@ObfuscatedName("client.kh")
	public BEVLZSVU field420;

	@ObfuscatedName("client.lh")
	public BEVLZSVU field421;

	@ObfuscatedName("client.mh")
	public BEVLZSVU field422;

	@ObfuscatedName("client.nh")
	public BEVLZSVU field423;

	@ObfuscatedName("client.oh")
	public BEVLZSVU field424;

	@ObfuscatedName("client.ph")
	public BEVLZSVU field425;

	@ObfuscatedName("client.Ld")
	public FKSZIRZG field255;

	@ObfuscatedName("client.pd")
	public JHGVYYQH field234;

	@ObfuscatedName("client.ue")
	public LAXXBEFB field285;

	@ObfuscatedName("client.ye")
	public static QGDSNXKJ field288;

	@ObfuscatedName("client.fe")
	public SFAIBATY field272;

	@ObfuscatedName("client.ge")
	public SFAIBATY field273;

	@ObfuscatedName("client.he")
	public SFAIBATY field274;

	@ObfuscatedName("client.Ie")
	public SFAIBATY field297;

	@ObfuscatedName("client.Je")
	public SFAIBATY field298;

	@ObfuscatedName("client.Af")
	public SFAIBATY field338;

	@ObfuscatedName("client.Bf")
	public SFAIBATY field339;

	@ObfuscatedName("client.Cf")
	public SFAIBATY field340;

	@ObfuscatedName("client.Gi")
	public SFAIBATY field487;

	@ObfuscatedName("client.Hi")
	public SFAIBATY field488;

	@ObfuscatedName("client.Ii")
	public SFAIBATY field489;

	@ObfuscatedName("client.Ji")
	public SFAIBATY field490;

	@ObfuscatedName("client.Ki")
	public SFAIBATY field491;

	@ObfuscatedName("client.Si")
	public SFAIBATY field498;

	@ObfuscatedName("client.Ti")
	public SFAIBATY field499;

	@ObfuscatedName("client.Kj")
	public SFAIBATY field541;

	@ObfuscatedName("client.Lj")
	public SFAIBATY field542;

	@ObfuscatedName("client.Mj")
	public SFAIBATY field543;

	@ObfuscatedName("client.Nj")
	public SFAIBATY field544;

	@ObfuscatedName("client.Oj")
	public SFAIBATY field545;

	@ObfuscatedName("client.oe")
	public TLCMWCVC field281;

	@ObfuscatedName("client.gb")
	public TTFRDWZK field139;

	@ObfuscatedName("client.hb")
	public TTFRDWZK field140;

	@ObfuscatedName("client.qd")
	public TTFRDWZK field235;

	@ObfuscatedName("client.Me")
	public TTFRDWZK field300;

	@ObfuscatedName("client.Ne")
	public TTFRDWZK field301;

	@ObfuscatedName("client.Oe")
	public TTFRDWZK field302;

	@ObfuscatedName("client.Pe")
	public TTFRDWZK field303;

	@ObfuscatedName("client.Qe")
	public TTFRDWZK field304;

	@ObfuscatedName("client.nf")
	public TTFRDWZK field325;

	@ObfuscatedName("client.of")
	public TTFRDWZK field326;

	@ObfuscatedName("client.zh")
	public TTFRDWZK field434;

	@ObfuscatedName("client.Di")
	public TTFRDWZK field485;

	@ObfuscatedName("client.fj")
	public TTFRDWZK field511;

	@ObfuscatedName("client.gj")
	public TTFRDWZK field512;

	@ObfuscatedName("client.pj")
	public TTFRDWZK field520;

	@ObfuscatedName("client.gd")
	public TXPLZUUI field228;

	@ObfuscatedName("client.Kf")
	public WJVLISUF field347;

	@ObfuscatedName("client.We")
	public String field310;

	@ObfuscatedName("client.Pf")
	public String field352;

	@ObfuscatedName("client.qh")
	public String field426;

	@ObfuscatedName("client.Dj")
	public String field534;

	@ObfuscatedName("client.Dd")
	public Socket field247;

	@ObfuscatedName("client.cc")
	public static boolean field179;

	@ObfuscatedName("client.Fd")
	public static boolean field249;

	@ObfuscatedName("client.yi")
	public static boolean field481;

	@ObfuscatedName("client.Zj")
	public static boolean field556;

	@ObfuscatedName("client.Fc")
	public int[] field205;

	@ObfuscatedName("client.Gc")
	public int[] field206;

	@ObfuscatedName("client.Mc")
	public int[] field211;

	@ObfuscatedName("client.Nc")
	public int[] field212;

	@ObfuscatedName("client.Oc")
	public int[] field213;

	@ObfuscatedName("client.Pc")
	public int[] field214;

	@ObfuscatedName("client.Se")
	public int[] field306;

	@ObfuscatedName("client.Te")
	public int[] field307;

	@ObfuscatedName("client.rh")
	public int[] field427;

	@ObfuscatedName("client.sh")
	public int[] field428;

	@ObfuscatedName("client.th")
	public int[] field429;

	@ObfuscatedName("client.uh")
	public int[] field430;

	@ObfuscatedName("client.Gj")
	public int[] field537;

	@ObfuscatedName("client.Hj")
	public int[] field538;

	@ObfuscatedName("client.Ij")
	public int[] field539;

	@ObfuscatedName("client.sf")
	public SFAIBATY[] field330;

	@ObfuscatedName("client.uc")
	public byte[][] field196;

	@ObfuscatedName("client.lj")
	public byte[][] field516;

	@ObfuscatedName("client.mc")
	public byte[][][] field188;

	@ObfuscatedName("client.xg")
	public int[][][] field383;

	@ObfuscatedName("client.a(IIIIZIIIIIII)Z")
	public final boolean method49(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field441[var14][var15] = 0;
				field435[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg0;
		field441[arg1][arg0] = 99;
		field435[arg1][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field547[var18] = arg1;
		int var35 = var18 + 1;
		field548[var18] = arg0;
		boolean var20 = false;
		int var21 = field547.length;
		int[][] var22 = field216[field540].field1295;
		while (var35 != var19) {
			var16 = field547[var19];
			var17 = field548[var19];
			var19 = (var19 + 1) % var21;

			if (arg9 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field216[field540].method489(arg2 - 1, var16, arg9, arg10, var17, arg8)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field216[field540].method490(arg8, arg2 - 1, var17, var16, arg9, arg10)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg6 != 0 && field216[field540].method491(var17, arg10, arg6, arg7, arg9, arg5, var16)) {
				var20 = true;
				break;
			}

			int var23 = field435[var16][var17] + 1;
			if (var16 > 0 && field441[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field547[var35] = var16 - 1;
				field548[var35] = var17;
				var35 = (var35 + 1) % var21;
				field441[var16 - 1][var17] = 2;
				field435[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field441[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field547[var35] = var16 + 1;
				field548[var35] = var17;
				var35 = (var35 + 1) % var21;
				field441[var16 + 1][var17] = 8;
				field435[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field441[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field547[var35] = var16;
				field548[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field441[var16][var17 - 1] = 1;
				field435[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field441[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field547[var35] = var16;
				field548[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field441[var16][var17 + 1] = 4;
				field435[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field441[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field547[var35] = var16 - 1;
				field548[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field441[var16 - 1][var17 - 1] = 3;
				field435[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field441[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field547[var35] = var16 + 1;
				field548[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field441[var16 + 1][var17 - 1] = 9;
				field435[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field441[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field547[var35] = var16 - 1;
				field548[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field441[var16 - 1][var17 + 1] = 6;
				field435[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field441[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field547[var35] = var16 + 1;
				field548[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field441[var16 + 1][var17 + 1] = 12;
				field435[var16 + 1][var17 + 1] = var23;
			}
		}

		field219 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg9 - var25; var26 <= arg9 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field435[var26][var27] < var24) {
								var24 = field435[var26][var27];
								var16 = var26;
								var17 = var27;
								field219 = 1;
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
		field547[var28] = var16;
		int var36 = var28 + 1;
		field548[var28] = var17;
		int var29;
		int var30 = var29 = field441[var16][var17];
		while (arg1 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field547[var36] = var16;
				field548[var36++] = var17;
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

			var30 = field441[var16][var17];
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
		int var32 = field547[var36];
		int var33 = field548[var36];

		if (arg3 == 0) {
			field493.method319(185);
			field493.method320(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field493.method319(74);
			field493.method320(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field493.method319(232);
			field493.method320(var31 + var31 + 3);
		}

		field493.method321(field200 + var33);
		field493.method347(field1097[5] == 1 ? 1 : 0);
		field493.method321(field199 + var32);
		field483 = field547[0];
		field484 = field548[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field493.method347(field547[var36] - var32);
			field493.method348(field548[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.e(I)V")
	public final void method50() {
		if (field1093 == 1) {
			if (field1094 >= 6 && field1094 <= 106 && field1095 >= 467 && field1095 <= 499) {
				field479 = (field479 + 1) % 4;
				field522 = true;
				field270 = true;
				field493.method319(112);
				field493.method320(field479);
				field493.method320(field518);
				field493.method320(field365);
			}

			if (field1094 >= 135 && field1094 <= 235 && field1095 >= 467 && field1095 <= 499) {
				field518 = (field518 + 1) % 3;
				field522 = true;
				field270 = true;
				field493.method319(112);
				field493.method320(field479);
				field493.method320(field518);
				field493.method320(field365);
			}

			if (field1094 >= 273 && field1094 <= 373 && field1095 >= 467 && field1095 <= 499) {
				field365 = (field365 + 1) % 3;
				field522 = true;
				field270 = true;
				field493.method319(112);
				field493.method320(field479);
				field493.method320(field518);
				field493.method320(field365);
			}

			if (field1094 >= 412 && field1094 <= 512 && field1095 >= 467 && field1095 <= 499) {
				if (field329 == -1) {
					method103();
					field163 = "";
					field133 = false;
					field286 = field329 = RRTTGXYM.field1193;
					return;
				}

				method191(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method51() {
		if (field257 != 0) {
			BDJKVJZU var1 = field465;
			int var2 = 0;
			if (field367 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field192[var3] != null) {
					int var4 = field190[var3];
					String var5 = field191[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field518 == 0 || field518 == 1 && method64(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method13(var8, "From", 0, var7);
						var1.method13(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method11("From ");
						if (var6 == 1) {
							field341[0].method473(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field341[1].method473(var11, var7 - 12);
							var11 += 14;
						}

						var1.method13(var11, var5 + ": " + field192[var3], 0, var7);
						var1.method13(var11, var5 + ": " + field192[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field518 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method13(4, field192[var3], 0, var9);
						var1.method13(4, field192[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field518 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method13(4, "To " + var5 + ": " + field192[var3], 0, var10);
						var1.method13(4, "To " + var5 + ": " + field192[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public static final void method52() {
		WJVLISUF.field1357 = true;
		YVYOADIW.field1476 = true;
		field556 = true;
		CDASFTJJ.field114 = true;
		LWJTLDAE.field897 = true;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method53() {
		try {
			int var1 = field288.field1270 + field203;
			int var2 = field288.field1271 + field181;
			if (field442 - var1 < -500 || field442 - var1 > 500 || field443 - var2 < -500 || field443 - var2 > 500) {
				field442 = var1;
				field443 = var2;
			}

			if (field442 != var1) {
				field442 += (var1 - field442) / 16;
			}

			if (field443 != var2) {
				field443 += (var2 - field443) / 16;
			}

			if (field1097[1] == 1) {
				field322 += (-field322 - 24) / 2;
			} else if (field1097[2] == 1) {
				field322 += (24 - field322) / 2;
			} else {
				field322 /= 2;
			}

			if (field1097[3] == 1) {
				field323 += (12 - field323) / 2;
			} else if (field1097[4] == 1) {
				field323 += (-field323 - 12) / 2;
			} else {
				field323 /= 2;
			}

			field321 = field322 / 2 + field321 & 0x7FF;
			field320 += field323 / 2;
			if (field320 < 128) {
				field320 = 128;
			}

			if (field320 > 383) {
				field320 = 383;
			}

			int var3 = field442 >> 7;
			int var4 = field443 >> 7;
			int var5 = method57(field540, field442, field443);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field540;
						if (var9 < 3 && (field188[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field383[var9][var7][var8];
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

			if (var11 > field482) {
				field482 += (var11 - field482) / 24;
			} else if (var11 < field482) {
				field482 += (var11 - field482) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field288.field1270 + "," + field288.field1271 + "," + field442 + "," + field443 + "," + field151 + "," + field152 + "," + field199 + "," + field200);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method54() {
		if (field1093 == 1) {
			if (field1094 >= 539 && field1094 <= 573 && field1095 >= 169 && field1095 < 205 && field337[0] != -1) {
				field276 = true;
				field256 = 0;
				field374 = true;
			}

			if (field1094 >= 569 && field1094 <= 599 && field1095 >= 168 && field1095 < 205 && field337[1] != -1) {
				field276 = true;
				field256 = 1;
				field374 = true;
			}

			if (field1094 >= 597 && field1094 <= 627 && field1095 >= 168 && field1095 < 205 && field337[2] != -1) {
				field276 = true;
				field256 = 2;
				field374 = true;
			}

			if (field1094 >= 625 && field1094 <= 669 && field1095 >= 168 && field1095 < 203 && field337[3] != -1) {
				field276 = true;
				field256 = 3;
				field374 = true;
			}

			if (field1094 >= 666 && field1094 <= 696 && field1095 >= 168 && field1095 < 205 && field337[4] != -1) {
				field276 = true;
				field256 = 4;
				field374 = true;
			}

			if (field1094 >= 694 && field1094 <= 724 && field1095 >= 168 && field1095 < 205 && field337[5] != -1) {
				field276 = true;
				field256 = 5;
				field374 = true;
			}

			if (field1094 >= 722 && field1094 <= 756 && field1095 >= 169 && field1095 < 205 && field337[6] != -1) {
				field276 = true;
				field256 = 6;
				field374 = true;
			}

			if (field1094 >= 540 && field1094 <= 574 && field1095 >= 466 && field1095 < 502 && field337[7] != -1) {
				field276 = true;
				field256 = 7;
				field374 = true;
			}

			if (field1094 >= 572 && field1094 <= 602 && field1095 >= 466 && field1095 < 503 && field337[8] != -1) {
				field276 = true;
				field256 = 8;
				field374 = true;
			}

			if (field1094 >= 599 && field1094 <= 629 && field1095 >= 466 && field1095 < 503 && field337[9] != -1) {
				field276 = true;
				field256 = 9;
				field374 = true;
			}

			if (field1094 >= 627 && field1094 <= 671 && field1095 >= 467 && field1095 < 502 && field337[10] != -1) {
				field276 = true;
				field256 = 10;
				field374 = true;
			}

			if (field1094 >= 669 && field1094 <= 699 && field1095 >= 466 && field1095 < 503 && field337[11] != -1) {
				field276 = true;
				field256 = 11;
				field374 = true;
			}

			if (field1094 >= 696 && field1094 <= 726 && field1095 >= 466 && field1095 < 503 && field337[12] != -1) {
				field276 = true;
				field256 = 12;
				field374 = true;
			}

			if (field1094 >= 724 && field1094 <= 758 && field1095 >= 466 && field1095 < 502 && field337[13] != -1) {
				field276 = true;
				field256 = 13;
				field374 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method55() {
		if (field556 && field130 == 2 && CDASFTJJ.field113 != field540) {
			method124("Loading - please wait.", null);
			field130 = 1;
			field238 = System.currentTimeMillis();
		}

		if (field130 == 1) {
			int var1 = method56();
			if (var1 != 0 && System.currentTimeMillis() - field238 > 360000L) {
				signlink.reporterror(field122 + " glcfb " + field414 + "," + var1 + "," + field556 + "," + field478[0] + "," + field234.method268() + "," + field540 + "," + field151 + "," + field152);
				field238 = System.currentTimeMillis();
			}
		}

		if (field130 == 2 && field540 != field446) {
			field446 = field540;
			method136(field540);
		}
	}

	@ObfuscatedName("client.j(I)I")
	public final int method56() {
		for (int var1 = 0; var1 < field196.length; var1++) {
			if (field196[var1] == null && field538[var1] != -1) {
				return -1;
			}

			if (field516[var1] == null && field539[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field196.length; var3++) {
			byte[] var4 = field516[var3];
			if (var4 != null) {
				int var5 = (field537[var3] >> 8) * 64 - field199;
				int var6 = (field537[var3] & 0xFF) * 64 - field200;
				if (field184) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= CDASFTJJ.method33(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field207) {
			return -4;
		} else {
			field130 = 2;
			CDASFTJJ.field113 = field540;
			method132();
			field493.method319(154);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method57(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field188[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field383[var6][var4][var5] + field383[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field383[var6][var4][var5 + 1] + field383[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method58() {
		field346 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field437) {
				field189++;
				method69();
				method69();
				method115();
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

		field346 = false;
	}

	public final void init() {
		field553 = Integer.parseInt(getParameter("nodeid"));
		field554 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method52();
		} else {
			method101();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field555 = false;
		} else {
			field555 = true;
		}

		method443(765, 503);
	}

	@ObfuscatedName("client.k(I)V")
	public final void method59() {
		field372.method24();
		YVYOADIW.field1487 = field211;
		field340.method473(0, 0);

		if (field145) {
			field466.method9(40, 239, field343, 0);
			field466.method9(60, 239, field380 + "*", 128);
		} else if (field218 == 1) {
			field466.method9(40, 239, "Enter amount:", 0);
			field466.method9(60, 239, field280 + "*", 128);
		} else if (field218 == 2) {
			field466.method9(40, 239, "Enter name:", 0);
			field466.method9(60, 239, field280 + "*", 128);
		} else if (field426 != null) {
			field466.method9(40, 239, field426, 0);
			field466.method9(60, 239, "Click to continue", 128);
		} else if (field296 != -1) {
			method172(0, 0, RRTTGXYM.method458(field296), 0);
		} else if (field462 == -1) {
			BDJKVJZU var1 = field465;
			int var2 = 0;
			CXMSQZVC.method199(77, 0, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field192[var3] != null) {
					int var4 = field190[var3];
					int var5 = field496 + 70 - var2 * 14;
					String var6 = field191[var3];
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
							var1.method13(4, field192[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field479 == 0 || field479 == 1 && method64(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field341[0].method473(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field341[1].method473(var8, var5 - 12);
								var8 += 14;
							}

							var1.method13(var8, var6 + ":", 0, var5);
							var8 += var1.method11(var6) + 8;
							var1.method13(var8, field192[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field257 == 0 && (var4 == 7 || field518 == 0 || field518 == 1 && method64(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method13(var9, "From", 0, var5);
							int var11 = var9 + var1.method11("From ");
							if (var7 == 1) {
								field341[0].method473(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field341[1].method473(var11, var5 - 12);
								var11 += 14;
							}

							var1.method13(var11, var6 + ":", 0, var5);
							var11 += var1.method11(var6) + 8;
							var1.method13(var11, field192[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field365 == 0 || field365 == 1 && method64(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method13(4, var6 + " " + field192[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field257 == 0 && field518 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method13(4, field192[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field257 == 0 && field518 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method13(4, "To " + var6 + ":", 0, var5);
							var1.method13(var1.method11("To " + var6) + 12, field192[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field365 == 0 || field365 == 1 && method64(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method13(4, var6 + " " + field192[var3], 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			CXMSQZVC.method198();
			field267 = var2 * 14 + 7;
			if (field267 < 78) {
				field267 = 78;
			}

			method188(field267, 77, 0, 463, field267 - field496 - 77);
			String var10;
			if (field288 == null || field288.field1105 == null) {
				var10 = MYWERTTF.method304(field122);
			} else {
				var10 = field288.field1105;
			}

			var1.method13(4, var10 + ":", 0, 90);
			var1.method13(var1.method11(var10 + ": ") + 6, field260 + "*", 255, 90);
			CXMSQZVC.method205(479, 0, 0, 77);
		} else {
			method172(0, 0, RRTTGXYM.method458(field462), 0);
		}

		if (field294 && field375 == 2) {
			method84();
		}

		field372.method25(357, field1079, 17);
		field371.method24();
		YVYOADIW.field1487 = field213;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method60() {
		Graphics var1 = method161().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method445(1);

		if (field492) {
			field437 = false;
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

		if (field157) {
			field437 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field277) {
			field437 = false;
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

	@ObfuscatedName("client.a()V")
	public final void method61() {
		method138("Starting up", 20);

		if (signlink.sunjava) {
			field1073 = 5;
		}

		if (field249) {
			field277 = true;
		} else {
			field249 = true;
			boolean var1 = false;
			String var2 = method76();
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

			if (var2.endsWith("192.168.1.224")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field478[var3] = new UZKSGXIW(500000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					method166();
					field228 = method184(25, field230[1], "title screen", 1, "title");
					field464 = new BDJKVJZU(false, field228, "p11_full");
					field465 = new BDJKVJZU(false, field228, "p12_full");
					field466 = new BDJKVJZU(false, field228, "b12_full");
					field467 = new BDJKVJZU(true, field228, "q8_full");
					method143();
					method91();
					TXPLZUUI var4 = method184(30, field230[2], "config", 2, "config");
					TXPLZUUI var5 = method184(35, field230[3], "interface", 3, "interface");
					TXPLZUUI var6 = method184(40, field230[4], "2d graphics", 4, "media");
					TXPLZUUI var7 = method184(45, field230[6], "textures", 6, "textures");
					TXPLZUUI var8 = method184(50, field230[7], "chat system", 7, "wordenc");
					TXPLZUUI var9 = method184(55, field230[8], "sound effects", 8, "sounds");
					field188 = new byte[4][104][104];
					field383 = new int[4][105][105];
					field347 = new WJVLISUF(field383, 4, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field216[var10] = new TJMGSZMW(104, 104);
					}

					field485 = new TTFRDWZK(512, 512);
					TXPLZUUI var11 = method184(60, field230[5], "update list", 5, "versionlist");
					method138("Connecting to update server", 60);
					field234 = new JHGVYYQH();
					field234.method272(var11, this);
					AOFTXYIM.method1(field234.method255());
					PSGMMDJS.method407(field234.method262(0), field234);

					if (!field556) {
						field253 = 0;
						try {
							field253 = Integer.parseInt(getParameter("music"));
						} catch (Exception var72) {
						}

						field254 = true;
						field234.method265(2, field253);

						while (field234.method268() > 0) {
							method168();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field234.field851 > 3) {
								method158("ondemand");
								return;
							}
						}
					}

					method138("Requesting animations", 65);
					int var12 = field234.method262(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field234.method265(1, var13);
					}

					while (field234.method268() > 0) {
						int var14 = var12 - field234.method268();
						if (var14 > 0) {
							method138("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method168();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field234.field851 > 3) {
							method158("ondemand");
							return;
						}
					}

					method138("Requesting models", 70);
					int var15 = field234.method262(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field234.method273(var16);
						if ((var17 & 0x1) != 0) {
							field234.method265(0, var16);
						}
					}

					int var18 = field234.method268();
					while (field234.method268() > 0) {
						int var19 = var18 - field234.method268();
						if (var19 > 0) {
							method138("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method168();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field478[0] != null) {
						method138("Requesting maps", 75);
						field234.method265(3, field234.method257(47, 0, 48));
						field234.method265(3, field234.method257(47, 1, 48));
						field234.method265(3, field234.method257(48, 0, 48));
						field234.method265(3, field234.method257(48, 1, 48));
						field234.method265(3, field234.method257(49, 0, 48));
						field234.method265(3, field234.method257(49, 1, 48));
						field234.method265(3, field234.method257(47, 0, 47));
						field234.method265(3, field234.method257(47, 1, 47));
						field234.method265(3, field234.method257(48, 0, 47));
						field234.method265(3, field234.method257(48, 1, 47));
						field234.method265(3, field234.method257(48, 0, 148));
						field234.method265(3, field234.method257(48, 1, 148));
						int var20 = field234.method268();
						while (field234.method268() > 0) {
							int var21 = var20 - field234.method268();
							if (var21 > 0) {
								method138("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method168();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field234.method262(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field234.method273(var23);
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
							field234.method275(var25, var23, 0);
						}
					}

					field234.method270(field555);

					if (!field556) {
						int var26 = field234.method262(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field234.method271(var27)) {
								field234.method275((byte) 1, var27, 2);
							}
						}
					}

					method138("Unpacking media", 80);
					field338 = new SFAIBATY(var6, "invback", 0);
					field340 = new SFAIBATY(var6, "chatback", 0);
					field339 = new SFAIBATY(var6, "mapback", 0);
					field272 = new SFAIBATY(var6, "backbase1", 0);
					field273 = new SFAIBATY(var6, "backbase2", 0);
					field274 = new SFAIBATY(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field284[var28] = new SFAIBATY(var6, "sideicons", var28);
					}

					field520 = new TTFRDWZK(var6, "compass", 0);
					field235 = new TTFRDWZK(var6, "mapedge", 0);
					field235.method494();

					for (int var29 = 0; var29 < 72; var29++) {
						field237[var29] = new SFAIBATY(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field353[var30] = new TTFRDWZK(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field229[var31] = new TTFRDWZK(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field373[var32] = new TTFRDWZK(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field327[var33] = new TTFRDWZK(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field132[var34] = new TTFRDWZK(var6, "headicons_hint", var34);
					}

					field434 = new TTFRDWZK(var6, "overlay_multiway", 0);
					field139 = new TTFRDWZK(var6, "mapmarker", 0);
					field140 = new TTFRDWZK(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field461[var35] = new TTFRDWZK(var6, "cross", var35);
					}

					field300 = new TTFRDWZK(var6, "mapdots", 0);
					field301 = new TTFRDWZK(var6, "mapdots", 1);
					field302 = new TTFRDWZK(var6, "mapdots", 2);
					field303 = new TTFRDWZK(var6, "mapdots", 3);
					field304 = new TTFRDWZK(var6, "mapdots", 4);
					field498 = new SFAIBATY(var6, "scrollbar", 0);
					field499 = new SFAIBATY(var6, "scrollbar", 1);
					field541 = new SFAIBATY(var6, "redstone1", 0);
					field542 = new SFAIBATY(var6, "redstone2", 0);
					field543 = new SFAIBATY(var6, "redstone3", 0);
					field544 = new SFAIBATY(var6, "redstone1", 0);
					field544.method470();
					field545 = new SFAIBATY(var6, "redstone2", 0);
					field545.method470();
					field487 = new SFAIBATY(var6, "redstone1", 0);
					field487.method471();
					field488 = new SFAIBATY(var6, "redstone2", 0);
					field488.method471();
					field489 = new SFAIBATY(var6, "redstone3", 0);
					field489.method471();
					field490 = new SFAIBATY(var6, "redstone1", 0);
					field490.method470();
					field490.method471();
					field491 = new SFAIBATY(var6, "redstone2", 0);
					field491.method470();
					field491.method471();

					for (int var36 = 0; var36 < 2; var36++) {
						field341[var36] = new SFAIBATY(var6, "mod_icons", var36);
					}

					TTFRDWZK var37 = new TTFRDWZK(var6, "backleft1", 0);
					field417 = new BEVLZSVU(var37.field1304, var37.field1303, method161());
					var37.method495(0, 0);
					TTFRDWZK var38 = new TTFRDWZK(var6, "backleft2", 0);
					field418 = new BEVLZSVU(var38.field1304, var38.field1303, method161());
					var38.method495(0, 0);
					TTFRDWZK var39 = new TTFRDWZK(var6, "backright1", 0);
					field419 = new BEVLZSVU(var39.field1304, var39.field1303, method161());
					var39.method495(0, 0);
					TTFRDWZK var40 = new TTFRDWZK(var6, "backright2", 0);
					field420 = new BEVLZSVU(var40.field1304, var40.field1303, method161());
					var40.method495(0, 0);
					TTFRDWZK var41 = new TTFRDWZK(var6, "backtop1", 0);
					field421 = new BEVLZSVU(var41.field1304, var41.field1303, method161());
					var41.method495(0, 0);
					TTFRDWZK var42 = new TTFRDWZK(var6, "backvmid1", 0);
					field422 = new BEVLZSVU(var42.field1304, var42.field1303, method161());
					var42.method495(0, 0);
					TTFRDWZK var43 = new TTFRDWZK(var6, "backvmid2", 0);
					field423 = new BEVLZSVU(var43.field1304, var43.field1303, method161());
					var43.method495(0, 0);
					TTFRDWZK var44 = new TTFRDWZK(var6, "backvmid3", 0);
					field424 = new BEVLZSVU(var44.field1304, var44.field1303, method161());
					var44.method495(0, 0);
					TTFRDWZK var45 = new TTFRDWZK(var6, "backhmid2", 0);
					field425 = new BEVLZSVU(var45.field1304, var45.field1303, method161());
					var45.method495(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field353[var50] != null) {
							field353[var50].method493(var46 + var49, var47 + var49, var48 + var49);
						}

						if (field237[var50] != null) {
							field237[var50].method472(var46 + var49, var47 + var49, var48 + var49);
						}
					}

					method138("Unpacking textures", 83);
					YVYOADIW.method589(var7);
					YVYOADIW.method593(0.8D);
					YVYOADIW.method588(20);
					method138("Unpacking config", 86);
					DWUJPTWU.method214(var4);
					LWJTLDAE.method297(var4);
					QXFWPOFL.method450(var4);
					HCJYZKIH.method237(var4);
					YIBRLAQY.method580(var4);
					PTKBILNJ.method436(var4);
					HTWOTIWO.method249(var4);
					XESCWZPS.method574(var4);
					BCUFZZFO.method6(var4);
					HCJYZKIH.field759 = field555;

					if (!field556) {
						method138("Unpacking sounds", 90);
						byte[] var51 = var9.method506("sounds.dat", null);
						PKHWFJLM var52 = new PKHWFJLM(var51);
						NGSVJLXG.method306(var52);
					}

					method138("Unpacking interfaces", 95);
					BDJKVJZU[] var53 = new BDJKVJZU[] { field464, field465, field466, field467 };
					RRTTGXYM.method460(var53, var5, var6);
					method138("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field339.field1214[field339.field1216 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field118[var54] = var55;
						field264[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field339.field1214[field339.field1216 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field266[var58 - 5] = var59 - 25;
						field160[var58 - 5] = var60 - var59;
					}

					YVYOADIW.method586(503, 765);
					field214 = YVYOADIW.field1487;
					YVYOADIW.method586(96, 479);
					field211 = YVYOADIW.field1487;
					YVYOADIW.method586(261, 190);
					field212 = YVYOADIW.field1487;
					YVYOADIW.method586(334, 512);
					field213 = YVYOADIW.field1487;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = YVYOADIW.field1485[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					WJVLISUF.method559(800, var62, 334, 512, 500);
					PSDABLUV.method368(var8);
					field281 = new TLCMWCVC(this);
					method135(field281, 10);
					SLPOTSAU.field1234 = this;
					LWJTLDAE.field896 = this;
					YIBRLAQY.field1444 = this;
				} catch (Exception var73) {
					signlink.reporterror("loaderror " + field310 + " " + field161);
					field492 = true;
				}
			} else {
				field157 = true;
			}
		}
	}

	@ObfuscatedName("client.m(I)Z")
	public final boolean method62() {
		return signlink.wavereplay();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1082 != null) {
				return new URL("http://127.0.0.1:" + (field554 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method63(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method64(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field137; var2++) {
			if (arg0.equalsIgnoreCase(field396[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field288.field1105)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method65() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.n(I)V")
	public final void method66() {
		if (field348 == 0 && field531 == 0) {
			field333[field345] = "Walk here";
			field529[field345] = 124;
			field527[field345] = field1087;
			field528[field345] = field1088;
			field345++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < PSGMMDJS.field1057; var2++) {
			int var3 = PSGMMDJS.field1058[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field347.method553(field540, var4, var5, var3) >= 0) {
					LWJTLDAE var8 = LWJTLDAE.method290(var7);
					if (var8.field901 != null) {
						var8 = var8.method291();
					}

					if (var8 == null) {
						continue;
					}

					if (field348 == 1) {
						field333[field345] = "Use " + field352 + " with @cya@" + var8.field915;
						field529[field345] = 611;
						field530[field345] = var3;
						field527[field345] = var4;
						field528[field345] = var5;
						field345++;
					} else if (field531 != 1) {
						if (var8.field904 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field904[var9] != null) {
									field333[field345] = var8.field904[var9] + " @cya@" + var8.field915;

									if (var9 == 0) {
										field529[field345] = 74;
									}

									if (var9 == 1) {
										field529[field345] = 743;
									}

									if (var9 == 2) {
										field529[field345] = 125;
									}

									if (var9 == 3) {
										field529[field345] = 982;
									}

									if (var9 == 4) {
										field529[field345] = 1545;
									}

									field530[field345] = var3;
									field527[field345] = var4;
									field528[field345] = var5;
									field345++;
								}
							}
						}

						field333[field345] = "Examine @cya@" + var8.field915;
						field529[field345] = 1634;
						field530[field345] = var8.field895 << 14;
						field527[field345] = var4;
						field528[field345] = var5;
						field345++;
					} else if ((field533 & 0x4) == 4) {
						field333[field345] = field534 + " @cya@" + var8.field915;
						field529[field345] = 234;
						field530[field345] = var3;
						field527[field345] = var4;
						field528[field345] = var5;
						field345++;
					}
				}

				if (var6 == 1) {
					PDAYFSBN var10 = field317[var7];
					if (var10.field969.field1475 == 1 && (var10.field1270 & 0x7F) == 0x40 && (var10.field1271 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field318; var11++) {
							PDAYFSBN var12 = field317[field319[var11]];
							if (var12 != null && var10 != var12 && var12.field969.field1475 == 1 && var10.field1270 == var12.field1270 && var10.field1271 == var12.field1271) {
								method173(var4, var5, var12.field969, field319[var11]);
							}
						}

						for (int var13 = 0; var13 < field402; var13++) {
							QGDSNXKJ var14 = field401[field403[var13]];
							if (var14 != null && var10.field1270 == var14.field1270 && var10.field1271 == var14.field1271) {
								method183(var4, var14, field403[var13], var5);
							}
						}
					}

					method173(var4, var5, var10.field969, var7);
				}

				if (var6 == 0) {
					QGDSNXKJ var15 = field401[var7];
					if ((var15.field1270 & 0x7F) == 0x40 && (var15.field1271 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field318; var16++) {
							PDAYFSBN var17 = field317[field319[var16]];
							if (var17 != null && var17.field969.field1475 == 1 && var15.field1270 == var17.field1270 && var15.field1271 == var17.field1271) {
								method173(var4, var5, var17.field969, field319[var16]);
							}
						}

						for (int var18 = 0; var18 < field402; var18++) {
							QGDSNXKJ var19 = field401[field403[var18]];
							if (var19 != null && var15 != var19 && var15.field1270 == var19.field1270 && var15.field1271 == var19.field1271) {
								method183(var4, var19, field403[var18], var5);
							}
						}
					}

					method183(var4, var15, var7, var5);
				}

				if (var6 == 3) {
					UEUHLQTT var20 = field287[field540][var4][var5];
					if (var20 != null) {
						for (LCFGLQPE var21 = (LCFGLQPE) var20.method511(); var21 != null; var21 = (LCFGLQPE) var20.method513()) {
							HCJYZKIH var22 = HCJYZKIH.method236(var21.field878);
							if (field348 == 1) {
								field333[field345] = "Use " + field352 + " with @lre@" + var22.field727;
								field529[field345] = 341;
								field530[field345] = var21.field878;
								field527[field345] = var4;
								field528[field345] = var5;
								field345++;
							} else if (field531 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field741 != null && var22.field741[var23] != null) {
										field333[field345] = var22.field741[var23] + " @lre@" + var22.field727;

										if (var23 == 0) {
											field529[field345] = 838;
										}

										if (var23 == 1) {
											field529[field345] = 775;
										}

										if (var23 == 2) {
											field529[field345] = 167;
										}

										if (var23 == 3) {
											field529[field345] = 396;
										}

										if (var23 == 4) {
											field529[field345] = 893;
										}

										field530[field345] = var21.field878;
										field527[field345] = var4;
										field528[field345] = var5;
										field345++;
									} else if (var23 == 2) {
										field333[field345] = "Take @lre@" + var22.field727;
										field529[field345] = 167;
										field530[field345] = var21.field878;
										field527[field345] = var4;
										field528[field345] = var5;
										field345++;
									}
								}

								field333[field345] = "Examine @lre@" + var22.field727;
								field529[field345] = 1642;
								field530[field345] = var21.field878;
								field527[field345] = var4;
								field528[field345] = var5;
								field345++;
							} else if ((field533 & 0x1) == 1) {
								field333[field345] = field534 + " @lre@" + var22.field727;
								field529[field345] = 855;
								field530[field345] = var21.field878;
								field527[field345] = var4;
								field528[field345] = var5;
								field345++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLRRTTGXYM;)V")
	public final void method67(RRTTGXYM arg0) {
		int var2 = arg0.field1178;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field138 == 0) {
				arg0.field1205 = "Loading friend list";
				arg0.field1141 = 0;
			} else if (var2 == 1 && field138 == 1) {
				arg0.field1205 = "Connecting to friendserver";
				arg0.field1141 = 0;
			} else if (var2 == 2 && field138 != 2) {
				arg0.field1205 = "Please wait...";
				arg0.field1141 = 0;
			} else {
				int var3 = field137;
				if (field138 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1205 = "";
					arg0.field1141 = 0;
				} else {
					arg0.field1205 = field396[var2];
					arg0.field1141 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field137;
			if (field138 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1205 = "";
				arg0.field1141 = 0;
			} else {
				if (field282[var2] == 0) {
					arg0.field1205 = "@red@Offline";
				} else if (field282[var2] < 200) {
					if (field282[var2] == field553) {
						arg0.field1205 = "@gre@World-" + (field282[var2] - 9);
					} else {
						arg0.field1205 = "@yel@World-" + (field282[var2] - 9);
					}
				} else if (field282[var2] == field553) {
					arg0.field1205 = "@gre@Classic" + (field282[var2] - 219);
				} else {
					arg0.field1205 = "@yel@Classic" + (field282[var2] - 219);
				}

				arg0.field1141 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field137;
			if (field138 != 2) {
				var5 = 0;
			}

			arg0.field1190 = var5 * 15 + 20;
			if (arg0.field1190 <= arg0.field1161) {
				arg0.field1190 = arg0.field1161 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field138 == 0) {
				arg0.field1205 = "Loading ignore list";
				arg0.field1141 = 0;
			} else if (var2 == 1 && field138 == 0) {
				arg0.field1205 = "Please wait...";
				arg0.field1141 = 0;
			} else {
				int var6 = field144;
				if (field138 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1205 = "";
					arg0.field1141 = 0;
				} else {
					arg0.field1205 = MYWERTTF.method304(MYWERTTF.method301(field180[var2]));
					arg0.field1141 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1190 = field144 * 15 + 20;
			if (arg0.field1190 <= arg0.field1161) {
				arg0.field1190 = arg0.field1161 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1174 = 150;
			arg0.field1175 = (int) (Math.sin(field468 / 40.0D) * 256.0D) & 0x7FF;

			if (field552) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field521[var7];
					if (var8 >= 0 && !PTKBILNJ.field1064[var8].method438()) {
						return;
					}
				}

				field552 = false;
				PSGMMDJS[] var9 = new PSGMMDJS[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field521[var11];
					if (var12 >= 0) {
						var9[var10++] = PTKBILNJ.field1064[var12].method439();
					}
				}

				PSGMMDJS var13 = new PSGMMDJS(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field495[var14] != 0) {
						var13.method424(field503[var14][0], field503[var14][field495[var14]]);

						if (var14 == 1) {
							var13.method424(field476[0], field476[field495[var14]]);
						}
					}
				}

				var13.method417();
				var13.method418(DWUJPTWU.field586[field288.field1239].field588[0]);
				var13.method427(64, 850, -30, -50, -30, true);
				arg0.field1180 = 5;
				arg0.field1181 = 0;
				RRTTGXYM.method465(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field325 == null) {
				field325 = arg0.field1162;
				field326 = arg0.field1202;
			}

			if (field510) {
				arg0.field1162 = field326;
			} else {
				arg0.field1162 = field325;
			}
		} else if (var2 == 325) {
			if (field325 == null) {
				field325 = arg0.field1162;
				field326 = arg0.field1202;
			}

			if (field510) {
				arg0.field1162 = field325;
			} else {
				arg0.field1162 = field326;
			}
		} else if (var2 == 600) {
			arg0.field1205 = field163;
			if (field468 % 20 < 10) {
				arg0.field1205 = arg0.field1205 + "|";
			} else {
				arg0.field1205 = arg0.field1205 + " ";
			}
		} else if (var2 == 620) {
			if (field438 < 1) {
				arg0.field1205 = "";
			} else if (field133) {
				arg0.field1165 = 0xFF0000;
				arg0.field1205 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1165 = 0xFFFFFF;
				arg0.field1205 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field150 - field500;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1205 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field246 == 0) {
				arg0.field1205 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field246 <= field150) {
				arg0.field1205 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method68(field246);
			} else {
				int var17 = field150 + 14 - field246;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1205 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method68(field246) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field366 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field366 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field366 + " unread messages";
			}

			arg0.field1205 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field494 > 0 && field494 <= field150 + 10) {
				arg0.field1205 = "Last password change:\\n@gre@" + method68(field494);
			} else {
				arg0.field1205 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field413 == 0) {
				arg0.field1205 = "You have not yet set\\nany contact details.";
			}

			if (field413 == 1) {
				arg0.field1205 = "Contact Details Last Set:\\n@gre@" + method68(field283);
			}

			if (field413 == 2) {
				arg0.field1205 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field458 > 2 && !field555) {
				arg0.field1205 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field458 > 2) {
				arg0.field1205 = "\\n\\nYou have @gre@" + field458 + "@yel@ days of\\nmember credit remaining.";
			} else if (field458 > 0) {
				arg0.field1205 = "You have @gre@" + field458 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1205 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field458 > 2 && !field555) {
				arg0.field1205 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field458 > 0) {
				arg0.field1205 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1205 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field246 > field150) {
				arg0.field1205 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1205 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public final String method68(int arg0) {
		if (arg0 > field150 + 10) {
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

	@ObfuscatedName("client.o(I)V")
	public final void method69() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field306[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field306[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field307[var10] = (field306[var10 - 1] + field306[var10 + 1] + field306[var10 - 128] + field306[var10 + 128]) / 4;
			}
		}

		field268 += 128;
		if (field268 > field205.length) {
			field268 -= field205.length;
			int var11 = (int) (Math.random() * 12.0D);
			method96(field330[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field307[var14 + 128] - field205[field268 + var14 & field205.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field306[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field166[var16] = field166[var16 + 1];
		}

		field166[var1 - 1] = (int) (Math.sin(field468 / 14.0D) * 16.0D + Math.sin(field468 / 15.0D) * 14.0D + Math.sin(field468 / 16.0D) * 12.0D);

		if (field239 > 0) {
			field239 -= 4;
		}

		if (field240 > 0) {
			field240 -= 4;
		}

		if (field239 == 0 && field240 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field239 = 1024;
			}

			if (var17 == 1) {
				field240 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Z")
	public final boolean method70(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field529[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 695) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ZIII)Z")
	public final boolean method71(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field347.method553(field540, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LWJTLDAE var8 = LWJTLDAE.method290(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field902;
				var10 = var8.field894;
			} else {
				var9 = var8.field894;
				var10 = var8.field902;
			}

			int var11 = var8.field899;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method49(field288.field1237[0], field288.field1236[0], 0, 2, false, var9, var10, var11, 0, arg1, arg0);
		} else {
			method49(field288.field1237[0], field288.field1236[0], var6 + 1, 2, false, 0, 0, 0, var7, arg1, arg0);
		}

		field447 = field1094;
		field448 = field1095;
		field450 = 2;
		field449 = 0;
		return true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method72() {
		if (field159 == 2) {
			method94((field242 - field200 << 7) + field245, field243 * 2, (field241 - field199 << 7) + field244);

			if (field506 > -1 && field468 % 20 < 10) {
				field132[0].method497(field506 - 12, field507 - 28);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method73() {
		field385 = 0;
		for (int var1 = -1; var1 < field402 + field318; var1++) {
			SRUOAWPS var2;
			if (var1 == -1) {
				var2 = field288;
			} else if (var1 < field402) {
				var2 = field401[field403[var1]];
			} else {
				var2 = field317[field319[var1 - field402]];
			}

			if (var2 != null && var2.method316()) {
				if (var2 instanceof PDAYFSBN) {
					YIBRLAQY var3 = ((PDAYFSBN) var2).field969;
					if (var3.field1447 != null) {
						var3 = var3.method576();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field402) {
					YIBRLAQY var6 = ((PDAYFSBN) var2).field969;
					if (var6.field1460 >= 0 && var6.field1460 < field327.length) {
						method93(var2, var2.field1265 + 15);

						if (field506 > -1) {
							field327[var6.field1460].method497(field506 - 12, field507 - 30);
						}
					}

					if (field159 == 1 && field319[var1 - field402] == field220 && field468 % 20 < 10) {
						method93(var2, var2.field1265 + 15);

						if (field506 > -1) {
							field132[0].method497(field506 - 12, field507 - 28);
						}
					}
				} else {
					int var4 = 30;
					QGDSNXKJ var5 = (QGDSNXKJ) var2;
					if (var5.field1123 != -1 || var5.field1116 != -1) {
						method93(var2, var2.field1265 + 15);

						if (field506 > -1) {
							if (var5.field1123 != -1) {
								field373[var5.field1123].method497(field506 - 12, field507 - var4);
								var4 += 25;
							}

							if (var5.field1116 != -1) {
								field327[var5.field1116].method497(field506 - 12, field507 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field159 == 10 && field403[var1] == field363) {
						method93(var2, var2.field1265 + 15);

						if (field506 > -1) {
							field132[1].method497(field506 - 12, field507 - var4);
						}
					}
				}

				if (var2.field1276 != null && (var1 >= field402 || field479 == 0 || field479 == 3 || field479 == 1 && method64(((QGDSNXKJ) var2).field1105))) {
					method93(var2, var2.field1265);

					if (field506 > -1 && field385 < field386) {
						field390[field385] = field466.method12(var2.field1276) / 2;
						field389[field385] = field466.field42;
						field387[field385] = field506;
						field388[field385] = field507;
						field391[field385] = var2.field1252;
						field392[field385] = var2.field1238;
						field393[field385] = var2.field1251;
						field394[field385++] = var2.field1276;

						if (field210 == 0 && var2.field1238 >= 1 && var2.field1238 <= 3) {
							field389[field385] += 10;
							field388[field385] += 5;
						}

						if (field210 == 0 && var2.field1238 == 4) {
							field390[field385] = 60;
						}

						if (field210 == 0 && var2.field1238 == 5) {
							field389[field385] += 5;
						}
					}
				}

				if (var2.field1261 > field468) {
					method93(var2, var2.field1265 + 15);

					if (field506 > -1) {
						int var7 = var2.field1262 * 30 / var2.field1263;
						if (var7 > 30) {
							var7 = 30;
						}

						CXMSQZVC.method202(0xFF00, field506 - 15, var7, field507 - 3, 5);
						CXMSQZVC.method202(0xFF0000, field506 + var7 - 15, 30 - var7, field507 - 3, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1268[var8] > field468) {
						method93(var2, var2.field1265 / 2);

						if (field506 > -1) {
							if (var8 == 1) {
								field507 -= 20;
							}

							if (var8 == 2) {
								field506 -= 15;
								field507 -= 10;
							}

							if (var8 == 3) {
								field506 += 15;
								field507 -= 10;
							}

							field229[var2.field1267[var8]].method497(field506 - 12, field507 - 12);
							field464.method9(field507 + 4, field506, String.valueOf(var2.field1266[var8]), 0);
							field464.method9(field507 + 3, field506 - 1, String.valueOf(var2.field1266[var8]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field385; var9++) {
			int var10 = field387[var9];
			int var11 = field388[var9];
			int var12 = field390[var9];
			int var13 = field389[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field388[var15] - field389[var15] && var11 - var13 < field388[var15] + 2 && var10 - var12 < field390[var15] + field387[var15] && var10 + var12 > field387[var15] - field390[var15] && field388[var15] - field389[var15] < var11) {
						var11 = field388[var15] - field389[var15];
						var14 = true;
					}
				}
			}

			field506 = field387[var9];
			field507 = field388[var9] = var11;
			String var16 = field394[var9];
			if (field210 == 0) {
				int var17 = 0xFFFF00;
				if (field391[var9] < 6) {
					var17 = field505[field391[var9]];
				}

				if (field391[var9] == 6) {
					var17 = field525 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field391[var9] == 7) {
					var17 = field525 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field391[var9] == 8) {
					var17 = field525 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field391[var9] == 9) {
					int var18 = 150 - field393[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field391[var9] == 10) {
					int var19 = 150 - field393[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field391[var9] == 11) {
					int var20 = 150 - field393[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field392[var9] == 0) {
					field466.method9(field507 + 1, field506, var16, 0);
					field466.method9(field507, field506, var16, var17);
				}

				if (field392[var9] == 1) {
					field466.method14(0, var16, field525, field507 + 1, field506);
					field466.method14(var17, var16, field525, field507, field506);
				}

				if (field392[var9] == 2) {
					field466.method15(field506, field507 + 1, field525, var16, 0);
					field466.method15(field506, field507, field525, var16, var17);
				}

				if (field392[var9] == 3) {
					field466.method16(0, field525, field507 + 1, var16, field506, 150 - field393[var9]);
					field466.method16(var17, field525, field507, var16, field506, 150 - field393[var9]);
				}

				if (field392[var9] == 4) {
					int var21 = field466.method12(var16);
					int var22 = (150 - field393[var9]) * (var21 + 100) / 150;
					CXMSQZVC.method199(334, 0, field506 - 50, field506 + 50);
					field466.method13(field506 + 50 - var22, var16, 0, field507 + 1);
					field466.method13(field506 + 50 - var22, var16, var17, field507);
					CXMSQZVC.method198();
				}

				if (field392[var9] == 5) {
					int var23 = 150 - field393[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					CXMSQZVC.method199(field507 + 5, field507 - field466.field42 - 1, 0, 512);
					field466.method9(field507 + var24 + 1, field506, var16, 0);
					field466.method9(field507 + var24, field506, var16, var17);
					CXMSQZVC.method198();
				}
			} else {
				field466.method9(field507 + 1, field506, var16, 0);
				field466.method9(field507, field506, var16, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(LRRTTGXYM;I)Z")
	public final boolean method74(RRTTGXYM arg0) {
		int var2 = arg0.field1178;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field333[field345] = "Remove @whi@" + arg0.field1205;
				field529[field345] = 736;
				field345++;
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

		field333[field345] = "Remove @whi@" + field396[var2];
		field529[field345] = 864;
		field345++;
		field333[field345] = "Message @whi@" + field396[var2];
		field529[field345] = 713;
		field345++;
		return true;
	}

	@ObfuscatedName("client.a(IILPKHWFJLM;)V")
	public final void method75(int arg0, PKHWFJLM arg1) {
		for (int var3 = 0; var3 < field404; var3++) {
			int var4 = field405[var3];
			PDAYFSBN var5 = field317[var4];
			int var6 = arg1.method330();
			if ((var6 & 0x20) != 0) {
				var5.field1281 = arg1.method357();
				int var7 = arg1.method366();
				var5.field1285 = var7 >> 16;
				var5.field1284 = (var7 & 0xFFFF) + field468;
				var5.field1282 = 0;
				var5.field1283 = 0;

				if (var5.field1284 > field468) {
					var5.field1282 = -1;
				}

				if (var5.field1281 == 0xFFFF) {
					var5.field1281 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1278 = arg1.method359();
				var5.field1279 = arg1.method332();
			}

			if ((var6 & 0x8) != 0) {
				var5.field969 = YIBRLAQY.method579(arg1.method332());
				var5.field1243 = var5.field969.field1475;
				var5.field1269 = var5.field969.field1454;
				var5.field1287 = var5.field969.field1472;
				var5.field1288 = var5.field969.field1457;
				var5.field1289 = var5.field969.field1468;
				var5.field1290 = var5.field969.field1441;
				var5.field1239 = var5.field969.field1464;
			}

			if ((var6 & 0x2) != 0) {
				var5.field1242 = arg1.method357();
				if (var5.field1242 == 0xFFFF) {
					var5.field1242 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var8 = arg1.method351();
				int var9 = arg1.method350();
				var5.method477(var9, field468, var8);
				var5.field1261 = field468 + 300;
				var5.field1262 = arg1.method349();
				var5.field1263 = arg1.method349();
			}

			if ((var6 & 0x80) != 0) {
				int var10 = arg1.method332();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method330();
				if (var5.field1245 == var10 && var10 != -1) {
					int var12 = DWUJPTWU.field586[var10].field600;
					if (var12 == 1) {
						var5.field1246 = 0;
						var5.field1247 = 0;
						var5.field1248 = var11;
						var5.field1249 = 0;
					}

					if (var12 == 2) {
						var5.field1249 = 0;
					}
				} else if (var10 == -1 || var5.field1245 == -1 || DWUJPTWU.field586[var10].field594 >= DWUJPTWU.field586[var5.field1245].field594) {
					var5.field1245 = var10;
					var5.field1246 = 0;
					var5.field1247 = 0;
					var5.field1248 = var11;
					var5.field1249 = 0;
					var5.field1250 = var5.field1253;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field1276 = arg1.method337();
				var5.field1251 = 100;
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg1.method351();
				int var14 = arg1.method349();
				var5.method477(var14, field468, var13);
				var5.field1261 = field468 + 300;
				var5.field1262 = arg1.method351();
				var5.field1263 = arg1.method350();
			}
		}
	}

	@ObfuscatedName("client.g(Z)Ljava/lang/String;")
	public final String method76() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1082 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(LNTHYVEDA;I)V")
	public final void method77(NTHYVEDA arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field960 == 0) {
			var2 = field347.method549(arg0.field959, arg0.field961, arg0.field962);
		}

		if (arg0.field960 == 1) {
			var2 = field347.method550(arg0.field959, arg0.field962, arg0.field961);
		}

		if (arg0.field960 == 2) {
			var2 = field347.method551(arg0.field959, arg0.field961, arg0.field962);
		}

		if (arg0.field960 == 3) {
			var2 = field347.method552(arg0.field959, arg0.field961, arg0.field962);
		}

		if (var2 != 0) {
			int var6 = field347.method553(arg0.field959, arg0.field961, arg0.field962, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field956 = var3;
		arg0.field958 = var4;
		arg0.field957 = var5;
	}

	@ObfuscatedName("client.b(IILPKHWFJLM;)V")
	public final void method78(int arg0, PKHWFJLM arg1) {
		for (int var3 = 0; var3 < field404; var3++) {
			int var4 = field405[var3];
			QGDSNXKJ var5 = field401[var4];
			int var6 = arg1.method330();
			if ((var6 & 0x40) != 0) {
				var6 += arg1.method330() << 8;
			}

			method88(var5, arg1, var4, var6);
		}
	}

	@ObfuscatedName("client.a(IZB)V")
	public final void method79(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(IZIIII)V")
	public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field347.method549(arg3, arg2, arg4);
		if (var6 != 0) {
			int var7 = field347.method553(arg3, arg2, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field485.field1302;
			int var12 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LWJTLDAE var14 = LWJTLDAE.method290(var13);
			if (var14.field912 == -1) {
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
				SFAIBATY var15 = field237[var14.field912];
				if (var15 != null) {
					int var16 = (var14.field902 * 4 - var15.field1216) / 2;
					int var17 = (var14.field894 * 4 - var15.field1217) / 2;
					var15.method473(arg2 * 4 + var16 + 48, (104 - arg4 - var14.field894) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field347.method551(arg3, arg2, arg4);
		if (var18 != 0) {
			int var19 = field347.method553(arg3, arg2, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LWJTLDAE var23 = LWJTLDAE.method290(var22);
			if (var23.field912 != -1) {
				SFAIBATY var24 = field237[var23.field912];
				if (var24 != null) {
					int var25 = (var23.field902 * 4 - var24.field1216) / 2;
					int var26 = (var23.field894 * 4 - var24.field1217) / 2;
					var24.method473(arg2 * 4 + var25 + 48, (104 - arg4 - var23.field894) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field485.field1302;
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

		int var30 = field347.method552(arg3, arg2, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LWJTLDAE var32 = LWJTLDAE.method290(var31);
			if (var32.field912 != -1) {
				SFAIBATY var33 = field237[var32.field912];
				if (var33 != null) {
					int var34 = (var32.field902 * 4 - var33.field1216) / 2;
					int var35 = (var32.field894 * 4 - var33.field1217) / 2;
					var33.method473(arg2 * 4 + var34 + 48, (104 - arg4 - var32.field894) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method81() {
		if (field354 == null) {
			field1080 = null;
			field372 = null;
			field370 = null;
			field369 = null;
			field371 = null;
			field154 = null;
			field155 = null;
			field156 = null;
			field357 = new BEVLZSVU(265, 128, method161());
			CXMSQZVC.method200();
			field358 = new BEVLZSVU(265, 128, method161());
			CXMSQZVC.method200();
			field354 = new BEVLZSVU(171, 509, method161());
			CXMSQZVC.method200();
			field355 = new BEVLZSVU(132, 360, method161());
			CXMSQZVC.method200();
			field356 = new BEVLZSVU(200, 360, method161());
			CXMSQZVC.method200();
			field359 = new BEVLZSVU(238, 202, method161());
			CXMSQZVC.method200();
			field360 = new BEVLZSVU(238, 203, method161());
			CXMSQZVC.method200();
			field361 = new BEVLZSVU(94, 74, method161());
			CXMSQZVC.method200();
			field362 = new BEVLZSVU(94, 75, method161());
			CXMSQZVC.method200();

			if (field228 != null) {
				method143();
				method91();
			}

			field509 = true;
		}
	}

	@ObfuscatedName("client.a(LPKHWFJLM;IZ)V")
	public final void method82(PKHWFJLM arg0, int arg1) {
		field431 = 0;
		field404 = 0;
		method134(arg0, arg1);
		method164(arg0, arg1);
		method75(arg1, arg0);

		for (int var3 = 0; var3 < field431; var3++) {
			int var4 = field432[var3];
			if (field468 != field317[var4].field1264) {
				field317[var4].field969 = null;
				field317[var4] = null;
			}
		}

		if (arg0.field971 != arg1) {
			signlink.reporterror(field122 + " size mismatch in getnpcpos - pos:" + arg0.field971 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field318; var5++) {
			if (field317[field319[var5]] == null) {
				signlink.reporterror(field122 + " null entry in npc list - pos:" + var5 + " size:" + field318);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LRRTTGXYM;Z)Z")
	public final boolean method83(RRTTGXYM arg0) {
		if (arg0.field1182 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1182.length; var2++) {
			int var3 = method100(arg0, var2);
			int var4 = arg0.field1195[var2];
			if (arg0.field1182[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1182[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1182[var2] == 4) {
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
	public final void method84() {
		int var1 = field376;
		int var2 = field377;
		int var3 = field378;
		int var4 = field379;
		int var5 = 0x5D5447;
		CXMSQZVC.method202(var5, var1, var3, var2, var4);
		CXMSQZVC.method202(0, var1 + 1, var3 - 2, var2 + 1, 16);
		CXMSQZVC.method203(var2 + 18, var4 - 19, 0, var1 + 1, var3 - 2);
		field466.method13(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field1087;
		int var7 = field1088;
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

		for (int var8 = 0; var8 < field345; var8++) {
			int var9 = (field345 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field466.method17(var9, var1 + 3, var10, field333[var8], true);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg2 >= 1 && arg4 <= 102 && arg2 <= 102) {
			if (field556 && field540 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field347.method549(arg3, arg4, arg2);
			}

			if (arg6 == 1) {
				var8 = field347.method550(arg3, arg2, arg4);
			}

			if (arg6 == 2) {
				var8 = field347.method551(arg3, arg4, arg2);
			}

			if (arg6 == 3) {
				var8 = field347.method552(arg3, arg4, arg2);
			}

			if (var8 != 0) {
				int var12 = field347.method553(arg3, arg4, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field347.method540(arg2, arg4, arg3);
					LWJTLDAE var16 = LWJTLDAE.method290(var13);
					if (var16.field914) {
						field216[arg3].method485(var14, var16.field925, arg4, arg2, var15);
					}
				}

				if (arg6 == 1) {
					field347.method541(arg4, arg3, arg2);
				}

				if (arg6 == 2) {
					field347.method542(arg4, arg3, arg2);
					LWJTLDAE var17 = LWJTLDAE.method290(var13);
					if (var17.field902 + arg4 > 103 || var17.field902 + arg2 > 103 || var17.field894 + arg4 > 103 || var17.field894 + arg2 > 103) {
						return;
					}

					if (var17.field914) {
						field216[arg3].method486(arg4, var17.field925, arg2, var17.field902, var17.field894, var15);
					}
				}

				if (arg6 == 3) {
					field347.method543(arg4, arg3, arg2);
					LWJTLDAE var18 = LWJTLDAE.method290(var13);
					if (var18.field914 && var18.field882) {
						field216[arg3].method488(arg4, arg2);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field188[1][arg4][arg2] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				CDASFTJJ.method32(arg0, field347, arg1, var19, arg4, field216[arg3], field383, arg2, arg5, arg3);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method86(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method87() {
		if (field372 == null) {
			method102();
			field1080 = null;
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field362 = null;
			field372 = new BEVLZSVU(96, 479, method161());
			field370 = new BEVLZSVU(156, 172, method161());
			CXMSQZVC.method200();
			field339.method473(0, 0);
			field369 = new BEVLZSVU(261, 190, method161());
			field371 = new BEVLZSVU(334, 512, method161());
			CXMSQZVC.method200();
			field154 = new BEVLZSVU(50, 496, method161());
			field155 = new BEVLZSVU(37, 269, method161());
			field156 = new BEVLZSVU(45, 249, method161());
			field509 = true;
			field371.method24();
			YVYOADIW.field1487 = field213;
		}
	}

	@ObfuscatedName("client.a(LQGDSNXKJ;LPKHWFJLM;IZI)V")
	public final void method88(QGDSNXKJ arg0, PKHWFJLM arg1, int arg2, int arg3) {
		if ((arg3 & 0x1) != 0) {
			arg0.field1276 = arg1.method337();
			if (arg0.field1276.charAt(0) == '~') {
				arg0.field1276 = arg0.field1276.substring(1);
				method191(2, arg0.field1105, arg0.field1276);
			} else if (field288 == arg0) {
				method191(2, arg0.field1105, arg0.field1276);
			}

			arg0.field1252 = 0;
			arg0.field1238 = 0;
			arg0.field1251 = 150;
		}

		if ((arg3 & 0x80) != 0) {
			int var5 = arg1.method359();
			int var6 = arg1.method351();
			int var7 = arg1.method330();
			int var8 = arg1.field971;

			if (arg0.field1105 != null && arg0.field1104) {
				long var9 = MYWERTTF.method300(arg0.field1105);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field144; var12++) {
						if (field180[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field463 == 0) {
					try {
						field316.field971 = 0;
						arg1.method339(0, field316.field970, var7);
						field316.field971 = 0;
						String var13 = OCQVXKDE.method313(var7, field316);
						var13 = PSDABLUV.method378(var13);
						arg0.field1276 = var13;
						arg0.field1252 = var5 >> 8;
						arg0.field1238 = var5 & 0xFF;
						arg0.field1251 = 150;

						if (var6 == 2 || var6 == 3) {
							method191(1, "@cr2@" + arg0.field1105, var13);
						} else if (var6 == 1) {
							method191(1, "@cr1@" + arg0.field1105, var13);
						} else {
							method191(2, arg0.field1105, var13);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field971 = var7 + var8;
		}

		if ((arg3 & 0x4) != 0) {
			int var15 = arg1.method350();
			int var16 = arg1.method350();
			arg0.method477(var16, field468, var15);
			arg0.field1261 = field468 + 300;
			arg0.field1262 = arg1.method349();
			arg0.field1263 = arg1.method330();
		}

		if ((arg3 & 0x200) != 0) {
			arg0.field1254 = arg1.method350();
			arg0.field1256 = arg1.method350();
			arg0.field1255 = arg1.method330();
			arg0.field1257 = arg1.method349();
			arg0.field1258 = arg1.method332() + field468;
			arg0.field1259 = arg1.method332() + field468;
			arg0.field1260 = arg1.method349();
			arg0.method479();
		}

		if ((arg3 & 0x8) != 0) {
			arg0.field1242 = arg1.method358();
			if (arg0.field1242 == 0xFFFF) {
				arg0.field1242 = -1;
			}
		}

		if ((arg3 & 0x2) != 0) {
			arg0.field1278 = arg1.method359();
			arg0.field1279 = arg1.method358();
		}

		if ((arg3 & 0x20) != 0) {
			int var17 = arg1.method358();
			if (var17 == 0xFFFF) {
				var17 = -1;
			}

			int var18 = arg1.method349();
			if (arg0.field1245 == var17 && var17 != -1) {
				int var19 = DWUJPTWU.field586[var17].field600;
				if (var19 == 1) {
					arg0.field1246 = 0;
					arg0.field1247 = 0;
					arg0.field1248 = var18;
					arg0.field1249 = 0;
				}

				if (var19 == 2) {
					arg0.field1249 = 0;
				}
			} else if (var17 == -1 || arg0.field1245 == -1 || DWUJPTWU.field586[var17].field594 >= DWUJPTWU.field586[arg0.field1245].field594) {
				arg0.field1245 = var17;
				arg0.field1246 = 0;
				arg0.field1247 = 0;
				arg0.field1248 = var18;
				arg0.field1249 = 0;
				arg0.field1250 = arg0.field1253;
			}
		}

		if ((arg3 & 0x400) != 0) {
			arg0.field1281 = arg1.method357();
			int var20 = arg1.method335();
			arg0.field1285 = var20 >> 16;
			arg0.field1284 = (var20 & 0xFFFF) + field468;
			arg0.field1282 = 0;
			arg0.field1283 = 0;

			if (arg0.field1284 > field468) {
				arg0.field1282 = -1;
			}

			if (arg0.field1281 == 0xFFFF) {
				arg0.field1281 = -1;
			}
		}

		if ((arg3 & 0x10) != 0) {
			int var21 = arg1.method330();
			byte[] var22 = new byte[var21];
			PKHWFJLM var23 = new PKHWFJLM(var22);
			arg1.method339(0, var22, var21);
			field406[arg2] = var23;
			arg0.method447(var23);
		}

		if ((arg3 & 0x100) != 0) {
			int var24 = arg1.method330();
			int var25 = arg1.method350();
			arg0.method477(var25, field468, var24);
			arg0.field1261 = field468 + 300;
			arg0.field1262 = arg1.method350();
			arg0.field1263 = arg1.method349();
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method89(boolean arg0) {
		method81();
		field356.method24();
		field297.method473(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field248 == 0) {
			int var4 = var3 / 2 + 80;
			field464.method10(var2 / 2, field234.field858, true, var4, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field466.method10(var2 / 2, "Welcome to RuneScape", true, var5, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field298.method473(var6 - 73, var7 - 20);
			field466.method10(var6, "New User", true, var7 + 5, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field298.method473(var8 - 73, var7 - 20);
			field466.method10(var8, "Existing User", true, var7 + 5, 0xFFFFFF);
		}

		if (field248 == 2) {
			int var9 = var3 / 2 - 40;
			if (field250.length() > 0) {
				field466.method10(var2 / 2, field250, true, var9 - 15, 0xFFFF00);
				field466.method10(var2 / 2, field251, true, var9, 0xFFFF00);
				var9 += 30;
			} else {
				field466.method10(var2 / 2, field251, true, var9 - 7, 0xFFFF00);
				var9 += 30;
			}

			field466.method17(var9, var2 / 2 - 90, 0xFFFFFF, "Username: " + field122 + (field146 == 0 & field468 % 40 < 20 ? "@yel@|" : ""), true);
			var9 += 15;
			field466.method17(var9, var2 / 2 - 88, 0xFFFFFF, "Password: " + MYWERTTF.method305(field123) + (field146 == 1 & field468 % 40 < 20 ? "@yel@|" : ""), true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field298.method473(var10 - 73, var11 - 20);
				field466.method10(var10, "Login", true, var11 + 5, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field298.method473(var12 - 73, var11 - 20);
				field466.method10(var12, "Cancel", true, var11 + 5, 0xFFFFFF);
			}
		}

		if (field248 == 3) {
			field466.method10(var2 / 2, "Create a free account", true, var3 / 2 - 60, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field466.method10(var2 / 2, "To create a new account you need to", true, var13, 0xFFFFFF);
			var13 += 15;
			field466.method10(var2 / 2, "go back to the main RuneScape webpage", true, var13, 0xFFFFFF);
			var13 += 15;
			field466.method10(var2 / 2, "and choose the red 'create account'", true, var13, 0xFFFFFF);
			var13 += 15;
			field466.method10(var2 / 2, "button at the top right of that page.", true, var13, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field298.method473(var14 - 73, var15 - 20);
			field466.method10(var14, "Cancel", true, var15 + 5, 0xFFFFFF);
		}

		field356.method25(171, field1079, 202);

		if (field509) {
			field509 = false;
			field354.method25(0, field1079, 128);
			field355.method25(371, field1079, 202);
			field359.method25(265, field1079, 0);
			field360.method25(265, field1079, 562);
			field361.method25(171, field1079, 128);
			field362.method25(171, field1079, 562);
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.c(B)V")
	public final void method90() {
		field552 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field521[var1] = -1;
			for (int var2 = 0; var2 < PTKBILNJ.field1063; var2++) {
				if (!PTKBILNJ.field1064[var2].field1070 && PTKBILNJ.field1064[var2].field1065 == var1 + (field510 ? 0 : 7)) {
					field521[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method91() {
		field297 = new SFAIBATY(field228, "titlebox", 0);
		field298 = new SFAIBATY(field228, "titlebutton", 0);
		field330 = new SFAIBATY[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field330[var2] = new SFAIBATY(field228, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field330[var3] = new SFAIBATY(field228, "runes", (var3 & 0x3) + 12);
			}
		}

		field511 = new TTFRDWZK(128, 265);
		field512 = new TTFRDWZK(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field511.field1302[var4] = field357.field45[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field512.field1302[var5] = field358.field45[var5];
		}

		field428 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field428[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field428[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field428[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field428[var9 + 192] = 0xFFFFFF;
		}

		field429 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field429[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field429[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field429[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field429[var13 + 192] = 0xFFFFFF;
		}

		field430 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field430[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field430[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field430[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field430[var17 + 192] = 0xFFFFFF;
		}

		field427 = new int[256];
		field205 = new int[32768];
		field206 = new int[32768];
		method96(null);
		field306 = new int[32768];
		field307 = new int[32768];
		method138("Connecting to fileserver", 10);

		if (!field437) {
			field193 = true;
			field437 = true;
			method135(this, 2);
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method92() {
		for (NTHYVEDA var1 = (NTHYVEDA) field187.method510(); var1 != null; var1 = (NTHYVEDA) field187.method512()) {
			if (var1.field963 == -1) {
				var1.field952 = 0;
				method77(var1);
			} else {
				var1.method254();
			}
		}
	}

	@ObfuscatedName("client.a(ZLSRUOAWPS;I)V")
	public final void method93(SRUOAWPS arg0, int arg1) {
		method94(arg0.field1271, arg1, arg0.field1270);
	}

	@ObfuscatedName("client.a(IIBI)V")
	public final void method94(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method57(field540, arg2, arg0) - arg1;
			arg2 -= field289;
			var4 -= field290;
			arg0 -= field291;
			int var5 = PSGMMDJS.field1059[field292];
			int var6 = PSGMMDJS.field1060[field292];
			int var7 = PSGMMDJS.field1059[field293];
			int var8 = PSGMMDJS.field1060[field293];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field506 = (var9 << 9) / arg0 + YVYOADIW.field1481;
				field507 = (var11 << 9) / arg0 + YVYOADIW.field1482;
			} else {
				field506 = -1;
				field507 = -1;
			}
		} else {
			field506 = -1;
			field507 = -1;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method95() {
		if (field367 > 1) {
			field367--;
		}

		if (field315 > 0) {
			field315--;
		}

		for (int var1 = 0; var1 < 5 && method106(); var1++) {
		}

		if (field162) {
			synchronized (field281.field1301) {
				if (!field481) {
					field281.field1297 = 0;
				} else if (field1093 != 0 || field281.field1297 >= 40) {
					field493.method319(70);
					field493.method320(0);
					int var3 = field493.field971;
					int var4 = 0;
					for (int var5 = 0; var5 < field281.field1297 && var3 - field493.field971 < 240; var5++) {
						var4++;
						int var6 = field281.field1300[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field281.field1296[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field281.field1300[var5] == -1 && field281.field1296[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field116 != var7 || field117 != var6) {
							int var9 = var7 - field116;
							field116 = var7;
							int var10 = var6 - field117;
							field117 = var6;

							if (field517 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field493.method321((field517 << 12) + (var9 << 6) + var10);
								field517 = 0;
							} else if (field517 < 8) {
								field493.method323((field517 << 19) + var8 + 0x800000);
								field517 = 0;
							} else {
								field493.method324((field517 << 19) + var8 - 0x40000000);
								field517 = 0;
							}
						} else if (field517 < 2047) {
							field517++;
						}
					}

					field493.method329(field493.field971 - var3);

					if (var4 >= field281.field1297) {
						field281.field1297 = 0;
					} else {
						field281.field1297 -= var4;
						for (int var11 = 0; var11 < field281.field1297; var11++) {
							field281.field1296[var11] = field281.field1296[var4 + var11];
							field281.field1300[var11] = field281.field1300[var4 + var11];
						}
					}
				}
			}

			if (field1093 != 0) {
				long var12 = (field1096 - field269) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field269 = field1096;
				int var14 = field1095;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1094;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1093 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field493.method319(114);
				field493.method363((var17 << 19) + (var18 << 20) + var16);
			}

			if (field444 > 0) {
				field444--;
			}

			if (field1097[1] == 1 || field1097[2] == 1 || field1097[3] == 1 || field1097[4] == 1) {
				field445 = true;
			}

			if (field445 && field444 <= 0) {
				field444 = 20;
				field445 = false;
				field493.method319(19);
				field493.method321(field320);
				field493.method321(field321);
			}

			if (field1084 && !field153) {
				field153 = true;
				field493.method319(217);
				field493.method320(1);
			}

			if (!field1084 && field153) {
				field153 = false;
				field493.method319(217);
				field493.method320(0);
			}

			method55();
			method165();
			method121();
			field313++;
			if (field313 > 750) {
				method146();
			}

			method128();
			method107();
			method142();
			field233++;

			if (field450 != 0) {
				field449 += 20;
				if (field449 >= 400) {
					field450 = 0;
				}
			}

			if (field457 != 0) {
				field454++;
				if (field454 >= 15) {
					if (field457 == 2) {
						field276 = true;
					}

					if (field457 == 3) {
						field270 = true;
					}

					field457 = 0;
				}
			}

			if (field410 != 0) {
				field299++;

				if (field1087 > field411 + 5 || field1087 < field411 - 5 || field1088 > field412 + 5 || field1088 < field412 - 5) {
					field185 = true;
				}

				if (field1086 == 0) {
					if (field410 == 2) {
						field276 = true;
					}

					if (field410 == 3) {
						field270 = true;
					}

					field410 = 0;

					if (field185 && field299 >= 5) {
						field398 = -1;
						method185();

						if (field408 == field398 && field409 != field397) {
							RRTTGXYM var19 = RRTTGXYM.method458(field408);
							byte var20 = 0;
							if (field486 == 1 && var19.field1178 == 206) {
								var20 = 1;
							}

							if (var19.field1187[field397] <= 0) {
								var20 = 0;
							}

							if (var19.field1144) {
								int var21 = field409;
								int var22 = field397;
								var19.field1187[var22] = var19.field1187[var21];
								var19.field1212[var22] = var19.field1212[var21];
								var19.field1187[var21] = -1;
								var19.field1212[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field409;
								int var24 = field397;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method461(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method461(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method461(field409, field397);
							}

							field493.method319(182);
							field493.method321(field408);
							field493.method355(field409);
							field493.method356(field397);
							field493.method346(var20);
						}
					} else if ((field526 == 1 || method70(field345 - 1)) && field345 > 2) {
						method176();
					} else if (field345 > 0) {
						method125(field345 - 1);
					}

					field454 = 10;
					field1093 = 0;
				}
			}

			if (WJVLISUF.field1391 != -1) {
				int var25 = WJVLISUF.field1391;
				int var26 = WJVLISUF.field1392;
				boolean var27 = method49(field288.field1237[0], field288.field1236[0], 0, 0, true, 0, 0, 0, 0, var25, var26);
				WJVLISUF.field1391 = -1;

				if (var27) {
					field447 = field1094;
					field448 = field1095;
					field450 = 1;
					field449 = 0;
				}
			}

			if (field1093 == 1 && field426 != null) {
				field426 = null;
				field270 = true;
				field1093 = 0;
			}

			method181();

			if (field223 == -1) {
				method189();
				method54();
				method50();
			}

			if (field1086 == 1 || field1093 == 1) {
				field222++;
			}

			if (field227 == 0 && field171 == 0 && field519 == 0) {
				if (field335 > 0) {
					field335--;
				}
			} else if (field335 < 100) {
				field335++;
				if (field335 == 100) {
					if (field227 != 0) {
						field270 = true;
					}

					if (field171 != 0) {
						field276 = true;
					}
				}
			}

			if (field130 == 2) {
				method53();
			}

			if (field130 == 2 && field121) {
				method192();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field186[var28]++;
			}

			method186();
			field1085++;
			if (field1085 > 4500) {
				field315 = 250;
				field1085 -= 500;
				field493.method319(186);
			}

			field504++;
			if (field504 > 500) {
				field504 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field203 += field204;
				}

				if ((var29 & 0x2) == 2) {
					field181 += field182;
				}

				if ((var29 & 0x4) == 4) {
					field208 += field209;
				}
			}

			if (field203 < -50) {
				field204 = 2;
			}

			if (field203 > 50) {
				field204 = -2;
			}

			if (field181 < -55) {
				field182 = 2;
			}

			if (field181 > 55) {
				field182 = -2;
			}

			if (field208 < -40) {
				field209 = 1;
			}

			if (field208 > 40) {
				field209 = -1;
			}

			field508++;
			if (field508 > 500) {
				field508 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field231 += field232;
				}

				if ((var30 & 0x2) == 2) {
					field278 += field279;
				}
			}

			if (field231 < -60) {
				field232 = 2;
			}

			if (field231 > 60) {
				field232 = -2;
			}

			if (field278 < -20) {
				field279 = 1;
			}

			if (field278 > 10) {
				field279 = -1;
			}

			field314++;
			if (field314 > 50) {
				field493.method319(30);
			}

			try {
				if (field255 != null && field493.field971 > 0) {
					field255.method229(0, field493.field970, field493.field971);
					field493.field971 = 0;
					field314 = 0;
				}
			} catch (IOException var32) {
				method146();
			} catch (Exception var33) {
				method123();
			}
		}
	}

	@ObfuscatedName("client.a(LSFAIBATY;I)V")
	public final void method96(SFAIBATY arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field205.length; var3++) {
			field205[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field205[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field206[var9] = (field205[var9 - 1] + field205[var9 + 1] + field205[var9 - 128] + field205[var9 + 128]) / 4;
				}
			}

			int[] var10 = field205;
			field205 = field206;
			field206 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1217; var12++) {
				for (int var13 = 0; var13 < arg0.field1216; var13++) {
					if (arg0.field1214[var11++] != 0) {
						int var14 = var13 + arg0.field1218 + 16;
						int var15 = var12 + arg0.field1219 + 16;
						int var16 = (var15 << 7) + var14;
						field205[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method97(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.b(III)V")
	public final void method98(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field192[var4] != null) {
				int var5 = field190[var4];
				int var6 = field496 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field191[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field479 == 0 || field479 == 1 && method64(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field288.field1105)) {
						if (field438 >= 1) {
							field333[field345] = "Report abuse @whi@" + var7;
							field529[field345] = 556;
							field345++;
						}

						field333[field345] = "Add ignore @whi@" + var7;
						field529[field345] = 913;
						field345++;
						field333[field345] = "Add friend @whi@" + var7;
						field529[field345] = 695;
						field345++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field257 == 0 && (var5 == 7 || field518 == 0 || field518 == 1 && method64(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field438 >= 1) {
							field333[field345] = "Report abuse @whi@" + var7;
							field529[field345] = 556;
							field345++;
						}

						field333[field345] = "Add ignore @whi@" + var7;
						field529[field345] = 913;
						field345++;
						field333[field345] = "Add friend @whi@" + var7;
						field529[field345] = 695;
						field345++;
					}

					var3++;
				}

				if (var5 == 4 && (field365 == 0 || field365 == 1 && method64(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field333[field345] = "Accept trade @whi@" + var7;
						field529[field345] = 117;
						field345++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field257 == 0 && field518 < 2) {
					var3++;
				}

				if (var5 == 8 && (field365 == 0 || field365 == 1 && method64(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field333[field345] = "Accept challenge @whi@" + var7;
						field529[field345] = 264;
						field345++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method99() {
		if (field248 == 0) {
			int var1 = field1077 / 2 - 80;
			int var2 = field1078 / 2 + 20;
			var2 += 20;
			if (field1093 == 1 && field1094 >= var1 - 75 && field1094 <= var1 + 75 && field1095 >= var2 - 20 && field1095 <= var2 + 20) {
				field248 = 3;
				field146 = 0;
			}

			int var3 = field1077 / 2 + 80;
			if (field1093 == 1 && field1094 >= var3 - 75 && field1094 <= var3 + 75 && field1095 >= var2 - 20 && field1095 <= var2 + 20) {
				field250 = "";
				field251 = "Enter your username & password.";
				field248 = 2;
				field146 = 0;
			}
		} else if (field248 == 2) {
			int var4 = field1078 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1093 == 1 && field1095 >= var4 - 15 && field1095 < var4) {
				field146 = 0;
			}

			var4 += 15;
			if (field1093 == 1 && field1095 >= var4 - 15 && field1095 < var4) {
				field146 = 1;
			}

			var4 += 15;
			int var5 = field1077 / 2 - 80;
			int var6 = field1078 / 2 + 50;
			var6 += 20;
			if (field1093 == 1 && field1094 >= var5 - 75 && field1094 <= var5 + 75 && field1095 >= var6 - 20 && field1095 <= var6 + 20) {
				field195 = 0;
				method120(field122, field123, false);

				if (field162) {
					return;
				}
			}

			int var7 = field1077 / 2 + 80;
			if (field1093 == 1 && field1094 >= var7 - 75 && field1094 <= var7 + 75 && field1095 >= var6 - 20 && field1095 <= var6 + 20) {
				field248 = 0;
				field122 = "";
				field123 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method446();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field502.length(); var10++) {
					if (var8 == field502.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field146 == 0) {
					if (var8 == 8 && field122.length() > 0) {
						field122 = field122.substring(0, field122.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field146 = 1;
					}

					if (var9) {
						field122 = field122 + (char) var8;
					}

					if (field122.length() > 12) {
						field122 = field122.substring(0, 12);
					}
				} else if (field146 == 1) {
					if (var8 == 8 && field123.length() > 0) {
						field123 = field123.substring(0, field123.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field146 = 0;
					}

					if (var9) {
						field123 = field123 + (char) var8;
					}

					if (field123.length() > 20) {
						field123 = field123.substring(0, 20);
					}
				}
			}
		} else if (field248 == 3) {
			int var11 = field1077 / 2;
			int var12 = field1078 / 2 + 50;
			var12 += 20;
			if (field1093 == 1 && field1094 >= var11 - 75 && field1094 <= var11 + 75 && field1095 >= var12 - 20 && field1095 <= var12 + 20) {
				field248 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LRRTTGXYM;II)I")
	public final int method100(RRTTGXYM arg0, int arg1) {
		if (arg0.field1172 == null || arg1 >= arg0.field1172.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1172[arg1];
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
					var8 = field119[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field198[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field169[var3[var5++]];
				}

				if (var7 == 4) {
					RRTTGXYM var10 = RRTTGXYM.method458(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HCJYZKIH.field751 && (!HCJYZKIH.method236(var11).field760 || field555)) {
						for (int var12 = 0; var12 < var10.field1187.length; var12++) {
							if (var11 + 1 == var10.field1187[var12]) {
								var8 += var10.field1212[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field165[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field217[field198[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field165[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field288.field1106;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < TXBKOMSP.field1309; var13++) {
						if (TXBKOMSP.field1311[var13]) {
							var8 += field198[var13];
						}
					}
				}

				if (var7 == 10) {
					RRTTGXYM var14 = RRTTGXYM.method458(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HCJYZKIH.field751 && (!HCJYZKIH.method236(var15).field760 || field555)) {
						for (int var16 = 0; var16 < var14.field1187.length; var16++) {
							if (var14.field1187[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field382;
				}

				if (var7 == 12) {
					var8 = field536;
				}

				if (var7 == 13) {
					int var17 = field165[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					BCUFZZFO var20 = BCUFZZFO.field27[var19];
					int var21 = var20.field29;
					int var22 = var20.field30;
					int var23 = var20.field31;
					int var24 = field178[var23 - var22];
					var8 = field165[var21] >> var22 & var24;
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
					var8 = (field288.field1270 >> 7) + field199;
				}

				if (var7 == 19) {
					var8 = (field288.field1271 >> 7) + field200;
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

	@ObfuscatedName("client.q(I)V")
	public static final void method101() {
		WJVLISUF.field1357 = false;
		YVYOADIW.field1476 = false;
		field556 = false;
		CDASFTJJ.field114 = false;
		LWJTLDAE.field897 = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method102() {
		field437 = false;
		while (field346) {
			field437 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field297 = null;
		field298 = null;
		field330 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field430 = null;
		field205 = null;
		field206 = null;
		field306 = null;
		field307 = null;
		field511 = null;
		field512 = null;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method103() {
		field493.method319(63);

		if (field459 != -1) {
			method194(field459);
			field459 = -1;
			field276 = true;
			field194 = false;
			field374 = true;
		}

		if (field296 != -1) {
			method194(field296);
			field296 = -1;
			field270 = true;
			field194 = false;
		}

		if (field223 != -1) {
			method194(field223);
			field223 = -1;
			field509 = true;
		}

		if (field480 != -1) {
			method194(field480);
			field480 = -1;
		}

		if (field329 != -1) {
			method194(field329);
			field329 = -1;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method104(boolean arg0) {
		if (field288.field1270 >> 7 == field483 && field288.field1271 >> 7 == field484) {
			field483 = 0;
		}

		int var2 = field402;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			QGDSNXKJ var4;
			int var5;
			if (arg0) {
				var4 = field288;
				var5 = field400 << 14;
			} else {
				var4 = field401[field403[var3]];
				var5 = field403[var3] << 14;
			}

			if (var4 != null && var4.method316()) {
				var4.field1109 = false;
				if ((field556 && field402 > 50 || field402 > 200) && !arg0 && var4.field1273 == var4.field1239) {
					var4.field1109 = true;
				}

				int var6 = var4.field1270 >> 7;
				int var7 = var4.field1271 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1121 == null || field468 < var4.field1101 || field468 >= var4.field1102) {
						if ((var4.field1270 & 0x7F) == 0x40 && (var4.field1271 & 0x7F) == 0x40) {
							if (field440[var6][var7] == field525) {
								continue;
							}

							field440[var6][var7] = field525;
						}

						var4.field1122 = method57(field540, var4.field1270, var4.field1271);
						field347.method534(var4.field1271, field540, var4.field1270, var4.field1277, var4, var4.field1122, 60, var4.field1272, var5);
					} else {
						var4.field1109 = false;
						var4.field1122 = method57(field540, var4.field1270, var4.field1271);
						field347.method535(var4.field1271, var5, var4, var4.field1122, var4.field1270, var4.field1112, var4.field1114, var4.field1113, 60, field540, var4.field1115, var4.field1272);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method105(int arg0) {
		int var2 = XESCWZPS.field1424[arg0].field1432;
		if (var2 != 0) {
			int var3 = field165[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					YVYOADIW.method593(0.9D);
				}

				if (var3 == 2) {
					YVYOADIW.method593(0.8D);
				}

				if (var3 == 3) {
					YVYOADIW.method593(0.7D);
				}

				if (var3 == 4) {
					YVYOADIW.method593(0.6D);
				}

				HCJYZKIH.field769.method521();
				field509 = true;
			}

			if (var2 == 3) {
				boolean var4 = field336;

				if (var3 == 0) {
					method79(0, field336);
					field336 = true;
				}

				if (var3 == 1) {
					method79(-400, field336);
					field336 = true;
				}

				if (var3 == 2) {
					method79(-800, field336);
					field336 = true;
				}

				if (var3 == 3) {
					method79(-1200, field336);
					field336 = true;
				}

				if (var3 == 4) {
					field336 = false;
				}

				if (field336 != var4 && !field556) {
					if (field336) {
						field253 = field308;
						field254 = true;
						field234.method265(2, field253);
					} else {
						method65();
					}

					field513 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field477 = true;
					method63(0);
				}

				if (var3 == 1) {
					field477 = true;
					method63(-400);
				}

				if (var3 == 2) {
					field477 = true;
					method63(-800);
				}

				if (var3 == 3) {
					field477 = true;
					method63(-1200);
				}

				if (var3 == 4) {
					field477 = false;
				}
			}

			if (var2 == 5) {
				field526 = var3;
			}

			if (var2 == 6) {
				field210 = var3;
			}

			if (var2 == 8) {
				field257 = var3;
				field270 = true;
			}

			if (var2 == 9) {
				field486 = var3;
			}
		}
	}

	@ObfuscatedName("client.r(I)Z")
	public final boolean method106() {
		if (field255 == null) {
			return false;
		}

		try {
			int var1 = field255.method227();
			if (var1 == 0) {
				return false;
			}

			if (field312 == -1) {
				field255.method228(field134.field970, 0, 1);
				field312 = field134.field970[0] & 0xFF;
				if (field285 != null) {
					field312 = field312 - field285.method276() & 0xFF;
				}

				field311 = NBCGAPWT.field944[field312];
				var1--;
			}

			if (field311 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field255.method228(field134.field970, 0, 1);
				field311 = field134.field970[0] & 0xFF;
				var1--;
			}

			if (field311 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field255.method228(field134.field970, 0, 2);
				field134.field971 = 0;
				field311 = field134.method332();
				var1 -= 2;
			}

			if (var1 < field311) {
				return false;
			}

			field134.field971 = 0;
			field255.method228(field134.field970, 0, field311);
			field313 = 0;
			field177 = field176;
			field176 = field175;
			field175 = field312;

			if (field312 == 116 || field312 == 154 || field312 == 88 || field312 == 33 || field312 == 243 || field312 == 224 || field312 == 7 || field312 == 145 || field312 == 205 || field312 == 140 || field312 == 20) {
				method129(field134, field312);
				field312 = -1;
				return true;
			}

			if (field312 == 22) {
				long var2 = field134.method336();
				int var4 = field134.method330();
				String var5 = MYWERTTF.method304(MYWERTTF.method301(var2));
				for (int var6 = 0; var6 < field137; var6++) {
					if (field261[var6] == var2) {
						if (field282[var6] != var4) {
							field282[var6] = var4;
							field276 = true;

							if (var4 > 0) {
								method191(5, "", var5 + " has logged in.");
							}

							if (var4 == 0) {
								method191(5, "", var5 + " has logged out.");
							}
						}

						var5 = null;
						break;
					}
				}

				if (var5 != null && field137 < 200) {
					field261[field137] = var2;
					field396[field137] = var5;
					field282[field137] = var4;
					field137++;
					field276 = true;
				}

				boolean var7 = false;
				while (!var7) {
					var7 = true;
					for (int var8 = 0; var8 < field137 - 1; var8++) {
						if (field282[var8] != field553 && field282[var8 + 1] == field553 || field282[var8] == 0 && field282[var8 + 1] != 0) {
							int var9 = field282[var8];
							field282[var8] = field282[var8 + 1];
							field282[var8 + 1] = var9;
							String var10 = field396[var8];
							field396[var8] = field396[var8 + 1];
							field396[var8 + 1] = var10;
							long var11 = field261[var8];
							field261[var8] = field261[var8 + 1];
							field261[var8 + 1] = var11;
							field276 = true;
							var7 = false;
						}
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 104) {
				field367 = field134.method359() * 30;
				field312 = -1;
				return true;
			}

			if (field312 == 99) {
				field479 = field134.method330();
				field518 = field134.method330();
				field365 = field134.method330();
				field522 = true;
				field270 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 79) {
				field276 = true;
				int var13 = field134.method335();
				int var14 = field134.method330();
				int var15 = field134.method351();
				field169[var14] = var13;
				field119[var14] = var15;
				field198[var14] = 1;
				for (int var16 = 0; var16 < 98; var16++) {
					if (var13 >= field217[var16]) {
						field198[var14] = var16 + 2;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 21) {
				field276 = true;
				int var17 = field134.method332();
				RRTTGXYM var18 = RRTTGXYM.method458(var17);
				int var19 = field134.method332();
				for (int var20 = 0; var20 < var19; var20++) {
					var18.field1187[var20] = field134.method357();
					int var21 = field134.method349();
					if (var21 == 255) {
						var21 = field134.method364();
					}

					var18.field1212[var20] = var21;
				}

				for (int var22 = var19; var22 < var18.field1187.length; var22++) {
					var18.field1187[var22] = 0;
					var18.field1212[var22] = 0;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 36) {
				if (field256 == 12) {
					field276 = true;
				}

				field536 = field134.method333();
				field312 = -1;
				return true;
			}

			if (field312 == 151) {
				int var23 = field134.method332();
				int var24 = field134.method358();
				int var25 = field134.method359();
				RRTTGXYM.method458(var25).field1207 = (var24 << 16) + var23;
				field312 = -1;
				return true;
			}

			if (field312 == 110) {
				field144 = field311 / 8;
				for (int var26 = 0; var26 < field144; var26++) {
					field180[var26] = field134.method336();
				}

				field312 = -1;
				return true;
			}

			if (field312 == 250) {
				field159 = field134.method330();
				if (field159 == 1) {
					field220 = field134.method332();
				}

				if (field159 >= 2 && field159 <= 6) {
					if (field159 == 2) {
						field244 = 64;
						field245 = 64;
					}

					if (field159 == 3) {
						field244 = 0;
						field245 = 64;
					}

					if (field159 == 4) {
						field244 = 128;
						field245 = 64;
					}

					if (field159 == 5) {
						field244 = 64;
						field245 = 0;
					}

					if (field159 == 6) {
						field244 = 64;
						field245 = 128;
					}

					field159 = 2;
					field241 = field134.method332();
					field242 = field134.method332();
					field243 = field134.method330();
				}

				if (field159 == 10) {
					field363 = field134.method332();
				}

				field312 = -1;
				return true;
			}

			if (field312 == 248) {
				field381 = field134.method332();
				field295 = field134.method349();
				field312 = -1;
				return true;
			}

			if (field312 == 173) {
				field145 = false;
				field218 = 2;
				field280 = "";
				field270 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 72) {
				int var27 = field134.method358();
				byte var28 = field134.method352();
				field344[var27] = var28;

				if (field165[var27] != var28) {
					field165[var27] = var28;
					method105(var27);
					field276 = true;

					if (field462 != -1) {
						field270 = true;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 50) {
				int var29 = field134.method332();
				method169(var29);

				if (field459 != -1) {
					method194(field459);
					field459 = -1;
					field276 = true;
					field374 = true;
				}

				if (field223 != -1) {
					method194(field223);
					field223 = -1;
					field509 = true;
				}

				if (field480 != -1) {
					method194(field480);
					field480 = -1;
				}

				if (field329 != -1) {
					method194(field329);
					field329 = -1;
				}

				if (field296 != var29) {
					method194(field296);
					field296 = var29;
				}

				field194 = false;
				field270 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 42) {
				field145 = false;
				field218 = 1;
				field280 = "";
				field270 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 9) {
				int var30 = field134.method358();
				if (var30 == 0xFFFF) {
					var30 = -1;
				}

				if (field308 != var30 && field336 && !field556 && field513 == 0) {
					field253 = var30;
					field254 = true;
					field234.method265(2, field253);
				}

				field308 = var30;
				field312 = -1;
				return true;
			}

			if (field312 == 190) {
				int var31 = field134.method362();
				int var32 = field134.method332();
				if (field336 && !field556) {
					field253 = var32;
					field254 = false;
					field234.method265(2, field253);
					field513 = var31;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 240) {
				for (int var33 = 0; var33 < field401.length; var33++) {
					if (field401[var33] != null) {
						field401[var33].field1245 = -1;
					}
				}

				for (int var34 = 0; var34 < field317.length; var34++) {
					if (field317[var34] != null) {
						field317[var34].field1245 = -1;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 160) {
				int var35 = field134.method357();
				int var36 = field134.method332();
				int var37 = var36 >> 10 & 0x1F;
				int var38 = var36 >> 5 & 0x1F;
				int var39 = var36 & 0x1F;
				RRTTGXYM.method458(var35).field1165 = (var39 << 3) + (var37 << 19) + (var38 << 11);
				field312 = -1;
				return true;
			}

			if (field312 == 24) {
				int var40 = field134.method360();
				if (var40 >= 0) {
					method169(var40);
				}

				if (field142 != var40) {
					method194(field142);
					field142 = var40;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 115) {
				int var41 = field134.method332();
				method169(var41);

				if (field296 != -1) {
					method194(field296);
					field296 = -1;
					field270 = true;
				}

				if (field223 != -1) {
					method194(field223);
					field223 = -1;
					field509 = true;
				}

				if (field480 != -1) {
					method194(field480);
					field480 = -1;
				}

				if (field329 != -1) {
					method194(field329);
					field329 = -1;
				}

				if (field459 != var41) {
					method194(field459);
					field459 = var41;
				}

				if (field218 != 0) {
					field218 = 0;
					field270 = true;
				}

				field276 = true;
				field374 = true;
				field194 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 27) {
				String var42 = field134.method337();
				int var43 = field134.method359();
				RRTTGXYM.method458(var43).field1205 = var42;

				if (field337[field256] == RRTTGXYM.method458(var43).field1152) {
					field276 = true;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 15) {
				int var44 = field134.method332();
				RRTTGXYM var45 = RRTTGXYM.method458(var44);
				for (int var46 = 0; var46 < var45.field1187.length; var46++) {
					var45.field1187[var46] = -1;
					var45.field1187[var46] = 0;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 17) {
				int var47 = field134.method349();
				int var48 = field134.method330();
				String var49 = field134.method337();
				if (var48 >= 1 && var48 <= 5) {
					if (var49.equalsIgnoreCase("null")) {
						var49 = null;
					}

					field514[var48 - 1] = var49;
					field515[var48 - 1] = var47 == 0;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 232) {
				if (field459 != -1) {
					method194(field459);
					field459 = -1;
					field276 = true;
					field374 = true;
				}

				if (field296 != -1) {
					method194(field296);
					field296 = -1;
					field270 = true;
				}

				if (field223 != -1) {
					method194(field223);
					field223 = -1;
					field509 = true;
				}

				if (field480 != -1) {
					method194(field480);
					field480 = -1;
				}

				if (field329 != -1) {
					method194(field329);
					field329 = -1;
				}

				if (field218 != 0) {
					field218 = 0;
					field270 = true;
				}

				field194 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 87) {
				field121 = true;
				field125 = field134.method330();
				field126 = field134.method330();
				field127 = field134.method332();
				field128 = field134.method330();
				field129 = field134.method330();
				if (field129 >= 100) {
					field289 = field125 * 128 + 64;
					field291 = field126 * 128 + 64;
					field290 = method57(field540, field289, field291) - field127;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 125) {
				method123();
				field312 = -1;
				return false;
			}

			if (field312 == 233) {
				int var50 = field134.method332();
				int var51 = field134.method332();
				RRTTGXYM.method458(var51).field1180 = 2;
				RRTTGXYM.method458(var51).field1181 = var50;
				field312 = -1;
				return true;
			}

			if (field312 == 19) {
				field147 = field134.method330();
				field148 = field134.method350();

				while (field134.field971 < field311) {
					int var52 = field134.method330();
					method129(field134, var52);
				}

				field312 = -1;
				return true;
			}

			if (field312 == 225) {
				field147 = field134.method351();
				field148 = field134.method349();
				field312 = -1;
				return true;
			}

			if (field312 == 251) {
				field256 = field134.method349();
				field276 = true;
				field374 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 0) {
				field494 = field134.method357();
				field134.method332();
				field366 = field134.method358();
				field134.method359();
				field150 = field134.method357();
				field500 = field134.method358();
				field458 = field134.method332();
				field246 = field134.method359();
				field283 = field134.method332();
				field328 = field134.method365();
				field413 = field134.method351();
				signlink.dnslookup(MYWERTTF.method303(field328));
				field312 = -1;
				return true;
			}

			if (field312 == 71) {
				long var53 = field134.method336();
				int var55 = field134.method335();
				int var56 = field134.method330();
				boolean var57 = false;
				for (int var58 = 0; var58 < 100; var58++) {
					if (field173[var58] == var55) {
						var57 = true;
						break;
					}
				}

				if (var56 <= 1) {
					for (int var59 = 0; var59 < field144; var59++) {
						if (field180[var59] == var53) {
							var57 = true;
							break;
						}
					}
				}

				if (!var57 && field463 == 0) {
					try {
						field173[field546] = var55;
						field546 = (field546 + 1) % 100;
						String var60 = OCQVXKDE.method313(field311 - 13, field134);
						if (var56 != 3) {
							var60 = PSDABLUV.method378(var60);
						}

						if (var56 == 2 || var56 == 3) {
							method191(7, "@cr2@" + MYWERTTF.method304(MYWERTTF.method301(var53)), var60);
						} else if (var56 == 1) {
							method191(7, "@cr1@" + MYWERTTF.method304(MYWERTTF.method301(var53)), var60);
						} else {
							method191(3, MYWERTTF.method304(MYWERTTF.method301(var53)), var60);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 97) {
				String var62 = field134.method337();
				if (var62.endsWith(":tradereq:")) {
					String var63 = var62.substring(0, var62.indexOf(":"));
					long var64 = MYWERTTF.method300(var63);
					boolean var66 = false;
					for (int var67 = 0; var67 < field144; var67++) {
						if (field180[var67] == var64) {
							var66 = true;
							break;
						}
					}

					if (!var66 && field463 == 0) {
						method191(4, var63, "wishes to trade with you.");
					}
				} else if (var62.endsWith(":duelreq:")) {
					String var68 = var62.substring(0, var62.indexOf(":"));
					long var69 = MYWERTTF.method300(var68);
					boolean var71 = false;
					for (int var72 = 0; var72 < field144; var72++) {
						if (field180[var72] == var69) {
							var71 = true;
							break;
						}
					}

					if (!var71 && field463 == 0) {
						method191(8, var68, "wishes to duel with you.");
					}
				} else if (var62.endsWith(":chalreq:")) {
					String var73 = var62.substring(0, var62.indexOf(":"));
					long var74 = MYWERTTF.method300(var73);
					boolean var76 = false;
					for (int var77 = 0; var77 < field144; var77++) {
						if (field180[var77] == var74) {
							var76 = true;
							break;
						}
					}

					if (!var76 && field463 == 0) {
						String var78 = var62.substring(var62.indexOf(":") + 1, var62.length() - 9);
						method191(8, var73, var78);
					}
				} else {
					method191(0, "", var62);
				}

				field312 = -1;
				return true;
			}

			if (field312 == 186) {
				field121 = true;
				field470 = field134.method330();
				field471 = field134.method330();
				field472 = field134.method332();
				field473 = field134.method330();
				field474 = field134.method330();
				if (field474 >= 100) {
					int var79 = field470 * 128 + 64;
					int var80 = field471 * 128 + 64;
					int var81 = method57(field540, var79, var80) - field472;
					int var82 = var79 - field289;
					int var83 = var81 - field290;
					int var84 = var80 - field291;
					int var85 = (int) Math.sqrt(var82 * var82 + var84 * var84);
					field292 = (int) (Math.atan2(var83, var85) * 325.949D) & 0x7FF;
					field293 = (int) (Math.atan2(var82, var84) * -325.949D) & 0x7FF;

					if (field292 < 128) {
						field292 = 128;
					}

					if (field292 > 383) {
						field292 = 383;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 8) {
				int var86 = field134.method358();
				int var87 = field134.method333();
				int var88 = field134.method361();
				RRTTGXYM var89 = RRTTGXYM.method458(var86);
				var89.field1168 = var87;
				var89.field1188 = var88;
				field312 = -1;
				return true;
			}

			if (field312 == 223) {
				for (int var90 = 0; var90 < field165.length; var90++) {
					if (field344[var90] != field165[var90]) {
						field165[var90] = field344[var90];
						method105(var90);
						field276 = true;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 180) {
				method140(field134, field311);
				field207 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 105) {
				field276 = true;
				int var91 = field134.method332();
				RRTTGXYM var92 = RRTTGXYM.method458(var91);
				while (field134.field971 < field311) {
					int var93 = field134.method344();
					int var94 = field134.method332();
					int var95 = field134.method330();
					if (var95 == 255) {
						var95 = field134.method335();
					}

					if (var93 >= 0 && var93 < var92.field1187.length) {
						var92.field1187[var93] = var94;
						var92.field1212[var93] = var95;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 182) {
				int var96 = field134.method357();
				int var97 = field134.method366();
				field344[var96] = var97;

				if (field165[var96] != var97) {
					field165[var96] = var97;
					method105(var96);
					field276 = true;

					if (field462 != -1) {
						field270 = true;
					}
				}

				field312 = -1;
				return true;
			}

			if (field312 == 162) {
				int var98 = field134.method332();
				int var99 = field134.method330();
				int var100 = field134.method332();
				if (field477 && !field556 && field149 < 50) {
					field174[field149] = var98;
					field475[field149] = var99;
					field524[field149] = NGSVJLXG.field946[var98] + var100;
					field149++;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 2) {
				field469 = field134.method330();
				field312 = -1;
				return true;
			}

			if (field312 == 189) {
				field483 = 0;
				field312 = -1;
				return true;
			}

			if (field312 == 139) {
				int var101 = field134.method358();
				int var102 = field134.method358();
				int var103 = field134.method359();
				if (var101 == 0xFFFF) {
					RRTTGXYM.method458(var103).field1180 = 0;
					field312 = -1;
					return true;
				}

				HCJYZKIH var104 = HCJYZKIH.method236(var101);
				RRTTGXYM.method458(var103).field1180 = 4;
				RRTTGXYM.method458(var103).field1181 = var101;
				RRTTGXYM.method458(var103).field1174 = var104.field771;
				RRTTGXYM.method458(var103).field1175 = var104.field762;
				RRTTGXYM.method458(var103).field1173 = var104.field755 * 100 / var102;
				field312 = -1;
				return true;
			}

			if (field312 == 188) {
				int var105 = field134.method330();
				int var106 = field134.method330();
				int var107 = field134.method330();
				int var108 = field134.method330();
				field135[var105] = true;
				field236[var105] = var106;
				field183[var105] = var107;
				field460[var105] = var108;
				field186[var105] = 0;
				field312 = -1;
				return true;
			}

			if (field312 == 18) {
				if (field256 == 12) {
					field276 = true;
				}

				field382 = field134.method330();
				field312 = -1;
				return true;
			}

			if (field312 == 93) {
				int var109 = field134.method357();
				int var110 = field134.method359();
				int var111 = field134.method358();
				int var112 = field134.method358();
				RRTTGXYM.method458(var112).field1174 = var109;
				RRTTGXYM.method458(var112).field1175 = var111;
				RRTTGXYM.method458(var112).field1173 = var110;
				field312 = -1;
				return true;
			}

			if (field312 == 6 || field312 == 150) {
				int var113 = field151;
				int var114 = field152;
				if (field312 == 6) {
					var114 = field134.method358();
					var113 = field134.method332();
					field184 = false;
				}

				if (field312 == 150) {
					var113 = field134.method332();
					var114 = field134.method332();
					field134.method340();

					for (int var115 = 0; var115 < 4; var115++) {
						for (int var116 = 0; var116 < 13; var116++) {
							for (int var117 = 0; var117 < 13; var117++) {
								int var118 = field134.method341(1);
								if (var118 == 1) {
									field164[var115][var116][var117] = field134.method341(26);
								} else {
									field164[var115][var116][var117] = -1;
								}
							}
						}
					}

					field134.method342();
					field184 = true;
				}

				if (field151 == var113 && field152 == var114 && field130 == 2) {
					field312 = -1;
					return true;
				}

				field151 = var113;
				field152 = var114;
				field199 = (field151 - 6) * 8;
				field200 = (field152 - 6) * 8;
				field258 = false;
				if ((field151 / 8 == 48 || field151 / 8 == 49) && field152 / 8 == 48) {
					field258 = true;
				}

				if (field151 / 8 == 48 && field152 / 8 == 148) {
					field258 = true;
				}

				field130 = 1;
				field238 = System.currentTimeMillis();
				method124("Loading - please wait.", null);

				if (field312 == 6) {
					int var119 = 0;
					for (int var120 = (field151 - 6) / 8; var120 <= (field151 + 6) / 8; var120++) {
						for (int var121 = (field152 - 6) / 8; var121 <= (field152 + 6) / 8; var121++) {
							var119++;
						}
					}

					field196 = new byte[var119][];
					field516 = new byte[var119][];
					field537 = new int[var119];
					field538 = new int[var119];
					field539 = new int[var119];
					int var122 = 0;
					for (int var123 = (field151 - 6) / 8; var123 <= (field151 + 6) / 8; var123++) {
						for (int var124 = (field152 - 6) / 8; var124 <= (field152 + 6) / 8; var124++) {
							field537[var122] = (var123 << 8) + var124;

							if (field258 && (var124 == 49 || var124 == 149 || var124 == 147 || var123 == 50 || var123 == 49 && var124 == 47)) {
								field538[var122] = -1;
								field539[var122] = -1;
								var122++;
							} else {
								int var125 = field538[var122] = field234.method257(var123, 0, var124);
								if (var125 != -1) {
									field234.method265(3, var125);
								}

								int var126 = field539[var122] = field234.method257(var123, 1, var124);
								if (var126 != -1) {
									field234.method265(3, var126);
								}

								var122++;
							}
						}
					}
				}

				if (field312 == 150) {
					int var127 = 0;
					int[] var128 = new int[676];
					for (int var129 = 0; var129 < 4; var129++) {
						for (int var130 = 0; var130 < 13; var130++) {
							for (int var131 = 0; var131 < 13; var131++) {
								int var132 = field164[var129][var130][var131];
								if (var132 != -1) {
									int var133 = var132 >> 14 & 0x3FF;
									int var134 = var132 >> 3 & 0x7FF;
									int var135 = (var133 / 8 << 8) + var134 / 8;
									for (int var136 = 0; var136 < var127; var136++) {
										if (var128[var136] == var135) {
											var135 = -1;
											break;
										}
									}

									if (var135 != -1) {
										var128[var127++] = var135;
									}
								}
							}
						}
					}

					field196 = new byte[var127][];
					field516 = new byte[var127][];
					field537 = new int[var127];
					field538 = new int[var127];
					field539 = new int[var127];
					for (int var137 = 0; var137 < var127; var137++) {
						int var138 = field537[var137] = var128[var137];
						int var139 = var138 >> 8 & 0xFF;
						int var140 = var138 & 0xFF;
						int var141 = field538[var137] = field234.method257(var139, 0, var140);
						if (var141 != -1) {
							field234.method265(3, var141);
						}

						int var142 = field539[var137] = field234.method257(var139, 1, var140);
						if (var142 != -1) {
							field234.method265(3, var142);
						}
					}
				}

				int var143 = field199 - field201;
				int var144 = field200 - field202;
				field201 = field199;
				field202 = field200;

				for (int var145 = 0; var145 < 16384; var145++) {
					PDAYFSBN var146 = field317[var145];
					if (var146 != null) {
						for (int var147 = 0; var147 < 10; var147++) {
							var146.field1236[var147] -= var143;
							var146.field1237[var147] -= var144;
						}

						var146.field1270 -= var143 * 128;
						var146.field1271 -= var144 * 128;
					}
				}

				for (int var148 = 0; var148 < field399; var148++) {
					QGDSNXKJ var149 = field401[var148];
					if (var149 != null) {
						for (int var150 = 0; var150 < 10; var150++) {
							var149.field1236[var150] -= var143;
							var149.field1237[var150] -= var144;
						}

						var149.field1270 -= var143 * 128;
						var149.field1271 -= var144 * 128;
					}
				}

				field207 = true;
				byte var151 = 0;
				byte var152 = 104;
				byte var153 = 1;
				if (var143 < 0) {
					var151 = 103;
					var152 = -1;
					var153 = -1;
				}

				byte var154 = 0;
				byte var155 = 104;
				byte var156 = 1;
				if (var144 < 0) {
					var154 = 103;
					var155 = -1;
					var156 = -1;
				}

				for (int var157 = var151; var157 != var152; var157 += var153) {
					for (int var158 = var154; var158 != var155; var158 += var156) {
						int var159 = var143 + var157;
						int var160 = var144 + var158;
						for (int var161 = 0; var161 < 4; var161++) {
							if (var159 >= 0 && var160 >= 0 && var159 < 104 && var160 < 104) {
								field287[var161][var157][var158] = field287[var161][var159][var160];
							} else {
								field287[var161][var157][var158] = null;
							}
						}
					}
				}

				for (NTHYVEDA var162 = (NTHYVEDA) field187.method510(); var162 != null; var162 = (NTHYVEDA) field187.method512()) {
					var162.field961 -= var143;
					var162.field962 -= var144;
					if (var162.field961 < 0 || var162.field962 < 0 || var162.field961 >= 104 || var162.field962 >= 104) {
						var162.method254();
					}
				}

				if (field483 != 0) {
					field483 -= var143;
					field484 -= var144;
				}

				field121 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 134) {
				field141 = field134.method330();
				if (field256 == field141) {
					if (field141 == 3) {
						field256 = 1;
					} else {
						field256 = 3;
					}

					field276 = true;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 197) {
				int var163 = field134.method332();
				method169(var163);

				if (field459 != -1) {
					method194(field459);
					field459 = -1;
					field276 = true;
					field374 = true;
				}

				if (field296 != -1) {
					method194(field296);
					field296 = -1;
					field270 = true;
				}

				if (field223 != -1) {
					method194(field223);
					field223 = -1;
					field509 = true;
				}

				if (field480 != -1) {
					method194(field480);
					field480 = -1;
				}

				if (field329 != var163) {
					method194(field329);
					field329 = var163;
				}

				if (field218 != 0) {
					field218 = 0;
					field270 = true;
				}

				field194 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 127) {
				field121 = false;

				for (int var164 = 0; var164 < 5; var164++) {
					field135[var164] = false;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 177) {
				field138 = field134.method330();
				field276 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 1) {
				field332 = field134.method330();
				field312 = -1;
				return true;
			}

			if (field312 == 166) {
				int var165 = field134.method332();
				RRTTGXYM.method458(var165).field1180 = 3;

				if (field288.field1117 == null) {
					RRTTGXYM.method458(var165).field1181 = (field288.field1125[11] << 5) + (field288.field1125[8] << 10) + (field288.field1125[0] << 15) + (field288.field1108[0] << 25) + (field288.field1108[4] << 20) + field288.field1125[1];
				} else {
					RRTTGXYM.method458(var165).field1181 = (int) (field288.field1117.field1440 + 0x12345678L);
				}

				field312 = -1;
				return true;
			}

			if (field312 == 74) {
				int var166 = field134.method359();
				int var167 = field134.method332();
				method169(var167);

				if (var166 != -1) {
					method169(var166);
				}

				if (field329 != -1) {
					method194(field329);
					field329 = -1;
				}

				if (field459 != -1) {
					method194(field459);
					field459 = -1;
				}

				if (field296 != -1) {
					method194(field296);
					field296 = -1;
				}

				if (field223 != var167) {
					method194(field223);
					field223 = var167;
				}

				if (field480 != var167) {
					method194(field480);
					field480 = var166;
				}

				field218 = 0;
				field194 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 155) {
				int var168 = field134.method358();
				int var169 = field134.method359();
				RRTTGXYM.method458(var169).field1180 = 1;
				RRTTGXYM.method458(var169).field1181 = var168;
				field312 = -1;
				return true;
			}

			if (field312 == 201) {
				int var170 = field134.method333();
				if (field462 != var170) {
					method194(field462);
					field462 = var170;
				}

				field270 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 12) {
				method82(field134, field311);
				field312 = -1;
				return true;
			}

			if (field312 == 81) {
				int var171 = field134.method358();
				int var172 = field134.method358();

				if (field296 != -1) {
					method194(field296);
					field296 = -1;
					field270 = true;
				}

				if (field223 != -1) {
					method194(field223);
					field223 = -1;
					field509 = true;
				}

				if (field480 != -1) {
					method194(field480);
					field480 = -1;
				}

				if (field329 != var172) {
					method194(field329);
					field329 = var172;
				}

				if (field459 != var171) {
					method194(field459);
					field459 = var171;
				}

				if (field218 != 0) {
					field218 = 0;
					field270 = true;
				}

				field276 = true;
				field374 = true;
				field194 = false;
				field312 = -1;
				return true;
			}

			if (field312 == 103) {
				int var173 = field134.method357();
				int var174 = field134.method349();

				if (var173 == 0xFFFF) {
					var173 = -1;
				}

				if (field337[var174] != var173) {
					method194(field337[var174]);
					field337[var174] = var173;
				}

				field276 = true;
				field374 = true;
				field312 = -1;
				return true;
			}

			if (field312 == 174) {
				int var175 = field134.method332();
				int var176 = field134.method357();
				RRTTGXYM var177 = RRTTGXYM.method458(var176);
				if (var177 != null && var177.field1183 == 0) {
					if (var175 < 0) {
						var175 = 0;
					}

					if (var175 > var177.field1190 - var177.field1161) {
						var175 = var177.field1190 - var177.field1161;
					}

					var177.field1143 = var175;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 247) {
				int var178 = field134.method332();
				int var179 = field134.method333();
				RRTTGXYM var180 = RRTTGXYM.method458(var178);
				if (var180.field1149 != var179 || var179 == -1) {
					var180.field1149 = var179;
					var180.field1197 = 0;
					var180.field1148 = 0;
				}

				field312 = -1;
				return true;
			}

			if (field312 == 109) {
				boolean var181 = field134.method349() == 1;
				int var182 = field134.method358();
				RRTTGXYM.method458(var182).field1186 = var181;
				field312 = -1;
				return true;
			}

			if (field312 == 220) {
				field148 = field134.method351();
				field147 = field134.method351();
				for (int var183 = field147; var183 < field147 + 8; var183++) {
					for (int var184 = field148; var184 < field148 + 8; var184++) {
						if (field287[field540][var183][var184] != null) {
							field287[field540][var183][var184] = null;
							method171(var183, var184);
						}
					}
				}

				for (NTHYVEDA var185 = (NTHYVEDA) field187.method510(); var185 != null; var185 = (NTHYVEDA) field187.method512()) {
					if (var185.field961 >= field147 && var185.field961 < field147 + 8 && var185.field962 >= field148 && var185.field962 < field148 + 8 && field540 == var185.field959) {
						var185.field963 = 0;
					}
				}

				field312 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field312 + "," + field311 + " - " + field176 + "," + field177);
			method123();
		} catch (IOException var190) {
			method146();
		} catch (Exception var191) {
			String var187 = "T2 - " + field312 + "," + field176 + "," + field177 + " - " + field311 + "," + (field288.field1236[0] + field199) + "," + (field288.field1237[0] + field200) + " - ";
			for (int var188 = 0; var188 < field311 && var188 < 50; var188++) {
				var187 = var187 + field134.field970[var188] + ",";
			}

			signlink.reporterror(var187);
			method123();
		}

		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method107() {
		for (int var1 = 0; var1 < field318; var1++) {
			int var2 = field319[var1];
			PDAYFSBN var3 = field317[var2];
			if (var3 != null) {
				method108(var3.field969.field1475, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILSRUOAWPS;)V")
	public final void method108(int arg0, SRUOAWPS arg1) {
		if (arg1.field1270 < 128 || arg1.field1271 < 128 || arg1.field1270 >= 13184 || arg1.field1271 >= 13184) {
			arg1.field1245 = -1;
			arg1.field1281 = -1;
			arg1.field1258 = 0;
			arg1.field1259 = 0;
			arg1.field1270 = arg1.field1236[0] * 128 + arg1.field1243 * 64;
			arg1.field1271 = arg1.field1237[0] * 128 + arg1.field1243 * 64;
			arg1.method479();
		}

		if (field288 == arg1 && (arg1.field1270 < 1536 || arg1.field1271 < 1536 || arg1.field1270 >= 11776 || arg1.field1271 >= 11776)) {
			arg1.field1245 = -1;
			arg1.field1281 = -1;
			arg1.field1258 = 0;
			arg1.field1259 = 0;
			arg1.field1270 = arg1.field1236[0] * 128 + arg1.field1243 * 64;
			arg1.field1271 = arg1.field1237[0] * 128 + arg1.field1243 * 64;
			arg1.method479();
		}

		if (arg1.field1258 > field468) {
			method109(arg1);
		} else if (arg1.field1259 >= field468) {
			method110(arg1);
		} else {
			method111(arg1);
		}

		method112(arg1);
		method113(arg1);
	}

	@ObfuscatedName("client.a(ILSRUOAWPS;)V")
	public final void method109(SRUOAWPS arg0) {
		int var2 = arg0.field1258 - field468;
		int var3 = arg0.field1254 * 128 + arg0.field1243 * 64;
		int var4 = arg0.field1256 * 128 + arg0.field1243 * 64;
		arg0.field1270 += (var3 - arg0.field1270) / var2;
		arg0.field1271 += (var4 - arg0.field1271) / var2;
		arg0.field1241 = 0;

		if (arg0.field1260 == 0) {
			arg0.field1280 = 1024;
		}

		if (arg0.field1260 == 1) {
			arg0.field1280 = 1536;
		}

		if (arg0.field1260 == 2) {
			arg0.field1280 = 0;
		}

		if (arg0.field1260 == 3) {
			arg0.field1280 = 512;
		}
	}

	@ObfuscatedName("client.a(LSRUOAWPS;Z)V")
	public final void method110(SRUOAWPS arg0) {
		if (field468 == arg0.field1259 || arg0.field1245 == -1 || arg0.field1248 != 0 || arg0.field1247 + 1 > DWUJPTWU.field586[arg0.field1245].method215(arg0.field1246)) {
			int var2 = arg0.field1259 - arg0.field1258;
			int var3 = field468 - arg0.field1258;
			int var4 = arg0.field1254 * 128 + arg0.field1243 * 64;
			int var5 = arg0.field1256 * 128 + arg0.field1243 * 64;
			int var6 = arg0.field1255 * 128 + arg0.field1243 * 64;
			int var7 = arg0.field1257 * 128 + arg0.field1243 * 64;
			arg0.field1270 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1271 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1241 = 0;

		if (arg0.field1260 == 0) {
			arg0.field1280 = 1024;
		}

		if (arg0.field1260 == 1) {
			arg0.field1280 = 1536;
		}

		if (arg0.field1260 == 2) {
			arg0.field1280 = 0;
		}

		if (arg0.field1260 == 3) {
			arg0.field1280 = 512;
		}

		arg0.field1272 = arg0.field1280;
	}

	@ObfuscatedName("client.b(ILSRUOAWPS;)V")
	public final void method111(SRUOAWPS arg0) {
		arg0.field1273 = arg0.field1239;
		if (arg0.field1253 == 0) {
			arg0.field1241 = 0;
		} else {
			if (arg0.field1245 != -1 && arg0.field1248 == 0) {
				DWUJPTWU var2 = DWUJPTWU.field586[arg0.field1245];
				if (arg0.field1250 > 0 && var2.field598 == 0) {
					arg0.field1241++;
					return;
				}

				if (arg0.field1250 <= 0 && var2.field599 == 0) {
					arg0.field1241++;
					return;
				}
			}

			int var3 = arg0.field1270;
			int var4 = arg0.field1271;
			int var5 = arg0.field1236[arg0.field1253 - 1] * 128 + arg0.field1243 * 64;
			int var6 = arg0.field1237[arg0.field1253 - 1] * 128 + arg0.field1243 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1280 = 1280;
					} else if (var4 > var6) {
						arg0.field1280 = 1792;
					} else {
						arg0.field1280 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1280 = 768;
					} else if (var4 > var6) {
						arg0.field1280 = 256;
					} else {
						arg0.field1280 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1280 = 1024;
				} else {
					arg0.field1280 = 0;
				}

				int var7 = arg0.field1280 - arg0.field1272 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1288;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1287;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1290;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1289;
				}

				if (var8 == -1) {
					var8 = arg0.field1287;
				}

				arg0.field1273 = var8;
				int var9 = 4;
				if (arg0.field1280 != arg0.field1272 && arg0.field1242 == -1 && arg0.field1269 != 0) {
					var9 = 2;
				}

				if (arg0.field1253 > 2) {
					var9 = 6;
				}

				if (arg0.field1253 > 3) {
					var9 = 8;
				}

				if (arg0.field1241 > 0 && arg0.field1253 > 1) {
					var9 = 8;
					arg0.field1241--;
				}

				if (arg0.field1286[arg0.field1253 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1287 == arg0.field1273 && arg0.field1244 != -1) {
					arg0.field1273 = arg0.field1244;
				}

				if (var3 < var5) {
					arg0.field1270 += var9;
					if (arg0.field1270 > var5) {
						arg0.field1270 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1270 -= var9;
					if (arg0.field1270 < var5) {
						arg0.field1270 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1271 += var9;
					if (arg0.field1271 > var6) {
						arg0.field1271 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1271 -= var9;
					if (arg0.field1271 < var6) {
						arg0.field1271 = var6;
					}
				}

				if (arg0.field1270 == var5 && arg0.field1271 == var6) {
					arg0.field1253--;

					if (arg0.field1250 > 0) {
						arg0.field1250--;
						return;
					}
				}
			} else {
				arg0.field1270 = var5;
				arg0.field1271 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLSRUOAWPS;)V")
	public final void method112(SRUOAWPS arg0) {
		if (arg0.field1269 != 0) {
			if (arg0.field1242 != -1 && arg0.field1242 < 32768) {
				PDAYFSBN var2 = field317[arg0.field1242];
				if (var2 != null) {
					int var3 = arg0.field1270 - var2.field1270;
					int var4 = arg0.field1271 - var2.field1271;
					if (var3 != 0 || var4 != 0) {
						arg0.field1280 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1242 >= 32768) {
				int var5 = arg0.field1242 - 32768;
				if (field381 == var5) {
					var5 = field400;
				}

				QGDSNXKJ var6 = field401[var5];
				if (var6 != null) {
					int var7 = arg0.field1270 - var6.field1270;
					int var8 = arg0.field1271 - var6.field1271;
					if (var7 != 0 || var8 != 0) {
						arg0.field1280 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1278 != 0 || arg0.field1279 != 0) && (arg0.field1253 == 0 || arg0.field1241 > 0)) {
				int var9 = arg0.field1270 - (arg0.field1278 - field199 - field199) * 64;
				int var10 = arg0.field1271 - (arg0.field1279 - field200 - field200) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1280 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1278 = 0;
				arg0.field1279 = 0;
			}

			int var11 = arg0.field1280 - arg0.field1272 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1269 || var11 > 2048 - arg0.field1269) {
					arg0.field1272 = arg0.field1280;
				} else if (var11 > 1024) {
					arg0.field1272 -= arg0.field1269;
				} else {
					arg0.field1272 += arg0.field1269;
				}

				arg0.field1272 &= 0x7FF;
				if (arg0.field1273 == arg0.field1239 && arg0.field1280 != arg0.field1272) {
					if (arg0.field1240 != -1) {
						arg0.field1273 = arg0.field1240;
						return;
					}

					arg0.field1273 = arg0.field1287;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LSRUOAWPS;I)V")
	public final void method113(SRUOAWPS arg0) {
		arg0.field1277 = false;

		if (arg0.field1273 != -1) {
			DWUJPTWU var2 = DWUJPTWU.field586[arg0.field1273];
			arg0.field1275++;
			if (arg0.field1274 < var2.field587 && arg0.field1275 > var2.method215(arg0.field1274)) {
				arg0.field1275 = 0;
				arg0.field1274++;
			}

			if (arg0.field1274 >= var2.field587) {
				arg0.field1275 = 0;
				arg0.field1274 = 0;
			}
		}

		if (arg0.field1281 != -1 && field468 >= arg0.field1284) {
			if (arg0.field1282 < 0) {
				arg0.field1282 = 0;
			}

			DWUJPTWU var3 = HTWOTIWO.field778[arg0.field1281].field782;
			arg0.field1283++;
			while (arg0.field1282 < var3.field587 && arg0.field1283 > var3.method215(arg0.field1282)) {
				arg0.field1283 -= var3.method215(arg0.field1282);
				arg0.field1282++;
			}

			if (arg0.field1282 >= var3.field587 && (arg0.field1282 < 0 || arg0.field1282 >= var3.field587)) {
				arg0.field1281 = -1;
			}
		}

		if (arg0.field1245 != -1 && arg0.field1248 <= 1) {
			DWUJPTWU var4 = DWUJPTWU.field586[arg0.field1245];
			if (var4.field598 == 1 && arg0.field1250 > 0 && arg0.field1258 <= field468 && arg0.field1259 < field468) {
				arg0.field1248 = 1;
				return;
			}
		}

		if (arg0.field1245 != -1 && arg0.field1248 == 0) {
			DWUJPTWU var5 = DWUJPTWU.field586[arg0.field1245];
			arg0.field1247++;
			while (arg0.field1246 < var5.field587 && arg0.field1247 > var5.method215(arg0.field1246)) {
				arg0.field1247 -= var5.method215(arg0.field1246);
				arg0.field1246++;
			}

			if (arg0.field1246 >= var5.field587) {
				arg0.field1246 -= var5.field591;
				arg0.field1249++;
				if (arg0.field1249 >= var5.field597) {
					arg0.field1245 = -1;
				}

				if (arg0.field1246 < 0 || arg0.field1246 >= var5.field587) {
					arg0.field1245 = -1;
				}
			}

			arg0.field1277 = var5.field593;
		}

		if (arg0.field1248 > 0) {
			arg0.field1248--;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method114() {
		if (field223 == -1 || field130 != 2 && field1080 == null) {
			if (field509) {
				method87();
				field509 = false;
				field417.method25(4, field1079, 0);
				field418.method25(357, field1079, 0);
				field419.method25(4, field1079, 722);
				field420.method25(205, field1079, 743);
				field421.method25(0, field1079, 0);
				field422.method25(4, field1079, 516);
				field423.method25(205, field1079, 516);
				field424.method25(357, field1079, 496);
				field425.method25(338, field1079, 0);
				field276 = true;
				field270 = true;
				field374 = true;
				field522 = true;

				if (field130 != 2) {
					field371.method25(4, field1079, 4);
					field370.method25(4, field1079, 550);
				}
			}

			if (field130 == 2) {
				method116();
			}

			if (field294 && field375 == 1) {
				field276 = true;
			}

			if (field459 != -1) {
				boolean var3 = method131(field459, field233);
				if (var3) {
					field276 = true;
				}
			}

			if (field457 == 2) {
				field276 = true;
			}

			if (field410 == 2) {
				field276 = true;
			}

			if (field276) {
				method180();
				field276 = false;
			}

			if (field296 == -1) {
				field501.field1143 = field267 - field496 - 77;

				if (field1087 > 448 && field1087 < 560 && field1088 > 332) {
					method117(77, field267, field1087 - 17, field501, field1088 - 357, -1, 463, 0);
				}

				int var4 = field267 - field501.field1143 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field267 - 77) {
					var4 = field267 - 77;
				}

				if (field496 != var4) {
					field496 = var4;
					field270 = true;
				}

				field342++;
				if (field342 > 1972) {
					field342 = 0;
					field493.method319(127);
					field493.method320(0);
					int var5 = field493.field971;
					field493.method320(255);
					field493.method320((int) (Math.random() * 256.0D));
					field493.method321((int) (Math.random() * 65536.0D));
					field493.method320((int) (Math.random() * 256.0D));
					field493.method320(172);

					if ((int) (Math.random() * 2.0D) == 0) {
						field493.method320(76);
					}

					field493.method320((int) (Math.random() * 256.0D));
					field493.method320(28);

					if ((int) (Math.random() * 2.0D) == 0) {
						field493.method321(9038);
					}

					field493.method320(64);
					field493.method329(field493.field971 - var5);
				}
			}

			if (field296 != -1) {
				boolean var6 = method131(field296, field233);
				if (var6) {
					field270 = true;
				}
			}

			if (field457 == 3) {
				field270 = true;
			}

			if (field410 == 3) {
				field270 = true;
			}

			if (field426 != null) {
				field270 = true;
			}

			if (field294 && field375 == 2) {
				field270 = true;
			}

			if (field270) {
				method59();
				field270 = false;
			}

			if (field130 == 2) {
				method174();
				field370.method25(4, field1079, 550);
			}

			if (field141 != -1) {
				field374 = true;
			}

			if (field374) {
				if (field141 != -1 && field256 == field141) {
					field141 = -1;
					field493.method319(3);
					field493.method320(field256);
				}

				field374 = false;
				field156.method24();
				field274.method473(0, 0);

				if (field459 == -1) {
					if (field337[field256] != -1) {
						if (field256 == 0) {
							field541.method473(22, 10);
						}

						if (field256 == 1) {
							field542.method473(54, 8);
						}

						if (field256 == 2) {
							field542.method473(82, 8);
						}

						if (field256 == 3) {
							field543.method473(110, 8);
						}

						if (field256 == 4) {
							field545.method473(153, 8);
						}

						if (field256 == 5) {
							field545.method473(181, 8);
						}

						if (field256 == 6) {
							field544.method473(209, 9);
						}
					}

					if (field337[0] != -1 && (field141 != 0 || field468 % 20 < 10)) {
						field284[0].method473(29, 13);
					}

					if (field337[1] != -1 && (field141 != 1 || field468 % 20 < 10)) {
						field284[1].method473(53, 11);
					}

					if (field337[2] != -1 && (field141 != 2 || field468 % 20 < 10)) {
						field284[2].method473(82, 11);
					}

					if (field337[3] != -1 && (field141 != 3 || field468 % 20 < 10)) {
						field284[3].method473(115, 12);
					}

					if (field337[4] != -1 && (field141 != 4 || field468 % 20 < 10)) {
						field284[4].method473(153, 13);
					}

					if (field337[5] != -1 && (field141 != 5 || field468 % 20 < 10)) {
						field284[5].method473(180, 11);
					}

					if (field337[6] != -1 && (field141 != 6 || field468 % 20 < 10)) {
						field284[6].method473(208, 13);
					}
				}

				field156.method25(160, field1079, 516);
				field155.method24();
				field273.method473(0, 0);

				if (field459 == -1) {
					if (field337[field256] != -1) {
						if (field256 == 7) {
							field487.method473(42, 0);
						}

						if (field256 == 8) {
							field488.method473(74, 0);
						}

						if (field256 == 9) {
							field488.method473(102, 0);
						}

						if (field256 == 10) {
							field489.method473(130, 1);
						}

						if (field256 == 11) {
							field491.method473(173, 0);
						}

						if (field256 == 12) {
							field491.method473(201, 0);
						}

						if (field256 == 13) {
							field490.method473(229, 0);
						}
					}

					if (field337[8] != -1 && (field141 != 8 || field468 % 20 < 10)) {
						field284[7].method473(74, 2);
					}

					if (field337[9] != -1 && (field141 != 9 || field468 % 20 < 10)) {
						field284[8].method473(102, 3);
					}

					if (field337[10] != -1 && (field141 != 10 || field468 % 20 < 10)) {
						field284[9].method473(137, 4);
					}

					if (field337[11] != -1 && (field141 != 11 || field468 % 20 < 10)) {
						field284[10].method473(174, 2);
					}

					if (field337[12] != -1 && (field141 != 12 || field468 % 20 < 10)) {
						field284[11].method473(201, 2);
					}

					if (field337[13] != -1 && (field141 != 13 || field468 % 20 < 10)) {
						field284[12].method473(226, 2);
					}
				}

				field155.method25(466, field1079, 496);
				field371.method24();
				YVYOADIW.field1487 = field213;
			}

			if (field522) {
				field522 = false;
				field154.method24();
				field272.method473(0, 0);
				field465.method10(55, "Public chat", true, 28, 0xFFFFFF);

				if (field479 == 0) {
					field465.method10(55, "On", true, 41, 0xFF00);
				}

				if (field479 == 1) {
					field465.method10(55, "Friends", true, 41, 0xFFFF00);
				}

				if (field479 == 2) {
					field465.method10(55, "Off", true, 41, 0xFF0000);
				}

				if (field479 == 3) {
					field465.method10(55, "Hide", true, 41, 0xFFFF);
				}

				field465.method10(184, "Private chat", true, 28, 0xFFFFFF);

				if (field518 == 0) {
					field465.method10(184, "On", true, 41, 0xFF00);
				}

				if (field518 == 1) {
					field465.method10(184, "Friends", true, 41, 0xFFFF00);
				}

				if (field518 == 2) {
					field465.method10(184, "Off", true, 41, 0xFF0000);
				}

				field465.method10(324, "Trade/compete", true, 28, 0xFFFFFF);

				if (field365 == 0) {
					field465.method10(324, "On", true, 41, 0xFF00);
				}

				if (field365 == 1) {
					field465.method10(324, "Friends", true, 41, 0xFFFF00);
				}

				if (field365 == 2) {
					field465.method10(324, "Off", true, 41, 0xFF0000);
				}

				field465.method10(458, "Report abuse", true, 33, 0xFFFFFF);
				field154.method25(453, field1079, 0);
				field371.method24();
				YVYOADIW.field1487 = field213;
			}

			field233 = 0;
		} else {
			if (field130 == 2) {
				method131(field223, field233);

				if (field480 != -1) {
					method131(field480, field233);
				}

				field233 = 0;
				method170();
				field1080.method24();
				YVYOADIW.field1487 = field214;
				CXMSQZVC.method200();
				field509 = true;
				RRTTGXYM var1 = RRTTGXYM.method458(field223);
				if (var1.field1200 == 512 && var1.field1161 == 334 && var1.field1183 == 0) {
					var1.field1200 = 765;
					var1.field1161 = 503;
				}

				method172(0, 0, var1, 0);

				if (field480 != -1) {
					RRTTGXYM var2 = RRTTGXYM.method458(field480);
					if (var2.field1200 == 512 && var2.field1161 == 334 && var2.field1183 == 0) {
						var2.field1200 = 765;
						var2.field1161 = 503;
					}

					method172(0, 0, var2, 0);
				}

				if (field294) {
					method84();
				} else {
					method185();
					method177();
				}
			}

			field1080.method25(0, field1079, 0);
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method115() {
		short var1 = 256;

		if (field239 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field239 > 768) {
					field427[var2] = method118(field429[var2], field428[var2], 1024 - field239);
				} else if (field239 > 256) {
					field427[var2] = field429[var2];
				} else {
					field427[var2] = method118(field428[var2], field429[var2], 256 - field239);
				}
			}
		} else if (field240 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field240 > 768) {
					field427[var3] = method118(field430[var3], field428[var3], 1024 - field240);
				} else if (field240 > 256) {
					field427[var3] = field430[var3];
				} else {
					field427[var3] = method118(field428[var3], field430[var3], 256 - field240);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field427[var4] = field428[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field357.field45[var5] = field511.field1302[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field166[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field306[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field427[var12];
					int var15 = field357.field45[var7];
					field357.field45[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field357.method25(0, field1079, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field358.field45[var16] = field512.field1302[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field166[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field306[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field427[var23];
					int var26 = field358.field45[var18];
					field358.field45[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field358.method25(0, field1079, 637);
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method116() {
		field525++;
		method104(true);
		method137(true);
		method104(false);
		method137(false);
		method139();
		method148();

		if (!field121) {
			int var1 = field320;
			if (field482 / 256 > var1) {
				var1 = field482 / 256;
			}

			if (field135[4] && field183[4] + 128 > var1) {
				var1 = field183[4] + 128;
			}

			int var2 = field321 + field208 & 0x7FF;
			method175(method57(field540, field288.field1270, field288.field1271) - 50, field443, field442, var1 * 3 + 600, var2, var1);
			field215++;
			if (field215 > 148) {
				field215 = 0;
				field493.method319(142);
				field493.method323(0x8078EA);
			}
		}

		int var3;
		if (field121) {
			var3 = method157();
		} else {
			var3 = method156();
		}

		int var4 = field289;
		int var5 = field290;
		int var6 = field291;
		int var7 = field292;
		int var8 = field293;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field135[var9]) {
				int var10 = (int) (Math.random() * (field236[var9] * 2 + 1) + Math.sin(field460[var9] / 100.0D * field186[var9]) * field183[var9] - field236[var9]);
				if (var9 == 0) {
					field289 += var10;
				}

				if (var9 == 1) {
					field290 += var10;
				}

				if (var9 == 2) {
					field291 += var10;
				}

				if (var9 == 3) {
					field293 = field293 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field292 += var10;
					if (field292 < 128) {
						field292 = 128;
					}

					if (field292 > 383) {
						field292 = 383;
					}
				}
			}
		}

		int var11 = YVYOADIW.field1496;
		PSGMMDJS.field1054 = true;
		PSGMMDJS.field1057 = 0;
		PSGMMDJS.field1055 = field1087 - 4;
		PSGMMDJS.field1056 = field1088 - 4;
		CXMSQZVC.method200();
		field347.method562(field292, field289, field293, field291, var3, field290);
		field347.method537();
		method73();
		method72();
		method127(var11);
		method152();
		field371.method25(4, field1079, 4);
		field289 = var4;
		field290 = var5;
		field291 = var6;
		field292 = var7;
		field293 = var8;
	}

	@ObfuscatedName("client.a(BIIILRRTTGXYM;IIII)V")
	public final void method117(int arg0, int arg1, int arg2, RRTTGXYM arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field395) {
			field551 = 32;
		} else {
			field551 = 0;
		}

		field395 = false;
		if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg7 && arg4 < arg7 + 16) {
			arg3.field1143 -= field222 * 4;

			if (arg5 == 1) {
				field276 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field270 = true;
			}
		} else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg0 + arg7 - 16 && arg4 < arg0 + arg7) {
			arg3.field1143 += field222 * 4;

			if (arg5 == 1) {
				field276 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field270 = true;
			}
		} else if (arg2 >= arg6 - field551 && arg2 < arg6 + field551 + 16 && arg4 >= arg7 + 16 && arg4 < arg0 + arg7 - 16 && field222 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg7 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg3.field1143 = (arg1 - arg0) * var10 / var11;

			if (arg5 == 1) {
				field276 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field270 = true;
			}

			field395 = true;
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method118(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method119(long arg0) {
		if (arg0 != 0L) {
			if (field137 >= 100 && field295 != 1) {
				method191(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field137 >= 200) {
				method191(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = MYWERTTF.method304(MYWERTTF.method301(arg0));
				for (int var4 = 0; var4 < field137; var4++) {
					if (field261[var4] == arg0) {
						method191(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field144; var5++) {
					if (field180[var5] == arg0) {
						method191(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field288.field1105)) {
					field396[field137] = var3;
					field261[field137] = arg0;
					field282[field137] = 0;
					field137++;
					field276 = true;
					field493.method319(105);
					field493.method326(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method120(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field250 = "";
				field251 = "Connecting to server...";
				method89(true);
			}

			field255 = new FKSZIRZG(method133(field554 + 43594), this);
			long var4 = MYWERTTF.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field493.field971 = 0;
			field493.method320(14);
			field493.method320(var6);
			field255.method229(0, field493.field970, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field255.method226();
			}

			int var8 = field255.method226();
			int var9 = var8;

			if (var8 == 0) {
				field255.method228(field134.field970, 0, 8);
				field134.field971 = 0;
				field414 = field134.method336();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field414 >> 32), (int) field414 };
				field493.field971 = 0;
				field493.method320(10);
				field493.method324(var10[0]);
				field493.method324(var10[1]);
				field493.method324(var10[2]);
				field493.method324(var10[3]);
				field493.method324(signlink.uid);
				field493.method327(arg0);
				field493.method327(arg1);
				field493.method345(field262, field453);
				field271.field971 = 0;

				if (arg2) {
					field271.method320(18);
				} else {
					field271.method320(16);
				}

				field271.method320(field493.field971 + 36 + 1 + 1 + 2);
				field271.method320(255);
				field271.method321(340);
				field271.method320(field556 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field271.method324(field230[var11]);
				}

				field271.method328(field493.field970, field493.field971, 0);
				field493.field975 = new LAXXBEFB(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field285 = new LAXXBEFB(var10);
				field255.method229(0, field271.field970, field271.field971);
				var8 = field255.method226();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method120(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field438 = field255.method226();
				field481 = field255.method226() == 1;
				field269 = 0L;
				field517 = 0;
				field281.field1297 = 0;
				field1084 = true;
				field153 = true;
				field162 = true;
				field493.field971 = 0;
				field134.field971 = 0;
				field312 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field311 = 0;
				field313 = 0;
				field367 = 0;
				field315 = 0;
				field159 = 0;
				field345 = 0;
				field294 = false;
				field1085 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field192[var13] = null;
				}

				field348 = 0;
				field531 = 0;
				field130 = 0;
				field149 = 0;
				field203 = (int) (Math.random() * 100.0D) - 50;
				field181 = (int) (Math.random() * 110.0D) - 55;
				field208 = (int) (Math.random() * 80.0D) - 40;
				field231 = (int) (Math.random() * 120.0D) - 60;
				field278 = (int) (Math.random() * 30.0D) - 20;
				field321 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field469 = 0;
				field446 = -1;
				field483 = 0;
				field484 = 0;
				field402 = 0;
				field318 = 0;

				for (int var14 = 0; var14 < field399; var14++) {
					field401[var14] = null;
					field406[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field317[var15] = null;
				}

				field288 = field401[field400] = new QGDSNXKJ();
				field252.method514();
				field197.method514();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field287[var16][var17][var18] = null;
						}
					}
				}

				field187 = new UEUHLQTT();
				field138 = 0;
				field137 = 0;
				method194(field462);
				field462 = -1;
				method194(field296);
				field296 = -1;
				method194(field329);
				field329 = -1;
				method194(field223);
				field223 = -1;
				method194(field480);
				field480 = -1;
				method194(field459);
				field459 = -1;
				method194(field142);
				field142 = -1;
				field194 = false;
				field256 = 3;
				field218 = 0;
				field294 = false;
				field145 = false;
				field426 = null;
				field332 = 0;
				field141 = -1;
				field510 = true;
				method90();

				for (int var19 = 0; var19 < 5; var19++) {
					field495[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field514[var20] = null;
					field515[var20] = false;
				}

				field309 = 0;
				field557 = 0;
				field334 = 0;
				field331 = 0;
				field497 = 0;
				field415 = 0;
				field259 = 0;
				field550 = 0;
				field549 = 0;
				method87();
			} else if (var8 == 3) {
				field250 = "";
				field251 = "Invalid username or password.";
			} else if (var8 == 4) {
				field250 = "Your account has been disabled.";
				field251 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field250 = "Your account is already logged in.";
				field251 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field250 = "RuneScape has been updated!";
				field251 = "Please reload this page.";
			} else if (var8 == 7) {
				field250 = "This world is full.";
				field251 = "Please use a different world.";
			} else if (var8 == 8) {
				field250 = "Unable to connect.";
				field251 = "Login server offline.";
			} else if (var8 == 9) {
				field250 = "Login limit exceeded.";
				field251 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field250 = "Unable to connect.";
				field251 = "Bad session id.";
			} else if (var8 == 11) {
				field250 = "Login server rejected session.";
				field251 = "Please try again.";
			} else if (var8 == 12) {
				field250 = "You need a members account to login to this world.";
				field251 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field250 = "Could not complete login.";
				field251 = "Please try using a different world.";
			} else if (var8 == 14) {
				field250 = "The server is being updated.";
				field251 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field162 = true;
				field493.field971 = 0;
				field134.field971 = 0;
				field312 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field311 = 0;
				field313 = 0;
				field367 = 0;
				field345 = 0;
				field294 = false;
				field238 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field250 = "Login attempts exceeded.";
				field251 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field250 = "You are standing in a members-only area.";
				field251 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field250 = "Invalid loginserver requested";
				field251 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field255.method226();
				for (var21 += 3; var21 >= 0; var21--) {
					field250 = "You have only just left another world";
					field251 = "Your profile will be transferred in: " + var21;
					method89(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method120(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field250 = "Malformed login packet.";
				field251 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field250 = "Unexpected server response";
				field251 = "Please try using a different world.";
			} else if (var9 != 0) {
				field250 = "No response from server";
				field251 = "Please try using a different world.";
			} else if (field195 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field195++;
				method120(arg0, arg1, arg2);
			} else {
				field250 = "No response from loginserver";
				field251 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field250 = "";
			field251 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method121() {
		for (int var1 = 0; var1 < field149; var1++) {
			if (field524[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field174[var1] != field436 || field475[var1] != field305) {
						PKHWFJLM var3 = NGSVJLXG.method307(field475[var1], field174[var1]);
						if (System.currentTimeMillis() + var3.field971 / 22 > field451 / 22 + field407) {
							field451 = var3.field971;
							field407 = System.currentTimeMillis();

							if (method97(var3.field970, var3.field971)) {
								field436 = field174[var1];
								field305 = field475[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method62()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field524[var1] != -5) {
					field524[var1] = -5;
				} else {
					field149--;
					for (int var5 = var1; var5 < field149; var5++) {
						field174[var5] = field174[var5 + 1];
						field475[var5] = field475[var5 + 1];
						field524[var5] = field524[var5 + 1];
					}

					var1--;
				}
			} else {
				field524[var1]--;
			}
		}

		field275++;
		if (field275 > 60) {
			field275 = 0;
			field493.method319(101);
		}

		if (field513 > 0) {
			field513 -= 20;
			if (field513 < 0) {
				field513 = 0;
			}

			if (field513 == 0 && field336 && !field556) {
				field253 = field308;
				field254 = true;
				field234.method265(2, field253);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IBI)Ljava/lang/String;")
	public static final String method122(int arg0, int arg1) {
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

	@ObfuscatedName("client.r(Z)V")
	public final void method123() {
		try {
			if (field255 != null) {
				field255.method225();
			}
		} catch (Exception var2) {
		}

		field255 = null;
		field162 = false;
		field248 = 0;
		field122 = "";
		field123 = "";
		method150();
		field347.method523();

		for (int var1 = 0; var1 < 4; var1++) {
			field216[var1].method480();
		}

		System.gc();
		method65();
		field308 = -1;
		field253 = -1;
		field513 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method124(String arg0, String arg1) {
		if (field371 != null) {
			field371.method24();
			YVYOADIW.field1487 = field213;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field465.method9(var3, 257, arg0, 0);
			field465.method9(var3 - 1, 256, arg0, 0xFFFFFF);
			var3 += 15;
			if (arg1 != null) {
				field465.method9(var3, 257, arg1, 0);
				field465.method9(var3 - 1, 256, arg1, 0xFFFFFF);
			}

			field371.method25(4, field1079, 4);
		} else if (field1080 != null) {
			field1080.method24();
			YVYOADIW.field1487 = field214;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			CXMSQZVC.method202(0, 383 - var5 / 2, var5, var4 - var6 / 2 - 5, var6);
			CXMSQZVC.method203(var4 - var6 / 2 - 5, var6, 0xFFFFFF, 383 - var5 / 2, var5);

			if (arg1 != null) {
				var4 -= 7;
			}

			field465.method9(var4, 383, arg0, 0);
			field465.method9(var4 - 1, 382, arg0, 0xFFFFFF);
			var4 += 15;
			if (arg1 != null) {
				field465.method9(var4, 383, arg1, 0);
				field465.method9(var4 - 1, 382, arg1, 0xFFFFFF);
			}

			field1080.method25(0, field1079, 0);
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method125(int arg0) {
		if (arg0 >= 0) {
			if (field218 != 0) {
				field218 = 0;
				field270 = true;
			}

			int var2 = field527[arg0];
			int var3 = field528[arg0];
			int var4 = field529[arg0];
			int var5 = field530[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 396) {
				boolean var6 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
				if (!var6) {
					method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
				}

				field447 = field1094;
				field448 = field1095;
				field450 = 2;
				field449 = 0;
				field493.method319(107);
				field493.method354(field199 + var2);
				field493.method354(var5);
				field493.method354(field200 + var3);
			}

			if (var4 == 901) {
				field348 = 1;
				field349 = var2;
				field350 = var3;
				field351 = var5;
				field352 = HCJYZKIH.method236(var5).field727;
				field531 = 0;
				field276 = true;
			} else {
				if (var4 == 954) {
					PDAYFSBN var8 = field317[var5];
					if (var8 != null) {
						method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var8.field1236[0], var8.field1237[0]);
						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(171);
						field493.method321(var5);
						field493.method321(field532);
					}
				}

				if (var4 == 877) {
					field493.method319(75);
					field493.method321(var3);
					RRTTGXYM var9 = RRTTGXYM.method458(var3);
					if (var9.field1172 != null && var9.field1172[0][0] == 5) {
						int var10 = var9.field1172[0][1];
						field165[var10] = 1 - field165[var10];
						method105(var10);
						field276 = true;
					}
				}

				if (var4 == 836) {
					RRTTGXYM var11 = RRTTGXYM.method458(var3);
					boolean var12 = true;
					if (var11.field1178 > 0) {
						var12 = method149(var11);
					}

					if (var12) {
						field493.method319(75);
						field493.method321(var3);
					}
				}

				if (var4 == 556) {
					String var13 = field333[arg0];
					int var14 = var13.indexOf("@whi@");
					if (var14 != -1) {
						if (field329 == -1) {
							method103();
							field163 = var13.substring(var14 + 5).trim();
							field133 = false;
							field286 = field329 = RRTTGXYM.field1193;
						} else {
							method191(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 856 && !field194) {
					field493.method319(202);
					field493.method321(var3);
					field194 = true;
				}

				if (var4 == 991) {
					method103();
				}

				if (var4 == 204) {
					field334 += var2;
					if (field334 >= 146) {
						field493.method319(28);
						field334 = 0;
					}

					field493.method319(238);
					field493.method354(var3);
					field493.method355(var5);
					field493.method356(var2);
					field454 = 0;
					field455 = var3;
					field456 = var2;
					field457 = 2;
					if (RRTTGXYM.method458(var3).field1152 == field329) {
						field457 = 1;
					}

					if (RRTTGXYM.method458(var3).field1152 == field296) {
						field457 = 3;
					}
				}

				if (var4 == 743) {
					method71(var3, var2, var5);
					field493.method319(43);
					field493.method321(field199 + var2);
					field493.method356(var5 >> 14 & 0x7FFF);
					field493.method354(field200 + var3);
				}

				if (var4 == 924) {
					RRTTGXYM var15 = RRTTGXYM.method458(var3);
					field531 = 1;
					field532 = var3;
					field533 = var15.field1176;
					field348 = 0;
					field276 = true;
					String var16 = var15.field1203;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}

					String var17 = var15.field1203;
					if (var17.indexOf(" ") != -1) {
						var17 = var17.substring(var17.indexOf(" ") + 1);
					}

					field534 = var16 + " " + var15.field1166 + " " + var17;

					if (field533 == 16) {
						field276 = true;
						field256 = 3;
						field374 = true;
					}
				} else {
					if (var4 == 529) {
						field493.method319(75);
						field493.method321(var3);
						RRTTGXYM var18 = RRTTGXYM.method458(var3);
						if (var18.field1172 != null && var18.field1172[0][0] == 5) {
							int var19 = var18.field1172[0][1];
							if (field165[var19] != var18.field1195[0]) {
								field165[var19] = var18.field1195[0];
								method105(var19);
								field276 = true;
							}
						}
					}

					if (var4 == 855) {
						boolean var20 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var20) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(230);
						field493.method354(field200 + var3);
						field493.method356(field532);
						field493.method321(var5);
						field493.method321(field199 + var2);
					}

					if (var4 == 830) {
						QGDSNXKJ var22 = field401[var5];
						if (var22 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var22.field1236[0], var22.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(204);
							field493.method355(var5);
						}
					}

					if (var4 == 104) {
						field493.method319(44);
						field493.method321(var3);
						field493.method321(var2);
						field493.method356(field532);
						field493.method355(var5);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 537) {
						QGDSNXKJ var23 = field401[var5];
						if (var23 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var23.field1236[0], var23.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(8);
							field493.method321(field532);
							field493.method355(var5);
						}
					}

					if (var4 == 695 || var4 == 913 || var4 == 864 || var4 == 736) {
						String var24 = field333[arg0];
						int var25 = var24.indexOf("@whi@");
						if (var25 != -1) {
							long var26 = MYWERTTF.method300(var24.substring(var25 + 5).trim());
							if (var4 == 695) {
								method119(var26);
							}

							if (var4 == 913) {
								method126(var26);
							}

							if (var4 == 864) {
								method179(var26);
							}

							if (var4 == 736) {
								method159(var26);
							}
						}
					}

					if (var4 == 481) {
						QGDSNXKJ var28 = field401[var5];
						if (var28 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var28.field1236[0], var28.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(108);
							field493.method355(var5);
						}
					}

					if (var4 == 1545) {
						field309++;
						if (field309 >= 139) {
							field493.method319(206);
							field493.method321(52426);
							field309 = 0;
						}

						method71(var3, var2, var5);
						field493.method319(172);
						field493.method354(field200 + var3);
						field493.method355(var5 >> 14 & 0x7FFF);
						field493.method321(field199 + var2);
					}

					if (var4 == 99) {
						field493.method319(191);
						field493.method355(var5);
						field493.method354(var2);
						field493.method321(var3);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 74) {
						method71(var3, var2, var5);
						field493.method319(133);
						field493.method355(field200 + var3);
						field493.method354(field199 + var2);
						field493.method354(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 1642) {
						HCJYZKIH var29 = HCJYZKIH.method236(var5);
						String var30;
						if (var29.field772 == null) {
							var30 = "It's a " + var29.field727 + ".";
						} else {
							var30 = new String(var29.field772);
						}

						method191(0, "", var30);
					}

					if (var4 == 92) {
						field493.method319(42);
						field493.method321(var5);
						field493.method355(var3);
						field493.method356(var2);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 773) {
						PDAYFSBN var31 = field317[var5];
						if (var31 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var31.field1236[0], var31.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;

							if ((var5 & 0x3) == 0) {
								field415++;
							}

							if (field415 >= 113) {
								field493.method319(193);
								field493.method320(61);
								field415 = 0;
							}

							field493.method319(254);
							field493.method354(var5);
						}
					}

					if (var4 == 1630) {
						HCJYZKIH var32 = HCJYZKIH.method236(var5);
						RRTTGXYM var33 = RRTTGXYM.method458(var3);
						String var34;
						if (var33 != null && var33.field1212[var2] >= 100000) {
							var34 = var33.field1212[var2] + " x " + var32.field727;
						} else if (var32.field772 == null) {
							var34 = "It's a " + var32.field727 + ".";
						} else {
							var34 = new String(var32.field772);
						}

						method191(0, "", var34);
					}

					if (var4 == 684) {
						method194(field462);
						field462 = -1;
						field270 = true;
					}

					if (var4 == 1825) {
						PDAYFSBN var35 = field317[var5];
						if (var35 != null) {
							YIBRLAQY var36 = var35.field969;
							if (var36.field1447 != null) {
								var36 = var36.method576();
							}

							if (var36 != null) {
								String var37;
								if (var36.field1465 == null) {
									var37 = "It's a " + var36.field1453 + ".";
								} else {
									var37 = new String(var36.field1465);
								}

								method191(0, "", var37);
							}
						}
					}

					if (var4 == 611 && method71(var3, var2, var5)) {
						field493.method319(177);
						field493.method356(field199 + var2);
						field493.method356(field350);
						field493.method321(var5 >> 14 & 0x7FFF);
						field493.method356(field351);
						field493.method354(field349);
						field493.method355(field200 + var3);
					}

					if (var4 == 982) {
						field557 += var3;
						if (field557 >= 137) {
							field493.method319(181);
							field493.method321(27064);
							field557 = 0;
						}

						method71(var3, var2, var5);
						field493.method319(126);
						field493.method321(field199 + var2);
						field493.method321(var5 >> 14 & 0x7FFF);
						field493.method355(field200 + var3);
					}

					if (var4 == 840) {
						field493.method319(249);
						field493.method321(var3);
						field493.method321(var5);
						field493.method321(var2);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 517) {
						QGDSNXKJ var38 = field401[var5];
						if (var38 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var38.field1236[0], var38.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(18);
							field493.method356(field350);
							field493.method354(field351);
							field493.method356(var5);
							field493.method354(field349);
						}
					}

					if (var4 == 838) {
						boolean var39 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var39) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(162);
						field493.method321(field200 + var3);
						field493.method355(var5);
						field493.method355(field199 + var2);
					}

					if (var4 == 775) {
						boolean var41 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var41) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(60);
						field493.method355(field200 + var3);
						field493.method354(var5);
						field493.method354(field199 + var2);
					}

					if (var4 == 300) {
						field493.method319(241);
						field493.method355(var5);
						field493.method356(var3);
						field493.method356(var2);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 124) {
						if (field294) {
							field347.method561(var3 - 4, var2 - 4);
						} else {
							field347.method561(field1095 - 4, field1094 - 4);
						}
					}

					if (var4 == 849) {
						field493.method319(229);
						field493.method356(var3);
						field493.method321(var2);
						field493.method356(var5);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 738) {
						QGDSNXKJ var43 = field401[var5];
						if (var43 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var43.field1236[0], var43.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(51);
							field493.method355(var5);
						}
					}

					if (var4 == 167) {
						boolean var44 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var44) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field549++;
						if (field549 >= 142) {
							field493.method319(5);
							field549 = 0;
						}

						field493.method319(146);
						field493.method321(field200 + var3);
						field493.method321(field199 + var2);
						field493.method356(var5);
					}

					if (var4 == 117 || var4 == 264) {
						String var46 = field333[arg0];
						int var47 = var46.indexOf("@whi@");
						if (var47 != -1) {
							var46 = var46.substring(var47 + 5).trim();
							String var48 = MYWERTTF.method304(MYWERTTF.method301(MYWERTTF.method300(var46)));
							boolean var49 = false;
							for (int var50 = 0; var50 < field402; var50++) {
								QGDSNXKJ var51 = field401[field403[var50]];
								if (var51 != null && var51.field1105 != null && var51.field1105.equalsIgnoreCase(var48)) {
									method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var51.field1236[0], var51.field1237[0]);

									if (var4 == 117) {
										field493.method319(204);
										field493.method355(field403[var50]);
									}

									if (var4 == 264) {
										field493.method319(82);
										field493.method356(field403[var50]);
									}

									var49 = true;
									break;
								}
							}

							if (!var49) {
								method191(0, "", "Unable to find " + var48);
							}
						}
					}

					if (var4 == 713) {
						String var52 = field333[arg0];
						int var53 = var52.indexOf("@whi@");
						if (var53 != -1) {
							long var54 = MYWERTTF.method300(var52.substring(var53 + 5).trim());
							int var56 = -1;
							for (int var57 = 0; var57 < field137; var57++) {
								if (field261[var57] == var54) {
									var56 = var57;
									break;
								}
							}

							if (var56 != -1 && field282[var56] > 0) {
								field270 = true;
								field218 = 0;
								field145 = true;
								field380 = "";
								field452 = 3;
								field523 = field261[var56];
								field343 = "Enter message to send to " + field396[var56];
							}
						}
					}

					if (var4 == 994) {
						PDAYFSBN var58 = field317[var5];
						if (var58 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var58.field1236[0], var58.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(80);
							field493.method355(var5);
						}
					}

					if (var4 == 341) {
						boolean var59 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var59) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(20);
						field493.method354(var5);
						field493.method355(field200 + var3);
						field493.method355(field351);
						field493.method356(field350);
						field493.method321(field349);
						field493.method356(field199 + var2);
					}

					if (var4 == 357) {
						field493.method319(50);
						field493.method355(var2);
						field493.method321(var3);
						field493.method356(var5);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 600) {
						field259 += var2;
						if (field259 >= 55) {
							field493.method319(122);
							field493.method324(0);
							field259 = 0;
						}

						field493.method319(168);
						field493.method321(var2);
						field493.method356(var3);
						field493.method354(var5);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 234 && method71(var3, var2, var5)) {
						field493.method319(179);
						field493.method356(var5 >> 14 & 0x7FFF);
						field493.method321(field199 + var2);
						field493.method356(field200 + var3);
						field493.method321(field532);
					}

					if (var4 == 194) {
						field331 += var2;
						if (field331 >= 51) {
							field493.method319(234);
							field493.method321(61426);
							field331 = 0;
						}

						field493.method319(10);
						field493.method321(var5);
						field493.method355(var2);
						field493.method321(var3);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 125) {
						method71(var3, var2, var5);
						field493.method319(22);
						field493.method321(var5 >> 14 & 0x7FFF);
						field493.method355(field199 + var2);
						field493.method354(field200 + var3);
					}

					if (var4 == 486) {
						field493.method319(118);
						field493.method355(field351);
						field493.method354(var5);
						field493.method355(field349);
						field493.method356(var2);
						field493.method355(field350);
						field493.method355(var3);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 771) {
						QGDSNXKJ var61 = field401[var5];
						if (var61 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var61.field1236[0], var61.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(125);
							field493.method356(var5);
						}
					}

					if (var4 == 196) {
						PDAYFSBN var62 = field317[var5];
						if (var62 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var62.field1236[0], var62.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(215);
							field493.method356(var5);
						}
					}

					if (var4 == 597) {
						PDAYFSBN var63 = field317[var5];
						if (var63 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var63.field1236[0], var63.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;

							if ((var5 & 0x3) == 0) {
								field550++;
							}

							if (field550 >= 123) {
								field493.method319(84);
								field493.method321(10442);
								field550 = 0;
							}

							field493.method319(24);
							field493.method356(var5);
						}
					}

					if (var4 == 992) {
						PDAYFSBN var64 = field317[var5];
						if (var64 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var64.field1236[0], var64.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(121);
							field493.method356(field349);
							field493.method354(field351);
							field493.method355(field350);
							field493.method355(var5);
						}
					}

					if (var4 == 371) {
						field493.method319(68);
						field493.method321(var3);
						field493.method354(var5);
						field493.method354(var2);
						field454 = 0;
						field455 = var3;
						field456 = var2;
						field457 = 2;
						if (RRTTGXYM.method458(var3).field1152 == field329) {
							field457 = 1;
						}

						if (RRTTGXYM.method458(var3).field1152 == field296) {
							field457 = 3;
						}
					}

					if (var4 == 1634) {
						int var65 = var5 >> 14 & 0x7FFF;
						LWJTLDAE var66 = LWJTLDAE.method290(var65);
						String var67;
						if (var66.field923 == null) {
							var67 = "It's a " + var66.field915 + ".";
						} else {
							var67 = new String(var66.field923);
						}

						method191(0, "", var67);
					}

					if (var4 == 893) {
						boolean var68 = method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 0, 0, 0, 0, var2, var3);
						if (!var68) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var2, var3);
						}

						field447 = field1094;
						field448 = field1095;
						field450 = 2;
						field449 = 0;
						field493.method319(27);
						field493.method356(field200 + var3);
						field493.method355(field199 + var2);
						field493.method354(var5);
					}

					if (var4 == 41) {
						QGDSNXKJ var70 = field401[var5];
						if (var70 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var70.field1236[0], var70.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;
							field493.method319(82);
							field493.method356(var5);
						}
					}

					if (var4 == 218) {
						PDAYFSBN var71 = field317[var5];
						if (var71 != null) {
							method49(field288.field1237[0], field288.field1236[0], 0, 2, false, 1, 1, 0, 0, var71.field1236[0], var71.field1237[0]);
							field447 = field1094;
							field448 = field1095;
							field450 = 2;
							field449 = 0;

							if ((var5 & 0x3) == 0) {
								field497++;
							}

							if (field497 >= 147) {
								field493.method319(89);
								field493.method323(0x959194);
								field497 = 0;
							}

							field493.method319(173);
							field493.method356(var5);
						}
					}

					field348 = 0;
					field531 = 0;
					field276 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method126(long arg0) {
		if (arg0 != 0L) {
			if (field144 >= 100) {
				method191(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = MYWERTTF.method304(MYWERTTF.method301(arg0));
				for (int var4 = 0; var4 < field144; var4++) {
					if (field180[var4] == arg0) {
						method191(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field137; var5++) {
					if (field261[var5] == arg0) {
						method191(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field180[field144++] = arg0;
				field276 = true;
				field493.method319(218);
				field493.method326(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method127(int arg0) {
		if (!field556) {
			for (int var2 = 0; var2 < field143.length; var2++) {
				int var3 = field143[var2];
				if (YVYOADIW.field1495[var3] >= arg0) {
					SFAIBATY var4 = YVYOADIW.field1489[var3];
					int var5 = var4.field1217 * var4.field1216 - 1;
					int var6 = field233 * var4.field1216 * 2;
					byte[] var7 = var4.field1214;
					byte[] var8 = field439;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1214 = var8;
					field439 = var7;
					YVYOADIW.method591(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.s(Z)V")
	public final void method128() {
		for (int var1 = -1; var1 < field402; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field400;
			} else {
				var2 = field403[var1];
			}

			QGDSNXKJ var3 = field401[var2];
			if (var3 != null) {
				method108(1, var3);
			}
		}

		field221++;
		if (field221 > 194) {
			field221 = 0;
			field493.method319(94);
			field493.method321(10697);
		}
	}

	@ObfuscatedName("client.a(LPKHWFJLM;II)V")
	public final void method129(PKHWFJLM arg0, int arg1) {
		if (arg1 == 33) {
			int var3 = arg0.method332();
			int var4 = arg0.method350();
			int var5 = (var4 >> 4 & 0x7) + field147;
			int var6 = (var4 & 0x7) + field148;
			int var7 = arg0.method332();
			int var8 = arg0.method359();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && field381 != var3) {
				LCFGLQPE var9 = new LCFGLQPE();
				var9.field878 = var7;
				var9.field877 = var8;

				if (field287[field540][var5][var6] == null) {
					field287[field540][var5][var6] = new UEUHLQTT();
				}

				field287[field540][var5][var6].method507(var9);
				method171(var5, var6);
			}
		} else if (arg1 == 205) {
			int var10 = arg0.method350();
			int var11 = (var10 >> 4 & 0x7) + field147;
			int var12 = (var10 & 0x7) + field148;
			int var13 = arg0.method359();
			int var14 = arg0.method350();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field167[var15];
			if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
				int var18 = field383[field540][var11][var12];
				int var19 = field383[field540][var11 + 1][var12];
				int var20 = field383[field540][var11 + 1][var12 + 1];
				int var21 = field383[field540][var11][var12 + 1];
				if (var17 == 0) {
					ABCTLMYM var22 = field347.method545(var11, field540, var12);
					if (var22 != null) {
						int var23 = var22.field8 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var22.field6 = new SLPOTSAU(var23, var16 + 4, false, var20, var18, var19, 2, var21, var13);
							var22.field7 = new SLPOTSAU(var23, var16 + 1 & 0x3, false, var20, var18, var19, 2, var21, var13);
						} else {
							var22.field6 = new SLPOTSAU(var23, var16, false, var20, var18, var19, var15, var21, var13);
						}
					}
				}

				if (var17 == 1) {
					WATAAVTT var24 = field347.method546(field540, var12, var11);
					if (var24 != null) {
						var24.field1333 = new SLPOTSAU(var24.field1334 >> 14 & 0x7FFF, 0, false, var20, var18, var19, 4, var21, var13);
					}
				}

				if (var17 == 2) {
					WHGAFUVJ var25 = field347.method547(field540, var11, var12);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var25 != null) {
						var25.field1340 = new SLPOTSAU(var25.field1348 >> 14 & 0x7FFF, var16, false, var20, var18, var19, var15, var21, var13);
					}
				}

				if (var17 == 3) {
					FCLIFBVY var26 = field347.method548(var12, field540, var11);
					if (var26 != null) {
						var26.field689 = new SLPOTSAU(var26.field690 >> 14 & 0x7FFF, var16, false, var20, var18, var19, 22, var21, var13);
					}
				}
			}
		} else {
			if (arg1 == 88) {
				byte var27 = arg0.method352();
				byte var28 = arg0.method331();
				byte var29 = arg0.method331();
				int var30 = arg0.method332();
				int var31 = arg0.method330();
				int var32 = (var31 >> 4 & 0x7) + field147;
				int var33 = (var31 & 0x7) + field148;
				int var34 = arg0.method359();
				int var35 = arg0.method359();
				byte var36 = arg0.method353();
				int var37 = arg0.method349();
				int var38 = var37 >> 2;
				int var39 = var37 & 0x3;
				int var40 = field167[var38];
				int var41 = arg0.method332();
				QGDSNXKJ var42;
				if (field381 == var30) {
					var42 = field288;
				} else {
					var42 = field401[var30];
				}

				if (var42 != null) {
					LWJTLDAE var43 = LWJTLDAE.method290(var35);
					int var44 = field383[field540][var32][var33];
					int var45 = field383[field540][var32 + 1][var33];
					int var46 = field383[field540][var32 + 1][var33 + 1];
					int var47 = field383[field540][var32][var33 + 1];
					PSGMMDJS var48 = var43.method295(var38, var39, var44, var45, var46, var47, -1);
					if (var48 != null) {
						method154(var40, var33, var34 + 1, 0, var32, var41 + 1, field540, -1, 0);
						var42.field1101 = field468 + var34;
						var42.field1102 = field468 + var41;
						var42.field1121 = var48;
						int var49 = var43.field902;
						int var50 = var43.field894;
						if (var39 == 1 || var39 == 3) {
							var49 = var43.field894;
							var50 = var43.field902;
						}

						var42.field1118 = var32 * 128 + var49 * 64;
						var42.field1120 = var33 * 128 + var50 * 64;
						var42.field1119 = method57(field540, var42.field1118, var42.field1120);

						if (var36 > var28) {
							byte var51 = var36;
							var36 = var28;
							var28 = var51;
						}

						if (var27 > var29) {
							byte var52 = var27;
							var27 = var29;
							var29 = var52;
						}

						var42.field1112 = var32 + var36;
						var42.field1114 = var28 + var32;
						var42.field1113 = var27 + var33;
						var42.field1115 = var29 + var33;
					}
				}
			}

			if (arg1 == 140) {
				int var53 = arg0.method350();
				int var54 = (var53 >> 4 & 0x7) + field147;
				int var55 = (var53 & 0x7) + field148;
				int var56 = arg0.method351();
				int var57 = var56 >> 2;
				int var58 = var56 & 0x3;
				int var59 = field167[var57];
				if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
					method154(var59, var55, 0, var57, var54, -1, field540, -1, var58);
				}
			} else if (arg1 == 7) {
				int var60 = arg0.method350();
				int var61 = (var60 >> 4 & 0x7) + field147;
				int var62 = (var60 & 0x7) + field148;
				int var63 = arg0.method358();
				if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
					UEUHLQTT var64 = field287[field540][var61][var62];
					if (var64 != null) {
						for (LCFGLQPE var65 = (LCFGLQPE) var64.method510(); var65 != null; var65 = (LCFGLQPE) var64.method512()) {
							if ((var63 & 0x7FFF) == var65.field878) {
								var65.method254();
								break;
							}
						}

						if (var64.method510() == null) {
							field287[field540][var61][var62] = null;
						}

						method171(var61, var62);
					}
				}
			} else if (arg1 == 224) {
				int var66 = arg0.method330();
				int var67 = (var66 >> 4 & 0x7) + field147;
				int var68 = (var66 & 0x7) + field148;
				int var69 = var67 + arg0.method331();
				int var70 = var68 + arg0.method331();
				int var71 = arg0.method333();
				int var72 = arg0.method332();
				int var73 = arg0.method330() * 4;
				int var74 = arg0.method330() * 4;
				int var75 = arg0.method332();
				int var76 = arg0.method332();
				int var77 = arg0.method330();
				int var78 = arg0.method330();
				if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var72 != 0xFFFF) {
					var67 = var67 * 128 + 64;
					var68 = var68 * 128 + 64;
					var69 = var69 * 128 + 64;
					var70 = var70 * 128 + 64;
					IJDLXEFP var79 = new IJDLXEFP(var68, var77, var74, method57(field540, var67, var68) - var73, var67, var78, field468 + var75, var72, field540, var71, field468 + var76);
					var79.method253(var69, var70, field468 + var75, method57(field540, var69, var70) - var74);
					field252.method507(var79);
				}
			} else if (arg1 == 154) {
				int var80 = arg0.method330();
				int var81 = (var80 >> 4 & 0x7) + field147;
				int var82 = (var80 & 0x7) + field148;
				int var83 = arg0.method332();
				int var84 = arg0.method332();
				int var85 = arg0.method332();
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
					UEUHLQTT var86 = field287[field540][var81][var82];
					if (var86 != null) {
						for (LCFGLQPE var87 = (LCFGLQPE) var86.method510(); var87 != null; var87 = (LCFGLQPE) var86.method512()) {
							if ((var83 & 0x7FFF) == var87.field878 && var87.field877 == var84) {
								var87.field877 = var85;
								break;
							}
						}

						method171(var81, var82);
					}
				}
			} else {
				if (arg1 == 116) {
					int var88 = arg0.method330();
					int var89 = (var88 >> 4 & 0x7) + field147;
					int var90 = (var88 & 0x7) + field148;
					int var91 = arg0.method332();
					int var92 = arg0.method330();
					int var93 = var92 >> 4 & 0xF;
					int var94 = var92 & 0x7;
					if (field288.field1236[0] >= var89 - var93 && field288.field1236[0] <= var89 + var93 && field288.field1237[0] >= var90 - var93 && field288.field1237[0] <= var90 + var93 && field477 && !field556 && field149 < 50) {
						field174[field149] = var91;
						field475[field149] = var94;
						field524[field149] = NGSVJLXG.field946[var91];
						field149++;
					}
				}

				if (arg1 == 145) {
					int var95 = arg0.method332();
					int var96 = arg0.method330();
					int var97 = (var96 >> 4 & 0x7) + field147;
					int var98 = (var96 & 0x7) + field148;
					int var99 = arg0.method332();
					if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
						LCFGLQPE var100 = new LCFGLQPE();
						var100.field878 = var95;
						var100.field877 = var99;

						if (field287[field540][var97][var98] == null) {
							field287[field540][var97][var98] = new UEUHLQTT();
						}

						field287[field540][var97][var98].method507(var100);
						method171(var97, var98);
					}
				} else if (arg1 == 20) {
					int var101 = arg0.method359();
					int var102 = arg0.method351();
					int var103 = (var102 >> 4 & 0x7) + field147;
					int var104 = (var102 & 0x7) + field148;
					int var105 = arg0.method350();
					int var106 = var105 >> 2;
					int var107 = var105 & 0x3;
					int var108 = field167[var106];
					if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
						method154(var108, var104, 0, var106, var103, -1, field540, var101, var107);
					}
				} else if (arg1 == 243) {
					int var109 = arg0.method330();
					int var110 = (var109 >> 4 & 0x7) + field147;
					int var111 = (var109 & 0x7) + field148;
					int var112 = arg0.method332();
					int var113 = arg0.method330();
					int var114 = arg0.method332();
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						var110 = var110 * 128 + 64;
						var111 = var111 * 128 + 64;
						CSVVQIMY var115 = new CSVVQIMY(var114, var112, var111, method57(field540, var110, var111) - var113, field468, var110, field540);
						field197.method507(var115);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILPKHWFJLM;I)V")
	public final void method130(PKHWFJLM arg0, int arg1) {
		arg0.method340();
		int var3 = arg0.method341(1);
		if (var3 != 0) {
			int var4 = arg0.method341(2);
			if (var4 == 0) {
				field405[field404++] = field400;
			} else if (var4 == 1) {
				int var5 = arg0.method341(3);
				field288.method478(false, var5);
				int var6 = arg0.method341(1);
				if (var6 == 1) {
					field405[field404++] = field400;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method341(3);
				field288.method478(true, var7);
				int var8 = arg0.method341(3);
				field288.method478(true, var8);
				int var9 = arg0.method341(1);
				if (var9 == 1) {
					field405[field404++] = field400;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method341(7);
				int var11 = arg0.method341(1);
				int var12 = arg0.method341(7);
				int var13 = arg0.method341(1);
				if (var13 == 1) {
					field405[field404++] = field400;
				}

				field540 = arg0.method341(2);
				field288.method476(var12, var10, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method131(int arg0, int arg1) {
		boolean var3 = false;
		RRTTGXYM var4 = RRTTGXYM.method458(arg0);
		for (int var5 = 0; var5 < var4.field1210.length && var4.field1210[var5] != -1; var5++) {
			RRTTGXYM var6 = RRTTGXYM.method458(var4.field1210[var5]);
			if (var6.field1183 == 1) {
				var3 |= method131(var6.field1169, arg1);
			}

			if (var6.field1183 == 6 && (var6.field1149 != -1 || var6.field1150 != -1)) {
				boolean var7 = method83(var6);
				int var8;
				if (var7) {
					var8 = var6.field1150;
				} else {
					var8 = var6.field1149;
				}

				if (var8 != -1) {
					DWUJPTWU var9 = DWUJPTWU.field586[var8];
					var6.field1148 += arg1;
					while (var6.field1148 > var9.method215(var6.field1197)) {
						var6.field1148 -= var9.method215(var6.field1197) + 1;
						var6.field1197++;
						if (var6.field1197 >= var9.field587) {
							var6.field1197 -= var9.field591;
							if (var6.field1197 < 0 || var6.field1197 >= var9.field587) {
								var6.field1197 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1183 == 6 && var6.field1207 != 0) {
				int var10 = var6.field1207 >> 16;
				int var11 = var6.field1207 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1174 = var6.field1174 + var10 & 0x7FF;
				var6.field1175 = var6.field1175 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method132() {
		try {
			field446 = -1;
			field197.method514();
			field252.method514();
			field263++;
			if (field263 > 1003) {
				field263 = 0;
				field493.method319(90);
				field493.method320(0);
				int var1 = field493.field971;
				field493.method321(64998);
				field493.method320(213);
				field493.method320(167);
				field493.method320(250);
				field493.method320(224);
				field493.method320((int) (Math.random() * 256.0D));
				field493.method320((int) (Math.random() * 256.0D));
				field493.method320(128);
				field493.method320(50);

				if ((int) (Math.random() * 2.0D) == 0) {
					field493.method320(192);
				}

				field493.method329(field493.field971 - var1);
			}

			YVYOADIW.method587();
			method150();
			field347.method523();
			System.gc();

			for (int var2 = 0; var2 < 4; var2++) {
				field216[var2].method480();
			}

			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						field188[var3][var4][var5] = 0;
					}
				}
			}

			CDASFTJJ var6 = new CDASFTJJ(field383, field188, 104, 104);
			int var7 = field196.length;
			field493.method319(30);

			if (!field184) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (field537[var8] >> 8) * 64 - field199;
					int var10 = (field537[var8] & 0xFF) * 64 - field200;
					byte[] var11 = field196[var8];
					if (var11 != null) {
						var6.method39((field152 - 6) * 8, var10, (field151 - 6) * 8, var11, var9, field216);
					}
				}

				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (field537[var12] >> 8) * 64 - field199;
					int var14 = (field537[var12] & 0xFF) * 64 - field200;
					byte[] var15 = field196[var12];
					if (var15 == null && field152 < 800) {
						var6.method34(var13, var14, 64, 64);
					}
				}

				field493.method319(30);

				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = field516[var16];
					if (var17 != null) {
						int var18 = (field537[var16] >> 8) * 64 - field199;
						int var19 = (field537[var16] & 0xFF) * 64 - field200;
						var6.method47(var18, field347, field216, var19, var17);
					}
				}
			}

			if (field184) {
				for (int var20 = 0; var20 < 4; var20++) {
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							int var23 = field164[var20][var21][var22];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field537.length; var29++) {
									if (field537[var29] == var28 && field196[var29] != null) {
										var6.method28(var24, (var27 & 0x7) * 8, field216, field196[var29], var20, (var26 & 0x7) * 8, var21 * 8, var22 * 8, var25);
										break;
									}
								}
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field164[0][var30][var31];
						if (var32 == -1) {
							var6.method34(var30 * 8, var31 * 8, 8, 8);
						}
					}
				}

				field493.method319(30);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field164[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field537.length; var42++) {
									if (field537[var42] == var41 && field516[var42] != null) {
										var6.method46(var37, field516[var42], (var40 & 0x7) * 8, var34 * 8, (var39 & 0x7) * 8, field347, var38, var33, var35 * 8, field216);
										break;
									}
								}
							}
						}
					}
				}
			}

			field493.method319(30);
			var6.method30(field347, field216);

			if (field371 != null) {
				field371.method24();
				YVYOADIW.field1487 = field213;
			}

			field493.method319(30);
			int var43 = CDASFTJJ.field103;
			if (var43 > field540) {
				var43 = field540;
			}

			if (var43 < field540 - 1) {
				int var44 = field540 - 1;
			}

			if (field556) {
				field347.method524(CDASFTJJ.field103);
			} else {
				field347.method524(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method171(var45, var46);
				}
			}

			method92();
		} catch (Exception var59) {
		}

		LWJTLDAE.field918.method521();

		if (field1082 != null) {
			field493.method319(56);
			field493.method324(1057001181);
		}

		if (field556 && signlink.cache_dat != null) {
			int var48 = field234.method262(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field234.method273(var49);
				if ((var50 & 0x79) == 0) {
					PSGMMDJS.method409(var49);
				}
			}
		}

		System.gc();
		YVYOADIW.method588(20);
		field234.method260();
		int var51 = (field151 - 6) / 8 - 1;
		int var52 = (field151 + 6) / 8 + 1;
		int var53 = (field152 - 6) / 8 - 1;
		int var54 = (field152 + 6) / 8 + 1;
		if (field258) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field234.method257(var55, 0, var56);
					if (var57 != -1) {
						field234.method266(var57, 3);
					}

					int var58 = field234.method257(var55, 1, var56);
					if (var58 != -1) {
						field234.method266(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)Ljava/net/Socket;")
	public final Socket method133(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(BLPKHWFJLM;I)V")
	public final void method134(PKHWFJLM arg0, int arg1) {
		arg0.method340();
		int var3 = arg0.method341(8);
		if (var3 < field318) {
			for (int var4 = var3; var4 < field318; var4++) {
				field432[field431++] = field319[var4];
			}
		}

		if (var3 > field318) {
			signlink.reporterror(field122 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field318 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field319[var5];
			PDAYFSBN var7 = field317[var6];
			int var8 = arg0.method341(1);
			if (var8 == 0) {
				field319[field318++] = var6;
				var7.field1264 = field468;
			} else {
				int var9 = arg0.method341(2);
				if (var9 == 0) {
					field319[field318++] = var6;
					var7.field1264 = field468;
					field405[field404++] = var6;
				} else if (var9 == 1) {
					field319[field318++] = var6;
					var7.field1264 = field468;
					int var10 = arg0.method341(3);
					var7.method478(false, var10);
					int var11 = arg0.method341(1);
					if (var11 == 1) {
						field405[field404++] = var6;
					}
				} else if (var9 == 2) {
					field319[field318++] = var6;
					var7.field1264 = field468;
					int var12 = arg0.method341(3);
					var7.method478(true, var12);
					int var13 = arg0.method341(3);
					var7.method478(true, var13);
					int var14 = arg0.method341(1);
					if (var14 == 1) {
						field405[field404++] = var6;
					}
				} else if (var9 == 3) {
					field432[field431++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method135(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method135(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method136(int arg0) {
		int[] var2 = field485.field1302;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field188[arg0][var7][var5] & 0x18) == 0) {
					field347.method558(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field188[arg0 + 1][var7][var5] & 0x8) != 0) {
					field347.method558(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field485.method492();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field188[arg0][var11][var10] & 0x18) == 0) {
					method80(var8, var9, var11, arg0, var10);
				}

				if (arg0 < 3 && (field188[arg0 + 1][var11][var10] & 0x8) != 0) {
					method80(var8, var9, var11, arg0 + 1, var10);
				}
			}
		}

		if (field371 != null) {
			field371.method24();
			YVYOADIW.field1487 = field213;
		}

		field120++;
		if (field120 > 1003) {
			field120 = 0;
			field493.method319(21);
			field493.method320(0);
			int var12 = field493.field971;
			field493.method320((int) (Math.random() * 256.0D));
			field493.method321(1577);

			if ((int) (Math.random() * 2.0D) == 0) {
				field493.method321(10733);
			}

			field493.method321(30792);
			field493.method320((int) (Math.random() * 256.0D));
			field493.method320((int) (Math.random() * 256.0D));
			field493.method320(229);
			field493.method320((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field493.method320(88);
			}

			field493.method321((int) (Math.random() * 65536.0D));
			field493.method329(field493.field971 - var12);
		}

		field224 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field347.method552(field540, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = LWJTLDAE.method290(var15).field919;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field216[field540].field1295;
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

						field324[field224] = field353[var16];
						field225[field224] = var17;
						field226[field224] = var18;
						field224++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method137(boolean arg0) {
		for (int var2 = 0; var2 < field318; var2++) {
			PDAYFSBN var3 = field317[field319[var2]];
			int var4 = (field319[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method316() && var3.field969.field1459 == arg0 && var3.field969.method583()) {
				int var5 = var3.field1270 >> 7;
				int var6 = var3.field1271 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1243 == 1 && (var3.field1270 & 0x7F) == 0x40 && (var3.field1271 & 0x7F) == 0x40) {
						if (field440[var5][var6] == field525) {
							continue;
						}

						field440[var5][var6] = field525;
					}

					if (!var3.field969.field1443) {
						var4 += Integer.MIN_VALUE;
					}

					field347.method534(var3.field1271, field540, var3.field1270, var3.field1277, var3, method57(field540, var3.field1270, var3.field1271), (var3.field1243 - 1) * 64 + 60, var3.field1272, var4);
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 340);

			if (arg0.length == 5) {
				field553 = Integer.parseInt(arg0[0]);
				field554 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method52();
				} else if (arg0[2].equals("highmem")) {
					method101();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field555 = false;
				} else if (arg0[3].equals("members")) {
					field555 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method442(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method138(String arg0, int arg1) {
		field161 = arg1;
		field310 = arg0;
		method81();

		if (field228 == null) {
			super.method138(arg0, arg1);
		} else {
			field356.method24();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field466.method9(var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			CXMSQZVC.method203(var6, 34, 0x8C1111, var3 / 2 - 152, 304);
			CXMSQZVC.method203(var6 + 1, 32, 0, var3 / 2 - 151, 302);
			CXMSQZVC.method202(0x8C1111, var3 / 2 - 150, arg1 * 3, var6 + 2, 30);
			CXMSQZVC.method202(0, arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, var6 + 2, 30);
			field466.method9(var4 / 2 + 5 - var5, var3 / 2, arg0, 0xFFFFFF);
			field356.method25(171, field1079, 202);

			if (field509) {
				field509 = false;

				if (!field437) {
					field357.method25(0, field1079, 0);
					field358.method25(0, field1079, 637);
				}

				field354.method25(0, field1079, 128);
				field355.method25(371, field1079, 202);
				field359.method25(265, field1079, 0);
				field360.method25(265, field1079, 562);
				field361.method25(171, field1079, 128);
				field362.method25(171, field1079, 562);
			}
		}
	}

	public final void run() {
		if (field193) {
			method58();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method139() {
		for (IJDLXEFP var1 = (IJDLXEFP) field252.method510(); var1 != null; var1 = (IJDLXEFP) field252.method512()) {
			if (field540 != var1.field827 || field468 > var1.field823) {
				var1.method254();
			} else if (field468 >= var1.field822) {
				if (var1.field826 > 0) {
					PDAYFSBN var2 = field317[var1.field826 - 1];
					if (var2 != null && var2.field1270 >= 0 && var2.field1270 < 13312 && var2.field1271 >= 0 && var2.field1271 < 13312) {
						var1.method253(var2.field1270, var2.field1271, field468, method57(var1.field827, var2.field1270, var2.field1271) - var1.field808);
					}
				}

				if (var1.field826 < 0) {
					int var3 = -var1.field826 - 1;
					QGDSNXKJ var4;
					if (field381 == var3) {
						var4 = field288;
					} else {
						var4 = field401[var3];
					}

					if (var4 != null && var4.field1270 >= 0 && var4.field1270 < 13312 && var4.field1271 >= 0 && var4.field1271 < 13312) {
						var1.method253(var4.field1270, var4.field1271, field468, method57(var1.field827, var4.field1270, var4.field1271) - var1.field808);
					}
				}

				var1.method252(field233);
				field347.method534((int) var1.field815, field540, (int) var1.field814, false, var1, (int) var1.field816, 60, var1.field818, -1);
			}
		}
	}

	@ObfuscatedName("client.a(LPKHWFJLM;ZI)V")
	public final void method140(PKHWFJLM arg0, int arg1) {
		field431 = 0;
		field404 = 0;
		method130(arg0, arg1);
		method193(arg0, arg1);
		method187(arg1, arg0);
		method78(arg1, arg0);

		for (int var3 = 0; var3 < field431; var3++) {
			int var4 = field432[var3];
			if (field468 != field401[var4].field1264) {
				field401[var4] = null;
			}
		}

		if (arg0.field971 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field971 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field402; var5++) {
			if (field401[field403[var5]] == null) {
				signlink.reporterror(field122 + " null entry in pl list - pos:" + var5 + " size:" + field402);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIILRRTTGXYM;I)V")
	public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, RRTTGXYM arg5, int arg6) {
		if (arg5.field1183 == 0 && arg5.field1210 != null && !arg5.field1186 && (arg2 >= arg6 && arg0 >= arg4 && arg2 <= arg5.field1200 + arg6 && arg0 <= arg5.field1161 + arg4)) {
			int var8 = arg5.field1210.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg5.field1142[var9] + arg6;
				int var11 = arg5.field1171[var9] + arg4 - arg1;
				RRTTGXYM var12 = RRTTGXYM.method458(arg5.field1210[var9]);
				var10 += var12.field1168;
				var11 += var12.field1188;
				if ((var12.field1206 >= 0 || var12.field1198 != 0) && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
					if (var12.field1206 >= 0) {
						field364 = var12.field1206;
					} else {
						field364 = var12.field1169;
					}
				}

				if (var12.field1183 == 8 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
					field136 = var12.field1169;
				}

				if (var12.field1183 == 0) {
					method141(arg0, var12.field1143, arg2, arg3, var11, var12, var10);

					if (var12.field1190 > var12.field1161) {
						method117(var12.field1161, var12.field1190, arg2, var12, arg0, arg3, var12.field1200 + var10, var11);
					}
				} else {
					if (var12.field1141 == 1 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						boolean var13 = false;
						if (var12.field1178 != 0) {
							var13 = method74(var12);
						}

						if (!var13) {
							field333[field345] = var12.field1185;
							field529[field345] = 836;
							field528[field345] = var12.field1169;
							field345++;
						}
					}

					if (var12.field1141 == 2 && field531 == 0 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						String var14 = var12.field1203;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field333[field345] = var14 + " @gre@" + var12.field1166;
						field529[field345] = 924;
						field528[field345] = var12.field1169;
						field345++;
					}

					if (var12.field1141 == 3 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						field333[field345] = "Close";

						if (arg3 == 3) {
							field529[field345] = 684;
						} else {
							field529[field345] = 991;
						}

						field528[field345] = var12.field1169;
						field345++;
					}

					if (var12.field1141 == 4 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						field333[field345] = var12.field1185;
						field529[field345] = 877;
						field528[field345] = var12.field1169;
						field345++;
					}

					if (var12.field1141 == 5 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						field333[field345] = var12.field1185;
						field529[field345] = 529;
						field528[field345] = var12.field1169;
						field345++;
					}

					if (var12.field1141 == 6 && !field194 && arg2 >= var10 && arg0 >= var11 && arg2 < var12.field1200 + var10 && arg0 < var12.field1161 + var11) {
						field333[field345] = var12.field1185;
						field529[field345] = 856;
						field528[field345] = var12.field1169;
						field345++;
					}

					if (var12.field1183 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1161; var16++) {
							for (int var17 = 0; var17 < var12.field1200; var17++) {
								int var18 = (var12.field1167 + 32) * var17 + var10;
								int var19 = (var12.field1204 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1153[var15];
									var19 += var12.field1157[var15];
								}

								if (arg2 >= var18 && arg0 >= var19 && arg2 < var18 + 32 && arg0 < var19 + 32) {
									field397 = var15;
									field398 = var12.field1169;

									if (var12.field1187[var15] > 0) {
										HCJYZKIH var20 = HCJYZKIH.method236(var12.field1187[var15] - 1);
										if (field348 == 1 && var12.field1159) {
											if (field350 != var12.field1169 || field349 != var15) {
												field333[field345] = "Use " + field352 + " with @lre@" + var20.field727;
												field529[field345] = 486;
												field530[field345] = var20.field743;
												field527[field345] = var15;
												field528[field345] = var12.field1169;
												field345++;
											}
										} else if (field531 != 1 || !var12.field1159) {
											if (var12.field1159) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field734 != null && var20.field734[var21] != null) {
														field333[field345] = var20.field734[var21] + " @lre@" + var20.field727;

														if (var21 == 3) {
															field529[field345] = 194;
														}

														if (var21 == 4) {
															field529[field345] = 840;
														}

														field530[field345] = var20.field743;
														field527[field345] = var15;
														field528[field345] = var12.field1169;
														field345++;
													} else if (var21 == 4) {
														field333[field345] = "Drop @lre@" + var20.field727;
														field529[field345] = 840;
														field530[field345] = var20.field743;
														field527[field345] = var15;
														field528[field345] = var12.field1169;
														field345++;
													}
												}
											}

											if (var12.field1194) {
												field333[field345] = "Use @lre@" + var20.field727;
												field529[field345] = 901;
												field530[field345] = var20.field743;
												field527[field345] = var15;
												field528[field345] = var12.field1169;
												field345++;
											}

											if (var12.field1159 && var20.field734 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field734[var22] != null) {
														field333[field345] = var20.field734[var22] + " @lre@" + var20.field727;

														if (var22 == 0) {
															field529[field345] = 99;
														}

														if (var22 == 1) {
															field529[field345] = 600;
														}

														if (var22 == 2) {
															field529[field345] = 300;
														}

														field530[field345] = var20.field743;
														field527[field345] = var15;
														field528[field345] = var12.field1169;
														field345++;
													}
												}
											}

											if (var12.field1211 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1211[var23] != null) {
														field333[field345] = var12.field1211[var23] + " @lre@" + var20.field727;

														if (var23 == 0) {
															field529[field345] = 849;
														}

														if (var23 == 1) {
															field529[field345] = 92;
														}

														if (var23 == 2) {
															field529[field345] = 204;
														}

														if (var23 == 3) {
															field529[field345] = 357;
														}

														if (var23 == 4) {
															field529[field345] = 371;
														}

														field530[field345] = var20.field743;
														field527[field345] = var15;
														field528[field345] = var12.field1169;
														field345++;
													}
												}
											}

											field333[field345] = "Examine @lre@" + var20.field727;
											field529[field345] = 1630;
											field530[field345] = var20.field743;
											field527[field345] = var15;
											field528[field345] = var12.field1169;
											field345++;
										} else if ((field533 & 0x10) == 0x10) {
											field333[field345] = field534 + " @lre@" + var20.field727;
											field529[field345] = 104;
											field530[field345] = var20.field743;
											field527[field345] = var15;
											field528[field345] = var12.field1169;
											field345++;
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

	@ObfuscatedName("client.t(Z)V")
	public final void method142() {
		for (int var1 = -1; var1 < field402; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field400;
			} else {
				var2 = field403[var1];
			}

			QGDSNXKJ var3 = field401[var2];
			if (var3 != null && var3.field1251 > 0) {
				var3.field1251--;
				if (var3.field1251 == 0) {
					var3.field1276 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field318; var4++) {
			int var5 = field319[var4];
			PDAYFSBN var6 = field317[var5];
			if (var6 != null && var6.field1251 > 0) {
				var6.field1251--;
				if (var6.field1251 == 0) {
					var6.field1276 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method143() {
		byte[] var1 = field228.method506("title.dat", null);
		TTFRDWZK var2 = new TTFRDWZK(var1, this);
		field357.method24();
		var2.method495(0, 0);
		field358.method24();
		var2.method495(0, -637);
		field354.method24();
		var2.method495(0, -128);
		field355.method24();
		var2.method495(-371, -202);
		field356.method24();
		var2.method495(-171, -202);
		field359.method24();
		var2.method495(-265, 0);
		field360.method24();
		var2.method495(-265, -562);
		field361.method24();
		var2.method495(-171, -128);
		field362.method24();
		var2.method495(-171, -562);
		int[] var3 = new int[var2.field1303];
		for (int var4 = 0; var4 < var2.field1304; var4++) {
			for (int var5 = 0; var5 < var2.field1303; var5++) {
				var3[var5] = var2.field1302[var2.field1303 * var4 + var2.field1303 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1303; var6++) {
				var2.field1302[var2.field1303 * var4 + var6] = var3[var6];
			}
		}

		field357.method24();
		var2.method495(0, 382);
		field358.method24();
		var2.method495(0, -255);
		field354.method24();
		var2.method495(0, 254);
		field355.method24();
		var2.method495(-371, 180);
		field356.method24();
		var2.method495(-171, 180);
		field359.method24();
		var2.method495(-265, 382);
		field360.method24();
		var2.method495(-265, -180);
		field361.method24();
		var2.method495(-171, 254);
		field362.method24();
		var2.method495(-171, -180);
		TTFRDWZK var7 = new TTFRDWZK(field228, "logo", 0);
		field354.method24();
		var7.method497(382 - var7.field1303 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(I)V")
	public final void method144() {
		if (!field277 && !field492 && !field157) {
			field468++;

			if (field162) {
				method95();
			} else {
				method99();
			}

			method168();
		}
	}

	@ObfuscatedName("client.a(IBLTTFRDWZK;I)V")
	public final void method145(int arg0, TTFRDWZK arg1, int arg2) {
		int var4 = field321 + field231 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = PSGMMDJS.field1059[var4];
			int var7 = PSGMMDJS.field1060[var4];
			var6 = var6 * 256 / (field278 + 256);
			var7 = var7 * 256 / (field278 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method503(var8 + 94 + 4 - arg1.field1307 / 2, 83 - var9 - arg1.field1308 / 2 - 4, field339);
			} else {
				arg1.method497(var8 + 94 + 4 - arg1.field1307 / 2, 83 - var9 - arg1.field1308 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method146() {
		if (field315 > 0) {
			method123();
		} else {
			method124("Connection lost", "Please wait - attempting to reestablish");
			field469 = 0;
			field483 = 0;
			FKSZIRZG var1 = field255;
			field162 = false;
			field195 = 0;
			method120(field122, field123, true);

			if (!field162) {
				method123();
			}

			try {
				var1.method225();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.u(Z)V")
	public final void method147() {
		if (field257 != 0) {
			int var1 = 0;
			if (field367 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field192[var2] != null) {
					int var3 = field190[var2];
					String var4 = field191[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field518 == 0 || field518 == 1 && method64(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1087 > 4 && field1088 - 4 > var8 - 10 && field1088 - 4 <= var8 + 3) {
							int var9 = field465.method11("From:  " + var4 + field192[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1087 < var9 + 4) {
								if (field438 >= 1) {
									field333[field345] = "Report abuse @whi@" + var4;
									field529[field345] = 2556;
									field345++;
								}

								field333[field345] = "Add ignore @whi@" + var4;
								field529[field345] = 2913;
								field345++;
								field333[field345] = "Add friend @whi@" + var4;
								field529[field345] = 2695;
								field345++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field518 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.v(Z)V")
	public final void method148() {
		for (CSVVQIMY var1 = (CSVVQIMY) field197.method510(); var1 != null; var1 = (CSVVQIMY) field197.method512()) {
			if (field540 != var1.field558 || var1.field562) {
				var1.method254();
			} else if (field468 >= var1.field565) {
				var1.method195(field233);

				if (var1.field562) {
					var1.method254();
				} else {
					field347.method534(var1.field560, var1.field558, var1.field559, false, var1, var1.field561, 60, 0, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.b(LRRTTGXYM;I)Z")
	public final boolean method149(RRTTGXYM arg0) {
		int var2 = arg0.field1178;
		if (field138 == 2) {
			if (var2 == 201) {
				field270 = true;
				field218 = 0;
				field145 = true;
				field380 = "";
				field452 = 1;
				field343 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field270 = true;
				field218 = 0;
				field145 = true;
				field380 = "";
				field452 = 2;
				field343 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field315 = 250;
			return true;
		}

		if (var2 == 501) {
			field270 = true;
			field218 = 0;
			field145 = true;
			field380 = "";
			field452 = 4;
			field343 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field270 = true;
			field218 = 0;
			field145 = true;
			field380 = "";
			field452 = 5;
			field343 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field521[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = PTKBILNJ.field1063 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= PTKBILNJ.field1063) {
							var5 = 0;
						}
					}

					if (!PTKBILNJ.field1064[var5].field1070 && PTKBILNJ.field1064[var5].field1065 == var3 + (field510 ? 0 : 7)) {
						break;
					}
				}

				field521[var3] = var5;
				field552 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field495[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field503[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field503[var6].length) {
					var8 = 0;
				}
			}

			field495[var6] = var8;
			field552 = true;
		}

		if (var2 == 324 && !field510) {
			field510 = true;
			method90();
		}

		if (var2 == 325 && field510) {
			field510 = false;
			method90();
		}

		if (var2 == 326) {
			field493.method319(244);
			field493.method320(field510 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field493.method320(field521[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field493.method320(field495[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field133 = !field133;
		}

		if (var2 >= 601 && var2 <= 613) {
			method103();

			if (field163.length() > 0) {
				field493.method319(164);
				field493.method326(MYWERTTF.method300(field163));
				field493.method320(var2 - 601);
				field493.method320(field133 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method150() {
		LWJTLDAE.field918.method521();
		LWJTLDAE.field928.method521();
		YIBRLAQY.field1445.method521();
		HCJYZKIH.field768.method521();
		HCJYZKIH.field769.method521();
		QGDSNXKJ.field1103.method521();
		HTWOTIWO.field790.method521();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method151() {
		if (field277 || field492 || field157) {
			method60();
		} else {
			field265++;

			if (field162) {
				method114();
			} else {
				method89(false);
			}

			field222 = 0;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method152() {
		method51();

		if (field450 == 1) {
			field461[field449 / 100].method497(field447 - 8 - 4, field448 - 8 - 4);
		}

		if (field450 == 2) {
			field461[field449 / 100 + 4].method497(field447 - 8 - 4, field448 - 8 - 4);
		}

		if (field142 != -1) {
			method131(field142, field233);
			method172(0, 0, RRTTGXYM.method458(field142), 0);
		}

		if (field329 != -1) {
			method131(field329, field233);
			method172(0, 0, RRTTGXYM.method458(field329), 0);
		}

		method162();

		if (!field294) {
			method185();
			method177();
		} else if (field375 == 0) {
			method84();
		}

		if (field332 == 1) {
			field434.method497(472, 296);
		}

		if (field179) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1075 < 30 && field556) {
				var3 = 0xFF0000;
			}

			if (field1075 < 20 && !field556) {
				var3 = 0xFF0000;
			}

			field465.method8("Fps:" + field1075, var2, var3, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field556) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field556) {
				int var8 = 0xFF0000;
			}

			field465.method8("Mem:" + var5 + "k", var2, 0xFFFF00, var1);
			var2 += 15;
		}

		if (field367 != 0) {
			int var9 = field367 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field465.method13(4, "System update in: " + var10 + ":0" + var9, 0xFFFF00, 329);
			} else {
				field465.method13(4, "System update in: " + var10 + ":" + var9, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.a(LTTFRDWZK;IZI)V")
	public final void method153(TTFRDWZK arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field321 + field231 & 0x7FF;
			int var6 = PSGMMDJS.field1059[var5];
			int var7 = PSGMMDJS.field1060[var5];
			var6 = var6 * 256 / (field278 + 256);
			var7 = var7 * 256 / (field278 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field235.method502(256, 15, var10, 15, 20, 83 - var13 - 20, var12 + 94 + 4 - 10, 20);
		} else {
			method145(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.a(IIZIIIIIII)V")
	public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		NTHYVEDA var10 = null;
		for (NTHYVEDA var11 = (NTHYVEDA) field187.method510(); var11 != null; var11 = (NTHYVEDA) field187.method512()) {
			if (var11.field959 == arg6 && var11.field961 == arg4 && var11.field962 == arg1 && var11.field960 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new NTHYVEDA();
			var10.field959 = arg6;
			var10.field960 = arg0;
			var10.field961 = arg4;
			var10.field962 = arg1;
			method77(var10);
			field187.method507(var10);
		}

		var10.field953 = arg7;
		var10.field955 = arg3;
		var10.field954 = arg8;
		var10.field952 = arg2;
		var10.field963 = arg5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method155(String arg0) throws IOException {
		if (field131) {
			if (field247 != null) {
				try {
					field247.close();
				} catch (Exception var4) {
				}

				field247 = null;
			}

			field247 = method133(43595);
			field247.setSoTimeout(10000);
			InputStream var2 = field247.getInputStream();
			OutputStream var3 = field247.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.x(I)I")
	public final int method156() {
		int var1 = 3;
		if (field292 < 310) {
			int var2 = field289 >> 7;
			int var3 = field291 >> 7;
			int var4 = field288.field1270 >> 7;
			int var5 = field288.field1271 >> 7;

			if ((field188[field540][var2][var3] & 0x4) != 0) {
				var1 = field540;
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

					if ((field188[field540][var2][var3] & 0x4) != 0) {
						var1 = field540;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field188[field540][var2][var3] & 0x4) != 0) {
							var1 = field540;
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

					if ((field188[field540][var2][var3] & 0x4) != 0) {
						var1 = field540;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field188[field540][var2][var3] & 0x4) != 0) {
							var1 = field540;
						}
					}
				}
			}
		}

		if ((field188[field540][field288.field1270 >> 7][field288.field1271 >> 7] & 0x4) != 0) {
			var1 = field540;
		}

		return var1;
	}

	@ObfuscatedName("client.y(I)I")
	public final int method157() {
		int var1 = method57(field540, field289, field291);
		if (var1 - field290 < 800 && (field188[field540][field289 >> 7][field291 >> 7] & 0x4) != 0) {
			return field540;
		}

		return 3;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method158(String arg0) {
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

	@ObfuscatedName("client.b(JI)V")
	public final void method159(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field144; var3++) {
				if (field180[var3] == arg0) {
					field144--;
					field276 = true;

					for (int var4 = var3; var4 < field144; var4++) {
						field180[var4] = field180[var4 + 1];
					}

					field493.method319(38);
					field493.method326(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void method160() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field189);

		if (field234 != null) {
			System.out.println("Od-cycle:" + field234.field850);
		}

		System.out.println("loop-cycle:" + field468);
		System.out.println("draw-cycle:" + field265);
		System.out.println("ptype:" + field312);
		System.out.println("psize:" + field311);

		if (field255 != null) {
			field255.method230();
		}

		field1076 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method161() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1082 != null) {
			return field1082;
		}

		return this;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method162() {
		field463 = 0;
		int var1 = (field288.field1270 >> 7) + field199;
		int var2 = (field288.field1271 >> 7) + field200;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field463 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field463 = 1;
		}

		if (field463 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field463 = 0;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method163() {
		field509 = true;
	}

	@ObfuscatedName("client.b(LPKHWFJLM;II)V")
	public final void method164(PKHWFJLM arg0, int arg1) {
		while (arg0.field972 + 21 < arg1 * 8) {
			int var3 = arg0.method341(14);
			if (var3 == 16383) {
				break;
			}

			if (field317[var3] == null) {
				field317[var3] = new PDAYFSBN();
			}

			PDAYFSBN var4 = field317[var3];
			field319[field318++] = var3;
			var4.field1264 = field468;
			int var5 = arg0.method341(1);
			int var6 = arg0.method341(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method341(1);
			if (var7 == 1) {
				field405[field404++] = var3;
			}

			var4.field969 = YIBRLAQY.method579(arg0.method341(12));
			int var8 = arg0.method341(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1243 = var4.field969.field1475;
			var4.field1269 = var4.field969.field1454;
			var4.field1287 = var4.field969.field1472;
			var4.field1288 = var4.field969.field1457;
			var4.field1289 = var4.field969.field1468;
			var4.field1290 = var4.field969.field1441;
			var4.field1239 = var4.field969.field1464;
			var4.method476(field288.field1236[0] + var6, field288.field1237[0] + var8, var5 == 1);
		}

		arg0.method342();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method165() {
		if (field130 == 2) {
			for (NTHYVEDA var1 = (NTHYVEDA) field187.method510(); var1 != null; var1 = (NTHYVEDA) field187.method512()) {
				if (var1.field963 > 0) {
					var1.field963--;
				}

				if (var1.field963 != 0) {
					if (var1.field952 > 0) {
						var1.field952--;
					}

					if (var1.field952 == 0 && var1.field961 >= 1 && var1.field962 >= 1 && var1.field961 <= 102 && var1.field962 <= 102 && (var1.field953 < 0 || CDASFTJJ.method41(var1.field953, var1.field955))) {
						method85(var1.field955, var1.field953, var1.field962, var1.field959, var1.field961, var1.field954, var1.field960);
						var1.field952 = -1;

						if (var1.field956 == var1.field953 && var1.field956 == -1) {
							var1.method254();
						} else if (var1.field956 == var1.field953 && var1.field957 == var1.field954 && var1.field958 == var1.field955) {
							var1.method254();
						}
					}
				} else if (var1.field956 < 0 || CDASFTJJ.method41(var1.field956, var1.field958)) {
					method85(var1.field958, var1.field956, var1.field962, var1.field959, var1.field961, var1.field957, var1.field960);
					var1.method254();
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method166() {
		int var1 = 5;
		field230[8] = 0;
		int var2 = 0;
		while (field230[8] == 0) {
			String var3 = "Unknown problem";
			method138("Connecting to web server", 20);

			try {
				DataInputStream var4 = method155("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 340);
				PKHWFJLM var5 = new PKHWFJLM(new byte[40]);
				var4.readFully(var5.field970, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field230[var6] = var5.method335();
				}

				int var7 = var5.method335();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field230[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field230[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field230[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field230[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field230[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field230[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method138("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method138(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field131 = !field131;
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method167() {
		signlink.reporterror = false;

		try {
			if (field255 != null) {
				field255.method225();
			}
		} catch (Exception var1) {
		}

		field255 = null;
		method65();

		if (field281 != null) {
			field281.field1298 = false;
		}

		field281 = null;
		field234.method274();
		field234 = null;
		field316 = null;
		field493 = null;
		field271 = null;
		field134 = null;
		field537 = null;
		field196 = null;
		field516 = null;
		field538 = null;
		field539 = null;
		field383 = null;
		field188 = null;
		field347 = null;
		field216 = null;
		field441 = null;
		field435 = null;
		field547 = null;
		field548 = null;
		field439 = null;
		field369 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field154 = null;
		field155 = null;
		field156 = null;
		field417 = null;
		field418 = null;
		field419 = null;
		field420 = null;
		field421 = null;
		field422 = null;
		field423 = null;
		field424 = null;
		field425 = null;
		field338 = null;
		field339 = null;
		field340 = null;
		field272 = null;
		field273 = null;
		field274 = null;
		field284 = null;
		field541 = null;
		field542 = null;
		field543 = null;
		field544 = null;
		field545 = null;
		field487 = null;
		field488 = null;
		field489 = null;
		field490 = null;
		field491 = null;
		field520 = null;
		field229 = null;
		field373 = null;
		field327 = null;
		field132 = null;
		field461 = null;
		field434 = null;
		field300 = null;
		field301 = null;
		field302 = null;
		field303 = null;
		field304 = null;
		field237 = null;
		field353 = null;
		field440 = null;
		field401 = null;
		field403 = null;
		field405 = null;
		field406 = null;
		field432 = null;
		field317 = null;
		field319 = null;
		field287 = null;
		field187 = null;
		field252 = null;
		field197 = null;
		field527 = null;
		field528 = null;
		field529 = null;
		field530 = null;
		field333 = null;
		field165 = null;
		field225 = null;
		field226 = null;
		field324 = null;
		field485 = null;
		field396 = null;
		field261 = null;
		field282 = null;
		field357 = null;
		field358 = null;
		field354 = null;
		field355 = null;
		field356 = null;
		field359 = null;
		field360 = null;
		field361 = null;
		field362 = null;
		method102();
		LWJTLDAE.method292();
		YIBRLAQY.method578();
		HCJYZKIH.method239();
		RRTTGXYM.method463();
		QXFWPOFL.field1128 = null;
		PTKBILNJ.field1064 = null;
		HUTUFYHD.field791 = null;
		DWUJPTWU.field586 = null;
		HTWOTIWO.field778 = null;
		HTWOTIWO.field790 = null;
		XESCWZPS.field1424 = null;
		field1080 = null;
		QGDSNXKJ.field1103 = null;
		YVYOADIW.method584();
		WJVLISUF.method522();
		PSGMMDJS.method406();
		AOFTXYIM.method3();
		System.gc();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method168() {
		while (true) {
			MNWUSGDU var1 = field234.method267();
			if (var1 == null) {
				return;
			}

			if (var1.field937 == 0) {
				PSGMMDJS.method408(var1.field939, var1.field940);

				if ((field234.method273(var1.field939) & 0x62) != 0) {
					field276 = true;

					if (field296 != -1 || field462 != -1) {
						field270 = true;
					}
				}
			}

			if (var1.field937 == 1 && var1.field940 != null) {
				AOFTXYIM.method2(var1.field940);
			}

			if (var1.field937 == 2 && field253 == var1.field939 && var1.field940 != null) {
				method190(var1.field940, field254);
			}

			if (var1.field937 == 3 && field130 == 1) {
				for (int var2 = 0; var2 < field196.length; var2++) {
					if (field538[var2] == var1.field939) {
						field196[var2] = var1.field940;

						if (var1.field940 == null) {
							field538[var2] = -1;
						}

						break;
					}

					if (field539[var2] == var1.field939) {
						field516[var2] = var1.field940;

						if (var1.field940 == null) {
							field539[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field937 == 93 && field234.method264(var1.field939)) {
				CDASFTJJ.method27(new PKHWFJLM(var1.field940), field234);
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method169(int arg0) {
		RRTTGXYM var2 = RRTTGXYM.method458(arg0);
		for (int var3 = 0; var3 < var2.field1210.length && var2.field1210[var3] != -1; var3++) {
			RRTTGXYM var4 = RRTTGXYM.method458(var2.field1210[var3]);
			if (var4.field1183 == 1) {
				method169(var4.field1169);
			}

			var4.field1197 = 0;
			var4.field1148 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method170() {
		if (field1080 == null) {
			method102();
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field362 = null;
			field372 = null;
			field370 = null;
			field369 = null;
			field371 = null;
			field154 = null;
			field155 = null;
			field156 = null;
			field1080 = new BEVLZSVU(503, 765, method161());
			field509 = true;
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method171(int arg0, int arg1) {
		UEUHLQTT var3 = field287[field540][arg0][arg1];
		if (var3 == null) {
			field347.method544(field540, arg0, arg1);
		} else {
			int var4 = -99999999;
			LCFGLQPE var5 = null;
			for (LCFGLQPE var6 = (LCFGLQPE) var3.method510(); var6 != null; var6 = (LCFGLQPE) var3.method512()) {
				HCJYZKIH var7 = HCJYZKIH.method236(var6.field878);
				int var8 = var7.field747;
				if (var7.field746) {
					var8 = (var6.field877 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method508(var5);
			LCFGLQPE var9 = null;
			LCFGLQPE var10 = null;
			for (LCFGLQPE var11 = (LCFGLQPE) var3.method510(); var11 != null; var11 = (LCFGLQPE) var3.method512()) {
				if (var5.field878 != var11.field878 && var9 == null) {
					var9 = var11;
				}

				if (var5.field878 != var11.field878 && var9.field878 != var11.field878 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field347.method530(var9, field540, var5, var12, arg0, arg1, var10, method57(field540, arg0 * 128 + 64, arg1 * 128 + 64));
		}
	}

	@ObfuscatedName("client.a(IIILRRTTGXYM;I)V")
	public final void method172(int arg0, int arg1, RRTTGXYM arg2, int arg3) {
		if (arg2.field1183 == 0 && arg2.field1210 != null && (!arg2.field1186 || field124 == arg2.field1169 || field168 == arg2.field1169 || field433 == arg2.field1169)) {
			int var5 = CXMSQZVC.field572;
			int var6 = CXMSQZVC.field570;
			int var7 = CXMSQZVC.field573;
			int var8 = CXMSQZVC.field571;
			CXMSQZVC.method199(arg2.field1161 + arg0, arg0, arg3, arg2.field1200 + arg3);
			int var9 = arg2.field1210.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1142[var10] + arg3;
				int var12 = arg2.field1171[var10] + arg0 - arg1;
				RRTTGXYM var13 = RRTTGXYM.method458(arg2.field1210[var10]);
				var11 += var13.field1168;
				var12 += var13.field1188;

				if (var13.field1178 > 0) {
					method67(var13);
				}

				if (var13.field1183 == 0) {
					if (var13.field1143 > var13.field1190 - var13.field1161) {
						var13.field1143 = var13.field1190 - var13.field1161;
					}

					if (var13.field1143 < 0) {
						var13.field1143 = 0;
					}

					method172(var12, var13.field1143, var13, var11);

					if (var13.field1190 > var13.field1161) {
						method188(var13.field1190, var13.field1161, var12, var13.field1200 + var11, var13.field1143);
					}
				} else if (var13.field1183 != 1) {
					if (var13.field1183 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1161; var15++) {
							for (int var16 = 0; var16 < var13.field1200; var16++) {
								int var17 = (var13.field1167 + 32) * var16 + var11;
								int var18 = (var13.field1204 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1153[var14];
									var18 += var13.field1157[var14];
								}

								if (var13.field1187[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1187[var14] - 1;
									if (var17 > CXMSQZVC.field572 - 32 && var17 < CXMSQZVC.field573 && var18 > CXMSQZVC.field570 - 32 && var18 < CXMSQZVC.field571 || field410 != 0 && field409 == var14) {
										int var22 = 0;
										if (field348 == 1 && field349 == var14 && field350 == var13.field1169) {
											var22 = 0xFFFFFF;
										}

										TTFRDWZK var23 = HCJYZKIH.method240(var22, var13.field1212[var14], var21);
										if (var23 != null) {
											if (field410 != 0 && field409 == var14 && field408 == var13.field1169) {
												var19 = field1087 - field411;
												var20 = field1088 - field412;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field299 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method499(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < CXMSQZVC.field570 && arg2.field1143 > 0) {
													int var24 = (CXMSQZVC.field570 - var18 - var20) * field233 / 3;
													if (var24 > field233 * 10) {
														var24 = field233 * 10;
													}

													if (var24 > arg2.field1143) {
														var24 = arg2.field1143;
													}

													arg2.field1143 -= var24;
													field412 += var24;
												}

												if (var18 + var20 + 32 > CXMSQZVC.field571 && arg2.field1143 < arg2.field1190 - arg2.field1161) {
													int var25 = (var18 + var20 + 32 - CXMSQZVC.field571) * field233 / 3;
													if (var25 > field233 * 10) {
														var25 = field233 * 10;
													}

													if (var25 > arg2.field1190 - arg2.field1161 - arg2.field1143) {
														var25 = arg2.field1190 - arg2.field1161 - arg2.field1143;
													}

													arg2.field1143 += var25;
													field412 -= var25;
												}
											} else if (field457 != 0 && field456 == var14 && field455 == var13.field1169) {
												var23.method499(var17, var18, 128);
											} else {
												var23.method497(var17, var18);
											}

											if (var23.field1307 == 33 || var13.field1212[var14] != 1) {
												int var26 = var13.field1212[var14];
												field464.method13(var17 + var19 + 1, method182(var26), 0, var18 + var20 + 10);
												field464.method13(var17 + var19, method182(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1184 != null && var14 < 20) {
									TTFRDWZK var27 = var13.field1184[var14];
									if (var27 != null) {
										var27.method497(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1183 == 3) {
						boolean var28 = false;
						if (field433 == var13.field1169 || field168 == var13.field1169 || field124 == var13.field1169) {
							var28 = true;
						}

						int var29;
						if (method83(var13)) {
							var29 = var13.field1201;
							if (var28 && var13.field1163 != 0) {
								var29 = var13.field1163;
							}
						} else {
							var29 = var13.field1165;
							if (var28 && var13.field1198 != 0) {
								var29 = var13.field1198;
							}
						}

						if (var13.field1158 == 0) {
							if (var13.field1146) {
								CXMSQZVC.method202(var29, var11, var13.field1200, var12, var13.field1161);
							} else {
								CXMSQZVC.method203(var12, var13.field1161, var29, var11, var13.field1200);
							}
						} else if (var13.field1146) {
							CXMSQZVC.method201(var29, var12, var13.field1161, 256 - (var13.field1158 & 0xFF), var11, var13.field1200);
						} else {
							CXMSQZVC.method204(var13.field1200, 256 - (var13.field1158 & 0xFF), var11, var13.field1161, var12, var29);
						}
					} else if (var13.field1183 == 4) {
						BDJKVJZU var30 = var13.field1160;
						String var31 = var13.field1205;
						boolean var32 = false;
						if (field433 == var13.field1169 || field168 == var13.field1169 || field124 == var13.field1169) {
							var32 = true;
						}

						int var33;
						if (method83(var13)) {
							var33 = var13.field1201;
							if (var32 && var13.field1163 != 0) {
								var33 = var13.field1163;
							}

							if (var13.field1147.length() > 0) {
								var31 = var13.field1147;
							}
						} else {
							var33 = var13.field1165;
							if (var32 && var13.field1198 != 0) {
								var33 = var13.field1198;
							}
						}

						if (var13.field1141 == 6 && field194) {
							var31 = "Please wait...";
							var33 = var13.field1165;
						}

						if (CXMSQZVC.field568 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field42 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method86(method100(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method86(method100(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method86(method100(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method86(method100(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method86(method100(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1192) {
								var30.method10(var13.field1200 / 2 + var11, var41, var13.field1170, var34, var33);
							} else {
								var30.method17(var34, var11, var33, var41, var13.field1170);
							}

							var34 += var30.field42;
						}
					} else if (var13.field1183 == 5) {
						TTFRDWZK var42;
						if (method83(var13)) {
							var42 = var13.field1202;
						} else {
							var42 = var13.field1162;
						}

						if (var42 != null) {
							var42.method497(var11, var12);
						}
					} else if (var13.field1183 == 6) {
						int var43 = YVYOADIW.field1481;
						int var44 = YVYOADIW.field1482;
						YVYOADIW.field1481 = var13.field1200 / 2 + var11;
						YVYOADIW.field1482 = var13.field1161 / 2 + var12;
						int var45 = YVYOADIW.field1485[var13.field1174] * var13.field1173 >> 16;
						int var46 = YVYOADIW.field1486[var13.field1174] * var13.field1173 >> 16;
						boolean var47 = method83(var13);
						int var48;
						if (var47) {
							var48 = var13.field1150;
						} else {
							var48 = var13.field1149;
						}

						PSGMMDJS var49;
						if (var48 == -1) {
							var49 = var13.method466(-1, -1, var47);
						} else {
							DWUJPTWU var50 = DWUJPTWU.field586[var48];
							var49 = var13.method466(var50.field588[var13.field1197], var50.field589[var13.field1197], var47);
						}

						if (var49 != null) {
							var49.method430(0, var13.field1175, 0, var13.field1174, 0, var45, var46);
						}

						YVYOADIW.field1481 = var43;
						YVYOADIW.field1482 = var44;
					} else {
						if (var13.field1183 == 7) {
							BDJKVJZU var51 = var13.field1160;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1161; var53++) {
								for (int var54 = 0; var54 < var13.field1200; var54++) {
									if (var13.field1187[var52] > 0) {
										HCJYZKIH var55 = HCJYZKIH.method236(var13.field1187[var52] - 1);
										String var56 = var55.field727;
										if (var55.field746 || var13.field1212[var52] != 1) {
											var56 = var56 + " x" + method178(var13.field1212[var52]);
										}

										int var57 = (var13.field1167 + 115) * var54 + var11;
										int var58 = (var13.field1204 + 12) * var53 + var12;
										if (var13.field1192) {
											var51.method10(var13.field1200 / 2 + var57, var56, var13.field1170, var58, var13.field1165);
										} else {
											var51.method17(var58, var57, var13.field1165, var56, var13.field1170);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1183 == 8 && (field227 == var13.field1169 || field171 == var13.field1169 || field519 == var13.field1169) && field335 == 100) {
							int var59 = 0;
							int var60 = 0;
							BDJKVJZU var61 = field465;
							String var62 = var13.field1205;
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

								int var65 = var61.method11(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field42 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1200 + var11 - var59 - 5;
							int var67 = var13.field1161 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1200 + arg3) {
								var66 = arg2.field1200 + arg3 - var59;
							}

							CXMSQZVC.method202(0xFFFFA0, var66, var59, var67, var60);
							CXMSQZVC.method203(var67, var60, 0, var66, var59);
							String var68 = var13.field1205;
							int var69 = var61.field42 + var67 + 2;
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

								var61.method17(var69, var66 + 3, 0, var71, false);
								var69 += var61.field42 + 1;
							}
						}
					}
				}
			}

			CXMSQZVC.method199(var8, var6, var5, var7);
		}
	}

	@ObfuscatedName("client.a(IIILYIBRLAQY;I)V")
	public final void method173(int arg0, int arg1, YIBRLAQY arg2, int arg3) {
		if (field345 < 400) {
			if (arg2.field1447 != null) {
				arg2 = arg2.method576();
			}

			if (arg2 != null && arg2.field1443) {
				String var5 = arg2.field1453;
				if (arg2.field1439 != 0) {
					var5 = var5 + method122(arg2.field1439, field288.field1106) + " (level-" + arg2.field1439 + ")";
				}

				if (field348 == 1) {
					field333[field345] = "Use " + field352 + " with @yel@" + var5;
					field529[field345] = 992;
					field530[field345] = arg3;
					field527[field345] = arg0;
					field528[field345] = arg1;
					field345++;
				} else if (field531 != 1) {
					if (arg2.field1471 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field1471[var6] != null && !arg2.field1471[var6].equalsIgnoreCase("attack")) {
								field333[field345] = arg2.field1471[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field529[field345] = 597;
								}

								if (var6 == 1) {
									field529[field345] = 196;
								}

								if (var6 == 2) {
									field529[field345] = 994;
								}

								if (var6 == 3) {
									field529[field345] = 773;
								}

								if (var6 == 4) {
									field529[field345] = 218;
								}

								field530[field345] = arg3;
								field527[field345] = arg0;
								field528[field345] = arg1;
								field345++;
							}
						}
					}

					if (arg2.field1471 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field1471[var7] != null && arg2.field1471[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field1439 > field288.field1106) {
									var8 = 2000;
								}

								field333[field345] = arg2.field1471[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field529[field345] = var8 + 597;
								}

								if (var7 == 1) {
									field529[field345] = var8 + 196;
								}

								if (var7 == 2) {
									field529[field345] = var8 + 994;
								}

								if (var7 == 3) {
									field529[field345] = var8 + 773;
								}

								if (var7 == 4) {
									field529[field345] = var8 + 218;
								}

								field530[field345] = arg3;
								field527[field345] = arg0;
								field528[field345] = arg1;
								field345++;
							}
						}
					}

					field333[field345] = "Examine @yel@" + var5;
					field529[field345] = 1825;
					field530[field345] = arg3;
					field527[field345] = arg0;
					field528[field345] = arg1;
					field345++;
				} else if ((field533 & 0x2) == 2) {
					field333[field345] = field534 + " @yel@" + var5;
					field529[field345] = 954;
					field530[field345] = arg3;
					field527[field345] = arg0;
					field528[field345] = arg1;
					field345++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method174() {
		field370.method24();

		if (field469 == 2) {
			byte[] var1 = field339.field1214;
			int[] var2 = CXMSQZVC.field567;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field520.method501(field321, 33, field264, 25, 25, 0, 0, field118, 33, 256);
			field371.method24();
			YVYOADIW.field1487 = field213;
		} else {
			int var5 = field321 + field231 & 0x7FF;
			int var6 = field288.field1270 / 32 + 48;
			int var7 = 464 - field288.field1271 / 32;
			field485.method501(var5, 146, field160, var7, var6, 5, 25, field266, 151, field278 + 256);
			field520.method501(field321, 33, field264, 25, 25, 0, 0, field118, 33, 256);

			for (int var8 = 0; var8 < field224; var8++) {
				int var9 = field225[var8] * 4 + 2 - field288.field1270 / 32;
				int var10 = field226[var8] * 4 + 2 - field288.field1271 / 32;
				method145(var10, field324[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					UEUHLQTT var13 = field287[field540][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field288.field1270 / 32;
						int var15 = var12 * 4 + 2 - field288.field1271 / 32;
						method145(var15, field300, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field318; var16++) {
				PDAYFSBN var17 = field317[field319[var16]];
				if (var17 != null && var17.method316()) {
					YIBRLAQY var18 = var17.field969;
					if (var18.field1447 != null) {
						var18 = var18.method576();
					}

					if (var18 != null && var18.field1469 && var18.field1443) {
						int var19 = var17.field1270 / 32 - field288.field1270 / 32;
						int var20 = var17.field1271 / 32 - field288.field1271 / 32;
						method145(var20, field301, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field402; var21++) {
				QGDSNXKJ var22 = field401[field403[var21]];
				if (var22 != null && var22.method316()) {
					int var23 = var22.field1270 / 32 - field288.field1270 / 32;
					int var24 = var22.field1271 / 32 - field288.field1271 / 32;
					boolean var25 = false;
					long var26 = MYWERTTF.method300(var22.field1105);
					for (int var28 = 0; var28 < field137; var28++) {
						if (field261[var28] == var26 && field282[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field288.field1124 != 0 && var22.field1124 != 0 && field288.field1124 == var22.field1124) {
						var29 = true;
					}

					if (var25) {
						method145(var24, field303, var23);
					} else if (var29) {
						method145(var24, field304, var23);
					} else {
						method145(var24, field302, var23);
					}
				}
			}

			if (field159 != 0 && field468 % 20 < 10) {
				if (field159 == 1 && field220 >= 0 && field220 < field317.length) {
					PDAYFSBN var30 = field317[field220];
					if (var30 != null) {
						int var31 = var30.field1270 / 32 - field288.field1270 / 32;
						int var32 = var30.field1271 / 32 - field288.field1271 / 32;
						method153(field140, var32, var31);
					}
				}

				if (field159 == 2) {
					int var33 = (field241 - field199) * 4 + 2 - field288.field1270 / 32;
					int var34 = (field242 - field200) * 4 + 2 - field288.field1271 / 32;
					method153(field140, var34, var33);
				}

				if (field159 == 10 && field363 >= 0 && field363 < field401.length) {
					QGDSNXKJ var35 = field401[field363];
					if (var35 != null) {
						int var36 = var35.field1270 / 32 - field288.field1270 / 32;
						int var37 = var35.field1271 / 32 - field288.field1271 / 32;
						method153(field140, var37, var36);
					}
				}
			}

			if (field483 != 0) {
				int var38 = field483 * 4 + 2 - field288.field1270 / 32;
				int var39 = field484 * 4 + 2 - field288.field1271 / 32;
				method145(var39, field139, var38);
			}

			CXMSQZVC.method202(0xFFFFFF, 97, 3, 78, 3);
			field371.method24();
			YVYOADIW.field1487 = field213;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = PSGMMDJS.field1059[var7];
			int var13 = PSGMMDJS.field1060[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = PSGMMDJS.field1059[var8];
			int var16 = PSGMMDJS.field1060[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field289 = arg2 - var9;
		field290 = arg0 - var10;
		field291 = arg1 - var11;
		field292 = arg5;
		field293 = arg4;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.i(B)V")
	public final void method176() {
		int var1 = field466.method11("Choose Option");
		for (int var2 = 0; var2 < field345; var2++) {
			int var3 = field466.method11(field333[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field345 * 15 + 21;
		if (field1094 > 4 && field1095 > 4 && field1094 < 516 && field1095 < 338) {
			int var5 = field1094 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1095 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field294 = true;
			field375 = 0;
			field376 = var5;
			field377 = var6;
			field378 = var1;
			field379 = field345 * 15 + 22;
		}

		if (field1094 > 553 && field1095 > 205 && field1094 < 743 && field1095 < 466) {
			int var7 = field1094 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1095 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field294 = true;
			field375 = 1;
			field376 = var7;
			field377 = var8;
			field378 = var1;
			field379 = field345 * 15 + 22;
		}

		if (field1094 > 17 && field1095 > 357 && field1094 < 496 && field1095 < 453) {
			int var9 = field1094 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1095 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field294 = true;
			field375 = 2;
			field376 = var9;
			field377 = var10;
			field378 = var1;
			field379 = field345 * 15 + 22;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method177() {
		if (field345 >= 2 || field348 != 0 || field531 != 0) {
			String var1;
			if (field348 == 1 && field345 < 2) {
				var1 = "Use " + field352 + " with...";
			} else if (field531 == 1 && field345 < 2) {
				var1 = field534 + "...";
			} else {
				var1 = field333[field345 - 1];
			}

			if (field345 > 2) {
				var1 = var1 + "@whi@ / " + (field345 - 2) + " more options";
			}

			field466.method18(field468 / 1000, 4, true, var1, 15, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public static final String method178(int arg0) {
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

	@ObfuscatedName("client.b(IJ)V")
	public final void method179(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field137; var3++) {
				if (field261[var3] == arg0) {
					field137--;
					field276 = true;

					for (int var4 = var3; var4 < field137; var4++) {
						field396[var4] = field396[var4 + 1];
						field282[var4] = field282[var4 + 1];
						field261[var4] = field261[var4 + 1];
					}

					field493.method319(150);
					field493.method326(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method180() {
		field369.method24();
		YVYOADIW.field1487 = field212;
		field338.method473(0, 0);

		if (field459 != -1) {
			method172(0, 0, RRTTGXYM.method458(field459), 0);
		} else if (field337[field256] != -1) {
			method172(0, 0, RRTTGXYM.method458(field337[field256]), 0);
		}

		if (field294 && field375 == 1) {
			method84();
		}

		field369.method25(205, field1079, 553);
		field371.method24();
		YVYOADIW.field1487 = field213;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method181() {
		if (field410 == 0) {
			int var1 = field1093;
			if (field531 == 1 && field1094 >= 516 && field1095 >= 160 && field1094 <= 765 && field1095 <= 205) {
				var1 = 0;
			}

			if (field294) {
				if (var1 != 1) {
					int var2 = field1087;
					int var3 = field1088;
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
						field294 = false;

						if (field375 == 1) {
							field276 = true;
						}

						if (field375 == 2) {
							field270 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field376;
					int var5 = field377;
					int var6 = field378;
					int var7 = field1094;
					int var8 = field1095;
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
					for (int var10 = 0; var10 < field345; var10++) {
						int var11 = (field345 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method125(var9);
					}

					field294 = false;

					if (field375 == 1) {
						field276 = true;
					}

					if (field375 == 2) {
						field270 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field345 > 0) {
					int var12 = field529[field345 - 1];
					if (var12 == 849 || var12 == 92 || var12 == 204 || var12 == 357 || var12 == 371 || var12 == 99 || var12 == 600 || var12 == 300 || var12 == 194 || var12 == 840 || var12 == 901 || var12 == 1630) {
						int var13 = field527[field345 - 1];
						int var14 = field528[field345 - 1];
						RRTTGXYM var15 = RRTTGXYM.method458(var14);
						if (var15.field1208 || var15.field1144) {
							field185 = false;
							field299 = 0;
							field408 = var14;
							field409 = var13;
							field410 = 2;
							field411 = field1094;
							field412 = field1095;

							if (RRTTGXYM.method458(var14).field1152 == field329) {
								field410 = 1;
							}

							if (RRTTGXYM.method458(var14).field1152 == field296) {
								field410 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field526 == 1 || method70(field345 - 1)) && field345 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field345 > 0) {
					method125(field345 - 1);
				}

				if (var1 != 2 || field345 <= 0) {
					return;
				}

				method176();
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method182(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IBLQGDSNXKJ;II)V")
	public final void method183(int arg0, QGDSNXKJ arg1, int arg2, int arg3) {
		if (field288 != arg1 && field345 < 400) {
			String var5;
			if (arg1.field1126 == 0) {
				var5 = arg1.field1105 + method122(arg1.field1106, field288.field1106) + " (level-" + arg1.field1106 + ")";
			} else {
				var5 = arg1.field1105 + " (skill-" + arg1.field1126 + ")";
			}

			if (field348 == 1) {
				field333[field345] = "Use " + field352 + " with @whi@" + var5;
				field529[field345] = 517;
				field530[field345] = arg2;
				field527[field345] = arg0;
				field528[field345] = arg3;
				field345++;
			} else if (field531 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field514[var6] != null) {
						field333[field345] = field514[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field514[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1106 > field288.field1106) {
								var7 = 2000;
							}

							if (field288.field1124 != 0 && arg1.field1124 != 0) {
								if (field288.field1124 == arg1.field1124) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field515[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field529[field345] = var7 + 41;
						}

						if (var6 == 1) {
							field529[field345] = var7 + 481;
						}

						if (var6 == 2) {
							field529[field345] = var7 + 771;
						}

						if (var6 == 3) {
							field529[field345] = var7 + 830;
						}

						if (var6 == 4) {
							field529[field345] = var7 + 738;
						}

						field530[field345] = arg2;
						field527[field345] = arg0;
						field528[field345] = arg3;
						field345++;
					}
				}
			} else if ((field533 & 0x8) == 8) {
				field333[field345] = field534 + " @whi@" + var5;
				field529[field345] = 537;
				field530[field345] = arg2;
				field527[field345] = arg0;
				field528[field345] = arg3;
				field345++;
			}

			for (int var8 = 0; var8 < field345; var8++) {
				if (field529[var8] == 124) {
					field333[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)LTXPLZUUI;")
	public final TXPLZUUI method184(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field478[0] != null) {
				var6 = field478[0].method515(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field384.reset();
			field384.update(var6);
			int var8 = (int) field384.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new TXPLZUUI(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method138("Requesting " + arg2, arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method155(arg4 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				PKHWFJLM var16 = new PKHWFJLM(var15);
				var16.field971 = 3;
				int var17 = var16.method334() + 6;
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
						method138("Loading " + arg2 + " - " + var22 + "%", arg0);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field478[0] != null) {
						field478[0].method516(var6, arg3, var6.length);
					}
				} catch (Exception var28) {
					field478[0] = null;
				}

				if (var6 != null) {
					field384.reset();
					field384.update(var6);
					int var23 = (int) field384.getValue();
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
						method138("Game updated - please reload page", arg0);
						var25 = 10;
					} else {
						method138(var11 + " - Retrying in " + var25, arg0);
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

				field131 = !field131;
			}
		}

		return new TXPLZUUI(var6);
	}

	@ObfuscatedName("client.k(B)V")
	public final void method185() {
		if (field410 == 0) {
			field333[0] = "Cancel";
			field529[0] = 1159;
			field345 = 1;
			if (field223 == -1) {
				method147();
				field364 = 0;
				field136 = 0;

				if (field1087 > 4 && field1088 > 4 && field1087 < 516 && field1088 < 338) {
					if (field329 == -1) {
						method66();
					} else {
						method141(field1088, 0, field1087, 0, 4, RRTTGXYM.method458(field329), 4);
					}
				}

				if (field364 != field124) {
					field124 = field364;
				}

				if (field519 != field136) {
					field519 = field136;
				}

				field364 = 0;
				field136 = 0;

				if (field1087 > 553 && field1088 > 205 && field1087 < 743 && field1088 < 466) {
					if (field459 != -1) {
						method141(field1088, 0, field1087, 1, 205, RRTTGXYM.method458(field459), 553);
					} else if (field337[field256] != -1) {
						method141(field1088, 0, field1087, 1, 205, RRTTGXYM.method458(field337[field256]), 553);
					}
				}

				if (field364 != field168) {
					field276 = true;
					field168 = field364;
				}

				if (field171 != field136) {
					field276 = true;
					field171 = field136;
				}

				field364 = 0;
				field136 = 0;

				if (field1087 > 17 && field1088 > 357 && field1087 < 496 && field1088 < 453) {
					if (field296 != -1) {
						method141(field1088, 0, field1087, 2, 357, RRTTGXYM.method458(field296), 17);
					} else if (field462 != -1) {
						method141(field1088, 0, field1087, 3, 357, RRTTGXYM.method458(field462), 17);
					} else if (field1088 < 434 && field1087 < 426) {
						method98(field1088 - 357, field1087 - 17);
					}
				}

				if ((field296 != -1 || field462 != -1) && field433 != field364) {
					field270 = true;
					field433 = field364;
				}

				if ((field296 != -1 || field462 != -1) && field227 != field136) {
					field270 = true;
					field227 = field136;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field345 - 1; var2++) {
						if (field529[var2] < 1000 && field529[var2 + 1] > 1000) {
							String var3 = field333[var2];
							field333[var2] = field333[var2 + 1];
							field333[var2 + 1] = var3;
							int var4 = field529[var2];
							field529[var2] = field529[var2 + 1];
							field529[var2 + 1] = var4;
							int var5 = field527[var2];
							field527[var2] = field527[var2 + 1];
							field527[var2 + 1] = var5;
							int var6 = field528[var2];
							field528[var2] = field528[var2 + 1];
							field528[var2 + 1] = var6;
							int var7 = field530[var2];
							field530[var2] = field530[var2 + 1];
							field530[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field364 = 0;
				field136 = 0;
				method141(field1088, 0, field1087, 0, 0, RRTTGXYM.method458(field223), 0);

				if (field364 != field124) {
					field124 = field364;
				}

				if (field519 != field136) {
					field519 = field136;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method186() {
		while (true) {
			int var1 = method446();
			if (var1 == -1) {
				return;
			}

			if (field329 != -1 && field329 == field286) {
				if (var1 == 8 && field163.length() > 0) {
					field163 = field163.substring(0, field163.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field163.length() < 12) {
					field163 = field163 + (char) var1;
				}
			} else if (field145) {
				if (var1 >= 32 && var1 <= 122 && field380.length() < 80) {
					field380 = field380 + (char) var1;
					field270 = true;
				}

				if (var1 == 8 && field380.length() > 0) {
					field380 = field380.substring(0, field380.length() - 1);
					field270 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field145 = false;
					field270 = true;

					if (field452 == 1) {
						long var2 = MYWERTTF.method300(field380);
						method119(var2);
					}

					if (field452 == 2 && field137 > 0) {
						long var4 = MYWERTTF.method300(field380);
						method179(var4);
					}

					if (field452 == 3 && field380.length() > 0) {
						field493.method319(248);
						field493.method320(0);
						int var6 = field493.field971;
						field493.method326(field523);
						OCQVXKDE.method314(field380, field493);
						field493.method329(field493.field971 - var6);
						field380 = OCQVXKDE.method315(field380);
						field380 = PSDABLUV.method378(field380);
						method191(6, MYWERTTF.method304(MYWERTTF.method301(field523)), field380);

						if (field518 == 2) {
							field518 = 1;
							field522 = true;
							field493.method319(112);
							field493.method320(field479);
							field493.method320(field518);
							field493.method320(field365);
						}
					}

					if (field452 == 4 && field144 < 100) {
						long var7 = MYWERTTF.method300(field380);
						method126(var7);
					}

					if (field452 == 5 && field144 > 0) {
						long var9 = MYWERTTF.method300(field380);
						method159(var9);
					}
				}
			} else if (field218 == 1) {
				if (var1 >= 48 && var1 <= 57 && field280.length() < 10) {
					field280 = field280 + (char) var1;
					field270 = true;
				}

				if (var1 == 8 && field280.length() > 0) {
					field280 = field280.substring(0, field280.length() - 1);
					field270 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field280.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field280);
						} catch (Exception var21) {
						}

						field493.method319(1);
						field493.method324(var11);
					}

					field218 = 0;
					field270 = true;
				}
			} else if (field218 == 2) {
				if (var1 >= 32 && var1 <= 122 && field280.length() < 12) {
					field280 = field280 + (char) var1;
					field270 = true;
				}

				if (var1 == 8 && field280.length() > 0) {
					field280 = field280.substring(0, field280.length() - 1);
					field270 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field280.length() > 0) {
						field493.method319(197);
						field493.method326(MYWERTTF.method300(field280));
					}

					field218 = 0;
					field270 = true;
				}
			} else if (field296 == -1 && field223 == -1) {
				if (var1 >= 32 && var1 <= 122 && field260.length() < 80) {
					field260 = field260 + (char) var1;
					field270 = true;
				}

				if (var1 == 8 && field260.length() > 0) {
					field260 = field260.substring(0, field260.length() - 1);
					field270 = true;
				}

				if ((var1 == 13 || var1 == 10) && field260.length() > 0) {
					if (field438 == 2) {
						if (field260.equals("::clientdrop")) {
							method146();
						}

						if (field260.equals("::lag")) {
							method160();
						}

						if (field260.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field234.method262(2); var12++) {
								field234.method275((byte) 1, var12, 2);
							}
						}

						if (field260.equals("::fpson")) {
							field179 = true;
						}

						if (field260.equals("::fpsoff")) {
							field179 = false;
						}

						if (field260.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field216[var13].field1295[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field260.startsWith("::")) {
						field493.method319(109);
						field493.method320(field260.length() - 1);
						field493.method327(field260.substring(2));
					} else {
						String var16 = field260.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field260 = field260.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field260 = field260.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field260 = field260.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field260 = field260.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field260 = field260.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field260 = field260.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field260 = field260.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field260 = field260.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field260 = field260.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field260 = field260.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field260 = field260.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field260 = field260.substring(6);
						}

						String var18 = field260.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field260 = field260.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field260 = field260.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field260 = field260.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field260 = field260.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field260 = field260.substring(6);
						}

						field493.method319(33);
						field493.method320(0);
						int var20 = field493.field971;
						field493.method348(var17);
						field316.field971 = 0;
						OCQVXKDE.method314(field260, field316);
						field493.method367(field316.field970, field316.field971, 0);
						field493.method320(var19);
						field493.method329(field493.field971 - var20);
						field260 = OCQVXKDE.method315(field260);
						field260 = PSDABLUV.method378(field260);
						field288.field1276 = field260;
						field288.field1252 = var17;
						field288.field1238 = var19;
						field288.field1251 = 150;

						if (field438 == 2) {
							method191(2, "@cr2@" + field288.field1105, field288.field1276);
						} else if (field438 == 1) {
							method191(2, "@cr1@" + field288.field1105, field288.field1276);
						} else {
							method191(2, field288.field1105, field288.field1276);
						}

						if (field479 == 2) {
							field479 = 3;
							field522 = true;
							field493.method319(112);
							field493.method320(field479);
							field493.method320(field518);
							field493.method320(field365);
						}
					}

					field260 = "";
					field270 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILPKHWFJLM;I)V")
	public final void method187(int arg0, PKHWFJLM arg1) {
		while (arg1.field972 + 10 < arg0 * 8) {
			int var3 = arg1.method341(11);
			if (var3 == 2047) {
				break;
			}

			if (field401[var3] == null) {
				field401[var3] = new QGDSNXKJ();
				if (field406[var3] != null) {
					field401[var3].method447(field406[var3]);
				}
			}

			field403[field402++] = var3;
			QGDSNXKJ var4 = field401[var3];
			var4.field1264 = field468;
			int var5 = arg1.method341(1);
			if (var5 == 1) {
				field405[field404++] = var3;
			}

			int var6 = arg1.method341(1);
			int var7 = arg1.method341(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method341(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method476(field288.field1236[0] + var8, field288.field1237[0] + var7, var6 == 1);
		}

		arg1.method342();
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public final void method188(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field498.method473(arg3, arg2);
		field499.method473(arg3, arg1 + arg2 - 16);
		CXMSQZVC.method202(field170, arg3, 16, arg2 + 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg0 - arg1);
		CXMSQZVC.method202(field416, arg3, 16, arg2 + var7 + 16, var6);
		CXMSQZVC.method207(field368, var6, arg2 + var7 + 16, arg3);
		CXMSQZVC.method207(field368, var6, arg2 + var7 + 16, arg3 + 1);
		CXMSQZVC.method205(16, field368, arg3, arg2 + var7 + 16);
		CXMSQZVC.method205(16, field368, arg3, arg2 + var7 + 17);
		CXMSQZVC.method207(field535, var6, arg2 + var7 + 16, arg3 + 15);
		CXMSQZVC.method207(field535, var6 - 1, arg2 + 17 + var7, arg3 + 14);
		CXMSQZVC.method205(16, field535, arg3, arg2 + var7 + var6 + 15);
		CXMSQZVC.method205(15, field535, arg3 + 1, arg2 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.J(I)V")
	public final void method189() {
		if (field469 == 0 && field1093 == 1) {
			int var1 = field1094 - 25 - 550;
			int var2 = field1095 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field321 + field231 & 0x7FF;
				int var4 = YVYOADIW.field1485[var3];
				int var5 = YVYOADIW.field1486[var3];
				var4 = (field278 + 256) * var4 >> 8;
				var5 = (field278 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field288.field1270 + var6 >> 7;
				int var9 = field288.field1271 - var7 >> 7;
				boolean var10 = method49(field288.field1237[0], field288.field1236[0], 0, 1, true, 0, 0, 0, 0, var8, var9);
				if (var10) {
					field493.method320(var1);
					field493.method320(var2);
					field493.method321(field321);
					field493.method320(57);
					field493.method320(field231);
					field493.method320(field278);
					field493.method320(89);
					field493.method321(field288.field1270);
					field493.method321(field288.field1271);
					field493.method320(field219);
					field493.method320(63);
				}
			}

			field158++;
			if (field158 > 1666) {
				field158 = 0;
				field493.method319(98);
				field493.method320(0);
				int var11 = field493.field971;

				if ((int) (Math.random() * 2.0D) == 0) {
					field493.method321(34146);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field493.method321(48042);
				}

				field493.method320((int) (Math.random() * 256.0D));
				field493.method321((int) (Math.random() * 65536.0D));
				field493.method320(236);
				field493.method321(19247);
				field493.method321(62113);

				if ((int) (Math.random() * 2.0D) == 0) {
					field493.method320(111);
				}

				field493.method320(104);

				if ((int) (Math.random() * 2.0D) == 0) {
					field493.method320(225);
				}

				field493.method329(field493.field971 - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method190(byte[] arg0, boolean arg1) {
		if (field336) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;B)V")
	public final void method191(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field462 != -1) {
			field426 = arg2;
			field1093 = 0;
		}

		if (field296 == -1) {
			field270 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field190[var4] = field190[var4 - 1];
			field191[var4] = field191[var4 - 1];
			field192[var4] = field192[var4 - 1];
		}

		field190[0] = arg0;
		field191[0] = arg1;
		field192[0] = arg2;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method192() {
		int var1 = field125 * 128 + 64;
		int var2 = field126 * 128 + 64;
		int var3 = method57(field540, var1, var2) - field127;

		if (field289 < var1) {
			field289 += (var1 - field289) * field129 / 1000 + field128;
			if (field289 > var1) {
				field289 = var1;
			}
		}

		if (field289 > var1) {
			field289 -= (field289 - var1) * field129 / 1000 + field128;
			if (field289 < var1) {
				field289 = var1;
			}
		}

		if (field290 < var3) {
			field290 += (var3 - field290) * field129 / 1000 + field128;
			if (field290 > var3) {
				field290 = var3;
			}
		}

		if (field290 > var3) {
			field290 -= (field290 - var3) * field129 / 1000 + field128;
			if (field290 < var3) {
				field290 = var3;
			}
		}

		if (field291 < var2) {
			field291 += (var2 - field291) * field129 / 1000 + field128;
			if (field291 > var2) {
				field291 = var2;
			}
		}

		if (field291 > var2) {
			field291 -= (field291 - var2) * field129 / 1000 + field128;
			if (field291 < var2) {
				field291 = var2;
			}
		}

		int var4 = field470 * 128 + 64;
		int var5 = field471 * 128 + 64;
		int var6 = method57(field540, var4, var5) - field472;
		int var7 = var4 - field289;
		int var8 = var6 - field290;
		int var9 = var5 - field291;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field292 < var11) {
			field292 += (var11 - field292) * field474 / 1000 + field473;
			if (field292 > var11) {
				field292 = var11;
			}
		}

		if (field292 > var11) {
			field292 -= (field292 - var11) * field474 / 1000 + field473;
			if (field292 < var11) {
				field292 = var11;
			}
		}

		int var13 = var12 - field293;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field293 += field474 * var13 / 1000 + field473;
			field293 &= 0x7FF;
		}

		if (var13 < 0) {
			field293 -= -var13 * field474 / 1000 + field473;
			field293 &= 0x7FF;
		}

		int var14 = var12 - field293;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field293 = var12;
		}
	}

	@ObfuscatedName("client.c(ILPKHWFJLM;I)V")
	public final void method193(PKHWFJLM arg0, int arg1) {
		int var3 = arg0.method341(8);
		if (var3 < field402) {
			for (int var4 = var3; var4 < field402; var4++) {
				field432[field431++] = field403[var4];
			}
		}

		if (var3 > field402) {
			signlink.reporterror(field122 + " Too many players");
			throw new RuntimeException("eek");
		}

		field402 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field403[var5];
			QGDSNXKJ var7 = field401[var6];
			int var8 = arg0.method341(1);
			if (var8 == 0) {
				field403[field402++] = var6;
				var7.field1264 = field468;
			} else {
				int var9 = arg0.method341(2);
				if (var9 == 0) {
					field403[field402++] = var6;
					var7.field1264 = field468;
					field405[field404++] = var6;
				} else if (var9 == 1) {
					field403[field402++] = var6;
					var7.field1264 = field468;
					int var10 = arg0.method341(3);
					var7.method478(false, var10);
					int var11 = arg0.method341(1);
					if (var11 == 1) {
						field405[field404++] = var6;
					}
				} else if (var9 == 2) {
					field403[field402++] = var6;
					var7.field1264 = field468;
					int var12 = arg0.method341(3);
					var7.method478(true, var12);
					int var13 = arg0.method341(3);
					var7.method478(true, var13);
					int var14 = arg0.method341(1);
					if (var14 == 1) {
						field405[field404++] = var6;
					}
				} else if (var9 == 3) {
					field432[field431++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method194(int arg0) {
		RRTTGXYM.method467(arg0);
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field178[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field217[var3] = var2 / 4;
		}
	}
}
