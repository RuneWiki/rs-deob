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
public final class client extends MKNKYTZT {

	@ObfuscatedName("client.K")
	public boolean field121 = false;

	@ObfuscatedName("client.L")
	public volatile boolean field122 = false;

	@ObfuscatedName("client.M")
	public byte[] field123 = new byte[16384];

	@ObfuscatedName("client.N")
	public boolean field124 = false;

	@ObfuscatedName("client.V")
	public EFVUNBHT[] field132 = new EFVUNBHT[8];

	@ObfuscatedName("client.W")
	public int[] field133 = new int[200];

	@ObfuscatedName("client.Y")
	public boolean field135 = false;

	@ObfuscatedName("client.db")
	public long[] field139 = new long[200];

	@ObfuscatedName("client.qb")
	public int field151 = -1;

	@ObfuscatedName("client.sb")
	public String field152 = "";

	@ObfuscatedName("client.tb")
	public String field153 = "";

	@ObfuscatedName("client.xb")
	public DMMTBJKZ field156 = new DMMTBJKZ();

	@ObfuscatedName("client.zb")
	public int[] field158 = new int[500];

	@ObfuscatedName("client.Ab")
	public int[] field159 = new int[500];

	@ObfuscatedName("client.Bb")
	public int[] field160 = new int[500];

	@ObfuscatedName("client.Cb")
	public int[] field161 = new int[500];

	@ObfuscatedName("client.Eb")
	public int[] field163 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Fb")
	public int[] field164 = new int[50];

	@ObfuscatedName("client.Hb")
	public int[] field165 = new int[151];

	@ObfuscatedName("client.Kb")
	public int field168 = 2;

	@ObfuscatedName("client.Lb")
	public int field169 = 0x23201B;

	@ObfuscatedName("client.Nb")
	public int field171 = 2;

	@ObfuscatedName("client.Qb")
	public int field174 = -1;

	@ObfuscatedName("client.Yb")
	public String field182 = "";

	@ObfuscatedName("client.cc")
	public boolean field186 = false;

	@ObfuscatedName("client.hc")
	public boolean field189 = false;

	@ObfuscatedName("client.ic")
	public String[] field190 = new String[5];

	@ObfuscatedName("client.jc")
	public boolean[] field191 = new boolean[5];

	@ObfuscatedName("client.nc")
	public String[] field195 = new String[500];

	@ObfuscatedName("client.uc")
	public int[][] field202 = new int[104][104];

	@ObfuscatedName("client.vc")
	public boolean field203 = false;

	@ObfuscatedName("client.wc")
	public int field204 = -1;

	@ObfuscatedName("client.xc")
	public int[] field205 = new int[7];

	@ObfuscatedName("client.Gc")
	public int[] field213 = new int[5];

	@ObfuscatedName("client.Jc")
	public int field216 = 2048;

	@ObfuscatedName("client.Kc")
	public int field217 = 2047;

	@ObfuscatedName("client.Lc")
	public BPHJJPRI[] field218 = new BPHJJPRI[field216];

	@ObfuscatedName("client.Nc")
	public int[] field220 = new int[field216];

	@ObfuscatedName("client.Pc")
	public int[] field222 = new int[field216];

	@ObfuscatedName("client.Qc")
	public EYMNCFMK[] field223 = new EYMNCFMK[field216];

	@ObfuscatedName("client.Wc")
	public int[] field229 = new int[33];

	@ObfuscatedName("client.Xc")
	public int field230 = -1;

	@ObfuscatedName("client.Yc")
	public int field231 = 0x4D4233;

	@ObfuscatedName("client.cd")
	public EFVUNBHT[] field235 = new EFVUNBHT[1000];

	@ObfuscatedName("client.jd")
	public boolean field239 = true;

	@ObfuscatedName("client.kd")
	public int[][] field240 = new int[104][104];

	@ObfuscatedName("client.nd")
	public String field243 = "";

	@ObfuscatedName("client.od")
	public EYMNCFMK field244 = new EYMNCFMK(new byte[5000]);

	@ObfuscatedName("client.pd")
	public KLQFDPHO[] field245 = new KLQFDPHO[16384];

	@ObfuscatedName("client.rd")
	public int[] field247 = new int[16384];

	@ObfuscatedName("client.ud")
	public int[][][] field250 = new int[4][13][13];

	@ObfuscatedName("client.Fd")
	public boolean field261 = false;

	@ObfuscatedName("client.Id")
	public int field264 = 50;

	@ObfuscatedName("client.Jd")
	public int[] field265 = new int[field264];

	@ObfuscatedName("client.Kd")
	public int[] field266 = new int[field264];

	@ObfuscatedName("client.Ld")
	public int[] field267 = new int[field264];

	@ObfuscatedName("client.Md")
	public int[] field268 = new int[field264];

	@ObfuscatedName("client.Nd")
	public int[] field269 = new int[field264];

	@ObfuscatedName("client.Od")
	public int[] field270 = new int[field264];

	@ObfuscatedName("client.Pd")
	public int[] field271 = new int[field264];

	@ObfuscatedName("client.Qd")
	public String[] field272 = new String[field264];

	@ObfuscatedName("client.Xd")
	public MRCVLIXG[] field279 = new MRCVLIXG[13];

	@ObfuscatedName("client.be")
	public EYMNCFMK field283 = EYMNCFMK.method227(1);

	@ObfuscatedName("client.ce")
	public int[] field284 = new int[5];

	@ObfuscatedName("client.ue")
	public int field302 = -1;

	@ObfuscatedName("client.ye")
	public boolean field305 = false;

	@ObfuscatedName("client.ze")
	public int[] field306 = new int[33];

	@ObfuscatedName("client.Ae")
	public int[] field307 = new int[2000];

	@ObfuscatedName("client.Ce")
	public final int field309 = 100;

	@ObfuscatedName("client.De")
	public int[] field310 = new int[100];

	@ObfuscatedName("client.Ie")
	public boolean field315 = false;

	@ObfuscatedName("client.Qe")
	public int[] field322 = new int[100];

	@ObfuscatedName("client.Re")
	public String[] field323 = new String[100];

	@ObfuscatedName("client.Se")
	public String[] field324 = new String[100];

	@ObfuscatedName("client.Ze")
	public int field329 = -1;

	@ObfuscatedName("client.gf")
	public EFVUNBHT[] field335 = new EFVUNBHT[32];

	@ObfuscatedName("client.jf")
	public int field336 = 0x766654;

	@ObfuscatedName("client.mf")
	public int[] field338 = new int[151];

	@ObfuscatedName("client.pf")
	public boolean field340 = true;

	@ObfuscatedName("client.tf")
	public String field344 = "";

	@ObfuscatedName("client.uf")
	public int field345 = 3;

	@ObfuscatedName("client.vf")
	public int[][] field346 = new int[104][104];

	@ObfuscatedName("client.xf")
	public long[] field348 = new long[100];

	@ObfuscatedName("client.Af")
	public String field351 = "";

	@ObfuscatedName("client.Bf")
	public int[] field352 = new int[LQAGEADS.field904];

	@ObfuscatedName("client.Cf")
	public int[] field353 = new int[4000];

	@ObfuscatedName("client.Df")
	public int[] field354 = new int[4000];

	@ObfuscatedName("client.Ef")
	public boolean field355 = false;

	@ObfuscatedName("client.Hf")
	public boolean field358 = false;

	@ObfuscatedName("client.Mf")
	public EFVUNBHT[] field362 = new EFVUNBHT[32];

	@ObfuscatedName("client.Of")
	public EFVUNBHT[] field364 = new EFVUNBHT[20];

	@ObfuscatedName("client.Uf")
	public ENNRILHF[] field370 = new ENNRILHF[5];

	@ObfuscatedName("client.Vf")
	public boolean field371 = false;

	@ObfuscatedName("client.Wf")
	public int[] field372 = new int[5];

	@ObfuscatedName("client.cg")
	public int field378 = 78;

	@ObfuscatedName("client.lg")
	public String field385 = "";

	@ObfuscatedName("client.ng")
	public String[] field387 = new String[100];

	@ObfuscatedName("client.og")
	public int[] field388 = new int[100];

	@ObfuscatedName("client.qg")
	public boolean field390 = false;

	@ObfuscatedName("client.rg")
	public int field391 = -1;

	@ObfuscatedName("client.sg")
	public boolean field392 = true;

	@ObfuscatedName("client.tg")
	public boolean field393 = false;

	@ObfuscatedName("client.Cg")
	public int field400 = -1;

	@ObfuscatedName("client.Ig")
	public int field406 = -1;

	@ObfuscatedName("client.Jg")
	public int field407 = 128;

	@ObfuscatedName("client.Og")
	public boolean field411 = true;

	@ObfuscatedName("client.ah")
	public int field419 = 2;

	@ObfuscatedName("client.dh")
	public int field422 = -1;

	@ObfuscatedName("client.eh")
	public int field423 = -1;

	@ObfuscatedName("client.gh")
	public int[] field424 = new int[LQAGEADS.field904];

	@ObfuscatedName("client.hh")
	public int[] field425 = new int[2000];

	@ObfuscatedName("client.jh")
	public int field427 = 0x332D25;

	@ObfuscatedName("client.oh")
	public EYMNCFMK field432 = EYMNCFMK.method227(1);

	@ObfuscatedName("client.yh")
	public final int[] field441 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.zh")
	public int[] field442 = new int[50];

	@ObfuscatedName("client.Bh")
	public int[] field444 = new int[1000];

	@ObfuscatedName("client.Ch")
	public int[] field445 = new int[1000];

	@ObfuscatedName("client.Mh")
	public boolean field455 = false;

	@ObfuscatedName("client.Nh")
	public boolean field456 = false;

	@ObfuscatedName("client.Uh")
	public EYMNCFMK field462 = EYMNCFMK.method227(1);

	@ObfuscatedName("client.Vh")
	public String[] field463 = new String[200];

	@ObfuscatedName("client.Wh")
	public boolean field464 = false;

	@ObfuscatedName("client.ci")
	public int field470 = 1;

	@ObfuscatedName("client.fi")
	public int field473 = -1;

	@ObfuscatedName("client.gi")
	public int[] field474 = new int[9];

	@ObfuscatedName("client.hi")
	public DMMTBJKZ field475 = new DMMTBJKZ();

	@ObfuscatedName("client.li")
	public EFVUNBHT[] field478 = new EFVUNBHT[100];

	@ObfuscatedName("client.oi")
	public volatile boolean field480 = false;

	@ObfuscatedName("client.pi")
	public volatile boolean field481 = false;

	@ObfuscatedName("client.wi")
	public boolean field488 = false;

	@ObfuscatedName("client.xi")
	public boolean field489 = false;

	@ObfuscatedName("client.Ai")
	public int[] field491 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Gi")
	public boolean[] field497 = new boolean[5];

	@ObfuscatedName("client.Hi")
	public DMMTBJKZ field498 = new DMMTBJKZ();

	@ObfuscatedName("client.Si")
	public int field507 = 1;

	@ObfuscatedName("client.Ti")
	public EFVUNBHT[] field508 = new EFVUNBHT[32];

	@ObfuscatedName("client.Vi")
	public DMMTBJKZ[][][] field509 = new DMMTBJKZ[4][104][104];

	@ObfuscatedName("client.Wi")
	public int field510 = -1;

	@ObfuscatedName("client.cj")
	public int field514 = -1;

	@ObfuscatedName("client.fj")
	public VTUPBFSN field517 = new VTUPBFSN();

	@ObfuscatedName("client.ij")
	public int[] field519 = new int[1000];

	@ObfuscatedName("client.jj")
	public int[] field520 = new int[5];

	@ObfuscatedName("client.kj")
	public int[] field521 = new int[5];

	@ObfuscatedName("client.lj")
	public boolean field522 = false;

	@ObfuscatedName("client.mj")
	public boolean field523 = false;

	@ObfuscatedName("client.oj")
	public boolean field524 = true;

	@ObfuscatedName("client.pj")
	public boolean field525 = false;

	@ObfuscatedName("client.qj")
	public String field526 = "";

	@ObfuscatedName("client.rj")
	public String field527 = "";

	@ObfuscatedName("client.sj")
	public int[] field528 = new int[50];

	@ObfuscatedName("client.yj")
	public int field534 = -1;

	@ObfuscatedName("client.Dj")
	public int field537 = -1;

	@ObfuscatedName("client.Ej")
	public CRC32 field538 = new CRC32();

	@ObfuscatedName("client.Ij")
	public int[] field541 = new int[256];

	@ObfuscatedName("client.Qj")
	public int[] field548 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Rj")
	public ZGDLGUZR[] field549 = new ZGDLGUZR[4];

	@ObfuscatedName("client.Tj")
	public MRCVLIXG[] field550 = new MRCVLIXG[100];

	@ObfuscatedName("client.Uj")
	public int[] field551 = new int[LQAGEADS.field904];

	@ObfuscatedName("client.ek")
	public String field560 = "";

	@ObfuscatedName("client.hk")
	public MRCVLIXG[] field562 = new MRCVLIXG[2];

	@ObfuscatedName("client.U")
	public static int[] field131 = new int[32];

	@ObfuscatedName("client.cb")
	public static final int[][] field138 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Ib")
	public static BigInteger field166 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ub")
	public static int field178 = 10;

	@ObfuscatedName("client.Wb")
	public static boolean field180 = true;

	@ObfuscatedName("client.Sc")
	public static int[] field225 = new int[99];

	@ObfuscatedName("client.vg")
	public static String field394 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ii")
	public static BigInteger field499 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.dk")
	public static final int[] field559 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.I")
	public int field119;

	@ObfuscatedName("client.J")
	public int field120;

	@ObfuscatedName("client.O")
	public int field125;

	@ObfuscatedName("client.P")
	public int field126;

	@ObfuscatedName("client.Q")
	public int field127;

	@ObfuscatedName("client.R")
	public int field128;

	@ObfuscatedName("client.S")
	public int field129;

	@ObfuscatedName("client.X")
	public int field134;

	@ObfuscatedName("client.Z")
	public int field136;

	@ObfuscatedName("client.bb")
	public int field137;

	@ObfuscatedName("client.pb")
	public int field150;

	@ObfuscatedName("client.vb")
	public static int field154;

	@ObfuscatedName("client.yb")
	public int field157;

	@ObfuscatedName("client.Jb")
	public int field167;

	@ObfuscatedName("client.Mb")
	public int field170;

	@ObfuscatedName("client.Ob")
	public int field172;

	@ObfuscatedName("client.Pb")
	public int field173;

	@ObfuscatedName("client.Rb")
	public int field175;

	@ObfuscatedName("client.Sb")
	public int field176;

	@ObfuscatedName("client.Tb")
	public int field177;

	@ObfuscatedName("client.Vb")
	public static int field179;

	@ObfuscatedName("client.Zb")
	public int field183;

	@ObfuscatedName("client.ac")
	public static int field184;

	@ObfuscatedName("client.bc")
	public int field185;

	@ObfuscatedName("client.dc")
	public static int field187;

	@ObfuscatedName("client.tc")
	public int field201;

	@ObfuscatedName("client.zc")
	public int field207;

	@ObfuscatedName("client.Ac")
	public int field208;

	@ObfuscatedName("client.Bc")
	public int field209;

	@ObfuscatedName("client.Cc")
	public int field210;

	@ObfuscatedName("client.Dc")
	public int field211;

	@ObfuscatedName("client.Ec")
	public int field212;

	@ObfuscatedName("client.Hc")
	public int field214;

	@ObfuscatedName("client.Ic")
	public int field215;

	@ObfuscatedName("client.Mc")
	public int field219;

	@ObfuscatedName("client.Oc")
	public int field221;

	@ObfuscatedName("client.Rc")
	public int field224;

	@ObfuscatedName("client.Tc")
	public int field226;

	@ObfuscatedName("client.Uc")
	public int field227;

	@ObfuscatedName("client.Zc")
	public int field232;

	@ObfuscatedName("client.ad")
	public static int field233;

	@ObfuscatedName("client.dd")
	public int field236;

	@ObfuscatedName("client.id")
	public int field238;

	@ObfuscatedName("client.md")
	public int field242;

	@ObfuscatedName("client.qd")
	public int field246;

	@ObfuscatedName("client.sd")
	public int field248;

	@ObfuscatedName("client.vd")
	public static int field251;

	@ObfuscatedName("client.wd")
	public int field252;

	@ObfuscatedName("client.xd")
	public int field253;

	@ObfuscatedName("client.Cd")
	public int field258;

	@ObfuscatedName("client.Dd")
	public int field259;

	@ObfuscatedName("client.Ed")
	public int field260;

	@ObfuscatedName("client.Gd")
	public int field262;

	@ObfuscatedName("client.Hd")
	public int field263;

	@ObfuscatedName("client.Rd")
	public int field273;

	@ObfuscatedName("client.Sd")
	public int field274;

	@ObfuscatedName("client.Td")
	public int field275;

	@ObfuscatedName("client.Ud")
	public int field276;

	@ObfuscatedName("client.Vd")
	public int field277;

	@ObfuscatedName("client.Wd")
	public int field278;

	@ObfuscatedName("client.Yd")
	public int field280;

	@ObfuscatedName("client.Zd")
	public int field281;

	@ObfuscatedName("client.ae")
	public int field282;

	@ObfuscatedName("client.te")
	public static int field301;

	@ObfuscatedName("client.Je")
	public int field316;

	@ObfuscatedName("client.Ke")
	public static int field317;

	@ObfuscatedName("client.Me")
	public int field318;

	@ObfuscatedName("client.Ne")
	public int field319;

	@ObfuscatedName("client.Oe")
	public int field320;

	@ObfuscatedName("client.Pe")
	public int field321;

	@ObfuscatedName("client.Ue")
	public int field325;

	@ObfuscatedName("client.Ve")
	public int field326;

	@ObfuscatedName("client.We")
	public int field327;

	@ObfuscatedName("client.Xe")
	public static int field328;

	@ObfuscatedName("client.af")
	public int field330;

	@ObfuscatedName("client.bf")
	public int field331;

	@ObfuscatedName("client.ef")
	public static int field333;

	@ObfuscatedName("client.ff")
	public static int field334;

	@ObfuscatedName("client.kf")
	public int field337;

	@ObfuscatedName("client.of")
	public int field339;

	@ObfuscatedName("client.wf")
	public int field347;

	@ObfuscatedName("client.Ff")
	public static int field356;

	@ObfuscatedName("client.Gf")
	public int field357;

	@ObfuscatedName("client.Jf")
	public int field360;

	@ObfuscatedName("client.Kf")
	public int field361;

	@ObfuscatedName("client.Nf")
	public static int field363;

	@ObfuscatedName("client.Pf")
	public int field365;

	@ObfuscatedName("client.Qf")
	public int field366;

	@ObfuscatedName("client.Rf")
	public int field367;

	@ObfuscatedName("client.Sf")
	public int field368;

	@ObfuscatedName("client.Tf")
	public int field369;

	@ObfuscatedName("client.Zf")
	public static int field375;

	@ObfuscatedName("client.ag")
	public int field376;

	@ObfuscatedName("client.bg")
	public int field377;

	@ObfuscatedName("client.eg")
	public int field379;

	@ObfuscatedName("client.gg")
	public static int field380;

	@ObfuscatedName("client.jg")
	public int field383;

	@ObfuscatedName("client.kg")
	public int field384;

	@ObfuscatedName("client.mg")
	public int field386;

	@ObfuscatedName("client.pg")
	public int field389;

	@ObfuscatedName("client.xg")
	public int field395;

	@ObfuscatedName("client.yg")
	public int field396;

	@ObfuscatedName("client.zg")
	public int field397;

	@ObfuscatedName("client.Ag")
	public int field398;

	@ObfuscatedName("client.Bg")
	public int field399;

	@ObfuscatedName("client.Hg")
	public int field405;

	@ObfuscatedName("client.Kg")
	public int field408;

	@ObfuscatedName("client.Lg")
	public int field409;

	@ObfuscatedName("client.Mg")
	public int field410;

	@ObfuscatedName("client.Qg")
	public int field412;

	@ObfuscatedName("client.Rg")
	public int field413;

	@ObfuscatedName("client.Sg")
	public int field414;

	@ObfuscatedName("client.Tg")
	public int field415;

	@ObfuscatedName("client.Ug")
	public int field416;

	@ObfuscatedName("client.Yg")
	public int field417;

	@ObfuscatedName("client.Zg")
	public int field418;

	@ObfuscatedName("client.qh")
	public int field433;

	@ObfuscatedName("client.rh")
	public int field434;

	@ObfuscatedName("client.sh")
	public int field435;

	@ObfuscatedName("client.th")
	public int field436;

	@ObfuscatedName("client.uh")
	public int field437;

	@ObfuscatedName("client.xh")
	public int field440;

	@ObfuscatedName("client.Ah")
	public int field443;

	@ObfuscatedName("client.Dh")
	public int field446;

	@ObfuscatedName("client.Eh")
	public int field447;

	@ObfuscatedName("client.Fh")
	public int field448;

	@ObfuscatedName("client.Gh")
	public int field449;

	@ObfuscatedName("client.Hh")
	public int field450;

	@ObfuscatedName("client.Ih")
	public int field451;

	@ObfuscatedName("client.Jh")
	public int field452;

	@ObfuscatedName("client.Kh")
	public int field453;

	@ObfuscatedName("client.Lh")
	public int field454;

	@ObfuscatedName("client.Ph")
	public int field457;

	@ObfuscatedName("client.Qh")
	public int field458;

	@ObfuscatedName("client.Rh")
	public int field459;

	@ObfuscatedName("client.Sh")
	public int field460;

	@ObfuscatedName("client.Th")
	public int field461;

	@ObfuscatedName("client.Xh")
	public int field465;

	@ObfuscatedName("client.Zh")
	public int field467;

	@ObfuscatedName("client.bi")
	public int field469;

	@ObfuscatedName("client.di")
	public int field471;

	@ObfuscatedName("client.ei")
	public int field472;

	@ObfuscatedName("client.ji")
	public int field476;

	@ObfuscatedName("client.ki")
	public int field477;

	@ObfuscatedName("client.qi")
	public int field482;

	@ObfuscatedName("client.si")
	public int field484;

	@ObfuscatedName("client.ti")
	public int field485;

	@ObfuscatedName("client.vi")
	public int field487;

	@ObfuscatedName("client.yi")
	public int field490;

	@ObfuscatedName("client.Bi")
	public int field492;

	@ObfuscatedName("client.Ki")
	public int field500;

	@ObfuscatedName("client.Li")
	public int field501;

	@ObfuscatedName("client.Mi")
	public int field502;

	@ObfuscatedName("client.Ni")
	public int field503;

	@ObfuscatedName("client.Oi")
	public int field504;

	@ObfuscatedName("client.Pi")
	public int field505;

	@ObfuscatedName("client.Ri")
	public int field506;

	@ObfuscatedName("client.Xi")
	public static int field511;

	@ObfuscatedName("client.dj")
	public int field515;

	@ObfuscatedName("client.ej")
	public int field516;

	@ObfuscatedName("client.hj")
	public int field518;

	@ObfuscatedName("client.tj")
	public int field529;

	@ObfuscatedName("client.uj")
	public static int field530;

	@ObfuscatedName("client.vj")
	public static int field531;

	@ObfuscatedName("client.Aj")
	public int field535;

	@ObfuscatedName("client.Cj")
	public static int field536;

	@ObfuscatedName("client.Pj")
	public int field547;

	@ObfuscatedName("client.Zj")
	public int field555;

	@ObfuscatedName("client.ak")
	public int field556;

	@ObfuscatedName("client.bk")
	public int field557;

	@ObfuscatedName("client.gk")
	public int field561;

	@ObfuscatedName("client.fc")
	public long field188;

	@ObfuscatedName("client.Vc")
	public long field228;

	@ObfuscatedName("client.df")
	public long field332;

	@ObfuscatedName("client.ih")
	public long field426;

	@ObfuscatedName("client.mi")
	public long field479;

	@ObfuscatedName("client.yc")
	public static BPHJJPRI field206;

	@ObfuscatedName("client.oc")
	public EFVUNBHT field196;

	@ObfuscatedName("client.pc")
	public EFVUNBHT field197;

	@ObfuscatedName("client.qc")
	public EFVUNBHT field198;

	@ObfuscatedName("client.rc")
	public EFVUNBHT field199;

	@ObfuscatedName("client.sc")
	public EFVUNBHT field200;

	@ObfuscatedName("client.fd")
	public EFVUNBHT field237;

	@ObfuscatedName("client.xe")
	public EFVUNBHT field304;

	@ObfuscatedName("client.kh")
	public EFVUNBHT field428;

	@ObfuscatedName("client.vh")
	public EFVUNBHT field438;

	@ObfuscatedName("client.wh")
	public EFVUNBHT field439;

	@ObfuscatedName("client.ui")
	public EFVUNBHT field486;

	@ObfuscatedName("client.Yi")
	public EFVUNBHT field512;

	@ObfuscatedName("client.Zi")
	public EFVUNBHT field513;

	@ObfuscatedName("client.Gj")
	public EFVUNBHT field539;

	@ObfuscatedName("client.Hj")
	public EFVUNBHT field540;

	@ObfuscatedName("client.td")
	public FKUDHMAZ field249;

	@ObfuscatedName("client.Dg")
	public FTIYCDAU field401;

	@ObfuscatedName("client.Eg")
	public FTIYCDAU field402;

	@ObfuscatedName("client.Fg")
	public FTIYCDAU field403;

	@ObfuscatedName("client.Gg")
	public FTIYCDAU field404;

	@ObfuscatedName("client.ie")
	public HBJEXSJX field290;

	@ObfuscatedName("client.kc")
	public MRCVLIXG field192;

	@ObfuscatedName("client.lc")
	public MRCVLIXG field193;

	@ObfuscatedName("client.mc")
	public MRCVLIXG field194;

	@ObfuscatedName("client.de")
	public MRCVLIXG field285;

	@ObfuscatedName("client.ee")
	public MRCVLIXG field286;

	@ObfuscatedName("client.fe")
	public MRCVLIXG field287;

	@ObfuscatedName("client.ge")
	public MRCVLIXG field288;

	@ObfuscatedName("client.he")
	public MRCVLIXG field289;

	@ObfuscatedName("client.Xf")
	public MRCVLIXG field373;

	@ObfuscatedName("client.Yf")
	public MRCVLIXG field374;

	@ObfuscatedName("client.hg")
	public MRCVLIXG field381;

	@ObfuscatedName("client.ig")
	public MRCVLIXG field382;

	@ObfuscatedName("client.lh")
	public MRCVLIXG field429;

	@ObfuscatedName("client.mh")
	public MRCVLIXG field430;

	@ObfuscatedName("client.nh")
	public MRCVLIXG field431;

	@ObfuscatedName("client.Kj")
	public MRCVLIXG field542;

	@ObfuscatedName("client.Lj")
	public MRCVLIXG field543;

	@ObfuscatedName("client.Mj")
	public MRCVLIXG field544;

	@ObfuscatedName("client.Nj")
	public MRCVLIXG field545;

	@ObfuscatedName("client.Oj")
	public MRCVLIXG field546;

	@ObfuscatedName("client.ve")
	public OUOWXDXZ field303;

	@ObfuscatedName("client.ai")
	public SAMFSOGS field468;

	@ObfuscatedName("client.ob")
	public TXNIKMNQ field149;

	@ObfuscatedName("client.Be")
	public XQFIPMSR field308;

	@ObfuscatedName("client.fb")
	public YZGYDKDO field140;

	@ObfuscatedName("client.gb")
	public YZGYDKDO field141;

	@ObfuscatedName("client.hb")
	public YZGYDKDO field142;

	@ObfuscatedName("client.ib")
	public YZGYDKDO field143;

	@ObfuscatedName("client.jb")
	public YZGYDKDO field144;

	@ObfuscatedName("client.kb")
	public YZGYDKDO field145;

	@ObfuscatedName("client.lb")
	public YZGYDKDO field146;

	@ObfuscatedName("client.mb")
	public YZGYDKDO field147;

	@ObfuscatedName("client.nb")
	public YZGYDKDO field148;

	@ObfuscatedName("client.je")
	public YZGYDKDO field291;

	@ObfuscatedName("client.ke")
	public YZGYDKDO field292;

	@ObfuscatedName("client.le")
	public YZGYDKDO field293;

	@ObfuscatedName("client.me")
	public YZGYDKDO field294;

	@ObfuscatedName("client.ne")
	public YZGYDKDO field295;

	@ObfuscatedName("client.oe")
	public YZGYDKDO field296;

	@ObfuscatedName("client.pe")
	public YZGYDKDO field297;

	@ObfuscatedName("client.qe")
	public YZGYDKDO field298;

	@ObfuscatedName("client.re")
	public YZGYDKDO field299;

	@ObfuscatedName("client.Ci")
	public YZGYDKDO field493;

	@ObfuscatedName("client.Di")
	public YZGYDKDO field494;

	@ObfuscatedName("client.Ei")
	public YZGYDKDO field495;

	@ObfuscatedName("client.Fi")
	public YZGYDKDO field496;

	@ObfuscatedName("client.Vj")
	public YZGYDKDO field552;

	@ObfuscatedName("client.Wj")
	public YZGYDKDO field553;

	@ObfuscatedName("client.Xj")
	public YZGYDKDO field554;

	@ObfuscatedName("client.H")
	public String field118;

	@ObfuscatedName("client.T")
	public String field130;

	@ObfuscatedName("client.yf")
	public String field349;

	@ObfuscatedName("client.ck")
	public String field558;

	@ObfuscatedName("client.ld")
	public Socket field241;

	@ObfuscatedName("client.Xb")
	public static boolean field181;

	@ObfuscatedName("client.zf")
	public static boolean field350;

	@ObfuscatedName("client.Yh")
	public static boolean field466;

	@ObfuscatedName("client.ri")
	public static boolean field483;

	@ObfuscatedName("client.yd")
	public int[] field254;

	@ObfuscatedName("client.zd")
	public int[] field255;

	@ObfuscatedName("client.Ad")
	public int[] field256;

	@ObfuscatedName("client.Bd")
	public int[] field257;

	@ObfuscatedName("client.Ee")
	public int[] field311;

	@ObfuscatedName("client.Fe")
	public int[] field312;

	@ObfuscatedName("client.Ge")
	public int[] field313;

	@ObfuscatedName("client.He")
	public int[] field314;

	@ObfuscatedName("client.qf")
	public int[] field341;

	@ObfuscatedName("client.rf")
	public int[] field342;

	@ObfuscatedName("client.sf")
	public int[] field343;

	@ObfuscatedName("client.bh")
	public int[] field420;

	@ObfuscatedName("client.ch")
	public int[] field421;

	@ObfuscatedName("client.wj")
	public int[] field532;

	@ObfuscatedName("client.xj")
	public int[] field533;

	@ObfuscatedName("client.bd")
	public MRCVLIXG[] field234;

	@ObfuscatedName("client.wb")
	public byte[][] field155;

	@ObfuscatedName("client.se")
	public byte[][] field300;

	@ObfuscatedName("client.Db")
	public byte[][][] field162;

