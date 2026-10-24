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
public final class client extends EBSHSFRY {

	@ObfuscatedName("client.N")
	public int field54 = 128;

	@ObfuscatedName("client.S")
	public String field59 = "";

	@ObfuscatedName("client.U")
	public String[] field61 = new String[100];

	@ObfuscatedName("client.V")
	public int[] field62 = new int[100];

	@ObfuscatedName("client.X")
	public boolean field64 = false;

	@ObfuscatedName("client.bb")
	public int field68 = 0x4D4233;

	@ObfuscatedName("client.db")
	public boolean field70 = false;

	@ObfuscatedName("client.eb")
	public PACANLMY field71 = new PACANLMY();

	@ObfuscatedName("client.ib")
	public int[] field74 = new int[UDCXKHIL.field1257];

	@ObfuscatedName("client.tb")
	public VZJVQLEE[] field84 = new VZJVQLEE[32];

	@ObfuscatedName("client.ub")
	public byte[] field85 = new byte[16384];

	@ObfuscatedName("client.vb")
	public LBBVYYXO field86 = LBBVYYXO.method357(1);

	@ObfuscatedName("client.wb")
	public String field87 = "";

	@ObfuscatedName("client.xb")
	public String field88 = "";

	@ObfuscatedName("client.Fb")
	public PQPZKUPU field94 = new PQPZKUPU();

	@ObfuscatedName("client.Hb")
	public int field96 = 50;

	@ObfuscatedName("client.Ib")
	public int[] field97 = new int[field96];

	@ObfuscatedName("client.Jb")
	public int[] field98 = new int[field96];

	@ObfuscatedName("client.Kb")
	public int[] field99 = new int[field96];

	@ObfuscatedName("client.Lb")
	public int[] field100 = new int[field96];

	@ObfuscatedName("client.Mb")
	public int[] field101 = new int[field96];

	@ObfuscatedName("client.Nb")
	public int[] field102 = new int[field96];

	@ObfuscatedName("client.Ob")
	public int[] field103 = new int[field96];

	@ObfuscatedName("client.Pb")
	public String[] field104 = new String[field96];

	@ObfuscatedName("client.Rb")
	public int field106 = 2;

	@ObfuscatedName("client.ac")
	public int[][] field113 = new int[104][104];

	@ObfuscatedName("client.cc")
	public int[] field115 = new int[151];

	@ObfuscatedName("client.fc")
	public int field118 = -1;

	@ObfuscatedName("client.oc")
	public boolean field125 = false;

	@ObfuscatedName("client.pc")
	public int field126 = -1;

	@ObfuscatedName("client.qc")
	public int field127 = -1;

	@ObfuscatedName("client.sc")
	public boolean field128 = false;

	@ObfuscatedName("client.zc")
	public boolean field132 = false;

	@ObfuscatedName("client.Ac")
	public boolean field133 = true;

	@ObfuscatedName("client.Dc")
	public int[] field136 = new int[33];

	@ObfuscatedName("client.Fc")
	public int[] field137 = new int[200];

	@ObfuscatedName("client.Gc")
	public VZJVQLEE[] field138 = new VZJVQLEE[100];

	@ObfuscatedName("client.Ic")
	public int field140 = -1;

	@ObfuscatedName("client.Kc")
	public final int field142 = 100;

	@ObfuscatedName("client.Lc")
	public int[] field143 = new int[100];

	@ObfuscatedName("client.Sc")
	public boolean field149 = false;

	@ObfuscatedName("client.Xc")
	public boolean field154 = false;

	@ObfuscatedName("client.dd")
	public int[] field158 = new int[UDCXKHIL.field1257];

	@ObfuscatedName("client.fd")
	public int field160 = -1;

	@ObfuscatedName("client.gd")
	public int field161 = -1;

	@ObfuscatedName("client.td")
	public int[] field174 = new int[5];

	@ObfuscatedName("client.wd")
	public boolean field176 = false;

	@ObfuscatedName("client.xd")
	public int[][] field177 = new int[104][104];

	@ObfuscatedName("client.Ed")
	public int field184 = 2048;

	@ObfuscatedName("client.Fd")
	public int field185 = 2047;

	@ObfuscatedName("client.Gd")
	public SOKVSBIO[] field186 = new SOKVSBIO[field184];

	@ObfuscatedName("client.Id")
	public int[] field188 = new int[field184];

	@ObfuscatedName("client.Kd")
	public int[] field190 = new int[field184];

	@ObfuscatedName("client.Ld")
	public LBBVYYXO[] field191 = new LBBVYYXO[field184];

	@ObfuscatedName("client.Sd")
	public int field198 = 0x23201B;

	@ObfuscatedName("client.ee")
	public String field208 = "";

	@ObfuscatedName("client.ie")
	public PACANLMY[][][] field212 = new PACANLMY[4][104][104];

	@ObfuscatedName("client.me")
	public String[] field215 = new String[200];

	@ObfuscatedName("client.ne")
	public VZJVQLEE[] field216 = new VZJVQLEE[32];

	@ObfuscatedName("client.ze")
	public volatile boolean field228 = false;

	@ObfuscatedName("client.Ae")
	public int field229 = 3;

	@ObfuscatedName("client.Be")
	public int[] field230 = new int[500];

	@ObfuscatedName("client.Ce")
	public int[] field231 = new int[500];

	@ObfuscatedName("client.De")
	public int[] field232 = new int[500];

	@ObfuscatedName("client.Ee")
	public int[] field233 = new int[500];

	@ObfuscatedName("client.Ge")
	public int field235 = 1;

	@ObfuscatedName("client.He")
	public int field236 = -1;

	@ObfuscatedName("client.Re")
	public int field246 = 2;

	@ObfuscatedName("client.ef")
	public int[] field257 = new int[5];

	@ObfuscatedName("client.kf")
	public int field262 = -1;

	@ObfuscatedName("client.nf")
	public boolean field264 = false;

	@ObfuscatedName("client.tf")
	public boolean field269 = false;

	@ObfuscatedName("client.yf")
	public int field274 = -1;

	@ObfuscatedName("client.Af")
	public String field275 = "";

	@ObfuscatedName("client.Cf")
	public volatile boolean field277 = false;

	@ObfuscatedName("client.Df")
	public boolean field278 = false;

	@ObfuscatedName("client.Ef")
	public String field279 = "";

	@ObfuscatedName("client.Ff")
	public VZJVQLEE[] field280 = new VZJVQLEE[8];

	@ObfuscatedName("client.Hf")
	public int field282 = -1;

	@ObfuscatedName("client.Jf")
	public int[] field284 = new int[50];

	@ObfuscatedName("client.Lf")
	public CRC32 field286 = new CRC32();

	@ObfuscatedName("client.Of")
	public boolean field289 = false;

	@ObfuscatedName("client.Pf")
	public PACANLMY field290 = new PACANLMY();

	@ObfuscatedName("client.Rf")
	public final int[] field292 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Uf")
	public int[] field293 = new int[UDCXKHIL.field1257];

	@ObfuscatedName("client.Vf")
	public int[] field294 = new int[4000];

	@ObfuscatedName("client.Wf")
	public int[] field295 = new int[4000];

	@ObfuscatedName("client.Yf")
	public int[] field297 = new int[5];

	@ObfuscatedName("client.cg")
	public boolean field301 = false;

	@ObfuscatedName("client.eg")
	public int field302 = 0x332D25;

	@ObfuscatedName("client.gg")
	public boolean field304 = false;

	@ObfuscatedName("client.hg")
	public MACXPWDL[] field305 = new MACXPWDL[5];

	@ObfuscatedName("client.jg")
	public LBBVYYXO field307 = new LBBVYYXO(new byte[5000]);

	@ObfuscatedName("client.kg")
	public SBPCMLRM[] field308 = new SBPCMLRM[16384];

	@ObfuscatedName("client.mg")
	public int[] field310 = new int[16384];

	@ObfuscatedName("client.og")
	public int[] field311 = new int[100];

	@ObfuscatedName("client.pg")
	public String[] field312 = new String[100];

	@ObfuscatedName("client.qg")
	public String[] field313 = new String[100];

	@ObfuscatedName("client.rg")
	public int field314 = -1;

	@ObfuscatedName("client.tg")
	public int[] field315 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.ug")
	public int[] field316 = new int[2000];

	@ObfuscatedName("client.xg")
	public int[] field317 = new int[2000];

	@ObfuscatedName("client.yg")
	public ZQSBFHWZ[] field318 = new ZQSBFHWZ[2];

	@ObfuscatedName("client.Bg")
	public VZJVQLEE[] field320 = new VZJVQLEE[32];

	@ObfuscatedName("client.Eg")
	public int field322 = 78;

	@ObfuscatedName("client.Hg")
	public PACANLMY field325 = new PACANLMY();

	@ObfuscatedName("client.Kg")
	public boolean field328 = false;

	@ObfuscatedName("client.Mg")
	public int field330 = -1;

	@ObfuscatedName("client.Og")
	public long[] field331 = new long[100];

	@ObfuscatedName("client.Pg")
	public int[] field332 = new int[256];

	@ObfuscatedName("client.Qg")
	public int[][] field333 = new int[104][104];

	@ObfuscatedName("client.Sg")
	public int[] field335 = new int[33];

	@ObfuscatedName("client.Xg")
	public ZQSBFHWZ[] field338 = new ZQSBFHWZ[100];

	@ObfuscatedName("client.Yg")
	public ZQSBFHWZ[] field339 = new ZQSBFHWZ[13];

	@ObfuscatedName("client.hh")
	public String[] field347 = new String[5];

	@ObfuscatedName("client.ih")
	public boolean[] field348 = new boolean[5];

	@ObfuscatedName("client.lh")
	public boolean field350 = true;

	@ObfuscatedName("client.mh")
	public boolean field351 = true;

	@ObfuscatedName("client.oh")
	public int[] field353 = new int[9];

	@ObfuscatedName("client.qh")
	public int[] field355 = new int[50];

	@ObfuscatedName("client.rh")
	public int field356 = -1;

	@ObfuscatedName("client.wh")
	public int[] field360 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.xh")
	public int[] field361 = new int[7];

	@ObfuscatedName("client.zh")
	public String field363 = "";

	@ObfuscatedName("client.Ch")
	public boolean field366 = false;

	@ObfuscatedName("client.Gh")
	public boolean[] field370 = new boolean[5];

	@ObfuscatedName("client.Qh")
	public volatile boolean field379 = false;

	@ObfuscatedName("client.di")
	public int[] field389 = new int[50];

	@ObfuscatedName("client.ei")
	public String field390 = "";

	@ObfuscatedName("client.li")
	public int field397 = -1;

	@ObfuscatedName("client.ni")
	public String[] field399 = new String[500];

	@ObfuscatedName("client.qi")
	public String field401 = "";

	@ObfuscatedName("client.ri")
	public String field402 = "";

	@ObfuscatedName("client.ti")
	public boolean field404 = true;

	@ObfuscatedName("client.ui")
	public int field405 = -1;

	@ObfuscatedName("client.xi")
	public long[] field408 = new long[200];

	@ObfuscatedName("client.Ai")
	public int[] field411 = new int[5];

	@ObfuscatedName("client.Bi")
	public LBBVYYXO field412 = LBBVYYXO.method357(1);

	@ObfuscatedName("client.Hi")
	public VZJVQLEE[] field417 = new VZJVQLEE[1000];

	@ObfuscatedName("client.Li")
	public int field420 = 2;

	@ObfuscatedName("client.Ri")
	public int[] field425 = new int[5];

	@ObfuscatedName("client.Ti")
	public int[] field426 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.gj")
	public boolean field438 = false;

	@ObfuscatedName("client.lj")
	public int[][][] field443 = new int[4][13][13];

	@ObfuscatedName("client.nj")
	public int field444 = 0x766654;

	@ObfuscatedName("client.uj")
	public boolean field450 = false;

	@ObfuscatedName("client.vj")
	public boolean field451 = false;

	@ObfuscatedName("client.Ij")
	public CRVZDSLK[] field463 = new CRVZDSLK[4];

	@ObfuscatedName("client.Pj")
	public int[] field470 = new int[151];

	@ObfuscatedName("client.Qj")
	public boolean field471 = false;

	@ObfuscatedName("client.Sj")
	public int field473 = 1;

	@ObfuscatedName("client.Uj")
	public boolean field475 = true;

	@ObfuscatedName("client.Wj")
	public int[] field477 = new int[1000];

	@ObfuscatedName("client.Yj")
	public boolean field479 = false;

	@ObfuscatedName("client.ak")
	public int[] field481 = new int[1000];

	@ObfuscatedName("client.bk")
	public int[] field482 = new int[1000];

	@ObfuscatedName("client.ek")
	public int field484 = -1;

	@ObfuscatedName("client.hk")
	public VZJVQLEE[] field486 = new VZJVQLEE[20];

	@ObfuscatedName("client.ik")
	public LBBVYYXO field487 = LBBVYYXO.method357(1);

	@ObfuscatedName("client.qk")
	public boolean field495 = false;

	@ObfuscatedName("client.Cc")
	public static final int[][] field135 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Od")
	public static int field194 = 10;

	@ObfuscatedName("client.Qd")
	public static boolean field196 = true;

	@ObfuscatedName("client.uf")
	public static BigInteger field270 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.vf")
	public static final int[] field271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.xf")
	public static int[] field273 = new int[99];

	@ObfuscatedName("client.Nj")
	public static BigInteger field468 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Xj")
	public static String field478 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.gk")
	public static int[] field485 = new int[32];

	@ObfuscatedName("client.Qb")
	public int field105;

	@ObfuscatedName("client.Tb")
	public int field107;

	@ObfuscatedName("client.Ub")
	public int field108;

	@ObfuscatedName("client.Xb")
	public int field111;

	@ObfuscatedName("client.Yb")
	public static int field112;

	@ObfuscatedName("client.dc")
	public int field116;

	@ObfuscatedName("client.jc")
	public int field120;

	@ObfuscatedName("client.uc")
	public int field129;

	@ObfuscatedName("client.vc")
	public int field130;

	@ObfuscatedName("client.wc")
	public int field131;

	@ObfuscatedName("client.Jc")
	public int field141;

	@ObfuscatedName("client.Nc")
	public int field144;

	@ObfuscatedName("client.Oc")
	public int field145;

	@ObfuscatedName("client.Pc")
	public int field146;

	@ObfuscatedName("client.Qc")
	public int field147;

	@ObfuscatedName("client.Rc")
	public int field148;

	@ObfuscatedName("client.Tc")
	public int field150;

	@ObfuscatedName("client.Uc")
	public int field151;

	@ObfuscatedName("client.Vc")
	public int field152;

	@ObfuscatedName("client.Wc")
	public int field153;

	@ObfuscatedName("client.Zc")
	public static int field155;

	@ObfuscatedName("client.ad")
	public static int field156;

	@ObfuscatedName("client.ed")
	public int field159;

	@ObfuscatedName("client.hd")
	public int field162;

	@ObfuscatedName("client.id")
	public int field163;

	@ObfuscatedName("client.jd")
	public int field164;

	@ObfuscatedName("client.kd")
	public int field165;

	@ObfuscatedName("client.md")
	public int field167;

	@ObfuscatedName("client.nd")
	public int field168;

	@ObfuscatedName("client.od")
	public int field169;

	@ObfuscatedName("client.qd")
	public int field171;

	@ObfuscatedName("client.rd")
	public static int field172;

	@ObfuscatedName("client.sd")
	public int field173;

	@ObfuscatedName("client.yd")
	public int field178;

	@ObfuscatedName("client.zd")
	public int field179;

	@ObfuscatedName("client.Ad")
	public int field180;

	@ObfuscatedName("client.Bd")
	public int field181;

	@ObfuscatedName("client.Cd")
	public int field182;

	@ObfuscatedName("client.Dd")
	public int field183;

	@ObfuscatedName("client.Hd")
	public int field187;

	@ObfuscatedName("client.Jd")
	public int field189;

	@ObfuscatedName("client.Md")
	public int field192;

	@ObfuscatedName("client.Nd")
	public int field193;

	@ObfuscatedName("client.Pd")
	public static int field195;

	@ObfuscatedName("client.Td")
	public int field199;

	@ObfuscatedName("client.Ud")
	public int field200;

	@ObfuscatedName("client.Vd")
	public int field201;

	@ObfuscatedName("client.Xd")
	public int field203;

	@ObfuscatedName("client.Yd")
	public static int field204;

	@ObfuscatedName("client.Zd")
	public int field205;

	@ObfuscatedName("client.be")
	public int field207;

	@ObfuscatedName("client.ge")
	public int field210;

	@ObfuscatedName("client.he")
	public int field211;

	@ObfuscatedName("client.ke")
	public int field213;

	@ObfuscatedName("client.le")
	public int field214;

	@ObfuscatedName("client.Fe")
	public int field234;

	@ObfuscatedName("client.Ie")
	public static int field237;

	@ObfuscatedName("client.Je")
	public int field238;

	@ObfuscatedName("client.Ke")
	public int field239;

	@ObfuscatedName("client.Le")
	public static int field240;

	@ObfuscatedName("client.Me")
	public int field241;

	@ObfuscatedName("client.Qe")
	public int field245;

	@ObfuscatedName("client.Ve")
	public int field250;

	@ObfuscatedName("client.We")
	public int field251;

	@ObfuscatedName("client.Xe")
	public int field252;

	@ObfuscatedName("client.Ye")
	public int field253;

	@ObfuscatedName("client.Ze")
	public int field254;

	@ObfuscatedName("client.af")
	public int field255;

	@ObfuscatedName("client.bf")
	public int field256;

	@ObfuscatedName("client.ff")
	public int field258;

	@ObfuscatedName("client.gf")
	public int field259;

	@ObfuscatedName("client.hf")
	public int field260;

	@ObfuscatedName("client.jf")
	public int field261;

	@ObfuscatedName("client.mf")
	public int field263;

	@ObfuscatedName("client.qf")
	public static int field267;

	@ObfuscatedName("client.Bf")
	public int field276;

	@ObfuscatedName("client.If")
	public int field283;

	@ObfuscatedName("client.Qf")
	public int field291;

	@ObfuscatedName("client.Xf")
	public int field296;

	@ObfuscatedName("client.Zf")
	public int field298;

	@ObfuscatedName("client.ag")
	public int field299;

	@ObfuscatedName("client.bg")
	public int field300;

	@ObfuscatedName("client.fg")
	public int field303;

	@ObfuscatedName("client.ig")
	public static int field306;

	@ObfuscatedName("client.lg")
	public int field309;

	@ObfuscatedName("client.Ag")
	public int field319;

	@ObfuscatedName("client.Cg")
	public int field321;

	@ObfuscatedName("client.Fg")
	public int field323;

	@ObfuscatedName("client.Gg")
	public int field324;

	@ObfuscatedName("client.Lg")
	public int field329;

	@ObfuscatedName("client.Rg")
	public int field334;

	@ObfuscatedName("client.Vg")
	public int field336;

	@ObfuscatedName("client.Wg")
	public int field337;

	@ObfuscatedName("client.ch")
	public int field342;

	@ObfuscatedName("client.dh")
	public int field343;

	@ObfuscatedName("client.eh")
	public int field344;

	@ObfuscatedName("client.fh")
	public int field345;

	@ObfuscatedName("client.gh")
	public int field346;

	@ObfuscatedName("client.kh")
	public int field349;

	@ObfuscatedName("client.nh")
	public int field352;

	@ObfuscatedName("client.ph")
	public int field354;

	@ObfuscatedName("client.sh")
	public int field357;

	@ObfuscatedName("client.th")
	public int field358;

	@ObfuscatedName("client.vh")
	public int field359;

	@ObfuscatedName("client.yh")
	public int field362;

	@ObfuscatedName("client.Ah")
	public int field364;

	@ObfuscatedName("client.Bh")
	public int field365;

	@ObfuscatedName("client.Nh")
	public int field376;

	@ObfuscatedName("client.Oh")
	public int field377;

	@ObfuscatedName("client.Ph")
	public int field378;

	@ObfuscatedName("client.gi")
	public int field392;

	@ObfuscatedName("client.hi")
	public int field393;

	@ObfuscatedName("client.ii")
	public int field394;

	@ObfuscatedName("client.ji")
	public int field395;

	@ObfuscatedName("client.ki")
	public int field396;

	@ObfuscatedName("client.mi")
	public static int field398;

	@ObfuscatedName("client.si")
	public static int field403;

	@ObfuscatedName("client.vi")
	public int field406;

	@ObfuscatedName("client.wi")
	public int field407;

	@ObfuscatedName("client.yi")
	public static int field409;

	@ObfuscatedName("client.zi")
	public int field410;

	@ObfuscatedName("client.Ji")
	public int field418;

	@ObfuscatedName("client.Ki")
	public int field419;

	@ObfuscatedName("client.Zi")
	public int field432;

	@ObfuscatedName("client.aj")
	public int field433;

	@ObfuscatedName("client.dj")
	public static int field435;

	@ObfuscatedName("client.hj")
	public static int field439;

	@ObfuscatedName("client.kj")
	public int field442;

	@ObfuscatedName("client.pj")
	public int field446;

	@ObfuscatedName("client.wj")
	public int field452;

	@ObfuscatedName("client.yj")
	public static int field454;

	@ObfuscatedName("client.zj")
	public int field455;

	@ObfuscatedName("client.Cj")
	public int field457;

	@ObfuscatedName("client.Dj")
	public int field458;

	@ObfuscatedName("client.Mj")
	public int field467;

	@ObfuscatedName("client.Oj")
	public static int field469;

	@ObfuscatedName("client.Rj")
	public int field472;

	@ObfuscatedName("client.Tj")
	public int field474;

	@ObfuscatedName("client.Vj")
	public int field476;

	@ObfuscatedName("client.Zj")
	public int field480;

	@ObfuscatedName("client.ck")
	public int field483;

	@ObfuscatedName("client.jk")
	public int field488;

	@ObfuscatedName("client.kk")
	public int field489;

	@ObfuscatedName("client.lk")
	public int field490;

	@ObfuscatedName("client.mk")
	public int field491;

	@ObfuscatedName("client.nk")
	public int field492;

	@ObfuscatedName("client.ok")
	public int field493;

	@ObfuscatedName("client.pk")
	public static int field494;

	@ObfuscatedName("client.rk")
	public int field496;

	@ObfuscatedName("client.sk")
	public int field497;

	@ObfuscatedName("client.tk")
	public int field498;

	@ObfuscatedName("client.uk")
	public int field499;

	@ObfuscatedName("client.vk")
	public int field500;

	@ObfuscatedName("client.O")
	public int field55;

	@ObfuscatedName("client.P")
	public int field56;

	@ObfuscatedName("client.Q")
	public int field57;

	@ObfuscatedName("client.R")
	public int field58;

	@ObfuscatedName("client.T")
	public int field60;

	@ObfuscatedName("client.W")
	public int field63;

	@ObfuscatedName("client.Y")
	public static int field65;

	@ObfuscatedName("client.Z")
	public static int field66;

	@ObfuscatedName("client.ab")
	public static int field67;

	@ObfuscatedName("client.cb")
	public int field69;

	@ObfuscatedName("client.fb")
	public int field72;

	@ObfuscatedName("client.gb")
	public int field73;

	@ObfuscatedName("client.jb")
	public int field75;

	@ObfuscatedName("client.kb")
	public int field76;

	@ObfuscatedName("client.mb")
	public int field78;

	@ObfuscatedName("client.nb")
	public int field79;

	@ObfuscatedName("client.ob")
	public int field80;

	@ObfuscatedName("client.pb")
	public int field81;

	@ObfuscatedName("client.rb")
	public int field83;

	@ObfuscatedName("client.Gb")
	public int field95;

	@ObfuscatedName("client.ec")
	public long field117;

	@ObfuscatedName("client.Bc")
	public long field134;

	@ObfuscatedName("client.Gf")
	public long field281;

	@ObfuscatedName("client.ij")
	public long field440;

	@ObfuscatedName("client.xj")
	public long field453;

	@ObfuscatedName("client.lb")
	public EBLTOQBO field77;

	@ObfuscatedName("client.fi")
	public FDKYSOCX field391;

	@ObfuscatedName("client.oj")
	public FUZJMGZB field445;

	@ObfuscatedName("client.Kf")
	public GBBCHPEB field285;

	@ObfuscatedName("client.oe")
	public HURULSIZ field217;

	@ObfuscatedName("client.pe")
	public HURULSIZ field218;

	@ObfuscatedName("client.qe")
	public HURULSIZ field219;

	@ObfuscatedName("client.re")
	public HURULSIZ field220;

	@ObfuscatedName("client.se")
	public HURULSIZ field221;

	@ObfuscatedName("client.te")
	public HURULSIZ field222;

	@ObfuscatedName("client.ue")
	public HURULSIZ field223;

	@ObfuscatedName("client.ve")
	public HURULSIZ field224;

	@ObfuscatedName("client.we")
	public HURULSIZ field225;

	@ObfuscatedName("client.Uh")
	public HURULSIZ field380;

	@ObfuscatedName("client.Vh")
	public HURULSIZ field381;

	@ObfuscatedName("client.Wh")
	public HURULSIZ field382;

	@ObfuscatedName("client.Xh")
	public HURULSIZ field383;

	@ObfuscatedName("client.Yh")
	public HURULSIZ field384;

	@ObfuscatedName("client.Zh")
	public HURULSIZ field385;

	@ObfuscatedName("client.ai")
	public HURULSIZ field386;

	@ObfuscatedName("client.bi")
	public HURULSIZ field387;

	@ObfuscatedName("client.ci")
	public HURULSIZ field388;

	@ObfuscatedName("client.Di")
	public HURULSIZ field413;

	@ObfuscatedName("client.Ei")
	public HURULSIZ field414;

	@ObfuscatedName("client.Fi")
	public HURULSIZ field415;

	@ObfuscatedName("client.Gi")
	public HURULSIZ field416;

	@ObfuscatedName("client.rj")
	public HURULSIZ field447;

	@ObfuscatedName("client.sj")
	public HURULSIZ field448;

	@ObfuscatedName("client.tj")
	public HURULSIZ field449;

	@ObfuscatedName("client.fe")
	public NIUUCTKL field209;

	@ObfuscatedName("client.bd")
	public RHXAQRFP field157;

	@ObfuscatedName("client.bc")
	public static SOKVSBIO field114;

	@ObfuscatedName("client.vd")
	public VZJVQLEE field175;

	@ObfuscatedName("client.Wd")
	public VZJVQLEE field202;

	@ObfuscatedName("client.xe")
	public VZJVQLEE field226;

	@ObfuscatedName("client.ye")
	public VZJVQLEE field227;

	@ObfuscatedName("client.Ne")
	public VZJVQLEE field242;

	@ObfuscatedName("client.Ig")
	public VZJVQLEE field326;

	@ObfuscatedName("client.Jg")
	public VZJVQLEE field327;

	@ObfuscatedName("client.ah")
	public VZJVQLEE field341;

	@ObfuscatedName("client.Hh")
	public VZJVQLEE field371;

	@ObfuscatedName("client.Ih")
	public VZJVQLEE field372;

	@ObfuscatedName("client.Jh")
	public VZJVQLEE field373;

	@ObfuscatedName("client.Kh")
	public VZJVQLEE field374;

	@ObfuscatedName("client.Lh")
	public VZJVQLEE field375;

	@ObfuscatedName("client.ej")
	public VZJVQLEE field436;

	@ObfuscatedName("client.fj")
	public VZJVQLEE field437;

	@ObfuscatedName("client.Vb")
	public ZQSBFHWZ field109;

	@ObfuscatedName("client.Wb")
	public ZQSBFHWZ field110;

	@ObfuscatedName("client.Se")
	public ZQSBFHWZ field247;

	@ObfuscatedName("client.Te")
	public ZQSBFHWZ field248;

	@ObfuscatedName("client.Ue")
	public ZQSBFHWZ field249;

	@ObfuscatedName("client.of")
	public ZQSBFHWZ field265;

	@ObfuscatedName("client.pf")
	public ZQSBFHWZ field266;

	@ObfuscatedName("client.Dh")
	public ZQSBFHWZ field367;

	@ObfuscatedName("client.Eh")
	public ZQSBFHWZ field368;

	@ObfuscatedName("client.Fh")
	public ZQSBFHWZ field369;

	@ObfuscatedName("client.Ui")
	public ZQSBFHWZ field427;

	@ObfuscatedName("client.Vi")
	public ZQSBFHWZ field428;

	@ObfuscatedName("client.Wi")
	public ZQSBFHWZ field429;

	@ObfuscatedName("client.Xi")
	public ZQSBFHWZ field430;

	@ObfuscatedName("client.Yi")
	public ZQSBFHWZ field431;

	@ObfuscatedName("client.yb")
	public ZQSBFHWZ field89;

	@ObfuscatedName("client.zb")
	public ZQSBFHWZ field90;

	@ObfuscatedName("client.Ab")
	public ZQSBFHWZ field91;

	@ObfuscatedName("client.Bb")
	public ZQSBFHWZ field92;

	@ObfuscatedName("client.Cb")
	public ZQSBFHWZ field93;

	@ObfuscatedName("client.Ni")
	public ZTYSAOXK field421;

	@ObfuscatedName("client.Oi")
	public ZTYSAOXK field422;

	@ObfuscatedName("client.Pi")
	public ZTYSAOXK field423;

	@ObfuscatedName("client.Qi")
	public ZTYSAOXK field424;

	@ObfuscatedName("client.ic")
	public String field119;

	@ObfuscatedName("client.ld")
	public String field166;

	@ObfuscatedName("client.pd")
	public String field170;

	@ObfuscatedName("client.wf")
	public String field272;

	@ObfuscatedName("client.ae")
	public Socket field206;

	@ObfuscatedName("client.Rd")
	public static boolean field197;

	@ObfuscatedName("client.sf")
	public static boolean field268;

	@ObfuscatedName("client.oi")
	public static boolean field400;

	@ObfuscatedName("client.jj")
	public static boolean field441;

	@ObfuscatedName("client.kc")
	public int[] field121;

	@ObfuscatedName("client.lc")
	public int[] field122;

	@ObfuscatedName("client.mc")
	public int[] field123;

	@ObfuscatedName("client.nc")
	public int[] field124;

	@ObfuscatedName("client.Oe")
	public int[] field243;

	@ObfuscatedName("client.Pe")
	public int[] field244;

	@ObfuscatedName("client.Mf")
	public int[] field287;

	@ObfuscatedName("client.Nf")
	public int[] field288;

	@ObfuscatedName("client.Ej")
	public int[] field459;

	@ObfuscatedName("client.Fj")
	public int[] field460;

	@ObfuscatedName("client.Gj")
	public int[] field461;

	@ObfuscatedName("client.Hj")
	public int[] field462;

	@ObfuscatedName("client.Jj")
	public int[] field464;

	@ObfuscatedName("client.Kj")
	public int[] field465;

	@ObfuscatedName("client.Lj")
	public int[] field466;

	@ObfuscatedName("client.Aj")
	public ZQSBFHWZ[] field456;

	@ObfuscatedName("client.Zg")
	public byte[][] field340;

	@ObfuscatedName("client.bj")
	public byte[][] field434;

	@ObfuscatedName("client.Hc")
	public byte[][][] field139;

