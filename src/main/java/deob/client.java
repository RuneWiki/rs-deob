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
public final class client extends AYIVJZQQ {

	@ObfuscatedName("client.M")
	public int[] field167 = new int[5];

	@ObfuscatedName("client.N")
	public String field168 = "";

	@ObfuscatedName("client.O")
	public String field169 = "";

	@ObfuscatedName("client.P")
	public volatile boolean field170 = false;

	@ObfuscatedName("client.S")
	public boolean field173 = false;

	@ObfuscatedName("client.db")
	public int[] field183 = new int[50];

	@ObfuscatedName("client.hb")
	public int[][] field186 = new int[104][104];

	@ObfuscatedName("client.kb")
	public int field188 = 2;

	@ObfuscatedName("client.lb")
	public int field189 = -1;

	@ObfuscatedName("client.mb")
	public int[] field190 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ub")
	public int[][] field197 = new int[104][104];

	@ObfuscatedName("client.vb")
	public GLMIQHJI field198 = GLMIQHJI.method232(1);

	@ObfuscatedName("client.yb")
	public VLLJSJTJ field200 = new VLLJSJTJ();

	@ObfuscatedName("client.zb")
	public CRC32 field201 = new CRC32();

	@ObfuscatedName("client.Ab")
	public byte[] field202 = new byte[16384];

	@ObfuscatedName("client.Bb")
	public int field203 = -1;

	@ObfuscatedName("client.Db")
	public int[] field204 = new int[151];

	@ObfuscatedName("client.Tb")
	public boolean field219 = false;

	@ObfuscatedName("client.Vb")
	public boolean field221 = false;

	@ObfuscatedName("client.Xb")
	public int field223 = 3;

	@ObfuscatedName("client.cc")
	public boolean field227 = false;

	@ObfuscatedName("client.pc")
	public VUMXQDFQ[] field238 = new VUMXQDFQ[13];

	@ObfuscatedName("client.rc")
	public int field240 = -1;

	@ObfuscatedName("client.yc")
	public GLMIQHJI field247 = GLMIQHJI.method232(1);

	@ObfuscatedName("client.zc")
	public int[] field248 = new int[100];

	@ObfuscatedName("client.Ac")
	public String[] field249 = new String[100];

	@ObfuscatedName("client.Bc")
	public String[] field250 = new String[100];

	@ObfuscatedName("client.Ec")
	public boolean field252 = true;

	@ObfuscatedName("client.Nc")
	public int field261 = -1;

	@ObfuscatedName("client.Sc")
	public volatile boolean field266 = false;

	@ObfuscatedName("client.Tc")
	public int field267 = -1;

	@ObfuscatedName("client.Xc")
	public String field270 = "";

	@ObfuscatedName("client.Yc")
	public int field271 = -1;

	@ObfuscatedName("client.Zc")
	public String[] field272 = new String[5];

	@ObfuscatedName("client.ad")
	public boolean[] field273 = new boolean[5];

	@ObfuscatedName("client.fd")
	public int field278 = 128;

	@ObfuscatedName("client.jd")
	public final int field282 = 100;

	@ObfuscatedName("client.kd")
	public int[] field283 = new int[100];

	@ObfuscatedName("client.ld")
	public int[][] field284 = new int[104][104];

	@ObfuscatedName("client.md")
	public String field285 = "";

	@ObfuscatedName("client.nd")
	public String field286 = "";

	@ObfuscatedName("client.vd")
	public int[] field293 = new int[1000];

	@ObfuscatedName("client.wd")
	public int[] field294 = new int[1000];

	@ObfuscatedName("client.xd")
	public int[] field295 = new int[50];

	@ObfuscatedName("client.Ad")
	public boolean field298 = true;

	@ObfuscatedName("client.Bd")
	public volatile boolean field299 = false;

	@ObfuscatedName("client.Hd")
	public long[] field305 = new long[100];

	@ObfuscatedName("client.Ld")
	public boolean field309 = false;

	@ObfuscatedName("client.Pd")
	public GLMIQHJI field312 = GLMIQHJI.method232(1);

	@ObfuscatedName("client.Td")
	public boolean field315 = false;

	@ObfuscatedName("client.Ud")
	public int[] field316 = new int[200];

	@ObfuscatedName("client.Wd")
	public int field318 = 1;

	@ObfuscatedName("client.de")
	public VLLJSJTJ field325 = new VLLJSJTJ();

	@ObfuscatedName("client.ee")
	public int[] field326 = new int[YBPDMGDP.field1432];

	@ObfuscatedName("client.ge")
	public INVDQNJU[] field327 = new INVDQNJU[100];

	@ObfuscatedName("client.me")
	public boolean field333 = false;

	@ObfuscatedName("client.ne")
	public int[] field334 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.oe")
	public int[] field335 = new int[151];

	@ObfuscatedName("client.pe")
	public int field336 = 0x766654;

	@ObfuscatedName("client.se")
	public int[] field339 = new int[33];

	@ObfuscatedName("client.xe")
	public boolean field344 = false;

	@ObfuscatedName("client.ye")
	public int field345 = 0x4D4233;

	@ObfuscatedName("client.De")
	public String field348 = "";

	@ObfuscatedName("client.Ge")
	public INVDQNJU[] field350 = new INVDQNJU[20];

	@ObfuscatedName("client.Qe")
	public int field359 = 2048;

	@ObfuscatedName("client.Re")
	public int field360 = 2047;

	@ObfuscatedName("client.Se")
	public PASMQFXV[] field361 = new PASMQFXV[field359];

	@ObfuscatedName("client.Ue")
	public int[] field363 = new int[field359];

	@ObfuscatedName("client.We")
	public int[] field365 = new int[field359];

	@ObfuscatedName("client.Xe")
	public GLMIQHJI[] field366 = new GLMIQHJI[field359];

	@ObfuscatedName("client.Ze")
	public int[] field368 = new int[YBPDMGDP.field1432];

	@ObfuscatedName("client.af")
	public int[] field369 = new int[33];

	@ObfuscatedName("client.bf")
	public VLLJSJTJ field370 = new VLLJSJTJ();

	@ObfuscatedName("client.cf")
	public int field371 = 78;

	@ObfuscatedName("client.ff")
	public int[] field373 = new int[5];

	@ObfuscatedName("client.of")
	public boolean field381 = false;

	@ObfuscatedName("client.qf")
	public boolean field383 = false;

	@ObfuscatedName("client.zf")
	public int field392 = -1;

	@ObfuscatedName("client.Af")
	public int field393 = -1;

	@ObfuscatedName("client.Bf")
	public int field394 = -1;

	@ObfuscatedName("client.Gf")
	public boolean field398 = false;

	@ObfuscatedName("client.Kf")
	public int[] field400 = new int[256];

	@ObfuscatedName("client.Mf")
	public GLMIQHJI field401 = new GLMIQHJI(new byte[5000]);

	@ObfuscatedName("client.Nf")
	public QDXHSLSL[] field402 = new QDXHSLSL[16384];

	@ObfuscatedName("client.Pf")
	public int[] field404 = new int[16384];

	@ObfuscatedName("client.Uf")
	public VUMXQDFQ[] field409 = new VUMXQDFQ[100];

	@ObfuscatedName("client.Vf")
	public boolean field410 = false;

	@ObfuscatedName("client.Zf")
	public int field413 = -1;

	@ObfuscatedName("client.bg")
	public EMCOJCFH[] field415 = new EMCOJCFH[4];

	@ObfuscatedName("client.cg")
	public boolean field416 = false;

	@ObfuscatedName("client.eg")
	public VUMXQDFQ[] field418 = new VUMXQDFQ[2];

	@ObfuscatedName("client.pg")
	public int[] field429 = new int[2000];

	@ObfuscatedName("client.qg")
	public int[][][] field430 = new int[4][13][13];

	@ObfuscatedName("client.sg")
	public int field432 = 1;

	@ObfuscatedName("client.tg")
	public int[] field433 = new int[500];

	@ObfuscatedName("client.ug")
	public int[] field434 = new int[500];

	@ObfuscatedName("client.vg")
	public int[] field435 = new int[500];

	@ObfuscatedName("client.wg")
	public int[] field436 = new int[500];

	@ObfuscatedName("client.Ig")
	public String[] field445 = new String[200];

	@ObfuscatedName("client.Mg")
	public int[] field448 = new int[5];

	@ObfuscatedName("client.Ng")
	public int[] field449 = new int[9];

	@ObfuscatedName("client.Og")
	public int[] field450 = new int[2000];

	@ObfuscatedName("client.Qg")
	public int field451 = -1;

	@ObfuscatedName("client.Wg")
	public String field457 = "";

	@ObfuscatedName("client.mh")
	public int[] field471 = new int[5];

	@ObfuscatedName("client.nh")
	public boolean field472 = false;

	@ObfuscatedName("client.ph")
	public int field474 = 2;

	@ObfuscatedName("client.xh")
	public int[] field482 = new int[1000];

	@ObfuscatedName("client.Bh")
	public String field486 = "";

	@ObfuscatedName("client.Ch")
	public int field487 = 0x332D25;

	@ObfuscatedName("client.Fh")
	public boolean field488 = false;

	@ObfuscatedName("client.Jh")
	public INVDQNJU[] field491 = new INVDQNJU[20];

	@ObfuscatedName("client.Nh")
	public int field495 = -1;

	@ObfuscatedName("client.Oh")
	public boolean field496 = false;

	@ObfuscatedName("client.Uh")
	public long[] field502 = new long[200];

	@ObfuscatedName("client.Xh")
	public VLLJSJTJ[][][] field505 = new VLLJSJTJ[4][104][104];

	@ObfuscatedName("client.Yh")
	public boolean field506 = true;

	@ObfuscatedName("client.bi")
	public int field509 = 2;

	@ObfuscatedName("client.ji")
	public boolean field515 = false;

	@ObfuscatedName("client.mi")
	public boolean field517 = true;

	@ObfuscatedName("client.oi")
	public final int[] field519 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.pi")
	public boolean field520 = false;

	@ObfuscatedName("client.Ai")
	public int field531 = -1;

	@ObfuscatedName("client.Di")
	public int[] field534 = new int[5];

	@ObfuscatedName("client.Ki")
	public boolean field539 = false;

	@ObfuscatedName("client.Li")
	public String field540 = "";

	@ObfuscatedName("client.Mi")
	public VSBCWAVP[] field541 = new VSBCWAVP[5];

	@ObfuscatedName("client.Ni")
	public int[] field542 = new int[4000];

	@ObfuscatedName("client.Oi")
	public int[] field543 = new int[4000];

	@ObfuscatedName("client.Pi")
	public int[] field544 = new int[50];

	@ObfuscatedName("client.Qi")
	public boolean[] field545 = new boolean[5];

	@ObfuscatedName("client.Xi")
	public int field552 = 0x23201B;

	@ObfuscatedName("client.Yi")
	public boolean field553 = false;

	@ObfuscatedName("client.Zi")
	public boolean field554 = false;

	@ObfuscatedName("client.aj")
	public int[] field555 = new int[YBPDMGDP.field1432];

	@ObfuscatedName("client.dj")
	public boolean field557 = false;

	@ObfuscatedName("client.ej")
	public int field558 = -1;

	@ObfuscatedName("client.pj")
	public USEDZXXV field567 = new USEDZXXV();

	@ObfuscatedName("client.qj")
	public boolean field568 = true;

	@ObfuscatedName("client.tj")
	public INVDQNJU[] field571 = new INVDQNJU[1000];

	@ObfuscatedName("client.uj")
	public INVDQNJU[] field572 = new INVDQNJU[8];

	@ObfuscatedName("client.zj")
	public int field576 = 50;

	@ObfuscatedName("client.Aj")
	public int[] field577 = new int[field576];

	@ObfuscatedName("client.Bj")
	public int[] field578 = new int[field576];

	@ObfuscatedName("client.Cj")
	public int[] field579 = new int[field576];

	@ObfuscatedName("client.Dj")
	public int[] field580 = new int[field576];

	@ObfuscatedName("client.Ej")
	public int[] field581 = new int[field576];

	@ObfuscatedName("client.Fj")
	public int[] field582 = new int[field576];

	@ObfuscatedName("client.Gj")
	public int[] field583 = new int[field576];

	@ObfuscatedName("client.Hj")
	public String[] field584 = new String[field576];

	@ObfuscatedName("client.Jj")
	public String[] field585 = new String[500];

	@ObfuscatedName("client.Kj")
	public int[] field586 = new int[7];

	@ObfuscatedName("client.tb")
	public static BigInteger field196 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Lb")
	public static int field211 = 10;

	@ObfuscatedName("client.Nb")
	public static boolean field213 = true;

	@ObfuscatedName("client.hc")
	public static String field232 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.qc")
	public static BigInteger field239 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sd")
	public static final int[] field290 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Xd")
	public static int[] field319 = new int[99];

	@ObfuscatedName("client.pf")
	public static final int[][] field382 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.ni")
	public static int[] field518 = new int[32];

	@ObfuscatedName("client.K")
	public static int field165;

	@ObfuscatedName("client.L")
	public int field166;

	@ObfuscatedName("client.Q")
	public int field171;

	@ObfuscatedName("client.R")
	public int field172;

	@ObfuscatedName("client.T")
	public int field174;

	@ObfuscatedName("client.U")
	public int field175;

	@ObfuscatedName("client.V")
	public int field176;

	@ObfuscatedName("client.X")
	public int field177;

	@ObfuscatedName("client.bb")
	public int field181;

	@ObfuscatedName("client.fb")
	public int field184;

	@ObfuscatedName("client.jb")
	public int field187;

	@ObfuscatedName("client.pb")
	public int field192;

	@ObfuscatedName("client.qb")
	public int field193;

	@ObfuscatedName("client.rb")
	public int field194;

	@ObfuscatedName("client.wb")
	public int field199;

	@ObfuscatedName("client.Fb")
	public int field206;

	@ObfuscatedName("client.Gb")
	public int field207;

	@ObfuscatedName("client.Hb")
	public int field208;

	@ObfuscatedName("client.Ib")
	public int field209;

	@ObfuscatedName("client.Jb")
	public int field210;

	@ObfuscatedName("client.Mb")
	public static int field212;

	@ObfuscatedName("client.Pb")
	public static int field215;

	@ObfuscatedName("client.Qb")
	public int field216;

	@ObfuscatedName("client.Rb")
	public int field217;

	@ObfuscatedName("client.Sb")
	public int field218;

	@ObfuscatedName("client.Ub")
	public int field220;

	@ObfuscatedName("client.Yb")
	public int field224;

	@ObfuscatedName("client.Zb")
	public int field225;

	@ObfuscatedName("client.bc")
	public int field226;

	@ObfuscatedName("client.gc")
	public int field231;

	@ObfuscatedName("client.lc")
	public int field236;

	@ObfuscatedName("client.sc")
	public int field241;

	@ObfuscatedName("client.Dc")
	public static int field251;

	@ObfuscatedName("client.Fc")
	public int field253;

	@ObfuscatedName("client.Gc")
	public static int field254;

	@ObfuscatedName("client.Hc")
	public int field255;

	@ObfuscatedName("client.Ic")
	public int field256;

	@ObfuscatedName("client.Jc")
	public int field257;

	@ObfuscatedName("client.Kc")
	public int field258;

	@ObfuscatedName("client.Lc")
	public int field259;

	@ObfuscatedName("client.Mc")
	public int field260;

	@ObfuscatedName("client.Pc")
	public static int field263;

	@ObfuscatedName("client.Qc")
	public int field264;

	@ObfuscatedName("client.Rc")
	public int field265;

	@ObfuscatedName("client.bd")
	public static int field274;

	@ObfuscatedName("client.ed")
	public static int field277;

	@ObfuscatedName("client.gd")
	public int field279;

	@ObfuscatedName("client.hd")
	public int field280;

	@ObfuscatedName("client.id")
	public int field281;

	@ObfuscatedName("client.qd")
	public int field289;

	@ObfuscatedName("client.td")
	public int field291;

	@ObfuscatedName("client.ud")
	public int field292;

	@ObfuscatedName("client.yd")
	public int field296;

	@ObfuscatedName("client.zd")
	public int field297;

	@ObfuscatedName("client.Cd")
	public int field300;

	@ObfuscatedName("client.Dd")
	public int field301;

	@ObfuscatedName("client.Ed")
	public int field302;

	@ObfuscatedName("client.Fd")
	public int field303;

	@ObfuscatedName("client.Id")
	public int field306;

	@ObfuscatedName("client.Jd")
	public static int field307;

	@ObfuscatedName("client.Kd")
	public int field308;

	@ObfuscatedName("client.Nd")
	public int field310;

	@ObfuscatedName("client.Od")
	public int field311;

	@ObfuscatedName("client.Qd")
	public int field313;

	@ObfuscatedName("client.Rd")
	public int field314;

	@ObfuscatedName("client.Vd")
	public int field317;

	@ObfuscatedName("client.he")
	public int field328;

	@ObfuscatedName("client.ie")
	public int field329;

	@ObfuscatedName("client.je")
	public int field330;

	@ObfuscatedName("client.ke")
	public int field331;

	@ObfuscatedName("client.le")
	public int field332;

	@ObfuscatedName("client.qe")
	public int field337;

	@ObfuscatedName("client.te")
	public int field340;

	@ObfuscatedName("client.ue")
	public int field341;

	@ObfuscatedName("client.ve")
	public int field342;

	@ObfuscatedName("client.we")
	public int field343;

	@ObfuscatedName("client.ze")
	public int field346;

	@ObfuscatedName("client.Be")
	public int field347;

	@ObfuscatedName("client.Fe")
	public int field349;

	@ObfuscatedName("client.Ke")
	public int field354;

	@ObfuscatedName("client.Le")
	public int field355;

	@ObfuscatedName("client.Me")
	public int field356;

	@ObfuscatedName("client.Ne")
	public int field357;

	@ObfuscatedName("client.Oe")
	public int field358;

	@ObfuscatedName("client.Te")
	public int field362;

	@ObfuscatedName("client.Ve")
	public int field364;

	@ObfuscatedName("client.Ye")
	public int field367;

	@ObfuscatedName("client.hf")
	public static int field375;

	@ObfuscatedName("client.jf")
	public int field376;

	@ObfuscatedName("client.lf")
	public int field378;

	@ObfuscatedName("client.mf")
	public int field379;

	@ObfuscatedName("client.nf")
	public int field380;

	@ObfuscatedName("client.rf")
	public int field384;

	@ObfuscatedName("client.sf")
	public int field385;

	@ObfuscatedName("client.tf")
	public int field386;

	@ObfuscatedName("client.uf")
	public int field387;

	@ObfuscatedName("client.yf")
	public int field391;

	@ObfuscatedName("client.Cf")
	public int field395;

	@ObfuscatedName("client.Df")
	public int field396;

	@ObfuscatedName("client.Jf")
	public int field399;

	@ObfuscatedName("client.Of")
	public int field403;

	@ObfuscatedName("client.Xf")
	public int field412;

	@ObfuscatedName("client.dg")
	public int field417;

	@ObfuscatedName("client.og")
	public int field428;

	@ObfuscatedName("client.rg")
	public int field431;

	@ObfuscatedName("client.Cg")
	public int field439;

	@ObfuscatedName("client.Dg")
	public int field440;

	@ObfuscatedName("client.Eg")
	public int field441;

	@ObfuscatedName("client.Fg")
	public int field442;

	@ObfuscatedName("client.Gg")
	public int field443;

	@ObfuscatedName("client.Hg")
	public static int field444;

	@ObfuscatedName("client.Jg")
	public int field446;

	@ObfuscatedName("client.Kg")
	public static int field447;

	@ObfuscatedName("client.Rg")
	public int field452;

	@ObfuscatedName("client.Sg")
	public int field453;

	@ObfuscatedName("client.Tg")
	public int field454;

	@ObfuscatedName("client.Ug")
	public int field455;

	@ObfuscatedName("client.Vg")
	public int field456;

	@ObfuscatedName("client.Xg")
	public int field458;

	@ObfuscatedName("client.Yg")
	public static int field459;

	@ObfuscatedName("client.jh")
	public int field469;

	@ObfuscatedName("client.kh")
	public int field470;

	@ObfuscatedName("client.oh")
	public int field473;

	@ObfuscatedName("client.vh")
	public static int field480;

	@ObfuscatedName("client.wh")
	public int field481;

	@ObfuscatedName("client.yh")
	public int field483;

	@ObfuscatedName("client.zh")
	public int field484;

	@ObfuscatedName("client.Ah")
	public static int field485;

	@ObfuscatedName("client.Kh")
	public int field492;

	@ObfuscatedName("client.Lh")
	public int field493;

	@ObfuscatedName("client.Ph")
	public int field497;

	@ObfuscatedName("client.Qh")
	public int field498;

	@ObfuscatedName("client.Rh")
	public int field499;

	@ObfuscatedName("client.Sh")
	public int field500;

	@ObfuscatedName("client.Th")
	public int field501;

	@ObfuscatedName("client.Vh")
	public int field503;

	@ObfuscatedName("client.Wh")
	public int field504;

	@ObfuscatedName("client.Zh")
	public int field507;

	@ObfuscatedName("client.ai")
	public int field508;

	@ObfuscatedName("client.ti")
	public int field524;

	@ObfuscatedName("client.ui")
	public int field525;

	@ObfuscatedName("client.vi")
	public int field526;

	@ObfuscatedName("client.wi")
	public int field527;

	@ObfuscatedName("client.xi")
	public int field528;

	@ObfuscatedName("client.yi")
	public int field529;

	@ObfuscatedName("client.zi")
	public int field530;

	@ObfuscatedName("client.Bi")
	public int field532;

	@ObfuscatedName("client.Ci")
	public static int field533;

	@ObfuscatedName("client.Hi")
	public static int field536;

	@ObfuscatedName("client.Ii")
	public int field537;

	@ObfuscatedName("client.Ji")
	public int field538;

	@ObfuscatedName("client.Ri")
	public static int field546;

	@ObfuscatedName("client.Si")
	public int field547;

	@ObfuscatedName("client.Ti")
	public int field548;

	@ObfuscatedName("client.Ui")
	public int field549;

	@ObfuscatedName("client.Vi")
	public int field550;

	@ObfuscatedName("client.Wi")
	public int field551;

	@ObfuscatedName("client.fj")
	public int field559;

	@ObfuscatedName("client.jj")
	public static int field563;

	@ObfuscatedName("client.rj")
	public int field569;

	@ObfuscatedName("client.sj")
	public int field570;

	@ObfuscatedName("client.yj")
	public int field575;

	@ObfuscatedName("client.Wb")
	public long field222;

	@ObfuscatedName("client.gf")
	public long field374;

	@ObfuscatedName("client.Gh")
	public long field489;

	@ObfuscatedName("client.Ih")
	public long field490;

	@ObfuscatedName("client.bj")
	public long field556;

	@ObfuscatedName("client.gb")
	public BPJMPIUS field185;

	@ObfuscatedName("client.Qf")
	public DBRMEPJQ field405;

	@ObfuscatedName("client.Rf")
	public DBRMEPJQ field406;

	@ObfuscatedName("client.Sf")
	public DBRMEPJQ field407;

	@ObfuscatedName("client.Tf")
	public DBRMEPJQ field408;

	@ObfuscatedName("client.ic")
	public INVDQNJU field233;

	@ObfuscatedName("client.tc")
	public INVDQNJU field242;

	@ObfuscatedName("client.uc")
	public INVDQNJU field243;

	@ObfuscatedName("client.vc")
	public INVDQNJU field244;

	@ObfuscatedName("client.wc")
	public INVDQNJU field245;

	@ObfuscatedName("client.xc")
	public INVDQNJU field246;

	@ObfuscatedName("client.Uc")
	public INVDQNJU field268;

	@ObfuscatedName("client.Vc")
	public INVDQNJU field269;

	@ObfuscatedName("client.wf")
	public INVDQNJU field389;

	@ObfuscatedName("client.xf")
	public INVDQNJU field390;

	@ObfuscatedName("client.Mh")
	public INVDQNJU field494;

	@ObfuscatedName("client.kj")
	public INVDQNJU field564;

	@ObfuscatedName("client.lj")
	public INVDQNJU field565;

	@ObfuscatedName("client.nj")
	public INVDQNJU field566;

	@ObfuscatedName("client.Ff")
	public LJVKCVYD field397;

	@ObfuscatedName("client.cb")
	public LNOSHUMO field182;

	@ObfuscatedName("client.Y")
	public NUXCAHZM field178;

	@ObfuscatedName("client.Z")
	public NUXCAHZM field179;

	@ObfuscatedName("client.ab")
	public NUXCAHZM field180;

	@ObfuscatedName("client.Zd")
	public NUXCAHZM field321;

	@ObfuscatedName("client.ae")
	public NUXCAHZM field322;

	@ObfuscatedName("client.be")
	public NUXCAHZM field323;

	@ObfuscatedName("client.ce")
	public NUXCAHZM field324;

	@ObfuscatedName("client.fg")
	public NUXCAHZM field419;

	@ObfuscatedName("client.gg")
	public NUXCAHZM field420;

	@ObfuscatedName("client.hg")
	public NUXCAHZM field421;

	@ObfuscatedName("client.ig")
	public NUXCAHZM field422;

	@ObfuscatedName("client.jg")
	public NUXCAHZM field423;

	@ObfuscatedName("client.kg")
	public NUXCAHZM field424;

	@ObfuscatedName("client.lg")
	public NUXCAHZM field425;

	@ObfuscatedName("client.mg")
	public NUXCAHZM field426;

	@ObfuscatedName("client.ng")
	public NUXCAHZM field427;

	@ObfuscatedName("client.ah")
	public NUXCAHZM field460;

	@ObfuscatedName("client.bh")
	public NUXCAHZM field461;

	@ObfuscatedName("client.ch")
	public NUXCAHZM field462;

	@ObfuscatedName("client.dh")
	public NUXCAHZM field463;

	@ObfuscatedName("client.eh")
	public NUXCAHZM field464;

	@ObfuscatedName("client.fh")
	public NUXCAHZM field465;

	@ObfuscatedName("client.gh")
	public NUXCAHZM field466;

	@ObfuscatedName("client.hh")
	public NUXCAHZM field467;

	@ObfuscatedName("client.ih")
	public NUXCAHZM field468;

	@ObfuscatedName("client.Gi")
	public static PASMQFXV field535;

	@ObfuscatedName("client.nb")
	public QLFNWQSF field191;

	@ObfuscatedName("client.dc")
	public VUMXQDFQ field228;

	@ObfuscatedName("client.ec")
	public VUMXQDFQ field229;

	@ObfuscatedName("client.fc")
	public VUMXQDFQ field230;

	@ObfuscatedName("client.od")
	public VUMXQDFQ field287;

	@ObfuscatedName("client.pd")
	public VUMXQDFQ field288;

	@ObfuscatedName("client.He")
	public VUMXQDFQ field351;

	@ObfuscatedName("client.Ie")
	public VUMXQDFQ field352;

	@ObfuscatedName("client.Je")
	public VUMXQDFQ field353;

	@ObfuscatedName("client.qh")
	public VUMXQDFQ field475;

	@ObfuscatedName("client.rh")
	public VUMXQDFQ field476;

	@ObfuscatedName("client.sh")
	public VUMXQDFQ field477;

	@ObfuscatedName("client.th")
	public VUMXQDFQ field478;

	@ObfuscatedName("client.uh")
	public VUMXQDFQ field479;

	@ObfuscatedName("client.ei")
	public VUMXQDFQ field510;

	@ObfuscatedName("client.fi")
	public VUMXQDFQ field511;

	@ObfuscatedName("client.gi")
	public VUMXQDFQ field512;

	@ObfuscatedName("client.hi")
	public VUMXQDFQ field513;

	@ObfuscatedName("client.ii")
	public VUMXQDFQ field514;

	@ObfuscatedName("client.wj")
	public VUMXQDFQ field573;

	@ObfuscatedName("client.xj")
	public VUMXQDFQ field574;

	@ObfuscatedName("client.xg")
	public WTODRXXL field437;

	@ObfuscatedName("client.ag")
	public XRWUKRPO field414;

	@ObfuscatedName("client.sb")
	public String field195;

	@ObfuscatedName("client.Eb")
	public String field205;

	@ObfuscatedName("client.re")
	public String field338;

	@ObfuscatedName("client.vf")
	public String field388;

	@ObfuscatedName("client.Wf")
	public Socket field411;

	@ObfuscatedName("client.Ob")
	public static boolean field214;

	@ObfuscatedName("client.Gd")
	public static boolean field304;

	@ObfuscatedName("client.df")
	public static boolean field372;

	@ObfuscatedName("client.ki")
	public static boolean field516;

	@ObfuscatedName("client.jc")
	public int[] field234;

	@ObfuscatedName("client.kc")
	public int[] field235;

	@ObfuscatedName("client.cd")
	public int[] field275;

	@ObfuscatedName("client.dd")
	public int[] field276;

	@ObfuscatedName("client.qi")
	public int[] field521;

	@ObfuscatedName("client.ri")
	public int[] field522;

	@ObfuscatedName("client.si")
	public int[] field523;

	@ObfuscatedName("client.gj")
	public int[] field560;

	@ObfuscatedName("client.hj")
	public int[] field561;

	@ObfuscatedName("client.ij")
	public int[] field562;

	@ObfuscatedName("client.Lj")
	public int[] field587;

	@ObfuscatedName("client.Mj")
	public int[] field588;

	@ObfuscatedName("client.Nj")
	public int[] field589;

	@ObfuscatedName("client.Oj")
	public int[] field590;

	@ObfuscatedName("client.Ag")
	public VUMXQDFQ[] field438;

	@ObfuscatedName("client.mc")
	public byte[][] field237;

	@ObfuscatedName("client.Yd")
	public byte[][] field320;

	@ObfuscatedName("client.kf")
	public byte[][][] field377;

	@ObfuscatedName("client.Oc")
	public int[][][] field262;

	public final void init() {
		field211 = Integer.parseInt(getParameter("nodeid"));
		field212 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method89();
		} else {
			method42();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field213 = false;
		} else {
			field213 = true;
		}

		method15(765, 503);
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method32() {
		int var1 = field497 * 128 + 64;
		int var2 = field498 * 128 + 64;
		int var3 = method119(var2, field530, var1) - field499;

		if (field206 < var1) {
			field206 += (var1 - field206) * field501 / 1000 + field500;
			if (field206 > var1) {
				field206 = var1;
			}
		}

		if (field206 > var1) {
			field206 -= (field206 - var1) * field501 / 1000 + field500;
			if (field206 < var1) {
				field206 = var1;
			}
		}

		if (field207 < var3) {
			field207 += (var3 - field207) * field501 / 1000 + field500;
			if (field207 > var3) {
				field207 = var3;
			}
		}

		if (field207 > var3) {
			field207 -= (field207 - var3) * field501 / 1000 + field500;
			if (field207 < var3) {
				field207 = var3;
			}
		}

		if (field208 < var2) {
			field208 += (var2 - field208) * field501 / 1000 + field500;
			if (field208 > var2) {
				field208 = var2;
			}
		}

		if (field208 > var2) {
			field208 -= (field208 - var2) * field501 / 1000 + field500;
			if (field208 < var2) {
				field208 = var2;
			}
		}

		int var4 = field525 * 128 + 64;
		int var5 = field526 * 128 + 64;
		int var6 = method119(var5, field530, var4) - field527;
		int var7 = var4 - field206;
		int var8 = var6 - field207;
		int var9 = var5 - field208;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field209 < var11) {
			field209 += (var11 - field209) * field529 / 1000 + field528;
			if (field209 > var11) {
				field209 = var11;
			}
		}

		if (field209 > var11) {
			field209 -= (field209 - var11) * field529 / 1000 + field528;
			if (field209 < var11) {
				field209 = var11;
			}
		}

