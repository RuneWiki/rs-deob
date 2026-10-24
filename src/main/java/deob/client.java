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
public final class client extends NCIKLCII {

	@ObfuscatedName("client.N")
	public String[] field99 = new String[500];

	@ObfuscatedName("client.O")
	public int field100 = -1;

	@ObfuscatedName("client.P")
	public int field101 = -1;

	@ObfuscatedName("client.Q")
	public byte[] field102 = new byte[16384];

	@ObfuscatedName("client.R")
	public int[] field103 = new int[9];

	@ObfuscatedName("client.V")
	public boolean field106 = false;

	@ObfuscatedName("client.X")
	public boolean field107 = false;

	@ObfuscatedName("client.Z")
	public TPIBHECB[] field109 = new TPIBHECB[20];

	@ObfuscatedName("client.kb")
	public TPIBHECB[] field119 = new TPIBHECB[32];

	@ObfuscatedName("client.ob")
	public int field123 = -1;

	@ObfuscatedName("client.rb")
	public CMGGUSPR field126 = new CMGGUSPR(new byte[5000]);

	@ObfuscatedName("client.sb")
	public IGOBKPZP[] field127 = new IGOBKPZP[16384];

	@ObfuscatedName("client.ub")
	public int[] field129 = new int[16384];

	@ObfuscatedName("client.zb")
	public int[] field132 = new int[2000];

	@ObfuscatedName("client.Db")
	public int field136 = 50;

	@ObfuscatedName("client.Eb")
	public int[] field137 = new int[field136];

	@ObfuscatedName("client.Fb")
	public int[] field138 = new int[field136];

	@ObfuscatedName("client.Gb")
	public int[] field139 = new int[field136];

	@ObfuscatedName("client.Hb")
	public int[] field140 = new int[field136];

	@ObfuscatedName("client.Ib")
	public int[] field141 = new int[field136];

	@ObfuscatedName("client.Jb")
	public int[] field142 = new int[field136];

	@ObfuscatedName("client.Kb")
	public int[] field143 = new int[field136];

	@ObfuscatedName("client.Lb")
	public String[] field144 = new String[field136];

	@ObfuscatedName("client.Rb")
	public int field148 = 1;

	@ObfuscatedName("client.Wb")
	public volatile boolean field151 = false;

	@ObfuscatedName("client.Xb")
	public int[] field152 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Yb")
	public int[] field153 = new int[151];

	@ObfuscatedName("client.Zb")
	public int field154 = 0x332D25;

	@ObfuscatedName("client.gc")
	public TPIBHECB[] field160 = new TPIBHECB[32];

	@ObfuscatedName("client.ic")
	public int[] field162 = new int[DUAHSVYY.field570];

	@ObfuscatedName("client.jc")
	public int field163 = 0x4D4233;

	@ObfuscatedName("client.rc")
	public String[] field170 = new String[200];

	@ObfuscatedName("client.uc")
	public int[] field172 = new int[50];

	@ObfuscatedName("client.vc")
	public boolean field173 = false;

	@ObfuscatedName("client.Fc")
	public CMGGUSPR field181 = CMGGUSPR.method182(1);

	@ObfuscatedName("client.Mc")
	public int[][] field187 = new int[104][104];

	@ObfuscatedName("client.Pc")
	public int[] field190 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Tc")
	public WCVCMGLX field192 = new WCVCMGLX();

	@ObfuscatedName("client.Uc")
	public int field193 = 2048;

	@ObfuscatedName("client.Vc")
	public int field194 = 2047;

	@ObfuscatedName("client.Wc")
	public MDBQGDOL[] field195 = new MDBQGDOL[field193];

	@ObfuscatedName("client.Yc")
	public int[] field197 = new int[field193];

	@ObfuscatedName("client.ad")
	public int[] field199 = new int[field193];

	@ObfuscatedName("client.bd")
	public CMGGUSPR[] field200 = new CMGGUSPR[field193];

	@ObfuscatedName("client.dd")
	public int field202 = 78;

	@ObfuscatedName("client.qd")
	public OCPHNIUN[] field213 = new OCPHNIUN[100];

	@ObfuscatedName("client.sd")
	public int[] field215 = new int[5];

	@ObfuscatedName("client.zd")
	public boolean field221 = true;

	@ObfuscatedName("client.Bd")
	public int field223 = -1;

	@ObfuscatedName("client.Dd")
	public int field225 = 2;

	@ObfuscatedName("client.Ed")
	public int[] field226 = new int[2000];

	@ObfuscatedName("client.Fd")
	public int[][][] field227 = new int[4][13][13];

	@ObfuscatedName("client.Gd")
	public boolean field228 = false;

	@ObfuscatedName("client.Id")
	public OCPHNIUN[] field229 = new OCPHNIUN[13];

	@ObfuscatedName("client.Jd")
	public int[] field230 = new int[5];

	@ObfuscatedName("client.Ld")
	public int[] field232 = new int[1000];

	@ObfuscatedName("client.Md")
	public int[] field233 = new int[500];

	@ObfuscatedName("client.Nd")
	public int[] field234 = new int[500];

	@ObfuscatedName("client.Od")
	public int[] field235 = new int[500];

	@ObfuscatedName("client.Pd")
	public int[] field236 = new int[500];

	@ObfuscatedName("client.Sd")
	public boolean field237 = false;

	@ObfuscatedName("client.Td")
	public int[] field238 = new int[DUAHSVYY.field570];

	@ObfuscatedName("client.Wd")
	public int[] field241 = new int[1000];

	@ObfuscatedName("client.Xd")
	public int[] field242 = new int[1000];

	@ObfuscatedName("client.ge")
	public CMGGUSPR field251 = CMGGUSPR.method182(1);

	@ObfuscatedName("client.ie")
	public int[] field253 = new int[256];

	@ObfuscatedName("client.je")
	public int[] field254 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.te")
	public int[] field264 = new int[151];

	@ObfuscatedName("client.Ee")
	public int[] field274 = new int[50];

	@ObfuscatedName("client.He")
	public boolean field277 = false;

	@ObfuscatedName("client.Ke")
	public int field280 = 2;

	@ObfuscatedName("client.Le")
	public VLOWRGUJ[] field281 = new VLOWRGUJ[4];

	@ObfuscatedName("client.Me")
	public final int[] field282 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ne")
	public String field283 = "";

	@ObfuscatedName("client.Te")
	public CMGGUSPR field288 = CMGGUSPR.method182(1);

	@ObfuscatedName("client.Ue")
	public String field289 = "";

	@ObfuscatedName("client.We")
	public boolean field291 = false;

	@ObfuscatedName("client.Xe")
	public int[] field292 = new int[50];

	@ObfuscatedName("client.af")
	public int[] field293 = new int[5];

	@ObfuscatedName("client.cf")
	public int field295 = -1;

	@ObfuscatedName("client.lf")
	public String field301 = "";

	@ObfuscatedName("client.wf")
	public boolean field311 = false;

	@ObfuscatedName("client.Bf")
	public boolean field315 = false;

	@ObfuscatedName("client.Cf")
	public int field316 = -1;

	@ObfuscatedName("client.Df")
	public int field317 = -1;

	@ObfuscatedName("client.Gf")
	public int field319 = -1;

	@ObfuscatedName("client.Hf")
	public WJQTPVDG field320 = new WJQTPVDG();

	@ObfuscatedName("client.Vf")
	public boolean field332 = true;

	@ObfuscatedName("client.Yf")
	public int field334 = 0x23201B;

	@ObfuscatedName("client.bg")
	public int[] field336 = new int[7];

	@ObfuscatedName("client.ig")
	public int[][] field340 = new int[104][104];

	@ObfuscatedName("client.jg")
	public int field341 = 128;

	@ObfuscatedName("client.pg")
	public TPIBHECB[] field347 = new TPIBHECB[1000];

	@ObfuscatedName("client.rg")
	public String field348 = "";

	@ObfuscatedName("client.sg")
	public String field349 = "";

	@ObfuscatedName("client.tg")
	public boolean field350 = true;

	@ObfuscatedName("client.Mg")
	public boolean field366 = false;

	@ObfuscatedName("client.Tg")
	public boolean field373 = false;

	@ObfuscatedName("client.Ug")
	public long[] field374 = new long[200];

	@ObfuscatedName("client.Vg")
	public String field375 = "";

	@ObfuscatedName("client.Wg")
	public int[] field376 = new int[200];

	@ObfuscatedName("client.Yg")
	public String field378 = "";

	@ObfuscatedName("client.ah")
	public String[] field380 = new String[100];

	@ObfuscatedName("client.bh")
	public int[] field381 = new int[100];

	@ObfuscatedName("client.dh")
	public boolean field383 = false;

	@ObfuscatedName("client.eh")
	public WCVCMGLX field384 = new WCVCMGLX();

	@ObfuscatedName("client.gh")
	public int[] field386 = new int[100];

	@ObfuscatedName("client.hh")
	public String[] field387 = new String[100];

	@ObfuscatedName("client.ih")
	public String[] field388 = new String[100];

	@ObfuscatedName("client.nh")
	public String field393 = "";

	@ObfuscatedName("client.ph")
	public boolean field395 = false;

	@ObfuscatedName("client.rh")
	public int field396 = 3;

	@ObfuscatedName("client.uh")
	public int field399 = -1;

	@ObfuscatedName("client.wh")
	public int field401 = 1;

	@ObfuscatedName("client.Ah")
	public boolean field405 = false;

	@ObfuscatedName("client.Bh")
	public long[] field406 = new long[100];

	@ObfuscatedName("client.Ch")
	public int[] field407 = new int[DUAHSVYY.field570];

	@ObfuscatedName("client.Dh")
	public int field408 = -1;

	@ObfuscatedName("client.Gh")
	public String[] field410 = new String[5];

	@ObfuscatedName("client.Hh")
	public boolean[] field411 = new boolean[5];

	@ObfuscatedName("client.Jh")
	public boolean field413 = false;

	@ObfuscatedName("client.Kh")
	public int field414 = -1;

	@ObfuscatedName("client.Lh")
	public OCPHNIUN[] field415 = new OCPHNIUN[2];

	@ObfuscatedName("client.Ph")
	public boolean field419 = false;

	@ObfuscatedName("client.Qh")
	public int[] field420 = new int[5];

	@ObfuscatedName("client.ai")
	public boolean field430 = false;

	@ObfuscatedName("client.ci")
	public TPIBHECB[] field432 = new TPIBHECB[100];

	@ObfuscatedName("client.hi")
	public boolean field436 = false;

	@ObfuscatedName("client.ni")
	public volatile boolean field441 = false;

	@ObfuscatedName("client.oi")
	public volatile boolean field442 = false;

	@ObfuscatedName("client.qi")
	public int field443 = 0x766654;

	@ObfuscatedName("client.ui")
	public int field446 = 2;

	@ObfuscatedName("client.yi")
	public int field450 = -1;

	@ObfuscatedName("client.Ai")
	public int[] field452 = new int[33];

	@ObfuscatedName("client.Ci")
	public TPIBHECB[] field454 = new TPIBHECB[32];

	@ObfuscatedName("client.Fi")
	public int[] field456 = new int[4000];

	@ObfuscatedName("client.Gi")
	public int[] field457 = new int[4000];

	@ObfuscatedName("client.Ii")
	public boolean field458 = false;

	@ObfuscatedName("client.Yi")
	public boolean field472 = true;

	@ObfuscatedName("client.aj")
	public boolean field473 = false;

	@ObfuscatedName("client.bj")
	public final int field474 = 100;

	@ObfuscatedName("client.cj")
	public int[] field475 = new int[100];

	@ObfuscatedName("client.fj")
	public boolean[] field477 = new boolean[5];

	@ObfuscatedName("client.jj")
	public TPIBHECB[] field480 = new TPIBHECB[8];

	@ObfuscatedName("client.kj")
	public int[] field481 = new int[33];

	@ObfuscatedName("client.qj")
	public int[][] field487 = new int[104][104];

	@ObfuscatedName("client.rj")
	public int[] field488 = new int[5];

	@ObfuscatedName("client.Cj")
	public WCVCMGLX field499 = new WCVCMGLX();

	@ObfuscatedName("client.Ej")
	public boolean field501 = false;

	@ObfuscatedName("client.Fj")
	public CRC32 field502 = new CRC32();

	@ObfuscatedName("client.Mj")
	public int field508 = -1;

	@ObfuscatedName("client.Rj")
	public boolean field513 = false;

	@ObfuscatedName("client.ck")
	public int field520 = -1;

	@ObfuscatedName("client.fk")
	public JJRYTWDH[] field522 = new JJRYTWDH[5];

	@ObfuscatedName("client.mk")
	public int field528 = -1;

	@ObfuscatedName("client.sk")
	public boolean field534 = true;

	@ObfuscatedName("client.tk")
	public String field535 = "";

	@ObfuscatedName("client.uk")
	public String field536 = "";

	@ObfuscatedName("client.vk")
	public WCVCMGLX[][][] field537 = new WCVCMGLX[4][104][104];

	@ObfuscatedName("client.wk")
	public int field538 = -1;

	@ObfuscatedName("client.qc")
	public static final int[][] field169 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Zd")
	public static int field244 = 10;

	@ObfuscatedName("client.be")
	public static boolean field246 = true;

	@ObfuscatedName("client.zf")
	public static BigInteger field314 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ff")
	public static int[] field318 = new int[99];

	@ObfuscatedName("client.Xf")
	public static String field333 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.og")
	public static int[] field346 = new int[32];

	@ObfuscatedName("client.pj")
	public static final int[] field486 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.wj")
	public static BigInteger field493 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.S")
	public int field104;

	@ObfuscatedName("client.ab")
	public int field110;

	@ObfuscatedName("client.cb")
	public static int field111;

	@ObfuscatedName("client.hb")
	public int field116;

	@ObfuscatedName("client.ib")
	public int field117;

	@ObfuscatedName("client.jb")
	public int field118;

	@ObfuscatedName("client.lb")
	public int field120;

	@ObfuscatedName("client.mb")
	public int field121;

	@ObfuscatedName("client.nb")
	public int field122;

	@ObfuscatedName("client.pb")
	public int field124;

	@ObfuscatedName("client.tb")
	public int field128;

	@ObfuscatedName("client.wb")
	public static int field130;

	@ObfuscatedName("client.Bb")
	public int field134;

	@ObfuscatedName("client.Cb")
	public int field135;

	@ObfuscatedName("client.Ob")
	public int field146;

	@ObfuscatedName("client.Qb")
	public int field147;

	@ObfuscatedName("client.Ub")
	public int field149;

	@ObfuscatedName("client.Vb")
	public int field150;

	@ObfuscatedName("client.bc")
	public int field155;

	@ObfuscatedName("client.cc")
	public int field156;

	@ObfuscatedName("client.dc")
	public int field157;

	@ObfuscatedName("client.ec")
	public int field158;

	@ObfuscatedName("client.fc")
	public int field159;

	@ObfuscatedName("client.hc")
	public static int field161;

	@ObfuscatedName("client.kc")
	public static int field164;

	@ObfuscatedName("client.wc")
	public int field174;

	@ObfuscatedName("client.Ec")
	public int field180;

	@ObfuscatedName("client.Gc")
	public int field182;

	@ObfuscatedName("client.Nc")
	public int field188;

	@ObfuscatedName("client.Oc")
	public int field189;

	@ObfuscatedName("client.Xc")
	public int field196;

	@ObfuscatedName("client.Zc")
	public int field198;

	@ObfuscatedName("client.cd")
	public int field201;

	@ObfuscatedName("client.ed")
	public int field203;

	@ObfuscatedName("client.fd")
	public int field204;

	@ObfuscatedName("client.gd")
	public int field205;

	@ObfuscatedName("client.hd")
	public int field206;

	@ObfuscatedName("client.id")
	public int field207;

	@ObfuscatedName("client.jd")
	public int field208;

	@ObfuscatedName("client.pd")
	public int field212;

	@ObfuscatedName("client.rd")
	public int field214;

	@ObfuscatedName("client.yd")
	public int field220;

	@ObfuscatedName("client.Ad")
	public int field222;

	@ObfuscatedName("client.Cd")
	public int field224;

	@ObfuscatedName("client.Kd")
	public int field231;

	@ObfuscatedName("client.Ud")
	public static int field239;

	@ObfuscatedName("client.Vd")
	public int field240;

	@ObfuscatedName("client.Yd")
	public int field243;

	@ObfuscatedName("client.ae")
	public static int field245;

	@ObfuscatedName("client.fe")
	public static int field250;

	@ObfuscatedName("client.he")
	public static int field252;

	@ObfuscatedName("client.ue")
	public int field265;

	@ObfuscatedName("client.ve")
	public int field266;

	@ObfuscatedName("client.we")
	public int field267;

	@ObfuscatedName("client.xe")
	public int field268;

	@ObfuscatedName("client.ze")
	public int field270;

	@ObfuscatedName("client.Ae")
	public int field271;

	@ObfuscatedName("client.De")
	public int field273;

	@ObfuscatedName("client.Fe")
	public static int field275;

	@ObfuscatedName("client.Ie")
	public int field278;

	@ObfuscatedName("client.Je")
	public int field279;

	@ObfuscatedName("client.Pe")
	public int field284;

	@ObfuscatedName("client.Qe")
	public int field285;

	@ObfuscatedName("client.Ve")
	public int field290;

	@ObfuscatedName("client.bf")
	public static int field294;

	@ObfuscatedName("client.ef")
	public int field296;

	@ObfuscatedName("client.ff")
	public int field297;

	@ObfuscatedName("client.gf")
	public int field298;

	@ObfuscatedName("client.nf")
	public int field302;

	@ObfuscatedName("client.qf")
	public int field305;

	@ObfuscatedName("client.rf")
	public int field306;

	@ObfuscatedName("client.sf")
	public int field307;

	@ObfuscatedName("client.xf")
	public int field312;

	@ObfuscatedName("client.yf")
	public int field313;

	@ObfuscatedName("client.If")
	public int field321;

	@ObfuscatedName("client.Kf")
	public static int field322;

	@ObfuscatedName("client.Lf")
	public int field323;

	@ObfuscatedName("client.Mf")
	public int field324;

	@ObfuscatedName("client.Nf")
	public int field325;

	@ObfuscatedName("client.Of")
	public int field326;

	@ObfuscatedName("client.Pf")
	public int field327;

	@ObfuscatedName("client.Qf")
	public int field328;

	@ObfuscatedName("client.Rf")
	public int field329;

	@ObfuscatedName("client.Tf")
	public int field330;

	@ObfuscatedName("client.Uf")
	public int field331;

	@ObfuscatedName("client.dg")
	public int field337;

	@ObfuscatedName("client.eg")
	public int field338;

	@ObfuscatedName("client.hg")
	public static int field339;

	@ObfuscatedName("client.kg")
	public int field342;

	@ObfuscatedName("client.lg")
	public int field343;

	@ObfuscatedName("client.mg")
	public int field344;

	@ObfuscatedName("client.ng")
	public int field345;

	@ObfuscatedName("client.ug")
	public int field351;

	@ObfuscatedName("client.Ig")
	public int field362;

	@ObfuscatedName("client.Jg")
	public int field363;

	@ObfuscatedName("client.Kg")
	public int field364;

	@ObfuscatedName("client.Lg")
	public int field365;

	@ObfuscatedName("client.Ng")
	public int field367;

	@ObfuscatedName("client.Zg")
	public int field379;

	@ObfuscatedName("client.ch")
	public int field382;

	@ObfuscatedName("client.jh")
	public int field389;

	@ObfuscatedName("client.kh")
	public int field390;

	@ObfuscatedName("client.lh")
	public int field391;

	@ObfuscatedName("client.mh")
	public int field392;

	@ObfuscatedName("client.oh")
	public int field394;

	@ObfuscatedName("client.sh")
	public int field397;

	@ObfuscatedName("client.vh")
	public int field400;

	@ObfuscatedName("client.xh")
	public static int field402;

	@ObfuscatedName("client.zh")
	public static int field404;

	@ObfuscatedName("client.Fh")
	public int field409;

	@ObfuscatedName("client.Ih")
	public int field412;

	@ObfuscatedName("client.Mh")
	public int field416;

	@ObfuscatedName("client.Nh")
	public int field417;

	@ObfuscatedName("client.Oh")
	public int field418;

	@ObfuscatedName("client.Vh")
	public int field425;

	@ObfuscatedName("client.ei")
	public int field433;

	@ObfuscatedName("client.fi")
	public int field434;

	@ObfuscatedName("client.gi")
	public int field435;

	@ObfuscatedName("client.ii")
	public static int field437;

	@ObfuscatedName("client.li")
	public int field439;

	@ObfuscatedName("client.mi")
	public int field440;

	@ObfuscatedName("client.ri")
	public int field444;

	@ObfuscatedName("client.ti")
	public int field445;

	@ObfuscatedName("client.Ei")
	public int field455;

	@ObfuscatedName("client.Ni")
	public int field463;

	@ObfuscatedName("client.Oi")
	public int field464;

	@ObfuscatedName("client.Qi")
	public int field465;

	@ObfuscatedName("client.Ri")
	public int field466;

	@ObfuscatedName("client.Si")
	public int field467;

	@ObfuscatedName("client.Ti")
	public int field468;

	@ObfuscatedName("client.Ui")
	public int field469;

	@ObfuscatedName("client.Wi")
	public int field470;

	@ObfuscatedName("client.Xi")
	public int field471;

	@ObfuscatedName("client.ej")
	public int field476;

	@ObfuscatedName("client.gj")
	public int field478;

	@ObfuscatedName("client.hj")
	public int field479;

	@ObfuscatedName("client.lj")
	public int field482;

	@ObfuscatedName("client.mj")
	public int field483;

	@ObfuscatedName("client.nj")
	public int field484;

	@ObfuscatedName("client.oj")
	public int field485;

	@ObfuscatedName("client.sj")
	public int field489;

	@ObfuscatedName("client.tj")
	public int field490;

	@ObfuscatedName("client.uj")
	public int field491;

	@ObfuscatedName("client.vj")
	public int field492;

	@ObfuscatedName("client.xj")
	public int field494;

	@ObfuscatedName("client.yj")
	public int field495;

	@ObfuscatedName("client.zj")
	public int field496;

	@ObfuscatedName("client.Aj")
	public int field497;

	@ObfuscatedName("client.Bj")
	public int field498;

	@ObfuscatedName("client.Dj")
	public int field500;

	@ObfuscatedName("client.Gj")
	public int field503;

	@ObfuscatedName("client.Hj")
	public int field504;

	@ObfuscatedName("client.Ij")
	public int field505;

	@ObfuscatedName("client.Jj")
	public int field506;

	@ObfuscatedName("client.Kj")
	public int field507;

	@ObfuscatedName("client.Nj")
	public int field509;

	@ObfuscatedName("client.Oj")
	public int field510;

	@ObfuscatedName("client.Qj")
	public int field512;

	@ObfuscatedName("client.Tj")
	public int field514;

	@ObfuscatedName("client.Uj")
	public int field515;

	@ObfuscatedName("client.Vj")
	public int field516;

	@ObfuscatedName("client.Wj")
	public int field517;

	@ObfuscatedName("client.Xj")
	public int field518;

	@ObfuscatedName("client.Yj")
	public int field519;

	@ObfuscatedName("client.dk")
	public int field521;

	@ObfuscatedName("client.jk")
	public int field525;

	@ObfuscatedName("client.M")
	public int field98;

	@ObfuscatedName("client.U")
	public long field105;

	@ObfuscatedName("client.Y")
	public long field108;

	@ObfuscatedName("client.Xg")
	public long field377;

	@ObfuscatedName("client.th")
	public long field398;

	@ObfuscatedName("client.zi")
	public long field451;

	@ObfuscatedName("client.Hc")
	public CWXRTTYV field183;

	@ObfuscatedName("client.Ic")
	public CWXRTTYV field184;

	@ObfuscatedName("client.Jc")
	public CWXRTTYV field185;

	@ObfuscatedName("client.Kc")
	public CWXRTTYV field186;

	@ObfuscatedName("client.kd")
	public IUZTBIWV field209;

	@ObfuscatedName("client.ld")
	public IUZTBIWV field210;

	@ObfuscatedName("client.md")
	public IUZTBIWV field211;

	@ObfuscatedName("client.ke")
	public IUZTBIWV field255;

	@ObfuscatedName("client.le")
	public IUZTBIWV field256;

	@ObfuscatedName("client.me")
	public IUZTBIWV field257;

	@ObfuscatedName("client.ne")
	public IUZTBIWV field258;

	@ObfuscatedName("client.oe")
	public IUZTBIWV field259;

	@ObfuscatedName("client.pe")
	public IUZTBIWV field260;

	@ObfuscatedName("client.qe")
	public IUZTBIWV field261;

	@ObfuscatedName("client.re")
	public IUZTBIWV field262;

	@ObfuscatedName("client.se")
	public IUZTBIWV field263;

	@ObfuscatedName("client.xg")
	public IUZTBIWV field353;

	@ObfuscatedName("client.yg")
	public IUZTBIWV field354;

	@ObfuscatedName("client.zg")
	public IUZTBIWV field355;

	@ObfuscatedName("client.Ag")
	public IUZTBIWV field356;

	@ObfuscatedName("client.Bg")
	public IUZTBIWV field357;

	@ObfuscatedName("client.Cg")
	public IUZTBIWV field358;

	@ObfuscatedName("client.Dg")
	public IUZTBIWV field359;

	@ObfuscatedName("client.Eg")
	public IUZTBIWV field360;

	@ObfuscatedName("client.Fg")
	public IUZTBIWV field361;

	@ObfuscatedName("client.Ji")
	public IUZTBIWV field459;

	@ObfuscatedName("client.Ki")
	public IUZTBIWV field460;

	@ObfuscatedName("client.Li")
	public IUZTBIWV field461;

	@ObfuscatedName("client.Mi")
	public IUZTBIWV field462;

	@ObfuscatedName("client.ag")
	public static MDBQGDOL field335;

	@ObfuscatedName("client.db")
	public OCPHNIUN field112;

	@ObfuscatedName("client.eb")
	public OCPHNIUN field113;

	@ObfuscatedName("client.nc")
	public OCPHNIUN field166;

	@ObfuscatedName("client.oc")
	public OCPHNIUN field167;

	@ObfuscatedName("client.pc")
	public OCPHNIUN field168;

	@ObfuscatedName("client.xc")
	public OCPHNIUN field175;

	@ObfuscatedName("client.yc")
	public OCPHNIUN field176;

	@ObfuscatedName("client.zc")
	public OCPHNIUN field177;

	@ObfuscatedName("client.Ac")
	public OCPHNIUN field178;

	@ObfuscatedName("client.Bc")
	public OCPHNIUN field179;

	@ObfuscatedName("client.td")
	public OCPHNIUN field216;

	@ObfuscatedName("client.ud")
	public OCPHNIUN field217;

	@ObfuscatedName("client.tf")
	public OCPHNIUN field308;

	@ObfuscatedName("client.uf")
	public OCPHNIUN field309;

	@ObfuscatedName("client.vf")
	public OCPHNIUN field310;

	@ObfuscatedName("client.Og")
	public OCPHNIUN field368;

	@ObfuscatedName("client.Pg")
	public OCPHNIUN field369;

	@ObfuscatedName("client.Qg")
	public OCPHNIUN field370;

	@ObfuscatedName("client.Rg")
	public OCPHNIUN field371;

	@ObfuscatedName("client.Sg")
	public OCPHNIUN field372;

	@ObfuscatedName("client.yh")
	public RYDUASDW field403;

	@ObfuscatedName("client.Pj")
	public TCDQXHKB field511;

	@ObfuscatedName("client.Ab")
	public TPIBHECB field133;

	@ObfuscatedName("client.Nb")
	public TPIBHECB field145;

	@ObfuscatedName("client.de")
	public TPIBHECB field248;

	@ObfuscatedName("client.ee")
	public TPIBHECB field249;

	@ObfuscatedName("client.Be")
	public TPIBHECB field272;

	@ObfuscatedName("client.Re")
	public TPIBHECB field286;

	@ObfuscatedName("client.Se")
	public TPIBHECB field287;

	@ObfuscatedName("client.ki")
	public TPIBHECB field438;

	@ObfuscatedName("client.hk")
	public TPIBHECB field523;

	@ObfuscatedName("client.ik")
	public TPIBHECB field524;

	@ObfuscatedName("client.nk")
	public TPIBHECB field529;

	@ObfuscatedName("client.ok")
	public TPIBHECB field530;

	@ObfuscatedName("client.pk")
	public TPIBHECB field531;

	@ObfuscatedName("client.qk")
	public TPIBHECB field532;

	@ObfuscatedName("client.rk")
	public TPIBHECB field533;

	@ObfuscatedName("client.kk")
	public UCDUMMGN field526;

	@ObfuscatedName("client.Qc")
	public UUIGNTAD field191;

	@ObfuscatedName("client.jf")
	public UUQNASSN field300;

	@ObfuscatedName("client.fh")
	public YIKMTKBL field385;

	@ObfuscatedName("client.fb")
	public String field114;

	@ObfuscatedName("client.ye")
	public String field269;

	@ObfuscatedName("client.hf")
	public String field299;

	@ObfuscatedName("client.lk")
	public String field527;

	@ObfuscatedName("client.gb")
	public Socket field115;

	@ObfuscatedName("client.yb")
	public static boolean field131;

	@ObfuscatedName("client.sc")
	public static boolean field171;

	@ObfuscatedName("client.ce")
	public static boolean field247;

	@ObfuscatedName("client.vg")
	public static boolean field352;

	@ObfuscatedName("client.wd")
	public int[] field218;

	@ObfuscatedName("client.xd")
	public int[] field219;

	@ObfuscatedName("client.of")
	public int[] field303;

	@ObfuscatedName("client.pf")
	public int[] field304;

	@ObfuscatedName("client.Rh")
	public int[] field421;

	@ObfuscatedName("client.Sh")
	public int[] field422;

	@ObfuscatedName("client.Th")
	public int[] field423;

	@ObfuscatedName("client.Uh")
	public int[] field424;

	@ObfuscatedName("client.Wh")
	public int[] field426;

	@ObfuscatedName("client.Xh")
	public int[] field427;

	@ObfuscatedName("client.Yh")
	public int[] field428;

	@ObfuscatedName("client.Zh")
	public int[] field429;

	@ObfuscatedName("client.vi")
	public int[] field447;

	@ObfuscatedName("client.wi")
	public int[] field448;

	@ObfuscatedName("client.xi")
	public int[] field449;

	@ObfuscatedName("client.Bi")
	public OCPHNIUN[] field453;

	@ObfuscatedName("client.qb")
	public byte[][] field125;

	@ObfuscatedName("client.Ge")
	public byte[][] field276;

	@ObfuscatedName("client.lc")
	public byte[][][] field165;

	@ObfuscatedName("client.bi")
	public int[][][] field431;

	@ObfuscatedName("client.a(II)V")
	public final void method35(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIZI)Z")
	public final boolean method36(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field511.method478(field440, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			YJMLCFGC var8 = YJMLCFGC.method596(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1469;
				var10 = var8.field1479;
			} else {
				var9 = var8.field1479;
				var10 = var8.field1469;
			}

			int var11 = var8.field1451;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method92(field335.field1098[0], arg0, 2, var10, var9, arg2, 0, var11, field335.field1097[0], 0, false);
		} else {
			method92(field335.field1098[0], arg0, 2, 0, 0, arg2, var7, 0, field335.field1097[0], var6 + 1, false);
		}

		field489 = field952;
		field490 = field953;
		field492 = 2;
		field491 = 0;
		return true;
	}

