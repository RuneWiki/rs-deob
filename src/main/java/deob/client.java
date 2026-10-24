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
public final class client extends PKBEYUWN {

	@ObfuscatedName("client.J")
	public boolean field75 = false;

	@ObfuscatedName("client.K")
	public String[] field76 = new String[500];

	@ObfuscatedName("client.L")
	public BSNPYLEV field77 = BSNPYLEV.method35(1);

	@ObfuscatedName("client.P")
	public volatile boolean field81 = false;

	@ObfuscatedName("client.R")
	public boolean field83 = false;

	@ObfuscatedName("client.U")
	public FEIPMYNH[][][] field85 = new FEIPMYNH[4][104][104];

	@ObfuscatedName("client.X")
	public boolean field87 = true;

	@ObfuscatedName("client.Y")
	public int[] field88 = new int[7];

	@ObfuscatedName("client.Z")
	public int field89 = 0x23201B;

	@ObfuscatedName("client.ab")
	public boolean field90 = false;

	@ObfuscatedName("client.bb")
	public int[] field91 = new int[151];

	@ObfuscatedName("client.cb")
	public final int[] field92 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.nb")
	public int field103 = 128;

	@ObfuscatedName("client.xb")
	public String field112 = "";

	@ObfuscatedName("client.yb")
	public String field113 = "";

	@ObfuscatedName("client.Bb")
	public BSNPYLEV field115 = new BSNPYLEV(new byte[5000]);

	@ObfuscatedName("client.Cb")
	public TOFRUGLM[] field116 = new TOFRUGLM[16384];

	@ObfuscatedName("client.Eb")
	public int[] field118 = new int[16384];

	@ObfuscatedName("client.Gb")
	public BSNPYLEV field120 = BSNPYLEV.method35(1);

	@ObfuscatedName("client.Lb")
	public int[] field124 = new int[4000];

	@ObfuscatedName("client.Mb")
	public int[] field125 = new int[4000];

	@ObfuscatedName("client.Nb")
	public int field126 = -1;

	@ObfuscatedName("client.Pb")
	public int field128 = -1;

	@ObfuscatedName("client.Qb")
	public boolean field129 = false;

	@ObfuscatedName("client.Sb")
	public int field131 = 2;

	@ObfuscatedName("client.Tb")
	public String field132 = "";

	@ObfuscatedName("client.Yb")
	public boolean field136 = false;

	@ObfuscatedName("client.Zb")
	public int[] field137 = new int[5];

	@ObfuscatedName("client.ac")
	public int[] field138 = new int[2000];

	@ObfuscatedName("client.bc")
	public int[] field139 = new int[500];

	@ObfuscatedName("client.cc")
	public int[] field140 = new int[500];

	@ObfuscatedName("client.dc")
	public int[] field141 = new int[500];

	@ObfuscatedName("client.ec")
	public int[] field142 = new int[500];

	@ObfuscatedName("client.gc")
	public boolean field143 = false;

	@ObfuscatedName("client.jc")
	public int[] field146 = new int[33];

	@ObfuscatedName("client.lc")
	public int[] field148 = new int[2000];

	@ObfuscatedName("client.mc")
	public BISLJVZR[] field149 = new BISLJVZR[100];

	@ObfuscatedName("client.oc")
	public int[] field151 = new int[5];

	@ObfuscatedName("client.pc")
	public boolean field152 = false;

	@ObfuscatedName("client.sc")
	public volatile boolean field155 = false;

	@ObfuscatedName("client.uc")
	public String field157 = "";

	@ObfuscatedName("client.wc")
	public String[] field159 = new String[100];

	@ObfuscatedName("client.xc")
	public int[] field160 = new int[100];

	@ObfuscatedName("client.zc")
	public boolean field162 = false;

	@ObfuscatedName("client.Cc")
	public FEIPMYNH field165 = new FEIPMYNH();

	@ObfuscatedName("client.Fc")
	public int[] field168 = new int[VBDGXFVG.field1319];

	@ObfuscatedName("client.Nc")
	public boolean field175 = false;

	@ObfuscatedName("client.Pc")
	public int field176 = -1;

	@ObfuscatedName("client.Qc")
	public int field177 = 78;

	@ObfuscatedName("client.Xc")
	public boolean field181 = false;

	@ObfuscatedName("client.Yc")
	public boolean field182 = false;

	@ObfuscatedName("client.hd")
	public int field191 = -1;

	@ObfuscatedName("client.jd")
	public int[] field193 = new int[50];

	@ObfuscatedName("client.kd")
	public int[][] field194 = new int[104][104];

	@ObfuscatedName("client.ld")
	public final int field195 = 100;

	@ObfuscatedName("client.md")
	public int[] field196 = new int[100];

	@ObfuscatedName("client.vd")
	public boolean field205 = false;

	@ObfuscatedName("client.Bd")
	public BISLJVZR[] field211 = new BISLJVZR[32];

	@ObfuscatedName("client.Gd")
	public boolean field216 = true;

	@ObfuscatedName("client.Id")
	public boolean field217 = false;

	@ObfuscatedName("client.Kd")
	public TPHBVXKD[] field219 = new TPHBVXKD[5];

	@ObfuscatedName("client.Rd")
	public String[] field225 = new String[5];

	@ObfuscatedName("client.Sd")
	public boolean[] field226 = new boolean[5];

	@ObfuscatedName("client.Xd")
	public QHGHUTGN field229 = new QHGHUTGN();

	@ObfuscatedName("client.Zd")
	public long[] field231 = new long[200];

	@ObfuscatedName("client.ae")
	public long[] field232 = new long[100];

	@ObfuscatedName("client.he")
	public int[] field239 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.je")
	public int field241 = 1;

	@ObfuscatedName("client.ke")
	public String field242 = "";

	@ObfuscatedName("client.oe")
	public int field246 = 1;

	@ObfuscatedName("client.pe")
	public int field247 = -1;

	@ObfuscatedName("client.re")
	public boolean field249 = true;

	@ObfuscatedName("client.se")
	public boolean field250 = true;

	@ObfuscatedName("client.te")
	public KYEPSAQL[] field251 = new KYEPSAQL[13];

	@ObfuscatedName("client.ue")
	public int field252 = -1;

	@ObfuscatedName("client.ye")
	public boolean field256 = false;

	@ObfuscatedName("client.ze")
	public BISLJVZR[] field257 = new BISLJVZR[1000];

	@ObfuscatedName("client.He")
	public int[] field265 = new int[1000];

	@ObfuscatedName("client.Je")
	public String field266 = "";

	@ObfuscatedName("client.Le")
	public int field268 = -1;

	@ObfuscatedName("client.Me")
	public int field269 = -1;

	@ObfuscatedName("client.Ne")
	public int[] field270 = new int[9];

	@ObfuscatedName("client.Se")
	public int field274 = 2048;

	@ObfuscatedName("client.Te")
	public int field275 = 2047;

	@ObfuscatedName("client.Ue")
	public KZCOXKKW[] field276 = new KZCOXKKW[field274];

	@ObfuscatedName("client.We")
	public int[] field278 = new int[field274];

	@ObfuscatedName("client.Ye")
	public int[] field280 = new int[field274];

	@ObfuscatedName("client.Ze")
	public BSNPYLEV[] field281 = new BSNPYLEV[field274];

	@ObfuscatedName("client.bf")
	public int[] field282 = new int[50];

	@ObfuscatedName("client.cf")
	public boolean field283 = false;

	@ObfuscatedName("client.lf")
	public FEIPMYNH field291 = new FEIPMYNH();

	@ObfuscatedName("client.mf")
	public boolean[] field292 = new boolean[5];

	@ObfuscatedName("client.of")
	public EOLCIJGV[] field293 = new EOLCIJGV[4];

	@ObfuscatedName("client.vf")
	public int[] field300 = new int[VBDGXFVG.field1319];

	@ObfuscatedName("client.xf")
	public boolean field301 = false;

	@ObfuscatedName("client.yf")
	public boolean field302 = true;

	@ObfuscatedName("client.Af")
	public int[] field304 = new int[1000];

	@ObfuscatedName("client.Bf")
	public int[] field305 = new int[1000];

	@ObfuscatedName("client.Cf")
	public int field306 = 0x766654;

	@ObfuscatedName("client.Df")
	public int[] field307 = new int[5];

	@ObfuscatedName("client.Ef")
	public KYEPSAQL[] field308 = new KYEPSAQL[2];

	@ObfuscatedName("client.Ff")
	public String field309 = "";

	@ObfuscatedName("client.Gf")
	public String field310 = "";

	@ObfuscatedName("client.Lf")
	public boolean field315 = false;

	@ObfuscatedName("client.Pf")
	public int[] field318 = new int[200];

	@ObfuscatedName("client.Wf")
	public int field323 = -1;

	@ObfuscatedName("client.ig")
	public int field334 = -1;

	@ObfuscatedName("client.vg")
	public int[][] field344 = new int[104][104];

	@ObfuscatedName("client.Ag")
	public int[] field349 = new int[151];

	@ObfuscatedName("client.Dg")
	public int field352 = 0x332D25;

	@ObfuscatedName("client.Fg")
	public int[] field354 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ig")
	public BISLJVZR[] field357 = new BISLJVZR[32];

	@ObfuscatedName("client.Lg")
	public int[] field359 = new int[33];

	@ObfuscatedName("client.Rg")
	public int[] field365 = new int[5];

	@ObfuscatedName("client.Tg")
	public int field367 = -1;

	@ObfuscatedName("client.Vg")
	public int[][][] field368 = new int[4][13][13];

	@ObfuscatedName("client.ah")
	public String[] field373 = new String[200];

	@ObfuscatedName("client.ch")
	public int field375 = -1;

	@ObfuscatedName("client.dh")
	public boolean field376 = false;

	@ObfuscatedName("client.jh")
	public int[] field380 = new int[VBDGXFVG.field1319];

	@ObfuscatedName("client.qh")
	public int[] field386 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.vh")
	public BSNPYLEV field390 = BSNPYLEV.method35(1);

	@ObfuscatedName("client.wh")
	public int[] field391 = new int[256];

	@ObfuscatedName("client.xh")
	public int[] field392 = new int[100];

	@ObfuscatedName("client.yh")
	public String[] field393 = new String[100];

	@ObfuscatedName("client.zh")
	public String[] field394 = new String[100];

	@ObfuscatedName("client.Dh")
	public int field397 = 2;

	@ObfuscatedName("client.Eh")
	public BISLJVZR[] field398 = new BISLJVZR[32];

	@ObfuscatedName("client.Gh")
	public KYEPSAQL[] field399 = new KYEPSAQL[100];

	@ObfuscatedName("client.Ph")
	public int field408 = -1;

	@ObfuscatedName("client.Rh")
	public int[] field410 = new int[50];

	@ObfuscatedName("client.ci")
	public BISLJVZR[] field419 = new BISLJVZR[20];

	@ObfuscatedName("client.fi")
	public volatile boolean field422 = false;

	@ObfuscatedName("client.pi")
	public boolean field431 = false;

	@ObfuscatedName("client.qi")
	public boolean field432 = false;

	@ObfuscatedName("client.ri")
	public String field433 = "";

	@ObfuscatedName("client.ti")
	public int field435 = 2;

	@ObfuscatedName("client.xi")
	public int field439 = -1;

	@ObfuscatedName("client.Fi")
	public int field447 = 50;

	@ObfuscatedName("client.Gi")
	public int[] field448 = new int[field447];

	@ObfuscatedName("client.Hi")
	public int[] field449 = new int[field447];

	@ObfuscatedName("client.Ii")
	public int[] field450 = new int[field447];

	@ObfuscatedName("client.Ji")
	public int[] field451 = new int[field447];

	@ObfuscatedName("client.Ki")
	public int[] field452 = new int[field447];

	@ObfuscatedName("client.Li")
	public int[] field453 = new int[field447];

	@ObfuscatedName("client.Mi")
	public int[] field454 = new int[field447];

	@ObfuscatedName("client.Ni")
	public String[] field455 = new String[field447];

	@ObfuscatedName("client.Ti")
	public byte[] field461 = new byte[16384];

	@ObfuscatedName("client.Ui")
	public boolean field462 = false;

	@ObfuscatedName("client.cj")
	public BISLJVZR[] field470 = new BISLJVZR[8];

	@ObfuscatedName("client.ej")
	public int field471 = -1;

	@ObfuscatedName("client.kj")
	public String field477 = "";

	@ObfuscatedName("client.oj")
	public boolean field479 = false;

	@ObfuscatedName("client.qj")
	public int[][] field481 = new int[104][104];

	@ObfuscatedName("client.xj")
	public int field488 = 3;

	@ObfuscatedName("client.yj")
	public CRC32 field489 = new CRC32();

	@ObfuscatedName("client.zj")
	public int[] field490 = new int[5];

	@ObfuscatedName("client.Nj")
	public int field504 = -1;

	@ObfuscatedName("client.Oj")
	public FEIPMYNH field505 = new FEIPMYNH();

	@ObfuscatedName("client.Wj")
	public int field512 = 0x4D4233;

	@ObfuscatedName("client.ge")
	public static int[] field238 = new int[32];

	@ObfuscatedName("client.mg")
	public static final int[][] field336 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.rg")
	public static BigInteger field340 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.hh")
	public static String field379 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.ph")
	public static int[] field385 = new int[99];

	@ObfuscatedName("client.Mh")
	public static BigInteger field405 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.di")
	public static final int[] field420 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Xj")
	public static int field513 = 10;

	@ObfuscatedName("client.Zj")
	public static boolean field515 = true;

	@ObfuscatedName("client.ob")
	public int field104;

	@ObfuscatedName("client.pb")
	public int field105;

	@ObfuscatedName("client.qb")
	public int field106;

	@ObfuscatedName("client.rb")
	public static int field107;

	@ObfuscatedName("client.tb")
	public int field108;

	@ObfuscatedName("client.ub")
	public int field109;

	@ObfuscatedName("client.vb")
	public int field110;

	@ObfuscatedName("client.wb")
	public int field111;

	@ObfuscatedName("client.zb")
	public int field114;

	@ObfuscatedName("client.Db")
	public int field117;

	@ObfuscatedName("client.Fb")
	public int field119;

	@ObfuscatedName("client.Jb")
	public int field123;

	@ObfuscatedName("client.Rb")
	public int field130;

	@ObfuscatedName("client.Wb")
	public int field134;

	@ObfuscatedName("client.Xb")
	public int field135;

	@ObfuscatedName("client.hc")
	public int field144;

	@ObfuscatedName("client.ic")
	public int field145;

	@ObfuscatedName("client.kc")
	public int field147;

	@ObfuscatedName("client.nc")
	public static int field150;

	@ObfuscatedName("client.tc")
	public int field156;

	@ObfuscatedName("client.vc")
	public int field158;

	@ObfuscatedName("client.yc")
	public int field161;

	@ObfuscatedName("client.Ac")
	public int field163;

	@ObfuscatedName("client.Dc")
	public int field166;

	@ObfuscatedName("client.Ec")
	public static int field167;

	@ObfuscatedName("client.Gc")
	public int field169;

	@ObfuscatedName("client.Ic")
	public static int field170;

	@ObfuscatedName("client.Mc")
	public int field174;

	@ObfuscatedName("client.Rc")
	public int field178;

	@ObfuscatedName("client.Sc")
	public int field179;

	@ObfuscatedName("client.Uc")
	public int field180;

	@ObfuscatedName("client.ad")
	public int field184;

	@ObfuscatedName("client.fd")
	public int field189;

	@ObfuscatedName("client.gd")
	public int field190;

	@ObfuscatedName("client.id")
	public int field192;

	@ObfuscatedName("client.qd")
	public int field200;

	@ObfuscatedName("client.rd")
	public int field201;

	@ObfuscatedName("client.sd")
	public int field202;

	@ObfuscatedName("client.td")
	public int field203;

	@ObfuscatedName("client.ud")
	public int field204;

	@ObfuscatedName("client.wd")
	public int field206;

	@ObfuscatedName("client.Jd")
	public int field218;

	@ObfuscatedName("client.Md")
	public int field220;

	@ObfuscatedName("client.Nd")
	public int field221;

	@ObfuscatedName("client.Od")
	public int field222;

	@ObfuscatedName("client.Pd")
	public int field223;

	@ObfuscatedName("client.Qd")
	public int field224;

	@ObfuscatedName("client.Td")
	public int field227;

	@ObfuscatedName("client.Ud")
	public int field228;

	@ObfuscatedName("client.Yd")
	public int field230;

	@ObfuscatedName("client.fe")
	public static int field237;

	@ObfuscatedName("client.ie")
	public int field240;

	@ObfuscatedName("client.me")
	public int field244;

	@ObfuscatedName("client.ne")
	public int field245;

	@ObfuscatedName("client.qe")
	public int field248;

	@ObfuscatedName("client.ve")
	public int field253;

	@ObfuscatedName("client.we")
	public int field254;

	@ObfuscatedName("client.Ae")
	public int field258;

	@ObfuscatedName("client.Be")
	public int field259;

	@ObfuscatedName("client.Ce")
	public int field260;

	@ObfuscatedName("client.De")
	public int field261;

	@ObfuscatedName("client.Ee")
	public int field262;

	@ObfuscatedName("client.Fe")
	public int field263;

	@ObfuscatedName("client.Ge")
	public int field264;

	@ObfuscatedName("client.Oe")
	public static int field271;

	@ObfuscatedName("client.Pe")
	public int field272;

	@ObfuscatedName("client.Re")
	public int field273;

	@ObfuscatedName("client.Ve")
	public int field277;

	@ObfuscatedName("client.Xe")
	public int field279;

	@ObfuscatedName("client.ef")
	public int field285;

	@ObfuscatedName("client.ff")
	public int field286;

	@ObfuscatedName("client.gf")
	public int field287;

	@ObfuscatedName("client.hf")
	public int field288;

	@ObfuscatedName("client.pf")
	public int field294;

	@ObfuscatedName("client.qf")
	public int field295;

	@ObfuscatedName("client.rf")
	public int field296;

	@ObfuscatedName("client.sf")
	public int field297;

	@ObfuscatedName("client.uf")
	public int field299;

	@ObfuscatedName("client.zf")
	public int field303;

	@ObfuscatedName("client.Hf")
	public int field311;

	@ObfuscatedName("client.If")
	public int field312;

	@ObfuscatedName("client.Jf")
	public int field313;

	@ObfuscatedName("client.Kf")
	public int field314;

	@ObfuscatedName("client.Sf")
	public int field319;

	@ObfuscatedName("client.Tf")
	public int field320;

	@ObfuscatedName("client.Uf")
	public int field321;

	@ObfuscatedName("client.Vf")
	public static int field322;

	@ObfuscatedName("client.Xf")
	public int field324;

	@ObfuscatedName("client.Yf")
	public int field325;

	@ObfuscatedName("client.Zf")
	public int field326;

	@ObfuscatedName("client.ag")
	public int field327;

	@ObfuscatedName("client.bg")
	public int field328;

	@ObfuscatedName("client.dg")
	public int field329;

	@ObfuscatedName("client.eg")
	public int field330;

	@ObfuscatedName("client.fg")
	public int field331;

	@ObfuscatedName("client.gg")
	public int field332;

	@ObfuscatedName("client.hg")
	public int field333;

	@ObfuscatedName("client.jg")
	public int field335;

	@ObfuscatedName("client.ng")
	public int field337;

	@ObfuscatedName("client.og")
	public int field338;

	@ObfuscatedName("client.wg")
	public int field345;

	@ObfuscatedName("client.xg")
	public int field346;

	@ObfuscatedName("client.yg")
	public int field347;

	@ObfuscatedName("client.zg")
	public int field348;

	@ObfuscatedName("client.Bg")
	public static int field350;

	@ObfuscatedName("client.Cg")
	public static int field351;

	@ObfuscatedName("client.Eg")
	public int field353;

	@ObfuscatedName("client.Gg")
	public static int field355;

	@ObfuscatedName("client.Hg")
	public int field356;

	@ObfuscatedName("client.Mg")
	public static int field360;

	@ObfuscatedName("client.Ng")
	public int field361;

	@ObfuscatedName("client.Og")
	public int field362;

	@ObfuscatedName("client.Pg")
	public int field363;

	@ObfuscatedName("client.Wg")
	public int field369;

	@ObfuscatedName("client.Xg")
	public int field370;

	@ObfuscatedName("client.Yg")
	public int field371;

	@ObfuscatedName("client.bh")
	public int field374;

	@ObfuscatedName("client.rh")
	public int field387;

	@ObfuscatedName("client.sh")
	public int field388;

	@ObfuscatedName("client.th")
	public int field389;

	@ObfuscatedName("client.Bh")
	public static int field395;

	@ObfuscatedName("client.Ch")
	public int field396;

	@ObfuscatedName("client.Nh")
	public static int field406;

	@ObfuscatedName("client.Qh")
	public static int field409;

	@ObfuscatedName("client.Sh")
	public int field411;

	@ObfuscatedName("client.Th")
	public int field412;

	@ObfuscatedName("client.Wh")
	public int field414;

	@ObfuscatedName("client.Xh")
	public static int field415;

	@ObfuscatedName("client.Zh")
	public int field416;

	@ObfuscatedName("client.bi")
	public int field418;

	@ObfuscatedName("client.ei")
	public int field421;

	@ObfuscatedName("client.hi")
	public int field423;

	@ObfuscatedName("client.ii")
	public int field424;

	@ObfuscatedName("client.ji")
	public int field425;

	@ObfuscatedName("client.ki")
	public int field426;

	@ObfuscatedName("client.li")
	public int field427;

	@ObfuscatedName("client.mi")
	public int field428;

	@ObfuscatedName("client.ni")
	public int field429;

	@ObfuscatedName("client.oi")
	public int field430;

	@ObfuscatedName("client.si")
	public int field434;

	@ObfuscatedName("client.ui")
	public int field436;

	@ObfuscatedName("client.vi")
	public int field437;

	@ObfuscatedName("client.wi")
	public int field438;

	@ObfuscatedName("client.yi")
	public int field440;

	@ObfuscatedName("client.zi")
	public int field441;

	@ObfuscatedName("client.Ai")
	public int field442;

	@ObfuscatedName("client.Bi")
	public int field443;

	@ObfuscatedName("client.Ci")
	public int field444;

	@ObfuscatedName("client.Di")
	public int field445;

	@ObfuscatedName("client.Ei")
	public int field446;

	@ObfuscatedName("client.Vi")
	public int field463;

	@ObfuscatedName("client.Wi")
	public int field464;

	@ObfuscatedName("client.Yi")
	public int field466;

	@ObfuscatedName("client.Zi")
	public int field467;

	@ObfuscatedName("client.aj")
	public int field468;

	@ObfuscatedName("client.nj")
	public int field478;

	@ObfuscatedName("client.wj")
	public int field487;

	@ObfuscatedName("client.Aj")
	public static int field491;

	@ObfuscatedName("client.Bj")
	public int field492;

	@ObfuscatedName("client.Cj")
	public int field493;

	@ObfuscatedName("client.Dj")
	public int field494;

	@ObfuscatedName("client.Tj")
	public int field509;

	@ObfuscatedName("client.Yj")
	public static int field514;

	@ObfuscatedName("client.I")
	public int field74;

	@ObfuscatedName("client.M")
	public int field78;

	@ObfuscatedName("client.O")
	public int field80;

	@ObfuscatedName("client.Q")
	public int field82;

	@ObfuscatedName("client.S")
	public int field84;

	@ObfuscatedName("client.W")
	public int field86;

	@ObfuscatedName("client.Of")
	public long field317;

	@ObfuscatedName("client.Sg")
	public long field366;

	@ObfuscatedName("client.Oh")
	public long field407;

	@ObfuscatedName("client.Xi")
	public long field465;

	@ObfuscatedName("client.Uj")
	public long field510;

	@ObfuscatedName("client.be")
	public AKTTXKXI field233;

	@ObfuscatedName("client.ce")
	public AKTTXKXI field234;

	@ObfuscatedName("client.de")
	public AKTTXKXI field235;

	@ObfuscatedName("client.ee")
	public AKTTXKXI field236;

	@ObfuscatedName("client.mb")
	public BISLJVZR field102;

	@ObfuscatedName("client.Hb")
	public BISLJVZR field121;

	@ObfuscatedName("client.Ib")
	public BISLJVZR field122;

	@ObfuscatedName("client.Cd")
	public BISLJVZR field212;

	@ObfuscatedName("client.Dd")
	public BISLJVZR field213;

	@ObfuscatedName("client.xe")
	public BISLJVZR field255;

	@ObfuscatedName("client.eh")
	public BISLJVZR field377;

	@ObfuscatedName("client.fh")
	public BISLJVZR field378;

	@ObfuscatedName("client.rj")
	public BISLJVZR field482;

	@ObfuscatedName("client.sj")
	public BISLJVZR field483;

	@ObfuscatedName("client.tj")
	public BISLJVZR field484;

	@ObfuscatedName("client.uj")
	public BISLJVZR field485;

	@ObfuscatedName("client.vj")
	public BISLJVZR field486;

	@ObfuscatedName("client.Sj")
	public BISLJVZR field508;

	@ObfuscatedName("client.N")
	public BISLJVZR field79;

	@ObfuscatedName("client.pj")
	public IJIEJOTK field480;

	@ObfuscatedName("client.kb")
	public IOGVZQTL field100;

	@ObfuscatedName("client.lb")
	public IOGVZQTL field101;

	@ObfuscatedName("client.nd")
	public IOGVZQTL field197;

	@ObfuscatedName("client.od")
	public IOGVZQTL field198;

	@ObfuscatedName("client.pd")
	public IOGVZQTL field199;

	@ObfuscatedName("client.Oi")
	public IOGVZQTL field456;

	@ObfuscatedName("client.Pi")
	public IOGVZQTL field457;

	@ObfuscatedName("client.Qi")
	public IOGVZQTL field458;

	@ObfuscatedName("client.Ri")
	public IOGVZQTL field459;

	@ObfuscatedName("client.Ej")
	public IOGVZQTL field495;

	@ObfuscatedName("client.Fj")
	public IOGVZQTL field496;

	@ObfuscatedName("client.Gj")
	public IOGVZQTL field497;

	@ObfuscatedName("client.Hj")
	public IOGVZQTL field498;

	@ObfuscatedName("client.Ij")
	public IOGVZQTL field499;

	@ObfuscatedName("client.Jj")
	public IOGVZQTL field500;

	@ObfuscatedName("client.Kj")
	public IOGVZQTL field501;

	@ObfuscatedName("client.Lj")
	public IOGVZQTL field502;

	@ObfuscatedName("client.Mj")
	public IOGVZQTL field503;

	@ObfuscatedName("client.db")
	public IOGVZQTL field93;

	@ObfuscatedName("client.eb")
	public IOGVZQTL field94;

	@ObfuscatedName("client.fb")
	public IOGVZQTL field95;

	@ObfuscatedName("client.gb")
	public IOGVZQTL field96;

	@ObfuscatedName("client.hb")
	public IOGVZQTL field97;

	@ObfuscatedName("client.ib")
	public IOGVZQTL field98;

	@ObfuscatedName("client.jb")
	public IOGVZQTL field99;

	@ObfuscatedName("client.qc")
	public KYEPSAQL field153;

	@ObfuscatedName("client.rc")
	public KYEPSAQL field154;

	@ObfuscatedName("client.Jc")
	public KYEPSAQL field171;

	@ObfuscatedName("client.Kc")
	public KYEPSAQL field172;

	@ObfuscatedName("client.Lc")
	public KYEPSAQL field173;

	@ObfuscatedName("client.jf")
	public KYEPSAQL field289;

	@ObfuscatedName("client.kf")
	public KYEPSAQL field290;

	@ObfuscatedName("client.lh")
	public KYEPSAQL field381;

	@ObfuscatedName("client.mh")
	public KYEPSAQL field382;

	@ObfuscatedName("client.nh")
	public KYEPSAQL field383;

	@ObfuscatedName("client.Hh")
	public KYEPSAQL field400;

	@ObfuscatedName("client.Ih")
	public KYEPSAQL field401;

	@ObfuscatedName("client.Jh")
	public KYEPSAQL field402;

	@ObfuscatedName("client.Kh")
	public KYEPSAQL field403;

	@ObfuscatedName("client.Lh")
	public KYEPSAQL field404;

	@ObfuscatedName("client.fj")
	public KYEPSAQL field472;

	@ObfuscatedName("client.gj")
	public KYEPSAQL field473;

	@ObfuscatedName("client.hj")
	public KYEPSAQL field474;

	@ObfuscatedName("client.ij")
	public KYEPSAQL field475;

	@ObfuscatedName("client.jj")
	public KYEPSAQL field476;

	@ObfuscatedName("client.Zg")
	public static KZCOXKKW field372;

	@ObfuscatedName("client.pg")
	public NTPVSATL field339;

	@ObfuscatedName("client.Ub")
	public PAJXYXWG field133;

	@ObfuscatedName("client.bj")
	public SMIVAFST field469;

	@ObfuscatedName("client.ai")
	public VYNRIVYZ field417;

	@ObfuscatedName("client.le")
	public XXMIBCTG field243;

	@ObfuscatedName("client.Bc")
	public String field164;

	@ObfuscatedName("client.Zc")
	public String field183;

	@ObfuscatedName("client.tf")
	public String field298;

	@ObfuscatedName("client.Qg")
	public String field364;

	@ObfuscatedName("client.Vh")
	public Socket field413;

	@ObfuscatedName("client.Ke")
	public static boolean field267;

	@ObfuscatedName("client.df")
	public static boolean field284;

	@ObfuscatedName("client.Kg")
	public static boolean field358;

	@ObfuscatedName("client.ak")
	public static boolean field516;

	@ObfuscatedName("client.bd")
	public int[] field185;

	@ObfuscatedName("client.cd")
	public int[] field186;

	@ObfuscatedName("client.dd")
	public int[] field187;

	@ObfuscatedName("client.ed")
	public int[] field188;

	@ObfuscatedName("client.xd")
	public int[] field207;

	@ObfuscatedName("client.yd")
	public int[] field208;

	@ObfuscatedName("client.zd")
	public int[] field209;

	@ObfuscatedName("client.Ad")
	public int[] field210;

	@ObfuscatedName("client.Ed")
	public int[] field214;

	@ObfuscatedName("client.Fd")
	public int[] field215;

	@ObfuscatedName("client.sg")
	public int[] field341;

	@ObfuscatedName("client.tg")
	public int[] field342;

	@ObfuscatedName("client.ug")
	public int[] field343;

	@ObfuscatedName("client.Pj")
	public int[] field506;

	@ObfuscatedName("client.Qj")
	public int[] field507;

	@ObfuscatedName("client.Nf")
	public KYEPSAQL[] field316;

	@ObfuscatedName("client.Ob")
	public byte[][] field127;

	@ObfuscatedName("client.oh")
	public byte[][] field384;

	@ObfuscatedName("client.Si")
	public byte[][][] field460;

	@ObfuscatedName("client.Vj")
	public int[][][] field511;

