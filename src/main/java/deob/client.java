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
public final class client extends XHFSQKPU {

	@ObfuscatedName("client.L")
	public boolean field59 = false;

	@ObfuscatedName("client.N")
	public int field60 = 0x332D25;

	@ObfuscatedName("client.O")
	public int[][] field61 = new int[104][104];

	@ObfuscatedName("client.Q")
	public CUKAGIIJ[] field63 = new CUKAGIIJ[20];

	@ObfuscatedName("client.R")
	public int field64 = 3;

	@ObfuscatedName("client.U")
	public int[] field67 = new int[100];

	@ObfuscatedName("client.V")
	public String[] field68 = new String[100];

	@ObfuscatedName("client.W")
	public String[] field69 = new String[100];

	@ObfuscatedName("client.X")
	public int field70 = 2048;

	@ObfuscatedName("client.Y")
	public int field71 = 2047;

	@ObfuscatedName("client.Z")
	public FHQGDDHF[] field72 = new FHQGDDHF[field70];

	@ObfuscatedName("client.bb")
	public int[] field74 = new int[field70];

	@ObfuscatedName("client.db")
	public int[] field76 = new int[field70];

	@ObfuscatedName("client.eb")
	public CFARFRSG[] field77 = new CFARFRSG[field70];

	@ObfuscatedName("client.fb")
	public CLCMCMIN[][][] field78 = new CLCMCMIN[4][104][104];

	@ObfuscatedName("client.rb")
	public boolean field90 = false;

	@ObfuscatedName("client.yb")
	public int[] field97 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.zb")
	public String[] field98 = new String[200];

	@ObfuscatedName("client.Ab")
	public int[] field99 = new int[50];

	@ObfuscatedName("client.Bb")
	public CLCMCMIN field100 = new CLCMCMIN();

	@ObfuscatedName("client.Db")
	public int field101 = -1;

	@ObfuscatedName("client.Gb")
	public int[] field104 = new int[151];

	@ObfuscatedName("client.Hb")
	public int[] field105 = new int[5];

	@ObfuscatedName("client.ac")
	public int field122 = -1;

	@ObfuscatedName("client.dc")
	public int[] field125 = new int[1000];

	@ObfuscatedName("client.ec")
	public int[] field126 = new int[1000];

	@ObfuscatedName("client.fc")
	public String[] field127 = new String[5];

	@ObfuscatedName("client.gc")
	public boolean[] field128 = new boolean[5];

	@ObfuscatedName("client.kc")
	public boolean field132 = false;

	@ObfuscatedName("client.lc")
	public String field133 = "";

	@ObfuscatedName("client.mc")
	public CUKAGIIJ[] field134 = new CUKAGIIJ[1000];

	@ObfuscatedName("client.nc")
	public int[] field135 = new int[5];

	@ObfuscatedName("client.tc")
	public int[][][] field140 = new int[4][13][13];

	@ObfuscatedName("client.xc")
	public int[] field144 = new int[1000];

	@ObfuscatedName("client.Ec")
	public int[] field149 = new int[LAGRJOEJ.field811];

	@ObfuscatedName("client.Jc")
	public String field151 = "";

	@ObfuscatedName("client.Uc")
	public int[] field160 = new int[200];

	@ObfuscatedName("client.Wc")
	public OPFNUBIN field162 = new OPFNUBIN();

	@ObfuscatedName("client.Yc")
	public boolean field164 = false;

	@ObfuscatedName("client.Zc")
	public int[] field165 = new int[151];

	@ObfuscatedName("client.qd")
	public boolean field182 = false;

	@ObfuscatedName("client.sd")
	public String field184 = "";

	@ObfuscatedName("client.td")
	public String field185 = "";

	@ObfuscatedName("client.Bd")
	public int[] field193 = new int[7];

	@ObfuscatedName("client.Cd")
	public byte[] field194 = new byte[16384];

	@ObfuscatedName("client.Dd")
	public boolean field195 = true;

	@ObfuscatedName("client.Ed")
	public int[] field196 = new int[LAGRJOEJ.field811];

	@ObfuscatedName("client.Fd")
	public boolean field197 = false;

	@ObfuscatedName("client.Id")
	public int field199 = -1;

	@ObfuscatedName("client.Od")
	public FDCAWVRL[] field204 = new FDCAWVRL[13];

	@ObfuscatedName("client.Rd")
	public boolean field206 = false;

	@ObfuscatedName("client.be")
	public int[] field214 = new int[5];

	@ObfuscatedName("client.ye")
	public int field232 = 1;

	@ObfuscatedName("client.Ae")
	public boolean field234 = false;

	@ObfuscatedName("client.Be")
	public int field235 = -1;

	@ObfuscatedName("client.Ce")
	public boolean field236 = false;

	@ObfuscatedName("client.De")
	public volatile boolean field237 = false;

	@ObfuscatedName("client.Ge")
	public boolean field239 = false;

	@ObfuscatedName("client.Ie")
	public boolean field241 = true;

	@ObfuscatedName("client.Le")
	public int[] field243 = new int[5];

	@ObfuscatedName("client.Ne")
	public int field245 = -1;

	@ObfuscatedName("client.af")
	public int[] field258 = new int[33];

	@ObfuscatedName("client.bf")
	public CRC32 field259 = new CRC32();

	@ObfuscatedName("client.cf")
	public volatile boolean field260 = false;

	@ObfuscatedName("client.ef")
	public long[] field262 = new long[100];

	@ObfuscatedName("client.ff")
	public boolean field263 = true;

	@ObfuscatedName("client.hf")
	public int[] field265 = new int[50];

	@ObfuscatedName("client.kf")
	public FDCAWVRL[] field267 = new FDCAWVRL[2];

	@ObfuscatedName("client.lf")
	public PJMJGLFE[] field268 = new PJMJGLFE[5];

	@ObfuscatedName("client.sf")
	public long[] field274 = new long[200];

	@ObfuscatedName("client.uf")
	public int field276 = 2;

	@ObfuscatedName("client.Af")
	public int[] field282 = new int[5];

	@ObfuscatedName("client.Bf")
	public CUKAGIIJ[] field283 = new CUKAGIIJ[8];

	@ObfuscatedName("client.Ef")
	public volatile boolean field285 = false;

	@ObfuscatedName("client.Gf")
	public int field287 = -1;

	@ObfuscatedName("client.If")
	public boolean field289 = true;

	@ObfuscatedName("client.Jf")
	public int field290 = 128;

	@ObfuscatedName("client.Of")
	public CFARFRSG field295 = new CFARFRSG(new byte[5000]);

	@ObfuscatedName("client.Pf")
	public ADGLALPC[] field296 = new ADGLALPC[16384];

	@ObfuscatedName("client.Rf")
	public int[] field298 = new int[16384];

	@ObfuscatedName("client.Uf")
	public int field300 = -1;

	@ObfuscatedName("client.Wf")
	public FDCAWVRL[] field302 = new FDCAWVRL[100];

	@ObfuscatedName("client.Yf")
	public boolean field304 = false;

	@ObfuscatedName("client.ag")
	public int field306 = 0x23201B;

	@ObfuscatedName("client.cg")
	public boolean[] field307 = new boolean[5];

	@ObfuscatedName("client.fg")
	public final int field310 = 100;

	@ObfuscatedName("client.gg")
	public int[] field311 = new int[100];

	@ObfuscatedName("client.hg")
	public CUKAGIIJ[] field312 = new CUKAGIIJ[20];

	@ObfuscatedName("client.pg")
	public int field319 = -1;

	@ObfuscatedName("client.ug")
	public int[] field324 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.xg")
	public int field326 = -1;

	@ObfuscatedName("client.yg")
	public int[] field327 = new int[9];

	@ObfuscatedName("client.zg")
	public int[] field328 = new int[33];

	@ObfuscatedName("client.Hg")
	public int[] field336 = new int[2000];

	@ObfuscatedName("client.Wg")
	public String field350 = "";

	@ObfuscatedName("client.Xg")
	public int[] field351 = new int[2000];

	@ObfuscatedName("client.ah")
	public int field352 = 0x4D4233;

	@ObfuscatedName("client.ch")
	public int field353 = -1;

	@ObfuscatedName("client.dh")
	public int field354 = -1;

	@ObfuscatedName("client.lh")
	public boolean field361 = false;

	@ObfuscatedName("client.nh")
	public boolean field363 = false;

	@ObfuscatedName("client.oh")
	public String[] field364 = new String[500];

	@ObfuscatedName("client.ph")
	public CFARFRSG field365 = CFARFRSG.method18(1);

	@ObfuscatedName("client.qh")
	public String field366 = "";

	@ObfuscatedName("client.rh")
	public boolean field367 = false;

	@ObfuscatedName("client.uh")
	public int[] field370 = new int[256];

	@ObfuscatedName("client.Ch")
	public boolean field378 = false;

	@ObfuscatedName("client.Eh")
	public int field380 = 1;

	@ObfuscatedName("client.Fh")
	public boolean field381 = false;

	@ObfuscatedName("client.Oh")
	public boolean field389 = true;

	@ObfuscatedName("client.Rh")
	public String field392 = "";

	@ObfuscatedName("client.Sh")
	public String field393 = "";

	@ObfuscatedName("client.Yh")
	public boolean field399 = false;

	@ObfuscatedName("client.ai")
	public int field400 = -1;

	@ObfuscatedName("client.di")
	public int[] field403 = new int[500];

	@ObfuscatedName("client.ei")
	public int[] field404 = new int[500];

	@ObfuscatedName("client.fi")
	public int[] field405 = new int[500];

	@ObfuscatedName("client.gi")
	public int[] field406 = new int[500];

	@ObfuscatedName("client.hi")
	public int field407 = 78;

	@ObfuscatedName("client.ii")
	public CFARFRSG field408 = CFARFRSG.method18(1);

	@ObfuscatedName("client.mi")
	public int field412 = -1;

	@ObfuscatedName("client.ni")
	public int[] field413 = new int[50];

	@ObfuscatedName("client.qi")
	public int field415 = 50;

	@ObfuscatedName("client.ri")
	public int[] field416 = new int[field415];

	@ObfuscatedName("client.si")
	public int[] field417 = new int[field415];

	@ObfuscatedName("client.ti")
	public int[] field418 = new int[field415];

	@ObfuscatedName("client.ui")
	public int[] field419 = new int[field415];

	@ObfuscatedName("client.vi")
	public int[] field420 = new int[field415];

	@ObfuscatedName("client.wi")
	public int[] field421 = new int[field415];

	@ObfuscatedName("client.xi")
	public int[] field422 = new int[field415];

	@ObfuscatedName("client.yi")
	public String[] field423 = new String[field415];

	@ObfuscatedName("client.zi")
	public String field424 = "";

	@ObfuscatedName("client.Ai")
	public int[][] field425 = new int[104][104];

	@ObfuscatedName("client.Ci")
	public CUKAGIIJ[] field426 = new CUKAGIIJ[100];

	@ObfuscatedName("client.Gi")
	public boolean field430 = false;

	@ObfuscatedName("client.Hi")
	public final int[] field431 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ri")
	public CLCMCMIN field441 = new CLCMCMIN();

	@ObfuscatedName("client.Ui")
	public int[] field443 = new int[4000];

	@ObfuscatedName("client.Vi")
	public int[] field444 = new int[4000];

	@ObfuscatedName("client.bj")
	public int field450 = -1;

	@ObfuscatedName("client.cj")
	public CLCMCMIN field451 = new CLCMCMIN();

	@ObfuscatedName("client.dj")
	public boolean field452 = false;

	@ObfuscatedName("client.hj")
	public int[][] field456 = new int[104][104];

	@ObfuscatedName("client.ij")
	public HQFIXEZL[] field457 = new HQFIXEZL[4];

	@ObfuscatedName("client.kj")
	public int field458 = -1;

	@ObfuscatedName("client.oj")
	public boolean field462 = false;

	@ObfuscatedName("client.wj")
	public int field469 = 0x766654;

	@ObfuscatedName("client.yj")
	public int field471 = 2;

	@ObfuscatedName("client.Aj")
	public int[] field472 = new int[LAGRJOEJ.field811];

	@ObfuscatedName("client.Dj")
	public boolean field473 = false;

	@ObfuscatedName("client.Ej")
	public CFARFRSG field474 = CFARFRSG.method18(1);

	@ObfuscatedName("client.Gj")
	public int field476 = 2;

	@ObfuscatedName("client.Jj")
	public boolean field478 = false;

	@ObfuscatedName("client.wb")
	public static BigInteger field95 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.xb")
	public static int[] field96 = new int[99];

	@ObfuscatedName("client.Cc")
	public static String field147 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.df")
	public static BigInteger field261 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.mf")
	public static int field269 = 10;

	@ObfuscatedName("client.of")
	public static boolean field271 = true;

	@ObfuscatedName("client.eg")
	public static final int[] field309 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Gh")
	public static final int[][] field382 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.nj")
	public static int[] field461 = new int[32];

	@ObfuscatedName("client.Ib")
	public static int field106;

	@ObfuscatedName("client.Kb")
	public int field108;

	@ObfuscatedName("client.Lb")
	public int field109;

	@ObfuscatedName("client.Mb")
	public int field110;

	@ObfuscatedName("client.Nb")
	public int field111;

	@ObfuscatedName("client.Ob")
	public int field112;

	@ObfuscatedName("client.Pb")
	public int field113;

	@ObfuscatedName("client.Qb")
	public int field114;

	@ObfuscatedName("client.Rb")
	public int field115;

	@ObfuscatedName("client.Ub")
	public int field118;

	@ObfuscatedName("client.Xb")
	public int field119;

	@ObfuscatedName("client.Yb")
	public static int field120;

	@ObfuscatedName("client.cc")
	public int field124;

	@ObfuscatedName("client.hc")
	public int field129;

	@ObfuscatedName("client.ic")
	public int field130;

	@ObfuscatedName("client.jc")
	public int field131;

	@ObfuscatedName("client.rc")
	public int field139;

	@ObfuscatedName("client.wc")
	public int field143;

	@ObfuscatedName("client.zc")
	public static int field145;

	@ObfuscatedName("client.Dc")
	public int field148;

	@ObfuscatedName("client.Fc")
	public int field150;

	@ObfuscatedName("client.Kc")
	public int field152;

	@ObfuscatedName("client.Qc")
	public int field157;

	@ObfuscatedName("client.Sc")
	public static int field158;

	@ObfuscatedName("client.Tc")
	public int field159;

	@ObfuscatedName("client.Vc")
	public int field161;

	@ObfuscatedName("client.Xc")
	public int field163;

	@ObfuscatedName("client.ld")
	public int field177;

	@ObfuscatedName("client.md")
	public int field178;

	@ObfuscatedName("client.nd")
	public int field179;

	@ObfuscatedName("client.od")
	public int field180;

	@ObfuscatedName("client.pd")
	public int field181;

	@ObfuscatedName("client.ud")
	public int field186;

	@ObfuscatedName("client.vd")
	public int field187;

	@ObfuscatedName("client.wd")
	public int field188;

	@ObfuscatedName("client.xd")
	public int field189;

	@ObfuscatedName("client.yd")
	public int field190;

	@ObfuscatedName("client.zd")
	public int field191;

	@ObfuscatedName("client.Ad")
	public int field192;

	@ObfuscatedName("client.Jd")
	public int field200;

	@ObfuscatedName("client.Kd")
	public int field201;

	@ObfuscatedName("client.Ld")
	public int field202;

	@ObfuscatedName("client.Md")
	public int field203;

	@ObfuscatedName("client.Pd")
	public int field205;

	@ObfuscatedName("client.Sd")
	public static int field207;

	@ObfuscatedName("client.Ud")
	public int field208;

	@ObfuscatedName("client.Vd")
	public int field209;

	@ObfuscatedName("client.Wd")
	public int field210;

	@ObfuscatedName("client.Xd")
	public static int field211;

	@ObfuscatedName("client.ce")
	public int field215;

	@ObfuscatedName("client.de")
	public int field216;

	@ObfuscatedName("client.ee")
	public int field217;

	@ObfuscatedName("client.pe")
	public int field224;

	@ObfuscatedName("client.qe")
	public int field225;

	@ObfuscatedName("client.re")
	public int field226;

	@ObfuscatedName("client.se")
	public int field227;

	@ObfuscatedName("client.te")
	public int field228;

	@ObfuscatedName("client.ue")
	public int field229;

	@ObfuscatedName("client.xe")
	public int field231;

	@ObfuscatedName("client.Ee")
	public int field238;

	@ObfuscatedName("client.He")
	public int field240;

	@ObfuscatedName("client.Je")
	public int field242;

	@ObfuscatedName("client.Oe")
	public int field246;

	@ObfuscatedName("client.Pe")
	public int field247;

	@ObfuscatedName("client.Qe")
	public int field248;

	@ObfuscatedName("client.Re")
	public int field249;

	@ObfuscatedName("client.Se")
	public int field250;

	@ObfuscatedName("client.Xe")
	public int field255;

	@ObfuscatedName("client.Ze")
	public int field257;

	@ObfuscatedName("client.gf")
	public int field264;

	@ObfuscatedName("client.jf")
	public int field266;

	@ObfuscatedName("client.nf")
	public static int field270;

	@ObfuscatedName("client.tf")
	public int field275;

	@ObfuscatedName("client.vf")
	public int field277;

	@ObfuscatedName("client.wf")
	public int field278;

	@ObfuscatedName("client.xf")
	public int field279;

	@ObfuscatedName("client.yf")
	public int field280;

	@ObfuscatedName("client.zf")
	public int field281;

	@ObfuscatedName("client.Df")
	public int field284;

	@ObfuscatedName("client.Ff")
	public int field286;

	@ObfuscatedName("client.Kf")
	public int field291;

	@ObfuscatedName("client.Lf")
	public int field292;

	@ObfuscatedName("client.Mf")
	public int field293;

	@ObfuscatedName("client.Nf")
	public static int field294;

	@ObfuscatedName("client.Qf")
	public int field297;

	@ObfuscatedName("client.Tf")
	public static int field299;

	@ObfuscatedName("client.Vf")
	public int field301;

	@ObfuscatedName("client.Xf")
	public int field303;

	@ObfuscatedName("client.Zf")
	public int field305;

	@ObfuscatedName("client.ig")
	public int field313;

	@ObfuscatedName("client.jg")
	public int field314;

	@ObfuscatedName("client.kg")
	public int field315;

	@ObfuscatedName("client.lg")
	public int field316;

	@ObfuscatedName("client.mg")
	public int field317;

	@ObfuscatedName("client.qg")
	public int field320;

	@ObfuscatedName("client.rg")
	public int field321;

	@ObfuscatedName("client.vg")
	public static int field325;

	@ObfuscatedName("client.Ag")
	public int field329;

	@ObfuscatedName("client.Bg")
	public int field330;

	@ObfuscatedName("client.Cg")
	public int field331;

	@ObfuscatedName("client.Dg")
	public int field332;

	@ObfuscatedName("client.Eg")
	public int field333;

	@ObfuscatedName("client.Fg")
	public int field334;

	@ObfuscatedName("client.Gg")
	public int field335;

	@ObfuscatedName("client.Ig")
	public int field337;

	@ObfuscatedName("client.Kg")
	public int field338;

	@ObfuscatedName("client.eh")
	public int field355;

	@ObfuscatedName("client.jh")
	public int field359;

	@ObfuscatedName("client.mh")
	public int field362;

	@ObfuscatedName("client.sh")
	public int field368;

	@ObfuscatedName("client.th")
	public int field369;

	@ObfuscatedName("client.vh")
	public int field371;

	@ObfuscatedName("client.wh")
	public int field372;

	@ObfuscatedName("client.xh")
	public int field373;

	@ObfuscatedName("client.yh")
	public int field374;

	@ObfuscatedName("client.zh")
	public int field375;

	@ObfuscatedName("client.Ah")
	public int field376;

	@ObfuscatedName("client.Bh")
	public int field377;

	@ObfuscatedName("client.Dh")
	public int field379;

	@ObfuscatedName("client.Ih")
	public int field384;

	@ObfuscatedName("client.Kh")
	public int field385;

	@ObfuscatedName("client.Lh")
	public int field386;

	@ObfuscatedName("client.Mh")
	public int field387;

	@ObfuscatedName("client.Nh")
	public int field388;

	@ObfuscatedName("client.Ph")
	public int field390;

	@ObfuscatedName("client.Qh")
	public int field391;

	@ObfuscatedName("client.Th")
	public int field394;

	@ObfuscatedName("client.Uh")
	public int field395;

	@ObfuscatedName("client.Vh")
	public int field396;

	@ObfuscatedName("client.Wh")
	public int field397;

	@ObfuscatedName("client.Xh")
	public int field398;

	@ObfuscatedName("client.ci")
	public int field402;

	@ObfuscatedName("client.ji")
	public int field409;

	@ObfuscatedName("client.ki")
	public int field410;

	@ObfuscatedName("client.pi")
	public int field414;

	@ObfuscatedName("client.Di")
	public static int field427;

	@ObfuscatedName("client.Ii")
	public int field432;

	@ObfuscatedName("client.Ji")
	public int field433;

	@ObfuscatedName("client.Ki")
	public int field434;

	@ObfuscatedName("client.Li")
	public int field435;

	@ObfuscatedName("client.Ti")
	public int field442;

	@ObfuscatedName("client.aj")
	public int field449;

	@ObfuscatedName("client.lj")
	public int field459;

	@ObfuscatedName("client.mj")
	public int field460;

	@ObfuscatedName("client.tj")
	public int field466;

	@ObfuscatedName("client.xj")
	public int field470;

	@ObfuscatedName("client.Fj")
	public int field475;

	@ObfuscatedName("client.Hj")
	public static int field477;

	@ObfuscatedName("client.Oj")
	public int field483;

	@ObfuscatedName("client.K")
	public int field58;

	@ObfuscatedName("client.P")
	public static int field62;

	@ObfuscatedName("client.S")
	public int field65;

	@ObfuscatedName("client.T")
	public int field66;

	@ObfuscatedName("client.ab")
	public int field73;

	@ObfuscatedName("client.cb")
	public int field75;

	@ObfuscatedName("client.pb")
	public int field88;

	@ObfuscatedName("client.qb")
	public int field89;

	@ObfuscatedName("client.sb")
	public int field91;

	@ObfuscatedName("client.tb")
	public int field92;

	@ObfuscatedName("client.ub")
	public static int field93;

	@ObfuscatedName("client.vb")
	public int field94;

	@ObfuscatedName("client.vc")
	public long field142;

	@ObfuscatedName("client.Ac")
	public long field146;

	@ObfuscatedName("client.ze")
	public long field233;

	@ObfuscatedName("client.Me")
	public long field244;

	@ObfuscatedName("client.gj")
	public long field455;

	@ObfuscatedName("client.Eb")
	public CUKAGIIJ field102;

	@ObfuscatedName("client.Fb")
	public CUKAGIIJ field103;

	@ObfuscatedName("client.Sb")
	public CUKAGIIJ field116;

	@ObfuscatedName("client.Pc")
	public CUKAGIIJ field156;

	@ObfuscatedName("client.Zd")
	public CUKAGIIJ field212;

	@ObfuscatedName("client.ae")
	public CUKAGIIJ field213;

	@ObfuscatedName("client.og")
	public CUKAGIIJ field318;

	@ObfuscatedName("client.Mi")
	public CUKAGIIJ field436;

	@ObfuscatedName("client.Ni")
	public CUKAGIIJ field437;

	@ObfuscatedName("client.Oi")
	public CUKAGIIJ field438;

	@ObfuscatedName("client.Pi")
	public CUKAGIIJ field439;

	@ObfuscatedName("client.Qi")
	public CUKAGIIJ field440;

	@ObfuscatedName("client.ej")
	public CUKAGIIJ field453;

	@ObfuscatedName("client.fj")
	public CUKAGIIJ field454;

	@ObfuscatedName("client.Lc")
	public EDCVNWGU field153;

	@ObfuscatedName("client.Mc")
	public EDCVNWGU field154;

	@ObfuscatedName("client.Nc")
	public EDCVNWGU field155;

	@ObfuscatedName("client.cd")
	public EDCVNWGU field168;

	@ObfuscatedName("client.dd")
	public EDCVNWGU field169;

	@ObfuscatedName("client.ed")
	public EDCVNWGU field170;

	@ObfuscatedName("client.fd")
	public EDCVNWGU field171;

	@ObfuscatedName("client.gd")
	public EDCVNWGU field172;

	@ObfuscatedName("client.hd")
	public EDCVNWGU field173;

	@ObfuscatedName("client.id")
	public EDCVNWGU field174;

	@ObfuscatedName("client.jd")
	public EDCVNWGU field175;

	@ObfuscatedName("client.kd")
	public EDCVNWGU field176;

	@ObfuscatedName("client.Te")
	public EDCVNWGU field251;

	@ObfuscatedName("client.Ue")
	public EDCVNWGU field252;

	@ObfuscatedName("client.Ve")
	public EDCVNWGU field253;

	@ObfuscatedName("client.We")
	public EDCVNWGU field254;

	@ObfuscatedName("client.gb")
	public EDCVNWGU field79;

	@ObfuscatedName("client.hb")
	public EDCVNWGU field80;

	@ObfuscatedName("client.ib")
	public EDCVNWGU field81;

	@ObfuscatedName("client.jb")
	public EDCVNWGU field82;

	@ObfuscatedName("client.kb")
	public EDCVNWGU field83;

	@ObfuscatedName("client.lb")
	public EDCVNWGU field84;

	@ObfuscatedName("client.mb")
	public EDCVNWGU field85;

	@ObfuscatedName("client.nb")
	public EDCVNWGU field86;

	@ObfuscatedName("client.ob")
	public EDCVNWGU field87;

	@ObfuscatedName("client.Hd")
	public EIPZGSZT field198;

	@ObfuscatedName("client.oc")
	public FDCAWVRL field136;

	@ObfuscatedName("client.pc")
	public FDCAWVRL field137;

	@ObfuscatedName("client.qc")
	public FDCAWVRL field138;

	@ObfuscatedName("client.sg")
	public FDCAWVRL field322;

	@ObfuscatedName("client.tg")
	public FDCAWVRL field323;

	@ObfuscatedName("client.Lg")
	public FDCAWVRL field339;

	@ObfuscatedName("client.Mg")
	public FDCAWVRL field340;

	@ObfuscatedName("client.Ng")
	public FDCAWVRL field341;

	@ObfuscatedName("client.Og")
	public FDCAWVRL field342;

	@ObfuscatedName("client.Pg")
	public FDCAWVRL field343;

	@ObfuscatedName("client.Rg")
	public FDCAWVRL field345;

	@ObfuscatedName("client.Sg")
	public FDCAWVRL field346;

	@ObfuscatedName("client.Tg")
	public FDCAWVRL field347;

	@ObfuscatedName("client.Ug")
	public FDCAWVRL field348;

	@ObfuscatedName("client.Vg")
	public FDCAWVRL field349;

	@ObfuscatedName("client.qj")
	public FDCAWVRL field463;

	@ObfuscatedName("client.rj")
	public FDCAWVRL field464;

	@ObfuscatedName("client.sj")
	public FDCAWVRL field465;

	@ObfuscatedName("client.uj")
	public FDCAWVRL field467;

	@ObfuscatedName("client.vj")
	public FDCAWVRL field468;

	@ObfuscatedName("client.ie")
	public FDMAFIMR field220;

	@ObfuscatedName("client.je")
	public FDMAFIMR field221;

	@ObfuscatedName("client.ke")
	public FDMAFIMR field222;

	@ObfuscatedName("client.le")
	public FDMAFIMR field223;

	@ObfuscatedName("client.Zb")
	public static FHQGDDHF field121;

	@ObfuscatedName("client.Hf")
	public OBRIXRSB field288;

	@ObfuscatedName("client.Ye")
	public QHZQTTDB field256;

	@ObfuscatedName("client.bi")
	public QKKVGPGN field401;

	@ObfuscatedName("client.bc")
	public SIPXLNWG field123;

	@ObfuscatedName("client.Nj")
	public VSUYIIVA field482;

	@ObfuscatedName("client.rd")
	public String field183;

	@ObfuscatedName("client.fe")
	public String field218;

	@ObfuscatedName("client.he")
	public String field219;

	@ObfuscatedName("client.ve")
	public String field230;

	@ObfuscatedName("client.Jb")
	public Socket field107;

	@ObfuscatedName("client.uc")
	public static boolean field141;

	@ObfuscatedName("client.pf")
	public static boolean field272;

	@ObfuscatedName("client.rf")
	public static boolean field273;

	@ObfuscatedName("client.Hh")
	public static boolean field383;

	@ObfuscatedName("client.ad")
	public int[] field166;

	@ObfuscatedName("client.bd")
	public int[] field167;

	@ObfuscatedName("client.fh")
	public int[] field356;

	@ObfuscatedName("client.gh")
	public int[] field357;

	@ObfuscatedName("client.hh")
	public int[] field358;

	@ObfuscatedName("client.Ei")
	public int[] field428;

	@ObfuscatedName("client.Fi")
	public int[] field429;

	@ObfuscatedName("client.Wi")
	public int[] field445;

	@ObfuscatedName("client.Xi")
	public int[] field446;

	@ObfuscatedName("client.Yi")
	public int[] field447;

	@ObfuscatedName("client.Zi")
	public int[] field448;

	@ObfuscatedName("client.Kj")
	public int[] field479;

	@ObfuscatedName("client.Lj")
	public int[] field480;

	@ObfuscatedName("client.Mj")
	public int[] field481;

	@ObfuscatedName("client.li")
	public FDCAWVRL[] field411;

	@ObfuscatedName("client.Tb")
	public byte[][] field117;

	@ObfuscatedName("client.Qg")
	public byte[][] field344;

	@ObfuscatedName("client.dg")
	public byte[][][] field308;

