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
public final class client extends TFSZPSRF {

	@ObfuscatedName("client.K")
	public boolean field28 = false;

	@ObfuscatedName("client.M")
	public HUQCCBIO[] field29 = new HUQCCBIO[4];

	@ObfuscatedName("client.P")
	public int field31 = -1;

	@ObfuscatedName("client.R")
	public MMZHRHUG[] field33 = new MMZHRHUG[5];

	@ObfuscatedName("client.S")
	public boolean field34 = false;

	@ObfuscatedName("client.T")
	public boolean field35 = true;

	@ObfuscatedName("client.U")
	public int field36 = -1;

	@ObfuscatedName("client.Z")
	public int[] field41 = new int[2000];

	@ObfuscatedName("client.bb")
	public BJPWOXRJ field42 = BJPWOXRJ.method3(1);

	@ObfuscatedName("client.fb")
	public int[] field44 = new int[151];

	@ObfuscatedName("client.gb")
	public TKCVVLIT[] field45 = new TKCVVLIT[100];

	@ObfuscatedName("client.ib")
	public int field46 = -1;

	@ObfuscatedName("client.kb")
	public int[] field48 = new int[50];

	@ObfuscatedName("client.lb")
	public boolean field49 = true;

	@ObfuscatedName("client.ob")
	public int[] field52 = new int[33];

	@ObfuscatedName("client.qb")
	public boolean field53 = false;

	@ObfuscatedName("client.ub")
	public final int[] field57 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.wb")
	public int field59 = 2;

	@ObfuscatedName("client.xb")
	public YZDAHXEQ[] field60 = new YZDAHXEQ[1000];

	@ObfuscatedName("client.yb")
	public int[] field61 = new int[PXPQSCQI.field1223];

	@ObfuscatedName("client.Ab")
	public int field63 = 2;

	@ObfuscatedName("client.Mb")
	public String field72 = "";

	@ObfuscatedName("client.Ob")
	public int field73 = 128;

	@ObfuscatedName("client.Ub")
	public BJPWOXRJ field79 = BJPWOXRJ.method3(1);

	@ObfuscatedName("client.fc")
	public boolean field89 = false;

	@ObfuscatedName("client.hc")
	public RGZIHLRP field91 = new RGZIHLRP();

	@ObfuscatedName("client.ic")
	public boolean field92 = false;

	@ObfuscatedName("client.jc")
	public YZDAHXEQ[] field93 = new YZDAHXEQ[8];

	@ObfuscatedName("client.oc")
	public boolean field96 = false;

	@ObfuscatedName("client.Kc")
	public BJPWOXRJ field115 = new BJPWOXRJ(new byte[5000]);

	@ObfuscatedName("client.Lc")
	public HGVATLQF[] field116 = new HGVATLQF[16384];

	@ObfuscatedName("client.Nc")
	public int[] field118 = new int[16384];

	@ObfuscatedName("client.Oc")
	public int[] field119 = new int[5];

	@ObfuscatedName("client.Qc")
	public String[] field121 = new String[200];

	@ObfuscatedName("client.Vc")
	public boolean field125 = false;

	@ObfuscatedName("client.Yc")
	public int[] field127 = new int[2000];

	@ObfuscatedName("client.Zc")
	public boolean field128 = false;

	@ObfuscatedName("client.bd")
	public int[] field130 = new int[33];

	@ObfuscatedName("client.hd")
	public RGZIHLRP[][][] field135 = new RGZIHLRP[4][104][104];

	@ObfuscatedName("client.id")
	public String field136 = "";

	@ObfuscatedName("client.pd")
	public boolean field142 = false;

	@ObfuscatedName("client.qd")
	public int[] field143 = new int[256];

	@ObfuscatedName("client.ud")
	public int field147 = 1;

	@ObfuscatedName("client.vd")
	public final int field148 = 100;

	@ObfuscatedName("client.wd")
	public int[] field149 = new int[100];

	@ObfuscatedName("client.zd")
	public boolean field150 = false;

	@ObfuscatedName("client.Pd")
	public String field164 = "";

	@ObfuscatedName("client.Qd")
	public String field165 = "";

	@ObfuscatedName("client.Rd")
	public long[] field166 = new long[100];

	@ObfuscatedName("client.Sd")
	public int[] field167 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Vd")
	public int field169 = 50;

	@ObfuscatedName("client.Wd")
	public int[] field170 = new int[field169];

	@ObfuscatedName("client.Xd")
	public int[] field171 = new int[field169];

	@ObfuscatedName("client.Yd")
	public int[] field172 = new int[field169];

	@ObfuscatedName("client.Zd")
	public int[] field173 = new int[field169];

	@ObfuscatedName("client.ae")
	public int[] field174 = new int[field169];

	@ObfuscatedName("client.be")
	public int[] field175 = new int[field169];

	@ObfuscatedName("client.ce")
	public int[] field176 = new int[field169];

	@ObfuscatedName("client.de")
	public String[] field177 = new String[field169];

	@ObfuscatedName("client.ee")
	public int field178 = -1;

	@ObfuscatedName("client.fe")
	public int[] field179 = new int[9];

	@ObfuscatedName("client.me")
	public int[][] field185 = new int[104][104];

	@ObfuscatedName("client.se")
	public int[][] field191 = new int[104][104];

	@ObfuscatedName("client.we")
	public boolean field195 = false;

	@ObfuscatedName("client.xe")
	public int[] field196 = new int[5];

	@ObfuscatedName("client.De")
	public boolean field202 = false;

	@ObfuscatedName("client.Ne")
	public boolean[] field209 = new boolean[5];

	@ObfuscatedName("client.Oe")
	public boolean field210 = false;

	@ObfuscatedName("client.Ue")
	public String[] field216 = new String[500];

	@ObfuscatedName("client.af")
	public int field221 = 0x332D25;

	@ObfuscatedName("client.bf")
	public YZDAHXEQ[] field222 = new YZDAHXEQ[20];

	@ObfuscatedName("client.gf")
	public long[] field226 = new long[200];

	@ObfuscatedName("client.jf")
	public int field228 = 0x23201B;

	@ObfuscatedName("client.kf")
	public boolean field229 = false;

	@ObfuscatedName("client.lf")
	public boolean field230 = false;

	@ObfuscatedName("client.mf")
	public boolean field231 = true;

	@ObfuscatedName("client.nf")
	public boolean field232 = false;

	@ObfuscatedName("client.pf")
	public BJPWOXRJ field233 = BJPWOXRJ.method3(1);

	@ObfuscatedName("client.rf")
	public int[] field235 = new int[1000];

	@ObfuscatedName("client.zf")
	public int field240 = -1;

	@ObfuscatedName("client.Gf")
	public int field247 = -1;

	@ObfuscatedName("client.Hf")
	public int[] field248 = new int[5];

	@ObfuscatedName("client.If")
	public boolean field249 = false;

	@ObfuscatedName("client.Jf")
	public int[] field250 = new int[5];

	@ObfuscatedName("client.Qf")
	public int[] field257 = new int[200];

	@ObfuscatedName("client.Vf")
	public int field262 = -1;

	@ObfuscatedName("client.Wf")
	public int[] field263 = new int[151];

	@ObfuscatedName("client.dg")
	public RGZIHLRP field269 = new RGZIHLRP();

	@ObfuscatedName("client.pg")
	public int field280 = 0x4D4233;

	@ObfuscatedName("client.qg")
	public ETSIPTYG field281 = new ETSIPTYG();

	@ObfuscatedName("client.Jg")
	public TKCVVLIT[] field298 = new TKCVVLIT[13];

	@ObfuscatedName("client.Lg")
	public boolean field299 = false;

	@ObfuscatedName("client.Mg")
	public int[] field300 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Qg")
	public boolean field304 = false;

	@ObfuscatedName("client.Xg")
	public boolean field311 = false;

	@ObfuscatedName("client.dh")
	public int[] field316 = new int[50];

	@ObfuscatedName("client.jh")
	public int[] field321 = new int[7];

	@ObfuscatedName("client.kh")
	public int field322 = 2048;

	@ObfuscatedName("client.lh")
	public int field323 = 2047;

	@ObfuscatedName("client.mh")
	public QVUHZTUC[] field324 = new QVUHZTUC[field322];

	@ObfuscatedName("client.oh")
	public int[] field326 = new int[field322];

	@ObfuscatedName("client.qh")
	public int[] field328 = new int[field322];

	@ObfuscatedName("client.rh")
	public BJPWOXRJ[] field329 = new BJPWOXRJ[field322];

	@ObfuscatedName("client.th")
	public int field331 = 1;

	@ObfuscatedName("client.Ah")
	public byte[] field338 = new byte[16384];

	@ObfuscatedName("client.Bh")
	public int[] field339 = new int[100];

	@ObfuscatedName("client.Ch")
	public String[] field340 = new String[100];

	@ObfuscatedName("client.Dh")
	public String[] field341 = new String[100];

	@ObfuscatedName("client.Fh")
	public int[][][] field342 = new int[4][13][13];

	@ObfuscatedName("client.Gh")
	public int[] field343 = new int[PXPQSCQI.field1223];

	@ObfuscatedName("client.Hh")
	public int field344 = -1;

	@ObfuscatedName("client.Jh")
	public TKCVVLIT[] field345 = new TKCVVLIT[2];

	@ObfuscatedName("client.Lh")
	public boolean field347 = false;

	@ObfuscatedName("client.Rh")
	public int[] field353 = new int[4000];

	@ObfuscatedName("client.Sh")
	public int[] field354 = new int[4000];

	@ObfuscatedName("client.Wh")
	public int field356 = 78;

	@ObfuscatedName("client.fi")
	public boolean field365 = true;

	@ObfuscatedName("client.ni")
	public String field373 = "";

	@ObfuscatedName("client.ui")
	public int field380 = -1;

	@ObfuscatedName("client.xi")
	public int[] field383 = new int[1000];

	@ObfuscatedName("client.yi")
	public int[] field384 = new int[1000];

	@ObfuscatedName("client.zi")
	public int[][] field385 = new int[104][104];

	@ObfuscatedName("client.Bi")
	public int field386 = 3;

	@ObfuscatedName("client.Ci")
	public int[] field387 = new int[5];

	@ObfuscatedName("client.Ki")
	public String field395 = "";

	@ObfuscatedName("client.Li")
	public YZDAHXEQ[] field396 = new YZDAHXEQ[100];

	@ObfuscatedName("client.Si")
	public String field401 = "";

	@ObfuscatedName("client.Ti")
	public String field402 = "";

	@ObfuscatedName("client.Ui")
	public int field403 = -1;

	@ObfuscatedName("client.Yi")
	public boolean field407 = false;

	@ObfuscatedName("client.bj")
	public int[] field408 = new int[PXPQSCQI.field1223];

	@ObfuscatedName("client.cj")
	public int field409 = -1;

	@ObfuscatedName("client.dj")
	public CRC32 field410 = new CRC32();

	@ObfuscatedName("client.gj")
	public int field413 = 2;

	@ObfuscatedName("client.jj")
	public int field414 = 0x766654;

	@ObfuscatedName("client.nj")
	public int[] field418 = new int[50];

	@ObfuscatedName("client.oj")
	public String field419 = "";

	@ObfuscatedName("client.qj")
	public int field421 = -1;

	@ObfuscatedName("client.rj")
	public int field422 = -1;

	@ObfuscatedName("client.tj")
	public String[] field424 = new String[5];

	@ObfuscatedName("client.uj")
	public boolean[] field425 = new boolean[5];

	@ObfuscatedName("client.zj")
	public int[] field430 = new int[500];

	@ObfuscatedName("client.Aj")
	public int[] field431 = new int[500];

	@ObfuscatedName("client.Bj")
	public int[] field432 = new int[500];

	@ObfuscatedName("client.Cj")
	public int[] field433 = new int[500];

	@ObfuscatedName("client.Dj")
	public RGZIHLRP field434 = new RGZIHLRP();

	@ObfuscatedName("client.Ej")
	public int field435 = -1;

	@ObfuscatedName("client.Fj")
	public boolean field436 = true;

	@ObfuscatedName("client.Gj")
	public boolean field437 = false;

	@ObfuscatedName("client.Ij")
	public YZDAHXEQ[] field439 = new YZDAHXEQ[20];

	@ObfuscatedName("client.Oj")
	public boolean field443 = false;

	@ObfuscatedName("client.Uj")
	public boolean field449 = false;

	@ObfuscatedName("client.pc")
	public static BigInteger field97 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.sc")
	public static String field100 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.uc")
	public static final int[][] field102 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Sc")
	public static int[] field123 = new int[32];

	@ObfuscatedName("client.Ke")
	public static int[] field206 = new int[99];

	@ObfuscatedName("client.wh")
	public static int field334 = 10;

	@ObfuscatedName("client.yh")
	public static boolean field336 = true;

	@ObfuscatedName("client.Ji")
	public static final int[] field394 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Hj")
	public static BigInteger field438 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.tc")
	public int field101;

	@ObfuscatedName("client.Ac")
	public int field105;

	@ObfuscatedName("client.Mc")
	public int field117;

	@ObfuscatedName("client.Pc")
	public int field120;

	@ObfuscatedName("client.Tc")
	public int field124;

	@ObfuscatedName("client.Xc")
	public int field126;

	@ObfuscatedName("client.ad")
	public int field129;

	@ObfuscatedName("client.ed")
	public static int field132;

	@ObfuscatedName("client.kd")
	public int field137;

	@ObfuscatedName("client.ld")
	public int field138;

	@ObfuscatedName("client.md")
	public int field139;

	@ObfuscatedName("client.nd")
	public int field140;

	@ObfuscatedName("client.td")
	public int field146;

	@ObfuscatedName("client.Ad")
	public int field151;

	@ObfuscatedName("client.Bd")
	public int field152;

	@ObfuscatedName("client.Ed")
	public int field153;

	@ObfuscatedName("client.Fd")
	public int field154;

	@ObfuscatedName("client.Gd")
	public int field155;

	@ObfuscatedName("client.Hd")
	public int field156;

	@ObfuscatedName("client.Id")
	public int field157;

	@ObfuscatedName("client.Jd")
	public int field158;

	@ObfuscatedName("client.Kd")
	public int field159;

	@ObfuscatedName("client.Ld")
	public int field160;

	@ObfuscatedName("client.Ud")
	public int field168;

	@ObfuscatedName("client.ne")
	public int field186;

	@ObfuscatedName("client.oe")
	public int field187;

	@ObfuscatedName("client.pe")
	public int field188;

	@ObfuscatedName("client.qe")
	public int field189;

	@ObfuscatedName("client.re")
	public int field190;

	@ObfuscatedName("client.te")
	public int field192;

	@ObfuscatedName("client.ue")
	public int field193;

	@ObfuscatedName("client.ve")
	public int field194;

	@ObfuscatedName("client.ye")
	public int field197;

	@ObfuscatedName("client.Ge")
	public int field203;

	@ObfuscatedName("client.Me")
	public static int field208;

	@ObfuscatedName("client.Pe")
	public int field211;

	@ObfuscatedName("client.Qe")
	public int field212;

	@ObfuscatedName("client.Re")
	public int field213;

	@ObfuscatedName("client.Se")
	public int field214;

	@ObfuscatedName("client.Te")
	public int field215;

	@ObfuscatedName("client.Ve")
	public int field217;

	@ObfuscatedName("client.We")
	public int field218;

	@ObfuscatedName("client.Ye")
	public static int field219;

	@ObfuscatedName("client.Ze")
	public int field220;

	@ObfuscatedName("client.ef")
	public int field224;

	@ObfuscatedName("client.ff")
	public int field225;

	@ObfuscatedName("client.qf")
	public int field234;

	@ObfuscatedName("client.yf")
	public static int field239;

	@ObfuscatedName("client.Af")
	public int field241;

	@ObfuscatedName("client.Bf")
	public int field242;

	@ObfuscatedName("client.Cf")
	public int field243;

	@ObfuscatedName("client.Df")
	public int field244;

	@ObfuscatedName("client.Ef")
	public int field245;

	@ObfuscatedName("client.Ff")
	public int field246;

	@ObfuscatedName("client.Kf")
	public int field251;

	@ObfuscatedName("client.Rf")
	public int field258;

	@ObfuscatedName("client.Sf")
	public int field259;

	@ObfuscatedName("client.Tf")
	public int field260;

	@ObfuscatedName("client.Uf")
	public int field261;

	@ObfuscatedName("client.bg")
	public int field268;

	@ObfuscatedName("client.eg")
	public int field270;

	@ObfuscatedName("client.fg")
	public int field271;

	@ObfuscatedName("client.gg")
	public int field272;

	@ObfuscatedName("client.hg")
	public int field273;

	@ObfuscatedName("client.ig")
	public static int field274;

	@ObfuscatedName("client.Cg")
	public int field291;

	@ObfuscatedName("client.Dg")
	public int field292;

	@ObfuscatedName("client.Eg")
	public int field293;

	@ObfuscatedName("client.Fg")
	public int field294;

	@ObfuscatedName("client.Gg")
	public int field295;

	@ObfuscatedName("client.Hg")
	public int field296;

	@ObfuscatedName("client.Ig")
	public int field297;

	@ObfuscatedName("client.Wg")
	public int field310;

	@ObfuscatedName("client.bh")
	public int field314;

	@ObfuscatedName("client.ch")
	public static int field315;

	@ObfuscatedName("client.Q")
	public int field32;

	@ObfuscatedName("client.nh")
	public int field325;

	@ObfuscatedName("client.ph")
	public int field327;

	@ObfuscatedName("client.sh")
	public int field330;

	@ObfuscatedName("client.uh")
	public int field332;

	@ObfuscatedName("client.xh")
	public static int field335;

	@ObfuscatedName("client.Kh")
	public int field346;

	@ObfuscatedName("client.Qh")
	public int field352;

	@ObfuscatedName("client.Xh")
	public static int field357;

	@ObfuscatedName("client.Zh")
	public int field359;

	@ObfuscatedName("client.ai")
	public int field360;

	@ObfuscatedName("client.bi")
	public int field361;

	@ObfuscatedName("client.ci")
	public int field362;

	@ObfuscatedName("client.di")
	public int field363;

	@ObfuscatedName("client.ei")
	public int field364;

	@ObfuscatedName("client.gi")
	public int field366;

	@ObfuscatedName("client.hi")
	public int field367;

	@ObfuscatedName("client.ii")
	public int field368;

	@ObfuscatedName("client.ji")
	public int field369;

	@ObfuscatedName("client.li")
	public int field371;

	@ObfuscatedName("client.mi")
	public int field372;

	@ObfuscatedName("client.oi")
	public int field374;

	@ObfuscatedName("client.pi")
	public int field375;

	@ObfuscatedName("client.qi")
	public int field376;

	@ObfuscatedName("client.ri")
	public int field377;

	@ObfuscatedName("client.si")
	public int field378;

	@ObfuscatedName("client.ti")
	public int field379;

	@ObfuscatedName("client.W")
	public int field38;

	@ObfuscatedName("client.wi")
	public int field382;

	@ObfuscatedName("client.Di")
	public int field388;

	@ObfuscatedName("client.Ei")
	public int field389;

	@ObfuscatedName("client.X")
	public int field39;

	@ObfuscatedName("client.Fi")
	public int field390;

	@ObfuscatedName("client.Gi")
	public int field391;

	@ObfuscatedName("client.Hi")
	public int field392;

	@ObfuscatedName("client.Ii")
	public int field393;

	@ObfuscatedName("client.Oi")
	public int field397;

	@ObfuscatedName("client.Pi")
	public int field398;

	@ObfuscatedName("client.Qi")
	public int field399;

	@ObfuscatedName("client.Y")
	public int field40;

	@ObfuscatedName("client.Ri")
	public int field400;

	@ObfuscatedName("client.Wi")
	public static int field405;

	@ObfuscatedName("client.ej")
	public int field411;

	@ObfuscatedName("client.fj")
	public int field412;

	@ObfuscatedName("client.kj")
	public int field415;

	@ObfuscatedName("client.lj")
	public int field416;

	@ObfuscatedName("client.pj")
	public static int field420;

	@ObfuscatedName("client.sj")
	public int field423;

	@ObfuscatedName("client.vj")
	public int field426;

	@ObfuscatedName("client.wj")
	public int field427;

	@ObfuscatedName("client.xj")
	public int field428;

	@ObfuscatedName("client.Kj")
	public static int field440;

	@ObfuscatedName("client.Pj")
	public int field444;

	@ObfuscatedName("client.Qj")
	public int field445;

	@ObfuscatedName("client.Rj")
	public int field446;

	@ObfuscatedName("client.Sj")
	public int field447;

	@ObfuscatedName("client.jb")
	public static int field47;

	@ObfuscatedName("client.mb")
	public int field50;

	@ObfuscatedName("client.sb")
	public int field55;

	@ObfuscatedName("client.tb")
	public static int field56;

	@ObfuscatedName("client.vb")
	public int field58;

	@ObfuscatedName("client.zb")
	public int field62;

	@ObfuscatedName("client.Db")
	public int field65;

	@ObfuscatedName("client.Gb")
	public int field67;

	@ObfuscatedName("client.Hb")
	public int field68;

	@ObfuscatedName("client.Ib")
	public int field69;

	@ObfuscatedName("client.Jb")
	public int field70;

	@ObfuscatedName("client.Kb")
	public int field71;

	@ObfuscatedName("client.Pb")
	public int field74;

	@ObfuscatedName("client.Qb")
	public int field75;

	@ObfuscatedName("client.Rb")
	public int field76;

	@ObfuscatedName("client.Sb")
	public int field77;

	@ObfuscatedName("client.Tb")
	public static int field78;

	@ObfuscatedName("client.Vb")
	public int field80;

	@ObfuscatedName("client.Wb")
	public int field81;

	@ObfuscatedName("client.Xb")
	public int field82;

	@ObfuscatedName("client.Yb")
	public int field83;

	@ObfuscatedName("client.dc")
	public int field87;

	@ObfuscatedName("client.ec")
	public int field88;

	@ObfuscatedName("client.gc")
	public static int field90;

	@ObfuscatedName("client.mc")
	public int field95;

	@ObfuscatedName("client.qc")
	public int field98;

	@ObfuscatedName("client.rc")
	public static int field99;

	@ObfuscatedName("client.hf")
	public long field227;

	@ObfuscatedName("client.Vg")
	public long field309;

	@ObfuscatedName("client.V")
	public long field37;

	@ObfuscatedName("client.yj")
	public long field429;

	@ObfuscatedName("client.Fb")
	public long field66;

	@ObfuscatedName("client.dd")
	public FHVZVKRA field131;

	@ObfuscatedName("client.Bb")
	public FMTLAPCJ field64;

	@ObfuscatedName("client.Le")
	public HFOJZUJK field207;

	@ObfuscatedName("client.Md")
	public JHRYTWFZ field161;

	@ObfuscatedName("client.mj")
	public MNPBQFWE field417;

	@ObfuscatedName("client.Mh")
	public NEJZODYM field348;

	@ObfuscatedName("client.Nh")
	public NEJZODYM field349;

	@ObfuscatedName("client.Oh")
	public NEJZODYM field350;

	@ObfuscatedName("client.Ph")
	public NEJZODYM field351;

	@ObfuscatedName("client.Xi")
	public PTSFQSMJ field406;

	@ObfuscatedName("client.vi")
	public static QVUHZTUC field381;

	@ObfuscatedName("client.xc")
	public TKCVVLIT field103;

	@ObfuscatedName("client.yc")
	public TKCVVLIT field104;

	@ObfuscatedName("client.ge")
	public TKCVVLIT field180;

	@ObfuscatedName("client.he")
	public TKCVVLIT field181;

	@ObfuscatedName("client.ie")
	public TKCVVLIT field182;

	@ObfuscatedName("client.je")
	public TKCVVLIT field183;

	@ObfuscatedName("client.ke")
	public TKCVVLIT field184;

	@ObfuscatedName("client.He")
	public TKCVVLIT field204;

	@ObfuscatedName("client.Ie")
	public TKCVVLIT field205;

	@ObfuscatedName("client.kg")
	public TKCVVLIT field275;

	@ObfuscatedName("client.lg")
	public TKCVVLIT field276;

	@ObfuscatedName("client.mg")
	public TKCVVLIT field277;

	@ObfuscatedName("client.ng")
	public TKCVVLIT field278;

	@ObfuscatedName("client.og")
	public TKCVVLIT field279;

	@ObfuscatedName("client.Rg")
	public TKCVVLIT field305;

	@ObfuscatedName("client.Sg")
	public TKCVVLIT field306;

	@ObfuscatedName("client.Tg")
	public TKCVVLIT field307;

	@ObfuscatedName("client.ac")
	public TKCVVLIT field84;

	@ObfuscatedName("client.bc")
	public TKCVVLIT field85;

	@ObfuscatedName("client.cc")
	public TKCVVLIT field86;

	@ObfuscatedName("client.Bc")
	public YOIXICCU field106;

	@ObfuscatedName("client.Cc")
	public YOIXICCU field107;

	@ObfuscatedName("client.Dc")
	public YOIXICCU field108;

	@ObfuscatedName("client.Ec")
	public YOIXICCU field109;

	@ObfuscatedName("client.Fc")
	public YOIXICCU field110;

	@ObfuscatedName("client.Gc")
	public YOIXICCU field111;

	@ObfuscatedName("client.Hc")
	public YOIXICCU field112;

	@ObfuscatedName("client.Ic")
	public YOIXICCU field113;

	@ObfuscatedName("client.Jc")
	public YOIXICCU field114;

	@ObfuscatedName("client.ze")
	public YOIXICCU field198;

	@ObfuscatedName("client.Ae")
	public YOIXICCU field199;

	@ObfuscatedName("client.Be")
	public YOIXICCU field200;

	@ObfuscatedName("client.Ce")
	public YOIXICCU field201;

	@ObfuscatedName("client.tg")
	public YOIXICCU field282;

	@ObfuscatedName("client.ug")
	public YOIXICCU field283;

	@ObfuscatedName("client.vg")
	public YOIXICCU field284;

	@ObfuscatedName("client.wg")
	public YOIXICCU field285;

	@ObfuscatedName("client.xg")
	public YOIXICCU field286;

	@ObfuscatedName("client.yg")
	public YOIXICCU field287;

	@ObfuscatedName("client.zg")
	public YOIXICCU field288;

	@ObfuscatedName("client.Ag")
	public YOIXICCU field289;

	@ObfuscatedName("client.Bg")
	public YOIXICCU field290;

	@ObfuscatedName("client.eh")
	public YOIXICCU field317;

	@ObfuscatedName("client.fh")
	public YOIXICCU field318;

	@ObfuscatedName("client.gh")
	public YOIXICCU field319;

	@ObfuscatedName("client.rd")
	public YZDAHXEQ field144;

	@ObfuscatedName("client.sd")
	public YZDAHXEQ field145;

	@ObfuscatedName("client.Nd")
	public YZDAHXEQ field162;

	@ObfuscatedName("client.Od")
	public YZDAHXEQ field163;

	@ObfuscatedName("client.Lf")
	public YZDAHXEQ field252;

	@ObfuscatedName("client.Mf")
	public YZDAHXEQ field253;

	@ObfuscatedName("client.Nf")
	public YZDAHXEQ field254;

	@ObfuscatedName("client.Of")
	public YZDAHXEQ field255;

	@ObfuscatedName("client.Pf")
	public YZDAHXEQ field256;

	@ObfuscatedName("client.Zg")
	public YZDAHXEQ field312;

	@ObfuscatedName("client.ah")
	public YZDAHXEQ field313;

	@ObfuscatedName("client.ih")
	public YZDAHXEQ field320;

	@ObfuscatedName("client.ki")
	public YZDAHXEQ field370;

	@ObfuscatedName("client.Vi")
	public YZDAHXEQ field404;

	@ObfuscatedName("client.od")
	public String field141;

	@ObfuscatedName("client.Ug")
	public String field308;

	@ObfuscatedName("client.Uh")
	public String field355;

	@ObfuscatedName("client.Tj")
	public String field448;

	@ObfuscatedName("client.rb")
	public Socket field54;

	@ObfuscatedName("client.df")
	public static boolean field223;

	@ObfuscatedName("client.zh")
	public static boolean field337;

	@ObfuscatedName("client.Yh")
	public static boolean field358;

	@ObfuscatedName("client.lc")
	public static boolean field94;

	@ObfuscatedName("client.fd")
	public int[] field133;

	@ObfuscatedName("client.gd")
	public int[] field134;

	@ObfuscatedName("client.sf")
	public int[] field236;

	@ObfuscatedName("client.tf")
	public int[] field237;

	@ObfuscatedName("client.uf")
	public int[] field238;

	@ObfuscatedName("client.Xf")
	public int[] field264;

	@ObfuscatedName("client.Yf")
	public int[] field265;

	@ObfuscatedName("client.Zf")
	public int[] field266;

	@ObfuscatedName("client.ag")
	public int[] field267;

	@ObfuscatedName("client.Ng")
	public int[] field301;

	@ObfuscatedName("client.Og")
	public int[] field302;

	@ObfuscatedName("client.Pg")
	public int[] field303;

	@ObfuscatedName("client.Lj")
	public int[] field441;

	@ObfuscatedName("client.Mj")
	public int[] field442;

	@ObfuscatedName("client.Rc")
	public TKCVVLIT[] field122;

	@ObfuscatedName("client.N")
	public byte[][] field30;

	@ObfuscatedName("client.eb")
	public byte[][] field43;

	@ObfuscatedName("client.vh")
	public byte[][][] field333;

	@ObfuscatedName("client.nb")
	public int[][][] field51;