	@ObfuscatedName("client.qb")
	public int[][][] field82;

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method10(String arg0) throws IOException {
		if (field450) {
			if (field206 != null) {
				try {
					field206.close();
				} catch (Exception var4) {
				}

				field206 = null;
			}

			field206 = method131(43595);
			field206.setSoTimeout(10000);
			InputStream var2 = field206.getInputStream();
			OutputStream var3 = field206.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(B)V")
	public final void method11() {
		field277 = false;
		while (field228) {
			field277 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field265 = null;
		field266 = null;
		field456 = null;
		field121 = null;
		field122 = null;
		field123 = null;
		field124 = null;
		field243 = null;
		field244 = null;
		field287 = null;
		field288 = null;
		field436 = null;
		field437 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method12(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field357; var2++) {
			if (arg0.equalsIgnoreCase(field215[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field114.field1235)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method13() {
		field265 = new ZQSBFHWZ(field445, "titlebox", 0);
		field266 = new ZQSBFHWZ(field445, "titlebutton", 0);
		field456 = new ZQSBFHWZ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field456[var1] = new ZQSBFHWZ(field445, "runes", var1);
		}

		field436 = new VZJVQLEE(128, 265);
		field437 = new VZJVQLEE(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field436.field1293[var2] = field220.field850[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field437.field1293[var3] = field221.field850[var3];
		}

		field122 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field122[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field122[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field122[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field122[var7 + 192] = 0xFFFFFF;
		}

		field123 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field123[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field123[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field123[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field123[var11 + 192] = 0xFFFFFF;
		}

		field124 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field124[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field124[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field124[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field124[var15 + 192] = 0xFFFFFF;
		}

		field121 = new int[256];
		field243 = new int[32768];
		field244 = new int[32768];
		method104(null);
		field287 = new int[32768];
		field288 = new int[32768];
		method51(10, "Connecting to fileserver");

		if (!field277) {
			field379 = true;
			field277 = true;
			method58(this, 2);
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method14() {
		field86.method358(22);

		if (field397 != -1) {
			method154(field397);
			field397 = -1;
			field495 = true;
			field264 = false;
			field132 = true;
		}

		if (field330 != -1) {
			method154(field330);
			field330 = -1;
			field471 = true;
			field264 = false;
		}

		if (field127 != -1) {
			method154(field127);
			field127 = -1;
			field70 = true;
		}

		if (field118 != -1) {
			method154(field118);
			field118 = -1;
		}

		if (field484 != -1) {
			method154(field484);
			field484 = -1;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method15() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field287[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field287[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field288[var10] = (field287[var10 - 1] + field287[var10 + 1] + field287[var10 - 128] + field287[var10 + 128]) / 4;
			}
		}

		field488 += 128;
		if (field488 > field243.length) {
			field488 -= field243.length;
			int var11 = (int) (Math.random() * 12.0D);
			method104(field456[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field288[var14 + 128] - field243[field488 + var14 & field243.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field287[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field332[var16] = field332[var16 + 1];
		}

		field332[var1 - 1] = (int) (Math.sin(field155 / 14.0D) * 16.0D + Math.sin(field155 / 15.0D) * 14.0D + Math.sin(field155 / 16.0D) * 12.0D);

		if (field457 > 0) {
			field457 -= 4;
		}

		if (field458 > 0) {
			field458 -= 4;
		}

		if (field457 == 0 && field458 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field457 = 1024;
			}

			if (var17 == 1) {
				field458 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(III)Ljava/lang/String;")
	public static final String method16(int arg0, int arg1) {
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

	@ObfuscatedName("client.d(Z)V")
	public final void method17() {
		for (int var1 = 0; var1 < field309; var1++) {
			int var2 = field310[var1];
			SBPCMLRM var3 = field308[var2];
			if (var3 != null) {
				method18(var3.field1214.field1392, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IZLNQXGETKS;)V")
	public final void method18(int arg0, NQXGETKS arg1) {
		if (arg1.field977 < 128 || arg1.field978 < 128 || arg1.field977 >= 13184 || arg1.field978 >= 13184) {
			arg1.field1015 = -1;
			arg1.field969 = -1;
			arg1.field1012 = 0;
			arg1.field1013 = 0;
			arg1.field977 = arg1.field975[0] * 128 + arg1.field992 * 64;
			arg1.field978 = arg1.field976[0] * 128 + arg1.field992 * 64;
			arg1.method427();
		}

		if (field114 == arg1 && (arg1.field977 < 1536 || arg1.field978 < 1536 || arg1.field977 >= 11776 || arg1.field978 >= 11776)) {
			arg1.field1015 = -1;
			arg1.field969 = -1;
			arg1.field1012 = 0;
			arg1.field1013 = 0;
			arg1.field977 = arg1.field975[0] * 128 + arg1.field992 * 64;
			arg1.field978 = arg1.field976[0] * 128 + arg1.field992 * 64;
			arg1.method427();
		}

		if (arg1.field1012 > field155) {
			method19(arg1);
		} else if (arg1.field1013 >= field155) {
			method20(arg1);
		} else {
			method21(arg1);
		}

		method22(arg1);
		method23(arg1);
	}

	@ObfuscatedName("client.a(BLNQXGETKS;)V")
	public final void method19(NQXGETKS arg0) {
		int var2 = arg0.field1012 - field155;
		int var3 = arg0.field992 * 64 + arg0.field1008 * 128;
		int var4 = arg0.field992 * 64 + arg0.field1010 * 128;
		arg0.field977 += (var3 - arg0.field977) / var2;
		arg0.field978 += (var4 - arg0.field978) / var2;
		arg0.field1000 = 0;

		if (arg0.field1014 == 0) {
			arg0.field991 = 1024;
		}

		if (arg0.field1014 == 1) {
			arg0.field991 = 1536;
		}

		if (arg0.field1014 == 2) {
			arg0.field991 = 0;
		}

		if (arg0.field1014 == 3) {
			arg0.field991 = 512;
		}
	}

	@ObfuscatedName("client.a(LNQXGETKS;I)V")
	public final void method20(NQXGETKS arg0) {
		if (field155 == arg0.field1013 || arg0.field1015 == -1 || arg0.field1018 != 0 || arg0.field1017 + 1 > EHYLCNJX.field744[arg0.field1015].method252(arg0.field1016)) {
			int var2 = arg0.field1013 - arg0.field1012;
			int var3 = field155 - arg0.field1012;
			int var4 = arg0.field992 * 64 + arg0.field1008 * 128;
			int var5 = arg0.field992 * 64 + arg0.field1010 * 128;
			int var6 = arg0.field992 * 64 + arg0.field1009 * 128;
			int var7 = arg0.field992 * 64 + arg0.field1011 * 128;
			arg0.field977 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field978 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1000 = 0;

		if (arg0.field1014 == 0) {
			arg0.field991 = 1024;
		}

		if (arg0.field1014 == 1) {
			arg0.field991 = 1536;
		}

		if (arg0.field1014 == 2) {
			arg0.field991 = 0;
		}

		if (arg0.field1014 == 3) {
			arg0.field991 = 512;
		}

		arg0.field979 = arg0.field991;
	}

	@ObfuscatedName("client.a(LNQXGETKS;Z)V")
	public final void method21(NQXGETKS arg0) {
		arg0.field1002 = arg0.field989;
		if (arg0.field998 == 0) {
			arg0.field1000 = 0;
		} else {
			if (arg0.field1015 != -1 && arg0.field1018 == 0) {
				EHYLCNJX var2 = EHYLCNJX.field744[arg0.field1015];
				if (arg0.field980 > 0 && var2.field756 == 0) {
					arg0.field1000++;
					return;
				}

				if (arg0.field980 <= 0 && var2.field757 == 0) {
					arg0.field1000++;
					return;
				}
			}

			int var3 = arg0.field977;
			int var4 = arg0.field978;
			int var5 = arg0.field975[arg0.field998 - 1] * 128 + arg0.field992 * 64;
			int var6 = arg0.field976[arg0.field998 - 1] * 128 + arg0.field992 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field991 = 1280;
					} else if (var4 > var6) {
						arg0.field991 = 1792;
					} else {
						arg0.field991 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field991 = 768;
					} else if (var4 > var6) {
						arg0.field991 = 256;
					} else {
						arg0.field991 = 512;
					}
				} else if (var4 < var6) {
					arg0.field991 = 1024;
				} else {
					arg0.field991 = 0;
				}

				int var7 = arg0.field991 - arg0.field979 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field982;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field981;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field984;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field983;
				}

				if (var8 == -1) {
					var8 = arg0.field981;
				}

				arg0.field1002 = var8;
				int var9 = 4;
				if (arg0.field991 != arg0.field979 && arg0.field1007 == -1 && arg0.field1001 != 0) {
					var9 = 2;
				}

				if (arg0.field998 > 2) {
					var9 = 6;
				}

				if (arg0.field998 > 3) {
					var9 = 8;
				}

				if (arg0.field1000 > 0 && arg0.field998 > 1) {
					var9 = 8;
					arg0.field1000--;
				}

				if (arg0.field988[arg0.field998 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field981 == arg0.field1002 && arg0.field999 != -1) {
					arg0.field1002 = arg0.field999;
				}

				if (var3 < var5) {
					arg0.field977 += var9;
					if (arg0.field977 > var5) {
						arg0.field977 = var5;
					}
				} else if (var3 > var5) {
					arg0.field977 -= var9;
					if (arg0.field977 < var5) {
						arg0.field977 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field978 += var9;
					if (arg0.field978 > var6) {
						arg0.field978 = var6;
					}
				} else if (var4 > var6) {
					arg0.field978 -= var9;
					if (arg0.field978 < var6) {
						arg0.field978 = var6;
					}
				}

				if (arg0.field977 == var5 && arg0.field978 == var6) {
					arg0.field998--;

					if (arg0.field980 > 0) {
						arg0.field980--;
						return;
					}
				}
			} else {
				arg0.field977 = var5;
				arg0.field978 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LNQXGETKS;I)V")
	public final void method22(NQXGETKS arg0) {
		if (arg0.field1001 != 0) {
			if (arg0.field1007 != -1 && arg0.field1007 < 32768) {
				SBPCMLRM var2 = field308[arg0.field1007];
				if (var2 != null) {
					int var3 = arg0.field977 - var2.field977;
					int var4 = arg0.field978 - var2.field978;
					if (var3 != 0 || var4 != 0) {
						arg0.field991 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1007 >= 32768) {
				int var5 = arg0.field1007 - 32768;
				if (field405 == var5) {
					var5 = field185;
				}

				SOKVSBIO var6 = field186[var5];
				if (var6 != null) {
					int var7 = arg0.field977 - var6.field977;
					int var8 = arg0.field978 - var6.field978;
					if (var7 != 0 || var8 != 0) {
						arg0.field991 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field995 != 0 || arg0.field996 != 0) && (arg0.field998 == 0 || arg0.field1000 > 0)) {
				int var9 = arg0.field977 - (arg0.field995 - field150 - field150) * 64;
				int var10 = arg0.field978 - (arg0.field996 - field151 - field151) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field991 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field995 = 0;
				arg0.field996 = 0;
			}

			int var11 = arg0.field991 - arg0.field979 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1001 || var11 > 2048 - arg0.field1001) {
					arg0.field979 = arg0.field991;
				} else if (var11 > 1024) {
					arg0.field979 -= arg0.field1001;
				} else {
					arg0.field979 += arg0.field1001;
				}

				arg0.field979 &= 0x7FF;
				if (arg0.field989 == arg0.field1002 && arg0.field991 != arg0.field979) {
					if (arg0.field990 != -1) {
						arg0.field1002 = arg0.field990;
						return;
					}

					arg0.field1002 = arg0.field981;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILNQXGETKS;)V")
	public final void method23(NQXGETKS arg0) {
		arg0.field1005 = false;

		if (arg0.field1002 != -1) {
			EHYLCNJX var2 = EHYLCNJX.field744[arg0.field1002];
			arg0.field1004++;
			if (arg0.field1003 < var2.field745 && arg0.field1004 > var2.method252(arg0.field1003)) {
				arg0.field1004 = 0;
				arg0.field1003++;
			}

			if (arg0.field1003 >= var2.field745) {
				arg0.field1004 = 0;
				arg0.field1003 = 0;
			}
		}

		if (arg0.field969 != -1 && field155 >= arg0.field972) {
			if (arg0.field970 < 0) {
				arg0.field970 = 0;
			}

			EHYLCNJX var3 = BZLQCUPI.field41[arg0.field969].field45;
			arg0.field971++;
			while (arg0.field970 < var3.field745 && arg0.field971 > var3.method252(arg0.field970)) {
				arg0.field971 -= var3.method252(arg0.field970);
				arg0.field970++;
			}

			if (arg0.field970 >= var3.field745 && (arg0.field970 < 0 || arg0.field970 >= var3.field745)) {
				arg0.field969 = -1;
			}
		}

		if (arg0.field1015 != -1 && arg0.field1018 <= 1) {
			EHYLCNJX var4 = EHYLCNJX.field744[arg0.field1015];
			if (var4.field756 == 1 && arg0.field980 > 0 && arg0.field1012 <= field155 && arg0.field1013 < field155) {
				arg0.field1018 = 1;
				return;
			}
		}

		if (arg0.field1015 != -1 && arg0.field1018 == 0) {
			EHYLCNJX var5 = EHYLCNJX.field744[arg0.field1015];
			arg0.field1017++;
			while (arg0.field1016 < var5.field745 && arg0.field1017 > var5.method252(arg0.field1016)) {
				arg0.field1017 -= var5.method252(arg0.field1016);
				arg0.field1016++;
			}

			if (arg0.field1016 >= var5.field745) {
				arg0.field1016 -= var5.field749;
				arg0.field1019++;
				if (arg0.field1019 >= var5.field755) {
					arg0.field1015 = -1;
				}

				if (arg0.field1016 < 0 || arg0.field1016 >= var5.field745) {
					arg0.field1015 = -1;
				}
			}

			arg0.field1005 = var5.field751;
		}

		if (arg0.field1018 > 0) {
			arg0.field1018--;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method24() {
		if (field127 == -1 || field263 != 2 && field704 == null) {
			if (field70) {
				method149();
				field70 = false;
				field380.method299(field703, 0, 4);
				field381.method299(field703, 0, 357);
				field382.method299(field703, 722, 4);
				field383.method299(field703, 743, 205);
				field384.method299(field703, 0, 0);
				field385.method299(field703, 516, 4);
				field386.method299(field703, 516, 205);
				field387.method299(field703, 496, 357);
				field388.method299(field703, 0, 338);
				field495 = true;
				field471 = true;
				field132 = true;
				field128 = true;

				if (field263 != 2) {
					field415.method299(field703, 4, 4);
					field414.method299(field703, 550, 4);
				}
			}

			if (field263 == 2) {
				method80();
			}

			if (field451 && field144 == 1) {
				field495 = true;
			}

			if (field397 != -1) {
				boolean var3 = method27(field397, field107);
				if (var3) {
					field495 = true;
				}
			}

			if (field261 == 2) {
				field495 = true;
			}

			if (field491 == 2) {
				field495 = true;
			}

			if (field495) {
				method136();
				field495 = false;
			}

			if (field330 == -1 && field58 == 0) {
				field94.field1126 = field322 - field321 - 77;

				if (field711 > 448 && field711 < 560 && field712 > 332) {
					method124(field712 - 357, field711 - 17, field94, field322, 77, -1, 463, 0);
				}

				int var4 = field322 - field94.field1126 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field322 - 77) {
					var4 = field322 - 77;
				}

				if (field321 != var4) {
					field321 = var4;
					field471 = true;
				}
			}

			if (field330 == -1 && field58 == 3) {
				int var5 = field60 * 14 + 7;
				field94.field1126 = field63;

				if (field711 > 448 && field711 < 560 && field712 > 332) {
					method124(field712 - 357, field711 - 17, field94, var5, 77, -1, 463, 0);
				}

				int var6 = field94.field1126;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field63 != var6) {
					field63 = var6;
					field471 = true;
				}
			}

			if (field330 != -1) {
				boolean var7 = method27(field330, field107);
				if (var7) {
					field471 = true;
				}
			}

			if (field261 == 3) {
				field471 = true;
			}

			if (field491 == 3) {
				field471 = true;
			}

			if (field119 != null) {
				field471 = true;
			}

			if (field451 && field144 == 2) {
				field471 = true;
			}

			if (field471) {
				method52();
				field471 = false;
			}

			if (field263 == 2) {
				method105();
				field414.method299(field703, 550, 4);
			}

			if (field140 != -1) {
				field132 = true;
			}

			if (field132) {
				if (field140 != -1 && field229 == field140) {
					field140 = -1;
					field86.method358(170);
					field86.method359(field229);
				}

				field132 = false;
				field449.method298();
				field249.method586(0, 0);

				if (field397 == -1) {
					if (field315[field229] != -1) {
						if (field229 == 0) {
							field427.method586(22, 10);
						}

						if (field229 == 1) {
							field428.method586(54, 8);
						}

						if (field229 == 2) {
							field428.method586(82, 8);
						}

						if (field229 == 3) {
							field429.method586(110, 8);
						}

						if (field229 == 4) {
							field431.method586(153, 8);
						}

						if (field229 == 5) {
							field431.method586(181, 8);
						}

						if (field229 == 6) {
							field430.method586(209, 9);
						}
					}

					if (field315[0] != -1 && (field140 != 0 || field155 % 20 < 10)) {
						field339[0].method586(29, 13);
					}

					if (field315[1] != -1 && (field140 != 1 || field155 % 20 < 10)) {
						field339[1].method586(53, 11);
					}

					if (field315[2] != -1 && (field140 != 2 || field155 % 20 < 10)) {
						field339[2].method586(82, 11);
					}

					if (field315[3] != -1 && (field140 != 3 || field155 % 20 < 10)) {
						field339[3].method586(115, 12);
					}

					if (field315[4] != -1 && (field140 != 4 || field155 % 20 < 10)) {
						field339[4].method586(153, 13);
					}

					if (field315[5] != -1 && (field140 != 5 || field155 % 20 < 10)) {
						field339[5].method586(180, 11);
					}

					if (field315[6] != -1 && (field140 != 6 || field155 % 20 < 10)) {
						field339[6].method586(208, 13);
					}
				}

				field449.method299(field703, 516, 160);
				field448.method298();
				field248.method586(0, 0);

				if (field397 == -1) {
					if (field315[field229] != -1) {
						if (field229 == 7) {
							field89.method586(42, 0);
						}

						if (field229 == 8) {
							field90.method586(74, 0);
						}

						if (field229 == 9) {
							field90.method586(102, 0);
						}

						if (field229 == 10) {
							field91.method586(130, 1);
						}

						if (field229 == 11) {
							field93.method586(173, 0);
						}

						if (field229 == 12) {
							field93.method586(201, 0);
						}

						if (field229 == 13) {
							field92.method586(229, 0);
						}
					}

					if (field315[8] != -1 && (field140 != 8 || field155 % 20 < 10)) {
						field339[7].method586(74, 2);
					}

					if (field315[9] != -1 && (field140 != 9 || field155 % 20 < 10)) {
						field339[8].method586(102, 3);
					}

					if (field315[10] != -1 && (field140 != 10 || field155 % 20 < 10)) {
						field339[9].method586(137, 4);
					}

					if (field315[11] != -1 && (field140 != 11 || field155 % 20 < 10)) {
						field339[10].method586(174, 2);
					}

					if (field315[12] != -1 && (field140 != 12 || field155 % 20 < 10)) {
						field339[11].method586(201, 2);
					}

					if (field315[13] != -1 && (field140 != 13 || field155 % 20 < 10)) {
						field339[12].method586(226, 2);
					}
				}

				field448.method299(field703, 496, 466);
				field415.method298();
				CUNPUNFW.field517 = field461;
			}

			if (field128) {
				field128 = false;
				field447.method298();
				field247.method586(0, 0);
				field422.method590(true, "Public chat", 0xFFFFFF, 28, 55);

				if (field211 == 0) {
					field422.method590(true, "On", 0xFF00, 41, 55);
				}

				if (field211 == 1) {
					field422.method590(true, "Friends", 0xFFFF00, 41, 55);
				}

				if (field211 == 2) {
					field422.method590(true, "Off", 0xFF0000, 41, 55);
				}

				if (field211 == 3) {
					field422.method590(true, "Hide", 0xFFFF, 41, 55);
				}

				field422.method590(true, "Private chat", 0xFFFFFF, 28, 184);

				if (field83 == 0) {
					field422.method590(true, "On", 0xFF00, 41, 184);
				}

				if (field83 == 1) {
					field422.method590(true, "Friends", 0xFFFF00, 41, 184);
				}

				if (field83 == 2) {
					field422.method590(true, "Off", 0xFF0000, 41, 184);
				}

				field422.method590(true, "Trade/compete", 0xFFFFFF, 28, 324);

				if (field72 == 0) {
					field422.method590(true, "On", 0xFF00, 41, 324);
				}

				if (field72 == 1) {
					field422.method590(true, "Friends", 0xFFFF00, 41, 324);
				}

				if (field72 == 2) {
					field422.method590(true, "Off", 0xFF0000, 41, 324);
				}

				field422.method590(true, "Report abuse", 0xFFFFFF, 33, 458);
				field447.method299(field703, 0, 453);
				field415.method298();
				CUNPUNFW.field517 = field461;
			}

			field107 = 0;
		} else {
			if (field263 == 2) {
				method27(field127, field107);

				if (field118 != -1) {
					method27(field118, field107);
				}

				field107 = 0;
				method77();
				field704.method298();
				CUNPUNFW.field517 = field462;
				GBJWVQAY.method287();
				field70 = true;
				PQPZKUPU var1 = PQPZKUPU.method460(field127);
				if (var1.field1121 == 512 && var1.field1118 == 334 && var1.field1101 == 0) {
					var1.field1121 = 765;
					var1.field1118 = 503;
				}

				method35(0, 0, var1, 0);

				if (field118 != -1) {
					PQPZKUPU var2 = PQPZKUPU.method460(field118);
					if (var2.field1121 == 512 && var2.field1118 == 334 && var2.field1101 == 0) {
						var2.field1121 = 765;
						var2.field1118 = 503;
					}

					method35(0, 0, var2, 0);
				}

				if (field451) {
					method143();
				} else {
					method121();
					method138();
				}
			}

			field704.method299(field703, 0, 0);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method25(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field87 = "";
				field88 = "Connecting to server...";
				method84(true);
			}

			field285 = new GBBCHPEB(this, method131(field195 + 43594));
			long var4 = OERTMYQW.method440(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field86.field882 = 0;
			field86.method359(14);
			field86.method359(var6);
			field285.method282(0, field86.field881, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field285.method279();
			}

			int var8 = field285.method279();
			int var9 = var8;

			if (var8 == 0) {
				field285.method281(field487.field881, 0, 8);
				field487.field882 = 0;
				field134 = field487.method375();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field134 >> 32), (int) field134 };
				field86.field882 = 0;
				field86.method359(10);
				field86.method363(var10[0]);
				field86.method363(var10[1]);
				field86.method363(var10[2]);
				field86.method363(var10[3]);
				field86.method363(signlink.uid);
				field86.method366(arg0);
				field86.method366(arg1);
				field86.method384(field270, field468);
				field412.field882 = 0;

				if (arg2) {
					field412.method359(18);
				} else {
					field412.method359(16);
				}

				field412.method359(field86.field882 + 36 + 1 + 1 + 2);
				field412.method359(255);
				field412.method360(356);
				field412.method359(field197 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field412.method363(field353[var11]);
				}

				field412.method367(0, field86.field881, field86.field882);
				field86.field886 = new NIUUCTKL(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field209 = new NIUUCTKL(var10);
				field285.method282(0, field412.field881, field412.field882);
				var8 = field285.method279();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method25(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field319 = field285.method279();
				field441 = field285.method279() == 1;
				field281 = 0L;
				field446 = 0;
				field391.field787 = 0;
				field708 = true;
				field133 = true;
				field289 = true;
				field86.field882 = 0;
				field487.field882 = 0;
				field179 = -1;
				field129 = -1;
				field130 = -1;
				field131 = -1;
				field178 = 0;
				field180 = 0;
				field362 = 0;
				field182 = 0;
				field239 = 0;
				field108 = 0;
				field451 = false;
				field709 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field313[var13] = null;
				}

				field162 = 0;
				field167 = 0;
				field263 = 0;
				field376 = 0;
				field105 = (int) (Math.random() * 100.0D) - 50;
				field245 = (int) (Math.random() * 110.0D) - 55;
				field234 = (int) (Math.random() * 80.0D) - 40;
				field419 = (int) (Math.random() * 120.0D) - 60;
				field472 = (int) (Math.random() * 30.0D) - 20;
				field55 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field467 = 0;
				field262 = -1;
				field200 = 0;
				field201 = 0;
				field187 = 0;
				field309 = 0;

				for (int var14 = 0; var14 < field184; var14++) {
					field186[var14] = null;
					field191[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field308[var15] = null;
				}

				field114 = field186[field185] = new SOKVSBIO();
				field290.method453();
				field325.method453();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field212[var16][var17][var18] = null;
						}
					}
				}

				field71 = new PACANLMY();
				field358 = 0;
				field357 = 0;
				method154(field126);
				field126 = -1;
				method154(field330);
				field330 = -1;
				method154(field484);
				field484 = -1;
				method154(field127);
				field127 = -1;
				method154(field118);
				field118 = -1;
				method154(field397);
				field397 = -1;
				method154(field356);
				field356 = -1;
				field264 = false;
				field229 = 3;
				field58 = 0;
				field451 = false;
				field64 = false;
				field119 = null;
				field159 = 0;
				field140 = -1;
				field351 = true;
				method87();

				for (int var19 = 0; var19 < 5; var19++) {
					field425[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field347[var20] = null;
					field348[var20] = false;
				}

				field409 = 0;
				field112 = 0;
				field172 = 0;
				field454 = 0;
				field204 = 0;
				field237 = 0;
				field398 = 0;
				field469 = 0;
				field67 = 0;
				method149();
			} else if (var8 == 3) {
				field87 = "";
				field88 = "Invalid username or password.";
			} else if (var8 == 4) {
				field87 = "Your account has been disabled.";
				field88 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field87 = "Your account is already logged in.";
				field88 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field87 = "RuneScape has been updated!";
				field88 = "Please reload this page.";
			} else if (var8 == 7) {
				field87 = "This world is full.";
				field88 = "Please use a different world.";
			} else if (var8 == 8) {
				field87 = "Unable to connect.";
				field88 = "Login server offline.";
			} else if (var8 == 9) {
				field87 = "Login limit exceeded.";
				field88 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field87 = "Unable to connect.";
				field88 = "Bad session id.";
			} else if (var8 == 11) {
				field87 = "Login server rejected session.";
				field88 = "Please try again.";
			} else if (var8 == 12) {
				field87 = "You need a members account to login to this world.";
				field88 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field87 = "Could not complete login.";
				field88 = "Please try using a different world.";
			} else if (var8 == 14) {
				field87 = "The server is being updated.";
				field88 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field289 = true;
				field86.field882 = 0;
				field487.field882 = 0;
				field179 = -1;
				field129 = -1;
				field130 = -1;
				field131 = -1;
				field178 = 0;
				field180 = 0;
				field362 = 0;
				field108 = 0;
				field451 = false;
				field440 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field87 = "Login attempts exceeded.";
				field88 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field87 = "You are standing in a members-only area.";
				field88 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field87 = "Invalid loginserver requested";
				field88 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field285.method279();
				for (var21 += 3; var21 >= 0; var21--) {
					field87 = "You have only just left another world";
					field88 = "Your profile will be transferred in: " + var21;
					method84(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method25(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field87 = "Malformed login packet.";
				field88 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field87 = "Unexpected server response";
				field88 = "Please try using a different world.";
			} else if (var9 != 0) {
				field87 = "No response from server";
				field88 = "Please try using a different world.";
			} else if (field410 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field410++;
				method25(arg0, arg1, arg2);
			} else {
				field87 = "No response from loginserver";
				field88 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field87 = "";
			field88 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method26() {
		field120 = 0;
		int var1 = (field114.field977 >> 7) + field150;
		int var2 = (field114.field978 >> 7) + field151;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field120 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field120 = 1;
		}

		if (field120 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field120 = 0;
		}
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method27(int arg0, int arg1) {
		boolean var3 = false;
		PQPZKUPU var4 = PQPZKUPU.method460(arg0);
		for (int var5 = 0; var5 < var4.field1073.length && var4.field1073[var5] != -1; var5++) {
			PQPZKUPU var6 = PQPZKUPU.method460(var4.field1073[var5]);
			if (var6.field1101 == 0) {
				var3 |= method27(var6.field1125, arg1);
			}

			if (var6.field1101 == 6 && (var6.field1130 != -1 || var6.field1131 != -1)) {
				boolean var7 = method115(var6);
				int var8;
				if (var7) {
					var8 = var6.field1131;
				} else {
					var8 = var6.field1130;
				}

				if (var8 != -1) {
					EHYLCNJX var9 = EHYLCNJX.field744[var8];
					var6.field1115 += arg1;
					while (var6.field1115 > var9.method252(var6.field1108)) {
						var6.field1115 -= var9.method252(var6.field1108) + 1;
						var6.field1108++;
						if (var6.field1108 >= var9.field745) {
							var6.field1108 -= var9.field749;
							if (var6.field1108 < 0 || var6.field1108 >= var9.field745) {
								var6.field1108 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1101 == 6 && var6.field1124 != 0) {
				int var10 = var6.field1124 >> 16;
				int var11 = var6.field1124 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1133 = var6.field1133 + var10 & 0x7FF;
				var6.field1134 = var6.field1134 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method28() {
		if (field217 == null) {
			field704 = null;
			field416 = null;
			field414 = null;
			field413 = null;
			field415 = null;
			field447 = null;
			field448 = null;
			field449 = null;
			field220 = new HURULSIZ(265, 128, method65());
			GBJWVQAY.method287();
			field221 = new HURULSIZ(265, 128, method65());
			GBJWVQAY.method287();
			field217 = new HURULSIZ(171, 509, method65());
			GBJWVQAY.method287();
			field218 = new HURULSIZ(132, 360, method65());
			GBJWVQAY.method287();
			field219 = new HURULSIZ(200, 360, method65());
			GBJWVQAY.method287();
			field222 = new HURULSIZ(238, 202, method65());
			GBJWVQAY.method287();
			field223 = new HURULSIZ(238, 203, method65());
			GBJWVQAY.method287();
			field224 = new HURULSIZ(94, 74, method65());
			GBJWVQAY.method287();
			field225 = new HURULSIZ(94, 75, method65());
			GBJWVQAY.method287();

			if (field445 != null) {
				method68();
				method13();
			}

			field70 = true;
		}
	}

	@ObfuscatedName("client.a(IILLBBVYYXO;)V")
	public final void method29(int arg0, LBBVYYXO arg1) {
		while (arg1.field883 + 10 < arg0 * 8) {
			int var3 = arg1.method380(11);
			if (var3 == 2047) {
				break;
			}

			if (field186[var3] == null) {
				field186[var3] = new SOKVSBIO();
				if (field191[var3] != null) {
					field186[var3].method526(field191[var3]);
				}
			}

			field188[field187++] = var3;
			SOKVSBIO var4 = field186[var3];
			var4.field968 = field155;
			int var5 = arg1.method380(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method380(1);
			if (var6 == 1) {
				field190[field189++] = var3;
			}

			int var7 = arg1.method380(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method380(1);
			var4.method430(field114.field975[0] + var5, field114.field976[0] + var7, var8 == 1);
		}

		arg1.method381();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method30() {
		if (field176 || field149 || field269) {
			method62();
		} else {
			field439++;

			if (field289) {
				method24();
			} else {
				method84(false);
			}

			field183 = 0;
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method31() {
		if (field263 == 2) {
			for (FIMQRVPL var1 = (FIMQRVPL) field71.method449(); var1 != null; var1 = (FIMQRVPL) field71.method451()) {
				if (var1.field791 > 0) {
					var1.field791--;
				}

				if (var1.field791 != 0) {
					if (var1.field802 > 0) {
						var1.field802--;
					}

					if (var1.field802 == 0 && var1.field797 >= 1 && var1.field798 >= 1 && var1.field797 <= 102 && var1.field798 <= 102 && (var1.field799 < 0 || EZVBBZYG.method264(var1.field801, var1.field799))) {
						method112(var1.field798, var1.field801, var1.field796, var1.field799, var1.field800, var1.field795, var1.field797);
						var1.field802 = -1;

						if (var1.field799 == var1.field792 && var1.field792 == -1) {
							var1.method464();
						} else if (var1.field799 == var1.field792 && var1.field800 == var1.field793 && var1.field801 == var1.field794) {
							var1.method464();
						}
					}
				} else if (var1.field792 < 0 || EZVBBZYG.method264(var1.field794, var1.field792)) {
					method112(var1.field798, var1.field794, var1.field796, var1.field792, var1.field793, var1.field795, var1.field797);
					var1.method464();
				}
			}

			field403++;
			if (field403 > 109) {
				field403 = 0;
				field86.method358(229);
				field86.method360(8929);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LLBBVYYXO;II)V")
	public final void method32(LBBVYYXO arg0, int arg1) {
		int var3 = arg0.method380(8);
		if (var3 < field187) {
			for (int var4 = var3; var4 < field187; var4++) {
				field477[field476++] = field188[var4];
			}
		}

		if (var3 > field187) {
			signlink.reporterror(field401 + " Too many players");
			throw new RuntimeException("eek");
		}

		field187 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field188[var5];
			SOKVSBIO var7 = field186[var6];
			int var8 = arg0.method380(1);
			if (var8 == 0) {
				field188[field187++] = var6;
				var7.field968 = field155;
			} else {
				int var9 = arg0.method380(2);
				if (var9 == 0) {
					field188[field187++] = var6;
					var7.field968 = field155;
					field190[field189++] = var6;
				} else if (var9 == 1) {
					field188[field187++] = var6;
					var7.field968 = field155;
					int var10 = arg0.method380(3);
					var7.method428(var10, false);
					int var11 = arg0.method380(1);
					if (var11 == 1) {
						field190[field189++] = var6;
					}
				} else if (var9 == 2) {
					field188[field187++] = var6;
					var7.field968 = field155;
					int var12 = arg0.method380(3);
					var7.method428(var12, true);
					int var13 = arg0.method380(3);
					var7.method428(var13, true);
					int var14 = arg0.method380(1);
					if (var14 == 1) {
						field190[field189++] = var6;
					}
				} else if (var9 == 3) {
					field477[field476++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method33() {
		while (true) {
			ZUBZCVQN var1 = field77.method237();
			if (var1 == null) {
				return;
			}

			if (var1.field1516 == 0) {
				CYPZUKMB.method194(var1.field1517, var1.field1519);

				if ((field77.method229(var1.field1517) & 0x62) != 0) {
					field495 = true;

					if (field330 != -1 || field126 != -1) {
						field471 = true;
					}
				}
			}

			if (var1.field1516 == 1 && var1.field1519 != null) {
				QGRLAQIF.method466(var1.field1519);
			}

			if (var1.field1516 == 2 && field474 == var1.field1517 && var1.field1519 != null) {
				method156(field475, var1.field1519);
			}

			if (var1.field1516 == 3 && field263 == 1) {
				for (int var2 = 0; var2 < field340.length; var2++) {
					if (field465[var2] == var1.field1517) {
						field340[var2] = var1.field1519;

						if (var1.field1519 == null) {
							field465[var2] = -1;
						}

						break;
					}

					if (field466[var2] == var1.field1517) {
						field434[var2] = var1.field1519;

						if (var1.field1519 == null) {
							field466[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1516 == 93 && field77.method241(var1.field1517)) {
				EZVBBZYG.method260(field77, new LBBVYYXO(var1.field1519));
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method34() {
		if (field717 == 1) {
			if (field718 >= 539 && field718 <= 573 && field719 >= 169 && field719 < 205 && field315[0] != -1) {
				field495 = true;
				field229 = 0;
				field132 = true;
			}

			if (field718 >= 569 && field718 <= 599 && field719 >= 168 && field719 < 205 && field315[1] != -1) {
				field495 = true;
				field229 = 1;
				field132 = true;
			}

			if (field718 >= 597 && field718 <= 627 && field719 >= 168 && field719 < 205 && field315[2] != -1) {
				field495 = true;
				field229 = 2;
				field132 = true;
			}

			if (field718 >= 625 && field718 <= 669 && field719 >= 168 && field719 < 203 && field315[3] != -1) {
				field495 = true;
				field229 = 3;
				field132 = true;
			}

			if (field718 >= 666 && field718 <= 696 && field719 >= 168 && field719 < 205 && field315[4] != -1) {
				field495 = true;
				field229 = 4;
				field132 = true;
			}

			if (field718 >= 694 && field718 <= 724 && field719 >= 168 && field719 < 205 && field315[5] != -1) {
				field495 = true;
				field229 = 5;
				field132 = true;
			}

			if (field718 >= 722 && field718 <= 756 && field719 >= 169 && field719 < 205 && field315[6] != -1) {
				field495 = true;
				field229 = 6;
				field132 = true;
			}

			if (field718 >= 540 && field718 <= 574 && field719 >= 466 && field719 < 502 && field315[7] != -1) {
				field495 = true;
				field229 = 7;
				field132 = true;
			}

			if (field718 >= 572 && field718 <= 602 && field719 >= 466 && field719 < 503 && field315[8] != -1) {
				field495 = true;
				field229 = 8;
				field132 = true;
			}

			if (field718 >= 599 && field718 <= 629 && field719 >= 466 && field719 < 503 && field315[9] != -1) {
				field495 = true;
				field229 = 9;
				field132 = true;
			}

			if (field718 >= 627 && field718 <= 671 && field719 >= 467 && field719 < 502 && field315[10] != -1) {
				field495 = true;
				field229 = 10;
				field132 = true;
			}

			if (field718 >= 669 && field718 <= 699 && field719 >= 466 && field719 < 503 && field315[11] != -1) {
				field495 = true;
				field229 = 11;
				field132 = true;
			}

			if (field718 >= 696 && field718 <= 726 && field719 >= 466 && field719 < 503 && field315[12] != -1) {
				field495 = true;
				field229 = 12;
				field132 = true;
			}

			if (field718 >= 724 && field718 <= 758 && field719 >= 466 && field719 < 502 && field315[13] != -1) {
				field495 = true;
				field229 = 13;
				field132 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILPQPZKUPU;II)V")
	public final void method35(int arg0, int arg1, PQPZKUPU arg2, int arg3) {
		if (arg2.field1101 == 0 && arg2.field1073 != null && (!arg2.field1128 || field352 == arg2.field1125 || field483 == arg2.field1125 || field418 == arg2.field1125)) {
			int var5 = GBJWVQAY.field825;
			int var6 = GBJWVQAY.field823;
			int var7 = GBJWVQAY.field826;
			int var8 = GBJWVQAY.field824;
			GBJWVQAY.method286(arg3, arg1, arg2.field1121 + arg1, arg2.field1118 + arg3);
			int var9 = arg2.field1073.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1119[var10] + arg1;
				int var12 = arg2.field1122[var10] + arg3 - arg0;
				PQPZKUPU var13 = PQPZKUPU.method460(arg2.field1073[var10]);
				var11 += var13.field1105;
				var12 += var13.field1092;

				if (var13.field1067 > 0) {
					method92(var13);
				}

				if (var13.field1101 == 0) {
					if (var13.field1126 > var13.field1100 - var13.field1118) {
						var13.field1126 = var13.field1100 - var13.field1118;
					}

					if (var13.field1126 < 0) {
						var13.field1126 = 0;
					}

					method35(var13.field1126, var11, var13, var12);

					if (var13.field1100 > var13.field1118) {
						method38(var13.field1121 + var11, var12, var13.field1100, var13.field1126, var13.field1118);
					}
				} else if (var13.field1101 != 1) {
					if (var13.field1101 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1118; var15++) {
							for (int var16 = 0; var16 < var13.field1121; var16++) {
								int var17 = (var13.field1127 + 32) * var16 + var11;
								int var18 = (var13.field1084 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1116[var14];
									var18 += var13.field1129[var14];
								}

								if (var13.field1074[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1074[var14] - 1;
									if (var17 > GBJWVQAY.field825 - 32 && var17 < GBJWVQAY.field826 && var18 > GBJWVQAY.field823 - 32 && var18 < GBJWVQAY.field824 || field491 != 0 && field490 == var14) {
										int var22 = 0;
										if (field162 == 1 && field163 == var14 && field164 == var13.field1125) {
											var22 = 0xFFFFFF;
										}

										VZJVQLEE var23 = WGKWQDPM.method553(var13.field1078[var14], var21, var22);
										if (var23 != null) {
											if (field491 != 0 && field490 == var14 && field489 == var13.field1125) {
												var19 = field711 - field492;
												var20 = field712 - field493;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field365 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method543(128, var17 + var19, var18 + var20);

												if (var18 + var20 < GBJWVQAY.field823 && arg2.field1126 > 0) {
													int var24 = (GBJWVQAY.field823 - var18 - var20) * field107 / 3;
													if (var24 > field107 * 10) {
														var24 = field107 * 10;
													}

													if (var24 > arg2.field1126) {
														var24 = arg2.field1126;
													}

													arg2.field1126 -= var24;
													field493 += var24;
												}

												if (var18 + var20 + 32 > GBJWVQAY.field824 && arg2.field1126 < arg2.field1100 - arg2.field1118) {
													int var25 = (var18 + var20 + 32 - GBJWVQAY.field824) * field107 / 3;
													if (var25 > field107 * 10) {
														var25 = field107 * 10;
													}

													if (var25 > arg2.field1100 - arg2.field1118 - arg2.field1126) {
														var25 = arg2.field1100 - arg2.field1118 - arg2.field1126;
													}

													arg2.field1126 += var25;
													field493 -= var25;
												}
											} else if (field261 != 0 && field260 == var14 && field259 == var13.field1125) {
												var23.method543(128, var17, var18);
											} else {
												var23.method541(var17, var18);
											}

											if (var23.field1298 == 33 || var13.field1078[var14] != 1) {
												int var26 = var13.field1078[var14];
												field421.method593(method133(var26), var18 + var20 + 10, var17 + 1 + var19, 0);
												field421.method593(method133(var26), var18 + var20 + 9, var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1097 != null && var14 < 20) {
									VZJVQLEE var27 = var13.field1097[var14];
									if (var27 != null) {
										var27.method541(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1101 == 3) {
						boolean var28 = false;
						if (field418 == var13.field1125 || field483 == var13.field1125 || field352 == var13.field1125) {
							var28 = true;
						}

						int var29;
						if (method115(var13)) {
							var29 = var13.field1089;
							if (var28 && var13.field1094 != 0) {
								var29 = var13.field1094;
							}
						} else {
							var29 = var13.field1077;
							if (var28 && var13.field1071 != 0) {
								var29 = var13.field1071;
							}
						}

						if (var13.field1106 == 0) {
							if (var13.field1082) {
								GBJWVQAY.method289(var13.field1121, var11, var29, var12, var13.field1118);
							} else {
								GBJWVQAY.method290(var13.field1118, var29, var11, var13.field1121, var12);
							}
						} else if (var13.field1082) {
							GBJWVQAY.method288(256 - (var13.field1106 & 0xFF), var11, var13.field1121, var13.field1118, var12, var29);
						} else {
							GBJWVQAY.method291(var29, var12, var11, var13.field1121, var13.field1118, 256 - (var13.field1106 & 0xFF));
						}
					} else if (var13.field1101 == 4) {
						ZTYSAOXK var30 = var13.field1081;
						String var31 = var13.field1107;
						boolean var32 = false;
						if (field418 == var13.field1125 || field483 == var13.field1125 || field352 == var13.field1125) {
							var32 = true;
						}

						int var33;
						if (method115(var13)) {
							var33 = var13.field1089;
							if (var32 && var13.field1094 != 0) {
								var33 = var13.field1094;
							}

							if (var13.field1093.length() > 0) {
								var31 = var13.field1093;
							}
						} else {
							var33 = var13.field1077;
							if (var32 && var13.field1071 != 0) {
								var33 = var13.field1071;
							}
						}

						if (var13.field1135 == 6 && field264) {
							var31 = "Please wait...";
							var33 = var13.field1077;
						}

						if (GBJWVQAY.field821 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1513 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method155(method85(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method155(method85(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method155(method85(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method155(method85(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method155(method85(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1070) {
								var30.method590(var13.field1109, var41, var33, var34, var13.field1121 / 2 + var11);
							} else {
								var30.method597(var33, var41, var13.field1109, var11, var34);
							}

							var34 += var30.field1513;
						}
					} else if (var13.field1101 == 5) {
						VZJVQLEE var42;
						if (method115(var13)) {
							var42 = var13.field1111;
						} else {
							var42 = var13.field1114;
						}

						if (var42 != null) {
							var42.method541(var11, var12);
						}
					} else if (var13.field1101 == 6) {
						int var43 = CUNPUNFW.field511;
						int var44 = CUNPUNFW.field512;
						CUNPUNFW.field511 = var13.field1121 / 2 + var11;
						CUNPUNFW.field512 = var13.field1118 / 2 + var12;
						int var45 = CUNPUNFW.field515[var13.field1133] * var13.field1132 >> 16;
						int var46 = CUNPUNFW.field516[var13.field1133] * var13.field1132 >> 16;
						boolean var47 = method115(var13);
						int var48;
						if (var47) {
							var48 = var13.field1131;
						} else {
							var48 = var13.field1130;
						}

						CYPZUKMB var49;
						if (var48 == -1) {
							var49 = var13.method454(-1, -1, var47);
						} else {
							EHYLCNJX var50 = EHYLCNJX.field744[var48];
							var49 = var13.method454(var50.field747[var13.field1108], var50.field746[var13.field1108], var47);
						}

						if (var49 != null) {
							var49.method217(0, var13.field1134, 0, var13.field1133, 0, var45, var46);
						}

						CUNPUNFW.field511 = var43;
						CUNPUNFW.field512 = var44;
					} else {
						if (var13.field1101 == 7) {
							ZTYSAOXK var51 = var13.field1081;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1118; var53++) {
								for (int var54 = 0; var54 < var13.field1121; var54++) {
									if (var13.field1074[var52] > 0) {
										WGKWQDPM var55 = WGKWQDPM.method554(var13.field1074[var52] - 1);
										String var56 = var55.field1342;
										if (var55.field1343 || var13.field1078[var52] != 1) {
											var56 = var56 + " x" + method59(var13.field1078[var52]);
										}

										int var57 = (var13.field1127 + 115) * var54 + var11;
										int var58 = (var13.field1084 + 12) * var53 + var12;
										if (var13.field1070) {
											var51.method590(var13.field1109, var56, var13.field1077, var58, var13.field1121 / 2 + var57);
										} else {
											var51.method597(var13.field1077, var56, var13.field1109, var57, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1101 == 8 && (field433 == var13.field1125 || field303 == var13.field1125 || field296 == var13.field1125) && field111 == 100) {
							int var59 = 0;
							int var60 = 0;
							ZTYSAOXK var61 = field422;
							String var62 = var13.field1107;
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

								var60 += var61.field1513 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1121 + var11 - var59 - 5;
							int var67 = var13.field1118 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1121 + arg1) {
								var66 = arg2.field1121 + arg1 - var59;
							}

							if (var60 + var67 > arg2.field1118 + arg3) {
								var67 = arg2.field1118 + arg3 - var60;
							}

							GBJWVQAY.method289(var59, var66, 0xFFFFA0, var67, var60);
							GBJWVQAY.method290(var60, 0, var66, var59, var67);
							String var68 = var13.field1107;
							int var69 = var61.field1513 + var67 + 2;
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

								var61.method597(0, var71, false, var66 + 3, var69);
								var69 += var61.field1513 + 1;
							}
						}
					}
				}
			}

			GBJWVQAY.method286(var6, var5, var7, var8);
		}
	}

	public final void run() {
		if (field379) {
			method148();
		} else {
			super.run();
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method36(int arg0) {
		int var2 = LSIUBIYU.field895[arg0].field903;
		if (var2 != 0) {
			int var3 = field316[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					CUNPUNFW.method178(0.9D);
				}

				if (var3 == 2) {
					CUNPUNFW.method178(0.8D);
				}

				if (var3 == 3) {
					CUNPUNFW.method178(0.7D);
				}

				if (var3 == 4) {
					CUNPUNFW.method178(0.6D);
				}

				WGKWQDPM.field1323.method531();
				field70 = true;
			}

			if (var2 == 3) {
				boolean var4 = field404;

				if (var3 == 0) {
					method153(0, field404);
					field404 = true;
				}

				if (var3 == 1) {
					method153(-400, field404);
					field404 = true;
				}

				if (var3 == 2) {
					method153(-800, field404);
					field404 = true;
				}

				if (var3 == 3) {
					method153(-1200, field404);
					field404 = true;
				}

				if (var3 == 4) {
					field404 = false;
				}

				if (field404 != var4 && !field197) {
					if (field404) {
						field474 = field282;
						field475 = true;
						field77.method240(2, field474);
					} else {
						method106();
					}

					field276 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field350 = true;
					method88(0);
				}

				if (var3 == 1) {
					field350 = true;
					method88(-400);
				}

				if (var3 == 2) {
					field350 = true;
					method88(-800);
				}

				if (var3 == 3) {
					field350 = true;
					method88(-1200);
				}

				if (var3 == 4) {
					field350 = false;
				}
			}

			if (var2 == 5) {
				field329 = var3;
			}

			if (var2 == 6) {
				field171 = var3;
			}

			if (var2 == 8) {
				field76 = var3;
				field471 = true;
			}

			if (var2 == 9) {
				field354 = var3;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method37() {
		if (field182 > 0) {
			method72();
		} else {
			method73("Please wait - attempting to reestablish", "Connection lost");
			field467 = 0;
			field200 = 0;
			GBBCHPEB var1 = field285;
			field289 = false;
			field410 = 0;
			method25(field401, field402, true);

			if (!field289) {
				method72();
			}

			try {
				var1.method278();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field109.method586(arg0, arg1);
		field110.method586(arg0, arg1 + arg4 - 16);
		GBJWVQAY.method289(16, arg0, field198, arg1 + 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg2 - arg4);
		GBJWVQAY.method289(16, arg0, field68, arg1 + var7 + 16, var6);
		GBJWVQAY.method294(var6, arg1 + var7 + 16, arg0, field444);
		GBJWVQAY.method294(var6, arg1 + var7 + 16, arg0 + 1, field444);
		GBJWVQAY.method292(16, arg0, arg1 + var7 + 16, field444);
		GBJWVQAY.method292(16, arg0, arg1 + var7 + 17, field444);
		GBJWVQAY.method294(var6, arg1 + var7 + 16, arg0 + 15, field302);
		GBJWVQAY.method294(var6 - 1, arg1 + 17 + var7, arg0 + 14, field302);
		GBJWVQAY.method292(16, arg0, arg1 + var7 + var6 + 15, field302);
		GBJWVQAY.method292(15, arg0 + 1, arg1 + 14 + var7 + var6, field302);
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method39(boolean arg0) {
		if (field114.field977 >> 7 == field200 && field114.field978 >> 7 == field201) {
			field200 = 0;
		}

		int var2 = field187;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			SOKVSBIO var4;
			int var5;
			if (arg0) {
				var4 = field114;
				var5 = field185 << 14;
			} else {
				var4 = field186[field188[var3]];
				var5 = field188[var3] << 14;
			}

			if (var4 != null && var4.method429()) {
				var4.field1221 = false;
				if ((field197 && field187 > 50 || field187 > 200) && !arg0 && var4.field989 == var4.field1002) {
					var4.field1221 = true;
				}

				int var6 = var4.field977 >> 7;
				int var7 = var4.field978 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1226 == null || field155 < var4.field1231 || field155 >= var4.field1232) {
						if ((var4.field977 & 0x7F) == 0x40 && (var4.field978 & 0x7F) == 0x40) {
							if (field113[var6][var7] == field337) {
								continue;
							}

							field113[var6][var7] = field337;
						}

						var4.field1230 = method147(var4.field977, field199, var4.field978);
						field157.method482(var4, field199, var4.field1230, var4.field979, var5, var4.field977, 60, var4.field1005, var4.field978);
					} else {
						var4.field1221 = false;
						var4.field1230 = method147(var4.field977, field199, var4.field978);
						field157.method483(60, var4.field1239, var4.field977, var5, var4.field1230, field199, var4.field1238, var4, var4.field1241, var4.field978, var4.field979, var4.field1240);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = CYPZUKMB.field605[var7];
			int var13 = CYPZUKMB.field606[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = CYPZUKMB.field605[var8];
			int var16 = CYPZUKMB.field606[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field392 = arg0 - var9;
		field393 = arg4 - var10;
		field394 = arg5 - var11;
		field395 = arg3;
		field396 = arg1;
	}

	@ObfuscatedName("client.a(LNQXGETKS;II)V")
	public final void method41(NQXGETKS arg0, int arg1) {
		method42(arg0.field978, arg1, arg0.field977);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method42(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method147(arg2, field199, arg0) - arg1;
			arg2 -= field392;
			var4 -= field393;
			arg0 -= field394;
			int var5 = CYPZUKMB.field605[field395];
			int var6 = CYPZUKMB.field606[field395];
			int var7 = CYPZUKMB.field605[field396];
			int var8 = CYPZUKMB.field606[field396];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field160 = (var9 << 9) / arg0 + CUNPUNFW.field511;
				field161 = (var11 << 9) / arg0 + CUNPUNFW.field512;
			} else {
				field160 = -1;
				field161 = -1;
			}
		} else {
			field160 = -1;
			field161 = -1;
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method43(long arg0) {
		if (arg0 != 0L) {
			if (field357 >= 100 && field378 != 1) {
				method67("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field357 >= 200) {
				method67("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = OERTMYQW.method444(OERTMYQW.method441(arg0));
				for (int var4 = 0; var4 < field357; var4++) {
					if (field408[var4] == arg0) {
						method67(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field213; var5++) {
					if (field331[var5] == arg0) {
						method67("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field114.field1235)) {
					field215[field357] = var3;
					field408[field357] = arg0;
					field137[field357] = 0;
					field357++;
					field495 = true;
					field86.method358(252);
					field86.method365(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method44() {
		if (field467 == 0 && field717 == 1) {
			int var1 = field718 - 25 - 550;
			int var2 = field719 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field55 + field419 & 0x7FF;
				int var4 = CUNPUNFW.field515[var3];
				int var5 = CUNPUNFW.field516[var3];
				var4 = (field472 + 256) * var4 >> 8;
				var5 = (field472 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field114.field977 + var6 >> 7;
				int var9 = field114.field978 - var7 >> 7;
				boolean var10 = method76(field114.field975[0], 0, 0, 0, 0, 1, var9, true, field114.field976[0], 0, var8);
				if (var10) {
					field86.method359(var1);
					field86.method359(var2);
					field86.method360(field55);
					field86.method359(57);
					field86.method359(field419);
					field86.method359(field472);
					field86.method359(89);
					field86.method360(field114.field977);
					field86.method360(field114.field978);
					field86.method359(field75);
					field86.method359(63);
				}
			}

			field66++;
			if (field66 > 1719) {
				field66 = 0;
				field86.method358(13);
				field86.method359(0);
				int var11 = field86.field882;
				field86.method360(16649);
				field86.method360(22579);
				field86.method359((int) (Math.random() * 256.0D));
				field86.method360(18261);
				field86.method360(22681);

				if ((int) (Math.random() * 2.0D) == 0) {
					field86.method359(29);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field86.method359(167);
				}

				field86.method360(6244);

				if ((int) (Math.random() * 2.0D) == 0) {
					field86.method360(30915);
				}

				field86.method359(232);
				field86.method368(field86.field882 - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method45() {
		for (ADZOUCLA var1 = (ADZOUCLA) field325.method449(); var1 != null; var1 = (ADZOUCLA) field325.method451()) {
			if (field199 != var1.field18 || var1.field22) {
				var1.method464();
			} else if (field155 >= var1.field26) {
				var1.method1(field107);

				if (var1.field22) {
					var1.method464();
				} else {
					field157.method482(var1, var1.field18, var1.field21, 0, -1, var1.field19, 60, false, var1.field20);
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method46() {
		if (field717 == 1) {
			if (field718 >= 6 && field718 <= 106 && field719 >= 467 && field719 <= 499) {
				field211 = (field211 + 1) % 4;
				field128 = true;
				field471 = true;
				field86.method358(145);
				field86.method359(field211);
				field86.method359(field83);
				field86.method359(field72);
			}

			if (field718 >= 135 && field718 <= 235 && field719 >= 467 && field719 <= 499) {
				field83 = (field83 + 1) % 3;
				field128 = true;
				field471 = true;
				field86.method358(145);
				field86.method359(field211);
				field86.method359(field83);
				field86.method359(field72);
			}

			if (field718 >= 273 && field718 <= 373 && field719 >= 467 && field719 <= 499) {
				field72 = (field72 + 1) % 3;
				field128 = true;
				field471 = true;
				field86.method358(145);
				field86.method359(field211);
				field86.method359(field83);
				field86.method359(field72);
			}

			if (field718 >= 412 && field718 <= 512 && field719 >= 467 && field719 <= 499) {
				if (field484 == -1) {
					method14();
					field208 = "";
					field366 = false;
					field314 = field484 = PQPZKUPU.field1069;
					return;
				}

				method67("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method47() {
		int var1 = 3;
		if (field395 < 310) {
			int var2 = field392 >> 7;
			int var3 = field394 >> 7;
			int var4 = field114.field977 >> 7;
			int var5 = field114.field978 >> 7;

			if ((field139[field199][var2][var3] & 0x4) != 0) {
				var1 = field199;
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

					if ((field139[field199][var2][var3] & 0x4) != 0) {
						var1 = field199;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field139[field199][var2][var3] & 0x4) != 0) {
							var1 = field199;
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

					if ((field139[field199][var2][var3] & 0x4) != 0) {
						var1 = field199;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field139[field199][var2][var3] & 0x4) != 0) {
							var1 = field199;
						}
					}
				}
			}
		}

		if ((field139[field199][field114.field977 >> 7][field114.field978 >> 7] & 0x4) != 0) {
			var1 = field199;
		}

		return var1;
	}

	@ObfuscatedName("client.l(I)I")
	public final int method48() {
		int var1 = method147(field392, field199, field394);
		if (var1 - field393 < 800 && (field139[field199][field392 >> 7][field394 >> 7] & 0x4) != 0) {
			return field199;
		}

		return 3;
	}

	@ObfuscatedName("client.c(B)V")
	public static final void method49() {
		RHXAQRFP.field1151 = true;
		CUNPUNFW.field506 = true;
		field197 = true;
		EZVBBZYG.field767 = true;
		LXNLNZCU.field917 = true;
	}

	@ObfuscatedName("client.a(IIIILPQPZKUPU;III)V")
	public final void method50(int arg0, int arg1, int arg2, PQPZKUPU arg3, int arg4, int arg5, int arg6) {
		if (arg3.field1101 == 0 && arg3.field1073 != null && !arg3.field1128 && (arg2 >= arg4 && arg6 >= arg5 && arg2 <= arg3.field1121 + arg4 && arg6 <= arg3.field1118 + arg5)) {
			int var8 = arg3.field1073.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field1119[var9] + arg4;
				int var11 = arg3.field1122[var9] + arg5 - arg0;
				PQPZKUPU var12 = PQPZKUPU.method460(arg3.field1073[var9]);
				var10 += var12.field1105;
				var11 += var12.field1092;
				if ((var12.field1112 >= 0 || var12.field1071 != 0) && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
					if (var12.field1112 >= 0) {
						field455 = var12.field1112;
					} else {
						field455 = var12.field1125;
					}
				}

				if (var12.field1101 == 8 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
					field141 = var12.field1125;
				}

				if (var12.field1101 == 0) {
					method50(var12.field1126, arg1, arg2, var12, var10, var11, arg6);

					if (var12.field1100 > var12.field1118) {
						method124(arg6, arg2, var12, var12.field1100, var12.field1118, arg1, var12.field1121 + var10, var11);
					}
				} else {
					if (var12.field1135 == 1 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						boolean var13 = false;
						if (var12.field1067 != 0) {
							var13 = method100(var12);
						}

						if (!var13) {
							field399[field108] = var12.field1087;
							field232[field108] = 496;
							field231[field108] = var12.field1125;
							field108++;
						}
					}

					if (var12.field1135 == 2 && field167 == 0 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						String var14 = var12.field1080;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field399[field108] = var14 + " @gre@" + var12.field1063;
						field232[field108] = 619;
						field231[field108] = var12.field1125;
						field108++;
					}

					if (var12.field1135 == 3 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						field399[field108] = "Close";

						if (arg1 == 3) {
							field232[field108] = 895;
						} else {
							field232[field108] = 1;
						}

						field231[field108] = var12.field1125;
						field108++;
					}

					if (var12.field1135 == 4 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						field399[field108] = var12.field1087;
						field232[field108] = 652;
						field231[field108] = var12.field1125;
						field108++;
					}

					if (var12.field1135 == 5 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						field399[field108] = var12.field1087;
						field232[field108] = 915;
						field231[field108] = var12.field1125;
						field108++;
					}

					if (var12.field1135 == 6 && !field264 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1121 + var10 && arg6 < var12.field1118 + var11) {
						field399[field108] = var12.field1087;
						field232[field108] = 43;
						field231[field108] = var12.field1125;
						field108++;
					}

					if (var12.field1101 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1118; var16++) {
							for (int var17 = 0; var17 < var12.field1121; var17++) {
								int var18 = (var12.field1127 + 32) * var17 + var10;
								int var19 = (var12.field1084 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1116[var15];
									var19 += var12.field1129[var15];
								}

								if (arg2 >= var18 && arg6 >= var19 && arg2 < var18 + 32 && arg6 < var19 + 32) {
									field250 = var15;
									field251 = var12.field1125;

									if (var12.field1074[var15] > 0) {
										WGKWQDPM var20 = WGKWQDPM.method554(var12.field1074[var15] - 1);
										if (field162 == 1 && var12.field1104) {
											if (field164 != var12.field1125 || field163 != var15) {
												field399[field108] = "Use " + field166 + " with @lre@" + var20.field1342;
												field232[field108] = 402;
												field233[field108] = var20.field1307;
												field230[field108] = var15;
												field231[field108] = var12.field1125;
												field108++;
											}
										} else if (field167 != 1 || !var12.field1104) {
											if (var12.field1104) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1310 != null && var20.field1310[var21] != null) {
														field399[field108] = var20.field1310[var21] + " @lre@" + var20.field1342;

														if (var21 == 3) {
															field232[field108] = 273;
														}

														if (var21 == 4) {
															field232[field108] = 377;
														}

														field233[field108] = var20.field1307;
														field230[field108] = var15;
														field231[field108] = var12.field1125;
														field108++;
													} else if (var21 == 4) {
														field399[field108] = "Drop @lre@" + var20.field1342;
														field232[field108] = 377;
														field233[field108] = var20.field1307;
														field230[field108] = var15;
														field231[field108] = var12.field1125;
														field108++;
													}
												}
											}

											if (var12.field1098) {
												field399[field108] = "Use @lre@" + var20.field1342;
												field232[field108] = 138;
												field233[field108] = var20.field1307;
												field230[field108] = var15;
												field231[field108] = var12.field1125;
												field108++;
											}

											if (var12.field1104 && var20.field1310 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1310[var22] != null) {
														field399[field108] = var20.field1310[var22] + " @lre@" + var20.field1342;

														if (var22 == 0) {
															field232[field108] = 495;
														}

														if (var22 == 1) {
															field232[field108] = 220;
														}

														if (var22 == 2) {
															field232[field108] = 34;
														}

														field233[field108] = var20.field1307;
														field230[field108] = var15;
														field231[field108] = var12.field1125;
														field108++;
													}
												}
											}

											if (var12.field1068 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1068[var23] != null) {
														field399[field108] = var12.field1068[var23] + " @lre@" + var20.field1342;

														if (var23 == 0) {
															field232[field108] = 971;
														}

														if (var23 == 1) {
															field232[field108] = 364;
														}

														if (var23 == 2) {
															field232[field108] = 855;
														}

														if (var23 == 3) {
															field232[field108] = 817;
														}

														if (var23 == 4) {
															field232[field108] = 168;
														}

														field233[field108] = var20.field1307;
														field230[field108] = var15;
														field231[field108] = var12.field1125;
														field108++;
													}
												}
											}

											field399[field108] = "Examine @lre@" + var20.field1342;
											field232[field108] = 1759;
											field233[field108] = var20.field1307;
											field230[field108] = var15;
											field231[field108] = var12.field1125;
											field108++;
										} else if ((field169 & 0x10) == 0x10) {
											field399[field108] = field170 + " @lre@" + var20.field1342;
											field232[field108] = 987;
											field233[field108] = var20.field1307;
											field230[field108] = var15;
											field231[field108] = var12.field1125;
											field108++;
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

	public final void init() {
		field194 = Integer.parseInt(getParameter("nodeid"));
		field195 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method49();
		} else {
			method94();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field196 = false;
		} else {
			field196 = true;
		}

		method247(503, 765);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method51(int arg0, String arg1) {
		field73 = arg0;
		field272 = arg1;
		method28();

		if (field445 == null) {
			super.method51(arg0, arg1);
		} else {
			field219.method298();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field423.method589(0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			GBJWVQAY.method290(34, 0x8C1111, var3 / 2 - 152, 304, var6);
			GBJWVQAY.method290(32, 0, var3 / 2 - 151, 302, var6 + 1);
			GBJWVQAY.method289(arg0 * 3, var3 / 2 - 150, 0x8C1111, var6 + 2, 30);
			GBJWVQAY.method289(300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150), 0, var6 + 2, 30);
			field423.method589(0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5, arg1);
			field219.method299(field703, 202, 171);

			if (field70) {
				field70 = false;

				if (!field277) {
					field220.method299(field703, 0, 0);
					field221.method299(field703, 637, 0);
				}

				field217.method299(field703, 128, 0);
				field218.method299(field703, 202, 371);
				field222.method299(field703, 0, 265);
				field223.method299(field703, 562, 265);
				field224.method299(field703, 128, 171);
				field225.method299(field703, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method52() {
		field416.method298();
		CUNPUNFW.field517 = field459;
		field369.method586(0, 0);

		if (field64) {
			field423.method589(0, 239, 40, field275);
			field423.method589(128, 239, 60, field279 + "*");
		} else if (field58 == 1) {
			field423.method589(0, 239, 40, "Enter amount:");
			field423.method589(128, 239, 60, field390 + "*");
		} else if (field58 == 2) {
			field423.method589(0, 239, 40, "Enter name:");
			field423.method589(128, 239, 60, field390 + "*");
		} else if (field58 == 3) {
			if (field59 != field390) {
				method141(field390);
				field59 = field390;
			}

			ZTYSAOXK var1 = field422;
			GBJWVQAY.method286(0, 0, 463, 77);

			for (int var2 = 0; var2 < field60; var2++) {
				int var3 = var2 * 14 + 18 - field63;
				if (var3 > 0 && var3 < 110) {
					var1.method589(0, 239, var3, field61[var2]);
				}
			}

			GBJWVQAY.method285();

			if (field60 > 5) {
				method38(463, 0, field60 * 14 + 7, field63, 77);
			}

			if (field390.length() == 0) {
				field423.method589(255, 239, 40, "Enter object name");
			} else if (field60 == 0) {
				field423.method589(0, 239, 40, "No matching objects found, please shorten search");
			}

			var1.method589(0, 239, 90, field390 + "*");
			GBJWVQAY.method292(479, 0, 77, 0);
		} else if (field119 != null) {
			field423.method589(0, 239, 40, field119);
			field423.method589(128, 239, 60, "Click to continue");
		} else if (field330 != -1) {
			method35(0, 0, PQPZKUPU.method460(field330), 0);
		} else if (field126 == -1) {
			ZTYSAOXK var4 = field422;
			int var5 = 0;
			GBJWVQAY.method286(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field313[var6] != null) {
					int var7 = field311[var6];
					int var8 = field321 + 70 - var5 * 14;
					String var9 = field312[var6];
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
							var4.method593(field313[var6], var8, 4, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field211 == 0 || field211 == 1 && method12(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field318[0].method586(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field318[1].method586(var11, var8 - 12);
								var11 += 14;
							}

							var4.method593(var9 + ":", var8, var11, 0);
							var11 += var4.method591(var9) + 8;
							var4.method593(field313[var6], var8, var11, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field76 == 0 && (var7 == 7 || field83 == 0 || field83 == 1 && method12(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method593("From", var8, var12, 0);
							int var14 = var12 + var4.method591("From ");
							if (var10 == 1) {
								field318[0].method586(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field318[1].method586(var14, var8 - 12);
								var14 += 14;
							}

							var4.method593(var9 + ":", var8, var14, 0);
							var14 += var4.method591(var9) + 8;
							var4.method593(field313[var6], var8, var14, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field72 == 0 || field72 == 1 && method12(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(var9 + " " + field313[var6], var8, 4, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field76 == 0 && field83 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(field313[var6], var8, 4, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field76 == 0 && field83 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method593("To " + var9 + ":", var8, 4, 0);
							var4.method593(field313[var6], var8, var4.method591("To " + var9) + 12, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field72 == 0 || field72 == 1 && method12(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method593(var9 + " " + field313[var6], var8, 4, 0x7E3200);
						}

						var5++;
					}
				}
			}

			GBJWVQAY.method285();
			field322 = var5 * 14 + 7;
			if (field322 < 78) {
				field322 = 78;
			}

			method38(463, 0, field322, field322 - field321 - 77, 77);
			String var13;
			if (field114 == null || field114.field1235 == null) {
				var13 = OERTMYQW.method444(field401);
			} else {
				var13 = field114.field1235;
			}

			var4.method593(var13 + ":", 90, 4, 0);
			var4.method593(field363 + "*", 90, var4.method591(var13 + ": ") + 6, 255);
			GBJWVQAY.method292(479, 0, 77, 0);
		} else {
			method35(0, 0, PQPZKUPU.method460(field126), 0);
		}

		if (field451 && field144 == 2) {
			method143();
		}

		field416.method299(field703, 17, 357);
		field415.method298();
		CUNPUNFW.field517 = field461;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method53() {
		for (int var1 = -1; var1 < field187; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field185;
			} else {
				var2 = field188[var1];
			}

			SOKVSBIO var3 = field186[var2];
			if (var3 != null && var3.field993 > 0) {
				var3.field993--;
				if (var3.field993 == 0) {
					var3.field1006 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field309; var4++) {
			int var5 = field310[var4];
			SBPCMLRM var6 = field308[var5];
			if (var6 != null && var6.field993 > 0) {
				var6.field993--;
				if (var6.field993 == 0) {
					var6.field1006 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method54() {
		if (field362 > 1) {
			field362--;
		}

		if (field182 > 0) {
			field182--;
		}

		for (int var1 = 0; var1 < 5 && method83(); var1++) {
		}

		if (field289) {
			synchronized (field391.field790) {
				if (!field441) {
					field391.field787 = 0;
				} else if (field717 != 0 || field391.field787 >= 40) {
					field86.method358(212);
					field86.method359(0);
					int var3 = field86.field882;
					int var4 = 0;
					for (int var5 = 0; var5 < field391.field787 && var3 - field86.field882 < 240; var5++) {
						var4++;
						int var6 = field391.field785[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field391.field789[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field391.field785[var5] == -1 && field391.field789[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field192 != var7 || field193 != var6) {
							int var9 = var7 - field192;
							field192 = var7;
							int var10 = var6 - field193;
							field193 = var6;

							if (field446 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field86.method360((field446 << 12) + (var9 << 6) + var10);
								field446 = 0;
							} else if (field446 < 8) {
								field86.method362((field446 << 19) + var8 + 0x800000);
								field446 = 0;
							} else {
								field86.method363((field446 << 19) + var8 - 0x40000000);
								field446 = 0;
							}
						} else if (field446 < 2047) {
							field446++;
						}
					}

					field86.method368(field86.field882 - var3);

					if (var4 >= field391.field787) {
						field391.field787 = 0;
					} else {
						field391.field787 -= var4;
						for (int var11 = 0; var11 < field391.field787; var11++) {
							field391.field789[var11] = field391.field789[var4 + var11];
							field391.field785[var11] = field391.field785[var4 + var11];
						}
					}
				}
			}

			if (field717 != 0) {
				long var12 = (field720 - field281) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field281 = field720;
				int var14 = field719;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field718;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field717 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field86.method358(41);
				field86.method401((var17 << 19) + (var18 << 20) + var16);
			}

			if (field300 > 0) {
				field300--;
			}

			if (field721[1] == 1 || field721[2] == 1 || field721[3] == 1 || field721[4] == 1) {
				field301 = true;
			}

			if (field301 && field300 <= 0) {
				field300 = 20;
				field301 = false;
				field86.method358(81);
				field86.method392(field55);
				field86.method393(field54);
			}

			if (field708 && !field133) {
				field133 = true;
				field86.method358(46);
				field86.method359(1);
			}

			if (!field708 && field133) {
				field133 = false;
				field86.method358(46);
				field86.method359(0);
			}

			method89();
			method31();
			method79();
			field180++;
			if (field180 > 750) {
				method37();
			}

			method132();
			method17();
			method53();
			field107++;

			if (field81 != 0) {
				field80 += 20;
				if (field80 >= 400) {
					field81 = 0;
				}
			}

			if (field261 != 0) {
				field258++;
				if (field258 >= 15) {
					if (field261 == 2) {
						field495 = true;
					}

					if (field261 == 3) {
						field471 = true;
					}

					field261 = 0;
				}
			}

			if (field491 != 0) {
				field365++;

				if (field711 > field492 + 5 || field711 < field492 - 5 || field712 > field493 + 5 || field712 < field493 - 5) {
					field154 = true;
				}

				if (field710 == 0) {
					if (field491 == 2) {
						field495 = true;
					}

					if (field491 == 3) {
						field471 = true;
					}

					field491 = 0;

					if (field154 && field365 >= 5) {
						field251 = -1;
						method121();

						if (field489 == field251 && field490 != field250) {
							PQPZKUPU var19 = PQPZKUPU.method460(field489);
							byte var20 = 0;
							if (field354 == 1 && var19.field1067 == 206) {
								var20 = 1;
							}

							if (var19.field1074[field250] <= 0) {
								var20 = 0;
							}

							if (var19.field1113) {
								int var21 = field490;
								int var22 = field250;
								var19.field1074[var22] = var19.field1074[var21];
								var19.field1078[var22] = var19.field1078[var21];
								var19.field1074[var21] = -1;
								var19.field1078[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field490;
								int var24 = field250;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method459(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method459(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method459(field250, field490);
							}

							field86.method358(198);
							field86.method393(field489);
							field86.method385(var20);
							field86.method360(field250);
							field86.method360(field490);
						}
					} else if ((field329 == 1 || method114(field108 - 1)) && field108 > 2) {
						method56();
					} else if (field108 > 0) {
						method86(field108 - 1);
					}

					field258 = 10;
					field717 = 0;
				}
			}

			if (RHXAQRFP.field1185 != -1) {
				int var25 = RHXAQRFP.field1185;
				int var26 = RHXAQRFP.field1186;
				boolean var27 = method76(field114.field975[0], 0, 0, 0, 0, 0, var26, true, field114.field976[0], 0, var25);
				RHXAQRFP.field1185 = -1;

				if (var27) {
					field78 = field718;
					field79 = field719;
					field81 = 1;
					field80 = 0;
				}
			}

			if (field717 == 1 && field119 != null) {
				field119 = null;
				field471 = true;
				field717 = 0;
			}

			method134();

			if (field127 == -1) {
				method44();
				method34();
				method46();
			}

			if (field710 == 1 || field717 == 1) {
				field183++;
			}

			if (field433 == 0 && field303 == 0 && field296 == 0) {
				if (field111 > 0) {
					field111--;
				}
			} else if (field111 < 100) {
				field111++;
				if (field111 == 100) {
					if (field433 != 0) {
						field471 = true;
					}

					if (field303 != 0) {
						field495 = true;
					}
				}
			}

			if (field263 == 2) {
				method150();
			}

			if (field263 == 2 && field328) {
				method139();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field297[var28]++;
			}

			method135();
			field709++;
			if (field709 > 4500) {
				field182 = 250;
				field709 -= 500;
				field86.method358(51);
			}

			field432++;
			if (field432 > 500) {
				field432 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field105 += field106;
				}

				if ((var29 & 0x2) == 2) {
					field245 += field246;
				}

				if ((var29 & 0x4) == 4) {
					field234 += field235;
				}
			}

			if (field105 < -50) {
				field106 = 2;
			}

			if (field105 > 50) {
				field106 = -2;
			}

			if (field245 < -55) {
				field246 = 2;
			}

			if (field245 > 55) {
				field246 = -2;
			}

			if (field234 < -40) {
				field235 = 1;
			}

			if (field234 > 40) {
				field235 = -1;
			}

			field69++;
			if (field69 > 500) {
				field69 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field419 += field420;
				}

				if ((var30 & 0x2) == 2) {
					field472 += field473;
				}
			}

			if (field419 < -60) {
				field420 = 2;
			}

			if (field419 > 60) {
				field420 = -2;
			}

			if (field472 < -20) {
				field473 = 1;
			}

			if (field472 > 10) {
				field473 = -1;
			}

			field181++;
			if (field181 > 50) {
				field86.method358(100);
			}

			try {
				if (field285 != null && field86.field882 > 0) {
					field285.method282(0, field86.field881, field86.field882);
					field86.field882 = 0;
					field181 = 0;
				}
			} catch (IOException var32) {
				method37();
			} catch (Exception var33) {
				method72();
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method55() {
		try {
			field262 = -1;
			field325.method453();
			field290.method453();
			field267++;
			if (field267 > 62) {
				field267 = 0;
				field86.method358(69);
			}

			CUNPUNFW.method172();
			method69();
			field157.method471();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field463[var1].method157();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field139[var2][var3][var4] = 0;
					}
				}
			}

			EZVBBZYG var5 = new EZVBBZYG(field139, 104, field82, 104);
			int var6 = field340.length;
			field86.method358(100);

			if (!field278) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field464[var7] >> 8) * 64 - field150;
					int var9 = (field464[var7] & 0xFF) * 64 - field151;
					byte[] var10 = field340[var7];
					if (var10 != null) {
						var5.method272((field324 - 6) * 8, var9, field463, (field323 - 6) * 8, var8, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field464[var11] >> 8) * 64 - field150;
					int var13 = (field464[var11] & 0xFF) * 64 - field151;
					byte[] var14 = field340[var11];
					if (var14 == null && field324 < 800) {
						var5.method271(64, var12, 64, var13);
					}
				}

				field86.method358(100);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field434[var15];
					if (var16 != null) {
						int var17 = (field464[var15] >> 8) * 64 - field150;
						int var18 = (field464[var15] & 0xFF) * 64 - field151;
						var5.method268(var17, var18, field157, var16, field463);
					}
				}
			}

			if (field278) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field443[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field464.length; var29++) {
									if (field464[var29] == var28 && field340[var29] != null) {
										var5.method259((var27 & 0x7) * 8, field463, field340[var29], (var26 & 0x7) * 8, var24, var21 * 8, var25, var19, var20 * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method261(var19, var21 * 8, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field443[0][var30][var31];
						if (var32 == -1) {
							var5.method271(8, var30 * 8, 8, var31 * 8);
						}
					}
				}

				field86.method358(100);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field443[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field464.length; var42++) {
									if (field464[var42] == var41 && field434[var42] != null) {
										var5.method255(field463, var34 * 8, (var39 & 0x7) * 8, var35 * 8, var37, var33, var38, field434[var42], field157, (var40 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field86.method358(100);
			var5.method273(field157, field463);

			if (field415 != null) {
				field415.method298();
				CUNPUNFW.field517 = field461;
			}

			field86.method358(100);
			int var43 = EZVBBZYG.field781;
			if (var43 > field199) {
				var43 = field199;
			}

			if (var43 < field199 - 1) {
				int var44 = field199 - 1;
			}

			if (field197) {
				field157.method472(EZVBBZYG.field781);
			} else {
				field157.method472(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method118(var45, var46);
				}
			}

			method108();
		} catch (Exception var59) {
		}

		LXNLNZCU.field953.method531();

		if (field706 != null) {
			field86.method358(164);
			field86.method363(1057001181);
		}

		if (field197 && signlink.cache_dat != null) {
			int var48 = field77.method235(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field77.method229(var49);
				if ((var50 & 0x79) == 0) {
					CYPZUKMB.method195(var49);
				}
			}
		}

		System.gc();
		CUNPUNFW.method173(20);
		field77.method234();
		int var51 = (field323 - 6) / 8 - 1;
		int var52 = (field323 + 6) / 8 + 1;
		int var53 = (field324 - 6) / 8 - 1;
		int var54 = (field324 + 6) / 8 + 1;
		if (field438) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field77.method236(var56, 0, var55);
					if (var57 != -1) {
						field77.method228(var57, 3);
					}

					int var58 = field77.method236(var56, 1, var55);
					if (var58 != -1) {
						field77.method228(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method56() {
		int var1 = field423.method591("Choose Option");
		for (int var2 = 0; var2 < field108; var2++) {
			int var3 = field423.method591(field399[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field108 * 15 + 21;
		if (field718 > 4 && field719 > 4 && field718 < 516 && field719 < 338) {
			int var5 = field718 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field719 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field451 = true;
			field144 = 0;
			field145 = var5;
			field146 = var6;
			field147 = var1;
			field148 = field108 * 15 + 22;
		}

		if (field718 > 553 && field719 > 205 && field718 < 743 && field719 < 466) {
			int var7 = field718 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field719 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field451 = true;
			field144 = 1;
			field145 = var7;
			field146 = var8;
			field147 = var1;
			field148 = field108 * 15 + 22;
		}

		if (field718 > 17 && field719 > 357 && field718 < 496 && field719 < 453) {
			int var9 = field718 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field719 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field451 = true;
			field144 = 2;
			field145 = var9;
			field146 = var10;
			field147 = var1;
			field148 = field108 * 15 + 22;
		}
	}

	@ObfuscatedName("client.d(B)Ljava/lang/String;")
	public final String method57() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field706 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method58(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method58(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method59(int arg0) {
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

	@ObfuscatedName("client.d(I)V")
	public final void method60() {
		field70 = true;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method61() {
		if (field76 != 0) {
			ZTYSAOXK var1 = field422;
			int var2 = 0;
			if (field362 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field313[var3] != null) {
					int var4 = field311[var3];
					String var5 = field312[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field83 == 0 || field83 == 1 && method12(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method593("From", var7, var8, 0);
						var1.method593("From", var7 - 1, var8, 0xFFFF);
						int var11 = var8 + var1.method591("From ");
						if (var6 == 1) {
							field318[0].method586(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field318[1].method586(var11, var7 - 12);
							var11 += 14;
						}

						var1.method593(var5 + ": " + field313[var3], var7, var11, 0);
						var1.method593(var5 + ": " + field313[var3], var7 - 1, var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field83 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method593(field313[var3], var9, 4, 0);
						var1.method593(field313[var3], var9 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field83 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method593("To " + var5 + ": " + field313[var3], var10, 4, 0);
						var1.method593("To " + var5 + ": " + field313[var3], var10 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method62() {
		Graphics var1 = method65().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method249(1);

		if (field149) {
			field277 = false;
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

		if (field269) {
			field277 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field176) {
			field277 = false;
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

	@ObfuscatedName("client.a(IZ)V")
	public final void method63(int arg0) {
		int[] var2 = field202.field1293;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field139[arg0][var7][var5] & 0x18) == 0) {
					field157.method506(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field139[arg0 + 1][var7][var5] & 0x8) != 0) {
					field157.method506(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field202.method536();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field139[arg0][var11][var10] & 0x18) == 0) {
					method144(arg0, var8, var11, var9, var10);
				}

				if (arg0 < 3 && (field139[arg0 + 1][var11][var10] & 0x8) != 0) {
					method144(arg0 + 1, var8, var11, var9, var10);
				}
			}
		}

		if (field415 != null) {
			field415.method298();
			CUNPUNFW.field517 = field461;
		}

		field480 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field157.method500(field199, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LXNLNZCU.method409(var14).field920;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field463[field199].field505;
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

						field417[field480] = field138[var15];
						field481[field480] = var16;
						field482[field480] = var17;
						field480++;
					}
				}
			}
		}

		field306++;
		if (field306 > 1809) {
			field306 = 0;
			field86.method358(84);
			field86.method359(0);
			int var23 = field86.field882;
			field86.method360(62257);

			if ((int) (Math.random() * 2.0D) == 0) {
				field86.method359(110);
			}

			field86.method360(43331);
			field86.method360((int) (Math.random() * 65536.0D));
			field86.method360(25179);
			field86.method360((int) (Math.random() * 65536.0D));
			field86.method359((int) (Math.random() * 256.0D));
			field86.method360((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field86.method360(9644);
			}

			field86.method360((int) (Math.random() * 65536.0D));
			field86.method368(field86.field882 - var23);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public void method64() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field283);

		if (field77 != null) {
			System.out.println("Od-cycle:" + field77.field667);
		}

		System.out.println("loop-cycle:" + field155);
		System.out.println("draw-cycle:" + field439);
		System.out.println("ptype:" + field179);
		System.out.println("psize:" + field178);

		if (field285 != null) {
			field285.method283();
		}

		field700 = true;
	}

	@ObfuscatedName("client.c(Z)Ljava/awt/Component;")
	public final Component method65() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field706 != null) {
			return field706;
		}

		return this;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method66() {
		if (field162 == 0 && field167 == 0) {
			field399[field108] = "Walk here";
			field232[field108] = 158;
			field230[field108] = field711;
			field231[field108] = field712;
			field108++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < CYPZUKMB.field603; var2++) {
			int var3 = CYPZUKMB.field604[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field157.method501(field199, var4, var5, var3) >= 0) {
					LXNLNZCU var8 = LXNLNZCU.method409(var7);
					if (var8.field927 != null) {
						var8 = var8.method412();
					}

					if (var8 == null) {
						continue;
					}

					if (field162 == 1) {
						field399[field108] = "Use " + field166 + " with @cya@" + var8.field938;
						field232[field108] = 37;
						field233[field108] = var3;
						field230[field108] = var4;
						field231[field108] = var5;
						field108++;
					} else if (field167 != 1) {
						if (var8.field945 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field945[var9] != null) {
									field399[field108] = var8.field945[var9] + " @cya@" + var8.field938;

									if (var9 == 0) {
										field232[field108] = 649;
									}

									if (var9 == 1) {
										field232[field108] = 912;
									}

									if (var9 == 2) {
										field232[field108] = 224;
									}

									if (var9 == 3) {
										field232[field108] = 213;
									}

									if (var9 == 4) {
										field232[field108] = 1161;
									}

									field233[field108] = var3;
									field230[field108] = var4;
									field231[field108] = var5;
									field108++;
								}
							}
						}

						field399[field108] = "Examine @cya@" + var8.field938;
						field232[field108] = 1509;
						field233[field108] = var8.field913 << 14;
						field230[field108] = var4;
						field231[field108] = var5;
						field108++;
					} else if ((field169 & 0x4) == 4) {
						field399[field108] = field170 + " @cya@" + var8.field938;
						field232[field108] = 894;
						field233[field108] = var3;
						field230[field108] = var4;
						field231[field108] = var5;
						field108++;
					}
				}

				if (var6 == 1) {
					SBPCMLRM var10 = field308[var7];
					if (var10.field1214.field1392 == 1 && (var10.field977 & 0x7F) == 0x40 && (var10.field978 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field309; var11++) {
							SBPCMLRM var12 = field308[field310[var11]];
							if (var12 != null && var10 != var12 && var12.field1214.field1392 == 1 && var10.field977 == var12.field977 && var10.field978 == var12.field978) {
								method142(field310[var11], var12.field1214, var4, var5);
							}
						}

						for (int var13 = 0; var13 < field187; var13++) {
							SOKVSBIO var14 = field186[field188[var13]];
							if (var14 != null && var10.field977 == var14.field977 && var10.field978 == var14.field978) {
								method95(var14, var4, var5, field188[var13]);
							}
						}
					}

					method142(var7, var10.field1214, var4, var5);
				}

				if (var6 == 0) {
					SOKVSBIO var15 = field186[var7];
					if ((var15.field977 & 0x7F) == 0x40 && (var15.field978 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field309; var16++) {
							SBPCMLRM var17 = field308[field310[var16]];
							if (var17 != null && var17.field1214.field1392 == 1 && var15.field977 == var17.field977 && var15.field978 == var17.field978) {
								method142(field310[var16], var17.field1214, var4, var5);
							}
						}

						for (int var18 = 0; var18 < field187; var18++) {
							SOKVSBIO var19 = field186[field188[var18]];
							if (var19 != null && var15 != var19 && var15.field977 == var19.field977 && var15.field978 == var19.field978) {
								method95(var19, var4, var5, field188[var18]);
							}
						}
					}

					method95(var15, var4, var5, var7);
				}

				if (var6 == 3) {
					PACANLMY var20 = field212[field199][var4][var5];
					if (var20 != null) {
						for (SXUWJAYK var21 = (SXUWJAYK) var20.method450(); var21 != null; var21 = (SXUWJAYK) var20.method452()) {
							WGKWQDPM var22 = WGKWQDPM.method554(var21.field1244);
							if (field162 == 1) {
								field399[field108] = "Use " + field166 + " with @lre@" + var22.field1342;
								field232[field108] = 989;
								field233[field108] = var21.field1244;
								field230[field108] = var4;
								field231[field108] = var5;
								field108++;
							} else if (field167 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1328 != null && var22.field1328[var23] != null) {
										field399[field108] = var22.field1328[var23] + " @lre@" + var22.field1342;

										if (var23 == 0) {
											field232[field108] = 48;
										}

										if (var23 == 1) {
											field232[field108] = 357;
										}

										if (var23 == 2) {
											field232[field108] = 368;
										}

										if (var23 == 3) {
											field232[field108] = 670;
										}

										if (var23 == 4) {
											field232[field108] = 972;
										}

										field233[field108] = var21.field1244;
										field230[field108] = var4;
										field231[field108] = var5;
										field108++;
									} else if (var23 == 2) {
										field399[field108] = "Take @lre@" + var22.field1342;
										field232[field108] = 368;
										field233[field108] = var21.field1244;
										field230[field108] = var4;
										field231[field108] = var5;
										field108++;
									}
								}

								field399[field108] = "Examine @lre@" + var22.field1342;
								field232[field108] = 1876;
								field233[field108] = var21.field1244;
								field230[field108] = var4;
								field231[field108] = var5;
								field108++;
							} else if ((field169 & 0x1) == 1) {
								field399[field108] = field170 + " @lre@" + var22.field1342;
								field232[field108] = 924;
								field233[field108] = var21.field1244;
								field230[field108] = var4;
								field231[field108] = var5;
								field108++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method67(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field126 != -1) {
			field119 = arg0;
			field717 = 0;
		}

		if (field330 == -1) {
			field471 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field311[var4] = field311[var4 - 1];
			field312[var4] = field312[var4 - 1];
			field313[var4] = field313[var4 - 1];
		}

		field311[0] = arg2;
		field312[0] = arg1;
		field313[0] = arg0;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method68() {
		byte[] var1 = field445.method277("title.dat", null);
		VZJVQLEE var2 = new VZJVQLEE(var1, this);
		field220.method298();
		var2.method539(0, 0);
		field221.method298();
		var2.method539(-637, 0);
		field217.method298();
		var2.method539(-128, 0);
		field218.method298();
		var2.method539(-202, -371);
		field219.method298();
		var2.method539(-202, -171);
		field222.method298();
		var2.method539(0, -265);
		field223.method298();
		var2.method539(-562, -265);
		field224.method298();
		var2.method539(-128, -171);
		field225.method298();
		var2.method539(-562, -171);
		int[] var3 = new int[var2.field1294];
		for (int var4 = 0; var4 < var2.field1295; var4++) {
			for (int var5 = 0; var5 < var2.field1294; var5++) {
				var3[var5] = var2.field1293[var2.field1294 * var4 + var2.field1294 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1294; var6++) {
				var2.field1293[var2.field1294 * var4 + var6] = var3[var6];
			}
		}

		field220.method298();
		var2.method539(382, 0);
		field221.method298();
		var2.method539(-255, 0);
		field217.method298();
		var2.method539(254, 0);
		field218.method298();
		var2.method539(180, -371);
		field219.method298();
		var2.method539(180, -171);
		field222.method298();
		var2.method539(382, -265);
		field223.method298();
		var2.method539(-180, -265);
		field224.method298();
		var2.method539(254, -171);
		field225.method298();
		var2.method539(-180, -171);
		VZJVQLEE var7 = new VZJVQLEE(field445, "logo", 0);
		field217.method298();
		var7.method541(382 - var7.field1294 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.e(B)V")
	public final void method69() {
		LXNLNZCU.field953.method531();
		LXNLNZCU.field948.method531();
		YGGALXYD.field1376.method531();
		WGKWQDPM.field1314.method531();
		WGKWQDPM.field1323.method531();
		SOKVSBIO.field1227.method531();
		BZLQCUPI.field53.method531();
	}

	@ObfuscatedName("client.a(LPQPZKUPU;I)Z")
	public final boolean method70(PQPZKUPU arg0) {
		int var2 = arg0.field1067;
		if (field358 == 2) {
			if (var2 == 201) {
				field471 = true;
				field58 = 0;
				field64 = true;
				field279 = "";
				field364 = 1;
				field275 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field471 = true;
				field58 = 0;
				field64 = true;
				field279 = "";
				field364 = 2;
				field275 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field182 = 250;
			return true;
		}

		if (var2 == 501) {
			field471 = true;
			field58 = 0;
			field64 = true;
			field279 = "";
			field364 = 4;
			field275 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field471 = true;
			field58 = 0;
			field64 = true;
			field279 = "";
			field364 = 5;
			field275 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field361[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = CWNXCHDT.field529 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= CWNXCHDT.field529) {
							var5 = 0;
						}
					}

					if (!CWNXCHDT.field530[var5].field536 && CWNXCHDT.field530[var5].field531 == var3 + (field351 ? 0 : 7)) {
						break;
					}
				}

				field361[var3] = var5;
				field304 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field425[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field135[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field135[var6].length) {
					var8 = 0;
				}
			}

			field425[var6] = var8;
			field304 = true;
		}

		if (var2 == 324 && !field351) {
			field351 = true;
			method87();
		}

		if (var2 == 325 && field351) {
			field351 = false;
			method87();
		}

		if (var2 == 326) {
			field86.method358(6);
			field86.method359(field351 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field86.method359(field361[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field86.method359(field425[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field366 = !field366;
		}

		if (var2 >= 601 && var2 <= 613) {
			method14();

			if (field208.length() > 0) {
				field86.method358(111);
				field86.method365(OERTMYQW.method440(field208));
				field86.method359(var2 - 601);
				field86.method359(field366 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method71() {
		method61();

		if (field81 == 1) {
			field280[field80 / 100].method541(field78 - 8 - 4, field79 - 8 - 4);
			field240++;
			if (field240 > 1080) {
				field240 = 0;
				field86.method358(87);
				field86.method359(0);
				int var1 = field86.field882;
				field86.method360((int) (Math.random() * 65536.0D));
				field86.method360(32682);
				field86.method359((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field86.method360(12504);
				}

				field86.method360(3838);
				field86.method360(9810);
				field86.method360(62194);
				field86.method359((int) (Math.random() * 256.0D));
				field86.method359(58);

				if ((int) (Math.random() * 2.0D) == 0) {
					field86.method360(63841);
				}

				field86.method368(field86.field882 - var1);
			}
		}

		if (field81 == 2) {
			field280[field80 / 100 + 4].method541(field78 - 8 - 4, field79 - 8 - 4);
		}

		if (field356 != -1) {
			method27(field356, field107);
			method35(0, 0, PQPZKUPU.method460(field356), 0);
		}

		if (field484 != -1) {
			method27(field484, field107);
			method35(0, 0, PQPZKUPU.method460(field484), 0);
		}

		method26();

		if (!field451) {
			method121();
			method138();
		} else if (field144 == 0) {
			method143();
		}

		if (field159 == 1) {
			field242.method541(472, 296);
		}

		if (field268) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field699 < 30 && field197) {
				var4 = 0xFF0000;
			}

			if (field699 < 20 && !field197) {
				var4 = 0xFF0000;
			}

			field422.method588(var3, var2, var4, "Fps:" + field699);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field197) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field197) {
				int var9 = 0xFF0000;
			}

			field422.method588(var3, var2, 0xFFFF00, "Mem:" + var6 + "k");
			var3 += 15;
		}

		if (field362 != 0) {
			int var10 = field362 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field422.method593("System update in: " + var11 + ":0" + var10, 329, 4, 0xFFFF00);
			} else {
				field422.method593("System update in: " + var11 + ":" + var10, 329, 4, 0xFFFF00);
			}

			field494++;
			if (field494 > 154) {
				field494 = 0;
				field86.method358(215);
				field86.method360(2407);
				return;
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method72() {
		try {
			if (field285 != null) {
				field285.method278();
			}
		} catch (Exception var2) {
		}

		field285 = null;
		field289 = false;
		field207 = 0;
		field401 = "";
		field402 = "";
		method69();
		field157.method471();

		for (int var1 = 0; var1 < 4; var1++) {
			field463[var1].method157();
		}

		System.gc();
		method106();
		field282 = -1;
		field474 = -1;
		field276 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method73(String arg0, String arg1) {
		if (field415 != null) {
			field415.method298();
			CUNPUNFW.field517 = field461;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field422.method589(0, 257, var3, arg1);
			field422.method589(0xFFFFFF, 256, var3 - 1, arg1);
			var3 += 15;
			if (arg0 != null) {
				field422.method589(0, 257, var3, arg0);
				field422.method589(0xFFFFFF, 256, var3 - 1, arg0);
			}

			field415.method299(field703, 4, 4);
		} else if (field704 != null) {
			field704.method298();
			CUNPUNFW.field517 = field462;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			GBJWVQAY.method289(var5, 383 - var5 / 2, 0, var4 - var6 / 2 - 5, var6);
			GBJWVQAY.method290(var6, 0xFFFFFF, 383 - var5 / 2, var5, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field422.method589(0, 383, var4, arg1);
			field422.method589(0xFFFFFF, 382, var4 - 1, arg1);
			var4 += 15;
			if (arg0 != null) {
				field422.method589(0, 383, var4, arg0);
				field422.method589(0xFFFFFF, 382, var4 - 1, arg0);
			}

			field704.method299(field703, 0, 0);
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method74() {
		for (ODNHGUWK var1 = (ODNHGUWK) field290.method449(); var1 != null; var1 = (ODNHGUWK) field290.method451()) {
			if (field199 != var1.field1046 || field155 > var1.field1048) {
				var1.method464();
			} else if (field155 >= var1.field1047) {
				if (var1.field1051 > 0) {
					SBPCMLRM var2 = field308[var1.field1051 - 1];
					if (var2 != null && var2.field977 >= 0 && var2.field977 < 13312 && var2.field978 >= 0 && var2.field978 < 13312) {
						var1.method438(var2.field978, var2.field977, method147(var2.field977, var1.field1046, var2.field978) - var1.field1041, field155);
					}
				}

				if (var1.field1051 < 0) {
					int var3 = -var1.field1051 - 1;
					SOKVSBIO var4;
					if (field405 == var3) {
						var4 = field114;
					} else {
						var4 = field186[var3];
					}

					if (var4 != null && var4.field977 >= 0 && var4.field977 < 13312 && var4.field978 >= 0 && var4.field978 < 13312) {
						var1.method438(var4.field978, var4.field977, method147(var4.field977, var1.field1046, var4.field978) - var1.field1041, field155);
					}
				}

				var1.method439(field107);
				field157.method482(var1, field199, (int) var1.field1032, var1.field1043, -1, (int) var1.field1030, 60, false, (int) var1.field1031);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		FIMQRVPL var10 = null;
		for (FIMQRVPL var11 = (FIMQRVPL) field71.method449(); var11 != null; var11 = (FIMQRVPL) field71.method451()) {
			if (var11.field795 == arg5 && var11.field797 == arg1 && var11.field798 == arg0 && var11.field796 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new FIMQRVPL();
			var10.field795 = arg5;
			var10.field796 = arg8;
			var10.field797 = arg1;
			var10.field798 = arg0;
			method137(var10);
			field71.method446(var10);
		}

		var10.field799 = arg3;
		var10.field801 = arg2;
		var10.field800 = arg6;
		var10.field802 = arg7;
		var10.field791 = arg4;
	}

	@ObfuscatedName("client.a(IBIIIIIIZIII)Z")
	public final boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field333[var14][var15] = 0;
				field177[var14][var15] = 99999999;
			}
		}

		int var16 = arg0;
		int var17 = arg8;
		field333[arg0][arg8] = 99;
		field177[arg0][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field294[var18] = arg0;
		int var35 = var18 + 1;
		field295[var18] = arg8;
		boolean var20 = false;
		int var21 = field294.length;
		int[][] var22 = field463[field199].field505;
		while (var35 != var19) {
			var16 = field294[var19];
			var17 = field295[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg6 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field463[field199].method166(arg6, arg1, var16, var17, arg10, arg3 - 1)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field463[field199].method167(var16, arg1, arg6, arg3 - 1, arg10, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg2 != 0 && field463[field199].method168(var17, var16, arg6, arg10, arg4, arg9, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field177[var16][var17] + 1;
			if (var16 > 0 && field333[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field294[var35] = var16 - 1;
				field295[var35] = var17;
				var35 = (var35 + 1) % var21;
				field333[var16 - 1][var17] = 2;
				field177[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field333[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field294[var35] = var16 + 1;
				field295[var35] = var17;
				var35 = (var35 + 1) % var21;
				field333[var16 + 1][var17] = 8;
				field177[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field333[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field294[var35] = var16;
				field295[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field333[var16][var17 - 1] = 1;
				field177[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field333[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field294[var35] = var16;
				field295[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field333[var16][var17 + 1] = 4;
				field177[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field333[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field294[var35] = var16 - 1;
				field295[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field333[var16 - 1][var17 - 1] = 3;
				field177[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field333[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field294[var35] = var16 + 1;
				field295[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field333[var16 + 1][var17 - 1] = 9;
				field177[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field333[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field294[var35] = var16 - 1;
				field295[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field333[var16 - 1][var17 + 1] = 6;
				field177[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field333[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field294[var35] = var16 + 1;
				field295[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field333[var16 + 1][var17 + 1] = 12;
				field177[var16 + 1][var17 + 1] = var23;
			}
		}

		field75 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg10 - var25; var26 <= arg10 + var25; var26++) {
						for (int var27 = arg6 - var25; var27 <= arg6 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field177[var26][var27] < var24) {
								var24 = field177[var26][var27];
								var16 = var26;
								var17 = var27;
								field75 = 1;
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
		field294[var28] = var16;
		int var36 = var28 + 1;
		field295[var28] = var17;
		int var29;
		int var30 = var29 = field333[var16][var17];
		while (arg0 != var16 || arg8 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field294[var36] = var16;
				field295[var36++] = var17;
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

			var30 = field333[var16][var17];
		}

		if (var36 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field294[var36];
		int var33 = field295[var36];

		if (arg5 == 0) {
			field86.method358(108);
			field86.method359(var31 + var31 + 3);
		}

		if (arg5 == 1) {
			field86.method358(131);
			field86.method359(var31 + var31 + 3 + 14);
		}

		if (arg5 == 2) {
			field86.method358(61);
			field86.method359(var31 + var31 + 3);
		}

		field86.method359(field721[5] == 1 ? 1 : 0);
		field200 = field294[0];
		field201 = field295[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field86.method359(field294[var36] - var32);
			field86.method385(field295[var36] - var33);
		}

		field86.method393(field151 + var33);
		field86.method393(field150 + var32);
		return true;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method77() {
		if (field704 == null) {
			method11();
			field217 = null;
			field218 = null;
			field219 = null;
			field220 = null;
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field416 = null;
			field414 = null;
			field413 = null;
			field415 = null;
			field447 = null;
			field448 = null;
			field449 = null;
			field704 = new HURULSIZ(503, 765, method65());
			field70 = true;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method78() {
		field95 = 0;
		for (int var1 = -1; var1 < field309 + field187; var1++) {
			NQXGETKS var2;
			if (var1 == -1) {
				var2 = field114;
			} else if (var1 < field187) {
				var2 = field186[field188[var1]];
			} else {
				var2 = field308[field310[var1 - field187]];
			}

			if (var2 != null && var2.method429()) {
				if (var2 instanceof SBPCMLRM) {
					YGGALXYD var3 = ((SBPCMLRM) var2).field1214;
					if (var3.field1382 != null) {
						var3 = var3.method572();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field187) {
					YGGALXYD var6 = ((SBPCMLRM) var2).field1214;
					if (var6.field1365 >= 0 && var6.field1365 < field216.length) {
						method41(var2, var2.field994 + 15);

						if (field160 > -1) {
							field216[var6.field1365].method541(field160 - 12, field161 - 30);
						}
					}

					if (field239 == 1 && field310[var1 - field187] == field205 && field155 % 20 < 10) {
						method41(var2, var2.field994 + 15);

						if (field160 > -1) {
							field320[0].method541(field160 - 12, field161 - 28);
						}
					}
				} else {
					int var4 = 30;
					SOKVSBIO var5 = (SOKVSBIO) var2;
					if (var5.field1243 != -1 || var5.field1228 != -1) {
						method41(var2, var2.field994 + 15);

						if (field160 > -1) {
							if (var5.field1243 != -1) {
								field84[var5.field1243].method541(field160 - 12, field161 - var4);
								var4 += 25;
							}

							if (var5.field1228 != -1) {
								field216[var5.field1228].method541(field160 - 12, field161 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field239 == 10 && field188[var1] == field116) {
						method41(var2, var2.field994 + 15);

						if (field160 > -1) {
							field320[1].method541(field160 - 12, field161 - var4);
						}
					}
				}

				if (var2.field1006 != null && (var1 >= field187 || field211 == 0 || field211 == 3 || field211 == 1 && method12(((SOKVSBIO) var2).field1235))) {
					method41(var2, var2.field994);

					if (field160 > -1 && field95 < field96) {
						field100[field95] = field423.method592(var2.field1006) / 2;
						field99[field95] = field423.field1513;
						field97[field95] = field160;
						field98[field95] = field161;
						field101[field95] = var2.field997;
						field102[field95] = var2.field974;
						field103[field95] = var2.field993;
						field104[field95++] = var2.field1006;

						if (field171 == 0 && var2.field974 >= 1 && var2.field974 <= 3) {
							field99[field95] += 10;
							field98[field95] += 5;
						}

						if (field171 == 0 && var2.field974 == 4) {
							field100[field95] = 60;
						}

						if (field171 == 0 && var2.field974 == 5) {
							field99[field95] += 5;
						}
					}
				}

				if (var2.field1020 > field155) {
					method41(var2, var2.field994 + 15);

					if (field160 > -1) {
						int var7 = var2.field1021 * 30 / var2.field1022;
						if (var7 > 30) {
							var7 = 30;
						}

						GBJWVQAY.method289(var7, field160 - 15, 0xFF00, field161 - 3, 5);
						GBJWVQAY.method289(30 - var7, field160 - 15 + var7, 0xFF0000, field161 - 3, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field987[var8] > field155) {
						method41(var2, var2.field994 / 2);

						if (field160 > -1) {
							if (var8 == 1) {
								field161 -= 20;
							}

							if (var8 == 2) {
								field160 -= 15;
								field161 -= 10;
							}

							if (var8 == 3) {
								field160 += 15;
								field161 -= 10;
							}

							field486[var2.field986[var8]].method541(field160 - 12, field161 - 12);
							field421.method589(0, field160, field161 + 4, String.valueOf(var2.field985[var8]));
							field421.method589(0xFFFFFF, field160 - 1, field161 + 3, String.valueOf(var2.field985[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field95; var9++) {
			int var10 = field97[var9];
			int var11 = field98[var9];
			int var12 = field100[var9];
			int var13 = field99[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field98[var15] - field99[var15] && var11 - var13 < field98[var15] + 2 && var10 - var12 < field97[var15] + field100[var15] && var10 + var12 > field97[var15] - field100[var15] && field98[var15] - field99[var15] < var11) {
						var11 = field98[var15] - field99[var15];
						var14 = true;
					}
				}
			}

			field160 = field97[var9];
			field161 = field98[var9] = var11;
			String var16 = field104[var9];
			if (field171 == 0) {
				int var17 = 0xFFFF00;
				if (field101[var9] < 6) {
					var17 = field360[field101[var9]];
				}

				if (field101[var9] == 6) {
					var17 = field337 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field101[var9] == 7) {
					var17 = field337 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field101[var9] == 8) {
					var17 = field337 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field101[var9] == 9) {
					int var18 = 150 - field103[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field101[var9] == 10) {
					int var19 = 150 - field103[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field101[var9] == 11) {
					int var20 = 150 - field103[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field102[var9] == 0) {
					field423.method589(0, field160, field161 + 1, var16);
					field423.method589(var17, field160, field161, var16);
				}

				if (field102[var9] == 1) {
					field423.method594(var16, field160, field337, field161 + 1, 0);
					field423.method594(var16, field160, field337, field161, var17);
				}

				if (field102[var9] == 2) {
					field423.method595(var16, field337, 0, field160, field161 + 1);
					field423.method595(var16, field337, var17, field160, field161);
				}

				if (field102[var9] == 3) {
					field423.method596(var16, field161 + 1, 150 - field103[var9], field160, 0, field337);
					field423.method596(var16, field161, 150 - field103[var9], field160, var17, field337);
				}

				if (field102[var9] == 4) {
					int var21 = field423.method592(var16);
					int var22 = (150 - field103[var9]) * (var21 + 100) / 150;
					GBJWVQAY.method286(0, field160 - 50, field160 + 50, 334);
					field423.method593(var16, field161 + 1, field160 + 50 - var22, 0);
					field423.method593(var16, field161, field160 + 50 - var22, var17);
					GBJWVQAY.method285();
				}

				if (field102[var9] == 5) {
					int var23 = 150 - field103[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					GBJWVQAY.method286(field161 - field423.field1513 - 1, 0, 512, field161 + 5);
					field423.method589(0, field160, field161 + var24 + 1, var16);
					field423.method589(var17, field160, field161 + var24, var16);
					GBJWVQAY.method285();
				}
			} else {
				field423.method589(0, field160, field161 + 1, var16);
				field423.method589(0xFFFF00, field160, field161, var16);
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method79() {
		for (int var1 = 0; var1 < field376; var1++) {
			if (field389[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field284[var1] != field236 || field355[var1] != field274) {
						LBBVYYXO var3 = NUMTWBFA.method433(field355[var1], field284[var1]);
						if (System.currentTimeMillis() + var3.field882 / 22 > field214 / 22 + field117) {
							field214 = var3.field882;
							field117 = System.currentTimeMillis();

							if (method126(var3.field882, var3.field881)) {
								field236 = field284[var1];
								field274 = field355[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method125()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field86.method358(76);
						field86.method360(field284[var1] & 0x7FFF);
					} else {
						field86.method358(76);
						field86.method360(-1);
					}
				}

				if (var2 && field389[var1] != -5) {
					field389[var1] = -5;
				} else {
					field376--;
					for (int var5 = var1; var5 < field376; var5++) {
						field284[var5] = field284[var5 + 1];
						field355[var5] = field355[var5 + 1];
						field389[var5] = field389[var5 + 1];
					}

					var1--;
				}
			} else {
				field389[var1]--;
			}
		}

		if (field276 > 0) {
			field276 -= 20;
			if (field276 < 0) {
				field276 = 0;
			}

			if (field276 == 0 && field404 && !field197) {
				field474 = field282;
				field475 = true;
				field77.method240(2, field474);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method80() {
		field337++;
		method39(true);
		method81(true);
		method39(false);
		method81(false);
		method74();
		method45();

		if (!field328) {
			int var1 = field54;
			if (field210 / 256 > var1) {
				var1 = field210 / 256;
			}

			if (field370[4] && field174[4] + 128 > var1) {
				var1 = field174[4] + 128;
			}

			int var2 = field55 + field234 & 0x7FF;
			method40(field298, var2, var1 * 3 + 600, var1, method147(field114.field977, field199, field114.field978) - 50, field299);
		}

		int var3;
		if (field328) {
			var3 = method48();
		} else {
			var3 = method47();
		}

		int var4 = field392;
		int var5 = field393;
		int var6 = field394;
		int var7 = field395;
		int var8 = field396;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field370[var9]) {
				int var10 = (int) (Math.random() * (field411[var9] * 2 + 1) + Math.sin(field257[var9] / 100.0D * field297[var9]) * field174[var9] - field411[var9]);
				if (var9 == 0) {
					field392 += var10;
				}

				if (var9 == 1) {
					field393 += var10;
				}

				if (var9 == 2) {
					field394 += var10;
				}

				if (var9 == 3) {
					field396 = field396 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field395 += var10;
					if (field395 < 128) {
						field395 = 128;
					}

					if (field395 > 383) {
						field395 = 383;
					}
				}
			}
		}

		int var11 = CUNPUNFW.field526;
		CYPZUKMB.field600 = true;
		CYPZUKMB.field603 = 0;
		CYPZUKMB.field601 = field711 - 4;
		CYPZUKMB.field602 = field712 - 4;
		GBJWVQAY.method287();
		field157.method510(field393, field392, field396, field394, field395, var3);
		field157.method485();
		method78();
		method97();
		method91(var11);
		method71();
		field415.method299(field703, 4, 4);
		field392 = var4;
		field393 = var5;
		field394 = var6;
		field395 = var7;
		field396 = var8;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method81(boolean arg0) {
		for (int var2 = 0; var2 < field309; var2++) {
			SBPCMLRM var3 = field308[field310[var2]];
			int var4 = (field310[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method429() && var3.field1214.field1363 == arg0 && var3.field1214.method574()) {
				int var5 = var3.field977 >> 7;
				int var6 = var3.field978 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field992 == 1 && (var3.field977 & 0x7F) == 0x40 && (var3.field978 & 0x7F) == 0x40) {
						if (field113[var5][var6] == field337) {
							continue;
						}

						field113[var5][var6] = field337;
					}

					if (!var3.field1214.field1374) {
						var4 += Integer.MIN_VALUE;
					}

					field157.method482(var3, field199, method147(var3.field977, field199, var3.field978), var3.field979, var4, var3.field977, (var3.field992 - 1) * 64 + 60, var3.field1005, var3.field978);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method82(long arg0) {
		if (arg0 != 0L) {
			if (field213 >= 100) {
				method67("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = OERTMYQW.method444(OERTMYQW.method441(arg0));
				for (int var4 = 0; var4 < field213; var4++) {
					if (field331[var4] == arg0) {
						method67(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field357; var5++) {
					if (field408[var5] == arg0) {
						method67("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field331[field213++] = arg0;
				field495 = true;
				field86.method358(180);
				field86.method365(arg0);
			}
		}
	}

	@ObfuscatedName("client.u(I)Z")
	public final boolean method83() {
		if (field285 == null) {
			return false;
		}

		try {
			int var1 = field285.method280();
			if (var1 == 0) {
				return false;
			}

			if (field179 == -1) {
				field285.method281(field487.field881, 0, 1);
				field179 = field487.field881[0] & 0xFF;
				if (field209 != null) {
					field179 = field179 - field209.method424() & 0xFF;
				}

				field178 = TQZCDAJF.field1256[field179];
				var1--;
			}

			if (field178 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field285.method281(field487.field881, 0, 1);
				field178 = field487.field881[0] & 0xFF;
				var1--;
			}

			if (field178 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field285.method281(field487.field881, 0, 2);
				field487.field882 = 0;
				field178 = field487.method371();
				var1 -= 2;
			}

			if (var1 < field178) {
				return false;
			}

			field487.field882 = 0;
			field285.method281(field487.field881, 0, field178);
			field180 = 0;
			field131 = field130;
			field130 = field129;
			field129 = field179;

			if (field179 == 94) {
				field407 = field487.method388();
				field406 = field487.method389();
				for (int var2 = field406; var2 < field406 + 8; var2++) {
					for (int var3 = field407; var3 < field407 + 8; var3++) {
						if (field212[field199][var2][var3] != null) {
							field212[field199][var2][var3] = null;
							method118(var2, var3);
						}
					}
				}

				for (FIMQRVPL var4 = (FIMQRVPL) field71.method449(); var4 != null; var4 = (FIMQRVPL) field71.method451()) {
					if (var4.field797 >= field406 && var4.field797 < field406 + 8 && var4.field798 >= field407 && var4.field798 < field407 + 8 && field199 == var4.field795) {
						var4.field791 = 0;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 38) {
				int var5 = field487.method369();
				int var6 = field487.method369();
				int var7 = field487.method369();
				int var8 = field487.method369();
				field370[var5] = true;
				field411[var5] = var6;
				field174[var5] = var7;
				field257[var5] = var8;
				field297[var5] = 0;
				field179 = -1;
				return true;
			}

			if (field179 == 54) {
				field328 = true;
				field342 = field487.method369();
				field343 = field487.method369();
				field344 = field487.method371();
				field345 = field487.method369();
				field346 = field487.method369();
				if (field346 >= 100) {
					field392 = field342 * 128 + 64;
					field394 = field343 * 128 + 64;
					field393 = method147(field392, field199, field394) - field344;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 128) {
				field239 = field487.method369();
				if (field239 == 1) {
					field205 = field487.method371();
				}

				if (field239 >= 2 && field239 <= 6) {
					if (field239 == 2) {
						field255 = 64;
						field256 = 64;
					}

					if (field239 == 3) {
						field255 = 0;
						field256 = 64;
					}

					if (field239 == 4) {
						field255 = 128;
						field256 = 64;
					}

					if (field239 == 5) {
						field255 = 64;
						field256 = 0;
					}

					if (field239 == 6) {
						field255 = 64;
						field256 = 128;
					}

					field239 = 2;
					field252 = field487.method371();
					field253 = field487.method371();
					field254 = field487.method369();
				}

				if (field239 == 10) {
					field116 = field487.method371();
				}

				field179 = -1;
				return true;
			}

			if (field179 == 143) {
				field467 = field487.method369();
				field179 = -1;
				return true;
			}

			if (field179 == 236) {
				int var9 = field487.method371();
				int var10 = field487.method395();
				PQPZKUPU.method460(var10).field1102 = 1;
				PQPZKUPU.method460(var10).field1103 = var9;
				field179 = -1;
				return true;
			}

			if (field179 == 114) {
				int var11 = field487.method403();
				int var12 = field487.method396();
				field317[var12] = var11;

				if (field316[var12] != var11) {
					field316[var12] = var11;
					method36(var12);
					field495 = true;

					if (field126 != -1) {
						field471 = true;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 78) {
				field495 = true;
				int var13 = field487.method371();
				PQPZKUPU var14 = PQPZKUPU.method460(var13);
				int var15 = field487.method371();
				for (int var16 = 0; var16 < var15; var16++) {
					var14.field1074[var16] = field487.method371();
					int var17 = field487.method387();
					if (var17 == 255) {
						var17 = field487.method404();
					}

					var14.field1078[var16] = var17;
				}

				for (int var18 = var15; var18 < var14.field1074.length; var18++) {
					var14.field1074[var18] = 0;
					var14.field1078[var18] = 0;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 238) {
				if (field229 == 12) {
					field495 = true;
				}

				field238 = field487.method372();
				field179 = -1;
				return true;
			}

			if (field179 == 108) {
				int var19 = field487.method395();
				int var20 = field487.method371();
				int var21 = field487.method397();
				int var22 = field487.method397();
				PQPZKUPU.method460(var19).field1133 = var20;
				PQPZKUPU.method460(var19).field1134 = var22;
				PQPZKUPU.method460(var19).field1132 = var21;
				field179 = -1;
				return true;
			}

			if (field179 == 3) {
				long var23 = field487.method375();
				int var25 = field487.method374();
				int var26 = field487.method369();
				boolean var27 = false;
				for (int var28 = 0; var28 < 100; var28++) {
					if (field143[var28] == var25) {
						var27 = true;
						break;
					}
				}

				if (var26 <= 1) {
					for (int var29 = 0; var29 < field213; var29++) {
						if (field331[var29] == var23) {
							var27 = true;
							break;
						}
					}
				}

				if (!var27 && field120 == 0) {
					try {
						field143[field442] = var25;
						field442 = (field442 + 1) % 100;
						String var30 = SLOJMIHA.method523(field487, field178 - 13);
						if (var26 != 3) {
							var30 = JVGHFIOO.method311(var30);
						}

						if (var26 == 2 || var26 == 3) {
							method67(var30, "@cr2@" + OERTMYQW.method444(OERTMYQW.method441(var23)), 7);
						} else if (var26 == 1) {
							method67(var30, "@cr1@" + OERTMYQW.method444(OERTMYQW.method441(var23)), 7);
						} else {
							method67(var30, OERTMYQW.method444(OERTMYQW.method441(var23)), 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 111) {
				field407 = field487.method369();
				field406 = field487.method369();
				field179 = -1;
				return true;
			}

			if (field179 == 10) {
				field200 = 0;
				field179 = -1;
				return true;
			}

			if (field179 == 79) {
				field378 = field487.method387();
				field405 = field487.method371();
				field179 = -1;
				return true;
			}

			if (field179 == 146) {
				int var32 = field487.method395();
				byte var33 = field487.method390();
				field317[var32] = var33;

				if (field316[var32] != var33) {
					field316[var32] = var33;
					method36(var32);
					field495 = true;

					if (field126 != -1) {
						field471 = true;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 130) {
				int var34 = field487.method396();
				int var35 = field487.method396();
				PQPZKUPU.method460(var34).field1102 = 2;
				PQPZKUPU.method460(var34).field1103 = var35;
				field179 = -1;
				return true;
			}

			if (field179 == 118) {
				String var36 = field487.method376();
				if (var36.endsWith(":tradereq:")) {
					String var37 = var36.substring(0, var36.indexOf(":"));
					long var38 = OERTMYQW.method440(var37);
					boolean var40 = false;
					for (int var41 = 0; var41 < field213; var41++) {
						if (field331[var41] == var38) {
							var40 = true;
							break;
						}
					}

					if (!var40 && field120 == 0) {
						method67("wishes to trade with you.", var37, 4);
					}
				} else if (var36.endsWith(":duelreq:")) {
					String var42 = var36.substring(0, var36.indexOf(":"));
					long var43 = OERTMYQW.method440(var42);
					boolean var45 = false;
					for (int var46 = 0; var46 < field213; var46++) {
						if (field331[var46] == var43) {
							var45 = true;
							break;
						}
					}

					if (!var45 && field120 == 0) {
						method67("wishes to duel with you.", var42, 8);
					}
				} else if (var36.endsWith(":chalreq:")) {
					String var47 = var36.substring(0, var36.indexOf(":"));
					long var48 = OERTMYQW.method440(var47);
					boolean var50 = false;
					for (int var51 = 0; var51 < field213; var51++) {
						if (field331[var51] == var48) {
							var50 = true;
							break;
						}
					}

					if (!var50 && field120 == 0) {
						String var52 = var36.substring(var36.indexOf(":") + 1, var36.length() - 9);
						method67(var52, var47, 8);
					}
				} else {
					method67(var36, "", 0);
				}

				field179 = -1;
				return true;
			}

			if (field179 == 199) {
				if (field397 != -1) {
					method154(field397);
					field397 = -1;
					field495 = true;
					field132 = true;
				}

				if (field330 != -1) {
					method154(field330);
					field330 = -1;
					field471 = true;
				}

				if (field127 != -1) {
					method154(field127);
					field127 = -1;
					field70 = true;
				}

				if (field118 != -1) {
					method154(field118);
					field118 = -1;
				}

				if (field484 != -1) {
					method154(field484);
					field484 = -1;
				}

				if (field58 != 0) {
					field58 = 0;
					field471 = true;
				}

				field264 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 82) {
				method128(field178, field487);
				field179 = -1;
				return true;
			}

			if (field179 == 251) {
				int var53 = field487.method395();
				method130(var53);

				if (field397 != -1) {
					method154(field397);
					field397 = -1;
					field495 = true;
					field132 = true;
				}

				if (field330 != -1) {
					method154(field330);
					field330 = -1;
					field471 = true;
				}

				if (field127 != -1) {
					method154(field127);
					field127 = -1;
					field70 = true;
				}

				if (field118 != -1) {
					method154(field118);
					field118 = -1;
				}

				if (field484 != var53) {
					method154(field484);
					field484 = var53;
				}

				if (field58 != 0) {
					field58 = 0;
					field471 = true;
				}

				field264 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 61) {
				field328 = false;

				for (int var54 = 0; var54 < 5; var54++) {
					field370[var54] = false;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 24) {
				field487.method371();
				field349 = field487.method397();
				field334 = field487.method371();
				field487.method387();
				field487.method396();
				field291 = field487.method395();
				field336 = field487.method396();
				field487.method371();
				field203 = field487.method371();
				field173 = field487.method396();
				field359 = field487.method404();
				signlink.dnslookup(OERTMYQW.method443(field359));
				field179 = -1;
				return true;
			}

			if (field179 == 150) {
				field211 = field487.method369();
				field83 = field487.method369();
				field72 = field487.method369();
				field128 = true;
				field471 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 207) {
				int var55 = field487.method371();
				int var56 = field487.method398();
				int var57 = field487.method400();
				PQPZKUPU var58 = PQPZKUPU.method460(var55);
				var58.field1105 = var57;
				var58.field1092 = var56;
				field179 = -1;
				return true;
			}

			if (field179 == 144) {
				field495 = true;
				int var59 = field487.method371();
				PQPZKUPU var60 = PQPZKUPU.method460(var59);
				while (field487.field882 < field178) {
					int var61 = field487.method383();
					int var62 = field487.method371();
					int var63 = field487.method369();
					if (var63 == 255) {
						var63 = field487.method374();
					}

					if (var61 >= 0 && var61 < var60.field1074.length) {
						var60.field1074[var61] = var62;
						var60.field1078[var61] = var63;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 100) {
				long var64 = field487.method375();
				int var66 = field487.method369();
				String var67 = OERTMYQW.method444(OERTMYQW.method441(var64));
				for (int var68 = 0; var68 < field357; var68++) {
					if (field408[var68] == var64) {
						if (field137[var68] != var66) {
							field137[var68] = var66;
							field495 = true;

							if (var66 > 0) {
								method67(var67 + " has logged in.", "", 5);
							}

							if (var66 == 0) {
								method67(var67 + " has logged out.", "", 5);
							}
						}

						var67 = null;
						break;
					}
				}

				if (var67 != null && field357 < 200) {
					field408[field357] = var64;
					field215[field357] = var67;
					field137[field357] = var66;
					field357++;
					field495 = true;
				}

				boolean var69 = false;
				while (!var69) {
					var69 = true;
					for (int var70 = 0; var70 < field357 - 1; var70++) {
						if (field137[var70] != field194 && field137[var70 + 1] == field194 || field137[var70] == 0 && field137[var70 + 1] != 0) {
							int var71 = field137[var70];
							field137[var70] = field137[var70 + 1];
							field137[var70 + 1] = var71;
							String var72 = field215[var70];
							field215[var70] = field215[var70 + 1];
							field215[var70 + 1] = var72;
							long var73 = field408[var70];
							field408[var70] = field408[var70 + 1];
							field408[var70 + 1] = var73;
							field495 = true;
							var69 = false;
						}
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 96) {
				if (field229 == 12) {
					field495 = true;
				}

				field452 = field487.method369();
				field179 = -1;
				return true;
			}

			if (field179 == 180) {
				int var75 = field487.method395();
				if (var75 == 0xFFFF) {
					var75 = -1;
				}

				if (field282 != var75 && field404 && !field197 && field276 == 0) {
					field474 = var75;
					field475 = true;
					field77.method240(2, field474);
				}

				field282 = var75;
				field179 = -1;
				return true;
			}

			if (field179 == 192) {
				int var76 = field487.method396();
				int var77 = field487.method373();
				if (field404 && !field197) {
					field474 = var76;
					field475 = false;
					field77.method240(2, field474);
					field276 = var77;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 200) {
				int var78 = field487.method396();
				method130(var78);

				if (field330 != -1) {
					method154(field330);
					field330 = -1;
					field471 = true;
				}

				if (field127 != -1) {
					method154(field127);
					field127 = -1;
					field70 = true;
				}

				if (field118 != -1) {
					method154(field118);
					field118 = -1;
				}

				if (field484 != -1) {
					method154(field484);
					field484 = -1;
				}

				if (field397 != var78) {
					method154(field397);
					field397 = var78;
				}

				if (field58 != 0) {
					field58 = 0;
					field471 = true;
				}

				field495 = true;
				field132 = true;
				field264 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 86) {
				int var79 = field487.method400();
				if (field126 != var79) {
					method154(field126);
					field126 = var79;
				}

				field471 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 120) {
				int var80 = field487.method395();
				int var81 = field487.method371();
				int var82 = field487.method397();

				if (var80 == 0xFFFF) {
					PQPZKUPU.method460(var81).field1102 = 0;
					field179 = -1;
					return true;
				}

				WGKWQDPM var83 = WGKWQDPM.method554(var80);
				PQPZKUPU.method460(var81).field1102 = 4;
				PQPZKUPU.method460(var81).field1103 = var80;
				PQPZKUPU.method460(var81).field1133 = var83.field1338;
				PQPZKUPU.method460(var81).field1134 = var83.field1325;
				PQPZKUPU.method460(var81).field1132 = var83.field1303 * 100 / var82;
				field179 = -1;
				return true;
			}

			if (field179 == 40) {
				field495 = true;
				int var84 = field487.method389();
				int var85 = field487.method404();
				int var86 = field487.method369();
				field293[var86] = var85;
				field158[var86] = var84;
				field74[var86] = 1;
				for (int var87 = 0; var87 < 98; var87++) {
					if (var85 >= field273[var87]) {
						field74[var86] = var87 + 2;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 181) {
				for (int var88 = 0; var88 < field186.length; var88++) {
					if (field186[var88] != null) {
						field186[var88].field1015 = -1;
					}
				}

				for (int var89 = 0; var89 < field308.length; var89++) {
					if (field308[var89] != null) {
						field308[var89].field1015 = -1;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 2) {
				int var90 = field487.method371();
				int var91 = field487.method389();

				if (var90 == 0xFFFF) {
					var90 = -1;
				}

				if (field315[var91] != var90) {
					method154(field315[var91]);
					field315[var91] = var90;
				}

				field495 = true;
				field132 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 46 || field179 == 193 || field179 == 206 || field179 == 93 || field179 == 187 || field179 == 98 || field179 == 209 || field179 == 252 || field179 == 31 || field179 == 253 || field179 == 122) {
				method98(field487, field179);
				field179 = -1;
				return true;
			}

			if (field179 == 214) {
				int var92 = field487.method389();
				int var93 = field487.method389();
				String var94 = field487.method376();
				if (var92 >= 1 && var92 <= 5) {
					if (var94.equalsIgnoreCase("null")) {
						var94 = null;
					}

					field347[var92 - 1] = var94;
					field348[var92 - 1] = var93 == 0;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 26) {
				int var95 = field487.method371();
				int var96 = field487.method397();
				PQPZKUPU var97 = PQPZKUPU.method460(var96);
				if (var97 != null && var97.field1101 == 0) {
					if (var95 < 0) {
						var95 = 0;
					}

					if (var95 > var97.field1100 - var97.field1118) {
						var95 = var97.field1100 - var97.field1118;
					}

					var97.field1126 = var95;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 127) {
				field229 = field487.method369();
				field495 = true;
				field132 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 28) {
				int var98 = field487.method396();
				boolean var99 = field487.method388() == 1;
				PQPZKUPU.method460(var98).field1128 = var99;
				field179 = -1;
				return true;
			}

			if (field179 == 177) {
				int var100 = field487.method372();
				int var101 = field487.method395();
				PQPZKUPU var102 = PQPZKUPU.method460(var101);
				if (var102.field1130 != var100 || var100 == -1) {
					var102.field1130 = var100;
					var102.field1108 = 0;
					var102.field1115 = 0;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 33) {
				int var103 = field487.method399();
				if (var103 >= 0) {
					method130(var103);
				}

				if (field356 != var103) {
					method154(field356);
					field356 = var103;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 17) {
				int var104 = field487.method371();
				int var105 = field487.method395();
				int var106 = var105 >> 10 & 0x1F;
				int var107 = var105 >> 5 & 0x1F;
				int var108 = var105 & 0x1F;
				PQPZKUPU.method460(var104).field1077 = (var108 << 3) + (var106 << 19) + (var107 << 11);
				field179 = -1;
				return true;
			}

			if (field179 == 172) {
				int var109 = field487.method371();
				PQPZKUPU.method460(var109).field1102 = 3;

				if (field114.field1237 == null) {
					PQPZKUPU.method460(var109).field1103 = (field114.field1222[11] << 5) + (field114.field1222[8] << 10) + (field114.field1222[0] << 15) + (field114.field1233[0] << 25) + (field114.field1233[4] << 20) + field114.field1222[1];
				} else {
					PQPZKUPU.method460(var109).field1103 = (int) (field114.field1237.field1367 + 0x12345678L);
				}

				field179 = -1;
				return true;
			}

			if (field179 == 182) {
				field213 = field178 / 8;
				for (int var110 = 0; var110 < field213; var110++) {
					field331[var110] = field487.method375();
				}

				field179 = -1;
				return true;
			}

			if (field179 == 234) {
				field64 = false;
				field58 = 2;
				field390 = "";
				field471 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 190) {
				method72();
				field179 = -1;
				return false;
			}

			if (field179 == 167) {
				int var111 = field487.method371();
				int var112 = field487.method371();
				int var113 = field487.method396();
				PQPZKUPU.method460(var113).field1124 = (var112 << 16) + var111;
				field179 = -1;
				return true;
			}

			if (field179 == 99) {
				int var114 = field487.method396();
				method130(var114);

				if (field397 != -1) {
					method154(field397);
					field397 = -1;
					field495 = true;
					field132 = true;
				}

				if (field127 != -1) {
					method154(field127);
					field127 = -1;
					field70 = true;
				}

				if (field118 != -1) {
					method154(field118);
					field118 = -1;
				}

				if (field484 != -1) {
					method154(field484);
					field484 = -1;
				}

				if (field330 != var114) {
					method154(field330);
					field330 = var114;
				}

				field264 = false;
				field471 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 213) {
				int var115 = field487.method371();
				int var116 = field487.method369();
				int var117 = field487.method371();
				if (var117 == 0xFFFF) {
					if (field376 < 50) {
						field284[field376] = (short) var115;
						field355[field376] = var116;
						field389[field376] = 0;
						field376++;
					}
				} else if (field350 && !field197 && field376 < 50) {
					field284[field376] = var115;
					field355[field376] = var116;
					field389[field376] = NUMTWBFA.field1024[var115] + var117;
					field376++;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 9) {
				int var118 = field487.method397();
				PQPZKUPU var119 = PQPZKUPU.method460(var118);
				for (int var120 = 0; var120 < var119.field1074.length; var120++) {
					var119.field1074[var120] = -1;
					var119.field1074[var120] = 0;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 133) {
				field159 = field487.method369();
				field179 = -1;
				return true;
			}

			if (field179 == 35) {
				field64 = false;
				field58 = 1;
				field390 = "";
				field471 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 196) {
				int var121 = field487.method395();
				int var122 = field487.method371();
				method130(var122);

				if (var121 != -1) {
					method130(var121);
				}

				if (field484 != -1) {
					method154(field484);
					field484 = -1;
				}

				if (field397 != -1) {
					method154(field397);
					field397 = -1;
				}

				if (field330 != -1) {
					method154(field330);
					field330 = -1;
				}

				if (field127 != var122) {
					method154(field127);
					field127 = var122;
				}

				if (field118 != var122) {
					method154(field118);
					field118 = var121;
				}

				field58 = 0;
				field264 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 124) {
				method122(field487, field178);
				field125 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 142) {
				String var123 = field487.method376();
				int var124 = field487.method371();
				PQPZKUPU.method460(var124).field1107 = var123;

				if (field315[field229] == PQPZKUPU.method460(var124).field1099) {
					field495 = true;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 57) {
				field407 = field487.method387();
				field406 = field487.method387();

				while (field487.field882 < field178) {
					int var125 = field487.method369();
					method98(field487, var125);
				}

				field179 = -1;
				return true;
			}

			if (field179 == 227) {
				field140 = field487.method369();
				if (field229 == field140) {
					if (field140 == 3) {
						field229 = 1;
					} else {
						field229 = 3;
					}

					field495 = true;
				}

				field179 = -1;
				return true;
			}

			if (field179 == 103) {
				field328 = true;
				field496 = field487.method369();
				field497 = field487.method369();
				field498 = field487.method371();
				field499 = field487.method369();
				field500 = field487.method369();
				if (field500 >= 100) {
					int var126 = field496 * 128 + 64;
					int var127 = field497 * 128 + 64;
					int var128 = method147(var126, field199, var127) - field498;
					int var129 = var126 - field392;
					int var130 = var128 - field393;
					int var131 = var127 - field394;
					int var132 = (int) Math.sqrt(var129 * var129 + var131 * var131);
					field395 = (int) (Math.atan2(var130, var132) * 325.949D) & 0x7FF;
					field396 = (int) (Math.atan2(var129, var131) * -325.949D) & 0x7FF;

					if (field395 < 128) {
						field395 = 128;
					}

					if (field395 > 383) {
						field395 = 383;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 102) {
				field358 = field487.method369();
				field495 = true;
				field179 = -1;
				return true;
			}

			if (field179 == 6) {
				field362 = field487.method395() * 30;
				field179 = -1;
				return true;
			}

			if (field179 == 67) {
				for (int var133 = 0; var133 < field316.length; var133++) {
					if (field317[var133] != field316[var133]) {
						field316[var133] = field317[var133];
						method36(var133);
						field495 = true;
					}
				}

				field179 = -1;
				return true;
			}

			if (field179 == 169 || field179 == 89) {
				int var134 = field323;
				int var135 = field324;
				if (field179 == 169) {
					var135 = field487.method395();
					var134 = field487.method397();
					field278 = false;
				}

				if (field179 == 89) {
					var135 = field487.method395();
					field487.method379();

					for (int var136 = 0; var136 < 4; var136++) {
						for (int var137 = 0; var137 < 13; var137++) {
							for (int var138 = 0; var138 < 13; var138++) {
								int var139 = field487.method380(1);
								if (var139 == 1) {
									field443[var136][var137][var138] = field487.method380(26);
								} else {
									field443[var136][var137][var138] = -1;
								}
							}
						}
					}

					field487.method381();
					var134 = field487.method371();
					field278 = true;
				}

				if (field323 == var134 && field324 == var135 && field263 == 2) {
					field179 = -1;
					return true;
				}

				field323 = var134;
				field324 = var135;
				field150 = (field323 - 6) * 8;
				field151 = (field324 - 6) * 8;
				field438 = false;
				if ((field323 / 8 == 48 || field323 / 8 == 49) && field324 / 8 == 48) {
					field438 = true;
				}

				if (field323 / 8 == 48 && field324 / 8 == 148) {
					field438 = true;
				}

				field263 = 1;
				field440 = System.currentTimeMillis();
				method73(null, "Loading - please wait.");

				if (field179 == 169) {
					int var140 = 0;
					for (int var141 = (field323 - 6) / 8; var141 <= (field323 + 6) / 8; var141++) {
						for (int var142 = (field324 - 6) / 8; var142 <= (field324 + 6) / 8; var142++) {
							var140++;
						}
					}

					field340 = new byte[var140][];
					field434 = new byte[var140][];
					field464 = new int[var140];
					field465 = new int[var140];
					field466 = new int[var140];
					int var143 = 0;
					for (int var144 = (field323 - 6) / 8; var144 <= (field323 + 6) / 8; var144++) {
						for (int var145 = (field324 - 6) / 8; var145 <= (field324 + 6) / 8; var145++) {
							field464[var143] = (var144 << 8) + var145;

							if (field438 && (var145 == 49 || var145 == 149 || var145 == 147 || var144 == 50 || var144 == 49 && var145 == 47)) {
								field465[var143] = -1;
								field466[var143] = -1;
								var143++;
							} else {
								int var146 = field465[var143] = field77.method236(var145, 0, var144);
								if (var146 != -1) {
									field77.method240(3, var146);
								}

								int var147 = field466[var143] = field77.method236(var145, 1, var144);
								if (var147 != -1) {
									field77.method240(3, var147);
								}

								var143++;
							}
						}
					}
				}

				if (field179 == 89) {
					int var148 = 0;
					int[] var149 = new int[676];
					for (int var150 = 0; var150 < 4; var150++) {
						for (int var151 = 0; var151 < 13; var151++) {
							for (int var152 = 0; var152 < 13; var152++) {
								int var153 = field443[var150][var151][var152];
								if (var153 != -1) {
									int var154 = var153 >> 14 & 0x3FF;
									int var155 = var153 >> 3 & 0x7FF;
									int var156 = (var154 / 8 << 8) + var155 / 8;
									for (int var157 = 0; var157 < var148; var157++) {
										if (var149[var157] == var156) {
											var156 = -1;
											break;
										}
									}

									if (var156 != -1) {
										var149[var148++] = var156;
									}
								}
							}
						}
					}

					field340 = new byte[var148][];
					field434 = new byte[var148][];
					field464 = new int[var148];
					field465 = new int[var148];
					field466 = new int[var148];
					for (int var158 = 0; var158 < var148; var158++) {
						int var159 = field464[var158] = var149[var158];
						int var160 = var159 >> 8 & 0xFF;
						int var161 = var159 & 0xFF;
						int var162 = field465[var158] = field77.method236(var161, 0, var160);
						if (var162 != -1) {
							field77.method240(3, var162);
						}

						int var163 = field466[var158] = field77.method236(var161, 1, var160);
						if (var163 != -1) {
							field77.method240(3, var163);
						}
					}
				}

				int var164 = field150 - field152;
				int var165 = field151 - field153;
				field152 = field150;
				field153 = field151;

				for (int var166 = 0; var166 < 16384; var166++) {
					SBPCMLRM var167 = field308[var166];
					if (var167 != null) {
						for (int var168 = 0; var168 < 10; var168++) {
							var167.field975[var168] -= var164;
							var167.field976[var168] -= var165;
						}

						var167.field977 -= var164 * 128;
						var167.field978 -= var165 * 128;
					}
				}

				for (int var169 = 0; var169 < field184; var169++) {
					SOKVSBIO var170 = field186[var169];
					if (var170 != null) {
						for (int var171 = 0; var171 < 10; var171++) {
							var170.field975[var171] -= var164;
							var170.field976[var171] -= var165;
						}

						var170.field977 -= var164 * 128;
						var170.field978 -= var165 * 128;
					}
				}

				field125 = true;
				byte var172 = 0;
				byte var173 = 104;
				byte var174 = 1;
				if (var164 < 0) {
					var172 = 103;
					var173 = -1;
					var174 = -1;
				}

				byte var175 = 0;
				byte var176 = 104;
				byte var177 = 1;
				if (var165 < 0) {
					var175 = 103;
					var176 = -1;
					var177 = -1;
				}

				for (int var178 = var172; var178 != var173; var178 += var174) {
					for (int var179 = var175; var179 != var176; var179 += var177) {
						int var180 = var164 + var178;
						int var181 = var165 + var179;
						for (int var182 = 0; var182 < 4; var182++) {
							if (var180 >= 0 && var181 >= 0 && var180 < 104 && var181 < 104) {
								field212[var182][var178][var179] = field212[var182][var180][var181];
							} else {
								field212[var182][var178][var179] = null;
							}
						}
					}
				}

				for (FIMQRVPL var183 = (FIMQRVPL) field71.method449(); var183 != null; var183 = (FIMQRVPL) field71.method451()) {
					var183.field797 -= var164;
					var183.field798 -= var165;
					if (var183.field797 < 0 || var183.field798 < 0 || var183.field797 >= 104 || var183.field798 >= 104) {
						var183.method464();
					}
				}

				if (field200 != 0) {
					field200 -= var164;
					field201 -= var165;
				}

				field328 = false;
				field179 = -1;
				return true;
			}

			if (field179 == 161) {
				int var184 = field487.method371();
				int var185 = field487.method371();

				if (field330 != -1) {
					method154(field330);
					field330 = -1;
					field471 = true;
				}

				if (field127 != -1) {
					method154(field127);
					field127 = -1;
					field70 = true;
				}

				if (field118 != -1) {
					method154(field118);
					field118 = -1;
				}

				if (field484 != var185) {
					method154(field484);
					field484 = var185;
				}

				if (field397 != var184) {
					method154(field397);
					field397 = var184;
				}

				if (field58 != 0) {
					field58 = 0;
					field471 = true;
				}

				field495 = true;
				field132 = true;
				field264 = false;
				field179 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field179 + "," + field178 + " - " + field130 + "," + field131);
			method72();
		} catch (IOException var190) {
			method37();
		} catch (Exception var191) {
			String var187 = "T2 - " + field179 + "," + field130 + "," + field131 + " - " + field178 + "," + (field114.field975[0] + field150) + "," + (field114.field976[0] + field151) + " - ";
			for (int var188 = 0; var188 < field178 && var188 < 50; var188++) {
				var187 = var187 + field487.field881[var188] + ",";
			}

			signlink.reporterror(var187);
			method72();
		}

		return true;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method84(boolean arg0) {
		method28();
		field219.method298();
		field265.method586(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field207 == 0) {
			int var4 = var3 / 2 + 80;
			field421.method590(true, field77.field692, 0x75A9A9, var4, var2 / 2);
			int var5 = var3 / 2 - 20;
			field423.method590(true, "Welcome to RuneScape", 0xFFFF00, var5, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field266.method586(var6 - 73, var7 - 20);
			field423.method590(true, "New User", 0xFFFFFF, var7 + 5, var6);
			int var8 = var2 / 2 + 80;
			field266.method586(var8 - 73, var7 - 20);
			field423.method590(true, "Existing User", 0xFFFFFF, var7 + 5, var8);
		}

		if (field207 == 2) {
			int var9 = var3 / 2 - 40;
			if (field87.length() > 0) {
				field423.method590(true, field87, 0xFFFF00, var9 - 15, var2 / 2);
				field423.method590(true, field88, 0xFFFF00, var9, var2 / 2);
				var9 += 30;
			} else {
				field423.method590(true, field88, 0xFFFF00, var9 - 7, var2 / 2);
				var9 += 30;
			}

			field423.method597(0xFFFFFF, "Username: " + field401 + (field241 == 0 & field155 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90, var9);
			var9 += 15;
			field423.method597(0xFFFFFF, "Password: " + OERTMYQW.method445(field402) + (field241 == 1 & field155 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field266.method586(var10 - 73, var11 - 20);
				field423.method590(true, "Login", 0xFFFFFF, var11 + 5, var10);
				int var12 = var2 / 2 + 80;
				field266.method586(var12 - 73, var11 - 20);
				field423.method590(true, "Cancel", 0xFFFFFF, var11 + 5, var12);
			}
		}

		if (field207 == 3) {
			field423.method590(true, "Create a free account", 0xFFFF00, var3 / 2 - 60, var2 / 2);
			int var13 = var3 / 2 - 35;
			field423.method590(true, "To create a new account you need to", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field423.method590(true, "go back to the main RuneScape webpage", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field423.method590(true, "and choose the 'create account'", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field423.method590(true, "button near the top of that page.", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field266.method586(var14 - 73, var15 - 20);
			field423.method590(true, "Cancel", 0xFFFFFF, var15 + 5, var14);
		}

		field219.method299(field703, 202, 171);

		if (field70) {
			field70 = false;
			field217.method299(field703, 128, 0);
			field218.method299(field703, 202, 371);
			field222.method299(field703, 0, 265);
			field223.method299(field703, 562, 265);
			field224.method299(field703, 128, 171);
			field225.method299(field703, 562, 171);
		}
	}

	@ObfuscatedName("client.a(IBLPQPZKUPU;)I")
	public final int method85(int arg0, PQPZKUPU arg1) {
		if (arg1.field1117 == null || arg0 >= arg1.field1117.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1117[arg0];
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
					var8 = field158[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field74[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field293[var3[var5++]];
				}

				if (var7 == 4) {
					PQPZKUPU var10 = PQPZKUPU.method460(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < WGKWQDPM.field1308 && (!WGKWQDPM.method554(var11).field1331 || field196)) {
						for (int var12 = 0; var12 < var10.field1074.length; var12++) {
							if (var11 + 1 == var10.field1074[var12]) {
								var8 += var10.field1078[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field316[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field273[field74[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field316[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field114.field1220;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < UDCXKHIL.field1257; var13++) {
						if (UDCXKHIL.field1259[var13]) {
							var8 += field74[var13];
						}
					}
				}

				if (var7 == 10) {
					PQPZKUPU var14 = PQPZKUPU.method460(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < WGKWQDPM.field1308 && (!WGKWQDPM.method554(var15).field1331 || field196)) {
						for (int var16 = 0; var16 < var14.field1074.length; var16++) {
							if (var14.field1074[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field452;
				}

				if (var7 == 12) {
					var8 = field238;
				}

				if (var7 == 13) {
					int var17 = field316[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					GJIMXWNM var20 = GJIMXWNM.field832[var19];
					int var21 = var20.field834;
					int var22 = var20.field835;
					int var23 = var20.field836;
					int var24 = field485[var23 - var22];
					var8 = field316[var21] >> var22 & var24;
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
					var8 = (field114.field977 >> 7) + field150;
				}

				if (var7 == 19) {
					var8 = (field114.field978 >> 7) + field151;
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

	@ObfuscatedName("client.c(II)V")
	public final void method86(int arg0) {
		if (arg0 >= 0) {
			int var2 = field230[arg0];
			int var3 = field231[arg0];
			int var4 = field232[arg0];
			int var5 = field233[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field58 != 0 && var4 != 1321) {
				field58 = 0;
				field471 = true;
			}

			if (var4 == 972) {
				boolean var6 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
				if (!var6) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
				}

				field78 = field718;
				field79 = field719;
				field81 = 2;
				field80 = 0;
				field86.method358(77);
				field86.method392(field150 + var2);
				field86.method360(var5);
				field86.method394(field151 + var3);
			}

			if (var4 == 915) {
				field86.method358(52);
				field86.method360(var3);
				PQPZKUPU var8 = PQPZKUPU.method460(var3);
				if (var8.field1117 != null && var8.field1117[0][0] == 5) {
					int var9 = var8.field1117[0][1];
					if (field316[var9] != var8.field1072[0]) {
						field316[var9] = var8.field1072[0];
						method36(var9);
						field495 = true;
					}
				}
			}

			if (var4 == 564) {
				String var10 = field399[arg0];
				int var11 = var10.indexOf("@whi@");
				if (var11 != -1) {
					if (field484 == -1) {
						method14();
						field208 = var10.substring(var11 + 5).trim();
						field366 = false;
						field314 = field484 = PQPZKUPU.field1069;
					} else {
						method67("Please close the interface you have open before using 'report abuse'", "", 0);
					}
				}
			}

			if (var4 == 1161) {
				method101(var2, var5, var3);
				field86.method358(86);
				field86.method360(field150 + var2);
				field86.method360(field151 + var3);
				field86.method393(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 455 || var4 == 899) {
				String var12 = field399[arg0];
				int var13 = var12.indexOf("@whi@");
				if (var13 != -1) {
					var12 = var12.substring(var13 + 5).trim();
					String var14 = OERTMYQW.method444(OERTMYQW.method441(OERTMYQW.method440(var12)));
					boolean var15 = false;
					for (int var16 = 0; var16 < field187; var16++) {
						SOKVSBIO var17 = field186[field188[var16]];
						if (var17 != null && var17.field1235 != null && var17.field1235.equalsIgnoreCase(var14)) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var17.field976[0], false, field114.field976[0], 1, var17.field975[0]);

							if (var4 == 455) {
								field86.method358(26);
								field86.method392(field188[var16]);
							}

							if (var4 == 899) {
								field86.method358(48);
								field86.method392(field188[var16]);
							}

							var15 = true;
							break;
						}
					}

					if (!var15) {
						method67("Unable to find " + var14, "", 0);
					}
				}
			}

			if (var4 == 971) {
				field86.method358(221);
				field86.method394(var3);
				field86.method394(var2);
				field86.method394(var5);
				field258 = 0;
				field259 = var3;
				field260 = var2;
				field261 = 2;
				if (PQPZKUPU.method460(var3).field1099 == field484) {
					field261 = 1;
				}

				if (PQPZKUPU.method460(var3).field1099 == field330) {
					field261 = 3;
				}
			}

			if (var4 == 273) {
				field172 += var2;
				if (field172 >= 67) {
					field86.method358(57);
					field86.method362(0x38C86B);
					field172 = 0;
				}

				field86.method358(91);
				field86.method394(var2);
				field86.method394(var3);
				field86.method392(var5);
				field258 = 0;
				field259 = var3;
				field260 = var2;
				field261 = 2;
				if (PQPZKUPU.method460(var3).field1099 == field484) {
					field261 = 1;
				}

				if (PQPZKUPU.method460(var3).field1099 == field330) {
					field261 = 3;
				}
			}

			if (var4 == 402) {
				field86.method358(59);
				field86.method360(var5);
				field86.method360(field163);
				field86.method392(field165);
				field86.method393(var2);
				field86.method392(field164);
				field86.method393(var3);
				field258 = 0;
				field259 = var3;
				field260 = var2;
				field261 = 2;
				if (PQPZKUPU.method460(var3).field1099 == field484) {
					field261 = 1;
				}

				if (PQPZKUPU.method460(var3).field1099 == field330) {
					field261 = 3;
				}
			}

			if (var4 == 213) {
				method101(var2, var5, var3);
				field86.method358(126);
				field86.method393(field150 + var2);
				field86.method360(var5 >> 14 & 0x7FFF);
				field86.method360(field151 + var3);
			}

			if (var4 == 151) {
				SBPCMLRM var18 = field308[var5];
				if (var18 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var18.field976[0], false, field114.field976[0], 1, var18.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(140);
					field86.method360(field165);
					field86.method394(var5);
					field86.method394(field163);
					field86.method394(field164);
				}
			}

			if (var4 == 308 || var4 == 502 || var4 == 760 || var4 == 831) {
				String var19 = field399[arg0];
				int var20 = var19.indexOf("@whi@");
				if (var20 != -1) {
					long var21 = OERTMYQW.method440(var19.substring(var20 + 5).trim());
					if (var4 == 308) {
						method43(var21);
					}

					if (var4 == 502) {
						method82(var21);
					}

					if (var4 == 760) {
						method102(var21);
					}

					if (var4 == 831) {
						method109(var21);
					}
				}
			}

			if (var4 == 776) {
				SBPCMLRM var23 = field308[var5];
				if (var23 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var23.field976[0], false, field114.field976[0], 1, var23.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field204 += var5;
					if (field204 >= 141) {
						field86.method358(109);
						field86.method363(0);
						field204 = 0;
					}

					field86.method358(135);
					field86.method360(var5);
				}
			}

			if (var4 == 72) {
				SOKVSBIO var24 = field186[var5];
				if (var24 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var24.field976[0], false, field114.field976[0], 1, var24.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(222);
					field86.method360(var5);
				}
			}

			if (var4 == 368) {
				boolean var25 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
				if (!var25) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
				}

				field78 = field718;
				field79 = field719;
				field81 = 2;
				field80 = 0;
				field86.method358(181);
				field86.method393(field151 + var3);
				field86.method393(field150 + var2);
				field86.method394(var5);
			}

			if (var4 == 652) {
				field86.method358(52);
				field86.method360(var3);
				PQPZKUPU var27 = PQPZKUPU.method460(var3);
				if (var27.field1117 != null && var27.field1117[0][0] == 5) {
					int var28 = var27.field1117[0][1];
					field316[var28] = 1 - field316[var28];
					method36(var28);
					field495 = true;
				}
			}

			if (var4 == 114) {
				SOKVSBIO var29 = field186[var5];
				if (var29 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var29.field976[0], false, field114.field976[0], 1, var29.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(193);
					field86.method393(var5);
					field86.method394(field168);
				}
			}

			if (var4 == 37 && method101(var2, var5, var3)) {
				field86.method358(18);
				field86.method393(field164);
				field86.method394(field151 + var3);
				field86.method394(var5 >> 14 & 0x7FFF);
				field86.method393(field165);
				field86.method392(field150 + var2);
				field86.method392(field163);
			}

			if (var4 == 220) {
				field86.method358(206);
				field86.method394(var2);
				field86.method392(var3);
				field86.method393(var5);
				field258 = 0;
				field259 = var3;
				field260 = var2;
				field261 = 2;
				if (PQPZKUPU.method460(var3).field1099 == field484) {
					field261 = 1;
				}

				if (PQPZKUPU.method460(var3).field1099 == field330) {
					field261 = 3;
				}
			}

			if (var4 == 43 && !field264) {
				field86.method358(177);
				field86.method360(var3);
				field264 = true;
			}

			if (var4 == 132) {
				SBPCMLRM var30 = field308[var5];
				if (var30 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var30.field976[0], false, field114.field976[0], 1, var30.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field409++;
					if (field409 >= 129) {
						field86.method358(130);
						field86.method363(0);
						field409 = 0;
					}

					field86.method358(60);
					field86.method394(var5);
				}
			}

			if (var4 == 581) {
				SBPCMLRM var31 = field308[var5];
				if (var31 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var31.field976[0], false, field114.field976[0], 1, var31.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(95);
					field86.method360(field168);
					field86.method392(var5);
				}
			}

			if (var4 == 85) {
				SOKVSBIO var32 = field186[var5];
				if (var32 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var32.field976[0], false, field114.field976[0], 1, var32.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(48);
					field86.method392(var5);
				}
			}

			if (var4 == 924) {
				boolean var33 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
				if (!var33) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
				}

				field78 = field718;
				field79 = field719;
				field81 = 2;
				field80 = 0;
				field86.method358(210);
				field86.method393(field150 + var2);
				field86.method360(field168);
				field86.method394(field151 + var3);
				field86.method360(var5);
			}

			if (var4 == 565) {
				SBPCMLRM var35 = field308[var5];
				if (var35 != null) {
					method76(field114.field975[0], 0, 1, 0, 0, 2, var35.field976[0], false, field114.field976[0], 1, var35.field975[0]);
					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(186);
					field86.method393(var5);
				}
			}

			if (var4 == 1094) {
				SBPCMLRM var36 = field308[var5];
				if (var36 != null) {
					YGGALXYD var37 = var36.field1214;
					if (var37.field1382 != null) {
						var37 = var37.method572();
					}

					if (var37 != null) {
						String var38;
						if (var37.field1387 == null) {
							var38 = "It's a " + var37.field1377 + ".";
						} else {
							var38 = new String(var37.field1387);
						}

						method67(var38, "", 0);
					}
				}
			}

			if (var4 == 138) {
				field162 = 1;
				field163 = var2;
				field164 = var3;
				field165 = var5;
				field166 = WGKWQDPM.method554(var5).field1342;
				field167 = 0;
				field495 = true;
			} else {
				if (var4 == 496) {
					PQPZKUPU var39 = PQPZKUPU.method460(var3);
					boolean var40 = true;
					if (var39.field1067 > 0) {
						var40 = method70(var39);
					}

					if (var40) {
						field86.method358(52);
						field86.method360(var3);
					}
				}

				if (var4 == 364) {
					field86.method358(156);
					field86.method394(var3);
					field86.method392(var2);
					field86.method394(var5);
					field258 = 0;
					field259 = var3;
					field260 = var2;
					field261 = 2;
					if (PQPZKUPU.method460(var3).field1099 == field484) {
						field261 = 1;
					}

					if (PQPZKUPU.method460(var3).field1099 == field330) {
						field261 = 3;
					}
				}

				if (var4 == 168) {
					field86.method358(23);
					field86.method360(var5);
					field86.method392(var3);
					field86.method393(var2);
					field258 = 0;
					field259 = var3;
					field260 = var2;
					field261 = 2;
					if (PQPZKUPU.method460(var3).field1099 == field484) {
						field261 = 1;
					}

					if (PQPZKUPU.method460(var3).field1099 == field330) {
						field261 = 3;
					}
				}

				if (var4 == 1759) {
					WGKWQDPM var41 = WGKWQDPM.method554(var5);
					PQPZKUPU var42 = PQPZKUPU.method460(var3);
					String var43;
					if (var42 != null && var42.field1078[var2] >= 100000) {
						var43 = var42.field1078[var2] + " x " + var41.field1342;
					} else if (var41.field1322 == null) {
						var43 = "It's a " + var41.field1342 + ".";
					} else {
						var43 = new String(var41.field1322);
					}

					method67(var43, "", 0);
				}

				if (var4 == 894 && method101(var2, var5, var3)) {
					field86.method358(237);
					field86.method393(field150 + var2);
					field86.method394(field151 + var3);
					field86.method393(field168);
					field86.method393(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 224) {
					if ((var2 & 0x3) == 0) {
						field112++;
					}

					if (field112 >= 128) {
						field86.method358(58);
						field86.method363(0);
						field112 = 0;
					}

					method101(var2, var5, var3);
					field86.method358(99);
					field86.method392(var5 >> 14 & 0x7FFF);
					field86.method360(field151 + var3);
					field86.method394(field150 + var2);
				}

				if (var4 == 377) {
					field398 += var5;
					if (field398 >= 130) {
						field86.method358(90);
						field86.method363(0);
						field398 = 0;
					}

					field86.method358(31);
					field86.method393(var2);
					field86.method392(var5);
					field86.method360(var3);
					field258 = 0;
					field259 = var3;
					field260 = var2;
					field261 = 2;
					if (PQPZKUPU.method460(var3).field1099 == field484) {
						field261 = 1;
					}

					if (PQPZKUPU.method460(var3).field1099 == field330) {
						field261 = 3;
					}
				}

				if (var4 == 989) {
					boolean var44 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
					if (!var44) {
						method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
					}

					field78 = field718;
					field79 = field719;
					field81 = 2;
					field80 = 0;
					field86.method358(236);
					field86.method393(field151 + var3);
					field86.method393(field165);
					field86.method394(var5);
					field86.method393(field150 + var2);
					field86.method393(field164);
					field86.method393(field163);
				}

				if (var4 == 262) {
					SOKVSBIO var46 = field186[var5];
					if (var46 != null) {
						method76(field114.field975[0], 0, 1, 0, 0, 2, var46.field976[0], false, field114.field976[0], 1, var46.field975[0]);
						field78 = field718;
						field79 = field719;
						field81 = 2;
						field80 = 0;
						field86.method358(235);
						field86.method392(var5);
					}
				}

				if (var4 == 716) {
					SOKVSBIO var47 = field186[var5];
					if (var47 != null) {
						method76(field114.field975[0], 0, 1, 0, 0, 2, var47.field976[0], false, field114.field976[0], 1, var47.field975[0]);
						field78 = field718;
						field79 = field719;
						field81 = 2;
						field80 = 0;
						field86.method358(114);
						field86.method394(var5);
					}
				}

				if (var4 == 158) {
					if (field451) {
						field157.method509(var3 - 4, var2 - 4);
					} else {
						field157.method509(field719 - 4, field718 - 4);
					}
				}

				if (var4 == 619) {
					PQPZKUPU var48 = PQPZKUPU.method460(var3);
					field167 = 1;
					field168 = var3;
					field169 = var48.field1123;
					field162 = 0;
					field495 = true;
					String var49 = var48.field1080;
					if (var49.indexOf(" ") != -1) {
						var49 = var49.substring(0, var49.indexOf(" "));
					}

					String var50 = var48.field1080;
					if (var50.indexOf(" ") != -1) {
						var50 = var50.substring(var50.indexOf(" ") + 1);
					}

					field170 = var49 + " " + var48.field1063 + " " + var50;

					if (field169 == 16) {
						field495 = true;
						field229 = 3;
						field132 = true;
					}
				} else {
					if (var4 == 34) {
						field86.method358(211);
						field86.method393(var5);
						field86.method393(var2);
						field86.method394(var3);
						field258 = 0;
						field259 = var3;
						field260 = var2;
						field261 = 2;
						if (PQPZKUPU.method460(var3).field1099 == field484) {
							field261 = 1;
						}

						if (PQPZKUPU.method460(var3).field1099 == field330) {
							field261 = 3;
						}
					}

					if (var4 == 987) {
						field86.method358(226);
						field86.method393(field168);
						field86.method392(var2);
						field86.method392(var5);
						field86.method392(var3);
						field258 = 0;
						field259 = var3;
						field260 = var2;
						field261 = 2;
						if (PQPZKUPU.method460(var3).field1099 == field484) {
							field261 = 1;
						}

						if (PQPZKUPU.method460(var3).field1099 == field330) {
							field261 = 3;
						}
					}

					if (var4 == 964) {
						SOKVSBIO var51 = field186[var5];
						if (var51 != null) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var51.field976[0], false, field114.field976[0], 1, var51.field975[0]);
							field78 = field718;
							field79 = field719;
							field81 = 2;
							field80 = 0;
							field86.method358(219);
							field86.method360(field164);
							field86.method360(field163);
							field86.method392(field165);
							field86.method392(var5);
						}
					}

					if (var4 == 855) {
						field86.method358(82);
						field86.method394(var3);
						field86.method393(var5);
						field86.method394(var2);
						field258 = 0;
						field259 = var3;
						field260 = var2;
						field261 = 2;
						if (PQPZKUPU.method460(var3).field1099 == field484) {
							field261 = 1;
						}

						if (PQPZKUPU.method460(var3).field1099 == field330) {
							field261 = 3;
						}
					}

					if (var4 == 1876) {
						WGKWQDPM var52 = WGKWQDPM.method554(var5);
						String var53;
						if (var52.field1322 == null) {
							var53 = "It's a " + var52.field1342 + ".";
						} else {
							var53 = new String(var52.field1322);
						}

						method67(var53, "", 0);
					}

					if (var4 == 705) {
						SBPCMLRM var54 = field308[var5];
						if (var54 != null) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var54.field976[0], false, field114.field976[0], 1, var54.field975[0]);
							field78 = field718;
							field79 = field719;
							field81 = 2;
							field80 = 0;
							field86.method358(255);
							field86.method393(var5);
						}
					}

					if (var4 == 181) {
						SBPCMLRM var55 = field308[var5];
						if (var55 != null) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var55.field976[0], false, field114.field976[0], 1, var55.field975[0]);
							field78 = field718;
							field79 = field719;
							field81 = 2;
							field80 = 0;
							field86.method358(168);
							field86.method393(var5);
						}
					}

					if (var4 == 678) {
						String var56 = field399[arg0];
						int var57 = var56.indexOf("@whi@");
						if (var57 != -1) {
							long var58 = OERTMYQW.method440(var56.substring(var57 + 5).trim());
							int var60 = -1;
							for (int var61 = 0; var61 < field357; var61++) {
								if (field408[var61] == var58) {
									var60 = var61;
									break;
								}
							}

							if (var60 != -1 && field137[var60] > 0) {
								field471 = true;
								field58 = 0;
								field64 = true;
								field279 = "";
								field364 = 3;
								field453 = field408[var60];
								field275 = "Enter message to send to " + field215[var60];
							}
						}
					}

					if (var4 == 1) {
						method14();
					}

					if (var4 == 912) {
						if ((field151 & 0x3) == 0) {
							field454++;
						}

						if (field454 >= 57) {
							field86.method358(174);
							field86.method359(24);
							field454 = 0;
						}

						method101(var2, var5, var3);
						field86.method358(248);
						field86.method392(var5 >> 14 & 0x7FFF);
						field86.method394(field150 + var2);
						field86.method394(field151 + var3);
					}

					if (var4 == 48) {
						boolean var62 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
						if (!var62) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
						}

						field78 = field718;
						field79 = field719;
						field81 = 2;
						field80 = 0;
						field469++;
						if (field469 >= 136) {
							field86.method358(36);
							field86.method359(225);
							field469 = 0;
						}

						field86.method358(12);
						field86.method360(field151 + var3);
						field86.method394(field150 + var2);
						field86.method360(var5);
					}

					if (var4 == 495) {
						field237 += var3;
						if (field237 >= 112) {
							field86.method358(42);
							field237 = 0;
						}

						field86.method358(128);
						field86.method393(var2);
						field86.method360(var5);
						field86.method392(var3);
						field258 = 0;
						field259 = var3;
						field260 = var2;
						field261 = 2;
						if (PQPZKUPU.method460(var3).field1099 == field484) {
							field261 = 1;
						}

						if (PQPZKUPU.method460(var3).field1099 == field330) {
							field261 = 3;
						}
					}

					if (var4 == 649) {
						method101(var2, var5, var3);
						field86.method358(32);
						field86.method392(field150 + var2);
						field86.method393(var5 >> 14 & 0x7FFF);
						field86.method394(field151 + var3);
					}

					if (var4 == 357) {
						boolean var64 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
						if (!var64) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
						}

						field78 = field718;
						field79 = field719;
						field81 = 2;
						field80 = 0;
						field86.method358(24);
						field86.method360(field150 + var2);
						field86.method360(var5);
						field86.method392(field151 + var3);
					}

					if (var4 == 1509) {
						int var66 = var5 >> 14 & 0x7FFF;
						LXNLNZCU var67 = LXNLNZCU.method409(var66);
						String var68;
						if (var67.field937 == null) {
							var68 = "It's a " + var67.field938 + ".";
						} else {
							var68 = new String(var67.field937);
						}

						method67(var68, "", 0);
					}

					if (var4 == 670) {
						boolean var69 = method76(field114.field975[0], 0, 0, 0, 0, 2, var3, false, field114.field976[0], 0, var2);
						if (!var69) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var3, false, field114.field976[0], 1, var2);
						}

						field78 = field718;
						field79 = field719;
						field81 = 2;
						field80 = 0;
						field86.method358(151);
						field86.method360(var5);
						field86.method393(field151 + var3);
						field86.method393(field150 + var2);
					}

					if (var4 == 817) {
						if ((var2 & 0x3) == 0) {
							field67++;
						}

						if (field67 >= 94) {
							field86.method358(125);
							field86.method359(25);
							field67 = 0;
						}

						field86.method358(203);
						field86.method393(var2);
						field86.method394(var3);
						field86.method394(var5);
						field258 = 0;
						field259 = var3;
						field260 = var2;
						field261 = 2;
						if (PQPZKUPU.method460(var3).field1099 == field484) {
							field261 = 1;
						}

						if (PQPZKUPU.method460(var3).field1099 == field330) {
							field261 = 3;
						}
					}

					if (var4 == 636) {
						SOKVSBIO var71 = field186[var5];
						if (var71 != null) {
							method76(field114.field975[0], 0, 1, 0, 0, 2, var71.field976[0], false, field114.field976[0], 1, var71.field975[0]);
							field78 = field718;
							field79 = field719;
							field81 = 2;
							field80 = 0;
							field86.method358(26);
							field86.method392(var5);
						}
					}

					if (var4 == 895) {
						method154(field126);
						field126 = -1;
						field471 = true;
					}

					field162 = 0;
					field167 = 0;
					field495 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method87() {
		field304 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field361[var1] = -1;
			for (int var2 = 0; var2 < CWNXCHDT.field529; var2++) {
				if (!CWNXCHDT.field530[var2].field536 && CWNXCHDT.field530[var2].field531 == var1 + (field351 ? 0 : 7)) {
					field361[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method88(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method89() {
		if (field197 && field263 == 2 && EZVBBZYG.field769 != field199) {
			method73(null, "Loading - please wait.");
			field263 = 1;
			field440 = System.currentTimeMillis();
		}

		if (field263 == 1) {
			int var1 = method90();
			if (var1 != 0 && System.currentTimeMillis() - field440 > 360000L) {
				signlink.reporterror(field401 + " glcfb " + field134 + "," + var1 + "," + field197 + "," + field305[0] + "," + field77.method239() + "," + field199 + "," + field323 + "," + field324);
				field440 = System.currentTimeMillis();
			}
		}

		if (field263 == 2 && field262 != field199) {
			field262 = field199;
			method63(field199);
		}
	}

	@ObfuscatedName("client.x(I)I")
	public final int method90() {
		for (int var1 = 0; var1 < field340.length; var1++) {
			if (field340[var1] == null && field465[var1] != -1) {
				return -1;
			}

			if (field434[var1] == null && field466[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field340.length; var3++) {
			byte[] var4 = field434[var3];
			if (var4 != null) {
				int var5 = (field464[var3] >> 8) * 64 - field150;
				int var6 = (field464[var3] & 0xFF) * 64 - field151;
				if (field278) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= EZVBBZYG.method266(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field125) {
			return -4;
		} else {
			field263 = 2;
			EZVBBZYG.field769 = field199;
			method55();
			field86.method358(120);
			return 0;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method91(int arg0) {
		if (!field197) {
			for (int var2 = 0; var2 < field426.length; var2++) {
				int var3 = field426[var2];
				if (CUNPUNFW.field525[var3] >= arg0) {
					ZQSBFHWZ var4 = CUNPUNFW.field519[var3];
					int var5 = var4.field1477 * var4.field1476 - 1;
					int var6 = field107 * var4.field1476 * 2;
					byte[] var7 = var4.field1474;
					byte[] var8 = field85;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1474 = var8;
					field85 = var7;
					CUNPUNFW.method176(var3);
					field65++;
					if (field65 > 1462) {
						field65 = 0;
						field86.method358(231);
						field86.method359(0);
						int var10 = field86.field882;

						if ((int) (Math.random() * 2.0D) == 0) {
							field86.method360(63214);
						}

						if ((int) (Math.random() * 2.0D) == 0) {
							field86.method360(14114);
						}

						field86.method360(16897);
						field86.method359(71);
						field86.method359(77);
						field86.method360((int) (Math.random() * 65536.0D));
						field86.method359(220);
						field86.method359(49);
						field86.method359(45);

						if ((int) (Math.random() * 2.0D) == 0) {
							field86.method360(59782);
						}

						field86.method368(field86.field882 - var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLPQPZKUPU;)V")
	public final void method92(PQPZKUPU arg0) {
		int var2 = arg0.field1067;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field358 == 0) {
				arg0.field1107 = "Loading friend list";
				arg0.field1135 = 0;
			} else if (var2 == 1 && field358 == 1) {
				arg0.field1107 = "Connecting to friendserver";
				arg0.field1135 = 0;
			} else if (var2 == 2 && field358 != 2) {
				arg0.field1107 = "Please wait...";
				arg0.field1135 = 0;
			} else {
				int var3 = field357;
				if (field358 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1107 = "";
					arg0.field1135 = 0;
				} else {
					arg0.field1107 = field215[var2];
					arg0.field1135 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field357;
			if (field358 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1107 = "";
				arg0.field1135 = 0;
			} else {
				if (field137[var2] == 0) {
					arg0.field1107 = "@red@Offline";
				} else if (field137[var2] < 200) {
					if (field137[var2] == field194) {
						arg0.field1107 = "@gre@World" + (field137[var2] - 9);
					} else {
						arg0.field1107 = "@yel@World" + (field137[var2] - 9);
					}
				} else if (field137[var2] == field194) {
					arg0.field1107 = "@gre@Classic" + (field137[var2] - 219);
				} else {
					arg0.field1107 = "@yel@Classic" + (field137[var2] - 219);
				}

				arg0.field1135 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field357;
			if (field358 != 2) {
				var5 = 0;
			}

			arg0.field1100 = var5 * 15 + 20;
			if (arg0.field1100 <= arg0.field1118) {
				arg0.field1100 = arg0.field1118 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field358 == 0) {
				arg0.field1107 = "Loading ignore list";
				arg0.field1135 = 0;
			} else if (var2 == 1 && field358 == 0) {
				arg0.field1107 = "Please wait...";
				arg0.field1135 = 0;
			} else {
				int var6 = field213;
				if (field358 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1107 = "";
					arg0.field1135 = 0;
				} else {
					arg0.field1107 = OERTMYQW.method444(OERTMYQW.method441(field331[var2]));
					arg0.field1135 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1100 = field213 * 15 + 20;
			if (arg0.field1100 <= arg0.field1118) {
				arg0.field1100 = arg0.field1118 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1133 = 150;
			arg0.field1134 = (int) (Math.sin(field155 / 40.0D) * 256.0D) & 0x7FF;

			if (field304) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field361[var7];
					if (var8 >= 0 && !CWNXCHDT.field530[var8].method188()) {
						return;
					}
				}

				field304 = false;
				CYPZUKMB[] var9 = new CYPZUKMB[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field361[var11];
					if (var12 >= 0) {
						var9[var10++] = CWNXCHDT.field530[var12].method189();
					}
				}

				CYPZUKMB var13 = new CYPZUKMB(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field425[var14] != 0) {
						var13.method210(field135[var14][0], field135[var14][field425[var14]]);

						if (var14 == 1) {
							var13.method210(field271[0], field271[field425[var14]]);
						}
					}
				}

				var13.method203();
				var13.method204(EHYLCNJX.field744[field114.field989].field746[0]);
				var13.method213(64, 850, -30, -50, -30, true);
				arg0.field1102 = 5;
				arg0.field1103 = 0;
				PQPZKUPU.method462(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field226 == null) {
				field226 = arg0.field1114;
				field227 = arg0.field1111;
			}

			if (field351) {
				arg0.field1114 = field227;
			} else {
				arg0.field1114 = field226;
			}
		} else if (var2 == 325) {
			if (field226 == null) {
				field226 = arg0.field1114;
				field227 = arg0.field1111;
			}

			if (field351) {
				arg0.field1114 = field226;
			} else {
				arg0.field1114 = field227;
			}
		} else if (var2 == 600) {
			arg0.field1107 = field208;
			if (field155 % 20 < 10) {
				arg0.field1107 = arg0.field1107 + "|";
			} else {
				arg0.field1107 = arg0.field1107 + " ";
			}
		} else if (var2 == 620) {
			if (field319 < 1) {
				arg0.field1107 = "";
			} else if (field366) {
				arg0.field1077 = 0xFF0000;
				arg0.field1107 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1077 = 0xFFFFFF;
				arg0.field1107 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field203 - field173;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1107 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field336 == 0) {
				arg0.field1107 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field336 <= field203) {
				arg0.field1107 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method93(field336);
			} else {
				int var17 = field203 + 14 - field336;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1107 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method93(field336) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field349 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field349 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field349 + " unread messages";
			}

			arg0.field1107 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field291 > 0 && field291 <= field203 + 10) {
				arg0.field1107 = "Last password change:\\n@gre@" + method93(field291);
			} else {
				arg0.field1107 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field334 > 2 && !field196) {
				arg0.field1107 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field334 > 2) {
				arg0.field1107 = "\\n\\nYou have @gre@" + field334 + "@yel@ days of\\nmember credit remaining.";
			} else if (field334 > 0) {
				arg0.field1107 = "You have @gre@" + field334 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1107 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field334 > 2 && !field196) {
				arg0.field1107 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field334 > 0) {
				arg0.field1107 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1107 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field336 > field203) {
				arg0.field1107 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1107 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public final String method93(int arg0) {
		if (arg0 > field203 + 10) {
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

	@ObfuscatedName("client.y(I)V")
	public static final void method94() {
		RHXAQRFP.field1151 = false;
		CUNPUNFW.field506 = false;
		field197 = false;
		EZVBBZYG.field767 = false;
		LXNLNZCU.field917 = false;
	}

	@ObfuscatedName("client.a(LSOKVSBIO;IBII)V")
	public final void method95(SOKVSBIO arg0, int arg1, int arg2, int arg3) {
		if (field114 != arg0 && field108 < 400) {
			String var5;
			if (arg0.field1242 == 0) {
				var5 = arg0.field1235 + method16(arg0.field1220, field114.field1220) + " (level-" + arg0.field1220 + ")";
			} else {
				var5 = arg0.field1235 + " (skill-" + arg0.field1242 + ")";
			}

			if (field162 == 1) {
				field399[field108] = "Use " + field166 + " with @whi@" + var5;
				field232[field108] = 964;
				field233[field108] = arg3;
				field230[field108] = arg1;
				field231[field108] = arg2;
				field108++;
			} else if (field167 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field347[var6] != null) {
						field399[field108] = field347[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field347[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1220 > field114.field1220) {
								var7 = 2000;
							}

							if (field114.field1236 != 0 && arg0.field1236 != 0) {
								if (field114.field1236 == arg0.field1236) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field348[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field232[field108] = var7 + 85;
						}

						if (var6 == 1) {
							field232[field108] = var7 + 72;
						}

						if (var6 == 2) {
							field232[field108] = var7 + 262;
						}

						if (var6 == 3) {
							field232[field108] = var7 + 636;
						}

						if (var6 == 4) {
							field232[field108] = var7 + 716;
						}

						field233[field108] = arg3;
						field230[field108] = arg1;
						field231[field108] = arg2;
						field108++;
					}
				}
			} else if ((field169 & 0x8) == 8) {
				field399[field108] = field170 + " @whi@" + var5;
				field232[field108] = 114;
				field233[field108] = arg3;
				field230[field108] = arg1;
				field231[field108] = arg2;
				field108++;
			}

			for (int var8 = 0; var8 < field108; var8++) {
				if (field232[var8] == 158) {
					field399[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method96(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method97() {
		if (field239 == 2) {
			method42((field253 - field151 << 7) + field256, field254 * 2, (field252 - field150 << 7) + field255);

			if (field160 > -1 && field155 % 20 < 10) {
				field320[0].method541(field160 - 12, field161 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(LLBBVYYXO;BI)V")
	public final void method98(LBBVYYXO arg0, int arg1) {
		if (arg1 == 193) {
			int var3 = arg0.method369();
			int var4 = (var3 >> 4 & 0x7) + field406;
			int var5 = (var3 & 0x7) + field407;
			int var6 = arg0.method371();
			int var7 = arg0.method371();
			int var8 = arg0.method371();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				PACANLMY var9 = field212[field199][var4][var5];
				if (var9 != null) {
					for (SXUWJAYK var10 = (SXUWJAYK) var9.method449(); var10 != null; var10 = (SXUWJAYK) var9.method451()) {
						if ((var6 & 0x7FFF) == var10.field1244 && var10.field1245 == var7) {
							var10.field1245 = var8;
							break;
						}
					}

					method118(var4, var5);
				}
			}
		} else if (arg1 == 209) {
			int var11 = arg0.method389();
			int var12 = (var11 >> 4 & 0x7) + field406;
			int var13 = (var11 & 0x7) + field407;
			int var14 = arg0.method397();
			if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
				PACANLMY var15 = field212[field199][var12][var13];
				if (var15 != null) {
					for (SXUWJAYK var16 = (SXUWJAYK) var15.method449(); var16 != null; var16 = (SXUWJAYK) var15.method451()) {
						if ((var14 & 0x7FFF) == var16.field1244) {
							var16.method464();
							break;
						}
					}

					if (var15.method449() == null) {
						field212[field199][var12][var13] = null;
					}

					method118(var12, var13);
				}
			}
		} else if (arg1 == 98) {
			int var17 = arg0.method369();
			int var18 = (var17 >> 4 & 0x7) + field406;
			int var19 = (var17 & 0x7) + field407;
			int var20 = var18 + arg0.method370();
			int var21 = var19 + arg0.method370();
			int var22 = arg0.method372();
			int var23 = arg0.method371();
			int var24 = arg0.method369() * 4;
			int var25 = arg0.method369() * 4;
			int var26 = arg0.method371();
			int var27 = arg0.method371();
			int var28 = arg0.method369();
			int var29 = arg0.method369();
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && var23 != 0xFFFF) {
				var18 = var18 * 128 + 64;
				var19 = var19 * 128 + 64;
				var20 = var20 * 128 + 64;
				var21 = var21 * 128 + 64;
				ODNHGUWK var30 = new ODNHGUWK(field199, var18, var25, var23, field155 + var26, method147(var18, field199, var19) - var24, var19, field155 + var27, var28, var22, var29);
				var30.method438(var21, var20, method147(var20, field199, var21) - var25, field155 + var26);
				field290.method446(var30);
			}
		} else if (arg1 == 252) {
			int var31 = arg0.method387();
			int var32 = (var31 >> 4 & 0x7) + field406;
			int var33 = (var31 & 0x7) + field407;
			int var34 = arg0.method395();
			int var35 = arg0.method396();
			if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
				SXUWJAYK var36 = new SXUWJAYK();
				var36.field1244 = var34;
				var36.field1245 = var35;

				if (field212[field199][var32][var33] == null) {
					field212[field199][var32][var33] = new PACANLMY();
				}

				field212[field199][var32][var33].method446(var36);
				method118(var32, var33);
			}
		} else if (arg1 == 253) {
			int var37 = arg0.method388();
			int var38 = var37 >> 2;
			int var39 = var37 & 0x3;
			int var40 = field292[var38];
			int var41 = arg0.method387();
			int var42 = (var41 >> 4 & 0x7) + field406;
			int var43 = (var41 & 0x7) + field407;
			if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				method75(var43, var42, var38, -1, -1, field199, var39, 0, var40);
			}
		} else if (arg1 == 93) {
			int var44 = arg0.method395();
			int var45 = arg0.method388();
			int var46 = (var45 >> 4 & 0x7) + field406;
			int var47 = (var45 & 0x7) + field407;
			int var48 = arg0.method371();
			int var49 = arg0.method395();
			if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && field405 != var49) {
				SXUWJAYK var50 = new SXUWJAYK();
				var50.field1244 = var44;
				var50.field1245 = var48;

				if (field212[field199][var46][var47] == null) {
					field212[field199][var46][var47] = new PACANLMY();
				}

				field212[field199][var46][var47].method446(var50);
				method118(var46, var47);
			}
		} else if (arg1 == 31) {
			int var51 = arg0.method369();
			int var52 = (var51 >> 4 & 0x7) + field406;
			int var53 = (var51 & 0x7) + field407;
			int var54 = arg0.method397();
			int var55 = arg0.method388();
			int var56 = var55 >> 2;
			int var57 = var55 & 0x3;
			int var58 = field292[var56];
			if (var52 >= 0 && var53 >= 0 && var52 < 103 && var53 < 103) {
				int var59 = field82[field199][var52][var53];
				int var60 = field82[field199][var52 + 1][var53];
				int var61 = field82[field199][var52 + 1][var53 + 1];
				int var62 = field82[field199][var52][var53 + 1];
				if (var58 == 0) {
					HNPPQVUJ var63 = field157.method493(var53, field199, var52);
					if (var63 != null) {
						int var64 = var63.field848 >> 14 & 0x7FFF;
						if (var56 == 2) {
							var63.field846 = new EAOLBHVU(var60, var54, var62, var57 + 4, var59, 2, false, var64, var61);
							var63.field847 = new EAOLBHVU(var60, var54, var62, var57 + 1 & 0x3, var59, 2, false, var64, var61);
						} else {
							var63.field846 = new EAOLBHVU(var60, var54, var62, var57, var59, var56, false, var64, var61);
						}
					}
				}

				if (var58 == 1) {
					VTSSFZCO var65 = field157.method494(field199, var52, var53);
					if (var65 != null) {
						var65.field1290 = new EAOLBHVU(var60, var54, var62, 0, var59, 4, false, var65.field1291 >> 14 & 0x7FFF, var61);
					}
				}

				if (var58 == 2) {
					ZBDPGTZX var66 = field157.method495(var53, field199, var52);

					if (var56 == 11) {
						var56 = 10;
					}

					if (var66 != null) {
						var66.field1405 = new EAOLBHVU(var60, var54, var62, var57, var59, var56, false, var66.field1413 >> 14 & 0x7FFF, var61);
					}
				}

				if (var58 == 3) {
					PBBPYDCW var67 = field157.method496(var52, var53, field199);
					if (var67 != null) {
						var67.field1060 = new EAOLBHVU(var60, var54, var62, var57, var59, 22, false, var67.field1061 >> 14 & 0x7FFF, var61);
					}
				}
			}
		} else {
			if (arg1 == 206) {
				byte var68 = arg0.method390();
				int var69 = arg0.method388();
				int var70 = var69 >> 2;
				int var71 = var69 & 0x3;
				int var72 = field292[var70];
				int var73 = arg0.method371();
				byte var74 = arg0.method391();
				byte var75 = arg0.method391();
				int var76 = arg0.method395();
				int var77 = arg0.method371();
				byte var78 = arg0.method390();
				int var79 = arg0.method388();
				int var80 = (var79 >> 4 & 0x7) + field406;
				int var81 = (var79 & 0x7) + field407;
				int var82 = arg0.method371();
				SOKVSBIO var83;
				if (field405 == var76) {
					var83 = field114;
				} else {
					var83 = field186[var76];
				}

				if (var83 != null) {
					LXNLNZCU var84 = LXNLNZCU.method409(var77);
					int var85 = field82[field199][var80][var81];
					int var86 = field82[field199][var80 + 1][var81];
					int var87 = field82[field199][var80 + 1][var81 + 1];
					int var88 = field82[field199][var80][var81 + 1];
					CYPZUKMB var89 = var84.method419(var70, var71, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method75(var81, var80, 0, -1, var73 + 1, field199, 0, var82 + 1, var72);
						var83.field1231 = field155 + var82;
						var83.field1232 = field155 + var73;
						var83.field1226 = var89;
						int var90 = var84.field930;
						int var91 = var84.field950;
						if (var71 == 1 || var71 == 3) {
							var90 = var84.field950;
							var91 = var84.field930;
						}

						var83.field1223 = var80 * 128 + var90 * 64;
						var83.field1225 = var81 * 128 + var91 * 64;
						var83.field1224 = method147(var83.field1223, field199, var83.field1225);

						if (var68 > var74) {
							byte var92 = var68;
							var68 = var74;
							var74 = var92;
						}

						if (var75 > var78) {
							byte var93 = var75;
							var75 = var78;
							var78 = var93;
						}

						var83.field1238 = var68 + var80;
						var83.field1240 = var74 + var80;
						var83.field1239 = var75 + var81;
						var83.field1241 = var78 + var81;
					}
				}
			}

			if (arg1 == 122) {
				int var94 = arg0.method389();
				int var95 = (var94 >> 4 & 0x7) + field406;
				int var96 = (var94 & 0x7) + field407;
				int var97 = arg0.method369();
				int var98 = var97 >> 2;
				int var99 = var97 & 0x3;
				int var100 = field292[var98];
				int var101 = arg0.method397();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					method75(var96, var95, var98, var101, -1, field199, var99, 0, var100);
				}
			} else if (arg1 == 46) {
				int var102 = arg0.method369();
				int var103 = (var102 >> 4 & 0x7) + field406;
				int var104 = (var102 & 0x7) + field407;
				int var105 = arg0.method371();
				int var106 = arg0.method369();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field114.field975[0] >= var103 - var107 && field114.field975[0] <= var103 + var107 && field114.field976[0] >= var104 - var107 && field114.field976[0] <= var104 + var107 && field350 && !field197 && field376 < 50) {
					field284[field376] = var105;
					field355[field376] = var108;
					field389[field376] = NUMTWBFA.field1024[var105];
					field376++;
				}
			} else if (arg1 == 187) {
				int var109 = arg0.method369();
				int var110 = (var109 >> 4 & 0x7) + field406;
				int var111 = (var109 & 0x7) + field407;
				int var112 = arg0.method371();
				int var113 = arg0.method369();
				int var114 = arg0.method371();
				if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
					var110 = var110 * 128 + 64;
					var111 = var111 * 128 + 64;
					ADZOUCLA var115 = new ADZOUCLA(var110, var114, var111, field199, method147(var110, field199, var111) - var113, var112, field155);
					field325.method446(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ZIILjava/lang/String;)LFUZJMGZB;")
	public final FUZJMGZB method99(int arg0, String arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field305[0] != null) {
				var6 = field305[0].method420(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field286.reset();
			field286.update(var6);
			int var8 = (int) field286.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new FUZJMGZB(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method51(arg0, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method10(arg4 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				LBBVYYXO var16 = new LBBVYYXO(var15);
				var16.field882 = 3;
				int var17 = var16.method373() + 6;
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
						method51(arg0, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field305[0] != null) {
						field305[0].method421(var6, arg3, var6.length);
					}
				} catch (Exception var28) {
					field305[0] = null;
				}

				if (var6 != null) {
					field286.reset();
					field286.update(var6);
					int var23 = (int) field286.getValue();
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
						method51(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method51(arg0, var11 + " - Retrying in " + var25);
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

				field450 = !field450;
			}
		}

		return new FUZJMGZB(var6);
	}

	@ObfuscatedName("client.a(ILPQPZKUPU;)Z")
	public final boolean method100(PQPZKUPU arg0) {
		int var2 = arg0.field1067;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field399[field108] = "Remove @whi@" + arg0.field1107;
				field232[field108] = 831;
				field108++;
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

		field399[field108] = "Remove @whi@" + field215[var2];
		field232[field108] = 760;
		field108++;
		field399[field108] = "Message @whi@" + field215[var2];
		field232[field108] = 678;
		field108++;
		return true;
	}

	@ObfuscatedName("client.a(ZIII)Z")
	public final boolean method101(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field157.method501(field199, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field435++;
		if (field435 > 76) {
			field435 = 0;
			field86.method358(97);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LXNLNZCU var8 = LXNLNZCU.method409(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field930;
				var10 = var8.field950;
			} else {
				var9 = var8.field950;
				var10 = var8.field930;
			}

			int var11 = var8.field951;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method76(field114.field975[0], 0, var10, 0, var11, 2, arg2, false, field114.field976[0], var9, arg0);
		} else {
			method76(field114.field975[0], var7, 0, var6 + 1, 0, 2, arg2, false, field114.field976[0], 0, arg0);
		}

		field78 = field718;
		field79 = field719;
		field81 = 2;
		field80 = 0;
		return true;
	}

	@ObfuscatedName("client.b(BJ)V")
	public final void method102(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field357; var3++) {
				if (field408[var3] == arg0) {
					field357--;
					field495 = true;

					for (int var4 = var3; var4 < field357; var4++) {
						field215[var4] = field215[var4 + 1];
						field137[var4] = field137[var4 + 1];
						field408[var4] = field408[var4 + 1];
					}

					field86.method358(25);
					field86.method365(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method103() {
		int var1 = 5;
		field353[8] = 0;
		int var2 = 0;
		while (field353[8] == 0) {
			String var3 = "Unknown problem";
			method51(20, "Connecting to web server");

			try {
				DataInputStream var4 = method10("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 356);
				LBBVYYXO var5 = new LBBVYYXO(new byte[40]);
				var4.readFully(var5.field881, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field353[var6] = var5.method374();
				}

				int var7 = var5.method374();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field353[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field353[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field353[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field353[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field353[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field353[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method51(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method51(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field450 = !field450;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field706 != null) {
				return new URL("http://127.0.0.1:" + (field195 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(LZQSBFHWZ;I)V")
	public final void method104(ZQSBFHWZ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field243.length; var3++) {
			field243[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field243[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field244[var9] = (field243[var9 - 1] + field243[var9 + 1] + field243[var9 - 128] + field243[var9 + 128]) / 4;
				}
			}

			int[] var10 = field243;
			field243 = field244;
			field244 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1477; var12++) {
				for (int var13 = 0; var13 < arg0.field1476; var13++) {
					if (arg0.field1474[var11++] != 0) {
						int var14 = var13 + arg0.field1478 + 16;
						int var15 = var12 + arg0.field1479 + 16;
						int var16 = (var15 << 7) + var14;
						field243[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method105() {
		field414.method298();

		if (field467 == 2) {
			byte[] var1 = field368.field1474;
			int[] var2 = GBJWVQAY.field820;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field175.method545(field55, 25, 33, 256, field335, 0, field136, 33, 25, 0);
			field415.method298();
			CUNPUNFW.field517 = field461;
		} else {
			int var5 = field55 + field419 & 0x7FF;
			int var6 = field114.field977 / 32 + 48;
			int var7 = 464 - field114.field978 / 32;
			field202.method545(var5, var7, 151, field472 + 256, field470, 5, field115, 146, var6, 25);
			field175.method545(field55, 25, 33, 256, field335, 0, field136, 33, 25, 0);

			for (int var8 = 0; var8 < field480; var8++) {
				int var9 = field481[var8] * 4 + 2 - field114.field977 / 32;
				int var10 = field482[var8] * 4 + 2 - field114.field978 / 32;
				method129(var9, var10, field417[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					PACANLMY var13 = field212[field199][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field114.field977 / 32;
						int var15 = var12 * 4 + 2 - field114.field978 / 32;
						method129(var14, var15, field371);
					}
				}
			}

			for (int var16 = 0; var16 < field309; var16++) {
				SBPCMLRM var17 = field308[field310[var16]];
				if (var17 != null && var17.method429()) {
					YGGALXYD var18 = var17.field1214;
					if (var18.field1382 != null) {
						var18 = var18.method572();
					}

					if (var18 != null && var18.field1384 && var18.field1374) {
						int var19 = var17.field977 / 32 - field114.field977 / 32;
						int var20 = var17.field978 / 32 - field114.field978 / 32;
						method129(var19, var20, field372);
					}
				}
			}

			for (int var21 = 0; var21 < field187; var21++) {
				SOKVSBIO var22 = field186[field188[var21]];
				if (var22 != null && var22.method429()) {
					int var23 = var22.field977 / 32 - field114.field977 / 32;
					int var24 = var22.field978 / 32 - field114.field978 / 32;
					boolean var25 = false;
					long var26 = OERTMYQW.method440(var22.field1235);
					for (int var28 = 0; var28 < field357; var28++) {
						if (field408[var28] == var26 && field137[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field114.field1236 != 0 && var22.field1236 != 0 && field114.field1236 == var22.field1236) {
						var29 = true;
					}

					if (var25) {
						method129(var23, var24, field374);
					} else if (var29) {
						method129(var23, var24, field375);
					} else {
						method129(var23, var24, field373);
					}
				}
			}

			if (field239 != 0 && field155 % 20 < 10) {
				if (field239 == 1 && field205 >= 0 && field205 < field308.length) {
					SBPCMLRM var30 = field308[field205];
					if (var30 != null) {
						int var31 = var30.field977 / 32 - field114.field977 / 32;
						int var32 = var30.field978 / 32 - field114.field978 / 32;
						method117(var31, var32, field327);
					}
				}

				if (field239 == 2) {
					int var33 = (field252 - field150) * 4 + 2 - field114.field977 / 32;
					int var34 = (field253 - field151) * 4 + 2 - field114.field978 / 32;
					method117(var33, var34, field327);
				}

				if (field239 == 10 && field116 >= 0 && field116 < field186.length) {
					SOKVSBIO var35 = field186[field116];
					if (var35 != null) {
						int var36 = var35.field977 / 32 - field114.field977 / 32;
						int var37 = var35.field978 / 32 - field114.field978 / 32;
						method117(var36, var37, field327);
					}
				}
			}

			if (field200 != 0) {
				int var38 = field200 * 4 + 2 - field114.field977 / 32;
				int var39 = field201 * 4 + 2 - field114.field978 / 32;
				method129(var38, var39, field326);
			}

			GBJWVQAY.method289(3, 97, 0xFFFFFF, 78, 3);
			field415.method298();
			CUNPUNFW.field517 = field461;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method106() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.b(LLBBVYYXO;II)V")
	public final void method107(LBBVYYXO arg0, int arg1) {
		for (int var3 = 0; var3 < field189; var3++) {
			int var4 = field190[var3];
			SOKVSBIO var5 = field186[var4];
			int var6 = arg0.method369();
			if ((var6 & 0x2) != 0) {
				var6 += arg0.method369() << 8;
			}

			method116(var4, var5, var6, arg0);
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method108() {
		for (FIMQRVPL var1 = (FIMQRVPL) field71.method449(); var1 != null; var1 = (FIMQRVPL) field71.method451()) {
			if (var1.field791 == -1) {
				var1.field802 = 0;
				method137(var1);
			} else {
				var1.method464();
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method109(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field213; var3++) {
				if (field331[var3] == arg0) {
					field213--;
					field495 = true;

					for (int var4 = var3; var4 < field213; var4++) {
						field331[var4] = field331[var4 + 1];
					}

					field86.method358(246);
					field86.method365(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method110() {
		short var1 = 256;

		if (field457 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field457 > 768) {
					field121[var2] = method96(field122[var2], field123[var2], 1024 - field457);
				} else if (field457 > 256) {
					field121[var2] = field123[var2];
				} else {
					field121[var2] = method96(field123[var2], field122[var2], 256 - field457);
				}
			}
		} else if (field458 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field458 > 768) {
					field121[var3] = method96(field122[var3], field124[var3], 1024 - field458);
				} else if (field458 > 256) {
					field121[var3] = field124[var3];
				} else {
					field121[var3] = method96(field124[var3], field122[var3], 256 - field458);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field121[var4] = field122[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field220.field850[var5] = field436.field1293[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field332[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field287[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field121[var12];
					int var15 = field220.field850[var7];
					field220.field850[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field220.method299(field703, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field221.field850[var16] = field437.field1293[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field332[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field287[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field121[var23];
					int var26 = field221.field850[var18];
					field221.field850[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field221.method299(field703, 637, 0);
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method111(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field313[var4] != null) {
				int var5 = field311[var4];
				int var6 = field321 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field312[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field211 == 0 || field211 == 1 && method12(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field114.field1235)) {
						if (field319 >= 1) {
							field399[field108] = "Report abuse @whi@" + var7;
							field232[field108] = 564;
							field108++;
						}

						field399[field108] = "Add ignore @whi@" + var7;
						field232[field108] = 502;
						field108++;
						field399[field108] = "Add friend @whi@" + var7;
						field232[field108] = 308;
						field108++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field76 == 0 && (var5 == 7 || field83 == 0 || field83 == 1 && method12(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field319 >= 1) {
							field399[field108] = "Report abuse @whi@" + var7;
							field232[field108] = 564;
							field108++;
						}

						field399[field108] = "Add ignore @whi@" + var7;
						field232[field108] = 502;
						field108++;
						field399[field108] = "Add friend @whi@" + var7;
						field232[field108] = 308;
						field108++;
					}

					var3++;
				}

				if (var5 == 4 && (field72 == 0 || field72 == 1 && method12(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field399[field108] = "Accept trade @whi@" + var7;
						field232[field108] = 455;
						field108++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field76 == 0 && field83 < 2) {
					var3++;
				}

				if (var5 == 8 && (field72 == 0 || field72 == 1 && method12(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field399[field108] = "Accept challenge @whi@" + var7;
						field232[field108] = 899;
						field108++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
			if (field197 && field199 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field157.method497(arg5, arg6, arg0);
			}

			if (arg2 == 1) {
				var8 = field157.method498(arg5, arg6, arg0);
			}

			if (arg2 == 2) {
				var8 = field157.method499(arg5, arg6, arg0);
			}

			if (arg2 == 3) {
				var8 = field157.method500(arg5, arg6, arg0);
			}

			if (var8 != 0) {
				int var12 = field157.method501(arg5, arg6, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field157.method488(arg5, arg6, arg0);
					LXNLNZCU var16 = LXNLNZCU.method409(var13);
					if (var16.field910) {
						field463[arg5].method162(var16.field923, arg0, var15, arg6, var14);
					}
				}

				if (arg2 == 1) {
					field157.method489(arg5, arg0, arg6);
				}

				if (arg2 == 2) {
					field157.method490(arg5, arg0, arg6);
					LXNLNZCU var17 = LXNLNZCU.method409(var13);
					if (var17.field930 + arg6 > 103 || var17.field930 + arg0 > 103 || var17.field950 + arg6 > 103 || var17.field950 + arg0 > 103) {
						return;
					}

					if (var17.field910) {
						field463[arg5].method163(arg0, var17.field923, var15, arg6, var17.field930, var17.field950);
					}
				}

				if (arg2 == 3) {
					field157.method491(arg6, arg5, arg0);
					LXNLNZCU var18 = LXNLNZCU.method409(var13);
					if (var18.field910 && var18.field924) {
						field463[arg5].method165(arg0, arg6);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field139[1][arg6][arg0] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				EZVBBZYG.method257(arg4, field82, arg5, var19, arg1, field463[arg5], arg0, arg3, field157, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method113() {
		method51(20, "Starting up");

		if (signlink.sunjava) {
			field697 = 5;
		}

		if (field400) {
			field176 = true;
		} else {
			field400 = true;
			boolean var1 = false;
			String var2 = method57();
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
						field305[var3] = new MACXPWDL(signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method103();
					field445 = method99(25, "title screen", field353[1], 1, "title");
					field421 = new ZTYSAOXK(false, "p11_full", field445);
					field422 = new ZTYSAOXK(false, "p12_full", field445);
					field423 = new ZTYSAOXK(false, "b12_full", field445);
					field424 = new ZTYSAOXK(true, "q8_full", field445);
					method68();
					method13();
					FUZJMGZB var4 = method99(30, "config", field353[2], 2, "config");
					FUZJMGZB var5 = method99(35, "interface", field353[3], 3, "interface");
					FUZJMGZB var6 = method99(40, "2d graphics", field353[4], 4, "media");
					FUZJMGZB var7 = method99(45, "textures", field353[6], 6, "textures");
					FUZJMGZB var8 = method99(50, "chat system", field353[7], 7, "wordenc");
					FUZJMGZB var9 = method99(55, "sound effects", field353[8], 8, "sounds");
					field139 = new byte[4][104][104];
					field82 = new int[4][105][105];
					field157 = new RHXAQRFP(104, field82, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field463[var10] = new CRVZDSLK(104, 104);
					}

					field202 = new VZJVQLEE(512, 512);
					FUZJMGZB var11 = method99(60, "update list", field353[5], 5, "versionlist");
					method51(60, "Connecting to update server");
					field77 = new EBLTOQBO();
					field77.method224(var11, this);
					QGRLAQIF.method465(field77.method245());
					CYPZUKMB.method193(field77.method235(0), field77);

					if (!field197) {
						field474 = 0;
						field475 = true;
						field77.method240(2, field474);

						while (field77.method239() > 0) {
							method33();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field77.field669 > 3) {
								method146("ondemand");
								return;
							}
						}
					}

					method51(65, "Requesting animations");
					int var12 = field77.method235(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field77.method240(1, var13);
					}

					while (field77.method239() > 0) {
						int var14 = var12 - field77.method239();
						if (var14 > 0) {
							method51(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method33();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field77.field669 > 3) {
							method146("ondemand");
							return;
						}
					}

					method51(70, "Requesting models");
					int var15 = field77.method235(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field77.method229(var16);
						if ((var17 & 0x1) != 0) {
							field77.method240(0, var16);
						}
					}

					int var18 = field77.method239();
					while (field77.method239() > 0) {
						int var19 = var18 - field77.method239();
						if (var19 > 0) {
							method51(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method33();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field305[0] != null) {
						method51(75, "Requesting maps");
						field77.method240(3, field77.method236(48, 0, 47));
						field77.method240(3, field77.method236(48, 1, 47));
						field77.method240(3, field77.method236(48, 0, 48));
						field77.method240(3, field77.method236(48, 1, 48));
						field77.method240(3, field77.method236(48, 0, 49));
						field77.method240(3, field77.method236(48, 1, 49));
						field77.method240(3, field77.method236(47, 0, 47));
						field77.method240(3, field77.method236(47, 1, 47));
						field77.method240(3, field77.method236(47, 0, 48));
						field77.method240(3, field77.method236(47, 1, 48));
						field77.method240(3, field77.method236(148, 0, 48));
						field77.method240(3, field77.method236(148, 1, 48));
						int var20 = field77.method239();
						while (field77.method239() > 0) {
							int var21 = var20 - field77.method239();
							if (var21 > 0) {
								method51(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method33();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field77.method235(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field77.method229(var23);
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
							field77.method238(var25, var23, 0);
						}
					}

					field77.method225(field196);

					if (!field197) {
						int var26 = field77.method235(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field77.method233(var27)) {
								field77.method238((byte) 1, var27, 2);
							}
						}
					}

					method51(80, "Unpacking media");
					field367 = new ZQSBFHWZ(var6, "invback", 0);
					field369 = new ZQSBFHWZ(var6, "chatback", 0);
					field368 = new ZQSBFHWZ(var6, "mapback", 0);
					field247 = new ZQSBFHWZ(var6, "backbase1", 0);
					field248 = new ZQSBFHWZ(var6, "backbase2", 0);
					field249 = new ZQSBFHWZ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field339[var28] = new ZQSBFHWZ(var6, "sideicons", var28);
					}

					field175 = new VZJVQLEE(var6, "compass", 0);
					field341 = new VZJVQLEE(var6, "mapedge", 0);
					field341.method538();

					for (int var29 = 0; var29 < 72; var29++) {
						field338[var29] = new ZQSBFHWZ(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field138[var30] = new VZJVQLEE(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field486[var31] = new VZJVQLEE(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field84[var32] = new VZJVQLEE(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field216[var33] = new VZJVQLEE(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field320[var34] = new VZJVQLEE(var6, "headicons_hint", var34);
					}

					field242 = new VZJVQLEE(var6, "overlay_multiway", 0);
					field326 = new VZJVQLEE(var6, "mapmarker", 0);
					field327 = new VZJVQLEE(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field280[var35] = new VZJVQLEE(var6, "cross", var35);
					}

					field371 = new VZJVQLEE(var6, "mapdots", 0);
					field372 = new VZJVQLEE(var6, "mapdots", 1);
					field373 = new VZJVQLEE(var6, "mapdots", 2);
					field374 = new VZJVQLEE(var6, "mapdots", 3);
					field375 = new VZJVQLEE(var6, "mapdots", 4);
					field109 = new ZQSBFHWZ(var6, "scrollbar", 0);
					field110 = new ZQSBFHWZ(var6, "scrollbar", 1);
					field427 = new ZQSBFHWZ(var6, "redstone1", 0);
					field428 = new ZQSBFHWZ(var6, "redstone2", 0);
					field429 = new ZQSBFHWZ(var6, "redstone3", 0);
					field430 = new ZQSBFHWZ(var6, "redstone1", 0);
					field430.method583();
					field431 = new ZQSBFHWZ(var6, "redstone2", 0);
					field431.method583();
					field89 = new ZQSBFHWZ(var6, "redstone1", 0);
					field89.method584();
					field90 = new ZQSBFHWZ(var6, "redstone2", 0);
					field90.method584();
					field91 = new ZQSBFHWZ(var6, "redstone3", 0);
					field91.method584();
					field92 = new ZQSBFHWZ(var6, "redstone1", 0);
					field92.method583();
					field92.method584();
					field93 = new ZQSBFHWZ(var6, "redstone2", 0);
					field93.method583();
					field93.method584();

					for (int var36 = 0; var36 < 2; var36++) {
						field318[var36] = new ZQSBFHWZ(var6, "mod_icons", var36);
					}

					VZJVQLEE var37 = new VZJVQLEE(var6, "backleft1", 0);
					field380 = new HURULSIZ(var37.field1295, var37.field1294, method65());
					var37.method539(0, 0);
					VZJVQLEE var38 = new VZJVQLEE(var6, "backleft2", 0);
					field381 = new HURULSIZ(var38.field1295, var38.field1294, method65());
					var38.method539(0, 0);
					VZJVQLEE var39 = new VZJVQLEE(var6, "backright1", 0);
					field382 = new HURULSIZ(var39.field1295, var39.field1294, method65());
					var39.method539(0, 0);
					VZJVQLEE var40 = new VZJVQLEE(var6, "backright2", 0);
					field383 = new HURULSIZ(var40.field1295, var40.field1294, method65());
					var40.method539(0, 0);
					VZJVQLEE var41 = new VZJVQLEE(var6, "backtop1", 0);
					field384 = new HURULSIZ(var41.field1295, var41.field1294, method65());
					var41.method539(0, 0);
					VZJVQLEE var42 = new VZJVQLEE(var6, "backvmid1", 0);
					field385 = new HURULSIZ(var42.field1295, var42.field1294, method65());
					var42.method539(0, 0);
					VZJVQLEE var43 = new VZJVQLEE(var6, "backvmid2", 0);
					field386 = new HURULSIZ(var43.field1295, var43.field1294, method65());
					var43.method539(0, 0);
					VZJVQLEE var44 = new VZJVQLEE(var6, "backvmid3", 0);
					field387 = new HURULSIZ(var44.field1295, var44.field1294, method65());
					var44.method539(0, 0);
					VZJVQLEE var45 = new VZJVQLEE(var6, "backhmid2", 0);
					field388 = new HURULSIZ(var45.field1295, var45.field1294, method65());
					var45.method539(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field138[var50] != null) {
							field138[var50].method537(var47 + var49, var46 + var49, var48 + var49);
						}

						if (field338[var50] != null) {
							field338[var50].method585(var47 + var49, var46 + var49, var48 + var49);
						}
					}

					method51(83, "Unpacking textures");
					CUNPUNFW.method174(var7);
					CUNPUNFW.method178(0.8D);
					CUNPUNFW.method173(20);
					method51(86, "Unpacking config");
					EHYLCNJX.method251(var4);
					LXNLNZCU.method411(var4);
					AKWMUTZI.method3(var4);
					WGKWQDPM.method555(var4);
					YGGALXYD.method576(var4);
					CWNXCHDT.method186(var4);
					BZLQCUPI.method7(var4);
					LSIUBIYU.method407(var4);
					GJIMXWNM.method296(var4);
					WGKWQDPM.field1301 = field196;

					if (!field197) {
						method51(90, "Unpacking sounds");
						byte[] var51 = var9.method277("sounds.dat", null);
						LBBVYYXO var52 = new LBBVYYXO(var51);
						NUMTWBFA.method432(var52);
					}

					method51(95, "Unpacking interfaces");
					ZTYSAOXK[] var53 = new ZTYSAOXK[] { field421, field422, field423, field424 };
					PQPZKUPU.method455(var5, var6, var53);
					method51(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field368.field1474[field368.field1476 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field335[var54] = var55;
						field136[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field368.field1474[field368.field1476 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field470[var58 - 5] = var59 - 25;
						field115[var58 - 5] = var60 - var59;
					}

					CUNPUNFW.method171(503, 765);
					field462 = CUNPUNFW.field517;
					CUNPUNFW.method171(96, 479);
					field459 = CUNPUNFW.field517;
					CUNPUNFW.method171(261, 190);
					field460 = CUNPUNFW.field517;
					CUNPUNFW.method171(334, 512);
					field461 = CUNPUNFW.field517;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = CUNPUNFW.field515[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					RHXAQRFP.method507(var62, 800, 512, 334, 500);
					JVGHFIOO.method301(var8);
					field391 = new FDKYSOCX(this);
					method58(field391, 10);
					EAOLBHVU.field642 = this;
					LXNLNZCU.field947 = this;
					YGGALXYD.field1383 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field272 + " " + field73);
					field149 = true;
				}
			} else {
				field269 = true;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method114(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field232[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 308) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(LPQPZKUPU;I)Z")
	public final boolean method115(PQPZKUPU arg0) {
		if (arg0.field1091 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1091.length; var2++) {
			int var3 = method85(var2, arg0);
			int var4 = arg0.field1072[var2];
			if (arg0.field1091[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1091[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1091[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IILSOKVSBIO;ILLBBVYYXO;)V")
	public final void method116(int arg0, SOKVSBIO arg1, int arg2, LBBVYYXO arg3) {
		if ((arg2 & 0x40) != 0) {
			arg1.field1007 = arg3.method395();
			if (arg1.field1007 == 0xFFFF) {
				arg1.field1007 = -1;
			}
		}

		if ((arg2 & 0x80) != 0) {
			int var5 = arg3.method388();
			byte[] var6 = new byte[var5];
			LBBVYYXO var7 = new LBBVYYXO(var6);
			arg3.method406(var5, 0, var6);
			field191[arg0] = var7;
			arg1.method526(var7);
		}

		if ((arg2 & 0x100) != 0) {
			arg1.field969 = arg3.method371();
			int var8 = arg3.method374();
			arg1.field973 = var8 >> 16;
			arg1.field972 = (var8 & 0xFFFF) + field155;
			arg1.field970 = 0;
			arg1.field971 = 0;

			if (arg1.field972 > field155) {
				arg1.field970 = -1;
			}

			if (arg1.field969 == 0xFFFF) {
				arg1.field969 = -1;
			}
		}

		if ((arg2 & 0x400) != 0) {
			arg1.field1008 = arg3.method389();
			arg1.field1010 = arg3.method369();
			arg1.field1009 = arg3.method369();
			arg1.field1011 = arg3.method369();
			arg1.field1012 = arg3.method371() + field155;
			arg1.field1013 = arg3.method396() + field155;
			arg1.field1014 = arg3.method388();
			arg1.method427();
		}

		if ((arg2 & 0x20) != 0) {
			int var9 = arg3.method369();
			int var10 = arg3.method369();
			arg1.method431(var9, field155, var10);
			arg1.field1020 = field155 + 300;
			arg1.field1021 = arg3.method389();
			arg1.field1022 = arg3.method389();
		}

		if ((arg2 & 0x8) != 0) {
			int var11 = arg3.method395();
			int var12 = arg3.method388();
			int var13 = arg3.method389();
			int var14 = arg3.field882;

			if (arg1.field1235 != null && arg1.field1218) {
				long var15 = OERTMYQW.method440(arg1.field1235);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field213; var18++) {
						if (field331[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field120 == 0) {
					try {
						field307.field882 = 0;
						arg3.method406(var13, 0, field307.field881);
						field307.field882 = 0;
						String var19 = SLOJMIHA.method523(field307, var13);
						var19 = JVGHFIOO.method311(var19);
						arg1.field1006 = var19;
						arg1.field997 = var11 >> 8;
						arg1.field974 = var11 & 0xFF;
						arg1.field993 = 150;

						if (var12 == 2 || var12 == 3) {
							method67(var19, "@cr2@" + arg1.field1235, 1);
						} else if (var12 == 1) {
							method67(var19, "@cr1@" + arg1.field1235, 1);
						} else {
							method67(var19, arg1.field1235, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field882 = var13 + var14;
		}

		if ((arg2 & 0x4) != 0) {
			arg1.field1006 = arg3.method376();
			if (arg1.field1006.charAt(0) == '~') {
				arg1.field1006 = arg1.field1006.substring(1);
				method67(arg1.field1006, arg1.field1235, 2);
			} else if (field114 == arg1) {
				method67(arg1.field1006, arg1.field1235, 2);
			}

			arg1.field997 = 0;
			arg1.field974 = 0;
			arg1.field993 = 150;
		}

		if ((arg2 & 0x200) != 0) {
			int var21 = arg3.method369();
			int var22 = arg3.method369();
			arg1.method431(var21, field155, var22);
			arg1.field1020 = field155 + 300;
			arg1.field1021 = arg3.method369();
			arg1.field1022 = arg3.method388();
		}

		if ((arg2 & 0x1) != 0) {
			int var23 = arg3.method395();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg3.method388();
			if (arg1.field1015 == var23 && var23 != -1) {
				int var25 = EHYLCNJX.field744[var23].field758;
				if (var25 == 1) {
					arg1.field1016 = 0;
					arg1.field1017 = 0;
					arg1.field1018 = var24;
					arg1.field1019 = 0;
				}

				if (var25 == 2) {
					arg1.field1019 = 0;
				}
			} else if (var23 == -1 || arg1.field1015 == -1 || EHYLCNJX.field744[var23].field752 >= EHYLCNJX.field744[arg1.field1015].field752) {
				arg1.field1015 = var23;
				arg1.field1016 = 0;
				arg1.field1017 = 0;
				arg1.field1018 = var24;
				arg1.field1019 = 0;
				arg1.field980 = arg1.field998;
			}
		}

		if ((arg2 & 0x10) != 0) {
			arg1.field995 = arg3.method397();
			arg1.field996 = arg3.method395();
		}
	}

	@ObfuscatedName("client.a(IIILVZJVQLEE;)V")
	public final void method117(int arg0, int arg1, VZJVQLEE arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field55 + field419 & 0x7FF;
			int var6 = CYPZUKMB.field605[var5];
			int var7 = CYPZUKMB.field606[var5];
			var6 = var6 * 256 / (field472 + 256);
			var7 = var7 * 256 / (field472 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field341.method546(15, 20, 15, 20, var10, 256, 83 - var13 - 20, var12 + 94 + 4 - 10);
		} else {
			method129(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method118(int arg0, int arg1) {
		PACANLMY var3 = field212[field199][arg0][arg1];
		if (var3 == null) {
			field157.method492(field199, arg0, arg1);
		} else {
			int var4 = -99999999;
			SXUWJAYK var5 = null;
			for (SXUWJAYK var6 = (SXUWJAYK) var3.method449(); var6 != null; var6 = (SXUWJAYK) var3.method451()) {
				WGKWQDPM var7 = WGKWQDPM.method554(var6.field1244);
				int var8 = var7.field1312;
				if (var7.field1343) {
					var8 = (var6.field1245 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method447(var5);
			SXUWJAYK var9 = null;
			SXUWJAYK var10 = null;
			for (SXUWJAYK var11 = (SXUWJAYK) var3.method449(); var11 != null; var11 = (SXUWJAYK) var3.method451()) {
				if (var5.field1244 != var11.field1244 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1244 != var11.field1244 && var9.field1244 != var11.field1244 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field157.method478(field199, var5, arg1, var10, var9, method147(arg0 * 128 + 64, field199, arg1 * 128 + 64), var12, arg0);
		}
	}

	@ObfuscatedName("client.a(IBLLBBVYYXO;)V")
	public final void method119(int arg0, LBBVYYXO arg1) {
		arg1.method379();
		int var3 = arg1.method380(1);
		if (var3 != 0) {
			int var4 = arg1.method380(2);
			if (var4 == 0) {
				field190[field189++] = field185;
			} else if (var4 == 1) {
				int var5 = arg1.method380(3);
				field114.method428(var5, false);
				int var6 = arg1.method380(1);
				if (var6 == 1) {
					field190[field189++] = field185;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method380(3);
				field114.method428(var7, true);
				int var8 = arg1.method380(3);
				field114.method428(var8, true);
				int var9 = arg1.method380(1);
				if (var9 == 1) {
					field190[field189++] = field185;
				}
			} else if (var4 == 3) {
				field199 = arg1.method380(2);
				int var10 = arg1.method380(7);
				int var11 = arg1.method380(1);
				int var12 = arg1.method380(1);
				if (var12 == 1) {
					field190[field189++] = field185;
				}

				int var13 = arg1.method380(7);
				field114.method430(var13, var10, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.c(LLBBVYYXO;II)V")
	public final void method120(LBBVYYXO arg0, int arg1) {
		for (int var3 = 0; var3 < field189; var3++) {
			int var4 = field190[var3];
			SBPCMLRM var5 = field308[var4];
			int var6 = arg0.method369();
			if ((var6 & 0x10) != 0) {
				var5.field995 = arg0.method395();
				var5.field996 = arg0.method396();
			}

			if ((var6 & 0x80) != 0) {
				int var7 = arg0.method387();
				int var8 = arg0.method388();
				var5.method431(var7, field155, var8);
				var5.field1020 = field155 + 300;
				var5.field1021 = arg0.method388();
				var5.field1022 = arg0.method369();
			}

			if ((var6 & 0x20) != 0) {
				var5.field1214 = YGGALXYD.method575(arg0.method371());
				var5.field992 = var5.field1214.field1392;
				var5.field1001 = var5.field1214.field1395;
				var5.field981 = var5.field1214.field1394;
				var5.field982 = var5.field1214.field1361;
				var5.field983 = var5.field1214.field1373;
				var5.field984 = var5.field1214.field1391;
				var5.field989 = var5.field1214.field1385;
			}

			if ((var6 & 0x4) != 0) {
				var5.field969 = arg0.method395();
				int var9 = arg0.method402();
				var5.field973 = var9 >> 16;
				var5.field972 = (var9 & 0xFFFF) + field155;
				var5.field970 = 0;
				var5.field971 = 0;

				if (var5.field972 > field155) {
					var5.field970 = -1;
				}

				if (var5.field969 == 0xFFFF) {
					var5.field969 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1006 = arg0.method376();
				var5.field993 = 100;
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg0.method396();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method388();
				if (var5.field1015 == var10 && var10 != -1) {
					int var12 = EHYLCNJX.field744[var10].field758;
					if (var12 == 1) {
						var5.field1016 = 0;
						var5.field1017 = 0;
						var5.field1018 = var11;
						var5.field1019 = 0;
					}

					if (var12 == 2) {
						var5.field1019 = 0;
					}
				} else if (var10 == -1 || var5.field1015 == -1 || EHYLCNJX.field744[var10].field752 >= EHYLCNJX.field744[var5.field1015].field752) {
					var5.field1015 = var10;
					var5.field1016 = 0;
					var5.field1017 = 0;
					var5.field1018 = var11;
					var5.field1019 = 0;
					var5.field980 = var5.field998;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1007 = arg0.method371();
				if (var5.field1007 == 0xFFFF) {
					var5.field1007 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg0.method388();
				int var14 = arg0.method389();
				var5.method431(var13, field155, var14);
				var5.field1020 = field155 + 300;
				var5.field1021 = arg0.method387();
				var5.field1022 = arg0.method389();
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method121() {
		if (field491 == 0) {
			field399[0] = "Cancel";
			field232[0] = 1321;
			field108 = 1;
			if (field127 == -1) {
				method127();
				field455 = 0;
				field141 = 0;

				if (field711 > 4 && field712 > 4 && field711 < 516 && field712 < 338) {
					if (field484 == -1) {
						method66();
					} else {
						method50(0, 0, field711, PQPZKUPU.method460(field484), 4, 4, field712);
					}
				}

				if (field455 != field352) {
					field352 = field455;
				}

				if (field296 != field141) {
					field296 = field141;
				}

				field455 = 0;
				field141 = 0;

				if (field711 > 553 && field712 > 205 && field711 < 743 && field712 < 466) {
					if (field397 != -1) {
						method50(0, 1, field711, PQPZKUPU.method460(field397), 553, 205, field712);
					} else if (field315[field229] != -1) {
						method50(0, 1, field711, PQPZKUPU.method460(field315[field229]), 553, 205, field712);
					}
				}

				if (field483 != field455) {
					field495 = true;
					field483 = field455;
				}

				if (field303 != field141) {
					field495 = true;
					field303 = field141;
				}

				field455 = 0;
				field141 = 0;

				if (field711 > 17 && field712 > 357 && field711 < 496 && field712 < 453) {
					if (field330 != -1) {
						method50(0, 2, field711, PQPZKUPU.method460(field330), 17, 357, field712);
					} else if (field126 != -1) {
						method50(0, 3, field711, PQPZKUPU.method460(field126), 17, 357, field712);
					} else if (field712 < 434 && field711 < 426 && field58 == 0) {
						method111(field711 - 17, field712 - 357);
					}
				}

				if ((field330 != -1 || field126 != -1) && field455 != field418) {
					field471 = true;
					field418 = field455;
				}

				if ((field330 != -1 || field126 != -1) && field433 != field141) {
					field471 = true;
					field433 = field141;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field108 - 1; var2++) {
						if (field232[var2] < 1000 && field232[var2 + 1] > 1000) {
							String var3 = field399[var2];
							field399[var2] = field399[var2 + 1];
							field399[var2 + 1] = var3;
							int var4 = field232[var2];
							field232[var2] = field232[var2 + 1];
							field232[var2 + 1] = var4;
							int var5 = field230[var2];
							field230[var2] = field230[var2 + 1];
							field230[var2 + 1] = var5;
							int var6 = field231[var2];
							field231[var2] = field231[var2 + 1];
							field231[var2 + 1] = var6;
							int var7 = field233[var2];
							field233[var2] = field233[var2 + 1];
							field233[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field455 = 0;
				field141 = 0;
				method50(0, 0, field711, PQPZKUPU.method460(field127), 0, 0, field712);

				if (field455 != field352) {
					field352 = field455;
				}

				if (field296 != field141) {
					field296 = field141;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLLBBVYYXO;I)V")
	public final void method122(LBBVYYXO arg0, int arg1) {
		field476 = 0;
		field189 = 0;
		method119(arg1, arg0);
		method32(arg0, arg1);
		method29(arg1, arg0);
		method107(arg0, arg1);

		for (int var3 = 0; var3 < field476; var3++) {
			int var4 = field477[var3];
			if (field155 != field186[var4].field968) {
				field186[var4] = null;
			}
		}

		if (arg0.field882 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field882 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field187; var5++) {
			if (field186[field188[var5]] == null) {
				signlink.reporterror(field401 + " null entry in pl list - pos:" + var5 + " size:" + field187);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method123() {
		field307 = null;
		field447 = null;
		field448 = null;
		field449 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field430 = null;
		field431 = null;
		field175 = null;
		field486 = null;
		field84 = null;
		field216 = null;
		field320 = null;
		field280 = null;
		field89 = null;
		field90 = null;
		field91 = null;
		field92 = null;
		field93 = null;
		field85 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field387 = null;
		field388 = null;
		field290 = null;
		field325 = null;
		field339 = null;
		field308 = null;
		field310 = null;
		field186 = null;
		field188 = null;
		field190 = null;
		field191 = null;
		field477 = null;
		field371 = null;
		field372 = null;
		field373 = null;
		field374 = null;
		field375 = null;
		field113 = null;
		field367 = null;
		field368 = null;
		field369 = null;
		field333 = null;
		field177 = null;
		field294 = null;
		field295 = null;
		field242 = null;

		if (field391 != null) {
			field391.field788 = false;
		}

		field391 = null;

		if (field77 != null) {
			field77.method227();
		}

		field77 = null;
		field338 = null;
		field138 = null;
		field202 = null;

		try {
			if (field285 != null) {
				field285.method278();
			}
		} catch (Exception var1) {
		}

		field285 = null;
		field380 = null;
		field381 = null;
		field382 = null;
		field383 = null;
		field481 = null;
		field482 = null;
		field417 = null;
		field212 = null;
		field71 = null;
		field220 = null;
		field221 = null;
		field217 = null;
		field218 = null;
		field219 = null;
		field247 = null;
		field248 = null;
		field249 = null;
		field215 = null;
		field408 = null;
		field137 = null;
		field413 = null;
		field414 = null;
		field415 = null;
		field416 = null;
		field316 = null;
		field222 = null;
		field223 = null;
		field224 = null;
		field225 = null;
		method106();
		field464 = null;
		field340 = null;
		field434 = null;
		field465 = null;
		field466 = null;
		field86 = null;
		field412 = null;
		field487 = null;
		field82 = null;
		field139 = null;
		field157 = null;
		field463 = null;
		field230 = null;
		field231 = null;
		field232 = null;
		field233 = null;
		field399 = null;
		method11();
		LXNLNZCU.method413();
		YGGALXYD.method573();
		WGKWQDPM.method556();
		PQPZKUPU.method457();
		AKWMUTZI.field28 = null;
		CWNXCHDT.field530 = null;
		DYLBRHZY.field632 = null;
		EHYLCNJX.field744 = null;
		BZLQCUPI.field41 = null;
		BZLQCUPI.field53 = null;
		LSIUBIYU.field895 = null;
		field704 = null;
		SOKVSBIO.field1227 = null;
		CUNPUNFW.method169();
		RHXAQRFP.method470();
		CYPZUKMB.method192();
		QGRLAQIF.method467();
		System.gc();
	}

	@ObfuscatedName("client.a(IILPQPZKUPU;IIBIII)V")
	public final void method124(int arg0, int arg1, PQPZKUPU arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field479) {
			field377 = 32;
		} else {
			field377 = 0;
		}

		field479 = false;
		if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg7 && arg0 < arg7 + 16) {
			arg2.field1126 -= field183 * 4;

			if (arg5 == 1) {
				field495 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field471 = true;
			}
		} else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg4 + arg7 - 16 && arg0 < arg4 + arg7) {
			arg2.field1126 += field183 * 4;

			if (arg5 == 1) {
				field495 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field471 = true;
			}
		} else if (arg1 >= arg6 - field377 && arg1 < arg6 + field377 + 16 && arg0 >= arg7 + 16 && arg0 < arg4 + arg7 - 16 && field183 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg7 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg2.field1126 = (arg3 - arg4) * var10 / var11;

			if (arg5 == 1) {
				field495 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field471 = true;
			}

			field479 = true;
		}
	}

	@ObfuscatedName("client.k(B)Z")
	public final boolean method125() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method126(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.l(B)V")
	public final void method127() {
		if (field76 != 0) {
			int var1 = 0;
			if (field362 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field313[var2] != null) {
					int var3 = field311[var2];
					String var4 = field312[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field83 == 0 || field83 == 1 && method12(var4))) {
						int var8 = 329 - var1 * 13;
						if (field711 > 4 && field712 - 4 > var8 - 10 && field712 - 4 <= var8 + 3) {
							int var9 = field422.method591("From:  " + var4 + field313[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field711 < var9 + 4) {
								if (field319 >= 1) {
									field399[field108] = "Report abuse @whi@" + var4;
									field232[field108] = 2564;
									field108++;
								}

								field399[field108] = "Add ignore @whi@" + var4;
								field232[field108] = 2502;
								field108++;
								field399[field108] = "Add friend @whi@" + var4;
								field232[field108] = 2308;
								field108++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field83 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILLBBVYYXO;)V")
	public final void method128(int arg0, LBBVYYXO arg1) {
		field476 = 0;
		field189 = 0;
		method151(arg0, arg1);
		method152(arg0, arg1);
		method120(arg1, arg0);

		for (int var3 = 0; var3 < field476; var3++) {
			int var4 = field477[var3];
			if (field155 != field308[var4].field968) {
				field308[var4].field1214 = null;
				field308[var4] = null;
			}
		}

		if (arg1.field882 != arg0) {
			signlink.reporterror(field401 + " size mismatch in getnpcpos - pos:" + arg1.field882 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field309; var5++) {
			if (field308[field310[var5]] == null) {
				signlink.reporterror(field401 + " null entry in npc list - pos:" + var5 + " size:" + field309);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZILVZJVQLEE;)V")
	public final void method129(int arg0, int arg1, VZJVQLEE arg2) {
		int var4 = field55 + field419 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = CYPZUKMB.field605[var4];
			int var7 = CYPZUKMB.field606[var4];
			var6 = var6 * 256 / (field472 + 256);
			var7 = var7 * 256 / (field472 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method547(83 - var9 - arg2.field1299 / 2 - 4, var8 + 94 - arg2.field1298 / 2 + 4, field368);
			} else {
				arg2.method541(var8 + 94 + 4 - arg2.field1298 / 2, 83 - var9 - arg2.field1299 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method130(int arg0) {
		PQPZKUPU var2 = PQPZKUPU.method460(arg0);
		for (int var3 = 0; var3 < var2.field1073.length && var2.field1073[var3] != -1; var3++) {
			PQPZKUPU var4 = PQPZKUPU.method460(var2.field1073[var3]);
			if (var4.field1101 == 1) {
				method130(var4.field1125);
			}

			var4.field1108 = 0;
			var4.field1115 = 0;
		}
	}

	@ObfuscatedName("client.E(I)Ljava/net/Socket;")
	public final Socket method131(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.F(I)V")
	public final void method132() {
		for (int var1 = -1; var1 < field187; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field185;
			} else {
				var2 = field188[var1];
			}

			SOKVSBIO var3 = field186[var2];
			if (var3 != null) {
				method18(1, var3);
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method133(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.G(I)V")
	public final void method134() {
		if (field491 == 0) {
			int var1 = field717;
			if (field167 == 1 && field718 >= 516 && field719 >= 160 && field718 <= 765 && field719 <= 205) {
				var1 = 0;
			}

			if (field451) {
				if (var1 != 1) {
					int var2 = field711;
					int var3 = field712;
					if (field144 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field144 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field144 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field145 - 10 || var2 > field147 + field145 + 10 || var3 < field146 - 10 || var3 > field148 + field146 + 10) {
						field451 = false;

						if (field144 == 1) {
							field495 = true;
						}

						if (field144 == 2) {
							field471 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field145;
					int var5 = field146;
					int var6 = field147;
					int var7 = field718;
					int var8 = field719;
					if (field144 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field144 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field144 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field108; var10++) {
						int var11 = (field108 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method86(var9);
					}

					field451 = false;

					if (field144 == 1) {
						field495 = true;
					}

					if (field144 == 2) {
						field471 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field108 > 0) {
					int var12 = field232[field108 - 1];
					if (var12 == 971 || var12 == 364 || var12 == 855 || var12 == 817 || var12 == 168 || var12 == 495 || var12 == 220 || var12 == 34 || var12 == 273 || var12 == 377 || var12 == 138 || var12 == 1759) {
						int var13 = field230[field108 - 1];
						int var14 = field231[field108 - 1];
						PQPZKUPU var15 = PQPZKUPU.method460(var14);
						if (var15.field1075 || var15.field1113) {
							field154 = false;
							field365 = 0;
							field489 = var14;
							field490 = var13;
							field491 = 2;
							field492 = field718;
							field493 = field719;

							if (PQPZKUPU.method460(var14).field1099 == field484) {
								field491 = 1;
							}

							if (PQPZKUPU.method460(var14).field1099 == field330) {
								field491 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field329 == 1 || method114(field108 - 1)) && field108 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field108 > 0) {
					method86(field108 - 1);
				}

				if (var1 != 2 || field108 <= 0) {
					return;
				}

				method56();
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method135() {
		while (true) {
			int var1 = method250();
			if (var1 == -1) {
				return;
			}

			if (field484 != -1 && field484 == field314) {
				if (var1 == 8 && field208.length() > 0) {
					field208 = field208.substring(0, field208.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field208.length() < 12) {
					field208 = field208 + (char) var1;
				}
			} else if (field64) {
				if (var1 >= 32 && var1 <= 122 && field279.length() < 80) {
					field279 = field279 + (char) var1;
					field471 = true;
				}

				if (var1 == 8 && field279.length() > 0) {
					field279 = field279.substring(0, field279.length() - 1);
					field471 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field64 = false;
					field471 = true;

					if (field364 == 1) {
						long var2 = OERTMYQW.method440(field279);
						method43(var2);
					}

					if (field364 == 2 && field357 > 0) {
						long var4 = OERTMYQW.method440(field279);
						method102(var4);
					}

					if (field364 == 3 && field279.length() > 0) {
						field86.method358(179);
						field86.method359(0);
						int var6 = field86.field882;
						field86.method365(field453);
						SLOJMIHA.method524(field279, field86);
						field86.method368(field86.field882 - var6);
						field279 = SLOJMIHA.method525(field279);
						field279 = JVGHFIOO.method311(field279);
						method67(field279, OERTMYQW.method444(OERTMYQW.method441(field453)), 6);

						if (field83 == 2) {
							field83 = 1;
							field128 = true;
							field86.method358(145);
							field86.method359(field211);
							field86.method359(field83);
							field86.method359(field72);
						}
					}

					if (field364 == 4 && field213 < 100) {
						long var7 = OERTMYQW.method440(field279);
						method82(var7);
					}

					if (field364 == 5 && field213 > 0) {
						long var9 = OERTMYQW.method440(field279);
						method109(var9);
					}
				}
			} else if (field58 == 1) {
				if (var1 >= 48 && var1 <= 57 && field390.length() < 10) {
					field390 = field390 + (char) var1;
					field471 = true;
				}

				if (var1 == 8 && field390.length() > 0) {
					field390 = field390.substring(0, field390.length() - 1);
					field471 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field390.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field390);
						} catch (Exception var21) {
						}

						field86.method358(157);
						field86.method363(var11);
					}

					field58 = 0;
					field471 = true;
				}
			} else if (field58 == 2) {
				if (var1 >= 32 && var1 <= 122 && field390.length() < 12) {
					field390 = field390 + (char) var1;
					field471 = true;
				}

				if (var1 == 8 && field390.length() > 0) {
					field390 = field390.substring(0, field390.length() - 1);
					field471 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field390.length() > 0) {
						field86.method358(190);
						field86.method365(OERTMYQW.method440(field390));
					}

					field58 = 0;
					field471 = true;
				}
			} else if (field58 == 3) {
				if (var1 >= 32 && var1 <= 122 && field390.length() < 40) {
					field390 = field390 + (char) var1;
					field471 = true;
				}

				if (var1 == 8 && field390.length() > 0) {
					field390 = field390.substring(0, field390.length() - 1);
					field471 = true;
				}
			} else if (field330 == -1 && field127 == -1) {
				if (var1 >= 32 && var1 <= 122 && field363.length() < 80) {
					field363 = field363 + (char) var1;
					field471 = true;
				}

				if (var1 == 8 && field363.length() > 0) {
					field363 = field363.substring(0, field363.length() - 1);
					field471 = true;
				}

				if ((var1 == 13 || var1 == 10) && field363.length() > 0) {
					if (field319 == 2) {
						if (field363.equals("::clientdrop")) {
							method37();
						}

						if (field363.equals("::lag")) {
							method64();
						}

						if (field363.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field77.method235(2); var12++) {
								field77.method238((byte) 1, var12, 2);
							}
						}

						if (field363.equals("::fpson")) {
							field268 = true;
						}

						if (field363.equals("::fpsoff")) {
							field268 = false;
						}

						if (field363.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field463[var13].field505[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field363.startsWith("::")) {
						field86.method358(138);
						field86.method359(field363.length() - 1);
						field86.method366(field363.substring(2));
					} else {
						String var16 = field363.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field363 = field363.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field363 = field363.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field363 = field363.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field363 = field363.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field363 = field363.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field363 = field363.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field363 = field363.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field363 = field363.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field363 = field363.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field363 = field363.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field363 = field363.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field363 = field363.substring(6);
						}

						String var18 = field363.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field363 = field363.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field363 = field363.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field363 = field363.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field363 = field363.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field363 = field363.substring(6);
						}

						field86.method358(197);
						field86.method359(0);
						int var20 = field86.field882;
						field307.field882 = 0;
						SLOJMIHA.method524(field363, field307);
						field86.method405(0, field307.field881, field307.field882);
						field86.method385(var19);
						field86.method386(var17);
						field86.method368(field86.field882 - var20);
						field363 = SLOJMIHA.method525(field363);
						field363 = JVGHFIOO.method311(field363);
						field114.field1006 = field363;
						field114.field997 = var17;
						field114.field974 = var19;
						field114.field993 = 150;

						if (field319 == 2) {
							method67(field114.field1006, "@cr2@" + field114.field1235, 2);
						} else if (field319 == 1) {
							method67(field114.field1006, "@cr1@" + field114.field1235, 2);
						} else {
							method67(field114.field1006, field114.field1235, 2);
						}

						if (field211 == 2) {
							field211 = 3;
							field128 = true;
							field86.method358(145);
							field86.method359(field211);
							field86.method359(field83);
							field86.method359(field72);
						}
					}

					field363 = "";
					field471 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method136() {
		field413.method298();
		CUNPUNFW.field517 = field460;
		field367.method586(0, 0);

		if (field397 != -1) {
			method35(0, 0, PQPZKUPU.method460(field397), 0);
		} else if (field315[field229] != -1) {
			method35(0, 0, PQPZKUPU.method460(field315[field229]), 0);
		}

		if (field451 && field144 == 1) {
			method143();
		}

		field413.method299(field703, 553, 205);
		field415.method298();
		CUNPUNFW.field517 = field461;
	}

	@ObfuscatedName("client.a(LFIMQRVPL;B)V")
	public final void method137(FIMQRVPL arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field796 == 0) {
			var2 = field157.method497(arg0.field795, arg0.field797, arg0.field798);
		}

		if (arg0.field796 == 1) {
			var2 = field157.method498(arg0.field795, arg0.field797, arg0.field798);
		}

		if (arg0.field796 == 2) {
			var2 = field157.method499(arg0.field795, arg0.field797, arg0.field798);
		}

		if (arg0.field796 == 3) {
			var2 = field157.method500(arg0.field795, arg0.field797, arg0.field798);
		}

		if (var2 != 0) {
			int var6 = field157.method501(arg0.field795, arg0.field797, arg0.field798, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field792 = var3;
		arg0.field794 = var4;
		arg0.field793 = var5;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method138() {
		if (field108 >= 2 || field162 != 0 || field167 != 0) {
			String var1;
			if (field162 == 1 && field108 < 2) {
				var1 = "Use " + field166 + " with...";
			} else if (field167 == 1 && field108 < 2) {
				var1 = field170 + "...";
			} else {
				var1 = field399[field108 - 1];
			}

			if (field108 > 2) {
				var1 = var1 + "@whi@ / " + (field108 - 2) + " more options";
			}

			field423.method598(true, var1, 15, 4, field155 / 1000, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method139() {
		int var1 = field342 * 128 + 64;
		int var2 = field343 * 128 + 64;
		int var3 = method147(var1, field199, var2) - field344;

		if (field392 < var1) {
			field392 += (var1 - field392) * field346 / 1000 + field345;
			if (field392 > var1) {
				field392 = var1;
			}
		}

		if (field392 > var1) {
			field392 -= (field392 - var1) * field346 / 1000 + field345;
			if (field392 < var1) {
				field392 = var1;
			}
		}

		if (field393 < var3) {
			field393 += (var3 - field393) * field346 / 1000 + field345;
			if (field393 > var3) {
				field393 = var3;
			}
		}

		if (field393 > var3) {
			field393 -= (field393 - var3) * field346 / 1000 + field345;
			if (field393 < var3) {
				field393 = var3;
			}
		}

		if (field394 < var2) {
			field394 += (var2 - field394) * field346 / 1000 + field345;
			if (field394 > var2) {
				field394 = var2;
			}
		}

		if (field394 > var2) {
			field394 -= (field394 - var2) * field346 / 1000 + field345;
			if (field394 < var2) {
				field394 = var2;
			}
		}

		int var4 = field496 * 128 + 64;
		int var5 = field497 * 128 + 64;
		int var6 = method147(var4, field199, var5) - field498;
		int var7 = var4 - field392;
		int var8 = var6 - field393;
		int var9 = var5 - field394;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field395 < var11) {
			field395 += (var11 - field395) * field500 / 1000 + field499;
			if (field395 > var11) {
				field395 = var11;
			}
		}

		if (field395 > var11) {
			field395 -= (field395 - var11) * field500 / 1000 + field499;
			if (field395 < var11) {
				field395 = var11;
			}
		}

		int var13 = var12 - field396;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field396 += field500 * var13 / 1000 + field499;
			field396 &= 0x7FF;
		}

		if (var13 < 0) {
			field396 -= -var13 * field500 / 1000 + field499;
			field396 &= 0x7FF;
		}

		int var14 = var12 - field396;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field396 = var12;
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method140() {
		if (!field176 && !field149 && !field269) {
			field155++;

			if (field289) {
				method54();
			} else {
				method145();
			}

			method33();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)V")
	public final void method141(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field60 = 0;
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

			field60 = 0;
			label46: for (int var7 = 0; var7 < WGKWQDPM.field1308; var7++) {
				WGKWQDPM var8 = WGKWQDPM.method554(var7);
				if (var8.field1337 == -1 && var8.field1342 != null) {
					String var9 = var8.field1342.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field61[field60] = var9;
					field62[field60] = var7;
					field60++;
					if (field60 >= field61.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILYGGALXYD;BII)V")
	public final void method142(int arg0, YGGALXYD arg1, int arg2, int arg3) {
		if (field108 < 400) {
			if (arg1.field1382 != null) {
				arg1 = arg1.method572();
			}

			if (arg1 != null && arg1.field1374) {
				String var5 = arg1.field1377;
				if (arg1.field1371 != 0) {
					var5 = var5 + method16(arg1.field1371, field114.field1220) + " (level-" + arg1.field1371 + ")";
				}

				if (field162 == 1) {
					field399[field108] = "Use " + field166 + " with @yel@" + var5;
					field232[field108] = 151;
					field233[field108] = arg0;
					field230[field108] = arg2;
					field231[field108] = arg3;
					field108++;
				} else if (field167 != 1) {
					if (arg1.field1372 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1372[var6] != null && !arg1.field1372[var6].equalsIgnoreCase("attack")) {
								field399[field108] = arg1.field1372[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field232[field108] = 132;
								}

								if (var6 == 1) {
									field232[field108] = 776;
								}

								if (var6 == 2) {
									field232[field108] = 565;
								}

								if (var6 == 3) {
									field232[field108] = 705;
								}

								if (var6 == 4) {
									field232[field108] = 181;
								}

								field233[field108] = arg0;
								field230[field108] = arg2;
								field231[field108] = arg3;
								field108++;
							}
						}
					}

					if (arg1.field1372 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1372[var7] != null && arg1.field1372[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1371 > field114.field1220) {
									var8 = 2000;
								}

								field399[field108] = arg1.field1372[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field232[field108] = var8 + 132;
								}

								if (var7 == 1) {
									field232[field108] = var8 + 776;
								}

								if (var7 == 2) {
									field232[field108] = var8 + 565;
								}

								if (var7 == 3) {
									field232[field108] = var8 + 705;
								}

								if (var7 == 4) {
									field232[field108] = var8 + 181;
								}

								field233[field108] = arg0;
								field230[field108] = arg2;
								field231[field108] = arg3;
								field108++;
							}
						}
					}

					field399[field108] = "Examine @yel@" + var5;
					field232[field108] = 1094;
					field233[field108] = arg0;
					field230[field108] = arg2;
					field231[field108] = arg3;
					field108++;
				} else if ((field169 & 0x2) == 2) {
					field399[field108] = field170 + " @yel@" + var5;
					field232[field108] = 581;
					field233[field108] = arg0;
					field230[field108] = arg2;
					field231[field108] = arg3;
					field108++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method143() {
		int var1 = field145;
		int var2 = field146;
		int var3 = field147;
		int var4 = field148;
		int var5 = 0x5D5447;
		GBJWVQAY.method289(var3, var1, var5, var2, var4);
		GBJWVQAY.method289(var3 - 2, var1 + 1, 0, var2 + 1, 16);
		GBJWVQAY.method290(var4 - 19, 0, var1 + 1, var3 - 2, var2 + 18);
		field423.method593("Choose Option", var2 + 14, var1 + 3, var5);
		int var6 = field711;
		int var7 = field712;
		if (field144 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field144 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field144 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field108; var8++) {
			int var9 = (field108 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field423.method597(var10, field399[var8], true, var1 + 3, var9);
		}
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field157.method497(arg0, arg2, arg4);
		if (var6 != 0) {
			int var7 = field157.method501(arg0, arg2, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field202.field1293;
			int var12 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LXNLNZCU var14 = LXNLNZCU.method409(var13);
			if (var14.field934 == -1) {
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
				ZQSBFHWZ var15 = field338[var14.field934];
				if (var15 != null) {
					int var16 = (var14.field930 * 4 - var15.field1476) / 2;
					int var17 = (var14.field950 * 4 - var15.field1477) / 2;
					var15.method586(arg2 * 4 + var16 + 48, (104 - arg4 - var14.field950) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field157.method499(arg0, arg2, arg4);
		if (var18 != 0) {
			int var19 = field157.method501(arg0, arg2, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LXNLNZCU var23 = LXNLNZCU.method409(var22);
			if (var23.field934 != -1) {
				ZQSBFHWZ var24 = field338[var23.field934];
				if (var24 != null) {
					int var25 = (var23.field930 * 4 - var24.field1476) / 2;
					int var26 = (var23.field950 * 4 - var24.field1477) / 2;
					var24.method586(arg2 * 4 + var25 + 48, (104 - arg4 - var23.field950) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field202.field1293;
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

		int var30 = field157.method500(arg0, arg2, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LXNLNZCU var32 = LXNLNZCU.method409(var31);
			if (var32.field934 != -1) {
				ZQSBFHWZ var33 = field338[var32.field934];
				if (var33 != null) {
					int var34 = (var32.field930 * 4 - var33.field1476) / 2;
					int var35 = (var32.field950 * 4 - var33.field1477) / 2;
					var33.method586(arg2 * 4 + var34 + 48, (104 - arg4 - var32.field950) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method145() {
		if (field207 == 0) {
			int var1 = field701 / 2 - 80;
			int var2 = field702 / 2 + 20;
			var2 += 20;
			if (field717 == 1 && field718 >= var1 - 75 && field718 <= var1 + 75 && field719 >= var2 - 20 && field719 <= var2 + 20) {
				field207 = 3;
				field241 = 0;
			}

			int var3 = field701 / 2 + 80;
			if (field717 == 1 && field718 >= var3 - 75 && field718 <= var3 + 75 && field719 >= var2 - 20 && field719 <= var2 + 20) {
				field87 = "";
				field88 = "Enter your username & password.";
				field207 = 2;
				field241 = 0;
			}
		} else if (field207 == 2) {
			int var4 = field702 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field717 == 1 && field719 >= var4 - 15 && field719 < var4) {
				field241 = 0;
			}

			var4 += 15;
			if (field717 == 1 && field719 >= var4 - 15 && field719 < var4) {
				field241 = 1;
			}

			var4 += 15;
			int var5 = field701 / 2 - 80;
			int var6 = field702 / 2 + 50;
			var6 += 20;
			if (field717 == 1 && field718 >= var5 - 75 && field718 <= var5 + 75 && field719 >= var6 - 20 && field719 <= var6 + 20) {
				field410 = 0;
				method25(field401, field402, false);

				if (field289) {
					return;
				}
			}

			int var7 = field701 / 2 + 80;
			if (field717 == 1 && field718 >= var7 - 75 && field718 <= var7 + 75 && field719 >= var6 - 20 && field719 <= var6 + 20) {
				field207 = 0;
				field401 = "";
				field402 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method250();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field478.length(); var10++) {
					if (var8 == field478.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field241 == 0) {
					if (var8 == 8 && field401.length() > 0) {
						field401 = field401.substring(0, field401.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field241 = 1;
					}

					if (var9) {
						field401 = field401 + (char) var8;
					}

					if (field401.length() > 12) {
						field401 = field401.substring(0, 12);
					}
				} else if (field241 == 1) {
					if (var8 == 8 && field402.length() > 0) {
						field402 = field402.substring(0, field402.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field241 = 0;
					}

					if (var9) {
						field402 = field402 + (char) var8;
					}

					if (field402.length() > 20) {
						field402 = field402.substring(0, 20);
					}
				}
			}
		} else if (field207 == 3) {
			int var11 = field701 / 2;
			int var12 = field702 / 2 + 50;
			var12 += 20;
			if (field717 == 1 && field718 >= var11 - 75 && field718 <= var11 + 75 && field719 >= var12 - 20 && field719 <= var12 + 20) {
				field207 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method146(String arg0) {
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

	@ObfuscatedName("client.b(IIII)I")
	public final int method147(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field139[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field82[var6][var4][var5] + field82[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field82[var6][var4][var5 + 1] + field82[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method148() {
		field228 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field277) {
				field283++;
				method15();
				method15();
				method110();
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

		field228 = false;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method149() {
		if (field416 == null) {
			method11();
			field704 = null;
			field217 = null;
			field218 = null;
			field219 = null;
			field220 = null;
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field416 = new HURULSIZ(96, 479, method65());
			field414 = new HURULSIZ(156, 172, method65());
			GBJWVQAY.method287();
			field368.method586(0, 0);
			field413 = new HURULSIZ(261, 190, method65());
			field415 = new HURULSIZ(334, 512, method65());
			GBJWVQAY.method287();
			field447 = new HURULSIZ(50, 496, method65());
			field448 = new HURULSIZ(37, 269, method65());
			field449 = new HURULSIZ(45, 249, method65());
			field70 = true;
			field415.method298();
			CUNPUNFW.field517 = field461;
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method150() {
		try {
			int var1 = field114.field977 + field105;
			int var2 = field114.field978 + field245;
			if (field298 - var1 < -500 || field298 - var1 > 500 || field299 - var2 < -500 || field299 - var2 > 500) {
				field298 = var1;
				field299 = var2;
			}

			if (field298 != var1) {
				field298 += (var1 - field298) / 16;
			}

			if (field299 != var2) {
				field299 += (var2 - field299) / 16;
			}

			if (field721[1] == 1) {
				field56 += (-field56 - 24) / 2;
			} else if (field721[2] == 1) {
				field56 += (24 - field56) / 2;
			} else {
				field56 /= 2;
			}

			if (field721[3] == 1) {
				field57 += (12 - field57) / 2;
			} else if (field721[4] == 1) {
				field57 += (-field57 - 12) / 2;
			} else {
				field57 /= 2;
			}

			field55 = field56 / 2 + field55 & 0x7FF;
			field54 += field57 / 2;
			if (field54 < 128) {
				field54 = 128;
			}

			if (field54 > 383) {
				field54 = 383;
			}

			int var3 = field298 >> 7;
			int var4 = field299 >> 7;
			int var5 = method147(field298, field199, field299);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field199;
						if (var9 < 3 && (field139[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field82[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			field156++;
			if (field156 > 101) {
				field156 = 0;
				field86.method358(110);
				field86.method360(3789);
			}

			int var11 = var6 * 192;
			if (var11 > 98048) {
				var11 = 98048;
			}

			if (var11 < 32768) {
				var11 = 32768;
			}

			if (var11 > field210) {
				field210 += (var11 - field210) / 24;
			} else if (var11 < field210) {
				field210 += (var11 - field210) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field114.field977 + "," + field114.field978 + "," + field298 + "," + field299 + "," + field323 + "," + field324 + "," + field150 + "," + field151);
			throw new RuntimeException("eek");
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(BILLBBVYYXO;)V")
	public final void method151(int arg0, LBBVYYXO arg1) {
		arg1.method379();
		int var3 = arg1.method380(8);
		if (var3 < field309) {
			for (int var4 = var3; var4 < field309; var4++) {
				field477[field476++] = field310[var4];
			}
		}

		if (var3 > field309) {
			signlink.reporterror(field401 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field309 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field310[var5];
			SBPCMLRM var7 = field308[var6];
			int var8 = arg1.method380(1);
			if (var8 == 0) {
				field310[field309++] = var6;
				var7.field968 = field155;
			} else {
				int var9 = arg1.method380(2);
				if (var9 == 0) {
					field310[field309++] = var6;
					var7.field968 = field155;
					field190[field189++] = var6;
				} else if (var9 == 1) {
					field310[field309++] = var6;
					var7.field968 = field155;
					int var10 = arg1.method380(3);
					var7.method428(var10, false);
					int var11 = arg1.method380(1);
					if (var11 == 1) {
						field190[field189++] = var6;
					}
				} else if (var9 == 2) {
					field310[field309++] = var6;
					var7.field968 = field155;
					int var12 = arg1.method380(3);
					var7.method428(var12, true);
					int var13 = arg1.method380(3);
					var7.method428(var13, true);
					int var14 = arg1.method380(1);
					if (var14 == 1) {
						field190[field189++] = var6;
					}
				} else if (var9 == 3) {
					field477[field476++] = var6;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 356);

			if (arg0.length == 5) {
				field194 = Integer.parseInt(arg0[0]);
				field195 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method49();
				} else if (arg0[2].equals("highmem")) {
					method94();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field196 = false;
				} else if (arg0[3].equals("members")) {
					field196 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method246(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(BILLBBVYYXO;)V")
	public final void method152(int arg0, LBBVYYXO arg1) {
		while (arg1.field883 + 21 < arg0 * 8) {
			int var3 = arg1.method380(14);
			if (var3 == 16383) {
				break;
			}

			if (field308[var3] == null) {
				field308[var3] = new SBPCMLRM();
			}

			SBPCMLRM var4 = field308[var3];
			field310[field309++] = var3;
			var4.field968 = field155;
			var4.field1214 = YGGALXYD.method575(arg1.method380(13));
			int var5 = arg1.method380(1);
			if (var5 == 1) {
				field190[field189++] = var3;
			}

			int var6 = arg1.method380(1);
			int var7 = arg1.method380(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method380(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field992 = var4.field1214.field1392;
			var4.field1001 = var4.field1214.field1395;
			var4.field981 = var4.field1214.field1394;
			var4.field982 = var4.field1214.field1361;
			var4.field983 = var4.field1214.field1373;
			var4.field984 = var4.field1214.field1391;
			var4.field989 = var4.field1214.field1385;
			var4.method430(field114.field975[0] + var8, field114.field976[0] + var7, var6 == 1);
		}

		arg1.method381();
	}

	@ObfuscatedName("client.a(IBZ)V")
	public final void method153(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method154(int arg0) {
		PQPZKUPU.method458(arg0);
	}

	@ObfuscatedName("client.c(IB)Ljava/lang/String;")
	public final String method155(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method156(boolean arg0, byte[] arg1) {
		if (field404) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field273[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field485[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