	@ObfuscatedName("client.a(LBSNPYLEV;IZ)V")
	public final void method124(BSNPYLEV arg0, int arg1) {
		while (arg0.field56 + 21 < arg1 * 8) {
			int var3 = arg0.method58(14);
			if (var3 == 16383) {
				break;
			}

			if (field116[var3] == null) {
				field116[var3] = new TOFRUGLM();
			}

			TOFRUGLM var4 = field116[var3];
			field118[field117++] = var3;
			var4.field623 = field322;
			int var5 = arg0.method58(1);
			if (var5 == 1) {
				field280[field279++] = var3;
			}

			int var6 = arg0.method58(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method58(1);
			int var8 = arg0.method58(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1283 = YSYPMZMO.method597(arg0.method58(13));
			var4.field569 = var4.field1283.field1457;
			var4.field612 = var4.field1283.field1478;
			var4.field570 = var4.field1283.field1451;
			var4.field571 = var4.field1283.field1454;
			var4.field572 = var4.field1283.field1472;
			var4.field573 = var4.field1283.field1475;
			var4.field583 = var4.field1283.field1447;
			var4.method309(field372.field590[0] + var6, field372.field591[0] + var8, var7 == 1);
		}

		arg0.method59();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method125() {
		field457.method321();

		if (field374 == 2) {
			byte[] var1 = field382.field775;
			int[] var2 = TYMHEFTS.field1309;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field102.method28(256, field359, 25, 0, field104, 0, 33, field146, 25, 33);
			field458.method321();
			IWBEAICJ.field741 = field187;
		} else {
			int var5 = field396 + field104 & 0x7FF;
			int var6 = field372.field593 / 32 + 48;
			int var7 = 464 - field372.field594 / 32;
			field255.method28(field245 + 256, field91, var7, 5, var5, 25, 151, field349, var6, 146);
			field102.method28(256, field359, 25, 0, field104, 0, 33, field146, 25, 33);

			for (int var8 = 0; var8 < field303; var8++) {
				int var9 = field304[var8] * 4 + 2 - field372.field593 / 32;
				int var10 = field305[var8] * 4 + 2 - field372.field594 / 32;
				method232(field257[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					FEIPMYNH var13 = field85[field156][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field372.field593 / 32;
						int var15 = var12 * 4 + 2 - field372.field594 / 32;
						method232(field482, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field117; var16++) {
				TOFRUGLM var17 = field116[field118[var16]];
				if (var17 != null && var17.method307()) {
					YSYPMZMO var18 = var17.field1283;
					if (var18.field1461 != null) {
						var18 = var18.method599();
					}

					if (var18 != null && var18.field1466 && var18.field1467) {
						int var19 = var17.field593 / 32 - field372.field593 / 32;
						int var20 = var17.field594 / 32 - field372.field594 / 32;
						method232(field483, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field277; var21++) {
				KZCOXKKW var22 = field276[field278[var21]];
				if (var22 != null && var22.method307()) {
					int var23 = var22.field593 / 32 - field372.field593 / 32;
					int var24 = var22.field594 / 32 - field372.field594 / 32;
					boolean var25 = false;
					long var26 = SFBUQEXP.method505(var22.field786);
					for (int var28 = 0; var28 < field388; var28++) {
						if (field231[var28] == var26 && field318[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field372.field791 != 0 && var22.field791 != 0 && field372.field791 == var22.field791) {
						var29 = true;
					}

					if (var25) {
						method232(field485, var24, var23);
					} else if (var29) {
						method232(field486, var24, var23);
					} else {
						method232(field484, var24, var23);
					}
				}
			}

			if (field421 != 0 && field322 % 20 < 10) {
				if (field421 == 1 && field478 >= 0 && field478 < field116.length) {
					TOFRUGLM var30 = field116[field478];
					if (var30 != null) {
						int var31 = var30.field593 / 32 - field372.field593 / 32;
						int var32 = var30.field594 / 32 - field372.field594 / 32;
						method126(field122, var31, var32);
					}
				}

				if (field421 == 2) {
					int var33 = (field329 - field285) * 4 + 2 - field372.field593 / 32;
					int var34 = (field330 - field286) * 4 + 2 - field372.field594 / 32;
					method126(field122, var33, var34);
				}

				if (field421 == 10 && field134 >= 0 && field134 < field276.length) {
					KZCOXKKW var35 = field276[field134];
					if (var35 != null) {
						int var36 = var35.field593 / 32 - field372.field593 / 32;
						int var37 = var35.field594 / 32 - field372.field594 / 32;
						method126(field122, var36, var37);
					}
				}
			}

			if (field253 != 0) {
				int var38 = field253 * 4 + 2 - field372.field593 / 32;
				int var39 = field254 * 4 + 2 - field372.field594 / 32;
				method232(field121, var39, var38);
			}

			TYMHEFTS.method528(3, 78, 97, 3, 0xFFFFFF);
			field458.method321();
			IWBEAICJ.field741 = field187;
		}
	}

	@ObfuscatedName("client.a(ILBISLJVZR;II)V")
	public final void method126(BISLJVZR arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field396 + field104 & 0x7FF;
			int var6 = RMLAXPMV.field1201[var5];
			int var7 = RMLAXPMV.field1202[var5];
			var6 = var6 * 256 / (field245 + 256);
			var7 = var7 * 256 / (field245 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field508.method29(15, 83 - var13 - 20, 15, var12 + 94 + 4 - 10, 20, 256, var10, 20);
		} else {
			method232(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method127() {
		if (field459 == null) {
			method240();
			field957 = null;
			field93 = null;
			field94 = null;
			field95 = null;
			field96 = null;
			field97 = null;
			field98 = null;
			field99 = null;
			field100 = null;
			field101 = null;
			field459 = new IOGVZQTL(479, 96, method194());
			field457 = new IOGVZQTL(172, 156, method194());
			TYMHEFTS.method526();
			field382.method350(0, 0);
			field456 = new IOGVZQTL(190, 261, method194());
			field458 = new IOGVZQTL(512, 334, method194());
			TYMHEFTS.method526();
			field197 = new IOGVZQTL(496, 50, method194());
			field198 = new IOGVZQTL(269, 37, method194());
			field199 = new IOGVZQTL(249, 45, method194());
			field83 = true;
			field458.method321();
			IWBEAICJ.field741 = field187;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method128() {
		method158(20, "Starting up");

		if (signlink.sunjava) {
			field950 = 5;
		}

		if (field284) {
			field431 = true;
		} else {
			field284 = true;
			boolean var1 = false;
			String var2 = method131();
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
						field219[var3] = new TPHBVXKD(signlink.cache_idx[var3], 600000, var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method196();
					field469 = method148(25, 1, "title screen", "title", field270[1]);
					field233 = new AKTTXKXI(field469, false, "p11_full");
					field234 = new AKTTXKXI(field469, false, "p12_full");
					field235 = new AKTTXKXI(field469, false, "b12_full");
					field236 = new AKTTXKXI(field469, true, "q8_full");
					method133();
					method129();
					SMIVAFST var4 = method148(30, 2, "config", "config", field270[2]);
					SMIVAFST var5 = method148(35, 3, "interface", "interface", field270[3]);
					SMIVAFST var6 = method148(40, 4, "2d graphics", "media", field270[4]);
					SMIVAFST var7 = method148(45, 6, "textures", "textures", field270[6]);
					SMIVAFST var8 = method148(50, 7, "chat system", "wordenc", field270[7]);
					SMIVAFST var9 = method148(55, 8, "sound effects", "sounds", field270[8]);
					field460 = new byte[4][104][104];
					field511 = new int[4][105][105];
					field133 = new PAJXYXWG(4, field511, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field293[var10] = new EOLCIJGV(104, 104);
					}

					field255 = new BISLJVZR(512, 512);
					SMIVAFST var11 = method148(60, 5, "update list", "versionlist", field270[5]);
					method158(60, "Connecting to update server");
					field417 = new VYNRIVYZ();
					field417.method553(var11, this);
					XMRZESBN.method582(field417.method542());
					RMLAXPMV.method463(field417.method544(0), field417);

					if (!field516) {
						field86 = 0;
						field87 = true;
						field417.method556(2, field86);

						while (field417.method552() > 0) {
							method236();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field417.field1349 > 3) {
								method188("ondemand");
								return;
							}
						}
					}

					method158(65, "Requesting animations");
					int var12 = field417.method544(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field417.method556(1, var13);
					}

					while (field417.method552() > 0) {
						int var14 = var12 - field417.method552();
						if (var14 > 0) {
							method158(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method236();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field417.field1349 > 3) {
							method188("ondemand");
							return;
						}
					}

					method158(70, "Requesting models");
					int var15 = field417.method544(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field417.method539(var16);
						if ((var17 & 0x1) != 0) {
							field417.method556(0, var16);
						}
					}

					int var18 = field417.method552();
					while (field417.method552() > 0) {
						int var19 = var18 - field417.method552();
						if (var19 > 0) {
							method158(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method236();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field219[0] != null) {
						method158(75, "Requesting maps");
						field417.method556(3, field417.method541(0, 47, 48));
						field417.method556(3, field417.method541(1, 47, 48));
						field417.method556(3, field417.method541(0, 48, 48));
						field417.method556(3, field417.method541(1, 48, 48));
						field417.method556(3, field417.method541(0, 49, 48));
						field417.method556(3, field417.method541(1, 49, 48));
						field417.method556(3, field417.method541(0, 47, 47));
						field417.method556(3, field417.method541(1, 47, 47));
						field417.method556(3, field417.method541(0, 48, 47));
						field417.method556(3, field417.method541(1, 48, 47));
						field417.method556(3, field417.method541(0, 48, 148));
						field417.method556(3, field417.method541(1, 48, 148));
						int var20 = field417.method552();
						while (field417.method552() > 0) {
							int var21 = var20 - field417.method552();
							if (var21 > 0) {
								method158(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method236();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field417.method544(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field417.method539(var23);
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
							field417.method548(var23, var25, 0);
						}
					}

					field417.method558(field515);

					if (!field516) {
						int var26 = field417.method544(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field417.method543(var27)) {
								field417.method548(var27, (byte) 1, 2);
							}
						}
					}

					int var28 = field417.method544(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field417.method539(var29);
						if (var30 == 0 && field417.field1359 < 200) {
							field417.method548(var29, (byte) 1, 0);
						}
					}

					method158(80, "Unpacking media");
					field381 = new KYEPSAQL(var6, "invback", 0);
					field383 = new KYEPSAQL(var6, "chatback", 0);
					field382 = new KYEPSAQL(var6, "mapback", 0);
					field171 = new KYEPSAQL(var6, "backbase1", 0);
					field172 = new KYEPSAQL(var6, "backbase2", 0);
					field173 = new KYEPSAQL(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field251[var31] = new KYEPSAQL(var6, "sideicons", var31);
					}

					field102 = new BISLJVZR(var6, "compass", 0);
					field508 = new BISLJVZR(var6, "mapedge", 0);
					field508.method21();

					for (int var32 = 0; var32 < 72; var32++) {
						field399[var32] = new KYEPSAQL(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field149[var33] = new BISLJVZR(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field419[var34] = new BISLJVZR(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field398[var35] = new BISLJVZR(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field211[var36] = new BISLJVZR(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field357[var37] = new BISLJVZR(var6, "headicons_hint", var37);
					}

					field79 = new BISLJVZR(var6, "overlay_multiway", 0);
					field121 = new BISLJVZR(var6, "mapmarker", 0);
					field122 = new BISLJVZR(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field470[var38] = new BISLJVZR(var6, "cross", var38);
					}

					field482 = new BISLJVZR(var6, "mapdots", 0);
					field483 = new BISLJVZR(var6, "mapdots", 1);
					field484 = new BISLJVZR(var6, "mapdots", 2);
					field485 = new BISLJVZR(var6, "mapdots", 3);
					field486 = new BISLJVZR(var6, "mapdots", 4);
					field289 = new KYEPSAQL(var6, "scrollbar", 0);
					field290 = new KYEPSAQL(var6, "scrollbar", 1);
					field400 = new KYEPSAQL(var6, "redstone1", 0);
					field401 = new KYEPSAQL(var6, "redstone2", 0);
					field402 = new KYEPSAQL(var6, "redstone3", 0);
					field403 = new KYEPSAQL(var6, "redstone1", 0);
					field403.method347();
					field404 = new KYEPSAQL(var6, "redstone2", 0);
					field404.method347();
					field472 = new KYEPSAQL(var6, "redstone1", 0);
					field472.method348();
					field473 = new KYEPSAQL(var6, "redstone2", 0);
					field473.method348();
					field474 = new KYEPSAQL(var6, "redstone3", 0);
					field474.method348();
					field475 = new KYEPSAQL(var6, "redstone1", 0);
					field475.method347();
					field475.method348();
					field476 = new KYEPSAQL(var6, "redstone2", 0);
					field476.method347();
					field476.method348();

					for (int var39 = 0; var39 < 2; var39++) {
						field308[var39] = new KYEPSAQL(var6, "mod_icons", var39);
					}

					BISLJVZR var40 = new BISLJVZR(var6, "backleft1", 0);
					field495 = new IOGVZQTL(var40.field41, var40.field42, method194());
					var40.method22(0, 0);
					BISLJVZR var41 = new BISLJVZR(var6, "backleft2", 0);
					field496 = new IOGVZQTL(var41.field41, var41.field42, method194());
					var41.method22(0, 0);
					BISLJVZR var42 = new BISLJVZR(var6, "backright1", 0);
					field497 = new IOGVZQTL(var42.field41, var42.field42, method194());
					var42.method22(0, 0);
					BISLJVZR var43 = new BISLJVZR(var6, "backright2", 0);
					field498 = new IOGVZQTL(var43.field41, var43.field42, method194());
					var43.method22(0, 0);
					BISLJVZR var44 = new BISLJVZR(var6, "backtop1", 0);
					field499 = new IOGVZQTL(var44.field41, var44.field42, method194());
					var44.method22(0, 0);
					BISLJVZR var45 = new BISLJVZR(var6, "backvmid1", 0);
					field500 = new IOGVZQTL(var45.field41, var45.field42, method194());
					var45.method22(0, 0);
					BISLJVZR var46 = new BISLJVZR(var6, "backvmid2", 0);
					field501 = new IOGVZQTL(var46.field41, var46.field42, method194());
					var46.method22(0, 0);
					BISLJVZR var47 = new BISLJVZR(var6, "backvmid3", 0);
					field502 = new IOGVZQTL(var47.field41, var47.field42, method194());
					var47.method22(0, 0);
					BISLJVZR var48 = new BISLJVZR(var6, "backhmid2", 0);
					field503 = new IOGVZQTL(var48.field41, var48.field42, method194());
					var48.method22(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field149[var53] != null) {
							field149[var53].method20(var49 + var52, var51 + var52, var50 + var52);
						}

						if (field399[var53] != null) {
							field399[var53].method349(var49 + var52, var51 + var52, var50 + var52);
						}
					}

					method158(83, "Unpacking textures");
					IWBEAICJ.method329(var7);
					IWBEAICJ.method333(0.8D);
					IWBEAICJ.method328(20);
					method158(86, "Unpacking config");
					JZQVOFSF.method341(var4);
					RUROEYEG.method498(var4);
					VDWALSCV.method535(var4);
					QSAFIBMX.method448(var4);
					YSYPMZMO.method598(var4);
					GLRCYUHA.method310(var4);
					MHWTJCHJ.method365(var4);
					AJLKWPFL.method1(var4);
					DUEJVLYB.method278(var4);
					QSAFIBMX.field1081 = field515;

					if (!field516) {
						method158(90, "Unpacking sounds");
						byte[] var54 = var9.method512("sounds.dat", null);
						BSNPYLEV var55 = new BSNPYLEV(var54);
						DCZESDQX.method271(var55);
					}

					method158(95, "Unpacking interfaces");
					AKTTXKXI[] var56 = new AKTTXKXI[] { field233, field234, field235, field236 };
					QHGHUTGN.method444(var6, var56, var5);
					method158(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field382.field775[field382.field777 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field146[var57] = var58;
						field359[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field382.field775[field382.field777 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field349[var61 - 5] = var62 - 25;
						field91[var61 - 5] = var63 - var62;
					}

					IWBEAICJ.method326(503, 765);
					field188 = IWBEAICJ.field741;
					IWBEAICJ.method326(96, 479);
					field185 = IWBEAICJ.field741;
					IWBEAICJ.method326(261, 190);
					field186 = IWBEAICJ.field741;
					IWBEAICJ.method326(334, 512);
					field187 = IWBEAICJ.field741;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = IWBEAICJ.field739[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					PAJXYXWG.method411(800, 512, 500, 334, var65);
					BTDNSPCH.method86(var8);
					field480 = new IJIEJOTK(this);
					method164(field480, 10);
					SBGQSXPV.field1273 = this;
					RUROEYEG.field1224 = this;
					YSYPMZMO.field1455 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field164 + " " + field487);
					field432 = true;
				}
			} else {
				field129 = true;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method129() {
		field153 = new KYEPSAQL(field469, "titlebox", 0);
		field154 = new KYEPSAQL(field469, "titlebutton", 0);
		field316 = new KYEPSAQL[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field316[var1] = new KYEPSAQL(field469, "runes", var1);
		}

		field212 = new BISLJVZR(128, 265);
		field213 = new BISLJVZR(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field212.field40[var2] = field96.field724[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field213.field40[var3] = field97.field724[var3];
		}

		field208 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field208[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field208[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field208[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field208[var7 + 192] = 0xFFFFFF;
		}

		field209 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field209[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field209[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field209[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field209[var11 + 192] = 0xFFFFFF;
		}

		field210 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field210[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field210[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field210[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field210[var15 + 192] = 0xFFFFFF;
		}

		field207 = new int[256];
		field214 = new int[32768];
		field215 = new int[32768];
		method264(null);
		field506 = new int[32768];
		field507 = new int[32768];
		method158(10, "Connecting to fileserver");

		if (!field155) {
			field81 = true;
			field155 = true;
			method164(this, 2);
		}
	}

	@ObfuscatedName("client.a(BLBSNPYLEV;I)V")
	public final void method130(BSNPYLEV arg0, int arg1) {
		while (arg0.field56 + 10 < arg1 * 8) {
			int var3 = arg0.method58(11);
			if (var3 == 2047) {
				break;
			}

			if (field276[var3] == null) {
				field276[var3] = new KZCOXKKW();
				if (field281[var3] != null) {
					field276[var3].method354(field281[var3]);
				}
			}

			field278[field277++] = var3;
			KZCOXKKW var4 = field276[var3];
			var4.field623 = field322;
			int var5 = arg0.method58(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method58(1);
			if (var6 == 1) {
				field280[field279++] = var3;
			}

			int var7 = arg0.method58(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method58(1);
			var4.method309(field372.field590[0] + var5, field372.field591[0] + var7, var8 == 1);
		}

		arg0.method59();
	}

	@ObfuscatedName("client.b(B)Ljava/lang/String;")
	public final String method131() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field959 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method132(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field133.method405(field156, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			RUROEYEG var8 = RUROEYEG.method494(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1227;
				var10 = var8.field1240;
			} else {
				var9 = var8.field1240;
				var10 = var8.field1227;
			}

			int var11 = var8.field1234;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method200(0, var10, var9, arg2, field372.field591[0], 2, var11, field372.field590[0], true, 0, arg1);
		} else {
			method200(var6 + 1, 0, 0, arg2, field372.field591[0], 2, 0, field372.field590[0], true, var7, arg1);
		}

		field345 = field971;
		field346 = field972;
		field348 = 2;
		field347 = 0;
		return true;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method133() {
		byte[] var1 = field469.method512("title.dat", null);
		BISLJVZR var2 = new BISLJVZR(var1, this);
		field96.method321();
		var2.method22(0, 0);
		field97.method321();
		var2.method22(0, -637);
		field93.method321();
		var2.method22(0, -128);
		field94.method321();
		var2.method22(-371, -202);
		field95.method321();
		var2.method22(-171, -202);
		field98.method321();
		var2.method22(-265, 0);
		field99.method321();
		var2.method22(-265, -562);
		field100.method321();
		var2.method22(-171, -128);
		field101.method321();
		var2.method22(-171, -562);
		int[] var3 = new int[var2.field41];
		for (int var4 = 0; var4 < var2.field42; var4++) {
			for (int var5 = 0; var5 < var2.field41; var5++) {
				var3[var5] = var2.field40[var2.field41 * var4 + var2.field41 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field41; var6++) {
				var2.field40[var2.field41 * var4 + var6] = var3[var6];
			}
		}

		field96.method321();
		var2.method22(0, 382);
		field97.method321();
		var2.method22(0, -255);
		field93.method321();
		var2.method22(0, 254);
		field94.method321();
		var2.method22(-371, 180);
		field95.method321();
		var2.method22(-171, 180);
		field98.method321();
		var2.method22(-265, 382);
		field99.method321();
		var2.method22(-265, -180);
		field100.method321();
		var2.method22(-171, 254);
		field101.method321();
		var2.method22(-171, -180);
		BISLJVZR var7 = new BISLJVZR(field469, "logo", 0);
		field93.method321();
		var7.method24(18, 382 - var7.field41 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)V")
	public final void method134(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field158 = 0;
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

			field158 = 0;
			label46: for (int var7 = 0; var7 < QSAFIBMX.field1061; var7++) {
				QSAFIBMX var8 = QSAFIBMX.method455(var7);
				if (var8.field1102 == -1 && var8.field1065 != null) {
					String var9 = var8.field1065.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field159[field158] = var9;
					field160[field158] = var7;
					field158++;
					if (field158 >= field159.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method135(int arg0, int arg1) {
		FEIPMYNH var3 = field85[field156][arg0][arg1];
		if (var3 == null) {
			field133.method396(field156, arg0, arg1);
		} else {
			int var4 = -99999999;
			KBARUPZK var5 = null;
			for (KBARUPZK var6 = (KBARUPZK) var3.method300(); var6 != null; var6 = (KBARUPZK) var3.method302()) {
				QSAFIBMX var7 = QSAFIBMX.method455(var6.field774);
				int var8 = var7.field1094;
				if (var7.field1084) {
					var8 = (var6.field773 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method298(var5);
			KBARUPZK var9 = null;
			KBARUPZK var10 = null;
			for (KBARUPZK var11 = (KBARUPZK) var3.method300(); var11 != null; var11 = (KBARUPZK) var3.method302()) {
				if (var5.field774 != var11.field774 && var9 == null) {
					var9 = var11;
				}

				if (var5.field774 != var11.field774 && var9.field774 != var11.field774 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field133.method382(arg0, var9, var12, field156, var5, var10, method159(arg1 * 128 + 64, field156, arg0 * 128 + 64), arg1);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method136() {
		int var1 = field424 * 128 + 64;
		int var2 = field425 * 128 + 64;
		int var3 = method159(var2, field156, var1) - field426;

		if (field220 < var1) {
			field220 += (var1 - field220) * field428 / 1000 + field427;
			if (field220 > var1) {
				field220 = var1;
			}
		}

		if (field220 > var1) {
			field220 -= (field220 - var1) * field428 / 1000 + field427;
			if (field220 < var1) {
				field220 = var1;
			}
		}

		if (field221 < var3) {
			field221 += (var3 - field221) * field428 / 1000 + field427;
			if (field221 > var3) {
				field221 = var3;
			}
		}

		if (field221 > var3) {
			field221 -= (field221 - var3) * field428 / 1000 + field427;
			if (field221 < var3) {
				field221 = var3;
			}
		}

		if (field222 < var2) {
			field222 += (var2 - field222) * field428 / 1000 + field427;
			if (field222 > var2) {
				field222 = var2;
			}
		}

		if (field222 > var2) {
			field222 -= (field222 - var2) * field428 / 1000 + field427;
			if (field222 < var2) {
				field222 = var2;
			}
		}

		int var4 = field200 * 128 + 64;
		int var5 = field201 * 128 + 64;
		int var6 = method159(var5, field156, var4) - field202;
		int var7 = var4 - field220;
		int var8 = var6 - field221;
		int var9 = var5 - field222;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field223 < var11) {
			field223 += (var11 - field223) * field204 / 1000 + field203;
			if (field223 > var11) {
				field223 = var11;
			}
		}

		if (field223 > var11) {
			field223 -= (field223 - var11) * field204 / 1000 + field203;
			if (field223 < var11) {
				field223 = var11;
			}
		}

		int var13 = var12 - field224;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field224 += field204 * var13 / 1000 + field203;
			field224 &= 0x7FF;
		}

		if (var13 < 0) {
			field224 -= -var13 * field204 / 1000 + field203;
			field224 &= 0x7FF;
		}

		int var14 = var12 - field224;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field224 = var12;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method137(boolean arg0) {
		if (field372.field593 >> 7 == field253 && field372.field594 >> 7 == field254) {
			field253 = 0;
		}

		int var2 = field277;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			KZCOXKKW var4;
			int var5;
			if (arg0) {
				var4 = field372;
				var5 = field275 << 14;
			} else {
				var4 = field276[field278[var3]];
				var5 = field278[var3] << 14;
			}

			if (var4 != null && var4.method307()) {
				var4.field808 = false;
				if ((field516 && field277 > 50 || field277 > 200) && !arg0 && var4.field609 == var4.field583) {
					var4.field808 = true;
				}

				int var6 = var4.field593 >> 7;
				int var7 = var4.field594 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field807 == null || field322 < var4.field802 || field322 >= var4.field803) {
						if ((var4.field593 & 0x7F) == 0x40 && (var4.field594 & 0x7F) == 0x40) {
							if (field344[var6][var7] == field166) {
								continue;
							}

							field344[var6][var7] = field166;
						}

						var4.field787 = method159(var4.field594, field156, var4.field593);
						field133.method386(var4, field156, var4.field595, var4.field582, var5, var4.field787, 60, var4.field594, var4.field593);
					} else {
						var4.field808 = false;
						var4.field787 = method159(var4.field594, field156, var4.field593);
						field133.method387(var4.field595, var4.field797, 60, var4.field796, var4.field799, var4.field787, var4.field798, var5, var4, var4.field594, var4.field593, field156);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method138() {
		for (int var1 = 0; var1 < field263; var1++) {
			if (field193[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field282[var1] != field439 || field410[var1] != field504) {
						BSNPYLEV var3 = DCZESDQX.method272(field282[var1], field410[var1]);
						if (System.currentTimeMillis() + var3.field55 / 22 > field273 / 22 + field317) {
							field273 = var3.field55;
							field317 = System.currentTimeMillis();

							if (method235(var3.field54, var3.field55)) {
								field439 = field282[var1];
								field504 = field410[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method214()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field77.method36(227);
						field77.method38(field282[var1] & 0x7FFF);
					} else {
						field77.method36(227);
						field77.method38(-1);
					}
				}

				if (var2 && field193[var1] != -5) {
					field193[var1] = -5;
				} else {
					field263--;
					for (int var5 = var1; var5 < field263; var5++) {
						field282[var5] = field282[var5 + 1];
						field410[var5] = field410[var5 + 1];
						field193[var5] = field193[var5 + 1];
					}

					var1--;
				}
			} else {
				field193[var1]--;
			}
		}

		if (field445 > 0) {
			field445 -= 20;
			if (field445 < 0) {
				field445 = 0;
			}

			if (field445 == 0 && field216 && !field516) {
				field86 = field176;
				field87 = true;
				field417.method556(2, field86);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method139(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILQHGHUTGN;)Z")
	public final boolean method140(QHGHUTGN arg0) {
		if (arg0.field1053 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1053.length; var2++) {
			int var3 = method234(var2, arg0);
			int var4 = arg0.field1033[var2];
			if (arg0.field1053[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1053[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1053[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	public final void init() {
		field513 = Integer.parseInt(getParameter("nodeid"));
		field514 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method224();
		} else {
			method215();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field515 = false;
		} else {
			field515 = true;
		}

		method427(765, 503);
	}

	@ObfuscatedName("client.k(I)V")
	public final void method141() {
		int var1 = field235.method6("Choose Option");
		for (int var2 = 0; var2 < field369; var2++) {
			int var3 = field235.method6(field76[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field369 * 15 + 21;
		if (field971 > 4 && field972 > 4 && field971 < 516 && field972 < 338) {
			int var5 = field971 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field972 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field376 = true;
			field440 = 0;
			field441 = var5;
			field442 = var6;
			field443 = var1;
			field444 = field369 * 15 + 22;
		}

		if (field971 > 553 && field972 > 205 && field971 < 743 && field972 < 466) {
			int var7 = field971 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field972 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field376 = true;
			field440 = 1;
			field441 = var7;
			field442 = var8;
			field443 = var1;
			field444 = field369 * 15 + 22;
		}

		if (field971 > 17 && field972 > 357 && field971 < 496 && field972 < 453) {
			int var9 = field971 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field972 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field376 = true;
			field440 = 2;
			field441 = var9;
			field442 = var10;
			field443 = var1;
			field444 = field369 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method142() {
		field422 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field155) {
				field335++;
				method147();
				method147();
				method153();
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

		field422 = false;
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method143(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.d(B)V")
	public final void method144() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.l(I)V")
	public final void method145() {
		while (true) {
			int var1 = method430();
			if (var1 == -1) {
				return;
			}

			if (field191 != -1 && field408 == field191) {
				if (var1 == 8 && field132.length() > 0) {
					field132 = field132.substring(0, field132.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field132.length() < 12) {
					field132 = field132 + (char) var1;
				}
			} else if (field162) {
				if (var1 >= 32 && var1 <= 122 && field477.length() < 80) {
					field477 = field477 + (char) var1;
					field205 = true;
				}

				if (var1 == 8 && field477.length() > 0) {
					field477 = field477.substring(0, field477.length() - 1);
					field205 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field162 = false;
					field205 = true;

					if (field190 == 1) {
						long var2 = SFBUQEXP.method505(field477);
						method155(var2);
					}

					if (field190 == 2 && field388 > 0) {
						long var4 = SFBUQEXP.method505(field477);
						method231(var4);
					}

					if (field190 == 3 && field477.length() > 0) {
						field77.method36(186);
						field77.method37(0);
						int var6 = field77.field55;
						field77.method43(field407);
						YPBNZDGQ.method591(field477, field77);
						field77.method46(field77.field55 - var6);
						field477 = YPBNZDGQ.method592(field477);
						field477 = BTDNSPCH.method96(field477);
						method267(SFBUQEXP.method509(SFBUQEXP.method506(field407)), field477, 6);

						if (field184 == 2) {
							field184 = 1;
							field75 = true;
							field77.method36(24);
							field77.method37(field492);
							field77.method37(field184);
							field77.method37(field179);
						}
					}

					if (field190 == 4 && field430 < 100) {
						long var7 = SFBUQEXP.method505(field477);
						method181(var7);
					}

					if (field190 == 5 && field430 > 0) {
						long var9 = SFBUQEXP.method505(field477);
						method191(var9);
					}
				}
			} else if (field218 == 1) {
				if (var1 >= 48 && var1 <= 57 && field242.length() < 10) {
					field242 = field242 + (char) var1;
					field205 = true;
				}

				if (var1 == 8 && field242.length() > 0) {
					field242 = field242.substring(0, field242.length() - 1);
					field205 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field242.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field242);
						} catch (Exception var21) {
						}

						field77.method36(33);
						field77.method41(var11);
					}

					field218 = 0;
					field205 = true;
				}
			} else if (field218 == 2) {
				if (var1 >= 32 && var1 <= 122 && field242.length() < 12) {
					field242 = field242 + (char) var1;
					field205 = true;
				}

				if (var1 == 8 && field242.length() > 0) {
					field242 = field242.substring(0, field242.length() - 1);
					field205 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field242.length() > 0) {
						field77.method36(119);
						field77.method43(SFBUQEXP.method505(field242));
					}

					field218 = 0;
					field205 = true;
				}
			} else if (field218 == 3) {
				if (var1 >= 32 && var1 <= 122 && field242.length() < 40) {
					field242 = field242 + (char) var1;
					field205 = true;
				}

				if (var1 == 8 && field242.length() > 0) {
					field242 = field242.substring(0, field242.length() - 1);
					field205 = true;
				}
			} else if (field128 == -1 && field375 == -1) {
				if (var1 >= 32 && var1 <= 122 && field266.length() < 80) {
					field266 = field266 + (char) var1;
					field205 = true;
				}

				if (var1 == 8 && field266.length() > 0) {
					field266 = field266.substring(0, field266.length() - 1);
					field205 = true;
				}

				if ((var1 == 13 || var1 == 10) && field266.length() > 0) {
					if (field230 == 2) {
						if (field266.equals("::clientdrop")) {
							method201();
						}

						if (field266.equals("::lag")) {
							method193();
						}

						if (field266.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field417.method544(2); var12++) {
								field417.method548(var12, (byte) 1, 2);
							}
						}

						if (field266.equals("::fpson")) {
							field267 = true;
						}

						if (field266.equals("::fpsoff")) {
							field267 = false;
						}

						if (field266.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field293[var13].field565[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field266.startsWith("::")) {
						field77.method36(46);
						field77.method37(field266.length() - 1);
						field77.method44(field266.substring(2));
					} else {
						String var16 = field266.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field266 = field266.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field266 = field266.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field266 = field266.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field266 = field266.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field266 = field266.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field266 = field266.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field266 = field266.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field266 = field266.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field266 = field266.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field266 = field266.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field266 = field266.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field266 = field266.substring(6);
						}

						String var18 = field266.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field266 = field266.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field266 = field266.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field266 = field266.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field266 = field266.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field266 = field266.substring(6);
						}

						field77.method36(145);
						field77.method37(0);
						int var20 = field77.field55;
						field77.method64(var19);
						field77.method37(var17);
						field115.field55 = 0;
						YPBNZDGQ.method591(field266, field115);
						field77.method83(field115.field55, 0, field115.field54);
						field77.method46(field77.field55 - var20);
						field266 = YPBNZDGQ.method592(field266);
						field266 = BTDNSPCH.method96(field266);
						field372.field622 = field266;
						field372.field598 = var17;
						field372.field602 = var19;
						field372.field596 = 150;

						if (field230 == 2) {
							method267("@cr2@" + field372.field786, field372.field622, 2);
						} else if (field230 == 1) {
							method267("@cr1@" + field372.field786, field372.field622, 2);
						} else {
							method267(field372.field786, field372.field622, 2);
						}

						if (field492 == 2) {
							field492 = 3;
							field75 = true;
							field77.method36(24);
							field77.method37(field492);
							field77.method37(field184);
							field77.method37(field179);
						}
					}

					field266 = "";
					field205 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method146() {
		field459.method321();
		IWBEAICJ.field741 = field185;
		field383.method350(0, 0);

		if (field162) {
			field235.method4(0, 40, field433, 239);
			field235.method4(128, 60, field477 + "*", 239);
		} else if (field218 == 1) {
			field235.method4(0, 40, "Enter amount:", 239);
			field235.method4(128, 60, field242 + "*", 239);
		} else if (field218 == 2) {
			field235.method4(0, 40, "Enter name:", 239);
			field235.method4(128, 60, field242 + "*", 239);
		} else if (field218 == 3) {
			if (field242 != field157) {
				method134(field242);
				field157 = field242;
			}

			AKTTXKXI var1 = field234;
			TYMHEFTS.method525(0, 0, 77, 463);

			for (int var2 = 0; var2 < field158; var2++) {
				int var3 = var2 * 14 + 18 - field161;
				if (var3 > 0 && var3 < 110) {
					var1.method4(0, var3, field159[var2], 239);
				}
			}

			TYMHEFTS.method524();

			if (field158 > 5) {
				method203(0, field158 * 14 + 7, field161, 463, 77);
			}

			if (field242.length() == 0) {
				field235.method4(255, 40, "Enter object name", 239);
			} else if (field158 == 0) {
				field235.method4(0, 40, "No matching objects found, please shorten search", 239);
			}

			var1.method4(0, 90, field242 + "*", 239);
			TYMHEFTS.method531(77, 479, 0, 0);
		} else if (field183 != null) {
			field235.method4(0, 40, field183, 239);
			field235.method4(128, 60, "Click to continue", 239);
		} else if (field128 != -1) {
			method166(0, 0, QHGHUTGN.method445(field128), 0);
		} else if (field247 == -1) {
			AKTTXKXI var4 = field234;
			int var5 = 0;
			TYMHEFTS.method525(0, 0, 77, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field394[var6] != null) {
					int var7 = field392[var6];
					int var8 = field78 + 70 - var5 * 14;
					String var9 = field393[var6];
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
							var4.method8(4, field394[var6], var8, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field492 == 0 || field492 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field308[0].method350(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field308[1].method350(var8 - 12, var11);
								var11 += 14;
							}

							var4.method8(var11, var9 + ":", var8, 0);
							var11 += var4.method6(var9) + 8;
							var4.method8(var11, field394[var6], var8, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field337 == 0 && (var7 == 7 || field184 == 0 || field184 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method8(var12, "From", var8, 0);
							int var14 = var12 + var4.method6("From ");
							if (var10 == 1) {
								field308[0].method350(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field308[1].method350(var8 - 12, var14);
								var14 += 14;
							}

							var4.method8(var14, var9 + ":", var8, 0);
							var14 += var4.method6(var9) + 8;
							var4.method8(var14, field394[var6], var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field179 == 0 || field179 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method8(4, var9 + " " + field394[var6], var8, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field337 == 0 && field184 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method8(4, field394[var6], var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field337 == 0 && field184 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method8(4, "To " + var9 + ":", var8, 0);
							var4.method8(var4.method6("To " + var9) + 12, field394[var6], var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field179 == 0 || field179 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method8(4, var9 + " " + field394[var6], var8, 0x7E3200);
						}

						var5++;
					}
				}
			}

			TYMHEFTS.method524();
			field177 = var5 * 14 + 7;
			if (field177 < 78) {
				field177 = 78;
			}

			method203(0, field177, field177 - field78 - 77, 463, 77);
			String var13;
			if (field372 == null || field372.field786 == null) {
				var13 = SFBUQEXP.method509(field309);
			} else {
				var13 = field372.field786;
			}

			var4.method8(4, var13 + ":", 90, 0);
			var4.method8(var4.method6(var13 + ": ") + 6, field266 + "*", 90, 255);
			TYMHEFTS.method531(77, 479, 0, 0);
		} else {
			method166(0, 0, QHGHUTGN.method445(field247), 0);
		}

		if (field376 && field440 == 2) {
			method239();
		}

		field459.method322(357, field956, 17);
		field458.method321();
		IWBEAICJ.field741 = field187;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method147() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field506[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field506[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field507[var10] = (field506[var10 - 1] + field506[var10 + 1] + field506[var10 - 128] + field506[var10 + 128]) / 4;
			}
		}

		field144 += 128;
		if (field144 > field214.length) {
			field144 -= field214.length;
			int var11 = (int) (Math.random() * 12.0D);
			method264(field316[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field507[var14 + 128] - field214[field144 + var14 & field214.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field506[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field391[var16] = field391[var16 + 1];
		}

		field391[var1 - 1] = (int) (Math.sin(field322 / 14.0D) * 16.0D + Math.sin(field322 / 15.0D) * 14.0D + Math.sin(field322 / 16.0D) * 12.0D);

		if (field411 > 0) {
			field411 -= 4;
		}

		if (field412 > 0) {
			field412 -= 4;
		}

		if (field411 == 0 && field412 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field411 = 1024;
			}

			if (var17 == 1) {
				field412 = 1024;
				return;
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 375);

			if (arg0.length == 5) {
				field513 = Integer.parseInt(arg0[0]);
				field514 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method224();
				} else if (arg0[2].equals("highmem")) {
					method215();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field515 = false;
				} else if (arg0[3].equals("members")) {
					field515 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method426(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;ZI)LSMIVAFST;")
	public final SMIVAFST method148(int arg0, int arg1, String arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field219[0] != null) {
				var6 = field219[0].method514(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field489.reset();
			field489.update(var6);
			int var8 = (int) field489.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new SMIVAFST(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method158(arg0, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method154(arg3 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				BSNPYLEV var16 = new BSNPYLEV(var15);
				var16.field55 = 3;
				int var17 = var16.method51() + 6;
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
						method158(arg0, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field219[0] != null) {
						field219[0].method515(arg1, var6, var6.length);
					}
				} catch (Exception var28) {
					field219[0] = null;
				}

				if (var6 != null) {
					field489.reset();
					field489.update(var6);
					int var23 = (int) field489.getValue();
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
						method158(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method158(arg0, var11 + " - Retrying in " + var25);
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

				field152 = !field152;
			}
		}

		return new SMIVAFST(var6);
	}

	@ObfuscatedName("client.a(LKZCOXKKW;IILBSNPYLEV;Z)V")
	public final void method149(KZCOXKKW arg0, int arg1, int arg2, BSNPYLEV arg3) {
		if ((arg1 & 0x80) != 0) {
			int var5 = arg3.method75();
			int var6 = arg3.method67();
			int var7 = arg3.method66();
			int var8 = arg3.field55;

			if (arg0.field786 != null && arg0.field783) {
				long var9 = SFBUQEXP.method505(arg0.field786);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field430; var12++) {
						if (field232[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field509 == 0) {
					try {
						field115.field55 = 0;
						arg3.method84(var7, field115.field54, 0);
						field115.field55 = 0;
						String var13 = YPBNZDGQ.method590(field115, var7);
						var13 = BTDNSPCH.method96(var13);
						arg0.field622 = var13;
						arg0.field598 = var5 >> 8;
						arg0.field602 = var5 & 0xFF;
						arg0.field596 = 150;

						if (var6 == 2 || var6 == 3) {
							method267("@cr2@" + arg0.field786, var13, 1);
						} else if (var6 == 1) {
							method267("@cr1@" + arg0.field786, var13, 1);
						} else {
							method267(arg0.field786, var13, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field55 = var7 + var8;
		}

		if ((arg1 & 0x20) != 0) {
			int var15 = arg3.method47();
			byte[] var16 = new byte[var15];
			BSNPYLEV var17 = new BSNPYLEV(var16);
			arg3.method85(var16, var15, 0);
			field281[arg2] = var17;
			arg0.method354(var17);
		}

		if ((arg1 & 0x1) != 0) {
			arg0.field600 = arg3.method73();
			arg0.field601 = arg3.method49();
		}

		if ((arg1 & 0x400) != 0) {
			arg0.field574 = arg3.method67();
			arg0.field576 = arg3.method67();
			arg0.field575 = arg3.method67();
			arg0.field577 = arg3.method67();
			arg0.field578 = arg3.method75() + field322;
			arg0.field579 = arg3.method74() + field322;
			arg0.field580 = arg3.method66();
			arg0.method306();
		}

		if ((arg1 & 0x40) != 0) {
			arg0.field604 = arg3.method74();
			if (arg0.field604 == 0xFFFF) {
				arg0.field604 = -1;
			}
		}

		if ((arg1 & 0x4) != 0) {
			arg0.field622 = arg3.method54();
			if (arg0.field622.charAt(0) == '~') {
				arg0.field622 = arg0.field622.substring(1);
				method267(arg0.field786, arg0.field622, 2);
			} else if (field372 == arg0) {
				method267(arg0.field786, arg0.field622, 2);
			}

			arg0.field598 = 0;
			arg0.field602 = 0;
			arg0.field596 = 150;
		}

		if ((arg1 & 0x10) != 0) {
			int var18 = arg3.method66();
			int var19 = arg3.method66();
			arg0.method308(var19, var18, field322);
			arg0.field619 = field322 + 300;
			arg0.field620 = arg3.method66();
			arg0.field621 = arg3.method66();
		}

		if ((arg1 & 0x200) != 0) {
			int var20 = arg3.method65();
			int var21 = arg3.method65();
			arg0.method308(var21, var20, field322);
			arg0.field619 = field322 + 300;
			arg0.field620 = arg3.method66();
			arg0.field621 = arg3.method66();
		}

		if ((arg1 & 0x8) != 0) {
			int var22 = arg3.method74();
			if (var22 == 0xFFFF) {
				var22 = -1;
			}

			int var23 = arg3.method67();
			if (arg0.field585 == var22 && var22 != -1) {
				int var24 = JZQVOFSF.field757[var22].field771;
				if (var24 == 1) {
					arg0.field586 = 0;
					arg0.field587 = 0;
					arg0.field588 = var23;
					arg0.field589 = 0;
				}

				if (var24 == 2) {
					arg0.field589 = 0;
				}
			} else if (var22 == -1 || arg0.field585 == -1 || JZQVOFSF.field757[var22].field765 >= JZQVOFSF.field757[arg0.field585].field765) {
				arg0.field585 = var22;
				arg0.field586 = 0;
				arg0.field587 = 0;
				arg0.field588 = var23;
				arg0.field589 = 0;
				arg0.field597 = arg0.field592;
			}
		}

		if ((arg1 & 0x100) != 0) {
			arg0.field614 = arg3.method73();
			int var25 = arg3.method81();
			arg0.field618 = var25 >> 16;
			arg0.field617 = (var25 & 0xFFFF) + field322;
			arg0.field615 = 0;
			arg0.field616 = 0;

			if (arg0.field617 > field322) {
				arg0.field615 = -1;
			}

			if (arg0.field614 == 0xFFFF) {
				arg0.field614 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILBSNPYLEV;I)V")
	public final void method150(BSNPYLEV arg0, int arg1) {
		int var3 = arg0.method58(8);
		if (var3 < field277) {
			for (int var4 = var3; var4 < field277; var4++) {
				field265[field264++] = field278[var4];
			}
		}

		if (var3 > field277) {
			signlink.reporterror(field309 + " Too many players");
			throw new RuntimeException("eek");
		}

		field277 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field278[var5];
			KZCOXKKW var7 = field276[var6];
			int var8 = arg0.method58(1);
			if (var8 == 0) {
				field278[field277++] = var6;
				var7.field623 = field322;
			} else {
				int var9 = arg0.method58(2);
				if (var9 == 0) {
					field278[field277++] = var6;
					var7.field623 = field322;
					field280[field279++] = var6;
				} else if (var9 == 1) {
					field278[field277++] = var6;
					var7.field623 = field322;
					int var10 = arg0.method58(3);
					var7.method305(false, var10);
					int var11 = arg0.method58(1);
					if (var11 == 1) {
						field280[field279++] = var6;
					}
				} else if (var9 == 2) {
					field278[field277++] = var6;
					var7.field623 = field322;
					int var12 = arg0.method58(3);
					var7.method305(true, var12);
					int var13 = arg0.method58(3);
					var7.method305(true, var13);
					int var14 = arg0.method58(1);
					if (var14 == 1) {
						field280[field279++] = var6;
					}
				} else if (var9 == 3) {
					field265[field264++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method151() {
		field456.method321();
		IWBEAICJ.field741 = field186;
		field381.method350(0, 0);

		if (field334 != -1) {
			method166(0, 0, QHGHUTGN.method445(field334), 0);
		} else if (field354[field488] != -1) {
			method166(0, 0, QHGHUTGN.method445(field354[field488]), 0);
		}

		if (field376 && field440 == 1) {
			method239();
		}

		field456.method322(205, field956, 553);
		field458.method321();
		IWBEAICJ.field741 = field187;
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method152(int arg0) {
		QHGHUTGN.method438(arg0);
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method153() {
		short var1 = 256;

		if (field411 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field411 > 768) {
					field207[var2] = method139(field209[var2], field208[var2], 1024 - field411);
				} else if (field411 > 256) {
					field207[var2] = field209[var2];
				} else {
					field207[var2] = method139(field208[var2], field209[var2], 256 - field411);
				}
			}
		} else if (field412 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field412 > 768) {
					field207[var3] = method139(field210[var3], field208[var3], 1024 - field412);
				} else if (field412 > 256) {
					field207[var3] = field210[var3];
				} else {
					field207[var3] = method139(field208[var3], field210[var3], 256 - field412);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field207[var4] = field208[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field96.field724[var5] = field212.field40[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field391[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field506[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field207[var12];
					int var15 = field96.field724[var7];
					field96.field724[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field96.method322(0, field956, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field97.field724[var16] = field213.field40[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field391[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field506[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field207[var23];
					int var26 = field97.field724[var18];
					field97.field724[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field97.method322(0, field956, 637);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method154(String arg0) throws IOException {
		if (field152) {
			if (field413 != null) {
				try {
					field413.close();
				} catch (Exception var4) {
				}

				field413 = null;
			}

			field413 = method176(43595);
			field413.setSoTimeout(10000);
			InputStream var2 = field413.getInputStream();
			OutputStream var3 = field413.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method155(long arg0) {
		if (arg0 != 0L) {
			if (field388 >= 100 && field169 != 1) {
				method267("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field388 >= 200) {
				method267("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = SFBUQEXP.method509(SFBUQEXP.method506(arg0));
				for (int var4 = 0; var4 < field388; var4++) {
					if (field231[var4] == arg0) {
						method267("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field430; var5++) {
					if (field232[var5] == arg0) {
						method267("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field372.field786)) {
					field373[field388] = var3;
					field231[field388] = arg0;
					field318[field388] = 0;
					field388++;
					field136 = true;
					field77.method36(92);
					field77.method43(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(LQHGHUTGN;B)Z")
	public final boolean method156(QHGHUTGN arg0) {
		int var2 = arg0.field1016;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field76[field369] = "Remove @whi@" + arg0.field1006;
				field141[field369] = 144;
				field369++;
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

		field76[field369] = "Remove @whi@" + field373[var2];
		field141[field369] = 70;
		field369++;
		field76[field369] = "Message @whi@" + field373[var2];
		field141[field369] = 334;
		field369++;
		return true;
	}

	@ObfuscatedName("client.a(IBLBSNPYLEV;)V")
	public final void method157(int arg0, BSNPYLEV arg1) {
		for (int var3 = 0; var3 < field279; var3++) {
			int var4 = field280[var3];
			TOFRUGLM var5 = field116[var4];
			int var6 = arg1.method47();
			if ((var6 & 0x20) != 0) {
				var5.field600 = arg1.method74();
				var5.field601 = arg1.method49();
			}

			if ((var6 & 0x8) != 0) {
				var5.field604 = arg1.method49();
				if (var5.field604 == 0xFFFF) {
					var5.field604 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field622 = arg1.method54();
				var5.field596 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field1283 = YSYPMZMO.method597(arg1.method49());
				var5.field569 = var5.field1283.field1457;
				var5.field612 = var5.field1283.field1478;
				var5.field570 = var5.field1283.field1451;
				var5.field571 = var5.field1283.field1454;
				var5.field572 = var5.field1283.field1472;
				var5.field573 = var5.field1283.field1475;
				var5.field583 = var5.field1283.field1447;
			}

			if ((var6 & 0x40) != 0) {
				int var7 = arg1.method66();
				int var8 = arg1.method47();
				var5.method308(var8, var7, field322);
				var5.field619 = field322 + 300;
				var5.field620 = arg1.method67();
				var5.field621 = arg1.method66();
			}

			if ((var6 & 0x2) != 0) {
				int var9 = arg1.method49();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg1.method47();
				if (var5.field585 == var9 && var9 != -1) {
					int var11 = JZQVOFSF.field757[var9].field771;
					if (var11 == 1) {
						var5.field586 = 0;
						var5.field587 = 0;
						var5.field588 = var10;
						var5.field589 = 0;
					}

					if (var11 == 2) {
						var5.field589 = 0;
					}
				} else if (var9 == -1 || var5.field585 == -1 || JZQVOFSF.field757[var9].field765 >= JZQVOFSF.field757[var5.field585].field765) {
					var5.field585 = var9;
					var5.field586 = 0;
					var5.field587 = 0;
					var5.field588 = var10;
					var5.field589 = 0;
					var5.field597 = var5.field592;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var12 = arg1.method66();
				int var13 = arg1.method65();
				var5.method308(var13, var12, field322);
				var5.field619 = field322 + 300;
				var5.field620 = arg1.method67();
				var5.field621 = arg1.method66();
			}

			if ((var6 & 0x1) != 0) {
				var5.field614 = arg1.method73();
				int var14 = arg1.method81();
				var5.field618 = var14 >> 16;
				var5.field617 = (var14 & 0xFFFF) + field322;
				var5.field615 = 0;
				var5.field616 = 0;

				if (var5.field617 > field322) {
					var5.field615 = -1;
				}

				if (var5.field614 == 0xFFFF) {
					var5.field614 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method158(int arg0, String arg1) {
		field487 = arg0;
		field164 = arg1;
		method195();

		if (field469 == null) {
			super.method158(arg0, arg1);
		} else {
			field95.method321();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field235.method4(0xFFFFFF, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			TYMHEFTS.method529(304, 34, var6, 0x8C1111, var3 / 2 - 152);
			TYMHEFTS.method529(302, 32, var6 + 1, 0, var3 / 2 - 151);
			TYMHEFTS.method528(arg0 * 3, var6 + 2, var3 / 2 - 150, 30, 0x8C1111);
			TYMHEFTS.method528(300 - arg0 * 3, var6 + 2, arg0 * 3 + var3 / 2 - 150, 30, 0);
			field235.method4(0xFFFFFF, var4 / 2 + 5 - var5, arg1, var3 / 2);
			field95.method322(171, field956, 202);

			if (field83) {
				field83 = false;

				if (!field155) {
					field96.method322(0, field956, 0);
					field97.method322(0, field956, 637);
				}

				field93.method322(0, field956, 128);
				field94.method322(371, field956, 202);
				field98.method322(265, field956, 0);
				field99.method322(265, field956, 562);
				field100.method322(171, field956, 128);
				field101.method322(171, field956, 562);
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method159(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field460[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field511[var6][var4][var5] + field511[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field511[var6][var4][var5 + 1] + field511[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IILQHGHUTGN;IIBII)V")
	public final void method160(int arg0, int arg1, QHGHUTGN arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.field1026 == 0 && arg2.field991 != null && !arg2.field1032 && (arg6 >= arg4 && arg0 >= arg1 && arg6 <= arg2.field1049 + arg4 && arg0 <= arg2.field1028 + arg1)) {
			int var8 = arg2.field991.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.field989[var9] + arg4;
				int var11 = arg2.field1003[var9] + arg1 - arg3;
				QHGHUTGN var12 = QHGHUTGN.method445(arg2.field991[var9]);
				var10 += var12.field998;
				var11 += var12.field995;
				if ((var12.field1005 >= 0 || var12.field1034 != 0) && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
					if (var12.field1005 >= 0) {
						field319 = var12.field1005;
					} else {
						field319 = var12.field999;
					}
				}

				if (var12.field1026 == 8 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
					field80 = var12.field999;
				}

				if (var12.field1026 == 0) {
					method160(arg0, var11, var12, var12.field1018, var10, arg5, arg6);

					if (var12.field1011 > var12.field1028) {
						method162(arg0, arg5, arg6, var12, var12.field1049 + var10, var12.field1011, var12.field1028, var11);
					}
				} else {
					if (var12.field1054 == 1 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						boolean var13 = false;
						if (var12.field1016 != 0) {
							var13 = method156(var12);
						}

						if (!var13) {
							field76[field369] = var12.field1047;
							field141[field369] = 887;
							field140[field369] = var12.field999;
							field369++;
						}
					}

					if (var12.field1054 == 2 && field361 == 0 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						String var14 = var12.field1048;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field76[field369] = var14 + " @gre@" + var12.field1036;
						field141[field369] = 654;
						field140[field369] = var12.field999;
						field369++;
					}

					if (var12.field1054 == 3 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						field76[field369] = "Close";

						if (arg5 == 3) {
							field141[field369] = 419;
						} else {
							field141[field369] = 8;
						}

						field140[field369] = var12.field999;
						field369++;
					}

					if (var12.field1054 == 4 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						field76[field369] = var12.field1047;
						field141[field369] = 609;
						field140[field369] = var12.field999;
						field369++;
					}

					if (var12.field1054 == 5 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						field76[field369] = var12.field1047;
						field141[field369] = 338;
						field140[field369] = var12.field999;
						field369++;
					}

					if (var12.field1054 == 6 && !field90 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1049 + var10 && arg0 < var12.field1028 + var11) {
						field76[field369] = var12.field1047;
						field141[field369] = 477;
						field140[field369] = var12.field999;
						field369++;
					}

					if (var12.field1026 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1028; var16++) {
							for (int var17 = 0; var17 < var12.field1049; var17++) {
								int var18 = (var12.field986 + 32) * var17 + var10;
								int var19 = (var12.field1050 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1031[var15];
									var19 += var12.field1020[var15];
								}

								if (arg6 >= var18 && arg0 >= var19 && arg6 < var18 + 32 && arg0 < var19 + 32) {
									field320 = var15;
									field321 = var12.field999;

									if (var12.field1001[var15] > 0) {
										QSAFIBMX var20 = QSAFIBMX.method455(var12.field1001[var15] - 1);
										if (field294 == 1 && var12.field1052) {
											if (field296 != var12.field999 || field295 != var15) {
												field76[field369] = "Use " + field298 + " with @lre@" + var20.field1065;
												field141[field369] = 730;
												field142[field369] = var20.field1079;
												field139[field369] = var15;
												field140[field369] = var12.field999;
												field369++;
											}
										} else if (field361 != 1 || !var12.field1052) {
											if (var12.field1052) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1086 != null && var20.field1086[var21] != null) {
														field76[field369] = var20.field1086[var21] + " @lre@" + var20.field1065;

														if (var21 == 3) {
															field141[field369] = 19;
														}

														if (var21 == 4) {
															field141[field369] = 936;
														}

														field142[field369] = var20.field1079;
														field139[field369] = var15;
														field140[field369] = var12.field999;
														field369++;
													} else if (var21 == 4) {
														field76[field369] = "Drop @lre@" + var20.field1065;
														field141[field369] = 936;
														field142[field369] = var20.field1079;
														field139[field369] = var15;
														field140[field369] = var12.field999;
														field369++;
													}
												}
											}

											if (var12.field1002) {
												field76[field369] = "Use @lre@" + var20.field1065;
												field141[field369] = 638;
												field142[field369] = var20.field1079;
												field139[field369] = var15;
												field140[field369] = var12.field999;
												field369++;
											}

											if (var12.field1052 && var20.field1086 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1086[var22] != null) {
														field76[field369] = var20.field1086[var22] + " @lre@" + var20.field1065;

														if (var22 == 0) {
															field141[field369] = 414;
														}

														if (var22 == 1) {
															field141[field369] = 424;
														}

														if (var22 == 2) {
															field141[field369] = 38;
														}

														field142[field369] = var20.field1079;
														field139[field369] = var15;
														field140[field369] = var12.field999;
														field369++;
													}
												}
											}

											if (var12.field1043 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1043[var23] != null) {
														field76[field369] = var12.field1043[var23] + " @lre@" + var20.field1065;

														if (var23 == 0) {
															field141[field369] = 155;
														}

														if (var23 == 1) {
															field141[field369] = 717;
														}

														if (var23 == 2) {
															field141[field369] = 242;
														}

														if (var23 == 3) {
															field141[field369] = 339;
														}

														if (var23 == 4) {
															field141[field369] = 509;
														}

														field142[field369] = var20.field1079;
														field139[field369] = var15;
														field140[field369] = var12.field999;
														field369++;
													}
												}
											}

											field76[field369] = "Examine @lre@" + var20.field1065;
											field141[field369] = 1455;
											field142[field369] = var20.field1079;
											field139[field369] = var15;
											field140[field369] = var12.field999;
											field369++;
										} else if ((field363 & 0x10) == 0x10) {
											field76[field369] = field364 + " @lre@" + var20.field1065;
											field141[field369] = 153;
											field142[field369] = var20.field1079;
											field139[field369] = var15;
											field140[field369] = var12.field999;
											field369++;
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

	@ObfuscatedName("client.f(B)V")
	public final void method161() {
		Graphics var1 = method194().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method429(1);

		if (field432) {
			field155 = false;
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

		if (field129) {
			field155 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field431) {
			field155 = false;
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

	@ObfuscatedName("client.a(IIILQHGHUTGN;IIIII)V")
	public final void method162(int arg0, int arg1, int arg2, QHGHUTGN arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field301) {
			field189 = 32;
		} else {
			field189 = 0;
		}

		field301 = false;
		if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg7 && arg0 < arg7 + 16) {
			arg3.field1018 -= field272 * 4;

			if (arg1 == 1) {
				field136 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field205 = true;
			}
		} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg6 + arg7 - 16 && arg0 < arg6 + arg7) {
			arg3.field1018 += field272 * 4;

			if (arg1 == 1) {
				field136 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field205 = true;
			}
		} else if (arg2 >= arg4 - field189 && arg2 < arg4 + field189 + 16 && arg0 >= arg7 + 16 && arg0 < arg6 + arg7 - 16 && field272 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg7 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg3.field1018 = (arg5 - arg6) * var10 / var11;

			if (arg1 == 1) {
				field136 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field205 = true;
			}

			field301 = true;
		}
	}

	@ObfuscatedName("client.b(LBSNPYLEV;IZ)V")
	public final void method163(BSNPYLEV arg0, int arg1) {
		field264 = 0;
		field279 = 0;
		method261(arg1, arg0);
		method124(arg0, arg1);
		method157(arg1, arg0);

		for (int var3 = 0; var3 < field264; var3++) {
			int var4 = field265[var3];
			if (field322 != field116[var4].field623) {
				field116[var4].field1283 = null;
				field116[var4] = null;
			}
		}

		if (arg0.field55 != arg1) {
			signlink.reporterror(field309 + " size mismatch in getnpcpos - pos:" + arg0.field55 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field117; var5++) {
			if (field116[field118[var5]] == null) {
				signlink.reporterror(field309 + " null entry in npc list - pos:" + var5 + " size:" + field117);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method164(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method164(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method165() {
		if (field337 != 0) {
			AKTTXKXI var1 = field234;
			int var2 = 0;
			if (field494 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field394[var3] != null) {
					int var4 = field392[var3];
					String var5 = field393[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field184 == 0 || field184 == 1 && method180(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method8(var8, "From", var7, 0);
						var1.method8(var8, "From", var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method6("From ");
						if (var6 == 1) {
							field308[0].method350(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field308[1].method350(var7 - 12, var11);
							var11 += 14;
						}

						var1.method8(var11, var5 + ": " + field394[var3], var7, 0);
						var1.method8(var11, var5 + ": " + field394[var3], var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field184 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method8(4, field394[var3], var9, 0);
						var1.method8(4, field394[var3], var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field184 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method8(4, "To " + var5 + ": " + field394[var3], var10, 0);
						var1.method8(4, "To " + var5 + ": " + field394[var3], var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILQHGHUTGN;II)V")
	public final void method166(int arg0, int arg1, QHGHUTGN arg2, int arg3) {
		if (arg2.field1026 == 0 && arg2.field991 != null && (!arg2.field1032 || field180 == arg2.field999 || field338 == arg2.field999 || field418 == arg2.field999)) {
			int var5 = TYMHEFTS.field1314;
			int var6 = TYMHEFTS.field1312;
			int var7 = TYMHEFTS.field1315;
			int var8 = TYMHEFTS.field1313;
			TYMHEFTS.method525(arg0, arg3, arg2.field1028 + arg3, arg2.field1049 + arg0);
			int var9 = arg2.field991.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field989[var10] + arg0;
				int var12 = arg2.field1003[var10] + arg3 - arg1;
				QHGHUTGN var13 = QHGHUTGN.method445(arg2.field991[var10]);
				var11 += var13.field998;
				var12 += var13.field995;

				if (var13.field1016 > 0) {
					method241(var13);
				}

				if (var13.field1026 == 0) {
					if (var13.field1018 > var13.field1011 - var13.field1028) {
						var13.field1018 = var13.field1011 - var13.field1028;
					}

					if (var13.field1018 < 0) {
						var13.field1018 = 0;
					}

					method166(var11, var13.field1018, var13, var12);

					if (var13.field1011 > var13.field1028) {
						method203(var12, var13.field1011, var13.field1018, var13.field1049 + var11, var13.field1028);
					}
				} else if (var13.field1026 != 1) {
					if (var13.field1026 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1028; var15++) {
							for (int var16 = 0; var16 < var13.field1049; var16++) {
								int var17 = (var13.field986 + 32) * var16 + var11;
								int var18 = (var13.field1050 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1031[var14];
									var18 += var13.field1020[var14];
								}

								if (var13.field1001[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1001[var14] - 1;
									if (var17 > TYMHEFTS.field1314 - 32 && var17 < TYMHEFTS.field1315 && var18 > TYMHEFTS.field1312 - 32 && var18 < TYMHEFTS.field1313 || field260 != 0 && field259 == var14) {
										int var22 = 0;
										if (field294 == 1 && field295 == var14 && field296 == var13.field999) {
											var22 = 0xFFFFFF;
										}

										BISLJVZR var23 = QSAFIBMX.method452(var13.field1051[var14], var21, var22);
										if (var23 != null) {
											if (field260 != 0 && field259 == var14 && field258 == var13.field999) {
												var19 = field964 - field261;
												var20 = field965 - field262;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field147 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method26(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < TYMHEFTS.field1312 && arg2.field1018 > 0) {
													int var24 = (TYMHEFTS.field1312 - var18 - var20) * field163 / 3;
													if (var24 > field163 * 10) {
														var24 = field163 * 10;
													}

													if (var24 > arg2.field1018) {
														var24 = arg2.field1018;
													}

													arg2.field1018 -= var24;
													field262 += var24;
												}

												if (var18 + var20 + 32 > TYMHEFTS.field1313 && arg2.field1018 < arg2.field1011 - arg2.field1028) {
													int var25 = (var18 + var20 + 32 - TYMHEFTS.field1313) * field163 / 3;
													if (var25 > field163 * 10) {
														var25 = field163 * 10;
													}

													if (var25 > arg2.field1011 - arg2.field1028 - arg2.field1018) {
														var25 = arg2.field1011 - arg2.field1028 - arg2.field1018;
													}

													arg2.field1018 += var25;
													field262 -= var25;
												}
											} else if (field111 != 0 && field110 == var14 && field109 == var13.field999) {
												var23.method26(var18, 128, var17);
											} else {
												var23.method24(var18, var17);
											}

											if (var23.field45 == 33 || var13.field1051[var14] != 1) {
												int var26 = var13.field1051[var14];
												field233.method8(var17 + var19 + 1, method143(var26), var18 + var20 + 10, 0);
												field233.method8(var17 + var19, method143(var26), var18 + var20 + 9, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1000 != null && var14 < 20) {
									BISLJVZR var27 = var13.field1000[var14];
									if (var27 != null) {
										var27.method24(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1026 == 3) {
						boolean var28 = false;
						if (field418 == var13.field999 || field338 == var13.field999 || field180 == var13.field999) {
							var28 = true;
						}

						int var29;
						if (method140(var13)) {
							var29 = var13.field1046;
							if (var28 && var13.field1044 != 0) {
								var29 = var13.field1044;
							}
						} else {
							var29 = var13.field1058;
							if (var28 && var13.field1034 != 0) {
								var29 = var13.field1034;
							}
						}

						if (var13.field1045 == 0) {
							if (var13.field992) {
								TYMHEFTS.method528(var13.field1049, var12, var11, var13.field1028, var29);
							} else {
								TYMHEFTS.method529(var13.field1049, var13.field1028, var12, var29, var11);
							}
						} else if (var13.field992) {
							TYMHEFTS.method527(var13.field1028, var13.field1049, var11, 256 - (var13.field1045 & 0xFF), var12, var29);
						} else {
							TYMHEFTS.method530(var11, var12, 256 - (var13.field1045 & 0xFF), var29, var13.field1049, var13.field1028);
						}
					} else if (var13.field1026 == 4) {
						AKTTXKXI var30 = var13.field1008;
						String var31 = var13.field1006;
						boolean var32 = false;
						if (field418 == var13.field999 || field338 == var13.field999 || field180 == var13.field999) {
							var32 = true;
						}

						int var33;
						if (method140(var13)) {
							var33 = var13.field1046;
							if (var32 && var13.field1044 != 0) {
								var33 = var13.field1044;
							}

							if (var13.field1030.length() > 0) {
								var31 = var13.field1030;
							}
						} else {
							var33 = var13.field1058;
							if (var32 && var13.field1034 != 0) {
								var33 = var13.field1034;
							}
						}

						if (var13.field1054 == 6 && field90) {
							var31 = "Please wait...";
							var33 = var13.field1058;
						}

						if (TYMHEFTS.field1310 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field23 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method225(method234(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method225(method234(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method225(method234(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method225(method234(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method225(method234(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1027) {
								var30.method5(var13.field1024, var41, var34, var33, var13.field1049 / 2 + var11);
							} else {
								var30.method12(var11, var13.field1024, var34, var41, var33);
							}

							var34 += var30.field23;
						}
					} else if (var13.field1026 == 5) {
						BISLJVZR var42;
						if (method140(var13)) {
							var42 = var13.field1019;
						} else {
							var42 = var13.field1021;
						}

						if (var42 != null) {
							var42.method24(var12, var11);
						}
					} else if (var13.field1026 == 6) {
						int var43 = IWBEAICJ.field735;
						int var44 = IWBEAICJ.field736;
						IWBEAICJ.field735 = var13.field1049 / 2 + var11;
						IWBEAICJ.field736 = var13.field1028 / 2 + var12;
						int var45 = IWBEAICJ.field739[var13.field1056] * var13.field1055 >> 16;
						int var46 = IWBEAICJ.field740[var13.field1056] * var13.field1055 >> 16;
						boolean var47 = method140(var13);
						int var48;
						if (var47) {
							var48 = var13.field1015;
						} else {
							var48 = var13.field1014;
						}

						RMLAXPMV var49;
						if (var48 == -1) {
							var49 = var13.method441(var47, -1, -1);
						} else {
							JZQVOFSF var50 = JZQVOFSF.field757[var48];
							var49 = var13.method441(var47, var50.field759[var13.field1025], var50.field760[var13.field1025]);
						}

						if (var49 != null) {
							var49.method487(0, var13.field1057, 0, var13.field1056, 0, var45, var46);
						}

						IWBEAICJ.field735 = var43;
						IWBEAICJ.field736 = var44;
					} else {
						if (var13.field1026 == 7) {
							AKTTXKXI var51 = var13.field1008;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1028; var53++) {
								for (int var54 = 0; var54 < var13.field1049; var54++) {
									if (var13.field1001[var52] > 0) {
										QSAFIBMX var55 = QSAFIBMX.method455(var13.field1001[var52] - 1);
										String var56 = String.valueOf(var55.field1065);
										if (var55.field1084 || var13.field1051[var52] != 1) {
											var56 = var56 + " x" + method243(var13.field1051[var52]);
										}

										int var57 = (var13.field986 + 115) * var54 + var11;
										int var58 = (var13.field1050 + 12) * var53 + var12;
										if (var13.field1027) {
											var51.method5(var13.field1024, var56, var58, var13.field1058, var13.field1049 / 2 + var57);
										} else {
											var51.method12(var57, var13.field1024, var58, var56, var13.field1058);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1026 == 8 && (field423 == var13.field999 || field353 == var13.field999 || field493 == var13.field999) && field192 == 100) {
							int var59 = 0;
							int var60 = 0;
							AKTTXKXI var61 = field234;
							String var62 = var13.field1006;
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

								int var65 = var61.method6(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field23 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1049 + var11 - var59 - 5;
							int var67 = var13.field1028 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1049 + arg0) {
								var66 = arg2.field1049 + arg0 - var59;
							}

							if (var60 + var67 > arg2.field1028 + arg3) {
								var67 = arg2.field1028 + arg3 - var60;
							}

							TYMHEFTS.method528(var59, var67, var66, var60, 0xFFFFA0);
							TYMHEFTS.method529(var59, var60, var67, 0, var66);
							String var68 = var13.field1006;
							int var69 = var61.field23 + var67 + 2;
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

								var61.method12(var66 + 3, false, var69, var71, 0);
								var69 += var61.field23 + 1;
							}
						}
					}
				}
			}

			TYMHEFTS.method525(var5, var6, var8, var7);
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method167() {
		try {
			if (field339 != null) {
				field339.method368();
			}
		} catch (Exception var2) {
		}

		field339 = null;
		field256 = false;
		field414 = 0;
		field309 = "";
		field310 = "";
		method252();
		field133.method375();

		for (int var1 = 0; var1 < 4; var1++) {
			field293[var1].method285();
		}

		System.gc();
		method144();
		field176 = -1;
		field86 = -1;
		field445 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;I)V")
	public final void method168(String arg0, String arg1) {
		if (field458 != null) {
			field458.method321();
			IWBEAICJ.field741 = field187;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field234.method4(0, var3, arg0, 257);
			field234.method4(0xFFFFFF, var3 - 1, arg0, 256);
			var3 += 15;
			if (arg1 != null) {
				field234.method4(0, var3, arg1, 257);
				field234.method4(0xFFFFFF, var3 - 1, arg1, 256);
			}

			field458.method322(4, field956, 4);
		} else if (field957 != null) {
			field957.method321();
			IWBEAICJ.field741 = field188;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			TYMHEFTS.method528(var5, var4 - var6 / 2 - 5, 383 - var5 / 2, var6, 0);
			TYMHEFTS.method529(var5, var6, var4 - var6 / 2 - 5, 0xFFFFFF, 383 - var5 / 2);

			if (arg1 != null) {
				var4 -= 7;
			}

			field234.method4(0, var4, arg0, 383);
			field234.method4(0xFFFFFF, var4 - 1, arg0, 382);
			var4 += 15;
			if (arg1 != null) {
				field234.method4(0, var4, arg1, 383);
				field234.method4(0xFFFFFF, var4 - 1, arg1, 382);
			}

			field957.method322(0, field956, 0);
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method169(int arg0, int arg1) {
		boolean var3 = false;
		QHGHUTGN var4 = QHGHUTGN.method445(arg1);
		for (int var5 = 0; var5 < var4.field991.length && var4.field991[var5] != -1; var5++) {
			QHGHUTGN var6 = QHGHUTGN.method445(var4.field991[var5]);
			if (var6.field1026 == 0) {
				var3 |= method169(arg0, var6.field999);
			}

			if (var6.field1026 == 6 && (var6.field1014 != -1 || var6.field1015 != -1)) {
				boolean var7 = method140(var6);
				int var8;
				if (var7) {
					var8 = var6.field1015;
				} else {
					var8 = var6.field1014;
				}

				if (var8 != -1) {
					JZQVOFSF var9 = JZQVOFSF.field757[var8];
					var6.field1004 += arg0;
					while (var6.field1004 > var9.method342(var6.field1025)) {
						var6.field1004 -= var9.method342(var6.field1025);
						var6.field1025++;
						if (var6.field1025 >= var9.field758) {
							var6.field1025 -= var9.field762;
							if (var6.field1025 < 0 || var6.field1025 >= var9.field758) {
								var6.field1025 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1026 == 6 && var6.field1012 != 0) {
				int var10 = var6.field1012 >> 16;
				int var11 = var6.field1012 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1056 = var6.field1056 + var10 & 0x7FF;
				var6.field1057 = var6.field1057 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method170(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field141[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 702) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method171() {
		if (field260 == 0) {
			field76[0] = "Cancel";
			field141[0] = 1122;
			field369 = 1;
			if (field375 == -1) {
				method228();
				field319 = 0;
				field80 = 0;

				if (field964 > 4 && field965 > 4 && field964 < 516 && field965 < 338) {
					if (field191 == -1) {
						method198();
					} else {
						method160(field965, 4, QHGHUTGN.method445(field191), 0, 4, 0, field964);
					}
				}

				if (field319 != field180) {
					field180 = field319;
				}

				if (field80 != field493) {
					field493 = field80;
				}

				field319 = 0;
				field80 = 0;

				if (field964 > 553 && field965 > 205 && field964 < 743 && field965 < 466) {
					if (field334 != -1) {
						method160(field965, 205, QHGHUTGN.method445(field334), 0, 553, 1, field964);
					} else if (field354[field488] != -1) {
						method160(field965, 205, QHGHUTGN.method445(field354[field488]), 0, 553, 1, field964);
					}
				}

				if (field338 != field319) {
					field136 = true;
					field338 = field319;
				}

				if (field80 != field353) {
					field136 = true;
					field353 = field80;
				}

				field319 = 0;
				field80 = 0;

				if (field964 > 17 && field965 > 357 && field964 < 496 && field965 < 453) {
					if (field128 != -1) {
						method160(field965, 357, QHGHUTGN.method445(field128), 0, 17, 2, field964);
					} else if (field247 != -1) {
						method160(field965, 357, QHGHUTGN.method445(field247), 0, 17, 3, field964);
					} else if (field965 < 434 && field964 < 426 && field218 == 0) {
						method256(field964 - 17, field965 - 357);
					}
				}

				if ((field128 != -1 || field247 != -1) && field418 != field319) {
					field205 = true;
					field418 = field319;
				}

				if ((field128 != -1 || field247 != -1) && field80 != field423) {
					field205 = true;
					field423 = field80;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field369 - 1; var2++) {
						if (field141[var2] < 1000 && field141[var2 + 1] > 1000) {
							String var3 = field76[var2];
							field76[var2] = field76[var2 + 1];
							field76[var2 + 1] = var3;
							int var4 = field141[var2];
							field141[var2] = field141[var2 + 1];
							field141[var2 + 1] = var4;
							int var5 = field139[var2];
							field139[var2] = field139[var2 + 1];
							field139[var2 + 1] = var5;
							int var6 = field140[var2];
							field140[var2] = field140[var2 + 1];
							field140[var2 + 1] = var6;
							int var7 = field142[var2];
							field142[var2] = field142[var2 + 1];
							field142[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field319 = 0;
				field80 = 0;
				method160(field965, 0, QHGHUTGN.method445(field375), 0, 0, 0, field964);

				if (field319 != field180) {
					field180 = field319;
				}

				if (field80 != field493) {
					field493 = field80;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method172(int arg0) {
		int var2 = AJLKWPFL.field2[arg0].field10;
		if (var2 != 0) {
			int var3 = field148[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					IWBEAICJ.method333(0.9D);
				}

				if (var3 == 2) {
					IWBEAICJ.method333(0.8D);
				}

				if (var3 == 3) {
					IWBEAICJ.method333(0.7D);
				}

				if (var3 == 4) {
					IWBEAICJ.method333(0.6D);
				}

				QSAFIBMX.field1089.method34();
				field83 = true;
			}

			if (var2 == 3) {
				boolean var4 = field216;

				if (var3 == 0) {
					method238(0, field216);
					field216 = true;
				}

				if (var3 == 1) {
					method238(-400, field216);
					field216 = true;
				}

				if (var3 == 2) {
					method238(-800, field216);
					field216 = true;
				}

				if (var3 == 3) {
					method238(-1200, field216);
					field216 = true;
				}

				if (var3 == 4) {
					field216 = false;
				}

				if (field216 != var4 && !field516) {
					if (field216) {
						field86 = field176;
						field87 = true;
						field417.method556(2, field86);
					} else {
						method144();
					}

					field445 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field249 = true;
					method199(0);
				}

				if (var3 == 1) {
					field249 = true;
					method199(-400);
				}

				if (var3 == 2) {
					field249 = true;
					method199(-800);
				}

				if (var3 == 3) {
					field249 = true;
					method199(-1200);
				}

				if (var3 == 4) {
					field249 = false;
				}
			}

			if (var2 == 5) {
				field119 = var3;
			}

			if (var2 == 6) {
				field174 = var3;
			}

			if (var2 == 8) {
				field337 = var3;
				field205 = true;
			}

			if (var2 == 9) {
				field468 = var3;
			}
		}
	}

	public final void run() {
		if (field81) {
			method142();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(LBSNPYLEV;BI)V")
	public final void method173(BSNPYLEV arg0, int arg1) {
		if (arg1 == 25) {
			int var3 = arg0.method66();
			int var4 = (var3 >> 4 & 0x7) + field463;
			int var5 = (var3 & 0x7) + field464;
			byte var6 = arg0.method69();
			int var7 = arg0.method74();
			int var8 = arg0.method75();
			int var9 = arg0.method67();
			int var10 = var9 >> 2;
			int var11 = var9 & 0x3;
			int var12 = field92[var10];
			byte var13 = arg0.method68();
			byte var14 = arg0.method68();
			int var15 = arg0.method73();
			byte var16 = arg0.method68();
			int var17 = arg0.method49();
			KZCOXKKW var18;
			if (field252 == var17) {
				var18 = field372;
			} else {
				var18 = field276[var17];
			}

			if (var18 != null) {
				RUROEYEG var19 = RUROEYEG.method494(var15);
				int var20 = field511[field156][var4][var5];
				int var21 = field511[field156][var4 + 1][var5];
				int var22 = field511[field156][var4 + 1][var5 + 1];
				int var23 = field511[field156][var4][var5 + 1];
				RMLAXPMV var24 = var19.method492(var10, var11, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method270(0, var12, -1, field156, var5, var7 + 1, var8 + 1, var4, 0);
					var18.field802 = field322 + var7;
					var18.field803 = field322 + var8;
					var18.field807 = var24;
					int var25 = var19.field1227;
					int var26 = var19.field1240;
					if (var11 == 1 || var11 == 3) {
						var25 = var19.field1240;
						var26 = var19.field1227;
					}

					var18.field804 = var4 * 128 + var25 * 64;
					var18.field806 = var5 * 128 + var26 * 64;
					var18.field805 = method159(var18.field806, field156, var18.field804);

					if (var16 > var14) {
						byte var27 = var16;
						var16 = var14;
						var14 = var27;
					}

					if (var6 > var13) {
						byte var28 = var6;
						var6 = var13;
						var13 = var28;
					}

					var18.field796 = var4 + var16;
					var18.field798 = var4 + var14;
					var18.field797 = var5 + var6;
					var18.field799 = var5 + var13;
				}
			}
		}

		if (arg1 == 174) {
			int var29 = arg0.method66();
			int var30 = (var29 >> 4 & 0x7) + field463;
			int var31 = (var29 & 0x7) + field464;
			int var32 = arg0.method74();
			int var33 = arg0.method75();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				KBARUPZK var34 = new KBARUPZK();
				var34.field774 = var33;
				var34.field773 = var32;

				if (field85[field156][var30][var31] == null) {
					field85[field156][var30][var31] = new FEIPMYNH();
				}

				field85[field156][var30][var31].method297(var34);
				method135(var30, var31);
			}
		} else if (arg1 == 152) {
			int var35 = arg0.method47();
			int var36 = (var35 >> 4 & 0x7) + field463;
			int var37 = (var35 & 0x7) + field464;
			int var38 = arg0.method49();
			int var39 = arg0.method49();
			int var40 = arg0.method49();
			if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
				FEIPMYNH var41 = field85[field156][var36][var37];
				if (var41 != null) {
					for (KBARUPZK var42 = (KBARUPZK) var41.method300(); var42 != null; var42 = (KBARUPZK) var41.method302()) {
						if ((var38 & 0x7FFF) == var42.field774 && var42.field773 == var39) {
							var42.field773 = var40;
							break;
						}
					}

					method135(var36, var37);
				}
			}
		} else {
			if (arg1 == 183) {
				int var43 = arg0.method47();
				int var44 = (var43 >> 4 & 0x7) + field463;
				int var45 = (var43 & 0x7) + field464;
				int var46 = arg0.method49();
				int var47 = arg0.method47();
				int var48 = var47 >> 4 & 0xF;
				int var49 = var47 & 0x7;
				if (field372.field590[0] >= var44 - var48 && field372.field590[0] <= var44 + var48 && field372.field591[0] >= var45 - var48 && field372.field591[0] <= var45 + var48 && field249 && !field516 && field263 < 50) {
					field282[field263] = var46;
					field410[field263] = var49;
					field193[field263] = DCZESDQX.field543[var46];
					field263++;
				}
			}

			if (arg1 == 128) {
				int var50 = arg0.method66();
				int var51 = var50 >> 2;
				int var52 = var50 & 0x3;
				int var53 = field92[var51];
				int var54 = arg0.method47();
				int var55 = (var54 >> 4 & 0x7) + field463;
				int var56 = (var54 & 0x7) + field464;
				if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
					method270(var52, var53, -1, field156, var56, 0, -1, var55, var51);
				}
			} else if (arg1 == 143) {
				int var57 = arg0.method47();
				int var58 = (var57 >> 4 & 0x7) + field463;
				int var59 = (var57 & 0x7) + field464;
				int var60 = arg0.method49();
				int var61 = arg0.method47();
				int var62 = arg0.method49();
				if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
					var58 = var58 * 128 + 64;
					var59 = var59 * 128 + 64;
					RUSNMPGH var63 = new RUSNMPGH(field322, var58, var62, var59, method159(var59, field156, var58) - var61, field156, var60);
					field165.method297(var63);
				}
			} else if (arg1 == 168) {
				int var64 = arg0.method75();
				int var65 = arg0.method47();
				int var66 = var65 >> 2;
				int var67 = var65 & 0x3;
				int var68 = field92[var66];
				int var69 = arg0.method47();
				int var70 = (var69 >> 4 & 0x7) + field463;
				int var71 = (var69 & 0x7) + field464;
				if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
					method270(var67, var68, var64, field156, var71, 0, -1, var70, var66);
				}
			} else if (arg1 == 201) {
				int var72 = arg0.method75();
				int var73 = arg0.method66();
				int var74 = (var73 >> 4 & 0x7) + field463;
				int var75 = (var73 & 0x7) + field464;
				if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
					FEIPMYNH var76 = field85[field156][var74][var75];
					if (var76 != null) {
						for (KBARUPZK var77 = (KBARUPZK) var76.method300(); var77 != null; var77 = (KBARUPZK) var76.method302()) {
							if ((var72 & 0x7FFF) == var77.field774) {
								var77.method518();
								break;
							}
						}

						if (var76.method300() == null) {
							field85[field156][var74][var75] = null;
						}

						method135(var74, var75);
					}
				}
			} else if (arg1 == 1) {
				int var78 = arg0.method66();
				int var79 = (var78 >> 4 & 0x7) + field463;
				int var80 = (var78 & 0x7) + field464;
				int var81 = arg0.method74();
				int var82 = arg0.method73();
				int var83 = arg0.method74();
				if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && field252 != var83) {
					KBARUPZK var84 = new KBARUPZK();
					var84.field774 = var81;
					var84.field773 = var82;

					if (field85[field156][var79][var80] == null) {
						field85[field156][var79][var80] = new FEIPMYNH();
					}

					field85[field156][var79][var80].method297(var84);
					method135(var79, var80);
				}
			} else if (arg1 == 39) {
				int var85 = arg0.method67();
				int var86 = var85 >> 2;
				int var87 = var85 & 0x3;
				int var88 = field92[var86];
				int var89 = arg0.method73();
				int var90 = arg0.method66();
				int var91 = (var90 >> 4 & 0x7) + field463;
				int var92 = (var90 & 0x7) + field464;
				if (var91 >= 0 && var92 >= 0 && var91 < 103 && var92 < 103) {
					int var93 = field511[field156][var91][var92];
					int var94 = field511[field156][var91 + 1][var92];
					int var95 = field511[field156][var91 + 1][var92 + 1];
					int var96 = field511[field156][var91][var92 + 1];
					if (var88 == 0) {
						XKKREZQI var97 = field133.method397(var92, var91, field156);
						if (var97 != null) {
							int var98 = var97.field1427 >> 14 & 0x7FFF;
							if (var86 == 2) {
								var97.field1425 = new SBGQSXPV(var95, var87 + 4, var98, 2, var89, false, var96, var94, var93);
								var97.field1426 = new SBGQSXPV(var95, var87 + 1 & 0x3, var98, 2, var89, false, var96, var94, var93);
							} else {
								var97.field1425 = new SBGQSXPV(var95, var87, var98, var86, var89, false, var96, var94, var93);
							}
						}
					}

					if (var88 == 1) {
						LLXCBPPM var99 = field133.method398(var92, field156, var91);
						if (var99 != null) {
							var99.field815 = new SBGQSXPV(var95, 0, var99.field816 >> 14 & 0x7FFF, 4, var89, false, var96, var94, var93);
						}
					}

					if (var88 == 2) {
						HKDYAITE var100 = field133.method399(var91, var92, field156);

						if (var86 == 11) {
							var86 = 10;
						}

						if (var100 != null) {
							var100.field653 = new SBGQSXPV(var95, var87, var100.field661 >> 14 & 0x7FFF, var86, var89, false, var96, var94, var93);
						}
					}

					if (var88 == 3) {
						HBBXCRCI var101 = field133.method400(var92, var91, field156);
						if (var101 != null) {
							var101.field635 = new SBGQSXPV(var95, var87, var101.field636 >> 14 & 0x7FFF, 22, var89, false, var96, var94, var93);
						}
					}
				}
			} else if (arg1 == 99) {
				int var102 = arg0.method47();
				int var103 = (var102 >> 4 & 0x7) + field463;
				int var104 = (var102 & 0x7) + field464;
				int var105 = var103 + arg0.method48();
				int var106 = var104 + arg0.method48();
				int var107 = arg0.method50();
				int var108 = arg0.method49();
				int var109 = arg0.method47() * 4;
				int var110 = arg0.method47() * 4;
				int var111 = arg0.method49();
				int var112 = arg0.method49();
				int var113 = arg0.method47();
				int var114 = arg0.method47();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
					var103 = var103 * 128 + 64;
					var104 = var104 * 128 + 64;
					var105 = var105 * 128 + 64;
					var106 = var106 * 128 + 64;
					RGPDRBLW var115 = new RGPDRBLW(field322 + var111, var108, var113, var114, field156, var103, var110, method159(var104, field156, var103) - var109, field322 + var112, var107, var104);
					var115.method460(method159(var106, field156, var105) - var110, var105, var106, field322 + var111);
					field505.method297(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method174() {
		field77.method36(224);

		if (field334 != -1) {
			method152(field334);
			field334 = -1;
			field136 = true;
			field90 = false;
			field217 = true;
		}

		if (field128 != -1) {
			method152(field128);
			field128 = -1;
			field205 = true;
			field90 = false;
		}

		if (field375 != -1) {
			method152(field375);
			field375 = -1;
			field83 = true;
		}

		if (field367 != -1) {
			method152(field367);
			field367 = -1;
		}

		if (field191 != -1) {
			method152(field191);
			field191 = -1;
		}
	}

	@ObfuscatedName("client.a(ZILBSNPYLEV;)V")
	public final void method175(int arg0, BSNPYLEV arg1) {
		arg1.method57();
		int var3 = arg1.method58(1);
		if (var3 != 0) {
			int var4 = arg1.method58(2);
			if (var4 == 0) {
				field280[field279++] = field275;
			} else if (var4 == 1) {
				int var5 = arg1.method58(3);
				field372.method305(false, var5);
				int var6 = arg1.method58(1);
				if (var6 == 1) {
					field280[field279++] = field275;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method58(3);
				field372.method305(true, var7);
				int var8 = arg1.method58(3);
				field372.method305(true, var8);
				int var9 = arg1.method58(1);
				if (var9 == 1) {
					field280[field279++] = field275;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method58(7);
				field156 = arg1.method58(2);
				int var11 = arg1.method58(1);
				int var12 = arg1.method58(7);
				int var13 = arg1.method58(1);
				if (var13 == 1) {
					field280[field279++] = field275;
				}

				field372.method309(var12, var10, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.p(I)Ljava/net/Socket;")
	public final Socket method176(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.i(B)V")
	public final void method177() {
		if (field957 == null) {
			method240();
			field93 = null;
			field94 = null;
			field95 = null;
			field96 = null;
			field97 = null;
			field98 = null;
			field99 = null;
			field100 = null;
			field101 = null;
			field459 = null;
			field457 = null;
			field456 = null;
			field458 = null;
			field197 = null;
			field198 = null;
			field199 = null;
			field957 = new IOGVZQTL(765, 503, method194());
			field83 = true;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method178() {
		method165();

		if (field348 == 1) {
			field470[field347 / 100].method24(field346 - 8 - 4, field345 - 8 - 4);
		}

		if (field348 == 2) {
			field470[field347 / 100 + 4].method24(field346 - 8 - 4, field345 - 8 - 4);
		}

		if (field126 != -1) {
			method169(field163, field126);
			method166(0, 0, QHGHUTGN.method445(field126), 0);
		}

		if (field191 != -1) {
			method169(field163, field191);
			method166(0, 0, QHGHUTGN.method445(field191), 0);
		}

		method210();

		if (!field376) {
			method171();
			method190();
		} else if (field440 == 0) {
			method239();
		}

		if (field311 == 1) {
			field79.method24(296, 472);
		}

		if (field267) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field952 < 30 && field516) {
				var3 = 0xFF0000;
			}

			if (field952 < 20 && !field516) {
				var3 = 0xFF0000;
			}

			field234.method3(var1, "Fps:" + field952, var3, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field516) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field516) {
				int var8 = 0xFF0000;
			}

			field234.method3(var1, "Mem:" + var5 + "k", 0xFFFF00, var2);
			var2 += 15;
		}

		if (field494 != 0) {
			int var9 = field494 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field234.method8(4, "System update in: " + var10 + ":0" + var9, 329, 0xFFFF00);
			} else {
				field234.method8(4, "System update in: " + var10 + ":" + var9, 329, 0xFFFF00);
			}

			field406++;
			if (field406 > 68) {
				field406 = 0;
				field77.method36(179);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILQHGHUTGN;)Z")
	public final boolean method179(QHGHUTGN arg0) {
		int var2 = arg0.field1016;
		if (field389 == 2) {
			if (var2 == 201) {
				field205 = true;
				field218 = 0;
				field162 = true;
				field477 = "";
				field190 = 1;
				field433 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field205 = true;
				field218 = 0;
				field162 = true;
				field477 = "";
				field190 = 2;
				field433 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field328 = 250;
			return true;
		}

		if (var2 == 501) {
			field205 = true;
			field218 = 0;
			field162 = true;
			field477 = "";
			field190 = 4;
			field433 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field205 = true;
			field218 = 0;
			field162 = true;
			field477 = "";
			field190 = 5;
			field433 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field88[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = GLRCYUHA.field624 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= GLRCYUHA.field624) {
							var5 = 0;
						}
					}

					if (!GLRCYUHA.field625[var5].field631 && GLRCYUHA.field625[var5].field626 == var3 + (field302 ? 0 : 7)) {
						break;
					}
				}

				field88[var3] = var5;
				field182 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field490[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field336[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field336[var6].length) {
					var8 = 0;
				}
			}

			field490[var6] = var8;
			field182 = true;
		}

		if (var2 == 324 && !field302) {
			field302 = true;
			method223();
		}

		if (var2 == 325 && field302) {
			field302 = false;
			method223();
		}

		if (var2 == 326) {
			field77.method36(66);
			field77.method37(field302 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field77.method37(field88[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field77.method37(field490[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field143 = !field143;
		}

		if (var2 >= 601 && var2 <= 613) {
			method174();

			if (field132.length() > 0) {
				field77.method36(32);
				field77.method43(SFBUQEXP.method505(field132));
				field77.method37(var2 - 601);
				field77.method37(field143 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method180(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field388; var2++) {
			if (arg0.equalsIgnoreCase(field373[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field372.field786)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method181(long arg0) {
		if (arg0 != 0L) {
			if (field430 >= 100) {
				method267("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = SFBUQEXP.method509(SFBUQEXP.method506(arg0));
				for (int var4 = 0; var4 < field430; var4++) {
					if (field232[var4] == arg0) {
						method267("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field388; var5++) {
					if (field231[var5] == arg0) {
						method267("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field232[field430++] = arg0;
				field136 = true;
				field77.method36(166);
				field77.method43(arg0);
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method182() {
		field83 = true;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method183() {
		try {
			field323 = -1;
			field165.method304();
			field505.method304();
			IWBEAICJ.method327();
			method252();
			field133.method375();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field293[var1].method285();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field460[var2][var3][var4] = 0;
					}
				}
			}

			WZFUDUYZ var5 = new WZFUDUYZ(104, field460, 104, field511);
			int var6 = field127.length;
			field77.method36(11);

			if (!field462) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field341[var7] >> 8) * 64 - field285;
					int var9 = (field341[var7] & 0xFF) * 64 - field286;
					byte[] var10 = field127[var7];
					if (var10 != null) {
						var5.method573((field370 - 6) * 8, field293, (field371 - 6) * 8, var10, var8, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field341[var11] >> 8) * 64 - field285;
					int var13 = (field341[var11] & 0xFF) * 64 - field286;
					byte[] var14 = field127[var11];
					if (var14 == null && field371 < 800) {
						var5.method577(64, var12, var13, 64);
					}
				}

				field77.method36(11);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field384[var15];
					if (var16 != null) {
						int var17 = (field341[var15] >> 8) * 64 - field285;
						int var18 = (field341[var15] & 0xFF) * 64 - field286;
						var5.method567(var16, field293, field133, var17, var18);
					}
				}
			}

			if (field462) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field368[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field341.length; var29++) {
									if (field341[var29] == var28 && field127[var29] != null) {
										var5.method566(field293, (var27 & 0x7) * 8, var24, var20 * 8, var21 * 8, field127[var29], var19, (var26 & 0x7) * 8, var25);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method576(var20 * 8, var21 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field368[0][var30][var31];
						if (var32 == -1) {
							var5.method577(8, var30 * 8, var31 * 8, 8);
						}
					}
				}

				field77.method36(11);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field368[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field341.length; var42++) {
									if (field341[var42] == var41 && field384[var42] != null) {
										var5.method568(var33, (var40 & 0x7) * 8, field293, var37, var34 * 8, (var39 & 0x7) * 8, field384[var42], var38, var35 * 8, field133);
										break;
									}
								}
							}
						}
					}
				}
			}

			field77.method36(11);
			var5.method564(field133, field293);

			if (field458 != null) {
				field458.method321();
				IWBEAICJ.field741 = field187;
			}

			field77.method36(11);
			int var43 = WZFUDUYZ.field1409;
			if (var43 > field156) {
				var43 = field156;
			}

			if (var43 < field156 - 1) {
				int var44 = field156 - 1;
			}

			if (field516) {
				field133.method376(WZFUDUYZ.field1409);
			} else {
				field133.method376(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method135(var45, var46);
				}
			}

			method260();
		} catch (Exception var59) {
		}

		RUROEYEG.field1207.method34();

		if (field959 != null) {
			field77.method36(146);
			field77.method41(1057001181);
		}

		if (field516 && signlink.cache_dat != null) {
			int var48 = field417.method544(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field417.method539(var49);
				if ((var50 & 0x79) == 0) {
					RMLAXPMV.method465(var49);
				}
			}
		}

		System.gc();
		IWBEAICJ.method328(20);
		field417.method554();
		int var51 = (field370 - 6) / 8 - 1;
		int var52 = (field370 + 6) / 8 + 1;
		int var53 = (field371 - 6) / 8 - 1;
		int var54 = (field371 + 6) / 8 + 1;
		if (field175) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field417.method541(0, var55, var56);
					if (var57 != -1) {
						field417.method549(3, var57);
					}

					int var58 = field417.method541(1, var55, var56);
					if (var58 != -1) {
						field417.method549(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLFSZDVUBI;)V")
	public final void method184(int arg0, FSZDVUBI arg1) {
		method185(arg0, arg1.field593, arg1.field594);
	}

	@ObfuscatedName("client.d(IIII)V")
	public final void method185(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method159(arg2, field156, arg1) - arg0;
			arg1 -= field220;
			var4 -= field221;
			arg2 -= field222;
			int var5 = RMLAXPMV.field1201[field223];
			int var6 = RMLAXPMV.field1202[field223];
			int var7 = RMLAXPMV.field1201[field224];
			int var8 = RMLAXPMV.field1202[field224];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field268 = (var9 << 9) / arg2 + IWBEAICJ.field735;
				field269 = (var11 << 9) / arg2 + IWBEAICJ.field736;
			} else {
				field268 = -1;
				field269 = -1;
			}
		} else {
			field268 = -1;
			field269 = -1;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method186() {
		field197 = null;
		field198 = null;
		field199 = null;
		field461 = null;
		field98 = null;
		field99 = null;
		field100 = null;
		field101 = null;
		field482 = null;
		field483 = null;
		field484 = null;
		field485 = null;
		field486 = null;
		field115 = null;
		field171 = null;
		field172 = null;
		field173 = null;
		field456 = null;
		field457 = null;
		field458 = null;
		field459 = null;
		field472 = null;
		field473 = null;
		field474 = null;
		field475 = null;
		field476 = null;
		field499 = null;
		field500 = null;
		field501 = null;
		field502 = null;
		field503 = null;
		field304 = null;
		field305 = null;
		field257 = null;
		field399 = null;
		field149 = null;
		field148 = null;

		try {
			if (field339 != null) {
				field339.method368();
			}
		} catch (Exception var1) {
		}

		field339 = null;
		field79 = null;
		field255 = null;

		if (field480 != null) {
			field480.field719 = false;
		}

		field480 = null;
		field77 = null;
		field120 = null;
		field390 = null;
		field344 = null;

		if (field417 != null) {
			field417.method559();
		}

		field417 = null;
		field495 = null;
		field496 = null;
		field497 = null;
		field498 = null;
		field251 = null;
		field276 = null;
		field278 = null;
		field280 = null;
		field281 = null;
		field265 = null;
		field505 = null;
		field165 = null;
		method144();
		field511 = null;
		field460 = null;
		field133 = null;
		field293 = null;
		field85 = null;
		field291 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field142 = null;
		field76 = null;
		field96 = null;
		field97 = null;
		field93 = null;
		field94 = null;
		field95 = null;
		field400 = null;
		field401 = null;
		field402 = null;
		field403 = null;
		field404 = null;
		field373 = null;
		field231 = null;
		field318 = null;
		field102 = null;
		field419 = null;
		field398 = null;
		field211 = null;
		field357 = null;
		field470 = null;
		field341 = null;
		field127 = null;
		field384 = null;
		field342 = null;
		field343 = null;
		field194 = null;
		field481 = null;
		field124 = null;
		field125 = null;
		field381 = null;
		field382 = null;
		field383 = null;
		field116 = null;
		field118 = null;
		method240();
		RUROEYEG.method495();
		YSYPMZMO.method595();
		QSAFIBMX.method451();
		QHGHUTGN.method436();
		VDWALSCV.field1323 = null;
		GLRCYUHA.field625 = null;
		AQJFHSBW.field30 = null;
		JZQVOFSF.field757 = null;
		MHWTJCHJ.field839 = null;
		MHWTJCHJ.field851 = null;
		AJLKWPFL.field2 = null;
		field957 = null;
		KZCOXKKW.field788 = null;
		IWBEAICJ.method324();
		PAJXYXWG.method374();
		RMLAXPMV.method462();
		XMRZESBN.method584();
		System.gc();
	}

	@ObfuscatedName("client.s(I)V")
	public final void method187() {
		for (RUSNMPGH var1 = (RUSNMPGH) field165.method300(); var1 != null; var1 = (RUSNMPGH) field165.method302()) {
			if (field156 != var1.field1255 || var1.field1253) {
				var1.method518();
			} else if (field322 >= var1.field1252) {
				var1.method503(field163);

				if (var1.field1253) {
					var1.method518();
				} else {
					field133.method386(var1, var1.field1255, 0, false, -1, var1.field1258, 60, var1.field1257, var1.field1256);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method188(String arg0) {
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

	@ObfuscatedName("client.a(ZI)V")
	public final void method189(int arg0) {
		QHGHUTGN var2 = QHGHUTGN.method445(arg0);
		for (int var3 = 0; var3 < var2.field991.length && var2.field991[var3] != -1; var3++) {
			QHGHUTGN var4 = QHGHUTGN.method445(var2.field991[var3]);
			if (var4.field1026 == 1) {
				method189(var4.field999);
			}

			var4.field1025 = 0;
			var4.field1004 = 0;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method190() {
		if (field369 >= 2 || field294 != 0 || field361 != 0) {
			String var1;
			if (field294 == 1 && field369 < 2) {
				var1 = "Use " + field298 + " with...";
			} else if (field361 == 1 && field369 < 2) {
				var1 = field364 + "...";
			} else {
				var1 = field76[field369 - 1];
			}

			if (field369 > 2) {
				var1 = var1 + "@whi@ / " + (field369 - 2) + " more options";
			}

			field235.method13(true, var1, 4, 0xFFFFFF, field322 / 1000, 15);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field959 != null) {
				return new URL("http://127.0.0.1:" + (field514 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method191(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field430; var3++) {
				if (field232[var3] == arg0) {
					field430--;
					field136 = true;

					for (int var4 = var3; var4 < field430; var4++) {
						field232[var4] = field232[var4 + 1];
					}

					field77.method36(87);
					field77.method43(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method192() {
		if (field970 == 1) {
			if (field971 >= 6 && field971 <= 106 && field972 >= 467 && field972 <= 499) {
				field492 = (field492 + 1) % 4;
				field75 = true;
				field205 = true;
				field77.method36(24);
				field77.method37(field492);
				field77.method37(field184);
				field77.method37(field179);
			}

			if (field971 >= 135 && field971 <= 235 && field972 >= 467 && field972 <= 499) {
				field184 = (field184 + 1) % 3;
				field75 = true;
				field205 = true;
				field77.method36(24);
				field77.method37(field492);
				field77.method37(field184);
				field77.method37(field179);
			}

			if (field971 >= 273 && field971 <= 373 && field972 >= 467 && field972 <= 499) {
				field179 = (field179 + 1) % 3;
				field75 = true;
				field205 = true;
				field77.method36(24);
				field77.method37(field492);
				field77.method37(field184);
				field77.method37(field179);
			}

			if (field971 >= 412 && field971 <= 512 && field972 >= 467 && field972 <= 499) {
				if (field191 == -1) {
					method174();
					field132 = "";
					field143 = false;
					field408 = field191 = QHGHUTGN.field997;
					return;
				}

				method267("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void method193() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field335);

		if (field417 != null) {
			System.out.println("Od-cycle:" + field417.field1361);
		}

		System.out.println("loop-cycle:" + field322);
		System.out.println("draw-cycle:" + field395);
		System.out.println("ptype:" + field325);
		System.out.println("psize:" + field324);

		if (field339 != null) {
			field339.method373();
		}

		field953 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method194() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field959 != null) {
			return field959;
		}

		return this;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method195() {
		if (field93 == null) {
			field957 = null;
			field459 = null;
			field457 = null;
			field456 = null;
			field458 = null;
			field197 = null;
			field198 = null;
			field199 = null;
			field96 = new IOGVZQTL(128, 265, method194());
			TYMHEFTS.method526();
			field97 = new IOGVZQTL(128, 265, method194());
			TYMHEFTS.method526();
			field93 = new IOGVZQTL(509, 171, method194());
			TYMHEFTS.method526();
			field94 = new IOGVZQTL(360, 132, method194());
			TYMHEFTS.method526();
			field95 = new IOGVZQTL(360, 200, method194());
			TYMHEFTS.method526();
			field98 = new IOGVZQTL(202, 238, method194());
			TYMHEFTS.method526();
			field99 = new IOGVZQTL(203, 238, method194());
			TYMHEFTS.method526();
			field100 = new IOGVZQTL(74, 94, method194());
			TYMHEFTS.method526();
			field101 = new IOGVZQTL(75, 94, method194());
			TYMHEFTS.method526();

			if (field469 != null) {
				method133();
				method129();
			}

			field83 = true;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method196() {
		int var1 = 5;
		field270[8] = 0;
		int var2 = 0;
		while (field270[8] == 0) {
			String var3 = "Unknown problem";
			method158(20, "Connecting to web server");

			try {
				DataInputStream var4 = method154("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 375);
				BSNPYLEV var5 = new BSNPYLEV(new byte[40]);
				var4.readFully(var5.field54, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field270[var6] = var5.method52();
				}

				int var7 = var5.method52();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field270[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field270[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field270[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field270[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field270[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field270[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method158(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method158(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field152 = !field152;
			}
		}
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method197(int arg0, int arg1) {
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

	@ObfuscatedName("client.e(Z)V")
	public final void method198() {
		if (field294 == 0 && field361 == 0) {
			field76[field369] = "Walk here";
			field141[field369] = 46;
			field139[field369] = field964;
			field140[field369] = field965;
			field369++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < RMLAXPMV.field1199; var2++) {
			int var3 = RMLAXPMV.field1200[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field133.method405(field156, var4, var5, var3) >= 0) {
					RUROEYEG var8 = RUROEYEG.method494(var7);
					if (var8.field1233 != null) {
						var8 = var8.method493();
					}

					if (var8 == null) {
						continue;
					}

					if (field294 == 1) {
						field76[field369] = "Use " + field298 + " with @cya@" + var8.field1217;
						field141[field369] = 653;
						field142[field369] = var3;
						field139[field369] = var4;
						field140[field369] = var5;
						field369++;
					} else if (field361 != 1) {
						if (var8.field1235 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1235[var9] != null) {
									field76[field369] = var8.field1235[var9] + " @cya@" + var8.field1217;

									if (var9 == 0) {
										field141[field369] = 51;
									}

									if (var9 == 1) {
										field141[field369] = 66;
									}

									if (var9 == 2) {
										field141[field369] = 824;
									}

									if (var9 == 3) {
										field141[field369] = 106;
									}

									if (var9 == 4) {
										field141[field369] = 1359;
									}

									field142[field369] = var3;
									field139[field369] = var4;
									field140[field369] = var5;
									field369++;
								}
							}
						}

						field76[field369] = "Examine @cya@" + var8.field1217;
						field141[field369] = 1456;
						field142[field369] = var8.field1225 << 14;
						field139[field369] = var4;
						field140[field369] = var5;
						field369++;
					} else if ((field363 & 0x4) == 4) {
						field76[field369] = field364 + " @cya@" + var8.field1217;
						field141[field369] = 546;
						field142[field369] = var3;
						field139[field369] = var4;
						field140[field369] = var5;
						field369++;
					}
				}

				if (var6 == 1) {
					TOFRUGLM var10 = field116[var7];
					if (var10.field1283.field1457 == 1 && (var10.field593 & 0x7F) == 0x40 && (var10.field594 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field117; var11++) {
							TOFRUGLM var12 = field116[field118[var11]];
							if (var12 != null && var10 != var12 && var12.field1283.field1457 == 1 && var10.field593 == var12.field593 && var10.field594 == var12.field594) {
								method229(var5, field118[var11], var12.field1283, var4);
							}
						}

						for (int var13 = 0; var13 < field277; var13++) {
							KZCOXKKW var14 = field276[field278[var13]];
							if (var14 != null && var10.field593 == var14.field593 && var10.field594 == var14.field594) {
								method208(field278[var13], var5, var4, var14);
							}
						}
					}

					method229(var5, var7, var10.field1283, var4);
				}

				if (var6 == 0) {
					KZCOXKKW var15 = field276[var7];
					if ((var15.field593 & 0x7F) == 0x40 && (var15.field594 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field117; var16++) {
							TOFRUGLM var17 = field116[field118[var16]];
							if (var17 != null && var17.field1283.field1457 == 1 && var15.field593 == var17.field593 && var15.field594 == var17.field594) {
								method229(var5, field118[var16], var17.field1283, var4);
							}
						}

						for (int var18 = 0; var18 < field277; var18++) {
							KZCOXKKW var19 = field276[field278[var18]];
							if (var19 != null && var15 != var19 && var15.field593 == var19.field593 && var15.field594 == var19.field594) {
								method208(field278[var18], var5, var4, var19);
							}
						}
					}

					method208(var7, var5, var4, var15);
				}

				if (var6 == 3) {
					FEIPMYNH var20 = field85[field156][var4][var5];
					if (var20 != null) {
						for (KBARUPZK var21 = (KBARUPZK) var20.method301(); var21 != null; var21 = (KBARUPZK) var20.method303()) {
							QSAFIBMX var22 = QSAFIBMX.method455(var21.field774);
							if (field294 == 1) {
								field76[field369] = "Use " + field298 + " with @lre@" + var22.field1065;
								field141[field369] = 196;
								field142[field369] = var21.field774;
								field139[field369] = var4;
								field140[field369] = var5;
								field369++;
							} else if (field361 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1071 != null && var22.field1071[var23] != null) {
										field76[field369] = var22.field1071[var23] + " @lre@" + var22.field1065;

										if (var23 == 0) {
											field141[field369] = 864;
										}

										if (var23 == 1) {
											field141[field369] = 995;
										}

										if (var23 == 2) {
											field141[field369] = 941;
										}

										if (var23 == 3) {
											field141[field369] = 808;
										}

										if (var23 == 4) {
											field141[field369] = 656;
										}

										field142[field369] = var21.field774;
										field139[field369] = var4;
										field140[field369] = var5;
										field369++;
									} else if (var23 == 2) {
										field76[field369] = "Take @lre@" + var22.field1065;
										field141[field369] = 941;
										field142[field369] = var21.field774;
										field139[field369] = var4;
										field140[field369] = var5;
										field369++;
									}
								}

								field76[field369] = "Examine @lre@" + var22.field1065;
								field141[field369] = 1686;
								field142[field369] = var21.field774;
								field139[field369] = var4;
								field140[field369] = var5;
								field369++;
							} else if ((field363 & 0x1) == 1) {
								field76[field369] = field364 + " @lre@" + var22.field1065;
								field141[field369] = 735;
								field142[field369] = var21.field774;
								field139[field369] = var4;
								field140[field369] = var5;
								field369++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method199(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIIIIIZIIZII)Z")
	public final boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field194[var14][var15] = 0;
				field481[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg4;
		field194[arg7][arg4] = 99;
		field481[arg7][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field124[var18] = arg7;
		int var39 = var18 + 1;
		field125[var18] = arg4;
		boolean var20 = false;
		int var21 = field124.length;
		int[][] var22 = field293[field156].field565;
		while (var39 != var19) {
			var16 = field124[var19];
			var17 = field125[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field293[field156].method294(arg10, var17, arg9, var16, arg0 - 1, arg3)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field293[field156].method295(arg0 - 1, var17, arg3, arg10, var16, arg9)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg1 != 0 && field293[field156].method296(arg2, arg6, var17, arg3, arg1, var16, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field481[var16][var17] + 1;
			if (var16 > 0 && field194[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field124[var39] = var16 - 1;
				field125[var39] = var17;
				var39 = (var39 + 1) % var21;
				field194[var16 - 1][var17] = 2;
				field481[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field194[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field124[var39] = var16 + 1;
				field125[var39] = var17;
				var39 = (var39 + 1) % var21;
				field194[var16 + 1][var17] = 8;
				field481[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field194[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field124[var39] = var16;
				field125[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field194[var16][var17 - 1] = 1;
				field481[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field194[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field124[var39] = var16;
				field125[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field194[var16][var17 + 1] = 4;
				field481[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field194[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field124[var39] = var16 - 1;
				field125[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field194[var16 - 1][var17 - 1] = 3;
				field481[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field194[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field124[var39] = var16 + 1;
				field125[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field194[var16 + 1][var17 - 1] = 9;
				field481[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field194[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field124[var39] = var16 - 1;
				field125[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field194[var16 - 1][var17 + 1] = 6;
				field481[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field194[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field124[var39] = var16 + 1;
				field125[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field194[var16 + 1][var17 + 1] = 12;
				field481[var16 + 1][var17 + 1] = var23;
			}
		}

		field123 = 0;
		if (!var20) {
			if (!arg8) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg3 - var26; var27 <= arg3 + var26; var27++) {
				for (int var28 = arg10 - var26; var28 <= arg10 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field481[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg3) {
							var29 = arg3 - var27;
						} else if (var27 > arg2 + arg3 - 1) {
							var29 = var27 + 1 - arg2 - arg3;
						}

						int var30 = 0;
						if (var28 < arg10) {
							var30 = arg10 - var28;
						} else if (var28 > arg1 + arg10 - 1) {
							var30 = var28 + 1 - arg1 - arg10;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field481[var27][var28] < var25) {
							var24 = var31;
							var25 = field481[var27][var28];
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

			field123 = 1;
		}

		byte var32 = 0;
		field124[var32] = var16;
		int var40 = var32 + 1;
		field125[var32] = var17;
		int var33;
		int var34 = var33 = field194[var16][var17];
		while (arg7 != var16 || arg4 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field124[var40] = var16;
				field125[var40++] = var17;
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

			var34 = field194[var16][var17];
		}

		if (var40 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field124[var40];
		int var37 = field125[var40];

		if (arg5 == 0) {
			field77.method36(5);
			field77.method37(var35 + var35 + 3);
		}

		if (arg5 == 1) {
			field77.method36(41);
			field77.method37(var35 + var35 + 3 + 14);
		}

		if (arg5 == 2) {
			field77.method36(74);
			field77.method37(var35 + var35 + 3);
		}

		field253 = field124[0];
		field254 = field125[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field77.method37(field124[var40] - var36);
			field77.method63(field125[var40] - var37);
		}

		field77.method71(field285 + var36);
		field77.method63(field974[5] == 1 ? 1 : 0);
		field77.method70(field286 + var37);
		return true;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method201() {
		if (field328 > 0) {
			method167();
		} else {
			method168("Connection lost", "Please wait - attempting to reestablish");
			field374 = 0;
			field253 = 0;
			NTPVSATL var1 = field339;
			field256 = false;
			field145 = 0;
			method268(field309, field310, true);

			if (!field256) {
				method167();
			}

			try {
				var1.method368();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method202() {
		for (int var1 = -1; var1 < field277; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field275;
			} else {
				var2 = field278[var1];
			}

			KZCOXKKW var3 = field276[var2];
			if (var3 != null) {
				method245(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field289.method350(arg0, arg3);
		field290.method350(arg0 + arg4 - 16, arg3);
		TYMHEFTS.method528(16, arg0 + 16, arg3, arg4 - 32, field89);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
		TYMHEFTS.method528(16, arg0 + var7 + 16, arg3, var6, field512);
		TYMHEFTS.method533(var6, field306, arg0 + var7 + 16, arg3);
		TYMHEFTS.method533(var6, field306, arg0 + var7 + 16, arg3 + 1);
		TYMHEFTS.method531(arg0 + var7 + 16, 16, field306, arg3);
		TYMHEFTS.method531(arg0 + var7 + 17, 16, field306, arg3);
		TYMHEFTS.method533(var6, field352, arg0 + var7 + 16, arg3 + 15);
		TYMHEFTS.method533(var6 - 1, field352, arg0 + var7 + 17, arg3 + 14);
		TYMHEFTS.method531(arg0 + var7 + var6 + 15, 16, field352, arg3);
		TYMHEFTS.method531(arg0 + var7 + var6 + 14, 15, field352, arg3 + 1);
	}

	@ObfuscatedName("client.e(II)V")
	public final void method204(int arg0) {
		int[] var2 = field255.field40;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field460[arg0][var7][var5] & 0x18) == 0) {
					field133.method410(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field460[arg0 + 1][var7][var5] & 0x8) != 0) {
					field133.method410(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field255.method19();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field460[arg0][var11][var10] & 0x18) == 0) {
					method221(var10, var11, var9, arg0, var8);
				}

				if (arg0 < 3 && (field460[arg0 + 1][var11][var10] & 0x8) != 0) {
					method221(var10, var11, var9, arg0 + 1, var8);
				}
			}
		}

		if (field458 != null) {
			field458.method321();
			IWBEAICJ.field741 = field187;
		}

		field237++;
		if (field237 > 89) {
			field237 = 0;
			field77.method36(108);
		}

		field303 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field133.method404(field156, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = RUROEYEG.method494(var14).field1246;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field293[field156].field565;
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

						field257[field303] = field149[var15];
						field304[field303] = var16;
						field305[field303] = var17;
						field303++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZII)V")
	public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
			if (field516 && field156 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field133.method401(arg5, arg3, arg6);
			}

			if (arg1 == 1) {
				var8 = field133.method402(arg6, arg5, arg3);
			}

			if (arg1 == 2) {
				var8 = field133.method403(arg5, arg3, arg6);
			}

			if (arg1 == 3) {
				var8 = field133.method404(arg5, arg3, arg6);
			}

			if (var8 != 0) {
				int var12 = field133.method405(arg5, arg3, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field133.method392(arg6, arg5, arg3);
					RUROEYEG var16 = RUROEYEG.method494(var13);
					if (var16.field1228) {
						field293[arg5].method290(var15, arg6, var16.field1249, arg3, var14);
					}
				}

				if (arg1 == 1) {
					field133.method393(arg6, arg5, arg3);
				}

				if (arg1 == 2) {
					field133.method394(arg3, arg6, arg5);
					RUROEYEG var17 = RUROEYEG.method494(var13);
					if (var17.field1227 + arg3 > 103 || var17.field1227 + arg6 > 103 || var17.field1240 + arg3 > 103 || var17.field1240 + arg6 > 103) {
						return;
					}

					if (var17.field1228) {
						field293[arg5].method291(arg3, var17.field1249, var15, var17.field1240, var17.field1227, arg6);
					}
				}

				if (arg1 == 3) {
					field133.method395(arg6, arg5, arg3);
					RUROEYEG var18 = RUROEYEG.method494(var13);
					if (var18.field1228 && var18.field1222) {
						field293[arg5].method293(arg3, arg6);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field460[1][arg3][arg6] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				WZFUDUYZ.method570(field511, arg2, field133, arg5, field293[arg5], var19, arg3, arg6, arg4, arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LWGFLNQLA;I)V")
	public final void method206(WGFLNQLA arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1384 == 0) {
			var2 = field133.method401(arg0.field1383, arg0.field1385, arg0.field1386);
		}

		if (arg0.field1384 == 1) {
			var2 = field133.method402(arg0.field1386, arg0.field1383, arg0.field1385);
		}

		if (arg0.field1384 == 2) {
			var2 = field133.method403(arg0.field1383, arg0.field1385, arg0.field1386);
		}

		if (arg0.field1384 == 3) {
			var2 = field133.method404(arg0.field1383, arg0.field1385, arg0.field1386);
		}

		if (var2 != 0) {
			int var6 = field133.method405(arg0.field1383, arg0.field1385, arg0.field1386, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1377 = var3;
		arg0.field1379 = var4;
		arg0.field1378 = var5;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method207(boolean arg0) {
		for (int var2 = 0; var2 < field117; var2++) {
			TOFRUGLM var3 = field116[field118[var2]];
			int var4 = (field118[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method307() && var3.field1283.field1448 == arg0 && var3.field1283.method596()) {
				int var5 = var3.field593 >> 7;
				int var6 = var3.field594 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field569 == 1 && (var3.field593 & 0x7F) == 0x40 && (var3.field594 & 0x7F) == 0x40) {
						if (field344[var5][var6] == field166) {
							continue;
						}

						field344[var5][var6] = field166;
					}

					if (!var3.field1283.field1467) {
						var4 += Integer.MIN_VALUE;
					}

					field133.method386(var3, field156, var3.field595, var3.field582, var4, method159(var3.field594, field156, var3.field593), (var3.field569 - 1) * 64 + 60, var3.field594, var3.field593);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIILKZCOXKKW;)V")
	public final void method208(int arg0, int arg1, int arg2, KZCOXKKW arg3) {
		if (field372 != arg3 && field369 < 400) {
			String var5;
			if (arg3.field800 == 0) {
				var5 = arg3.field786 + method197(arg3.field795, field372.field795) + " (level-" + arg3.field795 + ")";
			} else {
				var5 = arg3.field786 + " (skill-" + arg3.field800 + ")";
			}

			if (field294 == 1) {
				field76[field369] = "Use " + field298 + " with @whi@" + var5;
				field141[field369] = 226;
				field142[field369] = arg0;
				field139[field369] = arg2;
				field140[field369] = arg1;
				field369++;
			} else if (field361 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field225[var6] != null) {
						field76[field369] = field225[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field225[var6].equalsIgnoreCase("attack")) {
							if (arg3.field795 > field372.field795) {
								var7 = 2000;
							}

							if (field372.field791 != 0 && arg3.field791 != 0) {
								if (field372.field791 == arg3.field791) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field226[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field141[field369] = var7 + 595;
						}

						if (var6 == 1) {
							field141[field369] = var7 + 827;
						}

						if (var6 == 2) {
							field141[field369] = var7 + 439;
						}

						if (var6 == 3) {
							field141[field369] = var7 + 273;
						}

						if (var6 == 4) {
							field141[field369] = var7 + 996;
						}

						field142[field369] = arg0;
						field139[field369] = arg2;
						field140[field369] = arg1;
						field369++;
					}
				}
			} else if ((field363 & 0x8) == 8) {
				field76[field369] = field364 + " @whi@" + var5;
				field141[field369] = 280;
				field142[field369] = arg0;
				field139[field369] = arg2;
				field140[field369] = arg1;
				field369++;
			}

			for (int var8 = 0; var8 < field369; var8++) {
				if (field141[var8] == 46) {
					field76[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method209(int arg0) {
		if (arg0 >= 0) {
			int var2 = field139[arg0];
			int var3 = field140[arg0];
			int var4 = field141[arg0];
			int var5 = field142[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field218 != 0 && var4 != 1122) {
				field218 = 0;
				field205 = true;
			}

			if (var4 == 864) {
				boolean var6 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				if (!var6) {
					method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				}

				field345 = field971;
				field346 = field972;
				field348 = 2;
				field347 = 0;
				field355++;
				if (field355 >= 54) {
					field77.method36(35);
					field77.method40(0xD564DE);
					field355 = 0;
				}

				field77.method36(207);
				field77.method70(var5);
				field77.method72(field285 + var2);
				field77.method72(field286 + var3);
			}

			if (var4 == 19) {
				field77.method36(221);
				field77.method38(var5);
				field77.method72(var2);
				field77.method70(var3);
				field108 = 0;
				field109 = var3;
				field110 = var2;
				field111 = 2;
				if (QHGHUTGN.method445(var3).field1007 == field191) {
					field111 = 1;
				}

				if (QHGHUTGN.method445(var3).field1007 == field128) {
					field111 = 3;
				}
			}

			if (var4 == 669) {
				TOFRUGLM var8 = field116[var5];
				if (var8 != null) {
					method200(0, 1, 1, var8.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var8.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(188);
					field77.method38(field295);
					field77.method71(var5);
					field77.method72(field297);
					field77.method70(field296);
				}
			}

			if (var4 == 533) {
				TOFRUGLM var9 = field116[var5];
				if (var9 != null) {
					method200(0, 1, 1, var9.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var9.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(213);
					field77.method71(var5);
					field77.method72(field362);
				}
			}

			if (var4 == 46) {
				if (field376) {
					field133.method413(var3 - 4, var2 - 4);
				} else {
					field133.method413(field972 - 4, field971 - 4);
				}
			}

			if (var4 == 808) {
				boolean var10 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				if (!var10) {
					method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				}

				field345 = field971;
				field346 = field972;
				field348 = 2;
				field347 = 0;

				if ((var2 & 0x3) == 0) {
					field350++;
				}

				if (field350 >= 119) {
					field77.method36(123);
					field77.method38(58942);
					field350 = 0;
				}

				field77.method36(29);
				field77.method72(var5);
				field77.method38(field285 + var2);
				field77.method71(field286 + var3);
			}

			if (var4 == 419) {
				method152(field247);
				field247 = -1;
				field205 = true;
			}

			if (var4 == 824) {
				method132(var5, var3, var2);
				field77.method36(163);
				field77.method38(field286 + var3);
				field77.method70(var5 >> 14 & 0x7FFF);
				field77.method72(field285 + var2);
			}

			if (var4 == 410) {
				TOFRUGLM var12 = field116[var5];
				if (var12 != null) {
					method200(0, 1, 1, var12.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var12.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;

					if ((var5 & 0x3) == 0) {
						field409++;
					}

					if (field409 >= 95) {
						field77.method36(61);
						field77.method40(0xED262C);
						field409 = 0;
					}

					field77.method36(0);
					field77.method38(var5);
				}
			}

			if (var4 == 735) {
				boolean var13 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				if (!var13) {
					method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				}

				field345 = field971;
				field346 = field972;
				field348 = 2;
				field347 = 0;
				field77.method36(129);
				field77.method71(var5);
				field77.method38(field286 + var3);
				field77.method38(field362);
				field77.method38(field285 + var2);
			}

			if (var4 == 338) {
				field77.method36(190);
				field77.method38(var3);
				QHGHUTGN var15 = QHGHUTGN.method445(var3);
				if (var15.field1013 != null && var15.field1013[0][0] == 5) {
					int var16 = var15.field1013[0][1];
					if (field148[var16] != var15.field1033[0]) {
						field148[var16] = var15.field1033[0];
						method172(var16);
						field136 = true;
					}
				}
			}

			if (var4 == 1455) {
				QSAFIBMX var17 = QSAFIBMX.method455(var5);
				QHGHUTGN var18 = QHGHUTGN.method445(var3);
				String var19;
				if (var18 != null && var18.field1051[var2] >= 100000) {
					var19 = var18.field1051[var2] + " x " + var17.field1065;
				} else if (var17.field1072 == null) {
					var19 = "It's a " + var17.field1065 + ".";
				} else {
					var19 = new String(var17.field1072);
				}

				method267("", var19, 0);
			}

			if (var4 == 1456) {
				int var20 = var5 >> 14 & 0x7FFF;
				RUROEYEG var21 = RUROEYEG.method494(var20);
				String var22;
				if (var21.field1215 == null) {
					var22 = "It's a " + var21.field1217 + ".";
				} else {
					var22 = new String(var21.field1215);
				}

				method267("", var22, 0);
			}

			if (var4 == 8) {
				method174();
			}

			if (var4 == 226) {
				KZCOXKKW var23 = field276[var5];
				if (var23 != null) {
					method200(0, 1, 1, var23.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var23.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(39);
					field77.method38(field295);
					field77.method70(field296);
					field77.method70(field297);
					field77.method70(var5);
				}
			}

			if (var4 == 334) {
				String var24 = field76[arg0];
				int var25 = var24.indexOf("@whi@");
				if (var25 != -1) {
					long var26 = SFBUQEXP.method505(var24.substring(var25 + 5).trim());
					int var28 = -1;
					for (int var29 = 0; var29 < field388; var29++) {
						if (field231[var29] == var26) {
							var28 = var29;
							break;
						}
					}

					if (var28 != -1 && field318[var28] > 0) {
						field205 = true;
						field218 = 0;
						field162 = true;
						field477 = "";
						field190 = 3;
						field407 = field231[var28];
						field433 = "Enter message to send to " + field373[var28];
					}
				}
			}

			if (var4 == 1020) {
				TOFRUGLM var30 = field116[var5];
				if (var30 != null) {
					YSYPMZMO var31 = var30.field1283;
					if (var31.field1461 != null) {
						var31 = var31.method599();
					}

					if (var31 != null) {
						String var32;
						if (var31.field1468 == null) {
							var32 = "It's a " + var31.field1460 + ".";
						} else {
							var32 = new String(var31.field1468);
						}

						method267("", var32, 0);
					}
				}
			}

			if (var4 == 280) {
				KZCOXKKW var33 = field276[var5];
				if (var33 != null) {
					method200(0, 1, 1, var33.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var33.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(68);
					field77.method71(var5);
					field77.method70(field362);
				}
			}

			if (var4 == 764) {
				TOFRUGLM var34 = field116[var5];
				if (var34 != null) {
					method200(0, 1, 1, var34.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var34.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(193);
					field77.method70(var5);
				}
			}

			if (var4 == 196) {
				boolean var35 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				if (!var35) {
					method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
				}

				field345 = field971;
				field346 = field972;
				field348 = 2;
				field347 = 0;
				field77.method36(90);
				field77.method71(field286 + var3);
				field77.method72(field297);
				field77.method72(var5);
				field77.method72(field296);
				field77.method38(field285 + var2);
				field77.method38(field295);
			}

			if (var4 == 595) {
				KZCOXKKW var37 = field276[var5];
				if (var37 != null) {
					method200(0, 1, 1, var37.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var37.field591[0]);
					field345 = field971;
					field346 = field972;
					field348 = 2;
					field347 = 0;
					field77.method36(72);
					field77.method71(var5);
				}
			}

			if (var4 == 638) {
				field294 = 1;
				field295 = var2;
				field296 = var3;
				field297 = var5;
				field298 = String.valueOf(QSAFIBMX.method455(var5).field1065);
				field361 = 0;
				field136 = true;
			} else {
				if (var4 == 15) {
					TOFRUGLM var38 = field116[var5];
					if (var38 != null) {
						method200(0, 1, 1, var38.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var38.field591[0]);
						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(112);
						field77.method38(var5);
					}
				}

				if (var4 == 273) {
					KZCOXKKW var39 = field276[var5];
					if (var39 != null) {
						method200(0, 1, 1, var39.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var39.field591[0]);
						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(181);
						field77.method72(var5);
					}
				}

				if (var4 == 936) {
					field77.method36(55);
					field77.method70(var2);
					field77.method38(var5);
					field77.method71(var3);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 414) {
					field77.method36(51);
					field77.method70(var2);
					field77.method38(var5);
					field77.method70(var3);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 653 && method132(var5, var3, var2)) {
					field77.method36(82);
					field77.method71(field286 + var3);
					field77.method72(var5 >> 14 & 0x7FFF);
					field77.method38(field297);
					field77.method71(field285 + var2);
					field77.method71(field295);
					field77.method72(field296);
				}

				if (var4 == 66) {
					field271++;
					if (field271 >= 72) {
						field77.method36(54);
						field271 = 0;
					}

					method132(var5, var3, var2);
					field77.method36(201);
					field77.method72(field285 + var2);
					field77.method70(var5 >> 14 & 0x7FFF);
					field77.method70(field286 + var3);
				}

				if (var4 == 816) {
					TOFRUGLM var40 = field116[var5];
					if (var40 != null) {
						method200(0, 1, 1, var40.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var40.field591[0]);
						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(2);
						field77.method38(var5);
					}
				}

				if (var4 == 609) {
					field77.method36(190);
					field77.method38(var3);
					QHGHUTGN var41 = QHGHUTGN.method445(var3);
					if (var41.field1013 != null && var41.field1013[0][0] == 5) {
						int var42 = var41.field1013[0][1];
						field148[var42] = 1 - field148[var42];
						method172(var42);
						field136 = true;
					}
				}

				if (var4 == 160) {
					String var43 = field76[arg0];
					int var44 = var43.indexOf("@whi@");
					if (var44 != -1) {
						if (field191 == -1) {
							method174();
							field132 = var43.substring(var44 + 5).trim();
							field143 = false;
							field408 = field191 = QHGHUTGN.field997;
						} else {
							method267("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 424) {
					field360++;
					if (field360 >= 144) {
						field77.method36(235);
						field77.method41(0);
						field360 = 0;
					}

					field77.method36(243);
					field77.method70(var2);
					field77.method38(var3);
					field77.method70(var5);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 339) {
					field77.method36(140);
					field77.method71(var3);
					field77.method70(var2);
					field77.method72(var5);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 242) {
					field491 += var3;
					if (field491 >= 146) {
						field77.method36(49);
						field491 = 0;
					}

					field77.method36(208);
					field77.method70(var3);
					field77.method70(var2);
					field77.method72(var5);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 51) {
					field150++;
					if (field150 >= 98) {
						field77.method36(52);
						field150 = 0;
					}

					method132(var5, var3, var2);
					field77.method36(1);
					field77.method71(var5 >> 14 & 0x7FFF);
					field77.method38(field286 + var3);
					field77.method38(field285 + var2);
				}

				if (var4 == 509) {
					field77.method36(78);
					field77.method71(var3);
					field77.method70(var2);
					field77.method72(var5);
					field108 = 0;
					field109 = var3;
					field110 = var2;
					field111 = 2;
					if (QHGHUTGN.method445(var3).field1007 == field191) {
						field111 = 1;
					}

					if (QHGHUTGN.method445(var3).field1007 == field128) {
						field111 = 3;
					}
				}

				if (var4 == 439) {
					KZCOXKKW var45 = field276[var5];
					if (var45 != null) {
						method200(0, 1, 1, var45.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var45.field591[0]);
						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(71);
						field77.method71(var5);
					}
				}

				if (var4 == 1359) {
					method132(var5, var3, var2);
					field77.method36(22);
					field77.method70(var5 >> 14 & 0x7FFF);
					field77.method70(field285 + var2);
					field77.method38(field286 + var3);
				}

				if (var4 == 654) {
					QHGHUTGN var46 = QHGHUTGN.method445(var3);
					field361 = 1;
					field362 = var3;
					field363 = var46.field1035;
					field294 = 0;
					field136 = true;
					String var47 = var46.field1048;
					if (var47.indexOf(" ") != -1) {
						var47 = var47.substring(0, var47.indexOf(" "));
					}

					String var48 = var46.field1048;
					if (var48.indexOf(" ") != -1) {
						var48 = var48.substring(var48.indexOf(" ") + 1);
					}

					field364 = var47 + " " + var46.field1036 + " " + var48;

					if (field363 == 16) {
						field136 = true;
						field488 = 3;
						field217 = true;
					}
				} else {
					if (var4 == 153) {
						field77.method36(62);
						field77.method71(var3);
						field77.method38(var5);
						field77.method71(var2);
						field77.method72(field362);
						field108 = 0;
						field109 = var3;
						field110 = var2;
						field111 = 2;
						if (QHGHUTGN.method445(var3).field1007 == field191) {
							field111 = 1;
						}

						if (QHGHUTGN.method445(var3).field1007 == field128) {
							field111 = 3;
						}
					}

					if (var4 == 106) {
						method132(var5, var3, var2);
						field77.method36(28);
						field77.method71(field286 + var3);
						field77.method71(field285 + var2);
						field77.method72(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 656) {
						boolean var49 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						if (!var49) {
							method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						}

						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;

						if ((var2 & 0x3) == 0) {
							field107++;
						}

						if (field107 >= 115) {
							field77.method36(159);
							field77.method40(0x85BD41);
							field107 = 0;
						}

						field77.method36(7);
						field77.method72(var5);
						field77.method72(field286 + var3);
						field77.method72(field285 + var2);
					}

					if (var4 == 1686) {
						QSAFIBMX var51 = QSAFIBMX.method455(var5);
						String var52;
						if (var51.field1072 == null) {
							var52 = "It's a " + var51.field1065 + ".";
						} else {
							var52 = new String(var51.field1072);
						}

						method267("", var52, 0);
					}

					if (var4 == 271) {
						TOFRUGLM var53 = field116[var5];
						if (var53 != null) {
							method200(0, 1, 1, var53.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var53.field591[0]);
							field345 = field971;
							field346 = field972;
							field348 = 2;
							field347 = 0;
							field77.method36(12);
							field77.method38(var5);
						}
					}

					if (var4 == 827) {
						KZCOXKKW var54 = field276[var5];
						if (var54 != null) {
							method200(0, 1, 1, var54.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var54.field591[0]);
							field345 = field971;
							field346 = field972;
							field348 = 2;
							field347 = 0;
							field167 += var5;
							if (field167 >= 63) {
								field77.method36(232);
								field77.method40(0xF9198B);
								field167 = 0;
							}

							field77.method36(16);
							field77.method70(var5);
						}
					}

					if (var4 == 887) {
						QHGHUTGN var55 = QHGHUTGN.method445(var3);
						boolean var56 = true;
						if (var55.field1016 > 0) {
							var56 = method179(var55);
						}

						if (var56) {
							field77.method36(190);
							field77.method38(var3);
						}
					}

					if (var4 == 155) {
						field77.method36(150);
						field77.method38(var5);
						field77.method72(var3);
						field77.method71(var2);
						field108 = 0;
						field109 = var3;
						field110 = var2;
						field111 = 2;
						if (QHGHUTGN.method445(var3).field1007 == field191) {
							field111 = 1;
						}

						if (QHGHUTGN.method445(var3).field1007 == field128) {
							field111 = 3;
						}
					}

					if (var4 == 941) {
						boolean var57 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						if (!var57) {
							method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						}

						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(196);
						field77.method72(field285 + var2);
						field77.method72(var5);
						field77.method38(field286 + var3);
					}

					if (var4 == 995) {
						boolean var59 = method200(0, 0, 0, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						if (!var59) {
							method200(0, 1, 1, var2, field372.field591[0], 2, 0, field372.field590[0], false, 0, var3);
						}

						field345 = field971;
						field346 = field972;
						field348 = 2;
						field347 = 0;
						field77.method36(142);
						field77.method71(var5);
						field77.method38(field285 + var2);
						field77.method71(field286 + var3);
					}

					if (var4 == 717) {
						field77.method36(248);
						field77.method71(var5);
						field77.method71(var3);
						field77.method72(var2);
						field108 = 0;
						field109 = var3;
						field110 = var2;
						field111 = 2;
						if (QHGHUTGN.method445(var3).field1007 == field191) {
							field111 = 1;
						}

						if (QHGHUTGN.method445(var3).field1007 == field128) {
							field111 = 3;
						}
					}

					if (var4 == 996) {
						KZCOXKKW var61 = field276[var5];
						if (var61 != null) {
							method200(0, 1, 1, var61.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var61.field591[0]);
							field345 = field971;
							field346 = field972;
							field348 = 2;
							field347 = 0;
							field77.method36(4);
							field77.method72(var5);
						}
					}

					if (var4 == 477 && !field90) {
						field77.method36(42);
						field77.method38(var3);
						field90 = true;
					}

					if (var4 == 702 || var4 == 352 || var4 == 70 || var4 == 144) {
						String var62 = field76[arg0];
						int var63 = var62.indexOf("@whi@");
						if (var63 != -1) {
							long var64 = SFBUQEXP.method505(var62.substring(var63 + 5).trim());
							if (var4 == 702) {
								method155(var64);
							}

							if (var4 == 352) {
								method181(var64);
							}

							if (var4 == 70) {
								method231(var64);
							}

							if (var4 == 144) {
								method191(var64);
							}
						}
					}

					if (var4 == 38) {
						field77.method36(250);
						field77.method72(var3);
						field77.method70(var2);
						field77.method38(var5);
						field108 = 0;
						field109 = var3;
						field110 = var2;
						field111 = 2;
						if (QHGHUTGN.method445(var3).field1007 == field191) {
							field111 = 1;
						}

						if (QHGHUTGN.method445(var3).field1007 == field128) {
							field111 = 3;
						}
					}

					if (var4 == 546 && method132(var5, var3, var2)) {
						field77.method36(246);
						field77.method70(field285 + var2);
						field77.method70(field362);
						field77.method70(var5 >> 14 & 0x7FFF);
						field77.method70(field286 + var3);
					}

					if (var4 == 172 || var4 == 716) {
						String var66 = field76[arg0];
						int var67 = var66.indexOf("@whi@");
						if (var67 != -1) {
							var66 = var66.substring(var67 + 5).trim();
							String var68 = SFBUQEXP.method509(SFBUQEXP.method506(SFBUQEXP.method505(var66)));
							boolean var69 = false;
							for (int var70 = 0; var70 < field277; var70++) {
								KZCOXKKW var71 = field276[field278[var70]];
								if (var71 != null && var71.field786 != null && var71.field786.equalsIgnoreCase(var68)) {
									method200(0, 1, 1, var71.field590[0], field372.field591[0], 2, 0, field372.field590[0], false, 0, var71.field591[0]);

									if (var4 == 172) {
										field77.method36(181);
										field77.method72(field278[var70]);
									}

									if (var4 == 716) {
										field77.method36(72);
										field77.method71(field278[var70]);
									}

									var69 = true;
									break;
								}
							}

							if (!var69) {
								method267("", "Unable to find " + var68, 0);
							}
						}
					}

					if (var4 == 730) {
						field77.method36(162);
						field77.method71(field296);
						field77.method72(field295);
						field77.method71(var5);
						field77.method38(var2);
						field77.method72(field297);
						field77.method72(var3);
						field108 = 0;
						field109 = var3;
						field110 = var2;
						field111 = 2;
						if (QHGHUTGN.method445(var3).field1007 == field191) {
							field111 = 1;
						}

						if (QHGHUTGN.method445(var3).field1007 == field128) {
							field111 = 3;
						}
					}

					field294 = 0;
					field361 = 0;
					field136 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method210() {
		field509 = 0;
		int var1 = (field372.field593 >> 7) + field285;
		int var2 = (field372.field594 >> 7) + field286;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field509 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field509 = 1;
		}

		if (field509 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field509 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = RMLAXPMV.field1201[var7];
			int var13 = RMLAXPMV.field1202[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = RMLAXPMV.field1201[var8];
			int var16 = RMLAXPMV.field1202[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field220 = arg1 - var9;
		field221 = arg2 - var10;
		field222 = arg5 - var11;
		field223 = arg0;
		field224 = arg4;
	}

	@ObfuscatedName("client.a(IILBSNPYLEV;)V")
	public final void method212(int arg0, BSNPYLEV arg1) {
		field264 = 0;
		field279 = 0;
		method175(arg0, arg1);
		method150(arg1, arg0);
		method130(arg1, arg0);
		method258(arg1, arg0);

		for (int var3 = 0; var3 < field264; var3++) {
			int var4 = field265[var3];
			if (field322 != field276[var4].field623) {
				field276[var4] = null;
			}
		}

		if (arg1.field55 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field55 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field277; var5++) {
			if (field276[field278[var5]] == null) {
				signlink.reporterror(field309 + " null entry in pl list - pos:" + var5 + " size:" + field277);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(Z)Z")
	public final boolean method213() {
		if (field339 == null) {
			return false;
		}

		try {
			int var1 = field339.method370();
			if (var1 == 0) {
				return false;
			}

			if (field325 == -1) {
				field339.method371(field390.field54, 0, 1);
				field325 = field390.field54[0] & 0xFF;
				if (field243 != null) {
					field325 = field325 - field243.method587() & 0xFF;
				}

				field324 = VJGEROWN.field1336[field325];
				var1--;
			}

			if (field324 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field339.method371(field390.field54, 0, 1);
				field324 = field390.field54[0] & 0xFF;
				var1--;
			}

			if (field324 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field339.method371(field390.field54, 0, 2);
				field390.field55 = 0;
				field324 = field390.method49();
				var1 -= 2;
			}

			if (var1 < field324) {
				return false;
			}

			field390.field55 = 0;
			field339.method371(field390.field54, 0, field324);
			field326 = 0;
			field438 = field437;
			field437 = field436;
			field436 = field325;

			if (field325 == 220) {
				int var2 = field390.method47();
				int var3 = field390.method73();
				if (var3 == 0xFFFF) {
					var3 = -1;
				}

				if (field354[var2] != var3) {
					method152(field354[var2]);
					field354[var2] = var3;
				}

				field136 = true;
				field217 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 241) {
				field463 = field390.method47();
				field464 = field390.method47();
				field325 = -1;
				return true;
			}

			if (field325 == 70) {
				int var4 = field390.method49();
				String var5 = field390.method54();
				QHGHUTGN.method445(var4).field1006 = var5;

				if (field354[field488] == QHGHUTGN.method445(var4).field1007) {
					field136 = true;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 228) {
				int var6 = field390.method74();
				QHGHUTGN var7 = QHGHUTGN.method445(var6);
				for (int var8 = 0; var8 < var7.field1001.length; var8++) {
					var7.field1001[var8] = -1;
					var7.field1001[var8] = 0;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 185) {
				field283 = true;
				field424 = field390.method47();
				field425 = field390.method47();
				field426 = field390.method49();
				field427 = field390.method47();
				field428 = field390.method47();
				if (field428 >= 100) {
					field220 = field424 * 128 + 64;
					field222 = field425 * 128 + 64;
					field221 = method159(field222, field156, field220) - field426;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 236) {
				field421 = field390.method47();
				if (field421 == 1) {
					field478 = field390.method49();
				}

				if (field421 >= 2 && field421 <= 6) {
					if (field421 == 2) {
						field332 = 64;
						field333 = 64;
					}

					if (field421 == 3) {
						field332 = 0;
						field333 = 64;
					}

					if (field421 == 4) {
						field332 = 128;
						field333 = 64;
					}

					if (field421 == 5) {
						field332 = 64;
						field333 = 0;
					}

					if (field421 == 6) {
						field332 = 64;
						field333 = 128;
					}

					field421 = 2;
					field329 = field390.method49();
					field330 = field390.method49();
					field331 = field390.method47();
				}

				if (field421 == 10) {
					field134 = field390.method49();
				}

				field325 = -1;
				return true;
			}

			if (field325 == 21) {
				int var9 = field390.method75();
				int var10 = field390.method75();
				QHGHUTGN var11 = QHGHUTGN.method445(var10);
				if (var11 != null && var11.field1026 == 0) {
					if (var9 < 0) {
						var9 = 0;
					}

					if (var9 > var11.field1011 - var11.field1028) {
						var9 = var11.field1011 - var11.field1028;
					}

					var11.field1018 = var9;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 80) {
				method167();
				field325 = -1;
				return false;
			}

			if (field325 == 206) {
				int var12 = field390.method49();
				int var13 = field390.method47();
				int var14 = field390.method49();
				if (var14 == 0xFFFF) {
					if (field263 < 50) {
						field282[field263] = (short) var12;
						field410[field263] = var13;
						field193[field263] = 0;
						field263++;
					}
				} else if (field249 && !field516 && field263 < 50) {
					field282[field263] = var12;
					field410[field263] = var13;
					field193[field263] = DCZESDQX.field543[var12] + var14;
					field263++;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 36) {
				int var15 = field390.method50();
				int var16 = field390.method73();
				int var17 = field390.method76();
				QHGHUTGN var18 = QHGHUTGN.method445(var16);
				var18.field998 = var15;
				var18.field995 = var17;
				field325 = -1;
				return true;
			}

			if (field325 == 158) {
				field374 = field390.method47();
				field325 = -1;
				return true;
			}

			if (field325 == 230) {
				int var19 = field390.method75();
				method189(var19);

				if (field128 != -1) {
					method152(field128);
					field128 = -1;
					field205 = true;
				}

				if (field375 != -1) {
					method152(field375);
					field375 = -1;
					field83 = true;
				}

				if (field367 != -1) {
					method152(field367);
					field367 = -1;
				}

				if (field191 != -1) {
					method152(field191);
					field191 = -1;
				}

				if (field334 != var19) {
					method152(field334);
					field334 = var19;
				}

				if (field218 != 0) {
					field218 = 0;
					field205 = true;
				}

				field136 = true;
				field217 = true;
				field90 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 34) {
				int var20 = field390.method75();
				int var21 = field390.method49();
				int var22 = field390.method73();
				QHGHUTGN.method445(var22).field1012 = (var21 << 16) + var20;
				field325 = -1;
				return true;
			}

			if (field325 == 22) {
				field464 = field390.method67();
				field463 = field390.method67();

				while (field390.field55 < field324) {
					int var23 = field390.method47();
					method173(field390, var23);
				}

				field325 = -1;
				return true;
			}

			if (field325 == 172) {
				method163(field390, field324);
				field325 = -1;
				return true;
			}

			if (field325 == 87) {
				field283 = true;
				field200 = field390.method47();
				field201 = field390.method47();
				field202 = field390.method49();
				field203 = field390.method47();
				field204 = field390.method47();
				if (field204 >= 100) {
					int var24 = field200 * 128 + 64;
					int var25 = field201 * 128 + 64;
					int var26 = method159(var25, field156, var24) - field202;
					int var27 = var24 - field220;
					int var28 = var26 - field221;
					int var29 = var25 - field222;
					int var30 = (int) Math.sqrt(var27 * var27 + var29 * var29);
					field223 = (int) (Math.atan2(var28, var30) * 325.949D) & 0x7FF;
					field224 = (int) (Math.atan2(var27, var29) * -325.949D) & 0x7FF;

					if (field223 < 128) {
						field223 = 128;
					}

					if (field223 > 383) {
						field223 = 383;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 123) {
				int var31 = field390.method74();
				int var32 = field390.method75();
				QHGHUTGN.method445(var31).field1037 = 2;
				QHGHUTGN.method445(var31).field1038 = var32;
				field325 = -1;
				return true;
			}

			if (field325 == 134) {
				String var33 = field390.method54();
				if (var33.endsWith(":tradereq:")) {
					String var34 = var33.substring(0, var33.indexOf(":"));
					long var35 = SFBUQEXP.method505(var34);
					boolean var37 = false;
					for (int var38 = 0; var38 < field430; var38++) {
						if (field232[var38] == var35) {
							var37 = true;
							break;
						}
					}

					if (!var37 && field509 == 0) {
						method267(var34, "wishes to trade with you.", 4);
					}
				} else if (var33.endsWith(":duelreq:")) {
					String var39 = var33.substring(0, var33.indexOf(":"));
					long var40 = SFBUQEXP.method505(var39);
					boolean var42 = false;
					for (int var43 = 0; var43 < field430; var43++) {
						if (field232[var43] == var40) {
							var42 = true;
							break;
						}
					}

					if (!var42 && field509 == 0) {
						method267(var39, "wishes to duel with you.", 8);
					}
				} else if (var33.endsWith(":chalreq:")) {
					String var44 = var33.substring(0, var33.indexOf(":"));
					long var45 = SFBUQEXP.method505(var44);
					boolean var47 = false;
					for (int var48 = 0; var48 < field430; var48++) {
						if (field232[var48] == var45) {
							var47 = true;
							break;
						}
					}

					if (!var47 && field509 == 0) {
						String var49 = var33.substring(var33.indexOf(":") + 1, var33.length() - 9);
						method267(var44, var49, 8);
					}
				} else {
					method267("", var33, 0);
				}

				field325 = -1;
				return true;
			}

			if (field325 == 102) {
				field430 = field324 / 8;
				for (int var50 = 0; var50 < field430; var50++) {
					field232[var50] = field390.method53();
				}

				field325 = -1;
				return true;
			}

			if (field325 == 249 || field325 == 8) {
				int var51 = field370;
				int var52 = field371;
				if (field325 == 249) {
					var52 = field390.method75();
					var51 = field390.method74();
					field462 = false;
				}

				if (field325 == 8) {
					field390.method57();

					for (int var53 = 0; var53 < 4; var53++) {
						for (int var54 = 0; var54 < 13; var54++) {
							for (int var55 = 0; var55 < 13; var55++) {
								int var56 = field390.method58(1);
								if (var56 == 1) {
									field368[var53][var54][var55] = field390.method58(26);
								} else {
									field368[var53][var54][var55] = -1;
								}
							}
						}
					}

					field390.method59();
					var51 = field390.method75();
					var52 = field390.method73();
					field462 = true;
				}

				if (field370 == var51 && field371 == var52 && field248 == 2) {
					field325 = -1;
					return true;
				}

				field370 = var51;
				field371 = var52;
				field285 = (field370 - 6) * 8;
				field286 = (field371 - 6) * 8;
				field175 = false;
				if ((field370 / 8 == 48 || field370 / 8 == 49) && field371 / 8 == 48) {
					field175 = true;
				}

				if (field370 / 8 == 48 && field371 / 8 == 148) {
					field175 = true;
				}

				field248 = 1;
				field510 = System.currentTimeMillis();
				method168("Loading - please wait.", null);

				if (field325 == 249) {
					int var57 = 0;
					for (int var58 = (field370 - 6) / 8; var58 <= (field370 + 6) / 8; var58++) {
						for (int var59 = (field371 - 6) / 8; var59 <= (field371 + 6) / 8; var59++) {
							var57++;
						}
					}

					field127 = new byte[var57][];
					field384 = new byte[var57][];
					field341 = new int[var57];
					field342 = new int[var57];
					field343 = new int[var57];
					int var60 = 0;
					for (int var61 = (field370 - 6) / 8; var61 <= (field370 + 6) / 8; var61++) {
						for (int var62 = (field371 - 6) / 8; var62 <= (field371 + 6) / 8; var62++) {
							field341[var60] = (var61 << 8) + var62;

							if (field175 && (var62 == 49 || var62 == 149 || var62 == 147 || var61 == 50 || var61 == 49 && var62 == 47)) {
								field342[var60] = -1;
								field343[var60] = -1;
								var60++;
							} else {
								int var63 = field342[var60] = field417.method541(0, var61, var62);
								if (var63 != -1) {
									field417.method556(3, var63);
								}

								int var64 = field343[var60] = field417.method541(1, var61, var62);
								if (var64 != -1) {
									field417.method556(3, var64);
								}

								var60++;
							}
						}
					}
				}

				if (field325 == 8) {
					int var65 = 0;
					int[] var66 = new int[676];
					for (int var67 = 0; var67 < 4; var67++) {
						for (int var68 = 0; var68 < 13; var68++) {
							for (int var69 = 0; var69 < 13; var69++) {
								int var70 = field368[var67][var68][var69];
								if (var70 != -1) {
									int var71 = var70 >> 14 & 0x3FF;
									int var72 = var70 >> 3 & 0x7FF;
									int var73 = (var71 / 8 << 8) + var72 / 8;
									for (int var74 = 0; var74 < var65; var74++) {
										if (var66[var74] == var73) {
											var73 = -1;
											break;
										}
									}

									if (var73 != -1) {
										var66[var65++] = var73;
									}
								}
							}
						}
					}

					field127 = new byte[var65][];
					field384 = new byte[var65][];
					field341 = new int[var65];
					field342 = new int[var65];
					field343 = new int[var65];
					for (int var75 = 0; var75 < var65; var75++) {
						int var76 = field341[var75] = var66[var75];
						int var77 = var76 >> 8 & 0xFF;
						int var78 = var76 & 0xFF;
						int var79 = field342[var75] = field417.method541(0, var77, var78);
						if (var79 != -1) {
							field417.method556(3, var79);
						}

						int var80 = field343[var75] = field417.method541(1, var77, var78);
						if (var80 != -1) {
							field417.method556(3, var80);
						}
					}
				}

				int var81 = field285 - field287;
				int var82 = field286 - field288;
				field287 = field285;
				field288 = field286;

				for (int var83 = 0; var83 < 16384; var83++) {
					TOFRUGLM var84 = field116[var83];
					if (var84 != null) {
						for (int var85 = 0; var85 < 10; var85++) {
							var84.field590[var85] -= var81;
							var84.field591[var85] -= var82;
						}

						var84.field593 -= var81 * 128;
						var84.field594 -= var82 * 128;
					}
				}

				for (int var86 = 0; var86 < field274; var86++) {
					KZCOXKKW var87 = field276[var86];
					if (var87 != null) {
						for (int var88 = 0; var88 < 10; var88++) {
							var87.field590[var88] -= var81;
							var87.field591[var88] -= var82;
						}

						var87.field593 -= var81 * 128;
						var87.field594 -= var82 * 128;
					}
				}

				field181 = true;
				byte var89 = 0;
				byte var90 = 104;
				byte var91 = 1;
				if (var81 < 0) {
					var89 = 103;
					var90 = -1;
					var91 = -1;
				}

				byte var92 = 0;
				byte var93 = 104;
				byte var94 = 1;
				if (var82 < 0) {
					var92 = 103;
					var93 = -1;
					var94 = -1;
				}

				for (int var95 = var89; var95 != var90; var95 += var91) {
					for (int var96 = var92; var96 != var93; var96 += var94) {
						int var97 = var81 + var95;
						int var98 = var82 + var96;
						for (int var99 = 0; var99 < 4; var99++) {
							if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
								field85[var99][var95][var96] = field85[var99][var97][var98];
							} else {
								field85[var99][var95][var96] = null;
							}
						}
					}
				}

				for (WGFLNQLA var100 = (WGFLNQLA) field291.method300(); var100 != null; var100 = (WGFLNQLA) field291.method302()) {
					var100.field1385 -= var81;
					var100.field1386 -= var82;
					if (var100.field1385 < 0 || var100.field1386 < 0 || var100.field1385 >= 104 || var100.field1386 >= 104) {
						var100.method518();
					}
				}

				if (field253 != 0) {
					field253 -= var81;
					field254 -= var82;
				}

				field283 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 124) {
				field136 = true;
				int var101 = field390.method49();
				QHGHUTGN var102 = QHGHUTGN.method445(var101);
				int var103 = field390.method49();
				for (int var104 = 0; var104 < var103; var104++) {
					var102.field1001[var104] = field390.method75();
					int var105 = field390.method67();
					if (var105 == 255) {
						var105 = field390.method81();
					}

					var102.field1051[var104] = var105;
				}

				for (int var106 = var103; var106 < var102.field1001.length; var106++) {
					var102.field1001[var106] = 0;
					var102.field1051[var106] = 0;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 103) {
				int var107 = field390.method75();
				int var108 = field390.method73();

				if (field128 != -1) {
					method152(field128);
					field128 = -1;
					field205 = true;
				}

				if (field375 != -1) {
					method152(field375);
					field375 = -1;
					field83 = true;
				}

				if (field367 != -1) {
					method152(field367);
					field367 = -1;
				}

				if (field191 != var107) {
					method152(field191);
					field191 = var107;
				}

				if (field334 != var108) {
					method152(field334);
					field334 = var108;
				}

				if (field218 != 0) {
					field218 = 0;
					field205 = true;
				}

				field136 = true;
				field217 = true;
				field90 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 170) {
				int var109 = field390.method49();
				int var110 = field390.method73();
				int var111 = field390.method49();
				int var112 = field390.method73();
				QHGHUTGN.method445(var111).field1056 = var112;
				QHGHUTGN.method445(var111).field1057 = var109;
				QHGHUTGN.method445(var111).field1055 = var110;
				field325 = -1;
				return true;
			}

			if (field325 == 248) {
				if (field488 == 12) {
					field136 = true;
				}

				field387 = field390.method50();
				field325 = -1;
				return true;
			}

			if (field325 == 73) {
				int var113 = field390.method75();
				method189(var113);

				if (field334 != -1) {
					method152(field334);
					field334 = -1;
					field136 = true;
					field217 = true;
				}

				if (field128 != -1) {
					method152(field128);
					field128 = -1;
					field205 = true;
				}

				if (field375 != -1) {
					method152(field375);
					field375 = -1;
					field83 = true;
				}

				if (field367 != -1) {
					method152(field367);
					field367 = -1;
				}

				if (field191 != var113) {
					method152(field191);
					field191 = var113;
				}

				if (field218 != 0) {
					field218 = 0;
					field205 = true;
				}

				field90 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 240) {
				field389 = field390.method47();
				field136 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 247) {
				int var114 = field390.method74();
				int var115 = field390.method82();
				field138[var114] = var115;

				if (field148[var114] != var115) {
					field148[var114] = var115;
					method172(var114);
					field136 = true;

					if (field247 != -1) {
						field205 = true;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 4) {
				field252 = field390.method73();
				field169 = field390.method67();
				field325 = -1;
				return true;
			}

			if (field325 == 149) {
				for (int var116 = 0; var116 < field276.length; var116++) {
					if (field276[var116] != null) {
						field276[var116].field585 = -1;
					}
				}

				for (int var117 = 0; var117 < field116.length; var117++) {
					if (field116[var117] != null) {
						field116[var117].field585 = -1;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 101) {
				int var118 = field390.method74();
				int var119 = field390.method74();
				int var120 = var118 >> 10 & 0x1F;
				int var121 = var118 >> 5 & 0x1F;
				int var122 = var118 & 0x1F;
				QHGHUTGN.method445(var119).field1058 = (var122 << 3) + (var120 << 19) + (var121 << 11);
				field325 = -1;
				return true;
			}

			if (field325 == 74) {
				long var123 = field390.method53();
				int var125 = field390.method47();
				String var126 = SFBUQEXP.method509(SFBUQEXP.method506(var123));
				for (int var127 = 0; var127 < field388; var127++) {
					if (field231[var127] == var123) {
						if (field318[var127] != var125) {
							field318[var127] = var125;
							field136 = true;

							if (var125 > 0) {
								method267("", var126 + " has logged in.", 5);
							}

							if (var125 == 0) {
								method267("", var126 + " has logged out.", 5);
							}
						}

						var126 = null;
						break;
					}
				}

				if (var126 != null && field388 < 200) {
					field231[field388] = var123;
					field373[field388] = var126;
					field318[field388] = var125;
					field388++;
					field136 = true;
				}

				boolean var128 = false;
				while (!var128) {
					var128 = true;
					for (int var129 = 0; var129 < field388 - 1; var129++) {
						if (field318[var129] != field513 && field318[var129 + 1] == field513 || field318[var129] == 0 && field318[var129 + 1] != 0) {
							int var130 = field318[var129];
							field318[var129] = field318[var129 + 1];
							field318[var129 + 1] = var130;
							String var131 = field373[var129];
							field373[var129] = field373[var129 + 1];
							field373[var129 + 1] = var131;
							long var132 = field231[var129];
							field231[var129] = field231[var129 + 1];
							field231[var129 + 1] = var132;
							field136 = true;
							var128 = false;
						}
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 157) {
				field253 = 0;
				field325 = -1;
				return true;
			}

			if (field325 == 116) {
				if (field488 == 12) {
					field136 = true;
				}

				field135 = field390.method47();
				field325 = -1;
				return true;
			}

			if (field325 == 165) {
				field162 = false;
				field218 = 1;
				field242 = "";
				field205 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 130) {
				field136 = true;
				int var134 = field390.method49();
				QHGHUTGN var135 = QHGHUTGN.method445(var134);
				while (field390.field55 < field324) {
					int var136 = field390.method61();
					int var137 = field390.method49();
					int var138 = field390.method47();
					if (var138 == 255) {
						var138 = field390.method52();
					}

					if (var136 >= 0 && var136 < var135.field1001.length) {
						var135.field1001[var136] = var137;
						var135.field1051[var136] = var138;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 120) {
				field488 = field390.method65();
				field136 = true;
				field217 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 105) {
				int var139 = field390.method47();
				int var140 = field390.method47();
				int var141 = field390.method47();
				int var142 = field390.method47();
				field292[var139] = true;
				field137[var139] = var140;
				field307[var139] = var141;
				field365[var139] = var142;
				field151[var139] = 0;
				field325 = -1;
				return true;
			}

			if (field325 == 166) {
				int var143 = field390.method49();
				QHGHUTGN.method445(var143).field1037 = 3;

				if (field372.field792 == null) {
					QHGHUTGN.method445(var143).field1038 = (field372.field785[11] << 5) + (field372.field785[8] << 10) + (field372.field785[0] << 15) + (field372.field790[0] << 25) + (field372.field790[4] << 20) + field372.field785[1];
				} else {
					QHGHUTGN.method445(var143).field1038 = (int) (field372.field792.field1469 + 0x12345678L);
				}

				field325 = -1;
				return true;
			}

			if (field325 == 197) {
				field494 = field390.method74() * 30;
				field325 = -1;
				return true;
			}

			if (field325 == 200) {
				field283 = false;

				for (int var144 = 0; var144 < 5; var144++) {
					field292[var144] = false;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 162) {
				if (field334 != -1) {
					method152(field334);
					field334 = -1;
					field136 = true;
					field217 = true;
				}

				if (field128 != -1) {
					method152(field128);
					field128 = -1;
					field205 = true;
				}

				if (field375 != -1) {
					method152(field375);
					field375 = -1;
					field83 = true;
				}

				if (field367 != -1) {
					method152(field367);
					field367 = -1;
				}

				if (field191 != -1) {
					method152(field191);
					field191 = -1;
				}

				if (field218 != 0) {
					field218 = 0;
					field205 = true;
				}

				field90 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 150) {
				field136 = true;
				int var145 = field390.method80();
				int var146 = field390.method67();
				int var147 = field390.method47();
				field300[var146] = var145;
				field380[var146] = var147;
				field168[var146] = 1;
				for (int var148 = 0; var148 < 98; var148++) {
					if (var145 >= field385[var148]) {
						field168[var146] = var148 + 2;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 212) {
				int var149 = field390.method77();
				if (var149 >= 0) {
					method189(var149);
				}

				if (field126 != var149) {
					method152(field126);
					field126 = var149;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 118) {
				int var150 = field390.method65();
				String var151 = field390.method54();
				int var152 = field390.method66();
				if (var152 >= 1 && var152 <= 5) {
					if (var151.equalsIgnoreCase("null")) {
						var151 = null;
					}

					field225[var152 - 1] = var151;
					field226[var152 - 1] = var150 == 0;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 215) {
				field471 = field390.method47();
				if (field488 == field471) {
					if (field471 == 3) {
						field488 = 1;
					} else {
						field488 = 3;
					}

					field136 = true;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 183 || field325 == 152 || field325 == 25 || field325 == 1 || field325 == 143 || field325 == 99 || field325 == 201 || field325 == 174 || field325 == 39 || field325 == 128 || field325 == 168) {
				method173(field390, field325);
				field325 = -1;
				return true;
			}

			if (field325 == 139) {
				for (int var153 = 0; var153 < field148.length; var153++) {
					if (field148[var153] != field138[var153]) {
						field148[var153] = field138[var153];
						method172(var153);
						field136 = true;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 221) {
				field311 = field390.method47();
				field325 = -1;
				return true;
			}

			if (field325 == 72) {
				byte var154 = field390.method68();
				int var155 = field390.method75();
				field138[var155] = var154;

				if (field148[var155] != var154) {
					field148[var155] = var154;
					method172(var155);
					field136 = true;

					if (field247 != -1) {
						field205 = true;
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 43) {
				method212(field324, field390);
				field181 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 203) {
				int var156 = field390.method74();
				int var157 = field390.method75();
				QHGHUTGN.method445(var157).field1037 = 1;
				QHGHUTGN.method445(var157).field1038 = var156;
				field325 = -1;
				return true;
			}

			if (field325 == 13) {
				field492 = field390.method47();
				field184 = field390.method47();
				field179 = field390.method47();
				field75 = true;
				field205 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 146) {
				int var158 = field390.method49();
				boolean var159 = field390.method66() == 1;
				QHGHUTGN.method445(var158).field1032 = var159;
				field325 = -1;
				return true;
			}

			if (field325 == 144) {
				int var160 = field390.method73();
				method189(var160);

				if (field334 != -1) {
					method152(field334);
					field334 = -1;
					field136 = true;
					field217 = true;
				}

				if (field375 != -1) {
					method152(field375);
					field375 = -1;
					field83 = true;
				}

				if (field367 != -1) {
					method152(field367);
					field367 = -1;
				}

				if (field191 != -1) {
					method152(field191);
					field191 = -1;
				}

				if (field128 != var160) {
					method152(field128);
					field128 = var160;
				}

				field90 = false;
				field205 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 26) {
				field162 = false;
				field218 = 2;
				field242 = "";
				field205 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 178) {
				int var161 = field390.method74();
				if (var161 == 0xFFFF) {
					var161 = -1;
				}

				if (field176 != var161 && field216 && !field516 && field445 == 0) {
					field86 = var161;
					field87 = true;
					field417.method556(2, field86);
				}

				field176 = var161;
				field325 = -1;
				return true;
			}

			if (field325 == 163) {
				int var162 = field390.method78();
				int var163 = field390.method73();
				if (field216 && !field516) {
					field86 = var163;
					field87 = false;
					field417.method556(2, field86);
					field445 = var162;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 211) {
				int var164 = field390.method49();
				int var165 = field390.method73();
				method189(var165);

				if (var164 != -1) {
					method189(var164);
				}

				if (field191 != -1) {
					method152(field191);
					field191 = -1;
				}

				if (field334 != -1) {
					method152(field334);
					field334 = -1;
				}

				if (field128 != -1) {
					method152(field128);
					field128 = -1;
				}

				if (field375 != var165) {
					method152(field375);
					field375 = var165;
				}

				if (field367 != var165) {
					method152(field367);
					field367 = var164;
				}

				field218 = 0;
				field90 = false;
				field325 = -1;
				return true;
			}

			if (field325 == 32) {
				field244 = field390.method74();
				field356 = field390.method81();
				field74 = field390.method74();
				field390.method75();
				field390.method75();
				field390.method67();
				field416 = field390.method49();
				field114 = field390.method73();
				field206 = field390.method49();
				field84 = field390.method74();
				field390.method75();
				signlink.dnslookup(SFBUQEXP.method508(field356));
				field325 = -1;
				return true;
			}

			if (field325 == 190) {
				int var166 = field390.method74();
				int var167 = field390.method49();
				int var168 = field390.method73();

				if (var167 == 0xFFFF) {
					QHGHUTGN.method445(var166).field1037 = 0;
					field325 = -1;
					return true;
				}

				QSAFIBMX var169 = QSAFIBMX.method455(var167);
				QHGHUTGN.method445(var166).field1037 = 4;
				QHGHUTGN.method445(var166).field1038 = var167;
				QHGHUTGN.method445(var166).field1056 = var169.field1066;
				QHGHUTGN.method445(var166).field1057 = var169.field1087;
				QHGHUTGN.method445(var166).field1055 = var169.field1076 * 100 / var168;
				field325 = -1;
				return true;
			}

			if (field325 == 154) {
				long var170 = field390.method53();
				int var172 = field390.method52();
				int var173 = field390.method47();
				boolean var174 = false;
				for (int var175 = 0; var175 < 100; var175++) {
					if (field196[var175] == var172) {
						var174 = true;
						break;
					}
				}

				if (var173 <= 1) {
					for (int var176 = 0; var176 < field430; var176++) {
						if (field232[var176] == var170) {
							var174 = true;
							break;
						}
					}
				}

				if (!var174 && field509 == 0) {
					try {
						field196[field228] = var172;
						field228 = (field228 + 1) % 100;
						String var177 = YPBNZDGQ.method590(field390, field324 - 13);
						if (var173 != 3) {
							var177 = BTDNSPCH.method96(var177);
						}

						if (var173 == 2 || var173 == 3) {
							method267("@cr2@" + SFBUQEXP.method509(SFBUQEXP.method506(var170)), var177, 7);
						} else if (var173 == 1) {
							method267("@cr1@" + SFBUQEXP.method509(SFBUQEXP.method506(var170)), var177, 7);
						} else {
							method267(SFBUQEXP.method509(SFBUQEXP.method506(var170)), var177, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field325 = -1;
				return true;
			}

			if (field325 == 186) {
				int var179 = field390.method73();
				int var180 = field390.method50();
				QHGHUTGN var181 = QHGHUTGN.method445(var179);
				if (var181.field1014 != var180 || var180 == -1) {
					var181.field1014 = var180;
					var181.field1025 = 0;
					var181.field1004 = 0;
				}

				field325 = -1;
				return true;
			}

			if (field325 == 112) {
				int var182 = field390.method77();
				if (field247 != var182) {
					method152(field247);
					field247 = var182;
				}

				field205 = true;
				field325 = -1;
				return true;
			}

			if (field325 == 126) {
				field463 = field390.method67();
				field464 = field390.method47();
				for (int var183 = field463; var183 < field463 + 8; var183++) {
					for (int var184 = field464; var184 < field464 + 8; var184++) {
						if (field85[field156][var183][var184] != null) {
							field85[field156][var183][var184] = null;
							method135(var183, var184);
						}
					}
				}

				for (WGFLNQLA var185 = (WGFLNQLA) field291.method300(); var185 != null; var185 = (WGFLNQLA) field291.method302()) {
					if (var185.field1385 >= field463 && var185.field1385 < field463 + 8 && var185.field1386 >= field464 && var185.field1386 < field464 + 8 && field156 == var185.field1383) {
						var185.field1387 = 0;
					}
				}

				field325 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field325 + "," + field324 + " - " + field437 + "," + field438);
			method167();
		} catch (IOException var190) {
			method201();
		} catch (Exception var191) {
			String var187 = "T2 - " + field325 + "," + field437 + "," + field438 + " - " + field324 + "," + (field372.field590[0] + field285) + "," + (field372.field591[0] + field286) + " - ";
			for (int var188 = 0; var188 < field324 && var188 < 50; var188++) {
				var187 = var187 + field390.field54[var188] + ",";
			}

			signlink.reporterror(var187);
			method167();
		}

		return true;
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean method214() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.z(I)V")
	public static final void method215() {
		PAJXYXWG.field862 = false;
		IWBEAICJ.field730 = false;
		field516 = false;
		WZFUDUYZ.field1405 = false;
		RUROEYEG.field1248 = false;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method216() {
		if (field374 == 0 && field970 == 1) {
			int var1 = field971 - 25 - 550;
			int var2 = field972 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field396 + field104 & 0x7FF;
				int var4 = IWBEAICJ.field739[var3];
				int var5 = IWBEAICJ.field740[var3];
				var4 = (field245 + 256) * var4 >> 8;
				var5 = (field245 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field372.field593 + var6 >> 7;
				int var9 = field372.field594 - var7 >> 7;
				boolean var10 = method200(0, 0, 0, var8, field372.field591[0], 1, 0, field372.field590[0], true, 0, var9);
				if (var10) {
					field77.method37(var1);
					field77.method37(var2);
					field77.method38(field104);
					field77.method37(57);
					field77.method37(field396);
					field77.method37(field245);
					field77.method37(89);
					field77.method38(field372.field593);
					field77.method38(field372.field594);
					field77.method37(field123);
					field77.method37(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method217() {
		if (field970 == 1) {
			if (field971 >= 539 && field971 <= 573 && field972 >= 169 && field972 < 205 && field354[0] != -1) {
				field136 = true;
				field488 = 0;
				field217 = true;
			}

			if (field971 >= 569 && field971 <= 599 && field972 >= 168 && field972 < 205 && field354[1] != -1) {
				field136 = true;
				field488 = 1;
				field217 = true;
			}

			if (field971 >= 597 && field971 <= 627 && field972 >= 168 && field972 < 205 && field354[2] != -1) {
				field136 = true;
				field488 = 2;
				field217 = true;
			}

			if (field971 >= 625 && field971 <= 669 && field972 >= 168 && field972 < 203 && field354[3] != -1) {
				field136 = true;
				field488 = 3;
				field217 = true;
			}

			if (field971 >= 666 && field971 <= 696 && field972 >= 168 && field972 < 205 && field354[4] != -1) {
				field136 = true;
				field488 = 4;
				field217 = true;
			}

			if (field971 >= 694 && field971 <= 724 && field972 >= 168 && field972 < 205 && field354[5] != -1) {
				field136 = true;
				field488 = 5;
				field217 = true;
			}

			if (field971 >= 722 && field971 <= 756 && field972 >= 169 && field972 < 205 && field354[6] != -1) {
				field136 = true;
				field488 = 6;
				field217 = true;
			}

			if (field971 >= 540 && field971 <= 574 && field972 >= 466 && field972 < 502 && field354[7] != -1) {
				field136 = true;
				field488 = 7;
				field217 = true;
			}

			if (field971 >= 572 && field971 <= 602 && field972 >= 466 && field972 < 503 && field354[8] != -1) {
				field136 = true;
				field488 = 8;
				field217 = true;
			}

			if (field971 >= 599 && field971 <= 629 && field972 >= 466 && field972 < 503 && field354[9] != -1) {
				field136 = true;
				field488 = 9;
				field217 = true;
			}

			if (field971 >= 627 && field971 <= 671 && field972 >= 467 && field972 < 502 && field354[10] != -1) {
				field136 = true;
				field488 = 10;
				field217 = true;
			}

			if (field971 >= 669 && field971 <= 699 && field972 >= 466 && field972 < 503 && field354[11] != -1) {
				field136 = true;
				field488 = 11;
				field217 = true;
			}

			if (field971 >= 696 && field971 <= 726 && field972 >= 466 && field972 < 503 && field354[12] != -1) {
				field136 = true;
				field488 = 12;
				field217 = true;
			}

			if (field971 >= 724 && field971 <= 758 && field972 >= 466 && field972 < 502 && field354[13] != -1) {
				field136 = true;
				field488 = 13;
				field217 = true;
			}

			field415++;
			if (field415 > 153) {
				field415 = 0;
				field77.method36(155);
				field77.method37(114);
				return;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method218() {
		if (field516 && field248 == 2 && WZFUDUYZ.field1396 != field156) {
			method168("Loading - please wait.", null);
			field248 = 1;
			field510 = System.currentTimeMillis();
		}

		if (field248 == 1) {
			int var1 = method219();
			if (var1 != 0 && System.currentTimeMillis() - field510 > 360000L) {
				signlink.reporterror(field309 + " glcfb " + field465 + "," + var1 + "," + field516 + "," + field219[0] + "," + field417.method552() + "," + field156 + "," + field370 + "," + field371);
				field510 = System.currentTimeMillis();
			}
		}

		if (field248 == 2 && field323 != field156) {
			field323 = field156;
			method204(field156);
		}
	}

	@ObfuscatedName("client.D(I)I")
	public final int method219() {
		for (int var1 = 0; var1 < field127.length; var1++) {
			if (field127[var1] == null && field342[var1] != -1) {
				return -1;
			}

			if (field384[var1] == null && field343[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field127.length; var3++) {
			byte[] var4 = field384[var3];
			if (var4 != null) {
				int var5 = (field341[var3] >> 8) * 64 - field285;
				int var6 = (field341[var3] & 0xFF) * 64 - field286;
				if (field462) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= WZFUDUYZ.method572(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field181) {
			return -4;
		} else {
			field248 = 2;
			WZFUDUYZ.field1396 = field156;
			method183();
			field77.method36(233);
			return 0;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method220(int arg0) {
		if (!field516) {
			for (int var2 = 0; var2 < field386.length; var2++) {
				int var3 = field386[var2];
				if (IWBEAICJ.field749[var3] >= arg0) {
					KYEPSAQL var4 = IWBEAICJ.field743[var3];
					int var5 = var4.field778 * var4.field777 - 1;
					int var6 = field163 * var4.field777 * 2;
					byte[] var7 = var4.field775;
					byte[] var8 = field461;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field775 = var8;
					field461 = var7;
					IWBEAICJ.method331(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public final void method221(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field133.method401(arg3, arg1, arg0);
		if (var6 != 0) {
			int var7 = field133.method405(arg3, arg1, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field255.field40;
			int var12 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			RUROEYEG var14 = RUROEYEG.method494(var13);
			if (var14.field1208 == -1) {
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
				KYEPSAQL var15 = field399[var14.field1208];
				if (var15 != null) {
					int var16 = (var14.field1227 * 4 - var15.field777) / 2;
					int var17 = (var14.field1240 * 4 - var15.field778) / 2;
					var15.method350((104 - arg0 - var14.field1240) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field133.method403(arg3, arg1, arg0);
		if (var18 != 0) {
			int var19 = field133.method405(arg3, arg1, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			RUROEYEG var23 = RUROEYEG.method494(var22);
			if (var23.field1208 != -1) {
				KYEPSAQL var24 = field399[var23.field1208];
				if (var24 != null) {
					int var25 = (var23.field1227 * 4 - var24.field777) / 2;
					int var26 = (var23.field1240 * 4 - var24.field778) / 2;
					var24.method350((104 - arg0 - var23.field1240) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field255.field40;
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

		int var30 = field133.method404(arg3, arg1, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			RUROEYEG var32 = RUROEYEG.method494(var31);
			if (var32.field1208 != -1) {
				KYEPSAQL var33 = field399[var32.field1208];
				if (var33 != null) {
					int var34 = (var32.field1227 * 4 - var33.field777) / 2;
					int var35 = (var32.field1240 * 4 - var33.field778) / 2;
					var33.method350((104 - arg0 - var32.field1240) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method222() {
		if (field421 == 2) {
			method185(field331 * 2, (field329 - field285 << 7) + field332, (field330 - field286 << 7) + field333);

			if (field268 > -1 && field322 % 20 < 10) {
				field357[0].method24(field269 - 28, field268 - 12);
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method223() {
		field182 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field88[var1] = -1;
			for (int var2 = 0; var2 < GLRCYUHA.field624; var2++) {
				if (!GLRCYUHA.field625[var2].field631 && GLRCYUHA.field625[var2].field626 == var1 + (field302 ? 0 : 7)) {
					field88[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public static final void method224() {
		PAJXYXWG.field862 = true;
		IWBEAICJ.field730 = true;
		field516 = true;
		WZFUDUYZ.field1405 = true;
		RUROEYEG.field1248 = true;
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method225(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method226() {
		int var1 = 3;
		if (field223 < 310) {
			int var2 = field220 >> 7;
			int var3 = field222 >> 7;
			int var4 = field372.field593 >> 7;
			int var5 = field372.field594 >> 7;

			if ((field460[field156][var2][var3] & 0x4) != 0) {
				var1 = field156;
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

					if ((field460[field156][var2][var3] & 0x4) != 0) {
						var1 = field156;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field460[field156][var2][var3] & 0x4) != 0) {
							var1 = field156;
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

					if ((field460[field156][var2][var3] & 0x4) != 0) {
						var1 = field156;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field460[field156][var2][var3] & 0x4) != 0) {
							var1 = field156;
						}
					}
				}
			}
		}

		if ((field460[field156][field372.field593 >> 7][field372.field594 >> 7] & 0x4) != 0) {
			var1 = field156;
		}

		return var1;
	}

	@ObfuscatedName("client.F(I)I")
	public final int method227() {
		int var1 = method159(field222, field156, field220);
		if (var1 - field221 < 800 && (field460[field156][field220 >> 7][field222 >> 7] & 0x4) != 0) {
			return field156;
		}

		return 3;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method228() {
		if (field337 != 0) {
			int var1 = 0;
			if (field494 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field394[var2] != null) {
					int var3 = field392[var2];
					String var4 = field393[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field184 == 0 || field184 == 1 && method180(var4))) {
						int var8 = 329 - var1 * 13;
						if (field964 > 4 && field965 - 4 > var8 - 10 && field965 - 4 <= var8 + 3) {
							int var9 = field234.method6("From:  " + var4 + field394[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field964 < var9 + 4) {
								if (field230 >= 1) {
									field76[field369] = "Report abuse @whi@" + var4;
									field141[field369] = 2160;
									field369++;
								}

								field76[field369] = "Add ignore @whi@" + var4;
								field141[field369] = 2352;
								field369++;
								field76[field369] = "Add friend @whi@" + var4;
								field141[field369] = 2702;
								field369++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field184 < 2) {
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

	@ObfuscatedName("client.a(IILYSYPMZMO;II)V")
	public final void method229(int arg0, int arg1, YSYPMZMO arg2, int arg3) {
		if (field369 < 400) {
			if (arg2.field1461 != null) {
				arg2 = arg2.method599();
			}

			if (arg2 != null && arg2.field1467) {
				String var5 = arg2.field1460;
				if (arg2.field1464 != 0) {
					var5 = var5 + method197(arg2.field1464, field372.field795) + " (level-" + arg2.field1464 + ")";
				}

				if (field294 == 1) {
					field76[field369] = "Use " + field298 + " with @yel@" + var5;
					field141[field369] = 669;
					field142[field369] = arg1;
					field139[field369] = arg3;
					field140[field369] = arg0;
					field369++;
				} else if (field361 != 1) {
					if (arg2.field1474 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field1474[var6] != null && !arg2.field1474[var6].equalsIgnoreCase("attack")) {
								field76[field369] = arg2.field1474[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field141[field369] = 15;
								}

								if (var6 == 1) {
									field141[field369] = 271;
								}

								if (var6 == 2) {
									field141[field369] = 764;
								}

								if (var6 == 3) {
									field141[field369] = 410;
								}

								if (var6 == 4) {
									field141[field369] = 816;
								}

								field142[field369] = arg1;
								field139[field369] = arg3;
								field140[field369] = arg0;
								field369++;
							}
						}
					}

					if (arg2.field1474 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field1474[var7] != null && arg2.field1474[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field1464 > field372.field795) {
									var8 = 2000;
								}

								field76[field369] = arg2.field1474[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field141[field369] = var8 + 15;
								}

								if (var7 == 1) {
									field141[field369] = var8 + 271;
								}

								if (var7 == 2) {
									field141[field369] = var8 + 764;
								}

								if (var7 == 3) {
									field141[field369] = var8 + 410;
								}

								if (var7 == 4) {
									field141[field369] = var8 + 816;
								}

								field142[field369] = arg1;
								field139[field369] = arg3;
								field140[field369] = arg0;
								field369++;
							}
						}
					}

					field76[field369] = "Examine @yel@" + var5;
					field141[field369] = 1020;
					field142[field369] = arg1;
					field139[field369] = arg3;
					field140[field369] = arg0;
					field369++;
				} else if ((field363 & 0x2) == 2) {
					field76[field369] = field364 + " @yel@" + var5;
					field141[field369] = 533;
					field142[field369] = arg1;
					field139[field369] = arg3;
					field140[field369] = arg0;
					field369++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method230() {
		if (field260 == 0) {
			int var1 = field970;
			if (field361 == 1 && field971 >= 516 && field972 >= 160 && field971 <= 765 && field972 <= 205) {
				var1 = 0;
			}

			if (field376) {
				if (var1 != 1) {
					int var2 = field964;
					int var3 = field965;
					if (field440 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field440 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field440 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field441 - 10 || var2 > field443 + field441 + 10 || var3 < field442 - 10 || var3 > field444 + field442 + 10) {
						field376 = false;

						if (field440 == 1) {
							field136 = true;
						}

						if (field440 == 2) {
							field205 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field441;
					int var5 = field442;
					int var6 = field443;
					int var7 = field971;
					int var8 = field972;
					if (field440 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field440 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field440 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field369; var10++) {
						int var11 = (field369 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method209(var9);
					}

					field376 = false;

					if (field440 == 1) {
						field136 = true;
					}

					if (field440 == 2) {
						field205 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field369 > 0) {
					int var12 = field141[field369 - 1];
					if (var12 == 155 || var12 == 717 || var12 == 242 || var12 == 339 || var12 == 509 || var12 == 414 || var12 == 424 || var12 == 38 || var12 == 19 || var12 == 936 || var12 == 638 || var12 == 1455) {
						int var13 = field139[field369 - 1];
						int var14 = field140[field369 - 1];
						QHGHUTGN var15 = QHGHUTGN.method445(var14);
						if (var15.field1017 || var15.field1023) {
							field479 = false;
							field147 = 0;
							field258 = var14;
							field259 = var13;
							field260 = 2;
							field261 = field971;
							field262 = field972;

							if (QHGHUTGN.method445(var14).field1007 == field191) {
								field260 = 1;
							}

							if (QHGHUTGN.method445(var14).field1007 == field128) {
								field260 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field119 == 1 || method170(field369 - 1)) && field369 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field369 > 0) {
					method209(field369 - 1);
				}

				if (var1 != 2 || field369 <= 0) {
					return;
				}

				method141();
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method231(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field388; var3++) {
				if (field231[var3] == arg0) {
					field388--;
					field136 = true;

					for (int var4 = var3; var4 < field388; var4++) {
						field373[var4] = field373[var4 + 1];
						field318[var4] = field318[var4 + 1];
						field231[var4] = field231[var4 + 1];
					}

					field77.method36(44);
					field77.method43(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILBISLJVZR;II)V")
	public final void method232(BISLJVZR arg0, int arg1, int arg2) {
		if (arg0 != null) {
			int var4 = field396 + field104 & 0x7FF;
			int var5 = arg1 * arg1 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = RMLAXPMV.field1201[var4];
				int var7 = RMLAXPMV.field1202[var4];
				var6 = var6 * 256 / (field245 + 256);
				var7 = var7 * 256 / (field245 + 256);
				int var8 = arg1 * var6 + arg2 * var7 >> 16;
				int var9 = arg1 * var7 - arg2 * var6 >> 16;
				if (var5 > 2500) {
					arg0.method30(var8 + 94 + 4 - arg0.field45 / 2, field382, 83 - var9 - arg0.field46 / 2 - 4);
				} else {
					arg0.method24(83 - var9 - arg0.field46 / 2 - 4, var8 + 94 - arg0.field45 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method233() {
		if (field431 || field432 || field129) {
			method161();
		} else {
			field395++;

			if (field256) {
				method251();
			} else {
				method254(false);
			}

			field272 = 0;
		}
	}

	@ObfuscatedName("client.a(ILQHGHUTGN;I)I")
	public final int method234(int arg0, QHGHUTGN arg1) {
		if (arg1.field1013 == null || arg0 >= arg1.field1013.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1013[arg0];
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
					var8 = field380[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field168[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field300[var3[var5++]];
				}

				if (var7 == 4) {
					QHGHUTGN var10 = QHGHUTGN.method445(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < QSAFIBMX.field1061 && (!QSAFIBMX.method455(var11).field1092 || field515)) {
						for (int var12 = 0; var12 < var10.field1001.length; var12++) {
							if (var11 + 1 == var10.field1001[var12]) {
								var8 += var10.field1051[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field148[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field385[field168[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field148[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field372.field795;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < VBDGXFVG.field1319; var13++) {
						if (VBDGXFVG.field1321[var13]) {
							var8 += field168[var13];
						}
					}
				}

				if (var7 == 10) {
					QHGHUTGN var14 = QHGHUTGN.method445(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < QSAFIBMX.field1061 && (!QSAFIBMX.method455(var15).field1092 || field515)) {
						for (int var16 = 0; var16 < var14.field1001.length; var16++) {
							if (var14.field1001[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field135;
				}

				if (var7 == 12) {
					var8 = field387;
				}

				if (var7 == 13) {
					int var17 = field148[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					DUEJVLYB var20 = DUEJVLYB.field550[var19];
					int var21 = var20.field552;
					int var22 = var20.field553;
					int var23 = var20.field554;
					int var24 = field238[var23 - var22];
					var8 = field148[var21] >> var22 & var24;
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
					var8 = (field372.field593 >> 7) + field285;
				}

				if (var7 == 19) {
					var8 = (field372.field594 >> 7) + field286;
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

	@ObfuscatedName("client.a(Z[BI)Z")
	public final boolean method235(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.I(I)V")
	public final void method236() {
		while (true) {
			IIWNEACY var1 = field417.method551();
			if (var1 == null) {
				return;
			}

			if (var1.field716 == 0) {
				RMLAXPMV.method464(var1.field717, var1.field713);

				if ((field417.method539(var1.field717) & 0x62) != 0) {
					field136 = true;

					if (field128 != -1 || field247 != -1) {
						field205 = true;
					}
				}
			}

			if (var1.field716 == 1 && var1.field713 != null) {
				XMRZESBN.method583(var1.field713);
			}

			if (var1.field716 == 2 && field86 == var1.field717 && var1.field713 != null) {
				method269(field87, var1.field713);
			}

			if (var1.field716 == 3 && field248 == 1) {
				for (int var2 = 0; var2 < field127.length; var2++) {
					if (field342[var2] == var1.field717) {
						field127[var2] = var1.field713;

						if (var1.field713 == null) {
							field342[var2] = -1;
						}

						break;
					}

					if (field343[var2] == var1.field717) {
						field384[var2] = var1.field713;

						if (var1.field713 == null) {
							field343[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field716 == 93 && field417.method546(var1.field717)) {
				WZFUDUYZ.method563(new BSNPYLEV(var1.field713), field417);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method237() {
		for (RGPDRBLW var1 = (RGPDRBLW) field505.method300(); var1 != null; var1 = (RGPDRBLW) field505.method302()) {
			if (field156 != var1.field1123 || field322 > var1.field1112) {
				var1.method518();
			} else if (field322 >= var1.field1111) {
				if (var1.field1122 > 0) {
					TOFRUGLM var2 = field116[var1.field1122 - 1];
					if (var2 != null && var2.field593 >= 0 && var2.field593 < 13312 && var2.field594 >= 0 && var2.field594 < 13312) {
						var1.method460(method159(var2.field594, var1.field1123, var2.field593) - var1.field1127, var2.field593, var2.field594, field322);
					}
				}

				if (var1.field1122 < 0) {
					int var3 = -var1.field1122 - 1;
					KZCOXKKW var4;
					if (field252 == var3) {
						var4 = field372;
					} else {
						var4 = field276[var3];
					}

					if (var4 != null && var4.field593 >= 0 && var4.field593 < 13312 && var4.field594 >= 0 && var4.field594 < 13312) {
						var1.method460(method159(var4.field594, var1.field1123, var4.field593) - var1.field1127, var4.field593, var4.field594, field322);
					}
				}

				var1.method461(field163);
				field133.method386(var1, field156, var1.field1109, false, -1, (int) var1.field1131, 60, (int) var1.field1130, (int) var1.field1129);
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method238(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method239() {
		int var1 = field441;
		int var2 = field442;
		int var3 = field443;
		int var4 = field444;
		int var5 = 0x5D5447;
		TYMHEFTS.method528(var3, var2, var1, var4, var5);
		TYMHEFTS.method528(var3 - 2, var2 + 1, var1 + 1, 16, 0);
		TYMHEFTS.method529(var3 - 2, var4 - 19, var2 + 18, 0, var1 + 1);
		field235.method8(var1 + 3, "Choose Option", var2 + 14, var5);
		int var6 = field964;
		int var7 = field965;
		if (field440 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field440 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field440 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field369; var8++) {
			int var9 = (field369 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field235.method12(var1 + 3, true, var9, field76[var8], var10);
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method240() {
		field155 = false;
		while (field422) {
			field155 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field153 = null;
		field154 = null;
		field316 = null;
		field207 = null;
		field208 = null;
		field209 = null;
		field210 = null;
		field214 = null;
		field215 = null;
		field506 = null;
		field507 = null;
		field212 = null;
		field213 = null;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(LQHGHUTGN;Z)V")
	public final void method241(QHGHUTGN arg0) {
		int var2 = arg0.field1016;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field389 == 0) {
				arg0.field1006 = "Loading friend list";
				arg0.field1054 = 0;
			} else if (var2 == 1 && field389 == 1) {
				arg0.field1006 = "Connecting to friendserver";
				arg0.field1054 = 0;
			} else if (var2 == 2 && field389 != 2) {
				arg0.field1006 = "Please wait...";
				arg0.field1054 = 0;
			} else {
				int var3 = field388;
				if (field389 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1006 = "";
					arg0.field1054 = 0;
				} else {
					arg0.field1006 = field373[var2];
					arg0.field1054 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field388;
			if (field389 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1006 = "";
				arg0.field1054 = 0;
			} else {
				if (field318[var2] == 0) {
					arg0.field1006 = "@red@Offline";
				} else if (field318[var2] < 200) {
					if (field318[var2] == field513) {
						arg0.field1006 = "@gre@World" + (field318[var2] - 9);
					} else {
						arg0.field1006 = "@yel@World" + (field318[var2] - 9);
					}
				} else if (field318[var2] == field513) {
					arg0.field1006 = "@gre@Classic" + (field318[var2] - 219);
				} else {
					arg0.field1006 = "@yel@Classic" + (field318[var2] - 219);
				}

				arg0.field1054 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field388;
			if (field389 != 2) {
				var5 = 0;
			}

			arg0.field1011 = var5 * 15 + 20;
			if (arg0.field1011 <= arg0.field1028) {
				arg0.field1011 = arg0.field1028 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field389 == 0) {
				arg0.field1006 = "Loading ignore list";
				arg0.field1054 = 0;
			} else if (var2 == 1 && field389 == 0) {
				arg0.field1006 = "Please wait...";
				arg0.field1054 = 0;
			} else {
				int var6 = field430;
				if (field389 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1006 = "";
					arg0.field1054 = 0;
				} else {
					arg0.field1006 = SFBUQEXP.method509(SFBUQEXP.method506(field232[var2]));
					arg0.field1054 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1011 = field430 * 15 + 20;
			if (arg0.field1011 <= arg0.field1028) {
				arg0.field1011 = arg0.field1028 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1056 = 150;
			arg0.field1057 = (int) (Math.sin(field322 / 40.0D) * 256.0D) & 0x7FF;

			if (field182) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field88[var7];
					if (var8 >= 0 && !GLRCYUHA.field625[var8].method312()) {
						return;
					}
				}

				field182 = false;
				RMLAXPMV[] var9 = new RMLAXPMV[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field88[var11];
					if (var12 >= 0) {
						var9[var10++] = GLRCYUHA.field625[var12].method313();
					}
				}

				RMLAXPMV var13 = new RMLAXPMV(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field490[var14] != 0) {
						var13.method480(field336[var14][0], field336[var14][field490[var14]]);

						if (var14 == 1) {
							var13.method480(field420[0], field420[field490[var14]]);
						}
					}
				}

				var13.method473();
				var13.method474(JZQVOFSF.field757[field372.field583].field759[0]);
				var13.method483(64, 850, -30, -50, -30, true);
				arg0.field1037 = 5;
				arg0.field1038 = 0;
				QHGHUTGN.method442(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field377 == null) {
				field377 = arg0.field1021;
				field378 = arg0.field1019;
			}

			if (field302) {
				arg0.field1021 = field378;
			} else {
				arg0.field1021 = field377;
			}
		} else if (var2 == 325) {
			if (field377 == null) {
				field377 = arg0.field1021;
				field378 = arg0.field1019;
			}

			if (field302) {
				arg0.field1021 = field377;
			} else {
				arg0.field1021 = field378;
			}
		} else if (var2 == 600) {
			arg0.field1006 = field132;
			if (field322 % 20 < 10) {
				arg0.field1006 = arg0.field1006 + "|";
			} else {
				arg0.field1006 = arg0.field1006 + " ";
			}
		} else if (var2 == 620) {
			if (field230 < 1) {
				arg0.field1006 = "";
			} else if (field143) {
				arg0.field1058 = 0xFF0000;
				arg0.field1006 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1058 = 0xFFFFFF;
				arg0.field1006 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field416 - field244;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1006 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field114 == 0) {
				arg0.field1006 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field114 <= field416) {
				arg0.field1006 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method242(field114);
			} else {
				int var17 = field416 + 14 - field114;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1006 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method242(field114) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field84 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field84 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field84 + " unread messages";
			}

			arg0.field1006 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field206 > 0 && field206 <= field416 + 10) {
				arg0.field1006 = "Last password change:\\n@gre@" + method242(field206);
			} else {
				arg0.field1006 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field74 > 2 && !field515) {
				arg0.field1006 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field74 > 2) {
				arg0.field1006 = "\\n\\nYou have @gre@" + field74 + "@yel@ days of\\nmember credit remaining.";
			} else if (field74 > 0) {
				arg0.field1006 = "You have @gre@" + field74 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1006 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field74 > 2 && !field515) {
				arg0.field1006 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field74 > 0) {
				arg0.field1006 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1006 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field114 > field416) {
				arg0.field1006 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1006 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public final String method242(int arg0) {
		if (arg0 > field416 + 10) {
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

	@ObfuscatedName("client.c(IB)Ljava/lang/String;")
	public static final String method243(int arg0) {
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

	@ObfuscatedName("client.K(I)V")
	public final void method244() {
		for (int var1 = 0; var1 < field117; var1++) {
			int var2 = field118[var1];
			TOFRUGLM var3 = field116[var2];
			if (var3 != null) {
				method245(var3.field1283.field1457, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILFSZDVUBI;)V")
	public final void method245(int arg0, FSZDVUBI arg1) {
		if (arg1.field593 < 128 || arg1.field594 < 128 || arg1.field593 >= 13184 || arg1.field594 >= 13184) {
			arg1.field585 = -1;
			arg1.field614 = -1;
			arg1.field578 = 0;
			arg1.field579 = 0;
			arg1.field593 = arg1.field590[0] * 128 + arg1.field569 * 64;
			arg1.field594 = arg1.field591[0] * 128 + arg1.field569 * 64;
			arg1.method306();
		}

		if (field372 == arg1 && (arg1.field593 < 1536 || arg1.field594 < 1536 || arg1.field593 >= 11776 || arg1.field594 >= 11776)) {
			arg1.field585 = -1;
			arg1.field614 = -1;
			arg1.field578 = 0;
			arg1.field579 = 0;
			arg1.field593 = arg1.field590[0] * 128 + arg1.field569 * 64;
			arg1.field594 = arg1.field591[0] * 128 + arg1.field569 * 64;
			arg1.method306();
		}

		if (arg1.field578 > field322) {
			method246(arg1);
		} else if (arg1.field579 >= field322) {
			method247(arg1);
		} else {
			method248(arg1);
		}

		method249(arg1);
		method250(arg1);
	}

	@ObfuscatedName("client.a(ILFSZDVUBI;)V")
	public final void method246(FSZDVUBI arg0) {
		int var2 = arg0.field578 - field322;
		int var3 = arg0.field574 * 128 + arg0.field569 * 64;
		int var4 = arg0.field576 * 128 + arg0.field569 * 64;
		arg0.field593 += (var3 - arg0.field593) / var2;
		arg0.field594 += (var4 - arg0.field594) / var2;
		arg0.field581 = 0;

		if (arg0.field580 == 0) {
			arg0.field603 = 1024;
		}

		if (arg0.field580 == 1) {
			arg0.field603 = 1536;
		}

		if (arg0.field580 == 2) {
			arg0.field603 = 0;
		}

		if (arg0.field580 == 3) {
			arg0.field603 = 512;
		}
	}

	@ObfuscatedName("client.a(LFSZDVUBI;Z)V")
	public final void method247(FSZDVUBI arg0) {
		if (field322 == arg0.field579 || arg0.field585 == -1 || arg0.field588 != 0 || arg0.field587 + 1 > JZQVOFSF.field757[arg0.field585].method342(arg0.field586)) {
			int var2 = arg0.field579 - arg0.field578;
			int var3 = field322 - arg0.field578;
			int var4 = arg0.field574 * 128 + arg0.field569 * 64;
			int var5 = arg0.field576 * 128 + arg0.field569 * 64;
			int var6 = arg0.field575 * 128 + arg0.field569 * 64;
			int var7 = arg0.field577 * 128 + arg0.field569 * 64;
			arg0.field593 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field594 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field581 = 0;

		if (arg0.field580 == 0) {
			arg0.field603 = 1024;
		}

		if (arg0.field580 == 1) {
			arg0.field603 = 1536;
		}

		if (arg0.field580 == 2) {
			arg0.field603 = 0;
		}

		if (arg0.field580 == 3) {
			arg0.field603 = 512;
		}

		arg0.field595 = arg0.field603;
	}

	@ObfuscatedName("client.a(LFSZDVUBI;B)V")
	public final void method248(FSZDVUBI arg0) {
		arg0.field609 = arg0.field583;
		if (arg0.field592 == 0) {
			arg0.field581 = 0;
		} else {
			if (arg0.field585 != -1 && arg0.field588 == 0) {
				JZQVOFSF var2 = JZQVOFSF.field757[arg0.field585];
				if (arg0.field597 > 0 && var2.field769 == 0) {
					arg0.field581++;
					return;
				}

				if (arg0.field597 <= 0 && var2.field770 == 0) {
					arg0.field581++;
					return;
				}
			}

			int var3 = arg0.field593;
			int var4 = arg0.field594;
			int var5 = arg0.field590[arg0.field592 - 1] * 128 + arg0.field569 * 64;
			int var6 = arg0.field591[arg0.field592 - 1] * 128 + arg0.field569 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field603 = 1280;
					} else if (var4 > var6) {
						arg0.field603 = 1792;
					} else {
						arg0.field603 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field603 = 768;
					} else if (var4 > var6) {
						arg0.field603 = 256;
					} else {
						arg0.field603 = 512;
					}
				} else if (var4 < var6) {
					arg0.field603 = 1024;
				} else {
					arg0.field603 = 0;
				}

				int var7 = arg0.field603 - arg0.field595 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field571;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field570;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field573;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field572;
				}

				if (var8 == -1) {
					var8 = arg0.field570;
				}

				arg0.field609 = var8;
				int var9 = 4;
				if (arg0.field603 != arg0.field595 && arg0.field604 == -1 && arg0.field612 != 0) {
					var9 = 2;
				}

				if (arg0.field592 > 2) {
					var9 = 6;
				}

				if (arg0.field592 > 3) {
					var9 = 8;
				}

				if (arg0.field581 > 0 && arg0.field592 > 1) {
					var9 = 8;
					arg0.field581--;
				}

				if (arg0.field605[arg0.field592 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field609 == arg0.field570 && arg0.field613 != -1) {
					arg0.field609 = arg0.field613;
				}

				if (var3 < var5) {
					arg0.field593 += var9;
					if (arg0.field593 > var5) {
						arg0.field593 = var5;
					}
				} else if (var3 > var5) {
					arg0.field593 -= var9;
					if (arg0.field593 < var5) {
						arg0.field593 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field594 += var9;
					if (arg0.field594 > var6) {
						arg0.field594 = var6;
					}
				} else if (var4 > var6) {
					arg0.field594 -= var9;
					if (arg0.field594 < var6) {
						arg0.field594 = var6;
					}
				}

				if (arg0.field593 == var5 && arg0.field594 == var6) {
					arg0.field592--;

					if (arg0.field597 > 0) {
						arg0.field597--;
						return;
					}
				}
			} else {
				arg0.field593 = var5;
				arg0.field594 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ILFSZDVUBI;)V")
	public final void method249(FSZDVUBI arg0) {
		if (arg0.field612 != 0) {
			if (arg0.field604 != -1 && arg0.field604 < 32768) {
				TOFRUGLM var2 = field116[arg0.field604];
				if (var2 != null) {
					int var3 = arg0.field593 - var2.field593;
					int var4 = arg0.field594 - var2.field594;
					if (var3 != 0 || var4 != 0) {
						arg0.field603 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field604 >= 32768) {
				int var5 = arg0.field604 - 32768;
				if (field252 == var5) {
					var5 = field275;
				}

				KZCOXKKW var6 = field276[var5];
				if (var6 != null) {
					int var7 = arg0.field593 - var6.field593;
					int var8 = arg0.field594 - var6.field594;
					if (var7 != 0 || var8 != 0) {
						arg0.field603 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field600 != 0 || arg0.field601 != 0) && (arg0.field592 == 0 || arg0.field581 > 0)) {
				int var9 = arg0.field593 - (arg0.field600 - field285 - field285) * 64;
				int var10 = arg0.field594 - (arg0.field601 - field286 - field286) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field603 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field600 = 0;
				arg0.field601 = 0;
			}

			int var11 = arg0.field603 - arg0.field595 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field612 || var11 > 2048 - arg0.field612) {
					arg0.field595 = arg0.field603;
				} else if (var11 > 1024) {
					arg0.field595 -= arg0.field612;
				} else {
					arg0.field595 += arg0.field612;
				}

				arg0.field595 &= 0x7FF;
				if (arg0.field609 == arg0.field583 && arg0.field603 != arg0.field595) {
					if (arg0.field584 != -1) {
						arg0.field609 = arg0.field584;
						return;
					}

					arg0.field609 = arg0.field570;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LFSZDVUBI;B)V")
	public final void method250(FSZDVUBI arg0) {
		arg0.field582 = false;

		if (arg0.field609 != -1) {
			JZQVOFSF var2 = JZQVOFSF.field757[arg0.field609];
			arg0.field611++;
			if (arg0.field610 < var2.field758 && arg0.field611 > var2.method342(arg0.field610)) {
				arg0.field611 = 1;
				arg0.field610++;
			}

			if (arg0.field610 >= var2.field758) {
				arg0.field611 = 1;
				arg0.field610 = 0;
			}
		}

		if (arg0.field614 != -1 && field322 >= arg0.field617) {
			if (arg0.field615 < 0) {
				arg0.field615 = 0;
			}

			JZQVOFSF var3 = MHWTJCHJ.field839[arg0.field614].field843;
			arg0.field616++;
			if (arg0.field615 < var3.field758 && arg0.field616 > var3.method342(arg0.field615)) {
				arg0.field616 = 1;
				arg0.field615++;
			}

			if (arg0.field615 >= var3.field758 && (arg0.field615 < 0 || arg0.field615 >= var3.field758)) {
				arg0.field614 = -1;
			}
		}

		if (arg0.field585 != -1 && arg0.field588 <= 1) {
			JZQVOFSF var4 = JZQVOFSF.field757[arg0.field585];
			if (var4.field769 == 1 && arg0.field597 > 0 && arg0.field578 <= field322 && arg0.field579 < field322) {
				arg0.field588 = 1;
				return;
			}
		}

		if (arg0.field585 != -1 && arg0.field588 == 0) {
			JZQVOFSF var5 = JZQVOFSF.field757[arg0.field585];
			arg0.field587++;
			if (arg0.field586 < var5.field758 && arg0.field587 > var5.method342(arg0.field586)) {
				arg0.field587 = 1;
				arg0.field586++;
			}

			if (arg0.field586 >= var5.field758) {
				arg0.field586 -= var5.field762;
				arg0.field589++;
				if (arg0.field589 >= var5.field768) {
					arg0.field585 = -1;
				}

				if (arg0.field586 < 0 || arg0.field586 >= var5.field758) {
					arg0.field585 = -1;
				}
			}

			arg0.field582 = var5.field764;
		}

		if (arg0.field588 > 0) {
			arg0.field588--;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method251() {
		if (field375 == -1 || field248 != 2 && field957 == null) {
			if (field83) {
				method127();
				field83 = false;
				field495.method322(4, field956, 0);
				field496.method322(357, field956, 0);
				field497.method322(4, field956, 722);
				field498.method322(205, field956, 743);
				field499.method322(0, field956, 0);
				field500.method322(4, field956, 516);
				field501.method322(205, field956, 516);
				field502.method322(357, field956, 496);
				field503.method322(338, field956, 0);
				field136 = true;
				field205 = true;
				field217 = true;
				field75 = true;

				if (field248 != 2) {
					field458.method322(4, field956, 4);
					field457.method322(4, field956, 550);
				}
			}

			if (field248 == 2) {
				method262();
			}

			if (field376 && field440 == 1) {
				field136 = true;
			}

			if (field334 != -1) {
				boolean var3 = method169(field163, field334);
				if (var3) {
					field136 = true;
				}
			}

			if (field111 == 2) {
				field136 = true;
			}

			if (field260 == 2) {
				field136 = true;
			}

			if (field136) {
				method151();
				field136 = false;
			}

			field170++;
			if (field170 > 179) {
				field170 = 0;
				field77.method36(73);
				field77.method41(0);
			}

			if (field128 == -1 && field218 == 0) {
				field229.field1018 = field177 - field78 - 77;

				if (field964 > 448 && field964 < 560 && field965 > 332) {
					method162(field965 - 357, -1, field964 - 17, field229, 463, field177, 77, 0);
				}

				int var4 = field177 - field229.field1018 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field177 - 77) {
					var4 = field177 - 77;
				}

				if (field78 != var4) {
					field78 = var4;
					field205 = true;
				}
			}

			if (field128 == -1 && field218 == 3) {
				int var5 = field158 * 14 + 7;
				field229.field1018 = field161;

				if (field964 > 448 && field964 < 560 && field965 > 332) {
					method162(field965 - 357, -1, field964 - 17, field229, 463, var5, 77, 0);
				}

				int var6 = field229.field1018;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field161 != var6) {
					field161 = var6;
					field205 = true;
				}
			}

			if (field128 != -1) {
				boolean var7 = method169(field163, field128);
				if (var7) {
					field205 = true;
				}
			}

			if (field111 == 3) {
				field205 = true;
			}

			if (field260 == 3) {
				field205 = true;
			}

			if (field183 != null) {
				field205 = true;
			}

			if (field376 && field440 == 2) {
				field205 = true;
			}

			if (field205) {
				method146();
				field205 = false;
			}

			if (field248 == 2) {
				method125();
				field457.method322(4, field956, 550);
			}

			if (field471 != -1) {
				field217 = true;
			}

			if (field217) {
				if (field471 != -1 && field488 == field471) {
					field471 = -1;
					field77.method36(97);
					field77.method37(field488);
				}

				field217 = false;
				field199.method321();
				field173.method350(0, 0);

				if (field334 == -1) {
					if (field354[field488] != -1) {
						if (field488 == 0) {
							field400.method350(10, 22);
						}

						if (field488 == 1) {
							field401.method350(8, 54);
						}

						if (field488 == 2) {
							field401.method350(8, 82);
						}

						if (field488 == 3) {
							field402.method350(8, 110);
						}

						if (field488 == 4) {
							field404.method350(8, 153);
						}

						if (field488 == 5) {
							field404.method350(8, 181);
						}

						if (field488 == 6) {
							field403.method350(9, 209);
						}
					}

					if (field354[0] != -1 && (field471 != 0 || field322 % 20 < 10)) {
						field251[0].method350(13, 29);
					}

					if (field354[1] != -1 && (field471 != 1 || field322 % 20 < 10)) {
						field251[1].method350(11, 53);
					}

					if (field354[2] != -1 && (field471 != 2 || field322 % 20 < 10)) {
						field251[2].method350(11, 82);
					}

					if (field354[3] != -1 && (field471 != 3 || field322 % 20 < 10)) {
						field251[3].method350(12, 115);
					}

					if (field354[4] != -1 && (field471 != 4 || field322 % 20 < 10)) {
						field251[4].method350(13, 153);
					}

					if (field354[5] != -1 && (field471 != 5 || field322 % 20 < 10)) {
						field251[5].method350(11, 180);
					}

					if (field354[6] != -1 && (field471 != 6 || field322 % 20 < 10)) {
						field251[6].method350(13, 208);
					}
				}

				field199.method322(160, field956, 516);
				field198.method321();
				field172.method350(0, 0);

				if (field334 == -1) {
					if (field354[field488] != -1) {
						if (field488 == 7) {
							field472.method350(0, 42);
						}

						if (field488 == 8) {
							field473.method350(0, 74);
						}

						if (field488 == 9) {
							field473.method350(0, 102);
						}

						if (field488 == 10) {
							field474.method350(1, 130);
						}

						if (field488 == 11) {
							field476.method350(0, 173);
						}

						if (field488 == 12) {
							field476.method350(0, 201);
						}

						if (field488 == 13) {
							field475.method350(0, 229);
						}
					}

					if (field354[8] != -1 && (field471 != 8 || field322 % 20 < 10)) {
						field251[7].method350(2, 74);
					}

					if (field354[9] != -1 && (field471 != 9 || field322 % 20 < 10)) {
						field251[8].method350(3, 102);
					}

					if (field354[10] != -1 && (field471 != 10 || field322 % 20 < 10)) {
						field251[9].method350(4, 137);
					}

					if (field354[11] != -1 && (field471 != 11 || field322 % 20 < 10)) {
						field251[10].method350(2, 174);
					}

					if (field354[12] != -1 && (field471 != 12 || field322 % 20 < 10)) {
						field251[11].method350(2, 201);
					}

					if (field354[13] != -1 && (field471 != 13 || field322 % 20 < 10)) {
						field251[12].method350(2, 226);
					}
				}

				field198.method322(466, field956, 496);
				field458.method321();
				IWBEAICJ.field741 = field187;
			}

			if (field75) {
				field75 = false;
				field197.method321();
				field171.method350(0, 0);
				field234.method5(true, "Public chat", 28, 0xFFFFFF, 55);

				if (field492 == 0) {
					field234.method5(true, "On", 41, 0xFF00, 55);
				}

				if (field492 == 1) {
					field234.method5(true, "Friends", 41, 0xFFFF00, 55);
				}

				if (field492 == 2) {
					field234.method5(true, "Off", 41, 0xFF0000, 55);
				}

				if (field492 == 3) {
					field234.method5(true, "Hide", 41, 0xFFFF, 55);
				}

				field234.method5(true, "Private chat", 28, 0xFFFFFF, 184);

				if (field184 == 0) {
					field234.method5(true, "On", 41, 0xFF00, 184);
				}

				if (field184 == 1) {
					field234.method5(true, "Friends", 41, 0xFFFF00, 184);
				}

				if (field184 == 2) {
					field234.method5(true, "Off", 41, 0xFF0000, 184);
				}

				field234.method5(true, "Trade/compete", 28, 0xFFFFFF, 324);

				if (field179 == 0) {
					field234.method5(true, "On", 41, 0xFF00, 324);
				}

				if (field179 == 1) {
					field234.method5(true, "Friends", 41, 0xFFFF00, 324);
				}

				if (field179 == 2) {
					field234.method5(true, "Off", 41, 0xFF0000, 324);
				}

				field234.method5(true, "Report abuse", 33, 0xFFFFFF, 458);
				field197.method322(453, field956, 0);
				field458.method321();
				IWBEAICJ.field741 = field187;
			}

			field163 = 0;
		} else {
			if (field248 == 2) {
				method169(field163, field375);

				if (field367 != -1) {
					method169(field163, field367);
				}

				field163 = 0;
				method177();
				field957.method321();
				IWBEAICJ.field741 = field188;
				TYMHEFTS.method526();
				field83 = true;
				QHGHUTGN var1 = QHGHUTGN.method445(field375);
				if (var1.field1049 == 512 && var1.field1028 == 334 && var1.field1026 == 0) {
					var1.field1049 = 765;
					var1.field1028 = 503;
				}

				method166(0, 0, var1, 0);

				if (field367 != -1) {
					QHGHUTGN var2 = QHGHUTGN.method445(field367);
					if (var2.field1049 == 512 && var2.field1028 == 334 && var2.field1026 == 0) {
						var2.field1049 = 765;
						var2.field1028 = 503;
					}

					method166(0, 0, var2, 0);
				}

				if (field376) {
					method239();
				} else {
					method171();
					method190();
				}
			}

			field957.method322(0, field956, 0);
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method252() {
		RUROEYEG.field1207.method34();
		RUROEYEG.field1211.method34();
		YSYPMZMO.field1463.method34();
		QSAFIBMX.field1085.method34();
		QSAFIBMX.field1089.method34();
		KZCOXKKW.field788.method34();
		MHWTJCHJ.field851.method34();
	}

	@ObfuscatedName("client.n(B)V")
	public final void method253() {
		field446 = 0;
		for (int var1 = -1; var1 < field277 + field117; var1++) {
			FSZDVUBI var2;
			if (var1 == -1) {
				var2 = field372;
			} else if (var1 < field277) {
				var2 = field276[field278[var1]];
			} else {
				var2 = field116[field118[var1 - field277]];
			}

			if (var2 != null && var2.method307()) {
				if (var2 instanceof TOFRUGLM) {
					YSYPMZMO var3 = ((TOFRUGLM) var2).field1283;
					if (var3.field1461 != null) {
						var3 = var3.method599();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field277) {
					YSYPMZMO var6 = ((TOFRUGLM) var2).field1283;
					if (var6.field1481 >= 0 && var6.field1481 < field211.length) {
						method184(var2.field599 + 15, var2);

						if (field268 > -1) {
							field211[var6.field1481].method24(field269 - 30, field268 - 12);
						}
					}

					if (field421 == 1 && field118[var1 - field277] == field478 && field322 % 20 < 10) {
						method184(var2.field599 + 15, var2);

						if (field268 > -1) {
							field357[0].method24(field269 - 28, field268 - 12);
						}
					}
				} else {
					int var4 = 30;
					KZCOXKKW var5 = (KZCOXKKW) var2;
					if (var5.field789 != -1 || var5.field784 != -1) {
						method184(var2.field599 + 15, var2);

						if (field268 > -1) {
							if (var5.field789 != -1) {
								field398[var5.field789].method24(field269 - var4, field268 - 12);
								var4 += 25;
							}

							if (var5.field784 != -1) {
								field211[var5.field784].method24(field269 - var4, field268 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field421 == 10 && field278[var1] == field134) {
						method184(var2.field599 + 15, var2);

						if (field268 > -1) {
							field357[1].method24(field269 - var4, field268 - 12);
						}
					}
				}

				if (var2.field622 != null && (var1 >= field277 || field492 == 0 || field492 == 3 || field492 == 1 && method180(((KZCOXKKW) var2).field786))) {
					method184(var2.field599, var2);

					if (field268 > -1 && field446 < field447) {
						field451[field446] = field235.method7(var2.field622) / 2;
						field450[field446] = field235.field23;
						field448[field446] = field268;
						field449[field446] = field269;
						field452[field446] = var2.field598;
						field453[field446] = var2.field602;
						field454[field446] = var2.field596;
						field455[field446++] = var2.field622;

						if (field174 == 0 && var2.field602 >= 1 && var2.field602 <= 3) {
							field450[field446] += 10;
							field449[field446] += 5;
						}

						if (field174 == 0 && var2.field602 == 4) {
							field451[field446] = 60;
						}

						if (field174 == 0 && var2.field602 == 5) {
							field450[field446] += 5;
						}
					}
				}

				if (var2.field619 > field322) {
					method184(var2.field599 + 15, var2);

					if (field268 > -1) {
						int var7 = var2.field620 * 30 / var2.field621;
						if (var7 > 30) {
							var7 = 30;
						}

						TYMHEFTS.method528(var7, field269 - 3, field268 - 15, 5, 0xFF00);
						TYMHEFTS.method528(30 - var7, field269 - 3, field268 + var7 - 15, 5, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field608[var8] > field322) {
						method184(var2.field599 / 2, var2);

						if (field268 > -1) {
							if (var8 == 1) {
								field269 -= 20;
							}

							if (var8 == 2) {
								field268 -= 15;
								field269 -= 10;
							}

							if (var8 == 3) {
								field268 += 15;
								field269 -= 10;
							}

							field419[var2.field607[var8]].method24(field269 - 12, field268 - 12);
							field233.method4(0, field269 + 4, String.valueOf(var2.field606[var8]), field268);
							field233.method4(0xFFFFFF, field269 + 3, String.valueOf(var2.field606[var8]), field268 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field446; var9++) {
			int var10 = field448[var9];
			int var11 = field449[var9];
			int var12 = field451[var9];
			int var13 = field450[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field449[var15] - field450[var15] && var11 - var13 < field449[var15] + 2 && var10 - var12 < field451[var15] + field448[var15] && var10 + var12 > field448[var15] - field451[var15] && field449[var15] - field450[var15] < var11) {
						var11 = field449[var15] - field450[var15];
						var14 = true;
					}
				}
			}

			field268 = field448[var9];
			field269 = field449[var9] = var11;
			String var16 = field455[var9];
			if (field174 == 0) {
				int var17 = 0xFFFF00;
				if (field452[var9] < 6) {
					var17 = field239[field452[var9]];
				}

				if (field452[var9] == 6) {
					var17 = field166 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field452[var9] == 7) {
					var17 = field166 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field452[var9] == 8) {
					var17 = field166 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field452[var9] == 9) {
					int var18 = 150 - field454[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field452[var9] == 10) {
					int var19 = 150 - field454[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field452[var9] == 11) {
					int var20 = 150 - field454[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field453[var9] == 0) {
					field235.method4(0, field269 + 1, var16, field268);
					field235.method4(var17, field269, var16, field268);
				}

				if (field453[var9] == 1) {
					field235.method9(var16, field268, field269 + 1, field166, 0);
					field235.method9(var16, field268, field269, field166, var17);
				}

				if (field453[var9] == 2) {
					field235.method10(field166, 0, field269 + 1, field268, var16);
					field235.method10(field166, var17, field269, field268, var16);
				}

				if (field453[var9] == 3) {
					field235.method11(var16, 150 - field454[var9], field166, field268, field269 + 1, 0);
					field235.method11(var16, 150 - field454[var9], field166, field268, field269, var17);
				}

				if (field453[var9] == 4) {
					int var21 = field235.method7(var16);
					int var22 = (150 - field454[var9]) * (var21 + 100) / 150;
					TYMHEFTS.method525(field268 - 50, 0, 334, field268 + 50);
					field235.method8(field268 + 50 - var22, var16, field269 + 1, 0);
					field235.method8(field268 + 50 - var22, var16, field269, var17);
					TYMHEFTS.method524();
				}

				if (field453[var9] == 5) {
					int var23 = 150 - field454[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					TYMHEFTS.method525(0, field269 - field235.field23 - 1, field269 + 5, 512);
					field235.method4(0, field269 + var24 + 1, var16, field268);
					field235.method4(var17, field269 + var24, var16, field268);
					TYMHEFTS.method524();
				}
			} else {
				field235.method4(0, field269 + 1, var16, field268);
				field235.method4(0xFFFF00, field269, var16, field268);
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method254(boolean arg0) {
		method195();
		field95.method321();
		field153.method350(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field414 == 0) {
			int var4 = var3 / 2 + 80;
			field233.method5(true, field417.field1346, var4, 0x75A9A9, var2 / 2);
			int var5 = var3 / 2 - 20;
			field235.method5(true, "Welcome to RuneScape", var5, 0xFFFF00, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field154.method350(var7 - 20, var6 - 73);
			field235.method5(true, "New User", var7 + 5, 0xFFFFFF, var6);
			int var8 = var2 / 2 + 80;
			field154.method350(var7 - 20, var8 - 73);
			field235.method5(true, "Existing User", var7 + 5, 0xFFFFFF, var8);
		}

		if (field414 == 2) {
			int var9 = var3 / 2 - 40;
			if (field112.length() > 0) {
				field235.method5(true, field112, var9 - 15, 0xFFFF00, var2 / 2);
				field235.method5(true, field113, var9, 0xFFFF00, var2 / 2);
				var9 += 30;
			} else {
				field235.method5(true, field113, var9 - 7, 0xFFFF00, var2 / 2);
				var9 += 30;
			}

			field235.method12(var2 / 2 - 90, true, var9, "Username: " + field309 + (field299 == 0 & field322 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;
			field235.method12(var2 / 2 - 88, true, var9, "Password: " + SFBUQEXP.method510(field310) + (field299 == 1 & field322 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field154.method350(var11 - 20, var10 - 73);
				field235.method5(true, "Login", var11 + 5, 0xFFFFFF, var10);
				int var12 = var2 / 2 + 80;
				field154.method350(var11 - 20, var12 - 73);
				field235.method5(true, "Cancel", var11 + 5, 0xFFFFFF, var12);
			}
		}

		if (field414 == 3) {
			field235.method5(true, "Create a free account", var3 / 2 - 60, 0xFFFF00, var2 / 2);
			int var13 = var3 / 2 - 35;
			field235.method5(true, "To create a new account you need to", var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field235.method5(true, "go back to the main RuneScape webpage", var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field235.method5(true, "and choose the 'create account'", var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field235.method5(true, "button near the top of that page.", var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field154.method350(var15 - 20, var14 - 73);
			field235.method5(true, "Cancel", var15 + 5, 0xFFFFFF, var14);
		}

		field95.method322(171, field956, 202);

		if (field83) {
			field83 = false;
			field93.method322(0, field956, 128);
			field94.method322(371, field956, 202);
			field98.method322(265, field956, 0);
			field99.method322(265, field956, 562);
			field100.method322(171, field956, 128);
			field101.method322(171, field956, 562);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method255() {
		if (!field431 && !field432 && !field129) {
			field322++;

			if (field256) {
				method265();
			} else {
				method259();
			}

			method236();
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public final void method256(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field394[var4] != null) {
				int var5 = field392[var4];
				int var6 = field78 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field393[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field492 == 0 || field492 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field372.field786)) {
						if (field230 >= 1) {
							field76[field369] = "Report abuse @whi@" + var7;
							field141[field369] = 160;
							field369++;
						}

						field76[field369] = "Add ignore @whi@" + var7;
						field141[field369] = 352;
						field369++;
						field76[field369] = "Add friend @whi@" + var7;
						field141[field369] = 702;
						field369++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field337 == 0 && (var5 == 7 || field184 == 0 || field184 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field230 >= 1) {
							field76[field369] = "Report abuse @whi@" + var7;
							field141[field369] = 160;
							field369++;
						}

						field76[field369] = "Add ignore @whi@" + var7;
						field141[field369] = 352;
						field369++;
						field76[field369] = "Add friend @whi@" + var7;
						field141[field369] = 702;
						field369++;
					}

					var3++;
				}

				if (var5 == 4 && (field179 == 0 || field179 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field76[field369] = "Accept trade @whi@" + var7;
						field141[field369] = 172;
						field369++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field337 == 0 && field184 < 2) {
					var3++;
				}

				if (var5 == 8 && (field179 == 0 || field179 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field76[field369] = "Accept challenge @whi@" + var7;
						field141[field369] = 716;
						field369++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method257() {
		if (field248 == 2) {
			for (WGFLNQLA var1 = (WGFLNQLA) field291.method300(); var1 != null; var1 = (WGFLNQLA) field291.method302()) {
				if (var1.field1387 > 0) {
					var1.field1387--;
				}

				if (var1.field1387 != 0) {
					if (var1.field1376 > 0) {
						var1.field1376--;
					}

					if (var1.field1376 == 0 && var1.field1385 >= 1 && var1.field1386 >= 1 && var1.field1385 <= 102 && var1.field1386 <= 102 && (var1.field1380 < 0 || WZFUDUYZ.method581(var1.field1380, var1.field1382))) {
						method205(var1.field1380, var1.field1384, var1.field1381, var1.field1385, var1.field1382, var1.field1383, var1.field1386);
						var1.field1376 = -1;

						if (var1.field1380 == var1.field1377 && var1.field1377 == -1) {
							var1.method518();
						} else if (var1.field1380 == var1.field1377 && var1.field1381 == var1.field1378 && var1.field1382 == var1.field1379) {
							var1.method518();
						}
					}
				} else if (var1.field1377 < 0 || WZFUDUYZ.method581(var1.field1377, var1.field1379)) {
					method205(var1.field1377, var1.field1384, var1.field1378, var1.field1385, var1.field1379, var1.field1383, var1.field1386);
					var1.method518();
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILBSNPYLEV;I)V")
	public final void method258(BSNPYLEV arg0, int arg1) {
		for (int var3 = 0; var3 < field279; var3++) {
			int var4 = field280[var3];
			KZCOXKKW var5 = field276[var4];
			int var6 = arg0.method47();
			if ((var6 & 0x2) != 0) {
				var6 += arg0.method47() << 8;
			}

			method149(var5, var6, var4, arg0);
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method259() {
		if (field414 == 0) {
			int var1 = field954 / 2 - 80;
			int var2 = field955 / 2 + 20;
			var2 += 20;
			if (field970 == 1 && field971 >= var1 - 75 && field971 <= var1 + 75 && field972 >= var2 - 20 && field972 <= var2 + 20) {
				field414 = 3;
				field299 = 0;
			}

			int var3 = field954 / 2 + 80;
			if (field970 == 1 && field971 >= var3 - 75 && field971 <= var3 + 75 && field972 >= var2 - 20 && field972 <= var2 + 20) {
				field112 = "";
				field113 = "Enter your username & password.";
				field414 = 2;
				field299 = 0;
			}
		} else if (field414 == 2) {
			int var4 = field955 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field970 == 1 && field972 >= var4 - 15 && field972 < var4) {
				field299 = 0;
			}

			var4 += 15;
			if (field970 == 1 && field972 >= var4 - 15 && field972 < var4) {
				field299 = 1;
			}

			var4 += 15;
			int var5 = field954 / 2 - 80;
			int var6 = field955 / 2 + 50;
			var6 += 20;
			if (field970 == 1 && field971 >= var5 - 75 && field971 <= var5 + 75 && field972 >= var6 - 20 && field972 <= var6 + 20) {
				field145 = 0;
				method268(field309, field310, false);

				if (field256) {
					return;
				}
			}

			int var7 = field954 / 2 + 80;
			if (field970 == 1 && field971 >= var7 - 75 && field971 <= var7 + 75 && field972 >= var6 - 20 && field972 <= var6 + 20) {
				field414 = 0;
				field309 = "";
				field310 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method430();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field379.length(); var10++) {
					if (var8 == field379.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field299 == 0) {
					if (var8 == 8 && field309.length() > 0) {
						field309 = field309.substring(0, field309.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field299 = 1;
					}

					if (var9) {
						field309 = field309 + (char) var8;
					}

					if (field309.length() > 12) {
						field309 = field309.substring(0, 12);
					}
				} else if (field299 == 1) {
					if (var8 == 8 && field310.length() > 0) {
						field310 = field310.substring(0, field310.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field299 = 0;
					}

					if (var9) {
						field310 = field310 + (char) var8;
					}

					if (field310.length() > 20) {
						field310 = field310.substring(0, 20);
					}
				}
			}
		} else if (field414 == 3) {
			int var11 = field954 / 2;
			int var12 = field955 / 2 + 50;
			var12 += 20;
			if (field970 == 1 && field971 >= var11 - 75 && field971 <= var11 + 75 && field972 >= var12 - 20 && field972 <= var12 + 20) {
				field414 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method260() {
		for (WGFLNQLA var1 = (WGFLNQLA) field291.method300(); var1 != null; var1 = (WGFLNQLA) field291.method302()) {
			if (var1.field1387 == -1) {
				var1.field1376 = 0;
				method206(var1);
			} else {
				var1.method518();
			}
		}
	}

	@ObfuscatedName("client.a(BILBSNPYLEV;)V")
	public final void method261(int arg0, BSNPYLEV arg1) {
		arg1.method57();
		int var3 = arg1.method58(8);
		if (var3 < field117) {
			for (int var4 = var3; var4 < field117; var4++) {
				field265[field264++] = field118[var4];
			}
		}

		if (var3 > field117) {
			signlink.reporterror(field309 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field117 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field118[var5];
			TOFRUGLM var7 = field116[var6];
			int var8 = arg1.method58(1);
			if (var8 == 0) {
				field118[field117++] = var6;
				var7.field623 = field322;
			} else {
				int var9 = arg1.method58(2);
				if (var9 == 0) {
					field118[field117++] = var6;
					var7.field623 = field322;
					field280[field279++] = var6;
				} else if (var9 == 1) {
					field118[field117++] = var6;
					var7.field623 = field322;
					int var10 = arg1.method58(3);
					var7.method305(false, var10);
					int var11 = arg1.method58(1);
					if (var11 == 1) {
						field280[field279++] = var6;
					}
				} else if (var9 == 2) {
					field118[field117++] = var6;
					var7.field623 = field322;
					int var12 = arg1.method58(3);
					var7.method305(true, var12);
					int var13 = arg1.method58(3);
					var7.method305(true, var13);
					int var14 = arg1.method58(1);
					if (var14 == 1) {
						field280[field279++] = var6;
					}
				} else if (var9 == 3) {
					field265[field264++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method262() {
		field166++;
		method137(true);
		method207(true);
		method137(false);
		method207(false);
		method237();
		method187();

		if (!field283) {
			int var1 = field103;
			if (field178 / 256 > var1) {
				var1 = field178 / 256;
			}

			if (field292[4] && field307[4] + 128 > var1) {
				var1 = field307[4] + 128;
			}

			int var2 = field240 + field104 & 0x7FF;
			method211(var1, field312, method159(field372.field594, field156, field372.field593) - 50, var1 * 3 + 600, var2, field313);
		}

		int var3;
		if (field283) {
			var3 = method227();
		} else {
			var3 = method226();
		}

		int var4 = field220;
		int var5 = field221;
		int var6 = field222;
		int var7 = field223;
		int var8 = field224;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field292[var9]) {
				int var10 = (int) (Math.random() * (field137[var9] * 2 + 1) + Math.sin(field365[var9] / 100.0D * field151[var9]) * field307[var9] - field137[var9]);
				if (var9 == 0) {
					field220 += var10;
				}

				if (var9 == 1) {
					field221 += var10;
				}

				if (var9 == 2) {
					field222 += var10;
				}

				if (var9 == 3) {
					field224 = field224 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field223 += var10;
					if (field223 < 128) {
						field223 = 128;
					}

					if (field223 > 383) {
						field223 = 383;
					}
				}
			}
		}

		int var11 = IWBEAICJ.field750;
		RMLAXPMV.field1196 = true;
		RMLAXPMV.field1199 = 0;
		RMLAXPMV.field1197 = field964 - 4;
		RMLAXPMV.field1198 = field965 - 4;
		TYMHEFTS.method526();
		field133.method414(field222, field223, var3, field220, field221, field224);
		field133.method389();
		method253();
		method222();
		method220(var11);
		method178();
		field458.method322(4, field956, 4);
		field220 = var4;
		field221 = var5;
		field222 = var6;
		field223 = var7;
		field224 = var8;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method263() {
		for (int var1 = -1; var1 < field277; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field275;
			} else {
				var2 = field278[var1];
			}

			KZCOXKKW var3 = field276[var2];
			if (var3 != null && var3.field596 > 0) {
				var3.field596--;
				if (var3.field596 == 0) {
					var3.field622 = null;
				}
			}
		}

		field351++;
		if (field351 > 189) {
			field351 = 0;
			field77.method36(191);
			field77.method37(247);
		}

		for (int var4 = 0; var4 < field117; var4++) {
			int var5 = field118[var4];
			TOFRUGLM var6 = field116[var5];
			if (var6 != null && var6.field596 > 0) {
				var6.field596--;
				if (var6.field596 == 0) {
					var6.field622 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILKYEPSAQL;)V")
	public final void method264(KYEPSAQL arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field214.length; var3++) {
			field214[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field214[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field215[var9] = (field214[var9 - 1] + field214[var9 + 1] + field214[var9 - 128] + field214[var9 + 128]) / 4;
				}
			}

			int[] var10 = field214;
			field214 = field215;
			field215 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field778; var12++) {
				for (int var13 = 0; var13 < arg0.field777; var13++) {
					if (arg0.field775[var11++] != 0) {
						int var14 = var13 + arg0.field779 + 16;
						int var15 = var12 + arg0.field780 + 16;
						int var16 = (var15 << 7) + var14;
						field214[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method265() {
		if (field494 > 1) {
			field494--;
		}

		if (field328 > 0) {
			field328--;
		}

		for (int var1 = 0; var1 < 5 && method213(); var1++) {
		}

		if (field256) {
			synchronized (field480.field723) {
				if (!field358) {
					field480.field718 = 0;
				} else if (field970 != 0 || field480.field718 >= 40) {
					field77.method36(148);
					field77.method37(0);
					int var3 = field77.field55;
					int var4 = 0;
					for (int var5 = 0; var5 < field480.field718 && var3 - field77.field55 < 240; var5++) {
						var4++;
						int var6 = field480.field720[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field480.field722[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field480.field720[var5] == -1 && field480.field722[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field466 != var7 || field467 != var6) {
							int var9 = var7 - field466;
							field466 = var7;
							int var10 = var6 - field467;
							field467 = var6;

							if (field227 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field77.method38((field227 << 12) + (var9 << 6) + var10);
								field227 = 0;
							} else if (field227 < 8) {
								field77.method40((field227 << 19) + var8 + 0x800000);
								field227 = 0;
							} else {
								field77.method41((field227 << 19) + var8 - 0x40000000);
								field227 = 0;
							}
						} else if (field227 < 2047) {
							field227++;
						}
					}

					field77.method46(field77.field55 - var3);

					if (var4 >= field480.field718) {
						field480.field718 = 0;
					} else {
						field480.field718 -= var4;
						for (int var11 = 0; var11 < field480.field718; var11++) {
							field480.field722[var11] = field480.field722[var4 + var11];
							field480.field720[var11] = field480.field720[var4 + var11];
						}
					}
				}
			}

			if (field970 != 0) {
				long var12 = (field973 - field366) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field366 = field973;
				int var14 = field972;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field971;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field970 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field77.method36(31);
				field77.method79((var17 << 19) + (var18 << 20) + var16);
			}

			if (field314 > 0) {
				field314--;
			}

			if (field974[1] == 1 || field974[2] == 1 || field974[3] == 1 || field974[4] == 1) {
				field315 = true;
			}

			if (field315 && field314 <= 0) {
				field314 = 20;
				field315 = false;
				field77.method36(67);
				field77.method70(field103);
				field77.method72(field104);
			}

			if (field961 && !field250) {
				field250 = true;
				field77.method36(118);
				field77.method37(1);
			}

			if (!field961 && field250) {
				field250 = false;
				field77.method36(118);
				field77.method37(0);
			}

			method218();
			method257();
			method138();
			field326++;
			if (field326 > 750) {
				method201();
			}

			method202();
			method244();
			method263();
			field163++;

			if (field348 != 0) {
				field347 += 20;
				if (field347 >= 400) {
					field348 = 0;
				}
			}

			if (field111 != 0) {
				field108++;
				if (field108 >= 15) {
					if (field111 == 2) {
						field136 = true;
					}

					if (field111 == 3) {
						field205 = true;
					}

					field111 = 0;
				}
			}

			if (field260 != 0) {
				field147++;

				if (field964 > field261 + 5 || field964 < field261 - 5 || field965 > field262 + 5 || field965 < field262 - 5) {
					field479 = true;
				}

				if (field963 == 0) {
					if (field260 == 2) {
						field136 = true;
					}

					if (field260 == 3) {
						field205 = true;
					}

					field260 = 0;

					if (field479 && field147 >= 5) {
						field321 = -1;
						method171();

						if (field321 == field258 && field320 != field259) {
							QHGHUTGN var19 = QHGHUTGN.method445(field258);
							byte var20 = 0;
							if (field468 == 1 && var19.field1016 == 206) {
								var20 = 1;
							}

							if (var19.field1001[field320] <= 0) {
								var20 = 0;
							}

							if (var19.field1023) {
								int var21 = field259;
								int var22 = field320;
								var19.field1001[var22] = var19.field1001[var21];
								var19.field1051[var22] = var19.field1051[var21];
								var19.field1001[var21] = -1;
								var19.field1051[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field259;
								int var24 = field320;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method440(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method440(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method440(field259, field320);
							}

							field77.method36(99);
							field77.method70(field259);
							field77.method38(field320);
							field77.method64(var20);
							field77.method71(field258);
						}
					} else if ((field119 == 1 || method170(field369 - 1)) && field369 > 2) {
						method141();
					} else if (field369 > 0) {
						method209(field369 - 1);
					}

					field108 = 10;
					field970 = 0;
				}
			}

			if (PAJXYXWG.field896 != -1) {
				int var25 = PAJXYXWG.field896;
				int var26 = PAJXYXWG.field897;
				boolean var27 = method200(0, 0, 0, var25, field372.field591[0], 0, 0, field372.field590[0], true, 0, var26);
				PAJXYXWG.field896 = -1;

				if (var27) {
					field345 = field971;
					field346 = field972;
					field348 = 1;
					field347 = 0;
				}
			}

			if (field970 == 1 && field183 != null) {
				field183 = null;
				field205 = true;
				field970 = 0;
			}

			method230();

			if (field375 == -1) {
				method216();
				method217();
				method192();
			}

			if (field963 == 1 || field970 == 1) {
				field272++;
			}

			if (field423 == 0 && field353 == 0 && field493 == 0) {
				if (field192 > 0) {
					field192--;
				}
			} else if (field192 < 100) {
				field192++;
				if (field192 == 100) {
					if (field423 != 0) {
						field205 = true;
					}

					if (field353 != 0) {
						field136 = true;
					}
				}
			}

			if (field248 == 2) {
				method266();
			}

			if (field248 == 2 && field283) {
				method136();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field151[var28]++;
			}

			method145();
			field962++;
			if (field962 > 4500) {
				field328 = 250;
				field962 -= 500;
				field77.method36(219);
			}

			field429++;
			if (field429 > 500) {
				field429 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field434 += field435;
				}

				if ((var29 & 0x2) == 2) {
					field130 += field131;
				}

				if ((var29 & 0x4) == 4) {
					field240 += field241;
				}
			}

			if (field434 < -50) {
				field435 = 2;
			}

			if (field434 > 50) {
				field435 = -2;
			}

			if (field130 < -55) {
				field131 = 2;
			}

			if (field130 > 55) {
				field131 = -2;
			}

			if (field240 < -40) {
				field241 = 1;
			}

			if (field240 > 40) {
				field241 = -1;
			}

			field82++;
			if (field82 > 500) {
				field82 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field396 += field397;
				}

				if ((var30 & 0x2) == 2) {
					field245 += field246;
				}
			}

			if (field396 < -60) {
				field397 = 2;
			}

			if (field396 > 60) {
				field397 = -2;
			}

			if (field245 < -20) {
				field246 = 1;
			}

			if (field245 > 10) {
				field246 = -1;
			}

			field327++;
			if (field327 > 50) {
				field77.method36(11);
			}

			try {
				if (field339 != null && field77.field55 > 0) {
					field339.method372(0, field77.field54, field77.field55);
					field77.field55 = 0;
					field327 = 0;
				}
			} catch (IOException var32) {
				method201();
			} catch (Exception var33) {
				method167();
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method266() {
		try {
			int var1 = field372.field593 + field434;
			int var2 = field372.field594 + field130;
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

			if (field974[1] == 1) {
				field105 += (-field105 - 24) / 2;
			} else if (field974[2] == 1) {
				field105 += (24 - field105) / 2;
			} else {
				field105 /= 2;
			}

			if (field974[3] == 1) {
				field106 += (12 - field106) / 2;
			} else if (field974[4] == 1) {
				field106 += (-field106 - 12) / 2;
			} else {
				field106 /= 2;
			}

			field104 = field105 / 2 + field104 & 0x7FF;
			field103 += field106 / 2;
			if (field103 < 128) {
				field103 = 128;
			}

			if (field103 > 383) {
				field103 = 383;
			}

			int var3 = field312 >> 7;
			int var4 = field313 >> 7;
			int var5 = method159(field313, field156, field312);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field156;
						if (var9 < 3 && (field460[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field511[var9][var7][var8];
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

			if (var11 > field178) {
				field178 += (var11 - field178) / 24;
			} else if (var11 < field178) {
				field178 += (var11 - field178) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field372.field593 + "," + field372.field594 + "," + field312 + "," + field313 + "," + field370 + "," + field371 + "," + field285 + "," + field286);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZLjava/lang/String;I)V")
	public final void method267(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field247 != -1) {
			field183 = arg1;
			field970 = 0;
		}

		if (field128 == -1) {
			field205 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field392[var4] = field392[var4 - 1];
			field393[var4] = field393[var4 - 1];
			field394[var4] = field394[var4 - 1];
		}

		field392[0] = arg2;
		field393[0] = arg0;
		field394[0] = arg1;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method268(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field112 = "";
				field113 = "Connecting to server...";
				method254(true);
			}

			field339 = new NTPVSATL(this, method176(field514 + 43594));
			long var4 = SFBUQEXP.method505(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field77.field55 = 0;
			field77.method37(14);
			field77.method37(var6);
			field339.method372(0, field77.field54, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field339.method369();
			}

			int var8 = field339.method369();
			int var9 = var8;

			if (var8 == 0) {
				field339.method371(field390.field54, 0, 8);
				field390.field55 = 0;
				field465 = field390.method53();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field465 >> 32), (int) field465 };
				field77.field55 = 0;
				field77.method37(10);
				field77.method41(var10[0]);
				field77.method41(var10[1]);
				field77.method41(var10[2]);
				field77.method41(var10[3]);
				field77.method41(signlink.uid);
				field77.method44(arg0);
				field77.method44(arg1);
				field77.method62(field405, field340);
				field120.field55 = 0;

				if (arg2) {
					field120.method37(18);
				} else {
					field120.method37(16);
				}

				field120.method37(field77.field55 + 36 + 1 + 1 + 2);
				field120.method37(255);
				field120.method38(375);
				field120.method37(field516 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field120.method41(field270[var11]);
				}

				field120.method45(0, field77.field55, field77.field54);
				field77.field59 = new XXMIBCTG(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field243 = new XXMIBCTG(var10);
				field339.method372(0, field120.field54, field120.field55);
				var8 = field339.method369();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method268(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field230 = field339.method369();
				field358 = field339.method369() == 1;
				field366 = 0L;
				field227 = 0;
				field480.field718 = 0;
				field961 = true;
				field250 = true;
				field256 = true;
				field77.field55 = 0;
				field390.field55 = 0;
				field325 = -1;
				field436 = -1;
				field437 = -1;
				field438 = -1;
				field324 = 0;
				field326 = 0;
				field494 = 0;
				field328 = 0;
				field421 = 0;
				field369 = 0;
				field376 = false;
				field962 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field394[var13] = null;
				}

				field294 = 0;
				field361 = 0;
				field248 = 0;
				field263 = 0;
				field434 = (int) (Math.random() * 100.0D) - 50;
				field130 = (int) (Math.random() * 110.0D) - 55;
				field240 = (int) (Math.random() * 80.0D) - 40;
				field396 = (int) (Math.random() * 120.0D) - 60;
				field245 = (int) (Math.random() * 30.0D) - 20;
				field104 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field374 = 0;
				field323 = -1;
				field253 = 0;
				field254 = 0;
				field277 = 0;
				field117 = 0;

				for (int var14 = 0; var14 < field274; var14++) {
					field276[var14] = null;
					field281[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field116[var15] = null;
				}

				field372 = field276[field275] = new KZCOXKKW();
				field505.method304();
				field165.method304();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field85[var16][var17][var18] = null;
						}
					}
				}

				field291 = new FEIPMYNH();
				field389 = 0;
				field388 = 0;
				method152(field247);
				field247 = -1;
				method152(field128);
				field128 = -1;
				method152(field191);
				field191 = -1;
				method152(field375);
				field375 = -1;
				method152(field367);
				field367 = -1;
				method152(field334);
				field334 = -1;
				method152(field126);
				field126 = -1;
				field90 = false;
				field488 = 3;
				field218 = 0;
				field376 = false;
				field162 = false;
				field183 = null;
				field311 = 0;
				field471 = -1;
				field302 = true;
				method223();

				for (int var19 = 0; var19 < 5; var19++) {
					field490[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field225[var20] = null;
					field226[var20] = false;
				}

				field491 = 0;
				field350 = 0;
				field355 = 0;
				field167 = 0;
				field107 = 0;
				field360 = 0;
				field150 = 0;
				field409 = 0;
				field271 = 0;
				method127();
			} else if (var8 == 3) {
				field112 = "";
				field113 = "Invalid username or password.";
			} else if (var8 == 4) {
				field112 = "Your account has been disabled.";
				field113 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field112 = "Your account is already logged in.";
				field113 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field112 = "RuneScape has been updated!";
				field113 = "Please reload this page.";
			} else if (var8 == 7) {
				field112 = "This world is full.";
				field113 = "Please use a different world.";
			} else if (var8 == 8) {
				field112 = "Unable to connect.";
				field113 = "Login server offline.";
			} else if (var8 == 9) {
				field112 = "Login limit exceeded.";
				field113 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field112 = "Unable to connect.";
				field113 = "Bad session id.";
			} else if (var8 == 12) {
				field112 = "You need a members account to login to this world.";
				field113 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field112 = "Could not complete login.";
				field113 = "Please try using a different world.";
			} else if (var8 == 14) {
				field112 = "The server is being updated.";
				field113 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field256 = true;
				field77.field55 = 0;
				field390.field55 = 0;
				field325 = -1;
				field436 = -1;
				field437 = -1;
				field438 = -1;
				field324 = 0;
				field326 = 0;
				field494 = 0;
				field369 = 0;
				field376 = false;
				field510 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field112 = "Login attempts exceeded.";
				field113 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field112 = "You are standing in a members-only area.";
				field113 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field112 = "Invalid loginserver requested";
				field113 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field339.method369();
				for (var21 += 3; var21 >= 0; var21--) {
					field112 = "You have only just left another world";
					field113 = "Your profile will be transferred in: " + var21;
					method254(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method268(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field112 = "Malformed login packet.";
				field113 = "Please try again.";
			} else if (var8 == 23) {
				field112 = "No reply from loginserver.";
				field113 = "Please try again.";
			} else if (var8 == 24) {
				field112 = "Error loading your profile.";
				field113 = "Please contact customer support.";
			} else if (var8 == 25) {
				field112 = "Unexpected loginserver response.";
				field113 = "Please try using a different world.";
			} else if (var8 == 26) {
				field112 = "This computers address has been blocked";
				field113 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field112 = "Unexpected server response";
				field113 = "Please try using a different world.";
			} else if (var9 != 0) {
				field112 = "No response from server";
				field113 = "Please try using a different world.";
			} else if (field145 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field145++;
				method268(arg0, arg1, arg2);
			} else {
				field112 = "No response from loginserver";
				field113 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field112 = "";
			field113 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.b(Z[BI)V")
	public final void method269(boolean arg0, byte[] arg1) {
		if (field216) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		WGFLNQLA var10 = null;
		for (WGFLNQLA var11 = (WGFLNQLA) field291.method300(); var11 != null; var11 = (WGFLNQLA) field291.method302()) {
			if (var11.field1383 == arg3 && var11.field1385 == arg7 && var11.field1386 == arg4 && var11.field1384 == arg1) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new WGFLNQLA();
			var10.field1383 = arg3;
			var10.field1384 = arg1;
			var10.field1385 = arg7;
			var10.field1386 = arg4;
			method206(var10);
			field291.method297(var10);
		}

		var10.field1380 = arg2;
		var10.field1382 = arg8;
		var10.field1381 = arg0;
		var10.field1376 = arg5;
		var10.field1387 = arg6;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field238[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field385[var3] = var2 / 4;
		}
	}
}
