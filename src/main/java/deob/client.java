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
public final class client extends KWRIFYWM {

	@ObfuscatedName("client.I")
	public boolean field82 = false;

	@ObfuscatedName("client.Q")
	public int field89 = 2;

	@ObfuscatedName("client.Y")
	public int[] field95 = new int[2000];

	@ObfuscatedName("client.ab")
	public int field96 = 0x766654;

	@ObfuscatedName("client.cb")
	public int[] field97 = new int[50];

	@ObfuscatedName("client.db")
	public BXNXROZD[] field98 = new BXNXROZD[4];

	@ObfuscatedName("client.eb")
	public DGXCFOYI[] field99 = new DGXCFOYI[2];

	@ObfuscatedName("client.fb")
	public int field100 = 3;

	@ObfuscatedName("client.gb")
	public String field101 = "";

	@ObfuscatedName("client.hb")
	public String field102 = "";

	@ObfuscatedName("client.ib")
	public String field103 = "";

	@ObfuscatedName("client.jb")
	public String field104 = "";

	@ObfuscatedName("client.tb")
	public byte[] field113 = new byte[16384];

	@ObfuscatedName("client.xb")
	public boolean field117 = false;

	@ObfuscatedName("client.Ab")
	public int field120 = -1;

	@ObfuscatedName("client.Bb")
	public int[] field121 = new int[200];

	@ObfuscatedName("client.Ob")
	public HOSNGCXH[] field133 = new HOSNGCXH[1000];

	@ObfuscatedName("client.Qb")
	public int field135 = 1;

	@ObfuscatedName("client.Sb")
	public boolean field136 = false;

	@ObfuscatedName("client.Ub")
	public int field137 = -1;

	@ObfuscatedName("client.Vb")
	public int[] field138 = new int[MJYHJBDO.field1097];

	@ObfuscatedName("client.cc")
	public int[] field144 = new int[7];

	@ObfuscatedName("client.dc")
	public int[][] field145 = new int[104][104];

	@ObfuscatedName("client.ic")
	public boolean field149 = false;

	@ObfuscatedName("client.mc")
	public int[] field153 = new int[50];

	@ObfuscatedName("client.nc")
	public int field154 = 0x23201B;

	@ObfuscatedName("client.rc")
	public boolean field158 = false;

	@ObfuscatedName("client.vc")
	public boolean field161 = false;

	@ObfuscatedName("client.Ac")
	public boolean field166 = true;

	@ObfuscatedName("client.Ec")
	public EGCCHUZS field170 = EGCCHUZS.method249(1);

	@ObfuscatedName("client.Gc")
	public String field172 = "";

	@ObfuscatedName("client.Hc")
	public int[][] field173 = new int[104][104];

	@ObfuscatedName("client.Jc")
	public int[] field175 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Mc")
	public boolean field177 = false;

	@ObfuscatedName("client.Sc")
	public String field181 = "";

	@ObfuscatedName("client.Yc")
	public volatile boolean field187 = false;

	@ObfuscatedName("client.Zc")
	public int[] field188 = new int[33];

	@ObfuscatedName("client.jd")
	public boolean[] field198 = new boolean[5];

	@ObfuscatedName("client.ld")
	public int field200 = 1;

	@ObfuscatedName("client.wd")
	public int field211 = 50;

	@ObfuscatedName("client.xd")
	public int[] field212 = new int[field211];

	@ObfuscatedName("client.yd")
	public int[] field213 = new int[field211];

	@ObfuscatedName("client.zd")
	public int[] field214 = new int[field211];

	@ObfuscatedName("client.Ad")
	public int[] field215 = new int[field211];

	@ObfuscatedName("client.Bd")
	public int[] field216 = new int[field211];

	@ObfuscatedName("client.Cd")
	public int[] field217 = new int[field211];

	@ObfuscatedName("client.Dd")
	public int[] field218 = new int[field211];

	@ObfuscatedName("client.Ed")
	public String[] field219 = new String[field211];

	@ObfuscatedName("client.Hd")
	public int field222 = -1;

	@ObfuscatedName("client.Kd")
	public HOSNGCXH[] field225 = new HOSNGCXH[100];

	@ObfuscatedName("client.Ld")
	public int field226 = 2048;

	@ObfuscatedName("client.Md")
	public int field227 = 2047;

	@ObfuscatedName("client.Nd")
	public QAJCAYDZ[] field228 = new QAJCAYDZ[field226];

	@ObfuscatedName("client.Pd")
	public int[] field230 = new int[field226];

	@ObfuscatedName("client.Rd")
	public int[] field232 = new int[field226];

	@ObfuscatedName("client.Sd")
	public EGCCHUZS[] field233 = new EGCCHUZS[field226];

	@ObfuscatedName("client.Td")
	public boolean field234 = true;

	@ObfuscatedName("client.Ud")
	public int[] field235 = new int[500];

	@ObfuscatedName("client.Vd")
	public int[] field236 = new int[500];

	@ObfuscatedName("client.Wd")
	public int[] field237 = new int[500];

	@ObfuscatedName("client.Xd")
	public int[] field238 = new int[500];

	@ObfuscatedName("client.Zd")
	public int[] field240 = new int[1000];

	@ObfuscatedName("client.ae")
	public int[] field241 = new int[1000];

	@ObfuscatedName("client.he")
	public final int[] field245 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ke")
	public int[] field248 = new int[50];

	@ObfuscatedName("client.le")
	public boolean field249 = false;

	@ObfuscatedName("client.oe")
	public int[] field251 = new int[5];

	@ObfuscatedName("client.ve")
	public CRC32 field257 = new CRC32();

	@ObfuscatedName("client.xe")
	public int field259 = 0x332D25;

	@ObfuscatedName("client.He")
	public HOSNGCXH[] field267 = new HOSNGCXH[8];

	@ObfuscatedName("client.Ke")
	public int field270 = -1;

	@ObfuscatedName("client.Le")
	public int field271 = -1;

	@ObfuscatedName("client.Me")
	public String field272 = "";

	@ObfuscatedName("client.Qe")
	public int[] field276 = new int[5];

	@ObfuscatedName("client.Ye")
	public boolean field284 = false;

	@ObfuscatedName("client.df")
	public final int field288 = 100;

	@ObfuscatedName("client.ef")
	public int[] field289 = new int[100];

	@ObfuscatedName("client.ff")
	public LORGYGVM field290 = new LORGYGVM();

	@ObfuscatedName("client.gf")
	public int field291 = 0x4D4233;

	@ObfuscatedName("client.nf")
	public String[] field297 = new String[5];

	@ObfuscatedName("client.of")
	public boolean[] field298 = new boolean[5];

	@ObfuscatedName("client.qf")
	public int[] field299 = new int[5];

	@ObfuscatedName("client.wf")
	public int field305 = -1;

	@ObfuscatedName("client.xf")
	public int field306 = -1;

	@ObfuscatedName("client.Df")
	public int[] field311 = new int[151];

	@ObfuscatedName("client.Ff")
	public String field313 = "";

	@ObfuscatedName("client.Nf")
	public JQSVNFRT field320 = new JQSVNFRT();

	@ObfuscatedName("client.Pf")
	public boolean field322 = false;

	@ObfuscatedName("client.Sf")
	public volatile boolean field324 = false;

	@ObfuscatedName("client.Wf")
	public int[] field328 = new int[2000];

	@ObfuscatedName("client.Xf")
	public JQSVNFRT field329 = new JQSVNFRT();

	@ObfuscatedName("client.cg")
	public int[] field334 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.eg")
	public DGXCFOYI[] field336 = new DGXCFOYI[100];

	@ObfuscatedName("client.fg")
	public String field337 = "";

	@ObfuscatedName("client.ig")
	public int field340 = -1;

	@ObfuscatedName("client.kg")
	public int[] field342 = new int[9];

	@ObfuscatedName("client.lg")
	public volatile boolean field343 = false;

	@ObfuscatedName("client.sg")
	public String[] field348 = new String[500];

	@ObfuscatedName("client.wg")
	public int[] field351 = new int[151];

	@ObfuscatedName("client.Ag")
	public int field355 = -1;

	@ObfuscatedName("client.Bg")
	public int[] field356 = new int[MJYHJBDO.field1097];

	@ObfuscatedName("client.Ng")
	public boolean field365 = true;

	@ObfuscatedName("client.Og")
	public EGCCHUZS field366 = EGCCHUZS.method249(1);

	@ObfuscatedName("client.Rg")
	public int field368 = -1;

	@ObfuscatedName("client.Sg")
	public int[][] field369 = new int[104][104];

	@ObfuscatedName("client.Tg")
	public long[] field370 = new long[100];

	@ObfuscatedName("client.Ug")
	public JQSVNFRT field371 = new JQSVNFRT();

	@ObfuscatedName("client.Zg")
	public boolean field376 = false;

	@ObfuscatedName("client.ah")
	public int[] field377 = new int[5];

	@ObfuscatedName("client.bh")
	public DGXCFOYI[] field378 = new DGXCFOYI[13];

	@ObfuscatedName("client.ih")
	public int[] field385 = new int[256];

	@ObfuscatedName("client.jh")
	public boolean field386 = false;

	@ObfuscatedName("client.kh")
	public HOSNGCXH[] field387 = new HOSNGCXH[32];

	@ObfuscatedName("client.mh")
	public int[] field389 = new int[4000];

	@ObfuscatedName("client.nh")
	public int[] field390 = new int[4000];

	@ObfuscatedName("client.rh")
	public boolean field394 = false;

	@ObfuscatedName("client.Fh")
	public boolean field408 = false;

	@ObfuscatedName("client.Gh")
	public boolean field409 = false;

	@ObfuscatedName("client.Oh")
	public int field415 = -1;

	@ObfuscatedName("client.Ph")
	public int field416 = 78;

	@ObfuscatedName("client.Qh")
	public HOSNGCXH[] field417 = new HOSNGCXH[20];

	@ObfuscatedName("client.Uh")
	public EGCCHUZS field420 = new EGCCHUZS(new byte[5000]);

	@ObfuscatedName("client.Vh")
	public CHUIKYUV[] field421 = new CHUIKYUV[16384];

	@ObfuscatedName("client.Xh")
	public int[] field423 = new int[16384];

	@ObfuscatedName("client.ei")
	public int field429 = 128;

	@ObfuscatedName("client.ii")
	public HOSNGCXH[] field433 = new HOSNGCXH[32];

	@ObfuscatedName("client.ki")
	public boolean field434 = false;

	@ObfuscatedName("client.li")
	public int[] field435 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.mi")
	public HOSNGCXH[] field436 = new HOSNGCXH[32];

	@ObfuscatedName("client.pi")
	public int field438 = -1;

	@ObfuscatedName("client.qi")
	public int field439 = -1;

	@ObfuscatedName("client.ui")
	public long[] field443 = new long[200];

	@ObfuscatedName("client.vi")
	public boolean field444 = true;

	@ObfuscatedName("client.Ji")
	public boolean field457 = false;

	@ObfuscatedName("client.Li")
	public int[] field459 = new int[1000];

	@ObfuscatedName("client.Mi")
	public boolean field460 = false;

	@ObfuscatedName("client.Pi")
	public int field462 = 2;

	@ObfuscatedName("client.Vi")
	public JQSVNFRT[][][] field468 = new JQSVNFRT[4][104][104];

	@ObfuscatedName("client.Wi")
	public boolean field469 = false;

	@ObfuscatedName("client.Xi")
	public boolean field470 = false;

	@ObfuscatedName("client.bj")
	public EGCCHUZS field474 = EGCCHUZS.method249(1);

	@ObfuscatedName("client.ej")
	public int field476 = -1;

	@ObfuscatedName("client.fj")
	public int field477 = -1;

	@ObfuscatedName("client.pj")
	public int[] field485 = new int[33];

	@ObfuscatedName("client.rj")
	public EEVNVHNQ[] field486 = new EEVNVHNQ[5];

	@ObfuscatedName("client.vj")
	public int field490 = -1;

	@ObfuscatedName("client.xj")
	public int[] field491 = new int[100];

	@ObfuscatedName("client.yj")
	public String[] field492 = new String[100];

	@ObfuscatedName("client.zj")
	public String[] field493 = new String[100];

	@ObfuscatedName("client.Bj")
	public boolean field495 = false;

	@ObfuscatedName("client.Cj")
	public int[] field496 = new int[5];

	@ObfuscatedName("client.Ij")
	public boolean field502 = true;

	@ObfuscatedName("client.Qj")
	public String[] field510 = new String[200];

	@ObfuscatedName("client.Rj")
	public int[][][] field511 = new int[4][13][13];

	@ObfuscatedName("client.Vj")
	public boolean field515 = false;

	@ObfuscatedName("client.Xj")
	public int[] field516 = new int[MJYHJBDO.field1097];

	@ObfuscatedName("client.ck")
	public int field520 = 2;

	@ObfuscatedName("client.kb")
	public static int field105 = 10;

	@ObfuscatedName("client.mb")
	public static boolean field107 = true;

	@ObfuscatedName("client.vb")
	public static String field115 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.uc")
	public static int[] field160 = new int[99];

	@ObfuscatedName("client.Ee")
	public static BigInteger field265 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Pe")
	public static BigInteger field275 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.qh")
	public static final int[][] field393 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.sh")
	public static int[] field395 = new int[32];

	@ObfuscatedName("client.Ui")
	public static final int[] field467 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.lb")
	public static int field106;

	@ObfuscatedName("client.ob")
	public static int field109;

	@ObfuscatedName("client.pb")
	public int field110;

	@ObfuscatedName("client.qb")
	public int field111;

	@ObfuscatedName("client.sb")
	public int field112;

	@ObfuscatedName("client.ub")
	public int field114;

	@ObfuscatedName("client.yb")
	public int field118;

	@ObfuscatedName("client.zb")
	public int field119;

	@ObfuscatedName("client.Eb")
	public static int field123;

	@ObfuscatedName("client.Pb")
	public int field134;

	@ObfuscatedName("client.fc")
	public static int field146;

	@ObfuscatedName("client.gc")
	public int field147;

	@ObfuscatedName("client.hc")
	public int field148;

	@ObfuscatedName("client.lc")
	public int field152;

	@ObfuscatedName("client.oc")
	public int field155;

	@ObfuscatedName("client.pc")
	public int field156;

	@ObfuscatedName("client.qc")
	public int field157;

	@ObfuscatedName("client.Fc")
	public int field171;

	@ObfuscatedName("client.Ic")
	public int field174;

	@ObfuscatedName("client.Lc")
	public int field176;

	@ObfuscatedName("client.Oc")
	public int field179;

	@ObfuscatedName("client.Pc")
	public int field180;

	@ObfuscatedName("client.Tc")
	public int field182;

	@ObfuscatedName("client.Uc")
	public int field183;

	@ObfuscatedName("client.Vc")
	public int field184;

	@ObfuscatedName("client.Wc")
	public int field185;

	@ObfuscatedName("client.ad")
	public int field189;

	@ObfuscatedName("client.bd")
	public int field190;

	@ObfuscatedName("client.cd")
	public int field191;

	@ObfuscatedName("client.dd")
	public int field192;

	@ObfuscatedName("client.ed")
	public int field193;

	@ObfuscatedName("client.fd")
	public int field194;

	@ObfuscatedName("client.gd")
	public int field195;

	@ObfuscatedName("client.hd")
	public int field196;

	@ObfuscatedName("client.id")
	public static int field197;

	@ObfuscatedName("client.kd")
	public int field199;

	@ObfuscatedName("client.nd")
	public int field202;

	@ObfuscatedName("client.od")
	public int field203;

	@ObfuscatedName("client.ud")
	public int field209;

	@ObfuscatedName("client.vd")
	public int field210;

	@ObfuscatedName("client.Fd")
	public static int field220;

	@ObfuscatedName("client.Od")
	public int field229;

	@ObfuscatedName("client.Qd")
	public int field231;

	@ObfuscatedName("client.Yd")
	public int field239;

	@ObfuscatedName("client.ee")
	public static int field244;

	@ObfuscatedName("client.ie")
	public int field246;

	@ObfuscatedName("client.je")
	public int field247;

	@ObfuscatedName("client.me")
	public int field250;

	@ObfuscatedName("client.pe")
	public int field252;

	@ObfuscatedName("client.re")
	public int field253;

	@ObfuscatedName("client.se")
	public int field254;

	@ObfuscatedName("client.te")
	public int field255;

	@ObfuscatedName("client.ue")
	public int field256;

	@ObfuscatedName("client.we")
	public int field258;

	@ObfuscatedName("client.ye")
	public int field260;

	@ObfuscatedName("client.ze")
	public int field261;

	@ObfuscatedName("client.Ae")
	public int field262;

	@ObfuscatedName("client.Be")
	public int field263;

	@ObfuscatedName("client.Ge")
	public int field266;

	@ObfuscatedName("client.Ne")
	public int field273;

	@ObfuscatedName("client.Oe")
	public int field274;

	@ObfuscatedName("client.Re")
	public int field277;

	@ObfuscatedName("client.Se")
	public int field278;

	@ObfuscatedName("client.Te")
	public int field279;

	@ObfuscatedName("client.Ue")
	public int field280;

	@ObfuscatedName("client.Ve")
	public int field281;

	@ObfuscatedName("client.Xe")
	public int field283;

	@ObfuscatedName("client.hf")
	public int field292;

	@ObfuscatedName("client.jf")
	public int field293;

	@ObfuscatedName("client.kf")
	public int field294;

	@ObfuscatedName("client.lf")
	public int field295;

	@ObfuscatedName("client.mf")
	public int field296;

	@ObfuscatedName("client.rf")
	public int field300;

	@ObfuscatedName("client.sf")
	public int field301;

	@ObfuscatedName("client.tf")
	public int field302;

	@ObfuscatedName("client.uf")
	public int field303;

	@ObfuscatedName("client.vf")
	public int field304;

	@ObfuscatedName("client.yf")
	public int field307;

	@ObfuscatedName("client.Ef")
	public static int field312;

	@ObfuscatedName("client.Hf")
	public int field314;

	@ObfuscatedName("client.If")
	public static int field315;

	@ObfuscatedName("client.Rf")
	public int field323;

	@ObfuscatedName("client.Tf")
	public int field325;

	@ObfuscatedName("client.Uf")
	public int field326;

	@ObfuscatedName("client.Vf")
	public int field327;

	@ObfuscatedName("client.gg")
	public int field338;

	@ObfuscatedName("client.hg")
	public int field339;

	@ObfuscatedName("client.pg")
	public int field347;

	@ObfuscatedName("client.tg")
	public static int field349;

	@ObfuscatedName("client.vg")
	public int field350;

	@ObfuscatedName("client.yg")
	public int field353;

	@ObfuscatedName("client.Cg")
	public static int field357;

	@ObfuscatedName("client.Hg")
	public int field359;

	@ObfuscatedName("client.Ig")
	public int field360;

	@ObfuscatedName("client.Jg")
	public int field361;

	@ObfuscatedName("client.Kg")
	public int field362;

	@ObfuscatedName("client.Lg")
	public int field363;

	@ObfuscatedName("client.Mg")
	public int field364;

	@ObfuscatedName("client.Qg")
	public int field367;

	@ObfuscatedName("client.Vg")
	public int field372;

	@ObfuscatedName("client.Wg")
	public int field373;

	@ObfuscatedName("client.Xg")
	public int field374;

	@ObfuscatedName("client.hh")
	public int field384;

	@ObfuscatedName("client.lh")
	public int field388;

	@ObfuscatedName("client.oh")
	public int field391;

	@ObfuscatedName("client.Ch")
	public int field405;

	@ObfuscatedName("client.Dh")
	public int field406;

	@ObfuscatedName("client.Eh")
	public int field407;

	@ObfuscatedName("client.Jh")
	public int field410;

	@ObfuscatedName("client.Kh")
	public int field411;

	@ObfuscatedName("client.Lh")
	public int field412;

	@ObfuscatedName("client.Mh")
	public int field413;

	@ObfuscatedName("client.Nh")
	public int field414;

	@ObfuscatedName("client.Rh")
	public int field418;

	@ObfuscatedName("client.Sh")
	public static int field419;

	@ObfuscatedName("client.Wh")
	public int field422;

	@ObfuscatedName("client.fi")
	public int field430;

	@ObfuscatedName("client.gi")
	public int field431;

	@ObfuscatedName("client.hi")
	public int field432;

	@ObfuscatedName("client.ni")
	public int field437;

	@ObfuscatedName("client.ri")
	public int field440;

	@ObfuscatedName("client.si")
	public int field441;

	@ObfuscatedName("client.ti")
	public int field442;

	@ObfuscatedName("client.yi")
	public int field447;

	@ObfuscatedName("client.zi")
	public int field448;

	@ObfuscatedName("client.Ai")
	public int field449;

	@ObfuscatedName("client.Bi")
	public int field450;

	@ObfuscatedName("client.Ci")
	public int field451;

	@ObfuscatedName("client.Di")
	public int field452;

	@ObfuscatedName("client.Ei")
	public int field453;

	@ObfuscatedName("client.Fi")
	public int field454;

	@ObfuscatedName("client.Gi")
	public int field455;

	@ObfuscatedName("client.Hi")
	public int field456;

	@ObfuscatedName("client.Ki")
	public int field458;

	@ObfuscatedName("client.Oi")
	public int field461;

	@ObfuscatedName("client.Qi")
	public int field463;

	@ObfuscatedName("client.Ri")
	public int field464;

	@ObfuscatedName("client.Si")
	public int field465;

	@ObfuscatedName("client.Ti")
	public int field466;

	@ObfuscatedName("client.aj")
	public static int field473;

	@ObfuscatedName("client.cj")
	public int field475;

	@ObfuscatedName("client.ij")
	public int field479;

	@ObfuscatedName("client.jj")
	public int field480;

	@ObfuscatedName("client.mj")
	public int field483;

	@ObfuscatedName("client.oj")
	public int field484;

	@ObfuscatedName("client.sj")
	public int field487;

	@ObfuscatedName("client.Aj")
	public int field494;

	@ObfuscatedName("client.Hj")
	public int field501;

	@ObfuscatedName("client.Jj")
	public int field503;

	@ObfuscatedName("client.Kj")
	public int field504;

	@ObfuscatedName("client.Mj")
	public int field506;

	@ObfuscatedName("client.Nj")
	public int field507;

	@ObfuscatedName("client.Sj")
	public int field512;

	@ObfuscatedName("client.Tj")
	public int field513;

	@ObfuscatedName("client.Yj")
	public int field517;

	@ObfuscatedName("client.Zj")
	public int field518;

	@ObfuscatedName("client.bk")
	public int field519;

	@ObfuscatedName("client.K")
	public int field83;

	@ObfuscatedName("client.L")
	public int field84;

	@ObfuscatedName("client.M")
	public int field85;

	@ObfuscatedName("client.N")
	public int field86;

	@ObfuscatedName("client.O")
	public int field87;

	@ObfuscatedName("client.P")
	public int field88;

	@ObfuscatedName("client.T")
	public static int field90;

	@ObfuscatedName("client.U")
	public int field91;

	@ObfuscatedName("client.V")
	public static int field92;

	@ObfuscatedName("client.W")
	public int field93;

	@ObfuscatedName("client.X")
	public static int field94;

	@ObfuscatedName("client.wb")
	public long field116;

	@ObfuscatedName("client.jc")
	public long field150;

	@ObfuscatedName("client.pd")
	public long field204;

	@ObfuscatedName("client.Gd")
	public long field221;

	@ObfuscatedName("client.de")
	public long field243;

	@ObfuscatedName("client.Cc")
	public DGXCFOYI field168;

	@ObfuscatedName("client.Dc")
	public DGXCFOYI field169;

	@ObfuscatedName("client.Ze")
	public DGXCFOYI field285;

	@ObfuscatedName("client.af")
	public DGXCFOYI field286;

	@ObfuscatedName("client.bf")
	public DGXCFOYI field287;

	@ObfuscatedName("client.mg")
	public DGXCFOYI field344;

	@ObfuscatedName("client.ng")
	public DGXCFOYI field345;

	@ObfuscatedName("client.og")
	public DGXCFOYI field346;

	@ObfuscatedName("client.ch")
	public DGXCFOYI field379;

	@ObfuscatedName("client.dh")
	public DGXCFOYI field380;

	@ObfuscatedName("client.eh")
	public DGXCFOYI field381;

	@ObfuscatedName("client.fh")
	public DGXCFOYI field382;

	@ObfuscatedName("client.gh")
	public DGXCFOYI field383;

	@ObfuscatedName("client.Zh")
	public DGXCFOYI field424;

	@ObfuscatedName("client.ai")
	public DGXCFOYI field425;

	@ObfuscatedName("client.bi")
	public DGXCFOYI field426;

	@ObfuscatedName("client.ci")
	public DGXCFOYI field427;

	@ObfuscatedName("client.di")
	public DGXCFOYI field428;

	@ObfuscatedName("client.Oj")
	public DGXCFOYI field508;

	@ObfuscatedName("client.Pj")
	public DGXCFOYI field509;

	@ObfuscatedName("client.Jd")
	public DHNAQSHE field224;

	@ObfuscatedName("client.Ce")
	public GAUMGPFH field264;

	@ObfuscatedName("client.Db")
	public HOSNGCXH field122;

	@ObfuscatedName("client.Xb")
	public HOSNGCXH field139;

	@ObfuscatedName("client.Yb")
	public HOSNGCXH field140;

	@ObfuscatedName("client.Zb")
	public HOSNGCXH field141;

	@ObfuscatedName("client.ac")
	public HOSNGCXH field142;

	@ObfuscatedName("client.bc")
	public HOSNGCXH field143;

	@ObfuscatedName("client.zg")
	public HOSNGCXH field354;

	@ObfuscatedName("client.Dg")
	public HOSNGCXH field358;

	@ObfuscatedName("client.Yi")
	public HOSNGCXH field471;

	@ObfuscatedName("client.Zi")
	public HOSNGCXH field472;

	@ObfuscatedName("client.kj")
	public HOSNGCXH field481;

	@ObfuscatedName("client.lj")
	public HOSNGCXH field482;

	@ObfuscatedName("client.tj")
	public HOSNGCXH field488;

	@ObfuscatedName("client.uj")
	public HOSNGCXH field489;

	@ObfuscatedName("client.Lj")
	public HOSNGCXH field505;

	@ObfuscatedName("client.Nc")
	public KYNTOGBR field178;

	@ObfuscatedName("client.Id")
	public static QAJCAYDZ field223;

	@ObfuscatedName("client.be")
	public QHNACLRF field242;

	@ObfuscatedName("client.wc")
	public RLQTDOAP field162;

	@ObfuscatedName("client.xc")
	public RLQTDOAP field163;

	@ObfuscatedName("client.yc")
	public RLQTDOAP field164;

	@ObfuscatedName("client.zc")
	public RLQTDOAP field165;

	@ObfuscatedName("client.td")
	public TKEGJSFV field208;

	@ObfuscatedName("client.xg")
	public UFCPVKNJ field352;

	@ObfuscatedName("client.Fb")
	public YJGBGRIO field124;

	@ObfuscatedName("client.Gb")
	public YJGBGRIO field125;

	@ObfuscatedName("client.Hb")
	public YJGBGRIO field126;

	@ObfuscatedName("client.Ib")
	public YJGBGRIO field127;

	@ObfuscatedName("client.Jb")
	public YJGBGRIO field128;

	@ObfuscatedName("client.Kb")
	public YJGBGRIO field129;

	@ObfuscatedName("client.Lb")
	public YJGBGRIO field130;

	@ObfuscatedName("client.Mb")
	public YJGBGRIO field131;

	@ObfuscatedName("client.Nb")
	public YJGBGRIO field132;

	@ObfuscatedName("client.qd")
	public YJGBGRIO field205;

	@ObfuscatedName("client.rd")
	public YJGBGRIO field206;

	@ObfuscatedName("client.sd")
	public YJGBGRIO field207;

	@ObfuscatedName("client.Jf")
	public YJGBGRIO field316;

	@ObfuscatedName("client.Kf")
	public YJGBGRIO field317;

	@ObfuscatedName("client.Lf")
	public YJGBGRIO field318;

	@ObfuscatedName("client.Mf")
	public YJGBGRIO field319;

	@ObfuscatedName("client.th")
	public YJGBGRIO field396;

	@ObfuscatedName("client.uh")
	public YJGBGRIO field397;

	@ObfuscatedName("client.vh")
	public YJGBGRIO field398;

	@ObfuscatedName("client.wh")
	public YJGBGRIO field399;

	@ObfuscatedName("client.xh")
	public YJGBGRIO field400;

	@ObfuscatedName("client.yh")
	public YJGBGRIO field401;

	@ObfuscatedName("client.zh")
	public YJGBGRIO field402;

	@ObfuscatedName("client.Ah")
	public YJGBGRIO field403;

	@ObfuscatedName("client.Bh")
	public YJGBGRIO field404;

	@ObfuscatedName("client.tc")
	public String field159;

	@ObfuscatedName("client.Xc")
	public String field186;

	@ObfuscatedName("client.Yg")
	public String field375;

	@ObfuscatedName("client.hj")
	public String field478;

	@ObfuscatedName("client.md")
	public Socket field201;

	@ObfuscatedName("client.nb")
	public static boolean field108;

	@ObfuscatedName("client.kc")
	public static boolean field151;

	@ObfuscatedName("client.Bc")
	public static boolean field167;

	@ObfuscatedName("client.dg")
	public static boolean field335;

	@ObfuscatedName("client.Ie")
	public int[] field268;

	@ObfuscatedName("client.Je")
	public int[] field269;

	@ObfuscatedName("client.zf")
	public int[] field308;

	@ObfuscatedName("client.Af")
	public int[] field309;

	@ObfuscatedName("client.Bf")
	public int[] field310;

	@ObfuscatedName("client.Yf")
	public int[] field330;

	@ObfuscatedName("client.Zf")
	public int[] field331;

	@ObfuscatedName("client.ag")
	public int[] field332;

	@ObfuscatedName("client.bg")
	public int[] field333;

	@ObfuscatedName("client.wi")
	public int[] field445;

	@ObfuscatedName("client.xi")
	public int[] field446;

	@ObfuscatedName("client.Dj")
	public int[] field497;

	@ObfuscatedName("client.Ej")
	public int[] field498;

	@ObfuscatedName("client.Fj")
	public int[] field499;

	@ObfuscatedName("client.Gj")
	public int[] field500;

	@ObfuscatedName("client.Uj")
	public DGXCFOYI[] field514;

	@ObfuscatedName("client.We")
	public byte[][] field282;

	@ObfuscatedName("client.Of")
	public byte[][] field321;

	@ObfuscatedName("client.ph")
	public byte[][][] field392;

	@ObfuscatedName("client.jg")
	public int[][][] field341;