		int var13 = var12 - field210;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field210 += field529 * var13 / 1000 + field528;
			field210 &= 0x7FF;
		}

		if (var13 < 0) {
			field210 -= -var13 * field529 / 1000 + field528;
			field210 &= 0x7FF;
		}

		int var14 = var12 - field210;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field210 = var12;
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method33(long arg0) {
		if (arg0 != 0L) {
			if (field171 >= 100 && field559 != 1) {
				method155("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field171 >= 200) {
				method155("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = YYRFHIVS.method587(YYRFHIVS.method584(arg0));
				for (int var4 = 0; var4 < field171; var4++) {
					if (field502[var4] == arg0) {
						method155(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field181; var5++) {
					if (field305[var5] == arg0) {
						method155("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field535.field936)) {
					field445[field171] = var3;
					field502[field171] = arg0;
					field316[field171] = 0;
					field171++;
					field410 = true;
					field198.method233(77);
					field198.method240(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method34(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field250[var4] != null) {
				int var5 = field248[var4];
				int var6 = field174 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field249[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field504 == 0 || field504 == 1 && method56(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field535.field936)) {
						if (field311 >= 1) {
							field585[field503] = "Report abuse @whi@" + var7;
							field435[field503] = 811;
							field503++;
						}

						field585[field503] = "Add ignore @whi@" + var7;
						field435[field503] = 694;
						field503++;
						field585[field503] = "Add friend @whi@" + var7;
						field435[field503] = 730;
						field503++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field265 == 0 && (var5 == 7 || field349 == 0 || field349 == 1 && method56(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field311 >= 1) {
							field585[field503] = "Report abuse @whi@" + var7;
							field435[field503] = 811;
							field503++;
						}

						field585[field503] = "Add ignore @whi@" + var7;
						field435[field503] = 694;
						field503++;
						field585[field503] = "Add friend @whi@" + var7;
						field435[field503] = 730;
						field503++;
					}

					var3++;
				}

				if (var5 == 4 && (field255 == 0 || field255 == 1 && method56(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field585[field503] = "Accept trade @whi@" + var7;
						field435[field503] = 757;
						field503++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field265 == 0 && field349 < 2) {
					var3++;
				}

				if (var5 == 8 && (field255 == 0 || field255 == 1 && method56(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field585[field503] = "Accept challenge @whi@" + var7;
						field435[field503] = 709;
						field503++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method35(int arg0) {
		int var2 = BIGJGRMT.field83[arg0].field91;
		if (var2 != 0) {
			int var3 = field450[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					CUVGZBEX.method181(0.9D);
				}

				if (var3 == 2) {
					CUVGZBEX.method181(0.8D);
				}

				if (var3 == 3) {
					CUVGZBEX.method181(0.7D);
				}

				if (var3 == 4) {
					CUVGZBEX.method181(0.6D);
				}

				AVSLDGMK.field34.method287();
				field227 = true;
			}

			if (var2 == 3) {
				boolean var4 = field517;

				if (var3 == 0) {
					method76(field517, 0);
					field517 = true;
				}

				if (var3 == 1) {
					method76(field517, -400);
					field517 = true;
				}

				if (var3 == 2) {
					method76(field517, -800);
					field517 = true;
				}

				if (var3 == 3) {
					method76(field517, -1200);
					field517 = true;
				}

				if (var3 == 4) {
					field517 = false;
				}

				if (field517 != var4 && !field214) {
					if (field517) {
						field297 = field189;
						field298 = true;
						field182.method365(2, field297);
					} else {
						method109();
					}

					field225 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field568 = true;
					method69(0);
				}

				if (var3 == 1) {
					field568 = true;
					method69(-400);
				}

				if (var3 == 2) {
					field568 = true;
					method69(-800);
				}

				if (var3 == 3) {
					field568 = true;
					method69(-1200);
				}

				if (var3 == 4) {
					field568 = false;
				}
			}

			if (var2 == 5) {
				field308 = var3;
			}

			if (var2 == 6) {
				field306 = var3;
			}

			if (var2 == 8) {
				field265 = var3;
				field553 = true;
			}

			if (var2 == 9) {
				field570 = var3;
			}
		}
	}

	public final void run() {
		if (field170) {
			method63();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method36() {
		int var1 = field453;
		int var2 = field454;
		int var3 = field455;
		int var4 = field456;
		int var5 = 0x5D5447;
		TQHEKXXC.method478(var3, var1, var5, var2, var4);
		TQHEKXXC.method478(var3 - 2, var1 + 1, 0, var2 + 1, 16);
		TQHEKXXC.method479(0, var4 - 19, var3 - 2, var2 + 18, var1 + 1);
		field407.method194("Choose Option", var5, var1 + 3, var2 + 14);
		int var6 = field68;
		int var7 = field69;
		if (field452 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field452 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field452 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field503; var8++) {
			int var9 = (field503 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field407.method198(field585[var8], var9, true, var1 + 3, var10);
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method37() {
		if (field549 == 0) {
			field585[0] = "Cancel";
			field435[0] = 1545;
			field503 = 1;
			method94();
			field175 = 0;

			if (field68 > 4 && field69 > 4 && field68 < 516 && field69 < 338) {
				if (field203 == -1) {
					method151();
				} else {
					method122(4, 0, 4, USEDZXXV.field1113[field203], field68, field69);
				}
			}

			if (field220 != field175) {
				field220 = field175;
			}

			field175 = 0;

			if (field68 > 553 && field69 > 205 && field68 < 743 && field69 < 466) {
				if (field240 != -1) {
					method122(553, 0, 205, USEDZXXV.field1113[field240], field68, field69);
				} else if (field334[field223] != -1) {
					method122(553, 0, 205, USEDZXXV.field1113[field334[field223]], field68, field69);
				}
			}

			if (field260 != field175) {
				field410 = true;
				field260 = field175;
			}

			field175 = 0;

			if (field68 > 17 && field69 > 357 && field68 < 496 && field69 < 453) {
				if (field531 != -1) {
					method122(17, 0, 357, USEDZXXV.field1113[field531], field68, field69);
				} else if (field69 < 434 && field68 < 426) {
					method34(field68 - 17, field69 - 357);
				}
			}

			if (field531 != -1 && field443 != field175) {
				field553 = true;
				field443 = field175;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field503 - 1; var2++) {
					if (field435[var2] < 1000 && field435[var2 + 1] > 1000) {
						String var3 = field585[var2];
						field585[var2] = field585[var2 + 1];
						field585[var2 + 1] = var3;
						int var4 = field435[var2];
						field435[var2] = field435[var2 + 1];
						field435[var2 + 1] = var4;
						int var5 = field433[var2];
						field433[var2] = field433[var2 + 1];
						field433[var2 + 1] = var5;
						int var6 = field434[var2];
						field434[var2] = field434[var2 + 1];
						field434[var2 + 1] = var6;
						int var7 = field436[var2];
						field436[var2] = field436[var2 + 1];
						field436[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method38(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field171; var3++) {
				if (field502[var3] == arg0) {
					field171--;
					field410 = true;

					for (int var4 = var3; var4 < field171; var4++) {
						field445[var4] = field445[var4 + 1];
						field316[var4] = field316[var4 + 1];
						field502[var4] = field502[var4 + 1];
					}

					field198.method233(54);
					field198.method240(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method39() {
		while (true) {
			int var1 = method18();
			if (var1 == -1) {
				return;
			}

			if (field203 != -1 && field558 == field203) {
				if (var1 == 8 && field457.length() > 0) {
					field457 = field457.substring(0, field457.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field457.length() < 12) {
					field457 = field457 + (char) var1;
				}
			} else if (field381) {
				if (var1 >= 32 && var1 <= 122 && field348.length() < 80) {
					field348 = field348 + (char) var1;
					field553 = true;
				}

				if (var1 == 8 && field348.length() > 0) {
					field348 = field348.substring(0, field348.length() - 1);
					field553 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field381 = false;
					field553 = true;

					if (field236 == 1) {
						long var2 = YYRFHIVS.method583(field348);
						method33(var2);
					}

					if (field236 == 2 && field171 > 0) {
						long var4 = YYRFHIVS.method583(field348);
						method38(var4);
					}

					if (field236 == 3 && field348.length() > 0) {
						field198.method233(242);
						field198.method234(0);
						int var6 = field198.field709;
						field198.method240(field490);
						KUSEAONH.method344(field348, field198);
						field198.method243(field198.field709 - var6);
						field348 = KUSEAONH.method345(field348);
						field348 = HUPJRXOW.method298(field348);
						method155(field348, YYRFHIVS.method587(YYRFHIVS.method584(field490)), 6);

						if (field349 == 2) {
							field349 = 1;
							field221 = true;
							field198.method233(52);
							field198.method234(field504);
							field198.method234(field349);
							field198.method234(field255);
						}
					}

					if (field236 == 4 && field181 < 100) {
						long var7 = YYRFHIVS.method583(field348);
						method163(var7);
					}

					if (field236 == 5 && field181 > 0) {
						long var9 = YYRFHIVS.method583(field348);
						method154(var9);
					}
				}
			} else if (field367 == 1) {
				if (var1 >= 48 && var1 <= 57 && field486.length() < 10) {
					field486 = field486 + (char) var1;
					field553 = true;
				}

				if (var1 == 8 && field486.length() > 0) {
					field486 = field486.substring(0, field486.length() - 1);
					field553 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field486.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field486);
						} catch (Exception var21) {
						}

						field198.method233(183);
						field198.method238(var11);
					}

					field367 = 0;
					field553 = true;
				}
			} else if (field367 == 2) {
				if (var1 >= 32 && var1 <= 122 && field486.length() < 12) {
					field486 = field486 + (char) var1;
					field553 = true;
				}

				if (var1 == 8 && field486.length() > 0) {
					field486 = field486.substring(0, field486.length() - 1);
					field553 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field486.length() > 0) {
						field198.method233(49);
						field198.method240(YYRFHIVS.method583(field486));
					}

					field367 = 0;
					field553 = true;
				}
			} else if (field531 == -1) {
				if (var1 >= 32 && var1 <= 122 && field270.length() < 80) {
					field270 = field270 + (char) var1;
					field553 = true;
				}

				if (var1 == 8 && field270.length() > 0) {
					field270 = field270.substring(0, field270.length() - 1);
					field553 = true;
				}

				if ((var1 == 13 || var1 == 10) && field270.length() > 0) {
					if (field311 == 2) {
						if (field270.equals("::clientdrop")) {
							method52();
						}

						if (field270.equals("::lag")) {
							method134();
						}

						if (field270.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field182.method374(2); var12++) {
								field182.method373(2, (byte) 1, var12);
							}
						}

						if (field270.equals("::fpson")) {
							field516 = true;
						}

						if (field270.equals("::fpsoff")) {
							field516 = false;
						}

						if (field270.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field415[var13].field668[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field270.startsWith("::")) {
						field198.method233(150);
						field198.method234(field270.length() - 1);
						field198.method241(field270.substring(2));
					} else {
						String var16 = field270.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field270 = field270.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field270 = field270.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field270 = field270.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field270 = field270.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field270 = field270.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field270 = field270.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field270 = field270.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field270 = field270.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field270 = field270.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field270 = field270.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field270 = field270.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field270 = field270.substring(6);
						}

						String var18 = field270.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field270 = field270.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field270 = field270.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field270 = field270.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field270 = field270.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field270 = field270.substring(6);
						}

						field198.method233(85);
						field198.method234(0);
						int var20 = field198.field709;
						field198.method260(var17);
						field198.method262(var19);
						field401.field709 = 0;
						KUSEAONH.method344(field270, field401);
						field198.method279(field401.field708, 0, field401.field709);
						field198.method243(field198.field709 - var20);
						field270 = KUSEAONH.method345(field270);
						field270 = HUPJRXOW.method298(field270);
						field535.field1289 = field270;
						field535.field1274 = var17;
						field535.field1290 = var19;
						field535.field1270 = 150;

						if (field311 == 2) {
							method155(field535.field1289, "@cr2@" + field535.field936, 2);
						} else if (field311 == 1) {
							method155(field535.field1289, "@cr1@" + field535.field936, 2);
						} else {
							method155(field535.field1289, field535.field936, 2);
						}

						if (field504 == 2) {
							field504 = 3;
							field221 = true;
							field198.method233(52);
							field198.method234(field504);
							field198.method234(field349);
							field198.method234(field255);
						}
					}

					field270 = "";
					field553 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method40() {
		int var1 = 3;
		if (field209 < 310) {
			int var2 = field206 >> 7;
			int var3 = field208 >> 7;
			int var4 = field535.field1292 >> 7;
			int var5 = field535.field1293 >> 7;

			if ((field377[field530][var2][var3] & 0x4) != 0) {
				var1 = field530;
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

					if ((field377[field530][var2][var3] & 0x4) != 0) {
						var1 = field530;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field377[field530][var2][var3] & 0x4) != 0) {
							var1 = field530;
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

					if ((field377[field530][var2][var3] & 0x4) != 0) {
						var1 = field530;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field377[field530][var2][var3] & 0x4) != 0) {
							var1 = field530;
						}
					}
				}
			}
		}

		if ((field377[field530][field535.field1292 >> 7][field535.field1293 >> 7] & 0x4) != 0) {
			var1 = field530;
		}

		return var1;
	}

	@ObfuscatedName("client.e(Z)I")
	public final int method41() {
		int var1 = method119(field208, field530, field206);
		if (var1 - field207 < 800 && (field377[field530][field206 >> 7][field208 >> 7] & 0x4) != 0) {
			return field530;
		}

		return 3;
	}

	@ObfuscatedName("client.f(Z)V")
	public static final void method42() {
		QLFNWQSF.field973 = false;
		CUVGZBEX.field598 = false;
		field214 = false;
		WYBZGYVK.field1381 = false;
		RFUKTMBK.field1063 = false;
	}

	@ObfuscatedName("client.a(LGLMIQHJI;IB)V")
	public final void method43(GLMIQHJI arg0, int arg1) {
		int var3 = arg0.method255(8);
		if (var3 < field362) {
			for (int var4 = var3; var4 < field362; var4++) {
				field482[field481++] = field363[var4];
			}
		}

		if (var3 > field362) {
			signlink.reporterror(field168 + " Too many players");
			throw new RuntimeException("eek");
		}

		field362 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field363[var5];
			PASMQFXV var7 = field361[var6];
			int var8 = arg0.method255(1);
			if (var8 == 0) {
				field363[field362++] = var6;
				var7.field1287 = field307;
			} else {
				int var9 = arg0.method255(2);
				if (var9 == 0) {
					field363[field362++] = var6;
					var7.field1287 = field307;
					field365[field364++] = var6;
				} else if (var9 == 1) {
					field363[field362++] = var6;
					var7.field1287 = field307;
					int var10 = arg0.method255(3);
					var7.method544(false, var10);
					int var11 = arg0.method255(1);
					if (var11 == 1) {
						field365[field364++] = var6;
					}
				} else if (var9 == 2) {
					field363[field362++] = var6;
					var7.field1287 = field307;
					int var12 = arg0.method255(3);
					var7.method544(true, var12);
					int var13 = arg0.method255(3);
					var7.method544(true, var13);
					int var14 = arg0.method255(1);
					if (var14 == 1) {
						field365[field364++] = var6;
					}
				} else if (var9 == 3) {
					field482[field481++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method44() {
		byte[] var1 = field414.method581("title.dat", null);
		INVDQNJU var2 = new INVDQNJU(var1, this);
		field463.method393();
		var2.method329(0, 0);
		field464.method393();
		var2.method329(-637, 0);
		field460.method393();
		var2.method329(-128, 0);
		field461.method393();
		var2.method329(-202, -371);
		field462.method393();
		var2.method329(-202, -171);
		field465.method393();
		var2.method329(0, -265);
		field466.method393();
		var2.method329(-562, -265);
		field467.method393();
		var2.method329(-128, -171);
		field468.method393();
		var2.method329(-562, -171);
		int[] var3 = new int[var2.field759];
		for (int var4 = 0; var4 < var2.field760; var4++) {
			for (int var5 = 0; var5 < var2.field759; var5++) {
				var3[var5] = var2.field758[var2.field759 * var4 + var2.field759 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field759; var6++) {
				var2.field758[var2.field759 * var4 + var6] = var3[var6];
			}
		}

		field463.method393();
		var2.method329(382, 0);
		field464.method393();
		var2.method329(-255, 0);
		field460.method393();
		var2.method329(254, 0);
		field461.method393();
		var2.method329(180, -371);
		field462.method393();
		var2.method329(180, -171);
		field465.method393();
		var2.method329(382, -265);
		field466.method393();
		var2.method329(-180, -265);
		field467.method393();
		var2.method329(254, -171);
		field468.method393();
		var2.method329(-180, -171);
		INVDQNJU var7 = new INVDQNJU(field414, "logo", 0);
		field460.method393();
		var7.method331(382 - var7.field759 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(II)V")
	public final void method45(int arg0) {
		if (arg0 >= 0) {
			if (field367 != 0) {
				field367 = 0;
				field553 = true;
			}

			int var2 = field433[arg0];
			int var3 = field434[arg0];
			int var4 = field435[arg0];
			int var5 = field436[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 750) {
				boolean var6 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
				if (!var6) {
					method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
				}

				field256 = field75;
				field257 = field76;
				field259 = 2;
				field258 = 0;
				field198.method233(5);
				field198.method235(var5);
				field198.method269(field341 + var3);
				field198.method235(field340 + var2);
			}

			if (var4 == 111) {
				field480 += field340;
				if (field480 >= 50) {
					field198.method233(163);
					field198.method237(0x711A14);
					field480 = 0;
				}

				method65(var5, var3, var2);
				field198.method233(194);
				field198.method270(var5 >> 14 & 0x7FFF);
				field198.method271(field340 + var2);
				field198.method270(field341 + var3);
			}

			if (var4 == 294) {
				field198.method233(66);
				field198.method271(var3);
				field198.method269(field193);
				field198.method270(var2);
				field198.method269(var5);
				field300 = 0;
				field301 = var3;
				field302 = var2;
				field303 = 2;
				if (USEDZXXV.field1113[var3].field1153 == field203) {
					field303 = 1;
				}

				if (USEDZXXV.field1113[var3].field1153 == field531) {
					field303 = 3;
				}
			}

			if (var4 == 610) {
				if (field398) {
					field191.method449(var3 - 4, var2 - 4);
				} else {
					field191.method449(field76 - 4, field75 - 4);
				}
			}

			if (var4 == 1297) {
				AVSLDGMK var8 = AVSLDGMK.method4(var5);
				String var9;
				if (var8.field45 == null) {
					var9 = "It's a " + var8.field33 + ".";
				} else {
					var9 = new String(var8.field45);
				}

				method155(var9, "", 0);
			}

			if (var4 == 137) {
				field198.method233(83);
				field198.method235(var3);
				USEDZXXV var10 = USEDZXXV.field1113[var3];
				if (var10.field1145 != null && var10.field1145[0][0] == 5) {
					int var11 = var10.field1145[0][1];
					if (field450[var11] != var10.field1162[0]) {
						field450[var11] = var10.field1162[0];
						method35(var11);
						field410 = true;
					}
				}
			}

			if (var4 == 806 && !field557) {
				field198.method233(105);
				field198.method235(var3);
				field557 = true;
			}

			if (var4 == 532) {
				field274 += var2;
				if (field274 >= 100) {
					field198.method233(58);
					field198.method235(10898);
					field274 = 0;
				}

				field198.method233(100);
				field198.method235(var2);
				field198.method235(var5);
				field198.method271(var3);
				field300 = 0;
				field301 = var3;
				field302 = var2;
				field303 = 2;
				if (USEDZXXV.field1113[var3].field1153 == field203) {
					field303 = 1;
				}

				if (USEDZXXV.field1113[var3].field1153 == field531) {
					field303 = 3;
				}
			}

			if (var4 == 630) {
				field263++;
				if (field263 >= 96) {
					field198.method233(139);
					field198.method234(169);
					field263 = 0;
				}

				field198.method233(239);
				field198.method271(var3);
				field198.method269(var2);
				field198.method271(var5);
				field300 = 0;
				field301 = var3;
				field302 = var2;
				field303 = 2;
				if (USEDZXXV.field1113[var3].field1153 == field203) {
					field303 = 1;
				}

				if (USEDZXXV.field1113[var3].field1153 == field531) {
					field303 = 3;
				}
			}

			if (var4 == 1714) {
				int var12 = var5 >> 14 & 0x7FFF;
				RFUKTMBK var13 = RFUKTMBK.method472(var12);
				String var14;
				if (var13.field1078 == null) {
					var14 = "It's a " + var13.field1068 + ".";
				} else {
					var14 = new String(var13.field1078);
				}

				method155(var14, "", 0);
			}

			if (var4 == 873) {
				QDXHSLSL var15 = field402[var5];
				if (var15 != null) {
					method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var15.field1308[0], field535.field1308[0], var15.field1309[0]);
					field256 = field75;
					field257 = field76;
					field259 = 2;
					field258 = 0;
					field198.method233(220);
					field198.method235(field193);
					field198.method235(var5);
				}
			}

			if (var4 == 959) {
				field384 = 1;
				field385 = var2;
				field386 = var3;
				field387 = var5;
				field388 = AVSLDGMK.method4(var5).field33;
				field192 = 0;
				field410 = true;
			} else {
				if (var4 == 730 || var4 == 694 || var4 == 994 || var4 == 759) {
					String var16 = field585[arg0];
					int var17 = var16.indexOf("@whi@");
					if (var17 != -1) {
						long var18 = YYRFHIVS.method583(var16.substring(var17 + 5).trim());
						if (var4 == 730) {
							method33(var18);
						}

						if (var4 == 694) {
							method163(var18);
						}

						if (var4 == 994) {
							method38(var18);
						}

						if (var4 == 759) {
							method154(var18);
						}
					}
				}

				if (var4 == 482) {
					USEDZXXV var20 = USEDZXXV.field1113[var3];
					field192 = 1;
					field193 = var3;
					field194 = var20.field1148;
					field384 = 0;
					field410 = true;
					String var21 = var20.field1109;
					if (var21.indexOf(" ") != -1) {
						var21 = var21.substring(0, var21.indexOf(" "));
					}

					String var22 = var20.field1109;
					if (var22.indexOf(" ") != -1) {
						var22 = var22.substring(var22.indexOf(" ") + 1);
					}

					field195 = var21 + " " + var20.field1123 + " " + var22;

					if (field194 == 16) {
						field410 = true;
						field223 = 3;
						field344 = true;
					}
				} else {
					if (var4 == 818) {
						QDXHSLSL var23 = field402[var5];
						if (var23 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var23.field1308[0], field535.field1308[0], var23.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(7);
							field198.method235(field386);
							field198.method269(field387);
							field198.method269(field385);
							field198.method270(var5);
						}
					}

					if (var4 == 401) {
						PASMQFXV var24 = field361[var5];
						if (var24 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var24.field1308[0], field535.field1308[0], var24.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(28);
							field198.method271(var5);
						}
					}

					if (var4 == 8) {
						field198.method233(72);
						field198.method271(var2);
						field198.method270(var5);
						field198.method235(var3);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 302) {
						String var25 = field585[arg0];
						int var26 = var25.indexOf("@whi@");
						if (var26 != -1) {
							long var27 = YYRFHIVS.method583(var25.substring(var26 + 5).trim());
							int var29 = -1;
							for (int var30 = 0; var30 < field171; var30++) {
								if (field502[var30] == var27) {
									var29 = var30;
									break;
								}
							}

							if (var29 != -1 && field316[var29] > 0) {
								field553 = true;
								field367 = 0;
								field381 = true;
								field348 = "";
								field236 = 3;
								field490 = field502[var29];
								field540 = "Enter message to send to " + field445[var29];
							}
						}
					}

					if (var4 == 915) {
						PASMQFXV var31 = field361[var5];
						if (var31 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var31.field1308[0], field535.field1308[0], var31.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(75);
							field198.method269(var5);
						}
					}

					if (var4 == 51) {
						field198.method233(83);
						field198.method235(var3);
						USEDZXXV var32 = USEDZXXV.field1113[var3];
						if (var32.field1145 != null && var32.field1145[0][0] == 5) {
							int var33 = var32.field1145[0][1];
							field450[var33] = 1 - field450[var33];
							method35(var33);
							field410 = true;
						}
					}

					if (var4 == 708) {
						field198.method233(182);
						field198.method269(var3);
						field198.method235(var2);
						field198.method271(var5);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 751) {
						PASMQFXV var34 = field361[var5];
						if (var34 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var34.field1308[0], field535.field1308[0], var34.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(98);
							field198.method235(field193);
							field198.method271(var5);
						}
					}

					if (var4 == 247) {
						boolean var35 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var35) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(171);
						field198.method271(field341 + var3);
						field198.method271(var5);
						field198.method235(field340 + var2);
					}

					if (var4 == 236) {
						method140();
					}

					if (var4 == 1101) {
						QDXHSLSL var37 = field402[var5];
						if (var37 != null) {
							LPTCUHOU var38 = var37.field972;
							if (var38.field888 != null) {
								var38 = var38.method383();
							}

							if (var38 != null) {
								String var39;
								if (var38.field895 == null) {
									var39 = "It's a " + var38.field864 + ".";
								} else {
									var39 = new String(var38.field895);
								}

								method155(var39, "", 0);
							}
						}
					}

					if (var4 == 516) {
						boolean var40 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var40) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(184);
						field198.method271(var5);
						field198.method271(field193);
						field198.method270(field340 + var2);
						field198.method235(field341 + var3);
					}

					if (var4 == 811) {
						String var42 = field585[arg0];
						int var43 = var42.indexOf("@whi@");
						if (var43 != -1) {
							if (field203 == -1) {
								method140();
								field457 = var42.substring(var43 + 5).trim();
								field515 = false;

								for (int var44 = 0; var44 < USEDZXXV.field1113.length; var44++) {
									if (USEDZXXV.field1113[var44] != null && USEDZXXV.field1113[var44].field1157 == 600) {
										field558 = field203 = USEDZXXV.field1113[var44].field1153;
										break;
									}
								}
							} else {
								method155("Please close the interface you have open before using 'report abuse'", "", 0);
							}
						}
					}

					if (var4 == 686) {
						method65(var5, var3, var2);
						field198.method233(168);
						field198.method235(field340 + var2);
						field198.method271(var5 >> 14 & 0x7FFF);
						field198.method271(field341 + var3);
					}

					if (var4 == 337) {
						QDXHSLSL var45 = field402[var5];
						if (var45 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var45.field1308[0], field535.field1308[0], var45.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(2);
							field198.method271(var5);
						}
					}

					if (var4 == 262 && method65(var5, var3, var2)) {
						field198.method233(204);
						field198.method269(field340 + var2);
						field198.method235(field341 + var3);
						field198.method235(field385);
						field198.method269(field387);
						field198.method271(field386);
						field198.method235(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 903) {
						field198.method233(40);
						field198.method235(var5);
						field198.method270(var3);
						field198.method269(var2);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 355) {
						field198.method233(109);
						field198.method270(var5);
						field198.method269(var3);
						field198.method270(var2);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 16 && method65(var5, var3, var2)) {
						field198.method233(170);
						field198.method270(var5 >> 14 & 0x7FFF);
						field198.method269(field193);
						field198.method270(field340 + var2);
						field198.method269(field341 + var3);
					}

					if (var4 == 448) {
						PASMQFXV var46 = field361[var5];
						if (var46 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var46.field1308[0], field535.field1308[0], var46.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(248);
							field198.method270(field386);
							field198.method271(field387);
							field198.method271(field385);
							field198.method270(var5);
						}
					}

					if (var4 == 321) {
						boolean var47 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var47) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(190);
						field198.method269(field340 + var2);
						field198.method269(field341 + var3);
						field198.method235(var5);
					}

					if (var4 == 677) {
						QDXHSLSL var49 = field402[var5];
						if (var49 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var49.field1308[0], field535.field1308[0], var49.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(207);
							field198.method271(var5);
						}
					}

					if (var4 == 331) {
						QDXHSLSL var50 = field402[var5];
						if (var50 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var50.field1308[0], field535.field1308[0], var50.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(94);
							field198.method270(var5);
						}
					}

					if (var4 == 820) {
						PASMQFXV var51 = field361[var5];
						if (var51 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var51.field1308[0], field535.field1308[0], var51.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(88);
							field198.method269(var5);
						}
					}

					if (var4 == 132) {
						field198.method233(195);
						field198.method269(var5);
						field198.method235(var3);
						field198.method269(var2);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 1463) {
						AVSLDGMK var52 = AVSLDGMK.method4(var5);
						USEDZXXV var53 = USEDZXXV.field1113[var3];
						String var54;
						if (var53 != null && var53.field1169[var2] >= 100000) {
							var54 = var53.field1169[var2] + " x " + var52.field33;
						} else if (var52.field45 == null) {
							var54 = "It's a " + var52.field33 + ".";
						} else {
							var54 = new String(var52.field45);
						}

						method155(var54, "", 0);
					}

					if (var4 == 30) {
						QDXHSLSL var55 = field402[var5];
						if (var55 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var55.field1308[0], field535.field1308[0], var55.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(251);
							field198.method271(var5);
						}
					}

					if (var4 == 992) {
						boolean var56 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var56) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(15);
						field198.method270(field387);
						field198.method271(field386);
						field198.method269(field341 + var3);
						field198.method269(field340 + var2);
						field198.method269(field385);
						field198.method269(var5);
					}

					if (var4 == 41) {
						QDXHSLSL var58 = field402[var5];
						if (var58 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var58.field1308[0], field535.field1308[0], var58.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(249);
							field198.method271(var5);
						}
					}

					if (var4 == 391) {
						method65(var5, var3, var2);
						field198.method233(107);
						field198.method235(field340 + var2);
						field198.method271(var5 >> 14 & 0x7FFF);
						field198.method235(field341 + var3);
					}

					if (var4 == 12) {
						boolean var59 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var59) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(222);
						field198.method271(field340 + var2);
						field198.method235(field341 + var3);
						field198.method235(var5);
					}

					if (var4 == 416) {
						field546++;
						if (field546 >= 91) {
							field198.method233(210);
							field198.method234(234);
							field546 = 0;
						}

						field198.method233(18);
						field198.method235(var5);
						field198.method235(var2);
						field198.method271(var3);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 766) {
						PASMQFXV var61 = field361[var5];
						if (var61 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var61.field1308[0], field535.field1308[0], var61.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;

							if ((var5 & 0x3) == 0) {
								field447++;
							}

							if (field447 >= 79) {
								field198.method233(79);
								field198.method237(0xC2D643);
								field447 = 0;
							}

							field198.method233(96);
							field198.method269(var5);
						}
					}

					if (var4 == 485) {
						field198.method233(84);
						field198.method235(var2);
						field198.method235(field387);
						field198.method271(field385);
						field198.method269(var3);
						field198.method235(var5);
						field198.method271(field386);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 612) {
						USEDZXXV var62 = USEDZXXV.field1113[var3];
						boolean var63 = true;
						if (var62.field1157 > 0) {
							var63 = method137(var62);
						}

						if (var63) {
							field198.method233(83);
							field198.method235(var3);
						}
					}

					if (var4 == 757 || var4 == 709) {
						String var64 = field585[arg0];
						int var65 = var64.indexOf("@whi@");
						if (var65 != -1) {
							var64 = var64.substring(var65 + 5).trim();
							String var66 = YYRFHIVS.method587(YYRFHIVS.method584(YYRFHIVS.method583(var64)));
							boolean var67 = false;
							for (int var68 = 0; var68 < field362; var68++) {
								PASMQFXV var69 = field361[field363[var68]];
								if (var69 != null && var69.field936 != null && var69.field936.equalsIgnoreCase(var66)) {
									method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var69.field1308[0], field535.field1308[0], var69.field1309[0]);

									if (var4 == 757) {
										if ((var5 & 0x3) == 0) {
											field447++;
										}

										if (field447 >= 79) {
											field198.method233(79);
											field198.method237(0xC2D643);
											field447 = 0;
										}

										field198.method233(96);
										field198.method269(field363[var68]);
									}

									if (var4 == 709) {
										field198.method233(123);
										field198.method235(field363[var68]);
									}

									var67 = true;
									break;
								}
							}

							if (!var67) {
								method155("Unable to find " + var66, "", 0);
							}
						}
					}

					if (var4 == 10) {
						field198.method233(32);
						field198.method271(var2);
						field198.method235(var3);
						field198.method235(var5);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 237) {
						method65(var5, var3, var2);
						field198.method233(138);
						field198.method235(var5 >> 14 & 0x7FFF);
						field198.method270(field340 + var2);
						field198.method269(field341 + var3);
					}

					if (var4 == 375) {
						field198.method233(216);
						field198.method235(var3);
						field198.method235(var5);
						field198.method270(var2);
						field300 = 0;
						field301 = var3;
						field302 = var2;
						field303 = 2;
						if (USEDZXXV.field1113[var3].field1153 == field203) {
							field303 = 1;
						}

						if (USEDZXXV.field1113[var3].field1153 == field531) {
							field303 = 3;
						}
					}

					if (var4 == 801) {
						boolean var70 = method48(0, 0, 0, 2, false, 0, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						if (!var70) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var2, field535.field1308[0], var3);
						}

						field256 = field75;
						field257 = field76;
						field259 = 2;
						field258 = 0;
						field198.method233(6);
						field198.method235(field340 + var2);
						field198.method269(var5);
						field198.method270(field341 + var3);
					}

					if (var4 == 1938) {
						field444++;
						if (field444 >= 134) {
							field198.method233(119);
							field198.method234(190);
							field444 = 0;
						}

						method65(var5, var3, var2);
						field198.method233(152);
						field198.method269(field340 + var2);
						field198.method270(field341 + var3);
						field198.method270(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 380) {
						PASMQFXV var72 = field361[var5];
						if (var72 != null) {
							method48(1, 0, 0, 2, false, 1, 0, field535.field1309[0], var72.field1308[0], field535.field1308[0], var72.field1309[0]);
							field256 = field75;
							field257 = field76;
							field259 = 2;
							field258 = 0;
							field198.method233(123);
							field198.method235(var5);
						}
					}

					field384 = 0;
					field192 = 0;
					field410 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method46() {
		for (EWLVGVJE var1 = (EWLVGVJE) field325.method528(); var1 != null; var1 = (EWLVGVJE) field325.method530()) {
			if (field530 != var1.field671 || var1.field669) {
				var1.method555();
			} else if (field307 >= var1.field670) {
				var1.method218(field176);

				if (var1.field669) {
					var1.method555();
				} else {
					field191.method422(var1.field671, false, -1, var1, var1.field673, var1.field672, 0, 60, var1.field674);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method47(boolean arg0) {
		method138();
		field462.method393();
		field573.method542(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field412 == 0) {
			int var4 = var3 / 2 + 80;
			field405.method191(var2 / 2, var4, 0x75A9A9, field182.field826, true);
			int var5 = var3 / 2 - 20;
			field407.method191(var2 / 2, var5, 0xFFFF00, "Welcome to RuneScape", true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field574.method542(var6 - 73, var7 - 20);
			field407.method191(var6, var7 + 5, 0xFFFFFF, "New User", true);
			int var8 = var2 / 2 + 80;
			field574.method542(var8 - 73, var7 - 20);
			field407.method191(var8, var7 + 5, 0xFFFFFF, "Existing User", true);
		}

		if (field412 == 2) {
			int var9 = var3 / 2 - 40;
			if (field285.length() > 0) {
				field407.method191(var2 / 2, var9 - 15, 0xFFFF00, field285, true);
				field407.method191(var2 / 2, var9, 0xFFFF00, field286, true);
				var9 += 30;
			} else {
				field407.method191(var2 / 2, var9 - 7, 0xFFFF00, field286, true);
				var9 += 30;
			}

			field407.method198("Username: " + field168 + (field507 == 0 & field307 % 40 < 20 ? "@yel@|" : ""), var9, true, var2 / 2 - 90, 0xFFFFFF);
			var9 += 15;
			field407.method198("Password: " + YYRFHIVS.method588(field169) + (field507 == 1 & field307 % 40 < 20 ? "@yel@|" : ""), var9, true, var2 / 2 - 88, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field574.method542(var10 - 73, var11 - 20);
				field407.method191(var10, var11 + 5, 0xFFFFFF, "Login", true);
				int var12 = var2 / 2 + 80;
				field574.method542(var12 - 73, var11 - 20);
				field407.method191(var12, var11 + 5, 0xFFFFFF, "Cancel", true);
			}
		}

		if (field412 == 3) {
			field407.method191(var2 / 2, var3 / 2 - 60, 0xFFFF00, "Create a free account", true);
			int var13 = var3 / 2 - 35;
			field407.method191(var2 / 2, var13, 0xFFFFFF, "To create a new account you need to", true);
			var13 += 15;
			field407.method191(var2 / 2, var13, 0xFFFFFF, "go back to the main RuneScape webpage", true);
			var13 += 15;
			field407.method191(var2 / 2, var13, 0xFFFFFF, "and choose the red 'create account'", true);
			var13 += 15;
			field407.method191(var2 / 2, var13, 0xFFFFFF, "button at the top right of that page.", true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field574.method542(var14 - 73, var15 - 20);
			field407.method191(var14, var15 + 5, 0xFFFFFF, "Cancel", true);
		}

		field462.method394(field60, 202, 171);

		if (field227) {
			field227 = false;
			field460.method394(field60, 128, 0);
			field461.method394(field60, 202, 371);
			field465.method394(field60, 0, 265);
			field466.method394(field60, 562, 265);
			field467.method394(field60, 128, 171);
			field468.method394(field60, 562, 171);
		}
	}

	@ObfuscatedName("client.a(IIIIZBIIIIII)Z")
	public final boolean method48(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field197[var14][var15] = 0;
				field284[var14][var15] = 99999999;
			}
		}

		int var16 = arg9;
		int var17 = arg7;
		field197[arg9][arg7] = 99;
		field284[arg9][arg7] = 0;
		byte var18 = 0;
		int var19 = 0;
		field542[var18] = arg9;
		int var35 = var18 + 1;
		field543[var18] = arg7;
		boolean var20 = false;
		int var21 = field542.length;
		int[][] var22 = field415[field530].field668;
		while (var35 != var19) {
			var16 = field542[var19];
			var17 = field543[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field415[field530].method214(arg10, var17, var16, arg8, arg2, arg1 - 1)) {
					var20 = true;
					break;
				}

				if (arg1 < 10 && field415[field530].method215(arg8, var17, var16, arg1 - 1, arg2, arg10)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg0 != 0 && field415[field530].method216(arg10, arg6, arg0, var16, arg5, var17, arg8)) {
				var20 = true;
				break;
			}

			int var23 = field284[var16][var17] + 1;
			if (var16 > 0 && field197[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field542[var35] = var16 - 1;
				field543[var35] = var17;
				var35 = (var35 + 1) % var21;
				field197[var16 - 1][var17] = 2;
				field284[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field197[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field542[var35] = var16 + 1;
				field543[var35] = var17;
				var35 = (var35 + 1) % var21;
				field197[var16 + 1][var17] = 8;
				field284[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field197[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field542[var35] = var16;
				field543[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field197[var16][var17 - 1] = 1;
				field284[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field197[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field542[var35] = var16;
				field543[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field197[var16][var17 + 1] = 4;
				field284[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field197[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field542[var35] = var16 - 1;
				field543[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field197[var16 - 1][var17 - 1] = 3;
				field284[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field197[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field542[var35] = var16 + 1;
				field543[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field197[var16 + 1][var17 - 1] = 9;
				field284[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field197[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field542[var35] = var16 - 1;
				field543[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field197[var16 - 1][var17 + 1] = 6;
				field284[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field197[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field542[var35] = var16 + 1;
				field543[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field197[var16 + 1][var17 + 1] = 12;
				field284[var16 + 1][var17 + 1] = var23;
			}
		}

		field458 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field284[var26][var27] < var24) {
								var24 = field284[var26][var27];
								var16 = var26;
								var17 = var27;
								field458 = 1;
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
		field542[var28] = var16;
		int var36 = var28 + 1;
		field543[var28] = var17;
		int var29;
		int var30 = var29 = field197[var16][var17];
		while (arg9 != var16 || arg7 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field542[var36] = var16;
				field543[var36++] = var17;
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

			var30 = field197[var16][var17];
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
		int var32 = field542[var36];
		int var33 = field543[var36];
		field459++;
		if (field459 >= 89) {
			field198.method233(135);
			field198.method238(0);
			field459 = 0;
		}

		if (arg3 == 0) {
			field198.method233(19);
			field198.method234(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field198.method233(76);
			field198.method234(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field198.method233(233);
			field198.method234(var31 + var31 + 3);
		}

		field198.method261(field78[5] == 1 ? 1 : 0);
		field198.method270(field340 + var32);
		field198.method270(field341 + var33);
		field492 = field542[0];
		field493 = field543[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field198.method234(field542[var36] - var32);
			field198.method260(field543[var36] - var33);
		}

		return true;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(IZIILUSEDZXXV;IIZI)V")
	public final void method49(int arg0, int arg1, int arg2, USEDZXXV arg3, int arg4, int arg5, boolean arg6, int arg7) {
		if (field315) {
			field569 = 32;
		} else {
			field569 = 0;
		}

		field315 = false;
		if (arg2 >= arg0 && arg2 < arg0 + 16 && arg7 >= arg1 && arg7 < arg1 + 16) {
			arg3.field1161 -= field347 * 4;

			if (arg6) {
				field410 = true;
				return;
			}
		} else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg7 >= arg1 + arg5 - 16 && arg7 < arg1 + arg5) {
			arg3.field1161 += field347 * 4;

			if (arg6) {
				field410 = true;
				return;
			}
		} else if (arg2 >= arg0 - field569 && arg2 < arg0 + field569 + 16 && arg7 >= arg1 + 16 && arg7 < arg1 + arg5 - 16 && field347 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg4;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg1 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg3.field1161 = (arg4 - arg5) * var10 / var11;

			if (arg6) {
				field410 = true;
			}

			field315 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method50() {
		while (true) {
			MFGDOVSO var1 = field182.method371();
			if (var1 == null) {
				return;
			}

			if (var1.field909 == 0) {
				VHYCWIPJ.method498(var1.field911, var1.field913);

				if ((field182.method358(var1.field911) & 0x62) != 0) {
					field410 = true;

					if (field531 != -1) {
						field553 = true;
					}
				}
			}

			if (var1.field909 == 1 && var1.field913 != null) {
				TTZHVWEG.method486(var1.field913);
			}

			if (var1.field909 == 2 && field297 == var1.field911 && var1.field913 != null) {
				method51(field298, var1.field913);
			}

			if (var1.field909 == 3 && field253 == 1) {
				for (int var2 = 0; var2 < field320.length; var2++) {
					if (field561[var2] == var1.field911) {
						field320[var2] = var1.field913;

						if (var1.field913 == null) {
							field561[var2] = -1;
						}

						break;
					}

					if (field562[var2] == var1.field911) {
						field237[var2] = var1.field913;

						if (var1.field913 == null) {
							field562[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field909 == 93 && field182.method369(var1.field911)) {
				WYBZGYVK.method564(field182, new GLMIQHJI(var1.field913));
			}
		}
	}

	@ObfuscatedName("client.a(ZB[B)V")
	public final void method51(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method52() {
		if (field358 > 0) {
			method78();
		} else {
			field323.method393();
			field406.method190(144, 257, "Connection lost", 0);
			field406.method190(143, 256, "Connection lost", 0xFFFFFF);
			field406.method190(159, 257, "Please wait - attempting to reestablish", 0);
			field406.method190(158, 256, "Please wait - attempting to reestablish", 0xFFFFFF);
			field323.method394(field60, 4, 4);
			field264 = 0;
			field492 = 0;
			LJVKCVYD var1 = field397;
			field416 = false;
			field376 = 0;
			method87(field168, field169, true);

			if (!field416) {
				method78();
			}

			try {
				var1.method351();
			} catch (Exception var2) {
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIZII)V")
	public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = VHYCWIPJ.field1241[var7];
			int var13 = VHYCWIPJ.field1242[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = VHYCWIPJ.field1241[var8];
			int var16 = VHYCWIPJ.field1242[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field206 = arg1 - var9;
		field207 = arg4 - var10;
		field208 = arg0 - var11;
		field209 = arg5;
		field210 = arg3;
	}

	@ObfuscatedName("client.a(ILGLMIQHJI;B)V")
	public final void method54(int arg0, GLMIQHJI arg1) {
		while (arg1.field710 + 10 < arg0 * 8) {
			int var3 = arg1.method255(11);
			if (var3 == 2047) {
				break;
			}

			if (field361[var3] == null) {
				field361[var3] = new PASMQFXV();
				if (field366[var3] != null) {
					field361[var3].method405(field366[var3]);
				}
			}

			field363[field362++] = var3;
			PASMQFXV var4 = field361[var3];
			var4.field1287 = field307;
			int var5 = arg1.method255(1);
			if (var5 == 1) {
				field365[field364++] = var3;
			}

			int var6 = arg1.method255(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method255(1);
			int var8 = arg1.method255(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method546(field535.field1309[0] + var8, var7 == 1, field535.field1308[0] + var6);
		}

		arg1.method256();
	}

	@ObfuscatedName("client.a(ZILGLMIQHJI;)V")
	public final void method55(int arg0, GLMIQHJI arg1) {
		for (int var3 = 0; var3 < field364; var3++) {
			int var4 = field365[var3];
			QDXHSLSL var5 = field402[var4];
			int var6 = arg1.method244();
			if ((var6 & 0x20) != 0) {
				int var7 = arg1.method244();
				int var8 = arg1.method264();
				var5.method547(var8, field307, var7);
				var5.field1315 = field307 + 300;
				var5.field1316 = arg1.method264();
				var5.field1317 = arg1.method264();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1289 = arg1.method251();
				var5.field1270 = 100;
			}

			if ((var6 & 0x1) != 0) {
				var5.field1277 = arg1.method272();
				int var9 = arg1.method278();
				var5.field1281 = var9 >> 16;
				var5.field1280 = (var9 & 0xFFFF) + field307;
				var5.field1278 = 0;
				var5.field1279 = 0;

				if (var5.field1280 > field307) {
					var5.field1278 = -1;
				}

				if (var5.field1277 == 0xFFFF) {
					var5.field1277 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field1267 = arg1.method246();
				var5.field1268 = arg1.method273();
			}

			if ((var6 & 0x2) != 0) {
				var5.field972 = LPTCUHOU.method380(arg1.method274());
				var5.field1318 = var5.field972.field886;
				var5.field1282 = var5.field972.field876;
				var5.field1302 = var5.field972.field862;
				var5.field1303 = var5.field972.field890;
				var5.field1304 = var5.field972.field894;
				var5.field1305 = var5.field972.field871;
				var5.field1271 = var5.field972.field887;
			}

			if ((var6 & 0x4) != 0) {
				int var10 = arg1.method274();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method264();
				if (var5.field1310 == var10 && var10 != -1) {
					int var12 = WLHKAARP.field1323[var10].field1337;
					if (var12 == 1) {
						var5.field1311 = 0;
						var5.field1312 = 0;
						var5.field1313 = var11;
						var5.field1314 = 0;
					}

					if (var12 == 2) {
						var5.field1314 = 0;
					}
				} else if (var10 == -1 || var5.field1310 == -1 || WLHKAARP.field1323[var10].field1331 >= WLHKAARP.field1323[var5.field1310].field1331) {
					var5.field1310 = var10;
					var5.field1311 = 0;
					var5.field1312 = 0;
					var5.field1313 = var11;
					var5.field1314 = 0;
					var5.field1291 = var5.field1276;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field1273 = arg1.method246();
				if (var5.field1273 == 0xFFFF) {
					var5.field1273 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var13 = arg1.method263();
				int var14 = arg1.method265();
				var5.method547(var14, field307, var13);
				var5.field1315 = field307 + 300;
				var5.field1316 = arg1.method244();
				var5.field1317 = arg1.method263();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method56(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field171; var2++) {
			if (arg0.equalsIgnoreCase(field445[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field535.field936)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.g(Z)Z")
	public final boolean method57() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method58() {
		if (field503 >= 2 || field384 != 0 || field192 != 0) {
			String var1;
			if (field384 == 1 && field503 < 2) {
				var1 = "Use " + field388 + " with...";
			} else if (field192 == 1 && field503 < 2) {
				var1 = field195 + "...";
			} else {
				var1 = field585[field503 - 1];
			}

			if (field503 > 2) {
				var1 = var1 + "@whi@ / " + (field503 - 2) + " more options";
			}

			field407.method199(field307 / 1000, true, 15, var1, 4, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.a(BLUSEDZXXV;)V")
	public final void method59(USEDZXXV arg0) {
		int var2 = arg0.field1157;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field172 == 0) {
				arg0.field1167 = "Loading friend list";
				arg0.field1147 = 0;
			} else if (var2 == 1 && field172 == 1) {
				arg0.field1167 = "Connecting to friendserver";
				arg0.field1147 = 0;
			} else if (var2 == 2 && field172 != 2) {
				arg0.field1167 = "Please wait...";
				arg0.field1147 = 0;
			} else {
				int var3 = field171;
				if (field172 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1167 = "";
					arg0.field1147 = 0;
				} else {
					arg0.field1167 = field445[var2];
					arg0.field1147 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field171;
			if (field172 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1167 = "";
				arg0.field1147 = 0;
			} else {
				if (field316[var2] == 0) {
					arg0.field1167 = "@red@Offline";
				} else if (field316[var2] == field211) {
					arg0.field1167 = "@gre@World-" + (field316[var2] - 9);
				} else {
					arg0.field1167 = "@yel@World-" + (field316[var2] - 9);
				}

				arg0.field1147 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field171;
			if (field172 != 2) {
				var5 = 0;
			}

			arg0.field1124 = var5 * 15 + 20;
			if (arg0.field1124 <= arg0.field1152) {
				arg0.field1124 = arg0.field1152 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field172 == 0) {
				arg0.field1167 = "Loading ignore list";
				arg0.field1147 = 0;
			} else if (var2 == 1 && field172 == 0) {
				arg0.field1167 = "Please wait...";
				arg0.field1147 = 0;
			} else {
				int var6 = field181;
				if (field172 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1167 = "";
					arg0.field1147 = 0;
				} else {
					arg0.field1167 = YYRFHIVS.method587(YYRFHIVS.method584(field305[var2]));
					arg0.field1147 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1124 = field181 * 15 + 20;
			if (arg0.field1124 <= arg0.field1152) {
				arg0.field1124 = arg0.field1152 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1111 = 150;
			arg0.field1112 = (int) (Math.sin(field307 / 40.0D) * 256.0D) & 0x7FF;

			if (field472) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field586[var7];
					if (var8 >= 0 && !GCYXYCPV.field691[var8].method223()) {
						return;
					}
				}

				field472 = false;
				VHYCWIPJ[] var9 = new VHYCWIPJ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field586[var11];
					if (var12 >= 0) {
						var9[var10++] = GCYXYCPV.field691[var12].method224();
					}
				}

				VHYCWIPJ var13 = new VHYCWIPJ(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field534[var14] != 0) {
						var13.method514(field382[var14][0], field382[var14][field534[var14]]);

						if (var14 == 1) {
							var13.method514(field290[0], field290[field534[var14]]);
						}
					}
				}

				var13.method507();
				var13.method508(WLHKAARP.field1323[field535.field1271].field1325[0]);
				var13.method517(64, 850, -30, -50, -30, true);
				arg0.field1127 = 5;
				arg0.field1128 = 0;
				USEDZXXV.method495(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field564 == null) {
				field564 = arg0.field1126;
				field565 = arg0.field1151;
			}

			if (field506) {
				arg0.field1126 = field565;
			} else {
				arg0.field1126 = field564;
			}
		} else if (var2 == 325) {
			if (field564 == null) {
				field564 = arg0.field1126;
				field565 = arg0.field1151;
			}

			if (field506) {
				arg0.field1126 = field564;
			} else {
				arg0.field1126 = field565;
			}
		} else if (var2 == 600) {
			arg0.field1167 = field457;
			if (field307 % 20 < 10) {
				arg0.field1167 = arg0.field1167 + "|";
			} else {
				arg0.field1167 = arg0.field1167 + " ";
			}
		} else if (var2 == 613) {
			if (field311 < 1) {
				arg0.field1167 = "";
			} else if (field515) {
				arg0.field1137 = 0xFF0000;
				arg0.field1167 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1137 = 0xFFFFFF;
				arg0.field1167 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field296 == 0) {
				arg0.field1167 = "";
			} else {
				String var15;
				if (field310 == 0) {
					var15 = "earlier today";
				} else if (field310 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field310 + " days ago";
				}

				arg0.field1167 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field224 == 0) {
				arg0.field1167 = "0 unread messages";
				arg0.field1137 = 0xFFFF00;
			}

			if (field224 == 1) {
				arg0.field1167 = "1 unread message";
				arg0.field1137 = 0xFF00;
			}

			if (field224 > 1) {
				arg0.field1167 = field224 + " unread messages";
				arg0.field1137 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field469 == 201) {
				if (field184 == 1) {
					arg0.field1167 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1167 = "";
				}
			} else if (field469 == 200) {
				arg0.field1167 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field469 == 0) {
					var16 = "Earlier today";
				} else if (field469 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field469 + " days ago";
				}

				arg0.field1167 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field469 == 201) {
				if (field184 == 1) {
					arg0.field1167 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1167 = "";
				}
			} else if (field469 == 200) {
				arg0.field1167 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1167 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field469 == 201) {
				if (field184 == 1) {
					arg0.field1167 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1167 = "";
				}
			} else if (field469 == 200) {
				arg0.field1167 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1167 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IILGLMIQHJI;)V")
	public final void method60(int arg0, GLMIQHJI arg1) {
		for (int var3 = 0; var3 < field364; var3++) {
			int var4 = field365[var3];
			PASMQFXV var5 = field361[var4];
			int var6 = arg1.method244();
			if ((var6 & 0x1) != 0) {
				var6 += arg1.method244() << 8;
			}

			method153(arg1, var6, var4, var5);
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method61() {
		if (field214 && field253 == 2 && WYBZGYVK.field1380 != field530) {
			field323.method393();
			field406.method190(151, 257, "Loading - please wait.", 0);
			field406.method190(150, 256, "Loading - please wait.", 0xFFFFFF);
			field323.method394(field60, 4, 4);
			field253 = 1;
			field489 = System.currentTimeMillis();
		}

		if (field253 == 1) {
			int var1 = method62();
			if (var1 != 0 && System.currentTimeMillis() - field489 > 360000L) {
				signlink.reporterror(field168 + " glcfb " + field556 + "," + var1 + "," + field214 + "," + field541[0] + "," + field182.method366() + "," + field530 + "," + field395 + "," + field396);
				field489 = System.currentTimeMillis();
			}
		}

		if (field253 == 2 && field530 != field271) {
			field271 = field530;
			method71(field530);
		}
	}

	@ObfuscatedName("client.i(I)I")
	public final int method62() {
		for (int var1 = 0; var1 < field320.length; var1++) {
			if (field320[var1] == null && field561[var1] != -1) {
				return -1;
			}

			if (field237[var1] == null && field562[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field320.length; var3++) {
			byte[] var4 = field237[var3];
			if (var4 != null) {
				int var5 = (field560[var3] >> 8) * 64 - field340;
				int var6 = (field560[var3] & 0xFF) * 64 - field341;
				if (field554) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= WYBZGYVK.method574(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field520) {
			return -4;
		} else {
			field253 = 2;
			WYBZGYVK.field1380 = field530;
			method97();
			field198.method233(238);
			return 0;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method63() {
		field299 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field266) {
				field532++;
				method129();
				method129();
				method64();
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

		field299 = false;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method64() {
		short var1 = 256;

		if (field441 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field441 > 768) {
					field587[var2] = method105(1024 - field441, field589[var2], field588[var2]);
				} else if (field441 > 256) {
					field587[var2] = field589[var2];
				} else {
					field587[var2] = method105(256 - field441, field588[var2], field589[var2]);
				}
			}
		} else if (field442 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field442 > 768) {
					field587[var3] = method105(1024 - field442, field590[var3], field588[var3]);
				} else if (field442 > 256) {
					field587[var3] = field590[var3];
				} else {
					field587[var3] = method105(256 - field442, field588[var3], field590[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field587[var4] = field588[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field463.field929[var5] = field389.field758[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field400[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field234[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field587[var12];
					int var15 = field463.field929[var7];
					field463.field929[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field463.method394(field60, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field464.field929[var16] = field390.field758[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field400[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field234[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field587[var23];
					int var26 = field464.field929[var18];
					field464.field929[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field464.method394(field60, 637, 0);
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method65(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field191.method441(field530, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			RFUKTMBK var8 = RFUKTMBK.method472(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1082;
				var10 = var8.field1053;
			} else {
				var9 = var8.field1053;
				var10 = var8.field1082;
			}

			int var11 = var8.field1071;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method48(var10, 0, 0, 2, false, var9, var11, field535.field1309[0], arg2, field535.field1308[0], arg1);
		} else {
			method48(0, var6 + 1, var7, 2, false, 0, 0, field535.field1309[0], arg2, field535.field1308[0], arg1);
		}

		field256 = field75;
		field257 = field76;
		field259 = 2;
		field258 = 0;
		return true;
	}

	@ObfuscatedName("client.a(LUSEDZXXV;Z)Z")
	public final boolean method66(USEDZXXV arg0) {
		int var2 = arg0.field1157;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field585[field503] = "Remove @whi@" + arg0.field1167;
				field435[field503] = 759;
				field503++;
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

		field585[field503] = "Remove @whi@" + field445[var2];
		field435[field503] = 994;
		field503++;
		field585[field503] = "Message @whi@" + field445[var2];
		field435[field503] = 302;
		field503++;
		return true;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method21() {
		signlink.reporterror = false;

		try {
			if (field397 != null) {
				field397.method351();
			}
		} catch (Exception var1) {
		}

		field397 = null;
		method109();

		if (field437 != null) {
			field437.field1365 = false;
		}

		field437 = null;
		field182.method368();
		field182 = null;
		field401 = null;
		field198 = null;
		field312 = null;
		field247 = null;
		field560 = null;
		field320 = null;
		field237 = null;
		field561 = null;
		field562 = null;
		field262 = null;
		field377 = null;
		field191 = null;
		field415 = null;
		field197 = null;
		field284 = null;
		field542 = null;
		field543 = null;
		field202 = null;
		field321 = null;
		field322 = null;
		field323 = null;
		field324 = null;
		field178 = null;
		field179 = null;
		field180 = null;
		field419 = null;
		field420 = null;
		field421 = null;
		field422 = null;
		field423 = null;
		field424 = null;
		field425 = null;
		field426 = null;
		field427 = null;
		field228 = null;
		field229 = null;
		field230 = null;
		field351 = null;
		field352 = null;
		field353 = null;
		field238 = null;
		field510 = null;
		field511 = null;
		field512 = null;
		field513 = null;
		field514 = null;
		field475 = null;
		field476 = null;
		field477 = null;
		field478 = null;
		field479 = null;
		field233 = null;
		field491 = null;
		field350 = null;
		field572 = null;
		field242 = null;
		field243 = null;
		field244 = null;
		field245 = null;
		field246 = null;
		field409 = null;
		field327 = null;
		field186 = null;
		field361 = null;
		field363 = null;
		field365 = null;
		field366 = null;
		field482 = null;
		field402 = null;
		field404 = null;
		field505 = null;
		field200 = null;
		field370 = null;
		field325 = null;
		field433 = null;
		field434 = null;
		field435 = null;
		field436 = null;
		field585 = null;
		field450 = null;
		field293 = null;
		field294 = null;
		field571 = null;
		field494 = null;
		field445 = null;
		field502 = null;
		field316 = null;
		field463 = null;
		field464 = null;
		field460 = null;
		field461 = null;
		field462 = null;
		field465 = null;
		field466 = null;
		field467 = null;
		field468 = null;
		method124();
		RFUKTMBK.method467();
		LPTCUHOU.method384();
		AVSLDGMK.method3();
		NPCMYHWE.field917 = null;
		GCYXYCPV.field691 = null;
		USEDZXXV.field1113 = null;
		GBCJRBLQ.field680 = null;
		WLHKAARP.field1323 = null;
		XHDTVZNY.field1398 = null;
		XHDTVZNY.field1410 = null;
		BIGJGRMT.field83 = null;
		field61 = null;
		PASMQFXV.field960 = null;
		CUVGZBEX.method172();
		QLFNWQSF.method410();
		VHYCWIPJ.method496();
		TTZHVWEG.method487();
		System.gc();
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method67() {
		field573 = new VUMXQDFQ(field414, "titlebox", 0);
		field574 = new VUMXQDFQ(field414, "titlebutton", 0);
		field438 = new VUMXQDFQ[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field438[var2] = new VUMXQDFQ(field414, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field438[var3] = new VUMXQDFQ(field414, "runes", (var3 & 0x3) + 12);
			}
		}

		field389 = new INVDQNJU(128, 265);
		field390 = new INVDQNJU(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field389.field758[var4] = field463.field929[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field390.field758[var5] = field464.field929[var5];
		}

		field588 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field588[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field588[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field588[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field588[var9 + 192] = 0xFFFFFF;
		}

		field589 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field589[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field589[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field589[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field589[var13 + 192] = 0xFFFFFF;
		}

		field590 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field590[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field590[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field590[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field590[var17 + 192] = 0xFFFFFF;
		}

		field587 = new int[256];
		field275 = new int[32768];
		field276 = new int[32768];
		method115(null);
		field234 = new int[32768];
		field235 = new int[32768];
		method26(10, "Connecting to fileserver");

		if (!field266) {
			field170 = true;
			field266 = true;
			method25(this, 2);
		}
	}

	@ObfuscatedName("client.b(ILGLMIQHJI;B)V")
	public final void method68(int arg0, GLMIQHJI arg1) {
		arg1.method254();
		int var3 = arg1.method255(8);
		if (var3 < field403) {
			for (int var4 = var3; var4 < field403; var4++) {
				field482[field481++] = field404[var4];
			}
		}

		if (var3 > field403) {
			signlink.reporterror(field168 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field403 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field404[var5];
			QDXHSLSL var7 = field402[var6];
			int var8 = arg1.method255(1);
			if (var8 == 0) {
				field404[field403++] = var6;
				var7.field1287 = field307;
			} else {
				int var9 = arg1.method255(2);
				if (var9 == 0) {
					field404[field403++] = var6;
					var7.field1287 = field307;
					field365[field364++] = var6;
				} else if (var9 == 1) {
					field404[field403++] = var6;
					var7.field1287 = field307;
					int var10 = arg1.method255(3);
					var7.method544(false, var10);
					int var11 = arg1.method255(1);
					if (var11 == 1) {
						field365[field364++] = var6;
					}
				} else if (var9 == 2) {
					field404[field403++] = var6;
					var7.field1287 = field307;
					int var12 = arg1.method255(3);
					var7.method544(true, var12);
					int var13 = arg1.method255(3);
					var7.method544(true, var13);
					int var14 = arg1.method255(1);
					if (var14 == 1) {
						field365[field364++] = var6;
					}
				} else if (var9 == 3) {
					field482[field481++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method69(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.l(I)Ljava/lang/String;")
	public final String method70() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field63 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method71(int arg0) {
		int[] var2 = field494.field758;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field377[arg0][var7][var5] & 0x18) == 0) {
					field191.method446(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field377[arg0 + 1][var7][var5] & 0x8) != 0) {
					field191.method446(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field494.method326();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field377[arg0][var11][var10] & 0x18) == 0) {
					method165(var8, var10, var9, var11, arg0);
				}

				if (arg0 < 3 && (field377[arg0 + 1][var11][var10] & 0x8) != 0) {
					method165(var8, var10, var9, var11, arg0 + 1);
				}
			}
		}

		field323.method393();
		field292 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field191.method440(field530, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = RFUKTMBK.method472(var14).field1050;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field415[field530].field668;
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

						field571[field292] = field327[var15];
						field293[field292] = var16;
						field294[field292] = var17;
						field292++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILWAJZGBEE;)V")
	public final void method72(int arg0, WAJZGBEE arg1) {
		method73(arg1.field1292, arg1.field1293, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method73(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method119(arg1, field530, arg0) - arg2;
			arg0 -= field206;
			var4 -= field207;
			arg1 -= field208;
			int var5 = VHYCWIPJ.field1241[field209];
			int var6 = VHYCWIPJ.field1242[field209];
			int var7 = VHYCWIPJ.field1241[field210];
			int var8 = VHYCWIPJ.field1242[field210];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field392 = (var9 << 9) / arg1 + CUVGZBEX.field603;
				field393 = (var11 << 9) / arg1 + CUVGZBEX.field604;
			} else {
				field392 = -1;
				field393 = -1;
			}
		} else {
			field392 = -1;
			field393 = -1;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method74() {
		for (int var1 = 0; var1 < field177; var1++) {
			if (field544[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field295[var1] != field261 || field183[var1] != field451) {
						GLMIQHJI var3 = CMHYVIXN.method167(field183[var1], field295[var1]);
						if (System.currentTimeMillis() + var3.field709 / 22 > field166 / 22 + field374) {
							field166 = var3.field709;
							field374 = System.currentTimeMillis();

							if (method107(var3.field708, var3.field709)) {
								field261 = field295[var1];
								field451 = field183[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method57()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field544[var1] != -5) {
					field544[var1] = -5;
				} else {
					field177--;
					for (int var5 = var1; var5 < field177; var5++) {
						field295[var5] = field295[var5 + 1];
						field183[var5] = field183[var5 + 1];
						field544[var5] = field544[var5 + 1];
					}

					var1--;
				}
			} else {
				field544[var1]--;
			}
		}

		if (field225 > 0) {
			field225 -= 20;
			if (field225 < 0) {
				field225 = 0;
			}

			if (field225 == 0 && field517 && !field214) {
				field297 = field189;
				field298 = true;
				field182.method365(2, field297);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method75(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method76(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILGLMIQHJI;I)V")
	public final void method77(GLMIQHJI arg0, int arg1) {
		field481 = 0;
		field364 = 0;
		method68(arg1, arg0);
		method136(arg1, arg0);
		method55(arg1, arg0);

		for (int var3 = 0; var3 < field481; var3++) {
			int var4 = field482[var3];
			if (field307 != field402[var4].field1287) {
				field402[var4].field972 = null;
				field402[var4] = null;
			}
		}

		if (arg0.field709 != arg1) {
			signlink.reporterror(field168 + " size mismatch in getnpcpos - pos:" + arg0.field709 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field403; var5++) {
			if (field402[field404[var5]] == null) {
				signlink.reporterror(field168 + " null entry in npc list - pos:" + var5 + " size:" + field403);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method22() {
		if (field488 || field309 || field496) {
			method116();
		} else {
			field215++;

			if (field416) {
				method148();
			} else {
				method47(false);
			}

			field347 = 0;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method78() {
		try {
			if (field397 != null) {
				field397.method351();
			}
		} catch (Exception var2) {
		}

		field397 = null;
		field416 = false;
		field412 = 0;
		field168 = "";
		field169 = "";
		method133();
		field191.method411();

		for (int var1 = 0; var1 < 4; var1++) {
			field415[var1].method205();
		}

		System.gc();
		method109();
		field189 = -1;
		field297 = -1;
		field225 = 0;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method79(boolean arg0) {
		if (field535.field1292 >> 7 == field492 && field535.field1293 >> 7 == field493) {
			field492 = 0;
		}

		int var2 = field362;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			PASMQFXV var4;
			int var5;
			if (arg0) {
				var4 = field535;
				var5 = field360 << 14;
			} else {
				var4 = field361[field363[var3]];
				var5 = field363[var3] << 14;
			}

			if (var4 != null && var4.method404()) {
				var4.field956 = false;
				if ((field214 && field362 > 50 || field362 > 200) && !arg0 && var4.field1319 == var4.field1271) {
					var4.field956 = true;
				}

				int var6 = var4.field1292 >> 7;
				int var7 = var4.field1293 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field955 == null || field307 < var4.field950 || field307 >= var4.field951) {
						if ((var4.field1292 & 0x7F) == 0x40 && (var4.field1293 & 0x7F) == 0x40) {
							if (field186[var6][var7] == field346) {
								continue;
							}

							field186[var6][var7] = field346;
						}

						var4.field958 = method119(var4.field1293, field530, var4.field1292);
						field191.method422(field530, var4.field1286, var5, var4, var4.field1293, var4.field1292, var4.field1294, 60, var4.field958);
					} else {
						var4.field956 = false;
						var4.field958 = method119(var4.field1293, field530, var4.field1292);
						field191.method423(var4.field942, var4.field1293, var4, field530, var4.field1294, var4.field958, var5, var4.field940, var4.field941, var4.field943, var4.field1292, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method80() {
		field472 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field586[var1] = -1;
			for (int var2 = 0; var2 < GCYXYCPV.field690; var2++) {
				if (!GCYXYCPV.field691[var2].field697 && GCYXYCPV.field691[var2].field692 == var1 + (field506 ? 0 : 7)) {
					field586[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method81() {
		field322.method393();

		if (field264 == 2) {
			byte[] var1 = field229.field1259;
			int[] var2 = TQHEKXXC.field1089;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field233.method335(field369, 0, 25, 33, field279, field339, 256, 25, 0, 33);
			field323.method393();
		} else {
			int var5 = field473 + field279 & 0x7FF;
			int var6 = field535.field1292 / 32 + 48;
			int var7 = 464 - field535.field1293 / 32;
			field494.method335(field204, 5, var6, 151, var5, field335, field317 + 256, var7, 25, 146);
			field233.method335(field369, 0, 25, 33, field279, field339, 256, 25, 0, 33);

			for (int var8 = 0; var8 < field292; var8++) {
				int var9 = field293[var8] * 4 + 2 - field535.field1292 / 32;
				int var10 = field294[var8] * 4 + 2 - field535.field1293 / 32;
				method121(field571[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					VLLJSJTJ var13 = field505[field530][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field535.field1292 / 32;
						int var15 = var12 * 4 + 2 - field535.field1293 / 32;
						method121(field242, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field403; var16++) {
				QDXHSLSL var17 = field402[field404[var16]];
				if (var17 != null && var17.method404()) {
					LPTCUHOU var18 = var17.field972;
					if (var18.field888 != null) {
						var18 = var18.method383();
					}

					if (var18 != null && var18.field863) {
						int var19 = var17.field1292 / 32 - field535.field1292 / 32;
						int var20 = var17.field1293 / 32 - field535.field1293 / 32;
						method121(field243, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field362; var21++) {
				PASMQFXV var22 = field361[field363[var21]];
				if (var22 != null && var22.method404()) {
					int var23 = var22.field1292 / 32 - field535.field1292 / 32;
					int var24 = var22.field1293 / 32 - field535.field1293 / 32;
					boolean var25 = false;
					long var26 = YYRFHIVS.method583(var22.field936);
					for (int var28 = 0; var28 < field171; var28++) {
						if (field502[var28] == var26 && field316[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field535.field944 != 0 && var22.field944 != 0 && field535.field944 == var22.field944) {
						var29 = true;
					}

					if (var25) {
						method121(field245, var24, var23);
					} else if (var29) {
						method121(field246, var24, var23);
					} else {
						method121(field244, var24, var23);
					}
				}
			}

			if (field337 != 0 && field307 % 20 < 10) {
				if (field337 == 1 && field231 >= 0 && field231 < field402.length) {
					QDXHSLSL var30 = field402[field231];
					if (var30 != null) {
						int var31 = var30.field1292 / 32 - field535.field1292 / 32;
						int var32 = var30.field1293 / 32 - field535.field1293 / 32;
						method83(field269, var31, var32);
					}
				}

				if (field337 == 2) {
					int var33 = (field328 - field340) * 4 + 2 - field535.field1292 / 32;
					int var34 = (field329 - field341) * 4 + 2 - field535.field1293 / 32;
					method83(field269, var33, var34);
				}

				if (field337 == 10 && field470 >= 0 && field470 < field361.length) {
					PASMQFXV var35 = field361[field470];
					if (var35 != null) {
						int var36 = var35.field1292 / 32 - field535.field1292 / 32;
						int var37 = var35.field1293 / 32 - field535.field1293 / 32;
						method83(field269, var36, var37);
					}
				}
			}

			if (field492 != 0) {
				int var38 = field492 * 4 + 2 - field535.field1292 / 32;
				int var39 = field493 * 4 + 2 - field535.field1293 / 32;
				method121(field268, var39, var38);
			}

			TQHEKXXC.method478(3, 97, 0xFFFFFF, 78, 3);
			field323.method393();
		}
	}

	@ObfuscatedName("client.b(BLUSEDZXXV;)Z")
	public final boolean method82(USEDZXXV arg0) {
		if (arg0.field1159 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1159.length; var2++) {
			int var3 = method108(var2, arg0);
			int var4 = arg0.field1162[var2];
			if (arg0.field1159[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1159[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1159[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(LINVDQNJU;III)V")
	public final void method83(INVDQNJU arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field473 + field279 & 0x7FF;
			int var6 = VHYCWIPJ.field1241[var5];
			int var7 = VHYCWIPJ.field1242[var5];
			var6 = var6 * 256 / (field317 + 256);
			var7 = var7 * 256 / (field317 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field566.method336(20, 256, var12 + 94 + 4 - 10, 83 - var13 - 20, var10, 20, 15, 15);
		} else {
			method121(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method84() {
		try {
			int var1 = field535.field1292 + field508;
			int var2 = field535.field1293 + field187;
			if (field216 - var1 < -500 || field216 - var1 > 500 || field217 - var2 < -500 || field217 - var2 > 500) {
				field216 = var1;
				field217 = var2;
			}

			if (field216 != var1) {
				field216 += (var1 - field216) / 16;
			}

			if (field217 != var2) {
				field217 += (var2 - field217) / 16;
			}

			if (field78[1] == 1) {
				field280 += (-field280 - 24) / 2;
			} else if (field78[2] == 1) {
				field280 += (24 - field280) / 2;
			} else {
				field280 /= 2;
			}

			if (field78[3] == 1) {
				field281 += (12 - field281) / 2;
			} else if (field78[4] == 1) {
				field281 += (-field281 - 12) / 2;
			} else {
				field281 /= 2;
			}

			field279 = field280 / 2 + field279 & 0x7FF;
			field278 += field281 / 2;
			if (field278 < 128) {
				field278 = 128;
			}

			if (field278 > 383) {
				field278 = 383;
			}

			int var3 = field216 >> 7;
			int var4 = field217 >> 7;
			int var5 = method119(field217, field530, field216);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field530;
						if (var9 < 3 && (field377[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field262[var9][var7][var8];
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

			if (var11 > field291) {
				field291 += (var11 - field291) / 24;
			} else if (var11 < field291) {
				field291 += (var11 - field291) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field535.field1292 + "," + field535.field1293 + "," + field216 + "," + field217 + "," + field395 + "," + field396 + "," + field340 + "," + field341);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method85() {
		if (field412 == 0) {
			int var1 = field58 / 2 - 80;
			int var2 = field59 / 2 + 20;
			var2 += 20;
			if (field74 == 1 && field75 >= var1 - 75 && field75 <= var1 + 75 && field76 >= var2 - 20 && field76 <= var2 + 20) {
				field412 = 3;
				field507 = 0;
			}

			int var3 = field58 / 2 + 80;
			if (field74 == 1 && field75 >= var3 - 75 && field75 <= var3 + 75 && field76 >= var2 - 20 && field76 <= var2 + 20) {
				field285 = "";
				field286 = "Enter your username & password.";
				field412 = 2;
				field507 = 0;
			}
		} else if (field412 == 2) {
			int var4 = field59 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field74 == 1 && field76 >= var4 - 15 && field76 < var4) {
				field507 = 0;
			}

			var4 += 15;
			if (field74 == 1 && field76 >= var4 - 15 && field76 < var4) {
				field507 = 1;
			}

			var4 += 15;
			int var5 = field58 / 2 - 80;
			int var6 = field59 / 2 + 50;
			var6 += 20;
			if (field74 == 1 && field75 >= var5 - 75 && field75 <= var5 + 75 && field76 >= var6 - 20 && field76 <= var6 + 20) {
				field376 = 0;
				method87(field168, field169, false);

				if (field416) {
					return;
				}
			}

			int var7 = field58 / 2 + 80;
			if (field74 == 1 && field75 >= var7 - 75 && field75 <= var7 + 75 && field76 >= var6 - 20 && field76 <= var6 + 20) {
				field412 = 0;
				field168 = "";
				field169 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method18();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field232.length(); var10++) {
					if (var8 == field232.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field507 == 0) {
					if (var8 == 8 && field168.length() > 0) {
						field168 = field168.substring(0, field168.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field507 = 1;
					}

					if (var9) {
						field168 = field168 + (char) var8;
					}

					if (field168.length() > 12) {
						field168 = field168.substring(0, 12);
					}
				} else if (field507 == 1) {
					if (var8 == 8 && field169.length() > 0) {
						field169 = field169.substring(0, field169.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field507 = 0;
					}

					if (var9) {
						field169 = field169 + (char) var8;
					}

					if (field169.length() > 20) {
						field169 = field169.substring(0, 20);
					}
				}
			}
		} else if (field412 == 3) {
			int var11 = field58 / 2;
			int var12 = field59 / 2 + 50;
			var12 += 20;
			if (field74 == 1 && field75 >= var11 - 75 && field75 <= var11 + 75 && field76 >= var12 - 20 && field76 <= var12 + 20) {
				field412 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method86() {
		field324.method393();
		CUVGZBEX.field609 = field521;
		field230.method542(0, 0);

		if (field381) {
			field407.method190(40, 239, field540, 0);
			field407.method190(60, 239, field348 + "*", 128);
		} else if (field367 == 1) {
			field407.method190(40, 239, "Enter amount:", 0);
			field407.method190(60, 239, field486 + "*", 128);
		} else if (field367 == 2) {
			field407.method190(40, 239, "Enter name:", 0);
			field407.method190(60, 239, field486 + "*", 128);
		} else if (field205 != null) {
			field407.method190(40, 239, field205, 0);
			field407.method190(60, 239, "Click to continue", 128);
		} else if (field531 != -1) {
			method164(USEDZXXV.field1113[field531], 0, 0, 0);
		} else if (field495 == -1) {
			DBRMEPJQ var1 = field406;
			int var2 = 0;
			TQHEKXXC.method475(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field250[var3] != null) {
					int var4 = field248[var3];
					int var5 = field174 + 70 - var2 * 14;
					String var6 = field249[var3];
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
							var1.method194(field250[var3], 0, 4, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field504 == 0 || field504 == 1 && method56(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field418[0].method542(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field418[1].method542(var8, var5 - 12);
								var8 += 14;
							}

							var1.method194(var6 + ":", 0, var8, var5);
							var8 += var1.method192(var6) + 8;
							var1.method194(field250[var3], 255, var8, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field265 == 0 && (var4 == 7 || field349 == 0 || field349 == 1 && method56(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method194("From", 0, var9, var5);
							int var11 = var9 + var1.method192("From ");
							if (var7 == 1) {
								field418[0].method542(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field418[1].method542(var11, var5 - 12);
								var11 += 14;
							}

							var1.method194(var6 + ":", 0, var11, var5);
							var11 += var1.method192(var6) + 8;
							var1.method194(field250[var3], 0x800000, var11, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field255 == 0 || field255 == 1 && method56(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var6 + " " + field250[var3], 0x800080, 4, var5);
						}

						var2++;
					}

					if (var4 == 5 && field265 == 0 && field349 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(field250[var3], 0x800000, 4, var5);
						}

						var2++;
					}

					if (var4 == 6 && field265 == 0 && field349 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method194("To " + var6 + ":", 0, 4, var5);
							var1.method194(field250[var3], 0x800000, var1.method192("To " + var6) + 12, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field255 == 0 || field255 == 1 && method56(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method194(var6 + " " + field250[var3], 0x7E3200, 4, var5);
						}

						var2++;
					}
				}
			}

			TQHEKXXC.method474();
			field371 = var2 * 14 + 7;
			if (field371 < 78) {
				field371 = 78;
			}

			method101(field371, field371 - field174 - 77, 77, 463, 0);
			String var10;
			if (field535 == null || field535.field936 == null) {
				var10 = YYRFHIVS.method587(field168);
			} else {
				var10 = field535.field936;
			}

			var1.method194(var10 + ":", 0, 4, 90);
			var1.method194(field270 + "*", 255, var1.method192(var10 + ": ") + 6, 90);
			TQHEKXXC.method481(0, 0, 479, 77);
		} else {
			method164(USEDZXXV.field1113[field495], 0, 0, 0);
		}

		if (field398 && field452 == 2) {
			method36();
		}

		field324.method394(field60, 17, 357);
		field323.method393();
		CUVGZBEX.field609 = field523;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method87(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field285 = "";
				field286 = "Connecting to server...";
				method47(true);
			}

			field397 = new LJVKCVYD(this, method128(field212 + 43594));
			long var4 = YYRFHIVS.method583(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field198.field709 = 0;
			field198.method234(14);
			field198.method234(var6);
			field397.method355(field198.field708, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field397.method352();
			}

			int var8 = field397.method352();
			int var9 = var8;

			if (var8 == 0) {
				field397.method354(field247.field708, 0, 8);
				field247.field709 = 0;
				field556 = field247.method250();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field556 >> 32), (int) field556 };
				field198.field709 = 0;
				field198.method234(10);
				field198.method238(var10[0]);
				field198.method238(var10[1]);
				field198.method238(var10[2]);
				field198.method238(var10[3]);
				field198.method238(signlink.uid);
				field198.method241(arg0);
				field198.method241(arg1);
				field198.method259(field239, field196);
				field312.field709 = 0;

				if (arg2) {
					field312.method234(18);
				} else {
					field312.method234(16);
				}

				field312.method234(field198.field709 + 36 + 1 + 1 + 2);
				field312.method234(255);
				field312.method235(308);
				field312.method234(field214 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field312.method238(field449[var11]);
				}

				field312.method242(0, field198.field709, field198.field708);
				field198.field713 = new BPJMPIUS(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field185 = new BPJMPIUS(var10);
				field397.method355(field312.field708, field312.field709, 0);
				var8 = field397.method352();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method87(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field311 = field397.method352();
				field372 = field397.method352() == 1;
				field222 = 0L;
				field440 = 0;
				field437.field1369 = 0;
				field65 = true;
				field252 = true;
				field416 = true;
				field198.field709 = 0;
				field247.field709 = 0;
				field355 = -1;
				field378 = -1;
				field379 = -1;
				field380 = -1;
				field354 = 0;
				field356 = 0;
				field428 = 0;
				field358 = 0;
				field337 = 0;
				field503 = 0;
				field398 = false;
				field66 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field250[var13] = null;
				}

				field384 = 0;
				field192 = 0;
				field253 = 0;
				field177 = 0;
				field508 = (int) (Math.random() * 100.0D) - 50;
				field187 = (int) (Math.random() * 110.0D) - 55;
				field431 = (int) (Math.random() * 80.0D) - 40;
				field473 = (int) (Math.random() * 120.0D) - 60;
				field317 = (int) (Math.random() * 30.0D) - 20;
				field279 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field264 = 0;
				field271 = -1;
				field492 = 0;
				field493 = 0;
				field362 = 0;
				field403 = 0;

				for (int var14 = 0; var14 < field359; var14++) {
					field361[var14] = null;
					field366[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field402[var15] = null;
				}

				field535 = field361[field360] = new PASMQFXV();
				field370.method532();
				field325.method532();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field505[var16][var17][var18] = null;
						}
					}
				}

				field200 = new VLLJSJTJ();
				field172 = 0;
				field171 = 0;
				field495 = -1;
				field531 = -1;
				field203 = -1;
				field240 = -1;
				field413 = -1;
				field557 = false;
				field223 = 3;
				field367 = 0;
				field398 = false;
				field381 = false;
				field205 = null;
				field391 = 0;
				field267 = -1;
				field506 = true;
				method80();

				for (int var19 = 0; var19 < 5; var19++) {
					field534[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field272[var20] = null;
					field273[var20] = false;
				}

				field459 = 0;
				field480 = 0;
				field274 = 0;
				field263 = 0;
				field444 = 0;
				field546 = 0;
				field447 = 0;
				method91();
			} else if (var8 == 3) {
				field285 = "";
				field286 = "Invalid username or password.";
			} else if (var8 == 4) {
				field285 = "Your account has been disabled.";
				field286 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field285 = "Your account is already logged in.";
				field286 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field285 = "RuneScape has been updated!";
				field286 = "Please reload this page.";
			} else if (var8 == 7) {
				field285 = "This world is full.";
				field286 = "Please use a different world.";
			} else if (var8 == 8) {
				field285 = "Unable to connect.";
				field286 = "Login server offline.";
			} else if (var8 == 9) {
				field285 = "Login limit exceeded.";
				field286 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field285 = "Unable to connect.";
				field286 = "Bad session id.";
			} else if (var8 == 11) {
				field286 = "Login server rejected session.";
				field286 = "Please try again.";
			} else if (var8 == 12) {
				field285 = "You need a members account to login to this world.";
				field286 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field285 = "Could not complete login.";
				field286 = "Please try using a different world.";
			} else if (var8 == 14) {
				field285 = "The server is being updated.";
				field286 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field416 = true;
				field198.field709 = 0;
				field247.field709 = 0;
				field355 = -1;
				field378 = -1;
				field379 = -1;
				field380 = -1;
				field354 = 0;
				field356 = 0;
				field428 = 0;
				field503 = 0;
				field398 = false;
				field489 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field285 = "Login attempts exceeded.";
				field286 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field285 = "You are standing in a members-only area.";
				field286 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field285 = "Invalid loginserver requested";
				field286 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field397.method352(); var21 >= 0; var21--) {
					field285 = "You have only just left another world";
					field286 = "Your profile will be transferred in: " + var21 + " seconds";
					method47(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method87(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field285 = "Unexpected server response";
				field286 = "Please try using a different world.";
			} else if (var9 != 0) {
				field285 = "No response from server";
				field286 = "Please try using a different world.";
			} else if (field376 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field376++;
				method87(arg0, arg1, arg2);
			} else {
				field285 = "No response from loginserver";
				field286 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field285 = "";
			field286 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIIIIZIIII)V")
	public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		DSELJCMH var10 = null;
		for (DSELJCMH var11 = (DSELJCMH) field200.method528(); var11 != null; var11 = (DSELJCMH) field200.method530()) {
			if (var11.field653 == arg0 && var11.field655 == arg4 && var11.field656 == arg1 && var11.field654 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new DSELJCMH();
			var10.field653 = arg0;
			var10.field654 = arg5;
			var10.field655 = arg4;
			var10.field656 = arg1;
			method114(var10);
			field200.method525(var10);
		}

		var10.field660 = arg3;
		var10.field662 = arg2;
		var10.field661 = arg6;
		var10.field663 = arg7;
		var10.field652 = arg8;
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method89() {
		QLFNWQSF.field973 = true;
		CUVGZBEX.field598 = true;
		field214 = true;
		WYBZGYVK.field1381 = true;
		RFUKTMBK.field1063 = true;
	}

	@ObfuscatedName("client.c(IB)V")
	public final void method90(int arg0) {
		USEDZXXV var2 = USEDZXXV.field1113[arg0];
		for (int var3 = 0; var3 < var2.field1132.length && var2.field1132[var3] != -1; var3++) {
			USEDZXXV var4 = USEDZXXV.field1113[var2.field1132[var3]];
			if (var4.field1134 == 1) {
				method90(var4.field1164);
			}

			var4.field1125 = 0;
			var4.field1116 = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method91() {
		if (field324 == null) {
			method124();
			field61 = null;
			field460 = null;
			field461 = null;
			field462 = null;
			field463 = null;
			field464 = null;
			field465 = null;
			field466 = null;
			field467 = null;
			field468 = null;
			field324 = new NUXCAHZM(96, 479, method24());
			field322 = new NUXCAHZM(156, 172, method24());
			TQHEKXXC.method476();
			field229.method542(0, 0);
			field321 = new NUXCAHZM(261, 190, method24());
			field323 = new NUXCAHZM(334, 512, method24());
			TQHEKXXC.method476();
			field178 = new NUXCAHZM(50, 496, method24());
			field179 = new NUXCAHZM(37, 269, method24());
			field180 = new NUXCAHZM(45, 249, method24());
			field227 = true;
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method92(int arg0, int arg1) {
		boolean var3 = false;
		USEDZXXV var4 = USEDZXXV.field1113[arg0];
		for (int var5 = 0; var5 < var4.field1132.length && var4.field1132[var5] != -1; var5++) {
			USEDZXXV var6 = USEDZXXV.field1113[var4.field1132[var5]];
			if (var6.field1134 == 1) {
				var3 |= method92(var6.field1164, arg1);
			}

			if (var6.field1134 == 6 && (var6.field1149 != -1 || var6.field1150 != -1)) {
				boolean var7 = method82(var6);
				int var8;
				if (var7) {
					var8 = var6.field1150;
				} else {
					var8 = var6.field1149;
				}

				if (var8 != -1) {
					WLHKAARP var9 = WLHKAARP.field1323[var8];
					var6.field1116 += arg1;
					while (var6.field1116 > var9.method549(var6.field1125)) {
						var6.field1116 -= var9.method549(var6.field1125) + 1;
						var6.field1125++;
						if (var6.field1125 >= var9.field1324) {
							var6.field1125 -= var9.field1328;
							if (var6.field1125 < 0 || var6.field1125 >= var9.field1324) {
								var6.field1125 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method93() {
		field321.method393();
		CUVGZBEX.field609 = field522;
		field228.method542(0, 0);

		if (field240 != -1) {
			method164(USEDZXXV.field1113[field240], 0, 0, 0);
		} else if (field334[field223] != -1) {
			method164(USEDZXXV.field1113[field334[field223]], 0, 0, 0);
		}

		if (field398 && field452 == 1) {
			method36();
		}

		field321.method394(field60, 553, 205);
		field323.method393();
		CUVGZBEX.field609 = field523;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method94() {
		if (field265 != 0) {
			int var1 = 0;
			if (field428 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field250[var2] != null) {
					int var3 = field248[var2];
					String var4 = field249[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field349 == 0 || field349 == 1 && method56(var4))) {
						int var8 = 329 - var1 * 13;
						if (field68 > 4 && field69 - 4 > var8 - 10 && field69 - 4 <= var8 + 3) {
							int var9 = field406.method192("From:  " + var4 + field250[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field68 < var9 + 4) {
								if (field311 >= 1) {
									field585[field503] = "Report abuse @whi@" + var4;
									field435[field503] = 2811;
									field503++;
								}

								field585[field503] = "Add ignore @whi@" + var4;
								field435[field503] = 2694;
								field503++;
								field585[field503] = "Add friend @whi@" + var4;
								field435[field503] = 2730;
								field503++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field349 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method95() {
		int var1 = 5;
		field449[8] = 0;
		int var2 = 0;
		while (field449[8] == 0) {
			String var3 = "Unknown problem";
			method26(20, "Connecting to web server");

			try {
				DataInputStream var4 = method120("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 308);
				GLMIQHJI var5 = new GLMIQHJI(new byte[40]);
				var4.readFully(var5.field708, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field449[var6] = var5.method249();
				}

				int var7 = var5.method249();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field449[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field449[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field449[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field449[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field449[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field449[8] == 0) {
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

				field173 = !field173;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method96() {
		if (field264 == 0 && field74 == 1) {
			int var1 = field75 - 25 - 550;
			int var2 = field76 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field473 + field279 & 0x7FF;
				int var4 = CUVGZBEX.field607[var3];
				int var5 = CUVGZBEX.field608[var3];
				var4 = (field317 + 256) * var4 >> 8;
				var5 = (field317 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field535.field1292 + var6 >> 7;
				int var9 = field535.field1293 - var7 >> 7;
				boolean var10 = method48(0, 0, 0, 1, true, 0, 0, field535.field1309[0], var8, field535.field1308[0], var9);
				if (var10) {
					field198.method234(var1);
					field198.method234(var2);
					field198.method235(field279);
					field198.method234(57);
					field198.method234(field473);
					field198.method234(field317);
					field198.method234(89);
					field198.method235(field535.field1292);
					field198.method235(field535.field1293);
					field198.method234(field458);
					field198.method234(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method97() {
		try {
			field271 = -1;
			field325.method532();
			field370.method532();
			CUVGZBEX.method175();
			method133();
			field191.method411();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field415[var1].method205();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field377[var2][var3][var4] = 0;
					}
				}
			}

			WYBZGYVK var5 = new WYBZGYVK(field262, 104, 104, field377);
			int var6 = field320.length;
			WYBZGYVK.field1381 = QLFNWQSF.field973;
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = field560[var7] >> 8;
				int var9 = field560[var7] & 0xFF;
				if (var8 == 33 && var9 >= 71 && var9 <= 73) {
					WYBZGYVK.field1381 = false;
				}
			}

			if (WYBZGYVK.field1381) {
				field191.method412(field530);
			} else {
				field191.method412(0);
			}

			field198.method233(158);

			if (!field554) {
				for (int var10 = 0; var10 < var6; var10++) {
					int var11 = (field560[var10] >> 8) * 64 - field340;
					int var12 = (field560[var10] & 0xFF) * 64 - field341;
					byte[] var13 = field320[var10];
					if (var13 != null) {
						var5.method573(field415, (field396 - 6) * 8, var12, var11, var13, (field395 - 6) * 8);
					}
				}

				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = (field560[var14] >> 8) * 64 - field340;
					int var16 = (field560[var14] & 0xFF) * 64 - field341;
					byte[] var17 = field320[var14];
					if (var17 == null && field396 < 800) {
						var5.method565(64, var16, 64, var15);
					}
				}

				field198.method233(158);

				for (int var18 = 0; var18 < var6; var18++) {
					byte[] var19 = field237[var18];
					if (var19 != null) {
						int var20 = (field560[var18] >> 8) * 64 - field340;
						int var21 = (field560[var18] & 0xFF) * 64 - field341;
						var5.method561(var20, field415, field191, var19, var21);
					}
				}
			}

			if (field554) {
				for (int var22 = 0; var22 < 4; var22++) {
					for (int var23 = 0; var23 < 13; var23++) {
						for (int var24 = 0; var24 < 13; var24++) {
							int var25 = field430[var22][var23][var24];
							if (var25 != -1) {
								int var26 = var25 >> 24 & 0x3;
								int var27 = var25 >> 1 & 0x3;
								int var28 = var25 >> 14 & 0x3FF;
								int var29 = var25 >> 3 & 0x7FF;
								int var30 = (var28 / 8 << 8) + var29 / 8;
								for (int var31 = 0; var31 < field560.length; var31++) {
									if (field560[var31] == var30 && field320[var31] != null) {
										var5.method575(var24 * 8, var22, var26, (var29 & 0x7) * 8, var27, var23 * 8, field415, (var28 & 0x7) * 8, field320[var31]);
										break;
									}
								}
							}
						}
					}
				}

				for (int var32 = 0; var32 < 13; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						int var34 = field430[0][var32][var33];
						if (var34 == -1) {
							var5.method565(8, var33 * 8, 8, var32 * 8);
						}
					}
				}

				field198.method233(158);

				for (int var35 = 0; var35 < 4; var35++) {
					for (int var36 = 0; var36 < 13; var36++) {
						for (int var37 = 0; var37 < 13; var37++) {
							int var38 = field430[var35][var36][var37];
							if (var38 != -1) {
								int var39 = var38 >> 24 & 0x3;
								int var40 = var38 >> 1 & 0x3;
								int var41 = var38 >> 14 & 0x3FF;
								int var42 = var38 >> 3 & 0x7FF;
								int var43 = (var41 / 8 << 8) + var42 / 8;
								for (int var44 = 0; var44 < field560.length; var44++) {
									if (field560[var44] == var43 && field237[var44] != null) {
										var5.method559(var37 * 8, var40, var36 * 8, var35, field237[var44], (var41 & 0x7) * 8, var39, (var42 & 0x7) * 8, field415, field191);
										break;
									}
								}
							}
						}
					}
				}
			}

			field198.method233(158);
			var5.method558(field415, field191);
			field323.method393();
			field198.method233(158);

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method131(var45, var46);
				}
			}

			method127();
		} catch (Exception var59) {
		}

		RFUKTMBK.field1081.method287();

		if (field63 != null) {
			field198.method233(134);
			field198.method238(1057001181);
		}

		if (field214 && signlink.cache_dat != null) {
			int var48 = field182.method374(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field182.method358(var49);
				if ((var50 & 0x79) == 0) {
					VHYCWIPJ.method499(var49);
				}
			}
		}

		System.gc();
		CUVGZBEX.method176(20);
		field182.method361();
		int var51 = (field395 - 6) / 8 - 1;
		int var52 = (field395 + 6) / 8 + 1;
		int var53 = (field396 - 6) / 8 - 1;
		int var54 = (field396 + 6) / 8 + 1;
		if (field383) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field182.method376(var56, 0, var55);
					if (var57 != -1) {
						field182.method360(var57, 3);
					}

					int var58 = field182.method376(var56, 1, var55);
					if (var58 != -1) {
						field182.method360(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method98(int arg0, int arg1) {
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

	@ObfuscatedName("client.m(Z)V")
	public final void method99() {
		if (field253 == 2) {
			for (DSELJCMH var1 = (DSELJCMH) field200.method528(); var1 != null; var1 = (DSELJCMH) field200.method530()) {
				if (var1.field652 > 0) {
					var1.field652--;
				}

				if (var1.field652 != 0) {
					if (var1.field663 > 0) {
						var1.field663--;
					}

					if (var1.field663 == 0 && var1.field655 >= 1 && var1.field656 >= 1 && var1.field655 <= 102 && var1.field656 <= 102 && (var1.field660 < 0 || WYBZGYVK.method576(var1.field660, var1.field662))) {
						method161(var1.field662, var1.field661, var1.field654, var1.field655, var1.field653, var1.field660, var1.field656);
						var1.field663 = -1;

						if (var1.field660 == var1.field657 && var1.field657 == -1) {
							var1.method555();
						} else if (var1.field660 == var1.field657 && var1.field661 == var1.field658 && var1.field662 == var1.field659) {
							var1.method555();
						}
					}
				} else if (var1.field657 < 0 || WYBZGYVK.method576(var1.field657, var1.field659)) {
					method161(var1.field659, var1.field658, var1.field654, var1.field655, var1.field653, var1.field657, var1.field656);
					var1.method555();
				}
			}

			field485++;
			if (field485 > 126) {
				field485 = 0;
				field198.method233(46);
				field198.method234(132);
				return;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method100() {
		if (field549 == 0) {
			int var1 = field74;
			if (field192 == 1 && field75 >= 516 && field76 >= 160 && field75 <= 765 && field76 <= 205) {
				var1 = 0;
			}

			if (field398) {
				if (var1 != 1) {
					int var2 = field68;
					int var3 = field69;
					if (field452 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field452 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field452 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field453 - 10 || var2 > field455 + field453 + 10 || var3 < field454 - 10 || var3 > field456 + field454 + 10) {
						field398 = false;

						if (field452 == 1) {
							field410 = true;
						}

						if (field452 == 2) {
							field553 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field453;
					int var5 = field454;
					int var6 = field455;
					int var7 = field75;
					int var8 = field76;
					if (field452 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field452 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field452 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field503; var10++) {
						int var11 = (field503 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method45(var9);
					}

					field398 = false;

					if (field452 == 1) {
						field410 = true;
					}

					if (field452 == 2) {
						field553 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field503 > 0) {
					int var12 = field435[field503 - 1];
					if (var12 == 355 || var12 == 416 || var12 == 630 || var12 == 708 || var12 == 903 || var12 == 375 || var12 == 10 || var12 == 132 || var12 == 532 || var12 == 8 || var12 == 959 || var12 == 1463) {
						int var13 = field433[field503 - 1];
						int var14 = field434[field503 - 1];
						USEDZXXV var15 = USEDZXXV.field1113[var14];
						if (var15.field1138 || var15.field1129) {
							field539 = false;
							field241 = 0;
							field547 = var14;
							field548 = var13;
							field549 = 2;
							field550 = field75;
							field551 = field76;

							if (USEDZXXV.field1113[var14].field1153 == field203) {
								field549 = 1;
							}

							if (USEDZXXV.field1113[var14].field1153 == field531) {
								field549 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field308 == 1 || method139(field503 - 1)) && field503 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field503 > 0) {
					method45(field503 - 1);
				}

				if (var1 != 2 || field503 <= 0) {
					return;
				}

				method159();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field287.method542(arg3, arg4);
		field288.method542(arg3, arg2 + arg4 - 16);
		TQHEKXXC.method478(16, arg3, field552, arg4 + 16, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg1 / (arg0 - arg2);
		TQHEKXXC.method478(16, arg3, field345, arg4 + var7 + 16, var6);
		TQHEKXXC.method483(field336, arg4 + var7 + 16, arg3, var6);
		TQHEKXXC.method483(field336, arg4 + var7 + 16, arg3 + 1, var6);
		TQHEKXXC.method481(arg3, field336, 16, arg4 + var7 + 16);
		TQHEKXXC.method481(arg3, field336, 16, arg4 + var7 + 17);
		TQHEKXXC.method483(field487, arg4 + var7 + 16, arg3 + 15, var6);
		TQHEKXXC.method483(field487, arg4 + var7 + 17, arg3 + 14, var6 - 1);
		TQHEKXXC.method481(arg3, field487, 16, arg4 + var7 + var6 + 15);
		TQHEKXXC.method481(arg3 + 1, field487, 15, arg4 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.w(I)Z")
	public final boolean method102() {
		if (field397 == null) {
			return false;
		}

		try {
			int var1 = field397.method353();
			if (var1 == 0) {
				return false;
			}

			if (field355 == -1) {
				field397.method354(field247.field708, 0, 1);
				field355 = field247.field708[0] & 0xFF;
				if (field185 != null) {
					field355 = field355 - field185.method29() & 0xFF;
				}

				field354 = GEVMJLVB.field699[field355];
				var1--;
			}

			if (field354 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field397.method354(field247.field708, 0, 1);
				field354 = field247.field708[0] & 0xFF;
				var1--;
			}

			if (field354 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field397.method354(field247.field708, 0, 2);
				field247.field709 = 0;
				field354 = field247.method246();
				var1 -= 2;
			}

			if (var1 < field354) {
				return false;
			}

			field247.field709 = 0;
			field397.method354(field247.field708, 0, field354);
			field356 = 0;
			field380 = field379;
			field379 = field378;
			field378 = field355;

			if (field355 == 45) {
				field410 = true;
				int var2 = field247.method246();
				USEDZXXV var3 = USEDZXXV.field1113[var2];
				while (field247.field709 < field354) {
					int var4 = field247.method258();
					int var5 = field247.method246();
					int var6 = field247.method244();
					if (var6 == 255) {
						var6 = field247.method249();
					}

					if (var4 >= 0 && var4 < var3.field1155.length) {
						var3.field1155[var4] = var5;
						var3.field1169[var4] = var6;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 57) {
				int var7 = field247.method276();
				field495 = var7;
				field553 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 96) {
				int var8 = field247.method274();
				int var9 = field247.method274();
				USEDZXXV var10 = USEDZXXV.field1113[var8];
				if (var10 != null && var10.field1134 == 0) {
					if (var9 < 0) {
						var9 = 0;
					}

					if (var9 > var10.field1124 - var10.field1152) {
						var9 = var10.field1124 - var10.field1152;
					}

					var10.field1161 = var9;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 240) {
				String var11 = field247.method251();
				int var12 = field247.method274();
				USEDZXXV.field1113[var12].field1167 = var11;

				if (field334[field223] == USEDZXXV.field1113[var12].field1153) {
					field410 = true;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 208) {
				int var13 = field247.method274();
				int var14 = field247.method272();
				int var15 = field247.method272();
				int var16 = field247.method273();
				USEDZXXV.field1113[var14].field1111 = var13;
				USEDZXXV.field1113[var14].field1112 = var16;
				USEDZXXV.field1113[var14].field1110 = var15;
				field355 = -1;
				return true;
			}

			if (field355 == 77) {
				field381 = false;
				field367 = 1;
				field486 = "";
				field553 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 186) {
				field381 = false;
				field367 = 2;
				field486 = "";
				field553 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 39) {
				int var17 = field247.method274();
				int var18 = field247.method274();

				if (field531 != -1) {
					field531 = -1;
					field553 = true;
				}

				if (field367 != 0) {
					field367 = 0;
					field553 = true;
				}

				field203 = var18;
				field240 = var17;
				field410 = true;
				field344 = true;
				field557 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 25) {
				int var19 = field247.method274();
				int var20 = field247.method264();

				if (var19 == 0xFFFF) {
					var19 = -1;
				}

				field334[var20] = var19;
				field410 = true;
				field344 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 160) {
				byte var21 = field247.method268();
				int var22 = field247.method274();
				field429[var22] = var21;

				if (field450[var22] != var21) {
					field450[var22] = var21;
					method35(var22);
					field410 = true;

					if (field495 != -1) {
						field553 = true;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 88) {
				field504 = field247.method244();
				field349 = field247.method244();
				field255 = field247.method244();
				field221 = true;
				field553 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 74) {
				int var23 = field247.method274();
				boolean var24 = field247.method244() == 1;
				USEDZXXV.field1113[var23].field1120 = var24;
				field355 = -1;
				return true;
			}

			if (field355 == 191) {
				field428 = field247.method273() * 30;
				field355 = -1;
				return true;
			}

			if (field355 == 18) {
				for (int var25 = 0; var25 < field361.length; var25++) {
					if (field361[var25] != null) {
						field361[var25].field1310 = -1;
					}
				}

				for (int var26 = 0; var26 < field402.length; var26++) {
					if (field402[var26] != null) {
						field402[var26].field1310 = -1;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 0) {
				int var27 = field247.method273();
				method90(var27);

				if (field240 != -1) {
					field240 = -1;
					field410 = true;
					field344 = true;
				}

				field531 = var27;
				field553 = true;
				field203 = -1;
				field557 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 136 || field355 == 50) {
				int var28 = field395;
				int var29 = field396;
				if (field355 == 136) {
					var28 = field247.method246();
					var29 = field247.method272();
					field554 = false;
				}

				if (field355 == 50) {
					var28 = field247.method272();
					field247.method254();

					for (int var30 = 0; var30 < 4; var30++) {
						for (int var31 = 0; var31 < 13; var31++) {
							for (int var32 = 0; var32 < 13; var32++) {
								int var33 = field247.method255(1);
								if (var33 == 1) {
									field430[var30][var31][var32] = field247.method255(26);
								} else {
									field430[var30][var31][var32] = -1;
								}
							}
						}
					}

					field247.method256();
					var29 = field247.method246();
					field554 = true;
				}

				if (field395 == var28 && field396 == var29 && field253 == 2) {
					field355 = -1;
					return true;
				}

				field395 = var28;
				field396 = var29;
				field340 = (field395 - 6) * 8;
				field341 = (field396 - 6) * 8;
				field383 = false;
				if ((field395 / 8 == 48 || field395 / 8 == 49) && field396 / 8 == 48) {
					field383 = true;
				}

				if (field395 / 8 == 48 && field396 / 8 == 148) {
					field383 = true;
				}

				field253 = 1;
				field489 = System.currentTimeMillis();
				field323.method393();
				field406.method190(151, 257, "Loading - please wait.", 0);
				field406.method190(150, 256, "Loading - please wait.", 0xFFFFFF);
				field323.method394(field60, 4, 4);

				if (field355 == 136) {
					int var34 = 0;
					for (int var35 = (field395 - 6) / 8; var35 <= (field395 + 6) / 8; var35++) {
						for (int var36 = (field396 - 6) / 8; var36 <= (field396 + 6) / 8; var36++) {
							var34++;
						}
					}

					field320 = new byte[var34][];
					field237 = new byte[var34][];
					field560 = new int[var34];
					field561 = new int[var34];
					field562 = new int[var34];
					int var37 = 0;
					for (int var38 = (field395 - 6) / 8; var38 <= (field395 + 6) / 8; var38++) {
						for (int var39 = (field396 - 6) / 8; var39 <= (field396 + 6) / 8; var39++) {
							field560[var37] = (var38 << 8) + var39;

							if (field383 && (var39 == 49 || var39 == 149 || var39 == 147 || var38 == 50 || var38 == 49 && var39 == 47)) {
								field561[var37] = -1;
								field562[var37] = -1;
								var37++;
							} else {
								int var40 = field561[var37] = field182.method376(var39, 0, var38);
								if (var40 != -1) {
									field182.method365(3, var40);
								}

								int var41 = field562[var37] = field182.method376(var39, 1, var38);
								if (var41 != -1) {
									field182.method365(3, var41);
								}

								var37++;
							}
						}
					}
				}

				if (field355 == 50) {
					int var42 = 0;
					int[] var43 = new int[676];
					for (int var44 = 0; var44 < 4; var44++) {
						for (int var45 = 0; var45 < 13; var45++) {
							for (int var46 = 0; var46 < 13; var46++) {
								int var47 = field430[var44][var45][var46];
								if (var47 != -1) {
									int var48 = var47 >> 14 & 0x3FF;
									int var49 = var47 >> 3 & 0x7FF;
									int var50 = (var48 / 8 << 8) + var49 / 8;
									for (int var51 = 0; var51 < var42; var51++) {
										if (var43[var51] == var50) {
											var50 = -1;
											break;
										}
									}

									if (var50 != -1) {
										var43[var42++] = var50;
									}
								}
							}
						}
					}

					field320 = new byte[var42][];
					field237 = new byte[var42][];
					field560 = new int[var42];
					field561 = new int[var42];
					field562 = new int[var42];
					for (int var52 = 0; var52 < var42; var52++) {
						int var53 = field560[var52] = var43[var52];
						int var54 = var53 >> 8 & 0xFF;
						int var55 = var53 & 0xFF;
						int var56 = field561[var52] = field182.method376(var55, 0, var54);
						if (var56 != -1) {
							field182.method365(3, var56);
						}

						int var57 = field562[var52] = field182.method376(var55, 1, var54);
						if (var57 != -1) {
							field182.method365(3, var57);
						}
					}
				}

				int var58 = field340 - field342;
				int var59 = field341 - field343;
				field342 = field340;
				field343 = field341;

				for (int var60 = 0; var60 < 16384; var60++) {
					QDXHSLSL var61 = field402[var60];
					if (var61 != null) {
						for (int var62 = 0; var62 < 10; var62++) {
							var61.field1308[var62] -= var58;
							var61.field1309[var62] -= var59;
						}

						var61.field1292 -= var58 * 128;
						var61.field1293 -= var59 * 128;
					}
				}

				for (int var63 = 0; var63 < field359; var63++) {
					PASMQFXV var64 = field361[var63];
					if (var64 != null) {
						for (int var65 = 0; var65 < 10; var65++) {
							var64.field1308[var65] -= var58;
							var64.field1309[var65] -= var59;
						}

						var64.field1292 -= var58 * 128;
						var64.field1293 -= var59 * 128;
					}
				}

				field520 = true;
				byte var66 = 0;
				byte var67 = 104;
				byte var68 = 1;
				if (var58 < 0) {
					var66 = 103;
					var67 = -1;
					var68 = -1;
				}

				byte var69 = 0;
				byte var70 = 104;
				byte var71 = 1;
				if (var59 < 0) {
					var69 = 103;
					var70 = -1;
					var71 = -1;
				}

				for (int var72 = var66; var72 != var67; var72 += var68) {
					for (int var73 = var69; var73 != var70; var73 += var71) {
						int var74 = var58 + var72;
						int var75 = var59 + var73;
						for (int var76 = 0; var76 < 4; var76++) {
							if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
								field505[var76][var72][var73] = field505[var76][var74][var75];
							} else {
								field505[var76][var72][var73] = null;
							}
						}
					}
				}

				for (DSELJCMH var77 = (DSELJCMH) field200.method528(); var77 != null; var77 = (DSELJCMH) field200.method530()) {
					var77.field655 -= var58;
					var77.field656 -= var59;
					if (var77.field655 < 0 || var77.field656 < 0 || var77.field655 >= 104 || var77.field656 >= 104) {
						var77.method555();
					}
				}

				if (field492 != 0) {
					field492 -= var58;
					field493 -= var59;
				}

				field333 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 248) {
				field264 = field247.method244();
				field355 = -1;
				return true;
			}

			if (field355 == 55) {
				if (field223 == 12) {
					field410 = true;
				}

				field446 = field247.method247();
				field355 = -1;
				return true;
			}

			if (field355 == 11) {
				int var78 = field247.method249();
				int var79 = field247.method272();
				field429[var79] = var78;

				if (field450[var79] != var78) {
					field450[var79] = var78;
					method35(var79);
					field410 = true;

					if (field495 != -1) {
						field553 = true;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 35) {
				int var80 = field247.method246();
				int var81 = field247.method247();
				USEDZXXV var82 = USEDZXXV.field1113[var80];
				var82.field1149 = var81;

				if (var81 == -1) {
					var82.field1125 = 0;
					var82.field1116 = 0;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 239) {
				int var83 = field247.method246();
				int var84 = field247.method244();
				int var85 = field247.method246();
				if (field568 && !field214 && field177 < 50) {
					field295[field177] = var83;
					field183[field177] = var84;
					field544[field177] = CMHYVIXN.field592[var83] + var85;
					field177++;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 185) {
				if (field223 == 12) {
					field410 = true;
				}

				field417 = field247.method244();
				field355 = -1;
				return true;
			}

			if (field355 == 62) {
				int var86 = field247.method272();
				if (var86 == 0xFFFF) {
					var86 = -1;
				}

				if (field189 != var86 && field517 && !field214 && field225 == 0) {
					field297 = var86;
					field298 = true;
					field182.method365(2, field297);
				}

				field189 = var86;
				field355 = -1;
				return true;
			}

			if (field355 == 195) {
				int var87 = field247.method246();
				int var88 = field247.method246();
				if (field517 && !field214) {
					field297 = var87;
					field298 = false;
					field182.method365(2, field297);
					field225 = var88;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 219) {
				long var89 = field247.method250();
				int var91 = field247.method249();
				int var92 = field247.method244();
				boolean var93 = false;
				for (int var94 = 0; var94 < 100; var94++) {
					if (field283[var94] == var91) {
						var93 = true;
						break;
					}
				}

				if (var92 <= 1) {
					for (int var95 = 0; var95 < field181; var95++) {
						if (field305[var95] == var89) {
							var93 = true;
							break;
						}
					}
				}

				if (!var93 && field439 == 0) {
					try {
						field283[field524] = var91;
						field524 = (field524 + 1) % 100;
						String var96 = KUSEAONH.method343(field247, field354 - 13);
						if (var92 != 3) {
							var96 = HUPJRXOW.method298(var96);
						}

						if (var92 == 2 || var92 == 3) {
							method155(var96, "@cr2@" + YYRFHIVS.method587(YYRFHIVS.method584(var89)), 7);
						} else if (var92 == 1) {
							method155(var96, "@cr1@" + YYRFHIVS.method587(YYRFHIVS.method584(var89)), 7);
						} else {
							method155(var96, YYRFHIVS.method587(YYRFHIVS.method584(var89)), 3);
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 249) {
				int var98 = field247.method264();
				String var99 = field247.method251();
				int var100 = field247.method265();
				if (var100 >= 1 && var100 <= 5) {
					if (var99.equalsIgnoreCase("null")) {
						var99 = null;
					}

					field272[var100 - 1] = var99;
					field273[var100 - 1] = var98 == 0;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 220) {
				long var101 = field247.method250();
				int var103 = field247.method244();
				String var104 = YYRFHIVS.method587(YYRFHIVS.method584(var101));
				for (int var105 = 0; var105 < field171; var105++) {
					if (field502[var105] == var101) {
						if (field316[var105] != var103) {
							field316[var105] = var103;
							field410 = true;

							if (var103 > 0) {
								method155(var104 + " has logged in.", "", 5);
							}

							if (var103 == 0) {
								method155(var104 + " has logged out.", "", 5);
							}
						}

						var104 = null;
						break;
					}
				}

				if (var104 != null && field171 < 200) {
					field502[field171] = var101;
					field445[field171] = var104;
					field316[field171] = var103;
					field171++;
					field410 = true;
				}

				boolean var106 = false;
				while (!var106) {
					var106 = true;
					for (int var107 = 0; var107 < field171 - 1; var107++) {
						if (field316[var107] != field211 && field316[var107 + 1] == field211 || field316[var107] == 0 && field316[var107 + 1] != 0) {
							int var108 = field316[var107];
							field316[var107] = field316[var107 + 1];
							field316[var107 + 1] = var108;
							String var109 = field445[var107];
							field445[var107] = field445[var107 + 1];
							field445[var107 + 1] = var109;
							long var110 = field502[var107];
							field502[var107] = field502[var107 + 1];
							field502[var107 + 1] = var110;
							field410 = true;
							var106 = false;
						}
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 231) {
				field333 = true;
				field497 = field247.method244();
				field498 = field247.method244();
				field499 = field247.method246();
				field500 = field247.method244();
				field501 = field247.method244();
				if (field501 >= 100) {
					field206 = field497 * 128 + 64;
					field208 = field498 * 128 + 64;
					field207 = method119(field208, field530, field206) - field499;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 85) {
				field333 = true;
				field525 = field247.method244();
				field526 = field247.method244();
				field527 = field247.method246();
				field528 = field247.method244();
				field529 = field247.method244();
				if (field529 >= 100) {
					int var112 = field525 * 128 + 64;
					int var113 = field526 * 128 + 64;
					int var114 = method119(var113, field530, var112) - field527;
					int var115 = var112 - field206;
					int var116 = var114 - field207;
					int var117 = var113 - field208;
					int var118 = (int) Math.sqrt(var115 * var115 + var117 * var117);
					field209 = (int) (Math.atan2(var116, var118) * 325.949D) & 0x7FF;
					field210 = (int) (Math.atan2(var115, var117) * -325.949D) & 0x7FF;

					if (field209 < 128) {
						field209 = 128;
					}

					if (field209 > 383) {
						field209 = 383;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 156) {
				field337 = field247.method244();
				if (field337 == 1) {
					field231 = field247.method246();
				}

				if (field337 >= 2 && field337 <= 6) {
					if (field337 == 2) {
						field331 = 64;
						field332 = 64;
					}

					if (field337 == 3) {
						field331 = 0;
						field332 = 64;
					}

					if (field337 == 4) {
						field331 = 128;
						field332 = 64;
					}

					if (field337 == 5) {
						field331 = 64;
						field332 = 0;
					}

					if (field337 == 6) {
						field331 = 64;
						field332 = 128;
					}

					field337 = 2;
					field328 = field247.method246();
					field329 = field247.method246();
					field330 = field247.method244();
				}

				if (field337 == 10) {
					field470 = field247.method246();
				}

				field355 = -1;
				return true;
			}

			if (field355 == 223) {
				int var119 = field247.method246();
				USEDZXXV var120 = USEDZXXV.field1113[var119];
				for (int var121 = 0; var121 < var120.field1155.length; var121++) {
					var120.field1155[var121] = -1;
					var120.field1155[var121] = 0;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 27) {
				field267 = field247.method264();
				if (field267 == field223) {
					if (field267 == 3) {
						field223 = 1;
					} else {
						field223 = 3;
					}

					field410 = true;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 225) {
				field224 = field247.method274();
				field469 = field247.method263();
				field296 = field247.method249();
				field184 = field247.method244();
				field310 = field247.method273();

				if (field296 != 0 && field203 == -1) {
					signlink.dnslookup(YYRFHIVS.method586(field296));
					method140();
					short var122 = 650;
					if (field469 != 201 || field184 == 1) {
						var122 = 655;
					}

					field457 = "";
					field515 = false;

					for (int var123 = 0; var123 < USEDZXXV.field1113.length; var123++) {
						if (USEDZXXV.field1113[var123] != null && USEDZXXV.field1113[var123].field1157 == var122) {
							field203 = USEDZXXV.field1113[var123].field1153;
							break;
						}
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 142) {
				int var124 = field247.method272();
				method90(var124);

				if (field240 != -1) {
					field240 = -1;
					field410 = true;
					field344 = true;
				}

				if (field531 != -1) {
					field531 = -1;
					field553 = true;
				}

				if (field367 != 0) {
					field367 = 0;
					field553 = true;
				}

				field203 = var124;
				field557 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 174) {
				field333 = false;

				for (int var125 = 0; var125 < 5; var125++) {
					field545[var125] = false;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 43) {
				method78();
				field355 = -1;
				return false;
			}

			if (field355 == 38) {
				int var126 = field247.method244();
				int var127 = field247.method244();
				int var128 = field247.method244();
				int var129 = field247.method244();
				field545[var126] = true;
				field471[var126] = var127;
				field373[var126] = var128;
				field448[var126] = var129;
				field167[var126] = 0;
				field355 = -1;
				return true;
			}

			if (field355 == 139) {
				field559 = field247.method263();
				field394 = field247.method274();
				field355 = -1;
				return true;
			}

			if (field355 == 91) {
				int var130 = field247.method275();
				int var131 = field247.method275();
				int var132 = field247.method273();
				USEDZXXV var133 = USEDZXXV.field1113[var132];
				var133.field1117 = var131;
				var133.field1142 = var130;
				field355 = -1;
				return true;
			}

			if (field355 == 89) {
				int var134 = field247.method272();
				int var135 = field247.method272();
				USEDZXXV.field1113[var134].field1127 = 1;
				USEDZXXV.field1113[var134].field1128 = var135;
				field355 = -1;
				return true;
			}

			if (field355 == 86) {
				int var136 = field247.method273();
				USEDZXXV.field1113[var136].field1127 = 3;

				if (field535.field949 == null) {
					USEDZXXV.field1113[var136].field1128 = (field535.field939[11] << 5) + (field535.field939[8] << 10) + (field535.field939[0] << 15) + (field535.field957[0] << 25) + (field535.field957[4] << 20) + field535.field939[1];
				} else {
					USEDZXXV.field1113[var136].field1128 = (int) (field535.field949.field892 + 0x12345678L);
				}

				field355 = -1;
				return true;
			}

			if (field355 == 115) {
				for (int var137 = 0; var137 < field450.length; var137++) {
					if (field450[var137] != field429[var137]) {
						field450[var137] = field429[var137];
						method35(var137);
						field410 = true;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 61) {
				field181 = field354 / 8;
				for (int var138 = 0; var138 < field181; var138++) {
					field305[var138] = field247.method250();
				}

				field355 = -1;
				return true;
			}

			if (field355 == 68) {
				field313 = field247.method244();
				field314 = field247.method265();
				field355 = -1;
				return true;
			}

			if (field355 == 181) {
				field172 = field247.method244();
				field410 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 169) {
				method135(field354, field247);
				field520 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 230) {
				int var139 = field247.method273();
				int var140 = field247.method272();
				int var141 = var140 >> 10 & 0x1F;
				int var142 = var140 >> 5 & 0x1F;
				int var143 = var140 & 0x1F;
				USEDZXXV.field1113[var139].field1137 = (var143 << 3) + (var141 << 19) + (var142 << 11);
				field355 = -1;
				return true;
			}

			if (field355 == 204) {
				field391 = field247.method244();
				field355 = -1;
				return true;
			}

			if (field355 == 124) {
				field492 = 0;
				field355 = -1;
				return true;
			}

			if (field355 == 164) {
				if (field240 != -1) {
					field240 = -1;
					field410 = true;
					field344 = true;
				}

				if (field531 != -1) {
					field531 = -1;
					field553 = true;
				}

				if (field367 != 0) {
					field367 = 0;
					field553 = true;
				}

				field203 = -1;
				field557 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 158) {
				int var144 = field247.method274();
				int var145 = field247.method246();
				int var146 = field247.method273();

				if (var145 == 0xFFFF) {
					USEDZXXV.field1113[var144].field1127 = 0;
					field355 = -1;
					return true;
				}

				AVSLDGMK var147 = AVSLDGMK.method4(var145);
				USEDZXXV.field1113[var144].field1127 = 4;
				USEDZXXV.field1113[var144].field1128 = var145;
				USEDZXXV.field1113[var144].field1111 = var147.field9;
				USEDZXXV.field1113[var144].field1112 = var147.field48;
				USEDZXXV.field1113[var144].field1110 = var147.field4 * 100 / var146;
				field355 = -1;
				return true;
			}

			if (field355 == 154) {
				field410 = true;
				int var148 = field247.method278();
				int var149 = field247.method264();
				int var150 = field247.method265();
				field555[var149] = var148;
				field326[var149] = var150;
				field368[var149] = 1;
				for (int var151 = 0; var151 < 98; var151++) {
					if (var148 >= field319[var151]) {
						field368[var149] = var151 + 2;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 161) {
				field223 = field247.method265();
				field410 = true;
				field344 = true;
				field355 = -1;
				return true;
			}

			if (field355 == 244) {
				field314 = field247.method244();
				field313 = field247.method263();
				for (int var152 = field313; var152 < field313 + 8; var152++) {
					for (int var153 = field314; var153 < field314 + 8; var153++) {
						if (field505[field530][var152][var153] != null) {
							field505[field530][var152][var153] = null;
							method131(var152, var153);
						}
					}
				}

				for (DSELJCMH var154 = (DSELJCMH) field200.method528(); var154 != null; var154 = (DSELJCMH) field200.method530()) {
					if (var154.field655 >= field313 && var154.field655 < field313 + 8 && var154.field656 >= field314 && var154.field656 < field314 + 8 && field530 == var154.field653) {
						var154.field652 = 0;
					}
				}

				field355 = -1;
				return true;
			}

			if (field355 == 243) {
				field410 = true;
				int var155 = field247.method246();
				USEDZXXV var156 = USEDZXXV.field1113[var155];
				int var157 = field247.method246();
				for (int var158 = 0; var158 < var157; var158++) {
					var156.field1155[var158] = field247.method272();
					int var159 = field247.method244();
					if (var159 == 255) {
						var159 = field247.method278();
					}

					var156.field1169[var158] = var159;
				}

				for (int var160 = var157; var160 < var156.field1155.length; var160++) {
					var156.field1155[var160] = 0;
					var156.field1169[var160] = 0;
				}

				field355 = -1;
				return true;
			}

			if (field355 == 40 || field355 == 83 || field355 == 205 || field355 == 7 || field355 == 118 || field355 == 9 || field355 == 134 || field355 == 255 || field355 == 183 || field355 == 75 || field355 == 192) {
				method106(field247, field355);
				field355 = -1;
				return true;
			}

			if (field355 == 177) {
				String var161 = field247.method251();
				if (var161.endsWith(":tradereq:")) {
					String var162 = var161.substring(0, var161.indexOf(":"));
					long var163 = YYRFHIVS.method583(var162);
					boolean var165 = false;
					for (int var166 = 0; var166 < field181; var166++) {
						if (field305[var166] == var163) {
							var165 = true;
							break;
						}
					}

					if (!var165 && field439 == 0) {
						method155("wishes to trade with you.", var162, 4);
					}
				} else if (var161.endsWith(":duelreq:")) {
					String var167 = var161.substring(0, var161.indexOf(":"));
					long var168 = YYRFHIVS.method583(var167);
					boolean var170 = false;
					for (int var171 = 0; var171 < field181; var171++) {
						if (field305[var171] == var168) {
							var170 = true;
							break;
						}
					}

					if (!var170 && field439 == 0) {
						method155("wishes to duel with you.", var167, 8);
					}
				} else if (var161.endsWith(":chalreq:")) {
					String var172 = var161.substring(0, var161.indexOf(":"));
					long var173 = YYRFHIVS.method583(var172);
					boolean var175 = false;
					for (int var176 = 0; var176 < field181; var176++) {
						if (field305[var176] == var173) {
							var175 = true;
							break;
						}
					}

					if (!var175 && field439 == 0) {
						String var177 = var161.substring(var161.indexOf(":") + 1, var161.length() - 9);
						method155(var177, var172, 8);
					}
				} else {
					method155(var161, "", 0);
				}

				field355 = -1;
				return true;
			}

			if (field355 == 44) {
				int var178 = field247.method274();
				method90(var178);

				if (field531 != -1) {
					field531 = -1;
					field553 = true;
				}

				if (field367 != 0) {
					field367 = 0;
					field553 = true;
				}

				field240 = var178;
				field410 = true;
				field344 = true;
				field203 = -1;
				field557 = false;
				field355 = -1;
				return true;
			}

			if (field355 == 222) {
				int var179 = field247.method246();
				int var180 = field247.method274();
				USEDZXXV.field1113[var179].field1127 = 2;
				USEDZXXV.field1113[var179].field1128 = var180;
				field355 = -1;
				return true;
			}

			if (field355 == 97) {
				method77(field247, field354);
				field355 = -1;
				return true;
			}

			if (field355 == 28) {
				field313 = field247.method244();
				field314 = field247.method265();

				while (field247.field709 < field354) {
					int var181 = field247.method244();
					method106(field247, var181);
				}

				field355 = -1;
				return true;
			}

			if (field355 == 16) {
				int var182 = field247.method275();
				if (var182 >= 0) {
					method90(var182);
				}

				field413 = var182;
				field355 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field355 + "," + field354 + " - " + field379 + "," + field380);
			method78();
		} catch (IOException var187) {
			method52();
		} catch (Exception var188) {
			String var184 = "T2 - " + field355 + "," + field379 + "," + field380 + " - " + field354 + "," + (field535.field1308[0] + field340) + "," + (field535.field1309[0] + field341) + " - ";
			for (int var185 = 0; var185 < field354 && var185 < 50; var185++) {
				var184 = var184 + field247.field708[var185] + ",";
			}

			signlink.reporterror(var184);
			method78();
		}

		return true;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method23() {
		field227 = true;
	}

	@ObfuscatedName("client.a(LGLMIQHJI;II)V")
	public final void method103(GLMIQHJI arg0, int arg1) {
		arg0.method254();
		int var3 = arg0.method255(1);
		if (var3 != 0) {
			int var4 = arg0.method255(2);
			if (var4 == 0) {
				field365[field364++] = field360;
			} else if (var4 == 1) {
				int var5 = arg0.method255(3);
				field535.method544(false, var5);
				int var6 = arg0.method255(1);
				if (var6 == 1) {
					field365[field364++] = field360;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method255(3);
				field535.method544(true, var7);
				int var8 = arg0.method255(3);
				field535.method544(true, var8);
				int var9 = arg0.method255(1);
				if (var9 == 1) {
					field365[field364++] = field360;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method255(7);
				int var11 = arg0.method255(7);
				field530 = arg0.method255(2);
				int var12 = arg0.method255(1);
				int var13 = arg0.method255(1);
				if (var13 == 1) {
					field365[field364++] = field360;
				}

				field535.method546(var10, var12 == 1, var11);
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method104(boolean arg0) {
		for (int var2 = 0; var2 < field403; var2++) {
			QDXHSLSL var3 = field402[field404[var2]];
			int var4 = (field404[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method404() && var3.field972.field877 == arg0) {
				int var5 = var3.field1292 >> 7;
				int var6 = var3.field1293 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1318 == 1 && (var3.field1292 & 0x7F) == 0x40 && (var3.field1293 & 0x7F) == 0x40) {
						if (field186[var5][var6] == field346) {
							continue;
						}

						field186[var5][var6] = field346;
					}

					field191.method422(field530, var3.field1286, var4, var3, var3.field1293, var3.field1292, var3.field1294, (var3.field1318 - 1) * 64 + 60, method119(var3.field1293, field530, var3.field1292));
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method105(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.b(LGLMIQHJI;II)V")
	public final void method106(GLMIQHJI arg0, int arg1) {
		if (arg1 == 83) {
			int var3 = arg0.method244();
			int var4 = (var3 >> 4 & 0x7) + field313;
			int var5 = (var3 & 0x7) + field314;
			int var6 = arg0.method246();
			int var7 = arg0.method246();
			int var8 = arg0.method246();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				VLLJSJTJ var9 = field505[field530][var4][var5];
				if (var9 != null) {
					for (NOAOCJCI var10 = (NOAOCJCI) var9.method528(); var10 != null; var10 = (NOAOCJCI) var9.method530()) {
						if ((var6 & 0x7FFF) == var10.field915 && var10.field914 == var7) {
							var10.field914 = var8;
							break;
						}
					}

					method131(var4, var5);
				}
			}
		} else {
			if (arg1 == 205) {
				byte var11 = arg0.method245();
				byte var12 = arg0.method267();
				byte var13 = arg0.method266();
				byte var14 = arg0.method266();
				int var15 = arg0.method244();
				int var16 = (var15 >> 4 & 0x7) + field313;
				int var17 = (var15 & 0x7) + field314;
				int var18 = arg0.method264();
				int var19 = var18 >> 2;
				int var20 = var18 & 0x3;
				int var21 = field519[var19];
				int var22 = arg0.method272();
				int var23 = arg0.method272();
				int var24 = arg0.method273();
				int var25 = arg0.method272();
				PASMQFXV var26;
				if (field394 == var23) {
					var26 = field535;
				} else {
					var26 = field361[var23];
				}

				if (var26 != null) {
					RFUKTMBK var27 = RFUKTMBK.method472(var25);
					int var28 = field262[field530][var16][var17];
					int var29 = field262[field530][var16 + 1][var17];
					int var30 = field262[field530][var16 + 1][var17 + 1];
					int var31 = field262[field530][var16][var17 + 1];
					VHYCWIPJ var32 = var27.method462(var19, var20, var28, var29, var30, var31, -1);
					if (var32 != null) {
						method88(field530, var17, 0, -1, var16, var21, 0, var24 + 1, var22 + 1);
						var26.field950 = field307 + var24;
						var26.field951 = field307 + var22;
						var26.field955 = var32;
						int var33 = var27.field1082;
						int var34 = var27.field1053;
						if (var20 == 1 || var20 == 3) {
							var33 = var27.field1053;
							var34 = var27.field1082;
						}

						var26.field952 = var16 * 128 + var33 * 64;
						var26.field954 = var17 * 128 + var34 * 64;
						var26.field953 = method119(var26.field954, field530, var26.field952);

						if (var13 > var14) {
							byte var35 = var13;
							var13 = var14;
							var14 = var35;
						}

						if (var11 > var12) {
							byte var36 = var11;
							var11 = var12;
							var12 = var36;
						}

						var26.field940 = var13 + var16;
						var26.field942 = var14 + var16;
						var26.field941 = var11 + var17;
						var26.field943 = var12 + var17;
					}
				}
			}

			if (arg1 == 255) {
				int var37 = arg0.method272();
				int var38 = arg0.method265();
				int var39 = (var38 >> 4 & 0x7) + field313;
				int var40 = (var38 & 0x7) + field314;
				int var41 = arg0.method246();
				if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
					NOAOCJCI var42 = new NOAOCJCI();
					var42.field915 = var37;
					var42.field914 = var41;

					if (field505[field530][var39][var40] == null) {
						field505[field530][var39][var40] = new VLLJSJTJ();
					}

					field505[field530][var39][var40].method525(var42);
					method131(var39, var40);
				}
			} else if (arg1 == 75) {
				int var43 = arg0.method265();
				int var44 = var43 >> 2;
				int var45 = var43 & 0x3;
				int var46 = field519[var44];
				int var47 = arg0.method244();
				int var48 = (var47 >> 4 & 0x7) + field313;
				int var49 = (var47 & 0x7) + field314;
				if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
					method88(field530, var49, var44, -1, var48, var46, var45, 0, -1);
				}
			} else {
				if (arg1 == 40) {
					int var50 = arg0.method244();
					int var51 = (var50 >> 4 & 0x7) + field313;
					int var52 = (var50 & 0x7) + field314;
					int var53 = arg0.method246();
					int var54 = arg0.method244();
					int var55 = var54 >> 4 & 0xF;
					int var56 = var54 & 0x7;
					if (field535.field1308[0] >= var51 - var55 && field535.field1308[0] <= var51 + var55 && field535.field1309[0] >= var52 - var55 && field535.field1309[0] <= var52 + var55 && field568 && !field214 && field177 < 50) {
						field295[field177] = var53;
						field183[field177] = var56;
						field544[field177] = CMHYVIXN.field592[var53];
						field177++;
					}
				}

				if (arg1 == 134) {
					int var57 = arg0.method265();
					int var58 = (var57 >> 4 & 0x7) + field313;
					int var59 = (var57 & 0x7) + field314;
					int var60 = arg0.method246();
					if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
						VLLJSJTJ var61 = field505[field530][var58][var59];
						if (var61 != null) {
							for (NOAOCJCI var62 = (NOAOCJCI) var61.method528(); var62 != null; var62 = (NOAOCJCI) var61.method530()) {
								if ((var60 & 0x7FFF) == var62.field915) {
									var62.method555();
									break;
								}
							}

							if (var61.method528() == null) {
								field505[field530][var58][var59] = null;
							}

							method131(var58, var59);
						}
					}
				} else if (arg1 == 7) {
					int var63 = arg0.method263();
					int var64 = (var63 >> 4 & 0x7) + field313;
					int var65 = (var63 & 0x7) + field314;
					int var66 = arg0.method272();
					int var67 = arg0.method246();
					int var68 = arg0.method246();
					if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104 && field394 != var68) {
						NOAOCJCI var69 = new NOAOCJCI();
						var69.field915 = var66;
						var69.field914 = var67;

						if (field505[field530][var64][var65] == null) {
							field505[field530][var64][var65] = new VLLJSJTJ();
						}

						field505[field530][var64][var65].method525(var69);
						method131(var64, var65);
					}
				} else if (arg1 == 192) {
					int var70 = arg0.method272();
					int var71 = arg0.method244();
					int var72 = (var71 >> 4 & 0x7) + field313;
					int var73 = (var71 & 0x7) + field314;
					int var74 = arg0.method263();
					int var75 = var74 >> 2;
					int var76 = var74 & 0x3;
					int var77 = field519[var75];
					if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
						method88(field530, var73, var75, var70, var72, var77, var76, 0, -1);
					}
				} else if (arg1 == 9) {
					int var78 = arg0.method244();
					int var79 = (var78 >> 4 & 0x7) + field313;
					int var80 = (var78 & 0x7) + field314;
					int var81 = var79 + arg0.method245();
					int var82 = var80 + arg0.method245();
					int var83 = arg0.method247();
					int var84 = arg0.method246();
					int var85 = arg0.method244() * 4;
					int var86 = arg0.method244() * 4;
					int var87 = arg0.method246();
					int var88 = arg0.method246();
					int var89 = arg0.method244();
					int var90 = arg0.method244();
					if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var84 != 0xFFFF) {
						var79 = var79 * 128 + 64;
						var80 = var80 * 128 + 64;
						var81 = var81 * 128 + 64;
						var82 = var82 * 128 + 64;
						IRBOJPFQ var91 = new IRBOJPFQ(method119(var80, field530, var79) - var85, field307 + var87, field307 + var88, var89, -17838, var90, var80, var79, var83, field530, var84, var86);
						var91.method339(var82, var81, method119(var82, field530, var81) - var86, field307 + var87);
						field370.method525(var91);
					}
				} else if (arg1 == 118) {
					int var92 = arg0.method244();
					int var93 = (var92 >> 4 & 0x7) + field313;
					int var94 = (var92 & 0x7) + field314;
					int var95 = arg0.method246();
					int var96 = arg0.method244();
					int var97 = arg0.method246();
					if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
						var93 = var93 * 128 + 64;
						var94 = var94 * 128 + 64;
						EWLVGVJE var98 = new EWLVGVJE(var95, method119(var94, field530, var93) - var96, field530, var94, var97, field307, var93);
						field325.method525(var98);
					}
				} else if (arg1 == 183) {
					int var99 = arg0.method264();
					int var100 = var99 >> 2;
					int var101 = var99 & 0x3;
					int var102 = field519[var100];
					int var103 = arg0.method265();
					int var104 = (var103 >> 4 & 0x7) + field313;
					int var105 = (var103 & 0x7) + field314;
					int var106 = arg0.method272();
					if (var104 >= 0 && var105 >= 0 && var104 < 103 && var105 < 103) {
						int var107 = field262[field530][var104][var105];
						int var108 = field262[field530][var104 + 1][var105];
						int var109 = field262[field530][var104 + 1][var105 + 1];
						int var110 = field262[field530][var104][var105 + 1];
						if (var102 == 0) {
							PYJTEIQD var111 = field191.method433(field530, var104, var105);
							if (var111 != null) {
								int var112 = var111.field970 >> 14 & 0x7FFF;
								if (var100 == 2) {
									var111.field968 = new XWNQXFLX(2, var108, var107, var109, false, var106, var101 + 4, var110, var112);
									var111.field969 = new XWNQXFLX(2, var108, var107, var109, false, var106, var101 + 1 & 0x3, var110, var112);
								} else {
									var111.field968 = new XWNQXFLX(var100, var108, var107, var109, false, var106, var101, var110, var112);
								}
							}
						}

						if (var102 == 1) {
							ISUMKKWB var113 = field191.method434(field530, var105, var104);
							if (var113 != null) {
								var113.field795 = new XWNQXFLX(4, var108, var107, var109, false, var106, 0, var110, var113.field796 >> 14 & 0x7FFF);
							}
						}

						if (var102 == 2) {
							BLSRUZPO var114 = field191.method435(field530, var105, var104);

							if (var100 == 11) {
								var100 = 10;
							}

							if (var114 != null) {
								var114.field101 = new XWNQXFLX(var100, var108, var107, var109, false, var106, var101, var110, var114.field109 >> 14 & 0x7FFF);
							}
						}

						if (var102 == 3) {
							TMKFLEJD var115 = field191.method436(field530, var105, var104);
							if (var115 != null) {
								var115.field1086 = new XWNQXFLX(22, var108, var107, var109, false, var106, var101, var110, var115.field1087 >> 14 & 0x7FFF);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method107(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(ILUSEDZXXV;B)I")
	public final int method108(int arg0, USEDZXXV arg1) {
		if (arg1.field1145 == null || arg0 >= arg1.field1145.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1145[arg0];
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
					var8 = field326[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field368[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field555[var3[var5++]];
				}

				if (var7 == 4) {
					USEDZXXV var10 = USEDZXXV.field1113[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < AVSLDGMK.field5 && (!AVSLDGMK.method4(var11).field49 || field213)) {
						for (int var12 = 0; var12 < var10.field1155.length; var12++) {
							if (var11 + 1 == var10.field1155[var12]) {
								var8 += var10.field1169[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field450[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field319[field368[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field450[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field535.field959;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < YBPDMGDP.field1432; var13++) {
						if (YBPDMGDP.field1434[var13]) {
							var8 += field368[var13];
						}
					}
				}

				if (var7 == 10) {
					USEDZXXV var14 = USEDZXXV.field1113[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < AVSLDGMK.field5 && (!AVSLDGMK.method4(var15).field49 || field213)) {
						for (int var16 = 0; var16 < var14.field1155.length; var16++) {
							if (var14.field1155[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field417;
				}

				if (var7 == 12) {
					var8 = field446;
				}

				if (var7 == 13) {
					int var17 = field450[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					ZIUDVZAI var20 = ZIUDVZAI.field1480[var19];
					int var21 = var20.field1482;
					int var22 = var20.field1483;
					int var23 = var20.field1484;
					int var24 = field518[var23 - var22];
					var8 = field450[var21] >> var22 & var24;
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
					var8 = (field535.field1292 >> 7) + field340;
				}

				if (var7 == 19) {
					var8 = (field535.field1293 >> 7) + field341;
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
	public final void method109() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.h(B)V")
	public final void method110() {
		field346++;
		method79(true);
		method104(true);
		method79(false);
		method104(false);
		method117();
		method46();

		if (!field333) {
			int var1 = field278;
			if (field291 / 256 > var1) {
				var1 = field291 / 256;
			}

			if (field545[4] && field373[4] + 128 > var1) {
				var1 = field373[4] + 128;
			}

			int var2 = field431 + field279 & 0x7FF;
			method53(field217, field216, var1 * 3 + 600, var2, method119(field535.field1293, field530, field535.field1292) - 50, var1);
		}

		int var3;
		if (field333) {
			var3 = method41();
		} else {
			var3 = method40();
		}

		int var4 = field206;
		int var5 = field207;
		int var6 = field208;
		int var7 = field209;
		int var8 = field210;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field545[var9]) {
				int var10 = (int) (Math.random() * (field471[var9] * 2 + 1) + Math.sin(field448[var9] / 100.0D * field167[var9]) * field373[var9] - field471[var9]);
				if (var9 == 0) {
					field206 += var10;
				}

				if (var9 == 1) {
					field207 += var10;
				}

				if (var9 == 2) {
					field208 += var10;
				}

				if (var9 == 3) {
					field210 = field210 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field209 += var10;
					if (field209 < 128) {
						field209 = 128;
					}

					if (field209 > 383) {
						field209 = 383;
					}
				}
			}
		}

		int var11 = CUVGZBEX.field618;
		VHYCWIPJ.field1236 = true;
		VHYCWIPJ.field1239 = 0;
		VHYCWIPJ.field1237 = field68 - 4;
		VHYCWIPJ.field1238 = field69 - 4;
		TQHEKXXC.method476();
		field191.method450(var3, field207, field209, field210, field208, field206);
		field191.method425();
		method149();
		method132();
		method118(var11);
		method113();
		field323.method394(field60, 4, 4);
		field206 = var4;
		field207 = var5;
		field208 = var6;
		field209 = var7;
		field210 = var8;
	}

	@ObfuscatedName("client.a(BIILPASMQFXV;I)V")
	public final void method111(int arg0, int arg1, PASMQFXV arg2, int arg3) {
		if (field535 != arg2 && field503 < 400) {
			String var5;
			if (arg2.field937 == 0) {
				var5 = arg2.field936 + method98(arg2.field959, field535.field959) + " (level-" + arg2.field959 + ")";
			} else {
				var5 = arg2.field936 + " (skill-" + arg2.field937 + ")";
			}

			if (field384 == 1) {
				field585[field503] = "Use " + field388 + " with @whi@" + var5;
				field435[field503] = 448;
				field436[field503] = arg1;
				field433[field503] = arg3;
				field434[field503] = arg0;
				field503++;
			} else if (field192 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field272[var6] != null) {
						field585[field503] = field272[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field272[var6].equalsIgnoreCase("attack")) {
							if (arg2.field959 > field535.field959) {
								var7 = 2000;
							}

							if (field535.field944 != 0 && arg2.field944 != 0) {
								if (field535.field944 == arg2.field944) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field273[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field435[field503] = var7 + 380;
						}

						if (var6 == 1) {
							field435[field503] = var7 + 915;
						}

						if (var6 == 2) {
							field435[field503] = var7 + 401;
						}

						if (var6 == 3) {
							field435[field503] = var7 + 766;
						}

						if (var6 == 4) {
							field435[field503] = var7 + 820;
						}

						field436[field503] = arg1;
						field433[field503] = arg3;
						field434[field503] = arg0;
						field503++;
					}
				}
			} else if ((field194 & 0x8) == 8) {
				field585[field503] = field195 + " @whi@" + var5;
				field435[field503] = 751;
				field436[field503] = arg1;
				field433[field503] = arg3;
				field434[field503] = arg0;
				field503++;
			}

			for (int var8 = 0; var8 < field503; var8++) {
				if (field435[var8] == 610) {
					field585[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method112() {
		for (int var1 = -1; var1 < field362; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field360;
			} else {
				var2 = field363[var1];
			}

			PASMQFXV var3 = field361[var2];
			if (var3 != null) {
				method142(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method113() {
		method160();

		if (field259 == 1) {
			field572[field258 / 100].method331(field256 - 8 - 4, field257 - 8 - 4);
		}

		if (field259 == 2) {
			field572[field258 / 100 + 4].method331(field256 - 8 - 4, field257 - 8 - 4);
		}

		if (field413 != -1) {
			method92(field413, field176);
			method164(USEDZXXV.field1113[field413], 0, 0, 0);
		}

		if (field203 != -1) {
			method92(field203, field176);
			method164(USEDZXXV.field1113[field203], 0, 0, 0);
		}

		method152();

		if (!field398) {
			method37();
			method58();
		} else if (field452 == 0) {
			method36();
		}

		if (field391 == 1) {
			field350[1].method331(472, 296);
		}

		if (field516) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field56 < 15) {
				var3 = 0xFF0000;
			}

			field406.method189(var3, var2, var1, "Fps:" + field56);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field214) {
				int var7 = 0xFF0000;
			}

			field406.method189(0xFFFF00, var2, var1, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field428 != 0) {
			int var8 = field428 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field406.method194("System update in: " + var9 + ":0" + var8, 0xFFFF00, 4, 329);
			} else {
				field406.method194("System update in: " + var9 + ":" + var8, 0xFFFF00, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.a(LDSELJCMH;I)V")
	public final void method114(DSELJCMH arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field654 == 0) {
			var2 = field191.method437(arg0.field653, arg0.field655, arg0.field656);
		}

		if (arg0.field654 == 1) {
			var2 = field191.method438(arg0.field655, arg0.field656, arg0.field653);
		}

		if (arg0.field654 == 2) {
			var2 = field191.method439(arg0.field653, arg0.field655, arg0.field656);
		}

		if (arg0.field654 == 3) {
			var2 = field191.method440(arg0.field653, arg0.field655, arg0.field656);
		}

		if (var2 != 0) {
			int var6 = field191.method441(arg0.field653, arg0.field655, arg0.field656, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field657 = var3;
		arg0.field659 = var4;
		arg0.field658 = var5;
	}

	@ObfuscatedName("client.a(BLVUMXQDFQ;)V")
	public final void method115(VUMXQDFQ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field275.length; var3++) {
			field275[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field275[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field276[var9] = (field275[var9 - 1] + field275[var9 + 1] + field275[var9 - 128] + field275[var9 + 128]) / 4;
				}
			}

			int[] var10 = field275;
			field275 = field276;
			field276 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1262; var12++) {
				for (int var13 = 0; var13 < arg0.field1261; var13++) {
					if (arg0.field1259[var11++] != 0) {
						int var14 = var13 + arg0.field1263 + 16;
						int var15 = var12 + arg0.field1264 + 16;
						int var16 = (var15 << 7) + var14;
						field275[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method116() {
		Graphics var1 = method24().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method17(1);

		if (field309) {
			field266 = false;
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

		if (field496) {
			field266 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field488) {
			field266 = false;
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

	@ObfuscatedName("client.B(I)V")
	public final void method117() {
		for (IRBOJPFQ var1 = (IRBOJPFQ) field370.method528(); var1 != null; var1 = (IRBOJPFQ) field370.method530()) {
			if (field530 != var1.field765 || field307 > var1.field776) {
				var1.method555();
			} else if (field307 >= var1.field775) {
				if (var1.field788 > 0) {
					QDXHSLSL var2 = field402[var1.field788 - 1];
					if (var2 != null && var2.field1292 >= 0 && var2.field1292 < 13312 && var2.field1293 >= 0 && var2.field1293 < 13312) {
						var1.method339(var2.field1293, var2.field1292, method119(var2.field1293, var1.field765, var2.field1292) - var1.field781, field307);
					}
				}

				if (var1.field788 < 0) {
					int var3 = -var1.field788 - 1;
					PASMQFXV var4;
					if (field394 == var3) {
						var4 = field535;
					} else {
						var4 = field361[var3];
					}

					if (var4 != null && var4.field1292 >= 0 && var4.field1292 < 13312 && var4.field1293 >= 0 && var4.field1293 < 13312) {
						var1.method339(var4.field1293, var4.field1292, method119(var4.field1293, var1.field765, var4.field1292) - var1.field781, field307);
					}
				}

				var1.method340(field176);
				field191.method422(field530, false, -1, var1, (int) var1.field771, (int) var1.field770, var1.field766, 60, (int) var1.field772);
			}
		}

		field375++;
		if (field375 > 86) {
			field375 = 0;
			field198.method233(140);
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method118(int arg0) {
		if (!field214) {
			if (CUVGZBEX.field617[17] >= arg0) {
				VUMXQDFQ var2 = CUVGZBEX.field611[17];
				int var3 = var2.field1262 * var2.field1261 - 1;
				int var4 = field176 * var2.field1261 * 2;
				byte[] var5 = var2.field1259;
				byte[] var6 = field202;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1259 = var6;
				field202 = var5;
				CUVGZBEX.method179(17);
				field254++;
				if (field254 > 1347) {
					field254 = 0;
					field198.method233(132);
					field198.method234(0);
					int var8 = field198.field709;
					field198.method235((int) (Math.random() * 65536.0D));
					field198.method235((int) (Math.random() * 65536.0D));
					field198.method234(222);
					field198.method234(172);

					if ((int) (Math.random() * 2.0D) == 0) {
						field198.method234(232);
					}

					field198.method235(38986);
					field198.method235(3803);

					if ((int) (Math.random() * 2.0D) == 0) {
						field198.method235(25132);
					}

					field198.method234(125);
					field198.method234((int) (Math.random() * 256.0D));
					field198.method243(field198.field709 - var8);
				}
			}

			if (CUVGZBEX.field617[24] >= arg0) {
				VUMXQDFQ var9 = CUVGZBEX.field611[24];
				int var10 = var9.field1262 * var9.field1261 - 1;
				int var11 = field176 * var9.field1261 * 2;
				byte[] var12 = var9.field1259;
				byte[] var13 = field202;
				for (int var14 = 0; var14 <= var10; var14++) {
					var13[var14] = var12[var14 - var11 & var10];
				}

				var9.field1259 = var13;
				field202 = var12;
				CUVGZBEX.method179(24);
				field533++;
				if (field533 > 1503) {
					field533 = 0;
					field198.method233(126);
					field198.method234(0);
					int var15 = field198.field709;
					field198.method235((int) (Math.random() * 65536.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field198.method235(45879);
					}

					field198.method235(49559);
					field198.method235(4938);
					field198.method235(15448);
					field198.method234(202);

					if ((int) (Math.random() * 2.0D) == 0) {
						field198.method235(8014);
					}

					field198.method234(173);
					field198.method234((int) (Math.random() * 256.0D));
					field198.method235((int) (Math.random() * 65536.0D));
					field198.method243(field198.field709 - var15);
				}
			}

			if (CUVGZBEX.field617[34] >= arg0) {
				VUMXQDFQ var16 = CUVGZBEX.field611[34];
				int var17 = var16.field1262 * var16.field1261 - 1;
				int var18 = field176 * var16.field1261 * 2;
				byte[] var19 = var16.field1259;
				byte[] var20 = field202;
				for (int var21 = 0; var21 <= var17; var21++) {
					var20[var21] = var19[var21 - var18 & var17];
				}

				var16.field1259 = var20;
				field202 = var19;
				CUVGZBEX.method179(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(IIII)I")
	public final int method119(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field377[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field262[var6][var4][var5] + field262[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field262[var6][var4][var5 + 1] + field262[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method120(String arg0) throws IOException {
		if (field173) {
			if (field411 != null) {
				try {
					field411.close();
				} catch (Exception var4) {
				}

				field411 = null;
			}

			field411 = method128(43595);
			field411.setSoTimeout(10000);
			InputStream var2 = field411.getInputStream();
			OutputStream var3 = field411.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a()V")
	public final void method19() {
		method26(20, "Starting up");

		if (signlink.sunjava) {
			field54 = 5;
		}

		if (field304) {
			field488 = true;
		} else {
			field304 = true;
			boolean var1 = false;
			String var2 = method70();
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
						field541[var3] = new VSBCWAVP(var3 + 1, 500000, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method95();
					field414 = method157("title", "title screen", 1, field449[1], 25);
					field405 = new DBRMEPJQ("p11_full", false, field414);
					field406 = new DBRMEPJQ("p12_full", false, field414);
					field407 = new DBRMEPJQ("b12_full", false, field414);
					field408 = new DBRMEPJQ("q8_full", true, field414);
					method44();
					method67();
					XRWUKRPO var4 = method157("config", "config", 2, field449[2], 30);
					XRWUKRPO var5 = method157("interface", "interface", 3, field449[3], 35);
					XRWUKRPO var6 = method157("media", "2d graphics", 4, field449[4], 40);
					XRWUKRPO var7 = method157("textures", "textures", 6, field449[6], 45);
					XRWUKRPO var8 = method157("wordenc", "chat system", 7, field449[7], 50);
					XRWUKRPO var9 = method157("sounds", "sound effects", 8, field449[8], 55);
					field377 = new byte[4][104][104];
					field262 = new int[4][105][105];
					field191 = new QLFNWQSF(104, field262, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field415[var10] = new EMCOJCFH(104, 104);
					}

					field494 = new INVDQNJU(512, 512);
					XRWUKRPO var11 = method157("versionlist", "update list", 5, field449[5], 60);
					method26(60, "Connecting to update server");
					field182 = new LNOSHUMO();
					field182.method367(var11, this);
					TTZHVWEG.method485(field182.method377());
					VHYCWIPJ.method497(field182.method374(0), field182);

					if (!field214) {
						field297 = 0;
						try {
							field297 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field298 = true;
						field182.method365(2, field297);

						while (field182.method366() > 0) {
							method50();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field182.field839 > 3) {
								method123("ondemand");
								return;
							}
						}
					}

					method26(65, "Requesting animations");
					int var12 = field182.method374(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field182.method365(1, var13);
					}

					while (field182.method366() > 0) {
						int var14 = var12 - field182.method366();
						if (var14 > 0) {
							method26(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method50();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field182.field839 > 3) {
							method123("ondemand");
							return;
						}
					}

					method26(70, "Requesting models");
					int var15 = field182.method374(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field182.method358(var16);
						if ((var17 & 0x1) != 0) {
							field182.method365(0, var16);
						}
					}

					int var18 = field182.method366();
					while (field182.method366() > 0) {
						int var19 = var18 - field182.method366();
						if (var19 > 0) {
							method26(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method50();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field541[0] != null) {
						method26(75, "Requesting maps");
						field182.method365(3, field182.method376(48, 0, 47));
						field182.method365(3, field182.method376(48, 1, 47));
						field182.method365(3, field182.method376(48, 0, 48));
						field182.method365(3, field182.method376(48, 1, 48));
						field182.method365(3, field182.method376(48, 0, 49));
						field182.method365(3, field182.method376(48, 1, 49));
						field182.method365(3, field182.method376(47, 0, 47));
						field182.method365(3, field182.method376(47, 1, 47));
						field182.method365(3, field182.method376(47, 0, 48));
						field182.method365(3, field182.method376(47, 1, 48));
						field182.method365(3, field182.method376(148, 0, 48));
						field182.method365(3, field182.method376(148, 1, 48));
						int var20 = field182.method366();
						while (field182.method366() > 0) {
							int var21 = var20 - field182.method366();
							if (var21 > 0) {
								method26(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method50();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field182.method374(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field182.method358(var23);
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
							field182.method373(0, var25, var23);
						}
					}

					field182.method357(field213);

					if (!field214) {
						int var26 = field182.method374(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field182.method362(var27)) {
								field182.method373(2, (byte) 1, var27);
							}
						}
					}

					method26(80, "Unpacking media");
					field228 = new VUMXQDFQ(var6, "invback", 0);
					field230 = new VUMXQDFQ(var6, "chatback", 0);
					field229 = new VUMXQDFQ(var6, "mapback", 0);
					field351 = new VUMXQDFQ(var6, "backbase1", 0);
					field352 = new VUMXQDFQ(var6, "backbase2", 0);
					field353 = new VUMXQDFQ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field238[var28] = new VUMXQDFQ(var6, "sideicons", var28);
					}

					field233 = new INVDQNJU(var6, "compass", 0);
					field566 = new INVDQNJU(var6, "mapedge", 0);
					field566.method328();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field409[var29] = new VUMXQDFQ(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field327[var30] = new INVDQNJU(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field491[var31] = new INVDQNJU(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field350[var32] = new INVDQNJU(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field268 = new INVDQNJU(var6, "mapmarker", 0);
					field269 = new INVDQNJU(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field572[var33] = new INVDQNJU(var6, "cross", var33);
					}

					field242 = new INVDQNJU(var6, "mapdots", 0);
					field243 = new INVDQNJU(var6, "mapdots", 1);
					field244 = new INVDQNJU(var6, "mapdots", 2);
					field245 = new INVDQNJU(var6, "mapdots", 3);
					field246 = new INVDQNJU(var6, "mapdots", 4);
					field287 = new VUMXQDFQ(var6, "scrollbar", 0);
					field288 = new VUMXQDFQ(var6, "scrollbar", 1);
					field510 = new VUMXQDFQ(var6, "redstone1", 0);
					field511 = new VUMXQDFQ(var6, "redstone2", 0);
					field512 = new VUMXQDFQ(var6, "redstone3", 0);
					field513 = new VUMXQDFQ(var6, "redstone1", 0);
					field513.method539();
					field514 = new VUMXQDFQ(var6, "redstone2", 0);
					field514.method539();
					field475 = new VUMXQDFQ(var6, "redstone1", 0);
					field475.method540();
					field476 = new VUMXQDFQ(var6, "redstone2", 0);
					field476.method540();
					field477 = new VUMXQDFQ(var6, "redstone3", 0);
					field477.method540();
					field478 = new VUMXQDFQ(var6, "redstone1", 0);
					field478.method539();
					field478.method540();
					field479 = new VUMXQDFQ(var6, "redstone2", 0);
					field479.method539();
					field479.method540();

					for (int var34 = 0; var34 < 2; var34++) {
						field418[var34] = new VUMXQDFQ(var6, "mod_icons", var34);
					}

					INVDQNJU var35 = new INVDQNJU(var6, "backleft1", 0);
					field419 = new NUXCAHZM(var35.field760, var35.field759, method24());
					var35.method329(0, 0);
					INVDQNJU var36 = new INVDQNJU(var6, "backleft2", 0);
					field420 = new NUXCAHZM(var36.field760, var36.field759, method24());
					var36.method329(0, 0);
					INVDQNJU var37 = new INVDQNJU(var6, "backright1", 0);
					field421 = new NUXCAHZM(var37.field760, var37.field759, method24());
					var37.method329(0, 0);
					INVDQNJU var38 = new INVDQNJU(var6, "backright2", 0);
					field422 = new NUXCAHZM(var38.field760, var38.field759, method24());
					var38.method329(0, 0);
					INVDQNJU var39 = new INVDQNJU(var6, "backtop1", 0);
					field423 = new NUXCAHZM(var39.field760, var39.field759, method24());
					var39.method329(0, 0);
					INVDQNJU var40 = new INVDQNJU(var6, "backvmid1", 0);
					field424 = new NUXCAHZM(var40.field760, var40.field759, method24());
					var40.method329(0, 0);
					INVDQNJU var41 = new INVDQNJU(var6, "backvmid2", 0);
					field425 = new NUXCAHZM(var41.field760, var41.field759, method24());
					var41.method329(0, 0);
					INVDQNJU var42 = new INVDQNJU(var6, "backvmid3", 0);
					field426 = new NUXCAHZM(var42.field760, var42.field759, method24());
					var42.method329(0, 0);
					INVDQNJU var43 = new INVDQNJU(var6, "backhmid2", 0);
					field427 = new NUXCAHZM(var43.field760, var43.field759, method24());
					var43.method329(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field327[var48] != null) {
							field327[var48].method327(var46 + var47, var45 + var47, var44 + var47);
						}

						if (field409[var48] != null) {
							field409[var48].method541(var46 + var47, var45 + var47, var44 + var47);
						}
					}

					method26(83, "Unpacking textures");
					CUVGZBEX.method177(var7);
					CUVGZBEX.method181(0.8D);
					CUVGZBEX.method176(20);
					method26(86, "Unpacking config");
					WLHKAARP.method548(var4);
					RFUKTMBK.method466(var4);
					NPCMYHWE.method389(var4);
					AVSLDGMK.method12(var4);
					LPTCUHOU.method381(var4);
					GCYXYCPV.method221(var4);
					XHDTVZNY.method577(var4);
					BIGJGRMT.method27(var4);
					ZIUDVZAI.method589(var4);
					AVSLDGMK.field13 = field213;

					if (!field214) {
						method26(90, "Unpacking sounds");
						byte[] var49 = var9.method581("sounds.dat", null);
						GLMIQHJI var50 = new GLMIQHJI(var49);
						CMHYVIXN.method166(var50);
					}

					method26(95, "Unpacking interfaces");
					DBRMEPJQ[] var51 = new DBRMEPJQ[] { field405, field406, field407, field408 };
					USEDZXXV.method492(var6, var51, var5);
					method26(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field229.field1259[field229.field1261 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field369[var52] = var53;
						field339[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field229.field1259[field229.field1261 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field204[var56 - 5] = var57 - 25;
						field335[var56 - 5] = var58 - var57;
					}

					CUVGZBEX.method174(479, 96);
					field521 = CUVGZBEX.field609;
					CUVGZBEX.method174(190, 261);
					field522 = CUVGZBEX.field609;
					CUVGZBEX.method174(512, 334);
					field523 = CUVGZBEX.field609;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = CUVGZBEX.field607[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					QLFNWQSF.method447(var60, 800, 500, 334, 512);
					HUPJRXOW.method288(var8);
					field437 = new WTODRXXL(this);
					method25(field437, 10);
					XWNQXFLX.field1430 = this;
					RFUKTMBK.field1072 = this;
					LPTCUHOU.field880 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field338 + " " + field399);
					field309 = true;
				}
			} else {
				field496 = true;
			}
		}
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

	@ObfuscatedName("client.a(LINVDQNJU;IBI)V")
	public final void method121(INVDQNJU arg0, int arg1, int arg2) {
		int var4 = field473 + field279 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = VHYCWIPJ.field1241[var4];
			int var7 = VHYCWIPJ.field1242[var4];
			var6 = var6 * 256 / (field317 + 256);
			var7 = var7 * 256 / (field317 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method337(field229, var8 + 94 + 4 - arg0.field763 / 2, 83 - var9 - arg0.field764 / 2 - 4);
			} else {
				arg0.method331(var8 + 94 + 4 - arg0.field763 / 2, 83 - var9 - arg0.field764 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIZLUSEDZXXV;II)V")
	public final void method122(int arg0, int arg1, int arg2, USEDZXXV arg3, int arg4, int arg5) {
		if (arg3.field1134 == 0 && arg3.field1132 != null && !arg3.field1120 && (arg4 >= arg0 && arg5 >= arg2 && arg4 <= arg3.field1158 + arg0 && arg5 <= arg3.field1152 + arg2)) {
			int var7 = arg3.field1132.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field1168[var8] + arg0;
				int var10 = arg3.field1146[var8] + arg2 - arg1;
				USEDZXXV var11 = USEDZXXV.field1113[arg3.field1132[var8]];
				var9 += var11.field1117;
				var10 += var11.field1142;
				if ((var11.field1139 >= 0 || var11.field1171 != 0) && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
					if (var11.field1139 >= 0) {
						field175 = var11.field1139;
					} else {
						field175 = var11.field1164;
					}
				}

				if (var11.field1134 == 0) {
					method122(var9, var11.field1161, var10, var11, arg4, arg5);

					if (var11.field1124 > var11.field1152) {
						method49(var11.field1158 + var9, var10, arg4, var11, var11.field1124, var11.field1152, true, arg5);
					}
				} else {
					if (var11.field1147 == 1 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						boolean var12 = false;
						if (var11.field1157 != 0) {
							var12 = method66(var11);
						}

						if (!var12) {
							field585[field503] = var11.field1154;
							field435[field503] = 612;
							field434[field503] = var11.field1164;
							field503++;
						}
					}

					if (var11.field1147 == 2 && field192 == 0 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						String var13 = var11.field1109;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field585[field503] = var13 + " @gre@" + var11.field1123;
						field435[field503] = 482;
						field434[field503] = var11.field1164;
						field503++;
					}

					if (var11.field1147 == 3 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						field585[field503] = "Close";
						field435[field503] = 236;
						field434[field503] = var11.field1164;
						field503++;
					}

					if (var11.field1147 == 4 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						field585[field503] = var11.field1154;
						field435[field503] = 51;
						field434[field503] = var11.field1164;
						field503++;
					}

					if (var11.field1147 == 5 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						field585[field503] = var11.field1154;
						field435[field503] = 137;
						field434[field503] = var11.field1164;
						field503++;
					}

					if (var11.field1147 == 6 && !field557 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field1158 + var9 && arg5 < var11.field1152 + var10) {
						field585[field503] = var11.field1154;
						field435[field503] = 806;
						field434[field503] = var11.field1164;
						field503++;
					}

					if (var11.field1134 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1152; var15++) {
							for (int var16 = 0; var16 < var11.field1158; var16++) {
								int var17 = (var11.field1121 + 32) * var16 + var9;
								int var18 = (var11.field1115 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1166[var14];
									var18 += var11.field1108[var14];
								}

								if (arg4 >= var17 && arg5 >= var18 && arg4 < var17 + 32 && arg5 < var18 + 32) {
									field537 = var14;
									field538 = var11.field1164;

									if (var11.field1155[var14] > 0) {
										AVSLDGMK var19 = AVSLDGMK.method4(var11.field1155[var14] - 1);
										if (field384 == 1 && var11.field1114) {
											if (field386 != var11.field1164 || field385 != var14) {
												field585[field503] = "Use " + field388 + " with @lre@" + var19.field33;
												field435[field503] = 485;
												field436[field503] = var19.field30;
												field433[field503] = var14;
												field434[field503] = var11.field1164;
												field503++;
											}
										} else if (field192 != 1 || !var11.field1114) {
											if (var11.field1114) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field29 != null && var19.field29[var20] != null) {
														field585[field503] = var19.field29[var20] + " @lre@" + var19.field33;

														if (var20 == 3) {
															field435[field503] = 532;
														}

														if (var20 == 4) {
															field435[field503] = 8;
														}

														field436[field503] = var19.field30;
														field433[field503] = var14;
														field434[field503] = var11.field1164;
														field503++;
													} else if (var20 == 4) {
														field585[field503] = "Drop @lre@" + var19.field33;
														field435[field503] = 8;
														field436[field503] = var19.field30;
														field433[field503] = var14;
														field434[field503] = var11.field1164;
														field503++;
													}
												}
											}

											if (var11.field1163) {
												field585[field503] = "Use @lre@" + var19.field33;
												field435[field503] = 959;
												field436[field503] = var19.field30;
												field433[field503] = var14;
												field434[field503] = var11.field1164;
												field503++;
											}

											if (var11.field1114 && var19.field29 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field29[var21] != null) {
														field585[field503] = var19.field29[var21] + " @lre@" + var19.field33;

														if (var21 == 0) {
															field435[field503] = 375;
														}

														if (var21 == 1) {
															field435[field503] = 10;
														}

														if (var21 == 2) {
															field435[field503] = 132;
														}

														field436[field503] = var19.field30;
														field433[field503] = var14;
														field434[field503] = var11.field1164;
														field503++;
													}
												}
											}

											if (var11.field1141 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1141[var22] != null) {
														field585[field503] = var11.field1141[var22] + " @lre@" + var19.field33;

														if (var22 == 0) {
															field435[field503] = 355;
														}

														if (var22 == 1) {
															field435[field503] = 416;
														}

														if (var22 == 2) {
															field435[field503] = 630;
														}

														if (var22 == 3) {
															field435[field503] = 708;
														}

														if (var22 == 4) {
															field435[field503] = 903;
														}

														field436[field503] = var19.field30;
														field433[field503] = var14;
														field434[field503] = var11.field1164;
														field503++;
													}
												}
											}

											field585[field503] = "Examine @lre@" + var19.field33;
											field435[field503] = 1463;
											field436[field503] = var19.field30;
											field433[field503] = var14;
											field434[field503] = var11.field1164;
											field503++;
										} else if ((field194 & 0x10) == 0x10) {
											field585[field503] = field195 + " @lre@" + var19.field33;
											field435[field503] = 294;
											field436[field503] = var19.field30;
											field433[field503] = var14;
											field434[field503] = var11.field1164;
											field503++;
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

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method123(String arg0) {
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

	@ObfuscatedName("client.C(I)V")
	public final void method124() {
		field266 = false;
		while (field299) {
			field266 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field573 = null;
		field574 = null;
		field438 = null;
		field587 = null;
		field588 = null;
		field589 = null;
		field590 = null;
		field275 = null;
		field276 = null;
		field234 = null;
		field235 = null;
		field389 = null;
		field390 = null;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method125() {
		for (int var1 = -1; var1 < field362; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field360;
			} else {
				var2 = field363[var1];
			}

			PASMQFXV var3 = field361[var2];
			if (var3 != null && var3.field1270 > 0) {
				var3.field1270--;
				if (var3.field1270 == 0) {
					var3.field1289 = null;
				}
			}
		}

		field277++;
		if (field277 > 66) {
			field277 = 0;
			field198.method233(122);
		}

		for (int var4 = 0; var4 < field403; var4++) {
			int var5 = field404[var4];
			QDXHSLSL var6 = field402[var5];
			if (var6 != null && var6.field1270 > 0) {
				var6.field1270--;
				if (var6.field1270 == 0) {
					var6.field1289 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method126() {
		if (field428 > 1) {
			field428--;
		}

		if (field358 > 0) {
			field358--;
		}

		for (int var1 = 0; var1 < 5 && method102(); var1++) {
		}

		if (field416) {
			synchronized (field437.field1366) {
				if (!field372) {
					field437.field1369 = 0;
				} else if (field74 != 0 || field437.field1369 >= 40) {
					field198.method233(125);
					field198.method234(0);
					int var3 = field198.field709;
					int var4 = 0;
					for (int var5 = 0; var5 < field437.field1369 && var3 - field198.field709 < 240; var5++) {
						var4++;
						int var6 = field437.field1367[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field437.field1364[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field437.field1367[var5] == -1 && field437.field1364[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field483 != var7 || field484 != var6) {
							int var9 = var7 - field483;
							field483 = var7;
							int var10 = var6 - field484;
							field484 = var6;

							if (field440 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field198.method235((field440 << 12) + (var9 << 6) + var10);
								field440 = 0;
							} else if (field440 < 8) {
								field198.method237((field440 << 19) + var8 + 0x800000);
								field440 = 0;
							} else {
								field198.method238((field440 << 19) + var8 - 0x40000000);
								field440 = 0;
							}
						} else if (field440 < 2047) {
							field440++;
						}
					}

					field198.method243(field198.field709 - var3);

					if (var4 >= field437.field1369) {
						field437.field1369 = 0;
					} else {
						field437.field1369 -= var4;
						for (int var11 = 0; var11 < field437.field1369; var11++) {
							field437.field1364[var11] = field437.field1364[var4 + var11];
							field437.field1367[var11] = field437.field1367[var4 + var11];
						}
					}
				}
			}

			if (field74 != 0) {
				long var12 = (field77 - field222) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field222 = field77;
				int var14 = field76;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field75;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field74 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field198.method233(91);
				field198.method277((var17 << 19) + (var18 << 20) + var16);
			}

			if (field218 > 0) {
				field218--;
			}

			if (field78[1] == 1 || field78[2] == 1 || field78[3] == 1 || field78[4] == 1) {
				field219 = true;
			}

			if (field219 && field218 <= 0) {
				field218 = 20;
				field219 = false;
				field198.method233(215);
				field198.method271(field279);
				field198.method235(field278);
			}

			if (field65 && !field252) {
				field252 = true;
				field198.method233(201);
				field198.method234(1);
			}

			if (!field65 && field252) {
				field252 = false;
				field198.method233(201);
				field198.method234(0);
			}

			method61();
			method99();
			method74();
			field563++;
			if (field563 > 97) {
				field563 = 0;
				field198.method233(161);
			}

			field356++;
			if (field356 > 750) {
				method52();
			}

			method112();
			method141();
			method125();
			field176++;

			if (field259 != 0) {
				field258 += 20;
				if (field258 >= 400) {
					field259 = 0;
				}
			}

			if (field303 != 0) {
				field300++;
				if (field300 >= 15) {
					if (field303 == 2) {
						field410 = true;
					}

					if (field303 == 3) {
						field553 = true;
					}

					field303 = 0;
				}
			}

			if (field549 != 0) {
				field241++;

				if (field68 > field550 + 5 || field68 < field550 - 5 || field69 > field551 + 5 || field69 < field551 - 5) {
					field539 = true;
				}

				if (field67 == 0) {
					if (field549 == 2) {
						field410 = true;
					}

					if (field549 == 3) {
						field553 = true;
					}

					field549 = 0;

					if (field539 && field241 >= 5) {
						field538 = -1;
						method37();

						if (field547 == field538 && field548 != field537) {
							USEDZXXV var19 = USEDZXXV.field1113[field547];
							byte var20 = 0;
							if (field570 == 1 && var19.field1157 == 206) {
								var20 = 1;
							}

							if (var19.field1155[field537] <= 0) {
								var20 = 0;
							}

							if (var19.field1129) {
								int var21 = field548;
								int var22 = field537;
								var19.field1155[var22] = var19.field1155[var21];
								var19.field1169[var22] = var19.field1169[var21];
								var19.field1155[var21] = -1;
								var19.field1169[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field548;
								int var24 = field537;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method490(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method490(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method490(field548, field537);
							}

							field198.method233(21);
							field198.method260(var20);
							field198.method269(field547);
							field198.method270(field548);
							field198.method235(field537);
						}
					} else if ((field308 == 1 || method139(field503 - 1)) && field503 > 2) {
						method159();
					} else if (field503 > 0) {
						method45(field503 - 1);
					}

					field300 = 10;
					field74 = 0;
				}
			}

			if (QLFNWQSF.field1007 != -1) {
				int var25 = QLFNWQSF.field1007;
				int var26 = QLFNWQSF.field1008;
				boolean var27 = method48(0, 0, 0, 0, true, 0, 0, field535.field1309[0], var25, field535.field1308[0], var26);
				QLFNWQSF.field1007 = -1;

				if (var27) {
					field256 = field75;
					field257 = field76;
					field259 = 1;
					field258 = 0;
				}
			}

			if (field74 == 1 && field205 != null) {
				field205 = null;
				field553 = true;
				field74 = 0;
			}

			method100();
			method96();
			method156();
			method150();

			if (field67 == 1 || field74 == 1) {
				field347++;
			}

			if (field253 == 2) {
				method84();
			}

			if (field253 == 2 && field333) {
				method32();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field167[var28]++;
			}

			method39();
			field66++;
			if (field66 > 4500) {
				field358 = 250;
				field66 -= 500;
				field198.method233(203);
			}

			field289++;
			if (field289 > 500) {
				field289 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field508 += field509;
				}

				if ((var29 & 0x2) == 2) {
					field187 += field188;
				}

				if ((var29 & 0x4) == 4) {
					field431 += field432;
				}
			}

			if (field508 < -50) {
				field509 = 2;
			}

			if (field508 > 50) {
				field509 = -2;
			}

			if (field187 < -55) {
				field188 = 2;
			}

			if (field187 > 55) {
				field188 = -2;
			}

			if (field431 < -40) {
				field432 = 1;
			}

			if (field431 > 40) {
				field432 = -1;
			}

			field226++;
			if (field226 > 500) {
				field226 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field473 += field474;
				}

				if ((var30 & 0x2) == 2) {
					field317 += field318;
				}
			}

			if (field473 < -60) {
				field474 = 2;
			}

			if (field473 > 60) {
				field474 = -2;
			}

			if (field317 < -20) {
				field318 = 1;
			}

			if (field317 > 10) {
				field318 = -1;
			}

			field357++;
			if (field357 > 50) {
				field198.method233(158);
			}

			try {
				if (field397 != null && field198.field709 > 0) {
					field397.method355(field198.field708, field198.field709, 0);
					field198.field709 = 0;
					field357 = 0;
				}
			} catch (IOException var32) {
				method52();
			} catch (Exception var33) {
				method78();
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method127() {
		for (DSELJCMH var1 = (DSELJCMH) field200.method528(); var1 != null; var1 = (DSELJCMH) field200.method530()) {
			if (var1.field652 == -1) {
				var1.field663 = 0;
				method114(var1);
			} else {
				var1.method555();
			}
		}
	}

	@ObfuscatedName("client.D(I)Ljava/net/Socket;")
	public final Socket method128(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method129() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field234[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field234[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field235[var10] = (field234[var10 - 1] + field234[var10 + 1] + field234[var10 - 128] + field234[var10 + 128]) / 4;
			}
		}

		field199 += 128;
		if (field199 > field275.length) {
			field199 -= field275.length;
			int var11 = (int) (Math.random() * 12.0D);
			method115(field438[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field235[var14 + 128] - field275[field199 + var14 & field275.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field234[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field400[var16] = field400[var16 + 1];
		}

		field400[var1 - 1] = (int) (Math.sin(field307 / 14.0D) * 16.0D + Math.sin(field307 / 15.0D) * 14.0D + Math.sin(field307 / 16.0D) * 12.0D);

		if (field441 > 0) {
			field441 -= 4;
		}

		if (field442 > 0) {
			field442 -= 4;
		}

		if (field441 == 0 && field442 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field441 = 1024;
			}

			if (var17 == 1) {
				field442 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method130(int arg0) {
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
			if (field63 != null) {
				return new URL("http://127.0.0.1:" + (field212 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method131(int arg0, int arg1) {
		VLLJSJTJ var3 = field505[field530][arg0][arg1];
		if (var3 == null) {
			field191.method432(field530, arg0, arg1);
		} else {
			int var4 = -99999999;
			NOAOCJCI var5 = null;
			for (NOAOCJCI var6 = (NOAOCJCI) var3.method528(); var6 != null; var6 = (NOAOCJCI) var3.method530()) {
				AVSLDGMK var7 = AVSLDGMK.method4(var6.field915);
				int var8 = var7.field51;
				if (var7.field28) {
					var8 = (var6.field914 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method526(var5);
			NOAOCJCI var9 = null;
			NOAOCJCI var10 = null;
			for (NOAOCJCI var11 = (NOAOCJCI) var3.method528(); var11 != null; var11 = (NOAOCJCI) var3.method530()) {
				if (var5.field915 != var11.field915 && var9 == null) {
					var9 = var11;
				}

				if (var5.field915 != var11.field915 && var9.field915 != var11.field915 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field191.method418(field530, var10, var9, var5, var12, arg0, arg1, method119(arg1 * 128 + 64, field530, arg0 * 128 + 64));
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method132() {
		if (field337 == 2) {
			method73((field328 - field340 << 7) + field331, (field329 - field341 << 7) + field332, field330 * 2);

			if (field392 > -1 && field307 % 20 < 10) {
				field350[2].method331(field392 - 12, field393 - 28);
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method133() {
		RFUKTMBK.field1081.method287();
		RFUKTMBK.field1049.method287();
		LPTCUHOU.field881.method287();
		AVSLDGMK.field22.method287();
		AVSLDGMK.field34.method287();
		PASMQFXV.field960.method287();
		XHDTVZNY.field1410.method287();
	}

	@ObfuscatedName("client.b(B)V")
	public final void method20() {
		if (!field488 && !field309 && !field496) {
			field307++;

			if (field416) {
				method126();
			} else {
				method85();
			}

			method50();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public void method134() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field532);

		if (field182 != null) {
			System.out.println("Od-cycle:" + field182.field850);
		}

		System.out.println("loop-cycle:" + field307);
		System.out.println("draw-cycle:" + field215);
		System.out.println("ptype:" + field355);
		System.out.println("psize:" + field354);

		if (field397 != null) {
			field397.method356();
		}

		field57 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method24() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field63 != null) {
			return field63;
		}

		return this;
	}

	@ObfuscatedName("client.a(IZLGLMIQHJI;)V")
	public final void method135(int arg0, GLMIQHJI arg1) {
		field481 = 0;
		field364 = 0;
		method103(arg1, arg0);
		method43(arg1, arg0);
		method54(arg0, arg1);
		method60(arg0, arg1);

		for (int var3 = 0; var3 < field481; var3++) {
			int var4 = field482[var3];
			if (field307 != field361[var4].field1287) {
				field361[var4] = null;
			}
		}

		if (arg1.field709 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field709 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field362; var5++) {
			if (field361[field363[var5]] == null) {
				signlink.reporterror(field168 + " null entry in pl list - pos:" + var5 + " size:" + field362);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ILGLMIQHJI;Z)V")
	public final void method136(int arg0, GLMIQHJI arg1) {
		while (arg1.field710 + 21 < arg0 * 8) {
			int var3 = arg1.method255(14);
			if (var3 == 16383) {
				break;
			}

			if (field402[var3] == null) {
				field402[var3] = new QDXHSLSL();
			}

			QDXHSLSL var4 = field402[var3];
			field404[field403++] = var3;
			var4.field1287 = field307;
			int var5 = arg1.method255(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			var4.field972 = LPTCUHOU.method380(arg1.method255(12));
			int var6 = arg1.method255(1);
			int var7 = arg1.method255(1);
			if (var7 == 1) {
				field365[field364++] = var3;
			}

			int var8 = arg1.method255(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1318 = var4.field972.field886;
			var4.field1282 = var4.field972.field876;
			var4.field1302 = var4.field972.field862;
			var4.field1303 = var4.field972.field890;
			var4.field1304 = var4.field972.field894;
			var4.field1305 = var4.field972.field871;
			var4.field1271 = var4.field972.field887;
			var4.method546(field535.field1309[0] + var8, var6 == 1, field535.field1308[0] + var5);
		}

		arg1.method256();
	}

	@ObfuscatedName("client.a(ZLUSEDZXXV;)Z")
	public final boolean method137(USEDZXXV arg0) {
		int var2 = arg0.field1157;
		if (field172 == 2) {
			if (var2 == 201) {
				field553 = true;
				field367 = 0;
				field381 = true;
				field348 = "";
				field236 = 1;
				field540 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field553 = true;
				field367 = 0;
				field381 = true;
				field348 = "";
				field236 = 2;
				field540 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field358 = 250;
			return true;
		}

		if (var2 == 501) {
			field553 = true;
			field367 = 0;
			field381 = true;
			field348 = "";
			field236 = 4;
			field540 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field553 = true;
			field367 = 0;
			field381 = true;
			field348 = "";
			field236 = 5;
			field540 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field586[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = GCYXYCPV.field690 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= GCYXYCPV.field690) {
							var5 = 0;
						}
					}

					if (!GCYXYCPV.field691[var5].field697 && GCYXYCPV.field691[var5].field692 == var3 + (field506 ? 0 : 7)) {
						break;
					}
				}

				field586[var3] = var5;
				field472 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field534[var6];
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

			field534[var6] = var8;
			field472 = true;
		}

		if (var2 == 324 && !field506) {
			field506 = true;
			method80();
		}

		if (var2 == 325 && field506) {
			field506 = false;
			method80();
		}

		if (var2 == 326) {
			field198.method233(43);
			field198.method234(field506 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field198.method234(field586[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field198.method234(field534[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field515 = !field515;
		}

		if (var2 >= 601 && var2 <= 612) {
			method140();

			if (field457.length() > 0) {
				field198.method233(23);
				field198.method240(YYRFHIVS.method583(field457));
				field198.method234(var2 - 601);
				field198.method234(field515 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method138() {
		if (field460 == null) {
			field61 = null;
			field324 = null;
			field322 = null;
			field321 = null;
			field323 = null;
			field178 = null;
			field179 = null;
			field180 = null;
			field463 = new NUXCAHZM(265, 128, method24());
			TQHEKXXC.method476();
			field464 = new NUXCAHZM(265, 128, method24());
			TQHEKXXC.method476();
			field460 = new NUXCAHZM(171, 509, method24());
			TQHEKXXC.method476();
			field461 = new NUXCAHZM(132, 360, method24());
			TQHEKXXC.method476();
			field462 = new NUXCAHZM(200, 360, method24());
			TQHEKXXC.method476();
			field465 = new NUXCAHZM(238, 202, method24());
			TQHEKXXC.method476();
			field466 = new NUXCAHZM(238, 203, method24());
			TQHEKXXC.method476();
			field467 = new NUXCAHZM(94, 74, method24());
			TQHEKXXC.method476();
			field468 = new NUXCAHZM(94, 75, method24());
			TQHEKXXC.method476();

			if (field414 != null) {
				method44();
				method67();
			}

			field227 = true;
		}
	}

	@ObfuscatedName("client.d(IB)Z")
	public final boolean method139(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field435[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 730) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method26(int arg0, String arg1) {
		field399 = arg0;
		field338 = arg1;
		method138();

		if (field414 == null) {
			super.method26(arg0, arg1);
		} else {
			field462.method393();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field407.method190(var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			TQHEKXXC.method479(0x8C1111, 34, 304, var6, var3 / 2 - 152);
			TQHEKXXC.method479(0, 32, 302, var6 + 1, var3 / 2 - 151);
			TQHEKXXC.method478(arg0 * 3, var3 / 2 - 150, 0x8C1111, var6 + 2, 30);
			TQHEKXXC.method478(300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150), 0, var6 + 2, 30);
			field407.method190(var4 / 2 + 5 - var5, var3 / 2, arg1, 0xFFFFFF);
			field462.method394(field60, 202, 171);

			if (field227) {
				field227 = false;

				if (!field266) {
					field463.method394(field60, 0, 0);
					field464.method394(field60, 637, 0);
				}

				field460.method394(field60, 128, 0);
				field461.method394(field60, 202, 371);
				field465.method394(field60, 0, 265);
				field466.method394(field60, 562, 265);
				field467.method394(field60, 128, 171);
				field468.method394(field60, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method140() {
		field198.method233(223);

		if (field240 != -1) {
			field240 = -1;
			field410 = true;
			field557 = false;
			field344 = true;
		}

		if (field531 != -1) {
			field531 = -1;
			field553 = true;
			field557 = false;
		}

		field203 = -1;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 308);

			if (arg0.length == 5) {
				field211 = Integer.parseInt(arg0[0]);
				field212 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method89();
				} else if (arg0[2].equals("highmem")) {
					method42();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field213 = false;
				} else if (arg0[3].equals("members")) {
					field213 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method14(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method141() {
		for (int var1 = 0; var1 < field403; var1++) {
			int var2 = field404[var1];
			QDXHSLSL var3 = field402[var2];
			if (var3 != null) {
				method142(var3, var3.field972.field886);
			}
		}
	}

	@ObfuscatedName("client.a(LWAJZGBEE;II)V")
	public final void method142(WAJZGBEE arg0, int arg1) {
		if (arg0.field1292 < 128 || arg0.field1293 < 128 || arg0.field1292 >= 13184 || arg0.field1293 >= 13184) {
			arg0.field1310 = -1;
			arg0.field1277 = -1;
			arg0.field1299 = 0;
			arg0.field1300 = 0;
			arg0.field1292 = arg0.field1308[0] * 128 + arg0.field1318 * 64;
			arg0.field1293 = arg0.field1309[0] * 128 + arg0.field1318 * 64;
			arg0.method545();
		}

		if (field535 == arg0 && (arg0.field1292 < 1536 || arg0.field1293 < 1536 || arg0.field1292 >= 11776 || arg0.field1293 >= 11776)) {
			arg0.field1310 = -1;
			arg0.field1277 = -1;
			arg0.field1299 = 0;
			arg0.field1300 = 0;
			arg0.field1292 = arg0.field1308[0] * 128 + arg0.field1318 * 64;
			arg0.field1293 = arg0.field1309[0] * 128 + arg0.field1318 * 64;
			arg0.method545();
		}

		if (arg0.field1299 > field307) {
			method143(arg0);
		} else if (arg0.field1300 >= field307) {
			method144(arg0);
		} else {
			method145(arg0);
		}

		method146(arg0);
		method147(arg0);
	}

	@ObfuscatedName("client.a(BLWAJZGBEE;)V")
	public final void method143(WAJZGBEE arg0) {
		int var2 = arg0.field1299 - field307;
		int var3 = arg0.field1318 * 64 + arg0.field1295 * 128;
		int var4 = arg0.field1318 * 64 + arg0.field1297 * 128;
		arg0.field1292 += (var3 - arg0.field1292) / var2;
		arg0.field1293 += (var4 - arg0.field1293) / var2;
		arg0.field1307 = 0;

		if (arg0.field1301 == 0) {
			arg0.field1288 = 1024;
		}

		if (arg0.field1301 == 1) {
			arg0.field1288 = 1536;
		}

		if (arg0.field1301 == 2) {
			arg0.field1288 = 0;
		}

		if (arg0.field1301 == 3) {
			arg0.field1288 = 512;
		}
	}

	@ObfuscatedName("client.a(LWAJZGBEE;I)V")
	public final void method144(WAJZGBEE arg0) {
		if (field307 == arg0.field1300 || arg0.field1310 == -1 || arg0.field1313 != 0 || arg0.field1312 + 1 > WLHKAARP.field1323[arg0.field1310].method549(arg0.field1311)) {
			int var2 = arg0.field1300 - arg0.field1299;
			int var3 = field307 - arg0.field1299;
			int var4 = arg0.field1318 * 64 + arg0.field1295 * 128;
			int var5 = arg0.field1318 * 64 + arg0.field1297 * 128;
			int var6 = arg0.field1318 * 64 + arg0.field1296 * 128;
			int var7 = arg0.field1318 * 64 + arg0.field1298 * 128;
			arg0.field1292 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1293 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1307 = 0;

		if (arg0.field1301 == 0) {
			arg0.field1288 = 1024;
		}

		if (arg0.field1301 == 1) {
			arg0.field1288 = 1536;
		}

		if (arg0.field1301 == 2) {
			arg0.field1288 = 0;
		}

		if (arg0.field1301 == 3) {
			arg0.field1288 = 512;
		}

		arg0.field1294 = arg0.field1288;
	}

	@ObfuscatedName("client.b(LWAJZGBEE;I)V")
	public final void method145(WAJZGBEE arg0) {
		arg0.field1319 = arg0.field1271;
		if (arg0.field1276 == 0) {
			arg0.field1307 = 0;
		} else {
			if (arg0.field1310 != -1 && arg0.field1313 == 0) {
				WLHKAARP var2 = WLHKAARP.field1323[arg0.field1310];
				if (arg0.field1291 > 0 && var2.field1335 == 0) {
					arg0.field1307++;
					return;
				}

				if (arg0.field1291 <= 0 && var2.field1336 == 0) {
					arg0.field1307++;
					return;
				}
			}

			int var3 = arg0.field1292;
			int var4 = arg0.field1293;
			int var5 = arg0.field1308[arg0.field1276 - 1] * 128 + arg0.field1318 * 64;
			int var6 = arg0.field1309[arg0.field1276 - 1] * 128 + arg0.field1318 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1288 = 1280;
					} else if (var4 > var6) {
						arg0.field1288 = 1792;
					} else {
						arg0.field1288 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1288 = 768;
					} else if (var4 > var6) {
						arg0.field1288 = 256;
					} else {
						arg0.field1288 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1288 = 1024;
				} else {
					arg0.field1288 = 0;
				}

				int var7 = arg0.field1288 - arg0.field1294 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1303;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1302;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1305;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1304;
				}

				if (var8 == -1) {
					var8 = arg0.field1302;
				}

				arg0.field1319 = var8;
				int var9 = 4;
				if (arg0.field1294 != arg0.field1288 && arg0.field1273 == -1 && arg0.field1282 != 0) {
					var9 = 2;
				}

				if (arg0.field1276 > 2) {
					var9 = 6;
				}

				if (arg0.field1276 > 3) {
					var9 = 8;
				}

				if (arg0.field1307 > 0 && arg0.field1276 > 1) {
					var9 = 8;
					arg0.field1307--;
				}

				if (arg0.field1275[arg0.field1276 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1319 == arg0.field1302 && arg0.field1306 != -1) {
					arg0.field1319 = arg0.field1306;
				}

				if (var3 < var5) {
					arg0.field1292 += var9;
					if (arg0.field1292 > var5) {
						arg0.field1292 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1292 -= var9;
					if (arg0.field1292 < var5) {
						arg0.field1292 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1293 += var9;
					if (arg0.field1293 > var6) {
						arg0.field1293 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1293 -= var9;
					if (arg0.field1293 < var6) {
						arg0.field1293 = var6;
					}
				}

				if (arg0.field1292 == var5 && arg0.field1293 == var6) {
					arg0.field1276--;

					if (arg0.field1291 > 0) {
						arg0.field1291--;
						return;
					}
				}
			} else {
				arg0.field1292 = var5;
				arg0.field1293 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(LWAJZGBEE;I)V")
	public final void method146(WAJZGBEE arg0) {
		if (arg0.field1282 != 0) {
			if (arg0.field1273 != -1 && arg0.field1273 < 32768) {
				QDXHSLSL var2 = field402[arg0.field1273];
				if (var2 != null) {
					int var3 = arg0.field1292 - var2.field1292;
					int var4 = arg0.field1293 - var2.field1293;
					if (var3 != 0 || var4 != 0) {
						arg0.field1288 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1273 >= 32768) {
				int var5 = arg0.field1273 - 32768;
				if (field394 == var5) {
					var5 = field360;
				}

				PASMQFXV var6 = field361[var5];
				if (var6 != null) {
					int var7 = arg0.field1292 - var6.field1292;
					int var8 = arg0.field1293 - var6.field1293;
					if (var7 != 0 || var8 != 0) {
						arg0.field1288 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1267 != 0 || arg0.field1268 != 0) && (arg0.field1276 == 0 || arg0.field1307 > 0)) {
				int var9 = arg0.field1292 - (arg0.field1267 - field340 - field340) * 64;
				int var10 = arg0.field1293 - (arg0.field1268 - field341 - field341) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1288 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1267 = 0;
				arg0.field1268 = 0;
			}

			int var11 = arg0.field1288 - arg0.field1294 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1282 || var11 > 2048 - arg0.field1282) {
					arg0.field1294 = arg0.field1288;
				} else if (var11 > 1024) {
					arg0.field1294 -= arg0.field1282;
				} else {
					arg0.field1294 += arg0.field1282;
				}

				arg0.field1294 &= 0x7FF;
				if (arg0.field1319 == arg0.field1271 && arg0.field1294 != arg0.field1288) {
					if (arg0.field1272 != -1) {
						arg0.field1319 = arg0.field1272;
						return;
					}

					arg0.field1319 = arg0.field1302;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BLWAJZGBEE;)V")
	public final void method147(WAJZGBEE arg0) {
		arg0.field1286 = false;

		if (arg0.field1319 != -1) {
			WLHKAARP var2 = WLHKAARP.field1323[arg0.field1319];
			arg0.field1321++;
			if (arg0.field1320 < var2.field1324 && arg0.field1321 > var2.method549(arg0.field1320)) {
				arg0.field1321 = 0;
				arg0.field1320++;
			}

			if (arg0.field1320 >= var2.field1324) {
				arg0.field1321 = 0;
				arg0.field1320 = 0;
			}
		}

		if (arg0.field1277 != -1 && field307 >= arg0.field1280) {
			if (arg0.field1278 < 0) {
				arg0.field1278 = 0;
			}

			WLHKAARP var3 = XHDTVZNY.field1398[arg0.field1277].field1402;
			arg0.field1279++;
			while (arg0.field1278 < var3.field1324 && arg0.field1279 > var3.method549(arg0.field1278)) {
				arg0.field1279 -= var3.method549(arg0.field1278);
				arg0.field1278++;
			}

			if (arg0.field1278 >= var3.field1324 && (arg0.field1278 < 0 || arg0.field1278 >= var3.field1324)) {
				arg0.field1277 = -1;
			}
		}

		if (arg0.field1310 != -1 && arg0.field1313 <= 1) {
			WLHKAARP var4 = WLHKAARP.field1323[arg0.field1310];
			if (var4.field1335 == 1 && arg0.field1291 > 0 && arg0.field1299 <= field307 && arg0.field1300 < field307) {
				arg0.field1313 = 1;
				return;
			}
		}

		if (arg0.field1310 != -1 && arg0.field1313 == 0) {
			WLHKAARP var5 = WLHKAARP.field1323[arg0.field1310];
			arg0.field1312++;
			while (arg0.field1311 < var5.field1324 && arg0.field1312 > var5.method549(arg0.field1311)) {
				arg0.field1312 -= var5.method549(arg0.field1311);
				arg0.field1311++;
			}

			if (arg0.field1311 >= var5.field1324) {
				arg0.field1311 -= var5.field1328;
				arg0.field1314++;
				if (arg0.field1314 >= var5.field1334) {
					arg0.field1310 = -1;
				}

				if (arg0.field1311 < 0 || arg0.field1311 >= var5.field1324) {
					arg0.field1310 = -1;
				}
			}

			arg0.field1286 = var5.field1330;
		}

		if (arg0.field1313 > 0) {
			arg0.field1313--;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method148() {
		if (field227) {
			field227 = false;
			field419.method394(field60, 0, 4);
			field420.method394(field60, 0, 357);
			field421.method394(field60, 722, 4);
			field422.method394(field60, 743, 205);
			field423.method394(field60, 0, 0);
			field424.method394(field60, 516, 4);
			field425.method394(field60, 516, 205);
			field426.method394(field60, 496, 357);
			field427.method394(field60, 0, 338);
			field410 = true;
			field553 = true;
			field344 = true;
			field221 = true;

			if (field253 != 2) {
				field323.method394(field60, 4, 4);
				field322.method394(field60, 550, 4);
			}

			field536++;
			if (field536 > 96) {
				field536 = 0;
				field198.method233(137);
			}
		}

		if (field253 == 2) {
			method110();
		}

		if (field398 && field452 == 1) {
			field410 = true;
		}

		if (field240 != -1) {
			boolean var1 = method92(field240, field176);
			if (var1) {
				field410 = true;
			}
		}

		if (field303 == 2) {
			field410 = true;
		}

		if (field549 == 2) {
			field410 = true;
		}

		if (field410) {
			method93();
			field410 = false;
		}

		field251++;
		if (field251 > 102) {
			field251 = 0;
			field198.method233(154);
			field198.method237(0x420308);
		}

		if (field531 == -1) {
			field567.field1161 = field371 - field174 - 77;

			if (field68 > 448 && field68 < 560 && field69 > 332) {
				method49(463, 0, field68 - 17, field567, field371, 77, false, field69 - 357);
			}

			int var2 = field371 - field567.field1161 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field371 - 77) {
				var2 = field371 - 77;
			}

			if (field174 != var2) {
				field174 = var2;
				field553 = true;
			}

			field165++;
			if (field165 > 1675) {
				field165 = 0;
				field198.method233(197);
				field198.method234(0);
				int var3 = field198.field709;
				field198.method234((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field198.method234(161);
				}

				field198.method234((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field198.method235(44879);
				}

				field198.method235((int) (Math.random() * 65536.0D));
				field198.method235(9511);

				if ((int) (Math.random() * 2.0D) == 0) {
					field198.method234(179);
				}

				field198.method234(141);

				if ((int) (Math.random() * 2.0D) == 0) {
					field198.method234(181);
				}

				field198.method235(43761);
				field198.method243(field198.field709 - var3);
			}
		}

		if (field531 != -1) {
			boolean var4 = method92(field531, field176);
			if (var4) {
				field553 = true;
			}
		}

		if (field303 == 3) {
			field553 = true;
		}

		if (field549 == 3) {
			field553 = true;
		}

		if (field205 != null) {
			field553 = true;
		}

		if (field398 && field452 == 2) {
			field553 = true;
		}

		if (field553) {
			method86();
			field553 = false;
		}

		if (field253 == 2) {
			method81();
			field322.method394(field60, 550, 4);
		}

		if (field267 != -1) {
			field344 = true;
		}

		if (field344) {
			if (field267 != -1 && field267 == field223) {
				field267 = -1;
				field198.method233(189);
				field198.method234(field223);
			}

			field344 = false;
			field180.method393();
			field353.method542(0, 0);

			if (field240 == -1) {
				if (field334[field223] != -1) {
					if (field223 == 0) {
						field510.method542(22, 10);
					}

					if (field223 == 1) {
						field511.method542(54, 8);
					}

					if (field223 == 2) {
						field511.method542(82, 8);
					}

					if (field223 == 3) {
						field512.method542(110, 8);
					}

					if (field223 == 4) {
						field514.method542(153, 8);
					}

					if (field223 == 5) {
						field514.method542(181, 8);
					}

					if (field223 == 6) {
						field513.method542(209, 9);
					}
				}

				if (field334[0] != -1 && (field267 != 0 || field307 % 20 < 10)) {
					field238[0].method542(29, 13);
				}

				if (field334[1] != -1 && (field267 != 1 || field307 % 20 < 10)) {
					field238[1].method542(53, 11);
				}

				if (field334[2] != -1 && (field267 != 2 || field307 % 20 < 10)) {
					field238[2].method542(82, 11);
				}

				if (field334[3] != -1 && (field267 != 3 || field307 % 20 < 10)) {
					field238[3].method542(115, 12);
				}

				if (field334[4] != -1 && (field267 != 4 || field307 % 20 < 10)) {
					field238[4].method542(153, 13);
				}

				if (field334[5] != -1 && (field267 != 5 || field307 % 20 < 10)) {
					field238[5].method542(180, 11);
				}

				if (field334[6] != -1 && (field267 != 6 || field307 % 20 < 10)) {
					field238[6].method542(208, 13);
				}
			}

			field180.method394(field60, 516, 160);
			field179.method393();
			field352.method542(0, 0);

			if (field240 == -1) {
				if (field334[field223] != -1) {
					if (field223 == 7) {
						field475.method542(42, 0);
					}

					if (field223 == 8) {
						field476.method542(74, 0);
					}

					if (field223 == 9) {
						field476.method542(102, 0);
					}

					if (field223 == 10) {
						field477.method542(130, 1);
					}

					if (field223 == 11) {
						field479.method542(173, 0);
					}

					if (field223 == 12) {
						field479.method542(201, 0);
					}

					if (field223 == 13) {
						field478.method542(229, 0);
					}
				}

				if (field334[8] != -1 && (field267 != 8 || field307 % 20 < 10)) {
					field238[7].method542(74, 2);
				}

				if (field334[9] != -1 && (field267 != 9 || field307 % 20 < 10)) {
					field238[8].method542(102, 3);
				}

				if (field334[10] != -1 && (field267 != 10 || field307 % 20 < 10)) {
					field238[9].method542(137, 4);
				}

				if (field334[11] != -1 && (field267 != 11 || field307 % 20 < 10)) {
					field238[10].method542(174, 2);
				}

				if (field334[12] != -1 && (field267 != 12 || field307 % 20 < 10)) {
					field238[11].method542(201, 2);
				}

				if (field334[13] != -1 && (field267 != 13 || field307 % 20 < 10)) {
					field238[12].method542(226, 2);
				}
			}

			field179.method394(field60, 496, 466);
			field323.method393();
		}

		if (field221) {
			field221 = false;
			field178.method393();
			field351.method542(0, 0);
			field406.method191(55, 28, 0xFFFFFF, "Public chat", true);

			if (field504 == 0) {
				field406.method191(55, 41, 0xFF00, "On", true);
			}

			if (field504 == 1) {
				field406.method191(55, 41, 0xFFFF00, "Friends", true);
			}

			if (field504 == 2) {
				field406.method191(55, 41, 0xFF0000, "Off", true);
			}

			if (field504 == 3) {
				field406.method191(55, 41, 0xFFFF, "Hide", true);
			}

			field406.method191(184, 28, 0xFFFFFF, "Private chat", true);

			if (field349 == 0) {
				field406.method191(184, 41, 0xFF00, "On", true);
			}

			if (field349 == 1) {
				field406.method191(184, 41, 0xFFFF00, "Friends", true);
			}

			if (field349 == 2) {
				field406.method191(184, 41, 0xFF0000, "Off", true);
			}

			field406.method191(324, 28, 0xFFFFFF, "Trade/compete", true);

			if (field255 == 0) {
				field406.method191(324, 41, 0xFF00, "On", true);
			}

			if (field255 == 1) {
				field406.method191(324, 41, 0xFFFF00, "Friends", true);
			}

			if (field255 == 2) {
				field406.method191(324, 41, 0xFF0000, "Off", true);
			}

			field406.method191(458, 33, 0xFFFFFF, "Report abuse", true);
			field178.method394(field60, 0, 453);
			field323.method393();
		}

		field176 = 0;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method149() {
		field575 = 0;
		for (int var1 = -1; var1 < field403 + field362; var1++) {
			WAJZGBEE var2;
			if (var1 == -1) {
				var2 = field535;
			} else if (var1 < field362) {
				var2 = field361[field363[var1]];
			} else {
				var2 = field402[field404[var1 - field362]];
			}

			if (var2 != null && var2.method404()) {
				if (var2 instanceof QDXHSLSL) {
					LPTCUHOU var3 = ((QDXHSLSL) var2).field972;
					if (var3.field888 != null) {
						var3 = var3.method383();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field362) {
					LPTCUHOU var7 = ((QDXHSLSL) var2).field972;
					if (var7.field870 >= 0 && var7.field870 < field350.length) {
						method72(var2.field1269 + 15, var2);

						if (field392 > -1) {
							field350[var7.field870].method331(field392 - 12, field393 - 30);
						}
					}

					if (field337 == 1 && field404[var1 - field362] == field231 && field307 % 20 < 10) {
						method72(var2.field1269 + 15, var2);

						if (field392 > -1) {
							field350[2].method331(field392 - 12, field393 - 28);
						}
					}
				} else {
					int var4 = 30;
					PASMQFXV var5 = (PASMQFXV) var2;
					if (var5.field946 != 0) {
						method72(var2.field1269 + 15, var2);

						if (field392 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field946 & 1 << var6) != 0) {
									field350[var6].method331(field392 - 12, field393 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field337 == 10 && field363[var1] == field470) {
						method72(var2.field1269 + 15, var2);

						if (field392 > -1) {
							field350[7].method331(field392 - 12, field393 - var4);
						}
					}
				}

				if (var2.field1289 != null && (var1 >= field362 || field504 == 0 || field504 == 3 || field504 == 1 && method56(((PASMQFXV) var2).field936))) {
					method72(var2.field1269, var2);

					if (field392 > -1 && field575 < field576) {
						field580[field575] = field407.method193(var2.field1289) / 2;
						field579[field575] = field407.field645;
						field577[field575] = field392;
						field578[field575] = field393;
						field581[field575] = var2.field1274;
						field582[field575] = var2.field1290;
						field583[field575] = var2.field1270;
						field584[field575++] = var2.field1289;

						if (field306 == 0 && var2.field1290 >= 1 && var2.field1290 <= 3) {
							field579[field575] += 10;
							field578[field575] += 5;
						}

						if (field306 == 0 && var2.field1290 == 4) {
							field580[field575] = 60;
						}

						if (field306 == 0 && var2.field1290 == 5) {
							field579[field575] += 5;
						}
					}
				}

				if (var2.field1315 > field307) {
					method72(var2.field1269 + 15, var2);

					if (field392 > -1) {
						int var8 = var2.field1316 * 30 / var2.field1317;
						if (var8 > 30) {
							var8 = 30;
						}

						TQHEKXXC.method478(var8, field392 - 15, 0xFF00, field393 - 3, 5);
						TQHEKXXC.method478(30 - var8, field392 - 15 + var8, 0xFF0000, field393 - 3, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1285[var9] > field307) {
						method72(var2.field1269 / 2, var2);

						if (field392 > -1) {
							if (var9 == 1) {
								field393 -= 20;
							}

							if (var9 == 2) {
								field392 -= 15;
								field393 -= 10;
							}

							if (var9 == 3) {
								field392 += 15;
								field393 -= 10;
							}

							field491[var2.field1284[var9]].method331(field392 - 12, field393 - 12);
							field405.method190(field393 + 4, field392, String.valueOf(var2.field1283[var9]), 0);
							field405.method190(field393 + 3, field392 - 1, String.valueOf(var2.field1283[var9]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field575; var10++) {
			int var11 = field577[var10];
			int var12 = field578[var10];
			int var13 = field580[var10];
			int var14 = field579[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field578[var16] - field579[var16] && var12 - var14 < field578[var16] + 2 && var11 - var13 < field580[var16] + field577[var16] && var11 + var13 > field577[var16] - field580[var16] && field578[var16] - field579[var16] < var12) {
						var12 = field578[var16] - field579[var16];
						var15 = true;
					}
				}
			}

			field392 = field577[var10];
			field393 = field578[var10] = var12;
			String var17 = field584[var10];
			if (field306 == 0) {
				int var18 = 0xFFFF00;
				if (field581[var10] < 6) {
					var18 = field190[field581[var10]];
				}

				if (field581[var10] == 6) {
					var18 = field346 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field581[var10] == 7) {
					var18 = field346 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field581[var10] == 8) {
					var18 = field346 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field581[var10] == 9) {
					int var19 = 150 - field583[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field581[var10] == 10) {
					int var20 = 150 - field583[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field581[var10] == 11) {
					int var21 = 150 - field583[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field582[var10] == 0) {
					field407.method190(field393 + 1, field392, var17, 0);
					field407.method190(field393, field392, var17, var18);
				}

				if (field582[var10] == 1) {
					field407.method195(field392, var17, field393 + 1, 0, field346);
					field407.method195(field392, var17, field393, var18, field346);
				}

				if (field582[var10] == 2) {
					field407.method196(var17, 0, field346, field393 + 1, field392);
					field407.method196(var17, var18, field346, field393, field392);
				}

				if (field582[var10] == 3) {
					field407.method197(150 - field583[var10], 0, field346, var17, field393 + 1, field392);
					field407.method197(150 - field583[var10], var18, field346, var17, field393, field392);
				}

				if (field582[var10] == 4) {
					int var22 = field407.method193(var17);
					int var23 = (150 - field583[var10]) * (var22 + 100) / 150;
					TQHEKXXC.method475(field392 - 50, field392 + 50, 334, 0);
					field407.method194(var17, 0, field392 + 50 - var23, field393 + 1);
					field407.method194(var17, var18, field392 + 50 - var23, field393);
					TQHEKXXC.method474();
				}

				if (field582[var10] == 5) {
					int var24 = 150 - field583[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					TQHEKXXC.method475(0, 512, field393 + 5, field393 - field407.field645 - 1);
					field407.method190(field393 + var25 + 1, field392, var17, 0);
					field407.method190(field393 + var25, field392, var17, var18);
					TQHEKXXC.method474();
				}
			} else {
				field407.method190(field393 + 1, field392, var17, 0);
				field407.method190(field393, field392, var17, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method150() {
		if (field74 == 1) {
			if (field75 >= 6 && field75 <= 106 && field76 >= 467 && field76 <= 499) {
				field504 = (field504 + 1) % 4;
				field221 = true;
				field553 = true;
				field198.method233(52);
				field198.method234(field504);
				field198.method234(field349);
				field198.method234(field255);
			}

			if (field75 >= 135 && field75 <= 235 && field76 >= 467 && field76 <= 499) {
				field349 = (field349 + 1) % 3;
				field221 = true;
				field553 = true;
				field198.method233(52);
				field198.method234(field504);
				field198.method234(field349);
				field198.method234(field255);
			}

			if (field75 >= 273 && field75 <= 373 && field76 >= 467 && field76 <= 499) {
				field255 = (field255 + 1) % 3;
				field221 = true;
				field553 = true;
				field198.method233(52);
				field198.method234(field504);
				field198.method234(field349);
				field198.method234(field255);
			}

			if (field75 >= 412 && field75 <= 512 && field76 >= 467 && field76 <= 499) {
				if (field203 == -1) {
					method140();
					field457 = "";
					field515 = false;

					for (int var1 = 0; var1 < USEDZXXV.field1113.length; var1++) {
						if (USEDZXXV.field1113[var1] != null && USEDZXXV.field1113[var1].field1157 == 600) {
							field558 = field203 = USEDZXXV.field1113[var1].field1153;
							return;
						}
					}

					return;
				}

				method155("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method151() {
		if (field384 == 0 && field192 == 0) {
			field585[field503] = "Walk here";
			field435[field503] = 610;
			field433[field503] = field68;
			field434[field503] = field69;
			field503++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < VHYCWIPJ.field1239; var2++) {
			int var3 = VHYCWIPJ.field1240[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field191.method441(field530, var4, var5, var3) >= 0) {
					RFUKTMBK var8 = RFUKTMBK.method472(var7);
					if (var8.field1055 != null) {
						var8 = var8.method468();
					}

					if (var8 == null) {
						continue;
					}

					if (field384 == 1) {
						field585[field503] = "Use " + field388 + " with @cya@" + var8.field1068;
						field435[field503] = 262;
						field436[field503] = var3;
						field433[field503] = var4;
						field434[field503] = var5;
						field503++;
					} else if (field192 != 1) {
						if (var8.field1059 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1059[var9] != null) {
									field585[field503] = var8.field1059[var9] + " @cya@" + var8.field1068;

									if (var9 == 0) {
										field435[field503] = 237;
									}

									if (var9 == 1) {
										field435[field503] = 111;
									}

									if (var9 == 2) {
										field435[field503] = 686;
									}

									if (var9 == 3) {
										field435[field503] = 391;
									}

									if (var9 == 4) {
										field435[field503] = 1938;
									}

									field436[field503] = var3;
									field433[field503] = var4;
									field434[field503] = var5;
									field503++;
								}
							}
						}

						field585[field503] = "Examine @cya@" + var8.field1068;
						field435[field503] = 1714;
						field436[field503] = var8.field1051 << 14;
						field433[field503] = var4;
						field434[field503] = var5;
						field503++;
					} else if ((field194 & 0x4) == 4) {
						field585[field503] = field195 + " @cya@" + var8.field1068;
						field435[field503] = 16;
						field436[field503] = var3;
						field433[field503] = var4;
						field434[field503] = var5;
						field503++;
					}
				}

				if (var6 == 1) {
					QDXHSLSL var10 = field402[var7];
					if (var10.field972.field886 == 1 && (var10.field1292 & 0x7F) == 0x40 && (var10.field1293 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field403; var11++) {
							QDXHSLSL var12 = field402[field404[var11]];
							if (var12 != null && var10 != var12 && var12.field972.field886 == 1 && var10.field1292 == var12.field1292 && var10.field1293 == var12.field1293) {
								method162(field404[var11], var4, var5, var12.field972);
							}
						}

						for (int var13 = 0; var13 < field362; var13++) {
							PASMQFXV var14 = field361[field363[var13]];
							if (var14 != null && var10.field1292 == var14.field1292 && var10.field1293 == var14.field1293) {
								method111(var5, field363[var13], var14, var4);
							}
						}
					}

					method162(var7, var4, var5, var10.field972);
				}

				if (var6 == 0) {
					PASMQFXV var15 = field361[var7];
					if ((var15.field1292 & 0x7F) == 0x40 && (var15.field1293 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field403; var16++) {
							QDXHSLSL var17 = field402[field404[var16]];
							if (var17 != null && var17.field972.field886 == 1 && var15.field1292 == var17.field1292 && var15.field1293 == var17.field1293) {
								method162(field404[var16], var4, var5, var17.field972);
							}
						}

						for (int var18 = 0; var18 < field362; var18++) {
							PASMQFXV var19 = field361[field363[var18]];
							if (var19 != null && var15 != var19 && var15.field1292 == var19.field1292 && var15.field1293 == var19.field1293) {
								method111(var5, field363[var18], var19, var4);
							}
						}
					}

					method111(var5, var7, var15, var4);
				}

				if (var6 == 3) {
					VLLJSJTJ var20 = field505[field530][var4][var5];
					if (var20 != null) {
						for (NOAOCJCI var21 = (NOAOCJCI) var20.method529(); var21 != null; var21 = (NOAOCJCI) var20.method531()) {
							AVSLDGMK var22 = AVSLDGMK.method4(var21.field915);
							if (field384 == 1) {
								field585[field503] = "Use " + field388 + " with @lre@" + var22.field33;
								field435[field503] = 992;
								field436[field503] = var21.field915;
								field433[field503] = var4;
								field434[field503] = var5;
								field503++;
							} else if (field192 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field20 != null && var22.field20[var23] != null) {
										field585[field503] = var22.field20[var23] + " @lre@" + var22.field33;

										if (var23 == 0) {
											field435[field503] = 750;
										}

										if (var23 == 1) {
											field435[field503] = 12;
										}

										if (var23 == 2) {
											field435[field503] = 321;
										}

										if (var23 == 3) {
											field435[field503] = 247;
										}

										if (var23 == 4) {
											field435[field503] = 801;
										}

										field436[field503] = var21.field915;
										field433[field503] = var4;
										field434[field503] = var5;
										field503++;
									} else if (var23 == 2) {
										field585[field503] = "Take @lre@" + var22.field33;
										field435[field503] = 321;
										field436[field503] = var21.field915;
										field433[field503] = var4;
										field434[field503] = var5;
										field503++;
									}
								}

								field585[field503] = "Examine @lre@" + var22.field33;
								field435[field503] = 1297;
								field436[field503] = var21.field915;
								field433[field503] = var4;
								field434[field503] = var5;
								field503++;
							} else if ((field194 & 0x1) == 1) {
								field585[field503] = field195 + " @lre@" + var22.field33;
								field435[field503] = 516;
								field436[field503] = var21.field915;
								field433[field503] = var4;
								field434[field503] = var5;
								field503++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method152() {
		field439 = 0;
		int var1 = (field535.field1292 >> 7) + field340;
		int var2 = (field535.field1293 >> 7) + field341;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field439 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field439 = 1;
		}

		if (field439 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field439 = 0;
		}
	}

	@ObfuscatedName("client.a(LGLMIQHJI;IILPASMQFXV;B)V")
	public final void method153(GLMIQHJI arg0, int arg1, int arg2, PASMQFXV arg3) {
		if ((arg1 & 0x200) != 0) {
			int var5 = arg0.method265();
			int var6 = arg0.method264();
			arg3.method547(var6, field307, var5);
			arg3.field1315 = field307 + 300;
			arg3.field1316 = arg0.method264();
			arg3.field1317 = arg0.method264();
		}

		if ((arg1 & 0x10) != 0) {
			int var7 = arg0.method263();
			byte[] var8 = new byte[var7];
			GLMIQHJI var9 = new GLMIQHJI(var8);
			arg0.method253(var8, 0, var7);
			field366[arg2] = var9;
			arg3.method405(var9);
		}

		if ((arg1 & 0x2) != 0) {
			arg3.field1289 = arg0.method251();
			if (arg3.field1289.charAt(0) == '~') {
				arg3.field1289 = arg3.field1289.substring(1);
				method155(arg3.field1289, arg3.field936, 2);
			} else if (field535 == arg3) {
				method155(arg3.field1289, arg3.field936, 2);
			}

			arg3.field1274 = 0;
			arg3.field1290 = 0;
			arg3.field1270 = 150;
		}

		if ((arg1 & 0x100) != 0) {
			arg3.field1295 = arg0.method265();
			arg3.field1297 = arg0.method264();
			arg3.field1296 = arg0.method264();
			arg3.field1298 = arg0.method244();
			arg3.field1299 = arg0.method246() + field307;
			arg3.field1300 = arg0.method274() + field307;
			arg3.field1301 = arg0.method265();
			arg3.method545();
		}

		if ((arg1 & 0x400) != 0) {
			arg3.field1277 = arg0.method273();
			int var10 = arg0.method249();
			arg3.field1281 = var10 >> 16;
			arg3.field1280 = (var10 & 0xFFFF) + field307;
			arg3.field1278 = 0;
			arg3.field1279 = 0;

			if (arg3.field1280 > field307) {
				arg3.field1278 = -1;
			}

			if (arg3.field1277 == 0xFFFF) {
				arg3.field1277 = -1;
			}
		}

		if ((arg1 & 0x20) != 0) {
			int var11 = arg0.method265();
			int var12 = arg0.method244();
			arg3.method547(var12, field307, var11);
			arg3.field1315 = field307 + 300;
			arg3.field1316 = arg0.method263();
			arg3.field1317 = arg0.method265();
		}

		if ((arg1 & 0x4) != 0) {
			arg3.field1273 = arg0.method272();
			if (arg3.field1273 == 0xFFFF) {
				arg3.field1273 = -1;
			}
		}

		if ((arg1 & 0x80) != 0) {
			arg3.field1267 = arg0.method272();
			arg3.field1268 = arg0.method273();
		}

		if ((arg1 & 0x40) != 0) {
			int var13 = arg0.method272();
			int var14 = arg0.method265();
			int var15 = arg0.method264();
			int var16 = arg0.field709;

			if (arg3.field936 != null && arg3.field945) {
				long var17 = YYRFHIVS.method583(arg3.field936);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field181; var20++) {
						if (field305[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field439 == 0) {
					try {
						field401.field709 = 0;
						arg0.method280(field401.field708, var15, 0);
						field401.field709 = 0;
						String var21 = KUSEAONH.method343(field401, var15);
						var21 = HUPJRXOW.method298(var21);
						arg3.field1289 = var21;
						arg3.field1274 = var13 >> 8;
						arg3.field1290 = var13 & 0xFF;
						arg3.field1270 = 150;

						if (var14 == 2 || var14 == 3) {
							method155(var21, "@cr2@" + arg3.field936, 1);
						} else if (var14 == 1) {
							method155(var21, "@cr1@" + arg3.field936, 1);
						} else {
							method155(var21, arg3.field936, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field709 = var15 + var16;
		}

		if ((arg1 & 0x8) != 0) {
			int var23 = arg0.method274();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg0.method244();
			if (arg3.field1310 == var23 && var23 != -1) {
				int var25 = WLHKAARP.field1323[var23].field1337;
				if (var25 == 1) {
					arg3.field1311 = 0;
					arg3.field1312 = 0;
					arg3.field1313 = var24;
					arg3.field1314 = 0;
				}

				if (var25 == 2) {
					arg3.field1314 = 0;
					return;
				}
			} else if (var23 == -1 || arg3.field1310 == -1 || WLHKAARP.field1323[var23].field1331 >= WLHKAARP.field1323[arg3.field1310].field1331) {
				arg3.field1310 = var23;
				arg3.field1311 = 0;
				arg3.field1312 = 0;
				arg3.field1313 = var24;
				arg3.field1314 = 0;
				arg3.field1291 = arg3.field1276;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method154(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field181; var3++) {
				if (field305[var3] == arg0) {
					field181--;
					field410 = true;

					for (int var4 = var3; var4 < field181; var4++) {
						field305[var4] = field305[var4 + 1];
					}

					field198.method233(173);
					field198.method240(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;Ljava/lang/String;I)V")
	public final void method155(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field495 != -1) {
			field205 = arg0;
			field74 = 0;
		}

		if (field531 == -1) {
			field553 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field248[var4] = field248[var4 - 1];
			field249[var4] = field249[var4 - 1];
			field250[var4] = field250[var4 - 1];
		}

		field248[0] = arg2;
		field249[0] = arg1;
		field250[0] = arg0;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method156() {
		if (field74 == 1) {
			if (field75 >= 539 && field75 <= 573 && field76 >= 169 && field76 < 205 && field334[0] != -1) {
				field410 = true;
				field223 = 0;
				field344 = true;
			}

			if (field75 >= 569 && field75 <= 599 && field76 >= 168 && field76 < 205 && field334[1] != -1) {
				field410 = true;
				field223 = 1;
				field344 = true;
			}

			if (field75 >= 597 && field75 <= 627 && field76 >= 168 && field76 < 205 && field334[2] != -1) {
				field410 = true;
				field223 = 2;
				field344 = true;
			}

			if (field75 >= 625 && field75 <= 669 && field76 >= 168 && field76 < 203 && field334[3] != -1) {
				field410 = true;
				field223 = 3;
				field344 = true;
			}

			if (field75 >= 666 && field75 <= 696 && field76 >= 168 && field76 < 205 && field334[4] != -1) {
				field410 = true;
				field223 = 4;
				field344 = true;
			}

			if (field75 >= 694 && field75 <= 724 && field76 >= 168 && field76 < 205 && field334[5] != -1) {
				field410 = true;
				field223 = 5;
				field344 = true;
			}

			if (field75 >= 722 && field75 <= 756 && field76 >= 169 && field76 < 205 && field334[6] != -1) {
				field410 = true;
				field223 = 6;
				field344 = true;
			}

			if (field75 >= 540 && field75 <= 574 && field76 >= 466 && field76 < 502 && field334[7] != -1) {
				field410 = true;
				field223 = 7;
				field344 = true;
			}

			if (field75 >= 572 && field75 <= 602 && field76 >= 466 && field76 < 503 && field334[8] != -1) {
				field410 = true;
				field223 = 8;
				field344 = true;
			}

			if (field75 >= 599 && field75 <= 629 && field76 >= 466 && field76 < 503 && field334[9] != -1) {
				field410 = true;
				field223 = 9;
				field344 = true;
			}

			if (field75 >= 627 && field75 <= 671 && field76 >= 467 && field76 < 502 && field334[10] != -1) {
				field410 = true;
				field223 = 10;
				field344 = true;
			}

			if (field75 >= 669 && field75 <= 699 && field76 >= 466 && field76 < 503 && field334[11] != -1) {
				field410 = true;
				field223 = 11;
				field344 = true;
			}

			if (field75 >= 696 && field75 <= 726 && field76 >= 466 && field76 < 503 && field334[12] != -1) {
				field410 = true;
				field223 = 12;
				field344 = true;
			}

			if (field75 >= 724 && field75 <= 758 && field76 >= 466 && field76 < 502 && field334[13] != -1) {
				field410 = true;
				field223 = 13;
				field344 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IIII)LXRWUKRPO;")
	public final XRWUKRPO method157(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field541[0] != null) {
				var6 = field541[0].method533(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field201.reset();
			field201.update(var6);
			int var8 = (int) field201.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new XRWUKRPO(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method26(arg4, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method120(arg0 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				GLMIQHJI var16 = new GLMIQHJI(var15);
				var16.field709 = 3;
				int var17 = var16.method248() + 6;
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
						method26(arg4, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field541[0] != null) {
						field541[0].method534(var6.length, var6, arg2);
					}
				} catch (Exception var28) {
					field541[0] = null;
				}

				if (var6 != null) {
					field201.reset();
					field201.update(var6);
					int var23 = (int) field201.getValue();
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
						method26(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method26(arg4, var11 + " - Retrying in " + var25);
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

				field173 = !field173;
			}
		}

		return new XRWUKRPO(var6);
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String method158(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method159() {
		int var1 = field407.method192("Choose Option");
		for (int var2 = 0; var2 < field503; var2++) {
			int var3 = field407.method192(field585[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field503 * 15 + 21;
		if (field75 > 4 && field76 > 4 && field75 < 516 && field76 < 338) {
			int var5 = field75 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field76 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field398 = true;
			field452 = 0;
			field453 = var5;
			field454 = var6;
			field455 = var1;
			field456 = field503 * 15 + 22;
		}

		if (field75 > 553 && field76 > 205 && field75 < 743 && field76 < 466) {
			int var7 = field75 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field76 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field398 = true;
			field452 = 1;
			field453 = var7;
			field454 = var8;
			field455 = var1;
			field456 = field503 * 15 + 22;
		}

		if (field75 > 17 && field76 > 357 && field75 < 496 && field76 < 453) {
			int var9 = field75 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field76 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field398 = true;
			field452 = 2;
			field453 = var9;
			field454 = var10;
			field455 = var1;
			field456 = field503 * 15 + 22;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method160() {
		if (field265 != 0) {
			DBRMEPJQ var1 = field406;
			int var2 = 0;
			if (field428 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field250[var3] != null) {
					int var4 = field248[var3];
					String var5 = field249[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field349 == 0 || field349 == 1 && method56(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method194("From", 0, var8, var7);
						var1.method194("From", 0xFFFF, var8, var7 - 1);
						int var11 = var8 + var1.method192("From ");
						if (var6 == 1) {
							field418[0].method542(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field418[1].method542(var11, var7 - 12);
							var11 += 14;
						}

						var1.method194(var5 + ": " + field250[var3], 0, var11, var7);
						var1.method194(var5 + ": " + field250[var3], 0xFFFF, var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field349 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method194(field250[var3], 0, 4, var9);
						var1.method194(field250[var3], 0xFFFF, 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field349 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method194("To " + var5 + ": " + field250[var3], 0, 4, var10);
						var1.method194("To " + var5 + ": " + field250[var3], 0xFFFF, 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
			if (field214 && field530 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field191.method437(arg4, arg3, arg6);
			}

			if (arg2 == 1) {
				var8 = field191.method438(arg3, arg6, arg4);
			}

			if (arg2 == 2) {
				var8 = field191.method439(arg4, arg3, arg6);
			}

			if (arg2 == 3) {
				var8 = field191.method440(arg4, arg3, arg6);
			}

			if (var8 != 0) {
				int var12 = field191.method441(arg4, arg3, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field191.method428(arg6, arg4, arg3);
					RFUKTMBK var16 = RFUKTMBK.method472(var13);
					if (var16.field1058) {
						field415[arg4].method210(arg3, var15, var16.field1064, arg6, var14);
					}
				}

				if (arg2 == 1) {
					field191.method429(arg4, arg6, arg3);
				}

				if (arg2 == 2) {
					field191.method430(arg6, arg4, arg3);
					RFUKTMBK var17 = RFUKTMBK.method472(var13);
					if (var17.field1082 + arg3 > 103 || var17.field1082 + arg6 > 103 || var17.field1053 + arg3 > 103 || var17.field1053 + arg6 > 103) {
						return;
					}

					if (var17.field1058) {
						field415[arg4].method211(arg3, var15, var17.field1064, var17.field1053, var17.field1082, arg6);
					}
				}

				if (arg2 == 3) {
					field191.method431(arg3, arg4, arg6);
					RFUKTMBK var18 = RFUKTMBK.method472(var13);
					if (var18.field1058 && var18.field1038) {
						field415[arg4].method213(arg3, arg6);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field377[1][arg3][arg6] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				WYBZGYVK.method567(arg1, arg4, field262, arg5, field191, var19, arg3, arg0, field415[arg4], arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZIIILLPTCUHOU;)V")
	public final void method162(int arg0, int arg1, int arg2, LPTCUHOU arg3) {
		if (field503 < 400) {
			if (arg3.field888 != null) {
				arg3 = arg3.method383();
			}

			if (arg3 != null) {
				String var5 = arg3.field864;
				if (arg3.field865 != 0) {
					var5 = var5 + method98(arg3.field865, field535.field959) + " (level-" + arg3.field865 + ")";
				}

				if (field384 == 1) {
					field585[field503] = "Use " + field388 + " with @yel@" + var5;
					field435[field503] = 818;
					field436[field503] = arg0;
					field433[field503] = arg1;
					field434[field503] = arg2;
					field503++;
				} else if (field192 != 1) {
					if (arg3.field891 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field891[var6] != null && !arg3.field891[var6].equalsIgnoreCase("attack")) {
								field585[field503] = arg3.field891[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field435[field503] = 331;
								}

								if (var6 == 1) {
									field435[field503] = 41;
								}

								if (var6 == 2) {
									field435[field503] = 677;
								}

								if (var6 == 3) {
									field435[field503] = 30;
								}

								if (var6 == 4) {
									field435[field503] = 337;
								}

								field436[field503] = arg0;
								field433[field503] = arg1;
								field434[field503] = arg2;
								field503++;
							}
						}
					}

					if (arg3.field891 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field891[var7] != null && arg3.field891[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field865 > field535.field959) {
									var8 = 2000;
								}

								field585[field503] = arg3.field891[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field435[field503] = var8 + 331;
								}

								if (var7 == 1) {
									field435[field503] = var8 + 41;
								}

								if (var7 == 2) {
									field435[field503] = var8 + 677;
								}

								if (var7 == 3) {
									field435[field503] = var8 + 30;
								}

								if (var7 == 4) {
									field435[field503] = var8 + 337;
								}

								field436[field503] = arg0;
								field433[field503] = arg1;
								field434[field503] = arg2;
								field503++;
							}
						}
					}

					field585[field503] = "Examine @yel@" + var5;
					field435[field503] = 1101;
					field436[field503] = arg0;
					field433[field503] = arg1;
					field434[field503] = arg2;
					field503++;
				} else if ((field194 & 0x2) == 2) {
					field585[field503] = field195 + " @yel@" + var5;
					field435[field503] = 873;
					field436[field503] = arg0;
					field433[field503] = arg1;
					field434[field503] = arg2;
					field503++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method163(long arg0) {
		if (arg0 != 0L) {
			if (field181 >= 100) {
				method155("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = YYRFHIVS.method587(YYRFHIVS.method584(arg0));
				for (int var4 = 0; var4 < field181; var4++) {
					if (field305[var4] == arg0) {
						method155(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field171; var5++) {
					if (field502[var5] == arg0) {
						method155("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field305[field181++] = arg0;
				field410 = true;
				field198.method233(38);
				field198.method240(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(LUSEDZXXV;IIII)V")
	public final void method164(USEDZXXV arg0, int arg1, int arg2, int arg3) {
		if (arg0.field1134 == 0 && arg0.field1132 != null && (!arg0.field1120 || field220 == arg0.field1164 || field260 == arg0.field1164 || field443 == arg0.field1164)) {
			int var5 = TQHEKXXC.field1094;
			int var6 = TQHEKXXC.field1092;
			int var7 = TQHEKXXC.field1095;
			int var8 = TQHEKXXC.field1093;
			TQHEKXXC.method475(arg3, arg0.field1158 + arg3, arg0.field1152 + arg1, arg1);
			int var9 = arg0.field1132.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field1168[var10] + arg3;
				int var12 = arg0.field1146[var10] + arg1 - arg2;
				USEDZXXV var13 = USEDZXXV.field1113[arg0.field1132[var10]];
				var11 += var13.field1117;
				var12 += var13.field1142;

				if (var13.field1157 > 0) {
					method59(var13);
				}

				if (var13.field1134 == 0) {
					if (var13.field1161 > var13.field1124 - var13.field1152) {
						var13.field1161 = var13.field1124 - var13.field1152;
					}

					if (var13.field1161 < 0) {
						var13.field1161 = 0;
					}

					method164(var13, var12, var13.field1161, var11);

					if (var13.field1124 > var13.field1152) {
						method101(var13.field1124, var13.field1161, var13.field1152, var13.field1158 + var11, var12);
					}
				} else if (var13.field1134 != 1) {
					if (var13.field1134 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1152; var15++) {
							for (int var16 = 0; var16 < var13.field1158; var16++) {
								int var17 = (var13.field1121 + 32) * var16 + var11;
								int var18 = (var13.field1115 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1166[var14];
									var18 += var13.field1108[var14];
								}

								if (var13.field1155[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1155[var14] - 1;
									if (var17 > TQHEKXXC.field1094 - 32 && var17 < TQHEKXXC.field1095 && var18 > TQHEKXXC.field1092 - 32 && var18 < TQHEKXXC.field1093 || field549 != 0 && field548 == var14) {
										int var22 = 0;
										if (field384 == 1 && field385 == var14 && field386 == var13.field1164) {
											var22 = 0xFFFFFF;
										}

										INVDQNJU var23 = AVSLDGMK.method5(var22, var21, var13.field1169[var14]);
										if (var23 != null) {
											if (field549 != 0 && field548 == var14 && field547 == var13.field1164) {
												var19 = field68 - field550;
												var20 = field69 - field551;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field241 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method333(128, var17 + var19, var18 + var20);

												if (var18 + var20 < TQHEKXXC.field1092 && arg0.field1161 > 0) {
													int var24 = (TQHEKXXC.field1092 - var18 - var20) * field176 / 3;
													if (var24 > field176 * 10) {
														var24 = field176 * 10;
													}

													if (var24 > arg0.field1161) {
														var24 = arg0.field1161;
													}

													arg0.field1161 -= var24;
													field551 += var24;
												}

												if (var18 + var20 + 32 > TQHEKXXC.field1093 && arg0.field1161 < arg0.field1124 - arg0.field1152) {
													int var25 = (var18 + var20 + 32 - TQHEKXXC.field1093) * field176 / 3;
													if (var25 > field176 * 10) {
														var25 = field176 * 10;
													}

													if (var25 > arg0.field1124 - arg0.field1152 - arg0.field1161) {
														var25 = arg0.field1124 - arg0.field1152 - arg0.field1161;
													}

													arg0.field1161 += var25;
													field551 -= var25;
												}
											} else if (field303 != 0 && field302 == var14 && field301 == var13.field1164) {
												var23.method333(128, var17, var18);
											} else {
												var23.method331(var17, var18);
											}

											if (var23.field763 == 33 || var13.field1169[var14] != 1) {
												int var26 = var13.field1169[var14];
												field405.method194(method75(var26), 0, var17 + var19 + 1, var18 + 10 + var20);
												field405.method194(method75(var26), 0xFFFF00, var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field1144 != null && var14 < 20) {
									INVDQNJU var27 = var13.field1144[var14];
									if (var27 != null) {
										var27.method331(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1134 == 3) {
						boolean var28 = false;
						if (field443 == var13.field1164 || field260 == var13.field1164 || field220 == var13.field1164) {
							var28 = true;
						}

						int var29;
						if (method82(var13)) {
							var29 = var13.field1130;
							if (var28 && var13.field1140 != 0) {
								var29 = var13.field1140;
							}
						} else {
							var29 = var13.field1137;
							if (var28 && var13.field1171 != 0) {
								var29 = var13.field1171;
							}
						}

						if (var13.field1170 == 0) {
							if (var13.field1136) {
								TQHEKXXC.method478(var13.field1158, var11, var29, var12, var13.field1152);
							} else {
								TQHEKXXC.method479(var29, var13.field1152, var13.field1158, var12, var11);
							}
						} else if (var13.field1136) {
							TQHEKXXC.method477(var29, var11, var13.field1158, var12, 256 - (var13.field1170 & 0xFF), var13.field1152);
						} else {
							TQHEKXXC.method480(var13.field1158, 256 - (var13.field1170 & 0xFF), var11, var29, var12, var13.field1152);
						}
					} else if (var13.field1134 == 4) {
						DBRMEPJQ var30 = var13.field1122;
						String var31 = var13.field1167;
						boolean var32 = false;
						if (field443 == var13.field1164 || field260 == var13.field1164 || field220 == var13.field1164) {
							var32 = true;
						}

						int var33;
						if (method82(var13)) {
							var33 = var13.field1130;
							if (var32 && var13.field1140 != 0) {
								var33 = var13.field1140;
							}

							if (var13.field1131.length() > 0) {
								var31 = var13.field1131;
							}
						} else {
							var33 = var13.field1137;
							if (var32 && var13.field1171 != 0) {
								var33 = var13.field1171;
							}
						}

						if (var13.field1147 == 6 && field557) {
							var31 = "Please wait...";
							var33 = var13.field1137;
						}

						if (TQHEKXXC.field1090 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field645 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method158(method108(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method158(method108(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method158(method108(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method158(method108(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method158(method108(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1143) {
								var30.method191(var13.field1158 / 2 + var11, var34, var33, var41, var13.field1133);
							} else {
								var30.method198(var41, var34, var13.field1133, var11, var33);
							}

							var34 += var30.field645;
						}
					} else if (var13.field1134 == 5) {
						INVDQNJU var42;
						if (method82(var13)) {
							var42 = var13.field1151;
						} else {
							var42 = var13.field1126;
						}

						if (var42 != null) {
							var42.method331(var11, var12);
						}
					} else if (var13.field1134 == 6) {
						int var43 = CUVGZBEX.field603;
						int var44 = CUVGZBEX.field604;
						CUVGZBEX.field603 = var13.field1158 / 2 + var11;
						CUVGZBEX.field604 = var13.field1152 / 2 + var12;
						int var45 = CUVGZBEX.field607[var13.field1111] * var13.field1110 >> 16;
						int var46 = CUVGZBEX.field608[var13.field1111] * var13.field1110 >> 16;
						boolean var47 = method82(var13);
						int var48;
						if (var47) {
							var48 = var13.field1150;
						} else {
							var48 = var13.field1149;
						}

						VHYCWIPJ var49;
						if (var48 == -1) {
							var49 = var13.method494(var47, -1, -1);
						} else {
							WLHKAARP var50 = WLHKAARP.field1323[var48];
							var49 = var13.method494(var47, var50.field1326[var13.field1125], var50.field1325[var13.field1125]);
						}

						if (var49 != null) {
							var49.method520(0, var13.field1112, 0, var13.field1111, 0, var45, var46);
						}

						CUVGZBEX.field603 = var43;
						CUVGZBEX.field604 = var44;
					} else if (var13.field1134 == 7) {
						DBRMEPJQ var51 = var13.field1122;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1152; var53++) {
							for (int var54 = 0; var54 < var13.field1158; var54++) {
								if (var13.field1155[var52] > 0) {
									AVSLDGMK var55 = AVSLDGMK.method4(var13.field1155[var52] - 1);
									String var56 = var55.field33;
									if (var55.field28 || var13.field1169[var52] != 1) {
										var56 = var56 + " x" + method130(var13.field1169[var52]);
									}

									int var57 = (var13.field1121 + 115) * var54 + var11;
									int var58 = (var13.field1115 + 12) * var53 + var12;
									if (var13.field1143) {
										var51.method191(var13.field1158 / 2 + var57, var58, var13.field1137, var56, var13.field1133);
									} else {
										var51.method198(var56, var58, var13.field1133, var57, var13.field1137);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			TQHEKXXC.method475(var5, var7, var8, var6);
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field191.method437(arg4, arg3, arg1);
		if (var6 != 0) {
			int var7 = field191.method441(arg4, arg3, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field494.field758;
			int var12 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			RFUKTMBK var14 = RFUKTMBK.method472(var13);
			if (var14.field1041 == -1) {
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
				VUMXQDFQ var15 = field409[var14.field1041];
				if (var15 != null) {
					int var16 = (var14.field1082 * 4 - var15.field1261) / 2;
					int var17 = (var14.field1053 * 4 - var15.field1262) / 2;
					var15.method542(arg3 * 4 + var16 + 48, (104 - arg1 - var14.field1053) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field191.method439(arg4, arg3, arg1);
		if (var18 != 0) {
			int var19 = field191.method441(arg4, arg3, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			RFUKTMBK var23 = RFUKTMBK.method472(var22);
			if (var23.field1041 != -1) {
				VUMXQDFQ var24 = field409[var23.field1041];
				if (var24 != null) {
					int var25 = (var23.field1082 * 4 - var24.field1261) / 2;
					int var26 = (var23.field1053 * 4 - var24.field1262) / 2;
					var24.method542(arg3 * 4 + var25 + 48, (104 - arg1 - var23.field1053) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field494.field758;
				int var29 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field191.method440(arg4, arg3, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			RFUKTMBK var32 = RFUKTMBK.method472(var31);
			if (var32.field1041 != -1) {
				VUMXQDFQ var33 = field409[var32.field1041];
				if (var33 != null) {
					int var34 = (var32.field1082 * 4 - var33.field1261) / 2;
					int var35 = (var32.field1053 * 4 - var33.field1262) / 2;
					var33.method542(arg3 * 4 + var34 + 48, (104 - arg1 - var32.field1053) * 4 + 48 + var35);
					return;
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
			field319[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field518[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