	@ObfuscatedName("client.If")
	public int[][][] field359;

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;BI)LHBJEXSJX;")
	public final HBJEXSJX method46(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field370[0] != null) {
				var6 = field370[0].method223(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field538.reset();
			field538.update(var6);
			int var8 = (int) field538.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new HBJEXSJX(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method98(arg4, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method50(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				EYMNCFMK var16 = new EYMNCFMK(var15);
				var16.field679 = 3;
				int var17 = var16.method243() + 6;
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
						method98(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field370[0] != null) {
						field370[0].method224(var6.length, arg2, var6);
					}
				} catch (Exception var28) {
					field370[0] = null;
				}

				if (var6 != null) {
					field538.reset();
					field538.update(var6);
					int var23 = (int) field538.getValue();
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
						method98(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method98(arg4, var11 + " - Retrying in " + var25);
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

				field456 = !field456;
			}
		}

		return new HBJEXSJX(var6);
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method47() {
		method73();

		if (field416 == 1) {
			field132[field415 / 100].method215(field413 - 8 - 4, field414 - 8 - 4);
		}

		if (field416 == 2) {
			field132[field415 / 100 + 4].method215(field413 - 8 - 4, field414 - 8 - 4);
		}

		if (field400 != -1) {
			method109(field134, field400);
			method125(0, 0, 0, VTUPBFSN.method544(field400));
		}

		if (field406 != -1) {
			method109(field134, field406);
			method125(0, 0, 0, VTUPBFSN.method544(field406));
		}

		method148();

		if (!field523) {
			method138();
			method140();
		} else if (field446 == 0) {
			method49();
		}

		if (field281 == 1) {
			field428.method215(472, 296);
		}

		if (field466) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field944 < 30 && field181) {
				var3 = 0xFF0000;
			}

			if (field944 < 20 && !field181) {
				var3 = 0xFF0000;
			}

			field402.method330("Fps:" + field944, var2, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field181) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field181) {
				int var8 = 0xFF0000;
			}

			field402.method330("Mem:" + var5 + "k", var2, var1, 0xFFFF00);
			var2 += 15;
		}

		if (field440 != 0) {
			int var9 = field440 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field402.method335(4, 329, "System update in: " + var10 + ":0" + var9, 0xFFFF00);
			} else {
				field402.method335(4, 329, "System update in: " + var10 + ":" + var9, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method48() {
		int var1 = 5;
		field474[8] = 0;
		int var2 = 0;
		while (field474[8] == 0) {
			String var3 = "Unknown problem";
			method98(20, "Connecting to web server");

			try {
				DataInputStream var4 = method50("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 371);
				EYMNCFMK var5 = new EYMNCFMK(new byte[40]);
				var4.readFully(var5.field678, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field474[var6] = var5.method244();
				}

				int var7 = var5.method244();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field474[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field474[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field474[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field474[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field474[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field474[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method98(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method98(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field456 = !field456;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method49() {
		int var1 = field447;
		int var2 = field448;
		int var3 = field449;
		int var4 = field450;
		int var5 = 0x5D5447;
		BDJXDJBP.method29(var1, var3, var5, var2, var4);
		BDJXDJBP.method29(var1 + 1, var3 - 2, 0, var2 + 1, 16);
		BDJXDJBP.method30(var3 - 2, 0, var1 + 1, var4 - 19, var2 + 18);
		field403.method335(var1 + 3, var2 + 14, "Choose Option", var5);
		int var6 = field956;
		int var7 = field957;
		if (field446 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field446 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field446 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field487; var8++) {
			int var9 = (field487 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field403.method339(true, field195[var8], var9, var10, var1 + 3);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method50(String arg0) throws IOException {
		if (field456) {
			if (field241 != null) {
				try {
					field241.close();
				} catch (Exception var4) {
				}

				field241 = null;
			}

			field241 = method134(43595);
			field241.setSoTimeout(10000);
			InputStream var2 = field241.getInputStream();
			OutputStream var3 = field241.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IBLVTUPBFSN;IIIIII)V")
	public final void method51(int arg0, VTUPBFSN arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field124) {
			field376 = 32;
		} else {
			field376 = 0;
		}

		field124 = false;
		if (arg3 >= arg6 && arg3 < arg6 + 16 && arg2 >= arg0 && arg2 < arg0 + 16) {
			arg1.field1334 -= field547 * 4;

			if (arg4 == 1) {
				field315 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field189 = true;
			}
		} else if (arg3 >= arg6 && arg3 < arg6 + 16 && arg2 >= arg0 + arg7 - 16 && arg2 < arg0 + arg7) {
			arg1.field1334 += field547 * 4;

			if (arg4 == 1) {
				field315 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field189 = true;
			}
		} else if (arg3 >= arg6 - field376 && arg3 < arg6 + field376 + 16 && arg2 >= arg0 + 16 && arg2 < arg0 + arg7 - 16 && field547 > 0) {
			int var9 = (arg7 - 32) * arg7 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg0 - var9 / 2 - 16;
			int var11 = arg7 - var9 - 32;
			arg1.field1334 = (arg5 - arg7) * var10 / var11;

			if (arg4 == 1) {
				field315 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field189 = true;
			}

			field124 = true;
		}
	}

	@ObfuscatedName("client.a(BIIILBPHJJPRI;)V")
	public final void method52(int arg0, int arg1, int arg2, BPHJJPRI arg3) {
		if (field206 != arg3 && field487 < 400) {
			String var5;
			if (arg3.field60 == 0) {
				var5 = arg3.field79 + method187(arg3.field73, field206.field73) + " (level-" + arg3.field73 + ")";
			} else {
				var5 = arg3.field79 + " (skill-" + arg3.field60 + ")";
			}

			if (field126 == 1) {
				field195[field487] = "Use " + field130 + " with @whi@" + var5;
				field160[field487] = 149;
				field161[field487] = arg1;
				field158[field487] = arg2;
				field159[field487] = arg0;
				field487++;
			} else if (field555 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field190[var6] != null) {
						field195[field487] = field190[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field190[var6].equalsIgnoreCase("attack")) {
							if (arg3.field73 > field206.field73) {
								var7 = 2000;
							}

							if (field206.field78 != 0 && arg3.field78 != 0) {
								if (field206.field78 == arg3.field78) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field191[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field160[field487] = var7 + 564;
						}

						if (var6 == 1) {
							field160[field487] = var7 + 734;
						}

						if (var6 == 2) {
							field160[field487] = var7 + 370;
						}

						if (var6 == 3) {
							field160[field487] = var7 + 170;
						}

						if (var6 == 4) {
							field160[field487] = var7 + 248;
						}

						field161[field487] = arg1;
						field158[field487] = arg2;
						field159[field487] = arg0;
						field487++;
					}
				}
			} else if ((field557 & 0x8) == 8) {
				field195[field487] = field558 + " @whi@" + var5;
				field160[field487] = 959;
				field161[field487] = arg1;
				field158[field487] = arg2;
				field159[field487] = arg0;
				field487++;
			}

			for (int var8 = 0; var8 < field487; var8++) {
				if (field160[var8] == 842) {
					field195[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method53() {
		field480 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field122) {
				field412++;
				method102();
				method102();
				method164();
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

		field480 = false;
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)V")
	public final void method54(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field386 = 0;
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

			field386 = 0;
			label46: for (int var7 = 0; var7 < LAMDVZMU.field894; var7++) {
				LAMDVZMU var8 = LAMDVZMU.method376(var7);
				if (var8.field875 == -1 && var8.field863 != null) {
					String var9 = var8.field863.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field387[field386] = var9;
					field388[field386] = var7;
					field386++;
					if (field386 >= field387.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBIII)V")
	public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
			if (field181 && field238 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field249.method305(arg0, arg3, arg6);
			}

			if (arg2 == 1) {
				var8 = field249.method306(arg6, arg3, arg0);
			}

			if (arg2 == 2) {
				var8 = field249.method307(arg0, arg3, arg6);
			}

			if (arg2 == 3) {
				var8 = field249.method308(arg0, arg3, arg6);
			}

			if (var8 != 0) {
				int var12 = field249.method309(arg0, arg3, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field249.method296(arg3, arg6, arg0);
					WEJSKHXC var16 = WEJSKHXC.method548(var13);
					if (var16.field1411) {
						field549[arg0].method598(arg6, var14, var16.field1418, arg3, var15);
					}
				}

				if (arg2 == 1) {
					field249.method297(arg3, arg0, arg6);
				}

				if (arg2 == 2) {
					field249.method298(arg6, arg0, arg3);
					WEJSKHXC var17 = WEJSKHXC.method548(var13);
					if (var17.field1399 + arg3 > 103 || var17.field1399 + arg6 > 103 || var17.field1408 + arg3 > 103 || var17.field1408 + arg6 > 103) {
						return;
					}

					if (var17.field1411) {
						field549[arg0].method599(var17.field1418, var17.field1408, var15, arg3, var17.field1399, arg6);
					}
				}

				if (arg2 == 3) {
					field249.method299(arg0, arg6, arg3);
					WEJSKHXC var18 = WEJSKHXC.method548(var13);
					if (var18.field1411 && var18.field1397) {
						field549[arg0].method601(arg6, arg3);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field162[1][arg3][arg6] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				PMIXOPWJ.method468(field359, field249, arg1, var19, arg4, field549[arg0], arg6, arg3, arg0, arg5);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void method56() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field412);

		if (field308 != null) {
			System.out.println("Od-cycle:" + field308.field1468);
		}

		System.out.println("loop-cycle:" + field531);
		System.out.println("draw-cycle:" + field317);
		System.out.println("ptype:" + field396);
		System.out.println("psize:" + field395);

		if (field468 != null) {
			field468.method521();
		}

		field945 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method57() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field951 != null) {
			return field951;
		}

		return this;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method58() {
		if (field347 == 2) {
			method72((field274 - field319 << 7) + field277, (field273 - field318 << 7) + field276, field275 * 2);

			if (field422 > -1 && field531 % 20 < 10) {
				field508[0].method215(field422 - 12, field423 - 28);
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method59() {
		for (int var1 = 0; var1 < field246; var1++) {
			int var2 = field247[var1];
			KLQFDPHO var3 = field245[var2];
			if (var3 != null) {
				method60(var3.field854.field1157, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILCUSCNWAC;I)V")
	public final void method60(int arg0, CUSCNWAC arg1) {
		if (arg1.field584 < 128 || arg1.field585 < 128 || arg1.field584 >= 13184 || arg1.field585 >= 13184) {
			arg1.field609 = -1;
			arg1.field578 = -1;
			arg1.field601 = 0;
			arg1.field602 = 0;
			arg1.field584 = arg1.field588[0] * 128 + arg1.field606 * 64;
			arg1.field585 = arg1.field589[0] * 128 + arg1.field606 * 64;
			arg1.method193();
		}

		if (field206 == arg1 && (arg1.field584 < 1536 || arg1.field585 < 1536 || arg1.field584 >= 11776 || arg1.field585 >= 11776)) {
			arg1.field609 = -1;
			arg1.field578 = -1;
			arg1.field601 = 0;
			arg1.field602 = 0;
			arg1.field584 = arg1.field588[0] * 128 + arg1.field606 * 64;
			arg1.field585 = arg1.field589[0] * 128 + arg1.field606 * 64;
			arg1.method193();
		}

		if (arg1.field601 > field531) {
			method61(arg1);
		} else if (arg1.field602 >= field531) {
			method62(arg1);
		} else {
			method63(arg1);
		}

		method64(arg1);
		method65(arg1);
	}

	@ObfuscatedName("client.a(LCUSCNWAC;B)V")
	public final void method61(CUSCNWAC arg0) {
		int var2 = arg0.field601 - field531;
		int var3 = arg0.field606 * 64 + arg0.field597 * 128;
		int var4 = arg0.field606 * 64 + arg0.field599 * 128;
		arg0.field584 += (var3 - arg0.field584) / var2;
		arg0.field585 += (var4 - arg0.field585) / var2;
		arg0.field605 = 0;

		if (arg0.field603 == 0) {
			arg0.field604 = 1024;
		}

		if (arg0.field603 == 1) {
			arg0.field604 = 1536;
		}

		if (arg0.field603 == 2) {
			arg0.field604 = 0;
		}

		if (arg0.field603 == 3) {
			arg0.field604 = 512;
		}
	}

	@ObfuscatedName("client.b(LCUSCNWAC;B)V")
	public final void method62(CUSCNWAC arg0) {
		if (field531 == arg0.field602 || arg0.field609 == -1 || arg0.field612 != 0 || arg0.field611 + 1 > DVIZXFSW.field636[arg0.field609].method207(arg0.field610)) {
			int var2 = arg0.field602 - arg0.field601;
			int var3 = field531 - arg0.field601;
			int var4 = arg0.field606 * 64 + arg0.field597 * 128;
			int var5 = arg0.field606 * 64 + arg0.field599 * 128;
			int var6 = arg0.field606 * 64 + arg0.field598 * 128;
			int var7 = arg0.field606 * 64 + arg0.field600 * 128;
			arg0.field584 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field585 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field605 = 0;

		if (arg0.field603 == 0) {
			arg0.field604 = 1024;
		}

		if (arg0.field603 == 1) {
			arg0.field604 = 1536;
		}

		if (arg0.field603 == 2) {
			arg0.field604 = 0;
		}

		if (arg0.field603 == 3) {
			arg0.field604 = 512;
		}

		arg0.field586 = arg0.field604;
	}

	@ObfuscatedName("client.a(ZLCUSCNWAC;)V")
	public final void method63(CUSCNWAC arg0) {
		arg0.field623 = arg0.field620;
		if (arg0.field583 == 0) {
			arg0.field605 = 0;
		} else {
			if (arg0.field609 != -1 && arg0.field612 == 0) {
				DVIZXFSW var2 = DVIZXFSW.field636[arg0.field609];
				if (arg0.field617 > 0 && var2.field648 == 0) {
					arg0.field605++;
					return;
				}

				if (arg0.field617 <= 0 && var2.field649 == 0) {
					arg0.field605++;
					return;
				}
			}

			int var3 = arg0.field584;
			int var4 = arg0.field585;
			int var5 = arg0.field588[arg0.field583 - 1] * 128 + arg0.field606 * 64;
			int var6 = arg0.field589[arg0.field583 - 1] * 128 + arg0.field606 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field604 = 1280;
					} else if (var4 > var6) {
						arg0.field604 = 1792;
					} else {
						arg0.field604 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field604 = 768;
					} else if (var4 > var6) {
						arg0.field604 = 256;
					} else {
						arg0.field604 = 512;
					}
				} else if (var4 < var6) {
					arg0.field604 = 1024;
				} else {
					arg0.field604 = 0;
				}

				int var7 = arg0.field604 - arg0.field586 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field591;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field590;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field593;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field592;
				}

				if (var8 == -1) {
					var8 = arg0.field590;
				}

				arg0.field623 = var8;
				int var9 = 4;
				if (arg0.field604 != arg0.field586 && arg0.field618 == -1 && arg0.field619 != 0) {
					var9 = 2;
				}

				if (arg0.field583 > 2) {
					var9 = 6;
				}

				if (arg0.field583 > 3) {
					var9 = 8;
				}

				if (arg0.field605 > 0 && arg0.field583 > 1) {
					var9 = 8;
					arg0.field605--;
				}

				if (arg0.field614[arg0.field583 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field623 == arg0.field590 && arg0.field615 != -1) {
					arg0.field623 = arg0.field615;
				}

				if (var3 < var5) {
					arg0.field584 += var9;
					if (arg0.field584 > var5) {
						arg0.field584 = var5;
					}
				} else if (var3 > var5) {
					arg0.field584 -= var9;
					if (arg0.field584 < var5) {
						arg0.field584 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field585 += var9;
					if (arg0.field585 > var6) {
						arg0.field585 = var6;
					}
				} else if (var4 > var6) {
					arg0.field585 -= var9;
					if (arg0.field585 < var6) {
						arg0.field585 = var6;
					}
				}

				if (arg0.field584 == var5 && arg0.field585 == var6) {
					arg0.field583--;

					if (arg0.field617 > 0) {
						arg0.field617--;
						return;
					}
				}
			} else {
				arg0.field584 = var5;
				arg0.field585 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLCUSCNWAC;)V")
	public final void method64(CUSCNWAC arg0) {
		if (arg0.field619 != 0) {
			if (arg0.field618 != -1 && arg0.field618 < 32768) {
				KLQFDPHO var2 = field245[arg0.field618];
				if (var2 != null) {
					int var3 = arg0.field584 - var2.field584;
					int var4 = arg0.field585 - var2.field585;
					if (var3 != 0 || var4 != 0) {
						arg0.field604 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field618 >= 32768) {
				int var5 = arg0.field618 - 32768;
				if (field473 == var5) {
					var5 = field217;
				}

				BPHJJPRI var6 = field218[var5];
				if (var6 != null) {
					int var7 = arg0.field584 - var6.field584;
					int var8 = arg0.field585 - var6.field585;
					if (var7 != 0 || var8 != 0) {
						arg0.field604 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field626 != 0 || arg0.field627 != 0) && (arg0.field583 == 0 || arg0.field605 > 0)) {
				int var9 = arg0.field584 - (arg0.field626 - field318 - field318) * 64;
				int var10 = arg0.field585 - (arg0.field627 - field319 - field319) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field604 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field626 = 0;
				arg0.field627 = 0;
			}

			int var11 = arg0.field604 - arg0.field586 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field619 || var11 > 2048 - arg0.field619) {
					arg0.field586 = arg0.field604;
				} else if (var11 > 1024) {
					arg0.field586 -= arg0.field619;
				} else {
					arg0.field586 += arg0.field619;
				}

				arg0.field586 &= 0x7FF;
				if (arg0.field623 == arg0.field620 && arg0.field604 != arg0.field586) {
					if (arg0.field621 != -1) {
						arg0.field623 = arg0.field621;
						return;
					}

					arg0.field623 = arg0.field590;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZLCUSCNWAC;)V")
	public final void method65(CUSCNWAC arg0) {
		arg0.field607 = false;

		if (arg0.field623 != -1) {
			DVIZXFSW var2 = DVIZXFSW.field636[arg0.field623];
			arg0.field625++;
			if (arg0.field624 < var2.field637 && arg0.field625 > var2.method207(arg0.field624)) {
				arg0.field625 = 1;
				arg0.field624++;
			}

			if (arg0.field624 >= var2.field637) {
				arg0.field625 = 1;
				arg0.field624 = 0;
			}
		}

		if (arg0.field578 != -1 && field531 >= arg0.field581) {
			if (arg0.field579 < 0) {
				arg0.field579 = 0;
			}

			DVIZXFSW var3 = XYSJIYWF.field1477[arg0.field578].field1481;
			arg0.field580++;
			if (arg0.field579 < var3.field637 && arg0.field580 > var3.method207(arg0.field579)) {
				arg0.field580 = 1;
				arg0.field579++;
			}

			if (arg0.field579 >= var3.field637 && (arg0.field579 < 0 || arg0.field579 >= var3.field637)) {
				arg0.field578 = -1;
			}
		}

		if (arg0.field609 != -1 && arg0.field612 <= 1) {
			DVIZXFSW var4 = DVIZXFSW.field636[arg0.field609];
			if (var4.field648 == 1 && arg0.field617 > 0 && arg0.field601 <= field531 && arg0.field602 < field531) {
				arg0.field612 = 1;
				return;
			}
		}

		if (arg0.field609 != -1 && arg0.field612 == 0) {
			DVIZXFSW var5 = DVIZXFSW.field636[arg0.field609];
			arg0.field611++;
			if (arg0.field610 < var5.field637 && arg0.field611 > var5.method207(arg0.field610)) {
				arg0.field611 = 1;
				arg0.field610++;
			}

			if (arg0.field610 >= var5.field637) {
				arg0.field610 -= var5.field641;
				arg0.field613++;
				if (arg0.field613 >= var5.field647) {
					arg0.field609 = -1;
				}

				if (arg0.field610 < 0 || arg0.field610 >= var5.field637) {
					arg0.field609 = -1;
				}
			}

			arg0.field607 = var5.field643;
		}

		if (arg0.field612 > 0) {
			arg0.field612--;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method66() {
		if (field537 == -1 || field262 != 2 && field949 == null) {
			if (field121) {
				method107();
				field121 = false;
				field140.method585(field948, 4, 0);
				field141.method585(field948, 357, 0);
				field142.method585(field948, 4, 722);
				field143.method585(field948, 205, 743);
				field144.method585(field948, 0, 0);
				field145.method585(field948, 4, 516);
				field146.method585(field948, 205, 516);
				field147.method585(field948, 357, 496);
				field148.method585(field948, 338, 0);
				field315 = true;
				field189 = true;
				field186 = true;
				field358 = true;

				if (field262 != 2) {
					field495.method585(field948, 4, 4);
					field494.method585(field948, 4, 550);
				}
			}

			if (field262 == 2) {
				method127();
			}

			if (field523 && field446 == 1) {
				field315 = true;
			}

			if (field329 != -1) {
				boolean var3 = method109(field134, field329);
				if (var3) {
					field315 = true;
				}
			}

			if (field454 == 2) {
				field315 = true;
			}

			if (field367 == 2) {
				field315 = true;
			}

			if (field315) {
				method144();
				field315 = false;
			}

			if (field230 == -1 && field467 == 0) {
				field517.field1334 = field378 - field227 - 77;

				if (field956 > 448 && field956 < 560 && field957 > 332) {
					method51(0, field517, field957 - 357, field956 - 17, -1, field378, 463, 77);
				}

				int var4 = field378 - field517.field1334 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field378 - 77) {
					var4 = field378 - 77;
				}

				if (field227 != var4) {
					field227 = var4;
					field189 = true;
				}

				field154++;
				if (field154 > 93) {
					field154 = 0;
					field283.method228(158);
				}
			}

			if (field230 == -1 && field467 == 3) {
				int var5 = field386 * 14 + 7;
				field517.field1334 = field389;

				if (field956 > 448 && field956 < 560 && field957 > 332) {
					method51(0, field517, field957 - 357, field956 - 17, -1, var5, 463, 77);
				}

				int var6 = field517.field1334;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field389 != var6) {
					field389 = var6;
					field189 = true;
				}
			}

			if (field230 != -1) {
				boolean var7 = method109(field134, field230);
				if (var7) {
					field189 = true;
				}
			}

			if (field454 == 3) {
				field189 = true;
			}

			if (field367 == 3) {
				field189 = true;
			}

			if (field118 != null) {
				field189 = true;
			}

			if (field523 && field446 == 2) {
				field189 = true;
			}

			if (field189) {
				method89();
				field189 = false;
			}

			if (field262 == 2) {
				method183();
				field494.method585(field948, 4, 550);
			}

			if (field204 != -1) {
				field186 = true;
			}

			if (field186) {
				if (field204 != -1 && field345 == field204) {
					field204 = -1;
					field283.method228(26);
					field283.method229(field345);
				}

				field186 = false;
				field554.method584();
				field194.method401(0, 0);

				if (field329 == -1) {
					if (field548[field345] != -1) {
						if (field345 == 0) {
							field542.method401(22, 10);
						}

						if (field345 == 1) {
							field543.method401(54, 8);
						}

						if (field345 == 2) {
							field543.method401(82, 8);
						}

						if (field345 == 3) {
							field544.method401(110, 8);
						}

						if (field345 == 4) {
							field546.method401(153, 8);
						}

						if (field345 == 5) {
							field546.method401(181, 8);
						}

						if (field345 == 6) {
							field545.method401(209, 9);
						}
					}

					if (field548[0] != -1 && (field204 != 0 || field531 % 20 < 10)) {
						field279[0].method401(29, 13);
					}

					if (field548[1] != -1 && (field204 != 1 || field531 % 20 < 10)) {
						field279[1].method401(53, 11);
					}

					if (field548[2] != -1 && (field204 != 2 || field531 % 20 < 10)) {
						field279[2].method401(82, 11);
					}

					if (field548[3] != -1 && (field204 != 3 || field531 % 20 < 10)) {
						field279[3].method401(115, 12);
					}

					if (field548[4] != -1 && (field204 != 4 || field531 % 20 < 10)) {
						field279[4].method401(153, 13);
					}

					if (field548[5] != -1 && (field204 != 5 || field531 % 20 < 10)) {
						field279[5].method401(180, 11);
					}

					if (field548[6] != -1 && (field204 != 6 || field531 % 20 < 10)) {
						field279[6].method401(208, 13);
					}
				}

				field554.method585(field948, 160, 516);
				field553.method584();
				field193.method401(0, 0);

				if (field329 == -1) {
					if (field548[field345] != -1) {
						if (field345 == 7) {
							field285.method401(42, 0);
						}

						if (field345 == 8) {
							field286.method401(74, 0);
						}

						if (field345 == 9) {
							field286.method401(102, 0);
						}

						if (field345 == 10) {
							field287.method401(130, 1);
						}

						if (field345 == 11) {
							field289.method401(173, 0);
						}

						if (field345 == 12) {
							field289.method401(201, 0);
						}

						if (field345 == 13) {
							field288.method401(229, 0);
						}
					}

					if (field548[8] != -1 && (field204 != 8 || field531 % 20 < 10)) {
						field279[7].method401(74, 2);
					}

					if (field548[9] != -1 && (field204 != 9 || field531 % 20 < 10)) {
						field279[8].method401(102, 3);
					}

					if (field548[10] != -1 && (field204 != 10 || field531 % 20 < 10)) {
						field279[9].method401(137, 4);
					}

					if (field548[11] != -1 && (field204 != 11 || field531 % 20 < 10)) {
						field279[10].method401(174, 2);
					}

					if (field548[12] != -1 && (field204 != 12 || field531 % 20 < 10)) {
						field279[11].method401(201, 2);
					}

					if (field548[13] != -1 && (field204 != 13 || field531 % 20 < 10)) {
						field279[12].method401(226, 2);
					}
				}

				field553.method585(field948, 466, 496);
				field495.method584();
				AOGYQUKT.field32 = field313;
			}

			if (field358) {
				field358 = false;
				field552.method584();
				field192.method401(0, 0);
				field402.method332(0xFFFFFF, true, 28, 55, "Public chat");

				if (field183 == 0) {
					field402.method332(0xFF00, true, 41, 55, "On");
				}

				if (field183 == 1) {
					field402.method332(0xFFFF00, true, 41, 55, "Friends");
				}

				if (field183 == 2) {
					field402.method332(0xFF0000, true, 41, 55, "Off");
				}

				if (field183 == 3) {
					field402.method332(0xFFFF, true, 41, 55, "Hide");
				}

				field402.method332(0xFFFFFF, true, 28, 184, "Private chat");

				if (field516 == 0) {
					field402.method332(0xFF00, true, 41, 184, "On");
				}

				if (field516 == 1) {
					field402.method332(0xFFFF00, true, 41, 184, "Friends");
				}

				if (field516 == 2) {
					field402.method332(0xFF0000, true, 41, 184, "Off");
				}

				field402.method332(0xFFFFFF, true, 28, 324, "Trade/compete");

				if (field337 == 0) {
					field402.method332(0xFF00, true, 41, 324, "On");
				}

				if (field337 == 1) {
					field402.method332(0xFFFF00, true, 41, 324, "Friends");
				}

				if (field337 == 2) {
					field402.method332(0xFF0000, true, 41, 324, "Off");
				}

				field402.method332(0xFFFFFF, true, 33, 458, "Report abuse");
				field552.method585(field948, 453, 0);
				field495.method584();
				AOGYQUKT.field32 = field313;
			}

			field134 = 0;
		} else {
			if (field262 == 2) {
				method109(field134, field537);

				if (field174 != -1) {
					method109(field134, field174);
				}

				field134 = 0;
				method96();
				field949.method584();
				AOGYQUKT.field32 = field314;
				BDJXDJBP.method27();
				field121 = true;
				VTUPBFSN var1 = VTUPBFSN.method544(field537);
				if (var1.field1341 == 512 && var1.field1306 == 334 && var1.field1371 == 0) {
					var1.field1341 = 765;
					var1.field1306 = 503;
				}

				method125(0, 0, 0, var1);

				if (field174 != -1) {
					VTUPBFSN var2 = VTUPBFSN.method544(field174);
					if (var2.field1341 == 512 && var2.field1306 == 334 && var2.field1371 == 0) {
						var2.field1341 = 765;
						var2.field1306 = 503;
					}

					method125(0, 0, 0, var2);
				}

				if (field523) {
					method49();
				} else {
					method138();
					method140();
				}
			}

			field949.method585(field948, 0, 0);
		}
	}

	@ObfuscatedName("client.a(IIZI)Z")
	public final boolean method67(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field249.method309(field238, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			WEJSKHXC var8 = WEJSKHXC.method548(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1399;
				var10 = var8.field1408;
			} else {
				var9 = var8.field1408;
				var10 = var8.field1399;
			}

			int var11 = var8.field1396;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method160(var9, field206.field589[0], 2, var10, 0, arg2, 0, var11, arg1, true, field206.field588[0]);
		} else {
			method160(0, field206.field589[0], 2, 0, var7, arg2, var6 + 1, 0, arg1, true, field206.field588[0]);
		}

		field413 = field963;
		field414 = field964;
		field416 = 2;
		field415 = 0;
		return true;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method68(int arg0) {
		VTUPBFSN var2 = VTUPBFSN.method544(arg0);
		for (int var3 = 0; var3 < var2.field1314.length && var2.field1314[var3] != -1; var3++) {
			VTUPBFSN var4 = VTUPBFSN.method544(var2.field1314[var3]);
			if (var4.field1371 == 1) {
				method68(var4.field1356);
			}

			var4.field1348 = 0;
			var4.field1329 = 0;
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method69(int arg0, int arg1) {
		DMMTBJKZ var3 = field509[field238][arg0][arg1];
		if (var3 == null) {
			field249.method300(field238, arg0, arg1);
		} else {
			int var4 = -99999999;
			UTHWSBEX var5 = null;
			for (UTHWSBEX var6 = (UTHWSBEX) var3.method200(); var6 != null; var6 = (UTHWSBEX) var3.method202()) {
				LAMDVZMU var7 = LAMDVZMU.method376(var6.field1299);
				int var8 = var7.field871;
				if (var7.field876) {
					var8 = (var6.field1298 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method198(var5);
			UTHWSBEX var9 = null;
			UTHWSBEX var10 = null;
			for (UTHWSBEX var11 = (UTHWSBEX) var3.method200(); var11 != null; var11 = (UTHWSBEX) var3.method202()) {
				if (var5.field1299 != var11.field1299 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1299 != var11.field1299 && var9.field1299 != var11.field1299 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field249.method286(field238, var12, var5, var9, var10, arg0, arg1, method184(field238, arg0 * 128 + 64, arg1 * 128 + 64));
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method70() {
		if (field440 > 1) {
			field440--;
		}

		if (field399 > 0) {
			field399--;
		}

		for (int var1 = 0; var1 < 5 && method168(); var1++) {
		}

		if (field464) {
			synchronized (field303.field1088) {
				if (!field483) {
					field303.field1087 = 0;
				} else if (field962 != 0 || field303.field1087 >= 40) {
					field283.method228(19);
					field283.method229(0);
					int var3 = field283.field679;
					int var4 = 0;
					for (int var5 = 0; var5 < field303.field1087 && var3 - field283.field679 < 240; var5++) {
						var4++;
						int var6 = field303.field1089[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field303.field1084[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field303.field1089[var5] == -1 && field303.field1084[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field330 != var7 || field331 != var6) {
							int var9 = var7 - field330;
							field330 = var7;
							int var10 = var6 - field331;
							field331 = var6;

							if (field417 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field283.method230((field417 << 12) + (var9 << 6) + var10);
								field417 = 0;
							} else if (field417 < 8) {
								field283.method232((field417 << 19) + var8 + 0x800000);
								field417 = 0;
							} else {
								field283.method233((field417 << 19) + var8 - 0x40000000);
								field417 = 0;
							}
						} else if (field417 < 2047) {
							field417++;
						}
					}

					field283.method238(field283.field679 - var3);

					if (var4 >= field303.field1087) {
						field303.field1087 = 0;
					} else {
						field303.field1087 -= var4;
						for (int var11 = 0; var11 < field303.field1087; var11++) {
							field303.field1084[var11] = field303.field1084[var4 + var11];
							field303.field1089[var11] = field303.field1089[var4 + var11];
						}
					}
				}
			}

			if (field962 != 0) {
				long var12 = (field965 - field228) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field228 = field965;
				int var14 = field964;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field963;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field962 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field283.method228(204);
				field283.method273((var17 << 19) + (var18 << 20) + var16);
			}

			if (field260 > 0) {
				field260--;
			}

			if (field966[1] == 1 || field966[2] == 1 || field966[3] == 1 || field966[4] == 1) {
				field261 = true;
			}

			if (field261 && field260 <= 0) {
				field260 = 20;
				field261 = false;
				field283.method228(176);
				field283.method264(field407);
				field283.method264(field408);
			}

			if (field953 && !field392) {
				field392 = true;
				field283.method228(244);
				field283.method229(1);
			}

			if (!field953 && field392) {
				field392 = false;
				field283.method228(244);
				field283.method229(0);
			}

			method191();
			method149();
			method163();
			field397++;
			if (field397 > 750) {
				method175();
			}

			method165();
			method59();
			method108();
			field251++;
			if (field251 > 153) {
				field251 = 0;
				field283.method228(137);
				field283.method233(0);
			}

			field134++;

			if (field416 != 0) {
				field415 += 20;
				if (field415 >= 400) {
					field416 = 0;
				}
			}

			if (field454 != 0) {
				field451++;
				if (field451 >= 15) {
					if (field454 == 2) {
						field315 = true;
					}

					if (field454 == 3) {
						field189 = true;
					}

					field454 = 0;
				}
			}

			if (field367 != 0) {
				field316++;

				if (field956 > field368 + 5 || field956 < field368 - 5 || field957 > field369 + 5 || field957 < field369 - 5) {
					field393 = true;
				}

				if (field955 == 0) {
					if (field367 == 2) {
						field315 = true;
					}

					if (field367 == 3) {
						field189 = true;
					}

					field367 = 0;

					if (field393 && field316 >= 5) {
						field361 = -1;
						method138();

						if (field365 == field361 && field366 != field360) {
							VTUPBFSN var19 = VTUPBFSN.method544(field365);
							byte var20 = 0;
							if (field561 == 1 && var19.field1304 == 206) {
								var20 = 1;
							}

							if (var19.field1370[field360] <= 0) {
								var20 = 0;
							}

							if (var19.field1340) {
								int var21 = field366;
								int var22 = field360;
								var19.field1370[var22] = var19.field1370[var21];
								var19.field1365[var22] = var19.field1365[var21];
								var19.field1370[var21] = -1;
								var19.field1365[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field366;
								int var24 = field360;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method543(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method543(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method543(field360, field366);
							}

							field283.method228(159);
							field283.method230(field360);
							field283.method256(var20);
							field283.method230(field366);
							field283.method266(field365);
						}
					} else if ((field505 == 1 || method91(field487 - 1)) && field487 > 2) {
						method106();
					} else if (field487 > 0) {
						method135(field487 - 1);
					}

					field451 = 10;
					field962 = 0;
				}
			}

			if (FKUDHMAZ.field725 != -1) {
				int var25 = FKUDHMAZ.field725;
				int var26 = FKUDHMAZ.field726;
				boolean var27 = method160(0, field206.field589[0], 0, 0, 0, var26, 0, 0, var25, true, field206.field588[0]);
				FKUDHMAZ.field725 = -1;

				if (var27) {
					field413 = field963;
					field414 = field964;
					field416 = 1;
					field415 = 0;
				}
			}

			if (field962 == 1 && field118 != null) {
				field118 = null;
				field189 = true;
				field962 = 0;
			}

			method174();

			if (field537 == -1) {
				method83();
				method104();
				method161();
			}

			if (field955 == 1 || field962 == 1) {
				field547++;
			}

			if (field482 == 0 && field529 == 0 && field136 == 0) {
				if (field357 > 0) {
					field357--;
				}
			} else if (field357 < 100) {
				field357++;
				if (field357 == 100) {
					if (field482 != 0) {
						field189 = true;
					}

					if (field529 != 0) {
						field315 = true;
					}
				}
			}

			if (field262 == 2) {
				method189();
			}

			if (field262 == 2 && field455) {
				method92();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field520[var28]++;
			}

			method105();
			field954++;
			if (field954 > 4500) {
				field399 = 250;
				field954 -= 500;
				field283.method228(120);
			}

			field252++;
			if (field252 > 500) {
				field252 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field418 += field419;
				}

				if ((var29 & 0x2) == 2) {
					field167 += field168;
				}

				if ((var29 & 0x4) == 4) {
					field506 += field507;
				}
			}

			if (field418 < -50) {
				field419 = 2;
			}

			if (field418 > 50) {
				field419 = -2;
			}

			if (field167 < -55) {
				field168 = 2;
			}

			if (field167 > 55) {
				field168 = -2;
			}

			if (field506 < -40) {
				field507 = 1;
			}

			if (field506 > 40) {
				field507 = -1;
			}

			field120++;
			if (field120 > 500) {
				field120 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field170 += field171;
				}

				if ((var30 & 0x2) == 2) {
					field469 += field470;
				}
			}

			if (field170 < -60) {
				field171 = 2;
			}

			if (field170 > 60) {
				field171 = -2;
			}

			if (field469 < -20) {
				field470 = 1;
			}

			if (field469 > 10) {
				field470 = -1;
			}

			field187++;
			if (field187 > 69) {
				field187 = 0;
				field283.method228(36);
			}

			field398++;
			if (field398 > 50) {
				field283.method228(110);
			}

			try {
				if (field468 != null && field283.field679 > 0) {
					field468.method520(0, field283.field679, field283.field678);
					field283.field679 = 0;
					field398 = 0;
				}
			} catch (IOException var32) {
				method175();
			} catch (Exception var33) {
				method86();
			}
		}
	}

	@ObfuscatedName("client.a(LCUSCNWAC;BI)V")
	public final void method71(CUSCNWAC arg0, int arg1) {
		method72(arg0.field585, arg0.field584, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method72(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method184(field238, arg1, arg0) - arg2;
			arg1 -= field500;
			var4 -= field501;
			arg0 -= field502;
			int var5 = OJGAHFXC.field1080[field503];
			int var6 = OJGAHFXC.field1081[field503];
			int var7 = OJGAHFXC.field1080[field504];
			int var8 = OJGAHFXC.field1081[field504];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field422 = (var9 << 9) / arg0 + AOGYQUKT.field26;
				field423 = (var11 << 9) / arg0 + AOGYQUKT.field27;
			} else {
				field422 = -1;
				field423 = -1;
			}
		} else {
			field422 = -1;
			field423 = -1;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method73() {
		if (field383 != 0) {
			FTIYCDAU var1 = field402;
			int var2 = 0;
			if (field440 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field324[var3] != null) {
					int var4 = field322[var3];
					String var5 = field323[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field516 == 0 || field516 == 1 && method124(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method335(var8, var7, "From", 0);
						var1.method335(var8, var7 - 1, "From", 0xFFFF);
						int var11 = var8 + var1.method333("From ");
						if (var6 == 1) {
							field562[0].method401(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field562[1].method401(var11, var7 - 12);
							var11 += 14;
						}

						var1.method335(var11, var7, var5 + ": " + field324[var3], 0);
						var1.method335(var11, var7 - 1, var5 + ": " + field324[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field516 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method335(4, var9, field324[var3], 0);
						var1.method335(4, var9 - 1, field324[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field516 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method335(4, var10, "To " + var5 + ": " + field324[var3], 0);
						var1.method335(4, var10 - 1, "To " + var5 + ": " + field324[var3], 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LVTUPBFSN;Z)Z")
	public final boolean method74(VTUPBFSN arg0) {
		int var2 = arg0.field1304;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field195[field487] = "Remove @whi@" + arg0.field1360;
				field160[field487] = 397;
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

		field195[field487] = "Remove @whi@" + field463[var2];
		field160[field487] = 968;
		field487++;
		field195[field487] = "Message @whi@" + field463[var2];
		field160[field487] = 109;
		field487++;
		return true;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method75(boolean arg0) {
		if (field206.field584 >> 7 == field484 && field206.field585 >> 7 == field485) {
			field484 = 0;
			field333++;
			if (field333 > 190) {
				field333 = 0;
				field283.method228(0);
				field283.method232(0x9BCF7E);
			}
		}

		int var2 = field219;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			BPHJJPRI var4;
			int var5;
			if (arg0) {
				var4 = field206;
				var5 = field217 << 14;
			} else {
				var4 = field218[field220[var3]];
				var5 = field220[var3] << 14;
			}

			if (var4 != null && var4.method40()) {
				var4.field81 = false;
				if ((field181 && field219 > 50 || field219 > 200) && !arg0 && var4.field623 == var4.field620) {
					var4.field81 = true;
				}

				int var6 = var4.field584 >> 7;
				int var7 = var4.field585 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field77 == null || field531 < var4.field58 || field531 >= var4.field59) {
						if ((var4.field584 & 0x7F) == 0x40 && (var4.field585 & 0x7F) == 0x40) {
							if (field202[var6][var7] == field461) {
								continue;
							}

							field202[var6][var7] = field461;
						}

						var4.field83 = method184(field238, var4.field584, var4.field585);
						field249.method290(60, var4.field586, field238, var4.field585, var4.field607, var4.field83, var5, var4, var4.field584);
					} else {
						var4.field81 = false;
						var4.field83 = method184(field238, var4.field584, var4.field585);
						field249.method291(var4.field70, var4.field584, var4.field586, var5, var4.field68, var4, var4.field83, var4.field71, field238, 60, var4.field69, var4.field585);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method76() {
		byte[] var1 = field290.method348("title.dat", null);
		EFVUNBHT var2 = new EFVUNBHT(var1, this);
		field294.method584();
		var2.method213(0, 0);
		field295.method584();
		var2.method213(0, -637);
		field291.method584();
		var2.method213(0, -128);
		field292.method584();
		var2.method213(-371, -202);
		field293.method584();
		var2.method213(-171, -202);
		field296.method584();
		var2.method213(-265, 0);
		field297.method584();
		var2.method213(-265, -562);
		field298.method584();
		var2.method213(-171, -128);
		field299.method584();
		var2.method213(-171, -562);
		int[] var3 = new int[var2.field667];
		for (int var4 = 0; var4 < var2.field668; var4++) {
			for (int var5 = 0; var5 < var2.field667; var5++) {
				var3[var5] = var2.field666[var2.field667 * var4 + var2.field667 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field667; var6++) {
				var2.field666[var2.field667 * var4 + var6] = var3[var6];
			}
		}

		field294.method584();
		var2.method213(0, 382);
		field295.method584();
		var2.method213(0, -255);
		field291.method584();
		var2.method213(0, 254);
		field292.method584();
		var2.method213(-371, 180);
		field293.method584();
		var2.method213(-171, 180);
		field296.method584();
		var2.method213(-265, 382);
		field297.method584();
		var2.method213(-265, -180);
		field298.method584();
		var2.method213(-171, 254);
		field299.method584();
		var2.method213(-171, -180);
		EFVUNBHT var7 = new EFVUNBHT(field290, "logo", 0);
		field291.method584();
		var7.method215(382 - var7.field667 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method77(int arg0) {
		if (!field181) {
			for (int var2 = 0; var2 < field163.length; var2++) {
				int var3 = field163[var2];
				if (AOGYQUKT.field40[var3] >= arg0) {
					MRCVLIXG var4 = AOGYQUKT.field34[var3];
					int var5 = var4.field982 * var4.field981 - 1;
					int var6 = field134 * var4.field981 * 2;
					byte[] var7 = var4.field979;
					byte[] var8 = field123;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field979 = var8;
					field123 = var7;
					AOGYQUKT.method14(var3);
					field301++;
					if (field301 > 1575) {
						field301 = 0;
						field283.method228(25);
						field283.method229(0);
						int var10 = field283.field679;
						field283.method230((int) (Math.random() * 65536.0D));
						field283.method230(22390);
						field283.method230((int) (Math.random() * 65536.0D));
						field283.method230(39392);
						field283.method230(28881);
						field283.method230(23643);
						field283.method229(41);
						field283.method229(39);
						field283.method229(92);
						field283.method230(38971);
						field283.method238(field283.field679 - var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method78() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.m(I)V")
	public final void method79() {
		field122 = false;
		while (field480) {
			field122 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field373 = null;
		field374 = null;
		field234 = null;
		field254 = null;
		field255 = null;
		field256 = null;
		field257 = null;
		field532 = null;
		field533 = null;
		field420 = null;
		field421 = null;
		field512 = null;
		field513 = null;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method80() {
		for (BSBQPUWL var1 = (BSBQPUWL) field498.method200(); var1 != null; var1 = (BSBQPUWL) field498.method202()) {
			if (field238 != var1.field87 || field531 > var1.field89) {
				var1.method205();
			} else if (field531 >= var1.field88) {
				if (var1.field86 > 0) {
					KLQFDPHO var2 = field245[var1.field86 - 1];
					if (var2 != null && var2.field584 >= 0 && var2.field584 < 13312 && var2.field585 >= 0 && var2.field585 < 13312) {
						var1.method43(var2.field585, method184(var1.field87, var2.field584, var2.field585) - var1.field98, field531, var2.field584);
					}
				}

				if (var1.field86 < 0) {
					int var3 = -var1.field86 - 1;
					BPHJJPRI var4;
					if (field473 == var3) {
						var4 = field206;
					} else {
						var4 = field218[var3];
					}

					if (var4 != null && var4.field584 >= 0 && var4.field584 < 13312 && var4.field585 >= 0 && var4.field585 < 13312) {
						var1.method43(var4.field585, method184(var1.field87, var4.field584, var4.field585) - var1.field98, field531, var4.field584);
					}
				}

				var1.method42(field134);
				field249.method290(60, var1.field90, field238, (int) var1.field93, false, (int) var1.field94, -1, var1, (int) var1.field92);
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method81() {
		if (field355 || field489 || field305) {
			method95();
		} else {
			field317++;

			if (field464) {
				method66();
			} else {
				method121(false);
			}

			field547 = 0;
		}
	}

	@ObfuscatedName("client.b(LVTUPBFSN;Z)Z")
	public final boolean method82(VTUPBFSN arg0) {
		if (arg0.field1313 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1313.length; var2++) {
			int var3 = method169(var2, arg0);
			int var4 = arg0.field1308[var2];
			if (arg0.field1313[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1313[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1313[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method83() {
		if (field207 == 0 && field962 == 1) {
			int var1 = field963 - 25 - 550;
			int var2 = field964 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field408 + field170 & 0x7FF;
				int var4 = AOGYQUKT.field30[var3];
				int var5 = AOGYQUKT.field31[var3];
				var4 = (field469 + 256) * var4 >> 8;
				var5 = (field469 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field206.field584 + var6 >> 7;
				int var9 = field206.field585 - var7 >> 7;
				boolean var10 = method160(0, field206.field589[0], 1, 0, 0, var9, 0, 0, var8, true, field206.field588[0]);
				if (var10) {
					field283.method229(var1);
					field283.method229(var2);
					field283.method230(field408);
					field283.method229(57);
					field283.method229(field170);
					field283.method229(field469);
					field283.method229(89);
					field283.method230(field206.field584);
					field283.method230(field206.field585);
					field283.method229(field280);
					field283.method229(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method84() {
		field121 = true;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method85() {
		field373 = new MRCVLIXG(field290, "titlebox", 0);
		field374 = new MRCVLIXG(field290, "titlebutton", 0);
		field234 = new MRCVLIXG[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field234[var1] = new MRCVLIXG(field290, "runes", var1);
		}

		field512 = new EFVUNBHT(128, 265);
		field513 = new EFVUNBHT(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field512.field666[var2] = field294.field1500[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field513.field666[var3] = field295.field1500[var3];
		}

		field255 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field255[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field255[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field255[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field255[var7 + 192] = 0xFFFFFF;
		}

		field256 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field256[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field256[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field256[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field256[var11 + 192] = 0xFFFFFF;
		}

		field257 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field257[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field257[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field257[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field257[var15 + 192] = 0xFFFFFF;
		}

		field254 = new int[256];
		field532 = new int[32768];
		field533 = new int[32768];
		method97(null);
		field420 = new int[32768];
		field421 = new int[32768];
		method98(10, "Connecting to fileserver");

		if (!field122) {
			field481 = true;
			field122 = true;
			method139(this, 2);
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method86() {
		try {
			if (field468 != null) {
				field468.method516();
			}
		} catch (Exception var2) {
		}

		field468 = null;
		field464 = false;
		field242 = 0;
		field152 = "";
		field153 = "";
		method137();
		field249.method279();

		for (int var1 = 0; var1 < 4; var1++) {
			field549[var1].method593();
		}

		System.gc();
		method78();
		field302 = -1;
		field339 = -1;
		field379 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZLjava/lang/String;)V")
	public final void method87(String arg0, String arg1) {
		if (field495 != null) {
			field495.method584();
			AOGYQUKT.field32 = field313;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field402.method331(var3, 0, arg0, 257);
			field402.method331(var3 - 1, 0xFFFFFF, arg0, 256);
			var3 += 15;
			if (arg1 != null) {
				field402.method331(var3, 0, arg1, 257);
				field402.method331(var3 - 1, 0xFFFFFF, arg1, 256);
			}

			field495.method585(field948, 4, 4);
		} else if (field949 != null) {
			field949.method584();
			AOGYQUKT.field32 = field314;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			BDJXDJBP.method29(383 - var5 / 2, var5, 0, var4 - var6 / 2 - 5, var6);
			BDJXDJBP.method30(var5, 0xFFFFFF, 383 - var5 / 2, var6, var4 - var6 / 2 - 5);

			if (arg1 != null) {
				var4 -= 7;
			}

			field402.method331(var4, 0, arg0, 383);
			field402.method331(var4 - 1, 0xFFFFFF, arg0, 382);
			var4 += 15;
			if (arg1 != null) {
				field402.method331(var4, 0, arg1, 383);
				field402.method331(var4 - 1, 0xFFFFFF, arg1, 382);
			}

			field949.method585(field948, 0, 0);
		}
	}

	@ObfuscatedName("client.a(LEYMNCFMK;IB)V")
	public final void method88(EYMNCFMK arg0, int arg1) {
		field518 = 0;
		field221 = 0;
		method145(arg0, arg1);
		method114(arg1, arg0);
		method157(arg1, arg0);

		for (int var3 = 0; var3 < field518; var3++) {
			int var4 = field519[var3];
			if (field531 != field245[var4].field608) {
				field245[var4].field854 = null;
				field245[var4] = null;
			}
		}

		if (arg0.field679 != arg1) {
			signlink.reporterror(field152 + " size mismatch in getnpcpos - pos:" + arg0.field679 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field246; var5++) {
			if (field245[field247[var5]] == null) {
				signlink.reporterror(field152 + " null entry in npc list - pos:" + var5 + " size:" + field246);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method89() {
		field496.method584();
		AOGYQUKT.field32 = field311;
		field431.method401(0, 0);

		if (field390) {
			field403.method331(40, 0, field560, 239);
			field403.method331(60, 128, field351 + "*", 239);
		} else if (field467 == 1) {
			field403.method331(40, 0, "Enter amount:", 239);
			field403.method331(60, 128, field182 + "*", 239);
		} else if (field467 == 2) {
			field403.method331(40, 0, "Enter name:", 239);
			field403.method331(60, 128, field182 + "*", 239);
		} else if (field467 == 3) {
			if (field385 != field182) {
				method54(field182);
				field385 = field182;
			}

			FTIYCDAU var1 = field402;
			BDJXDJBP.method26(0, 463, 77, 0);

			for (int var2 = 0; var2 < field386; var2++) {
				int var3 = var2 * 14 + 18 - field389;
				if (var3 > 0 && var3 < 110) {
					var1.method331(var3, 0, field387[var2], 239);
				}
			}

			BDJXDJBP.method25();

			if (field386 > 5) {
				method123(0, 463, field389, field386 * 14 + 7, 77);
			}

			if (field182.length() == 0) {
				field403.method331(40, 255, "Enter object name", 239);
			} else if (field386 == 0) {
				field403.method331(40, 0, "No matching objects found, please shorten search", 239);
			}

			var1.method331(90, 0, field182 + "*", 239);
			BDJXDJBP.method32(77, 0, 0, 479);
		} else if (field118 != null) {
			field403.method331(40, 0, field118, 239);
			field403.method331(60, 128, "Click to continue", 239);
		} else if (field230 != -1) {
			method125(0, 0, 0, VTUPBFSN.method544(field230));
		} else if (field391 == -1) {
			FTIYCDAU var4 = field402;
			int var5 = 0;
			BDJXDJBP.method26(0, 463, 77, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field324[var6] != null) {
					int var7 = field322[var6];
					int var8 = field227 + 70 - var5 * 14;
					String var9 = field323[var6];
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
							var4.method335(4, var8, field324[var6], 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field183 == 0 || field183 == 1 && method124(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field562[0].method401(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field562[1].method401(var11, var8 - 12);
								var11 += 14;
							}

							var4.method335(var11, var8, var9 + ":", 0);
							var11 += var4.method333(var9) + 8;
							var4.method335(var11, var8, field324[var6], 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field383 == 0 && (var7 == 7 || field516 == 0 || field516 == 1 && method124(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method335(var12, var8, "From", 0);
							int var14 = var12 + var4.method333("From ");
							if (var10 == 1) {
								field562[0].method401(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field562[1].method401(var14, var8 - 12);
								var14 += 14;
							}

							var4.method335(var14, var8, var9 + ":", 0);
							var14 += var4.method333(var9) + 8;
							var4.method335(var14, var8, field324[var6], 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field337 == 0 || field337 == 1 && method124(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method335(4, var8, var9 + " " + field324[var6], 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field383 == 0 && field516 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method335(4, var8, field324[var6], 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field383 == 0 && field516 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method335(4, var8, "To " + var9 + ":", 0);
							var4.method335(var4.method333("To " + var9) + 12, var8, field324[var6], 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field337 == 0 || field337 == 1 && method124(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method335(4, var8, var9 + " " + field324[var6], 0x7E3200);
						}

						var5++;
					}
				}
			}

			BDJXDJBP.method25();
			field378 = var5 * 14 + 7;
			if (field378 < 78) {
				field378 = 78;
			}

			method123(0, 463, field378 - field227 - 77, field378, 77);
			String var13;
			if (field206 == null || field206.field79 == null) {
				var13 = LBMFERBT.method384(field152);
			} else {
				var13 = field206.field79;
			}

			var4.method335(4, 90, var13 + ":", 0);
			var4.method335(var4.method333(var13 + ": ") + 6, 90, field344 + "*", 255);
			BDJXDJBP.method32(77, 0, 0, 479);
		} else {
			method125(0, 0, 0, VTUPBFSN.method544(field391));
		}

		if (field523 && field446 == 2) {
			method49();
		}

		field496.method585(field948, 357, 17);
		field495.method584();
		AOGYQUKT.field32 = field313;
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void method90() {
		FKUDHMAZ.field691 = false;
		AOGYQUKT.field21 = false;
		field181 = false;
		PMIXOPWJ.field1115 = false;
		WEJSKHXC.field1375 = false;
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method91(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field160[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 465) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method92() {
		int var1 = field208 * 128 + 64;
		int var2 = field209 * 128 + 64;
		int var3 = method184(field238, var1, var2) - field210;

		if (field500 < var1) {
			field500 += (var1 - field500) * field212 / 1000 + field211;
			if (field500 > var1) {
				field500 = var1;
			}
		}

		if (field500 > var1) {
			field500 -= (field500 - var1) * field212 / 1000 + field211;
			if (field500 < var1) {
				field500 = var1;
			}
		}

		if (field501 < var3) {
			field501 += (var3 - field501) * field212 / 1000 + field211;
			if (field501 > var3) {
				field501 = var3;
			}
		}

		if (field501 > var3) {
			field501 -= (field501 - var3) * field212 / 1000 + field211;
			if (field501 < var3) {
				field501 = var3;
			}
		}

		if (field502 < var2) {
			field502 += (var2 - field502) * field212 / 1000 + field211;
			if (field502 > var2) {
				field502 = var2;
			}
		}

		if (field502 > var2) {
			field502 -= (field502 - var2) * field212 / 1000 + field211;
			if (field502 < var2) {
				field502 = var2;
			}
		}

		int var4 = field433 * 128 + 64;
		int var5 = field434 * 128 + 64;
		int var6 = method184(field238, var4, var5) - field435;
		int var7 = var4 - field500;
		int var8 = var6 - field501;
		int var9 = var5 - field502;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field503 < var11) {
			field503 += (var11 - field503) * field437 / 1000 + field436;
			if (field503 > var11) {
				field503 = var11;
			}
		}

		if (field503 > var11) {
			field503 -= (field503 - var11) * field437 / 1000 + field436;
			if (field503 < var11) {
				field503 = var11;
			}
		}

		int var13 = var12 - field504;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field504 += field437 * var13 / 1000 + field436;
			field504 &= 0x7FF;
		}

		if (var13 < 0) {
			field504 -= -var13 * field437 / 1000 + field436;
			field504 &= 0x7FF;
		}

		int var14 = var12 - field504;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field504 = var12;
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method93(int arg0) {
		int var2 = SVMLNUSB.field1211[arg0].field1219;
		if (var2 != 0) {
			int var3 = field307[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					AOGYQUKT.method16(0.9D);
				}

				if (var3 == 2) {
					AOGYQUKT.method16(0.8D);
				}

				if (var3 == 3) {
					AOGYQUKT.method16(0.7D);
				}

				if (var3 == 4) {
					AOGYQUKT.method16(0.6D);
				}

				LAMDVZMU.field859.method533();
				field121 = true;
			}

			if (var2 == 3) {
				boolean var4 = field411;

				if (var3 == 0) {
					method153(0, field411);
					field411 = true;
				}

				if (var3 == 1) {
					method153(-400, field411);
					field411 = true;
				}

				if (var3 == 2) {
					method153(-800, field411);
					field411 = true;
				}

				if (var3 == 3) {
					method153(-1200, field411);
					field411 = true;
				}

				if (var3 == 4) {
					field411 = false;
				}

				if (field411 != var4 && !field181) {
					if (field411) {
						field339 = field302;
						field340 = true;
						field308.method577(2, field339);
					} else {
						method78();
					}

					field379 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field239 = true;
					method117(0);
				}

				if (var3 == 1) {
					field239 = true;
					method117(-400);
				}

				if (var3 == 2) {
					field239 = true;
					method117(-800);
				}

				if (var3 == 3) {
					field239 = true;
					method117(-1200);
				}

				if (var3 == 4) {
					field239 = false;
				}
			}

			if (var2 == 5) {
				field505 = var3;
			}

			if (var2 == 6) {
				field185 = var3;
			}

			if (var2 == 8) {
				field383 = var3;
				field189 = true;
			}

			if (var2 == 9) {
				field561 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method94(boolean arg0) {
		for (int var2 = 0; var2 < field246; var2++) {
			KLQFDPHO var3 = field245[field247[var2]];
			int var4 = (field247[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method40() && var3.field854.field1171 == arg0 && var3.field854.method515()) {
				int var5 = var3.field584 >> 7;
				int var6 = var3.field585 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field606 == 1 && (var3.field584 & 0x7F) == 0x40 && (var3.field585 & 0x7F) == 0x40) {
						if (field202[var5][var6] == field461) {
							continue;
						}

						field202[var5][var6] = field461;
					}

					if (!var3.field854.field1154) {
						var4 += Integer.MIN_VALUE;
					}

					field249.method290((var3.field606 - 1) * 64 + 60, var3.field586, field238, var3.field585, var3.field607, method184(field238, var3.field584, var3.field585), var4, var3, var3.field584);
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method95() {
		Graphics var1 = method57().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method389(1);

		if (field489) {
			field122 = false;
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

		if (field305) {
			field122 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field355) {
			field122 = false;
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

	@ObfuscatedName("client.r(I)V")
	public final void method96() {
		if (field949 == null) {
			method79();
			field291 = null;
			field292 = null;
			field293 = null;
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field299 = null;
			field496 = null;
			field494 = null;
			field493 = null;
			field495 = null;
			field552 = null;
			field553 = null;
			field554 = null;
			field949 = new YZGYDKDO(method57(), 765, 503);
			field121 = true;
		}
	}

	@ObfuscatedName("client.a(ILMRCVLIXG;)V")
	public final void method97(MRCVLIXG arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field532.length; var3++) {
			field532[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field532[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field533[var9] = (field532[var9 - 1] + field532[var9 + 1] + field532[var9 - 128] + field532[var9 + 128]) / 4;
				}
			}

			int[] var10 = field532;
			field532 = field533;
			field533 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field982; var12++) {
				for (int var13 = 0; var13 < arg0.field981; var13++) {
					if (arg0.field979[var11++] != 0) {
						int var14 = var13 + arg0.field983 + 16;
						int var15 = var12 + arg0.field984 + 16;
						int var16 = (var15 << 7) + var14;
						field532[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;B)V")
	public final void method98(int arg0, String arg1) {
		field232 = arg0;
		field349 = arg1;
		method122();

		if (field290 == null) {
			super.method98(arg0, arg1);
		} else {
			field293.method584();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field403.method331(var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			BDJXDJBP.method30(304, 0x8C1111, var3 / 2 - 152, 34, var6);
			BDJXDJBP.method30(302, 0, var3 / 2 - 151, 32, var6 + 1);
			BDJXDJBP.method29(var3 / 2 - 150, arg0 * 3, 0x8C1111, var6 + 2, 30);
			BDJXDJBP.method29(arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 0, var6 + 2, 30);
			field403.method331(var4 / 2 + 5 - var5, 0xFFFFFF, arg1, var3 / 2);
			field293.method585(field948, 171, 202);

			if (field121) {
				field121 = false;

				if (!field122) {
					field294.method585(field948, 0, 0);
					field295.method585(field948, 0, 637);
				}

				field291.method585(field948, 0, 128);
				field292.method585(field948, 371, 202);
				field296.method585(field948, 265, 0);
				field297.method585(field948, 265, 562);
				field298.method585(field948, 171, 128);
				field299.method585(field948, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method99() {
		field263 = 0;
		for (int var1 = -1; var1 < field246 + field219; var1++) {
			CUSCNWAC var2;
			if (var1 == -1) {
				var2 = field206;
			} else if (var1 < field219) {
				var2 = field218[field220[var1]];
			} else {
				var2 = field245[field247[var1 - field219]];
			}

			if (var2 != null && var2.method40()) {
				if (var2 instanceof KLQFDPHO) {
					QYNFXHXW var3 = ((KLQFDPHO) var2).field854;
					if (var3.field1172 != null) {
						var3 = var3.method508();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field219) {
					QYNFXHXW var6 = ((KLQFDPHO) var2).field854;
					if (var6.field1161 >= 0 && var6.field1161 < field335.length) {
						method71(var2, var2.field628 + 15);

						if (field422 > -1) {
							field335[var6.field1161].method215(field422 - 12, field423 - 30);
						}
					}

					if (field347 == 1 && field247[var1 - field219] == field282 && field531 % 20 < 10) {
						method71(var2, var2.field628 + 15);

						if (field422 > -1) {
							field508[0].method215(field422 - 12, field423 - 28);
						}
					}
				} else {
					int var4 = 30;
					BPHJJPRI var5 = (BPHJJPRI) var2;
					if (var5.field63 != -1 || var5.field72 != -1) {
						method71(var2, var2.field628 + 15);

						if (field422 > -1) {
							if (var5.field63 != -1) {
								field362[var5.field63].method215(field422 - 12, field423 - var4);
								var4 += 25;
							}

							if (var5.field72 != -1) {
								field335[var5.field72].method215(field422 - 12, field423 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field347 == 10 && field220[var1] == field157) {
						method71(var2, var2.field628 + 15);

						if (field422 > -1) {
							field508[1].method215(field422 - 12, field423 - var4);
						}
					}
				}

				if (var2.field622 != null && (var1 >= field219 || field183 == 0 || field183 == 3 || field183 == 1 && method124(((BPHJJPRI) var2).field79))) {
					method71(var2, var2.field628);

					if (field422 > -1 && field263 < field264) {
						field268[field263] = field403.method334(var2.field622) / 2;
						field267[field263] = field403.field760;
						field265[field263] = field422;
						field266[field263] = field423;
						field269[field263] = var2.field616;
						field270[field263] = var2.field587;
						field271[field263] = var2.field629;
						field272[field263++] = var2.field622;

						if (field185 == 0 && var2.field587 >= 1 && var2.field587 <= 3) {
							field267[field263] += 10;
							field266[field263] += 5;
						}

						if (field185 == 0 && var2.field587 == 4) {
							field268[field263] = 60;
						}

						if (field185 == 0 && var2.field587 == 5) {
							field267[field263] += 5;
						}
					}
				}

				if (var2.field594 > field531) {
					method71(var2, var2.field628 + 15);

					if (field422 > -1) {
						int var7 = var2.field595 * 30 / var2.field596;
						if (var7 > 30) {
							var7 = 30;
						}

						BDJXDJBP.method29(field422 - 15, var7, 0xFF00, field423 - 3, 5);
						BDJXDJBP.method29(field422 + var7 - 15, 30 - var7, 0xFF0000, field423 - 3, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field577[var8] > field531) {
						method71(var2, var2.field628 / 2);

						if (field422 > -1) {
							if (var8 == 1) {
								field423 -= 20;
							}

							if (var8 == 2) {
								field422 -= 15;
								field423 -= 10;
							}

							if (var8 == 3) {
								field422 += 15;
								field423 -= 10;
							}

							field364[var2.field576[var8]].method215(field422 - 12, field423 - 12);
							field401.method331(field423 + 4, 0, String.valueOf(var2.field575[var8]), field422);
							field401.method331(field423 + 3, 0xFFFFFF, String.valueOf(var2.field575[var8]), field422 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field263; var9++) {
			int var10 = field265[var9];
			int var11 = field266[var9];
			int var12 = field268[var9];
			int var13 = field267[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field266[var15] - field267[var15] && var11 - var13 < field266[var15] + 2 && var10 - var12 < field268[var15] + field265[var15] && var10 + var12 > field265[var15] - field268[var15] && field266[var15] - field267[var15] < var11) {
						var11 = field266[var15] - field267[var15];
						var14 = true;
					}
				}
			}

			field422 = field265[var9];
			field423 = field266[var9] = var11;
			String var16 = field272[var9];
			if (field185 == 0) {
				int var17 = 0xFFFF00;
				if (field269[var9] < 6) {
					var17 = field491[field269[var9]];
				}

				if (field269[var9] == 6) {
					var17 = field461 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field269[var9] == 7) {
					var17 = field461 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field269[var9] == 8) {
					var17 = field461 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field269[var9] == 9) {
					int var18 = 150 - field271[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field269[var9] == 10) {
					int var19 = 150 - field271[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field269[var9] == 11) {
					int var20 = 150 - field271[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field270[var9] == 0) {
					field403.method331(field423 + 1, 0, var16, field422);
					field403.method331(field423, var17, var16, field422);
				}

				if (field270[var9] == 1) {
					field403.method336(0, var16, field461, field423 + 1, field422);
					field403.method336(var17, var16, field461, field423, field422);
				}

				if (field270[var9] == 2) {
					field403.method337(field461, var16, field423 + 1, field422, 0);
					field403.method337(field461, var16, field423, field422, var17);
				}

				if (field270[var9] == 3) {
					field403.method338(var16, 0, field423 + 1, field422, field461, 150 - field271[var9]);
					field403.method338(var16, var17, field423, field422, field461, 150 - field271[var9]);
				}

				if (field270[var9] == 4) {
					int var21 = field403.method334(var16);
					int var22 = (150 - field271[var9]) * (var21 + 100) / 150;
					BDJXDJBP.method26(0, field422 + 50, 334, field422 - 50);
					field403.method335(field422 + 50 - var22, field423 + 1, var16, 0);
					field403.method335(field422 + 50 - var22, field423, var16, var17);
					BDJXDJBP.method25();
				}

				if (field270[var9] == 5) {
					int var23 = 150 - field271[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					BDJXDJBP.method26(field423 - field403.field760 - 1, 512, field423 + 5, 0);
					field403.method331(field423 + var24 + 1, 0, var16, field422);
					field403.method331(field423 + var24, var17, var16, field422);
					BDJXDJBP.method25();
				}
			} else {
				field403.method331(field423 + 1, 0, var16, field422);
				field403.method331(field423, 0xFFFF00, var16, field422);
			}
		}
	}

	@ObfuscatedName("client.a(ILEYMNCFMK;Z)V")
	public final void method100(int arg0, EYMNCFMK arg1) {
		field518 = 0;
		field221 = 0;
		method116(arg0, arg1);
		method111(arg0, arg1);
		method141(arg1, arg0);
		method172(arg1, arg0);

		for (int var3 = 0; var3 < field518; var3++) {
			int var4 = field519[var3];
			if (field531 != field218[var4].field608) {
				field218[var4] = null;
			}
		}

		if (arg1.field679 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field679 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field219; var5++) {
			if (field218[field220[var5]] == null) {
				signlink.reporterror(field152 + " null entry in pl list - pos:" + var5 + " size:" + field219);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ZLCUNQMRTU;)V")
	public final void method101(CUNQMRTU arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field564 == 0) {
			var2 = field249.method305(arg0.field563, arg0.field565, arg0.field566);
		}

		if (arg0.field564 == 1) {
			var2 = field249.method306(arg0.field566, arg0.field565, arg0.field563);
		}

		if (arg0.field564 == 2) {
			var2 = field249.method307(arg0.field563, arg0.field565, arg0.field566);
		}

		if (arg0.field564 == 3) {
			var2 = field249.method308(arg0.field563, arg0.field565, arg0.field566);
		}

		if (var2 != 0) {
			int var6 = field249.method309(arg0.field563, arg0.field565, arg0.field566, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field572 = var3;
		arg0.field574 = var4;
		arg0.field573 = var5;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method102() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field420[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field420[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field421[var10] = (field420[var10 - 1] + field420[var10 + 1] + field420[var10 - 128] + field420[var10 + 128]) / 4;
			}
		}

		field492 += 128;
		if (field492 > field532.length) {
			field492 -= field532.length;
			int var11 = (int) (Math.random() * 12.0D);
			method97(field234[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field421[var14 + 128] - field532[field492 + var14 & field532.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field420[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field541[var16] = field541[var16 + 1];
		}

		field541[var1 - 1] = (int) (Math.sin(field531 / 14.0D) * 16.0D + Math.sin(field531 / 15.0D) * 14.0D + Math.sin(field531 / 16.0D) * 12.0D);

		if (field172 > 0) {
			field172 -= 4;
		}

		if (field173 > 0) {
			field173 -= 4;
		}

		if (field172 == 0 && field173 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field172 = 1024;
			}

			if (var17 == 1) {
				field173 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZZ[B)V")
	public final void method103(boolean arg0, byte[] arg1) {
		if (field411) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	public final void init() {
		field178 = Integer.parseInt(getParameter("nodeid"));
		field179 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method179();
		} else {
			method90();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field180 = false;
		} else {
			field180 = true;
		}

		method387(503, 765);
	}

	@ObfuscatedName("client.u(I)V")
	public final void method104() {
		if (field962 == 1) {
			if (field963 >= 539 && field963 <= 573 && field964 >= 169 && field964 < 205 && field548[0] != -1) {
				field315 = true;
				field345 = 0;
				field186 = true;
			}

			if (field963 >= 569 && field963 <= 599 && field964 >= 168 && field964 < 205 && field548[1] != -1) {
				field315 = true;
				field345 = 1;
				field186 = true;
			}

			if (field963 >= 597 && field963 <= 627 && field964 >= 168 && field964 < 205 && field548[2] != -1) {
				field315 = true;
				field345 = 2;
				field186 = true;
			}

			if (field963 >= 625 && field963 <= 669 && field964 >= 168 && field964 < 203 && field548[3] != -1) {
				field315 = true;
				field345 = 3;
				field186 = true;
			}

			if (field963 >= 666 && field963 <= 696 && field964 >= 168 && field964 < 205 && field548[4] != -1) {
				field315 = true;
				field345 = 4;
				field186 = true;
			}

			if (field963 >= 694 && field963 <= 724 && field964 >= 168 && field964 < 205 && field548[5] != -1) {
				field315 = true;
				field345 = 5;
				field186 = true;
			}

			if (field963 >= 722 && field963 <= 756 && field964 >= 169 && field964 < 205 && field548[6] != -1) {
				field315 = true;
				field345 = 6;
				field186 = true;
			}

			if (field963 >= 540 && field963 <= 574 && field964 >= 466 && field964 < 502 && field548[7] != -1) {
				field315 = true;
				field345 = 7;
				field186 = true;
			}

			if (field963 >= 572 && field963 <= 602 && field964 >= 466 && field964 < 503 && field548[8] != -1) {
				field315 = true;
				field345 = 8;
				field186 = true;
			}

			if (field963 >= 599 && field963 <= 629 && field964 >= 466 && field964 < 503 && field548[9] != -1) {
				field315 = true;
				field345 = 9;
				field186 = true;
			}

			if (field963 >= 627 && field963 <= 671 && field964 >= 467 && field964 < 502 && field548[10] != -1) {
				field315 = true;
				field345 = 10;
				field186 = true;
			}

			if (field963 >= 669 && field963 <= 699 && field964 >= 466 && field964 < 503 && field548[11] != -1) {
				field315 = true;
				field345 = 11;
				field186 = true;
			}

			if (field963 >= 696 && field963 <= 726 && field964 >= 466 && field964 < 503 && field548[12] != -1) {
				field315 = true;
				field345 = 12;
				field186 = true;
			}

			if (field963 >= 724 && field963 <= 758 && field964 >= 466 && field964 < 502 && field548[13] != -1) {
				field315 = true;
				field345 = 13;
				field186 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method105() {
		while (true) {
			int var1 = method390();
			if (var1 == -1) {
				return;
			}

			if (field406 != -1 && field514 == field406) {
				if (var1 == 8 && field243.length() > 0) {
					field243 = field243.substring(0, field243.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field243.length() < 12) {
					field243 = field243 + (char) var1;
				}
			} else if (field390) {
				if (var1 >= 32 && var1 <= 122 && field351.length() < 80) {
					field351 = field351 + (char) var1;
					field189 = true;
				}

				if (var1 == 8 && field351.length() > 0) {
					field351 = field351.substring(0, field351.length() - 1);
					field189 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field390 = false;
					field189 = true;

					if (field405 == 1) {
						long var2 = LBMFERBT.method380(field351);
						method188(var2);
					}

					if (field405 == 2 && field326 > 0) {
						long var4 = LBMFERBT.method380(field351);
						method167(var4);
					}

					if (field405 == 3 && field351.length() > 0) {
						field283.method228(228);
						field283.method229(0);
						int var6 = field283.field679;
						field283.method235(field479);
						HPMMYBXT.method354(field283, field351);
						field283.method238(field283.field679 - var6);
						field351 = HPMMYBXT.method355(field351);
						field351 = PPZVZYJC.method480(field351);
						method110(6, LBMFERBT.method384(LBMFERBT.method381(field479)), field351);

						if (field516 == 2) {
							field516 = 1;
							field358 = true;
							field283.method228(225);
							field283.method229(field183);
							field283.method229(field516);
							field283.method229(field337);
						}
					}

					if (field405 == 4 && field201 < 100) {
						long var7 = LBMFERBT.method380(field351);
						method120(var7);
					}

					if (field405 == 5 && field201 > 0) {
						long var9 = LBMFERBT.method380(field351);
						method128(var9);
					}
				}
			} else if (field467 == 1) {
				if (var1 >= 48 && var1 <= 57 && field182.length() < 10) {
					field182 = field182 + (char) var1;
					field189 = true;
				}

				if (var1 == 8 && field182.length() > 0) {
					field182 = field182.substring(0, field182.length() - 1);
					field189 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field182.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field182);
						} catch (Exception var21) {
						}

						field283.method228(144);
						field283.method233(var11);
					}

					field467 = 0;
					field189 = true;
				}
			} else if (field467 == 2) {
				if (var1 >= 32 && var1 <= 122 && field182.length() < 12) {
					field182 = field182 + (char) var1;
					field189 = true;
				}

				if (var1 == 8 && field182.length() > 0) {
					field182 = field182.substring(0, field182.length() - 1);
					field189 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field182.length() > 0) {
						field283.method228(60);
						field283.method235(LBMFERBT.method380(field182));
					}

					field467 = 0;
					field189 = true;
				}
			} else if (field467 == 3) {
				if (var1 >= 32 && var1 <= 122 && field182.length() < 40) {
					field182 = field182 + (char) var1;
					field189 = true;
				}

				if (var1 == 8 && field182.length() > 0) {
					field182 = field182.substring(0, field182.length() - 1);
					field189 = true;
				}
			} else if (field230 == -1 && field537 == -1) {
				if (var1 >= 32 && var1 <= 122 && field344.length() < 80) {
					field344 = field344 + (char) var1;
					field189 = true;
				}

				if (var1 == 8 && field344.length() > 0) {
					field344 = field344.substring(0, field344.length() - 1);
					field189 = true;
				}

				if ((var1 == 13 || var1 == 10) && field344.length() > 0) {
					if (field477 == 2) {
						if (field344.equals("::clientdrop")) {
							method175();
						}

						if (field344.equals("::lag")) {
							method56();
						}

						if (field344.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field308.method560(2); var12++) {
								field308.method563(2, (byte) 1, var12);
							}
						}

						if (field344.equals("::fpson")) {
							field466 = true;
						}

						if (field344.equals("::fpsoff")) {
							field466 = false;
						}

						if (field344.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field549[var13].field1518[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field344.startsWith("::")) {
						field283.method228(200);
						field283.method229(field344.length() - 1);
						field283.method236(field344.substring(2));
					} else {
						String var16 = field344.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field344 = field344.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field344 = field344.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field344 = field344.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field344 = field344.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field344 = field344.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field344 = field344.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field344 = field344.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field344 = field344.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field344 = field344.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field344 = field344.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field344 = field344.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field344 = field344.substring(6);
						}

						String var18 = field344.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field344 = field344.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field344 = field344.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field344 = field344.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field344 = field344.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field344 = field344.substring(6);
						}

						field283.method228(8);
						field283.method229(0);
						int var20 = field283.field679;
						field244.field679 = 0;
						HPMMYBXT.method354(field244, field344);
						field283.method276(0, field244.field679, field244.field678);
						field283.method257(var19);
						field283.method256(var17);
						field283.method238(field283.field679 - var20);
						field344 = HPMMYBXT.method355(field344);
						field344 = PPZVZYJC.method480(field344);
						field206.field622 = field344;
						field206.field616 = var17;
						field206.field587 = var19;
						field206.field629 = 150;

						if (field477 == 2) {
							method110(2, "@cr2@" + field206.field79, field206.field622);
						} else if (field477 == 1) {
							method110(2, "@cr1@" + field206.field79, field206.field622);
						} else {
							method110(2, field206.field79, field206.field622);
						}

						if (field183 == 2) {
							field183 = 3;
							field358 = true;
							field283.method228(225);
							field283.method229(field183);
							field283.method229(field516);
							field283.method229(field337);
						}
					}

					field344 = "";
					field189 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method106() {
		int var1 = field403.method333("Choose Option");
		for (int var2 = 0; var2 < field487; var2++) {
			int var3 = field403.method333(field195[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field487 * 15 + 21;
		if (field963 > 4 && field964 > 4 && field963 < 516 && field964 < 338) {
			int var5 = field963 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field964 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field523 = true;
			field446 = 0;
			field447 = var5;
			field448 = var6;
			field449 = var1;
			field450 = field487 * 15 + 22;
		}

		if (field963 > 553 && field964 > 205 && field963 < 743 && field964 < 466) {
			int var7 = field963 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field964 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field523 = true;
			field446 = 1;
			field447 = var7;
			field448 = var8;
			field449 = var1;
			field450 = field487 * 15 + 22;
		}

		if (field963 > 17 && field964 > 357 && field963 < 496 && field964 < 453) {
			int var9 = field963 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field964 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field523 = true;
			field446 = 2;
			field447 = var9;
			field448 = var10;
			field449 = var1;
			field450 = field487 * 15 + 22;
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method107() {
		if (field496 == null) {
			method79();
			field949 = null;
			field291 = null;
			field292 = null;
			field293 = null;
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field299 = null;
			field496 = new YZGYDKDO(method57(), 479, 96);
			field494 = new YZGYDKDO(method57(), 172, 156);
			BDJXDJBP.method27();
			field430.method401(0, 0);
			field493 = new YZGYDKDO(method57(), 190, 261);
			field495 = new YZGYDKDO(method57(), 512, 334);
			BDJXDJBP.method27();
			field552 = new YZGYDKDO(method57(), 496, 50);
			field553 = new YZGYDKDO(method57(), 269, 37);
			field554 = new YZGYDKDO(method57(), 249, 45);
			field121 = true;
			field495.method584();
			AOGYQUKT.field32 = field313;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method108() {
		for (int var1 = -1; var1 < field219; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field217;
			} else {
				var2 = field220[var1];
			}

			BPHJJPRI var3 = field218[var2];
			if (var3 != null && var3.field629 > 0) {
				var3.field629--;
				if (var3.field629 == 0) {
					var3.field622 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field246; var4++) {
			int var5 = field247[var4];
			KLQFDPHO var6 = field245[var5];
			if (var6 != null && var6.field629 > 0) {
				var6.field629--;
				if (var6.field629 == 0) {
					var6.field622 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method109(int arg0, int arg1) {
		boolean var3 = false;
		VTUPBFSN var4 = VTUPBFSN.method544(arg1);
		for (int var5 = 0; var5 < var4.field1314.length && var4.field1314[var5] != -1; var5++) {
			VTUPBFSN var6 = VTUPBFSN.method544(var4.field1314[var5]);
			if (var6.field1371 == 0) {
				var3 |= method109(arg0, var6.field1356);
			}

			if (var6.field1371 == 6 && (var6.field1342 != -1 || var6.field1343 != -1)) {
				boolean var7 = method82(var6);
				int var8;
				if (var7) {
					var8 = var6.field1343;
				} else {
					var8 = var6.field1342;
				}

				if (var8 != -1) {
					DVIZXFSW var9 = DVIZXFSW.field636[var8];
					var6.field1329 += arg0;
					while (var6.field1329 > var9.method207(var6.field1348)) {
						var6.field1329 -= var9.method207(var6.field1348);
						var6.field1348++;
						if (var6.field1348 >= var9.field637) {
							var6.field1348 -= var9.field641;
							if (var6.field1348 < 0 || var6.field1348 >= var9.field637) {
								var6.field1348 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1371 == 6 && var6.field1347 != 0) {
				int var10 = var6.field1347 >> 16;
				int var11 = var6.field1347 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1354 = var6.field1354 + var10 & 0x7FF;
				var6.field1355 = var6.field1355 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 371);

			if (arg0.length == 5) {
				field178 = Integer.parseInt(arg0[0]);
				field179 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method179();
				} else if (arg0[2].equals("highmem")) {
					method90();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field180 = false;
				} else if (arg0[3].equals("members")) {
					field180 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method386(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method110(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field391 != -1) {
			field118 = arg2;
			field962 = 0;
		}

		if (field230 == -1) {
			field189 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field322[var4] = field322[var4 - 1];
			field323[var4] = field323[var4 - 1];
			field324[var4] = field324[var4 - 1];
		}

		field322[0] = arg0;
		field323[0] = arg1;
		field324[0] = arg2;
	}

	@ObfuscatedName("client.a(IILEYMNCFMK;)V")
	public final void method111(int arg0, EYMNCFMK arg1) {
		int var3 = arg1.method250(8);
		if (var3 < field219) {
			for (int var4 = var3; var4 < field219; var4++) {
				field519[field518++] = field220[var4];
			}
		}

		if (var3 > field219) {
			signlink.reporterror(field152 + " Too many players");
			throw new RuntimeException("eek");
		}

		field219 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field220[var5];
			BPHJJPRI var7 = field218[var6];
			int var8 = arg1.method250(1);
			if (var8 == 0) {
				field220[field219++] = var6;
				var7.field608 = field531;
			} else {
				int var9 = arg1.method250(2);
				if (var9 == 0) {
					field220[field219++] = var6;
					var7.field608 = field531;
					field222[field221++] = var6;
				} else if (var9 == 1) {
					field220[field219++] = var6;
					var7.field608 = field531;
					int var10 = arg1.method250(3);
					var7.method196(false, var10);
					int var11 = arg1.method250(1);
					if (var11 == 1) {
						field222[field221++] = var6;
					}
				} else if (var9 == 2) {
					field220[field219++] = var6;
					var7.field608 = field531;
					int var12 = arg1.method250(3);
					var7.method196(true, var12);
					int var13 = arg1.method250(3);
					var7.method196(true, var13);
					int var14 = arg1.method250(1);
					if (var14 == 1) {
						field222[field221++] = var6;
					}
				} else if (var9 == 3) {
					field519[field518++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method112() {
		if (field126 == 0 && field555 == 0) {
			field195[field487] = "Walk here";
			field160[field487] = 842;
			field158[field487] = field956;
			field159[field487] = field957;
			field487++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < OJGAHFXC.field1078; var2++) {
			int var3 = OJGAHFXC.field1079[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field249.method309(field238, var4, var5, var3) >= 0) {
					WEJSKHXC var8 = WEJSKHXC.method548(var7);
					if (var8.field1389 != null) {
						var8 = var8.method552();
					}

					if (var8 == null) {
						continue;
					}

					if (field126 == 1) {
						field195[field487] = "Use " + field130 + " with @cya@" + var8.field1388;
						field160[field487] = 82;
						field161[field487] = var3;
						field158[field487] = var4;
						field159[field487] = var5;
						field487++;
					} else if (field555 != 1) {
						if (var8.field1416 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1416[var9] != null) {
									field195[field487] = var8.field1416[var9] + " @cya@" + var8.field1388;

									if (var9 == 0) {
										field160[field487] = 26;
									}

									if (var9 == 1) {
										field160[field487] = 534;
									}

									if (var9 == 2) {
										field160[field487] = 400;
									}

									if (var9 == 3) {
										field160[field487] = 744;
									}

									if (var9 == 4) {
										field160[field487] = 1039;
									}

									field161[field487] = var3;
									field158[field487] = var4;
									field159[field487] = var5;
									field487++;
								}
							}
						}

						field195[field487] = "Examine @cya@" + var8.field1388;
						field160[field487] = 1498;
						field161[field487] = var8.field1377 << 14;
						field158[field487] = var4;
						field159[field487] = var5;
						field487++;
					} else if ((field557 & 0x4) == 4) {
						field195[field487] = field558 + " @cya@" + var8.field1388;
						field160[field487] = 499;
						field161[field487] = var3;
						field158[field487] = var4;
						field159[field487] = var5;
						field487++;
					}
				}

				if (var6 == 1) {
					KLQFDPHO var10 = field245[var7];
					if (var10.field854.field1157 == 1 && (var10.field584 & 0x7F) == 0x40 && (var10.field585 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field246; var11++) {
							KLQFDPHO var12 = field245[field247[var11]];
							if (var12 != null && var10 != var12 && var12.field854.field1157 == 1 && var10.field584 == var12.field584 && var10.field585 == var12.field585) {
								method170(field247[var11], var5, var4, var12.field854);
							}
						}

						for (int var13 = 0; var13 < field219; var13++) {
							BPHJJPRI var14 = field218[field220[var13]];
							if (var14 != null && var10.field584 == var14.field584 && var10.field585 == var14.field585) {
								method52(var5, field220[var13], var4, var14);
							}
						}
					}

					method170(var7, var5, var4, var10.field854);
				}

				if (var6 == 0) {
					BPHJJPRI var15 = field218[var7];
					if ((var15.field584 & 0x7F) == 0x40 && (var15.field585 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field246; var16++) {
							KLQFDPHO var17 = field245[field247[var16]];
							if (var17 != null && var17.field854.field1157 == 1 && var15.field584 == var17.field584 && var15.field585 == var17.field585) {
								method170(field247[var16], var5, var4, var17.field854);
							}
						}

						for (int var18 = 0; var18 < field219; var18++) {
							BPHJJPRI var19 = field218[field220[var18]];
							if (var19 != null && var15 != var19 && var15.field584 == var19.field584 && var15.field585 == var19.field585) {
								method52(var5, field220[var18], var4, var19);
							}
						}
					}

					method52(var5, var7, var4, var15);
				}

				if (var6 == 3) {
					DMMTBJKZ var20 = field509[field238][var4][var5];
					if (var20 != null) {
						for (UTHWSBEX var21 = (UTHWSBEX) var20.method201(); var21 != null; var21 = (UTHWSBEX) var20.method203()) {
							LAMDVZMU var22 = LAMDVZMU.method376(var21.field1299);
							if (field126 == 1) {
								field195[field487] = "Use " + field130 + " with @lre@" + var22.field863;
								field160[field487] = 823;
								field161[field487] = var21.field1299;
								field158[field487] = var4;
								field159[field487] = var5;
								field487++;
							} else if (field555 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field870 != null && var22.field870[var23] != null) {
										field195[field487] = var22.field870[var23] + " @lre@" + var22.field863;

										if (var23 == 0) {
											field160[field487] = 642;
										}

										if (var23 == 1) {
											field160[field487] = 868;
										}

										if (var23 == 2) {
											field160[field487] = 10;
										}

										if (var23 == 3) {
											field160[field487] = 87;
										}

										if (var23 == 4) {
											field160[field487] = 705;
										}

										field161[field487] = var21.field1299;
										field158[field487] = var4;
										field159[field487] = var5;
										field487++;
									} else if (var23 == 2) {
										field195[field487] = "Take @lre@" + var22.field863;
										field160[field487] = 10;
										field161[field487] = var21.field1299;
										field158[field487] = var4;
										field159[field487] = var5;
										field487++;
									}
								}

								field195[field487] = "Examine @lre@" + var22.field863;
								field160[field487] = 1937;
								field161[field487] = var21.field1299;
								field158[field487] = var4;
								field159[field487] = var5;
								field487++;
							} else if ((field557 & 0x1) == 1) {
								field195[field487] = field558 + " @lre@" + var22.field863;
								field160[field487] = 652;
								field161[field487] = var21.field1299;
								field158[field487] = var4;
								field159[field487] = var5;
								field487++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method113(String arg0) {
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

	@ObfuscatedName("client.b(IILEYMNCFMK;)V")
	public final void method114(int arg0, EYMNCFMK arg1) {
		while (arg1.field680 + 21 < arg0 * 8) {
			int var3 = arg1.method250(14);
			if (var3 == 16383) {
				break;
			}

			if (field245[var3] == null) {
				field245[var3] = new KLQFDPHO();
			}

			KLQFDPHO var4 = field245[var3];
			field247[field246++] = var3;
			var4.field608 = field531;
			int var5 = arg1.method250(1);
			var4.field854 = QYNFXHXW.method512(arg1.method250(13));
			int var6 = arg1.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method250(1);
			if (var7 == 1) {
				field222[field221++] = var3;
			}

			int var8 = arg1.method250(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field606 = var4.field854.field1157;
			var4.field619 = var4.field854.field1166;
			var4.field590 = var4.field854.field1160;
			var4.field591 = var4.field854.field1167;
			var4.field592 = var4.field854.field1168;
			var4.field593 = var4.field854.field1170;
			var4.field620 = var4.field854.field1162;
			var4.method195(var5 == 1, field206.field589[0] + var6, field206.field588[0] + var8);
		}

		arg1.method251();
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method115(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(BILEYMNCFMK;)V")
	public final void method116(int arg0, EYMNCFMK arg1) {
		arg1.method249();
		int var3 = arg1.method250(1);
		if (var3 != 0) {
			int var4 = arg1.method250(2);
			if (var4 == 0) {
				field222[field221++] = field217;
			} else if (var4 == 1) {
				int var5 = arg1.method250(3);
				field206.method196(false, var5);
				int var6 = arg1.method250(1);
				if (var6 == 1) {
					field222[field221++] = field217;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method250(3);
				field206.method196(true, var7);
				int var8 = arg1.method250(3);
				field206.method196(true, var8);
				int var9 = arg1.method250(1);
				if (var9 == 1) {
					field222[field221++] = field217;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method250(1);
				if (var10 == 1) {
					field222[field221++] = field217;
				}

				int var11 = arg1.method250(7);
				field238 = arg1.method250(2);
				int var12 = arg1.method250(7);
				int var13 = arg1.method250(1);
				field206.method195(var13 == 1, var12, var11);
			}
		}
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method117(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method118() {
		field283.method228(64);

		if (field329 != -1) {
			method181(field329);
			field329 = -1;
			field315 = true;
			field522 = false;
			field186 = true;
		}

		if (field230 != -1) {
			method181(field230);
			field230 = -1;
			field189 = true;
			field522 = false;
		}

		if (field537 != -1) {
			method181(field537);
			field537 = -1;
			field121 = true;
		}

		if (field174 != -1) {
			method181(field174);
			field174 = -1;
		}

		if (field406 != -1) {
			method181(field406);
			field406 = -1;
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method119() {
		for (AEQBPGLT var1 = (AEQBPGLT) field156.method200(); var1 != null; var1 = (AEQBPGLT) field156.method202()) {
			if (field238 != var1.field3 || var1.field8) {
				var1.method205();
			} else if (field531 >= var1.field7) {
				var1.method2(field134);

				if (var1.field8) {
					var1.method205();
				} else {
					field249.method290(60, 0, var1.field3, var1.field5, false, var1.field6, -1, var1, var1.field4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method120(long arg0) {
		if (arg0 != 0L) {
			if (field201 >= 100) {
				method110(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = LBMFERBT.method384(LBMFERBT.method381(arg0));
				for (int var4 = 0; var4 < field201; var4++) {
					if (field348[var4] == arg0) {
						method110(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field326; var5++) {
					if (field139[var5] == arg0) {
						method110(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field348[field201++] = arg0;
				field315 = true;
				field283.method228(74);
				field283.method235(arg0);
			}
		}
	}

	@ObfuscatedName("client.e(IZ)V")
	public final void method121(boolean arg0) {
		method122();
		field293.method584();
		field373.method401(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field242 == 0) {
			int var4 = var3 / 2 + 80;
			field401.method332(0x75A9A9, true, var4, var2 / 2, field308.field1469);
			int var5 = var3 / 2 - 20;
			field403.method332(0xFFFF00, true, var5, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field374.method401(var6 - 73, var7 - 20);
			field403.method332(0xFFFFFF, true, var7 + 5, var6, "New User");
			int var8 = var2 / 2 + 80;
			field374.method401(var8 - 73, var7 - 20);
			field403.method332(0xFFFFFF, true, var7 + 5, var8, "Existing User");
		}

		if (field242 == 2) {
			int var9 = var3 / 2 - 40;
			if (field526.length() > 0) {
				field403.method332(0xFFFF00, true, var9 - 15, var2 / 2, field526);
				field403.method332(0xFFFF00, true, var9, var2 / 2, field527);
				var9 += 30;
			} else {
				field403.method332(0xFFFF00, true, var9 - 7, var2 / 2, field527);
				var9 += 30;
			}

			field403.method339(true, "Username: " + field152 + (field226 == 0 & field531 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 90);
			var9 += 15;
			field403.method339(true, "Password: " + LBMFERBT.method385(field153) + (field226 == 1 & field531 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field374.method401(var10 - 73, var11 - 20);
				field403.method332(0xFFFFFF, true, var11 + 5, var10, "Login");
				int var12 = var2 / 2 + 80;
				field374.method401(var12 - 73, var11 - 20);
				field403.method332(0xFFFFFF, true, var11 + 5, var12, "Cancel");
			}
		}

		if (field242 == 3) {
			field403.method332(0xFFFF00, true, var3 / 2 - 60, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field403.method332(0xFFFFFF, true, var13, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field403.method332(0xFFFFFF, true, var13, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field403.method332(0xFFFFFF, true, var13, var2 / 2, "and choose the 'create account'");
			var13 += 15;
			field403.method332(0xFFFFFF, true, var13, var2 / 2, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field374.method401(var14 - 73, var15 - 20);
			field403.method332(0xFFFFFF, true, var15 + 5, var14, "Cancel");
		}

		field293.method585(field948, 171, 202);

		if (field121) {
			field121 = false;
			field291.method585(field948, 0, 128);
			field292.method585(field948, 371, 202);
			field296.method585(field948, 265, 0);
			field297.method585(field948, 265, 562);
			field298.method585(field948, 171, 128);
			field299.method585(field948, 171, 562);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method122() {
		if (field291 == null) {
			field949 = null;
			field496 = null;
			field494 = null;
			field493 = null;
			field495 = null;
			field552 = null;
			field553 = null;
			field554 = null;
			field294 = new YZGYDKDO(method57(), 128, 265);
			BDJXDJBP.method27();
			field295 = new YZGYDKDO(method57(), 128, 265);
			BDJXDJBP.method27();
			field291 = new YZGYDKDO(method57(), 509, 171);
			BDJXDJBP.method27();
			field292 = new YZGYDKDO(method57(), 360, 132);
			BDJXDJBP.method27();
			field293 = new YZGYDKDO(method57(), 360, 200);
			BDJXDJBP.method27();
			field296 = new YZGYDKDO(method57(), 202, 238);
			BDJXDJBP.method27();
			field297 = new YZGYDKDO(method57(), 203, 238);
			BDJXDJBP.method27();
			field298 = new YZGYDKDO(method57(), 74, 94);
			BDJXDJBP.method27();
			field299 = new YZGYDKDO(method57(), 75, 94);
			BDJXDJBP.method27();

			if (field290 != null) {
				method76();
				method85();
			}

			field121 = true;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method123(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field381.method401(arg1, arg0);
		field382.method401(arg1, arg0 + arg4 - 16);
		BDJXDJBP.method29(arg1, 16, field169, arg0 + 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		BDJXDJBP.method29(arg1, 16, field231, arg0 + var7 + 16, var6);
		BDJXDJBP.method34(field336, arg0 + var7 + 16, arg1, var6);
		BDJXDJBP.method34(field336, arg0 + var7 + 16, arg1 + 1, var6);
		BDJXDJBP.method32(arg0 + var7 + 16, field336, arg1, 16);
		BDJXDJBP.method32(arg0 + var7 + 17, field336, arg1, 16);
		BDJXDJBP.method34(field427, arg0 + var7 + 16, arg1 + 15, var6);
		BDJXDJBP.method34(field427, arg0 + var7 + 17, arg1 + 14, var6 - 1);
		BDJXDJBP.method32(arg0 + var7 + var6 + 15, field427, arg1, 16);
		BDJXDJBP.method32(arg0 + var7 + var6 + 14, field427, arg1 + 1, 15);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method124(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field326; var2++) {
			if (arg0.equalsIgnoreCase(field463[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field206.field79)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIILVTUPBFSN;I)V")
	public final void method125(int arg0, int arg1, int arg2, VTUPBFSN arg3) {
		if (arg3.field1371 == 0 && arg3.field1314 != null && (!arg3.field1310 || field236 == arg3.field1356 || field384 == arg3.field1356 || field476 == arg3.field1356)) {
			int var5 = BDJXDJBP.field51;
			int var6 = BDJXDJBP.field49;
			int var7 = BDJXDJBP.field52;
			int var8 = BDJXDJBP.field50;
			BDJXDJBP.method26(arg1, arg3.field1341 + arg0, arg3.field1306 + arg1, arg0);
			int var9 = arg3.field1314.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field1320[var10] + arg0;
				int var12 = arg3.field1328[var10] + arg1 - arg2;
				VTUPBFSN var13 = VTUPBFSN.method544(arg3.field1314[var10]);
				var11 += var13.field1344;
				var12 += var13.field1332;

				if (var13.field1304 > 0) {
					method154(var13);
				}

				if (var13.field1371 == 0) {
					if (var13.field1334 > var13.field1303 - var13.field1306) {
						var13.field1334 = var13.field1303 - var13.field1306;
					}

					if (var13.field1334 < 0) {
						var13.field1334 = 0;
					}

					method125(var11, var12, var13.field1334, var13);

					if (var13.field1303 > var13.field1306) {
						method123(var12, var13.field1341 + var11, var13.field1334, var13.field1303, var13.field1306);
					}
				} else if (var13.field1371 != 1) {
					if (var13.field1371 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1306; var15++) {
							for (int var16 = 0; var16 < var13.field1341; var16++) {
								int var17 = (var13.field1372 + 32) * var16 + var11;
								int var18 = (var13.field1337 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1338[var14];
									var18 += var13.field1316[var14];
								}

								if (var13.field1370[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1370[var14] - 1;
									if (var17 > BDJXDJBP.field51 - 32 && var17 < BDJXDJBP.field52 && var18 > BDJXDJBP.field49 - 32 && var18 < BDJXDJBP.field50 || field367 != 0 && field366 == var14) {
										int var22 = 0;
										if (field126 == 1 && field127 == var14 && field128 == var13.field1356) {
											var22 = 0xFFFFFF;
										}

										EFVUNBHT var23 = LAMDVZMU.method373(var22, var13.field1365[var14], var21);
										if (var23 != null) {
											if (field367 != 0 && field366 == var14 && field365 == var13.field1356) {
												var19 = field956 - field368;
												var20 = field957 - field369;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field316 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method217(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < BDJXDJBP.field49 && arg3.field1334 > 0) {
													int var24 = (BDJXDJBP.field49 - var18 - var20) * field134 / 3;
													if (var24 > field134 * 10) {
														var24 = field134 * 10;
													}

													if (var24 > arg3.field1334) {
														var24 = arg3.field1334;
													}

													arg3.field1334 -= var24;
													field369 += var24;
												}

												if (var18 + var20 + 32 > BDJXDJBP.field50 && arg3.field1334 < arg3.field1303 - arg3.field1306) {
													int var25 = (var18 + var20 + 32 - BDJXDJBP.field50) * field134 / 3;
													if (var25 > field134 * 10) {
														var25 = field134 * 10;
													}

													if (var25 > arg3.field1303 - arg3.field1306 - arg3.field1334) {
														var25 = arg3.field1303 - arg3.field1306 - arg3.field1334;
													}

													arg3.field1334 += var25;
													field369 -= var25;
												}
											} else if (field454 != 0 && field453 == var14 && field452 == var13.field1356) {
												var23.method217(var18, var17, 128);
											} else {
												var23.method215(var17, var18);
											}

											if (var23.field671 == 33 || var13.field1365[var14] != 1) {
												int var26 = var13.field1365[var14];
												field401.method335(var17 + var19 + 1, var18 + 10 + var20, method159(var26), 0);
												field401.method335(var17 + var19, var18 + 9 + var20, method159(var26), 0xFFFF00);
											}
										}
									}
								} else if (var13.field1349 != null && var14 < 20) {
									EFVUNBHT var27 = var13.field1349[var14];
									if (var27 != null) {
										var27.method215(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1371 == 3) {
						boolean var28 = false;
						if (field476 == var13.field1356 || field384 == var13.field1356 || field236 == var13.field1356) {
							var28 = true;
						}

						int var29;
						if (method82(var13)) {
							var29 = var13.field1311;
							if (var28 && var13.field1325 != 0) {
								var29 = var13.field1325;
							}
						} else {
							var29 = var13.field1321;
							if (var28 && var13.field1369 != 0) {
								var29 = var13.field1369;
							}
						}

						if (var13.field1361 == 0) {
							if (var13.field1345) {
								BDJXDJBP.method29(var11, var13.field1341, var29, var12, var13.field1306);
							} else {
								BDJXDJBP.method30(var13.field1341, var29, var11, var13.field1306, var12);
							}
						} else if (var13.field1345) {
							BDJXDJBP.method28(var11, var13.field1341, var29, var12, var13.field1306, 256 - (var13.field1361 & 0xFF));
						} else {
							BDJXDJBP.method31(256 - (var13.field1361 & 0xFF), var29, var12, var11, var13.field1306, var13.field1341);
						}
					} else if (var13.field1371 == 4) {
						FTIYCDAU var30 = var13.field1336;
						String var31 = var13.field1360;
						boolean var32 = false;
						if (field476 == var13.field1356 || field384 == var13.field1356 || field236 == var13.field1356) {
							var32 = true;
						}

						int var33;
						if (method82(var13)) {
							var33 = var13.field1311;
							if (var32 && var13.field1325 != 0) {
								var33 = var13.field1325;
							}

							if (var13.field1317.length() > 0) {
								var31 = var13.field1317;
							}
						} else {
							var33 = var13.field1321;
							if (var32 && var13.field1369 != 0) {
								var33 = var13.field1369;
							}
						}

						if (var13.field1301 == 6 && field522) {
							var31 = "Please wait...";
							var33 = var13.field1321;
						}

						if (BDJXDJBP.field47 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field760 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method115(method169(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method115(method169(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method115(method169(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method115(method169(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method115(method169(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1326) {
								var30.method332(var33, var13.field1333, var34, var13.field1341 / 2 + var11, var41);
							} else {
								var30.method339(var13.field1333, var41, var34, var33, var11);
							}

							var34 += var30.field760;
						}
					} else if (var13.field1371 == 5) {
						EFVUNBHT var42;
						if (method82(var13)) {
							var42 = var13.field1350;
						} else {
							var42 = var13.field1330;
						}

						if (var42 != null) {
							var42.method215(var11, var12);
						}
					} else if (var13.field1371 == 6) {
						int var43 = AOGYQUKT.field26;
						int var44 = AOGYQUKT.field27;
						AOGYQUKT.field26 = var13.field1341 / 2 + var11;
						AOGYQUKT.field27 = var13.field1306 / 2 + var12;
						int var45 = AOGYQUKT.field30[var13.field1354] * var13.field1353 >> 16;
						int var46 = AOGYQUKT.field31[var13.field1354] * var13.field1353 >> 16;
						boolean var47 = method82(var13);
						int var48;
						if (var47) {
							var48 = var13.field1343;
						} else {
							var48 = var13.field1342;
						}

						OJGAHFXC var49;
						if (var48 == -1) {
							var49 = var13.method539(var47, -1, -1);
						} else {
							DVIZXFSW var50 = DVIZXFSW.field636[var48];
							var49 = var13.method539(var47, var50.field638[var13.field1348], var50.field639[var13.field1348]);
						}

						if (var49 != null) {
							var49.method434(0, var13.field1355, 0, var13.field1354, 0, var45, var46);
						}

						AOGYQUKT.field26 = var43;
						AOGYQUKT.field27 = var44;
					} else {
						if (var13.field1371 == 7) {
							FTIYCDAU var51 = var13.field1336;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1306; var53++) {
								for (int var54 = 0; var54 < var13.field1341; var54++) {
									if (var13.field1370[var52] > 0) {
										LAMDVZMU var55 = LAMDVZMU.method376(var13.field1370[var52] - 1);
										String var56 = String.valueOf(var55.field863);
										if (var55.field876 || var13.field1365[var52] != 1) {
											var56 = var56 + " x" + method152(var13.field1365[var52]);
										}

										int var57 = (var13.field1372 + 115) * var54 + var11;
										int var58 = (var13.field1337 + 12) * var53 + var12;
										if (var13.field1326) {
											var51.method332(var13.field1321, var13.field1333, var58, var13.field1341 / 2 + var57, var56);
										} else {
											var51.method339(var13.field1333, var56, var58, var13.field1321, var57);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1371 == 8 && (field482 == var13.field1356 || field529 == var13.field1356 || field136 == var13.field1356) && field357 == 100) {
							int var59 = 0;
							int var60 = 0;
							FTIYCDAU var61 = field402;
							String var62 = var13.field1360;
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

								int var65 = var61.method333(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field760 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1341 + var11 - var59 - 5;
							int var67 = var13.field1306 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field1341 + arg0) {
								var66 = arg3.field1341 + arg0 - var59;
							}

							if (var60 + var67 > arg3.field1306 + arg1) {
								var67 = arg3.field1306 + arg1 - var60;
							}

							BDJXDJBP.method29(var66, var59, 0xFFFFA0, var67, var60);
							BDJXDJBP.method30(var59, 0, var66, var60, var67);
							String var68 = var13.field1360;
							int var69 = var61.field760 + var67 + 2;
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

								var61.method339(false, var71, var69, 0, var66 + 3);
								var69 += var61.field760 + 1;
							}
						}
					}
				}
			}

			BDJXDJBP.method26(var6, var7, var8, var5);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method126() {
		if (field383 != 0) {
			int var1 = 0;
			if (field440 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field324[var2] != null) {
					int var3 = field322[var2];
					String var4 = field323[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field516 == 0 || field516 == 1 && method124(var4))) {
						int var8 = 329 - var1 * 13;
						if (field956 > 4 && field957 - 4 > var8 - 10 && field957 - 4 <= var8 + 3) {
							int var9 = field402.method333("From:  " + var4 + field324[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field956 < var9 + 4) {
								if (field477 >= 1) {
									field195[field487] = "Report abuse @whi@" + var4;
									field160[field487] = 2214;
									field487++;
								}

								field195[field487] = "Add ignore @whi@" + var4;
								field160[field487] = 2816;
								field487++;
								field195[field487] = "Add friend @whi@" + var4;
								field160[field487] = 2465;
								field487++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field516 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method127() {
		field461++;
		method75(true);
		method94(true);
		method75(false);
		method94(false);
		method80();
		method119();

		if (!field455) {
			int var1 = field407;
			if (field457 / 256 > var1) {
				var1 = field457 / 256;
			}

			if (field497[4] && field372[4] + 128 > var1) {
				var1 = field372[4] + 128;
			}

			int var2 = field506 + field408 & 0x7FF;
			method150(var1 * 3 + 600, var2, field258, method184(field238, field206.field584, field206.field585) - 50, field259, var1);
			field375++;
			if (field375 > 90) {
				field375 = 0;
				field283.method228(13);
			}
		}

		int var3;
		if (field455) {
			var3 = method147();
		} else {
			var3 = method146();
		}

		int var4 = field500;
		int var5 = field501;
		int var6 = field502;
		int var7 = field503;
		int var8 = field504;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field497[var9]) {
				int var10 = (int) (Math.random() * (field284[var9] * 2 + 1) + Math.sin(field521[var9] / 100.0D * field520[var9]) * field372[var9] - field284[var9]);
				if (var9 == 0) {
					field500 += var10;
				}

				if (var9 == 1) {
					field501 += var10;
				}

				if (var9 == 2) {
					field502 += var10;
				}

				if (var9 == 3) {
					field504 = field504 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field503 += var10;
					if (field503 < 128) {
						field503 = 128;
					}

					if (field503 > 383) {
						field503 = 383;
					}
				}
			}
		}

		int var11 = AOGYQUKT.field41;
		OJGAHFXC.field1075 = true;
		OJGAHFXC.field1078 = 0;
		OJGAHFXC.field1076 = field956 - 4;
		OJGAHFXC.field1077 = field957 - 4;
		BDJXDJBP.method27();
		field249.method318(field502, var3, field504, field500, field501, field503);
		field249.method293();
		method99();
		method58();
		method77(var11);
		method47();
		field495.method585(field948, 4, 4);
		field500 = var4;
		field501 = var5;
		field502 = var6;
		field503 = var7;
		field504 = var8;
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method128(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field201; var3++) {
				if (field348[var3] == arg0) {
					field201--;
					field315 = true;

					for (int var4 = var3; var4 < field201; var4++) {
						field348[var4] = field348[var4 + 1];
					}

					field283.method228(209);
					field283.method235(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)Ljava/lang/String;")
	public final String method129() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field951 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.d(I)V")
	public final void method130() {
		field192 = null;
		field193 = null;
		field194 = null;
		field218 = null;
		field220 = null;
		field222 = null;
		field223 = null;
		field519 = null;
		field429 = null;
		field430 = null;
		field431 = null;

		if (field308 != null) {
			field308.method564();
		}

		field308 = null;
		field341 = null;
		field300 = null;
		field155 = null;
		field342 = null;
		field343 = null;
		field498 = null;
		field156 = null;
		field359 = null;
		field162 = null;
		field249 = null;
		field549 = null;
		field140 = null;
		field141 = null;
		field142 = null;
		field143 = null;
		field486 = null;
		field444 = null;
		field445 = null;
		field235 = null;
		field123 = null;
		field196 = null;
		field197 = null;
		field198 = null;
		field199 = null;
		field200 = null;

		try {
			if (field468 != null) {
				field468.method516();
			}
		} catch (Exception var1) {
		}

		field468 = null;
		field294 = null;
		field295 = null;
		field291 = null;
		field292 = null;
		field293 = null;
		field144 = null;
		field145 = null;
		field146 = null;
		field147 = null;
		field148 = null;
		field279 = null;

		if (field303 != null) {
			field303.field1085 = false;
		}

		field303 = null;
		field428 = null;
		field493 = null;
		field494 = null;
		field495 = null;
		field496 = null;
		field202 = null;
		field158 = null;
		field159 = null;
		field160 = null;
		field161 = null;
		field195 = null;
		field283 = null;
		field462 = null;
		field432 = null;
		field550 = null;
		field478 = null;
		field307 = null;
		field463 = null;
		field139 = null;
		field133 = null;
		field245 = null;
		field247 = null;
		field244 = null;
		field346 = null;
		field240 = null;
		field353 = null;
		field354 = null;
		method78();
		field552 = null;
		field553 = null;
		field554 = null;
		field542 = null;
		field543 = null;
		field544 = null;
		field545 = null;
		field546 = null;
		field237 = null;
		field364 = null;
		field362 = null;
		field335 = null;
		field508 = null;
		field132 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field509 = null;
		field475 = null;
		field296 = null;
		field297 = null;
		field298 = null;
		field299 = null;
		method79();
		WEJSKHXC.method557();
		QYNFXHXW.method510();
		LAMDVZMU.method374();
		VTUPBFSN.method547();
		HNBDHXHI.field823 = null;
		ZAYCIZYV.field1507 = null;
		LRXJQMAF.field930 = null;
		DVIZXFSW.field636 = null;
		XYSJIYWF.field1477 = null;
		XYSJIYWF.field1489 = null;
		SVMLNUSB.field1211 = null;
		field949 = null;
		BPHJJPRI.field64 = null;
		AOGYQUKT.method7();
		FKUDHMAZ.method278();
		OJGAHFXC.method409();
		MOOJSKCU.method393();
		System.gc();
	}

	@ObfuscatedName("client.a(LVTUPBFSN;I)Z")
	public final boolean method131(VTUPBFSN arg0) {
		int var2 = arg0.field1304;
		if (field327 == 2) {
			if (var2 == 201) {
				field189 = true;
				field467 = 0;
				field390 = true;
				field351 = "";
				field405 = 1;
				field560 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field189 = true;
				field467 = 0;
				field390 = true;
				field351 = "";
				field405 = 2;
				field560 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field399 = 250;
			return true;
		}

		if (var2 == 501) {
			field189 = true;
			field467 = 0;
			field390 = true;
			field351 = "";
			field405 = 4;
			field560 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field189 = true;
			field467 = 0;
			field390 = true;
			field351 = "";
			field405 = 5;
			field560 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field205[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = ZAYCIZYV.field1506 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= ZAYCIZYV.field1506) {
							var5 = 0;
						}
					}

					if (!ZAYCIZYV.field1507[var5].field1513 && ZAYCIZYV.field1507[var5].field1508 == var3 + (field524 ? 0 : 7)) {
						break;
					}
				}

				field205[var3] = var5;
				field371 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field213[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field138[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field138[var6].length) {
					var8 = 0;
				}
			}

			field213[var6] = var8;
			field371 = true;
		}

		if (var2 == 324 && !field524) {
			field524 = true;
			method180();
		}

		if (var2 == 325 && field524) {
			field524 = false;
			method180();
		}

		if (var2 == 326) {
			field283.method228(194);
			field283.method229(field524 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field283.method229(field205[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field283.method229(field213[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field525 = !field525;
		}

		if (var2 >= 601 && var2 <= 613) {
			method118();

			if (field243.length() > 0) {
				field283.method228(153);
				field283.method235(LBMFERBT.method380(field243));
				field283.method229(var2 - 601);
				field283.method229(field525 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method132() {
		while (true) {
			PKGIHVSX var1 = field308.method571();
			if (var1 == null) {
				return;
			}

			if (var1.field1104 == 0) {
				OJGAHFXC.method411(var1.field1103, var1.field1100);

				if ((field308.method570(var1.field1100) & 0x62) != 0) {
					field315 = true;

					if (field230 != -1 || field391 != -1) {
						field189 = true;
					}
				}
			}

			if (var1.field1104 == 1 && var1.field1103 != null) {
				MOOJSKCU.method392(var1.field1103);
			}

			if (var1.field1104 == 2 && field339 == var1.field1100 && var1.field1103 != null) {
				method103(field340, var1.field1103);
			}

			if (var1.field1104 == 3 && field262 == 1) {
				for (int var2 = 0; var2 < field300.length; var2++) {
					if (field342[var2] == var1.field1100) {
						field300[var2] = var1.field1103;

						if (var1.field1103 == null) {
							field342[var2] = -1;
						}

						break;
					}

					if (field343[var2] == var1.field1100) {
						field155[var2] = var1.field1103;

						if (var1.field1103 == null) {
							field343[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1104 == 93 && field308.method565(var1.field1100)) {
				PMIXOPWJ.method465(new EYMNCFMK(var1.field1103), field308);
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method133() {
		method98(20, "Starting up");

		if (signlink.sunjava) {
			field942 = 5;
		}

		if (field350) {
			field355 = true;
		} else {
			field350 = true;
			boolean var1 = false;
			String var2 = method129();
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
						field370[var3] = new ENNRILHF(signlink.cache_dat, var3 + 1, signlink.cache_idx[var3], 600000);
					}
				}

				try {
					method48();
					field290 = method46(field474[1], "title", 1, "title screen", 25);
					field401 = new FTIYCDAU("p11_full", field290, false);
					field402 = new FTIYCDAU("p12_full", field290, false);
					field403 = new FTIYCDAU("b12_full", field290, false);
					field404 = new FTIYCDAU("q8_full", field290, true);
					method76();
					method85();
					HBJEXSJX var4 = method46(field474[2], "config", 2, "config", 30);
					HBJEXSJX var5 = method46(field474[3], "interface", 3, "interface", 35);
					HBJEXSJX var6 = method46(field474[4], "media", 4, "2d graphics", 40);
					HBJEXSJX var7 = method46(field474[6], "textures", 6, "textures", 45);
					HBJEXSJX var8 = method46(field474[7], "wordenc", 7, "chat system", 50);
					HBJEXSJX var9 = method46(field474[8], "sounds", 8, "sound effects", 55);
					field162 = new byte[4][104][104];
					field359 = new int[4][105][105];
					field249 = new FKUDHMAZ(4, 104, field359, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field549[var10] = new ZGDLGUZR(104, 104);
					}

					field486 = new EFVUNBHT(512, 512);
					HBJEXSJX var11 = method46(field474[5], "versionlist", 5, "update list", 60);
					method98(60, "Connecting to update server");
					field308 = new XQFIPMSR();
					field308.method569(var11, this);
					MOOJSKCU.method391(field308.method573());
					OJGAHFXC.method410(field308.method560(0), field308);

					if (!field181) {
						field339 = 0;
						field340 = true;
						field308.method577(2, field339);

						while (field308.method575() > 0) {
							method132();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field308.field1441 > 3) {
								method113("ondemand");
								return;
							}
						}
					}

					method98(65, "Requesting animations");
					int var12 = field308.method560(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field308.method577(1, var13);
					}

					while (field308.method575() > 0) {
						int var14 = var12 - field308.method575();
						if (var14 > 0) {
							method98(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method132();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field308.field1441 > 3) {
							method113("ondemand");
							return;
						}
					}

					method98(70, "Requesting models");
					int var15 = field308.method560(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field308.method570(var16);
						if ((var17 & 0x1) != 0) {
							field308.method577(0, var16);
						}
					}

					int var18 = field308.method575();
					while (field308.method575() > 0) {
						int var19 = var18 - field308.method575();
						if (var19 > 0) {
							method98(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method132();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field370[0] != null) {
						method98(75, "Requesting maps");
						field308.method577(3, field308.method574(48, 0, 47));
						field308.method577(3, field308.method574(48, 1, 47));
						field308.method577(3, field308.method574(48, 0, 48));
						field308.method577(3, field308.method574(48, 1, 48));
						field308.method577(3, field308.method574(48, 0, 49));
						field308.method577(3, field308.method574(48, 1, 49));
						field308.method577(3, field308.method574(47, 0, 47));
						field308.method577(3, field308.method574(47, 1, 47));
						field308.method577(3, field308.method574(47, 0, 48));
						field308.method577(3, field308.method574(47, 1, 48));
						field308.method577(3, field308.method574(148, 0, 48));
						field308.method577(3, field308.method574(148, 1, 48));
						int var20 = field308.method575();
						while (field308.method575() > 0) {
							int var21 = var20 - field308.method575();
							if (var21 > 0) {
								method98(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method132();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field308.method560(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field308.method570(var23);
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
							field308.method563(0, var25, var23);
						}
					}

					field308.method568(field180);

					if (!field181) {
						int var26 = field308.method560(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field308.method579(var27)) {
								field308.method563(2, (byte) 1, var27);
							}
						}
					}

					int var28 = field308.method560(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field308.method570(var29);
						if (var30 == 0 && field308.field1447 < 100) {
							field308.method563(0, (byte) 1, var29);
						}
					}

					method98(80, "Unpacking media");
					field429 = new MRCVLIXG(var6, "invback", 0);
					field431 = new MRCVLIXG(var6, "chatback", 0);
					field430 = new MRCVLIXG(var6, "mapback", 0);
					field192 = new MRCVLIXG(var6, "backbase1", 0);
					field193 = new MRCVLIXG(var6, "backbase2", 0);
					field194 = new MRCVLIXG(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field279[var31] = new MRCVLIXG(var6, "sideicons", var31);
					}

					field237 = new EFVUNBHT(var6, "compass", 0);
					field304 = new EFVUNBHT(var6, "mapedge", 0);
					field304.method212();

					for (int var32 = 0; var32 < 72; var32++) {
						field550[var32] = new MRCVLIXG(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field478[var33] = new EFVUNBHT(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field364[var34] = new EFVUNBHT(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field362[var35] = new EFVUNBHT(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field335[var36] = new EFVUNBHT(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field508[var37] = new EFVUNBHT(var6, "headicons_hint", var37);
					}

					field428 = new EFVUNBHT(var6, "overlay_multiway", 0);
					field539 = new EFVUNBHT(var6, "mapmarker", 0);
					field540 = new EFVUNBHT(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field132[var38] = new EFVUNBHT(var6, "cross", var38);
					}

					field196 = new EFVUNBHT(var6, "mapdots", 0);
					field197 = new EFVUNBHT(var6, "mapdots", 1);
					field198 = new EFVUNBHT(var6, "mapdots", 2);
					field199 = new EFVUNBHT(var6, "mapdots", 3);
					field200 = new EFVUNBHT(var6, "mapdots", 4);
					field381 = new MRCVLIXG(var6, "scrollbar", 0);
					field382 = new MRCVLIXG(var6, "scrollbar", 1);
					field542 = new MRCVLIXG(var6, "redstone1", 0);
					field543 = new MRCVLIXG(var6, "redstone2", 0);
					field544 = new MRCVLIXG(var6, "redstone3", 0);
					field545 = new MRCVLIXG(var6, "redstone1", 0);
					field545.method398();
					field546 = new MRCVLIXG(var6, "redstone2", 0);
					field546.method398();
					field285 = new MRCVLIXG(var6, "redstone1", 0);
					field285.method399();
					field286 = new MRCVLIXG(var6, "redstone2", 0);
					field286.method399();
					field287 = new MRCVLIXG(var6, "redstone3", 0);
					field287.method399();
					field288 = new MRCVLIXG(var6, "redstone1", 0);
					field288.method398();
					field288.method399();
					field289 = new MRCVLIXG(var6, "redstone2", 0);
					field289.method398();
					field289.method399();

					for (int var39 = 0; var39 < 2; var39++) {
						field562[var39] = new MRCVLIXG(var6, "mod_icons", var39);
					}

					EFVUNBHT var40 = new EFVUNBHT(var6, "backleft1", 0);
					field140 = new YZGYDKDO(method57(), var40.field667, var40.field668);
					var40.method213(0, 0);
					EFVUNBHT var41 = new EFVUNBHT(var6, "backleft2", 0);
					field141 = new YZGYDKDO(method57(), var41.field667, var41.field668);
					var41.method213(0, 0);
					EFVUNBHT var42 = new EFVUNBHT(var6, "backright1", 0);
					field142 = new YZGYDKDO(method57(), var42.field667, var42.field668);
					var42.method213(0, 0);
					EFVUNBHT var43 = new EFVUNBHT(var6, "backright2", 0);
					field143 = new YZGYDKDO(method57(), var43.field667, var43.field668);
					var43.method213(0, 0);
					EFVUNBHT var44 = new EFVUNBHT(var6, "backtop1", 0);
					field144 = new YZGYDKDO(method57(), var44.field667, var44.field668);
					var44.method213(0, 0);
					EFVUNBHT var45 = new EFVUNBHT(var6, "backvmid1", 0);
					field145 = new YZGYDKDO(method57(), var45.field667, var45.field668);
					var45.method213(0, 0);
					EFVUNBHT var46 = new EFVUNBHT(var6, "backvmid2", 0);
					field146 = new YZGYDKDO(method57(), var46.field667, var46.field668);
					var46.method213(0, 0);
					EFVUNBHT var47 = new EFVUNBHT(var6, "backvmid3", 0);
					field147 = new YZGYDKDO(method57(), var47.field667, var47.field668);
					var47.method213(0, 0);
					EFVUNBHT var48 = new EFVUNBHT(var6, "backhmid2", 0);
					field148 = new YZGYDKDO(method57(), var48.field667, var48.field668);
					var48.method213(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field478[var53] != null) {
							field478[var53].method211(var50 + var52, var51 + var52, var49 + var52);
						}

						if (field550[var53] != null) {
							field550[var53].method400(var50 + var52, var51 + var52, var49 + var52);
						}
					}

					method98(83, "Unpacking textures");
					AOGYQUKT.method12(var7);
					AOGYQUKT.method16(0.8D);
					AOGYQUKT.method11(20);
					method98(86, "Unpacking config");
					DVIZXFSW.method206(var4);
					WEJSKHXC.method556(var4);
					HNBDHXHI.method349(var4);
					LAMDVZMU.method379(var4);
					QYNFXHXW.method509(var4);
					ZAYCIZYV.method587(var4);
					XYSJIYWF.method580(var4);
					SVMLNUSB.method522(var4);
					BVXCTZVJ.method44(var4);
					LAMDVZMU.field857 = field180;

					if (!field181) {
						method98(90, "Unpacking sounds");
						byte[] var54 = var9.method348("sounds.dat", null);
						EYMNCFMK var55 = new EYMNCFMK(var54);
						MYEMYBYY.method403(var55);
					}

					method98(95, "Unpacking interfaces");
					FTIYCDAU[] var56 = new FTIYCDAU[] { field401, field402, field403, field404 };
					VTUPBFSN.method541(var5, var6, var56);
					method98(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field430.field979[field430.field981 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field306[var57] = var58;
						field229[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field430.field979[field430.field981 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field338[var61 - 5] = var62 - 25;
						field165[var61 - 5] = var63 - var62;
					}

					AOGYQUKT.method9(765, 503);
					field314 = AOGYQUKT.field32;
					AOGYQUKT.method9(479, 96);
					field311 = AOGYQUKT.field32;
					AOGYQUKT.method9(190, 261);
					field312 = AOGYQUKT.field32;
					AOGYQUKT.method9(512, 334);
					field313 = AOGYQUKT.field32;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = AOGYQUKT.field30[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					FKUDHMAZ.method315(512, 500, 800, var65, 334);
					PPZVZYJC.method470(var8);
					field303 = new OUOWXDXZ(this);
					method139(field303, 10);
					EFJXCNIG.field659 = this;
					WEJSKHXC.field1406 = this;
					QYNFXHXW.field1138 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field349 + " " + field232);
					field489 = true;
				}
			} else {
				field305 = true;
			}
		}
	}

	@ObfuscatedName("client.D(I)Ljava/net/Socket;")
	public final Socket method134(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.f(II)V")
	public final void method135(int arg0) {
		if (arg0 >= 0) {
			int var2 = field158[arg0];
			int var3 = field159[arg0];
			int var4 = field160[arg0];
			int var5 = field161[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field467 != 0 && var4 != 1472) {
				field467 = 0;
				field189 = true;
			}

			if (var4 == 689) {
				field283.method228(84);
				field283.method264(var2);
				field283.method264(var5);
				field283.method266(var3);
				field451 = 0;
				field452 = var3;
				field453 = var2;
				field454 = 2;
				if (VTUPBFSN.method544(var3).field1309 == field406) {
					field454 = 1;
				}

				if (VTUPBFSN.method544(var3).field1309 == field230) {
					field454 = 3;
				}
			}

			if (var4 == 80) {
				field283.method228(146);
				field283.method230(var3);
				VTUPBFSN var6 = VTUPBFSN.method544(var3);
				if (var6.field1307 != null && var6.field1307[0][0] == 5) {
					int var7 = var6.field1307[0][1];
					if (field307[var7] != var6.field1308[0]) {
						field307[var7] = var6.field1308[0];
						method93(var7);
						field315 = true;
					}
				}
			}

			if (var4 == 229) {
				field283.method228(146);
				field283.method230(var3);
				VTUPBFSN var8 = VTUPBFSN.method544(var3);
				if (var8.field1307 != null && var8.field1307[0][0] == 5) {
					int var9 = var8.field1307[0][1];
					field307[var9] = 1 - field307[var9];
					method93(var9);
					field315 = true;
				}
			}

			if (var4 == 87) {
				boolean var10 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
				if (!var10) {
					method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
				}

				field413 = field963;
				field414 = field964;
				field416 = 2;
				field415 = 0;
				field283.method228(127);
				field283.method265(field318 + var2);
				field283.method230(var5);
				field283.method266(field319 + var3);
			}

			if (var4 == 925) {
				VTUPBFSN var12 = VTUPBFSN.method544(var3);
				field555 = 1;
				field556 = var3;
				field557 = var12.field1305;
				field126 = 0;
				field315 = true;
				String var13 = var12.field1331;
				if (var13.indexOf(" ") != -1) {
					var13 = var13.substring(0, var13.indexOf(" "));
				}

				String var14 = var12.field1331;
				if (var14.indexOf(" ") != -1) {
					var14 = var14.substring(var14.indexOf(" ") + 1);
				}

				field558 = var13 + " " + var12.field1362 + " " + var14;

				if (field557 == 16) {
					field315 = true;
					field345 = 3;
					field186 = true;
				}
			} else {
				if (var4 == 22) {
					field283.method228(245);
					field283.method264(var3);
					field283.method266(var2);
					field283.method266(var5);
					field451 = 0;
					field452 = var3;
					field453 = var2;
					field454 = 2;
					if (VTUPBFSN.method544(var3).field1309 == field406) {
						field454 = 1;
					}

					if (VTUPBFSN.method544(var3).field1309 == field230) {
						field454 = 3;
					}
				}

				if (var4 == 937) {
					method181(field391);
					field391 = -1;
					field189 = true;
				}

				if (var4 == 868) {
					boolean var15 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
					if (!var15) {
						method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
					}

					field413 = field963;
					field414 = field964;
					field416 = 2;
					field415 = 0;
					field283.method228(183);
					field283.method266(field319 + var3);
					field283.method266(var5);
					field283.method266(field318 + var2);
				}

				if (var4 == 734) {
					BPHJJPRI var17 = field218[var5];
					if (var17 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var17.field589[0], 0, 0, var17.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field380 += var5;
						if (field380 >= 131) {
							field283.method228(222);
							field283.method233(0);
							field380 = 0;
						}

						field283.method228(107);
						field283.method230(var5);
					}
				}

				if (var4 == 82 && method67(var5, var2, var3)) {
					field283.method228(191);
					field283.method265(field318 + var2);
					field283.method265(field128);
					field283.method230(field129);
					field283.method265(field319 + var3);
					field283.method265(var5 >> 14 & 0x7FFF);
					field283.method264(field127);
				}

				if (var4 == 652) {
					boolean var18 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
					if (!var18) {
						method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
					}

					field413 = field963;
					field414 = field964;
					field416 = 2;
					field415 = 0;
					field283.method228(227);
					field283.method265(field556);
					field283.method230(field319 + var3);
					field283.method266(var5);
					field283.method266(field318 + var2);
				}

				if (var4 == 10) {
					boolean var20 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
					if (!var20) {
						method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
					}

					field413 = field963;
					field414 = field964;
					field416 = 2;
					field415 = 0;
					field283.method228(111);
					field283.method230(var5);
					field283.method265(field318 + var2);
					field283.method264(field319 + var3);
				}

				if (var4 == 858) {
					field283.method228(68);
					field283.method264(var5);
					field283.method266(var3);
					field283.method265(var2);
					field451 = 0;
					field452 = var3;
					field453 = var2;
					field454 = 2;
					if (VTUPBFSN.method544(var3).field1309 == field406) {
						field454 = 1;
					}

					if (VTUPBFSN.method544(var3).field1309 == field230) {
						field454 = 3;
					}
				}

				if (var4 == 2) {
					KLQFDPHO var22 = field245[var5];
					if (var22 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var22.field589[0], 0, 0, var22.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(189);
						field283.method265(var5);
					}
				}

				if (var4 == 384) {
					KLQFDPHO var23 = field245[var5];
					if (var23 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var23.field589[0], 0, 0, var23.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(224);
						field283.method265(field128);
						field283.method230(field129);
						field283.method264(var5);
						field283.method230(field127);
					}
				}

				if (var4 == 842) {
					if (field523) {
						field249.method317(var3 - 4, var2 - 4);
					} else {
						field249.method317(field964 - 4, field963 - 4);
					}
				}

				if (var4 == 744) {
					if ((field318 & 0x3) == 0) {
						field511++;
					}

					if (field511 >= 117) {
						field283.method228(219);
						field283.method233(0);
						field511 = 0;
					}

					method67(var5, var2, var3);
					field283.method228(106);
					field283.method266(var5 >> 14 & 0x7FFF);
					field283.method265(field319 + var3);
					field283.method265(field318 + var2);
				}

				if (var4 == 546) {
					KLQFDPHO var24 = field245[var5];
					if (var24 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var24.field589[0], 0, 0, var24.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(248);
						field283.method265(var5);
					}
				}

				if (var4 == 959) {
					BPHJJPRI var25 = field218[var5];
					if (var25 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var25.field589[0], 0, 0, var25.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(220);
						field283.method266(field556);
						field283.method265(var5);
					}
				}

				if (var4 == 1498) {
					int var26 = var5 >> 14 & 0x7FFF;
					WEJSKHXC var27 = WEJSKHXC.method548(var26);
					String var28;
					if (var27.field1400 == null) {
						var28 = "It's a " + var27.field1388 + ".";
					} else {
						var28 = new String(var27.field1400);
					}

					method110(0, "", var28);
				}

				if (var4 == 767) {
					field283.method228(135);
					field283.method266(var5);
					field283.method265(var3);
					field283.method230(var2);
					field451 = 0;
					field452 = var3;
					field453 = var2;
					field454 = 2;
					if (VTUPBFSN.method544(var3).field1309 == field406) {
						field454 = 1;
					}

					if (VTUPBFSN.method544(var3).field1309 == field230) {
						field454 = 3;
					}
				}

				if (var4 == 149) {
					BPHJJPRI var29 = field218[var5];
					if (var29 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var29.field589[0], 0, 0, var29.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(216);
						field283.method266(field128);
						field283.method265(field129);
						field283.method230(var5);
						field283.method266(field127);
					}
				}

				if (var4 == 248) {
					BPHJJPRI var30 = field218[var5];
					if (var30 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var30.field589[0], 0, 0, var30.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field184 += var5;
						if (field184 >= 107) {
							field283.method228(103);
							field283.method230(43334);
							field184 = 0;
						}

						field283.method228(81);
						field283.method264(var5);
					}
				}

				if (var4 == 840) {
					KLQFDPHO var31 = field245[var5];
					if (var31 != null) {
						method160(1, field206.field589[0], 2, 1, 0, var31.field589[0], 0, 0, var31.field588[0], false, field206.field588[0]);
						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field328++;
						if (field328 >= 143) {
							field283.method228(122);
							field328 = 0;
						}

						field283.method228(163);
						field283.method265(var5);
					}
				}

				if (var4 == 974) {
					if ((var2 & 0x3) == 0) {
						field334++;
					}

					if (field334 >= 83) {
						field283.method228(193);
						field334 = 0;
					}

					field283.method228(90);
					field283.method265(var3);
					field283.method265(var2);
					field283.method266(var5);
					field451 = 0;
					field452 = var3;
					field453 = var2;
					field454 = 2;
					if (VTUPBFSN.method544(var3).field1309 == field406) {
						field454 = 1;
					}

					if (VTUPBFSN.method544(var3).field1309 == field230) {
						field454 = 3;
					}
				}

				if (var4 == 1695) {
					LAMDVZMU var32 = LAMDVZMU.method376(var5);
					VTUPBFSN var33 = VTUPBFSN.method544(var3);
					String var34;
					if (var33 != null && var33.field1365[var2] >= 100000) {
						var34 = var33.field1365[var2] + " x " + var32.field863;
					} else if (var32.field873 == null) {
						var34 = "It's a " + var32.field863 + ".";
					} else {
						var34 = new String(var32.field873);
					}

					method110(0, "", var34);
				}

				if (var4 == 499 && method67(var5, var2, var3)) {
					field283.method228(78);
					field283.method266(field319 + var3);
					field283.method265(field318 + var2);
					field283.method264(var5 >> 14 & 0x7FFF);
					field283.method265(field556);
				}

				if (var4 == 465 || var4 == 816 || var4 == 968 || var4 == 397) {
					String var35 = field195[arg0];
					int var36 = var35.indexOf("@whi@");
					if (var36 != -1) {
						long var37 = LBMFERBT.method380(var35.substring(var36 + 5).trim());
						if (var4 == 465) {
							method188(var37);
						}

						if (var4 == 816) {
							method120(var37);
						}

						if (var4 == 968) {
							method167(var37);
						}

						if (var4 == 397) {
							method128(var37);
						}
					}
				}

				if (var4 == 892) {
					method118();
				}

				if (var4 == 988) {
					field126 = 1;
					field127 = var2;
					field128 = var3;
					field129 = var5;
					field130 = String.valueOf(LAMDVZMU.method376(var5).field863);
					field555 = 0;
					field315 = true;
				} else {
					if (var4 == 254) {
						field283.method228(160);
						field283.method265(var2);
						field283.method230(var3);
						field283.method264(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 403) {
						field283.method228(46);
						field283.method265(field129);
						field283.method230(var3);
						field283.method266(field128);
						field283.method265(field127);
						field283.method264(var2);
						field283.method264(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 214) {
						String var39 = field195[arg0];
						int var40 = var39.indexOf("@whi@");
						if (var40 != -1) {
							if (field406 == -1) {
								method118();
								field243 = var39.substring(var40 + 5).trim();
								field525 = false;
								field514 = field406 = VTUPBFSN.field1318;
							} else {
								method110(0, "", "Please close the interface you have open before using 'report abuse'");
							}
						}
					}

					if (var4 == 599) {
						field283.method228(69);
						field283.method230(var2);
						field283.method265(var3);
						field283.method266(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 484) {
						if ((var2 & 0x3) == 0) {
							field363++;
						}

						if (field363 >= 63) {
							field283.method228(190);
							field283.method233(0);
							field363 = 0;
						}

						field283.method228(52);
						field283.method266(var2);
						field283.method264(var5);
						field283.method230(var3);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 109) {
						String var41 = field195[arg0];
						int var42 = var41.indexOf("@whi@");
						if (var42 != -1) {
							long var43 = LBMFERBT.method380(var41.substring(var42 + 5).trim());
							int var45 = -1;
							for (int var46 = 0; var46 < field326; var46++) {
								if (field139[var46] == var43) {
									var45 = var46;
									break;
								}
							}

							if (var45 != -1 && field133[var45] > 0) {
								field189 = true;
								field467 = 0;
								field390 = true;
								field351 = "";
								field405 = 3;
								field479 = field139[var45];
								field560 = "Enter message to send to " + field463[var45];
							}
						}
					}

					if (var4 == 743 || var4 == 485) {
						String var47 = field195[arg0];
						int var48 = var47.indexOf("@whi@");
						if (var48 != -1) {
							var47 = var47.substring(var48 + 5).trim();
							String var49 = LBMFERBT.method384(LBMFERBT.method381(LBMFERBT.method380(var47)));
							boolean var50 = false;
							for (int var51 = 0; var51 < field219; var51++) {
								BPHJJPRI var52 = field218[field220[var51]];
								if (var52 != null && var52.field79 != null && var52.field79.equalsIgnoreCase(var49)) {
									method160(1, field206.field589[0], 2, 1, 0, var52.field589[0], 0, 0, var52.field588[0], false, field206.field588[0]);

									if (var4 == 743) {
										field283.method228(32);
										field283.method265(field220[var51]);
									}

									if (var4 == 485) {
										field283.method228(182);
										field283.method265(field220[var51]);
									}

									var50 = true;
									break;
								}
							}

							if (!var50) {
								method110(0, "", "Unable to find " + var49);
							}
						}
					}

					if (var4 == 26) {
						method67(var5, var2, var3);
						field283.method228(131);
						field283.method265(field318 + var2);
						field283.method264(field319 + var3);
						field283.method230(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 131) {
						KLQFDPHO var53 = field245[var5];
						if (var53 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var53.field589[0], 0, 0, var53.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(149);
							field283.method264(var5);
						}
					}

					if (var4 == 705) {
						boolean var54 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
						if (!var54) {
							method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
						}

						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(58);
						field283.method230(field318 + var2);
						field283.method265(field319 + var3);
						field283.method266(var5);
					}

					if (var4 == 823) {
						boolean var56 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
						if (!var56) {
							method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
						}

						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(42);
						field283.method230(field128);
						field283.method266(var5);
						field283.method265(field129);
						field283.method264(field319 + var3);
						field283.method266(field127);
						field283.method230(field318 + var2);
					}

					if (var4 == 534) {
						field233++;
						if (field233 >= 82) {
							field283.method228(179);
							field283.method232(0x4D974A);
							field233 = 0;
						}

						method67(var5, var2, var3);
						field283.method228(28);
						field283.method264(field319 + var3);
						field283.method264(var5 >> 14 & 0x7FFF);
						field283.method266(field318 + var2);
					}

					if (var4 == 370) {
						BPHJJPRI var58 = field218[var5];
						if (var58 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var58.field589[0], 0, 0, var58.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(82);
							field283.method230(var5);
						}
					}

					if (var4 == 170) {
						BPHJJPRI var59 = field218[var5];
						if (var59 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var59.field589[0], 0, 0, var59.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(32);
							field283.method265(var5);
						}
					}

					if (var4 == 1163) {
						KLQFDPHO var60 = field245[var5];
						if (var60 != null) {
							QYNFXHXW var61 = var60.field854;
							if (var61.field1172 != null) {
								var61 = var61.method508();
							}

							if (var61 != null) {
								String var62;
								if (var61.field1165 == null) {
									var62 = "It's a " + var61.field1164 + ".";
								} else {
									var62 = new String(var61.field1165);
								}

								method110(0, "", var62);
							}
						}
					}

					if (var4 == 588) {
						KLQFDPHO var63 = field245[var5];
						if (var63 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var63.field589[0], 0, 0, var63.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(238);
							field283.method265(var5);
						}
					}

					if (var4 == 139) {
						field283.method228(62);
						field283.method264(var3);
						field283.method265(field556);
						field283.method265(var2);
						field283.method265(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 715) {
						VTUPBFSN var64 = VTUPBFSN.method544(var3);
						boolean var65 = true;
						if (var64.field1304 > 0) {
							var65 = method131(var64);
						}

						if (var65) {
							field283.method228(146);
							field283.method230(var3);
						}
					}

					if (var4 == 564) {
						BPHJJPRI var66 = field218[var5];
						if (var66 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var66.field589[0], 0, 0, var66.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(182);
							field283.method265(var5);
						}
					}

					if (var4 == 1937) {
						LAMDVZMU var67 = LAMDVZMU.method376(var5);
						String var68;
						if (var67.field873 == null) {
							var68 = "It's a " + var67.field863 + ".";
						} else {
							var68 = new String(var67.field873);
						}

						method110(0, "", var68);
					}

					if (var4 == 642) {
						boolean var69 = method160(0, field206.field589[0], 2, 0, 0, var3, 0, 0, var2, false, field206.field588[0]);
						if (!var69) {
							method160(1, field206.field589[0], 2, 1, 0, var3, 0, 0, var2, false, field206.field588[0]);
						}

						field413 = field963;
						field414 = field964;
						field416 = 2;
						field415 = 0;
						field283.method228(252);
						field283.method266(field319 + var3);
						field283.method264(field318 + var2);
						field283.method264(var5);
					}

					if (var4 == 328 && !field522) {
						field283.method228(95);
						field283.method230(var3);
						field522 = true;
					}

					if (var4 == 533) {
						field283.method228(192);
						field283.method230(var3);
						field283.method264(var2);
						field283.method230(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 400) {
						method67(var5, var2, var3);
						field283.method228(143);
						field283.method265(field319 + var3);
						field283.method266(var5 >> 14 & 0x7FFF);
						field283.method265(field318 + var2);
					}

					if (var4 == 471) {
						KLQFDPHO var71 = field245[var5];
						if (var71 != null) {
							method160(1, field206.field589[0], 2, 1, 0, var71.field589[0], 0, 0, var71.field588[0], false, field206.field588[0]);
							field413 = field963;
							field414 = field964;
							field416 = 2;
							field415 = 0;
							field283.method228(180);
							field283.method264(field556);
							field283.method264(var5);
						}
					}

					if (var4 == 851) {
						field283.method228(242);
						field283.method266(var2);
						field283.method230(var5);
						field283.method230(var3);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (VTUPBFSN.method544(var3).field1309 == field406) {
							field454 = 1;
						}

						if (VTUPBFSN.method544(var3).field1309 == field230) {
							field454 = 3;
						}
					}

					if (var4 == 1039) {
						method67(var5, var2, var3);
						field283.method228(1);
						field283.method265(field319 + var3);
						field283.method264(var5 >> 14 & 0x7FFF);
						field283.method266(field318 + var2);
					}

					field126 = 0;
					field555 = 0;
					field315 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method136(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field324[var4] != null) {
				int var5 = field322[var4];
				int var6 = field227 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field323[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field183 == 0 || field183 == 1 && method124(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field206.field79)) {
						if (field477 >= 1) {
							field195[field487] = "Report abuse @whi@" + var7;
							field160[field487] = 214;
							field487++;
						}

						field195[field487] = "Add ignore @whi@" + var7;
						field160[field487] = 816;
						field487++;
						field195[field487] = "Add friend @whi@" + var7;
						field160[field487] = 465;
						field487++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field383 == 0 && (var5 == 7 || field516 == 0 || field516 == 1 && method124(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field477 >= 1) {
							field195[field487] = "Report abuse @whi@" + var7;
							field160[field487] = 214;
							field487++;
						}

						field195[field487] = "Add ignore @whi@" + var7;
						field160[field487] = 816;
						field487++;
						field195[field487] = "Add friend @whi@" + var7;
						field160[field487] = 465;
						field487++;
					}

					var3++;
				}

				if (var5 == 4 && (field337 == 0 || field337 == 1 && method124(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field195[field487] = "Accept trade @whi@" + var7;
						field160[field487] = 743;
						field487++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field383 == 0 && field516 < 2) {
					var3++;
				}

				if (var5 == 8 && (field337 == 0 || field337 == 1 && method124(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field195[field487] = "Accept challenge @whi@" + var7;
						field160[field487] = 485;
						field487++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method137() {
		WEJSKHXC.field1401.method533();
		WEJSKHXC.field1403.method533();
		QYNFXHXW.field1147.method533();
		LAMDVZMU.field878.method533();
		LAMDVZMU.field859.method533();
		BPHJJPRI.field64.method533();
		XYSJIYWF.field1489.method533();
	}

	@ObfuscatedName("client.F(I)V")
	public final void method138() {
		if (field367 == 0) {
			field195[0] = "Cancel";
			field160[0] = 1472;
			field487 = 1;
			if (field537 == -1) {
				method126();
				field459 = 0;
				field535 = 0;

				if (field956 > 4 && field957 > 4 && field956 < 516 && field957 < 338) {
					if (field406 == -1) {
						method112();
					} else {
						method182(0, 0, field956, VTUPBFSN.method544(field406), 4, field957, 4);
					}
				}

				if (field459 != field236) {
					field236 = field459;
				}

				if (field535 != field136) {
					field136 = field535;
				}

				field459 = 0;
				field535 = 0;

				if (field956 > 553 && field957 > 205 && field956 < 743 && field957 < 466) {
					if (field329 != -1) {
						method182(1, 0, field956, VTUPBFSN.method544(field329), 553, field957, 205);
					} else if (field548[field345] != -1) {
						method182(1, 0, field956, VTUPBFSN.method544(field548[field345]), 553, field957, 205);
					}
				}

				if (field459 != field384) {
					field315 = true;
					field384 = field459;
				}

				if (field535 != field529) {
					field315 = true;
					field529 = field535;
				}

				field459 = 0;
				field535 = 0;

				if (field956 > 17 && field957 > 357 && field956 < 496 && field957 < 453) {
					if (field230 != -1) {
						method182(2, 0, field956, VTUPBFSN.method544(field230), 17, field957, 357);
					} else if (field391 != -1) {
						method182(3, 0, field956, VTUPBFSN.method544(field391), 17, field957, 357);
					} else if (field957 < 434 && field956 < 426 && field467 == 0) {
						method136(field957 - 357, field956 - 17);
					}
				}

				if ((field230 != -1 || field391 != -1) && field476 != field459) {
					field189 = true;
					field476 = field459;
				}

				if ((field230 != -1 || field391 != -1) && field535 != field482) {
					field189 = true;
					field482 = field535;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field487 - 1; var2++) {
						if (field160[var2] < 1000 && field160[var2 + 1] > 1000) {
							String var3 = field195[var2];
							field195[var2] = field195[var2 + 1];
							field195[var2 + 1] = var3;
							int var4 = field160[var2];
							field160[var2] = field160[var2 + 1];
							field160[var2 + 1] = var4;
							int var5 = field158[var2];
							field158[var2] = field158[var2 + 1];
							field158[var2 + 1] = var5;
							int var6 = field159[var2];
							field159[var2] = field159[var2 + 1];
							field159[var2 + 1] = var6;
							int var7 = field161[var2];
							field161[var2] = field161[var2 + 1];
							field161[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field459 = 0;
				field535 = 0;
				method182(0, 0, field956, VTUPBFSN.method544(field537), 0, field957, 0);

				if (field459 != field236) {
					field236 = field459;
				}

				if (field535 != field136) {
					field136 = field535;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method139(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method139(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method140() {
		if (field487 >= 2 || field126 != 0 || field555 != 0) {
			String var1;
			if (field126 == 1 && field487 < 2) {
				var1 = "Use " + field130 + " with...";
			} else if (field555 == 1 && field487 < 2) {
				var1 = field558 + "...";
			} else {
				var1 = field195[field487 - 1];
			}

			if (field487 > 2) {
				var1 = var1 + "@whi@ / " + (field487 - 2) + " more options";
			}

			field403.method340(var1, 15, true, 0xFFFFFF, 4, field531 / 1000);
		}
	}

	@ObfuscatedName("client.a(ILEYMNCFMK;I)V")
	public final void method141(EYMNCFMK arg0, int arg1) {
		while (arg0.field680 + 10 < arg1 * 8) {
			int var3 = arg0.method250(11);
			if (var3 == 2047) {
				break;
			}

			if (field218[var3] == null) {
				field218[var3] = new BPHJJPRI();
				if (field223[var3] != null) {
					field218[var3].method39(field223[var3]);
				}
			}

			field220[field219++] = var3;
			BPHJJPRI var4 = field218[var3];
			var4.field608 = field531;
			int var5 = arg0.method250(1);
			if (var5 == 1) {
				field222[field221++] = var3;
			}

			int var6 = arg0.method250(1);
			int var7 = arg0.method250(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method250(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method195(var6 == 1, field206.field589[0] + var7, field206.field588[0] + var8);
		}

		arg0.method251();
	}

	@ObfuscatedName("client.a(LEFVUNBHT;IIB)V")
	public final void method142(EFVUNBHT arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field408 + field170 & 0x7FF;
			int var6 = OJGAHFXC.field1080[var5];
			int var7 = OJGAHFXC.field1081[var5];
			var6 = var6 * 256 / (field469 + 256);
			var7 = var7 * 256 / (field469 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field304.method220(15, 20, 20, 15, var10, 256, 83 - var13 - 20, var12 + 94 + 4 - 10);
		} else {
			method186(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.b(ILEYMNCFMK;I)V")
	public final void method143(int arg0, EYMNCFMK arg1) {
		if (arg0 == 213) {
			int var3 = arg1.method259();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field441[var4];
			int var7 = arg1.method258();
			int var8 = (var7 >> 4 & 0x7) + field214;
			int var9 = (var7 & 0x7) + field215;
			int var10 = arg1.method268();
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
				int var11 = field359[field238][var8][var9];
				int var12 = field359[field238][var8 + 1][var9];
				int var13 = field359[field238][var8 + 1][var9 + 1];
				int var14 = field359[field238][var8][var9 + 1];
				if (var6 == 0) {
					OUUFKBAN var15 = field249.method301(field238, var9, var8);
					if (var15 != null) {
						int var16 = var15.field1097 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var15.field1095 = new EFJXCNIG(var14, var13, var10, var12, var11, var5 + 4, var16, false, 2);
							var15.field1096 = new EFJXCNIG(var14, var13, var10, var12, var11, var5 + 1 & 0x3, var16, false, 2);
						} else {
							var15.field1095 = new EFJXCNIG(var14, var13, var10, var12, var11, var5, var16, false, var4);
						}
					}
				}

				if (var6 == 1) {
					TOOUJYTT var17 = field249.method302(field238, var9, var8);
					if (var17 != null) {
						var17.field1238 = new EFJXCNIG(var14, var13, var10, var12, var11, 0, var17.field1239 >> 14 & 0x7FFF, false, 4);
					}
				}

				if (var6 == 2) {
					TRVUEEOS var18 = field249.method303(field238, var8, var9);

					if (var4 == 11) {
						var4 = 10;
					}

					if (var18 != null) {
						var18.field1245 = new EFJXCNIG(var14, var13, var10, var12, var11, var5, var18.field1253 >> 14 & 0x7FFF, false, var4);
					}
				}

				if (var6 == 3) {
					HVZTJKWS var19 = field249.method304(var8, field238, var9);
					if (var19 != null) {
						var19.field843 = new EFJXCNIG(var14, var13, var10, var12, var11, var5, var19.field844 >> 14 & 0x7FFF, false, 22);
					}
				}
			}
		} else if (arg0 == 22) {
			int var20 = arg1.method239();
			int var21 = (var20 >> 4 & 0x7) + field214;
			int var22 = (var20 & 0x7) + field215;
			int var23 = arg1.method241();
			int var24 = arg1.method241();
			int var25 = arg1.method241();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				DMMTBJKZ var26 = field509[field238][var21][var22];
				if (var26 != null) {
					for (UTHWSBEX var27 = (UTHWSBEX) var26.method200(); var27 != null; var27 = (UTHWSBEX) var26.method202()) {
						if ((var23 & 0x7FFF) == var27.field1299 && var27.field1298 == var24) {
							var27.field1298 = var25;
							break;
						}
					}

					method69(var21, var22);
				}
			}
		} else {
			if (arg0 == 8) {
				int var28 = arg1.method239();
				int var29 = (var28 >> 4 & 0x7) + field214;
				int var30 = (var28 & 0x7) + field215;
				int var31 = arg1.method241();
				int var32 = arg1.method239();
				int var33 = var32 >> 4 & 0xF;
				int var34 = var32 & 0x7;
				if (field206.field588[0] >= var29 - var33 && field206.field588[0] <= var29 + var33 && field206.field589[0] >= var30 - var33 && field206.field589[0] <= var30 + var33 && field239 && !field181 && field465 < 50) {
					field164[field465] = var31;
					field528[field465] = var34;
					field442[field465] = MYEMYBYY.field988[var31];
					field465++;
				}
			}

			if (arg0 == 102) {
				int var35 = arg1.method239();
				int var36 = (var35 >> 4 & 0x7) + field214;
				int var37 = (var35 & 0x7) + field215;
				int var38 = var36 + arg1.method240();
				int var39 = var37 + arg1.method240();
				int var40 = arg1.method242();
				int var41 = arg1.method241();
				int var42 = arg1.method239() * 4;
				int var43 = arg1.method239() * 4;
				int var44 = arg1.method241();
				int var45 = arg1.method241();
				int var46 = arg1.method239();
				int var47 = arg1.method239();
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var41 != 0xFFFF) {
					var36 = var36 * 128 + 64;
					var37 = var37 * 128 + 64;
					var38 = var38 * 128 + 64;
					var39 = var39 * 128 + 64;
					BSBQPUWL var48 = new BSBQPUWL(var40, var43, field531 + var44, field238, var41, var36, var37, field531 + var45, var47, var46, method184(field238, var36, var37) - var42);
					var48.method43(var39, method184(field238, var38, var39) - var43, field531 + var44, var38);
					field498.method197(var48);
				}
			} else if (arg0 == 61) {
				int var49 = arg1.method239();
				int var50 = (var49 >> 4 & 0x7) + field214;
				int var51 = (var49 & 0x7) + field215;
				int var52 = arg1.method258();
				int var53 = var52 >> 2;
				int var54 = var52 & 0x3;
				int var55 = field441[var53];
				if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
					method173(var50, var53, var51, 0, var54, var55, field238, -1, -1);
				}
			} else if (arg0 == 212) {
				int var56 = arg1.method268();
				int var57 = arg1.method259();
				int var58 = (var57 >> 4 & 0x7) + field214;
				int var59 = (var57 & 0x7) + field215;
				if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
					DMMTBJKZ var60 = field509[field238][var58][var59];
					if (var60 != null) {
						for (UTHWSBEX var61 = (UTHWSBEX) var60.method200(); var61 != null; var61 = (UTHWSBEX) var60.method202()) {
							if ((var56 & 0x7FFF) == var61.field1299) {
								var61.method205();
								break;
							}
						}

						if (var60.method200() == null) {
							field509[field238][var58][var59] = null;
						}

						method69(var58, var59);
					}
				}
			} else if (arg0 == 197) {
				int var62 = arg1.method239();
				int var63 = (var62 >> 4 & 0x7) + field214;
				int var64 = (var62 & 0x7) + field215;
				int var65 = arg1.method241();
				int var66 = arg1.method239();
				int var67 = arg1.method241();
				if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
					var63 = var63 * 128 + 64;
					var64 = var64 * 128 + 64;
					AEQBPGLT var68 = new AEQBPGLT(var63, field238, var65, var67, field531, var64, method184(field238, var63, var64) - var66);
					field156.method197(var68);
				}
			} else if (arg0 == 222) {
				int var69 = arg1.method268();
				int var70 = arg1.method258();
				int var71 = (var70 >> 4 & 0x7) + field214;
				int var72 = (var70 & 0x7) + field215;
				int var73 = arg1.method269();
				if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
					UTHWSBEX var74 = new UTHWSBEX();
					var74.field1299 = var69;
					var74.field1298 = var73;

					if (field509[field238][var71][var72] == null) {
						field509[field238][var71][var72] = new DMMTBJKZ();
					}

					field509[field238][var71][var72].method197(var74);
					method69(var71, var72);
				}
			} else if (arg0 == 225) {
				int var75 = arg1.method260();
				int var76 = var75 >> 2;
				int var77 = var75 & 0x3;
				int var78 = field441[var76];
				int var79 = arg1.method269();
				int var80 = arg1.method239();
				int var81 = (var80 >> 4 & 0x7) + field214;
				int var82 = (var80 & 0x7) + field215;
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
					method173(var81, var76, var82, 0, var77, var78, field238, -1, var79);
				}
			} else if (arg0 == 255) {
				int var83 = arg1.method269();
				int var84 = arg1.method239();
				int var85 = (var84 >> 4 & 0x7) + field214;
				int var86 = (var84 & 0x7) + field215;
				int var87 = arg1.method241();
				int var88 = arg1.method268();
				if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && field473 != var87) {
					UTHWSBEX var89 = new UTHWSBEX();
					var89.field1299 = var83;
					var89.field1298 = var88;

					if (field509[field238][var85][var86] == null) {
						field509[field238][var85][var86] = new DMMTBJKZ();
					}

					field509[field238][var85][var86].method197(var89);
					method69(var85, var86);
				}
			} else if (arg0 == 99) {
				int var90 = arg1.method241();
				byte var91 = arg1.method261();
				int var92 = arg1.method258();
				int var93 = var92 >> 2;
				int var94 = var92 & 0x3;
				int var95 = field441[var93];
				int var96 = arg1.method268();
				byte var97 = arg1.method263();
				int var98 = arg1.method269();
				byte var99 = arg1.method262();
				int var100 = arg1.method267();
				int var101 = arg1.method239();
				int var102 = (var101 >> 4 & 0x7) + field214;
				int var103 = (var101 & 0x7) + field215;
				byte var104 = arg1.method261();
				BPHJJPRI var105;
				if (field473 == var100) {
					var105 = field206;
				} else {
					var105 = field218[var100];
				}

				if (var105 != null) {
					WEJSKHXC var106 = WEJSKHXC.method548(var98);
					int var107 = field359[field238][var102][var103];
					int var108 = field359[field238][var102 + 1][var103];
					int var109 = field359[field238][var102 + 1][var103 + 1];
					int var110 = field359[field238][var102][var103 + 1];
					OJGAHFXC var111 = var106.method549(var93, var94, var107, var108, var109, var110, -1);
					if (var111 != null) {
						method173(var102, 0, var103, var96 + 1, 0, var95, field238, var90 + 1, -1);
						var105.field58 = field531 + var96;
						var105.field59 = field531 + var90;
						var105.field77 = var111;
						int var112 = var106.field1399;
						int var113 = var106.field1408;
						if (var94 == 1 || var94 == 3) {
							var112 = var106.field1408;
							var113 = var106.field1399;
						}

						var105.field74 = var102 * 128 + var112 * 64;
						var105.field76 = var103 * 128 + var113 * 64;
						var105.field75 = method184(field238, var105.field74, var105.field76);

						if (var91 > var99) {
							byte var114 = var91;
							var91 = var99;
							var99 = var114;
						}

						if (var104 > var97) {
							byte var115 = var104;
							var104 = var97;
							var97 = var115;
						}

						var105.field68 = var91 + var102;
						var105.field70 = var99 + var102;
						var105.field69 = var103 + var104;
						var105.field71 = var97 + var103;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method144() {
		field493.method584();
		AOGYQUKT.field32 = field312;
		field429.method401(0, 0);

		if (field329 != -1) {
			method125(0, 0, 0, VTUPBFSN.method544(field329));
		} else if (field548[field345] != -1) {
			method125(0, 0, 0, VTUPBFSN.method544(field548[field345]));
		}

		if (field523 && field446 == 1) {
			method49();
		}

		field493.method585(field948, 205, 553);
		field495.method584();
		AOGYQUKT.field32 = field313;
	}

	@ObfuscatedName("client.c(ILEYMNCFMK;I)V")
	public final void method145(EYMNCFMK arg0, int arg1) {
		arg0.method249();
		int var3 = arg0.method250(8);
		if (var3 < field246) {
			for (int var4 = var3; var4 < field246; var4++) {
				field519[field518++] = field247[var4];
			}
		}

		if (var3 > field246) {
			signlink.reporterror(field152 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field246 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field247[var5];
			KLQFDPHO var7 = field245[var6];
			int var8 = arg0.method250(1);
			if (var8 == 0) {
				field247[field246++] = var6;
				var7.field608 = field531;
			} else {
				int var9 = arg0.method250(2);
				if (var9 == 0) {
					field247[field246++] = var6;
					var7.field608 = field531;
					field222[field221++] = var6;
				} else if (var9 == 1) {
					field247[field246++] = var6;
					var7.field608 = field531;
					int var10 = arg0.method250(3);
					var7.method196(false, var10);
					int var11 = arg0.method250(1);
					if (var11 == 1) {
						field222[field221++] = var6;
					}
				} else if (var9 == 2) {
					field247[field246++] = var6;
					var7.field608 = field531;
					int var12 = arg0.method250(3);
					var7.method196(true, var12);
					int var13 = arg0.method250(3);
					var7.method196(true, var13);
					int var14 = arg0.method250(1);
					if (var14 == 1) {
						field222[field221++] = var6;
					}
				} else if (var9 == 3) {
					field519[field518++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)I")
	public final int method146() {
		int var1 = 3;
		if (field503 < 310) {
			int var2 = field500 >> 7;
			int var3 = field502 >> 7;
			int var4 = field206.field584 >> 7;
			int var5 = field206.field585 >> 7;

			if ((field162[field238][var2][var3] & 0x4) != 0) {
				var1 = field238;
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

					if ((field162[field238][var2][var3] & 0x4) != 0) {
						var1 = field238;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field162[field238][var2][var3] & 0x4) != 0) {
							var1 = field238;
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

					if ((field162[field238][var2][var3] & 0x4) != 0) {
						var1 = field238;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field162[field238][var2][var3] & 0x4) != 0) {
							var1 = field238;
						}
					}
				}
			}
		}

		if ((field162[field238][field206.field584 >> 7][field206.field585 >> 7] & 0x4) != 0) {
			var1 = field238;
		}

		return var1;
	}

	@ObfuscatedName("client.I(I)I")
	public final int method147() {
		int var1 = method184(field238, field500, field502);
		if (var1 - field501 < 800 && (field162[field238][field500 >> 7][field502 >> 7] & 0x4) != 0) {
			return field238;
		}

		return 3;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method148() {
		field377 = 0;
		int var1 = (field206.field584 >> 7) + field318;
		int var2 = (field206.field585 >> 7) + field319;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field377 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field377 = 1;
		}

		if (field377 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field377 = 0;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method149() {
		if (field262 == 2) {
			for (CUNQMRTU var1 = (CUNQMRTU) field475.method200(); var1 != null; var1 = (CUNQMRTU) field475.method202()) {
				if (var1.field567 > 0) {
					var1.field567--;
				}

				if (var1.field567 != 0) {
					if (var1.field571 > 0) {
						var1.field571--;
					}

					if (var1.field571 == 0 && var1.field565 >= 1 && var1.field566 >= 1 && var1.field565 <= 102 && var1.field566 <= 102 && (var1.field568 < 0 || PMIXOPWJ.method462(var1.field570, var1.field568))) {
						method55(var1.field563, var1.field568, var1.field564, var1.field565, var1.field570, var1.field569, var1.field566);
						var1.field571 = -1;

						if (var1.field572 == var1.field568 && var1.field572 == -1) {
							var1.method205();
						} else if (var1.field572 == var1.field568 && var1.field573 == var1.field569 && var1.field574 == var1.field570) {
							var1.method205();
						}
					}
				} else if (var1.field572 < 0 || PMIXOPWJ.method462(var1.field574, var1.field572)) {
					method55(var1.field563, var1.field572, var1.field564, var1.field565, var1.field574, var1.field573, var1.field566);
					var1.method205();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = OJGAHFXC.field1080[var7];
			int var13 = OJGAHFXC.field1081[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = OJGAHFXC.field1080[var8];
			int var16 = OJGAHFXC.field1081[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field500 = arg2 - var9;
		field501 = arg3 - var10;
		field502 = arg4 - var11;
		field503 = arg5;
		field504 = arg1;
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field249.method305(arg1, arg2, arg3);
		if (var6 != 0) {
			int var7 = field249.method309(arg1, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field486.field666;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			WEJSKHXC var14 = WEJSKHXC.method548(var13);
			if (var14.field1390 == -1) {
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
				MRCVLIXG var15 = field550[var14.field1390];
				if (var15 != null) {
					int var16 = (var14.field1399 * 4 - var15.field981) / 2;
					int var17 = (var14.field1408 * 4 - var15.field982) / 2;
					var15.method401(arg2 * 4 + var16 + 48, (104 - arg3 - var14.field1408) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field249.method307(arg1, arg2, arg3);
		if (var18 != 0) {
			int var19 = field249.method309(arg1, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			WEJSKHXC var23 = WEJSKHXC.method548(var22);
			if (var23.field1390 != -1) {
				MRCVLIXG var24 = field550[var23.field1390];
				if (var24 != null) {
					int var25 = (var23.field1399 * 4 - var24.field981) / 2;
					int var26 = (var23.field1408 * 4 - var24.field982) / 2;
					var24.method401(arg2 * 4 + var25 + 48, (104 - arg3 - var23.field1408) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field486.field666;
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

		int var30 = field249.method308(arg1, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			WEJSKHXC var32 = WEJSKHXC.method548(var31);
			if (var32.field1390 != -1) {
				MRCVLIXG var33 = field550[var32.field1390];
				if (var33 != null) {
					int var34 = (var32.field1399 * 4 - var33.field981) / 2;
					int var35 = (var32.field1408 * 4 - var33.field982) / 2;
					var33.method401(arg2 * 4 + var34 + 48, (104 - arg3 - var32.field1408) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method152(int arg0) {
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

	@ObfuscatedName("client.a(IZZ)V")
	public final void method153(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILVTUPBFSN;)V")
	public final void method154(VTUPBFSN arg0) {
		int var2 = arg0.field1304;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field327 == 0) {
				arg0.field1360 = "Loading friend list";
				arg0.field1301 = 0;
			} else if (var2 == 1 && field327 == 1) {
				arg0.field1360 = "Connecting to friendserver";
				arg0.field1301 = 0;
			} else if (var2 == 2 && field327 != 2) {
				arg0.field1360 = "Please wait...";
				arg0.field1301 = 0;
			} else {
				int var3 = field326;
				if (field327 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1360 = "";
					arg0.field1301 = 0;
				} else {
					arg0.field1360 = field463[var2];
					arg0.field1301 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field326;
			if (field327 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1360 = "";
				arg0.field1301 = 0;
			} else {
				if (field133[var2] == 0) {
					arg0.field1360 = "@red@Offline";
				} else if (field133[var2] < 200) {
					if (field133[var2] == field178) {
						arg0.field1360 = "@gre@World" + (field133[var2] - 9);
					} else {
						arg0.field1360 = "@yel@World" + (field133[var2] - 9);
					}
				} else if (field133[var2] == field178) {
					arg0.field1360 = "@gre@Classic" + (field133[var2] - 219);
				} else {
					arg0.field1360 = "@yel@Classic" + (field133[var2] - 219);
				}

				arg0.field1301 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field326;
			if (field327 != 2) {
				var5 = 0;
			}

			arg0.field1303 = var5 * 15 + 20;
			if (arg0.field1303 <= arg0.field1306) {
				arg0.field1303 = arg0.field1306 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field327 == 0) {
				arg0.field1360 = "Loading ignore list";
				arg0.field1301 = 0;
			} else if (var2 == 1 && field327 == 0) {
				arg0.field1360 = "Please wait...";
				arg0.field1301 = 0;
			} else {
				int var6 = field201;
				if (field327 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1360 = "";
					arg0.field1301 = 0;
				} else {
					arg0.field1360 = LBMFERBT.method384(LBMFERBT.method381(field348[var2]));
					arg0.field1301 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1303 = field201 * 15 + 20;
			if (arg0.field1303 <= arg0.field1306) {
				arg0.field1303 = arg0.field1306 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1354 = 150;
			arg0.field1355 = (int) (Math.sin(field531 / 40.0D) * 256.0D) & 0x7FF;

			if (field371) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field205[var7];
					if (var8 >= 0 && !ZAYCIZYV.field1507[var8].method589()) {
						return;
					}
				}

				field371 = false;
				OJGAHFXC[] var9 = new OJGAHFXC[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field205[var11];
					if (var12 >= 0) {
						var9[var10++] = ZAYCIZYV.field1507[var12].method590();
					}
				}

				OJGAHFXC var13 = new OJGAHFXC(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field213[var14] != 0) {
						var13.method427(field138[var14][0], field138[var14][field213[var14]]);

						if (var14 == 1) {
							var13.method427(field559[0], field559[field213[var14]]);
						}
					}
				}

				var13.method420();
				var13.method421(DVIZXFSW.field636[field206.field620].field638[0]);
				var13.method430(64, 850, -30, -50, -30, true);
				arg0.field1351 = 5;
				arg0.field1352 = 0;
				VTUPBFSN.method540(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field438 == null) {
				field438 = arg0.field1330;
				field439 = arg0.field1350;
			}

			if (field524) {
				arg0.field1330 = field439;
			} else {
				arg0.field1330 = field438;
			}
		} else if (var2 == 325) {
			if (field438 == null) {
				field438 = arg0.field1330;
				field439 = arg0.field1350;
			}

			if (field524) {
				arg0.field1330 = field438;
			} else {
				arg0.field1330 = field439;
			}
		} else if (var2 == 600) {
			arg0.field1360 = field243;
			if (field531 % 20 < 10) {
				arg0.field1360 = arg0.field1360 + "|";
			} else {
				arg0.field1360 = arg0.field1360 + " ";
			}
		} else if (var2 == 620) {
			if (field477 < 1) {
				arg0.field1360 = "";
			} else if (field525) {
				arg0.field1321 = 0xFF0000;
				arg0.field1360 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1321 = 0xFFFFFF;
				arg0.field1360 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field490 - field253;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1360 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field119 == 0) {
				arg0.field1360 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field119 <= field490) {
				arg0.field1360 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method155(field119);
			} else {
				int var17 = field490 + 14 - field119;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1360 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method155(field119) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field248 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field248 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field248 + " unread messages";
			}

			arg0.field1360 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field515 > 0 && field515 <= field490 + 10) {
				arg0.field1360 = "Last password change:\\n@gre@" + method155(field515);
			} else {
				arg0.field1360 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field458 > 2 && !field180) {
				arg0.field1360 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field458 > 2) {
				arg0.field1360 = "\\n\\nYou have @gre@" + field458 + "@yel@ days of\\nmember credit remaining.";
			} else if (field458 > 0) {
				arg0.field1360 = "You have @gre@" + field458 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1360 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field458 > 2 && !field180) {
				arg0.field1360 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field458 > 0) {
				arg0.field1360 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1360 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field119 > field490) {
				arg0.field1360 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1360 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method155(int arg0) {
		if (arg0 > field490 + 10) {
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

	@ObfuscatedName("client.h(II)V")
	public final void method156(int arg0) {
		int[] var2 = field486.field666;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field162[arg0][var7][var5] & 0x18) == 0) {
					field249.method314(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field162[arg0 + 1][var7][var5] & 0x8) != 0) {
					field249.method314(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field486.method210();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field162[arg0][var11][var10] & 0x18) == 0) {
					method151(var8, arg0, var11, var10, var9);
				}

				if (arg0 < 3 && (field162[arg0 + 1][var11][var10] & 0x8) != 0) {
					method151(var8, arg0 + 1, var11, var10, var9);
				}
			}
		}

		if (field495 != null) {
			field495.method584();
			AOGYQUKT.field32 = field313;
		}

		field443 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field249.method308(field238, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = WEJSKHXC.method548(var14).field1387;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field549[field238].field1518;
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

						field235[field443] = field478[var15];
						field444[field443] = var16;
						field445[field443] = var17;
						field443++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(IILEYMNCFMK;)V")
	public final void method157(int arg0, EYMNCFMK arg1) {
		for (int var3 = 0; var3 < field221; var3++) {
			int var4 = field222[var3];
			KLQFDPHO var5 = field245[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x40) != 0) {
				int var7 = arg1.method239();
				int var8 = arg1.method258();
				var5.method194(field531, var8, var7);
				var5.field594 = field531 + 300;
				var5.field595 = arg1.method260();
				var5.field596 = arg1.method239();
			}

			if ((var6 & 0x20) != 0) {
				var5.field854 = QYNFXHXW.method512(arg1.method269());
				var5.field606 = var5.field854.field1157;
				var5.field619 = var5.field854.field1166;
				var5.field590 = var5.field854.field1160;
				var5.field591 = var5.field854.field1167;
				var5.field592 = var5.field854.field1168;
				var5.field593 = var5.field854.field1170;
				var5.field620 = var5.field854.field1162;
			}

			if ((var6 & 0x2) != 0) {
				var5.field626 = arg1.method269();
				var5.field627 = arg1.method269();
			}

			if ((var6 & 0x80) != 0) {
				var5.field578 = arg1.method268();
				int var9 = arg1.method275();
				var5.field582 = var9 >> 16;
				var5.field581 = (var9 & 0xFFFF) + field531;
				var5.field579 = 0;
				var5.field580 = 0;

				if (var5.field581 > field531) {
					var5.field579 = -1;
				}

				if (var5.field578 == 0xFFFF) {
					var5.field578 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field622 = arg1.method246();
				var5.field629 = 100;
			}

			if ((var6 & 0x10) != 0) {
				var5.field618 = arg1.method267();
				if (var5.field618 == 0xFFFF) {
					var5.field618 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg1.method260();
				int var11 = arg1.method260();
				var5.method194(field531, var11, var10);
				var5.field594 = field531 + 300;
				var5.field595 = arg1.method258();
				var5.field596 = arg1.method258();
			}

			if ((var6 & 0x8) != 0) {
				int var12 = arg1.method269();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method259();
				if (var5.field609 == var12 && var12 != -1) {
					int var14 = DVIZXFSW.field636[var12].field650;
					if (var14 == 1) {
						var5.field610 = 0;
						var5.field611 = 0;
						var5.field612 = var13;
						var5.field613 = 0;
					}

					if (var14 == 2) {
						var5.field613 = 0;
					}
				} else if (var12 == -1 || var5.field609 == -1 || DVIZXFSW.field636[var12].field644 >= DVIZXFSW.field636[var5.field609].field644) {
					var5.field609 = var12;
					var5.field610 = 0;
					var5.field611 = 0;
					var5.field612 = var13;
					var5.field613 = 0;
					var5.field617 = var5.field583;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method158() {
		if (!field355 && !field489 && !field305) {
			field531++;

			if (field464) {
				method70();
			} else {
				method177();
			}

			method132();
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method159(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IIIIIIIIIIZI)Z")
	public final boolean method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field346[var14][var15] = 0;
				field240[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg1;
		field346[arg10][arg1] = 99;
		field240[arg10][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field353[var18] = arg10;
		int var39 = var18 + 1;
		field354[var18] = arg1;
		boolean var20 = false;
		int var21 = field353.length;
		int[][] var22 = field549[field238].field1518;
		while (var39 != var19) {
			var16 = field353[var19];
			var17 = field354[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && field549[field238].method602(arg6 - 1, arg4, arg8, arg5, var16, var17)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && field549[field238].method603(arg8, arg5, arg6 - 1, var16, var17, arg4)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg3 != 0 && field549[field238].method604(arg0, var17, arg3, var16, arg7, arg8, arg5)) {
				var20 = true;
				break;
			}

			int var23 = field240[var16][var17] + 1;
			if (var16 > 0 && field346[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field353[var39] = var16 - 1;
				field354[var39] = var17;
				var39 = (var39 + 1) % var21;
				field346[var16 - 1][var17] = 2;
				field240[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field346[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field353[var39] = var16 + 1;
				field354[var39] = var17;
				var39 = (var39 + 1) % var21;
				field346[var16 + 1][var17] = 8;
				field240[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field346[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field353[var39] = var16;
				field354[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field346[var16][var17 - 1] = 1;
				field240[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field346[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field353[var39] = var16;
				field354[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field346[var16][var17 + 1] = 4;
				field240[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field346[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field353[var39] = var16 - 1;
				field354[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field346[var16 - 1][var17 - 1] = 3;
				field240[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field346[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field353[var39] = var16 + 1;
				field354[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field346[var16 + 1][var17 - 1] = 9;
				field240[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field346[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field353[var39] = var16 - 1;
				field354[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field346[var16 - 1][var17 + 1] = 6;
				field240[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field346[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field353[var39] = var16 + 1;
				field354[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field346[var16 + 1][var17 + 1] = 12;
				field240[var16 + 1][var17 + 1] = var23;
			}
		}

		field280 = 0;
		if (!var20) {
			if (!arg9) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg8 - var26; var27 <= arg8 + var26; var27++) {
				for (int var28 = arg5 - var26; var28 <= arg5 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field240[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg8) {
							var29 = arg8 - var27;
						} else if (var27 > arg0 + arg8 - 1) {
							var29 = var27 + 1 - arg0 - arg8;
						}

						int var30 = 0;
						if (var28 < arg5) {
							var30 = arg5 - var28;
						} else if (var28 > arg3 + arg5 - 1) {
							var30 = var28 + 1 - arg3 - arg5;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field240[var27][var28] < var25) {
							var24 = var31;
							var25 = field240[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg10 == var16 && arg1 == var17) {
				return false;
			}

			field280 = 1;
		}

		byte var32 = 0;
		field353[var32] = var16;
		int var40 = var32 + 1;
		field354[var32] = var17;
		int var33;
		int var34 = var33 = field346[var16][var17];
		while (arg10 != var16 || arg1 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field353[var40] = var16;
				field354[var40++] = var17;
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

			var34 = field346[var16][var17];
		}

		if (var40 <= 0) {
			if (arg2 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field353[var40];
		int var37 = field354[var40];

		if (arg2 == 0) {
			field283.method228(185);
			field283.method229(var35 + var35 + 3);
		}

		if (arg2 == 1) {
			field283.method228(139);
			field283.method229(var35 + var35 + 3 + 14);
		}

		if (arg2 == 2) {
			field283.method228(134);
			field283.method229(var35 + var35 + 3);
		}

		field283.method257(field966[5] == 1 ? 1 : 0);
		field283.method264(field318 + var36);
		field283.method264(field319 + var37);
		field484 = field353[0];
		field485 = field354[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field283.method255(field353[var40] - var36);
			field283.method256(field354[var40] - var37);
		}

		return true;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method161() {
		if (field962 == 1) {
			if (field963 >= 6 && field963 <= 106 && field964 >= 467 && field964 <= 499) {
				field183 = (field183 + 1) % 4;
				field358 = true;
				field189 = true;
				field283.method228(225);
				field283.method229(field183);
				field283.method229(field516);
				field283.method229(field337);
			}

			if (field963 >= 135 && field963 <= 235 && field964 >= 467 && field964 <= 499) {
				field516 = (field516 + 1) % 3;
				field358 = true;
				field189 = true;
				field283.method228(225);
				field283.method229(field183);
				field283.method229(field516);
				field283.method229(field337);
			}

			if (field963 >= 273 && field963 <= 373 && field964 >= 467 && field964 <= 499) {
				field337 = (field337 + 1) % 3;
				field358 = true;
				field189 = true;
				field283.method228(225);
				field283.method229(field183);
				field283.method229(field516);
				field283.method229(field337);
			}

			if (field963 >= 412 && field963 <= 512 && field964 >= 467 && field964 <= 499) {
				if (field406 == -1) {
					method118();
					field243 = "";
					field525 = false;
					field514 = field406 = VTUPBFSN.field1318;
				} else {
					method110(0, "", "Please close the interface you have open before using 'report abuse'");
				}
			}

			field530++;
			if (field530 > 195) {
				field530 = 0;
				field283.method228(156);
				field283.method230(51285);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method162(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method163() {
		for (int var1 = 0; var1 < field465; var1++) {
			if (field442[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field164[var1] != field510 || field528[var1] != field151) {
						EYMNCFMK var3 = MYEMYBYY.method404(field164[var1], field528[var1]);
						if (System.currentTimeMillis() + var3.field679 / 22 > field224 / 22 + field332) {
							field224 = var3.field679;
							field332 = System.currentTimeMillis();

							if (method185(var3.field678, var3.field679)) {
								field510 = field164[var1];
								field151 = field528[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method190()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field283.method228(3);
						field283.method230(field164[var1] & 0x7FFF);
					} else {
						field283.method228(3);
						field283.method230(-1);
					}
				}

				if (var2 && field442[var1] != -5) {
					field442[var1] = -5;
				} else {
					field465--;
					for (int var5 = var1; var5 < field465; var5++) {
						field164[var5] = field164[var5 + 1];
						field528[var5] = field528[var5 + 1];
						field442[var5] = field442[var5 + 1];
					}

					var1--;
				}
			} else {
				field442[var1]--;
			}
		}

		if (field379 > 0) {
			field379 -= 20;
			if (field379 < 0) {
				field379 = 0;
			}

			if (field379 == 0 && field411 && !field181) {
				field339 = field302;
				field340 = true;
				field308.method577(2, field339);
				return;
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method164() {
		short var1 = 256;

		if (field172 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field172 > 768) {
					field254[var2] = method162(field255[var2], 1024 - field172, field256[var2]);
				} else if (field172 > 256) {
					field254[var2] = field256[var2];
				} else {
					field254[var2] = method162(field256[var2], 256 - field172, field255[var2]);
				}
			}
		} else if (field173 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field173 > 768) {
					field254[var3] = method162(field255[var3], 1024 - field173, field257[var3]);
				} else if (field173 > 256) {
					field254[var3] = field257[var3];
				} else {
					field254[var3] = method162(field257[var3], 256 - field173, field255[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field254[var4] = field255[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field294.field1500[var5] = field512.field666[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field541[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field420[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field254[var12];
					int var15 = field294.field1500[var7];
					field294.field1500[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field294.method585(field948, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field295.field1500[var16] = field513.field666[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field541[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field420[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field254[var23];
					int var26 = field295.field1500[var18];
					field295.field1500[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field295.method585(field948, 0, 637);
	}

	@ObfuscatedName("client.L(I)V")
	public final void method165() {
		for (int var1 = -1; var1 < field219; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field217;
			} else {
				var2 = field220[var1];
			}

			BPHJJPRI var3 = field218[var2];
			if (var3 != null) {
				method60(1, var3);
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method166() {
		try {
			field534 = -1;
			field156.method204();
			field498.method204();
			AOGYQUKT.method10();
			method137();
			field249.method279();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field549[var1].method593();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field162[var2][var3][var4] = 0;
					}
				}
			}

			PMIXOPWJ var5 = new PMIXOPWJ(field162, 104, 104, field359);
			int var6 = field300.length;
			field283.method228(110);

			if (!field488) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field341[var7] >> 8) * 64 - field318;
					int var9 = (field341[var7] & 0xFF) * 64 - field319;
					byte[] var10 = field300[var7];
					if (var10 != null) {
						var5.method466(field549, var8, var9, (field472 - 6) * 8, (field471 - 6) * 8, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field341[var11] >> 8) * 64 - field318;
					int var13 = (field341[var11] & 0xFF) * 64 - field319;
					byte[] var14 = field300[var11];
					if (var14 == null && field472 < 800) {
						var5.method450(var12, var13, 64, 64);
					}
				}

				field283.method228(110);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field155[var15];
					if (var16 != null) {
						int var17 = (field341[var15] >> 8) * 64 - field318;
						int var18 = (field341[var15] & 0xFF) * 64 - field319;
						var5.method448(var18, field249, var16, field549, var17);
					}
				}
			}

			if (field488) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field250[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field341.length; var29++) {
									if (field341[var29] == var28 && field300[var29] != null) {
										var5.method467(field549, var21 * 8, var25, (var27 & 0x7) * 8, (var26 & 0x7) * 8, var24, var19, field300[var29], var20 * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method455(var21 * 8, var19, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field250[0][var30][var31];
						if (var32 == -1) {
							var5.method450(var30 * 8, var31 * 8, 8, 8);
						}
					}
				}

				field283.method228(110);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field250[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field341.length; var42++) {
									if (field341[var42] == var41 && field155[var42] != null) {
										var5.method464(var37, var35 * 8, field155[var42], var33, field249, (var39 & 0x7) * 8, var38, field549, var34 * 8, (var40 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field283.method228(110);
			var5.method469(field249, field549);

			if (field495 != null) {
				field495.method584();
				AOGYQUKT.field32 = field313;
			}

			field283.method228(110);
			int var43 = PMIXOPWJ.field1126;
			if (var43 > field238) {
				var43 = field238;
			}

			if (var43 < field238 - 1) {
				int var44 = field238 - 1;
			}

			if (field181) {
				field249.method280(PMIXOPWJ.field1126);
			} else {
				field249.method280(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method69(var45, var46);
				}
			}

			method171();
		} catch (Exception var59) {
		}

		WEJSKHXC.field1401.method533();

		if (field951 != null) {
			field283.method228(136);
			field283.method233(1057001181);
		}

		if (field181 && signlink.cache_dat != null) {
			int var48 = field308.method560(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field308.method570(var49);
				if ((var50 & 0x79) == 0) {
					OJGAHFXC.method412(var49);
				}
			}
		}

		System.gc();
		AOGYQUKT.method11(20);
		field308.method559();
		int var51 = (field471 - 6) / 8 - 1;
		int var52 = (field471 + 6) / 8 + 1;
		int var53 = (field472 - 6) / 8 - 1;
		int var54 = (field472 + 6) / 8 + 1;
		if (field203) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field308.method574(var56, 0, var55);
					if (var57 != -1) {
						field308.method566(var57, 3);
					}

					int var58 = field308.method574(var56, 1, var55);
					if (var58 != -1) {
						field308.method566(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method167(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field326; var3++) {
				if (field139[var3] == arg0) {
					field326--;
					field315 = true;

					for (int var4 = var3; var4 < field326; var4++) {
						field463[var4] = field463[var4 + 1];
						field133[var4] = field133[var4 + 1];
						field139[var4] = field139[var4 + 1];
					}

					field283.method228(67);
					field283.method235(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)Z")
	public final boolean method168() {
		if (field468 == null) {
			return false;
		}

		try {
			int var1 = field468.method518();
			if (var1 == 0) {
				return false;
			}

			if (field396 == -1) {
				field468.method519(field432.field678, 0, 1);
				field396 = field432.field678[0] & 0xFF;
				if (field149 != null) {
					field396 = field396 - field149.method524() & 0xFF;
				}

				field395 = APJEVQMF.field45[field396];
				var1--;
			}

			if (field395 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field468.method519(field432.field678, 0, 1);
				field395 = field432.field678[0] & 0xFF;
				var1--;
			}

			if (field395 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field468.method519(field432.field678, 0, 2);
				field432.field679 = 0;
				field395 = field432.method241();
				var1 -= 2;
			}

			if (var1 < field395) {
				return false;
			}

			field432.field679 = 0;
			field468.method519(field432.field678, 0, field395);
			field397 = 0;
			field177 = field176;
			field176 = field175;
			field175 = field396;

			if (field396 == 30) {
				field281 = field432.method239();
				field396 = -1;
				return true;
			}

			if (field396 == 247) {
				int var2 = field432.method241();
				int var3 = field432.method268();
				int var4 = field432.method241();
				VTUPBFSN.method544(var2).field1347 = (var4 << 16) + var3;
				field396 = -1;
				return true;
			}

			if (field396 == 205) {
				field183 = field432.method239();
				field516 = field432.method239();
				field337 = field432.method239();
				field358 = true;
				field189 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 169) {
				field215 = field432.method258();
				field214 = field432.method258();
				for (int var5 = field214; var5 < field214 + 8; var5++) {
					for (int var6 = field215; var6 < field215 + 8; var6++) {
						if (field509[field238][var5][var6] != null) {
							field509[field238][var5][var6] = null;
							method69(var5, var6);
						}
					}
				}

				for (CUNQMRTU var7 = (CUNQMRTU) field475.method200(); var7 != null; var7 = (CUNQMRTU) field475.method202()) {
					if (var7.field565 >= field214 && var7.field565 < field214 + 8 && var7.field566 >= field215 && var7.field566 < field215 + 8 && field238 == var7.field563) {
						var7.field567 = 0;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 42) {
				int var8 = field432.method267();
				method68(var8);

				if (field329 != -1) {
					method181(field329);
					field329 = -1;
					field315 = true;
					field186 = true;
				}

				if (field537 != -1) {
					method181(field537);
					field537 = -1;
					field121 = true;
				}

				if (field174 != -1) {
					method181(field174);
					field174 = -1;
				}

				if (field406 != -1) {
					method181(field406);
					field406 = -1;
				}

				if (field230 != var8) {
					method181(field230);
					field230 = var8;
				}

				field522 = false;
				field189 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 174) {
				String var9 = field432.method246();
				if (var9.endsWith(":tradereq:")) {
					String var10 = var9.substring(0, var9.indexOf(":"));
					long var11 = LBMFERBT.method380(var10);
					boolean var13 = false;
					for (int var14 = 0; var14 < field201; var14++) {
						if (field348[var14] == var11) {
							var13 = true;
							break;
						}
					}

					if (!var13 && field377 == 0) {
						method110(4, var10, "wishes to trade with you.");
					}
				} else if (var9.endsWith(":duelreq:")) {
					String var15 = var9.substring(0, var9.indexOf(":"));
					long var16 = LBMFERBT.method380(var15);
					boolean var18 = false;
					for (int var19 = 0; var19 < field201; var19++) {
						if (field348[var19] == var16) {
							var18 = true;
							break;
						}
					}

					if (!var18 && field377 == 0) {
						method110(8, var15, "wishes to duel with you.");
					}
				} else if (var9.endsWith(":chalreq:")) {
					String var20 = var9.substring(0, var9.indexOf(":"));
					long var21 = LBMFERBT.method380(var20);
					boolean var23 = false;
					for (int var24 = 0; var24 < field201; var24++) {
						if (field348[var24] == var21) {
							var23 = true;
							break;
						}
					}

					if (!var23 && field377 == 0) {
						String var25 = var9.substring(var9.indexOf(":") + 1, var9.length() - 9);
						method110(8, var20, var25);
					}
				} else {
					method110(0, "", var9);
				}

				field396 = -1;
				return true;
			}

			if (field396 == 9) {
				int var26 = field432.method241();
				VTUPBFSN.method544(var26).field1351 = 3;

				if (field206.field61 == null) {
					VTUPBFSN.method544(var26).field1352 = (field206.field62[11] << 5) + (field206.field62[8] << 10) + (field206.field62[0] << 15) + (field206.field80[0] << 25) + (field206.field80[4] << 20) + field206.field62[1];
				} else {
					VTUPBFSN.method544(var26).field1352 = (int) (field206.field61.field1159 + 0x12345678L);
				}

				field396 = -1;
				return true;
			}

			if (field396 == 113) {
				field201 = field395 / 8;
				for (int var27 = 0; var27 < field201; var27++) {
					field348[var27] = field432.method245();
				}

				field396 = -1;
				return true;
			}

			if (field396 == 145) {
				int var28 = field432.method269();
				if (var28 == 0xFFFF) {
					var28 = -1;
				}

				if (field302 != var28 && field411 && !field181 && field379 == 0) {
					field339 = var28;
					field340 = true;
					field308.method577(2, field339);
				}

				field302 = var28;
				field396 = -1;
				return true;
			}

			if (field396 == 253) {
				int var29 = field432.method241();
				int var30 = field432.method243();
				if (field411 && !field181) {
					field339 = var29;
					field340 = false;
					field308.method577(2, field339);
					field379 = var30;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 147) {
				if (field345 == 12) {
					field315 = true;
				}

				field137 = field432.method242();
				field396 = -1;
				return true;
			}

			if (field396 == 179) {
				int var31 = field432.method269();
				VTUPBFSN var32 = VTUPBFSN.method544(var31);
				for (int var33 = 0; var33 < var32.field1370.length; var33++) {
					var32.field1370[var33] = -1;
					var32.field1370[var33] = 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 52) {
				field315 = true;
				int var34 = field432.method241();
				VTUPBFSN var35 = VTUPBFSN.method544(var34);
				int var36 = field432.method241();
				for (int var37 = 0; var37 < var36; var37++) {
					int var38 = field432.method239();
					if (var38 == 255) {
						var38 = field432.method244();
					}

					var35.field1370[var37] = field432.method269();
					var35.field1365[var37] = var38;
				}

				for (int var39 = var36; var39 < var35.field1370.length; var39++) {
					var35.field1370[var39] = 0;
					var35.field1365[var39] = 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 154) {
				for (int var40 = 0; var40 < field218.length; var40++) {
					if (field218[var40] != null) {
						field218[var40].field609 = -1;
					}
				}

				for (int var41 = 0; var41 < field245.length; var41++) {
					if (field245[var41] != null) {
						field245[var41].field609 = -1;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 35) {
				field390 = false;
				field467 = 2;
				field182 = "";
				field189 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 73) {
				field455 = false;

				for (int var42 = 0; var42 < 5; var42++) {
					field497[var42] = false;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 132) {
				int var43 = field432.method241();
				int var44 = field432.method267();
				VTUPBFSN var45 = VTUPBFSN.method544(var43);
				if (var45 != null && var45.field1371 == 0) {
					if (var44 < 0) {
						var44 = 0;
					}

					if (var44 > var45.field1303 - var45.field1306) {
						var44 = var45.field1303 - var45.field1306;
					}

					var45.field1334 = var44;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 160) {
				int var46 = field432.method272();
				int var47 = field432.method241();
				int var48 = field432.method270();
				VTUPBFSN var49 = VTUPBFSN.method544(var47);
				var49.field1344 = var48;
				var49.field1332 = var46;
				field396 = -1;
				return true;
			}

			if (field396 == 119) {
				int var50 = field432.method242();
				if (var50 >= 0) {
					method68(var50);
				}

				if (field400 != var50) {
					method181(field400);
					field400 = var50;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 39) {
				field204 = field432.method258();
				if (field345 == field204) {
					if (field204 == 3) {
						field345 = 1;
					} else {
						field345 = 3;
					}

					field315 = true;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 108) {
				int var51 = field432.method260();
				int var52 = field432.method258();
				String var53 = field432.method246();
				if (var51 >= 1 && var51 <= 5) {
					if (var53.equalsIgnoreCase("null")) {
						var53 = null;
					}

					field190[var51 - 1] = var53;
					field191[var51 - 1] = var52 == 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 59) {
				int var54 = field432.method267();
				int var55 = field432.method239();

				if (var54 == 0xFFFF) {
					var54 = -1;
				}

				if (field548[var55] != var54) {
					method181(field548[var55]);
					field548[var55] = var54;
				}

				field315 = true;
				field186 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 173) {
				field214 = field432.method259();
				field215 = field432.method259();

				while (field432.field679 < field395) {
					int var56 = field432.method239();
					method143(var56, field432);
				}

				field396 = -1;
				return true;
			}

			if (field396 == 98) {
				byte var57 = field432.method261();
				int var58 = field432.method241();
				field425[var58] = var57;

				if (field307[var58] != var57) {
					field307[var58] = var57;
					method93(var58);
					field315 = true;

					if (field391 != -1) {
						field189 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 198) {
				field327 = field432.method239();
				field315 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 53) {
				field484 = 0;
				field396 = -1;
				return true;
			}

			if (field396 == 7) {
				int var59 = field432.method269();
				int var60 = field432.method268();
				int var61 = field432.method269();

				if (var60 == 0xFFFF) {
					VTUPBFSN.method544(var59).field1351 = 0;
					field396 = -1;
					return true;
				}

				LAMDVZMU var62 = LAMDVZMU.method376(var60);
				VTUPBFSN.method544(var59).field1351 = 4;
				VTUPBFSN.method544(var59).field1352 = var60;
				VTUPBFSN.method544(var59).field1354 = var62.field897;
				VTUPBFSN.method544(var59).field1355 = var62.field880;
				VTUPBFSN.method544(var59).field1353 = var62.field864 * 100 / var61;
				field396 = -1;
				return true;
			}

			if (field396 == 115) {
				field207 = field432.method239();
				field396 = -1;
				return true;
			}

			if (field396 == 112) {
				field315 = true;
				int var63 = field432.method259();
				int var64 = field432.method244();
				int var65 = field432.method260();
				field551[var63] = var64;
				field424[var63] = var65;
				field352[var63] = 1;
				for (int var66 = 0; var66 < 98; var66++) {
					if (var64 >= field225[var66]) {
						field352[var63] = var66 + 2;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 150) {
				int var67 = field432.method241();
				int var68 = field432.method267();
				VTUPBFSN.method544(var68).field1351 = 2;
				VTUPBFSN.method544(var68).field1352 = var67;
				field396 = -1;
				return true;
			}

			if (field396 == 117) {
				field440 = field432.method268() * 30;
				field396 = -1;
				return true;
			}

			if (field396 == 106) {
				long var69 = field432.method245();
				int var71 = field432.method244();
				int var72 = field432.method239();
				boolean var73 = false;
				for (int var74 = 0; var74 < 100; var74++) {
					if (field310[var74] == var71) {
						var73 = true;
						break;
					}
				}

				if (var72 <= 1) {
					for (int var75 = 0; var75 < field201; var75++) {
						if (field348[var75] == var69) {
							var73 = true;
							break;
						}
					}
				}

				if (!var73 && field377 == 0) {
					try {
						field310[field150] = var71;
						field150 = (field150 + 1) % 100;
						String var76 = HPMMYBXT.method353(field432, field395 - 13);
						if (var72 != 3) {
							var76 = PPZVZYJC.method480(var76);
						}

						if (var72 == 2 || var72 == 3) {
							method110(7, "@cr2@" + LBMFERBT.method384(LBMFERBT.method381(var69)), var76);
						} else if (var72 == 1) {
							method110(7, "@cr1@" + LBMFERBT.method384(LBMFERBT.method381(var69)), var76);
						} else {
							method110(3, LBMFERBT.method384(LBMFERBT.method381(var69)), var76);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 156) {
				field455 = true;
				field433 = field432.method239();
				field434 = field432.method239();
				field435 = field432.method241();
				field436 = field432.method239();
				field437 = field432.method239();
				if (field437 >= 100) {
					int var78 = field433 * 128 + 64;
					int var79 = field434 * 128 + 64;
					int var80 = method184(field238, var78, var79) - field435;
					int var81 = var78 - field500;
					int var82 = var80 - field501;
					int var83 = var79 - field502;
					int var84 = (int) Math.sqrt(var81 * var81 + var83 * var83);
					field503 = (int) (Math.atan2(var82, var84) * 325.949D) & 0x7FF;
					field504 = (int) (Math.atan2(var81, var83) * -325.949D) & 0x7FF;

					if (field503 < 128) {
						field503 = 128;
					}

					if (field503 > 383) {
						field503 = 383;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 206) {
				int var85 = field432.method241();
				int var86 = field432.method239();
				int var87 = field432.method241();
				if (var87 == 0xFFFF) {
					if (field465 < 50) {
						field164[field465] = (short) var85;
						field528[field465] = var86;
						field442[field465] = 0;
						field465++;
					}
				} else if (field239 && !field181 && field465 < 50) {
					field164[field465] = var85;
					field528[field465] = var86;
					field442[field465] = MYEMYBYY.field988[var85] + var87;
					field465++;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 155) {
				int var88 = field432.method241();
				int var89 = field432.method268();
				int var90 = field432.method269();
				int var91 = field432.method269();
				VTUPBFSN.method544(var90).field1354 = var89;
				VTUPBFSN.method544(var90).field1355 = var88;
				VTUPBFSN.method544(var90).field1353 = var91;
				field396 = -1;
				return true;
			}

			if (field396 == 49) {
				int var92 = field432.method267();
				method68(var92);

				if (field329 != -1) {
					method181(field329);
					field329 = -1;
					field315 = true;
					field186 = true;
				}

				if (field230 != -1) {
					method181(field230);
					field230 = -1;
					field189 = true;
				}

				if (field537 != -1) {
					method181(field537);
					field537 = -1;
					field121 = true;
				}

				if (field174 != -1) {
					method181(field174);
					field174 = -1;
				}

				if (field406 != var92) {
					method181(field406);
					field406 = var92;
				}

				if (field467 != 0) {
					field467 = 0;
					field189 = true;
				}

				field522 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 12) {
				field325 = field432.method239();
				field473 = field432.method267();
				field396 = -1;
				return true;
			}

			if (field396 == 230) {
				for (int var93 = 0; var93 < field307.length; var93++) {
					if (field425[var93] != field307[var93]) {
						field307[var93] = field425[var93];
						method93(var93);
						field315 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 238) {
				method86();
				field396 = -1;
				return false;
			}

			if (field396 == 178) {
				int var94 = field432.method271();
				int var95 = field432.method241();
				VTUPBFSN var96 = VTUPBFSN.method544(var95);
				if (var96.field1342 != var94 || var94 == -1) {
					var96.field1342 = var94;
					var96.field1348 = 0;
					var96.field1329 = 0;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 219) {
				field345 = field432.method260();
				field315 = true;
				field186 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 167) {
				long var97 = field432.method245();
				int var99 = field432.method239();
				String var100 = LBMFERBT.method384(LBMFERBT.method381(var97));
				for (int var101 = 0; var101 < field326; var101++) {
					if (field139[var101] == var97) {
						if (field133[var101] != var99) {
							field133[var101] = var99;
							field315 = true;

							if (var99 > 0) {
								method110(5, "", var100 + " has logged in.");
							}

							if (var99 == 0) {
								method110(5, "", var100 + " has logged out.");
							}
						}

						var100 = null;
						break;
					}
				}

				if (var100 != null && field326 < 200) {
					field139[field326] = var97;
					field463[field326] = var100;
					field133[field326] = var99;
					field326++;
					field315 = true;
				}

				boolean var102 = false;
				while (!var102) {
					var102 = true;
					for (int var103 = 0; var103 < field326 - 1; var103++) {
						if (field133[var103] != field178 && field133[var103 + 1] == field178 || field133[var103] == 0 && field133[var103 + 1] != 0) {
							int var104 = field133[var103];
							field133[var103] = field133[var103 + 1];
							field133[var103 + 1] = var104;
							String var105 = field463[var103];
							field463[var103] = field463[var103 + 1];
							field463[var103 + 1] = var105;
							long var106 = field139[var103];
							field139[var103] = field139[var103 + 1];
							field139[var103 + 1] = var106;
							field315 = true;
							var102 = false;
						}
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 130) {
				field390 = false;
				field467 = 1;
				field182 = "";
				field189 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 55) {
				int var108 = field432.method267();
				int var109 = field432.method269();
				VTUPBFSN.method544(var108).field1351 = 1;
				VTUPBFSN.method544(var108).field1352 = var109;
				field396 = -1;
				return true;
			}

			if (field396 == 190) {
				int var110 = field432.method269();
				int var111 = field432.method268();
				int var112 = var110 >> 10 & 0x1F;
				int var113 = var110 >> 5 & 0x1F;
				int var114 = var110 & 0x1F;
				VTUPBFSN.method544(var111).field1321 = (var114 << 3) + (var112 << 19) + (var113 << 11);
				field396 = -1;
				return true;
			}

			if (field396 == 84) {
				int var115 = field432.method241();
				int var116 = field432.method275();
				field425[var115] = var116;

				if (field307[var115] != var116) {
					field307[var115] = var116;
					method93(var115);
					field315 = true;

					if (field391 != -1) {
						field189 = true;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 68 || field396 == 109) {
				int var117 = field471;
				int var118 = field472;
				if (field396 == 68) {
					var118 = field432.method269();
					var117 = field432.method267();
					field488 = false;
				}

				if (field396 == 109) {
					field432.method249();

					for (int var119 = 0; var119 < 4; var119++) {
						for (int var120 = 0; var120 < 13; var120++) {
							for (int var121 = 0; var121 < 13; var121++) {
								int var122 = field432.method250(1);
								if (var122 == 1) {
									field250[var119][var120][var121] = field432.method250(26);
								} else {
									field250[var119][var120][var121] = -1;
								}
							}
						}
					}

					field432.method251();
					var118 = field432.method269();
					var117 = field432.method267();
					field488 = true;
				}

				if (field471 == var117 && field472 == var118 && field262 == 2) {
					field396 = -1;
					return true;
				}

				field471 = var117;
				field472 = var118;
				field318 = (field471 - 6) * 8;
				field319 = (field472 - 6) * 8;
				field203 = false;
				if ((field471 / 8 == 48 || field471 / 8 == 49) && field472 / 8 == 48) {
					field203 = true;
				}

				if (field471 / 8 == 48 && field472 / 8 == 148) {
					field203 = true;
				}

				field262 = 1;
				field426 = System.currentTimeMillis();
				method87("Loading - please wait.", null);

				if (field396 == 68) {
					int var123 = 0;
					for (int var124 = (field471 - 6) / 8; var124 <= (field471 + 6) / 8; var124++) {
						for (int var125 = (field472 - 6) / 8; var125 <= (field472 + 6) / 8; var125++) {
							var123++;
						}
					}

					field300 = new byte[var123][];
					field155 = new byte[var123][];
					field341 = new int[var123];
					field342 = new int[var123];
					field343 = new int[var123];
					int var126 = 0;
					for (int var127 = (field471 - 6) / 8; var127 <= (field471 + 6) / 8; var127++) {
						for (int var128 = (field472 - 6) / 8; var128 <= (field472 + 6) / 8; var128++) {
							field341[var126] = (var127 << 8) + var128;

							if (field203 && (var128 == 49 || var128 == 149 || var128 == 147 || var127 == 50 || var127 == 49 && var128 == 47)) {
								field342[var126] = -1;
								field343[var126] = -1;
								var126++;
							} else {
								int var129 = field342[var126] = field308.method574(var128, 0, var127);
								if (var129 != -1) {
									field308.method577(3, var129);
								}

								int var130 = field343[var126] = field308.method574(var128, 1, var127);
								if (var130 != -1) {
									field308.method577(3, var130);
								}

								var126++;
							}
						}
					}
				}

				if (field396 == 109) {
					int var131 = 0;
					int[] var132 = new int[676];
					for (int var133 = 0; var133 < 4; var133++) {
						for (int var134 = 0; var134 < 13; var134++) {
							for (int var135 = 0; var135 < 13; var135++) {
								int var136 = field250[var133][var134][var135];
								if (var136 != -1) {
									int var137 = var136 >> 14 & 0x3FF;
									int var138 = var136 >> 3 & 0x7FF;
									int var139 = (var137 / 8 << 8) + var138 / 8;
									for (int var140 = 0; var140 < var131; var140++) {
										if (var132[var140] == var139) {
											var139 = -1;
											break;
										}
									}

									if (var139 != -1) {
										var132[var131++] = var139;
									}
								}
							}
						}
					}

					field300 = new byte[var131][];
					field155 = new byte[var131][];
					field341 = new int[var131];
					field342 = new int[var131];
					field343 = new int[var131];
					for (int var141 = 0; var141 < var131; var141++) {
						int var142 = field341[var141] = var132[var141];
						int var143 = var142 >> 8 & 0xFF;
						int var144 = var142 & 0xFF;
						int var145 = field342[var141] = field308.method574(var144, 0, var143);
						if (var145 != -1) {
							field308.method577(3, var145);
						}

						int var146 = field343[var141] = field308.method574(var144, 1, var143);
						if (var146 != -1) {
							field308.method577(3, var146);
						}
					}
				}

				int var147 = field318 - field320;
				int var148 = field319 - field321;
				field320 = field318;
				field321 = field319;

				for (int var149 = 0; var149 < 16384; var149++) {
					KLQFDPHO var150 = field245[var149];
					if (var150 != null) {
						for (int var151 = 0; var151 < 10; var151++) {
							var150.field588[var151] -= var147;
							var150.field589[var151] -= var148;
						}

						var150.field584 -= var147 * 128;
						var150.field585 -= var148 * 128;
					}
				}

				for (int var152 = 0; var152 < field216; var152++) {
					BPHJJPRI var153 = field218[var152];
					if (var153 != null) {
						for (int var154 = 0; var154 < 10; var154++) {
							var153.field588[var154] -= var147;
							var153.field589[var154] -= var148;
						}

						var153.field584 -= var147 * 128;
						var153.field585 -= var148 * 128;
					}
				}

				field135 = true;
				byte var155 = 0;
				byte var156 = 104;
				byte var157 = 1;
				if (var147 < 0) {
					var155 = 103;
					var156 = -1;
					var157 = -1;
				}

				byte var158 = 0;
				byte var159 = 104;
				byte var160 = 1;
				if (var148 < 0) {
					var158 = 103;
					var159 = -1;
					var160 = -1;
				}

				for (int var161 = var155; var161 != var156; var161 += var157) {
					for (int var162 = var158; var162 != var159; var162 += var160) {
						int var163 = var147 + var161;
						int var164 = var148 + var162;
						for (int var165 = 0; var165 < 4; var165++) {
							if (var163 >= 0 && var164 >= 0 && var163 < 104 && var164 < 104) {
								field509[var165][var161][var162] = field509[var165][var163][var164];
							} else {
								field509[var165][var161][var162] = null;
							}
						}
					}
				}

				for (CUNQMRTU var166 = (CUNQMRTU) field475.method200(); var166 != null; var166 = (CUNQMRTU) field475.method202()) {
					var166.field565 -= var147;
					var166.field566 -= var148;
					if (var166.field565 < 0 || var166.field566 < 0 || var166.field565 >= 104 || var166.field566 >= 104) {
						var166.method205();
					}
				}

				if (field484 != 0) {
					field484 -= var147;
					field485 -= var148;
				}

				field455 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 192) {
				method88(field432, field395);
				field396 = -1;
				return true;
			}

			if (field396 == 149) {
				field432.method239();
				field248 = field432.method241();
				field253 = field432.method241();
				field119 = field432.method269();
				field458 = field432.method268();
				field490 = field432.method241();
				field460 = field432.method275();
				field432.method267();
				field432.method269();
				field515 = field432.method267();
				field432.method241();
				signlink.dnslookup(LBMFERBT.method383(field460));
				field396 = -1;
				return true;
			}

			if (field396 == 123) {
				field315 = true;
				int var167 = field432.method241();
				VTUPBFSN var168 = VTUPBFSN.method544(var167);
				while (field432.field679 < field395) {
					int var169 = field432.method253();
					int var170 = field432.method241();
					int var171 = field432.method239();
					if (var171 == 255) {
						var171 = field432.method244();
					}

					if (var169 >= 0 && var169 < var168.field1370.length) {
						var168.field1370[var169] = var170;
						var168.field1365[var169] = var171;
					}
				}

				field396 = -1;
				return true;
			}

			if (field396 == 216) {
				int var172 = field432.method241();
				int var173 = field432.method268();

				if (field230 != -1) {
					method181(field230);
					field230 = -1;
					field189 = true;
				}

				if (field537 != -1) {
					method181(field537);
					field537 = -1;
					field121 = true;
				}

				if (field174 != -1) {
					method181(field174);
					field174 = -1;
				}

				if (field406 != var173) {
					method181(field406);
					field406 = var173;
				}

				if (field329 != var172) {
					method181(field329);
					field329 = var172;
				}

				if (field467 != 0) {
					field467 = 0;
					field189 = true;
				}

				field315 = true;
				field186 = true;
				field522 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 234) {
				int var174 = field432.method267();
				int var175 = field432.method268();
				method68(var174);

				if (var175 != -1) {
					method68(var175);
				}

				if (field406 != -1) {
					method181(field406);
					field406 = -1;
				}

				if (field329 != -1) {
					method181(field329);
					field329 = -1;
				}

				if (field230 != -1) {
					method181(field230);
					field230 = -1;
				}

				if (field537 != var174) {
					method181(field537);
					field537 = var174;
				}

				if (field174 != var174) {
					method181(field174);
					field174 = var175;
				}

				field467 = 0;
				field522 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 57) {
				field347 = field432.method239();
				if (field347 == 1) {
					field282 = field432.method241();
				}

				if (field347 >= 2 && field347 <= 6) {
					if (field347 == 2) {
						field276 = 64;
						field277 = 64;
					}

					if (field347 == 3) {
						field276 = 0;
						field277 = 64;
					}

					if (field347 == 4) {
						field276 = 128;
						field277 = 64;
					}

					if (field347 == 5) {
						field276 = 64;
						field277 = 0;
					}

					if (field347 == 6) {
						field276 = 64;
						field277 = 128;
					}

					field347 = 2;
					field273 = field432.method241();
					field274 = field432.method241();
					field275 = field432.method239();
				}

				if (field347 == 10) {
					field157 = field432.method241();
				}

				field396 = -1;
				return true;
			}

			if (field396 == 58) {
				int var176 = field432.method241();
				method68(var176);

				if (field230 != -1) {
					method181(field230);
					field230 = -1;
					field189 = true;
				}

				if (field537 != -1) {
					method181(field537);
					field537 = -1;
					field121 = true;
				}

				if (field174 != -1) {
					method181(field174);
					field174 = -1;
				}

				if (field406 != -1) {
					method181(field406);
					field406 = -1;
				}

				if (field329 != var176) {
					method181(field329);
					field329 = var176;
				}

				if (field467 != 0) {
					field467 = 0;
					field189 = true;
				}

				field315 = true;
				field186 = true;
				field522 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 221) {
				int var177 = field432.method239();
				int var178 = field432.method239();
				int var179 = field432.method239();
				int var180 = field432.method239();
				field497[var177] = true;
				field284[var177] = var178;
				field372[var177] = var179;
				field521[var177] = var180;
				field520[var177] = 0;
				field396 = -1;
				return true;
			}

			if (field396 == 67) {
				if (field329 != -1) {
					method181(field329);
					field329 = -1;
					field315 = true;
					field186 = true;
				}

				if (field230 != -1) {
					method181(field230);
					field230 = -1;
					field189 = true;
				}

				if (field537 != -1) {
					method181(field537);
					field537 = -1;
					field121 = true;
				}

				if (field174 != -1) {
					method181(field174);
					field174 = -1;
				}

				if (field406 != -1) {
					method181(field406);
					field406 = -1;
				}

				if (field467 != 0) {
					field467 = 0;
					field189 = true;
				}

				field522 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 46) {
				int var181 = field432.method267();
				String var182 = field432.method246();
				VTUPBFSN.method544(var181).field1360 = var182;

				if (field548[field345] == VTUPBFSN.method544(var181).field1309) {
					field315 = true;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 228) {
				boolean var183 = field432.method239() == 1;
				int var184 = field432.method267();
				VTUPBFSN.method544(var184).field1310 = var183;
				field396 = -1;
				return true;
			}

			if (field396 == 8 || field396 == 22 || field396 == 99 || field396 == 255 || field396 == 197 || field396 == 102 || field396 == 212 || field396 == 222 || field396 == 213 || field396 == 61 || field396 == 225) {
				method143(field396, field432);
				field396 = -1;
				return true;
			}

			if (field396 == 163) {
				field455 = true;
				field208 = field432.method239();
				field209 = field432.method239();
				field210 = field432.method241();
				field211 = field432.method239();
				field212 = field432.method239();
				if (field212 >= 100) {
					field500 = field208 * 128 + 64;
					field502 = field209 * 128 + 64;
					field501 = method184(field238, field500, field502) - field210;
				}

				field396 = -1;
				return true;
			}

			if (field396 == 66) {
				field214 = field432.method239();
				field215 = field432.method239();
				field396 = -1;
				return true;
			}

			if (field396 == 29) {
				method100(field395, field432);
				field135 = false;
				field396 = -1;
				return true;
			}

			if (field396 == 83) {
				int var185 = field432.method242();
				if (field391 != var185) {
					method181(field391);
					field391 = var185;
				}

				field189 = true;
				field396 = -1;
				return true;
			}

			if (field396 == 95) {
				if (field345 == 12) {
					field315 = true;
				}

				field125 = field432.method239();
				field396 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field396 + "," + field395 + " - " + field176 + "," + field177);
			method86();
		} catch (IOException var190) {
			method175();
		} catch (Exception var191) {
			String var187 = "T2 - " + field396 + "," + field176 + "," + field177 + " - " + field395 + "," + (field206.field588[0] + field318) + "," + (field206.field589[0] + field319) + " - ";
			for (int var188 = 0; var188 < field395 && var188 < 50; var188++) {
				var187 = var187 + field432.field678[var188] + ",";
			}

			signlink.reporterror(var187);
			method86();
		}

		return true;
	}

	@ObfuscatedName("client.a(ZILVTUPBFSN;)I")
	public final int method169(int arg0, VTUPBFSN arg1) {
		if (arg1.field1307 == null || arg0 >= arg1.field1307.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1307[arg0];
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
					var8 = field424[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field352[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field551[var3[var5++]];
				}

				if (var7 == 4) {
					VTUPBFSN var10 = VTUPBFSN.method544(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < LAMDVZMU.field894 && (!LAMDVZMU.method376(var11).field896 || field180)) {
						for (int var12 = 0; var12 < var10.field1370.length; var12++) {
							if (var11 + 1 == var10.field1370[var12]) {
								var8 += var10.field1365[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field307[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field225[field352[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field307[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field206.field73;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < LQAGEADS.field904; var13++) {
						if (LQAGEADS.field906[var13]) {
							var8 += field352[var13];
						}
					}
				}

				if (var7 == 10) {
					VTUPBFSN var14 = VTUPBFSN.method544(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < LAMDVZMU.field894 && (!LAMDVZMU.method376(var15).field896 || field180)) {
						for (int var16 = 0; var16 < var14.field1370.length; var16++) {
							if (var14.field1370[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field125;
				}

				if (var7 == 12) {
					var8 = field137;
				}

				if (var7 == 13) {
					int var17 = field307[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					BVXCTZVJ var20 = BVXCTZVJ.field109[var19];
					int var21 = var20.field111;
					int var22 = var20.field112;
					int var23 = var20.field113;
					int var24 = field131[var23 - var22];
					var8 = field307[var21] >> var22 & var24;
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
					var8 = (field206.field584 >> 7) + field318;
				}

				if (var7 == 19) {
					var8 = (field206.field585 >> 7) + field319;
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

	@ObfuscatedName("client.a(IIBILQYNFXHXW;)V")
	public final void method170(int arg0, int arg1, int arg2, QYNFXHXW arg3) {
		if (field487 < 400) {
			if (arg3.field1172 != null) {
				arg3 = arg3.method508();
			}

			if (arg3 != null && arg3.field1154) {
				String var5 = arg3.field1164;
				if (arg3.field1141 != 0) {
					var5 = var5 + method187(arg3.field1141, field206.field73) + " (level-" + arg3.field1141 + ")";
				}

				if (field126 == 1) {
					field195[field487] = "Use " + field130 + " with @yel@" + var5;
					field160[field487] = 384;
					field161[field487] = arg0;
					field158[field487] = arg2;
					field159[field487] = arg1;
					field487++;
				} else if (field555 != 1) {
					if (arg3.field1137 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1137[var6] != null && !arg3.field1137[var6].equalsIgnoreCase("attack")) {
								field195[field487] = arg3.field1137[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field160[field487] = 840;
								}

								if (var6 == 1) {
									field160[field487] = 2;
								}

								if (var6 == 2) {
									field160[field487] = 131;
								}

								if (var6 == 3) {
									field160[field487] = 546;
								}

								if (var6 == 4) {
									field160[field487] = 588;
								}

								field161[field487] = arg0;
								field158[field487] = arg2;
								field159[field487] = arg1;
								field487++;
							}
						}
					}

					if (arg3.field1137 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1137[var7] != null && arg3.field1137[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1141 > field206.field73) {
									var8 = 2000;
								}

								field195[field487] = arg3.field1137[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field160[field487] = var8 + 840;
								}

								if (var7 == 1) {
									field160[field487] = var8 + 2;
								}

								if (var7 == 2) {
									field160[field487] = var8 + 131;
								}

								if (var7 == 3) {
									field160[field487] = var8 + 546;
								}

								if (var7 == 4) {
									field160[field487] = var8 + 588;
								}

								field161[field487] = arg0;
								field158[field487] = arg2;
								field159[field487] = arg1;
								field487++;
							}
						}
					}

					field195[field487] = "Examine @yel@" + var5;
					field160[field487] = 1163;
					field161[field487] = arg0;
					field158[field487] = arg2;
					field159[field487] = arg1;
					field487++;
				} else if ((field557 & 0x2) == 2) {
					field195[field487] = field558 + " @yel@" + var5;
					field160[field487] = 471;
					field161[field487] = arg0;
					field158[field487] = arg2;
					field159[field487] = arg1;
					field487++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method171() {
		for (CUNQMRTU var1 = (CUNQMRTU) field475.method200(); var1 != null; var1 = (CUNQMRTU) field475.method202()) {
			if (var1.field567 == -1) {
				var1.field571 = 0;
				method101(var1);
			} else {
				var1.method205();
			}
		}
	}

	@ObfuscatedName("client.a(LEYMNCFMK;II)V")
	public final void method172(EYMNCFMK arg0, int arg1) {
		for (int var3 = 0; var3 < field221; var3++) {
			int var4 = field222[var3];
			BPHJJPRI var5 = field218[var4];
			int var6 = arg0.method239();
			if ((var6 & 0x20) != 0) {
				var6 += arg0.method239() << 8;
			}

			method176(var6, var5, var4, arg0);
		}
	}

	@ObfuscatedName("client.a(IIIIBIIIII)V")
	public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		CUNQMRTU var10 = null;
		for (CUNQMRTU var11 = (CUNQMRTU) field475.method200(); var11 != null; var11 = (CUNQMRTU) field475.method202()) {
			if (var11.field563 == arg6 && var11.field565 == arg0 && var11.field566 == arg2 && var11.field564 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new CUNQMRTU();
			var10.field563 = arg6;
			var10.field564 = arg5;
			var10.field565 = arg0;
			var10.field566 = arg2;
			method101(var10);
			field475.method197(var10);
		}

		var10.field568 = arg8;
		var10.field570 = arg1;
		var10.field569 = arg4;
		var10.field571 = arg3;
		var10.field567 = arg7;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method174() {
		if (field367 == 0) {
			int var1 = field962;
			if (field555 == 1 && field963 >= 516 && field964 >= 160 && field963 <= 765 && field964 <= 205) {
				var1 = 0;
			}

			if (field523) {
				if (var1 != 1) {
					int var2 = field956;
					int var3 = field957;
					if (field446 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field446 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field446 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field447 - 10 || var2 > field449 + field447 + 10 || var3 < field448 - 10 || var3 > field450 + field448 + 10) {
						field523 = false;

						if (field446 == 1) {
							field315 = true;
						}

						if (field446 == 2) {
							field189 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field447;
					int var5 = field448;
					int var6 = field449;
					int var7 = field963;
					int var8 = field964;
					if (field446 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field446 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field446 == 2) {
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
						method135(var9);
					}

					field523 = false;

					if (field446 == 1) {
						field315 = true;
					}

					if (field446 == 2) {
						field189 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field487 > 0) {
					int var12 = field160[field487 - 1];
					if (var12 == 254 || var12 == 767 || var12 == 858 || var12 == 22 || var12 == 974 || var12 == 599 || var12 == 689 || var12 == 533 || var12 == 484 || var12 == 851 || var12 == 988 || var12 == 1695) {
						int var13 = field158[field487 - 1];
						int var14 = field159[field487 - 1];
						VTUPBFSN var15 = VTUPBFSN.method544(var14);
						if (var15.field1302 || var15.field1340) {
							field393 = false;
							field316 = 0;
							field365 = var14;
							field366 = var13;
							field367 = 2;
							field368 = field963;
							field369 = field964;

							if (VTUPBFSN.method544(var14).field1309 == field406) {
								field367 = 1;
							}

							if (VTUPBFSN.method544(var14).field1309 == field230) {
								field367 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field505 == 1 || method91(field487 - 1)) && field487 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field487 > 0) {
					method135(field487 - 1);
				}

				if (var1 != 2 || field487 <= 0) {
					return;
				}

				method106();
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method175() {
		if (field399 > 0) {
			method86();
		} else {
			method87("Connection lost", "Please wait - attempting to reestablish");
			field207 = 0;
			field484 = 0;
			SAMFSOGS var1 = field468;
			field464 = false;
			field278 = 0;
			method178(field152, field153, true);

			if (!field464) {
				method86();
			}

			try {
				var1.method516();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILBPHJJPRI;BILEYMNCFMK;)V")
	public final void method176(int arg0, BPHJJPRI arg1, int arg2, EYMNCFMK arg3) {
		if ((arg0 & 0x400) != 0) {
			arg1.field578 = arg3.method269();
			int var5 = arg3.method274();
			arg1.field582 = var5 >> 16;
			arg1.field581 = (var5 & 0xFFFF) + field531;
			arg1.field579 = 0;
			arg1.field580 = 0;

			if (arg1.field581 > field531) {
				arg1.field579 = -1;
			}

			if (arg1.field578 == 0xFFFF) {
				arg1.field578 = -1;
			}
		}

		if ((arg0 & 0x2) != 0) {
			arg1.field622 = arg3.method246();
			if (arg1.field622.charAt(0) == '~') {
				arg1.field622 = arg1.field622.substring(1);
				method110(2, arg1.field79, arg1.field622);
			} else if (field206 == arg1) {
				method110(2, arg1.field79, arg1.field622);
			}

			arg1.field616 = 0;
			arg1.field587 = 0;
			arg1.field629 = 150;
		}

		if ((arg0 & 0x80) != 0) {
			int var6 = arg3.method260();
			int var7 = arg3.method239();
			arg1.method194(field531, var7, var6);
			arg1.field594 = field531 + 300;
			arg1.field595 = arg3.method258();
			arg1.field596 = arg3.method258();
		}

		if ((arg0 & 0x40) != 0) {
			int var8 = arg3.method267();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			int var9 = arg3.method259();
			if (arg1.field609 == var8 && var8 != -1) {
				int var10 = DVIZXFSW.field636[var8].field650;
				if (var10 == 1) {
					arg1.field610 = 0;
					arg1.field611 = 0;
					arg1.field612 = var9;
					arg1.field613 = 0;
				}

				if (var10 == 2) {
					arg1.field613 = 0;
				}
			} else if (var8 == -1 || arg1.field609 == -1 || DVIZXFSW.field636[var8].field644 >= DVIZXFSW.field636[arg1.field609].field644) {
				arg1.field609 = var8;
				arg1.field610 = 0;
				arg1.field611 = 0;
				arg1.field612 = var9;
				arg1.field613 = 0;
				arg1.field617 = arg1.field583;
			}
		}

		if ((arg0 & 0x8) != 0) {
			int var11 = arg3.method260();
			byte[] var12 = new byte[var11];
			EYMNCFMK var13 = new EYMNCFMK(var12);
			arg3.method277(var12, 0, var11);
			field223[arg2] = var13;
			arg1.method39(var13);
		}

		if ((arg0 & 0x200) != 0) {
			arg1.field597 = arg3.method259();
			arg1.field599 = arg3.method258();
			arg1.field598 = arg3.method259();
			arg1.field600 = arg3.method258();
			arg1.field601 = arg3.method241() + field531;
			arg1.field602 = arg3.method267() + field531;
			arg1.field603 = arg3.method258();
			arg1.method193();
		}

		if ((arg0 & 0x100) != 0) {
			int var14 = arg3.method258();
			int var15 = arg3.method239();
			arg1.method194(field531, var15, var14);
			arg1.field594 = field531 + 300;
			arg1.field595 = arg3.method258();
			arg1.field596 = arg3.method258();
		}

		if ((arg0 & 0x4) != 0) {
			int var16 = arg3.method267();
			int var17 = arg3.method239();
			int var18 = arg3.method260();
			int var19 = arg3.field679;

			if (arg1.field79 != null && arg1.field67) {
				long var20 = LBMFERBT.method380(arg1.field79);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field201; var23++) {
						if (field348[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field377 == 0) {
					try {
						field244.field679 = 0;
						arg3.method248(field244.field678, 0, var18);
						field244.field679 = 0;
						String var24 = HPMMYBXT.method353(field244, var18);
						var24 = PPZVZYJC.method480(var24);
						arg1.field622 = var24;
						arg1.field616 = var16 >> 8;
						arg1.field587 = var16 & 0xFF;
						arg1.field629 = 150;

						if (var17 == 2 || var17 == 3) {
							method110(1, "@cr2@" + arg1.field79, var24);
						} else if (var17 == 1) {
							method110(1, "@cr1@" + arg1.field79, var24);
						} else {
							method110(2, arg1.field79, var24);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field679 = var18 + var19;
		}

		if ((arg0 & 0x10) != 0) {
			arg1.field618 = arg3.method269();
			if (arg1.field618 == 0xFFFF) {
				arg1.field618 = -1;
			}
		}

		if ((arg0 & 0x1) != 0) {
			arg1.field626 = arg3.method268();
			arg1.field627 = arg3.method268();
		}
	}

	public final void run() {
		if (field481) {
			method53();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method177() {
		if (field242 == 0) {
			int var1 = field946 / 2 - 80;
			int var2 = field947 / 2 + 20;
			var2 += 20;
			if (field962 == 1 && field963 >= var1 - 75 && field963 <= var1 + 75 && field964 >= var2 - 20 && field964 <= var2 + 20) {
				field242 = 3;
				field226 = 0;
			}

			int var3 = field946 / 2 + 80;
			if (field962 == 1 && field963 >= var3 - 75 && field963 <= var3 + 75 && field964 >= var2 - 20 && field964 <= var2 + 20) {
				field526 = "";
				field527 = "Enter your username & password.";
				field242 = 2;
				field226 = 0;
			}
		} else if (field242 == 2) {
			int var4 = field947 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field962 == 1 && field964 >= var4 - 15 && field964 < var4) {
				field226 = 0;
			}

			var4 += 15;
			if (field962 == 1 && field964 >= var4 - 15 && field964 < var4) {
				field226 = 1;
			}

			var4 += 15;
			int var5 = field946 / 2 - 80;
			int var6 = field947 / 2 + 50;
			var6 += 20;
			if (field962 == 1 && field963 >= var5 - 75 && field963 <= var5 + 75 && field964 >= var6 - 20 && field964 <= var6 + 20) {
				field278 = 0;
				method178(field152, field153, false);

				if (field464) {
					return;
				}
			}

			int var7 = field946 / 2 + 80;
			if (field962 == 1 && field963 >= var7 - 75 && field963 <= var7 + 75 && field964 >= var6 - 20 && field964 <= var6 + 20) {
				field242 = 0;
				field152 = "";
				field153 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method390();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field394.length(); var10++) {
					if (var8 == field394.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field226 == 0) {
					if (var8 == 8 && field152.length() > 0) {
						field152 = field152.substring(0, field152.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field226 = 1;
					}

					if (var9) {
						field152 = field152 + (char) var8;
					}

					if (field152.length() > 12) {
						field152 = field152.substring(0, 12);
					}
				} else if (field226 == 1) {
					if (var8 == 8 && field153.length() > 0) {
						field153 = field153.substring(0, field153.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field226 = 0;
					}

					if (var9) {
						field153 = field153 + (char) var8;
					}

					if (field153.length() > 20) {
						field153 = field153.substring(0, 20);
					}
				}
			}
		} else if (field242 == 3) {
			int var11 = field946 / 2;
			int var12 = field947 / 2 + 50;
			var12 += 20;
			if (field962 == 1 && field963 >= var11 - 75 && field963 <= var11 + 75 && field964 >= var12 - 20 && field964 <= var12 + 20) {
				field242 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method178(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field526 = "";
				field527 = "Connecting to server...";
				method121(true);
			}

			field468 = new SAMFSOGS(this, method134(field179 + 43594));
			long var4 = LBMFERBT.method380(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field283.field679 = 0;
			field283.method229(14);
			field283.method229(var6);
			field468.method520(0, 2, field283.field678);

			for (int var7 = 0; var7 < 8; var7++) {
				field468.method517();
			}

			int var8 = field468.method517();
			int var9 = var8;

			if (var8 == 0) {
				field468.method519(field432.field678, 0, 8);
				field432.field679 = 0;
				field188 = field432.method245();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field188 >> 32), (int) field188 };
				field283.field679 = 0;
				field283.method229(10);
				field283.method233(var10[0]);
				field283.method233(var10[1]);
				field283.method233(var10[2]);
				field283.method233(var10[3]);
				field283.method233(signlink.uid);
				field283.method236(arg0);
				field283.method236(arg1);
				field283.method254(field166, field499);
				field462.field679 = 0;

				if (arg2) {
					field462.method229(18);
				} else {
					field462.method229(16);
				}

				field462.method229(field283.field679 + 36 + 1 + 1 + 2);
				field462.method229(255);
				field462.method230(371);
				field462.method229(field181 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field462.method233(field474[var11]);
				}

				field462.method237(field283.field678, field283.field679, 0);
				field283.field683 = new TXNIKMNQ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field149 = new TXNIKMNQ(var10);
				field468.method520(0, field462.field679, field462.field678);
				var8 = field468.method517();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method178(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field477 = field468.method517();
				field483 = field468.method517() == 1;
				field228 = 0L;
				field417 = 0;
				field303.field1087 = 0;
				field953 = true;
				field392 = true;
				field464 = true;
				field283.field679 = 0;
				field432.field679 = 0;
				field396 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field395 = 0;
				field397 = 0;
				field440 = 0;
				field399 = 0;
				field347 = 0;
				field487 = 0;
				field523 = false;
				field954 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field324[var13] = null;
				}

				field126 = 0;
				field555 = 0;
				field262 = 0;
				field465 = 0;
				field418 = (int) (Math.random() * 100.0D) - 50;
				field167 = (int) (Math.random() * 110.0D) - 55;
				field506 = (int) (Math.random() * 80.0D) - 40;
				field170 = (int) (Math.random() * 120.0D) - 60;
				field469 = (int) (Math.random() * 30.0D) - 20;
				field408 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field207 = 0;
				field534 = -1;
				field484 = 0;
				field485 = 0;
				field219 = 0;
				field246 = 0;

				for (int var14 = 0; var14 < field216; var14++) {
					field218[var14] = null;
					field223[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field245[var15] = null;
				}

				field206 = field218[field217] = new BPHJJPRI();
				field498.method204();
				field156.method204();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field509[var16][var17][var18] = null;
						}
					}
				}

				field475 = new DMMTBJKZ();
				field327 = 0;
				field326 = 0;
				method181(field391);
				field391 = -1;
				method181(field230);
				field230 = -1;
				method181(field406);
				field406 = -1;
				method181(field537);
				field537 = -1;
				method181(field174);
				field174 = -1;
				method181(field329);
				field329 = -1;
				method181(field400);
				field400 = -1;
				field522 = false;
				field345 = 3;
				field467 = 0;
				field523 = false;
				field390 = false;
				field118 = null;
				field281 = 0;
				field204 = -1;
				field524 = true;
				method180();

				for (int var19 = 0; var19 < 5; var19++) {
					field213[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field190[var20] = null;
					field191[var20] = false;
				}

				field363 = 0;
				field328 = 0;
				field511 = 0;
				field184 = 0;
				field233 = 0;
				field380 = 0;
				field334 = 0;
				method107();
			} else if (var8 == 3) {
				field526 = "";
				field527 = "Invalid username or password.";
			} else if (var8 == 4) {
				field526 = "Your account has been disabled.";
				field527 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field526 = "Your account is already logged in.";
				field527 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field526 = "RuneScape has been updated!";
				field527 = "Please reload this page.";
			} else if (var8 == 7) {
				field526 = "This world is full.";
				field527 = "Please use a different world.";
			} else if (var8 == 8) {
				field526 = "Unable to connect.";
				field527 = "Login server offline.";
			} else if (var8 == 9) {
				field526 = "Login limit exceeded.";
				field527 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field526 = "Unable to connect.";
				field527 = "Bad session id.";
			} else if (var8 == 12) {
				field526 = "You need a members account to login to this world.";
				field527 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field526 = "Could not complete login.";
				field527 = "Please try using a different world.";
			} else if (var8 == 14) {
				field526 = "The server is being updated.";
				field527 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field464 = true;
				field283.field679 = 0;
				field432.field679 = 0;
				field396 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field395 = 0;
				field397 = 0;
				field440 = 0;
				field487 = 0;
				field523 = false;
				field426 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field526 = "Login attempts exceeded.";
				field527 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field526 = "You are standing in a members-only area.";
				field527 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field526 = "Invalid loginserver requested";
				field527 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field468.method517();
				for (var21 += 3; var21 >= 0; var21--) {
					field526 = "You have only just left another world";
					field527 = "Your profile will be transferred in: " + var21;
					method121(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method178(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field526 = "Malformed login packet.";
				field527 = "Please try again.";
			} else if (var8 == 23) {
				field526 = "No reply from loginserver.";
				field527 = "Please try again.";
			} else if (var8 == 24) {
				field526 = "Error loading your profile.";
				field527 = "Please contact customer support.";
			} else if (var8 == 25) {
				field526 = "Unexpected loginserver response.";
				field527 = "Please try using a different world.";
			} else if (var8 == 26) {
				field526 = "This computers address has been blocked";
				field527 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field526 = "Unexpected server response";
				field527 = "Please try using a different world.";
			} else if (var9 != 0) {
				field526 = "No response from server";
				field527 = "Please try using a different world.";
			} else if (field278 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field278++;
				method178(arg0, arg1, arg2);
			} else {
				field526 = "No response from loginserver";
				field527 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field526 = "";
			field527 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public static final void method179() {
		FKUDHMAZ.field691 = true;
		AOGYQUKT.field21 = true;
		field181 = true;
		PMIXOPWJ.field1115 = true;
		WEJSKHXC.field1375 = true;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method180() {
		field371 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field205[var1] = -1;
			for (int var2 = 0; var2 < ZAYCIZYV.field1506; var2++) {
				if (!ZAYCIZYV.field1507[var2].field1513 && ZAYCIZYV.field1507[var2].field1508 == var1 + (field524 ? 0 : 7)) {
					field205[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method181(int arg0) {
		VTUPBFSN.method538(arg0);
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field951 != null) {
				return new URL("http://127.0.0.1:" + (field179 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIILVTUPBFSN;BIII)V")
	public final void method182(int arg0, int arg1, int arg2, VTUPBFSN arg3, int arg4, int arg5, int arg6) {
		if (arg3.field1371 == 0 && arg3.field1314 != null && !arg3.field1310 && (arg2 >= arg4 && arg5 >= arg6 && arg2 <= arg3.field1341 + arg4 && arg5 <= arg3.field1306 + arg6)) {
			int var8 = arg3.field1314.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field1320[var9] + arg4;
				int var11 = arg3.field1328[var9] + arg6 - arg1;
				VTUPBFSN var12 = VTUPBFSN.method544(arg3.field1314[var9]);
				var10 += var12.field1344;
				var11 += var12.field1332;
				if ((var12.field1315 >= 0 || var12.field1369 != 0) && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
					if (var12.field1315 >= 0) {
						field459 = var12.field1315;
					} else {
						field459 = var12.field1356;
					}
				}

				if (var12.field1371 == 8 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
					field535 = var12.field1356;
				}

				if (var12.field1371 == 0) {
					method182(arg0, var12.field1334, arg2, var12, var10, arg5, var11);

					if (var12.field1303 > var12.field1306) {
						method51(var11, var12, arg5, arg2, arg0, var12.field1303, var12.field1341 + var10, var12.field1306);
					}
				} else {
					if (var12.field1301 == 1 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						boolean var13 = false;
						if (var12.field1304 != 0) {
							var13 = method74(var12);
						}

						if (!var13) {
							field195[field487] = var12.field1312;
							field160[field487] = 715;
							field159[field487] = var12.field1356;
							field487++;
						}
					}

					if (var12.field1301 == 2 && field555 == 0 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						String var14 = var12.field1331;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field195[field487] = var14 + " @gre@" + var12.field1362;
						field160[field487] = 925;
						field159[field487] = var12.field1356;
						field487++;
					}

					if (var12.field1301 == 3 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						field195[field487] = "Close";

						if (arg0 == 3) {
							field160[field487] = 937;
						} else {
							field160[field487] = 892;
						}

						field159[field487] = var12.field1356;
						field487++;
					}

					if (var12.field1301 == 4 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						field195[field487] = var12.field1312;
						field160[field487] = 229;
						field159[field487] = var12.field1356;
						field487++;
					}

					if (var12.field1301 == 5 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						field195[field487] = var12.field1312;
						field160[field487] = 80;
						field159[field487] = var12.field1356;
						field487++;
					}

					if (var12.field1301 == 6 && !field522 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field1341 + var10 && arg5 < var12.field1306 + var11) {
						field195[field487] = var12.field1312;
						field160[field487] = 328;
						field159[field487] = var12.field1356;
						field487++;
					}

					if (var12.field1371 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1306; var16++) {
							for (int var17 = 0; var17 < var12.field1341; var17++) {
								int var18 = (var12.field1372 + 32) * var17 + var10;
								int var19 = (var12.field1337 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1338[var15];
									var19 += var12.field1316[var15];
								}

								if (arg2 >= var18 && arg5 >= var19 && arg2 < var18 + 32 && arg5 < var19 + 32) {
									field360 = var15;
									field361 = var12.field1356;

									if (var12.field1370[var15] > 0) {
										LAMDVZMU var20 = LAMDVZMU.method376(var12.field1370[var15] - 1);
										if (field126 == 1 && var12.field1364) {
											if (field128 != var12.field1356 || field127 != var15) {
												field195[field487] = "Use " + field130 + " with @lre@" + var20.field863;
												field160[field487] = 403;
												field161[field487] = var20.field888;
												field158[field487] = var15;
												field159[field487] = var12.field1356;
												field487++;
											}
										} else if (field555 != 1 || !var12.field1364) {
											if (var12.field1364) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field887 != null && var20.field887[var21] != null) {
														field195[field487] = var20.field887[var21] + " @lre@" + var20.field863;

														if (var21 == 3) {
															field160[field487] = 484;
														}

														if (var21 == 4) {
															field160[field487] = 851;
														}

														field161[field487] = var20.field888;
														field158[field487] = var15;
														field159[field487] = var12.field1356;
														field487++;
													} else if (var21 == 4) {
														field195[field487] = "Drop @lre@" + var20.field863;
														field160[field487] = 851;
														field161[field487] = var20.field888;
														field158[field487] = var15;
														field159[field487] = var12.field1356;
														field487++;
													}
												}
											}

											if (var12.field1319) {
												field195[field487] = "Use @lre@" + var20.field863;
												field160[field487] = 988;
												field161[field487] = var20.field888;
												field158[field487] = var15;
												field159[field487] = var12.field1356;
												field487++;
											}

											if (var12.field1364 && var20.field887 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field887[var22] != null) {
														field195[field487] = var20.field887[var22] + " @lre@" + var20.field863;

														if (var22 == 0) {
															field160[field487] = 599;
														}

														if (var22 == 1) {
															field160[field487] = 689;
														}

														if (var22 == 2) {
															field160[field487] = 533;
														}

														field161[field487] = var20.field888;
														field158[field487] = var15;
														field159[field487] = var12.field1356;
														field487++;
													}
												}
											}

											if (var12.field1368 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1368[var23] != null) {
														field195[field487] = var12.field1368[var23] + " @lre@" + var20.field863;

														if (var23 == 0) {
															field160[field487] = 254;
														}

														if (var23 == 1) {
															field160[field487] = 767;
														}

														if (var23 == 2) {
															field160[field487] = 858;
														}

														if (var23 == 3) {
															field160[field487] = 22;
														}

														if (var23 == 4) {
															field160[field487] = 974;
														}

														field161[field487] = var20.field888;
														field158[field487] = var15;
														field159[field487] = var12.field1356;
														field487++;
													}
												}
											}

											field195[field487] = "Examine @lre@" + var20.field863;
											field160[field487] = 1695;
											field161[field487] = var20.field888;
											field158[field487] = var15;
											field159[field487] = var12.field1356;
											field487++;
										} else if ((field557 & 0x10) == 0x10) {
											field195[field487] = field558 + " @lre@" + var20.field863;
											field160[field487] = 139;
											field161[field487] = var20.field888;
											field158[field487] = var15;
											field159[field487] = var12.field1356;
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

	@ObfuscatedName("client.R(I)V")
	public final void method183() {
		field494.method584();

		if (field207 == 2) {
			byte[] var1 = field430.field979;
			int[] var2 = BDJXDJBP.field46;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field237.method219(33, field229, 0, 25, 33, field306, 256, 0, field408, 25);
			field495.method584();
			AOGYQUKT.field32 = field313;
		} else {
			int var5 = field408 + field170 & 0x7FF;
			int var6 = field206.field584 / 32 + 48;
			int var7 = 464 - field206.field585 / 32;
			field486.method219(146, field165, 25, var6, 151, field338, field469 + 256, 5, var5, var7);
			field237.method219(33, field229, 0, 25, 33, field306, 256, 0, field408, 25);

			for (int var8 = 0; var8 < field443; var8++) {
				int var9 = field444[var8] * 4 + 2 - field206.field584 / 32;
				int var10 = field445[var8] * 4 + 2 - field206.field585 / 32;
				method186(var10, var9, field235[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					DMMTBJKZ var13 = field509[field238][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field206.field584 / 32;
						int var15 = var12 * 4 + 2 - field206.field585 / 32;
						method186(var15, var14, field196);
					}
				}
			}

			for (int var16 = 0; var16 < field246; var16++) {
				KLQFDPHO var17 = field245[field247[var16]];
				if (var17 != null && var17.method40()) {
					QYNFXHXW var18 = var17.field854;
					if (var18.field1172 != null) {
						var18 = var18.method508();
					}

					if (var18 != null && var18.field1142 && var18.field1154) {
						int var19 = var17.field584 / 32 - field206.field584 / 32;
						int var20 = var17.field585 / 32 - field206.field585 / 32;
						method186(var20, var19, field197);
					}
				}
			}

			for (int var21 = 0; var21 < field219; var21++) {
				BPHJJPRI var22 = field218[field220[var21]];
				if (var22 != null && var22.method40()) {
					int var23 = var22.field584 / 32 - field206.field584 / 32;
					int var24 = var22.field585 / 32 - field206.field585 / 32;
					boolean var25 = false;
					long var26 = LBMFERBT.method380(var22.field79);
					for (int var28 = 0; var28 < field326; var28++) {
						if (field139[var28] == var26 && field133[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field206.field78 != 0 && var22.field78 != 0 && field206.field78 == var22.field78) {
						var29 = true;
					}

					if (var25) {
						method186(var24, var23, field199);
					} else if (var29) {
						method186(var24, var23, field200);
					} else {
						method186(var24, var23, field198);
					}
				}
			}

			if (field347 != 0 && field531 % 20 < 10) {
				if (field347 == 1 && field282 >= 0 && field282 < field245.length) {
					KLQFDPHO var30 = field245[field282];
					if (var30 != null) {
						int var31 = var30.field584 / 32 - field206.field584 / 32;
						int var32 = var30.field585 / 32 - field206.field585 / 32;
						method142(field540, var31, var32);
					}
				}

				if (field347 == 2) {
					int var33 = (field273 - field318) * 4 + 2 - field206.field584 / 32;
					int var34 = (field274 - field319) * 4 + 2 - field206.field585 / 32;
					method142(field540, var33, var34);
				}

				if (field347 == 10 && field157 >= 0 && field157 < field218.length) {
					BPHJJPRI var35 = field218[field157];
					if (var35 != null) {
						int var36 = var35.field584 / 32 - field206.field584 / 32;
						int var37 = var35.field585 / 32 - field206.field585 / 32;
						method142(field540, var36, var37);
					}
				}
			}

			if (field484 != 0) {
				int var38 = field484 * 4 + 2 - field206.field584 / 32;
				int var39 = field485 * 4 + 2 - field206.field585 / 32;
				method186(var39, var38, field539);
			}

			BDJXDJBP.method29(97, 3, 0xFFFFFF, 78, 3);
			field495.method584();
			AOGYQUKT.field32 = field313;
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method184(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field162[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field359[var6][var4][var5] + field359[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field359[var6][var4][var5 + 1] + field359[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method185(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IILEFVUNBHT;I)V")
	public final void method186(int arg0, int arg1, EFVUNBHT arg2) {
		if (arg2 != null) {
			int var4 = field408 + field170 & 0x7FF;
			int var5 = arg0 * arg0 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = OJGAHFXC.field1080[var4];
				int var7 = OJGAHFXC.field1081[var4];
				var6 = var6 * 256 / (field469 + 256);
				var7 = var7 * 256 / (field469 + 256);
				int var8 = arg0 * var6 + arg1 * var7 >> 16;
				int var9 = arg0 * var7 - arg1 * var6 >> 16;
				if (var5 > 2500) {
					arg2.method221(field430, var8 + 94 + 4 - arg2.field671 / 2, 83 - var9 - arg2.field672 / 2 - 4);
				} else {
					arg2.method215(var8 + 94 + 4 - arg2.field671 / 2, 83 - var9 - arg2.field672 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIB)Ljava/lang/String;")
	public static final String method187(int arg0, int arg1) {
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

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method188(long arg0) {
		if (arg0 != 0L) {
			if (field326 >= 100 && field325 != 1) {
				method110(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field326 >= 200) {
				method110(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = LBMFERBT.method384(LBMFERBT.method381(arg0));
				for (int var4 = 0; var4 < field326; var4++) {
					if (field139[var4] == arg0) {
						method110(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field201; var5++) {
					if (field348[var5] == arg0) {
						method110(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field206.field79)) {
					field463[field326] = var3;
					field139[field326] = arg0;
					field133[field326] = 0;
					field326++;
					field315 = true;
					field283.method228(169);
					field283.method235(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void method189() {
		try {
			int var1 = field206.field584 + field418;
			int var2 = field206.field585 + field167;
			if (field258 - var1 < -500 || field258 - var1 > 500 || field259 - var2 < -500 || field259 - var2 > 500) {
				field258 = var1;
				field259 = var2;
			}

			if (field258 != var1) {
				field258 += (var1 - field258) / 16;
			}

			if (field259 != var2) {
				field259 += (var2 - field259) / 16;
			}

			if (field966[1] == 1) {
				field409 += (-field409 - 24) / 2;
			} else if (field966[2] == 1) {
				field409 += (24 - field409) / 2;
			} else {
				field409 /= 2;
			}

			if (field966[3] == 1) {
				field410 += (12 - field410) / 2;
			} else if (field966[4] == 1) {
				field410 += (-field410 - 12) / 2;
			} else {
				field410 /= 2;
			}

			field408 = field409 / 2 + field408 & 0x7FF;
			field407 += field410 / 2;
			if (field407 < 128) {
				field407 = 128;
			}

			if (field407 > 383) {
				field407 = 383;
			}

			field356++;
			if (field356 > 87) {
				field356 = 0;
				field283.method228(126);
			}

			int var3 = field258 >> 7;
			int var4 = field259 >> 7;
			int var5 = method184(field238, field258, field259);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field238;
						if (var9 < 3 && (field162[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field359[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			field536++;
			if (field536 > 1173) {
				field536 = 0;
				field283.method228(51);
				field283.method229(0);
				int var11 = field283.field679;

				if ((int) (Math.random() * 2.0D) == 0) {
					field283.method229(121);
				}

				field283.method230(18414);

				if ((int) (Math.random() * 2.0D) == 0) {
					field283.method230(40463);
				}

				field283.method229(204);
				field283.method230((int) (Math.random() * 65536.0D));
				field283.method229(234);
				field283.method230(21482);
				field283.method229((int) (Math.random() * 256.0D));
				field283.method230(51762);
				field283.method229((int) (Math.random() * 256.0D));
				field283.method238(field283.field679 - var11);
			}

			int var12 = var6 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}

			if (var12 < 32768) {
				var12 = 32768;
			}

			if (var12 > field457) {
				field457 += (var12 - field457) / 24;
			} else if (var12 < field457) {
				field457 += (var12 - field457) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field206.field584 + "," + field206.field585 + "," + field258 + "," + field259 + "," + field471 + "," + field472 + "," + field318 + "," + field319);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.T(I)Z")
	public final boolean method190() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.U(I)V")
	public final void method191() {
		if (field181 && field262 == 2 && PMIXOPWJ.field1109 != field238) {
			method87("Loading - please wait.", null);
			field262 = 1;
			field426 = System.currentTimeMillis();
		}

		if (field262 == 1) {
			int var1 = method192();
			if (var1 != 0 && System.currentTimeMillis() - field426 > 360000L) {
				signlink.reporterror(field152 + " glcfb " + field188 + "," + var1 + "," + field181 + "," + field370[0] + "," + field308.method575() + "," + field238 + "," + field471 + "," + field472);
				field426 = System.currentTimeMillis();
			}
		}

		if (field262 == 2 && field534 != field238) {
			field534 = field238;
			method156(field238);
		}
	}

	@ObfuscatedName("client.V(I)I")
	public final int method192() {
		for (int var1 = 0; var1 < field300.length; var1++) {
			if (field300[var1] == null && field342[var1] != -1) {
				return -1;
			}

			if (field155[var1] == null && field343[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field300.length; var3++) {
			byte[] var4 = field155[var3];
			if (var4 != null) {
				int var5 = (field341[var3] >> 8) * 64 - field318;
				int var6 = (field341[var3] & 0xFF) * 64 - field319;
				if (field488) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= PMIXOPWJ.method454(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field135) {
			return -4;
		} else {
			field262 = 2;
			PMIXOPWJ.field1109 = field238;
			method166();
			field283.method228(18);
			return 0;
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field131[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field225[var3] = var2 / 4;
		}
	}
}