	@ObfuscatedName("client.kh")
	public int[][][] field360;

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method76(String arg0) {
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

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg2 >= 1 && arg4 <= 102 && arg2 <= 102) {
			if (field272 && field246 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field123.method522(arg0, arg4, arg2);
			}

			if (arg6 == 1) {
				var8 = field123.method523(arg2, arg0, arg4);
			}

			if (arg6 == 2) {
				var8 = field123.method524(arg0, arg4, arg2);
			}

			if (arg6 == 3) {
				var8 = field123.method525(arg0, arg4, arg2);
			}

			if (var8 != 0) {
				int var12 = field123.method526(arg0, arg4, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field123.method513(arg0, arg2, arg4);
					QMZPELNG var16 = QMZPELNG.method486(var13);
					if (var16.field1165) {
						field457[arg0].method305(var16.field1156, var14, var15, arg4, arg2);
					}
				}

				if (arg6 == 1) {
					field123.method514(arg2, arg0, arg4);
				}

				if (arg6 == 2) {
					field123.method515(arg4, arg0, arg2);
					QMZPELNG var17 = QMZPELNG.method486(var13);
					if (var17.field1178 + arg4 > 103 || var17.field1178 + arg2 > 103 || var17.field1142 + arg4 > 103 || var17.field1142 + arg2 > 103) {
						return;
					}

					if (var17.field1165) {
						field457[arg0].method306(var17.field1178, var17.field1156, var15, arg4, arg2, var17.field1142);
					}
				}

				if (arg6 == 3) {
					field123.method516(arg2, arg4, arg0);
					QMZPELNG var18 = QMZPELNG.method486(var13);
					if (var18.field1165 && var18.field1155) {
						field457[arg0].method308(arg4, arg2);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field308[1][arg4][arg2] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				DIFHBVBT.method242(arg5, arg1, field360, arg2, arg4, arg0, var19, field457[arg0], arg3, field123);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method78() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(LIFXJSFHR;I)V")
	public final void method79(IFXJSFHR arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field675 == 0) {
			var2 = field123.method522(arg0.field674, arg0.field676, arg0.field677);
		}

		if (arg0.field675 == 1) {
			var2 = field123.method523(arg0.field677, arg0.field674, arg0.field676);
		}

		if (arg0.field675 == 2) {
			var2 = field123.method524(arg0.field674, arg0.field676, arg0.field677);
		}

		if (arg0.field675 == 3) {
			var2 = field123.method525(arg0.field674, arg0.field676, arg0.field677);
		}

		if (var2 != 0) {
			int var6 = field123.method526(arg0.field674, arg0.field676, arg0.field677, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field671 = var3;
		arg0.field673 = var4;
		arg0.field672 = var5;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method80(int arg0) {
		if (arg0 >= 0) {
			if (field191 != 0) {
				field191 = 0;
				field182 = true;
			}

			int var2 = field403[arg0];
			int var3 = field404[arg0];
			int var4 = field405[arg0];
			int var5 = field406[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 534) {
				field408.method19(176);
				field408.method21(var3);
				field408.method21(var5);
				field408.method54(var2);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 500) {
				field408.method19(198);
				field408.method55(var5);
				field408.method56(var2);
				field408.method55(var3);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 343) {
				boolean var6 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
				if (!var6) {
					method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
				}

				field247 = field1404;
				field248 = field1405;
				field250 = 2;
				field249 = 0;
				field408.method19(106);
				field408.method55(var5);
				field408.method56(field386 + var3);
				field408.method54(field385 + var2);
				field408.method56(field227);
				field408.method55(field228);
				field408.method55(field229);
			}

			if (var4 == 31) {
				ADGLALPC var8 = field296[var5];
				if (var8 != null) {
					method192(var8.field1314[0], 1, field121.field1314[0], 0, 0, var8.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(7);
					field408.method54(field216);
					field408.method54(var5);
				}
			}

			if (var4 == 751) {
				field408.method19(133);
				field408.method54(field227);
				field408.method56(field229);
				field408.method55(var2);
				field408.method54(field228);
				field408.method55(var3);
				field408.method56(var5);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 137) {
				FHQGDDHF var9 = field72[var5];
				if (var9 != null) {
					method192(var9.field1314[0], 1, field121.field1314[0], 0, 0, var9.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(39);
					field408.method55(var5);
				}
			}

			if (var4 == 694) {
				field408.method19(148);
				field408.method21(var3);
				field408.method54(var2);
				field408.method21(var5);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 390) {
				FHQGDDHF var10 = field72[var5];
				if (var10 != null) {
					method192(var10.field1314[0], 1, field121.field1314[0], 0, 0, var10.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(25);
					field408.method21(var5);
				}
			}

			if (var4 == 800) {
				ADGLALPC var11 = field296[var5];
				if (var11 != null) {
					method192(var11.field1314[0], 1, field121.field1314[0], 0, 0, var11.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(242);
					field408.method21(var5);
				}
			}

			if (var4 == 248) {
				boolean var12 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
				if (!var12) {
					method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
				}

				field247 = field1404;
				field248 = field1405;
				field250 = 2;
				field249 = 0;
				field408.method19(119);
				field408.method54(field386 + var3);
				field408.method56(field385 + var2);
				field408.method54(var5);
			}

			if (var4 == 184) {
				FHQGDDHF var14 = field72[var5];
				if (var14 != null) {
					method192(var14.field1314[0], 1, field121.field1314[0], 0, 0, var14.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field477 += var5;
					if (field477 >= 88) {
						field408.method19(91);
						field408.method23(0xC2F810);
						field477 = 0;
					}

					field408.method19(126);
					field408.method55(var5);
				}
			}

			if (var4 == 1561) {
				ADGLALPC var15 = field296[var5];
				if (var15 != null) {
					OMIIKHIV var16 = var15.field1;
					if (var16.field992 != null) {
						var16 = var16.method446();
					}

					if (var16 != null) {
						String var17;
						if (var16.field1024 == null) {
							var17 = "It's a " + var16.field1013 + ".";
						} else {
							var17 = new String(var16.field1024);
						}

						method120(var17, "", 0);
					}
				}
			}

			if (var4 == 766) {
				field408.method19(44);
				field408.method21(var5);
				field408.method54(var2);
				field408.method55(var3);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 293) {
				field408.method19(200);
				field408.method21(var3);
				OPFNUBIN var18 = OPFNUBIN.field1033[var3];
				if (var18.field1031 != null && var18.field1031[0][0] == 5) {
					int var19 = var18.field1031[0][1];
					field351[var19] = 1 - field351[var19];
					method202(var19);
					field59 = true;
				}
			}

			if (var4 == 668) {
				ADGLALPC var20 = field296[var5];
				if (var20 != null) {
					method192(var20.field1314[0], 1, field121.field1314[0], 0, 0, var20.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(76);
					field408.method21(var5);
				}
			}

			if (var4 == 401) {
				boolean var21 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
				if (!var21) {
					method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
				}

				field247 = field1404;
				field248 = field1405;
				field250 = 2;
				field249 = 0;
				field408.method19(83);
				field408.method55(field386 + var3);
				field408.method21(field385 + var2);
				field408.method54(var5);
			}

			if (var4 == 233) {
				field408.method19(102);
				field408.method21(var3);
				field408.method56(var5);
				field408.method56(var2);
				field408.method54(field216);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 220) {
				ADGLALPC var23 = field296[var5];
				if (var23 != null) {
					method192(var23.field1314[0], 1, field121.field1314[0], 0, 0, var23.field1315[0], 2, 1, false, 0, field121.field1315[0]);
					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field294 += var5;
					if (field294 >= 92) {
						field408.method19(161);
						field408.method21(64442);
						field294 = 0;
					}

					field408.method19(183);
					field408.method55(var5);
				}
			}

			if (var4 == 406) {
				field408.method19(27);
				field408.method21(var3);
				field408.method54(var5);
				field408.method21(var2);
				field432 = 0;
				field433 = var3;
				field434 = var2;
				field435 = 2;
				if (OPFNUBIN.field1033[var3].field1041 == field412) {
					field435 = 1;
				}

				if (OPFNUBIN.field1033[var3].field1041 == field450) {
					field435 = 3;
				}
			}

			if (var4 == 542) {
				OPFNUBIN var24 = OPFNUBIN.field1033[var3];
				field215 = 1;
				field216 = var3;
				field217 = var24.field1070;
				field226 = 0;
				field59 = true;
				String var25 = var24.field1064;
				if (var25.indexOf(" ") != -1) {
					var25 = var25.substring(0, var25.indexOf(" "));
				}

				String var26 = var24.field1064;
				if (var26.indexOf(" ") != -1) {
					var26 = var26.substring(var26.indexOf(" ") + 1);
				}

				field218 = var25 + " " + var24.field1060 + " " + var26;

				if (field217 == 16) {
					field59 = true;
					field64 = 3;
					field363 = true;
				}
			} else if (var4 == 34) {
				field226 = 1;
				field227 = var2;
				field228 = var3;
				field229 = var5;
				field230 = JPUETSNB.method329(var5).field768;
				field215 = 0;
				field59 = true;
			} else {
				if (var4 == 1741) {
					int var27 = var5 >> 14 & 0x7FFF;
					QMZPELNG var28 = QMZPELNG.method486(var27);
					String var29;
					if (var28.field1180 == null) {
						var29 = "It's a " + var28.field1175 + ".";
					} else {
						var29 = new String(var28.field1180);
					}

					method120(var29, "", 0);
				}

				if (var4 == 921) {
					method195(var3, var2, var5);
					field408.method19(246);
					field408.method55(var5 >> 14 & 0x7FFF);
					field408.method55(field385 + var2);
					field408.method55(field386 + var3);
				}

				if (var4 == 277) {
					method195(var3, var2, var5);
					field408.method19(4);
					field408.method55(field386 + var3);
					field408.method55(field385 + var2);
					field408.method54(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 635) {
					method179();
				}

				if (var4 == 754) {
					field408.method19(200);
					field408.method21(var3);
					OPFNUBIN var30 = OPFNUBIN.field1033[var3];
					if (var30.field1031 != null && var30.field1031[0][0] == 5) {
						int var31 = var30.field1031[0][1];
						if (field351[var31] != var30.field1087[0]) {
							field351[var31] = var30.field1087[0];
							method202(var31);
							field59 = true;
						}
					}
				}

				if (var4 == 189) {
					if (field381) {
						field123.method534(var3 - 4, var2 - 4);
					} else {
						field123.method534(field1405 - 4, field1404 - 4);
					}
				}

				if (var4 == 1491) {
					JPUETSNB var32 = JPUETSNB.method329(var5);
					String var33;
					if (var32.field787 == null) {
						var33 = "It's a " + var32.field768 + ".";
					} else {
						var33 = new String(var32.field787);
					}

					method120(var33, "", 0);
				}

				if (var4 == 803) {
					ADGLALPC var34 = field296[var5];
					if (var34 != null) {
						method192(var34.field1314[0], 1, field121.field1314[0], 0, 0, var34.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(164);
						field408.method56(var5);
					}
				}

				if (var4 == 4) {
					boolean var35 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
					if (!var35) {
						method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
					}

					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(235);
					field408.method54(field386 + var3);
					field408.method21(var5);
					field408.method55(field216);
					field408.method55(field385 + var2);
				}

				if (var4 == 1881) {
					JPUETSNB var37 = JPUETSNB.method329(var5);
					OPFNUBIN var38 = OPFNUBIN.field1033[var3];
					String var39;
					if (var38 != null && var38.field1086[var2] >= 100000) {
						var39 = var38.field1086[var2] + " x " + var37.field768;
					} else if (var37.field787 == null) {
						var39 = "It's a " + var37.field768 + ".";
					} else {
						var39 = new String(var37.field787);
					}

					method120(var39, "", 0);
				}

				if (var4 == 371) {
					FHQGDDHF var40 = field72[var5];
					if (var40 != null) {
						method192(var40.field1314[0], 1, field121.field1314[0], 0, 0, var40.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(201);
						field408.method54(var5);
					}
				}

				if (var4 == 995) {
					FHQGDDHF var41 = field72[var5];
					if (var41 != null) {
						method192(var41.field1314[0], 1, field121.field1314[0], 0, 0, var41.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(16);
						field408.method54(field227);
						field408.method56(field229);
						field408.method56(field228);
						field408.method55(var5);
					}
				}

				if (var4 == 604) {
					boolean var42 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
					if (!var42) {
						method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
					}

					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(63);
					field408.method55(var5);
					field408.method21(field385 + var2);
					field408.method55(field386 + var3);
				}

				if (var4 == 82) {
					OPFNUBIN var44 = OPFNUBIN.field1033[var3];
					boolean var45 = true;
					if (var44.field1069 > 0) {
						var45 = method151(var44);
					}

					if (var45) {
						field408.method19(200);
						field408.method21(var3);
					}
				}

				if (var4 == 615) {
					field408.method19(193);
					field408.method56(var5);
					field408.method55(var3);
					field408.method55(var2);
					field432 = 0;
					field433 = var3;
					field434 = var2;
					field435 = 2;
					if (OPFNUBIN.field1033[var3].field1041 == field412) {
						field435 = 1;
					}

					if (OPFNUBIN.field1033[var3].field1041 == field450) {
						field435 = 3;
					}
				}

				if (var4 == 63) {
					boolean var46 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
					if (!var46) {
						method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
					}

					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(90);
					field408.method54(field385 + var2);
					field408.method54(field386 + var3);
					field408.method55(var5);
				}

				if (var4 == 860) {
					if ((field385 & 0x3) == 0) {
						field299++;
					}

					if (field299 >= 93) {
						field408.method19(204);
						field408.method23(160113);
						field299 = 0;
					}

					method195(var3, var2, var5);
					field408.method19(169);
					field408.method56(field386 + var3);
					field408.method54(field385 + var2);
					field408.method56(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 71 && !field367) {
					field408.method19(236);
					field408.method21(var3);
					field367 = true;
				}

				if (var4 == 263) {
					field408.method19(105);
					field408.method21(var3);
					field408.method56(var2);
					field408.method21(var5);
					field432 = 0;
					field433 = var3;
					field434 = var2;
					field435 = 2;
					if (OPFNUBIN.field1033[var3].field1041 == field412) {
						field435 = 1;
					}

					if (OPFNUBIN.field1033[var3].field1041 == field450) {
						field435 = 3;
					}
				}

				if (var4 == 255) {
					ADGLALPC var48 = field296[var5];
					if (var48 != null) {
						method192(var48.field1314[0], 1, field121.field1314[0], 0, 0, var48.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(47);
						field408.method56(var5);
					}
				}

				if (var4 == 382) {
					String var49 = field364[arg0];
					int var50 = var49.indexOf("@whi@");
					if (var50 != -1) {
						long var51 = ZDHYRWCV.method587(var49.substring(var50 + 5).trim());
						int var53 = -1;
						for (int var54 = 0; var54 < field316; var54++) {
							if (field274[var54] == var51) {
								var53 = var54;
								break;
							}
						}

						if (var53 != -1 && field160[var53] > 0) {
							field182 = true;
							field191 = 0;
							field90 = true;
							field424 = "";
							field192 = 3;
							field455 = field274[var53];
							field133 = "Enter message to send to " + field98[var53];
						}
					}
				}

				if (var4 == 279) {
					boolean var55 = method192(var2, 0, field121.field1314[0], 0, 0, var3, 2, 0, false, 0, field121.field1315[0]);
					if (!var55) {
						method192(var2, 1, field121.field1314[0], 0, 0, var3, 2, 1, false, 0, field121.field1315[0]);
					}

					field247 = field1404;
					field248 = field1405;
					field250 = 2;
					field249 = 0;
					field408.method19(220);
					field408.method56(field385 + var2);
					field408.method55(var5);
					field408.method56(field386 + var3);
				}

				if (var4 == 475) {
					FHQGDDHF var57 = field72[var5];
					if (var57 != null) {
						method192(var57.field1314[0], 1, field121.field1314[0], 0, 0, var57.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(115);
						field408.method55(var5);
						field408.method56(field216);
					}
				}

				if (var4 == 28 && method195(var3, var2, var5)) {
					field408.method19(167);
					field408.method56(field386 + var3);
					field408.method54(var5 >> 14 & 0x7FFF);
					field408.method21(field228);
					field408.method54(field385 + var2);
					field408.method55(field229);
					field408.method54(field227);
				}

				if (var4 == 917 || var4 == 235) {
					String var58 = field364[arg0];
					int var59 = var58.indexOf("@whi@");
					if (var59 != -1) {
						var58 = var58.substring(var59 + 5).trim();
						String var60 = ZDHYRWCV.method591(ZDHYRWCV.method588(ZDHYRWCV.method587(var58)));
						boolean var61 = false;
						for (int var62 = 0; var62 < field73; var62++) {
							FHQGDDHF var63 = field72[field74[var62]];
							if (var63 != null && var63.field611 != null && var63.field611.equalsIgnoreCase(var60)) {
								method192(var63.field1314[0], 1, field121.field1314[0], 0, 0, var63.field1315[0], 2, 1, false, 0, field121.field1315[0]);

								if (var4 == 917) {
									field408.method19(39);
									field408.method55(field74[var62]);
								}

								if (var4 == 235) {
									field408.method19(201);
									field408.method54(field74[var62]);
								}

								var61 = true;
								break;
							}
						}

						if (!var61) {
							method120("Unable to find " + var60, "", 0);
						}
					}
				}

				if (var4 == 471) {
					field408.method19(226);
					field408.method54(var2);
					field408.method55(var5);
					field408.method55(var3);
					field432 = 0;
					field433 = var3;
					field434 = var2;
					field435 = 2;
					if (OPFNUBIN.field1033[var3].field1041 == field412) {
						field435 = 1;
					}

					if (OPFNUBIN.field1033[var3].field1041 == field450) {
						field435 = 3;
					}
				}

				if (var4 == 1485) {
					field158++;
					if (field158 >= 136) {
						field408.method19(103);
						field408.method20(183);
						field158 = 0;
					}

					method195(var3, var2, var5);
					field408.method19(36);
					field408.method55(field385 + var2);
					field408.method55(field386 + var3);
					field408.method55(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 101) {
					FHQGDDHF var64 = field72[var5];
					if (var64 != null) {
						method192(var64.field1314[0], 1, field121.field1314[0], 0, 0, var64.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(12);
						field408.method21(var5);
					}
				}

				if (var4 == 48) {
					field207 += var5;
					if (field207 >= 90) {
						field408.method19(243);
						field408.method21(8335);
						field207 = 0;
					}

					field408.method19(94);
					field408.method56(var2);
					field408.method21(var3);
					field408.method56(var5);
					field432 = 0;
					field433 = var3;
					field434 = var2;
					field435 = 2;
					if (OPFNUBIN.field1033[var3].field1041 == field412) {
						field435 = 1;
					}

					if (OPFNUBIN.field1033[var3].field1041 == field450) {
						field435 = 3;
					}
				}

				if (var4 == 693) {
					ADGLALPC var65 = field296[var5];
					if (var65 != null) {
						method192(var65.field1314[0], 1, field121.field1314[0], 0, 0, var65.field1315[0], 2, 1, false, 0, field121.field1315[0]);
						field247 = field1404;
						field248 = field1405;
						field250 = 2;
						field249 = 0;
						field408.method19(223);
						field408.method54(field229);
						field408.method56(var5);
						field408.method55(field227);
						field408.method54(field228);
					}
				}

				if (var4 == 50 || var4 == 992 || var4 == 748 || var4 == 806) {
					String var66 = field364[arg0];
					int var67 = var66.indexOf("@whi@");
					if (var67 != -1) {
						long var68 = ZDHYRWCV.method587(var66.substring(var67 + 5).trim());
						if (var4 == 50) {
							method200(var68);
						}

						if (var4 == 992) {
							method116(var68);
						}

						if (var4 == 748) {
							method117(var68);
						}

						if (var4 == 806) {
							method215(var68);
						}
					}
				}

				if (var4 == 464 && method195(var3, var2, var5)) {
					field408.method19(51);
					field408.method54(var5 >> 14 & 0x7FFF);
					field408.method55(field386 + var3);
					field408.method56(field385 + var2);
					field408.method56(field216);
				}

				if (var4 == 215) {
					method195(var3, var2, var5);
					field408.method19(245);
					field408.method21(field385 + var2);
					field408.method55(field386 + var3);
					field408.method56(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 853) {
					String var70 = field364[arg0];
					int var71 = var70.indexOf("@whi@");
					if (var71 != -1) {
						if (field412 == -1) {
							method179();
							field366 = var70.substring(var71 + 5).trim();
							field304 = false;

							for (int var72 = 0; var72 < OPFNUBIN.field1033.length; var72++) {
								if (OPFNUBIN.field1033[var72] != null && OPFNUBIN.field1033[var72].field1069 == 600) {
									field122 = field412 = OPFNUBIN.field1033[var72].field1041;
									break;
								}
							}
						} else {
							method120("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}

				if (var4 == 607) {
					field408.method19(233);
					field408.method55(var3);
					field408.method55(var5);
					field408.method56(var2);
					field432 = 0;
					field433 = var3;
					field434 = var2;
					field435 = 2;
					if (OPFNUBIN.field1033[var3].field1041 == field412) {
						field435 = 1;
					}

					if (OPFNUBIN.field1033[var3].field1041 == field450) {
						field435 = 3;
					}
				}

				field226 = 0;
				field215 = 0;
				field59 = true;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method81() {
		int var1 = field178;
		int var2 = field179;
		int var3 = field180;
		int var4 = field181;
		int var5 = 0x5D5447;
		OKWPDMPE.method436(var1, var2, var5, var3, var4);
		OKWPDMPE.method436(var1 + 1, var2 + 1, 0, var3 - 2, 16);
		OKWPDMPE.method437(var4 - 19, var2 + 18, var1 + 1, 0, var3 - 2);
		field222.method282("Choose Option", var1 + 3, var5, var2 + 14);
		int var6 = field1397;
		int var7 = field1398;
		if (field177 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field177 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field177 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field225; var8++) {
			int var9 = (field225 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field222.method286(var10, field364[var8], var1 + 3, true, var9);
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method82() {
		while (true) {
			int var1 = method581();
			if (var1 == -1) {
				return;
			}

			if (field412 != -1 && field412 == field122) {
				if (var1 == 8 && field366.length() > 0) {
					field366 = field366.substring(0, field366.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field366.length() < 12) {
					field366 = field366 + (char) var1;
				}
			} else if (field90) {
				if (var1 >= 32 && var1 <= 122 && field424.length() < 80) {
					field424 = field424 + (char) var1;
					field182 = true;
				}

				if (var1 == 8 && field424.length() > 0) {
					field424 = field424.substring(0, field424.length() - 1);
					field182 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field90 = false;
					field182 = true;

					if (field192 == 1) {
						long var2 = ZDHYRWCV.method587(field424);
						method200(var2);
					}

					if (field192 == 2 && field316 > 0) {
						long var4 = ZDHYRWCV.method587(field424);
						method117(var4);
					}

					if (field192 == 3 && field424.length() > 0) {
						field408.method19(74);
						field408.method20(0);
						int var6 = field408.field44;
						field408.method26(field455);
						EDPSKMQR.method268(field424, field408);
						field408.method29(field408.field44 - var6);
						field424 = EDPSKMQR.method269(field424);
						field424 = MUWLFOWQ.method382(field424);
						method120(field424, ZDHYRWCV.method591(ZDHYRWCV.method588(field455)), 6);

						if (field139 == 2) {
							field139 = 1;
							field473 = true;
							field408.method19(55);
							field408.method20(field371);
							field408.method20(field139);
							field408.method20(field119);
						}
					}

					if (field192 == 4 && field321 < 100) {
						long var7 = ZDHYRWCV.method587(field424);
						method116(var7);
					}

					if (field192 == 5 && field321 > 0) {
						long var9 = ZDHYRWCV.method587(field424);
						method215(var9);
					}
				}
			} else if (field191 == 1) {
				if (var1 >= 48 && var1 <= 57 && field151.length() < 10) {
					field151 = field151 + (char) var1;
					field182 = true;
				}

				if (var1 == 8 && field151.length() > 0) {
					field151 = field151.substring(0, field151.length() - 1);
					field182 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field151.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field151);
						} catch (Exception var21) {
						}

						field408.method19(116);
						field408.method24(var11);
					}

					field191 = 0;
					field182 = true;
				}
			} else if (field191 == 2) {
				if (var1 >= 32 && var1 <= 122 && field151.length() < 12) {
					field151 = field151 + (char) var1;
					field182 = true;
				}

				if (var1 == 8 && field151.length() > 0) {
					field151 = field151.substring(0, field151.length() - 1);
					field182 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field151.length() > 0) {
						field408.method19(209);
						field408.method26(ZDHYRWCV.method587(field151));
					}

					field191 = 0;
					field182 = true;
				}
			} else if (field450 == -1) {
				if (var1 >= 32 && var1 <= 122 && field350.length() < 80) {
					field350 = field350 + (char) var1;
					field182 = true;
				}

				if (var1 == 8 && field350.length() > 0) {
					field350 = field350.substring(0, field350.length() - 1);
					field182 = true;
				}

				if ((var1 == 13 || var1 == 10) && field350.length() > 0) {
					if (field286 == 2) {
						if (field350.equals("::clientdrop")) {
							method88();
						}

						if (field350.equals("::lag")) {
							method148();
						}

						if (field350.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field288.method419(2); var12++) {
								field288.method413((byte) 1, 2, var12);
							}
						}

						if (field350.equals("::fpson")) {
							field141 = true;
						}

						if (field350.equals("::fpsoff")) {
							field141 = false;
						}

						if (field350.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field457[var13].field667[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field350.startsWith("::")) {
						field408.method19(221);
						field408.method20(field350.length() - 1);
						field408.method27(field350.substring(2));
					} else {
						String var16 = field350.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field350 = field350.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field350 = field350.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field350 = field350.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field350 = field350.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field350 = field350.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field350 = field350.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field350 = field350.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field350 = field350.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field350 = field350.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field350 = field350.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field350 = field350.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field350 = field350.substring(6);
						}

						String var18 = field350.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field350 = field350.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field350 = field350.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field350 = field350.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field350 = field350.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field350 = field350.substring(6);
						}

						field408.method19(92);
						field408.method20(0);
						int var20 = field408.field44;
						field295.field44 = 0;
						EDPSKMQR.method268(field350, field295);
						field408.method66(field295.field44, field295.field43, 0);
						field408.method47(var19);
						field408.method46(var17);
						field408.method29(field408.field44 - var20);
						field350 = EDPSKMQR.method269(field350);
						field350 = MUWLFOWQ.method382(field350);
						field121.field1342 = field350;
						field121.field1311 = var17;
						field121.field1304 = var19;
						field121.field1336 = 150;

						if (field286 == 2) {
							method120(field121.field1342, "@cr2@" + field121.field611, 2);
						} else if (field286 == 1) {
							method120(field121.field1342, "@cr1@" + field121.field611, 2);
						} else {
							method120(field121.field1342, field121.field611, 2);
						}

						if (field371 == 2) {
							field371 = 3;
							field473 = true;
							field408.method19(55);
							field408.method20(field371);
							field408.method20(field139);
							field408.method20(field119);
						}
					}

					field350 = "";
					field182 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LOMIIKHIV;IIII)V")
	public final void method83(OMIIKHIV arg0, int arg1, int arg2, int arg3) {
		if (field225 < 400) {
			if (arg0.field992 != null) {
				arg0 = arg0.method446();
			}

			if (arg0 != null && arg0.field1023) {
				String var5 = arg0.field1013;
				if (arg0.field991 != 0) {
					var5 = var5 + method189(arg0.field991, field121.field604) + " (level-" + arg0.field991 + ")";
				}

				if (field226 == 1) {
					field364[field225] = "Use " + field230 + " with @yel@" + var5;
					field405[field225] = 693;
					field406[field225] = arg2;
					field403[field225] = arg1;
					field404[field225] = arg3;
					field225++;
				} else if (field215 != 1) {
					if (arg0.field1017 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1017[var6] != null && !arg0.field1017[var6].equalsIgnoreCase("attack")) {
								field364[field225] = arg0.field1017[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field405[field225] = 803;
								}

								if (var6 == 1) {
									field405[field225] = 220;
								}

								if (var6 == 2) {
									field405[field225] = 668;
								}

								if (var6 == 3) {
									field405[field225] = 800;
								}

								if (var6 == 4) {
									field405[field225] = 255;
								}

								field406[field225] = arg2;
								field403[field225] = arg1;
								field404[field225] = arg3;
								field225++;
							}
						}
					}

					if (arg0.field1017 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1017[var7] != null && arg0.field1017[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field991 > field121.field604) {
									var8 = 2000;
								}

								field364[field225] = arg0.field1017[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field405[field225] = var8 + 803;
								}

								if (var7 == 1) {
									field405[field225] = var8 + 220;
								}

								if (var7 == 2) {
									field405[field225] = var8 + 668;
								}

								if (var7 == 3) {
									field405[field225] = var8 + 800;
								}

								if (var7 == 4) {
									field405[field225] = var8 + 255;
								}

								field406[field225] = arg2;
								field403[field225] = arg1;
								field404[field225] = arg3;
								field225++;
							}
						}
					}

					field364[field225] = "Examine @yel@" + var5;
					field405[field225] = 1561;
					field406[field225] = arg2;
					field403[field225] = arg1;
					field404[field225] = arg3;
					field225++;
				} else if ((field217 & 0x2) == 2) {
					field364[field225] = field218 + " @yel@" + var5;
					field405[field225] = 31;
					field406[field225] = arg2;
					field403[field225] = arg1;
					field404[field225] = arg3;
					field225++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method84(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method85() {
		field237 = false;
		while (field260) {
			field237 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field322 = null;
		field323 = null;
		field411 = null;
		field445 = null;
		field446 = null;
		field447 = null;
		field448 = null;
		field166 = null;
		field167 = null;
		field428 = null;
		field429 = null;
		field212 = null;
		field213 = null;
	}

	@ObfuscatedName("client.a(ILFDCAWVRL;)V")
	public final void method86(FDCAWVRL arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field166.length; var3++) {
			field166[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field166[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field167[var9] = (field166[var9 - 1] + field166[var9 + 1] + field166[var9 - 128] + field166[var9 + 128]) / 4;
				}
			}

			int[] var10 = field166;
			field166 = field167;
			field167 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field590; var12++) {
				for (int var13 = 0; var13 < arg0.field589; var13++) {
					if (arg0.field587[var11++] != 0) {
						int var14 = var13 + arg0.field591 + 16;
						int var15 = var12 + arg0.field592 + 16;
						int var16 = (var15 << 7) + var14;
						field166[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)Ljava/net/Socket;")
	public final Socket method87(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method88() {
		if (field190 > 0) {
			method154();
		} else {
			field253.method264();
			field221.method278(144, "Connection lost", 0, 257);
			field221.method278(143, "Connection lost", 0xFFFFFF, 256);
			field221.method278(159, "Please wait - attempting to reestablish", 0, 257);
			field221.method278(158, "Please wait - attempting to reestablish", 0xFFFFFF, 256);
			field253.method265(4, 4, field1389);
			field442 = 0;
			field114 = 0;
			QHZQTTDB var1 = field256;
			field430 = false;
			field157 = 0;
			method114(field392, field393, true);

			if (!field430) {
				method154();
			}

			try {
				var1.method469();
			} catch (Exception var2) {
			}
		}
	}

	public final void init() {
		field269 = Integer.parseInt(getParameter("nodeid"));
		field270 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method214();
		} else {
			method122();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field271 = false;
		} else {
			field271 = true;
		}

		method578(503, 765);
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method89(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method90(int arg0, int arg1) {
		boolean var3 = false;
		OPFNUBIN var4 = OPFNUBIN.field1033[arg1];
		for (int var5 = 0; var5 < var4.field1052.length && var4.field1052[var5] != -1; var5++) {
			OPFNUBIN var6 = OPFNUBIN.field1033[var4.field1052[var5]];
			if (var6.field1084 == 1) {
				var3 |= method90(arg0, var6.field1027);
			}

			if (var6.field1084 == 6 && (var6.field1072 != -1 || var6.field1073 != -1)) {
				boolean var7 = method204(var6);
				int var8;
				if (var7) {
					var8 = var6.field1073;
				} else {
					var8 = var6.field1072;
				}

				if (var8 != -1) {
					IUTBNGPH var9 = IUTBNGPH.field682[var8];
					var6.field1050 += arg0;
					while (var6.field1050 > var9.method322(var6.field1085)) {
						var6.field1050 -= var9.method322(var6.field1085) + 1;
						var6.field1085++;
						if (var6.field1085 >= var9.field683) {
							var6.field1085 -= var9.field687;
							if (var6.field1085 < 0 || var6.field1085 >= var9.field683) {
								var6.field1085 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1084 == 6 && var6.field1048 != 0) {
				int var10 = var6.field1048 >> 16;
				int var11 = var6.field1048 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1056 = var6.field1056 + var10 & 0x7FF;
				var6.field1057 = var6.field1057 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method91() {
		try {
			field458 = -1;
			field100.method75();
			field441.method75();
			UJNRJRYE.method550();
			method203();
			field123.method496();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field457[var1].method300();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field308[var2][var3][var4] = 0;
					}
				}
			}

			DIFHBVBT var5 = new DIFHBVBT(104, 104, field360, field308);
			int var6 = field344.length;
			field408.method19(241);

			if (!field399) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field479[var7] >> 8) * 64 - field385;
					int var9 = (field479[var7] & 0xFF) * 64 - field386;
					byte[] var10 = field344[var7];
					if (var10 != null) {
						var5.method246(var8, var10, (field368 - 6) * 8, (field369 - 6) * 8, var9, field457);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field479[var11] >> 8) * 64 - field385;
					int var13 = (field479[var11] & 0xFF) * 64 - field386;
					byte[] var14 = field344[var11];
					if (var14 == null && field369 < 800) {
						var5.method236(var13, 64, 64, var12);
					}
				}

				field120++;
				if (field120 > 138) {
					field120 = 0;
					field408.method19(180);
					field408.method23(0xD55260);
				}

				field408.method19(241);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field117[var15];
					if (var16 != null) {
						int var17 = (field479[var15] >> 8) * 64 - field385;
						int var18 = (field479[var15] & 0xFF) * 64 - field386;
						var5.method253(field123, field457, var16, var18, var17);
					}
				}
			}

			if (field399) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field140[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field479.length; var28++) {
									if (field479[var28] == var27 && field344[var28] != null) {
										var5.method252(var23, (var26 & 0x7) * 8, field344[var28], var19, (var25 & 0x7) * 8, field457, var24, var20 * 8, var21 * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field140[0][var29][var30];
						if (var31 == -1) {
							var5.method236(var30 * 8, 8, 8, var29 * 8);
						}
					}
				}

				field408.method19(241);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field140[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field479.length; var41++) {
									if (field479[var41] == var40 && field117[var41] != null) {
										var5.method251(field117[var41], (var39 & 0x7) * 8, field457, var32, var36, var33 * 8, field123, var34 * 8, var37, (var38 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field408.method19(241);
			var5.method247(field123, field457);
			field253.method264();
			field408.method19(241);
			int var42 = DIFHBVBT.field522;
			if (var42 > field246) {
				var42 = field246;
			}

			if (var42 < field246 - 1) {
				int var43 = field246 - 1;
			}

			if (field272) {
				field123.method497(DIFHBVBT.field522);
			} else {
				field123.method497(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method150(var44, var45);
				}
			}

			method167();
		} catch (Exception var58) {
		}

		QMZPELNG.field1162.method371();

		if (field1392 != null) {
			field408.method19(128);
			field408.method24(1057001181);
		}

		if (field272 && signlink.cache_dat != null) {
			int var47 = field288.method419(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field288.method422(var48);
				if ((var49 & 0x79) == 0) {
					LFTMDGKK.method340(var48);
				}
			}
		}

		System.gc();
		UJNRJRYE.method551(20);
		field288.method425();
		int var50 = (field368 - 6) / 8 - 1;
		int var51 = (field368 + 6) / 8 + 1;
		int var52 = (field369 - 6) / 8 - 1;
		int var53 = (field369 + 6) / 8 + 1;
		if (field452) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field288.method424(0, var55, var54);
					if (var56 != -1) {
						field288.method421(var56, 3);
					}

					int var57 = field288.method424(1, var55, var54);
					if (var57 != -1) {
						field288.method421(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBILCUKAGIIJ;)V")
	public final void method92(int arg0, int arg1, CUKAGIIJ arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field291 + field275 & 0x7FF;
			int var6 = LFTMDGKK.field883[var5];
			int var7 = LFTMDGKK.field884[var5];
			var6 = var6 * 256 / (field231 + 256);
			var7 = var7 * 256 / (field231 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field318.method228(20, 83 - var13 - 20, 20, var10, 15, 256, 15, var12 + 94 + 4 - 10);
		} else {
			method159(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		IFXJSFHR var10 = null;
		for (IFXJSFHR var11 = (IFXJSFHR) field451.method71(); var11 != null; var11 = (IFXJSFHR) field451.method73()) {
			if (var11.field674 == arg7 && var11.field676 == arg2 && var11.field677 == arg5 && var11.field675 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new IFXJSFHR();
			var10.field674 = arg7;
			var10.field675 = arg3;
			var10.field676 = arg2;
			var10.field677 = arg5;
			method79(var10);
			field451.method68(var10);
		}

		var10.field668 = arg6;
		var10.field670 = arg0;
		var10.field669 = arg1;
		var10.field679 = arg8;
		var10.field678 = arg4;
	}

	@ObfuscatedName("client.f(I)I")
	public final int method94() {
		int var1 = 3;
		if (field376 < 310) {
			int var2 = field373 >> 7;
			int var3 = field375 >> 7;
			int var4 = field121.field1333 >> 7;
			int var5 = field121.field1334 >> 7;

			if ((field308[field246][var2][var3] & 0x4) != 0) {
				var1 = field246;
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

					if ((field308[field246][var2][var3] & 0x4) != 0) {
						var1 = field246;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field308[field246][var2][var3] & 0x4) != 0) {
							var1 = field246;
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

					if ((field308[field246][var2][var3] & 0x4) != 0) {
						var1 = field246;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field308[field246][var2][var3] & 0x4) != 0) {
							var1 = field246;
						}
					}
				}
			}
		}

		if ((field308[field246][field121.field1333 >> 7][field121.field1334 >> 7] & 0x4) != 0) {
			var1 = field246;
		}

		return var1;
	}

	@ObfuscatedName("client.g(I)I")
	public final int method95() {
		int var1 = method197(field373, field246, field375);
		if (var1 - field374 < 800 && (field308[field246][field373 >> 7][field375 >> 7] & 0x4) != 0) {
			return field246;
		}

		return 3;
	}

	@ObfuscatedName("client.a(LOPFNUBIN;Z)Z")
	public final boolean method96(OPFNUBIN arg0) {
		int var2 = arg0.field1069;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field364[field225] = "Remove @whi@" + arg0.field1080;
				field405[field225] = 806;
				field225++;
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

		field364[field225] = "Remove @whi@" + field98[var2];
		field405[field225] = 748;
		field225++;
		field364[field225] = "Message @whi@" + field98[var2];
		field405[field225] = 382;
		field225++;
		return true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method97() {
		while (true) {
			NDLPOBEC var1 = field288.method417();
			if (var1 == null) {
				return;
			}

			if (var1.field938 == 0) {
				LFTMDGKK.method339(var1.field939, var1.field936);

				if ((field288.method422(var1.field939) & 0x62) != 0) {
					field59 = true;

					if (field450 != -1) {
						field182 = true;
					}
				}
			}

			if (var1.field938 == 1 && var1.field936 != null) {
				CANZHIOT.method14(var1.field936);
			}

			if (var1.field938 == 2 && field240 == var1.field939 && var1.field936 != null) {
				method100(var1.field936, field241);
			}

			if (var1.field938 == 3 && field255 == 1) {
				for (int var2 = 0; var2 < field344.length; var2++) {
					if (field480[var2] == var1.field939) {
						field344[var2] = var1.field936;

						if (var1.field936 == null) {
							field480[var2] = -1;
						}

						break;
					}

					if (field481[var2] == var1.field939) {
						field117[var2] = var1.field936;

						if (var1.field936 == null) {
							field481[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field938 == 93 && field288.method414(var1.field939)) {
				DIFHBVBT.method244(new CFARFRSG(var1.field936), field288);
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method98() {
		try {
			int var1 = field121.field1333 + field470;
			int var2 = field121.field1334 + field475;
			if (field129 - var1 < -500 || field129 - var1 > 500 || field130 - var2 < -500 || field130 - var2 > 500) {
				field129 = var1;
				field130 = var2;
			}

			if (field129 != var1) {
				field129 += (var1 - field129) / 16;
			}

			if (field130 != var2) {
				field130 += (var2 - field130) / 16;
			}

			if (field1407[1] == 1) {
				field292 += (-field292 - 24) / 2;
			} else if (field1407[2] == 1) {
				field292 += (24 - field292) / 2;
			} else {
				field292 /= 2;
			}

			if (field1407[3] == 1) {
				field293 += (12 - field293) / 2;
			} else if (field1407[4] == 1) {
				field293 += (-field293 - 12) / 2;
			} else {
				field293 /= 2;
			}

			field291 = field292 / 2 + field291 & 0x7FF;
			field290 += field293 / 2;
			if (field290 < 128) {
				field290 = 128;
			}

			if (field290 > 383) {
				field290 = 383;
			}

			field427++;
			if (field427 > 60) {
				field427 = 0;
				field408.method19(64);
			}

			int var3 = field129 >> 7;
			int var4 = field130 >> 7;
			int var5 = method197(field129, field246, field130);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field246;
						if (var9 < 3 && (field308[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field360[var9][var7][var8];
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

			if (var11 > field264) {
				field264 += (var11 - field264) / 24;
			} else if (var11 < field264) {
				field264 += (var11 - field264) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field121.field1333 + "," + field121.field1334 + "," + field129 + "," + field130 + "," + field368 + "," + field369 + "," + field385 + "," + field386);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method99() {
		if (field206 || field197 || field361) {
			method165();
		} else {
			field211++;

			if (field430) {
				method175();
			} else {
				method211(false);
			}

			field466 = 0;
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method100(byte[] arg0, boolean arg1) {
		if (field289) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method101() {
		if (field225 >= 2 || field226 != 0 || field215 != 0) {
			String var1;
			if (field226 == 1 && field225 < 2) {
				var1 = "Use " + field230 + " with...";
			} else if (field215 == 1 && field225 < 2) {
				var1 = field218 + "...";
			} else {
				var1 = field364[field225 - 1];
			}

			if (field225 > 2) {
				var1 = var1 + "@whi@ / " + (field225 - 2) + " more options";
			}

			field222.method287(var1, 15, field145 / 1000, 0xFFFFFF, true, 4);
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method102() {
		if (field1403 == 1) {
			if (field1404 >= 539 && field1404 <= 573 && field1405 >= 169 && field1405 < 205 && field97[0] != -1) {
				field59 = true;
				field64 = 0;
				field363 = true;
			}

			if (field1404 >= 569 && field1404 <= 599 && field1405 >= 168 && field1405 < 205 && field97[1] != -1) {
				field59 = true;
				field64 = 1;
				field363 = true;
			}

			if (field1404 >= 597 && field1404 <= 627 && field1405 >= 168 && field1405 < 205 && field97[2] != -1) {
				field59 = true;
				field64 = 2;
				field363 = true;
			}

			if (field1404 >= 625 && field1404 <= 669 && field1405 >= 168 && field1405 < 203 && field97[3] != -1) {
				field59 = true;
				field64 = 3;
				field363 = true;
			}

			if (field1404 >= 666 && field1404 <= 696 && field1405 >= 168 && field1405 < 205 && field97[4] != -1) {
				field59 = true;
				field64 = 4;
				field363 = true;
			}

			if (field1404 >= 694 && field1404 <= 724 && field1405 >= 168 && field1405 < 205 && field97[5] != -1) {
				field59 = true;
				field64 = 5;
				field363 = true;
			}

			if (field1404 >= 722 && field1404 <= 756 && field1405 >= 169 && field1405 < 205 && field97[6] != -1) {
				field59 = true;
				field64 = 6;
				field363 = true;
			}

			if (field1404 >= 540 && field1404 <= 574 && field1405 >= 466 && field1405 < 502 && field97[7] != -1) {
				field59 = true;
				field64 = 7;
				field363 = true;
			}

			if (field1404 >= 572 && field1404 <= 602 && field1405 >= 466 && field1405 < 503 && field97[8] != -1) {
				field59 = true;
				field64 = 8;
				field363 = true;
			}

			if (field1404 >= 599 && field1404 <= 629 && field1405 >= 466 && field1405 < 503 && field97[9] != -1) {
				field59 = true;
				field64 = 9;
				field363 = true;
			}

			if (field1404 >= 627 && field1404 <= 671 && field1405 >= 467 && field1405 < 502 && field97[10] != -1) {
				field59 = true;
				field64 = 10;
				field363 = true;
			}

			if (field1404 >= 669 && field1404 <= 699 && field1405 >= 466 && field1405 < 503 && field97[11] != -1) {
				field59 = true;
				field64 = 11;
				field363 = true;
			}

			if (field1404 >= 696 && field1404 <= 726 && field1405 >= 466 && field1405 < 503 && field97[12] != -1) {
				field59 = true;
				field64 = 12;
				field363 = true;
			}

			if (field1404 >= 724 && field1404 <= 758 && field1405 >= 466 && field1405 < 502 && field97[13] != -1) {
				field59 = true;
				field64 = 13;
				field363 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method103() {
		if (field284 != 0) {
			int var1 = 0;
			if (field410 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field69[var2] != null) {
					int var3 = field67[var2];
					String var4 = field68[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field139 == 0 || field139 == 1 && method158(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1397 > 4 && field1398 - 4 > var8 - 10 && field1398 - 4 <= var8 + 3) {
							int var9 = field221.method280("From:  " + var4 + field69[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1397 < var9 + 4) {
								if (field286 >= 1) {
									field364[field225] = "Report abuse @whi@" + var4;
									field405[field225] = 2853;
									field225++;
								}

								field364[field225] = "Add ignore @whi@" + var4;
								field405[field225] = 2992;
								field225++;
								field364[field225] = "Add friend @whi@" + var4;
								field405[field225] = 2050;
								field225++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field139 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method104() {
		if (field108 == 0) {
			int var1 = field1387 / 2 - 80;
			int var2 = field1388 / 2 + 20;
			var2 += 20;
			if (field1403 == 1 && field1404 >= var1 - 75 && field1404 <= var1 + 75 && field1405 >= var2 - 20 && field1405 <= var2 + 20) {
				field108 = 3;
				field303 = 0;
			}

			int var3 = field1387 / 2 + 80;
			if (field1403 == 1 && field1404 >= var3 - 75 && field1404 <= var3 + 75 && field1405 >= var2 - 20 && field1405 <= var2 + 20) {
				field184 = "";
				field185 = "Enter your username & password.";
				field108 = 2;
				field303 = 0;
			}
		} else if (field108 == 2) {
			int var4 = field1388 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1403 == 1 && field1405 >= var4 - 15 && field1405 < var4) {
				field303 = 0;
			}

			var4 += 15;
			if (field1403 == 1 && field1405 >= var4 - 15 && field1405 < var4) {
				field303 = 1;
			}

			var4 += 15;
			int var5 = field1387 / 2 - 80;
			int var6 = field1388 / 2 + 50;
			var6 += 20;
			if (field1403 == 1 && field1404 >= var5 - 75 && field1404 <= var5 + 75 && field1405 >= var6 - 20 && field1405 <= var6 + 20) {
				field157 = 0;
				method114(field392, field393, false);

				if (field430) {
					return;
				}
			}

			int var7 = field1387 / 2 + 80;
			if (field1403 == 1 && field1404 >= var7 - 75 && field1404 <= var7 + 75 && field1405 >= var6 - 20 && field1405 <= var6 + 20) {
				field108 = 0;
				field392 = "";
				field393 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method581();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field147.length(); var10++) {
					if (var8 == field147.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field303 == 0) {
					if (var8 == 8 && field392.length() > 0) {
						field392 = field392.substring(0, field392.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field303 = 1;
					}

					if (var9) {
						field392 = field392 + (char) var8;
					}

					if (field392.length() > 12) {
						field392 = field392.substring(0, 12);
					}
				} else if (field303 == 1) {
					if (var8 == 8 && field393.length() > 0) {
						field393 = field393.substring(0, field393.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field303 = 0;
					}

					if (var9) {
						field393 = field393 + (char) var8;
					}

					if (field393.length() > 20) {
						field393 = field393.substring(0, 20);
					}
				}
			}
		} else if (field108 == 3) {
			int var11 = field1387 / 2;
			int var12 = field1388 / 2 + 50;
			var12 += 20;
			if (field1403 == 1 && field1404 >= var11 - 75 && field1404 <= var11 + 75 && field1405 >= var12 - 20 && field1405 <= var12 + 20) {
				field108 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILVNAWUDPP;I)V")
	public final void method105(int arg0, VNAWUDPP arg1) {
		method106(arg1.field1333, arg0, arg1.field1334);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method106(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method197(arg0, field246, arg2) - arg1;
			arg0 -= field373;
			var4 -= field374;
			arg2 -= field375;
			int var5 = LFTMDGKK.field883[field376];
			int var6 = LFTMDGKK.field884[field376];
			int var7 = LFTMDGKK.field883[field377];
			int var8 = LFTMDGKK.field884[field377];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field353 = (var9 << 9) / arg2 + UJNRJRYE.field1284;
				field354 = (var11 << 9) / arg2 + UJNRJRYE.field1285;
			} else {
				field353 = -1;
				field354 = -1;
			}
		} else {
			field353 = -1;
			field354 = -1;
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method107(boolean arg0) {
		for (int var2 = 0; var2 < field297; var2++) {
			ADGLALPC var3 = field296[field298[var2]];
			int var4 = (field298[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method2() && var3.field1.field1002 == arg0 && var3.field1.method447()) {
				int var5 = var3.field1333 >> 7;
				int var6 = var3.field1334 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1343 == 1 && (var3.field1333 & 0x7F) == 0x40 && (var3.field1334 & 0x7F) == 0x40) {
						if (field61[var5][var6] == field384) {
							continue;
						}

						field61[var5][var6] = field384;
					}

					if (!var3.field1.field1023) {
						var4 += Integer.MIN_VALUE;
					}

					field123.method507(var3, var3.field1335, var3.field1337, var3.field1333, field246, (var3.field1343 - 1) * 64 + 60, var3.field1334, var4, method197(var3.field1333, field246, var3.field1334));
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method108() {
		if (field272 && field255 == 2 && DIFHBVBT.field513 != field246) {
			field253.method264();
			field221.method278(151, "Loading - please wait.", 0, 257);
			field221.method278(150, "Loading - please wait.", 0xFFFFFF, 256);
			field253.method265(4, 4, field1389);
			field255 = 1;
			field146 = System.currentTimeMillis();
		}

		if (field255 == 1) {
			int var1 = method109();
			if (var1 != 0 && System.currentTimeMillis() - field146 > 360000L) {
				signlink.reporterror(field392 + " glcfb " + field142 + "," + var1 + "," + field272 + "," + field268[0] + "," + field288.method410() + "," + field246 + "," + field368 + "," + field369);
				field146 = System.currentTimeMillis();
			}
		}

		if (field255 == 2 && field458 != field246) {
			field458 = field246;
			method136(field246);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int method109() {
		for (int var1 = 0; var1 < field344.length; var1++) {
			if (field344[var1] == null && field480[var1] != -1) {
				return -1;
			}

			if (field117[var1] == null && field481[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field344.length; var3++) {
			byte[] var4 = field117[var3];
			if (var4 != null) {
				int var5 = (field479[var3] >> 8) * 64 - field385;
				int var6 = (field479[var3] & 0xFF) * 64 - field386;
				if (field399) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= DIFHBVBT.method240(var6, var5, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field478) {
			return -4;
		} else {
			field255 = 2;
			DIFHBVBT.field513 = field246;
			method91();
			field408.method19(212);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IILCFARFRSG;)V")
	public final void method110(int arg0, CFARFRSG arg1) {
		field143 = 0;
		field75 = 0;
		method128(arg0, arg1);
		method184(arg0, arg1);
		method127(arg0, arg1);
		method147(arg1, arg0);

		for (int var3 = 0; var3 < field143; var3++) {
			int var4 = field144[var3];
			if (field145 != field72[var4].field1316) {
				field72[var4] = null;
			}
		}

		if (arg1.field44 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field44 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field73; var5++) {
			if (field72[field74[var5]] == null) {
				signlink.reporterror(field392 + " null entry in pl list - pos:" + var5 + " size:" + field73);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method111() {
		if (field1403 == 1) {
			if (field1404 >= 6 && field1404 <= 106 && field1405 >= 467 && field1405 <= 499) {
				field371 = (field371 + 1) % 4;
				field473 = true;
				field182 = true;
				field408.method19(55);
				field408.method20(field371);
				field408.method20(field139);
				field408.method20(field119);
			}

			if (field1404 >= 135 && field1404 <= 235 && field1405 >= 467 && field1405 <= 499) {
				field139 = (field139 + 1) % 3;
				field473 = true;
				field182 = true;
				field408.method19(55);
				field408.method20(field371);
				field408.method20(field139);
				field408.method20(field119);
			}

			if (field1404 >= 273 && field1404 <= 373 && field1405 >= 467 && field1405 <= 499) {
				field119 = (field119 + 1) % 3;
				field473 = true;
				field182 = true;
				field408.method19(55);
				field408.method20(field371);
				field408.method20(field139);
				field408.method20(field119);
			}

			if (field1404 >= 412 && field1404 <= 512 && field1405 >= 467 && field1405 <= 499) {
				if (field412 == -1) {
					method179();
					field366 = "";
					field304 = false;

					for (int var1 = 0; var1 < OPFNUBIN.field1033.length; var1++) {
						if (OPFNUBIN.field1033[var1] != null && OPFNUBIN.field1033[var1].field1069 == 600) {
							field122 = field412 = OPFNUBIN.field1033[var1].field1041;
							return;
						}
					}

					return;
				}

				method120("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method112() {
		if (field79 == null) {
			field1390 = null;
			field254 = null;
			field252 = null;
			field251 = null;
			field253 = null;
			field153 = null;
			field154 = null;
			field155 = null;
			field82 = new EDCVNWGU(method149(), 265, 128);
			OKWPDMPE.method434();
			field83 = new EDCVNWGU(method149(), 265, 128);
			OKWPDMPE.method434();
			field79 = new EDCVNWGU(method149(), 171, 509);
			OKWPDMPE.method434();
			field80 = new EDCVNWGU(method149(), 132, 360);
			OKWPDMPE.method434();
			field81 = new EDCVNWGU(method149(), 200, 360);
			OKWPDMPE.method434();
			field84 = new EDCVNWGU(method149(), 238, 202);
			OKWPDMPE.method434();
			field85 = new EDCVNWGU(method149(), 238, 203);
			OKWPDMPE.method434();
			field86 = new EDCVNWGU(method149(), 94, 74);
			OKWPDMPE.method434();
			field87 = new EDCVNWGU(method149(), 94, 75);
			OKWPDMPE.method434();

			if (field482 != null) {
				method164();
				method166();
			}

			field164 = true;
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method113(int arg0) {
		OPFNUBIN var2 = OPFNUBIN.field1033[arg0];
		for (int var3 = 0; var3 < var2.field1052.length && var2.field1052[var3] != -1; var3++) {
			OPFNUBIN var4 = OPFNUBIN.field1033[var2.field1052[var3]];
			if (var4.field1084 == 1) {
				method113(var4.field1027);
			}

			var4.field1085 = 0;
			var4.field1050 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method114(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field184 = "";
				field185 = "Connecting to server...";
				method211(true);
			}

			field256 = new QHZQTTDB(method87(field270 + 43594), this);
			long var4 = ZDHYRWCV.method587(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field408.field44 = 0;
			field408.method20(14);
			field408.method20(var6);
			field256.method473(field408.field43, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field256.method470();
			}

			int var8 = field256.method470();
			int var9 = var8;

			if (var8 == 0) {
				field256.method472(field365.field43, 0, 8);
				field365.field44 = 0;
				field142 = field365.method36();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field142 >> 32), (int) field142 };
				field408.field44 = 0;
				field408.method20(10);
				field408.method24(var10[0]);
				field408.method24(var10[1]);
				field408.method24(var10[2]);
				field408.method24(var10[3]);
				field408.method24(signlink.uid);
				field408.method27(arg0);
				field408.method27(arg1);
				field408.method45(field95, field261);
				field474.field44 = 0;

				if (arg2) {
					field474.method20(18);
				} else {
					field474.method20(16);
				}

				field474.method20(field408.field44 + 36 + 1 + 1 + 2);
				field474.method20(255);
				field474.method21(332);
				field474.method20(field272 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field474.method24(field327[var11]);
				}

				field474.method28(0, field408.field44, field408.field43);
				field408.field48 = new QKKVGPGN(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field401 = new QKKVGPGN(var10);
				field256.method473(field474.field43, 0, field474.field44);
				var8 = field256.method470();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method114(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field286 = field256.method470();
				field383 = field256.method470() == 1;
				field233 = 0L;
				field159 = 0;
				field198.field563 = 0;
				field1394 = true;
				field195 = true;
				field430 = true;
				field408.field44 = 0;
				field365.field44 = 0;
				field187 = -1;
				field208 = -1;
				field209 = -1;
				field210 = -1;
				field186 = 0;
				field188 = 0;
				field410 = 0;
				field190 = 0;
				field362 = 0;
				field225 = 0;
				field381 = false;
				field1395 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field69[var13] = null;
				}

				field226 = 0;
				field215 = 0;
				field255 = 0;
				field148 = 0;
				field470 = (int) (Math.random() * 100.0D) - 50;
				field475 = (int) (Math.random() * 110.0D) - 55;
				field379 = (int) (Math.random() * 80.0D) - 40;
				field275 = (int) (Math.random() * 120.0D) - 60;
				field231 = (int) (Math.random() * 30.0D) - 20;
				field291 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field442 = 0;
				field458 = -1;
				field114 = 0;
				field115 = 0;
				field73 = 0;
				field297 = 0;

				for (int var14 = 0; var14 < field70; var14++) {
					field72[var14] = null;
					field77[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field296[var15] = null;
				}

				field121 = field72[field71] = new FHQGDDHF();
				field441.method75();
				field100.method75();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field78[var16][var17][var18] = null;
						}
					}
				}

				field451 = new CLCMCMIN();
				field317 = 0;
				field316 = 0;
				field287 = -1;
				field450 = -1;
				field412 = -1;
				field245 = -1;
				field326 = -1;
				field199 = -1;
				field367 = false;
				field64 = 3;
				field191 = 0;
				field381 = false;
				field90 = false;
				field183 = null;
				field402 = 0;
				field400 = -1;
				field389 = true;
				method138();

				for (int var19 = 0; var19 < 5; var19++) {
					field243[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field127[var20] = null;
					field128[var20] = false;
				}

				field158 = 0;
				field207 = 0;
				field477 = 0;
				field294 = 0;
				field299 = 0;
				method186();
			} else if (var8 == 3) {
				field184 = "";
				field185 = "Invalid username or password.";
			} else if (var8 == 4) {
				field184 = "Your account has been disabled.";
				field185 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field184 = "Your account is already logged in.";
				field185 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field184 = "RuneScape has been updated!";
				field185 = "Please reload this page.";
			} else if (var8 == 7) {
				field184 = "This world is full.";
				field185 = "Please use a different world.";
			} else if (var8 == 8) {
				field184 = "Unable to connect.";
				field185 = "Login server offline.";
			} else if (var8 == 9) {
				field184 = "Login limit exceeded.";
				field185 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field184 = "Unable to connect.";
				field185 = "Bad session id.";
			} else if (var8 == 11) {
				field184 = "Login server rejected session.";
				field185 = "Please try again.";
			} else if (var8 == 12) {
				field184 = "You need a members account to login to this world.";
				field185 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field184 = "Could not complete login.";
				field185 = "Please try using a different world.";
			} else if (var8 == 14) {
				field184 = "The server is being updated.";
				field185 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field430 = true;
				field408.field44 = 0;
				field365.field44 = 0;
				field187 = -1;
				field208 = -1;
				field209 = -1;
				field210 = -1;
				field186 = 0;
				field188 = 0;
				field410 = 0;
				field225 = 0;
				field381 = false;
				field146 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field184 = "Login attempts exceeded.";
				field185 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field184 = "You are standing in a members-only area.";
				field185 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field184 = "Invalid loginserver requested";
				field185 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field256.method470();
				for (var21 += 3; var21 >= 0; var21--) {
					field184 = "You have only just left another world";
					field185 = "Your profile will be transferred in: " + var21;
					method211(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method114(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field184 = "Malformed login packet.";
				field185 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field184 = "Unexpected server response";
				field185 = "Please try using a different world.";
			} else if (var9 != 0) {
				field184 = "No response from server";
				field185 = "Please try using a different world.";
			} else if (field157 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field157++;
				method114(arg0, arg1, arg2);
			} else {
				field184 = "No response from loginserver";
				field185 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field184 = "";
			field185 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method115() {
		for (int var1 = -1; var1 < field73; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field71;
			} else {
				var2 = field74[var1];
			}

			FHQGDDHF var3 = field72[var2];
			if (var3 != null) {
				method169(1, var3);
			}
		}

		field325++;
		if (field325 > 198) {
			field325 = 0;
			field408.method19(152);
			field408.method20(137);
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method116(long arg0) {
		if (arg0 != 0L) {
			if (field321 >= 100) {
				method120("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = ZDHYRWCV.method591(ZDHYRWCV.method588(arg0));
				for (int var4 = 0; var4 < field321; var4++) {
					if (field262[var4] == arg0) {
						method120(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field316; var5++) {
					if (field274[var5] == arg0) {
						method120("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field262[field321++] = arg0;
				field59 = true;
				field408.method19(35);
				field408.method26(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method117(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field316; var3++) {
				if (field274[var3] == arg0) {
					field316--;
					field59 = true;

					for (int var4 = var3; var4 < field316; var4++) {
						field98[var4] = field98[var4 + 1];
						field160[var4] = field160[var4 + 1];
						field274[var4] = field274[var4 + 1];
					}

					field408.method19(215);
					field408.method26(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method118() {
		if (!field206 && !field197 && !field361) {
			field145++;

			if (field430) {
				method193();
			} else {
				method104();
			}

			method97();
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method119() {
		if (field255 == 2) {
			for (IFXJSFHR var1 = (IFXJSFHR) field451.method71(); var1 != null; var1 = (IFXJSFHR) field451.method73()) {
				if (var1.field678 > 0) {
					var1.field678--;
				}

				if (var1.field678 != 0) {
					if (var1.field679 > 0) {
						var1.field679--;
					}

					if (var1.field679 == 0 && var1.field676 >= 1 && var1.field677 >= 1 && var1.field676 <= 102 && var1.field677 <= 102 && (var1.field668 < 0 || DIFHBVBT.method243(var1.field668, var1.field670))) {
						method77(var1.field674, var1.field668, var1.field677, var1.field670, var1.field676, var1.field669, var1.field675);
						var1.field679 = -1;

						if (var1.field671 == var1.field668 && var1.field671 == -1) {
							var1.method582();
						} else if (var1.field671 == var1.field668 && var1.field672 == var1.field669 && var1.field673 == var1.field670) {
							var1.method582();
						}
					}
				} else if (var1.field671 < 0 || DIFHBVBT.method243(var1.field671, var1.field673)) {
					method77(var1.field674, var1.field671, var1.field677, var1.field673, var1.field676, var1.field672, var1.field675);
					var1.method582();
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method120(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field287 != -1) {
			field183 = arg0;
			field1403 = 0;
		}

		if (field450 == -1) {
			field182 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field67[var4] = field67[var4 - 1];
			field68[var4] = field68[var4 - 1];
			field69[var4] = field69[var4 - 1];
		}

		field67[0] = arg2;
		field68[0] = arg1;
		field69[0] = arg0;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method121() {
		int var1 = field329 * 128 + 64;
		int var2 = field330 * 128 + 64;
		int var3 = method197(var1, field246, var2) - field331;

		if (field373 < var1) {
			field373 += (var1 - field373) * field333 / 1000 + field332;
			if (field373 > var1) {
				field373 = var1;
			}
		}

		if (field373 > var1) {
			field373 -= (field373 - var1) * field333 / 1000 + field332;
			if (field373 < var1) {
				field373 = var1;
			}
		}

		if (field374 < var3) {
			field374 += (var3 - field374) * field333 / 1000 + field332;
			if (field374 > var3) {
				field374 = var3;
			}
		}

		if (field374 > var3) {
			field374 -= (field374 - var3) * field333 / 1000 + field332;
			if (field374 < var3) {
				field374 = var3;
			}
		}

		if (field375 < var2) {
			field375 += (var2 - field375) * field333 / 1000 + field332;
			if (field375 > var2) {
				field375 = var2;
			}
		}

		if (field375 > var2) {
			field375 -= (field375 - var2) * field333 / 1000 + field332;
			if (field375 < var2) {
				field375 = var2;
			}
		}

		int var4 = field394 * 128 + 64;
		int var5 = field395 * 128 + 64;
		int var6 = method197(var4, field246, var5) - field396;
		int var7 = var4 - field373;
		int var8 = var6 - field374;
		int var9 = var5 - field375;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field376 < var11) {
			field376 += (var11 - field376) * field398 / 1000 + field397;
			if (field376 > var11) {
				field376 = var11;
			}
		}

		if (field376 > var11) {
			field376 -= (field376 - var11) * field398 / 1000 + field397;
			if (field376 < var11) {
				field376 = var11;
			}
		}

		int var13 = var12 - field377;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field377 += field398 * var13 / 1000 + field397;
			field377 &= 0x7FF;
		}

		if (var13 < 0) {
			field377 -= -var13 * field398 / 1000 + field397;
			field377 &= 0x7FF;
		}

		int var14 = var12 - field377;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field377 = var12;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public static final void method122() {
		SIPXLNWG.field1209 = false;
		UJNRJRYE.field1279 = false;
		field272 = false;
		DIFHBVBT.field521 = false;
		QMZPELNG.field1148 = false;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method123() {
		field260 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field237) {
				field88++;
				method180();
				method180();
				method205();
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

		field260 = false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method124() {
		if (field284 != 0) {
			FDMAFIMR var1 = field221;
			int var2 = 0;
			if (field410 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field69[var3] != null) {
					int var4 = field67[var3];
					String var5 = field68[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field139 == 0 || field139 == 1 && method158(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method282("From", var8, 0, var7);
						var1.method282("From", var8, 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method280("From ");
						if (var6 == 1) {
							field267[0].method275(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field267[1].method275(var11, var7 - 12);
							var11 += 14;
						}

						var1.method282(var5 + ": " + field69[var3], var11, 0, var7);
						var1.method282(var5 + ": " + field69[var3], var11, 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field139 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method282(field69[var3], 4, 0, var9);
						var1.method282(field69[var3], 4, 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field139 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method282("To " + var5 + ": " + field69[var3], 4, 0, var10);
						var1.method282("To " + var5 + ": " + field69[var3], 4, 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILOPFNUBIN;IIIII)V")
	public final void method125(int arg0, int arg1, OPFNUBIN arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.field1084 == 0 && arg2.field1052 != null && !arg2.field1077 && (arg3 >= arg1 && arg6 >= arg5 && arg3 <= arg2.field1042 + arg1 && arg6 <= arg2.field1054 + arg5)) {
			int var8 = arg2.field1052.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.field1090[var9] + arg1;
				int var11 = arg2.field1063[var9] + arg5 - arg4;
				OPFNUBIN var12 = OPFNUBIN.field1033[arg2.field1052[var9]];
				var10 += var12.field1082;
				var11 += var12.field1081;
				if ((var12.field1028 >= 0 || var12.field1051 != 0) && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
					if (var12.field1028 >= 0) {
						field305 = var12.field1028;
					} else {
						field305 = var12.field1027;
					}
				}

				if (var12.field1084 == 8 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
					field338 = var12.field1027;
				}

				if (var12.field1084 == 0) {
					method125(arg0, var10, var12, arg3, var12.field1078, var11, arg6);

					if (var12.field1074 > var12.field1054) {
						method155(var12, arg3, var11, var12.field1054, var12.field1042 + var10, arg0, arg6, var12.field1074);
					}
				} else {
					if (var12.field1068 == 1 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						boolean var13 = false;
						if (var12.field1069 != 0) {
							var13 = method96(var12);
						}

						if (!var13) {
							field364[field225] = var12.field1037;
							field405[field225] = 82;
							field404[field225] = var12.field1027;
							field225++;
						}
					}

					if (var12.field1068 == 2 && field215 == 0 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						String var14 = var12.field1064;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field364[field225] = var14 + " @gre@" + var12.field1060;
						field405[field225] = 542;
						field404[field225] = var12.field1027;
						field225++;
					}

					if (var12.field1068 == 3 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						field364[field225] = "Close";
						field405[field225] = 635;
						field404[field225] = var12.field1027;
						field225++;
					}

					if (var12.field1068 == 4 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						field364[field225] = var12.field1037;
						field405[field225] = 293;
						field404[field225] = var12.field1027;
						field225++;
					}

					if (var12.field1068 == 5 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						field364[field225] = var12.field1037;
						field405[field225] = 754;
						field404[field225] = var12.field1027;
						field225++;
					}

					if (var12.field1068 == 6 && !field367 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field1042 + var10 && arg6 < var12.field1054 + var11) {
						field364[field225] = var12.field1037;
						field405[field225] = 71;
						field404[field225] = var12.field1027;
						field225++;
					}

					if (var12.field1084 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1054; var16++) {
							for (int var17 = 0; var17 < var12.field1042; var17++) {
								int var18 = (var12.field1045 + 32) * var17 + var10;
								int var19 = (var12.field1038 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1029[var15];
									var19 += var12.field1076[var15];
								}

								if (arg3 >= var18 && arg6 >= var19 && arg3 < var18 + 32 && arg6 < var19 + 32) {
									field390 = var15;
									field391 = var12.field1027;

									if (var12.field1062[var15] > 0) {
										JPUETSNB var20 = JPUETSNB.method329(var12.field1062[var15] - 1);
										if (field226 == 1 && var12.field1030) {
											if (field228 != var12.field1027 || field227 != var15) {
												field364[field225] = "Use " + field230 + " with @lre@" + var20.field768;
												field405[field225] = 751;
												field406[field225] = var20.field765;
												field403[field225] = var15;
												field404[field225] = var12.field1027;
												field225++;
											}
										} else if (field215 != 1 || !var12.field1030) {
											if (var12.field1030) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field769 != null && var20.field769[var21] != null) {
														field364[field225] = var20.field769[var21] + " @lre@" + var20.field768;

														if (var21 == 3) {
															field405[field225] = 471;
														}

														if (var21 == 4) {
															field405[field225] = 694;
														}

														field406[field225] = var20.field765;
														field403[field225] = var15;
														field404[field225] = var12.field1027;
														field225++;
													} else if (var21 == 4) {
														field364[field225] = "Drop @lre@" + var20.field768;
														field405[field225] = 694;
														field406[field225] = var20.field765;
														field403[field225] = var15;
														field404[field225] = var12.field1027;
														field225++;
													}
												}
											}

											if (var12.field1066) {
												field364[field225] = "Use @lre@" + var20.field768;
												field405[field225] = 34;
												field406[field225] = var20.field765;
												field403[field225] = var15;
												field404[field225] = var12.field1027;
												field225++;
											}

											if (var12.field1030 && var20.field769 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field769[var22] != null) {
														field364[field225] = var20.field769[var22] + " @lre@" + var20.field768;

														if (var22 == 0) {
															field405[field225] = 766;
														}

														if (var22 == 1) {
															field405[field225] = 406;
														}

														if (var22 == 2) {
															field405[field225] = 263;
														}

														field406[field225] = var20.field765;
														field403[field225] = var15;
														field404[field225] = var12.field1027;
														field225++;
													}
												}
											}

											if (var12.field1088 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1088[var23] != null) {
														field364[field225] = var12.field1088[var23] + " @lre@" + var20.field768;

														if (var23 == 0) {
															field405[field225] = 607;
														}

														if (var23 == 1) {
															field405[field225] = 48;
														}

														if (var23 == 2) {
															field405[field225] = 615;
														}

														if (var23 == 3) {
															field405[field225] = 500;
														}

														if (var23 == 4) {
															field405[field225] = 534;
														}

														field406[field225] = var20.field765;
														field403[field225] = var15;
														field404[field225] = var12.field1027;
														field225++;
													}
												}
											}

											field364[field225] = "Examine @lre@" + var20.field768;
											field405[field225] = 1881;
											field406[field225] = var20.field765;
											field403[field225] = var15;
											field404[field225] = var12.field1027;
											field225++;
										} else if ((field217 & 0x10) == 0x10) {
											field364[field225] = field218 + " @lre@" + var20.field768;
											field405[field225] = 233;
											field406[field225] = var20.field765;
											field403[field225] = var15;
											field404[field225] = var12.field1027;
											field225++;
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

	@ObfuscatedName("client.a(IIILOPFNUBIN;B)V")
	public final void method126(int arg0, int arg1, int arg2, OPFNUBIN arg3) {
		if (arg3.field1084 == 0 && arg3.field1052 != null && (!arg3.field1077 || field449 == arg3.field1027 || field66 == arg3.field1027 || field460 == arg3.field1027)) {
			int var5 = OKWPDMPE.field984;
			int var6 = OKWPDMPE.field982;
			int var7 = OKWPDMPE.field985;
			int var8 = OKWPDMPE.field983;
			OKWPDMPE.method433(arg3.field1042 + arg0, arg3.field1054 + arg2, arg0, arg2);
			int var9 = arg3.field1052.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field1090[var10] + arg0;
				int var12 = arg3.field1063[var10] + arg2 - arg1;
				OPFNUBIN var13 = OPFNUBIN.field1033[arg3.field1052[var10]];
				var11 += var13.field1082;
				var12 += var13.field1081;

				if (var13.field1069 > 0) {
					method176(var13);
				}

				if (var13.field1084 == 0) {
					if (var13.field1078 > var13.field1074 - var13.field1054) {
						var13.field1078 = var13.field1074 - var13.field1054;
					}

					if (var13.field1078 < 0) {
						var13.field1078 = 0;
					}

					method126(var11, var13.field1078, var12, var13);

					if (var13.field1074 > var13.field1054) {
						method161(var12, var13.field1074, var13.field1078, var13.field1042 + var11, var13.field1054);
					}
				} else if (var13.field1084 != 1) {
					if (var13.field1084 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1054; var15++) {
							for (int var16 = 0; var16 < var13.field1042; var16++) {
								int var17 = (var13.field1045 + 32) * var16 + var11;
								int var18 = (var13.field1038 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1029[var14];
									var18 += var13.field1076[var14];
								}

								if (var13.field1062[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1062[var14] - 1;
									if (var17 > OKWPDMPE.field984 - 32 && var17 < OKWPDMPE.field985 && var18 > OKWPDMPE.field982 - 32 && var18 < OKWPDMPE.field983 || field111 != 0 && field110 == var14) {
										int var22 = 0;
										if (field226 == 1 && field227 == var14 && field228 == var13.field1027) {
											var22 = 0xFFFFFF;
										}

										CUKAGIIJ var23 = JPUETSNB.method336(var22, var21, var13.field1086[var14]);
										if (var23 != null) {
											if (field111 != 0 && field110 == var14 && field109 == var13.field1027) {
												var19 = field1397 - field112;
												var20 = field1398 - field113;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field94 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method225(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < OKWPDMPE.field982 && arg3.field1078 > 0) {
													int var24 = (OKWPDMPE.field982 - var18 - var20) * field320 / 3;
													if (var24 > field320 * 10) {
														var24 = field320 * 10;
													}

													if (var24 > arg3.field1078) {
														var24 = arg3.field1078;
													}

													arg3.field1078 -= var24;
													field113 += var24;
												}

												if (var18 + var20 + 32 > OKWPDMPE.field983 && arg3.field1078 < arg3.field1074 - arg3.field1054) {
													int var25 = (var18 + var20 + 32 - OKWPDMPE.field983) * field320 / 3;
													if (var25 > field320 * 10) {
														var25 = field320 * 10;
													}

													if (var25 > arg3.field1074 - arg3.field1054 - arg3.field1078) {
														var25 = arg3.field1074 - arg3.field1054 - arg3.field1078;
													}

													arg3.field1078 += var25;
													field113 -= var25;
												}
											} else if (field435 != 0 && field434 == var14 && field433 == var13.field1027) {
												var23.method225(var18, var17, 128);
											} else {
												var23.method223(var17, var18);
											}

											if (var23.field489 == 33 || var13.field1086[var14] != 1) {
												int var26 = var13.field1086[var14];
												field220.method282(method201(var26), var17 + var19 + 1, 0, var18 + var20 + 10);
												field220.method282(method201(var26), var17 + var19, 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1043 != null && var14 < 20) {
									CUKAGIIJ var27 = var13.field1043[var14];
									if (var27 != null) {
										var27.method223(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1084 == 3) {
						boolean var28 = false;
						if (field460 == var13.field1027 || field66 == var13.field1027 || field449 == var13.field1027) {
							var28 = true;
						}

						int var29;
						if (method204(var13)) {
							var29 = var13.field1071;
							if (var28 && var13.field1089 != 0) {
								var29 = var13.field1089;
							}
						} else {
							var29 = var13.field1067;
							if (var28 && var13.field1051 != 0) {
								var29 = var13.field1051;
							}
						}

						if (var13.field1046 == 0) {
							if (var13.field1075) {
								OKWPDMPE.method436(var11, var12, var29, var13.field1042, var13.field1054);
							} else {
								OKWPDMPE.method437(var13.field1054, var12, var11, var29, var13.field1042);
							}
						} else if (var13.field1075) {
							OKWPDMPE.method435(var13.field1054, var29, var11, var13.field1042, var12, 256 - (var13.field1046 & 0xFF));
						} else {
							OKWPDMPE.method438(var12, var11, var29, 256 - (var13.field1046 & 0xFF), var13.field1042, var13.field1054);
						}
					} else if (var13.field1084 == 4) {
						FDMAFIMR var30 = var13.field1044;
						String var31 = var13.field1080;
						boolean var32 = false;
						if (field460 == var13.field1027 || field66 == var13.field1027 || field449 == var13.field1027) {
							var32 = true;
						}

						int var33;
						if (method204(var13)) {
							var33 = var13.field1071;
							if (var32 && var13.field1089 != 0) {
								var33 = var13.field1089;
							}

							if (var13.field1053.length() > 0) {
								var31 = var13.field1053;
							}
						} else {
							var33 = var13.field1067;
							if (var32 && var13.field1051 != 0) {
								var33 = var13.field1051;
							}
						}

						if (var13.field1068 == 6 && field367) {
							var31 = "Please wait...";
							var33 = var13.field1067;
						}

						if (OKWPDMPE.field980 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field601 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method89(method194(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method89(method194(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method89(method194(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method89(method194(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method89(method194(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1092) {
								var30.method279(var33, var41, var34, var13.field1035, var13.field1042 / 2 + var11);
							} else {
								var30.method286(var33, var41, var11, var13.field1035, var34);
							}

							var34 += var30.field601;
						}
					} else if (var13.field1084 == 5) {
						CUKAGIIJ var42;
						if (method204(var13)) {
							var42 = var13.field1034;
						} else {
							var42 = var13.field1091;
						}

						if (var42 != null) {
							var42.method223(var11, var12);
						}
					} else if (var13.field1084 == 6) {
						int var43 = UJNRJRYE.field1284;
						int var44 = UJNRJRYE.field1285;
						UJNRJRYE.field1284 = var13.field1042 / 2 + var11;
						UJNRJRYE.field1285 = var13.field1054 / 2 + var12;
						int var45 = UJNRJRYE.field1288[var13.field1056] * var13.field1055 >> 16;
						int var46 = UJNRJRYE.field1289[var13.field1056] * var13.field1055 >> 16;
						boolean var47 = method204(var13);
						int var48;
						if (var47) {
							var48 = var13.field1073;
						} else {
							var48 = var13.field1072;
						}

						LFTMDGKK var49;
						if (var48 == -1) {
							var49 = var13.method453(var47, -1, -1);
						} else {
							IUTBNGPH var50 = IUTBNGPH.field682[var48];
							var49 = var13.method453(var47, var50.field685[var13.field1085], var50.field684[var13.field1085]);
						}

						if (var49 != null) {
							var49.method361(0, var13.field1057, 0, var13.field1056, 0, var45, var46);
						}

						UJNRJRYE.field1284 = var43;
						UJNRJRYE.field1285 = var44;
					} else {
						if (var13.field1084 == 7) {
							FDMAFIMR var51 = var13.field1044;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1054; var53++) {
								for (int var54 = 0; var54 < var13.field1042; var54++) {
									if (var13.field1062[var52] > 0) {
										JPUETSNB var55 = JPUETSNB.method329(var13.field1062[var52] - 1);
										String var56 = var55.field768;
										if (var55.field793 || var13.field1086[var52] != 1) {
											var56 = var56 + " x" + method188(var13.field1086[var52]);
										}

										int var57 = (var13.field1045 + 115) * var54 + var11;
										int var58 = (var13.field1038 + 12) * var53 + var12;
										if (var13.field1092) {
											var51.method279(var13.field1067, var56, var58, var13.field1035, var13.field1042 / 2 + var57);
										} else {
											var51.method286(var13.field1067, var56, var57, var13.field1035, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1084 == 8 && (field359 == var13.field1027 || field238 == var13.field1027 || field118 == var13.field1027)) {
							int var59 = 0;
							int var60 = 0;
							FDMAFIMR var61 = field221;
							String var62 = var13.field1080;
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

								int var65 = var61.method280(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field601 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1042 + var11 - var59 - 5;
							int var67 = var13.field1054 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = field227 + 5;
							}

							OKWPDMPE.method436(var66, var67, 0xFFFFA0, var59, var60);
							OKWPDMPE.method437(var60, var67, var66, 0, var59);
							String var68 = var13.field1080;
							int var69 = var61.field601 + var67 + 2;
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

								var61.method286(0, var71, var66 + 3, false, var69);
								var69 += var61.field601 + 1;
							}
						}
					}
				}
			}

			OKWPDMPE.method433(var7, var8, var5, var6);
		}
	}

	@ObfuscatedName("client.a(ILCFARFRSG;Z)V")
	public final void method127(int arg0, CFARFRSG arg1) {
		while (arg1.field45 + 10 < arg0 * 8) {
			int var3 = arg1.method41(11);
			if (var3 == 2047) {
				break;
			}

			if (field72[var3] == null) {
				field72[var3] = new FHQGDDHF();
				if (field77[var3] != null) {
					field72[var3].method295(field77[var3]);
				}
			}

			field74[field73++] = var3;
			FHQGDDHF var4 = field72[var3];
			var4.field1316 = field145;
			int var5 = arg1.method41(1);
			if (var5 == 1) {
				field76[field75++] = var3;
			}

			int var6 = arg1.method41(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method41(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method41(1);
			var4.method565(var8 == 1, field121.field1315[0] + var6, field121.field1314[0] + var7);
		}

		arg1.method42();
	}

	@ObfuscatedName("client.b(IILCFARFRSG;)V")
	public final void method128(int arg0, CFARFRSG arg1) {
		arg1.method40();
		int var3 = arg1.method41(1);
		if (var3 != 0) {
			int var4 = arg1.method41(2);
			if (var4 == 0) {
				field76[field75++] = field71;
			} else if (var4 == 1) {
				int var5 = arg1.method41(3);
				field121.method566(var5, false);
				int var6 = arg1.method41(1);
				if (var6 == 1) {
					field76[field75++] = field71;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method41(3);
				field121.method566(var7, true);
				int var8 = arg1.method41(3);
				field121.method566(var8, true);
				int var9 = arg1.method41(1);
				if (var9 == 1) {
					field76[field75++] = field71;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method41(1);
				int var11 = arg1.method41(7);
				int var12 = arg1.method41(7);
				int var13 = arg1.method41(1);
				if (var13 == 1) {
					field76[field75++] = field71;
				}

				field246 = arg1.method41(2);
				field121.method565(var10 == 1, var12, var11);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method129(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method129(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method130(int arg0) {
		if (!field272) {
			if (UJNRJRYE.field1298[17] >= arg0) {
				FDCAWVRL var2 = UJNRJRYE.field1292[17];
				int var3 = var2.field590 * var2.field589 - 1;
				int var4 = field320 * var2.field589 * 2;
				byte[] var5 = var2.field587;
				byte[] var6 = field194;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field587 = var6;
				field194 = var5;
				UJNRJRYE.method554(17);
			}

			if (UJNRJRYE.field1298[24] >= arg0) {
				FDCAWVRL var8 = UJNRJRYE.field1292[24];
				int var9 = var8.field590 * var8.field589 - 1;
				int var10 = field320 * var8.field589 * 2;
				byte[] var11 = var8.field587;
				byte[] var12 = field194;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field587 = var12;
				field194 = var11;
				UJNRJRYE.method554(24);
			}

			if (UJNRJRYE.field1298[34] >= arg0) {
				FDCAWVRL var14 = UJNRJRYE.field1292[34];
				int var15 = var14.field590 * var14.field589 - 1;
				int var16 = field320 * var14.field589 * 2;
				byte[] var17 = var14.field587;
				byte[] var18 = field194;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field587 = var18;
				field194 = var17;
				UJNRJRYE.method554(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LCFARFRSG;ZI)V")
	public final void method131(CFARFRSG arg0, int arg1) {
		field143 = 0;
		field75 = 0;
		method144(arg1, arg0);
		method212(arg0, arg1);
		method183(arg0, arg1);

		for (int var3 = 0; var3 < field143; var3++) {
			int var4 = field144[var3];
			if (field145 != field296[var4].field1316) {
				field296[var4].field1 = null;
				field296[var4] = null;
			}
		}

		if (arg0.field44 != arg1) {
			signlink.reporterror(field392 + " size mismatch in getnpcpos - pos:" + arg0.field44 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field297; var5++) {
			if (field296[field298[var5]] == null) {
				signlink.reporterror(field392 + " null entry in npc list - pos:" + var5 + " size:" + field297);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method132() {
		method124();

		if (field250 == 1) {
			field283[field249 / 100].method223(field247 - 8 - 4, field248 - 8 - 4);
		}

		if (field250 == 2) {
			field283[field249 / 100 + 4].method223(field247 - 8 - 4, field248 - 8 - 4);
			field62++;
			if (field62 > 64) {
				field62 = 0;
				field408.method19(109);
			}
		}

		if (field199 != -1) {
			method90(field320, field199);
			method126(0, 0, 0, OPFNUBIN.field1033[field199]);
		}

		if (field412 != -1) {
			method90(field320, field412);
			method126(0, 0, 0, OPFNUBIN.field1033[field412]);
		}

		method133();

		if (!field381) {
			method134();
			method101();
		} else if (field177 == 0) {
			method81();
		}

		if (field402 == 1) {
			field312[1].method223(472, 296);
		}

		if (field141) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1385 < 15) {
				var3 = 0xFF0000;
			}

			field221.method277(var2, "Fps:" + field1385, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field272) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field272) {
				int var8 = 0xFF0000;
			}

			field221.method277(var2, "Mem:" + var5 + "k", var1, 0xFFFF00);
			var2 += 15;
		}

		if (field410 != 0) {
			int var9 = field410 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field221.method282("System update in: " + var10 + ":0" + var9, 4, 0xFFFF00, 329);
			} else {
				field221.method282("System update in: " + var10 + ":" + var9, 4, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method133() {
		field335 = 0;
		int var1 = (field121.field1333 >> 7) + field385;
		int var2 = (field121.field1334 >> 7) + field386;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field335 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field335 = 1;
		}

		if (field335 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field335 = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method134() {
		if (field111 == 0) {
			field364[0] = "Cancel";
			field405[0] = 1822;
			field225 = 1;
			method103();
			field305 = 0;
			field338 = 0;

			if (field1397 > 4 && field1398 > 4 && field1397 < 516 && field1398 < 338) {
				if (field412 == -1) {
					method182();
				} else {
					method125(0, 4, OPFNUBIN.field1033[field412], field1397, 0, 4, field1398);
				}
			}

			if (field449 != field305) {
				field449 = field305;
			}

			if (field338 != field118) {
				field118 = field338;
			}

			field305 = 0;
			field338 = 0;

			if (field1397 > 553 && field1398 > 205 && field1397 < 743 && field1398 < 466) {
				if (field326 != -1) {
					method125(1, 553, OPFNUBIN.field1033[field326], field1397, 0, 205, field1398);
				} else if (field97[field64] != -1) {
					method125(1, 553, OPFNUBIN.field1033[field97[field64]], field1397, 0, 205, field1398);
				}
			}

			if (field66 != field305) {
				field59 = true;
				field66 = field305;
			}

			if (field338 != field238) {
				field59 = true;
				field238 = field338;
			}

			field305 = 0;
			field338 = 0;

			if (field1397 > 17 && field1398 > 357 && field1397 < 496 && field1398 < 453) {
				if (field450 != -1) {
					method125(2, 17, OPFNUBIN.field1033[field450], field1397, 0, 357, field1398);
				} else if (field287 != -1) {
					method125(2, 17, OPFNUBIN.field1033[field287], field1397, 0, 357, field1398);
				} else if (field1398 < 434 && field1397 < 426) {
					method181(field1398 - 357, field1397 - 17);
				}
			}

			if (field450 != -1 && field460 != field305) {
				field182 = true;
				field460 = field305;
			}

			if (field450 != -1 && field359 != field338) {
				field182 = true;
				field359 = field338;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field225 - 1; var2++) {
					if (field405[var2] < 1000 && field405[var2 + 1] > 1000) {
						String var3 = field364[var2];
						field364[var2] = field364[var2 + 1];
						field364[var2 + 1] = var3;
						int var4 = field405[var2];
						field405[var2] = field405[var2 + 1];
						field405[var2 + 1] = var4;
						int var5 = field403[var2];
						field403[var2] = field403[var2 + 1];
						field403[var2 + 1] = var5;
						int var6 = field404[var2];
						field404[var2] = field404[var2 + 1];
						field404[var2 + 1] = var6;
						int var7 = field406[var2];
						field406[var2] = field406[var2 + 1];
						field406[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;II)LVSUYIIVA;")
	public final VSUYIIVA method135(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field268[0] != null) {
				var6 = field268[0].method459(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field259.reset();
			field259.update(var6);
			int var8 = (int) field259.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new VSUYIIVA(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method206(arg4, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method140(arg2 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				CFARFRSG var16 = new CFARFRSG(var15);
				var16.field44 = 3;
				int var17 = var16.method34() + 6;
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
						method206(arg4, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field268[0] != null) {
						field268[0].method460(arg0, var6.length, var6);
					}
				} catch (Exception var28) {
					field268[0] = null;
				}

				if (var6 != null) {
					field259.reset();
					field259.update(var6);
					int var23 = (int) field259.getValue();
					if (arg3 != var23) {
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
						method206(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method206(arg4, var11 + " - Retrying in " + var25);
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

				field239 = !field239;
			}
		}

		return new VSUYIIVA(var6);
	}

	@ObfuscatedName("client.c(II)V")
	public final void method136(int arg0) {
		int[] var2 = field116.field484;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field308[arg0][var7][var5] & 0x18) == 0) {
					field123.method531(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field308[arg0 + 1][var7][var5] & 0x8) != 0) {
					field123.method531(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field116.method218();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field308[arg0][var11][var10] & 0x18) == 0) {
					method190(arg0, var8, var11, var9, var10);
				}

				if (arg0 < 3 && (field308[arg0 + 1][var11][var10] & 0x8) != 0) {
					method190(arg0 + 1, var8, var11, var9, var10);
				}
			}
		}

		field253.method264();
		field124 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field123.method525(field246, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = QMZPELNG.method486(var14).field1166;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field457[field246].field667;
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

						field134[field124] = field426[var15];
						field125[field124] = var16;
						field126[field124] = var17;
						field124++;
					}
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 332);

			if (arg0.length == 5) {
				field269 = Integer.parseInt(arg0[0]);
				field270 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method214();
				} else if (arg0[2].equals("highmem")) {
					method122();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field271 = false;
				} else if (arg0[3].equals("members")) {
					field271 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method577(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.u(I)Ljava/lang/String;")
	public final String method137() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1392 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.v(I)V")
	public final void method138() {
		field236 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field193[var1] = -1;
			for (int var2 = 0; var2 < PTMGRPAM.field1114; var2++) {
				if (!PTMGRPAM.field1115[var2].field1121 && PTMGRPAM.field1115[var2].field1116 == var1 + (field389 ? 0 : 7)) {
					field193[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = LFTMDGKK.field883[var7];
			int var13 = LFTMDGKK.field884[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = LFTMDGKK.field883[var8];
			int var16 = LFTMDGKK.field884[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field373 = arg5 - var9;
		field374 = arg1 - var10;
		field375 = arg0 - var11;
		field376 = arg2;
		field377 = arg4;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method140(String arg0) throws IOException {
		if (field239) {
			if (field107 != null) {
				try {
					field107.close();
				} catch (Exception var4) {
				}

				field107 = null;
			}

			field107 = method87(43595);
			field107.setSoTimeout(10000);
			InputStream var2 = field107.getInputStream();
			OutputStream var3 = field107.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.w(I)V")
	public final void method141() {
		for (QPFVLDSR var1 = (QPFVLDSR) field441.method71(); var1 != null; var1 = (QPFVLDSR) field441.method73()) {
			if (field246 != var1.field1204 || field145 > var1.field1192) {
				var1.method582();
			} else if (field145 >= var1.field1191) {
				if (var1.field1187 > 0) {
					ADGLALPC var2 = field296[var1.field1187 - 1];
					if (var2 != null && var2.field1333 >= 0 && var2.field1333 < 13312 && var2.field1334 >= 0 && var2.field1334 < 13312) {
						var1.method490(var2.field1334, var2.field1333, field145, method197(var2.field1333, var1.field1204, var2.field1334) - var1.field1208);
					}
				}

				if (var1.field1187 < 0) {
					int var3 = -var1.field1187 - 1;
					FHQGDDHF var4;
					if (field319 == var3) {
						var4 = field121;
					} else {
						var4 = field72[var3];
					}

					if (var4 != null && var4.field1333 >= 0 && var4.field1333 < 13312 && var4.field1334 >= 0 && var4.field1334 < 13312) {
						var1.method490(var4.field1334, var4.field1333, field145, method197(var4.field1333, var1.field1204, var4.field1334) - var1.field1208);
					}
				}

				var1.method489(field320);
				field123.method507(var1, var1.field1188, false, (int) var1.field1194, field246, 60, (int) var1.field1195, -1, (int) var1.field1196);
			}
		}
	}

	@ObfuscatedName("client.c(IILCFARFRSG;)V")
	public final void method142(int arg0, CFARFRSG arg1) {
		if (arg0 == 128) {
			int var3 = arg1.method50();
			int var4 = (var3 >> 4 & 0x7) + field202;
			int var5 = (var3 & 0x7) + field203;
			int var6 = arg1.method59();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				CLCMCMIN var7 = field78[field246][var4][var5];
				if (var7 != null) {
					for (CVTFWCOC var8 = (CVTFWCOC) var7.method71(); var8 != null; var8 = (CVTFWCOC) var7.method73()) {
						if ((var6 & 0x7FFF) == var8.field491) {
							var8.method582();
							break;
						}
					}

					if (var7.method71() == null) {
						field78[field246][var4][var5] = null;
					}

					method150(var4, var5);
				}
			}
		} else if (arg0 == 160) {
			int var9 = arg1.method49();
			int var10 = var9 >> 2;
			int var11 = var9 & 0x3;
			int var12 = field431[var10];
			int var13 = arg1.method50();
			int var14 = (var13 >> 4 & 0x7) + field202;
			int var15 = (var13 & 0x7) + field203;
			if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
				method93(var10, var11, var14, var12, -1, var15, -1, field246, 0);
			}
		} else if (arg0 == 82) {
			int var16 = arg1.method32();
			int var17 = arg1.method51();
			int var18 = (var17 >> 4 & 0x7) + field202;
			int var19 = (var17 & 0x7) + field203;
			int var20 = arg1.method30();
			int var21 = var20 >> 2;
			int var22 = var20 & 0x3;
			int var23 = field431[var21];
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
				method93(var21, var22, var18, var23, -1, var19, var16, field246, 0);
			}
		} else {
			if (arg0 == 202) {
				int var24 = arg1.method59();
				byte var25 = arg1.method53();
				byte var26 = arg1.method31();
				int var27 = arg1.method32();
				int var28 = arg1.method59();
				byte var29 = arg1.method53();
				byte var30 = arg1.method52();
				int var31 = arg1.method58();
				int var32 = arg1.method30();
				int var33 = (var32 >> 4 & 0x7) + field202;
				int var34 = (var32 & 0x7) + field203;
				int var35 = arg1.method51();
				int var36 = var35 >> 2;
				int var37 = var35 & 0x3;
				int var38 = field431[var36];
				FHQGDDHF var39;
				if (field319 == var28) {
					var39 = field121;
				} else {
					var39 = field72[var28];
				}

				if (var39 != null) {
					QMZPELNG var40 = QMZPELNG.method486(var24);
					int var41 = field360[field246][var33][var34];
					int var42 = field360[field246][var33 + 1][var34];
					int var43 = field360[field246][var33 + 1][var34 + 1];
					int var44 = field360[field246][var33][var34 + 1];
					LFTMDGKK var45 = var40.method478(var36, var37, var41, var42, var43, var44, -1);
					if (var45 != null) {
						method93(0, 0, var33, var38, var27 + 1, var34, -1, field246, var31 + 1);
						var39.field622 = field145 + var31;
						var39.field623 = field145 + var27;
						var39.field610 = var45;
						int var46 = var40.field1178;
						int var47 = var40.field1142;
						if (var37 == 1 || var37 == 3) {
							var46 = var40.field1142;
							var47 = var40.field1178;
						}

						var39.field607 = var33 * 128 + var46 * 64;
						var39.field609 = var34 * 128 + var47 * 64;
						var39.field608 = method197(var39.field607, field246, var39.field609);

						if (var30 > var25) {
							byte var48 = var30;
							var30 = var25;
							var25 = var48;
						}

						if (var26 > var29) {
							byte var49 = var26;
							var26 = var29;
							var29 = var49;
						}

						var39.field614 = var30 + var33;
						var39.field616 = var25 + var33;
						var39.field615 = var26 + var34;
						var39.field617 = var29 + var34;
					}
				}
			}

			if (arg0 == 177) {
				int var50 = arg1.method30();
				int var51 = (var50 >> 4 & 0x7) + field202;
				int var52 = (var50 & 0x7) + field203;
				int var53 = var51 + arg1.method31();
				int var54 = var52 + arg1.method31();
				int var55 = arg1.method33();
				int var56 = arg1.method32();
				int var57 = arg1.method30() * 4;
				int var58 = arg1.method30() * 4;
				int var59 = arg1.method32();
				int var60 = arg1.method32();
				int var61 = arg1.method30();
				int var62 = arg1.method30();
				if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var56 != 0xFFFF) {
					var51 = var51 * 128 + 64;
					var52 = var52 * 128 + 64;
					var53 = var53 * 128 + 64;
					var54 = var54 * 128 + 64;
					QPFVLDSR var63 = new QPFVLDSR(var56, var51, method197(var51, field246, var52) - var57, var52, var55, var58, var61, field246, field145 + var60, var62, field145 + var59);
					var63.method490(var54, var53, field145 + var59, method197(var53, field246, var54) - var58);
					field441.method68(var63);
				}
			} else if (arg0 == 176) {
				int var64 = arg1.method59();
				int var65 = arg1.method51();
				int var66 = var65 >> 2;
				int var67 = var65 & 0x3;
				int var68 = field431[var66];
				int var69 = arg1.method30();
				int var70 = (var69 >> 4 & 0x7) + field202;
				int var71 = (var69 & 0x7) + field203;
				if (var70 >= 0 && var71 >= 0 && var70 < 103 && var71 < 103) {
					int var72 = field360[field246][var70][var71];
					int var73 = field360[field246][var70 + 1][var71];
					int var74 = field360[field246][var70 + 1][var71 + 1];
					int var75 = field360[field246][var70][var71 + 1];
					if (var68 == 0) {
						ZRIUHLUH var76 = field123.method518(var71, field246, var70);
						if (var76 != null) {
							int var77 = var76.field1492 >> 14 & 0x7FFF;
							if (var66 == 2) {
								var76.field1490 = new LPVEAYFU(false, var75, var72, var73, var77, 2, var67 + 4, var74, var64);
								var76.field1491 = new LPVEAYFU(false, var75, var72, var73, var77, 2, var67 + 1 & 0x3, var74, var64);
							} else {
								var76.field1490 = new LPVEAYFU(false, var75, var72, var73, var77, var66, var67, var74, var64);
							}
						}
					}

					if (var68 == 1) {
						LPTTEDBT var78 = field123.method519(var70, var71, field246);
						if (var78 != null) {
							var78.field904 = new LPVEAYFU(false, var75, var72, var73, var78.field905 >> 14 & 0x7FFF, 4, 0, var74, var64);
						}
					}

					if (var68 == 2) {
						YMQFSFRM var79 = field123.method520(field246, var71, var70);

						if (var66 == 11) {
							var66 = 10;
						}

						if (var79 != null) {
							var79.field1461 = new LPVEAYFU(false, var75, var72, var73, var79.field1469 >> 14 & 0x7FFF, var66, var67, var74, var64);
						}
					}

					if (var68 == 3) {
						FQYYWZSG var80 = field123.method521(var71, field246, var70);
						if (var80 != null) {
							var80.field632 = new LPVEAYFU(false, var75, var72, var73, var80.field633 >> 14 & 0x7FFF, 22, var67, var74, var64);
						}
					}
				}
			} else {
				if (arg0 == 244) {
					int var81 = arg1.method30();
					int var82 = (var81 >> 4 & 0x7) + field202;
					int var83 = (var81 & 0x7) + field203;
					int var84 = arg1.method32();
					int var85 = arg1.method30();
					int var86 = var85 >> 4 & 0xF;
					int var87 = var85 & 0x7;
					if (field121.field1314[0] >= var82 - var86 && field121.field1314[0] <= var82 + var86 && field121.field1315[0] >= var83 - var86 && field121.field1315[0] <= var83 + var86 && field263 && !field272 && field148 < 50) {
						field265[field148] = var84;
						field99[field148] = var87;
						field413[field148] = VSVAEWAC.field1367[var84];
						field148++;
					}
				}

				if (arg0 == 230) {
					int var88 = arg1.method30();
					int var89 = (var88 >> 4 & 0x7) + field202;
					int var90 = (var88 & 0x7) + field203;
					int var91 = arg1.method32();
					int var92 = arg1.method32();
					int var93 = arg1.method32();
					if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
						CLCMCMIN var94 = field78[field246][var89][var90];
						if (var94 != null) {
							for (CVTFWCOC var95 = (CVTFWCOC) var94.method71(); var95 != null; var95 = (CVTFWCOC) var94.method73()) {
								if ((var91 & 0x7FFF) == var95.field491 && var95.field492 == var92) {
									var95.field492 = var93;
									break;
								}
							}

							method150(var89, var90);
						}
					}
				} else if (arg0 == 95) {
					int var96 = arg1.method30();
					int var97 = (var96 >> 4 & 0x7) + field202;
					int var98 = (var96 & 0x7) + field203;
					int var99 = arg1.method32();
					int var100 = arg1.method30();
					int var101 = arg1.method32();
					if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
						var97 = var97 * 128 + 64;
						var98 = var98 * 128 + 64;
						CANOTCRF var102 = new CANOTCRF(method197(var97, field246, var98) - var100, var98, var99, var97, var101, field145, field246);
						field100.method68(var102);
					}
				} else if (arg0 == 1) {
					int var103 = arg1.method50();
					int var104 = (var103 >> 4 & 0x7) + field202;
					int var105 = (var103 & 0x7) + field203;
					int var106 = arg1.method57();
					int var107 = arg1.method57();
					int var108 = arg1.method57();
					if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104 && field319 != var106) {
						CVTFWCOC var109 = new CVTFWCOC();
						var109.field491 = var108;
						var109.field492 = var107;

						if (field78[field246][var104][var105] == null) {
							field78[field246][var104][var105] = new CLCMCMIN();
						}

						field78[field246][var104][var105].method68(var109);
						method150(var104, var105);
					}
				} else if (arg0 == 55) {
					int var110 = arg1.method30();
					int var111 = (var110 >> 4 & 0x7) + field202;
					int var112 = (var110 & 0x7) + field203;
					int var113 = arg1.method57();
					int var114 = arg1.method58();
					if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
						CVTFWCOC var115 = new CVTFWCOC();
						var115.field491 = var113;
						var115.field492 = var114;

						if (field78[field246][var111][var112] == null) {
							field78[field246][var111][var112] = new CLCMCMIN();
						}

						field78[field246][var111][var112].method68(var115);
						method150(var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method143() {
		for (int var1 = -1; var1 < field73; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field71;
			} else {
				var2 = field74[var1];
			}

			FHQGDDHF var3 = field72[var2];
			if (var3 != null && var3.field1336 > 0) {
				var3.field1336--;
				if (var3.field1336 == 0) {
					var3.field1342 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field297; var4++) {
			int var5 = field298[var4];
			ADGLALPC var6 = field296[var5];
			if (var6 != null && var6.field1336 > 0) {
				var6.field1336--;
				if (var6.field1336 == 0) {
					var6.field1342 = null;
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

	@ObfuscatedName("client.a(ZILCFARFRSG;)V")
	public final void method144(int arg0, CFARFRSG arg1) {
		arg1.method40();
		int var3 = arg1.method41(8);
		if (var3 < field297) {
			for (int var4 = var3; var4 < field297; var4++) {
				field144[field143++] = field298[var4];
			}
		}

		if (var3 > field297) {
			signlink.reporterror(field392 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field297 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field298[var5];
			ADGLALPC var7 = field296[var6];
			int var8 = arg1.method41(1);
			if (var8 == 0) {
				field298[field297++] = var6;
				var7.field1316 = field145;
			} else {
				int var9 = arg1.method41(2);
				if (var9 == 0) {
					field298[field297++] = var6;
					var7.field1316 = field145;
					field76[field75++] = var6;
				} else if (var9 == 1) {
					field298[field297++] = var6;
					var7.field1316 = field145;
					int var10 = arg1.method41(3);
					var7.method566(var10, false);
					int var11 = arg1.method41(1);
					if (var11 == 1) {
						field76[field75++] = var6;
					}
				} else if (var9 == 2) {
					field298[field297++] = var6;
					var7.field1316 = field145;
					int var12 = arg1.method41(3);
					var7.method566(var12, true);
					int var13 = arg1.method41(3);
					var7.method566(var13, true);
					int var14 = arg1.method41(1);
					if (var14 == 1) {
						field76[field75++] = var6;
					}
				} else if (var9 == 3) {
					field144[field143++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method145() {
		for (int var1 = 0; var1 < field148; var1++) {
			if (field413[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field265[var1] != field235 || field99[var1] != field300) {
						CFARFRSG var3 = VSVAEWAC.method572(field265[var1], field99[var1]);
						if (System.currentTimeMillis() + var3.field44 / 22 > field161 / 22 + field244) {
							field161 = var3.field44;
							field244 = System.currentTimeMillis();

							if (method198(var3.field43, var3.field44)) {
								field235 = field265[var1];
								field300 = field99[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method210()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field413[var1] != -5) {
					field413[var1] = -5;
				} else {
					field148--;
					for (int var5 = var1; var5 < field148; var5++) {
						field265[var5] = field265[var5 + 1];
						field99[var5] = field99[var5 + 1];
						field413[var5] = field413[var5 + 1];
					}

					var1--;
				}
			} else {
				field413[var1]--;
			}
		}

		if (field337 > 0) {
			field337 -= 20;
			if (field337 < 0) {
				field337 = 0;
			}

			if (field337 == 0 && field289 && !field272) {
				field240 = field101;
				field241 = true;
				field288.method426(2, field240);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LFHQGDDHF;IIII)V")
	public final void method146(FHQGDDHF arg0, int arg1, int arg2, int arg3) {
		if (field121 != arg0 && field225 < 400) {
			String var5;
			if (arg0.field606 == 0) {
				var5 = arg0.field611 + method189(arg0.field604, field121.field604) + " (level-" + arg0.field604 + ")";
			} else {
				var5 = arg0.field611 + " (skill-" + arg0.field606 + ")";
			}

			if (field226 == 1) {
				field364[field225] = "Use " + field230 + " with @whi@" + var5;
				field405[field225] = 995;
				field406[field225] = arg3;
				field403[field225] = arg1;
				field404[field225] = arg2;
				field225++;
			} else if (field215 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field127[var6] != null) {
						field364[field225] = field127[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field127[var6].equalsIgnoreCase("attack")) {
							if (arg0.field604 > field121.field604) {
								var7 = 2000;
							}

							if (field121.field626 != 0 && arg0.field626 != 0) {
								if (field121.field626 == arg0.field626) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field128[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field405[field225] = var7 + 371;
						}

						if (var6 == 1) {
							field405[field225] = var7 + 101;
						}

						if (var6 == 2) {
							field405[field225] = var7 + 184;
						}

						if (var6 == 3) {
							field405[field225] = var7 + 137;
						}

						if (var6 == 4) {
							field405[field225] = var7 + 390;
						}

						field406[field225] = arg3;
						field403[field225] = arg1;
						field404[field225] = arg2;
						field225++;
					}
				}
			} else if ((field217 & 0x8) == 8) {
				field364[field225] = field218 + " @whi@" + var5;
				field405[field225] = 475;
				field406[field225] = arg3;
				field403[field225] = arg1;
				field404[field225] = arg2;
				field225++;
			}

			for (int var8 = 0; var8 < field225; var8++) {
				if (field405[var8] == 189) {
					field364[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILCFARFRSG;I)V")
	public final void method147(CFARFRSG arg0, int arg1) {
		for (int var3 = 0; var3 < field75; var3++) {
			int var4 = field76[var3];
			FHQGDDHF var5 = field72[var4];
			int var6 = arg0.method30();
			if ((var6 & 0x4) != 0) {
				var6 += arg0.method30() << 8;
			}

			method217(var4, var6, arg0, var5);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public void method148() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field88);

		if (field288 != null) {
			System.out.println("Od-cycle:" + field288.field966);
		}

		System.out.println("loop-cycle:" + field145);
		System.out.println("draw-cycle:" + field211);
		System.out.println("ptype:" + field187);
		System.out.println("psize:" + field186);

		if (field256 != null) {
			field256.method474();
		}

		field1386 = true;
	}

	@ObfuscatedName("client.b(Z)Ljava/awt/Component;")
	public final Component method149() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1392 != null) {
			return field1392;
		}

		return this;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method150(int arg0, int arg1) {
		CLCMCMIN var3 = field78[field246][arg0][arg1];
		if (var3 == null) {
			field123.method517(field246, arg0, arg1);
		} else {
			int var4 = -99999999;
			CVTFWCOC var5 = null;
			for (CVTFWCOC var6 = (CVTFWCOC) var3.method71(); var6 != null; var6 = (CVTFWCOC) var3.method73()) {
				JPUETSNB var7 = JPUETSNB.method329(var6.field491);
				int var8 = var7.field747;
				if (var7.field793) {
					var8 = (var6.field492 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method69(var5);
			CVTFWCOC var9 = null;
			CVTFWCOC var10 = null;
			for (CVTFWCOC var11 = (CVTFWCOC) var3.method71(); var11 != null; var11 = (CVTFWCOC) var3.method73()) {
				if (var5.field491 != var11.field491 && var9 == null) {
					var9 = var11;
				}

				if (var5.field491 != var11.field491 && var9.field491 != var11.field491 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field123.method503(var9, arg0, var10, var12, method197(arg0 * 128 + 64, field246, arg1 * 128 + 64), arg1, var5, field246);
		}
	}

	@ObfuscatedName("client.a(LOPFNUBIN;B)Z")
	public final boolean method151(OPFNUBIN arg0) {
		int var2 = arg0.field1069;
		if (field317 == 2) {
			if (var2 == 201) {
				field182 = true;
				field191 = 0;
				field90 = true;
				field424 = "";
				field192 = 1;
				field133 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field182 = true;
				field191 = 0;
				field90 = true;
				field424 = "";
				field192 = 2;
				field133 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field190 = 250;
			return true;
		}

		if (var2 == 501) {
			field182 = true;
			field191 = 0;
			field90 = true;
			field424 = "";
			field192 = 4;
			field133 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field182 = true;
			field191 = 0;
			field90 = true;
			field424 = "";
			field192 = 5;
			field133 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field193[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = PTMGRPAM.field1114 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= PTMGRPAM.field1114) {
							var5 = 0;
						}
					}

					if (!PTMGRPAM.field1115[var5].field1121 && PTMGRPAM.field1115[var5].field1116 == var3 + (field389 ? 0 : 7)) {
						break;
					}
				}

				field193[var3] = var5;
				field236 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field243[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field382[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field382[var6].length) {
					var8 = 0;
				}
			}

			field243[var6] = var8;
			field236 = true;
		}

		if (var2 == 324 && !field389) {
			field389 = true;
			method138();
		}

		if (var2 == 325 && field389) {
			field389 = false;
			method138();
		}

		if (var2 == 326) {
			field408.method19(251);
			field408.method20(field389 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field408.method20(field193[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field408.method20(field243[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field304 = !field304;
		}

		if (var2 >= 601 && var2 <= 613) {
			method179();

			if (field366.length() > 0) {
				field408.method19(38);
				field408.method26(ZDHYRWCV.method587(field366));
				field408.method20(var2 - 601);
				field408.method20(field304 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean method152() {
		if (field256 == null) {
			return false;
		}

		try {
			int var1 = field256.method471();
			if (var1 == 0) {
				return false;
			}

			if (field187 == -1) {
				field256.method472(field365.field43, 0, 1);
				field187 = field365.field43[0] & 0xFF;
				if (field401 != null) {
					field187 = field187 - field401.method475() & 0xFF;
				}

				field186 = HKQXKKXM.field662[field187];
				var1--;
			}

			if (field186 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field256.method472(field365.field43, 0, 1);
				field186 = field365.field43[0] & 0xFF;
				var1--;
			}

			if (field186 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field256.method472(field365.field43, 0, 2);
				field365.field44 = 0;
				field186 = field365.method32();
				var1 -= 2;
			}

			if (var1 < field186) {
				return false;
			}

			field365.field44 = 0;
			field256.method472(field365.field43, 0, field186);
			field188 = 0;
			field210 = field209;
			field209 = field208;
			field208 = field187;

			if (field187 == 117) {
				int var2 = field365.method59();
				int var3 = field365.method32();
				int var4 = field365.method32();
				OPFNUBIN.field1033[var3].field1048 = (var4 << 16) + var2;
				field187 = -1;
				return true;
			}

			if (field187 == 58) {
				field317 = field365.method30();
				field59 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 70) {
				field90 = false;
				field191 = 2;
				field151 = "";
				field182 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 153) {
				int var5 = field365.method57();
				OPFNUBIN var6 = OPFNUBIN.field1033[var5];
				for (int var7 = 0; var7 < var6.field1062.length; var7++) {
					var6.field1062[var7] = -1;
					var6.field1062[var7] = 0;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 17) {
				String var8 = field365.method37();
				if (var8.endsWith(":tradereq:")) {
					String var9 = var8.substring(0, var8.indexOf(":"));
					long var10 = ZDHYRWCV.method587(var9);
					boolean var12 = false;
					for (int var13 = 0; var13 < field321; var13++) {
						if (field262[var13] == var10) {
							var12 = true;
							break;
						}
					}

					if (!var12 && field335 == 0) {
						method120("wishes to trade with you.", var9, 4);
					}
				} else if (var8.endsWith(":duelreq:")) {
					String var14 = var8.substring(0, var8.indexOf(":"));
					long var15 = ZDHYRWCV.method587(var14);
					boolean var17 = false;
					for (int var18 = 0; var18 < field321; var18++) {
						if (field262[var18] == var15) {
							var17 = true;
							break;
						}
					}

					if (!var17 && field335 == 0) {
						method120("wishes to duel with you.", var14, 8);
					}
				} else if (var8.endsWith(":chalreq:")) {
					String var19 = var8.substring(0, var8.indexOf(":"));
					long var20 = ZDHYRWCV.method587(var19);
					boolean var22 = false;
					for (int var23 = 0; var23 < field321; var23++) {
						if (field262[var23] == var20) {
							var22 = true;
							break;
						}
					}

					if (!var22 && field335 == 0) {
						String var24 = var8.substring(var8.indexOf(":") + 1, var8.length() - 9);
						method120(var24, var19, 8);
					}
				} else {
					method120(var8, "", 0);
				}

				field187 = -1;
				return true;
			}

			if (field187 == 166) {
				field410 = field365.method58() * 30;
				field187 = -1;
				return true;
			}

			if (field187 == 113) {
				method154();
				field187 = -1;
				return false;
			}

			if (field187 == 143) {
				int var25 = field365.method61();
				int var26 = field365.method59();
				int var27 = field365.method61();
				OPFNUBIN var28 = OPFNUBIN.field1033[var26];
				var28.field1082 = var27;
				var28.field1081 = var25;
				field187 = -1;
				return true;
			}

			if (field187 == 253) {
				int var29 = field365.method57();
				int var30 = field365.method57();
				OPFNUBIN.field1033[var30].field1058 = 2;
				OPFNUBIN.field1033[var30].field1059 = var29;
				field187 = -1;
				return true;
			}

			if (field187 == 228) {
				field203 = field365.method51();
				field202 = field365.method50();

				while (field365.field44 < field186) {
					int var31 = field365.method30();
					method142(var31, field365);
				}

				field187 = -1;
				return true;
			}

			if (field187 == 251) {
				long var32 = field365.method36();
				int var34 = field365.method30();
				String var35 = ZDHYRWCV.method591(ZDHYRWCV.method588(var32));
				for (int var36 = 0; var36 < field316; var36++) {
					if (field274[var36] == var32) {
						if (field160[var36] != var34) {
							field160[var36] = var34;
							field59 = true;

							if (var34 > 0) {
								method120(var35 + " has logged in.", "", 5);
							}

							if (var34 == 0) {
								method120(var35 + " has logged out.", "", 5);
							}
						}

						var35 = null;
						break;
					}
				}

				if (var35 != null && field316 < 200) {
					field274[field316] = var32;
					field98[field316] = var35;
					field160[field316] = var34;
					field316++;
					field59 = true;
				}

				boolean var37 = false;
				while (!var37) {
					var37 = true;
					for (int var38 = 0; var38 < field316 - 1; var38++) {
						if (field160[var38] != field269 && field160[var38 + 1] == field269 || field160[var38] == 0 && field160[var38 + 1] != 0) {
							int var39 = field160[var38];
							field160[var38] = field160[var38 + 1];
							field160[var38 + 1] = var39;
							String var40 = field98[var38];
							field98[var38] = field98[var38 + 1];
							field98[var38 + 1] = var40;
							long var41 = field274[var38];
							field274[var38] = field274[var38 + 1];
							field274[var38 + 1] = var41;
							field59 = true;
							var37 = false;
						}
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 59) {
				int var43 = field365.method60();
				field287 = var43;
				field182 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 181) {
				int var44 = field365.method59();
				int var45 = field365.method30();

				if (var44 == 0xFFFF) {
					var44 = -1;
				}

				field97[var45] = var44;
				field59 = true;
				field363 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 86) {
				field371 = field365.method30();
				field139 = field365.method30();
				field119 = field365.method30();
				field473 = true;
				field182 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 66) {
				for (int var46 = 0; var46 < field72.length; var46++) {
					if (field72[var46] != null) {
						field72[var46].field1349 = -1;
					}
				}

				for (int var47 = 0; var47 < field296.length; var47++) {
					if (field296[var47] != null) {
						field296[var47].field1349 = -1;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 88) {
				long var48 = field365.method36();
				int var50 = field365.method35();
				int var51 = field365.method30();
				boolean var52 = false;
				for (int var53 = 0; var53 < 100; var53++) {
					if (field311[var53] == var50) {
						var52 = true;
						break;
					}
				}

				if (var51 <= 1) {
					for (int var54 = 0; var54 < field321; var54++) {
						if (field262[var54] == var48) {
							var52 = true;
							break;
						}
					}
				}

				if (!var52 && field335 == 0) {
					try {
						field311[field315] = var50;
						field315 = (field315 + 1) % 100;
						String var55 = EDPSKMQR.method267(field186 - 13, field365);
						if (var51 != 3) {
							var55 = MUWLFOWQ.method382(var55);
						}

						if (var51 == 2 || var51 == 3) {
							method120(var55, "@cr2@" + ZDHYRWCV.method591(ZDHYRWCV.method588(var48)), 7);
						} else if (var51 == 1) {
							method120(var55, "@cr1@" + ZDHYRWCV.method591(ZDHYRWCV.method588(var48)), 7);
						} else {
							method120(var55, ZDHYRWCV.method591(ZDHYRWCV.method588(var48)), 3);
						}
					} catch (Exception var190) {
						signlink.reporterror("cde1");
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 216) {
				int var57 = field365.method60();
				if (var57 >= 0) {
					method113(var57);
				}

				field199 = var57;
				field187 = -1;
				return true;
			}

			if (field187 == 129) {
				int var58 = field365.method57();
				method113(var58);

				if (field326 != -1) {
					field326 = -1;
					field59 = true;
					field363 = true;
				}

				if (field450 != -1) {
					field450 = -1;
					field182 = true;
				}

				if (field245 != -1) {
					field245 = -1;
					field164 = true;
				}

				if (field191 != 0) {
					field191 = 0;
					field182 = true;
				}

				field412 = var58;
				field367 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 18) {
				int var59 = field365.method57();
				int var60 = field365.method32();
				OPFNUBIN.field1033[var59].field1058 = 1;
				OPFNUBIN.field1033[var59].field1059 = var60;
				field187 = -1;
				return true;
			}

			if (field187 == 3) {
				int var61 = field365.method58();
				int var62 = field365.method59();
				int var63 = field365.method58();
				int var64 = field365.method58();
				OPFNUBIN.field1033[var61].field1056 = var62;
				OPFNUBIN.field1033[var61].field1057 = var64;
				OPFNUBIN.field1033[var61].field1055 = var63;
				field187 = -1;
				return true;
			}

			if (field187 == 65) {
				field64 = field365.method50();
				field59 = true;
				field363 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 101) {
				field59 = true;
				int var65 = field365.method30();
				int var66 = field365.method35();
				int var67 = field365.method30();
				field472[var67] = var66;
				field149[var67] = var65;
				field196[var67] = 1;
				for (int var68 = 0; var68 < 98; var68++) {
					if (var66 >= field96[var68]) {
						field196[var67] = var68 + 2;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 27) {
				int var69 = field365.method57();
				int var70 = field365.method57();
				int var71 = field365.method59();
				if (var70 == 0xFFFF) {
					OPFNUBIN.field1033[var71].field1058 = 0;
					field187 = -1;
					return true;
				}

				JPUETSNB var72 = JPUETSNB.method329(var70);
				OPFNUBIN.field1033[var71].field1058 = 4;
				OPFNUBIN.field1033[var71].field1059 = var70;
				OPFNUBIN.field1033[var71].field1056 = var72.field782;
				OPFNUBIN.field1033[var71].field1057 = var72.field759;
				OPFNUBIN.field1033[var71].field1055 = var72.field778 * 100 / var69;
				field187 = -1;
				return true;
			}

			if (field187 == 126) {
				int var73 = field365.method58();
				int var74 = field365.method60();
				OPFNUBIN var75 = OPFNUBIN.field1033[var73];
				var75.field1072 = var74;

				if (var74 == -1) {
					var75.field1085 = 0;
					var75.field1050 = 0;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 246) {
				field205 = field365.method50();
				field319 = field365.method32();
				field187 = -1;
				return true;
			}

			if (field187 == 208) {
				int var76 = field365.method32();
				method113(var76);
				field412 = -1;
				field326 = -1;
				field450 = -1;
				field191 = 0;
				field367 = false;
				field245 = var76;
				field187 = -1;
				return true;
			}

			if (field187 == 223) {
				boolean var77 = field365.method30() == 1;
				int var78 = field365.method57();
				OPFNUBIN.field1033[var78].field1077 = var77;
				field187 = -1;
				return true;
			}

			if (field187 == 94) {
				int var79 = field365.method50();
				String var80 = field365.method37();
				int var81 = field365.method50();
				if (var79 >= 1 && var79 <= 5) {
					if (var80.equalsIgnoreCase("null")) {
						var80 = null;
					}

					field127[var79 - 1] = var80;
					field128[var79 - 1] = var81 == 0;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 155) {
				int var82 = field365.method59();
				method113(var82);

				if (field326 != -1) {
					field326 = -1;
					field59 = true;
					field363 = true;
				}

				if (field245 != -1) {
					field245 = -1;
					field164 = true;
				}

				field450 = var82;
				field182 = true;
				field412 = -1;
				field367 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 179) {
				method110(field186, field365);
				field478 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 111) {
				int var83 = field365.method57();
				int var84 = field365.method59();

				if (field450 != -1) {
					field450 = -1;
					field182 = true;
				}

				if (field191 != 0) {
					field191 = 0;
					field182 = true;
				}

				field412 = var83;
				field326 = var84;
				field59 = true;
				field363 = true;
				field367 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 52) {
				if (field64 == 12) {
					field59 = true;
				}

				field459 = field365.method30();
				field187 = -1;
				return true;
			}

			if (field187 == 109) {
				field234 = false;

				for (int var85 = 0; var85 < 5; var85++) {
					field307[var85] = false;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 241) {
				field90 = false;
				field191 = 1;
				field151 = "";
				field182 = true;
				field187 = -1;
				return true;
			}

			if (field187 == 4) {
				int var86 = field365.method35();
				int var87 = field365.method59();
				field336[var87] = var86;

				if (field351[var87] != var86) {
					field351[var87] = var86;
					method202(var87);
					field59 = true;

					if (field287 != -1) {
						field182 = true;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 244 || field187 == 230 || field187 == 202 || field187 == 1 || field187 == 95 || field187 == 177 || field187 == 128 || field187 == 55 || field187 == 176 || field187 == 160 || field187 == 82) {
				method142(field187, field365);
				field187 = -1;
				return true;
			}

			if (field187 == 235) {
				field202 = field365.method49();
				field203 = field365.method30();
				for (int var88 = field202; var88 < field202 + 8; var88++) {
					for (int var89 = field203; var89 < field203 + 8; var89++) {
						if (field78[field246][var88][var89] != null) {
							field78[field246][var88][var89] = null;
							method150(var88, var89);
						}
					}
				}

				for (IFXJSFHR var90 = (IFXJSFHR) field451.method71(); var90 != null; var90 = (IFXJSFHR) field451.method73()) {
					if (var90.field676 >= field202 && var90.field676 < field202 + 8 && var90.field677 >= field203 && var90.field677 < field203 + 8 && field246 == var90.field674) {
						var90.field678 = 0;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 130) {
				if (field326 != -1) {
					field326 = -1;
					field59 = true;
					field363 = true;
				}

				if (field450 != -1) {
					field450 = -1;
					field182 = true;
				}

				if (field245 != -1) {
					field245 = -1;
					field164 = true;
				}

				if (field191 != 0) {
					field191 = 0;
					field182 = true;
				}

				field412 = -1;
				field367 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 192) {
				String var91 = field365.method37();
				int var92 = field365.method59();
				OPFNUBIN.field1033[var92].field1080 = var91;

				if (field97[field64] == OPFNUBIN.field1033[var92].field1041) {
					field59 = true;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 60) {
				int var93 = field365.method32();
				byte var94 = field365.method52();
				field336[var93] = var94;

				if (field351[var93] != var94) {
					field351[var93] = var94;
					method202(var93);
					field59 = true;

					if (field287 != -1) {
						field182 = true;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 28) {
				int var95 = field365.method58();
				OPFNUBIN.field1033[var95].field1058 = 3;

				if (field121.field625 == null) {
					OPFNUBIN.field1033[var95].field1059 = (field121.field624[11] << 5) + (field121.field624[8] << 10) + (field121.field624[0] << 15) + (field121.field621[0] << 25) + (field121.field621[4] << 20) + field121.field624[1];
				} else {
					OPFNUBIN.field1033[var95].field1059 = (int) (field121.field625.field996 + 0x12345678L);
				}

				field187 = -1;
				return true;
			}

			if (field187 == 201) {
				field203 = field365.method50();
				field202 = field365.method49();
				field187 = -1;
				return true;
			}

			if (field187 == 110) {
				for (int var96 = 0; var96 < field351.length; var96++) {
					if (field351[var96] != field336[var96]) {
						field351[var96] = field336[var96];
						method202(var96);
						field59 = true;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 87) {
				field402 = field365.method30();
				field187 = -1;
				return true;
			}

			if (field187 == 24) {
				field59 = true;
				int var97 = field365.method32();
				OPFNUBIN var98 = OPFNUBIN.field1033[var97];
				int var99 = field365.method32();
				for (int var100 = 0; var100 < var99; var100++) {
					int var101 = field365.method50();
					if (var101 == 255) {
						var101 = field365.method35();
					}

					var98.field1062[var100] = field365.method57();
					var98.field1086[var100] = var101;
				}

				for (int var102 = var99; var102 < var98.field1062.length; var102++) {
					var98.field1062[var102] = 0;
					var98.field1086[var102] = 0;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 212) {
				field400 = field365.method49();
				if (field64 == field400) {
					if (field400 == 3) {
						field64 = 1;
					} else {
						field64 = 3;
					}

					field59 = true;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 9) {
				int var103 = field365.method58();
				int var104 = field365.method57();
				int var105 = var104 >> 10 & 0x1F;
				int var106 = var104 >> 5 & 0x1F;
				int var107 = var104 & 0x1F;
				OPFNUBIN.field1033[var103].field1067 = (var107 << 3) + (var105 << 19) + (var106 << 11);
				field187 = -1;
				return true;
			}

			if (field187 == 78) {
				field114 = 0;
				field187 = -1;
				return true;
			}

			if (field187 == 236) {
				int var108 = field365.method32();
				int var109 = field365.method30();
				int var110 = field365.method32();
				if (field263 && !field272 && field148 < 50) {
					field265[field148] = var108;
					field99[field148] = var109;
					field413[field148] = VSVAEWAC.field1367[var108] + var110;
					field148++;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 89) {
				if (field64 == 12) {
					field59 = true;
				}

				field257 = field365.method33();
				field187 = -1;
				return true;
			}

			if (field187 == 168) {
				int var111 = field365.method57();
				if (var111 == 0xFFFF) {
					var111 = -1;
				}

				if (field101 != var111 && field289 && !field272 && field337 == 0) {
					field240 = var111;
					field241 = true;
					field288.method426(2, field240);
				}

				field101 = var111;
				field187 = -1;
				return true;
			}

			if (field187 == 83) {
				int var112 = field365.method59();
				int var113 = field365.method62();
				if (field289 && !field272) {
					field240 = var112;
					field241 = false;
					field288.method426(2, field240);
					field337 = var113;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 249) {
				method131(field365, field186);
				field187 = -1;
				return true;
			}

			if (field187 == 96 || field187 == 44) {
				int var114 = field368;
				int var115 = field369;
				if (field187 == 96) {
					var114 = field365.method32();
					var115 = field365.method59();
					field399 = false;
				}

				if (field187 == 44) {
					var115 = field365.method59();
					field365.method40();

					for (int var116 = 0; var116 < 4; var116++) {
						for (int var117 = 0; var117 < 13; var117++) {
							for (int var118 = 0; var118 < 13; var118++) {
								int var119 = field365.method41(1);
								if (var119 == 1) {
									field140[var116][var117][var118] = field365.method41(26);
								} else {
									field140[var116][var117][var118] = -1;
								}
							}
						}
					}

					field365.method42();
					var114 = field365.method58();
					field399 = true;
				}

				if (field368 == var114 && field369 == var115 && field255 == 2) {
					field187 = -1;
					return true;
				}

				field368 = var114;
				field369 = var115;
				field385 = (field368 - 6) * 8;
				field386 = (field369 - 6) * 8;
				field452 = false;
				if ((field368 / 8 == 48 || field368 / 8 == 49) && field369 / 8 == 48) {
					field452 = true;
				}

				if (field368 / 8 == 48 && field369 / 8 == 148) {
					field452 = true;
				}

				field255 = 1;
				field146 = System.currentTimeMillis();
				field253.method264();
				field221.method278(151, "Loading - please wait.", 0, 257);
				field221.method278(150, "Loading - please wait.", 0xFFFFFF, 256);
				field253.method265(4, 4, field1389);

				if (field187 == 96) {
					int var120 = 0;
					for (int var121 = (field368 - 6) / 8; var121 <= (field368 + 6) / 8; var121++) {
						for (int var122 = (field369 - 6) / 8; var122 <= (field369 + 6) / 8; var122++) {
							var120++;
						}
					}

					field344 = new byte[var120][];
					field117 = new byte[var120][];
					field479 = new int[var120];
					field480 = new int[var120];
					field481 = new int[var120];
					int var123 = 0;
					for (int var124 = (field368 - 6) / 8; var124 <= (field368 + 6) / 8; var124++) {
						for (int var125 = (field369 - 6) / 8; var125 <= (field369 + 6) / 8; var125++) {
							field479[var123] = (var124 << 8) + var125;

							if (field452 && (var125 == 49 || var125 == 149 || var125 == 147 || var124 == 50 || var124 == 49 && var125 == 47)) {
								field480[var123] = -1;
								field481[var123] = -1;
								var123++;
							} else {
								int var126 = field480[var123] = field288.method424(0, var125, var124);
								if (var126 != -1) {
									field288.method426(3, var126);
								}

								int var127 = field481[var123] = field288.method424(1, var125, var124);
								if (var127 != -1) {
									field288.method426(3, var127);
								}

								var123++;
							}
						}
					}
				}

				if (field187 == 44) {
					int var128 = 0;
					int[] var129 = new int[676];
					for (int var130 = 0; var130 < 4; var130++) {
						for (int var131 = 0; var131 < 13; var131++) {
							for (int var132 = 0; var132 < 13; var132++) {
								int var133 = field140[var130][var131][var132];
								if (var133 != -1) {
									int var134 = var133 >> 14 & 0x3FF;
									int var135 = var133 >> 3 & 0x7FF;
									int var136 = (var134 / 8 << 8) + var135 / 8;
									for (int var137 = 0; var137 < var128; var137++) {
										if (var129[var137] == var136) {
											var136 = -1;
											break;
										}
									}

									if (var136 != -1) {
										var129[var128++] = var136;
									}
								}
							}
						}
					}

					field344 = new byte[var128][];
					field117 = new byte[var128][];
					field479 = new int[var128];
					field480 = new int[var128];
					field481 = new int[var128];
					for (int var138 = 0; var138 < var128; var138++) {
						int var139 = field479[var138] = var129[var138];
						int var140 = var139 >> 8 & 0xFF;
						int var141 = var139 & 0xFF;
						int var142 = field480[var138] = field288.method424(0, var141, var140);
						if (var142 != -1) {
							field288.method426(3, var142);
						}

						int var143 = field481[var138] = field288.method424(1, var141, var140);
						if (var143 != -1) {
							field288.method426(3, var143);
						}
					}
				}

				int var144 = field385 - field387;
				int var145 = field386 - field388;
				field387 = field385;
				field388 = field386;

				for (int var146 = 0; var146 < 16384; var146++) {
					ADGLALPC var147 = field296[var146];
					if (var147 != null) {
						for (int var148 = 0; var148 < 10; var148++) {
							var147.field1314[var148] -= var144;
							var147.field1315[var148] -= var145;
						}

						var147.field1333 -= var144 * 128;
						var147.field1334 -= var145 * 128;
					}
				}

				for (int var149 = 0; var149 < field70; var149++) {
					FHQGDDHF var150 = field72[var149];
					if (var150 != null) {
						for (int var151 = 0; var151 < 10; var151++) {
							var150.field1314[var151] -= var144;
							var150.field1315[var151] -= var145;
						}

						var150.field1333 -= var144 * 128;
						var150.field1334 -= var145 * 128;
					}
				}

				field478 = true;
				byte var152 = 0;
				byte var153 = 104;
				byte var154 = 1;
				if (var144 < 0) {
					var152 = 103;
					var153 = -1;
					var154 = -1;
				}

				byte var155 = 0;
				byte var156 = 104;
				byte var157 = 1;
				if (var145 < 0) {
					var155 = 103;
					var156 = -1;
					var157 = -1;
				}

				for (int var158 = var152; var158 != var153; var158 += var154) {
					for (int var159 = var155; var159 != var156; var159 += var157) {
						int var160 = var144 + var158;
						int var161 = var145 + var159;
						for (int var162 = 0; var162 < 4; var162++) {
							if (var160 >= 0 && var161 >= 0 && var160 < 104 && var161 < 104) {
								field78[var162][var158][var159] = field78[var162][var160][var161];
							} else {
								field78[var162][var158][var159] = null;
							}
						}
					}
				}

				for (IFXJSFHR var163 = (IFXJSFHR) field451.method71(); var163 != null; var163 = (IFXJSFHR) field451.method73()) {
					var163.field676 -= var144;
					var163.field677 -= var145;
					if (var163.field676 < 0 || var163.field677 < 0 || var163.field676 >= 104 || var163.field677 >= 104) {
						var163.method582();
					}
				}

				if (field114 != 0) {
					field114 -= var144;
					field115 -= var145;
				}

				field234 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 150) {
				field321 = field186 / 8;
				for (int var164 = 0; var164 < field321; var164++) {
					field262[var164] = field365.method36();
				}

				field187 = -1;
				return true;
			}

			if (field187 == 145) {
				field234 = true;
				field329 = field365.method30();
				field330 = field365.method30();
				field331 = field365.method32();
				field332 = field365.method30();
				field333 = field365.method30();
				if (field333 >= 100) {
					field373 = field329 * 128 + 64;
					field375 = field330 * 128 + 64;
					field374 = method197(field373, field246, field375) - field331;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 206) {
				int var165 = field365.method59();
				int var166 = field365.method58();
				OPFNUBIN var167 = OPFNUBIN.field1033[var165];
				if (var167 != null && var167.field1084 == 0) {
					if (var166 < 0) {
						var166 = 0;
					}

					if (var166 > var167.field1074 - var167.field1054) {
						var166 = var167.field1074 - var167.field1054;
					}

					var167.field1078 = var166;
				}

				field187 = -1;
				return true;
			}

			if (field187 == 106) {
				int var168 = field365.method30();
				int var169 = field365.method30();
				int var170 = field365.method30();
				int var171 = field365.method30();
				field307[var168] = true;
				field135[var168] = var169;
				field214[var168] = var170;
				field282[var168] = var171;
				field105[var168] = 0;
				field187 = -1;
				return true;
			}

			if (field187 == 156) {
				field89 = field365.method30();
				field58 = field365.method49();
				field409 = field365.method58();
				field65 = field365.method59();
				field150 = field365.method64();
				if (field150 != 0 && field412 == -1) {
					signlink.dnslookup(ZDHYRWCV.method590(field150));
					method179();
					short var172 = 650;
					if (field89 != 201 || field58 == 1) {
						var172 = 655;
					}

					field366 = "";
					field304 = false;

					for (int var173 = 0; var173 < OPFNUBIN.field1033.length; var173++) {
						if (OPFNUBIN.field1033[var173] != null && OPFNUBIN.field1033[var173].field1069 == var172) {
							field412 = OPFNUBIN.field1033[var173].field1041;
							break;
						}
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 172) {
				field234 = true;
				field394 = field365.method30();
				field395 = field365.method30();
				field396 = field365.method32();
				field397 = field365.method30();
				field398 = field365.method30();
				if (field398 >= 100) {
					int var174 = field394 * 128 + 64;
					int var175 = field395 * 128 + 64;
					int var176 = method197(var174, field246, var175) - field396;
					int var177 = var174 - field373;
					int var178 = var176 - field374;
					int var179 = var175 - field375;
					int var180 = (int) Math.sqrt(var177 * var177 + var179 * var179);
					field376 = (int) (Math.atan2(var178, var180) * 325.949D) & 0x7FF;
					field377 = (int) (Math.atan2(var177, var179) * -325.949D) & 0x7FF;

					if (field376 < 128) {
						field376 = 128;
					}

					if (field376 > 383) {
						field376 = 383;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 40) {
				field59 = true;
				int var181 = field365.method32();
				OPFNUBIN var182 = OPFNUBIN.field1033[var181];
				while (field365.field44 < field186) {
					int var183 = field365.method44();
					int var184 = field365.method32();
					int var185 = field365.method30();
					if (var185 == 255) {
						var185 = field365.method35();
					}

					if (var183 >= 0 && var183 < var182.field1062.length) {
						var182.field1062[var183] = var184;
						var182.field1086[var183] = var185;
					}
				}

				field187 = -1;
				return true;
			}

			if (field187 == 154) {
				field362 = field365.method30();
				if (field362 == 1) {
					field334 = field365.method32();
				}

				if (field362 >= 2 && field362 <= 6) {
					if (field362 == 2) {
						field280 = 64;
						field281 = 64;
					}

					if (field362 == 3) {
						field280 = 0;
						field281 = 64;
					}

					if (field362 == 4) {
						field280 = 128;
						field281 = 64;
					}

					if (field362 == 5) {
						field280 = 64;
						field281 = 0;
					}

					if (field362 == 6) {
						field280 = 64;
						field281 = 128;
					}

					field362 = 2;
					field277 = field365.method32();
					field278 = field365.method32();
					field279 = field365.method30();
				}

				if (field362 == 10) {
					field92 = field365.method32();
				}

				field187 = -1;
				return true;
			}

			if (field187 == 90) {
				int var186 = field365.method59();
				method113(var186);

				if (field450 != -1) {
					field450 = -1;
					field182 = true;
				}

				if (field191 != 0) {
					field191 = 0;
					field182 = true;
				}

				if (field245 != -1) {
					field245 = -1;
					field164 = true;
				}

				field326 = var186;
				field59 = true;
				field363 = true;
				field412 = -1;
				field367 = false;
				field187 = -1;
				return true;
			}

			if (field187 == 173) {
				field442 = field365.method30();
				field187 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field187 + "," + field186 + " - " + field209 + "," + field210);
			method154();
		} catch (IOException var191) {
			method88();
		} catch (Exception var192) {
			String var188 = "T2 - " + field187 + "," + field209 + "," + field210 + " - " + field186 + "," + (field121.field1314[0] + field385) + "," + (field121.field1315[0] + field386) + " - ";
			for (int var189 = 0; var189 < field186 && var189 < 50; var189++) {
				var188 = var188 + field365.field43[var189] + ",";
			}

			signlink.reporterror(var188);
			method154();
		}

		return true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method153() {
		field251.method264();
		UJNRJRYE.field1290 = field357;
		field136.method275(0, 0);

		if (field326 != -1) {
			method126(0, 0, 0, OPFNUBIN.field1033[field326]);
		} else if (field97[field64] != -1) {
			method126(0, 0, 0, OPFNUBIN.field1033[field97[field64]]);
		}

		if (field381 && field177 == 1) {
			method81();
		}

		field251.method265(205, 553, field1389);
		field253.method264();
		UJNRJRYE.field1290 = field358;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method154() {
		try {
			if (field256 != null) {
				field256.method469();
			}
		} catch (Exception var2) {
		}

		field256 = null;
		field430 = false;
		field108 = 0;
		field392 = "";
		field393 = "";
		method203();
		field123.method496();

		for (int var1 = 0; var1 < 4; var1++) {
			field457[var1].method300();
		}

		System.gc();
		method78();
		field101 = -1;
		field240 = -1;
		field337 = 0;
	}

	@ObfuscatedName("client.a(LOPFNUBIN;IIIIIIII)V")
	public final void method155(OPFNUBIN arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field462) {
			field224 = 32;
		} else {
			field224 = 0;
		}

		field462 = false;
		if (arg1 >= arg4 && arg1 < arg4 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
			arg0.field1078 -= field466 * 4;

			if (arg5 == 1) {
				field59 = true;
			}

			if (arg5 == 2) {
				field182 = true;
				return;
			}
		} else if (arg1 >= arg4 && arg1 < arg4 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
			arg0.field1078 += field466 * 4;

			if (arg5 == 1) {
				field59 = true;
			}

			if (arg5 == 2) {
				field182 = true;
				return;
			}
		} else if (arg1 >= arg4 - field224 && arg1 < arg4 + field224 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16 && field466 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg2 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg0.field1078 = (arg7 - arg3) * var10 / var11;

			if (arg5 == 1) {
				field59 = true;
			}

			if (arg5 == 2) {
				field182 = true;
			}

			field462 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method156(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field405[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 50) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method157(boolean arg0) {
		if (field121.field1333 >> 7 == field114 && field121.field1334 >> 7 == field115) {
			field114 = 0;
		}

		int var2 = field73;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			FHQGDDHF var4;
			int var5;
			if (arg0) {
				var4 = field121;
				var5 = field71 << 14;
			} else {
				var4 = field72[field74[var3]];
				var5 = field74[var3] << 14;
			}

			if (var4 != null && var4.method2()) {
				var4.field612 = false;
				if ((field272 && field73 > 50 || field73 > 200) && !arg0 && var4.field1356 == var4.field1344) {
					var4.field612 = true;
				}

				int var6 = var4.field1333 >> 7;
				int var7 = var4.field1334 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field610 == null || field145 < var4.field622 || field145 >= var4.field623) {
						if ((var4.field1333 & 0x7F) == 0x40 && (var4.field1334 & 0x7F) == 0x40) {
							if (field61[var6][var7] == field384) {
								continue;
							}

							field61[var6][var7] = field384;
						}

						var4.field618 = method197(var4.field1333, field246, var4.field1334);
						field123.method507(var4, var4.field1335, var4.field1337, var4.field1333, field246, 60, var4.field1334, var5, var4.field618);
					} else {
						var4.field612 = false;
						var4.field618 = method197(var4.field1333, field246, var4.field1334);
						field123.method508(var4.field616, var5, var4, var4.field1333, 60, var4.field1334, field246, var4.field615, var4.field1335, var4.field618, var4.field614, var4.field617);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method158(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field316; var2++) {
			if (arg0.equalsIgnoreCase(field98[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field121.field611)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IILCUKAGIIJ;I)V")
	public final void method159(int arg0, CUKAGIIJ arg1, int arg2) {
		int var4 = field291 + field275 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = LFTMDGKK.field883[var4];
			int var7 = LFTMDGKK.field884[var4];
			var6 = var6 * 256 / (field231 + 256);
			var7 = var7 * 256 / (field231 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method229(field137, 83 - var9 - arg1.field490 / 2 - 4, var8 + 94 - arg1.field489 / 2 + 4);
			} else {
				arg1.method223(var8 + 94 + 4 - arg1.field489 / 2, 83 - var9 - arg1.field490 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method160() {
		if (field442 == 0 && field1403 == 1) {
			int var1 = field1404 - 25 - 550;
			int var2 = field1405 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field291 + field275 & 0x7FF;
				int var4 = UJNRJRYE.field1288[var3];
				int var5 = UJNRJRYE.field1289[var3];
				var4 = (field231 + 256) * var4 >> 8;
				var5 = (field231 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field121.field1333 + var6 >> 7;
				int var9 = field121.field1334 - var7 >> 7;
				boolean var10 = method192(var8, 0, field121.field1314[0], 0, 0, var9, 1, 0, true, 0, field121.field1315[0]);
				if (var10) {
					field408.method20(var1);
					field408.method20(var2);
					field408.method21(field291);
					field408.method20(57);
					field408.method20(field275);
					field408.method20(field231);
					field408.method20(89);
					field408.method21(field121.field1333);
					field408.method21(field121.field1334);
					field408.method20(field355);
					field408.method20(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public final void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field467.method275(arg3, arg0);
		field468.method275(arg3, arg0 + arg4 - 16);
		OKWPDMPE.method436(arg3, arg0 + 16, field306, 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
		OKWPDMPE.method436(arg3, arg0 + var7 + 16, field352, 16, var6);
		OKWPDMPE.method441(arg3, arg0 + var7 + 16, field469, var6);
		OKWPDMPE.method441(arg3 + 1, arg0 + 16 + var7, field469, var6);
		OKWPDMPE.method439(16, arg0 + var7 + 16, field469, arg3);
		OKWPDMPE.method439(16, arg0 + var7 + 17, field469, arg3);
		OKWPDMPE.method441(arg3 + 15, arg0 + 16 + var7, field60, var6);
		OKWPDMPE.method441(arg3 + 14, arg0 + 17 + var7, field60, var6 - 1);
		OKWPDMPE.method439(16, arg0 + var7 + var6 + 15, field60, arg3);
		OKWPDMPE.method439(15, arg0 + var7 + var6 + 14, field60, arg3 + 1);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method162() {
		int var1 = field222.method280("Choose Option");
		for (int var2 = 0; var2 < field225; var2++) {
			int var3 = field222.method280(field364[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field225 * 15 + 21;
		if (field1404 > 4 && field1405 > 4 && field1404 < 516 && field1405 < 338) {
			int var5 = field1404 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1405 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field381 = true;
			field177 = 0;
			field178 = var5;
			field179 = var6;
			field180 = var1;
			field181 = field225 * 15 + 22;
		}

		if (field1404 > 553 && field1405 > 205 && field1404 < 743 && field1405 < 466) {
			int var7 = field1404 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1405 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field381 = true;
			field177 = 1;
			field178 = var7;
			field179 = var8;
			field180 = var1;
			field181 = field225 * 15 + 22;
		}

		if (field1404 > 17 && field1405 > 357 && field1404 < 496 && field1405 < 453) {
			int var9 = field1404 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1405 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field381 = true;
			field177 = 2;
			field178 = var9;
			field179 = var10;
			field180 = var1;
			field181 = field225 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method163() {
		signlink.reporterror = false;

		try {
			if (field256 != null) {
				field256.method469();
			}
		} catch (Exception var1) {
		}

		field256 = null;
		method78();

		if (field198 != null) {
			field198.field562 = false;
		}

		field198 = null;
		field288.method418();
		field288 = null;
		field295 = null;
		field408 = null;
		field474 = null;
		field365 = null;
		field479 = null;
		field344 = null;
		field117 = null;
		field480 = null;
		field481 = null;
		field360 = null;
		field308 = null;
		field123 = null;
		field457 = null;
		field456 = null;
		field425 = null;
		field443 = null;
		field444 = null;
		field194 = null;
		field251 = null;
		field252 = null;
		field253 = null;
		field254 = null;
		field153 = null;
		field154 = null;
		field155 = null;
		field168 = null;
		field169 = null;
		field170 = null;
		field171 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field175 = null;
		field176 = null;
		field136 = null;
		field137 = null;
		field138 = null;
		field463 = null;
		field464 = null;
		field465 = null;
		field204 = null;
		field339 = null;
		field340 = null;
		field341 = null;
		field342 = null;
		field343 = null;
		field345 = null;
		field346 = null;
		field347 = null;
		field348 = null;
		field349 = null;
		field156 = null;
		field63 = null;
		field312 = null;
		field283 = null;
		field436 = null;
		field437 = null;
		field438 = null;
		field439 = null;
		field440 = null;
		field302 = null;
		field426 = null;
		field61 = null;
		field72 = null;
		field74 = null;
		field76 = null;
		field77 = null;
		field144 = null;
		field296 = null;
		field298 = null;
		field78 = null;
		field451 = null;
		field441 = null;
		field100 = null;
		field403 = null;
		field404 = null;
		field405 = null;
		field406 = null;
		field364 = null;
		field351 = null;
		field125 = null;
		field126 = null;
		field134 = null;
		field116 = null;
		field98 = null;
		field274 = null;
		field160 = null;
		field82 = null;
		field83 = null;
		field79 = null;
		field80 = null;
		field81 = null;
		field84 = null;
		field85 = null;
		field86 = null;
		field87 = null;
		method85();
		QMZPELNG.method484();
		OMIIKHIV.method450();
		JPUETSNB.method333();
		YOJCLTLA.field1472 = null;
		PTMGRPAM.field1115 = null;
		OPFNUBIN.field1033 = null;
		LLHKHNWV.field889 = null;
		IUTBNGPH.field682 = null;
		BRGDZOWQ.field8 = null;
		BRGDZOWQ.field20 = null;
		OZAHPBMK.field1094 = null;
		field1390 = null;
		FHQGDDHF.field627 = null;
		UJNRJRYE.method547();
		SIPXLNWG.method495();
		LFTMDGKK.method337();
		CANZHIOT.method15();
		System.gc();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method164() {
		byte[] var1 = field482.method570("title.dat", null);
		CUKAGIIJ var2 = new CUKAGIIJ(var1, this);
		field82.method264();
		var2.method221(0, 0);
		field83.method264();
		var2.method221(0, -637);
		field79.method264();
		var2.method221(0, -128);
		field80.method264();
		var2.method221(-371, -202);
		field81.method264();
		var2.method221(-171, -202);
		field84.method264();
		var2.method221(-265, 0);
		field85.method264();
		var2.method221(-265, -562);
		field86.method264();
		var2.method221(-171, -128);
		field87.method264();
		var2.method221(-171, -562);
		int[] var3 = new int[var2.field485];
		for (int var4 = 0; var4 < var2.field486; var4++) {
			for (int var5 = 0; var5 < var2.field485; var5++) {
				var3[var5] = var2.field484[var2.field485 * var4 + var2.field485 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field485; var6++) {
				var2.field484[var2.field485 * var4 + var6] = var3[var6];
			}
		}

		field82.method264();
		var2.method221(0, 382);
		field83.method264();
		var2.method221(0, -255);
		field79.method264();
		var2.method221(0, 254);
		field80.method264();
		var2.method221(-371, 180);
		field81.method264();
		var2.method221(-171, 180);
		field84.method264();
		var2.method221(-265, 382);
		field85.method264();
		var2.method221(-265, -180);
		field86.method264();
		var2.method221(-171, 254);
		field87.method264();
		var2.method221(-171, -180);
		CUKAGIIJ var7 = new CUKAGIIJ(field482, "logo", 0);
		field79.method264();
		var7.method223(382 - var7.field485 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method165() {
		Graphics var1 = method149().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method580(1);

		if (field197) {
			field237 = false;
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

		if (field361) {
			field237 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field206) {
			field237 = false;
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

	@ObfuscatedName("client.C(I)V")
	public final void method166() {
		field322 = new FDCAWVRL(field482, "titlebox", 0);
		field323 = new FDCAWVRL(field482, "titlebutton", 0);
		field411 = new FDCAWVRL[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field411[var2] = new FDCAWVRL(field482, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field411[var3] = new FDCAWVRL(field482, "runes", (var3 & 0x3) + 12);
			}
		}

		field212 = new CUKAGIIJ(128, 265);
		field213 = new CUKAGIIJ(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field212.field484[var4] = field82.field549[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field213.field484[var5] = field83.field549[var5];
		}

		field446 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field446[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field446[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field446[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field446[var9 + 192] = 0xFFFFFF;
		}

		field447 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field447[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field447[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field447[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field447[var13 + 192] = 0xFFFFFF;
		}

		field448 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field448[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field448[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field448[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field448[var17 + 192] = 0xFFFFFF;
		}

		field445 = new int[256];
		field166 = new int[32768];
		field167 = new int[32768];
		method86(null);
		field428 = new int[32768];
		field429 = new int[32768];
		method206(10, "Connecting to fileserver");

		if (!field237) {
			field285 = true;
			field237 = true;
			method129(this, 2);
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method167() {
		for (IFXJSFHR var1 = (IFXJSFHR) field451.method71(); var1 != null; var1 = (IFXJSFHR) field451.method73()) {
			if (var1.field678 == -1) {
				var1.field679 = 0;
				method79(var1);
			} else {
				var1.method582();
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method168() {
		for (int var1 = 0; var1 < field297; var1++) {
			int var2 = field298[var1];
			ADGLALPC var3 = field296[var2];
			if (var3 != null) {
				method169(var3.field1.field1004, var3);
			}
		}
	}

	@ObfuscatedName("client.b(ILVNAWUDPP;I)V")
	public final void method169(int arg0, VNAWUDPP arg1) {
		if (arg1.field1333 < 128 || arg1.field1334 < 128 || arg1.field1333 >= 13184 || arg1.field1334 >= 13184) {
			arg1.field1349 = -1;
			arg1.field1306 = -1;
			arg1.field1326 = 0;
			arg1.field1327 = 0;
			arg1.field1333 = arg1.field1314[0] * 128 + arg1.field1343 * 64;
			arg1.field1334 = arg1.field1315[0] * 128 + arg1.field1343 * 64;
			arg1.method567();
		}

		if (field121 == arg1 && (arg1.field1333 < 1536 || arg1.field1334 < 1536 || arg1.field1333 >= 11776 || arg1.field1334 >= 11776)) {
			arg1.field1349 = -1;
			arg1.field1306 = -1;
			arg1.field1326 = 0;
			arg1.field1327 = 0;
			arg1.field1333 = arg1.field1314[0] * 128 + arg1.field1343 * 64;
			arg1.field1334 = arg1.field1315[0] * 128 + arg1.field1343 * 64;
			arg1.method567();
		}

		if (arg1.field1326 > field145) {
			method170(arg1);
		} else if (arg1.field1327 >= field145) {
			method171(arg1);
		} else {
			method172(arg1);
		}

		method173(arg1);
		method174(arg1);
	}

	@ObfuscatedName("client.a(LVNAWUDPP;I)V")
	public final void method170(VNAWUDPP arg0) {
		int var2 = arg0.field1326 - field145;
		int var3 = arg0.field1343 * 64 + arg0.field1322 * 128;
		int var4 = arg0.field1343 * 64 + arg0.field1324 * 128;
		arg0.field1333 += (var3 - arg0.field1333) / var2;
		arg0.field1334 += (var4 - arg0.field1334) / var2;
		arg0.field1355 = 0;

		if (arg0.field1328 == 0) {
			arg0.field1339 = 1024;
		}

		if (arg0.field1328 == 1) {
			arg0.field1339 = 1536;
		}

		if (arg0.field1328 == 2) {
			arg0.field1339 = 0;
		}

		if (arg0.field1328 == 3) {
			arg0.field1339 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLVNAWUDPP;)V")
	public final void method171(VNAWUDPP arg0) {
		if (field145 == arg0.field1327 || arg0.field1349 == -1 || arg0.field1352 != 0 || arg0.field1351 + 1 > IUTBNGPH.field682[arg0.field1349].method322(arg0.field1350)) {
			int var2 = arg0.field1327 - arg0.field1326;
			int var3 = field145 - arg0.field1326;
			int var4 = arg0.field1343 * 64 + arg0.field1322 * 128;
			int var5 = arg0.field1343 * 64 + arg0.field1324 * 128;
			int var6 = arg0.field1343 * 64 + arg0.field1323 * 128;
			int var7 = arg0.field1343 * 64 + arg0.field1325 * 128;
			arg0.field1333 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1334 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1355 = 0;

		if (arg0.field1328 == 0) {
			arg0.field1339 = 1024;
		}

		if (arg0.field1328 == 1) {
			arg0.field1339 = 1536;
		}

		if (arg0.field1328 == 2) {
			arg0.field1339 = 0;
		}

		if (arg0.field1328 == 3) {
			arg0.field1339 = 512;
		}

		arg0.field1335 = arg0.field1339;
	}

	@ObfuscatedName("client.a(BLVNAWUDPP;)V")
	public final void method172(VNAWUDPP arg0) {
		arg0.field1356 = arg0.field1344;
		if (arg0.field1329 == 0) {
			arg0.field1355 = 0;
		} else {
			if (arg0.field1349 != -1 && arg0.field1352 == 0) {
				IUTBNGPH var2 = IUTBNGPH.field682[arg0.field1349];
				if (arg0.field1338 > 0 && var2.field694 == 0) {
					arg0.field1355++;
					return;
				}

				if (arg0.field1338 <= 0 && var2.field695 == 0) {
					arg0.field1355++;
					return;
				}
			}

			int var3 = arg0.field1333;
			int var4 = arg0.field1334;
			int var5 = arg0.field1314[arg0.field1329 - 1] * 128 + arg0.field1343 * 64;
			int var6 = arg0.field1315[arg0.field1329 - 1] * 128 + arg0.field1343 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1339 = 1280;
					} else if (var4 > var6) {
						arg0.field1339 = 1792;
					} else {
						arg0.field1339 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1339 = 768;
					} else if (var4 > var6) {
						arg0.field1339 = 256;
					} else {
						arg0.field1339 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1339 = 1024;
				} else {
					arg0.field1339 = 0;
				}

				int var7 = arg0.field1339 - arg0.field1335 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1318;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1317;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1320;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1319;
				}

				if (var8 == -1) {
					var8 = arg0.field1317;
				}

				arg0.field1356 = var8;
				int var9 = 4;
				if (arg0.field1339 != arg0.field1335 && arg0.field1354 == -1 && arg0.field1305 != 0) {
					var9 = 2;
				}

				if (arg0.field1329 > 2) {
					var9 = 6;
				}

				if (arg0.field1329 > 3) {
					var9 = 8;
				}

				if (arg0.field1355 > 0 && arg0.field1329 > 1) {
					var9 = 8;
					arg0.field1355--;
				}

				if (arg0.field1340[arg0.field1329 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1356 == arg0.field1317 && arg0.field1321 != -1) {
					arg0.field1356 = arg0.field1321;
				}

				if (var3 < var5) {
					arg0.field1333 += var9;
					if (arg0.field1333 > var5) {
						arg0.field1333 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1333 -= var9;
					if (arg0.field1333 < var5) {
						arg0.field1333 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1334 += var9;
					if (arg0.field1334 > var6) {
						arg0.field1334 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1334 -= var9;
					if (arg0.field1334 < var6) {
						arg0.field1334 = var6;
					}
				}

				if (arg0.field1333 == var5 && arg0.field1334 == var6) {
					arg0.field1329--;

					if (arg0.field1338 > 0) {
						arg0.field1338--;
						return;
					}
				}
			} else {
				arg0.field1333 = var5;
				arg0.field1334 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(BLVNAWUDPP;)V")
	public final void method173(VNAWUDPP arg0) {
		if (arg0.field1305 != 0) {
			if (arg0.field1354 != -1 && arg0.field1354 < 32768) {
				ADGLALPC var2 = field296[arg0.field1354];
				if (var2 != null) {
					int var3 = arg0.field1333 - var2.field1333;
					int var4 = arg0.field1334 - var2.field1334;
					if (var3 != 0 || var4 != 0) {
						arg0.field1339 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1354 >= 32768) {
				int var5 = arg0.field1354 - 32768;
				if (field319 == var5) {
					var5 = field71;
				}

				FHQGDDHF var6 = field72[var5];
				if (var6 != null) {
					int var7 = arg0.field1333 - var6.field1333;
					int var8 = arg0.field1334 - var6.field1334;
					if (var7 != 0 || var8 != 0) {
						arg0.field1339 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1312 != 0 || arg0.field1313 != 0) && (arg0.field1329 == 0 || arg0.field1355 > 0)) {
				int var9 = arg0.field1333 - (arg0.field1312 - field385 - field385) * 64;
				int var10 = arg0.field1334 - (arg0.field1313 - field386 - field386) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1339 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1312 = 0;
				arg0.field1313 = 0;
			}

			int var11 = arg0.field1339 - arg0.field1335 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1305 || var11 > 2048 - arg0.field1305) {
					arg0.field1335 = arg0.field1339;
				} else if (var11 > 1024) {
					arg0.field1335 -= arg0.field1305;
				} else {
					arg0.field1335 += arg0.field1305;
				}

				arg0.field1335 &= 0x7FF;
				if (arg0.field1356 == arg0.field1344 && arg0.field1339 != arg0.field1335) {
					if (arg0.field1345 != -1) {
						arg0.field1356 = arg0.field1345;
						return;
					}

					arg0.field1356 = arg0.field1317;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILVNAWUDPP;)V")
	public final void method174(VNAWUDPP arg0) {
		arg0.field1337 = false;

		if (arg0.field1356 != -1) {
			IUTBNGPH var2 = IUTBNGPH.field682[arg0.field1356];
			arg0.field1358++;
			if (arg0.field1357 < var2.field683 && arg0.field1358 > var2.method322(arg0.field1357)) {
				arg0.field1358 = 0;
				arg0.field1357++;
			}

			if (arg0.field1357 >= var2.field683) {
				arg0.field1358 = 0;
				arg0.field1357 = 0;
			}
		}

		if (arg0.field1306 != -1 && field145 >= arg0.field1309) {
			if (arg0.field1307 < 0) {
				arg0.field1307 = 0;
			}

			IUTBNGPH var3 = BRGDZOWQ.field8[arg0.field1306].field12;
			arg0.field1308++;
			while (arg0.field1307 < var3.field683 && arg0.field1308 > var3.method322(arg0.field1307)) {
				arg0.field1308 -= var3.method322(arg0.field1307);
				arg0.field1307++;
			}

			if (arg0.field1307 >= var3.field683 && (arg0.field1307 < 0 || arg0.field1307 >= var3.field683)) {
				arg0.field1306 = -1;
			}
		}

		if (arg0.field1349 != -1 && arg0.field1352 <= 1) {
			IUTBNGPH var4 = IUTBNGPH.field682[arg0.field1349];
			if (var4.field694 == 1 && arg0.field1338 > 0 && arg0.field1326 <= field145 && arg0.field1327 < field145) {
				arg0.field1352 = 1;
				return;
			}
		}

		if (arg0.field1349 != -1 && arg0.field1352 == 0) {
			IUTBNGPH var5 = IUTBNGPH.field682[arg0.field1349];
			arg0.field1351++;
			while (arg0.field1350 < var5.field683 && arg0.field1351 > var5.method322(arg0.field1350)) {
				arg0.field1351 -= var5.method322(arg0.field1350);
				arg0.field1350++;
			}

			if (arg0.field1350 >= var5.field683) {
				arg0.field1350 -= var5.field687;
				arg0.field1353++;
				if (arg0.field1353 >= var5.field693) {
					arg0.field1349 = -1;
				}

				if (arg0.field1350 < 0 || arg0.field1350 >= var5.field683) {
					arg0.field1349 = -1;
				}
			}

			arg0.field1337 = var5.field689;
		}

		if (arg0.field1352 > 0) {
			arg0.field1352--;
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method175() {
		if (field164) {
			field164 = false;
			field168.method265(4, 0, field1389);
			field169.method265(357, 0, field1389);
			field170.method265(4, 722, field1389);
			field171.method265(205, 743, field1389);
			field172.method265(0, 0, field1389);
			field173.method265(4, 516, field1389);
			field174.method265(205, 516, field1389);
			field175.method265(357, 496, field1389);
			field176.method265(338, 0, field1389);
			field59 = true;
			field182 = true;
			field363 = true;
			field473 = true;

			if (field255 != 2) {
				field253.method265(4, 4, field1389);
				field252.method265(4, 550, field1389);
			}
		}

		if (field255 == 2) {
			method207();
		}

		if (field381 && field177 == 1) {
			field59 = true;
		}

		if (field326 != -1) {
			boolean var1 = method90(field320, field326);
			if (var1) {
				field59 = true;
			}
		}

		if (field435 == 2) {
			field59 = true;
		}

		if (field111 == 2) {
			field59 = true;
		}

		if (field59) {
			method153();
			field59 = false;
		}

		if (field450 == -1) {
			field162.field1078 = field407 - field372 - 77;

			if (field1397 > 448 && field1397 < 560 && field1398 > 332) {
				method155(field162, field1397 - 17, 0, 77, 463, -1, field1398 - 357, field407);
			}

			int var2 = field407 - field162.field1078 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field407 - 77) {
				var2 = field407 - 77;
			}

			if (field372 != var2) {
				field372 = var2;
				field182 = true;
			}
		}

		if (field450 != -1) {
			boolean var3 = method90(field320, field450);
			if (var3) {
				field182 = true;
			}
		}

		if (field435 == 3) {
			field182 = true;
		}

		if (field111 == 3) {
			field182 = true;
		}

		if (field183 != null) {
			field182 = true;
		}

		if (field381 && field177 == 2) {
			field182 = true;
		}

		if (field182) {
			method191();
			field182 = false;
		}

		if (field255 == 2) {
			method213();
			field252.method265(4, 550, field1389);
		}

		if (field400 != -1) {
			field363 = true;
		}

		if (field363) {
			if (field400 != -1 && field64 == field400) {
				field400 = -1;
				field408.method19(211);
				field408.method20(field64);
			}

			field363 = false;
			field155.method264();
			field465.method275(0, 0);

			if (field326 == -1) {
				if (field97[field64] != -1) {
					if (field64 == 0) {
						field339.method275(22, 10);
					}

					if (field64 == 1) {
						field340.method275(54, 8);
					}

					if (field64 == 2) {
						field340.method275(82, 8);
					}

					if (field64 == 3) {
						field341.method275(110, 8);
					}

					if (field64 == 4) {
						field343.method275(153, 8);
					}

					if (field64 == 5) {
						field343.method275(181, 8);
					}

					if (field64 == 6) {
						field342.method275(209, 9);
					}
				}

				if (field97[0] != -1 && (field400 != 0 || field145 % 20 < 10)) {
					field204[0].method275(29, 13);
				}

				if (field97[1] != -1 && (field400 != 1 || field145 % 20 < 10)) {
					field204[1].method275(53, 11);
				}

				if (field97[2] != -1 && (field400 != 2 || field145 % 20 < 10)) {
					field204[2].method275(82, 11);
				}

				if (field97[3] != -1 && (field400 != 3 || field145 % 20 < 10)) {
					field204[3].method275(115, 12);
				}

				if (field97[4] != -1 && (field400 != 4 || field145 % 20 < 10)) {
					field204[4].method275(153, 13);
				}

				if (field97[5] != -1 && (field400 != 5 || field145 % 20 < 10)) {
					field204[5].method275(180, 11);
				}

				if (field97[6] != -1 && (field400 != 6 || field145 % 20 < 10)) {
					field204[6].method275(208, 13);
				}
			}

			field155.method265(160, 516, field1389);
			field154.method264();
			field464.method275(0, 0);

			if (field326 == -1) {
				if (field97[field64] != -1) {
					if (field64 == 7) {
						field345.method275(42, 0);
					}

					if (field64 == 8) {
						field346.method275(74, 0);
					}

					if (field64 == 9) {
						field346.method275(102, 0);
					}

					if (field64 == 10) {
						field347.method275(130, 1);
					}

					if (field64 == 11) {
						field349.method275(173, 0);
					}

					if (field64 == 12) {
						field349.method275(201, 0);
					}

					if (field64 == 13) {
						field348.method275(229, 0);
					}
				}

				if (field97[8] != -1 && (field400 != 8 || field145 % 20 < 10)) {
					field204[7].method275(74, 2);
				}

				if (field97[9] != -1 && (field400 != 9 || field145 % 20 < 10)) {
					field204[8].method275(102, 3);
				}

				if (field97[10] != -1 && (field400 != 10 || field145 % 20 < 10)) {
					field204[9].method275(137, 4);
				}

				if (field97[11] != -1 && (field400 != 11 || field145 % 20 < 10)) {
					field204[10].method275(174, 2);
				}

				if (field97[12] != -1 && (field400 != 12 || field145 % 20 < 10)) {
					field204[11].method275(201, 2);
				}

				if (field97[13] != -1 && (field400 != 13 || field145 % 20 < 10)) {
					field204[12].method275(226, 2);
				}
			}

			field154.method265(466, 496, field1389);
			field253.method264();
		}

		if (field473) {
			field473 = false;
			field153.method264();
			field463.method275(0, 0);
			field221.method279(0xFFFFFF, "Public chat", 28, true, 55);

			if (field371 == 0) {
				field221.method279(0xFF00, "On", 41, true, 55);
			}

			if (field371 == 1) {
				field221.method279(0xFFFF00, "Friends", 41, true, 55);
			}

			if (field371 == 2) {
				field221.method279(0xFF0000, "Off", 41, true, 55);
			}

			if (field371 == 3) {
				field221.method279(0xFFFF, "Hide", 41, true, 55);
			}

			field221.method279(0xFFFFFF, "Private chat", 28, true, 184);

			if (field139 == 0) {
				field221.method279(0xFF00, "On", 41, true, 184);
			}

			if (field139 == 1) {
				field221.method279(0xFFFF00, "Friends", 41, true, 184);
			}

			if (field139 == 2) {
				field221.method279(0xFF0000, "Off", 41, true, 184);
			}

			field221.method279(0xFFFFFF, "Trade/compete", 28, true, 324);

			if (field119 == 0) {
				field221.method279(0xFF00, "On", 41, true, 324);
			}

			if (field119 == 1) {
				field221.method279(0xFFFF00, "Friends", 41, true, 324);
			}

			if (field119 == 2) {
				field221.method279(0xFF0000, "Off", 41, true, 324);
			}

			field221.method279(0xFFFFFF, "Report abuse", 33, true, 458);
			field153.method265(453, 0, field1389);
			field253.method264();
		}

		field320 = 0;
	}

	@ObfuscatedName("client.b(LOPFNUBIN;B)V")
	public final void method176(OPFNUBIN arg0) {
		int var2 = arg0.field1069;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field317 == 0) {
				arg0.field1080 = "Loading friend list";
				arg0.field1068 = 0;
			} else if (var2 == 1 && field317 == 1) {
				arg0.field1080 = "Connecting to friendserver";
				arg0.field1068 = 0;
			} else if (var2 == 2 && field317 != 2) {
				arg0.field1080 = "Please wait...";
				arg0.field1068 = 0;
			} else {
				int var3 = field316;
				if (field317 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1080 = "";
					arg0.field1068 = 0;
				} else {
					arg0.field1080 = field98[var2];
					arg0.field1068 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field316;
			if (field317 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1080 = "";
				arg0.field1068 = 0;
			} else {
				if (field160[var2] == 0) {
					arg0.field1080 = "@red@Offline";
				} else if (field160[var2] < 200) {
					if (field160[var2] == field269) {
						arg0.field1080 = "@gre@World-" + (field160[var2] - 9);
					} else {
						arg0.field1080 = "@yel@World-" + (field160[var2] - 9);
					}
				} else if (field160[var2] == field269) {
					arg0.field1080 = "@gre@Classic" + (field160[var2] - 219);
				} else {
					arg0.field1080 = "@yel@Classic" + (field160[var2] - 219);
				}

				arg0.field1068 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field316;
			if (field317 != 2) {
				var5 = 0;
			}

			arg0.field1074 = var5 * 15 + 20;
			if (arg0.field1074 <= arg0.field1054) {
				arg0.field1074 = arg0.field1054 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field317 == 0) {
				arg0.field1080 = "Loading ignore list";
				arg0.field1068 = 0;
			} else if (var2 == 1 && field317 == 0) {
				arg0.field1080 = "Please wait...";
				arg0.field1068 = 0;
			} else {
				int var6 = field321;
				if (field317 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1080 = "";
					arg0.field1068 = 0;
				} else {
					arg0.field1080 = ZDHYRWCV.method591(ZDHYRWCV.method588(field262[var2]));
					arg0.field1068 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1074 = field321 * 15 + 20;
			if (arg0.field1074 <= arg0.field1054) {
				arg0.field1074 = arg0.field1054 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1056 = 150;
			arg0.field1057 = (int) (Math.sin(field145 / 40.0D) * 256.0D) & 0x7FF;

			if (field236) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field193[var7];
					if (var8 >= 0 && !PTMGRPAM.field1115[var8].method465()) {
						return;
					}
				}

				field236 = false;
				LFTMDGKK[] var9 = new LFTMDGKK[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field193[var11];
					if (var12 >= 0) {
						var9[var10++] = PTMGRPAM.field1115[var12].method466();
					}
				}

				LFTMDGKK var13 = new LFTMDGKK(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field243[var14] != 0) {
						var13.method355(field382[var14][0], field382[var14][field243[var14]]);

						if (var14 == 1) {
							var13.method355(field309[0], field309[field243[var14]]);
						}
					}
				}

				var13.method348();
				var13.method349(IUTBNGPH.field682[field121.field1344].field684[0]);
				var13.method358(64, 850, -30, -50, -30, true);
				arg0.field1058 = 5;
				arg0.field1059 = 0;
				OPFNUBIN.method451(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field453 == null) {
				field453 = arg0.field1091;
				field454 = arg0.field1034;
			}

			if (field389) {
				arg0.field1091 = field454;
			} else {
				arg0.field1091 = field453;
			}
		} else if (var2 == 325) {
			if (field453 == null) {
				field453 = arg0.field1091;
				field454 = arg0.field1034;
			}

			if (field389) {
				arg0.field1091 = field453;
			} else {
				arg0.field1091 = field454;
			}
		} else if (var2 == 600) {
			arg0.field1080 = field366;
			if (field145 % 20 < 10) {
				arg0.field1080 = arg0.field1080 + "|";
			} else {
				arg0.field1080 = arg0.field1080 + " ";
			}
		} else if (var2 == 620) {
			if (field286 < 1) {
				arg0.field1080 = "";
			} else if (field304) {
				arg0.field1067 = 0xFF0000;
				arg0.field1080 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1067 = 0xFFFFFF;
				arg0.field1080 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field150 == 0) {
				arg0.field1080 = "";
			} else {
				String var15;
				if (field65 == 0) {
					var15 = "earlier today";
				} else if (field65 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field65 + " days ago";
				}

				arg0.field1080 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field409 == 0) {
				arg0.field1080 = "0 unread messages";
				arg0.field1067 = 0xFFFF00;
			}

			if (field409 == 1) {
				arg0.field1080 = "1 unread message";
				arg0.field1067 = 0xFF00;
			}

			if (field409 > 1) {
				arg0.field1080 = field409 + " unread messages";
				arg0.field1067 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field89 == 201) {
				if (field58 == 1) {
					arg0.field1080 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1080 = "";
				}
			} else if (field89 == 200) {
				arg0.field1080 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field89 == 0) {
					var16 = "Earlier today";
				} else if (field89 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field89 + " days ago";
				}

				arg0.field1080 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field89 == 201) {
				if (field58 == 1) {
					arg0.field1080 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1080 = "";
				}
			} else if (field89 == 200) {
				arg0.field1080 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1080 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field89 == 201) {
				if (field58 == 1) {
					arg0.field1080 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1080 = "";
				}
			} else if (field89 == 200) {
				arg0.field1080 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1080 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method177() {
		field164 = true;
	}

	@ObfuscatedName("client.a()V")
	public final void method178() {
		method206(20, "Starting up");

		if (signlink.sunjava) {
			field1383 = 5;
		}

		if (field273) {
			field206 = true;
		} else {
			field273 = true;
			boolean var1 = false;
			String var2 = method137();
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
						field268[var3] = new PJMJGLFE(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method216();
					field482 = method135(1, "title screen", "title", field327[1], 25);
					field220 = new FDMAFIMR(field482, "p11_full", false);
					field221 = new FDMAFIMR(field482, "p12_full", false);
					field222 = new FDMAFIMR(field482, "b12_full", false);
					field223 = new FDMAFIMR(field482, "q8_full", true);
					method164();
					method166();
					VSUYIIVA var4 = method135(2, "config", "config", field327[2], 30);
					VSUYIIVA var5 = method135(3, "interface", "interface", field327[3], 35);
					VSUYIIVA var6 = method135(4, "2d graphics", "media", field327[4], 40);
					VSUYIIVA var7 = method135(6, "textures", "textures", field327[6], 45);
					VSUYIIVA var8 = method135(7, "chat system", "wordenc", field327[7], 50);
					VSUYIIVA var9 = method135(8, "sound effects", "sounds", field327[8], 55);
					field308 = new byte[4][104][104];
					field360 = new int[4][105][105];
					field123 = new SIPXLNWG(104, 104, 4, field360);

					for (int var10 = 0; var10 < 4; var10++) {
						field457[var10] = new HQFIXEZL(104, 104);
					}

					field116 = new CUKAGIIJ(512, 512);
					VSUYIIVA var11 = method135(5, "update list", "versionlist", field327[5], 60);
					method206(60, "Connecting to update server");
					field288 = new OBRIXRSB();
					field288.method429(var11, this);
					CANZHIOT.method13(field288.method415());
					LFTMDGKK.method338(field288.method419(0), field288);

					if (!field272) {
						field240 = 0;
						try {
							field240 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field241 = true;
						field288.method426(2, field240);

						while (field288.method410() > 0) {
							method97();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field288.field957 > 3) {
								method76("ondemand");
								return;
							}
						}
					}

					method206(65, "Requesting animations");
					int var12 = field288.method419(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field288.method426(1, var13);
					}

					while (field288.method410() > 0) {
						int var14 = var12 - field288.method410();
						if (var14 > 0) {
							method206(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method97();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field288.field957 > 3) {
							method76("ondemand");
							return;
						}
					}

					method206(70, "Requesting models");
					int var15 = field288.method419(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field288.method422(var16);
						if ((var17 & 0x1) != 0) {
							field288.method426(0, var16);
						}
					}

					int var18 = field288.method410();
					while (field288.method410() > 0) {
						int var19 = var18 - field288.method410();
						if (var19 > 0) {
							method206(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method97();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field268[0] != null) {
						method206(75, "Requesting maps");
						field288.method426(3, field288.method424(0, 48, 47));
						field288.method426(3, field288.method424(1, 48, 47));
						field288.method426(3, field288.method424(0, 48, 48));
						field288.method426(3, field288.method424(1, 48, 48));
						field288.method426(3, field288.method424(0, 48, 49));
						field288.method426(3, field288.method424(1, 48, 49));
						field288.method426(3, field288.method424(0, 47, 47));
						field288.method426(3, field288.method424(1, 47, 47));
						field288.method426(3, field288.method424(0, 47, 48));
						field288.method426(3, field288.method424(1, 47, 48));
						field288.method426(3, field288.method424(0, 148, 48));
						field288.method426(3, field288.method424(1, 148, 48));
						int var20 = field288.method410();
						while (field288.method410() > 0) {
							int var21 = var20 - field288.method410();
							if (var21 > 0) {
								method206(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method97();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field288.method419(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field288.method422(var23);
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
							field288.method413(var25, 0, var23);
						}
					}

					field288.method428(field271);

					if (!field272) {
						int var26 = field288.method419(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field288.method423(var27)) {
								field288.method413((byte) 1, 2, var27);
							}
						}
					}

					method206(80, "Unpacking media");
					field136 = new FDCAWVRL(var6, "invback", 0);
					field138 = new FDCAWVRL(var6, "chatback", 0);
					field137 = new FDCAWVRL(var6, "mapback", 0);
					field463 = new FDCAWVRL(var6, "backbase1", 0);
					field464 = new FDCAWVRL(var6, "backbase2", 0);
					field465 = new FDCAWVRL(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field204[var28] = new FDCAWVRL(var6, "sideicons", var28);
					}

					field156 = new CUKAGIIJ(var6, "compass", 0);
					field318 = new CUKAGIIJ(var6, "mapedge", 0);
					field318.method220();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field302[var29] = new FDCAWVRL(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field426[var30] = new CUKAGIIJ(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field63[var31] = new CUKAGIIJ(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field312[var32] = new CUKAGIIJ(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field102 = new CUKAGIIJ(var6, "mapmarker", 0);
					field103 = new CUKAGIIJ(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field283[var33] = new CUKAGIIJ(var6, "cross", var33);
					}

					field436 = new CUKAGIIJ(var6, "mapdots", 0);
					field437 = new CUKAGIIJ(var6, "mapdots", 1);
					field438 = new CUKAGIIJ(var6, "mapdots", 2);
					field439 = new CUKAGIIJ(var6, "mapdots", 3);
					field440 = new CUKAGIIJ(var6, "mapdots", 4);
					field467 = new FDCAWVRL(var6, "scrollbar", 0);
					field468 = new FDCAWVRL(var6, "scrollbar", 1);
					field339 = new FDCAWVRL(var6, "redstone1", 0);
					field340 = new FDCAWVRL(var6, "redstone2", 0);
					field341 = new FDCAWVRL(var6, "redstone3", 0);
					field342 = new FDCAWVRL(var6, "redstone1", 0);
					field342.method272();
					field343 = new FDCAWVRL(var6, "redstone2", 0);
					field343.method272();
					field345 = new FDCAWVRL(var6, "redstone1", 0);
					field345.method273();
					field346 = new FDCAWVRL(var6, "redstone2", 0);
					field346.method273();
					field347 = new FDCAWVRL(var6, "redstone3", 0);
					field347.method273();
					field348 = new FDCAWVRL(var6, "redstone1", 0);
					field348.method272();
					field348.method273();
					field349 = new FDCAWVRL(var6, "redstone2", 0);
					field349.method272();
					field349.method273();

					for (int var34 = 0; var34 < 2; var34++) {
						field267[var34] = new FDCAWVRL(var6, "mod_icons", var34);
					}

					CUKAGIIJ var35 = new CUKAGIIJ(var6, "backleft1", 0);
					field168 = new EDCVNWGU(method149(), var35.field486, var35.field485);
					var35.method221(0, 0);
					CUKAGIIJ var36 = new CUKAGIIJ(var6, "backleft2", 0);
					field169 = new EDCVNWGU(method149(), var36.field486, var36.field485);
					var36.method221(0, 0);
					CUKAGIIJ var37 = new CUKAGIIJ(var6, "backright1", 0);
					field170 = new EDCVNWGU(method149(), var37.field486, var37.field485);
					var37.method221(0, 0);
					CUKAGIIJ var38 = new CUKAGIIJ(var6, "backright2", 0);
					field171 = new EDCVNWGU(method149(), var38.field486, var38.field485);
					var38.method221(0, 0);
					CUKAGIIJ var39 = new CUKAGIIJ(var6, "backtop1", 0);
					field172 = new EDCVNWGU(method149(), var39.field486, var39.field485);
					var39.method221(0, 0);
					CUKAGIIJ var40 = new CUKAGIIJ(var6, "backvmid1", 0);
					field173 = new EDCVNWGU(method149(), var40.field486, var40.field485);
					var40.method221(0, 0);
					CUKAGIIJ var41 = new CUKAGIIJ(var6, "backvmid2", 0);
					field174 = new EDCVNWGU(method149(), var41.field486, var41.field485);
					var41.method221(0, 0);
					CUKAGIIJ var42 = new CUKAGIIJ(var6, "backvmid3", 0);
					field175 = new EDCVNWGU(method149(), var42.field486, var42.field485);
					var42.method221(0, 0);
					CUKAGIIJ var43 = new CUKAGIIJ(var6, "backhmid2", 0);
					field176 = new EDCVNWGU(method149(), var43.field486, var43.field485);
					var43.method221(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field426[var48] != null) {
							field426[var48].method219(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field302[var48] != null) {
							field302[var48].method274(var46 + var47, var44 + var47, var45 + var47);
						}
					}

					method206(83, "Unpacking textures");
					UJNRJRYE.method552(var7);
					UJNRJRYE.method556(0.8D);
					UJNRJRYE.method551(20);
					method206(86, "Unpacking config");
					IUTBNGPH.method321(var4);
					QMZPELNG.method485(var4);
					YOJCLTLA.method583(var4);
					JPUETSNB.method334(var4);
					OMIIKHIV.method448(var4);
					PTMGRPAM.method463(var4);
					BRGDZOWQ.method9(var4);
					OZAHPBMK.method457(var4);
					DDXRHBHP.method232(var4);
					JPUETSNB.field770 = field271;

					if (!field272) {
						method206(90, "Unpacking sounds");
						byte[] var49 = var9.method570("sounds.dat", null);
						CFARFRSG var50 = new CFARFRSG(var49);
						VSVAEWAC.method571(var50);
					}

					method206(95, "Unpacking interfaces");
					FDMAFIMR[] var51 = new FDMAFIMR[] { field220, field221, field222, field223 };
					OPFNUBIN.method452(var6, var5, var51);
					method206(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field137.field587[field137.field589 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field258[var52] = var53;
						field328[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field137.field587[field137.field589 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field165[var56 - 5] = var57 - 25;
						field104[var56 - 5] = var58 - var57;
					}

					UJNRJRYE.method549(96, 479);
					field356 = UJNRJRYE.field1290;
					UJNRJRYE.method549(261, 190);
					field357 = UJNRJRYE.field1290;
					UJNRJRYE.method549(334, 512);
					field358 = UJNRJRYE.field1290;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = UJNRJRYE.field1288[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					SIPXLNWG.method532(var60, 500, 512, 334, 800);
					MUWLFOWQ.method372(var8);
					field198 = new EIPZGSZT(this);
					method129(field198, 10);
					LPVEAYFU.field917 = this;
					QMZPELNG.field1181 = this;
					OMIIKHIV.field1010 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field219 + " " + field152);
					field197 = true;
				}
			} else {
				field361 = true;
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method179() {
		field408.method19(31);

		if (field326 != -1) {
			field326 = -1;
			field59 = true;
			field367 = false;
			field363 = true;
		}

		if (field450 != -1) {
			field450 = -1;
			field182 = true;
			field367 = false;
		}

		if (field245 != -1) {
			field245 = -1;
			field164 = true;
		}

		field412 = -1;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method180() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field428[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field428[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field429[var10] = (field428[var10 - 1] + field428[var10 + 1] + field428[var10 - 128] + field428[var10 + 128]) / 4;
			}
		}

		field483 += 128;
		if (field483 > field166.length) {
			field483 -= field166.length;
			int var11 = (int) (Math.random() * 12.0D);
			method86(field411[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field429[var14 + 128] - field166[field483 + var14 & field166.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field428[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field370[var16] = field370[var16 + 1];
		}

		field370[var1 - 1] = (int) (Math.sin(field145 / 14.0D) * 16.0D + Math.sin(field145 / 15.0D) * 14.0D + Math.sin(field145 / 16.0D) * 12.0D);

		if (field200 > 0) {
			field200 -= 4;
		}

		if (field201 > 0) {
			field201 -= 4;
		}

		if (field200 == 0 && field201 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field200 = 1024;
			}

			if (var17 == 1) {
				field201 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method181(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field69[var4] != null) {
				int var5 = field67[var4];
				int var6 = field372 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field68[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field371 == 0 || field371 == 1 && method158(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field121.field611)) {
						if (field286 >= 1) {
							field364[field225] = "Report abuse @whi@" + var7;
							field405[field225] = 853;
							field225++;
						}

						field364[field225] = "Add ignore @whi@" + var7;
						field405[field225] = 992;
						field225++;
						field364[field225] = "Add friend @whi@" + var7;
						field405[field225] = 50;
						field225++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field284 == 0 && (var5 == 7 || field139 == 0 || field139 == 1 && method158(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field286 >= 1) {
							field364[field225] = "Report abuse @whi@" + var7;
							field405[field225] = 853;
							field225++;
						}

						field364[field225] = "Add ignore @whi@" + var7;
						field405[field225] = 992;
						field225++;
						field364[field225] = "Add friend @whi@" + var7;
						field405[field225] = 50;
						field225++;
					}

					var3++;
				}

				if (var5 == 4 && (field119 == 0 || field119 == 1 && method158(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field364[field225] = "Accept trade @whi@" + var7;
						field405[field225] = 917;
						field225++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field284 == 0 && field139 < 2) {
					var3++;
				}

				if (var5 == 8 && (field119 == 0 || field119 == 1 && method158(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field364[field225] = "Accept challenge @whi@" + var7;
						field405[field225] = 235;
						field225++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method182() {
		if (field226 == 0 && field215 == 0) {
			field364[field225] = "Walk here";
			field405[field225] = 189;
			field403[field225] = field1397;
			field404[field225] = field1398;
			field225++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < LFTMDGKK.field881; var2++) {
			int var3 = LFTMDGKK.field882[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field123.method526(field246, var4, var5, var3) >= 0) {
					QMZPELNG var8 = QMZPELNG.method486(var7);
					if (var8.field1143 != null) {
						var8 = var8.method487();
					}

					if (var8 == null) {
						continue;
					}

					if (field226 == 1) {
						field364[field225] = "Use " + field230 + " with @cya@" + var8.field1175;
						field405[field225] = 28;
						field406[field225] = var3;
						field403[field225] = var4;
						field404[field225] = var5;
						field225++;
					} else if (field215 != 1) {
						if (var8.field1173 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1173[var9] != null) {
									field364[field225] = var8.field1173[var9] + " @cya@" + var8.field1175;

									if (var9 == 0) {
										field405[field225] = 921;
									}

									if (var9 == 1) {
										field405[field225] = 215;
									}

									if (var9 == 2) {
										field405[field225] = 860;
									}

									if (var9 == 3) {
										field405[field225] = 277;
									}

									if (var9 == 4) {
										field405[field225] = 1485;
									}

									field406[field225] = var3;
									field403[field225] = var4;
									field404[field225] = var5;
									field225++;
								}
							}
						}

						field364[field225] = "Examine @cya@" + var8.field1175;
						field405[field225] = 1741;
						field406[field225] = var8.field1176 << 14;
						field403[field225] = var4;
						field404[field225] = var5;
						field225++;
					} else if ((field217 & 0x4) == 4) {
						field364[field225] = field218 + " @cya@" + var8.field1175;
						field405[field225] = 464;
						field406[field225] = var3;
						field403[field225] = var4;
						field404[field225] = var5;
						field225++;
					}
				}

				if (var6 == 1) {
					ADGLALPC var10 = field296[var7];
					if (var10.field1.field1004 == 1 && (var10.field1333 & 0x7F) == 0x40 && (var10.field1334 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field297; var11++) {
							ADGLALPC var12 = field296[field298[var11]];
							if (var12 != null && var10 != var12 && var12.field1.field1004 == 1 && var10.field1333 == var12.field1333 && var10.field1334 == var12.field1334) {
								method83(var12.field1, var4, field298[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field73; var13++) {
							FHQGDDHF var14 = field72[field74[var13]];
							if (var14 != null && var10.field1333 == var14.field1333 && var10.field1334 == var14.field1334) {
								method146(var14, var4, var5, field74[var13]);
							}
						}
					}

					method83(var10.field1, var4, var7, var5);
				}

				if (var6 == 0) {
					FHQGDDHF var15 = field72[var7];
					if ((var15.field1333 & 0x7F) == 0x40 && (var15.field1334 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field297; var16++) {
							ADGLALPC var17 = field296[field298[var16]];
							if (var17 != null && var17.field1.field1004 == 1 && var15.field1333 == var17.field1333 && var15.field1334 == var17.field1334) {
								method83(var17.field1, var4, field298[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field73; var18++) {
							FHQGDDHF var19 = field72[field74[var18]];
							if (var19 != null && var15 != var19 && var15.field1333 == var19.field1333 && var15.field1334 == var19.field1334) {
								method146(var19, var4, var5, field74[var18]);
							}
						}
					}

					method146(var15, var4, var5, var7);
				}

				if (var6 == 3) {
					CLCMCMIN var20 = field78[field246][var4][var5];
					if (var20 != null) {
						for (CVTFWCOC var21 = (CVTFWCOC) var20.method72(); var21 != null; var21 = (CVTFWCOC) var20.method74()) {
							JPUETSNB var22 = JPUETSNB.method329(var21.field491);
							if (field226 == 1) {
								field364[field225] = "Use " + field230 + " with @lre@" + var22.field768;
								field405[field225] = 343;
								field406[field225] = var21.field491;
								field403[field225] = var4;
								field404[field225] = var5;
								field225++;
							} else if (field215 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field767 != null && var22.field767[var23] != null) {
										field364[field225] = var22.field767[var23] + " @lre@" + var22.field768;

										if (var23 == 0) {
											field405[field225] = 279;
										}

										if (var23 == 1) {
											field405[field225] = 604;
										}

										if (var23 == 2) {
											field405[field225] = 248;
										}

										if (var23 == 3) {
											field405[field225] = 63;
										}

										if (var23 == 4) {
											field405[field225] = 401;
										}

										field406[field225] = var21.field491;
										field403[field225] = var4;
										field404[field225] = var5;
										field225++;
									} else if (var23 == 2) {
										field364[field225] = "Take @lre@" + var22.field768;
										field405[field225] = 248;
										field406[field225] = var21.field491;
										field403[field225] = var4;
										field404[field225] = var5;
										field225++;
									}
								}

								field364[field225] = "Examine @lre@" + var22.field768;
								field405[field225] = 1491;
								field406[field225] = var21.field491;
								field403[field225] = var4;
								field404[field225] = var5;
								field225++;
							} else if ((field217 & 0x1) == 1) {
								field364[field225] = field218 + " @lre@" + var22.field768;
								field405[field225] = 4;
								field406[field225] = var21.field491;
								field403[field225] = var4;
								field404[field225] = var5;
								field225++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLCFARFRSG;I)V")
	public final void method183(CFARFRSG arg0, int arg1) {
		for (int var3 = 0; var3 < field75; var3++) {
			int var4 = field76[var3];
			ADGLALPC var5 = field296[var4];
			int var6 = arg0.method30();
			if ((var6 & 0x8) != 0) {
				int var7 = arg0.method59();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg0.method50();
				if (var5.field1349 == var7 && var7 != -1) {
					int var9 = IUTBNGPH.field682[var7].field696;
					if (var9 == 1) {
						var5.field1350 = 0;
						var5.field1351 = 0;
						var5.field1352 = var8;
						var5.field1353 = 0;
					}

					if (var9 == 2) {
						var5.field1353 = 0;
					}
				} else if (var7 == -1 || var5.field1349 == -1 || IUTBNGPH.field682[var7].field690 >= IUTBNGPH.field682[var5.field1349].field690) {
					var5.field1349 = var7;
					var5.field1350 = 0;
					var5.field1351 = 0;
					var5.field1352 = var8;
					var5.field1353 = 0;
					var5.field1338 = var5.field1329;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var10 = arg0.method50();
				int var11 = arg0.method51();
				var5.method568(var10, var11, field145);
				var5.field1346 = field145 + 300;
				var5.field1347 = arg0.method49();
				var5.field1348 = arg0.method51();
			}

			if ((var6 & 0x1) != 0) {
				var5.field1 = OMIIKHIV.method444(arg0.method59());
				var5.field1343 = var5.field1.field1004;
				var5.field1305 = var5.field1.field1019;
				var5.field1317 = var5.field1.field1001;
				var5.field1318 = var5.field1.field1025;
				var5.field1319 = var5.field1.field997;
				var5.field1320 = var5.field1.field1008;
				var5.field1344 = var5.field1.field1011;
			}

			if ((var6 & 0x10) != 0) {
				var5.field1354 = arg0.method32();
				if (var5.field1354 == 0xFFFF) {
					var5.field1354 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1342 = arg0.method37();
				var5.field1336 = 100;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1312 = arg0.method58();
				var5.field1313 = arg0.method32();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1306 = arg0.method32();
				int var12 = arg0.method65();
				var5.field1310 = var12 >> 16;
				var5.field1309 = (var12 & 0xFFFF) + field145;
				var5.field1307 = 0;
				var5.field1308 = 0;

				if (var5.field1309 > field145) {
					var5.field1307 = -1;
				}

				if (var5.field1306 == 0xFFFF) {
					var5.field1306 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var13 = arg0.method49();
				int var14 = arg0.method50();
				var5.method568(var13, var14, field145);
				var5.field1346 = field145 + 300;
				var5.field1347 = arg0.method30();
				var5.field1348 = arg0.method30();
			}
		}
	}

	@ObfuscatedName("client.d(IILCFARFRSG;)V")
	public final void method184(int arg0, CFARFRSG arg1) {
		int var3 = arg1.method41(8);
		if (var3 < field73) {
			for (int var4 = var3; var4 < field73; var4++) {
				field144[field143++] = field74[var4];
			}
		}

		if (var3 > field73) {
			signlink.reporterror(field392 + " Too many players");
			throw new RuntimeException("eek");
		}

		field73 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field74[var5];
			FHQGDDHF var7 = field72[var6];
			int var8 = arg1.method41(1);
			if (var8 == 0) {
				field74[field73++] = var6;
				var7.field1316 = field145;
			} else {
				int var9 = arg1.method41(2);
				if (var9 == 0) {
					field74[field73++] = var6;
					var7.field1316 = field145;
					field76[field75++] = var6;
				} else if (var9 == 1) {
					field74[field73++] = var6;
					var7.field1316 = field145;
					int var10 = arg1.method41(3);
					var7.method566(var10, false);
					int var11 = arg1.method41(1);
					if (var11 == 1) {
						field76[field75++] = var6;
					}
				} else if (var9 == 2) {
					field74[field73++] = var6;
					var7.field1316 = field145;
					int var12 = arg1.method41(3);
					var7.method566(var12, true);
					int var13 = arg1.method41(3);
					var7.method566(var13, true);
					int var14 = arg1.method41(1);
					if (var14 == 1) {
						field76[field75++] = var6;
					}
				} else if (var9 == 3) {
					field144[field143++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method185() {
		if (field362 == 2) {
			method106((field277 - field385 << 7) + field280, field279 * 2, (field278 - field386 << 7) + field281);

			if (field353 > -1 && field145 % 20 < 10) {
				field312[2].method223(field353 - 12, field354 - 28);
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method186() {
		if (field254 == null) {
			method85();
			field1390 = null;
			field79 = null;
			field80 = null;
			field81 = null;
			field82 = null;
			field83 = null;
			field84 = null;
			field85 = null;
			field86 = null;
			field87 = null;
			field254 = new EDCVNWGU(method149(), 96, 479);
			field252 = new EDCVNWGU(method149(), 156, 172);
			OKWPDMPE.method434();
			field137.method275(0, 0);
			field251 = new EDCVNWGU(method149(), 261, 190);
			field253 = new EDCVNWGU(method149(), 334, 512);
			OKWPDMPE.method434();
			field153 = new EDCVNWGU(method149(), 50, 496);
			field154 = new EDCVNWGU(method149(), 37, 269);
			field155 = new EDCVNWGU(method149(), 45, 249);
			field164 = true;
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method187(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method188(int arg0) {
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

	@ObfuscatedName("client.e(III)Ljava/lang/String;")
	public static final String method189(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field123.method522(arg0, arg2, arg4);
		if (var6 != 0) {
			int var7 = field123.method526(arg0, arg2, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field116.field484;
			int var12 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			QMZPELNG var14 = QMZPELNG.method486(var13);
			if (var14.field1140 == -1) {
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
				FDCAWVRL var15 = field302[var14.field1140];
				if (var15 != null) {
					int var16 = (var14.field1178 * 4 - var15.field589) / 2;
					int var17 = (var14.field1142 * 4 - var15.field590) / 2;
					var15.method275(arg2 * 4 + var16 + 48, (104 - arg4 - var14.field1142) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field123.method524(arg0, arg2, arg4);
		if (var18 != 0) {
			int var19 = field123.method526(arg0, arg2, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			QMZPELNG var23 = QMZPELNG.method486(var22);
			if (var23.field1140 != -1) {
				FDCAWVRL var24 = field302[var23.field1140];
				if (var24 != null) {
					int var25 = (var23.field1178 * 4 - var24.field589) / 2;
					int var26 = (var23.field1142 * 4 - var24.field590) / 2;
					var24.method275(arg2 * 4 + var25 + 48, (104 - arg4 - var23.field1142) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field116.field484;
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

		int var30 = field123.method525(arg0, arg2, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			QMZPELNG var32 = QMZPELNG.method486(var31);
			if (var32.field1140 != -1) {
				FDCAWVRL var33 = field302[var32.field1140];
				if (var33 != null) {
					int var34 = (var32.field1178 * 4 - var33.field589) / 2;
					int var35 = (var32.field1142 * 4 - var33.field590) / 2;
					var33.method275(arg2 * 4 + var34 + 48, (104 - arg4 - var32.field1142) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method191() {
		field254.method264();
		UJNRJRYE.field1290 = field356;
		field138.method275(0, 0);

		if (field90) {
			field222.method278(40, field133, 0, 239);
			field222.method278(60, field424 + "*", 128, 239);
		} else if (field191 == 1) {
			field222.method278(40, "Enter amount:", 0, 239);
			field222.method278(60, field151 + "*", 128, 239);
		} else if (field191 == 2) {
			field222.method278(40, "Enter name:", 0, 239);
			field222.method278(60, field151 + "*", 128, 239);
		} else if (field183 != null) {
			field222.method278(40, field183, 0, 239);
			field222.method278(60, "Click to continue", 128, 239);
		} else if (field450 != -1) {
			method126(0, 0, 0, OPFNUBIN.field1033[field450]);
		} else if (field287 == -1) {
			FDMAFIMR var1 = field221;
			int var2 = 0;
			OKWPDMPE.method433(463, 77, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field69[var3] != null) {
					int var4 = field67[var3];
					int var5 = field372 + 70 - var2 * 14;
					String var6 = field68[var3];
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
							var1.method282(field69[var3], 4, 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field371 == 0 || field371 == 1 && method158(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field267[0].method275(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field267[1].method275(var8, var5 - 12);
								var8 += 14;
							}

							var1.method282(var6 + ":", var8, 0, var5);
							var8 += var1.method280(var6) + 8;
							var1.method282(field69[var3], var8, 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field284 == 0 && (var4 == 7 || field139 == 0 || field139 == 1 && method158(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method282("From", var9, 0, var5);
							int var11 = var9 + var1.method280("From ");
							if (var7 == 1) {
								field267[0].method275(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field267[1].method275(var11, var5 - 12);
								var11 += 14;
							}

							var1.method282(var6 + ":", var11, 0, var5);
							var11 += var1.method280(var6) + 8;
							var1.method282(field69[var3], var11, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field119 == 0 || field119 == 1 && method158(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method282(var6 + " " + field69[var3], 4, 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field284 == 0 && field139 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method282(field69[var3], 4, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field284 == 0 && field139 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method282("To " + var6 + ":", 4, 0, var5);
							var1.method282(field69[var3], var1.method280("To " + var6) + 12, 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field119 == 0 || field119 == 1 && method158(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method282(var6 + " " + field69[var3], 4, 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			OKWPDMPE.method432();
			field407 = var2 * 14 + 7;
			if (field407 < 78) {
				field407 = 78;
			}

			method161(0, field407, field407 - field372 - 77, 463, 77);
			String var10;
			if (field121 == null || field121.field611 == null) {
				var10 = ZDHYRWCV.method591(field392);
			} else {
				var10 = field121.field611;
			}

			var1.method282(var10 + ":", 4, 0, 90);
			var1.method282(field350 + "*", var1.method280(var10 + ": ") + 6, 255, 90);
			OKWPDMPE.method439(479, 77, 0, 0);
		} else {
			method126(0, 0, 0, OPFNUBIN.field1033[field287]);
		}

		if (field381 && field177 == 2) {
			method81();
		}

		field254.method265(357, 17, field1389);
		field253.method264();
		UJNRJRYE.field1290 = field358;
	}

	@ObfuscatedName("client.a(IIIIIIIIZIII)Z")
	public final boolean method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field456[var14][var15] = 0;
				field425[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg10;
		field456[arg2][arg10] = 99;
		field425[arg2][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field443[var18] = arg2;
		int var35 = var18 + 1;
		field444[var18] = arg10;
		boolean var20 = false;
		int var21 = field443.length;
		int[][] var22 = field457[field246].field667;
		while (var35 != var19) {
			var16 = field443[var19];
			var17 = field444[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && field457[field246].method309(arg4 - 1, var16, arg3, arg5, arg0, var17)) {
					var20 = true;
					break;
				}

				if (arg4 < 10 && field457[field246].method310(var16, arg0, arg3, var17, arg4 - 1, arg5)) {
					var20 = true;
					break;
				}
			}

			if (arg7 != 0 && arg1 != 0 && field457[field246].method311(arg5, arg1, arg9, arg7, var17, var16, arg0)) {
				var20 = true;
				break;
			}

			int var23 = field425[var16][var17] + 1;
			if (var16 > 0 && field456[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field443[var35] = var16 - 1;
				field444[var35] = var17;
				var35 = (var35 + 1) % var21;
				field456[var16 - 1][var17] = 2;
				field425[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field456[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field443[var35] = var16 + 1;
				field444[var35] = var17;
				var35 = (var35 + 1) % var21;
				field456[var16 + 1][var17] = 8;
				field425[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field456[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field443[var35] = var16;
				field444[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field456[var16][var17 - 1] = 1;
				field425[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field456[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field443[var35] = var16;
				field444[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field456[var16][var17 + 1] = 4;
				field425[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field456[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field443[var35] = var16 - 1;
				field444[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field456[var16 - 1][var17 - 1] = 3;
				field425[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field456[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field443[var35] = var16 + 1;
				field444[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field456[var16 + 1][var17 - 1] = 9;
				field425[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field456[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field443[var35] = var16 - 1;
				field444[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field456[var16 - 1][var17 + 1] = 6;
				field425[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field456[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field443[var35] = var16 + 1;
				field444[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field456[var16 + 1][var17 + 1] = 12;
				field425[var16 + 1][var17 + 1] = var23;
			}
		}

		field355 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg5 - var25; var27 <= arg5 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field425[var26][var27] < var24) {
								var24 = field425[var26][var27];
								var16 = var26;
								var17 = var27;
								field355 = 1;
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
		field443[var28] = var16;
		int var36 = var28 + 1;
		field444[var28] = var17;
		int var29;
		int var30 = var29 = field456[var16][var17];
		while (arg2 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field443[var36] = var16;
				field444[var36++] = var17;
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

			var30 = field456[var16][var17];
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
		int var32 = field443[var36];
		int var33 = field444[var36];

		if (arg6 == 0) {
			field408.method19(48);
			field408.method20(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field408.method19(72);
			field408.method20(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field408.method19(213);
			field408.method20(var31 + var31 + 3);
		}

		field114 = field443[0];
		field115 = field444[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field408.method20(field443[var36] - var32);
			field408.method48(field444[var36] - var33);
		}

		field408.method20(field1407[5] == 1 ? 1 : 0);
		field408.method54(field385 + var32);
		field408.method56(field386 + var33);
		return true;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method193() {
		if (field410 > 1) {
			field410--;
		}

		if (field190 > 0) {
			field190--;
		}

		for (int var1 = 0; var1 < 5 && method152(); var1++) {
		}

		if (field430) {
			synchronized (field198.field560) {
				if (!field383) {
					field198.field563 = 0;
				} else if (field1403 != 0 || field198.field563 >= 40) {
					field408.method19(78);
					field408.method20(0);
					int var3 = field408.field44;
					int var4 = 0;
					for (int var5 = 0; var5 < field198.field563 && var3 - field408.field44 < 240; var5++) {
						var4++;
						int var6 = field198.field558[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field198.field559[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field198.field558[var5] == -1 && field198.field559[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field313 != var7 || field314 != var6) {
							int var9 = var7 - field313;
							field313 = var7;
							int var10 = var6 - field314;
							field314 = var6;

							if (field159 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field408.method21((field159 << 12) + (var9 << 6) + var10);
								field159 = 0;
							} else if (field159 < 8) {
								field408.method23((field159 << 19) + var8 + 0x800000);
								field159 = 0;
							} else {
								field408.method24((field159 << 19) + var8 - 0x40000000);
								field159 = 0;
							}
						} else if (field159 < 2047) {
							field159++;
						}
					}

					field408.method29(field408.field44 - var3);

					if (var4 >= field198.field563) {
						field198.field563 = 0;
					} else {
						field198.field563 -= var4;
						for (int var11 = 0; var11 < field198.field563; var11++) {
							field198.field559[var11] = field198.field559[var4 + var11];
							field198.field558[var11] = field198.field558[var4 + var11];
						}
					}
				}
			}

			if (field1403 != 0) {
				long var12 = (field1406 - field233) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field233 = field1406;
				int var14 = field1405;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1404;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1403 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field408.method19(97);
				field408.method63((var17 << 19) + (var18 << 20) + var16);
			}

			if (field131 > 0) {
				field131--;
			}

			if (field1407[1] == 1 || field1407[2] == 1 || field1407[3] == 1 || field1407[4] == 1) {
				field132 = true;
			}

			if (field132 && field131 <= 0) {
				field131 = 20;
				field132 = false;
				field408.method19(13);
				field408.method54(field291);
				field408.method21(field290);
			}

			if (field1394 && !field195) {
				field195 = true;
				field408.method19(96);
				field408.method20(1);
			}

			if (!field1394 && field195) {
				field195 = false;
				field408.method19(96);
				field408.method20(0);
			}

			method108();
			method119();
			method145();
			field188++;
			if (field188 > 750) {
				method88();
			}

			method115();
			method168();
			method143();
			field93++;
			if (field93 > 1741) {
				field93 = 0;
				field408.method19(114);
				field408.method20(0);
				int var19 = field408.field44;

				if ((int) (Math.random() * 2.0D) == 0) {
					field408.method20(35);
				}

				field408.method20((int) (Math.random() * 256.0D));
				field408.method21(35712);

				if ((int) (Math.random() * 2.0D) == 0) {
					field408.method20(61);
				}

				field408.method21(49891);
				field408.method21(38132);
				field408.method20(66);
				field408.method21(64387);
				field408.method20(66);
				field408.method21(1665);
				field408.method29(field408.field44 - var19);
			}

			field320++;

			if (field250 != 0) {
				field249 += 20;
				if (field249 >= 400) {
					field250 = 0;
				}
			}

			if (field435 != 0) {
				field432++;
				if (field432 >= 15) {
					if (field435 == 2) {
						field59 = true;
					}

					if (field435 == 3) {
						field182 = true;
					}

					field435 = 0;
				}
			}

			if (field111 != 0) {
				field94++;

				if (field1397 > field112 + 5 || field1397 < field112 - 5 || field1398 > field113 + 5 || field1398 < field113 - 5) {
					field378 = true;
				}

				if (field1396 == 0) {
					if (field111 == 2) {
						field59 = true;
					}

					if (field111 == 3) {
						field182 = true;
					}

					field111 = 0;

					if (field378 && field94 >= 5) {
						field391 = -1;
						method134();

						if (field391 == field109 && field390 != field110) {
							OPFNUBIN var20 = OPFNUBIN.field1033[field109];
							byte var21 = 0;
							if (field91 == 1 && var20.field1069 == 206) {
								var21 = 1;
							}

							if (var20.field1062[field390] <= 0) {
								var21 = 0;
							}

							if (var20.field1047) {
								int var22 = field110;
								int var23 = field390;
								var20.field1062[var23] = var20.field1062[var22];
								var20.field1086[var23] = var20.field1086[var22];
								var20.field1062[var22] = -1;
								var20.field1086[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field110;
								int var25 = field390;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method456(var24, var24 - 1);
										var24--;
									} else if (var24 < var25) {
										var20.method456(var24, var24 + 1);
										var24++;
									}
								}
							} else {
								var20.method456(field110, field390);
							}

							field408.method19(175);
							field408.method55(field390);
							field408.method54(field109);
							field408.method48(var21);
							field408.method55(field110);
						}
					} else if ((field266 == 1 || method156(field225 - 1)) && field225 > 2) {
						method162();
					} else if (field225 > 0) {
						method80(field225 - 1);
					}

					field432 = 10;
					field1403 = 0;
				}
			}

			if (SIPXLNWG.field1243 != -1) {
				int var26 = SIPXLNWG.field1243;
				int var27 = SIPXLNWG.field1244;
				boolean var28 = method192(var26, 0, field121.field1314[0], 0, 0, var27, 0, 0, true, 0, field121.field1315[0]);
				SIPXLNWG.field1243 = -1;

				if (var28) {
					field247 = field1404;
					field248 = field1405;
					field250 = 1;
					field249 = 0;
				}
			}

			if (field1403 == 1 && field183 != null) {
				field183 = null;
				field182 = true;
				field1403 = 0;
			}

			method196();
			method160();
			method102();
			method111();

			if (field1396 == 1 || field1403 == 1) {
				field466++;
			}

			if (field255 == 2) {
				method98();
			}

			if (field255 == 2 && field234) {
				method121();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field105[var29]++;
			}

			method82();
			field1395++;
			if (field1395 > 4500) {
				field190 = 250;
				field1395 -= 500;
				field408.method19(40);
			}

			field301++;
			if (field301 > 500) {
				field301 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field470 += field471;
				}

				if ((var30 & 0x2) == 2) {
					field475 += field476;
				}

				if ((var30 & 0x4) == 4) {
					field379 += field380;
				}
			}

			if (field470 < -50) {
				field471 = 2;
			}

			if (field470 > 50) {
				field471 = -2;
			}

			if (field475 < -55) {
				field476 = 2;
			}

			if (field475 > 55) {
				field476 = -2;
			}

			if (field379 < -40) {
				field380 = 1;
			}

			if (field379 > 40) {
				field380 = -1;
			}

			field163++;
			if (field163 > 500) {
				field163 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field275 += field276;
				}

				if ((var31 & 0x2) == 2) {
					field231 += field232;
				}
			}

			if (field275 < -60) {
				field276 = 2;
			}

			if (field275 > 60) {
				field276 = -2;
			}

			if (field231 < -20) {
				field232 = 1;
			}

			if (field231 > 10) {
				field232 = -1;
			}

			field189++;
			if (field189 > 50) {
				field408.method19(241);
			}

			try {
				if (field256 != null && field408.field44 > 0) {
					field256.method473(field408.field43, 0, field408.field44);
					field408.field44 = 0;
					field189 = 0;
				}
			} catch (IOException var33) {
				method88();
			} catch (Exception var34) {
				method154();
			}
		}
	}

	@ObfuscatedName("client.a(ILOPFNUBIN;I)I")
	public final int method194(int arg0, OPFNUBIN arg1) {
		if (arg1.field1031 == null || arg0 >= arg1.field1031.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1031[arg0];
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
					var8 = field149[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field196[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field472[var3[var5++]];
				}

				if (var7 == 4) {
					OPFNUBIN var10 = OPFNUBIN.field1033[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < JPUETSNB.field758 && (!JPUETSNB.method329(var11).field766 || field271)) {
						for (int var12 = 0; var12 < var10.field1062.length; var12++) {
							if (var11 + 1 == var10.field1062[var12]) {
								var8 += var10.field1086[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field351[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field96[field196[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field351[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field121.field604;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < LAGRJOEJ.field811; var13++) {
						if (LAGRJOEJ.field813[var13]) {
							var8 += field196[var13];
						}
					}
				}

				if (var7 == 10) {
					OPFNUBIN var14 = OPFNUBIN.field1033[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < JPUETSNB.field758 && (!JPUETSNB.method329(var15).field766 || field271)) {
						for (int var16 = 0; var16 < var14.field1062.length; var16++) {
							if (var14.field1062[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field459;
				}

				if (var7 == 12) {
					var8 = field257;
				}

				if (var7 == 13) {
					int var17 = field351[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					DDXRHBHP var20 = DDXRHBHP.field496[var19];
					int var21 = var20.field498;
					int var22 = var20.field499;
					int var23 = var20.field500;
					int var24 = field461[var23 - var22];
					var8 = field351[var21] >> var22 & var24;
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
					var8 = (field121.field1333 >> 7) + field385;
				}

				if (var7 == 19) {
					var8 = (field121.field1334 >> 7) + field386;
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
			if (field1392 != null) {
				return new URL("http://127.0.0.1:" + (field270 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method195(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field123.method526(field246, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			QMZPELNG var8 = QMZPELNG.method486(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1178;
				var10 = var8.field1142;
			} else {
				var9 = var8.field1142;
				var10 = var8.field1178;
			}

			int var11 = var8.field1172;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method192(arg1, var10, field121.field1314[0], 0, 0, arg0, 2, var9, false, var11, field121.field1315[0]);
		} else {
			method192(arg1, 0, field121.field1314[0], var7, var6 + 1, arg0, 2, 0, false, 0, field121.field1315[0]);
		}

		field247 = field1404;
		field248 = field1405;
		field250 = 2;
		field249 = 0;
		return true;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method196() {
		if (field111 == 0) {
			int var1 = field1403;
			if (field215 == 1 && field1404 >= 516 && field1405 >= 160 && field1404 <= 765 && field1405 <= 205) {
				var1 = 0;
			}

			if (field381) {
				if (var1 != 1) {
					int var2 = field1397;
					int var3 = field1398;
					if (field177 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field177 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field177 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field178 - 10 || var2 > field180 + field178 + 10 || var3 < field179 - 10 || var3 > field181 + field179 + 10) {
						field381 = false;

						if (field177 == 1) {
							field59 = true;
						}

						if (field177 == 2) {
							field182 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field178;
					int var5 = field179;
					int var6 = field180;
					int var7 = field1404;
					int var8 = field1405;
					if (field177 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field177 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field177 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field225; var10++) {
						int var11 = (field225 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method80(var9);
					}

					field381 = false;

					if (field177 == 1) {
						field59 = true;
					}

					if (field177 == 2) {
						field182 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field225 > 0) {
					int var12 = field405[field225 - 1];
					if (var12 == 607 || var12 == 48 || var12 == 615 || var12 == 500 || var12 == 534 || var12 == 766 || var12 == 406 || var12 == 263 || var12 == 471 || var12 == 694 || var12 == 34 || var12 == 1881) {
						int var13 = field403[field225 - 1];
						int var14 = field404[field225 - 1];
						OPFNUBIN var15 = OPFNUBIN.field1033[var14];
						if (var15.field1061 || var15.field1047) {
							field378 = false;
							field94 = 0;
							field109 = var14;
							field110 = var13;
							field111 = 2;
							field112 = field1404;
							field113 = field1405;

							if (OPFNUBIN.field1033[var14].field1041 == field412) {
								field111 = 1;
							}

							if (OPFNUBIN.field1033[var14].field1041 == field450) {
								field111 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field266 == 1 || method156(field225 - 1)) && field225 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field225 > 0) {
					method80(field225 - 1);
				}

				if (var1 != 2 || field225 <= 0) {
					return;
				}

				method162();
			}
		}
	}

	@ObfuscatedName("client.d(IIII)I")
	public final int method197(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field308[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field360[var6][var4][var5] + field360[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field360[var6][var4][var5 + 1] + field360[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method198(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.H(I)V")
	public final void method199() {
		for (CANOTCRF var1 = (CANOTCRF) field100.method71(); var1 != null; var1 = (CANOTCRF) field100.method73()) {
			if (field246 != var1.field25 || var1.field31) {
				var1.method582();
			} else if (field145 >= var1.field33) {
				var1.method12(field320);

				if (var1.field31) {
					var1.method582();
				} else {
					field123.method507(var1, 0, false, var1.field26, var1.field25, 60, var1.field27, -1, var1.field28);
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method200(long arg0) {
		if (arg0 != 0L) {
			if (field316 >= 100 && field205 != 1) {
				method120("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field316 >= 200) {
				method120("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = ZDHYRWCV.method591(ZDHYRWCV.method588(arg0));
				for (int var4 = 0; var4 < field316; var4++) {
					if (field274[var4] == arg0) {
						method120(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field321; var5++) {
					if (field262[var5] == arg0) {
						method120("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field121.field611)) {
					field98[field316] = var3;
					field274[field316] = arg0;
					field160[field316] = 0;
					field316++;
					field59 = true;
					field408.method19(118);
					field408.method26(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method201(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.f(II)V")
	public final void method202(int arg0) {
		int var2 = OZAHPBMK.field1094[arg0].field1102;
		if (var2 != 0) {
			int var3 = field351[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					UJNRJRYE.method556(0.9D);
				}

				if (var3 == 2) {
					UJNRJRYE.method556(0.8D);
				}

				if (var3 == 3) {
					UJNRJRYE.method556(0.7D);
				}

				if (var3 == 4) {
					UJNRJRYE.method556(0.6D);
				}

				JPUETSNB.field779.method371();
				field164 = true;
			}

			if (var2 == 3) {
				boolean var4 = field289;

				if (var3 == 0) {
					method84(field289, 0);
					field289 = true;
				}

				if (var3 == 1) {
					method84(field289, -400);
					field289 = true;
				}

				if (var3 == 2) {
					method84(field289, -800);
					field289 = true;
				}

				if (var3 == 3) {
					method84(field289, -1200);
					field289 = true;
				}

				if (var3 == 4) {
					field289 = false;
				}

				if (field289 != var4 && !field272) {
					if (field289) {
						field240 = field101;
						field241 = true;
						field288.method426(2, field240);
					} else {
						method78();
					}

					field337 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field263 = true;
					method208(0);
				}

				if (var3 == 1) {
					field263 = true;
					method208(-400);
				}

				if (var3 == 2) {
					field263 = true;
					method208(-800);
				}

				if (var3 == 3) {
					field263 = true;
					method208(-1200);
				}

				if (var3 == 4) {
					field263 = false;
				}
			}

			if (var2 == 5) {
				field266 = var3;
			}

			if (var2 == 6) {
				field242 = var3;
			}

			if (var2 == 8) {
				field284 = var3;
				field182 = true;
			}

			if (var2 == 9) {
				field91 = var3;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method203() {
		QMZPELNG.field1162.method371();
		QMZPELNG.field1154.method371();
		OMIIKHIV.field1022.method371();
		JPUETSNB.field777.method371();
		JPUETSNB.field779.method371();
		FHQGDDHF.field627.method371();
		BRGDZOWQ.field20.method371();
	}

	@ObfuscatedName("client.a(LOPFNUBIN;I)Z")
	public final boolean method204(OPFNUBIN arg0) {
		if (arg0.field1032 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1032.length; var2++) {
			int var3 = method194(var2, arg0);
			int var4 = arg0.field1087[var2];
			if (arg0.field1032[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1032[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1032[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method205() {
		short var1 = 256;

		if (field200 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field200 > 768) {
					field445[var2] = method187(field447[var2], 1024 - field200, field446[var2]);
				} else if (field200 > 256) {
					field445[var2] = field447[var2];
				} else {
					field445[var2] = method187(field446[var2], 256 - field200, field447[var2]);
				}
			}
		} else if (field201 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field201 > 768) {
					field445[var3] = method187(field448[var3], 1024 - field201, field446[var3]);
				} else if (field201 > 256) {
					field445[var3] = field448[var3];
				} else {
					field445[var3] = method187(field446[var3], 256 - field201, field448[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field445[var4] = field446[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field82.field549[var5] = field212.field484[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field370[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field428[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field445[var12];
					int var15 = field82.field549[var7];
					field82.field549[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field82.method265(0, 0, field1389);

		for (int var16 = 0; var16 < 33920; var16++) {
			field83.field549[var16] = field213.field484[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field370[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field428[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field445[var23];
					int var26 = field83.field549[var18];
					field83.field549[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field83.method265(0, 637, field1389);
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method206(int arg0, String arg1) {
		field152 = arg0;
		field219 = arg1;
		method112();

		if (field482 == null) {
			super.method206(arg0, arg1);
		} else {
			field81.method264();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field222.method278(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			OKWPDMPE.method437(34, var6, var3 / 2 - 152, 0x8C1111, 304);
			OKWPDMPE.method437(32, var6 + 1, var3 / 2 - 151, 0, 302);
			OKWPDMPE.method436(var3 / 2 - 150, var6 + 2, 0x8C1111, arg0 * 3, 30);
			OKWPDMPE.method436(arg0 * 3 + var3 / 2 - 150, var6 + 2, 0, 300 - arg0 * 3, 30);
			field222.method278(var4 / 2 + 5 - var5, arg1, 0xFFFFFF, var3 / 2);
			field81.method265(171, 202, field1389);

			if (field164) {
				field164 = false;

				if (!field237) {
					field82.method265(0, 0, field1389);
					field83.method265(0, 637, field1389);
				}

				field79.method265(0, 128, field1389);
				field80.method265(371, 202, field1389);
				field84.method265(265, 0, field1389);
				field85.method265(265, 562, field1389);
				field86.method265(171, 128, field1389);
				field87.method265(171, 562, field1389);
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method207() {
		field384++;
		method157(true);
		method107(true);
		method157(false);
		method107(false);
		method141();
		method199();

		if (!field234) {
			int var1 = field290;
			if (field264 / 256 > var1) {
				var1 = field264 / 256;
			}

			if (field307[4] && field214[4] + 128 > var1) {
				var1 = field214[4] + 128;
			}

			int var2 = field379 + field291 & 0x7FF;
			method139(field130, method197(field121.field1333, field246, field121.field1334) - 50, var1, var1 * 3 + 600, var2, field129);
			field106++;
			if (field106 > 158) {
				field106 = 0;
				field408.method19(23);
				field408.method23(0x289E24);
			}
		}

		int var3;
		if (field234) {
			var3 = method95();
		} else {
			var3 = method94();
		}

		int var4 = field373;
		int var5 = field374;
		int var6 = field375;
		int var7 = field376;
		int var8 = field377;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field307[var9]) {
				int var10 = (int) (Math.random() * (field135[var9] * 2 + 1) + Math.sin(field282[var9] / 100.0D * field105[var9]) * field214[var9] - field135[var9]);
				if (var9 == 0) {
					field373 += var10;
				}

				if (var9 == 1) {
					field374 += var10;
				}

				if (var9 == 2) {
					field375 += var10;
				}

				if (var9 == 3) {
					field377 = field377 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field376 += var10;
					if (field376 < 128) {
						field376 = 128;
					}

					if (field376 > 383) {
						field376 = 383;
					}
				}
			}
		}

		int var11 = UJNRJRYE.field1299;
		LFTMDGKK.field878 = true;
		LFTMDGKK.field881 = 0;
		LFTMDGKK.field879 = field1397 - 4;
		LFTMDGKK.field880 = field1398 - 4;
		OKWPDMPE.method434();
		field123.method535(field376, var3, field374, field375, field377, field373);
		field123.method510();
		method209();
		method185();
		method130(var11);
		method132();
		field253.method265(4, 4, field1389);
		field373 = var4;
		field374 = var5;
		field375 = var6;
		field376 = var7;
		field377 = var8;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method208(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method209() {
		field414 = 0;
		for (int var1 = -1; var1 < field73 + field297; var1++) {
			VNAWUDPP var2;
			if (var1 == -1) {
				var2 = field121;
			} else if (var1 < field73) {
				var2 = field72[field74[var1]];
			} else {
				var2 = field296[field298[var1 - field73]];
			}

			if (var2 != null && var2.method2()) {
				if (var2 instanceof ADGLALPC) {
					OMIIKHIV var3 = ((ADGLALPC) var2).field1;
					if (var3.field992 != null) {
						var3 = var3.method446();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field73) {
					OMIIKHIV var7 = ((ADGLALPC) var2).field1;
					if (var7.field1007 >= 0 && var7.field1007 < field312.length) {
						method105(var2.field1341 + 15, var2);

						if (field353 > -1) {
							field312[var7.field1007].method223(field353 - 12, field354 - 30);
						}
					}

					if (field362 == 1 && field298[var1 - field73] == field334 && field145 % 20 < 10) {
						method105(var2.field1341 + 15, var2);

						if (field353 > -1) {
							field312[2].method223(field353 - 12, field354 - 28);
						}
					}
				} else {
					int var4 = 30;
					FHQGDDHF var5 = (FHQGDDHF) var2;
					if (var5.field620 != 0) {
						method105(var2.field1341 + 15, var2);

						if (field353 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field620 & 1 << var6) != 0) {
									field312[var6].method223(field353 - 12, field354 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field362 == 10 && field74[var1] == field92) {
						method105(var2.field1341 + 15, var2);

						if (field353 > -1) {
							field312[7].method223(field353 - 12, field354 - var4);
						}
					}
				}

				if (var2.field1342 != null && (var1 >= field73 || field371 == 0 || field371 == 3 || field371 == 1 && method158(((FHQGDDHF) var2).field611))) {
					method105(var2.field1341, var2);

					if (field353 > -1 && field414 < field415) {
						field419[field414] = field222.method281(var2.field1342) / 2;
						field418[field414] = field222.field601;
						field416[field414] = field353;
						field417[field414] = field354;
						field420[field414] = var2.field1311;
						field421[field414] = var2.field1304;
						field422[field414] = var2.field1336;
						field423[field414++] = var2.field1342;

						if (field242 == 0 && var2.field1304 >= 1 && var2.field1304 <= 3) {
							field418[field414] += 10;
							field417[field414] += 5;
						}

						if (field242 == 0 && var2.field1304 == 4) {
							field419[field414] = 60;
						}

						if (field242 == 0 && var2.field1304 == 5) {
							field418[field414] += 5;
						}
					}
				}

				if (var2.field1346 > field145) {
					method105(var2.field1341 + 15, var2);

					if (field353 > -1) {
						int var8 = var2.field1347 * 30 / var2.field1348;
						if (var8 > 30) {
							var8 = 30;
						}

						OKWPDMPE.method436(field353 - 15, field354 - 3, 0xFF00, var8, 5);
						OKWPDMPE.method436(field353 + var8 - 15, field354 - 3, 0xFF0000, 30 - var8, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1332[var9] > field145) {
						method105(var2.field1341 / 2, var2);

						if (field353 > -1) {
							if (var9 == 1) {
								field354 -= 20;
							}

							if (var9 == 2) {
								field353 -= 15;
								field354 -= 10;
							}

							if (var9 == 3) {
								field353 += 15;
								field354 -= 10;
							}

							field63[var2.field1331[var9]].method223(field353 - 12, field354 - 12);
							field220.method278(field354 + 4, String.valueOf(var2.field1330[var9]), 0, field353);
							field220.method278(field354 + 3, String.valueOf(var2.field1330[var9]), 0xFFFFFF, field353 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field414; var10++) {
			int var11 = field416[var10];
			int var12 = field417[var10];
			int var13 = field419[var10];
			int var14 = field418[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field417[var16] - field418[var16] && var12 - var14 < field417[var16] + 2 && var11 - var13 < field419[var16] + field416[var16] && var11 + var13 > field416[var16] - field419[var16] && field417[var16] - field418[var16] < var12) {
						var12 = field417[var16] - field418[var16];
						var15 = true;
					}
				}
			}

			field353 = field416[var10];
			field354 = field417[var10] = var12;
			String var17 = field423[var10];
			if (field242 == 0) {
				int var18 = 0xFFFF00;
				if (field420[var10] < 6) {
					var18 = field324[field420[var10]];
				}

				if (field420[var10] == 6) {
					var18 = field384 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field420[var10] == 7) {
					var18 = field384 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field420[var10] == 8) {
					var18 = field384 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field420[var10] == 9) {
					int var19 = 150 - field422[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field420[var10] == 10) {
					int var20 = 150 - field422[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field420[var10] == 11) {
					int var21 = 150 - field422[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field421[var10] == 0) {
					field222.method278(field354 + 1, var17, 0, field353);
					field222.method278(field354, var17, var18, field353);
				}

				if (field421[var10] == 1) {
					field222.method283(var17, 0, field353, field384, field354 + 1);
					field222.method283(var17, var18, field353, field384, field354);
				}

				if (field421[var10] == 2) {
					field222.method284(var17, field353, 0, field354 + 1, field384);
					field222.method284(var17, field353, var18, field354, field384);
				}

				if (field421[var10] == 3) {
					field222.method285(field353, 0, 150 - field422[var10], field384, field354 + 1, var17);
					field222.method285(field353, var18, 150 - field422[var10], field384, field354, var17);
				}

				if (field421[var10] == 4) {
					int var22 = field222.method281(var17);
					int var23 = (150 - field422[var10]) * (var22 + 100) / 150;
					OKWPDMPE.method433(field353 + 50, 334, field353 - 50, 0);
					field222.method282(var17, field353 + 50 - var23, 0, field354 + 1);
					field222.method282(var17, field353 + 50 - var23, var18, field354);
					OKWPDMPE.method432();
				}

				if (field421[var10] == 5) {
					int var24 = 150 - field422[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					OKWPDMPE.method433(512, field354 + 5, 0, field354 - field222.field601 - 1);
					field222.method278(field354 + var25 + 1, var17, 0, field353);
					field222.method278(field354 + var25, var17, var18, field353);
					OKWPDMPE.method432();
				}
			} else {
				field222.method278(field354 + 1, var17, 0, field353);
				field222.method278(field354, var17, 0xFFFF00, field353);
			}
		}
	}

	@ObfuscatedName("client.K(I)Z")
	public final boolean method210() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method211(boolean arg0) {
		method112();
		field81.method264();
		field322.method275(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field108 == 0) {
			int var4 = var3 / 2 + 80;
			field220.method279(0x75A9A9, field288.field947, var4, true, var2 / 2);
			int var5 = var3 / 2 - 20;
			field222.method279(0xFFFF00, "Welcome to RuneScape", var5, true, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field323.method275(var6 - 73, var7 - 20);
			field222.method279(0xFFFFFF, "New User", var7 + 5, true, var6);
			int var8 = var2 / 2 + 80;
			field323.method275(var8 - 73, var7 - 20);
			field222.method279(0xFFFFFF, "Existing User", var7 + 5, true, var8);
		}

		if (field108 == 2) {
			int var9 = var3 / 2 - 40;
			if (field184.length() > 0) {
				field222.method279(0xFFFF00, field184, var9 - 15, true, var2 / 2);
				field222.method279(0xFFFF00, field185, var9, true, var2 / 2);
				var9 += 30;
			} else {
				field222.method279(0xFFFF00, field185, var9 - 7, true, var2 / 2);
				var9 += 30;
			}

			field222.method286(0xFFFFFF, "Username: " + field392 + (field303 == 0 & field145 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, true, var9);
			var9 += 15;
			field222.method286(0xFFFFFF, "Password: " + ZDHYRWCV.method592(field393) + (field303 == 1 & field145 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, true, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field323.method275(var10 - 73, var11 - 20);
				field222.method279(0xFFFFFF, "Login", var11 + 5, true, var10);
				int var12 = var2 / 2 + 80;
				field323.method275(var12 - 73, var11 - 20);
				field222.method279(0xFFFFFF, "Cancel", var11 + 5, true, var12);
			}
		}

		if (field108 == 3) {
			field222.method279(0xFFFF00, "Create a free account", var3 / 2 - 60, true, var2 / 2);
			int var13 = var3 / 2 - 35;
			field222.method279(0xFFFFFF, "To create a new account you need to", var13, true, var2 / 2);
			var13 += 15;
			field222.method279(0xFFFFFF, "go back to the main RuneScape webpage", var13, true, var2 / 2);
			var13 += 15;
			field222.method279(0xFFFFFF, "and choose the red 'create account'", var13, true, var2 / 2);
			var13 += 15;
			field222.method279(0xFFFFFF, "button at the top right of that page.", var13, true, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field323.method275(var14 - 73, var15 - 20);
			field222.method279(0xFFFFFF, "Cancel", var15 + 5, true, var14);
		}

		field81.method265(171, 202, field1389);

		if (field164) {
			field164 = false;
			field79.method265(0, 128, field1389);
			field80.method265(371, 202, field1389);
			field84.method265(265, 0, field1389);
			field85.method265(265, 562, field1389);
			field86.method265(171, 128, field1389);
			field87.method265(171, 562, field1389);
		}
	}

	@ObfuscatedName("client.a(LCFARFRSG;II)V")
	public final void method212(CFARFRSG arg0, int arg1) {
		while (arg0.field45 + 21 < arg1 * 8) {
			int var3 = arg0.method41(14);
			if (var3 == 16383) {
				break;
			}

			if (field296[var3] == null) {
				field296[var3] = new ADGLALPC();
			}

			ADGLALPC var4 = field296[var3];
			field298[field297++] = var3;
			var4.field1316 = field145;
			var4.field1 = OMIIKHIV.method444(arg0.method41(12));
			int var5 = arg0.method41(1);
			if (var5 == 1) {
				field76[field75++] = var3;
			}

			int var6 = arg0.method41(1);
			int var7 = arg0.method41(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method41(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1343 = var4.field1.field1004;
			var4.field1305 = var4.field1.field1019;
			var4.field1317 = var4.field1.field1001;
			var4.field1318 = var4.field1.field1025;
			var4.field1319 = var4.field1.field997;
			var4.field1320 = var4.field1.field1008;
			var4.field1344 = var4.field1.field1011;
			var4.method565(var6 == 1, field121.field1315[0] + var7, field121.field1314[0] + var8);
		}

		arg0.method42();
	}

	@ObfuscatedName("client.L(I)V")
	public final void method213() {
		field252.method264();

		if (field442 == 2) {
			byte[] var1 = field137.field587;
			int[] var2 = OKWPDMPE.field979;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field156.method227(field328, 25, field258, 0, 256, field291, 25, 33, 33, 0);
			field253.method264();
		} else {
			int var5 = field291 + field275 & 0x7FF;
			int var6 = field121.field1333 / 32 + 48;
			int var7 = 464 - field121.field1334 / 32;
			field116.method227(field104, var6, field165, 25, field231 + 256, var5, var7, 151, 146, 5);
			field156.method227(field328, 25, field258, 0, 256, field291, 25, 33, 33, 0);

			for (int var8 = 0; var8 < field124; var8++) {
				int var9 = field125[var8] * 4 + 2 - field121.field1333 / 32;
				int var10 = field126[var8] * 4 + 2 - field121.field1334 / 32;
				method159(var9, field134[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					CLCMCMIN var13 = field78[field246][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field121.field1333 / 32;
						int var15 = var12 * 4 + 2 - field121.field1334 / 32;
						method159(var14, field436, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field297; var16++) {
				ADGLALPC var17 = field296[field298[var16]];
				if (var17 != null && var17.method2()) {
					OMIIKHIV var18 = var17.field1;
					if (var18.field992 != null) {
						var18 = var18.method446();
					}

					if (var18 != null && var18.field1005 && var18.field1023) {
						int var19 = var17.field1333 / 32 - field121.field1333 / 32;
						int var20 = var17.field1334 / 32 - field121.field1334 / 32;
						method159(var19, field437, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field73; var21++) {
				FHQGDDHF var22 = field72[field74[var21]];
				if (var22 != null && var22.method2()) {
					int var23 = var22.field1333 / 32 - field121.field1333 / 32;
					int var24 = var22.field1334 / 32 - field121.field1334 / 32;
					boolean var25 = false;
					long var26 = ZDHYRWCV.method587(var22.field611);
					for (int var28 = 0; var28 < field316; var28++) {
						if (field274[var28] == var26 && field160[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field121.field626 != 0 && var22.field626 != 0 && field121.field626 == var22.field626) {
						var29 = true;
					}

					if (var25) {
						method159(var23, field439, var24);
					} else if (var29) {
						method159(var23, field440, var24);
					} else {
						method159(var23, field438, var24);
					}
				}
			}

			if (field362 != 0 && field145 % 20 < 10) {
				if (field362 == 1 && field334 >= 0 && field334 < field296.length) {
					ADGLALPC var30 = field296[field334];
					if (var30 != null) {
						int var31 = var30.field1333 / 32 - field121.field1333 / 32;
						int var32 = var30.field1334 / 32 - field121.field1334 / 32;
						method92(var31, var32, field103);
					}
				}

				if (field362 == 2) {
					int var33 = (field277 - field385) * 4 + 2 - field121.field1333 / 32;
					int var34 = (field278 - field386) * 4 + 2 - field121.field1334 / 32;
					method92(var33, var34, field103);
				}

				if (field362 == 10 && field92 >= 0 && field92 < field72.length) {
					FHQGDDHF var35 = field72[field92];
					if (var35 != null) {
						int var36 = var35.field1333 / 32 - field121.field1333 / 32;
						int var37 = var35.field1334 / 32 - field121.field1334 / 32;
						method92(var36, var37, field103);
					}
				}
			}

			if (field114 != 0) {
				int var38 = field114 * 4 + 2 - field121.field1333 / 32;
				int var39 = field115 * 4 + 2 - field121.field1334 / 32;
				method159(var38, field102, var39);
			}

			OKWPDMPE.method436(97, 78, 0xFFFFFF, 3, 3);
			field253.method264();
		}
	}

	@ObfuscatedName("client.M(I)V")
	public static final void method214() {
		SIPXLNWG.field1209 = true;
		UJNRJRYE.field1279 = true;
		field272 = true;
		DIFHBVBT.field521 = true;
		QMZPELNG.field1148 = true;
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method215(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field321; var3++) {
				if (field262[var3] == arg0) {
					field321--;
					field59 = true;

					for (int var4 = var3; var4 < field321; var4++) {
						field262[var4] = field262[var4 + 1];
					}

					field408.method19(5);
					field408.method26(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method216() {
		int var1 = 5;
		field327[8] = 0;
		int var2 = 0;
		while (field327[8] == 0) {
			String var3 = "Unknown problem";
			method206(20, "Connecting to web server");

			try {
				DataInputStream var4 = method140("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 332);
				CFARFRSG var5 = new CFARFRSG(new byte[40]);
				var4.readFully(var5.field43, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field327[var6] = var5.method35();
				}

				int var7 = var5.method35();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field327[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field327[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field327[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field327[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field327[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field327[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method206(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method206(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field239 = !field239;
			}
		}
	}

	public final void run() {
		if (field285) {
			method123();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIILCFARFRSG;LFHQGDDHF;)V")
	public final void method217(int arg0, int arg1, CFARFRSG arg2, FHQGDDHF arg3) {
		if ((arg1 & 0x80) != 0) {
			int var5 = arg2.method51();
			int var6 = arg2.method49();
			arg3.method568(var5, var6, field145);
			arg3.field1346 = field145 + 300;
			arg3.field1347 = arg2.method30();
			arg3.field1348 = arg2.method51();
		}

		if ((arg1 & 0x10) != 0) {
			arg3.field1342 = arg2.method37();
			if (arg3.field1342.charAt(0) == '~') {
				arg3.field1342 = arg3.field1342.substring(1);
				method120(arg3.field1342, arg3.field611, 2);
			} else if (field121 == arg3) {
				method120(arg3.field1342, arg3.field611, 2);
			}

			arg3.field1311 = 0;
			arg3.field1304 = 0;
			arg3.field1336 = 150;
		}

		if ((arg1 & 0x40) != 0) {
			int var7 = arg2.method57();
			if (var7 == 0xFFFF) {
				var7 = -1;
			}

			int var8 = arg2.method30();
			if (arg3.field1349 == var7 && var7 != -1) {
				int var9 = IUTBNGPH.field682[var7].field696;
				if (var9 == 1) {
					arg3.field1350 = 0;
					arg3.field1351 = 0;
					arg3.field1352 = var8;
					arg3.field1353 = 0;
				}

				if (var9 == 2) {
					arg3.field1353 = 0;
				}
			} else if (var7 == -1 || arg3.field1349 == -1 || IUTBNGPH.field682[var7].field690 >= IUTBNGPH.field682[arg3.field1349].field690) {
				arg3.field1349 = var7;
				arg3.field1350 = 0;
				arg3.field1351 = 0;
				arg3.field1352 = var8;
				arg3.field1353 = 0;
				arg3.field1338 = arg3.field1329;
			}
		}

		if ((arg1 & 0x100) != 0) {
			arg3.field1306 = arg2.method32();
			int var10 = arg2.method35();
			arg3.field1310 = var10 >> 16;
			arg3.field1309 = (var10 & 0xFFFF) + field145;
			arg3.field1307 = 0;
			arg3.field1308 = 0;

			if (arg3.field1309 > field145) {
				arg3.field1307 = -1;
			}

			if (arg3.field1306 == 0xFFFF) {
				arg3.field1306 = -1;
			}
		}

		if ((arg1 & 0x20) != 0) {
			arg3.field1354 = arg2.method57();
			if (arg3.field1354 == 0xFFFF) {
				arg3.field1354 = -1;
			}
		}

		if ((arg1 & 0x200) != 0) {
			int var11 = arg2.method30();
			int var12 = arg2.method49();
			arg3.method568(var11, var12, field145);
			arg3.field1346 = field145 + 300;
			arg3.field1347 = arg2.method51();
			arg3.field1348 = arg2.method50();
		}

		if ((arg1 & 0x8) != 0) {
			arg3.field1312 = arg2.method57();
			arg3.field1313 = arg2.method32();
		}

		if ((arg1 & 0x1) != 0) {
			int var13 = arg2.method30();
			byte[] var14 = new byte[var13];
			CFARFRSG var15 = new CFARFRSG(var14);
			arg2.method67(var14, 0, var13);
			field77[arg0] = var15;
			arg3.method295(var15);
		}

		if ((arg1 & 0x2) != 0) {
			int var16 = arg2.method32();
			int var17 = arg2.method50();
			int var18 = arg2.method51();
			int var19 = arg2.field44;

			if (arg3.field611 != null && arg3.field628) {
				long var20 = ZDHYRWCV.method587(arg3.field611);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field321; var23++) {
						if (field262[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field335 == 0) {
					try {
						field295.field44 = 0;
						arg2.method39(var18, 0, field295.field43);
						field295.field44 = 0;
						String var24 = EDPSKMQR.method267(var18, field295);
						var24 = MUWLFOWQ.method382(var24);
						arg3.field1342 = var24;
						arg3.field1311 = var16 >> 8;
						arg3.field1304 = var16 & 0xFF;
						arg3.field1336 = 150;

						if (var17 == 2 || var17 == 3) {
							method120(var24, "@cr2@" + arg3.field611, 1);
						} else if (var17 == 1) {
							method120(var24, "@cr1@" + arg3.field611, 1);
						} else {
							method120(var24, arg3.field611, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field44 = var18 + var19;
		}

		if ((arg1 & 0x400) != 0) {
			arg3.field1322 = arg2.method51();
			arg3.field1324 = arg2.method51();
			arg3.field1323 = arg2.method51();
			arg3.field1325 = arg2.method30();
			arg3.field1326 = arg2.method57() + field145;
			arg3.field1327 = arg2.method59() + field145;
			arg3.field1328 = arg2.method49();
			arg3.method567();
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field96[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field461[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
