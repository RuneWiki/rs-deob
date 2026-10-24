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
public final class client extends UBLCAEEN {

	@ObfuscatedName("client.J")
	public WTGHTNMN field120 = new WTGHTNMN();

	@ObfuscatedName("client.L")
	public int[] field121 = new int[9];

	@ObfuscatedName("client.M")
	public boolean field122 = false;

	@ObfuscatedName("client.hb")
	public int[] field142 = new int[ZZZESBDO.field1515];

	@ObfuscatedName("client.jb")
	public int field144 = -1;

	@ObfuscatedName("client.kb")
	public QXTIWHBH field145 = new QXTIWHBH();

	@ObfuscatedName("client.mb")
	public int field147 = 3;

	@ObfuscatedName("client.nb")
	public EMWAMCXW field148 = EMWAMCXW.method205(1);

	@ObfuscatedName("client.tb")
	public boolean field153 = false;

	@ObfuscatedName("client.yb")
	public int[] field158 = new int[33];

	@ObfuscatedName("client.Bb")
	public boolean field160 = false;

	@ObfuscatedName("client.Eb")
	public int field163 = 1;

	@ObfuscatedName("client.Fb")
	public int[] field164 = new int[2000];

	@ObfuscatedName("client.Gb")
	public EMWAMCXW field165 = EMWAMCXW.method205(1);

	@ObfuscatedName("client.Ib")
	public int[] field166 = new int[ZZZESBDO.field1515];

	@ObfuscatedName("client.Jb")
	public CMELCUKG[] field167 = new CMELCUKG[100];

	@ObfuscatedName("client.Lb")
	public EMWAMCXW field169 = new EMWAMCXW(new byte[5000]);

	@ObfuscatedName("client.Mb")
	public RLTBSHTA[] field170 = new RLTBSHTA[16384];

	@ObfuscatedName("client.Ob")
	public int[] field172 = new int[16384];

	@ObfuscatedName("client.Zb")
	public String[] field183 = new String[200];

	@ObfuscatedName("client.ac")
	public int[] field184 = new int[50];

	@ObfuscatedName("client.ec")
	public String[] field188 = new String[5];

	@ObfuscatedName("client.fc")
	public boolean[] field189 = new boolean[5];

	@ObfuscatedName("client.gc")
	public String field190 = "";

	@ObfuscatedName("client.ic")
	public String[] field192 = new String[100];

	@ObfuscatedName("client.jc")
	public int[] field193 = new int[100];

	@ObfuscatedName("client.lc")
	public boolean field195 = false;

	@ObfuscatedName("client.mc")
	public int[] field196 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.oc")
	public int field198 = -1;

	@ObfuscatedName("client.yc")
	public int[] field208 = new int[33];

	@ObfuscatedName("client.zc")
	public TFHGRYAS[] field209 = new TFHGRYAS[1000];

	@ObfuscatedName("client.Ac")
	public int field210 = -1;

	@ObfuscatedName("client.Bc")
	public TFHGRYAS[] field211 = new TFHGRYAS[100];

	@ObfuscatedName("client.Cc")
	public int field212 = -1;

	@ObfuscatedName("client.Fc")
	public int[] field214 = new int[5];

	@ObfuscatedName("client.Ic")
	public WTGHTNMN field216 = new WTGHTNMN();

	@ObfuscatedName("client.Mc")
	public YSPVLGYE[] field220 = new YSPVLGYE[5];

	@ObfuscatedName("client.Rc")
	public boolean field225 = false;

	@ObfuscatedName("client.Wc")
	public boolean field227 = true;

	@ObfuscatedName("client.Yc")
	public CMELCUKG[] field229 = new CMELCUKG[2];

	@ObfuscatedName("client.ad")
	public int[] field231 = new int[1000];

	@ObfuscatedName("client.bd")
	public int[] field232 = new int[1000];

	@ObfuscatedName("client.cd")
	public final int field233 = 100;

	@ObfuscatedName("client.dd")
	public int[] field234 = new int[100];

	@ObfuscatedName("client.fd")
	public TFHGRYAS[] field236 = new TFHGRYAS[20];

	@ObfuscatedName("client.hd")
	public long[] field237 = new long[100];

	@ObfuscatedName("client.md")
	public int field242 = -1;

	@ObfuscatedName("client.pd")
	public boolean field245 = false;

	@ObfuscatedName("client.rd")
	public int field247 = 1;

	@ObfuscatedName("client.sd")
	public int field248 = -1;

	@ObfuscatedName("client.td")
	public int field249 = -1;

	@ObfuscatedName("client.ud")
	public int[][] field250 = new int[104][104];

	@ObfuscatedName("client.vd")
	public int[] field251 = new int[200];

	@ObfuscatedName("client.Cd")
	public int field258 = 2;

	@ObfuscatedName("client.Nd")
	public int[] field267 = new int[7];

	@ObfuscatedName("client.Pd")
	public TFHGRYAS[] field268 = new TFHGRYAS[32];

	@ObfuscatedName("client.Qd")
	public int[] field269 = new int[256];

	@ObfuscatedName("client.Vd")
	public boolean field274 = false;

	@ObfuscatedName("client.Xd")
	public int field276 = 50;

	@ObfuscatedName("client.Yd")
	public int[] field277 = new int[field276];

	@ObfuscatedName("client.Zd")
	public int[] field278 = new int[field276];

	@ObfuscatedName("client.ae")
	public int[] field279 = new int[field276];

	@ObfuscatedName("client.be")
	public int[] field280 = new int[field276];

	@ObfuscatedName("client.ce")
	public int[] field281 = new int[field276];

	@ObfuscatedName("client.de")
	public int[] field282 = new int[field276];

	@ObfuscatedName("client.ee")
	public int[] field283 = new int[field276];

	@ObfuscatedName("client.fe")
	public String[] field284 = new String[field276];

	@ObfuscatedName("client.he")
	public int[] field286 = new int[2000];

	@ObfuscatedName("client.je")
	public int[][] field288 = new int[104][104];

	@ObfuscatedName("client.re")
	public boolean field294 = true;

	@ObfuscatedName("client.ue")
	public String[] field296 = new String[500];

	@ObfuscatedName("client.ve")
	public int field297 = -1;

	@ObfuscatedName("client.ze")
	public int field301 = 0x4D4233;

	@ObfuscatedName("client.Ae")
	public boolean field302 = false;

	@ObfuscatedName("client.Be")
	public int field303 = 2048;

	@ObfuscatedName("client.Ce")
	public int field304 = 2047;

	@ObfuscatedName("client.De")
	public ZATRZGAA[] field305 = new ZATRZGAA[field303];

	@ObfuscatedName("client.Fe")
	public int[] field307 = new int[field303];

	@ObfuscatedName("client.He")
	public int[] field309 = new int[field303];

	@ObfuscatedName("client.Ie")
	public EMWAMCXW[] field310 = new EMWAMCXW[field303];

	@ObfuscatedName("client.Ke")
	public boolean field312 = false;

	@ObfuscatedName("client.Te")
	public int field321 = 0x332D25;

	@ObfuscatedName("client.Ye")
	public int field326 = 2;

	@ObfuscatedName("client.jf")
	public String field334 = "";

	@ObfuscatedName("client.kf")
	public long[] field335 = new long[200];

	@ObfuscatedName("client.nf")
	public boolean field337 = true;

	@ObfuscatedName("client.qf")
	public String field340 = "";

	@ObfuscatedName("client.tf")
	public int[] field341 = new int[50];

	@ObfuscatedName("client.wf")
	public int[] field344 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Cf")
	public volatile boolean field350 = false;

	@ObfuscatedName("client.Df")
	public int[][][] field351 = new int[4][13][13];

	@ObfuscatedName("client.Gf")
	public int field353 = 128;

	@ObfuscatedName("client.Kf")
	public boolean[] field357 = new boolean[5];

	@ObfuscatedName("client.Pf")
	public int field362 = 78;

	@ObfuscatedName("client.Qf")
	public int field363 = 0x766654;

	@ObfuscatedName("client.Sf")
	public boolean field364 = false;

	@ObfuscatedName("client.hg")
	public int field377 = -1;

	@ObfuscatedName("client.kg")
	public volatile boolean field380 = false;

	@ObfuscatedName("client.qg")
	public boolean field385 = false;

	@ObfuscatedName("client.tg")
	public int[] field388 = new int[ZZZESBDO.field1515];

	@ObfuscatedName("client.ug")
	public int field389 = -1;

	@ObfuscatedName("client.vg")
	public int field390 = -1;

	@ObfuscatedName("client.wg")
	public WTGHTNMN[][][] field391 = new WTGHTNMN[4][104][104];

	@ObfuscatedName("client.Cg")
	public String field397 = "";

	@ObfuscatedName("client.Kg")
	public TFHGRYAS[] field404 = new TFHGRYAS[8];

	@ObfuscatedName("client.Lg")
	public boolean field405 = false;

	@ObfuscatedName("client.Og")
	public EMWAMCXW field408 = EMWAMCXW.method205(1);

	@ObfuscatedName("client.Rg")
	public int[] field411 = new int[151];

	@ObfuscatedName("client.Vg")
	public boolean field415 = false;

	@ObfuscatedName("client.Yg")
	public boolean field417 = true;

	@ObfuscatedName("client.Zg")
	public boolean field418 = false;

	@ObfuscatedName("client.ah")
	public int field419 = -1;

	@ObfuscatedName("client.dh")
	public int[] field421 = new int[5];

	@ObfuscatedName("client.eh")
	public TFHGRYAS[] field422 = new TFHGRYAS[32];

	@ObfuscatedName("client.fh")
	public CAMRNFMB[] field423 = new CAMRNFMB[4];

	@ObfuscatedName("client.hh")
	public CMELCUKG[] field425 = new CMELCUKG[13];

	@ObfuscatedName("client.lh")
	public String field429 = "";

	@ObfuscatedName("client.mh")
	public String field430 = "";

	@ObfuscatedName("client.sh")
	public int[] field435 = new int[5];

	@ObfuscatedName("client.Ah")
	public boolean field443 = false;

	@ObfuscatedName("client.Fh")
	public int[] field448 = new int[4000];

	@ObfuscatedName("client.Gh")
	public int[] field449 = new int[4000];

	@ObfuscatedName("client.Mh")
	public int field454 = 0x23201B;

	@ObfuscatedName("client.Oh")
	public int[] field456 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Ph")
	public String field457 = "";

	@ObfuscatedName("client.Wh")
	public boolean field464 = false;

	@ObfuscatedName("client.Xh")
	public int[] field465 = new int[500];

	@ObfuscatedName("client.Yh")
	public int[] field466 = new int[500];

	@ObfuscatedName("client.Zh")
	public int[] field467 = new int[500];

	@ObfuscatedName("client.ai")
	public int[] field468 = new int[500];

	@ObfuscatedName("client.fi")
	public int[] field473 = new int[50];

	@ObfuscatedName("client.gi")
	public boolean field474 = false;

	@ObfuscatedName("client.ii")
	public int[] field475 = new int[151];

	@ObfuscatedName("client.ji")
	public boolean field476 = false;

	@ObfuscatedName("client.ki")
	public int field477 = -1;

	@ObfuscatedName("client.mi")
	public volatile boolean field478 = false;

	@ObfuscatedName("client.yi")
	public int[] field490 = new int[100];

	@ObfuscatedName("client.zi")
	public String[] field491 = new String[100];

	@ObfuscatedName("client.Ai")
	public String[] field492 = new String[100];

	@ObfuscatedName("client.Ni")
	public int field504 = -1;

	@ObfuscatedName("client.Oi")
	public boolean field505 = false;

	@ObfuscatedName("client.Ri")
	public byte[] field508 = new byte[16384];

	@ObfuscatedName("client.Si")
	public boolean field509 = true;

	@ObfuscatedName("client.Vi")
	public boolean field512 = false;

	@ObfuscatedName("client.Yi")
	public int field515 = -1;

	@ObfuscatedName("client.aj")
	public String field517 = "";

	@ObfuscatedName("client.bj")
	public int[][] field518 = new int[104][104];

	@ObfuscatedName("client.cj")
	public int[] field519 = new int[5];

	@ObfuscatedName("client.ij")
	public int field525 = 2;

	@ObfuscatedName("client.qj")
	public boolean field532 = false;

	@ObfuscatedName("client.vj")
	public int field537 = -1;

	@ObfuscatedName("client.Aj")
	public TFHGRYAS[] field541 = new TFHGRYAS[32];

	@ObfuscatedName("client.Ej")
	public int[] field545 = new int[1000];

	@ObfuscatedName("client.Gj")
	public CRC32 field547 = new CRC32();

	@ObfuscatedName("client.Hj")
	public int[] field548 = new int[5];

	@ObfuscatedName("client.Ij")
	public WTGHTNMN field549 = new WTGHTNMN();

	@ObfuscatedName("client.Rj")
	public final int[] field555 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Uj")
	public String field557 = "";

	@ObfuscatedName("client.Vj")
	public String field558 = "";

	@ObfuscatedName("client.bk")
	public boolean field562 = false;

	@ObfuscatedName("client.Ec")
	public static int[] field213 = new int[99];

	@ObfuscatedName("client.Lc")
	public static final int[][] field219 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.id")
	public static int field238 = 10;

	@ObfuscatedName("client.kd")
	public static boolean field240 = true;

	@ObfuscatedName("client.nd")
	public static BigInteger field243 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Le")
	public static String field313 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ve")
	public static int[] field323 = new int[32];

	@ObfuscatedName("client.Ng")
	public static final int[] field407 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ei")
	public static BigInteger field472 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ib")
	public int field143;

	@ObfuscatedName("client.lb")
	public int field146;

	@ObfuscatedName("client.ob")
	public int field149;

	@ObfuscatedName("client.pb")
	public int field150;

	@ObfuscatedName("client.qb")
	public int field151;

	@ObfuscatedName("client.zb")
	public int field159;

	@ObfuscatedName("client.Cb")
	public int field161;

	@ObfuscatedName("client.Db")
	public int field162;

	@ObfuscatedName("client.Nb")
	public int field171;

	@ObfuscatedName("client.Pb")
	public int field173;

	@ObfuscatedName("client.Qb")
	public int field174;

	@ObfuscatedName("client.Rb")
	public int field175;

	@ObfuscatedName("client.Sb")
	public int field176;

	@ObfuscatedName("client.Vb")
	public static int field179;

	@ObfuscatedName("client.Yb")
	public int field182;

	@ObfuscatedName("client.bc")
	public int field185;

	@ObfuscatedName("client.cc")
	public int field186;

	@ObfuscatedName("client.dc")
	public int field187;

	@ObfuscatedName("client.hc")
	public int field191;

	@ObfuscatedName("client.kc")
	public int field194;

	@ObfuscatedName("client.nc")
	public int field197;

	@ObfuscatedName("client.pc")
	public int field199;

	@ObfuscatedName("client.qc")
	public int field200;

	@ObfuscatedName("client.rc")
	public int field201;

	@ObfuscatedName("client.sc")
	public int field202;

	@ObfuscatedName("client.tc")
	public int field203;

	@ObfuscatedName("client.xc")
	public int field207;

	@ObfuscatedName("client.Hc")
	public static int field215;

	@ObfuscatedName("client.Kc")
	public int field218;

	@ObfuscatedName("client.Tc")
	public int field226;

	@ObfuscatedName("client.Xc")
	public static int field228;

	@ObfuscatedName("client.Zc")
	public int field230;

	@ObfuscatedName("client.ed")
	public int field235;

	@ObfuscatedName("client.jd")
	public static int field239;

	@ObfuscatedName("client.qd")
	public int field246;

	@ObfuscatedName("client.wd")
	public int field252;

	@ObfuscatedName("client.Bd")
	public int field257;

	@ObfuscatedName("client.Dd")
	public int field259;

	@ObfuscatedName("client.Fd")
	public int field260;

	@ObfuscatedName("client.Md")
	public int field266;

	@ObfuscatedName("client.Rd")
	public int field270;

	@ObfuscatedName("client.Sd")
	public int field271;

	@ObfuscatedName("client.Ud")
	public int field273;

	@ObfuscatedName("client.Wd")
	public int field275;

	@ObfuscatedName("client.ge")
	public static int field285;

	@ObfuscatedName("client.ie")
	public int field287;

	@ObfuscatedName("client.le")
	public int field289;

	@ObfuscatedName("client.ne")
	public int field290;

	@ObfuscatedName("client.oe")
	public int field291;

	@ObfuscatedName("client.pe")
	public int field292;

	@ObfuscatedName("client.qe")
	public int field293;

	@ObfuscatedName("client.te")
	public static int field295;

	@ObfuscatedName("client.we")
	public int field298;

	@ObfuscatedName("client.xe")
	public int field299;

	@ObfuscatedName("client.ye")
	public int field300;

	@ObfuscatedName("client.Ee")
	public int field306;

	@ObfuscatedName("client.Ge")
	public int field308;

	@ObfuscatedName("client.Je")
	public int field311;

	@ObfuscatedName("client.Me")
	public static int field314;

	@ObfuscatedName("client.Se")
	public int field320;

	@ObfuscatedName("client.We")
	public static int field324;

	@ObfuscatedName("client.Xe")
	public int field325;

	@ObfuscatedName("client.Ze")
	public int field327;

	@ObfuscatedName("client.af")
	public int field328;

	@ObfuscatedName("client.bf")
	public int field329;

	@ObfuscatedName("client.cf")
	public int field330;

	@ObfuscatedName("client.gf")
	public int field333;

	@ObfuscatedName("client.lf")
	public int field336;

	@ObfuscatedName("client.vf")
	public int field343;

	@ObfuscatedName("client.xf")
	public int field345;

	@ObfuscatedName("client.yf")
	public int field346;

	@ObfuscatedName("client.zf")
	public int field347;

	@ObfuscatedName("client.Af")
	public int field348;

	@ObfuscatedName("client.Bf")
	public int field349;

	@ObfuscatedName("client.Ff")
	public static int field352;

	@ObfuscatedName("client.Hf")
	public int field354;

	@ObfuscatedName("client.If")
	public int field355;

	@ObfuscatedName("client.Jf")
	public int field356;

	@ObfuscatedName("client.Mf")
	public int field359;

	@ObfuscatedName("client.Nf")
	public int field360;

	@ObfuscatedName("client.Tf")
	public int field365;

	@ObfuscatedName("client.Uf")
	public static int field366;

	@ObfuscatedName("client.Wf")
	public int field367;

	@ObfuscatedName("client.dg")
	public int field374;

	@ObfuscatedName("client.eg")
	public int field375;

	@ObfuscatedName("client.fg")
	public int field376;

	@ObfuscatedName("client.ig")
	public int field378;

	@ObfuscatedName("client.jg")
	public int field379;

	@ObfuscatedName("client.mg")
	public int field381;

	@ObfuscatedName("client.ng")
	public int field382;

	@ObfuscatedName("client.og")
	public int field383;

	@ObfuscatedName("client.pg")
	public int field384;

	@ObfuscatedName("client.rg")
	public int field386;

	@ObfuscatedName("client.xg")
	public int field392;

	@ObfuscatedName("client.yg")
	public int field393;

	@ObfuscatedName("client.zg")
	public int field394;

	@ObfuscatedName("client.Ag")
	public int field395;

	@ObfuscatedName("client.Bg")
	public int field396;

	@ObfuscatedName("client.Dg")
	public int field398;

	@ObfuscatedName("client.Fg")
	public int field399;

	@ObfuscatedName("client.Gg")
	public int field400;

	@ObfuscatedName("client.Hg")
	public int field401;

	@ObfuscatedName("client.Ig")
	public int field402;

	@ObfuscatedName("client.Jg")
	public int field403;

	@ObfuscatedName("client.Mg")
	public static int field406;

	@ObfuscatedName("client.Pg")
	public int field409;

	@ObfuscatedName("client.Qg")
	public int field410;

	@ObfuscatedName("client.Sg")
	public int field412;

	@ObfuscatedName("client.Ug")
	public int field414;

	@ObfuscatedName("client.Xg")
	public int field416;

	@ObfuscatedName("client.bh")
	public int field420;

	@ObfuscatedName("client.gh")
	public int field424;

	@ObfuscatedName("client.oh")
	public int field432;

	@ObfuscatedName("client.qh")
	public int field434;

	@ObfuscatedName("client.th")
	public int field436;

	@ObfuscatedName("client.uh")
	public int field437;

	@ObfuscatedName("client.vh")
	public int field438;

	@ObfuscatedName("client.wh")
	public int field439;

	@ObfuscatedName("client.xh")
	public int field440;

	@ObfuscatedName("client.yh")
	public int field441;

	@ObfuscatedName("client.Bh")
	public int field444;

	@ObfuscatedName("client.Ch")
	public int field445;

	@ObfuscatedName("client.Dh")
	public int field446;

	@ObfuscatedName("client.Eh")
	public int field447;

	@ObfuscatedName("client.Hh")
	public int field450;

	@ObfuscatedName("client.Jh")
	public int field452;

	@ObfuscatedName("client.Nh")
	public int field455;

	@ObfuscatedName("client.Vh")
	public static int field463;

	@ObfuscatedName("client.di")
	public static int field471;

	@ObfuscatedName("client.qi")
	public int field482;

	@ObfuscatedName("client.ri")
	public int field483;

	@ObfuscatedName("client.si")
	public int field484;

	@ObfuscatedName("client.ti")
	public int field485;

	@ObfuscatedName("client.ui")
	public int field486;

	@ObfuscatedName("client.vi")
	public int field487;

	@ObfuscatedName("client.xi")
	public int field489;

	@ObfuscatedName("client.Li")
	public int field502;

	@ObfuscatedName("client.Mi")
	public int field503;

	@ObfuscatedName("client.Qi")
	public static int field507;

	@ObfuscatedName("client.Ti")
	public static int field510;

	@ObfuscatedName("client.Ui")
	public int field511;

	@ObfuscatedName("client.dj")
	public int field520;

	@ObfuscatedName("client.ej")
	public int field521;

	@ObfuscatedName("client.fj")
	public int field522;

	@ObfuscatedName("client.gj")
	public int field523;

	@ObfuscatedName("client.hj")
	public int field524;

	@ObfuscatedName("client.kj")
	public int field526;

	@ObfuscatedName("client.lj")
	public int field527;

	@ObfuscatedName("client.mj")
	public int field528;

	@ObfuscatedName("client.nj")
	public int field529;

	@ObfuscatedName("client.oj")
	public int field530;

	@ObfuscatedName("client.pj")
	public int field531;

	@ObfuscatedName("client.rj")
	public int field533;

	@ObfuscatedName("client.sj")
	public int field534;

	@ObfuscatedName("client.tj")
	public int field535;

	@ObfuscatedName("client.uj")
	public int field536;

	@ObfuscatedName("client.xj")
	public int field538;

	@ObfuscatedName("client.yj")
	public static int field539;

	@ObfuscatedName("client.zj")
	public int field540;

	@ObfuscatedName("client.Bj")
	public int field542;

	@ObfuscatedName("client.Cj")
	public int field543;

	@ObfuscatedName("client.Dj")
	public int field544;

	@ObfuscatedName("client.Kj")
	public int field550;

	@ObfuscatedName("client.Lj")
	public int field551;

	@ObfuscatedName("client.Mj")
	public int field552;

	@ObfuscatedName("client.Oj")
	public int field553;

	@ObfuscatedName("client.Sj")
	public int field556;

	@ObfuscatedName("client.Xj")
	public int field559;

	@ObfuscatedName("client.Zj")
	public static int field560;

	@ObfuscatedName("client.Ad")
	public long field256;

	@ObfuscatedName("client.Td")
	public long field272;

	@ObfuscatedName("client.wi")
	public long field488;

	@ObfuscatedName("client.Pi")
	public long field506;

	@ObfuscatedName("client.Fj")
	public long field546;

	@ObfuscatedName("client.Kh")
	public CLJPNHPC field453;

	@ObfuscatedName("client.P")
	public CMELCUKG field124;

	@ObfuscatedName("client.Q")
	public CMELCUKG field125;

	@ObfuscatedName("client.R")
	public CMELCUKG field126;

	@ObfuscatedName("client.Wb")
	public CMELCUKG field180;

	@ObfuscatedName("client.Xb")
	public CMELCUKG field181;

	@ObfuscatedName("client.Hd")
	public CMELCUKG field261;

	@ObfuscatedName("client.Id")
	public CMELCUKG field262;

	@ObfuscatedName("client.Jd")
	public CMELCUKG field263;

	@ObfuscatedName("client.Kd")
	public CMELCUKG field264;

	@ObfuscatedName("client.Ld")
	public CMELCUKG field265;

	@ObfuscatedName("client.of")
	public CMELCUKG field338;

	@ObfuscatedName("client.pf")
	public CMELCUKG field339;

	@ObfuscatedName("client.ih")
	public CMELCUKG field426;

	@ObfuscatedName("client.jh")
	public CMELCUKG field427;

	@ObfuscatedName("client.kh")
	public CMELCUKG field428;

	@ObfuscatedName("client.Qh")
	public CMELCUKG field458;

	@ObfuscatedName("client.Rh")
	public CMELCUKG field459;

	@ObfuscatedName("client.Sh")
	public CMELCUKG field460;

	@ObfuscatedName("client.Th")
	public CMELCUKG field461;

	@ObfuscatedName("client.Uh")
	public CMELCUKG field462;

	@ObfuscatedName("client.ff")
	public KMIIMWED field332;

	@ObfuscatedName("client.Ih")
	public MAARFNGV field451;

	@ObfuscatedName("client.nh")
	public MWZVGOTL field431;

	@ObfuscatedName("client.W")
	public TFHGRYAS field131;

	@ObfuscatedName("client.X")
	public TFHGRYAS field132;

	@ObfuscatedName("client.uc")
	public TFHGRYAS field204;

	@ObfuscatedName("client.vc")
	public TFHGRYAS field205;

	@ObfuscatedName("client.Ne")
	public TFHGRYAS field315;

	@ObfuscatedName("client.Oe")
	public TFHGRYAS field316;

	@ObfuscatedName("client.Pe")
	public TFHGRYAS field317;

	@ObfuscatedName("client.Qe")
	public TFHGRYAS field318;

	@ObfuscatedName("client.Re")
	public TFHGRYAS field319;

	@ObfuscatedName("client.Lf")
	public TFHGRYAS field358;

	@ObfuscatedName("client.Of")
	public TFHGRYAS field361;

	@ObfuscatedName("client.Tg")
	public TFHGRYAS field413;

	@ObfuscatedName("client.ph")
	public TFHGRYAS field433;

	@ObfuscatedName("client.bi")
	public TFHGRYAS field469;

	@ObfuscatedName("client.ci")
	public TFHGRYAS field470;

	@ObfuscatedName("client.Y")
	public XBLPPVAP field133;

	@ObfuscatedName("client.Z")
	public XBLPPVAP field134;

	@ObfuscatedName("client.ab")
	public XBLPPVAP field135;

	@ObfuscatedName("client.bb")
	public XBLPPVAP field136;

	@ObfuscatedName("client.cb")
	public XBLPPVAP field137;

	@ObfuscatedName("client.db")
	public XBLPPVAP field138;

	@ObfuscatedName("client.eb")
	public XBLPPVAP field139;

	@ObfuscatedName("client.fb")
	public XBLPPVAP field140;

	@ObfuscatedName("client.gb")
	public XBLPPVAP field141;

	@ObfuscatedName("client.ub")
	public XBLPPVAP field154;

	@ObfuscatedName("client.vb")
	public XBLPPVAP field155;

	@ObfuscatedName("client.wb")
	public XBLPPVAP field156;

	@ObfuscatedName("client.xb")
	public XBLPPVAP field157;

	@ObfuscatedName("client.ni")
	public XBLPPVAP field479;

	@ObfuscatedName("client.oi")
	public XBLPPVAP field480;

	@ObfuscatedName("client.pi")
	public XBLPPVAP field481;

	@ObfuscatedName("client.Bi")
	public XBLPPVAP field493;

	@ObfuscatedName("client.Ci")
	public XBLPPVAP field494;

	@ObfuscatedName("client.Di")
	public XBLPPVAP field495;

	@ObfuscatedName("client.Ei")
	public XBLPPVAP field496;

	@ObfuscatedName("client.Fi")
	public XBLPPVAP field497;

	@ObfuscatedName("client.Gi")
	public XBLPPVAP field498;

	@ObfuscatedName("client.Hi")
	public XBLPPVAP field499;

	@ObfuscatedName("client.Ii")
	public XBLPPVAP field500;

	@ObfuscatedName("client.Ji")
	public XBLPPVAP field501;

	@ObfuscatedName("client.S")
	public XQKSIEVT field127;

	@ObfuscatedName("client.T")
	public XQKSIEVT field128;

	@ObfuscatedName("client.U")
	public XQKSIEVT field129;

	@ObfuscatedName("client.V")
	public XQKSIEVT field130;

	@ObfuscatedName("client.Jc")
	public YJYHBEIS field217;

	@ObfuscatedName("client.Pj")
	public static ZATRZGAA field554;

	@ObfuscatedName("client.Ub")
	public ZPFBNGWW field178;

	@ObfuscatedName("client.rb")
	public String field152;

	@ObfuscatedName("client.Tb")
	public String field177;

	@ObfuscatedName("client.sg")
	public String field387;

	@ObfuscatedName("client.Zi")
	public String field516;

	@ObfuscatedName("client.uf")
	public Socket field342;

	@ObfuscatedName("client.ld")
	public static boolean field241;

	@ObfuscatedName("client.od")
	public static boolean field244;

	@ObfuscatedName("client.Ue")
	public static boolean field322;

	@ObfuscatedName("client.df")
	public static boolean field331;

	@ObfuscatedName("client.Nc")
	public int[] field221;

	@ObfuscatedName("client.Oc")
	public int[] field222;

	@ObfuscatedName("client.Pc")
	public int[] field223;

	@ObfuscatedName("client.Qc")
	public int[] field224;

	@ObfuscatedName("client.xd")
	public int[] field253;

	@ObfuscatedName("client.yd")
	public int[] field254;

	@ObfuscatedName("client.zd")
	public int[] field255;

	@ObfuscatedName("client.Xf")
	public int[] field368;

	@ObfuscatedName("client.Yf")
	public int[] field369;

	@ObfuscatedName("client.Zf")
	public int[] field370;

	@ObfuscatedName("client.ag")
	public int[] field371;

	@ObfuscatedName("client.bg")
	public int[] field372;

	@ObfuscatedName("client.cg")
	public int[] field373;

	@ObfuscatedName("client.Wi")
	public int[] field513;

	@ObfuscatedName("client.Xi")
	public int[] field514;

	@ObfuscatedName("client.ak")
	public CMELCUKG[] field561;

	@ObfuscatedName("client.O")
	public byte[][] field123;

	@ObfuscatedName("client.zh")
	public byte[][] field442;

	@ObfuscatedName("client.Kb")
	public byte[][][] field168;

	@ObfuscatedName("client.wc")
	public int[][][] field206;

