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
public final class client extends AHZQVBFX {

	@ObfuscatedName("client.K")
	public int field198 = -1;

	@ObfuscatedName("client.M")
	public long[] field200 = new long[200];

	@ObfuscatedName("client.P")
	public int[][] field203 = new int[104][104];

	@ObfuscatedName("client.U")
	public int[][][] field208 = new int[4][13][13];

	@ObfuscatedName("client.V")
	public int field209 = -1;

	@ObfuscatedName("client.W")
	public WBEWPIXO field210 = WBEWPIXO.method503(1);

	@ObfuscatedName("client.Y")
	public boolean field212 = false;

	@ObfuscatedName("client.hb")
	public final int field219 = 100;

	@ObfuscatedName("client.ib")
	public int[] field220 = new int[100];

	@ObfuscatedName("client.kb")
	public int[] field222 = new int[XAYOHKKR.field1431];

	@ObfuscatedName("client.mb")
	public int[] field224 = new int[151];

	@ObfuscatedName("client.rb")
	public int field229 = 0x766654;

	@ObfuscatedName("client.sb")
	public boolean field230 = false;

	@ObfuscatedName("client.wb")
	public int[] field233 = new int[200];

	@ObfuscatedName("client.yb")
	public boolean field235 = true;

	@ObfuscatedName("client.Bb")
	public boolean field238 = false;

	@ObfuscatedName("client.Ib")
	public String field245 = "";

	@ObfuscatedName("client.Kb")
	public String[] field247 = new String[100];

	@ObfuscatedName("client.Lb")
	public int[] field248 = new int[100];

	@ObfuscatedName("client.Nb")
	public boolean field250 = false;

	@ObfuscatedName("client.Ob")
	public final int[] field251 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ub")
	public boolean field257 = false;

	@ObfuscatedName("client.Xb")
	public volatile boolean field260 = false;

	@ObfuscatedName("client.Yb")
	public int field261 = 3;

	@ObfuscatedName("client.ac")
	public int field263 = -1;

	@ObfuscatedName("client.cc")
	public int[] field265 = new int[500];

	@ObfuscatedName("client.dc")
	public int[] field266 = new int[500];

	@ObfuscatedName("client.ec")
	public int[] field267 = new int[500];

	@ObfuscatedName("client.fc")
	public int[] field268 = new int[500];

	@ObfuscatedName("client.jc")
	public boolean field270 = false;

	@ObfuscatedName("client.mc")
	public int field273 = 0x23201B;

	@ObfuscatedName("client.pc")
	public int field275 = 2;

	@ObfuscatedName("client.qc")
	public String[] field276 = new String[500];

	@ObfuscatedName("client.sc")
	public int field278 = 0x332D25;

	@ObfuscatedName("client.xc")
	public CRC32 field280 = new CRC32();

	@ObfuscatedName("client.yc")
	public int field281 = -1;

	@ObfuscatedName("client.Ac")
	public int field282 = -1;

	@ObfuscatedName("client.Cc")
	public int field284 = -1;

	@ObfuscatedName("client.Ec")
	public OSRLSEOB[] field285 = new OSRLSEOB[13];

	@ObfuscatedName("client.Fc")
	public boolean field286 = true;

	@ObfuscatedName("client.Hc")
	public int field287 = -1;

	@ObfuscatedName("client.Lc")
	public OGPNACTP[] field290 = new OGPNACTP[8];

	@ObfuscatedName("client.Oc")
	public int[] field292 = new int[9];

	@ObfuscatedName("client.Qc")
	public int[] field294 = new int[7];

	@ObfuscatedName("client.Xc")
	public BBOYCGQQ[] field299 = new BBOYCGQQ[4];

	@ObfuscatedName("client.ad")
	public boolean field302 = false;

	@ObfuscatedName("client.bd")
	public int[] field303 = new int[2000];

	@ObfuscatedName("client.ld")
	public boolean field313 = false;

	@ObfuscatedName("client.md")
	public boolean field314 = false;

	@ObfuscatedName("client.wd")
	public int[] field322 = new int[33];

	@ObfuscatedName("client.yd")
	public int[] field324 = new int[1000];

	@ObfuscatedName("client.zd")
	public int[] field325 = new int[1000];

	@ObfuscatedName("client.Ed")
	public boolean field330 = false;

	@ObfuscatedName("client.Fd")
	public boolean field331 = false;

	@ObfuscatedName("client.Hd")
	public OGPNACTP[] field332 = new OGPNACTP[1000];

	@ObfuscatedName("client.Jd")
	public boolean field334 = true;

	@ObfuscatedName("client.Ld")
	public int[][] field335 = new int[104][104];

	@ObfuscatedName("client.Qd")
	public boolean field340 = true;

	@ObfuscatedName("client.Td")
	public long[] field343 = new long[100];

	@ObfuscatedName("client.Wd")
	public NYZQPNXB field346 = new NYZQPNXB();

	@ObfuscatedName("client.Yd")
	public String[] field347 = new String[200];

	@ObfuscatedName("client.Zd")
	public boolean field348 = false;

	@ObfuscatedName("client.ce")
	public OGPNACTP[] field350 = new OGPNACTP[100];

	@ObfuscatedName("client.ne")
	public WBEWPIXO field359 = new WBEWPIXO(new byte[5000]);

	@ObfuscatedName("client.oe")
	public PVFNGMTQ[] field360 = new PVFNGMTQ[16384];

	@ObfuscatedName("client.qe")
	public int[] field362 = new int[16384];

	@ObfuscatedName("client.re")
	public NYZQPNXB[][][] field363 = new NYZQPNXB[4][104][104];

	@ObfuscatedName("client.se")
	public int[] field364 = new int[50];

	@ObfuscatedName("client.ye")
	public MRUJPFPS field370 = new MRUJPFPS();

	@ObfuscatedName("client.ze")
	public boolean field371 = false;

	@ObfuscatedName("client.De")
	public String[] field375 = new String[5];

	@ObfuscatedName("client.Ee")
	public boolean[] field376 = new boolean[5];

	@ObfuscatedName("client.Ge")
	public OGPNACTP[] field378 = new OGPNACTP[32];

	@ObfuscatedName("client.He")
	public int[] field379 = new int[5];

	@ObfuscatedName("client.Le")
	public int[][] field382 = new int[104][104];

	@ObfuscatedName("client.Oe")
	public int field385 = -1;

	@ObfuscatedName("client.Pe")
	public OGPNACTP[] field386 = new OGPNACTP[32];

	@ObfuscatedName("client.Re")
	public int field388 = 1;

	@ObfuscatedName("client.Se")
	public String field389 = "";

	@ObfuscatedName("client.Te")
	public String field390 = "";

	@ObfuscatedName("client.pf")
	public int field408 = -1;

	@ObfuscatedName("client.Jf")
	public int field428 = 2048;

	@ObfuscatedName("client.Kf")
	public int field429 = 2047;

	@ObfuscatedName("client.Lf")
	public SRMWIYVM[] field430 = new SRMWIYVM[field428];

	@ObfuscatedName("client.Nf")
	public int[] field432 = new int[field428];

	@ObfuscatedName("client.Pf")
	public int[] field434 = new int[field428];

	@ObfuscatedName("client.Qf")
	public WBEWPIXO[] field435 = new WBEWPIXO[field428];

	@ObfuscatedName("client.Rf")
	public int field436 = -1;

	@ObfuscatedName("client.Wf")
	public NYZQPNXB field441 = new NYZQPNXB();

	@ObfuscatedName("client.Xf")
	public int field442 = -1;

	@ObfuscatedName("client.bg")
	public int[] field446 = new int[50];

	@ObfuscatedName("client.gg")
	public String field450 = "";

	@ObfuscatedName("client.ig")
	public String field451 = "";

	@ObfuscatedName("client.og")
	public int field456 = 0x4D4233;

	@ObfuscatedName("client.qg")
	public int[] field458 = new int[1000];

	@ObfuscatedName("client.Kg")
	public int[] field476 = new int[151];

	@ObfuscatedName("client.Mg")
	public boolean field478 = false;

	@ObfuscatedName("client.Og")
	public int field479 = -1;

	@ObfuscatedName("client.Qg")
	public int[] field481 = new int[33];

	@ObfuscatedName("client.ah")
	public int[] field491 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.kh")
	public String field501 = "";

	@ObfuscatedName("client.ph")
	public OGPNACTP[] field506 = new OGPNACTP[32];

	@ObfuscatedName("client.qh")
	public int field507 = 78;

	@ObfuscatedName("client.rh")
	public int[] field508 = new int[XAYOHKKR.field1431];

	@ObfuscatedName("client.sh")
	public boolean field509 = false;

	@ObfuscatedName("client.th")
	public int[] field510 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.uh")
	public String field511 = "";

	@ObfuscatedName("client.Ah")
	public boolean field517 = false;

	@ObfuscatedName("client.Bh")
	public boolean field518 = false;

	@ObfuscatedName("client.Ch")
	public String field519 = "";

	@ObfuscatedName("client.Dh")
	public String field520 = "";

	@ObfuscatedName("client.Fh")
	public int field522 = -1;

	@ObfuscatedName("client.Hh")
	public int field524 = 128;

	@ObfuscatedName("client.Zh")
	public WBEWPIXO field540 = WBEWPIXO.method503(1);

	@ObfuscatedName("client.ci")
	public int field543 = 1;

	@ObfuscatedName("client.ei")
	public volatile boolean field545 = false;

	@ObfuscatedName("client.gi")
	public NYZQPNXB field547 = new NYZQPNXB();

	@ObfuscatedName("client.ii")
	public OSRLSEOB[] field549 = new OSRLSEOB[100];

	@ObfuscatedName("client.ji")
	public byte[] field550 = new byte[16384];

	@ObfuscatedName("client.mi")
	public OSRLSEOB[] field553 = new OSRLSEOB[2];

	@ObfuscatedName("client.qi")
	public int field557 = 50;

	@ObfuscatedName("client.ri")
	public int[] field558 = new int[field557];

	@ObfuscatedName("client.si")
	public int[] field559 = new int[field557];

	@ObfuscatedName("client.ti")
	public int[] field560 = new int[field557];

	@ObfuscatedName("client.ui")
	public int[] field561 = new int[field557];

	@ObfuscatedName("client.vi")
	public int[] field562 = new int[field557];

	@ObfuscatedName("client.wi")
	public int[] field563 = new int[field557];

	@ObfuscatedName("client.xi")
	public int[] field564 = new int[field557];

	@ObfuscatedName("client.yi")
	public String[] field565 = new String[field557];

	@ObfuscatedName("client.Ei")
	public int[] field571 = new int[5];

	@ObfuscatedName("client.Mi")
	public boolean[] field577 = new boolean[5];

	@ObfuscatedName("client.Ni")
	public boolean field578 = false;

	@ObfuscatedName("client.Pi")
	public int[] field580 = new int[5];

	@ObfuscatedName("client.Vi")
	public String field585 = "";

	@ObfuscatedName("client.Zi")
	public int field589 = -1;

	@ObfuscatedName("client.aj")
	public int field590 = -1;

	@ObfuscatedName("client.fj")
	public int[] field593 = new int[5];

	@ObfuscatedName("client.mj")
	public OGPNACTP[] field600 = new OGPNACTP[20];

	@ObfuscatedName("client.qj")
	public int field602 = -1;

	@ObfuscatedName("client.tj")
	public int[] field604 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.vj")
	public boolean field605 = false;

	@ObfuscatedName("client.xj")
	public int field607 = 2;

	@ObfuscatedName("client.yj")
	public boolean field608 = true;

	@ObfuscatedName("client.Dj")
	public int[] field611 = new int[256];

	@ObfuscatedName("client.Fj")
	public boolean field613 = false;

	@ObfuscatedName("client.Hj")
	public JXARNXDE[] field615 = new JXARNXDE[5];

	@ObfuscatedName("client.Lj")
	public boolean field619 = false;

	@ObfuscatedName("client.Mj")
	public volatile boolean field620 = false;

	@ObfuscatedName("client.Oj")
	public int[] field622 = new int[XAYOHKKR.field1431];

	@ObfuscatedName("client.Qj")
	public boolean field624 = false;

	@ObfuscatedName("client.Rj")
	public int[] field625 = new int[50];

	@ObfuscatedName("client.Sj")
	public int[] field626 = new int[2000];

	@ObfuscatedName("client.Vj")
	public int[] field628 = new int[5];

	@ObfuscatedName("client.Xj")
	public WBEWPIXO field630 = WBEWPIXO.method503(1);

	@ObfuscatedName("client.ck")
	public int[] field634 = new int[4000];

	@ObfuscatedName("client.dk")
	public int[] field635 = new int[4000];

	@ObfuscatedName("client.fk")
	public int field637 = 2;

	@ObfuscatedName("client.gk")
	public int[] field638 = new int[100];

	@ObfuscatedName("client.hk")
	public String[] field639 = new String[100];

	@ObfuscatedName("client.ik")
	public String[] field640 = new String[100];

	@ObfuscatedName("client.Hb")
	public static BigInteger field244 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.bc")
	public static int[] field264 = new int[32];

	@ObfuscatedName("client.kc")
	public static String field271 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Uc")
	public static BigInteger field297 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Md")
	public static int[] field336 = new int[99];

	@ObfuscatedName("client.Nd")
	public static final int[][] field337 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.ue")
	public static int field366 = 10;

	@ObfuscatedName("client.we")
	public static boolean field368 = true;

	@ObfuscatedName("client.Jg")
	public static final int[] field475 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.L")
	public int field199;

	@ObfuscatedName("client.N")
	public int field201;

	@ObfuscatedName("client.O")
	public int field202;

	@ObfuscatedName("client.Q")
	public int field204;

	@ObfuscatedName("client.R")
	public int field205;

	@ObfuscatedName("client.T")
	public int field207;

	@ObfuscatedName("client.X")
	public int field211;

	@ObfuscatedName("client.ab")
	public int field213;

	@ObfuscatedName("client.bb")
	public int field214;

	@ObfuscatedName("client.cb")
	public int field215;

	@ObfuscatedName("client.db")
	public int field216;

	@ObfuscatedName("client.eb")
	public int field217;

	@ObfuscatedName("client.fb")
	public int field218;

	@ObfuscatedName("client.jb")
	public static int field221;

	@ObfuscatedName("client.lb")
	public int field223;

	@ObfuscatedName("client.nb")
	public static int field225;

	@ObfuscatedName("client.ob")
	public int field226;

	@ObfuscatedName("client.pb")
	public int field227;

	@ObfuscatedName("client.tb")
	public int field231;

	@ObfuscatedName("client.ub")
	public int field232;

	@ObfuscatedName("client.xb")
	public int field234;

	@ObfuscatedName("client.Ab")
	public int field237;

	@ObfuscatedName("client.Cb")
	public int field239;

	@ObfuscatedName("client.Db")
	public int field240;

	@ObfuscatedName("client.Eb")
	public int field241;

	@ObfuscatedName("client.Fb")
	public int field242;

	@ObfuscatedName("client.Gb")
	public int field243;

	@ObfuscatedName("client.Jb")
	public int field246;

	@ObfuscatedName("client.Mb")
	public int field249;

	@ObfuscatedName("client.Rb")
	public int field254;

	@ObfuscatedName("client.Sb")
	public int field255;

	@ObfuscatedName("client.Tb")
	public int field256;

	@ObfuscatedName("client.Zb")
	public int field262;

	@ObfuscatedName("client.lc")
	public static int field272;

	@ObfuscatedName("client.oc")
	public int field274;

	@ObfuscatedName("client.rc")
	public int field277;

	@ObfuscatedName("client.tc")
	public static int field279;

	@ObfuscatedName("client.Bc")
	public int field283;

	@ObfuscatedName("client.Ic")
	public int field288;

	@ObfuscatedName("client.Pc")
	public int field293;

	@ObfuscatedName("client.Rc")
	public int field295;

	@ObfuscatedName("client.Vc")
	public int field298;

	@ObfuscatedName("client.cd")
	public static int field304;

	@ObfuscatedName("client.nd")
	public int field315;

	@ObfuscatedName("client.od")
	public int field316;

	@ObfuscatedName("client.pd")
	public int field317;

	@ObfuscatedName("client.qd")
	public int field318;

	@ObfuscatedName("client.rd")
	public int field319;

	@ObfuscatedName("client.xd")
	public int field323;

	@ObfuscatedName("client.Id")
	public int field333;

	@ObfuscatedName("client.Rd")
	public static int field341;

	@ObfuscatedName("client.Sd")
	public static int field342;

	@ObfuscatedName("client.Ud")
	public int field344;

	@ObfuscatedName("client.Vd")
	public int field345;

	@ObfuscatedName("client.be")
	public int field349;

	@ObfuscatedName("client.ee")
	public int field351;

	@ObfuscatedName("client.fe")
	public int field352;

	@ObfuscatedName("client.ge")
	public int field353;

	@ObfuscatedName("client.he")
	public int field354;

	@ObfuscatedName("client.ie")
	public int field355;

	@ObfuscatedName("client.pe")
	public int field361;

	@ObfuscatedName("client.te")
	public int field365;

	@ObfuscatedName("client.ve")
	public static int field367;

	@ObfuscatedName("client.Fe")
	public static int field377;

	@ObfuscatedName("client.Me")
	public int field383;

	@ObfuscatedName("client.Ne")
	public int field384;

	@ObfuscatedName("client.Qe")
	public int field387;

	@ObfuscatedName("client.af")
	public int field394;

	@ObfuscatedName("client.bf")
	public int field395;

	@ObfuscatedName("client.cf")
	public int field396;

	@ObfuscatedName("client.df")
	public int field397;

	@ObfuscatedName("client.ef")
	public int field398;

	@ObfuscatedName("client.ff")
	public int field399;

	@ObfuscatedName("client.gf")
	public static int field400;

	@ObfuscatedName("client.hf")
	public int field401;

	@ObfuscatedName("client.jf")
	public int field402;

	@ObfuscatedName("client.kf")
	public int field403;

	@ObfuscatedName("client.lf")
	public int field404;

	@ObfuscatedName("client.mf")
	public int field405;

	@ObfuscatedName("client.nf")
	public int field406;

	@ObfuscatedName("client.of")
	public int field407;

	@ObfuscatedName("client.qf")
	public int field409;

	@ObfuscatedName("client.rf")
	public int field410;

	@ObfuscatedName("client.sf")
	public int field411;

	@ObfuscatedName("client.uf")
	public int field413;

	@ObfuscatedName("client.zf")
	public int field418;

	@ObfuscatedName("client.Af")
	public int field419;

	@ObfuscatedName("client.Bf")
	public int field420;

	@ObfuscatedName("client.Cf")
	public int field421;

	@ObfuscatedName("client.Df")
	public int field422;

	@ObfuscatedName("client.Ef")
	public int field423;

	@ObfuscatedName("client.Mf")
	public int field431;

	@ObfuscatedName("client.Of")
	public int field433;

	@ObfuscatedName("client.Sf")
	public int field437;

	@ObfuscatedName("client.Uf")
	public int field439;

	@ObfuscatedName("client.Vf")
	public int field440;

	@ObfuscatedName("client.ag")
	public int field445;

	@ObfuscatedName("client.cg")
	public int field447;

	@ObfuscatedName("client.eg")
	public int field449;

	@ObfuscatedName("client.kg")
	public int field452;

	@ObfuscatedName("client.lg")
	public int field453;

	@ObfuscatedName("client.mg")
	public int field454;

	@ObfuscatedName("client.ng")
	public int field455;

	@ObfuscatedName("client.pg")
	public int field457;

	@ObfuscatedName("client.sg")
	public int field459;

	@ObfuscatedName("client.tg")
	public int field460;

	@ObfuscatedName("client.Fg")
	public int field471;

	@ObfuscatedName("client.Gg")
	public int field472;

	@ObfuscatedName("client.Hg")
	public int field473;

	@ObfuscatedName("client.Ig")
	public int field474;

	@ObfuscatedName("client.Lg")
	public int field477;

	@ObfuscatedName("client.Pg")
	public static int field480;

	@ObfuscatedName("client.Rg")
	public int field482;

	@ObfuscatedName("client.Sg")
	public int field483;

	@ObfuscatedName("client.Tg")
	public int field484;

	@ObfuscatedName("client.Ug")
	public int field485;

	@ObfuscatedName("client.Vg")
	public int field486;

	@ObfuscatedName("client.Wg")
	public int field487;

	@ObfuscatedName("client.Xg")
	public int field488;

	@ObfuscatedName("client.Yg")
	public int field489;

	@ObfuscatedName("client.Zg")
	public int field490;

	@ObfuscatedName("client.gh")
	public int field497;

	@ObfuscatedName("client.hh")
	public int field498;

	@ObfuscatedName("client.ih")
	public int field499;

	@ObfuscatedName("client.vh")
	public int field512;

	@ObfuscatedName("client.wh")
	public int field513;

	@ObfuscatedName("client.xh")
	public int field514;

	@ObfuscatedName("client.yh")
	public int field515;

	@ObfuscatedName("client.zh")
	public int field516;

	@ObfuscatedName("client.Eh")
	public static int field521;

	@ObfuscatedName("client.Gh")
	public int field523;

	@ObfuscatedName("client.Ih")
	public int field525;

	@ObfuscatedName("client.Jh")
	public int field526;

	@ObfuscatedName("client.Kh")
	public int field527;

	@ObfuscatedName("client.Wh")
	public static int field537;

	@ObfuscatedName("client.Xh")
	public int field538;

	@ObfuscatedName("client.ai")
	public static int field541;

	@ObfuscatedName("client.bi")
	public int field542;

	@ObfuscatedName("client.di")
	public int field544;

	@ObfuscatedName("client.fi")
	public int field546;

	@ObfuscatedName("client.hi")
	public static int field548;

	@ObfuscatedName("client.ki")
	public int field551;

	@ObfuscatedName("client.li")
	public static int field552;

	@ObfuscatedName("client.ni")
	public int field554;

	@ObfuscatedName("client.oi")
	public int field555;

	@ObfuscatedName("client.pi")
	public int field556;

	@ObfuscatedName("client.zi")
	public int field566;

	@ObfuscatedName("client.Ai")
	public int field567;

	@ObfuscatedName("client.Bi")
	public int field568;

	@ObfuscatedName("client.Ci")
	public int field569;

	@ObfuscatedName("client.Di")
	public int field570;

	@ObfuscatedName("client.Gi")
	public int field572;

	@ObfuscatedName("client.Hi")
	public int field573;

	@ObfuscatedName("client.Ii")
	public int field574;

	@ObfuscatedName("client.Ji")
	public int field575;

	@ObfuscatedName("client.Ki")
	public int field576;

	@ObfuscatedName("client.Oi")
	public static int field579;

	@ObfuscatedName("client.Xi")
	public static int field587;

	@ObfuscatedName("client.Yi")
	public int field588;

	@ObfuscatedName("client.bj")
	public int field591;

	@ObfuscatedName("client.ej")
	public int field592;

	@ObfuscatedName("client.lj")
	public int field599;

	@ObfuscatedName("client.oj")
	public int field601;

	@ObfuscatedName("client.wj")
	public int field606;

	@ObfuscatedName("client.zj")
	public int field609;

	@ObfuscatedName("client.Ej")
	public int field612;

	@ObfuscatedName("client.Gj")
	public int field614;

	@ObfuscatedName("client.Pj")
	public int field623;

	@ObfuscatedName("client.Tj")
	public int field627;

	@ObfuscatedName("client.ek")
	public int field636;

	@ObfuscatedName("client.Nc")
	public long field291;

	@ObfuscatedName("client.dd")
	public long field305;

	@ObfuscatedName("client.td")
	public long field321;

	@ObfuscatedName("client.Wi")
	public long field586;

	@ObfuscatedName("client.Cj")
	public long field610;

	@ObfuscatedName("client.Xe")
	public HGHKUVEK field391;

	@ObfuscatedName("client.Ye")
	public HGHKUVEK field392;

	@ObfuscatedName("client.Ze")
	public HGHKUVEK field393;

	@ObfuscatedName("client.vg")
	public HGHKUVEK field462;

	@ObfuscatedName("client.wg")
	public HGHKUVEK field463;

	@ObfuscatedName("client.xg")
	public HGHKUVEK field464;

	@ObfuscatedName("client.yg")
	public HGHKUVEK field465;

	@ObfuscatedName("client.zg")
	public HGHKUVEK field466;

	@ObfuscatedName("client.Ag")
	public HGHKUVEK field467;

	@ObfuscatedName("client.Bg")
	public HGHKUVEK field468;

	@ObfuscatedName("client.Cg")
	public HGHKUVEK field469;

	@ObfuscatedName("client.Dg")
	public HGHKUVEK field470;

	@ObfuscatedName("client.lh")
	public HGHKUVEK field502;

	@ObfuscatedName("client.mh")
	public HGHKUVEK field503;

	@ObfuscatedName("client.nh")
	public HGHKUVEK field504;

	@ObfuscatedName("client.oh")
	public HGHKUVEK field505;

	@ObfuscatedName("client.Nh")
	public HGHKUVEK field528;

	@ObfuscatedName("client.Oh")
	public HGHKUVEK field529;

	@ObfuscatedName("client.Ph")
	public HGHKUVEK field530;

	@ObfuscatedName("client.Qh")
	public HGHKUVEK field531;

	@ObfuscatedName("client.Rh")
	public HGHKUVEK field532;

	@ObfuscatedName("client.Sh")
	public HGHKUVEK field533;

	@ObfuscatedName("client.Th")
	public HGHKUVEK field534;

	@ObfuscatedName("client.Uh")
	public HGHKUVEK field535;

	@ObfuscatedName("client.Vh")
	public HGHKUVEK field536;

	@ObfuscatedName("client.bk")
	public IBVXWOKK field633;

	@ObfuscatedName("client.Vb")
	public KMJQVYHB field258;

	@ObfuscatedName("client.Yh")
	public LKPVZAQN field539;

	@ObfuscatedName("client.Pb")
	public OGPNACTP field252;

	@ObfuscatedName("client.Qb")
	public OGPNACTP field253;

	@ObfuscatedName("client.Kc")
	public OGPNACTP field289;

	@ObfuscatedName("client.Je")
	public OGPNACTP field380;

	@ObfuscatedName("client.Ke")
	public OGPNACTP field381;

	@ObfuscatedName("client.Yf")
	public OGPNACTP field443;

	@ObfuscatedName("client.Zf")
	public OGPNACTP field444;

	@ObfuscatedName("client.ug")
	public OGPNACTP field461;

	@ObfuscatedName("client.jh")
	public OGPNACTP field500;

	@ObfuscatedName("client.gj")
	public OGPNACTP field594;

	@ObfuscatedName("client.hj")
	public OGPNACTP field595;

	@ObfuscatedName("client.ij")
	public OGPNACTP field596;

	@ObfuscatedName("client.jj")
	public OGPNACTP field597;

	@ObfuscatedName("client.kj")
	public OGPNACTP field598;

	@ObfuscatedName("client.jk")
	public OGPNACTP field641;

	@ObfuscatedName("client.Yc")
	public OSRLSEOB field300;

	@ObfuscatedName("client.Zc")
	public OSRLSEOB field301;

	@ObfuscatedName("client.ed")
	public OSRLSEOB field306;

	@ObfuscatedName("client.fd")
	public OSRLSEOB field307;

	@ObfuscatedName("client.gd")
	public OSRLSEOB field308;

	@ObfuscatedName("client.hd")
	public OSRLSEOB field309;

	@ObfuscatedName("client.id")
	public OSRLSEOB field310;

	@ObfuscatedName("client.Gf")
	public OSRLSEOB field425;

	@ObfuscatedName("client.Hf")
	public OSRLSEOB field426;

	@ObfuscatedName("client.If")
	public OSRLSEOB field427;

	@ObfuscatedName("client.bh")
	public OSRLSEOB field492;

	@ObfuscatedName("client.ch")
	public OSRLSEOB field493;

	@ObfuscatedName("client.dh")
	public OSRLSEOB field494;

	@ObfuscatedName("client.eh")
	public OSRLSEOB field495;

	@ObfuscatedName("client.fh")
	public OSRLSEOB field496;

	@ObfuscatedName("client.Ij")
	public OSRLSEOB field616;

	@ObfuscatedName("client.Jj")
	public OSRLSEOB field617;

	@ObfuscatedName("client.Kj")
	public OSRLSEOB field618;

	@ObfuscatedName("client.Yj")
	public OSRLSEOB field631;

	@ObfuscatedName("client.Zj")
	public OSRLSEOB field632;

	@ObfuscatedName("client.sj")
	public QPWZYOZR field603;

	@ObfuscatedName("client.Pd")
	public QVSTBDDY field339;

	@ObfuscatedName("client.Od")
	public static SRMWIYVM field338;

	@ObfuscatedName("client.Nj")
	public XAGUDWSZ field621;

	@ObfuscatedName("client.vf")
	public YCYYIGLM field414;

	@ObfuscatedName("client.wf")
	public YCYYIGLM field415;

	@ObfuscatedName("client.xf")
	public YCYYIGLM field416;

	@ObfuscatedName("client.yf")
	public YCYYIGLM field417;

	@ObfuscatedName("client.S")
	public String field206;

	@ObfuscatedName("client.sd")
	public String field320;

	@ObfuscatedName("client.tf")
	public String field412;

	@ObfuscatedName("client.Wj")
	public String field629;

	@ObfuscatedName("client.zb")
	public Socket field236;

	@ObfuscatedName("client.xe")
	public static boolean field369;

	@ObfuscatedName("client.Ce")
	public static boolean field374;

	@ObfuscatedName("client.Tf")
	public static boolean field438;

	@ObfuscatedName("client.dg")
	public static boolean field448;

	@ObfuscatedName("client.jd")
	public int[] field311;

	@ObfuscatedName("client.kd")
	public int[] field312;

	@ObfuscatedName("client.Ad")
	public int[] field326;

	@ObfuscatedName("client.Bd")
	public int[] field327;

	@ObfuscatedName("client.Cd")
	public int[] field328;

	@ObfuscatedName("client.Dd")
	public int[] field329;

	@ObfuscatedName("client.je")
	public int[] field356;

	@ObfuscatedName("client.ke")
	public int[] field357;

	@ObfuscatedName("client.le")
	public int[] field358;

	@ObfuscatedName("client.Ae")
	public int[] field372;

	@ObfuscatedName("client.Be")
	public int[] field373;

	@ObfuscatedName("client.Qi")
	public int[] field581;

	@ObfuscatedName("client.Ri")
	public int[] field582;

	@ObfuscatedName("client.Si")
	public int[] field583;

	@ObfuscatedName("client.Ti")
	public int[] field584;

	@ObfuscatedName("client.qb")
	public OSRLSEOB[] field228;

	@ObfuscatedName("client.hc")
	public byte[][] field269;

	@ObfuscatedName("client.Ff")
	public byte[][] field424;

	@ObfuscatedName("client.Tc")
	public byte[][][] field296;

	@ObfuscatedName("client.Wb")
	public int[][][] field259;