	@ObfuscatedName("client.c(Z)Ljava/lang/String;")
	public final String method37() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field940 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method38() {
		if (field118 == 2) {
			method131((field204 - field389 << 7) + field207, (field205 - field390 << 7) + field208, field206 * 2);

			if (field100 > -1 && field404 % 20 < 10) {
				field160[0].method507(field100 - 12, field101 - 28);
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method39(int arg0) {
		int var2 = ATZMJNZU.field16[arg0].field24;
		if (var2 != 0) {
			int var3 = field226[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					NQTCRWWR.method411(0.9D);
				}

				if (var3 == 2) {
					NQTCRWWR.method411(0.8D);
				}

				if (var3 == 3) {
					NQTCRWWR.method411(0.7D);
				}

				if (var3 == 4) {
					NQTCRWWR.method411(0.6D);
				}

				KIHBVNFV.field870.method301();
				field513 = true;
			}

			if (var2 == 3) {
				boolean var4 = field221;

				if (var3 == 0) {
					method162(0, field221);
					field221 = true;
				}

				if (var3 == 1) {
					method162(-400, field221);
					field221 = true;
				}

				if (var3 == 2) {
					method162(-800, field221);
					field221 = true;
				}

				if (var3 == 3) {
					method162(-1200, field221);
					field221 = true;
				}

				if (var3 == 4) {
					field221 = false;
				}

				if (field221 != var4 && !field247) {
					if (field221) {
						field471 = field316;
						field472 = true;
						field526.method540(2, field471);
					} else {
						method159();
					}

					field367 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field350 = true;
					method35(0);
				}

				if (var3 == 1) {
					field350 = true;
					method35(-400);
				}

				if (var3 == 2) {
					field350 = true;
					method35(-800);
				}

				if (var3 == 3) {
					field350 = true;
					method35(-1200);
				}

				if (var3 == 4) {
					field350 = false;
				}
			}

			if (var2 == 5) {
				field284 = var3;
			}

			if (var2 == 6) {
				field394 = var3;
			}

			if (var2 == 8) {
				field302 = var3;
				field473 = true;
			}

			if (var2 == 9) {
				field470 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method40() {
		if (field247 && field285 == 2 && IPCPGCKM.field765 != field440) {
			method57(null, "Loading - please wait.");
			field285 = 1;
			field451 = System.currentTimeMillis();
		}

		if (field285 == 1) {
			int var1 = method41();
			if (var1 != 0 && System.currentTimeMillis() - field451 > 360000L) {
				signlink.reporterror(field348 + " glcfb " + field105 + "," + var1 + "," + field247 + "," + field522[0] + "," + field526.method530() + "," + field440 + "," + field328 + "," + field329);
				field451 = System.currentTimeMillis();
			}
		}

		if (field285 == 2 && field440 != field408) {
			field408 = field440;
			method112(field440);
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method41() {
		for (int var1 = 0; var1 < field125.length; var1++) {
			if (field125[var1] == null && field448[var1] != -1) {
				return -1;
			}

			if (field276[var1] == null && field449[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field125.length; var3++) {
			byte[] var4 = field276[var3];
			if (var4 != null) {
				int var5 = (field447[var3] >> 8) * 64 - field389;
				int var6 = (field447[var3] & 0xFF) * 64 - field390;
				if (field430) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= IPCPGCKM.method310(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field291) {
			return -4;
		} else {
			field285 = 2;
			IPCPGCKM.field765 = field440;
			method58();
			field288.method183(55);
			return 0;
		}
	}

	@ObfuscatedName("client.a(LCMGGUSPR;BI)V")
	public final void method42(CMGGUSPR arg0, int arg1) {
		int var3 = arg0.method205(8);
		if (var3 < field196) {
			for (int var4 = var3; var4 < field196; var4++) {
				field232[field231++] = field197[var4];
			}
		}

		if (var3 > field196) {
			signlink.reporterror(field348 + " Too many players");
			throw new RuntimeException("eek");
		}

		field196 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field197[var5];
			MDBQGDOL var7 = field195[var6];
			int var8 = arg0.method205(1);
			if (var8 == 0) {
				field197[field196++] = var6;
				var7.field1115 = field404;
			} else {
				int var9 = arg0.method205(2);
				if (var9 == 0) {
					field197[field196++] = var6;
					var7.field1115 = field404;
					field199[field198++] = var6;
				} else if (var9 == 1) {
					field197[field196++] = var6;
					var7.field1115 = field404;
					int var10 = arg0.method205(3);
					var7.method440(var10, false);
					int var11 = arg0.method205(1);
					if (var11 == 1) {
						field199[field198++] = var6;
					}
				} else if (var9 == 2) {
					field197[field196++] = var6;
					var7.field1115 = field404;
					int var12 = arg0.method205(3);
					var7.method440(var12, true);
					int var13 = arg0.method205(3);
					var7.method440(var13, true);
					int var14 = arg0.method205(1);
					if (var14 == 1) {
						field199[field198++] = var6;
					}
				} else if (var9 == 3) {
					field232[field231++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method43(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.d(B)V")
	public final void method44() {
		field460.method327();

		if (field149 == 2) {
			byte[] var1 = field167.field982;
			int[] var2 = BAXODNVH.field31;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field438.method511(field342, 33, field481, 256, field452, 25, 33, 0, 0, 25);
			field461.method327();
			NQTCRWWR.field970 = field428;
		} else {
			int var5 = field342 + field279 & 0x7FF;
			int var6 = field335.field1110 / 32 + 48;
			int var7 = 464 - field335.field1111 / 32;
			field272.method511(var5, 146, field153, field400 + 256, field264, var7, 151, 5, 25, var6);
			field438.method511(field342, 33, field481, 256, field452, 25, 33, 0, 0, 25);

			for (int var8 = 0; var8 < field240; var8++) {
				int var9 = field241[var8] * 4 + 2 - field335.field1110 / 32;
				int var10 = field242[var8] * 4 + 2 - field335.field1111 / 32;
				method157(var9, var10, field347[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					WCVCMGLX var13 = field537[field440][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field335.field1110 / 32;
						int var15 = var12 * 4 + 2 - field335.field1111 / 32;
						method157(var14, var15, field529);
					}
				}
			}

			for (int var16 = 0; var16 < field128; var16++) {
				IGOBKPZP var17 = field127[field129[var16]];
				if (var17 != null && var17.method302()) {
					TQRZOVPP var18 = var17.field758;
					if (var18.field1231 != null) {
						var18 = var18.method515();
					}

					if (var18 != null && var18.field1258 && var18.field1242) {
						int var19 = var17.field1110 / 32 - field335.field1110 / 32;
						int var20 = var17.field1111 / 32 - field335.field1111 / 32;
						method157(var19, var20, field530);
					}
				}
			}

			for (int var21 = 0; var21 < field196; var21++) {
				MDBQGDOL var22 = field195[field197[var21]];
				if (var22 != null && var22.method302()) {
					int var23 = var22.field1110 / 32 - field335.field1110 / 32;
					int var24 = var22.field1111 / 32 - field335.field1111 / 32;
					boolean var25 = false;
					long var26 = ZLGGMMMS.method597(var22.field920);
					for (int var28 = 0; var28 < field509; var28++) {
						if (field374[var28] == var26 && field376[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field335.field907 != 0 && var22.field907 != 0 && field335.field907 == var22.field907) {
						var29 = true;
					}

					if (var25) {
						method157(var23, var24, field532);
					} else if (var29) {
						method157(var23, var24, field533);
					} else {
						method157(var23, var24, field531);
					}
				}
			}

			if (field118 != 0 && field404 % 20 < 10) {
				if (field118 == 1 && field222 >= 0 && field222 < field127.length) {
					IGOBKPZP var30 = field127[field222];
					if (var30 != null) {
						int var31 = var30.field1110 / 32 - field335.field1110 / 32;
						int var32 = var30.field1111 / 32 - field335.field1111 / 32;
						method86(var32, field249, var31);
					}
				}

				if (field118 == 2) {
					int var33 = (field204 - field389) * 4 + 2 - field335.field1110 / 32;
					int var34 = (field205 - field390) * 4 + 2 - field335.field1111 / 32;
					method86(var34, field249, var33);
				}

				if (field118 == 10 && field120 >= 0 && field120 < field195.length) {
					MDBQGDOL var35 = field195[field120];
					if (var35 != null) {
						int var36 = var35.field1110 / 32 - field335.field1110 / 32;
						int var37 = var35.field1111 / 32 - field335.field1111 / 32;
						method86(var37, field249, var36);
					}
				}
			}

			if (field270 != 0) {
				int var38 = field270 * 4 + 2 - field335.field1110 / 32;
				int var39 = field271 * 4 + 2 - field335.field1111 / 32;
				method157(var38, var39, field248);
			}

			BAXODNVH.method22(3, 97, 3, 0xFFFFFF, 78);
			field461.method327();
			NQTCRWWR.field970 = field428;
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method45() {
		field513 = true;
	}

	public final void init() {
		field244 = Integer.parseInt(getParameter("nodeid"));
		field245 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method164();
		} else {
			method179();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field246 = false;
		} else {
			field246 = true;
		}

		method398(765, 503);
	}

	@ObfuscatedName("client.e(I)V")
	public final void method46() {
		for (HAWWMNZR var1 = (HAWWMNZR) field384.method567(); var1 != null; var1 = (HAWWMNZR) field384.method569()) {
			if (var1.field742 == -1) {
				var1.field741 = 0;
				method77(var1);
			} else {
				var1.method1();
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method47() {
		if (field285 == 2) {
			for (HAWWMNZR var1 = (HAWWMNZR) field384.method567(); var1 != null; var1 = (HAWWMNZR) field384.method569()) {
				if (var1.field742 > 0) {
					var1.field742--;
				}

				if (var1.field742 != 0) {
					if (var1.field741 > 0) {
						var1.field741--;
					}

					if (var1.field741 == 0 && var1.field751 >= 1 && var1.field752 >= 1 && var1.field751 <= 102 && var1.field752 <= 102 && (var1.field746 < 0 || IPCPGCKM.method324(var1.field748, var1.field746))) {
						method83(var1.field746, var1.field747, var1.field748, var1.field750, var1.field751, var1.field752, var1.field749);
						var1.field741 = -1;

						if (var1.field746 == var1.field743 && var1.field743 == -1) {
							var1.method1();
						} else if (var1.field746 == var1.field743 && var1.field747 == var1.field744 && var1.field748 == var1.field745) {
							var1.method1();
						}
					}
				} else if (var1.field743 < 0 || IPCPGCKM.method324(var1.field745, var1.field743)) {
					method83(var1.field743, var1.field744, var1.field745, var1.field750, var1.field751, var1.field752, var1.field749);
					var1.method1();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLCMGGUSPR;)V")
	public final void method48(int arg0, CMGGUSPR arg1) {
		arg1.method204();
		int var3 = arg1.method205(1);
		if (var3 != 0) {
			int var4 = arg1.method205(2);
			if (var4 == 0) {
				field199[field198++] = field194;
			} else if (var4 == 1) {
				int var5 = arg1.method205(3);
				field335.method440(var5, false);
				int var6 = arg1.method205(1);
				if (var6 == 1) {
					field199[field198++] = field194;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method205(3);
				field335.method440(var7, true);
				int var8 = arg1.method205(3);
				field335.method440(var8, true);
				int var9 = arg1.method205(1);
				if (var9 == 1) {
					field199[field198++] = field194;
				}
			} else if (var4 == 3) {
				field440 = arg1.method205(2);
				int var10 = arg1.method205(1);
				if (var10 == 1) {
					field199[field198++] = field194;
				}

				int var11 = arg1.method205(7);
				int var12 = arg1.method205(1);
				int var13 = arg1.method205(7);
				field335.method442(var12 == 1, var11, var13);
			}
		}
	}

	@ObfuscatedName("client.a(ILWJQTPVDG;I)I")
	public final int method49(int arg0, WJQTPVDG arg1) {
		if (arg1.field1395 == null || arg0 >= arg1.field1395.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1395[arg0];
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
					var8 = field238[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field407[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field162[var3[var5++]];
				}

				if (var7 == 4) {
					WJQTPVDG var10 = WJQTPVDG.method577(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < KIHBVNFV.field856 && (!KIHBVNFV.method346(var11).field879 || field246)) {
						for (int var12 = 0; var12 < var10.field1373.length; var12++) {
							if (var11 + 1 == var10.field1373[var12]) {
								var8 += var10.field1379[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field226[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field318[field407[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field226[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field335.field912;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < DUAHSVYY.field570; var13++) {
						if (DUAHSVYY.field572[var13]) {
							var8 += field407[var13];
						}
					}
				}

				if (var7 == 10) {
					WJQTPVDG var14 = WJQTPVDG.method577(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < KIHBVNFV.field856 && (!KIHBVNFV.method346(var15).field879 || field246)) {
						for (int var16 = 0; var16 < var14.field1373.length; var16++) {
							if (var14.field1373[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field110;
				}

				if (var7 == 12) {
					var8 = field330;
				}

				if (var7 == 13) {
					int var17 = field226[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					RLLHHJLC var20 = RLLHHJLC.field1048[var19];
					int var21 = var20.field1050;
					int var22 = var20.field1051;
					int var23 = var20.field1052;
					int var24 = field346[var23 - var22];
					var8 = field226[var21] >> var22 & var24;
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
					var8 = (field335.field1110 >> 7) + field389;
				}

				if (var7 == 19) {
					var8 = (field335.field1111 >> 7) + field390;
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

	@ObfuscatedName("client.a(LWJQTPVDG;Z)Z")
	public final boolean method50(WJQTPVDG arg0) {
		if (arg0.field1342 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1342.length; var2++) {
			int var3 = method49(var2, arg0);
			int var4 = arg0.field1353[var2];
			if (arg0.field1342[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1342[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1342[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method51() {
		field122++;
		method156(true);
		method100(true);
		method156(false);
		method100(false);
		method121();
		method54();

		if (!field237) {
			int var1 = field341;
			if (field104 / 256 > var1) {
				var1 = field104 / 256;
			}

			if (field477[4] && field293[4] + 128 > var1) {
				var1 = field293[4] + 128;
			}

			int var2 = field342 + field147 & 0x7FF;
			method62(field433, var1 * 3 + 600, var1, method60(field335.field1111, field440, field335.field1110) - 50, field434, var2);
		}

		int var3;
		if (field237) {
			var3 = method167();
		} else {
			var3 = method166();
		}

		int var4 = field155;
		int var5 = field156;
		int var6 = field157;
		int var7 = field158;
		int var8 = field159;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field477[var9]) {
				int var10 = (int) (Math.random() * (field215[var9] * 2 + 1) + Math.sin(field230[var9] / 100.0D * field420[var9]) * field293[var9] - field215[var9]);
				if (var9 == 0) {
					field155 += var10;
				}

				if (var9 == 1) {
					field156 += var10;
				}

				if (var9 == 2) {
					field157 += var10;
				}

				if (var9 == 3) {
					field159 = field159 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field158 += var10;
					if (field158 < 128) {
						field158 = 128;
					}

					if (field158 > 383) {
						field158 = 383;
					}
				}
			}
		}

		int var11 = NQTCRWWR.field979;
		GCSAWSJV.field650 = true;
		GCSAWSJV.field653 = 0;
		GCSAWSJV.field651 = field945 - 4;
		GCSAWSJV.field652 = field946 - 4;
		BAXODNVH.method20();
		field511.method487(field158, field155, field157, var3, field156, field159);
		field511.method462();
		method175();
		method38();
		method95(var11);
		method120();
		field461.method328(4, 4, field937);
		field155 = var4;
		field156 = var5;
		field157 = var6;
		field158 = var7;
		field159 = var8;
	}

	@ObfuscatedName("client.a(BII)V")
	public final void method52(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field388[var4] != null) {
				int var5 = field386[var4];
				int var6 = field146 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field387[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field243 == 0 || field243 == 1 && method118(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field335.field920)) {
						if (field519 >= 1) {
							field99[field345] = "Report abuse @whi@" + var7;
							field235[field345] = 641;
							field345++;
						}

						field99[field345] = "Add ignore @whi@" + var7;
						field235[field345] = 895;
						field345++;
						field99[field345] = "Add friend @whi@" + var7;
						field235[field345] = 166;
						field345++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field302 == 0 && (var5 == 7 || field479 == 0 || field479 == 1 && method118(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field519 >= 1) {
							field99[field345] = "Report abuse @whi@" + var7;
							field235[field345] = 641;
							field345++;
						}

						field99[field345] = "Add ignore @whi@" + var7;
						field235[field345] = 895;
						field345++;
						field99[field345] = "Add friend @whi@" + var7;
						field235[field345] = 166;
						field345++;
					}

					var3++;
				}

				if (var5 == 4 && (field174 == 0 || field174 == 1 && method118(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field99[field345] = "Accept trade @whi@" + var7;
						field235[field345] = 57;
						field345++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field302 == 0 && field479 < 2) {
					var3++;
				}

				if (var5 == 8 && (field174 == 0 || field174 == 1 && method118(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field99[field345] = "Accept challenge @whi@" + var7;
						field235[field345] = 894;
						field345++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILMDBQGDOL;IBI)V")
	public final void method53(int arg0, MDBQGDOL arg1, int arg2, int arg3) {
		if (field335 != arg1 && field345 < 400) {
			String var5;
			if (arg1.field909 == 0) {
				var5 = arg1.field920 + method172(arg1.field912, field335.field912) + " (level-" + arg1.field912 + ")";
			} else {
				var5 = arg1.field920 + " (skill-" + arg1.field909 + ")";
			}

			if (field265 == 1) {
				field99[field345] = "Use " + field269 + " with @whi@" + var5;
				field235[field345] = 508;
				field236[field345] = arg2;
				field233[field345] = arg3;
				field234[field345] = arg0;
				field345++;
			} else if (field296 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field410[var6] != null) {
						field99[field345] = field410[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field410[var6].equalsIgnoreCase("attack")) {
							if (arg1.field912 > field335.field912) {
								var7 = 2000;
							}

							if (field335.field907 != 0 && arg1.field907 != 0) {
								if (field335.field907 == arg1.field907) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field411[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field235[field345] = var7 + 870;
						}

						if (var6 == 1) {
							field235[field345] = var7 + 992;
						}

						if (var6 == 2) {
							field235[field345] = var7 + 913;
						}

						if (var6 == 3) {
							field235[field345] = var7 + 155;
						}

						if (var6 == 4) {
							field235[field345] = var7 + 946;
						}

						field236[field345] = arg2;
						field233[field345] = arg3;
						field234[field345] = arg0;
						field345++;
					}
				}
			} else if ((field298 & 0x8) == 8) {
				field99[field345] = field299 + " @whi@" + var5;
				field235[field345] = 306;
				field236[field345] = arg2;
				field233[field345] = arg3;
				field234[field345] = arg0;
				field345++;
			}

			for (int var8 = 0; var8 < field345; var8++) {
				if (field235[var8] == 158) {
					field99[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method54() {
		for (YGFSYDKK var1 = (YGFSYDKK) field192.method567(); var1 != null; var1 = (YGFSYDKK) field192.method569()) {
			if (field440 != var1.field1435 || var1.field1439) {
				var1.method1();
			} else if (field404 >= var1.field1434) {
				var1.method585(field220);

				if (var1.field1439) {
					var1.method1();
				} else {
					field511.method459(var1, var1.field1435, var1.field1437, false, var1.field1436, 0, -1, 60, var1.field1438);
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method55() {
		YJMLCFGC.field1458.method301();
		YJMLCFGC.field1463.method301();
		TQRZOVPP.field1249.method301();
		KIHBVNFV.field840.method301();
		KIHBVNFV.field870.method301();
		MDBQGDOL.field911.method301();
		JEPDVFCL.field805.method301();
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.i(I)V")
	public final void method56() {
		try {
			if (field300 != null) {
				field300.method546();
			}
		} catch (Exception var2) {
		}

		field300 = null;
		field107 = false;
		field116 = 0;
		field348 = "";
		field349 = "";
		method55();
		field511.method448();

		for (int var1 = 0; var1 < 4; var1++) {
			field281[var1].method552();
		}

		System.gc();
		method159();
		field316 = -1;
		field471 = -1;
		field367 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method57(String arg0, String arg1) {
		if (field461 != null) {
			field461.method327();
			NQTCRWWR.field970 = field428;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field184.method232(0, 257, var3, arg1);
			field184.method232(0xFFFFFF, 256, var3 - 1, arg1);
			var3 += 15;
			if (arg0 != null) {
				field184.method232(0, 257, var3, arg0);
				field184.method232(0xFFFFFF, 256, var3 - 1, arg0);
			}

			field461.method328(4, 4, field937);
		} else if (field938 != null) {
			field938.method327();
			NQTCRWWR.field970 = field429;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			BAXODNVH.method22(var5, 383 - var5 / 2, var6, 0, var4 - var6 / 2 - 5);
			BAXODNVH.method23(var6, var5, 0xFFFFFF, 383 - var5 / 2, var4 - 5 - var6 / 2);

			if (arg0 != null) {
				var4 -= 7;
			}

			field184.method232(0, 383, var4, arg1);
			field184.method232(0xFFFFFF, 382, var4 - 1, arg1);
			var4 += 15;
			if (arg0 != null) {
				field184.method232(0, 383, var4, arg0);
				field184.method232(0xFFFFFF, 382, var4 - 1, arg0);
			}

			field938.method328(0, 0, field937);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method58() {
		try {
			field408 = -1;
			field192.method571();
			field499.method571();
			NQTCRWWR.method405();
			method55();
			field511.method448();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field281[var1].method552();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field165[var2][var3][var4] = 0;
					}
				}
			}

			IPCPGCKM var5 = new IPCPGCKM(104, field165, field431, 104);
			int var6 = field125.length;
			field288.method183(21);

			if (!field430) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field447[var7] >> 8) * 64 - field389;
					int var9 = (field447[var7] & 0xFF) * 64 - field390;
					byte[] var10 = field125[var7];
					if (var10 != null) {
						var5.method320(field281, var8, var9, (field328 - 6) * 8, var10, (field329 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field447[var11] >> 8) * 64 - field389;
					int var13 = (field447[var11] & 0xFF) * 64 - field390;
					byte[] var14 = field125[var11];
					if (var14 == null && field329 < 800) {
						var5.method321(64, 64, var12, var13);
					}
				}

				field288.method183(21);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field276[var15];
					if (var16 != null) {
						int var17 = (field447[var15] >> 8) * 64 - field389;
						int var18 = (field447[var15] & 0xFF) * 64 - field390;
						var5.method316(var17, var18, field511, field281, var16);
					}
				}
			}

			if (field430) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field227[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field447.length; var29++) {
									if (field447[var29] == var28 && field125[var29] != null) {
										var5.method319(var20 * 8, field281, (var27 & 0x7) * 8, var25, field125[var29], (var26 & 0x7) * 8, var19, var24, var21 * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method322(var21 * 8, var19, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field227[0][var30][var31];
						if (var32 == -1) {
							var5.method321(8, 8, var30 * 8, var31 * 8);
						}
					}
				}

				field288.method183(21);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field227[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field447.length; var42++) {
									if (field447[var42] == var41 && field276[var42] != null) {
										var5.method314(var37, var33, (var39 & 0x7) * 8, var35 * 8, field511, (var40 & 0x7) * 8, field281, var34 * 8, field276[var42], var38);
										break;
									}
								}
							}
						}
					}
				}
			}

			field288.method183(21);
			var5.method309(field281, field511);

			if (field461 != null) {
				field461.method327();
				NQTCRWWR.field970 = field428;
			}

			field288.method183(21);
			int var43 = IPCPGCKM.field775;
			if (var43 > field440) {
				var43 = field440;
			}

			if (var43 < field440 - 1) {
				int var44 = field440 - 1;
			}

			if (field247) {
				field511.method449(IPCPGCKM.field775);
			} else {
				field511.method449(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method148(var45, var46);
				}
			}

			method46();
		} catch (Exception var59) {
		}

		YJMLCFGC.field1458.method301();

		if (field940 != null) {
			field288.method183(0);
			field288.method188(1057001181);
		}

		if (field247 && signlink.cache_dat != null) {
			int var48 = field526.method542(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field526.method535(var49);
				if ((var50 & 0x79) == 0) {
					GCSAWSJV.method259(var49);
				}
			}
		}

		System.gc();
		NQTCRWWR.method406(20);
		field526.method523();
		int var51 = (field328 - 6) / 8 - 1;
		int var52 = (field328 + 6) / 8 + 1;
		int var53 = (field329 - 6) / 8 - 1;
		int var54 = (field329 + 6) / 8 + 1;
		if (field366) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field526.method538(var55, 0, var56);
					if (var57 != -1) {
						field526.method541(var57, 3);
					}

					int var58 = field526.method538(var55, 1, var56);
					if (var58 != -1) {
						field526.method541(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method59(long arg0) {
		if (arg0 != 0L) {
			if (field525 >= 100) {
				method114("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = ZLGGMMMS.method601(ZLGGMMMS.method598(arg0));
				for (int var4 = 0; var4 < field525; var4++) {
					if (field406[var4] == arg0) {
						method114("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field509; var5++) {
					if (field374[var5] == arg0) {
						method114("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field406[field525++] = arg0;
				field405 = true;
				field288.method183(43);
				field288.method190(arg0);
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 359);

			if (arg0.length == 5) {
				field244 = Integer.parseInt(arg0[0]);
				field245 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method164();
				} else if (arg0[2].equals("highmem")) {
					method179();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field246 = false;
				} else if (arg0[3].equals("members")) {
					field246 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method397(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method60(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field165[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field431[var6][var4][var5] + field431[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field431[var6][var4][var5 + 1] + field431[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method61() {
		short var1 = 256;

		if (field312 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field312 > 768) {
					field421[var2] = method106(1024 - field312, field423[var2], field422[var2]);
				} else if (field312 > 256) {
					field421[var2] = field423[var2];
				} else {
					field421[var2] = method106(256 - field312, field422[var2], field423[var2]);
				}
			}
		} else if (field313 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field313 > 768) {
					field421[var3] = method106(1024 - field313, field424[var3], field422[var3]);
				} else if (field313 > 256) {
					field421[var3] = field424[var3];
				} else {
					field421[var3] = method106(256 - field313, field422[var3], field424[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field421[var4] = field422[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field356.field786[var5] = field523.field1219[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field253[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field303[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field421[var12];
					int var15 = field356.field786[var7];
					field356.field786[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field356.method328(0, 0, field937);

		for (int var16 = 0; var16 < 33920; var16++) {
			field357.field786[var16] = field524.field1219[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field253[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field303[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field421[var23];
					int var26 = field357.field786[var18];
					field357.field786[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field357.method328(637, 0, field937);
	}

	@ObfuscatedName("client.a(IIIIIBI)V")
	public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = GCSAWSJV.field655[var7];
			int var13 = GCSAWSJV.field656[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = GCSAWSJV.field655[var8];
			int var16 = GCSAWSJV.field656[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field155 = arg0 - var9;
		field156 = arg3 - var10;
		field157 = arg4 - var11;
		field158 = arg2;
		field159 = arg5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method63(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field535 = "";
				field536 = "Connecting to server...";
				method125(true);
			}

			field300 = new UUQNASSN(this, method66(field245 + 43594));
			long var4 = ZLGGMMMS.method597(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field288.field540 = 0;
			field288.method184(14);
			field288.method184(var6);
			field300.method550(0, field288.field539, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field300.method547();
			}

			int var8 = field300.method547();
			int var9 = var8;

			if (var8 == 0) {
				field300.method549(field251.field539, 0, 8);
				field251.field540 = 0;
				field105 = field251.method200();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field105 >> 32), (int) field105 };
				field288.field540 = 0;
				field288.method184(10);
				field288.method188(var10[0]);
				field288.method188(var10[1]);
				field288.method188(var10[2]);
				field288.method188(var10[3]);
				field288.method188(signlink.uid);
				field288.method191(arg0);
				field288.method191(arg1);
				field288.method209(field493, field314);
				field181.field540 = 0;

				if (arg2) {
					field181.method184(18);
				} else {
					field181.method184(16);
				}

				field181.method184(field288.field540 + 36 + 1 + 1 + 2);
				field181.method184(255);
				field181.method185(359);
				field181.method184(field247 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field181.method188(field103[var11]);
				}

				field181.method192(field288.field539, field288.field540, 0);
				field288.field544 = new RYDUASDW(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field403 = new RYDUASDW(var10);
				field300.method550(0, field181.field539, field181.field540);
				var8 = field300.method547();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method63(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field519 = field300.method547();
				field352 = field300.method547() == 1;
				field398 = 0L;
				field500 = 0;
				field385.field1448 = 0;
				field942 = true;
				field332 = true;
				field107 = true;
				field288.field540 = 0;
				field251.field540 = 0;
				field515 = -1;
				field305 = -1;
				field306 = -1;
				field307 = -1;
				field514 = 0;
				field516 = 0;
				field425 = 0;
				field518 = 0;
				field118 = 0;
				field345 = 0;
				field373 = false;
				field943 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field388[var13] = null;
				}

				field265 = 0;
				field296 = 0;
				field285 = 0;
				field351 = 0;
				field224 = (int) (Math.random() * 100.0D) - 50;
				field445 = (int) (Math.random() * 110.0D) - 55;
				field147 = (int) (Math.random() * 80.0D) - 40;
				field279 = (int) (Math.random() * 120.0D) - 60;
				field400 = (int) (Math.random() * 30.0D) - 20;
				field342 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field149 = 0;
				field408 = -1;
				field270 = 0;
				field271 = 0;
				field196 = 0;
				field128 = 0;

				for (int var14 = 0; var14 < field193; var14++) {
					field195[var14] = null;
					field200[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field127[var15] = null;
				}

				field335 = field195[field194] = new MDBQGDOL();
				field499.method571();
				field192.method571();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field537[var16][var17][var18] = null;
						}
					}
				}

				field384 = new WCVCMGLX();
				field510 = 0;
				field509 = 0;
				method161(field319);
				field319 = -1;
				method161(field538);
				field538 = -1;
				method161(field399);
				field399 = -1;
				method161(field528);
				field528 = -1;
				method161(field520);
				field520 = -1;
				method161(field508);
				field508 = -1;
				method161(field295);
				field295 = -1;
				field413 = false;
				field396 = 3;
				field273 = 0;
				field373 = false;
				field383 = false;
				field114 = null;
				field444 = 0;
				field414 = -1;
				field534 = true;
				method134();

				for (int var19 = 0; var19 < 5; var19++) {
					field488[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field410[var20] = null;
					field411[var20] = false;
				}

				field252 = 0;
				field402 = 0;
				field250 = 0;
				field111 = 0;
				field322 = 0;
				method105();
			} else if (var8 == 3) {
				field535 = "";
				field536 = "Invalid username or password.";
			} else if (var8 == 4) {
				field535 = "Your account has been disabled.";
				field536 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field535 = "Your account is already logged in.";
				field536 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field535 = "RuneScape has been updated!";
				field536 = "Please reload this page.";
			} else if (var8 == 7) {
				field535 = "This world is full.";
				field536 = "Please use a different world.";
			} else if (var8 == 8) {
				field535 = "Unable to connect.";
				field536 = "Login server offline.";
			} else if (var8 == 9) {
				field535 = "Login limit exceeded.";
				field536 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field535 = "Unable to connect.";
				field536 = "Bad session id.";
			} else if (var8 == 11) {
				field535 = "Login server rejected session.";
				field536 = "Please try again.";
			} else if (var8 == 12) {
				field535 = "You need a members account to login to this world.";
				field536 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field535 = "Could not complete login.";
				field536 = "Please try using a different world.";
			} else if (var8 == 14) {
				field535 = "The server is being updated.";
				field536 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field107 = true;
				field288.field540 = 0;
				field251.field540 = 0;
				field515 = -1;
				field305 = -1;
				field306 = -1;
				field307 = -1;
				field514 = 0;
				field516 = 0;
				field425 = 0;
				field345 = 0;
				field373 = false;
				field451 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field535 = "Login attempts exceeded.";
				field536 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field535 = "You are standing in a members-only area.";
				field536 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field535 = "Invalid loginserver requested";
				field536 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field300.method547();
				for (var21 += 3; var21 >= 0; var21--) {
					field535 = "You have only just left another world";
					field536 = "Your profile will be transferred in: " + var21;
					method125(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method63(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field535 = "Malformed login packet.";
				field536 = "Please try again.";
			} else if (var8 == 23) {
				field535 = "This computers address has been blocked";
				field536 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field535 = "Unexpected server response";
				field536 = "Please try using a different world.";
			} else if (var9 != 0) {
				field535 = "No response from server";
				field536 = "Please try using a different world.";
			} else if (field417 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field417++;
				method63(arg0, arg1, arg2);
			} else {
				field535 = "No response from loginserver";
				field536 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field535 = "";
			field536 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method64() {
		if (field938 == null) {
			method152();
			field353 = null;
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field462 = null;
			field460 = null;
			field459 = null;
			field461 = null;
			field209 = null;
			field210 = null;
			field211 = null;
			field938 = new IUZTBIWV(method117(), 765, 503);
			field513 = true;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method65() {
		field459.method327();
		NQTCRWWR.field970 = field427;
		field166.method424(0, 0);

		if (field508 != -1) {
			method115(0, WJQTPVDG.method577(field508), 0, 0);
		} else if (field254[field396] != -1) {
			method115(0, WJQTPVDG.method577(field254[field396]), 0, 0);
		}

		if (field373 && field323 == 1) {
			method141();
		}

		field459.method328(553, 205, field937);
		field461.method327();
		NQTCRWWR.field970 = field428;
	}

	@ObfuscatedName("client.l(I)Ljava/net/Socket;")
	public final Socket method66(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.e(B)V")
	public final void method67() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field303[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field303[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field304[var10] = (field303[var10 - 1] + field303[var10 + 1] + field303[var10 - 128] + field303[var10 + 128]) / 4;
			}
		}

		field478 += 128;
		if (field478 > field218.length) {
			field478 -= field218.length;
			int var11 = (int) (Math.random() * 12.0D);
			method96(field453[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field304[var14 + 128] - field218[field478 + var14 & field218.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field303[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field253[var16] = field253[var16 + 1];
		}

		field253[var1 - 1] = (int) (Math.sin(field404 / 14.0D) * 16.0D + Math.sin(field404 / 15.0D) * 14.0D + Math.sin(field404 / 16.0D) * 12.0D);

		if (field312 > 0) {
			field312 -= 4;
		}

		if (field313 > 0) {
			field313 -= 4;
		}

		if (field312 == 0 && field313 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field312 = 1024;
			}

			if (var17 == 1) {
				field313 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method68() {
		for (int var1 = 0; var1 < field128; var1++) {
			int var2 = field129[var1];
			IGOBKPZP var3 = field127[var2];
			if (var3 != null) {
				method69(var3.field758.field1254, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ZILSDXDPBJK;)V")
	public final void method69(int arg0, SDXDPBJK arg1) {
		if (arg1.field1110 < 128 || arg1.field1111 < 128 || arg1.field1110 >= 13184 || arg1.field1111 >= 13184) {
			arg1.field1105 = -1;
			arg1.field1078 = -1;
			arg1.field1088 = 0;
			arg1.field1089 = 0;
			arg1.field1110 = arg1.field1097[0] * 128 + arg1.field1113 * 64;
			arg1.field1111 = arg1.field1098[0] * 128 + arg1.field1113 * 64;
			arg1.method443();
		}

		if (field335 == arg1 && (arg1.field1110 < 1536 || arg1.field1111 < 1536 || arg1.field1110 >= 11776 || arg1.field1111 >= 11776)) {
			arg1.field1105 = -1;
			arg1.field1078 = -1;
			arg1.field1088 = 0;
			arg1.field1089 = 0;
			arg1.field1110 = arg1.field1097[0] * 128 + arg1.field1113 * 64;
			arg1.field1111 = arg1.field1098[0] * 128 + arg1.field1113 * 64;
			arg1.method443();
		}

		if (arg1.field1088 > field404) {
			method70(arg1);
		} else if (arg1.field1089 >= field404) {
			method71(arg1);
		} else {
			method72(arg1);
		}

		method73(arg1);
		method74(arg1);
	}

	@ObfuscatedName("client.a(ILSDXDPBJK;)V")
	public final void method70(SDXDPBJK arg0) {
		int var2 = arg0.field1088 - field404;
		int var3 = arg0.field1113 * 64 + arg0.field1084 * 128;
		int var4 = arg0.field1113 * 64 + arg0.field1086 * 128;
		arg0.field1110 += (var3 - arg0.field1110) / var2;
		arg0.field1111 += (var4 - arg0.field1111) / var2;
		arg0.field1099 = 0;

		if (arg0.field1090 == 0) {
			arg0.field1083 = 1024;
		}

		if (arg0.field1090 == 1) {
			arg0.field1083 = 1536;
		}

		if (arg0.field1090 == 2) {
			arg0.field1083 = 0;
		}

		if (arg0.field1090 == 3) {
			arg0.field1083 = 512;
		}
	}

	@ObfuscatedName("client.b(ILSDXDPBJK;)V")
	public final void method71(SDXDPBJK arg0) {
		if (field404 == arg0.field1089 || arg0.field1105 == -1 || arg0.field1108 != 0 || arg0.field1107 + 1 > XRDQTWLL.field1418[arg0.field1105].method583(arg0.field1106)) {
			int var2 = arg0.field1089 - arg0.field1088;
			int var3 = field404 - arg0.field1088;
			int var4 = arg0.field1113 * 64 + arg0.field1084 * 128;
			int var5 = arg0.field1113 * 64 + arg0.field1086 * 128;
			int var6 = arg0.field1113 * 64 + arg0.field1085 * 128;
			int var7 = arg0.field1113 * 64 + arg0.field1087 * 128;
			arg0.field1110 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1111 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1099 = 0;

		if (arg0.field1090 == 0) {
			arg0.field1083 = 1024;
		}

		if (arg0.field1090 == 1) {
			arg0.field1083 = 1536;
		}

		if (arg0.field1090 == 2) {
			arg0.field1083 = 0;
		}

		if (arg0.field1090 == 3) {
			arg0.field1083 = 512;
		}

		arg0.field1112 = arg0.field1083;
	}

	@ObfuscatedName("client.a(ZLSDXDPBJK;)V")
	public final void method72(SDXDPBJK arg0) {
		arg0.field1102 = arg0.field1091;
		if (arg0.field1114 == 0) {
			arg0.field1099 = 0;
		} else {
			if (arg0.field1105 != -1 && arg0.field1108 == 0) {
				XRDQTWLL var2 = XRDQTWLL.field1418[arg0.field1105];
				if (arg0.field1126 > 0 && var2.field1430 == 0) {
					arg0.field1099++;
					return;
				}

				if (arg0.field1126 <= 0 && var2.field1431 == 0) {
					arg0.field1099++;
					return;
				}
			}

			int var3 = arg0.field1110;
			int var4 = arg0.field1111;
			int var5 = arg0.field1097[arg0.field1114 - 1] * 128 + arg0.field1113 * 64;
			int var6 = arg0.field1098[arg0.field1114 - 1] * 128 + arg0.field1113 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1083 = 1280;
					} else if (var4 > var6) {
						arg0.field1083 = 1792;
					} else {
						arg0.field1083 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1083 = 768;
					} else if (var4 > var6) {
						arg0.field1083 = 256;
					} else {
						arg0.field1083 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1083 = 1024;
				} else {
					arg0.field1083 = 0;
				}

				int var7 = arg0.field1083 - arg0.field1112 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1074;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1073;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1076;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1075;
				}

				if (var8 == -1) {
					var8 = arg0.field1073;
				}

				arg0.field1102 = var8;
				int var9 = 4;
				if (arg0.field1112 != arg0.field1083 && arg0.field1100 == -1 && arg0.field1121 != 0) {
					var9 = 2;
				}

				if (arg0.field1114 > 2) {
					var9 = 6;
				}

				if (arg0.field1114 > 3) {
					var9 = 8;
				}

				if (arg0.field1099 > 0 && arg0.field1114 > 1) {
					var9 = 8;
					arg0.field1099--;
				}

				if (arg0.field1096[arg0.field1114 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1102 == arg0.field1073 && arg0.field1125 != -1) {
					arg0.field1102 = arg0.field1125;
				}

				if (var3 < var5) {
					arg0.field1110 += var9;
					if (arg0.field1110 > var5) {
						arg0.field1110 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1110 -= var9;
					if (arg0.field1110 < var5) {
						arg0.field1110 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1111 += var9;
					if (arg0.field1111 > var6) {
						arg0.field1111 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1111 -= var9;
					if (arg0.field1111 < var6) {
						arg0.field1111 = var6;
					}
				}

				if (arg0.field1110 == var5 && arg0.field1111 == var6) {
					arg0.field1114--;

					if (arg0.field1126 > 0) {
						arg0.field1126--;
						return;
					}
				}
			} else {
				arg0.field1110 = var5;
				arg0.field1111 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(ILSDXDPBJK;)V")
	public final void method73(SDXDPBJK arg0) {
		if (arg0.field1121 != 0) {
			if (arg0.field1100 != -1 && arg0.field1100 < 32768) {
				IGOBKPZP var2 = field127[arg0.field1100];
				if (var2 != null) {
					int var3 = arg0.field1110 - var2.field1110;
					int var4 = arg0.field1111 - var2.field1111;
					if (var3 != 0 || var4 != 0) {
						arg0.field1083 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1100 >= 32768) {
				int var5 = arg0.field1100 - 32768;
				if (field123 == var5) {
					var5 = field194;
				}

				MDBQGDOL var6 = field195[var5];
				if (var6 != null) {
					int var7 = arg0.field1110 - var6.field1110;
					int var8 = arg0.field1111 - var6.field1111;
					if (var7 != 0 || var8 != 0) {
						arg0.field1083 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1122 != 0 || arg0.field1123 != 0) && (arg0.field1114 == 0 || arg0.field1099 > 0)) {
				int var9 = arg0.field1110 - (arg0.field1122 - field389 - field389) * 64;
				int var10 = arg0.field1111 - (arg0.field1123 - field390 - field390) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1083 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1122 = 0;
				arg0.field1123 = 0;
			}

			int var11 = arg0.field1083 - arg0.field1112 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1121 || var11 > 2048 - arg0.field1121) {
					arg0.field1112 = arg0.field1083;
				} else if (var11 > 1024) {
					arg0.field1112 -= arg0.field1121;
				} else {
					arg0.field1112 += arg0.field1121;
				}

				arg0.field1112 &= 0x7FF;
				if (arg0.field1102 == arg0.field1091 && arg0.field1112 != arg0.field1083) {
					if (arg0.field1092 != -1) {
						arg0.field1102 = arg0.field1092;
						return;
					}

					arg0.field1102 = arg0.field1073;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LSDXDPBJK;B)V")
	public final void method74(SDXDPBJK arg0) {
		arg0.field1124 = false;

		if (arg0.field1102 != -1) {
			XRDQTWLL var2 = XRDQTWLL.field1418[arg0.field1102];
			arg0.field1104++;
			if (arg0.field1103 < var2.field1419 && arg0.field1104 > var2.method583(arg0.field1103)) {
				arg0.field1104 = 0;
				arg0.field1103++;
			}

			if (arg0.field1103 >= var2.field1419) {
				arg0.field1104 = 0;
				arg0.field1103 = 0;
			}
		}

		if (arg0.field1078 != -1 && field404 >= arg0.field1081) {
			if (arg0.field1079 < 0) {
				arg0.field1079 = 0;
			}

			XRDQTWLL var3 = JEPDVFCL.field793[arg0.field1078].field797;
			arg0.field1080++;
			while (arg0.field1079 < var3.field1419 && arg0.field1080 > var3.method583(arg0.field1079)) {
				arg0.field1080 -= var3.method583(arg0.field1079);
				arg0.field1079++;
			}

			if (arg0.field1079 >= var3.field1419 && (arg0.field1079 < 0 || arg0.field1079 >= var3.field1419)) {
				arg0.field1078 = -1;
			}
		}

		if (arg0.field1105 != -1 && arg0.field1108 <= 1) {
			XRDQTWLL var4 = XRDQTWLL.field1418[arg0.field1105];
			if (var4.field1430 == 1 && arg0.field1126 > 0 && arg0.field1088 <= field404 && arg0.field1089 < field404) {
				arg0.field1108 = 1;
				return;
			}
		}

		if (arg0.field1105 != -1 && arg0.field1108 == 0) {
			XRDQTWLL var5 = XRDQTWLL.field1418[arg0.field1105];
			arg0.field1107++;
			while (arg0.field1106 < var5.field1419 && arg0.field1107 > var5.method583(arg0.field1106)) {
				arg0.field1107 -= var5.method583(arg0.field1106);
				arg0.field1106++;
			}

			if (arg0.field1106 >= var5.field1419) {
				arg0.field1106 -= var5.field1423;
				arg0.field1109++;
				if (arg0.field1109 >= var5.field1429) {
					arg0.field1105 = -1;
				}

				if (arg0.field1106 < 0 || arg0.field1106 >= var5.field1419) {
					arg0.field1105 = -1;
				}
			}

			arg0.field1124 = var5.field1425;
		}

		if (arg0.field1108 > 0) {
			arg0.field1108--;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method75() {
		if (field528 == -1 || field285 != 2 && field938 == null) {
			if (field513) {
				method105();
				field513 = false;
				field255.method328(0, 4, field937);
				field256.method328(0, 357, field937);
				field257.method328(722, 4, field937);
				field258.method328(743, 205, field937);
				field259.method328(0, 0, field937);
				field260.method328(516, 4, field937);
				field261.method328(516, 205, field937);
				field262.method328(496, 357, field937);
				field263.method328(0, 338, field937);
				field405 = true;
				field473 = true;
				field173 = true;
				field277 = true;

				if (field285 != 2) {
					field461.method328(4, 4, field937);
					field460.method328(550, 4, field937);
				}
			}

			if (field285 == 2) {
				method51();
			}

			if (field373 && field323 == 1) {
				field405 = true;
			}

			if (field508 != -1) {
				boolean var3 = method81(field220, field508);
				if (var3) {
					field405 = true;
				}
			}

			if (field485 == 2) {
				field405 = true;
			}

			if (field496 == 2) {
				field405 = true;
			}

			if (field405) {
				method65();
				field405 = false;
			}

			if (field538 == -1 && field273 == 0) {
				field320.field1357 = field202 - field146 - 77;

				if (field945 > 448 && field945 < 560 && field946 > 332) {
					method174(0, 77, field946 - 357, field945 - 17, 463, field320, field202, -1);
				}

				int var4 = field202 - field320.field1357 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field202 - 77) {
					var4 = field202 - 77;
				}

				if (field146 != var4) {
					field146 = var4;
					field473 = true;
				}

				field275++;
				if (field275 > 73) {
					field275 = 0;
					field288.method183(252);
				}
			}

			if (field538 == -1 && field273 == 3) {
				int var5 = field379 * 14 + 7;
				field320.field1357 = field382;

				if (field945 > 448 && field945 < 560 && field946 > 332) {
					method174(0, 77, field946 - 357, field945 - 17, 463, field320, var5, -1);
				}

				int var6 = field320.field1357;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field382 != var6) {
					field382 = var6;
					field473 = true;
				}
			}

			if (field538 != -1) {
				boolean var7 = method81(field220, field538);
				if (var7) {
					field473 = true;
				}
			}

			if (field485 == 3) {
				field473 = true;
			}

			if (field496 == 3) {
				field473 = true;
			}

			if (field114 != null) {
				field473 = true;
			}

			if (field373 && field323 == 2) {
				field473 = true;
			}

			if (field473) {
				method143();
				field473 = false;
			}

			if (field285 == 2) {
				method44();
				field460.method328(550, 4, field937);
				field239++;
				if (field239 > 95) {
					field239 = 0;
					field288.method183(233);
				}
			}

			if (field414 != -1) {
				field173 = true;
			}

			if (field173) {
				if (field414 != -1 && field414 == field396) {
					field414 = -1;
					field288.method183(156);
					field288.method184(field396);
				}

				field173 = false;
				field211.method327();
				field310.method424(0, 0);

				if (field508 == -1) {
					if (field254[field396] != -1) {
						if (field396 == 0) {
							field175.method424(22, 10);
						}

						if (field396 == 1) {
							field176.method424(54, 8);
						}

						if (field396 == 2) {
							field176.method424(82, 8);
						}

						if (field396 == 3) {
							field177.method424(110, 8);
						}

						if (field396 == 4) {
							field179.method424(153, 8);
						}

						if (field396 == 5) {
							field179.method424(181, 8);
						}

						if (field396 == 6) {
							field178.method424(209, 9);
						}
					}

					if (field254[0] != -1 && (field414 != 0 || field404 % 20 < 10)) {
						field229[0].method424(29, 13);
					}

					if (field254[1] != -1 && (field414 != 1 || field404 % 20 < 10)) {
						field229[1].method424(53, 11);
					}

					if (field254[2] != -1 && (field414 != 2 || field404 % 20 < 10)) {
						field229[2].method424(82, 11);
					}

					if (field254[3] != -1 && (field414 != 3 || field404 % 20 < 10)) {
						field229[3].method424(115, 12);
					}

					if (field254[4] != -1 && (field414 != 4 || field404 % 20 < 10)) {
						field229[4].method424(153, 13);
					}

					if (field254[5] != -1 && (field414 != 5 || field404 % 20 < 10)) {
						field229[5].method424(180, 11);
					}

					if (field254[6] != -1 && (field414 != 6 || field404 % 20 < 10)) {
						field229[6].method424(208, 13);
					}
				}

				field211.method328(516, 160, field937);
				field210.method327();
				field309.method424(0, 0);

				if (field508 == -1) {
					if (field254[field396] != -1) {
						if (field396 == 7) {
							field368.method424(42, 0);
						}

						if (field396 == 8) {
							field369.method424(74, 0);
						}

						if (field396 == 9) {
							field369.method424(102, 0);
						}

						if (field396 == 10) {
							field370.method424(130, 1);
						}

						if (field396 == 11) {
							field372.method424(173, 0);
						}

						if (field396 == 12) {
							field372.method424(201, 0);
						}

						if (field396 == 13) {
							field371.method424(229, 0);
						}
					}

					if (field254[8] != -1 && (field414 != 8 || field404 % 20 < 10)) {
						field229[7].method424(74, 2);
					}

					if (field254[9] != -1 && (field414 != 9 || field404 % 20 < 10)) {
						field229[8].method424(102, 3);
					}

					if (field254[10] != -1 && (field414 != 10 || field404 % 20 < 10)) {
						field229[9].method424(137, 4);
					}

					if (field254[11] != -1 && (field414 != 11 || field404 % 20 < 10)) {
						field229[10].method424(174, 2);
					}

					if (field254[12] != -1 && (field414 != 12 || field404 % 20 < 10)) {
						field229[11].method424(201, 2);
					}

					if (field254[13] != -1 && (field414 != 13 || field404 % 20 < 10)) {
						field229[12].method424(226, 2);
					}
				}

				field210.method328(496, 466, field937);
				field461.method327();
				NQTCRWWR.field970 = field428;
			}

			if (field277) {
				field277 = false;
				field209.method327();
				field308.method424(0, 0);
				field184.method233(28, 0xFFFFFF, true, 55, "Public chat");

				if (field243 == 0) {
					field184.method233(41, 0xFF00, true, 55, "On");
				}

				if (field243 == 1) {
					field184.method233(41, 0xFFFF00, true, 55, "Friends");
				}

				if (field243 == 2) {
					field184.method233(41, 0xFF0000, true, 55, "Off");
				}

				if (field243 == 3) {
					field184.method233(41, 0xFFFF, true, 55, "Hide");
				}

				field184.method233(28, 0xFFFFFF, true, 184, "Private chat");

				if (field479 == 0) {
					field184.method233(41, 0xFF00, true, 184, "On");
				}

				if (field479 == 1) {
					field184.method233(41, 0xFFFF00, true, 184, "Friends");
				}

				if (field479 == 2) {
					field184.method233(41, 0xFF0000, true, 184, "Off");
				}

				field184.method233(28, 0xFFFFFF, true, 324, "Trade/compete");

				if (field174 == 0) {
					field184.method233(41, 0xFF00, true, 324, "On");
				}

				if (field174 == 1) {
					field184.method233(41, 0xFFFF00, true, 324, "Friends");
				}

				if (field174 == 2) {
					field184.method233(41, 0xFF0000, true, 324, "Off");
				}

				field184.method233(33, 0xFFFFFF, true, 458, "Report abuse");
				field209.method328(0, 453, field937);
				field461.method327();
				NQTCRWWR.field970 = field428;
			}

			field220 = 0;
		} else {
			if (field285 == 2) {
				method81(field220, field528);

				if (field520 != -1) {
					method81(field220, field520);
				}

				field220 = 0;
				method64();
				field938.method327();
				NQTCRWWR.field970 = field429;
				BAXODNVH.method20();
				field513 = true;
				WJQTPVDG var1 = WJQTPVDG.method577(field528);
				if (var1.field1367 == 512 && var1.field1374 == 334 && var1.field1354 == 0) {
					var1.field1367 = 765;
					var1.field1374 = 503;
				}

				method115(0, var1, 0, 0);

				if (field520 != -1) {
					WJQTPVDG var2 = WJQTPVDG.method577(field520);
					if (var2.field1367 == 512 && var2.field1374 == 334 && var2.field1354 == 0) {
						var2.field1367 = 765;
						var2.field1374 = 503;
					}

					method115(0, var2, 0, 0);
				}

				if (field373) {
					method141();
				} else {
					method165();
					method151();
				}
			}

			field938.method328(0, 0, field937);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method76() {
		if (field116 == 0) {
			int var1 = field935 / 2 - 80;
			int var2 = field936 / 2 + 20;
			var2 += 20;
			if (field951 == 1 && field952 >= var1 - 75 && field952 <= var1 + 75 && field953 >= var2 - 20 && field953 <= var2 + 20) {
				field116 = 3;
				field182 = 0;
			}

			int var3 = field935 / 2 + 80;
			if (field951 == 1 && field952 >= var3 - 75 && field952 <= var3 + 75 && field953 >= var2 - 20 && field953 <= var2 + 20) {
				field535 = "";
				field536 = "Enter your username & password.";
				field116 = 2;
				field182 = 0;
			}
		} else if (field116 == 2) {
			int var4 = field936 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field951 == 1 && field953 >= var4 - 15 && field953 < var4) {
				field182 = 0;
			}

			var4 += 15;
			if (field951 == 1 && field953 >= var4 - 15 && field953 < var4) {
				field182 = 1;
			}

			var4 += 15;
			int var5 = field935 / 2 - 80;
			int var6 = field936 / 2 + 50;
			var6 += 20;
			if (field951 == 1 && field952 >= var5 - 75 && field952 <= var5 + 75 && field953 >= var6 - 20 && field953 <= var6 + 20) {
				field417 = 0;
				method63(field348, field349, false);

				if (field107) {
					return;
				}
			}

			int var7 = field935 / 2 + 80;
			if (field951 == 1 && field952 >= var7 - 75 && field952 <= var7 + 75 && field953 >= var6 - 20 && field953 <= var6 + 20) {
				field116 = 0;
				field348 = "";
				field349 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method401();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field333.length(); var10++) {
					if (var8 == field333.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field182 == 0) {
					if (var8 == 8 && field348.length() > 0) {
						field348 = field348.substring(0, field348.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field182 = 1;
					}

					if (var9) {
						field348 = field348 + (char) var8;
					}

					if (field348.length() > 12) {
						field348 = field348.substring(0, 12);
					}
				} else if (field182 == 1) {
					if (var8 == 8 && field349.length() > 0) {
						field349 = field349.substring(0, field349.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field182 = 0;
					}

					if (var9) {
						field349 = field349 + (char) var8;
					}

					if (field349.length() > 20) {
						field349 = field349.substring(0, 20);
					}
				}
			}
		} else if (field116 == 3) {
			int var11 = field935 / 2;
			int var12 = field936 / 2 + 50;
			var12 += 20;
			if (field951 == 1 && field952 >= var11 - 75 && field952 <= var11 + 75 && field953 >= var12 - 20 && field953 <= var12 + 20) {
				field116 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILHAWWMNZR;)V")
	public final void method77(HAWWMNZR arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field750 == 0) {
			var2 = field511.method474(arg0.field749, arg0.field751, arg0.field752);
		}

		if (arg0.field750 == 1) {
			var2 = field511.method475(arg0.field751, arg0.field749, arg0.field752);
		}

		if (arg0.field750 == 2) {
			var2 = field511.method476(arg0.field749, arg0.field751, arg0.field752);
		}

		if (arg0.field750 == 3) {
			var2 = field511.method477(arg0.field749, arg0.field751, arg0.field752);
		}

		if (var2 != 0) {
			int var6 = field511.method478(arg0.field749, arg0.field751, arg0.field752, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field743 = var3;
		arg0.field745 = var4;
		arg0.field744 = var5;
	}

	@ObfuscatedName("client.j(Z)Z")
	public final boolean method78() {
		if (field300 == null) {
			return false;
		}

		try {
			int var1 = field300.method548();
			if (var1 == 0) {
				return false;
			}

			if (field515 == -1) {
				field300.method549(field251.field539, 0, 1);
				field515 = field251.field539[0] & 0xFF;
				if (field403 != null) {
					field515 = field515 - field403.method437() & 0xFF;
				}

				field514 = SSQEOKFQ.field1131[field515];
				var1--;
			}

			if (field514 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field300.method549(field251.field539, 0, 1);
				field514 = field251.field539[0] & 0xFF;
				var1--;
			}

			if (field514 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field300.method549(field251.field539, 0, 2);
				field251.field540 = 0;
				field514 = field251.method196();
				var1 -= 2;
			}

			if (var1 < field514) {
				return false;
			}

			field251.field540 = 0;
			field300.method549(field251.field539, 0, field514);
			field516 = 0;
			field307 = field306;
			field306 = field305;
			field305 = field515;

			if (field515 == 169) {
				int var2 = field251.method221();
				byte var3 = field251.method215();
				field132[var2] = var3;

				if (field226[var2] != var3) {
					field226[var2] = var3;
					method39(var2);
					field405 = true;

					if (field319 != -1) {
						field473 = true;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 86) {
				int var4 = field251.method197();
				int var5 = field251.method222();
				WJQTPVDG var6 = WJQTPVDG.method577(var5);
				if (var6.field1405 != var4 || var4 == -1) {
					var6.field1405 = var4;
					var6.field1356 = 0;
					var6.field1404 = 0;
				}

				field515 = -1;
				return true;
			}

			if (field515 == 79) {
				if (field396 == 12) {
					field405 = true;
				}

				field110 = field251.method194();
				field515 = -1;
				return true;
			}

			if (field515 == 248) {
				field237 = true;
				field503 = field251.method194();
				field504 = field251.method194();
				field505 = field251.method196();
				field506 = field251.method194();
				field507 = field251.method194();
				if (field507 >= 100) {
					field155 = field503 * 128 + 64;
					field157 = field504 * 128 + 64;
					field156 = method60(field157, field440, field155) - field505;
				}

				field515 = -1;
				return true;
			}

			if (field515 == 117) {
				field405 = true;
				int var7 = field251.method196();
				WJQTPVDG var8 = WJQTPVDG.method577(var7);
				while (field251.field540 < field514) {
					int var9 = field251.method208();
					int var10 = field251.method196();
					int var11 = field251.method194();
					if (var11 == 255) {
						var11 = field251.method199();
					}

					if (var9 >= 0 && var9 < var8.field1373.length) {
						var8.field1373[var9] = var10;
						var8.field1379[var9] = var11;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 252) {
				int var12 = field251.method223();
				int var13 = field251.method223();
				int var14 = var13 >> 10 & 0x1F;
				int var15 = var13 >> 5 & 0x1F;
				int var16 = var13 & 0x1F;
				WJQTPVDG.method577(var12).field1344 = (var16 << 3) + (var14 << 19) + (var15 << 11);
				field515 = -1;
				return true;
			}

			if (field515 == 89) {
				boolean var17 = field251.method212() == 1;
				int var18 = field251.method222();
				WJQTPVDG.method577(var18).field1360 = var17;
				field515 = -1;
				return true;
			}

			if (field515 == 94) {
				field510 = field251.method194();
				field405 = true;
				field515 = -1;
				return true;
			}

			if (field515 == 200) {
				int var19 = field251.method221();
				int var20 = field251.method222();
				method119(var19);

				if (var20 != -1) {
					method119(var20);
				}

				if (field399 != -1) {
					method161(field399);
					field399 = -1;
				}

				if (field508 != -1) {
					method161(field508);
					field508 = -1;
				}

				if (field538 != -1) {
					method161(field538);
					field538 = -1;
				}

				if (field528 != var19) {
					method161(field528);
					field528 = var19;
				}

				if (field520 != var19) {
					method161(field520);
					field520 = var20;
				}

				field273 = 0;
				field413 = false;
				field515 = -1;
				return true;
			}

			if (field515 == 173) {
				int var21 = field251.method196();
				if (var21 == 0xFFFF) {
					var21 = -1;
				}

				if (field316 != var21 && field221 && !field247 && field367 == 0) {
					field471 = var21;
					field472 = true;
					field526.method540(2, field471);
				}

				field316 = var21;
				field515 = -1;
				return true;
			}

			if (field515 == 43) {
				int var22 = field251.method221();
				int var23 = field251.method225();
				if (field221 && !field247) {
					field471 = var22;
					field472 = false;
					field526.method540(2, field471);
					field367 = var23;
				}

				field515 = -1;
				return true;
			}

			if (field515 == 112) {
				field463 = field251.method214();
				field464 = field251.method214();
				field515 = -1;
				return true;
			}

			if (field515 == 119) {
				int var24 = field251.method223();
				method119(var24);

				if (field538 != -1) {
					method161(field538);
					field538 = -1;
					field473 = true;
				}

				if (field528 != -1) {
					method161(field528);
					field528 = -1;
					field513 = true;
				}

				if (field520 != -1) {
					method161(field520);
					field520 = -1;
				}

				if (field399 != -1) {
					method161(field399);
					field399 = -1;
				}

				if (field508 != var24) {
					method161(field508);
					field508 = var24;
				}

				if (field273 != 0) {
					field273 = 0;
					field473 = true;
				}

				field405 = true;
				field173 = true;
				field413 = false;
				field515 = -1;
				return true;
			}

			if (field515 == 109) {
				field405 = true;
				int var25 = field251.method227();
				int var26 = field251.method212();
				int var27 = field251.method214();
				field162[var27] = var25;
				field238[var27] = var26;
				field407[var27] = 1;
				for (int var28 = 0; var28 < 98; var28++) {
					if (var25 >= field318[var28]) {
						field407[var27] = var28 + 2;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 121) {
				for (int var29 = 0; var29 < field226.length; var29++) {
					if (field226[var29] != field132[var29]) {
						field226[var29] = field132[var29];
						method39(var29);
						field405 = true;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 251) {
				field425 = field251.method196() * 30;
				field515 = -1;
				return true;
			}

			if (field515 == 188) {
				method145(field251, field514);
				field291 = false;
				field515 = -1;
				return true;
			}

			if (field515 == 253) {
				field396 = field251.method194();
				field405 = true;
				field173 = true;
				field515 = -1;
				return true;
			}

			if (field515 == 29) {
				int var30 = field251.method228();
				int var31 = field251.method222();
				field132[var31] = var30;

				if (field226[var31] != var30) {
					field226[var31] = var30;
					method39(var31);
					field405 = true;

					if (field319 != -1) {
						field473 = true;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 48) {
				field149 = field251.method194();
				field515 = -1;
				return true;
			}

			if (field515 == 33) {
				if (field508 != -1) {
					method161(field508);
					field508 = -1;
					field405 = true;
					field173 = true;
				}

				if (field538 != -1) {
					method161(field538);
					field538 = -1;
					field473 = true;
				}

				if (field528 != -1) {
					method161(field528);
					field528 = -1;
					field513 = true;
				}

				if (field520 != -1) {
					method161(field520);
					field520 = -1;
				}

				if (field399 != -1) {
					method161(field399);
					field399 = -1;
				}

				if (field273 != 0) {
					field273 = 0;
					field473 = true;
				}

				field413 = false;
				field515 = -1;
				return true;
			}

			if (field515 == 62) {
				String var32 = field251.method201();
				if (var32.endsWith(":tradereq:")) {
					String var33 = var32.substring(0, var32.indexOf(":"));
					long var34 = ZLGGMMMS.method597(var33);
					boolean var36 = false;
					for (int var37 = 0; var37 < field525; var37++) {
						if (field406[var37] == var34) {
							var36 = true;
							break;
						}
					}

					if (!var36 && field455 == 0) {
						method114(var33, "wishes to trade with you.", 4);
					}
				} else if (var32.endsWith(":duelreq:")) {
					String var38 = var32.substring(0, var32.indexOf(":"));
					long var39 = ZLGGMMMS.method597(var38);
					boolean var41 = false;
					for (int var42 = 0; var42 < field525; var42++) {
						if (field406[var42] == var39) {
							var41 = true;
							break;
						}
					}

					if (!var41 && field455 == 0) {
						method114(var38, "wishes to duel with you.", 8);
					}
				} else if (var32.endsWith(":chalreq:")) {
					String var43 = var32.substring(0, var32.indexOf(":"));
					long var44 = ZLGGMMMS.method597(var43);
					boolean var46 = false;
					for (int var47 = 0; var47 < field525; var47++) {
						if (field406[var47] == var44) {
							var46 = true;
							break;
						}
					}

					if (!var46 && field455 == 0) {
						String var48 = var32.substring(var32.indexOf(":") + 1, var32.length() - 9);
						method114(var43, var48, 8);
					}
				} else {
					method114("", var32, 0);
				}

				field515 = -1;
				return true;
			}

			if (field515 == 234) {
				long var49 = field251.method200();
				int var51 = field251.method194();
				String var52 = ZLGGMMMS.method601(ZLGGMMMS.method598(var49));
				for (int var53 = 0; var53 < field509; var53++) {
					if (field374[var53] == var49) {
						if (field376[var53] != var51) {
							field376[var53] = var51;
							field405 = true;

							if (var51 > 0) {
								method114("", var52 + " has logged in.", 5);
							}

							if (var51 == 0) {
								method114("", var52 + " has logged out.", 5);
							}
						}

						var52 = null;
						break;
					}
				}

				if (var52 != null && field509 < 200) {
					field374[field509] = var49;
					field170[field509] = var52;
					field376[field509] = var51;
					field509++;
					field405 = true;
				}

				boolean var54 = false;
				while (!var54) {
					var54 = true;
					for (int var55 = 0; var55 < field509 - 1; var55++) {
						if (field376[var55] != field244 && field376[var55 + 1] == field244 || field376[var55] == 0 && field376[var55 + 1] != 0) {
							int var56 = field376[var55];
							field376[var55] = field376[var55 + 1];
							field376[var55 + 1] = var56;
							String var57 = field170[var55];
							field170[var55] = field170[var55 + 1];
							field170[var55 + 1] = var57;
							long var58 = field374[var55];
							field374[var55] = field374[var55 + 1];
							field374[var55 + 1] = var58;
							field405 = true;
							var54 = false;
						}
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 162) {
				field237 = false;

				for (int var60 = 0; var60 < 5; var60++) {
					field477[var60] = false;
				}

				field515 = -1;
				return true;
			}

			if (field515 == 153) {
				int var61 = field251.method224();
				if (field319 != var61) {
					method161(field319);
					field319 = var61;
				}

				field473 = true;
				field515 = -1;
				return true;
			}

			if (field515 == 84) {
				field525 = field514 / 8;
				for (int var62 = 0; var62 < field525; var62++) {
					field406[var62] = field251.method200();
				}

				field515 = -1;
				return true;
			}

			if (field515 == 134) {
				field414 = field251.method212();
				if (field414 == field396) {
					if (field414 == 3) {
						field396 = 1;
					} else {
						field396 = 3;
					}

					field405 = true;
				}

				field515 = -1;
				return true;
			}

			if (field515 == 220) {
				int var63 = field251.method222();
				int var64 = field251.method221();
				WJQTPVDG.method577(var63).field1375 = 1;
				WJQTPVDG.method577(var63).field1376 = var64;
				field515 = -1;
				return true;
			}

			if (field515 == 238) {
				method56();
				field515 = -1;
				return false;
			}

			if (field515 == 244) {
				int var65 = field251.method224();
				int var66 = field251.method221();
				int var67 = field251.method224();
				WJQTPVDG var68 = WJQTPVDG.method577(var66);
				var68.field1381 = var67;
				var68.field1340 = var65;
				field515 = -1;
				return true;
			}

			if (field515 == 41) {
				field463 = field251.method213();
				field464 = field251.method214();
				for (int var69 = field463; var69 < field463 + 8; var69++) {
					for (int var70 = field464; var70 < field464 + 8; var70++) {
						if (field537[field440][var69][var70] != null) {
							field537[field440][var69][var70] = null;
							method148(var69, var70);
						}
					}
				}

				for (HAWWMNZR var71 = (HAWWMNZR) field384.method567(); var71 != null; var71 = (HAWWMNZR) field384.method569()) {
					if (var71.field751 >= field463 && var71.field751 < field463 + 8 && var71.field752 >= field464 && var71.field752 < field464 + 8 && field440 == var71.field749) {
						var71.field742 = 0;
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 57) {
				long var72 = field251.method200();
				int var74 = field251.method199();
				int var75 = field251.method194();
				boolean var76 = false;
				for (int var77 = 0; var77 < 100; var77++) {
					if (field475[var77] == var74) {
						var76 = true;
						break;
					}
				}

				if (var75 <= 1) {
					for (int var78 = 0; var78 < field525; var78++) {
						if (field406[var78] == var72) {
							var76 = true;
							break;
						}
					}
				}

				if (!var76 && field455 == 0) {
					try {
						field475[field189] = var74;
						field189 = (field189 + 1) % 100;
						String var79 = SQKAIUXX.method444(field514 - 13, field251);
						if (var75 != 3) {
							var79 = MOLFGQQL.method369(var79);
						}

						if (var75 == 2 || var75 == 3) {
							method114("@cr2@" + ZLGGMMMS.method601(ZLGGMMMS.method598(var72)), var79, 7);
						} else if (var75 == 1) {
							method114("@cr1@" + ZLGGMMMS.method601(ZLGGMMMS.method598(var72)), var79, 7);
						} else {
							method114(ZLGGMMMS.method601(ZLGGMMMS.method598(var72)), var79, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field515 = -1;
				return true;
			}

			if (field515 == 167) {
				field412 = field251.method221();
				field365 = field251.method223();
				field251.method222();
				field251.method222();
				field98 = field251.method221();
				field251.method214();
				field521 = field251.method196();
				field278 = field251.method196();
				field134 = field251.method228();
				field251.method222();
				field124 = field251.method221();
				signlink.dnslookup(ZLGGMMMS.method600(field134));
				field515 = -1;
				return true;
			}

			if (field515 == 32) {
				String var81 = field251.method201();
				int var82 = field251.method213();
				int var83 = field251.method212();
				if (var83 >= 1 && var83 <= 5) {
					if (var81.equalsIgnoreCase("null")) {
						var81 = null;
					}

					field410[var83 - 1] = var81;
					field411[var83 - 1] = var82 == 0;
				}

				field515 = -1;
				return true;
			}

			if (field515 != 221 && field515 != 141) {
				if (field515 == 160) {
					field118 = field251.method194();
					if (field118 == 1) {
						field222 = field251.method196();
					}

					if (field118 >= 2 && field118 <= 6) {
						if (field118 == 2) {
							field207 = 64;
							field208 = 64;
						}

						if (field118 == 3) {
							field207 = 0;
							field208 = 64;
						}

						if (field118 == 4) {
							field207 = 128;
							field208 = 64;
						}

						if (field118 == 5) {
							field207 = 64;
							field208 = 0;
						}

						if (field118 == 6) {
							field207 = 64;
							field208 = 128;
						}

						field118 = 2;
						field204 = field251.method196();
						field205 = field251.method196();
						field206 = field251.method194();
					}

					if (field118 == 10) {
						field120 = field251.method196();
					}

					field515 = -1;
					return true;
				}

				if (field515 == 177) {
					field243 = field251.method194();
					field479 = field251.method194();
					field174 = field251.method194();
					field277 = true;
					field473 = true;
					field515 = -1;
					return true;
				}

				if (field515 == 209) {
					int var134 = field251.method213();
					int var135 = field251.method222();
					if (var135 == 0xFFFF) {
						var135 = -1;
					}

					if (field254[var134] != var135) {
						method161(field254[var134]);
						field254[var134] = var135;
					}

					field405 = true;
					field173 = true;
					field515 = -1;
					return true;
				}

				if (field515 == 23) {
					field123 = field251.method196();
					field121 = field251.method194();
					field515 = -1;
					return true;
				}

				if (field515 != 151) {
					if (field515 == 54) {
						int var137 = field251.method221();
						WJQTPVDG var138 = WJQTPVDG.method577(var137);
						for (int var139 = 0; var139 < var138.field1373.length; var139++) {
							var138.field1373[var139] = -1;
							var138.field1373[var139] = 0;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 126 || field515 == 110 || field515 == 193 || field515 == 132 || field515 == 102 || field515 == 85 || field515 == 118 || field515 == 142 || field515 == 80 || field515 == 203 || field515 == 38) {
						method111(field515, field251);
						field515 = -1;
						return true;
					}

					if (field515 == 186) {
						field383 = false;
						field273 = 2;
						field301 = "";
						field473 = true;
						field515 = -1;
						return true;
					}

					if (field515 == 88) {
						int var140 = field251.method223();
						method119(var140);

						if (field508 != -1) {
							method161(field508);
							field508 = -1;
							field405 = true;
							field173 = true;
						}

						if (field538 != -1) {
							method161(field538);
							field538 = -1;
							field473 = true;
						}

						if (field528 != -1) {
							method161(field528);
							field528 = -1;
							field513 = true;
						}

						if (field520 != -1) {
							method161(field520);
							field520 = -1;
						}

						if (field399 != var140) {
							method161(field399);
							field399 = var140;
						}

						if (field273 != 0) {
							field273 = 0;
							field473 = true;
						}

						field413 = false;
						field515 = -1;
						return true;
					}

					if (field515 == 93) {
						int var141 = field251.method224();
						if (var141 >= 0) {
							method119(var141);
						}

						if (field295 != var141) {
							method161(field295);
							field295 = var141;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 166) {
						int var142 = field251.method196();
						int var143 = field251.method222();
						int var144 = field251.method223();

						if (var142 == 0xFFFF) {
							WJQTPVDG.method577(var143).field1375 = 0;
							field515 = -1;
							return true;
						}

						KIHBVNFV var145 = KIHBVNFV.method346(var142);
						WJQTPVDG.method577(var143).field1375 = 4;
						WJQTPVDG.method577(var143).field1376 = var142;
						WJQTPVDG.method577(var143).field1337 = var145.field855;
						WJQTPVDG.method577(var143).field1338 = var145.field885;
						WJQTPVDG.method577(var143).field1336 = var145.field862 * 100 / var144;
						field515 = -1;
						return true;
					}

					if (field515 == 14) {
						field405 = true;
						int var146 = field251.method196();
						WJQTPVDG var147 = WJQTPVDG.method577(var146);
						int var148 = field251.method196();
						for (int var149 = 0; var149 < var148; var149++) {
							var147.field1373[var149] = field251.method223();
							int var150 = field251.method213();
							if (var150 == 255) {
								var150 = field251.method199();
							}

							var147.field1379[var149] = var150;
						}

						for (int var151 = var148; var151 < var147.field1373.length; var151++) {
							var147.field1373[var151] = 0;
							var147.field1379[var151] = 0;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 24) {
						field383 = false;
						field273 = 1;
						field301 = "";
						field473 = true;
						field515 = -1;
						return true;
					}

					if (field515 == 133) {
						String var152 = field251.method201();
						int var153 = field251.method223();
						WJQTPVDG.method577(var153).field1370 = var152;

						if (field254[field396] == WJQTPVDG.method577(var153).field1378) {
							field405 = true;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 156) {
						int var154 = field251.method196();
						int var155 = field251.method223();
						WJQTPVDG var156 = WJQTPVDG.method577(var155);
						if (var156 != null && var156.field1354 == 0) {
							if (var154 < 0) {
								var154 = 0;
							}

							if (var154 > var156.field1362 - var156.field1374) {
								var154 = var156.field1362 - var156.field1374;
							}

							var156.field1357 = var154;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 2) {
						field270 = 0;
						field515 = -1;
						return true;
					}

					if (field515 == 68) {
						method155(field251, field514);
						field515 = -1;
						return true;
					}

					if (field515 == 96) {
						int var157 = field251.method196();
						int var158 = field251.method194();
						int var159 = field251.method196();
						if (var159 == 0xFFFF) {
							if (field351 < 50) {
								field172[field351] = (short) var157;
								field274[field351] = var158;
								field292[field351] = 0;
								field351++;
							}
						} else if (field350 && !field247 && field351 < 50) {
							field172[field351] = var157;
							field274[field351] = var158;
							field292[field351] = ADSZDTIC.field9[var157] + var159;
							field351++;
						}

						field515 = -1;
						return true;
					}

					if (field515 == 185) {
						int var160 = field251.method223();
						int var161 = field251.method223();
						WJQTPVDG.method577(var160).field1375 = 2;
						WJQTPVDG.method577(var160).field1376 = var161;
						field515 = -1;
						return true;
					}

					if (field515 == 95) {
						int var162 = field251.method221();
						WJQTPVDG.method577(var162).field1375 = 3;

						if (field335.field898 == null) {
							WJQTPVDG.method577(var162).field1376 = (field335.field921[11] << 5) + (field335.field921[8] << 10) + (field335.field921[0] << 15) + (field335.field919[0] << 25) + (field335.field919[4] << 20) + field335.field921[1];
						} else {
							WJQTPVDG.method577(var162).field1376 = (int) (field335.field898.field1250 + 0x12345678L);
						}

						field515 = -1;
						return true;
					}

					if (field515 == 165) {
						int var163 = field251.method223();
						int var164 = field251.method223();
						int var165 = field251.method222();
						WJQTPVDG.method577(var164).field1349 = (var163 << 16) + var165;
						field515 = -1;
						return true;
					}

					if (field515 == 25) {
						int var166 = field251.method194();
						int var167 = field251.method194();
						int var168 = field251.method194();
						int var169 = field251.method194();
						field477[var166] = true;
						field215[var166] = var167;
						field293[var166] = var168;
						field230[var166] = var169;
						field420[var166] = 0;
						field515 = -1;
						return true;
					}

					if (field515 == 240) {
						int var170 = field251.method223();
						int var171 = field251.method196();

						if (field538 != -1) {
							method161(field538);
							field538 = -1;
							field473 = true;
						}

						if (field528 != -1) {
							method161(field528);
							field528 = -1;
							field513 = true;
						}

						if (field520 != -1) {
							method161(field520);
							field520 = -1;
						}

						if (field399 != var170) {
							method161(field399);
							field399 = var170;
						}

						if (field508 != var171) {
							method161(field508);
							field508 = var171;
						}

						if (field273 != 0) {
							field273 = 0;
							field473 = true;
						}

						field405 = true;
						field173 = true;
						field413 = false;
						field515 = -1;
						return true;
					}

					if (field515 == 226) {
						int var172 = field251.method221();
						method119(var172);

						if (field508 != -1) {
							method161(field508);
							field508 = -1;
							field405 = true;
							field173 = true;
						}

						if (field528 != -1) {
							method161(field528);
							field528 = -1;
							field513 = true;
						}

						if (field520 != -1) {
							method161(field520);
							field520 = -1;
						}

						if (field399 != -1) {
							method161(field399);
							field399 = -1;
						}

						if (field538 != var172) {
							method161(field538);
							field538 = var172;
						}

						field413 = false;
						field473 = true;
						field515 = -1;
						return true;
					}

					if (field515 == 18) {
						field444 = field251.method194();
						field515 = -1;
						return true;
					}

					if (field515 == 219) {
						for (int var173 = 0; var173 < field195.length; var173++) {
							if (field195[var173] != null) {
								field195[var173].field1105 = -1;
							}
						}

						for (int var174 = 0; var174 < field127.length; var174++) {
							if (field127[var174] != null) {
								field127[var174].field1105 = -1;
							}
						}

						field515 = -1;
						return true;
					}

					if (field515 == 13) {
						int var175 = field251.method196();
						int var176 = field251.method222();
						int var177 = field251.method223();
						int var178 = field251.method222();
						WJQTPVDG.method577(var176).field1337 = var177;
						WJQTPVDG.method577(var176).field1338 = var178;
						WJQTPVDG.method577(var176).field1336 = var175;
						field515 = -1;
						return true;
					}

					if (field515 == 241) {
						if (field396 == 12) {
							field405 = true;
						}

						field330 = field251.method197();
						field515 = -1;
						return true;
					}

					if (field515 == 137) {
						field237 = true;
						field465 = field251.method194();
						field466 = field251.method194();
						field467 = field251.method196();
						field468 = field251.method194();
						field469 = field251.method194();
						if (field469 >= 100) {
							int var179 = field465 * 128 + 64;
							int var180 = field466 * 128 + 64;
							int var181 = method60(var180, field440, var179) - field467;
							int var182 = var179 - field155;
							int var183 = var181 - field156;
							int var184 = var180 - field157;
							int var185 = (int) Math.sqrt(var182 * var182 + var184 * var184);
							field158 = (int) (Math.atan2(var183, var185) * 325.949D) & 0x7FF;
							field159 = (int) (Math.atan2(var182, var184) * -325.949D) & 0x7FF;

							if (field158 < 128) {
								field158 = 128;
							}

							if (field158 > 383) {
								field158 = 383;
							}
						}

						field515 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field515 + "," + field514 + " - " + field306 + "," + field307);
					method56();
					return true;
				}

				field464 = field251.method212();
				field463 = field251.method214();

				while (field251.field540 < field514) {
					int var136 = field251.method194();
					method111(var136, field251);
				}

				field515 = -1;
				return true;
			}

			int var84 = field328;
			int var85 = field329;
			if (field515 == 221) {
				var84 = field251.method222();
				var85 = field251.method222();
				field430 = false;
			}

			if (field515 == 141) {
				field251.method204();

				for (int var86 = 0; var86 < 4; var86++) {
					for (int var87 = 0; var87 < 13; var87++) {
						for (int var88 = 0; var88 < 13; var88++) {
							int var89 = field251.method205(1);
							if (var89 == 1) {
								field227[var86][var87][var88] = field251.method205(26);
							} else {
								field227[var86][var87][var88] = -1;
							}
						}
					}
				}

				field251.method206();
				var84 = field251.method223();
				var85 = field251.method223();
				field430 = true;
			}

			if (field328 == var84 && field329 == var85 && field285 == 2) {
				field515 = -1;
				return true;
			}

			field328 = var84;
			field329 = var85;
			field389 = (field328 - 6) * 8;
			field390 = (field329 - 6) * 8;
			field366 = false;
			if ((field328 / 8 == 48 || field328 / 8 == 49) && field329 / 8 == 48) {
				field366 = true;
			}

			if (field328 / 8 == 48 && field329 / 8 == 148) {
				field366 = true;
			}

			field285 = 1;
			field451 = System.currentTimeMillis();
			method57(null, "Loading - please wait.");

			if (field515 == 221) {
				int var90 = 0;
				for (int var91 = (field328 - 6) / 8; var91 <= (field328 + 6) / 8; var91++) {
					for (int var92 = (field329 - 6) / 8; var92 <= (field329 + 6) / 8; var92++) {
						var90++;
					}
				}

				field125 = new byte[var90][];
				field276 = new byte[var90][];
				field447 = new int[var90];
				field448 = new int[var90];
				field449 = new int[var90];
				int var93 = 0;
				for (int var94 = (field328 - 6) / 8; var94 <= (field328 + 6) / 8; var94++) {
					for (int var95 = (field329 - 6) / 8; var95 <= (field329 + 6) / 8; var95++) {
						field447[var93] = (var94 << 8) + var95;

						if (field366 && (var95 == 49 || var95 == 149 || var95 == 147 || var94 == 50 || var94 == 49 && var95 == 47)) {
							field448[var93] = -1;
							field449[var93] = -1;
							var93++;
						} else {
							int var96 = field448[var93] = field526.method538(var94, 0, var95);
							if (var96 != -1) {
								field526.method540(3, var96);
							}

							int var97 = field449[var93] = field526.method538(var94, 1, var95);
							if (var97 != -1) {
								field526.method540(3, var97);
							}

							var93++;
						}
					}
				}
			}

			if (field515 == 141) {
				int var98 = 0;
				int[] var99 = new int[676];
				for (int var100 = 0; var100 < 4; var100++) {
					for (int var101 = 0; var101 < 13; var101++) {
						for (int var102 = 0; var102 < 13; var102++) {
							int var103 = field227[var100][var101][var102];
							if (var103 != -1) {
								int var104 = var103 >> 14 & 0x3FF;
								int var105 = var103 >> 3 & 0x7FF;
								int var106 = (var104 / 8 << 8) + var105 / 8;
								for (int var107 = 0; var107 < var98; var107++) {
									if (var99[var107] == var106) {
										var106 = -1;
										break;
									}
								}

								if (var106 != -1) {
									var99[var98++] = var106;
								}
							}
						}
					}
				}

				field125 = new byte[var98][];
				field276 = new byte[var98][];
				field447 = new int[var98];
				field448 = new int[var98];
				field449 = new int[var98];
				for (int var108 = 0; var108 < var98; var108++) {
					int var109 = field447[var108] = var99[var108];
					int var110 = var109 >> 8 & 0xFF;
					int var111 = var109 & 0xFF;
					int var112 = field448[var108] = field526.method538(var110, 0, var111);
					if (var112 != -1) {
						field526.method540(3, var112);
					}

					int var113 = field449[var108] = field526.method538(var110, 1, var111);
					if (var113 != -1) {
						field526.method540(3, var113);
					}
				}
			}

			int var114 = field389 - field391;
			int var115 = field390 - field392;
			field391 = field389;
			field392 = field390;

			for (int var116 = 0; var116 < 16384; var116++) {
				IGOBKPZP var117 = field127[var116];
				if (var117 != null) {
					for (int var118 = 0; var118 < 10; var118++) {
						var117.field1097[var118] -= var114;
						var117.field1098[var118] -= var115;
					}

					var117.field1110 -= var114 * 128;
					var117.field1111 -= var115 * 128;
				}
			}

			for (int var119 = 0; var119 < field193; var119++) {
				MDBQGDOL var120 = field195[var119];
				if (var120 != null) {
					for (int var121 = 0; var121 < 10; var121++) {
						var120.field1097[var121] -= var114;
						var120.field1098[var121] -= var115;
					}

					var120.field1110 -= var114 * 128;
					var120.field1111 -= var115 * 128;
				}
			}

			field291 = true;
			byte var122 = 0;
			byte var123 = 104;
			byte var124 = 1;
			if (var114 < 0) {
				var122 = 103;
				var123 = -1;
				var124 = -1;
			}

			byte var125 = 0;
			byte var126 = 104;
			byte var127 = 1;
			if (var115 < 0) {
				var125 = 103;
				var126 = -1;
				var127 = -1;
			}

			for (int var128 = var122; var128 != var123; var128 += var124) {
				for (int var129 = var125; var129 != var126; var129 += var127) {
					int var130 = var114 + var128;
					int var131 = var115 + var129;
					for (int var132 = 0; var132 < 4; var132++) {
						if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104) {
							field537[var132][var128][var129] = field537[var132][var130][var131];
						} else {
							field537[var132][var128][var129] = null;
						}
					}
				}
			}

			for (HAWWMNZR var133 = (HAWWMNZR) field384.method567(); var133 != null; var133 = (HAWWMNZR) field384.method569()) {
				var133.field751 -= var114;
				var133.field752 -= var115;
				if (var133.field751 < 0 || var133.field752 < 0 || var133.field751 >= 104 || var133.field752 >= 104) {
					var133.method1();
				}
			}

			if (field270 != 0) {
				field270 -= var114;
				field271 -= var115;
			}

			field237 = false;
			field515 = -1;
			return true;
		} catch (IOException var190) {
			method142();
		} catch (Exception var191) {
			String var187 = "T2 - " + field515 + "," + field306 + "," + field307 + " - " + field514 + "," + (field335.field1097[0] + field389) + "," + (field335.field1098[0] + field390) + " - ";
			for (int var188 = 0; var188 < field514 && var188 < 50; var188++) {
				var187 = var187 + field251.field539[var188] + ",";
			}

			signlink.reporterror(var187);
			method56();
		}

		return true;
	}

	@ObfuscatedName("client.a(ILMDBQGDOL;LCMGGUSPR;ZI)V")
	public final void method79(int arg0, MDBQGDOL arg1, CMGGUSPR arg2, int arg3) {
		if ((arg0 & 0x4) != 0) {
			int var5 = arg2.method214();
			int var6 = arg2.method214();
			arg1.method441(field404, var6, var5);
			arg1.field1118 = field404 + 300;
			arg1.field1119 = arg2.method213();
			arg1.field1120 = arg2.method213();
		}

		if ((arg0 & 0x8) != 0) {
			arg1.field1100 = arg2.method196();
			if (arg1.field1100 == 0xFFFF) {
				arg1.field1100 = -1;
			}
		}

		if ((arg0 & 0x40) != 0) {
			int var7 = arg2.method214();
			byte[] var8 = new byte[var7];
			CMGGUSPR var9 = new CMGGUSPR(var8);
			arg2.method230(0, var7, var8);
			field200[arg3] = var9;
			arg1.method358(var9);
		}

		if ((arg0 & 0x200) != 0) {
			arg1.field1078 = arg2.method221();
			int var10 = arg2.method228();
			arg1.field1082 = var10 >> 16;
			arg1.field1081 = (var10 & 0xFFFF) + field404;
			arg1.field1079 = 0;
			arg1.field1080 = 0;

			if (arg1.field1081 > field404) {
				arg1.field1079 = -1;
			}

			if (arg1.field1078 == 0xFFFF) {
				arg1.field1078 = -1;
			}
		}

		if ((arg0 & 0x2) != 0) {
			arg1.field1122 = arg2.method223();
			arg1.field1123 = arg2.method196();
		}

		if ((arg0 & 0x400) != 0) {
			arg1.field1084 = arg2.method194();
			arg1.field1086 = arg2.method194();
			arg1.field1085 = arg2.method213();
			arg1.field1087 = arg2.method213();
			arg1.field1088 = arg2.method222() + field404;
			arg1.field1089 = arg2.method222() + field404;
			arg1.field1090 = arg2.method213();
			arg1.method443();
		}

		if ((arg0 & 0x80) != 0) {
			int var11 = arg2.method223();
			int var12 = arg2.method212();
			int var13 = arg2.method212();
			int var14 = arg2.field540;

			if (arg1.field920 != null && arg1.field901) {
				long var15 = ZLGGMMMS.method597(arg1.field920);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field525; var18++) {
						if (field406[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field455 == 0) {
					try {
						field126.field540 = 0;
						arg2.method203(0, field126.field539, var13);
						field126.field540 = 0;
						String var19 = SQKAIUXX.method444(var13, field126);
						var19 = MOLFGQQL.method369(var19);
						arg1.field1116 = var19;
						arg1.field1072 = var11 >> 8;
						arg1.field1101 = var11 & 0xFF;
						arg1.field1077 = 150;

						if (var12 == 2 || var12 == 3) {
							method114("@cr2@" + arg1.field920, var19, 1);
						} else if (var12 == 1) {
							method114("@cr1@" + arg1.field920, var19, 1);
						} else {
							method114(arg1.field920, var19, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field540 = var13 + var14;
		}

		if ((arg0 & 0x10) != 0) {
			arg1.field1116 = arg2.method201();
			if (arg1.field1116.charAt(0) == '~') {
				arg1.field1116 = arg1.field1116.substring(1);
				method114(arg1.field920, arg1.field1116, 2);
			} else if (field335 == arg1) {
				method114(arg1.field920, arg1.field1116, 2);
			}

			arg1.field1072 = 0;
			arg1.field1101 = 0;
			arg1.field1077 = 150;
		}

		if ((arg0 & 0x20) != 0) {
			int var21 = arg2.method221();
			if (var21 == 0xFFFF) {
				var21 = -1;
			}

			int var22 = arg2.method213();
			if (arg1.field1105 == var21 && var21 != -1) {
				int var23 = XRDQTWLL.field1418[var21].field1432;
				if (var23 == 1) {
					arg1.field1106 = 0;
					arg1.field1107 = 0;
					arg1.field1108 = var22;
					arg1.field1109 = 0;
				}

				if (var23 == 2) {
					arg1.field1109 = 0;
				}
			} else if (var21 == -1 || arg1.field1105 == -1 || XRDQTWLL.field1418[var21].field1426 >= XRDQTWLL.field1418[arg1.field1105].field1426) {
				arg1.field1105 = var21;
				arg1.field1106 = 0;
				arg1.field1107 = 0;
				arg1.field1108 = var22;
				arg1.field1109 = 0;
				arg1.field1126 = arg1.field1114;
			}
		}

		if ((arg0 & 0x100) != 0) {
			int var24 = arg2.method212();
			int var25 = arg2.method212();
			arg1.method441(field404, var25, var24);
			arg1.field1118 = field404 + 300;
			arg1.field1119 = arg2.method214();
			arg1.field1120 = arg2.method194();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method80() {
		field112 = new OCPHNIUN(field191, "titlebox", 0);
		field113 = new OCPHNIUN(field191, "titlebutton", 0);
		field453 = new OCPHNIUN[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field453[var1] = new OCPHNIUN(field191, "runes", var1);
		}

		field523 = new TPIBHECB(128, 265);
		field524 = new TPIBHECB(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field523.field1219[var2] = field356.field786[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field524.field1219[var3] = field357.field786[var3];
		}

		field422 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field422[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field422[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field422[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field422[var7 + 192] = 0xFFFFFF;
		}

		field423 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field423[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field423[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field423[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field423[var11 + 192] = 0xFFFFFF;
		}

		field424 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field424[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field424[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field424[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field424[var15 + 192] = 0xFFFFFF;
		}

		field421 = new int[256];
		field218 = new int[32768];
		field219 = new int[32768];
		method96(null);
		field303 = new int[32768];
		field304 = new int[32768];
		method149("Connecting to fileserver", 10);

		if (!field441) {
			field442 = true;
			field441 = true;
			method97(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method81(int arg0, int arg1) {
		boolean var3 = false;
		WJQTPVDG var4 = WJQTPVDG.method577(arg1);
		for (int var5 = 0; var5 < var4.field1385.length && var4.field1385[var5] != -1; var5++) {
			WJQTPVDG var6 = WJQTPVDG.method577(var4.field1385[var5]);
			if (var6.field1354 == 0) {
				var3 |= method81(arg0, var6.field1396);
			}

			if (var6.field1354 == 6 && (var6.field1405 != -1 || var6.field1406 != -1)) {
				boolean var7 = method50(var6);
				int var8;
				if (var7) {
					var8 = var6.field1406;
				} else {
					var8 = var6.field1405;
				}

				if (var8 != -1) {
					XRDQTWLL var9 = XRDQTWLL.field1418[var8];
					var6.field1404 += arg0;
					while (var6.field1404 > var9.method583(var6.field1356)) {
						var6.field1404 -= var9.method583(var6.field1356) + 1;
						var6.field1356++;
						if (var6.field1356 >= var9.field1419) {
							var6.field1356 -= var9.field1423;
							if (var6.field1356 < 0 || var6.field1356 >= var9.field1419) {
								var6.field1356 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1354 == 6 && var6.field1349 != 0) {
				int var10 = var6.field1349 >> 16;
				int var11 = var6.field1349 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1337 = var6.field1337 + var10 & 0x7FF;
				var6.field1338 = var6.field1338 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(LWJQTPVDG;I)Z")
	public final boolean method82(WJQTPVDG arg0) {
		int var2 = arg0.field1345;
		if (field510 == 2) {
			if (var2 == 201) {
				field473 = true;
				field273 = 0;
				field383 = true;
				field289 = "";
				field290 = 1;
				field283 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field473 = true;
				field273 = 0;
				field383 = true;
				field289 = "";
				field290 = 2;
				field283 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field518 = 250;
			return true;
		}

		if (var2 == 501) {
			field473 = true;
			field273 = 0;
			field383 = true;
			field289 = "";
			field290 = 4;
			field283 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field473 = true;
			field273 = 0;
			field383 = true;
			field289 = "";
			field290 = 5;
			field283 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field336[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = CFPLMOQH.field90 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= CFPLMOQH.field90) {
							var5 = 0;
						}
					}

					if (!CFPLMOQH.field91[var5].field97 && CFPLMOQH.field91[var5].field92 == var3 + (field534 ? 0 : 7)) {
						break;
					}
				}

				field336[var3] = var5;
				field315 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field488[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field169[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field169[var6].length) {
					var8 = 0;
				}
			}

			field488[var6] = var8;
			field315 = true;
		}

		if (var2 == 324 && !field534) {
			field534 = true;
			method134();
		}

		if (var2 == 325 && field534) {
			field534 = false;
			method134();
		}

		if (var2 == 326) {
			field288.method183(124);
			field288.method184(field534 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field288.method184(field336[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field288.method184(field488[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field106 = !field106;
		}

		if (var2 >= 601 && var2 <= 613) {
			method93();

			if (field375.length() > 0) {
				field288.method183(207);
				field288.method190(ZLGGMMMS.method597(field375));
				field288.method184(var2 - 601);
				field288.method184(field106 ? 1 : 0);
			}
		}

		return false;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg5 >= 1 && arg4 <= 102 && arg5 <= 102) {
			if (field247 && field440 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field511.method474(arg6, arg4, arg5);
			}

			if (arg3 == 1) {
				var8 = field511.method475(arg4, arg6, arg5);
			}

			if (arg3 == 2) {
				var8 = field511.method476(arg6, arg4, arg5);
			}

			if (arg3 == 3) {
				var8 = field511.method477(arg6, arg4, arg5);
			}

			if (var8 != 0) {
				int var12 = field511.method478(arg6, arg4, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field511.method465(arg4, arg6, arg5);
					YJMLCFGC var16 = YJMLCFGC.method596(var13);
					if (var16.field1459) {
						field281[arg6].method557(var14, var16.field1450, arg5, var15, arg4);
					}
				}

				if (arg3 == 1) {
					field511.method466(arg4, arg5, arg6);
				}

				if (arg3 == 2) {
					field511.method467(arg6, arg5, arg4);
					YJMLCFGC var17 = YJMLCFGC.method596(var13);
					if (var17.field1469 + arg4 > 103 || var17.field1469 + arg5 > 103 || var17.field1479 + arg4 > 103 || var17.field1479 + arg5 > 103) {
						return;
					}

					if (var17.field1459) {
						field281[arg6].method558(arg4, arg5, var15, var17.field1450, var17.field1479, var17.field1469);
					}
				}

				if (arg3 == 3) {
					field511.method468(arg4, arg6, arg5);
					YJMLCFGC var18 = YJMLCFGC.method596(var13);
					if (var18.field1459 && var18.field1475) {
						field281[arg6].method560(arg5, arg4);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field165[1][arg4][arg5] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				IPCPGCKM.method306(arg5, field431, var19, field511, arg4, arg2, field281[arg6], arg6, arg0, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method84() {
		try {
			int var1 = field335.field1110 + field224;
			int var2 = field335.field1111 + field445;
			if (field433 - var1 < -500 || field433 - var1 > 500 || field434 - var2 < -500 || field434 - var2 > 500) {
				field433 = var1;
				field434 = var2;
			}

			if (field433 != var1) {
				field433 += (var1 - field433) / 16;
			}

			if (field434 != var2) {
				field434 += (var2 - field434) / 16;
			}

			if (field955[1] == 1) {
				field343 += (-field343 - 24) / 2;
			} else if (field955[2] == 1) {
				field343 += (24 - field343) / 2;
			} else {
				field343 /= 2;
			}

			if (field955[3] == 1) {
				field344 += (12 - field344) / 2;
			} else if (field955[4] == 1) {
				field344 += (-field344 - 12) / 2;
			} else {
				field344 /= 2;
			}

			field342 = field343 / 2 + field342 & 0x7FF;
			field341 += field344 / 2;
			if (field341 < 128) {
				field341 = 128;
			}

			if (field341 > 383) {
				field341 = 383;
			}

			int var3 = field433 >> 7;
			int var4 = field434 >> 7;
			int var5 = method60(field434, field440, field433);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field440;
						if (var9 < 3 && (field165[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field431[var9][var7][var8];
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

			if (var11 > field104) {
				field104 += (var11 - field104) / 24;
			} else if (var11 < field104) {
				field104 += (var11 - field104) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field335.field1110 + "," + field335.field1111 + "," + field433 + "," + field434 + "," + field328 + "," + field329 + "," + field389 + "," + field390);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method85() {
		int var1 = field185.method234("Choose Option");
		for (int var2 = 0; var2 < field345; var2++) {
			int var3 = field185.method234(field99[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field345 * 15 + 21;
		if (field952 > 4 && field953 > 4 && field952 < 516 && field953 < 338) {
			int var5 = field952 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field953 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field373 = true;
			field323 = 0;
			field324 = var5;
			field325 = var6;
			field326 = var1;
			field327 = field345 * 15 + 22;
		}

		if (field952 > 553 && field953 > 205 && field952 < 743 && field953 < 466) {
			int var7 = field952 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field953 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field373 = true;
			field323 = 1;
			field324 = var7;
			field325 = var8;
			field326 = var1;
			field327 = field345 * 15 + 22;
		}

		if (field952 > 17 && field953 > 357 && field952 < 496 && field953 < 453) {
			int var9 = field952 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field953 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field373 = true;
			field323 = 2;
			field324 = var9;
			field325 = var10;
			field326 = var1;
			field327 = field345 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ILTPIBHECB;II)V")
	public final void method86(int arg0, TPIBHECB arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field342 + field279 & 0x7FF;
			int var6 = GCSAWSJV.field655[var5];
			int var7 = GCSAWSJV.field656[var5];
			var6 = var6 * 256 / (field400 + 256);
			var7 = var7 * 256 / (field400 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field145.method512(var10, 20, 256, 15, 83 - var13 - 20, 20, var12 + 94 + 4 - 10, 15);
		} else {
			method157(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method87(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field525; var3++) {
				if (field406[var3] == arg0) {
					field525--;
					field405 = true;

					for (int var4 = var3; var4 < field525; var4++) {
						field406[var4] = field406[var4 + 1];
					}

					field288.method183(151);
					field288.method190(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BZ)V")
	public final void method88(byte[] arg0, boolean arg1) {
		if (field221) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field511.method474(arg4, arg2, arg0);
		if (var6 != 0) {
			int var7 = field511.method478(arg4, arg2, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field272.field1219;
			int var12 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			YJMLCFGC var14 = YJMLCFGC.method596(var13);
			if (var14.field1483 == -1) {
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
				OCPHNIUN var15 = field213[var14.field1483];
				if (var15 != null) {
					int var16 = (var14.field1469 * 4 - var15.field984) / 2;
					int var17 = (var14.field1479 * 4 - var15.field985) / 2;
					var15.method424(arg2 * 4 + var16 + 48, (104 - arg0 - var14.field1479) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field511.method476(arg4, arg2, arg0);
		if (var18 != 0) {
			int var19 = field511.method478(arg4, arg2, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			YJMLCFGC var23 = YJMLCFGC.method596(var22);
			if (var23.field1483 != -1) {
				OCPHNIUN var24 = field213[var23.field1483];
				if (var24 != null) {
					int var25 = (var23.field1469 * 4 - var24.field984) / 2;
					int var26 = (var23.field1479 * 4 - var24.field985) / 2;
					var24.method424(arg2 * 4 + var25 + 48, (104 - arg0 - var23.field1479) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field272.field1219;
				int var29 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field511.method477(arg4, arg2, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			YJMLCFGC var32 = YJMLCFGC.method596(var31);
			if (var32.field1483 != -1) {
				OCPHNIUN var33 = field213[var32.field1483];
				if (var33 != null) {
					int var34 = (var32.field1469 * 4 - var33.field984) / 2;
					int var35 = (var32.field1479 * 4 - var33.field985) / 2;
					var33.method424(arg2 * 4 + var34 + 48, (104 - arg0 - var32.field1479) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method90() {
		if (field302 != 0) {
			CWXRTTYV var1 = field184;
			int var2 = 0;
			if (field425 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field388[var3] != null) {
					int var4 = field386[var3];
					String var5 = field387[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field479 == 0 || field479 == 1 && method118(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method236(var8, 0, "From", var7);
						var1.method236(var8, 0xFFFF, "From", var7 - 1);
						int var11 = var8 + var1.method234("From ");
						if (var6 == 1) {
							field415[0].method424(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field415[1].method424(var11, var7 - 12);
							var11 += 14;
						}

						var1.method236(var11, 0, var5 + ": " + field388[var3], var7);
						var1.method236(var11, 0xFFFF, var5 + ": " + field388[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field479 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method236(4, 0, field388[var3], var9);
						var1.method236(4, 0xFFFF, field388[var3], var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field479 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method236(4, 0, "To " + var5 + ": " + field388[var3], var10);
						var1.method236(4, 0xFFFF, "To " + var5 + ": " + field388[var3], var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public static final String method91(int arg0) {
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field940 != null) {
				return new URL("http://127.0.0.1:" + (field245 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIIIIIIIZ)Z")
	public final boolean method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field340[var14][var15] = 0;
				field487[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg0;
		field340[arg8][arg0] = 99;
		field487[arg8][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field456[var18] = arg8;
		int var35 = var18 + 1;
		field457[var18] = arg0;
		boolean var20 = false;
		int var21 = field456.length;
		int[][] var22 = field281[field440].field1323;
		while (var35 != var19) {
			var16 = field456[var19];
			var17 = field457[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field281[field440].method561(var17, var16, arg5, arg9 - 1, arg6, arg1)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field281[field440].method562(arg9 - 1, arg6, arg5, var16, var17, arg1)) {
					var20 = true;
					break;
				}
			}

			if (arg4 != 0 && arg3 != 0 && field281[field440].method563(arg1, arg3, var16, arg5, arg4, var17, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field487[var16][var17] + 1;
			if (var16 > 0 && field340[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field456[var35] = var16 - 1;
				field457[var35] = var17;
				var35 = (var35 + 1) % var21;
				field340[var16 - 1][var17] = 2;
				field487[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field340[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field456[var35] = var16 + 1;
				field457[var35] = var17;
				var35 = (var35 + 1) % var21;
				field340[var16 + 1][var17] = 8;
				field487[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field340[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field456[var35] = var16;
				field457[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field340[var16][var17 - 1] = 1;
				field487[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field340[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field456[var35] = var16;
				field457[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field340[var16][var17 + 1] = 4;
				field487[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field340[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field456[var35] = var16 - 1;
				field457[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field340[var16 - 1][var17 - 1] = 3;
				field487[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field340[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field456[var35] = var16 + 1;
				field457[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field340[var16 + 1][var17 - 1] = 9;
				field487[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field340[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field456[var35] = var16 - 1;
				field457[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field340[var16 - 1][var17 + 1] = 6;
				field487[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field340[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field456[var35] = var16 + 1;
				field457[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field340[var16 + 1][var17 + 1] = 12;
				field487[var16 + 1][var17 + 1] = var23;
			}
		}

		field409 = 0;
		if (!var20) {
			if (arg10) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg5 - var25; var27 <= arg5 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field487[var26][var27] < var24) {
								var24 = field487[var26][var27];
								var16 = var26;
								var17 = var27;
								field409 = 1;
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
		field456[var28] = var16;
		int var36 = var28 + 1;
		field457[var28] = var17;
		int var29;
		int var30 = var29 = field340[var16][var17];
		while (arg8 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field456[var36] = var16;
				field457[var36++] = var17;
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

			var30 = field340[var16][var17];
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
		int var32 = field456[var36];
		int var33 = field457[var36];

		if (arg2 == 0) {
			field288.method183(184);
			field288.method184(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field288.method183(62);
			field288.method184(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field288.method183(146);
			field288.method184(var31 + var31 + 3);
		}

		field288.method210(field955[5] == 1 ? 1 : 0);
		field288.method185(field390 + var33);
		field288.method218(field389 + var32);
		field270 = field456[0];
		field271 = field457[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field288.method184(field456[var36] - var32);
			field288.method211(field457[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method93() {
		field288.method183(25);

		if (field508 != -1) {
			method161(field508);
			field508 = -1;
			field405 = true;
			field413 = false;
			field173 = true;
		}

		if (field538 != -1) {
			method161(field538);
			field538 = -1;
			field473 = true;
			field413 = false;
		}

		if (field528 != -1) {
			method161(field528);
			field528 = -1;
			field513 = true;
		}

		if (field520 != -1) {
			method161(field520);
			field520 = -1;
		}

		if (field399 != -1) {
			method161(field399);
			field399 = -1;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method94() {
		if (field149 == 0 && field951 == 1) {
			int var1 = field952 - 25 - 550;
			int var2 = field953 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field342 + field279 & 0x7FF;
				int var4 = NQTCRWWR.field968[var3];
				int var5 = NQTCRWWR.field969[var3];
				var4 = (field400 + 256) * var4 >> 8;
				var5 = (field400 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field335.field1110 + var6 >> 7;
				int var9 = field335.field1111 - var7 >> 7;
				boolean var10 = method92(field335.field1098[0], var8, 1, 0, 0, var9, 0, 0, field335.field1097[0], 0, true);
				if (var10) {
					field288.method184(var1);
					field288.method184(var2);
					field288.method185(field342);
					field288.method184(57);
					field288.method184(field279);
					field288.method184(field400);
					field288.method184(89);
					field288.method185(field335.field1110);
					field288.method185(field335.field1111);
					field288.method184(field409);
					field288.method184(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(BI)V")
	public final void method95(int arg0) {
		if (!field247) {
			for (int var2 = 0; var2 < field152.length; var2++) {
				int var3 = field152[var2];
				if (NQTCRWWR.field978[var3] >= arg0) {
					OCPHNIUN var4 = NQTCRWWR.field972[var3];
					int var5 = var4.field985 * var4.field984 - 1;
					int var6 = field220 * var4.field984 * 2;
					byte[] var7 = var4.field982;
					byte[] var8 = field102;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field982 = var8;
					field102 = var7;
					NQTCRWWR.method409(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(LOCPHNIUN;I)V")
	public final void method96(OCPHNIUN arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field218.length; var3++) {
			field218[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field218[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field219[var9] = (field218[var9 - 1] + field218[var9 + 1] + field218[var9 - 128] + field218[var9 + 128]) / 4;
				}
			}

			int[] var10 = field218;
			field218 = field219;
			field219 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field985; var12++) {
				for (int var13 = 0; var13 < arg0.field984; var13++) {
					if (arg0.field982[var11++] != 0) {
						int var14 = var13 + arg0.field986 + 16;
						int var15 = var12 + arg0.field987 + 16;
						int var16 = (var15 << 7) + var14;
						field218[var16] = 0;
					}
				}
			}
		}
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

	@ObfuscatedName("client.a(IILCMGGUSPR;)V")
	public final void method98(int arg0, CMGGUSPR arg1) {
		for (int var3 = 0; var3 < field198; var3++) {
			int var4 = field199[var3];
			MDBQGDOL var5 = field195[var4];
			int var6 = arg1.method194();
			if ((var6 & 0x1) != 0) {
				var6 += arg1.method194() << 8;
			}

			method79(var6, var5, arg1, var4);
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method99() {
		field455 = 0;
		int var1 = (field335.field1110 >> 7) + field389;
		int var2 = (field335.field1111 >> 7) + field390;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field455 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field455 = 1;
		}

		if (field455 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field455 = 0;
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method100(boolean arg0) {
		for (int var2 = 0; var2 < field128; var2++) {
			IGOBKPZP var3 = field127[field129[var2]];
			int var4 = (field129[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method302() && var3.field758.field1251 == arg0 && var3.field758.method519()) {
				int var5 = var3.field1110 >> 7;
				int var6 = var3.field1111 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1113 == 1 && (var3.field1110 & 0x7F) == 0x40 && (var3.field1111 & 0x7F) == 0x40) {
						if (field187[var5][var6] == field122) {
							continue;
						}

						field187[var5][var6] = field122;
					}

					if (!var3.field758.field1242) {
						var4 += Integer.MIN_VALUE;
					}

					field511.method459(var3, field440, var3.field1111, var3.field1124, var3.field1110, var3.field1112, var4, (var3.field1113 - 1) * 64 + 60, method60(var3.field1111, field440, var3.field1110));
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method101() {
		byte[] var1 = field191.method545("title.dat", null);
		TPIBHECB var2 = new TPIBHECB(var1, this);
		field356.method327();
		var2.method505(0, 0);
		field357.method327();
		var2.method505(0, -637);
		field353.method327();
		var2.method505(0, -128);
		field354.method327();
		var2.method505(-371, -202);
		field355.method327();
		var2.method505(-171, -202);
		field358.method327();
		var2.method505(-265, 0);
		field359.method327();
		var2.method505(-265, -562);
		field360.method327();
		var2.method505(-171, -128);
		field361.method327();
		var2.method505(-171, -562);
		int[] var3 = new int[var2.field1220];
		for (int var4 = 0; var4 < var2.field1221; var4++) {
			for (int var5 = 0; var5 < var2.field1220; var5++) {
				var3[var5] = var2.field1219[var2.field1220 * var4 + var2.field1220 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1220; var6++) {
				var2.field1219[var2.field1220 * var4 + var6] = var3[var6];
			}
		}

		field356.method327();
		var2.method505(0, 382);
		field357.method327();
		var2.method505(0, -255);
		field353.method327();
		var2.method505(0, 254);
		field354.method327();
		var2.method505(-371, 180);
		field355.method327();
		var2.method505(-171, 180);
		field358.method327();
		var2.method505(-265, 382);
		field359.method327();
		var2.method505(-265, -180);
		field360.method327();
		var2.method505(-171, 254);
		field361.method327();
		var2.method505(-171, -180);
		TPIBHECB var7 = new TPIBHECB(field191, "logo", 0);
		field353.method327();
		var7.method507(382 - var7.field1220 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(II)V")
	public final void method102(int arg0) {
		if (arg0 >= 0) {
			int var2 = field233[arg0];
			int var3 = field234[arg0];
			int var4 = field235[arg0];
			int var5 = field236[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field273 != 0 && var4 != 1117) {
				field273 = 0;
				field473 = true;
			}

			if (var4 == 343) {
				field288.method183(196);
				field288.method185(var5);
				field288.method219(var3);
				field288.method219(var2);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 787) {
				method36(var2, var5, var3);
				field288.method183(186);
				field288.method219(var5 >> 14 & 0x7FFF);
				field288.method219(field389 + var2);
				field288.method219(field390 + var3);
			}

			if (var4 == 913) {
				MDBQGDOL var6 = field195[var5];
				if (var6 != null) {
					method92(field335.field1098[0], var6.field1097[0], 2, 1, 1, var6.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(224);
					field288.method219(var5);
				}
			}

			if (var4 == 642) {
				IGOBKPZP var7 = field127[var5];
				if (var7 != null) {
					method92(field335.field1098[0], var7.field1097[0], 2, 1, 1, var7.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field322 += var5;
					if (field322 >= 58) {
						field288.method183(220);
						field288.method185(38397);
						field322 = 0;
					}

					field288.method183(190);
					field288.method220(var5);
				}
			}

			if (var4 == 233) {
				boolean var8 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
				if (!var8) {
					method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
				}

				field489 = field952;
				field490 = field953;
				field492 = 2;
				field491 = 0;
				field288.method183(242);
				field288.method220(var5);
				field288.method218(field390 + var3);
				field288.method218(field389 + var2);
			}

			if (var4 == 48) {
				method93();
			}

			if (var4 == 166 || var4 == 895 || var4 == 804 || var4 == 510) {
				String var10 = field99[arg0];
				int var11 = var10.indexOf("@whi@");
				if (var11 != -1) {
					long var12 = ZLGGMMMS.method597(var10.substring(var11 + 5).trim());
					if (var4 == 166) {
						method126(var12);
					}

					if (var4 == 895) {
						method59(var12);
					}

					if (var4 == 804) {
						method140(var12);
					}

					if (var4 == 510) {
						method87(var12);
					}
				}
			}

			if (var4 == 1237) {
				method36(var2, var5, var3);
				field288.method183(154);
				field288.method218(var5 >> 14 & 0x7FFF);
				field288.method185(field389 + var2);
				field288.method185(field390 + var3);
			}

			if (var4 == 1986) {
				IGOBKPZP var14 = field127[var5];
				if (var14 != null) {
					TQRZOVPP var15 = var14.field758;
					if (var15.field1231 != null) {
						var15 = var15.method515();
					}

					if (var15 != null) {
						String var16;
						if (var15.field1246 == null) {
							var16 = "It's a " + var15.field1239 + ".";
						} else {
							var16 = new String(var15.field1246);
						}

						method114("", var16, 0);
					}
				}
			}

			if (var4 == 555) {
				boolean var17 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
				if (!var17) {
					method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
				}

				field489 = field952;
				field490 = field953;
				field492 = 2;
				field491 = 0;
				field288.method183(59);
				field288.method220(field390 + var3);
				field288.method220(var5);
				field288.method219(field297);
				field288.method185(field389 + var2);
			}

			if (var4 == 794) {
				field288.method183(225);
				field288.method219(var2);
				field288.method185(var3);
				field288.method219(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 295) {
				IGOBKPZP var19 = field127[var5];
				if (var19 != null) {
					method92(field335.field1098[0], var19.field1097[0], 2, 1, 1, var19.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(117);
					field288.method218(var5);
				}
			}

			if (var4 == 992) {
				MDBQGDOL var20 = field195[var5];
				if (var20 != null) {
					method92(field335.field1098[0], var20.field1097[0], 2, 1, 1, var20.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(81);
					field288.method218(var5);
				}
			}

			if (var4 == 22) {
				IGOBKPZP var21 = field127[var5];
				if (var21 != null) {
					method92(field335.field1098[0], var21.field1097[0], 2, 1, 1, var21.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(99);
					field288.method218(var5);
				}
			}

			if (var4 == 825) {
				boolean var22 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
				if (!var22) {
					method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
				}

				field489 = field952;
				field490 = field953;
				field492 = 2;
				field491 = 0;
				field288.method183(80);
				field288.method220(field268);
				field288.method185(field390 + var3);
				field288.method218(var5);
				field288.method219(field267);
				field288.method185(field389 + var2);
				field288.method219(field266);
			}

			if (var4 == 830) {
				IGOBKPZP var24 = field127[var5];
				if (var24 != null) {
					method92(field335.field1098[0], var24.field1097[0], 2, 1, 1, var24.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(243);
					field288.method185(var5);
				}
			}

			if (var4 == 529) {
				field288.method183(39);
				field288.method220(var2);
				field288.method219(var3);
				field288.method220(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 898) {
				IGOBKPZP var25 = field127[var5];
				if (var25 != null) {
					method92(field335.field1098[0], var25.field1097[0], 2, 1, 1, var25.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(67);
					field288.method220(var5);
					field288.method218(field297);
				}
			}

			if (var4 == 551) {
				field288.method183(90);
				field288.method185(var3);
				WJQTPVDG var26 = WJQTPVDG.method577(var3);
				if (var26.field1395 != null && var26.field1395[0][0] == 5) {
					int var27 = var26.field1395[0][1];
					if (field226[var27] != var26.field1353[0]) {
						field226[var27] = var26.field1353[0];
						method39(var27);
						field405 = true;
					}
				}
			}

			if (var4 == 158) {
				if (field373) {
					field511.method486(var3 - 4, var2 - 4);
				} else {
					field511.method486(field953 - 4, field952 - 4);
				}
			}

			if (var4 == 62) {
				field288.method183(141);
				field288.method185(var2);
				field288.method218(var3);
				field288.method220(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 585) {
				WJQTPVDG var28 = WJQTPVDG.method577(var3);
				boolean var29 = true;
				if (var28.field1345 > 0) {
					var29 = method82(var28);
				}

				if (var29) {
					field288.method183(90);
					field288.method185(var3);
				}
			}

			if (var4 == 679) {
				boolean var30 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
				if (!var30) {
					method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
				}

				field489 = field952;
				field490 = field953;
				field492 = 2;
				field491 = 0;
				field288.method183(78);
				field288.method220(var5);
				field288.method218(field389 + var2);
				field288.method219(field390 + var3);
			}

			if (var4 == 594 && !field413) {
				field288.method183(237);
				field288.method185(var3);
				field413 = true;
			}

			if (var4 == 652) {
				field288.method183(83);
				field288.method219(var2);
				field288.method218(field268);
				field288.method219(var3);
				field288.method220(field267);
				field288.method219(var5);
				field288.method218(field266);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 791 && method36(var2, var5, var3)) {
				field288.method183(38);
				field288.method185(field390 + var3);
				field288.method220(field389 + var2);
				field288.method218(field268);
				field288.method218(field266);
				field288.method219(field267);
				field288.method220(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 352) {
				field288.method183(65);
				field288.method185(var5);
				field288.method218(var3);
				field288.method219(var2);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 683) {
				IGOBKPZP var32 = field127[var5];
				if (var32 != null) {
					method92(field335.field1098[0], var32.field1097[0], 2, 1, 1, var32.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(231);
					field288.method219(field266);
					field288.method219(field268);
					field288.method218(field267);
					field288.method219(var5);
				}
			}

			if (var4 == 508) {
				MDBQGDOL var33 = field195[var5];
				if (var33 != null) {
					method92(field335.field1098[0], var33.field1097[0], 2, 1, 1, var33.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(111);
					field288.method219(var5);
					field288.method185(field268);
					field288.method218(field267);
					field288.method185(field266);
				}
			}

			if (var4 == 399) {
				field288.method183(20);
				field288.method219(var2);
				field288.method219(var3);
				field288.method220(field297);
				field288.method218(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 1934) {
				KIHBVNFV var34 = KIHBVNFV.method346(var5);
				WJQTPVDG var35 = WJQTPVDG.method577(var3);
				String var36;
				if (var35 != null && var35.field1379[var2] >= 100000) {
					var36 = var35.field1379[var2] + " x " + var34.field858;
				} else if (var34.field877 == null) {
					var36 = "It's a " + var34.field858 + ".";
				} else {
					var36 = new String(var34.field877);
				}

				method114("", var36, 0);
			}

			if (var4 == 350) {
				method36(var2, var5, var3);
				field288.method183(60);
				field288.method185(var5 >> 14 & 0x7FFF);
				field288.method185(field390 + var3);
				field288.method218(field389 + var2);
			}

			if (var4 == 387 && method36(var2, var5, var3)) {
				field288.method183(71);
				field288.method218(var5 >> 14 & 0x7FFF);
				field288.method185(field297);
				field288.method185(field390 + var3);
				field288.method219(field389 + var2);
			}

			if (var4 == 946) {
				MDBQGDOL var37 = field195[var5];
				if (var37 != null) {
					method92(field335.field1098[0], var37.field1097[0], 2, 1, 1, var37.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(42);
					field288.method220(var5);
				}
			}

			if (var4 == 899) {
				field288.method183(90);
				field288.method185(var3);
				WJQTPVDG var38 = WJQTPVDG.method577(var3);
				if (var38.field1395 != null && var38.field1395[0][0] == 5) {
					int var39 = var38.field1395[0][1];
					field226[var39] = 1 - field226[var39];
					method39(var39);
					field405 = true;
				}
			}

			if (var4 == 887) {
				if ((var2 & 0x3) == 0) {
					field111++;
				}

				if (field111 >= 135) {
					field288.method183(213);
					field288.method184(76);
					field111 = 0;
				}

				field288.method183(45);
				field288.method220(var2);
				field288.method219(var3);
				field288.method219(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 1642) {
				int var40 = var5 >> 14 & 0x7FFF;
				YJMLCFGC var41 = YJMLCFGC.method596(var40);
				String var42;
				if (var41.field1454 == null) {
					var42 = "It's a " + var41.field1476 + ".";
				} else {
					var42 = new String(var41.field1454);
				}

				method114("", var42, 0);
			}

			if (var4 == 57 || var4 == 894) {
				String var43 = field99[arg0];
				int var44 = var43.indexOf("@whi@");
				if (var44 != -1) {
					var43 = var43.substring(var44 + 5).trim();
					String var45 = ZLGGMMMS.method601(ZLGGMMMS.method598(ZLGGMMMS.method597(var43)));
					boolean var46 = false;
					for (int var47 = 0; var47 < field196; var47++) {
						MDBQGDOL var48 = field195[field197[var47]];
						if (var48 != null && var48.field920 != null && var48.field920.equalsIgnoreCase(var45)) {
							method92(field335.field1098[0], var48.field1097[0], 2, 1, 1, var48.field1098[0], 0, 0, field335.field1097[0], 0, false);

							if (var4 == 57) {
								field288.method183(9);
								field288.method219(field197[var47]);
							}

							if (var4 == 894) {
								field402 += var5;
								if (field402 >= 53) {
									field288.method183(148);
									field402 = 0;
								}

								field288.method183(185);
								field288.method218(field197[var47]);
							}

							var46 = true;
							break;
						}
					}

					if (!var46) {
						method114("", "Unable to find " + var45, 0);
					}
				}
			}

			if (var4 == 1186) {
				KIHBVNFV var49 = KIHBVNFV.method346(var5);
				String var50;
				if (var49.field877 == null) {
					var50 = "It's a " + var49.field858 + ".";
				} else {
					var50 = new String(var49.field877);
				}

				method114("", var50, 0);
			}

			if (var4 == 875) {
				field288.method183(44);
				field288.method218(var5);
				field288.method218(var2);
				field288.method185(var3);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 814) {
				method36(var2, var5, var3);
				field288.method183(129);
				field288.method219(field389 + var2);
				field288.method220(var5 >> 14 & 0x7FFF);
				field288.method218(field390 + var3);
			}

			if (var4 == 56) {
				field288.method183(12);
				field288.method220(var2);
				field288.method218(var3);
				field288.method220(var5);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 66) {
				field288.method183(17);
				field288.method218(var2);
				field288.method219(var5);
				field288.method185(var3);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (WJQTPVDG.method577(var3).field1378 == field399) {
					field485 = 1;
				}

				if (WJQTPVDG.method577(var3).field1378 == field538) {
					field485 = 3;
				}
			}

			if (var4 == 870) {
				MDBQGDOL var51 = field195[var5];
				if (var51 != null) {
					method92(field335.field1098[0], var51.field1097[0], 2, 1, 1, var51.field1098[0], 0, 0, field335.field1097[0], 0, false);
					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field402 += var5;
					if (field402 >= 53) {
						field288.method183(148);
						field402 = 0;
					}

					field288.method183(185);
					field288.method218(var5);
				}
			}

			if (var4 == 407) {
				WJQTPVDG var52 = WJQTPVDG.method577(var3);
				field296 = 1;
				field297 = var3;
				field298 = var52.field1355;
				field265 = 0;
				field405 = true;
				String var53 = var52.field1386;
				if (var53.indexOf(" ") != -1) {
					var53 = var53.substring(0, var53.indexOf(" "));
				}

				String var54 = var52.field1386;
				if (var54.indexOf(" ") != -1) {
					var54 = var54.substring(var54.indexOf(" ") + 1);
				}

				field299 = var53 + " " + var52.field1361 + " " + var54;

				if (field298 == 16) {
					field405 = true;
					field396 = 3;
					field173 = true;
				}
			} else {
				if (var4 == 306) {
					MDBQGDOL var55 = field195[var5];
					if (var55 != null) {
						method92(field335.field1098[0], var55.field1097[0], 2, 1, 1, var55.field1098[0], 0, 0, field335.field1097[0], 0, false);
						field489 = field952;
						field490 = field953;
						field492 = 2;
						field491 = 0;
						field288.method183(19);
						field288.method219(field297);
						field288.method219(var5);
					}
				}

				if (var4 == 174) {
					boolean var56 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
					if (!var56) {
						method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
					}

					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field250++;
					if (field250 >= 129) {
						field288.method183(217);
						field288.method184(71);
						field250 = 0;
					}

					field288.method183(168);
					field288.method219(field389 + var2);
					field288.method220(var5);
					field288.method220(field390 + var3);
				}

				if (var4 == 16) {
					field288.method183(94);
					field288.method219(var5);
					field288.method185(var3);
					field288.method218(var2);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (WJQTPVDG.method577(var3).field1378 == field399) {
						field485 = 1;
					}

					if (WJQTPVDG.method577(var3).field1378 == field538) {
						field485 = 3;
					}
				}

				if (var4 == 641) {
					String var58 = field99[arg0];
					int var59 = var58.indexOf("@whi@");
					if (var59 != -1) {
						if (field399 == -1) {
							method93();
							field375 = var58.substring(var59 + 5).trim();
							field106 = false;
							field317 = field399 = WJQTPVDG.field1351;
						} else {
							method114("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 138) {
					boolean var60 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
					if (!var60) {
						method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
					}

					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field288.method183(14);
					field288.method185(field390 + var3);
					field288.method219(var5);
					field288.method218(field389 + var2);
				}

				if (var4 == 375) {
					boolean var62 = method92(field335.field1098[0], var2, 2, 0, 0, var3, 0, 0, field335.field1097[0], 0, false);
					if (!var62) {
						method92(field335.field1098[0], var2, 2, 1, 1, var3, 0, 0, field335.field1097[0], 0, false);
					}

					field489 = field952;
					field490 = field953;
					field492 = 2;
					field491 = 0;
					field252++;
					if (field252 >= 68) {
						field288.method183(76);
						field288.method187(0xC9BC9E);
						field252 = 0;
					}

					field288.method183(64);
					field288.method218(field389 + var2);
					field288.method219(var5);
					field288.method185(field390 + var3);
				}

				if (var4 == 847) {
					String var64 = field99[arg0];
					int var65 = var64.indexOf("@whi@");
					if (var65 != -1) {
						long var66 = ZLGGMMMS.method597(var64.substring(var65 + 5).trim());
						int var68 = -1;
						for (int var69 = 0; var69 < field509; var69++) {
							if (field374[var69] == var66) {
								var68 = var69;
								break;
							}
						}

						if (var68 != -1 && field376[var68] > 0) {
							field473 = true;
							field273 = 0;
							field383 = true;
							field289 = "";
							field290 = 3;
							field377 = field374[var68];
							field283 = "Enter message to send to " + field170[var68];
						}
					}
				}

				if (var4 == 179) {
					field265 = 1;
					field266 = var2;
					field267 = var3;
					field268 = var5;
					field269 = String.valueOf(KIHBVNFV.method346(var5).field858);
					field296 = 0;
					field405 = true;
				} else {
					if (var4 == 850) {
						method161(field319);
						field319 = -1;
						field473 = true;
					}

					if (var4 == 758) {
						method36(var2, var5, var3);
						field288.method183(77);
						field288.method220(field389 + var2);
						field288.method220(field390 + var3);
						field288.method219(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 488) {
						IGOBKPZP var70 = field127[var5];
						if (var70 != null) {
							method92(field335.field1098[0], var70.field1097[0], 2, 1, 1, var70.field1098[0], 0, 0, field335.field1097[0], 0, false);
							field489 = field952;
							field490 = field953;
							field492 = 2;
							field491 = 0;
							field288.method183(181);
							field288.method220(var5);
						}
					}

					if (var4 == 155) {
						MDBQGDOL var71 = field195[var5];
						if (var71 != null) {
							method92(field335.field1098[0], var71.field1097[0], 2, 1, 1, var71.field1098[0], 0, 0, field335.field1097[0], 0, false);
							field489 = field952;
							field490 = field953;
							field492 = 2;
							field491 = 0;
							field288.method183(9);
							field288.method219(var5);
						}
					}

					field265 = 0;
					field296 = 0;
					field405 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LWJQTPVDG;I)V")
	public final void method103(WJQTPVDG arg0) {
		int var2 = arg0.field1345;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field510 == 0) {
				arg0.field1370 = "Loading friend list";
				arg0.field1364 = 0;
			} else if (var2 == 1 && field510 == 1) {
				arg0.field1370 = "Connecting to friendserver";
				arg0.field1364 = 0;
			} else if (var2 == 2 && field510 != 2) {
				arg0.field1370 = "Please wait...";
				arg0.field1364 = 0;
			} else {
				int var3 = field509;
				if (field510 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1370 = "";
					arg0.field1364 = 0;
				} else {
					arg0.field1370 = field170[var2];
					arg0.field1364 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field509;
			if (field510 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1370 = "";
				arg0.field1364 = 0;
			} else {
				if (field376[var2] == 0) {
					arg0.field1370 = "@red@Offline";
				} else if (field376[var2] < 200) {
					if (field376[var2] == field244) {
						arg0.field1370 = "@gre@World" + (field376[var2] - 9);
					} else {
						arg0.field1370 = "@yel@World" + (field376[var2] - 9);
					}
				} else if (field376[var2] == field244) {
					arg0.field1370 = "@gre@Classic" + (field376[var2] - 219);
				} else {
					arg0.field1370 = "@yel@Classic" + (field376[var2] - 219);
				}

				arg0.field1364 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field509;
			if (field510 != 2) {
				var5 = 0;
			}

			arg0.field1362 = var5 * 15 + 20;
			if (arg0.field1362 <= arg0.field1374) {
				arg0.field1362 = arg0.field1374 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field510 == 0) {
				arg0.field1370 = "Loading ignore list";
				arg0.field1364 = 0;
			} else if (var2 == 1 && field510 == 0) {
				arg0.field1370 = "Please wait...";
				arg0.field1364 = 0;
			} else {
				int var6 = field525;
				if (field510 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1370 = "";
					arg0.field1364 = 0;
				} else {
					arg0.field1370 = ZLGGMMMS.method601(ZLGGMMMS.method598(field406[var2]));
					arg0.field1364 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1362 = field525 * 15 + 20;
			if (arg0.field1362 <= arg0.field1374) {
				arg0.field1362 = arg0.field1374 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1337 = 150;
			arg0.field1338 = (int) (Math.sin(field404 / 40.0D) * 256.0D) & 0x7FF;

			if (field315) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field336[var7];
					if (var8 >= 0 && !CFPLMOQH.field91[var8].method31()) {
						return;
					}
				}

				field315 = false;
				GCSAWSJV[] var9 = new GCSAWSJV[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field336[var11];
					if (var12 >= 0) {
						var9[var10++] = CFPLMOQH.field91[var12].method32();
					}
				}

				GCSAWSJV var13 = new GCSAWSJV(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field488[var14] != 0) {
						var13.method274(field169[var14][0], field169[var14][field488[var14]]);

						if (var14 == 1) {
							var13.method274(field486[0], field486[field488[var14]]);
						}
					}
				}

				var13.method267();
				var13.method268(XRDQTWLL.field1418[field335.field1091].field1420[0]);
				var13.method277(64, 850, -30, -50, -30, true);
				arg0.field1375 = 5;
				arg0.field1376 = 0;
				WJQTPVDG.method578(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field286 == null) {
				field286 = arg0.field1384;
				field287 = arg0.field1392;
			}

			if (field534) {
				arg0.field1384 = field287;
			} else {
				arg0.field1384 = field286;
			}
		} else if (var2 == 325) {
			if (field286 == null) {
				field286 = arg0.field1384;
				field287 = arg0.field1392;
			}

			if (field534) {
				arg0.field1384 = field286;
			} else {
				arg0.field1384 = field287;
			}
		} else if (var2 == 600) {
			arg0.field1370 = field375;
			if (field404 % 20 < 10) {
				arg0.field1370 = arg0.field1370 + "|";
			} else {
				arg0.field1370 = arg0.field1370 + " ";
			}
		} else if (var2 == 620) {
			if (field519 < 1) {
				arg0.field1370 = "";
			} else if (field106) {
				arg0.field1344 = 0xFF0000;
				arg0.field1370 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1344 = 0xFFFFFF;
				arg0.field1370 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field365 - field98;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1370 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field278 == 0) {
				arg0.field1370 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field278 <= field365) {
				arg0.field1370 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method104(field278);
			} else {
				int var17 = field365 + 14 - field278;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1370 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method104(field278) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field124 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field124 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field124 + " unread messages";
			}

			arg0.field1370 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field412 > 0 && field412 <= field365 + 10) {
				arg0.field1370 = "Last password change:\\n@gre@" + method104(field412);
			} else {
				arg0.field1370 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field521 > 2 && !field246) {
				arg0.field1370 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field521 > 2) {
				arg0.field1370 = "\\n\\nYou have @gre@" + field521 + "@yel@ days of\\nmember credit remaining.";
			} else if (field521 > 0) {
				arg0.field1370 = "You have @gre@" + field521 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1370 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field521 > 2 && !field246) {
				arg0.field1370 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field521 > 0) {
				arg0.field1370 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1370 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field278 > field365) {
				arg0.field1370 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1370 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method104(int arg0) {
		if (arg0 > field365 + 10) {
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

	@ObfuscatedName("client.p(I)V")
	public final void method105() {
		if (field462 == null) {
			method152();
			field938 = null;
			field353 = null;
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field462 = new IUZTBIWV(method117(), 479, 96);
			field460 = new IUZTBIWV(method117(), 172, 156);
			BAXODNVH.method20();
			field167.method424(0, 0);
			field459 = new IUZTBIWV(method117(), 190, 261);
			field461 = new IUZTBIWV(method117(), 512, 334);
			BAXODNVH.method20();
			field209 = new IUZTBIWV(method117(), 496, 50);
			field210 = new IUZTBIWV(method117(), 269, 37);
			field211 = new IUZTBIWV(method117(), 249, 45);
			field513 = true;
			field461.method327();
			NQTCRWWR.field970 = field428;
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method106(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method107(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(LCMGGUSPR;ZI)V")
	public final void method108(CMGGUSPR arg0, int arg1) {
		arg0.method204();
		int var3 = arg0.method205(8);
		if (var3 < field128) {
			for (int var4 = var3; var4 < field128; var4++) {
				field232[field231++] = field129[var4];
			}
		}

		if (var3 > field128) {
			signlink.reporterror(field348 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field128 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field129[var5];
			IGOBKPZP var7 = field127[var6];
			int var8 = arg0.method205(1);
			if (var8 == 0) {
				field129[field128++] = var6;
				var7.field1115 = field404;
			} else {
				int var9 = arg0.method205(2);
				if (var9 == 0) {
					field129[field128++] = var6;
					var7.field1115 = field404;
					field199[field198++] = var6;
				} else if (var9 == 1) {
					field129[field128++] = var6;
					var7.field1115 = field404;
					int var10 = arg0.method205(3);
					var7.method440(var10, false);
					int var11 = arg0.method205(1);
					if (var11 == 1) {
						field199[field198++] = var6;
					}
				} else if (var9 == 2) {
					field129[field128++] = var6;
					var7.field1115 = field404;
					int var12 = arg0.method205(3);
					var7.method440(var12, true);
					int var13 = arg0.method205(3);
					var7.method440(var13, true);
					int var14 = arg0.method205(1);
					if (var14 == 1) {
						field199[field198++] = var6;
					}
				} else if (var9 == 3) {
					field232[field231++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method109(String arg0) {
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

	@ObfuscatedName("client.q(I)V")
	public final void method110() {
		int var1 = field503 * 128 + 64;
		int var2 = field504 * 128 + 64;
		int var3 = method60(var2, field440, var1) - field505;

		if (field155 < var1) {
			field155 += (var1 - field155) * field507 / 1000 + field506;
			if (field155 > var1) {
				field155 = var1;
			}
		}

		if (field155 > var1) {
			field155 -= (field155 - var1) * field507 / 1000 + field506;
			if (field155 < var1) {
				field155 = var1;
			}
		}

		if (field156 < var3) {
			field156 += (var3 - field156) * field507 / 1000 + field506;
			if (field156 > var3) {
				field156 = var3;
			}
		}

		if (field156 > var3) {
			field156 -= (field156 - var3) * field507 / 1000 + field506;
			if (field156 < var3) {
				field156 = var3;
			}
		}

		if (field157 < var2) {
			field157 += (var2 - field157) * field507 / 1000 + field506;
			if (field157 > var2) {
				field157 = var2;
			}
		}

		if (field157 > var2) {
			field157 -= (field157 - var2) * field507 / 1000 + field506;
			if (field157 < var2) {
				field157 = var2;
			}
		}

		int var4 = field465 * 128 + 64;
		int var5 = field466 * 128 + 64;
		int var6 = method60(var5, field440, var4) - field467;
		int var7 = var4 - field155;
		int var8 = var6 - field156;
		int var9 = var5 - field157;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field158 < var11) {
			field158 += (var11 - field158) * field469 / 1000 + field468;
			if (field158 > var11) {
				field158 = var11;
			}
		}

		if (field158 > var11) {
			field158 -= (field158 - var11) * field469 / 1000 + field468;
			if (field158 < var11) {
				field158 = var11;
			}
		}

		int var13 = var12 - field159;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field159 += field469 * var13 / 1000 + field468;
			field159 &= 0x7FF;
		}

		if (var13 < 0) {
			field159 -= -var13 * field469 / 1000 + field468;
			field159 &= 0x7FF;
		}

		int var14 = var12 - field159;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field159 = var12;
		}
	}

	@ObfuscatedName("client.a(ILCMGGUSPR;I)V")
	public final void method111(int arg0, CMGGUSPR arg1) {
		if (arg0 == 132) {
			int var3 = arg1.method223();
			int var4 = arg1.method221();
			int var5 = arg1.method194();
			int var6 = (var5 >> 4 & 0x7) + field463;
			int var7 = (var5 & 0x7) + field464;
			int var8 = arg1.method222();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && field123 != var3) {
				QXUWKDGL var9 = new QXUWKDGL();
				var9.field1038 = var4;
				var9.field1039 = var8;

				if (field537[field440][var6][var7] == null) {
					field537[field440][var6][var7] = new WCVCMGLX();
				}

				field537[field440][var6][var7].method564(var9);
				method148(var6, var7);
			}
		} else if (arg0 == 85) {
			int var10 = arg1.method194();
			int var11 = (var10 >> 4 & 0x7) + field463;
			int var12 = (var10 & 0x7) + field464;
			int var13 = var11 + arg1.method195();
			int var14 = var12 + arg1.method195();
			int var15 = arg1.method197();
			int var16 = arg1.method196();
			int var17 = arg1.method194() * 4;
			int var18 = arg1.method194() * 4;
			int var19 = arg1.method196();
			int var20 = arg1.method196();
			int var21 = arg1.method194();
			int var22 = arg1.method194();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var16 != 0xFFFF) {
				var11 = var11 * 128 + 64;
				var12 = var12 * 128 + 64;
				var13 = var13 * 128 + 64;
				var14 = var14 * 128 + 64;
				TCHKSJJL var23 = new TCHKSJJL(method60(var12, field440, var11) - var17, field440, field404 + var20, var16, var12, var22, var11, var21, var18, var15, field404 + var19);
				var23.method499(var13, var14, method60(var14, field440, var13) - var18, field404 + var19);
				field499.method564(var23);
			}
		} else if (arg0 == 80) {
			int var24 = arg1.method222();
			int var25 = arg1.method213();
			int var26 = (var25 >> 4 & 0x7) + field463;
			int var27 = (var25 & 0x7) + field464;
			int var28 = arg1.method213();
			int var29 = var28 >> 2;
			int var30 = var28 & 0x3;
			int var31 = field282[var29];
			if (var26 >= 0 && var27 >= 0 && var26 < 103 && var27 < 103) {
				int var32 = field431[field440][var26][var27];
				int var33 = field431[field440][var26 + 1][var27];
				int var34 = field431[field440][var26 + 1][var27 + 1];
				int var35 = field431[field440][var26][var27 + 1];
				if (var31 == 0) {
					XQMPLVXZ var36 = field511.method470(var27, field440, var26);
					if (var36 != null) {
						int var37 = var36.field1415 >> 14 & 0x7FFF;
						if (var29 == 2) {
							var36.field1413 = new FDWERTGB(var32, var30 + 4, var34, var33, false, 2, var37, var35, var24);
							var36.field1414 = new FDWERTGB(var32, var30 + 1 & 0x3, var34, var33, false, 2, var37, var35, var24);
						} else {
							var36.field1413 = new FDWERTGB(var32, var30, var34, var33, false, var29, var37, var35, var24);
						}
					}
				}

				if (var31 == 1) {
					PMXQREPH var38 = field511.method471(var27, field440, var26);
					if (var38 != null) {
						var38.field1012 = new FDWERTGB(var32, 0, var34, var33, false, 4, var38.field1013 >> 14 & 0x7FFF, var35, var24);
					}
				}

				if (var31 == 2) {
					JFNPMXDU var39 = field511.method472(field440, var27, var26);

					if (var29 == 11) {
						var29 = 10;
					}

					if (var39 != null) {
						var39.field810 = new FDWERTGB(var32, var30, var34, var33, false, var29, var39.field818 >> 14 & 0x7FFF, var35, var24);
					}
				}

				if (var31 == 3) {
					WIWAGXSI var40 = field511.method473(var27, field440, var26);
					if (var40 != null) {
						var40.field1332 = new FDWERTGB(var32, var30, var34, var33, false, 22, var40.field1333 >> 14 & 0x7FFF, var35, var24);
					}
				}
			}
		} else if (arg0 == 38) {
			int var41 = arg1.method194();
			int var42 = (var41 >> 4 & 0x7) + field463;
			int var43 = (var41 & 0x7) + field464;
			int var44 = arg1.method223();
			int var45 = arg1.method212();
			int var46 = var45 >> 2;
			int var47 = var45 & 0x3;
			int var48 = field282[var46];
			if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				method181(var44, var43, var48, var47, var42, field440, -1, var46, 0);
			}
		} else {
			if (arg0 == 126) {
				int var49 = arg1.method194();
				int var50 = (var49 >> 4 & 0x7) + field463;
				int var51 = (var49 & 0x7) + field464;
				int var52 = arg1.method196();
				int var53 = arg1.method194();
				int var54 = var53 >> 4 & 0xF;
				int var55 = var53 & 0x7;
				if (field335.field1097[0] >= var50 - var54 && field335.field1097[0] <= var50 + var54 && field335.field1098[0] >= var51 - var54 && field335.field1098[0] <= var51 + var54 && field350 && !field247 && field351 < 50) {
					field172[field351] = var52;
					field274[field351] = var55;
					field292[field351] = ADSZDTIC.field9[var52];
					field351++;
				}
			}

			if (arg0 == 142) {
				int var56 = arg1.method222();
				int var57 = arg1.method196();
				int var58 = arg1.method194();
				int var59 = (var58 >> 4 & 0x7) + field463;
				int var60 = (var58 & 0x7) + field464;
				if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
					QXUWKDGL var61 = new QXUWKDGL();
					var61.field1038 = var57;
					var61.field1039 = var56;

					if (field537[field440][var59][var60] == null) {
						field537[field440][var59][var60] = new WCVCMGLX();
					}

					field537[field440][var59][var60].method564(var61);
					method148(var59, var60);
				}
			} else if (arg0 == 102) {
				int var62 = arg1.method194();
				int var63 = (var62 >> 4 & 0x7) + field463;
				int var64 = (var62 & 0x7) + field464;
				int var65 = arg1.method196();
				int var66 = arg1.method194();
				int var67 = arg1.method196();
				if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
					var63 = var63 * 128 + 64;
					var64 = var64 * 128 + 64;
					YGFSYDKK var68 = new YGFSYDKK(method60(var64, field440, var63) - var66, var65, field404, field440, var67, var64, var63);
					field192.method564(var68);
				}
			} else if (arg0 == 110) {
				int var69 = arg1.method194();
				int var70 = (var69 >> 4 & 0x7) + field463;
				int var71 = (var69 & 0x7) + field464;
				int var72 = arg1.method196();
				int var73 = arg1.method196();
				int var74 = arg1.method196();
				if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
					WCVCMGLX var75 = field537[field440][var70][var71];
					if (var75 != null) {
						for (QXUWKDGL var76 = (QXUWKDGL) var75.method567(); var76 != null; var76 = (QXUWKDGL) var75.method569()) {
							if ((var72 & 0x7FFF) == var76.field1038 && var76.field1039 == var73) {
								var76.field1039 = var74;
								break;
							}
						}

						method148(var70, var71);
					}
				}
			} else {
				if (arg0 == 193) {
					int var77 = arg1.method213();
					int var78 = (var77 >> 4 & 0x7) + field463;
					int var79 = (var77 & 0x7) + field464;
					int var80 = arg1.method223();
					byte var81 = arg1.method217();
					byte var82 = arg1.method195();
					byte var83 = arg1.method216();
					int var84 = arg1.method196();
					int var85 = arg1.method221();
					int var86 = arg1.method221();
					byte var87 = arg1.method216();
					int var88 = arg1.method194();
					int var89 = var88 >> 2;
					int var90 = var88 & 0x3;
					int var91 = field282[var89];
					MDBQGDOL var92;
					if (field123 == var85) {
						var92 = field335;
					} else {
						var92 = field195[var85];
					}

					if (var92 != null) {
						YJMLCFGC var93 = YJMLCFGC.method596(var80);
						int var94 = field431[field440][var78][var79];
						int var95 = field431[field440][var78 + 1][var79];
						int var96 = field431[field440][var78 + 1][var79 + 1];
						int var97 = field431[field440][var78][var79 + 1];
						GCSAWSJV var98 = var93.method587(var89, var90, var94, var95, var96, var97, -1);
						if (var98 != null) {
							method181(-1, var79, var91, 0, var78, field440, var86 + 1, 0, var84 + 1);
							var92.field896 = field404 + var84;
							var92.field897 = field404 + var86;
							var92.field916 = var98;
							int var99 = var93.field1469;
							int var100 = var93.field1479;
							if (var90 == 1 || var90 == 3) {
								var99 = var93.field1479;
								var100 = var93.field1469;
							}

							var92.field913 = var78 * 128 + var99 * 64;
							var92.field915 = var79 * 128 + var100 * 64;
							var92.field914 = method60(var92.field915, field440, var92.field913);

							if (var87 > var83) {
								byte var101 = var87;
								var87 = var83;
								var83 = var101;
							}

							if (var81 > var82) {
								byte var102 = var81;
								var81 = var82;
								var82 = var102;
							}

							var92.field903 = var78 + var87;
							var92.field905 = var78 + var83;
							var92.field904 = var79 + var81;
							var92.field906 = var79 + var82;
						}
					}
				}

				if (arg0 == 118) {
					int var103 = arg1.method222();
					int var104 = arg1.method194();
					int var105 = (var104 >> 4 & 0x7) + field463;
					int var106 = (var104 & 0x7) + field464;
					if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
						WCVCMGLX var107 = field537[field440][var105][var106];
						if (var107 != null) {
							for (QXUWKDGL var108 = (QXUWKDGL) var107.method567(); var108 != null; var108 = (QXUWKDGL) var107.method569()) {
								if ((var103 & 0x7FFF) == var108.field1038) {
									var108.method1();
									break;
								}
							}

							if (var107.method567() == null) {
								field537[field440][var105][var106] = null;
							}

							method148(var105, var106);
						}
					}
				} else if (arg0 == 203) {
					int var109 = arg1.method213();
					int var110 = (var109 >> 4 & 0x7) + field463;
					int var111 = (var109 & 0x7) + field464;
					int var112 = arg1.method194();
					int var113 = var112 >> 2;
					int var114 = var112 & 0x3;
					int var115 = field282[var113];
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						method181(-1, var111, var115, var114, var110, field440, -1, var113, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(BI)V")
	public final void method112(int arg0) {
		int[] var2 = field272.field1219;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field165[arg0][var7][var5] & 0x18) == 0) {
					field511.method483(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field165[arg0 + 1][var7][var5] & 0x8) != 0) {
					field511.method483(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field164++;
		if (field164 > 117) {
			field164 = 0;
			field288.method183(241);
			field288.method187(0x73D040);
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field272.method502();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field165[arg0][var11][var10] & 0x18) == 0) {
					method89(var10, var9, var11, var8, arg0);
				}

				if (arg0 < 3 && (field165[arg0 + 1][var11][var10] & 0x8) != 0) {
					method89(var10, var9, var11, var8, arg0 + 1);
				}
			}
		}

		if (field461 != null) {
			field461.method327();
			NQTCRWWR.field970 = field428;
		}

		field240 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field511.method477(field440, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = YJMLCFGC.method596(var14).field1493;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field281[field440].field1323;
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

						field347[field240] = field432[var15];
						field241[field240] = var16;
						field242[field240] = var17;
						field240++;
					}
				}
			}
		}

		field294++;
		if (field294 > 1985) {
			field294 = 0;
			field288.method183(222);
			field288.method184(0);
			int var23 = field288.field540;
			field288.method185(23056);
			field288.method185(58648);
			field288.method185((int) (Math.random() * 65536.0D));
			field288.method184(237);

			if ((int) (Math.random() * 2.0D) == 0) {
				field288.method184(161);
			}

			field288.method185(8273);

			if ((int) (Math.random() * 2.0D) == 0) {
				field288.method185(62228);
			}

			field288.method185(35150);
			field288.method185((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field288.method185(4025);
			}

			field288.method193(field288.field540 - var23);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)V")
	public final void method113(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field379 = 0;
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

			field379 = 0;
			label46: for (int var7 = 0; var7 < KIHBVNFV.field856; var7++) {
				KIHBVNFV var8 = KIHBVNFV.method346(var7);
				if (var8.field838 == -1 && var8.field858 != null) {
					String var9 = var8.field858.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field380[field379] = var9;
					field381[field379] = var7;
					field379++;
					if (field379 >= field380.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method114(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field319 != -1) {
			field114 = arg1;
			field951 = 0;
		}

		if (field538 == -1) {
			field473 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field386[var4] = field386[var4 - 1];
			field387[var4] = field387[var4 - 1];
			field388[var4] = field388[var4 - 1];
		}

		field386[0] = arg2;
		field387[0] = arg0;
		field388[0] = arg1;
	}

	@ObfuscatedName("client.a(ILWJQTPVDG;IBI)V")
	public final void method115(int arg0, WJQTPVDG arg1, int arg2, int arg3) {
		if (arg1.field1354 == 0 && arg1.field1385 != null && (!arg1.field1360 || field476 == arg1.field1396 || field364 == arg1.field1396 || field212 == arg1.field1396)) {
			int var5 = BAXODNVH.field36;
			int var6 = BAXODNVH.field34;
			int var7 = BAXODNVH.field37;
			int var8 = BAXODNVH.field35;
			BAXODNVH.method19(arg0, arg1.field1374 + arg0, arg1.field1367 + arg2, arg2);
			int var9 = arg1.field1385.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1383[var10] + arg2;
				int var12 = arg1.field1400[var10] + arg0 - arg3;
				WJQTPVDG var13 = WJQTPVDG.method577(arg1.field1385[var10]);
				var11 += var13.field1381;
				var12 += var13.field1340;

				if (var13.field1345 > 0) {
					method103(var13);
				}

				if (var13.field1354 == 0) {
					if (var13.field1357 > var13.field1362 - var13.field1374) {
						var13.field1357 = var13.field1362 - var13.field1374;
					}

					if (var13.field1357 < 0) {
						var13.field1357 = 0;
					}

					method115(var12, var13, var11, var13.field1357);

					if (var13.field1362 > var13.field1374) {
						method147(var12, var13.field1367 + var11, var13.field1357, var13.field1374, var13.field1362);
					}
				} else if (var13.field1354 != 1) {
					if (var13.field1354 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1374; var15++) {
							for (int var16 = 0; var16 < var13.field1367; var16++) {
								int var17 = (var13.field1365 + 32) * var16 + var11;
								int var18 = (var13.field1371 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1352[var14];
									var18 += var13.field1397[var14];
								}

								if (var13.field1373[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1373[var14] - 1;
									if (var17 > BAXODNVH.field36 - 32 && var17 < BAXODNVH.field37 && var18 > BAXODNVH.field34 - 32 && var18 < BAXODNVH.field35 || field496 != 0 && field495 == var14) {
										int var22 = 0;
										if (field265 == 1 && field266 == var14 && field267 == var13.field1396) {
											var22 = 0xFFFFFF;
										}

										TPIBHECB var23 = KIHBVNFV.method352(var22, var21, var13.field1379[var14]);
										if (var23 != null) {
											if (field496 != 0 && field495 == var14 && field494 == var13.field1396) {
												var19 = field945 - field497;
												var20 = field946 - field498;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field201 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method509(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < BAXODNVH.field34 && arg1.field1357 > 0) {
													int var24 = (BAXODNVH.field34 - var18 - var20) * field220 / 3;
													if (var24 > field220 * 10) {
														var24 = field220 * 10;
													}

													if (var24 > arg1.field1357) {
														var24 = arg1.field1357;
													}

													arg1.field1357 -= var24;
													field498 += var24;
												}

												if (var18 + var20 + 32 > BAXODNVH.field35 && arg1.field1357 < arg1.field1362 - arg1.field1374) {
													int var25 = (var18 + var20 + 32 - BAXODNVH.field35) * field220 / 3;
													if (var25 > field220 * 10) {
														var25 = field220 * 10;
													}

													if (var25 > arg1.field1362 - arg1.field1374 - arg1.field1357) {
														var25 = arg1.field1362 - arg1.field1374 - arg1.field1357;
													}

													arg1.field1357 += var25;
													field498 -= var25;
												}
											} else if (field485 != 0 && field484 == var14 && field483 == var13.field1396) {
												var23.method509(var17, 128, var18);
											} else {
												var23.method507(var17, var18);
											}

											if (var23.field1224 == 33 || var13.field1379[var14] != 1) {
												int var26 = var13.field1379[var14];
												field183.method236(var17 + var19 + 1, 0, method43(var26), var18 + var20 + 10);
												field183.method236(var17 + var19, 0xFFFF00, method43(var26), var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1402 != null && var14 < 20) {
									TPIBHECB var27 = var13.field1402[var14];
									if (var27 != null) {
										var27.method507(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1354 == 3) {
						boolean var28 = false;
						if (field212 == var13.field1396 || field364 == var13.field1396 || field476 == var13.field1396) {
							var28 = true;
						}

						int var29;
						if (method50(var13)) {
							var29 = var13.field1389;
							if (var28 && var13.field1350 != 0) {
								var29 = var13.field1350;
							}
						} else {
							var29 = var13.field1344;
							if (var28 && var13.field1335 != 0) {
								var29 = var13.field1335;
							}
						}

						if (var13.field1339 == 0) {
							if (var13.field1369) {
								BAXODNVH.method22(var13.field1367, var11, var13.field1374, var29, var12);
							} else {
								BAXODNVH.method23(var13.field1374, var13.field1367, var29, var11, var12);
							}
						} else if (var13.field1369) {
							BAXODNVH.method21(256 - (var13.field1339 & 0xFF), var13.field1367, var12, var13.field1374, var11, var29);
						} else {
							BAXODNVH.method24(var13.field1367, var12, var13.field1374, var29, var11, 256 - (var13.field1339 & 0xFF));
						}
					} else if (var13.field1354 == 4) {
						CWXRTTYV var30 = var13.field1366;
						String var31 = var13.field1370;
						boolean var32 = false;
						if (field212 == var13.field1396 || field364 == var13.field1396 || field476 == var13.field1396) {
							var32 = true;
						}

						int var33;
						if (method50(var13)) {
							var33 = var13.field1389;
							if (var32 && var13.field1350 != 0) {
								var33 = var13.field1350;
							}

							if (var13.field1407.length() > 0) {
								var31 = var13.field1407;
							}
						} else {
							var33 = var13.field1344;
							if (var32 && var13.field1335 != 0) {
								var33 = var13.field1335;
							}
						}

						if (var13.field1364 == 6 && field413) {
							var31 = "Please wait...";
							var33 = var13.field1344;
						}

						if (BAXODNVH.field32 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field558 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method107(method49(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method107(method49(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method107(method49(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method107(method49(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method107(method49(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1393) {
								var30.method233(var34, var33, var13.field1359, var13.field1367 / 2 + var11, var41);
							} else {
								var30.method240(var11, var34, var13.field1359, var41, var33);
							}

							var34 += var30.field558;
						}
					} else if (var13.field1354 == 5) {
						TPIBHECB var42;
						if (method50(var13)) {
							var42 = var13.field1392;
						} else {
							var42 = var13.field1384;
						}

						if (var42 != null) {
							var42.method507(var11, var12);
						}
					} else if (var13.field1354 == 6) {
						int var43 = NQTCRWWR.field964;
						int var44 = NQTCRWWR.field965;
						NQTCRWWR.field964 = var13.field1367 / 2 + var11;
						NQTCRWWR.field965 = var13.field1374 / 2 + var12;
						int var45 = NQTCRWWR.field968[var13.field1337] * var13.field1336 >> 16;
						int var46 = NQTCRWWR.field969[var13.field1337] * var13.field1336 >> 16;
						boolean var47 = method50(var13);
						int var48;
						if (var47) {
							var48 = var13.field1406;
						} else {
							var48 = var13.field1405;
						}

						GCSAWSJV var49;
						if (var48 == -1) {
							var49 = var13.method572(-1, var47, -1);
						} else {
							XRDQTWLL var50 = XRDQTWLL.field1418[var48];
							var49 = var13.method572(var50.field1421[var13.field1356], var47, var50.field1420[var13.field1356]);
						}

						if (var49 != null) {
							var49.method281(0, var13.field1338, 0, var13.field1337, 0, var45, var46);
						}

						NQTCRWWR.field964 = var43;
						NQTCRWWR.field965 = var44;
					} else {
						if (var13.field1354 == 7) {
							CWXRTTYV var51 = var13.field1366;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1374; var53++) {
								for (int var54 = 0; var54 < var13.field1367; var54++) {
									if (var13.field1373[var52] > 0) {
										KIHBVNFV var55 = KIHBVNFV.method346(var13.field1373[var52] - 1);
										String var56 = String.valueOf(var55.field858);
										if (var55.field841 || var13.field1379[var52] != 1) {
											var56 = var56 + " x" + method91(var13.field1379[var52]);
										}

										int var57 = (var13.field1365 + 115) * var54 + var11;
										int var58 = (var13.field1371 + 12) * var53 + var12;
										if (var13.field1393) {
											var51.method233(var58, var13.field1344, var13.field1359, var13.field1367 / 2 + var57, var56);
										} else {
											var51.method240(var57, var58, var13.field1359, var56, var13.field1344);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1354 == 8 && (field150 == var13.field1396 || field117 == var13.field1396 || field188 == var13.field1396) && field416 == 100) {
							int var59 = 0;
							int var60 = 0;
							CWXRTTYV var61 = field184;
							String var62 = var13.field1370;
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

								int var65 = var61.method234(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field558 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1367 + var11 - var59 - 5;
							int var67 = var13.field1374 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field1367 + arg2) {
								var66 = arg1.field1367 + arg2 - var59;
							}

							if (var60 + var67 > arg1.field1374 + arg0) {
								var67 = arg1.field1374 + arg0 - var60;
							}

							BAXODNVH.method22(var59, var66, var60, 0xFFFFA0, var67);
							BAXODNVH.method23(var60, var59, 0, var66, var67);
							String var68 = var13.field1370;
							int var69 = var61.field558 + var67 + 2;
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

								var61.method240(var66 + 3, var69, false, var71, 0);
								var69 += var61.field558 + 1;
							}
						}
					}
				}
			}

			BAXODNVH.method19(var6, var8, var7, var5);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void method116() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field331);

		if (field526 != null) {
			System.out.println("Od-cycle:" + field526.field1296);
		}

		System.out.println("loop-cycle:" + field404);
		System.out.println("draw-cycle:" + field161);
		System.out.println("ptype:" + field515);
		System.out.println("psize:" + field514);

		if (field300 != null) {
			field300.method551();
		}

		field934 = true;
	}

	@ObfuscatedName("client.c(B)Ljava/awt/Component;")
	public final Component method117() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field940 != null) {
			return field940;
		}

		return this;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method118(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field509; var2++) {
			if (arg0.equalsIgnoreCase(field170[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field335.field920)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.f(BI)V")
	public final void method119(int arg0) {
		WJQTPVDG var2 = WJQTPVDG.method577(arg0);
		for (int var3 = 0; var3 < var2.field1385.length && var2.field1385[var3] != -1; var3++) {
			WJQTPVDG var4 = WJQTPVDG.method577(var2.field1385[var3]);
			if (var4.field1354 == 1) {
				method119(var4.field1396);
			}

			var4.field1356 = 0;
			var4.field1404 = 0;
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method120() {
		method90();

		if (field492 == 1) {
			field480[field491 / 100].method507(field489 - 8 - 4, field490 - 8 - 4);
		}

		if (field492 == 2) {
			field480[field491 / 100 + 4].method507(field489 - 8 - 4, field490 - 8 - 4);
		}

		if (field295 != -1) {
			method81(field220, field295);
			method115(0, WJQTPVDG.method577(field295), 0, 0);
		}

		if (field399 != -1) {
			method81(field220, field399);
			method115(0, WJQTPVDG.method577(field399), 0, 0);
		}

		method99();

		if (!field373) {
			method165();
			method151();
		} else if (field323 == 0) {
			method141();
		}

		if (field444 == 1) {
			field133.method507(472, 296);
		}

		if (field131) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field933 < 30 && field247) {
				var3 = 0xFF0000;
			}

			if (field933 < 20 && !field247) {
				var3 = 0xFF0000;
			}

			field184.method231(var3, var2, var1, "Fps:" + field933);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field247) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field247) {
				int var8 = 0xFF0000;
			}

			field184.method231(0xFFFF00, var2, var1, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field425 != 0) {
			int var9 = field425 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field184.method236(4, 0xFFFF00, "System update in: " + var10 + ":0" + var9, 329);
			} else {
				field184.method236(4, 0xFFFF00, "System update in: " + var10 + ":" + var9, 329);
			}

			field339++;
			if (field339 > 188) {
				field339 = 0;
				field288.method183(175);
				field288.method187(0xA50581);
				return;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method121() {
		for (TCHKSJJL var1 = (TCHKSJJL) field499.method567(); var1 != null; var1 = (TCHKSJJL) field499.method569()) {
			if (field440 != var1.field1198 || field404 > var1.field1218) {
				var1.method1();
			} else if (field404 >= var1.field1217) {
				if (var1.field1197 > 0) {
					IGOBKPZP var2 = field127[var1.field1197 - 1];
					if (var2 != null && var2.field1110 >= 0 && var2.field1110 < 13312 && var2.field1111 >= 0 && var2.field1111 < 13312) {
						var1.method499(var2.field1110, var2.field1111, method60(var2.field1111, var1.field1198, var2.field1110) - var1.field1215, field404);
					}
				}

				if (var1.field1197 < 0) {
					int var3 = -var1.field1197 - 1;
					MDBQGDOL var4;
					if (field123 == var3) {
						var4 = field335;
					} else {
						var4 = field195[var3];
					}

					if (var4 != null && var4.field1110 >= 0 && var4.field1110 < 13312 && var4.field1111 >= 0 && var4.field1111 < 13312) {
						var1.method499(var4.field1110, var4.field1111, method60(var4.field1111, var1.field1198, var4.field1110) - var1.field1215, field404);
					}
				}

				var1.method500(field220);
				field511.method459(var1, field440, (int) var1.field1207, false, (int) var1.field1206, var1.field1209, -1, 60, (int) var1.field1208);
			}
		}

		field130++;
		if (field130 > 1712) {
			field130 = 0;
			field288.method183(23);
			field288.method184(0);
			int var5 = field288.field540;
			field288.method184((int) (Math.random() * 256.0D));
			field288.method185(9019);
			field288.method185(61258);
			field288.method184(42);
			field288.method184((int) (Math.random() * 256.0D));
			field288.method184((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field288.method184(188);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field288.method184(170);
			}

			field288.method184((int) (Math.random() * 256.0D));
			field288.method184((int) (Math.random() * 256.0D));
			field288.method193(field288.field540 - var5);
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method122() {
		if (!field228 && !field395 && !field419) {
			field404++;

			if (field107) {
				method180();
			} else {
				method76();
			}

			method153();
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method123() {
		int var1 = 5;
		field103[8] = 0;
		int var2 = 0;
		while (field103[8] == 0) {
			String var3 = "Unknown problem";
			method149("Connecting to web server", 20);

			try {
				DataInputStream var4 = method150("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 359);
				CMGGUSPR var5 = new CMGGUSPR(new byte[40]);
				var4.readFully(var5.field539, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field103[var6] = var5.method199();
				}

				int var7 = var5.method199();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field103[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field103[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field103[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field103[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field103[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field103[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method149("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method149(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field311 = !field311;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method124() {
		if (field353 == null) {
			field938 = null;
			field462 = null;
			field460 = null;
			field459 = null;
			field461 = null;
			field209 = null;
			field210 = null;
			field211 = null;
			field356 = new IUZTBIWV(method117(), 128, 265);
			BAXODNVH.method20();
			field357 = new IUZTBIWV(method117(), 128, 265);
			BAXODNVH.method20();
			field353 = new IUZTBIWV(method117(), 509, 171);
			BAXODNVH.method20();
			field354 = new IUZTBIWV(method117(), 360, 132);
			BAXODNVH.method20();
			field355 = new IUZTBIWV(method117(), 360, 200);
			BAXODNVH.method20();
			field358 = new IUZTBIWV(method117(), 202, 238);
			BAXODNVH.method20();
			field359 = new IUZTBIWV(method117(), 203, 238);
			BAXODNVH.method20();
			field360 = new IUZTBIWV(method117(), 74, 94);
			BAXODNVH.method20();
			field361 = new IUZTBIWV(method117(), 75, 94);
			BAXODNVH.method20();

			if (field191 != null) {
				method101();
				method80();
			}

			field513 = true;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method125(boolean arg0) {
		method124();
		field355.method327();
		field112.method424(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field116 == 0) {
			int var4 = var3 / 2 + 80;
			field183.method233(var4, 0x75A9A9, true, var2 / 2, field526.field1292);
			int var5 = var3 / 2 - 20;
			field185.method233(var5, 0xFFFF00, true, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field113.method424(var6 - 73, var7 - 20);
			field185.method233(var7 + 5, 0xFFFFFF, true, var6, "New User");
			int var8 = var2 / 2 + 80;
			field113.method424(var8 - 73, var7 - 20);
			field185.method233(var7 + 5, 0xFFFFFF, true, var8, "Existing User");
		}

		if (field116 == 2) {
			int var9 = var3 / 2 - 40;
			if (field535.length() > 0) {
				field185.method233(var9 - 15, 0xFFFF00, true, var2 / 2, field535);
				field185.method233(var9, 0xFFFF00, true, var2 / 2, field536);
				var9 += 30;
			} else {
				field185.method233(var9 - 7, 0xFFFF00, true, var2 / 2, field536);
				var9 += 30;
			}

			field185.method240(var2 / 2 - 90, var9, true, "Username: " + field348 + (field182 == 0 & field404 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;
			field185.method240(var2 / 2 - 88, var9, true, "Password: " + ZLGGMMMS.method602(field349) + (field182 == 1 & field404 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field113.method424(var10 - 73, var11 - 20);
				field185.method233(var11 + 5, 0xFFFFFF, true, var10, "Login");
				int var12 = var2 / 2 + 80;
				field113.method424(var12 - 73, var11 - 20);
				field185.method233(var11 + 5, 0xFFFFFF, true, var12, "Cancel");
			}
		}

		if (field116 == 3) {
			field185.method233(var3 / 2 - 60, 0xFFFF00, true, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field185.method233(var13, 0xFFFFFF, true, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field185.method233(var13, 0xFFFFFF, true, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field185.method233(var13, 0xFFFFFF, true, var2 / 2, "and choose the 'create account'");
			var13 += 15;
			field185.method233(var13, 0xFFFFFF, true, var2 / 2, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field113.method424(var14 - 73, var15 - 20);
			field185.method233(var15 + 5, 0xFFFFFF, true, var14, "Cancel");
		}

		field355.method328(202, 171, field937);

		if (field513) {
			field513 = false;
			field353.method328(128, 0, field937);
			field354.method328(202, 371, field937);
			field358.method328(0, 265, field937);
			field359.method328(562, 265, field937);
			field360.method328(128, 171, field937);
			field361.method328(562, 171, field937);
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method126(long arg0) {
		if (arg0 != 0L) {
			if (field509 >= 100 && field121 != 1) {
				method114("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field509 >= 200) {
				method114("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = ZLGGMMMS.method601(ZLGGMMMS.method598(arg0));
				for (int var4 = 0; var4 < field509; var4++) {
					if (field374[var4] == arg0) {
						method114("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field525; var5++) {
					if (field406[var5] == arg0) {
						method114("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field335.field920)) {
					field170[field509] = var3;
					field374[field509] = arg0;
					field376[field509] = 0;
					field509++;
					field405 = true;
					field288.method183(221);
					field288.method190(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIILWJQTPVDG;III)V")
	public final void method127(int arg0, int arg1, int arg2, int arg3, WJQTPVDG arg4, int arg5, int arg6) {
		if (arg4.field1354 == 0 && arg4.field1385 != null && !arg4.field1360 && (arg0 >= arg1 && arg5 >= arg2 && arg0 <= arg4.field1367 + arg1 && arg5 <= arg4.field1374 + arg2)) {
			int var8 = arg4.field1385.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg4.field1383[var9] + arg1;
				int var11 = arg4.field1400[var9] + arg2 - arg3;
				WJQTPVDG var12 = WJQTPVDG.method577(arg4.field1385[var9]);
				var10 += var12.field1381;
				var11 += var12.field1340;
				if ((var12.field1391 >= 0 || var12.field1335 != 0) && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
					if (var12.field1391 >= 0) {
						field321 = var12.field1391;
					} else {
						field321 = var12.field1396;
					}
				}

				if (var12.field1354 == 8 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
					field397 = var12.field1396;
				}

				if (var12.field1354 == 0) {
					method127(arg0, var10, var11, var12.field1357, var12, arg5, arg6);

					if (var12.field1362 > var12.field1374) {
						method174(var11, var12.field1374, arg5, arg0, var12.field1367 + var10, var12, var12.field1362, arg6);
					}
				} else {
					if (var12.field1364 == 1 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						boolean var13 = false;
						if (var12.field1345 != 0) {
							var13 = method177(var12);
						}

						if (!var13) {
							field99[field345] = var12.field1399;
							field235[field345] = 585;
							field234[field345] = var12.field1396;
							field345++;
						}
					}

					if (var12.field1364 == 2 && field296 == 0 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						String var14 = var12.field1386;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field99[field345] = var14 + " @gre@" + var12.field1361;
						field235[field345] = 407;
						field234[field345] = var12.field1396;
						field345++;
					}

					if (var12.field1364 == 3 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						field99[field345] = "Close";

						if (arg6 == 3) {
							field235[field345] = 850;
						} else {
							field235[field345] = 48;
						}

						field234[field345] = var12.field1396;
						field345++;
					}

					if (var12.field1364 == 4 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						field99[field345] = var12.field1399;
						field235[field345] = 899;
						field234[field345] = var12.field1396;
						field345++;
					}

					if (var12.field1364 == 5 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						field99[field345] = var12.field1399;
						field235[field345] = 551;
						field234[field345] = var12.field1396;
						field345++;
					}

					if (var12.field1364 == 6 && !field413 && arg0 >= var10 && arg5 >= var11 && arg0 < var12.field1367 + var10 && arg5 < var12.field1374 + var11) {
						field99[field345] = var12.field1399;
						field235[field345] = 594;
						field234[field345] = var12.field1396;
						field345++;
					}

					if (var12.field1354 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1374; var16++) {
							for (int var17 = 0; var17 < var12.field1367; var17++) {
								int var18 = (var12.field1365 + 32) * var17 + var10;
								int var19 = (var12.field1371 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1352[var15];
									var19 += var12.field1397[var15];
								}

								if (arg0 >= var18 && arg5 >= var19 && arg0 < var18 + 32 && arg5 < var19 + 32) {
									field337 = var15;
									field338 = var12.field1396;

									if (var12.field1373[var15] > 0) {
										KIHBVNFV var20 = KIHBVNFV.method346(var12.field1373[var15] - 1);
										if (field265 == 1 && var12.field1377) {
											if (field267 != var12.field1396 || field266 != var15) {
												field99[field345] = "Use " + field269 + " with @lre@" + var20.field858;
												field235[field345] = 652;
												field236[field345] = var20.field839;
												field233[field345] = var15;
												field234[field345] = var12.field1396;
												field345++;
											}
										} else if (field296 != 1 || !var12.field1377) {
											if (var12.field1377) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field883 != null && var20.field883[var21] != null) {
														field99[field345] = var20.field883[var21] + " @lre@" + var20.field858;

														if (var21 == 3) {
															field235[field345] = 66;
														}

														if (var21 == 4) {
															field235[field345] = 529;
														}

														field236[field345] = var20.field839;
														field233[field345] = var15;
														field234[field345] = var12.field1396;
														field345++;
													} else if (var21 == 4) {
														field99[field345] = "Drop @lre@" + var20.field858;
														field235[field345] = 529;
														field236[field345] = var20.field839;
														field233[field345] = var15;
														field234[field345] = var12.field1396;
														field345++;
													}
												}
											}

											if (var12.field1403) {
												field99[field345] = "Use @lre@" + var20.field858;
												field235[field345] = 179;
												field236[field345] = var20.field839;
												field233[field345] = var15;
												field234[field345] = var12.field1396;
												field345++;
											}

											if (var12.field1377 && var20.field883 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field883[var22] != null) {
														field99[field345] = var20.field883[var22] + " @lre@" + var20.field858;

														if (var22 == 0) {
															field235[field345] = 343;
														}

														if (var22 == 1) {
															field235[field345] = 875;
														}

														if (var22 == 2) {
															field235[field345] = 794;
														}

														field236[field345] = var20.field839;
														field233[field345] = var15;
														field234[field345] = var12.field1396;
														field345++;
													}
												}
											}

											if (var12.field1343 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1343[var23] != null) {
														field99[field345] = var12.field1343[var23] + " @lre@" + var20.field858;

														if (var23 == 0) {
															field235[field345] = 62;
														}

														if (var23 == 1) {
															field235[field345] = 352;
														}

														if (var23 == 2) {
															field235[field345] = 16;
														}

														if (var23 == 3) {
															field235[field345] = 887;
														}

														if (var23 == 4) {
															field235[field345] = 56;
														}

														field236[field345] = var20.field839;
														field233[field345] = var15;
														field234[field345] = var12.field1396;
														field345++;
													}
												}
											}

											field99[field345] = "Examine @lre@" + var20.field858;
											field235[field345] = 1934;
											field236[field345] = var20.field839;
											field233[field345] = var15;
											field234[field345] = var12.field1396;
											field345++;
										} else if ((field298 & 0x10) == 0x10) {
											field99[field345] = field299 + " @lre@" + var20.field858;
											field235[field345] = 399;
											field236[field345] = var20.field839;
											field233[field345] = var15;
											field234[field345] = var12.field1396;
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

	@ObfuscatedName("client.b(LCMGGUSPR;BI)V")
	public final void method128(CMGGUSPR arg0, int arg1) {
		while (arg0.field541 + 10 < arg1 * 8) {
			int var3 = arg0.method205(11);
			if (var3 == 2047) {
				break;
			}

			if (field195[var3] == null) {
				field195[var3] = new MDBQGDOL();
				if (field200[var3] != null) {
					field195[var3].method358(field200[var3]);
				}
			}

			field197[field196++] = var3;
			MDBQGDOL var4 = field195[var3];
			var4.field1115 = field404;
			int var5 = arg0.method205(1);
			if (var5 == 1) {
				field199[field198++] = var3;
			}

			int var6 = arg0.method205(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method205(1);
			int var8 = arg0.method205(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method442(var7 == 1, field335.field1097[0] + var8, field335.field1098[0] + var6);
		}

		arg0.method206();
	}

	@ObfuscatedName("client.u(I)V")
	public final void method129() {
		if (field951 == 1) {
			if (field952 >= 539 && field952 <= 573 && field953 >= 169 && field953 < 205 && field254[0] != -1) {
				field405 = true;
				field396 = 0;
				field173 = true;
			}

			if (field952 >= 569 && field952 <= 599 && field953 >= 168 && field953 < 205 && field254[1] != -1) {
				field405 = true;
				field396 = 1;
				field173 = true;
			}

			if (field952 >= 597 && field952 <= 627 && field953 >= 168 && field953 < 205 && field254[2] != -1) {
				field405 = true;
				field396 = 2;
				field173 = true;
			}

			if (field952 >= 625 && field952 <= 669 && field953 >= 168 && field953 < 203 && field254[3] != -1) {
				field405 = true;
				field396 = 3;
				field173 = true;
			}

			if (field952 >= 666 && field952 <= 696 && field953 >= 168 && field953 < 205 && field254[4] != -1) {
				field405 = true;
				field396 = 4;
				field173 = true;
			}

			if (field952 >= 694 && field952 <= 724 && field953 >= 168 && field953 < 205 && field254[5] != -1) {
				field405 = true;
				field396 = 5;
				field173 = true;
			}

			if (field952 >= 722 && field952 <= 756 && field953 >= 169 && field953 < 205 && field254[6] != -1) {
				field405 = true;
				field396 = 6;
				field173 = true;
			}

			if (field952 >= 540 && field952 <= 574 && field953 >= 466 && field953 < 502 && field254[7] != -1) {
				field405 = true;
				field396 = 7;
				field173 = true;
			}

			if (field952 >= 572 && field952 <= 602 && field953 >= 466 && field953 < 503 && field254[8] != -1) {
				field405 = true;
				field396 = 8;
				field173 = true;
			}

			if (field952 >= 599 && field952 <= 629 && field953 >= 466 && field953 < 503 && field254[9] != -1) {
				field405 = true;
				field396 = 9;
				field173 = true;
			}

			if (field952 >= 627 && field952 <= 671 && field953 >= 467 && field953 < 502 && field254[10] != -1) {
				field405 = true;
				field396 = 10;
				field173 = true;
			}

			if (field952 >= 669 && field952 <= 699 && field953 >= 466 && field953 < 503 && field254[11] != -1) {
				field405 = true;
				field396 = 11;
				field173 = true;
			}

			if (field952 >= 696 && field952 <= 726 && field953 >= 466 && field953 < 503 && field254[12] != -1) {
				field405 = true;
				field396 = 12;
				field173 = true;
			}

			if (field952 >= 724 && field952 <= 758 && field953 >= 466 && field953 < 502 && field254[13] != -1) {
				field405 = true;
				field396 = 13;
				field173 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LSDXDPBJK;II)V")
	public final void method130(SDXDPBJK arg0, int arg1) {
		method131(arg0.field1110, arg0.field1111, arg1);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method131(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method60(arg1, field440, arg0) - arg2;
			arg0 -= field155;
			var4 -= field156;
			arg1 -= field157;
			int var5 = GCSAWSJV.field655[field158];
			int var6 = GCSAWSJV.field656[field158];
			int var7 = GCSAWSJV.field655[field159];
			int var8 = GCSAWSJV.field656[field159];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field100 = (var9 << 9) / arg1 + NQTCRWWR.field964;
				field101 = (var11 << 9) / arg1 + NQTCRWWR.field965;
			} else {
				field100 = -1;
				field101 = -1;
			}
		} else {
			field100 = -1;
			field101 = -1;
		}
	}

	@ObfuscatedName("client.a(IBIILjava/lang/String;Ljava/lang/String;)LUUIGNTAD;")
	public final UUIGNTAD method132(int arg0, int arg1, int arg2, String arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field522[0] != null) {
				var6 = field522[0].method333(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field502.reset();
			field502.update(var6);
			int var8 = (int) field502.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new UUIGNTAD(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method149("Requesting " + arg3, arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method150(arg4 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				CMGGUSPR var16 = new CMGGUSPR(var15);
				var16.field540 = 3;
				int var17 = var16.method198() + 6;
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
						method149("Loading " + arg3 + " - " + var22 + "%", arg1);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field522[0] != null) {
						field522[0].method334(arg0, var6, var6.length);
					}
				} catch (Exception var28) {
					field522[0] = null;
				}

				if (var6 != null) {
					field502.reset();
					field502.update(var6);
					int var23 = (int) field502.getValue();
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
						method149("Game updated - please reload page", arg1);
						var25 = 10;
					} else {
						method149(var11 + " - Retrying in " + var25, arg1);
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

				field311 = !field311;
			}
		}

		return new UUIGNTAD(var6);
	}

	@ObfuscatedName("client.m(B)Z")
	public final boolean method133() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(B)V")
	public final void method134() {
		field315 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field336[var1] = -1;
			for (int var2 = 0; var2 < CFPLMOQH.field90; var2++) {
				if (!CFPLMOQH.field91[var2].field97 && CFPLMOQH.field91[var2].field92 == var1 + (field534 ? 0 : 7)) {
					field336[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method135() {
		field151 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field441) {
				field331++;
				method67();
				method67();
				method61();
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

		field151 = false;
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method136(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field235[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 166) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method137() {
		if (field951 == 1) {
			if (field952 >= 6 && field952 <= 106 && field953 >= 467 && field953 <= 499) {
				field243 = (field243 + 1) % 4;
				field277 = true;
				field473 = true;
				field288.method183(205);
				field288.method184(field243);
				field288.method184(field479);
				field288.method184(field174);
			}

			if (field952 >= 135 && field952 <= 235 && field953 >= 467 && field953 <= 499) {
				field479 = (field479 + 1) % 3;
				field277 = true;
				field473 = true;
				field288.method183(205);
				field288.method184(field243);
				field288.method184(field479);
				field288.method184(field174);
			}

			if (field952 >= 273 && field952 <= 373 && field953 >= 467 && field953 <= 499) {
				field174 = (field174 + 1) % 3;
				field277 = true;
				field473 = true;
				field288.method183(205);
				field288.method184(field243);
				field288.method184(field479);
				field288.method184(field174);
			}

			if (field952 >= 412 && field952 <= 512 && field953 >= 467 && field953 <= 499) {
				if (field399 == -1) {
					method93();
					field375 = "";
					field106 = false;
					field317 = field399 = WJQTPVDG.field1351;
					return;
				}

				method114("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method138() {
		for (int var1 = -1; var1 < field196; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field194;
			} else {
				var2 = field197[var1];
			}

			MDBQGDOL var3 = field195[var2];
			if (var3 != null) {
				method69(1, var3);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method139() {
		if (field496 == 0) {
			int var1 = field951;
			if (field296 == 1 && field952 >= 516 && field953 >= 160 && field952 <= 765 && field953 <= 205) {
				var1 = 0;
			}

			if (field373) {
				if (var1 != 1) {
					int var2 = field945;
					int var3 = field946;
					if (field323 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field323 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field323 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field324 - 10 || var2 > field326 + field324 + 10 || var3 < field325 - 10 || var3 > field327 + field325 + 10) {
						field373 = false;

						if (field323 == 1) {
							field405 = true;
						}

						if (field323 == 2) {
							field473 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field324;
					int var5 = field325;
					int var6 = field326;
					int var7 = field952;
					int var8 = field953;
					if (field323 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field323 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field323 == 2) {
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
						method102(var9);
					}

					field373 = false;

					if (field323 == 1) {
						field405 = true;
					}

					if (field323 == 2) {
						field473 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field345 > 0) {
					int var12 = field235[field345 - 1];
					if (var12 == 62 || var12 == 352 || var12 == 16 || var12 == 887 || var12 == 56 || var12 == 343 || var12 == 875 || var12 == 794 || var12 == 66 || var12 == 529 || var12 == 179 || var12 == 1934) {
						int var13 = field233[field345 - 1];
						int var14 = field234[field345 - 1];
						WJQTPVDG var15 = WJQTPVDG.method577(var14);
						if (var15.field1398 || var15.field1347) {
							field458 = false;
							field201 = 0;
							field494 = var14;
							field495 = var13;
							field496 = 2;
							field497 = field952;
							field498 = field953;

							if (WJQTPVDG.method577(var14).field1378 == field399) {
								field496 = 1;
							}

							if (WJQTPVDG.method577(var14).field1378 == field538) {
								field496 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field284 == 1 || method136(field345 - 1)) && field345 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field345 > 0) {
					method102(field345 - 1);
				}

				if (var1 != 2 || field345 <= 0) {
					return;
				}

				method85();
			}
		}
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method140(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field509; var3++) {
				if (field374[var3] == arg0) {
					field509--;
					field405 = true;

					for (int var4 = var3; var4 < field509; var4++) {
						field170[var4] = field170[var4 + 1];
						field376[var4] = field376[var4 + 1];
						field374[var4] = field374[var4 + 1];
					}

					field288.method183(167);
					field288.method190(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method141() {
		int var1 = field324;
		int var2 = field325;
		int var3 = field326;
		int var4 = field327;
		int var5 = 0x5D5447;
		BAXODNVH.method22(var3, var1, var4, var5, var2);
		BAXODNVH.method22(var3 - 2, var1 + 1, 16, 0, var2 + 1);
		BAXODNVH.method23(var4 - 19, var3 - 2, 0, var1 + 1, var2 + 18);
		field185.method236(var1 + 3, var5, "Choose Option", var2 + 14);
		int var6 = field945;
		int var7 = field946;
		if (field323 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field323 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field323 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field345; var8++) {
			int var9 = (field345 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field185.method240(var1 + 3, var9, true, field99[var8], var10);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method142() {
		if (field518 > 0) {
			method56();
		} else {
			method57("Please wait - attempting to reestablish", "Connection lost");
			field149 = 0;
			field270 = 0;
			UUQNASSN var1 = field300;
			field107 = false;
			field417 = 0;
			method63(field348, field349, true);

			if (!field107) {
				method56();
			}

			try {
				var1.method546();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method143() {
		field462.method327();
		NQTCRWWR.field970 = field426;
		field168.method424(0, 0);

		if (field383) {
			field185.method232(0, 239, 40, field283);
			field185.method232(128, 239, 60, field289 + "*");
		} else if (field273 == 1) {
			field185.method232(0, 239, 40, "Enter amount:");
			field185.method232(128, 239, 60, field301 + "*");
		} else if (field273 == 2) {
			field185.method232(0, 239, 40, "Enter name:");
			field185.method232(128, 239, 60, field301 + "*");
		} else if (field273 == 3) {
			if (field378 != field301) {
				method113(field301);
				field378 = field301;
			}

			CWXRTTYV var1 = field184;
			BAXODNVH.method19(0, 77, 463, 0);

			for (int var2 = 0; var2 < field379; var2++) {
				int var3 = var2 * 14 + 18 - field382;
				if (var3 > 0 && var3 < 110) {
					var1.method232(0, 239, var3, field380[var2]);
				}
			}

			BAXODNVH.method18();

			if (field379 > 5) {
				method147(0, 463, field382, 77, field379 * 14 + 7);
			}

			if (field301.length() == 0) {
				field185.method232(255, 239, 40, "Enter object name");
			} else if (field379 == 0) {
				field185.method232(0, 239, 40, "No matching objects found, please shorten search");
			}

			var1.method232(0, 239, 90, field301 + "*");
			BAXODNVH.method25(479, 0, 0, 77);
		} else if (field114 != null) {
			field185.method232(0, 239, 40, field114);
			field185.method232(128, 239, 60, "Click to continue");
		} else if (field538 != -1) {
			method115(0, WJQTPVDG.method577(field538), 0, 0);
		} else if (field319 == -1) {
			CWXRTTYV var4 = field184;
			int var5 = 0;
			BAXODNVH.method19(0, 77, 463, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field388[var6] != null) {
					int var7 = field386[var6];
					int var8 = field146 + 70 - var5 * 14;
					String var9 = field387[var6];
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
							var4.method236(4, 0, field388[var6], var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field243 == 0 || field243 == 1 && method118(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field415[0].method424(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field415[1].method424(var11, var8 - 12);
								var11 += 14;
							}

							var4.method236(var11, 0, var9 + ":", var8);
							var11 += var4.method234(var9) + 8;
							var4.method236(var11, 255, field388[var6], var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field302 == 0 && (var7 == 7 || field479 == 0 || field479 == 1 && method118(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method236(var12, 0, "From", var8);
							int var14 = var12 + var4.method234("From ");
							if (var10 == 1) {
								field415[0].method424(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field415[1].method424(var14, var8 - 12);
								var14 += 14;
							}

							var4.method236(var14, 0, var9 + ":", var8);
							var14 += var4.method234(var9) + 8;
							var4.method236(var14, 0x800000, field388[var6], var8);
						}

						var5++;
					}

					if (var7 == 4 && (field174 == 0 || field174 == 1 && method118(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method236(4, 0x800080, var9 + " " + field388[var6], var8);
						}

						var5++;
					}

					if (var7 == 5 && field302 == 0 && field479 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method236(4, 0x800000, field388[var6], var8);
						}

						var5++;
					}

					if (var7 == 6 && field302 == 0 && field479 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method236(4, 0, "To " + var9 + ":", var8);
							var4.method236(var4.method234("To " + var9) + 12, 0x800000, field388[var6], var8);
						}

						var5++;
					}

					if (var7 == 8 && (field174 == 0 || field174 == 1 && method118(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method236(4, 0x7E3200, var9 + " " + field388[var6], var8);
						}

						var5++;
					}
				}
			}

			BAXODNVH.method18();
			field202 = var5 * 14 + 7;
			if (field202 < 78) {
				field202 = 78;
			}

			method147(0, 463, field202 - field146 - 77, 77, field202);
			String var13;
			if (field335 == null || field335.field920 == null) {
				var13 = ZLGGMMMS.method601(field348);
			} else {
				var13 = field335.field920;
			}

			var4.method236(4, 0, var13 + ":", 90);
			var4.method236(var4.method234(var13 + ": ") + 6, 255, field393 + "*", 90);
			BAXODNVH.method25(479, 0, 0, 77);
		} else {
			method115(0, WJQTPVDG.method577(field319), 0, 0);
		}

		if (field373 && field323 == 2) {
			method141();
		}

		field462.method328(17, 357, field937);
		field461.method327();
		NQTCRWWR.field970 = field428;
	}

	@ObfuscatedName("client.a(IILTQRZOVPP;II)V")
	public final void method144(int arg0, int arg1, TQRZOVPP arg2, int arg3) {
		if (field345 < 400) {
			if (arg2.field1231 != null) {
				arg2 = arg2.method515();
			}

			if (arg2 != null && arg2.field1242) {
				String var5 = arg2.field1239;
				if (arg2.field1257 != 0) {
					var5 = var5 + method172(arg2.field1257, field335.field912) + " (level-" + arg2.field1257 + ")";
				}

				if (field265 == 1) {
					field99[field345] = "Use " + field269 + " with @yel@" + var5;
					field235[field345] = 683;
					field236[field345] = arg3;
					field233[field345] = arg1;
					field234[field345] = arg0;
					field345++;
				} else if (field296 != 1) {
					if (arg2.field1241 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field1241[var6] != null && !arg2.field1241[var6].equalsIgnoreCase("attack")) {
								field99[field345] = arg2.field1241[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field235[field345] = 488;
								}

								if (var6 == 1) {
									field235[field345] = 642;
								}

								if (var6 == 2) {
									field235[field345] = 830;
								}

								if (var6 == 3) {
									field235[field345] = 22;
								}

								if (var6 == 4) {
									field235[field345] = 295;
								}

								field236[field345] = arg3;
								field233[field345] = arg1;
								field234[field345] = arg0;
								field345++;
							}
						}
					}

					if (arg2.field1241 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field1241[var7] != null && arg2.field1241[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field1257 > field335.field912) {
									var8 = 2000;
								}

								field99[field345] = arg2.field1241[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field235[field345] = var8 + 488;
								}

								if (var7 == 1) {
									field235[field345] = var8 + 642;
								}

								if (var7 == 2) {
									field235[field345] = var8 + 830;
								}

								if (var7 == 3) {
									field235[field345] = var8 + 22;
								}

								if (var7 == 4) {
									field235[field345] = var8 + 295;
								}

								field236[field345] = arg3;
								field233[field345] = arg1;
								field234[field345] = arg0;
								field345++;
							}
						}
					}

					field99[field345] = "Examine @yel@" + var5;
					field235[field345] = 1986;
					field236[field345] = arg3;
					field233[field345] = arg1;
					field234[field345] = arg0;
					field345++;
				} else if ((field298 & 0x2) == 2) {
					field99[field345] = field299 + " @yel@" + var5;
					field235[field345] = 898;
					field236[field345] = arg3;
					field233[field345] = arg1;
					field234[field345] = arg0;
					field345++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(LCMGGUSPR;BI)V")
	public final void method145(CMGGUSPR arg0, int arg1) {
		field231 = 0;
		field198 = 0;
		method48(arg1, arg0);
		method42(arg0, arg1);
		method128(arg0, arg1);
		method98(arg1, arg0);

		for (int var3 = 0; var3 < field231; var3++) {
			int var4 = field232[var3];
			if (field404 != field195[var4].field1115) {
				field195[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field196; var5++) {
			if (field195[field197[var5]] == null) {
				signlink.reporterror(field348 + " null entry in pl list - pos:" + var5 + " size:" + field196);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method146() {
		if (field228 || field395 || field419) {
			method173();
		} else {
			field161++;

			if (field107) {
				method75();
			} else {
				method125(false);
			}

			field203 = 0;
		}
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field216.method424(arg1, arg0);
		field217.method424(arg1, arg0 + arg3 - 16);
		BAXODNVH.method22(16, arg1, arg3 - 32, field334, arg0 + 16);
		int var6 = (arg3 - 32) * arg3 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg2 / (arg4 - arg3);
		BAXODNVH.method22(16, arg1, var6, field163, arg0 + var7 + 16);
		BAXODNVH.method27(var6, arg1, arg0 + var7 + 16, field443);
		BAXODNVH.method27(var6, arg1 + 1, arg0 + 16 + var7, field443);
		BAXODNVH.method25(16, arg1, field443, arg0 + var7 + 16);
		BAXODNVH.method25(16, arg1, field443, arg0 + var7 + 17);
		BAXODNVH.method27(var6, arg1 + 15, arg0 + 16 + var7, field154);
		BAXODNVH.method27(var6 - 1, arg1 + 14, arg0 + var7 + 17, field154);
		BAXODNVH.method25(16, arg1, field154, arg0 + var7 + var6 + 15);
		BAXODNVH.method25(15, arg1 + 1, field154, arg0 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.e(II)V")
	public final void method148(int arg0, int arg1) {
		WCVCMGLX var3 = field537[field440][arg0][arg1];
		if (var3 == null) {
			field511.method469(field440, arg0, arg1);
		} else {
			int var4 = -99999999;
			QXUWKDGL var5 = null;
			for (QXUWKDGL var6 = (QXUWKDGL) var3.method567(); var6 != null; var6 = (QXUWKDGL) var3.method569()) {
				KIHBVNFV var7 = KIHBVNFV.method346(var6.field1038);
				int var8 = var7.field873;
				if (var7.field841) {
					var8 = (var6.field1039 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method565(var5);
			QXUWKDGL var9 = null;
			QXUWKDGL var10 = null;
			for (QXUWKDGL var11 = (QXUWKDGL) var3.method567(); var11 != null; var11 = (QXUWKDGL) var3.method569()) {
				if (var5.field1038 != var11.field1038 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1038 != var11.field1038 && var9.field1038 != var11.field1038 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field511.method455(var9, arg0, method60(arg1 * 128 + 64, field440, arg0 * 128 + 64), field440, var5, var12, var10, arg1);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IZ)V")
	public final void method149(String arg0, int arg1) {
		field439 = arg1;
		field527 = arg0;
		method124();

		if (field191 == null) {
			super.method149(arg0, arg1);
		} else {
			field355.method327();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field185.method232(0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			BAXODNVH.method23(34, 304, 0x8C1111, var3 / 2 - 152, var6);
			BAXODNVH.method23(32, 302, 0, var3 / 2 - 151, var6 + 1);
			BAXODNVH.method22(arg1 * 3, var3 / 2 - 150, 30, 0x8C1111, var6 + 2);
			BAXODNVH.method22(300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), 30, 0, var6 + 2);
			field185.method232(0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5, arg0);
			field355.method328(202, 171, field937);

			if (field513) {
				field513 = false;

				if (!field441) {
					field356.method328(0, 0, field937);
					field357.method328(637, 0, field937);
				}

				field353.method328(128, 0, field937);
				field354.method328(202, 371, field937);
				field358.method328(0, 265, field937);
				field359.method328(562, 265, field937);
				field360.method328(128, 171, field937);
				field361.method328(562, 171, field937);
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method150(String arg0) throws IOException {
		if (field311) {
			if (field115 != null) {
				try {
					field115.close();
				} catch (Exception var4) {
				}

				field115 = null;
			}

			field115 = method66(43595);
			field115.setSoTimeout(10000);
			InputStream var2 = field115.getInputStream();
			OutputStream var3 = field115.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.z(I)V")
	public final void method151() {
		if (field345 >= 2 || field265 != 0 || field296 != 0) {
			String var1;
			if (field265 == 1 && field345 < 2) {
				var1 = "Use " + field269 + " with...";
			} else if (field296 == 1 && field345 < 2) {
				var1 = field299 + "...";
			} else {
				var1 = field99[field345 - 1];
			}

			if (field345 > 2) {
				var1 = var1 + "@whi@ / " + (field345 - 2) + " more options";
			}

			field185.method241(15, var1, field404 / 1000, 4, 0xFFFFFF, true);
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method152() {
		field441 = false;
		while (field151) {
			field441 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field112 = null;
		field113 = null;
		field453 = null;
		field421 = null;
		field422 = null;
		field423 = null;
		field424 = null;
		field218 = null;
		field219 = null;
		field303 = null;
		field304 = null;
		field523 = null;
		field524 = null;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method153() {
		while (true) {
			HLJPLHON var1 = field526.method536();
			if (var1 == null) {
				return;
			}

			if (var1.field757 == 0) {
				GCSAWSJV.method258(var1.field755, var1.field753);

				if ((field526.method535(var1.field753) & 0x62) != 0) {
					field405 = true;

					if (field538 != -1 || field319 != -1) {
						field473 = true;
					}
				}
			}

			if (var1.field757 == 1 && var1.field755 != null) {
				RLONYBCF.method433(var1.field755);
			}

			if (var1.field757 == 2 && field471 == var1.field753 && var1.field755 != null) {
				method88(var1.field755, field472);
			}

			if (var1.field757 == 3 && field285 == 1) {
				for (int var2 = 0; var2 < field125.length; var2++) {
					if (field448[var2] == var1.field753) {
						field125[var2] = var1.field755;

						if (var1.field755 == null) {
							field448[var2] = -1;
						}

						break;
					}

					if (field449[var2] == var1.field753) {
						field276[var2] = var1.field755;

						if (var1.field755 == null) {
							field449[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field757 == 93 && field526.method543(var1.field753)) {
				IPCPGCKM.method325(new CMGGUSPR(var1.field755), field526);
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method154() {
		if (field302 != 0) {
			int var1 = 0;
			if (field425 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field388[var2] != null) {
					int var3 = field386[var2];
					String var4 = field387[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field479 == 0 || field479 == 1 && method118(var4))) {
						int var8 = 329 - var1 * 13;
						if (field945 > 4 && field946 - 4 > var8 - 10 && field946 - 4 <= var8 + 3) {
							int var9 = field184.method234("From:  " + var4 + field388[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field945 < var9 + 4) {
								if (field519 >= 1) {
									field99[field345] = "Report abuse @whi@" + var4;
									field235[field345] = 2641;
									field345++;
								}

								field99[field345] = "Add ignore @whi@" + var4;
								field235[field345] = 2895;
								field345++;
								field99[field345] = "Add friend @whi@" + var4;
								field235[field345] = 2166;
								field345++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field479 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILCMGGUSPR;I)V")
	public final void method155(CMGGUSPR arg0, int arg1) {
		field231 = 0;
		field198 = 0;
		method108(arg0, arg1);
		method171(arg1, arg0);
		method178(arg1, arg0);

		for (int var3 = 0; var3 < field231; var3++) {
			int var4 = field232[var3];
			if (field404 != field127[var4].field1115) {
				field127[var4].field758 = null;
				field127[var4] = null;
			}
		}

		if (arg0.field540 != arg1) {
			signlink.reporterror(field348 + " size mismatch in getnpcpos - pos:" + arg0.field540 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field128; var5++) {
			if (field127[field129[var5]] == null) {
				signlink.reporterror(field348 + " null entry in npc list - pos:" + var5 + " size:" + field128);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method156(boolean arg0) {
		if (field335.field1110 >> 7 == field270 && field335.field1111 >> 7 == field271) {
			field270 = 0;
		}

		int var2 = field196;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			MDBQGDOL var4;
			int var5;
			if (arg0) {
				var4 = field335;
				var5 = field194 << 14;
			} else {
				var4 = field195[field197[var3]];
				var5 = field197[var3] << 14;
			}

			if (var4 != null && var4.method302()) {
				var4.field899 = false;
				if ((field247 && field196 > 50 || field196 > 200) && !arg0 && var4.field1102 == var4.field1091) {
					var4.field899 = true;
				}

				int var6 = var4.field1110 >> 7;
				int var7 = var4.field1111 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field916 == null || field404 < var4.field896 || field404 >= var4.field897) {
						if ((var4.field1110 & 0x7F) == 0x40 && (var4.field1111 & 0x7F) == 0x40) {
							if (field187[var6][var7] == field122) {
								continue;
							}

							field187[var6][var7] = field122;
						}

						var4.field910 = method60(var4.field1111, field440, var4.field1110);
						field511.method459(var4, field440, var4.field1111, var4.field1124, var4.field1110, var4.field1112, var5, 60, var4.field910);
					} else {
						var4.field899 = false;
						var4.field910 = method60(var4.field1111, field440, var4.field1110);
						field511.method460(var4.field1110, var4.field1111, var4.field906, var4.field910, field440, var5, var4.field905, 60, var4.field904, var4.field903, var4.field1112, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILTPIBHECB;B)V")
	public final void method157(int arg0, int arg1, TPIBHECB arg2) {
		int var4 = field342 + field279 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = GCSAWSJV.field655[var4];
			int var7 = GCSAWSJV.field656[var4];
			var6 = var6 * 256 / (field400 + 256);
			var7 = var7 * 256 / (field400 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method513(var8 + 94 + 4 - arg2.field1224 / 2, 83 - var9 - arg2.field1225 / 2 - 4, field167);
			} else {
				arg2.method507(var8 + 94 + 4 - arg2.field1224 / 2, 83 - var9 - arg2.field1225 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.s(B)V")
	public final void method158() {
		for (int var1 = -1; var1 < field196; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field194;
			} else {
				var2 = field197[var1];
			}

			MDBQGDOL var3 = field195[var2];
			if (var3 != null && var3.field1077 > 0) {
				var3.field1077--;
				if (var3.field1077 == 0) {
					var3.field1116 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field128; var4++) {
			int var5 = field129[var4];
			IGOBKPZP var6 = field127[var5];
			if (var6 != null && var6.field1077 > 0) {
				var6.field1077--;
				if (var6.field1077 == 0) {
					var6.field1116 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.t(B)V")
	public final void method159() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.B(I)V")
	public final void method160() {
		for (int var1 = 0; var1 < field351; var1++) {
			if (field292[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field172[var1] != field450 || field274[var1] != field223) {
						CMGGUSPR var3 = ADSZDTIC.method10(field172[var1], field274[var1]);
						if (System.currentTimeMillis() + var3.field540 / 22 > field214 / 22 + field108) {
							field214 = var3.field540;
							field108 = System.currentTimeMillis();

							if (method170(var3.field540, var3.field539)) {
								field450 = field172[var1];
								field223 = field274[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method133()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field288.method183(49);
						field288.method185(field172[var1] & 0x7FFF);
					} else {
						field288.method183(49);
						field288.method185(-1);
					}
				}

				if (var2 && field292[var1] != -5) {
					field292[var1] = -5;
				} else {
					field351--;
					for (int var5 = var1; var5 < field351; var5++) {
						field172[var5] = field172[var5 + 1];
						field274[var5] = field274[var5 + 1];
						field292[var5] = field292[var5 + 1];
					}

					var1--;
				}
			} else {
				field292[var1]--;
			}
		}

		if (field367 > 0) {
			field367 -= 20;
			if (field367 < 0) {
				field367 = 0;
			}

			if (field367 == 0 && field221 && !field247) {
				field471 = field316;
				field472 = true;
				field526.method540(2, field471);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method161(int arg0) {
		WJQTPVDG.method581(arg0);
	}

	@ObfuscatedName("client.a(IZB)V")
	public final void method162(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method163() {
		if (field265 == 0 && field296 == 0) {
			field99[field345] = "Walk here";
			field235[field345] = 158;
			field233[field345] = field945;
			field234[field345] = field946;
			field345++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < GCSAWSJV.field653; var2++) {
			int var3 = GCSAWSJV.field654[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field511.method478(field440, var4, var5, var3) >= 0) {
					YJMLCFGC var8 = YJMLCFGC.method596(var7);
					if (var8.field1478 != null) {
						var8 = var8.method594();
					}

					if (var8 == null) {
						continue;
					}

					if (field265 == 1) {
						field99[field345] = "Use " + field269 + " with @cya@" + var8.field1476;
						field235[field345] = 791;
						field236[field345] = var3;
						field233[field345] = var4;
						field234[field345] = var5;
						field345++;
					} else if (field296 != 1) {
						if (var8.field1480 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1480[var9] != null) {
									field99[field345] = var8.field1480[var9] + " @cya@" + var8.field1476;

									if (var9 == 0) {
										field235[field345] = 787;
									}

									if (var9 == 1) {
										field235[field345] = 350;
									}

									if (var9 == 2) {
										field235[field345] = 814;
									}

									if (var9 == 3) {
										field235[field345] = 758;
									}

									if (var9 == 4) {
										field235[field345] = 1237;
									}

									field236[field345] = var3;
									field233[field345] = var4;
									field234[field345] = var5;
									field345++;
								}
							}
						}

						field99[field345] = "Examine @cya@" + var8.field1476;
						field235[field345] = 1642;
						field236[field345] = var8.field1491 << 14;
						field233[field345] = var4;
						field234[field345] = var5;
						field345++;
					} else if ((field298 & 0x4) == 4) {
						field99[field345] = field299 + " @cya@" + var8.field1476;
						field235[field345] = 387;
						field236[field345] = var3;
						field233[field345] = var4;
						field234[field345] = var5;
						field345++;
					}
				}

				if (var6 == 1) {
					IGOBKPZP var10 = field127[var7];
					if (var10.field758.field1254 == 1 && (var10.field1110 & 0x7F) == 0x40 && (var10.field1111 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field128; var11++) {
							IGOBKPZP var12 = field127[field129[var11]];
							if (var12 != null && var10 != var12 && var12.field758.field1254 == 1 && var10.field1110 == var12.field1110 && var10.field1111 == var12.field1111) {
								method144(var5, var4, var12.field758, field129[var11]);
							}
						}

						for (int var13 = 0; var13 < field196; var13++) {
							MDBQGDOL var14 = field195[field197[var13]];
							if (var14 != null && var10.field1110 == var14.field1110 && var10.field1111 == var14.field1111) {
								method53(var5, var14, field197[var13], var4);
							}
						}
					}

					method144(var5, var4, var10.field758, var7);
				}

				if (var6 == 0) {
					MDBQGDOL var15 = field195[var7];
					if ((var15.field1110 & 0x7F) == 0x40 && (var15.field1111 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field128; var16++) {
							IGOBKPZP var17 = field127[field129[var16]];
							if (var17 != null && var17.field758.field1254 == 1 && var15.field1110 == var17.field1110 && var15.field1111 == var17.field1111) {
								method144(var5, var4, var17.field758, field129[var16]);
							}
						}

						for (int var18 = 0; var18 < field196; var18++) {
							MDBQGDOL var19 = field195[field197[var18]];
							if (var19 != null && var15 != var19 && var15.field1110 == var19.field1110 && var15.field1111 == var19.field1111) {
								method53(var5, var19, field197[var18], var4);
							}
						}
					}

					method53(var5, var15, var7, var4);
				}

				if (var6 == 3) {
					WCVCMGLX var20 = field537[field440][var4][var5];
					if (var20 != null) {
						for (QXUWKDGL var21 = (QXUWKDGL) var20.method568(); var21 != null; var21 = (QXUWKDGL) var20.method570()) {
							KIHBVNFV var22 = KIHBVNFV.method346(var21.field1038);
							if (field265 == 1) {
								field99[field345] = "Use " + field269 + " with @lre@" + var22.field858;
								field235[field345] = 825;
								field236[field345] = var21.field1038;
								field233[field345] = var4;
								field234[field345] = var5;
								field345++;
							} else if (field296 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field860 != null && var22.field860[var23] != null) {
										field99[field345] = var22.field860[var23] + " @lre@" + var22.field858;

										if (var23 == 0) {
											field235[field345] = 233;
										}

										if (var23 == 1) {
											field235[field345] = 174;
										}

										if (var23 == 2) {
											field235[field345] = 375;
										}

										if (var23 == 3) {
											field235[field345] = 679;
										}

										if (var23 == 4) {
											field235[field345] = 138;
										}

										field236[field345] = var21.field1038;
										field233[field345] = var4;
										field234[field345] = var5;
										field345++;
									} else if (var23 == 2) {
										field99[field345] = "Take @lre@" + var22.field858;
										field235[field345] = 375;
										field236[field345] = var21.field1038;
										field233[field345] = var4;
										field234[field345] = var5;
										field345++;
									}
								}

								field99[field345] = "Examine @lre@" + var22.field858;
								field235[field345] = 1186;
								field236[field345] = var21.field1038;
								field233[field345] = var4;
								field234[field345] = var5;
								field345++;
							} else if ((field298 & 0x1) == 1) {
								field99[field345] = field299 + " @lre@" + var22.field858;
								field235[field345] = 555;
								field236[field345] = var21.field1038;
								field233[field345] = var4;
								field234[field345] = var5;
								field345++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public static final void method164() {
		TCDQXHKB.field1132 = true;
		NQTCRWWR.field959 = true;
		field247 = true;
		IPCPGCKM.field769 = true;
		YJMLCFGC.field1455 = true;
	}

	@ObfuscatedName("client.u(B)V")
	public final void method165() {
		if (field496 == 0) {
			field99[0] = "Cancel";
			field235[0] = 1117;
			field345 = 1;
			if (field528 == -1) {
				method154();
				field321 = 0;
				field397 = 0;

				if (field945 > 4 && field946 > 4 && field945 < 516 && field946 < 338) {
					if (field399 == -1) {
						method163();
					} else {
						method127(field945, 4, 4, 0, WJQTPVDG.method577(field399), field946, 0);
					}
				}

				if (field476 != field321) {
					field476 = field321;
				}

				if (field397 != field188) {
					field188 = field397;
				}

				field321 = 0;
				field397 = 0;

				if (field945 > 553 && field946 > 205 && field945 < 743 && field946 < 466) {
					if (field508 != -1) {
						method127(field945, 553, 205, 0, WJQTPVDG.method577(field508), field946, 1);
					} else if (field254[field396] != -1) {
						method127(field945, 553, 205, 0, WJQTPVDG.method577(field254[field396]), field946, 1);
					}
				}

				if (field364 != field321) {
					field405 = true;
					field364 = field321;
				}

				if (field397 != field117) {
					field405 = true;
					field117 = field397;
				}

				field321 = 0;
				field397 = 0;

				if (field945 > 17 && field946 > 357 && field945 < 496 && field946 < 453) {
					if (field538 != -1) {
						method127(field945, 17, 357, 0, WJQTPVDG.method577(field538), field946, 2);
					} else if (field319 != -1) {
						method127(field945, 17, 357, 0, WJQTPVDG.method577(field319), field946, 3);
					} else if (field946 < 434 && field945 < 426 && field273 == 0) {
						method52(field945 - 17, field946 - 357);
					}
				}

				if ((field538 != -1 || field319 != -1) && field321 != field212) {
					field473 = true;
					field212 = field321;
				}

				if ((field538 != -1 || field319 != -1) && field397 != field150) {
					field473 = true;
					field150 = field397;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field345 - 1; var2++) {
						if (field235[var2] < 1000 && field235[var2 + 1] > 1000) {
							String var3 = field99[var2];
							field99[var2] = field99[var2 + 1];
							field99[var2 + 1] = var3;
							int var4 = field235[var2];
							field235[var2] = field235[var2 + 1];
							field235[var2 + 1] = var4;
							int var5 = field233[var2];
							field233[var2] = field233[var2 + 1];
							field233[var2 + 1] = var5;
							int var6 = field234[var2];
							field234[var2] = field234[var2 + 1];
							field234[var2 + 1] = var6;
							int var7 = field236[var2];
							field236[var2] = field236[var2 + 1];
							field236[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field321 = 0;
				field397 = 0;
				method127(field945, 0, 0, 0, WJQTPVDG.method577(field528), field946, 0);

				if (field476 != field321) {
					field476 = field321;
				}

				if (field397 != field188) {
					field188 = field397;
				}
			}
		}
	}

	@ObfuscatedName("client.v(B)I")
	public final int method166() {
		int var1 = 3;
		if (field158 < 310) {
			field437++;
			if (field437 > 154) {
				field437 = 0;
				field288.method183(48);
				field288.method185(14668);
			}

			int var2 = field155 >> 7;
			int var3 = field157 >> 7;
			int var4 = field335.field1110 >> 7;
			int var5 = field335.field1111 >> 7;

			if ((field165[field440][var2][var3] & 0x4) != 0) {
				var1 = field440;
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

					if ((field165[field440][var2][var3] & 0x4) != 0) {
						var1 = field440;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field165[field440][var2][var3] & 0x4) != 0) {
							var1 = field440;
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

					if ((field165[field440][var2][var3] & 0x4) != 0) {
						var1 = field440;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field165[field440][var2][var3] & 0x4) != 0) {
							var1 = field440;
						}
					}
				}
			}
		}

		if ((field165[field440][field335.field1110 >> 7][field335.field1111 >> 7] & 0x4) != 0) {
			var1 = field440;
		}

		return var1;
	}

	@ObfuscatedName("client.E(I)I")
	public final int method167() {
		int var1 = method60(field157, field440, field155);
		if (var1 - field156 < 800 && (field165[field440][field155 >> 7][field157 >> 7] & 0x4) != 0) {
			return field440;
		}

		return 3;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method168() {
		field368 = null;
		field369 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field358 = null;
		field359 = null;
		field360 = null;
		field361 = null;
		field459 = null;
		field460 = null;
		field461 = null;
		field462 = null;
		field255 = null;
		field256 = null;
		field257 = null;
		field258 = null;
		field431 = null;
		field165 = null;
		field511 = null;
		field281 = null;
		field209 = null;
		field210 = null;
		field211 = null;
		field272 = null;
		field537 = null;
		field384 = null;
		field529 = null;
		field530 = null;
		field531 = null;
		field532 = null;
		field533 = null;
		field499 = null;
		field192 = null;
		field102 = null;
		field340 = null;
		field487 = null;
		field456 = null;
		field457 = null;
		field356 = null;
		field357 = null;
		field353 = null;
		field354 = null;
		field355 = null;

		if (field526 != null) {
			field526.method531();
		}

		field526 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field262 = null;
		field263 = null;

		if (field385 != null) {
			field385.field1445 = false;
		}

		field385 = null;
		field229 = null;
		field288 = null;
		field181 = null;
		field251 = null;
		method159();
		field126 = null;
		field233 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field99 = null;
		field195 = null;
		field197 = null;
		field199 = null;
		field200 = null;
		field232 = null;
		field438 = null;
		field109 = null;
		field119 = null;
		field454 = null;
		field160 = null;
		field480 = null;
		field127 = null;
		field129 = null;
		field166 = null;
		field167 = null;
		field168 = null;
		field170 = null;
		field374 = null;
		field376 = null;
		field241 = null;
		field242 = null;
		field347 = null;
		field213 = null;
		field432 = null;

		try {
			if (field300 != null) {
				field300.method546();
			}
		} catch (Exception var1) {
		}

		field300 = null;
		field187 = null;
		field226 = null;
		field447 = null;
		field125 = null;
		field276 = null;
		field448 = null;
		field449 = null;
		field133 = null;
		field308 = null;
		field309 = null;
		field310 = null;
		field175 = null;
		field176 = null;
		field177 = null;
		field178 = null;
		field179 = null;
		method152();
		YJMLCFGC.method591();
		TQRZOVPP.method516();
		KIHBVNFV.method354();
		WJQTPVDG.method574();
		GOLZJDMQ.field722 = null;
		CFPLMOQH.field91 = null;
		KTOJOSJK.field886 = null;
		XRDQTWLL.field1418 = null;
		JEPDVFCL.field793 = null;
		JEPDVFCL.field805 = null;
		ATZMJNZU.field16 = null;
		field938 = null;
		MDBQGDOL.field911 = null;
		NQTCRWWR.method402();
		TCDQXHKB.method447();
		GCSAWSJV.method256();
		RLONYBCF.method434();
		System.gc();
	}

	@ObfuscatedName("client.F(I)V")
	public final void method169() {
		while (true) {
			int var1 = method401();
			if (var1 == -1) {
				return;
			}

			if (field399 != -1 && field399 == field317) {
				if (var1 == 8 && field375.length() > 0) {
					field375 = field375.substring(0, field375.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field375.length() < 12) {
					field375 = field375 + (char) var1;
				}
			} else if (field383) {
				if (var1 >= 32 && var1 <= 122 && field289.length() < 80) {
					field289 = field289 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field289.length() > 0) {
					field289 = field289.substring(0, field289.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field383 = false;
					field473 = true;

					if (field290 == 1) {
						long var2 = ZLGGMMMS.method597(field289);
						method126(var2);
					}

					if (field290 == 2 && field509 > 0) {
						long var4 = ZLGGMMMS.method597(field289);
						method140(var4);
					}

					if (field290 == 3 && field289.length() > 0) {
						field288.method183(7);
						field288.method184(0);
						int var6 = field288.field540;
						field288.method190(field377);
						SQKAIUXX.method445(field288, field289);
						field288.method193(field288.field540 - var6);
						field289 = SQKAIUXX.method446(field289);
						field289 = MOLFGQQL.method369(field289);
						method114(ZLGGMMMS.method601(ZLGGMMMS.method598(field377)), field289, 6);

						if (field479 == 2) {
							field479 = 1;
							field277 = true;
							field288.method183(205);
							field288.method184(field243);
							field288.method184(field479);
							field288.method184(field174);
						}
					}

					if (field290 == 4 && field525 < 100) {
						long var7 = ZLGGMMMS.method597(field289);
						method59(var7);
					}

					if (field290 == 5 && field525 > 0) {
						long var9 = ZLGGMMMS.method597(field289);
						method87(var9);
					}
				}
			} else if (field273 == 1) {
				if (var1 >= 48 && var1 <= 57 && field301.length() < 10) {
					field301 = field301 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field301.length() > 0) {
					field301 = field301.substring(0, field301.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field301.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field301);
						} catch (Exception var21) {
						}

						field288.method183(114);
						field288.method188(var11);
					}

					field273 = 0;
					field473 = true;
				}
			} else if (field273 == 2) {
				if (var1 >= 32 && var1 <= 122 && field301.length() < 12) {
					field301 = field301 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field301.length() > 0) {
					field301 = field301.substring(0, field301.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field301.length() > 0) {
						field288.method183(97);
						field288.method190(ZLGGMMMS.method597(field301));
					}

					field273 = 0;
					field473 = true;
				}
			} else if (field273 == 3) {
				if (var1 >= 32 && var1 <= 122 && field301.length() < 40) {
					field301 = field301 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field301.length() > 0) {
					field301 = field301.substring(0, field301.length() - 1);
					field473 = true;
				}
			} else if (field538 == -1 && field528 == -1) {
				if (var1 >= 32 && var1 <= 122 && field393.length() < 80) {
					field393 = field393 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field393.length() > 0) {
					field393 = field393.substring(0, field393.length() - 1);
					field473 = true;
				}

				if ((var1 == 13 || var1 == 10) && field393.length() > 0) {
					if (field519 == 2) {
						if (field393.equals("::clientdrop")) {
							method142();
						}

						if (field393.equals("::lag")) {
							method116();
						}

						if (field393.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field526.method542(2); var12++) {
								field526.method527((byte) 1, var12, 2);
							}
						}

						if (field393.equals("::fpson")) {
							field131 = true;
						}

						if (field393.equals("::fpsoff")) {
							field131 = false;
						}

						if (field393.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field281[var13].field1323[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field393.startsWith("::")) {
						field288.method183(28);
						field288.method184(field393.length() - 1);
						field288.method191(field393.substring(2));
					} else {
						String var16 = field393.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field393 = field393.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field393 = field393.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field393 = field393.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field393 = field393.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field393 = field393.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field393 = field393.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field393 = field393.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field393 = field393.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field393 = field393.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field393 = field393.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field393 = field393.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field393 = field393.substring(6);
						}

						String var18 = field393.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field393 = field393.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field393 = field393.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field393 = field393.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field393 = field393.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field393 = field393.substring(6);
						}

						field288.method183(219);
						field288.method184(0);
						int var20 = field288.field540;
						field288.method184(var17);
						field126.field540 = 0;
						SQKAIUXX.method445(field126, field393);
						field288.method229(field126.field540, field126.field539, 0);
						field288.method184(var19);
						field288.method193(field288.field540 - var20);
						field393 = SQKAIUXX.method446(field393);
						field393 = MOLFGQQL.method369(field393);
						field335.field1116 = field393;
						field335.field1072 = var17;
						field335.field1101 = var19;
						field335.field1077 = 150;

						if (field519 == 2) {
							method114("@cr2@" + field335.field920, field335.field1116, 2);
						} else if (field519 == 1) {
							method114("@cr1@" + field335.field920, field335.field1116, 2);
						} else {
							method114(field335.field920, field335.field1116, 2);
						}

						if (field243 == 2) {
							field243 = 3;
							field277 = true;
							field288.method183(205);
							field288.method184(field243);
							field288.method184(field479);
							field288.method184(field174);
						}
					}

					field393 = "";
					field473 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(I[BZ)Z")
	public final boolean method170(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.b(IILCMGGUSPR;)V")
	public final void method171(int arg0, CMGGUSPR arg1) {
		while (arg1.field541 + 21 < arg0 * 8) {
			int var3 = arg1.method205(14);
			if (var3 == 16383) {
				break;
			}

			if (field127[var3] == null) {
				field127[var3] = new IGOBKPZP();
			}

			IGOBKPZP var4 = field127[var3];
			field129[field128++] = var3;
			var4.field1115 = field404;
			int var5 = arg1.method205(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			var4.field758 = TQRZOVPP.method517(arg1.method205(13));
			int var6 = arg1.method205(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method205(1);
			if (var7 == 1) {
				field199[field198++] = var3;
			}

			int var8 = arg1.method205(1);
			var4.field1113 = var4.field758.field1254;
			var4.field1121 = var4.field758.field1229;
			var4.field1073 = var4.field758.field1233;
			var4.field1074 = var4.field758.field1252;
			var4.field1075 = var4.field758.field1234;
			var4.field1076 = var4.field758.field1253;
			var4.field1091 = var4.field758.field1262;
			var4.method442(var8 == 1, field335.field1097[0] + var5, field335.field1098[0] + var6);
		}

		arg1.method206();
	}

	@ObfuscatedName("client.b(BII)Ljava/lang/String;")
	public static final String method172(int arg0, int arg1) {
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

	@ObfuscatedName("client.G(I)V")
	public final void method173() {
		Graphics var1 = method117().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method400(1);

		if (field395) {
			field441 = false;
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

		if (field419) {
			field441 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field228) {
			field441 = false;
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

	@ObfuscatedName("client.a(IIIIILWJQTPVDG;IIZ)V")
	public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, WJQTPVDG arg5, int arg6, int arg7) {
		if (field501) {
			field180 = 32;
		} else {
			field180 = 0;
		}

		field501 = false;
		if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 && arg2 < arg0 + 16) {
			arg5.field1357 -= field203 * 4;

			if (arg7 == 1) {
				field405 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field473 = true;
			}
		} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg2 >= arg0 + arg1 - 16 && arg2 < arg0 + arg1) {
			arg5.field1357 += field203 * 4;

			if (arg7 == 1) {
				field405 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field473 = true;
			}
		} else if (arg3 >= arg4 - field180 && arg3 < arg4 + field180 + 16 && arg2 >= arg0 + 16 && arg2 < arg0 + arg1 - 16 && field203 > 0) {
			int var9 = (arg1 - 32) * arg1 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg0 - var9 / 2 - 16;
			int var11 = arg1 - var9 - 32;
			arg5.field1357 = (arg6 - arg1) * var10 / var11;

			if (arg7 == 1) {
				field405 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field473 = true;
			}

			field501 = true;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method175() {
		field135 = 0;
		for (int var1 = -1; var1 < field196 + field128; var1++) {
			SDXDPBJK var2;
			if (var1 == -1) {
				var2 = field335;
			} else if (var1 < field196) {
				var2 = field195[field197[var1]];
			} else {
				var2 = field127[field129[var1 - field196]];
			}

			if (var2 != null && var2.method302()) {
				if (var2 instanceof IGOBKPZP) {
					TQRZOVPP var3 = ((IGOBKPZP) var2).field758;
					if (var3.field1231 != null) {
						var3 = var3.method515();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field196) {
					TQRZOVPP var6 = ((IGOBKPZP) var2).field758;
					if (var6.field1236 >= 0 && var6.field1236 < field454.length) {
						method130(var2, var2.field1117 + 15);

						if (field100 > -1) {
							field454[var6.field1236].method507(field100 - 12, field101 - 30);
						}
					}

					if (field118 == 1 && field129[var1 - field196] == field222 && field404 % 20 < 10) {
						method130(var2, var2.field1117 + 15);

						if (field100 > -1) {
							field160[0].method507(field100 - 12, field101 - 28);
						}
					}
				} else {
					int var4 = 30;
					MDBQGDOL var5 = (MDBQGDOL) var2;
					if (var5.field917 != -1 || var5.field918 != -1) {
						method130(var2, var2.field1117 + 15);

						if (field100 > -1) {
							if (var5.field917 != -1) {
								field119[var5.field917].method507(field100 - 12, field101 - var4);
								var4 += 25;
							}

							if (var5.field918 != -1) {
								field454[var5.field918].method507(field100 - 12, field101 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field118 == 10 && field197[var1] == field120) {
						method130(var2, var2.field1117 + 15);

						if (field100 > -1) {
							field160[1].method507(field100 - 12, field101 - var4);
						}
					}
				}

				if (var2.field1116 != null && (var1 >= field196 || field243 == 0 || field243 == 3 || field243 == 1 && method118(((MDBQGDOL) var2).field920))) {
					method130(var2, var2.field1117);

					if (field100 > -1 && field135 < field136) {
						field140[field135] = field185.method235(var2.field1116) / 2;
						field139[field135] = field185.field558;
						field137[field135] = field100;
						field138[field135] = field101;
						field141[field135] = var2.field1072;
						field142[field135] = var2.field1101;
						field143[field135] = var2.field1077;
						field144[field135++] = var2.field1116;

						if (field394 == 0 && var2.field1101 >= 1 && var2.field1101 <= 3) {
							field139[field135] += 10;
							field138[field135] += 5;
						}

						if (field394 == 0 && var2.field1101 == 4) {
							field140[field135] = 60;
						}

						if (field394 == 0 && var2.field1101 == 5) {
							field139[field135] += 5;
						}
					}
				}

				if (var2.field1118 > field404) {
					method130(var2, var2.field1117 + 15);

					if (field100 > -1) {
						int var7 = var2.field1119 * 30 / var2.field1120;
						if (var7 > 30) {
							var7 = 30;
						}

						BAXODNVH.method22(var7, field100 - 15, 5, 0xFF00, field101 - 3);
						BAXODNVH.method22(30 - var7, field100 - 15 + var7, 5, 0xFF0000, field101 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1095[var8] > field404) {
						method130(var2, var2.field1117 / 2);

						if (field100 > -1) {
							if (var8 == 1) {
								field101 -= 20;
							}

							if (var8 == 2) {
								field100 -= 15;
								field101 -= 10;
							}

							if (var8 == 3) {
								field100 += 15;
								field101 -= 10;
							}

							field109[var2.field1094[var8]].method507(field100 - 12, field101 - 12);
							field183.method232(0, field100, field101 + 4, String.valueOf(var2.field1093[var8]));
							field183.method232(0xFFFFFF, field100 - 1, field101 + 3, String.valueOf(var2.field1093[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field135; var9++) {
			int var10 = field137[var9];
			int var11 = field138[var9];
			int var12 = field140[var9];
			int var13 = field139[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field138[var15] - field139[var15] && var11 - var13 < field138[var15] + 2 && var10 - var12 < field140[var15] + field137[var15] && var10 + var12 > field137[var15] - field140[var15] && field138[var15] - field139[var15] < var11) {
						var11 = field138[var15] - field139[var15];
						var14 = true;
					}
				}
			}

			field100 = field137[var9];
			field101 = field138[var9] = var11;
			String var16 = field144[var9];
			if (field394 == 0) {
				int var17 = 0xFFFF00;
				if (field141[var9] < 6) {
					var17 = field190[field141[var9]];
				}

				if (field141[var9] == 6) {
					var17 = field122 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field141[var9] == 7) {
					var17 = field122 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field141[var9] == 8) {
					var17 = field122 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field141[var9] == 9) {
					int var18 = 150 - field143[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field141[var9] == 10) {
					int var19 = 150 - field143[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field141[var9] == 11) {
					int var20 = 150 - field143[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field142[var9] == 0) {
					field185.method232(0, field100, field101 + 1, var16);
					field185.method232(var17, field100, field101, var16);
				}

				if (field142[var9] == 1) {
					field185.method237(field100, field122, 0, var16, field101 + 1);
					field185.method237(field100, field122, var17, var16, field101);
				}

				if (field142[var9] == 2) {
					field185.method238(field122, field100, 0, field101 + 1, var16);
					field185.method238(field122, field100, var17, field101, var16);
				}

				if (field142[var9] == 3) {
					field185.method239(0, field100, field101 + 1, field122, 150 - field143[var9], var16);
					field185.method239(var17, field100, field101, field122, 150 - field143[var9], var16);
				}

				if (field142[var9] == 4) {
					int var21 = field185.method235(var16);
					int var22 = (150 - field143[var9]) * (var21 + 100) / 150;
					BAXODNVH.method19(0, 334, field100 + 50, field100 - 50);
					field185.method236(field100 + 50 - var22, 0, var16, field101 + 1);
					field185.method236(field100 + 50 - var22, var17, var16, field101);
					BAXODNVH.method18();
				}

				if (field142[var9] == 5) {
					int var23 = 150 - field143[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					BAXODNVH.method19(field101 - field185.field558 - 1, field101 + 5, 512, 0);
					field185.method232(0, field100, field101 + var24 + 1, var16);
					field185.method232(var17, field100, field101 + var24, var16);
					BAXODNVH.method18();
				}
			} else {
				field185.method232(0, field100, field101 + 1, var16);
				field185.method232(0xFFFF00, field100, field101, var16);
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method176() {
		method149("Starting up", 20);

		if (signlink.sunjava) {
			field931 = 5;
		}

		if (field171) {
			field228 = true;
		} else {
			field171 = true;
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
						field522[var3] = new JJRYTWDH(signlink.cache_idx[var3], 500000, signlink.cache_dat, var3 + 1);
					}
				}

				try {
					method123();
					field191 = method132(1, 25, field103[1], "title screen", "title");
					field183 = new CWXRTTYV(false, "p11_full", field191);
					field184 = new CWXRTTYV(false, "p12_full", field191);
					field185 = new CWXRTTYV(false, "b12_full", field191);
					field186 = new CWXRTTYV(true, "q8_full", field191);
					method101();
					method80();
					UUIGNTAD var4 = method132(2, 30, field103[2], "config", "config");
					UUIGNTAD var5 = method132(3, 35, field103[3], "interface", "interface");
					UUIGNTAD var6 = method132(4, 40, field103[4], "2d graphics", "media");
					UUIGNTAD var7 = method132(6, 45, field103[6], "textures", "textures");
					UUIGNTAD var8 = method132(7, 50, field103[7], "chat system", "wordenc");
					UUIGNTAD var9 = method132(8, 55, field103[8], "sound effects", "sounds");
					field165 = new byte[4][104][104];
					field431 = new int[4][105][105];
					field511 = new TCDQXHKB(104, field431, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field281[var10] = new VLOWRGUJ(104, 104);
					}

					field272 = new TPIBHECB(512, 512);
					UUIGNTAD var11 = method132(5, 60, field103[5], "update list", "versionlist");
					method149("Connecting to update server", 60);
					field526 = new UCDUMMGN();
					field526.method532(var11, this);
					RLONYBCF.method432(field526.method537());
					GCSAWSJV.method257(field526.method542(0), field526);

					if (!field247) {
						field471 = 0;
						field472 = true;
						field526.method540(2, field471);

						while (field526.method530() > 0) {
							method153();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field526.field1286 > 3) {
								method109("ondemand");
								return;
							}
						}
					}

					method149("Requesting animations", 65);
					int var12 = field526.method542(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field526.method540(1, var13);
					}

					while (field526.method530() > 0) {
						int var14 = var12 - field526.method530();
						if (var14 > 0) {
							method149("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method153();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field526.field1286 > 3) {
							method109("ondemand");
							return;
						}
					}

					method149("Requesting models", 70);
					int var15 = field526.method542(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field526.method535(var16);
						if ((var17 & 0x1) != 0) {
							field526.method540(0, var16);
						}
					}

					int var18 = field526.method530();
					while (field526.method530() > 0) {
						int var19 = var18 - field526.method530();
						if (var19 > 0) {
							method149("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method153();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field522[0] != null) {
						method149("Requesting maps", 75);
						field526.method540(3, field526.method538(47, 0, 48));
						field526.method540(3, field526.method538(47, 1, 48));
						field526.method540(3, field526.method538(48, 0, 48));
						field526.method540(3, field526.method538(48, 1, 48));
						field526.method540(3, field526.method538(49, 0, 48));
						field526.method540(3, field526.method538(49, 1, 48));
						field526.method540(3, field526.method538(47, 0, 47));
						field526.method540(3, field526.method538(47, 1, 47));
						field526.method540(3, field526.method538(48, 0, 47));
						field526.method540(3, field526.method538(48, 1, 47));
						field526.method540(3, field526.method538(48, 0, 148));
						field526.method540(3, field526.method538(48, 1, 148));
						int var20 = field526.method530();
						while (field526.method530() > 0) {
							int var21 = var20 - field526.method530();
							if (var21 > 0) {
								method149("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method153();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field526.method542(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field526.method535(var23);
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
							field526.method527(var25, var23, 0);
						}
					}

					field526.method533(field246);

					if (!field247) {
						int var26 = field526.method542(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field526.method526(var27)) {
								field526.method527((byte) 1, var27, 2);
							}
						}
					}

					method149("Unpacking media", 80);
					field166 = new OCPHNIUN(var6, "invback", 0);
					field168 = new OCPHNIUN(var6, "chatback", 0);
					field167 = new OCPHNIUN(var6, "mapback", 0);
					field308 = new OCPHNIUN(var6, "backbase1", 0);
					field309 = new OCPHNIUN(var6, "backbase2", 0);
					field310 = new OCPHNIUN(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field229[var28] = new OCPHNIUN(var6, "sideicons", var28);
					}

					field438 = new TPIBHECB(var6, "compass", 0);
					field145 = new TPIBHECB(var6, "mapedge", 0);
					field145.method504();

					for (int var29 = 0; var29 < 72; var29++) {
						field213[var29] = new OCPHNIUN(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field432[var30] = new TPIBHECB(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field109[var31] = new TPIBHECB(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field119[var32] = new TPIBHECB(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field454[var33] = new TPIBHECB(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field160[var34] = new TPIBHECB(var6, "headicons_hint", var34);
					}

					field133 = new TPIBHECB(var6, "overlay_multiway", 0);
					field248 = new TPIBHECB(var6, "mapmarker", 0);
					field249 = new TPIBHECB(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field480[var35] = new TPIBHECB(var6, "cross", var35);
					}

					field529 = new TPIBHECB(var6, "mapdots", 0);
					field530 = new TPIBHECB(var6, "mapdots", 1);
					field531 = new TPIBHECB(var6, "mapdots", 2);
					field532 = new TPIBHECB(var6, "mapdots", 3);
					field533 = new TPIBHECB(var6, "mapdots", 4);
					field216 = new OCPHNIUN(var6, "scrollbar", 0);
					field217 = new OCPHNIUN(var6, "scrollbar", 1);
					field175 = new OCPHNIUN(var6, "redstone1", 0);
					field176 = new OCPHNIUN(var6, "redstone2", 0);
					field177 = new OCPHNIUN(var6, "redstone3", 0);
					field178 = new OCPHNIUN(var6, "redstone1", 0);
					field178.method421();
					field179 = new OCPHNIUN(var6, "redstone2", 0);
					field179.method421();
					field368 = new OCPHNIUN(var6, "redstone1", 0);
					field368.method422();
					field369 = new OCPHNIUN(var6, "redstone2", 0);
					field369.method422();
					field370 = new OCPHNIUN(var6, "redstone3", 0);
					field370.method422();
					field371 = new OCPHNIUN(var6, "redstone1", 0);
					field371.method421();
					field371.method422();
					field372 = new OCPHNIUN(var6, "redstone2", 0);
					field372.method421();
					field372.method422();

					for (int var36 = 0; var36 < 2; var36++) {
						field415[var36] = new OCPHNIUN(var6, "mod_icons", var36);
					}

					TPIBHECB var37 = new TPIBHECB(var6, "backleft1", 0);
					field255 = new IUZTBIWV(method117(), var37.field1220, var37.field1221);
					var37.method505(0, 0);
					TPIBHECB var38 = new TPIBHECB(var6, "backleft2", 0);
					field256 = new IUZTBIWV(method117(), var38.field1220, var38.field1221);
					var38.method505(0, 0);
					TPIBHECB var39 = new TPIBHECB(var6, "backright1", 0);
					field257 = new IUZTBIWV(method117(), var39.field1220, var39.field1221);
					var39.method505(0, 0);
					TPIBHECB var40 = new TPIBHECB(var6, "backright2", 0);
					field258 = new IUZTBIWV(method117(), var40.field1220, var40.field1221);
					var40.method505(0, 0);
					TPIBHECB var41 = new TPIBHECB(var6, "backtop1", 0);
					field259 = new IUZTBIWV(method117(), var41.field1220, var41.field1221);
					var41.method505(0, 0);
					TPIBHECB var42 = new TPIBHECB(var6, "backvmid1", 0);
					field260 = new IUZTBIWV(method117(), var42.field1220, var42.field1221);
					var42.method505(0, 0);
					TPIBHECB var43 = new TPIBHECB(var6, "backvmid2", 0);
					field261 = new IUZTBIWV(method117(), var43.field1220, var43.field1221);
					var43.method505(0, 0);
					TPIBHECB var44 = new TPIBHECB(var6, "backvmid3", 0);
					field262 = new IUZTBIWV(method117(), var44.field1220, var44.field1221);
					var44.method505(0, 0);
					TPIBHECB var45 = new TPIBHECB(var6, "backhmid2", 0);
					field263 = new IUZTBIWV(method117(), var45.field1220, var45.field1221);
					var45.method505(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field432[var50] != null) {
							field432[var50].method503(var47 + var49, var46 + var49, var48 + var49);
						}

						if (field213[var50] != null) {
							field213[var50].method423(var47 + var49, var46 + var49, var48 + var49);
						}
					}

					method149("Unpacking textures", 83);
					NQTCRWWR.method407(var7);
					NQTCRWWR.method411(0.8D);
					NQTCRWWR.method406(20);
					method149("Unpacking config", 86);
					XRDQTWLL.method582(var4);
					YJMLCFGC.method593(var4);
					GOLZJDMQ.method295(var4);
					KIHBVNFV.method348(var4);
					TQRZOVPP.method521(var4);
					CFPLMOQH.method29(var4);
					JEPDVFCL.method330(var4);
					ATZMJNZU.method15(var4);
					RLLHHJLC.method430(var4);
					KIHBVNFV.field842 = field246;

					if (!field247) {
						method149("Unpacking sounds", 90);
						byte[] var51 = var9.method545("sounds.dat", null);
						CMGGUSPR var52 = new CMGGUSPR(var51);
						ADSZDTIC.method9(var52);
					}

					method149("Unpacking interfaces", 95);
					CWXRTTYV[] var53 = new CWXRTTYV[] { field183, field184, field185, field186 };
					WJQTPVDG.method576(var6, var5, var53);
					method149("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field167.field982[field167.field984 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field481[var54] = var55;
						field452[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field167.field982[field167.field984 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field153[var58 - 5] = var59 - 25;
						field264[var58 - 5] = var60 - var59;
					}

					NQTCRWWR.method404(765, 503);
					field429 = NQTCRWWR.field970;
					NQTCRWWR.method404(479, 96);
					field426 = NQTCRWWR.field970;
					NQTCRWWR.method404(190, 261);
					field427 = NQTCRWWR.field970;
					NQTCRWWR.method404(512, 334);
					field428 = NQTCRWWR.field970;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = NQTCRWWR.field968[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					TCDQXHKB.method484(800, 512, 500, var62, 334);
					MOLFGQQL.method359(var8);
					field385 = new YIKMTKBL(this);
					method97(field385, 10);
					FDWERTGB.field573 = this;
					YJMLCFGC.field1464 = this;
					TQRZOVPP.field1227 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field527 + " " + field439);
					field395 = true;
				}
			} else {
				field419 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ZLWJQTPVDG;)Z")
	public final boolean method177(WJQTPVDG arg0) {
		int var2 = arg0.field1345;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field99[field345] = "Remove @whi@" + arg0.field1370;
				field235[field345] = 510;
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

		field99[field345] = "Remove @whi@" + field170[var2];
		field235[field345] = 804;
		field345++;
		field99[field345] = "Message @whi@" + field170[var2];
		field235[field345] = 847;
		field345++;
		return true;
	}

	@ObfuscatedName("client.a(ILCMGGUSPR;B)V")
	public final void method178(int arg0, CMGGUSPR arg1) {
		for (int var3 = 0; var3 < field198; var3++) {
			int var4 = field199[var3];
			IGOBKPZP var5 = field127[var4];
			int var6 = arg1.method194();
			if ((var6 & 0x20) != 0) {
				int var7 = arg1.method222();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.method214();
				if (var5.field1105 == var7 && var7 != -1) {
					int var9 = XRDQTWLL.field1418[var7].field1432;
					if (var9 == 1) {
						var5.field1106 = 0;
						var5.field1107 = 0;
						var5.field1108 = var8;
						var5.field1109 = 0;
					}

					if (var9 == 2) {
						var5.field1109 = 0;
					}
				} else if (var7 == -1 || var5.field1105 == -1 || XRDQTWLL.field1418[var7].field1426 >= XRDQTWLL.field1418[var5.field1105].field1426) {
					var5.field1105 = var7;
					var5.field1106 = 0;
					var5.field1107 = 0;
					var5.field1108 = var8;
					var5.field1109 = 0;
					var5.field1126 = var5.field1114;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg1.method194();
				int var11 = arg1.method212();
				var5.method441(field404, var11, var10);
				var5.field1118 = field404 + 300;
				var5.field1119 = arg1.method194();
				var5.field1120 = arg1.method213();
			}

			if ((var6 & 0x8) != 0) {
				var5.field758 = TQRZOVPP.method517(arg1.method196());
				var5.field1113 = var5.field758.field1254;
				var5.field1121 = var5.field758.field1229;
				var5.field1073 = var5.field758.field1233;
				var5.field1074 = var5.field758.field1252;
				var5.field1075 = var5.field758.field1234;
				var5.field1076 = var5.field758.field1253;
				var5.field1091 = var5.field758.field1262;
			}

			if ((var6 & 0x4) != 0) {
				int var12 = arg1.method213();
				int var13 = arg1.method213();
				var5.method441(field404, var13, var12);
				var5.field1118 = field404 + 300;
				var5.field1119 = arg1.method214();
				var5.field1120 = arg1.method212();
			}

			if ((var6 & 0x2) != 0) {
				var5.field1078 = arg1.method196();
				int var14 = arg1.method228();
				var5.field1082 = var14 >> 16;
				var5.field1081 = (var14 & 0xFFFF) + field404;
				var5.field1079 = 0;
				var5.field1080 = 0;

				if (var5.field1081 > field404) {
					var5.field1079 = -1;
				}

				if (var5.field1078 == 0xFFFF) {
					var5.field1078 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field1116 = arg1.method201();
				var5.field1077 = 100;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1122 = arg1.method222();
				var5.field1123 = arg1.method221();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1100 = arg1.method223();
				if (var5.field1100 == 0xFFFF) {
					var5.field1100 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.w(B)V")
	public static final void method179() {
		TCDQXHKB.field1132 = false;
		NQTCRWWR.field959 = false;
		field247 = false;
		IPCPGCKM.field769 = false;
		YJMLCFGC.field1455 = false;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method180() {
		if (field425 > 1) {
			field425--;
		}

		if (field518 > 0) {
			field518--;
		}

		for (int var1 = 0; var1 < 5 && method78(); var1++) {
		}

		if (field107) {
			synchronized (field385.field1443) {
				if (!field352) {
					field385.field1448 = 0;
				} else if (field951 != 0 || field385.field1448 >= 40) {
					field288.method183(164);
					field288.method184(0);
					int var3 = field288.field540;
					int var4 = 0;
					for (int var5 = 0; var5 < field385.field1448 && var3 - field288.field540 < 240; var5++) {
						var4++;
						int var6 = field385.field1444[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field385.field1447[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field385.field1444[var5] == -1 && field385.field1447[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field362 != var7 || field363 != var6) {
							int var9 = var7 - field362;
							field362 = var7;
							int var10 = var6 - field363;
							field363 = var6;

							if (field500 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field288.method185((field500 << 12) + (var9 << 6) + var10);
								field500 = 0;
							} else if (field500 < 8) {
								field288.method187((field500 << 19) + var8 + 0x800000);
								field500 = 0;
							} else {
								field288.method188((field500 << 19) + var8 - 0x40000000);
								field500 = 0;
							}
						} else if (field500 < 2047) {
							field500++;
						}
					}

					field288.method193(field288.field540 - var3);

					if (var4 >= field385.field1448) {
						field385.field1448 = 0;
					} else {
						field385.field1448 -= var4;
						for (int var11 = 0; var11 < field385.field1448; var11++) {
							field385.field1447[var11] = field385.field1447[var4 + var11];
							field385.field1444[var11] = field385.field1444[var4 + var11];
						}
					}
				}
			}

			if (field951 != 0) {
				long var12 = (field954 - field398) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field398 = field954;
				int var14 = field953;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field952;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field951 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field288.method183(183);
				field288.method226((var17 << 19) + (var18 << 20) + var16);
			}

			if (field435 > 0) {
				field435--;
			}

			if (field955[1] == 1 || field955[2] == 1 || field955[3] == 1 || field955[4] == 1) {
				field436 = true;
			}

			if (field436 && field435 <= 0) {
				field435 = 20;
				field436 = false;
				field288.method183(193);
				field288.method219(field341);
				field288.method218(field342);
			}

			if (field942 && !field332) {
				field332 = true;
				field288.method183(133);
				field288.method184(1);
			}

			if (!field942 && field332) {
				field332 = false;
				field288.method183(133);
				field288.method184(0);
			}

			method40();
			method47();
			method160();
			field516++;
			if (field516 > 750) {
				method142();
			}

			method138();
			method68();
			method158();
			field220++;

			if (field492 != 0) {
				field491 += 20;
				if (field491 >= 400) {
					field492 = 0;
				}
			}

			if (field485 != 0) {
				field482++;
				if (field482 >= 15) {
					if (field485 == 2) {
						field405 = true;
					}

					if (field485 == 3) {
						field473 = true;
					}

					field485 = 0;
				}
			}

			if (field496 != 0) {
				field201++;

				if (field945 > field497 + 5 || field945 < field497 - 5 || field946 > field498 + 5 || field946 < field498 - 5) {
					field458 = true;
				}

				if (field944 == 0) {
					if (field496 == 2) {
						field405 = true;
					}

					if (field496 == 3) {
						field473 = true;
					}

					field496 = 0;

					if (field458 && field201 >= 5) {
						field338 = -1;
						method165();

						if (field494 == field338 && field495 != field337) {
							WJQTPVDG var19 = WJQTPVDG.method577(field494);
							byte var20 = 0;
							if (field470 == 1 && var19.field1345 == 206) {
								var20 = 1;
							}

							if (var19.field1373[field337] <= 0) {
								var20 = 0;
							}

							if (var19.field1347) {
								int var21 = field495;
								int var22 = field337;
								var19.field1373[var22] = var19.field1373[var21];
								var19.field1379[var22] = var19.field1379[var21];
								var19.field1373[var21] = -1;
								var19.field1379[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field495;
								int var24 = field337;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method573(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method573(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method573(field337, field495);
							}

							field288.method183(135);
							field288.method219(field495);
							field288.method220(field337);
							field288.method185(field494);
							field288.method210(var20);
						}
					} else if ((field284 == 1 || method136(field345 - 1)) && field345 > 2) {
						method85();
					} else if (field345 > 0) {
						method102(field345 - 1);
					}

					field482 = 10;
					field951 = 0;
				}
			}

			if (TCDQXHKB.field1166 != -1) {
				int var25 = TCDQXHKB.field1166;
				int var26 = TCDQXHKB.field1167;
				boolean var27 = method92(field335.field1098[0], var25, 0, 0, 0, var26, 0, 0, field335.field1097[0], 0, true);
				TCDQXHKB.field1166 = -1;

				if (var27) {
					field489 = field952;
					field490 = field953;
					field492 = 1;
					field491 = 0;
				}
			}

			if (field951 == 1 && field114 != null) {
				field114 = null;
				field473 = true;
				field951 = 0;
			}

			method139();

			if (field528 == -1) {
				method94();
				method129();
				method137();
			}

			if (field944 == 1 || field951 == 1) {
				field203++;
			}

			if (field150 == 0 && field117 == 0 && field188 == 0) {
				if (field416 > 0) {
					field416--;
				}
			} else if (field416 < 100) {
				field416++;
				if (field416 == 100) {
					if (field150 != 0) {
						field473 = true;
					}

					if (field117 != 0) {
						field405 = true;
					}
				}
			}

			if (field285 == 2) {
				method84();
			}

			if (field285 == 2 && field237) {
				method110();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field420[var28]++;
			}

			method169();
			field943++;
			if (field943 > 4500) {
				field518 = 250;
				field943 -= 500;
				field288.method183(47);
			}

			field418++;
			if (field418 > 500) {
				field418 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field224 += field225;
				}

				if ((var29 & 0x2) == 2) {
					field445 += field446;
				}

				if ((var29 & 0x4) == 4) {
					field147 += field148;
				}
			}

			if (field224 < -50) {
				field225 = 2;
			}

			if (field224 > 50) {
				field225 = -2;
			}

			if (field445 < -55) {
				field446 = 2;
			}

			if (field445 > 55) {
				field446 = -2;
			}

			if (field147 < -40) {
				field148 = 1;
			}

			if (field147 > 40) {
				field148 = -1;
			}

			field512++;
			if (field512 > 500) {
				field512 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field279 += field280;
				}

				if ((var30 & 0x2) == 2) {
					field400 += field401;
				}
			}

			if (field279 < -60) {
				field280 = 2;
			}

			if (field279 > 60) {
				field280 = -2;
			}

			if (field400 < -20) {
				field401 = 1;
			}

			if (field400 > 10) {
				field401 = -1;
			}

			field517++;
			if (field517 > 50) {
				field288.method183(21);
			}

			try {
				if (field300 != null && field288.field540 > 0) {
					field300.method550(0, field288.field539, field288.field540);
					field288.field540 = 0;
					field517 = 0;
				}
			} catch (IOException var32) {
				method142();
			} catch (Exception var33) {
				method56();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		HAWWMNZR var10 = null;
		for (HAWWMNZR var11 = (HAWWMNZR) field384.method567(); var11 != null; var11 = (HAWWMNZR) field384.method569()) {
			if (var11.field749 == arg5 && var11.field751 == arg4 && var11.field752 == arg1 && var11.field750 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new HAWWMNZR();
			var10.field749 = arg5;
			var10.field750 = arg2;
			var10.field751 = arg4;
			var10.field752 = arg1;
			method77(var10);
			field384.method564(var10);
		}

		var10.field746 = arg0;
		var10.field748 = arg7;
		var10.field747 = arg3;
		var10.field741 = arg8;
		var10.field742 = arg6;
	}

	public final void run() {
		if (field442) {
			method135();
		} else {
			super.run();
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field318[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field346[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