	@ObfuscatedName("client.a(BJ)V")
	public final void method33(long arg0) {
		if (arg0 != 0L) {
			if (field310 >= 100) {
				method89("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = PQGPOSRV.method463(PQGPOSRV.method460(arg0));
				for (int var4 = 0; var4 < field310; var4++) {
					if (field166[var4] == arg0) {
						method89(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field159; var5++) {
					if (field226[var5] == arg0) {
						method89("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field166[field310++] = arg0;
				field96 = true;
				field79.method4(38);
				field79.method11(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method34(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method35() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method36(boolean arg0) {
		if (field381.field1111 >> 7 == field368 && field381.field1112 >> 7 == field369) {
			field368 = 0;
			field420++;
			if (field420 > 66) {
				field420 = 0;
				field79.method4(248);
			}
		}

		int var2 = field325;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			QVUHZTUC var4;
			int var5;
			if (arg0) {
				var4 = field381;
				var5 = field323 << 14;
			} else {
				var4 = field324[field326[var3]];
				var5 = field326[var3] << 14;
			}

			if (var4 != null && var4.method297()) {
				var4.field1248 = false;
				if ((field337 && field325 > 50 || field325 > 200) && !arg0 && var4.field1140 == var4.field1124) {
					var4.field1248 = true;
				}

				int var6 = var4.field1111 >> 7;
				int var7 = var4.field1112 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1241 == null || field239 < var4.field1252 || field239 >= var4.field1253) {
						if ((var4.field1111 & 0x7F) == 0x40 && (var4.field1112 & 0x7F) == 0x40) {
							if (field191[var6][var7] == field416) {
								continue;
							}

							field191[var6][var7] = field416;
						}

						var4.field1255 = method94(var4.field1111, var4.field1112, field98);
						field207.method256(60, var4, field98, var5, var4.field1255, var4.field1113, var4.field1111, var4.field1112, var4.field1123);
					} else {
						var4.field1248 = false;
						var4.field1255 = method94(var4.field1111, var4.field1112, field98);
						field207.method257(var4.field1111, var4.field1242, field98, var4.field1245, var4.field1113, var4.field1243, 60, var4.field1255, var5, var4, var4.field1112, var4.field1244);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)Ljava/lang/String;")
	public final String method37() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1364 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.e(I)V")
	public final void method38() {
		int var1 = field293 * 128 + 64;
		int var2 = field294 * 128 + 64;
		int var3 = method94(var1, var2, field98) - field295;

		if (field359 < var1) {
			field359 += (var1 - field359) * field297 / 1000 + field296;
			if (field359 > var1) {
				field359 = var1;
			}
		}

		if (field359 > var1) {
			field359 -= (field359 - var1) * field297 / 1000 + field296;
			if (field359 < var1) {
				field359 = var1;
			}
		}

		if (field360 < var3) {
			field360 += (var3 - field360) * field297 / 1000 + field296;
			if (field360 > var3) {
				field360 = var3;
			}
		}

		if (field360 > var3) {
			field360 -= (field360 - var3) * field297 / 1000 + field296;
			if (field360 < var3) {
				field360 = var3;
			}
		}

		if (field361 < var2) {
			field361 += (var2 - field361) * field297 / 1000 + field296;
			if (field361 > var2) {
				field361 = var2;
			}
		}

		if (field361 > var2) {
			field361 -= (field361 - var2) * field297 / 1000 + field296;
			if (field361 < var2) {
				field361 = var2;
			}
		}

		int var4 = field241 * 128 + 64;
		int var5 = field242 * 128 + 64;
		int var6 = method94(var4, var5, field98) - field243;
		int var7 = var4 - field359;
		int var8 = var6 - field360;
		int var9 = var5 - field361;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field362 < var11) {
			field362 += (var11 - field362) * field245 / 1000 + field244;
			if (field362 > var11) {
				field362 = var11;
			}
		}

		if (field362 > var11) {
			field362 -= (field362 - var11) * field245 / 1000 + field244;
			if (field362 < var11) {
				field362 = var11;
			}
		}

		int var13 = var12 - field363;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field363 += field245 * var13 / 1000 + field244;
			field363 &= 0x7FF;
		}

		if (var13 < 0) {
			field363 -= -var13 * field245 / 1000 + field244;
			field363 &= 0x7FF;
		}

		int var14 = var12 - field363;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field363 = var12;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method39() {
		try {
			field435 = -1;
			field269.method475();
			field91.method475();
			FWQLREOO.method209();
			method147();
			field207.method245();

			for (int var1 = 0; var1 < 4; var1++) {
				field29[var1].method299();
			}

			System.gc();
			SMJSOFHG var2 = new SMJSOFHG(field333, 104, field51, 104);
			int var3 = field30.length;
			SMJSOFHG.field1338 = HFOJZUJK.field672;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field301[var4] >> 8;
				int var6 = field301[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					SMJSOFHG.field1338 = false;
				}
			}

			if (SMJSOFHG.field1338) {
				field207.method246(field98);
			} else {
				field207.method246(0);
			}

			field79.method4(21);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field301[var7] >> 8) * 64 - field258;
				int var9 = (field301[var7] & 0xFF) * 64 - field259;
				byte[] var10 = field30[var7];
				if (var10 != null) {
					var2.method503((field217 - 6) * 8, var10, (field218 - 6) * 8, var8, var9);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field301[var11] >> 8) * 64 - field258;
				int var13 = (field301[var11] & 0xFF) * 64 - field259;
				byte[] var14 = field30[var11];
				if (var14 == null && field218 < 800) {
					var2.method507(var13, 64, 64, var12);
				}
			}

			field79.method4(21);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field43[var15];
				if (var16 != null) {
					int var17 = (field301[var15] >> 8) * 64 - field258;
					int var18 = (field301[var15] & 0xFF) * 64 - field259;
					var2.method496(var18, var16, var17, field29, field207);
				}
			}

			field79.method4(21);
			var2.method506(field207, field29);
			field200.method545();
			field79.method4(21);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method42(var19, var20);
				}
			}

			method130();
		} catch (Exception var33) {
		}

		KZRNPNVL.field980.method317();

		if (field337 && signlink.cache_dat != null) {
			int var22 = field131.method186(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field131.method185(var23);
				if ((var24 & 0x79) == 0) {
					JLNSJQDR.method327(var23);
				}
			}
		}

		System.gc();
		FWQLREOO.method210(20);
		field131.method195();
		int var25 = (field217 - 6) / 8 - 1;
		int var26 = (field217 + 6) / 8 + 1;
		int var27 = (field218 - 6) / 8 - 1;
		int var28 = (field218 + 6) / 8 + 1;
		if (field229) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field131.method202(var29, var30, 0);
					if (var31 != -1) {
						field131.method183(var31, 3);
					}

					int var32 = field131.method202(var29, var30, 1);
					if (var32 != -1) {
						field131.method183(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BB)Z")
	public final boolean method40(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method41(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field159; var2++) {
			if (arg0.equalsIgnoreCase(field121[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field381.field1236)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method42(int arg0, int arg1) {
		RGZIHLRP var3 = field135[field98][arg0][arg1];
		if (var3 == null) {
			field207.method266(field98, arg0, arg1);
		} else {
			int var4 = -99999999;
			YSIOSDRV var5 = null;
			for (YSIOSDRV var6 = (YSIOSDRV) var3.method471(); var6 != null; var6 = (YSIOSDRV) var3.method473()) {
				LGNJKIJR var7 = LGNJKIJR.method409(var6.field1472);
				int var8 = var7.field997;
				if (var7.field1036) {
					var8 = (var6.field1473 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method469(var5);
			YSIOSDRV var9 = null;
			YSIOSDRV var10 = null;
			for (YSIOSDRV var11 = (YSIOSDRV) var3.method471(); var11 != null; var11 = (YSIOSDRV) var3.method473()) {
				if (var5.field1472 != var11.field1472 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1472 != var11.field1472 && var9.field1472 != var11.field1472 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field207.method252(arg1, var12, arg0, var9, var10, var5, method94(arg0 * 128 + 64, arg1 * 128 + 64, field98), field98);
		}
	}

	@ObfuscatedName("client.a(IILRRZTMHXJ;BI)V")
	public final void method43(int arg0, int arg1, RRZTMHXJ arg2, int arg3) {
		if (field225 < 400) {
			if (arg2.field1283 != null) {
				arg2 = arg2.method487();
			}

			if (arg2 != null) {
				String var5 = arg2.field1286;
				if (arg2.field1292 != 0) {
					var5 = var5 + method161(arg2.field1292, field381.field1251) + " (level-" + arg2.field1292 + ")";
				}

				if (field444 == 1) {
					field216[field225] = "Use " + field448 + " with @yel@" + var5;
					field432[field225] = 231;
					field433[field225] = arg0;
					field430[field225] = arg3;
					field431[field225] = arg1;
					field225++;
				} else if (field138 != 1) {
					if (arg2.field1284 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field1284[var6] != null && !arg2.field1284[var6].equalsIgnoreCase("attack")) {
								field216[field225] = arg2.field1284[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field432[field225] = 101;
								}

								if (var6 == 1) {
									field432[field225] = 458;
								}

								if (var6 == 2) {
									field432[field225] = 766;
								}

								if (var6 == 3) {
									field432[field225] = 595;
								}

								if (var6 == 4) {
									field432[field225] = 687;
								}

								field433[field225] = arg0;
								field430[field225] = arg3;
								field431[field225] = arg1;
								field225++;
							}
						}
					}

					if (arg2.field1284 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field1284[var7] != null && arg2.field1284[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field1292 > field381.field1251) {
									var8 = 2000;
								}

								field216[field225] = arg2.field1284[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field432[field225] = var8 + 101;
								}

								if (var7 == 1) {
									field432[field225] = var8 + 458;
								}

								if (var7 == 2) {
									field432[field225] = var8 + 766;
								}

								if (var7 == 3) {
									field432[field225] = var8 + 595;
								}

								if (var7 == 4) {
									field432[field225] = var8 + 687;
								}

								field433[field225] = arg0;
								field430[field225] = arg3;
								field431[field225] = arg1;
								field225++;
							}
						}
					}

					field216[field225] = "Examine @yel@" + var5;
					field432[field225] = 1195;
					field433[field225] = arg0;
					field430[field225] = arg3;
					field431[field225] = arg1;
					field225++;
				} else if ((field140 & 0x2) == 2) {
					field216[field225] = field141 + " @yel@" + var5;
					field432[field225] = 480;
					field433[field225] = arg0;
					field430[field225] = arg3;
					field431[field225] = arg1;
					field225++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method44(String arg0) throws IOException {
		if (field230) {
			if (field54 != null) {
				try {
					field54.close();
				} catch (Exception var4) {
				}

				field54 = null;
			}

			field54 = method129(43595);
			field54.setSoTimeout(10000);
			InputStream var2 = field54.getInputStream();
			OutputStream var3 = field54.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.c(B)V")
	public final void method45() {
		if (field225 >= 2 || field444 != 0 || field138 != 0) {
			String var1;
			if (field444 == 1 && field225 < 2) {
				var1 = "Use " + field448 + " with...";
			} else if (field138 == 1 && field225 < 2) {
				var1 = field141 + "...";
			} else {
				var1 = field216[field225 - 1];
			}

			if (field225 > 2) {
				var1 = var1 + "@whi@ / " + (field225 - 2) + " more options";
			}

			field350.method441(true, field239 / 1000, var1, 15, 4, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method46() {
		field103 = new TKCVVLIT(field417, "titlebox", 0);
		field104 = new TKCVVLIT(field417, "titlebutton", 0);
		field122 = new TKCVVLIT[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field122[var2] = new TKCVVLIT(field417, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field122[var3] = new TKCVVLIT(field417, "runes", (var3 & 0x3) + 12);
			}
		}

		field144 = new YZDAHXEQ(128, 265);
		field145 = new YZDAHXEQ(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field144.field1474[var4] = field109.field1466[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field145.field1474[var5] = field110.field1466[var5];
		}

		field265 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field265[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field265[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field265[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field265[var9 + 192] = 0xFFFFFF;
		}

		field266 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field266[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field266[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field266[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field266[var13 + 192] = 0xFFFFFF;
		}

		field267 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field267[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field267[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field267[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field267[var17 + 192] = 0xFFFFFF;
		}

		field264 = new int[256];
		field133 = new int[32768];
		field134 = new int[32768];
		method92(null);
		field441 = new int[32768];
		field442 = new int[32768];
		method166("Connecting to fileserver", 10);

		if (!field92) {
			field299 = true;
			field92 = true;
			method115(this, 2);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method47() {
		for (int var1 = -1; var1 < field325; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field323;
			} else {
				var2 = field326[var1];
			}

			QVUHZTUC var3 = field324[var2];
			if (var3 != null && var3.field1138 > 0) {
				var3.field1138--;
				if (var3.field1138 == 0) {
					var3.field1098 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field117; var4++) {
			int var5 = field118[var4];
			HGVATLQF var6 = field116[var5];
			if (var6 != null && var6.field1138 > 0) {
				var6.field1138--;
				if (var6.field1138 == 0) {
					var6.field1098 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method48() {
		field347 = true;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method49(int arg0) {
		if (arg0 >= 0) {
			if (field210) {
				field210 = false;
				field125 = true;
			}

			int var2 = field430[arg0];
			int var3 = field431[arg0];
			int var4 = field432[arg0];
			int var5 = field433[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 927 || var4 == 266 || var4 == 361 || var4 == 801) {
				String var6 = field216[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = PQGPOSRV.method459(var6.substring(var7 + 5).trim());
					if (var4 == 927) {
						method51(var8);
					}

					if (var4 == 266) {
						method33(var8);
					}

					if (var4 == 361) {
						method133(var8);
					}

					if (var4 == 801) {
						method72(var8);
					}
				}
			}

			if (var4 == 149) {
				QVUHZTUC var10 = field324[var5];
				if (var10 != null) {
					method138(field381.field1119[0], field381.field1118[0], 0, var10.field1118[0], 1, 0, false, 1, var10.field1119[0], 0, 2);
					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field79.method4(101);
					field79.method6(var5);
				}
			}

			if (var4 == 109) {
				boolean var11 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
				if (!var11) {
					method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
				}

				field155 = field1376;
				field156 = field1377;
				field158 = 2;
				field157 = 0;
				field79.method4(105);
				field79.method6(field258 + var2);
				field79.method6(field259 + var3);
				field79.method6(var5);
				field79.method6(field447);
				field79.method6(field445);
				field79.method6(field446);
			}

			if (var4 == 595) {
				HGVATLQF var13 = field116[var5];
				if (var13 != null) {
					method138(field381.field1119[0], field381.field1118[0], 0, var13.field1118[0], 1, 0, false, 1, var13.field1119[0], 0, 2);
					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field357 += var5;
					if (field357 >= 64) {
						field79.method4(125);
						field357 = 0;
					}

					field79.method4(237);
					field79.method6(var5);
				}
			}

			if (var4 == 907) {
				field79.method4(114);
				field79.method6(var3);
				ETSIPTYG var14 = ETSIPTYG.field499[var3];
				if (var14.field474 != null && var14.field474[0][0] == 5) {
					int var15 = var14.field474[0][1];
					field41[var15] = 1 - field41[var15];
					method62(var15);
					field96 = true;
				}
			}

			if (var4 == 848) {
				boolean var16 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
				if (!var16) {
					method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
				}

				field155 = field1376;
				field156 = field1377;
				field158 = 2;
				field157 = 0;
				field79.method4(62);
				field79.method6(field258 + var2);
				field79.method6(field259 + var3);
				field79.method6(var5);
			}

			if (var4 == 934) {
				if ((var2 & 0x3) == 0) {
					field440++;
				}

				if (field440 >= 139) {
					field79.method4(22);
					field79.method6(41053);
					field440 = 0;
				}

				field79.method4(52);
				field79.method6(var5);
				field79.method6(var2);
				field79.method6(var3);
				field270 = 0;
				field271 = var3;
				field272 = var2;
				field273 = 2;
				if (ETSIPTYG.field499[var3].field509 == field46) {
					field273 = 1;
				}

				if (ETSIPTYG.field499[var3].field509 == field380) {
					field273 = 3;
				}
			}

			if (var4 == 472) {
				field79.method4(209);
				field79.method6(var5);
				field79.method6(var2);
				field79.method6(var3);
				field270 = 0;
				field271 = var3;
				field272 = var2;
				field273 = 2;
				if (ETSIPTYG.field499[var3].field509 == field46) {
					field273 = 1;
				}

				if (ETSIPTYG.field499[var3].field509 == field380) {
					field273 = 3;
				}
			}

			if (var4 == 502) {
				field79.method4(173);
				field79.method6(var5);
				field79.method6(var2);
				field79.method6(var3);
				field270 = 0;
				field271 = var3;
				field272 = var2;
				field273 = 2;
				if (ETSIPTYG.field499[var3].field509 == field46) {
					field273 = 1;
				}

				if (ETSIPTYG.field499[var3].field509 == field380) {
					field273 = 3;
				}
			}

			if (var4 == 762) {
				if (field89) {
					field207.method283(var2 - 4, var3 - 4);
				} else {
					field207.method283(field1376 - 4, field1377 - 4);
				}
			}

			if (var4 == 505 && method106(var3, var2, var5)) {
				field79.method4(220);
				field79.method6(field258 + var2);
				field79.method6(field259 + var3);
				field79.method6(var5 >> 14 & 0x7FFF);
				field79.method6(field139);
			}

			if (var4 == 114) {
				QVUHZTUC var18 = field324[var5];
				if (var18 != null) {
					method138(field381.field1119[0], field381.field1118[0], 0, var18.field1118[0], 1, 0, false, 1, var18.field1119[0], 0, 2);
					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field79.method4(111);
					field79.method6(var5);
				}
			}

			if (var4 == 233) {
				ETSIPTYG var19 = ETSIPTYG.field499[var3];
				field138 = 1;
				field139 = var3;
				field140 = var19.field521;
				field444 = 0;
				field96 = true;
				String var20 = var19.field477;
				if (var20.indexOf(" ") != -1) {
					var20 = var20.substring(0, var20.indexOf(" "));
				}

				String var21 = var19.field477;
				if (var21.indexOf(" ") != -1) {
					var21 = var21.substring(var21.indexOf(" ") + 1);
				}

				field141 = var20 + " " + var19.field525 + " " + var21;

				if (field140 == 16) {
					field96 = true;
					field386 = 3;
					field128 = true;
				}
			} else {
				if (var4 == 83 && !field53) {
					field79.method4(100);
					field79.method6(var3);
					field53 = true;
				}

				if (var4 == 680 && method106(var3, var2, var5)) {
					field79.method4(67);
					field79.method6(field258 + var2);
					field79.method6(field259 + var3);
					field79.method6(var5 >> 14 & 0x7FFF);
					field79.method6(field447);
					field79.method6(field445);
					field79.method6(field446);
				}

				if (var4 == 458) {
					HGVATLQF var22 = field116[var5];
					if (var22 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var22.field1118[0], 1, 0, false, 1, var22.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(9);
						field79.method6(var5);
					}
				}

				if (var4 == 662) {
					field79.method4(81);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field79.method6(field139);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 1195) {
					HGVATLQF var23 = field116[var5];
					if (var23 != null) {
						RRZTMHXJ var24 = var23.field735;
						if (var24.field1283 != null) {
							var24 = var24.method487();
						}

						if (var24 != null) {
							String var25;
							if (var24.field1307 == null) {
								var25 = "It's a " + var24.field1286 + ".";
							} else {
								var25 = new String(var24.field1307);
							}

							method89(var25, "", 0);
						}
					}
				}

				if (var4 == 780) {
					field79.method4(102);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field79.method6(field447);
					field79.method6(field445);
					field79.method6(field446);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 281) {
					String var26 = field216[arg0];
					int var27 = var26.indexOf("@whi@");
					if (var27 != -1) {
						long var28 = PQGPOSRV.method459(var26.substring(var27 + 5).trim());
						int var30 = -1;
						for (int var31 = 0; var31 < field159; var31++) {
							if (field226[var31] == var28) {
								var30 = var31;
								break;
							}
						}

						if (var30 != -1 && field257[var30] > 0) {
							field125 = true;
							field210 = false;
							field34 = true;
							field136 = "";
							field268 = 3;
							field227 = field226[var30];
							field419 = "Enter message to send to " + field121[var30];
						}
					}
				}

				if (var4 == 902) {
					QVUHZTUC var32 = field324[var5];
					if (var32 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var32.field1118[0], 1, 0, false, 1, var32.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(230);
						field79.method6(var5);
					}
				}

				if (var4 == 766) {
					HGVATLQF var33 = field116[var5];
					if (var33 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var33.field1118[0], 1, 0, false, 1, var33.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;

						if ((var5 & 0x3) == 0) {
							field274++;
						}

						if (field274 >= 99) {
							field79.method4(253);
							field79.method8(0x1C51E9);
							field274 = 0;
						}

						field79.method4(185);
						field79.method6(var5);
					}
				}

				if (var4 == 86) {
					field79.method4(68);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 1515) {
					LGNJKIJR var34 = LGNJKIJR.method409(var5);
					String var35;
					if (var34.field995 == null) {
						var35 = "It's a " + var34.field1012 + ".";
					} else {
						var35 = new String(var34.field995);
					}

					method89(var35, "", 0);
				}

				if (var4 == 454) {
					boolean var36 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
					if (!var36) {
						method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
					}

					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field79.method4(159);
					field79.method6(field258 + var2);
					field79.method6(field259 + var3);
					field79.method6(var5);
				}

				if (var4 == 628) {
					field79.method4(199);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 512) {
					boolean var38 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
					if (!var38) {
						method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
					}

					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field99++;
					if (field99 >= 119) {
						field79.method4(48);
						field79.method9(0);
						field99 = 0;
					}

					field79.method4(214);
					field79.method6(field258 + var2);
					field79.method6(field259 + var3);
					field79.method6(var5);
				}

				if (var4 == 1918) {
					LGNJKIJR var40 = LGNJKIJR.method409(var5);
					ETSIPTYG var41 = ETSIPTYG.field499[var3];
					String var42;
					if (var41 != null && var41.field510[var2] >= 100000) {
						var42 = var41.field510[var2] + " x " + var40.field1012;
					} else if (var40.field995 == null) {
						var42 = "It's a " + var40.field1012 + ".";
					} else {
						var42 = new String(var40.field995);
					}

					method89(var42, "", 0);
				}

				if (var4 == 803) {
					String var43 = field216[arg0];
					int var44 = var43.indexOf("@whi@");
					if (var44 != -1) {
						if (field46 == -1) {
							method98();
							field395 = var43.substring(var44 + 5).trim();
							field311 = false;

							for (int var45 = 0; var45 < ETSIPTYG.field499.length; var45++) {
								if (ETSIPTYG.field499[var45] != null && ETSIPTYG.field499[var45].field531 == 600) {
									field31 = field46 = ETSIPTYG.field499[var45].field509;
									break;
								}
							}
						} else {
							method89("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}

				if (var4 == 480) {
					HGVATLQF var46 = field116[var5];
					if (var46 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var46.field1118[0], 1, 0, false, 1, var46.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(174);
						field79.method6(var5);
						field79.method6(field139);
					}
				}

				if (var4 == 760) {
					ETSIPTYG var47 = ETSIPTYG.field499[var3];
					boolean var48 = true;
					if (var47.field531 > 0) {
						var48 = method168(var47);
					}

					if (var48) {
						field79.method4(114);
						field79.method6(var3);
					}
				}

				if (var4 == 1132) {
					int var49 = var5 >> 14 & 0x7FFF;
					KZRNPNVL var50 = KZRNPNVL.method401(var49);
					String var51;
					if (var50.field971 == null) {
						var51 = "It's a " + var50.field972 + ".";
					} else {
						var51 = new String(var50.field971);
					}

					method89(var51, "", 0);
				}

				if (var4 == 511) {
					boolean var52 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
					if (!var52) {
						method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
					}

					field155 = field1376;
					field156 = field1377;
					field158 = 2;
					field157 = 0;
					field79.method4(53);
					field79.method6(field258 + var2);
					field79.method6(field259 + var3);
					field79.method6(var5);
				}

				if (var4 == 101) {
					HGVATLQF var54 = field116[var5];
					if (var54 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var54.field1118[0], 1, 0, false, 1, var54.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(132);
						field79.method6(var5);
					}
				}

				if (var4 == 615) {
					field47++;
					if (field47 >= 87) {
						field79.method4(219);
						field47 = 0;
					}

					field79.method4(85);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 231) {
					HGVATLQF var55 = field116[var5];
					if (var55 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var55.field1118[0], 1, 0, false, 1, var55.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(149);
						field79.method6(var5);
						field79.method6(field447);
						field79.method6(field445);
						field79.method6(field446);
					}
				}

				if (var4 == 275) {
					field79.method4(191);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 214) {
					method98();
				}

				if (var4 == 381) {
					field79.method4(98);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 945) {
					method106(var3, var2, var5);
					field79.method4(108);
					field79.method6(field258 + var2);
					field79.method6(field259 + var3);
					field79.method6(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 158) {
					QVUHZTUC var56 = field324[var5];
					if (var56 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var56.field1118[0], 1, 0, false, 1, var56.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;

						if ((var5 & 0x3) == 0) {
							field90++;
						}

						if (field90 >= 96) {
							field79.method4(212);
							field90 = 0;
						}

						field79.method4(169);
						field79.method6(var5);
					}
				}

				if (var4 == 222) {
					field79.method4(140);
					field79.method6(var5);
					field79.method6(var2);
					field79.method6(var3);
					field270 = 0;
					field271 = var3;
					field272 = var2;
					field273 = 2;
					if (ETSIPTYG.field499[var3].field509 == field46) {
						field273 = 1;
					}

					if (ETSIPTYG.field499[var3].field509 == field380) {
						field273 = 3;
					}
				}

				if (var4 == 28) {
					QVUHZTUC var57 = field324[var5];
					if (var57 != null) {
						method138(field381.field1119[0], field381.field1118[0], 0, var57.field1118[0], 1, 0, false, 1, var57.field1119[0], 0, 2);
						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(106);
						field79.method6(var5);
						field79.method6(field139);
					}
				}

				if (var4 == 606) {
					field444 = 1;
					field445 = var2;
					field446 = var3;
					field447 = var5;
					field448 = LGNJKIJR.method409(var5).field1012;
					field138 = 0;
					field96 = true;
				} else {
					if (var4 == 473) {
						method106(var3, var2, var5);
						field79.method4(198);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 147) {
						method106(var3, var2, var5);
						field79.method4(61);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 51) {
						boolean var58 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
						if (!var58) {
							method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
						}

						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(180);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5);
						field79.method6(field139);
					}

					if (var4 == 447) {
						method106(var3, var2, var5);
						field79.method4(104);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 687) {
						HGVATLQF var60 = field116[var5];
						if (var60 != null) {
							method138(field381.field1119[0], field381.field1118[0], 0, var60.field1118[0], 1, 0, false, 1, var60.field1119[0], 0, 2);
							field155 = field1376;
							field156 = field1377;
							field158 = 2;
							field157 = 0;
							field79.method4(113);
							field79.method6(var5);
						}
					}

					if (var4 == 707) {
						field79.method4(114);
						field79.method6(var3);
						ETSIPTYG var61 = ETSIPTYG.field499[var3];
						if (var61.field474 != null && var61.field474[0][0] == 5) {
							int var62 = var61.field474[0][1];
							if (field41[var62] != var61.field489[0]) {
								field41[var62] = var61.field489[0];
								method62(var62);
								field96 = true;
							}
						}
					}

					if (var4 == 614 || var4 == 125) {
						String var63 = field216[arg0];
						int var64 = var63.indexOf("@whi@");
						if (var64 != -1) {
							var63 = var63.substring(var64 + 5).trim();
							String var65 = PQGPOSRV.method463(PQGPOSRV.method460(PQGPOSRV.method459(var63)));
							boolean var66 = false;
							for (int var67 = 0; var67 < field325; var67++) {
								QVUHZTUC var68 = field324[field326[var67]];
								if (var68 != null && var68.field1236 != null && var68.field1236.equalsIgnoreCase(var65)) {
									method138(field381.field1119[0], field381.field1118[0], 0, var68.field1118[0], 1, 0, false, 1, var68.field1119[0], 0, 2);

									if (var4 == 614) {
										field79.method4(230);
										field79.method6(field326[var67]);
									}

									if (var4 == 125) {
										field79.method4(101);
										field79.method6(field326[var67]);
									}

									var66 = true;
									break;
								}
							}

							if (!var66) {
								method89("Unable to find " + var65, "", 0);
							}
						}
					}

					if (var4 == 206) {
						QVUHZTUC var69 = field324[var5];
						if (var69 != null) {
							method138(field381.field1119[0], field381.field1118[0], 0, var69.field1118[0], 1, 0, false, 1, var69.field1119[0], 0, 2);
							field155 = field1376;
							field156 = field1377;
							field158 = 2;
							field157 = 0;
							field79.method4(6);
							field79.method6(var5);
							field79.method6(field447);
							field79.method6(field445);
							field79.method6(field446);
						}
					}

					if (var4 == 741) {
						boolean var70 = method138(field381.field1119[0], field381.field1118[0], 0, var2, 0, 0, false, 0, var3, 0, 2);
						if (!var70) {
							method138(field381.field1119[0], field381.field1118[0], 0, var2, 1, 0, false, 1, var3, 0, 2);
						}

						field155 = field1376;
						field156 = field1377;
						field158 = 2;
						field157 = 0;
						field79.method4(96);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5);
					}

					if (var4 == 765) {
						QVUHZTUC var72 = field324[var5];
						if (var72 != null) {
							method138(field381.field1119[0], field381.field1118[0], 0, var72.field1118[0], 1, 0, false, 1, var72.field1119[0], 0, 2);
							field155 = field1376;
							field156 = field1377;
							field158 = 2;
							field157 = 0;
							field79.method4(16);
							field79.method6(var5);
						}
					}

					if (var4 == 1521) {
						method106(var3, var2, var5);
						field79.method4(134);
						field79.method6(field258 + var2);
						field79.method6(field259 + var3);
						field79.method6(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 998) {
						field79.method4(2);
						field79.method6(var5);
						field79.method6(var2);
						field79.method6(var3);
						field270 = 0;
						field271 = var3;
						field272 = var2;
						field273 = 2;
						if (ETSIPTYG.field499[var3].field509 == field46) {
							field273 = 1;
						}

						if (ETSIPTYG.field499[var3].field509 == field380) {
							field273 = 3;
						}
					}

					field444 = 0;
					field138 = 0;
					field96 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIB)V")
	public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = JLNSJQDR.field885[var7];
			int var13 = JLNSJQDR.field886[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = JLNSJQDR.field885[var8];
			int var16 = JLNSJQDR.field886[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field359 = arg2 - var9;
		field360 = arg0 - var10;
		field361 = arg1 - var11;
		field362 = arg3;
		field363 = arg4;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method51(long arg0) {
		if (arg0 != 0L) {
			if (field159 >= 100 && field371 != 1) {
				method89("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field159 >= 200) {
				method89("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = PQGPOSRV.method463(PQGPOSRV.method460(arg0));
				for (int var4 = 0; var4 < field159; var4++) {
					if (field226[var4] == arg0) {
						method89(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field310; var5++) {
					if (field166[var5] == arg0) {
						method89("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field381.field1236)) {
					field121[field159] = var3;
					field226[field159] = arg0;
					field257[field159] = 0;
					field159++;
					field96 = true;
					field79.method4(54);
					field79.method11(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method52(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field341[var4] != null) {
				int var5 = field339[var4];
				int var6 = field203 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field340[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field65 == 0 || field65 == 1 && method41(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field381.field1236)) {
						if (field399 >= 1) {
							field216[field225] = "Report abuse @whi@" + var7;
							field432[field225] = 803;
							field225++;
						}

						field216[field225] = "Add ignore @whi@" + var7;
						field432[field225] = 266;
						field225++;
						field216[field225] = "Add friend @whi@" + var7;
						field432[field225] = 927;
						field225++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field126 == 0 && (var5 == 7 || field251 == 0 || field251 == 1 && method41(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field399 >= 1) {
							field216[field225] = "Report abuse @whi@" + var7;
							field432[field225] = 803;
							field225++;
						}

						field216[field225] = "Add ignore @whi@" + var7;
						field432[field225] = 266;
						field225++;
						field216[field225] = "Add friend @whi@" + var7;
						field432[field225] = 927;
						field225++;
					}

					var3++;
				}

				if (var5 == 4 && (field80 == 0 || field80 == 1 && method41(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field216[field225] = "Accept trade @whi@" + var7;
						field432[field225] = 614;
						field225++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field126 == 0 && field251 < 2) {
					var3++;
				}

				if (var5 == 8 && (field80 == 0 || field80 == 1 && method41(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field216[field225] = "Accept challenge @whi@" + var7;
						field432[field225] = 125;
						field225++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method53(boolean arg0) {
		for (int var2 = 0; var2 < field117; var2++) {
			HGVATLQF var3 = field116[field118[var2]];
			int var4 = (field118[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method297() && var3.field735.field1278 == arg0) {
				int var5 = var3.field1111 >> 7;
				int var6 = var3.field1112 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1105 == 1 && (var3.field1111 & 0x7F) == 0x40 && (var3.field1112 & 0x7F) == 0x40) {
						if (field191[var5][var6] == field416) {
							continue;
						}

						field191[var5][var6] = field416;
					}

					field207.method256((var3.field1105 - 1) * 64 + 60, var3, field98, var4, method94(var3.field1111, var3.field1112, field98), var3.field1113, var3.field1111, var3.field1112, var3.field1123);
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method54() {
		if (field55 == 0) {
			int var1 = field1359 / 2 - 80;
			int var2 = field1360 / 2 + 20;
			var2 += 20;
			if (field1375 == 1 && field1376 >= var1 - 75 && field1376 <= var1 + 75 && field1377 >= var2 - 20 && field1377 <= var2 + 20) {
				field55 = 3;
				field101 = 0;
			}

			int var3 = field1359 / 2 + 80;
			if (field1375 == 1 && field1376 >= var3 - 75 && field1376 <= var3 + 75 && field1377 >= var2 - 20 && field1377 <= var2 + 20) {
				field401 = "";
				field402 = "Enter your username & password.";
				field55 = 2;
				field101 = 0;
			}
		} else if (field55 == 2) {
			int var4 = field1360 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1375 == 1 && field1377 >= var4 - 15 && field1377 < var4) {
				field101 = 0;
			}

			var4 += 15;
			if (field1375 == 1 && field1377 >= var4 - 15 && field1377 < var4) {
				field101 = 1;
			}

			var4 += 15;
			int var5 = field1359 / 2 - 80;
			int var6 = field1360 / 2 + 50;
			var6 += 20;
			if (field1375 == 1 && field1376 >= var5 - 75 && field1376 <= var5 + 75 && field1377 >= var6 - 20 && field1377 <= var6 + 20) {
				field291 = 0;
				method97(field164, field165, false);

				if (field407) {
					return;
				}
			}

			int var7 = field1359 / 2 + 80;
			if (field1375 == 1 && field1376 >= var7 - 75 && field1376 <= var7 + 75 && field1377 >= var6 - 20 && field1377 <= var6 + 20) {
				field55 = 0;
				field164 = "";
				field165 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method512();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field100.length(); var10++) {
					if (var8 == field100.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field101 == 0) {
					if (var8 == 8 && field164.length() > 0) {
						field164 = field164.substring(0, field164.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field101 = 1;
					}

					if (var9) {
						field164 = field164 + (char) var8;
					}

					if (field164.length() > 12) {
						field164 = field164.substring(0, 12);
					}
				} else if (field101 == 1) {
					if (var8 == 8 && field165.length() > 0) {
						field165 = field165.substring(0, field165.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field101 = 0;
					}

					if (var9) {
						field165 = field165 + (char) var8;
					}

					if (field165.length() > 20) {
						field165 = field165.substring(0, 20);
					}
				}
			}
		} else if (field55 == 3) {
			int var11 = field1359 / 2;
			int var12 = field1360 / 2 + 50;
			var12 += 20;
			if (field1375 == 1 && field1376 >= var11 - 75 && field1376 <= var11 + 75 && field1377 >= var12 - 20 && field1377 <= var12 + 20) {
				field55 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LBJPWOXRJ;IILQVUHZTUC;I)V")
	public final void method55(BJPWOXRJ arg0, int arg1, QVUHZTUC arg2, int arg3) {
		if ((arg3 & 0x1) != 0) {
			int var5 = arg0.method15();
			byte[] var6 = new byte[var5];
			BJPWOXRJ var7 = new BJPWOXRJ(var6);
			arg0.method24(0, var6, var5);
			field329[arg1] = var7;
			arg2.method467(var7);
		}

		if ((arg3 & 0x2) != 0) {
			int var8 = arg0.method17();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field1132 == var8) {
				arg2.field1136 = 0;
			}

			int var9 = arg0.method15();
			if (arg2.field1132 == var8 && var8 != -1) {
				int var10 = OXBPHQKK.field1152[var8].field1166;
				if (var10 == 1) {
					arg2.field1133 = 0;
					arg2.field1134 = 0;
					arg2.field1135 = var9;
					arg2.field1136 = 0;
				}

				if (var10 == 2) {
					arg2.field1136 = 0;
				}
			} else if (var8 == -1 || arg2.field1132 == -1 || OXBPHQKK.field1152[var8].field1160 >= OXBPHQKK.field1152[arg2.field1132].field1160) {
				arg2.field1132 = var8;
				arg2.field1133 = 0;
				arg2.field1134 = 0;
				arg2.field1135 = var9;
				arg2.field1136 = 0;
				arg2.field1142 = arg2.field1139;
			}
		}

		if ((arg3 & 0x4) != 0) {
			arg2.field1122 = arg0.method17();
			if (arg2.field1122 == 0xFFFF) {
				arg2.field1122 = -1;
			}
		}

		if ((arg3 & 0x8) != 0) {
			arg2.field1098 = arg0.method22();
			if (arg2.field1098.charAt(0) == '~') {
				arg2.field1098 = arg2.field1098.substring(1);
				method89(arg2.field1098, arg2.field1236, 2);
			} else if (field381 == arg2) {
				method89(arg2.field1098, arg2.field1236, 2);
			}

			arg2.field1097 = 0;
			arg2.field1088 = 0;
			arg2.field1138 = 150;
		}

		if ((arg3 & 0x10) != 0) {
			int var11 = arg0.method15();
			int var12 = arg0.method15();
			arg2.method447(var12, field239, var11);
			arg2.field1114 = field239 + 300;
			arg2.field1115 = arg0.method15();
			arg2.field1116 = arg0.method15();
		}

		if ((arg3 & 0x20) != 0) {
			arg2.field1120 = arg0.method17();
			arg2.field1121 = arg0.method17();
		}

		if ((arg3 & 0x40) != 0) {
			int var13 = arg0.method17();
			int var14 = arg0.method15();
			int var15 = arg0.method15();
			int var16 = arg0.field5;

			if (arg2.field1236 != null && arg2.field1246) {
				long var17 = PQGPOSRV.method459(arg2.field1236);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field310; var20++) {
						if (field166[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field426 == 0) {
					try {
						field115.field5 = 0;
						arg0.method24(0, field115.field4, field211 - 4);
						String var21 = XMKPAVXA.method542(field115, var15);
						var21 = KMKDGUZT.method369(var21);
						arg2.field1098 = var21;
						arg2.field1097 = var13 >> 8;
						arg2.field1088 = var13 & 0xFF;
						arg2.field1138 = 150;

						if (var14 == 2 || var14 == 3) {
							method89(var21, "@cr2@" + arg2.field1236, 1);
						} else if (var14 == 1) {
							method89(var21, "@cr1@" + arg2.field1236, 1);
						} else {
							method89(var21, arg2.field1236, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field5 = var15 + var16;
		}

		if ((arg3 & 0x100) != 0) {
			arg2.field1099 = arg0.method17();
			int var23 = arg0.method20();
			arg2.field1103 = var23 >> 16;
			arg2.field1102 = (var23 & 0xFFFF) + field239;
			arg2.field1100 = 0;
			arg2.field1101 = 0;

			if (arg2.field1102 > field239) {
				arg2.field1100 = -1;
			}

			if (arg2.field1099 == 0xFFFF) {
				arg2.field1099 = -1;
			}
		}

		if ((arg3 & 0x200) != 0) {
			arg2.field1089 = arg0.method15();
			arg2.field1091 = arg0.method15();
			arg2.field1090 = arg0.method15();
			arg2.field1092 = arg0.method15();
			arg2.field1093 = arg0.method17() + field239;
			arg2.field1094 = arg0.method17() + field239;
			arg2.field1095 = arg0.method15();
			arg2.method448();
		}

		if ((arg3 & 0x400) != 0) {
			int var24 = arg0.method15();
			int var25 = arg0.method15();
			arg2.method447(var25, field239, var24);
			arg2.field1114 = field239 + 300;
			arg2.field1115 = arg0.method15();
			arg2.field1116 = arg0.method15();
		}
	}

	@ObfuscatedName("client.e(Z)Z")
	public final boolean method56() {
		if (field161 == null) {
			return false;
		}

		try {
			int var1 = field161.method320();
			if (var1 == 0) {
				return false;
			}

			if (field212 == -1) {
				field161.method321(field233.field4, 0, 1);
				field212 = field233.field4[0] & 0xFF;
				if (field64 != null) {
					field212 = field212 - field64.method203() & 0xFF;
				}

				field211 = BKTBGSOX.field18[field212];
				var1--;
			}

			if (field211 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field161.method321(field233.field4, 0, 1);
				field211 = field233.field4[0] & 0xFF;
				var1--;
			}

			if (field211 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field161.method321(field233.field4, 0, 2);
				field233.field5 = 0;
				field211 = field233.method17();
				var1 -= 2;
			}

			if (var1 < field211) {
				return false;
			}

			field233.field5 = 0;
			field161.method321(field233.field4, 0, field211);
			field213 = 0;
			field377 = field376;
			field376 = field375;
			field375 = field212;

			if (field212 == 105) {
				int var2 = field233.method15();
				int var3 = field233.method15();
				String var4 = field233.method22();
				if (var2 >= 1 && var2 <= 5) {
					if (var4.equalsIgnoreCase("null")) {
						var4 = null;
					}

					field424[var2 - 1] = var4;
					field425[var2 - 1] = var3 == 0;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 211) {
				field160 = field233.method15();
				field96 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 157) {
				field427 = field233.method15();
				field428 = field233.method15();
				field212 = -1;
				return true;
			}

			if (field212 == 83) {
				long var5 = field233.method21();
				int var7 = field233.method20();
				int var8 = field233.method15();
				boolean var9 = false;
				for (int var10 = 0; var10 < 100; var10++) {
					if (field149[var10] == var7) {
						var9 = true;
						break;
					}
				}

				if (var8 <= 1) {
					for (int var11 = 0; var11 < field310; var11++) {
						if (field166[var11] == var5) {
							var9 = true;
							break;
						}
					}
				}

				if (!var9 && field426 == 0) {
					try {
						field149[field32] = var7;
						field32 = (field32 + 1) % 100;
						String var12 = XMKPAVXA.method542(field233, field211 - 13);
						if (var8 != 3) {
							var12 = KMKDGUZT.method369(var12);
						}

						if (var8 == 2 || var8 == 3) {
							method89(var12, "@cr2@" + PQGPOSRV.method463(PQGPOSRV.method460(var5)), 7);
						} else if (var8 == 1) {
							method89(var12, "@cr1@" + PQGPOSRV.method463(PQGPOSRV.method460(var5)), 7);
						} else {
							method89(var12, PQGPOSRV.method463(PQGPOSRV.method460(var5)), 3);
						}
					} catch (Exception var170) {
						signlink.reporterror("cde1");
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 253) {
				if (field386 == 12) {
					field96 = true;
				}

				field151 = field233.method18();
				field212 = -1;
				return true;
			}

			if (field212 == 227) {
				for (int var14 = 0; var14 < field324.length; var14++) {
					if (field324[var14] != null) {
						field324[var14].field1132 = -1;
					}
				}

				for (int var15 = 0; var15 < field116.length; var15++) {
					if (field116[var15] != null) {
						field116[var15].field1132 = -1;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 28) {
				field423 = field233.method17() * 30;
				field212 = -1;
				return true;
			}

			if (field212 == 39) {
				field28 = false;

				for (int var16 = 0; var16 < 5; var16++) {
					field209[var16] = false;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 139) {
				int var17 = field233.method17();
				int var18 = field233.method17();
				ETSIPTYG.field499[var17].field475 = 2;
				ETSIPTYG.field499[var17].field476 = var18;
				field212 = -1;
				return true;
			}

			if (field212 == 9) {
				field96 = true;
				int var19 = field233.method17();
				ETSIPTYG var20 = ETSIPTYG.field499[var19];
				while (field233.field5 < field211) {
					int var21 = field233.method29();
					int var22 = field233.method17();
					int var23 = field233.method15();
					if (var23 == 255) {
						var23 = field233.method20();
					}

					if (var21 >= 0 && var21 < var20.field507.length) {
						var20.field507[var21] = var22;
						var20.field510[var21] = var23;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 44) {
				field178 = field233.method15();
				if (field386 == field178) {
					if (field178 == 3) {
						field386 = 1;
					} else {
						field386 = 3;
					}

					field96 = true;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 223) {
				field96 = true;
				int var24 = field233.method17();
				ETSIPTYG var25 = ETSIPTYG.field499[var24];
				int var26 = field233.method17();
				for (int var27 = 0; var27 < var26; var27++) {
					var25.field507[var27] = field233.method17();
					int var28 = field233.method15();
					if (var28 == 255) {
						var28 = field233.method20();
					}

					var25.field510[var27] = var28;
				}

				for (int var29 = var26; var29 < var25.field507.length; var29++) {
					var25.field507[var29] = 0;
					var25.field510[var29] = 0;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 23) {
				method159(field233, field211);
				field443 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 254) {
				field36 = field233.method17();
				field371 = field233.method15();
				field212 = -1;
				return true;
			}

			if (field212 == 193) {
				field65 = field233.method15();
				field251 = field233.method15();
				field80 = field233.method15();
				field304 = true;
				field125 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 216) {
				int var30 = field233.method17();
				int var31 = field233.method20();
				field127[var30] = var31;

				if (field41[var30] != var31) {
					field41[var30] = var31;
					method62(var30);
					field96 = true;

					if (field403 != -1) {
						field125 = true;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 202) {
				field96 = true;
				int var32 = field233.method15();
				int var33 = field233.method20();
				int var34 = field233.method15();
				field408[var32] = var33;
				field343[var32] = var34;
				field61[var32] = 1;
				for (int var35 = 0; var35 < 98; var35++) {
					if (var33 >= field206[var35]) {
						field61[var32] = var35 + 2;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 79) {
				int var36 = field233.method17();
				if (var36 == 0xFFFF) {
					var36 = -1;
				}

				if (field344 != var36 && field35 && !field337 && field88 == 0) {
					field364 = var36;
					field365 = true;
					field131.method190(2, field364);
				}

				field344 = var36;
				field212 = -1;
				return true;
			}

			if (field212 == 210) {
				int var37 = field233.method17();
				int var38 = field233.method17();
				if (field35 && !field337) {
					field364 = var37;
					field365 = false;
					field131.method190(2, field364);
					field88 = var38;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 35) {
				field28 = true;
				field293 = field233.method15();
				field294 = field233.method15();
				field295 = field233.method17();
				field296 = field233.method15();
				field297 = field233.method15();
				if (field297 >= 100) {
					field359 = field293 * 128 + 64;
					field361 = field294 * 128 + 64;
					field360 = method94(field359, field361, field98) - field295;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 92 || field212 == 192) {
				int var39 = field217;
				int var40 = field218;
				if (field212 == 92) {
					var39 = field233.method17();
					var40 = field233.method17();
				}

				if (field212 == 192) {
					var39 = field233.method17();
					var40 = field233.method17();
					field233.method25();

					for (int var41 = 0; var41 < 4; var41++) {
						for (int var42 = 0; var42 < 13; var42++) {
							for (int var43 = 0; var43 < 13; var43++) {
								int var44 = field233.method26(1);
								if (var44 == 1) {
									field342[var41][var42][var43] = field233.method26(26);
								} else {
									field342[var41][var42][var43] = -1;
								}
							}
						}
					}

					field233.method27();
				}

				if (field217 == var39 && field218 == var40 && field400 == 2) {
					field212 = -1;
					return true;
				}

				field217 = var39;
				field218 = var40;
				field258 = (field217 - 6) * 8;
				field259 = (field218 - 6) * 8;
				field229 = false;
				if ((field217 / 8 == 48 || field217 / 8 == 49) && field218 / 8 == 48) {
					field229 = true;
				}

				if (field217 / 8 == 48 && field218 / 8 == 148) {
					field229 = true;
				}

				field400 = 1;
				field309 = System.currentTimeMillis();
				field200.method545();
				field349.method432(257, 151, "Loading - please wait.", 0);
				field349.method432(256, 150, "Loading - please wait.", 0xFFFFFF);
				field200.method546(field1361, 4, 4);

				if (field212 == 92) {
					int var45 = 0;
					for (int var46 = (field217 - 6) / 8; var46 <= (field217 + 6) / 8; var46++) {
						for (int var47 = (field218 - 6) / 8; var47 <= (field218 + 6) / 8; var47++) {
							var45++;
						}
					}

					field30 = new byte[var45][];
					field43 = new byte[var45][];
					field301 = new int[var45];
					field302 = new int[var45];
					field303 = new int[var45];
					int var48 = 0;
					for (int var49 = (field217 - 6) / 8; var49 <= (field217 + 6) / 8; var49++) {
						for (int var50 = (field218 - 6) / 8; var50 <= (field218 + 6) / 8; var50++) {
							field301[var48] = (var49 << 8) + var50;

							if (field229 && (var50 == 49 || var50 == 149 || var50 == 147 || var49 == 50 || var49 == 49 && var50 == 47)) {
								field302[var48] = -1;
								field303[var48] = -1;
								var48++;
							} else {
								int var51 = field302[var48] = field131.method202(var49, var50, 0);
								if (var51 != -1) {
									field131.method190(3, var51);
								}

								int var52 = field303[var48] = field131.method202(var49, var50, 1);
								if (var52 != -1) {
									field131.method190(3, var52);
								}

								var48++;
							}
						}
					}
				}

				int var53 = field258 - field260;
				int var54 = field259 - field261;
				field260 = field258;
				field261 = field259;

				for (int var55 = 0; var55 < 16384; var55++) {
					HGVATLQF var56 = field116[var55];
					if (var56 != null) {
						for (int var57 = 0; var57 < 10; var57++) {
							var56.field1118[var57] -= var53;
							var56.field1119[var57] -= var54;
						}

						var56.field1111 -= var53 * 128;
						var56.field1112 -= var54 * 128;
					}
				}

				for (int var58 = 0; var58 < field322; var58++) {
					QVUHZTUC var59 = field324[var58];
					if (var59 != null) {
						for (int var60 = 0; var60 < 10; var60++) {
							var59.field1118[var60] -= var53;
							var59.field1119[var60] -= var54;
						}

						var59.field1111 -= var53 * 128;
						var59.field1112 -= var54 * 128;
					}
				}

				field443 = true;
				byte var61 = 0;
				byte var62 = 104;
				byte var63 = 1;
				if (var53 < 0) {
					var61 = 103;
					var62 = -1;
					var63 = -1;
				}

				byte var64 = 0;
				byte var65 = 104;
				byte var66 = 1;
				if (var54 < 0) {
					var64 = 103;
					var65 = -1;
					var66 = -1;
				}

				for (int var67 = var61; var67 != var62; var67 += var63) {
					for (int var68 = var64; var68 != var65; var68 += var66) {
						int var69 = var53 + var67;
						int var70 = var54 + var68;
						for (int var71 = 0; var71 < 4; var71++) {
							if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
								field135[var71][var67][var68] = field135[var71][var69][var70];
							} else {
								field135[var71][var67][var68] = null;
							}
						}
					}
				}

				for (WHUVIHKW var72 = (WHUVIHKW) field434.method471(); var72 != null; var72 = (WHUVIHKW) field434.method473()) {
					var72.field1415 -= var53;
					var72.field1416 -= var54;
					if (var72.field1415 < 0 || var72.field1416 < 0 || var72.field1415 >= 104 || var72.field1416 >= 104) {
						var72.method430();
					}
				}

				if (field368 != 0) {
					field368 -= var53;
					field369 -= var54;
				}

				field28 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 154) {
				field310 = field211 / 8;
				for (int var73 = 0; var73 < field310; var73++) {
					field166[var73] = field233.method21();
				}

				field212 = -1;
				return true;
			}

			if (field212 == 230) {
				int var74 = field233.method17();
				boolean var75 = field233.method15() == 1;
				ETSIPTYG.field499[var74].field490 = var75;
				field212 = -1;
				return true;
			}

			if (field212 == 81) {
				String var76 = field233.method22();
				if (var76.endsWith(":tradereq:")) {
					String var77 = var76.substring(0, var76.indexOf(":"));
					long var78 = PQGPOSRV.method459(var77);
					boolean var80 = false;
					for (int var81 = 0; var81 < field310; var81++) {
						if (field166[var81] == var78) {
							var80 = true;
							break;
						}
					}

					if (!var80 && field426 == 0) {
						method89("wishes to trade with you.", var77, 4);
					}
				} else if (var76.endsWith(":duelreq:")) {
					String var82 = var76.substring(0, var76.indexOf(":"));
					long var83 = PQGPOSRV.method459(var82);
					boolean var85 = false;
					for (int var86 = 0; var86 < field310; var86++) {
						if (field166[var86] == var83) {
							var85 = true;
							break;
						}
					}

					if (!var85 && field426 == 0) {
						method89("wishes to duel with you.", var82, 8);
					}
				} else if (var76.endsWith(":chalreq:")) {
					String var87 = var76.substring(0, var76.indexOf(":"));
					long var88 = PQGPOSRV.method459(var87);
					boolean var90 = false;
					for (int var91 = 0; var91 < field310; var91++) {
						if (field166[var91] == var88) {
							var90 = true;
							break;
						}
					}

					if (!var90 && field426 == 0) {
						String var92 = var76.substring(var76.indexOf(":") + 1, var76.length() - 9);
						method89(var92, var87, 8);
					}
				} else {
					method89(var76, "", 0);
				}

				field212 = -1;
				return true;
			}

			if (field212 == 244) {
				int var93 = field233.method17();
				int var94 = field233.method17();
				int var95 = field233.method17();

				if (var94 == 0xFFFF) {
					ETSIPTYG.field499[var93].field475 = 0;
					field212 = -1;
					return true;
				}

				LGNJKIJR var96 = LGNJKIJR.method409(var94);
				ETSIPTYG.field499[var93].field475 = 4;
				ETSIPTYG.field499[var93].field476 = var94;
				ETSIPTYG.field499[var93].field502 = var96.field1037;
				ETSIPTYG.field499[var93].field503 = var96.field1011;
				ETSIPTYG.field499[var93].field501 = var96.field1004 * 100 / var95;
				field212 = -1;
				return true;
			}

			if (field212 == 17) {
				int var97 = field233.method17();
				ETSIPTYG var98 = ETSIPTYG.field499[var97];
				for (int var99 = 0; var99 < var98.field507.length; var99++) {
					var98.field507[var99] = -1;
					var98.field507[var99] = 0;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 21) {
				int var100 = field233.method17();
				method173(var100);

				if (field262 != -1) {
					field262 = -1;
					field96 = true;
					field128 = true;
				}

				field380 = var100;
				field125 = true;
				field46 = -1;
				field53 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 97) {
				int var101 = field233.method17();
				ETSIPTYG.field499[var101].field475 = 3;

				if (field381.field1249 == null) {
					ETSIPTYG.field499[var101].field476 = (field381.field1235[11] << 5) + (field381.field1235[8] << 10) + (field381.field1235[0] << 15) + (field381.field1247[0] << 25) + (field381.field1247[4] << 20) + field381.field1235[1];
				} else {
					ETSIPTYG.field499[var101].field476 = (int) (field381.field1249.field1294 + 0x12345678L);
				}

				field212 = -1;
				return true;
			}

			if (field212 == 101) {
				if (field262 != -1) {
					field262 = -1;
					field96 = true;
					field128 = true;
				}

				if (field380 != -1) {
					field380 = -1;
					field125 = true;
				}

				if (field210) {
					field210 = false;
					field125 = true;
				}

				field46 = -1;
				field53 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 46) {
				int var102 = field233.method17();
				int var103 = field233.method17();
				ETSIPTYG.field499[var102].field475 = 1;
				ETSIPTYG.field499[var102].field476 = var103;
				field212 = -1;
				return true;
			}

			if (field212 == 174) {
				int var104 = field233.method18();
				field403 = var104;
				field125 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 103) {
				int var105 = field233.method17();
				String var106 = field233.method22();
				ETSIPTYG.field499[var105].field497 = var106;

				if (field167[field386] == ETSIPTYG.field499[var105].field509) {
					field96 = true;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 189) {
				int var107 = field233.method17();
				int var108 = field233.method17();

				if (field380 != -1) {
					field380 = -1;
					field125 = true;
				}

				if (field210) {
					field210 = false;
					field125 = true;
				}

				field46 = var107;
				field262 = var108;
				field96 = true;
				field128 = true;
				field53 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 82) {
				int var109 = field233.method17();
				int var110 = field233.method17();
				int var111 = field233.method17();
				int var112 = field233.method17();
				ETSIPTYG.field499[var109].field502 = var110;
				ETSIPTYG.field499[var109].field503 = var111;
				ETSIPTYG.field499[var109].field501 = var112;
				field212 = -1;
				return true;
			}

			if (field212 == 155) {
				field28 = true;
				field241 = field233.method15();
				field242 = field233.method15();
				field243 = field233.method17();
				field244 = field233.method15();
				field245 = field233.method15();
				if (field245 >= 100) {
					int var113 = field241 * 128 + 64;
					int var114 = field242 * 128 + 64;
					int var115 = method94(var113, var114, field98) - field243;
					int var116 = var113 - field359;
					int var117 = var115 - field360;
					int var118 = var114 - field361;
					int var119 = (int) Math.sqrt(var116 * var116 + var118 * var118);
					field362 = (int) (Math.atan2(var117, var119) * 325.949D) & 0x7FF;
					field363 = (int) (Math.atan2(var116, var118) * -325.949D) & 0x7FF;

					if (field362 < 128) {
						field362 = 128;
					}

					if (field362 > 383) {
						field362 = 383;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 176) {
				field427 = field233.method15();
				field428 = field233.method15();
				for (int var120 = field427; var120 < field427 + 8; var120++) {
					for (int var121 = field428; var121 < field428 + 8; var121++) {
						if (field135[field98][var120][var121] != null) {
							field135[field98][var120][var121] = null;
							method42(var120, var121);
						}
					}
				}

				for (WHUVIHKW var122 = (WHUVIHKW) field434.method471(); var122 != null; var122 = (WHUVIHKW) field434.method473()) {
					if (var122.field1415 >= field427 && var122.field1415 < field427 + 8 && var122.field1416 >= field428 && var122.field1416 < field428 + 8 && field98 == var122.field1413) {
						var122.field1420 = 0;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 246) {
				field34 = false;
				field210 = true;
				field72 = "";
				field125 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 187) {
				field83 = field233.method15();
				field212 = -1;
				return true;
			}

			if (field212 == 151) {
				field368 = 0;
				field212 = -1;
				return true;
			}

			if (field212 == 85) {
				int var123 = field233.method17();
				int var124 = field233.method18();
				int var125 = field233.method18();
				ETSIPTYG var126 = ETSIPTYG.field499[var123];
				var126.field500 = var124;
				var126.field504 = var125;
				field212 = -1;
				return true;
			}

			if (field212 == 247) {
				field386 = field233.method15();
				field96 = true;
				field128 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 16) {
				int var127 = field233.method17();
				method173(var127);

				if (field380 != -1) {
					field380 = -1;
					field125 = true;
				}

				if (field210) {
					field210 = false;
					field125 = true;
				}

				field262 = var127;
				field96 = true;
				field128 = true;
				field46 = -1;
				field53 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 235) {
				method169();
				field212 = -1;
				return false;
			}

			if (field212 == 169 || field212 == 242 || field212 == 222 || field212 == 107 || field212 == 104 || field212 == 90 || field212 == 110 || field212 == 147 || field212 == 1 || field212 == 141 || field212 == 133) {
				method140(field212, field233);
				field212 = -1;
				return true;
			}

			if (field212 == 215) {
				int var128 = field233.method17();
				int var129 = field233.method17();
				int var130 = var129 >> 10 & 0x1F;
				int var131 = var129 >> 5 & 0x1F;
				int var132 = var129 & 0x1F;
				ETSIPTYG.field499[var128].field536 = (var132 << 3) + (var130 << 19) + (var131 << 11);
				field212 = -1;
				return true;
			}

			if (field212 == 168) {
				int var133 = field233.method17();
				int var134 = field233.method15();
				int var135 = field233.method17();
				if (field231 && !field337 && field137 < 50) {
					field418[field137] = var133;
					field316[field137] = var134;
					field48[field137] = GQYCHOQW.field633[var133] + var135;
					field137++;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 69) {
				field427 = field233.method15();
				field428 = field233.method15();

				while (field233.field5 < field211) {
					int var136 = field233.method15();
					method140(var136, field233);
				}

				field212 = -1;
				return true;
			}

			if (field212 == 231) {
				field388 = field233.method20();
				field220 = field233.method17();
				field152 = field233.method15();
				field40 = field233.method17();
				field129 = field233.method15();
				if (field388 != 0 && field46 == -1) {
					signlink.dnslookup(PQGPOSRV.method462(field388));
					method98();
					short var137 = 650;
					if (field152 != 201 || field129 == 1) {
						var137 = 655;
					}

					field395 = "";
					field311 = false;

					for (int var138 = 0; var138 < ETSIPTYG.field499.length; var138++) {
						if (ETSIPTYG.field499[var138] != null && ETSIPTYG.field499[var138].field531 == var137) {
							field46 = ETSIPTYG.field499[var138].field509;
							break;
						}
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 99) {
				int var139 = field233.method17();
				method173(var139);

				if (field262 != -1) {
					field262 = -1;
					field96 = true;
					field128 = true;
				}

				if (field380 != -1) {
					field380 = -1;
					field125 = true;
				}

				if (field210) {
					field210 = false;
					field125 = true;
				}

				field46 = var139;
				field53 = false;
				field212 = -1;
				return true;
			}

			if (field212 == 11) {
				long var140 = field233.method21();
				int var142 = field233.method15();
				String var143 = PQGPOSRV.method463(PQGPOSRV.method460(var140));
				for (int var144 = 0; var144 < field159; var144++) {
					if (field226[var144] == var140) {
						if (field257[var144] != var142) {
							field257[var144] = var142;
							field96 = true;

							if (var142 > 0) {
								method89(var143 + " has logged in.", "", 5);
							}

							if (var142 == 0) {
								method89(var143 + " has logged out.", "", 5);
							}
						}

						var143 = null;
						break;
					}
				}

				if (var143 != null && field159 < 200) {
					field226[field159] = var140;
					field121[field159] = var143;
					field257[field159] = var142;
					field159++;
					field96 = true;
				}

				boolean var145 = false;
				while (!var145) {
					var145 = true;
					for (int var146 = 0; var146 < field159 - 1; var146++) {
						if (field257[var146] != field334 && field257[var146 + 1] == field334 || field257[var146] == 0 && field257[var146 + 1] != 0) {
							int var147 = field257[var146];
							field257[var146] = field257[var146 + 1];
							field257[var146 + 1] = var147;
							String var148 = field121[var146];
							field121[var146] = field121[var146 + 1];
							field121[var146 + 1] = var148;
							long var149 = field226[var146];
							field226[var146] = field226[var146 + 1];
							field226[var146 + 1] = var149;
							field96 = true;
							var145 = false;
						}
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 173) {
				int var151 = field233.method17();
				int var152 = field233.method18();
				ETSIPTYG var153 = ETSIPTYG.field499[var151];
				var153.field528 = var152;

				if (var152 == -1) {
					var153.field492 = 0;
					var153.field486 = 0;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 33) {
				for (int var154 = 0; var154 < field41.length; var154++) {
					if (field41[var154] != field127[var154]) {
						field41[var154] = field127[var154];
						method62(var154);
						field96 = true;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 219) {
				field87 = field233.method15();
				field212 = -1;
				return true;
			}

			if (field212 == 41) {
				int var155 = field233.method17();
				int var156 = field233.method15();

				if (var155 == 0xFFFF) {
					var155 = -1;
				}

				field167[var156] = var155;
				field96 = true;
				field128 = true;
				field212 = -1;
				return true;
			}

			if (field212 == 150) {
				field246 = field233.method15();
				if (field246 == 1) {
					field124 = field233.method17();
				}

				if (field246 >= 2 && field246 <= 6) {
					if (field246 == 2) {
						field392 = 64;
						field393 = 64;
					}

					if (field246 == 3) {
						field392 = 0;
						field393 = 64;
					}

					if (field246 == 4) {
						field392 = 128;
						field393 = 64;
					}

					if (field246 == 5) {
						field392 = 64;
						field393 = 0;
					}

					if (field246 == 6) {
						field392 = 64;
						field393 = 128;
					}

					field246 = 2;
					field389 = field233.method17();
					field390 = field233.method17();
					field391 = field233.method15();
				}

				if (field246 == 10) {
					field332 = field233.method17();
				}

				field212 = -1;
				return true;
			}

			if (field212 == 102) {
				int var157 = field233.method17();
				int var158 = field233.method17();
				ETSIPTYG var159 = ETSIPTYG.field499[var157];
				if (var159 != null && var159.field493 == 0) {
					if (var158 < 0) {
						var158 = 0;
					}

					if (var158 > var159.field473 - var159.field482) {
						var158 = var159.field473 - var159.field482;
					}

					var159.field522 = var158;
				}

				field212 = -1;
				return true;
			}

			if (field212 == 205) {
				int var160 = field233.method15();
				int var161 = field233.method15();
				int var162 = field233.method15();
				int var163 = field233.method15();
				field209[var160] = true;
				field196[var160] = var161;
				field250[var160] = var162;
				field119[var160] = var163;
				field248[var160] = 0;
				field212 = -1;
				return true;
			}

			if (field212 == 167) {
				method171(field211, field233);
				field212 = -1;
				return true;
			}

			if (field212 == 114) {
				int var164 = field233.method18();
				if (var164 >= 0) {
					method173(var164);
				}

				field247 = var164;
				field212 = -1;
				return true;
			}

			if (field212 == 70) {
				int var165 = field233.method17();
				byte var166 = field233.method16();
				field127[var165] = var166;

				if (field41[var165] != var166) {
					field41[var165] = var166;
					method62(var165);
					field96 = true;

					if (field403 != -1) {
						field125 = true;
					}
				}

				field212 = -1;
				return true;
			}

			if (field212 == 135) {
				if (field386 == 12) {
					field96 = true;
				}

				field77 = field233.method15();
				field212 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field212 + "," + field211 + " - " + field376 + "," + field377);
			method169();
		} catch (IOException var171) {
			method127();
		} catch (Exception var172) {
			String var168 = "T2 - " + field212 + "," + field376 + "," + field377 + " - " + field211 + "," + (field381.field1118[0] + field258) + "," + (field381.field1119[0] + field259) + " - ";
			for (int var169 = 0; var169 < field211 && var169 < 50; var169++) {
				var168 = var168 + field233.field4[var169] + ",";
			}

			signlink.reporterror(var168);
			method169();
		}

		return true;
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method57(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.h(I)V")
	public final void method58() {
		if (field188 == 0) {
			int var1 = field1375;
			if (field138 == 1 && field1376 >= 516 && field1377 >= 160 && field1376 <= 765 && field1377 <= 205) {
				var1 = 0;
			}

			if (field89) {
				if (var1 != 1) {
					int var2 = field1369;
					int var3 = field1370;
					if (field67 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field67 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field67 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field68 - 10 || var2 > field70 + field68 + 10 || var3 < field69 - 10 || var3 > field71 + field69 + 10) {
						field89 = false;

						if (field67 == 1) {
							field96 = true;
						}

						if (field67 == 2) {
							field125 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field68;
					int var5 = field69;
					int var6 = field70;
					int var7 = field1376;
					int var8 = field1377;
					if (field67 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field67 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field67 == 2) {
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
						method49(var9);
					}

					field89 = false;

					if (field67 == 1) {
						field96 = true;
					}

					if (field67 == 2) {
						field125 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field225 > 0) {
					int var12 = field432[field225 - 1];
					if (var12 == 222 || var12 == 472 || var12 == 381 || var12 == 628 || var12 == 502 || var12 == 615 || var12 == 998 || var12 == 934 || var12 == 86 || var12 == 275 || var12 == 606 || var12 == 1918) {
						int var13 = field430[field225 - 1];
						int var14 = field431[field225 - 1];
						ETSIPTYG var15 = ETSIPTYG.field499[var14];
						if (var15.field526 || var15.field483) {
							field232 = false;
							field50 = 0;
							field186 = var14;
							field187 = var13;
							field188 = 2;
							field189 = field1376;
							field190 = field1377;

							if (ETSIPTYG.field499[var14].field509 == field46) {
								field188 = 1;
							}

							if (ETSIPTYG.field499[var14].field509 == field380) {
								field188 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field81 == 1 || method113(field225 - 1)) && field225 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field225 > 0) {
					method49(field225 - 1);
				}

				if (var1 != 2 || field225 <= 0) {
					return;
				}

				method157();
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public static final void method59() {
		HFOJZUJK.field672 = true;
		FWQLREOO.field599 = true;
		field337 = true;
		SMJSOFHG.field1338 = true;
		KZRNPNVL.field973 = true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method60() {
		while (true) {
			UUFPGSJG var1 = field131.method197();
			if (var1 == null) {
				return;
			}

			if (var1.field1408 == 0) {
				JLNSJQDR.method326(var1.field1411, var1.field1410);

				if ((field131.method185(var1.field1410) & 0x62) != 0) {
					field96 = true;

					if (field380 != -1) {
						field125 = true;
					}
				}
			}

			if (var1.field1408 == 1 && var1.field1411 != null) {
				UIZESDZR.method521(var1.field1411);
			}

			if (var1.field1408 == 2 && field364 == var1.field1410 && var1.field1411 != null) {
				method120(field365, var1.field1411);
			}

			if (var1.field1408 == 3 && field400 == 1) {
				for (int var2 = 0; var2 < field30.length; var2++) {
					if (field302[var2] == var1.field1410) {
						field30[var2] = var1.field1411;

						if (var1.field1411 == null) {
							field302[var2] = -1;
						}

						break;
					}

					if (field303[var2] == var1.field1410) {
						field43[var2] = var1.field1411;

						if (var1.field1411 == null) {
							field303[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1408 == 93 && field131.method198(var1.field1410)) {
				SMJSOFHG.method493(field131, new BJPWOXRJ(var1.field1411));
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method61() {
		if (field87 == 0 && field1375 == 1) {
			int var1 = field1376 - 25 - 550;
			int var2 = field1377 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field74 + field58 & 0x7FF;
				int var4 = FWQLREOO.field608[var3];
				int var5 = FWQLREOO.field609[var3];
				var4 = (field146 + 256) * var4 >> 8;
				var5 = (field146 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field381.field1111 + var6 >> 7;
				int var9 = field381.field1112 - var7 >> 7;
				boolean var10 = method138(field381.field1119[0], field381.field1118[0], 0, var8, 0, 0, true, 0, var9, 0, 1);
				if (var10) {
					field79.method5(var1);
					field79.method5(var2);
					field79.method6(field74);
					field79.method5(57);
					field79.method5(field58);
					field79.method5(field146);
					field79.method5(89);
					field79.method6(field381.field1111);
					field79.method6(field381.field1112);
					field79.method5(field374);
					field79.method5(63);
				}
			}

			field315++;
			if (field315 > 1734) {
				field315 = 0;
				field79.method4(87);
				field79.method5(0);
				int var11 = field79.field5;

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method6(60300);
				}

				field79.method5(36);
				field79.method5(21);
				field79.method5((int) (Math.random() * 256.0D));
				field79.method6((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method6(2668);
				}

				field79.method5((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method6(3744);
				}

				field79.method5(150);
				field79.method6((int) (Math.random() * 65536.0D));
				field79.method14(field79.field5 - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method62(int arg0) {
		int var2 = JMEOMLFD.field890[arg0].field898;
		if (var2 != 0) {
			int var3 = field41[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					FWQLREOO.method215(0.9D);
				}

				if (var3 == 2) {
					FWQLREOO.method215(0.8D);
				}

				if (var3 == 3) {
					FWQLREOO.method215(0.7D);
				}

				if (var3 == 4) {
					FWQLREOO.method215(0.6D);
				}

				LGNJKIJR.field1031.method317();
				field347 = true;
			}

			if (var2 == 3) {
				boolean var4 = field35;

				if (var3 == 0) {
					method145(0, field35);
					field35 = true;
				}

				if (var3 == 1) {
					method145(-400, field35);
					field35 = true;
				}

				if (var3 == 2) {
					method145(-800, field35);
					field35 = true;
				}

				if (var3 == 3) {
					method145(-1200, field35);
					field35 = true;
				}

				if (var3 == 4) {
					field35 = false;
				}

				if (field35 != var4 && !field337) {
					if (field35) {
						field364 = field344;
						field365 = true;
						field131.method190(2, field364);
					} else {
						method35();
					}

					field88 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field231 = true;
					method34(0);
				}

				if (var3 == 1) {
					field231 = true;
					method34(-400);
				}

				if (var3 == 2) {
					field231 = true;
					method34(-800);
				}

				if (var3 == 3) {
					field231 = true;
					method34(-1200);
				}

				if (var3 == 4) {
					field231 = false;
				}
			}

			if (var2 == 5) {
				field81 = var3;
			}

			if (var2 == 6) {
				field82 = var3;
			}

			if (var2 == 8) {
				field126 = var3;
				field125 = true;
			}

			if (var2 == 9) {
				field105 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public final String method63(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.g(Z)Z")
	public final boolean method64() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IIILYZDAHXEQ;)V")
	public final void method65(int arg0, int arg1, YZDAHXEQ arg2) {
		int var4 = field74 + field58 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = JLNSJQDR.field885[var4];
			int var7 = JLNSJQDR.field886[var4];
			var6 = var6 * 256 / (field146 + 256);
			var7 = var7 * 256 / (field146 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method559(var8 + 94 + 4 - arg2.field1479 / 2, field306, 83 - var9 - arg2.field1480 / 2 - 4);
			} else {
				arg2.method553(var8 + 94 + 4 - arg2.field1479 / 2, 83 - var9 - arg2.field1480 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(ILBJPWOXRJ;Z)V")
	public final void method66(int arg0, BJPWOXRJ arg1) {
		for (int var3 = 0; var3 < field327; var3++) {
			int var4 = field328[var3];
			QVUHZTUC var5 = field324[var4];
			int var6 = arg1.method15();
			if ((var6 & 0x80) != 0) {
				var6 += arg1.method15() << 8;
			}

			method55(arg1, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method67() {
		field199.method545();

		if (field87 == 2) {
			byte[] var1 = field306.field1383;
			int[] var2 = GEFFBGXP.field622;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field404.method557(field52, 33, 33, 25, 256, field74, 0, 25, 0, field130);
			field200.method545();
		} else {
			int var5 = field74 + field58 & 0x7FF;
			int var6 = field381.field1111 / 32 + 48;
			int var7 = 464 - field381.field1112 / 32;
			field370.method557(field263, 146, 151, var6, field146 + 256, var5, 5, var7, 25, field44);
			field404.method557(field52, 33, 33, 25, 256, field74, 0, 25, 0, field130);

			for (int var8 = 0; var8 < field382; var8++) {
				int var9 = field383[var8] * 4 + 2 - field381.field1111 / 32;
				int var10 = field384[var8] * 4 + 2 - field381.field1112 / 32;
				method65(var9, var10, field60[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					RGZIHLRP var13 = field135[field98][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field381.field1111 / 32;
						int var15 = var12 * 4 + 2 - field381.field1112 / 32;
						method65(var14, var15, field252);
					}
				}
			}

			for (int var16 = 0; var16 < field117; var16++) {
				HGVATLQF var17 = field116[field118[var16]];
				if (var17 != null && var17.method297()) {
					RRZTMHXJ var18 = var17.field735;
					if (var18.field1283 != null) {
						var18 = var18.method487();
					}

					if (var18 != null && var18.field1301) {
						int var19 = var17.field1111 / 32 - field381.field1111 / 32;
						int var20 = var17.field1112 / 32 - field381.field1112 / 32;
						method65(var19, var20, field253);
					}
				}
			}

			for (int var21 = 0; var21 < field325; var21++) {
				QVUHZTUC var22 = field324[field326[var21]];
				if (var22 != null && var22.method297()) {
					int var23 = var22.field1111 / 32 - field381.field1111 / 32;
					int var24 = var22.field1112 / 32 - field381.field1112 / 32;
					boolean var25 = false;
					long var26 = PQGPOSRV.method459(var22.field1236);
					for (int var28 = 0; var28 < field159; var28++) {
						if (field226[var28] == var26 && field257[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field381.field1250 != 0 && var22.field1250 != 0 && field381.field1250 == var22.field1250) {
						var29 = true;
					}

					if (var25) {
						method65(var23, var24, field255);
					} else if (var29) {
						method65(var23, var24, field256);
					} else {
						method65(var23, var24, field254);
					}
				}
			}

			if (field246 != 0 && field239 % 20 < 10) {
				if (field246 == 1 && field124 >= 0 && field124 < field116.length) {
					HGVATLQF var30 = field116[field124];
					if (var30 != null) {
						int var31 = var30.field1111 / 32 - field381.field1111 / 32;
						int var32 = var30.field1112 / 32 - field381.field1112 / 32;
						method163(var31, field163, var32);
					}
				}

				if (field246 == 2) {
					int var33 = (field389 - field258) * 4 + 2 - field381.field1111 / 32;
					int var34 = (field390 - field259) * 4 + 2 - field381.field1112 / 32;
					method163(var33, field163, var34);
				}

				if (field246 == 10 && field332 >= 0 && field332 < field324.length) {
					QVUHZTUC var35 = field324[field332];
					if (var35 != null) {
						int var36 = var35.field1111 / 32 - field381.field1111 / 32;
						int var37 = var35.field1112 / 32 - field381.field1112 / 32;
						method163(var36, field163, var37);
					}
				}
			}

			if (field368 != 0) {
				int var38 = field368 * 4 + 2 - field381.field1111 / 32;
				int var39 = field369 * 4 + 2 - field381.field1112 / 32;
				method65(var38, var39, field162);
			}

			GEFFBGXP.method228(78, 3, 3, 97, 0xFFFFFF);
			field200.method545();
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method68() {
		method73();

		if (field158 == 1) {
			field93[field157 / 100].method553(field155 - 8 - 4, field156 - 8 - 4);
		}

		if (field158 == 2) {
			field93[field157 / 100 + 4].method553(field155 - 8 - 4, field156 - 8 - 4);
		}

		if (field247 != -1) {
			method128(field38, field247);
			method112(0, 0, 0, ETSIPTYG.field499[field247]);
		}

		if (field46 != -1) {
			method128(field38, field46);
			method112(0, 0, 0, ETSIPTYG.field499[field46]);
		}

		method105();

		if (!field89) {
			method132();
			method45();
		} else if (field67 == 0) {
			method122();
		}

		if (field83 == 1) {
			field222[1].method553(472, 296);
		}

		if (field94) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1357 < 15) {
				var3 = 0xFF0000;
			}

			field349.method431(var2, var1, "Fps:" + field1357, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field337) {
				int var7 = 0xFF0000;
			}

			field349.method431(var2, var1, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field423 != 0) {
			int var8 = field423 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field349.method436(0xFFFF00, 329, "System update in: " + var9 + ":0" + var8, 4);
			} else {
				field349.method436(0xFFFF00, 329, "System update in: " + var9 + ":" + var8, 4);
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method69() {
		field249 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field321[var1] = -1;
			for (int var2 = 0; var2 < RHGWIWMQ.field1267; var2++) {
				if (!RHGWIWMQ.field1268[var2].field1274 && RHGWIWMQ.field1268[var2].field1269 == var1 + (field436 ? 0 : 7)) {
					field321[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method70() {
		if (field1375 == 1) {
			if (field1376 >= 6 && field1376 <= 106 && field1377 >= 467 && field1377 <= 499) {
				field65 = (field65 + 1) % 4;
				field304 = true;
				field125 = true;
				field79.method4(23);
				field79.method5(field65);
				field79.method5(field251);
				field79.method5(field80);
			}

			if (field1376 >= 135 && field1376 <= 235 && field1377 >= 467 && field1377 <= 499) {
				field251 = (field251 + 1) % 3;
				field304 = true;
				field125 = true;
				field79.method4(23);
				field79.method5(field65);
				field79.method5(field251);
				field79.method5(field80);
			}

			if (field1376 >= 273 && field1376 <= 373 && field1377 >= 467 && field1377 <= 499) {
				field80 = (field80 + 1) % 3;
				field304 = true;
				field125 = true;
				field79.method4(23);
				field79.method5(field65);
				field79.method5(field251);
				field79.method5(field80);
			}

			if (field1376 >= 412 && field1376 <= 512 && field1377 >= 467 && field1377 <= 499) {
				if (field46 == -1) {
					method98();
					field395 = "";
					field311 = false;

					for (int var1 = 0; var1 < ETSIPTYG.field499.length; var1++) {
						if (ETSIPTYG.field499[var1] != null && ETSIPTYG.field499[var1].field531 == 600) {
							field31 = field46 = ETSIPTYG.field499[var1].field509;
							return;
						}
					}

					return;
				}

				method89("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method71() {
		while (true) {
			int var1 = method512();
			if (var1 == -1) {
				return;
			}

			if (field46 != -1 && field46 == field31) {
				if (var1 == 8 && field395.length() > 0) {
					field395 = field395.substring(0, field395.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field395.length() < 12) {
					field395 = field395 + (char) var1;
				}
			} else if (field34) {
				if (var1 >= 32 && var1 <= 122 && field136.length() < 80) {
					field136 = field136 + (char) var1;
					field125 = true;
				}

				if (var1 == 8 && field136.length() > 0) {
					field136 = field136.substring(0, field136.length() - 1);
					field125 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field34 = false;
					field125 = true;

					if (field268 == 1) {
						long var2 = PQGPOSRV.method459(field136);
						method51(var2);
					}

					if (field268 == 2 && field159 > 0) {
						long var4 = PQGPOSRV.method459(field136);
						method133(var4);
					}

					if (field268 == 3 && field136.length() > 0) {
						field79.method4(75);
						field79.method5(0);
						int var6 = field79.field5;
						field79.method11(field227);
						XMKPAVXA.method543(field79, field136);
						field79.method14(field79.field5 - var6);
						field136 = XMKPAVXA.method544(field136);
						field136 = KMKDGUZT.method369(field136);
						method89(field136, PQGPOSRV.method463(PQGPOSRV.method460(field227)), 6);

						if (field251 == 2) {
							field251 = 1;
							field304 = true;
							field79.method4(23);
							field79.method5(field65);
							field79.method5(field251);
							field79.method5(field80);
						}
					}

					if (field268 == 4 && field310 < 100) {
						long var7 = PQGPOSRV.method459(field136);
						method33(var7);
					}

					if (field268 == 5 && field310 > 0) {
						long var9 = PQGPOSRV.method459(field136);
						method72(var9);
					}
				}
			} else if (field210) {
				if (var1 >= 48 && var1 <= 57 && field72.length() < 10) {
					field72 = field72 + (char) var1;
					field125 = true;
				}

				if (var1 == 8 && field72.length() > 0) {
					field72 = field72.substring(0, field72.length() - 1);
					field125 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field72.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field72);
						} catch (Exception var18) {
						}

						field79.method4(135);
						field79.method9(var11);
					}

					field210 = false;
					field125 = true;
				}
			} else if (field380 == -1) {
				if (var1 >= 32 && var1 <= 122 && field373.length() < 80) {
					field373 = field373 + (char) var1;
					field125 = true;
				}

				if (var1 == 8 && field373.length() > 0) {
					field373 = field373.substring(0, field373.length() - 1);
					field125 = true;
				}

				if ((var1 == 13 || var1 == 10) && field373.length() > 0) {
					if (field399 == 2) {
						if (field373.equals("::clientdrop")) {
							method127();
						}

						if (field373.equals("::lag")) {
							method142();
						}

						if (field373.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field131.method186(2); var12++) {
								field131.method200(2, (byte) 1, var12);
							}
						}

						if (field373.equals("::fpson")) {
							field94 = true;
						}

						if (field373.equals("::fpsoff")) {
							field94 = false;
						}
					}

					if (field373.startsWith("::")) {
						field79.method4(128);
						field79.method5(field373.length() - 1);
						field79.method12(field373.substring(2));
					} else {
						String var13 = field373.toLowerCase();
						byte var14 = 0;
						if (var13.startsWith("yellow:")) {
							var14 = 0;
							field373 = field373.substring(7);
						} else if (var13.startsWith("red:")) {
							var14 = 1;
							field373 = field373.substring(4);
						} else if (var13.startsWith("green:")) {
							var14 = 2;
							field373 = field373.substring(6);
						} else if (var13.startsWith("cyan:")) {
							var14 = 3;
							field373 = field373.substring(5);
						} else if (var13.startsWith("purple:")) {
							var14 = 4;
							field373 = field373.substring(7);
						} else if (var13.startsWith("white:")) {
							var14 = 5;
							field373 = field373.substring(6);
						} else if (var13.startsWith("flash1:")) {
							var14 = 6;
							field373 = field373.substring(7);
						} else if (var13.startsWith("flash2:")) {
							var14 = 7;
							field373 = field373.substring(7);
						} else if (var13.startsWith("flash3:")) {
							var14 = 8;
							field373 = field373.substring(7);
						} else if (var13.startsWith("glow1:")) {
							var14 = 9;
							field373 = field373.substring(6);
						} else if (var13.startsWith("glow2:")) {
							var14 = 10;
							field373 = field373.substring(6);
						} else if (var13.startsWith("glow3:")) {
							var14 = 11;
							field373 = field373.substring(6);
						}

						String var15 = field373.toLowerCase();
						byte var16 = 0;
						if (var15.startsWith("wave:")) {
							var16 = 1;
							field373 = field373.substring(5);
						} else if (var15.startsWith("wave2:")) {
							var16 = 2;
							field373 = field373.substring(6);
						} else if (var15.startsWith("shake:")) {
							var16 = 3;
							field373 = field373.substring(6);
						} else if (var15.startsWith("scroll:")) {
							var16 = 4;
							field373 = field373.substring(7);
						} else if (var15.startsWith("slide:")) {
							var16 = 5;
							field373 = field373.substring(6);
						}

						field79.method4(202);
						field79.method5(0);
						int var17 = field79.field5;
						field79.method5(var14);
						field79.method5(var16);
						field115.field5 = 0;
						XMKPAVXA.method543(field115, field373);
						field79.method13(field115.field5, field115.field4, 0);
						field79.method14(field79.field5 - var17);
						field373 = XMKPAVXA.method544(field373);
						field373 = KMKDGUZT.method369(field373);
						field381.field1098 = field373;
						field381.field1097 = var14;
						field381.field1088 = var16;
						field381.field1138 = 150;

						if (field399 == 2) {
							method89(field381.field1098, "@cr2@" + field381.field1236, 2);
						} else if (field399 == 1) {
							method89(field381.field1098, "@cr1@" + field381.field1236, 2);
						} else {
							method89(field381.field1098, field381.field1236, 2);
						}

						if (field65 == 2) {
							field65 = 3;
							field304 = true;
							field79.method4(23);
							field79.method5(field65);
							field79.method5(field251);
							field79.method5(field80);
						}
					}

					field373 = "";
					field125 = true;
				}
			}
		}
	}

	public final void init() {
		field334 = Integer.parseInt(getParameter("nodeid"));
		field335 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method59();
		} else {
			method160();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field336 = false;
		} else {
			field336 = true;
		}

		method509(765, 503);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method72(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field310; var3++) {
				if (field166[var3] == arg0) {
					field310--;
					field96 = true;

					for (int var4 = var3; var4 < field310; var4++) {
						field166[var4] = field166[var4 + 1];
					}

					field79.method4(115);
					field79.method11(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method73() {
		if (field126 != 0) {
			NEJZODYM var1 = field349;
			int var2 = 0;
			if (field423 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field341[var3] != null) {
					int var4 = field339[var3];
					String var5 = field340[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field251 == 0 || field251 == 1 && method41(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method436(0, var7, "From", var8);
						var1.method436(0xFFFF, var7 - 1, "From", var8);
						int var11 = var8 + var1.method434("From ");
						if (var6 == 1) {
							field345[0].method518(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field345[1].method518(var11, var7 - 12);
							var11 += 14;
						}

						var1.method436(0, var7, var5 + ": " + field341[var3], var11);
						var1.method436(0xFFFF, var7 - 1, var5 + ": " + field341[var3], var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field251 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method436(0, var9, field341[var3], 4);
						var1.method436(0xFFFF, var9 - 1, field341[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field251 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method436(0, var10, "To " + var5 + ": " + field341[var3], 4);
						var1.method436(0xFFFF, var10 - 1, "To " + var5 + ": " + field341[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LBJPWOXRJ;ZI)V")
	public final void method74(BJPWOXRJ arg0, int arg1) {
		arg0.method25();
		int var3 = arg0.method26(8);
		if (var3 < field117) {
			for (int var4 = var3; var4 < field117; var4++) {
				field235[field234++] = field118[var4];
			}
		}

		if (var3 > field117) {
			signlink.reporterror(field164 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field117 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field118[var5];
			HGVATLQF var7 = field116[var6];
			int var8 = arg0.method26(1);
			if (var8 == 0) {
				field118[field117++] = var6;
				var7.field1106 = field239;
			} else {
				int var9 = arg0.method26(2);
				if (var9 == 0) {
					field118[field117++] = var6;
					var7.field1106 = field239;
					field328[field327++] = var6;
				} else if (var9 == 1) {
					field118[field117++] = var6;
					var7.field1106 = field239;
					int var10 = arg0.method26(3);
					var7.method449(false, var10);
					int var11 = arg0.method26(1);
					if (var11 == 1) {
						field328[field327++] = var6;
					}
				} else if (var9 == 2) {
					field118[field117++] = var6;
					var7.field1106 = field239;
					int var12 = arg0.method26(3);
					var7.method449(true, var12);
					int var13 = arg0.method26(3);
					var7.method449(true, var13);
					int var14 = arg0.method26(1);
					if (var14 == 1) {
						field328[field327++] = var6;
					}
				} else if (var9 == 3) {
					field235[field234++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method75() {
		field416++;
		method36(true);
		method53(true);
		method36(false);
		method53(false);
		method172();
		method124();

		if (!field28) {
			int var1 = field73;
			if (field379 / 256 > var1) {
				var1 = field379 / 256;
			}

			if (field209[4] && field250[4] + 128 > var1) {
				var1 = field250[4] + 128;
			}

			int var2 = field74 + field330 & 0x7FF;
			method50(method94(field381.field1111, field381.field1112, field98) - 50, field193, field192, var1, var2, var1 * 3 + 600);
		}

		int var3;
		if (field28) {
			var3 = method110();
		} else {
			var3 = method109();
		}

		int var4 = field359;
		int var5 = field360;
		int var6 = field361;
		int var7 = field362;
		int var8 = field363;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field209[var9]) {
				int var10 = (int) (Math.random() * (field196[var9] * 2 + 1) + Math.sin(field119[var9] / 100.0D * field248[var9]) * field250[var9] - field196[var9]);
				if (var9 == 0) {
					field359 += var10;
				}

				if (var9 == 1) {
					field360 += var10;
				}

				if (var9 == 2) {
					field361 += var10;
				}

				if (var9 == 3) {
					field363 = field363 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field362 += var10;
					if (field362 < 128) {
						field362 = 128;
					}

					if (field362 > 383) {
						field362 = 383;
					}
				}
			}
		}

		int var11 = FWQLREOO.field619;
		JLNSJQDR.field880 = true;
		JLNSJQDR.field883 = 0;
		JLNSJQDR.field881 = field1369 - 4;
		JLNSJQDR.field882 = field1370 - 4;
		GEFFBGXP.method226();
		field207.method284(var3, field359, field360, field362, field363, field361);
		field207.method259();
		method100();
		method102();
		method148(var11);
		method68();
		field200.method546(field1361, 4, 4);
		field359 = var4;
		field360 = var5;
		field361 = var6;
		field362 = var7;
		field363 = var8;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method76() {
		if (field1375 == 1) {
			if (field1376 >= 539 && field1376 <= 573 && field1377 >= 169 && field1377 < 205 && field167[0] != -1) {
				field96 = true;
				field386 = 0;
				field128 = true;
			}

			if (field1376 >= 569 && field1376 <= 599 && field1377 >= 168 && field1377 < 205 && field167[1] != -1) {
				field96 = true;
				field386 = 1;
				field128 = true;
			}

			if (field1376 >= 597 && field1376 <= 627 && field1377 >= 168 && field1377 < 205 && field167[2] != -1) {
				field96 = true;
				field386 = 2;
				field128 = true;
			}

			if (field1376 >= 625 && field1376 <= 669 && field1377 >= 168 && field1377 < 203 && field167[3] != -1) {
				field96 = true;
				field386 = 3;
				field128 = true;
			}

			if (field1376 >= 666 && field1376 <= 696 && field1377 >= 168 && field1377 < 205 && field167[4] != -1) {
				field96 = true;
				field386 = 4;
				field128 = true;
			}

			if (field1376 >= 694 && field1376 <= 724 && field1377 >= 168 && field1377 < 205 && field167[5] != -1) {
				field96 = true;
				field386 = 5;
				field128 = true;
			}

			if (field1376 >= 722 && field1376 <= 756 && field1377 >= 169 && field1377 < 205 && field167[6] != -1) {
				field96 = true;
				field386 = 6;
				field128 = true;
			}

			if (field1376 >= 540 && field1376 <= 574 && field1377 >= 466 && field1377 < 502 && field167[7] != -1) {
				field96 = true;
				field386 = 7;
				field128 = true;
			}

			if (field1376 >= 572 && field1376 <= 602 && field1377 >= 466 && field1377 < 503 && field167[8] != -1) {
				field96 = true;
				field386 = 8;
				field128 = true;
			}

			if (field1376 >= 599 && field1376 <= 629 && field1377 >= 466 && field1377 < 503 && field167[9] != -1) {
				field96 = true;
				field386 = 9;
				field128 = true;
			}

			if (field1376 >= 627 && field1376 <= 671 && field1377 >= 467 && field1377 < 502 && field167[10] != -1) {
				field96 = true;
				field386 = 10;
				field128 = true;
			}

			if (field1376 >= 669 && field1376 <= 699 && field1377 >= 466 && field1377 < 503 && field167[11] != -1) {
				field96 = true;
				field386 = 11;
				field128 = true;
			}

			if (field1376 >= 696 && field1376 <= 726 && field1377 >= 466 && field1377 < 503 && field167[12] != -1) {
				field96 = true;
				field386 = 12;
				field128 = true;
			}

			if (field1376 >= 724 && field1376 <= 758 && field1377 >= 466 && field1377 < 502 && field167[13] != -1) {
				field96 = true;
				field386 = 13;
				field128 = true;
				return;
			}
		}
	}

	public final void run() {
		if (field299) {
			method103();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method77() {
		int var1 = 5;
		field179[8] = 0;
		int var2 = 0;
		while (field179[8] == 0) {
			String var3 = "Unknown problem";
			method166("Connecting to web server", 20);

			try {
				DataInputStream var4 = method44("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 306);
				BJPWOXRJ var5 = new BJPWOXRJ(new byte[40]);
				var4.readFully(var5.field4, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field179[var6] = var5.method20();
				}

				int var7 = var5.method20();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field179[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field179[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field179[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field179[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field179[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field179[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method166("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method166(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field230 = !field230;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method78() {
		for (int var1 = 0; var1 < field117; var1++) {
			int var2 = field118[var1];
			HGVATLQF var3 = field116[var2];
			if (var3 != null) {
				method79(var3, var3.field735.field1290);
			}
		}
	}

	@ObfuscatedName("client.a(LNUUJCJXB;BI)V")
	public final void method79(NUUJCJXB arg0, int arg1) {
		if (arg0.field1111 < 128 || arg0.field1112 < 128 || arg0.field1111 >= 13184 || arg0.field1112 >= 13184) {
			arg0.field1132 = -1;
			arg0.field1099 = -1;
			arg0.field1093 = 0;
			arg0.field1094 = 0;
			arg0.field1111 = arg0.field1118[0] * 128 + arg0.field1105 * 64;
			arg0.field1112 = arg0.field1119[0] * 128 + arg0.field1105 * 64;
			arg0.method448();
		}

		if (field381 == arg0 && (arg0.field1111 < 1536 || arg0.field1112 < 1536 || arg0.field1111 >= 11776 || arg0.field1112 >= 11776)) {
			arg0.field1132 = -1;
			arg0.field1099 = -1;
			arg0.field1093 = 0;
			arg0.field1094 = 0;
			arg0.field1111 = arg0.field1118[0] * 128 + arg0.field1105 * 64;
			arg0.field1112 = arg0.field1119[0] * 128 + arg0.field1105 * 64;
			arg0.method448();
		}

		if (arg0.field1093 > field239) {
			method80(arg0);
		} else if (arg0.field1094 >= field239) {
			method81(arg0);
		} else {
			method82(arg0);
		}

		method83(arg0);
		method84(arg0);
	}

	@ObfuscatedName("client.a(LNUUJCJXB;Z)V")
	public final void method80(NUUJCJXB arg0) {
		int var2 = arg0.field1093 - field239;
		int var3 = arg0.field1105 * 64 + arg0.field1089 * 128;
		int var4 = arg0.field1105 * 64 + arg0.field1091 * 128;
		arg0.field1111 += (var3 - arg0.field1111) / var2;
		arg0.field1112 += (var4 - arg0.field1112) / var2;
		arg0.field1137 = 0;

		if (arg0.field1095 == 0) {
			arg0.field1096 = 1024;
		}

		if (arg0.field1095 == 1) {
			arg0.field1096 = 1536;
		}

		if (arg0.field1095 == 2) {
			arg0.field1096 = 0;
		}

		if (arg0.field1095 == 3) {
			arg0.field1096 = 512;
		}
	}

	@ObfuscatedName("client.a(ILNUUJCJXB;)V")
	public final void method81(NUUJCJXB arg0) {
		if (field239 == arg0.field1094 || arg0.field1132 == -1 || arg0.field1135 != 0 || arg0.field1134 + 1 > OXBPHQKK.field1152[arg0.field1132].method457(arg0.field1133)) {
			int var2 = arg0.field1094 - arg0.field1093;
			int var3 = field239 - arg0.field1093;
			int var4 = arg0.field1105 * 64 + arg0.field1089 * 128;
			int var5 = arg0.field1105 * 64 + arg0.field1091 * 128;
			int var6 = arg0.field1105 * 64 + arg0.field1090 * 128;
			int var7 = arg0.field1105 * 64 + arg0.field1092 * 128;
			arg0.field1111 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1112 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1137 = 0;

		if (arg0.field1095 == 0) {
			arg0.field1096 = 1024;
		}

		if (arg0.field1095 == 1) {
			arg0.field1096 = 1536;
		}

		if (arg0.field1095 == 2) {
			arg0.field1096 = 0;
		}

		if (arg0.field1095 == 3) {
			arg0.field1096 = 512;
		}

		arg0.field1113 = arg0.field1096;
	}

	@ObfuscatedName("client.b(LNUUJCJXB;Z)V")
	public final void method82(NUUJCJXB arg0) {
		arg0.field1124 = arg0.field1140;
		if (arg0.field1139 == 0) {
			arg0.field1137 = 0;
		} else {
			if (arg0.field1132 != -1 && arg0.field1135 == 0) {
				OXBPHQKK var2 = OXBPHQKK.field1152[arg0.field1132];
				if (arg0.field1142 > 0 && var2.field1164 == 0) {
					arg0.field1137++;
					return;
				}

				if (arg0.field1142 <= 0 && var2.field1165 == 0) {
					arg0.field1137++;
					return;
				}
			}

			int var3 = arg0.field1111;
			int var4 = arg0.field1112;
			int var5 = arg0.field1118[arg0.field1139 - 1] * 128 + arg0.field1105 * 64;
			int var6 = arg0.field1119[arg0.field1139 - 1] * 128 + arg0.field1105 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1096 = 1280;
					} else if (var4 > var6) {
						arg0.field1096 = 1792;
					} else {
						arg0.field1096 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1096 = 768;
					} else if (var4 > var6) {
						arg0.field1096 = 256;
					} else {
						arg0.field1096 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1096 = 1024;
				} else {
					arg0.field1096 = 0;
				}

				int var7 = arg0.field1096 - arg0.field1113 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1129;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1128;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1131;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1130;
				}

				if (var8 == -1) {
					var8 = arg0.field1128;
				}

				arg0.field1124 = var8;
				int var9 = 4;
				if (arg0.field1113 != arg0.field1096 && arg0.field1122 == -1 && arg0.field1117 != 0) {
					var9 = 2;
				}

				if (arg0.field1139 > 2) {
					var9 = 6;
				}

				if (arg0.field1139 > 3) {
					var9 = 8;
				}

				if (arg0.field1137 > 0 && arg0.field1139 > 1) {
					var9 = 8;
					arg0.field1137--;
				}

				if (arg0.field1127[arg0.field1139 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1128 == arg0.field1124 && arg0.field1104 != -1) {
					arg0.field1124 = arg0.field1104;
				}

				if (var3 < var5) {
					arg0.field1111 += var9;
					if (arg0.field1111 > var5) {
						arg0.field1111 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1111 -= var9;
					if (arg0.field1111 < var5) {
						arg0.field1111 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1112 += var9;
					if (arg0.field1112 > var6) {
						arg0.field1112 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1112 -= var9;
					if (arg0.field1112 < var6) {
						arg0.field1112 = var6;
					}
				}

				if (arg0.field1111 == var5 && arg0.field1112 == var6) {
					arg0.field1139--;

					if (arg0.field1142 > 0) {
						arg0.field1142--;
						return;
					}
				}
			} else {
				arg0.field1111 = var5;
				arg0.field1112 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LNUUJCJXB;I)V")
	public final void method83(NUUJCJXB arg0) {
		if (arg0.field1117 != 0) {
			if (arg0.field1122 != -1 && arg0.field1122 < 32768) {
				HGVATLQF var2 = field116[arg0.field1122];
				if (var2 != null) {
					int var3 = arg0.field1111 - var2.field1111;
					int var4 = arg0.field1112 - var2.field1112;
					if (var3 != 0 || var4 != 0) {
						arg0.field1096 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1122 >= 32768) {
				int var5 = arg0.field1122 - 32768;
				if (field36 == var5) {
					var5 = field323;
				}

				QVUHZTUC var6 = field324[var5];
				if (var6 != null) {
					int var7 = arg0.field1111 - var6.field1111;
					int var8 = arg0.field1112 - var6.field1112;
					if (var7 != 0 || var8 != 0) {
						arg0.field1096 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1120 != 0 || arg0.field1121 != 0) && (arg0.field1139 == 0 || arg0.field1137 > 0)) {
				int var9 = arg0.field1111 - (arg0.field1120 - field258 - field258) * 64;
				int var10 = arg0.field1112 - (arg0.field1121 - field259 - field259) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1096 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1120 = 0;
				arg0.field1121 = 0;
			}

			int var11 = arg0.field1096 - arg0.field1113 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1117 || var11 > 2048 - arg0.field1117) {
					arg0.field1113 = arg0.field1096;
				} else if (var11 > 1024) {
					arg0.field1113 -= arg0.field1117;
				} else {
					arg0.field1113 += arg0.field1117;
				}

				arg0.field1113 &= 0x7FF;
				if (arg0.field1140 == arg0.field1124 && arg0.field1113 != arg0.field1096) {
					if (arg0.field1141 != -1) {
						arg0.field1124 = arg0.field1141;
						return;
					}

					arg0.field1124 = arg0.field1128;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LNUUJCJXB;I)V")
	public final void method84(NUUJCJXB arg0) {
		arg0.field1123 = false;

		if (arg0.field1124 != -1) {
			OXBPHQKK var2 = OXBPHQKK.field1152[arg0.field1124];
			arg0.field1126++;
			if (arg0.field1125 < var2.field1153 && arg0.field1126 > var2.method457(arg0.field1125)) {
				arg0.field1126 = 0;
				arg0.field1125++;
			}

			if (arg0.field1125 >= var2.field1153) {
				arg0.field1126 = 0;
				arg0.field1125 = 0;
			}
		}

		if (arg0.field1099 != -1 && field239 >= arg0.field1102) {
			if (arg0.field1100 < 0) {
				arg0.field1100 = 0;
			}

			OXBPHQKK var3 = MKJLFPRH.field1051[arg0.field1099].field1055;
			arg0.field1101++;
			while (arg0.field1100 < var3.field1153 && arg0.field1101 > var3.method457(arg0.field1100)) {
				arg0.field1101 -= var3.method457(arg0.field1100);
				arg0.field1100++;
			}

			if (arg0.field1100 >= var3.field1153 && (arg0.field1100 < 0 || arg0.field1100 >= var3.field1153)) {
				arg0.field1099 = -1;
			}
		}

		if (arg0.field1132 != -1 && arg0.field1135 <= 1) {
			OXBPHQKK var4 = OXBPHQKK.field1152[arg0.field1132];
			if (var4.field1164 == 1 && arg0.field1142 > 0 && arg0.field1093 <= field239 && arg0.field1094 < field239) {
				arg0.field1135 = 1;
				return;
			}
		}

		if (arg0.field1132 != -1 && arg0.field1135 == 0) {
			OXBPHQKK var5 = OXBPHQKK.field1152[arg0.field1132];
			arg0.field1134++;
			while (arg0.field1133 < var5.field1153 && arg0.field1134 > var5.method457(arg0.field1133)) {
				arg0.field1134 -= var5.method457(arg0.field1133);
				arg0.field1133++;
			}

			if (arg0.field1133 >= var5.field1153) {
				arg0.field1133 -= var5.field1157;
				arg0.field1136++;
				if (arg0.field1136 >= var5.field1163) {
					arg0.field1132 = -1;
				}

				if (arg0.field1133 < 0 || arg0.field1133 >= var5.field1153) {
					arg0.field1132 = -1;
				}
			}

			arg0.field1123 = var5.field1159;
		}

		if (arg0.field1135 > 0) {
			arg0.field1135--;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method85() {
		if (field347) {
			field347 = false;
			field282.method546(field1361, 4, 0);
			field283.method546(field1361, 357, 0);
			field284.method546(field1361, 4, 722);
			field285.method546(field1361, 205, 743);
			field286.method546(field1361, 0, 0);
			field287.method546(field1361, 4, 516);
			field288.method546(field1361, 205, 516);
			field289.method546(field1361, 357, 496);
			field290.method546(field1361, 338, 0);
			field96 = true;
			field125 = true;
			field128 = true;
			field304 = true;

			if (field400 != 2) {
				field200.method546(field1361, 4, 4);
				field199.method546(field1361, 4, 550);
			}
		}

		if (field400 == 2) {
			method75();
		}

		if (field89 && field67 == 1) {
			field96 = true;
		}

		if (field262 != -1) {
			boolean var1 = method128(field38, field262);
			if (var1) {
				field96 = true;
			}
		}

		if (field273 == 2) {
			field96 = true;
		}

		if (field188 == 2) {
			field96 = true;
		}

		if (field96) {
			method111();
			field96 = false;
		}

		if (field380 == -1) {
			field281.field522 = field356 - field203 - 77;

			if (field1369 > 448 && field1369 < 560 && field1370 > 332) {
				method90(field1369 - 17, field1370 - 357, false, 77, 463, 0, field356, field281);
			}

			int var2 = field356 - field281.field522 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field356 - 77) {
				var2 = field356 - 77;
			}

			if (field203 != var2) {
				field203 = var2;
				field125 = true;
			}
		}

		if (field380 != -1) {
			boolean var3 = method128(field38, field380);
			if (var3) {
				field125 = true;
			}
		}

		if (field273 == 3) {
			field125 = true;
		}

		if (field188 == 3) {
			field125 = true;
		}

		if (field308 != null) {
			field125 = true;
		}

		if (field89 && field67 == 2) {
			field125 = true;
		}

		if (field125) {
			method126();
			field125 = false;
		}

		if (field400 == 2) {
			method67();
			field199.method546(field1361, 4, 550);
			field208++;
			if (field208 > 75) {
				field208 = 0;
				field79.method4(172);
			}
		}

		if (field178 != -1) {
			field128 = true;
		}

		if (field128) {
			if (field178 != -1 && field386 == field178) {
				field178 = -1;
				field79.method4(74);
				field79.method5(field386);
			}

			field128 = false;
			field319.method545();
			field86.method518(0, 0);

			if (field262 == -1) {
				if (field167[field386] != -1) {
					if (field386 == 0) {
						field275.method518(22, 10);
					}

					if (field386 == 1) {
						field276.method518(54, 8);
					}

					if (field386 == 2) {
						field276.method518(82, 8);
					}

					if (field386 == 3) {
						field277.method518(110, 8);
					}

					if (field386 == 4) {
						field279.method518(153, 8);
					}

					if (field386 == 5) {
						field279.method518(181, 8);
					}

					if (field386 == 6) {
						field278.method518(209, 9);
					}
				}

				if (field167[0] != -1 && (field178 != 0 || field239 % 20 < 10)) {
					field298[0].method518(29, 13);
				}

				if (field167[1] != -1 && (field178 != 1 || field239 % 20 < 10)) {
					field298[1].method518(53, 11);
				}

				if (field167[2] != -1 && (field178 != 2 || field239 % 20 < 10)) {
					field298[2].method518(82, 11);
				}

				if (field167[3] != -1 && (field178 != 3 || field239 % 20 < 10)) {
					field298[3].method518(115, 12);
				}

				if (field167[4] != -1 && (field178 != 4 || field239 % 20 < 10)) {
					field298[4].method518(153, 13);
				}

				if (field167[5] != -1 && (field178 != 5 || field239 % 20 < 10)) {
					field298[5].method518(180, 11);
				}

				if (field167[6] != -1 && (field178 != 6 || field239 % 20 < 10)) {
					field298[6].method518(208, 13);
				}
			}

			field319.method546(field1361, 160, 516);
			field318.method545();
			field85.method518(0, 0);

			if (field262 == -1) {
				if (field167[field386] != -1) {
					if (field386 == 7) {
						field180.method518(42, 0);
					}

					if (field386 == 8) {
						field181.method518(74, 0);
					}

					if (field386 == 9) {
						field181.method518(102, 0);
					}

					if (field386 == 10) {
						field182.method518(130, 1);
					}

					if (field386 == 11) {
						field184.method518(173, 0);
					}

					if (field386 == 12) {
						field184.method518(201, 0);
					}

					if (field386 == 13) {
						field183.method518(229, 0);
					}
				}

				if (field167[8] != -1 && (field178 != 8 || field239 % 20 < 10)) {
					field298[7].method518(74, 2);
				}

				if (field167[9] != -1 && (field178 != 9 || field239 % 20 < 10)) {
					field298[8].method518(102, 3);
				}

				if (field167[10] != -1 && (field178 != 10 || field239 % 20 < 10)) {
					field298[9].method518(137, 4);
				}

				if (field167[11] != -1 && (field178 != 11 || field239 % 20 < 10)) {
					field298[10].method518(174, 2);
				}

				if (field167[12] != -1 && (field178 != 12 || field239 % 20 < 10)) {
					field298[11].method518(201, 2);
				}

				if (field167[13] != -1 && (field178 != 13 || field239 % 20 < 10)) {
					field298[12].method518(226, 2);
				}
			}

			field318.method546(field1361, 466, 496);
			field200.method545();
		}

		if (field304) {
			field304 = false;
			field317.method545();
			field84.method518(0, 0);
			field349.method433(0xFFFFFF, "Public chat", 55, 28, true);

			if (field65 == 0) {
				field349.method433(0xFF00, "On", 55, 41, true);
			}

			if (field65 == 1) {
				field349.method433(0xFFFF00, "Friends", 55, 41, true);
			}

			if (field65 == 2) {
				field349.method433(0xFF0000, "Off", 55, 41, true);
			}

			if (field65 == 3) {
				field349.method433(0xFFFF, "Hide", 55, 41, true);
			}

			field349.method433(0xFFFFFF, "Private chat", 184, 28, true);

			if (field251 == 0) {
				field349.method433(0xFF00, "On", 184, 41, true);
			}

			if (field251 == 1) {
				field349.method433(0xFFFF00, "Friends", 184, 41, true);
			}

			if (field251 == 2) {
				field349.method433(0xFF0000, "Off", 184, 41, true);
			}

			field349.method433(0xFFFFFF, "Trade/compete", 324, 28, true);

			if (field80 == 0) {
				field349.method433(0xFF00, "On", 324, 41, true);
			}

			if (field80 == 1) {
				field349.method433(0xFFFF00, "Friends", 324, 41, true);
			}

			if (field80 == 2) {
				field349.method433(0xFF0000, "Off", 324, 41, true);
			}

			field349.method433(0xFFFFFF, "Report abuse", 458, 33, true);
			field317.method546(field1361, 453, 0);
			field200.method545();
		}

		field38 = 0;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field207.method271(arg0, arg1, arg3);
		if (var6 != 0) {
			int var7 = field207.method275(arg0, arg1, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field370.field1474;
			int var12 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			KZRNPNVL var14 = KZRNPNVL.method401(var13);
			if (var14.field983 == -1) {
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
				TKCVVLIT var15 = field45[var14.field983];
				if (var15 != null) {
					int var16 = (var14.field946 * 4 - var15.field1385) / 2;
					int var17 = (var14.field974 * 4 - var15.field1386) / 2;
					var15.method518(arg1 * 4 + var16 + 48, (104 - arg3 - var14.field974) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field207.method273(arg0, arg1, arg3);
		if (var18 != 0) {
			int var19 = field207.method275(arg0, arg1, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			KZRNPNVL var23 = KZRNPNVL.method401(var22);
			if (var23.field983 != -1) {
				TKCVVLIT var24 = field45[var23.field983];
				if (var24 != null) {
					int var25 = (var23.field946 * 4 - var24.field1385) / 2;
					int var26 = (var23.field974 * 4 - var24.field1386) / 2;
					var24.method518(arg1 * 4 + var25 + 48, (104 - arg3 - var23.field974) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field370.field1474;
				int var29 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field207.method274(arg0, arg1, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			KZRNPNVL var32 = KZRNPNVL.method401(var31);
			if (var32.field983 != -1) {
				TKCVVLIT var33 = field45[var32.field983];
				if (var33 != null) {
					int var34 = (var32.field946 * 4 - var33.field1385) / 2;
					int var35 = (var32.field974 * 4 - var33.field1386) / 2;
					var33.method518(arg1 * 4 + var34 + 48, (104 - arg3 - var32.field974) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILNUUJCJXB;)V")
	public final void method87(int arg0, NUUJCJXB arg1) {
		method88(arg0, arg1.field1112, arg1.field1111);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method88(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method94(arg2, arg1, field98) - arg0;
			arg2 -= field359;
			var4 -= field360;
			arg1 -= field361;
			int var5 = JLNSJQDR.field885[field362];
			int var6 = JLNSJQDR.field886[field362];
			int var7 = JLNSJQDR.field885[field363];
			int var8 = JLNSJQDR.field886[field363];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field421 = (var9 << 9) / arg1 + FWQLREOO.field604;
				field422 = (var11 << 9) / arg1 + FWQLREOO.field605;
			} else {
				field421 = -1;
				field422 = -1;
			}
		} else {
			field421 = -1;
			field422 = -1;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;BI)V")
	public final void method89(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field403 != -1) {
			field308 = arg0;
			field1375 = 0;
		}

		if (field380 == -1) {
			field125 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field339[var4] = field339[var4 - 1];
			field340[var4] = field340[var4 - 1];
			field341[var4] = field341[var4 - 1];
		}

		field339[0] = arg2;
		field340[0] = arg1;
		field341[0] = arg0;
	}

	@ObfuscatedName("client.a(IIIZIIIILETSIPTYG;)V")
	public final void method90(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, ETSIPTYG arg7) {
		if (field202) {
			field39 = 32;
		} else {
			field39 = 0;
		}

		field202 = false;
		if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg5 && arg1 < arg5 + 16) {
			arg7.field522 -= field224 * 4;

			if (arg2) {
				field96 = true;
				return;
			}
		} else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg3 + arg5 - 16 && arg1 < arg3 + arg5) {
			arg7.field522 += field224 * 4;

			if (arg2) {
				field96 = true;
				return;
			}
		} else if (arg0 >= arg4 - field39 && arg0 < arg4 + field39 + 16 && arg1 >= arg5 + 16 && arg1 < arg3 + arg5 - 16 && field224 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg5 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg7.field522 = (arg6 - arg3) * var10 / var11;

			if (arg2) {
				field96 = true;
			}

			field202 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method91() {
		short var1 = 256;

		if (field153 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field153 > 768) {
					field264[var2] = method118(field265[var2], 1024 - field153, field266[var2]);
				} else if (field153 > 256) {
					field264[var2] = field266[var2];
				} else {
					field264[var2] = method118(field266[var2], 256 - field153, field265[var2]);
				}
			}
		} else if (field154 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field154 > 768) {
					field264[var3] = method118(field265[var3], 1024 - field154, field267[var3]);
				} else if (field154 > 256) {
					field264[var3] = field267[var3];
				} else {
					field264[var3] = method118(field267[var3], 256 - field154, field265[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field264[var4] = field265[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field109.field1466[var5] = field144.field1474[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field143[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field441[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field264[var12];
					int var15 = field109.field1466[var7];
					field109.field1466[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field109.method546(field1361, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field110.field1466[var16] = field145.field1474[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field143[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field441[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field264[var23];
					int var26 = field110.field1466[var18];
					field110.field1466[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field110.method546(field1361, 0, 637);
	}

	@ObfuscatedName("client.a(BLTKCVVLIT;)V")
	public final void method92(TKCVVLIT arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field133.length; var3++) {
			field133[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field133[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field134[var9] = (field133[var9 - 1] + field133[var9 + 1] + field133[var9 - 128] + field133[var9 + 128]) / 4;
				}
			}

			int[] var10 = field133;
			field133 = field134;
			field134 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1386; var12++) {
				for (int var13 = 0; var13 < arg0.field1385; var13++) {
					if (arg0.field1383[var11++] != 0) {
						int var14 = var13 + arg0.field1387 + 16;
						int var15 = var12 + arg0.field1388 + 16;
						int var16 = (var15 << 7) + var14;
						field133[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILBJPWOXRJ;I)V")
	public final void method93(BJPWOXRJ arg0, int arg1) {
		while (arg0.field6 + 10 < arg1 * 8) {
			int var3 = arg0.method26(11);
			if (var3 == 2047) {
				break;
			}

			if (field324[var3] == null) {
				field324[var3] = new QVUHZTUC();
				if (field329[var3] != null) {
					field324[var3].method467(field329[var3]);
				}
			}

			field326[field325++] = var3;
			QVUHZTUC var4 = field324[var3];
			var4.field1106 = field239;
			int var5 = arg0.method26(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method26(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method26(1);
			int var8 = arg0.method26(1);
			if (var8 == 1) {
				field328[field327++] = var3;
			}

			var4.method450(field381.field1119[0] + var6, var7 == 1, field381.field1118[0] + var5);
		}

		arg0.method27();
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method94(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field333[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field51[var6][var4][var5] + field51[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field51[var6][var4][var5 + 1] + field51[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method95() {
		for (int var1 = 0; var1 < field137; var1++) {
			if (field48[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field418[var1] != field409 || field316[var1] != field240) {
						BJPWOXRJ var3 = GQYCHOQW.method236(field316[var1], field418[var1]);
						if (System.currentTimeMillis() + var3.field5 / 22 > field197 / 22 + field66) {
							field197 = var3.field5;
							field66 = System.currentTimeMillis();

							if (method40(var3.field5, var3.field4)) {
								field409 = field418[var1];
								field240 = field316[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method64()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field48[var1] != -5) {
					field48[var1] = -5;
				} else {
					field137--;
					for (int var5 = var1; var5 < field137; var5++) {
						field418[var5] = field418[var5 + 1];
						field316[var5] = field316[var5 + 1];
						field48[var5] = field48[var5 + 1];
					}

					var1--;
				}
			} else {
				field48[var1]--;
			}
		}

		if (field88 > 0) {
			field88 -= 20;
			if (field88 < 0) {
				field88 = 0;
			}

			if (field88 == 0 && field35 && !field337) {
				field364 = field344;
				field365 = true;
				field131.method190(2, field364);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method96(String arg0) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method97(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field401 = "";
				field402 = "Connecting to server...";
				method116(true);
			}

			field161 = new JHRYTWFZ(method129(field335 + 43594), this);
			long var4 = PQGPOSRV.method459(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field79.field5 = 0;
			field79.method5(14);
			field79.method5(var6);
			field161.method322(field79.field4, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field161.method319();
			}

			int var8 = field161.method319();
			int var9 = var8;

			if (var8 == 0) {
				field161.method321(field233.field4, 0, 8);
				field233.field5 = 0;
				field37 = field233.method21();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field37 >> 32), (int) field37 };
				field79.field5 = 0;
				field79.method5(10);
				field79.method9(var10[0]);
				field79.method9(var10[1]);
				field79.method9(var10[2]);
				field79.method9(var10[3]);
				field79.method9(signlink.uid);
				field79.method12(arg0);
				field79.method12(arg1);
				field79.method30(field438, field97);
				field42.field5 = 0;

				if (arg2) {
					field42.method5(18);
				} else {
					field42.method5(16);
				}

				field42.method5(field79.field5 + 36 + 1 + 1 + 2);
				field42.method5(255);
				field42.method6(306);
				field42.method5(field337 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field42.method9(field179[var11]);
				}

				field42.method13(field79.field5, field79.field4, 0);
				field79.field9 = new FMTLAPCJ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field64 = new FMTLAPCJ(var10);
				field161.method322(field42.field4, field42.field5, 0);
				var8 = field161.method319();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method97(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field399 = field161.method319();
				field358 = field161.method319() == 1;
				field429 = 0L;
				field372 = 0;
				field406.field1218 = 0;
				field1366 = true;
				field49 = true;
				field407 = true;
				field79.field5 = 0;
				field233.field5 = 0;
				field212 = -1;
				field375 = -1;
				field376 = -1;
				field377 = -1;
				field211 = 0;
				field213 = 0;
				field423 = 0;
				field215 = 0;
				field246 = 0;
				field225 = 0;
				field89 = false;
				field1367 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field341[var13] = null;
				}

				field444 = 0;
				field138 = 0;
				field400 = 0;
				field137 = 0;
				field412 = (int) (Math.random() * 100.0D) - 50;
				field62 = (int) (Math.random() * 110.0D) - 55;
				field330 = (int) (Math.random() * 80.0D) - 40;
				field58 = (int) (Math.random() * 120.0D) - 60;
				field146 = (int) (Math.random() * 30.0D) - 20;
				field74 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field87 = 0;
				field435 = -1;
				field368 = 0;
				field369 = 0;
				field325 = 0;
				field117 = 0;

				for (int var14 = 0; var14 < field322; var14++) {
					field324[var14] = null;
					field329[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field116[var15] = null;
				}

				field381 = field324[field323] = new QVUHZTUC();
				field91.method475();
				field269.method475();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field135[var16][var17][var18] = null;
						}
					}
				}

				field434 = new RGZIHLRP();
				field160 = 0;
				field159 = 0;
				field403 = -1;
				field380 = -1;
				field46 = -1;
				field262 = -1;
				field247 = -1;
				field53 = false;
				field386 = 3;
				field210 = false;
				field89 = false;
				field34 = false;
				field308 = null;
				field83 = 0;
				field178 = -1;
				field436 = true;
				method69();

				for (int var19 = 0; var19 < 5; var19++) {
					field387[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field424[var20] = null;
					field425[var20] = false;
				}

				field357 = 0;
				field47 = 0;
				field274 = 0;
				field99 = 0;
				field90 = 0;
				field440 = 0;
				method170();
			} else if (var8 == 3) {
				field401 = "";
				field402 = "Invalid username or password.";
			} else if (var8 == 4) {
				field401 = "Your account has been disabled.";
				field402 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field401 = "Your account is already logged in.";
				field402 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field401 = "RuneScape has been updated!";
				field402 = "Please reload this page.";
			} else if (var8 == 7) {
				field401 = "This world is full.";
				field402 = "Please use a different world.";
			} else if (var8 == 8) {
				field401 = "Unable to connect.";
				field402 = "Login server offline.";
			} else if (var8 == 9) {
				field401 = "Login limit exceeded.";
				field402 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field401 = "Unable to connect.";
				field402 = "Bad session id.";
			} else if (var8 == 11) {
				field402 = "Login server rejected session.";
				field402 = "Please try again.";
			} else if (var8 == 12) {
				field401 = "You need a members account to login to this world.";
				field402 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field401 = "Could not complete login.";
				field402 = "Please try using a different world.";
			} else if (var8 == 14) {
				field401 = "The server is being updated.";
				field402 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field407 = true;
				field79.field5 = 0;
				field233.field5 = 0;
				field212 = -1;
				field375 = -1;
				field376 = -1;
				field377 = -1;
				field211 = 0;
				field213 = 0;
				field423 = 0;
				field225 = 0;
				field89 = false;
				field309 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field401 = "Login attempts exceeded.";
				field402 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field401 = "You are standing in a members-only area.";
				field402 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field401 = "Invalid loginserver requested";
				field402 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field161.method319(); var21 >= 0; var21--) {
					field401 = "You have only just left another world";
					field402 = "Your profile will be transferred in: " + var21 + " seconds";
					method116(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method97(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field401 = "Unexpected server response";
				field402 = "Please try using a different world.";
			} else if (var9 != 0) {
				field401 = "No response from server";
				field402 = "Please try using a different world.";
			} else if (field291 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field291++;
				method97(arg0, arg1, arg2);
			} else {
				field401 = "No response from loginserver";
				field402 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field401 = "";
			field402 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method98() {
		field79.method4(148);

		if (field262 != -1) {
			field262 = -1;
			field96 = true;
			field53 = false;
			field128 = true;
		}

		if (field380 != -1) {
			field380 = -1;
			field125 = true;
			field53 = false;
		}

		field46 = -1;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method99() {
		Graphics var1 = method143().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method511(1);

		if (field142) {
			field92 = false;
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

		if (field150) {
			field92 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field449) {
			field92 = false;
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

	@ObfuscatedName("client.f(B)V")
	public final void method100() {
		field168 = 0;
		for (int var1 = -1; var1 < field325 + field117; var1++) {
			NUUJCJXB var2;
			if (var1 == -1) {
				var2 = field381;
			} else if (var1 < field325) {
				var2 = field324[field326[var1]];
			} else {
				var2 = field116[field118[var1 - field325]];
			}

			if (var2 != null && var2.method297()) {
				if (var2 instanceof HGVATLQF) {
					RRZTMHXJ var3 = ((HGVATLQF) var2).field735;
					if (var3.field1283 != null) {
						var3 = var3.method487();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field325) {
					RRZTMHXJ var7 = ((HGVATLQF) var2).field735;
					if (var7.field1280 >= 0 && var7.field1280 < field222.length) {
						method87(var2.field1110 + 15, var2);

						if (field421 > -1) {
							field222[var7.field1280].method553(field421 - 12, field422 - 30);
						}
					}

					if (field246 == 1 && field118[var1 - field325] == field124 && field239 % 20 < 10) {
						method87(var2.field1110 + 15, var2);

						if (field421 > -1) {
							field222[2].method553(field421 - 12, field422 - 28);
						}
					}
				} else {
					int var4 = 30;
					QVUHZTUC var5 = (QVUHZTUC) var2;
					if (var5.field1258 != 0) {
						method87(var2.field1110 + 15, var2);

						if (field421 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1258 & 1 << var6) != 0) {
									field222[var6].method553(field421 - 12, field422 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field246 == 10 && field326[var1] == field332) {
						method87(var2.field1110 + 15, var2);

						if (field421 > -1) {
							field222[7].method553(field421 - 12, field422 - var4);
						}
					}
				}

				if (var2.field1098 != null && (var1 >= field325 || field65 == 0 || field65 == 3 || field65 == 1 && method41(((QVUHZTUC) var2).field1236))) {
					method87(var2.field1110, var2);

					if (field421 > -1 && field168 < field169) {
						field173[field168] = field350.method435(var2.field1098) / 2;
						field172[field168] = field350.field1085;
						field170[field168] = field421;
						field171[field168] = field422;
						field174[field168] = var2.field1097;
						field175[field168] = var2.field1088;
						field176[field168] = var2.field1138;
						field177[field168++] = var2.field1098;

						if (field82 == 0 && var2.field1088 >= 1 && var2.field1088 <= 3) {
							field172[field168] += 10;
							field171[field168] += 5;
						}

						if (field82 == 0 && var2.field1088 == 4) {
							field173[field168] = 60;
						}

						if (field82 == 0 && var2.field1088 == 5) {
							field172[field168] += 5;
						}
					}
				}

				if (var2.field1114 > field239) {
					method87(var2.field1110 + 15, var2);

					if (field421 > -1) {
						int var8 = var2.field1115 * 30 / var2.field1116;
						if (var8 > 30) {
							var8 = 30;
						}

						GEFFBGXP.method228(field422 - 3, 5, var8, field421 - 15, 0xFF00);
						GEFFBGXP.method228(field422 - 3, 5, 30 - var8, field421 - 15 + var8, 0xFF0000);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1109[var9] > field239) {
						method87(var2.field1110 / 2, var2);

						if (field421 > -1) {
							if (var9 == 1) {
								field422 -= 20;
							}

							if (var9 == 2) {
								field421 -= 15;
								field422 -= 10;
							}

							if (var9 == 3) {
								field421 += 15;
								field422 -= 10;
							}

							field439[var2.field1108[var9]].method553(field421 - 12, field422 - 12);
							field348.method432(field421, field422 + 4, String.valueOf(var2.field1107[var9]), 0);
							field348.method432(field421 - 1, field422 + 3, String.valueOf(var2.field1107[var9]), 0xFFFFFF);
						}
					}
				}
			}
		}

		field132++;
		if (field132 > 1007) {
			field132 = 0;
			field79.method4(47);
			field79.method5(0);
			int var10 = field79.field5;
			field79.method6((int) (Math.random() * 65536.0D));
			field79.method6((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field79.method5(88);
			}

			field79.method6(42477);
			field79.method5(117);
			field79.method5(85);

			if ((int) (Math.random() * 2.0D) == 0) {
				field79.method6(14901);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field79.method5(77);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field79.method6(9441);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field79.method6(57204);
			}

			field79.method14(field79.field5 - var10);
		}

		for (int var11 = 0; var11 < field168; var11++) {
			int var12 = field170[var11];
			int var13 = field171[var11];
			int var14 = field173[var11];
			int var15 = field172[var11];
			boolean var16 = true;
			while (var16) {
				var16 = false;
				for (int var17 = 0; var17 < var11; var17++) {
					if (var13 + 2 > field171[var17] - field172[var17] && var13 - var15 < field171[var17] + 2 && var12 - var14 < field173[var17] + field170[var17] && var12 + var14 > field170[var17] - field173[var17] && field171[var17] - field172[var17] < var13) {
						var13 = field171[var17] - field172[var17];
						var16 = true;
					}
				}
			}

			field421 = field170[var11];
			field422 = field171[var11] = var13;
			String var18 = field177[var11];
			if (field82 == 0) {
				int var19 = 0xFFFF00;
				if (field174[var11] < 6) {
					var19 = field300[field174[var11]];
				}

				if (field174[var11] == 6) {
					var19 = field416 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field174[var11] == 7) {
					var19 = field416 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field174[var11] == 8) {
					var19 = field416 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field174[var11] == 9) {
					int var20 = 150 - field176[var11];
					if (var20 < 50) {
						var19 = var20 * 1280 + 0xFF0000;
					} else if (var20 < 100) {
						var19 = 0xFFFF00 - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var19 = (var20 - 100) * 5 + 0xFF00;
					}
				}

				if (field174[var11] == 10) {
					int var21 = 150 - field176[var11];
					if (var21 < 50) {
						var19 = var21 * 5 + 0xFF0000;
					} else if (var21 < 100) {
						var19 = 0xFF00FF - (var21 - 50) * 0x50000;
					} else if (var21 < 150) {
						var19 = (var21 - 100) * 0x50000 + 255 - (var21 - 100) * 5;
					}
				}

				if (field174[var11] == 11) {
					int var22 = 150 - field176[var11];
					if (var22 < 50) {
						var19 = 0xFFFFFF - var22 * 327685;
					} else if (var22 < 100) {
						var19 = (var22 - 50) * 327685 + 0xFF00;
					} else if (var22 < 150) {
						var19 = 0xFFFFFF - (var22 - 100) * 0x50000;
					}
				}

				if (field175[var11] == 0) {
					field350.method432(field421, field422 + 1, var18, 0);
					field350.method432(field421, field422, var18, var19);
				}

				if (field175[var11] == 1) {
					field350.method437(field422 + 1, var18, field421, field416, 0);
					field350.method437(field422, var18, field421, field416, var19);
				}

				if (field175[var11] == 2) {
					field350.method438(field421, field416, var18, field422 + 1, 0);
					field350.method438(field421, field416, var18, field422, var19);
				}

				if (field175[var11] == 3) {
					field350.method439(field421, 0, field416, field422 + 1, 150 - field176[var11], var18);
					field350.method439(field421, var19, field416, field422, 150 - field176[var11], var18);
				}

				if (field175[var11] == 4) {
					int var23 = field350.method435(var18);
					int var24 = (150 - field176[var11]) * (var23 + 100) / 150;
					GEFFBGXP.method225(334, field421 - 50, field421 + 50, 0);
					field350.method436(0, field422 + 1, var18, field421 + 50 - var24);
					field350.method436(var19, field422, var18, field421 + 50 - var24);
					GEFFBGXP.method224();
				}

				if (field175[var11] == 5) {
					int var25 = 150 - field176[var11];
					int var26 = 0;
					if (var25 < 25) {
						var26 = var25 - 25;
					} else if (var25 > 125) {
						var26 = var25 - 125;
					}

					GEFFBGXP.method225(field422 + 5, 0, 512, field422 - field350.field1085 - 1);
					field350.method432(field421, field422 + var26 + 1, var18, 0);
					field350.method432(field421, field422 + var26, var18, var19);
					GEFFBGXP.method224();
				}
			} else {
				field350.method432(field421, field422 + 1, var18, 0);
				field350.method432(field421, field422, var18, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method101() {
		if (field106 == null) {
			field1362 = null;
			field201 = null;
			field199 = null;
			field198 = null;
			field200 = null;
			field317 = null;
			field318 = null;
			field319 = null;
			field109 = new YOIXICCU(128, method143(), 265);
			GEFFBGXP.method226();
			field110 = new YOIXICCU(128, method143(), 265);
			GEFFBGXP.method226();
			field106 = new YOIXICCU(509, method143(), 171);
			GEFFBGXP.method226();
			field107 = new YOIXICCU(360, method143(), 132);
			GEFFBGXP.method226();
			field108 = new YOIXICCU(360, method143(), 200);
			GEFFBGXP.method226();
			field111 = new YOIXICCU(202, method143(), 238);
			GEFFBGXP.method226();
			field112 = new YOIXICCU(203, method143(), 238);
			GEFFBGXP.method226();
			field113 = new YOIXICCU(74, method143(), 94);
			GEFFBGXP.method226();
			field114 = new YOIXICCU(75, method143(), 94);
			GEFFBGXP.method226();

			if (field417 != null) {
				method155();
				method46();
			}

			field347 = true;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method102() {
		if (field246 == 2) {
			method88(field391 * 2, (field390 - field259 << 7) + field393, (field389 - field258 << 7) + field392);

			if (field421 > -1 && field239 % 20 < 10) {
				field222[2].method553(field421 - 12, field422 - 28);
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method103() {
		field437 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field92) {
				field292++;
				method141();
				method141();
				method91();
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

		field437 = false;
	}

	@ObfuscatedName("client.a(IILETSIPTYG;)I")
	public final int method104(int arg0, ETSIPTYG arg1) {
		if (arg1.field474 == null || arg0 >= arg1.field474.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field474[arg0];
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
					var8 = field343[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field61[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field408[var3[var5++]];
				}

				if (var7 == 4) {
					ETSIPTYG var10 = ETSIPTYG.field499[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < LGNJKIJR.field1003 && (!LGNJKIJR.method409(var11).field1030 || field336)) {
						for (int var12 = 0; var12 < var10.field507.length; var12++) {
							if (var11 + 1 == var10.field507[var12]) {
								var8 += var10.field510[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field41[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field206[field61[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field41[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field381.field1251;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < PXPQSCQI.field1223; var13++) {
						if (PXPQSCQI.field1225[var13]) {
							var8 += field61[var13];
						}
					}
				}

				if (var7 == 10) {
					ETSIPTYG var14 = ETSIPTYG.field499[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < LGNJKIJR.field1003 && (!LGNJKIJR.method409(var15).field1030 || field336)) {
						for (int var16 = 0; var16 < var14.field507.length; var16++) {
							if (var14.field507[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field77;
				}

				if (var7 == 12) {
					var8 = field151;
				}

				if (var7 == 13) {
					int var17 = field41[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					BUYMNSFH var20 = BUYMNSFH.field20[var19];
					int var21 = var20.field22;
					int var22 = var20.field23;
					int var23 = var20.field24;
					int var24 = field123[var23 - var22];
					var8 = field41[var21] >> var22 & var24;
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
					var8 = (field381.field1111 >> 7) + field258;
				}

				if (var7 == 19) {
					var8 = (field381.field1112 >> 7) + field259;
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

	@ObfuscatedName("client.x(I)V")
	public final void method105() {
		field426 = 0;
		int var1 = (field381.field1111 >> 7) + field258;
		int var2 = (field381.field1112 >> 7) + field259;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field426 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field426 = 1;
		}

		if (field426 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field426 = 0;
		}
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method106(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field207.method275(field98, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			KZRNPNVL var8 = KZRNPNVL.method401(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field946;
				var10 = var8.field974;
			} else {
				var9 = var8.field974;
				var10 = var8.field946;
			}

			int var11 = var8.field964;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method138(field381.field1119[0], field381.field1118[0], 0, arg1, var10, 0, false, var9, arg0, var11, 2);
		} else {
			method138(field381.field1119[0], field381.field1118[0], var6 + 1, arg1, 0, var7, false, 0, arg0, 0, 2);
		}

		field155 = field1376;
		field156 = field1377;
		field158 = 2;
		field157 = 0;
		return true;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;ILjava/lang/String;I)LMNPBQFWE;")
	public final MNPBQFWE method107(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field33[0] != null) {
				var6 = field33[0].method424(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field410.reset();
			field410.update(var6);
			int var8 = (int) field410.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new MNPBQFWE(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method166("Requesting " + arg3, arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method44(arg1 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				BJPWOXRJ var16 = new BJPWOXRJ(var15);
				var16.field5 = 3;
				int var17 = var16.method19() + 6;
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
						method166("Loading " + arg3 + " - " + var22 + "%", arg0);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field33[0] != null) {
						field33[0].method425(arg2, var6.length, var6);
					}
				} catch (Exception var28) {
					field33[0] = null;
				}

				if (var6 != null) {
					field410.reset();
					field410.update(var6);
					int var23 = (int) field410.getValue();
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
						method166("Game updated - please reload page", arg0);
						var25 = 10;
					} else {
						method166(var11 + " - Retrying in " + var25, arg0);
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

				field230 = !field230;
			}
		}

		return new MNPBQFWE(var6);
	}

	@ObfuscatedName("client.a(I)V")
	public final void method108() {
		if (!field449 && !field142 && !field150) {
			field239++;

			if (field407) {
				method154();
			} else {
				method54();
			}

			method60();
		}
	}

	@ObfuscatedName("client.y(I)I")
	public final int method109() {
		int var1 = 3;
		if (field362 < 310) {
			int var2 = field359 >> 7;
			int var3 = field361 >> 7;
			int var4 = field381.field1111 >> 7;
			int var5 = field381.field1112 >> 7;

			if ((field333[field98][var2][var3] & 0x4) != 0) {
				var1 = field98;
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

					if ((field333[field98][var2][var3] & 0x4) != 0) {
						var1 = field98;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field333[field98][var2][var3] & 0x4) != 0) {
							var1 = field98;
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

					if ((field333[field98][var2][var3] & 0x4) != 0) {
						var1 = field98;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field333[field98][var2][var3] & 0x4) != 0) {
							var1 = field98;
						}
					}
				}
			}
		}

		if ((field333[field98][field381.field1111 >> 7][field381.field1112 >> 7] & 0x4) != 0) {
			var1 = field98;
		}

		return var1;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method110() {
		int var1 = method94(field359, field361, field98);
		if (var1 - field360 < 800 && (field333[field98][field359 >> 7][field361 >> 7] & 0x4) != 0) {
			return field98;
		}

		return 3;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method111() {
		field198.method545();
		FWQLREOO.field610 = field237;
		field305.method518(0, 0);

		if (field262 != -1) {
			method112(0, 0, 0, ETSIPTYG.field499[field262]);
		} else if (field167[field386] != -1) {
			method112(0, 0, 0, ETSIPTYG.field499[field167[field386]]);
		}

		if (field89 && field67 == 1) {
			method122();
		}

		field198.method546(field1361, 205, 553);
		field200.method545();
		FWQLREOO.field610 = field238;
	}

	@ObfuscatedName("client.a(IIIILETSIPTYG;)V")
	public final void method112(int arg0, int arg1, int arg2, ETSIPTYG arg3) {
		if (arg3.field493 == 0 && arg3.field523 != null && (!arg3.field490 || field95 == arg3.field506 || field314 == arg3.field506 || field352 == arg3.field506)) {
			int var5 = GEFFBGXP.field627;
			int var6 = GEFFBGXP.field625;
			int var7 = GEFFBGXP.field628;
			int var8 = GEFFBGXP.field626;
			GEFFBGXP.method225(arg3.field482 + arg1, arg0, arg3.field524 + arg0, arg1);
			int var9 = arg3.field523.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field495[var10] + arg0;
				int var12 = arg3.field487[var10] + arg1 - arg2;
				ETSIPTYG var13 = ETSIPTYG.field499[arg3.field523[var10]];
				var11 += var13.field500;
				var12 += var13.field504;

				if (var13.field531 > 0) {
					method144(var13);
				}

				if (var13.field493 == 0) {
					if (var13.field522 > var13.field473 - var13.field482) {
						var13.field522 = var13.field473 - var13.field482;
					}

					if (var13.field522 < 0) {
						var13.field522 = 0;
					}

					method112(var11, var12, var13.field522, var13);

					if (var13.field473 > var13.field482) {
						method151(var13.field482, var13.field473, var12, var13.field524 + var11, var13.field522);
					}
				} else if (var13.field493 != 1) {
					if (var13.field493 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field482; var15++) {
							for (int var16 = 0; var16 < var13.field524; var16++) {
								int var17 = (var13.field517 + 32) * var16 + var11;
								int var18 = (var13.field535 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field498[var14];
									var18 += var13.field488[var14];
								}

								if (var13.field507[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field507[var14] - 1;
									if (var17 > GEFFBGXP.field627 - 32 && var17 < GEFFBGXP.field628 && var18 > GEFFBGXP.field625 - 32 && var18 < GEFFBGXP.field626 || field188 != 0 && field187 == var14) {
										int var22 = 0;
										if (field444 == 1 && field445 == var14 && field446 == var13.field506) {
											var22 = 0xFFFFFF;
										}

										YZDAHXEQ var23 = LGNJKIJR.method419(var22, var13.field510[var14], var21);
										if (var23 != null) {
											if (field188 != 0 && field187 == var14 && field186 == var13.field506) {
												var19 = field1369 - field189;
												var20 = field1370 - field190;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field50 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method555(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < GEFFBGXP.field625 && arg3.field522 > 0) {
													int var24 = (GEFFBGXP.field625 - var18 - var20) * field38 / 3;
													if (var24 > field38 * 10) {
														var24 = field38 * 10;
													}

													if (var24 > arg3.field522) {
														var24 = arg3.field522;
													}

													arg3.field522 -= var24;
													field190 += var24;
												}

												if (var18 + var20 + 32 > GEFFBGXP.field626 && arg3.field522 < arg3.field473 - arg3.field482) {
													int var25 = (var18 + var20 + 32 - GEFFBGXP.field626) * field38 / 3;
													if (var25 > field38 * 10) {
														var25 = field38 * 10;
													}

													if (var25 > arg3.field473 - arg3.field482 - arg3.field522) {
														var25 = arg3.field473 - arg3.field482 - arg3.field522;
													}

													arg3.field522 += var25;
													field190 -= var25;
												}
											} else if (field273 != 0 && field272 == var14 && field271 == var13.field506) {
												var23.method555(var17, var18, 128);
											} else {
												var23.method553(var17, var18);
											}

											if (var23.field1479 == 33 || var13.field510[var14] != 1) {
												int var26 = var13.field510[var14];
												field348.method436(0, var18 + var20 + 10, method57(var26), var17 + var19 + 1);
												field348.method436(0xFFFF00, var18 + var20 + 9, method57(var26), var17 + var19);
											}
										}
									}
								} else if (var13.field485 != null && var14 < 20) {
									YZDAHXEQ var27 = var13.field485[var14];
									if (var27 != null) {
										var27.method553(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field493 == 3) {
						boolean var28 = false;
						if (field352 == var13.field506 || field314 == var13.field506 || field95 == var13.field506) {
							var28 = true;
						}

						int var29;
						if (method165(var13)) {
							var29 = var13.field494;
							if (var28 && var13.field491 != 0) {
								var29 = var13.field491;
							}
						} else {
							var29 = var13.field536;
							if (var28 && var13.field511 != 0) {
								var29 = var13.field511;
							}
						}

						if (var13.field496 == 0) {
							if (var13.field512) {
								GEFFBGXP.method228(var12, var13.field482, var13.field524, var11, var29);
							} else {
								GEFFBGXP.method229(var11, var13.field482, var13.field524, var12, var29);
							}
						} else if (var13.field512) {
							GEFFBGXP.method227(var13.field482, var29, var12, var11, 256 - (var13.field496 & 0xFF), var13.field524);
						} else {
							GEFFBGXP.method230(var13.field524, var11, var12, var13.field482, 256 - (var13.field496 & 0xFF), var29);
						}
					} else if (var13.field493 == 4) {
						NEJZODYM var30 = var13.field514;
						String var31 = var13.field497;
						boolean var32 = false;
						if (field352 == var13.field506 || field314 == var13.field506 || field95 == var13.field506) {
							var32 = true;
						}

						int var33;
						if (method165(var13)) {
							var33 = var13.field494;
							if (var32 && var13.field491 != 0) {
								var33 = var13.field491;
							}

							if (var13.field481.length() > 0) {
								var31 = var13.field481;
							}
						} else {
							var33 = var13.field536;
							if (var32 && var13.field511 != 0) {
								var33 = var13.field511;
							}
						}

						if (var13.field530 == 6 && field53) {
							var31 = "Please wait...";
							var33 = var13.field536;
						}

						if (GEFFBGXP.field623 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1085 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method63(method104(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method63(method104(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method63(method104(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method63(method104(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method63(method104(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field516) {
								var30.method433(var33, var41, var13.field524 / 2 + var11, var34, var13.field484);
							} else {
								var30.method440(var41, var34, var33, var11, var13.field484);
							}

							var34 += var30.field1085;
						}
					} else if (var13.field493 == 5) {
						YZDAHXEQ var42;
						if (method165(var13)) {
							var42 = var13.field508;
						} else {
							var42 = var13.field532;
						}

						if (var42 != null) {
							var42.method553(var11, var12);
						}
					} else if (var13.field493 == 6) {
						int var43 = FWQLREOO.field604;
						int var44 = FWQLREOO.field605;
						FWQLREOO.field604 = var13.field524 / 2 + var11;
						FWQLREOO.field605 = var13.field482 / 2 + var12;
						int var45 = FWQLREOO.field608[var13.field502] * var13.field501 >> 16;
						int var46 = FWQLREOO.field609[var13.field502] * var13.field501 >> 16;
						boolean var47 = method165(var13);
						int var48;
						if (var47) {
							var48 = var13.field529;
						} else {
							var48 = var13.field528;
						}

						JLNSJQDR var49;
						if (var48 == -1) {
							var49 = var13.method180(var47, -1, -1);
						} else {
							OXBPHQKK var50 = OXBPHQKK.field1152[var48];
							var49 = var13.method180(var47, var50.field1154[var13.field492], var50.field1155[var13.field492]);
						}

						if (var49 != null) {
							var49.method348(0, var13.field503, 0, var13.field502, 0, var45, var46);
						}

						FWQLREOO.field604 = var43;
						FWQLREOO.field605 = var44;
					} else if (var13.field493 == 7) {
						NEJZODYM var51 = var13.field514;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field482; var53++) {
							for (int var54 = 0; var54 < var13.field524; var54++) {
								if (var13.field507[var52] > 0) {
									LGNJKIJR var55 = LGNJKIJR.method409(var13.field507[var52] - 1);
									String var56 = var55.field1012;
									if (var55.field1036 || var13.field510[var52] != 1) {
										var56 = var56 + " x" + method123(var13.field510[var52]);
									}

									int var57 = (var13.field517 + 115) * var54 + var11;
									int var58 = (var13.field535 + 12) * var53 + var12;
									if (var13.field516) {
										var51.method433(var13.field536, var56, var13.field524 / 2 + var57, var58, var13.field484);
									} else {
										var51.method440(var56, var58, var13.field536, var57, var13.field484);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			GEFFBGXP.method225(var8, var5, var7, var6);
		}
	}

	@ObfuscatedName("client.a(IZ)Z")
	public final boolean method113(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field432[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 927) {
			return true;
		}

		return false;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method114() {
		if (field444 == 0 && field138 == 0) {
			field216[field225] = "Walk here";
			field432[field225] = 762;
			field430[field225] = field1369;
			field431[field225] = field1370;
			field225++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < JLNSJQDR.field883; var2++) {
			int var3 = JLNSJQDR.field884[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field207.method275(field98, var4, var5, var3) >= 0) {
					KZRNPNVL var8 = KZRNPNVL.method401(var7);
					if (var8.field945 != null) {
						var8 = var8.method397();
					}

					if (var8 == null) {
						continue;
					}

					if (field444 == 1) {
						field216[field225] = "Use " + field448 + " with @cya@" + var8.field972;
						field432[field225] = 680;
						field433[field225] = var3;
						field430[field225] = var4;
						field431[field225] = var5;
						field225++;
					} else if (field138 != 1) {
						if (var8.field950 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field950[var9] != null) {
									field216[field225] = var8.field950[var9] + " @cya@" + var8.field972;

									if (var9 == 0) {
										field432[field225] = 447;
									}

									if (var9 == 1) {
										field432[field225] = 147;
									}

									if (var9 == 2) {
										field432[field225] = 473;
									}

									if (var9 == 3) {
										field432[field225] = 945;
									}

									if (var9 == 4) {
										field432[field225] = 1521;
									}

									field433[field225] = var3;
									field430[field225] = var4;
									field431[field225] = var5;
									field225++;
								}
							}
						}

						field216[field225] = "Examine @cya@" + var8.field972;
						field432[field225] = 1132;
						field433[field225] = var8.field962 << 14;
						field430[field225] = var4;
						field431[field225] = var5;
						field225++;
					} else if ((field140 & 0x4) == 4) {
						field216[field225] = field141 + " @cya@" + var8.field972;
						field432[field225] = 505;
						field433[field225] = var3;
						field430[field225] = var4;
						field431[field225] = var5;
						field225++;
					}
				}

				if (var6 == 1) {
					HGVATLQF var10 = field116[var7];
					if (var10.field735.field1290 == 1 && (var10.field1111 & 0x7F) == 0x40 && (var10.field1112 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field117; var11++) {
							HGVATLQF var12 = field116[field118[var11]];
							if (var12 != null && var10 != var12 && var12.field735.field1290 == 1 && var10.field1111 == var12.field1111 && var10.field1112 == var12.field1112) {
								method43(field118[var11], var5, var12.field735, var4);
							}
						}

						for (int var13 = 0; var13 < field325; var13++) {
							QVUHZTUC var14 = field324[field326[var13]];
							if (var14 != null && var10.field1111 == var14.field1111 && var10.field1112 == var14.field1112) {
								method139(var4, field326[var13], var14, var5);
							}
						}
					}

					method43(var7, var5, var10.field735, var4);
				}

				if (var6 == 0) {
					QVUHZTUC var15 = field324[var7];
					if ((var15.field1111 & 0x7F) == 0x40 && (var15.field1112 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field117; var16++) {
							HGVATLQF var17 = field116[field118[var16]];
							if (var17 != null && var17.field735.field1290 == 1 && var15.field1111 == var17.field1111 && var15.field1112 == var17.field1112) {
								method43(field118[var16], var5, var17.field735, var4);
							}
						}

						for (int var18 = 0; var18 < field325; var18++) {
							QVUHZTUC var19 = field324[field326[var18]];
							if (var19 != null && var15 != var19 && var15.field1111 == var19.field1111 && var15.field1112 == var19.field1112) {
								method139(var4, field326[var18], var19, var5);
							}
						}
					}

					method139(var4, var7, var15, var5);
				}

				if (var6 == 3) {
					RGZIHLRP var20 = field135[field98][var4][var5];
					if (var20 != null) {
						for (YSIOSDRV var21 = (YSIOSDRV) var20.method472(); var21 != null; var21 = (YSIOSDRV) var20.method474()) {
							LGNJKIJR var22 = LGNJKIJR.method409(var21.field1472);
							if (field444 == 1) {
								field216[field225] = "Use " + field448 + " with @lre@" + var22.field1012;
								field432[field225] = 109;
								field433[field225] = var21.field1472;
								field430[field225] = var4;
								field431[field225] = var5;
								field225++;
							} else if (field138 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1023 != null && var22.field1023[var23] != null) {
										field216[field225] = var22.field1023[var23] + " @lre@" + var22.field1012;

										if (var23 == 0) {
											field432[field225] = 454;
										}

										if (var23 == 1) {
											field432[field225] = 511;
										}

										if (var23 == 2) {
											field432[field225] = 848;
										}

										if (var23 == 3) {
											field432[field225] = 512;
										}

										if (var23 == 4) {
											field432[field225] = 741;
										}

										field433[field225] = var21.field1472;
										field430[field225] = var4;
										field431[field225] = var5;
										field225++;
									} else if (var23 == 2) {
										field216[field225] = "Take @lre@" + var22.field1012;
										field432[field225] = 848;
										field433[field225] = var21.field1472;
										field430[field225] = var4;
										field431[field225] = var5;
										field225++;
									}
								}

								field216[field225] = "Examine @lre@" + var22.field1012;
								field432[field225] = 1515;
								field433[field225] = var21.field1472;
								field430[field225] = var4;
								field431[field225] = var5;
								field225++;
							} else if ((field140 & 0x1) == 1) {
								field216[field225] = field141 + " @lre@" + var22.field1012;
								field432[field225] = 51;
								field433[field225] = var21.field1472;
								field430[field225] = var4;
								field431[field225] = var5;
								field225++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method115(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method115(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method116(boolean arg0) {
		method101();
		field108.method545();
		field103.method518(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field55 == 0) {
			int var4 = var3 / 2 + 80;
			field348.method433(0x75A9A9, field131.field549, var2 / 2, var4, true);
			int var5 = var3 / 2 - 20;
			field350.method433(0xFFFF00, "Welcome to RuneScape", var2 / 2, var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field104.method518(var6 - 73, var7 - 20);
			field350.method433(0xFFFFFF, "New User", var6, var7 + 5, true);
			int var8 = var2 / 2 + 80;
			field104.method518(var8 - 73, var7 - 20);
			field350.method433(0xFFFFFF, "Existing User", var8, var7 + 5, true);
		}

		if (field55 == 2) {
			int var9 = var3 / 2 - 40;
			if (field401.length() > 0) {
				field350.method433(0xFFFF00, field401, var2 / 2, var9 - 15, true);
				field350.method433(0xFFFF00, field402, var2 / 2, var9, true);
				var9 += 30;
			} else {
				field350.method433(0xFFFF00, field402, var2 / 2, var9 - 7, true);
				var9 += 30;
			}

			field350.method440("Username: " + field164 + (field101 == 0 & field239 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 90, true);
			var9 += 15;
			field350.method440("Password: " + PQGPOSRV.method464(field165) + (field101 == 1 & field239 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 88, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field104.method518(var10 - 73, var11 - 20);
				field350.method433(0xFFFFFF, "Login", var10, var11 + 5, true);
				int var12 = var2 / 2 + 80;
				field104.method518(var12 - 73, var11 - 20);
				field350.method433(0xFFFFFF, "Cancel", var12, var11 + 5, true);
			}
		}

		if (field55 == 3) {
			field350.method433(0xFFFF00, "Create a free account", var2 / 2, var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			field350.method433(0xFFFFFF, "To create a new account you need to", var2 / 2, var13, true);
			var13 += 15;
			field350.method433(0xFFFFFF, "go back to the main RuneScape webpage", var2 / 2, var13, true);
			var13 += 15;
			field350.method433(0xFFFFFF, "and choose the red 'create account'", var2 / 2, var13, true);
			var13 += 15;
			field350.method433(0xFFFFFF, "button at the top right of that page.", var2 / 2, var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field104.method518(var14 - 73, var15 - 20);
			field350.method433(0xFFFFFF, "Cancel", var14, var15 + 5, true);
		}

		field108.method546(field1361, 171, 202);

		if (field347) {
			field347 = false;
			field106.method546(field1361, 0, 128);
			field107.method546(field1361, 371, 202);
			field111.method546(field1361, 265, 0);
			field112.method546(field1361, 265, 562);
			field113.method546(field1361, 171, 128);
			field114.method546(field1361, 171, 562);
		}
	}

	@ObfuscatedName("client.b(ILBJPWOXRJ;I)V")
	public final void method117(int arg0, BJPWOXRJ arg1) {
		arg1.method25();
		int var3 = arg1.method26(1);
		if (var3 != 0) {
			int var4 = arg1.method26(2);
			if (var4 == 0) {
				field328[field327++] = field323;
			} else if (var4 == 1) {
				int var5 = arg1.method26(3);
				field381.method449(false, var5);
				int var6 = arg1.method26(1);
				if (var6 == 1) {
					field328[field327++] = field323;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method26(3);
				field381.method449(true, var7);
				int var8 = arg1.method26(3);
				field381.method449(true, var8);
				int var9 = arg1.method26(1);
				if (var9 == 1) {
					field328[field327++] = field323;
				}
			} else if (var4 == 3) {
				field98 = arg1.method26(2);
				int var10 = arg1.method26(7);
				int var11 = arg1.method26(7);
				int var12 = arg1.method26(1);
				int var13 = arg1.method26(1);
				if (var13 == 1) {
					field328[field327++] = field323;
				}

				field381.method450(var11, var12 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.d(IIII)I")
	public final int method118(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method119() {
		if (field449 || field142 || field150) {
			method99();
		} else {
			field405++;

			if (field407) {
				method85();
			} else {
				method116(false);
			}

			field224 = 0;
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method120(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.b(I)V")
	public final void method121() {
		signlink.reporterror = false;

		try {
			if (field161 != null) {
				field161.method318();
			}
		} catch (Exception var1) {
		}

		field161 = null;
		method35();

		if (field406 != null) {
			field406.field1220 = false;
		}

		field406 = null;
		field131.method196();
		field131 = null;
		field115 = null;
		field79 = null;
		field42 = null;
		field233 = null;
		field301 = null;
		field30 = null;
		field43 = null;
		field302 = null;
		field303 = null;
		field51 = null;
		field333 = null;
		field207 = null;
		field29 = null;
		field385 = null;
		field185 = null;
		field353 = null;
		field354 = null;
		field338 = null;
		field198 = null;
		field199 = null;
		field200 = null;
		field201 = null;
		field317 = null;
		field318 = null;
		field319 = null;
		field282 = null;
		field283 = null;
		field284 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field290 = null;
		field305 = null;
		field306 = null;
		field307 = null;
		field84 = null;
		field85 = null;
		field86 = null;
		field298 = null;
		field275 = null;
		field276 = null;
		field277 = null;
		field278 = null;
		field279 = null;
		field180 = null;
		field181 = null;
		field182 = null;
		field183 = null;
		field184 = null;
		field404 = null;
		field439 = null;
		field222 = null;
		field93 = null;
		field252 = null;
		field253 = null;
		field254 = null;
		field255 = null;
		field256 = null;
		field45 = null;
		field396 = null;
		field191 = null;
		field324 = null;
		field326 = null;
		field328 = null;
		field329 = null;
		field235 = null;
		field116 = null;
		field118 = null;
		field135 = null;
		field434 = null;
		field91 = null;
		field269 = null;
		field430 = null;
		field431 = null;
		field432 = null;
		field433 = null;
		field216 = null;
		field41 = null;
		field383 = null;
		field384 = null;
		field60 = null;
		field370 = null;
		field121 = null;
		field226 = null;
		field257 = null;
		field109 = null;
		field110 = null;
		field106 = null;
		field107 = null;
		field108 = null;
		field111 = null;
		field112 = null;
		field113 = null;
		field114 = null;
		method136();
		KZRNPNVL.method399();
		RRZTMHXJ.method484();
		LGNJKIJR.method415();
		KJOXMCRE.field905 = null;
		RHGWIWMQ.field1268 = null;
		ETSIPTYG.field499 = null;
		LKJWPPXY.field1040 = null;
		OXBPHQKK.field1152 = null;
		MKJLFPRH.field1051 = null;
		MKJLFPRH.field1063 = null;
		JMEOMLFD.field890 = null;
		field1362 = null;
		QVUHZTUC.field1237 = null;
		FWQLREOO.method206();
		HFOJZUJK.method244();
		JLNSJQDR.method324();
		UIZESDZR.method522();
		System.gc();
	}

	@ObfuscatedName("client.h(B)V")
	public final void method122() {
		int var1 = field68;
		int var2 = field69;
		int var3 = field70;
		int var4 = field71;
		int var5 = 0x5D5447;
		GEFFBGXP.method228(var2, var4, var3, var1, var5);
		GEFFBGXP.method228(var2 + 1, 16, var3 - 2, var1 + 1, 0);
		GEFFBGXP.method229(var1 + 1, var4 - 19, var3 - 2, var2 + 18, 0);
		field350.method436(var5, var2 + 14, "Choose Option", var1 + 3);
		int var6 = field1369;
		int var7 = field1370;
		if (field67 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field67 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field67 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field225; var8++) {
			int var9 = (field225 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field350.method440(field216[var8], var9, var10, var1 + 3, true);
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method123(int arg0) {
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

	@ObfuscatedName("client.B(I)V")
	public final void method124() {
		for (GRLQOIQT var1 = (GRLQOIQT) field269.method471(); var1 != null; var1 = (GRLQOIQT) field269.method473()) {
			if (field98 != var1.field642 || var1.field641) {
				var1.method430();
			} else if (field239 >= var1.field639) {
				var1.method241(field38);

				if (var1.field641) {
					var1.method430();
				} else {
					field207.method256(60, var1, var1.field642, -1, var1.field645, 0, var1.field643, var1.field644, false);
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method125() {
		if (field126 != 0) {
			int var1 = 0;
			if (field423 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field341[var2] != null) {
					int var3 = field339[var2];
					String var4 = field340[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field251 == 0 || field251 == 1 && method41(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1369 > 4 && field1370 - 4 > var8 - 10 && field1370 - 4 <= var8 + 3) {
							int var9 = field349.method434("From:  " + var4 + field341[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1369 < var9 + 4) {
								if (field399 >= 1) {
									field216[field225] = "Report abuse @whi@" + var4;
									field432[field225] = 2803;
									field225++;
								}

								field216[field225] = "Add ignore @whi@" + var4;
								field432[field225] = 2266;
								field225++;
								field216[field225] = "Add friend @whi@" + var4;
								field432[field225] = 2927;
								field225++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field251 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method126() {
		field201.method545();
		FWQLREOO.field610 = field236;
		field307.method518(0, 0);

		if (field34) {
			field350.method432(239, 40, field419, 0);
			field350.method432(239, 60, field136 + "*", 128);
		} else if (field210) {
			field350.method432(239, 40, "Enter amount:", 0);
			field350.method432(239, 60, field72 + "*", 128);
		} else if (field308 != null) {
			field350.method432(239, 40, field308, 0);
			field350.method432(239, 60, "Click to continue", 128);
		} else if (field380 != -1) {
			method112(0, 0, 0, ETSIPTYG.field499[field380]);
		} else if (field403 == -1) {
			NEJZODYM var1 = field349;
			int var2 = 0;
			GEFFBGXP.method225(77, 0, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field341[var3] != null) {
					int var4 = field339[var3];
					int var5 = field203 + 70 - var2 * 14;
					String var6 = field340[var3];
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
							var1.method436(0, var5, field341[var3], 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field65 == 0 || field65 == 1 && method41(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field345[0].method518(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field345[1].method518(var8, var5 - 12);
								var8 += 14;
							}

							var1.method436(0, var5, var6 + ":", var8);
							var8 += var1.method434(var6) + 8;
							var1.method436(255, var5, field341[var3], var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field126 == 0 && (var4 == 7 || field251 == 0 || field251 == 1 && method41(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method436(0, var5, "From", var9);
							int var11 = var9 + var1.method434("From ");
							if (var7 == 1) {
								field345[0].method518(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field345[1].method518(var11, var5 - 12);
								var11 += 14;
							}

							var1.method436(0, var5, var6 + ":", var11);
							var11 += var1.method434(var6) + 8;
							var1.method436(0x800000, var5, field341[var3], var11);
						}

						var2++;
					}

					if (var4 == 4 && (field80 == 0 || field80 == 1 && method41(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method436(0x800080, var5, var6 + " " + field341[var3], 4);
						}

						var2++;
					}

					if (var4 == 5 && field126 == 0 && field251 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method436(0x800000, var5, field341[var3], 4);
						}

						var2++;
					}

					if (var4 == 6 && field126 == 0 && field251 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method436(0, var5, "To " + var6 + ":", 4);
							var1.method436(0x800000, var5, field341[var3], var1.method434("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field80 == 0 || field80 == 1 && method41(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method436(0x7E3200, var5, var6 + " " + field341[var3], 4);
						}

						var2++;
					}
				}
			}

			GEFFBGXP.method224();
			field356 = var2 * 14 + 7;
			if (field356 < 78) {
				field356 = 78;
			}

			method151(77, field356, 0, 463, field356 - field203 - 77);
			String var10;
			if (field381 == null || field381.field1236 == null) {
				var10 = PQGPOSRV.method463(field164);
			} else {
				var10 = field381.field1236;
			}

			var1.method436(0, 90, var10 + ":", 4);
			var1.method436(255, 90, field373 + "*", var1.method434(var10 + ": ") + 6);
			GEFFBGXP.method231(0, 479, 77, 0);
		} else {
			method112(0, 0, 0, ETSIPTYG.field499[field403]);
		}

		if (field89 && field67 == 2) {
			method122();
		}

		field201.method546(field1361, 357, 17);
		field200.method545();
		FWQLREOO.field610 = field238;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method127() {
		if (field215 > 0) {
			method169();
		} else {
			field200.method545();
			field349.method432(257, 144, "Connection lost", 0);
			field349.method432(256, 143, "Connection lost", 0xFFFFFF);
			field349.method432(257, 159, "Please wait - attempting to reestablish", 0);
			field349.method432(256, 158, "Please wait - attempting to reestablish", 0xFFFFFF);
			field200.method546(field1361, 4, 4);
			field87 = 0;
			field368 = 0;
			JHRYTWFZ var1 = field161;
			field407 = false;
			field291 = 0;
			method97(field164, field165, true);

			if (!field407) {
				method169();
			}

			try {
				var1.method318();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(ZII)Z")
	public final boolean method128(int arg0, int arg1) {
		boolean var3 = false;
		ETSIPTYG var4 = ETSIPTYG.field499[arg1];
		for (int var5 = 0; var5 < var4.field523.length && var4.field523[var5] != -1; var5++) {
			ETSIPTYG var6 = ETSIPTYG.field499[var4.field523[var5]];
			if (var6.field493 == 1) {
				var3 |= method128(arg0, var6.field506);
			}

			if (var6.field493 == 6 && (var6.field528 != -1 || var6.field529 != -1)) {
				boolean var7 = method165(var6);
				int var8;
				if (var7) {
					var8 = var6.field529;
				} else {
					var8 = var6.field528;
				}

				if (var8 != -1) {
					OXBPHQKK var9 = OXBPHQKK.field1152[var8];
					var6.field486 += arg0;
					while (var6.field486 > var9.method457(var6.field492)) {
						var6.field486 -= var9.method457(var6.field492) + 1;
						var6.field492++;
						if (var6.field492 >= var9.field1153) {
							var6.field492 -= var9.field1157;
							if (var6.field492 < 0 || var6.field492 >= var9.field1153) {
								var6.field492 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.F(I)Ljava/net/Socket;")
	public final Socket method129(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method130() {
		for (WHUVIHKW var1 = (WHUVIHKW) field434.method471(); var1 != null; var1 = (WHUVIHKW) field434.method473()) {
			if (var1.field1420 == -1) {
				var1.field1421 = 0;
				method167(var1);
			} else {
				var1.method430();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		WHUVIHKW var10 = null;
		for (WHUVIHKW var11 = (WHUVIHKW) field434.method471(); var11 != null; var11 = (WHUVIHKW) field434.method473()) {
			if (var11.field1413 == arg0 && var11.field1415 == arg1 && var11.field1416 == arg5 && var11.field1414 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new WHUVIHKW();
			var10.field1413 = arg0;
			var10.field1414 = arg6;
			var10.field1415 = arg1;
			var10.field1416 = arg5;
			method167(var10);
			field434.method468(var10);
		}

		var10.field1417 = arg2;
		var10.field1419 = arg4;
		var10.field1418 = arg7;
		var10.field1421 = arg3;
		var10.field1420 = arg8;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method132() {
		if (field188 == 0) {
			field216[0] = "Cancel";
			field432[0] = 1103;
			field225 = 1;
			method125();
			field411 = 0;

			if (field1369 > 4 && field1370 > 4 && field1369 < 516 && field1370 < 338) {
				if (field46 == -1) {
					method114();
				} else {
					method164(field1369, ETSIPTYG.field499[field46], field1370, 0, 4, 4);
				}
			}

			if (field95 != field411) {
				field95 = field411;
			}

			field411 = 0;

			if (field1369 > 553 && field1370 > 205 && field1369 < 743 && field1370 < 466) {
				if (field262 != -1) {
					method164(field1369, ETSIPTYG.field499[field262], field1370, 0, 553, 205);
				} else if (field167[field386] != -1) {
					method164(field1369, ETSIPTYG.field499[field167[field386]], field1370, 0, 553, 205);
				}
			}

			if (field411 != field314) {
				field96 = true;
				field314 = field411;
			}

			field411 = 0;

			if (field1369 > 17 && field1370 > 357 && field1369 < 496 && field1370 < 453) {
				if (field380 != -1) {
					method164(field1369, ETSIPTYG.field499[field380], field1370, 0, 17, 357);
				} else if (field1370 < 434 && field1369 < 426) {
					method52(field1369 - 17, field1370 - 357);
				}
			}

			if (field380 != -1 && field411 != field352) {
				field125 = true;
				field352 = field411;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field225 - 1; var2++) {
					if (field432[var2] < 1000 && field432[var2 + 1] > 1000) {
						String var3 = field216[var2];
						field216[var2] = field216[var2 + 1];
						field216[var2 + 1] = var3;
						int var4 = field432[var2];
						field432[var2] = field432[var2 + 1];
						field432[var2 + 1] = var4;
						int var5 = field430[var2];
						field430[var2] = field430[var2 + 1];
						field430[var2 + 1] = var5;
						int var6 = field431[var2];
						field431[var2] = field431[var2 + 1];
						field431[var2 + 1] = var6;
						int var7 = field433[var2];
						field433[var2] = field433[var2 + 1];
						field433[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method133(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field159; var3++) {
				if (field226[var3] == arg0) {
					field159--;
					field96 = true;

					for (int var4 = var3; var4 < field159; var4++) {
						field121[var4] = field121[var4 + 1];
						field257[var4] = field257[var4 + 1];
						field226[var4] = field226[var4 + 1];
					}

					field79.method4(205);
					field79.method11(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LBJPWOXRJ;BI)V")
	public final void method134(BJPWOXRJ arg0, int arg1) {
		for (int var3 = 0; var3 < field327; var3++) {
			int var4 = field328[var3];
			HGVATLQF var5 = field116[var4];
			int var6 = arg0.method15();
			if ((var6 & 0x1) != 0) {
				int var7 = arg0.method15();
				int var8 = arg0.method15();
				var5.method447(var8, field239, var7);
				var5.field1114 = field239 + 300;
				var5.field1115 = arg0.method15();
				var5.field1116 = arg0.method15();
			}

			if ((var6 & 0x2) != 0) {
				int var9 = arg0.method17();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field1132 == var9) {
					var5.field1136 = 0;
				}

				int var10 = arg0.method15();
				if (var5.field1132 == var9 && var9 != -1) {
					int var11 = OXBPHQKK.field1152[var9].field1166;
					if (var11 == 1) {
						var5.field1133 = 0;
						var5.field1134 = 0;
						var5.field1135 = var10;
						var5.field1136 = 0;
					}

					if (var11 == 2) {
						var5.field1136 = 0;
					}
				} else if (var9 == -1 || var5.field1132 == -1 || OXBPHQKK.field1152[var9].field1160 >= OXBPHQKK.field1152[var5.field1132].field1160) {
					var5.field1132 = var9;
					var5.field1133 = 0;
					var5.field1134 = 0;
					var5.field1135 = var10;
					var5.field1136 = 0;
					var5.field1142 = var5.field1139;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field1122 = arg0.method17();
				if (var5.field1122 == 0xFFFF) {
					var5.field1122 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1098 = arg0.method22();
				var5.field1138 = 100;
			}

			if ((var6 & 0x10) != 0) {
				int var12 = arg0.method15();
				int var13 = arg0.method15();
				var5.method447(var13, field239, var12);
				var5.field1114 = field239 + 300;
				var5.field1115 = arg0.method15();
				var5.field1116 = arg0.method15();
			}

			if ((var6 & 0x20) != 0) {
				var5.field735 = RRZTMHXJ.method488(arg0.method17());
				var5.field1105 = var5.field735.field1290;
				var5.field1117 = var5.field735.field1282;
				var5.field1128 = var5.field735.field1298;
				var5.field1129 = var5.field735.field1303;
				var5.field1130 = var5.field735.field1309;
				var5.field1131 = var5.field735.field1288;
				var5.field1140 = var5.field735.field1287;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1099 = arg0.method17();
				int var14 = arg0.method20();
				var5.field1103 = var14 >> 16;
				var5.field1102 = (var14 & 0xFFFF) + field239;
				var5.field1100 = 0;
				var5.field1101 = 0;

				if (var5.field1102 > field239) {
					var5.field1100 = -1;
				}

				if (var5.field1099 == 0xFFFF) {
					var5.field1099 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field1120 = arg0.method17();
				var5.field1121 = arg0.method17();
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 306);

			if (arg0.length == 5) {
				field334 = Integer.parseInt(arg0[0]);
				field335 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method59();
				} else if (arg0[2].equals("highmem")) {
					method160();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field336 = false;
				} else if (arg0[3].equals("members")) {
					field336 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method508(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method135() {
		if (field400 == 2) {
			for (WHUVIHKW var1 = (WHUVIHKW) field434.method471(); var1 != null; var1 = (WHUVIHKW) field434.method473()) {
				if (var1.field1420 > 0) {
					var1.field1420--;
				}

				if (var1.field1420 != 0) {
					if (var1.field1421 > 0) {
						var1.field1421--;
					}

					if (var1.field1421 == 0 && var1.field1415 >= 1 && var1.field1416 >= 1 && var1.field1415 <= 102 && var1.field1416 <= 102 && (var1.field1417 < 0 || SMJSOFHG.method495(var1.field1417, var1.field1419))) {
						method174(var1.field1418, var1.field1415, var1.field1419, var1.field1413, var1.field1414, var1.field1416, var1.field1417);
						var1.field1421 = -1;

						if (var1.field1422 == var1.field1417 && var1.field1422 == -1) {
							var1.method430();
						} else if (var1.field1422 == var1.field1417 && var1.field1423 == var1.field1418 && var1.field1424 == var1.field1419) {
							var1.method430();
						}
					}
				} else if (var1.field1422 < 0 || SMJSOFHG.method495(var1.field1422, var1.field1424)) {
					method174(var1.field1423, var1.field1415, var1.field1424, var1.field1413, var1.field1414, var1.field1416, var1.field1422);
					var1.method430();
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method136() {
		field92 = false;
		while (field437) {
			field92 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field103 = null;
		field104 = null;
		field122 = null;
		field264 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field133 = null;
		field134 = null;
		field441 = null;
		field442 = null;
		field144 = null;
		field145 = null;
	}

	@ObfuscatedName("client.a(IBLBJPWOXRJ;)V")
	public final void method137(int arg0, BJPWOXRJ arg1) {
		while (arg1.field6 + 21 < arg0 * 8) {
			int var3 = arg1.method26(14);
			if (var3 == 16383) {
				break;
			}

			if (field116[var3] == null) {
				field116[var3] = new HGVATLQF();
			}

			HGVATLQF var4 = field116[var3];
			field118[field117++] = var3;
			var4.field1106 = field239;
			var4.field735 = RRZTMHXJ.method488(arg1.method26(12));
			int var5 = arg1.method26(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method26(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method26(1);
			int var8 = arg1.method26(1);
			if (var8 == 1) {
				field328[field327++] = var3;
			}

			var4.field1105 = var4.field735.field1290;
			var4.field1117 = var4.field735.field1282;
			var4.field1128 = var4.field735.field1298;
			var4.field1129 = var4.field735.field1303;
			var4.field1130 = var4.field735.field1309;
			var4.field1131 = var4.field735.field1288;
			var4.field1140 = var4.field735.field1287;
			var4.method450(field381.field1119[0] + var6, var7 == 1, field381.field1118[0] + var5);
		}

		arg1.method27();
	}

	@ObfuscatedName("client.a(IIIIIIIZIIII)Z")
	public final boolean method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field385[var14][var15] = 0;
				field185[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg0;
		field385[arg1][arg0] = 99;
		field185[arg1][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field353[var18] = arg1;
		int var35 = var18 + 1;
		field354[var18] = arg0;
		boolean var20 = false;
		int var21 = field353.length;
		int[][] var22 = field29[field98].field750;
		while (var35 != var19) {
			var16 = field353[var19];
			var17 = field354[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field29[field98].method308(arg2 - 1, arg5, var16, arg3, var17, arg8)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field29[field98].method309(arg5, arg2 - 1, var17, arg3, arg8, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg7 != 0 && arg4 != 0 && field29[field98].method310(arg7, var16, arg9, var17, arg8, arg3, arg4)) {
				var20 = true;
				break;
			}

			int var23 = field185[var16][var17] + 1;
			if (var16 > 0 && field385[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field353[var35] = var16 - 1;
				field354[var35] = var17;
				var35 = (var35 + 1) % var21;
				field385[var16 - 1][var17] = 2;
				field185[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field385[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field353[var35] = var16 + 1;
				field354[var35] = var17;
				var35 = (var35 + 1) % var21;
				field385[var16 + 1][var17] = 8;
				field185[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field385[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field353[var35] = var16;
				field354[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field385[var16][var17 - 1] = 1;
				field185[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field385[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field353[var35] = var16;
				field354[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field385[var16][var17 + 1] = 4;
				field185[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field385[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field353[var35] = var16 - 1;
				field354[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field385[var16 - 1][var17 - 1] = 3;
				field185[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field385[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field353[var35] = var16 + 1;
				field354[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field385[var16 + 1][var17 - 1] = 9;
				field185[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field385[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field353[var35] = var16 - 1;
				field354[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field385[var16 - 1][var17 + 1] = 6;
				field185[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field385[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field353[var35] = var16 + 1;
				field354[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field385[var16 + 1][var17 + 1] = 12;
				field185[var16 + 1][var17 + 1] = var23;
			}
		}

		field374 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field185[var26][var27] < var24) {
								var24 = field185[var26][var27];
								var16 = var26;
								var17 = var27;
								field374 = 1;
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
		field353[var28] = var16;
		int var36 = var28 + 1;
		field354[var28] = var17;
		int var29;
		int var30 = var29 = field385[var16][var17];
		while (arg1 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field353[var36] = var16;
				field354[var36++] = var17;
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

			var30 = field385[var16][var17];
		}

		if (var36 <= 0) {
			if (arg10 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field353[var36];
		int var33 = field354[var36];

		if (arg10 == 0) {
			field79.method4(25);
			field79.method5(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field79.method4(200);
			field79.method5(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field79.method4(49);
			field79.method5(var31 + var31 + 3);
		}

		field79.method5(field1379[5] == 1 ? 1 : 0);
		field79.method6(field258 + var32);
		field79.method6(field259 + var33);
		field368 = field353[0];
		field369 = field354[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field79.method5(field353[var36] - var32);
			field79.method5(field354[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(ZIILQVUHZTUC;I)V")
	public final void method139(int arg0, int arg1, QVUHZTUC arg2, int arg3) {
		if (field381 != arg2 && field225 < 400) {
			String var5;
			if (arg2.field1257 == 0) {
				var5 = arg2.field1236 + method161(arg2.field1251, field381.field1251) + " (level-" + arg2.field1251 + ")";
			} else {
				var5 = arg2.field1236 + " (skill-" + arg2.field1257 + ")";
			}

			if (field444 == 1) {
				field216[field225] = "Use " + field448 + " with @whi@" + var5;
				field432[field225] = 206;
				field433[field225] = arg1;
				field430[field225] = arg0;
				field431[field225] = arg3;
				field225++;
			} else if (field138 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field424[var6] != null) {
						field216[field225] = field424[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field424[var6].equalsIgnoreCase("attack")) {
							if (arg2.field1251 > field381.field1251) {
								var7 = 2000;
							}

							if (field381.field1250 != 0 && arg2.field1250 != 0) {
								if (field381.field1250 == arg2.field1250) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field425[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field432[field225] = var7 + 149;
						}

						if (var6 == 1) {
							field432[field225] = var7 + 158;
						}

						if (var6 == 2) {
							field432[field225] = var7 + 765;
						}

						if (var6 == 3) {
							field432[field225] = var7 + 902;
						}

						if (var6 == 4) {
							field432[field225] = var7 + 114;
						}

						field433[field225] = arg1;
						field430[field225] = arg0;
						field431[field225] = arg3;
						field225++;
					}
				}
			} else if ((field140 & 0x8) == 8) {
				field216[field225] = field141 + " @whi@" + var5;
				field432[field225] = 28;
				field433[field225] = arg1;
				field430[field225] = arg0;
				field431[field225] = arg3;
				field225++;
			}

			for (int var8 = 0; var8 < field225; var8++) {
				if (field432[var8] == 762) {
					field216[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ILBJPWOXRJ;I)V")
	public final void method140(int arg0, BJPWOXRJ arg1) {
		if (arg0 == 169) {
			int var3 = arg1.method15();
			int var4 = (var3 >> 4 & 0x7) + field427;
			int var5 = (var3 & 0x7) + field428;
			int var6 = arg1.method17();
			int var7 = arg1.method15();
			int var8 = var7 >> 4 & 0xF;
			int var9 = var7 & 0x7;
			if (field381.field1118[0] >= var4 - var8 && field381.field1118[0] <= var4 + var8 && field381.field1119[0] >= var5 - var8 && field381.field1119[0] <= var5 + var8 && field231 && !field337 && field137 < 50) {
				field418[field137] = var6;
				field316[field137] = var9;
				field48[field137] = GQYCHOQW.field633[var6];
				field137++;
			}
		}

		if (arg0 == 1) {
			int var10 = arg1.method15();
			int var11 = (var10 >> 4 & 0x7) + field427;
			int var12 = (var10 & 0x7) + field428;
			int var13 = arg1.method15();
			int var14 = var13 >> 2;
			int var15 = var13 & 0x3;
			int var16 = field57[var14];
			int var17 = arg1.method17();
			if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
				int var18 = field51[field98][var11][var12];
				int var19 = field51[field98][var11 + 1][var12];
				int var20 = field51[field98][var11 + 1][var12 + 1];
				int var21 = field51[field98][var11][var12 + 1];
				if (var16 == 0) {
					EDUFXSZA var22 = field207.method267(field98, var12, var11);
					if (var22 != null) {
						int var23 = var22.field471 >> 14 & 0x7FFF;
						if (var14 == 2) {
							var22.field469 = new SIDDBHEA(var18, var21, var17, 2, var15 + 4, false, var23, var19, var20);
							var22.field470 = new SIDDBHEA(var18, var21, var17, 2, var15 + 1 & 0x3, false, var23, var19, var20);
						} else {
							var22.field469 = new SIDDBHEA(var18, var21, var17, var14, var15, false, var23, var19, var20);
						}
					}
				}

				if (var16 == 1) {
					QQCWKWSA var24 = field207.method268(var11, field98, var12);
					if (var24 != null) {
						var24.field1231 = new SIDDBHEA(var18, var21, var17, 4, 0, false, var24.field1232 >> 14 & 0x7FFF, var19, var20);
					}
				}

				if (var16 == 2) {
					CWBRGICY var25 = field207.method269(var11, var12, field98);

					if (var14 == 11) {
						var14 = 10;
					}

					if (var25 != null) {
						var25.field454 = new SIDDBHEA(var18, var21, var17, var14, var15, false, var25.field462 >> 14 & 0x7FFF, var19, var20);
					}
				}

				if (var16 == 3) {
					QZXHJSPK var26 = field207.method270(var11, var12, field98);
					if (var26 != null) {
						var26.field1262 = new SIDDBHEA(var18, var21, var17, 22, var15, false, var26.field1263 >> 14 & 0x7FFF, var19, var20);
					}
				}
			}
		} else if (arg0 == 147) {
			int var27 = arg1.method15();
			int var28 = (var27 >> 4 & 0x7) + field427;
			int var29 = (var27 & 0x7) + field428;
			int var30 = arg1.method17();
			int var31 = arg1.method17();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				YSIOSDRV var32 = new YSIOSDRV();
				var32.field1472 = var30;
				var32.field1473 = var31;

				if (field135[field98][var28][var29] == null) {
					field135[field98][var28][var29] = new RGZIHLRP();
				}

				field135[field98][var28][var29].method468(var32);
				method42(var28, var29);
			}
		} else if (arg0 == 242) {
			int var33 = arg1.method15();
			int var34 = (var33 >> 4 & 0x7) + field427;
			int var35 = (var33 & 0x7) + field428;
			int var36 = arg1.method17();
			int var37 = arg1.method17();
			int var38 = arg1.method17();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				RGZIHLRP var39 = field135[field98][var34][var35];
				if (var39 != null) {
					for (YSIOSDRV var40 = (YSIOSDRV) var39.method471(); var40 != null; var40 = (YSIOSDRV) var39.method473()) {
						if ((var36 & 0x7FFF) == var40.field1472 && var40.field1473 == var37) {
							var40.field1473 = var38;
							break;
						}
					}

					method42(var34, var35);
				}
			}
		} else if (arg0 == 110) {
			int var41 = arg1.method15();
			int var42 = (var41 >> 4 & 0x7) + field427;
			int var43 = (var41 & 0x7) + field428;
			int var44 = arg1.method17();
			if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				RGZIHLRP var45 = field135[field98][var42][var43];
				if (var45 != null) {
					for (YSIOSDRV var46 = (YSIOSDRV) var45.method471(); var46 != null; var46 = (YSIOSDRV) var45.method473()) {
						if ((var44 & 0x7FFF) == var46.field1472) {
							var46.method430();
							break;
						}
					}

					if (var45.method471() == null) {
						field135[field98][var42][var43] = null;
					}

					method42(var42, var43);
				}
			}
		} else {
			if (arg0 == 222) {
				int var47 = arg1.method15();
				int var48 = (var47 >> 4 & 0x7) + field427;
				int var49 = (var47 & 0x7) + field428;
				int var50 = arg1.method15();
				int var51 = var50 >> 2;
				int var52 = var50 & 0x3;
				int var53 = field57[var51];
				int var54 = arg1.method17();
				int var55 = arg1.method17();
				int var56 = arg1.method17();
				int var57 = arg1.method17();
				byte var58 = arg1.method16();
				byte var59 = arg1.method16();
				byte var60 = arg1.method16();
				byte var61 = arg1.method16();
				QVUHZTUC var62;
				if (field36 == var57) {
					var62 = field381;
				} else {
					var62 = field324[var57];
				}

				if (var62 != null) {
					KZRNPNVL var63 = KZRNPNVL.method401(var54);
					int var64 = field51[field98][var48][var49];
					int var65 = field51[field98][var48 + 1][var49];
					int var66 = field51[field98][var48 + 1][var49 + 1];
					int var67 = field51[field98][var48][var49 + 1];
					JLNSJQDR var68 = var63.method406(var51, var52, var64, var65, var66, var67, -1);
					if (var68 != null) {
						method131(field98, var48, -1, var55 + 1, 0, var49, var53, 0, var56 + 1);
						var62.field1252 = field239 + var55;
						var62.field1253 = field239 + var56;
						var62.field1241 = var68;
						int var69 = var63.field946;
						int var70 = var63.field974;
						if (var52 == 1 || var52 == 3) {
							var69 = var63.field974;
							var70 = var63.field946;
						}

						var62.field1238 = var48 * 128 + var69 * 64;
						var62.field1240 = var49 * 128 + var70 * 64;
						var62.field1239 = method94(var62.field1238, var62.field1240, field98);

						if (var58 > var60) {
							byte var71 = var58;
							var58 = var60;
							var60 = var71;
						}

						if (var59 > var61) {
							byte var72 = var59;
							var59 = var61;
							var61 = var72;
						}

						var62.field1242 = var48 + var58;
						var62.field1244 = var48 + var60;
						var62.field1243 = var49 + var59;
						var62.field1245 = var49 + var61;
					}
				}
			}

			if (arg0 == 104) {
				int var73 = arg1.method15();
				int var74 = (var73 >> 4 & 0x7) + field427;
				int var75 = (var73 & 0x7) + field428;
				int var76 = arg1.method17();
				int var77 = arg1.method15();
				int var78 = arg1.method17();
				if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
					var74 = var74 * 128 + 64;
					var75 = var75 * 128 + 64;
					GRLQOIQT var79 = new GRLQOIQT(var76, var75, field98, var74, method94(var74, var75, field98) - var77, field239, var78);
					field269.method468(var79);
				}
			} else if (arg0 == 141) {
				int var80 = arg1.method15();
				int var81 = (var80 >> 4 & 0x7) + field427;
				int var82 = (var80 & 0x7) + field428;
				int var83 = arg1.method15();
				int var84 = var83 >> 2;
				int var85 = var83 & 0x3;
				int var86 = field57[var84];
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
					method131(field98, var81, -1, 0, var84, var82, var86, var85, -1);
				}
			} else if (arg0 == 90) {
				int var87 = arg1.method15();
				int var88 = (var87 >> 4 & 0x7) + field427;
				int var89 = (var87 & 0x7) + field428;
				int var90 = var88 + arg1.method16();
				int var91 = var89 + arg1.method16();
				int var92 = arg1.method18();
				int var93 = arg1.method17();
				int var94 = arg1.method15() * 4;
				int var95 = arg1.method15() * 4;
				int var96 = arg1.method17();
				int var97 = arg1.method17();
				int var98 = arg1.method15();
				int var99 = arg1.method15();
				if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var93 != 0xFFFF) {
					var88 = var88 * 128 + 64;
					var89 = var89 * 128 + 64;
					var90 = var90 * 128 + 64;
					var91 = var91 * 128 + 64;
					GVHVJOWK var100 = new GVHVJOWK(var89, var95, var99, field239 + var97, var93, field98, field239 + var96, var92, var98, method94(var88, var89, field98) - var94, var88);
					var100.method242(var90, method94(var90, var91, field98) - var95, field239 + var96, var91);
					field91.method468(var100);
				}
			} else if (arg0 == 133) {
				int var101 = arg1.method15();
				int var102 = (var101 >> 4 & 0x7) + field427;
				int var103 = (var101 & 0x7) + field428;
				int var104 = arg1.method15();
				int var105 = var104 >> 2;
				int var106 = var104 & 0x3;
				int var107 = field57[var105];
				int var108 = arg1.method17();
				if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
					method131(field98, var102, var108, 0, var105, var103, var107, var106, -1);
				}
			} else if (arg0 == 107) {
				int var109 = arg1.method15();
				int var110 = (var109 >> 4 & 0x7) + field427;
				int var111 = (var109 & 0x7) + field428;
				int var112 = arg1.method17();
				int var113 = arg1.method17();
				int var114 = arg1.method17();
				if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104 && field36 != var114) {
					YSIOSDRV var115 = new YSIOSDRV();
					var115.field1472 = var112;
					var115.field1473 = var113;

					if (field135[field98][var110][var111] == null) {
						field135[field98][var110][var111] = new RGZIHLRP();
					}

					field135[field98][var110][var111].method468(var115);
					method42(var110, var111);
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method141() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field441[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field441[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field442[var10] = (field441[var10 - 1] + field441[var10 + 1] + field441[var10 - 128] + field441[var10 + 128]) / 4;
			}
		}

		field378 += 128;
		if (field378 > field133.length) {
			field378 -= field133.length;
			int var11 = (int) (Math.random() * 12.0D);
			method92(field122[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field442[var14 + 128] - field133[field378 + var14 & field133.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field441[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field143[var16] = field143[var16 + 1];
		}

		field143[var1 - 1] = (int) (Math.sin(field239 / 14.0D) * 16.0D + Math.sin(field239 / 15.0D) * 14.0D + Math.sin(field239 / 16.0D) * 12.0D);

		if (field153 > 0) {
			field153 -= 4;
		}

		if (field154 > 0) {
			field154 -= 4;
		}

		if (field153 == 0 && field154 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field153 = 1024;
			}

			if (var17 == 1) {
				field154 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public void method142() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field292);

		if (field131 != null) {
			System.out.println("Od-cycle:" + field131.field574);
		}

		System.out.println("loop-cycle:" + field239);
		System.out.println("draw-cycle:" + field405);
		System.out.println("ptype:" + field212);
		System.out.println("psize:" + field211);

		if (field161 != null) {
			field161.method323();
		}

		field1358 = true;
	}

	@ObfuscatedName("client.c(Z)Ljava/awt/Component;")
	public final Component method143() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1364 != null) {
			return field1364;
		}

		return this;
	}

	@ObfuscatedName("client.a(BLETSIPTYG;)V")
	public final void method144(ETSIPTYG arg0) {
		int var2 = arg0.field531;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field160 == 0) {
				arg0.field497 = "Loading friend list";
				arg0.field530 = 0;
			} else if (var2 == 1 && field160 == 1) {
				arg0.field497 = "Connecting to friendserver";
				arg0.field530 = 0;
			} else if (var2 == 2 && field160 != 2) {
				arg0.field497 = "Please wait...";
				arg0.field530 = 0;
			} else {
				int var3 = field159;
				if (field160 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field497 = "";
					arg0.field530 = 0;
				} else {
					arg0.field497 = field121[var2];
					arg0.field530 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field159;
			if (field160 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field497 = "";
				arg0.field530 = 0;
			} else {
				if (field257[var2] == 0) {
					arg0.field497 = "@red@Offline";
				} else if (field257[var2] == field334) {
					arg0.field497 = "@gre@World-" + (field257[var2] - 9);
				} else {
					arg0.field497 = "@yel@World-" + (field257[var2] - 9);
				}

				arg0.field530 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field159;
			if (field160 != 2) {
				var5 = 0;
			}

			arg0.field473 = var5 * 15 + 20;
			if (arg0.field473 <= arg0.field482) {
				arg0.field473 = arg0.field482 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field160 == 0) {
				arg0.field497 = "Loading ignore list";
				arg0.field530 = 0;
			} else if (var2 == 1 && field160 == 0) {
				arg0.field497 = "Please wait...";
				arg0.field530 = 0;
			} else {
				int var6 = field310;
				if (field160 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field497 = "";
					arg0.field530 = 0;
				} else {
					arg0.field497 = PQGPOSRV.method463(PQGPOSRV.method460(field166[var2]));
					arg0.field530 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field473 = field310 * 15 + 20;
			if (arg0.field473 <= arg0.field482) {
				arg0.field473 = arg0.field482 + 1;
			}
		} else if (var2 == 327) {
			arg0.field502 = 150;
			arg0.field503 = (int) (Math.sin(field239 / 40.0D) * 256.0D) & 0x7FF;

			if (field249) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field321[var7];
					if (var8 >= 0 && !RHGWIWMQ.field1268[var8].method478()) {
						return;
					}
				}

				field249 = false;
				JLNSJQDR[] var9 = new JLNSJQDR[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field321[var11];
					if (var12 >= 0) {
						var9[var10++] = RHGWIWMQ.field1268[var12].method479();
					}
				}

				JLNSJQDR var13 = new JLNSJQDR(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field387[var14] != 0) {
						var13.method342(field102[var14][0], field102[var14][field387[var14]]);

						if (var14 == 1) {
							var13.method342(field394[0], field394[field387[var14]]);
						}
					}
				}

				var13.method335();
				var13.method336(OXBPHQKK.field1152[field381.field1140].field1154[0]);
				var13.method345(64, 850, -30, -50, -30, true);
				arg0.field475 = 5;
				arg0.field476 = 0;
				ETSIPTYG.method179(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field312 == null) {
				field312 = arg0.field532;
				field313 = arg0.field508;
			}

			if (field436) {
				arg0.field532 = field313;
			} else {
				arg0.field532 = field312;
			}
		} else if (var2 == 325) {
			if (field312 == null) {
				field312 = arg0.field532;
				field313 = arg0.field508;
			}

			if (field436) {
				arg0.field532 = field312;
			} else {
				arg0.field532 = field313;
			}
		} else if (var2 == 600) {
			arg0.field497 = field395;
			if (field239 % 20 < 10) {
				arg0.field497 = arg0.field497 + "|";
			} else {
				arg0.field497 = arg0.field497 + " ";
			}
		} else if (var2 == 613) {
			if (field399 < 1) {
				arg0.field497 = "";
			} else if (field311) {
				arg0.field536 = 0xFF0000;
				arg0.field497 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field536 = 0xFFFFFF;
				arg0.field497 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field388 == 0) {
				arg0.field497 = "";
			} else {
				String var15;
				if (field220 == 0) {
					var15 = "earlier today";
				} else if (field220 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field220 + " days ago";
				}

				arg0.field497 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field40 == 0) {
				arg0.field497 = "0 unread messages";
				arg0.field536 = 0xFFFF00;
			}

			if (field40 == 1) {
				arg0.field497 = "1 unread message";
				arg0.field536 = 0xFF00;
			}

			if (field40 > 1) {
				arg0.field497 = field40 + " unread messages";
				arg0.field536 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field152 == 201) {
				if (field129 == 1) {
					arg0.field497 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field497 = "";
				}
			} else if (field152 == 200) {
				arg0.field497 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field152 == 0) {
					var16 = "Earlier today";
				} else if (field152 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field152 + " days ago";
				}

				arg0.field497 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field152 == 201) {
				if (field129 == 1) {
					arg0.field497 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field497 = "";
				}
			} else if (field152 == 200) {
				arg0.field497 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field497 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field152 == 201) {
				if (field129 == 1) {
					arg0.field497 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field497 = "";
				}
			} else if (field152 == 200) {
				arg0.field497 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field497 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void method145(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method146() {
		method166("Starting up", 20);

		if (signlink.sunjava) {
			field1355 = 5;
		}

		if (field223) {
			field449 = true;
		} else {
			field223 = true;
			boolean var1 = false;
			String var2 = method37();
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
						field33[var3] = new MMZHRHUG(var3 + 1, signlink.cache_idx[var3], 500000, signlink.cache_dat);
					}
				}

				try {
					method77();
					field417 = method107(25, "title", 1, "title screen", field179[1]);
					field348 = new NEJZODYM(field417, false, "p11_full");
					field349 = new NEJZODYM(field417, false, "p12_full");
					field350 = new NEJZODYM(field417, false, "b12_full");
					field351 = new NEJZODYM(field417, true, "q8_full");
					method155();
					method46();
					MNPBQFWE var4 = method107(30, "config", 2, "config", field179[2]);
					MNPBQFWE var5 = method107(35, "interface", 3, "interface", field179[3]);
					MNPBQFWE var6 = method107(40, "media", 4, "2d graphics", field179[4]);
					MNPBQFWE var7 = method107(45, "textures", 6, "textures", field179[6]);
					MNPBQFWE var8 = method107(50, "wordenc", 7, "chat system", field179[7]);
					MNPBQFWE var9 = method107(55, "sounds", 8, "sound effects", field179[8]);
					field333 = new byte[4][104][104];
					field51 = new int[4][105][105];
					field207 = new HFOJZUJK(field51, 104, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field29[var10] = new HUQCCBIO(104, 104);
					}

					field370 = new YZDAHXEQ(512, 512);
					MNPBQFWE var11 = method107(60, "versionlist", 5, "update list", field179[5]);
					method166("Connecting to update server", 60);
					field131 = new FHVZVKRA();
					field131.method191(var11, this);
					UIZESDZR.method520(field131.method182());
					JLNSJQDR.method325(field131.method186(0), field131);

					if (!field337) {
						field364 = 0;
						try {
							field364 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field365 = true;
						field131.method190(2, field364);

						while (field131.method194() > 0) {
							method60();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field131.field543 > 3) {
								method96("ondemand");
								return;
							}
						}
					}

					method166("Requesting animations", 65);
					int var12 = field131.method186(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field131.method190(1, var13);
					}

					while (field131.method194() > 0) {
						int var14 = var12 - field131.method194();
						if (var14 > 0) {
							method166("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method60();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field131.field543 > 3) {
							method96("ondemand");
							return;
						}
					}

					method166("Requesting models", 70);
					int var15 = field131.method186(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field131.method185(var16);
						if ((var17 & 0x1) != 0) {
							field131.method190(0, var16);
						}
					}

					int var18 = field131.method194();
					while (field131.method194() > 0) {
						int var19 = var18 - field131.method194();
						if (var19 > 0) {
							method166("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method60();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field33[0] != null) {
						method166("Requesting maps", 75);
						field131.method190(3, field131.method202(47, 48, 0));
						field131.method190(3, field131.method202(47, 48, 1));
						field131.method190(3, field131.method202(48, 48, 0));
						field131.method190(3, field131.method202(48, 48, 1));
						field131.method190(3, field131.method202(49, 48, 0));
						field131.method190(3, field131.method202(49, 48, 1));
						field131.method190(3, field131.method202(47, 47, 0));
						field131.method190(3, field131.method202(47, 47, 1));
						field131.method190(3, field131.method202(48, 47, 0));
						field131.method190(3, field131.method202(48, 47, 1));
						field131.method190(3, field131.method202(48, 148, 0));
						field131.method190(3, field131.method202(48, 148, 1));
						int var20 = field131.method194();
						while (field131.method194() > 0) {
							int var21 = var20 - field131.method194();
							if (var21 > 0) {
								method166("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method60();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field131.method186(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field131.method185(var23);
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
							field131.method200(0, var25, var23);
						}
					}

					field131.method188(field336);

					if (!field337) {
						int var26 = field131.method186(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field131.method187(var27)) {
								field131.method200(2, (byte) 1, var27);
							}
						}
					}

					method166("Unpacking media", 80);
					field305 = new TKCVVLIT(var6, "invback", 0);
					field307 = new TKCVVLIT(var6, "chatback", 0);
					field306 = new TKCVVLIT(var6, "mapback", 0);
					field84 = new TKCVVLIT(var6, "backbase1", 0);
					field85 = new TKCVVLIT(var6, "backbase2", 0);
					field86 = new TKCVVLIT(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field298[var28] = new TKCVVLIT(var6, "sideicons", var28);
					}

					field404 = new YZDAHXEQ(var6, "compass", 0);
					field320 = new YZDAHXEQ(var6, "mapedge", 0);
					field320.method550();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field45[var29] = new TKCVVLIT(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field396[var30] = new YZDAHXEQ(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field439[var31] = new YZDAHXEQ(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field222[var32] = new YZDAHXEQ(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field162 = new YZDAHXEQ(var6, "mapmarker", 0);
					field163 = new YZDAHXEQ(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field93[var33] = new YZDAHXEQ(var6, "cross", var33);
					}

					field252 = new YZDAHXEQ(var6, "mapdots", 0);
					field253 = new YZDAHXEQ(var6, "mapdots", 1);
					field254 = new YZDAHXEQ(var6, "mapdots", 2);
					field255 = new YZDAHXEQ(var6, "mapdots", 3);
					field256 = new YZDAHXEQ(var6, "mapdots", 4);
					field204 = new TKCVVLIT(var6, "scrollbar", 0);
					field205 = new TKCVVLIT(var6, "scrollbar", 1);
					field275 = new TKCVVLIT(var6, "redstone1", 0);
					field276 = new TKCVVLIT(var6, "redstone2", 0);
					field277 = new TKCVVLIT(var6, "redstone3", 0);
					field278 = new TKCVVLIT(var6, "redstone1", 0);
					field278.method515();
					field279 = new TKCVVLIT(var6, "redstone2", 0);
					field279.method515();
					field180 = new TKCVVLIT(var6, "redstone1", 0);
					field180.method516();
					field181 = new TKCVVLIT(var6, "redstone2", 0);
					field181.method516();
					field182 = new TKCVVLIT(var6, "redstone3", 0);
					field182.method516();
					field183 = new TKCVVLIT(var6, "redstone1", 0);
					field183.method515();
					field183.method516();
					field184 = new TKCVVLIT(var6, "redstone2", 0);
					field184.method515();
					field184.method516();

					for (int var34 = 0; var34 < 2; var34++) {
						field345[var34] = new TKCVVLIT(var6, "mod_icons", var34);
					}

					YZDAHXEQ var35 = new YZDAHXEQ(var6, "backleft1", 0);
					field282 = new YOIXICCU(var35.field1475, method143(), var35.field1476);
					var35.method551(0, 0);
					YZDAHXEQ var36 = new YZDAHXEQ(var6, "backleft2", 0);
					field283 = new YOIXICCU(var36.field1475, method143(), var36.field1476);
					var36.method551(0, 0);
					YZDAHXEQ var37 = new YZDAHXEQ(var6, "backright1", 0);
					field284 = new YOIXICCU(var37.field1475, method143(), var37.field1476);
					var37.method551(0, 0);
					YZDAHXEQ var38 = new YZDAHXEQ(var6, "backright2", 0);
					field285 = new YOIXICCU(var38.field1475, method143(), var38.field1476);
					var38.method551(0, 0);
					YZDAHXEQ var39 = new YZDAHXEQ(var6, "backtop1", 0);
					field286 = new YOIXICCU(var39.field1475, method143(), var39.field1476);
					var39.method551(0, 0);
					YZDAHXEQ var40 = new YZDAHXEQ(var6, "backvmid1", 0);
					field287 = new YOIXICCU(var40.field1475, method143(), var40.field1476);
					var40.method551(0, 0);
					YZDAHXEQ var41 = new YZDAHXEQ(var6, "backvmid2", 0);
					field288 = new YOIXICCU(var41.field1475, method143(), var41.field1476);
					var41.method551(0, 0);
					YZDAHXEQ var42 = new YZDAHXEQ(var6, "backvmid3", 0);
					field289 = new YOIXICCU(var42.field1475, method143(), var42.field1476);
					var42.method551(0, 0);
					YZDAHXEQ var43 = new YZDAHXEQ(var6, "backhmid2", 0);
					field290 = new YOIXICCU(var43.field1475, method143(), var43.field1476);
					var43.method551(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field396[var48] != null) {
							field396[var48].method549(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field45[var48] != null) {
							field45[var48].method517(var44 + var47, var46 + var47, var45 + var47);
						}
					}

					method166("Unpacking textures", 83);
					FWQLREOO.method211(var7);
					FWQLREOO.method215(0.8D);
					FWQLREOO.method210(20);
					method166("Unpacking config", 86);
					OXBPHQKK.method456(var4);
					KZRNPNVL.method404(var4);
					KJOXMCRE.method355(var4);
					LGNJKIJR.method416(var4);
					RRZTMHXJ.method483(var4);
					RHGWIWMQ.method476(var4);
					MKJLFPRH.method421(var4);
					JMEOMLFD.method353(var4);
					BUYMNSFH.method31(var4);
					LGNJKIJR.field1027 = field336;

					if (!field337) {
						method166("Unpacking sounds", 90);
						byte[] var49 = var9.method429("sounds.dat", null);
						BJPWOXRJ var50 = new BJPWOXRJ(var49);
						GQYCHOQW.method235(var50);
					}

					method166("Unpacking interfaces", 95);
					NEJZODYM[] var51 = new NEJZODYM[] { field348, field349, field350, field351 };
					ETSIPTYG.method178(var5, var51, var6);
					method166("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field306.field1383[field306.field1385 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field52[var52] = var53;
						field130[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field306.field1383[field306.field1385 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field263[var56 - 5] = var57 - 25;
						field44[var56 - 5] = var58 - var57;
					}

					FWQLREOO.method208(479, 96);
					field236 = FWQLREOO.field610;
					FWQLREOO.method208(190, 261);
					field237 = FWQLREOO.field610;
					FWQLREOO.method208(512, 334);
					field238 = FWQLREOO.field610;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = FWQLREOO.field608[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					HFOJZUJK.method281(512, var60, 334, 500, 800);
					KMKDGUZT.method359(var8);
					field406 = new PTSFQSMJ(this);
					method115(field406, 10);
					SIDDBHEA.field1321 = this;
					KZRNPNVL.field979 = this;
					RRZTMHXJ.field1289 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field355 + " " + field120);
					field142 = true;
				}
			} else {
				field150 = true;
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method147() {
		KZRNPNVL.field980.method317();
		KZRNPNVL.field957.method317();
		RRZTMHXJ.field1276.method317();
		LGNJKIJR.field1015.method317();
		LGNJKIJR.field1031.method317();
		QVUHZTUC.field1237.method317();
		MKJLFPRH.field1063.method317();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method148(int arg0) {
		if (!field337) {
			if (FWQLREOO.field618[17] >= arg0) {
				TKCVVLIT var2 = FWQLREOO.field612[17];
				int var3 = var2.field1386 * var2.field1385 - 1;
				int var4 = field38 * var2.field1385 * 2;
				byte[] var5 = var2.field1383;
				byte[] var6 = field338;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1383 = var6;
				field338 = var5;
				FWQLREOO.method213(17);
				field56++;
				if (field56 > 1723) {
					field56 = 0;
					field79.method4(144);
					field79.method5(0);
					int var8 = field79.field5;
					field79.method5(61);
					field79.method6(30830);
					field79.method6(40631);
					field79.method5(17);
					field79.method6((int) (Math.random() * 65536.0D));
					field79.method5((int) (Math.random() * 256.0D));
					field79.method5(172);
					field79.method6(27205);

					if ((int) (Math.random() * 2.0D) == 0) {
						field79.method5(157);
					}

					field79.method5(189);
					field79.method14(field79.field5 - var8);
				}
			}

			if (FWQLREOO.field618[24] >= arg0) {
				TKCVVLIT var9 = FWQLREOO.field612[24];
				int var10 = var9.field1386 * var9.field1385 - 1;
				int var11 = field38 * var9.field1385 * 2;
				byte[] var12 = var9.field1383;
				byte[] var13 = field338;
				for (int var14 = 0; var14 <= var10; var14++) {
					var13[var14] = var12[var14 - var11 & var10];
				}

				var9.field1383 = var13;
				field338 = var12;
				FWQLREOO.method213(24);
			}

			if (FWQLREOO.field618[34] >= arg0) {
				TKCVVLIT var15 = FWQLREOO.field612[34];
				int var16 = var15.field1386 * var15.field1385 - 1;
				int var17 = field38 * var15.field1385 * 2;
				byte[] var18 = var15.field1383;
				byte[] var19 = field338;
				for (int var20 = 0; var20 <= var16; var20++) {
					var19[var20] = var18[var20 - var17 & var16];
				}

				var15.field1383 = var19;
				field338 = var18;
				FWQLREOO.method213(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method149() {
		if (field337 && field400 == 2 && SMJSOFHG.field1342 != field98) {
			field200.method545();
			field349.method432(257, 151, "Loading - please wait.", 0);
			field349.method432(256, 150, "Loading - please wait.", 0xFFFFFF);
			field200.method546(field1361, 4, 4);
			field400 = 1;
			field309 = System.currentTimeMillis();
		}

		if (field400 == 1) {
			int var1 = method150();
			if (var1 != 0 && System.currentTimeMillis() - field309 > 360000L) {
				signlink.reporterror(field164 + " glcfb " + field37 + "," + var1 + "," + field337 + "," + field33[0] + "," + field131.method194() + "," + field98 + "," + field217 + "," + field218);
				field309 = System.currentTimeMillis();
			}
		}

		if (field400 == 2 && field98 != field435) {
			field435 = field98;
			method158(field98);
		}
	}

	@ObfuscatedName("client.K(I)I")
	public final int method150() {
		for (int var1 = 0; var1 < field30.length; var1++) {
			if (field30[var1] == null && field302[var1] != -1) {
				return -1;
			}

			if (field43[var1] == null && field303[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field30.length; var3++) {
			byte[] var4 = field43[var3];
			if (var4 != null) {
				int var5 = (field301[var3] >> 8) * 64 - field258;
				int var6 = (field301[var3] & 0xFF) * 64 - field259;
				var2 &= SMJSOFHG.method491(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field443) {
			return -4;
		} else {
			field400 = 2;
			SMJSOFHG.field1342 = field98;
			method39();
			field79.method4(15);
			return 0;
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field204.method518(arg3, arg2);
		field205.method518(arg3, arg0 + arg2 - 16);
		GEFFBGXP.method228(arg2 + 16, arg0 - 32, 16, arg3, field228);
		int var6 = (arg0 - 32) * arg0 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg4 / (arg1 - arg0);
		GEFFBGXP.method228(arg2 + var7 + 16, var6, 16, arg3, field280);
		GEFFBGXP.method233(var6, arg3, arg2 + var7 + 16, field414);
		GEFFBGXP.method233(var6, arg3 + 1, arg2 + 16 + var7, field414);
		GEFFBGXP.method231(arg3, 16, arg2 + var7 + 16, field414);
		GEFFBGXP.method231(arg3, 16, arg2 + var7 + 17, field414);
		GEFFBGXP.method233(var6, arg3 + 15, arg2 + 16 + var7, field221);
		GEFFBGXP.method233(var6 - 1, arg3 + 14, arg2 + var7 + 17, field221);
		GEFFBGXP.method231(arg3, 16, arg2 + var7 + var6 + 15, field221);
		GEFFBGXP.method231(arg3 + 1, 15, arg2 + var7 + var6 + 14, field221);
	}

	@ObfuscatedName("client.j(B)V")
	public final void method152() {
		try {
			int var1 = field381.field1111 + field412;
			int var2 = field381.field1112 + field62;
			if (field192 - var1 < -500 || field192 - var1 > 500 || field193 - var2 < -500 || field193 - var2 > 500) {
				field192 = var1;
				field193 = var2;
			}

			if (field192 != var1) {
				field192 += (var1 - field192) / 16;
			}

			if (field193 != var2) {
				field193 += (var2 - field193) / 16;
			}

			if (field1379[1] == 1) {
				field75 += (-field75 - 24) / 2;
			} else if (field1379[2] == 1) {
				field75 += (24 - field75) / 2;
			} else {
				field75 /= 2;
			}

			if (field1379[3] == 1) {
				field76 += (12 - field76) / 2;
			} else if (field1379[4] == 1) {
				field76 += (-field76 - 12) / 2;
			} else {
				field76 /= 2;
			}

			field74 = field75 / 2 + field74 & 0x7FF;
			field73 += field76 / 2;
			if (field73 < 128) {
				field73 = 128;
			}

			if (field73 > 383) {
				field73 = 383;
			}

			int var3 = field192 >> 7;
			int var4 = field193 >> 7;
			int var5 = method94(field192, field193, field98);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field98;
						if (var9 < 3 && (field333[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field51[var9][var7][var8];
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

			if (var11 > field379) {
				field379 += (var11 - field379) / 24;
			} else if (var11 < field379) {
				field379 += (var11 - field379) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field381.field1111 + "," + field381.field1112 + "," + field192 + "," + field193 + "," + field217 + "," + field218 + "," + field258 + "," + field259);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LETSIPTYG;I)Z")
	public final boolean method153(ETSIPTYG arg0) {
		int var2 = arg0.field531;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field216[field225] = "Remove @whi@" + arg0.field497;
				field432[field225] = 801;
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

		field216[field225] = "Remove @whi@" + field121[var2];
		field432[field225] = 361;
		field225++;
		field216[field225] = "Message @whi@" + field121[var2];
		field432[field225] = 281;
		field225++;
		return true;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1364 != null) {
				return new URL("http://127.0.0.1:" + (field335 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method154() {
		if (field423 > 1) {
			field423--;
		}

		if (field215 > 0) {
			field215--;
		}

		for (int var1 = 0; var1 < 5 && method56(); var1++) {
		}

		if (field407) {
			synchronized (field406.field1217) {
				if (!field358) {
					field406.field1218 = 0;
				} else if (field1375 != 0 || field406.field1218 >= 40) {
					field79.method4(116);
					field79.method5(0);
					int var3 = field79.field5;
					int var4 = 0;
					for (int var5 = 0; var5 < field406.field1218 && var3 - field79.field5 < 240; var5++) {
						var4++;
						int var6 = field406.field1219[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field406.field1222[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field406.field1219[var5] == -1 && field406.field1222[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field366 != var7 || field367 != var6) {
							int var9 = var7 - field366;
							field366 = var7;
							int var10 = var6 - field367;
							field367 = var6;

							if (field372 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field79.method6((field372 << 12) + (var9 << 6) + var10);
								field372 = 0;
							} else if (field372 < 8) {
								field79.method8((field372 << 19) + var8 + 0x800000);
								field372 = 0;
							} else {
								field79.method9((field372 << 19) + var8 - 0x40000000);
								field372 = 0;
							}
						} else if (field372 < 2047) {
							field372++;
						}
					}

					field79.method14(field79.field5 - var3);

					if (var4 >= field406.field1218) {
						field406.field1218 = 0;
					} else {
						field406.field1218 -= var4;
						for (int var11 = 0; var11 < field406.field1218; var11++) {
							field406.field1222[var11] = field406.field1222[var4 + var11];
							field406.field1219[var11] = field406.field1219[var4 + var11];
						}
					}
				}
			}

			if (field1375 != 0) {
				long var12 = (field1378 - field429) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field429 = field1378;
				int var14 = field1377;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1376;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1375 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field79.method4(251);
				field79.method9((var17 << 19) + (var18 << 20) + var16);
			}

			if (field194 > 0) {
				field194--;
			}

			if (field1379[1] == 1 || field1379[2] == 1 || field1379[3] == 1 || field1379[4] == 1) {
				field195 = true;
			}

			if (field195 && field194 <= 0) {
				field194 = 20;
				field195 = false;
				field79.method4(20);
				field79.method6(field73);
				field79.method6(field74);
			}

			if (field1366 && !field49) {
				field49 = true;
				field79.method4(206);
				field79.method5(1);
			}

			if (!field1366 && field49) {
				field49 = false;
				field79.method4(206);
				field79.method5(0);
			}

			method149();
			method135();
			method95();
			field213++;
			if (field213 > 750) {
				method127();
			}

			method162();
			method78();
			method47();
			field38++;

			if (field158 != 0) {
				field157 += 20;
				if (field157 >= 400) {
					field158 = 0;
				}
			}

			if (field273 != 0) {
				field270++;
				if (field270 >= 15) {
					if (field273 == 2) {
						field96 = true;
					}

					if (field273 == 3) {
						field125 = true;
					}

					field273 = 0;
				}
			}

			if (field188 != 0) {
				field50++;

				if (field1369 > field189 + 5 || field1369 < field189 - 5 || field1370 > field190 + 5 || field1370 < field190 - 5) {
					field232 = true;
				}

				if (field1368 == 0) {
					if (field188 == 2) {
						field96 = true;
					}

					if (field188 == 3) {
						field125 = true;
					}

					field188 = 0;

					if (field232 && field50 >= 5) {
						field398 = -1;
						method132();

						if (field398 == field186 && field397 != field187) {
							ETSIPTYG var19 = ETSIPTYG.field499[field186];
							byte var20 = 0;
							if (field105 == 1 && var19.field531 == 206) {
								var20 = 1;
							}

							if (var19.field507[field397] <= 0) {
								var20 = 0;
							}

							if (var19.field483) {
								int var21 = field187;
								int var22 = field397;
								var19.field507[var22] = var19.field507[var21];
								var19.field510[var22] = var19.field510[var21];
								var19.field507[var21] = -1;
								var19.field510[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field187;
								int var24 = field397;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method176(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method176(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method176(field397, field187);
							}

							field79.method4(19);
							field79.method6(field186);
							field79.method6(field187);
							field79.method6(field397);
							field79.method5(var20);
						}
					} else if ((field81 == 1 || method113(field225 - 1)) && field225 > 2) {
						method157();
					} else if (field225 > 0) {
						method49(field225 - 1);
					}

					field270 = 10;
					field1375 = 0;
				}
			}

			field219++;
			if (field219 > 1046) {
				field219 = 0;
				field79.method4(129);
				field79.method5(0);
				int var25 = field79.field5;
				field79.method5(12);
				field79.method6(39329);

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method6(27202);
				}

				field79.method5((int) (Math.random() * 256.0D));
				field79.method6(11442);

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method5(72);
				}

				field79.method6(32187);
				field79.method5(71);

				if ((int) (Math.random() * 2.0D) == 0) {
					field79.method6(59223);
				}

				field79.method6(26405);
				field79.method14(field79.field5 - var25);
			}

			if (HFOJZUJK.field706 != -1) {
				int var26 = HFOJZUJK.field706;
				int var27 = HFOJZUJK.field707;
				boolean var28 = method138(field381.field1119[0], field381.field1118[0], 0, var26, 0, 0, true, 0, var27, 0, 0);
				HFOJZUJK.field706 = -1;

				if (var28) {
					field155 = field1376;
					field156 = field1377;
					field158 = 1;
					field157 = 0;
				}
			}

			if (field1375 == 1 && field308 != null) {
				field308 = null;
				field125 = true;
				field1375 = 0;
			}

			method58();
			method61();
			method76();
			method70();

			if (field1368 == 1 || field1375 == 1) {
				field224++;
			}

			if (field400 == 2) {
				method152();
			}

			if (field400 == 2 && field28) {
				method38();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field248[var29]++;
			}

			method71();
			field1367++;
			if (field1367 > 4500) {
				field215 = 250;
				field1367 -= 500;
				field79.method4(119);
			}

			field415++;
			if (field415 > 500) {
				field415 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field412 += field413;
				}

				if ((var30 & 0x2) == 2) {
					field62 += field63;
				}

				if ((var30 & 0x4) == 4) {
					field330 += field331;
				}
			}

			if (field412 < -50) {
				field413 = 2;
			}

			if (field412 > 50) {
				field413 = -2;
			}

			if (field62 < -55) {
				field63 = 2;
			}

			if (field62 > 55) {
				field63 = -2;
			}

			if (field330 < -40) {
				field331 = 1;
			}

			if (field330 > 40) {
				field331 = -1;
			}

			field346++;
			if (field346 > 500) {
				field346 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field58 += field59;
				}

				if ((var31 & 0x2) == 2) {
					field146 += field147;
				}
			}

			if (field58 < -60) {
				field59 = 2;
			}

			if (field58 > 60) {
				field59 = -2;
			}

			if (field146 < -20) {
				field147 = 1;
			}

			if (field146 > 10) {
				field147 = -1;
			}

			field214++;
			if (field214 > 50) {
				field79.method4(21);
			}

			try {
				if (field161 != null && field79.field5 > 0) {
					field161.method322(field79.field4, field79.field5, 0);
					field79.field5 = 0;
					field214 = 0;
				}
			} catch (IOException var33) {
				method127();
			} catch (Exception var34) {
				method169();
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method155() {
		byte[] var1 = field417.method429("title.dat", null);
		YZDAHXEQ var2 = new YZDAHXEQ(var1, this);
		field109.method545();
		var2.method551(0, 0);
		field110.method545();
		var2.method551(0, -637);
		field106.method545();
		var2.method551(0, -128);
		field107.method545();
		var2.method551(-371, -202);
		field108.method545();
		var2.method551(-171, -202);
		field111.method545();
		var2.method551(-265, 0);
		field112.method545();
		var2.method551(-265, -562);
		field113.method545();
		var2.method551(-171, -128);
		field114.method545();
		var2.method551(-171, -562);
		int[] var3 = new int[var2.field1475];
		for (int var4 = 0; var4 < var2.field1476; var4++) {
			for (int var5 = 0; var5 < var2.field1475; var5++) {
				var3[var5] = var2.field1474[var2.field1475 * var4 + var2.field1475 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1475; var6++) {
				var2.field1474[var2.field1475 * var4 + var6] = var3[var6];
			}
		}

		field109.method545();
		var2.method551(0, 382);
		field110.method545();
		var2.method551(0, -255);
		field106.method545();
		var2.method551(0, 254);
		field107.method545();
		var2.method551(-371, 180);
		field108.method545();
		var2.method551(-171, 180);
		field111.method545();
		var2.method551(-265, 382);
		field112.method545();
		var2.method551(-265, -180);
		field113.method545();
		var2.method551(-171, 254);
		field114.method545();
		var2.method551(-171, -180);
		YZDAHXEQ var7 = new YZDAHXEQ(field417, "logo", 0);
		field106.method545();
		var7.method553(382 - var7.field1475 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.d(ILBJPWOXRJ;I)V")
	public final void method156(int arg0, BJPWOXRJ arg1) {
		int var3 = arg1.method26(8);
		if (var3 < field325) {
			for (int var4 = var3; var4 < field325; var4++) {
				field235[field234++] = field326[var4];
			}
		}

		if (var3 > field325) {
			signlink.reporterror(field164 + " Too many players");
			throw new RuntimeException("eek");
		}

		field325 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field326[var5];
			QVUHZTUC var7 = field324[var6];
			int var8 = arg1.method26(1);
			if (var8 == 0) {
				field326[field325++] = var6;
				var7.field1106 = field239;
			} else {
				int var9 = arg1.method26(2);
				if (var9 == 0) {
					field326[field325++] = var6;
					var7.field1106 = field239;
					field328[field327++] = var6;
				} else if (var9 == 1) {
					field326[field325++] = var6;
					var7.field1106 = field239;
					int var10 = arg1.method26(3);
					var7.method449(false, var10);
					int var11 = arg1.method26(1);
					if (var11 == 1) {
						field328[field327++] = var6;
					}
				} else if (var9 == 2) {
					field326[field325++] = var6;
					var7.field1106 = field239;
					int var12 = arg1.method26(3);
					var7.method449(true, var12);
					int var13 = arg1.method26(3);
					var7.method449(true, var13);
					int var14 = arg1.method26(1);
					if (var14 == 1) {
						field328[field327++] = var6;
					}
				} else if (var9 == 3) {
					field235[field234++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method157() {
		int var1 = field350.method434("Choose Option");
		for (int var2 = 0; var2 < field225; var2++) {
			int var3 = field350.method434(field216[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field225 * 15 + 21;
		if (field1376 > 4 && field1377 > 4 && field1376 < 516 && field1377 < 338) {
			int var5 = field1376 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1377 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field89 = true;
			field67 = 0;
			field68 = var5;
			field69 = var6;
			field70 = var1;
			field71 = field225 * 15 + 22;
		}

		if (field1376 > 553 && field1377 > 205 && field1376 < 743 && field1377 < 466) {
			int var7 = field1376 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1377 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field89 = true;
			field67 = 1;
			field68 = var7;
			field69 = var8;
			field70 = var1;
			field71 = field225 * 15 + 22;
		}

		if (field1376 > 17 && field1377 > 357 && field1376 < 496 && field1377 < 453) {
			int var9 = field1376 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1377 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field89 = true;
			field67 = 2;
			field68 = var9;
			field69 = var10;
			field70 = var1;
			field71 = field225 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method158(int arg0) {
		int[] var2 = field370.field1474;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field333[arg0][var7][var5] & 0x18) == 0) {
					field207.method280(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field333[arg0 + 1][var7][var5] & 0x8) != 0) {
					field207.method280(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field78++;
		if (field78 > 1190) {
			field78 = 0;
			field79.method4(11);
			field79.method5(0);
			int var8 = field79.field5;
			field79.method5((int) (Math.random() * 256.0D));
			field79.method6(31648);
			field79.method5(22);
			field79.method5((int) (Math.random() * 256.0D));
			field79.method6(23169);
			field79.method6(19661);
			field79.method6((int) (Math.random() * 65536.0D));
			field79.method6((int) (Math.random() * 65536.0D));
			field79.method5(16);
			field79.method5((int) (Math.random() * 256.0D));
			field79.method14(field79.field5 - var8);
		}

		int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field370.method548();

		for (int var11 = 1; var11 < 103; var11++) {
			for (int var12 = 1; var12 < 103; var12++) {
				if ((field333[arg0][var12][var11] & 0x18) == 0) {
					method86(arg0, var12, var9, var11, var10);
				}

				if (arg0 < 3 && (field333[arg0 + 1][var12][var11] & 0x8) != 0) {
					method86(arg0 + 1, var12, var9, var11, var10);
				}
			}
		}

		field200.method545();
		field382 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field207.method274(field98, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = KZRNPNVL.method401(var15).field968;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field29[field98].field750;
							for (int var22 = 0; var22 < 10; var22++) {
								int var23 = (int) (Math.random() * 4.0D);
								if (var23 == 0 && var17 > 0 && var17 > var13 - 3 && (var21[var17 - 1][var18] & 0x280108) == 0) {
									var17--;
								}

								if (var23 == 1 && var17 < var19 - 1 && var17 < var13 + 3 && (var21[var17 + 1][var18] & 0x280180) == 0) {
									var17++;
								}

								if (var23 == 2 && var18 > 0 && var18 > var14 - 3 && (var21[var17][var18 - 1] & 0x280102) == 0) {
									var18--;
								}

								if (var23 == 3 && var18 < var20 - 1 && var18 < var14 + 3 && (var21[var17][var18 + 1] & 0x280120) == 0) {
									var18++;
								}
							}
						}

						field60[field382] = field396[var16];
						field383[field382] = var17;
						field384[field382] = var18;
						field382++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(ILBJPWOXRJ;I)V")
	public final void method159(BJPWOXRJ arg0, int arg1) {
		field234 = 0;
		field327 = 0;
		method117(arg1, arg0);
		method156(arg1, arg0);
		method93(arg0, arg1);
		method66(arg1, arg0);

		for (int var3 = 0; var3 < field234; var3++) {
			int var4 = field235[var3];
			if (field239 != field324[var4].field1106) {
				field324[var4] = null;
			}
		}

		if (arg0.field5 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field5 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field325; var5++) {
			if (field324[field326[var5]] == null) {
				signlink.reporterror(field164 + " null entry in pl list - pos:" + var5 + " size:" + field325);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public static final void method160() {
		HFOJZUJK.field672 = false;
		FWQLREOO.field599 = false;
		field337 = false;
		SMJSOFHG.field1338 = false;
		KZRNPNVL.field973 = false;
	}

	@ObfuscatedName("client.a(BII)Ljava/lang/String;")
	public static final String method161(int arg0, int arg1) {
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

	@ObfuscatedName("client.q(Z)V")
	public final void method162() {
		for (int var1 = -1; var1 < field325; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field323;
			} else {
				var2 = field326[var1];
			}

			QVUHZTUC var3 = field324[var2];
			if (var3 != null) {
				method79(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IILYZDAHXEQ;I)V")
	public final void method163(int arg0, YZDAHXEQ arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field74 + field58 & 0x7FF;
			int var6 = JLNSJQDR.field885[var5];
			int var7 = JLNSJQDR.field886[var5];
			var6 = var6 * 256 / (field146 + 256);
			var7 = var7 * 256 / (field146 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field320.method558(15, var12 + 94 + 4 - 10, 15, 20, 256, var10, 20, 83 - var13 - 20);
		} else {
			method65(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(ILETSIPTYG;ZIIII)V")
	public final void method164(int arg0, ETSIPTYG arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field493 == 0 && arg1.field523 != null && !arg1.field490 && (arg0 >= arg4 && arg2 >= arg5 && arg0 <= arg1.field524 + arg4 && arg2 <= arg1.field482 + arg5)) {
			int var7 = arg1.field523.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field495[var8] + arg4;
				int var10 = arg1.field487[var8] + arg5 - arg3;
				ETSIPTYG var11 = ETSIPTYG.field499[arg1.field523[var8]];
				var9 += var11.field500;
				var10 += var11.field504;
				if ((var11.field520 >= 0 || var11.field511 != 0) && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
					if (var11.field520 >= 0) {
						field411 = var11.field520;
					} else {
						field411 = var11.field506;
					}
				}

				if (var11.field493 == 0) {
					method164(arg0, var11, arg2, var11.field522, var9, var10);

					if (var11.field473 > var11.field482) {
						method90(arg0, arg2, true, var11.field482, var11.field524 + var9, var10, var11.field473, var11);
					}
				} else {
					if (var11.field530 == 1 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						boolean var12 = false;
						if (var11.field531 != 0) {
							var12 = method153(var11);
						}

						if (!var12) {
							field216[field225] = var11.field527;
							field432[field225] = 760;
							field431[field225] = var11.field506;
							field225++;
						}
					}

					if (var11.field530 == 2 && field138 == 0 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						String var13 = var11.field477;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field216[field225] = var13 + " @gre@" + var11.field525;
						field432[field225] = 233;
						field431[field225] = var11.field506;
						field225++;
					}

					if (var11.field530 == 3 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						field216[field225] = "Close";
						field432[field225] = 214;
						field431[field225] = var11.field506;
						field225++;
					}

					if (var11.field530 == 4 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						field216[field225] = var11.field527;
						field432[field225] = 907;
						field431[field225] = var11.field506;
						field225++;
					}

					if (var11.field530 == 5 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						field216[field225] = var11.field527;
						field432[field225] = 707;
						field431[field225] = var11.field506;
						field225++;
					}

					if (var11.field530 == 6 && !field53 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field524 + var9 && arg2 < var11.field482 + var10) {
						field216[field225] = var11.field527;
						field432[field225] = 83;
						field431[field225] = var11.field506;
						field225++;
					}

					if (var11.field493 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field482; var15++) {
							for (int var16 = 0; var16 < var11.field524; var16++) {
								int var17 = (var11.field517 + 32) * var16 + var9;
								int var18 = (var11.field535 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field498[var14];
									var18 += var11.field488[var14];
								}

								if (arg0 >= var17 && arg2 >= var18 && arg0 < var17 + 32 && arg2 < var18 + 32) {
									field397 = var14;
									field398 = var11.field506;

									if (var11.field507[var14] > 0) {
										LGNJKIJR var19 = LGNJKIJR.method409(var11.field507[var14] - 1);
										if (field444 == 1 && var11.field513) {
											if (field446 != var11.field506 || field445 != var14) {
												field216[field225] = "Use " + field448 + " with @lre@" + var19.field1012;
												field432[field225] = 780;
												field433[field225] = var19.field1005;
												field430[field225] = var14;
												field431[field225] = var11.field506;
												field225++;
											}
										} else if (field138 != 1 || !var11.field513) {
											if (var11.field513) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field993 != null && var19.field993[var20] != null) {
														field216[field225] = var19.field993[var20] + " @lre@" + var19.field1012;

														if (var20 == 3) {
															field432[field225] = 86;
														}

														if (var20 == 4) {
															field432[field225] = 275;
														}

														field433[field225] = var19.field1005;
														field430[field225] = var14;
														field431[field225] = var11.field506;
														field225++;
													} else if (var20 == 4) {
														field216[field225] = "Drop @lre@" + var19.field1012;
														field432[field225] = 275;
														field433[field225] = var19.field1005;
														field430[field225] = var14;
														field431[field225] = var11.field506;
														field225++;
													}
												}
											}

											if (var11.field478) {
												field216[field225] = "Use @lre@" + var19.field1012;
												field432[field225] = 606;
												field433[field225] = var19.field1005;
												field430[field225] = var14;
												field431[field225] = var11.field506;
												field225++;
											}

											if (var11.field513 && var19.field993 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field993[var21] != null) {
														field216[field225] = var19.field993[var21] + " @lre@" + var19.field1012;

														if (var21 == 0) {
															field432[field225] = 615;
														}

														if (var21 == 1) {
															field432[field225] = 998;
														}

														if (var21 == 2) {
															field432[field225] = 934;
														}

														field433[field225] = var19.field1005;
														field430[field225] = var14;
														field431[field225] = var11.field506;
														field225++;
													}
												}
											}

											if (var11.field480 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field480[var22] != null) {
														field216[field225] = var11.field480[var22] + " @lre@" + var19.field1012;

														if (var22 == 0) {
															field432[field225] = 222;
														}

														if (var22 == 1) {
															field432[field225] = 472;
														}

														if (var22 == 2) {
															field432[field225] = 381;
														}

														if (var22 == 3) {
															field432[field225] = 628;
														}

														if (var22 == 4) {
															field432[field225] = 502;
														}

														field433[field225] = var19.field1005;
														field430[field225] = var14;
														field431[field225] = var11.field506;
														field225++;
													}
												}
											}

											field216[field225] = "Examine @lre@" + var19.field1012;
											field432[field225] = 1918;
											field433[field225] = var19.field1005;
											field430[field225] = var14;
											field431[field225] = var11.field506;
											field225++;
										} else if ((field140 & 0x10) == 0x10) {
											field216[field225] = field141 + " @lre@" + var19.field1012;
											field432[field225] = 662;
											field433[field225] = var19.field1005;
											field430[field225] = var14;
											field431[field225] = var11.field506;
											field225++;
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

	@ObfuscatedName("client.b(LETSIPTYG;I)Z")
	public final boolean method165(ETSIPTYG arg0) {
		if (arg0.field505 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field505.length; var2++) {
			int var3 = method104(var2, arg0);
			int var4 = arg0.field489[var2];
			if (arg0.field505[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field505[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field505[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method166(String arg0, int arg1) {
		field120 = arg1;
		field355 = arg0;
		method101();

		if (field417 == null) {
			super.method166(arg0, arg1);
		} else {
			field108.method545();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field350.method432(var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			GEFFBGXP.method229(var3 / 2 - 152, 34, 304, var6, 0x8C1111);
			GEFFBGXP.method229(var3 / 2 - 151, 32, 302, var6 + 1, 0);
			GEFFBGXP.method228(var6 + 2, 30, arg1 * 3, var3 / 2 - 150, 0x8C1111);
			GEFFBGXP.method228(var6 + 2, 30, 300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), 0);
			field350.method432(var3 / 2, var4 / 2 + 5 - var5, arg0, 0xFFFFFF);
			field108.method546(field1361, 171, 202);

			if (field347) {
				field347 = false;

				if (!field92) {
					field109.method546(field1361, 0, 0);
					field110.method546(field1361, 0, 637);
				}

				field106.method546(field1361, 0, 128);
				field107.method546(field1361, 371, 202);
				field111.method546(field1361, 265, 0);
				field112.method546(field1361, 265, 562);
				field113.method546(field1361, 171, 128);
				field114.method546(field1361, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.a(LWHUVIHKW;I)V")
	public final void method167(WHUVIHKW arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1414 == 0) {
			var2 = field207.method271(arg0.field1413, arg0.field1415, arg0.field1416);
		}

		if (arg0.field1414 == 1) {
			var2 = field207.method272(arg0.field1416, arg0.field1415, arg0.field1413);
		}

		if (arg0.field1414 == 2) {
			var2 = field207.method273(arg0.field1413, arg0.field1415, arg0.field1416);
		}

		if (arg0.field1414 == 3) {
			var2 = field207.method274(arg0.field1413, arg0.field1415, arg0.field1416);
		}

		if (var2 != 0) {
			int var6 = field207.method275(arg0.field1413, arg0.field1415, arg0.field1416, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1422 = var3;
		arg0.field1424 = var4;
		arg0.field1423 = var5;
	}

	@ObfuscatedName("client.a(ILETSIPTYG;)Z")
	public final boolean method168(ETSIPTYG arg0) {
		int var2 = arg0.field531;
		if (field160 == 2) {
			if (var2 == 201) {
				field125 = true;
				field210 = false;
				field34 = true;
				field136 = "";
				field268 = 1;
				field419 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field125 = true;
				field210 = false;
				field34 = true;
				field136 = "";
				field268 = 2;
				field419 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field215 = 250;
			return true;
		}

		if (var2 == 501) {
			field125 = true;
			field210 = false;
			field34 = true;
			field136 = "";
			field268 = 4;
			field419 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field125 = true;
			field210 = false;
			field34 = true;
			field136 = "";
			field268 = 5;
			field419 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field321[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = RHGWIWMQ.field1267 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= RHGWIWMQ.field1267) {
							var5 = 0;
						}
					}

					if (!RHGWIWMQ.field1268[var5].field1274 && RHGWIWMQ.field1268[var5].field1269 == var3 + (field436 ? 0 : 7)) {
						break;
					}
				}

				field321[var3] = var5;
				field249 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field387[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field102[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field102[var6].length) {
					var8 = 0;
				}
			}

			field387[var6] = var8;
			field249 = true;
		}

		if (var2 == 324 && !field436) {
			field436 = true;
			method69();
		}

		if (var2 == 325 && field436) {
			field436 = false;
			method69();
		}

		if (var2 == 326) {
			field79.method4(90);
			field79.method5(field436 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field79.method5(field321[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field79.method5(field387[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field311 = !field311;
		}

		if (var2 >= 601 && var2 <= 612) {
			method98();

			if (field395.length() > 0) {
				field79.method4(118);
				field79.method11(PQGPOSRV.method459(field395));
				field79.method5(var2 - 601);
				field79.method5(field311 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method169() {
		try {
			if (field161 != null) {
				field161.method318();
			}
		} catch (Exception var2) {
		}

		field161 = null;
		field407 = false;
		field55 = 0;
		field164 = "";
		field165 = "";
		method147();
		field207.method245();

		for (int var1 = 0; var1 < 4; var1++) {
			field29[var1].method299();
		}

		System.gc();
		method35();
		field344 = -1;
		field364 = -1;
		field88 = 0;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method170() {
		if (field201 == null) {
			method136();
			field1362 = null;
			field106 = null;
			field107 = null;
			field108 = null;
			field109 = null;
			field110 = null;
			field111 = null;
			field112 = null;
			field113 = null;
			field114 = null;
			field201 = new YOIXICCU(479, method143(), 96);
			field199 = new YOIXICCU(172, method143(), 156);
			GEFFBGXP.method226();
			field306.method518(0, 0);
			field198 = new YOIXICCU(190, method143(), 261);
			field200 = new YOIXICCU(512, method143(), 334);
			GEFFBGXP.method226();
			field317 = new YOIXICCU(496, method143(), 50);
			field318 = new YOIXICCU(269, method143(), 37);
			field319 = new YOIXICCU(249, method143(), 45);
			field347 = true;
		}
	}

	@ObfuscatedName("client.b(ILBJPWOXRJ;Z)V")
	public final void method171(int arg0, BJPWOXRJ arg1) {
		field234 = 0;
		field327 = 0;
		method74(arg1, arg0);
		method137(arg0, arg1);
		method134(arg1, arg0);

		for (int var3 = 0; var3 < field234; var3++) {
			int var4 = field235[var3];
			if (field239 != field116[var4].field1106) {
				field116[var4].field735 = null;
				field116[var4] = null;
			}
		}

		if (arg1.field5 != arg0) {
			signlink.reporterror(field164 + " size mismatch in getnpcpos - pos:" + arg1.field5 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field117; var5++) {
			if (field116[field118[var5]] == null) {
				signlink.reporterror(field164 + " null entry in npc list - pos:" + var5 + " size:" + field117);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method172() {
		for (GVHVJOWK var1 = (GVHVJOWK) field91.method471(); var1 != null; var1 = (GVHVJOWK) field91.method473()) {
			if (field98 != var1.field671 || field239 > var1.field660) {
				var1.method430();
			} else if (field239 >= var1.field659) {
				if (var1.field650 > 0) {
					HGVATLQF var2 = field116[var1.field650 - 1];
					if (var2 != null && var2.field1111 >= 0 && var2.field1111 < 13312 && var2.field1112 >= 0 && var2.field1112 < 13312) {
						var1.method242(var2.field1111, method94(var2.field1111, var2.field1112, var1.field671) - var1.field664, field239, var2.field1112);
					}
				}

				if (var1.field650 < 0) {
					int var3 = -var1.field650 - 1;
					QVUHZTUC var4;
					if (field36 == var3) {
						var4 = field381;
					} else {
						var4 = field324[var3];
					}

					if (var4 != null && var4.field1111 >= 0 && var4.field1111 < 13312 && var4.field1112 >= 0 && var4.field1112 < 13312) {
						var1.method242(var4.field1111, method94(var4.field1111, var4.field1112, var1.field671) - var1.field664, field239, var4.field1112);
					}
				}

				var1.method243(field38);
				field207.method256(60, var1, field98, -1, (int) var1.field658, var1.field665, (int) var1.field656, (int) var1.field657, false);
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method173(int arg0) {
		ETSIPTYG var2 = ETSIPTYG.field499[arg0];
		for (int var3 = 0; var3 < var2.field523.length && var2.field523[var3] != -1; var3++) {
			ETSIPTYG var4 = ETSIPTYG.field499[var2.field523[var3]];
			if (var4.field493 == 1) {
				method173(var4.field506);
			}

			var4.field492 = 0;
			var4.field486 = 0;
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(BIIIIIII)V")
	public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
			if (field337 && field98 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field207.method271(arg3, arg1, arg5);
			}

			if (arg4 == 1) {
				var8 = field207.method272(arg5, arg1, arg3);
			}

			if (arg4 == 2) {
				var8 = field207.method273(arg3, arg1, arg5);
			}

			if (arg4 == 3) {
				var8 = field207.method274(arg3, arg1, arg5);
			}

			if (var8 != 0) {
				int var12 = field207.method275(arg3, arg1, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field207.method262(arg5, arg3, arg1);
					KZRNPNVL var16 = KZRNPNVL.method401(var13);
					if (var16.field965) {
						field29[arg3].method304(arg1, var16.field966, arg5, var15, var14);
					}
				}

				if (arg4 == 1) {
					field207.method263(arg3, arg5, arg1);
				}

				if (arg4 == 2) {
					field207.method264(arg5, arg3, arg1);
					KZRNPNVL var17 = KZRNPNVL.method401(var13);
					if (var17.field946 + arg1 > 103 || var17.field946 + arg5 > 103 || var17.field974 + arg1 > 103 || var17.field974 + arg5 > 103) {
						return;
					}

					if (var17.field965) {
						field29[arg3].method305(arg1, var17.field974, var17.field946, arg5, var15, var17.field966);
					}
				}

				if (arg4 == 3) {
					field207.method265(arg3, arg1, arg5);
					KZRNPNVL var18 = KZRNPNVL.method401(var13);
					if (var18.field965 && var18.field955) {
						field29[arg3].method307(arg1, arg5);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field333[1][arg1][arg5] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				SMJSOFHG.method505(arg0, arg1, arg2, field29[arg3], arg6, arg3, arg5, field51, field207, var19);
				return;
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field123[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field206[var3] = var2 / 4;
		}
	}
}