	@ObfuscatedName("client.a()V")
	public final void method19() {
		method26(20, "Starting up");

		if (signlink.sunjava) {
			field65 = 5;
		}

		if (field374) {
			field509 = true;
		} else {
			field374 = true;
			boolean var1 = false;
			String var2 = method111();
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
						field615[var3] = new JXARNXDE(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method167();
					field539 = method75(field292[1], 1, "title screen", 25, "title");
					field414 = new YCYYIGLM(false, field539, "p11_full");
					field415 = new YCYYIGLM(false, field539, "p12_full");
					field416 = new YCYYIGLM(false, field539, "b12_full");
					field417 = new YCYYIGLM(true, field539, "q8_full");
					method119();
					method152();
					LKPVZAQN var4 = method75(field292[2], 2, "config", 30, "config");
					LKPVZAQN var5 = method75(field292[3], 3, "interface", 35, "interface");
					LKPVZAQN var6 = method75(field292[4], 4, "2d graphics", 40, "media");
					LKPVZAQN var7 = method75(field292[6], 6, "textures", 45, "textures");
					LKPVZAQN var8 = method75(field292[7], 7, "chat system", 50, "wordenc");
					LKPVZAQN var9 = method75(field292[8], 8, "sound effects", 55, "sounds");
					field296 = new byte[4][104][104];
					field259 = new int[4][105][105];
					field603 = new QPWZYOZR(104, 4, field259, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field299[var10] = new BBOYCGQQ(104, 104);
					}

					field461 = new OGPNACTP(512, 512);
					LKPVZAQN var11 = method75(field292[5], 5, "update list", 60, "versionlist");
					method26(60, "Connecting to update server");
					field633 = new IBVXWOKK();
					field633.method295(var11, this);
					FGGKJQKK.method231(field633.method281());
					FCIDIKVY.method196(field633.method293(0), field633);

					if (!field369) {
						field234 = 0;
						field235 = true;
						field633.method292(2, field234);

						while (field633.method291() > 0) {
							method54();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field633.field918 > 3) {
								method180("ondemand");
								return;
							}
						}
					}

					method26(65, "Requesting animations");
					int var12 = field633.method293(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field633.method292(1, var13);
					}

					while (field633.method291() > 0) {
						int var14 = var12 - field633.method291();
						if (var14 > 0) {
							method26(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method54();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field633.field918 > 3) {
							method180("ondemand");
							return;
						}
					}

					method26(70, "Requesting models");
					int var15 = field633.method293(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field633.method287(var16);
						if ((var17 & 0x1) != 0) {
							field633.method292(0, var16);
						}
					}

					int var18 = field633.method291();
					while (field633.method291() > 0) {
						int var19 = var18 - field633.method291();
						if (var19 > 0) {
							method26(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method54();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field615[0] != null) {
						method26(75, "Requesting maps");
						field633.method292(3, field633.method277(47, 48, 0));
						field633.method292(3, field633.method277(47, 48, 1));
						field633.method292(3, field633.method277(48, 48, 0));
						field633.method292(3, field633.method277(48, 48, 1));
						field633.method292(3, field633.method277(49, 48, 0));
						field633.method292(3, field633.method277(49, 48, 1));
						field633.method292(3, field633.method277(47, 47, 0));
						field633.method292(3, field633.method277(47, 47, 1));
						field633.method292(3, field633.method277(48, 47, 0));
						field633.method292(3, field633.method277(48, 47, 1));
						field633.method292(3, field633.method277(48, 148, 0));
						field633.method292(3, field633.method277(48, 148, 1));
						int var20 = field633.method291();
						while (field633.method291() > 0) {
							int var21 = var20 - field633.method291();
							if (var21 > 0) {
								method26(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method54();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field633.method293(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field633.method287(var23);
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
							field633.method284(0, var23, var25);
						}
					}

					field633.method278(field368);

					if (!field369) {
						int var26 = field633.method293(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field633.method296(var27)) {
								field633.method284(2, var27, (byte) 1);
							}
						}
					}

					method26(80, "Unpacking media");
					field425 = new OSRLSEOB(var6, "invback", 0);
					field427 = new OSRLSEOB(var6, "chatback", 0);
					field426 = new OSRLSEOB(var6, "mapback", 0);
					field616 = new OSRLSEOB(var6, "backbase1", 0);
					field617 = new OSRLSEOB(var6, "backbase2", 0);
					field618 = new OSRLSEOB(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field285[var28] = new OSRLSEOB(var6, "sideicons", var28);
					}

					field500 = new OGPNACTP(var6, "compass", 0);
					field641 = new OGPNACTP(var6, "mapedge", 0);
					field641.method353();

					for (int var29 = 0; var29 < 72; var29++) {
						field549[var29] = new OSRLSEOB(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field350[var30] = new OGPNACTP(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field600[var31] = new OGPNACTP(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field506[var32] = new OGPNACTP(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field386[var33] = new OGPNACTP(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field378[var34] = new OGPNACTP(var6, "headicons_hint", var34);
					}

					field289 = new OGPNACTP(var6, "overlay_multiway", 0);
					field443 = new OGPNACTP(var6, "mapmarker", 0);
					field444 = new OGPNACTP(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field290[var35] = new OGPNACTP(var6, "cross", var35);
					}

					field594 = new OGPNACTP(var6, "mapdots", 0);
					field595 = new OGPNACTP(var6, "mapdots", 1);
					field596 = new OGPNACTP(var6, "mapdots", 2);
					field597 = new OGPNACTP(var6, "mapdots", 3);
					field598 = new OGPNACTP(var6, "mapdots", 4);
					field300 = new OSRLSEOB(var6, "scrollbar", 0);
					field301 = new OSRLSEOB(var6, "scrollbar", 1);
					field492 = new OSRLSEOB(var6, "redstone1", 0);
					field493 = new OSRLSEOB(var6, "redstone2", 0);
					field494 = new OSRLSEOB(var6, "redstone3", 0);
					field495 = new OSRLSEOB(var6, "redstone1", 0);
					field495.method366();
					field496 = new OSRLSEOB(var6, "redstone2", 0);
					field496.method366();
					field306 = new OSRLSEOB(var6, "redstone1", 0);
					field306.method367();
					field307 = new OSRLSEOB(var6, "redstone2", 0);
					field307.method367();
					field308 = new OSRLSEOB(var6, "redstone3", 0);
					field308.method367();
					field309 = new OSRLSEOB(var6, "redstone1", 0);
					field309.method366();
					field309.method367();
					field310 = new OSRLSEOB(var6, "redstone2", 0);
					field310.method366();
					field310.method367();

					for (int var36 = 0; var36 < 2; var36++) {
						field553[var36] = new OSRLSEOB(var6, "mod_icons", var36);
					}

					OGPNACTP var37 = new OGPNACTP(var6, "backleft1", 0);
					field462 = new HGHKUVEK(method24(), var37.field1134, var37.field1135);
					var37.method354(0, 0);
					OGPNACTP var38 = new OGPNACTP(var6, "backleft2", 0);
					field463 = new HGHKUVEK(method24(), var38.field1134, var38.field1135);
					var38.method354(0, 0);
					OGPNACTP var39 = new OGPNACTP(var6, "backright1", 0);
					field464 = new HGHKUVEK(method24(), var39.field1134, var39.field1135);
					var39.method354(0, 0);
					OGPNACTP var40 = new OGPNACTP(var6, "backright2", 0);
					field465 = new HGHKUVEK(method24(), var40.field1134, var40.field1135);
					var40.method354(0, 0);
					OGPNACTP var41 = new OGPNACTP(var6, "backtop1", 0);
					field466 = new HGHKUVEK(method24(), var41.field1134, var41.field1135);
					var41.method354(0, 0);
					OGPNACTP var42 = new OGPNACTP(var6, "backvmid1", 0);
					field467 = new HGHKUVEK(method24(), var42.field1134, var42.field1135);
					var42.method354(0, 0);
					OGPNACTP var43 = new OGPNACTP(var6, "backvmid2", 0);
					field468 = new HGHKUVEK(method24(), var43.field1134, var43.field1135);
					var43.method354(0, 0);
					OGPNACTP var44 = new OGPNACTP(var6, "backvmid3", 0);
					field469 = new HGHKUVEK(method24(), var44.field1134, var44.field1135);
					var44.method354(0, 0);
					OGPNACTP var45 = new OGPNACTP(var6, "backhmid2", 0);
					field470 = new HGHKUVEK(method24(), var45.field1134, var45.field1135);
					var45.method354(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field350[var50] != null) {
							field350[var50].method352(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field549[var50] != null) {
							field549[var50].method368(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method26(83, "Unpacking textures");
					PIHSODZS.method377(var7);
					PIHSODZS.method381(0.8D);
					PIHSODZS.method376(20);
					method26(86, "Unpacking config");
					XETSOHUA.method566(var4);
					FUIMNWOZ.method236(var4);
					QRIJREXW.method450(var4);
					AAHIRSBF.method8(var4);
					PJGEBWSY.method394(var4);
					FDNUHSLC.method225(var4);
					XBHNZKGU.method561(var4);
					XDAGNEWI.method564(var4);
					UDOLPBTU.method495(var4);
					AAHIRSBF.field43 = field368;

					if (!field369) {
						method26(90, "Unpacking sounds");
						byte[] var51 = var9.method323("sounds.dat", null);
						WBEWPIXO var52 = new WBEWPIXO(var51);
						VKAZQVPD.method497(var52);
					}

					method26(95, "Unpacking interfaces");
					YCYYIGLM[] var53 = new YCYYIGLM[] { field414, field415, field416, field417 };
					MRUJPFPS.method328(var5, var6, var53);
					method26(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field426.field1140[field426.field1142 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field322[var54] = var55;
						field481[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field426.field1140[field426.field1142 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field224[var58 - 5] = var59 - 25;
						field476[var58 - 5] = var60 - var59;
					}

					PIHSODZS.method374(765, 503);
					field329 = PIHSODZS.field1196;
					PIHSODZS.method374(479, 96);
					field326 = PIHSODZS.field1196;
					PIHSODZS.method374(190, 261);
					field327 = PIHSODZS.field1196;
					PIHSODZS.method374(512, 334);
					field328 = PIHSODZS.field1196;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = PIHSODZS.field1194[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					QPWZYOZR.method435(800, 334, 500, 512, var62);
					TONKJGVS.method457(var8);
					field339 = new QVSTBDDY(this);
					method25(field339, 10);
					XEVZUZBV.field1502 = this;
					FUIMNWOZ.field794 = this;
					PJGEBWSY.field1230 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field206 + " " + field437);
					field331 = true;
				}
			} else {
				field605 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIII)V")
	public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = FCIDIKVY.field747[var7];
			int var13 = FCIDIKVY.field748[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = FCIDIKVY.field747[var8];
			int var16 = FCIDIKVY.field748[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field572 = arg5 - var9;
		field573 = arg2 - var10;
		field574 = arg0 - var11;
		field575 = arg3;
		field576 = arg4;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method25(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method25(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(BILWBEWPIXO;)V")
	public final void method48(int arg0, WBEWPIXO arg1) {
		while (arg1.field1402 + 21 < arg0 * 8) {
			int var3 = arg1.method526(14);
			if (var3 == 16383) {
				break;
			}

			if (field360[var3] == null) {
				field360[var3] = new PVFNGMTQ();
			}

			PVFNGMTQ var4 = field360[var3];
			field362[field361++] = var3;
			var4.field164 = field552;
			int var5 = arg1.method526(1);
			int var6 = arg1.method526(1);
			if (var6 == 1) {
				field434[field433++] = var3;
			}

			int var7 = arg1.method526(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method526(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1245 = PJGEBWSY.method393(arg1.method526(13));
			var4.field156 = var4.field1245.field1229;
			var4.field181 = var4.field1245.field1232;
			var4.field148 = var4.field1245.field1242;
			var4.field149 = var4.field1245.field1211;
			var4.field150 = var4.field1245.field1219;
			var4.field151 = var4.field1245.field1221;
			var4.field195 = var4.field1245.field1237;
			var4.method43(var5 == 1, field338.field144[0] + var8, field338.field143[0] + var7);
		}

		arg1.method527();
	}

	@ObfuscatedName("client.a(LSRMWIYVM;ZIII)V")
	public final void method49(SRMWIYVM arg0, int arg1, int arg2, int arg3) {
		if (field338 != arg0 && field627 < 400) {
			String var5;
			if (arg0.field1352 == 0) {
				var5 = arg0.field1371 + method158(field338.field1363, arg0.field1363) + " (level-" + arg0.field1363 + ")";
			} else {
				var5 = arg0.field1371 + " (skill-" + arg0.field1352 + ")";
			}

			if (field316 == 1) {
				field276[field627] = "Use " + field320 + " with @whi@" + var5;
				field267[field627] = 225;
				field268[field627] = arg2;
				field265[field627] = arg3;
				field266[field627] = arg1;
				field627++;
			} else if (field409 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field375[var6] != null) {
						field276[field627] = field375[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field375[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1363 > field338.field1363) {
								var7 = 2000;
							}

							if (field338.field1373 != 0 && arg0.field1373 != 0) {
								if (field338.field1373 == arg0.field1373) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field376[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field267[field627] = var7 + 33;
						}

						if (var6 == 1) {
							field267[field627] = var7 + 805;
						}

						if (var6 == 2) {
							field267[field627] = var7 + 650;
						}

						if (var6 == 3) {
							field267[field627] = var7 + 66;
						}

						if (var6 == 4) {
							field267[field627] = var7 + 328;
						}

						field268[field627] = arg2;
						field265[field627] = arg3;
						field266[field627] = arg1;
						field627++;
					}
				}
			} else if ((field411 & 0x8) == 8) {
				field276[field627] = field412 + " @whi@" + var5;
				field267[field627] = 771;
				field268[field627] = arg2;
				field265[field627] = arg3;
				field266[field627] = arg1;
				field627++;
			}

			for (int var8 = 0; var8 < field627; var8++) {
				if (field267[var8] == 238) {
					field276[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method50(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field554; var3++) {
				if (field200[var3] == arg0) {
					field554--;
					field314 = true;

					for (int var4 = var3; var4 < field554; var4++) {
						field347[var4] = field347[var4 + 1];
						field233[var4] = field233[var4 + 1];
						field200[var4] = field200[var4 + 1];
					}

					field210.method504(161);
					field210.method511(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LWBEWPIXO;II)V")
	public final void method51(WBEWPIXO arg0, int arg1) {
		while (arg0.field1402 + 10 < arg1 * 8) {
			int var3 = arg0.method526(11);
			if (var3 == 2047) {
				break;
			}

			if (field430[var3] == null) {
				field430[var3] = new SRMWIYVM();
				if (field435[var3] != null) {
					field430[var3].method454(field435[var3]);
				}
			}

			field432[field431++] = var3;
			SRMWIYVM var4 = field430[var3];
			var4.field164 = field552;
			int var5 = arg0.method526(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method526(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method526(1);
			int var8 = arg0.method526(1);
			if (var8 == 1) {
				field434[field433++] = var3;
			}

			var4.method43(var7 == 1, field338.field144[0] + var6, field338.field143[0] + var5);
		}

		arg0.method527();
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method52() {
		field503.method273();

		if (field401 == 2) {
			byte[] var1 = field426.field1140;
			int[] var2 = KPYGFVMA.field968;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field500.method360(256, 0, field525, 33, 25, field322, field481, 25, 33, 0);
			field504.method273();
			PIHSODZS.field1196 = field328;
		} else {
			int var5 = field525 + field274 & 0x7FF;
			int var6 = field338.field191 / 32 + 48;
			int var7 = 464 - field338.field192 / 32;
			field461.method360(field542 + 256, 25, var5, 146, var7, field224, field476, var6, 151, 5);
			field500.method360(256, 0, field525, 33, 25, field322, field481, 25, 33, 0);

			for (int var8 = 0; var8 < field323; var8++) {
				int var9 = field324[var8] * 4 + 2 - field338.field191 / 32;
				int var10 = field325[var8] * 4 + 2 - field338.field192 / 32;
				method55(var10, field332[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					NYZQPNXB var13 = field363[field592][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field338.field191 / 32;
						int var15 = var12 * 4 + 2 - field338.field192 / 32;
						method55(var15, field594, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field361; var16++) {
				PVFNGMTQ var17 = field360[field362[var16]];
				if (var17 != null && var17.method42()) {
					PJGEBWSY var18 = var17.field1245;
					if (var18.field1228 != null) {
						var18 = var18.method392();
					}

					if (var18 != null && var18.field1241 && var18.field1213) {
						int var19 = var17.field191 / 32 - field338.field191 / 32;
						int var20 = var17.field192 / 32 - field338.field192 / 32;
						method55(var20, field595, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field431; var21++) {
				SRMWIYVM var22 = field430[field432[var21]];
				if (var22 != null && var22.method42()) {
					int var23 = var22.field191 / 32 - field338.field191 / 32;
					int var24 = var22.field192 / 32 - field338.field192 / 32;
					boolean var25 = false;
					long var26 = XLAXYQGJ.method578(var22.field1371);
					for (int var28 = 0; var28 < field554; var28++) {
						if (field200[var28] == var26 && field233[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field338.field1373 != 0 && var22.field1373 != 0 && field338.field1373 == var22.field1373) {
						var29 = true;
					}

					if (var25) {
						method55(var24, field597, var23);
					} else if (var29) {
						method55(var24, field598, var23);
					} else {
						method55(var24, field596, var23);
					}
				}
			}

			if (field413 != 0 && field552 % 20 < 10) {
				if (field413 == 1 && field418 >= 0 && field418 < field360.length) {
					PVFNGMTQ var30 = field360[field418];
					if (var30 != null) {
						int var31 = var30.field191 / 32 - field338.field191 / 32;
						int var32 = var30.field192 / 32 - field338.field192 / 32;
						method79(var31, field444, var32);
					}
				}

				if (field413 == 2) {
					int var33 = (field239 - field487) * 4 + 2 - field338.field191 / 32;
					int var34 = (field240 - field488) * 4 + 2 - field338.field192 / 32;
					method79(var33, field444, var34);
				}

				if (field413 == 10 && field344 >= 0 && field344 < field430.length) {
					SRMWIYVM var35 = field430[field344];
					if (var35 != null) {
						int var36 = var35.field191 / 32 - field338.field191 / 32;
						int var37 = var35.field192 / 32 - field338.field192 / 32;
						method79(var36, field444, var37);
					}
				}
			}

			if (field459 != 0) {
				int var38 = field459 * 4 + 2 - field338.field191 / 32;
				int var39 = field460 * 4 + 2 - field338.field192 / 32;
				method55(var39, field443, var38);
			}

			KPYGFVMA.method315(0xFFFFFF, 97, 78, 3, 3);
			field504.method273();
			PIHSODZS.field1196 = field328;
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method53(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method54() {
		while (true) {
			BYVCZVKG var1 = field633.method283();
			if (var1 == null) {
				return;
			}

			if (var1.field140 == 0) {
				FCIDIKVY.method197(var1.field139, var1.field142);

				if ((field633.method287(var1.field139) & 0x62) != 0) {
					field314 = true;

					if (field287 != -1 || field479 != -1) {
						field578 = true;
					}
				}
			}

			if (var1.field140 == 1 && var1.field142 != null) {
				FGGKJQKK.method232(var1.field142);
			}

			if (var1.field140 == 2 && field234 == var1.field139 && var1.field142 != null) {
				method88(field235, var1.field142);
			}

			if (var1.field140 == 3 && field591 == 1) {
				for (int var2 = 0; var2 < field269.length; var2++) {
					if (field357[var2] == var1.field139) {
						field269[var2] = var1.field142;

						if (var1.field142 == null) {
							field357[var2] = -1;
						}

						break;
					}

					if (field358[var2] == var1.field139) {
						field424[var2] = var1.field142;

						if (var1.field142 == null) {
							field358[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field140 == 93 && field633.method276(var1.field139)) {
				GQBPDNOP.method247(new WBEWPIXO(var1.field142), field633);
			}
		}
	}

	@ObfuscatedName("client.a(IILOGPNACTP;I)V")
	public final void method55(int arg0, OGPNACTP arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field525 + field274 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = FCIDIKVY.field747[var4];
				int var7 = FCIDIKVY.field748[var4];
				var6 = var6 * 256 / (field542 + 256);
				var7 = var7 * 256 / (field542 + 256);
				int var8 = arg0 * var6 + arg2 * var7 >> 16;
				int var9 = arg0 * var7 - arg2 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method362(var8 + 94 + 4 - arg1.field1138 / 2, 83 - var9 - arg1.field1139 / 2 - 4, field426);
				} else {
					arg1.method356(var8 + 94 + 4 - arg1.field1138 / 2, 83 - var9 - arg1.field1139 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIILPJGEBWSY;)V")
	public final void method56(int arg0, int arg1, int arg2, PJGEBWSY arg3) {
		if (field627 < 400) {
			if (arg3.field1228 != null) {
				arg3 = arg3.method392();
			}

			if (arg3 != null && arg3.field1213) {
				String var5 = arg3.field1239;
				if (arg3.field1220 != 0) {
					var5 = var5 + method158(field338.field1363, arg3.field1220) + " (level-" + arg3.field1220 + ")";
				}

				if (field316 == 1) {
					field276[field627] = "Use " + field320 + " with @yel@" + var5;
					field267[field627] = 60;
					field268[field627] = arg2;
					field265[field627] = arg1;
					field266[field627] = arg0;
					field627++;
				} else if (field409 != 1) {
					if (arg3.field1238 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1238[var6] != null && !arg3.field1238[var6].equalsIgnoreCase("attack")) {
								field276[field627] = arg3.field1238[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field267[field627] = 531;
								}

								if (var6 == 1) {
									field267[field627] = 810;
								}

								if (var6 == 2) {
									field267[field627] = 641;
								}

								if (var6 == 3) {
									field267[field627] = 69;
								}

								if (var6 == 4) {
									field267[field627] = 157;
								}

								field268[field627] = arg2;
								field265[field627] = arg1;
								field266[field627] = arg0;
								field627++;
							}
						}
					}

					if (arg3.field1238 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1238[var7] != null && arg3.field1238[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1220 > field338.field1363) {
									var8 = 2000;
								}

								field276[field627] = arg3.field1238[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field267[field627] = var8 + 531;
								}

								if (var7 == 1) {
									field267[field627] = var8 + 810;
								}

								if (var7 == 2) {
									field267[field627] = var8 + 641;
								}

								if (var7 == 3) {
									field267[field627] = var8 + 69;
								}

								if (var7 == 4) {
									field267[field627] = var8 + 157;
								}

								field268[field627] = arg2;
								field265[field627] = arg1;
								field266[field627] = arg0;
								field627++;
							}
						}
					}

					field276[field627] = "Examine @yel@" + var5;
					field267[field627] = 1261;
					field268[field627] = arg2;
					field265[field627] = arg1;
					field266[field627] = arg0;
					field627++;
				} else if ((field411 & 0x2) == 2) {
					field276[field627] = field412 + " @yel@" + var5;
					field267[field627] = 154;
					field268[field627] = arg2;
					field265[field627] = arg1;
					field266[field627] = arg0;
					field627++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBI)Z")
	public final boolean method57(int arg0, int arg1) {
		boolean var3 = false;
		MRUJPFPS var4 = MRUJPFPS.method324(arg1);
		for (int var5 = 0; var5 < var4.field1032.length && var4.field1032[var5] != -1; var5++) {
			MRUJPFPS var6 = MRUJPFPS.method324(var4.field1032[var5]);
			if (var6.field1025 == 0) {
				var3 |= method57(arg0, var6.field1040);
			}

			if (var6.field1025 == 6 && (var6.field1038 != -1 || var6.field1039 != -1)) {
				boolean var7 = method161(var6);
				int var8;
				if (var7) {
					var8 = var6.field1039;
				} else {
					var8 = var6.field1038;
				}

				if (var8 != -1) {
					XETSOHUA var9 = XETSOHUA.field1474[var8];
					var6.field994 += arg0;
					while (var6.field994 > var9.method567(var6.field1056)) {
						var6.field994 -= var9.method567(var6.field1056) + 1;
						var6.field1056++;
						if (var6.field1056 >= var9.field1475) {
							var6.field1056 -= var9.field1479;
							if (var6.field1056 < 0 || var6.field1056 >= var9.field1475) {
								var6.field1056 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1025 == 6 && var6.field1030 != 0) {
				int var10 = var6.field1030 >> 16;
				int var11 = var6.field1030 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field999 = var6.field999 + var10 & 0x7FF;
				var6.field1000 = var6.field1000 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(LMRUJPFPS;Z)V")
	public final void method58(MRUJPFPS arg0) {
		int var2 = arg0.field987;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field555 == 0) {
				arg0.field997 = "Loading friend list";
				arg0.field1048 = 0;
			} else if (var2 == 1 && field555 == 1) {
				arg0.field997 = "Connecting to friendserver";
				arg0.field1048 = 0;
			} else if (var2 == 2 && field555 != 2) {
				arg0.field997 = "Please wait...";
				arg0.field1048 = 0;
			} else {
				int var3 = field554;
				if (field555 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field997 = "";
					arg0.field1048 = 0;
				} else {
					arg0.field997 = field347[var2];
					arg0.field1048 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field554;
			if (field555 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field997 = "";
				arg0.field1048 = 0;
			} else {
				if (field233[var2] == 0) {
					arg0.field997 = "@red@Offline";
				} else if (field233[var2] < 200) {
					if (field233[var2] == field366) {
						arg0.field997 = "@gre@World" + (field233[var2] - 9);
					} else {
						arg0.field997 = "@yel@World" + (field233[var2] - 9);
					}
				} else if (field233[var2] == field366) {
					arg0.field997 = "@gre@Classic" + (field233[var2] - 219);
				} else {
					arg0.field997 = "@yel@Classic" + (field233[var2] - 219);
				}

				arg0.field1048 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field554;
			if (field555 != 2) {
				var5 = 0;
			}

			arg0.field1051 = var5 * 15 + 20;
			if (arg0.field1051 <= arg0.field1009) {
				arg0.field1051 = arg0.field1009 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field555 == 0) {
				arg0.field997 = "Loading ignore list";
				arg0.field1048 = 0;
			} else if (var2 == 1 && field555 == 0) {
				arg0.field997 = "Please wait...";
				arg0.field1048 = 0;
			} else {
				int var6 = field277;
				if (field555 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field997 = "";
					arg0.field1048 = 0;
				} else {
					arg0.field997 = XLAXYQGJ.method582(XLAXYQGJ.method579(field343[var2]));
					arg0.field1048 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1051 = field277 * 15 + 20;
			if (arg0.field1051 <= arg0.field1009) {
				arg0.field1051 = arg0.field1009 + 1;
			}
		} else if (var2 == 327) {
			arg0.field999 = 150;
			arg0.field1000 = (int) (Math.sin(field552 / 40.0D) * 256.0D) & 0x7FF;

			if (field330) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field294[var7];
					if (var8 >= 0 && !FDNUHSLC.field752[var8].method227()) {
						return;
					}
				}

				field330 = false;
				FCIDIKVY[] var9 = new FCIDIKVY[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field294[var11];
					if (var12 >= 0) {
						var9[var10++] = FDNUHSLC.field752[var12].method228();
					}
				}

				FCIDIKVY var13 = new FCIDIKVY(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field379[var14] != 0) {
						var13.method213(field337[var14][0], field337[var14][field379[var14]]);

						if (var14 == 1) {
							var13.method213(field475[0], field475[field379[var14]]);
						}
					}
				}

				var13.method206();
				var13.method207(XETSOHUA.field1474[field338.field195].field1476[0]);
				var13.method216(64, 850, -30, -50, -30, true);
				arg0.field1004 = 5;
				arg0.field1005 = 0;
				MRUJPFPS.method329(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field380 == null) {
				field380 = arg0.field1041;
				field381 = arg0.field1049;
			}

			if (field608) {
				arg0.field1041 = field381;
			} else {
				arg0.field1041 = field380;
			}
		} else if (var2 == 325) {
			if (field380 == null) {
				field380 = arg0.field1041;
				field381 = arg0.field1049;
			}

			if (field608) {
				arg0.field1041 = field380;
			} else {
				arg0.field1041 = field381;
			}
		} else if (var2 == 600) {
			arg0.field997 = field585;
			if (field552 % 20 < 10) {
				arg0.field997 = arg0.field997 + "|";
			} else {
				arg0.field997 = arg0.field997 + " ";
			}
		} else if (var2 == 620) {
			if (field471 < 1) {
				arg0.field997 = "";
			} else if (field518) {
				arg0.field1018 = 0xFF0000;
				arg0.field997 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1018 = 0xFFFFFF;
				arg0.field997 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field288 - field298;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field997 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field394 == 0) {
				arg0.field997 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field394 <= field288) {
				arg0.field997 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method59(field394);
			} else {
				int var17 = field288 + 14 - field394;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field997 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method59(field394) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field452 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field452 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field452 + " unread messages";
			}

			arg0.field997 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field474 > 0 && field474 <= field288 + 10) {
				arg0.field997 = "Last password change:\\n@gre@" + method59(field474);
			} else {
				arg0.field997 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field439 > 2 && !field368) {
				arg0.field997 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field439 > 2) {
				arg0.field997 = "\\n\\nYou have @gre@" + field439 + "@yel@ days of\\nmember credit remaining.";
			} else if (field439 > 0) {
				arg0.field997 = "You have @gre@" + field439 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field997 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field439 > 2 && !field368) {
				arg0.field997 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field439 > 0) {
				arg0.field997 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field997 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field394 > field288) {
				arg0.field997 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field997 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method59(int arg0) {
		if (arg0 > field288 + 10) {
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

	@ObfuscatedName("client.a(ILWBEWPIXO;I)V")
	public final void method60(WBEWPIXO arg0, int arg1) {
		arg0.method525();
		int var3 = arg0.method526(1);
		if (var3 != 0) {
			int var4 = arg0.method526(2);
			if (var4 == 0) {
				field434[field433++] = field429;
			} else if (var4 == 1) {
				int var5 = arg0.method526(3);
				field338.method45(false, var5);
				int var6 = arg0.method526(1);
				if (var6 == 1) {
					field434[field433++] = field429;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method526(3);
				field338.method45(true, var7);
				int var8 = arg0.method526(3);
				field338.method45(true, var8);
				int var9 = arg0.method526(1);
				if (var9 == 1) {
					field434[field433++] = field429;
				}
			} else if (var4 == 3) {
				field592 = arg0.method526(2);
				int var10 = arg0.method526(1);
				if (var10 == 1) {
					field434[field433++] = field429;
				}

				int var11 = arg0.method526(7);
				int var12 = arg0.method526(1);
				int var13 = arg0.method526(7);
				field338.method43(var12 == 1, var13, var11);
			}
		}
	}

	@ObfuscatedName("client.a(ILSRMWIYVM;IILWBEWPIXO;)V")
	public final void method61(SRMWIYVM arg0, int arg1, int arg2, WBEWPIXO arg3) {
		if ((arg1 & 0x4) != 0) {
			int var5 = arg3.method517();
			int var6 = arg3.method533();
			int var7 = arg3.method534();
			int var8 = arg3.field1401;

			if (arg0.field1371 != null && arg0.field1372) {
				long var9 = XLAXYQGJ.method578(arg0.field1371);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field277; var12++) {
						if (field343[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field566 == 0) {
					try {
						field359.field1401 = 0;
						arg3.method552(0, var7, field359.field1400);
						field359.field1401 = 0;
						String var13 = IWFUJXTN.method297(var7, field359);
						var13 = TONKJGVS.method467(var13);
						arg0.field188 = var13;
						arg0.field177 = var5 >> 8;
						arg0.field175 = var5 & 0xFF;
						arg0.field174 = 150;

						if (var6 == 2 || var6 == 3) {
							method175(1, var13, "@cr2@" + arg0.field1371);
						} else if (var6 == 1) {
							method175(1, var13, "@cr1@" + arg0.field1371);
						} else {
							method175(2, var13, arg0.field1371);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field1401 = var7 + var8;
		}

		if ((arg1 & 0x8) != 0) {
			int var15 = arg3.method541();
			if (var15 == 0xFFFF) {
				var15 = -1;
			}

			int var16 = arg3.method532();
			if (arg0.field183 == var15 && var15 != -1) {
				int var17 = XETSOHUA.field1474[var15].field1488;
				if (var17 == 1) {
					arg0.field184 = 0;
					arg0.field185 = 0;
					arg0.field186 = var16;
					arg0.field187 = 0;
				}

				if (var17 == 2) {
					arg0.field187 = 0;
				}
			} else if (var15 == -1 || arg0.field183 == -1 || XETSOHUA.field1474[var15].field1482 >= XETSOHUA.field1474[arg0.field183].field1482) {
				arg0.field183 = var15;
				arg0.field184 = 0;
				arg0.field185 = 0;
				arg0.field186 = var16;
				arg0.field187 = 0;
				arg0.field176 = arg0.field173;
			}
		}

		if ((arg1 & 0x200) != 0) {
			int var18 = arg3.method515();
			int var19 = arg3.method515();
			arg0.method46(var18, var19, field552);
			arg0.field178 = field552 + 300;
			arg0.field179 = arg3.method533();
			arg0.field180 = arg3.method533();
		}

		if ((arg1 & 0x400) != 0) {
			arg0.field165 = arg3.method541();
			int var20 = arg3.method520();
			arg0.field169 = var20 >> 16;
			arg0.field168 = (var20 & 0xFFFF) + field552;
			arg0.field166 = 0;
			arg0.field167 = 0;

			if (arg0.field168 > field552) {
				arg0.field166 = -1;
			}

			if (arg0.field165 == 0xFFFF) {
				arg0.field165 = -1;
			}
		}

		if ((arg1 & 0x2) != 0) {
			int var21 = arg3.method534();
			int var22 = arg3.method515();
			arg0.method46(var21, var22, field552);
			arg0.field178 = field552 + 300;
			arg0.field179 = arg3.method532();
			arg0.field180 = arg3.method515();
		}

		if ((arg1 & 0x100) != 0) {
			arg0.field157 = arg3.method534();
			arg0.field159 = arg3.method515();
			arg0.field158 = arg3.method534();
			arg0.field160 = arg3.method515();
			arg0.field161 = arg3.method541() + field552;
			arg0.field162 = arg3.method542() + field552;
			arg0.field163 = arg3.method534();
			arg0.method44();
		}

		if ((arg1 & 0x40) != 0) {
			int var23 = arg3.method533();
			byte[] var24 = new byte[var23];
			WBEWPIXO var25 = new WBEWPIXO(var24);
			arg3.method552(0, var23, var24);
			field435[arg2] = var25;
			arg0.method454(var25);
		}

		if ((arg1 & 0x1) != 0) {
			arg0.field153 = arg3.method541();
			arg0.field154 = arg3.method542();
		}

		if ((arg1 & 0x10) != 0) {
			arg0.field197 = arg3.method542();
			if (arg0.field197 == 0xFFFF) {
				arg0.field197 = -1;
			}
		}

		if ((arg1 & 0x80) != 0) {
			arg0.field188 = arg3.method522();
			if (arg0.field188.charAt(0) == '~') {
				arg0.field188 = arg0.field188.substring(1);
				method175(2, arg0.field188, arg0.field1371);
			} else if (field338 == arg0) {
				method175(2, arg0.field188, arg0.field1371);
			}

			arg0.field177 = 0;
			arg0.field175 = 0;
			arg0.field174 = 150;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		BIWICTTN var10 = null;
		for (BIWICTTN var11 = (BIWICTTN) field346.method340(); var11 != null; var11 = (BIWICTTN) field346.method342()) {
			if (var11.field131 == arg3 && var11.field133 == arg5 && var11.field134 == arg7 && var11.field132 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new BIWICTTN();
			var10.field131 = arg3;
			var10.field132 = arg2;
			var10.field133 = arg5;
			var10.field134 = arg7;
			method103(var10);
			field346.method337(var10);
		}

		var10.field135 = arg4;
		var10.field137 = arg8;
		var10.field136 = arg1;
		var10.field130 = arg6;
		var10.field129 = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method63(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field554; var2++) {
			if (arg0.equalsIgnoreCase(field347[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field338.field1371)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(Z)V")
	public static final void method64() {
		QPWZYOZR.field1246 = true;
		PIHSODZS.field1185 = true;
		field369 = true;
		GQBPDNOP.field822 = true;
		FUIMNWOZ.field810 = true;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method65() {
		if (field399 > 0) {
			method170();
		} else {
			method171("Please wait - attempting to reestablish", "Connection lost");
			field401 = 0;
			field459 = 0;
			KMJQVYHB var1 = field258;
			field613 = false;
			field211 = 0;
			method108(field519, field520, true);

			if (!field613) {
				method170();
			}

			try {
				var1.method304();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void method66(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field640[var4] != null) {
				int var5 = field638[var4];
				int var6 = field614 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field639[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field384 == 0 || field384 == 1 && method63(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field338.field1371)) {
						if (field471 >= 1) {
							field276[field627] = "Report abuse @whi@" + var7;
							field267[field627] = 674;
							field627++;
						}

						field276[field627] = "Add ignore @whi@" + var7;
						field267[field627] = 478;
						field627++;
						field276[field627] = "Add friend @whi@" + var7;
						field267[field627] = 50;
						field627++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field449 == 0 && (var5 == 7 || field283 == 0 || field283 == 1 && method63(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field471 >= 1) {
							field276[field627] = "Report abuse @whi@" + var7;
							field267[field627] = 674;
							field627++;
						}

						field276[field627] = "Add ignore @whi@" + var7;
						field267[field627] = 478;
						field627++;
						field276[field627] = "Add friend @whi@" + var7;
						field267[field627] = 50;
						field627++;
					}

					var3++;
				}

				if (var5 == 4 && (field538 == 0 || field538 == 1 && method63(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field276[field627] = "Accept trade @whi@" + var7;
						field267[field627] = 504;
						field627++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field449 == 0 && field283 < 2) {
					var3++;
				}

				if (var5 == 8 && (field538 == 0 || field538 == 1 && method63(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field276[field627] = "Accept challenge @whi@" + var7;
						field267[field627] = 56;
						field627++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public static final String method67(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.j(I)V")
	public final void method68() {
		field210.method504(54);

		if (field282 != -1) {
			method73(field282);
			field282 = -1;
			field314 = true;
			field478 = false;
			field302 = true;
		}

		if (field287 != -1) {
			method73(field287);
			field287 = -1;
			field578 = true;
			field478 = false;
		}

		if (field522 != -1) {
			method73(field522);
			field522 = -1;
			field624 = true;
		}

		if (field442 != -1) {
			method73(field442);
			field442 = -1;
		}

		if (field602 != -1) {
			method73(field602);
			field602 = -1;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method69() {
		for (int var1 = 0; var1 < field601; var1++) {
			if (field625[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field446[var1] != field209 || field364[var1] != field408) {
						WBEWPIXO var3 = VKAZQVPD.method498(field364[var1], field446[var1]);
						if (System.currentTimeMillis() + var3.field1401 / 22 > field231 / 22 + field610) {
							field231 = var3.field1401;
							field610 = System.currentTimeMillis();

							if (method110(var3.field1400, var3.field1401)) {
								field209 = field446[var1];
								field408 = field364[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method151()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field210.method504(178);
						field210.method506(field446[var1] & 0x7FFF);
					} else {
						field210.method504(178);
						field210.method506(-1);
					}
				}

				if (var2 && field625[var1] != -5) {
					field625[var1] = -5;
				} else {
					field601--;
					for (int var5 = var1; var5 < field601; var5++) {
						field446[var5] = field446[var5 + 1];
						field364[var5] = field364[var5 + 1];
						field625[var5] = field625[var5 + 1];
					}

					var1--;
				}
			} else {
				field625[var1]--;
			}
		}

		if (field423 > 0) {
			field423 -= 20;
			if (field423 < 0) {
				field423 = 0;
			}

			if (field423 == 0 && field334 && !field369) {
				field234 = field436;
				field235 = true;
				field633.method292(2, field234);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIBIIII)V")
	public final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
			if (field369 && field592 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field603.method425(arg2, arg1, arg6);
			}

			if (arg5 == 1) {
				var8 = field603.method426(arg2, arg6, arg1);
			}

			if (arg5 == 2) {
				var8 = field603.method427(arg2, arg1, arg6);
			}

			if (arg5 == 3) {
				var8 = field603.method428(arg2, arg1, arg6);
			}

			if (var8 != 0) {
				int var12 = field603.method429(arg2, arg1, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field603.method416(arg1, arg2, arg6);
					FUIMNWOZ var16 = FUIMNWOZ.method246(var13);
					if (var16.field780) {
						field299[arg2].method32(arg1, var14, arg6, var15, var16.field779);
					}
				}

				if (arg5 == 1) {
					field603.method417(arg2, arg1, arg6);
				}

				if (arg5 == 2) {
					field603.method418(arg1, arg2, arg6);
					FUIMNWOZ var17 = FUIMNWOZ.method246(var13);
					if (var17.field814 + arg1 > 103 || var17.field814 + arg6 > 103 || var17.field804 + arg1 > 103 || var17.field804 + arg6 > 103) {
						return;
					}

					if (var17.field780) {
						field299[arg2].method33(var17.field779, var15, var17.field814, arg1, var17.field804, arg6);
					}
				}

				if (arg5 == 3) {
					field603.method419(arg2, arg1, arg6);
					FUIMNWOZ var18 = FUIMNWOZ.method246(var13);
					if (var18.field780 && var18.field807) {
						field299[arg2].method35(arg6, arg1);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field296[1][arg1][arg6] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				GQBPDNOP.method257(var19, arg4, arg6, arg3, field299[arg2], arg2, arg1, arg0, field603, field259);
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field74 != null) {
				return new URL("http://127.0.0.1:" + (field367 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.k(I)V")
	public final void method71() {
		if (field591 == 2) {
			for (BIWICTTN var1 = (BIWICTTN) field346.method340(); var1 != null; var1 = (BIWICTTN) field346.method342()) {
				if (var1.field129 > 0) {
					var1.field129--;
				}

				if (var1.field129 != 0) {
					if (var1.field130 > 0) {
						var1.field130--;
					}

					if (var1.field130 == 0 && var1.field133 >= 1 && var1.field134 >= 1 && var1.field133 <= 102 && var1.field134 <= 102 && (var1.field135 < 0 || GQBPDNOP.method254(var1.field135, var1.field137))) {
						method70(var1.field136, var1.field133, var1.field131, var1.field135, var1.field137, var1.field132, var1.field134);
						var1.field130 = -1;

						if (var1.field135 == var1.field126 && var1.field126 == -1) {
							var1.method41();
						} else if (var1.field135 == var1.field126 && var1.field136 == var1.field127 && var1.field137 == var1.field128) {
							var1.method41();
						}
					}
				} else if (var1.field126 < 0 || GQBPDNOP.method254(var1.field126, var1.field128)) {
					method70(var1.field127, var1.field133, var1.field131, var1.field126, var1.field128, var1.field132, var1.field134);
					var1.method41();
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method72() {
		QPWZYOZR.field1246 = false;
		PIHSODZS.field1185 = false;
		field369 = false;
		GQBPDNOP.field822 = false;
		FUIMNWOZ.field810 = false;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method73(int arg0) {
		MRUJPFPS.method332(arg0);
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method74(int arg0) {
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

	public final void run() {
		if (field260) {
			method135();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIBLjava/lang/String;ILjava/lang/String;)LLKPVZAQN;")
	public final LKPVZAQN method75(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field615[0] != null) {
				var6 = field615[0].method300(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field280.reset();
			field280.update(var6);
			int var8 = (int) field280.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new LKPVZAQN(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method26(arg3, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method116(arg4 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				WBEWPIXO var16 = new WBEWPIXO(var15);
				var16.field1401 = 3;
				int var17 = var16.method519() + 6;
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
						method26(arg3, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field615[0] != null) {
						field615[0].method301(arg1, var6.length, var6);
					}
				} catch (Exception var28) {
					field615[0] = null;
				}

				if (var6 != null) {
					field280.reset();
					field280.update(var6);
					int var23 = (int) field280.getValue();
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
						method26(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method26(arg3, var11 + " - Retrying in " + var25);
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

				field313 = !field313;
			}
		}

		return new LKPVZAQN(var6);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method76() {
		if (field85 == 1) {
			if (field86 >= 539 && field86 <= 573 && field87 >= 169 && field87 < 205 && field491[0] != -1) {
				field314 = true;
				field261 = 0;
				field302 = true;
			}

			if (field86 >= 569 && field86 <= 599 && field87 >= 168 && field87 < 205 && field491[1] != -1) {
				field314 = true;
				field261 = 1;
				field302 = true;
			}

			if (field86 >= 597 && field86 <= 627 && field87 >= 168 && field87 < 205 && field491[2] != -1) {
				field314 = true;
				field261 = 2;
				field302 = true;
			}

			if (field86 >= 625 && field86 <= 669 && field87 >= 168 && field87 < 203 && field491[3] != -1) {
				field314 = true;
				field261 = 3;
				field302 = true;
			}

			if (field86 >= 666 && field86 <= 696 && field87 >= 168 && field87 < 205 && field491[4] != -1) {
				field314 = true;
				field261 = 4;
				field302 = true;
			}

			if (field86 >= 694 && field86 <= 724 && field87 >= 168 && field87 < 205 && field491[5] != -1) {
				field314 = true;
				field261 = 5;
				field302 = true;
			}

			if (field86 >= 722 && field86 <= 756 && field87 >= 169 && field87 < 205 && field491[6] != -1) {
				field314 = true;
				field261 = 6;
				field302 = true;
			}

			if (field86 >= 540 && field86 <= 574 && field87 >= 466 && field87 < 502 && field491[7] != -1) {
				field314 = true;
				field261 = 7;
				field302 = true;
			}

			if (field86 >= 572 && field86 <= 602 && field87 >= 466 && field87 < 503 && field491[8] != -1) {
				field314 = true;
				field261 = 8;
				field302 = true;
			}

			if (field86 >= 599 && field86 <= 629 && field87 >= 466 && field87 < 503 && field491[9] != -1) {
				field314 = true;
				field261 = 9;
				field302 = true;
			}

			if (field86 >= 627 && field86 <= 671 && field87 >= 467 && field87 < 502 && field491[10] != -1) {
				field314 = true;
				field261 = 10;
				field302 = true;
			}

			if (field86 >= 669 && field86 <= 699 && field87 >= 466 && field87 < 503 && field491[11] != -1) {
				field314 = true;
				field261 = 11;
				field302 = true;
			}

			if (field86 >= 696 && field86 <= 726 && field87 >= 466 && field87 < 503 && field491[12] != -1) {
				field314 = true;
				field261 = 12;
				field302 = true;
			}

			if (field86 >= 724 && field86 <= 758 && field87 >= 466 && field87 < 502 && field491[13] != -1) {
				field314 = true;
				field261 = 13;
				field302 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method77() {
		FUIMNWOZ.field772.method336();
		FUIMNWOZ.field809.method336();
		PJGEBWSY.field1216.method336();
		AAHIRSBF.field15.method336();
		AAHIRSBF.field18.method336();
		SRMWIYVM.field1355.method336();
		XBHNZKGU.field1447.method336();
	}

	@ObfuscatedName("client.d(II)V")
	public final void method78(int arg0) {
		int[] var2 = field461.field1133;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field296[arg0][var7][var5] & 0x18) == 0) {
					field603.method434(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field296[arg0 + 1][var7][var5] & 0x8) != 0) {
					field603.method434(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field461.method351();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field296[arg0][var11][var10] & 0x18) == 0) {
					method98(var8, var9, arg0, var10, var11);
				}

				if (arg0 < 3 && (field296[arg0 + 1][var11][var10] & 0x8) != 0) {
					method98(var8, var9, arg0 + 1, var10, var11);
				}
			}
		}

		if (field504 != null) {
			field504.method273();
			PIHSODZS.field1196 = field328;
		}

		field323 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field603.method428(field592, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = FUIMNWOZ.method246(var14).field790;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field299[field592].field120;
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

						field332[field323] = field350[var15];
						field324[field323] = var16;
						field325[field323] = var17;
						field323++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILOGPNACTP;II)V")
	public final void method79(int arg0, OGPNACTP arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field525 + field274 & 0x7FF;
			int var6 = FCIDIKVY.field747[var5];
			int var7 = FCIDIKVY.field748[var5];
			var6 = var6 * 256 / (field542 + 256);
			var7 = var7 * 256 / (field542 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field641.method361(15, var12 + 94 + 4 - 10, var10, 20, 15, 20, 83 - var13 - 20, 256);
		} else {
			method55(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method80() {
		if (field528 == null) {
			field72 = null;
			field505 = null;
			field503 = null;
			field502 = null;
			field504 = null;
			field391 = null;
			field392 = null;
			field393 = null;
			field531 = new HGHKUVEK(method24(), 128, 265);
			KPYGFVMA.method313();
			field532 = new HGHKUVEK(method24(), 128, 265);
			KPYGFVMA.method313();
			field528 = new HGHKUVEK(method24(), 509, 171);
			KPYGFVMA.method313();
			field529 = new HGHKUVEK(method24(), 360, 132);
			KPYGFVMA.method313();
			field530 = new HGHKUVEK(method24(), 360, 200);
			KPYGFVMA.method313();
			field533 = new HGHKUVEK(method24(), 202, 238);
			KPYGFVMA.method313();
			field534 = new HGHKUVEK(method24(), 203, 238);
			KPYGFVMA.method313();
			field535 = new HGHKUVEK(method24(), 74, 94);
			KPYGFVMA.method313();
			field536 = new HGHKUVEK(method24(), 75, 94);
			KPYGFVMA.method313();

			if (field539 != null) {
				method119();
				method152();
			}

			field624 = true;
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method81(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method82(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method83() {
		if (field369 && field591 == 2 && GQBPDNOP.field842 != field592) {
			method171(null, "Loading - please wait.");
			field591 = 1;
			field586 = System.currentTimeMillis();
		}

		if (field591 == 1) {
			int var1 = method84();
			if (var1 != 0 && System.currentTimeMillis() - field586 > 360000L) {
				signlink.reporterror(field519 + " glcfb " + field291 + "," + var1 + "," + field369 + "," + field615[0] + "," + field633.method291() + "," + field592 + "," + field204 + "," + field205);
				field586 = System.currentTimeMillis();
			}
		}

		if (field591 == 2 && field592 != field198) {
			field198 = field592;
			method78(field592);
		}
	}

	@ObfuscatedName("client.c(Z)I")
	public final int method84() {
		for (int var1 = 0; var1 < field269.length; var1++) {
			if (field269[var1] == null && field357[var1] != -1) {
				return -1;
			}

			if (field424[var1] == null && field358[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field269.length; var3++) {
			byte[] var4 = field424[var3];
			if (var4 != null) {
				int var5 = (field356[var3] >> 8) * 64 - field487;
				int var6 = (field356[var3] & 0xFF) * 64 - field488;
				if (field230) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= GQBPDNOP.method252(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field212) {
			return -4;
		} else {
			field591 = 2;
			GQBPDNOP.field842 = field592;
			method100();
			field210.method504(115);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIBLMRUJPFPS;I)V")
	public final void method85(int arg0, int arg1, MRUJPFPS arg2, int arg3) {
		if (arg2.field1025 == 0 && arg2.field1032 != null && (!arg2.field1020 || field199 == arg2.field1040 || field497 == arg2.field1040 || field588 == arg2.field1040)) {
			int var5 = KPYGFVMA.field973;
			int var6 = KPYGFVMA.field971;
			int var7 = KPYGFVMA.field974;
			int var8 = KPYGFVMA.field972;
			KPYGFVMA.method312(arg0, arg2.field1009 + arg0, arg2.field989 + arg3, arg3);
			int var9 = arg2.field1032.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1012[var10] + arg3;
				int var12 = arg2.field1031[var10] + arg0 - arg1;
				MRUJPFPS var13 = MRUJPFPS.method324(arg2.field1032[var10]);
				var11 += var13.field1045;
				var12 += var13.field1034;

				if (var13.field987 > 0) {
					method58(var13);
				}

				if (var13.field1025 == 0) {
					if (var13.field990 > var13.field1051 - var13.field1009) {
						var13.field990 = var13.field1051 - var13.field1009;
					}

					if (var13.field990 < 0) {
						var13.field990 = 0;
					}

					method85(var12, var13.field990, var13, var11);

					if (var13.field1051 > var13.field1009) {
						method139(var13.field1051, var13.field990, var12, var13.field989 + var11, var13.field1009);
					}
				} else if (var13.field1025 != 1) {
					if (var13.field1025 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1009; var15++) {
							for (int var16 = 0; var16 < var13.field989; var16++) {
								int var17 = (var13.field1033 + 32) * var16 + var11;
								int var18 = (var13.field1015 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1057[var14];
									var18 += var13.field1050[var14];
								}

								if (var13.field991[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field991[var14] - 1;
									if (var17 > KPYGFVMA.field973 - 32 && var17 < KPYGFVMA.field974 && var18 > KPYGFVMA.field971 - 32 && var18 < KPYGFVMA.field972 || field484 != 0 && field483 == var14) {
										int var22 = 0;
										if (field316 == 1 && field317 == var14 && field318 == var13.field1040) {
											var22 = 0xFFFFFF;
										}

										OGPNACTP var23 = AAHIRSBF.method4(var22, var21, var13.field1006[var14]);
										if (var23 != null) {
											if (field484 != 0 && field483 == var14 && field482 == var13.field1040) {
												var19 = field79 - field485;
												var20 = field80 - field486;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field293 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method358(128, var18 + var20, var17 + var19);

												if (var18 + var20 < KPYGFVMA.field971 && arg2.field990 > 0) {
													int var24 = (KPYGFVMA.field971 - var18 - var20) * field498 / 3;
													if (var24 > field498 * 10) {
														var24 = field498 * 10;
													}

													if (var24 > arg2.field990) {
														var24 = arg2.field990;
													}

													arg2.field990 -= var24;
													field486 += var24;
												}

												if (var18 + var20 + 32 > KPYGFVMA.field972 && arg2.field990 < arg2.field1051 - arg2.field1009) {
													int var25 = (var18 + var20 + 32 - KPYGFVMA.field972) * field498 / 3;
													if (var25 > field498 * 10) {
														var25 = field498 * 10;
													}

													if (var25 > arg2.field1051 - arg2.field1009 - arg2.field990) {
														var25 = arg2.field1051 - arg2.field1009 - arg2.field990;
													}

													arg2.field990 += var25;
													field486 -= var25;
												}
											} else if (field422 != 0 && field421 == var14 && field420 == var13.field1040) {
												var23.method358(128, var18, var17);
											} else {
												var23.method356(var17, var18);
											}

											if (var23.field1138 == 33 || var13.field1006[var14] != 1) {
												int var26 = var13.field1006[var14];
												field414.method593(0, var18 + var20 + 10, method67(var26), var17 + var19 + 1);
												field414.method593(0xFFFF00, var18 + var20 + 9, method67(var26), var17 + var19);
											}
										}
									}
								} else if (var13.field1022 != null && var14 < 20) {
									OGPNACTP var27 = var13.field1022[var14];
									if (var27 != null) {
										var27.method356(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1025 == 3) {
						boolean var28 = false;
						if (field588 == var13.field1040 || field497 == var13.field1040 || field199 == var13.field1040) {
							var28 = true;
						}

						int var29;
						if (method161(var13)) {
							var29 = var13.field1003;
							if (var28 && var13.field1055 != 0) {
								var29 = var13.field1055;
							}
						} else {
							var29 = var13.field1018;
							if (var28 && var13.field1046 != 0) {
								var29 = var13.field1046;
							}
						}

						if (var13.field1028 == 0) {
							if (var13.field1023) {
								KPYGFVMA.method315(var29, var11, var12, var13.field1009, var13.field989);
							} else {
								KPYGFVMA.method316(var13.field989, var12, var13.field1009, var11, var29);
							}
						} else if (var13.field1023) {
							KPYGFVMA.method314(var29, var11, 256 - (var13.field1028 & 0xFF), var13.field989, var13.field1009, var12);
						} else {
							KPYGFVMA.method317(var13.field1009, var13.field989, var29, 256 - (var13.field1028 & 0xFF), var11, var12);
						}
					} else if (var13.field1025 == 4) {
						YCYYIGLM var30 = var13.field1029;
						String var31 = var13.field997;
						boolean var32 = false;
						if (field588 == var13.field1040 || field497 == var13.field1040 || field199 == var13.field1040) {
							var32 = true;
						}

						int var33;
						if (method161(var13)) {
							var33 = var13.field1003;
							if (var32 && var13.field1055 != 0) {
								var33 = var13.field1055;
							}

							if (var13.field1037.length() > 0) {
								var31 = var13.field1037;
							}
						} else {
							var33 = var13.field1018;
							if (var32 && var13.field1046 != 0) {
								var33 = var13.field1046;
							}
						}

						if (var13.field1048 == 6 && field478) {
							var31 = "Please wait...";
							var33 = var13.field1018;
						}

						if (KPYGFVMA.field969 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1515 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method81(method164(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method81(method164(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method81(method164(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method81(method164(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method81(method164(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1001) {
								var30.method590(var33, var13.field1021, var41, var13.field989 / 2 + var11, var34);
							} else {
								var30.method597(var13.field1021, var41, var11, var33, var34);
							}

							var34 += var30.field1515;
						}
					} else if (var13.field1025 == 5) {
						OGPNACTP var42;
						if (method161(var13)) {
							var42 = var13.field1049;
						} else {
							var42 = var13.field1041;
						}

						if (var42 != null) {
							var42.method356(var11, var12);
						}
					} else if (var13.field1025 == 6) {
						int var43 = PIHSODZS.field1190;
						int var44 = PIHSODZS.field1191;
						PIHSODZS.field1190 = var13.field989 / 2 + var11;
						PIHSODZS.field1191 = var13.field1009 / 2 + var12;
						int var45 = PIHSODZS.field1194[var13.field999] * var13.field998 >> 16;
						int var46 = PIHSODZS.field1195[var13.field999] * var13.field998 >> 16;
						boolean var47 = method161(var13);
						int var48;
						if (var47) {
							var48 = var13.field1039;
						} else {
							var48 = var13.field1038;
						}

						FCIDIKVY var49;
						if (var48 == -1) {
							var49 = var13.method326(var47, -1, -1);
						} else {
							XETSOHUA var50 = XETSOHUA.field1474[var48];
							var49 = var13.method326(var47, var50.field1476[var13.field1056], var50.field1477[var13.field1056]);
						}

						if (var49 != null) {
							var49.method220(0, var13.field1000, 0, var13.field999, 0, var45, var46);
						}

						PIHSODZS.field1190 = var43;
						PIHSODZS.field1191 = var44;
					} else {
						if (var13.field1025 == 7) {
							YCYYIGLM var51 = var13.field1029;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1009; var53++) {
								for (int var54 = 0; var54 < var13.field989; var54++) {
									if (var13.field991[var52] > 0) {
										AAHIRSBF var55 = AAHIRSBF.method7(var13.field991[var52] - 1);
										String var56 = String.valueOf(var55.field19);
										if (var55.field3 || var13.field1006[var52] != 1) {
											var56 = var56 + " x" + method74(var13.field1006[var52]);
										}

										int var57 = (var13.field1033 + 115) * var54 + var11;
										int var58 = (var13.field1015 + 12) * var53 + var12;
										if (var13.field1001) {
											var51.method590(var13.field1018, var13.field1021, var56, var13.field989 / 2 + var57, var58);
										} else {
											var51.method597(var13.field1021, var56, var57, var13.field1018, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1025 == 8 && (field232 == var13.field1040 || field295 == var13.field1040 || field445 == var13.field1040) && field544 == 100) {
							int var59 = 0;
							int var60 = 0;
							YCYYIGLM var61 = field415;
							String var62 = var13.field997;
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

								int var65 = var61.method591(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1515 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field989 + var11 - var59 - 5;
							int var67 = var13.field1009 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field989 + arg3) {
								var66 = arg2.field989 + arg3 - var59;
							}

							if (var60 + var67 > arg2.field1009 + arg0) {
								var67 = arg2.field1009 + arg0 - var60;
							}

							KPYGFVMA.method315(0xFFFFA0, var66, var67, var60, var59);
							KPYGFVMA.method316(var59, var67, var60, var66, 0);
							String var68 = var13.field997;
							int var69 = var61.field1515 + var67 + 2;
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

								var61.method597(false, var71, var66 + 3, 0, var69);
								var69 += var61.field1515 + 1;
							}
						}
					}
				}
			}

			KPYGFVMA.method312(var6, var8, var7, var5);
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method86() {
		for (CMOSDPGZ var1 = (CMOSDPGZ) field441.method340(); var1 != null; var1 = (CMOSDPGZ) field441.method342()) {
			if (field592 != var1.field646 || var1.field642) {
				var1.method41();
			} else if (field552 >= var1.field650) {
				var1.method186(field498);

				if (var1.field642) {
					var1.method41();
				} else {
					field603.method410(var1.field646, -1, 60, var1, var1.field648, var1.field647, 0, var1.field649, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)V")
	public final void method87(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field246 = 0;
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

			field246 = 0;
			label46: for (int var7 = 0; var7 < AAHIRSBF.field16; var7++) {
				AAHIRSBF var8 = AAHIRSBF.method7(var7);
				if (var8.field31 == -1 && var8.field19 != null) {
					String var9 = var8.field19.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field247[field246] = var9;
					field248[field246] = var7;
					field246++;
					if (field246 >= field247.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method88(boolean arg0, byte[] arg1) {
		if (field334) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method89() {
		for (int var1 = -1; var1 < field431; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field429;
			} else {
				var2 = field432[var1];
			}

			SRMWIYVM var3 = field430[var2];
			if (var3 != null) {
				method124(var3, 1);
			}
		}

		field587++;
		if (field587 > 1721) {
			field587 = 0;
			field210.method504(165);
			field210.method505(0);
			int var4 = field210.field1401;
			field210.method505(224);

			if ((int) (Math.random() * 2.0D) == 0) {
				field210.method505(216);
			}

			field210.method505(6);

			if ((int) (Math.random() * 2.0D) == 0) {
				field210.method505(255);
			}

			field210.method506((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field210.method506(11572);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field210.method506(24447);
			}

			field210.method505(42);
			field210.method505((int) (Math.random() * 256.0D));
			field210.method506((int) (Math.random() * 65536.0D));
			field210.method514(field210.field1401 - var4);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method90() {
		method131();

		if (field570 == 1) {
			field290[field569 / 100].method356(field567 - 8 - 4, field568 - 8 - 4);
		}

		if (field570 == 2) {
			field290[field569 / 100 + 4].method356(field567 - 8 - 4, field568 - 8 - 4);
		}

		if (field284 != -1) {
			method57(field498, field284);
			method85(0, 0, MRUJPFPS.method324(field284), 0);
		}

		if (field602 != -1) {
			method57(field498, field602);
			method85(0, 0, MRUJPFPS.method324(field602), 0);
		}

		method95();

		if (!field348) {
			method122();
			method166();
		} else if (field402 == 0) {
			method105();
		}

		if (field351 == 1) {
			field289.method356(472, 296);
		}

		if (field438) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field67 < 30 && field369) {
				var3 = 0xFF0000;
			}

			if (field67 < 20 && !field369) {
				var3 = 0xFF0000;
			}

			field415.method588(var3, var1, "Fps:" + field67, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field369) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field369) {
				int var8 = 0xFF0000;
			}

			field415.method588(0xFFFF00, var1, "Mem:" + var5 + "k", var2);
			var2 += 15;
		}

		if (field349 != 0) {
			int var9 = field349 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field415.method593(0xFFFF00, 329, "System update in: " + var10 + ":0" + var9, 4);
			} else {
				field415.method593(0xFFFF00, 329, "System update in: " + var10 + ":" + var9, 4);
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method91() {
		int var1 = field512 * 128 + 64;
		int var2 = field513 * 128 + 64;
		int var3 = method154(field592, var1, var2) - field514;

		if (field572 < var1) {
			field572 += (var1 - field572) * field516 / 1000 + field515;
			if (field572 > var1) {
				field572 = var1;
			}
		}

		if (field572 > var1) {
			field572 -= (field572 - var1) * field516 / 1000 + field515;
			if (field572 < var1) {
				field572 = var1;
			}
		}

		if (field573 < var3) {
			field573 += (var3 - field573) * field516 / 1000 + field515;
			if (field573 > var3) {
				field573 = var3;
			}
		}

		if (field573 > var3) {
			field573 -= (field573 - var3) * field516 / 1000 + field515;
			if (field573 < var3) {
				field573 = var3;
			}
		}

		if (field574 < var2) {
			field574 += (var2 - field574) * field516 / 1000 + field515;
			if (field574 > var2) {
				field574 = var2;
			}
		}

		if (field574 > var2) {
			field574 -= (field574 - var2) * field516 / 1000 + field515;
			if (field574 < var2) {
				field574 = var2;
			}
		}

		int var4 = field213 * 128 + 64;
		int var5 = field214 * 128 + 64;
		int var6 = method154(field592, var4, var5) - field215;
		int var7 = var4 - field572;
		int var8 = var6 - field573;
		int var9 = var5 - field574;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field575 < var11) {
			field575 += (var11 - field575) * field217 / 1000 + field216;
			if (field575 > var11) {
				field575 = var11;
			}
		}

		if (field575 > var11) {
			field575 -= (field575 - var11) * field217 / 1000 + field216;
			if (field575 < var11) {
				field575 = var11;
			}
		}

		int var13 = var12 - field576;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field576 += field217 * var13 / 1000 + field216;
			field576 &= 0x7FF;
		}

		if (var13 < 0) {
			field576 -= -var13 * field217 / 1000 + field216;
			field576 &= 0x7FF;
		}

		int var14 = var12 - field576;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field576 = var12;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method92(long arg0) {
		if (arg0 != 0L) {
			if (field554 >= 100 && field407 != 1) {
				method175(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field554 >= 200) {
				method175(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = XLAXYQGJ.method582(XLAXYQGJ.method579(arg0));
				for (int var4 = 0; var4 < field554; var4++) {
					if (field200[var4] == arg0) {
						method175(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field277; var5++) {
					if (field343[var5] == arg0) {
						method175(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field338.field1371)) {
					field347[field554] = var3;
					field200[field554] = arg0;
					field233[field554] = 0;
					field554++;
					field314 = true;
					field210.method504(186);
					field210.method511(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method93(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field277; var3++) {
				if (field343[var3] == arg0) {
					field277--;
					field314 = true;

					for (int var4 = var3; var4 < field277; var4++) {
						field343[var4] = field343[var4 + 1];
					}

					field210.method504(17);
					field210.method511(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLWBEWPIXO;)V")
	public final void method94(int arg0, WBEWPIXO arg1) {
		field457 = 0;
		field433 = 0;
		method182(arg0, arg1);
		method48(arg0, arg1);
		method183(arg0, arg1);

		for (int var3 = 0; var3 < field457; var3++) {
			int var4 = field458[var3];
			if (field552 != field360[var4].field164) {
				field360[var4].field1245 = null;
				field360[var4] = null;
			}
		}

		if (arg1.field1401 != arg0) {
			signlink.reporterror(field519 + " size mismatch in getnpcpos - pos:" + arg1.field1401 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field361; var5++) {
			if (field360[field362[var5]] == null) {
				signlink.reporterror(field519 + " null entry in npc list - pos:" + var5 + " size:" + field361);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method95() {
		field566 = 0;
		int var1 = (field338.field191 >> 7) + field487;
		int var2 = (field338.field192 >> 7) + field488;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field566 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field566 = 1;
		}

		if (field566 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field566 = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method96() {
		if (field237 == 0) {
			int var1 = field69 / 2 - 80;
			int var2 = field70 / 2 + 20;
			var2 += 20;
			if (field85 == 1 && field86 >= var1 - 75 && field86 <= var1 + 75 && field87 >= var2 - 20 && field87 <= var2 + 20) {
				field237 = 3;
				field365 = 0;
			}

			int var3 = field69 / 2 + 80;
			if (field85 == 1 && field86 >= var3 - 75 && field86 <= var3 + 75 && field87 >= var2 - 20 && field87 <= var2 + 20) {
				field389 = "";
				field390 = "Enter your username & password.";
				field237 = 2;
				field365 = 0;
			}
		} else if (field237 == 2) {
			int var4 = field70 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field85 == 1 && field87 >= var4 - 15 && field87 < var4) {
				field365 = 0;
			}

			var4 += 15;
			if (field85 == 1 && field87 >= var4 - 15 && field87 < var4) {
				field365 = 1;
			}

			var4 += 15;
			int var5 = field69 / 2 - 80;
			int var6 = field70 / 2 + 50;
			var6 += 20;
			if (field85 == 1 && field86 >= var5 - 75 && field86 <= var5 + 75 && field87 >= var6 - 20 && field87 <= var6 + 20) {
				field211 = 0;
				method108(field519, field520, false);

				if (field613) {
					return;
				}
			}

			int var7 = field69 / 2 + 80;
			if (field85 == 1 && field86 >= var7 - 75 && field86 <= var7 + 75 && field87 >= var6 - 20 && field87 <= var6 + 20) {
				field237 = 0;
				field519 = "";
				field520 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method18();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field271.length(); var10++) {
					if (var8 == field271.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field365 == 0) {
					if (var8 == 8 && field519.length() > 0) {
						field519 = field519.substring(0, field519.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field365 = 1;
					}

					if (var9) {
						field519 = field519 + (char) var8;
					}

					if (field519.length() > 12) {
						field519 = field519.substring(0, 12);
					}
				} else if (field365 == 1) {
					if (var8 == 8 && field520.length() > 0) {
						field520 = field520.substring(0, field520.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field365 = 0;
					}

					if (var9) {
						field520 = field520 + (char) var8;
					}

					if (field520.length() > 20) {
						field520 = field520.substring(0, 20);
					}
				}
			}
		} else if (field237 == 3) {
			int var11 = field69 / 2;
			int var12 = field70 / 2 + 50;
			var12 += 20;
			if (field85 == 1 && field86 >= var11 - 75 && field86 <= var11 + 75 && field87 >= var12 - 20 && field87 <= var12 + 20) {
				field237 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(LMRUJPFPS;Z)Z")
	public final boolean method97(MRUJPFPS arg0) {
		int var2 = arg0.field987;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field276[field627] = "Remove @whi@" + arg0.field997;
				field267[field627] = 34;
				field627++;
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

		field276[field627] = "Remove @whi@" + field347[var2];
		field267[field627] = 169;
		field627++;
		field276[field627] = "Message @whi@" + field347[var2];
		field267[field627] = 956;
		field627++;
		return true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field603.method425(arg2, arg4, arg3);
		if (var6 != 0) {
			int var7 = field603.method429(arg2, arg4, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field461.field1133;
			int var12 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			FUIMNWOZ var14 = FUIMNWOZ.method246(var13);
			if (var14.field792 == -1) {
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
				OSRLSEOB var15 = field549[var14.field792];
				if (var15 != null) {
					int var16 = (var14.field814 * 4 - var15.field1142) / 2;
					int var17 = (var14.field804 * 4 - var15.field1143) / 2;
					var15.method369(arg4 * 4 + var16 + 48, (104 - arg3 - var14.field804) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field603.method427(arg2, arg4, arg3);
		if (var18 != 0) {
			int var19 = field603.method429(arg2, arg4, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			FUIMNWOZ var23 = FUIMNWOZ.method246(var22);
			if (var23.field792 != -1) {
				OSRLSEOB var24 = field549[var23.field792];
				if (var24 != null) {
					int var25 = (var23.field814 * 4 - var24.field1142) / 2;
					int var26 = (var23.field804 * 4 - var24.field1143) / 2;
					var24.method369(arg4 * 4 + var25 + 48, (104 - arg3 - var23.field804) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field461.field1133;
				int var29 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field603.method428(arg2, arg4, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			FUIMNWOZ var32 = FUIMNWOZ.method246(var31);
			if (var32.field792 != -1) {
				OSRLSEOB var33 = field549[var32.field792];
				if (var33 != null) {
					int var34 = (var32.field814 * 4 - var33.field1142) / 2;
					int var35 = (var32.field804 * 4 - var33.field1143) / 2;
					var33.method369(arg4 * 4 + var34 + 48, (104 - arg3 - var32.field804) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILMRUJPFPS;IIIII)V")
	public final void method99(int arg0, int arg1, MRUJPFPS arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field371) {
			field523 = 32;
		} else {
			field523 = 0;
		}

		field371 = false;
		if (arg3 >= arg1 && arg3 < arg1 + 16 && arg4 >= arg5 && arg4 < arg5 + 16) {
			arg2.field990 -= field546 * 4;

			if (arg7 == 1) {
				field314 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field578 = true;
			}
		} else if (arg3 >= arg1 && arg3 < arg1 + 16 && arg4 >= arg0 + arg5 - 16 && arg4 < arg0 + arg5) {
			arg2.field990 += field546 * 4;

			if (arg7 == 1) {
				field314 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field578 = true;
			}
		} else if (arg3 >= arg1 - field523 && arg3 < arg1 + field523 + 16 && arg4 >= arg5 + 16 && arg4 < arg0 + arg5 - 16 && field546 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg5 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg2.field990 = (arg6 - arg0) * var10 / var11;

			if (arg7 == 1) {
				field314 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field578 = true;
			}

			field371 = true;
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method100() {
		try {
			field198 = -1;
			field441.method344();
			field547.method344();
			PIHSODZS.method375();
			method77();
			field603.method399();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field299[var1].method27();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field296[var2][var3][var4] = 0;
					}
				}
			}

			GQBPDNOP var5 = new GQBPDNOP(104, field296, 104, field259);
			int var6 = field269.length;
			field210.method504(44);

			if (!field230) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field356[var7] >> 8) * 64 - field487;
					int var9 = (field356[var7] & 0xFF) * 64 - field488;
					byte[] var10 = field269[var7];
					if (var10 != null) {
						var5.method266(var9, (field205 - 6) * 8, var8, field299, var10, (field204 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field356[var11] >> 8) * 64 - field487;
					int var13 = (field356[var11] & 0xFF) * 64 - field488;
					byte[] var14 = field269[var11];
					if (var14 == null && field205 < 800) {
						var5.method264(64, var13, var12, 64);
					}
				}

				field210.method504(44);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field424[var15];
					if (var16 != null) {
						int var17 = (field356[var15] >> 8) * 64 - field487;
						int var18 = (field356[var15] & 0xFF) * 64 - field488;
						var5.method267(field603, var18, field299, var17, var16);
					}
				}
			}

			if (field230) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field208[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field356.length; var29++) {
									if (field356[var29] == var28 && field269[var29] != null) {
										var5.method268(var24, (var27 & 0x7) * 8, (var26 & 0x7) * 8, var19, var20 * 8, var25, field269[var29], var21 * 8, field299);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method265(var21 * 8, var20 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field208[0][var30][var31];
						if (var32 == -1) {
							var5.method264(8, var31 * 8, var30 * 8, 8);
						}
					}
				}

				field210.method504(44);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field208[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field356.length; var42++) {
									if (field356[var42] == var41 && field424[var42] != null) {
										var5.method248(var38, (var39 & 0x7) * 8, var35 * 8, var33, field299, var34 * 8, (var40 & 0x7) * 8, field424[var42], var37, field603);
										break;
									}
								}
							}
						}
					}
				}
			}

			field210.method504(44);
			var5.method263(field299, field603);

			if (field504 != null) {
				field504.method273();
				PIHSODZS.field1196 = field328;
			}

			field210.method504(44);
			int var43 = GQBPDNOP.field838;
			if (var43 > field592) {
				var43 = field592;
			}

			if (var43 < field592 - 1) {
				int var44 = field592 - 1;
			}

			if (field369) {
				field603.method400(GQBPDNOP.field838);
			} else {
				field603.method400(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method112(var45, var46);
				}
			}

			method172();
		} catch (Exception var59) {
		}

		FUIMNWOZ.field772.method336();

		if (field74 != null) {
			field210.method504(56);
			field210.method509(1057001181);
		}

		if (field369 && signlink.cache_dat != null) {
			int var48 = field633.method293(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field633.method287(var49);
				if ((var50 & 0x79) == 0) {
					FCIDIKVY.method198(var49);
				}
			}
		}

		System.gc();
		PIHSODZS.method376(20);
		field633.method285();
		int var51 = (field204 - 6) / 8 - 1;
		int var52 = (field204 + 6) / 8 + 1;
		int var53 = (field205 - 6) / 8 - 1;
		int var54 = (field205 + 6) / 8 + 1;
		if (field270) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field633.method277(var55, var56, 0);
					if (var57 != -1) {
						field633.method280(3, var57);
					}

					int var58 = field633.method277(var55, var56, 1);
					if (var58 != -1) {
						field633.method280(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIIIIIIII)Z")
	public final boolean method101(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field382[var14][var15] = 0;
				field335[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg4;
		field382[arg7][arg4] = 99;
		field335[arg7][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field634[var18] = arg7;
		int var39 = var18 + 1;
		field635[var18] = arg4;
		boolean var20 = false;
		int var21 = field634.length;
		int[][] var22 = field299[field592].field120;
		while (var39 != var19) {
			var16 = field634[var19];
			var17 = field635[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field299[field592].method36(arg5, arg8, arg0 - 1, var16, var17, arg3)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field299[field592].method37(arg3, arg0 - 1, var16, arg5, arg8, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg2 != 0 && field299[field592].method38(arg10, var17, arg5, arg2, arg9, var16, arg8)) {
				var20 = true;
				break;
			}

			int var23 = field335[var16][var17] + 1;
			if (var16 > 0 && field382[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field634[var39] = var16 - 1;
				field635[var39] = var17;
				var39 = (var39 + 1) % var21;
				field382[var16 - 1][var17] = 2;
				field335[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field382[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field634[var39] = var16 + 1;
				field635[var39] = var17;
				var39 = (var39 + 1) % var21;
				field382[var16 + 1][var17] = 8;
				field335[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field382[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field634[var39] = var16;
				field635[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field382[var16][var17 - 1] = 1;
				field335[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field382[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field634[var39] = var16;
				field635[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field382[var16][var17 + 1] = 4;
				field335[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field382[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field634[var39] = var16 - 1;
				field635[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field382[var16 - 1][var17 - 1] = 3;
				field335[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field382[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field634[var39] = var16 + 1;
				field635[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field382[var16 + 1][var17 - 1] = 9;
				field335[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field382[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field634[var39] = var16 - 1;
				field635[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field382[var16 - 1][var17 + 1] = 6;
				field335[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field382[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field634[var39] = var16 + 1;
				field635[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field382[var16 + 1][var17 + 1] = 12;
				field335[var16 + 1][var17 + 1] = var23;
			}
		}

		field609 = 0;
		if (!var20) {
			if (!arg1) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg5 - var26; var27 <= arg5 + var26; var27++) {
				for (int var28 = arg8 - var26; var28 <= arg8 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field335[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg5) {
							var29 = arg5 - var27;
						} else if (var27 > arg5 + arg9 - 1) {
							var29 = var27 + 1 - arg5 - arg9;
						}

						int var30 = 0;
						if (var28 < arg8) {
							var30 = arg8 - var28;
						} else if (var28 > arg2 + arg8 - 1) {
							var30 = var28 + 1 - arg2 - arg8;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field335[var27][var28] < var25) {
							var24 = var31;
							var25 = field335[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg7 == var16 && arg4 == var17) {
				return false;
			}

			field609 = 1;
		}

		byte var32 = 0;
		field634[var32] = var16;
		int var40 = var32 + 1;
		field635[var32] = var17;
		int var33;
		int var34 = var33 = field382[var16][var17];
		while (arg7 != var16 || arg4 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field634[var40] = var16;
				field635[var40++] = var17;
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

			var34 = field382[var16][var17];
		}

		if (var40 <= 0) {
			if (arg6 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field634[var40];
		int var37 = field635[var40];

		if (arg6 == 0) {
			field210.method504(72);
			field210.method505(var35 + var35 + 3);
		}

		if (arg6 == 1) {
			field210.method504(79);
			field210.method505(var35 + var35 + 3 + 14);
		}

		if (arg6 == 2) {
			field210.method504(4);
			field210.method505(var35 + var35 + 3);
		}

		field459 = field634[0];
		field460 = field635[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field210.method505(field634[var40] - var36);
			field210.method505(field635[var40] - var37);
		}

		field210.method505(field89[5] == 1 ? 1 : 0);
		field210.method506(field487 + var36);
		field210.method539(field488 + var37);
		return true;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method102() {
		if (field349 > 1) {
			field349--;
		}

		if (field399 > 0) {
			field399--;
		}

		for (int var1 = 0; var1 < 5 && method109(); var1++) {
		}

		if (field613) {
			synchronized (field339.field1324) {
				if (!field448) {
					field339.field1327 = 0;
				} else if (field85 != 0 || field339.field1327 >= 40) {
					field210.method504(57);
					field210.method505(0);
					int var3 = field210.field1401;
					int var4 = 0;
					for (int var5 = 0; var5 < field339.field1327 && var3 - field210.field1401 < 240; var5++) {
						var4++;
						int var6 = field339.field1323[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field339.field1322[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field339.field1323[var5] == -1 && field339.field1322[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field226 != var7 || field227 != var6) {
							int var9 = var7 - field226;
							field226 = var7;
							int var10 = var6 - field227;
							field227 = var6;

							if (field499 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field210.method506((field499 << 12) + (var9 << 6) + var10);
								field499 = 0;
							} else if (field499 < 8) {
								field210.method508((field499 << 19) + var8 + 0x800000);
								field499 = 0;
							} else {
								field210.method509((field499 << 19) + var8 - 0x40000000);
								field499 = 0;
							}
						} else if (field499 < 2047) {
							field499++;
						}
					}

					field210.method514(field210.field1401 - var3);

					if (var4 >= field339.field1327) {
						field339.field1327 = 0;
					} else {
						field339.field1327 -= var4;
						for (int var11 = 0; var11 < field339.field1327; var11++) {
							field339.field1322[var11] = field339.field1322[var4 + var11];
							field339.field1323[var11] = field339.field1323[var4 + var11];
						}
					}
				}
			}

			if (field85 != 0) {
				long var12 = (field88 - field305) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field305 = field88;
				int var14 = field87;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field86;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field85 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field210.method504(184);
				field210.method547((var17 << 19) + (var18 << 20) + var16);
			}

			if (field256 > 0) {
				field256--;
			}

			if (field89[1] == 1 || field89[2] == 1 || field89[3] == 1 || field89[4] == 1) {
				field257 = true;
			}

			if (field257 && field256 <= 0) {
				field256 = 20;
				field257 = false;
				field210.method504(136);
				field210.method540(field525);
				field210.method540(field524);
			}

			if (field76 && !field340) {
				field340 = true;
				field210.method504(251);
				field210.method505(1);
			}

			if (!field76 && field340) {
				field340 = false;
				field210.method504(251);
				field210.method505(0);
			}

			method83();
			method71();
			method69();
			field397++;
			if (field397 > 750) {
				method65();
			}

			method89();
			method123();
			method140();
			field498++;

			if (field570 != 0) {
				field569 += 20;
				if (field569 >= 400) {
					field570 = 0;
				}
			}

			if (field422 != 0) {
				field419++;
				if (field419 >= 15) {
					if (field422 == 2) {
						field314 = true;
					}

					if (field422 == 3) {
						field578 = true;
					}

					field422 = 0;
				}
			}

			if (field484 != 0) {
				field293++;

				if (field79 > field485 + 5 || field79 < field485 - 5 || field80 > field486 + 5 || field80 < field486 - 5) {
					field238 = true;
				}

				if (field78 == 0) {
					if (field484 == 2) {
						field314 = true;
					}

					if (field484 == 3) {
						field578 = true;
					}

					field484 = 0;

					if (field238 && field293 >= 5) {
						field454 = -1;
						method122();

						if (field482 == field454 && field483 != field453) {
							MRUJPFPS var19 = MRUJPFPS.method324(field482);
							byte var20 = 0;
							if (field440 == 1 && var19.field987 == 206) {
								var20 = 1;
							}

							if (var19.field991[field453] <= 0) {
								var20 = 0;
							}

							if (var19.field985) {
								int var21 = field483;
								int var22 = field453;
								var19.field991[var22] = var19.field991[var21];
								var19.field1006[var22] = var19.field1006[var21];
								var19.field991[var21] = -1;
								var19.field1006[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field483;
								int var24 = field453;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method327(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method327(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method327(field453, field483);
							}

							field210.method504(194);
							field210.method506(field483);
							field210.method540(field482);
							field210.method539(field453);
							field210.method505(var20);
						}
					} else if ((field477 == 1 || method153(field627 - 1)) && field627 > 2) {
						method133();
					} else if (field627 > 0) {
						method177(field627 - 1);
					}

					field419 = 10;
					field85 = 0;
				}
			}

			if (QPWZYOZR.field1280 != -1) {
				int var25 = QPWZYOZR.field1280;
				int var26 = QPWZYOZR.field1281;
				boolean var27 = method101(0, true, 0, 0, field338.field144[0], var25, 0, field338.field143[0], var26, 0, 0);
				QPWZYOZR.field1280 = -1;

				if (var27) {
					field567 = field86;
					field568 = field87;
					field570 = 1;
					field569 = 0;
				}
			}

			if (field85 == 1 && field629 != null) {
				field629 = null;
				field578 = true;
				field85 = 0;
			}

			method174();

			if (field522 == -1) {
				method163();
				method76();
				method159();
			}

			if (field78 == 1 || field85 == 1) {
				field546++;
			}

			if (field232 == 0 && field295 == 0 && field445 == 0) {
				if (field544 > 0) {
					field544--;
				}
			} else if (field544 < 100) {
				field544++;
				if (field544 == 100) {
					if (field232 != 0) {
						field578 = true;
					}

					if (field295 != 0) {
						field314 = true;
					}
				}
			}

			if (field591 == 2) {
				method132();
			}

			if (field591 == 2 && field619) {
				method91();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field571[var28]++;
			}

			method137();
			field77++;
			if (field77 > 4500) {
				field399 = 250;
				field77 -= 500;
				field210.method504(84);
			}

			field447++;
			if (field447 > 500) {
				field447 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field636 += field637;
				}

				if ((var29 & 0x2) == 2) {
					field606 += field607;
				}

				if ((var29 & 0x4) == 4) {
					field387 += field388;
				}
			}

			if (field636 < -50) {
				field637 = 2;
			}

			if (field636 > 50) {
				field637 = -2;
			}

			if (field606 < -55) {
				field607 = 2;
			}

			if (field606 > 55) {
				field607 = -2;
			}

			if (field387 < -40) {
				field388 = 1;
			}

			if (field387 > 40) {
				field388 = -1;
			}

			field623++;
			if (field623 > 500) {
				field623 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field274 += field275;
				}

				if ((var30 & 0x2) == 2) {
					field542 += field543;
				}
			}

			if (field274 < -60) {
				field275 = 2;
			}

			if (field274 > 60) {
				field275 = -2;
			}

			if (field542 < -20) {
				field543 = 1;
			}

			if (field542 > 10) {
				field543 = -1;
			}

			field398++;
			if (field398 > 50) {
				field210.method504(44);
			}

			try {
				if (field258 != null && field210.field1401 > 0) {
					field258.method308(field210.field1401, field210.field1400, 0);
					field210.field1401 = 0;
					field398 = 0;
				}
			} catch (IOException var32) {
				method65();
			} catch (Exception var33) {
				method170();
			}
		}
	}

	@ObfuscatedName("client.a(ILBIWICTTN;)V")
	public final void method103(BIWICTTN arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field132 == 0) {
			var2 = field603.method425(arg0.field131, arg0.field133, arg0.field134);
		}

		if (arg0.field132 == 1) {
			var2 = field603.method426(arg0.field131, arg0.field134, arg0.field133);
		}

		if (arg0.field132 == 2) {
			var2 = field603.method427(arg0.field131, arg0.field133, arg0.field134);
		}

		if (arg0.field132 == 3) {
			var2 = field603.method428(arg0.field131, arg0.field133, arg0.field134);
		}

		if (var2 != 0) {
			int var6 = field603.method429(arg0.field131, arg0.field133, arg0.field134, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field126 = var3;
		arg0.field128 = var4;
		arg0.field127 = var5;
	}

	@ObfuscatedName("client.a(IIILMRUJPFPS;IIII)V")
	public final void method104(int arg0, int arg1, MRUJPFPS arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.field1025 == 0 && arg2.field1032 != null && !arg2.field1020 && (arg4 >= arg0 && arg3 >= arg6 && arg4 <= arg2.field989 + arg0 && arg3 <= arg2.field1009 + arg6)) {
			int var8 = arg2.field1032.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.field1012[var9] + arg0;
				int var11 = arg2.field1031[var9] + arg6 - arg5;
				MRUJPFPS var12 = MRUJPFPS.method324(arg2.field1032[var9]);
				var10 += var12.field1045;
				var11 += var12.field1034;
				if ((var12.field1036 >= 0 || var12.field1046 != 0) && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
					if (var12.field1036 >= 0) {
						field352 = var12.field1036;
					} else {
						field352 = var12.field1040;
					}
				}

				if (var12.field1025 == 8 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
					field612 = var12.field1040;
				}

				if (var12.field1025 == 0) {
					method104(var10, arg1, var12, arg3, arg4, var12.field990, var11);

					if (var12.field1051 > var12.field1009) {
						method99(var12.field1009, var12.field989 + var10, var12, arg4, arg3, var11, var12.field1051, arg1);
					}
				} else {
					if (var12.field1048 == 1 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						boolean var13 = false;
						if (var12.field987 != 0) {
							var13 = method97(var12);
						}

						if (!var13) {
							field276[field627] = var12.field1017;
							field267[field627] = 120;
							field266[field627] = var12.field1040;
							field627++;
						}
					}

					if (var12.field1048 == 2 && field409 == 0 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						String var14 = var12.field1019;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field276[field627] = var14 + " @gre@" + var12.field1054;
						field267[field627] = 457;
						field266[field627] = var12.field1040;
						field627++;
					}

					if (var12.field1048 == 3 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						field276[field627] = "Close";

						if (arg1 == 3) {
							field267[field627] = 431;
						} else {
							field267[field627] = 542;
						}

						field266[field627] = var12.field1040;
						field627++;
					}

					if (var12.field1048 == 4 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						field276[field627] = var12.field1017;
						field267[field627] = 878;
						field266[field627] = var12.field1040;
						field627++;
					}

					if (var12.field1048 == 5 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						field276[field627] = var12.field1017;
						field267[field627] = 917;
						field266[field627] = var12.field1040;
						field627++;
					}

					if (var12.field1048 == 6 && !field478 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field989 + var10 && arg3 < var12.field1009 + var11) {
						field276[field627] = var12.field1017;
						field267[field627] = 293;
						field266[field627] = var12.field1040;
						field627++;
					}

					if (var12.field1025 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1009; var16++) {
							for (int var17 = 0; var17 < var12.field989; var17++) {
								int var18 = (var12.field1033 + 32) * var17 + var10;
								int var19 = (var12.field1015 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1057[var15];
									var19 += var12.field1050[var15];
								}

								if (arg4 >= var18 && arg3 >= var19 && arg4 < var18 + 32 && arg3 < var19 + 32) {
									field453 = var15;
									field454 = var12.field1040;

									if (var12.field991[var15] > 0) {
										AAHIRSBF var20 = AAHIRSBF.method7(var12.field991[var15] - 1);
										if (field316 == 1 && var12.field1016) {
											if (field318 != var12.field1040 || field317 != var15) {
												field276[field627] = "Use " + field320 + " with @lre@" + var20.field19;
												field267[field627] = 576;
												field268[field627] = var20.field9;
												field265[field627] = var15;
												field266[field627] = var12.field1040;
												field627++;
											}
										} else if (field409 != 1 || !var12.field1016) {
											if (var12.field1016) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field14 != null && var20.field14[var21] != null) {
														field276[field627] = var20.field14[var21] + " @lre@" + var20.field19;

														if (var21 == 3) {
															field267[field627] = 501;
														}

														if (var21 == 4) {
															field267[field627] = 837;
														}

														field268[field627] = var20.field9;
														field265[field627] = var15;
														field266[field627] = var12.field1040;
														field627++;
													} else if (var21 == 4) {
														field276[field627] = "Drop @lre@" + var20.field19;
														field267[field627] = 837;
														field268[field627] = var20.field9;
														field265[field627] = var15;
														field266[field627] = var12.field1040;
														field627++;
													}
												}
											}

											if (var12.field1053) {
												field276[field627] = "Use @lre@" + var20.field19;
												field267[field627] = 888;
												field268[field627] = var20.field9;
												field265[field627] = var15;
												field266[field627] = var12.field1040;
												field627++;
											}

											if (var12.field1016 && var20.field14 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field14[var22] != null) {
														field276[field627] = var20.field14[var22] + " @lre@" + var20.field19;

														if (var22 == 0) {
															field267[field627] = 620;
														}

														if (var22 == 1) {
															field267[field627] = 5;
														}

														if (var22 == 2) {
															field267[field627] = 121;
														}

														field268[field627] = var20.field9;
														field265[field627] = var15;
														field266[field627] = var12.field1040;
														field627++;
													}
												}
											}

											if (var12.field988 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field988[var23] != null) {
														field276[field627] = var12.field988[var23] + " @lre@" + var20.field19;

														if (var23 == 0) {
															field267[field627] = 219;
														}

														if (var23 == 1) {
															field267[field627] = 915;
														}

														if (var23 == 2) {
															field267[field627] = 486;
														}

														if (var23 == 3) {
															field267[field627] = 463;
														}

														if (var23 == 4) {
															field267[field627] = 343;
														}

														field268[field627] = var20.field9;
														field265[field627] = var15;
														field266[field627] = var12.field1040;
														field627++;
													}
												}
											}

											field276[field627] = "Examine @lre@" + var20.field19;
											field267[field627] = 1940;
											field268[field627] = var20.field9;
											field265[field627] = var15;
											field266[field627] = var12.field1040;
											field627++;
										} else if ((field411 & 0x10) == 0x10) {
											field276[field627] = field412 + " @lre@" + var20.field19;
											field267[field627] = 974;
											field268[field627] = var20.field9;
											field265[field627] = var15;
											field266[field627] = var12.field1040;
											field627++;
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

	@ObfuscatedName("client.e(Z)V")
	public final void method105() {
		int var1 = field403;
		int var2 = field404;
		int var3 = field405;
		int var4 = field406;
		int var5 = 0x5D5447;
		KPYGFVMA.method315(var5, var1, var2, var4, var3);
		KPYGFVMA.method315(0, var1 + 1, var2 + 1, 16, var3 - 2);
		KPYGFVMA.method316(var3 - 2, var2 + 18, var4 - 19, var1 + 1, 0);
		field416.method593(var5, var2 + 14, "Choose Option", var1 + 3);
		int var6 = field79;
		int var7 = field80;
		if (field402 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field402 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field402 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field627; var8++) {
			int var9 = (field627 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field416.method597(true, field276[var8], var1 + 3, var10, var9);
		}
	}

	@ObfuscatedName("client.a(IIBI)Z")
	public final boolean method106(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field603.method429(field592, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field377++;
		if (field377 > 103) {
			field377 = 0;
			field210.method504(208);
			field210.method505(55);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			FUIMNWOZ var8 = FUIMNWOZ.method246(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field814;
				var10 = var8.field804;
			} else {
				var9 = var8.field804;
				var10 = var8.field814;
			}

			int var11 = var8.field786;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method101(0, true, var10, 0, field338.field144[0], arg1, 2, field338.field143[0], arg2, var9, var11);
		} else {
			method101(var6 + 1, true, 0, var7, field338.field144[0], arg1, 2, field338.field143[0], arg2, 0, 0);
		}

		field567 = field86;
		field568 = field87;
		field570 = 2;
		field569 = 0;
		return true;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method107(boolean arg0) {
		if (field338.field191 >> 7 == field459 && field338.field192 >> 7 == field460) {
			field459 = 0;
		}

		int var2 = field431;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			SRMWIYVM var4;
			int var5;
			if (arg0) {
				var4 = field338;
				var5 = field429 << 14;
			} else {
				var4 = field430[field432[var3]];
				var5 = field432[var3] << 14;
			}

			if (var4 != null && var4.method42()) {
				var4.field1357 = false;
				if ((field369 && field431 > 50 || field431 > 200) && !arg0 && var4.field195 == var4.field145) {
					var4.field1357 = true;
				}

				int var6 = var4.field191 >> 7;
				int var7 = var4.field192 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1369 == null || field552 < var4.field1360 || field552 >= var4.field1361) {
						if ((var4.field191 & 0x7F) == 0x40 && (var4.field192 & 0x7F) == 0x40) {
							if (field203[var6][var7] == field383) {
								continue;
							}

							field203[var6][var7] = field383;
						}

						var4.field1365 = method154(field592, var4.field191, var4.field192);
						field603.method410(field592, var5, 60, var4, var4.field192, var4.field191, var4.field193, var4.field1365, var4.field182);
					} else {
						var4.field1357 = false;
						var4.field1365 = method154(field592, var4.field191, var4.field192);
						field603.method411(var4.field1349, var4.field1351, 60, var4, var5, var4.field1348, var4.field1350, var4.field193, var4.field192, var4.field1365, var4.field191, field592);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method108(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field389 = "";
				field390 = "Connecting to server...";
				method156(true);
			}

			field258 = new KMJQVYHB(method145(field367 + 43594), this);
			long var4 = XLAXYQGJ.method578(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field210.field1401 = 0;
			field210.method505(14);
			field210.method505(var6);
			field258.method308(2, field210.field1400, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field258.method305();
			}

			int var8 = field258.method305();
			int var9 = var8;

			if (var8 == 0) {
				field258.method307(field630.field1400, 0, 8);
				field630.field1401 = 0;
				field291 = field630.method521();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field291 >> 32), (int) field291 };
				field210.field1401 = 0;
				field210.method505(10);
				field210.method509(var10[0]);
				field210.method509(var10[1]);
				field210.method509(var10[2]);
				field210.method509(var10[3]);
				field210.method509(signlink.uid);
				field210.method512(arg0);
				field210.method512(arg1);
				field210.method530(field244, field297);
				field540.field1401 = 0;

				if (arg2) {
					field540.method505(18);
				} else {
					field540.method505(16);
				}

				field540.method505(field210.field1401 + 36 + 1 + 1 + 2);
				field540.method505(255);
				field540.method506(369);
				field540.method505(field369 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field540.method509(field292[var11]);
				}

				field540.method513(0, field210.field1401, field210.field1400);
				field210.field1405 = new XAGUDWSZ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field621 = new XAGUDWSZ(var10);
				field258.method308(field540.field1401, field540.field1400, 0);
				var8 = field258.method305();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method108(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field471 = field258.method305();
				field448 = field258.method305() == 1;
				field305 = 0L;
				field499 = 0;
				field339.field1327 = 0;
				field76 = true;
				field340 = true;
				field613 = true;
				field210.field1401 = 0;
				field630.field1401 = 0;
				field396 = -1;
				field353 = -1;
				field354 = -1;
				field355 = -1;
				field395 = 0;
				field397 = 0;
				field349 = 0;
				field399 = 0;
				field413 = 0;
				field627 = 0;
				field348 = false;
				field77 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field640[var13] = null;
				}

				field316 = 0;
				field409 = 0;
				field591 = 0;
				field601 = 0;
				field636 = (int) (Math.random() * 100.0D) - 50;
				field606 = (int) (Math.random() * 110.0D) - 55;
				field387 = (int) (Math.random() * 80.0D) - 40;
				field274 = (int) (Math.random() * 120.0D) - 60;
				field542 = (int) (Math.random() * 30.0D) - 20;
				field525 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field401 = 0;
				field198 = -1;
				field459 = 0;
				field460 = 0;
				field431 = 0;
				field361 = 0;

				for (int var14 = 0; var14 < field428; var14++) {
					field430[var14] = null;
					field435[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field360[var15] = null;
				}

				field338 = field430[field429] = new SRMWIYVM();
				field547.method344();
				field441.method344();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field363[var16][var17][var18] = null;
						}
					}
				}

				field346 = new NYZQPNXB();
				field555 = 0;
				field554 = 0;
				method73(field479);
				field479 = -1;
				method73(field287);
				field287 = -1;
				method73(field602);
				field602 = -1;
				method73(field522);
				field522 = -1;
				method73(field442);
				field442 = -1;
				method73(field282);
				field282 = -1;
				method73(field284);
				field284 = -1;
				field478 = false;
				field261 = 3;
				field455 = 0;
				field348 = false;
				field250 = false;
				field629 = null;
				field351 = 0;
				field281 = -1;
				field608 = true;
				method179();

				for (int var19 = 0; var19 < 5; var19++) {
					field379[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field375[var20] = null;
					field376[var20] = false;
				}

				field225 = 0;
				field400 = 0;
				field304 = 0;
				field579 = 0;
				field480 = 0;
				field279 = 0;
				field272 = 0;
				field548 = 0;
				method121();
			} else if (var8 == 3) {
				field389 = "";
				field390 = "Invalid username or password.";
			} else if (var8 == 4) {
				field389 = "Your account has been disabled.";
				field390 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field389 = "Your account is already logged in.";
				field390 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field389 = "RuneScape has been updated!";
				field390 = "Please reload this page.";
			} else if (var8 == 7) {
				field389 = "This world is full.";
				field390 = "Please use a different world.";
			} else if (var8 == 8) {
				field389 = "Unable to connect.";
				field390 = "Login server offline.";
			} else if (var8 == 9) {
				field389 = "Login limit exceeded.";
				field390 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field389 = "Unable to connect.";
				field390 = "Bad session id.";
			} else if (var8 == 12) {
				field389 = "You need a members account to login to this world.";
				field390 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field389 = "Could not complete login.";
				field390 = "Please try using a different world.";
			} else if (var8 == 14) {
				field389 = "The server is being updated.";
				field390 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field613 = true;
				field210.field1401 = 0;
				field630.field1401 = 0;
				field396 = -1;
				field353 = -1;
				field354 = -1;
				field355 = -1;
				field395 = 0;
				field397 = 0;
				field349 = 0;
				field627 = 0;
				field348 = false;
				field586 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field389 = "Login attempts exceeded.";
				field390 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field389 = "You are standing in a members-only area.";
				field390 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field389 = "Invalid loginserver requested";
				field390 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field258.method305();
				for (var21 += 3; var21 >= 0; var21--) {
					field389 = "You have only just left another world";
					field390 = "Your profile will be transferred in: " + var21;
					method156(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method108(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field389 = "Malformed login packet.";
				field390 = "Please try again.";
			} else if (var8 == 23) {
				field389 = "No reply from loginserver.";
				field390 = "Please try again.";
			} else if (var8 == 24) {
				field389 = "Error loading your profile.";
				field390 = "Please contact customer support.";
			} else if (var8 == 25) {
				field389 = "Unexpected loginserver response.";
				field390 = "Please try using a different world.";
			} else if (var8 == 26) {
				field389 = "This computers address has been blocked";
				field390 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field389 = "Unexpected server response";
				field390 = "Please try using a different world.";
			} else if (var9 != 0) {
				field389 = "No response from server";
				field390 = "Please try using a different world.";
			} else if (field211 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field211++;
				method108(arg0, arg1, arg2);
			} else {
				field389 = "No response from loginserver";
				field390 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field389 = "";
			field390 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method22() {
		if (field509 || field331 || field605) {
			method157();
		} else {
			field342++;

			if (field613) {
				method130();
			} else {
				method156(false);
			}

			field546 = 0;
		}
	}

	@ObfuscatedName("client.v(I)Z")
	public final boolean method109() {
		if (field258 == null) {
			return false;
		}

		try {
			int var1 = field258.method306();
			if (var1 == 0) {
				return false;
			}

			if (field396 == -1) {
				field258.method307(field630.field1400, 0, 1);
				field396 = field630.field1400[0] & 0xFF;
				if (field621 != null) {
					field396 = field396 - field621.method558() & 0xFF;
				}

				field395 = VFGCQFKD.field1392[field396];
				var1--;
			}

			if (field395 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field258.method307(field630.field1400, 0, 1);
				field395 = field630.field1400[0] & 0xFF;
				var1--;
			}

			if (field395 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field258.method307(field630.field1400, 0, 2);
				field630.field1401 = 0;
				field395 = field630.method517();
				var1 -= 2;
			}

			if (var1 < field395) {
				return false;
			}

			field630.field1401 = 0;
			field258.method307(field630.field1400, 0, field395);
			field397 = 0;
			field355 = field354;
			field354 = field353;
			field353 = field396;

			if (field396 == 144) {
				String var2 = field630.method522();
				if (var2.endsWith(":tradereq:")) {
					String var3 = var2.substring(0, var2.indexOf(":"));
					long var4 = XLAXYQGJ.method578(var3);
					boolean var6 = false;
					for (int var7 = 0; var7 < field277; var7++) {
						if (field343[var7] == var4) {
							var6 = true;
							break;
						}
					}

					if (!var6 && field566 == 0) {
						method175(4, "wishes to trade with you.", var3);
					}
				} else if (var2.endsWith(":duelreq:")) {
					String var8 = var2.substring(0, var2.indexOf(":"));
					long var9 = XLAXYQGJ.method578(var8);
					boolean var11 = false;
					for (int var12 = 0; var12 < field277; var12++) {
						if (field343[var12] == var9) {
							var11 = true;
							break;
						}
					}

					if (!var11 && field566 == 0) {
						method175(8, "wishes to duel with you.", var8);
					}
				} else if (var2.endsWith(":chalreq:")) {
					String var13 = var2.substring(0, var2.indexOf(":"));
					long var14 = XLAXYQGJ.method578(var13);
					boolean var16 = false;
					for (int var17 = 0; var17 < field277; var17++) {
						if (field343[var17] == var14) {
							var16 = true;
							break;
						}
					}

					if (!var16 && field566 == 0) {
						String var18 = var2.substring(var2.indexOf(":") + 1, var2.length() - 9);
						method175(8, var18, var13);
					}
				} else {
					method175(0, var2, "");
				}

				field396 = -1;
				return true;
			}

			if (field396 == 75) {
				int var19 = field630.method542();
				int var20 = field630.method542();
				int var21 = field630.method542();
				int var22 = field630.method542();
				MRUJPFPS.method324(var20).field999 = var19;
				MRUJPFPS.method324(var20).field1000 = var21;
				MRUJPFPS.method324(var20).field998 = var22;
				field396 = -1;
				return true;
			}

			if (field396 == 64) {
				field555 = field630.method515();
				field314 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 217) {
				int var23 = field630.method546();
				int var24 = field630.method543();
				int var25 = field630.method545();
				MRUJPFPS var26 = MRUJPFPS.method324(var24);
				var26.field1045 = var25;
				var26.field1034 = var23;
				field396 = -1;
				return true;
			}

			if (field396 == 113) {
				int var27 = field630.method532();
				String var28 = field630.method522();
				int var29 = field630.method515();
				if (var27 >= 1 && var27 <= 5) {
					if (var28.equalsIgnoreCase("null")) {
						var28 = null;
					}

					field375[var27 - 1] = var28;
					field376[var27 - 1] = var29 == 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 164) {
				int var30 = field630.method517();
				boolean var31 = field630.method533() == 1;
				MRUJPFPS.method324(var30).field1020 = var31;
				field396 = -1;
				return true;
			}

			if (field396 == 154) {
				int var32 = field630.method517();
				int var33 = field630.method517();
				MRUJPFPS var34 = MRUJPFPS.method324(var32);
				if (var34 != null && var34.field1025 == 0) {
					if (var33 < 0) {
						var33 = 0;
					}

					if (var33 > var34.field1051 - var34.field1009) {
						var33 = var34.field1051 - var34.field1009;
					}

					var34.field990 = var33;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 208) {
				field407 = field630.method534();
				field263 = field630.method542();
				field396 = -1;
				return true;
			}

			if (field396 == 28) {
				int var35 = field630.method546();
				int var36 = field630.method543();
				MRUJPFPS var37 = MRUJPFPS.method324(var36);
				if (var37.field1038 != var35 || var35 == -1) {
					var37.field1038 = var35;
					var37.field1056 = 0;
					var37.field994 = 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 124) {
				int var38 = field630.method543();
				int var39 = field630.method541();

				if (field287 != -1) {
					method73(field287);
					field287 = -1;
					field578 = true;
				}

				if (field522 != -1) {
					method73(field522);
					field522 = -1;
					field624 = true;
				}

				if (field442 != -1) {
					method73(field442);
					field442 = -1;
				}

				if (field602 != var38) {
					method73(field602);
					field602 = var38;
				}

				if (field282 != var39) {
					method73(field282);
					field282 = var39;
				}

				if (field455 != 0) {
					field455 = 0;
					field578 = true;
				}

				field314 = true;
				field302 = true;
				field478 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 72) {
				field619 = false;

				for (int var40 = 0; var40 < 5; var40++) {
					field577[var40] = false;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 18) {
				field202 = field630.method533();
				field201 = field630.method532();
				for (int var41 = field201; var41 < field201 + 8; var41++) {
					for (int var42 = field202; var42 < field202 + 8; var42++) {
						if (field363[field592][var41][var42] != null) {
							field363[field592][var41][var42] = null;
							method112(var41, var42);
						}
					}
				}

				for (BIWICTTN var43 = (BIWICTTN) field346.method340(); var43 != null; var43 = (BIWICTTN) field346.method342()) {
					if (var43.field133 >= field201 && var43.field133 < field201 + 8 && var43.field134 >= field202 && var43.field134 < field202 + 8 && field592 == var43.field131) {
						var43.field129 = 0;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 184) {
				field619 = true;
				field213 = field630.method515();
				field214 = field630.method515();
				field215 = field630.method517();
				field216 = field630.method515();
				field217 = field630.method515();
				if (field217 >= 100) {
					int var44 = field213 * 128 + 64;
					int var45 = field214 * 128 + 64;
					int var46 = method154(field592, var44, var45) - field215;
					int var47 = var44 - field572;
					int var48 = var46 - field573;
					int var49 = var45 - field574;
					int var50 = (int) Math.sqrt(var47 * var47 + var49 * var49);
					field575 = (int) (Math.atan2(var48, var50) * 325.949D) & 0x7FF;
					field576 = (int) (Math.atan2(var47, var49) * -325.949D) & 0x7FF;

					if (field575 < 128) {
						field575 = 128;
					}

					if (field575 > 383) {
						field575 = 383;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 188) {
				int var51 = field630.method517();
				int var52 = field630.method515();
				int var53 = field630.method517();
				if (var53 == 0xFFFF) {
					if (field601 < 50) {
						field446[field601] = (short) var51;
						field364[field601] = var52;
						field625[field601] = 0;
						field601++;
					}
				} else if (field286 && !field369 && field601 < 50) {
					field446[field601] = var51;
					field364[field601] = var52;
					field625[field601] = VKAZQVPD.field1394[var51] + var53;
					field601++;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 52) {
				field349 = field630.method543() * 30;
				field396 = -1;
				return true;
			}

			if (field396 == 195) {
				int var54 = field630.method542();
				method134(var54);

				if (field282 != -1) {
					method73(field282);
					field282 = -1;
					field314 = true;
					field302 = true;
				}

				if (field522 != -1) {
					method73(field522);
					field522 = -1;
					field624 = true;
				}

				if (field442 != -1) {
					method73(field442);
					field442 = -1;
				}

				if (field602 != -1) {
					method73(field602);
					field602 = -1;
				}

				if (field287 != var54) {
					method73(field287);
					field287 = var54;
				}

				field478 = false;
				field578 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 70) {
				long var55 = field630.method521();
				int var57 = field630.method515();
				String var58 = XLAXYQGJ.method582(XLAXYQGJ.method579(var55));
				for (int var59 = 0; var59 < field554; var59++) {
					if (field200[var59] == var55) {
						if (field233[var59] != var57) {
							field233[var59] = var57;
							field314 = true;

							if (var57 > 0) {
								method175(5, var58 + " has logged in.", "");
							}

							if (var57 == 0) {
								method175(5, var58 + " has logged out.", "");
							}
						}

						var58 = null;
						break;
					}
				}

				if (var58 != null && field554 < 200) {
					field200[field554] = var55;
					field347[field554] = var58;
					field233[field554] = var57;
					field554++;
					field314 = true;
				}

				boolean var60 = false;
				while (!var60) {
					var60 = true;
					for (int var61 = 0; var61 < field554 - 1; var61++) {
						if (field233[var61] != field366 && field233[var61 + 1] == field366 || field233[var61] == 0 && field233[var61 + 1] != 0) {
							int var62 = field233[var61];
							field233[var61] = field233[var61 + 1];
							field233[var61 + 1] = var62;
							String var63 = field347[var61];
							field347[var61] = field347[var61 + 1];
							field347[var61 + 1] = var63;
							long var64 = field200[var61];
							field200[var61] = field200[var61 + 1];
							field200[var61 + 1] = var64;
							field314 = true;
							var60 = false;
						}
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 239) {
				int var66 = field630.method542();
				int var67 = field630.method534();

				if (var66 == 0xFFFF) {
					var66 = -1;
				}

				if (field491[var67] != var66) {
					method73(field491[var67]);
					field491[var67] = var66;
				}

				field314 = true;
				field302 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 42) {
				method170();
				field396 = -1;
				return false;
			}

			if (field396 == 247) {
				field314 = true;
				int var68 = field630.method517();
				MRUJPFPS var69 = MRUJPFPS.method324(var68);
				while (field630.field1401 < field395) {
					int var70 = field630.method529();
					int var71 = field630.method517();
					int var72 = field630.method515();
					if (var72 == 255) {
						var72 = field630.method520();
					}

					if (var70 >= 0 && var70 < var69.field991.length) {
						var69.field991[var70] = var71;
						var69.field1006[var70] = var72;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 19) {
				int var73 = field630.method542();
				int var74 = field630.method543();
				MRUJPFPS.method324(var73).field1004 = 1;
				MRUJPFPS.method324(var73).field1005 = var74;
				field396 = -1;
				return true;
			}

			if (field396 == 174) {
				int var75 = field630.method541();
				int var76 = field630.method541();
				MRUJPFPS.method324(var76).field1004 = 2;
				MRUJPFPS.method324(var76).field1005 = var75;
				field396 = -1;
				return true;
			}

			if (field396 == 172) {
				field384 = field630.method515();
				field283 = field630.method515();
				field538 = field630.method515();
				field517 = true;
				field578 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 237) {
				int var77 = field630.method541();
				MRUJPFPS var78 = MRUJPFPS.method324(var77);
				for (int var79 = 0; var79 < var78.field991.length; var79++) {
					var78.field991[var79] = -1;
					var78.field991[var79] = 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 169) {
				field351 = field630.method515();
				field396 = -1;
				return true;
			}

			if (field396 == 15) {
				field250 = false;
				field455 = 2;
				field451 = "";
				field578 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 224) {
				field281 = field630.method534();
				if (field281 == field261) {
					if (field281 == 3) {
						field261 = 1;
					} else {
						field261 = 3;
					}

					field314 = true;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 20) {
				int var80 = field630.method541();
				int var81 = field630.method543();
				int var82 = field630.method517();
				MRUJPFPS.method324(var80).field1030 = (var82 << 16) + var81;
				field396 = -1;
				return true;
			}

			if (field396 == 243) {
				field314 = true;
				int var83 = field630.method534();
				int var84 = field630.method534();
				int var85 = field630.method550();
				field622[var84] = var85;
				field222[var84] = var83;
				field508[var84] = 1;
				for (int var86 = 0; var86 < 98; var86++) {
					if (var85 >= field336[var86]) {
						field508[var84] = var86 + 2;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 30) {
				int var87 = field630.method517();
				method134(var87);

				if (field287 != -1) {
					method73(field287);
					field287 = -1;
					field578 = true;
				}

				if (field522 != -1) {
					method73(field522);
					field522 = -1;
					field624 = true;
				}

				if (field442 != -1) {
					method73(field442);
					field442 = -1;
				}

				if (field602 != -1) {
					method73(field602);
					field602 = -1;
				}

				if (field282 != var87) {
					method73(field282);
					field282 = var87;
				}

				if (field455 != 0) {
					field455 = 0;
					field578 = true;
				}

				field314 = true;
				field302 = true;
				field478 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 142) {
				if (field261 == 12) {
					field314 = true;
				}

				field262 = field630.method518();
				field396 = -1;
				return true;
			}

			if (field396 == 83 || field396 == 35) {
				int var88 = field204;
				int var89 = field205;
				if (field396 == 83) {
					var89 = field630.method543();
					var88 = field630.method542();
					field230 = false;
				}

				if (field396 == 35) {
					field630.method525();

					for (int var90 = 0; var90 < 4; var90++) {
						for (int var91 = 0; var91 < 13; var91++) {
							for (int var92 = 0; var92 < 13; var92++) {
								int var93 = field630.method526(1);
								if (var93 == 1) {
									field208[var90][var91][var92] = field630.method526(26);
								} else {
									field208[var90][var91][var92] = -1;
								}
							}
						}
					}

					field630.method527();
					var88 = field630.method541();
					var89 = field630.method543();
					field230 = true;
				}

				if (field204 == var88 && field205 == var89 && field591 == 2) {
					field396 = -1;
					return true;
				}

				field204 = var88;
				field205 = var89;
				field487 = (field204 - 6) * 8;
				field488 = (field205 - 6) * 8;
				field270 = false;
				if ((field204 / 8 == 48 || field204 / 8 == 49) && field205 / 8 == 48) {
					field270 = true;
				}

				if (field204 / 8 == 48 && field205 / 8 == 148) {
					field270 = true;
				}

				field591 = 1;
				field586 = System.currentTimeMillis();
				method171(null, "Loading - please wait.");

				if (field396 == 83) {
					int var94 = 0;
					for (int var95 = (field204 - 6) / 8; var95 <= (field204 + 6) / 8; var95++) {
						for (int var96 = (field205 - 6) / 8; var96 <= (field205 + 6) / 8; var96++) {
							var94++;
						}
					}

					field269 = new byte[var94][];
					field424 = new byte[var94][];
					field356 = new int[var94];
					field357 = new int[var94];
					field358 = new int[var94];
					int var97 = 0;
					for (int var98 = (field204 - 6) / 8; var98 <= (field204 + 6) / 8; var98++) {
						for (int var99 = (field205 - 6) / 8; var99 <= (field205 + 6) / 8; var99++) {
							field356[var97] = (var98 << 8) + var99;

							if (field270 && (var99 == 49 || var99 == 149 || var99 == 147 || var98 == 50 || var98 == 49 && var99 == 47)) {
								field357[var97] = -1;
								field358[var97] = -1;
								var97++;
							} else {
								int var100 = field357[var97] = field633.method277(var98, var99, 0);
								if (var100 != -1) {
									field633.method292(3, var100);
								}

								int var101 = field358[var97] = field633.method277(var98, var99, 1);
								if (var101 != -1) {
									field633.method292(3, var101);
								}

								var97++;
							}
						}
					}
				}

				if (field396 == 35) {
					int var102 = 0;
					int[] var103 = new int[676];
					for (int var104 = 0; var104 < 4; var104++) {
						for (int var105 = 0; var105 < 13; var105++) {
							for (int var106 = 0; var106 < 13; var106++) {
								int var107 = field208[var104][var105][var106];
								if (var107 != -1) {
									int var108 = var107 >> 14 & 0x3FF;
									int var109 = var107 >> 3 & 0x7FF;
									int var110 = (var108 / 8 << 8) + var109 / 8;
									for (int var111 = 0; var111 < var102; var111++) {
										if (var103[var111] == var110) {
											var110 = -1;
											break;
										}
									}

									if (var110 != -1) {
										var103[var102++] = var110;
									}
								}
							}
						}
					}

					field269 = new byte[var102][];
					field424 = new byte[var102][];
					field356 = new int[var102];
					field357 = new int[var102];
					field358 = new int[var102];
					for (int var112 = 0; var112 < var102; var112++) {
						int var113 = field356[var112] = var103[var112];
						int var114 = var113 >> 8 & 0xFF;
						int var115 = var113 & 0xFF;
						int var116 = field357[var112] = field633.method277(var114, var115, 0);
						if (var116 != -1) {
							field633.method292(3, var116);
						}

						int var117 = field358[var112] = field633.method277(var114, var115, 1);
						if (var117 != -1) {
							field633.method292(3, var117);
						}
					}
				}

				int var118 = field487 - field489;
				int var119 = field488 - field490;
				field489 = field487;
				field490 = field488;

				for (int var120 = 0; var120 < 16384; var120++) {
					PVFNGMTQ var121 = field360[var120];
					if (var121 != null) {
						for (int var122 = 0; var122 < 10; var122++) {
							var121.field143[var122] -= var118;
							var121.field144[var122] -= var119;
						}

						var121.field191 -= var118 * 128;
						var121.field192 -= var119 * 128;
					}
				}

				for (int var123 = 0; var123 < field428; var123++) {
					SRMWIYVM var124 = field430[var123];
					if (var124 != null) {
						for (int var125 = 0; var125 < 10; var125++) {
							var124.field143[var125] -= var118;
							var124.field144[var125] -= var119;
						}

						var124.field191 -= var118 * 128;
						var124.field192 -= var119 * 128;
					}
				}

				field212 = true;
				byte var126 = 0;
				byte var127 = 104;
				byte var128 = 1;
				if (var118 < 0) {
					var126 = 103;
					var127 = -1;
					var128 = -1;
				}

				byte var129 = 0;
				byte var130 = 104;
				byte var131 = 1;
				if (var119 < 0) {
					var129 = 103;
					var130 = -1;
					var131 = -1;
				}

				for (int var132 = var126; var132 != var127; var132 += var128) {
					for (int var133 = var129; var133 != var130; var133 += var131) {
						int var134 = var118 + var132;
						int var135 = var119 + var133;
						for (int var136 = 0; var136 < 4; var136++) {
							if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
								field363[var136][var132][var133] = field363[var136][var134][var135];
							} else {
								field363[var136][var132][var133] = null;
							}
						}
					}
				}

				for (BIWICTTN var137 = (BIWICTTN) field346.method340(); var137 != null; var137 = (BIWICTTN) field346.method342()) {
					var137.field133 -= var118;
					var137.field134 -= var119;
					if (var137.field133 < 0 || var137.field134 < 0 || var137.field133 >= 104 || var137.field134 >= 104) {
						var137.method41();
					}
				}

				if (field459 != 0) {
					field459 -= var118;
					field460 -= var119;
				}

				field619 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 138 || field396 == 119 || field396 == 149 || field396 == 225 || field396 == 250 || field396 == 190 || field396 == 210 || field396 == 141 || field396 == 135 || field396 == 150 || field396 == 205) {
				method142(field396, field630);
				field396 = -1;
				return true;
			}

			if (field396 == 43) {
				for (int var138 = 0; var138 < field626.length; var138++) {
					if (field626[var138] != field303[var138]) {
						field626[var138] = field303[var138];
						method173(var138);
						field314 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 39) {
				field202 = field630.method534();
				field201 = field630.method515();

				while (field630.field1401 < field395) {
					int var139 = field630.method515();
					method142(var139, field630);
				}

				field396 = -1;
				return true;
			}

			if (field396 == 189) {
				int var140 = field630.method545();
				if (var140 >= 0) {
					method134(var140);
				}

				if (field284 != var140) {
					method73(field284);
					field284 = var140;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 13) {
				if (field282 != -1) {
					method73(field282);
					field282 = -1;
					field314 = true;
					field302 = true;
				}

				if (field287 != -1) {
					method73(field287);
					field287 = -1;
					field578 = true;
				}

				if (field522 != -1) {
					method73(field522);
					field522 = -1;
					field624 = true;
				}

				if (field442 != -1) {
					method73(field442);
					field442 = -1;
				}

				if (field602 != -1) {
					method73(field602);
					field602 = -1;
				}

				if (field455 != 0) {
					field455 = 0;
					field578 = true;
				}

				field478 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 11) {
				field261 = field630.method532();
				field314 = true;
				field302 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 156) {
				int var141 = field630.method543();
				int var142 = field630.method541();
				int var143 = var142 >> 10 & 0x1F;
				int var144 = var142 >> 5 & 0x1F;
				int var145 = var142 & 0x1F;
				MRUJPFPS.method324(var141).field1018 = (var145 << 3) + (var143 << 19) + (var144 << 11);
				field396 = -1;
				return true;
			}

			if (field396 == 118) {
				int var146 = field630.method550();
				int var147 = field630.method542();
				field303[var147] = var146;

				if (field626[var147] != var146) {
					field626[var147] = var146;
					method173(var147);
					field314 = true;

					if (field479 != -1) {
						field578 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 207) {
				field201 = field630.method533();
				field202 = field630.method533();
				field396 = -1;
				return true;
			}

			if (field396 == 73) {
				int var148 = field630.method541();
				method134(var148);

				if (field282 != -1) {
					method73(field282);
					field282 = -1;
					field314 = true;
					field302 = true;
				}

				if (field287 != -1) {
					method73(field287);
					field287 = -1;
					field578 = true;
				}

				if (field522 != -1) {
					method73(field522);
					field522 = -1;
					field624 = true;
				}

				if (field442 != -1) {
					method73(field442);
					field442 = -1;
				}

				if (field602 != var148) {
					method73(field602);
					field602 = var148;
				}

				if (field455 != 0) {
					field455 = 0;
					field578 = true;
				}

				field478 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 125) {
				field401 = field630.method515();
				field396 = -1;
				return true;
			}

			if (field396 == 69) {
				method184(field395, field630);
				field212 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 1) {
				method94(field395, field630);
				field396 = -1;
				return true;
			}

			if (field396 == 181) {
				int var149 = field630.method544();
				if (field479 != var149) {
					method73(field479);
					field479 = var149;
				}

				field578 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 132) {
				int var150 = field630.method542();
				int var151 = field630.method542();
				method134(var150);

				if (var151 != -1) {
					method134(var151);
				}

				if (field602 != -1) {
					method73(field602);
					field602 = -1;
				}

				if (field282 != -1) {
					method73(field282);
					field282 = -1;
				}

				if (field287 != -1) {
					method73(field287);
					field287 = -1;
				}

				if (field522 != var150) {
					method73(field522);
					field522 = var150;
				}

				if (field442 != var150) {
					method73(field442);
					field442 = var151;
				}

				field455 = 0;
				field478 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 162) {
				field250 = false;
				field455 = 1;
				field451 = "";
				field578 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 100) {
				if (field261 == 12) {
					field314 = true;
				}

				field333 = field630.method515();
				field396 = -1;
				return true;
			}

			if (field396 == 187) {
				field619 = true;
				field512 = field630.method515();
				field513 = field630.method515();
				field514 = field630.method517();
				field515 = field630.method515();
				field516 = field630.method515();
				if (field516 >= 100) {
					field572 = field512 * 128 + 64;
					field574 = field513 * 128 + 64;
					field573 = method154(field592, field572, field574) - field514;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 110) {
				int var152 = field630.method541();
				int var153 = field630.method543();
				int var154 = field630.method541();
				if (var154 == 0xFFFF) {
					MRUJPFPS.method324(var153).field1004 = 0;
					field396 = -1;
					return true;
				}

				AAHIRSBF var155 = AAHIRSBF.method7(var154);
				MRUJPFPS.method324(var153).field1004 = 4;
				MRUJPFPS.method324(var153).field1005 = var154;
				MRUJPFPS.method324(var153).field999 = var155.field48;
				MRUJPFPS.method324(var153).field1000 = var155.field40;
				MRUJPFPS.method324(var153).field998 = var155.field5 * 100 / var152;
				field396 = -1;
				return true;
			}

			if (field396 == 236) {
				int var156 = field630.method515();
				int var157 = field630.method515();
				int var158 = field630.method515();
				int var159 = field630.method515();
				field577[var156] = true;
				field628[var156] = var157;
				field580[var156] = var158;
				field593[var156] = var159;
				field571[var156] = 0;
				field396 = -1;
				return true;
			}

			if (field396 == 231) {
				field277 = field395 / 8;
				for (int var160 = 0; var160 < field277; var160++) {
					field343[var160] = field630.method521();
				}

				field396 = -1;
				return true;
			}

			if (field396 == 186) {
				long var161 = field630.method521();
				int var163 = field630.method520();
				int var164 = field630.method515();
				boolean var165 = false;
				for (int var166 = 0; var166 < 100; var166++) {
					if (field220[var166] == var163) {
						var165 = true;
						break;
					}
				}

				if (var164 <= 1) {
					for (int var167 = 0; var167 < field277; var167++) {
						if (field343[var167] == var161) {
							var165 = true;
							break;
						}
					}
				}

				if (!var165 && field566 == 0) {
					try {
						field220[field207] = var163;
						field207 = (field207 + 1) % 100;
						String var168 = IWFUJXTN.method297(field395 - 13, field630);
						if (var164 != 3) {
							var168 = TONKJGVS.method467(var168);
						}

						if (var164 == 2 || var164 == 3) {
							method175(7, var168, "@cr2@" + XLAXYQGJ.method582(XLAXYQGJ.method579(var161)));
						} else if (var164 == 1) {
							method175(7, var168, "@cr1@" + XLAXYQGJ.method582(XLAXYQGJ.method579(var161)));
						} else {
							method175(3, var168, XLAXYQGJ.method582(XLAXYQGJ.method579(var161)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 204) {
				byte var170 = field630.method536();
				int var171 = field630.method543();
				field303[var171] = var170;

				if (field626[var171] != var170) {
					field626[var171] = var170;
					method173(var171);
					field314 = true;

					if (field479 != -1) {
						field578 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 92) {
				for (int var172 = 0; var172 < field430.length; var172++) {
					if (field430[var172] != null) {
						field430[var172].field183 = -1;
					}
				}

				for (int var173 = 0; var173 < field360.length; var173++) {
					if (field360[var173] != null) {
						field360[var173].field183 = -1;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 197) {
				int var174 = field630.method543();
				if (var174 == 0xFFFF) {
					var174 = -1;
				}

				if (field436 != var174 && field334 && !field369 && field423 == 0) {
					field234 = var174;
					field235 = true;
					field633.method292(2, field234);
				}

				field436 = var174;
				field396 = -1;
				return true;
			}

			if (field396 == 171) {
				int var175 = field630.method519();
				int var176 = field630.method517();
				if (field334 && !field369) {
					field234 = var176;
					field235 = false;
					field633.method292(2, field234);
					field423 = var175;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 193) {
				field459 = 0;
				field396 = -1;
				return true;
			}

			if (field396 == 5) {
				int var177 = field630.method541();
				String var178 = field630.method522();
				MRUJPFPS.method324(var177).field997 = var178;

				if (field491[field261] == MRUJPFPS.method324(var177).field1014) {
					field314 = true;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 40) {
				field630.method543();
				field298 = field630.method543();
				field394 = field630.method542();
				field630.method515();
				field223 = field630.method548();
				field288 = field630.method542();
				field630.method541();
				field439 = field630.method517();
				field452 = field630.method541();
				field474 = field630.method541();
				field630.method543();
				signlink.dnslookup(XLAXYQGJ.method581(field223));
				field396 = -1;
				return true;
			}

			if (field396 == 202) {
				field413 = field630.method515();
				if (field413 == 1) {
					field418 = field630.method517();
				}

				if (field413 >= 2 && field413 <= 6) {
					if (field413 == 2) {
						field242 = 64;
						field243 = 64;
					}

					if (field413 == 3) {
						field242 = 0;
						field243 = 64;
					}

					if (field413 == 4) {
						field242 = 128;
						field243 = 64;
					}

					if (field413 == 5) {
						field242 = 64;
						field243 = 0;
					}

					if (field413 == 6) {
						field242 = 64;
						field243 = 128;
					}

					field413 = 2;
					field239 = field630.method517();
					field240 = field630.method517();
					field241 = field630.method515();
				}

				if (field413 == 10) {
					field344 = field630.method517();
				}

				field396 = -1;
				return true;
			}

			if (field396 == 24) {
				int var179 = field630.method541();
				MRUJPFPS.method324(var179).field1004 = 3;

				if (field338.field1353 == null) {
					MRUJPFPS.method324(var179).field1005 = (field338.field1362[11] << 5) + (field338.field1362[8] << 10) + (field338.field1362[0] << 15) + (field338.field1356[0] << 25) + (field338.field1356[4] << 20) + field338.field1362[1];
				} else {
					MRUJPFPS.method324(var179).field1005 = (int) (field338.field1353.field1212 + 0x12345678L);
				}

				field396 = -1;
				return true;
			}

			if (field396 == 152) {
				field314 = true;
				int var180 = field630.method517();
				MRUJPFPS var181 = MRUJPFPS.method324(var180);
				int var182 = field630.method517();
				for (int var183 = 0; var183 < var182; var183++) {
					var181.field991[var183] = field630.method543();
					int var184 = field630.method532();
					if (var184 == 255) {
						var184 = field630.method548();
					}

					var181.field1006[var183] = var184;
				}

				for (int var185 = var182; var185 < var181.field991.length; var185++) {
					var181.field991[var185] = 0;
					var181.field1006[var185] = 0;
				}

				field396 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field396 + "," + field395 + " - " + field354 + "," + field355);
			method170();
		} catch (IOException var190) {
			method65();
		} catch (Exception var191) {
			String var187 = "T2 - " + field396 + "," + field354 + "," + field355 + " - " + field395 + "," + (field338.field143[0] + field487) + "," + (field338.field144[0] + field488) + " - ";
			for (int var188 = 0; var188 < field395 && var188 < 50; var188++) {
				var187 = var187 + field630.field1400[var188] + ",";
			}

			signlink.reporterror(var187);
			method170();
		}

		return true;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method110(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.w(I)Ljava/lang/String;")
	public final String method111() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field74 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method112(int arg0, int arg1) {
		NYZQPNXB var3 = field363[field592][arg0][arg1];
		if (var3 == null) {
			field603.method420(field592, arg0, arg1);
		} else {
			int var4 = -99999999;
			RLKSHOQT var5 = null;
			for (RLKSHOQT var6 = (RLKSHOQT) var3.method340(); var6 != null; var6 = (RLKSHOQT) var3.method342()) {
				AAHIRSBF var7 = AAHIRSBF.method7(var6.field1329);
				int var8 = var7.field44;
				if (var7.field3) {
					var8 = (var6.field1328 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method338(var5);
			RLKSHOQT var9 = null;
			RLKSHOQT var10 = null;
			for (RLKSHOQT var11 = (RLKSHOQT) var3.method340(); var11 != null; var11 = (RLKSHOQT) var3.method342()) {
				if (var5.field1329 != var11.field1329 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1329 != var11.field1329 && var9.field1329 != var11.field1329 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field603.method406(arg1, method154(field592, arg0 * 128 + 64, arg1 * 128 + 64), arg0, var9, field592, var5, var12, var10);
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method113() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method114() {
		if (field449 != 0) {
			int var1 = 0;
			if (field349 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field640[var2] != null) {
					int var3 = field638[var2];
					String var4 = field639[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field283 == 0 || field283 == 1 && method63(var4))) {
						int var8 = 329 - var1 * 13;
						if (field79 > 4 && field80 - 4 > var8 - 10 && field80 - 4 <= var8 + 3) {
							int var9 = field415.method591("From:  " + var4 + field640[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field79 < var9 + 4) {
								if (field471 >= 1) {
									field276[field627] = "Report abuse @whi@" + var4;
									field267[field627] = 2674;
									field627++;
								}

								field276[field627] = "Add ignore @whi@" + var4;
								field267[field627] = 2478;
								field627++;
								field276[field627] = "Add friend @whi@" + var4;
								field267[field627] = 2050;
								field627++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field283 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLMRUJPFPS;)Z")
	public final boolean method115(MRUJPFPS arg0) {
		int var2 = arg0.field987;
		if (field555 == 2) {
			if (var2 == 201) {
				field578 = true;
				field455 = 0;
				field250 = true;
				field511 = "";
				field551 = 1;
				field501 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field578 = true;
				field455 = 0;
				field250 = true;
				field511 = "";
				field551 = 2;
				field501 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field399 = 250;
			return true;
		}

		if (var2 == 501) {
			field578 = true;
			field455 = 0;
			field250 = true;
			field511 = "";
			field551 = 4;
			field501 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field578 = true;
			field455 = 0;
			field250 = true;
			field511 = "";
			field551 = 5;
			field501 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field294[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = FDNUHSLC.field751 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= FDNUHSLC.field751) {
							var5 = 0;
						}
					}

					if (!FDNUHSLC.field752[var5].field758 && FDNUHSLC.field752[var5].field753 == var3 + (field608 ? 0 : 7)) {
						break;
					}
				}

				field294[var3] = var5;
				field330 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field379[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field337[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field337[var6].length) {
					var8 = 0;
				}
			}

			field379[var6] = var8;
			field330 = true;
		}

		if (var2 == 324 && !field608) {
			field608 = true;
			method179();
		}

		if (var2 == 325 && field608) {
			field608 = false;
			method179();
		}

		if (var2 == 326) {
			field210.method504(162);
			field210.method505(field608 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field210.method505(field294[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field210.method505(field379[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field518 = !field518;
		}

		if (var2 >= 601 && var2 <= 613) {
			method68();

			if (field585.length() > 0) {
				field210.method504(16);
				field210.method511(XLAXYQGJ.method578(field585));
				field210.method505(var2 - 601);
				field210.method505(field518 ? 1 : 0);
			}
		}

		return false;
	}

	public final void init() {
		field366 = Integer.parseInt(getParameter("nodeid"));
		field367 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method64();
		} else {
			method72();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field368 = false;
		} else {
			field368 = true;
		}

		method15(503, 765);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method116(String arg0) throws IOException {
		if (field313) {
			if (field236 != null) {
				try {
					field236.close();
				} catch (Exception var4) {
				}

				field236 = null;
			}

			field236 = method145(43595);
			field236.setSoTimeout(10000);
			InputStream var2 = field236.getInputStream();
			OutputStream var3 = field236.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.x(I)I")
	public final int method117() {
		int var1 = 3;
		if (field575 < 310) {
			field341++;
			if (field341 > 151) {
				field341 = 0;
				field210.method504(83);
				field210.method508(933039);
			}

			int var2 = field572 >> 7;
			int var3 = field574 >> 7;
			int var4 = field338.field191 >> 7;
			int var5 = field338.field192 >> 7;

			if ((field296[field592][var2][var3] & 0x4) != 0) {
				var1 = field592;
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

					if ((field296[field592][var2][var3] & 0x4) != 0) {
						var1 = field592;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field296[field592][var2][var3] & 0x4) != 0) {
							var1 = field592;
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

					if ((field296[field592][var2][var3] & 0x4) != 0) {
						var1 = field592;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field296[field592][var2][var3] & 0x4) != 0) {
							var1 = field592;
						}
					}
				}
			}
		}

		if ((field296[field592][field338.field191 >> 7][field338.field192 >> 7] & 0x4) != 0) {
			var1 = field592;
		}

		return var1;
	}

	@ObfuscatedName("client.y(I)I")
	public final int method118() {
		int var1 = method154(field592, field572, field574);
		if (var1 - field573 < 800 && (field296[field592][field572 >> 7][field574 >> 7] & 0x4) != 0) {
			return field592;
		}

		return 3;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method119() {
		byte[] var1 = field539.method323("title.dat", null);
		OGPNACTP var2 = new OGPNACTP(var1, this);
		field531.method273();
		var2.method354(0, 0);
		field532.method273();
		var2.method354(-637, 0);
		field528.method273();
		var2.method354(-128, 0);
		field529.method273();
		var2.method354(-202, -371);
		field530.method273();
		var2.method354(-202, -171);
		field533.method273();
		var2.method354(0, -265);
		field534.method273();
		var2.method354(-562, -265);
		field535.method273();
		var2.method354(-128, -171);
		field536.method273();
		var2.method354(-562, -171);
		int[] var3 = new int[var2.field1134];
		for (int var4 = 0; var4 < var2.field1135; var4++) {
			for (int var5 = 0; var5 < var2.field1134; var5++) {
				var3[var5] = var2.field1133[var2.field1134 * var4 + var2.field1134 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1134; var6++) {
				var2.field1133[var2.field1134 * var4 + var6] = var3[var6];
			}
		}

		field531.method273();
		var2.method354(382, 0);
		field532.method273();
		var2.method354(-255, 0);
		field528.method273();
		var2.method354(254, 0);
		field529.method273();
		var2.method354(180, -371);
		field530.method273();
		var2.method354(180, -171);
		field533.method273();
		var2.method354(382, -265);
		field534.method273();
		var2.method354(-180, -265);
		field535.method273();
		var2.method354(254, -171);
		field536.method273();
		var2.method354(-180, -171);
		OGPNACTP var7 = new OGPNACTP(field539, "logo", 0);
		field528.method273();
		var7.method356(382 - var7.field1134 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method120(int arg0) {
		if (!field369) {
			for (int var2 = 0; var2 < field604.length; var2++) {
				int var3 = field604[var2];
				if (PIHSODZS.field1204[var3] >= arg0) {
					OSRLSEOB var4 = PIHSODZS.field1198[var3];
					int var5 = var4.field1143 * var4.field1142 - 1;
					int var6 = field498 * var4.field1142 * 2;
					byte[] var7 = var4.field1140;
					byte[] var8 = field550;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1140 = var8;
					field550 = var7;
					PIHSODZS.method379(var3);
					field537++;
					if (field537 > 196) {
						field537 = 0;
						field210.method504(67);
						field210.method506(20956);
					}
				}
			}

			field521++;
			if (field521 > 84) {
				field521 = 0;
				field210.method504(227);
				return;
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method121() {
		if (field505 == null) {
			method162();
			field72 = null;
			field528 = null;
			field529 = null;
			field530 = null;
			field531 = null;
			field532 = null;
			field533 = null;
			field534 = null;
			field535 = null;
			field536 = null;
			field505 = new HGHKUVEK(method24(), 479, 96);
			field503 = new HGHKUVEK(method24(), 172, 156);
			KPYGFVMA.method313();
			field426.method369(0, 0);
			field502 = new HGHKUVEK(method24(), 190, 261);
			field504 = new HGHKUVEK(method24(), 512, 334);
			KPYGFVMA.method313();
			field391 = new HGHKUVEK(method24(), 496, 50);
			field392 = new HGHKUVEK(method24(), 269, 37);
			field393 = new HGHKUVEK(method24(), 249, 45);
			field624 = true;
			field504.method273();
			PIHSODZS.field1196 = field328;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method122() {
		if (field484 == 0) {
			field276[0] = "Cancel";
			field267[0] = 1442;
			field627 = 1;
			if (field522 == -1) {
				method114();
				field352 = 0;
				field612 = 0;

				if (field79 > 4 && field80 > 4 && field79 < 516 && field80 < 338) {
					if (field602 == -1) {
						method143();
					} else {
						method104(4, 0, MRUJPFPS.method324(field602), field80, field79, 0, 4);
					}
				}

				if (field352 != field199) {
					field199 = field352;
				}

				if (field612 != field445) {
					field445 = field612;
				}

				field352 = 0;
				field612 = 0;

				if (field79 > 553 && field80 > 205 && field79 < 743 && field80 < 466) {
					if (field282 != -1) {
						method104(553, 1, MRUJPFPS.method324(field282), field80, field79, 0, 205);
					} else if (field491[field261] != -1) {
						method104(553, 1, MRUJPFPS.method324(field491[field261]), field80, field79, 0, 205);
					}
				}

				if (field497 != field352) {
					field314 = true;
					field497 = field352;
				}

				if (field612 != field295) {
					field314 = true;
					field295 = field612;
				}

				field352 = 0;
				field612 = 0;

				if (field79 > 17 && field80 > 357 && field79 < 496 && field80 < 453) {
					if (field287 != -1) {
						method104(17, 2, MRUJPFPS.method324(field287), field80, field79, 0, 357);
					} else if (field479 != -1) {
						method104(17, 3, MRUJPFPS.method324(field479), field80, field79, 0, 357);
					} else if (field80 < 434 && field79 < 426 && field455 == 0) {
						method66(field80 - 357, field79 - 17);
					}
				}

				if ((field287 != -1 || field479 != -1) && field588 != field352) {
					field578 = true;
					field588 = field352;
				}

				if ((field287 != -1 || field479 != -1) && field612 != field232) {
					field578 = true;
					field232 = field612;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field627 - 1; var2++) {
						if (field267[var2] < 1000 && field267[var2 + 1] > 1000) {
							String var3 = field276[var2];
							field276[var2] = field276[var2 + 1];
							field276[var2 + 1] = var3;
							int var4 = field267[var2];
							field267[var2] = field267[var2 + 1];
							field267[var2 + 1] = var4;
							int var5 = field265[var2];
							field265[var2] = field265[var2 + 1];
							field265[var2 + 1] = var5;
							int var6 = field266[var2];
							field266[var2] = field266[var2 + 1];
							field266[var2 + 1] = var6;
							int var7 = field268[var2];
							field268[var2] = field268[var2 + 1];
							field268[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field352 = 0;
				field612 = 0;
				method104(0, 0, MRUJPFPS.method324(field522), field80, field79, 0, 0);

				if (field352 != field199) {
					field199 = field352;
				}

				if (field612 != field445) {
					field445 = field612;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method123() {
		for (int var1 = 0; var1 < field361; var1++) {
			int var2 = field362[var1];
			PVFNGMTQ var3 = field360[var2];
			if (var3 != null) {
				method124(var3, var3.field1245.field1229);
			}
		}
	}

	@ObfuscatedName("client.a(LCELKGLWS;ZI)V")
	public final void method124(CELKGLWS arg0, int arg1) {
		if (arg0.field191 < 128 || arg0.field192 < 128 || arg0.field191 >= 13184 || arg0.field192 >= 13184) {
			arg0.field183 = -1;
			arg0.field165 = -1;
			arg0.field161 = 0;
			arg0.field162 = 0;
			arg0.field191 = arg0.field143[0] * 128 + arg0.field156 * 64;
			arg0.field192 = arg0.field144[0] * 128 + arg0.field156 * 64;
			arg0.method44();
		}

		if (field338 == arg0 && (arg0.field191 < 1536 || arg0.field192 < 1536 || arg0.field191 >= 11776 || arg0.field192 >= 11776)) {
			arg0.field183 = -1;
			arg0.field165 = -1;
			arg0.field161 = 0;
			arg0.field162 = 0;
			arg0.field191 = arg0.field143[0] * 128 + arg0.field156 * 64;
			arg0.field192 = arg0.field144[0] * 128 + arg0.field156 * 64;
			arg0.method44();
		}

		if (arg0.field161 > field552) {
			method125(arg0);
		} else if (arg0.field162 >= field552) {
			method126(arg0);
		} else {
			method127(arg0);
		}

		method128(arg0);
		method129(arg0);
	}

	@ObfuscatedName("client.a(LCELKGLWS;Z)V")
	public final void method125(CELKGLWS arg0) {
		int var2 = arg0.field161 - field552;
		int var3 = arg0.field157 * 128 + arg0.field156 * 64;
		int var4 = arg0.field159 * 128 + arg0.field156 * 64;
		arg0.field191 += (var3 - arg0.field191) / var2;
		arg0.field192 += (var4 - arg0.field192) / var2;
		arg0.field155 = 0;

		if (arg0.field163 == 0) {
			arg0.field194 = 1024;
		}

		if (arg0.field163 == 1) {
			arg0.field194 = 1536;
		}

		if (arg0.field163 == 2) {
			arg0.field194 = 0;
		}

		if (arg0.field163 == 3) {
			arg0.field194 = 512;
		}
	}

	@ObfuscatedName("client.a(BLCELKGLWS;)V")
	public final void method126(CELKGLWS arg0) {
		if (field552 == arg0.field162 || arg0.field183 == -1 || arg0.field186 != 0 || arg0.field185 + 1 > XETSOHUA.field1474[arg0.field183].method567(arg0.field184)) {
			int var2 = arg0.field162 - arg0.field161;
			int var3 = field552 - arg0.field161;
			int var4 = arg0.field157 * 128 + arg0.field156 * 64;
			int var5 = arg0.field159 * 128 + arg0.field156 * 64;
			int var6 = arg0.field158 * 128 + arg0.field156 * 64;
			int var7 = arg0.field160 * 128 + arg0.field156 * 64;
			arg0.field191 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field192 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field155 = 0;

		if (arg0.field163 == 0) {
			arg0.field194 = 1024;
		}

		if (arg0.field163 == 1) {
			arg0.field194 = 1536;
		}

		if (arg0.field163 == 2) {
			arg0.field194 = 0;
		}

		if (arg0.field163 == 3) {
			arg0.field194 = 512;
		}

		arg0.field193 = arg0.field194;
	}

	@ObfuscatedName("client.a(LCELKGLWS;I)V")
	public final void method127(CELKGLWS arg0) {
		arg0.field145 = arg0.field195;
		if (arg0.field173 == 0) {
			arg0.field155 = 0;
		} else {
			if (arg0.field183 != -1 && arg0.field186 == 0) {
				XETSOHUA var2 = XETSOHUA.field1474[arg0.field183];
				if (arg0.field176 > 0 && var2.field1486 == 0) {
					arg0.field155++;
					return;
				}

				if (arg0.field176 <= 0 && var2.field1487 == 0) {
					arg0.field155++;
					return;
				}
			}

			int var3 = arg0.field191;
			int var4 = arg0.field192;
			int var5 = arg0.field143[arg0.field173 - 1] * 128 + arg0.field156 * 64;
			int var6 = arg0.field144[arg0.field173 - 1] * 128 + arg0.field156 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field194 = 1280;
					} else if (var4 > var6) {
						arg0.field194 = 1792;
					} else {
						arg0.field194 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field194 = 768;
					} else if (var4 > var6) {
						arg0.field194 = 256;
					} else {
						arg0.field194 = 512;
					}
				} else if (var4 < var6) {
					arg0.field194 = 1024;
				} else {
					arg0.field194 = 0;
				}

				int var7 = arg0.field194 - arg0.field193 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field149;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field148;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field151;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field150;
				}

				if (var8 == -1) {
					var8 = arg0.field148;
				}

				arg0.field145 = var8;
				int var9 = 4;
				if (arg0.field194 != arg0.field193 && arg0.field197 == -1 && arg0.field181 != 0) {
					var9 = 2;
				}

				if (arg0.field173 > 2) {
					var9 = 6;
				}

				if (arg0.field173 > 3) {
					var9 = 8;
				}

				if (arg0.field155 > 0 && arg0.field173 > 1) {
					var9 = 8;
					arg0.field155--;
				}

				if (arg0.field152[arg0.field173 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field148 == arg0.field145 && arg0.field189 != -1) {
					arg0.field145 = arg0.field189;
				}

				if (var3 < var5) {
					arg0.field191 += var9;
					if (arg0.field191 > var5) {
						arg0.field191 = var5;
					}
				} else if (var3 > var5) {
					arg0.field191 -= var9;
					if (arg0.field191 < var5) {
						arg0.field191 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field192 += var9;
					if (arg0.field192 > var6) {
						arg0.field192 = var6;
					}
				} else if (var4 > var6) {
					arg0.field192 -= var9;
					if (arg0.field192 < var6) {
						arg0.field192 = var6;
					}
				}

				if (arg0.field191 == var5 && arg0.field192 == var6) {
					arg0.field173--;

					if (arg0.field176 > 0) {
						arg0.field176--;
						return;
					}
				}
			} else {
				arg0.field191 = var5;
				arg0.field192 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILCELKGLWS;)V")
	public final void method128(CELKGLWS arg0) {
		if (arg0.field181 != 0) {
			if (arg0.field197 != -1 && arg0.field197 < 32768) {
				PVFNGMTQ var2 = field360[arg0.field197];
				if (var2 != null) {
					int var3 = arg0.field191 - var2.field191;
					int var4 = arg0.field192 - var2.field192;
					if (var3 != 0 || var4 != 0) {
						arg0.field194 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field197 >= 32768) {
				int var5 = arg0.field197 - 32768;
				if (field263 == var5) {
					var5 = field429;
				}

				SRMWIYVM var6 = field430[var5];
				if (var6 != null) {
					int var7 = arg0.field191 - var6.field191;
					int var8 = arg0.field192 - var6.field192;
					if (var7 != 0 || var8 != 0) {
						arg0.field194 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field153 != 0 || arg0.field154 != 0) && (arg0.field173 == 0 || arg0.field155 > 0)) {
				int var9 = arg0.field191 - (arg0.field153 - field487 - field487) * 64;
				int var10 = arg0.field192 - (arg0.field154 - field488 - field488) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field194 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field153 = 0;
				arg0.field154 = 0;
			}

			int var11 = arg0.field194 - arg0.field193 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field181 || var11 > 2048 - arg0.field181) {
					arg0.field193 = arg0.field194;
				} else if (var11 > 1024) {
					arg0.field193 -= arg0.field181;
				} else {
					arg0.field193 += arg0.field181;
				}

				arg0.field193 &= 0x7FF;
				if (arg0.field195 == arg0.field145 && arg0.field194 != arg0.field193) {
					if (arg0.field196 != -1) {
						arg0.field145 = arg0.field196;
						return;
					}

					arg0.field145 = arg0.field148;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILCELKGLWS;)V")
	public final void method129(CELKGLWS arg0) {
		arg0.field182 = false;

		if (arg0.field145 != -1) {
			XETSOHUA var2 = XETSOHUA.field1474[arg0.field145];
			arg0.field147++;
			if (arg0.field146 < var2.field1475 && arg0.field147 > var2.method567(arg0.field146)) {
				arg0.field147 = 0;
				arg0.field146++;
			}

			if (arg0.field146 >= var2.field1475) {
				arg0.field147 = 0;
				arg0.field146 = 0;
			}
		}

		if (arg0.field165 != -1 && field552 >= arg0.field168) {
			if (arg0.field166 < 0) {
				arg0.field166 = 0;
			}

			XETSOHUA var3 = XBHNZKGU.field1435[arg0.field165].field1439;
			arg0.field167++;
			while (arg0.field166 < var3.field1475 && arg0.field167 > var3.method567(arg0.field166)) {
				arg0.field167 -= var3.method567(arg0.field166);
				arg0.field166++;
			}

			if (arg0.field166 >= var3.field1475 && (arg0.field166 < 0 || arg0.field166 >= var3.field1475)) {
				arg0.field165 = -1;
			}
		}

		if (arg0.field183 != -1 && arg0.field186 <= 1) {
			XETSOHUA var4 = XETSOHUA.field1474[arg0.field183];
			if (var4.field1486 == 1 && arg0.field176 > 0 && arg0.field161 <= field552 && arg0.field162 < field552) {
				arg0.field186 = 1;
				return;
			}
		}

		if (arg0.field183 != -1 && arg0.field186 == 0) {
			XETSOHUA var5 = XETSOHUA.field1474[arg0.field183];
			arg0.field185++;
			while (arg0.field184 < var5.field1475 && arg0.field185 > var5.method567(arg0.field184)) {
				arg0.field185 -= var5.method567(arg0.field184);
				arg0.field184++;
			}

			if (arg0.field184 >= var5.field1475) {
				arg0.field184 -= var5.field1479;
				arg0.field187++;
				if (arg0.field187 >= var5.field1485) {
					arg0.field183 = -1;
				}

				if (arg0.field184 < 0 || arg0.field184 >= var5.field1475) {
					arg0.field183 = -1;
				}
			}

			arg0.field182 = var5.field1481;
		}

		if (arg0.field186 > 0) {
			arg0.field186--;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method130() {
		if (field522 == -1 || field591 != 2 && field72 == null) {
			if (field624) {
				method121();
				field624 = false;
				field462.method274(field71, 0, 4);
				field463.method274(field71, 0, 357);
				field464.method274(field71, 722, 4);
				field465.method274(field71, 743, 205);
				field466.method274(field71, 0, 0);
				field467.method274(field71, 516, 4);
				field468.method274(field71, 516, 205);
				field469.method274(field71, 496, 357);
				field470.method274(field71, 0, 338);
				field314 = true;
				field578 = true;
				field302 = true;
				field517 = true;

				if (field591 != 2) {
					field504.method274(field71, 4, 4);
					field503.method274(field71, 550, 4);
				}
			}

			if (field591 == 2) {
				method144();
			}

			if (field348 && field402 == 1) {
				field314 = true;
			}

			if (field282 != -1) {
				boolean var3 = method57(field498, field282);
				if (var3) {
					field314 = true;
				}
			}

			if (field422 == 2) {
				field314 = true;
			}

			if (field484 == 2) {
				field314 = true;
			}

			if (field314) {
				method160();
				field314 = false;
			}

			if (field287 == -1 && field455 == 0) {
				field370.field990 = field507 - field614 - 77;

				if (field79 > 448 && field79 < 560 && field80 > 332) {
					method99(77, 463, field370, field79 - 17, field80 - 357, 0, field507, -1);
				}

				int var4 = field507 - field370.field990 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field507 - 77) {
					var4 = field507 - 77;
				}

				if (field614 != var4) {
					field614 = var4;
					field578 = true;
				}
			}

			if (field287 == -1 && field455 == 3) {
				int var5 = field246 * 14 + 7;
				field370.field990 = field249;

				if (field79 > 448 && field79 < 560 && field80 > 332) {
					method99(77, 463, field370, field79 - 17, field80 - 357, 0, var5, -1);
				}

				int var6 = field370.field990;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field249 != var6) {
					field249 = var6;
					field578 = true;
				}
			}

			if (field287 != -1) {
				boolean var7 = method57(field498, field287);
				if (var7) {
					field578 = true;
				}
			}

			if (field422 == 3) {
				field578 = true;
			}

			if (field484 == 3) {
				field578 = true;
			}

			if (field629 != null) {
				field578 = true;
			}

			if (field348 && field402 == 2) {
				field578 = true;
			}

			if (field578) {
				method148();
				field578 = false;
			}

			if (field591 == 2) {
				method52();
				field503.method274(field71, 550, 4);
			}

			if (field281 != -1) {
				field302 = true;
			}

			if (field302) {
				if (field281 != -1 && field281 == field261) {
					field281 = -1;
					field210.method504(22);
					field210.method505(field261);
				}

				field302 = false;
				field393.method273();
				field618.method369(0, 0);

				if (field282 == -1) {
					if (field491[field261] != -1) {
						if (field261 == 0) {
							field492.method369(22, 10);
						}

						if (field261 == 1) {
							field493.method369(54, 8);
						}

						if (field261 == 2) {
							field493.method369(82, 8);
						}

						if (field261 == 3) {
							field494.method369(110, 8);
						}

						if (field261 == 4) {
							field496.method369(153, 8);
						}

						if (field261 == 5) {
							field496.method369(181, 8);
						}

						if (field261 == 6) {
							field495.method369(209, 9);
						}
					}

					if (field491[0] != -1 && (field281 != 0 || field552 % 20 < 10)) {
						field285[0].method369(29, 13);
					}

					if (field491[1] != -1 && (field281 != 1 || field552 % 20 < 10)) {
						field285[1].method369(53, 11);
					}

					if (field491[2] != -1 && (field281 != 2 || field552 % 20 < 10)) {
						field285[2].method369(82, 11);
					}

					if (field491[3] != -1 && (field281 != 3 || field552 % 20 < 10)) {
						field285[3].method369(115, 12);
					}

					if (field491[4] != -1 && (field281 != 4 || field552 % 20 < 10)) {
						field285[4].method369(153, 13);
					}

					if (field491[5] != -1 && (field281 != 5 || field552 % 20 < 10)) {
						field285[5].method369(180, 11);
					}

					if (field491[6] != -1 && (field281 != 6 || field552 % 20 < 10)) {
						field285[6].method369(208, 13);
					}
				}

				field393.method274(field71, 516, 160);
				field541++;
				if (field541 > 1132) {
					field541 = 0;
					field210.method504(138);
					field210.method505(0);
					int var8 = field210.field1401;
					field210.method506(39349);

					if ((int) (Math.random() * 2.0D) == 0) {
						field210.method506(14942);
					}

					field210.method506((int) (Math.random() * 65536.0D));
					field210.method506((int) (Math.random() * 65536.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field210.method505(75);
					}

					field210.method506(61516);

					if ((int) (Math.random() * 2.0D) == 0) {
						field210.method506(4375);
					}

					field210.method505(97);

					if ((int) (Math.random() * 2.0D) == 0) {
						field210.method506(29661);
					}

					field210.method506(5785);
					field210.method514(field210.field1401 - var8);
				}

				field392.method273();
				field617.method369(0, 0);

				if (field282 == -1) {
					if (field491[field261] != -1) {
						if (field261 == 7) {
							field306.method369(42, 0);
						}

						if (field261 == 8) {
							field307.method369(74, 0);
						}

						if (field261 == 9) {
							field307.method369(102, 0);
						}

						if (field261 == 10) {
							field308.method369(130, 1);
						}

						if (field261 == 11) {
							field310.method369(173, 0);
						}

						if (field261 == 12) {
							field310.method369(201, 0);
						}

						if (field261 == 13) {
							field309.method369(229, 0);
						}
					}

					if (field491[8] != -1 && (field281 != 8 || field552 % 20 < 10)) {
						field285[7].method369(74, 2);
					}

					if (field491[9] != -1 && (field281 != 9 || field552 % 20 < 10)) {
						field285[8].method369(102, 3);
					}

					if (field491[10] != -1 && (field281 != 10 || field552 % 20 < 10)) {
						field285[9].method369(137, 4);
					}

					if (field491[11] != -1 && (field281 != 11 || field552 % 20 < 10)) {
						field285[10].method369(174, 2);
					}

					if (field491[12] != -1 && (field281 != 12 || field552 % 20 < 10)) {
						field285[11].method369(201, 2);
					}

					if (field491[13] != -1 && (field281 != 13 || field552 % 20 < 10)) {
						field285[12].method369(226, 2);
					}
				}

				field392.method274(field71, 496, 466);
				field504.method273();
				PIHSODZS.field1196 = field328;
			}

			if (field517) {
				field517 = false;
				field391.method273();
				field616.method369(0, 0);
				field415.method590(0xFFFFFF, true, "Public chat", 55, 28);

				if (field384 == 0) {
					field415.method590(0xFF00, true, "On", 55, 41);
				}

				if (field384 == 1) {
					field415.method590(0xFFFF00, true, "Friends", 55, 41);
				}

				if (field384 == 2) {
					field415.method590(0xFF0000, true, "Off", 55, 41);
				}

				if (field384 == 3) {
					field415.method590(0xFFFF, true, "Hide", 55, 41);
				}

				field415.method590(0xFFFFFF, true, "Private chat", 184, 28);

				if (field283 == 0) {
					field415.method590(0xFF00, true, "On", 184, 41);
				}

				if (field283 == 1) {
					field415.method590(0xFFFF00, true, "Friends", 184, 41);
				}

				if (field283 == 2) {
					field415.method590(0xFF0000, true, "Off", 184, 41);
				}

				field415.method590(0xFFFFFF, true, "Trade/compete", 324, 28);

				if (field538 == 0) {
					field415.method590(0xFF00, true, "On", 324, 41);
				}

				if (field538 == 1) {
					field415.method590(0xFFFF00, true, "Friends", 324, 41);
				}

				if (field538 == 2) {
					field415.method590(0xFF0000, true, "Off", 324, 41);
				}

				field415.method590(0xFFFFFF, true, "Report abuse", 458, 33);
				field391.method274(field71, 0, 453);
				field504.method273();
				PIHSODZS.field1196 = field328;
			}

			field498 = 0;
		} else {
			if (field591 == 2) {
				method57(field498, field522);

				if (field442 != -1) {
					method57(field498, field442);
				}

				field498 = 0;
				method178();
				field72.method273();
				PIHSODZS.field1196 = field329;
				KPYGFVMA.method313();
				field624 = true;
				MRUJPFPS var1 = MRUJPFPS.method324(field522);
				if (var1.field989 == 512 && var1.field1009 == 334 && var1.field1025 == 0) {
					var1.field989 = 765;
					var1.field1009 = 503;
				}

				method85(0, 0, var1, 0);

				if (field442 != -1) {
					MRUJPFPS var2 = MRUJPFPS.method324(field442);
					if (var2.field989 == 512 && var2.field1009 == 334 && var2.field1025 == 0) {
						var2.field989 = 765;
						var2.field1009 = 503;
					}

					method85(0, 0, var2, 0);
				}

				if (field348) {
					method105();
				} else {
					method122();
					method166();
				}
			}

			field72.method274(field71, 0, 0);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method131() {
		if (field449 != 0) {
			YCYYIGLM var1 = field415;
			int var2 = 0;
			if (field349 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field640[var3] != null) {
					int var4 = field638[var3];
					String var5 = field639[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field283 == 0 || field283 == 1 && method63(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method593(0, var7, "From", var8);
						var1.method593(0xFFFF, var7 - 1, "From", var8);
						int var11 = var8 + var1.method591("From ");
						if (var6 == 1) {
							field553[0].method369(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field553[1].method369(var11, var7 - 12);
							var11 += 14;
						}

						var1.method593(0, var7, var5 + ": " + field640[var3], var11);
						var1.method593(0xFFFF, var7 - 1, var5 + ": " + field640[var3], var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field283 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method593(0, var9, field640[var3], 4);
						var1.method593(0xFFFF, var9 - 1, field640[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field283 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method593(0, var10, "To " + var5 + ": " + field640[var3], 4);
						var1.method593(0xFFFF, var10 - 1, "To " + var5 + ": " + field640[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method132() {
		try {
			int var1 = field338.field191 + field636;
			int var2 = field338.field192 + field606;
			if (field254 - var1 < -500 || field254 - var1 > 500 || field255 - var2 < -500 || field255 - var2 > 500) {
				field254 = var1;
				field255 = var2;
			}

			if (field254 != var1) {
				field254 += (var1 - field254) / 16;
			}

			if (field255 != var2) {
				field255 += (var2 - field255) / 16;
			}

			if (field89[1] == 1) {
				field526 += (-field526 - 24) / 2;
			} else if (field89[2] == 1) {
				field526 += (24 - field526) / 2;
			} else {
				field526 /= 2;
			}

			if (field89[3] == 1) {
				field527 += (12 - field527) / 2;
			} else if (field89[4] == 1) {
				field527 += (-field527 - 12) / 2;
			} else {
				field527 /= 2;
			}

			field525 = field526 / 2 + field525 & 0x7FF;
			field524 += field527 / 2;
			if (field524 < 128) {
				field524 = 128;
			}

			if (field524 > 383) {
				field524 = 383;
			}

			field221++;
			if (field221 > 1275) {
				field221 = 0;
				field210.method504(248);
				field210.method505(0);
				int var3 = field210.field1401;
				field210.method505(67);
				field210.method506((int) (Math.random() * 65536.0D));
				field210.method505(218);
				field210.method506(61710);
				field210.method506(50460);
				field210.method506((int) (Math.random() * 65536.0D));
				field210.method505(212);
				field210.method505((int) (Math.random() * 256.0D));
				field210.method505(223);

				if ((int) (Math.random() * 2.0D) == 0) {
					field210.method506(26572);
				}

				field210.method514(field210.field1401 - var3);
			}

			int var4 = field254 >> 7;
			int var5 = field255 >> 7;
			int var6 = method154(field592, field254, field255);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = field592;
						if (var10 < 3 && (field296[1][var8][var9] & 0x2) == 2) {
							var10++;
						}

						int var11 = var6 - field259[var10][var8][var9];
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

			if (var12 > field599) {
				field599 += (var12 - field599) / 24;
			} else if (var12 < field599) {
				field599 += (var12 - field599) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field338.field191 + "," + field338.field192 + "," + field254 + "," + field255 + "," + field204 + "," + field205 + "," + field487 + "," + field488);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method133() {
		int var1 = field416.method591("Choose Option");
		for (int var2 = 0; var2 < field627; var2++) {
			int var3 = field416.method591(field276[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field627 * 15 + 21;
		if (field86 > 4 && field87 > 4 && field86 < 516 && field87 < 338) {
			int var5 = field86 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field87 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field348 = true;
			field402 = 0;
			field403 = var5;
			field404 = var6;
			field405 = var1;
			field406 = field627 * 15 + 22;
		}

		if (field86 > 553 && field87 > 205 && field86 < 743 && field87 < 466) {
			int var7 = field86 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field87 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field348 = true;
			field402 = 1;
			field403 = var7;
			field404 = var8;
			field405 = var1;
			field406 = field627 * 15 + 22;
		}

		if (field86 > 17 && field87 > 357 && field86 < 496 && field87 < 453) {
			int var9 = field86 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field87 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field348 = true;
			field402 = 2;
			field403 = var9;
			field404 = var10;
			field405 = var1;
			field406 = field627 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method134(int arg0) {
		MRUJPFPS var2 = MRUJPFPS.method324(arg0);
		for (int var3 = 0; var3 < var2.field1032.length && var2.field1032[var3] != -1; var3++) {
			MRUJPFPS var4 = MRUJPFPS.method324(var2.field1032[var3]);
			if (var4.field1025 == 1) {
				method134(var4.field1040);
			}

			var4.field1056 = 0;
			var4.field994 = 0;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method135() {
		field545 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field620) {
				field218++;
				method165();
				method165();
				method147();
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

		field545 = false;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method136() {
		for (NZKYYWQJ var1 = (NZKYYWQJ) field547.method340(); var1 != null; var1 = (NZKYYWQJ) field547.method342()) {
			if (field592 != var1.field1102 || field552 > var1.field1095) {
				var1.method41();
			} else if (field552 >= var1.field1094) {
				if (var1.field1093 > 0) {
					PVFNGMTQ var2 = field360[var1.field1093 - 1];
					if (var2 != null && var2.field191 >= 0 && var2.field191 < 13312 && var2.field192 >= 0 && var2.field192 < 13312) {
						var1.method345(field552, method154(var1.field1102, var2.field191, var2.field192) - var1.field1106, var2.field192, var2.field191);
					}
				}

				if (var1.field1093 < 0) {
					int var3 = -var1.field1093 - 1;
					SRMWIYVM var4;
					if (field263 == var3) {
						var4 = field338;
					} else {
						var4 = field430[var3];
					}

					if (var4 != null && var4.field191 >= 0 && var4.field191 < 13312 && var4.field192 >= 0 && var4.field192 < 13312) {
						var1.method345(field552, method154(var1.field1102, var4.field191, var4.field192) - var1.field1106, var4.field192, var4.field191);
					}
				}

				var1.method346(field498);
				field603.method410(field592, -1, 60, var1, (int) var1.field1088, (int) var1.field1087, var1.field1085, (int) var1.field1089, false);
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method137() {
		while (true) {
			int var1 = method18();
			if (var1 == -1) {
				return;
			}

			if (field602 != -1 && field602 == field385) {
				if (var1 == 8 && field585.length() > 0) {
					field585 = field585.substring(0, field585.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field585.length() < 12) {
					field585 = field585 + (char) var1;
				}
			} else if (field250) {
				if (var1 >= 32 && var1 <= 122 && field511.length() < 80) {
					field511 = field511 + (char) var1;
					field578 = true;
				}

				if (var1 == 8 && field511.length() > 0) {
					field511 = field511.substring(0, field511.length() - 1);
					field578 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field250 = false;
					field578 = true;

					if (field551 == 1) {
						long var2 = XLAXYQGJ.method578(field511);
						method92(var2);
					}

					if (field551 == 2 && field554 > 0) {
						long var4 = XLAXYQGJ.method578(field511);
						method50(var4);
					}

					if (field551 == 3 && field511.length() > 0) {
						field210.method504(39);
						field210.method505(0);
						int var6 = field210.field1401;
						field210.method511(field321);
						IWFUJXTN.method298(field210, field511);
						field210.method514(field210.field1401 - var6);
						field511 = IWFUJXTN.method299(field511);
						field511 = TONKJGVS.method467(field511);
						method175(6, field511, XLAXYQGJ.method582(XLAXYQGJ.method579(field321)));

						if (field283 == 2) {
							field283 = 1;
							field517 = true;
							field210.method504(102);
							field210.method505(field384);
							field210.method505(field283);
							field210.method505(field538);
						}
					}

					if (field551 == 4 && field277 < 100) {
						long var7 = XLAXYQGJ.method578(field511);
						method141(var7);
					}

					if (field551 == 5 && field277 > 0) {
						long var9 = XLAXYQGJ.method578(field511);
						method93(var9);
					}
				}
			} else if (field455 == 1) {
				if (var1 >= 48 && var1 <= 57 && field451.length() < 10) {
					field451 = field451 + (char) var1;
					field578 = true;
				}

				if (var1 == 8 && field451.length() > 0) {
					field451 = field451.substring(0, field451.length() - 1);
					field578 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field451.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field451);
						} catch (Exception var21) {
						}

						field210.method504(245);
						field210.method509(var11);
					}

					field455 = 0;
					field578 = true;
				}
			} else if (field455 == 2) {
				if (var1 >= 32 && var1 <= 122 && field451.length() < 12) {
					field451 = field451 + (char) var1;
					field578 = true;
				}

				if (var1 == 8 && field451.length() > 0) {
					field451 = field451.substring(0, field451.length() - 1);
					field578 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field451.length() > 0) {
						field210.method504(188);
						field210.method511(XLAXYQGJ.method578(field451));
					}

					field455 = 0;
					field578 = true;
				}
			} else if (field455 == 3) {
				if (var1 >= 32 && var1 <= 122 && field451.length() < 40) {
					field451 = field451 + (char) var1;
					field578 = true;
				}

				if (var1 == 8 && field451.length() > 0) {
					field451 = field451.substring(0, field451.length() - 1);
					field578 = true;
				}
			} else if (field287 == -1 && field522 == -1) {
				if (var1 >= 32 && var1 <= 122 && field450.length() < 80) {
					field450 = field450 + (char) var1;
					field578 = true;
				}

				if (var1 == 8 && field450.length() > 0) {
					field450 = field450.substring(0, field450.length() - 1);
					field578 = true;
				}

				if ((var1 == 13 || var1 == 10) && field450.length() > 0) {
					if (field471 == 2) {
						if (field450.equals("::clientdrop")) {
							method65();
						}

						if (field450.equals("::lag")) {
							method168();
						}

						if (field450.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field633.method293(2); var12++) {
								field633.method284(2, var12, (byte) 1);
							}
						}

						if (field450.equals("::fpson")) {
							field438 = true;
						}

						if (field450.equals("::fpsoff")) {
							field438 = false;
						}

						if (field450.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field299[var13].field120[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field450.startsWith("::")) {
						field210.method504(200);
						field210.method505(field450.length() - 1);
						field210.method512(field450.substring(2));
					} else {
						String var16 = field450.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field450 = field450.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field450 = field450.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field450 = field450.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field450 = field450.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field450 = field450.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field450 = field450.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field450 = field450.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field450 = field450.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field450 = field450.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field450 = field450.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field450 = field450.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field450 = field450.substring(6);
						}

						String var18 = field450.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field450 = field450.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field450 = field450.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field450 = field450.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field450 = field450.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field450 = field450.substring(6);
						}

						field210.method504(7);
						field210.method505(0);
						int var20 = field210.field1401;
						field359.field1401 = 0;
						IWFUJXTN.method298(field359, field450);
						field210.method551(field359.field1400, field359.field1401, 0);
						field210.method531(var19);
						field210.method531(var17);
						field210.method514(field210.field1401 - var20);
						field450 = IWFUJXTN.method299(field450);
						field450 = TONKJGVS.method467(field450);
						field338.field188 = field450;
						field338.field177 = var17;
						field338.field175 = var19;
						field338.field174 = 150;

						if (field471 == 2) {
							method175(2, field338.field188, "@cr2@" + field338.field1371);
						} else if (field471 == 1) {
							method175(2, field338.field188, "@cr1@" + field338.field1371);
						} else {
							method175(2, field338.field188, field338.field1371);
						}

						if (field384 == 2) {
							field384 = 3;
							field517 = true;
							field210.method504(102);
							field210.method505(field384);
							field210.method505(field283);
							field210.method505(field538);
						}
					}

					field450 = "";
					field578 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method26(int arg0, String arg1) {
		field437 = arg0;
		field206 = arg1;
		method80();

		if (field539 == null) {
			super.method26(arg0, arg1);
		} else {
			field530.method273();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field416.method589(var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			KPYGFVMA.method316(304, var6, 34, var3 / 2 - 152, 0x8C1111);
			KPYGFVMA.method316(302, var6 + 1, 32, var3 / 2 - 151, 0);
			KPYGFVMA.method315(0x8C1111, var3 / 2 - 150, var6 + 2, 30, arg0 * 3);
			KPYGFVMA.method315(0, arg0 * 3 + var3 / 2 - 150, var6 + 2, 30, 300 - arg0 * 3);
			field416.method589(var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2, arg1);
			field530.method274(field71, 202, 171);

			if (field624) {
				field624 = false;

				if (!field620) {
					field531.method274(field71, 0, 0);
					field532.method274(field71, 637, 0);
				}

				field528.method274(field71, 128, 0);
				field529.method274(field71, 202, 371);
				field533.method274(field71, 0, 265);
				field534.method274(field71, 562, 265);
				field535.method274(field71, 128, 171);
				field536.method274(field71, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.a(LOSRLSEOB;I)V")
	public final void method138(OSRLSEOB arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field372.length; var3++) {
			field372[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field372[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field373[var9] = (field372[var9 - 1] + field372[var9 + 1] + field372[var9 - 128] + field372[var9 + 128]) / 4;
				}
			}

			int[] var10 = field372;
			field372 = field373;
			field373 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1143; var12++) {
				for (int var13 = 0; var13 < arg0.field1142; var13++) {
					if (arg0.field1140[var11++] != 0) {
						int var14 = var13 + arg0.field1144 + 16;
						int var15 = var12 + arg0.field1145 + 16;
						int var16 = (var15 << 7) + var14;
						field372[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field300.method369(arg3, arg2);
		field301.method369(arg3, arg2 + arg4 - 16);
		KPYGFVMA.method315(field273, arg3, arg2 + 16, arg4 - 32, 16);
		int var6 = (arg4 - 32) * arg4 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg1 / (arg0 - arg4);
		KPYGFVMA.method315(field456, arg3, arg2 + var7 + 16, var6, 16);
		KPYGFVMA.method320(arg3, field229, arg2 + var7 + 16, var6);
		KPYGFVMA.method320(arg3 + 1, field229, arg2 + var7 + 16, var6);
		KPYGFVMA.method318(arg2 + var7 + 16, 16, arg3, field229);
		KPYGFVMA.method318(arg2 + var7 + 17, 16, arg3, field229);
		KPYGFVMA.method320(arg3 + 15, field278, arg2 + var7 + 16, var6);
		KPYGFVMA.method320(arg3 + 14, field278, arg2 + var7 + 17, var6 - 1);
		KPYGFVMA.method318(arg2 + var7 + var6 + 15, 16, arg3, field278);
		KPYGFVMA.method318(arg2 + var7 + var6 + 14, 15, arg3 + 1, field278);
	}

	@ObfuscatedName("client.e(B)V")
	public final void method140() {
		for (int var1 = -1; var1 < field431; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field429;
			} else {
				var2 = field432[var1];
			}

			SRMWIYVM var3 = field430[var2];
			if (var3 != null && var3.field174 > 0) {
				var3.field174--;
				if (var3.field174 == 0) {
					var3.field188 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field361; var4++) {
			int var5 = field362[var4];
			PVFNGMTQ var6 = field360[var5];
			if (var6 != null && var6.field174 > 0) {
				var6.field174--;
				if (var6.field174 == 0) {
					var6.field188 = null;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 369);

			if (arg0.length == 5) {
				field366 = Integer.parseInt(arg0[0]);
				field367 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method64();
				} else if (arg0[2].equals("highmem")) {
					method72();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field368 = false;
				} else if (arg0[3].equals("members")) {
					field368 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method14(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			if (field277 >= 100) {
				method175(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = XLAXYQGJ.method582(XLAXYQGJ.method579(arg0));
				for (int var4 = 0; var4 < field277; var4++) {
					if (field343[var4] == arg0) {
						method175(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field554; var5++) {
					if (field200[var5] == arg0) {
						method175(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field343[field277++] = arg0;
				field314 = true;
				field210.method504(108);
				field210.method511(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IBLWBEWPIXO;)V")
	public final void method142(int arg0, WBEWPIXO arg1) {
		if (arg0 == 138) {
			int var3 = arg1.method515();
			int var4 = (var3 >> 4 & 0x7) + field201;
			int var5 = (var3 & 0x7) + field202;
			int var6 = arg1.method517();
			int var7 = arg1.method515();
			int var8 = var7 >> 4 & 0xF;
			int var9 = var7 & 0x7;
			if (field338.field143[0] >= var4 - var8 && field338.field143[0] <= var4 + var8 && field338.field144[0] >= var5 - var8 && field338.field144[0] <= var5 + var8 && field286 && !field369 && field601 < 50) {
				field446[field601] = var6;
				field364[field601] = var9;
				field625[field601] = VKAZQVPD.field1394[var6];
				field601++;
			}
		}

		if (arg0 == 225) {
			int var10 = arg1.method517();
			int var11 = arg1.method543();
			int var12 = arg1.method534();
			int var13 = (var12 >> 4 & 0x7) + field201;
			int var14 = (var12 & 0x7) + field202;
			int var15 = arg1.method517();
			if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && field263 != var10) {
				RLKSHOQT var16 = new RLKSHOQT();
				var16.field1329 = var15;
				var16.field1328 = var11;

				if (field363[field592][var13][var14] == null) {
					field363[field592][var13][var14] = new NYZQPNXB();
				}

				field363[field592][var13][var14].method337(var16);
				method112(var13, var14);
			}
		} else if (arg0 == 119) {
			int var17 = arg1.method515();
			int var18 = (var17 >> 4 & 0x7) + field201;
			int var19 = (var17 & 0x7) + field202;
			int var20 = arg1.method517();
			int var21 = arg1.method517();
			int var22 = arg1.method517();
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
				NYZQPNXB var23 = field363[field592][var18][var19];
				if (var23 != null) {
					for (RLKSHOQT var24 = (RLKSHOQT) var23.method340(); var24 != null; var24 = (RLKSHOQT) var23.method342()) {
						if ((var20 & 0x7FFF) == var24.field1329 && var24.field1328 == var21) {
							var24.field1328 = var22;
							break;
						}
					}

					method112(var18, var19);
				}
			}
		} else if (arg0 == 250) {
			int var25 = arg1.method515();
			int var26 = (var25 >> 4 & 0x7) + field201;
			int var27 = (var25 & 0x7) + field202;
			int var28 = arg1.method517();
			int var29 = arg1.method515();
			int var30 = arg1.method517();
			if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
				var26 = var26 * 128 + 64;
				var27 = var27 * 128 + 64;
				CMOSDPGZ var31 = new CMOSDPGZ(method154(field592, var26, var27) - var29, var26, field552, var28, field592, var30, var27);
				field441.method337(var31);
			}
		} else if (arg0 == 210) {
			int var32 = arg1.method543();
			int var33 = arg1.method533();
			int var34 = (var33 >> 4 & 0x7) + field201;
			int var35 = (var33 & 0x7) + field202;
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				NYZQPNXB var36 = field363[field592][var34][var35];
				if (var36 != null) {
					for (RLKSHOQT var37 = (RLKSHOQT) var36.method340(); var37 != null; var37 = (RLKSHOQT) var36.method342()) {
						if ((var32 & 0x7FFF) == var37.field1329) {
							var37.method41();
							break;
						}
					}

					if (var36.method340() == null) {
						field363[field592][var34][var35] = null;
					}

					method112(var34, var35);
				}
			}
		} else if (arg0 == 150) {
			int var38 = arg1.method515();
			int var39 = (var38 >> 4 & 0x7) + field201;
			int var40 = (var38 & 0x7) + field202;
			int var41 = arg1.method534();
			int var42 = var41 >> 2;
			int var43 = var41 & 0x3;
			int var44 = field251[var42];
			if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
				method62(-1, var43, var44, field592, -1, var39, 0, var40, var42);
			}
		} else if (arg0 == 190) {
			int var45 = arg1.method515();
			int var46 = (var45 >> 4 & 0x7) + field201;
			int var47 = (var45 & 0x7) + field202;
			int var48 = var46 + arg1.method516();
			int var49 = var47 + arg1.method516();
			int var50 = arg1.method518();
			int var51 = arg1.method517();
			int var52 = arg1.method515() * 4;
			int var53 = arg1.method515() * 4;
			int var54 = arg1.method517();
			int var55 = arg1.method517();
			int var56 = arg1.method515();
			int var57 = arg1.method515();
			if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var51 != 0xFFFF) {
				var46 = var46 * 128 + 64;
				var47 = var47 * 128 + 64;
				var48 = var48 * 128 + 64;
				var49 = var49 * 128 + 64;
				NZKYYWQJ var58 = new NZKYYWQJ(var56, field552 + var55, field592, var51, var50, var47, var53, method154(field592, var46, var47) - var52, var46, field552 + var54, var57);
				var58.method345(field552 + var54, method154(field592, var48, var49) - var53, var49, var48);
				field547.method337(var58);
			}
		} else if (arg0 == 205) {
			int var59 = arg1.method532();
			int var60 = var59 >> 2;
			int var61 = var59 & 0x3;
			int var62 = field251[var60];
			int var63 = arg1.method534();
			int var64 = (var63 >> 4 & 0x7) + field201;
			int var65 = (var63 & 0x7) + field202;
			int var66 = arg1.method543();
			if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
				method62(-1, var61, var62, field592, var66, var64, 0, var65, var60);
			}
		} else {
			if (arg0 == 149) {
				byte var67 = arg1.method537();
				byte var68 = arg1.method537();
				int var69 = arg1.method517();
				int var70 = arg1.method542();
				byte var71 = arg1.method516();
				int var72 = arg1.method532();
				int var73 = var72 >> 2;
				int var74 = var72 & 0x3;
				int var75 = field251[var73];
				int var76 = arg1.method543();
				int var77 = arg1.method515();
				int var78 = (var77 >> 4 & 0x7) + field201;
				int var79 = (var77 & 0x7) + field202;
				byte var80 = arg1.method535();
				int var81 = arg1.method517();
				SRMWIYVM var82;
				if (field263 == var69) {
					var82 = field338;
				} else {
					var82 = field430[var69];
				}

				if (var82 != null) {
					FUIMNWOZ var83 = FUIMNWOZ.method246(var81);
					int var84 = field259[field592][var78][var79];
					int var85 = field259[field592][var78 + 1][var79];
					int var86 = field259[field592][var78 + 1][var79 + 1];
					int var87 = field259[field592][var78][var79 + 1];
					FCIDIKVY var88 = var83.method244(var73, var74, var84, var85, var86, var87, -1);
					if (var88 != null) {
						method62(var76 + 1, 0, var75, field592, -1, var78, var70 + 1, var79, 0);
						var82.field1360 = field552 + var70;
						var82.field1361 = field552 + var76;
						var82.field1369 = var88;
						int var89 = var83.field814;
						int var90 = var83.field804;
						if (var74 == 1 || var74 == 3) {
							var89 = var83.field804;
							var90 = var83.field814;
						}

						var82.field1366 = var78 * 128 + var89 * 64;
						var82.field1368 = var79 * 128 + var90 * 64;
						var82.field1367 = method154(field592, var82.field1366, var82.field1368);

						if (var67 > var71) {
							byte var91 = var67;
							var67 = var71;
							var71 = var91;
						}

						if (var68 > var80) {
							byte var92 = var68;
							var68 = var80;
							var80 = var92;
						}

						var82.field1348 = var67 + var78;
						var82.field1350 = var71 + var78;
						var82.field1349 = var68 + var79;
						var82.field1351 = var79 + var80;
					}
				}
			}

			if (arg0 == 135) {
				int var93 = arg1.method534();
				int var94 = (var93 >> 4 & 0x7) + field201;
				int var95 = (var93 & 0x7) + field202;
				int var96 = arg1.method534();
				int var97 = var96 >> 2;
				int var98 = var96 & 0x3;
				int var99 = field251[var97];
				int var100 = arg1.method517();
				if (var94 >= 0 && var95 >= 0 && var94 < 103 && var95 < 103) {
					int var101 = field259[field592][var94][var95];
					int var102 = field259[field592][var94 + 1][var95];
					int var103 = field259[field592][var94 + 1][var95 + 1];
					int var104 = field259[field592][var94][var95 + 1];
					if (var99 == 0) {
						XECYLTDH var105 = field603.method421(var95, field592, var94);
						if (var105 != null) {
							int var106 = var105.field1471 >> 14 & 0x7FFF;
							if (var97 == 2) {
								var105.field1469 = new XEVZUZBV(var102, false, var106, var100, var104, var101, var98 + 4, var103, 2);
								var105.field1470 = new XEVZUZBV(var102, false, var106, var100, var104, var101, var98 + 1 & 0x3, var103, 2);
							} else {
								var105.field1469 = new XEVZUZBV(var102, false, var106, var100, var104, var101, var98, var103, var97);
							}
						}
					}

					if (var99 == 1) {
						DSOXQJRF var107 = field603.method422(var94, field592, var95);
						if (var107 != null) {
							var107.field674 = new XEVZUZBV(var102, false, var107.field675 >> 14 & 0x7FFF, var100, var104, var101, 0, var103, 4);
						}
					}

					if (var99 == 2) {
						AFSVARSH var108 = field603.method423(var94, var95, field592);

						if (var97 == 11) {
							var97 = 10;
						}

						if (var108 != null) {
							var108.field53 = new XEVZUZBV(var102, false, var108.field61 >> 14 & 0x7FFF, var100, var104, var101, var98, var103, var97);
						}
					}

					if (var99 == 3) {
						FXGGLRVN var109 = field603.method424(var95, var94, field592);
						if (var109 != null) {
							var109.field818 = new XEVZUZBV(var102, false, var109.field819 >> 14 & 0x7FFF, var100, var104, var101, var98, var103, 22);
						}
					}
				}
			} else if (arg0 == 141) {
				int var110 = arg1.method517();
				int var111 = arg1.method517();
				int var112 = arg1.method515();
				int var113 = (var112 >> 4 & 0x7) + field201;
				int var114 = (var112 & 0x7) + field202;
				if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
					RLKSHOQT var115 = new RLKSHOQT();
					var115.field1329 = var110;
					var115.field1328 = var111;

					if (field363[field592][var113][var114] == null) {
						field363[field592][var113][var114] = new NYZQPNXB();
					}

					field363[field592][var113][var114].method337(var115);
					method112(var113, var114);
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method143() {
		if (field316 == 0 && field409 == 0) {
			field276[field627] = "Walk here";
			field267[field627] = 238;
			field265[field627] = field79;
			field266[field627] = field80;
			field627++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < FCIDIKVY.field745; var2++) {
			int var3 = FCIDIKVY.field746[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field603.method429(field592, var4, var5, var3) >= 0) {
					FUIMNWOZ var8 = FUIMNWOZ.method246(var7);
					if (var8.field771 != null) {
						var8 = var8.method238();
					}

					if (var8 == null) {
						continue;
					}

					if (field316 == 1) {
						field276[field627] = "Use " + field320 + " with @cya@" + var8.field797;
						field267[field627] = 544;
						field268[field627] = var3;
						field265[field627] = var4;
						field266[field627] = var5;
						field627++;
					} else if (field409 != 1) {
						if (var8.field802 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field802[var9] != null) {
									field276[field627] = var8.field802[var9] + " @cya@" + var8.field797;

									if (var9 == 0) {
										field267[field627] = 87;
									}

									if (var9 == 1) {
										field267[field627] = 570;
									}

									if (var9 == 2) {
										field267[field627] = 198;
									}

									if (var9 == 3) {
										field267[field627] = 334;
									}

									if (var9 == 4) {
										field267[field627] = 1313;
									}

									field268[field627] = var3;
									field265[field627] = var4;
									field266[field627] = var5;
									field627++;
								}
							}
						}

						field276[field627] = "Examine @cya@" + var8.field797;
						field267[field627] = 1764;
						field268[field627] = var8.field799 << 14;
						field265[field627] = var4;
						field266[field627] = var5;
						field627++;
					} else if ((field411 & 0x4) == 4) {
						field276[field627] = field412 + " @cya@" + var8.field797;
						field267[field627] = 689;
						field268[field627] = var3;
						field265[field627] = var4;
						field266[field627] = var5;
						field627++;
					}
				}

				if (var6 == 1) {
					PVFNGMTQ var10 = field360[var7];
					if (var10.field1245.field1229 == 1 && (var10.field191 & 0x7F) == 0x40 && (var10.field192 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field361; var11++) {
							PVFNGMTQ var12 = field360[field362[var11]];
							if (var12 != null && var10 != var12 && var12.field1245.field1229 == 1 && var10.field191 == var12.field191 && var10.field192 == var12.field192) {
								method56(var5, var4, field362[var11], var12.field1245);
							}
						}

						for (int var13 = 0; var13 < field431; var13++) {
							SRMWIYVM var14 = field430[field432[var13]];
							if (var14 != null && var10.field191 == var14.field191 && var10.field192 == var14.field192) {
								method49(var14, var5, field432[var13], var4);
							}
						}
					}

					method56(var5, var4, var7, var10.field1245);
				}

				if (var6 == 0) {
					SRMWIYVM var15 = field430[var7];
					if ((var15.field191 & 0x7F) == 0x40 && (var15.field192 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field361; var16++) {
							PVFNGMTQ var17 = field360[field362[var16]];
							if (var17 != null && var17.field1245.field1229 == 1 && var15.field191 == var17.field191 && var15.field192 == var17.field192) {
								method56(var5, var4, field362[var16], var17.field1245);
							}
						}

						for (int var18 = 0; var18 < field431; var18++) {
							SRMWIYVM var19 = field430[field432[var18]];
							if (var19 != null && var15 != var19 && var15.field191 == var19.field191 && var15.field192 == var19.field192) {
								method49(var19, var5, field432[var18], var4);
							}
						}
					}

					method49(var15, var5, var7, var4);
				}

				if (var6 == 3) {
					NYZQPNXB var20 = field363[field592][var4][var5];
					if (var20 != null) {
						for (RLKSHOQT var21 = (RLKSHOQT) var20.method341(); var21 != null; var21 = (RLKSHOQT) var20.method343()) {
							AAHIRSBF var22 = AAHIRSBF.method7(var21.field1329);
							if (field316 == 1) {
								field276[field627] = "Use " + field320 + " with @lre@" + var22.field19;
								field267[field627] = 555;
								field268[field627] = var21.field1329;
								field265[field627] = var4;
								field266[field627] = var5;
								field627++;
							} else if (field409 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field12 != null && var22.field12[var23] != null) {
										field276[field627] = var22.field12[var23] + " @lre@" + var22.field19;

										if (var23 == 0) {
											field267[field627] = 48;
										}

										if (var23 == 1) {
											field267[field627] = 639;
										}

										if (var23 == 2) {
											field267[field627] = 209;
										}

										if (var23 == 3) {
											field267[field627] = 624;
										}

										if (var23 == 4) {
											field267[field627] = 746;
										}

										field268[field627] = var21.field1329;
										field265[field627] = var4;
										field266[field627] = var5;
										field627++;
									} else if (var23 == 2) {
										field276[field627] = "Take @lre@" + var22.field19;
										field267[field627] = 209;
										field268[field627] = var21.field1329;
										field265[field627] = var4;
										field266[field627] = var5;
										field627++;
									}
								}

								field276[field627] = "Examine @lre@" + var22.field19;
								field267[field627] = 1805;
								field268[field627] = var21.field1329;
								field265[field627] = var4;
								field266[field627] = var5;
								field627++;
							} else if ((field411 & 0x1) == 1) {
								field276[field627] = field412 + " @lre@" + var22.field19;
								field267[field627] = 57;
								field268[field627] = var21.field1329;
								field265[field627] = var4;
								field266[field627] = var5;
								field627++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method144() {
		field383++;
		method107(true);
		method176(true);
		method107(false);
		method176(false);
		method136();
		method86();

		if (!field619) {
			int var1 = field524;
			if (field599 / 256 > var1) {
				var1 = field599 / 256;
			}

			if (field577[4] && field580[4] + 128 > var1) {
				var1 = field580[4] + 128;
			}

			int var2 = field525 + field387 & 0x7FF;
			method47(field255, var1 * 3 + 600, method154(field592, field338.field191, field338.field192) - 50, var1, var2, field254);
		}

		int var3;
		if (field619) {
			var3 = method118();
		} else {
			var3 = method117();
		}

		int var4 = field572;
		int var5 = field573;
		int var6 = field574;
		int var7 = field575;
		int var8 = field576;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field577[var9]) {
				int var10 = (int) (Math.random() * (field628[var9] * 2 + 1) + Math.sin(field593[var9] / 100.0D * field571[var9]) * field580[var9] - field628[var9]);
				if (var9 == 0) {
					field572 += var10;
				}

				if (var9 == 1) {
					field573 += var10;
				}

				if (var9 == 2) {
					field574 += var10;
				}

				if (var9 == 3) {
					field576 = field576 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field575 += var10;
					if (field575 < 128) {
						field575 = 128;
					}

					if (field575 > 383) {
						field575 = 383;
					}
				}
			}
		}

		int var11 = PIHSODZS.field1205;
		FCIDIKVY.field742 = true;
		FCIDIKVY.field745 = 0;
		FCIDIKVY.field743 = field79 - 4;
		FCIDIKVY.field744 = field80 - 4;
		KPYGFVMA.method313();
		field603.method438(field576, field573, field574, var3, field572, field575);
		field603.method413();
		method181();
		method169();
		method120(var11);
		method90();
		field504.method274(field71, 4, 4);
		field572 = var4;
		field573 = var5;
		field574 = var6;
		field575 = var7;
		field576 = var8;
	}

	@ObfuscatedName("client.I(I)Ljava/net/Socket;")
	public final Socket method145(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method146(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.J(I)V")
	public final void method147() {
		short var1 = 256;

		if (field472 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field472 > 768) {
					field581[var2] = method146(1024 - field472, field583[var2], field582[var2]);
				} else if (field472 > 256) {
					field581[var2] = field583[var2];
				} else {
					field581[var2] = method146(256 - field472, field582[var2], field583[var2]);
				}
			}
		} else if (field473 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field473 > 768) {
					field581[var3] = method146(1024 - field473, field584[var3], field582[var3]);
				} else if (field473 > 256) {
					field581[var3] = field584[var3];
				} else {
					field581[var3] = method146(256 - field473, field582[var3], field584[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field581[var4] = field582[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field531.field857[var5] = field252.field1133[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field611[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field311[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field581[var12];
					int var15 = field531.field857[var7];
					field531.field857[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field531.method274(field71, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field532.field857[var16] = field253.field1133[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field611[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field311[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field581[var23];
					int var26 = field532.field857[var18];
					field532.field857[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field532.method274(field71, 637, 0);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method148() {
		field505.method273();
		PIHSODZS.field1196 = field326;
		field427.method369(0, 0);

		if (field250) {
			field416.method589(40, 0, 239, field501);
			field416.method589(60, 128, 239, field511 + "*");
		} else if (field455 == 1) {
			field416.method589(40, 0, 239, "Enter amount:");
			field416.method589(60, 128, 239, field451 + "*");
		} else if (field455 == 2) {
			field416.method589(40, 0, 239, "Enter name:");
			field416.method589(60, 128, 239, field451 + "*");
		} else if (field455 == 3) {
			if (field451 != field245) {
				method87(field451);
				field245 = field451;
			}

			YCYYIGLM var1 = field415;
			KPYGFVMA.method312(0, 77, 463, 0);

			for (int var2 = 0; var2 < field246; var2++) {
				int var3 = var2 * 14 + 18 - field249;
				if (var3 > 0 && var3 < 110) {
					var1.method589(var3, 0, 239, field247[var2]);
				}
			}

			KPYGFVMA.method311();

			if (field246 > 5) {
				method139(field246 * 14 + 7, field249, 0, 463, 77);
			}

			if (field451.length() == 0) {
				field416.method589(40, 255, 239, "Enter object name");
			} else if (field246 == 0) {
				field416.method589(40, 0, 239, "No matching objects found, please shorten search");
			}

			var1.method589(90, 0, 239, field451 + "*");
			KPYGFVMA.method318(77, 479, 0, 0);
		} else if (field629 != null) {
			field416.method589(40, 0, 239, field629);
			field416.method589(60, 128, 239, "Click to continue");
		} else if (field287 != -1) {
			method85(0, 0, MRUJPFPS.method324(field287), 0);
		} else if (field479 == -1) {
			YCYYIGLM var4 = field415;
			int var5 = 0;
			KPYGFVMA.method312(0, 77, 463, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field640[var6] != null) {
					int var7 = field638[var6];
					int var8 = field614 + 70 - var5 * 14;
					String var9 = field639[var6];
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
							var4.method593(0, var8, field640[var6], 4);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field384 == 0 || field384 == 1 && method63(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field553[0].method369(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field553[1].method369(var11, var8 - 12);
								var11 += 14;
							}

							var4.method593(0, var8, var9 + ":", var11);
							var11 += var4.method591(var9) + 8;
							var4.method593(255, var8, field640[var6], var11);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field449 == 0 && (var7 == 7 || field283 == 0 || field283 == 1 && method63(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method593(0, var8, "From", var12);
							int var14 = var12 + var4.method591("From ");
							if (var10 == 1) {
								field553[0].method369(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field553[1].method369(var14, var8 - 12);
								var14 += 14;
							}

							var4.method593(0, var8, var9 + ":", var14);
							var14 += var4.method591(var9) + 8;
							var4.method593(0x800000, var8, field640[var6], var14);
						}

						var5++;
					}

					if (var7 == 4 && (field538 == 0 || field538 == 1 && method63(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(0x800080, var8, var9 + " " + field640[var6], 4);
						}

						var5++;
					}

					if (var7 == 5 && field449 == 0 && field283 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(0x800000, var8, field640[var6], 4);
						}

						var5++;
					}

					if (var7 == 6 && field449 == 0 && field283 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(0, var8, "To " + var9 + ":", 4);
							var4.method593(0x800000, var8, field640[var6], var4.method591("To " + var9) + 12);
						}

						var5++;
					}

					if (var7 == 8 && (field538 == 0 || field538 == 1 && method63(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(0x7E3200, var8, var9 + " " + field640[var6], 4);
						}

						var5++;
					}
				}
			}

			KPYGFVMA.method311();
			field507 = var5 * 14 + 7;
			if (field507 < 78) {
				field507 = 78;
			}

			method139(field507, field507 - field614 - 77, 0, 463, 77);
			String var13;
			if (field338 == null || field338.field1371 == null) {
				var13 = XLAXYQGJ.method582(field519);
			} else {
				var13 = field338.field1371;
			}

			var4.method593(0, 90, var13 + ":", 4);
			var4.method593(255, 90, field450 + "*", var4.method591(var13 + ": ") + 6);
			KPYGFVMA.method318(77, 479, 0, 0);
		} else {
			method85(0, 0, MRUJPFPS.method324(field479), 0);
		}

		if (field348 && field402 == 2) {
			method105();
		}

		field505.method274(field71, 17, 357);
		field504.method273();
		PIHSODZS.field1196 = field328;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(LCELKGLWS;BI)V")
	public final void method149(CELKGLWS arg0, int arg1) {
		method150(arg1, arg0.field192, arg0.field191);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method150(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method154(field592, arg2, arg1) - arg0;
			arg2 -= field572;
			var4 -= field573;
			arg1 -= field574;
			int var5 = FCIDIKVY.field747[field575];
			int var6 = FCIDIKVY.field748[field575];
			int var7 = FCIDIKVY.field747[field576];
			int var8 = FCIDIKVY.field748[field576];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field589 = (var9 << 9) / arg1 + PIHSODZS.field1190;
				field590 = (var11 << 9) / arg1 + PIHSODZS.field1191;
			} else {
				field589 = -1;
				field590 = -1;
			}
		} else {
			field589 = -1;
			field590 = -1;
		}
	}

	@ObfuscatedName("client.j(Z)Z")
	public final boolean method151() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.K(I)V")
	public final void method152() {
		field631 = new OSRLSEOB(field539, "titlebox", 0);
		field632 = new OSRLSEOB(field539, "titlebutton", 0);
		field228 = new OSRLSEOB[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field228[var1] = new OSRLSEOB(field539, "runes", var1);
		}

		field252 = new OGPNACTP(128, 265);
		field253 = new OGPNACTP(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field252.field1133[var2] = field531.field857[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field253.field1133[var3] = field532.field857[var3];
		}

		field582 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field582[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field582[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field582[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field582[var7 + 192] = 0xFFFFFF;
		}

		field583 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field583[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field583[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field583[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field583[var11 + 192] = 0xFFFFFF;
		}

		field584 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field584[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field584[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field584[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field584[var15 + 192] = 0xFFFFFF;
		}

		field581 = new int[256];
		field372 = new int[32768];
		field373 = new int[32768];
		method138(null);
		field311 = new int[32768];
		field312 = new int[32768];
		method26(10, "Connecting to fileserver");

		if (!field620) {
			field260 = true;
			field620 = true;
			method25(this, 2);
		}
	}

	@ObfuscatedName("client.f(II)Z")
	public final boolean method153(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field267[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 50) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method154(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field296[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field259[var6][var4][var5] + field259[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field259[var6][var4][var5 + 1] + field259[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.b(ILWBEWPIXO;I)V")
	public final void method155(WBEWPIXO arg0, int arg1) {
		int var3 = arg0.method526(8);
		if (var3 < field431) {
			for (int var4 = var3; var4 < field431; var4++) {
				field458[field457++] = field432[var4];
			}
		}

		if (var3 > field431) {
			signlink.reporterror(field519 + " Too many players");
			throw new RuntimeException("eek");
		}

		field431 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field432[var5];
			SRMWIYVM var7 = field430[var6];
			int var8 = arg0.method526(1);
			if (var8 == 0) {
				field432[field431++] = var6;
				var7.field164 = field552;
			} else {
				int var9 = arg0.method526(2);
				if (var9 == 0) {
					field432[field431++] = var6;
					var7.field164 = field552;
					field434[field433++] = var6;
				} else if (var9 == 1) {
					field432[field431++] = var6;
					var7.field164 = field552;
					int var10 = arg0.method526(3);
					var7.method45(false, var10);
					int var11 = arg0.method526(1);
					if (var11 == 1) {
						field434[field433++] = var6;
					}
				} else if (var9 == 2) {
					field432[field431++] = var6;
					var7.field164 = field552;
					int var12 = arg0.method526(3);
					var7.method45(true, var12);
					int var13 = arg0.method526(3);
					var7.method45(true, var13);
					int var14 = arg0.method526(1);
					if (var14 == 1) {
						field434[field433++] = var6;
					}
				} else if (var9 == 3) {
					field458[field457++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method156(boolean arg0) {
		method80();
		field530.method273();
		field631.method369(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field237 == 0) {
			int var4 = var3 / 2 + 80;
			field414.method590(0x75A9A9, true, field633.field943, var2 / 2, var4);
			int var5 = var3 / 2 - 20;
			field416.method590(0xFFFF00, true, "Welcome to RuneScape", var2 / 2, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field632.method369(var6 - 73, var7 - 20);
			field416.method590(0xFFFFFF, true, "New User", var6, var7 + 5);
			int var8 = var2 / 2 + 80;
			field632.method369(var8 - 73, var7 - 20);
			field416.method590(0xFFFFFF, true, "Existing User", var8, var7 + 5);
		}

		if (field237 == 2) {
			int var9 = var3 / 2 - 40;
			if (field389.length() > 0) {
				field416.method590(0xFFFF00, true, field389, var2 / 2, var9 - 15);
				field416.method590(0xFFFF00, true, field390, var2 / 2, var9);
				var9 += 30;
			} else {
				field416.method590(0xFFFF00, true, field390, var2 / 2, var9 - 7);
				var9 += 30;
			}

			field416.method597(true, "Username: " + field519 + (field365 == 0 & field552 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, 0xFFFFFF, var9);
			var9 += 15;
			field416.method597(true, "Password: " + XLAXYQGJ.method583(field520) + (field365 == 1 & field552 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, 0xFFFFFF, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field632.method369(var10 - 73, var11 - 20);
				field416.method590(0xFFFFFF, true, "Login", var10, var11 + 5);
				int var12 = var2 / 2 + 80;
				field632.method369(var12 - 73, var11 - 20);
				field416.method590(0xFFFFFF, true, "Cancel", var12, var11 + 5);
			}
		}

		if (field237 == 3) {
			field416.method590(0xFFFF00, true, "Create a free account", var2 / 2, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field416.method590(0xFFFFFF, true, "To create a new account you need to", var2 / 2, var13);
			var13 += 15;
			field416.method590(0xFFFFFF, true, "go back to the main RuneScape webpage", var2 / 2, var13);
			var13 += 15;
			field416.method590(0xFFFFFF, true, "and choose the 'create account'", var2 / 2, var13);
			var13 += 15;
			field416.method590(0xFFFFFF, true, "button near the top of that page.", var2 / 2, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field632.method369(var14 - 73, var15 - 20);
			field416.method590(0xFFFFFF, true, "Cancel", var14, var15 + 5);
		}

		field530.method274(field71, 202, 171);

		if (field624) {
			field624 = false;
			field528.method274(field71, 128, 0);
			field529.method274(field71, 202, 371);
			field533.method274(field71, 0, 265);
			field534.method274(field71, 562, 265);
			field535.method274(field71, 128, 171);
			field536.method274(field71, 562, 171);
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method157() {
		Graphics var1 = method24().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method17(1);

		if (field331) {
			field620 = false;
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

		if (field605) {
			field620 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field509) {
			field620 = false;
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

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method158(int arg0, int arg1) {
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

	@ObfuscatedName("client.M(I)V")
	public final void method159() {
		if (field85 == 1) {
			if (field86 >= 6 && field86 <= 106 && field87 >= 467 && field87 <= 499) {
				field384 = (field384 + 1) % 4;
				field517 = true;
				field578 = true;
				field210.method504(102);
				field210.method505(field384);
				field210.method505(field283);
				field210.method505(field538);
			}

			if (field86 >= 135 && field86 <= 235 && field87 >= 467 && field87 <= 499) {
				field283 = (field283 + 1) % 3;
				field517 = true;
				field578 = true;
				field210.method504(102);
				field210.method505(field384);
				field210.method505(field283);
				field210.method505(field538);
			}

			if (field86 >= 273 && field86 <= 373 && field87 >= 467 && field87 <= 499) {
				field538 = (field538 + 1) % 3;
				field517 = true;
				field578 = true;
				field210.method504(102);
				field210.method505(field384);
				field210.method505(field283);
				field210.method505(field538);
			}

			if (field86 >= 412 && field86 <= 512 && field87 >= 467 && field87 <= 499) {
				if (field602 == -1) {
					method68();
					field585 = "";
					field518 = false;
					field385 = field602 = MRUJPFPS.field1002;
					return;
				}

				method175(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method160() {
		field502.method273();
		PIHSODZS.field1196 = field327;
		field425.method369(0, 0);

		if (field282 != -1) {
			method85(0, 0, MRUJPFPS.method324(field282), 0);
		} else if (field491[field261] != -1) {
			method85(0, 0, MRUJPFPS.method324(field491[field261]), 0);
		}

		if (field348 && field402 == 1) {
			method105();
		}

		field502.method274(field71, 553, 205);
		field504.method273();
		PIHSODZS.field1196 = field328;
	}

	@ObfuscatedName("client.c(LMRUJPFPS;Z)Z")
	public final boolean method161(MRUJPFPS arg0) {
		if (arg0.field993 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field993.length; var2++) {
			int var3 = method164(arg0, var2);
			int var4 = arg0.field1010[var2];
			if (arg0.field993[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field993[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field993[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method162() {
		field620 = false;
		while (field545) {
			field620 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field631 = null;
		field632 = null;
		field228 = null;
		field581 = null;
		field582 = null;
		field583 = null;
		field584 = null;
		field372 = null;
		field373 = null;
		field311 = null;
		field312 = null;
		field252 = null;
		field253 = null;
	}

	@ObfuscatedName("client.O(I)V")
	public final void method163() {
		if (field401 == 0 && field85 == 1) {
			int var1 = field86 - 25 - 550;
			int var2 = field87 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field525 + field274 & 0x7FF;
				int var4 = PIHSODZS.field1194[var3];
				int var5 = PIHSODZS.field1195[var3];
				var4 = (field542 + 256) * var4 >> 8;
				var5 = (field542 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field338.field191 + var6 >> 7;
				int var9 = field338.field192 - var7 >> 7;
				boolean var10 = method101(0, true, 0, 0, field338.field144[0], var8, 1, field338.field143[0], var9, 0, 0);
				if (var10) {
					field210.method505(var1);
					field210.method505(var2);
					field210.method506(field525);
					field210.method505(57);
					field210.method505(field274);
					field210.method505(field542);
					field210.method505(89);
					field210.method506(field338.field191);
					field210.method506(field338.field192);
					field210.method505(field609);
					field210.method505(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LMRUJPFPS;II)I")
	public final int method164(MRUJPFPS arg0, int arg1) {
		if (arg0.field1035 == null || arg1 >= arg0.field1035.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1035[arg1];
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
					var8 = field222[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field508[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field622[var3[var5++]];
				}

				if (var7 == 4) {
					MRUJPFPS var10 = MRUJPFPS.method324(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < AAHIRSBF.field16 && (!AAHIRSBF.method7(var11).field33 || field368)) {
						for (int var12 = 0; var12 < var10.field991.length; var12++) {
							if (var11 + 1 == var10.field991[var12]) {
								var8 += var10.field1006[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field626[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field336[field508[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field626[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field338.field1363;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < XAYOHKKR.field1431; var13++) {
						if (XAYOHKKR.field1433[var13]) {
							var8 += field508[var13];
						}
					}
				}

				if (var7 == 10) {
					MRUJPFPS var14 = MRUJPFPS.method324(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < AAHIRSBF.field16 && (!AAHIRSBF.method7(var15).field33 || field368)) {
						for (int var16 = 0; var16 < var14.field991.length; var16++) {
							if (var14.field991[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field333;
				}

				if (var7 == 12) {
					var8 = field262;
				}

				if (var7 == 13) {
					int var17 = field626[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					UDOLPBTU var20 = UDOLPBTU.field1382[var19];
					int var21 = var20.field1384;
					int var22 = var20.field1385;
					int var23 = var20.field1386;
					int var24 = field264[var23 - var22];
					var8 = field626[var21] >> var22 & var24;
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
					var8 = (field338.field191 >> 7) + field487;
				}

				if (var7 == 19) {
					var8 = (field338.field192 >> 7) + field488;
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
	public final void method165() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field311[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field311[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field312[var10] = (field311[var10 - 1] + field311[var10 + 1] + field311[var10 - 128] + field311[var10 + 128]) / 4;
			}
		}

		field345 += 128;
		if (field345 > field372.length) {
			field345 -= field372.length;
			int var11 = (int) (Math.random() * 12.0D);
			method138(field228[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field312[var14 + 128] - field372[field345 + var14 & field372.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field311[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field611[var16] = field611[var16 + 1];
		}

		field611[var1 - 1] = (int) (Math.sin(field552 / 14.0D) * 16.0D + Math.sin(field552 / 15.0D) * 14.0D + Math.sin(field552 / 16.0D) * 12.0D);

		if (field472 > 0) {
			field472 -= 4;
		}

		if (field473 > 0) {
			field473 -= 4;
		}

		if (field472 == 0 && field473 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field472 = 1024;
			}

			if (var17 == 1) {
				field473 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method20() {
		if (!field509 && !field331 && !field605) {
			field552++;

			if (field613) {
				method102();
			} else {
				method96();
			}

			method54();
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method166() {
		if (field627 >= 2 || field316 != 0 || field409 != 0) {
			String var1;
			if (field316 == 1 && field627 < 2) {
				var1 = "Use " + field320 + " with...";
			} else if (field409 == 1 && field627 < 2) {
				var1 = field412 + "...";
			} else {
				var1 = field276[field627 - 1];
			}

			if (field627 > 2) {
				var1 = var1 + "@whi@ / " + (field627 - 2) + " more options";
			}

			field416.method598(var1, true, 4, 15, 0xFFFFFF, field552 / 1000);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method167() {
		int var1 = 5;
		field292[8] = 0;
		int var2 = 0;
		while (field292[8] == 0) {
			String var3 = "Unknown problem";
			method26(20, "Connecting to web server");

			try {
				DataInputStream var4 = method116("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 369);
				WBEWPIXO var5 = new WBEWPIXO(new byte[40]);
				var4.readFully(var5.field1400, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field292[var6] = var5.method520();
				}

				int var7 = var5.method520();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field292[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field292[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field292[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field292[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field292[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field292[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method26(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method26(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field313 = !field313;
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public void method168() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field218);

		if (field633 != null) {
			System.out.println("Od-cycle:" + field633.field917);
		}

		System.out.println("loop-cycle:" + field552);
		System.out.println("draw-cycle:" + field342);
		System.out.println("ptype:" + field396);
		System.out.println("psize:" + field395);

		if (field258 != null) {
			field258.method309();
		}

		field68 = true;
	}

	@ObfuscatedName("client.g(I)Ljava/awt/Component;")
	public final Component method24() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field74 != null) {
			return field74;
		}

		return this;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method169() {
		if (field413 == 2) {
			method150(field241 * 2, (field240 - field488 << 7) + field243, (field239 - field487 << 7) + field242);

			if (field589 > -1 && field552 % 20 < 10) {
				field378[0].method356(field589 - 12, field590 - 28);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method170() {
		try {
			if (field258 != null) {
				field258.method304();
			}
		} catch (Exception var2) {
		}

		field258 = null;
		field613 = false;
		field237 = 0;
		field519 = "";
		field520 = "";
		method77();
		field603.method399();

		for (int var1 = 0; var1 < 4; var1++) {
			field299[var1].method27();
		}

		System.gc();
		method113();
		field436 = -1;
		field234 = -1;
		field423 = 0;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;)V")
	public final void method171(String arg0, String arg1) {
		if (field504 != null) {
			field504.method273();
			PIHSODZS.field1196 = field328;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field415.method589(var3, 0, 257, arg1);
			field415.method589(var3 - 1, 0xFFFFFF, 256, arg1);
			var3 += 15;
			if (arg0 != null) {
				field415.method589(var3, 0, 257, arg0);
				field415.method589(var3 - 1, 0xFFFFFF, 256, arg0);
			}

			field504.method274(field71, 4, 4);
		} else if (field72 != null) {
			field72.method273();
			PIHSODZS.field1196 = field329;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			KPYGFVMA.method315(0, 383 - var5 / 2, var4 - 5 - var6 / 2, var6, var5);
			KPYGFVMA.method316(var5, var4 - var6 / 2 - 5, var6, 383 - var5 / 2, 0xFFFFFF);

			if (arg0 != null) {
				var4 -= 7;
			}

			field415.method589(var4, 0, 383, arg1);
			field415.method589(var4 - 1, 0xFFFFFF, 382, arg1);
			var4 += 15;
			if (arg0 != null) {
				field415.method589(var4, 0, 383, arg0);
				field415.method589(var4 - 1, 0xFFFFFF, 382, arg0);
			}

			field72.method274(field71, 0, 0);
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method172() {
		for (BIWICTTN var1 = (BIWICTTN) field346.method340(); var1 != null; var1 = (BIWICTTN) field346.method342()) {
			if (var1.field129 == -1) {
				var1.field130 = 0;
				method103(var1);
			} else {
				var1.method41();
			}
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method173(int arg0) {
		int var2 = XDAGNEWI.field1449[arg0].field1457;
		if (var2 != 0) {
			int var3 = field626[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					PIHSODZS.method381(0.9D);
				}

				if (var3 == 2) {
					PIHSODZS.method381(0.8D);
				}

				if (var3 == 3) {
					PIHSODZS.method381(0.7D);
				}

				if (var3 == 4) {
					PIHSODZS.method381(0.6D);
				}

				AAHIRSBF.field18.method336();
				field624 = true;
			}

			if (var2 == 3) {
				boolean var4 = field334;

				if (var3 == 0) {
					method53(0, field334);
					field334 = true;
				}

				if (var3 == 1) {
					method53(-400, field334);
					field334 = true;
				}

				if (var3 == 2) {
					method53(-800, field334);
					field334 = true;
				}

				if (var3 == 3) {
					method53(-1200, field334);
					field334 = true;
				}

				if (var3 == 4) {
					field334 = false;
				}

				if (field334 != var4 && !field369) {
					if (field334) {
						field234 = field436;
						field235 = true;
						field633.method292(2, field234);
					} else {
						method113();
					}

					field423 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field286 = true;
					method82(0);
				}

				if (var3 == 1) {
					field286 = true;
					method82(-400);
				}

				if (var3 == 2) {
					field286 = true;
					method82(-800);
				}

				if (var3 == 3) {
					field286 = true;
					method82(-1200);
				}

				if (var3 == 4) {
					field286 = false;
				}
			}

			if (var2 == 5) {
				field477 = var3;
			}

			if (var2 == 6) {
				field315 = var3;
			}

			if (var2 == 8) {
				field449 = var3;
				field578 = true;
			}

			if (var2 == 9) {
				field440 = var3;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method174() {
		if (field484 == 0) {
			int var1 = field85;
			if (field409 == 1 && field86 >= 516 && field87 >= 160 && field86 <= 765 && field87 <= 205) {
				var1 = 0;
			}

			if (field348) {
				if (var1 != 1) {
					int var2 = field79;
					int var3 = field80;
					if (field402 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field402 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field402 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field403 - 10 || var2 > field405 + field403 + 10 || var3 < field404 - 10 || var3 > field406 + field404 + 10) {
						field348 = false;

						if (field402 == 1) {
							field314 = true;
						}

						if (field402 == 2) {
							field578 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field403;
					int var5 = field404;
					int var6 = field405;
					int var7 = field86;
					int var8 = field87;
					if (field402 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field402 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field402 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field627; var10++) {
						int var11 = (field627 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method177(var9);
					}

					field348 = false;

					if (field402 == 1) {
						field314 = true;
					}

					if (field402 == 2) {
						field578 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field627 > 0) {
					int var12 = field267[field627 - 1];
					if (var12 == 219 || var12 == 915 || var12 == 486 || var12 == 463 || var12 == 343 || var12 == 620 || var12 == 5 || var12 == 121 || var12 == 501 || var12 == 837 || var12 == 888 || var12 == 1940) {
						int var13 = field265[field627 - 1];
						int var14 = field266[field627 - 1];
						MRUJPFPS var15 = MRUJPFPS.method324(var14);
						if (var15.field1047 || var15.field985) {
							field238 = false;
							field293 = 0;
							field482 = var14;
							field483 = var13;
							field484 = 2;
							field485 = field86;
							field486 = field87;

							if (MRUJPFPS.method324(var14).field1014 == field602) {
								field484 = 1;
							}

							if (MRUJPFPS.method324(var14).field1014 == field287) {
								field484 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field477 == 1 || method153(field627 - 1)) && field627 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field627 > 0) {
					method177(field627 - 1);
				}

				if (var1 != 2 || field627 <= 0) {
					return;
				}

				method133();
			}
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;Ljava/lang/String;)V")
	public final void method175(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field479 != -1) {
			field629 = arg1;
			field85 = 0;
		}

		if (field287 == -1) {
			field578 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field638[var4] = field638[var4 - 1];
			field639[var4] = field639[var4 - 1];
			field640[var4] = field640[var4 - 1];
		}

		field638[0] = arg0;
		field639[0] = arg2;
		field640[0] = arg1;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method176(boolean arg0) {
		for (int var2 = 0; var2 < field361; var2++) {
			PVFNGMTQ var3 = field360[field362[var2]];
			int var4 = (field362[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method42() && var3.field1245.field1227 == arg0 && var3.field1245.method389()) {
				int var5 = var3.field191 >> 7;
				int var6 = var3.field192 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field156 == 1 && (var3.field191 & 0x7F) == 0x40 && (var3.field192 & 0x7F) == 0x40) {
						if (field203[var5][var6] == field383) {
							continue;
						}

						field203[var5][var6] = field383;
					}

					if (!var3.field1245.field1213) {
						var4 += Integer.MIN_VALUE;
					}

					field603.method410(field592, var4, (var3.field156 - 1) * 64 + 60, var3, var3.field192, var3.field191, var3.field193, method154(field592, var3.field191, var3.field192), var3.field182);
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method177(int arg0) {
		if (arg0 >= 0) {
			int var2 = field265[arg0];
			int var3 = field266[arg0];
			int var4 = field267[arg0];
			int var5 = field268[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field455 != 0 && var4 != 1442) {
				field455 = 0;
				field578 = true;
			}

			if (var4 == 1313) {
				method106(var5, var2, var3);
				field210.method504(218);
				field210.method539(field488 + var3);
				field210.method539(field487 + var2);
				field210.method540(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 956) {
				String var6 = field276[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = XLAXYQGJ.method578(var6.substring(var7 + 5).trim());
					int var10 = -1;
					for (int var11 = 0; var11 < field554; var11++) {
						if (field200[var11] == var8) {
							var10 = var11;
							break;
						}
					}

					if (var10 != -1 && field233[var10] > 0) {
						field578 = true;
						field455 = 0;
						field250 = true;
						field511 = "";
						field551 = 3;
						field321 = field200[var10];
						field501 = "Enter message to send to " + field347[var10];
					}
				}
			}

			if (var4 == 1940) {
				AAHIRSBF var12 = AAHIRSBF.method7(var5);
				MRUJPFPS var13 = MRUJPFPS.method324(var3);
				String var14;
				if (var13 != null && var13.field1006[var2] >= 100000) {
					var14 = var13.field1006[var2] + " x " + var12.field19;
				} else if (var12.field37 == null) {
					var14 = "It's a " + var12.field19 + ".";
				} else {
					var14 = new String(var12.field37);
				}

				method175(0, var14, "");
			}

			if (var4 == 431) {
				method73(field479);
				field479 = -1;
				field578 = true;
			}

			if (var4 == 48) {
				boolean var15 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
				if (!var15) {
					method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
				}

				field567 = field86;
				field568 = field87;
				field570 = 2;
				field569 = 0;

				if ((var2 & 0x3) == 0) {
					field272++;
				}

				if (field272 >= 107) {
					field210.method504(166);
					field272 = 0;
				}

				field210.method504(0);
				field210.method539(field487 + var2);
				field210.method538(var5);
				field210.method506(field488 + var3);
			}

			if (var4 == 343) {
				field400 += var2;
				if (field400 >= 73) {
					field210.method504(32);
					field210.method509(0);
					field400 = 0;
				}

				field210.method504(174);
				field210.method540(var2);
				field210.method540(var5);
				field210.method540(var3);
				field419 = 0;
				field420 = var3;
				field421 = var2;
				field422 = 2;
				if (MRUJPFPS.method324(var3).field1014 == field602) {
					field422 = 1;
				}

				if (MRUJPFPS.method324(var3).field1014 == field287) {
					field422 = 3;
				}
			}

			if (var4 == 837) {
				field210.method504(202);
				field210.method540(var3);
				field210.method540(var2);
				field210.method539(var5);
				field419 = 0;
				field420 = var3;
				field421 = var2;
				field422 = 2;
				if (MRUJPFPS.method324(var3).field1014 == field602) {
					field422 = 1;
				}

				if (MRUJPFPS.method324(var3).field1014 == field287) {
					field422 = 3;
				}
			}

			if (var4 == 486) {
				field210.method504(135);
				field210.method538(var5);
				field210.method539(var3);
				field210.method506(var2);
				field419 = 0;
				field420 = var3;
				field421 = var2;
				field422 = 2;
				if (MRUJPFPS.method324(var3).field1014 == field602) {
					field422 = 1;
				}

				if (MRUJPFPS.method324(var3).field1014 == field287) {
					field422 = 3;
				}
			}

			if (var4 == 120) {
				MRUJPFPS var17 = MRUJPFPS.method324(var3);
				boolean var18 = true;
				if (var17.field987 > 0) {
					var18 = method115(var17);
				}

				if (var18) {
					field210.method504(124);
					field210.method506(var3);
				}
			}

			if (var4 == 209) {
				boolean var19 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
				if (!var19) {
					method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
				}

				field567 = field86;
				field568 = field87;
				field570 = 2;
				field569 = 0;
				field210.method504(172);
				field210.method539(field487 + var2);
				field210.method539(var5);
				field210.method506(field488 + var3);
			}

			if (var4 == 457) {
				MRUJPFPS var21 = MRUJPFPS.method324(var3);
				field409 = 1;
				field410 = var3;
				field411 = var21.field1044;
				field316 = 0;
				field314 = true;
				String var22 = var21.field1019;
				if (var22.indexOf(" ") != -1) {
					var22 = var22.substring(0, var22.indexOf(" "));
				}

				String var23 = var21.field1019;
				if (var23.indexOf(" ") != -1) {
					var23 = var23.substring(var23.indexOf(" ") + 1);
				}

				field412 = var22 + " " + var21.field1054 + " " + var23;

				if (field411 == 16) {
					field314 = true;
					field261 = 3;
					field302 = true;
				}
			} else {
				if (var4 == 542) {
					method68();
				}

				if (var4 == 50 || var4 == 478 || var4 == 169 || var4 == 34) {
					String var24 = field276[arg0];
					int var25 = var24.indexOf("@whi@");
					if (var25 != -1) {
						long var26 = XLAXYQGJ.method578(var24.substring(var25 + 5).trim());
						if (var4 == 50) {
							method92(var26);
						}

						if (var4 == 478) {
							method141(var26);
						}

						if (var4 == 169) {
							method50(var26);
						}

						if (var4 == 34) {
							method93(var26);
						}
					}
				}

				if (var4 == 66) {
					SRMWIYVM var28 = field430[var5];
					if (var28 != null) {
						method101(0, false, 1, 0, field338.field144[0], var28.field143[0], 2, field338.field143[0], var28.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(224);
						field210.method506(var5);
					}
				}

				if (var4 == 531) {
					PVFNGMTQ var29 = field360[var5];
					if (var29 != null) {
						method101(0, false, 1, 0, field338.field144[0], var29.field143[0], 2, field338.field143[0], var29.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(242);
						field210.method540(var5);
					}
				}

				if (var4 == 501) {
					field225 += var5;
					if (field225 >= 70) {
						field210.method504(177);
						field210.method509(0);
						field225 = 0;
					}

					field210.method504(107);
					field210.method539(var3);
					field210.method538(var2);
					field210.method538(var5);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 576) {
					field210.method504(168);
					field210.method540(field317);
					field210.method506(var3);
					field210.method506(var5);
					field210.method539(field319);
					field210.method540(field318);
					field210.method540(var2);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 974) {
					field210.method504(98);
					field210.method539(var2);
					field210.method506(var3);
					field210.method506(var5);
					field210.method506(field410);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 219) {
					field210.method504(220);
					field210.method538(var5);
					field210.method538(var3);
					field210.method539(var2);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 915) {
					field210.method504(151);
					field210.method538(var5);
					field210.method540(var2);
					field210.method506(var3);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 624) {
					boolean var30 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
					if (!var30) {
						method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
					}

					field567 = field86;
					field568 = field87;
					field570 = 2;
					field569 = 0;
					field210.method504(209);
					field210.method506(field488 + var3);
					field210.method506(field487 + var2);
					field210.method506(var5);
				}

				if (var4 == 878) {
					field210.method504(124);
					field210.method506(var3);
					MRUJPFPS var32 = MRUJPFPS.method324(var3);
					if (var32.field1035 != null && var32.field1035[0][0] == 5) {
						int var33 = var32.field1035[0][1];
						field626[var33] = 1 - field626[var33];
						method173(var33);
						field314 = true;
					}
				}

				if (var4 == 746) {
					boolean var34 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
					if (!var34) {
						method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
					}

					field567 = field86;
					field568 = field87;
					field570 = 2;
					field569 = 0;
					field210.method504(150);
					field210.method539(var5);
					field210.method538(field488 + var3);
					field210.method506(field487 + var2);
				}

				if (var4 == 771) {
					SRMWIYVM var36 = field430[var5];
					if (var36 != null) {
						method101(0, false, 1, 0, field338.field144[0], var36.field143[0], 2, field338.field143[0], var36.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(8);
						field210.method540(var5);
						field210.method539(field410);
					}
				}

				if (var4 == 60) {
					PVFNGMTQ var37 = field360[var5];
					if (var37 != null) {
						method101(0, false, 1, 0, field338.field144[0], var37.field143[0], 2, field338.field143[0], var37.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(3);
						field210.method506(field318);
						field210.method540(var5);
						field210.method538(field319);
						field210.method539(field317);
					}
				}

				if (var4 == 917) {
					field210.method504(124);
					field210.method506(var3);
					MRUJPFPS var38 = MRUJPFPS.method324(var3);
					if (var38.field1035 != null && var38.field1035[0][0] == 5) {
						int var39 = var38.field1035[0][1];
						if (field626[var39] != var38.field1010[0]) {
							field626[var39] = var38.field1010[0];
							method173(var39);
							field314 = true;
						}
					}
				}

				if (var4 == 504 || var4 == 56) {
					String var40 = field276[arg0];
					int var41 = var40.indexOf("@whi@");
					if (var41 != -1) {
						var40 = var40.substring(var41 + 5).trim();
						String var42 = XLAXYQGJ.method582(XLAXYQGJ.method579(XLAXYQGJ.method578(var40)));
						boolean var43 = false;
						for (int var44 = 0; var44 < field431; var44++) {
							SRMWIYVM var45 = field430[field432[var44]];
							if (var45 != null && var45.field1371 != null && var45.field1371.equalsIgnoreCase(var42)) {
								method101(0, false, 1, 0, field338.field144[0], var45.field143[0], 2, field338.field143[0], var45.field144[0], 1, 0);

								if (var4 == 504) {
									field210.method504(224);
									field210.method506(field432[var44]);
								}

								if (var4 == 56) {
									field210.method504(21);
									field210.method506(field432[var44]);
								}

								var43 = true;
								break;
							}
						}

						if (!var43) {
							method175(0, "Unable to find " + var42, "");
						}
					}
				}

				if (var4 == 87) {
					if ((field488 & 0x3) == 0) {
						field279++;
					}

					if (field279 >= 112) {
						field210.method504(90);
						field279 = 0;
					}

					method106(var5, var2, var3);
					field210.method504(43);
					field210.method540(var5 >> 14 & 0x7FFF);
					field210.method538(field487 + var2);
					field210.method538(field488 + var3);
				}

				if (var4 == 5) {
					field210.method504(33);
					field210.method506(var3);
					field210.method540(var2);
					field210.method506(var5);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 674) {
					String var46 = field276[arg0];
					int var47 = var46.indexOf("@whi@");
					if (var47 != -1) {
						if (field602 == -1) {
							method68();
							field585 = var46.substring(var47 + 5).trim();
							field518 = false;
							field385 = field602 = MRUJPFPS.field1002;
						} else {
							method175(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 198) {
					method106(var5, var2, var3);
					field210.method504(131);
					field210.method538(var5 >> 14 & 0x7FFF);
					field210.method538(field488 + var3);
					field210.method538(field487 + var2);
				}

				if (var4 == 639) {
					boolean var48 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
					if (!var48) {
						method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
					}

					field567 = field86;
					field568 = field87;
					field570 = 2;
					field569 = 0;
					field210.method504(45);
					field210.method506(field487 + var2);
					field210.method540(field488 + var3);
					field210.method538(var5);
				}

				if (var4 == 650) {
					SRMWIYVM var50 = field430[var5];
					if (var50 != null) {
						method101(0, false, 1, 0, field338.field144[0], var50.field143[0], 2, field338.field143[0], var50.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(148);
						field210.method539(var5);
					}
				}

				if (var4 == 1764) {
					int var51 = var5 >> 14 & 0x7FFF;
					FUIMNWOZ var52 = FUIMNWOZ.method246(var51);
					String var53;
					if (var52.field805 == null) {
						var53 = "It's a " + var52.field797 + ".";
					} else {
						var53 = new String(var52.field805);
					}

					method175(0, var53, "");
				}

				if (var4 == 69) {
					PVFNGMTQ var54 = field360[var5];
					if (var54 != null) {
						method101(0, false, 1, 0, field338.field144[0], var54.field143[0], 2, field338.field143[0], var54.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field480++;
						if (field480 >= 51) {
							field210.method504(229);
							field210.method509(0);
							field480 = 0;
						}

						field210.method504(147);
						field210.method538(var5);
					}
				}

				if (var4 == 33) {
					SRMWIYVM var55 = field430[var5];
					if (var55 != null) {
						method101(0, false, 1, 0, field338.field144[0], var55.field143[0], 2, field338.field143[0], var55.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(21);
						field210.method506(var5);
					}
				}

				if (var4 == 544 && method106(var5, var2, var3)) {
					field210.method504(74);
					field210.method538(field488 + var3);
					field210.method540(field319);
					field210.method538(field318);
					field210.method538(field317);
					field210.method506(field487 + var2);
					field210.method540(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 293 && !field478) {
					field210.method504(241);
					field210.method506(var3);
					field478 = true;
				}

				if (var4 == 555) {
					boolean var56 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
					if (!var56) {
						method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
					}

					field567 = field86;
					field568 = field87;
					field570 = 2;
					field569 = 0;
					field210.method504(69);
					field210.method540(var5);
					field210.method506(field487 + var2);
					field210.method506(field318);
					field210.method540(field317);
					field210.method539(field319);
					field210.method539(field488 + var3);
				}

				if (var4 == 689 && method106(var5, var2, var3)) {
					field210.method504(193);
					field210.method538(var5 >> 14 & 0x7FFF);
					field210.method540(field488 + var3);
					field210.method539(field410);
					field210.method540(field487 + var2);
				}

				if (var4 == 57) {
					boolean var58 = method101(0, false, 0, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 0, 0);
					if (!var58) {
						method101(0, false, 1, 0, field338.field144[0], var2, 2, field338.field143[0], var3, 1, 0);
					}

					field567 = field86;
					field568 = field87;
					field570 = 2;
					field569 = 0;
					field210.method504(109);
					field210.method538(var5);
					field210.method506(field488 + var3);
					field210.method506(field487 + var2);
					field210.method540(field410);
				}

				if (var4 == 805) {
					SRMWIYVM var60 = field430[var5];
					if (var60 != null) {
						method101(0, false, 1, 0, field338.field144[0], var60.field143[0], 2, field338.field143[0], var60.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(75);
						field210.method540(var5);
					}
				}

				if (var4 == 121) {
					if ((var5 & 0x3) == 0) {
						field304++;
					}

					if (field304 >= 98) {
						field210.method504(127);
						field210.method509(0);
						field304 = 0;
					}

					field210.method504(144);
					field210.method538(var3);
					field210.method506(var5);
					field210.method506(var2);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 154) {
					PVFNGMTQ var61 = field360[var5];
					if (var61 != null) {
						method101(0, false, 1, 0, field338.field144[0], var61.field143[0], 2, field338.field143[0], var61.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(52);
						field210.method539(field410);
						field210.method538(var5);
					}
				}

				if (var4 == 641) {
					PVFNGMTQ var62 = field360[var5];
					if (var62 != null) {
						method101(0, false, 1, 0, field338.field144[0], var62.field143[0], 2, field338.field143[0], var62.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(158);
						field210.method538(var5);
					}
				}

				if (var4 == 225) {
					SRMWIYVM var63 = field430[var5];
					if (var63 != null) {
						method101(0, false, 1, 0, field338.field144[0], var63.field143[0], 2, field338.field143[0], var63.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(30);
						field210.method539(field319);
						field210.method540(field317);
						field210.method538(var5);
						field210.method538(field318);
					}
				}

				if (var4 == 1261) {
					PVFNGMTQ var64 = field360[var5];
					if (var64 != null) {
						PJGEBWSY var65 = var64.field1245;
						if (var65.field1228 != null) {
							var65 = var65.method392();
						}

						if (var65 != null) {
							String var66;
							if (var65.field1240 == null) {
								var66 = "It's a " + var65.field1239 + ".";
							} else {
								var66 = new String(var65.field1240);
							}

							method175(0, var66, "");
						}
					}
				}

				if (var4 == 570) {
					method106(var5, var2, var3);
					field210.method504(36);
					field210.method506(field487 + var2);
					field210.method540(field488 + var3);
					field210.method539(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 463) {
					field210.method504(46);
					field210.method540(var2);
					field210.method538(var5);
					field210.method538(var3);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 157) {
					PVFNGMTQ var67 = field360[var5];
					if (var67 != null) {
						method101(0, false, 1, 0, field338.field144[0], var67.field143[0], 2, field338.field143[0], var67.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;
						field210.method504(103);
						field210.method506(var5);
					}
				}

				if (var4 == 334) {
					if ((var5 & 0x3) == 0) {
						field579++;
					}

					if (field579 >= 61) {
						field210.method504(145);
						field210.method506(581);
						field579 = 0;
					}

					method106(var5, var2, var3);
					field210.method504(139);
					field210.method540(field488 + var3);
					field210.method540(var5 >> 14 & 0x7FFF);
					field210.method539(field487 + var2);
				}

				if (var4 == 328) {
					SRMWIYVM var68 = field430[var5];
					if (var68 != null) {
						method101(0, false, 1, 0, field338.field144[0], var68.field143[0], 2, field338.field143[0], var68.field144[0], 1, 0);
						field567 = field86;
						field568 = field87;
						field570 = 2;
						field569 = 0;

						if ((var5 & 0x3) == 0) {
							field548++;
						}

						if (field548 >= 123) {
							field210.method504(206);
							field548 = 0;
						}

						field210.method504(87);
						field210.method506(var5);
					}
				}

				if (var4 == 1805) {
					AAHIRSBF var69 = AAHIRSBF.method7(var5);
					String var70;
					if (var69.field37 == null) {
						var70 = "It's a " + var69.field19 + ".";
					} else {
						var70 = new String(var69.field37);
					}

					method175(0, var70, "");
				}

				if (var4 == 620) {
					field210.method504(40);
					field210.method540(var5);
					field210.method506(var2);
					field210.method538(var3);
					field419 = 0;
					field420 = var3;
					field421 = var2;
					field422 = 2;
					if (MRUJPFPS.method324(var3).field1014 == field602) {
						field422 = 1;
					}

					if (MRUJPFPS.method324(var3).field1014 == field287) {
						field422 = 3;
					}
				}

				if (var4 == 888) {
					field316 = 1;
					field317 = var2;
					field318 = var3;
					field319 = var5;
					field320 = String.valueOf(AAHIRSBF.method7(var5).field19);
					field409 = 0;
					field314 = true;
				} else {
					if (var4 == 238) {
						if (field348) {
							field603.method437(var3 - 4, var2 - 4);
						} else {
							field603.method437(field87 - 4, field86 - 4);
						}
					}

					if (var4 == 810) {
						PVFNGMTQ var71 = field360[var5];
						if (var71 != null) {
							method101(0, false, 1, 0, field338.field144[0], var71.field143[0], 2, field338.field143[0], var71.field144[0], 1, 0);
							field567 = field86;
							field568 = field87;
							field570 = 2;
							field569 = 0;
							field210.method504(157);
							field210.method506(var5);
						}
					}

					field316 = 0;
					field409 = 0;
					field314 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method178() {
		if (field72 == null) {
			method162();
			field528 = null;
			field529 = null;
			field530 = null;
			field531 = null;
			field532 = null;
			field533 = null;
			field534 = null;
			field535 = null;
			field536 = null;
			field505 = null;
			field503 = null;
			field502 = null;
			field504 = null;
			field391 = null;
			field392 = null;
			field393 = null;
			field72 = new HGHKUVEK(method24(), 765, 503);
			field624 = true;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method179() {
		field330 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field294[var1] = -1;
			for (int var2 = 0; var2 < FDNUHSLC.field751; var2++) {
				if (!FDNUHSLC.field752[var2].field758 && FDNUHSLC.field752[var2].field753 == var1 + (field608 ? 0 : 7)) {
					field294[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
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

	@ObfuscatedName("client.p(Z)V")
	public final void method181() {
		field556 = 0;
		for (int var1 = -1; var1 < field431 + field361; var1++) {
			CELKGLWS var2;
			if (var1 == -1) {
				var2 = field338;
			} else if (var1 < field431) {
				var2 = field430[field432[var1]];
			} else {
				var2 = field360[field362[var1 - field431]];
			}

			if (var2 != null && var2.method42()) {
				if (var2 instanceof PVFNGMTQ) {
					PJGEBWSY var3 = ((PVFNGMTQ) var2).field1245;
					if (var3.field1228 != null) {
						var3 = var3.method392();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field431) {
					PJGEBWSY var6 = ((PVFNGMTQ) var2).field1245;
					if (var6.field1235 >= 0 && var6.field1235 < field386.length) {
						method149(var2, var2.field190 + 15);

						if (field589 > -1) {
							field386[var6.field1235].method356(field589 - 12, field590 - 30);
						}
					}

					if (field413 == 1 && field362[var1 - field431] == field418 && field552 % 20 < 10) {
						method149(var2, var2.field190 + 15);

						if (field589 > -1) {
							field378[0].method356(field589 - 12, field590 - 28);
						}
					}
				} else {
					int var4 = 30;
					SRMWIYVM var5 = (SRMWIYVM) var2;
					if (var5.field1364 != -1 || var5.field1370 != -1) {
						method149(var2, var2.field190 + 15);

						if (field589 > -1) {
							if (var5.field1364 != -1) {
								field506[var5.field1364].method356(field589 - 12, field590 - var4);
								var4 += 25;
							}

							if (var5.field1370 != -1) {
								field386[var5.field1370].method356(field589 - 12, field590 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field413 == 10 && field432[var1] == field344) {
						method149(var2, var2.field190 + 15);

						if (field589 > -1) {
							field378[1].method356(field589 - 12, field590 - var4);
						}
					}
				}

				if (var2.field188 != null && (var1 >= field431 || field384 == 0 || field384 == 3 || field384 == 1 && method63(((SRMWIYVM) var2).field1371))) {
					method149(var2, var2.field190);

					if (field589 > -1 && field556 < field557) {
						field561[field556] = field416.method592(var2.field188) / 2;
						field560[field556] = field416.field1515;
						field558[field556] = field589;
						field559[field556] = field590;
						field562[field556] = var2.field177;
						field563[field556] = var2.field175;
						field564[field556] = var2.field174;
						field565[field556++] = var2.field188;

						if (field315 == 0 && var2.field175 >= 1 && var2.field175 <= 3) {
							field560[field556] += 10;
							field559[field556] += 5;
						}

						if (field315 == 0 && var2.field175 == 4) {
							field561[field556] = 60;
						}

						if (field315 == 0 && var2.field175 == 5) {
							field560[field556] += 5;
						}
					}
				}

				if (var2.field178 > field552) {
					method149(var2, var2.field190 + 15);

					if (field589 > -1) {
						int var7 = var2.field179 * 30 / var2.field180;
						if (var7 > 30) {
							var7 = 30;
						}

						KPYGFVMA.method315(0xFF00, field589 - 15, field590 - 3, 5, var7);
						KPYGFVMA.method315(0xFF0000, field589 + var7 - 15, field590 - 3, 5, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field172[var8] > field552) {
						method149(var2, var2.field190 / 2);

						if (field589 > -1) {
							if (var8 == 1) {
								field590 -= 20;
							}

							if (var8 == 2) {
								field589 -= 15;
								field590 -= 10;
							}

							if (var8 == 3) {
								field589 += 15;
								field590 -= 10;
							}

							field600[var2.field171[var8]].method356(field589 - 12, field590 - 12);
							field414.method589(field590 + 4, 0, field589, String.valueOf(var2.field170[var8]));
							field414.method589(field590 + 3, 0xFFFFFF, field589 - 1, String.valueOf(var2.field170[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field556; var9++) {
			int var10 = field558[var9];
			int var11 = field559[var9];
			int var12 = field561[var9];
			int var13 = field560[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field559[var15] - field560[var15] && var11 - var13 < field559[var15] + 2 && var10 - var12 < field561[var15] + field558[var15] && var10 + var12 > field558[var15] - field561[var15] && field559[var15] - field560[var15] < var11) {
						var11 = field559[var15] - field560[var15];
						var14 = true;
					}
				}
			}

			field589 = field558[var9];
			field590 = field559[var9] = var11;
			String var16 = field565[var9];
			if (field315 == 0) {
				int var17 = 0xFFFF00;
				if (field562[var9] < 6) {
					var17 = field510[field562[var9]];
				}

				if (field562[var9] == 6) {
					var17 = field383 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field562[var9] == 7) {
					var17 = field383 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field562[var9] == 8) {
					var17 = field383 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field562[var9] == 9) {
					int var18 = 150 - field564[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field562[var9] == 10) {
					int var19 = 150 - field564[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field562[var9] == 11) {
					int var20 = 150 - field564[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field563[var9] == 0) {
					field416.method589(field590 + 1, 0, field589, var16);
					field416.method589(field590, var17, field589, var16);
				}

				if (field563[var9] == 1) {
					field416.method594(var16, field590 + 1, field383, field589, 0);
					field416.method594(var16, field590, field383, field589, var17);
				}

				if (field563[var9] == 2) {
					field416.method595(0, field589, field590 + 1, field383, var16);
					field416.method595(var17, field589, field590, field383, var16);
				}

				if (field563[var9] == 3) {
					field416.method596(0, field590 + 1, field383, field589, 150 - field564[var9], var16);
					field416.method596(var17, field590, field383, field589, 150 - field564[var9], var16);
				}

				if (field563[var9] == 4) {
					int var21 = field416.method592(var16);
					int var22 = (150 - field564[var9]) * (var21 + 100) / 150;
					KPYGFVMA.method312(0, 334, field589 + 50, field589 - 50);
					field416.method593(0, field590 + 1, var16, field589 + 50 - var22);
					field416.method593(var17, field590, var16, field589 + 50 - var22);
					KPYGFVMA.method311();
				}

				if (field563[var9] == 5) {
					int var23 = 150 - field564[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					KPYGFVMA.method312(field590 - field416.field1515 - 1, field590 + 5, 512, 0);
					field416.method589(field590 + var24 + 1, 0, field589, var16);
					field416.method589(field590 + var24, var17, field589, var16);
					KPYGFVMA.method311();
				}
			} else {
				field416.method589(field590 + 1, 0, field589, var16);
				field416.method589(field590, 0xFFFF00, field589, var16);
			}
		}
	}

	@ObfuscatedName("client.a(IILWBEWPIXO;)V")
	public final void method182(int arg0, WBEWPIXO arg1) {
		arg1.method525();
		int var3 = arg1.method526(8);
		if (var3 < field361) {
			for (int var4 = var3; var4 < field361; var4++) {
				field458[field457++] = field362[var4];
			}
		}

		if (var3 > field361) {
			signlink.reporterror(field519 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field361 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field362[var5];
			PVFNGMTQ var7 = field360[var6];
			int var8 = arg1.method526(1);
			if (var8 == 0) {
				field362[field361++] = var6;
				var7.field164 = field552;
			} else {
				int var9 = arg1.method526(2);
				if (var9 == 0) {
					field362[field361++] = var6;
					var7.field164 = field552;
					field434[field433++] = var6;
				} else if (var9 == 1) {
					field362[field361++] = var6;
					var7.field164 = field552;
					int var10 = arg1.method526(3);
					var7.method45(false, var10);
					int var11 = arg1.method526(1);
					if (var11 == 1) {
						field434[field433++] = var6;
					}
				} else if (var9 == 2) {
					field362[field361++] = var6;
					var7.field164 = field552;
					int var12 = arg1.method526(3);
					var7.method45(true, var12);
					int var13 = arg1.method526(3);
					var7.method45(true, var13);
					int var14 = arg1.method526(1);
					if (var14 == 1) {
						field434[field433++] = var6;
					}
				} else if (var9 == 3) {
					field458[field457++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BILWBEWPIXO;)V")
	public final void method183(int arg0, WBEWPIXO arg1) {
		for (int var3 = 0; var3 < field433; var3++) {
			int var4 = field434[var3];
			PVFNGMTQ var5 = field360[var4];
			int var6 = arg1.method515();
			if ((var6 & 0x1) != 0) {
				var5.field153 = arg1.method541();
				var5.field154 = arg1.method543();
			}

			if ((var6 & 0x10) != 0) {
				int var7 = arg1.method543();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.method533();
				if (var5.field183 == var7 && var7 != -1) {
					int var9 = XETSOHUA.field1474[var7].field1488;
					if (var9 == 1) {
						var5.field184 = 0;
						var5.field185 = 0;
						var5.field186 = var8;
						var5.field187 = 0;
					}

					if (var9 == 2) {
						var5.field187 = 0;
					}
				} else if (var7 == -1 || var5.field183 == -1 || XETSOHUA.field1474[var7].field1482 >= XETSOHUA.field1474[var5.field183].field1482) {
					var5.field183 = var7;
					var5.field184 = 0;
					var5.field185 = 0;
					var5.field186 = var8;
					var5.field187 = 0;
					var5.field176 = var5.field173;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var10 = arg1.method533();
				int var11 = arg1.method533();
				var5.method46(var10, var11, field552);
				var5.field178 = field552 + 300;
				var5.field179 = arg1.method533();
				var5.field180 = arg1.method534();
			}

			if ((var6 & 0x20) != 0) {
				int var12 = arg1.method533();
				int var13 = arg1.method515();
				var5.method46(var12, var13, field552);
				var5.field178 = field552 + 300;
				var5.field179 = arg1.method534();
				var5.field180 = arg1.method532();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1245 = PJGEBWSY.method393(arg1.method541());
				var5.field156 = var5.field1245.field1229;
				var5.field181 = var5.field1245.field1232;
				var5.field148 = var5.field1245.field1242;
				var5.field149 = var5.field1245.field1211;
				var5.field150 = var5.field1245.field1219;
				var5.field151 = var5.field1245.field1221;
				var5.field195 = var5.field1245.field1237;
			}

			if ((var6 & 0x40) != 0) {
				var5.field165 = arg1.method517();
				int var14 = arg1.method549();
				var5.field169 = var14 >> 16;
				var5.field168 = (var14 & 0xFFFF) + field552;
				var5.field166 = 0;
				var5.field167 = 0;

				if (var5.field168 > field552) {
					var5.field166 = -1;
				}

				if (var5.field165 == 0xFFFF) {
					var5.field165 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field188 = arg1.method522();
				var5.field174 = 100;
			}

			if ((var6 & 0x8) != 0) {
				var5.field197 = arg1.method517();
				if (var5.field197 == 0xFFFF) {
					var5.field197 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILWBEWPIXO;)V")
	public final void method184(int arg0, WBEWPIXO arg1) {
		field457 = 0;
		field433 = 0;
		method60(arg1, arg0);
		method155(arg1, arg0);
		method51(arg1, arg0);
		method185(arg0, arg1);

		for (int var3 = 0; var3 < field457; var3++) {
			int var4 = field458[var3];
			if (field552 != field430[var4].field164) {
				field430[var4] = null;
			}
		}

		if (arg1.field1401 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1401 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field431; var5++) {
			if (field430[field432[var5]] == null) {
				signlink.reporterror(field519 + " null entry in pl list - pos:" + var5 + " size:" + field431);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IBLWBEWPIXO;)V")
	public final void method185(int arg0, WBEWPIXO arg1) {
		for (int var3 = 0; var3 < field433; var3++) {
			int var4 = field434[var3];
			SRMWIYVM var5 = field430[var4];
			int var6 = arg1.method515();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method515() << 8;
			}

			method61(var5, var6, var4, arg1);
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method21() {
		field500 = null;
		field600 = null;
		field506 = null;
		field386 = null;
		field378 = null;
		field290 = null;

		if (field633 != null) {
			field633.method286();
		}

		field633 = null;
		field547 = null;
		field441 = null;
		field594 = null;
		field595 = null;
		field596 = null;
		field597 = null;
		field598 = null;
		field306 = null;
		field307 = null;
		field308 = null;
		field309 = null;
		field310 = null;

		if (field339 != null) {
			field339.field1326 = false;
		}

		field339 = null;

		try {
			if (field258 != null) {
				field258.method304();
			}
		} catch (Exception var1) {
		}

		field258 = null;
		field492 = null;
		field493 = null;
		field494 = null;
		field495 = null;
		field496 = null;
		field203 = null;
		field549 = null;
		field350 = null;
		field430 = null;
		field432 = null;
		field434 = null;
		field435 = null;
		field458 = null;
		field259 = null;
		field296 = null;
		field603 = null;
		field299 = null;
		field363 = null;
		field346 = null;
		method113();
		field502 = null;
		field503 = null;
		field504 = null;
		field505 = null;
		field531 = null;
		field532 = null;
		field528 = null;
		field529 = null;
		field530 = null;
		field466 = null;
		field467 = null;
		field468 = null;
		field469 = null;
		field470 = null;
		field289 = null;
		field347 = null;
		field200 = null;
		field233 = null;
		field356 = null;
		field269 = null;
		field424 = null;
		field357 = null;
		field358 = null;
		field533 = null;
		field534 = null;
		field535 = null;
		field536 = null;
		field461 = null;
		field382 = null;
		field335 = null;
		field634 = null;
		field635 = null;
		field360 = null;
		field362 = null;
		field210 = null;
		field540 = null;
		field630 = null;
		field285 = null;
		field425 = null;
		field426 = null;
		field427 = null;
		field359 = null;
		field462 = null;
		field463 = null;
		field464 = null;
		field465 = null;
		field616 = null;
		field617 = null;
		field618 = null;
		field626 = null;
		field391 = null;
		field392 = null;
		field393 = null;
		field550 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field268 = null;
		field276 = null;
		field324 = null;
		field325 = null;
		field332 = null;
		method162();
		FUIMNWOZ.method237();
		PJGEBWSY.method390();
		AAHIRSBF.method5();
		MRUJPFPS.method333();
		QRIJREXW.field1310 = null;
		FDNUHSLC.field752 = null;
		PAAZBMFG.field1150 = null;
		XETSOHUA.field1474 = null;
		XBHNZKGU.field1435 = null;
		XBHNZKGU.field1447 = null;
		XDAGNEWI.field1449 = null;
		field72 = null;
		SRMWIYVM.field1355 = null;
		PIHSODZS.method372();
		QPWZYOZR.method398();
		FCIDIKVY.method195();
		FGGKJQKK.method233();
		System.gc();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method23() {
		field624 = true;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field264[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field336[var3] = var2 / 4;
		}
	}
}