	@ObfuscatedName("client.c(I)V")
	public final void method40() {
		int var1 = field129.method483("Choose Option");
		for (int var2 = 0; var2 < field375; var2++) {
			int var3 = field129.method483(field296[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field375 * 15 + 21;
		if (field1214 > 4 && field1215 > 4 && field1214 < 516 && field1215 < 338) {
			int var5 = field1214 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1215 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field153 = true;
			field199 = 0;
			field200 = var5;
			field201 = var6;
			field202 = var1;
			field203 = field375 * 15 + 22;
		}

		if (field1214 > 553 && field1215 > 205 && field1214 < 743 && field1215 < 466) {
			int var7 = field1214 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1215 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field153 = true;
			field199 = 1;
			field200 = var7;
			field201 = var8;
			field202 = var1;
			field203 = field375 * 15 + 22;
		}

		if (field1214 > 17 && field1215 > 357 && field1214 < 496 && field1215 < 453) {
			int var9 = field1214 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1215 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field153 = true;
			field199 = 2;
			field200 = var9;
			field201 = var10;
			field202 = var1;
			field203 = field375 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IBLZATRZGAA;ILEMWAMCXW;)V")
	public final void method41(int arg0, ZATRZGAA arg1, int arg2, EMWAMCXW arg3) {
		if ((arg2 & 0x80) != 0) {
			int var5 = arg3.method238();
			int var6 = arg3.method236();
			arg1.method340(var5, var6, field228);
			arg1.field926 = field228 + 300;
			arg1.field927 = arg3.method237();
			arg1.field928 = arg3.method236();
		}

		if ((arg2 & 0x40) != 0) {
			arg1.field965 = arg3.method245();
			arg1.field966 = arg3.method245();
		}

		if ((arg2 & 0x20) != 0) {
			arg1.field953 = arg3.method224();
			if (arg1.field953.charAt(0) == '~') {
				arg1.field953 = arg1.field953.substring(1);
				method79(arg1.field953, 2, arg1.field1396);
			} else if (field554 == arg1) {
				method79(arg1.field953, 2, arg1.field1396);
			}

			arg1.field954 = 0;
			arg1.field940 = 0;
			arg1.field932 = 150;
		}

		if ((arg2 & 0x2) != 0) {
			int var7 = arg3.method246();
			if (var7 == 0xFFFF) {
				var7 = -1;
			}

			int var8 = arg3.method238();
			if (arg1.field942 == var7 && var7 != -1) {
				int var9 = VYXELYSX.field1273[var7].field1287;
				if (var9 == 1) {
					arg1.field943 = 0;
					arg1.field944 = 0;
					arg1.field945 = var8;
					arg1.field946 = 0;
				}

				if (var9 == 2) {
					arg1.field946 = 0;
				}
			} else if (var7 == -1 || arg1.field942 == -1 || VYXELYSX.field1273[var7].field1281 >= VYXELYSX.field1273[arg1.field942].field1281) {
				arg1.field942 = var7;
				arg1.field943 = 0;
				arg1.field944 = 0;
				arg1.field945 = var8;
				arg1.field946 = 0;
				arg1.field929 = arg1.field947;
			}
		}

		if ((arg2 & 0x10) != 0) {
			int var10 = arg3.method217();
			byte[] var11 = new byte[var10];
			EMWAMCXW var12 = new EMWAMCXW(var11);
			arg3.method255(0, var11, var10);
			field310[arg0] = var12;
			arg1.method505(var12);
		}

		if ((arg2 & 0x200) != 0) {
			int var13 = arg3.method238();
			int var14 = arg3.method236();
			arg1.method340(var13, var14, field228);
			arg1.field926 = field228 + 300;
			arg1.field927 = arg3.method236();
			arg1.field928 = arg3.method238();
		}

		if ((arg2 & 0x8) != 0) {
			int var15 = arg3.method247();
			int var16 = arg3.method236();
			int var17 = arg3.method237();
			int var18 = arg3.field617;

			if (arg1.field1396 != null && arg1.field1398) {
				long var19 = WAQVJSXE.method461(arg1.field1396);
				boolean var21 = false;
				if (var16 <= 1) {
					for (int var22 = 0; var22 < field523; var22++) {
						if (field237[var22] == var19) {
							var21 = true;
							break;
						}
					}
				}

				if (!var21 && field259 == 0) {
					try {
						field169.field617 = 0;
						arg3.method226(field169.field616, 0, var17);
						field169.field617 = 0;
						String var23 = EXGZUGXN.method256(field169, var17);
						var23 = ZWRCNFEU.method577(var23);
						arg1.field953 = var23;
						arg1.field954 = var15 >> 8;
						arg1.field940 = var15 & 0xFF;
						arg1.field932 = 150;

						if (var16 == 2 || var16 == 3) {
							method79(var23, 1, "@cr2@" + arg1.field1396);
						} else if (var16 == 1) {
							method79(var23, 1, "@cr1@" + arg1.field1396);
						} else {
							method79(var23, 2, arg1.field1396);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field617 = var17 + var18;
		}

		if ((arg2 & 0x100) != 0) {
			arg1.field958 = arg3.method238();
			arg1.field960 = arg3.method217();
			arg1.field959 = arg3.method238();
			arg1.field961 = arg3.method236();
			arg1.field962 = arg3.method247() + field228;
			arg1.field963 = arg3.method247() + field228;
			arg1.field964 = arg3.method217();
			arg1.method341();
		}

		if ((arg2 & 0x1) != 0) {
			arg1.field941 = arg3.method246();
			if (arg1.field941 == 0xFFFF) {
				arg1.field941 = -1;
			}
		}

		if ((arg2 & 0x400) != 0) {
			arg1.field921 = arg3.method245();
			int var25 = arg3.method222();
			arg1.field925 = var25 >> 16;
			arg1.field924 = (var25 & 0xFFFF) + field228;
			arg1.field922 = 0;
			arg1.field923 = 0;

			if (arg1.field924 > field228) {
				arg1.field922 = -1;
			}

			if (arg1.field921 == 0xFFFF) {
				arg1.field921 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method42() {
		if (field207 == 2) {
			method123(field394 * 2, (field393 - field328 << 7) + field396, (field392 - field327 << 7) + field395);

			if (field389 > -1 && field228 % 20 < 10) {
				field422[0].method424(field389 - 12, field390 - 28);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method43() {
		field559++;
		method92(true);
		method163(true);
		method92(false);
		method163(false);
		method54();
		method84();

		if (!field302) {
			int var1 = field353;
			if (field543 / 256 > var1) {
				var1 = field543 / 256;
			}

			if (field357[4] && field214[4] + 128 > var1) {
				var1 = field214[4] + 128;
			}

			int var2 = field354 + field162 & 0x7FF;
			method87(var1 * 3 + 600, field382, var1, method114(field540, field554.field937, field554.field938) - 50, var2, field383);
		}

		int var3;
		if (field302) {
			var3 = method136();
		} else {
			var3 = method135();
		}

		int var4 = field526;
		int var5 = field527;
		int var6 = field528;
		int var7 = field529;
		int var8 = field530;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field357[var9]) {
				int var10 = (int) (Math.random() * (field421[var9] * 2 + 1) + Math.sin(field548[var9] / 100.0D * field519[var9]) * field214[var9] - field421[var9]);
				if (var9 == 0) {
					field526 += var10;
				}

				if (var9 == 1) {
					field527 += var10;
				}

				if (var9 == 2) {
					field528 += var10;
				}

				if (var9 == 3) {
					field530 = field530 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field529 += var10;
					if (field529 < 128) {
						field529 = 128;
					}

					if (field529 > 383) {
						field529 = 383;
					}
				}
			}
		}

		int var11 = PTUBVHCT.field997;
		IEHKDFMR.field720 = true;
		IEHKDFMR.field723 = 0;
		IEHKDFMR.field721 = field1207 - 4;
		IEHKDFMR.field722 = field1208 - 4;
		ANTOHTCU.method15();
		field178.method555(field530, field528, field529, var3, field526, field527);
		field178.method530();
		method103();
		method42();
		method55(var11);
		method93();
		field156.method478(4, 4, field1199);
		field526 = var4;
		field527 = var5;
		field528 = var6;
		field529 = var7;
		field530 = var8;
	}

	@ObfuscatedName("client.e(I)V")
	public final void method44() {
		if (field173 == 0 && field149 == 0) {
			field296[field375] = "Walk here";
			field467[field375] = 269;
			field465[field375] = field1207;
			field466[field375] = field1208;
			field375++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < IEHKDFMR.field723; var2++) {
			int var3 = IEHKDFMR.field724[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field178.method546(field540, var4, var5, var3) >= 0) {
					AMVKCKZF var8 = AMVKCKZF.method4(var7);
					if (var8.field17 != null) {
						var8 = var8.method2();
					}

					if (var8 == null) {
						continue;
					}

					if (field173 == 1) {
						field296[field375] = "Use " + field177 + " with @cya@" + var8.field16;
						field467[field375] = 871;
						field468[field375] = var3;
						field465[field375] = var4;
						field466[field375] = var5;
						field375++;
					} else if (field149 != 1) {
						if (var8.field45 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field45[var9] != null) {
									field296[field375] = var8.field45[var9] + " @cya@" + var8.field16;

									if (var9 == 0) {
										field467[field375] = 242;
									}

									if (var9 == 1) {
										field467[field375] = 721;
									}

									if (var9 == 2) {
										field467[field375] = 617;
									}

									if (var9 == 3) {
										field467[field375] = 846;
									}

									if (var9 == 4) {
										field467[field375] = 1299;
									}

									field468[field375] = var3;
									field465[field375] = var4;
									field466[field375] = var5;
									field375++;
								}
							}
						}

						field296[field375] = "Examine @cya@" + var8.field16;
						field467[field375] = 1263;
						field468[field375] = var8.field26 << 14;
						field465[field375] = var4;
						field466[field375] = var5;
						field375++;
					} else if ((field151 & 0x4) == 4) {
						field296[field375] = field152 + " @cya@" + var8.field16;
						field467[field375] = 82;
						field468[field375] = var3;
						field465[field375] = var4;
						field466[field375] = var5;
						field375++;
					}
				}

				if (var6 == 1) {
					RLTBSHTA var10 = field170[var7];
					if (var10.field1112.field1429 == 1 && (var10.field937 & 0x7F) == 0x40 && (var10.field938 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field171; var11++) {
							RLTBSHTA var12 = field170[field172[var11]];
							if (var12 != null && var10 != var12 && var12.field1112.field1429 == 1 && var10.field937 == var12.field937 && var10.field938 == var12.field938) {
								method65(var4, var12.field1112, field172[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field306; var13++) {
							ZATRZGAA var14 = field305[field307[var13]];
							if (var14 != null && var10.field937 == var14.field937 && var10.field938 == var14.field938) {
								method49(field307[var13], var14, var4, var5);
							}
						}
					}

					method65(var4, var10.field1112, var7, var5);
				}

				if (var6 == 0) {
					ZATRZGAA var15 = field305[var7];
					if ((var15.field937 & 0x7F) == 0x40 && (var15.field938 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field171; var16++) {
							RLTBSHTA var17 = field170[field172[var16]];
							if (var17 != null && var17.field1112.field1429 == 1 && var15.field937 == var17.field937 && var15.field938 == var17.field938) {
								method65(var4, var17.field1112, field172[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field306; var18++) {
							ZATRZGAA var19 = field305[field307[var18]];
							if (var19 != null && var15 != var19 && var15.field937 == var19.field937 && var15.field938 == var19.field938) {
								method49(field307[var18], var19, var4, var5);
							}
						}
					}

					method49(var7, var15, var4, var5);
				}

				if (var6 == 3) {
					WTGHTNMN var20 = field391[field540][var4][var5];
					if (var20 != null) {
						for (BOFPAALI var21 = (BOFPAALI) var20.method471(); var21 != null; var21 = (BOFPAALI) var20.method473()) {
							VXCJHHIE var22 = VXCJHHIE.method447(var21.field107);
							if (field173 == 1) {
								field296[field375] = "Use " + field177 + " with @lre@" + var22.field1250;
								field467[field375] = 146;
								field468[field375] = var21.field107;
								field465[field375] = var4;
								field466[field375] = var5;
								field375++;
							} else if (field149 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1260 != null && var22.field1260[var23] != null) {
										field296[field375] = var22.field1260[var23] + " @lre@" + var22.field1250;

										if (var23 == 0) {
											field467[field375] = 278;
										}

										if (var23 == 1) {
											field467[field375] = 416;
										}

										if (var23 == 2) {
											field467[field375] = 740;
										}

										if (var23 == 3) {
											field467[field375] = 880;
										}

										if (var23 == 4) {
											field467[field375] = 609;
										}

										field468[field375] = var21.field107;
										field465[field375] = var4;
										field466[field375] = var5;
										field375++;
									} else if (var23 == 2) {
										field296[field375] = "Take @lre@" + var22.field1250;
										field467[field375] = 740;
										field468[field375] = var21.field107;
										field465[field375] = var4;
										field466[field375] = var5;
										field375++;
									}
								}

								field296[field375] = "Examine @lre@" + var22.field1250;
								field467[field375] = 1069;
								field468[field375] = var21.field107;
								field465[field375] = var4;
								field466[field375] = var5;
								field375++;
							} else if ((field151 & 0x1) == 1) {
								field296[field375] = field152 + " @lre@" + var22.field1250;
								field467[field375] = 399;
								field468[field375] = var21.field107;
								field465[field375] = var4;
								field466[field375] = var5;
								field375++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method45() {
		AMVKCKZF.field23.method27();
		AMVKCKZF.field44.method27();
		ZLQCXMFK.field1428.method27();
		VXCJHHIE.field1263.method27();
		VXCJHHIE.field1237.method27();
		ZATRZGAA.field1381.method27();
		SDNQJNMP.field1139.method27();
	}

	@ObfuscatedName("client.a(ILQXTIWHBH;IIIIII)V")
	public final void method46(int arg0, QXTIWHBH arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field1077 == 0 && arg1.field1101 != null && !arg1.field1104 && (arg4 >= arg2 && arg6 >= arg3 && arg4 <= arg1.field1106 + arg2 && arg6 <= arg1.field1065 + arg3)) {
			int var8 = arg1.field1101.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field1091[var9] + arg2;
				int var11 = arg1.field1051[var9] + arg3 - arg0;
				QXTIWHBH var12 = QXTIWHBH.method380(arg1.field1101[var9]);
				var10 += var12.field1108;
				var11 += var12.field1045;
				if ((var12.field1081 >= 0 || var12.field1047 != 0) && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
					if (var12.field1081 >= 0) {
						field365 = var12.field1081;
					} else {
						field365 = var12.field1059;
					}
				}

				if (var12.field1077 == 8 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
					field414 = var12.field1059;
				}

				if (var12.field1077 == 0) {
					method46(var12.field1055, var12, var10, var11, arg4, arg5, arg6);

					if (var12.field1057 > var12.field1065) {
						method50(arg6, var12.field1057, var12, arg4, var11, var12.field1106 + var10, var12.field1065, arg5);
					}
				} else {
					if (var12.field1074 == 1 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						boolean var13 = false;
						if (var12.field1093 != 0) {
							var13 = method86(var12);
						}

						if (!var13) {
							field296[field375] = var12.field1056;
							field467[field375] = 997;
							field466[field375] = var12.field1059;
							field375++;
						}
					}

					if (var12.field1074 == 2 && field149 == 0 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						String var14 = var12.field1060;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field296[field375] = var14 + " @gre@" + var12.field1063;
						field467[field375] = 632;
						field466[field375] = var12.field1059;
						field375++;
					}

					if (var12.field1074 == 3 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						field296[field375] = "Close";

						if (arg5 == 3) {
							field467[field375] = 736;
						} else {
							field467[field375] = 543;
						}

						field466[field375] = var12.field1059;
						field375++;
					}

					if (var12.field1074 == 4 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						field296[field375] = var12.field1056;
						field467[field375] = 405;
						field466[field375] = var12.field1059;
						field375++;
					}

					if (var12.field1074 == 5 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						field296[field375] = var12.field1056;
						field467[field375] = 324;
						field466[field375] = var12.field1059;
						field375++;
					}

					if (var12.field1074 == 6 && !field512 && arg4 >= var10 && arg6 >= var11 && arg4 < var12.field1106 + var10 && arg6 < var12.field1065 + var11) {
						field296[field375] = var12.field1056;
						field467[field375] = 22;
						field466[field375] = var12.field1059;
						field375++;
					}

					if (var12.field1077 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1065; var16++) {
							for (int var17 = 0; var17 < var12.field1106; var17++) {
								int var18 = (var12.field1046 + 32) * var17 + var10;
								int var19 = (var12.field1044 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1095[var15];
									var19 += var12.field1050[var15];
								}

								if (arg4 >= var18 && arg6 >= var19 && arg4 < var18 + 32 && arg6 < var19 + 32) {
									field409 = var15;
									field410 = var12.field1059;

									if (var12.field1111[var15] > 0) {
										VXCJHHIE var20 = VXCJHHIE.method447(var12.field1111[var15] - 1);
										if (field173 == 1 && var12.field1087) {
											if (field175 != var12.field1059 || field174 != var15) {
												field296[field375] = "Use " + field177 + " with @lre@" + var20.field1250;
												field467[field375] = 335;
												field468[field375] = var20.field1236;
												field465[field375] = var15;
												field466[field375] = var12.field1059;
												field375++;
											}
										} else if (field149 != 1 || !var12.field1087) {
											if (var12.field1087) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1232 != null && var20.field1232[var21] != null) {
														field296[field375] = var20.field1232[var21] + " @lre@" + var20.field1250;

														if (var21 == 3) {
															field467[field375] = 394;
														}

														if (var21 == 4) {
															field467[field375] = 913;
														}

														field468[field375] = var20.field1236;
														field465[field375] = var15;
														field466[field375] = var12.field1059;
														field375++;
													} else if (var21 == 4) {
														field296[field375] = "Drop @lre@" + var20.field1250;
														field467[field375] = 913;
														field468[field375] = var20.field1236;
														field465[field375] = var15;
														field466[field375] = var12.field1059;
														field375++;
													}
												}
											}

											if (var12.field1075) {
												field296[field375] = "Use @lre@" + var20.field1250;
												field467[field375] = 850;
												field468[field375] = var20.field1236;
												field465[field375] = var15;
												field466[field375] = var12.field1059;
												field375++;
											}

											if (var12.field1087 && var20.field1232 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1232[var22] != null) {
														field296[field375] = var20.field1232[var22] + " @lre@" + var20.field1250;

														if (var22 == 0) {
															field467[field375] = 446;
														}

														if (var22 == 1) {
															field467[field375] = 286;
														}

														if (var22 == 2) {
															field467[field375] = 210;
														}

														field468[field375] = var20.field1236;
														field465[field375] = var15;
														field466[field375] = var12.field1059;
														field375++;
													}
												}
											}

											if (var12.field1071 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1071[var23] != null) {
														field296[field375] = var12.field1071[var23] + " @lre@" + var20.field1250;

														if (var23 == 0) {
															field467[field375] = 746;
														}

														if (var23 == 1) {
															field467[field375] = 4;
														}

														if (var23 == 2) {
															field467[field375] = 253;
														}

														if (var23 == 3) {
															field467[field375] = 534;
														}

														if (var23 == 4) {
															field467[field375] = 930;
														}

														field468[field375] = var20.field1236;
														field465[field375] = var15;
														field466[field375] = var12.field1059;
														field375++;
													}
												}
											}

											field296[field375] = "Examine @lre@" + var20.field1250;
											field467[field375] = 1217;
											field468[field375] = var20.field1236;
											field465[field375] = var15;
											field466[field375] = var12.field1059;
											field375++;
										} else if ((field151 & 0x10) == 0x10) {
											field296[field375] = field152 + " @lre@" + var20.field1250;
											field467[field375] = 864;
											field468[field375] = var20.field1236;
											field465[field375] = var15;
											field466[field375] = var12.field1059;
											field375++;
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

	@ObfuscatedName("client.d(B)V")
	public final void method47() {
		field154.method477();
		PTUBVHCT.field988 = field371;
		field426.method198(0, 0);

		if (field377 != -1) {
			method183(0, QXTIWHBH.method380(field377), 0, 0);
		} else if (field196[field147] != -1) {
			method183(0, QXTIWHBH.method380(field196[field147]), 0, 0);
		}

		if (field153 && field199 == 1) {
			method63();
		}

		field154.method478(205, 553, field1199);
		field156.method477();
		PTUBVHCT.field988 = field372;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(I)V")
	public final void method48() {
		field361 = null;

		if (field332 != null) {
			field332.method320();
		}

		field332 = null;
		field496 = null;
		field497 = null;
		field493 = null;
		field494 = null;
		field495 = null;
		field479 = null;
		field480 = null;
		field481 = null;
		field170 = null;
		field172 = null;
		field518 = null;
		field250 = null;
		field448 = null;
		field449 = null;
		field425 = null;
		field253 = null;
		field123 = null;
		field442 = null;
		field254 = null;
		field255 = null;
		field137 = null;
		field138 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field154 = null;
		field155 = null;
		field156 = null;
		field157 = null;

		if (field431 != null) {
			field431.field874 = false;
		}

		field431 = null;
		field124 = null;
		field125 = null;
		field126 = null;
		field391 = null;
		field216 = null;
		field165 = null;
		field148 = null;
		field408 = null;
		field465 = null;
		field466 = null;
		field467 = null;
		field468 = null;
		field296 = null;
		field458 = null;
		field459 = null;
		field460 = null;
		field461 = null;
		field462 = null;
		field120 = null;
		field549 = null;
		field183 = null;
		field335 = null;
		field251 = null;
		field169 = null;
		field286 = null;

		try {
			if (field453 != null) {
				field453.method187();
			}
		} catch (Exception var1) {
		}

		field453 = null;
		field167 = null;
		field211 = null;
		field261 = null;
		field262 = null;
		field263 = null;
		field264 = null;
		field265 = null;
		field433 = null;
		field498 = null;
		field499 = null;
		field500 = null;
		field501 = null;
		field315 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field319 = null;
		field426 = null;
		field427 = null;
		field428 = null;
		field231 = null;
		field232 = null;
		field209 = null;
		method177();
		field305 = null;
		field307 = null;
		field309 = null;
		field310 = null;
		field545 = null;
		field133 = null;
		field134 = null;
		field135 = null;
		field136 = null;
		field206 = null;
		field168 = null;
		field178 = null;
		field423 = null;
		field508 = null;
		field288 = null;
		field413 = null;
		field236 = null;
		field268 = null;
		field541 = null;
		field422 = null;
		field404 = null;
		method156();
		AMVKCKZF.method8();
		ZLQCXMFK.method508();
		VXCJHHIE.method457();
		QXTIWHBH.method384();
		RSGRNXCC.field1114 = null;
		QRYQWAHS.field1032 = null;
		NVEWHHGL.field885 = null;
		VYXELYSX.field1273 = null;
		SDNQJNMP.field1127 = null;
		SDNQJNMP.field1139 = null;
		INYZAOQU.field733 = null;
		field1200 = null;
		ZATRZGAA.field1381 = null;
		PTUBVHCT.method349();
		ZPFBNGWW.method515();
		IEHKDFMR.method263();
		NXEWQQJO.method335();
		System.gc();
	}

	@ObfuscatedName("client.a(ILZATRZGAA;III)V")
	public final void method49(int arg0, ZATRZGAA arg1, int arg2, int arg3) {
		if (field554 != arg1 && field375 < 400) {
			String var5;
			if (arg1.field1378 == 0) {
				var5 = arg1.field1396 + method57(field554.field1385, arg1.field1385) + " (level-" + arg1.field1385 + ")";
			} else {
				var5 = arg1.field1396 + " (skill-" + arg1.field1378 + ")";
			}

			if (field173 == 1) {
				field296[field375] = "Use " + field177 + " with @whi@" + var5;
				field467[field375] = 244;
				field468[field375] = arg0;
				field465[field375] = arg2;
				field466[field375] = arg3;
				field375++;
			} else if (field149 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field188[var6] != null) {
						field296[field375] = field188[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field188[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1385 > field554.field1385) {
								var7 = 2000;
							}

							if (field554.field1379 != 0 && arg1.field1379 != 0) {
								if (field554.field1379 == arg1.field1379) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field189[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field467[field375] = var7 + 70;
						}

						if (var6 == 1) {
							field467[field375] = var7 + 136;
						}

						if (var6 == 2) {
							field467[field375] = var7 + 367;
						}

						if (var6 == 3) {
							field467[field375] = var7 + 321;
						}

						if (var6 == 4) {
							field467[field375] = var7 + 974;
						}

						field468[field375] = arg0;
						field465[field375] = arg2;
						field466[field375] = arg3;
						field375++;
					}
				}
			} else if ((field151 & 0x8) == 8) {
				field296[field375] = field152 + " @whi@" + var5;
				field467[field375] = 461;
				field468[field375] = arg0;
				field465[field375] = arg2;
				field466[field375] = arg3;
				field375++;
			}

			for (int var8 = 0; var8 < field375; var8++) {
				if (field467[var8] == 269) {
					field296[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILQXTIWHBH;IIIII)V")
	public final void method50(int arg0, int arg1, QXTIWHBH arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field476) {
			field146 = 32;
		} else {
			field146 = 0;
		}

		field476 = false;
		if (arg3 >= arg5 && arg3 < arg5 + 16 && arg0 >= arg4 && arg0 < arg4 + 16) {
			arg2.field1055 -= field432 * 4;

			if (arg7 == 1) {
				field312 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field245 = true;
			}
		} else if (arg3 >= arg5 && arg3 < arg5 + 16 && arg0 >= arg4 + arg6 - 16 && arg0 < arg4 + arg6) {
			arg2.field1055 += field432 * 4;

			if (arg7 == 1) {
				field312 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field245 = true;
			}
		} else if (arg3 >= arg5 - field146 && arg3 < arg5 + field146 + 16 && arg0 >= arg4 + 16 && arg0 < arg4 + arg6 - 16 && field432 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg4 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg2.field1055 = (arg1 - arg6) * var10 / var11;

			if (arg7 == 1) {
				field312 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field245 = true;
			}

			field476 = true;
		}
	}

	@ObfuscatedName("client.a(ILEMWAMCXW;I)V")
	public final void method51(int arg0, EMWAMCXW arg1) {
		for (int var3 = 0; var3 < field308; var3++) {
			int var4 = field309[var3];
			ZATRZGAA var5 = field305[var4];
			int var6 = arg1.method217();
			if ((var6 & 0x4) != 0) {
				var6 += arg1.method217() << 8;
			}

			method41(var4, var5, var6, arg1);
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method52(boolean arg0) {
		if (!field415 && !field505 && !field405) {
			field228++;
			field418 &= arg0;
			if (field418) {
				method133();
			} else {
				method64();
			}

			method56();
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method53() {
		short var1 = 256;

		if (field502 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field502 > 768) {
					field221[var2] = method131(field223[var2], field222[var2], 1024 - field502);
				} else if (field502 > 256) {
					field221[var2] = field223[var2];
				} else {
					field221[var2] = method131(field222[var2], field223[var2], 256 - field502);
				}
			}
		} else if (field503 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field503 > 768) {
					field221[var3] = method131(field224[var3], field222[var3], 1024 - field503);
				} else if (field503 > 256) {
					field221[var3] = field224[var3];
				} else {
					field221[var3] = method131(field222[var3], field224[var3], 256 - field503);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field221[var4] = field222[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field496.field1316[var5] = field131.field1183[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field269[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field513[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field221[var12];
					int var15 = field496.field1316[var7];
					field496.field1316[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field496.method478(0, 0, field1199);

		for (int var16 = 0; var16 < 33920; var16++) {
			field497.field1316[var16] = field132.field1183[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field269[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field513[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field221[var23];
					int var26 = field497.field1316[var18];
					field497.field1316[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field497.method478(0, 637, field1199);
	}

	@ObfuscatedName("client.f(I)V")
	public final void method54() {
		for (WZPSCBGD var1 = (WZPSCBGD) field120.method470(); var1 != null; var1 = (WZPSCBGD) field120.method472()) {
			if (field540 != var1.field1293 || field228 > var1.field1295) {
				var1.method338();
			} else if (field228 >= var1.field1294) {
				if (var1.field1298 > 0) {
					RLTBSHTA var2 = field170[var1.field1298 - 1];
					if (var2 != null && var2.field937 >= 0 && var2.field937 < 13312 && var2.field938 >= 0 && var2.field938 < 13312) {
						var1.method476(var2.field938, var2.field937, field228, method114(var1.field1293, var2.field937, var2.field938) - var1.field1302);
					}
				}

				if (var1.field1298 < 0) {
					int var3 = -var1.field1298 - 1;
					ZATRZGAA var4;
					if (field198 == var3) {
						var4 = field554;
					} else {
						var4 = field305[var3];
					}

					if (var4 != null && var4.field937 >= 0 && var4.field937 < 13312 && var4.field938 >= 0 && var4.field938 < 13312) {
						var1.method476(var4.field938, var4.field937, field228, method114(var1.field1293, var4.field937, var4.field938) - var1.field1302);
					}
				}

				var1.method475(field320);
				field178.method527(var1.field1303, var1, field540, (int) var1.field1314, (int) var1.field1312, (int) var1.field1313, -1, 60, false);
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method55(int arg0) {
		if (!field241) {
			for (int var2 = 0; var2 < field456.length; var2++) {
				int var3 = field456[var2];
				if (PTUBVHCT.field996[var3] >= arg0) {
					CMELCUKG var4 = PTUBVHCT.field990[var3];
					int var5 = var4.field576 * var4.field575 - 1;
					int var6 = field320 * var4.field575 * 2;
					byte[] var7 = var4.field573;
					byte[] var8 = field508;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field573 = var8;
					field508 = var7;
					PTUBVHCT.method356(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method56() {
		while (true) {
			OKKEIIWQ var1 = field332.method312();
			if (var1 == null) {
				return;
			}

			if (var1.field909 == 0) {
				IEHKDFMR.method265(var1.field910, var1.field907);

				if ((field332.method322(var1.field907) & 0x62) != 0) {
					field312 = true;

					if (field210 != -1 || field477 != -1) {
						field245 = true;
					}
				}
			}

			if (var1.field909 == 1 && var1.field910 != null) {
				NXEWQQJO.method334(var1.field910);
			}

			if (var1.field909 == 2 && field416 == var1.field907 && var1.field910 != null) {
				method70(field417, var1.field910);
			}

			if (var1.field909 == 3 && field367 == 1) {
				for (int var2 = 0; var2 < field123.length; var2++) {
					if (field254[var2] == var1.field907) {
						field123[var2] = var1.field910;

						if (var1.field910 == null) {
							field254[var2] = -1;
						}

						break;
					}

					if (field255[var2] == var1.field907) {
						field442[var2] = var1.field910;

						if (var1.field910 == null) {
							field255[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field909 == 93 && field332.method318(var1.field907)) {
				SSYGWTYM.method406(new EMWAMCXW(var1.field910), field332);
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String method57(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IILEMWAMCXW;)V")
	public final void method58(int arg0, EMWAMCXW arg1) {
		while (arg1.field618 + 10 < arg0 * 8) {
			int var3 = arg1.method228(11);
			if (var3 == 2047) {
				break;
			}

			if (field305[var3] == null) {
				field305[var3] = new ZATRZGAA();
				if (field310[var3] != null) {
					field305[var3].method505(field310[var3]);
				}
			}

			field307[field306++] = var3;
			ZATRZGAA var4 = field305[var3];
			var4.field936 = field228;
			int var5 = arg1.method228(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method228(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method228(1);
			int var8 = arg1.method228(1);
			if (var8 == 1) {
				field309[field308++] = var3;
			}

			var4.method339(field554.field914[0] + var5, var7 == 1, field554.field913[0] + var6);
		}

		arg1.method229();
	}

	@ObfuscatedName("client.a(BLEMWAMCXW;I)V")
	public final void method59(EMWAMCXW arg0, int arg1) {
		for (int var3 = 0; var3 < field308; var3++) {
			int var4 = field309[var3];
			RLTBSHTA var5 = field170[var4];
			int var6 = arg0.method217();
			if ((var6 & 0x4) != 0) {
				var5.field953 = arg0.method224();
				var5.field932 = 100;
			}

			if ((var6 & 0x20) != 0) {
				var5.field965 = arg0.method245();
				var5.field966 = arg0.method245();
			}

			if ((var6 & 0x8) != 0) {
				var5.field921 = arg0.method246();
				int var7 = arg0.method222();
				var5.field925 = var7 >> 16;
				var5.field924 = (var7 & 0xFFFF) + field228;
				var5.field922 = 0;
				var5.field923 = 0;

				if (var5.field924 > field228) {
					var5.field922 = -1;
				}

				if (var5.field921 == 0xFFFF) {
					var5.field921 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1112 = ZLQCXMFK.method509(arg0.method246());
				var5.field948 = var5.field1112.field1429;
				var5.field931 = var5.field1112.field1423;
				var5.field915 = var5.field1112.field1434;
				var5.field916 = var5.field1112.field1430;
				var5.field917 = var5.field1112.field1418;
				var5.field918 = var5.field1112.field1433;
				var5.field919 = var5.field1112.field1399;
			}

			if ((var6 & 0x40) != 0) {
				var5.field941 = arg0.method245();
				if (var5.field941 == 0xFFFF) {
					var5.field941 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var8 = arg0.method236();
				int var9 = arg0.method236();
				var5.method340(var8, var9, field228);
				var5.field926 = field228 + 300;
				var5.field927 = arg0.method236();
				var5.field928 = arg0.method238();
			}

			if ((var6 & 0x2) != 0) {
				int var10 = arg0.method219();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method236();
				if (var5.field942 == var10 && var10 != -1) {
					int var12 = VYXELYSX.field1273[var10].field1287;
					if (var12 == 1) {
						var5.field943 = 0;
						var5.field944 = 0;
						var5.field945 = var11;
						var5.field946 = 0;
					}

					if (var12 == 2) {
						var5.field946 = 0;
					}
				} else if (var10 == -1 || var5.field942 == -1 || VYXELYSX.field1273[var10].field1281 >= VYXELYSX.field1273[var5.field942].field1281) {
					var5.field942 = var10;
					var5.field943 = 0;
					var5.field944 = 0;
					var5.field945 = var11;
					var5.field946 = 0;
					var5.field929 = var5.field947;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg0.method237();
				int var14 = arg0.method237();
				var5.method340(var13, var14, field228);
				var5.field926 = field228 + 300;
				var5.field927 = arg0.method236();
				var5.field928 = arg0.method236();
			}
		}
	}

	@ObfuscatedName("client.a(BI[B)Z")
	public final boolean method60(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.c(II)V")
	public final void method61(int arg0) {
		QXTIWHBH var2 = QXTIWHBH.method380(arg0);
		for (int var3 = 0; var3 < var2.field1101.length && var2.field1101[var3] != -1; var3++) {
			QXTIWHBH var4 = QXTIWHBH.method380(var2.field1101[var3]);
			if (var4.field1077 == 1) {
				method61(var4.field1059);
			}

			var4.field1054 = 0;
			var4.field1098 = 0;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method62() {
		if (field260 == 0 && field1213 == 1) {
			int var1 = field1214 - 25 - 550;
			int var2 = field1215 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field354 + field257 & 0x7FF;
				int var4 = PTUBVHCT.field986[var3];
				int var5 = PTUBVHCT.field987[var3];
				var4 = (field246 + 256) * var4 >> 8;
				var5 = (field246 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field554.field937 + var6 >> 7;
				int var9 = field554.field938 - var7 >> 7;
				boolean var10 = method110(true, 1, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var8, var9);
				if (var10) {
					field165.method207(var1);
					field165.method207(var2);
					field165.method208(field354);
					field165.method207(57);
					field165.method207(field257);
					field165.method207(field246);
					field165.method207(89);
					field165.method208(field554.field937);
					field165.method208(field554.field938);
					field165.method207(field376);
					field165.method207(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method63() {
		int var1 = field200;
		int var2 = field201;
		int var3 = field202;
		int var4 = field203;
		int var5 = 0x5D5447;
		ANTOHTCU.method17(var1, var2, var5, var3, var4);
		ANTOHTCU.method17(var1 + 1, var2 + 1, 0, var3 - 2, 16);
		ANTOHTCU.method18(var1 + 1, var3 - 2, 0, var4 - 19, var2 + 18);
		field129.method485("Choose Option", var1 + 3, var5, var2 + 14);
		int var6 = field1207;
		int var7 = field1208;
		if (field199 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field199 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field199 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field375; var8++) {
			int var9 = (field375 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field129.method489(true, var1 + 3, var10, var9, field296[var8]);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method64() {
		if (field343 == 0) {
			int var1 = field1197 / 2 - 80;
			int var2 = field1198 / 2 + 20;
			var2 += 20;
			if (field1213 == 1 && field1214 >= var1 - 75 && field1214 <= var1 + 75 && field1215 >= var2 - 20 && field1215 <= var2 + 20) {
				field343 = 3;
				field550 = 0;
			}

			int var3 = field1197 / 2 + 80;
			if (field1213 == 1 && field1214 >= var3 - 75 && field1214 <= var3 + 75 && field1215 >= var2 - 20 && field1215 <= var2 + 20) {
				field557 = "";
				field558 = "Enter your username & password.";
				field343 = 2;
				field550 = 0;
			}
		} else if (field343 == 2) {
			int var4 = field1198 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1213 == 1 && field1215 >= var4 - 15 && field1215 < var4) {
				field550 = 0;
			}

			var4 += 15;
			if (field1213 == 1 && field1215 >= var4 - 15 && field1215 < var4) {
				field550 = 1;
			}

			var4 += 15;
			int var5 = field1197 / 2 - 80;
			int var6 = field1198 / 2 + 50;
			var6 += 20;
			if (field1213 == 1 && field1214 >= var5 - 75 && field1214 <= var5 + 75 && field1215 >= var6 - 20 && field1215 <= var6 + 20) {
				field398 = 0;
				method73(field429, field430, false);

				if (field418) {
					return;
				}
			}

			int var7 = field1197 / 2 + 80;
			if (field1213 == 1 && field1214 >= var7 - 75 && field1214 <= var7 + 75 && field1215 >= var6 - 20 && field1215 <= var6 + 20) {
				field343 = 0;
				field429 = "";
				field430 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method436();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field313.length(); var10++) {
					if (var8 == field313.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field550 == 0) {
					if (var8 == 8 && field429.length() > 0) {
						field429 = field429.substring(0, field429.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field550 = 1;
					}

					if (var9) {
						field429 = field429 + (char) var8;
					}

					if (field429.length() > 12) {
						field429 = field429.substring(0, 12);
					}
				} else if (field550 == 1) {
					if (var8 == 8 && field430.length() > 0) {
						field430 = field430.substring(0, field430.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field550 = 0;
					}

					if (var9) {
						field430 = field430 + (char) var8;
					}

					if (field430.length() > 20) {
						field430 = field430.substring(0, 20);
					}
				}
			}
		} else if (field343 == 3) {
			int var11 = field1197 / 2;
			int var12 = field1198 / 2 + 50;
			var12 += 20;
			if (field1213 == 1 && field1214 >= var11 - 75 && field1214 <= var11 + 75 && field1215 >= var12 - 20 && field1215 <= var12 + 20) {
				field343 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILZLQCXMFK;III)V")
	public final void method65(int arg0, ZLQCXMFK arg1, int arg2, int arg3) {
		if (field375 < 400) {
			if (arg1.field1432 != null) {
				arg1 = arg1.method510();
			}

			if (arg1 != null && arg1.field1416) {
				String var5 = arg1.field1400;
				if (arg1.field1435 != 0) {
					var5 = var5 + method57(field554.field1385, arg1.field1435) + " (level-" + arg1.field1435 + ")";
				}

				if (field173 == 1) {
					field296[field375] = "Use " + field177 + " with @yel@" + var5;
					field467[field375] = 10;
					field468[field375] = arg2;
					field465[field375] = arg0;
					field466[field375] = arg3;
					field375++;
				} else if (field149 != 1) {
					if (arg1.field1422 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1422[var6] != null && !arg1.field1422[var6].equalsIgnoreCase("attack")) {
								field296[field375] = arg1.field1422[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field467[field375] = 88;
								}

								if (var6 == 1) {
									field467[field375] = 320;
								}

								if (var6 == 2) {
									field467[field375] = 608;
								}

								if (var6 == 3) {
									field467[field375] = 169;
								}

								if (var6 == 4) {
									field467[field375] = 189;
								}

								field468[field375] = arg2;
								field465[field375] = arg0;
								field466[field375] = arg3;
								field375++;
							}
						}
					}

					if (arg1.field1422 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1422[var7] != null && arg1.field1422[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1435 > field554.field1385) {
									var8 = 2000;
								}

								field296[field375] = arg1.field1422[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field467[field375] = var8 + 88;
								}

								if (var7 == 1) {
									field467[field375] = var8 + 320;
								}

								if (var7 == 2) {
									field467[field375] = var8 + 608;
								}

								if (var7 == 3) {
									field467[field375] = var8 + 169;
								}

								if (var7 == 4) {
									field467[field375] = var8 + 189;
								}

								field468[field375] = arg2;
								field465[field375] = arg0;
								field466[field375] = arg3;
								field375++;
							}
						}
					}

					field296[field375] = "Examine @yel@" + var5;
					field467[field375] = 1199;
					field468[field375] = arg2;
					field465[field375] = arg0;
					field466[field375] = arg3;
					field375++;
				} else if ((field151 & 0x2) == 2) {
					field296[field375] = field152 + " @yel@" + var5;
					field467[field375] = 209;
					field468[field375] = arg2;
					field465[field375] = arg0;
					field466[field375] = arg3;
					field375++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method66(int arg0) {
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

	@ObfuscatedName("client.i(I)V")
	public final void method67() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field513[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field513[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field514[var10] = (field513[var10 - 1] + field513[var10 + 1] + field513[var10 - 128] + field513[var10 + 128]) / 4;
			}
		}

		field187 += 128;
		if (field187 > field368.length) {
			field187 -= field368.length;
			int var11 = (int) (Math.random() * 12.0D);
			method166(field561[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field514[var14 + 128] - field368[field187 + var14 & field368.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field513[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field269[var16] = field269[var16 + 1];
		}

		field269[var1 - 1] = (int) (Math.sin(field228 / 14.0D) * 16.0D + Math.sin(field228 / 15.0D) * 14.0D + Math.sin(field228 / 16.0D) * 12.0D);

		if (field502 > 0) {
			field502 -= 4;
		}

		if (field503 > 0) {
			field503 -= 4;
		}

		if (field502 == 0 && field503 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field502 = 1024;
			}

			if (var17 == 1) {
				field503 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method68() {
		for (int var1 = 0; var1 < field336; var1++) {
			if (field184[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field341[var1] != field419 || field473[var1] != field144) {
						EMWAMCXW var3 = LTINEQTV.method326(field341[var1], field473[var1]);
						if (System.currentTimeMillis() + var3.field617 / 22 > field235 / 22 + field256) {
							field235 = var3.field617;
							field256 = System.currentTimeMillis();

							if (method60(var3.field617, var3.field616)) {
								field419 = field341[var1];
								field144 = field473[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method101()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field165.method206(215);
						field165.method208(field341[var1] & 0x7FFF);
					} else {
						field165.method206(215);
						field165.method208(-1);
					}
				}

				if (var2 && field184[var1] != -5) {
					field184[var1] = -5;
				} else {
					field336--;
					for (int var5 = var1; var5 < field336; var5++) {
						field341[var5] = field341[var5 + 1];
						field473[var5] = field473[var5 + 1];
						field184[var5] = field184[var5 + 1];
					}

					var1--;
				}
			} else {
				field184[var1]--;
			}
		}

		if (field374 > 0) {
			field374 -= 20;
			if (field374 < 0) {
				field374 = 0;
			}

			if (field374 == 0 && field227 && !field241) {
				field416 = field248;
				field417 = true;
				field332.method321(2, field416);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method69(int arg0) {
		int var2 = INYZAOQU.field733[arg0].field741;
		if (var2 != 0) {
			int var3 = field286[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					PTUBVHCT.method358(0.9D);
				}

				if (var3 == 2) {
					PTUBVHCT.method358(0.8D);
				}

				if (var3 == 3) {
					PTUBVHCT.method358(0.7D);
				}

				if (var3 == 4) {
					PTUBVHCT.method358(0.6D);
				}

				VXCJHHIE.field1237.method27();
				field532 = true;
			}

			if (var2 == 3) {
				boolean var4 = field227;

				if (var3 == 0) {
					method132(0, field227);
					field227 = true;
				}

				if (var3 == 1) {
					method132(-400, field227);
					field227 = true;
				}

				if (var3 == 2) {
					method132(-800, field227);
					field227 = true;
				}

				if (var3 == 3) {
					method132(-1200, field227);
					field227 = true;
				}

				if (var3 == 4) {
					field227 = false;
				}

				if (field227 != var4 && !field241) {
					if (field227) {
						field416 = field248;
						field417 = true;
						field332.method321(2, field416);
					} else {
						method177();
					}

					field374 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field509 = true;
					method179(0);
				}

				if (var3 == 1) {
					field509 = true;
					method179(-400);
				}

				if (var3 == 2) {
					field509 = true;
					method179(-800);
				}

				if (var3 == 3) {
					field509 = true;
					method179(-1200);
				}

				if (var3 == 4) {
					field509 = false;
				}
			}

			if (var2 == 5) {
				field455 = var3;
			}

			if (var2 == 6) {
				field226 = var3;
			}

			if (var2 == 8) {
				field197 = var3;
				field245 = true;
			}

			if (var2 == 9) {
				field287 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method70(boolean arg0, byte[] arg1) {
		if (field227) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)V")
	public final void method71(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field191 = 0;
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

			field191 = 0;
			label46: for (int var7 = 0; var7 < VXCJHHIE.field1269; var7++) {
				VXCJHHIE var8 = VXCJHHIE.method447(var7);
				if (var8.field1261 == -1 && var8.field1250 != null) {
					String var9 = var8.field1250.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field192[field191] = var9;
					field193[field191] = var7;
					field191++;
					if (field191 >= field192.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method72() {
		for (int var1 = -1; var1 < field306; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field304;
			} else {
				var2 = field307[var1];
			}

			ZATRZGAA var3 = field305[var2];
			if (var3 != null) {
				method144(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method73(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field557 = "";
				field558 = "Connecting to server...";
				method158(true);
			}

			field453 = new CLJPNHPC(method100(field239 + 43594), this);
			long var4 = WAQVJSXE.method461(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field165.field617 = 0;
			field165.method207(14);
			field165.method207(var6);
			field453.method191(field165.field616, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field453.method188();
			}

			int var8 = field453.method188();
			int var9 = var8;

			if (var8 == 0) {
				field453.method190(field408.field616, 0, 8);
				field408.field617 = 0;
				field488 = field408.method223();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field488 >> 32), (int) field488 };
				field165.field617 = 0;
				field165.method207(10);
				field165.method211(var10[0]);
				field165.method211(var10[1]);
				field165.method211(var10[2]);
				field165.method211(var10[3]);
				field165.method211(signlink.uid);
				field165.method214(arg0);
				field165.method214(arg1);
				field165.method232(field472, field243);
				field148.field617 = 0;

				if (arg2) {
					field148.method207(18);
				} else {
					field148.method207(16);
				}

				field148.method207(field165.field617 + 36 + 1 + 1 + 2);
				field148.method207(255);
				field148.method208(364);
				field148.method207(field241 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field148.method211(field121[var11]);
				}

				field148.method215(field165.field616, field165.field617, 0);
				field165.field621 = new YJYHBEIS(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field217 = new YJYHBEIS(var10);
				field453.method191(field148.field616, 0, field148.field617);
				var8 = field453.method188();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method73(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field379 = field453.method188();
				field331 = field453.method188() == 1;
				field272 = 0L;
				field300 = 0;
				field431.field870 = 0;
				field1204 = true;
				field294 = true;
				field418 = true;
				field165.field617 = 0;
				field408.field617 = 0;
				field438 = -1;
				field520 = -1;
				field521 = -1;
				field522 = -1;
				field437 = 0;
				field439 = 0;
				field436 = 0;
				field441 = 0;
				field207 = 0;
				field375 = 0;
				field153 = false;
				field1205 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field492[var13] = null;
				}

				field173 = 0;
				field149 = 0;
				field367 = 0;
				field336 = 0;
				field325 = (int) (Math.random() * 100.0D) - 50;
				field524 = (int) (Math.random() * 110.0D) - 55;
				field162 = (int) (Math.random() * 80.0D) - 40;
				field257 = (int) (Math.random() * 120.0D) - 60;
				field246 = (int) (Math.random() * 30.0D) - 20;
				field354 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field260 = 0;
				field242 = -1;
				field359 = 0;
				field360 = 0;
				field306 = 0;
				field171 = 0;

				for (int var14 = 0; var14 < field303; var14++) {
					field305[var14] = null;
					field310[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field170[var15] = null;
				}

				field554 = field305[field304] = new ZATRZGAA();
				field120.method474();
				field549.method474();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field391[var16][var17][var18] = null;
						}
					}
				}

				field216 = new WTGHTNMN();
				field299 = 0;
				field298 = 0;
				method75(field477);
				field477 = -1;
				method75(field210);
				field210 = -1;
				method75(field212);
				field212 = -1;
				method75(field297);
				field297 = -1;
				method75(field537);
				field537 = -1;
				method75(field377);
				field377 = -1;
				method75(field515);
				field515 = -1;
				field512 = false;
				field147 = 3;
				field434 = 0;
				field153 = false;
				field195 = false;
				field387 = null;
				field452 = 0;
				field249 = -1;
				field337 = true;
				method106();

				for (int var19 = 0; var19 < 5; var19++) {
					field435[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field188[var20] = null;
					field189[var20] = false;
				}

				field560 = 0;
				field366 = 0;
				field314 = 0;
				field179 = 0;
				field539 = 0;
				field507 = 0;
				field285 = 0;
				field471 = 0;
				field510 = 0;
				method89();
			} else if (var8 == 3) {
				field557 = "";
				field558 = "Invalid username or password.";
			} else if (var8 == 4) {
				field557 = "Your account has been disabled.";
				field558 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field557 = "Your account is already logged in.";
				field558 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field557 = "RuneScape has been updated!";
				field558 = "Please reload this page.";
			} else if (var8 == 7) {
				field557 = "This world is full.";
				field558 = "Please use a different world.";
			} else if (var8 == 8) {
				field557 = "Unable to connect.";
				field558 = "Login server offline.";
			} else if (var8 == 9) {
				field557 = "Login limit exceeded.";
				field558 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field557 = "Unable to connect.";
				field558 = "Bad session id.";
			} else if (var8 == 12) {
				field557 = "You need a members account to login to this world.";
				field558 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field557 = "Could not complete login.";
				field558 = "Please try using a different world.";
			} else if (var8 == 14) {
				field557 = "The server is being updated.";
				field558 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field418 = true;
				field165.field617 = 0;
				field408.field617 = 0;
				field438 = -1;
				field520 = -1;
				field521 = -1;
				field522 = -1;
				field437 = 0;
				field439 = 0;
				field436 = 0;
				field375 = 0;
				field153 = false;
				field506 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field557 = "Login attempts exceeded.";
				field558 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field557 = "You are standing in a members-only area.";
				field558 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field557 = "Invalid loginserver requested";
				field558 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field453.method188();
				for (var21 += 3; var21 >= 0; var21--) {
					field557 = "You have only just left another world";
					field558 = "Your profile will be transferred in: " + var21;
					method158(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method73(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field557 = "Malformed login packet.";
				field558 = "Please try again.";
			} else if (var8 == 23) {
				field557 = "No reply from loginserver.";
				field558 = "Please try again.";
			} else if (var8 == 24) {
				field557 = "Error loading your profile.";
				field558 = "Please contact customer support.";
			} else if (var8 == 25) {
				field557 = "Unexpected loginserver response.";
				field558 = "Please try using a different world.";
			} else if (var8 == 26) {
				field557 = "This computers address has been blocked";
				field558 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field557 = "Unexpected server response";
				field558 = "Please try using a different world.";
			} else if (var9 != 0) {
				field557 = "No response from server";
				field558 = "Please try using a different world.";
			} else if (field398 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field398++;
				method73(arg0, arg1, arg2);
			} else {
				field557 = "No response from loginserver";
				field558 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field557 = "";
			field558 = "Error connecting to server.";
		}
	}

	public final void init() {
		field238 = Integer.parseInt(getParameter("nodeid"));
		field239 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method76();
		} else {
			method141();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field240 = false;
		} else {
			field240 = true;
		}

		method433(503, 765);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method74() {
		int var1 = 5;
		field121[8] = 0;
		int var2 = 0;
		while (field121[8] == 0) {
			String var3 = "Unknown problem";
			method98("Connecting to web server", 20);

			try {
				DataInputStream var4 = method88("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 364);
				EMWAMCXW var5 = new EMWAMCXW(new byte[40]);
				var4.readFully(var5.field616, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field121[var6] = var5.method222();
				}

				int var7 = var5.method222();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field121[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field121[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field121[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field121[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field121[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field121[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method98("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method98(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field274 = !field274;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method75(int arg0) {
		QXTIWHBH.method379(arg0);
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method76() {
		ZPFBNGWW.field1436 = true;
		PTUBVHCT.field977 = true;
		field241 = true;
		SSYGWTYM.field1141 = true;
		AMVKCKZF.field42 = true;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method77(int arg0) {
		if (arg0 >= 0) {
			int var2 = field465[arg0];
			int var3 = field466[arg0];
			int var4 = field467[arg0];
			int var5 = field468[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field434 != 0 && var4 != 1196) {
				field434 = 0;
				field245 = true;
			}

			if (var4 == 850) {
				field173 = 1;
				field174 = var2;
				field175 = var3;
				field176 = var5;
				field177 = String.valueOf(VXCJHHIE.method447(var5).field1250);
				field149 = 0;
				field312 = true;
			} else {
				if (var4 == 324) {
					field165.method206(129);
					field165.method208(var3);
					QXTIWHBH var6 = QXTIWHBH.method380(var3);
					if (var6.field1109 != null && var6.field1109[0][0] == 5) {
						int var7 = var6.field1109[0][1];
						if (field286[var7] != var6.field1089[0]) {
							field286[var7] = var6.field1089[0];
							method69(var7);
							field312 = true;
						}
					}
				}

				if (var4 == 146) {
					boolean var8 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var8) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(145);
					field165.method244(field327 + var2);
					field165.method243(field176);
					field165.method244(field328 + var3);
					field165.method208(field174);
					field165.method243(field175);
					field165.method242(var5);
				}

				if (var4 == 209) {
					RLTBSHTA var10 = field170[var5];
					if (var10 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var10.field913[0], var10.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(166);
						field165.method242(field150);
						field165.method243(var5);
					}
				}

				if (var4 == 189) {
					RLTBSHTA var11 = field170[var5];
					if (var11 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var11.field913[0], var11.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field510++;
						if (field510 >= 85) {
							field165.method206(191);
							field165.method210(0x7ABEC2);
							field510 = 0;
						}

						field165.method206(162);
						field165.method242(var5);
					}
				}

				if (var4 == 265) {
					String var12 = field296[arg0];
					int var13 = var12.indexOf("@whi@");
					if (var13 != -1) {
						if (field212 == -1) {
							method127();
							field517 = var12.substring(var13 + 5).trim();
							field474 = false;
							field504 = field212 = QXTIWHBH.field1078;
						} else {
							method79("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 617) {
					method83(var2, var3, var5);
					field165.method206(171);
					field165.method208(field327 + var2);
					field165.method242(var5 >> 14 & 0x7FFF);
					field165.method244(field328 + var3);
				}

				if (var4 == 416) {
					boolean var14 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var14) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(84);
					field165.method244(var5);
					field165.method243(field328 + var3);
					field165.method244(field327 + var2);
				}

				if (var4 == 721) {
					if ((field328 & 0x3) == 0) {
						field507++;
					}

					if (field507 >= 97) {
						field165.method206(36);
						field165.method208(43864);
						field507 = 0;
					}

					method83(var2, var3, var5);
					field165.method206(109);
					field165.method244(field328 + var3);
					field165.method243(field327 + var2);
					field165.method244(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 278) {
					boolean var16 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var16) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(136);
					field165.method243(field327 + var2);
					field165.method208(field328 + var3);
					field165.method242(var5);
				}

				if (var4 == 242) {
					field179++;
					if (field179 >= 120) {
						field165.method206(44);
						field165.method210(0xDCBAD0);
						field179 = 0;
					}

					method83(var2, var3, var5);
					field165.method206(9);
					field165.method244(field328 + var3);
					field165.method208(field327 + var2);
					field165.method243(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 609) {
					boolean var18 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var18) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(54);
					field165.method244(var5);
					field165.method244(field327 + var2);
					field165.method244(field328 + var3);
				}

				if (var4 == 66 || var4 == 723 || var4 == 299 || var4 == 903) {
					String var20 = field296[arg0];
					int var21 = var20.indexOf("@whi@");
					if (var21 != -1) {
						long var22 = WAQVJSXE.method461(var20.substring(var21 + 5).trim());
						if (var4 == 66) {
							method184(var22);
						}

						if (var4 == 723) {
							method82(var22);
						}

						if (var4 == 299) {
							method130(var22);
						}

						if (var4 == 903) {
							method117(var22);
						}
					}
				}

				if (var4 == 1263) {
					int var24 = var5 >> 14 & 0x7FFF;
					AMVKCKZF var25 = AMVKCKZF.method4(var24);
					String var26;
					if (var25.field1 == null) {
						var26 = "It's a " + var25.field16 + ".";
					} else {
						var26 = new String(var25.field1);
					}

					method79(var26, 0, "");
				}

				if (var4 == 1199) {
					RLTBSHTA var27 = field170[var5];
					if (var27 != null) {
						ZLQCXMFK var28 = var27.field1112;
						if (var28.field1432 != null) {
							var28 = var28.method510();
						}

						if (var28 != null) {
							String var29;
							if (var28.field1405 == null) {
								var29 = "It's a " + var28.field1400 + ".";
							} else {
								var29 = new String(var28.field1405);
							}

							method79(var29, 0, "");
						}
					}
				}

				if (var4 == 70) {
					ZATRZGAA var30 = field305[var5];
					if (var30 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var30.field913[0], var30.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;

						if ((var5 & 0x3) == 0) {
							field285++;
						}

						if (field285 >= 118) {
							field165.method206(223);
							field165.method211(0);
							field285 = 0;
						}

						field165.method206(32);
						field165.method243(var5);
					}
				}

				if (var4 == 461) {
					ZATRZGAA var31 = field305[var5];
					if (var31 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var31.field913[0], var31.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(48);
						field165.method243(var5);
						field165.method243(field150);
					}
				}

				if (var4 == 10) {
					RLTBSHTA var32 = field170[var5];
					if (var32 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var32.field913[0], var32.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(60);
						field165.method242(field174);
						field165.method208(var5);
						field165.method243(field175);
						field165.method242(field176);
					}
				}

				if (var4 == 269) {
					if (field153) {
						field178.method554(var3 - 4, var2 - 4);
					} else {
						field178.method554(field1215 - 4, field1214 - 4);
					}
				}

				if (var4 == 169) {
					RLTBSHTA var33 = field170[var5];
					if (var33 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var33.field913[0], var33.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field560 += var5;
						if (field560 >= 85) {
							field165.method206(204);
							field165.method210(0x26AFEF);
							field560 = 0;
						}

						field165.method206(41);
						field165.method208(var5);
					}
				}

				if (var4 == 301 || var4 == 769) {
					String var34 = field296[arg0];
					int var35 = var34.indexOf("@whi@");
					if (var35 != -1) {
						var34 = var34.substring(var35 + 5).trim();
						String var36 = WAQVJSXE.method465(WAQVJSXE.method462(WAQVJSXE.method461(var34)));
						boolean var37 = false;
						for (int var38 = 0; var38 < field306; var38++) {
							ZATRZGAA var39 = field305[field307[var38]];
							if (var39 != null && var39.field1396 != null && var39.field1396.equalsIgnoreCase(var36)) {
								method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var39.field913[0], var39.field914[0]);

								if (var4 == 301) {
									field165.method206(107);
									field165.method208(field307[var38]);
								}

								if (var4 == 769) {
									if ((var5 & 0x3) == 0) {
										field285++;
									}

									if (field285 >= 118) {
										field165.method206(223);
										field165.method211(0);
										field285 = 0;
									}

									field165.method206(32);
									field165.method243(field307[var38]);
								}

								var37 = true;
								break;
							}
						}

						if (!var37) {
							method79("Unable to find " + var36, 0, "");
						}
					}
				}

				if (var4 == 608) {
					RLTBSHTA var40 = field170[var5];
					if (var40 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var40.field913[0], var40.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(229);
						field165.method242(var5);
					}
				}

				if (var4 == 136) {
					ZATRZGAA var41 = field305[var5];
					if (var41 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var41.field913[0], var41.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(177);
						field165.method208(var5);
					}
				}

				if (var4 == 394) {
					field165.method206(239);
					field165.method243(var3);
					field165.method242(var5);
					field165.method208(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 736) {
					method75(field477);
					field477 = -1;
					field245 = true;
				}

				if (var4 == 534) {
					field165.method206(220);
					field165.method208(var2);
					field165.method242(var5);
					field165.method243(var3);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 930) {
					field165.method206(142);
					field165.method244(var5);
					field165.method242(var3);
					field165.method208(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 4) {
					field165.method206(110);
					field165.method208(var3);
					field165.method243(var5);
					field165.method242(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 1069) {
					VXCJHHIE var42 = VXCJHHIE.method447(var5);
					String var43;
					if (var42.field1254 == null) {
						var43 = "It's a " + var42.field1250 + ".";
					} else {
						var43 = new String(var42.field1254);
					}

					method79(var43, 0, "");
				}

				if (var4 == 399) {
					boolean var44 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var44) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(70);
					field165.method208(field328 + var3);
					field165.method243(field327 + var2);
					field165.method242(field150);
					field165.method244(var5);
				}

				if (var4 == 335) {
					field165.method206(116);
					field165.method244(var3);
					field165.method243(field175);
					field165.method242(var5);
					field165.method208(field174);
					field165.method244(field176);
					field165.method242(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 446) {
					field366++;
					if (field366 >= 66) {
						field165.method206(66);
						field165.method210(0xF43EEB);
						field366 = 0;
					}

					field165.method206(222);
					field165.method244(var3);
					field165.method208(var5);
					field165.method208(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 253) {
					if ((var2 & 0x3) == 0) {
						field471++;
					}

					if (field471 >= 93) {
						field165.method206(157);
						field471 = 0;
					}

					field165.method206(233);
					field165.method243(var3);
					field165.method208(var5);
					field165.method243(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 320) {
					RLTBSHTA var46 = field170[var5];
					if (var46 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var46.field913[0], var46.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field539++;
						if (field539 >= 120) {
							field165.method206(242);
							field539 = 0;
						}

						field165.method206(15);
						field165.method243(var5);
					}
				}

				if (var4 == 367) {
					ZATRZGAA var47 = field305[var5];
					if (var47 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var47.field913[0], var47.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(230);
						field165.method208(var5);
					}
				}

				if (var4 == 997) {
					QXTIWHBH var48 = QXTIWHBH.method380(var3);
					boolean var49 = true;
					if (var48.field1093 > 0) {
						var49 = method125(var48);
					}

					if (var49) {
						field165.method206(129);
						field165.method208(var3);
					}
				}

				if (var4 == 1217) {
					VXCJHHIE var50 = VXCJHHIE.method447(var5);
					QXTIWHBH var51 = QXTIWHBH.method380(var3);
					String var52;
					if (var51 != null && var51.field1041[var2] >= 100000) {
						var52 = var51.field1041[var2] + " x " + var50.field1250;
					} else if (var50.field1254 == null) {
						var52 = "It's a " + var50.field1250 + ".";
					} else {
						var52 = new String(var50.field1254);
					}

					method79(var52, 0, "");
				}

				if (var4 == 321) {
					ZATRZGAA var53 = field305[var5];
					if (var53 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var53.field913[0], var53.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(107);
						field165.method208(var5);
					}
				}

				if (var4 == 286) {
					field165.method206(189);
					field165.method242(var5);
					field165.method208(var2);
					field165.method243(var3);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 210) {
					field165.method206(176);
					field165.method244(var3);
					field165.method242(var2);
					field165.method244(var5);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 22 && !field512) {
					field165.method206(17);
					field165.method208(var3);
					field512 = true;
				}

				if (var4 == 481) {
					String var54 = field296[arg0];
					int var55 = var54.indexOf("@whi@");
					if (var55 != -1) {
						long var56 = WAQVJSXE.method461(var54.substring(var55 + 5).trim());
						int var58 = -1;
						for (int var59 = 0; var59 < field298; var59++) {
							if (field335[var59] == var56) {
								var58 = var59;
								break;
							}
						}

						if (var58 != -1 && field251[var58] > 0) {
							field245 = true;
							field434 = 0;
							field195 = true;
							field334 = "";
							field381 = 3;
							field546 = field335[var58];
							field457 = "Enter message to send to " + field183[var58];
						}
					}
				}

				if (var4 == 913) {
					field314++;
					if (field314 >= 91) {
						field165.method206(2);
						field314 = 0;
					}

					field165.method206(82);
					field165.method208(var2);
					field165.method242(var3);
					field165.method208(var5);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 974) {
					ZATRZGAA var60 = field305[var5];
					if (var60 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var60.field913[0], var60.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(45);
						field165.method208(var5);
					}
				}

				if (var4 == 1299) {
					method83(var2, var3, var5);
					field165.method206(187);
					field165.method208(field328 + var3);
					field165.method208(var5 >> 14 & 0x7FFF);
					field165.method208(field327 + var2);
				}

				if (var4 == 543) {
					method127();
				}

				if (var4 == 746) {
					field165.method206(173);
					field165.method208(var2);
					field165.method242(var3);
					field165.method208(var5);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 871 && method83(var2, var3, var5)) {
					field165.method206(120);
					field165.method242(field175);
					field165.method242(field176);
					field165.method242(var5 >> 14 & 0x7FFF);
					field165.method243(field174);
					field165.method242(field327 + var2);
					field165.method208(field328 + var3);
				}

				if (var4 == 82 && method83(var2, var3, var5)) {
					field165.method206(74);
					field165.method242(field328 + var3);
					field165.method242(field327 + var2);
					field165.method243(field150);
					field165.method208(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 88) {
					RLTBSHTA var61 = field170[var5];
					if (var61 != null) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var61.field913[0], var61.field914[0]);
						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(21);
						field165.method244(var5);
					}
				}

				if (var4 == 405) {
					field165.method206(129);
					field165.method208(var3);
					QXTIWHBH var62 = QXTIWHBH.method380(var3);
					if (var62.field1109 != null && var62.field1109[0][0] == 5) {
						int var63 = var62.field1109[0][1];
						field286[var63] = 1 - field286[var63];
						method69(var63);
						field312 = true;
					}
				}

				if (var4 == 864) {
					field165.method206(201);
					field165.method244(var3);
					field165.method242(field150);
					field165.method208(var5);
					field165.method243(var2);
					field444 = 0;
					field445 = var3;
					field446 = var2;
					field447 = 2;
					if (QXTIWHBH.method380(var3).field1096 == field212) {
						field447 = 1;
					}

					if (QXTIWHBH.method380(var3).field1096 == field210) {
						field447 = 3;
					}
				}

				if (var4 == 880) {
					boolean var64 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
					if (!var64) {
						method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
					}

					field533 = field1214;
					field534 = field1215;
					field536 = 2;
					field535 = 0;
					field165.method206(232);
					field165.method243(field327 + var2);
					field165.method244(var5);
					field165.method242(field328 + var3);
				}

				if (var4 == 632) {
					QXTIWHBH var66 = QXTIWHBH.method380(var3);
					field149 = 1;
					field150 = var3;
					field151 = var66.field1110;
					field173 = 0;
					field312 = true;
					String var67 = var66.field1060;
					if (var67.indexOf(" ") != -1) {
						var67 = var67.substring(0, var67.indexOf(" "));
					}

					String var68 = var66.field1060;
					if (var68.indexOf(" ") != -1) {
						var68 = var68.substring(var68.indexOf(" ") + 1);
					}

					field152 = var67 + " " + var66.field1063 + " " + var68;

					if (field151 == 16) {
						field312 = true;
						field147 = 3;
						field122 = true;
					}
				} else {
					if (var4 == 846) {
						method83(var2, var3, var5);
						field165.method206(212);
						field165.method243(field328 + var3);
						field165.method244(field327 + var2);
						field165.method243(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 244) {
						ZATRZGAA var69 = field305[var5];
						if (var69 != null) {
							method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var69.field913[0], var69.field914[0]);
							field533 = field1214;
							field534 = field1215;
							field536 = 2;
							field535 = 0;
							field165.method206(163);
							field165.method243(var5);
							field165.method243(field174);
							field165.method243(field176);
							field165.method242(field175);
						}
					}

					if (var4 == 740) {
						boolean var70 = method110(false, 2, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var2, var3);
						if (!var70) {
							method110(false, 2, 0, 1, 0, 0, field554.field914[0], 1, field554.field913[0], var2, var3);
						}

						field533 = field1214;
						field534 = field1215;
						field536 = 2;
						field535 = 0;
						field165.method206(52);
						field165.method244(field327 + var2);
						field165.method208(var5);
						field165.method244(field328 + var3);
					}

					field173 = 0;
					field149 = 0;
					field312 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method78() {
		if (field1200 == null) {
			method156();
			field493 = null;
			field494 = null;
			field495 = null;
			field496 = null;
			field497 = null;
			field498 = null;
			field499 = null;
			field500 = null;
			field501 = null;
			field157 = null;
			field155 = null;
			field154 = null;
			field156 = null;
			field479 = null;
			field480 = null;
			field481 = null;
			field1200 = new XBLPPVAP(method119(), 765, 503);
			field532 = true;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;Z)V")
	public final void method79(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field477 != -1) {
			field387 = arg0;
			field1213 = 0;
		}

		if (field210 == -1) {
			field245 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field490[var4] = field490[var4 - 1];
			field491[var4] = field491[var4 - 1];
			field492[var4] = field492[var4 - 1];
		}

		field490[0] = arg1;
		field491[0] = arg2;
		field492[0] = arg0;
	}

	@ObfuscatedName("client.a(LJNEOOHMF;B)V")
	public final void method80(JNEOOHMF arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field777 == 0) {
			var2 = field178.method542(arg0.field776, arg0.field778, arg0.field779);
		}

		if (arg0.field777 == 1) {
			var2 = field178.method543(arg0.field776, arg0.field778, arg0.field779);
		}

		if (arg0.field777 == 2) {
			var2 = field178.method544(arg0.field776, arg0.field778, arg0.field779);
		}

		if (arg0.field777 == 3) {
			var2 = field178.method545(arg0.field776, arg0.field778, arg0.field779);
		}

		if (var2 != 0) {
			int var6 = field178.method546(arg0.field776, arg0.field778, arg0.field779, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field781 = var3;
		arg0.field783 = var4;
		arg0.field782 = var5;
	}

	@ObfuscatedName("client.a()V")
	public final void method81() {
		method98("Starting up", 20);

		if (signlink.sunjava) {
			field1193 = 5;
		}

		if (field244) {
			field415 = true;
		} else {
			field244 = true;
			boolean var1 = false;
			String var2 = method105();
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
						field220[var3] = new YSPVLGYE(signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method74();
					field451 = method109("title screen", "title", 25, 1, field121[1]);
					field127 = new XQKSIEVT(false, field451, "p11_full");
					field128 = new XQKSIEVT(false, field451, "p12_full");
					field129 = new XQKSIEVT(false, field451, "b12_full");
					field130 = new XQKSIEVT(true, field451, "q8_full");
					method153();
					method176();
					MAARFNGV var4 = method109("config", "config", 30, 2, field121[2]);
					MAARFNGV var5 = method109("interface", "interface", 35, 3, field121[3]);
					MAARFNGV var6 = method109("2d graphics", "media", 40, 4, field121[4]);
					MAARFNGV var7 = method109("textures", "textures", 45, 6, field121[6]);
					MAARFNGV var8 = method109("chat system", "wordenc", 50, 7, field121[7]);
					MAARFNGV var9 = method109("sound effects", "sounds", 55, 8, field121[8]);
					field168 = new byte[4][104][104];
					field206 = new int[4][105][105];
					field178 = new ZPFBNGWW(field206, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field423[var10] = new CAMRNFMB(104, 104);
					}

					field361 = new TFHGRYAS(512, 512);
					MAARFNGV var11 = method109("update list", "versionlist", 60, 5, field121[5]);
					method98("Connecting to update server", 60);
					field332 = new KMIIMWED();
					field332.method317(var11, this);
					NXEWQQJO.method333(field332.method313());
					IEHKDFMR.method264(field332.method315(0), field332);

					if (!field241) {
						field416 = 0;
						field417 = true;
						field332.method321(2, field416);

						while (field332.method306() > 0) {
							method56();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field332.field848 > 3) {
								method91("ondemand");
								return;
							}
						}
					}

					method98("Requesting animations", 65);
					int var12 = field332.method315(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field332.method321(1, var13);
					}

					while (field332.method306() > 0) {
						int var14 = var12 - field332.method306();
						if (var14 > 0) {
							method98("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method56();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field332.field848 > 3) {
							method91("ondemand");
							return;
						}
					}

					method98("Requesting models", 70);
					int var15 = field332.method315(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field332.method322(var16);
						if ((var17 & 0x1) != 0) {
							field332.method321(0, var16);
						}
					}

					int var18 = field332.method306();
					while (field332.method306() > 0) {
						int var19 = var18 - field332.method306();
						if (var19 > 0) {
							method98("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method56();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field220[0] != null) {
						method98("Requesting maps", 75);
						field332.method321(3, field332.method308(47, 0, 48));
						field332.method321(3, field332.method308(47, 1, 48));
						field332.method321(3, field332.method308(48, 0, 48));
						field332.method321(3, field332.method308(48, 1, 48));
						field332.method321(3, field332.method308(49, 0, 48));
						field332.method321(3, field332.method308(49, 1, 48));
						field332.method321(3, field332.method308(47, 0, 47));
						field332.method321(3, field332.method308(47, 1, 47));
						field332.method321(3, field332.method308(48, 0, 47));
						field332.method321(3, field332.method308(48, 1, 47));
						field332.method321(3, field332.method308(48, 0, 148));
						field332.method321(3, field332.method308(48, 1, 148));
						int var20 = field332.method306();
						while (field332.method306() > 0) {
							int var21 = var20 - field332.method306();
							if (var21 > 0) {
								method98("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method56();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field332.method315(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field332.method322(var23);
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
							field332.method314(0, var23, var25);
						}
					}

					field332.method310(field240);

					if (!field241) {
						int var26 = field332.method315(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field332.method307(var27)) {
								field332.method314(2, var27, (byte) 1);
							}
						}
					}

					method98("Unpacking media", 80);
					field426 = new CMELCUKG(var6, "invback", 0);
					field428 = new CMELCUKG(var6, "chatback", 0);
					field427 = new CMELCUKG(var6, "mapback", 0);
					field124 = new CMELCUKG(var6, "backbase1", 0);
					field125 = new CMELCUKG(var6, "backbase2", 0);
					field126 = new CMELCUKG(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field425[var28] = new CMELCUKG(var6, "sideicons", var28);
					}

					field413 = new TFHGRYAS(var6, "compass", 0);
					field358 = new TFHGRYAS(var6, "mapedge", 0);
					field358.method421();

					for (int var29 = 0; var29 < 72; var29++) {
						field167[var29] = new CMELCUKG(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field211[var30] = new TFHGRYAS(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field236[var31] = new TFHGRYAS(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field268[var32] = new TFHGRYAS(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field541[var33] = new TFHGRYAS(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field422[var34] = new TFHGRYAS(var6, "headicons_hint", var34);
					}

					field433 = new TFHGRYAS(var6, "overlay_multiway", 0);
					field469 = new TFHGRYAS(var6, "mapmarker", 0);
					field470 = new TFHGRYAS(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field404[var35] = new TFHGRYAS(var6, "cross", var35);
					}

					field315 = new TFHGRYAS(var6, "mapdots", 0);
					field316 = new TFHGRYAS(var6, "mapdots", 1);
					field317 = new TFHGRYAS(var6, "mapdots", 2);
					field318 = new TFHGRYAS(var6, "mapdots", 3);
					field319 = new TFHGRYAS(var6, "mapdots", 4);
					field180 = new CMELCUKG(var6, "scrollbar", 0);
					field181 = new CMELCUKG(var6, "scrollbar", 1);
					field261 = new CMELCUKG(var6, "redstone1", 0);
					field262 = new CMELCUKG(var6, "redstone2", 0);
					field263 = new CMELCUKG(var6, "redstone3", 0);
					field264 = new CMELCUKG(var6, "redstone1", 0);
					field264.method195();
					field265 = new CMELCUKG(var6, "redstone2", 0);
					field265.method195();
					field458 = new CMELCUKG(var6, "redstone1", 0);
					field458.method196();
					field459 = new CMELCUKG(var6, "redstone2", 0);
					field459.method196();
					field460 = new CMELCUKG(var6, "redstone3", 0);
					field460.method196();
					field461 = new CMELCUKG(var6, "redstone1", 0);
					field461.method195();
					field461.method196();
					field462 = new CMELCUKG(var6, "redstone2", 0);
					field462.method195();
					field462.method196();

					for (int var36 = 0; var36 < 2; var36++) {
						field229[var36] = new CMELCUKG(var6, "mod_icons", var36);
					}

					TFHGRYAS var37 = new TFHGRYAS(var6, "backleft1", 0);
					field133 = new XBLPPVAP(method119(), var37.field1184, var37.field1185);
					var37.method422(0, 0);
					TFHGRYAS var38 = new TFHGRYAS(var6, "backleft2", 0);
					field134 = new XBLPPVAP(method119(), var38.field1184, var38.field1185);
					var38.method422(0, 0);
					TFHGRYAS var39 = new TFHGRYAS(var6, "backright1", 0);
					field135 = new XBLPPVAP(method119(), var39.field1184, var39.field1185);
					var39.method422(0, 0);
					TFHGRYAS var40 = new TFHGRYAS(var6, "backright2", 0);
					field136 = new XBLPPVAP(method119(), var40.field1184, var40.field1185);
					var40.method422(0, 0);
					TFHGRYAS var41 = new TFHGRYAS(var6, "backtop1", 0);
					field137 = new XBLPPVAP(method119(), var41.field1184, var41.field1185);
					var41.method422(0, 0);
					TFHGRYAS var42 = new TFHGRYAS(var6, "backvmid1", 0);
					field138 = new XBLPPVAP(method119(), var42.field1184, var42.field1185);
					var42.method422(0, 0);
					TFHGRYAS var43 = new TFHGRYAS(var6, "backvmid2", 0);
					field139 = new XBLPPVAP(method119(), var43.field1184, var43.field1185);
					var43.method422(0, 0);
					TFHGRYAS var44 = new TFHGRYAS(var6, "backvmid3", 0);
					field140 = new XBLPPVAP(method119(), var44.field1184, var44.field1185);
					var44.method422(0, 0);
					TFHGRYAS var45 = new TFHGRYAS(var6, "backhmid2", 0);
					field141 = new XBLPPVAP(method119(), var45.field1184, var45.field1185);
					var45.method422(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field211[var50] != null) {
							field211[var50].method420(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field167[var50] != null) {
							field167[var50].method197(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method98("Unpacking textures", 83);
					PTUBVHCT.method354(var7);
					PTUBVHCT.method358(0.8D);
					PTUBVHCT.method353(20);
					method98("Unpacking config", 86);
					VYXELYSX.method458(var4);
					AMVKCKZF.method10(var4);
					RSGRNXCC.method390(var4);
					VXCJHHIE.method448(var4);
					ZLQCXMFK.method511(var4);
					QRYQWAHS.method373(var4);
					SDNQJNMP.method394(var4);
					INYZAOQU.method293(var4);
					EFEPEUMF.method203(var4);
					VXCJHHIE.field1251 = field240;

					if (!field241) {
						method98("Unpacking sounds", 90);
						byte[] var51 = var9.method332("sounds.dat", null);
						EMWAMCXW var52 = new EMWAMCXW(var51);
						LTINEQTV.method325(var52);
					}

					method98("Unpacking interfaces", 95);
					XQKSIEVT[] var53 = new XQKSIEVT[] { field127, field128, field129, field130 };
					QXTIWHBH.method385(var5, var53, var6);
					method98("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field427.field573[field427.field575 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field208[var54] = var55;
						field158[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field427.field573[field427.field575 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field411[var58 - 5] = var59 - 25;
						field475[var58 - 5] = var60 - var59;
					}

					PTUBVHCT.method351(765, 503);
					field373 = PTUBVHCT.field988;
					PTUBVHCT.method351(479, 96);
					field370 = PTUBVHCT.field988;
					PTUBVHCT.method351(190, 261);
					field371 = PTUBVHCT.field988;
					PTUBVHCT.method351(512, 334);
					field372 = PTUBVHCT.field988;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = PTUBVHCT.field986[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					ZPFBNGWW.method552(334, 500, 800, var62, 512);
					ZWRCNFEU.method567(var8);
					field431 = new MWZVGOTL(this);
					method185(field431, 10);
					QARHEJHA.field1004 = this;
					AMVKCKZF.field43 = this;
					ZLQCXMFK.field1407 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field516 + " " + field511);
					field505 = true;
				}
			} else {
				field405 = true;
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method82(long arg0) {
		if (arg0 != 0L) {
			if (field523 >= 100) {
				method79("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = WAQVJSXE.method465(WAQVJSXE.method462(arg0));
				for (int var4 = 0; var4 < field523; var4++) {
					if (field237[var4] == arg0) {
						method79(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field298; var5++) {
					if (field335[var5] == arg0) {
						method79("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field237[field523++] = arg0;
				field312 = true;
				field165.method206(119);
				field165.method213(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method83(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field178.method546(field540, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			AMVKCKZF var8 = AMVKCKZF.method4(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field21;
				var10 = var8.field30;
			} else {
				var9 = var8.field30;
				var10 = var8.field21;
			}

			int var11 = var8.field3;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method110(true, 2, var11, var9, 0, 0, field554.field914[0], var10, field554.field913[0], arg0, arg1);
		} else {
			method110(true, 2, 0, 0, var7, var6 + 1, field554.field914[0], 0, field554.field913[0], arg0, arg1);
		}

		field533 = field1214;
		field534 = field1215;
		field536 = 2;
		field535 = 0;
		return true;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method84() {
		for (QEZQDRNH var1 = (QEZQDRNH) field549.method470(); var1 != null; var1 = (QEZQDRNH) field549.method472()) {
			if (field540 != var1.field1018 || var1.field1014) {
				var1.method338();
			} else if (field228 >= var1.field1022) {
				var1.method367(field320);

				if (var1.field1014) {
					var1.method338();
				} else {
					field178.method527(0, var1, var1.field1018, var1.field1021, var1.field1019, var1.field1020, -1, 60, false);
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method85() {
		if (field347 == 0) {
			int var1 = field1213;
			if (field149 == 1 && field1214 >= 516 && field1215 >= 160 && field1214 <= 765 && field1215 <= 205) {
				var1 = 0;
			}

			if (field153) {
				if (var1 != 1) {
					int var2 = field1207;
					int var3 = field1208;
					if (field199 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field199 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field199 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field200 - 10 || var2 > field202 + field200 + 10 || var3 < field201 - 10 || var3 > field203 + field201 + 10) {
						field153 = false;

						if (field199 == 1) {
							field312 = true;
						}

						if (field199 == 2) {
							field245 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field200;
					int var5 = field201;
					int var6 = field202;
					int var7 = field1214;
					int var8 = field1215;
					if (field199 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field199 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field199 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field375; var10++) {
						int var11 = (field375 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method77(var9);
					}

					field153 = false;

					if (field199 == 1) {
						field312 = true;
					}

					if (field199 == 2) {
						field245 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field375 > 0) {
					int var12 = field467[field375 - 1];
					if (var12 == 746 || var12 == 4 || var12 == 253 || var12 == 534 || var12 == 930 || var12 == 446 || var12 == 286 || var12 == 210 || var12 == 394 || var12 == 913 || var12 == 850 || var12 == 1217) {
						int var13 = field465[field375 - 1];
						int var14 = field466[field375 - 1];
						QXTIWHBH var15 = QXTIWHBH.method380(var14);
						if (var15.field1090 || var15.field1079) {
							field443 = false;
							field182 = 0;
							field345 = var14;
							field346 = var13;
							field347 = 2;
							field348 = field1214;
							field349 = field1215;

							if (QXTIWHBH.method380(var14).field1096 == field212) {
								field347 = 1;
							}

							if (QXTIWHBH.method380(var14).field1096 == field210) {
								field347 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field455 == 1 || method94(field375 - 1)) && field375 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field375 > 0) {
					method77(field375 - 1);
				}

				if (var1 != 2 || field375 <= 0) {
					return;
				}

				method40();
			}
		}
	}

	@ObfuscatedName("client.a(ZLQXTIWHBH;)Z")
	public final boolean method86(QXTIWHBH arg0) {
		int var2 = arg0.field1093;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field296[field375] = "Remove @whi@" + arg0.field1107;
				field467[field375] = 903;
				field375++;
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

		field296[field375] = "Remove @whi@" + field183[var2];
		field467[field375] = 299;
		field375++;
		field296[field375] = "Message @whi@" + field183[var2];
		field467[field375] = 481;
		field375++;
		return true;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 364);

			if (arg0.length == 5) {
				field238 = Integer.parseInt(arg0[0]);
				field239 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method76();
				} else if (arg0[2].equals("highmem")) {
					method141();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field240 = false;
				} else if (arg0[3].equals("members")) {
					field240 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method432(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = IEHKDFMR.field725[var7];
			int var13 = IEHKDFMR.field726[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = IEHKDFMR.field725[var8];
			int var16 = IEHKDFMR.field726[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field526 = arg1 - var9;
		field527 = arg3 - var10;
		field528 = arg5 - var11;
		field529 = arg2;
		field530 = arg4;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method88(String arg0) throws IOException {
		if (field274) {
			if (field342 != null) {
				try {
					field342.close();
				} catch (Exception var4) {
				}

				field342 = null;
			}

			field342 = method100(43595);
			field342.setSoTimeout(10000);
			InputStream var2 = field342.getInputStream();
			OutputStream var3 = field342.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method89() {
		if (field157 == null) {
			method156();
			field1200 = null;
			field493 = null;
			field494 = null;
			field495 = null;
			field496 = null;
			field497 = null;
			field498 = null;
			field499 = null;
			field500 = null;
			field501 = null;
			field157 = new XBLPPVAP(method119(), 479, 96);
			field155 = new XBLPPVAP(method119(), 172, 156);
			ANTOHTCU.method15();
			field427.method198(0, 0);
			field154 = new XBLPPVAP(method119(), 190, 261);
			field156 = new XBLPPVAP(method119(), 512, 334);
			ANTOHTCU.method15();
			field479 = new XBLPPVAP(method119(), 496, 50);
			field480 = new XBLPPVAP(method119(), 269, 37);
			field481 = new XBLPPVAP(method119(), 249, 45);
			field532 = true;
			field156.method477();
			PTUBVHCT.field988 = field372;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method90() {
		if (field415 || field505 || field405) {
			method157();
		} else {
			field295++;

			if (field418) {
				method150();
			} else {
				method158(false);
			}

			field432 = 0;
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method91(String arg0) {
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

	@ObfuscatedName("client.a(ZZ)V")
	public final void method92(boolean arg0) {
		if (field554.field937 >> 7 == field359 && field554.field938 >> 7 == field360) {
			field359 = 0;
			field352++;
			if (field352 > 175) {
				field352 = 0;
				field165.method206(202);
				field165.method211(0);
			}
		}

		int var2 = field306;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			ZATRZGAA var4;
			int var5;
			if (arg0) {
				var4 = field554;
				var5 = field304 << 14;
			} else {
				var4 = field305[field307[var3]];
				var5 = field307[var3] << 14;
			}

			if (var4 != null && var4.method342()) {
				var4.field1395 = false;
				if ((field241 && field306 > 50 || field306 > 200) && !arg0 && var4.field955 == var4.field919) {
					var4.field1395 = true;
				}

				int var6 = var4.field937 >> 7;
				int var7 = var4.field938 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1390 == null || field228 < var4.field1382 || field228 >= var4.field1383) {
						if ((var4.field937 & 0x7F) == 0x40 && (var4.field938 & 0x7F) == 0x40) {
							if (field288[var6][var7] == field559) {
								continue;
							}

							field288[var6][var7] = field559;
						}

						var4.field1384 = method114(field540, var4.field937, var4.field938);
						field178.method527(var4.field939, var4, field540, var4.field1384, var4.field937, var4.field938, var5, 60, var4.field949);
					} else {
						var4.field1395 = false;
						var4.field1384 = method114(field540, var4.field937, var4.field938);
						field178.method528(var4.field938, var4, var5, var4.field939, var4.field1377, var4.field937, var4.field1374, var4.field1376, field540, var4.field1375, 60, var4.field1384);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method93() {
		method137();

		if (field536 == 1) {
			field404[field535 / 100].method424(field533 - 8 - 4, field534 - 8 - 4);
		}

		if (field536 == 2) {
			field404[field535 / 100 + 4].method424(field533 - 8 - 4, field534 - 8 - 4);
			field463++;
			if (field463 > 1608) {
				field463 = 0;
				field165.method206(31);
				field165.method207(0);
				int var1 = field165.field617;

				if ((int) (Math.random() * 2.0D) == 0) {
					field165.method207(22);
				}

				field165.method207(218);
				field165.method207(64);
				field165.method208(3198);
				field165.method208(5250);

				if ((int) (Math.random() * 2.0D) == 0) {
					field165.method208(5949);
				}

				field165.method207((int) (Math.random() * 256.0D));
				field165.method208(32257);

				if ((int) (Math.random() * 2.0D) == 0) {
					field165.method208(41491);
				}

				field165.method208(44938);
				field165.method216(field165.field617 - var1);
			}
		}

		if (field515 != -1) {
			method171(field515, field320);
			method183(0, QXTIWHBH.method380(field515), 0, 0);
		}

		if (field212 != -1) {
			method171(field212, field320);
			method183(0, QXTIWHBH.method380(field212), 0, 0);
		}

		method164();

		if (!field153) {
			method120();
			method134();
		} else if (field199 == 0) {
			method63();
		}

		if (field452 == 1) {
			field433.method424(472, 296);
		}

		if (field322) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field1195 < 30 && field241) {
				var4 = 0xFF0000;
			}

			if (field1195 < 20 && !field241) {
				var4 = 0xFF0000;
			}

			field128.method480(var4, "Fps:" + field1195, var2, var3);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field241) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field241) {
				int var9 = 0xFF0000;
			}

			field128.method480(0xFFFF00, "Mem:" + var6 + "k", var2, var3);
			var3 += 15;
		}

		if (field436 != 0) {
			int var10 = field436 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field128.method485("System update in: " + var11 + ":0" + var10, 4, 0xFFFF00, 329);
			} else {
				field128.method485("System update in: " + var11 + ":" + var10, 4, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.g(II)Z")
	public final boolean method94(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field467[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 66) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method95() {
		if (field241 && field367 == 2 && SSYGWTYM.field1148 != field540) {
			method160(null, "Loading - please wait.");
			field367 = 1;
			field506 = System.currentTimeMillis();
		}

		if (field367 == 1) {
			int var1 = method96();
			if (var1 != 0 && System.currentTimeMillis() - field506 > 360000L) {
				signlink.reporterror(field429 + " glcfb " + field488 + "," + var1 + "," + field241 + "," + field220[0] + "," + field332.method306() + "," + field540 + "," + field270 + "," + field271);
				field506 = System.currentTimeMillis();
			}
		}

		if (field367 == 2 && field540 != field242) {
			field242 = field540;
			method172(field540);
		}
	}

	@ObfuscatedName("client.p(I)I")
	public final int method96() {
		for (int var1 = 0; var1 < field123.length; var1++) {
			if (field123[var1] == null && field254[var1] != -1) {
				return -1;
			}

			if (field442[var1] == null && field255[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field123.length; var3++) {
			byte[] var4 = field442[var3];
			if (var4 != null) {
				int var5 = (field253[var3] >> 8) * 64 - field327;
				int var6 = (field253[var3] & 0xFF) * 64 - field328;
				if (field464) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= SSYGWTYM.method418(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field225) {
			return -4;
		} else {
			field367 = 2;
			SSYGWTYM.field1148 = field540;
			method151();
			field165.method206(169);
			return 0;
		}
	}

	@ObfuscatedName("client.b(BLEMWAMCXW;I)V")
	public final void method97(EMWAMCXW arg0, int arg1) {
		arg0.method227();
		int var3 = arg0.method228(1);
		if (var3 != 0) {
			int var4 = arg0.method228(2);
			if (var4 == 0) {
				field309[field308++] = field304;
			} else if (var4 == 1) {
				int var5 = arg0.method228(3);
				field554.method343(var5, false);
				int var6 = arg0.method228(1);
				if (var6 == 1) {
					field309[field308++] = field304;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method228(3);
				field554.method343(var7, true);
				int var8 = arg0.method228(3);
				field554.method343(var8, true);
				int var9 = arg0.method228(1);
				if (var9 == 1) {
					field309[field308++] = field304;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method228(1);
				int var11 = arg0.method228(7);
				int var12 = arg0.method228(7);
				field540 = arg0.method228(2);
				int var13 = arg0.method228(1);
				if (var13 == 1) {
					field309[field308++] = field304;
				}

				field554.method339(var11, var10 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method98(String arg0, int arg1) {
		field511 = arg1;
		field516 = arg0;
		method175();

		if (field451 == null) {
			super.method98(arg0, arg1);
		} else {
			field495.method477();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field129.method481("RuneScape is loading - please wait...", 0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			ANTOHTCU.method18(var3 / 2 - 152, 304, 0x8C1111, 34, var6);
			ANTOHTCU.method18(var3 / 2 - 151, 302, 0, 32, var6 + 1);
			ANTOHTCU.method17(var3 / 2 - 150, var6 + 2, 0x8C1111, arg1 * 3, 30);
			ANTOHTCU.method17(arg1 * 3 + var3 / 2 - 150, var6 + 2, 0, 300 - arg1 * 3, 30);
			field129.method481(arg0, 0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5);
			field495.method478(171, 202, field1199);

			if (field532) {
				field532 = false;

				if (!field350) {
					field496.method478(0, 0, field1199);
					field497.method478(0, 637, field1199);
				}

				field493.method478(0, 128, field1199);
				field494.method478(371, 202, field1199);
				field498.method478(265, 0, field1199);
				field499.method478(265, 562, field1199);
				field500.method478(171, 128, field1199);
				field501.method478(171, 562, field1199);
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method99() {
		if (field441 > 0) {
			method159();
		} else {
			method160("Please wait - attempting to reestablish", "Connection lost");
			field260 = 0;
			field359 = 0;
			CLJPNHPC var1 = field453;
			field418 = false;
			field398 = 0;
			method73(field429, field430, true);

			if (!field418) {
				method159();
			}

			try {
				var1.method187();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.r(I)Ljava/net/Socket;")
	public final Socket method100(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.s(I)Z")
	public final boolean method101() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(BIILTFHGRYAS;)V")
	public final void method102(int arg0, int arg1, TFHGRYAS arg2) {
		if (arg2 != null) {
			int var4 = field354 + field257 & 0x7FF;
			int var5 = arg0 * arg0 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = IEHKDFMR.field725[var4];
				int var7 = IEHKDFMR.field726[var4];
				var6 = var6 * 256 / (field246 + 256);
				var7 = var7 * 256 / (field246 + 256);
				int var8 = arg0 * var6 + arg1 * var7 >> 16;
				int var9 = arg0 * var7 - arg1 * var6 >> 16;
				if (var5 > 2500) {
					arg2.method430(var8 + 94 + 4 - arg2.field1188 / 2, field427, 83 - var9 - arg2.field1189 / 2 - 4);
				} else {
					arg2.method424(var8 + 94 + 4 - arg2.field1188 / 2, 83 - var9 - arg2.field1189 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method103() {
		field275 = 0;
		for (int var1 = -1; var1 < field306 + field171; var1++) {
			OKXNBSEJ var2;
			if (var1 == -1) {
				var2 = field554;
			} else if (var1 < field306) {
				var2 = field305[field307[var1]];
			} else {
				var2 = field170[field172[var1 - field306]];
			}

			if (var2 != null && var2.method342()) {
				if (var2 instanceof RLTBSHTA) {
					ZLQCXMFK var3 = ((RLTBSHTA) var2).field1112;
					if (var3.field1432 != null) {
						var3 = var3.method510();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field306) {
					ZLQCXMFK var6 = ((RLTBSHTA) var2).field1112;
					if (var6.field1425 >= 0 && var6.field1425 < field541.length) {
						method122(var2.field912 + 15, var2);

						if (field389 > -1) {
							field541[var6.field1425].method424(field389 - 12, field390 - 30);
						}
					}

					if (field207 == 1 && field172[var1 - field306] == field311 && field228 % 20 < 10) {
						method122(var2.field912 + 15, var2);

						if (field389 > -1) {
							field422[0].method424(field389 - 12, field390 - 28);
						}
					}
				} else {
					int var4 = 30;
					ZATRZGAA var5 = (ZATRZGAA) var2;
					if (var5.field1397 != -1 || var5.field1393 != -1) {
						method122(var2.field912 + 15, var2);

						if (field389 > -1) {
							if (var5.field1397 != -1) {
								field268[var5.field1397].method424(field389 - 12, field390 - var4);
								var4 += 25;
							}

							if (var5.field1393 != -1) {
								field541[var5.field1393].method424(field389 - 12, field390 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field207 == 10 && field307[var1] == field424) {
						method122(var2.field912 + 15, var2);

						if (field389 > -1) {
							field422[1].method424(field389 - 12, field390 - var4);
						}
					}
				}

				if (var2.field953 != null && (var1 >= field306 || field378 == 0 || field378 == 3 || field378 == 1 && method107(((ZATRZGAA) var2).field1396))) {
					method122(var2.field912, var2);

					if (field389 > -1 && field275 < field276) {
						field280[field275] = field129.method484(var2.field953) / 2;
						field279[field275] = field129.field1357;
						field277[field275] = field389;
						field278[field275] = field390;
						field281[field275] = var2.field954;
						field282[field275] = var2.field940;
						field283[field275] = var2.field932;
						field284[field275++] = var2.field953;

						if (field226 == 0 && var2.field940 >= 1 && var2.field940 <= 3) {
							field279[field275] += 10;
							field278[field275] += 5;
						}

						if (field226 == 0 && var2.field940 == 4) {
							field280[field275] = 60;
						}

						if (field226 == 0 && var2.field940 == 5) {
							field279[field275] += 5;
						}
					}
				}

				if (var2.field926 > field228) {
					method122(var2.field912 + 15, var2);

					if (field389 > -1) {
						int var7 = var2.field927 * 30 / var2.field928;
						if (var7 > 30) {
							var7 = 30;
						}

						ANTOHTCU.method17(field389 - 15, field390 - 3, 0xFF00, var7, 5);
						ANTOHTCU.method17(field389 + var7 - 15, field390 - 3, 0xFF0000, 30 - var7, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field952[var8] > field228) {
						method122(var2.field912 / 2, var2);

						if (field389 > -1) {
							if (var8 == 1) {
								field390 -= 20;
							}

							if (var8 == 2) {
								field389 -= 15;
								field390 -= 10;
							}

							if (var8 == 3) {
								field389 += 15;
								field390 -= 10;
							}

							field236[var2.field951[var8]].method424(field389 - 12, field390 - 12);
							field127.method481(String.valueOf(var2.field950[var8]), 0, field389, field390 + 4);
							field127.method481(String.valueOf(var2.field950[var8]), 0xFFFFFF, field389 - 1, field390 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field275; var9++) {
			int var10 = field277[var9];
			int var11 = field278[var9];
			int var12 = field280[var9];
			int var13 = field279[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field278[var15] - field279[var15] && var11 - var13 < field278[var15] + 2 && var10 - var12 < field280[var15] + field277[var15] && var10 + var12 > field277[var15] - field280[var15] && field278[var15] - field279[var15] < var11) {
						var11 = field278[var15] - field279[var15];
						var14 = true;
					}
				}
			}

			field389 = field277[var9];
			field390 = field278[var9] = var11;
			String var16 = field284[var9];
			if (field226 == 0) {
				int var17 = 0xFFFF00;
				if (field281[var9] < 6) {
					var17 = field344[field281[var9]];
				}

				if (field281[var9] == 6) {
					var17 = field559 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field281[var9] == 7) {
					var17 = field559 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field281[var9] == 8) {
					var17 = field559 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field281[var9] == 9) {
					int var18 = 150 - field283[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field281[var9] == 10) {
					int var19 = 150 - field283[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field281[var9] == 11) {
					int var20 = 150 - field283[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field282[var9] == 0) {
					field129.method481(var16, 0, field389, field390 + 1);
					field129.method481(var16, var17, field389, field390);
				}

				if (field282[var9] == 1) {
					field129.method486(var16, field390 + 1, field389, field559, 0);
					field129.method486(var16, field390, field389, field559, var17);
				}

				if (field282[var9] == 2) {
					field129.method487(0, field559, var16, field390 + 1, field389);
					field129.method487(var17, field559, var16, field390, field389);
				}

				if (field282[var9] == 3) {
					field129.method488(0, field390 + 1, field389, 150 - field283[var9], field559, var16);
					field129.method488(var17, field390, field389, 150 - field283[var9], field559, var16);
				}

				if (field282[var9] == 4) {
					int var21 = field129.method484(var16);
					int var22 = (150 - field283[var9]) * (var21 + 100) / 150;
					ANTOHTCU.method14(field389 + 50, 0, 334, field389 - 50);
					field129.method485(var16, field389 + 50 - var22, 0, field390 + 1);
					field129.method485(var16, field389 + 50 - var22, var17, field390);
					ANTOHTCU.method13();
				}

				if (field282[var9] == 5) {
					int var23 = 150 - field283[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					ANTOHTCU.method14(512, field390 - field129.field1357 - 1, field390 + 5, 0);
					field129.method481(var16, 0, field389, field390 + var24 + 1);
					field129.method481(var16, var17, field389, field390 + var24);
					ANTOHTCU.method13();
				}
			} else {
				field129.method481(var16, 0, field389, field390 + 1);
				field129.method481(var16, 0xFFFF00, field389, field390);
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method104() {
		if (field1213 == 1) {
			if (field1214 >= 6 && field1214 <= 106 && field1215 >= 467 && field1215 <= 499) {
				field378 = (field378 + 1) % 4;
				field160 = true;
				field245 = true;
				field165.method206(178);
				field165.method207(field378);
				field165.method207(field143);
				field165.method207(field273);
			}

			if (field1214 >= 135 && field1214 <= 235 && field1215 >= 467 && field1215 <= 499) {
				field143 = (field143 + 1) % 3;
				field160 = true;
				field245 = true;
				field165.method206(178);
				field165.method207(field378);
				field165.method207(field143);
				field165.method207(field273);
			}

			if (field1214 >= 273 && field1214 <= 373 && field1215 >= 467 && field1215 <= 499) {
				field273 = (field273 + 1) % 3;
				field160 = true;
				field245 = true;
				field165.method206(178);
				field165.method207(field378);
				field165.method207(field143);
				field165.method207(field273);
			}

			if (field1214 >= 412 && field1214 <= 512 && field1215 >= 467 && field1215 <= 499) {
				if (field212 == -1) {
					method127();
					field517 = "";
					field474 = false;
					field504 = field212 = QXTIWHBH.field1078;
					return;
				}

				method79("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	@ObfuscatedName("client.h(Z)Ljava/lang/String;")
	public final String method105() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1202 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.u(I)V")
	public final void method106() {
		field562 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field267[var1] = -1;
			for (int var2 = 0; var2 < QRYQWAHS.field1031; var2++) {
				if (!QRYQWAHS.field1032[var2].field1038 && QRYQWAHS.field1032[var2].field1033 == var1 + (field337 ? 0 : 7)) {
					field267[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method107(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field298; var2++) {
			if (arg0.equalsIgnoreCase(field183[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field554.field1396)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method108() {
		field532 = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IIII)LMAARFNGV;")
	public final MAARFNGV method109(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field220[0] != null) {
				var6 = field220[0].method500(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field547.reset();
			field547.update(var6);
			int var8 = (int) field547.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new MAARFNGV(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method98("Requesting " + arg0, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method88(arg1 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				EMWAMCXW var16 = new EMWAMCXW(var15);
				var16.field617 = 3;
				int var17 = var16.method221() + 6;
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
						method98("Loading " + arg0 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field220[0] != null) {
						field220[0].method501(var6, var6.length, arg3);
					}
				} catch (Exception var28) {
					field220[0] = null;
				}

				if (var6 != null) {
					field547.reset();
					field547.update(var6);
					int var23 = (int) field547.getValue();
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
						method98("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method98(var11 + " - Retrying in " + var25, arg2);
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

				field274 = !field274;
			}
		}

		return new MAARFNGV(var6);
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIIB)Z")
	public final boolean method110(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field518[var14][var15] = 0;
				field250[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg6;
		field518[arg8][arg6] = 99;
		field250[arg8][arg6] = 0;
		byte var18 = 0;
		int var19 = 0;
		field448[var18] = arg8;
		int var39 = var18 + 1;
		field449[var18] = arg6;
		boolean var20 = false;
		int var21 = field448.length;
		int[][] var22 = field423[field540].field119;
		while (var39 != var19) {
			var16 = field448[var19];
			var17 = field449[var19];
			var19 = (var19 + 1) % var21;

			if (arg9 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && field423[field540].method37(arg9, var17, var16, arg10, arg4, arg5 - 1)) {
					var20 = true;
					break;
				}

				if (arg5 < 10 && field423[field540].method38(arg5 - 1, arg9, arg10, arg4, var17, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg7 != 0 && field423[field540].method39(arg10, arg7, arg3, var17, arg9, arg2, var16)) {
				var20 = true;
				break;
			}

			int var23 = field250[var16][var17] + 1;
			if (var16 > 0 && field518[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field448[var39] = var16 - 1;
				field449[var39] = var17;
				var39 = (var39 + 1) % var21;
				field518[var16 - 1][var17] = 2;
				field250[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field518[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field448[var39] = var16 + 1;
				field449[var39] = var17;
				var39 = (var39 + 1) % var21;
				field518[var16 + 1][var17] = 8;
				field250[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field518[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field448[var39] = var16;
				field449[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field518[var16][var17 - 1] = 1;
				field250[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field518[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field448[var39] = var16;
				field449[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field518[var16][var17 + 1] = 4;
				field250[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field518[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field448[var39] = var16 - 1;
				field449[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field518[var16 - 1][var17 - 1] = 3;
				field250[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field518[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field448[var39] = var16 + 1;
				field449[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field518[var16 + 1][var17 - 1] = 9;
				field250[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field518[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field448[var39] = var16 - 1;
				field449[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field518[var16 - 1][var17 + 1] = 6;
				field250[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field518[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field448[var39] = var16 + 1;
				field449[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field518[var16 + 1][var17 + 1] = 12;
				field250[var16 + 1][var17 + 1] = var23;
			}
		}

		field376 = 0;
		if (!var20) {
			if (!arg0) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg9 - var26; var27 <= arg9 + var26; var27++) {
				for (int var28 = arg10 - var26; var28 <= arg10 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field250[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg9) {
							var29 = arg9 - var27;
						} else if (var27 > arg3 + arg9 - 1) {
							var29 = var27 + 1 - arg3 - arg9;
						}

						int var30 = 0;
						if (var28 < arg10) {
							var30 = arg10 - var28;
						} else if (var28 > arg7 + arg10 - 1) {
							var30 = var28 + 1 - arg7 - arg10;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field250[var27][var28] < var25) {
							var24 = var31;
							var25 = field250[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg8 == var16 && arg6 == var17) {
				return false;
			}

			field376 = 1;
		}

		byte var32 = 0;
		field448[var32] = var16;
		int var40 = var32 + 1;
		field449[var32] = var17;
		int var33;
		int var34 = var33 = field518[var16][var17];
		while (arg8 != var16 || arg6 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field448[var40] = var16;
				field449[var40++] = var17;
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

			var34 = field518[var16][var17];
		}

		if (var40 <= 0) {
			if (arg1 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field448[var40];
		int var37 = field449[var40];

		if (arg1 == 0) {
			field165.method206(143);
			field165.method207(var35 + var35 + 3);
		}

		if (arg1 == 1) {
			field165.method206(115);
			field165.method207(var35 + var35 + 3 + 14);
		}

		if (arg1 == 2) {
			field165.method206(236);
			field165.method207(var35 + var35 + 3);
		}

		field359 = field448[0];
		field360 = field449[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field165.method233(field448[var40] - var36);
			field165.method233(field449[var40] - var37);
		}

		field165.method244(field327 + var36);
		field165.method235(field1217[5] == 1 ? 1 : 0);
		field165.method208(field328 + var37);
		return true;
	}

	@ObfuscatedName("client.h(II)V")
	public final void method111(int arg0, int arg1) {
		WTGHTNMN var3 = field391[field540][arg0][arg1];
		if (var3 == null) {
			field178.method537(field540, arg0, arg1);
		} else {
			int var4 = -99999999;
			BOFPAALI var5 = null;
			for (BOFPAALI var6 = (BOFPAALI) var3.method470(); var6 != null; var6 = (BOFPAALI) var3.method472()) {
				VXCJHHIE var7 = VXCJHHIE.method447(var6.field107);
				int var8 = var7.field1259;
				if (var7.field1253) {
					var8 = (var6.field106 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method468(var5);
			BOFPAALI var9 = null;
			BOFPAALI var10 = null;
			for (BOFPAALI var11 = (BOFPAALI) var3.method470(); var11 != null; var11 = (BOFPAALI) var3.method472()) {
				if (var5.field107 != var11.field107 && var9 == null) {
					var9 = var11;
				}

				if (var5.field107 != var11.field107 && var9.field107 != var11.field107 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field178.method523(var10, var5, arg0, var9, var12, arg1, method114(field540, arg0 * 128 + 64, arg1 * 128 + 64), field540);
		}
	}

	@ObfuscatedName("client.v(I)Z")
	public final boolean method112() {
		if (field453 == null) {
			return false;
		}

		try {
			int var1 = field453.method189();
			if (var1 == 0) {
				return false;
			}

			if (field438 == -1) {
				field453.method190(field408.field616, 0, 1);
				field438 = field408.field616[0] & 0xFF;
				if (field217 != null) {
					field438 = field438 - field217.method496() & 0xFF;
				}

				field437 = VBGFRUER.field1222[field438];
				var1--;
			}

			if (field437 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field453.method190(field408.field616, 0, 1);
				field437 = field408.field616[0] & 0xFF;
				var1--;
			}

			if (field437 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field453.method190(field408.field616, 0, 2);
				field408.field617 = 0;
				field437 = field408.method219();
				var1 -= 2;
			}

			if (var1 < field437) {
				return false;
			}

			field408.field617 = 0;
			field453.method190(field408.field616, 0, field437);
			field439 = 0;
			field522 = field521;
			field521 = field520;
			field520 = field438;

			if (field438 == 21) {
				field293 = field408.method236();
				field292 = field408.method238();
				field438 = -1;
				return true;
			}

			if (field438 == 18) {
				long var2 = field408.method223();
				int var4 = field408.method217();
				String var5 = WAQVJSXE.method465(WAQVJSXE.method462(var2));
				for (int var6 = 0; var6 < field298; var6++) {
					if (field335[var6] == var2) {
						if (field251[var6] != var4) {
							field251[var6] = var4;
							field312 = true;

							if (var4 > 0) {
								method79(var5 + " has logged in.", 5, "");
							}

							if (var4 == 0) {
								method79(var5 + " has logged out.", 5, "");
							}
						}

						var5 = null;
						break;
					}
				}

				if (var5 != null && field298 < 200) {
					field335[field298] = var2;
					field183[field298] = var5;
					field251[field298] = var4;
					field298++;
					field312 = true;
				}

				boolean var7 = false;
				while (!var7) {
					var7 = true;
					for (int var8 = 0; var8 < field298 - 1; var8++) {
						if (field251[var8] != field238 && field251[var8 + 1] == field238 || field251[var8] == 0 && field251[var8 + 1] != 0) {
							int var9 = field251[var8];
							field251[var8] = field251[var8 + 1];
							field251[var8 + 1] = var9;
							String var10 = field183[var8];
							field183[var8] = field183[var8 + 1];
							field183[var8 + 1] = var10;
							long var11 = field335[var8];
							field335[var8] = field335[var8 + 1];
							field335[var8 + 1] = var11;
							field312 = true;
							var7 = false;
						}
					}
				}

				field438 = -1;
				return true;
			}

			if (field438 == 232) {
				field198 = field408.method219();
				field489 = field408.method217();
				field438 = -1;
				return true;
			}

			if (field438 == 58) {
				int var13 = field408.method246();
				int var14 = field408.method246();
				int var15 = field408.method245();
				QXTIWHBH.method380(var14).field1048 = (var15 << 16) + var13;
				field438 = -1;
				return true;
			}

			if (field438 == 25) {
				int var16 = field408.method247();
				method61(var16);

				if (field377 != -1) {
					method75(field377);
					field377 = -1;
					field312 = true;
					field122 = true;
				}

				if (field210 != -1) {
					method75(field210);
					field210 = -1;
					field245 = true;
				}

				if (field297 != -1) {
					method75(field297);
					field297 = -1;
					field532 = true;
				}

				if (field537 != -1) {
					method75(field537);
					field537 = -1;
				}

				if (field212 != var16) {
					method75(field212);
					field212 = var16;
				}

				if (field434 != 0) {
					field434 = 0;
					field245 = true;
				}

				field512 = false;
				field438 = -1;
				return true;
			}

			if (field438 == 215) {
				method159();
				field438 = -1;
				return false;
			}

			if (field438 != 4 && field438 != 5) {
				if (field438 == 212) {
					field408.method246();
					field487 = field408.method245();
					field420 = field408.method222();
					field538 = field408.method219();
					field218 = field408.method247();
					field551 = field408.method247();
					field408.method246();
					field386 = field408.method246();
					field408.method236();
					field556 = field408.method245();
					field408.method246();
					signlink.dnslookup(WAQVJSXE.method464(field420));
					field438 = -1;
					return true;
				}

				if (field438 == 167) {
					field249 = field408.method238();
					if (field249 == field147) {
						if (field249 == 3) {
							field147 = 1;
						} else {
							field147 = 3;
						}

						field312 = true;
					}

					field438 = -1;
					return true;
				}

				if (field438 == 60) {
					int var67 = field408.method219();
					int var68 = field408.method217();
					int var69 = field408.method219();
					if (var69 == 0xFFFF) {
						if (field336 < 50) {
							field341[field336] = (short) var67;
							field473[field336] = var68;
							field184[field336] = 0;
							field336++;
						}
					} else if (field509 && !field241 && field336 < 50) {
						field341[field336] = var67;
						field473[field336] = var68;
						field184[field336] = LTINEQTV.field857[var67] + var69;
						field336++;
					}

					field438 = -1;
					return true;
				}

				if (field438 == 186) {
					field523 = field437 / 8;
					for (int var70 = 0; var70 < field523; var70++) {
						field237[var70] = field408.method223();
					}

					field438 = -1;
					return true;
				}

				if (field438 == 149) {
					if (field147 == 12) {
						field312 = true;
					}

					field552 = field408.method220();
					field438 = -1;
					return true;
				}

				if (field438 == 49) {
					String var71 = field408.method224();
					if (var71.endsWith(":tradereq:")) {
						String var72 = var71.substring(0, var71.indexOf(":"));
						long var73 = WAQVJSXE.method461(var72);
						boolean var75 = false;
						for (int var76 = 0; var76 < field523; var76++) {
							if (field237[var76] == var73) {
								var75 = true;
								break;
							}
						}

						if (!var75 && field259 == 0) {
							method79("wishes to trade with you.", 4, var72);
						}
					} else if (var71.endsWith(":duelreq:")) {
						String var77 = var71.substring(0, var71.indexOf(":"));
						long var78 = WAQVJSXE.method461(var77);
						boolean var80 = false;
						for (int var81 = 0; var81 < field523; var81++) {
							if (field237[var81] == var78) {
								var80 = true;
								break;
							}
						}

						if (!var80 && field259 == 0) {
							method79("wishes to duel with you.", 8, var77);
						}
					} else if (var71.endsWith(":chalreq:")) {
						String var82 = var71.substring(0, var71.indexOf(":"));
						long var83 = WAQVJSXE.method461(var82);
						boolean var85 = false;
						for (int var86 = 0; var86 < field523; var86++) {
							if (field237[var86] == var83) {
								var85 = true;
								break;
							}
						}

						if (!var85 && field259 == 0) {
							String var87 = var71.substring(var71.indexOf(":") + 1, var71.length() - 9);
							method79(var87, 8, var82);
						}
					} else {
						method79(var71, 0, "");
					}

					field438 = -1;
					return true;
				}

				if (field438 == 44) {
					int var88 = field408.method219();
					int var89 = field408.method246();
					int var90 = field408.method247();
					if (var90 == 0xFFFF) {
						QXTIWHBH.method380(var88).field1072 = 0;
						field438 = -1;
						return true;
					}

					VXCJHHIE var91 = VXCJHHIE.method447(var90);
					QXTIWHBH.method380(var88).field1072 = 4;
					QXTIWHBH.method380(var88).field1073 = var90;
					QXTIWHBH.method380(var88).field1084 = var91.field1235;
					QXTIWHBH.method380(var88).field1085 = var91.field1252;
					QXTIWHBH.method380(var88).field1083 = var91.field1240 * 100 / var89;
					field438 = -1;
					return true;
				}

				if (field438 == 145) {
					if (field147 == 12) {
						field312 = true;
					}

					field252 = field408.method217();
					field438 = -1;
					return true;
				}

				if (field438 != 76) {
					if (field438 == 99) {
						int var92 = field408.method246();
						QXTIWHBH.method380(var92).field1072 = 3;

						if (field554.field1380 == null) {
							QXTIWHBH.method380(var92).field1073 = (field554.field1373[11] << 5) + (field554.field1373[8] << 10) + (field554.field1373[0] << 15) + (field554.field1391[0] << 25) + (field554.field1391[4] << 20) + field554.field1373[1];
						} else {
							QXTIWHBH.method380(var92).field1073 = (int) (field554.field1380.field1401 + 0x12345678L);
						}

						field438 = -1;
						return true;
					}

					if (field438 == 236 || field438 == 19 || field438 == 231 || field438 == 131 || field438 == 216 || field438 == 65 || field438 == 93 || field438 == 94 || field438 == 103 || field438 == 87 || field438 == 191) {
						method113(field408, field438);
						field438 = -1;
						return true;
					}

					if (field438 == 162) {
						field302 = false;

						for (int var93 = 0; var93 < 5; var93++) {
							field357[var93] = false;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 148) {
						int var94 = field408.method217();
						int var95 = field408.method217();
						int var96 = field408.method217();
						int var97 = field408.method217();
						field357[var94] = true;
						field421[var94] = var95;
						field214[var94] = var96;
						field548[var94] = var97;
						field519[var94] = 0;
						field438 = -1;
						return true;
					}

					if (field438 == 250) {
						int var98 = field408.method219();
						if (var98 == 0xFFFF) {
							var98 = -1;
						}

						if (field248 != var98 && field227 && !field241 && field374 == 0) {
							field416 = var98;
							field417 = true;
							field332.method321(2, field416);
						}

						field248 = var98;
						field438 = -1;
						return true;
					}

					if (field438 == 84) {
						int var99 = field408.method245();
						int var100 = field408.method250();
						if (field227 && !field241) {
							field416 = var99;
							field417 = false;
							field332.method321(2, field416);
							field374 = var100;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 134) {
						int var101 = field408.method247();
						byte var102 = field408.method241();
						field164[var101] = var102;

						if (field286[var101] != var102) {
							field286[var101] = var102;
							method69(var101);
							field312 = true;

							if (field477 != -1) {
								field245 = true;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 59) {
						int var103 = field408.method246();
						int var104 = field408.method249();
						int var105 = field408.method248();
						QXTIWHBH var106 = QXTIWHBH.method380(var103);
						var106.field1108 = var105;
						var106.field1045 = var104;
						field438 = -1;
						return true;
					}

					if (field438 == 233) {
						field452 = field408.method217();
						field438 = -1;
						return true;
					}

					if (field438 == 3) {
						field359 = 0;
						field438 = -1;
						return true;
					}

					if (field438 == 153) {
						field260 = field408.method217();
						field438 = -1;
						return true;
					}

					if (field438 == 180) {
						int var107 = field408.method246();
						boolean var108 = field408.method237() == 1;
						QXTIWHBH.method380(var107).field1104 = var108;
						field438 = -1;
						return true;
					}

					if (field438 == 144) {
						int var109 = field408.method246();
						int var110 = field408.method246();
						QXTIWHBH.method380(var109).field1072 = 1;
						QXTIWHBH.method380(var109).field1073 = var110;
						field438 = -1;
						return true;
					}

					if (field438 == 14) {
						int var111 = field408.method245();
						method61(var111);

						if (field210 != -1) {
							method75(field210);
							field210 = -1;
							field245 = true;
						}

						if (field297 != -1) {
							method75(field297);
							field297 = -1;
							field532 = true;
						}

						if (field537 != -1) {
							method75(field537);
							field537 = -1;
						}

						if (field212 != -1) {
							method75(field212);
							field212 = -1;
						}

						if (field377 != var111) {
							method75(field377);
							field377 = var111;
						}

						if (field434 != 0) {
							field434 = 0;
							field245 = true;
						}

						field312 = true;
						field122 = true;
						field512 = false;
						field438 = -1;
						return true;
					}

					if (field438 == 211) {
						int var112 = field408.method238();
						String var113 = field408.method224();
						int var114 = field408.method238();
						if (var112 >= 1 && var112 <= 5) {
							if (var113.equalsIgnoreCase("null")) {
								var113 = null;
							}

							field188[var112 - 1] = var113;
							field189[var112 - 1] = var114 == 0;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 73) {
						int var115 = field408.method248();
						if (var115 >= 0) {
							method61(var115);
						}

						if (field515 != var115) {
							method75(field515);
							field515 = var115;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 225) {
						field312 = true;
						int var116 = field408.method219();
						QXTIWHBH var117 = QXTIWHBH.method380(var116);
						int var118 = field408.method219();
						for (int var119 = 0; var119 < var118; var119++) {
							int var120 = field408.method237();
							if (var120 == 255) {
								var120 = field408.method222();
							}

							var117.field1111[var119] = field408.method247();
							var117.field1041[var119] = var120;
						}

						for (int var121 = var118; var121 < var117.field1111.length; var121++) {
							var117.field1111[var121] = 0;
							var117.field1041[var121] = 0;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 221) {
						long var122 = field408.method223();
						int var124 = field408.method222();
						int var125 = field408.method217();
						boolean var126 = false;
						for (int var127 = 0; var127 < 100; var127++) {
							if (field234[var127] == var124) {
								var126 = true;
								break;
							}
						}

						if (var125 <= 1) {
							for (int var128 = 0; var128 < field523; var128++) {
								if (field237[var128] == var122) {
									var126 = true;
									break;
								}
							}
						}

						if (!var126 && field259 == 0) {
							try {
								field234[field289] = var124;
								field289 = (field289 + 1) % 100;
								String var129 = EXGZUGXN.method256(field408, field437 - 13);
								if (var125 != 3) {
									var129 = ZWRCNFEU.method577(var129);
								}

								if (var125 == 2 || var125 == 3) {
									method79(var129, 7, "@cr2@" + WAQVJSXE.method465(WAQVJSXE.method462(var122)));
								} else if (var125 == 1) {
									method79(var129, 7, "@cr1@" + WAQVJSXE.method465(WAQVJSXE.method462(var122)));
								} else {
									method79(var129, 3, WAQVJSXE.method465(WAQVJSXE.method462(var122)));
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 140) {
						int var131 = field408.method245();
						String var132 = field408.method224();
						QXTIWHBH.method380(var131).field1107 = var132;

						if (field196[field147] == QXTIWHBH.method380(var131).field1096) {
							field312 = true;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 241) {
						field302 = true;
						field482 = field408.method217();
						field483 = field408.method217();
						field484 = field408.method219();
						field485 = field408.method217();
						field486 = field408.method217();
						if (field486 >= 100) {
							field526 = field482 * 128 + 64;
							field528 = field483 * 128 + 64;
							field527 = method114(field540, field526, field528) - field484;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 90) {
						field299 = field408.method217();
						field312 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 64) {
						int var133 = field408.method245();
						int var134 = field408.method219();
						QXTIWHBH var135 = QXTIWHBH.method380(var134);
						if (var135 != null && var135.field1077 == 0) {
							if (var133 < 0) {
								var133 = 0;
							}

							if (var133 > var135.field1057 - var135.field1065) {
								var133 = var135.field1057 - var135.field1065;
							}

							var135.field1055 = var133;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 2) {
						field147 = field408.method238();
						field312 = true;
						field122 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 45) {
						if (field377 != -1) {
							method75(field377);
							field377 = -1;
							field312 = true;
							field122 = true;
						}

						if (field210 != -1) {
							method75(field210);
							field210 = -1;
							field245 = true;
						}

						if (field297 != -1) {
							method75(field297);
							field297 = -1;
							field532 = true;
						}

						if (field537 != -1) {
							method75(field537);
							field537 = -1;
						}

						if (field212 != -1) {
							method75(field212);
							field212 = -1;
						}

						if (field434 != 0) {
							field434 = 0;
							field245 = true;
						}

						field512 = false;
						field438 = -1;
						return true;
					}

					if (field438 == 217) {
						field436 = field408.method219() * 30;
						field438 = -1;
						return true;
					}

					if (field438 == 249) {
						int var136 = field408.method219();
						int var137 = field408.method245();

						if (field210 != -1) {
							method75(field210);
							field210 = -1;
							field245 = true;
						}

						if (field297 != -1) {
							method75(field297);
							field297 = -1;
							field532 = true;
						}

						if (field537 != -1) {
							method75(field537);
							field537 = -1;
						}

						if (field212 != var136) {
							method75(field212);
							field212 = var136;
						}

						if (field377 != var137) {
							method75(field377);
							field377 = var137;
						}

						if (field434 != 0) {
							field434 = 0;
							field245 = true;
						}

						field312 = true;
						field122 = true;
						field512 = false;
						field438 = -1;
						return true;
					}

					if (field438 == 234) {
						field312 = true;
						int var138 = field408.method236();
						int var139 = field408.method236();
						int var140 = field408.method253();
						field166[var139] = var140;
						field388[var139] = var138;
						field142[var139] = 1;
						for (int var141 = 0; var141 < 98; var141++) {
							if (var140 >= field213[var141]) {
								field142[var139] = var141 + 2;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 214) {
						field292 = field408.method237();
						field293 = field408.method236();

						while (field408.field617 < field437) {
							int var142 = field408.method217();
							method113(field408, var142);
						}

						field438 = -1;
						return true;
					}

					if (field438 == 210) {
						int var143 = field408.method245();
						int var144 = field408.method247();
						int var145 = var144 >> 10 & 0x1F;
						int var146 = var144 >> 5 & 0x1F;
						int var147 = var144 & 0x1F;
						QXTIWHBH.method380(var143).field1040 = (var147 << 3) + (var145 << 19) + (var146 << 11);
						field438 = -1;
						return true;
					}

					if (field438 == 181) {
						for (int var148 = 0; var148 < field305.length; var148++) {
							if (field305[var148] != null) {
								field305[var148].field942 = -1;
							}
						}

						for (int var149 = 0; var149 < field170.length; var149++) {
							if (field170[var149] != null) {
								field170[var149].field942 = -1;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 194) {
						method126(field408, field437);
						field225 = false;
						field438 = -1;
						return true;
					}

					if (field438 == 163) {
						int var150 = field408.method247();
						QXTIWHBH var151 = QXTIWHBH.method380(var150);
						for (int var152 = 0; var152 < var151.field1111.length; var152++) {
							var151.field1111[var152] = -1;
							var151.field1111[var152] = 0;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 223) {
						field302 = true;
						field399 = field408.method217();
						field400 = field408.method217();
						field401 = field408.method219();
						field402 = field408.method217();
						field403 = field408.method217();
						if (field403 >= 100) {
							int var153 = field399 * 128 + 64;
							int var154 = field400 * 128 + 64;
							int var155 = method114(field540, var153, var154) - field401;
							int var156 = var153 - field526;
							int var157 = var155 - field527;
							int var158 = var154 - field528;
							int var159 = (int) Math.sqrt(var156 * var156 + var158 * var158);
							field529 = (int) (Math.atan2(var157, var159) * 325.949D) & 0x7FF;
							field530 = (int) (Math.atan2(var156, var158) * -325.949D) & 0x7FF;

							if (field529 < 128) {
								field529 = 128;
							}

							if (field529 > 383) {
								field529 = 383;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 197) {
						int var160 = field408.method246();
						int var161 = field408.method219();
						int var162 = field408.method247();
						int var163 = field408.method219();
						QXTIWHBH.method380(var163).field1084 = var161;
						QXTIWHBH.method380(var163).field1085 = var162;
						QXTIWHBH.method380(var163).field1083 = var160;
						field438 = -1;
						return true;
					}

					if (field438 == 16) {
						int var164 = field408.method220();
						int var165 = field408.method245();
						QXTIWHBH var166 = QXTIWHBH.method380(var165);
						if (var166.field1066 != var164 || var164 == -1) {
							var166.field1066 = var164;
							var166.field1054 = 0;
							var166.field1098 = 0;
						}

						field438 = -1;
						return true;
					}

					if (field438 == 91) {
						int var167 = field408.method219();
						int var168 = field408.method219();
						QXTIWHBH.method380(var167).field1072 = 2;
						QXTIWHBH.method380(var167).field1073 = var168;
						field438 = -1;
						return true;
					}

					if (field438 == 106) {
						field312 = true;
						int var169 = field408.method219();
						QXTIWHBH var170 = QXTIWHBH.method380(var169);
						while (field408.field617 < field437) {
							int var171 = field408.method231();
							int var172 = field408.method219();
							int var173 = field408.method217();
							if (var173 == 255) {
								var173 = field408.method222();
							}

							if (var171 >= 0 && var171 < var170.field1111.length) {
								var170.field1111[var171] = var172;
								var170.field1041[var171] = var173;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 160) {
						int var174 = field408.method219();
						int var175 = field408.method237();

						if (var174 == 0xFFFF) {
							var174 = -1;
						}

						if (field196[var175] != var174) {
							method75(field196[var175]);
							field196[var175] = var174;
						}

						field312 = true;
						field122 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 238) {
						field293 = field408.method217();
						field292 = field408.method217();
						for (int var176 = field292; var176 < field292 + 8; var176++) {
							for (int var177 = field293; var177 < field293 + 8; var177++) {
								if (field391[field540][var176][var177] != null) {
									field391[field540][var176][var177] = null;
									method111(var176, var177);
								}
							}
						}

						for (JNEOOHMF var178 = (JNEOOHMF) field216.method470(); var178 != null; var178 = (JNEOOHMF) field216.method472()) {
							if (var178.field778 >= field292 && var178.field778 < field292 + 8 && var178.field779 >= field293 && var178.field779 < field293 + 8 && field540 == var178.field776) {
								var178.field780 = 0;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 229) {
						int var179 = field408.method219();
						method61(var179);

						if (field377 != -1) {
							method75(field377);
							field377 = -1;
							field312 = true;
							field122 = true;
						}

						if (field297 != -1) {
							method75(field297);
							field297 = -1;
							field532 = true;
						}

						if (field537 != -1) {
							method75(field537);
							field537 = -1;
						}

						if (field212 != -1) {
							method75(field212);
							field212 = -1;
						}

						if (field210 != var179) {
							method75(field210);
							field210 = var179;
						}

						field512 = false;
						field245 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 219) {
						for (int var180 = 0; var180 < field286.length; var180++) {
							if (field286[var180] != field164[var180]) {
								field286[var180] = field164[var180];
								method69(var180);
								field312 = true;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 81) {
						field195 = false;
						field434 = 2;
						field340 = "";
						field245 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 39) {
						field378 = field408.method217();
						field143 = field408.method217();
						field273 = field408.method217();
						field160 = true;
						field245 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 71) {
						int var181 = field408.method252();
						int var182 = field408.method247();
						field164[var182] = var181;

						if (field286[var182] != var181) {
							field286[var182] = var181;
							method69(var182);
							field312 = true;

							if (field477 != -1) {
								field245 = true;
							}
						}

						field438 = -1;
						return true;
					}

					if (field438 == 129) {
						field207 = field408.method217();
						if (field207 == 1) {
							field311 = field408.method219();
						}

						if (field207 >= 2 && field207 <= 6) {
							if (field207 == 2) {
								field395 = 64;
								field396 = 64;
							}

							if (field207 == 3) {
								field395 = 0;
								field396 = 64;
							}

							if (field207 == 4) {
								field395 = 128;
								field396 = 64;
							}

							if (field207 == 5) {
								field395 = 64;
								field396 = 0;
							}

							if (field207 == 6) {
								field395 = 64;
								field396 = 128;
							}

							field207 = 2;
							field392 = field408.method219();
							field393 = field408.method219();
							field394 = field408.method217();
						}

						if (field207 == 10) {
							field424 = field408.method219();
						}

						field438 = -1;
						return true;
					}

					if (field438 == 68) {
						int var183 = field408.method246();
						int var184 = field408.method247();
						method61(var184);

						if (var183 != -1) {
							method61(var183);
						}

						if (field212 != -1) {
							method75(field212);
							field212 = -1;
						}

						if (field377 != -1) {
							method75(field377);
							field377 = -1;
						}

						if (field210 != -1) {
							method75(field210);
							field210 = -1;
						}

						if (field297 != var184) {
							method75(field297);
							field297 = var184;
						}

						if (field537 != var184) {
							method75(field537);
							field537 = var183;
						}

						field434 = 0;
						field512 = false;
						field438 = -1;
						return true;
					}

					if (field438 == 255) {
						int var185 = field408.method249();
						if (field477 != var185) {
							method75(field477);
							field477 = var185;
						}

						field245 = true;
						field438 = -1;
						return true;
					}

					if (field438 == 30) {
						field195 = false;
						field434 = 1;
						field340 = "";
						field245 = true;
						field438 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field438 + "," + field437 + " - " + field521 + "," + field522);
					method159();
					return true;
				}

				method115(field408, field437);
				field438 = -1;
				return true;
			}

			int var17 = field270;
			int var18 = field271;
			if (field438 == 4) {
				var17 = field408.method246();
				var18 = field408.method245();
				field464 = false;
			}

			if (field438 == 5) {
				var17 = field408.method245();
				var18 = field408.method219();
				field408.method227();

				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field408.method228(1);
							if (var22 == 1) {
								field351[var19][var20][var21] = field408.method228(26);
							} else {
								field351[var19][var20][var21] = -1;
							}
						}
					}
				}

				field408.method229();
				field464 = true;
			}

			if (field270 == var17 && field271 == var18 && field367 == 2) {
				field438 = -1;
				return true;
			}

			field270 = var17;
			field271 = var18;
			field327 = (field270 - 6) * 8;
			field328 = (field271 - 6) * 8;
			field364 = false;
			if ((field270 / 8 == 48 || field270 / 8 == 49) && field271 / 8 == 48) {
				field364 = true;
			}

			if (field270 / 8 == 48 && field271 / 8 == 148) {
				field364 = true;
			}

			field367 = 1;
			field506 = System.currentTimeMillis();
			method160(null, "Loading - please wait.");

			if (field438 == 4) {
				int var23 = 0;
				for (int var24 = (field270 - 6) / 8; var24 <= (field270 + 6) / 8; var24++) {
					for (int var25 = (field271 - 6) / 8; var25 <= (field271 + 6) / 8; var25++) {
						var23++;
					}
				}

				field123 = new byte[var23][];
				field442 = new byte[var23][];
				field253 = new int[var23];
				field254 = new int[var23];
				field255 = new int[var23];
				int var26 = 0;
				for (int var27 = (field270 - 6) / 8; var27 <= (field270 + 6) / 8; var27++) {
					for (int var28 = (field271 - 6) / 8; var28 <= (field271 + 6) / 8; var28++) {
						field253[var26] = (var27 << 8) + var28;

						if (field364 && (var28 == 49 || var28 == 149 || var28 == 147 || var27 == 50 || var27 == 49 && var28 == 47)) {
							field254[var26] = -1;
							field255[var26] = -1;
							var26++;
						} else {
							int var29 = field254[var26] = field332.method308(var27, 0, var28);
							if (var29 != -1) {
								field332.method321(3, var29);
							}

							int var30 = field255[var26] = field332.method308(var27, 1, var28);
							if (var30 != -1) {
								field332.method321(3, var30);
							}

							var26++;
						}
					}
				}
			}

			if (field438 == 5) {
				int var31 = 0;
				int[] var32 = new int[676];
				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field351[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 14 & 0x3FF;
								int var38 = var36 >> 3 & 0x7FF;
								int var39 = (var37 / 8 << 8) + var38 / 8;
								for (int var40 = 0; var40 < var31; var40++) {
									if (var32[var40] == var39) {
										var39 = -1;
										break;
									}
								}

								if (var39 != -1) {
									var32[var31++] = var39;
								}
							}
						}
					}
				}

				field123 = new byte[var31][];
				field442 = new byte[var31][];
				field253 = new int[var31];
				field254 = new int[var31];
				field255 = new int[var31];
				for (int var41 = 0; var41 < var31; var41++) {
					int var42 = field253[var41] = var32[var41];
					int var43 = var42 >> 8 & 0xFF;
					int var44 = var42 & 0xFF;
					int var45 = field254[var41] = field332.method308(var43, 0, var44);
					if (var45 != -1) {
						field332.method321(3, var45);
					}

					int var46 = field255[var41] = field332.method308(var43, 1, var44);
					if (var46 != -1) {
						field332.method321(3, var46);
					}
				}
			}

			int var47 = field327 - field329;
			int var48 = field328 - field330;
			field329 = field327;
			field330 = field328;

			for (int var49 = 0; var49 < 16384; var49++) {
				RLTBSHTA var50 = field170[var49];
				if (var50 != null) {
					for (int var51 = 0; var51 < 10; var51++) {
						var50.field913[var51] -= var47;
						var50.field914[var51] -= var48;
					}

					var50.field937 -= var47 * 128;
					var50.field938 -= var48 * 128;
				}
			}

			for (int var52 = 0; var52 < field303; var52++) {
				ZATRZGAA var53 = field305[var52];
				if (var53 != null) {
					for (int var54 = 0; var54 < 10; var54++) {
						var53.field913[var54] -= var47;
						var53.field914[var54] -= var48;
					}

					var53.field937 -= var47 * 128;
					var53.field938 -= var48 * 128;
				}
			}

			field225 = true;
			byte var55 = 0;
			byte var56 = 104;
			byte var57 = 1;
			if (var47 < 0) {
				var55 = 103;
				var56 = -1;
				var57 = -1;
			}

			byte var58 = 0;
			byte var59 = 104;
			byte var60 = 1;
			if (var48 < 0) {
				var58 = 103;
				var59 = -1;
				var60 = -1;
			}

			for (int var61 = var55; var61 != var56; var61 += var57) {
				for (int var62 = var58; var62 != var59; var62 += var60) {
					int var63 = var47 + var61;
					int var64 = var48 + var62;
					for (int var65 = 0; var65 < 4; var65++) {
						if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
							field391[var65][var61][var62] = field391[var65][var63][var64];
						} else {
							field391[var65][var61][var62] = null;
						}
					}
				}
			}

			for (JNEOOHMF var66 = (JNEOOHMF) field216.method470(); var66 != null; var66 = (JNEOOHMF) field216.method472()) {
				var66.field778 -= var47;
				var66.field779 -= var48;
				if (var66.field778 < 0 || var66.field779 < 0 || var66.field778 >= 104 || var66.field779 >= 104) {
					var66.method338();
				}
			}

			if (field359 != 0) {
				field359 -= var47;
				field360 -= var48;
			}

			field302 = false;
			field438 = -1;
			return true;
		} catch (IOException var190) {
			method99();
		} catch (Exception var191) {
			String var187 = "T2 - " + field438 + "," + field521 + "," + field522 + " - " + field437 + "," + (field554.field913[0] + field327) + "," + (field554.field914[0] + field328) + " - ";
			for (int var188 = 0; var188 < field437 && var188 < 50; var188++) {
				var187 = var187 + field408.field616[var188] + ",";
			}

			signlink.reporterror(var187);
			method159();
		}

		return true;
	}

	@ObfuscatedName("client.b(ILEMWAMCXW;I)V")
	public final void method113(EMWAMCXW arg0, int arg1) {
		if (arg1 == 216) {
			int var3 = arg0.method217();
			int var4 = (var3 >> 4 & 0x7) + field292;
			int var5 = (var3 & 0x7) + field293;
			int var6 = arg0.method219();
			int var7 = arg0.method217();
			int var8 = arg0.method219();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				QEZQDRNH var9 = new QEZQDRNH(field540, var6, var4, method114(field540, var4, var5) - var7, var5, var8, field228);
				field549.method467(var9);
			}
		} else if (arg1 == 19) {
			int var10 = arg0.method217();
			int var11 = (var10 >> 4 & 0x7) + field292;
			int var12 = (var10 & 0x7) + field293;
			int var13 = arg0.method219();
			int var14 = arg0.method219();
			int var15 = arg0.method219();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
				WTGHTNMN var16 = field391[field540][var11][var12];
				if (var16 != null) {
					for (BOFPAALI var17 = (BOFPAALI) var16.method470(); var17 != null; var17 = (BOFPAALI) var16.method472()) {
						if ((var13 & 0x7FFF) == var17.field107 && var17.field106 == var14) {
							var17.field106 = var15;
							break;
						}
					}

					method111(var11, var12);
				}
			}
		} else {
			if (arg1 == 236) {
				int var18 = arg0.method217();
				int var19 = (var18 >> 4 & 0x7) + field292;
				int var20 = (var18 & 0x7) + field293;
				int var21 = arg0.method219();
				int var22 = arg0.method217();
				int var23 = var22 >> 4 & 0xF;
				int var24 = var22 & 0x7;
				if (field554.field913[0] >= var19 - var23 && field554.field913[0] <= var19 + var23 && field554.field914[0] >= var20 - var23 && field554.field914[0] <= var20 + var23 && field509 && !field241 && field336 < 50) {
					field341[field336] = var21;
					field473[field336] = var24;
					field184[field336] = LTINEQTV.field857[var21];
					field336++;
				}
			}

			if (arg1 == 231) {
				int var25 = arg0.method219();
				int var26 = arg0.method219();
				byte var27 = arg0.method240();
				byte var28 = arg0.method239();
				int var29 = arg0.method238();
				int var30 = var29 >> 2;
				int var31 = var29 & 0x3;
				int var32 = field555[var30];
				byte var33 = arg0.method240();
				int var34 = arg0.method238();
				int var35 = (var34 >> 4 & 0x7) + field292;
				int var36 = (var34 & 0x7) + field293;
				byte var37 = arg0.method241();
				int var38 = arg0.method247();
				int var39 = arg0.method246();
				ZATRZGAA var40;
				if (field198 == var38) {
					var40 = field554;
				} else {
					var40 = field305[var38];
				}

				if (var40 != null) {
					AMVKCKZF var41 = AMVKCKZF.method4(var25);
					int var42 = field206[field540][var35][var36];
					int var43 = field206[field540][var35 + 1][var36];
					int var44 = field206[field540][var35 + 1][var36 + 1];
					int var45 = field206[field540][var35][var36 + 1];
					IEHKDFMR var46 = var41.method5(var30, var31, var42, var43, var44, var45, -1);
					if (var46 != null) {
						method169(-1, 0, 0, field540, var26 + 1, var35, var32, var39 + 1, var36);
						var40.field1382 = field228 + var26;
						var40.field1383 = field228 + var39;
						var40.field1390 = var46;
						int var47 = var41.field21;
						int var48 = var41.field30;
						if (var31 == 1 || var31 == 3) {
							var47 = var41.field30;
							var48 = var41.field21;
						}

						var40.field1387 = var35 * 128 + var47 * 64;
						var40.field1389 = var36 * 128 + var48 * 64;
						var40.field1388 = method114(field540, var40.field1387, var40.field1389);

						if (var33 > var27) {
							byte var49 = var33;
							var33 = var27;
							var27 = var49;
						}

						if (var37 > var28) {
							byte var50 = var37;
							var37 = var28;
							var28 = var50;
						}

						var40.field1374 = var33 + var35;
						var40.field1376 = var27 + var35;
						var40.field1375 = var36 + var37;
						var40.field1377 = var28 + var36;
					}
				}
			}

			if (arg1 == 94) {
				int var51 = arg0.method246();
				int var52 = arg0.method217();
				int var53 = (var52 >> 4 & 0x7) + field292;
				int var54 = (var52 & 0x7) + field293;
				int var55 = arg0.method247();
				if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
					BOFPAALI var56 = new BOFPAALI();
					var56.field107 = var51;
					var56.field106 = var55;

					if (field391[field540][var53][var54] == null) {
						field391[field540][var53][var54] = new WTGHTNMN();
					}

					field391[field540][var53][var54].method467(var56);
					method111(var53, var54);
				}
			} else if (arg1 == 87) {
				int var57 = arg0.method217();
				int var58 = (var57 >> 4 & 0x7) + field292;
				int var59 = (var57 & 0x7) + field293;
				int var60 = arg0.method217();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = field555[var61];
				if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
					method169(-1, var61, var62, field540, 0, var58, var63, -1, var59);
				}
			} else if (arg1 == 65) {
				int var64 = arg0.method217();
				int var65 = (var64 >> 4 & 0x7) + field292;
				int var66 = (var64 & 0x7) + field293;
				int var67 = var65 + arg0.method218();
				int var68 = var66 + arg0.method218();
				int var69 = arg0.method220();
				int var70 = arg0.method219();
				int var71 = arg0.method217() * 4;
				int var72 = arg0.method217() * 4;
				int var73 = arg0.method219();
				int var74 = arg0.method219();
				int var75 = arg0.method217();
				int var76 = arg0.method217();
				if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104 && var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && var70 != 0xFFFF) {
					var65 = var65 * 128 + 64;
					var66 = var66 * 128 + 64;
					var67 = var67 * 128 + 64;
					var68 = var68 * 128 + 64;
					WZPSCBGD var77 = new WZPSCBGD(field228 + var73, var66, var75, var72, field228 + var74, var70, field540, var65, var69, var76, method114(field540, var65, var66) - var71);
					var77.method476(var68, var67, field228 + var73, method114(field540, var67, var68) - var72);
					field120.method467(var77);
				}
			} else if (arg1 == 93) {
				int var78 = arg0.method245();
				int var79 = arg0.method238();
				int var80 = (var79 >> 4 & 0x7) + field292;
				int var81 = (var79 & 0x7) + field293;
				if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
					WTGHTNMN var82 = field391[field540][var80][var81];
					if (var82 != null) {
						for (BOFPAALI var83 = (BOFPAALI) var82.method470(); var83 != null; var83 = (BOFPAALI) var82.method472()) {
							if ((var78 & 0x7FFF) == var83.field107) {
								var83.method338();
								break;
							}
						}

						if (var82.method470() == null) {
							field391[field540][var80][var81] = null;
						}

						method111(var80, var81);
					}
				}
			} else if (arg1 == 103) {
				int var84 = arg0.method238();
				int var85 = var84 >> 2;
				int var86 = var84 & 0x3;
				int var87 = field555[var85];
				int var88 = arg0.method245();
				int var89 = arg0.method236();
				int var90 = (var89 >> 4 & 0x7) + field292;
				int var91 = (var89 & 0x7) + field293;
				if (var90 >= 0 && var91 >= 0 && var90 < 103 && var91 < 103) {
					int var92 = field206[field540][var90][var91];
					int var93 = field206[field540][var90 + 1][var91];
					int var94 = field206[field540][var90 + 1][var91 + 1];
					int var95 = field206[field540][var90][var91 + 1];
					if (var87 == 0) {
						NOSHZQIX var96 = field178.method538(var91, field540, var90);
						if (var96 != null) {
							int var97 = var96.field883 >> 14 & 0x7FFF;
							if (var85 == 2) {
								var96.field881 = new QARHEJHA(var94, var95, var86 + 4, 2, var92, var97, var93, var88, false);
								var96.field882 = new QARHEJHA(var94, var95, var86 + 1 & 0x3, 2, var92, var97, var93, var88, false);
							} else {
								var96.field881 = new QARHEJHA(var94, var95, var86, var85, var92, var97, var93, var88, false);
							}
						}
					}

					if (var87 == 1) {
						ONJGHIJC var98 = field178.method539(field540, var91, var90);
						if (var98 != null) {
							var98.field972 = new QARHEJHA(var94, var95, 0, 4, var92, var98.field973 >> 14 & 0x7FFF, var93, var88, false);
						}
					}

					if (var87 == 2) {
						DFLXLIDH var99 = field178.method540(var91, var90, field540);

						if (var85 == 11) {
							var85 = 10;
						}

						if (var99 != null) {
							var99.field585 = new QARHEJHA(var94, var95, var86, var85, var92, var99.field593 >> 14 & 0x7FFF, var93, var88, false);
						}
					}

					if (var87 == 3) {
						XJWTOVNQ var100 = field178.method541(var91, field540, var90);
						if (var100 != null) {
							var100.field1348 = new QARHEJHA(var94, var95, var86, 22, var92, var100.field1349 >> 14 & 0x7FFF, var93, var88, false);
						}
					}
				}
			} else if (arg1 == 131) {
				int var101 = arg0.method219();
				int var102 = arg0.method247();
				int var103 = arg0.method247();
				int var104 = arg0.method237();
				int var105 = (var104 >> 4 & 0x7) + field292;
				int var106 = (var104 & 0x7) + field293;
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && field198 != var101) {
					BOFPAALI var107 = new BOFPAALI();
					var107.field107 = var102;
					var107.field106 = var103;

					if (field391[field540][var105][var106] == null) {
						field391[field540][var105][var106] = new WTGHTNMN();
					}

					field391[field540][var105][var106].method467(var107);
					method111(var105, var106);
				}
			} else if (arg1 == 191) {
				int var108 = arg0.method238();
				int var109 = var108 >> 2;
				int var110 = var108 & 0x3;
				int var111 = field555[var109];
				int var112 = arg0.method217();
				int var113 = (var112 >> 4 & 0x7) + field292;
				int var114 = (var112 & 0x7) + field293;
				int var115 = arg0.method219();
				if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
					method169(var115, var109, var110, field540, 0, var113, var111, -1, var114);
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method114(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field168[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field206[var6][var4][var5] + field206[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field206[var6][var4][var5 + 1] + field206[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(LEMWAMCXW;ZI)V")
	public final void method115(EMWAMCXW arg0, int arg1) {
		field544 = 0;
		field308 = 0;
		method168(arg0, arg1);
		method116(arg0, arg1);
		method59(arg0, arg1);

		for (int var3 = 0; var3 < field544; var3++) {
			int var4 = field545[var3];
			if (field228 != field170[var4].field936) {
				field170[var4].field1112 = null;
				field170[var4] = null;
			}
		}

		if (arg0.field617 != arg1) {
			signlink.reporterror(field429 + " size mismatch in getnpcpos - pos:" + arg0.field617 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field171; var5++) {
			if (field170[field172[var5]] == null) {
				signlink.reporterror(field429 + " null entry in npc list - pos:" + var5 + " size:" + field171);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(ILEMWAMCXW;I)V")
	public final void method116(EMWAMCXW arg0, int arg1) {
		while (arg0.field618 + 21 < arg1 * 8) {
			int var3 = arg0.method228(14);
			if (var3 == 16383) {
				break;
			}

			if (field170[var3] == null) {
				field170[var3] = new RLTBSHTA();
			}

			RLTBSHTA var4 = field170[var3];
			field172[field171++] = var3;
			var4.field936 = field228;
			int var5 = arg0.method228(1);
			if (var5 == 1) {
				field309[field308++] = var3;
			}

			int var6 = arg0.method228(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method228(1);
			int var8 = arg0.method228(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1112 = ZLQCXMFK.method509(arg0.method228(13));
			var4.field948 = var4.field1112.field1429;
			var4.field931 = var4.field1112.field1423;
			var4.field915 = var4.field1112.field1434;
			var4.field916 = var4.field1112.field1430;
			var4.field917 = var4.field1112.field1418;
			var4.field918 = var4.field1112.field1433;
			var4.field919 = var4.field1112.field1399;
			var4.method339(field554.field914[0] + var6, var7 == 1, field554.field913[0] + var8);
		}

		arg0.method229();
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method117(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field523; var3++) {
				if (field237[var3] == arg0) {
					field523--;
					field312 = true;

					for (int var4 = var3; var4 < field523; var4++) {
						field237[var4] = field237[var4 + 1];
					}

					field165.method206(247);
					field165.method213(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public void method118() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field542);

		if (field332 != null) {
			System.out.println("Od-cycle:" + field332.field847);
		}

		System.out.println("loop-cycle:" + field228);
		System.out.println("draw-cycle:" + field295);
		System.out.println("ptype:" + field438);
		System.out.println("psize:" + field437);

		if (field453 != null) {
			field453.method192();
		}

		field1196 = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component method119() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1202 != null) {
			return field1202;
		}

		return this;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method120() {
		if (field347 == 0) {
			field296[0] = "Cancel";
			field467[0] = 1196;
			field375 = 1;
			if (field297 == -1) {
				method139();
				field365 = 0;
				field414 = 0;

				if (field1207 > 4 && field1208 > 4 && field1207 < 516 && field1208 < 338) {
					if (field212 == -1) {
						method44();
					} else {
						method46(0, QXTIWHBH.method380(field212), 4, 4, field1207, 0, field1208);
					}
				}

				if (field450 != field365) {
					field450 = field365;
				}

				if (field414 != field412) {
					field412 = field414;
				}

				field365 = 0;
				field414 = 0;

				if (field1207 > 553 && field1208 > 205 && field1207 < 743 && field1208 < 466) {
					if (field377 != -1) {
						method46(0, QXTIWHBH.method380(field377), 553, 205, field1207, 1, field1208);
					} else if (field196[field147] != -1) {
						method46(0, QXTIWHBH.method380(field196[field147]), 553, 205, field1207, 1, field1208);
					}
				}

				if (field365 != field159) {
					field312 = true;
					field159 = field365;
				}

				if (field414 != field161) {
					field312 = true;
					field161 = field414;
				}

				field365 = 0;
				field414 = 0;

				if (field1207 > 17 && field1208 > 357 && field1207 < 496 && field1208 < 453) {
					if (field210 != -1) {
						method46(0, QXTIWHBH.method380(field210), 17, 357, field1207, 2, field1208);
					} else if (field477 != -1) {
						method46(0, QXTIWHBH.method380(field477), 17, 357, field1207, 3, field1208);
					} else if (field1208 < 434 && field1207 < 426 && field434 == 0) {
						method186(field1208 - 357, field1207 - 17);
					}
				}

				if ((field210 != -1 || field477 != -1) && field365 != field266) {
					field245 = true;
					field266 = field365;
				}

				if ((field210 != -1 || field477 != -1) && field414 != field291) {
					field245 = true;
					field291 = field414;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field375 - 1; var2++) {
						if (field467[var2] < 1000 && field467[var2 + 1] > 1000) {
							String var3 = field296[var2];
							field296[var2] = field296[var2 + 1];
							field296[var2 + 1] = var3;
							int var4 = field467[var2];
							field467[var2] = field467[var2 + 1];
							field467[var2 + 1] = var4;
							int var5 = field465[var2];
							field465[var2] = field465[var2 + 1];
							field465[var2 + 1] = var5;
							int var6 = field466[var2];
							field466[var2] = field466[var2 + 1];
							field466[var2 + 1] = var6;
							int var7 = field468[var2];
							field468[var2] = field468[var2 + 1];
							field468[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field365 = 0;
				field414 = 0;
				method46(0, QXTIWHBH.method380(field297), 0, 0, field1207, 0, field1208);

				if (field450 != field365) {
					field450 = field365;
				}

				if (field414 != field412) {
					field412 = field414;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public final String method121(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ZILOKXNBSEJ;)V")
	public final void method122(int arg0, OKXNBSEJ arg1) {
		method123(arg0, arg1.field938, arg1.field937);
	}

	@ObfuscatedName("client.a(IZII)V")
	public final void method123(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method114(field540, arg2, arg1) - arg0;
			arg2 -= field526;
			var4 -= field527;
			arg1 -= field528;
			int var5 = IEHKDFMR.field725[field529];
			int var6 = IEHKDFMR.field726[field529];
			int var7 = IEHKDFMR.field725[field530];
			int var8 = IEHKDFMR.field726[field530];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field389 = (var9 << 9) / arg1 + PTUBVHCT.field982;
				field390 = (var11 << 9) / arg1 + PTUBVHCT.field983;
			} else {
				field389 = -1;
				field390 = -1;
			}
		} else {
			field389 = -1;
			field390 = -1;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method124() {
		if (field1213 == 1) {
			if (field1214 >= 539 && field1214 <= 573 && field1215 >= 169 && field1215 < 205 && field196[0] != -1) {
				field312 = true;
				field147 = 0;
				field122 = true;
			}

			if (field1214 >= 569 && field1214 <= 599 && field1215 >= 168 && field1215 < 205 && field196[1] != -1) {
				field312 = true;
				field147 = 1;
				field122 = true;
			}

			if (field1214 >= 597 && field1214 <= 627 && field1215 >= 168 && field1215 < 205 && field196[2] != -1) {
				field312 = true;
				field147 = 2;
				field122 = true;
			}

			if (field1214 >= 625 && field1214 <= 669 && field1215 >= 168 && field1215 < 203 && field196[3] != -1) {
				field312 = true;
				field147 = 3;
				field122 = true;
			}

			if (field1214 >= 666 && field1214 <= 696 && field1215 >= 168 && field1215 < 205 && field196[4] != -1) {
				field312 = true;
				field147 = 4;
				field122 = true;
			}

			if (field1214 >= 694 && field1214 <= 724 && field1215 >= 168 && field1215 < 205 && field196[5] != -1) {
				field312 = true;
				field147 = 5;
				field122 = true;
			}

			if (field1214 >= 722 && field1214 <= 756 && field1215 >= 169 && field1215 < 205 && field196[6] != -1) {
				field312 = true;
				field147 = 6;
				field122 = true;
			}

			if (field1214 >= 540 && field1214 <= 574 && field1215 >= 466 && field1215 < 502 && field196[7] != -1) {
				field312 = true;
				field147 = 7;
				field122 = true;
			}

			if (field1214 >= 572 && field1214 <= 602 && field1215 >= 466 && field1215 < 503 && field196[8] != -1) {
				field312 = true;
				field147 = 8;
				field122 = true;
			}

			if (field1214 >= 599 && field1214 <= 629 && field1215 >= 466 && field1215 < 503 && field196[9] != -1) {
				field312 = true;
				field147 = 9;
				field122 = true;
			}

			if (field1214 >= 627 && field1214 <= 671 && field1215 >= 467 && field1215 < 502 && field196[10] != -1) {
				field312 = true;
				field147 = 10;
				field122 = true;
			}

			if (field1214 >= 669 && field1214 <= 699 && field1215 >= 466 && field1215 < 503 && field196[11] != -1) {
				field312 = true;
				field147 = 11;
				field122 = true;
			}

			if (field1214 >= 696 && field1214 <= 726 && field1215 >= 466 && field1215 < 503 && field196[12] != -1) {
				field312 = true;
				field147 = 12;
				field122 = true;
			}

			if (field1214 >= 724 && field1214 <= 758 && field1215 >= 466 && field1215 < 502 && field196[13] != -1) {
				field312 = true;
				field147 = 13;
				field122 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILQXTIWHBH;)Z")
	public final boolean method125(QXTIWHBH arg0) {
		int var2 = arg0.field1093;
		if (field299 == 2) {
			if (var2 == 201) {
				field245 = true;
				field434 = 0;
				field195 = true;
				field334 = "";
				field381 = 1;
				field457 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field245 = true;
				field434 = 0;
				field195 = true;
				field334 = "";
				field381 = 2;
				field457 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field441 = 250;
			return true;
		}

		if (var2 == 501) {
			field245 = true;
			field434 = 0;
			field195 = true;
			field334 = "";
			field381 = 4;
			field457 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field245 = true;
			field434 = 0;
			field195 = true;
			field334 = "";
			field381 = 5;
			field457 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field267[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = QRYQWAHS.field1031 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= QRYQWAHS.field1031) {
							var5 = 0;
						}
					}

					if (!QRYQWAHS.field1032[var5].field1038 && QRYQWAHS.field1032[var5].field1033 == var3 + (field337 ? 0 : 7)) {
						break;
					}
				}

				field267[var3] = var5;
				field562 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field435[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field219[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field219[var6].length) {
					var8 = 0;
				}
			}

			field435[var6] = var8;
			field562 = true;
		}

		if (var2 == 324 && !field337) {
			field337 = true;
			method106();
		}

		if (var2 == 325 && field337) {
			field337 = false;
			method106();
		}

		if (var2 == 326) {
			field165.method206(19);
			field165.method207(field337 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field165.method207(field267[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field165.method207(field435[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field474 = !field474;
		}

		if (var2 >= 601 && var2 <= 613) {
			method127();

			if (field517.length() > 0) {
				field165.method206(255);
				field165.method213(WAQVJSXE.method461(field517));
				field165.method207(var2 - 601);
				field165.method207(field474 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(LEMWAMCXW;II)V")
	public final void method126(EMWAMCXW arg0, int arg1) {
		field544 = 0;
		field308 = 0;
		method97(arg0, arg1);
		method170(arg0, arg1);
		method58(arg1, arg0);
		method51(arg1, arg0);

		for (int var3 = 0; var3 < field544; var3++) {
			int var4 = field545[var3];
			if (field228 != field305[var4].field936) {
				field305[var4] = null;
			}
		}

		if (arg0.field617 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field617 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field306; var5++) {
			if (field305[field307[var5]] == null) {
				signlink.reporterror(field429 + " null entry in pl list - pos:" + var5 + " size:" + field306);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method127() {
		field165.method206(94);

		if (field377 != -1) {
			method75(field377);
			field377 = -1;
			field312 = true;
			field512 = false;
			field122 = true;
		}

		if (field210 != -1) {
			method75(field210);
			field210 = -1;
			field245 = true;
			field512 = false;
		}

		if (field297 != -1) {
			method75(field297);
			field297 = -1;
			field532 = true;
		}

		if (field537 != -1) {
			method75(field537);
			field537 = -1;
		}

		if (field212 != -1) {
			method75(field212);
			field212 = -1;
		}
	}

	@ObfuscatedName("client.b(ILQXTIWHBH;)Z")
	public final boolean method128(QXTIWHBH arg0) {
		if (arg0.field1064 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1064.length; var2++) {
			int var3 = method180(var2, arg0);
			int var4 = arg0.field1089[var2];
			if (arg0.field1064[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1064[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1064[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method129() {
		field157.method477();
		PTUBVHCT.field988 = field370;
		field428.method198(0, 0);

		if (field195) {
			field129.method481(field457, 0, 239, 40);
			field129.method481(field334 + "*", 128, 239, 60);
		} else if (field434 == 1) {
			field129.method481("Enter amount:", 0, 239, 40);
			field129.method481(field340 + "*", 128, 239, 60);
		} else if (field434 == 2) {
			field129.method481("Enter name:", 0, 239, 40);
			field129.method481(field340 + "*", 128, 239, 60);
		} else if (field434 == 3) {
			if (field340 != field190) {
				method71(field340);
				field190 = field340;
			}

			XQKSIEVT var1 = field128;
			ANTOHTCU.method14(463, 0, 77, 0);

			for (int var2 = 0; var2 < field191; var2++) {
				int var3 = var2 * 14 + 18 - field194;
				if (var3 > 0 && var3 < 110) {
					var1.method481(field192[var2], 0, 239, var3);
				}
			}

			ANTOHTCU.method13();

			if (field191 > 5) {
				method152(0, field191 * 14 + 7, field194, 77, 463);
			}

			if (field340.length() == 0) {
				field129.method481("Enter object name", 255, 239, 40);
			} else if (field191 == 0) {
				field129.method481("No matching objects found, please shorten search", 0, 239, 40);
			}

			var1.method481(field340 + "*", 0, 239, 90);
			ANTOHTCU.method20(0, 77, 479, 0);
		} else if (field387 != null) {
			field129.method481(field387, 0, 239, 40);
			field129.method481("Click to continue", 128, 239, 60);
		} else if (field210 != -1) {
			method183(0, QXTIWHBH.method380(field210), 0, 0);
		} else if (field477 == -1) {
			XQKSIEVT var4 = field128;
			int var5 = 0;
			ANTOHTCU.method14(463, 0, 77, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field492[var6] != null) {
					int var7 = field490[var6];
					int var8 = field333 + 70 - var5 * 14;
					String var9 = field491[var6];
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
							var4.method485(field492[var6], 4, 0, var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field378 == 0 || field378 == 1 && method107(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field229[0].method198(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field229[1].method198(var11, var8 - 12);
								var11 += 14;
							}

							var4.method485(var9 + ":", var11, 0, var8);
							var11 += var4.method483(var9) + 8;
							var4.method485(field492[var6], var11, 255, var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field197 == 0 && (var7 == 7 || field143 == 0 || field143 == 1 && method107(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method485("From", var12, 0, var8);
							int var14 = var12 + var4.method483("From ");
							if (var10 == 1) {
								field229[0].method198(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field229[1].method198(var14, var8 - 12);
								var14 += 14;
							}

							var4.method485(var9 + ":", var14, 0, var8);
							var14 += var4.method483(var9) + 8;
							var4.method485(field492[var6], var14, 0x800000, var8);
						}

						var5++;
					}

					if (var7 == 4 && (field273 == 0 || field273 == 1 && method107(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method485(var9 + " " + field492[var6], 4, 0x800080, var8);
						}

						var5++;
					}

					if (var7 == 5 && field197 == 0 && field143 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method485(field492[var6], 4, 0x800000, var8);
						}

						var5++;
					}

					if (var7 == 6 && field197 == 0 && field143 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method485("To " + var9 + ":", 4, 0, var8);
							var4.method485(field492[var6], var4.method483("To " + var9) + 12, 0x800000, var8);
						}

						var5++;
					}

					if (var7 == 8 && (field273 == 0 || field273 == 1 && method107(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method485(var9 + " " + field492[var6], 4, 0x7E3200, var8);
						}

						var5++;
					}
				}
			}

			ANTOHTCU.method13();
			field362 = var5 * 14 + 7;
			if (field362 < 78) {
				field362 = 78;
			}

			method152(0, field362, field362 - field333 - 77, 77, 463);
			String var13;
			if (field554 == null || field554.field1396 == null) {
				var13 = WAQVJSXE.method465(field429);
			} else {
				var13 = field554.field1396;
			}

			var4.method485(var13 + ":", 4, 0, 90);
			var4.method485(field397 + "*", var4.method483(var13 + ": ") + 6, 255, 90);
			ANTOHTCU.method20(0, 77, 479, 0);
		} else {
			method183(0, QXTIWHBH.method380(field477), 0, 0);
		}

		if (field153 && field199 == 2) {
			method63();
		}

		field157.method478(357, 17, field1199);
		field156.method477();
		PTUBVHCT.field988 = field372;
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method130(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field298; var3++) {
				if (field335[var3] == arg0) {
					field298--;
					field312 = true;

					for (int var4 = var3; var4 < field298; var4++) {
						field183[var4] = field183[var4 + 1];
						field251[var4] = field251[var4 + 1];
						field335[var4] = field335[var4 + 1];
					}

					field165.method206(193);
					field165.method213(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method131(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method132(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method133() {
		if (field436 > 1) {
			field436--;
		}

		if (field441 > 0) {
			field441--;
		}

		for (int var1 = 0; var1 < 5 && method112(); var1++) {
		}

		if (field418) {
			synchronized (field431.field872) {
				if (!field331) {
					field431.field870 = 0;
				} else if (field1213 != 0 || field431.field870 >= 40) {
					field165.method206(108);
					field165.method207(0);
					int var3 = field165.field617;
					int var4 = 0;
					for (int var5 = 0; var5 < field431.field870 && var3 - field165.field617 < 240; var5++) {
						var4++;
						int var6 = field431.field875[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field431.field871[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field431.field875[var5] == -1 && field431.field871[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field185 != var7 || field186 != var6) {
							int var9 = var7 - field185;
							field185 = var7;
							int var10 = var6 - field186;
							field186 = var6;

							if (field300 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field165.method208((field300 << 12) + (var9 << 6) + var10);
								field300 = 0;
							} else if (field300 < 8) {
								field165.method210((field300 << 19) + var8 + 0x800000);
								field300 = 0;
							} else {
								field165.method211((field300 << 19) + var8 - 0x40000000);
								field300 = 0;
							}
						} else if (field300 < 2047) {
							field300++;
						}
					}

					field165.method216(field165.field617 - var3);

					if (var4 >= field431.field870) {
						field431.field870 = 0;
					} else {
						field431.field870 -= var4;
						for (int var11 = 0; var11 < field431.field870; var11++) {
							field431.field871[var11] = field431.field871[var4 + var11];
							field431.field875[var11] = field431.field875[var4 + var11];
						}
					}
				}
			}

			if (field1213 != 0) {
				long var12 = (field1216 - field272) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field272 = field1216;
				int var14 = field1215;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1214;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1213 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field165.method206(134);
				field165.method251((var17 << 19) + (var18 << 20) + var16);
			}

			if (field384 > 0) {
				field384--;
			}

			if (field1217[1] == 1 || field1217[2] == 1 || field1217[3] == 1 || field1217[4] == 1) {
				field385 = true;
			}

			if (field385 && field384 <= 0) {
				field384 = 20;
				field385 = false;
				field165.method206(8);
				field165.method242(field354);
				field165.method243(field353);
			}

			if (field1204 && !field294) {
				field294 = true;
				field165.method206(22);
				field165.method207(1);
			}

			if (!field1204 && field294) {
				field294 = false;
				field165.method206(22);
				field165.method207(0);
			}

			method95();
			method142();
			method68();
			field439++;
			if (field439 > 750) {
				method99();
			}

			method72();
			method143();
			method161();
			field215++;
			if (field215 > 114) {
				field215 = 0;
				field165.method206(42);
				field165.method210(0x925E89);
			}

			field320++;

			if (field536 != 0) {
				field535 += 20;
				if (field535 >= 400) {
					field536 = 0;
				}
			}

			if (field447 != 0) {
				field444++;
				if (field444 >= 15) {
					if (field447 == 2) {
						field312 = true;
					}

					if (field447 == 3) {
						field245 = true;
					}

					field447 = 0;
				}
			}

			if (field347 != 0) {
				field182++;

				if (field1207 > field348 + 5 || field1207 < field348 - 5 || field1208 > field349 + 5 || field1208 < field349 - 5) {
					field443 = true;
				}

				if (field1206 == 0) {
					if (field347 == 2) {
						field312 = true;
					}

					if (field347 == 3) {
						field245 = true;
					}

					field347 = 0;

					if (field443 && field182 >= 5) {
						field410 = -1;
						method120();

						if (field410 == field345 && field409 != field346) {
							QXTIWHBH var19 = QXTIWHBH.method380(field345);
							byte var20 = 0;
							if (field287 == 1 && var19.field1093 == 206) {
								var20 = 1;
							}

							if (var19.field1111[field409] <= 0) {
								var20 = 0;
							}

							if (var19.field1079) {
								int var21 = field346;
								int var22 = field409;
								var19.field1111[var22] = var19.field1111[var21];
								var19.field1041[var22] = var19.field1041[var21];
								var19.field1111[var21] = -1;
								var19.field1041[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field346;
								int var24 = field409;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method387(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method387(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method387(field409, field346);
							}

							field165.method206(168);
							field165.method208(field409);
							field165.method235(var20);
							field165.method243(field346);
							field165.method244(field345);
						}
					} else if ((field455 == 1 || method94(field375 - 1)) && field375 > 2) {
						method40();
					} else if (field375 > 0) {
						method77(field375 - 1);
					}

					field444 = 10;
					field1213 = 0;
				}
			}

			if (ZPFBNGWW.field1470 != -1) {
				int var25 = ZPFBNGWW.field1470;
				int var26 = ZPFBNGWW.field1471;
				boolean var27 = method110(true, 0, 0, 0, 0, 0, field554.field914[0], 0, field554.field913[0], var25, var26);
				ZPFBNGWW.field1470 = -1;

				if (var27) {
					field533 = field1214;
					field534 = field1215;
					field536 = 1;
					field535 = 0;
				}
			}

			if (field1213 == 1 && field387 != null) {
				field387 = null;
				field245 = true;
				field1213 = 0;
			}

			method85();

			if (field297 == -1) {
				method62();
				method124();
				method104();
			}

			if (field1206 == 1 || field1213 == 1) {
				field432++;
			}

			if (field291 == 0 && field161 == 0 && field412 == 0) {
				if (field553 > 0) {
					field553--;
				}
			} else if (field553 < 100) {
				field553++;
				if (field553 == 100) {
					if (field291 != 0) {
						field245 = true;
					}

					if (field161 != 0) {
						field312 = true;
					}
				}
			}

			if (field367 == 2) {
				method165();
			}

			if (field367 == 2 && field302) {
				method154();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field519[var28]++;
			}

			method178();
			field1205++;
			if (field1205 > 4500) {
				field441 = 250;
				field1205 -= 500;
				field165.method206(69);
			}

			field290++;
			if (field290 > 500) {
				field290 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field325 += field326;
				}

				if ((var29 & 0x2) == 2) {
					field524 += field525;
				}

				if ((var29 & 0x4) == 4) {
					field162 += field163;
				}
			}

			if (field325 < -50) {
				field326 = 2;
			}

			if (field325 > 50) {
				field326 = -2;
			}

			if (field524 < -55) {
				field525 = 2;
			}

			if (field524 > 55) {
				field525 = -2;
			}

			if (field162 < -40) {
				field163 = 1;
			}

			if (field162 > 40) {
				field163 = -1;
			}

			field531++;
			if (field531 > 500) {
				field531 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field257 += field258;
				}

				if ((var30 & 0x2) == 2) {
					field246 += field247;
				}
			}

			if (field257 < -60) {
				field258 = 2;
			}

			if (field257 > 60) {
				field258 = -2;
			}

			if (field246 < -20) {
				field247 = 1;
			}

			if (field246 > 10) {
				field247 = -1;
			}

			field440++;
			if (field440 > 50) {
				field165.method206(133);
			}

			try {
				if (field453 != null && field165.field617 > 0) {
					field453.method191(field165.field616, 0, field165.field617);
					field165.field617 = 0;
					field440 = 0;
				}
			} catch (IOException var32) {
				method99();
			} catch (Exception var33) {
				method159();
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method134() {
		if (field375 >= 2 || field173 != 0 || field149 != 0) {
			String var1;
			if (field173 == 1 && field375 < 2) {
				var1 = "Use " + field177 + " with...";
			} else if (field149 == 1 && field375 < 2) {
				var1 = field152 + "...";
			} else {
				var1 = field296[field375 - 1];
			}

			if (field375 > 2) {
				var1 = var1 + "@whi@ / " + (field375 - 2) + " more options";
			}

			field129.method490(true, 4, 15, var1, field228 / 1000, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.A(I)I")
	public final int method135() {
		int var1 = 3;
		if (field529 < 310) {
			int var2 = field526 >> 7;
			int var3 = field528 >> 7;
			int var4 = field554.field937 >> 7;
			int var5 = field554.field938 >> 7;

			if ((field168[field540][var2][var3] & 0x4) != 0) {
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

					if ((field168[field540][var2][var3] & 0x4) != 0) {
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

						if ((field168[field540][var2][var3] & 0x4) != 0) {
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

					if ((field168[field540][var2][var3] & 0x4) != 0) {
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

						if ((field168[field540][var2][var3] & 0x4) != 0) {
							var1 = field540;
						}
					}
				}
			}
		}

		if ((field168[field540][field554.field937 >> 7][field554.field938 >> 7] & 0x4) != 0) {
			var1 = field540;
		}

		return var1;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method136() {
		int var1 = method114(field540, field526, field528);
		if (var1 - field527 < 800 && (field168[field540][field526 >> 7][field528 >> 7] & 0x4) != 0) {
			return field540;
		}

		return 3;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method137() {
		if (field197 != 0) {
			XQKSIEVT var1 = field128;
			int var2 = 0;
			if (field436 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field492[var3] != null) {
					int var4 = field490[var3];
					String var5 = field491[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field143 == 0 || field143 == 1 && method107(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method485("From", var8, 0, var7);
						var1.method485("From", var8, 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method483("From ");
						if (var6 == 1) {
							field229[0].method198(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field229[1].method198(var11, var7 - 12);
							var11 += 14;
						}

						var1.method485(var5 + ": " + field492[var3], var11, 0, var7);
						var1.method485(var5 + ": " + field492[var3], var11, 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field143 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method485(field492[var3], 4, 0, var9);
						var1.method485(field492[var3], 4, 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field143 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method485("To " + var5 + ": " + field492[var3], 4, 0, var10);
						var1.method485("To " + var5 + ": " + field492[var3], 4, 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method138() {
		for (JNEOOHMF var1 = (JNEOOHMF) field216.method470(); var1 != null; var1 = (JNEOOHMF) field216.method472()) {
			if (var1.field780 == -1) {
				var1.field787 = 0;
				method80(var1);
			} else {
				var1.method338();
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method139() {
		if (field197 != 0) {
			int var1 = 0;
			if (field436 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field492[var2] != null) {
					int var3 = field490[var2];
					String var4 = field491[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field143 == 0 || field143 == 1 && method107(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1207 > 4 && field1208 - 4 > var8 - 10 && field1208 - 4 <= var8 + 3) {
							int var9 = field128.method483("From:  " + var4 + field492[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1207 < var9 + 4) {
								if (field379 >= 1) {
									field296[field375] = "Report abuse @whi@" + var4;
									field467[field375] = 2265;
									field375++;
								}

								field296[field375] = "Add ignore @whi@" + var4;
								field467[field375] = 2723;
								field375++;
								field296[field375] = "Add friend @whi@" + var4;
								field467[field375] = 2066;
								field375++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field143 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILTFHGRYAS;)V")
	public final void method140(int arg0, int arg1, TFHGRYAS arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field354 + field257 & 0x7FF;
			int var6 = IEHKDFMR.field725[var5];
			int var7 = IEHKDFMR.field726[var5];
			var6 = var6 * 256 / (field246 + 256);
			var7 = var7 * 256 / (field246 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field358.method429(15, 15, 20, 256, var12 + 94 + 4 - 10, 20, var10, 83 - var13 - 20);
		} else {
			method102(arg0, arg1, arg2);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1202 != null) {
				return new URL("http://127.0.0.1:" + (field239 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	public final void run() {
		if (field478) {
			method162();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public static final void method141() {
		ZPFBNGWW.field1436 = false;
		PTUBVHCT.field977 = false;
		field241 = false;
		SSYGWTYM.field1141 = false;
		AMVKCKZF.field42 = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method142() {
		if (field367 == 2) {
			for (JNEOOHMF var1 = (JNEOOHMF) field216.method470(); var1 != null; var1 = (JNEOOHMF) field216.method472()) {
				if (var1.field780 > 0) {
					var1.field780--;
				}

				if (var1.field780 != 0) {
					if (var1.field787 > 0) {
						var1.field787--;
					}

					if (var1.field787 == 0 && var1.field778 >= 1 && var1.field779 >= 1 && var1.field778 <= 102 && var1.field779 <= 102 && (var1.field784 < 0 || SSYGWTYM.method413(var1.field784, var1.field786))) {
						method155(var1.field778, var1.field776, var1.field784, var1.field786, var1.field777, var1.field779, var1.field785);
						var1.field787 = -1;

						if (var1.field784 == var1.field781 && var1.field781 == -1) {
							var1.method338();
						} else if (var1.field784 == var1.field781 && var1.field785 == var1.field782 && var1.field786 == var1.field783) {
							var1.method338();
						}
					}
				} else if (var1.field781 < 0 || SSYGWTYM.method413(var1.field781, var1.field783)) {
					method155(var1.field778, var1.field776, var1.field781, var1.field783, var1.field777, var1.field779, var1.field782);
					var1.method338();
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method143() {
		for (int var1 = 0; var1 < field171; var1++) {
			int var2 = field172[var1];
			RLTBSHTA var3 = field170[var2];
			if (var3 != null) {
				method144(var3, var3.field1112.field1429);
			}
		}
	}

	@ObfuscatedName("client.a(LOKXNBSEJ;BI)V")
	public final void method144(OKXNBSEJ arg0, int arg1) {
		if (arg0.field937 < 128 || arg0.field938 < 128 || arg0.field937 >= 13184 || arg0.field938 >= 13184) {
			arg0.field942 = -1;
			arg0.field921 = -1;
			arg0.field962 = 0;
			arg0.field963 = 0;
			arg0.field937 = arg0.field913[0] * 128 + arg0.field948 * 64;
			arg0.field938 = arg0.field914[0] * 128 + arg0.field948 * 64;
			arg0.method341();
		}

		if (field554 == arg0 && (arg0.field937 < 1536 || arg0.field938 < 1536 || arg0.field937 >= 11776 || arg0.field938 >= 11776)) {
			arg0.field942 = -1;
			arg0.field921 = -1;
			arg0.field962 = 0;
			arg0.field963 = 0;
			arg0.field937 = arg0.field913[0] * 128 + arg0.field948 * 64;
			arg0.field938 = arg0.field914[0] * 128 + arg0.field948 * 64;
			arg0.method341();
		}

		if (arg0.field962 > field228) {
			method145(arg0);
		} else if (arg0.field963 >= field228) {
			method146(arg0);
		} else {
			method147(arg0);
		}

		method148(arg0);
		method149(arg0);
	}

	@ObfuscatedName("client.a(BLOKXNBSEJ;)V")
	public final void method145(OKXNBSEJ arg0) {
		int var2 = arg0.field962 - field228;
		int var3 = arg0.field958 * 128 + arg0.field948 * 64;
		int var4 = arg0.field960 * 128 + arg0.field948 * 64;
		arg0.field937 += (var3 - arg0.field937) / var2;
		arg0.field938 += (var4 - arg0.field938) / var2;
		arg0.field934 = 0;

		if (arg0.field964 == 0) {
			arg0.field933 = 1024;
		}

		if (arg0.field964 == 1) {
			arg0.field933 = 1536;
		}

		if (arg0.field964 == 2) {
			arg0.field933 = 0;
		}

		if (arg0.field964 == 3) {
			arg0.field933 = 512;
		}
	}

	@ObfuscatedName("client.a(LOKXNBSEJ;I)V")
	public final void method146(OKXNBSEJ arg0) {
		if (field228 == arg0.field963 || arg0.field942 == -1 || arg0.field945 != 0 || arg0.field944 + 1 > VYXELYSX.field1273[arg0.field942].method459(arg0.field943)) {
			int var2 = arg0.field963 - arg0.field962;
			int var3 = field228 - arg0.field962;
			int var4 = arg0.field958 * 128 + arg0.field948 * 64;
			int var5 = arg0.field960 * 128 + arg0.field948 * 64;
			int var6 = arg0.field959 * 128 + arg0.field948 * 64;
			int var7 = arg0.field961 * 128 + arg0.field948 * 64;
			arg0.field937 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field938 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field934 = 0;

		if (arg0.field964 == 0) {
			arg0.field933 = 1024;
		}

		if (arg0.field964 == 1) {
			arg0.field933 = 1536;
		}

		if (arg0.field964 == 2) {
			arg0.field933 = 0;
		}

		if (arg0.field964 == 3) {
			arg0.field933 = 512;
		}

		arg0.field939 = arg0.field933;
	}

	@ObfuscatedName("client.a(LOKXNBSEJ;B)V")
	public final void method147(OKXNBSEJ arg0) {
		arg0.field955 = arg0.field919;
		if (arg0.field947 == 0) {
			arg0.field934 = 0;
		} else {
			if (arg0.field942 != -1 && arg0.field945 == 0) {
				VYXELYSX var2 = VYXELYSX.field1273[arg0.field942];
				if (arg0.field929 > 0 && var2.field1285 == 0) {
					arg0.field934++;
					return;
				}

				if (arg0.field929 <= 0 && var2.field1286 == 0) {
					arg0.field934++;
					return;
				}
			}

			int var3 = arg0.field937;
			int var4 = arg0.field938;
			int var5 = arg0.field913[arg0.field947 - 1] * 128 + arg0.field948 * 64;
			int var6 = arg0.field914[arg0.field947 - 1] * 128 + arg0.field948 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field933 = 1280;
					} else if (var4 > var6) {
						arg0.field933 = 1792;
					} else {
						arg0.field933 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field933 = 768;
					} else if (var4 > var6) {
						arg0.field933 = 256;
					} else {
						arg0.field933 = 512;
					}
				} else if (var4 < var6) {
					arg0.field933 = 1024;
				} else {
					arg0.field933 = 0;
				}

				int var7 = arg0.field933 - arg0.field939 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field916;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field915;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field918;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field917;
				}

				if (var8 == -1) {
					var8 = arg0.field915;
				}

				arg0.field955 = var8;
				int var9 = 4;
				if (arg0.field939 != arg0.field933 && arg0.field941 == -1 && arg0.field931 != 0) {
					var9 = 2;
				}

				if (arg0.field947 > 2) {
					var9 = 6;
				}

				if (arg0.field947 > 3) {
					var9 = 8;
				}

				if (arg0.field934 > 0 && arg0.field947 > 1) {
					var9 = 8;
					arg0.field934--;
				}

				if (arg0.field930[arg0.field947 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field955 == arg0.field915 && arg0.field935 != -1) {
					arg0.field955 = arg0.field935;
				}

				if (var3 < var5) {
					arg0.field937 += var9;
					if (arg0.field937 > var5) {
						arg0.field937 = var5;
					}
				} else if (var3 > var5) {
					arg0.field937 -= var9;
					if (arg0.field937 < var5) {
						arg0.field937 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field938 += var9;
					if (arg0.field938 > var6) {
						arg0.field938 = var6;
					}
				} else if (var4 > var6) {
					arg0.field938 -= var9;
					if (arg0.field938 < var6) {
						arg0.field938 = var6;
					}
				}

				if (arg0.field937 == var5 && arg0.field938 == var6) {
					arg0.field947--;

					if (arg0.field929 > 0) {
						arg0.field929--;
						return;
					}
				}
			} else {
				arg0.field937 = var5;
				arg0.field938 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LOKXNBSEJ;Z)V")
	public final void method148(OKXNBSEJ arg0) {
		if (arg0.field931 != 0) {
			if (arg0.field941 != -1 && arg0.field941 < 32768) {
				RLTBSHTA var2 = field170[arg0.field941];
				if (var2 != null) {
					int var3 = arg0.field937 - var2.field937;
					int var4 = arg0.field938 - var2.field938;
					if (var3 != 0 || var4 != 0) {
						arg0.field933 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field941 >= 32768) {
				int var5 = arg0.field941 - 32768;
				if (field198 == var5) {
					var5 = field304;
				}

				ZATRZGAA var6 = field305[var5];
				if (var6 != null) {
					int var7 = arg0.field937 - var6.field937;
					int var8 = arg0.field938 - var6.field938;
					if (var7 != 0 || var8 != 0) {
						arg0.field933 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field965 != 0 || arg0.field966 != 0) && (arg0.field947 == 0 || arg0.field934 > 0)) {
				int var9 = arg0.field937 - (arg0.field965 - field327 - field327) * 64;
				int var10 = arg0.field938 - (arg0.field966 - field328 - field328) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field933 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field965 = 0;
				arg0.field966 = 0;
			}

			int var11 = arg0.field933 - arg0.field939 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field931 || var11 > 2048 - arg0.field931) {
					arg0.field939 = arg0.field933;
				} else if (var11 > 1024) {
					arg0.field939 -= arg0.field931;
				} else {
					arg0.field939 += arg0.field931;
				}

				arg0.field939 &= 0x7FF;
				if (arg0.field955 == arg0.field919 && arg0.field939 != arg0.field933) {
					if (arg0.field920 != -1) {
						arg0.field955 = arg0.field920;
						return;
					}

					arg0.field955 = arg0.field915;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILOKXNBSEJ;)V")
	public final void method149(OKXNBSEJ arg0) {
		arg0.field949 = false;

		if (arg0.field955 != -1) {
			VYXELYSX var2 = VYXELYSX.field1273[arg0.field955];
			arg0.field957++;
			if (arg0.field956 < var2.field1274 && arg0.field957 > var2.method459(arg0.field956)) {
				arg0.field957 = 0;
				arg0.field956++;
			}

			if (arg0.field956 >= var2.field1274) {
				arg0.field957 = 0;
				arg0.field956 = 0;
			}
		}

		if (arg0.field921 != -1 && field228 >= arg0.field924) {
			if (arg0.field922 < 0) {
				arg0.field922 = 0;
			}

			VYXELYSX var3 = SDNQJNMP.field1127[arg0.field921].field1131;
			arg0.field923++;
			while (arg0.field922 < var3.field1274 && arg0.field923 > var3.method459(arg0.field922)) {
				arg0.field923 -= var3.method459(arg0.field922);
				arg0.field922++;
			}

			if (arg0.field922 >= var3.field1274 && (arg0.field922 < 0 || arg0.field922 >= var3.field1274)) {
				arg0.field921 = -1;
			}
		}

		if (arg0.field942 != -1 && arg0.field945 <= 1) {
			VYXELYSX var4 = VYXELYSX.field1273[arg0.field942];
			if (var4.field1285 == 1 && arg0.field929 > 0 && arg0.field962 <= field228 && arg0.field963 < field228) {
				arg0.field945 = 1;
				return;
			}
		}

		if (arg0.field942 != -1 && arg0.field945 == 0) {
			VYXELYSX var5 = VYXELYSX.field1273[arg0.field942];
			arg0.field944++;
			while (arg0.field943 < var5.field1274 && arg0.field944 > var5.method459(arg0.field943)) {
				arg0.field944 -= var5.method459(arg0.field943);
				arg0.field943++;
			}

			if (arg0.field943 >= var5.field1274) {
				arg0.field943 -= var5.field1278;
				arg0.field946++;
				if (arg0.field946 >= var5.field1284) {
					arg0.field942 = -1;
				}

				if (arg0.field943 < 0 || arg0.field943 >= var5.field1274) {
					arg0.field942 = -1;
				}
			}

			arg0.field949 = var5.field1280;
		}

		if (arg0.field945 > 0) {
			arg0.field945--;
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method150() {
		if (field297 == -1 || field367 != 2 && field1200 == null) {
			if (field532) {
				method89();
				field532 = false;
				field133.method478(4, 0, field1199);
				field134.method478(357, 0, field1199);
				field135.method478(4, 722, field1199);
				field136.method478(205, 743, field1199);
				field137.method478(0, 0, field1199);
				field138.method478(4, 516, field1199);
				field139.method478(205, 516, field1199);
				field140.method478(357, 496, field1199);
				field141.method478(338, 0, field1199);
				field312 = true;
				field245 = true;
				field122 = true;
				field160 = true;

				if (field367 != 2) {
					field156.method478(4, 4, field1199);
					field155.method478(4, 550, field1199);
				}
			}

			if (field367 == 2) {
				method43();
			}

			if (field153 && field199 == 1) {
				field312 = true;
			}

			if (field377 != -1) {
				boolean var3 = method171(field377, field320);
				if (var3) {
					field312 = true;
				}
			}

			if (field447 == 2) {
				field312 = true;
			}

			if (field347 == 2) {
				field312 = true;
			}

			if (field312) {
				method47();
				field312 = false;
			}

			if (field210 == -1 && field434 == 0) {
				field145.field1055 = field362 - field333 - 77;

				if (field1207 > 448 && field1207 < 560 && field1208 > 332) {
					method50(field1208 - 357, field362, field145, field1207 - 17, 0, 463, 77, -1);
				}

				int var4 = field362 - field145.field1055 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field362 - 77) {
					var4 = field362 - 77;
				}

				if (field333 != var4) {
					field333 = var4;
					field245 = true;
				}
			}

			if (field210 == -1 && field434 == 3) {
				int var5 = field191 * 14 + 7;
				field145.field1055 = field194;

				if (field1207 > 448 && field1207 < 560 && field1208 > 332) {
					method50(field1208 - 357, var5, field145, field1207 - 17, 0, 463, 77, -1);
				}

				int var6 = field145.field1055;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field194 != var6) {
					field194 = var6;
					field245 = true;
				}
			}

			if (field210 != -1) {
				boolean var7 = method171(field210, field320);
				if (var7) {
					field245 = true;
				}
			}

			if (field447 == 3) {
				field245 = true;
			}

			if (field347 == 3) {
				field245 = true;
			}

			if (field387 != null) {
				field245 = true;
			}

			if (field153 && field199 == 2) {
				field245 = true;
			}

			if (field245) {
				method129();
				field245 = false;
			}

			if (field367 == 2) {
				method167();
				field155.method478(4, 550, field1199);
			}

			if (field249 != -1) {
				field122 = true;
			}

			if (field122) {
				if (field249 != -1 && field249 == field147) {
					field249 = -1;
					field165.method206(252);
					field165.method207(field147);
				}

				field122 = false;
				field481.method477();
				field126.method198(0, 0);

				if (field377 == -1) {
					if (field196[field147] != -1) {
						if (field147 == 0) {
							field261.method198(22, 10);
						}

						if (field147 == 1) {
							field262.method198(54, 8);
						}

						if (field147 == 2) {
							field262.method198(82, 8);
						}

						if (field147 == 3) {
							field263.method198(110, 8);
						}

						if (field147 == 4) {
							field265.method198(153, 8);
						}

						if (field147 == 5) {
							field265.method198(181, 8);
						}

						if (field147 == 6) {
							field264.method198(209, 9);
						}
					}

					if (field196[0] != -1 && (field249 != 0 || field228 % 20 < 10)) {
						field425[0].method198(29, 13);
					}

					if (field196[1] != -1 && (field249 != 1 || field228 % 20 < 10)) {
						field425[1].method198(53, 11);
					}

					if (field196[2] != -1 && (field249 != 2 || field228 % 20 < 10)) {
						field425[2].method198(82, 11);
					}

					if (field196[3] != -1 && (field249 != 3 || field228 % 20 < 10)) {
						field425[3].method198(115, 12);
					}

					if (field196[4] != -1 && (field249 != 4 || field228 % 20 < 10)) {
						field425[4].method198(153, 13);
					}

					if (field196[5] != -1 && (field249 != 5 || field228 % 20 < 10)) {
						field425[5].method198(180, 11);
					}

					if (field196[6] != -1 && (field249 != 6 || field228 % 20 < 10)) {
						field425[6].method198(208, 13);
					}
				}

				field481.method478(160, 516, field1199);
				field480.method477();
				field125.method198(0, 0);

				if (field377 == -1) {
					if (field196[field147] != -1) {
						if (field147 == 7) {
							field458.method198(42, 0);
						}

						if (field147 == 8) {
							field459.method198(74, 0);
						}

						if (field147 == 9) {
							field459.method198(102, 0);
						}

						if (field147 == 10) {
							field460.method198(130, 1);
						}

						if (field147 == 11) {
							field462.method198(173, 0);
						}

						if (field147 == 12) {
							field462.method198(201, 0);
						}

						if (field147 == 13) {
							field461.method198(229, 0);
						}
					}

					if (field196[8] != -1 && (field249 != 8 || field228 % 20 < 10)) {
						field425[7].method198(74, 2);
					}

					if (field196[9] != -1 && (field249 != 9 || field228 % 20 < 10)) {
						field425[8].method198(102, 3);
					}

					if (field196[10] != -1 && (field249 != 10 || field228 % 20 < 10)) {
						field425[9].method198(137, 4);
					}

					if (field196[11] != -1 && (field249 != 11 || field228 % 20 < 10)) {
						field425[10].method198(174, 2);
					}

					if (field196[12] != -1 && (field249 != 12 || field228 % 20 < 10)) {
						field425[11].method198(201, 2);
					}

					if (field196[13] != -1 && (field249 != 13 || field228 % 20 < 10)) {
						field425[12].method198(226, 2);
					}
				}

				field480.method478(466, 496, field1199);
				field156.method477();
				PTUBVHCT.field988 = field372;
			}

			if (field160) {
				field160 = false;
				field479.method477();
				field124.method198(0, 0);
				field128.method482("Public chat", 0xFFFFFF, true, 55, 28);

				if (field378 == 0) {
					field128.method482("On", 0xFF00, true, 55, 41);
				}

				if (field378 == 1) {
					field128.method482("Friends", 0xFFFF00, true, 55, 41);
				}

				if (field378 == 2) {
					field128.method482("Off", 0xFF0000, true, 55, 41);
				}

				if (field378 == 3) {
					field128.method482("Hide", 0xFFFF, true, 55, 41);
				}

				field128.method482("Private chat", 0xFFFFFF, true, 184, 28);

				if (field143 == 0) {
					field128.method482("On", 0xFF00, true, 184, 41);
				}

				if (field143 == 1) {
					field128.method482("Friends", 0xFFFF00, true, 184, 41);
				}

				if (field143 == 2) {
					field128.method482("Off", 0xFF0000, true, 184, 41);
				}

				field128.method482("Trade/compete", 0xFFFFFF, true, 324, 28);

				if (field273 == 0) {
					field128.method482("On", 0xFF00, true, 324, 41);
				}

				if (field273 == 1) {
					field128.method482("Friends", 0xFFFF00, true, 324, 41);
				}

				if (field273 == 2) {
					field128.method482("Off", 0xFF0000, true, 324, 41);
				}

				field128.method482("Report abuse", 0xFFFFFF, true, 458, 33);
				field479.method478(453, 0, field1199);
				field156.method477();
				PTUBVHCT.field988 = field372;
			}

			field320 = 0;
		} else {
			if (field367 == 2) {
				method171(field297, field320);

				if (field537 != -1) {
					method171(field537, field320);
				}

				field320 = 0;
				method78();
				field1200.method477();
				PTUBVHCT.field988 = field373;
				ANTOHTCU.method15();
				field532 = true;
				QXTIWHBH var1 = QXTIWHBH.method380(field297);
				if (var1.field1106 == 512 && var1.field1065 == 334 && var1.field1077 == 0) {
					var1.field1106 = 765;
					var1.field1065 = 503;
				}

				method183(0, var1, 0, 0);

				if (field537 != -1) {
					QXTIWHBH var2 = QXTIWHBH.method380(field537);
					if (var2.field1106 == 512 && var2.field1065 == 334 && var2.field1077 == 0) {
						var2.field1106 = 765;
						var2.field1065 = 503;
					}

					method183(0, var2, 0, 0);
				}

				if (field153) {
					method63();
				} else {
					method120();
					method134();
				}
			}

			field1200.method478(0, 0, field1199);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method151() {
		try {
			field242 = -1;
			field549.method474();
			field120.method474();
			field324++;
			if (field324 > 149) {
				field324 = 0;
				field165.method206(98);
				field165.method210(0xE3B450);
			}

			PTUBVHCT.method352();
			method45();
			field178.method516();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field423[var1].method28();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field168[var2][var3][var4] = 0;
					}
				}
			}

			SSYGWTYM var5 = new SSYGWTYM(field206, 104, 104, field168);
			int var6 = field123.length;
			field165.method206(133);

			if (!field464) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field253[var7] >> 8) * 64 - field327;
					int var9 = (field253[var7] & 0xFF) * 64 - field328;
					byte[] var10 = field123[var7];
					if (var10 != null) {
						var5.method404(field423, var9, (field270 - 6) * 8, var8, (field271 - 6) * 8, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field253[var11] >> 8) * 64 - field327;
					int var13 = (field253[var11] & 0xFF) * 64 - field328;
					byte[] var14 = field123[var11];
					if (var14 == null && field271 < 800) {
						var5.method398(var13, 64, 64, var12);
					}
				}

				field165.method206(133);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field442[var15];
					if (var16 != null) {
						int var17 = (field253[var15] >> 8) * 64 - field327;
						int var18 = (field253[var15] & 0xFF) * 64 - field328;
						var5.method407(var17, var18, field423, var16, field178);
					}
				}
			}

			if (field464) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field351[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field253.length; var29++) {
									if (field253[var29] == var28 && field123[var29] != null) {
										var5.method415((var26 & 0x7) * 8, (var27 & 0x7) * 8, var20 * 8, var24, field123[var29], var19, var25, var21 * 8, field423);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method401(var19, var21 * 8, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field351[0][var30][var31];
						if (var32 == -1) {
							var5.method398(var31 * 8, 8, 8, var30 * 8);
						}
					}
				}

				field165.method206(133);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field351[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field253.length; var42++) {
									if (field253[var42] == var41 && field442[var42] != null) {
										var5.method409(var38, (var39 & 0x7) * 8, field423, var35 * 8, field442[var42], field178, (var40 & 0x7) * 8, var34 * 8, var33, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field165.method206(133);
			var5.method408(field423, field178);

			if (field156 != null) {
				field156.method477();
				PTUBVHCT.field988 = field372;
			}

			field165.method206(133);
			int var43 = SSYGWTYM.field1161;
			if (var43 > field540) {
				var43 = field540;
			}

			if (var43 < field540 - 1) {
				int var44 = field540 - 1;
			}

			if (field241) {
				field178.method517(SSYGWTYM.field1161);
			} else {
				field178.method517(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method111(var45, var46);
				}
			}

			method138();
		} catch (Exception var59) {
		}

		AMVKCKZF.field23.method27();

		if (field1202 != null) {
			field165.method206(213);
			field165.method211(1057001181);
		}

		if (field241 && signlink.cache_dat != null) {
			int var48 = field332.method315(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field332.method322(var49);
				if ((var50 & 0x79) == 0) {
					IEHKDFMR.method266(var49);
				}
			}
		}

		System.gc();
		PTUBVHCT.method353(20);
		field332.method316();
		int var51 = (field270 - 6) / 8 - 1;
		int var52 = (field270 + 6) / 8 + 1;
		int var53 = (field271 - 6) / 8 - 1;
		int var54 = (field271 + 6) / 8 + 1;
		if (field364) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field332.method308(var55, 0, var56);
					if (var57 != -1) {
						field332.method319(3, var57);
					}

					int var58 = field332.method308(var55, 1, var56);
					if (var58 != -1) {
						field332.method319(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field180.method198(arg4, arg0);
		field181.method198(arg4, arg0 + arg3 - 16);
		ANTOHTCU.method17(arg4, arg0 + 16, field454, 16, arg3 - 32);
		int var6 = (arg3 - 32) * arg3 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg2 / (arg1 - arg3);
		ANTOHTCU.method17(arg4, arg0 + var7 + 16, field301, 16, var6);
		ANTOHTCU.method22(field363, var6, arg4, arg0 + var7 + 16);
		ANTOHTCU.method22(field363, var6, arg4 + 1, arg0 + 16 + var7);
		ANTOHTCU.method20(arg4, arg0 + var7 + 16, 16, field363);
		ANTOHTCU.method20(arg4, arg0 + var7 + 17, 16, field363);
		ANTOHTCU.method22(field321, var6, arg4 + 15, arg0 + 16 + var7);
		ANTOHTCU.method22(field321, var6 - 1, arg4 + 14, arg0 + var7 + 17);
		ANTOHTCU.method20(arg4, arg0 + var7 + var6 + 15, 16, field321);
		ANTOHTCU.method20(arg4 + 1, arg0 + 14 + var7 + var6, 15, field321);
	}

	@ObfuscatedName("client.F(I)V")
	public final void method153() {
		byte[] var1 = field451.method332("title.dat", null);
		TFHGRYAS var2 = new TFHGRYAS(var1, this);
		field496.method477();
		var2.method422(0, 0);
		field497.method477();
		var2.method422(-637, 0);
		field493.method477();
		var2.method422(-128, 0);
		field494.method477();
		var2.method422(-202, -371);
		field495.method477();
		var2.method422(-202, -171);
		field498.method477();
		var2.method422(0, -265);
		field499.method477();
		var2.method422(-562, -265);
		field500.method477();
		var2.method422(-128, -171);
		field501.method477();
		var2.method422(-562, -171);
		int[] var3 = new int[var2.field1184];
		for (int var4 = 0; var4 < var2.field1185; var4++) {
			for (int var5 = 0; var5 < var2.field1184; var5++) {
				var3[var5] = var2.field1183[var2.field1184 * var4 + var2.field1184 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1184; var6++) {
				var2.field1183[var2.field1184 * var4 + var6] = var3[var6];
			}
		}

		field496.method477();
		var2.method422(382, 0);
		field497.method477();
		var2.method422(-255, 0);
		field493.method477();
		var2.method422(254, 0);
		field494.method477();
		var2.method422(180, -371);
		field495.method477();
		var2.method422(180, -171);
		field498.method477();
		var2.method422(382, -265);
		field499.method477();
		var2.method422(-180, -265);
		field500.method477();
		var2.method422(254, -171);
		field501.method477();
		var2.method422(-180, -171);
		TFHGRYAS var7 = new TFHGRYAS(field451, "logo", 0);
		field493.method477();
		var7.method424(382 - var7.field1184 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.l(B)V")
	public final void method154() {
		int var1 = field482 * 128 + 64;
		int var2 = field483 * 128 + 64;
		int var3 = method114(field540, var1, var2) - field484;

		if (field526 < var1) {
			field526 += (var1 - field526) * field486 / 1000 + field485;
			if (field526 > var1) {
				field526 = var1;
			}
		}

		if (field526 > var1) {
			field526 -= (field526 - var1) * field486 / 1000 + field485;
			if (field526 < var1) {
				field526 = var1;
			}
		}

		if (field527 < var3) {
			field527 += (var3 - field527) * field486 / 1000 + field485;
			if (field527 > var3) {
				field527 = var3;
			}
		}

		if (field527 > var3) {
			field527 -= (field527 - var3) * field486 / 1000 + field485;
			if (field527 < var3) {
				field527 = var3;
			}
		}

		if (field528 < var2) {
			field528 += (var2 - field528) * field486 / 1000 + field485;
			if (field528 > var2) {
				field528 = var2;
			}
		}

		if (field528 > var2) {
			field528 -= (field528 - var2) * field486 / 1000 + field485;
			if (field528 < var2) {
				field528 = var2;
			}
		}

		int var4 = field399 * 128 + 64;
		int var5 = field400 * 128 + 64;
		int var6 = method114(field540, var4, var5) - field401;
		int var7 = var4 - field526;
		int var8 = var6 - field527;
		int var9 = var5 - field528;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field529 < var11) {
			field529 += (var11 - field529) * field403 / 1000 + field402;
			if (field529 > var11) {
				field529 = var11;
			}
		}

		if (field529 > var11) {
			field529 -= (field529 - var11) * field403 / 1000 + field402;
			if (field529 < var11) {
				field529 = var11;
			}
		}

		int var13 = var12 - field530;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field530 += field403 * var13 / 1000 + field402;
			field530 &= 0x7FF;
		}

		if (var13 < 0) {
			field530 -= -var13 * field403 / 1000 + field402;
			field530 &= 0x7FF;
		}

		int var14 = var12 - field530;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field530 = var12;
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
			if (field241 && field540 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field178.method542(arg1, arg0, arg5);
			}

			if (arg4 == 1) {
				var8 = field178.method543(arg1, arg0, arg5);
			}

			if (arg4 == 2) {
				var8 = field178.method544(arg1, arg0, arg5);
			}

			if (arg4 == 3) {
				var8 = field178.method545(arg1, arg0, arg5);
			}

			if (var8 != 0) {
				int var12 = field178.method546(arg1, arg0, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field178.method533(arg1, arg0, arg5);
					AMVKCKZF var16 = AMVKCKZF.method4(var13);
					if (var16.field24) {
						field423[arg1].method33(arg0, var16.field22, arg5, var14, var15);
					}
				}

				if (arg4 == 1) {
					field178.method534(arg1, arg0, arg5);
				}

				if (arg4 == 2) {
					field178.method535(arg1, arg0, arg5);
					AMVKCKZF var17 = AMVKCKZF.method4(var13);
					if (var17.field21 + arg0 > 103 || var17.field21 + arg5 > 103 || var17.field30 + arg0 > 103 || var17.field30 + arg5 > 103) {
						return;
					}

					if (var17.field24) {
						field423[arg1].method34(var17.field30, var17.field22, var15, var17.field21, arg0, arg5);
					}
				}

				if (arg4 == 3) {
					field178.method536(arg0, arg5, arg1);
					AMVKCKZF var18 = AMVKCKZF.method4(var13);
					if (var18.field24 && var18.field4) {
						field423[arg1].method36(arg0, arg5);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field168[1][arg0][arg5] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				SSYGWTYM.method417(arg0, field206, field178, arg6, arg1, field423[arg1], arg2, arg3, arg5, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method156() {
		field350 = false;
		while (field380) {
			field350 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field338 = null;
		field339 = null;
		field561 = null;
		field221 = null;
		field222 = null;
		field223 = null;
		field224 = null;
		field368 = null;
		field369 = null;
		field513 = null;
		field514 = null;
		field131 = null;
		field132 = null;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method157() {
		Graphics var1 = method119().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method435(1);

		if (field505) {
			field350 = false;
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

		if (field405) {
			field350 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field415) {
			field350 = false;
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

	@ObfuscatedName("client.c(IZ)V")
	public final void method158(boolean arg0) {
		method175();
		field495.method477();
		field338.method198(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field343 == 0) {
			int var4 = var3 / 2 + 80;
			field127.method482(field332.field836, 0x75A9A9, true, var2 / 2, var4);
			int var5 = var3 / 2 - 20;
			field129.method482("Welcome to RuneScape", 0xFFFF00, true, var2 / 2, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field339.method198(var6 - 73, var7 - 20);
			field129.method482("New User", 0xFFFFFF, true, var6, var7 + 5);
			int var8 = var2 / 2 + 80;
			field339.method198(var8 - 73, var7 - 20);
			field129.method482("Existing User", 0xFFFFFF, true, var8, var7 + 5);
		}

		if (field343 == 2) {
			int var9 = var3 / 2 - 40;
			if (field557.length() > 0) {
				field129.method482(field557, 0xFFFF00, true, var2 / 2, var9 - 15);
				field129.method482(field558, 0xFFFF00, true, var2 / 2, var9);
				var9 += 30;
			} else {
				field129.method482(field558, 0xFFFF00, true, var2 / 2, var9 - 7);
				var9 += 30;
			}

			field129.method489(true, var2 / 2 - 90, 0xFFFFFF, var9, "Username: " + field429 + (field550 == 0 & field228 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field129.method489(true, var2 / 2 - 88, 0xFFFFFF, var9, "Password: " + WAQVJSXE.method466(field430) + (field550 == 1 & field228 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field339.method198(var10 - 73, var11 - 20);
				field129.method482("Login", 0xFFFFFF, true, var10, var11 + 5);
				int var12 = var2 / 2 + 80;
				field339.method198(var12 - 73, var11 - 20);
				field129.method482("Cancel", 0xFFFFFF, true, var12, var11 + 5);
			}
		}

		if (field343 == 3) {
			field129.method482("Create a free account", 0xFFFF00, true, var2 / 2, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field129.method482("To create a new account you need to", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field129.method482("go back to the main RuneScape webpage", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field129.method482("and choose the 'create account'", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			field129.method482("button near the top of that page.", 0xFFFFFF, true, var2 / 2, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field339.method198(var14 - 73, var15 - 20);
			field129.method482("Cancel", 0xFFFFFF, true, var14, var15 + 5);
		}

		field495.method478(171, 202, field1199);

		if (field532) {
			field532 = false;
			field493.method478(0, 128, field1199);
			field494.method478(371, 202, field1199);
			field498.method478(265, 0, field1199);
			field499.method478(265, 562, field1199);
			field500.method478(171, 128, field1199);
			field501.method478(171, 562, field1199);
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method159() {
		try {
			if (field453 != null) {
				field453.method187();
			}
		} catch (Exception var2) {
		}

		field453 = null;
		field418 = false;
		field343 = 0;
		field429 = "";
		field430 = "";
		method45();
		field178.method516();

		for (int var1 = 0; var1 < 4; var1++) {
			field423[var1].method28();
		}

		System.gc();
		method177();
		field248 = -1;
		field416 = -1;
		field374 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;)V")
	public final void method160(String arg0, String arg1) {
		if (field156 != null) {
			field156.method477();
			PTUBVHCT.field988 = field372;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field128.method481(arg1, 0, 257, var3);
			field128.method481(arg1, 0xFFFFFF, 256, var3 - 1);
			var3 += 15;
			if (arg0 != null) {
				field128.method481(arg0, 0, 257, var3);
				field128.method481(arg0, 0xFFFFFF, 256, var3 - 1);
			}

			field156.method478(4, 4, field1199);
		} else if (field1200 != null) {
			field1200.method477();
			PTUBVHCT.field988 = field373;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			ANTOHTCU.method17(383 - var5 / 2, var4 - 5 - var6 / 2, 0, var5, var6);
			ANTOHTCU.method18(383 - var5 / 2, var5, 0xFFFFFF, var6, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field128.method481(arg1, 0, 383, var4);
			field128.method481(arg1, 0xFFFFFF, 382, var4 - 1);
			var4 += 15;
			if (arg0 != null) {
				field128.method481(arg0, 0, 383, var4);
				field128.method481(arg0, 0xFFFFFF, 382, var4 - 1);
			}

			field1200.method478(0, 0, field1199);
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method161() {
		for (int var1 = -1; var1 < field306; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field304;
			} else {
				var2 = field307[var1];
			}

			ZATRZGAA var3 = field305[var2];
			if (var3 != null && var3.field932 > 0) {
				var3.field932--;
				if (var3.field932 == 0) {
					var3.field953 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field171; var4++) {
			int var5 = field172[var4];
			RLTBSHTA var6 = field170[var5];
			if (var6 != null && var6.field932 > 0) {
				var6.field932--;
				if (var6.field932 == 0) {
					var6.field953 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method162() {
		field380 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field350) {
				field542++;
				method67();
				method67();
				method53();
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

		field380 = false;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method163(boolean arg0) {
		for (int var2 = 0; var2 < field171; var2++) {
			RLTBSHTA var3 = field170[field172[var2]];
			int var4 = (field172[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method342() && var3.field1112.field1421 == arg0 && var3.field1112.method513()) {
				int var5 = var3.field937 >> 7;
				int var6 = var3.field938 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field948 == 1 && (var3.field937 & 0x7F) == 0x40 && (var3.field938 & 0x7F) == 0x40) {
						if (field288[var5][var6] == field559) {
							continue;
						}

						field288[var5][var6] = field559;
					}

					if (!var3.field1112.field1416) {
						var4 += Integer.MIN_VALUE;
					}

					field178.method527(var3.field939, var3, field540, method114(field540, var3.field937, var3.field938), var3.field937, var3.field938, var4, (var3.field948 - 1) * 64 + 60, var3.field949);
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method164() {
		field259 = 0;
		int var1 = (field554.field937 >> 7) + field327;
		int var2 = (field554.field938 >> 7) + field328;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field259 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field259 = 1;
		}

		if (field259 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field259 = 0;
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method165() {
		try {
			int var1 = field554.field937 + field325;
			int var2 = field554.field938 + field524;
			if (field382 - var1 < -500 || field382 - var1 > 500 || field383 - var2 < -500 || field383 - var2 > 500) {
				field382 = var1;
				field383 = var2;
			}

			if (field382 != var1) {
				field382 += (var1 - field382) / 16;
			}

			if (field383 != var2) {
				field383 += (var2 - field383) / 16;
			}

			if (field1217[1] == 1) {
				field355 += (-field355 - 24) / 2;
			} else if (field1217[2] == 1) {
				field355 += (24 - field355) / 2;
			} else {
				field355 /= 2;
			}

			if (field1217[3] == 1) {
				field356 += (12 - field356) / 2;
			} else if (field1217[4] == 1) {
				field356 += (-field356 - 12) / 2;
			} else {
				field356 /= 2;
			}

			field354 = field355 / 2 + field354 & 0x7FF;
			field353 += field356 / 2;
			if (field353 < 128) {
				field353 = 128;
			}

			if (field353 > 383) {
				field353 = 383;
			}

			int var3 = field382 >> 7;
			int var4 = field383 >> 7;
			int var5 = method114(field540, field382, field383);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field540;
						if (var9 < 3 && (field168[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field206[var9][var7][var8];
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

			if (var11 > field543) {
				field543 += (var11 - field543) / 24;
			} else if (var11 < field543) {
				field543 += (var11 - field543) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field554.field937 + "," + field554.field938 + "," + field382 + "," + field383 + "," + field270 + "," + field271 + "," + field327 + "," + field328);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ILCMELCUKG;)V")
	public final void method166(CMELCUKG arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field368.length; var3++) {
			field368[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field368[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field369[var9] = (field368[var9 - 1] + field368[var9 + 1] + field368[var9 - 128] + field368[var9 + 128]) / 4;
				}
			}

			int[] var10 = field368;
			field368 = field369;
			field369 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field576; var12++) {
				for (int var13 = 0; var13 < arg0.field575; var13++) {
					if (arg0.field573[var11++] != 0) {
						int var14 = var13 + arg0.field577 + 16;
						int var15 = var12 + arg0.field578 + 16;
						int var16 = (var15 << 7) + var14;
						field368[var16] = 0;
					}
				}
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method167() {
		field155.method477();

		if (field260 == 2) {
			byte[] var1 = field427.field573;
			int[] var2 = ANTOHTCU.field48;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field413.method428(field354, 0, 25, 33, field208, 33, 25, 0, 256, field158);
			field156.method477();
			PTUBVHCT.field988 = field372;
		} else {
			int var5 = field354 + field257 & 0x7FF;
			int var6 = field554.field937 / 32 + 48;
			int var7 = 464 - field554.field938 / 32;
			field361.method428(var5, 5, var7, 146, field411, 151, var6, 25, field246 + 256, field475);
			field413.method428(field354, 0, 25, 33, field208, 33, 25, 0, 256, field158);

			for (int var8 = 0; var8 < field230; var8++) {
				int var9 = field231[var8] * 4 + 2 - field554.field937 / 32;
				int var10 = field232[var8] * 4 + 2 - field554.field938 / 32;
				method102(var10, var9, field209[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					WTGHTNMN var13 = field391[field540][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field554.field937 / 32;
						int var15 = var12 * 4 + 2 - field554.field938 / 32;
						method102(var15, var14, field315);
					}
				}
			}

			for (int var16 = 0; var16 < field171; var16++) {
				RLTBSHTA var17 = field170[field172[var16]];
				if (var17 != null && var17.method342()) {
					ZLQCXMFK var18 = var17.field1112;
					if (var18.field1432 != null) {
						var18 = var18.method510();
					}

					if (var18 != null && var18.field1426 && var18.field1416) {
						int var19 = var17.field937 / 32 - field554.field937 / 32;
						int var20 = var17.field938 / 32 - field554.field938 / 32;
						method102(var20, var19, field316);
					}
				}
			}

			for (int var21 = 0; var21 < field306; var21++) {
				ZATRZGAA var22 = field305[field307[var21]];
				if (var22 != null && var22.method342()) {
					int var23 = var22.field937 / 32 - field554.field937 / 32;
					int var24 = var22.field938 / 32 - field554.field938 / 32;
					boolean var25 = false;
					long var26 = WAQVJSXE.method461(var22.field1396);
					for (int var28 = 0; var28 < field298; var28++) {
						if (field335[var28] == var26 && field251[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field554.field1379 != 0 && var22.field1379 != 0 && field554.field1379 == var22.field1379) {
						var29 = true;
					}

					if (var25) {
						method102(var24, var23, field318);
					} else if (var29) {
						method102(var24, var23, field319);
					} else {
						method102(var24, var23, field317);
					}
				}
			}

			if (field207 != 0 && field228 % 20 < 10) {
				if (field207 == 1 && field311 >= 0 && field311 < field170.length) {
					RLTBSHTA var30 = field170[field311];
					if (var30 != null) {
						int var31 = var30.field937 / 32 - field554.field937 / 32;
						int var32 = var30.field938 / 32 - field554.field938 / 32;
						method140(var32, var31, field470);
					}
				}

				if (field207 == 2) {
					int var33 = (field392 - field327) * 4 + 2 - field554.field937 / 32;
					int var34 = (field393 - field328) * 4 + 2 - field554.field938 / 32;
					method140(var34, var33, field470);
				}

				if (field207 == 10 && field424 >= 0 && field424 < field305.length) {
					ZATRZGAA var35 = field305[field424];
					if (var35 != null) {
						int var36 = var35.field937 / 32 - field554.field937 / 32;
						int var37 = var35.field938 / 32 - field554.field938 / 32;
						method140(var37, var36, field470);
					}
				}
			}

			if (field359 != 0) {
				int var38 = field359 * 4 + 2 - field554.field937 / 32;
				int var39 = field360 * 4 + 2 - field554.field938 / 32;
				method102(var39, var38, field469);
			}

			ANTOHTCU.method17(97, 78, 0xFFFFFF, 3, 3);
			field156.method477();
			PTUBVHCT.field988 = field372;
		}
	}

	@ObfuscatedName("client.d(ILEMWAMCXW;I)V")
	public final void method168(EMWAMCXW arg0, int arg1) {
		arg0.method227();
		int var3 = arg0.method228(8);
		if (var3 < field171) {
			for (int var4 = var3; var4 < field171; var4++) {
				field545[field544++] = field172[var4];
			}
		}

		if (var3 > field171) {
			signlink.reporterror(field429 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field171 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field172[var5];
			RLTBSHTA var7 = field170[var6];
			int var8 = arg0.method228(1);
			if (var8 == 0) {
				field172[field171++] = var6;
				var7.field936 = field228;
			} else {
				int var9 = arg0.method228(2);
				if (var9 == 0) {
					field172[field171++] = var6;
					var7.field936 = field228;
					field309[field308++] = var6;
				} else if (var9 == 1) {
					field172[field171++] = var6;
					var7.field936 = field228;
					int var10 = arg0.method228(3);
					var7.method343(var10, false);
					int var11 = arg0.method228(1);
					if (var11 == 1) {
						field309[field308++] = var6;
					}
				} else if (var9 == 2) {
					field172[field171++] = var6;
					var7.field936 = field228;
					int var12 = arg0.method228(3);
					var7.method343(var12, true);
					int var13 = arg0.method228(3);
					var7.method343(var13, true);
					int var14 = arg0.method228(1);
					if (var14 == 1) {
						field309[field308++] = var6;
					}
				} else if (var9 == 3) {
					field545[field544++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		JNEOOHMF var10 = null;
		for (JNEOOHMF var11 = (JNEOOHMF) field216.method470(); var11 != null; var11 = (JNEOOHMF) field216.method472()) {
			if (var11.field776 == arg3 && var11.field778 == arg5 && var11.field779 == arg8 && var11.field777 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new JNEOOHMF();
			var10.field776 = arg3;
			var10.field777 = arg6;
			var10.field778 = arg5;
			var10.field779 = arg8;
			method80(var10);
			field216.method467(var10);
		}

		var10.field784 = arg0;
		var10.field786 = arg1;
		var10.field785 = arg2;
		var10.field787 = arg4;
		var10.field780 = arg7;
	}

	@ObfuscatedName("client.b(LEMWAMCXW;II)V")
	public final void method170(EMWAMCXW arg0, int arg1) {
		int var3 = arg0.method228(8);
		if (var3 < field306) {
			for (int var4 = var3; var4 < field306; var4++) {
				field545[field544++] = field307[var4];
			}
		}

		if (var3 > field306) {
			signlink.reporterror(field429 + " Too many players");
			throw new RuntimeException("eek");
		}

		field306 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field307[var5];
			ZATRZGAA var7 = field305[var6];
			int var8 = arg0.method228(1);
			if (var8 == 0) {
				field307[field306++] = var6;
				var7.field936 = field228;
			} else {
				int var9 = arg0.method228(2);
				if (var9 == 0) {
					field307[field306++] = var6;
					var7.field936 = field228;
					field309[field308++] = var6;
				} else if (var9 == 1) {
					field307[field306++] = var6;
					var7.field936 = field228;
					int var10 = arg0.method228(3);
					var7.method343(var10, false);
					int var11 = arg0.method228(1);
					if (var11 == 1) {
						field309[field308++] = var6;
					}
				} else if (var9 == 2) {
					field307[field306++] = var6;
					var7.field936 = field228;
					int var12 = arg0.method228(3);
					var7.method343(var12, true);
					int var13 = arg0.method228(3);
					var7.method343(var13, true);
					int var14 = arg0.method228(1);
					if (var14 == 1) {
						field309[field308++] = var6;
					}
				} else if (var9 == 3) {
					field545[field544++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method171(int arg0, int arg1) {
		boolean var3 = false;
		QXTIWHBH var4 = QXTIWHBH.method380(arg0);
		for (int var5 = 0; var5 < var4.field1101.length && var4.field1101[var5] != -1; var5++) {
			QXTIWHBH var6 = QXTIWHBH.method380(var4.field1101[var5]);
			if (var6.field1077 == 0) {
				var3 |= method171(var6.field1059, arg1);
			}

			if (var6.field1077 == 6 && (var6.field1066 != -1 || var6.field1067 != -1)) {
				boolean var7 = method128(var6);
				int var8;
				if (var7) {
					var8 = var6.field1067;
				} else {
					var8 = var6.field1066;
				}

				if (var8 != -1) {
					VYXELYSX var9 = VYXELYSX.field1273[var8];
					var6.field1098 += arg1;
					while (var6.field1098 > var9.method459(var6.field1054)) {
						var6.field1098 -= var9.method459(var6.field1054) + 1;
						var6.field1054++;
						if (var6.field1054 >= var9.field1274) {
							var6.field1054 -= var9.field1278;
							if (var6.field1054 < 0 || var6.field1054 >= var9.field1274) {
								var6.field1054 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1077 == 6 && var6.field1048 != 0) {
				int var10 = var6.field1048 >> 16;
				int var11 = var6.field1048 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1084 = var6.field1084 + var10 & 0x7FF;
				var6.field1085 = var6.field1085 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method172(int arg0) {
		int[] var2 = field361.field1183;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field168[arg0][var7][var5] & 0x18) == 0) {
					field178.method551(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field168[arg0 + 1][var7][var5] & 0x8) != 0) {
					field178.method551(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field361.method419();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field168[arg0][var11][var10] & 0x18) == 0) {
					method173(var10, arg0, var9, var8, var11);
				}

				if (arg0 < 3 && (field168[arg0 + 1][var11][var10] & 0x8) != 0) {
					method173(var10, arg0 + 1, var9, var8, var11);
				}
			}
		}

		if (field156 != null) {
			field156.method477();
			PTUBVHCT.field988 = field372;
		}

		field230 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field178.method545(field540, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = AMVKCKZF.method4(var14).field46;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field423[field540].field119;
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

						field209[field230] = field211[var15];
						field231[field230] = var16;
						field232[field230] = var17;
						field230++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBIII)V")
	public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field178.method542(arg1, arg4, arg0);
		if (var6 != 0) {
			int var7 = field178.method546(arg1, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field361.field1183;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			AMVKCKZF var14 = AMVKCKZF.method4(var13);
			if (var14.field33 == -1) {
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
				CMELCUKG var15 = field167[var14.field33];
				if (var15 != null) {
					int var16 = (var14.field21 * 4 - var15.field575) / 2;
					int var17 = (var14.field30 * 4 - var15.field576) / 2;
					var15.method198(arg4 * 4 + var16 + 48, (104 - arg0 - var14.field30) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field178.method544(arg1, arg4, arg0);
		if (var18 != 0) {
			int var19 = field178.method546(arg1, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			AMVKCKZF var23 = AMVKCKZF.method4(var22);
			if (var23.field33 != -1) {
				CMELCUKG var24 = field167[var23.field33];
				if (var24 != null) {
					int var25 = (var23.field21 * 4 - var24.field575) / 2;
					int var26 = (var23.field30 * 4 - var24.field576) / 2;
					var24.method198(arg4 * 4 + var25 + 48, (104 - arg0 - var23.field30) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field361.field1183;
				int var29 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field178.method545(arg1, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			AMVKCKZF var32 = AMVKCKZF.method4(var31);
			if (var32.field33 != -1) {
				CMELCUKG var33 = field167[var32.field33];
				if (var33 != null) {
					int var34 = (var32.field21 * 4 - var33.field575) / 2;
					int var35 = (var32.field30 * 4 - var33.field576) / 2;
					var33.method198(arg4 * 4 + var34 + 48, (104 - arg0 - var32.field30) * 4 + 48 + var35);
					return;
				}
			}
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

	@ObfuscatedName("client.r(Z)V")
	public final void method175() {
		if (field493 == null) {
			field1200 = null;
			field157 = null;
			field155 = null;
			field154 = null;
			field156 = null;
			field479 = null;
			field480 = null;
			field481 = null;
			field496 = new XBLPPVAP(method119(), 128, 265);
			ANTOHTCU.method15();
			field497 = new XBLPPVAP(method119(), 128, 265);
			ANTOHTCU.method15();
			field493 = new XBLPPVAP(method119(), 509, 171);
			ANTOHTCU.method15();
			field494 = new XBLPPVAP(method119(), 360, 132);
			ANTOHTCU.method15();
			field495 = new XBLPPVAP(method119(), 360, 200);
			ANTOHTCU.method15();
			field498 = new XBLPPVAP(method119(), 202, 238);
			ANTOHTCU.method15();
			field499 = new XBLPPVAP(method119(), 203, 238);
			ANTOHTCU.method15();
			field500 = new XBLPPVAP(method119(), 74, 94);
			ANTOHTCU.method15();
			field501 = new XBLPPVAP(method119(), 75, 94);
			ANTOHTCU.method15();

			if (field451 != null) {
				method153();
				method176();
			}

			field532 = true;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method176() {
		field338 = new CMELCUKG(field451, "titlebox", 0);
		field339 = new CMELCUKG(field451, "titlebutton", 0);
		field561 = new CMELCUKG[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field561[var1] = new CMELCUKG(field451, "runes", var1);
		}

		field131 = new TFHGRYAS(128, 265);
		field132 = new TFHGRYAS(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field131.field1183[var2] = field496.field1316[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field132.field1183[var3] = field497.field1316[var3];
		}

		field222 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field222[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field222[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field222[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field222[var7 + 192] = 0xFFFFFF;
		}

		field223 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field223[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field223[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field223[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field223[var11 + 192] = 0xFFFFFF;
		}

		field224 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field224[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field224[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field224[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field224[var15 + 192] = 0xFFFFFF;
		}

		field221 = new int[256];
		field368 = new int[32768];
		field369 = new int[32768];
		method166(null);
		field513 = new int[32768];
		field514 = new int[32768];
		method98("Connecting to fileserver", 10);

		if (!field350) {
			field478 = true;
			field350 = true;
			method185(this, 2);
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method177() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.J(I)V")
	public final void method178() {
		field406++;
		if (field406 > 130) {
			field406 = 0;
			field165.method206(137);
			field165.method207(209);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method436();
					if (var1 == -1) {
						return;
					}

					if (field212 != -1 && field504 == field212) {
						break;
					}

					if (field195) {
						if (var1 >= 32 && var1 <= 122 && field334.length() < 80) {
							field334 = field334 + (char) var1;
							field245 = true;
						}

						if (var1 == 8 && field334.length() > 0) {
							field334 = field334.substring(0, field334.length() - 1);
							field245 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field195 = false;
							field245 = true;

							if (field381 == 1) {
								long var2 = WAQVJSXE.method461(field334);
								method184(var2);
							}

							if (field381 == 2 && field298 > 0) {
								long var4 = WAQVJSXE.method461(field334);
								method130(var4);
							}

							if (field381 == 3 && field334.length() > 0) {
								field165.method206(238);
								field165.method207(0);
								int var6 = field165.field617;
								field165.method213(field546);
								EXGZUGXN.method257(field334, field165);
								field165.method216(field165.field617 - var6);
								field334 = EXGZUGXN.method258(field334);
								field334 = ZWRCNFEU.method577(field334);
								method79(field334, 6, WAQVJSXE.method465(WAQVJSXE.method462(field546)));

								if (field143 == 2) {
									field143 = 1;
									field160 = true;
									field165.method206(178);
									field165.method207(field378);
									field165.method207(field143);
									field165.method207(field273);
								}
							}

							if (field381 == 4 && field523 < 100) {
								long var7 = WAQVJSXE.method461(field334);
								method82(var7);
							}

							if (field381 == 5 && field523 > 0) {
								long var9 = WAQVJSXE.method461(field334);
								method117(var9);
							}
						}
					} else if (field434 == 1) {
						if (var1 >= 48 && var1 <= 57 && field340.length() < 10) {
							field340 = field340 + (char) var1;
							field245 = true;
						}

						if (var1 == 8 && field340.length() > 0) {
							field340 = field340.substring(0, field340.length() - 1);
							field245 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field340.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field340);
								} catch (Exception var21) {
								}

								field165.method206(59);
								field165.method211(var11);
							}

							field434 = 0;
							field245 = true;
						}
					} else if (field434 == 2) {
						if (var1 >= 32 && var1 <= 122 && field340.length() < 12) {
							field340 = field340 + (char) var1;
							field245 = true;
						}

						if (var1 == 8 && field340.length() > 0) {
							field340 = field340.substring(0, field340.length() - 1);
							field245 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field340.length() > 0) {
								field165.method206(16);
								field165.method213(WAQVJSXE.method461(field340));
							}

							field434 = 0;
							field245 = true;
						}
					} else if (field434 == 3) {
						if (var1 >= 32 && var1 <= 122 && field340.length() < 40) {
							field340 = field340 + (char) var1;
							field245 = true;
						}

						if (var1 == 8 && field340.length() > 0) {
							field340 = field340.substring(0, field340.length() - 1);
							field245 = true;
						}
					} else if (field210 == -1 && field297 == -1) {
						if (var1 >= 32 && var1 <= 122 && field397.length() < 80) {
							field397 = field397 + (char) var1;
							field245 = true;
						}

						if (var1 == 8 && field397.length() > 0) {
							field397 = field397.substring(0, field397.length() - 1);
							field245 = true;
						}

						if ((var1 == 13 || var1 == 10) && field397.length() > 0) {
							if (field379 == 2) {
								if (field397.equals("::clientdrop")) {
									method99();
								}

								if (field397.equals("::lag")) {
									method118();
								}

								if (field397.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field332.method315(2); var12++) {
										field332.method314(2, var12, (byte) 1);
									}
								}

								if (field397.equals("::fpson")) {
									field322 = true;
								}

								if (field397.equals("::fpsoff")) {
									field322 = false;
								}

								if (field397.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field423[var13].field119[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field397.startsWith("::")) {
								field165.method206(146);
								field165.method207(field397.length() - 1);
								field165.method214(field397.substring(2));
							} else {
								String var16 = field397.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field397 = field397.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field397 = field397.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field397 = field397.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field397 = field397.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field397 = field397.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field397 = field397.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field397 = field397.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field397 = field397.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field397 = field397.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field397 = field397.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field397 = field397.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field397 = field397.substring(6);
								}

								String var18 = field397.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field397 = field397.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field397 = field397.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field397 = field397.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field397 = field397.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field397 = field397.substring(6);
								}

								field165.method206(35);
								field165.method207(0);
								int var20 = field165.field617;
								field165.method234(var17);
								field165.method235(var19);
								field169.field617 = 0;
								EXGZUGXN.method257(field397, field169);
								field165.method254(0, field169.field616, field169.field617);
								field165.method216(field165.field617 - var20);
								field397 = EXGZUGXN.method258(field397);
								field397 = ZWRCNFEU.method577(field397);
								field554.field953 = field397;
								field554.field954 = var17;
								field554.field940 = var19;
								field554.field932 = 150;

								if (field379 == 2) {
									method79(field554.field953, 2, "@cr2@" + field554.field1396);
								} else if (field379 == 1) {
									method79(field554.field953, 2, "@cr1@" + field554.field1396);
								} else {
									method79(field554.field953, 2, field554.field1396);
								}

								if (field378 == 2) {
									field378 = 3;
									field160 = true;
									field165.method206(178);
									field165.method207(field378);
									field165.method207(field143);
									field165.method207(field273);
								}
							}

							field397 = "";
							field245 = true;
						}
					}
				}

				if (var1 == 8 && field517.length() > 0) {
					field517 = field517.substring(0, field517.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field517.length() < 12) {
				field517 = field517 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method179(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IILQXTIWHBH;)I")
	public final int method180(int arg0, QXTIWHBH arg1) {
		if (arg1.field1109 == null || arg0 >= arg1.field1109.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1109[arg0];
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
					var8 = field388[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field142[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field166[var3[var5++]];
				}

				if (var7 == 4) {
					QXTIWHBH var10 = QXTIWHBH.method380(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < VXCJHHIE.field1269 && (!VXCJHHIE.method447(var11).field1224 || field240)) {
						for (int var12 = 0; var12 < var10.field1111.length; var12++) {
							if (var11 + 1 == var10.field1111[var12]) {
								var8 += var10.field1041[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field286[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field213[field142[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field286[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field554.field1385;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < ZZZESBDO.field1515; var13++) {
						if (ZZZESBDO.field1517[var13]) {
							var8 += field142[var13];
						}
					}
				}

				if (var7 == 10) {
					QXTIWHBH var14 = QXTIWHBH.method380(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < VXCJHHIE.field1269 && (!VXCJHHIE.method447(var15).field1224 || field240)) {
						for (int var16 = 0; var16 < var14.field1111.length; var16++) {
							if (var14.field1111[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field252;
				}

				if (var7 == 12) {
					var8 = field552;
				}

				if (var7 == 13) {
					int var17 = field286[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					EFEPEUMF var20 = EFEPEUMF.field607[var19];
					int var21 = var20.field609;
					int var22 = var20.field610;
					int var23 = var20.field611;
					int var24 = field323[var23 - var22];
					var8 = field286[var21] >> var22 & var24;
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
					var8 = (field554.field937 >> 7) + field327;
				}

				if (var7 == 19) {
					var8 = (field554.field938 >> 7) + field328;
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

	@ObfuscatedName("client.a(LQXTIWHBH;I)V")
	public final void method181(QXTIWHBH arg0) {
		int var2 = arg0.field1093;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field299 == 0) {
				arg0.field1107 = "Loading friend list";
				arg0.field1074 = 0;
			} else if (var2 == 1 && field299 == 1) {
				arg0.field1107 = "Connecting to friendserver";
				arg0.field1074 = 0;
			} else if (var2 == 2 && field299 != 2) {
				arg0.field1107 = "Please wait...";
				arg0.field1074 = 0;
			} else {
				int var3 = field298;
				if (field299 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1107 = "";
					arg0.field1074 = 0;
				} else {
					arg0.field1107 = field183[var2];
					arg0.field1074 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field298;
			if (field299 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1107 = "";
				arg0.field1074 = 0;
			} else {
				if (field251[var2] == 0) {
					arg0.field1107 = "@red@Offline";
				} else if (field251[var2] < 200) {
					if (field251[var2] == field238) {
						arg0.field1107 = "@gre@World" + (field251[var2] - 9);
					} else {
						arg0.field1107 = "@yel@World" + (field251[var2] - 9);
					}
				} else if (field251[var2] == field238) {
					arg0.field1107 = "@gre@Classic" + (field251[var2] - 219);
				} else {
					arg0.field1107 = "@yel@Classic" + (field251[var2] - 219);
				}

				arg0.field1074 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field298;
			if (field299 != 2) {
				var5 = 0;
			}

			arg0.field1057 = var5 * 15 + 20;
			if (arg0.field1057 <= arg0.field1065) {
				arg0.field1057 = arg0.field1065 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field299 == 0) {
				arg0.field1107 = "Loading ignore list";
				arg0.field1074 = 0;
			} else if (var2 == 1 && field299 == 0) {
				arg0.field1107 = "Please wait...";
				arg0.field1074 = 0;
			} else {
				int var6 = field523;
				if (field299 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1107 = "";
					arg0.field1074 = 0;
				} else {
					arg0.field1107 = WAQVJSXE.method465(WAQVJSXE.method462(field237[var2]));
					arg0.field1074 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1057 = field523 * 15 + 20;
			if (arg0.field1057 <= arg0.field1065) {
				arg0.field1057 = arg0.field1065 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1084 = 150;
			arg0.field1085 = (int) (Math.sin(field228 / 40.0D) * 256.0D) & 0x7FF;

			if (field562) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field267[var7];
					if (var8 >= 0 && !QRYQWAHS.field1032[var8].method375()) {
						return;
					}
				}

				field562 = false;
				IEHKDFMR[] var9 = new IEHKDFMR[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field267[var11];
					if (var12 >= 0) {
						var9[var10++] = QRYQWAHS.field1032[var12].method376();
					}
				}

				IEHKDFMR var13 = new IEHKDFMR(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field435[var14] != 0) {
						var13.method281(field219[var14][0], field219[var14][field435[var14]]);

						if (var14 == 1) {
							var13.method281(field407[0], field407[field435[var14]]);
						}
					}
				}

				var13.method274();
				var13.method275(VYXELYSX.field1273[field554.field919].field1275[0]);
				var13.method284(64, 850, -30, -50, -30, true);
				arg0.field1072 = 5;
				arg0.field1073 = 0;
				QXTIWHBH.method383(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field204 == null) {
				field204 = arg0.field1058;
				field205 = arg0.field1042;
			}

			if (field337) {
				arg0.field1058 = field205;
			} else {
				arg0.field1058 = field204;
			}
		} else if (var2 == 325) {
			if (field204 == null) {
				field204 = arg0.field1058;
				field205 = arg0.field1042;
			}

			if (field337) {
				arg0.field1058 = field204;
			} else {
				arg0.field1058 = field205;
			}
		} else if (var2 == 600) {
			arg0.field1107 = field517;
			if (field228 % 20 < 10) {
				arg0.field1107 = arg0.field1107 + "|";
			} else {
				arg0.field1107 = arg0.field1107 + " ";
			}
		} else if (var2 == 620) {
			if (field379 < 1) {
				arg0.field1107 = "";
			} else if (field474) {
				arg0.field1040 = 0xFF0000;
				arg0.field1107 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1040 = 0xFFFFFF;
				arg0.field1107 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field556 - field551;
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
			if (field487 == 0) {
				arg0.field1107 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field487 <= field556) {
				arg0.field1107 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method182(field487);
			} else {
				int var17 = field556 + 14 - field487;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1107 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method182(field487) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field218 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field218 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field218 + " unread messages";
			}

			arg0.field1107 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field386 > 0 && field386 <= field556 + 10) {
				arg0.field1107 = "Last password change:\\n@gre@" + method182(field386);
			} else {
				arg0.field1107 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field538 > 2 && !field240) {
				arg0.field1107 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field538 > 2) {
				arg0.field1107 = "\\n\\nYou have @gre@" + field538 + "@yel@ days of\\nmember credit remaining.";
			} else if (field538 > 0) {
				arg0.field1107 = "You have @gre@" + field538 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1107 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field538 > 2 && !field240) {
				arg0.field1107 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field538 > 0) {
				arg0.field1107 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1107 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field487 > field556) {
				arg0.field1107 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1107 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method182(int arg0) {
		if (arg0 > field556 + 10) {
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

	@ObfuscatedName("client.a(ILQXTIWHBH;BII)V")
	public final void method183(int arg0, QXTIWHBH arg1, int arg2, int arg3) {
		if (arg1.field1077 == 0 && arg1.field1101 != null && (!arg1.field1104 || field450 == arg1.field1059 || field159 == arg1.field1059 || field266 == arg1.field1059)) {
			int var5 = ANTOHTCU.field53;
			int var6 = ANTOHTCU.field51;
			int var7 = ANTOHTCU.field54;
			int var8 = ANTOHTCU.field52;
			ANTOHTCU.method14(arg1.field1106 + arg0, arg2, arg1.field1065 + arg2, arg0);
			int var9 = arg1.field1101.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1091[var10] + arg0;
				int var12 = arg1.field1051[var10] + arg2 - arg3;
				QXTIWHBH var13 = QXTIWHBH.method380(arg1.field1101[var10]);
				var11 += var13.field1108;
				var12 += var13.field1045;

				if (var13.field1093 > 0) {
					method181(var13);
				}

				if (var13.field1077 == 0) {
					if (var13.field1055 > var13.field1057 - var13.field1065) {
						var13.field1055 = var13.field1057 - var13.field1065;
					}

					if (var13.field1055 < 0) {
						var13.field1055 = 0;
					}

					method183(var11, var13, var12, var13.field1055);

					if (var13.field1057 > var13.field1065) {
						method152(var12, var13.field1057, var13.field1055, var13.field1065, var13.field1106 + var11);
					}
				} else if (var13.field1077 != 1) {
					if (var13.field1077 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1065; var15++) {
							for (int var16 = 0; var16 < var13.field1106; var16++) {
								int var17 = (var13.field1046 + 32) * var16 + var11;
								int var18 = (var13.field1044 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1095[var14];
									var18 += var13.field1050[var14];
								}

								if (var13.field1111[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1111[var14] - 1;
									if (var17 > ANTOHTCU.field53 - 32 && var17 < ANTOHTCU.field54 && var18 > ANTOHTCU.field51 - 32 && var18 < ANTOHTCU.field52 || field347 != 0 && field346 == var14) {
										int var22 = 0;
										if (field173 == 1 && field174 == var14 && field175 == var13.field1059) {
											var22 = 0xFFFFFF;
										}

										TFHGRYAS var23 = VXCJHHIE.method446(var13.field1041[var14], var21, var22);
										if (var23 != null) {
											if (field347 != 0 && field346 == var14 && field345 == var13.field1059) {
												var19 = field1207 - field348;
												var20 = field1208 - field349;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field182 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method426(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < ANTOHTCU.field51 && arg1.field1055 > 0) {
													int var24 = (ANTOHTCU.field51 - var18 - var20) * field320 / 3;
													if (var24 > field320 * 10) {
														var24 = field320 * 10;
													}

													if (var24 > arg1.field1055) {
														var24 = arg1.field1055;
													}

													arg1.field1055 -= var24;
													field349 += var24;
												}

												if (var18 + var20 + 32 > ANTOHTCU.field52 && arg1.field1055 < arg1.field1057 - arg1.field1065) {
													int var25 = (var18 + var20 + 32 - ANTOHTCU.field52) * field320 / 3;
													if (var25 > field320 * 10) {
														var25 = field320 * 10;
													}

													if (var25 > arg1.field1057 - arg1.field1065 - arg1.field1055) {
														var25 = arg1.field1057 - arg1.field1065 - arg1.field1055;
													}

													arg1.field1055 += var25;
													field349 -= var25;
												}
											} else if (field447 != 0 && field446 == var14 && field445 == var13.field1059) {
												var23.method426(var17, 128, var18);
											} else {
												var23.method424(var17, var18);
											}

											if (var23.field1188 == 33 || var13.field1041[var14] != 1) {
												int var26 = var13.field1041[var14];
												field127.method485(method174(var26), var17 + var19 + 1, 0, var18 + var20 + 10);
												field127.method485(method174(var26), var17 + var19, 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1052 != null && var14 < 20) {
									TFHGRYAS var27 = var13.field1052[var14];
									if (var27 != null) {
										var27.method424(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1077 == 3) {
						boolean var28 = false;
						if (field266 == var13.field1059 || field159 == var13.field1059 || field450 == var13.field1059) {
							var28 = true;
						}

						int var29;
						if (method128(var13)) {
							var29 = var13.field1039;
							if (var28 && var13.field1082 != 0) {
								var29 = var13.field1082;
							}
						} else {
							var29 = var13.field1040;
							if (var28 && var13.field1047 != 0) {
								var29 = var13.field1047;
							}
						}

						if (var13.field1097 == 0) {
							if (var13.field1053) {
								ANTOHTCU.method17(var11, var12, var29, var13.field1106, var13.field1065);
							} else {
								ANTOHTCU.method18(var11, var13.field1106, var29, var13.field1065, var12);
							}
						} else if (var13.field1053) {
							ANTOHTCU.method16(var11, 256 - (var13.field1097 & 0xFF), var13.field1106, var13.field1065, var29, var12);
						} else {
							ANTOHTCU.method19(var11, var13.field1065, 256 - (var13.field1097 & 0xFF), var13.field1106, var29, var12);
						}
					} else if (var13.field1077 == 4) {
						XQKSIEVT var30 = var13.field1088;
						String var31 = var13.field1107;
						boolean var32 = false;
						if (field266 == var13.field1059 || field159 == var13.field1059 || field450 == var13.field1059) {
							var32 = true;
						}

						int var33;
						if (method128(var13)) {
							var33 = var13.field1039;
							if (var32 && var13.field1082 != 0) {
								var33 = var13.field1082;
							}

							if (var13.field1061.length() > 0) {
								var31 = var13.field1061;
							}
						} else {
							var33 = var13.field1040;
							if (var32 && var13.field1047 != 0) {
								var33 = var13.field1047;
							}
						}

						if (var13.field1074 == 6 && field512) {
							var31 = "Please wait...";
							var33 = var13.field1040;
						}

						if (ANTOHTCU.field49 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1357 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method121(method180(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method121(method180(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method121(method180(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method121(method180(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method121(method180(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1099) {
								var30.method482(var41, var33, var13.field1105, var13.field1106 / 2 + var11, var34);
							} else {
								var30.method489(var13.field1105, var11, var33, var34, var41);
							}

							var34 += var30.field1357;
						}
					} else if (var13.field1077 == 5) {
						TFHGRYAS var42;
						if (method128(var13)) {
							var42 = var13.field1042;
						} else {
							var42 = var13.field1058;
						}

						if (var42 != null) {
							var42.method424(var11, var12);
						}
					} else if (var13.field1077 == 6) {
						int var43 = PTUBVHCT.field982;
						int var44 = PTUBVHCT.field983;
						PTUBVHCT.field982 = var13.field1106 / 2 + var11;
						PTUBVHCT.field983 = var13.field1065 / 2 + var12;
						int var45 = PTUBVHCT.field986[var13.field1084] * var13.field1083 >> 16;
						int var46 = PTUBVHCT.field987[var13.field1084] * var13.field1083 >> 16;
						boolean var47 = method128(var13);
						int var48;
						if (var47) {
							var48 = var13.field1067;
						} else {
							var48 = var13.field1066;
						}

						IEHKDFMR var49;
						if (var48 == -1) {
							var49 = var13.method381(-1, var47, -1);
						} else {
							VYXELYSX var50 = VYXELYSX.field1273[var48];
							var49 = var13.method381(var50.field1276[var13.field1054], var47, var50.field1275[var13.field1054]);
						}

						if (var49 != null) {
							var49.method288(0, var13.field1085, 0, var13.field1084, 0, var45, var46);
						}

						PTUBVHCT.field982 = var43;
						PTUBVHCT.field983 = var44;
					} else {
						if (var13.field1077 == 7) {
							XQKSIEVT var51 = var13.field1088;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1065; var53++) {
								for (int var54 = 0; var54 < var13.field1106; var54++) {
									if (var13.field1111[var52] > 0) {
										VXCJHHIE var55 = VXCJHHIE.method447(var13.field1111[var52] - 1);
										String var56 = String.valueOf(var55.field1250);
										if (var55.field1253 || var13.field1041[var52] != 1) {
											var56 = var56 + " x" + method66(var13.field1041[var52]);
										}

										int var57 = (var13.field1046 + 115) * var54 + var11;
										int var58 = (var13.field1044 + 12) * var53 + var12;
										if (var13.field1099) {
											var51.method482(var56, var13.field1040, var13.field1105, var13.field1106 / 2 + var57, var58);
										} else {
											var51.method489(var13.field1105, var57, var13.field1040, var58, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1077 == 8 && (field291 == var13.field1059 || field161 == var13.field1059 || field412 == var13.field1059) && field553 == 100) {
							int var59 = 0;
							int var60 = 0;
							XQKSIEVT var61 = field128;
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

								int var65 = var61.method483(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1357 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1106 + var11 - var59 - 5;
							int var67 = var13.field1065 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field1106 + arg0) {
								var66 = arg1.field1106 + arg0 - var59;
							}

							if (var60 + var67 > arg1.field1065 + arg2) {
								var67 = arg1.field1065 + arg2 - var60;
							}

							ANTOHTCU.method17(var66, var67, 0xFFFFA0, var59, var60);
							ANTOHTCU.method18(var66, var59, 0, var60, var67);
							String var68 = var13.field1107;
							int var69 = var61.field1357 + var67 + 2;
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

								var61.method489(false, var66 + 3, 0, var69, var71);
								var69 += var61.field1357 + 1;
							}
						}
					}
				}
			}

			ANTOHTCU.method14(var7, var6, var8, var5);
		}
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method184(long arg0) {
		if (arg0 != 0L) {
			if (field298 >= 100 && field489 != 1) {
				method79("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field298 >= 200) {
				method79("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = WAQVJSXE.method465(WAQVJSXE.method462(arg0));
				for (int var4 = 0; var4 < field298; var4++) {
					if (field335[var4] == arg0) {
						method79(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field523; var5++) {
					if (field237[var5] == arg0) {
						method79("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field554.field1396)) {
					field183[field298] = var3;
					field335[field298] = arg0;
					field251[field298] = 0;
					field298++;
					field312 = true;
					field165.method206(217);
					field165.method213(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method185(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method185(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method186(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field492[var4] != null) {
				int var5 = field490[var4];
				int var6 = field333 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field491[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field378 == 0 || field378 == 1 && method107(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field554.field1396)) {
						if (field379 >= 1) {
							field296[field375] = "Report abuse @whi@" + var7;
							field467[field375] = 265;
							field375++;
						}

						field296[field375] = "Add ignore @whi@" + var7;
						field467[field375] = 723;
						field375++;
						field296[field375] = "Add friend @whi@" + var7;
						field467[field375] = 66;
						field375++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field197 == 0 && (var5 == 7 || field143 == 0 || field143 == 1 && method107(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field379 >= 1) {
							field296[field375] = "Report abuse @whi@" + var7;
							field467[field375] = 265;
							field375++;
						}

						field296[field375] = "Add ignore @whi@" + var7;
						field467[field375] = 723;
						field375++;
						field296[field375] = "Add friend @whi@" + var7;
						field467[field375] = 66;
						field375++;
					}

					var3++;
				}

				if (var5 == 4 && (field273 == 0 || field273 == 1 && method107(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field296[field375] = "Accept trade @whi@" + var7;
						field467[field375] = 301;
						field375++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field197 == 0 && field143 < 2) {
					var3++;
				}

				if (var5 == 8 && (field273 == 0 || field273 == 1 && method107(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field296[field375] = "Accept challenge @whi@" + var7;
						field467[field375] = 769;
						field375++;
					}

					var3++;
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
			field213[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field323[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