	@ObfuscatedName("client.a(ZLDGXCFOYI;)V")
	public final void method31(DGXCFOYI arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field268.length; var3++) {
			field268[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field268[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field269[var9] = (field268[var9 - 1] + field268[var9 + 1] + field268[var9 - 128] + field268[var9 + 128]) / 4;
				}
			}

			int[] var10 = field268;
			field268 = field269;
			field269 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field532; var12++) {
				for (int var13 = 0; var13 < arg0.field531; var13++) {
					if (arg0.field529[var11++] != 0) {
						int var14 = var13 + arg0.field533 + 16;
						int var15 = var12 + arg0.field534 + 16;
						int var16 = (var15 << 7) + var14;
						field268[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method32(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method33(int arg0, int arg1) {
		JQSVNFRT var3 = field468[field323][arg0][arg1];
		if (var3 == null) {
			field178.method435(field323, arg0, arg1);
		} else {
			int var4 = -99999999;
			JGSTQLRC var5 = null;
			for (JGSTQLRC var6 = (JGSTQLRC) var3.method395(); var6 != null; var6 = (JGSTQLRC) var3.method397()) {
				WMJBOJYO var7 = WMJBOJYO.method560(var6.field849);
				int var8 = var7.field1421;
				if (var7.field1398) {
					var8 = (var6.field848 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method393(var5);
			JGSTQLRC var9 = null;
			JGSTQLRC var10 = null;
			for (JGSTQLRC var11 = (JGSTQLRC) var3.method395(); var11 != null; var11 = (JGSTQLRC) var3.method397()) {
				if (var5.field849 != var11.field849 && var9 == null) {
					var9 = var11;
				}

				if (var5.field849 != var11.field849 && var9.field849 != var11.field849 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field178.method421(var9, var10, arg1, arg0, method152(arg0 * 128 + 64, arg1 * 128 + 64, field323), var5, field323, var12);
		}
	}

	@ObfuscatedName("client.a(LZOMFWUWL;BI)V")
	public final void method34(ZOMFWUWL arg0, int arg1) {
		method35(arg1, arg0.field1478, arg0.field1479);
	}

	@ObfuscatedName("client.a(IZII)V")
	public final void method35(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method152(arg1, arg2, field323) - arg0;
			arg1 -= field360;
			var4 -= field361;
			arg2 -= field362;
			int var5 = IGXVZOHI.field841[field363];
			int var6 = IGXVZOHI.field842[field363];
			int var7 = IGXVZOHI.field841[field364];
			int var8 = IGXVZOHI.field842[field364];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field438 = (var9 << 9) / arg2 + PNDPOZTD.field1153;
				field439 = (var11 << 9) / arg2 + PNDPOZTD.field1154;
			} else {
				field438 = -1;
				field439 = -1;
			}
		} else {
			field438 = -1;
			field439 = -1;
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method36() {
		int var1 = 5;
		field342[8] = 0;
		int var2 = 0;
		while (field342[8] == 0) {
			String var3 = "Unknown problem";
			method92("Connecting to web server", 20);

			try {
				DataInputStream var4 = method99("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 346);
				EGCCHUZS var5 = new EGCCHUZS(new byte[40]);
				var4.readFully(var5.field588, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field342[var6] = var5.method266();
				}

				int var7 = var5.method266();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field342[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field342[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field342[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field342[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field342[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field342[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method92("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method92(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field394 = !field394;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method37(boolean arg0) {
		for (int var2 = 0; var2 < field422; var2++) {
			CHUIKYUV var3 = field421[field423[var2]];
			int var4 = (field423[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method29() && var3.field69.field18 == arg0 && var3.field69.method4()) {
				int var5 = var3.field1478 >> 7;
				int var6 = var3.field1479 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1474 == 1 && (var3.field1478 & 0x7F) == 0x40 && (var3.field1479 & 0x7F) == 0x40) {
						if (field369[var5][var6] == field479) {
							continue;
						}

						field369[var5][var6] = field479;
					}

					if (!var3.field69.field10) {
						var4 += Integer.MIN_VALUE;
					}

					field178.method425((var3.field1474 - 1) * 64 + 60, var3.field1457, var3.field1479, var3, method152(var3.field1478, var3.field1479, field323), var3.field1478, field323, var4, var3.field1480);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILQAJCAYDZ;IIB)V")
	public final void method38(int arg0, QAJCAYDZ arg1, int arg2, int arg3) {
		if (field223 != arg1 && field487 < 400) {
			String var5;
			if (arg1.field1253 == 0) {
				var5 = arg1.field1255 + method146(arg1.field1260, field223.field1260) + " (level-" + arg1.field1260 + ")";
			} else {
				var5 = arg1.field1255 + " (skill-" + arg1.field1253 + ")";
			}

			if (field182 == 1) {
				field348[field487] = "Use " + field186 + " with @whi@" + var5;
				field237[field487] = 131;
				field238[field487] = arg3;
				field235[field487] = arg2;
				field236[field487] = arg0;
				field487++;
			} else if (field372 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field297[var6] != null) {
						field348[field487] = field297[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field297[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1260 > field223.field1260) {
								var7 = 2000;
							}

							if (field223.field1261 != 0 && arg1.field1261 != 0) {
								if (field223.field1261 == arg1.field1261) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field298[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field237[field487] = var7 + 912;
						}

						if (var6 == 1) {
							field237[field487] = var7 + 90;
						}

						if (var6 == 2) {
							field237[field487] = var7 + 288;
						}

						if (var6 == 3) {
							field237[field487] = var7 + 587;
						}

						if (var6 == 4) {
							field237[field487] = var7 + 858;
						}

						field238[field487] = arg3;
						field235[field487] = arg2;
						field236[field487] = arg0;
						field487++;
					}
				}
			} else if ((field374 & 0x8) == 8) {
				field348[field487] = field375 + " @whi@" + var5;
				field237[field487] = 673;
				field238[field487] = arg3;
				field235[field487] = arg2;
				field236[field487] = arg0;
				field487++;
			}

			for (int var8 = 0; var8 < field487; var8++) {
				if (field237[var8] == 506) {
					field348[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILEGCCHUZS;I)V")
	public final void method39(EGCCHUZS arg0, int arg1) {
		field458 = 0;
		field231 = 0;
		method135(arg0, arg1);
		method110(arg1, arg0);
		method126(arg0, arg1);
		method116(arg1, arg0);

		for (int var3 = 0; var3 < field458; var3++) {
			int var4 = field459[var3];
			if (field123 != field228[var4].field1500) {
				field228[var4] = null;
			}
		}

		if (arg0.field589 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field589 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field229; var5++) {
			if (field228[field230[var5]] == null) {
				signlink.reporterror(field101 + " null entry in pl list - pos:" + var5 + " size:" + field229);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LLORGYGVM;I)Z")
	public final boolean method40(LORGYGVM arg0) {
		int var2 = arg0.field1021;
		if (field191 == 2) {
			if (var2 == 201) {
				field322 = true;
				field441 = 0;
				field460 = true;
				field313 = "";
				field494 = 1;
				field172 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field322 = true;
				field441 = 0;
				field460 = true;
				field313 = "";
				field494 = 2;
				field172 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field196 = 250;
			return true;
		}

		if (var2 == 501) {
			field322 = true;
			field441 = 0;
			field460 = true;
			field313 = "";
			field494 = 4;
			field172 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field322 = true;
			field441 = 0;
			field460 = true;
			field313 = "";
			field494 = 5;
			field172 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field144[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = ZWYXHQWS.field1506 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= ZWYXHQWS.field1506) {
							var5 = 0;
						}
					}

					if (!ZWYXHQWS.field1507[var5].field1513 && ZWYXHQWS.field1507[var5].field1508 == var3 + (field234 ? 0 : 7)) {
						break;
					}
				}

				field144[var3] = var5;
				field117 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field377[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field393[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field393[var6].length) {
					var8 = 0;
				}
			}

			field377[var6] = var8;
			field117 = true;
		}

		if (var2 == 324 && !field234) {
			field234 = true;
			method170();
		}

		if (var2 == 325 && field234) {
			field234 = false;
			method170();
		}

		if (var2 == 326) {
			field474.method250(234);
			field474.method251(field234 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field474.method251(field144[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field474.method251(field377[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field434 = !field434;
		}

		if (var2 >= 601 && var2 <= 613) {
			method159();

			if (field181.length() > 0) {
				field474.method250(189);
				field474.method257(XXUUHLAE.method574(field181));
				field474.method251(var2 - 601);
				field474.method251(field434 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method41() {
		if (field302 == 0) {
			field348[0] = "Cancel";
			field237[0] = 1761;
			field487 = 1;
			if (field368 == -1) {
				method90();
				field247 = 0;
				field189 = 0;

				if (field879 > 4 && field880 > 4 && field879 < 516 && field880 < 338) {
					if (field222 == -1) {
						method45();
					} else {
						method165(field880, 0, LORGYGVM.method477(field222), 0, 4, 4, field879);
					}
				}

				if (field475 != field247) {
					field475 = field247;
				}

				if (field391 != field189) {
					field391 = field189;
				}

				field247 = 0;
				field189 = 0;

				if (field879 > 553 && field880 > 205 && field879 < 743 && field880 < 466) {
					if (field306 != -1) {
						method165(field880, 0, LORGYGVM.method477(field306), 1, 205, 553, field879);
					} else if (field334[field100] != -1) {
						method165(field880, 0, LORGYGVM.method477(field334[field100]), 1, 205, 553, field879);
					}
				}

				if (field277 != field247) {
					field249 = true;
					field277 = field247;
				}

				if (field480 != field189) {
					field249 = true;
					field480 = field189;
				}

				field247 = 0;
				field189 = 0;

				if (field879 > 17 && field880 > 357 && field879 < 496 && field880 < 453) {
					if (field271 != -1) {
						method165(field880, 0, LORGYGVM.method477(field271), 2, 357, 17, field879);
					} else if (field415 != -1) {
						method165(field880, 0, LORGYGVM.method477(field415), 3, 357, 17, field879);
					} else if (field880 < 434 && field879 < 426) {
						method153(field879 - 17, field880 - 357);
					}
				}

				if ((field271 != -1 || field415 != -1) && field91 != field247) {
					field322 = true;
					field91 = field247;
				}

				if ((field271 != -1 || field415 != -1) && field388 != field189) {
					field322 = true;
					field388 = field189;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field487 - 1; var2++) {
						if (field237[var2] < 1000 && field237[var2 + 1] > 1000) {
							String var3 = field348[var2];
							field348[var2] = field348[var2 + 1];
							field348[var2 + 1] = var3;
							int var4 = field237[var2];
							field237[var2] = field237[var2 + 1];
							field237[var2 + 1] = var4;
							int var5 = field235[var2];
							field235[var2] = field235[var2 + 1];
							field235[var2 + 1] = var5;
							int var6 = field236[var2];
							field236[var2] = field236[var2 + 1];
							field236[var2 + 1] = var6;
							int var7 = field238[var2];
							field238[var2] = field238[var2 + 1];
							field238[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field247 = 0;
				field189 = 0;
				method165(field880, 0, LORGYGVM.method477(field368), 0, 0, 0, field879);

				if (field475 != field247) {
					field475 = field247;
				}

				if (field391 != field189) {
					field391 = field189;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method42(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.f(B)V")
	public final void method43() {
		if (field202 == 0) {
			int var1 = field869 / 2 - 80;
			int var2 = field870 / 2 + 20;
			var2 += 20;
			if (field885 == 1 && field886 >= var1 - 75 && field886 <= var1 + 75 && field887 >= var2 - 20 && field887 <= var2 + 20) {
				field202 = 3;
				field114 = 0;
			}

			int var3 = field869 / 2 + 80;
			if (field885 == 1 && field886 >= var3 - 75 && field886 <= var3 + 75 && field887 >= var2 - 20 && field887 <= var2 + 20) {
				field103 = "";
				field104 = "Enter your username & password.";
				field202 = 2;
				field114 = 0;
			}
		} else if (field202 == 2) {
			int var4 = field870 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field885 == 1 && field887 >= var4 - 15 && field887 < var4) {
				field114 = 0;
			}

			var4 += 15;
			if (field885 == 1 && field887 >= var4 - 15 && field887 < var4) {
				field114 = 1;
			}

			var4 += 15;
			int var5 = field869 / 2 - 80;
			int var6 = field870 / 2 + 50;
			var6 += 20;
			if (field885 == 1 && field886 >= var5 - 75 && field886 <= var5 + 75 && field887 >= var6 - 20 && field887 <= var6 + 20) {
				field347 = 0;
				method158(field101, field102, false);

				if (field470) {
					return;
				}
			}

			int var7 = field869 / 2 + 80;
			if (field885 == 1 && field886 >= var7 - 75 && field886 <= var7 + 75 && field887 >= var6 - 20 && field887 <= var6 + 20) {
				field202 = 0;
				field101 = "";
				field102 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method412();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field115.length(); var10++) {
					if (var8 == field115.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field114 == 0) {
					if (var8 == 8 && field101.length() > 0) {
						field101 = field101.substring(0, field101.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field114 = 1;
					}

					if (var9) {
						field101 = field101 + (char) var8;
					}

					if (field101.length() > 12) {
						field101 = field101.substring(0, 12);
					}
				} else if (field114 == 1) {
					if (var8 == 8 && field102.length() > 0) {
						field102 = field102.substring(0, field102.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field114 = 0;
					}

					if (var9) {
						field102 = field102 + (char) var8;
					}

					if (field102.length() > 20) {
						field102 = field102.substring(0, 20);
					}
				}
			}
		} else if (field202 == 3) {
			int var11 = field869 / 2;
			int var12 = field870 / 2 + 50;
			var12 += 20;
			if (field885 == 1 && field886 >= var11 - 75 && field886 <= var11 + 75 && field887 >= var12 - 20 && field887 <= var12 + 20) {
				field202 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method44() {
		field316.method580();
		PNDPOZTD.field1159 = field498;
		field344.method183(0, 0);

		if (field306 != -1) {
			method148(0, 0, 0, LORGYGVM.method477(field306));
		} else if (field334[field100] != -1) {
			method148(0, 0, 0, LORGYGVM.method477(field334[field100]));
		}

		if (field469 && field410 == 1) {
			method58();
		}

		field316.method581(553, 205, field871);
		field318.method580();
		PNDPOZTD.field1159 = field499;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method45() {
		if (field182 == 0 && field372 == 0) {
			field348[field487] = "Walk here";
			field237[field487] = 506;
			field235[field487] = field879;
			field236[field487] = field880;
			field487++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < IGXVZOHI.field839; var2++) {
			int var3 = IGXVZOHI.field840[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field178.method444(field323, var4, var5, var3) >= 0) {
					HGKOLOPU var8 = HGKOLOPU.method326(var7);
					if (var8.field691 != null) {
						var8 = var8.method329();
					}

					if (var8 == null) {
						continue;
					}

					if (field182 == 1) {
						field348[field487] = "Use " + field186 + " with @cya@" + var8.field698;
						field237[field487] = 688;
						field238[field487] = var3;
						field235[field487] = var4;
						field236[field487] = var5;
						field487++;
					} else if (field372 != 1) {
						if (var8.field725 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field725[var9] != null) {
									field348[field487] = var8.field725[var9] + " @cya@" + var8.field698;

									if (var9 == 0) {
										field237[field487] = 941;
									}

									if (var9 == 1) {
										field237[field487] = 559;
									}

									if (var9 == 2) {
										field237[field487] = 535;
									}

									if (var9 == 3) {
										field237[field487] = 705;
									}

									if (var9 == 4) {
										field237[field487] = 1258;
									}

									field238[field487] = var3;
									field235[field487] = var4;
									field236[field487] = var5;
									field487++;
								}
							}
						}

						field348[field487] = "Examine @cya@" + var8.field698;
						field237[field487] = 1225;
						field238[field487] = var8.field690 << 14;
						field235[field487] = var4;
						field236[field487] = var5;
						field487++;
					} else if ((field374 & 0x4) == 4) {
						field348[field487] = field375 + " @cya@" + var8.field698;
						field237[field487] = 355;
						field238[field487] = var3;
						field235[field487] = var4;
						field236[field487] = var5;
						field487++;
					}
				}

				if (var6 == 1) {
					CHUIKYUV var10 = field421[var7];
					if (var10.field69.field16 == 1 && (var10.field1478 & 0x7F) == 0x40 && (var10.field1479 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field422; var11++) {
							CHUIKYUV var12 = field421[field423[var11]];
							if (var12 != null && var10 != var12 && var12.field69.field16 == 1 && var10.field1478 == var12.field1478 && var10.field1479 == var12.field1479) {
								method156(field423[var11], var12.field69, var4, var5);
							}
						}

						for (int var13 = 0; var13 < field229; var13++) {
							QAJCAYDZ var14 = field228[field230[var13]];
							if (var14 != null && var10.field1478 == var14.field1478 && var10.field1479 == var14.field1479) {
								method38(var5, var14, var4, field230[var13]);
							}
						}
					}

					method156(var7, var10.field69, var4, var5);
				}

				if (var6 == 0) {
					QAJCAYDZ var15 = field228[var7];
					if ((var15.field1478 & 0x7F) == 0x40 && (var15.field1479 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field422; var16++) {
							CHUIKYUV var17 = field421[field423[var16]];
							if (var17 != null && var17.field69.field16 == 1 && var15.field1478 == var17.field1478 && var15.field1479 == var17.field1479) {
								method156(field423[var16], var17.field69, var4, var5);
							}
						}

						for (int var18 = 0; var18 < field229; var18++) {
							QAJCAYDZ var19 = field228[field230[var18]];
							if (var19 != null && var15 != var19 && var15.field1478 == var19.field1478 && var15.field1479 == var19.field1479) {
								method38(var5, var19, var4, field230[var18]);
							}
						}
					}

					method38(var5, var15, var4, var7);
				}

				if (var6 == 3) {
					JQSVNFRT var20 = field468[field323][var4][var5];
					if (var20 != null) {
						for (JGSTQLRC var21 = (JGSTQLRC) var20.method396(); var21 != null; var21 = (JGSTQLRC) var20.method398()) {
							WMJBOJYO var22 = WMJBOJYO.method560(var21.field849);
							if (field182 == 1) {
								field348[field487] = "Use " + field186 + " with @lre@" + var22.field1419;
								field237[field487] = 819;
								field238[field487] = var21.field849;
								field235[field487] = var4;
								field236[field487] = var5;
								field487++;
							} else if (field372 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1425 != null && var22.field1425[var23] != null) {
										field348[field487] = var22.field1425[var23] + " @lre@" + var22.field1419;

										if (var23 == 0) {
											field237[field487] = 100;
										}

										if (var23 == 1) {
											field237[field487] = 485;
										}

										if (var23 == 2) {
											field237[field487] = 613;
										}

										if (var23 == 3) {
											field237[field487] = 583;
										}

										if (var23 == 4) {
											field237[field487] = 46;
										}

										field238[field487] = var21.field849;
										field235[field487] = var4;
										field236[field487] = var5;
										field487++;
									} else if (var23 == 2) {
										field348[field487] = "Take @lre@" + var22.field1419;
										field237[field487] = 613;
										field238[field487] = var21.field849;
										field235[field487] = var4;
										field236[field487] = var5;
										field487++;
									}
								}

								field348[field487] = "Examine @lre@" + var22.field1419;
								field237[field487] = 1583;
								field238[field487] = var21.field849;
								field235[field487] = var4;
								field236[field487] = var5;
								field487++;
							} else if ((field374 & 0x1) == 1) {
								field348[field487] = field375 + " @lre@" + var22.field1419;
								field237[field487] = 302;
								field238[field487] = var21.field849;
								field235[field487] = var4;
								field236[field487] = var5;
								field487++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field168.method183(arg3, arg4);
		field169.method183(arg0 + arg3 - 16, arg4);
		JOVUNXBE.method385(arg3 + 16, 16, arg0 - 32, arg4, field154);
		int var6 = (arg0 - 32) * arg0 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg2 / (arg1 - arg0);
		JOVUNXBE.method385(arg3 + var7 + 16, 16, var6, arg4, field291);
		JOVUNXBE.method390(arg3 + var7 + 16, arg4, field96, var6);
		JOVUNXBE.method390(arg3 + var7 + 16, arg4 + 1, field96, var6);
		JOVUNXBE.method388(arg3 + var7 + 16, arg4, 16, field96);
		JOVUNXBE.method388(arg3 + var7 + 17, arg4, 16, field96);
		JOVUNXBE.method390(arg3 + var7 + 16, arg4 + 15, field259, var6);
		JOVUNXBE.method390(arg3 + var7 + 17, arg4 + 14, field259, var6 - 1);
		JOVUNXBE.method388(arg3 + var7 + var6 + 15, arg4, 16, field259);
		JOVUNXBE.method388(arg3 + var7 + var6 + 14, arg4 + 1, 15, field259);
	}

	@ObfuscatedName("client.e(I)Ljava/net/Socket;")
	public final Socket method47(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.h(B)V")
	public final void method48() {
		field450 = 0;
		int var1 = (field223.field1478 >> 7) + field463;
		int var2 = (field223.field1479 >> 7) + field464;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field450 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field450 = 1;
		}

		if (field450 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field450 = 0;
		}
	}

	@ObfuscatedName("client.f(I)Z")
	public final boolean method49() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.g(I)V")
	public final void method50() {
		for (int var1 = -1; var1 < field229; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field227;
			} else {
				var2 = field230[var1];
			}

			QAJCAYDZ var3 = field228[var2];
			if (var3 != null) {
				method61(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method51(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method51(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(ILLORGYGVM;IIIIIIB)V")
	public final void method52(int arg0, LORGYGVM arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field386) {
			field250 = 32;
		} else {
			field250 = 0;
		}

		field386 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg2 && arg5 < arg2 + 16) {
			arg1.field991 -= field442 * 4;

			if (arg4 == 1) {
				field249 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field322 = true;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 + arg2 - 16 && arg5 < arg0 + arg2) {
			arg1.field991 += field442 * 4;

			if (arg4 == 1) {
				field249 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field322 = true;
			}
		} else if (arg6 >= arg7 - field250 && arg6 < arg7 + field250 + 16 && arg5 >= arg2 + 16 && arg5 < arg0 + arg2 - 16 && field442 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg2 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg1.field991 = (arg3 - arg0) * var10 / var11;

			if (arg4 == 1) {
				field249 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field322 = true;
			}

			field386 = true;
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method53(int arg0) {
		LORGYGVM.method473(arg0);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method54() {
		if (field872 == null) {
			method173();
			field396 = null;
			field397 = null;
			field398 = null;
			field399 = null;
			field400 = null;
			field401 = null;
			field402 = null;
			field403 = null;
			field404 = null;
			field319 = null;
			field317 = null;
			field316 = null;
			field318 = null;
			field205 = null;
			field206 = null;
			field207 = null;
			field872 = new YJGBGRIO(method139(), 765, 503);
			field149 = true;
		}
	}

	@ObfuscatedName("client.b(Z)Ljava/lang/String;")
	public final String method55() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field874 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.i(I)V")
	public final void method56() {
		if (field302 == 0) {
			int var1 = field885;
			if (field372 == 1 && field886 >= 516 && field887 >= 160 && field886 <= 765 && field887 <= 205) {
				var1 = 0;
			}

			if (field469) {
				if (var1 != 1) {
					int var2 = field879;
					int var3 = field880;
					if (field410 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field410 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field410 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field411 - 10 || var2 > field413 + field411 + 10 || var3 < field412 - 10 || var3 > field414 + field412 + 10) {
						field469 = false;

						if (field410 == 1) {
							field249 = true;
						}

						if (field410 == 2) {
							field322 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field411;
					int var5 = field412;
					int var6 = field413;
					int var7 = field886;
					int var8 = field887;
					if (field410 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field410 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field410 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field487; var10++) {
						int var11 = (field487 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method112(var9);
					}

					field469 = false;

					if (field410 == 1) {
						field249 = true;
					}

					if (field410 == 2) {
						field322 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field487 > 0) {
					int var12 = field237[field487 - 1];
					if (var12 == 285 || var12 == 881 || var12 == 875 || var12 == 397 || var12 == 233 || var12 == 963 || var12 == 984 || var12 == 816 || var12 == 800 || var12 == 866 || var12 == 219 || var12 == 1948) {
						int var13 = field235[field487 - 1];
						int var14 = field236[field487 - 1];
						LORGYGVM var15 = LORGYGVM.method477(var14);
						if (var15.field1032 || var15.field1005) {
							field457 = false;
							field484 = 0;
							field300 = var14;
							field301 = var13;
							field302 = 2;
							field303 = field886;
							field304 = field887;

							if (LORGYGVM.method477(var14).field1015 == field222) {
								field302 = 1;
							}

							if (LORGYGVM.method477(var14).field1015 == field271) {
								field302 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field209 == 1 || method77(field487 - 1)) && field487 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field487 > 0) {
					method112(field487 - 1);
				}

				if (var1 != 2 || field487 <= 0) {
					return;
				}

				method154();
			}
		}
	}

	@ObfuscatedName("client.a([BZI)V")
	public final void method57(byte[] arg0, boolean arg1) {
		if (field444) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method58() {
		int var1 = field411;
		int var2 = field412;
		int var3 = field413;
		int var4 = field414;
		int var5 = 0x5D5447;
		JOVUNXBE.method385(var2, var3, var4, var1, var5);
		JOVUNXBE.method385(var2 + 1, var3 - 2, 16, var1 + 1, 0);
		JOVUNXBE.method386(var3 - 2, var4 - 19, 0, var1 + 1, var2 + 18);
		field164.method530(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field879;
		int var7 = field880;
		if (field410 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field410 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field410 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field487; var8++) {
			int var9 = (field487 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field164.method534(field348[var8], var10, var9, var1 + 3, true);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method59() {
		HGKOLOPU.field688.method3();
		HGKOLOPU.field687.method3();
		AUWOQLEO.field9.method3();
		WMJBOJYO.field1402.method3();
		WMJBOJYO.field1397.method3();
		QAJCAYDZ.field1247.method3();
		VCTVXSNH.field1360.method3();
	}

	@ObfuscatedName("client.i(B)V")
	public final void method60() {
		for (int var1 = 0; var1 < field422; var1++) {
			int var2 = field423[var1];
			CHUIKYUV var3 = field421[var2];
			if (var3 != null) {
				method61(var3.field69.field16, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IZLZOMFWUWL;)V")
	public final void method61(int arg0, ZOMFWUWL arg1) {
		if (arg1.field1478 < 128 || arg1.field1479 < 128 || arg1.field1478 >= 13184 || arg1.field1479 >= 13184) {
			arg1.field1452 = -1;
			arg1.field1501 = -1;
			arg1.field1485 = 0;
			arg1.field1486 = 0;
			arg1.field1478 = arg1.field1464[0] * 128 + arg1.field1474 * 64;
			arg1.field1479 = arg1.field1465[0] * 128 + arg1.field1474 * 64;
			arg1.method592();
		}

		if (field223 == arg1 && (arg1.field1478 < 1536 || arg1.field1479 < 1536 || arg1.field1478 >= 11776 || arg1.field1479 >= 11776)) {
			arg1.field1452 = -1;
			arg1.field1501 = -1;
			arg1.field1485 = 0;
			arg1.field1486 = 0;
			arg1.field1478 = arg1.field1464[0] * 128 + arg1.field1474 * 64;
			arg1.field1479 = arg1.field1465[0] * 128 + arg1.field1474 * 64;
			arg1.method592();
		}

		if (arg1.field1485 > field123) {
			method62(arg1);
		} else if (arg1.field1486 >= field123) {
			method63(arg1);
		} else {
			method64(arg1);
		}

		method65(arg1);
		method66(arg1);
	}

	@ObfuscatedName("client.a(LZOMFWUWL;I)V")
	public final void method62(ZOMFWUWL arg0) {
		int var2 = arg0.field1485 - field123;
		int var3 = arg0.field1481 * 128 + arg0.field1474 * 64;
		int var4 = arg0.field1483 * 128 + arg0.field1474 * 64;
		arg0.field1478 += (var3 - arg0.field1478) / var2;
		arg0.field1479 += (var4 - arg0.field1479) / var2;
		arg0.field1470 = 0;

		if (arg0.field1487 == 0) {
			arg0.field1477 = 1024;
		}

		if (arg0.field1487 == 1) {
			arg0.field1477 = 1536;
		}

		if (arg0.field1487 == 2) {
			arg0.field1477 = 0;
		}

		if (arg0.field1487 == 3) {
			arg0.field1477 = 512;
		}
	}

	@ObfuscatedName("client.b(LZOMFWUWL;I)V")
	public final void method63(ZOMFWUWL arg0) {
		if (field123 == arg0.field1486 || arg0.field1452 == -1 || arg0.field1455 != 0 || arg0.field1454 + 1 > BZONLWPM.field53[arg0.field1452].method27(arg0.field1453)) {
			int var2 = arg0.field1486 - arg0.field1485;
			int var3 = field123 - arg0.field1485;
			int var4 = arg0.field1481 * 128 + arg0.field1474 * 64;
			int var5 = arg0.field1483 * 128 + arg0.field1474 * 64;
			int var6 = arg0.field1482 * 128 + arg0.field1474 * 64;
			int var7 = arg0.field1484 * 128 + arg0.field1474 * 64;
			arg0.field1478 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1479 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1470 = 0;

		if (arg0.field1487 == 0) {
			arg0.field1477 = 1024;
		}

		if (arg0.field1487 == 1) {
			arg0.field1477 = 1536;
		}

		if (arg0.field1487 == 2) {
			arg0.field1477 = 0;
		}

		if (arg0.field1487 == 3) {
			arg0.field1477 = 512;
		}

		arg0.field1480 = arg0.field1477;
	}

	@ObfuscatedName("client.a(LZOMFWUWL;B)V")
	public final void method64(ZOMFWUWL arg0) {
		arg0.field1497 = arg0.field1475;
		if (arg0.field1459 == 0) {
			arg0.field1470 = 0;
		} else {
			if (arg0.field1452 != -1 && arg0.field1455 == 0) {
				BZONLWPM var2 = BZONLWPM.field53[arg0.field1452];
				if (arg0.field1451 > 0 && var2.field65 == 0) {
					arg0.field1470++;
					return;
				}

				if (arg0.field1451 <= 0 && var2.field66 == 0) {
					arg0.field1470++;
					return;
				}
			}

			int var3 = arg0.field1478;
			int var4 = arg0.field1479;
			int var5 = arg0.field1464[arg0.field1459 - 1] * 128 + arg0.field1474 * 64;
			int var6 = arg0.field1465[arg0.field1459 - 1] * 128 + arg0.field1474 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1477 = 1280;
					} else if (var4 > var6) {
						arg0.field1477 = 1792;
					} else {
						arg0.field1477 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1477 = 768;
					} else if (var4 > var6) {
						arg0.field1477 = 256;
					} else {
						arg0.field1477 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1477 = 1024;
				} else {
					arg0.field1477 = 0;
				}

				int var7 = arg0.field1477 - arg0.field1480 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1461;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1460;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1463;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1462;
				}

				if (var8 == -1) {
					var8 = arg0.field1460;
				}

				arg0.field1497 = var8;
				int var9 = 4;
				if (arg0.field1480 != arg0.field1477 && arg0.field1491 == -1 && arg0.field1473 != 0) {
					var9 = 2;
				}

				if (arg0.field1459 > 2) {
					var9 = 6;
				}

				if (arg0.field1459 > 3) {
					var9 = 8;
				}

				if (arg0.field1470 > 0 && arg0.field1459 > 1) {
					var9 = 8;
					arg0.field1470--;
				}

				if (arg0.field1458[arg0.field1459 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1497 == arg0.field1460 && arg0.field1492 != -1) {
					arg0.field1497 = arg0.field1492;
				}

				if (var3 < var5) {
					arg0.field1478 += var9;
					if (arg0.field1478 > var5) {
						arg0.field1478 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1478 -= var9;
					if (arg0.field1478 < var5) {
						arg0.field1478 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1479 += var9;
					if (arg0.field1479 > var6) {
						arg0.field1479 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1479 -= var9;
					if (arg0.field1479 < var6) {
						arg0.field1479 = var6;
					}
				}

				if (arg0.field1478 == var5 && arg0.field1479 == var6) {
					arg0.field1459--;

					if (arg0.field1451 > 0) {
						arg0.field1451--;
						return;
					}
				}
			} else {
				arg0.field1478 = var5;
				arg0.field1479 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LZOMFWUWL;Z)V")
	public final void method65(ZOMFWUWL arg0) {
		if (arg0.field1473 != 0) {
			if (arg0.field1491 != -1 && arg0.field1491 < 32768) {
				CHUIKYUV var2 = field421[arg0.field1491];
				if (var2 != null) {
					int var3 = arg0.field1478 - var2.field1478;
					int var4 = arg0.field1479 - var2.field1479;
					if (var3 != 0 || var4 != 0) {
						arg0.field1477 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1491 >= 32768) {
				int var5 = arg0.field1491 - 32768;
				if (field340 == var5) {
					var5 = field227;
				}

				QAJCAYDZ var6 = field228[var5];
				if (var6 != null) {
					int var7 = arg0.field1478 - var6.field1478;
					int var8 = arg0.field1479 - var6.field1479;
					if (var7 != 0 || var8 != 0) {
						arg0.field1477 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1493 != 0 || arg0.field1494 != 0) && (arg0.field1459 == 0 || arg0.field1470 > 0)) {
				int var9 = arg0.field1478 - (arg0.field1493 - field463 - field463) * 64;
				int var10 = arg0.field1479 - (arg0.field1494 - field464 - field464) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1477 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1493 = 0;
				arg0.field1494 = 0;
			}

			int var11 = arg0.field1477 - arg0.field1480 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1473 || var11 > 2048 - arg0.field1473) {
					arg0.field1480 = arg0.field1477;
				} else if (var11 > 1024) {
					arg0.field1480 -= arg0.field1473;
				} else {
					arg0.field1480 += arg0.field1473;
				}

				arg0.field1480 &= 0x7FF;
				if (arg0.field1497 == arg0.field1475 && arg0.field1480 != arg0.field1477) {
					if (arg0.field1476 != -1) {
						arg0.field1497 = arg0.field1476;
						return;
					}

					arg0.field1497 = arg0.field1460;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LZOMFWUWL;B)V")
	public final void method66(ZOMFWUWL arg0) {
		arg0.field1457 = false;

		if (arg0.field1497 != -1) {
			BZONLWPM var2 = BZONLWPM.field53[arg0.field1497];
			arg0.field1499++;
			if (arg0.field1498 < var2.field54 && arg0.field1499 > var2.method27(arg0.field1498)) {
				arg0.field1499 = 0;
				arg0.field1498++;
			}

			if (arg0.field1498 >= var2.field54) {
				arg0.field1499 = 0;
				arg0.field1498 = 0;
			}
		}

		if (arg0.field1501 != -1 && field123 >= arg0.field1504) {
			if (arg0.field1502 < 0) {
				arg0.field1502 = 0;
			}

			BZONLWPM var3 = VCTVXSNH.field1348[arg0.field1501].field1352;
			arg0.field1503++;
			while (arg0.field1502 < var3.field54 && arg0.field1503 > var3.method27(arg0.field1502)) {
				arg0.field1503 -= var3.method27(arg0.field1502);
				arg0.field1502++;
			}

			if (arg0.field1502 >= var3.field54 && (arg0.field1502 < 0 || arg0.field1502 >= var3.field54)) {
				arg0.field1501 = -1;
			}
		}

		if (arg0.field1452 != -1 && arg0.field1455 <= 1) {
			BZONLWPM var4 = BZONLWPM.field53[arg0.field1452];
			if (var4.field65 == 1 && arg0.field1451 > 0 && arg0.field1485 <= field123 && arg0.field1486 < field123) {
				arg0.field1455 = 1;
				return;
			}
		}

		if (arg0.field1452 != -1 && arg0.field1455 == 0) {
			BZONLWPM var5 = BZONLWPM.field53[arg0.field1452];
			arg0.field1454++;
			while (arg0.field1453 < var5.field54 && arg0.field1454 > var5.method27(arg0.field1453)) {
				arg0.field1454 -= var5.method27(arg0.field1453);
				arg0.field1453++;
			}

			if (arg0.field1453 >= var5.field54) {
				arg0.field1453 -= var5.field58;
				arg0.field1456++;
				if (arg0.field1456 >= var5.field64) {
					arg0.field1452 = -1;
				}

				if (arg0.field1453 < 0 || arg0.field1453 >= var5.field54) {
					arg0.field1452 = -1;
				}
			}

			arg0.field1457 = var5.field60;
		}

		if (arg0.field1455 > 0) {
			arg0.field1455--;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method67() {
		if (field368 == -1 || field152 != 2 && field872 == null) {
			if (field149) {
				method73();
				field149 = false;
				field124.method581(0, 4, field871);
				field125.method581(0, 357, field871);
				field126.method581(722, 4, field871);
				field127.method581(743, 205, field871);
				field128.method581(0, 0, field871);
				field129.method581(516, 4, field871);
				field130.method581(516, 205, field871);
				field131.method581(496, 357, field871);
				field132.method581(0, 338, field871);
				field249 = true;
				field322 = true;
				field158 = true;
				field495 = true;

				if (field152 != 2) {
					field318.method581(4, 4, field871);
					field317.method581(550, 4, field871);
				}
			}

			if (field152 == 2) {
				method111();
			}

			if (field469 && field410 == 1) {
				field249 = true;
			}

			if (field306 != -1) {
				boolean var3 = method108(field93, field306);
				if (var3) {
					field249 = true;
				}
			}

			if (field256 == 2) {
				field249 = true;
			}

			if (field302 == 2) {
				field249 = true;
			}

			if (field249) {
				method44();
				field249 = false;
			}

			if (field271 == -1) {
				field290.field991 = field416 - field307 - 77;

				if (field879 > 448 && field879 < 560 && field880 > 332) {
					method52(77, field290, 0, field416, -1, field880 - 357, field879 - 17, 463);
				}

				int var4 = field416 - field290.field991 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field416 - 77) {
					var4 = field416 - 77;
				}

				if (field307 != var4) {
					field307 = var4;
					field322 = true;
				}
			}

			if (field271 != -1) {
				boolean var5 = method108(field93, field271);
				if (var5) {
					field322 = true;
				}
			}

			if (field256 == 3) {
				field322 = true;
			}

			if (field302 == 3) {
				field322 = true;
			}

			if (field478 != null) {
				field322 = true;
			}

			if (field469 && field410 == 2) {
				field322 = true;
			}

			if (field322) {
				method171();
				field322 = false;
			}

			if (field152 == 2) {
				method167();
				field317.method581(550, 4, field871);
			}

			if (field137 != -1) {
				field158 = true;
			}

			if (field158) {
				if (field137 != -1 && field137 == field100) {
					field137 = -1;
					field474.method250(125);
					field474.method251(field100);
				}

				field158 = false;
				field207.method580();
				field287.method183(0, 0);

				if (field306 == -1) {
					if (field334[field100] != -1) {
						if (field100 == 0) {
							field379.method183(10, 22);
						}

						if (field100 == 1) {
							field380.method183(8, 54);
						}

						if (field100 == 2) {
							field380.method183(8, 82);
						}

						if (field100 == 3) {
							field381.method183(8, 110);
						}

						if (field100 == 4) {
							field383.method183(8, 153);
						}

						if (field100 == 5) {
							field383.method183(8, 181);
						}

						if (field100 == 6) {
							field382.method183(9, 209);
						}
					}

					if (field334[0] != -1 && (field137 != 0 || field123 % 20 < 10)) {
						field378[0].method183(13, 29);
					}

					if (field334[1] != -1 && (field137 != 1 || field123 % 20 < 10)) {
						field378[1].method183(11, 53);
					}

					if (field334[2] != -1 && (field137 != 2 || field123 % 20 < 10)) {
						field378[2].method183(11, 82);
					}

					if (field334[3] != -1 && (field137 != 3 || field123 % 20 < 10)) {
						field378[3].method183(12, 115);
					}

					if (field334[4] != -1 && (field137 != 4 || field123 % 20 < 10)) {
						field378[4].method183(13, 153);
					}

					if (field334[5] != -1 && (field137 != 5 || field123 % 20 < 10)) {
						field378[5].method183(11, 180);
					}

					if (field334[6] != -1 && (field137 != 6 || field123 % 20 < 10)) {
						field378[6].method183(13, 208);
					}
				}

				field207.method581(516, 160, field871);
				field206.method580();
				field286.method183(0, 0);

				if (field306 == -1) {
					if (field334[field100] != -1) {
						if (field100 == 7) {
							field424.method183(0, 42);
						}

						if (field100 == 8) {
							field425.method183(0, 74);
						}

						if (field100 == 9) {
							field425.method183(0, 102);
						}

						if (field100 == 10) {
							field426.method183(1, 130);
						}

						if (field100 == 11) {
							field428.method183(0, 173);
						}

						if (field100 == 12) {
							field428.method183(0, 201);
						}

						if (field100 == 13) {
							field427.method183(0, 229);
						}
					}

					if (field334[8] != -1 && (field137 != 8 || field123 % 20 < 10)) {
						field378[7].method183(2, 74);
					}

					if (field334[9] != -1 && (field137 != 9 || field123 % 20 < 10)) {
						field378[8].method183(3, 102);
					}

					if (field334[10] != -1 && (field137 != 10 || field123 % 20 < 10)) {
						field378[9].method183(4, 137);
					}

					if (field334[11] != -1 && (field137 != 11 || field123 % 20 < 10)) {
						field378[10].method183(2, 174);
					}

					if (field334[12] != -1 && (field137 != 12 || field123 % 20 < 10)) {
						field378[11].method183(2, 201);
					}

					if (field334[13] != -1 && (field137 != 13 || field123 % 20 < 10)) {
						field378[12].method183(2, 226);
					}
				}

				field206.method581(496, 466, field871);
				field318.method580();
				PNDPOZTD.field1159 = field499;
			}

			if (field495) {
				field495 = false;
				field205.method580();
				field285.method183(0, 0);
				field163.method527(28, 0xFFFFFF, 55, true, "Public chat");

				if (field440 == 0) {
					field163.method527(41, 0xFF00, 55, true, "On");
				}

				if (field440 == 1) {
					field163.method527(41, 0xFFFF00, 55, true, "Friends");
				}

				if (field440 == 2) {
					field163.method527(41, 0xFF0000, 55, true, "Off");
				}

				if (field440 == 3) {
					field163.method527(41, 0xFFFF, 55, true, "Hide");
				}

				field163.method527(28, 0xFFFFFF, 184, true, "Private chat");

				if (field325 == 0) {
					field163.method527(41, 0xFF00, 184, true, "On");
				}

				if (field325 == 1) {
					field163.method527(41, 0xFFFF00, 184, true, "Friends");
				}

				if (field325 == 2) {
					field163.method527(41, 0xFF0000, 184, true, "Off");
				}

				field163.method527(28, 0xFFFFFF, 324, true, "Trade/compete");

				if (field339 == 0) {
					field163.method527(41, 0xFF00, 324, true, "On");
				}

				if (field339 == 1) {
					field163.method527(41, 0xFFFF00, 324, true, "Friends");
				}

				if (field339 == 2) {
					field163.method527(41, 0xFF0000, 324, true, "Off");
				}

				field163.method527(33, 0xFFFFFF, 458, true, "Report abuse");
				field205.method581(0, 453, field871);
				field318.method580();
				PNDPOZTD.field1159 = field499;
			}

			field93 = 0;
		} else {
			if (field152 == 2) {
				method108(field93, field368);

				if (field355 != -1) {
					method108(field93, field355);
				}

				field93 = 0;
				method54();
				field872.method580();
				PNDPOZTD.field1159 = field500;
				JOVUNXBE.method383();
				field149 = true;
				LORGYGVM var1 = LORGYGVM.method477(field368);
				if (var1.field1022 == 512 && var1.field1046 == 334 && var1.field1009 == 0) {
					var1.field1022 = 765;
					var1.field1046 = 503;
				}

				method148(0, 0, 0, var1);

				if (field355 != -1) {
					LORGYGVM var2 = LORGYGVM.method477(field355);
					if (var2.field1022 == 512 && var2.field1046 == 334 && var2.field1009 == 0) {
						var2.field1022 = 765;
						var2.field1046 = 503;
					}

					method148(0, 0, 0, var2);
				}

				if (field469) {
					method58();
				} else {
					method41();
					method105();
				}
			}

			field872.method581(0, 0, field871);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method68(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(LEGCCHUZS;II)V")
	public final void method69(EGCCHUZS arg0, int arg1) {
		for (int var3 = 0; var3 < field231; var3++) {
			int var4 = field232[var3];
			CHUIKYUV var5 = field421[var4];
			int var6 = arg0.method261();
			if ((var6 & 0x4) != 0) {
				var5.field1469 = arg0.method268();
				var5.field1471 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field1491 = arg0.method287();
				if (var5.field1491 == 0xFFFF) {
					var5.field1491 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var7 = arg0.method261();
				int var8 = arg0.method261();
				var5.method593(field123, var8, var7);
				var5.field1466 = field123 + 300;
				var5.field1467 = arg0.method281();
				var5.field1468 = arg0.method281();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1501 = arg0.method263();
				int var9 = arg0.method295();
				var5.field1505 = var9 >> 16;
				var5.field1504 = (var9 & 0xFFFF) + field123;
				var5.field1502 = 0;
				var5.field1503 = 0;

				if (var5.field1504 > field123) {
					var5.field1502 = -1;
				}

				if (var5.field1501 == 0xFFFF) {
					var5.field1501 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg0.method289();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method261();
				if (var5.field1452 == var10 && var10 != -1) {
					int var12 = BZONLWPM.field53[var10].field67;
					if (var12 == 1) {
						var5.field1453 = 0;
						var5.field1454 = 0;
						var5.field1455 = var11;
						var5.field1456 = 0;
					}

					if (var12 == 2) {
						var5.field1456 = 0;
					}
				} else if (var10 == -1 || var5.field1452 == -1 || BZONLWPM.field53[var10].field61 >= BZONLWPM.field53[var5.field1452].field61) {
					var5.field1452 = var10;
					var5.field1453 = 0;
					var5.field1454 = 0;
					var5.field1455 = var11;
					var5.field1456 = 0;
					var5.field1451 = var5.field1459;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var13 = arg0.method261();
				int var14 = arg0.method261();
				var5.method593(field123, var14, var13);
				var5.field1466 = field123 + 300;
				var5.field1467 = arg0.method280();
				var5.field1468 = arg0.method261();
			}

			if ((var6 & 0x1) != 0) {
				var5.field1493 = arg0.method289();
				var5.field1494 = arg0.method288();
			}

			if ((var6 & 0x2) != 0) {
				var5.field69 = AUWOQLEO.method9(arg0.method287());
				var5.field1474 = var5.field69.field16;
				var5.field1473 = var5.field69.field8;
				var5.field1460 = var5.field69.field12;
				var5.field1461 = var5.field69.field14;
				var5.field1462 = var5.field69.field31;
				var5.field1463 = var5.field69.field20;
				var5.field1475 = var5.field69.field27;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg4 >= 1 && arg6 <= 102 && arg4 <= 102) {
			if (field108 && field323 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field178.method440(arg1, arg6, arg4);
			}

			if (arg3 == 1) {
				var8 = field178.method441(arg4, arg6, arg1);
			}

			if (arg3 == 2) {
				var8 = field178.method442(arg1, arg6, arg4);
			}

			if (arg3 == 3) {
				var8 = field178.method443(arg1, arg6, arg4);
			}

			if (var8 != 0) {
				int var12 = field178.method444(arg1, arg6, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field178.method431(arg1, arg4, arg6);
					HGKOLOPU var16 = HGKOLOPU.method326(var13);
					if (var16.field719) {
						field98[arg1].method17(var14, arg4, arg6, var16.field726, var15);
					}
				}

				if (arg3 == 1) {
					field178.method432(arg4, arg1, arg6);
				}

				if (arg3 == 2) {
					field178.method433(arg4, arg1, arg6);
					HGKOLOPU var17 = HGKOLOPU.method326(var13);
					if (var17.field715 + arg6 > 103 || var17.field715 + arg4 > 103 || var17.field697 + arg6 > 103 || var17.field697 + arg4 > 103) {
						return;
					}

					if (var17.field719) {
						field98[arg1].method18(var17.field697, var17.field726, arg6, var17.field715, arg4, var15);
					}
				}

				if (arg3 == 3) {
					field178.method434(arg4, arg6, arg1);
					HGKOLOPU var18 = HGKOLOPU.method326(var13);
					if (var18.field719 && var18.field705) {
						field98[arg1].method20(arg6, arg4);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field392[1][arg6][arg4] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				LVLPWFEX.method496(field178, field341, var19, arg0, arg5, field98[arg1], arg6, arg4, arg1, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILEGCCHUZS;I)V")
	public final void method71(EGCCHUZS arg0, int arg1) {
		arg0.method271();
		int var3 = arg0.method272(8);
		if (var3 < field422) {
			for (int var4 = var3; var4 < field422; var4++) {
				field459[field458++] = field423[var4];
			}
		}

		if (var3 > field422) {
			signlink.reporterror(field101 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field422 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field423[var5];
			CHUIKYUV var7 = field421[var6];
			int var8 = arg0.method272(1);
			if (var8 == 0) {
				field423[field422++] = var6;
				var7.field1500 = field123;
			} else {
				int var9 = arg0.method272(2);
				if (var9 == 0) {
					field423[field422++] = var6;
					var7.field1500 = field123;
					field232[field231++] = var6;
				} else if (var9 == 1) {
					field423[field422++] = var6;
					var7.field1500 = field123;
					int var10 = arg0.method272(3);
					var7.method594(false, var10);
					int var11 = arg0.method272(1);
					if (var11 == 1) {
						field232[field231++] = var6;
					}
				} else if (var9 == 2) {
					field423[field422++] = var6;
					var7.field1500 = field123;
					int var12 = arg0.method272(3);
					var7.method594(true, var12);
					int var13 = arg0.method272(3);
					var7.method594(true, var13);
					int var14 = arg0.method272(1);
					if (var14 == 1) {
						field232[field231++] = var6;
					}
				} else if (var9 == 3) {
					field459[field458++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method72(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.l(I)V")
	public final void method73() {
		if (field319 == null) {
			method173();
			field872 = null;
			field396 = null;
			field397 = null;
			field398 = null;
			field399 = null;
			field400 = null;
			field401 = null;
			field402 = null;
			field403 = null;
			field404 = null;
			field319 = new YJGBGRIO(method139(), 479, 96);
			field317 = new YJGBGRIO(method139(), 172, 156);
			JOVUNXBE.method383();
			field345.method183(0, 0);
			field316 = new YJGBGRIO(method139(), 190, 261);
			field318 = new YJGBGRIO(method139(), 512, 334);
			JOVUNXBE.method383();
			field205 = new YJGBGRIO(method139(), 496, 50);
			field206 = new YJGBGRIO(method139(), 269, 37);
			field207 = new YJGBGRIO(method139(), 249, 45);
			field149 = true;
			field318.method580();
			PNDPOZTD.field1159 = field499;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;Z)V")
	public final void method74(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field415 != -1) {
			field478 = arg2;
			field885 = 0;
		}

		if (field271 == -1) {
			field322 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field491[var4] = field491[var4 - 1];
			field492[var4] = field492[var4 - 1];
			field493[var4] = field493[var4 - 1];
		}

		field491[0] = arg1;
		field492[0] = arg0;
		field493[0] = arg2;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method75(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(ILEGCCHUZS;I)V")
	public final void method76(EGCCHUZS arg0, int arg1) {
		while (arg0.field590 + 21 < arg1 * 8) {
			int var3 = arg0.method272(14);
			if (var3 == 16383) {
				break;
			}

			if (field421[var3] == null) {
				field421[var3] = new CHUIKYUV();
			}

			CHUIKYUV var4 = field421[var3];
			field423[field422++] = var3;
			var4.field1500 = field123;
			int var5 = arg0.method272(1);
			var4.field69 = AUWOQLEO.method9(arg0.method272(12));
			int var6 = arg0.method272(1);
			if (var6 == 1) {
				field232[field231++] = var3;
			}

			int var7 = arg0.method272(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method272(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1474 = var4.field69.field16;
			var4.field1473 = var4.field69.field8;
			var4.field1460 = var4.field69.field12;
			var4.field1461 = var4.field69.field14;
			var4.field1462 = var4.field69.field31;
			var4.field1463 = var4.field69.field20;
			var4.field1475 = var4.field69.field27;
			var4.method591(var5 == 1, field223.field1465[0] + var8, field223.field1464[0] + var7);
		}

		arg0.method273();
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method77(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field237[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 342) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method78(boolean arg0) {
		if (field223.field1478 >> 7 == field503 && field223.field1479 >> 7 == field504) {
			field503 = 0;
		}

		int var2 = field229;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			QAJCAYDZ var4;
			int var5;
			if (arg0) {
				var4 = field223;
				var5 = field227 << 14;
			} else {
				var4 = field228[field230[var3]];
				var5 = field230[var3] << 14;
			}

			if (var4 != null && var4.method29()) {
				var4.field1257 = false;
				if ((field108 && field229 > 50 || field229 > 200) && !arg0 && var4.field1497 == var4.field1475) {
					var4.field1257 = true;
				}

				int var6 = var4.field1478 >> 7;
				int var7 = var4.field1479 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1251 == null || field123 < var4.field1244 || field123 >= var4.field1245) {
						if ((var4.field1478 & 0x7F) == 0x40 && (var4.field1479 & 0x7F) == 0x40) {
							if (field369[var6][var7] == field479) {
								continue;
							}

							field369[var6][var7] = field479;
						}

						var4.field1254 = method152(var4.field1478, var4.field1479, field323);
						field178.method425(60, var4.field1457, var4.field1479, var4, var4.field1254, var4.field1478, field323, var5, var4.field1480);
					} else {
						var4.field1257 = false;
						var4.field1254 = method152(var4.field1478, var4.field1479, field323);
						field178.method426(var4.field1239, 60, var5, var4, var4.field1479, field323, var4.field1478, var4.field1480, var4.field1254, var4.field1237, var4.field1236, var4.field1238);
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

	@ObfuscatedName("client.a(IILHOSNGCXH;B)V")
	public final void method79(int arg0, int arg1, HOSNGCXH arg2) {
		int var4 = field88 + field430 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = IGXVZOHI.field841[var4];
			int var7 = IGXVZOHI.field842[var4];
			var6 = var6 * 256 / (field134 + 256);
			var7 = var7 * 256 / (field134 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method341(var8 + 94 + 4 - arg2.field736 / 2, field345, 83 - var9 - arg2.field737 / 2 - 4);
			} else {
				arg2.method335(83 - var9 - arg2.field737 / 2 - 4, var8 + 94 - arg2.field736 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method80() {
		try {
			if (field352 != null) {
				field352.method543();
			}
		} catch (Exception var2) {
		}

		field352 = null;
		field470 = false;
		field202 = 0;
		field101 = "";
		field102 = "";
		method59();
		field178.method414();

		for (int var1 = 0; var1 < 4; var1++) {
			field98[var1].method12();
		}

		System.gc();
		method145();
		field305 = -1;
		field501 = -1;
		field448 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method81(String arg0, String arg1) {
		if (field318 != null) {
			field318.method580();
			PNDPOZTD.field1159 = field499;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field163.method526(0, var3, 257, arg0);
			field163.method526(0xFFFFFF, var3 - 1, 256, arg0);
			var3 += 15;
			if (arg1 != null) {
				field163.method526(0, var3, 257, arg1);
				field163.method526(0xFFFFFF, var3 - 1, 256, arg1);
			}

			field318.method581(4, 4, field871);
		} else if (field872 != null) {
			field872.method580();
			PNDPOZTD.field1159 = field500;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			JOVUNXBE.method385(var4 - var6 / 2 - 5, var5, var6, 383 - var5 / 2, 0);
			JOVUNXBE.method386(var5, var6, 0xFFFFFF, 383 - var5 / 2, var4 - 5 - var6 / 2);

			if (arg1 != null) {
				var4 -= 7;
			}

			field163.method526(0, var4, 383, arg0);
			field163.method526(0xFFFFFF, var4 - 1, 382, arg0);
			var4 += 15;
			if (arg1 != null) {
				field163.method526(0, var4, 383, arg1);
				field163.method526(0xFFFFFF, var4 - 1, 382, arg1);
			}

			field872.method581(0, 0, field871);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method82() {
		Graphics var1 = method139().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method411(1);

		if (field136) {
			field187 = false;
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

		if (field409) {
			field187 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field284) {
			field187 = false;
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

	@ObfuscatedName("client.e(Z)V")
	public final void method83() {
		if (field273 != 0) {
			RLQTDOAP var1 = field163;
			int var2 = 0;
			if (field507 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field493[var3] != null) {
					int var4 = field491[var3];
					String var5 = field492[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field325 == 0 || field325 == 1 && method91(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method530(var7, "From", var8, 0);
						var1.method530(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method528("From ");
						if (var6 == 1) {
							field99[0].method183(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field99[1].method183(var7 - 12, var11);
							var11 += 14;
						}

						var1.method530(var7, var5 + ": " + field493[var3], var11, 0);
						var1.method530(var7 - 1, var5 + ": " + field493[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field325 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method530(var9, field493[var3], 4, 0);
						var1.method530(var9 - 1, field493[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field325 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method530(var10, "To " + var5 + ": " + field493[var3], 4, 0);
						var1.method530(var10 - 1, "To " + var5 + ": " + field493[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LLORGYGVM;B)V")
	public final void method84(LORGYGVM arg0) {
		int var2 = arg0.field1021;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field191 == 0) {
				arg0.field1051 = "Loading friend list";
				arg0.field1027 = 0;
			} else if (var2 == 1 && field191 == 1) {
				arg0.field1051 = "Connecting to friendserver";
				arg0.field1027 = 0;
			} else if (var2 == 2 && field191 != 2) {
				arg0.field1051 = "Please wait...";
				arg0.field1027 = 0;
			} else {
				int var3 = field190;
				if (field191 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1051 = "";
					arg0.field1027 = 0;
				} else {
					arg0.field1051 = field510[var2];
					arg0.field1027 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field190;
			if (field191 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1051 = "";
				arg0.field1027 = 0;
			} else {
				if (field121[var2] == 0) {
					arg0.field1051 = "@red@Offline";
				} else if (field121[var2] < 200) {
					if (field121[var2] == field105) {
						arg0.field1051 = "@gre@World-" + (field121[var2] - 9);
					} else {
						arg0.field1051 = "@yel@World-" + (field121[var2] - 9);
					}
				} else if (field121[var2] == field105) {
					arg0.field1051 = "@gre@Classic" + (field121[var2] - 219);
				} else {
					arg0.field1051 = "@yel@Classic" + (field121[var2] - 219);
				}

				arg0.field1027 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field190;
			if (field191 != 2) {
				var5 = 0;
			}

			arg0.field1012 = var5 * 15 + 20;
			if (arg0.field1012 <= arg0.field1046) {
				arg0.field1012 = arg0.field1046 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field191 == 0) {
				arg0.field1051 = "Loading ignore list";
				arg0.field1027 = 0;
			} else if (var2 == 1 && field191 == 0) {
				arg0.field1051 = "Please wait...";
				arg0.field1027 = 0;
			} else {
				int var6 = field283;
				if (field191 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1051 = "";
					arg0.field1027 = 0;
				} else {
					arg0.field1051 = XXUUHLAE.method578(XXUUHLAE.method575(field370[var2]));
					arg0.field1027 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1012 = field283 * 15 + 20;
			if (arg0.field1012 <= arg0.field1046) {
				arg0.field1012 = arg0.field1046 + 1;
			}
		} else if (var2 == 327) {
			arg0.field999 = 150;
			arg0.field1000 = (int) (Math.sin(field123 / 40.0D) * 256.0D) & 0x7FF;

			if (field117) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field144[var7];
					if (var8 >= 0 && !ZWYXHQWS.field1507[var8].method597()) {
						return;
					}
				}

				field117 = false;
				IGXVZOHI[] var9 = new IGXVZOHI[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field144[var11];
					if (var12 >= 0) {
						var9[var10++] = ZWYXHQWS.field1507[var12].method598();
					}
				}

				IGXVZOHI var13 = new IGXVZOHI(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field377[var14] != 0) {
						var13.method368(field393[var14][0], field393[var14][field377[var14]]);

						if (var14 == 1) {
							var13.method368(field467[0], field467[field377[var14]]);
						}
					}
				}

				var13.method361();
				var13.method362(BZONLWPM.field53[field223.field1475].field55[0]);
				var13.method371(64, 850, -30, -50, -30, true);
				arg0.field985 = 5;
				arg0.field986 = 0;
				LORGYGVM.method476(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field488 == null) {
				field488 = arg0.field1035;
				field489 = arg0.field996;
			}

			if (field234) {
				arg0.field1035 = field489;
			} else {
				arg0.field1035 = field488;
			}
		} else if (var2 == 325) {
			if (field488 == null) {
				field488 = arg0.field1035;
				field489 = arg0.field996;
			}

			if (field234) {
				arg0.field1035 = field488;
			} else {
				arg0.field1035 = field489;
			}
		} else if (var2 == 600) {
			arg0.field1051 = field181;
			if (field123 % 20 < 10) {
				arg0.field1051 = arg0.field1051 + "|";
			} else {
				arg0.field1051 = arg0.field1051 + " ";
			}
		} else if (var2 == 620) {
			if (field266 < 1) {
				arg0.field1051 = "";
			} else if (field434) {
				arg0.field1037 = 0xFF0000;
				arg0.field1051 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1037 = 0xFFFFFF;
				arg0.field1051 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field112 - field174;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1051 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field118 == 0) {
				arg0.field1051 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field118 <= field112) {
				arg0.field1051 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method85(field118);
			} else {
				int var17 = field112 + 14 - field118;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1051 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method85(field118) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field367 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field367 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field367 + " unread messages";
			}

			arg0.field1051 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field260 > 0 && field260 <= field112 + 10) {
				arg0.field1051 = "Last password change:\\n@gre@" + method85(field260);
			} else {
				arg0.field1051 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field483 == 0) {
				arg0.field1051 = "You have not yet set\\nany contact details.";
			}

			if (field483 == 1) {
				arg0.field1051 = "Contact Details Last Set:\\n@gre@" + method85(field258);
			}

			if (field483 == 2) {
				arg0.field1051 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field171 > 2 && !field107) {
				arg0.field1051 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field171 > 2) {
				arg0.field1051 = "\\n\\nYou have @gre@" + field171 + "@yel@ days of\\nmember credit remaining.";
			} else if (field171 > 0) {
				arg0.field1051 = "You have @gre@" + field171 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1051 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field171 > 2 && !field107) {
				arg0.field1051 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field171 > 0) {
				arg0.field1051 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1051 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field118 > field112) {
				arg0.field1051 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1051 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public final String method85(int arg0) {
		if (arg0 > field112 + 10) {
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

	@ObfuscatedName("client.f(Z)Z")
	public final boolean method86() {
		if (field352 == null) {
			return false;
		}

		try {
			int var1 = field352.method545();
			if (var1 == 0) {
				return false;
			}

			if (field193 == -1) {
				field352.method546(field170.field588, 0, 1);
				field193 = field170.field588[0] & 0xFF;
				if (field242 != null) {
					field193 = field193 - field242.method522() & 0xFF;
				}

				field192 = GWHJRIZZ.field682[field193];
				var1--;
			}

			if (field192 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field352.method546(field170.field588, 0, 1);
				field192 = field170.field588[0] & 0xFF;
				var1--;
			}

			if (field192 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field352.method546(field170.field588, 0, 2);
				field170.field589 = 0;
				field192 = field170.method263();
				var1 -= 2;
			}

			if (var1 < field192) {
				return false;
			}

			field170.field589 = 0;
			field352.method546(field170.field588, 0, field192);
			field194 = 0;
			field157 = field156;
			field156 = field155;
			field155 = field193;

			if (field193 == 95) {
				field191 = field170.method261();
				field249 = true;
				field193 = -1;
				return true;
			}

			if (field193 == 21) {
				boolean var2 = field170.method279() == 1;
				int var3 = field170.method287();
				LORGYGVM.method477(var3).field1003 = var2;
				field193 = -1;
				return true;
			}

			if (field193 == 194) {
				int var4 = field170.method289();
				int var5 = field170.method287();
				LORGYGVM var6 = LORGYGVM.method477(var5);
				if (var6 != null && var6.field1009 == 0) {
					if (var4 < 0) {
						var4 = 0;
					}

					if (var4 > var6.field1012 - var6.field1046) {
						var4 = var6.field1012 - var6.field1046;
					}

					var6.field991 = var4;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 195) {
				int var7 = field170.method263();
				int var8 = field170.method261();
				int var9 = field170.method263();
				if (field166 && !field108 && field338 < 50) {
					field248[field338] = var7;
					field153[field338] = var8;
					field97[field338] = FPQKMBUX.field623[var7] + var9;
					field338++;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 40) {
				field246 = field170.method261();
				field193 = -1;
				return true;
			}

			if (field193 == 78) {
				int var10 = field170.method261();
				String var11 = field170.method268();
				int var12 = field170.method281();
				if (var10 >= 1 && var10 <= 5) {
					if (var11.equalsIgnoreCase("null")) {
						var11 = null;
					}

					field297[var10 - 1] = var11;
					field298[var10 - 1] = var12 == 0;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 50) {
				method80();
				field193 = -1;
				return false;
			}

			if (field193 == 60) {
				int var13 = field170.method291();
				int var14 = field170.method288();
				LORGYGVM var15 = LORGYGVM.method477(var14);
				if (var15.field1019 != var13 || var13 == -1) {
					var15.field1019 = var13;
					var15.field997 = 0;
					var15.field1048 = 0;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 234) {
				int var16 = field170.method289();
				int var17 = field170.method295();
				field328[var16] = var17;

				if (field95[var16] != var17) {
					field95[var16] = var17;
					method88(var16);
					field249 = true;

					if (field415 != -1) {
						field322 = true;
					}
				}

				field193 = -1;
				return true;
			}

			if (field193 == 146) {
				int var18 = field170.method289();
				int var19 = field170.method287();
				int var20 = field170.method288();
				int var21 = field170.method287();
				LORGYGVM.method477(var19).field999 = var18;
				LORGYGVM.method477(var19).field1000 = var21;
				LORGYGVM.method477(var19).field998 = var20;
				field193 = -1;
				return true;
			}

			if (field193 == 115) {
				int var22 = field170.method288();
				byte var23 = field170.method282();
				field328[var22] = var23;

				if (field95[var22] != var23) {
					field95[var22] = var23;
					method88(var22);
					field249 = true;

					if (field415 != -1) {
						field322 = true;
					}
				}

				field193 = -1;
				return true;
			}

			if (field193 == 32) {
				field503 = 0;
				field193 = -1;
				return true;
			}

			if (field193 == 149) {
				method39(field170, field192);
				field515 = false;
				field193 = -1;
				return true;
			}

			if (field193 == 215) {
				int var24 = field170.method290();
				int var25 = field170.method289();
				int var26 = field170.method292();
				LORGYGVM var27 = LORGYGVM.method477(var25);
				var27.field1047 = var26;
				var27.field1038 = var24;
				field193 = -1;
				return true;
			}

			if (field193 == 180) {
				field137 = field170.method261();
				if (field137 == field100) {
					if (field137 == 3) {
						field100 = 1;
					} else {
						field100 = 3;
					}

					field249 = true;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 57) {
				int var28 = field170.method287();
				method124(var28);

				if (field306 != -1) {
					method53(field306);
					field306 = -1;
					field249 = true;
					field158 = true;
				}

				if (field271 != -1) {
					method53(field271);
					field271 = -1;
					field322 = true;
				}

				if (field368 != -1) {
					method53(field368);
					field368 = -1;
					field149 = true;
				}

				if (field355 != -1) {
					method53(field355);
					field355 = -1;
				}

				if (field222 != var28) {
					method53(field222);
					field222 = var28;
				}

				if (field441 != 0) {
					field441 = 0;
					field322 = true;
				}

				field82 = false;
				field193 = -1;
				return true;
			}

			if (field193 == 27) {
				if (field306 != -1) {
					method53(field306);
					field306 = -1;
					field249 = true;
					field158 = true;
				}

				if (field271 != -1) {
					method53(field271);
					field271 = -1;
					field322 = true;
				}

				if (field368 != -1) {
					method53(field368);
					field368 = -1;
					field149 = true;
				}

				if (field355 != -1) {
					method53(field355);
					field355 = -1;
				}

				if (field222 != -1) {
					method53(field222);
					field222 = -1;
				}

				if (field441 != 0) {
					field441 = 0;
					field322 = true;
				}

				field82 = false;
				field193 = -1;
				return true;
			}

			if (field193 == 58) {
				field100 = field170.method280();
				field249 = true;
				field158 = true;
				field193 = -1;
				return true;
			}

			if (field193 == 212) {
				int var29 = field170.method288();
				String var30 = field170.method268();
				LORGYGVM.method477(var29).field1051 = var30;

				if (field334[field100] == LORGYGVM.method477(var29).field1015) {
					field249 = true;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 2) {
				int var31 = field170.method289();
				int var32 = field170.method289();
				method124(var32);

				if (var31 != -1) {
					method124(var31);
				}

				if (field222 != -1) {
					method53(field222);
					field222 = -1;
				}

				if (field306 != -1) {
					method53(field306);
					field306 = -1;
				}

				if (field271 != -1) {
					method53(field271);
					field271 = -1;
				}

				if (field368 != var32) {
					method53(field368);
					field368 = var32;
				}

				if (field355 != var32) {
					method53(field355);
					field355 = var31;
				}

				field441 = 0;
				field82 = false;
				field193 = -1;
				return true;
			}

			if (field193 == 33) {
				field376 = true;
				field451 = field170.method261();
				field452 = field170.method261();
				field453 = field170.method263();
				field454 = field170.method261();
				field455 = field170.method261();
				if (field455 >= 100) {
					int var33 = field451 * 128 + 64;
					int var34 = field452 * 128 + 64;
					int var35 = method152(var33, var34, field323) - field453;
					int var36 = var33 - field360;
					int var37 = var35 - field361;
					int var38 = var34 - field362;
					int var39 = (int) Math.sqrt(var36 * var36 + var38 * var38);
					field363 = (int) (Math.atan2(var37, var39) * 325.949D) & 0x7FF;
					field364 = (int) (Math.atan2(var36, var38) * -325.949D) & 0x7FF;

					if (field363 < 128) {
						field363 = 128;
					}

					if (field363 > 383) {
						field363 = 383;
					}
				}

				field193 = -1;
				return true;
			}

			if (field193 == 138) {
				field179 = field170.method279();
				field180 = field170.method281();

				while (field170.field589 < field192) {
					int var40 = field170.method261();
					method101(var40, field170);
				}

				field193 = -1;
				return true;
			}

			if (field193 == 44) {
				int var41 = field170.method291();
				if (var41 >= 0) {
					method124(var41);
				}

				if (field490 != var41) {
					method53(field490);
					field490 = var41;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 36) {
				field249 = true;
				int var42 = field170.method263();
				LORGYGVM var43 = LORGYGVM.method477(var42);
				int var44 = field170.method263();
				for (int var45 = 0; var45 < var44; var45++) {
					int var46 = field170.method261();
					if (var46 == 255) {
						var46 = field170.method296();
					}

					var43.field1007[var45] = field170.method263();
					var43.field1030[var45] = var46;
				}

				for (int var47 = var44; var47 < var43.field1007.length; var47++) {
					var43.field1007[var47] = 0;
					var43.field1030[var47] = 0;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 209) {
				long var48 = field170.method267();
				int var50 = field170.method261();
				String var51 = XXUUHLAE.method578(XXUUHLAE.method575(var48));
				for (int var52 = 0; var52 < field190; var52++) {
					if (field443[var52] == var48) {
						if (field121[var52] != var50) {
							field121[var52] = var50;
							field249 = true;

							if (var50 > 0) {
								method74("", 5, var51 + " has logged in.");
							}

							if (var50 == 0) {
								method74("", 5, var51 + " has logged out.");
							}
						}

						var51 = null;
						break;
					}
				}

				if (var51 != null && field190 < 200) {
					field443[field190] = var48;
					field510[field190] = var51;
					field121[field190] = var50;
					field190++;
					field249 = true;
				}

				boolean var53 = false;
				while (!var53) {
					var53 = true;
					for (int var54 = 0; var54 < field190 - 1; var54++) {
						if (field121[var54] != field105 && field121[var54 + 1] == field105 || field121[var54] == 0 && field121[var54 + 1] != 0) {
							int var55 = field121[var54];
							field121[var54] = field121[var54 + 1];
							field121[var54 + 1] = var55;
							String var56 = field510[var54];
							field510[var54] = field510[var54 + 1];
							field510[var54 + 1] = var56;
							long var57 = field443[var54];
							field443[var54] = field443[var54 + 1];
							field443[var54 + 1] = var57;
							field249 = true;
							var53 = false;
						}
					}
				}

				field193 = -1;
				return true;
			}

			if (field193 == 205) {
				field376 = false;

				for (int var59 = 0; var59 < 5; var59++) {
					field198[var59] = false;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 193) {
				if (field100 == 12) {
					field249 = true;
				}

				field119 = field170.method264();
				field193 = -1;
				return true;
			}

			if (field193 == 135) {
				int var60 = field170.method263();
				LORGYGVM var61 = LORGYGVM.method477(var60);
				for (int var62 = 0; var62 < var61.field1007.length; var62++) {
					var61.field1007[var62] = -1;
					var61.field1007[var62] = 0;
				}

				field193 = -1;
				return true;
			}

			if (field193 == 223) {
				int var63 = field170.method263();
				int var64 = field170.method287();
				int var65 = var64 >> 10 & 0x1F;
				int var66 = var64 >> 5 & 0x1F;
				int var67 = var64 & 0x1F;
				LORGYGVM.method477(var63).field1037 = (var67 << 3) + (var65 << 19) + (var66 << 11);
				field193 = -1;
				return true;
			}

			if (field193 == 225) {
				field180 = field170.method280();
				field179 = field170.method279();
				field193 = -1;
				return true;
			}

			if (field193 == 116) {
				int var68 = field170.method289();
				int var69 = field170.method287();
				LORGYGVM.method477(var68).field985 = 1;
				LORGYGVM.method477(var68).field986 = var69;
				field193 = -1;
				return true;
			}

			if (field193 == 185) {
				int var70 = field170.method263();
				method124(var70);

				if (field271 != -1) {
					method53(field271);
					field271 = -1;
					field322 = true;
				}

				if (field368 != -1) {
					method53(field368);
					field368 = -1;
					field149 = true;
				}

				if (field355 != -1) {
					method53(field355);
					field355 = -1;
				}

				if (field222 != -1) {
					method53(field222);
					field222 = -1;
				}

				if (field306 != var70) {
					method53(field306);
					field306 = var70;
				}

				if (field441 != 0) {
					field441 = 0;
					field322 = true;
				}

				field249 = true;
				field158 = true;
				field82 = false;
				field193 = -1;
				return true;
			}

			if (field193 != 86 && field193 != 199 && field193 != 3 && field193 != 147 && field193 != 188 && field193 != 237 && field193 != 69 && field193 != 99 && field193 != 246 && field193 != 52 && field193 != 198) {
				if (field193 == 68) {
					field249 = true;
					int var71 = field170.method279();
					int var72 = field170.method280();
					int var73 = field170.method297();
					field356[var72] = var73;
					field516[var72] = var71;
					field138[var72] = 1;
					for (int var74 = 0; var74 < 98; var74++) {
						if (var73 >= field160[var74]) {
							field138[var72] = var74 + 2;
						}
					}

					field193 = -1;
					return true;
				}

				if (field193 == 178) {
					field460 = false;
					field441 = 1;
					field337 = "";
					field322 = true;
					field193 = -1;
					return true;
				}

				if (field193 == 168) {
					field460 = false;
					field441 = 2;
					field337 = "";
					field322 = true;
					field193 = -1;
					return true;
				}

				if (field193 == 192) {
					int var75 = field170.method288();
					int var76 = field170.method289();
					LORGYGVM.method477(var76).field985 = 2;
					LORGYGVM.method477(var76).field986 = var75;
					field193 = -1;
					return true;
				}

				if (field193 == 0) {
					field376 = true;
					field83 = field170.method261();
					field84 = field170.method261();
					field85 = field170.method263();
					field86 = field170.method261();
					field87 = field170.method261();
					if (field87 >= 100) {
						field360 = field83 * 128 + 64;
						field362 = field84 * 128 + 64;
						field361 = method152(field360, field362, field323) - field85;
					}

					field193 = -1;
					return true;
				}

				if (field193 == 161) {
					String var77 = field170.method268();
					if (var77.endsWith(":tradereq:")) {
						String var78 = var77.substring(0, var77.indexOf(":"));
						long var79 = XXUUHLAE.method574(var78);
						boolean var81 = false;
						for (int var82 = 0; var82 < field283; var82++) {
							if (field370[var82] == var79) {
								var81 = true;
								break;
							}
						}

						if (!var81 && field450 == 0) {
							method74(var78, 4, "wishes to trade with you.");
						}
					} else if (var77.endsWith(":duelreq:")) {
						String var83 = var77.substring(0, var77.indexOf(":"));
						long var84 = XXUUHLAE.method574(var83);
						boolean var86 = false;
						for (int var87 = 0; var87 < field283; var87++) {
							if (field370[var87] == var84) {
								var86 = true;
								break;
							}
						}

						if (!var86 && field450 == 0) {
							method74(var83, 8, "wishes to duel with you.");
						}
					} else if (var77.endsWith(":chalreq:")) {
						String var88 = var77.substring(0, var77.indexOf(":"));
						long var89 = XXUUHLAE.method574(var88);
						boolean var91 = false;
						for (int var92 = 0; var92 < field283; var92++) {
							if (field370[var92] == var89) {
								var91 = true;
								break;
							}
						}

						if (!var91 && field450 == 0) {
							String var93 = var77.substring(var77.indexOf(":") + 1, var77.length() - 9);
							method74(var88, 8, var93);
						}
					} else {
						method74("", 0, var77);
					}

					field193 = -1;
					return true;
				}

				if (field193 == 76) {
					int var94 = field170.method287();
					if (var94 == 0xFFFF) {
						var94 = -1;
					}

					if (field305 != var94 && field444 && !field108 && field448 == 0) {
						field501 = var94;
						field502 = true;
						field224.method228(2, field501);
					}

					field305 = var94;
					field193 = -1;
					return true;
				}

				if (field193 == 71) {
					int var95 = field170.method293();
					int var96 = field170.method287();
					if (field444 && !field108) {
						field501 = var96;
						field502 = false;
						field224.method228(2, field501);
						field448 = var95;
					}

					field193 = -1;
					return true;
				}

				if (field193 == 238) {
					method117(field170, field192);
					field193 = -1;
					return true;
				}

				if (field193 == 94) {
					int var97 = field170.method287();
					int var98 = field170.method281();

					if (var97 == 0xFFFF) {
						var97 = -1;
					}

					if (field334[var98] != var97) {
						method53(field334[var98]);
						field334[var98] = var97;
					}

					field249 = true;
					field158 = true;
					field193 = -1;
					return true;
				}

				if (field193 == 20) {
					field249 = true;
					int var99 = field170.method263();
					LORGYGVM var100 = LORGYGVM.method477(var99);
					while (field170.field589 < field192) {
						int var101 = field170.method275();
						int var102 = field170.method263();
						int var103 = field170.method261();
						if (var103 == 255) {
							var103 = field170.method266();
						}

						if (var101 >= 0 && var101 < var100.field1007.length) {
							var100.field1007[var101] = var102;
							var100.field1030[var101] = var103;
						}
					}

					field193 = -1;
					return true;
				}

				if (field193 == 171) {
					if (field100 == 12) {
						field249 = true;
					}

					field384 = field170.method261();
					field193 = -1;
					return true;
				}

				if (field193 != 196) {
					if (field193 == 141) {
						int var104 = field170.method292();
						if (field415 != var104) {
							method53(field415);
							field415 = var104;
						}

						field322 = true;
						field193 = -1;
						return true;
					}

					if (field193 == 43) {
						field180 = field170.method261();
						field179 = field170.method280();
						for (int var105 = field179; var105 < field179 + 8; var105++) {
							for (int var106 = field180; var106 < field180 + 8; var106++) {
								if (field468[field323][var105][var106] != null) {
									field468[field323][var105][var106] = null;
									method33(var105, var106);
								}
							}
						}

						for (SZJROHQV var107 = (SZJROHQV) field320.method395(); var107 != null; var107 = (SZJROHQV) field320.method397()) {
							if (var107.field1287 >= field179 && var107.field1287 < field179 + 8 && var107.field1288 >= field180 && var107.field1288 < field180 + 8 && field323 == var107.field1285) {
								var107.field1289 = 0;
							}
						}

						field193 = -1;
						return true;
					}

					if (field193 == 11) {
						field437 = field170.method279();
						field340 = field170.method263();
						field193 = -1;
						return true;
					}

					if (field193 == 83) {
						int var108 = field170.method288();
						method124(var108);

						if (field306 != -1) {
							method53(field306);
							field306 = -1;
							field249 = true;
							field158 = true;
						}

						if (field368 != -1) {
							method53(field368);
							field368 = -1;
							field149 = true;
						}

						if (field355 != -1) {
							method53(field355);
							field355 = -1;
						}

						if (field222 != -1) {
							method53(field222);
							field222 = -1;
						}

						if (field271 != var108) {
							method53(field271);
							field271 = var108;
						}

						field82 = false;
						field322 = true;
						field193 = -1;
						return true;
					}

					if (field193 == 131) {
						field260 = field170.method288();
						field367 = field170.method263();
						field170.method263();
						field170.method287();
						field112 = field170.method289();
						field174 = field170.method288();
						field118 = field170.method288();
						field449 = field170.method297();
						field258 = field170.method287();
						field171 = field170.method263();
						field483 = field170.method281();
						signlink.dnslookup(XXUUHLAE.method577(field449));
						field193 = -1;
						return true;
					}

					if (field193 == 175 || field193 == 137) {
						int var109 = field512;
						int var110 = field513;
						if (field193 == 175) {
							var109 = field170.method288();
							var110 = field170.method287();
							field161 = false;
						}

						if (field193 == 137) {
							var110 = field170.method288();
							var109 = field170.method289();
							field170.method271();

							for (int var111 = 0; var111 < 4; var111++) {
								for (int var112 = 0; var112 < 13; var112++) {
									for (int var113 = 0; var113 < 13; var113++) {
										int var114 = field170.method272(1);
										if (var114 == 1) {
											field511[var111][var112][var113] = field170.method272(26);
										} else {
											field511[var111][var112][var113] = -1;
										}
									}
								}
							}

							field170.method273();
							field161 = true;
						}

						if (field512 == var109 && field513 == var110 && field152 == 2) {
							field193 = -1;
							return true;
						}

						field512 = var109;
						field513 = var110;
						field463 = (field512 - 6) * 8;
						field464 = (field513 - 6) * 8;
						field177 = false;
						if ((field512 / 8 == 48 || field512 / 8 == 49) && field513 / 8 == 48) {
							field177 = true;
						}

						if (field512 / 8 == 48 && field513 / 8 == 148) {
							field177 = true;
						}

						field152 = 1;
						field116 = System.currentTimeMillis();
						method81("Loading - please wait.", null);

						if (field193 == 175) {
							int var115 = 0;
							for (int var116 = (field512 - 6) / 8; var116 <= (field512 + 6) / 8; var116++) {
								for (int var117 = (field513 - 6) / 8; var117 <= (field513 + 6) / 8; var117++) {
									var115++;
								}
							}

							field321 = new byte[var115][];
							field282 = new byte[var115][];
							field308 = new int[var115];
							field309 = new int[var115];
							field310 = new int[var115];
							int var118 = 0;
							for (int var119 = (field512 - 6) / 8; var119 <= (field512 + 6) / 8; var119++) {
								for (int var120 = (field513 - 6) / 8; var120 <= (field513 + 6) / 8; var120++) {
									field308[var118] = (var119 << 8) + var120;

									if (field177 && (var120 == 49 || var120 == 149 || var120 == 147 || var119 == 50 || var119 == 49 && var120 == 47)) {
										field309[var118] = -1;
										field310[var118] = -1;
										var118++;
									} else {
										int var121 = field309[var118] = field224.method227(0, var120, var119);
										if (var121 != -1) {
											field224.method228(3, var121);
										}

										int var122 = field310[var118] = field224.method227(1, var120, var119);
										if (var122 != -1) {
											field224.method228(3, var122);
										}

										var118++;
									}
								}
							}
						}

						if (field193 == 137) {
							int var123 = 0;
							int[] var124 = new int[676];
							for (int var125 = 0; var125 < 4; var125++) {
								for (int var126 = 0; var126 < 13; var126++) {
									for (int var127 = 0; var127 < 13; var127++) {
										int var128 = field511[var125][var126][var127];
										if (var128 != -1) {
											int var129 = var128 >> 14 & 0x3FF;
											int var130 = var128 >> 3 & 0x7FF;
											int var131 = (var129 / 8 << 8) + var130 / 8;
											for (int var132 = 0; var132 < var123; var132++) {
												if (var124[var132] == var131) {
													var131 = -1;
													break;
												}
											}

											if (var131 != -1) {
												var124[var123++] = var131;
											}
										}
									}
								}
							}

							field321 = new byte[var123][];
							field282 = new byte[var123][];
							field308 = new int[var123];
							field309 = new int[var123];
							field310 = new int[var123];
							for (int var133 = 0; var133 < var123; var133++) {
								int var134 = field308[var133] = var124[var133];
								int var135 = var134 >> 8 & 0xFF;
								int var136 = var134 & 0xFF;
								int var137 = field309[var133] = field224.method227(0, var136, var135);
								if (var137 != -1) {
									field224.method228(3, var137);
								}

								int var138 = field310[var133] = field224.method227(1, var136, var135);
								if (var138 != -1) {
									field224.method228(3, var138);
								}
							}
						}

						int var139 = field463 - field465;
						int var140 = field464 - field466;
						field465 = field463;
						field466 = field464;

						for (int var141 = 0; var141 < 16384; var141++) {
							CHUIKYUV var142 = field421[var141];
							if (var142 != null) {
								for (int var143 = 0; var143 < 10; var143++) {
									var142.field1464[var143] -= var139;
									var142.field1465[var143] -= var140;
								}

								var142.field1478 -= var139 * 128;
								var142.field1479 -= var140 * 128;
							}
						}

						for (int var144 = 0; var144 < field226; var144++) {
							QAJCAYDZ var145 = field228[var144];
							if (var145 != null) {
								for (int var146 = 0; var146 < 10; var146++) {
									var145.field1464[var146] -= var139;
									var145.field1465[var146] -= var140;
								}

								var145.field1478 -= var139 * 128;
								var145.field1479 -= var140 * 128;
							}
						}

						field515 = true;
						byte var147 = 0;
						byte var148 = 104;
						byte var149 = 1;
						if (var139 < 0) {
							var147 = 103;
							var148 = -1;
							var149 = -1;
						}

						byte var150 = 0;
						byte var151 = 104;
						byte var152 = 1;
						if (var140 < 0) {
							var150 = 103;
							var151 = -1;
							var152 = -1;
						}

						for (int var153 = var147; var153 != var148; var153 += var149) {
							for (int var154 = var150; var154 != var151; var154 += var152) {
								int var155 = var139 + var153;
								int var156 = var140 + var154;
								for (int var157 = 0; var157 < 4; var157++) {
									if (var155 >= 0 && var156 >= 0 && var155 < 104 && var156 < 104) {
										field468[var157][var153][var154] = field468[var157][var155][var156];
									} else {
										field468[var157][var153][var154] = null;
									}
								}
							}
						}

						for (SZJROHQV var158 = (SZJROHQV) field320.method395(); var158 != null; var158 = (SZJROHQV) field320.method397()) {
							var158.field1287 -= var139;
							var158.field1288 -= var140;
							if (var158.field1287 < 0 || var158.field1288 < 0 || var158.field1287 >= 104 || var158.field1288 >= 104) {
								var158.method379();
							}
						}

						if (field503 != 0) {
							field503 -= var139;
							field504 -= var140;
						}

						field376 = false;
						field193 = -1;
						return true;
					}

					if (field193 == 150) {
						int var159 = field170.method288();
						int var160 = field170.method287();
						int var161 = field170.method287();
						if (var161 == 0xFFFF) {
							LORGYGVM.method477(var160).field985 = 0;
							field193 = -1;
							return true;
						}

						WMJBOJYO var162 = WMJBOJYO.method560(var161);
						LORGYGVM.method477(var160).field985 = 4;
						LORGYGVM.method477(var160).field986 = var161;
						LORGYGVM.method477(var160).field999 = var162.field1432;
						LORGYGVM.method477(var160).field1000 = var162.field1417;
						LORGYGVM.method477(var160).field998 = var162.field1390 * 100 / var159;
						field193 = -1;
						return true;
					}

					if (field193 == 73) {
						int var163 = field170.method288();
						LORGYGVM.method477(var163).field985 = 3;

						if (field223.field1258 == null) {
							LORGYGVM.method477(var163).field986 = (field223.field1252[11] << 5) + (field223.field1252[8] << 10) + (field223.field1252[0] << 15) + (field223.field1256[0] << 25) + (field223.field1256[4] << 20) + field223.field1252[1];
						} else {
							LORGYGVM.method477(var163).field986 = (int) (field223.field1258.field41 + 0x12345678L);
						}

						field193 = -1;
						return true;
					}

					if (field193 == 224) {
						field350 = field170.method261();
						field193 = -1;
						return true;
					}

					if (field193 == 172) {
						field283 = field192 / 8;
						for (int var164 = 0; var164 < field283; var164++) {
							field370[var164] = field170.method267();
						}

						field193 = -1;
						return true;
					}

					if (field193 == 128) {
						int var165 = field170.method289();
						int var166 = field170.method289();
						int var167 = field170.method263();
						LORGYGVM.method477(var165).field1006 = (var167 << 16) + var166;
						field193 = -1;
						return true;
					}

					if (field193 == 241) {
						for (int var168 = 0; var168 < field95.length; var168++) {
							if (field95[var168] != field328[var168]) {
								field95[var168] = field328[var168];
								method88(var168);
								field249 = true;
							}
						}

						field193 = -1;
						return true;
					}

					if (field193 == 220) {
						field440 = field170.method261();
						field325 = field170.method261();
						field339 = field170.method261();
						field495 = true;
						field322 = true;
						field193 = -1;
						return true;
					}

					if (field193 == 19) {
						for (int var169 = 0; var169 < field228.length; var169++) {
							if (field228[var169] != null) {
								field228[var169].field1452 = -1;
							}
						}

						for (int var170 = 0; var170 < field421.length; var170++) {
							if (field421[var170] != null) {
								field421[var170].field1452 = -1;
							}
						}

						field193 = -1;
						return true;
					}

					if (field193 == 117) {
						field507 = field170.method289() * 30;
						field193 = -1;
						return true;
					}

					if (field193 == 93) {
						long var171 = field170.method267();
						int var173 = field170.method266();
						int var174 = field170.method261();
						boolean var175 = false;
						for (int var176 = 0; var176 < 100; var176++) {
							if (field289[var176] == var173) {
								var175 = true;
								break;
							}
						}

						if (var174 <= 1) {
							for (int var177 = 0; var177 < field283; var177++) {
								if (field370[var177] == var171) {
									var175 = true;
									break;
								}
							}
						}

						if (!var175 && field450 == 0) {
							try {
								field289[field353] = var173;
								field353 = (field353 + 1) % 100;
								String var178 = YUIPFPJK.method588(field192 - 13, field170);
								if (var174 != 3) {
									var178 = DHIKSAEW.method195(var178);
								}

								if (var174 == 2 || var174 == 3) {
									method74("@cr2@" + XXUUHLAE.method578(XXUUHLAE.method575(var171)), 7, var178);
								} else if (var174 == 1) {
									method74("@cr1@" + XXUUHLAE.method578(XXUUHLAE.method575(var171)), 7, var178);
								} else {
									method74(XXUUHLAE.method578(XXUUHLAE.method575(var171)), 3, var178);
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field193 = -1;
						return true;
					}

					if (field193 == 91) {
						int var180 = field170.method287();
						int var181 = field170.method288();

						if (field271 != -1) {
							method53(field271);
							field271 = -1;
							field322 = true;
						}

						if (field368 != -1) {
							method53(field368);
							field368 = -1;
							field149 = true;
						}

						if (field355 != -1) {
							method53(field355);
							field355 = -1;
						}

						if (field222 != var180) {
							method53(field222);
							field222 = var180;
						}

						if (field306 != var181) {
							method53(field306);
							field306 = var181;
						}

						if (field441 != 0) {
							field441 = 0;
							field322 = true;
						}

						field249 = true;
						field158 = true;
						field82 = false;
						field193 = -1;
						return true;
					}

					if (field193 == 228) {
						int var182 = field170.method261();
						int var183 = field170.method261();
						int var184 = field170.method261();
						int var185 = field170.method261();
						field198[var182] = true;
						field299[var182] = var183;
						field251[var182] = var184;
						field496[var182] = var185;
						field276[var182] = 0;
						field193 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field193 + "," + field192 + " - " + field156 + "," + field157);
					method80();
					return true;
				}

				field261 = field170.method261();
				if (field261 == 1) {
					field274 = field170.method263();
				}

				if (field261 >= 2 && field261 <= 6) {
					if (field261 == 2) {
						field295 = 64;
						field296 = 64;
					}

					if (field261 == 3) {
						field295 = 0;
						field296 = 64;
					}

					if (field261 == 4) {
						field295 = 128;
						field296 = 64;
					}

					if (field261 == 5) {
						field295 = 64;
						field296 = 0;
					}

					if (field261 == 6) {
						field295 = 64;
						field296 = 128;
					}

					field261 = 2;
					field292 = field170.method263();
					field293 = field170.method263();
					field294 = field170.method261();
				}

				if (field261 == 10) {
					field203 = field170.method263();
				}

				field193 = -1;
				return true;
			}

			method101(field193, field170);
			field193 = -1;
			return true;
		} catch (IOException var190) {
			method94();
		} catch (Exception var191) {
			String var187 = "T2 - " + field193 + "," + field156 + "," + field157 + " - " + field192 + "," + (field223.field1464[0] + field463) + "," + (field223.field1465[0] + field464) + " - ";
			for (int var188 = 0; var188 < field192 && var188 < 50; var188++) {
				var187 = var187 + field170.field588[var188] + ",";
			}

			signlink.reporterror(var187);
			method80();
		}

		return true;
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method87(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field283; var3++) {
				if (field370[var3] == arg0) {
					field283--;
					field249 = true;

					for (int var4 = var3; var4 < field283; var4++) {
						field370[var4] = field370[var4 + 1];
					}

					field474.method250(61);
					field474.method257(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method88(int arg0) {
		int var2 = GBMZYMFW.field653[arg0].field661;
		if (var2 != 0) {
			int var3 = field95[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					PNDPOZTD.method511(0.9D);
				}

				if (var3 == 2) {
					PNDPOZTD.method511(0.8D);
				}

				if (var3 == 3) {
					PNDPOZTD.method511(0.7D);
				}

				if (var3 == 4) {
					PNDPOZTD.method511(0.6D);
				}

				WMJBOJYO.field1397.method3();
				field149 = true;
			}

			if (var2 == 3) {
				boolean var4 = field444;

				if (var3 == 0) {
					method75(field444, 0);
					field444 = true;
				}

				if (var3 == 1) {
					method75(field444, -400);
					field444 = true;
				}

				if (var3 == 2) {
					method75(field444, -800);
					field444 = true;
				}

				if (var3 == 3) {
					method75(field444, -1200);
					field444 = true;
				}

				if (var3 == 4) {
					field444 = false;
				}

				if (field444 != var4 && !field108) {
					if (field444) {
						field501 = field305;
						field502 = true;
						field224.method228(2, field501);
					} else {
						method145();
					}

					field448 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field166 = true;
					method68(0);
				}

				if (var3 == 1) {
					field166 = true;
					method68(-400);
				}

				if (var3 == 2) {
					field166 = true;
					method68(-800);
				}

				if (var3 == 3) {
					field166 = true;
					method68(-1200);
				}

				if (var3 == 4) {
					field166 = false;
				}
			}

			if (var2 == 5) {
				field209 = var3;
			}

			if (var2 == 6) {
				field147 = var3;
			}

			if (var2 == 8) {
				field273 = var3;
				field322 = true;
			}

			if (var2 == 9) {
				field110 = var3;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method89() {
		for (int var1 = -1; var1 < field229; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field227;
			} else {
				var2 = field230[var1];
			}

			QAJCAYDZ var3 = field228[var2];
			if (var3 != null && var3.field1471 > 0) {
				var3.field1471--;
				if (var3.field1471 == 0) {
					var3.field1469 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field422; var4++) {
			int var5 = field423[var4];
			CHUIKYUV var6 = field421[var5];
			if (var6 != null && var6.field1471 > 0) {
				var6.field1471--;
				if (var6.field1471 == 0) {
					var6.field1469 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method90() {
		if (field273 != 0) {
			int var1 = 0;
			if (field507 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field493[var2] != null) {
					int var3 = field491[var2];
					String var4 = field492[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field325 == 0 || field325 == 1 && method91(var4))) {
						int var8 = 329 - var1 * 13;
						if (field879 > 4 && field880 - 4 > var8 - 10 && field880 - 4 <= var8 + 3) {
							int var9 = field163.method528("From:  " + var4 + field493[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field879 < var9 + 4) {
								if (field266 >= 1) {
									field348[field487] = "Report abuse @whi@" + var4;
									field237[field487] = 2440;
									field487++;
								}

								field348[field487] = "Add ignore @whi@" + var4;
								field237[field487] = 2539;
								field487++;
								field348[field487] = "Add friend @whi@" + var4;
								field237[field487] = 2342;
								field487++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field325 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method91(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field190; var2++) {
			if (arg0.equalsIgnoreCase(field510[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field223.field1255)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method92(String arg0, int arg1) {
		field111 = arg1;
		field159 = arg0;
		method98();

		if (field208 == null) {
			super.method92(arg0, arg1);
		} else {
			field398.method580();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field164.method526(0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			JOVUNXBE.method386(304, 34, 0x8C1111, var3 / 2 - 152, var6);
			JOVUNXBE.method386(302, 32, 0, var3 / 2 - 151, var6 + 1);
			JOVUNXBE.method385(var6 + 2, arg1 * 3, 30, var3 / 2 - 150, 0x8C1111);
			JOVUNXBE.method385(var6 + 2, 300 - arg1 * 3, 30, arg1 * 3 + var3 / 2 - 150, 0);
			field164.method526(0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2, arg0);
			field398.method581(202, 171, field871);

			if (field149) {
				field149 = false;

				if (!field187) {
					field399.method581(0, 0, field871);
					field400.method581(637, 0, field871);
				}

				field396.method581(128, 0, field871);
				field397.method581(202, 371, field871);
				field401.method581(0, 265, field871);
				field402.method581(562, 265, field871);
				field403.method581(128, 171, field871);
				field404.method581(562, 171, field871);
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method93(boolean arg0) {
		method98();
		field398.method580();
		field508.method183(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field202 == 0) {
			int var4 = var3 / 2 + 80;
			field162.method527(var4, 0x75A9A9, var2 / 2, true, field224.field558);
			int var5 = var3 / 2 - 20;
			field164.method527(var5, 0xFFFF00, var2 / 2, true, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field509.method183(var7 - 20, var6 - 73);
			field164.method527(var7 + 5, 0xFFFFFF, var6, true, "New User");
			int var8 = var2 / 2 + 80;
			field509.method183(var7 - 20, var8 - 73);
			field164.method527(var7 + 5, 0xFFFFFF, var8, true, "Existing User");
		}

		if (field202 == 2) {
			int var9 = var3 / 2 - 40;
			if (field103.length() > 0) {
				field164.method527(var9 - 15, 0xFFFF00, var2 / 2, true, field103);
				field164.method527(var9, 0xFFFF00, var2 / 2, true, field104);
				var9 += 30;
			} else {
				field164.method527(var9 - 7, 0xFFFF00, var2 / 2, true, field104);
				var9 += 30;
			}

			field164.method534("Username: " + field101 + (field114 == 0 & field123 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, var2 / 2 - 90, true);
			var9 += 15;
			field164.method534("Password: " + XXUUHLAE.method579(field102) + (field114 == 1 & field123 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, var2 / 2 - 88, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field509.method183(var11 - 20, var10 - 73);
				field164.method527(var11 + 5, 0xFFFFFF, var10, true, "Login");
				int var12 = var2 / 2 + 80;
				field509.method183(var11 - 20, var12 - 73);
				field164.method527(var11 + 5, 0xFFFFFF, var12, true, "Cancel");
			}
		}

		if (field202 == 3) {
			field164.method527(var3 / 2 - 60, 0xFFFF00, var2 / 2, true, "Create a free account");
			int var13 = var3 / 2 - 35;
			field164.method527(var13, 0xFFFFFF, var2 / 2, true, "To create a new account you need to");
			var13 += 15;
			field164.method527(var13, 0xFFFFFF, var2 / 2, true, "go back to the main RuneScape webpage");
			var13 += 15;
			field164.method527(var13, 0xFFFFFF, var2 / 2, true, "and choose the 'create account'");
			var13 += 15;
			field164.method527(var13, 0xFFFFFF, var2 / 2, true, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field509.method183(var15 - 20, var14 - 73);
			field164.method527(var15 + 5, 0xFFFFFF, var14, true, "Cancel");
		}

		field398.method581(202, 171, field871);

		if (field149) {
			field149 = false;
			field396.method581(128, 0, field871);
			field397.method581(202, 371, field871);
			field401.method581(0, 265, field871);
			field402.method581(562, 265, field871);
			field403.method581(128, 171, field871);
			field404.method581(562, 171, field871);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method94() {
		if (field196 > 0) {
			method80();
		} else {
			method81("Connection lost", "Please wait - attempting to reestablish");
			field350 = 0;
			field503 = 0;
			UFCPVKNJ var1 = field352;
			field470 = false;
			field347 = 0;
			method158(field101, field102, true);

			if (!field470) {
				method80();
			}

			try {
				var1.method543();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(LEGCCHUZS;ILQAJCAYDZ;II)V")
	public final void method95(EGCCHUZS arg0, QAJCAYDZ arg1, int arg2, int arg3) {
		if ((arg3 & 0x400) != 0) {
			int var5 = arg0.method280();
			int var6 = arg0.method261();
			arg1.method593(field123, var6, var5);
			arg1.field1466 = field123 + 300;
			arg1.field1467 = arg0.method279();
			arg1.field1468 = arg0.method281();
		}

		if ((arg3 & 0x10) != 0) {
			int var7 = arg0.method279();
			byte[] var8 = new byte[var7];
			EGCCHUZS var9 = new EGCCHUZS(var8);
			arg0.method298(var8, var7, 0);
			field233[arg2] = var9;
			arg1.method521(var9);
		}

		if ((arg3 & 0x2) != 0) {
			arg1.field1493 = arg0.method288();
			arg1.field1494 = arg0.method287();
		}

		if ((arg3 & 0x4) != 0) {
			int var10 = arg0.method279();
			int var11 = arg0.method261();
			arg1.method593(field123, var11, var10);
			arg1.field1466 = field123 + 300;
			arg1.field1467 = arg0.method281();
			arg1.field1468 = arg0.method281();
		}

		if ((arg3 & 0x1) != 0) {
			int var12 = arg0.method263();
			int var13 = arg0.method281();
			int var14 = arg0.method281();
			int var15 = arg0.field589;

			if (arg1.field1255 != null && arg1.field1246) {
				long var16 = XXUUHLAE.method574(arg1.field1255);
				boolean var18 = false;
				if (var13 <= 1) {
					for (int var19 = 0; var19 < field283; var19++) {
						if (field370[var19] == var16) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field450 == 0) {
					try {
						field420.field589 = 0;
						arg0.method270(var14, 0, field420.field588);
						field420.field589 = 0;
						String var20 = YUIPFPJK.method588(var14, field420);
						var20 = DHIKSAEW.method195(var20);
						arg1.field1469 = var20;
						arg1.field1495 = var12 >> 8;
						arg1.field1496 = var12 & 0xFF;
						arg1.field1471 = 150;

						if (var13 == 2 || var13 == 3) {
							method74("@cr2@" + arg1.field1255, 1, var20);
						} else if (var13 == 1) {
							method74("@cr1@" + arg1.field1255, 1, var20);
						} else {
							method74(arg1.field1255, 2, var20);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field589 = var14 + var15;
		}

		if ((arg3 & 0x40) != 0) {
			arg1.field1469 = arg0.method268();
			if (arg1.field1469.charAt(0) == '~') {
				arg1.field1469 = arg1.field1469.substring(1);
				method74(arg1.field1255, 2, arg1.field1469);
			} else if (field223 == arg1) {
				method74(arg1.field1255, 2, arg1.field1469);
			}

			arg1.field1495 = 0;
			arg1.field1496 = 0;
			arg1.field1471 = 150;
		}

		if ((arg3 & 0x200) != 0) {
			arg1.field1481 = arg0.method281();
			arg1.field1483 = arg0.method281();
			arg1.field1482 = arg0.method261();
			arg1.field1484 = arg0.method279();
			arg1.field1485 = arg0.method288() + field123;
			arg1.field1486 = arg0.method288() + field123;
			arg1.field1487 = arg0.method281();
			arg1.method592();
		}

		if ((arg3 & 0x80) != 0) {
			int var22 = arg0.method263();
			if (var22 == 0xFFFF) {
				var22 = -1;
			}

			int var23 = arg0.method261();
			if (arg1.field1452 == var22 && var22 != -1) {
				int var24 = BZONLWPM.field53[var22].field67;
				if (var24 == 1) {
					arg1.field1453 = 0;
					arg1.field1454 = 0;
					arg1.field1455 = var23;
					arg1.field1456 = 0;
				}

				if (var24 == 2) {
					arg1.field1456 = 0;
				}
			} else if (var22 == -1 || arg1.field1452 == -1 || BZONLWPM.field53[var22].field61 >= BZONLWPM.field53[arg1.field1452].field61) {
				arg1.field1452 = var22;
				arg1.field1453 = 0;
				arg1.field1454 = 0;
				arg1.field1455 = var23;
				arg1.field1456 = 0;
				arg1.field1451 = arg1.field1459;
			}
		}

		if ((arg3 & 0x100) != 0) {
			arg1.field1501 = arg0.method287();
			int var25 = arg0.method295();
			arg1.field1505 = var25 >> 16;
			arg1.field1504 = (var25 & 0xFFFF) + field123;
			arg1.field1502 = 0;
			arg1.field1503 = 0;

			if (arg1.field1504 > field123) {
				arg1.field1502 = -1;
			}

			if (arg1.field1501 == 0xFFFF) {
				arg1.field1501 = -1;
			}
		}

		if ((arg3 & 0x8) != 0) {
			arg1.field1491 = arg0.method287();
			if (arg1.field1491 == 0xFFFF) {
				arg1.field1491 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method96(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field178.method444(field323, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			HGKOLOPU var8 = HGKOLOPU.method326(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field715;
				var10 = var8.field697;
			} else {
				var9 = var8.field697;
				var10 = var8.field715;
			}

			int var11 = var8.field706;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method140(false, 0, var10, arg0, arg1, var9, var11, field223.field1464[0], 2, field223.field1465[0], 0);
		} else {
			method140(false, var7, 0, arg0, arg1, 0, 0, field223.field1464[0], 2, field223.field1465[0], var6 + 1);
		}

		field278 = field886;
		field279 = field887;
		field281 = 2;
		field280 = 0;
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method97(String arg0) {
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

	@ObfuscatedName("client.h(Z)V")
	public final void method98() {
		if (field396 == null) {
			field872 = null;
			field319 = null;
			field317 = null;
			field316 = null;
			field318 = null;
			field205 = null;
			field206 = null;
			field207 = null;
			field399 = new YJGBGRIO(method139(), 128, 265);
			JOVUNXBE.method383();
			field400 = new YJGBGRIO(method139(), 128, 265);
			JOVUNXBE.method383();
			field396 = new YJGBGRIO(method139(), 509, 171);
			JOVUNXBE.method383();
			field397 = new YJGBGRIO(method139(), 360, 132);
			JOVUNXBE.method383();
			field398 = new YJGBGRIO(method139(), 360, 200);
			JOVUNXBE.method383();
			field401 = new YJGBGRIO(method139(), 202, 238);
			JOVUNXBE.method383();
			field402 = new YJGBGRIO(method139(), 203, 238);
			JOVUNXBE.method383();
			field403 = new YJGBGRIO(method139(), 74, 94);
			JOVUNXBE.method383();
			field404 = new YJGBGRIO(method139(), 75, 94);
			JOVUNXBE.method383();

			if (field208 != null) {
				method155();
				method121();
			}

			field149 = true;
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method99(String arg0) throws IOException {
		if (field394) {
			if (field201 != null) {
				try {
					field201.close();
				} catch (Exception var4) {
				}

				field201 = null;
			}

			field201 = method47(43595);
			field201.setSoTimeout(10000);
			InputStream var2 = field201.getInputStream();
			OutputStream var3 = field201.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method100() {
		if (field350 == 0 && field885 == 1) {
			int var1 = field886 - 25 - 550;
			int var2 = field887 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field88 + field430 & 0x7FF;
				int var4 = PNDPOZTD.field1157[var3];
				int var5 = PNDPOZTD.field1158[var3];
				var4 = (field134 + 256) * var4 >> 8;
				var5 = (field134 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field223.field1478 + var6 >> 7;
				int var9 = field223.field1479 - var7 >> 7;
				boolean var10 = method140(true, 0, 0, var8, var9, 0, 0, field223.field1464[0], 1, field223.field1465[0], 0);
				if (var10) {
					field474.method251(var1);
					field474.method251(var2);
					field474.method252(field430);
					field474.method251(57);
					field474.method251(field88);
					field474.method251(field134);
					field474.method251(89);
					field474.method252(field223.field1478);
					field474.method252(field223.field1479);
					field474.method251(field456);
					field474.method251(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLEGCCHUZS;)V")
	public final void method101(int arg0, EGCCHUZS arg1) {
		if (arg0 == 3) {
			byte var3 = arg1.method283();
			byte var4 = arg1.method283();
			byte var5 = arg1.method262();
			byte var6 = arg1.method283();
			int var7 = arg1.method280();
			int var8 = (var7 >> 4 & 0x7) + field179;
			int var9 = (var7 & 0x7) + field180;
			int var10 = arg1.method289();
			int var11 = arg1.method289();
			int var12 = arg1.method263();
			int var13 = arg1.method263();
			int var14 = arg1.method261();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field245[var15];
			QAJCAYDZ var18;
			if (field340 == var10) {
				var18 = field223;
			} else {
				var18 = field228[var10];
			}

			if (var18 != null) {
				HGKOLOPU var19 = HGKOLOPU.method326(var11);
				int var20 = field341[field323][var8][var9];
				int var21 = field341[field323][var8 + 1][var9];
				int var22 = field341[field323][var8 + 1][var9 + 1];
				int var23 = field341[field323][var8][var9 + 1];
				IGXVZOHI var24 = var19.method321(var15, var16, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method168(var9, 0, -1, var17, 0, var8, var13 + 1, field323, var12 + 1);
					var18.field1244 = field123 + var12;
					var18.field1245 = field123 + var13;
					var18.field1251 = var24;
					int var25 = var19.field715;
					int var26 = var19.field697;
					if (var16 == 1 || var16 == 3) {
						var25 = var19.field697;
						var26 = var19.field715;
					}

					var18.field1248 = var8 * 128 + var25 * 64;
					var18.field1250 = var9 * 128 + var26 * 64;
					var18.field1249 = method152(var18.field1248, var18.field1250, field323);

					if (var4 > var6) {
						byte var27 = var4;
						var4 = var6;
						var6 = var27;
					}

					if (var3 > var5) {
						byte var28 = var3;
						var3 = var5;
						var5 = var28;
					}

					var18.field1236 = var4 + var8;
					var18.field1238 = var6 + var8;
					var18.field1237 = var3 + var9;
					var18.field1239 = var5 + var9;
				}
			}
		}

		if (arg0 == 246) {
			int var29 = arg1.method280();
			int var30 = var29 >> 2;
			int var31 = var29 & 0x3;
			int var32 = field245[var30];
			int var33 = arg1.method287();
			int var34 = arg1.method281();
			int var35 = (var34 >> 4 & 0x7) + field179;
			int var36 = (var34 & 0x7) + field180;
			if (var35 >= 0 && var36 >= 0 && var35 < 103 && var36 < 103) {
				int var37 = field341[field323][var35][var36];
				int var38 = field341[field323][var35 + 1][var36];
				int var39 = field341[field323][var35 + 1][var36 + 1];
				int var40 = field341[field323][var35][var36 + 1];
				if (var32 == 0) {
					PNWUURZF var41 = field178.method436(var36, field323, var35);
					if (var41 != null) {
						int var42 = var41.field1178 >> 14 & 0x7FFF;
						if (var30 == 2) {
							var41.field1176 = new WFUJSESJ(var33, var37, var31 + 4, var38, var42, 2, false, var39, var40);
							var41.field1177 = new WFUJSESJ(var33, var37, var31 + 1 & 0x3, var38, var42, 2, false, var39, var40);
						} else {
							var41.field1176 = new WFUJSESJ(var33, var37, var31, var38, var42, var30, false, var39, var40);
						}
					}
				}

				if (var32 == 1) {
					PVGMGNUT var43 = field178.method437(var35, var36, field323);
					if (var43 != null) {
						var43.field1185 = new WFUJSESJ(var33, var37, 0, var38, var43.field1186 >> 14 & 0x7FFF, 4, false, var39, var40);
					}
				}

				if (var32 == 2) {
					PBFZJQIS var44 = field178.method438(var35, field323, var36);

					if (var30 == 11) {
						var30 = 10;
					}

					if (var44 != null) {
						var44.field1138 = new WFUJSESJ(var33, var37, var31, var38, var44.field1146 >> 14 & 0x7FFF, var30, false, var39, var40);
					}
				}

				if (var32 == 3) {
					CXOAXJRQ var45 = field178.method439(var35, var36, field323);
					if (var45 != null) {
						var45.field524 = new WFUJSESJ(var33, var37, var31, var38, var45.field525 >> 14 & 0x7FFF, 22, false, var39, var40);
					}
				}
			}
		} else if (arg0 == 237) {
			int var46 = arg1.method261();
			int var47 = (var46 >> 4 & 0x7) + field179;
			int var48 = (var46 & 0x7) + field180;
			int var49 = var47 + arg1.method262();
			int var50 = var48 + arg1.method262();
			int var51 = arg1.method264();
			int var52 = arg1.method263();
			int var53 = arg1.method261() * 4;
			int var54 = arg1.method261() * 4;
			int var55 = arg1.method263();
			int var56 = arg1.method263();
			int var57 = arg1.method261();
			int var58 = arg1.method261();
			if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var52 != 0xFFFF) {
				var47 = var47 * 128 + 64;
				var48 = var48 * 128 + 64;
				var49 = var49 * 128 + 64;
				var50 = var50 * 128 + 64;
				OXJUGPEO var59 = new OXJUGPEO(field123 + var55, field323, var48, var58, var51, var47, method152(var47, var48, field323) - var53, var57, var52, field123 + var56, var54);
				var59.method500(field123 + var55, var49, var50, method152(var49, var50, field323) - var54);
				field329.method392(var59);
			}
		} else if (arg0 == 147) {
			int var60 = arg1.method288();
			int var61 = arg1.method288();
			int var62 = arg1.method287();
			int var63 = arg1.method280();
			int var64 = (var63 >> 4 & 0x7) + field179;
			int var65 = (var63 & 0x7) + field180;
			if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104 && field340 != var62) {
				JGSTQLRC var66 = new JGSTQLRC();
				var66.field849 = var60;
				var66.field848 = var61;

				if (field468[field323][var64][var65] == null) {
					field468[field323][var64][var65] = new JQSVNFRT();
				}

				field468[field323][var64][var65].method392(var66);
				method33(var64, var65);
			}
		} else if (arg0 == 188) {
			int var67 = arg1.method261();
			int var68 = (var67 >> 4 & 0x7) + field179;
			int var69 = (var67 & 0x7) + field180;
			int var70 = arg1.method263();
			int var71 = arg1.method261();
			int var72 = arg1.method263();
			if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
				var68 = var68 * 128 + 64;
				var69 = var69 * 128 + 64;
				EXWCQMNV var73 = new EXWCQMNV(var70, var72, method152(var68, var69, field323) - var71, field323, field123, var68, var69);
				field371.method392(var73);
			}
		} else if (arg0 == 199) {
			int var74 = arg1.method261();
			int var75 = (var74 >> 4 & 0x7) + field179;
			int var76 = (var74 & 0x7) + field180;
			int var77 = arg1.method263();
			int var78 = arg1.method263();
			int var79 = arg1.method263();
			if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
				JQSVNFRT var80 = field468[field323][var75][var76];
				if (var80 != null) {
					for (JGSTQLRC var81 = (JGSTQLRC) var80.method395(); var81 != null; var81 = (JGSTQLRC) var80.method397()) {
						if ((var77 & 0x7FFF) == var81.field849 && var81.field848 == var78) {
							var81.field848 = var79;
							break;
						}
					}

					method33(var75, var76);
				}
			}
		} else if (arg0 == 198) {
			int var82 = arg1.method261();
			int var83 = var82 >> 2;
			int var84 = var82 & 0x3;
			int var85 = field245[var83];
			int var86 = arg1.method261();
			int var87 = (var86 >> 4 & 0x7) + field179;
			int var88 = (var86 & 0x7) + field180;
			int var89 = arg1.method289();
			if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
				method168(var88, var84, var89, var85, var83, var87, -1, field323, 0);
			}
		} else if (arg0 == 52) {
			int var90 = arg1.method280();
			int var91 = (var90 >> 4 & 0x7) + field179;
			int var92 = (var90 & 0x7) + field180;
			int var93 = arg1.method280();
			int var94 = var93 >> 2;
			int var95 = var93 & 0x3;
			int var96 = field245[var94];
			if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
				method168(var92, var95, -1, var96, var94, var91, -1, field323, 0);
			}
		} else if (arg0 == 69) {
			int var97 = arg1.method261();
			int var98 = (var97 >> 4 & 0x7) + field179;
			int var99 = (var97 & 0x7) + field180;
			int var100 = arg1.method263();
			if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
				JQSVNFRT var101 = field468[field323][var98][var99];
				if (var101 != null) {
					for (JGSTQLRC var102 = (JGSTQLRC) var101.method395(); var102 != null; var102 = (JGSTQLRC) var101.method397()) {
						if ((var100 & 0x7FFF) == var102.field849) {
							var102.method379();
							break;
						}
					}

					if (var101.method395() == null) {
						field468[field323][var98][var99] = null;
					}

					method33(var98, var99);
				}
			}
		} else if (arg0 == 99) {
			int var103 = arg1.method288();
			int var104 = arg1.method287();
			int var105 = arg1.method280();
			int var106 = (var105 >> 4 & 0x7) + field179;
			int var107 = (var105 & 0x7) + field180;
			if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
				JGSTQLRC var108 = new JGSTQLRC();
				var108.field849 = var104;
				var108.field848 = var103;

				if (field468[field323][var106][var107] == null) {
					field468[field323][var106][var107] = new JQSVNFRT();
				}

				field468[field323][var106][var107].method392(var108);
				method33(var106, var107);
			}
		} else if (arg0 == 86) {
			int var109 = arg1.method261();
			int var110 = (var109 >> 4 & 0x7) + field179;
			int var111 = (var109 & 0x7) + field180;
			int var112 = arg1.method263();
			int var113 = arg1.method261();
			int var114 = var113 >> 4 & 0xF;
			int var115 = var113 & 0x7;
			if (field223.field1464[0] >= var110 - var114 && field223.field1464[0] <= var110 + var114 && field223.field1465[0] >= var111 - var114 && field223.field1465[0] <= var111 + var114 && field166 && !field108 && field338 < 50) {
				field248[field338] = var112;
				field153[field338] = var115;
				field97[field338] = FPQKMBUX.field623[var112];
				field338++;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method102() {
		method83();

		if (field281 == 1) {
			field267[field280 / 100].method335(field279 - 8 - 4, field278 - 8 - 4);
		}

		if (field281 == 2) {
			field267[field280 / 100 + 4].method335(field279 - 8 - 4, field278 - 8 - 4);
		}

		if (field490 != -1) {
			method108(field93, field490);
			method148(0, 0, 0, LORGYGVM.method477(field490));
		}

		if (field222 != -1) {
			method108(field93, field222);
			method148(0, 0, 0, LORGYGVM.method477(field222));
		}

		method48();

		if (!field469) {
			method41();
			method105();
		} else if (field410 == 0) {
			method58();
		}

		if (field246 == 1) {
			field358.method335(296, 472);
		}

		if (field151) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field867 < 30 && field108) {
				var3 = 0xFF0000;
			}

			if (field867 < 20 && !field108) {
				var3 = 0xFF0000;
			}

			field163.method525(var1, "Fps:" + field867, var2, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field108) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field108) {
				int var8 = 0xFF0000;
			}

			field163.method525(var1, "Mem:" + var5 + "k", var2, 0xFFFF00);
			var2 += 15;
		}

		if (field507 != 0) {
			int var9 = field507 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field163.method530(329, "System update in: " + var10 + ":0" + var9, 4, 0xFFFF00);
			} else {
				field163.method530(329, "System update in: " + var10 + ":" + var9, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method103() {
		for (OXJUGPEO var1 = (OXJUGPEO) field329.method395(); var1 != null; var1 = (OXJUGPEO) field329.method397()) {
			if (field323 != var1.field1125 || field123 > var1.field1133) {
				var1.method379();
			} else if (field123 >= var1.field1132) {
				if (var1.field1124 > 0) {
					CHUIKYUV var2 = field421[var1.field1124 - 1];
					if (var2 != null && var2.field1478 >= 0 && var2.field1478 < 13312 && var2.field1479 >= 0 && var2.field1479 < 13312) {
						var1.method500(field123, var2.field1478, var2.field1479, method152(var2.field1478, var2.field1479, var1.field1125) - var1.field1120);
					}
				}

				if (var1.field1124 < 0) {
					int var3 = -var1.field1124 - 1;
					QAJCAYDZ var4;
					if (field340 == var3) {
						var4 = field223;
					} else {
						var4 = field228[var3];
					}

					if (var4 != null && var4.field1478 >= 0 && var4.field1478 < 13312 && var4.field1479 >= 0 && var4.field1479 < 13312) {
						var1.method500(field123, var4.field1478, var4.field1479, method152(var4.field1478, var4.field1479, var1.field1125) - var1.field1120);
					}
				}

				var1.method501(field93);
				field178.method425(60, false, (int) var1.field1114, var1, (int) var1.field1115, (int) var1.field1113, field323, -1, var1.field1130);
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public static final void method104() {
		KYNTOGBR.field893 = true;
		PNDPOZTD.field1148 = true;
		field108 = true;
		LVLPWFEX.field1076 = true;
		HGKOLOPU.field711 = true;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method105() {
		if (field487 >= 2 || field182 != 0 || field372 != 0) {
			String var1;
			if (field182 == 1 && field487 < 2) {
				var1 = "Use " + field186 + " with...";
			} else if (field372 == 1 && field487 < 2) {
				var1 = field375 + "...";
			} else {
				var1 = field348[field487 - 1];
			}

			if (field487 > 2) {
				var1 = var1 + "@whi@ / " + (field487 - 2) + " more options";
			}

			field164.method535(0xFFFFFF, field123 / 1000, var1, 15, 4, true);
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method106() {
		if (field261 == 2) {
			method35(field294 * 2, (field292 - field463 << 7) + field295, (field293 - field464 << 7) + field296);

			if (field438 > -1 && field123 % 20 < 10) {
				field433[0].method335(field439 - 28, field438 - 12);
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method107() {
		if (field885 == 1) {
			if (field886 >= 539 && field886 <= 573 && field887 >= 169 && field887 < 205 && field334[0] != -1) {
				field249 = true;
				field100 = 0;
				field158 = true;
			}

			if (field886 >= 569 && field886 <= 599 && field887 >= 168 && field887 < 205 && field334[1] != -1) {
				field249 = true;
				field100 = 1;
				field158 = true;
			}

			if (field886 >= 597 && field886 <= 627 && field887 >= 168 && field887 < 205 && field334[2] != -1) {
				field249 = true;
				field100 = 2;
				field158 = true;
			}

			if (field886 >= 625 && field886 <= 669 && field887 >= 168 && field887 < 203 && field334[3] != -1) {
				field249 = true;
				field100 = 3;
				field158 = true;
			}

			if (field886 >= 666 && field886 <= 696 && field887 >= 168 && field887 < 205 && field334[4] != -1) {
				field249 = true;
				field100 = 4;
				field158 = true;
			}

			if (field886 >= 694 && field886 <= 724 && field887 >= 168 && field887 < 205 && field334[5] != -1) {
				field249 = true;
				field100 = 5;
				field158 = true;
			}

			if (field886 >= 722 && field886 <= 756 && field887 >= 169 && field887 < 205 && field334[6] != -1) {
				field249 = true;
				field100 = 6;
				field158 = true;
			}

			if (field886 >= 540 && field886 <= 574 && field887 >= 466 && field887 < 502 && field334[7] != -1) {
				field249 = true;
				field100 = 7;
				field158 = true;
			}

			if (field886 >= 572 && field886 <= 602 && field887 >= 466 && field887 < 503 && field334[8] != -1) {
				field249 = true;
				field100 = 8;
				field158 = true;
			}

			if (field886 >= 599 && field886 <= 629 && field887 >= 466 && field887 < 503 && field334[9] != -1) {
				field249 = true;
				field100 = 9;
				field158 = true;
			}

			if (field886 >= 627 && field886 <= 671 && field887 >= 467 && field887 < 502 && field334[10] != -1) {
				field249 = true;
				field100 = 10;
				field158 = true;
			}

			if (field886 >= 669 && field886 <= 699 && field887 >= 466 && field887 < 503 && field334[11] != -1) {
				field249 = true;
				field100 = 11;
				field158 = true;
			}

			if (field886 >= 696 && field886 <= 726 && field887 >= 466 && field887 < 503 && field334[12] != -1) {
				field249 = true;
				field100 = 12;
				field158 = true;
			}

			if (field886 >= 724 && field886 <= 758 && field887 >= 466 && field887 < 502 && field334[13] != -1) {
				field249 = true;
				field100 = 13;
				field158 = true;
			}

			field197++;
			if (field197 > 145) {
				field197 = 0;
				field474.method250(173);
				field474.method251(124);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method108(int arg0, int arg1) {
		boolean var3 = false;
		LORGYGVM var4 = LORGYGVM.method477(arg1);
		for (int var5 = 0; var5 < var4.field1031.length && var4.field1031[var5] != -1; var5++) {
			LORGYGVM var6 = LORGYGVM.method477(var4.field1031[var5]);
			if (var6.field1009 == 1) {
				var3 |= method108(arg0, var6.field1023);
			}

			if (var6.field1009 == 6 && (var6.field1019 != -1 || var6.field1020 != -1)) {
				boolean var7 = method115(var6);
				int var8;
				if (var7) {
					var8 = var6.field1020;
				} else {
					var8 = var6.field1019;
				}

				if (var8 != -1) {
					BZONLWPM var9 = BZONLWPM.field53[var8];
					var6.field1048 += arg0;
					while (var6.field1048 > var9.method27(var6.field997)) {
						var6.field1048 -= var9.method27(var6.field997) + 1;
						var6.field997++;
						if (var6.field997 >= var9.field54) {
							var6.field997 -= var9.field58;
							if (var6.field997 < 0 || var6.field997 >= var9.field54) {
								var6.field997 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1009 == 6 && var6.field1006 != 0) {
				int var10 = var6.field1006 >> 16;
				int var11 = var6.field1006 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field999 = var6.field999 + var10 & 0x7FF;
				var6.field1000 = var6.field1000 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method109() {
		field149 = true;
	}

	@ObfuscatedName("client.a(BILEGCCHUZS;)V")
	public final void method110(int arg0, EGCCHUZS arg1) {
		int var3 = arg1.method272(8);
		if (var3 < field229) {
			for (int var4 = var3; var4 < field229; var4++) {
				field459[field458++] = field230[var4];
			}
		}

		if (var3 > field229) {
			signlink.reporterror(field101 + " Too many players");
			throw new RuntimeException("eek");
		}

		field229 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field230[var5];
			QAJCAYDZ var7 = field228[var6];
			int var8 = arg1.method272(1);
			if (var8 == 0) {
				field230[field229++] = var6;
				var7.field1500 = field123;
			} else {
				int var9 = arg1.method272(2);
				if (var9 == 0) {
					field230[field229++] = var6;
					var7.field1500 = field123;
					field232[field231++] = var6;
				} else if (var9 == 1) {
					field230[field229++] = var6;
					var7.field1500 = field123;
					int var10 = arg1.method272(3);
					var7.method594(false, var10);
					int var11 = arg1.method272(1);
					if (var11 == 1) {
						field232[field231++] = var6;
					}
				} else if (var9 == 2) {
					field230[field229++] = var6;
					var7.field1500 = field123;
					int var12 = arg1.method272(3);
					var7.method594(true, var12);
					int var13 = arg1.method272(3);
					var7.method594(true, var13);
					int var14 = arg1.method272(1);
					if (var14 == 1) {
						field232[field231++] = var6;
					}
				} else if (var9 == 3) {
					field459[field458++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method111() {
		field479++;
		method78(true);
		method37(true);
		method78(false);
		method37(false);
		method103();
		method137();

		if (!field376) {
			int var1 = field429;
			if (field359 / 256 > var1) {
				var1 = field359 / 256;
			}

			if (field198[4] && field251[4] + 128 > var1) {
				var1 = field251[4] + 128;
			}

			int var2 = field430 + field199 & 0x7FF;
			method114(field405, var2, method152(field223.field1478, field223.field1479, field323) - 50, var1, var1 * 3 + 600, field406);
		}

		int var3;
		if (field376) {
			var3 = method131();
		} else {
			var3 = method130();
		}

		int var4 = field360;
		int var5 = field361;
		int var6 = field362;
		int var7 = field363;
		int var8 = field364;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field198[var9]) {
				int var10 = (int) (Math.random() * (field299[var9] * 2 + 1) + Math.sin(field496[var9] / 100.0D * field276[var9]) * field251[var9] - field299[var9]);
				if (var9 == 0) {
					field360 += var10;
				}

				if (var9 == 1) {
					field361 += var10;
				}

				if (var9 == 2) {
					field362 += var10;
				}

				if (var9 == 3) {
					field364 = field364 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field363 += var10;
					if (field363 < 128) {
						field363 = 128;
					}

					if (field363 > 383) {
						field363 = 383;
					}
				}
			}
		}

		int var11 = PNDPOZTD.field1168;
		IGXVZOHI.field836 = true;
		IGXVZOHI.field839 = 0;
		IGXVZOHI.field837 = field879 - 4;
		IGXVZOHI.field838 = field880 - 4;
		JOVUNXBE.method383();
		field178.method453(field364, var3, field363, field361, field360, field362);
		field178.method428();
		method129();
		method106();
		method176(var11);
		method102();
		field318.method581(4, 4, field871);
		field360 = var4;
		field361 = var5;
		field362 = var6;
		field363 = var7;
		field364 = var8;
	}

	@ObfuscatedName("client.e(II)V")
	public final void method112(int arg0) {
		if (arg0 >= 0) {
			if (field441 != 0) {
				field441 = 0;
				field322 = true;
			}

			int var2 = field235[arg0];
			int var3 = field236[arg0];
			int var4 = field237[arg0];
			int var5 = field238[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 912) {
				QAJCAYDZ var6 = field228[var5];
				if (var6 != null) {
					method140(false, 0, 1, var6.field1464[0], var6.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					field278 = field886;
					field279 = field887;
					field281 = 2;
					field280 = 0;
					field474.method250(23);
					field474.method286(var5);
				}
			}

			if (var4 == 587) {
				QAJCAYDZ var7 = field228[var5];
				if (var7 != null) {
					method140(false, 0, 1, var7.field1464[0], var7.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					field278 = field886;
					field279 = field887;
					field281 = 2;
					field280 = 0;
					field474.method250(166);
					field474.method252(var5);
				}
			}

			if (var4 == 1258) {
				method96(var2, var3, var5);
				field474.method250(231);
				field474.method286(var5 >> 14 & 0x7FFF);
				field474.method252(field464 + var3);
				field474.method252(field463 + var2);
			}

			if (var4 == 492) {
				field474.method250(229);
				field474.method285(var3);
				field474.method252(field373);
				field474.method286(var5);
				field474.method284(var2);
				field253 = 0;
				field254 = var3;
				field255 = var2;
				field256 = 2;
				if (LORGYGVM.method477(var3).field1015 == field222) {
					field256 = 1;
				}

				if (LORGYGVM.method477(var3).field1015 == field271) {
					field256 = 3;
				}
			}

			if (var4 == 734) {
				CHUIKYUV var8 = field421[var5];
				if (var8 != null) {
					method140(false, 0, 1, var8.field1464[0], var8.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					field278 = field886;
					field279 = field887;
					field281 = 2;
					field280 = 0;
					field474.method250(180);
					field474.method286(field373);
					field474.method286(var5);
				}
			}

			if (var4 == 583) {
				boolean var9 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
				if (!var9) {
					method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
				}

				field278 = field886;
				field279 = field887;
				field281 = 2;
				field280 = 0;
				field474.method250(226);
				field474.method252(field463 + var2);
				field474.method285(field464 + var3);
				field474.method285(var5);
			}

			if (var4 == 211 && !field82) {
				field474.method250(163);
				field474.method252(var3);
				field82 = true;
			}

			if (var4 == 37) {
				LORGYGVM var11 = LORGYGVM.method477(var3);
				field372 = 1;
				field373 = var3;
				field374 = var11.field995;
				field182 = 0;
				field249 = true;
				String var12 = var11.field1036;
				if (var12.indexOf(" ") != -1) {
					var12 = var12.substring(0, var12.indexOf(" "));
				}

				String var13 = var11.field1036;
				if (var13.indexOf(" ") != -1) {
					var13 = var13.substring(var13.indexOf(" ") + 1);
				}

				field375 = var12 + " " + var11.field987 + " " + var13;

				if (field374 == 16) {
					field249 = true;
					field100 = 3;
					field158 = true;
				}
			} else {
				if (var4 == 941) {
					method96(var2, var3, var5);
					field474.method250(105);
					field474.method285(field464 + var3);
					field474.method286(var5 >> 14 & 0x7FFF);
					field474.method284(field463 + var2);
				}

				if (var4 == 768 || var4 == 443) {
					String var14 = field348[arg0];
					int var15 = var14.indexOf("@whi@");
					if (var15 != -1) {
						var14 = var14.substring(var15 + 5).trim();
						String var16 = XXUUHLAE.method578(XXUUHLAE.method575(XXUUHLAE.method574(var14)));
						boolean var17 = false;
						for (int var18 = 0; var18 < field229; var18++) {
							QAJCAYDZ var19 = field228[field230[var18]];
							if (var19 != null && var19.field1255 != null && var19.field1255.equalsIgnoreCase(var16)) {
								method140(false, 0, 1, var19.field1464[0], var19.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);

								if (var4 == 768) {
									field474.method250(166);
									field474.method252(field230[var18]);
								}

								if (var4 == 443) {
									field474.method250(23);
									field474.method286(field230[var18]);
								}

								var17 = true;
								break;
							}
						}

						if (!var17) {
							method74("", 0, "Unable to find " + var16);
						}
					}
				}

				if (var4 == 1948) {
					WMJBOJYO var20 = WMJBOJYO.method560(var5);
					LORGYGVM var21 = LORGYGVM.method477(var3);
					String var22;
					if (var21 != null && var21.field1030[var2] >= 100000) {
						var22 = var21.field1030[var2] + " x " + var20.field1419;
					} else if (var20.field1429 == null) {
						var22 = "It's a " + var20.field1419 + ".";
					} else {
						var22 = new String(var20.field1429);
					}

					method74("", 0, var22);
				}

				if (var4 == 786) {
					method159();
				}

				if (var4 == 1787) {
					CHUIKYUV var23 = field421[var5];
					if (var23 != null) {
						AUWOQLEO var24 = var23.field69;
						if (var24.field19 != null) {
							var24 = var24.method6();
						}

						if (var24 != null) {
							String var25;
							if (var24.field24 == null) {
								var25 = "It's a " + var24.field33 + ".";
							} else {
								var25 = new String(var24.field24);
							}

							method74("", 0, var25);
						}
					}
				}

				if (var4 == 482) {
					field474.method250(73);
					field474.method284(var2);
					field474.method252(field185);
					field474.method252(var5);
					field474.method284(var3);
					field474.method286(field184);
					field474.method252(field183);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 355 && method96(var2, var3, var5)) {
					field474.method250(19);
					field474.method284(var5 >> 14 & 0x7FFF);
					field474.method284(field463 + var2);
					field474.method284(field464 + var3);
					field474.method286(field373);
				}

				if (var4 == 673) {
					QAJCAYDZ var26 = field228[var5];
					if (var26 != null) {
						method140(false, 0, 1, var26.field1464[0], var26.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(118);
						field474.method284(var5);
						field474.method284(field373);
					}
				}

				if (var4 == 535) {
					method96(var2, var3, var5);
					field474.method250(162);
					field474.method286(field463 + var2);
					field474.method286(field464 + var3);
					field474.method252(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 819) {
					boolean var27 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					if (!var27) {
						method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					}

					field278 = field886;
					field279 = field887;
					field281 = 2;
					field280 = 0;
					field474.method250(200);
					field474.method285(field185);
					field474.method286(var5);
					field474.method286(field184);
					field474.method252(field183);
					field474.method286(field464 + var3);
					field474.method286(field463 + var2);
				}

				if (var4 == 963) {
					field474.method250(131);
					field474.method252(var2);
					field474.method284(var3);
					field474.method284(var5);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 280) {
					CHUIKYUV var29 = field421[var5];
					if (var29 != null) {
						method140(false, 0, 1, var29.field1464[0], var29.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(161);
						field474.method286(field185);
						field474.method285(var5);
						field474.method252(field183);
						field474.method252(field184);
					}
				}

				if (var4 == 688 && method96(var2, var3, var5)) {
					field474.method250(133);
					field474.method286(var5 >> 14 & 0x7FFF);
					field474.method286(field464 + var3);
					field474.method252(field185);
					field474.method285(field463 + var2);
					field474.method285(field183);
					field474.method252(field184);
				}

				if (var4 == 800) {
					field474.method250(241);
					field474.method285(var5);
					field474.method284(var2);
					field474.method252(var3);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 858) {
					QAJCAYDZ var30 = field228[var5];
					if (var30 != null) {
						method140(false, 0, 1, var30.field1464[0], var30.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(167);
						field474.method286(var5);
					}
				}

				if (var4 == 1583) {
					WMJBOJYO var31 = WMJBOJYO.method560(var5);
					String var32;
					if (var31.field1429 == null) {
						var32 = "It's a " + var31.field1419 + ".";
					} else {
						var32 = new String(var31.field1429);
					}

					method74("", 0, var32);
				}

				if (var4 == 9) {
					CHUIKYUV var33 = field421[var5];
					if (var33 != null) {
						method140(false, 0, 1, var33.field1464[0], var33.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(253);
						field474.method286(var5);
					}
				}

				if (var4 == 233) {
					field474.method250(222);
					field474.method284(var5);
					field474.method284(var3);
					field474.method285(var2);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 1225) {
					int var34 = var5 >> 14 & 0x7FFF;
					HGKOLOPU var35 = HGKOLOPU.method326(var34);
					String var36;
					if (var35.field721 == null) {
						var36 = "It's a " + var35.field698 + ".";
					} else {
						var36 = new String(var35.field721);
					}

					method74("", 0, var36);
				}

				if (var4 == 36) {
					LORGYGVM var37 = LORGYGVM.method477(var3);
					boolean var38 = true;
					if (var37.field1021 > 0) {
						var38 = method40(var37);
					}

					if (var38) {
						field474.method250(47);
						field474.method252(var3);
					}
				}

				if (var4 == 100) {
					boolean var39 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					if (!var39) {
						method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
					}

					field278 = field886;
					field279 = field887;
					field281 = 2;
					field280 = 0;
					field474.method250(34);
					field474.method286(field464 + var3);
					field474.method284(var5);
					field474.method252(field463 + var2);
				}

				if (var4 == 881) {
					field474.method250(82);
					field474.method286(var2);
					field474.method286(var3);
					field474.method252(var5);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 559) {
					method96(var2, var3, var5);
					field474.method250(179);
					field474.method286(field463 + var2);
					field474.method285(var5 >> 14 & 0x7FFF);
					field474.method286(field464 + var3);
				}

				if (var4 == 397) {
					field474.method250(127);
					field474.method286(var2);
					field474.method285(var5);
					field474.method285(var3);
					field253 = 0;
					field254 = var3;
					field255 = var2;
					field256 = 2;
					if (LORGYGVM.method477(var3).field1015 == field222) {
						field256 = 1;
					}

					if (LORGYGVM.method477(var3).field1015 == field271) {
						field256 = 3;
					}
				}

				if (var4 == 219) {
					field182 = 1;
					field183 = var2;
					field184 = var3;
					field185 = var5;
					field186 = WMJBOJYO.method560(var5).field1419;
					field372 = 0;
					field249 = true;
				} else {
					if (var4 == 58) {
						CHUIKYUV var41 = field421[var5];
						if (var41 != null) {
							method140(false, 0, 1, var41.field1464[0], var41.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field474.method250(181);
							field474.method285(var5);
						}
					}

					if (var4 == 227) {
						field474.method250(47);
						field474.method252(var3);
						LORGYGVM var42 = LORGYGVM.method477(var3);
						if (var42.field990 != null && var42.field990[0][0] == 5) {
							int var43 = var42.field990[0][1];
							field95[var43] = 1 - field95[var43];
							method88(var43);
							field249 = true;
						}
					}

					if (var4 == 288) {
						QAJCAYDZ var44 = field228[var5];
						if (var44 != null) {
							method140(false, 0, 1, var44.field1464[0], var44.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field474.method250(140);
							field474.method285(var5);
						}
					}

					if (var4 == 485) {
						boolean var45 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						if (!var45) {
							method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						}

						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(171);
						field474.method252(var5);
						field474.method285(field464 + var3);
						field474.method285(field463 + var2);
					}

					if (var4 == 302) {
						boolean var47 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						if (!var47) {
							method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						}

						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(60);
						field474.method252(field463 + var2);
						field474.method285(field373);
						field474.method284(var5);
						field474.method286(field464 + var3);
					}

					if (var4 == 440) {
						String var49 = field348[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							if (field222 == -1) {
								method159();
								field181 = var49.substring(var50 + 5).trim();
								field434 = false;
								field120 = field222 = LORGYGVM.field1004;
							} else {
								method74("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}

					if (var4 == 875) {
						field474.method250(104);
						field474.method284(var2);
						field474.method285(var3);
						field474.method252(var5);
						field253 = 0;
						field254 = var3;
						field255 = var2;
						field256 = 2;
						if (LORGYGVM.method477(var3).field1015 == field222) {
							field256 = 1;
						}

						if (LORGYGVM.method477(var3).field1015 == field271) {
							field256 = 3;
						}
					}

					if (var4 == 50) {
						CHUIKYUV var51 = field421[var5];
						if (var51 != null) {
							method140(false, 0, 1, var51.field1464[0], var51.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field315++;
							if (field315 >= 94) {
								field474.method250(240);
								field474.method254(0xB72488);
								field315 = 0;
							}

							field474.method250(30);
							field474.method252(var5);
						}
					}

					if (var4 == 97) {
						CHUIKYUV var52 = field421[var5];
						if (var52 != null) {
							method140(false, 0, 1, var52.field1464[0], var52.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;

							if ((var5 & 0x3) == 0) {
								field349++;
							}

							if (field349 >= 93) {
								field474.method250(95);
								field349 = 0;
							}

							field474.method250(146);
							field474.method284(var5);
						}
					}

					if (var4 == 866) {
						field474.method250(214);
						field474.method284(var3);
						field474.method284(var5);
						field474.method252(var2);
						field253 = 0;
						field254 = var3;
						field255 = var2;
						field256 = 2;
						if (LORGYGVM.method477(var3).field1015 == field222) {
							field256 = 1;
						}

						if (LORGYGVM.method477(var3).field1015 == field271) {
							field256 = 3;
						}
					}

					if (var4 == 613) {
						boolean var53 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						if (!var53) {
							method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						}

						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field419 += var5;
						if (field419 >= 114) {
							field474.method250(255);
							field474.method254(421994);
							field419 = 0;
						}

						field474.method250(187);
						field474.method284(field463 + var2);
						field474.method285(var5);
						field474.method252(field464 + var3);
					}

					if (var4 == 984) {
						field474.method250(136);
						field474.method252(var3);
						field474.method284(var5);
						field474.method285(var2);
						field253 = 0;
						field254 = var3;
						field255 = var2;
						field256 = 2;
						if (LORGYGVM.method477(var3).field1015 == field222) {
							field256 = 1;
						}

						if (LORGYGVM.method477(var3).field1015 == field271) {
							field256 = 3;
						}
					}

					if (var4 == 285) {
						field109 += var3;
						if (field109 >= 112) {
							field474.method250(247);
							field474.method251(199);
							field109 = 0;
						}

						field474.method250(110);
						field474.method286(var2);
						field474.method285(var5);
						field474.method286(var3);
						field253 = 0;
						field254 = var3;
						field255 = var2;
						field256 = 2;
						if (LORGYGVM.method477(var3).field1015 == field222) {
							field256 = 1;
						}

						if (LORGYGVM.method477(var3).field1015 == field271) {
							field256 = 3;
						}
					}

					if (var4 == 90) {
						QAJCAYDZ var55 = field228[var5];
						if (var55 != null) {
							method140(false, 0, 1, var55.field1464[0], var55.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field92 += var5;
							if (field92 >= 68) {
								field474.method250(232);
								field474.method252(7862);
								field92 = 0;
							}

							field474.method250(152);
							field474.method252(var5);
						}
					}

					if (var4 == 703) {
						CHUIKYUV var56 = field421[var5];
						if (var56 != null) {
							method140(false, 0, 1, var56.field1464[0], var56.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field474.method250(32);
							field474.method284(var5);
						}
					}

					if (var4 == 705) {
						method96(var2, var3, var5);
						field474.method250(139);
						field474.method284(field463 + var2);
						field474.method252(var5 >> 14 & 0x7FFF);
						field474.method285(field464 + var3);
					}

					if (var4 == 131) {
						QAJCAYDZ var57 = field228[var5];
						if (var57 != null) {
							method140(false, 0, 1, var57.field1464[0], var57.field1465[0], 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
							field278 = field886;
							field279 = field887;
							field281 = 2;
							field280 = 0;
							field474.method250(8);
							field474.method252(var5);
							field474.method252(field185);
							field474.method286(field183);
							field474.method284(field184);
						}
					}

					if (var4 == 342 || var4 == 539 || var4 == 388 || var4 == 711) {
						String var58 = field348[arg0];
						int var59 = var58.indexOf("@whi@");
						if (var59 != -1) {
							long var60 = XXUUHLAE.method574(var58.substring(var59 + 5).trim());
							if (var4 == 342) {
								method169(var60);
							}

							if (var4 == 539) {
								method141(var60);
							}

							if (var4 == 388) {
								method132(var60);
							}

							if (var4 == 711) {
								method87(var60);
							}
						}
					}

					if (var4 == 738) {
						field474.method250(47);
						field474.method252(var3);
						LORGYGVM var62 = LORGYGVM.method477(var3);
						if (var62.field990 != null && var62.field990[0][0] == 5) {
							int var63 = var62.field990[0][1];
							if (field95[var63] != var62.field1018[0]) {
								field95[var63] = var62.field1018[0];
								method88(var63);
								field249 = true;
							}
						}
					}

					if (var4 == 17) {
						String var64 = field348[arg0];
						int var65 = var64.indexOf("@whi@");
						if (var65 != -1) {
							long var66 = XXUUHLAE.method574(var64.substring(var65 + 5).trim());
							int var68 = -1;
							for (int var69 = 0; var69 < field190; var69++) {
								if (field443[var69] == var66) {
									var68 = var69;
									break;
								}
							}

							if (var68 != -1 && field121[var68] > 0) {
								field322 = true;
								field441 = 0;
								field460 = true;
								field313 = "";
								field494 = 3;
								field243 = field443[var68];
								field172 = "Enter message to send to " + field510[var68];
							}
						}
					}

					if (var4 == 816) {
						field474.method250(244);
						field474.method285(var2);
						field474.method286(var3);
						field474.method286(var5);
						field253 = 0;
						field254 = var3;
						field255 = var2;
						field256 = 2;
						if (LORGYGVM.method477(var3).field1015 == field222) {
							field256 = 1;
						}

						if (LORGYGVM.method477(var3).field1015 == field271) {
							field256 = 3;
						}
					}

					if (var4 == 46) {
						boolean var70 = method140(false, 0, 0, var2, var3, 0, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						if (!var70) {
							method140(false, 0, 1, var2, var3, 1, 0, field223.field1464[0], 2, field223.field1465[0], 0);
						}

						field278 = field886;
						field279 = field887;
						field281 = 2;
						field280 = 0;
						field474.method250(176);
						field474.method286(field463 + var2);
						field474.method285(field464 + var3);
						field474.method285(var5);
					}

					if (var4 == 506) {
						if (field469) {
							field178.method452(var3 - 4, var2 - 4);
						} else {
							field178.method452(field887 - 4, field886 - 4);
						}
					}

					if (var4 == 841) {
						method53(field415);
						field415 = -1;
						field322 = true;
					}

					field182 = 0;
					field372 = 0;
					field249 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IIILjava/lang/String;)LTKEGJSFV;")
	public final TKEGJSFV method113(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field486[0] != null) {
				var6 = field486[0].method245(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field257.reset();
			field257.update(var6);
			int var8 = (int) field257.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new TKEGJSFV(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method92("Requesting " + arg0, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method99(arg4 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				EGCCHUZS var16 = new EGCCHUZS(var15);
				var16.field589 = 3;
				int var17 = var16.method265() + 6;
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
						method92("Loading " + arg0 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field486[0] != null) {
						field486[0].method246(var6, var6.length, arg3);
					}
				} catch (Exception var28) {
					field486[0] = null;
				}

				if (var6 != null) {
					field257.reset();
					field257.update(var6);
					int var23 = (int) field257.getValue();
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
						method92("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method92(var11 + " - Retrying in " + var25, arg2);
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

				field394 = !field394;
			}
		}

		return new TKEGJSFV(var6);
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = IGXVZOHI.field841[var7];
			int var13 = IGXVZOHI.field842[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = IGXVZOHI.field841[var8];
			int var16 = IGXVZOHI.field842[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field360 = arg0 - var9;
		field361 = arg2 - var10;
		field362 = arg5 - var11;
		field363 = arg3;
		field364 = arg1;
	}

	@ObfuscatedName("client.b(LLORGYGVM;I)Z")
	public final boolean method115(LORGYGVM arg0) {
		if (arg0.field1053 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1053.length; var2++) {
			int var3 = method125(arg0, var2);
			int var4 = arg0.field1018[var2];
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
		field105 = Integer.parseInt(getParameter("nodeid"));
		field106 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method104();
		} else {
			method144();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field107 = false;
		} else {
			field107 = true;
		}

		method409(503, 765);
	}

	@ObfuscatedName("client.b(BILEGCCHUZS;)V")
	public final void method116(int arg0, EGCCHUZS arg1) {
		for (int var3 = 0; var3 < field231; var3++) {
			int var4 = field232[var3];
			QAJCAYDZ var5 = field228[var4];
			int var6 = arg1.method261();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method261() << 8;
			}

			method95(arg1, var5, var4, var6);
		}
	}

	@ObfuscatedName("client.d(ILEGCCHUZS;I)V")
	public final void method117(EGCCHUZS arg0, int arg1) {
		field458 = 0;
		field231 = 0;
		method71(arg0, arg1);
		method76(arg0, arg1);
		method69(arg0, arg1);

		for (int var3 = 0; var3 < field458; var3++) {
			int var4 = field459[var3];
			if (field123 != field421[var4].field1500) {
				field421[var4].field69 = null;
				field421[var4] = null;
			}
		}

		if (arg0.field589 != arg1) {
			signlink.reporterror(field101 + " size mismatch in getnpcpos - pos:" + arg0.field589 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field422; var5++) {
			if (field421[field423[var5]] == null) {
				signlink.reporterror(field101 + " null entry in npc list - pos:" + var5 + " size:" + field422);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method118() {
		int var1 = field83 * 128 + 64;
		int var2 = field84 * 128 + 64;
		int var3 = method152(var1, var2, field323) - field85;

		if (field360 < var1) {
			field360 += (var1 - field360) * field87 / 1000 + field86;
			if (field360 > var1) {
				field360 = var1;
			}
		}

		if (field360 > var1) {
			field360 -= (field360 - var1) * field87 / 1000 + field86;
			if (field360 < var1) {
				field360 = var1;
			}
		}

		if (field361 < var3) {
			field361 += (var3 - field361) * field87 / 1000 + field86;
			if (field361 > var3) {
				field361 = var3;
			}
		}

		if (field361 > var3) {
			field361 -= (field361 - var3) * field87 / 1000 + field86;
			if (field361 < var3) {
				field361 = var3;
			}
		}

		if (field362 < var2) {
			field362 += (var2 - field362) * field87 / 1000 + field86;
			if (field362 > var2) {
				field362 = var2;
			}
		}

		if (field362 > var2) {
			field362 -= (field362 - var2) * field87 / 1000 + field86;
			if (field362 < var2) {
				field362 = var2;
			}
		}

		field146++;
		if (field146 > 75) {
			field146 = 0;
			field474.method250(183);
		}

		int var4 = field451 * 128 + 64;
		int var5 = field452 * 128 + 64;
		int var6 = method152(var4, var5, field323) - field453;
		int var7 = var4 - field360;
		int var8 = var6 - field361;
		int var9 = var5 - field362;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field363 < var11) {
			field363 += (var11 - field363) * field455 / 1000 + field454;
			if (field363 > var11) {
				field363 = var11;
			}
		}

		if (field363 > var11) {
			field363 -= (field363 - var11) * field455 / 1000 + field454;
			if (field363 < var11) {
				field363 = var11;
			}
		}

		int var13 = var12 - field364;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field364 += field455 * var13 / 1000 + field454;
			field364 &= 0x7FF;
		}

		if (var13 < 0) {
			field364 -= -var13 * field455 / 1000 + field454;
			field364 &= 0x7FF;
		}

		int var14 = var12 - field364;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field364 = var12;
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method119() {
		for (SZJROHQV var1 = (SZJROHQV) field320.method395(); var1 != null; var1 = (SZJROHQV) field320.method397()) {
			if (var1.field1289 == -1) {
				var1.field1290 = 0;
				method160(var1);
			} else {
				var1.method379();
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 346);

			if (arg0.length == 5) {
				field105 = Integer.parseInt(arg0[0]);
				field106 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method104();
				} else if (arg0[2].equals("highmem")) {
					method144();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field107 = false;
				} else if (arg0[3].equals("members")) {
					field107 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method408(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field178.method440(arg2, arg1, arg4);
		if (var6 != 0) {
			int var7 = field178.method444(arg2, arg1, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field505.field731;
			int var12 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			HGKOLOPU var14 = HGKOLOPU.method326(var13);
			if (var14.field700 == -1) {
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
				DGXCFOYI var15 = field336[var14.field700];
				if (var15 != null) {
					int var16 = (var14.field715 * 4 - var15.field531) / 2;
					int var17 = (var14.field697 * 4 - var15.field532) / 2;
					var15.method183((104 - arg4 - var14.field697) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field178.method442(arg2, arg1, arg4);
		if (var18 != 0) {
			int var19 = field178.method444(arg2, arg1, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			HGKOLOPU var23 = HGKOLOPU.method326(var22);
			if (var23.field700 != -1) {
				DGXCFOYI var24 = field336[var23.field700];
				if (var24 != null) {
					int var25 = (var23.field715 * 4 - var24.field531) / 2;
					int var26 = (var23.field697 * 4 - var24.field532) / 2;
					var24.method183((104 - arg4 - var23.field697) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field505.field731;
				int var29 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field178.method443(arg2, arg1, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			HGKOLOPU var32 = HGKOLOPU.method326(var31);
			if (var32.field700 != -1) {
				DGXCFOYI var33 = field336[var32.field700];
				if (var33 != null) {
					int var34 = (var32.field715 * 4 - var33.field531) / 2;
					int var35 = (var32.field697 * 4 - var33.field532) / 2;
					var33.method183((104 - arg4 - var32.field697) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method121() {
		field508 = new DGXCFOYI(field208, "titlebox", 0);
		field509 = new DGXCFOYI(field208, "titlebutton", 0);
		field514 = new DGXCFOYI[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field514[var1] = new DGXCFOYI(field208, "runes", var1);
		}

		field471 = new HOSNGCXH(128, 265);
		field472 = new HOSNGCXH(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field471.field731[var2] = field399.field1434[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field472.field731[var3] = field400.field1434[var3];
		}

		field331 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field331[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field331[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field331[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field331[var7 + 192] = 0xFFFFFF;
		}

		field332 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field332[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field332[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field332[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field332[var11 + 192] = 0xFFFFFF;
		}

		field333 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field333[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field333[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field333[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field333[var15 + 192] = 0xFFFFFF;
		}

		field330 = new int[256];
		field268 = new int[32768];
		field269 = new int[32768];
		method31(null);
		field445 = new int[32768];
		field446 = new int[32768];
		method92("Connecting to fileserver", 10);

		if (!field187) {
			field343 = true;
			field187 = true;
			method51(this, 2);
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method122() {
		if (field108 && field152 == 2 && LVLPWFEX.field1085 != field323) {
			method81("Loading - please wait.", null);
			field152 = 1;
			field116 = System.currentTimeMillis();
		}

		if (field152 == 1) {
			int var1 = method123();
			if (var1 != 0 && System.currentTimeMillis() - field116 > 360000L) {
				signlink.reporterror(field101 + " glcfb " + field150 + "," + var1 + "," + field108 + "," + field486[0] + "," + field224.method233() + "," + field323 + "," + field512 + "," + field513);
				field116 = System.currentTimeMillis();
			}
		}

		if (field152 == 2 && field323 != field270) {
			field270 = field323;
			method133(field323);
		}
	}

	@ObfuscatedName("client.u(I)I")
	public final int method123() {
		for (int var1 = 0; var1 < field321.length; var1++) {
			if (field321[var1] == null && field309[var1] != -1) {
				return -1;
			}

			if (field282[var1] == null && field310[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field321.length; var3++) {
			byte[] var4 = field282[var3];
			if (var4 != null) {
				int var5 = (field308[var3] >> 8) * 64 - field463;
				int var6 = (field308[var3] & 0xFF) * 64 - field464;
				if (field161) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= LVLPWFEX.method491(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field515) {
			return -4;
		} else {
			field152 = 2;
			LVLPWFEX.field1085 = field323;
			method161();
			field474.method250(209);
			return 0;
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method124(int arg0) {
		LORGYGVM var2 = LORGYGVM.method477(arg0);
		for (int var3 = 0; var3 < var2.field1031.length && var2.field1031[var3] != -1; var3++) {
			LORGYGVM var4 = LORGYGVM.method477(var2.field1031[var3]);
			if (var4.field1009 == 1) {
				method124(var4.field1023);
			}

			var4.field997 = 0;
			var4.field1048 = 0;
		}
	}

	@ObfuscatedName("client.a(ILLORGYGVM;I)I")
	public final int method125(LORGYGVM arg0, int arg1) {
		if (arg0.field990 == null || arg1 >= arg0.field990.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field990[arg1];
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
					var8 = field516[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field138[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field356[var3[var5++]];
				}

				if (var7 == 4) {
					LORGYGVM var10 = LORGYGVM.method477(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < WMJBOJYO.field1396 && (!WMJBOJYO.method560(var11).field1400 || field107)) {
						for (int var12 = 0; var12 < var10.field1007.length; var12++) {
							if (var11 + 1 == var10.field1007[var12]) {
								var8 += var10.field1030[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field95[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field160[field138[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field95[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field223.field1260;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < MJYHJBDO.field1097; var13++) {
						if (MJYHJBDO.field1099[var13]) {
							var8 += field138[var13];
						}
					}
				}

				if (var7 == 10) {
					LORGYGVM var14 = LORGYGVM.method477(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < WMJBOJYO.field1396 && (!WMJBOJYO.method560(var15).field1400 || field107)) {
						for (int var16 = 0; var16 < var14.field1007.length; var16++) {
							if (var14.field1007[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field384;
				}

				if (var7 == 12) {
					var8 = field119;
				}

				if (var7 == 13) {
					int var17 = field95[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					EMWMNDZQ var20 = EMWMNDZQ.field602[var19];
					int var21 = var20.field604;
					int var22 = var20.field605;
					int var23 = var20.field606;
					int var24 = field395[var23 - var22];
					var8 = field95[var21] >> var22 & var24;
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
					var8 = (field223.field1478 >> 7) + field463;
				}

				if (var7 == 19) {
					var8 = (field223.field1479 >> 7) + field464;
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

	@ObfuscatedName("client.b(LEGCCHUZS;II)V")
	public final void method126(EGCCHUZS arg0, int arg1) {
		while (arg0.field590 + 10 < arg1 * 8) {
			int var3 = arg0.method272(11);
			if (var3 == 2047) {
				break;
			}

			if (field228[var3] == null) {
				field228[var3] = new QAJCAYDZ();
				if (field233[var3] != null) {
					field228[var3].method521(field233[var3]);
				}
			}

			field230[field229++] = var3;
			QAJCAYDZ var4 = field228[var3];
			var4.field1500 = field123;
			int var5 = arg0.method272(1);
			int var6 = arg0.method272(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method272(1);
			if (var7 == 1) {
				field232[field231++] = var3;
			}

			int var8 = arg0.method272(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method591(var5 == 1, field223.field1465[0] + var6, field223.field1464[0] + var8);
		}

		arg0.method273();
	}

	@ObfuscatedName("client.a(B)V")
	public final void method127() {
		if (!field284 && !field136 && !field409) {
			field123++;

			if (field470) {
				method163();
			} else {
				method43();
			}

			method162();
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method128() {
		field324 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field187) {
				field176++;
				method157();
				method157();
				method174();
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

		field324 = false;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method129() {
		field210 = 0;
		for (int var1 = -1; var1 < field422 + field229; var1++) {
			ZOMFWUWL var2;
			if (var1 == -1) {
				var2 = field223;
			} else if (var1 < field229) {
				var2 = field228[field230[var1]];
			} else {
				var2 = field421[field423[var1 - field229]];
			}

			if (var2 != null && var2.method29()) {
				if (var2 instanceof CHUIKYUV) {
					AUWOQLEO var3 = ((CHUIKYUV) var2).field69;
					if (var3.field19 != null) {
						var3 = var3.method6();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field229) {
					AUWOQLEO var6 = ((CHUIKYUV) var2).field69;
					if (var6.field26 >= 0 && var6.field26 < field436.length) {
						method34(var2, var2.field1472 + 15);

						if (field438 > -1) {
							field436[var6.field26].method335(field439 - 30, field438 - 12);
						}
					}

					if (field261 == 1 && field423[var1 - field229] == field274 && field123 % 20 < 10) {
						method34(var2, var2.field1472 + 15);

						if (field438 > -1) {
							field433[0].method335(field439 - 28, field438 - 12);
						}
					}
				} else {
					int var4 = 30;
					QAJCAYDZ var5 = (QAJCAYDZ) var2;
					if (var5.field1241 != -1 || var5.field1242 != -1) {
						method34(var2, var2.field1472 + 15);

						if (field438 > -1) {
							if (var5.field1241 != -1) {
								field387[var5.field1241].method335(field439 - var4, field438 - 12);
								var4 += 25;
							}

							if (var5.field1242 != -1) {
								field436[var5.field1242].method335(field439 - var4, field438 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field261 == 10 && field230[var1] == field203) {
						method34(var2, var2.field1472 + 15);

						if (field438 > -1) {
							field433[1].method335(field439 - var4, field438 - 12);
						}
					}
				}

				if (var2.field1469 != null && (var1 >= field229 || field440 == 0 || field440 == 3 || field440 == 1 && method91(((QAJCAYDZ) var2).field1255))) {
					method34(var2, var2.field1472);

					if (field438 > -1 && field210 < field211) {
						field215[field210] = field164.method529(var2.field1469) / 2;
						field214[field210] = field164.field1274;
						field212[field210] = field438;
						field213[field210] = field439;
						field216[field210] = var2.field1495;
						field217[field210] = var2.field1496;
						field218[field210] = var2.field1471;
						field219[field210++] = var2.field1469;

						if (field147 == 0 && var2.field1496 >= 1 && var2.field1496 <= 3) {
							field214[field210] += 10;
							field213[field210] += 5;
						}

						if (field147 == 0 && var2.field1496 == 4) {
							field215[field210] = 60;
						}

						if (field147 == 0 && var2.field1496 == 5) {
							field214[field210] += 5;
						}
					}
				}

				if (var2.field1466 > field123) {
					method34(var2, var2.field1472 + 15);

					if (field438 > -1) {
						int var7 = var2.field1467 * 30 / var2.field1468;
						if (var7 > 30) {
							var7 = 30;
						}

						JOVUNXBE.method385(field439 - 3, var7, 5, field438 - 15, 0xFF00);
						JOVUNXBE.method385(field439 - 3, 30 - var7, 5, field438 + var7 - 15, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1490[var8] > field123) {
						method34(var2, var2.field1472 / 2);

						if (field438 > -1) {
							if (var8 == 1) {
								field439 -= 20;
							}

							if (var8 == 2) {
								field438 -= 15;
								field439 -= 10;
							}

							if (var8 == 3) {
								field438 += 15;
								field439 -= 10;
							}

							field417[var2.field1489[var8]].method335(field439 - 12, field438 - 12);
							field162.method526(0, field439 + 4, field438, String.valueOf(var2.field1488[var8]));
							field162.method526(0xFFFFFF, field439 + 3, field438 - 1, String.valueOf(var2.field1488[var8]));
						}
					}
				}
			}
		}

		field244++;
		if (field244 > 96) {
			field244 = 0;
			field474.method250(138);
		}

		for (int var9 = 0; var9 < field210; var9++) {
			int var10 = field212[var9];
			int var11 = field213[var9];
			int var12 = field215[var9];
			int var13 = field214[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field213[var15] - field214[var15] && var11 - var13 < field213[var15] + 2 && var10 - var12 < field215[var15] + field212[var15] && var10 + var12 > field212[var15] - field215[var15] && field213[var15] - field214[var15] < var11) {
						var11 = field213[var15] - field214[var15];
						var14 = true;
					}
				}
			}

			field438 = field212[var9];
			field439 = field213[var9] = var11;
			String var16 = field219[var9];
			if (field147 == 0) {
				int var17 = 0xFFFF00;
				if (field216[var9] < 6) {
					var17 = field435[field216[var9]];
				}

				if (field216[var9] == 6) {
					var17 = field479 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field216[var9] == 7) {
					var17 = field479 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field216[var9] == 8) {
					var17 = field479 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field216[var9] == 9) {
					int var18 = 150 - field218[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field216[var9] == 10) {
					int var19 = 150 - field218[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field216[var9] == 11) {
					int var20 = 150 - field218[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field217[var9] == 0) {
					field164.method526(0, field439 + 1, field438, var16);
					field164.method526(var17, field439, field438, var16);
				}

				if (field217[var9] == 1) {
					field164.method531(field479, 0, var16, field438, field439 + 1);
					field164.method531(field479, var17, var16, field438, field439);
				}

				if (field217[var9] == 2) {
					field164.method532(var16, field479, field439 + 1, field438, 0);
					field164.method532(var16, field479, field439, field438, var17);
				}

				if (field217[var9] == 3) {
					field164.method533(field439 + 1, 150 - field218[var9], 0, field438, var16, field479);
					field164.method533(field439, 150 - field218[var9], var17, field438, var16, field479);
				}

				if (field217[var9] == 4) {
					int var21 = field164.method529(var16);
					int var22 = (150 - field218[var9]) * (var21 + 100) / 150;
					JOVUNXBE.method382(field438 + 50, field438 - 50, 0, 334);
					field164.method530(field439 + 1, var16, field438 + 50 - var22, 0);
					field164.method530(field439, var16, field438 + 50 - var22, var17);
					JOVUNXBE.method381();
				}

				if (field217[var9] == 5) {
					int var23 = 150 - field218[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					JOVUNXBE.method382(512, 0, field439 - field164.field1274 - 1, field439 + 5);
					field164.method526(0, field439 + var24 + 1, field438, var16);
					field164.method526(var17, field439 + var24, field438, var16);
					JOVUNXBE.method381();
				}
			} else {
				field164.method526(0, field439 + 1, field438, var16);
				field164.method526(0xFFFF00, field439, field438, var16);
			}
		}
	}

	@ObfuscatedName("client.w(I)I")
	public final int method130() {
		int var1 = 3;
		if (field363 < 310) {
			int var2 = field360 >> 7;
			int var3 = field362 >> 7;
			int var4 = field223.field1478 >> 7;
			int var5 = field223.field1479 >> 7;

			if ((field392[field323][var2][var3] & 0x4) != 0) {
				var1 = field323;
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

					if ((field392[field323][var2][var3] & 0x4) != 0) {
						var1 = field323;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field392[field323][var2][var3] & 0x4) != 0) {
							var1 = field323;
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

					if ((field392[field323][var2][var3] & 0x4) != 0) {
						var1 = field323;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field392[field323][var2][var3] & 0x4) != 0) {
							var1 = field323;
						}
					}
				}
			}
		}

		if ((field392[field323][field223.field1478 >> 7][field223.field1479 >> 7] & 0x4) != 0) {
			var1 = field323;
		}

		return var1;
	}

	@ObfuscatedName("client.x(I)I")
	public final int method131() {
		int var1 = method152(field360, field362, field323);
		if (var1 - field361 < 800 && (field392[field323][field360 >> 7][field362 >> 7] & 0x4) != 0) {
			return field323;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method132(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field190; var3++) {
				if (field443[var3] == arg0) {
					field190--;
					field249 = true;

					for (int var4 = var3; var4 < field190; var4++) {
						field510[var4] = field510[var4 + 1];
						field121[var4] = field121[var4 + 1];
						field443[var4] = field443[var4 + 1];
					}

					field474.method250(48);
					field474.method257(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method133(int arg0) {
		int[] var2 = field505.field731;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field392[arg0][var7][var5] & 0x18) == 0) {
					field178.method449(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field392[arg0 + 1][var7][var5] & 0x8) != 0) {
					field178.method449(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field505.method330();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field392[arg0][var11][var10] & 0x18) == 0) {
					method120(var9, var11, arg0, var8, var10);
				}

				if (arg0 < 3 && (field392[arg0 + 1][var11][var10] & 0x8) != 0) {
					method120(var9, var11, arg0 + 1, var8, var10);
				}
			}
		}

		if (field318 != null) {
			field318.method580();
			PNDPOZTD.field1159 = field499;
		}

		field473++;
		if (field473 > 95) {
			field473 = 0;
			field474.method250(142);
		}

		field239 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field178.method443(field323, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = HGKOLOPU.method326(var14).field717;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field98[field323].field49;
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

						field133[field239] = field225[var15];
						field240[field239] = var16;
						field241[field239] = var17;
						field239++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method134() {
		if (field885 == 1) {
			if (field886 >= 6 && field886 <= 106 && field887 >= 467 && field887 <= 499) {
				field440 = (field440 + 1) % 4;
				field495 = true;
				field322 = true;
				field474.method250(0);
				field474.method251(field440);
				field474.method251(field325);
				field474.method251(field339);
			}

			if (field886 >= 135 && field886 <= 235 && field887 >= 467 && field887 <= 499) {
				field325 = (field325 + 1) % 3;
				field495 = true;
				field322 = true;
				field474.method250(0);
				field474.method251(field440);
				field474.method251(field325);
				field474.method251(field339);
			}

			if (field886 >= 273 && field886 <= 373 && field887 >= 467 && field887 <= 499) {
				field339 = (field339 + 1) % 3;
				field495 = true;
				field322 = true;
				field474.method250(0);
				field474.method251(field440);
				field474.method251(field325);
				field474.method251(field339);
			}

			if (field886 >= 412 && field886 <= 512 && field887 >= 467 && field887 <= 499) {
				if (field222 == -1) {
					method159();
					field181 = "";
					field434 = false;
					field120 = field222 = LORGYGVM.field1004;
					return;
				}

				method74("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLEGCCHUZS;I)V")
	public final void method135(EGCCHUZS arg0, int arg1) {
		arg0.method271();
		int var3 = arg0.method272(1);
		if (var3 != 0) {
			int var4 = arg0.method272(2);
			if (var4 == 0) {
				field232[field231++] = field227;
			} else if (var4 == 1) {
				int var5 = arg0.method272(3);
				field223.method594(false, var5);
				int var6 = arg0.method272(1);
				if (var6 == 1) {
					field232[field231++] = field227;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method272(3);
				field223.method594(true, var7);
				int var8 = arg0.method272(3);
				field223.method594(true, var8);
				int var9 = arg0.method272(1);
				if (var9 == 1) {
					field232[field231++] = field227;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method272(7);
				int var11 = arg0.method272(7);
				int var12 = arg0.method272(1);
				if (var12 == 1) {
					field232[field231++] = field227;
				}

				int var13 = arg0.method272(1);
				field323 = arg0.method272(2);
				field223.method591(var13 == 1, var10, var11);
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method136() {
		while (true) {
			int var1 = method412();
			if (var1 == -1) {
				return;
			}

			if (field222 != -1 && field222 == field120) {
				if (var1 == 8 && field181.length() > 0) {
					field181 = field181.substring(0, field181.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field181.length() < 12) {
					field181 = field181 + (char) var1;
				}
			} else if (field460) {
				if (var1 >= 32 && var1 <= 122 && field313.length() < 80) {
					field313 = field313 + (char) var1;
					field322 = true;
				}

				if (var1 == 8 && field313.length() > 0) {
					field313 = field313.substring(0, field313.length() - 1);
					field322 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field460 = false;
					field322 = true;

					if (field494 == 1) {
						long var2 = XXUUHLAE.method574(field313);
						method169(var2);
					}

					if (field494 == 2 && field190 > 0) {
						long var4 = XXUUHLAE.method574(field313);
						method132(var4);
					}

					if (field494 == 3 && field313.length() > 0) {
						field474.method250(31);
						field474.method251(0);
						int var6 = field474.field589;
						field474.method257(field243);
						YUIPFPJK.method589(field474, field313);
						field474.method260(field474.field589 - var6);
						field313 = YUIPFPJK.method590(field313);
						field313 = DHIKSAEW.method195(field313);
						method74(XXUUHLAE.method578(XXUUHLAE.method575(field243)), 6, field313);

						if (field325 == 2) {
							field325 = 1;
							field495 = true;
							field474.method250(0);
							field474.method251(field440);
							field474.method251(field325);
							field474.method251(field339);
						}
					}

					if (field494 == 4 && field283 < 100) {
						long var7 = XXUUHLAE.method574(field313);
						method141(var7);
					}

					if (field494 == 5 && field283 > 0) {
						long var9 = XXUUHLAE.method574(field313);
						method87(var9);
					}
				}
			} else if (field441 == 1) {
				if (var1 >= 48 && var1 <= 57 && field337.length() < 10) {
					field337 = field337 + (char) var1;
					field322 = true;
				}

				if (var1 == 8 && field337.length() > 0) {
					field337 = field337.substring(0, field337.length() - 1);
					field322 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field337.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field337);
						} catch (Exception var21) {
						}

						field474.method250(67);
						field474.method255(var11);
					}

					field441 = 0;
					field322 = true;
				}
			} else if (field441 == 2) {
				if (var1 >= 32 && var1 <= 122 && field337.length() < 12) {
					field337 = field337 + (char) var1;
					field322 = true;
				}

				if (var1 == 8 && field337.length() > 0) {
					field337 = field337.substring(0, field337.length() - 1);
					field322 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field337.length() > 0) {
						field474.method250(143);
						field474.method257(XXUUHLAE.method574(field337));
					}

					field441 = 0;
					field322 = true;
				}
			} else if (field271 == -1 && field368 == -1) {
				if (var1 >= 32 && var1 <= 122 && field272.length() < 80) {
					field272 = field272 + (char) var1;
					field322 = true;
				}

				if (var1 == 8 && field272.length() > 0) {
					field272 = field272.substring(0, field272.length() - 1);
					field322 = true;
				}

				if ((var1 == 13 || var1 == 10) && field272.length() > 0) {
					if (field266 == 2) {
						if (field272.equals("::clientdrop")) {
							method94();
						}

						if (field272.equals("::lag")) {
							method138();
						}

						if (field272.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field224.method239(2); var12++) {
								field224.method231(2, var12, (byte) 1);
							}
						}

						if (field272.equals("::fpson")) {
							field151 = true;
						}

						if (field272.equals("::fpsoff")) {
							field151 = false;
						}

						if (field272.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field98[var13].field49[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field272.startsWith("::")) {
						field474.method250(227);
						field474.method251(field272.length() - 1);
						field474.method258(field272.substring(2));
					} else {
						String var16 = field272.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field272 = field272.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field272 = field272.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field272 = field272.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field272 = field272.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field272 = field272.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field272 = field272.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field272 = field272.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field272 = field272.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field272 = field272.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field272 = field272.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field272 = field272.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field272 = field272.substring(6);
						}

						String var18 = field272.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field272 = field272.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field272 = field272.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field272 = field272.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field272 = field272.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field272 = field272.substring(6);
						}

						field474.method250(137);
						field474.method251(0);
						int var20 = field474.field589;
						field474.method277(var17);
						field420.field589 = 0;
						YUIPFPJK.method589(field420, field272);
						field474.method259(field420.field588, 0, field420.field589);
						field474.method251(var19);
						field474.method260(field474.field589 - var20);
						field272 = YUIPFPJK.method590(field272);
						field272 = DHIKSAEW.method195(field272);
						field223.field1469 = field272;
						field223.field1495 = var17;
						field223.field1496 = var19;
						field223.field1471 = 150;

						if (field266 == 2) {
							method74("@cr2@" + field223.field1255, 2, field223.field1469);
						} else if (field266 == 1) {
							method74("@cr1@" + field223.field1255, 2, field223.field1469);
						} else {
							method74(field223.field1255, 2, field223.field1469);
						}

						if (field440 == 2) {
							field440 = 3;
							field495 = true;
							field474.method250(0);
							field474.method251(field440);
							field474.method251(field325);
							field474.method251(field339);
						}
					}

					field272 = "";
					field322 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method137() {
		for (EXWCQMNV var1 = (EXWCQMNV) field371.method395(); var1 != null; var1 = (EXWCQMNV) field371.method397()) {
			if (field323 != var1.field611 || var1.field617) {
				var1.method379();
			} else if (field123 >= var1.field616) {
				var1.method301(field93);

				if (var1.field617) {
					var1.method379();
				} else {
					field178.method425(60, false, var1.field613, var1, var1.field614, var1.field612, var1.field611, -1, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void method138() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field176);

		if (field224 != null) {
			System.out.println("Od-cycle:" + field224.field576);
		}

		System.out.println("loop-cycle:" + field123);
		System.out.println("draw-cycle:" + field94);
		System.out.println("ptype:" + field193);
		System.out.println("psize:" + field192);

		if (field352 != null) {
			field352.method548();
		}

		field868 = true;
	}

	@ObfuscatedName("client.b(I)Ljava/awt/Component;")
	public final Component method139() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field874 != null) {
			return field874;
		}

		return this;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field874 != null) {
				return new URL("http://127.0.0.1:" + (field106 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIII)Z")
	public final boolean method140(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field173[var14][var15] = 0;
				field145[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg9;
		field173[arg7][arg9] = 99;
		field145[arg7][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field389[var18] = arg7;
		int var35 = var18 + 1;
		field390[var18] = arg9;
		boolean var20 = false;
		int var21 = field389.length;
		int[][] var22 = field98[field323].field49;
		while (var35 != var19) {
			var16 = field389[var19];
			var17 = field390[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field98[field323].method21(arg4, arg3, var16, arg1, arg10 - 1, var17)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field98[field323].method22(var16, arg10 - 1, arg1, arg4, var17, arg3)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg2 != 0 && field98[field323].method23(arg2, arg5, arg3, arg4, arg6, var16, var17)) {
				var20 = true;
				break;
			}

			int var23 = field145[var16][var17] + 1;
			if (var16 > 0 && field173[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field389[var35] = var16 - 1;
				field390[var35] = var17;
				var35 = (var35 + 1) % var21;
				field173[var16 - 1][var17] = 2;
				field145[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field173[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field389[var35] = var16 + 1;
				field390[var35] = var17;
				var35 = (var35 + 1) % var21;
				field173[var16 + 1][var17] = 8;
				field145[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field173[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field389[var35] = var16;
				field390[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field173[var16][var17 - 1] = 1;
				field145[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field173[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field389[var35] = var16;
				field390[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field173[var16][var17 + 1] = 4;
				field145[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field173[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field389[var35] = var16 - 1;
				field390[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field173[var16 - 1][var17 - 1] = 3;
				field145[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field173[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field389[var35] = var16 + 1;
				field390[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field173[var16 + 1][var17 - 1] = 9;
				field145[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field173[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field389[var35] = var16 - 1;
				field390[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field173[var16 - 1][var17 + 1] = 6;
				field145[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field173[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field389[var35] = var16 + 1;
				field390[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field173[var16 + 1][var17 + 1] = 12;
				field145[var16 + 1][var17 + 1] = var23;
			}
		}

		field456 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field145[var26][var27] < var24) {
								var24 = field145[var26][var27];
								var16 = var26;
								var17 = var27;
								field456 = 1;
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
		field389[var28] = var16;
		int var36 = var28 + 1;
		field390[var28] = var17;
		int var29;
		int var30 = var29 = field173[var16][var17];
		while (arg7 != var16 || arg9 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field389[var36] = var16;
				field390[var36++] = var17;
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

			var30 = field173[var16][var17];
		}

		if (var36 <= 0) {
			if (arg8 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field389[var36];
		int var33 = field390[var36];

		if (arg8 == 0) {
			field474.method250(12);
			field474.method251(var31 + var31 + 3);
		}

		if (arg8 == 1) {
			field474.method250(221);
			field474.method251(var31 + var31 + 3 + 14);
		}

		if (arg8 == 2) {
			field474.method250(155);
			field474.method251(var31 + var31 + 3);
		}

		field474.method285(field464 + var33);
		field503 = field389[0];
		field504 = field390[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field474.method277(field389[var36] - var32);
			field474.method277(field390[var36] - var33);
		}

		field474.method284(field463 + var32);
		field474.method277(field889[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			if (field283 >= 100) {
				method74("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = XXUUHLAE.method578(XXUUHLAE.method575(arg0));
				for (int var4 = 0; var4 < field283; var4++) {
					if (field370[var4] == arg0) {
						method74("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field190; var5++) {
					if (field443[var5] == arg0) {
						method74("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field370[field283++] = arg0;
				field249 = true;
				field474.method250(193);
				field474.method257(arg0);
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method142(int arg0) {
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

	@ObfuscatedName("client.A(I)V")
	public final void method143() {
		for (int var1 = 0; var1 < field338; var1++) {
			if (field97[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field248[var1] != field476 || field153[var1] != field477) {
						EGCCHUZS var3 = FPQKMBUX.method308(field248[var1], field153[var1]);
						if (System.currentTimeMillis() + var3.field589 / 22 > field418 / 22 + field204) {
							field418 = var3.field589;
							field204 = System.currentTimeMillis();

							if (method172(var3.field588, var3.field589)) {
								field476 = field248[var1];
								field477 = field153[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method49()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field97[var1] != -5) {
					field97[var1] = -5;
				} else {
					field338--;
					for (int var5 = var1; var5 < field338; var5++) {
						field248[var5] = field248[var5 + 1];
						field153[var5] = field153[var5 + 1];
						field97[var5] = field97[var5 + 1];
					}

					var1--;
				}
			} else {
				field97[var1]--;
			}
		}

		if (field448 > 0) {
			field448 -= 20;
			if (field448 < 0) {
				field448 = 0;
			}

			if (field448 == 0 && field444 && !field108) {
				field501 = field305;
				field502 = true;
				field224.method228(2, field501);
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public static final void method144() {
		KYNTOGBR.field893 = false;
		PNDPOZTD.field1148 = false;
		field108 = false;
		LVLPWFEX.field1076 = false;
		HGKOLOPU.field711 = false;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method145() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IIB)Ljava/lang/String;")
	public static final String method146(int arg0, int arg1) {
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

	public final void run() {
		if (field343) {
			method128();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method147() {
		signlink.reporterror = false;

		try {
			if (field352 != null) {
				field352.method543();
			}
		} catch (Exception var1) {
		}

		field352 = null;
		method145();

		if (field264 != null) {
			field264.field650 = false;
		}

		field264 = null;
		field224.method243();
		field224 = null;
		field420 = null;
		field474 = null;
		field366 = null;
		field170 = null;
		field308 = null;
		field321 = null;
		field282 = null;
		field309 = null;
		field310 = null;
		field341 = null;
		field392 = null;
		field178 = null;
		field98 = null;
		field173 = null;
		field145 = null;
		field389 = null;
		field390 = null;
		field113 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field319 = null;
		field205 = null;
		field206 = null;
		field207 = null;
		field124 = null;
		field125 = null;
		field126 = null;
		field127 = null;
		field128 = null;
		field129 = null;
		field130 = null;
		field131 = null;
		field132 = null;
		field344 = null;
		field345 = null;
		field346 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field378 = null;
		field379 = null;
		field380 = null;
		field381 = null;
		field382 = null;
		field383 = null;
		field424 = null;
		field425 = null;
		field426 = null;
		field427 = null;
		field428 = null;
		field122 = null;
		field417 = null;
		field387 = null;
		field436 = null;
		field433 = null;
		field267 = null;
		field358 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field142 = null;
		field143 = null;
		field336 = null;
		field225 = null;
		field369 = null;
		field228 = null;
		field230 = null;
		field232 = null;
		field233 = null;
		field459 = null;
		field421 = null;
		field423 = null;
		field468 = null;
		field320 = null;
		field329 = null;
		field371 = null;
		field235 = null;
		field236 = null;
		field237 = null;
		field238 = null;
		field348 = null;
		field95 = null;
		field240 = null;
		field241 = null;
		field133 = null;
		field505 = null;
		field510 = null;
		field443 = null;
		field121 = null;
		field399 = null;
		field400 = null;
		field396 = null;
		field397 = null;
		field398 = null;
		field401 = null;
		field402 = null;
		field403 = null;
		field404 = null;
		method173();
		HGKOLOPU.method327();
		AUWOQLEO.method10();
		WMJBOJYO.method563();
		LORGYGVM.method470();
		GLVFVUWP.field669 = null;
		ZWYXHQWS.field1507 = null;
		VMOOYUKZ.field1361 = null;
		BZONLWPM.field53 = null;
		VCTVXSNH.field1348 = null;
		VCTVXSNH.field1360 = null;
		GBMZYMFW.field653 = null;
		field872 = null;
		QAJCAYDZ.field1247 = null;
		PNDPOZTD.method502();
		KYNTOGBR.method413();
		IGXVZOHI.method350();
		ICYGYVTE.method347();
		System.gc();
	}

	@ObfuscatedName("client.a(IIIILLORGYGVM;)V")
	public final void method148(int arg0, int arg1, int arg2, LORGYGVM arg3) {
		if (arg3.field1009 == 0 && arg3.field1031 != null && (!arg3.field1003 || field475 == arg3.field1023 || field277 == arg3.field1023 || field91 == arg3.field1023)) {
			int var5 = JOVUNXBE.field855;
			int var6 = JOVUNXBE.field853;
			int var7 = JOVUNXBE.field856;
			int var8 = JOVUNXBE.field854;
			JOVUNXBE.method382(arg3.field1022 + arg2, arg2, arg0, arg3.field1046 + arg0);
			int var9 = arg3.field1031.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field983[var10] + arg2;
				int var12 = arg3.field989[var10] + arg0 - arg1;
				LORGYGVM var13 = LORGYGVM.method477(arg3.field1031[var10]);
				var11 += var13.field1047;
				var12 += var13.field1038;

				if (var13.field1021 > 0) {
					method84(var13);
				}

				if (var13.field1009 == 0) {
					if (var13.field991 > var13.field1012 - var13.field1046) {
						var13.field991 = var13.field1012 - var13.field1046;
					}

					if (var13.field991 < 0) {
						var13.field991 = 0;
					}

					method148(var12, var13.field991, var11, var13);

					if (var13.field1012 > var13.field1046) {
						method46(var13.field1046, var13.field1012, var13.field991, var12, var13.field1022 + var11);
					}
				} else if (var13.field1009 != 1) {
					if (var13.field1009 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1046; var15++) {
							for (int var16 = 0; var16 < var13.field1022; var16++) {
								int var17 = (var13.field1043 + 32) * var16 + var11;
								int var18 = (var13.field1042 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1026[var14];
									var18 += var13.field1008[var14];
								}

								if (var13.field1007[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1007[var14] - 1;
									if (var17 > JOVUNXBE.field855 - 32 && var17 < JOVUNXBE.field856 && var18 > JOVUNXBE.field853 - 32 && var18 < JOVUNXBE.field854 || field302 != 0 && field301 == var14) {
										int var22 = 0;
										if (field182 == 1 && field183 == var14 && field184 == var13.field1023) {
											var22 = 0xFFFFFF;
										}

										HOSNGCXH var23 = WMJBOJYO.method567(var22, var13.field1030[var14], var21);
										if (var23 != null) {
											if (field302 != 0 && field301 == var14 && field300 == var13.field1023) {
												var19 = field879 - field303;
												var20 = field880 - field304;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field484 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method337(128, var17 + var19, var18 + var20);

												if (var18 + var20 < JOVUNXBE.field853 && arg3.field991 > 0) {
													int var24 = (JOVUNXBE.field853 - var18 - var20) * field93 / 3;
													if (var24 > field93 * 10) {
														var24 = field93 * 10;
													}

													if (var24 > arg3.field991) {
														var24 = arg3.field991;
													}

													arg3.field991 -= var24;
													field304 += var24;
												}

												if (var18 + var20 + 32 > JOVUNXBE.field854 && arg3.field991 < arg3.field1012 - arg3.field1046) {
													int var25 = (var18 + var20 + 32 - JOVUNXBE.field854) * field93 / 3;
													if (var25 > field93 * 10) {
														var25 = field93 * 10;
													}

													if (var25 > arg3.field1012 - arg3.field1046 - arg3.field991) {
														var25 = arg3.field1012 - arg3.field1046 - arg3.field991;
													}

													arg3.field991 += var25;
													field304 -= var25;
												}
											} else if (field256 != 0 && field255 == var14 && field254 == var13.field1023) {
												var23.method337(128, var17, var18);
											} else {
												var23.method335(var18, var17);
											}

											if (var23.field736 == 33 || var13.field1030[var14] != 1) {
												int var26 = var13.field1030[var14];
												field162.method530(var18 + var20 + 10, method42(var26), var17 + var19 + 1, 0);
												field162.method530(var18 + var20 + 9, method42(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field981 != null && var14 < 20) {
									HOSNGCXH var27 = var13.field981[var14];
									if (var27 != null) {
										var27.method335(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1009 == 3) {
						boolean var28 = false;
						if (field91 == var13.field1023 || field277 == var13.field1023 || field475 == var13.field1023) {
							var28 = true;
						}

						int var29;
						if (method115(var13)) {
							var29 = var13.field1017;
							if (var28 && var13.field1033 != 0) {
								var29 = var13.field1033;
							}
						} else {
							var29 = var13.field1037;
							if (var28 && var13.field993 != 0) {
								var29 = var13.field993;
							}
						}

						if (var13.field1010 == 0) {
							if (var13.field1041) {
								JOVUNXBE.method385(var12, var13.field1022, var13.field1046, var11, var29);
							} else {
								JOVUNXBE.method386(var13.field1022, var13.field1046, var29, var11, var12);
							}
						} else if (var13.field1041) {
							JOVUNXBE.method384(256 - (var13.field1010 & 0xFF), var13.field1022, var12, var13.field1046, var11, var29);
						} else {
							JOVUNXBE.method387(var13.field1046, var12, var29, var13.field1022, 256 - (var13.field1010 & 0xFF), var11);
						}
					} else if (var13.field1009 == 4) {
						RLQTDOAP var30 = var13.field1034;
						String var31 = var13.field1051;
						boolean var32 = false;
						if (field91 == var13.field1023 || field277 == var13.field1023 || field475 == var13.field1023) {
							var32 = true;
						}

						int var33;
						if (method115(var13)) {
							var33 = var13.field1017;
							if (var32 && var13.field1033 != 0) {
								var33 = var13.field1033;
							}

							if (var13.field992.length() > 0) {
								var31 = var13.field992;
							}
						} else {
							var33 = var13.field1037;
							if (var32 && var13.field993 != 0) {
								var33 = var13.field993;
							}
						}

						if (var13.field1027 == 6 && field82) {
							var31 = "Please wait...";
							var33 = var13.field1037;
						}

						if (JOVUNXBE.field851 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1274 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method72(method125(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method72(method125(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method72(method125(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method72(method125(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method72(method125(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method527(var34, var33, var13.field1022 / 2 + var11, var13.field1024, var41);
							} else {
								var30.method534(var41, var33, var34, var11, var13.field1024);
							}

							var34 += var30.field1274;
						}
					} else if (var13.field1009 == 5) {
						HOSNGCXH var42;
						if (method115(var13)) {
							var42 = var13.field996;
						} else {
							var42 = var13.field1035;
						}

						if (var42 != null) {
							var42.method335(var12, var11);
						}
					} else if (var13.field1009 == 6) {
						int var43 = PNDPOZTD.field1153;
						int var44 = PNDPOZTD.field1154;
						PNDPOZTD.field1153 = var13.field1022 / 2 + var11;
						PNDPOZTD.field1154 = var13.field1046 / 2 + var12;
						int var45 = PNDPOZTD.field1157[var13.field999] * var13.field998 >> 16;
						int var46 = PNDPOZTD.field1158[var13.field999] * var13.field998 >> 16;
						boolean var47 = method115(var13);
						int var48;
						if (var47) {
							var48 = var13.field1020;
						} else {
							var48 = var13.field1019;
						}

						IGXVZOHI var49;
						if (var48 == -1) {
							var49 = var13.method469(-1, -1, var47);
						} else {
							BZONLWPM var50 = BZONLWPM.field53[var48];
							var49 = var13.method469(var50.field56[var13.field997], var50.field55[var13.field997], var47);
						}

						if (var49 != null) {
							var49.method374(0, var13.field1000, 0, var13.field999, 0, var45, var46);
						}

						PNDPOZTD.field1153 = var43;
						PNDPOZTD.field1154 = var44;
					} else {
						if (var13.field1009 == 7) {
							RLQTDOAP var51 = var13.field1034;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1046; var53++) {
								for (int var54 = 0; var54 < var13.field1022; var54++) {
									if (var13.field1007[var52] > 0) {
										WMJBOJYO var55 = WMJBOJYO.method560(var13.field1007[var52] - 1);
										String var56 = var55.field1419;
										if (var55.field1398 || var13.field1030[var52] != 1) {
											var56 = var56 + " x" + method142(var13.field1030[var52]);
										}

										int var57 = (var13.field1043 + 115) * var54 + var11;
										int var58 = (var13.field1042 + 12) * var53 + var12;
										if (var13.field1001) {
											var51.method527(var58, var13.field1037, var13.field1022 / 2 + var57, var13.field1024, var56);
										} else {
											var51.method534(var56, var13.field1037, var58, var57, var13.field1024);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1009 == 8 && (field388 == var13.field1023 || field480 == var13.field1023 || field391 == var13.field1023) && field506 == 100) {
							int var59 = 0;
							int var60 = 0;
							RLQTDOAP var61 = field163;
							String var62 = var13.field1051;
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

								int var65 = var61.method528(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1274 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1022 + var11 - var59 - 5;
							int var67 = var13.field1046 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field1022 + arg2) {
								var66 = arg3.field1022 + arg2 - var59;
							}

							JOVUNXBE.method385(var67, var59, var60, var66, 0xFFFFA0);
							JOVUNXBE.method386(var59, var60, 0, var66, var67);
							String var68 = var13.field1051;
							int var69 = var61.field1274 + var67 + 2;
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

								var61.method534(var71, 0, var69, var66 + 3, false);
								var69 += var61.field1274 + 1;
							}
						}
					}
				}
			}

			JOVUNXBE.method382(var7, var5, var6, var8);
		}
	}

	@ObfuscatedName("client.a(ILHOSNGCXH;BI)V")
	public final void method149(int arg0, HOSNGCXH arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field88 + field430 & 0x7FF;
			int var6 = IGXVZOHI.field841[var5];
			int var7 = IGXVZOHI.field842[var5];
			var6 = var6 * 256 / (field134 + 256);
			var7 = var7 * 256 / (field134 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field354.method340(15, 15, var12 + 94 + 4 - 10, var10, 20, 256, 83 - var13 - 20, 20);
		} else {
			method79(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method150() {
		if (field284 || field136 || field409) {
			method82();
		} else {
			field94++;

			if (field470) {
				method67();
			} else {
				method93(false);
			}

			field442 = 0;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method151() {
		method92("Starting up", 20);

		if (signlink.sunjava) {
			field865 = 5;
		}

		if (field335) {
			field284 = true;
		} else {
			field335 = true;
			boolean var1 = false;
			String var2 = method55();
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
						field486[var3] = new EEVNVHNQ(var3 + 1, signlink.cache_idx[var3], signlink.cache_dat, 500000);
					}
				}

				try {
					method36();
					field208 = method113("title screen", field342[1], 25, 1, "title");
					field162 = new RLQTDOAP(false, "p11_full", field208);
					field163 = new RLQTDOAP(false, "p12_full", field208);
					field164 = new RLQTDOAP(false, "b12_full", field208);
					field165 = new RLQTDOAP(true, "q8_full", field208);
					method155();
					method121();
					TKEGJSFV var4 = method113("config", field342[2], 30, 2, "config");
					TKEGJSFV var5 = method113("interface", field342[3], 35, 3, "interface");
					TKEGJSFV var6 = method113("2d graphics", field342[4], 40, 4, "media");
					TKEGJSFV var7 = method113("textures", field342[6], 45, 6, "textures");
					TKEGJSFV var8 = method113("chat system", field342[7], 50, 7, "wordenc");
					TKEGJSFV var9 = method113("sound effects", field342[8], 55, 8, "sounds");
					field392 = new byte[4][104][104];
					field341 = new int[4][105][105];
					field178 = new KYNTOGBR(field341, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field98[var10] = new BXNXROZD(104, 104);
					}

					field505 = new HOSNGCXH(512, 512);
					TKEGJSFV var11 = method113("update list", field342[5], 60, 5, "versionlist");
					method92("Connecting to update server", 60);
					field224 = new DHNAQSHE();
					field224.method230(var11, this);
					ICYGYVTE.method345(field224.method224());
					IGXVZOHI.method351(field224.method239(0), field224);

					if (!field108) {
						field501 = 0;
						field502 = true;
						field224.method228(2, field501);

						while (field224.method233() > 0) {
							method162();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field224.field570 > 3) {
								method97("ondemand");
								return;
							}
						}
					}

					method92("Requesting animations", 65);
					int var12 = field224.method239(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field224.method228(1, var13);
					}

					while (field224.method233() > 0) {
						int var14 = var12 - field224.method233();
						if (var14 > 0) {
							method92("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method162();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field224.field570 > 3) {
							method97("ondemand");
							return;
						}
					}

					method92("Requesting models", 70);
					int var15 = field224.method239(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field224.method232(var16);
						if ((var17 & 0x1) != 0) {
							field224.method228(0, var16);
						}
					}

					int var18 = field224.method233();
					while (field224.method233() > 0) {
						int var19 = var18 - field224.method233();
						if (var19 > 0) {
							method92("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method162();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field486[0] != null) {
						method92("Requesting maps", 75);
						field224.method228(3, field224.method227(0, 48, 47));
						field224.method228(3, field224.method227(1, 48, 47));
						field224.method228(3, field224.method227(0, 48, 48));
						field224.method228(3, field224.method227(1, 48, 48));
						field224.method228(3, field224.method227(0, 48, 49));
						field224.method228(3, field224.method227(1, 48, 49));
						field224.method228(3, field224.method227(0, 47, 47));
						field224.method228(3, field224.method227(1, 47, 47));
						field224.method228(3, field224.method227(0, 47, 48));
						field224.method228(3, field224.method227(1, 47, 48));
						field224.method228(3, field224.method227(0, 148, 48));
						field224.method228(3, field224.method227(1, 148, 48));
						int var20 = field224.method233();
						while (field224.method233() > 0) {
							int var21 = var20 - field224.method233();
							if (var21 > 0) {
								method92("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method162();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field224.method239(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field224.method232(var23);
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
							field224.method231(0, var23, var25);
						}
					}

					field224.method241(field107);

					if (!field108) {
						int var26 = field224.method239(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field224.method225(var27)) {
								field224.method231(2, var27, (byte) 1);
							}
						}
					}

					method92("Unpacking media", 80);
					field344 = new DGXCFOYI(var6, "invback", 0);
					field346 = new DGXCFOYI(var6, "chatback", 0);
					field345 = new DGXCFOYI(var6, "mapback", 0);
					field285 = new DGXCFOYI(var6, "backbase1", 0);
					field286 = new DGXCFOYI(var6, "backbase2", 0);
					field287 = new DGXCFOYI(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field378[var28] = new DGXCFOYI(var6, "sideicons", var28);
					}

					field122 = new HOSNGCXH(var6, "compass", 0);
					field354 = new HOSNGCXH(var6, "mapedge", 0);
					field354.method332();

					for (int var29 = 0; var29 < 72; var29++) {
						field336[var29] = new DGXCFOYI(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field225[var30] = new HOSNGCXH(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field417[var31] = new HOSNGCXH(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field387[var32] = new HOSNGCXH(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field436[var33] = new HOSNGCXH(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field433[var34] = new HOSNGCXH(var6, "headicons_hint", var34);
					}

					field358 = new HOSNGCXH(var6, "overlay_multiway", 0);
					field481 = new HOSNGCXH(var6, "mapmarker", 0);
					field482 = new HOSNGCXH(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field267[var35] = new HOSNGCXH(var6, "cross", var35);
					}

					field139 = new HOSNGCXH(var6, "mapdots", 0);
					field140 = new HOSNGCXH(var6, "mapdots", 1);
					field141 = new HOSNGCXH(var6, "mapdots", 2);
					field142 = new HOSNGCXH(var6, "mapdots", 3);
					field143 = new HOSNGCXH(var6, "mapdots", 4);
					field168 = new DGXCFOYI(var6, "scrollbar", 0);
					field169 = new DGXCFOYI(var6, "scrollbar", 1);
					field379 = new DGXCFOYI(var6, "redstone1", 0);
					field380 = new DGXCFOYI(var6, "redstone2", 0);
					field381 = new DGXCFOYI(var6, "redstone3", 0);
					field382 = new DGXCFOYI(var6, "redstone1", 0);
					field382.method180();
					field383 = new DGXCFOYI(var6, "redstone2", 0);
					field383.method180();
					field424 = new DGXCFOYI(var6, "redstone1", 0);
					field424.method181();
					field425 = new DGXCFOYI(var6, "redstone2", 0);
					field425.method181();
					field426 = new DGXCFOYI(var6, "redstone3", 0);
					field426.method181();
					field427 = new DGXCFOYI(var6, "redstone1", 0);
					field427.method180();
					field427.method181();
					field428 = new DGXCFOYI(var6, "redstone2", 0);
					field428.method180();
					field428.method181();

					for (int var36 = 0; var36 < 2; var36++) {
						field99[var36] = new DGXCFOYI(var6, "mod_icons", var36);
					}

					HOSNGCXH var37 = new HOSNGCXH(var6, "backleft1", 0);
					field124 = new YJGBGRIO(method139(), var37.field732, var37.field733);
					var37.method333(0, 0);
					HOSNGCXH var38 = new HOSNGCXH(var6, "backleft2", 0);
					field125 = new YJGBGRIO(method139(), var38.field732, var38.field733);
					var38.method333(0, 0);
					HOSNGCXH var39 = new HOSNGCXH(var6, "backright1", 0);
					field126 = new YJGBGRIO(method139(), var39.field732, var39.field733);
					var39.method333(0, 0);
					HOSNGCXH var40 = new HOSNGCXH(var6, "backright2", 0);
					field127 = new YJGBGRIO(method139(), var40.field732, var40.field733);
					var40.method333(0, 0);
					HOSNGCXH var41 = new HOSNGCXH(var6, "backtop1", 0);
					field128 = new YJGBGRIO(method139(), var41.field732, var41.field733);
					var41.method333(0, 0);
					HOSNGCXH var42 = new HOSNGCXH(var6, "backvmid1", 0);
					field129 = new YJGBGRIO(method139(), var42.field732, var42.field733);
					var42.method333(0, 0);
					HOSNGCXH var43 = new HOSNGCXH(var6, "backvmid2", 0);
					field130 = new YJGBGRIO(method139(), var43.field732, var43.field733);
					var43.method333(0, 0);
					HOSNGCXH var44 = new HOSNGCXH(var6, "backvmid3", 0);
					field131 = new YJGBGRIO(method139(), var44.field732, var44.field733);
					var44.method333(0, 0);
					HOSNGCXH var45 = new HOSNGCXH(var6, "backhmid2", 0);
					field132 = new YJGBGRIO(method139(), var45.field732, var45.field733);
					var45.method333(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field225[var50] != null) {
							field225[var50].method331(var47 + var49, var46 + var49, var48 + var49);
						}

						if (field336[var50] != null) {
							field336[var50].method182(var47 + var49, var46 + var49, var48 + var49);
						}
					}

					method92("Unpacking textures", 83);
					PNDPOZTD.method507(var7);
					PNDPOZTD.method511(0.8D);
					PNDPOZTD.method506(20);
					method92("Unpacking config", 86);
					BZONLWPM.method26(var4);
					HGKOLOPU.method323(var4);
					GLVFVUWP.method315(var4);
					WMJBOJYO.method561(var4);
					AUWOQLEO.method8(var4);
					ZWYXHQWS.method595(var4);
					VCTVXSNH.method553(var4);
					GBMZYMFW.method313(var4);
					EMWMNDZQ.method299(var4);
					WMJBOJYO.field1391 = field107;

					if (!field108) {
						method92("Unpacking sounds", 90);
						byte[] var51 = var9.method542("sounds.dat", null);
						EGCCHUZS var52 = new EGCCHUZS(var51);
						FPQKMBUX.method307(var52);
					}

					method92("Unpacking interfaces", 95);
					RLQTDOAP[] var53 = new RLQTDOAP[] { field162, field163, field164, field165 };
					LORGYGVM.method475(var5, var6, var53);
					method92("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field345.field529[field345.field531 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field485[var54] = var55;
						field188[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field345.field529[field345.field531 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field351[var58 - 5] = var59 - 25;
						field311[var58 - 5] = var60 - var59;
					}

					PNDPOZTD.method504(765, 503);
					field500 = PNDPOZTD.field1159;
					PNDPOZTD.method504(479, 96);
					field497 = PNDPOZTD.field1159;
					PNDPOZTD.method504(190, 261);
					field498 = PNDPOZTD.field1159;
					PNDPOZTD.method504(512, 334);
					field499 = PNDPOZTD.field1159;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = PNDPOZTD.field1157[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					KYNTOGBR.method450(512, 334, 500, var62, 800);
					DHIKSAEW.method185(var8);
					field264 = new GAUMGPFH(this);
					method51(field264, 10);
					WFUJSESJ.field1377 = this;
					HGKOLOPU.field703 = this;
					AUWOQLEO.field29 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field159 + " " + field111);
					field136 = true;
				}
			} else {
				field409 = true;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method152(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field392[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field341[var6][var4][var5] + field341[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field341[var6][var4][var5 + 1] + field341[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(BII)V")
	public final void method153(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field493[var4] != null) {
				int var5 = field491[var4];
				int var6 = field307 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field492[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field440 == 0 || field440 == 1 && method91(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field223.field1255)) {
						if (field266 >= 1) {
							field348[field487] = "Report abuse @whi@" + var7;
							field237[field487] = 440;
							field487++;
						}

						field348[field487] = "Add ignore @whi@" + var7;
						field237[field487] = 539;
						field487++;
						field348[field487] = "Add friend @whi@" + var7;
						field237[field487] = 342;
						field487++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field273 == 0 && (var5 == 7 || field325 == 0 || field325 == 1 && method91(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field266 >= 1) {
							field348[field487] = "Report abuse @whi@" + var7;
							field237[field487] = 440;
							field487++;
						}

						field348[field487] = "Add ignore @whi@" + var7;
						field237[field487] = 539;
						field487++;
						field348[field487] = "Add friend @whi@" + var7;
						field237[field487] = 342;
						field487++;
					}

					var3++;
				}

				if (var5 == 4 && (field339 == 0 || field339 == 1 && method91(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field348[field487] = "Accept trade @whi@" + var7;
						field237[field487] = 768;
						field487++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field273 == 0 && field325 < 2) {
					var3++;
				}

				if (var5 == 8 && (field339 == 0 || field339 == 1 && method91(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field348[field487] = "Accept challenge @whi@" + var7;
						field237[field487] = 443;
						field487++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method154() {
		int var1 = field164.method528("Choose Option");
		for (int var2 = 0; var2 < field487; var2++) {
			int var3 = field164.method528(field348[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field487 * 15 + 21;
		if (field886 > 4 && field887 > 4 && field886 < 516 && field887 < 338) {
			int var5 = field886 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field887 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field469 = true;
			field410 = 0;
			field411 = var5;
			field412 = var6;
			field413 = var1;
			field414 = field487 * 15 + 22;
		}

		if (field886 > 553 && field887 > 205 && field886 < 743 && field887 < 466) {
			int var7 = field886 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field887 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field469 = true;
			field410 = 1;
			field411 = var7;
			field412 = var8;
			field413 = var1;
			field414 = field487 * 15 + 22;
		}

		if (field886 > 17 && field887 > 357 && field886 < 496 && field887 < 453) {
			int var9 = field886 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field887 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field469 = true;
			field410 = 2;
			field411 = var9;
			field412 = var10;
			field413 = var1;
			field414 = field487 * 15 + 22;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method155() {
		byte[] var1 = field208.method542("title.dat", null);
		HOSNGCXH var2 = new HOSNGCXH(var1, this);
		field399.method580();
		var2.method333(0, 0);
		field400.method580();
		var2.method333(-637, 0);
		field396.method580();
		var2.method333(-128, 0);
		field397.method580();
		var2.method333(-202, -371);
		field398.method580();
		var2.method333(-202, -171);
		field401.method580();
		var2.method333(0, -265);
		field402.method580();
		var2.method333(-562, -265);
		field403.method580();
		var2.method333(-128, -171);
		field404.method580();
		var2.method333(-562, -171);
		int[] var3 = new int[var2.field732];
		for (int var4 = 0; var4 < var2.field733; var4++) {
			for (int var5 = 0; var5 < var2.field732; var5++) {
				var3[var5] = var2.field731[var2.field732 * var4 + var2.field732 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field732; var6++) {
				var2.field731[var2.field732 * var4 + var6] = var3[var6];
			}
		}

		field399.method580();
		var2.method333(382, 0);
		field400.method580();
		var2.method333(-255, 0);
		field396.method580();
		var2.method333(254, 0);
		field397.method580();
		var2.method333(180, -371);
		field398.method580();
		var2.method333(180, -171);
		field401.method580();
		var2.method333(382, -265);
		field402.method580();
		var2.method333(-180, -265);
		field403.method580();
		var2.method333(254, -171);
		field404.method580();
		var2.method333(-180, -171);
		HOSNGCXH var7 = new HOSNGCXH(field208, "logo", 0);
		field396.method580();
		var7.method335(18, 382 - var7.field732 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ILAUWOQLEO;IZI)V")
	public final void method156(int arg0, AUWOQLEO arg1, int arg2, int arg3) {
		if (field487 < 400) {
			if (arg1.field19 != null) {
				arg1 = arg1.method6();
			}

			if (arg1 != null && arg1.field10) {
				String var5 = arg1.field33;
				if (arg1.field40 != 0) {
					var5 = var5 + method146(arg1.field40, field223.field1260) + " (level-" + arg1.field40 + ")";
				}

				if (field182 == 1) {
					field348[field487] = "Use " + field186 + " with @yel@" + var5;
					field237[field487] = 280;
					field238[field487] = arg0;
					field235[field487] = arg2;
					field236[field487] = arg3;
					field487++;
				} else if (field372 != 1) {
					if (arg1.field35 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field35[var6] != null && !arg1.field35[var6].equalsIgnoreCase("attack")) {
								field348[field487] = arg1.field35[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field237[field487] = 58;
								}

								if (var6 == 1) {
									field237[field487] = 9;
								}

								if (var6 == 2) {
									field237[field487] = 97;
								}

								if (var6 == 3) {
									field237[field487] = 703;
								}

								if (var6 == 4) {
									field237[field487] = 50;
								}

								field238[field487] = arg0;
								field235[field487] = arg2;
								field236[field487] = arg3;
								field487++;
							}
						}
					}

					if (arg1.field35 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field35[var7] != null && arg1.field35[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field40 > field223.field1260) {
									var8 = 2000;
								}

								field348[field487] = arg1.field35[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field237[field487] = var8 + 58;
								}

								if (var7 == 1) {
									field237[field487] = var8 + 9;
								}

								if (var7 == 2) {
									field237[field487] = var8 + 97;
								}

								if (var7 == 3) {
									field237[field487] = var8 + 703;
								}

								if (var7 == 4) {
									field237[field487] = var8 + 50;
								}

								field238[field487] = arg0;
								field235[field487] = arg2;
								field236[field487] = arg3;
								field487++;
							}
						}
					}

					field348[field487] = "Examine @yel@" + var5;
					field237[field487] = 1787;
					field238[field487] = arg0;
					field235[field487] = arg2;
					field236[field487] = arg3;
					field487++;
				} else if ((field374 & 0x2) == 2) {
					field348[field487] = field375 + " @yel@" + var5;
					field237[field487] = 734;
					field238[field487] = arg0;
					field235[field487] = arg2;
					field236[field487] = arg3;
					field487++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method157() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field445[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field445[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field446[var10] = (field445[var10 - 1] + field445[var10 + 1] + field445[var10 - 128] + field445[var10 + 128]) / 4;
			}
		}

		field447 += 128;
		if (field447 > field268.length) {
			field447 -= field268.length;
			int var11 = (int) (Math.random() * 12.0D);
			method31(field514[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field446[var14 + 128] - field268[field447 + var14 & field268.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field445[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field385[var16] = field385[var16 + 1];
		}

		field385[var1 - 1] = (int) (Math.sin(field123 / 14.0D) * 16.0D + Math.sin(field123 / 15.0D) * 14.0D + Math.sin(field123 / 16.0D) * 12.0D);

		if (field326 > 0) {
			field326 -= 4;
		}

		if (field327 > 0) {
			field327 -= 4;
		}

		if (field326 == 0 && field327 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field326 = 1024;
			}

			if (var17 == 1) {
				field327 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method158(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field103 = "";
				field104 = "Connecting to server...";
				method93(true);
			}

			field352 = new UFCPVKNJ(method47(field106 + 43594), this);
			long var4 = XXUUHLAE.method574(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field474.field589 = 0;
			field474.method251(14);
			field474.method251(var6);
			field352.method547(field474.field588, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field352.method544();
			}

			int var8 = field352.method544();
			int var9 = var8;

			if (var8 == 0) {
				field352.method546(field170.field588, 0, 8);
				field170.field589 = 0;
				field150 = field170.method267();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field150 >> 32), (int) field150 };
				field474.field589 = 0;
				field474.method251(10);
				field474.method255(var10[0]);
				field474.method255(var10[1]);
				field474.method255(var10[2]);
				field474.method255(var10[3]);
				field474.method255(signlink.uid);
				field474.method258(arg0);
				field474.method258(arg1);
				field474.method276(field265, field275);
				field366.field589 = 0;

				if (arg2) {
					field366.method251(18);
				} else {
					field366.method251(16);
				}

				field366.method251(field474.field589 + 36 + 1 + 1 + 2);
				field366.method251(255);
				field366.method252(346);
				field366.method251(field108 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field366.method255(field342[var11]);
				}

				field366.method259(field474.field588, 0, field474.field589);
				field474.field593 = new QHNACLRF(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field242 = new QHNACLRF(var10);
				field352.method547(field366.field588, field366.field589, 0);
				var8 = field352.method544();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method158(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field266 = field352.method544();
				field167 = field352.method544() == 1;
				field221 = 0L;
				field314 = 0;
				field264.field651 = 0;
				field876 = true;
				field365 = true;
				field470 = true;
				field474.field589 = 0;
				field170.field589 = 0;
				field193 = -1;
				field155 = -1;
				field156 = -1;
				field157 = -1;
				field192 = 0;
				field194 = 0;
				field507 = 0;
				field196 = 0;
				field261 = 0;
				field487 = 0;
				field469 = false;
				field877 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field493[var13] = null;
				}

				field182 = 0;
				field372 = 0;
				field152 = 0;
				field338 = 0;
				field461 = (int) (Math.random() * 100.0D) - 50;
				field519 = (int) (Math.random() * 110.0D) - 55;
				field199 = (int) (Math.random() * 80.0D) - 40;
				field88 = (int) (Math.random() * 120.0D) - 60;
				field134 = (int) (Math.random() * 30.0D) - 20;
				field430 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field350 = 0;
				field270 = -1;
				field503 = 0;
				field504 = 0;
				field229 = 0;
				field422 = 0;

				for (int var14 = 0; var14 < field226; var14++) {
					field228[var14] = null;
					field233[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field421[var15] = null;
				}

				field223 = field228[field227] = new QAJCAYDZ();
				field329.method399();
				field371.method399();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field468[var16][var17][var18] = null;
						}
					}
				}

				field320 = new JQSVNFRT();
				field191 = 0;
				field190 = 0;
				method53(field415);
				field415 = -1;
				method53(field271);
				field271 = -1;
				method53(field222);
				field222 = -1;
				method53(field368);
				field368 = -1;
				method53(field355);
				field355 = -1;
				method53(field306);
				field306 = -1;
				method53(field490);
				field490 = -1;
				field82 = false;
				field100 = 3;
				field441 = 0;
				field469 = false;
				field460 = false;
				field478 = null;
				field246 = 0;
				field137 = -1;
				field234 = true;
				method170();

				for (int var19 = 0; var19 < 5; var19++) {
					field377[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field297[var20] = null;
					field298[var20] = false;
				}

				field419 = 0;
				field92 = 0;
				field349 = 0;
				field315 = 0;
				field109 = 0;
				method73();
			} else if (var8 == 3) {
				field103 = "";
				field104 = "Invalid username or password.";
			} else if (var8 == 4) {
				field103 = "Your account has been disabled.";
				field104 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field103 = "Your account is already logged in.";
				field104 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field103 = "RuneScape has been updated!";
				field104 = "Please reload this page.";
			} else if (var8 == 7) {
				field103 = "This world is full.";
				field104 = "Please use a different world.";
			} else if (var8 == 8) {
				field103 = "Unable to connect.";
				field104 = "Login server offline.";
			} else if (var8 == 9) {
				field103 = "Login limit exceeded.";
				field104 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field103 = "Unable to connect.";
				field104 = "Bad session id.";
			} else if (var8 == 11) {
				field103 = "Login server rejected session.";
				field104 = "Please try again.";
			} else if (var8 == 12) {
				field103 = "You need a members account to login to this world.";
				field104 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field103 = "Could not complete login.";
				field104 = "Please try using a different world.";
			} else if (var8 == 14) {
				field103 = "The server is being updated.";
				field104 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field470 = true;
				field474.field589 = 0;
				field170.field589 = 0;
				field193 = -1;
				field155 = -1;
				field156 = -1;
				field157 = -1;
				field192 = 0;
				field194 = 0;
				field507 = 0;
				field487 = 0;
				field469 = false;
				field116 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field103 = "Login attempts exceeded.";
				field104 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field103 = "You are standing in a members-only area.";
				field104 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field103 = "Invalid loginserver requested";
				field104 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field352.method544();
				for (var21 += 3; var21 >= 0; var21--) {
					field103 = "You have only just left another world";
					field104 = "Your profile will be transferred in: " + var21;
					method93(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method158(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field103 = "Malformed login packet.";
				field104 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field103 = "Unexpected server response";
				field104 = "Please try using a different world.";
			} else if (var9 != 0) {
				field103 = "No response from server";
				field104 = "Please try using a different world.";
			} else if (field347 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field347++;
				method158(arg0, arg1, arg2);
			} else {
				field103 = "No response from loginserver";
				field104 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field103 = "";
			field104 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method159() {
		field474.method250(243);

		if (field306 != -1) {
			method53(field306);
			field306 = -1;
			field249 = true;
			field82 = false;
			field158 = true;
		}

		if (field271 != -1) {
			method53(field271);
			field271 = -1;
			field322 = true;
			field82 = false;
		}

		if (field368 != -1) {
			method53(field368);
			field368 = -1;
			field149 = true;
		}

		if (field355 != -1) {
			method53(field355);
			field355 = -1;
		}

		if (field222 != -1) {
			method53(field222);
			field222 = -1;
		}
	}

	@ObfuscatedName("client.a(ILSZJROHQV;)V")
	public final void method160(SZJROHQV arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1286 == 0) {
			var2 = field178.method440(arg0.field1285, arg0.field1287, arg0.field1288);
		}

		if (arg0.field1286 == 1) {
			var2 = field178.method441(arg0.field1288, arg0.field1287, arg0.field1285);
		}

		if (arg0.field1286 == 2) {
			var2 = field178.method442(arg0.field1285, arg0.field1287, arg0.field1288);
		}

		if (arg0.field1286 == 3) {
			var2 = field178.method443(arg0.field1285, arg0.field1287, arg0.field1288);
		}

		if (var2 != 0) {
			int var6 = field178.method444(arg0.field1285, arg0.field1287, arg0.field1288, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1282 = var3;
		arg0.field1284 = var4;
		arg0.field1283 = var5;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method161() {
		try {
			field270 = -1;
			field371.method399();
			field329.method399();
			field220++;
			if (field220 > 65) {
				field220 = 0;
				field474.method250(203);
			}

			PNDPOZTD.method505();
			method59();
			field178.method414();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field98[var1].method12();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field392[var2][var3][var4] = 0;
					}
				}
			}

			LVLPWFEX var5 = new LVLPWFEX(field341, 104, 104, field392);
			int var6 = field321.length;
			field474.method250(121);

			if (!field161) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field308[var7] >> 8) * 64 - field463;
					int var9 = (field308[var7] & 0xFF) * 64 - field464;
					byte[] var10 = field321[var7];
					if (var10 != null) {
						var5.method493(field98, var8, var9, var10, (field513 - 6) * 8, (field512 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field308[var11] >> 8) * 64 - field463;
					int var13 = (field308[var11] & 0xFF) * 64 - field464;
					byte[] var14 = field321[var11];
					if (var14 == null && field513 < 800) {
						var5.method483(var12, 64, 64, var13);
					}
				}

				field90++;
				if (field90 > 59) {
					field90 = 0;
					field474.method250(126);
				}

				field474.method250(121);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field282[var15];
					if (var16 != null) {
						int var17 = (field308[var15] >> 8) * 64 - field463;
						int var18 = (field308[var15] & 0xFF) * 64 - field464;
						var5.method499(var18, field178, var16, field98, var17);
					}
				}
			}

			if (field161) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field511[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field308.length; var28++) {
									if (field308[var28] == var27 && field321[var28] != null) {
										var5.method490(var21 * 8, var23, (var26 & 0x7) * 8, var20 * 8, var24, field321[var28], field98, var19, (var25 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field511[0][var29][var30];
						if (var31 == -1) {
							var5.method483(var29 * 8, 8, 8, var30 * 8);
						}
					}
				}

				field474.method250(121);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field511[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field308.length; var41++) {
									if (field308[var41] == var40 && field282[var41] != null) {
										var5.method480(field282[var41], field98, (var39 & 0x7) * 8, var33 * 8, var37, var32, (var38 & 0x7) * 8, field178, var34 * 8, var36);
										break;
									}
								}
							}
						}
					}
				}
			}

			field474.method250(121);
			var5.method494(field98, field178);

			if (field318 != null) {
				field318.method580();
				PNDPOZTD.field1159 = field499;
			}

			field474.method250(121);
			int var42 = LVLPWFEX.field1082;
			if (var42 > field323) {
				var42 = field323;
			}

			if (var42 < field323 - 1) {
				int var43 = field323 - 1;
			}

			if (field108) {
				field178.method415(LVLPWFEX.field1082);
			} else {
				field178.method415(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method33(var44, var45);
				}
			}

			method119();
		} catch (Exception var58) {
		}

		HGKOLOPU.field688.method3();

		if (field874 != null) {
			field474.method250(98);
			field474.method255(1057001181);
		}

		if (field108 && signlink.cache_dat != null) {
			int var47 = field224.method239(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field224.method232(var48);
				if ((var49 & 0x79) == 0) {
					IGXVZOHI.method353(var48);
				}
			}
		}

		System.gc();
		PNDPOZTD.method506(20);
		field224.method237();
		int var50 = (field512 - 6) / 8 - 1;
		int var51 = (field512 + 6) / 8 + 1;
		int var52 = (field513 - 6) / 8 - 1;
		int var53 = (field513 + 6) / 8 + 1;
		if (field177) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field224.method227(0, var55, var54);
					if (var56 != -1) {
						field224.method234(3, var56);
					}

					int var57 = field224.method227(1, var55, var54);
					if (var57 != -1) {
						field224.method234(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method162() {
		while (true) {
			SGKWAMJX var1 = field224.method223();
			if (var1 == null) {
				return;
			}

			if (var1.field1279 == 0) {
				IGXVZOHI.method352(var1.field1281, var1.field1280);

				if ((field224.method232(var1.field1280) & 0x62) != 0) {
					field249 = true;

					if (field271 != -1 || field415 != -1) {
						field322 = true;
					}
				}
			}

			if (var1.field1279 == 1 && var1.field1281 != null) {
				ICYGYVTE.method346(var1.field1281);
			}

			if (var1.field1279 == 2 && field501 == var1.field1280 && var1.field1281 != null) {
				method57(var1.field1281, field502);
			}

			if (var1.field1279 == 3 && field152 == 1) {
				for (int var2 = 0; var2 < field321.length; var2++) {
					if (field309[var2] == var1.field1280) {
						field321[var2] = var1.field1281;

						if (var1.field1281 == null) {
							field309[var2] = -1;
						}

						break;
					}

					if (field310[var2] == var1.field1280) {
						field282[var2] = var1.field1281;

						if (var1.field1281 == null) {
							field310[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1279 == 93 && field224.method236(var1.field1280)) {
				LVLPWFEX.method495(new EGCCHUZS(var1.field1281), field224);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method163() {
		if (field507 > 1) {
			field507--;
		}

		if (field196 > 0) {
			field196--;
		}

		for (int var1 = 0; var1 < 5 && method86(); var1++) {
		}

		if (field470) {
			synchronized (field264.field647) {
				if (!field167) {
					field264.field651 = 0;
				} else if (field885 != 0 || field264.field651 >= 40) {
					field474.method250(93);
					field474.method251(0);
					int var3 = field474.field589;
					int var4 = 0;
					for (int var5 = 0; var5 < field264.field651 && var3 - field474.field589 < 240; var5++) {
						var4++;
						int var6 = field264.field646[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field264.field649[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field264.field646[var5] == -1 && field264.field649[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field262 != var7 || field263 != var6) {
							int var9 = var7 - field262;
							field262 = var7;
							int var10 = var6 - field263;
							field263 = var6;

							if (field314 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field474.method252((field314 << 12) + (var9 << 6) + var10);
								field314 = 0;
							} else if (field314 < 8) {
								field474.method254((field314 << 19) + var8 + 0x800000);
								field314 = 0;
							} else {
								field474.method255((field314 << 19) + var8 - 0x40000000);
								field314 = 0;
							}
						} else if (field314 < 2047) {
							field314++;
						}
					}

					field474.method260(field474.field589 - var3);

					if (var4 >= field264.field651) {
						field264.field651 = 0;
					} else {
						field264.field651 -= var4;
						for (int var11 = 0; var11 < field264.field651; var11++) {
							field264.field649[var11] = field264.field649[var4 + var11];
							field264.field646[var11] = field264.field646[var4 + var11];
						}
					}
				}
			}

			if (field885 != 0) {
				long var12 = (field888 - field221) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field221 = field888;
				int var14 = field887;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field886;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field885 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field474.method250(185);
				field474.method294((var17 << 19) + (var18 << 20) + var16);
			}

			if (field407 > 0) {
				field407--;
			}

			if (field889[1] == 1 || field889[2] == 1 || field889[3] == 1 || field889[4] == 1) {
				field408 = true;
			}

			if (field408 && field407 <= 0) {
				field407 = 20;
				field408 = false;
				field474.method250(218);
				field474.method286(field430);
				field474.method252(field429);
			}

			if (field876 && !field365) {
				field365 = true;
				field474.method250(28);
				field474.method251(1);
			}

			if (!field876 && field365) {
				field365 = false;
				field474.method250(28);
				field474.method251(0);
			}

			method122();
			method175();
			method143();
			field194++;
			if (field194 > 750) {
				method94();
			}

			method50();
			method60();
			method89();
			field93++;

			if (field281 != 0) {
				field280 += 20;
				if (field280 >= 400) {
					field281 = 0;
				}
			}

			if (field256 != 0) {
				field253++;
				if (field253 >= 15) {
					if (field256 == 2) {
						field249 = true;
					}

					if (field256 == 3) {
						field322 = true;
					}

					field256 = 0;
				}
			}

			if (field302 != 0) {
				field484++;

				if (field879 > field303 + 5 || field879 < field303 - 5 || field880 > field304 + 5 || field880 < field304 - 5) {
					field457 = true;
				}

				if (field878 == 0) {
					if (field302 == 2) {
						field249 = true;
					}

					if (field302 == 3) {
						field322 = true;
					}

					field302 = 0;

					if (field457 && field484 >= 5) {
						field518 = -1;
						method41();

						if (field518 == field300 && field517 != field301) {
							LORGYGVM var19 = LORGYGVM.method477(field300);
							byte var20 = 0;
							if (field110 == 1 && var19.field1021 == 206) {
								var20 = 1;
							}

							if (var19.field1007[field517] <= 0) {
								var20 = 0;
							}

							if (var19.field1005) {
								int var21 = field301;
								int var22 = field517;
								var19.field1007[var22] = var19.field1007[var21];
								var19.field1030[var22] = var19.field1030[var21];
								var19.field1007[var21] = -1;
								var19.field1030[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field301;
								int var24 = field517;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method472(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method472(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method472(field517, field301);
							}

							field474.method250(205);
							field474.method284(field301);
							field474.method278(var20);
							field474.method284(field517);
							field474.method285(field300);
						}
					} else if ((field209 == 1 || method77(field487 - 1)) && field487 > 2) {
						method154();
					} else if (field487 > 0) {
						method112(field487 - 1);
					}

					field253 = 10;
					field885 = 0;
				}
			}

			if (KYNTOGBR.field927 != -1) {
				int var25 = KYNTOGBR.field927;
				int var26 = KYNTOGBR.field928;
				boolean var27 = method140(true, 0, 0, var25, var26, 0, 0, field223.field1464[0], 0, field223.field1465[0], 0);
				KYNTOGBR.field927 = -1;

				if (var27) {
					field278 = field886;
					field279 = field887;
					field281 = 1;
					field280 = 0;
				}
			}

			if (field885 == 1 && field478 != null) {
				field478 = null;
				field322 = true;
				field885 = 0;
			}

			method56();

			if (field368 == -1) {
				method100();
				method107();
				method134();
			}

			if (field878 == 1 || field885 == 1) {
				field442++;
			}

			if (field388 == 0 && field480 == 0 && field391 == 0) {
				if (field506 > 0) {
					field506--;
				}
			} else if (field506 < 100) {
				field506++;
				if (field506 == 100) {
					if (field388 != 0) {
						field322 = true;
					}

					if (field480 != 0) {
						field249 = true;
					}
				}
			}

			if (field152 == 2) {
				method166();
			}

			if (field152 == 2 && field376) {
				method118();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field276[var28]++;
			}

			method136();
			field877++;
			if (field877 > 4500) {
				field196 = 250;
				field877 -= 500;
				field474.method250(54);
			}

			field252++;
			if (field252 > 500) {
				field252 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field461 += field462;
				}

				if ((var29 & 0x2) == 2) {
					field519 += field520;
				}

				if ((var29 & 0x4) == 4) {
					field199 += field200;
				}
			}

			if (field461 < -50) {
				field462 = 2;
			}

			if (field461 > 50) {
				field462 = -2;
			}

			if (field519 < -55) {
				field520 = 2;
			}

			if (field519 > 55) {
				field520 = -2;
			}

			if (field199 < -40) {
				field200 = 1;
			}

			if (field199 > 40) {
				field200 = -1;
			}

			field148++;
			if (field148 > 500) {
				field148 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field88 += field89;
				}

				if ((var30 & 0x2) == 2) {
					field134 += field135;
				}
			}

			if (field88 < -60) {
				field89 = 2;
			}

			if (field88 > 60) {
				field89 = -2;
			}

			if (field134 < -20) {
				field135 = 1;
			}

			if (field134 > 10) {
				field135 = -1;
			}

			field195++;
			if (field195 > 50) {
				field474.method250(121);
			}

			try {
				if (field352 != null && field474.field589 > 0) {
					field352.method547(field474.field588, field474.field589, 0);
					field474.field589 = 0;
					field195 = 0;
				}
			} catch (IOException var32) {
				method94();
			} catch (Exception var33) {
				method80();
			}
		}
	}

	@ObfuscatedName("client.a(ILLORGYGVM;)Z")
	public final boolean method164(LORGYGVM arg0) {
		int var2 = arg0.field1021;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field348[field487] = "Remove @whi@" + arg0.field1051;
				field237[field487] = 711;
				field487++;
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

		field348[field487] = "Remove @whi@" + field510[var2];
		field237[field487] = 388;
		field487++;
		field348[field487] = "Message @whi@" + field510[var2];
		field237[field487] = 17;
		field487++;
		return true;
	}

	@ObfuscatedName("client.a(IILLORGYGVM;IIIII)V")
	public final void method165(int arg0, int arg1, LORGYGVM arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.field1009 == 0 && arg2.field1031 != null && !arg2.field1003 && (arg6 >= arg5 && arg0 >= arg4 && arg6 <= arg2.field1022 + arg5 && arg0 <= arg2.field1046 + arg4)) {
			int var8 = arg2.field1031.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.field983[var9] + arg5;
				int var11 = arg2.field989[var9] + arg4 - arg1;
				LORGYGVM var12 = LORGYGVM.method477(arg2.field1031[var9]);
				var10 += var12.field1047;
				var11 += var12.field1038;
				if ((var12.field1011 >= 0 || var12.field993 != 0) && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
					if (var12.field1011 >= 0) {
						field247 = var12.field1011;
					} else {
						field247 = var12.field1023;
					}
				}

				if (var12.field1009 == 8 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
					field189 = var12.field1023;
				}

				if (var12.field1009 == 0) {
					method165(arg0, var12.field991, var12, arg3, var11, var10, arg6);

					if (var12.field1012 > var12.field1046) {
						method52(var12.field1046, var12, var11, var12.field1012, arg3, arg0, arg6, var12.field1022 + var10);
					}
				} else {
					if (var12.field1027 == 1 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						boolean var13 = false;
						if (var12.field1021 != 0) {
							var13 = method164(var12);
						}

						if (!var13) {
							field348[field487] = var12.field1028;
							field237[field487] = 36;
							field236[field487] = var12.field1023;
							field487++;
						}
					}

					if (var12.field1027 == 2 && field372 == 0 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						String var14 = var12.field1036;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field348[field487] = var14 + " @gre@" + var12.field987;
						field237[field487] = 37;
						field236[field487] = var12.field1023;
						field487++;
					}

					if (var12.field1027 == 3 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						field348[field487] = "Close";

						if (arg3 == 3) {
							field237[field487] = 841;
						} else {
							field237[field487] = 786;
						}

						field236[field487] = var12.field1023;
						field487++;
					}

					if (var12.field1027 == 4 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						field348[field487] = var12.field1028;
						field237[field487] = 227;
						field236[field487] = var12.field1023;
						field487++;
					}

					if (var12.field1027 == 5 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						field348[field487] = var12.field1028;
						field237[field487] = 738;
						field236[field487] = var12.field1023;
						field487++;
					}

					if (var12.field1027 == 6 && !field82 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1022 + var10 && arg0 < var12.field1046 + var11) {
						field348[field487] = var12.field1028;
						field237[field487] = 211;
						field236[field487] = var12.field1023;
						field487++;
					}

					if (var12.field1009 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1046; var16++) {
							for (int var17 = 0; var17 < var12.field1022; var17++) {
								int var18 = (var12.field1043 + 32) * var17 + var10;
								int var19 = (var12.field1042 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1026[var15];
									var19 += var12.field1008[var15];
								}

								if (arg6 >= var18 && arg0 >= var19 && arg6 < var18 + 32 && arg0 < var19 + 32) {
									field517 = var15;
									field518 = var12.field1023;

									if (var12.field1007[var15] > 0) {
										WMJBOJYO var20 = WMJBOJYO.method560(var12.field1007[var15] - 1);
										if (field182 == 1 && var12.field1052) {
											if (field184 != var12.field1023 || field183 != var15) {
												field348[field487] = "Use " + field186 + " with @lre@" + var20.field1419;
												field237[field487] = 482;
												field238[field487] = var20.field1428;
												field235[field487] = var15;
												field236[field487] = var12.field1023;
												field487++;
											}
										} else if (field372 != 1 || !var12.field1052) {
											if (var12.field1052) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1399 != null && var20.field1399[var21] != null) {
														field348[field487] = var20.field1399[var21] + " @lre@" + var20.field1419;

														if (var21 == 3) {
															field237[field487] = 800;
														}

														if (var21 == 4) {
															field237[field487] = 866;
														}

														field238[field487] = var20.field1428;
														field235[field487] = var15;
														field236[field487] = var12.field1023;
														field487++;
													} else if (var21 == 4) {
														field348[field487] = "Drop @lre@" + var20.field1419;
														field237[field487] = 866;
														field238[field487] = var20.field1428;
														field235[field487] = var15;
														field236[field487] = var12.field1023;
														field487++;
													}
												}
											}

											if (var12.field1044) {
												field348[field487] = "Use @lre@" + var20.field1419;
												field237[field487] = 219;
												field238[field487] = var20.field1428;
												field235[field487] = var15;
												field236[field487] = var12.field1023;
												field487++;
											}

											if (var12.field1052 && var20.field1399 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1399[var22] != null) {
														field348[field487] = var20.field1399[var22] + " @lre@" + var20.field1419;

														if (var22 == 0) {
															field237[field487] = 963;
														}

														if (var22 == 1) {
															field237[field487] = 984;
														}

														if (var22 == 2) {
															field237[field487] = 816;
														}

														field238[field487] = var20.field1428;
														field235[field487] = var15;
														field236[field487] = var12.field1023;
														field487++;
													}
												}
											}

											if (var12.field1016 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1016[var23] != null) {
														field348[field487] = var12.field1016[var23] + " @lre@" + var20.field1419;

														if (var23 == 0) {
															field237[field487] = 285;
														}

														if (var23 == 1) {
															field237[field487] = 881;
														}

														if (var23 == 2) {
															field237[field487] = 875;
														}

														if (var23 == 3) {
															field237[field487] = 397;
														}

														if (var23 == 4) {
															field237[field487] = 233;
														}

														field238[field487] = var20.field1428;
														field235[field487] = var15;
														field236[field487] = var12.field1023;
														field487++;
													}
												}
											}

											field348[field487] = "Examine @lre@" + var20.field1419;
											field237[field487] = 1948;
											field238[field487] = var20.field1428;
											field235[field487] = var15;
											field236[field487] = var12.field1023;
											field487++;
										} else if ((field374 & 0x10) == 0x10) {
											field348[field487] = field375 + " @lre@" + var20.field1419;
											field237[field487] = 492;
											field238[field487] = var20.field1428;
											field235[field487] = var15;
											field236[field487] = var12.field1023;
											field487++;
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

	@ObfuscatedName("client.p(B)V")
	public final void method166() {
		try {
			int var1 = field223.field1478 + field461;
			int var2 = field223.field1479 + field519;
			if (field405 - var1 < -500 || field405 - var1 > 500 || field406 - var2 < -500 || field406 - var2 > 500) {
				field405 = var1;
				field406 = var2;
			}

			if (field405 != var1) {
				field405 += (var1 - field405) / 16;
			}

			if (field406 != var2) {
				field406 += (var2 - field406) / 16;
			}

			if (field889[1] == 1) {
				field431 += (-field431 - 24) / 2;
			} else if (field889[2] == 1) {
				field431 += (24 - field431) / 2;
			} else {
				field431 /= 2;
			}

			if (field889[3] == 1) {
				field432 += (12 - field432) / 2;
			} else if (field889[4] == 1) {
				field432 += (-field432 - 12) / 2;
			} else {
				field432 /= 2;
			}

			field430 = field431 / 2 + field430 & 0x7FF;
			field429 += field432 / 2;
			if (field429 < 128) {
				field429 = 128;
			}

			if (field429 > 383) {
				field429 = 383;
			}

			int var3 = field405 >> 7;
			int var4 = field406 >> 7;
			int var5 = method152(field405, field406, field323);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field323;
						if (var9 < 3 && (field392[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field341[var9][var7][var8];
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

			if (var11 > field359) {
				field359 += (var11 - field359) / 24;
			} else if (var11 < field359) {
				field359 += (var11 - field359) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field223.field1478 + "," + field223.field1479 + "," + field405 + "," + field406 + "," + field512 + "," + field513 + "," + field463 + "," + field464);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method167() {
		field317.method580();

		if (field350 == 2) {
			byte[] var1 = field345.field529;
			int[] var2 = JOVUNXBE.field850;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field122.method339(field430, field188, 25, 25, field485, 33, 33, 0, 256, 0);
			field318.method580();
			PNDPOZTD.field1159 = field499;
		} else {
			int var5 = field88 + field430 & 0x7FF;
			int var6 = field223.field1478 / 32 + 48;
			int var7 = 464 - field223.field1479 / 32;
			field505.method339(var5, field311, var6, var7, field351, 146, 151, 25, field134 + 256, 5);
			field122.method339(field430, field188, 25, 25, field485, 33, 33, 0, 256, 0);

			for (int var8 = 0; var8 < field239; var8++) {
				int var9 = field240[var8] * 4 + 2 - field223.field1478 / 32;
				int var10 = field241[var8] * 4 + 2 - field223.field1479 / 32;
				method79(var10, var9, field133[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					JQSVNFRT var13 = field468[field323][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field223.field1478 / 32;
						int var15 = var12 * 4 + 2 - field223.field1479 / 32;
						method79(var15, var14, field139);
					}
				}
			}

			for (int var16 = 0; var16 < field422; var16++) {
				CHUIKYUV var17 = field421[field423[var16]];
				if (var17 != null && var17.method29()) {
					AUWOQLEO var18 = var17.field69;
					if (var18.field19 != null) {
						var18 = var18.method6();
					}

					if (var18 != null && var18.field39 && var18.field10) {
						int var19 = var17.field1478 / 32 - field223.field1478 / 32;
						int var20 = var17.field1479 / 32 - field223.field1479 / 32;
						method79(var20, var19, field140);
					}
				}
			}

			for (int var21 = 0; var21 < field229; var21++) {
				QAJCAYDZ var22 = field228[field230[var21]];
				if (var22 != null && var22.method29()) {
					int var23 = var22.field1478 / 32 - field223.field1478 / 32;
					int var24 = var22.field1479 / 32 - field223.field1479 / 32;
					boolean var25 = false;
					long var26 = XXUUHLAE.method574(var22.field1255);
					for (int var28 = 0; var28 < field190; var28++) {
						if (field443[var28] == var26 && field121[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field223.field1261 != 0 && var22.field1261 != 0 && field223.field1261 == var22.field1261) {
						var29 = true;
					}

					if (var25) {
						method79(var24, var23, field142);
					} else if (var29) {
						method79(var24, var23, field143);
					} else {
						method79(var24, var23, field141);
					}
				}
			}

			if (field261 != 0 && field123 % 20 < 10) {
				if (field261 == 1 && field274 >= 0 && field274 < field421.length) {
					CHUIKYUV var30 = field421[field274];
					if (var30 != null) {
						int var31 = var30.field1478 / 32 - field223.field1478 / 32;
						int var32 = var30.field1479 / 32 - field223.field1479 / 32;
						method149(var31, field482, var32);
					}
				}

				if (field261 == 2) {
					int var33 = (field292 - field463) * 4 + 2 - field223.field1478 / 32;
					int var34 = (field293 - field464) * 4 + 2 - field223.field1479 / 32;
					method149(var33, field482, var34);
				}

				if (field261 == 10 && field203 >= 0 && field203 < field228.length) {
					QAJCAYDZ var35 = field228[field203];
					if (var35 != null) {
						int var36 = var35.field1478 / 32 - field223.field1478 / 32;
						int var37 = var35.field1479 / 32 - field223.field1479 / 32;
						method149(var36, field482, var37);
					}
				}
			}

			if (field503 != 0) {
				int var38 = field503 * 4 + 2 - field223.field1478 / 32;
				int var39 = field504 * 4 + 2 - field223.field1479 / 32;
				method79(var39, var38, field481);
			}

			JOVUNXBE.method385(78, 3, 3, 97, 0xFFFFFF);
			field318.method580();
			PNDPOZTD.field1159 = field499;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		SZJROHQV var10 = null;
		for (SZJROHQV var11 = (SZJROHQV) field320.method395(); var11 != null; var11 = (SZJROHQV) field320.method397()) {
			if (var11.field1285 == arg7 && var11.field1287 == arg5 && var11.field1288 == arg0 && var11.field1286 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new SZJROHQV();
			var10.field1285 = arg7;
			var10.field1286 = arg3;
			var10.field1287 = arg5;
			var10.field1288 = arg0;
			method160(var10);
			field320.method392(var10);
		}

		var10.field1291 = arg2;
		var10.field1293 = arg4;
		var10.field1292 = arg1;
		var10.field1290 = arg8;
		var10.field1289 = arg6;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method169(long arg0) {
		if (arg0 != 0L) {
			if (field190 >= 100 && field437 != 1) {
				method74("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field190 >= 200) {
				method74("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = XXUUHLAE.method578(XXUUHLAE.method575(arg0));
				for (int var4 = 0; var4 < field190; var4++) {
					if (field443[var4] == arg0) {
						method74("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field283; var5++) {
					if (field370[var5] == arg0) {
						method74("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field223.field1255)) {
					field510[field190] = var3;
					field443[field190] = arg0;
					field121[field190] = 0;
					field190++;
					field249 = true;
					field474.method250(217);
					field474.method257(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method170() {
		field117 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field144[var1] = -1;
			for (int var2 = 0; var2 < ZWYXHQWS.field1506; var2++) {
				if (!ZWYXHQWS.field1507[var2].field1513 && ZWYXHQWS.field1507[var2].field1508 == var1 + (field234 ? 0 : 7)) {
					field144[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method171() {
		field319.method580();
		PNDPOZTD.field1159 = field497;
		field346.method183(0, 0);

		if (field460) {
			field164.method526(0, 40, 239, field172);
			field164.method526(128, 60, 239, field313 + "*");
		} else if (field441 == 1) {
			field164.method526(0, 40, 239, "Enter amount:");
			field164.method526(128, 60, 239, field337 + "*");
		} else if (field441 == 2) {
			field164.method526(0, 40, 239, "Enter name:");
			field164.method526(128, 60, 239, field337 + "*");
		} else if (field478 != null) {
			field164.method526(0, 40, 239, field478);
			field164.method526(128, 60, 239, "Click to continue");
		} else if (field271 != -1) {
			method148(0, 0, 0, LORGYGVM.method477(field271));
		} else if (field415 == -1) {
			RLQTDOAP var1 = field163;
			int var2 = 0;
			JOVUNXBE.method382(463, 0, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field493[var3] != null) {
					int var4 = field491[var3];
					int var5 = field307 + 70 - var2 * 14;
					String var6 = field492[var3];
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
							var1.method530(var5, field493[var3], 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field440 == 0 || field440 == 1 && method91(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field99[0].method183(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field99[1].method183(var5 - 12, var8);
								var8 += 14;
							}

							var1.method530(var5, var6 + ":", var8, 0);
							var8 += var1.method528(var6) + 8;
							var1.method530(var5, field493[var3], var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field273 == 0 && (var4 == 7 || field325 == 0 || field325 == 1 && method91(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method530(var5, "From", var9, 0);
							int var11 = var9 + var1.method528("From ");
							if (var7 == 1) {
								field99[0].method183(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field99[1].method183(var5 - 12, var11);
								var11 += 14;
							}

							var1.method530(var5, var6 + ":", var11, 0);
							var11 += var1.method528(var6) + 8;
							var1.method530(var5, field493[var3], var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field339 == 0 || field339 == 1 && method91(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method530(var5, var6 + " " + field493[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field273 == 0 && field325 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method530(var5, field493[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field273 == 0 && field325 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method530(var5, "To " + var6 + ":", 4, 0);
							var1.method530(var5, field493[var3], var1.method528("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field339 == 0 || field339 == 1 && method91(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method530(var5, var6 + " " + field493[var3], 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			JOVUNXBE.method381();
			field416 = var2 * 14 + 7;
			if (field416 < 78) {
				field416 = 78;
			}

			method46(77, field416, field416 - field307 - 77, 0, 463);
			String var10;
			if (field223 == null || field223.field1255 == null) {
				var10 = XXUUHLAE.method578(field101);
			} else {
				var10 = field223.field1255;
			}

			var1.method530(90, var10 + ":", 4, 0);
			var1.method530(90, field272 + "*", var1.method528(var10 + ": ") + 6, 255);
			JOVUNXBE.method388(77, 0, 479, 0);
		} else {
			method148(0, 0, 0, LORGYGVM.method477(field415));
		}

		if (field469 && field410 == 2) {
			method58();
		}

		field319.method581(17, 357, field871);
		field318.method580();
		PNDPOZTD.field1159 = field499;
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method172(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.r(B)V")
	public final void method173() {
		field187 = false;
		while (field324) {
			field187 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field508 = null;
		field509 = null;
		field514 = null;
		field330 = null;
		field331 = null;
		field332 = null;
		field333 = null;
		field268 = null;
		field269 = null;
		field445 = null;
		field446 = null;
		field471 = null;
		field472 = null;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method174() {
		short var1 = 256;

		if (field326 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field326 > 768) {
					field330[var2] = method32(field332[var2], field331[var2], 1024 - field326);
				} else if (field326 > 256) {
					field330[var2] = field332[var2];
				} else {
					field330[var2] = method32(field331[var2], field332[var2], 256 - field326);
				}
			}
		} else if (field327 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field327 > 768) {
					field330[var3] = method32(field333[var3], field331[var3], 1024 - field327);
				} else if (field327 > 256) {
					field330[var3] = field333[var3];
				} else {
					field330[var3] = method32(field331[var3], field333[var3], 256 - field327);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field330[var4] = field331[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field399.field1434[var5] = field471.field731[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field385[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field445[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field330[var12];
					int var15 = field399.field1434[var7];
					field399.field1434[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field399.method581(0, 0, field871);

		for (int var16 = 0; var16 < 33920; var16++) {
			field400.field1434[var16] = field472.field731[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field385[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field445[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field330[var23];
					int var26 = field400.field1434[var18];
					field400.field1434[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field400.method581(637, 0, field871);
	}

	@ObfuscatedName("client.K(I)V")
	public final void method175() {
		if (field152 == 2) {
			for (SZJROHQV var1 = (SZJROHQV) field320.method395(); var1 != null; var1 = (SZJROHQV) field320.method397()) {
				if (var1.field1289 > 0) {
					var1.field1289--;
				}

				if (var1.field1289 != 0) {
					if (var1.field1290 > 0) {
						var1.field1290--;
					}

					if (var1.field1290 == 0 && var1.field1287 >= 1 && var1.field1288 >= 1 && var1.field1287 <= 102 && var1.field1288 <= 102 && (var1.field1291 < 0 || LVLPWFEX.method497(var1.field1293, var1.field1291))) {
						method70(var1.field1293, var1.field1285, var1.field1292, var1.field1286, var1.field1288, var1.field1291, var1.field1287);
						var1.field1290 = -1;

						if (var1.field1291 == var1.field1282 && var1.field1282 == -1) {
							var1.method379();
						} else if (var1.field1291 == var1.field1282 && var1.field1292 == var1.field1283 && var1.field1293 == var1.field1284) {
							var1.method379();
						}
					}
				} else if (var1.field1282 < 0 || LVLPWFEX.method497(var1.field1284, var1.field1282)) {
					method70(var1.field1284, var1.field1285, var1.field1283, var1.field1286, var1.field1288, var1.field1282, var1.field1287);
					var1.method379();
				}
			}

			field357++;
			if (field357 > 141) {
				field357 = 0;
				field474.method250(25);
				field474.method254(0x75B6BF);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method176(int arg0) {
		if (!field108) {
			for (int var2 = 0; var2 < field175.length; var2++) {
				int var3 = field175[var2];
				if (PNDPOZTD.field1167[var3] >= arg0) {
					DGXCFOYI var4 = PNDPOZTD.field1161[var3];
					int var5 = var4.field532 * var4.field531 - 1;
					int var6 = field93 * var4.field531 * 2;
					byte[] var7 = var4.field529;
					byte[] var8 = field113;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field529 = var8;
					field113 = var7;
					PNDPOZTD.method509(var3);
					field312++;
					if (field312 > 1130) {
						field312 = 0;
						field474.method250(158);
						field474.method251(0);
						int var10 = field474.field589;
						field474.method252(10252);

						if ((int) (Math.random() * 2.0D) == 0) {
							field474.method252(36403);
						}

						if ((int) (Math.random() * 2.0D) == 0) {
							field474.method252(32298);
						}

						field474.method251(172);
						field474.method252(23928);
						field474.method251(143);
						field474.method252((int) (Math.random() * 65536.0D));
						field474.method251(27);
						field474.method251(129);
						field474.method251(55);
						field474.method260(field474.field589 - var10);
					}
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
			field160[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field395[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
