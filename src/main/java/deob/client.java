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
public final class client extends HXUVWQPY {

	@ObfuscatedName("client.P")
	public int[] field184 = new int[500];

	@ObfuscatedName("client.Q")
	public int[] field185 = new int[500];

	@ObfuscatedName("client.R")
	public int[] field186 = new int[500];

	@ObfuscatedName("client.S")
	public int[] field187 = new int[500];

	@ObfuscatedName("client.T")
	public volatile boolean field188 = false;

	@ObfuscatedName("client.V")
	public LOVQYTIZ[] field190 = new LOVQYTIZ[32];

	@ObfuscatedName("client.fb")
	public int[] field200 = new int[50];

	@ObfuscatedName("client.gb")
	public boolean field201 = false;

	@ObfuscatedName("client.ib")
	public int[] field202 = new int[5];

	@ObfuscatedName("client.jb")
	public ZLYJLLFY[] field203 = new ZLYJLLFY[5];

	@ObfuscatedName("client.yb")
	public int field218 = 0x332D25;

	@ObfuscatedName("client.zb")
	public boolean field219 = true;

	@ObfuscatedName("client.Db")
	public int field222 = 0x766654;

	@ObfuscatedName("client.Jb")
	public boolean field228 = false;

	@ObfuscatedName("client.Kb")
	public String field229 = "";

	@ObfuscatedName("client.Lb")
	public String field230 = "";

	@ObfuscatedName("client.Rb")
	public int[] field236 = new int[5];

	@ObfuscatedName("client.Yb")
	public int field243 = -1;

	@ObfuscatedName("client.ec")
	public LOVQYTIZ[] field249 = new LOVQYTIZ[32];

	@ObfuscatedName("client.gc")
	public boolean field251 = false;

	@ObfuscatedName("client.uc")
	public boolean field263 = false;

	@ObfuscatedName("client.vc")
	public int[][][] field264 = new int[4][13][13];

	@ObfuscatedName("client.xc")
	public VDSFJUIR[] field265 = new VDSFJUIR[4];

	@ObfuscatedName("client.Ac")
	public int[] field267 = new int[ZGXDMAYA.field1507];

	@ObfuscatedName("client.Bc")
	public int field268 = 0x4D4233;

	@ObfuscatedName("client.Fc")
	public TKPFKOXP field272 = TKPFKOXP.method517(1);

	@ObfuscatedName("client.Ic")
	public int field275 = 3;

	@ObfuscatedName("client.Jc")
	public String field276 = "";

	@ObfuscatedName("client.Sc")
	public boolean field284 = false;

	@ObfuscatedName("client.Vc")
	public boolean field287 = false;

	@ObfuscatedName("client.Wc")
	public int field288 = -1;

	@ObfuscatedName("client.bd")
	public int[] field291 = new int[5];

	@ObfuscatedName("client.dd")
	public IJNDWVIL field293 = new IJNDWVIL();

	@ObfuscatedName("client.ed")
	public final int field294 = 100;

	@ObfuscatedName("client.fd")
	public int[] field295 = new int[100];

	@ObfuscatedName("client.hd")
	public int[] field297 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.id")
	public boolean field298 = false;

	@ObfuscatedName("client.qd")
	public int[] field304 = new int[7];

	@ObfuscatedName("client.rd")
	public CRC32 field305 = new CRC32();

	@ObfuscatedName("client.sd")
	public LOVQYTIZ[] field306 = new LOVQYTIZ[32];

	@ObfuscatedName("client.Ed")
	public int field316 = 2;

	@ObfuscatedName("client.Nd")
	public int field323 = 78;

	@ObfuscatedName("client.Qd")
	public boolean field326 = false;

	@ObfuscatedName("client.Vd")
	public int[] field330 = new int[5];

	@ObfuscatedName("client.Xd")
	public int[][] field332 = new int[104][104];

	@ObfuscatedName("client.ae")
	public int[] field335 = new int[33];

	@ObfuscatedName("client.be")
	public int[] field336 = new int[100];

	@ObfuscatedName("client.ce")
	public String[] field337 = new String[100];

	@ObfuscatedName("client.de")
	public String[] field338 = new String[100];

	@ObfuscatedName("client.ie")
	public int[] field342 = new int[5];

	@ObfuscatedName("client.ke")
	public boolean field344 = false;

	@ObfuscatedName("client.le")
	public int field345 = 128;

	@ObfuscatedName("client.ve")
	public boolean field354 = false;

	@ObfuscatedName("client.we")
	public int[] field355 = new int[50];

	@ObfuscatedName("client.He")
	public boolean[] field366 = new boolean[5];

	@ObfuscatedName("client.Ie")
	public int[] field367 = new int[151];

	@ObfuscatedName("client.Ke")
	public final int[] field368 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Le")
	public SXQMCHPP field369 = new SXQMCHPP();

	@ObfuscatedName("client.Me")
	public int field370 = -1;

	@ObfuscatedName("client.Ne")
	public int[][] field371 = new int[104][104];

	@ObfuscatedName("client.Oe")
	public int field372 = -1;

	@ObfuscatedName("client.Pe")
	public int[] field373 = new int[9];

	@ObfuscatedName("client.Ue")
	public NPZZPPRD[] field378 = new NPZZPPRD[2];

	@ObfuscatedName("client.We")
	public int field380 = 1;

	@ObfuscatedName("client.df")
	public String field387 = "";

	@ObfuscatedName("client.ef")
	public String field388 = "";

	@ObfuscatedName("client.ff")
	public int[] field389 = new int[200];

	@ObfuscatedName("client.mf")
	public boolean field395 = false;

	@ObfuscatedName("client.nf")
	public TKPFKOXP field396 = new TKPFKOXP(new byte[5000]);

	@ObfuscatedName("client.of")
	public ZHNLOFBM[] field397 = new ZHNLOFBM[16384];

	@ObfuscatedName("client.qf")
	public int[] field399 = new int[16384];

	@ObfuscatedName("client.tf")
	public int field402 = -1;

	@ObfuscatedName("client.uf")
	public int field403 = -1;

	@ObfuscatedName("client.wf")
	public int field405 = 2048;

	@ObfuscatedName("client.xf")
	public int field406 = 2047;

	@ObfuscatedName("client.yf")
	public TINBLEHZ[] field407 = new TINBLEHZ[field405];

	@ObfuscatedName("client.Af")
	public int[] field409 = new int[field405];

	@ObfuscatedName("client.Cf")
	public int[] field411 = new int[field405];

	@ObfuscatedName("client.Df")
	public TKPFKOXP[] field412 = new TKPFKOXP[field405];

	@ObfuscatedName("client.Ef")
	public int field413 = -1;

	@ObfuscatedName("client.Of")
	public int[] field423 = new int[33];

	@ObfuscatedName("client.ag")
	public int field434 = -1;

	@ObfuscatedName("client.bg")
	public SXQMCHPP field435 = new SXQMCHPP();

	@ObfuscatedName("client.eg")
	public int field438 = -1;

	@ObfuscatedName("client.fg")
	public LOVQYTIZ[] field439 = new LOVQYTIZ[1000];

	@ObfuscatedName("client.gg")
	public volatile boolean field440 = false;

	@ObfuscatedName("client.pg")
	public int field447 = -1;

	@ObfuscatedName("client.sg")
	public long[] field450 = new long[100];

	@ObfuscatedName("client.tg")
	public String[] field451 = new String[500];

	@ObfuscatedName("client.vg")
	public int field453 = 1;

	@ObfuscatedName("client.wg")
	public int[] field454 = new int[2000];

	@ObfuscatedName("client.Bg")
	public volatile boolean field458 = false;

	@ObfuscatedName("client.Dg")
	public int[] field459 = new int[4000];

	@ObfuscatedName("client.Eg")
	public int[] field460 = new int[4000];

	@ObfuscatedName("client.Kg")
	public int field466 = -1;

	@ObfuscatedName("client.Lg")
	public int[] field467 = new int[ZGXDMAYA.field1507];

	@ObfuscatedName("client.Mg")
	public String field468 = "";

	@ObfuscatedName("client.Ng")
	public int field469 = -1;

	@ObfuscatedName("client.Og")
	public boolean field470 = true;

	@ObfuscatedName("client.Rg")
	public int[] field472 = new int[2000];

	@ObfuscatedName("client.Sg")
	public String[] field473 = new String[5];

	@ObfuscatedName("client.Tg")
	public boolean[] field474 = new boolean[5];

	@ObfuscatedName("client.Wg")
	public int field476 = 2;

	@ObfuscatedName("client.Zg")
	public int[] field479 = new int[1000];

	@ObfuscatedName("client.ah")
	public int[] field480 = new int[1000];

	@ObfuscatedName("client.bh")
	public boolean field481 = false;

	@ObfuscatedName("client.dh")
	public int[][] field483 = new int[104][104];

	@ObfuscatedName("client.fh")
	public boolean field485 = true;

	@ObfuscatedName("client.jh")
	public boolean field489 = true;

	@ObfuscatedName("client.kh")
	public NPZZPPRD[] field490 = new NPZZPPRD[100];

	@ObfuscatedName("client.th")
	public LOVQYTIZ[] field498 = new LOVQYTIZ[8];

	@ObfuscatedName("client.Ch")
	public String[] field507 = new String[200];

	@ObfuscatedName("client.Gh")
	public String field510 = "";

	@ObfuscatedName("client.Ih")
	public TKPFKOXP field511 = TKPFKOXP.method517(1);

	@ObfuscatedName("client.Jh")
	public SXQMCHPP field512 = new SXQMCHPP();

	@ObfuscatedName("client.Kh")
	public int[] field513 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Mh")
	public int[] field514 = new int[ZGXDMAYA.field1507];

	@ObfuscatedName("client.Oh")
	public int[] field515 = new int[256];

	@ObfuscatedName("client.Qh")
	public int[] field517 = new int[1000];

	@ObfuscatedName("client.Uh")
	public int field521 = -1;

	@ObfuscatedName("client.Vh")
	public int[] field522 = new int[151];

	@ObfuscatedName("client.Wh")
	public long[] field523 = new long[200];

	@ObfuscatedName("client.Xh")
	public boolean field524 = false;

	@ObfuscatedName("client.Yh")
	public int[] field525 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.ai")
	public boolean field526 = false;

	@ObfuscatedName("client.hi")
	public boolean field531 = true;

	@ObfuscatedName("client.oi")
	public int field537 = -1;

	@ObfuscatedName("client.qi")
	public boolean field538 = false;

	@ObfuscatedName("client.ri")
	public boolean field539 = false;

	@ObfuscatedName("client.ti")
	public TKPFKOXP field540 = TKPFKOXP.method517(1);

	@ObfuscatedName("client.wi")
	public SXQMCHPP[][][] field543 = new SXQMCHPP[4][104][104];

	@ObfuscatedName("client.yi")
	public LOVQYTIZ[] field544 = new LOVQYTIZ[100];

	@ObfuscatedName("client.Ii")
	public boolean field551 = false;

	@ObfuscatedName("client.Ji")
	public boolean field552 = false;

	@ObfuscatedName("client.Ki")
	public LOVQYTIZ[] field553 = new LOVQYTIZ[20];

	@ObfuscatedName("client.Li")
	public String field554 = "";

	@ObfuscatedName("client.Mi")
	public String field555 = "";

	@ObfuscatedName("client.Oi")
	public String[] field557 = new String[100];

	@ObfuscatedName("client.Pi")
	public int[] field558 = new int[100];

	@ObfuscatedName("client.Ri")
	public boolean field560 = false;

	@ObfuscatedName("client.Ui")
	public boolean field562 = false;

	@ObfuscatedName("client.aj")
	public int[] field566 = new int[50];

	@ObfuscatedName("client.jj")
	public String field572 = "";

	@ObfuscatedName("client.qj")
	public int field577 = -1;

	@ObfuscatedName("client.tj")
	public byte[] field579 = new byte[16384];

	@ObfuscatedName("client.zj")
	public boolean field584 = false;

	@ObfuscatedName("client.Dj")
	public int field588 = 50;

	@ObfuscatedName("client.Ej")
	public int[] field589 = new int[field588];

	@ObfuscatedName("client.Fj")
	public int[] field590 = new int[field588];

	@ObfuscatedName("client.Gj")
	public int[] field591 = new int[field588];

	@ObfuscatedName("client.Hj")
	public int[] field592 = new int[field588];

	@ObfuscatedName("client.Ij")
	public int[] field593 = new int[field588];

	@ObfuscatedName("client.Jj")
	public int[] field594 = new int[field588];

	@ObfuscatedName("client.Kj")
	public int[] field595 = new int[field588];

	@ObfuscatedName("client.Lj")
	public String[] field596 = new String[field588];

	@ObfuscatedName("client.Nj")
	public boolean field597 = false;

	@ObfuscatedName("client.Oj")
	public int field598 = 0x23201B;

	@ObfuscatedName("client.Qj")
	public int field600 = 2;

	@ObfuscatedName("client.Rj")
	public NPZZPPRD[] field601 = new NPZZPPRD[13];

	@ObfuscatedName("client.Wj")
	public int field606 = -1;

	@ObfuscatedName("client.Qb")
	public static BigInteger field235 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Tc")
	public static final int[] field285 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Rd")
	public static final int[][] field327 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.je")
	public static int[] field343 = new int[99];

	@ObfuscatedName("client.Tf")
	public static BigInteger field428 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.xg")
	public static String field455 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.vh")
	public static int field500 = 10;

	@ObfuscatedName("client.xh")
	public static boolean field502 = true;

	@ObfuscatedName("client.ij")
	public static int[] field571 = new int[32];

	@ObfuscatedName("client.I")
	public static int field177;

	@ObfuscatedName("client.J")
	public int field178;

	@ObfuscatedName("client.K")
	public int field179;

	@ObfuscatedName("client.L")
	public int field180;

	@ObfuscatedName("client.M")
	public int field181;

	@ObfuscatedName("client.N")
	public int field182;

	@ObfuscatedName("client.O")
	public int field183;

	@ObfuscatedName("client.U")
	public static int field189;

	@ObfuscatedName("client.lb")
	public int field205;

	@ObfuscatedName("client.mb")
	public int field206;

	@ObfuscatedName("client.nb")
	public int field207;

	@ObfuscatedName("client.ob")
	public int field208;

	@ObfuscatedName("client.pb")
	public int field209;

	@ObfuscatedName("client.qb")
	public int field210;

	@ObfuscatedName("client.rb")
	public int field211;

	@ObfuscatedName("client.vb")
	public int field215;

	@ObfuscatedName("client.wb")
	public int field216;

	@ObfuscatedName("client.xb")
	public int field217;

	@ObfuscatedName("client.Ab")
	public int field220;

	@ObfuscatedName("client.Bb")
	public static int field221;

	@ObfuscatedName("client.Eb")
	public int field223;

	@ObfuscatedName("client.Fb")
	public int field224;

	@ObfuscatedName("client.Gb")
	public int field225;

	@ObfuscatedName("client.Hb")
	public int field226;

	@ObfuscatedName("client.Ib")
	public int field227;

	@ObfuscatedName("client.Mb")
	public int field231;

	@ObfuscatedName("client.Nb")
	public int field232;

	@ObfuscatedName("client.Ob")
	public int field233;

	@ObfuscatedName("client.Pb")
	public int field234;

	@ObfuscatedName("client.Sb")
	public int field237;

	@ObfuscatedName("client.Tb")
	public int field238;

	@ObfuscatedName("client.Ub")
	public int field239;

	@ObfuscatedName("client.Vb")
	public int field240;

	@ObfuscatedName("client.Wb")
	public int field241;

	@ObfuscatedName("client.Zb")
	public int field244;

	@ObfuscatedName("client.ac")
	public int field245;

	@ObfuscatedName("client.bc")
	public int field246;

	@ObfuscatedName("client.cc")
	public int field247;

	@ObfuscatedName("client.dc")
	public int field248;

	@ObfuscatedName("client.fc")
	public int field250;

	@ObfuscatedName("client.lc")
	public static int field255;

	@ObfuscatedName("client.nc")
	public int field256;

	@ObfuscatedName("client.Gc")
	public int field273;

	@ObfuscatedName("client.Mc")
	public int field278;

	@ObfuscatedName("client.Uc")
	public int field286;

	@ObfuscatedName("client.Yc")
	public int field289;

	@ObfuscatedName("client.ad")
	public int field290;

	@ObfuscatedName("client.gd")
	public static int field296;

	@ObfuscatedName("client.jd")
	public int field299;

	@ObfuscatedName("client.ld")
	public int field300;

	@ObfuscatedName("client.md")
	public int field301;

	@ObfuscatedName("client.td")
	public int field307;

	@ObfuscatedName("client.ud")
	public int field308;

	@ObfuscatedName("client.Bd")
	public int field314;

	@ObfuscatedName("client.Dd")
	public int field315;

	@ObfuscatedName("client.Gd")
	public int field318;

	@ObfuscatedName("client.Hd")
	public int field319;

	@ObfuscatedName("client.Id")
	public int field320;

	@ObfuscatedName("client.Ld")
	public int field322;

	@ObfuscatedName("client.Pd")
	public int field325;

	@ObfuscatedName("client.Sd")
	public int field328;

	@ObfuscatedName("client.Td")
	public int field329;

	@ObfuscatedName("client.Wd")
	public int field331;

	@ObfuscatedName("client.Zd")
	public int field334;

	@ObfuscatedName("client.fe")
	public int field339;

	@ObfuscatedName("client.ge")
	public int field340;

	@ObfuscatedName("client.he")
	public int field341;

	@ObfuscatedName("client.me")
	public int field346;

	@ObfuscatedName("client.ne")
	public int field347;

	@ObfuscatedName("client.oe")
	public int field348;

	@ObfuscatedName("client.pe")
	public int field349;

	@ObfuscatedName("client.qe")
	public int field350;

	@ObfuscatedName("client.se")
	public int field351;

	@ObfuscatedName("client.te")
	public int field352;

	@ObfuscatedName("client.ue")
	public int field353;

	@ObfuscatedName("client.xe")
	public static int field356;

	@ObfuscatedName("client.ye")
	public int field357;

	@ObfuscatedName("client.ze")
	public int field358;

	@ObfuscatedName("client.Ae")
	public int field359;

	@ObfuscatedName("client.Be")
	public int field360;

	@ObfuscatedName("client.Ce")
	public int field361;

	@ObfuscatedName("client.De")
	public int field362;

	@ObfuscatedName("client.Fe")
	public int field364;

	@ObfuscatedName("client.Ge")
	public int field365;

	@ObfuscatedName("client.Ve")
	public int field379;

	@ObfuscatedName("client.Xe")
	public int field381;

	@ObfuscatedName("client.Ye")
	public int field382;

	@ObfuscatedName("client.af")
	public int field384;

	@ObfuscatedName("client.bf")
	public int field385;

	@ObfuscatedName("client.cf")
	public int field386;

	@ObfuscatedName("client.gf")
	public int field390;

	@ObfuscatedName("client.pf")
	public int field398;

	@ObfuscatedName("client.rf")
	public int field400;

	@ObfuscatedName("client.vf")
	public static int field404;

	@ObfuscatedName("client.zf")
	public int field408;

	@ObfuscatedName("client.Bf")
	public int field410;

	@ObfuscatedName("client.Hf")
	public int field416;

	@ObfuscatedName("client.If")
	public int field417;

	@ObfuscatedName("client.Jf")
	public int field418;

	@ObfuscatedName("client.Kf")
	public int field419;

	@ObfuscatedName("client.Lf")
	public int field420;

	@ObfuscatedName("client.Mf")
	public static int field421;

	@ObfuscatedName("client.Nf")
	public int field422;

	@ObfuscatedName("client.Pf")
	public int field424;

	@ObfuscatedName("client.Qf")
	public int field425;

	@ObfuscatedName("client.Rf")
	public int field426;

	@ObfuscatedName("client.Sf")
	public int field427;

	@ObfuscatedName("client.Uf")
	public int field429;

	@ObfuscatedName("client.Vf")
	public int field430;

	@ObfuscatedName("client.cg")
	public int field436;

	@ObfuscatedName("client.dg")
	public int field437;

	@ObfuscatedName("client.ig")
	public int field441;

	@ObfuscatedName("client.jg")
	public int field442;

	@ObfuscatedName("client.kg")
	public int field443;

	@ObfuscatedName("client.lg")
	public int field444;

	@ObfuscatedName("client.mg")
	public int field445;

	@ObfuscatedName("client.ug")
	public int field452;

	@ObfuscatedName("client.zg")
	public static int field456;

	@ObfuscatedName("client.Fg")
	public int field461;

	@ObfuscatedName("client.Gg")
	public int field462;

	@ObfuscatedName("client.Hg")
	public int field463;

	@ObfuscatedName("client.Ig")
	public int field464;

	@ObfuscatedName("client.Qg")
	public int field471;

	@ObfuscatedName("client.Vg")
	public int field475;

	@ObfuscatedName("client.Yg")
	public int field478;

	@ObfuscatedName("client.ch")
	public int field482;

	@ObfuscatedName("client.gh")
	public int field486;

	@ObfuscatedName("client.ih")
	public int field488;

	@ObfuscatedName("client.qh")
	public int field496;

	@ObfuscatedName("client.sh")
	public int field497;

	@ObfuscatedName("client.wh")
	public static int field501;

	@ObfuscatedName("client.Bh")
	public int field506;

	@ObfuscatedName("client.Ph")
	public int field516;

	@ObfuscatedName("client.Rh")
	public int field518;

	@ObfuscatedName("client.Sh")
	public int field519;

	@ObfuscatedName("client.Th")
	public int field520;

	@ObfuscatedName("client.ei")
	public static int field529;

	@ObfuscatedName("client.gi")
	public int field530;

	@ObfuscatedName("client.ji")
	public int field532;

	@ObfuscatedName("client.ki")
	public int field533;

	@ObfuscatedName("client.li")
	public static int field534;

	@ObfuscatedName("client.mi")
	public int field535;

	@ObfuscatedName("client.ni")
	public int field536;

	@ObfuscatedName("client.Ai")
	public int field546;

	@ObfuscatedName("client.Bi")
	public int field547;

	@ObfuscatedName("client.Di")
	public static int field548;

	@ObfuscatedName("client.Ni")
	public int field556;

	@ObfuscatedName("client.Qi")
	public int field559;

	@ObfuscatedName("client.Si")
	public int field561;

	@ObfuscatedName("client.Wi")
	public int field563;

	@ObfuscatedName("client.Xi")
	public int field564;

	@ObfuscatedName("client.Zi")
	public static int field565;

	@ObfuscatedName("client.dj")
	public int field567;

	@ObfuscatedName("client.fj")
	public int field568;

	@ObfuscatedName("client.gj")
	public int field569;

	@ObfuscatedName("client.hj")
	public int field570;

	@ObfuscatedName("client.mj")
	public int field573;

	@ObfuscatedName("client.nj")
	public int field574;

	@ObfuscatedName("client.pj")
	public int field576;

	@ObfuscatedName("client.rj")
	public static int field578;

	@ObfuscatedName("client.wj")
	public int field582;

	@ObfuscatedName("client.yj")
	public static int field583;

	@ObfuscatedName("client.Aj")
	public int field585;

	@ObfuscatedName("client.Bj")
	public int field586;

	@ObfuscatedName("client.Cj")
	public int field587;

	@ObfuscatedName("client.Pj")
	public int field599;

	@ObfuscatedName("client.gk")
	public int field616;

	@ObfuscatedName("client.hk")
	public int field617;

	@ObfuscatedName("client.oc")
	public long field257;

	@ObfuscatedName("client.Hc")
	public long field274;

	@ObfuscatedName("client.Kc")
	public long field277;

	@ObfuscatedName("client.wd")
	public long field309;

	@ObfuscatedName("client.hh")
	public long field487;

	@ObfuscatedName("client.W")
	public AKBGAGNS field191;

	@ObfuscatedName("client.X")
	public AKBGAGNS field192;

	@ObfuscatedName("client.Y")
	public AKBGAGNS field193;

	@ObfuscatedName("client.Z")
	public AKBGAGNS field194;

	@ObfuscatedName("client.ab")
	public AKBGAGNS field195;

	@ObfuscatedName("client.bb")
	public AKBGAGNS field196;

	@ObfuscatedName("client.cb")
	public AKBGAGNS field197;

	@ObfuscatedName("client.db")
	public AKBGAGNS field198;

	@ObfuscatedName("client.eb")
	public AKBGAGNS field199;

	@ObfuscatedName("client.sb")
	public AKBGAGNS field212;

	@ObfuscatedName("client.tb")
	public AKBGAGNS field213;

	@ObfuscatedName("client.ub")
	public AKBGAGNS field214;

	@ObfuscatedName("client.xd")
	public AKBGAGNS field310;

	@ObfuscatedName("client.yd")
	public AKBGAGNS field311;

	@ObfuscatedName("client.zd")
	public AKBGAGNS field312;

	@ObfuscatedName("client.Ad")
	public AKBGAGNS field313;

	@ObfuscatedName("client.Xj")
	public AKBGAGNS field607;

	@ObfuscatedName("client.Yj")
	public AKBGAGNS field608;

	@ObfuscatedName("client.Zj")
	public AKBGAGNS field609;

	@ObfuscatedName("client.ak")
	public AKBGAGNS field610;

	@ObfuscatedName("client.bk")
	public AKBGAGNS field611;

	@ObfuscatedName("client.ck")
	public AKBGAGNS field612;

	@ObfuscatedName("client.dk")
	public AKBGAGNS field613;

	@ObfuscatedName("client.ek")
	public AKBGAGNS field614;

	@ObfuscatedName("client.fk")
	public AKBGAGNS field615;

	@ObfuscatedName("client.zi")
	public FKXPJREN field545;

	@ObfuscatedName("client.pd")
	public FOFQGQZJ field303;

	@ObfuscatedName("client.sf")
	public JPCEPCNA field401;

	@ObfuscatedName("client.Fd")
	public JUPFHAZZ field317;

	@ObfuscatedName("client.Qe")
	public LICHOWDY field374;

	@ObfuscatedName("client.Re")
	public LICHOWDY field375;

	@ObfuscatedName("client.Se")
	public LICHOWDY field376;

	@ObfuscatedName("client.Te")
	public LICHOWDY field377;

	@ObfuscatedName("client.cd")
	public LOVQYTIZ field292;

	@ObfuscatedName("client.Yd")
	public LOVQYTIZ field333;

	@ObfuscatedName("client.Xg")
	public LOVQYTIZ field477;

	@ObfuscatedName("client.lh")
	public LOVQYTIZ field491;

	@ObfuscatedName("client.mh")
	public LOVQYTIZ field492;

	@ObfuscatedName("client.nh")
	public LOVQYTIZ field493;

	@ObfuscatedName("client.oh")
	public LOVQYTIZ field494;

	@ObfuscatedName("client.ph")
	public LOVQYTIZ field495;

	@ObfuscatedName("client.Eh")
	public LOVQYTIZ field508;

	@ObfuscatedName("client.Fh")
	public LOVQYTIZ field509;

	@ObfuscatedName("client.ci")
	public LOVQYTIZ field527;

	@ObfuscatedName("client.di")
	public LOVQYTIZ field528;

	@ObfuscatedName("client.Gi")
	public LOVQYTIZ field549;

	@ObfuscatedName("client.Hi")
	public LOVQYTIZ field550;

	@ObfuscatedName("client.ik")
	public LOVQYTIZ field618;

	@ObfuscatedName("client.pc")
	public NPZZPPRD field258;

	@ObfuscatedName("client.qc")
	public NPZZPPRD field259;

	@ObfuscatedName("client.rc")
	public NPZZPPRD field260;

	@ObfuscatedName("client.sc")
	public NPZZPPRD field261;

	@ObfuscatedName("client.tc")
	public NPZZPPRD field262;

	@ObfuscatedName("client.Cc")
	public NPZZPPRD field269;

	@ObfuscatedName("client.Dc")
	public NPZZPPRD field270;

	@ObfuscatedName("client.Ec")
	public NPZZPPRD field271;

	@ObfuscatedName("client.Nc")
	public NPZZPPRD field279;

	@ObfuscatedName("client.Oc")
	public NPZZPPRD field280;

	@ObfuscatedName("client.Pc")
	public NPZZPPRD field281;

	@ObfuscatedName("client.Qc")
	public NPZZPPRD field282;

	@ObfuscatedName("client.Rc")
	public NPZZPPRD field283;

	@ObfuscatedName("client.Ff")
	public NPZZPPRD field414;

	@ObfuscatedName("client.Gf")
	public NPZZPPRD field415;

	@ObfuscatedName("client.Xf")
	public NPZZPPRD field431;

	@ObfuscatedName("client.Yf")
	public NPZZPPRD field432;

	@ObfuscatedName("client.Zf")
	public NPZZPPRD field433;

	@ObfuscatedName("client.uj")
	public NPZZPPRD field580;

	@ObfuscatedName("client.vj")
	public NPZZPPRD field581;

	@ObfuscatedName("client.og")
	public PDGRVIXR field446;

	@ObfuscatedName("client.nd")
	public PWLKORWL field302;

	@ObfuscatedName("client.kb")
	public static TINBLEHZ field204;

	@ObfuscatedName("client.Jd")
	public String field321;

	@ObfuscatedName("client.qg")
	public String field448;

	@ObfuscatedName("client.Jg")
	public String field465;

	@ObfuscatedName("client.eh")
	public String field484;

	@ObfuscatedName("client.oj")
	public Socket field575;

	@ObfuscatedName("client.Ze")
	public static boolean field383;

	@ObfuscatedName("client.rg")
	public static boolean field449;

	@ObfuscatedName("client.Ag")
	public static boolean field457;

	@ObfuscatedName("client.yh")
	public static boolean field503;

	@ObfuscatedName("client.ic")
	public int[] field252;

	@ObfuscatedName("client.jc")
	public int[] field253;

	@ObfuscatedName("client.kc")
	public int[] field254;

	@ObfuscatedName("client.hf")
	public int[] field391;

	@ObfuscatedName("client.jf")
	public int[] field392;

	@ObfuscatedName("client.kf")
	public int[] field393;

	@ObfuscatedName("client.lf")
	public int[] field394;

	@ObfuscatedName("client.zh")
	public int[] field504;

	@ObfuscatedName("client.Ah")
	public int[] field505;

	@ObfuscatedName("client.ui")
	public int[] field541;

	@ObfuscatedName("client.vi")
	public int[] field542;

	@ObfuscatedName("client.Sj")
	public int[] field602;

	@ObfuscatedName("client.Tj")
	public int[] field603;

	@ObfuscatedName("client.Uj")
	public int[] field604;

	@ObfuscatedName("client.Vj")
	public int[] field605;

	@ObfuscatedName("client.zc")
	public NPZZPPRD[] field266;

	@ObfuscatedName("client.Xb")
	public byte[][] field242;

	@ObfuscatedName("client.Od")
	public byte[][] field324;

	@ObfuscatedName("client.uh")
	public byte[][][] field499;

	@ObfuscatedName("client.Ee")
	public int[][][] field363;

	@ObfuscatedName("client.a(ILTKPFKOXP;B)V")
	public final void method34(int arg0, TKPFKOXP arg1) {
		field516 = 0;
		field410 = 0;
		method179(arg0, arg1);
		method103(arg1, arg0);
		method160(arg1, arg0);
		method175(arg0, arg1);

		for (int var3 = 0; var3 < field516; var3++) {
			int var4 = field517[var3];
			if (field456 != field407[var4].field25) {
				field407[var4] = null;
			}
		}

		if (arg1.field1382 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1382 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field408; var5++) {
			if (field407[field409[var5]] == null) {
				signlink.reporterror(field387 + " null entry in pl list - pos:" + var5 + " size:" + field408);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method35() {
		int var1 = field376.method382("Choose Option");
		for (int var2 = 0; var2 < field569; var2++) {
			int var3 = field376.method382(field451[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field569 * 15 + 21;
		if (field808 > 4 && field809 > 4 && field808 < 516 && field809 < 338) {
			int var5 = field808 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field809 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field539 = true;
			field244 = 0;
			field245 = var5;
			field246 = var6;
			field247 = var1;
			field248 = field569 * 15 + 22;
		}

		if (field808 > 553 && field809 > 205 && field808 < 743 && field809 < 466) {
			int var7 = field808 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field809 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field539 = true;
			field244 = 1;
			field245 = var7;
			field246 = var8;
			field247 = var1;
			field248 = field569 * 15 + 22;
		}

		if (field808 > 17 && field809 > 357 && field808 < 496 && field809 < 453) {
			int var9 = field808 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field809 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field539 = true;
			field244 = 2;
			field245 = var9;
			field246 = var10;
			field247 = var1;
			field248 = field569 * 15 + 22;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method36() {
		int var1 = field358 * 128 + 64;
		int var2 = field359 * 128 + 64;
		int var3 = method173(var1, field384, var2) - field360;

		if (field179 < var1) {
			field179 += (var1 - field179) * field362 / 1000 + field361;
			if (field179 > var1) {
				field179 = var1;
			}
		}

		if (field179 > var1) {
			field179 -= (field179 - var1) * field362 / 1000 + field361;
			if (field179 < var1) {
				field179 = var1;
			}
		}

		if (field180 < var3) {
			field180 += (var3 - field180) * field362 / 1000 + field361;
			if (field180 > var3) {
				field180 = var3;
			}
		}

		if (field180 > var3) {
			field180 -= (field180 - var3) * field362 / 1000 + field361;
			if (field180 < var3) {
				field180 = var3;
			}
		}

		if (field181 < var2) {
			field181 += (var2 - field181) * field362 / 1000 + field361;
			if (field181 > var2) {
				field181 = var2;
			}
		}

		if (field181 > var2) {
			field181 -= (field181 - var2) * field362 / 1000 + field361;
			if (field181 < var2) {
				field181 = var2;
			}
		}

		int var4 = field416 * 128 + 64;
		int var5 = field417 * 128 + 64;
		int var6 = method173(var4, field384, var5) - field418;
		int var7 = var4 - field179;
		int var8 = var6 - field180;
		int var9 = var5 - field181;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field182 < var11) {
			field182 += (var11 - field182) * field420 / 1000 + field419;
			if (field182 > var11) {
				field182 = var11;
			}
		}

		if (field182 > var11) {
			field182 -= (field182 - var11) * field420 / 1000 + field419;
			if (field182 < var11) {
				field182 = var11;
			}
		}

		int var13 = var12 - field183;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field183 += field420 * var13 / 1000 + field419;
			field183 &= 0x7FF;
		}

		if (var13 < 0) {
			field183 -= -var13 * field420 / 1000 + field419;
			field183 &= 0x7FF;
		}

		int var14 = var12 - field183;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field183 = var12;
		}
	}

	@ObfuscatedName("client.a(IILTKPFKOXP;)V")
	public final void method37(int arg0, TKPFKOXP arg1) {
		field516 = 0;
		field410 = 0;
		method40(arg0, arg1);
		method141(arg0, arg1);
		method91(arg1, arg0);

		for (int var3 = 0; var3 < field516; var3++) {
			int var4 = field517[var3];
			if (field456 != field397[var4].field25) {
				field397[var4].field1510 = null;
				field397[var4] = null;
			}
		}

		if (arg1.field1382 != arg0) {
			signlink.reporterror(field387 + " size mismatch in getnpcpos - pos:" + arg1.field1382 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field398; var5++) {
			if (field397[field399[var5]] == null) {
				signlink.reporterror(field387 + " null entry in npc list - pos:" + var5 + " size:" + field398);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method38() {
		try {
			field372 = -1;
			field435.method513();
			field512.method513();
			GHWCMNQP.method229();
			method172();
			field401.method320();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field265[var1].method570();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field499[var2][var3][var4] = 0;
					}
				}
			}

			BXGEDAMF var5 = new BXGEDAMF(field363, field499, 104, 104);
			int var6 = field324.length;
			field511.method518(122);

			if (!field481) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field252[var7] >> 8) * 64 - field231;
					int var9 = (field252[var7] & 0xFF) * 64 - field232;
					byte[] var10 = field324[var7];
					if (var10 != null) {
						var5.method23((field211 - 6) * 8, var10, var9, var8, (field210 - 6) * 8, field265);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field252[var11] >> 8) * 64 - field231;
					int var13 = (field252[var11] & 0xFF) * 64 - field232;
					byte[] var14 = field324[var11];
					if (var14 == null && field211 < 800) {
						var5.method26(var12, 64, var13, 64);
					}
				}

				field221++;
				if (field221 > 67) {
					field221 = 0;
					field511.method518(9);
				}

				field511.method518(122);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field242[var15];
					if (var16 != null) {
						int var17 = (field252[var15] >> 8) * 64 - field231;
						int var18 = (field252[var15] & 0xFF) * 64 - field232;
						var5.method32(var16, field265, var17, field401, var18);
					}
				}
			}

			if (field481) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field264[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field252.length; var29++) {
									if (field252[var29] == var28 && field324[var29] != null) {
										var5.method31(var21 * 8, var25, var24, field324[var29], var20 * 8, (var27 & 0x7) * 8, (var26 & 0x7) * 8, field265, var19);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method33(var21 * 8, var19, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field264[0][var30][var31];
						if (var32 == -1) {
							var5.method26(var30 * 8, 8, var31 * 8, 8);
						}
					}
				}

				field511.method518(122);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field264[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field252.length; var42++) {
									if (field252[var42] == var41 && field242[var42] != null) {
										var5.method24((var39 & 0x7) * 8, field401, var35 * 8, var37, var34 * 8, (var40 & 0x7) * 8, var38, field265, var33, field242[var42]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field511.method518(122);
			var5.method21(field265, field401);

			if (field312 != null) {
				field312.method1();
				GHWCMNQP.field751 = field393;
			}

			field511.method518(122);
			int var43 = BXGEDAMF.field103;
			if (var43 > field384) {
				var43 = field384;
			}

			if (var43 < field384 - 1) {
				int var44 = field384 - 1;
			}

			if (field503) {
				field401.method321(BXGEDAMF.field103);
			} else {
				field401.method321(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method152(var45, var46);
				}
			}

			method106();
		} catch (Exception var59) {
		}

		SOLNFIIQ.field1310.method415();

		if (field796 != null) {
			field511.method518(159);
			field511.method523(1057001181);
		}

		if (field503 && signlink.cache_dat != null) {
			int var48 = field303.method221(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field303.method212(var49);
				if ((var50 & 0x79) == 0) {
					OGORHYVW.method432(var49);
				}
			}
		}

		System.gc();
		GHWCMNQP.method230(20);
		field303.method220();
		int var51 = (field210 - 6) / 8 - 1;
		int var52 = (field210 + 6) / 8 + 1;
		int var53 = (field211 - 6) / 8 - 1;
		int var54 = (field211 + 6) / 8 + 1;
		if (field597) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field303.method217(0, var56, var55);
					if (var57 != -1) {
						field303.method215(3, var57);
					}

					int var58 = field303.method217(1, var56, var55);
					if (var58 != -1) {
						field303.method215(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method39(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field229 = "";
				field230 = "Connecting to server...";
				method162(true);
			}

			field302 = new PWLKORWL(this, method120(field501 + 43594));
			long var4 = DQKGVELR.method182(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field511.field1382 = 0;
			field511.method519(14);
			field511.method519(var6);
			field302.method472(field511.field1381, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field302.method469();
			}

			int var8 = field302.method469();
			int var9 = var8;

			if (var8 == 0) {
				field302.method471(field272.field1381, 0, 8);
				field272.field1382 = 0;
				field274 = field272.method535();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field274 >> 32), (int) field274 };
				field511.field1382 = 0;
				field511.method519(10);
				field511.method523(var10[0]);
				field511.method523(var10[1]);
				field511.method523(var10[2]);
				field511.method523(var10[3]);
				field511.method523(signlink.uid);
				field511.method526(arg0);
				field511.method526(arg1);
				field511.method544(field428, field235);
				field540.field1382 = 0;

				if (arg2) {
					field540.method519(18);
				} else {
					field540.method519(16);
				}

				field540.method519(field511.field1382 + 36 + 1 + 1 + 2);
				field540.method519(255);
				field540.method520(366);
				field540.method519(field503 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field540.method523(field373[var11]);
				}

				field540.method527(0, field511.field1381, field511.field1382);
				field511.field1386 = new FKXPJREN(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field545 = new FKXPJREN(var10);
				field302.method472(field540.field1381, field540.field1382, 0);
				var8 = field302.method469();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method39(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field563 = field302.method469();
				field383 = field302.method469() == 1;
				field487 = 0L;
				field430 = 0;
				field446.field1191 = 0;
				field798 = true;
				field219 = true;
				field395 = true;
				field511.field1382 = 0;
				field272.field1382 = 0;
				field224 = -1;
				field518 = -1;
				field519 = -1;
				field520 = -1;
				field223 = 0;
				field225 = 0;
				field339 = 0;
				field227 = 0;
				field357 = 0;
				field569 = 0;
				field539 = false;
				field799 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field338[var13] = null;
				}

				field461 = 0;
				field318 = 0;
				field256 = 0;
				field331 = 0;
				field475 = (int) (Math.random() * 100.0D) - 50;
				field315 = (int) (Math.random() * 110.0D) - 55;
				field379 = (int) (Math.random() * 80.0D) - 40;
				field599 = (int) (Math.random() * 120.0D) - 60;
				field452 = (int) (Math.random() * 30.0D) - 20;
				field346 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field220 = 0;
				field372 = -1;
				field616 = 0;
				field617 = 0;
				field408 = 0;
				field398 = 0;

				for (int var14 = 0; var14 < field405; var14++) {
					field407[var14] = null;
					field412[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field397[var15] = null;
				}

				field204 = field407[field406] = new TINBLEHZ();
				field512.method513();
				field435.method513();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field543[var16][var17][var18] = null;
						}
					}
				}

				field369 = new SXQMCHPP();
				field386 = 0;
				field385 = 0;
				method157(field606);
				field606 = -1;
				method157(field434);
				field434 = -1;
				method157(field370);
				field370 = -1;
				method157(field243);
				field243 = -1;
				method157(field288);
				field288 = -1;
				method157(field413);
				field413 = -1;
				method157(field577);
				field577 = -1;
				field298 = false;
				field275 = 3;
				field506 = 0;
				field539 = false;
				field560 = false;
				field484 = null;
				field382 = 0;
				field521 = -1;
				field485 = true;
				method46();

				for (int var19 = 0; var19 < 5; var19++) {
					field330[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field473[var20] = null;
					field474[var20] = false;
				}

				field356 = 0;
				field583 = 0;
				field421 = 0;
				field529 = 0;
				field548 = 0;
				field255 = 0;
				method143();
			} else if (var8 == 3) {
				field229 = "";
				field230 = "Invalid username or password.";
			} else if (var8 == 4) {
				field229 = "Your account has been disabled.";
				field230 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field229 = "Your account is already logged in.";
				field230 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field229 = "RuneScape has been updated!";
				field230 = "Please reload this page.";
			} else if (var8 == 7) {
				field229 = "This world is full.";
				field230 = "Please use a different world.";
			} else if (var8 == 8) {
				field229 = "Unable to connect.";
				field230 = "Login server offline.";
			} else if (var8 == 9) {
				field229 = "Login limit exceeded.";
				field230 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field229 = "Unable to connect.";
				field230 = "Bad session id.";
			} else if (var8 == 12) {
				field229 = "You need a members account to login to this world.";
				field230 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field229 = "Could not complete login.";
				field230 = "Please try using a different world.";
			} else if (var8 == 14) {
				field229 = "The server is being updated.";
				field230 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field395 = true;
				field511.field1382 = 0;
				field272.field1382 = 0;
				field224 = -1;
				field518 = -1;
				field519 = -1;
				field520 = -1;
				field223 = 0;
				field225 = 0;
				field339 = 0;
				field569 = 0;
				field539 = false;
				field277 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field229 = "Login attempts exceeded.";
				field230 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field229 = "You are standing in a members-only area.";
				field230 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field229 = "Invalid loginserver requested";
				field230 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field302.method469();
				for (var21 += 3; var21 >= 0; var21--) {
					field229 = "You have only just left another world";
					field230 = "Your profile will be transferred in: " + var21;
					method162(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method39(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field229 = "Malformed login packet.";
				field230 = "Please try again.";
			} else if (var8 == 23) {
				field229 = "No reply from loginserver.";
				field230 = "Please try again.";
			} else if (var8 == 24) {
				field229 = "Error loading your profile.";
				field230 = "Please contact customer support.";
			} else if (var8 == 25) {
				field229 = "Unexpected loginserver response.";
				field230 = "Please try using a different world.";
			} else if (var8 == 26) {
				field229 = "This computers address has been blocked";
				field230 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field229 = "Unexpected server response";
				field230 = "Please try using a different world.";
			} else if (var9 != 0) {
				field229 = "No response from server";
				field230 = "Please try using a different world.";
			} else if (field532 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field532++;
				method39(arg0, arg1, arg2);
			} else {
				field229 = "No response from loginserver";
				field230 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field229 = "";
			field230 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILTKPFKOXP;I)V")
	public final void method40(int arg0, TKPFKOXP arg1) {
		arg1.method539();
		int var3 = arg1.method540(8);
		if (var3 < field398) {
			for (int var4 = var3; var4 < field398; var4++) {
				field517[field516++] = field399[var4];
			}
		}

		if (var3 > field398) {
			signlink.reporterror(field387 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field398 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field399[var5];
			ZHNLOFBM var7 = field397[var6];
			int var8 = arg1.method540(1);
			if (var8 == 0) {
				field399[field398++] = var6;
				var7.field25 = field456;
			} else {
				int var9 = arg1.method540(2);
				if (var9 == 0) {
					field399[field398++] = var6;
					var7.field25 = field456;
					field411[field410++] = var6;
				} else if (var9 == 1) {
					field399[field398++] = var6;
					var7.field25 = field456;
					int var10 = arg1.method540(3);
					var7.method9(var10, false);
					int var11 = arg1.method540(1);
					if (var11 == 1) {
						field411[field410++] = var6;
					}
				} else if (var9 == 2) {
					field399[field398++] = var6;
					var7.field25 = field456;
					int var12 = arg1.method540(3);
					var7.method9(var12, true);
					int var13 = arg1.method540(3);
					var7.method9(var13, true);
					int var14 = arg1.method540(1);
					if (var14 == 1) {
						field411[field410++] = var6;
					}
				} else if (var9 == 3) {
					field517[field516++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;ILjava/lang/String;I)LJUPFHAZZ;")
	public final JUPFHAZZ method41(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field203[0] != null) {
				var6 = field203[0].method601(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field305.reset();
			field305.update(var6);
			int var8 = (int) field305.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new JUPFHAZZ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method118(arg2, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method153(arg1 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				TKPFKOXP var16 = new TKPFKOXP(var15);
				var16.field1382 = 3;
				int var17 = var16.method533() + 6;
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
						method118(arg2, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field203[0] != null) {
						field203[0].method602(var6, var6.length, arg0);
					}
				} catch (Exception var28) {
					field203[0] = null;
				}

				if (var6 != null) {
					field305.reset();
					field305.update(var6);
					int var23 = (int) field305.getValue();
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
						method118(arg2, "Game updated - please reload page");
						var25 = 10;
					} else {
						method118(arg2, var11 + " - Retrying in " + var25);
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

				field552 = !field552;
			}
		}

		return new JUPFHAZZ(var6);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method42(long arg0) {
		if (arg0 != 0L) {
			if (field482 >= 100) {
				method111("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = DQKGVELR.method186(DQKGVELR.method183(arg0));
				for (int var4 = 0; var4 < field482; var4++) {
					if (field450[var4] == arg0) {
						method111(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field385; var5++) {
					if (field523[var5] == arg0) {
						method111("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field450[field482++] = arg0;
				field344 = true;
				field511.method518(74);
				field511.method525(arg0);
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
			if (field503 && field384 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field401.method346(arg4, arg5, arg3);
			}

			if (arg6 == 1) {
				var8 = field401.method347(arg3, arg4, arg5);
			}

			if (arg6 == 2) {
				var8 = field401.method348(arg4, arg5, arg3);
			}

			if (arg6 == 3) {
				var8 = field401.method349(arg4, arg5, arg3);
			}

			if (var8 != 0) {
				int var12 = field401.method350(arg4, arg5, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field401.method337(arg3, arg5, arg4);
					SOLNFIIQ var16 = SOLNFIIQ.method499(var13);
					if (var16.field1314) {
						field265[arg4].method575(arg3, var14, arg5, var15, var16.field1319);
					}
				}

				if (arg6 == 1) {
					field401.method338(arg4, arg5, arg3);
				}

				if (arg6 == 2) {
					field401.method339(arg3, arg5, arg4);
					SOLNFIIQ var17 = SOLNFIIQ.method499(var13);
					if (var17.field1284 + arg5 > 103 || var17.field1284 + arg3 > 103 || var17.field1326 + arg5 > 103 || var17.field1326 + arg3 > 103) {
						return;
					}

					if (var17.field1314) {
						field265[arg4].method576(var17.field1326, arg5, var17.field1284, var15, arg3, var17.field1319);
					}
				}

				if (arg6 == 3) {
					field401.method340(arg5, arg4, arg3);
					SOLNFIIQ var18 = SOLNFIIQ.method499(var13);
					if (var18.field1314 && var18.field1322) {
						field265[arg4].method578(arg3, arg5);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field499[1][arg5][arg3] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				BXGEDAMF.method29(field363, field265[arg4], arg3, arg1, arg4, field401, arg5, var19, arg2, arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZ[B)V")
	public final void method44(boolean arg0, byte[] arg1) {
		if (field531) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method45() {
		if (field576 == 0) {
			int var1 = field791 / 2 - 80;
			int var2 = field792 / 2 + 20;
			var2 += 20;
			if (field807 == 1 && field808 >= var1 - 75 && field808 <= var1 + 75 && field809 >= var2 - 20 && field809 <= var2 + 20) {
				field576 = 3;
				field322 = 0;
			}

			int var3 = field791 / 2 + 80;
			if (field807 == 1 && field808 >= var3 - 75 && field808 <= var3 + 75 && field809 >= var2 - 20 && field809 <= var2 + 20) {
				field229 = "";
				field230 = "Enter your username & password.";
				field576 = 2;
				field322 = 0;
			}
		} else if (field576 == 2) {
			int var4 = field792 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field807 == 1 && field809 >= var4 - 15 && field809 < var4) {
				field322 = 0;
			}

			var4 += 15;
			if (field807 == 1 && field809 >= var4 - 15 && field809 < var4) {
				field322 = 1;
			}

			var4 += 15;
			int var5 = field791 / 2 - 80;
			int var6 = field792 / 2 + 50;
			var6 += 20;
			if (field807 == 1 && field808 >= var5 - 75 && field808 <= var5 + 75 && field809 >= var6 - 20 && field809 <= var6 + 20) {
				field532 = 0;
				method39(field387, field388, false);

				if (field395) {
					return;
				}
			}

			int var7 = field791 / 2 + 80;
			if (field807 == 1 && field808 >= var7 - 75 && field808 <= var7 + 75 && field809 >= var6 - 20 && field809 <= var6 + 20) {
				field576 = 0;
				field387 = "";
				field388 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method250();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field455.length(); var10++) {
					if (var8 == field455.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field322 == 0) {
					if (var8 == 8 && field387.length() > 0) {
						field387 = field387.substring(0, field387.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field322 = 1;
					}

					if (var9) {
						field387 = field387 + (char) var8;
					}

					if (field387.length() > 12) {
						field387 = field387.substring(0, 12);
					}
				} else if (field322 == 1) {
					if (var8 == 8 && field388.length() > 0) {
						field388 = field388.substring(0, field388.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field322 = 0;
					}

					if (var9) {
						field388 = field388 + (char) var8;
					}

					if (field388.length() > 20) {
						field388 = field388.substring(0, 20);
					}
				}
			}
		} else if (field576 == 3) {
			int var11 = field791 / 2;
			int var12 = field792 / 2 + 50;
			var12 += 20;
			if (field807 == 1 && field808 >= var11 - 75 && field808 <= var11 + 75 && field809 >= var12 - 20 && field809 <= var12 + 20) {
				field576 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method46() {
		field551 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field304[var1] = -1;
			for (int var2 = 0; var2 < NTHXISGN.field1095; var2++) {
				if (!NTHXISGN.field1096[var2].field1102 && NTHXISGN.field1096[var2].field1097 == var1 + (field485 ? 0 : 7)) {
					field304[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method47() {
		field310.method1();
		GHWCMNQP.field751 = field392;
		field431.method421(0, 0);

		if (field413 != -1) {
			method80(0, 0, 0, IJNDWVIL.method311(field413));
		} else if (field297[field275] != -1) {
			method80(0, 0, 0, IJNDWVIL.method311(field297[field275]));
		}

		if (field539 && field244 == 1) {
			method50();
		}

		field310.method2(205, 553, field793);
		field312.method1();
		GHWCMNQP.field751 = field393;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method48() {
		for (KTKZBCIU var1 = (KTKZBCIU) field512.method509(); var1 != null; var1 = (KTKZBCIU) field512.method511()) {
			if (field384 != var1.field1022 || field456 > var1.field1020) {
				var1.method588();
			} else if (field456 >= var1.field1019) {
				if (var1.field1038 > 0) {
					ZHNLOFBM var2 = field397[var1.field1038 - 1];
					if (var2 != null && var2.field26 >= 0 && var2.field26 < 13312 && var2.field27 >= 0 && var2.field27 < 13312) {
						var1.method377(var2.field27, method173(var2.field26, var1.field1022, var2.field27) - var1.field1026, var2.field26, field456);
					}
				}

				if (var1.field1038 < 0) {
					int var3 = -var1.field1038 - 1;
					TINBLEHZ var4;
					if (field466 == var3) {
						var4 = field204;
					} else {
						var4 = field407[var3];
					}

					if (var4 != null && var4.field26 >= 0 && var4.field26 < 13312 && var4.field27 >= 0 && var4.field27 < 13312) {
						var1.method377(var4.field27, method173(var4.field26, var1.field1022, var4.field27) - var1.field1026, var4.field26, field456);
					}
				}

				var1.method378(field299);
				field401.method331((int) var1.field1034, (int) var1.field1035, var1.field1040, (int) var1.field1033, field384, 60, -1, false, var1);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIBIIIIZ)Z")
	public final boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field371[var14][var15] = 0;
				field332[var14][var15] = 99999999;
			}
		}

		int var16 = arg3;
		int var17 = arg2;
		field371[arg3][arg2] = 99;
		field332[arg3][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field459[var18] = arg3;
		int var39 = var18 + 1;
		field460[var18] = arg2;
		boolean var20 = false;
		int var21 = field459.length;
		int[][] var22 = field265[field384].field1415;
		while (var39 != var19) {
			var16 = field459[var19];
			var17 = field460[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && field265[field384].method579(arg7, arg5, arg4, var16, var17, arg6 - 1)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && field265[field384].method580(arg7, var16, var17, arg6 - 1, arg5, arg4)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg9 != 0 && field265[field384].method581(arg1, var17, arg9, var16, arg5, arg0, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field332[var16][var17] + 1;
			if (var16 > 0 && field371[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field459[var39] = var16 - 1;
				field460[var39] = var17;
				var39 = (var39 + 1) % var21;
				field371[var16 - 1][var17] = 2;
				field332[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field371[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field459[var39] = var16 + 1;
				field460[var39] = var17;
				var39 = (var39 + 1) % var21;
				field371[var16 + 1][var17] = 8;
				field332[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field371[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field459[var39] = var16;
				field460[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field371[var16][var17 - 1] = 1;
				field332[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field371[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field459[var39] = var16;
				field460[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field371[var16][var17 + 1] = 4;
				field332[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field371[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field459[var39] = var16 - 1;
				field460[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field371[var16 - 1][var17 - 1] = 3;
				field332[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field371[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field459[var39] = var16 + 1;
				field460[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field371[var16 + 1][var17 - 1] = 9;
				field332[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field371[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field459[var39] = var16 - 1;
				field460[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field371[var16 - 1][var17 + 1] = 6;
				field332[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field371[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field459[var39] = var16 + 1;
				field460[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field371[var16 + 1][var17 + 1] = 12;
				field332[var16 + 1][var17 + 1] = var23;
			}
		}

		field535 = 0;
		if (!var20) {
			if (!arg10) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg5 - var26; var27 <= arg5 + var26; var27++) {
				for (int var28 = arg7 - var26; var28 <= arg7 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field332[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg5) {
							var29 = arg5 - var27;
						} else if (var27 > arg0 + arg5 - 1) {
							var29 = var27 + 1 - arg0 - arg5;
						}

						int var30 = 0;
						if (var28 < arg7) {
							var30 = arg7 - var28;
						} else if (var28 > arg7 + arg9 - 1) {
							var30 = var28 + 1 - arg7 - arg9;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field332[var27][var28] < var25) {
							var24 = var31;
							var25 = field332[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg3 == var16 && arg2 == var17) {
				return false;
			}

			field535 = 1;
		}

		byte var32 = 0;
		field459[var32] = var16;
		int var40 = var32 + 1;
		field460[var32] = var17;
		int var33;
		int var34 = var33 = field371[var16][var17];
		while (arg3 != var16 || arg2 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field459[var40] = var16;
				field460[var40++] = var17;
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

			var34 = field371[var16][var17];
		}

		if (var40 <= 0) {
			if (arg8 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field459[var40];
		int var37 = field460[var40];
		field529 += var35;
		if (field529 >= 142) {
			field511.method518(161);
			field529 = 0;
		}

		if (arg8 == 0) {
			field511.method518(64);
			field511.method519(var35 + var35 + 3);
		}

		if (arg8 == 1) {
			field511.method518(177);
			field511.method519(var35 + var35 + 3 + 14);
		}

		if (arg8 == 2) {
			field511.method518(181);
			field511.method519(var35 + var35 + 3);
		}

		field511.method554(field231 + var36);
		field511.method554(field232 + var37);
		field616 = field459[0];
		field617 = field460[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field511.method546(field459[var40] - var36);
			field511.method545(field460[var40] - var37);
		}

		field511.method546(field811[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method50() {
		int var1 = field245;
		int var2 = field246;
		int var3 = field247;
		int var4 = field248;
		int var5 = 0x5D5447;
		IBBQNXJX.method256(var1, var3, var2, var5, var4);
		IBBQNXJX.method256(var1 + 1, var3 - 2, var2 + 1, 0, 16);
		IBBQNXJX.method257(var1 + 1, var2 + 18, var4 - 19, var3 - 2, 0);
		field376.method384("Choose Option", var2 + 14, var1 + 3, var5);
		int var6 = field801;
		int var7 = field802;
		if (field244 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field244 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field244 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field569; var8++) {
			int var9 = (field569 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field376.method388(var1 + 3, var9, var10, true, field451[var8]);
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method51() {
		field287 = true;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method52() {
		field313.method1();
		GHWCMNQP.field751 = field391;
		field433.method421(0, 0);

		if (field560) {
			field376.method380(field510, 239, 40, 0);
			field376.method380(field554 + "*", 239, 60, 128);
		} else if (field506 == 1) {
			field376.method380("Enter amount:", 239, 40, 0);
			field376.method380(field572 + "*", 239, 60, 128);
		} else if (field506 == 2) {
			field376.method380("Enter name:", 239, 40, 0);
			field376.method380(field572 + "*", 239, 60, 128);
		} else if (field506 == 3) {
			if (field572 != field555) {
				method146(field572);
				field555 = field572;
			}

			LICHOWDY var1 = field375;
			IBBQNXJX.method253(0, 0, 463, 77);

			for (int var2 = 0; var2 < field556; var2++) {
				int var3 = var2 * 14 + 18 - field559;
				if (var3 > 0 && var3 < 110) {
					var1.method380(field557[var2], 239, var3, 0);
				}
			}

			IBBQNXJX.method252();

			if (field556 > 5) {
				method105(77, field559, field556 * 14 + 7, 0, 463);
			}

			if (field572.length() == 0) {
				field376.method380("Enter object name", 239, 40, 255);
			} else if (field556 == 0) {
				field376.method380("No matching objects found, please shorten search", 239, 40, 0);
			}

			var1.method380(field572 + "*", 239, 90, 0);
			IBBQNXJX.method259(479, 0, 77, 0);
		} else if (field484 != null) {
			field376.method380(field484, 239, 40, 0);
			field376.method380("Click to continue", 239, 60, 128);
		} else if (field434 != -1) {
			method80(0, 0, 0, IJNDWVIL.method311(field434));
		} else if (field606 == -1) {
			LICHOWDY var4 = field375;
			int var5 = 0;
			IBBQNXJX.method253(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field338[var6] != null) {
					int var7 = field336[var6];
					int var8 = field497 + 70 - var5 * 14;
					String var9 = field337[var6];
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
							var4.method384(field338[var6], var8, 4, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field536 == 0 || field536 == 1 && method110(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field378[0].method421(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field378[1].method421(var8 - 12, var11);
								var11 += 14;
							}

							var4.method384(var9 + ":", var8, var11, 0);
							var11 += var4.method382(var9) + 8;
							var4.method384(field338[var6], var8, var11, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field340 == 0 && (var7 == 7 || field334 == 0 || field334 == 1 && method110(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method384("From", var8, var12, 0);
							int var14 = var12 + var4.method382("From ");
							if (var10 == 1) {
								field378[0].method421(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field378[1].method421(var8 - 12, var14);
								var14 += 14;
							}

							var4.method384(var9 + ":", var8, var14, 0);
							var14 += var4.method382(var9) + 8;
							var4.method384(field338[var6], var8, var14, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field496 == 0 || field496 == 1 && method110(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method384(var9 + " " + field338[var6], var8, 4, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field340 == 0 && field334 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method384(field338[var6], var8, 4, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field340 == 0 && field334 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method384("To " + var9 + ":", var8, 4, 0);
							var4.method384(field338[var6], var8, var4.method382("To " + var9) + 12, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field496 == 0 || field496 == 1 && method110(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method384(var9 + " " + field338[var6], var8, 4, 0x7E3200);
						}

						var5++;
					}
				}
			}

			IBBQNXJX.method252();
			field323 = var5 * 14 + 7;
			if (field323 < 78) {
				field323 = 78;
			}

			method105(77, field323 - field497 - 77, field323, 0, 463);
			String var13;
			if (field204 == null || field204.field1380 == null) {
				var13 = DQKGVELR.method186(field387);
			} else {
				var13 = field204.field1380;
			}

			var4.method384(var13 + ":", 90, 4, 0);
			var4.method384(field468 + "*", 90, var4.method382(var13 + ": ") + 6, 255);
			IBBQNXJX.method259(479, 0, 77, 0);
		} else {
			method80(0, 0, 0, IJNDWVIL.method311(field606));
		}

		if (field539 && field244 == 2) {
			method50();
		}

		field313.method2(357, 17, field793);
		field312.method1();
		GHWCMNQP.field751 = field393;
	}

	@ObfuscatedName("client.a(ZLLOVQYTIZ;II)V")
	public final void method53(LOVQYTIZ arg0, int arg1, int arg2) {
		if (arg0 != null) {
			int var4 = field599 + field346 & 0x7FF;
			int var5 = arg1 * arg1 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = OGORHYVW.field1171[var4];
				int var7 = OGORHYVW.field1172[var4];
				var6 = var6 * 256 / (field452 + 256);
				var7 = var7 * 256 / (field452 + 256);
				int var8 = arg1 * var7 + arg2 * var6 >> 16;
				int var9 = arg2 * var7 - arg1 * var6 >> 16;
				if (var5 > 2500) {
					arg0.method406(field432, 83 - var9 - arg0.field1058 / 2 - 4, var8 + 94 - arg0.field1057 / 2 + 4);
				} else {
					arg0.method400(83 - var9 - arg0.field1058 / 2 - 4, var8 + 94 - arg0.field1057 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(LTINBLEHZ;IIII)V")
	public final void method54(TINBLEHZ arg0, int arg1, int arg2, int arg3) {
		if (field204 != arg0 && field569 < 400) {
			String var5;
			if (arg0.field1368 == 0) {
				var5 = arg0.field1380 + method125(arg0.field1374, field204.field1374) + " (level-" + arg0.field1374 + ")";
			} else {
				var5 = arg0.field1380 + " (skill-" + arg0.field1368 + ")";
			}

			if (field461 == 1) {
				field451[field569] = "Use " + field465 + " with @whi@" + var5;
				field186[field569] = 8;
				field187[field569] = arg2;
				field184[field569] = arg1;
				field185[field569] = arg3;
				field569++;
			} else if (field318 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field473[var6] != null) {
						field451[field569] = field473[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field473[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1374 > field204.field1374) {
								var7 = 2000;
							}

							if (field204.field1363 != 0 && arg0.field1363 != 0) {
								if (field204.field1363 == arg0.field1363) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field474[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field186[field569] = var7 + 246;
						}

						if (var6 == 1) {
							field186[field569] = var7 + 147;
						}

						if (var6 == 2) {
							field186[field569] = var7 + 389;
						}

						if (var6 == 3) {
							field186[field569] = var7 + 51;
						}

						if (var6 == 4) {
							field186[field569] = var7 + 178;
						}

						field187[field569] = arg2;
						field184[field569] = arg1;
						field185[field569] = arg3;
						field569++;
					}
				}
			} else if ((field320 & 0x8) == 8) {
				field451[field569] = field321 + " @whi@" + var5;
				field186[field569] = 493;
				field187[field569] = arg2;
				field184[field569] = arg1;
				field185[field569] = arg3;
				field569++;
			}

			for (int var8 = 0; var8 < field569; var8++) {
				if (field186[var8] == 113) {
					field451[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method55() {
		field587 = 0;
		for (int var1 = -1; var1 < field408 + field398; var1++) {
			AQPBLKMD var2;
			if (var1 == -1) {
				var2 = field204;
			} else if (var1 < field408) {
				var2 = field407[field409[var1]];
			} else {
				var2 = field397[field399[var1 - field408]];
			}

			if (var2 != null && var2.method8()) {
				if (var2 instanceof ZHNLOFBM) {
					YXSRFNQD var3 = ((ZHNLOFBM) var2).field1510;
					if (var3.field1481 != null) {
						var3 = var3.method593();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field408) {
					YXSRFNQD var6 = ((ZHNLOFBM) var2).field1510;
					if (var6.field1478 >= 0 && var6.field1478 < field306.length) {
						method170(var2, var2.field51 + 15);

						if (field402 > -1) {
							field306[var6.field1478].method400(field403 - 30, field402 - 12);
						}
					}

					if (field357 == 1 && field399[var1 - field408] == field568 && field456 % 20 < 10) {
						method170(var2, var2.field51 + 15);

						if (field402 > -1) {
							field249[0].method400(field403 - 28, field402 - 12);
						}
					}
				} else {
					int var4 = 30;
					TINBLEHZ var5 = (TINBLEHZ) var2;
					if (var5.field1378 != -1 || var5.field1376 != -1) {
						method170(var2, var2.field51 + 15);

						if (field402 > -1) {
							if (var5.field1378 != -1) {
								field190[var5.field1378].method400(field403 - var4, field402 - 12);
								var4 += 25;
							}

							if (var5.field1376 != -1) {
								field306[var5.field1376].method400(field403 - var4, field402 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field357 == 10 && field409[var1] == field217) {
						method170(var2, var2.field51 + 15);

						if (field402 > -1) {
							field249[1].method400(field403 - var4, field402 - 12);
						}
					}
				}

				if (var2.field38 != null && (var1 >= field408 || field536 == 0 || field536 == 3 || field536 == 1 && method110(((TINBLEHZ) var2).field1380))) {
					method170(var2, var2.field51);

					if (field402 > -1 && field587 < field588) {
						field592[field587] = field376.method383(var2.field38) / 2;
						field591[field587] = field376.field1048;
						field589[field587] = field402;
						field590[field587] = field403;
						field593[field587] = var2.field41;
						field594[field587] = var2.field37;
						field595[field587] = var2.field40;
						field596[field587++] = var2.field38;

						if (field301 == 0 && var2.field37 >= 1 && var2.field37 <= 3) {
							field591[field587] += 10;
							field590[field587] += 5;
						}

						if (field301 == 0 && var2.field37 == 4) {
							field592[field587] = 60;
						}

						if (field301 == 0 && var2.field37 == 5) {
							field591[field587] += 5;
						}
					}
				}

				if (var2.field31 > field456) {
					method170(var2, var2.field51 + 15);

					if (field402 > -1) {
						int var7 = var2.field32 * 30 / var2.field33;
						if (var7 > 30) {
							var7 = 30;
						}

						IBBQNXJX.method256(field402 - 15, var7, field403 - 3, 0xFF00, 5);
						IBBQNXJX.method256(field402 + var7 - 15, 30 - var7, field403 - 3, 0xFF0000, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field56[var8] > field456) {
						method170(var2, var2.field51 / 2);

						if (field402 > -1) {
							if (var8 == 1) {
								field403 -= 20;
							}

							if (var8 == 2) {
								field402 -= 15;
								field403 -= 10;
							}

							if (var8 == 3) {
								field402 += 15;
								field403 -= 10;
							}

							field553[var2.field55[var8]].method400(field403 - 12, field402 - 12);
							field374.method380(String.valueOf(var2.field54[var8]), field402, field403 + 4, 0);
							field374.method380(String.valueOf(var2.field54[var8]), field402 - 1, field403 + 3, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field587; var9++) {
			int var10 = field589[var9];
			int var11 = field590[var9];
			int var12 = field592[var9];
			int var13 = field591[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field590[var15] - field591[var15] && var11 - var13 < field590[var15] + 2 && var10 - var12 < field592[var15] + field589[var15] && var10 + var12 > field589[var15] - field592[var15] && field590[var15] - field591[var15] < var11) {
						var11 = field590[var15] - field591[var15];
						var14 = true;
					}
				}
			}

			field402 = field589[var9];
			field403 = field590[var9] = var11;
			String var16 = field596[var9];
			if (field301 == 0) {
				int var17 = 0xFFFF00;
				if (field593[var9] < 6) {
					var17 = field513[field593[var9]];
				}

				if (field593[var9] == 6) {
					var17 = field364 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field593[var9] == 7) {
					var17 = field364 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field593[var9] == 8) {
					var17 = field364 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field593[var9] == 9) {
					int var18 = 150 - field595[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field593[var9] == 10) {
					int var19 = 150 - field595[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field593[var9] == 11) {
					int var20 = 150 - field595[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field594[var9] == 0) {
					field376.method380(var16, field402, field403 + 1, 0);
					field376.method380(var16, field402, field403, var17);
				}

				if (field594[var9] == 1) {
					field376.method385(field403 + 1, field364, 0, field402, var16);
					field376.method385(field403, field364, var17, field402, var16);
				}

				if (field594[var9] == 2) {
					field376.method386(field364, field403 + 1, field402, 0, var16);
					field376.method386(field364, field403, field402, var17, var16);
				}

				if (field594[var9] == 3) {
					field376.method387(0, field364, var16, field402, field403 + 1, 150 - field595[var9]);
					field376.method387(var17, field364, var16, field402, field403, 150 - field595[var9]);
				}

				if (field594[var9] == 4) {
					int var21 = field376.method383(var16);
					int var22 = (150 - field595[var9]) * (var21 + 100) / 150;
					IBBQNXJX.method253(0, field402 - 50, field402 + 50, 334);
					field376.method384(var16, field403 + 1, field402 + 50 - var22, 0);
					field376.method384(var16, field403, field402 + 50 - var22, var17);
					IBBQNXJX.method252();
				}

				if (field594[var9] == 5) {
					int var23 = 150 - field595[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					IBBQNXJX.method253(field403 - field376.field1048 - 1, 0, 512, field403 + 5);
					field376.method380(var16, field402, field403 + var24 + 1, 0);
					field376.method380(var16, field402, field403 + var24, var17);
					IBBQNXJX.method252();
				}
			} else {
				field376.method380(var16, field402, field403 + 1, 0);
				field376.method380(var16, field402, field403, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method56(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method57() {
		for (AMMGDAXD var1 = (AMMGDAXD) field435.method509(); var1 != null; var1 = (AMMGDAXD) field435.method511()) {
			if (field384 != var1.field8 || var1.field7) {
				var1.method588();
			} else if (field456 >= var1.field12) {
				var1.method4(field299);

				if (var1.field7) {
					var1.method588();
				} else {
					field401.method331(var1.field10, var1.field11, 0, var1.field9, var1.field8, 60, -1, false, var1);
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method58() {
		if (field227 > 0) {
			method137();
		} else {
			method138("Connection lost", "Please wait - attempting to reestablish");
			field220 = 0;
			field616 = 0;
			PWLKORWL var1 = field302;
			field395 = false;
			field532 = 0;
			method39(field387, field388, true);

			if (!field395) {
				method137();
			}

			try {
				var1.method468();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method59() {
		if (field503 && field256 == 2 && BXGEDAMF.field111 != field384) {
			method138("Loading - please wait.", null);
			field256 = 1;
			field277 = System.currentTimeMillis();
		}

		if (field256 == 1) {
			int var1 = method60();
			if (var1 != 0 && System.currentTimeMillis() - field277 > 360000L) {
				signlink.reporterror(field387 + " glcfb " + field274 + "," + var1 + "," + field503 + "," + field203[0] + "," + field303.method207() + "," + field384 + "," + field210 + "," + field211);
				field277 = System.currentTimeMillis();
			}
		}

		if (field256 == 2 && field384 != field372) {
			field372 = field384;
			method83(field384);
		}
	}

	@ObfuscatedName("client.k(I)I")
	public final int method60() {
		for (int var1 = 0; var1 < field324.length; var1++) {
			if (field324[var1] == null && field253[var1] != -1) {
				return -1;
			}

			if (field242[var1] == null && field254[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field324.length; var3++) {
			byte[] var4 = field242[var3];
			if (var4 != null) {
				int var5 = (field252[var3] >> 8) * 64 - field231;
				int var6 = (field252[var3] & 0xFF) * 64 - field232;
				if (field481) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= BXGEDAMF.method14(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field251) {
			return -4;
		} else {
			field256 = 2;
			BXGEDAMF.field111 = field384;
			method38();
			field511.method518(255);
			return 0;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method61() {
		for (int var1 = 0; var1 < field331; var1++) {
			if (field566[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field200[var1] != field469 || field355[var1] != field447) {
						TKPFKOXP var3 = SHTECHVG.method477(field355[var1], field200[var1]);
						if (System.currentTimeMillis() + var3.field1382 / 22 > field273 / 22 + field309) {
							field273 = var3.field1382;
							field309 = System.currentTimeMillis();

							if (method74(var3.field1381, var3.field1382)) {
								field469 = field200[var1];
								field447 = field355[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method135()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field511.method518(152);
						field511.method520(field200[var1] & 0x7FFF);
					} else {
						field511.method518(152);
						field511.method520(-1);
					}
				}

				if (var2 && field566[var1] != -5) {
					field566[var1] = -5;
				} else {
					field331--;
					for (int var5 = var1; var5 < field331; var5++) {
						field200[var5] = field200[var5 + 1];
						field355[var5] = field355[var5 + 1];
						field566[var5] = field566[var5 + 1];
					}

					var1--;
				}
			} else {
				field566[var1]--;
			}
		}

		if (field400 > 0) {
			field400 -= 20;
			if (field400 < 0) {
				field400 = 0;
			}

			if (field400 == 0 && field531 && !field503) {
				field488 = field537;
				field489 = true;
				field303.method208(2, field488);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method62(int arg0) {
		if (arg0 >= 0) {
			int var2 = field184[arg0];
			int var3 = field185[arg0];
			int var4 = field186[arg0];
			int var5 = field187[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field506 != 0 && var4 != 1946) {
				field506 = 0;
				field284 = true;
			}

			if (var4 == 404 || var4 == 394) {
				String var6 = field451[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					var6 = var6.substring(var7 + 5).trim();
					String var8 = DQKGVELR.method186(DQKGVELR.method183(DQKGVELR.method182(var6)));
					boolean var9 = false;
					for (int var10 = 0; var10 < field408; var10++) {
						TINBLEHZ var11 = field407[field409[var10]];
						if (var11 != null && var11.field1380 != null && var11.field1380.equalsIgnoreCase(var8)) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var11.field57[0], 0, var11.field58[0], 2, 1, false);

							if (var4 == 404) {
								field421++;
								if (field421 >= 110) {
									field511.method518(164);
									field511.method523(0);
									field421 = 0;
								}

								field511.method518(143);
								field511.method520(field409[var10]);
							}

							if (var4 == 394) {
								field511.method518(204);
								field511.method555(field409[var10]);
							}

							var9 = true;
							break;
						}
					}

					if (!var9) {
						method111("Unable to find " + var8, 0, "");
					}
				}
			}

			if (var4 == 113) {
				if (field539) {
					field401.method358(var2 - 4, var3 - 4);
				} else {
					field401.method358(field808 - 4, field809 - 4);
				}
			}

			if (var4 == 440) {
				field461 = 1;
				field462 = var2;
				field463 = var3;
				field464 = var5;
				field465 = String.valueOf(SNJEZIDX.method482(var5).field1243);
				field318 = 0;
				field344 = true;
			} else {
				if (var4 == 280) {
					field511.method518(173);
					field511.method553(var3);
					field511.method553(field462);
					field511.method553(var5);
					field511.method555(field464);
					field511.method553(field463);
					field511.method553(var2);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 420) {
					boolean var12 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
					if (!var12) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
					}

					field238 = field808;
					field239 = field809;
					field241 = 2;
					field240 = 0;
					field511.method518(26);
					field511.method520(var5);
					field511.method553(field231 + var2);
					field511.method520(field232 + var3);
				}

				if (var4 == 753) {
					method174(var2, var3, var5);
					field511.method518(200);
					field511.method553(field231 + var2);
					field511.method520(field232 + var3);
					field511.method555(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 202) {
					method174(var2, var3, var5);
					field511.method518(217);
					field511.method555(field231 + var2);
					field511.method554(field232 + var3);
					field511.method553(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 839) {
					field511.method518(77);
					field511.method520(var5);
					field511.method555(var2);
					field511.method554(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 764) {
					ZHNLOFBM var14 = field397[var5];
					if (var14 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var14.field57[0], 0, var14.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(149);
						field511.method555(var5);
						field511.method555(field319);
					}
				}

				if (var4 == 221 && !field298) {
					field511.method518(126);
					field511.method520(var3);
					field298 = true;
				}

				if (var4 == 627 || var4 == 608 || var4 == 819 || var4 == 650) {
					String var15 = field451[arg0];
					int var16 = var15.indexOf("@whi@");
					if (var16 != -1) {
						long var17 = DQKGVELR.method182(var15.substring(var16 + 5).trim());
						if (var4 == 627) {
							method139(var17);
						}

						if (var4 == 608) {
							method42(var17);
						}

						if (var4 == 819) {
							method108(var17);
						}

						if (var4 == 650) {
							method66(var17);
						}
					}
				}

				if (var4 == 1251) {
					SNJEZIDX var19 = SNJEZIDX.method482(var5);
					IJNDWVIL var20 = IJNDWVIL.method311(var3);
					String var21;
					if (var20 != null && var20.field859[var2] >= 100000) {
						var21 = var20.field859[var2] + " x " + var19.field1243;
					} else if (var19.field1238 == null) {
						var21 = "It's a " + var19.field1243 + ".";
					} else {
						var21 = new String(var19.field1238);
					}

					method111(var21, 0, "");
				}

				if (var4 == 178) {
					TINBLEHZ var22 = field407[var5];
					if (var22 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var22.field57[0], 0, var22.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(197);
						field511.method553(var5);
					}
				}

				if (var4 == 479) {
					method174(var2, var3, var5);
					field511.method518(5);
					field511.method520(field231 + var2);
					field511.method555(field232 + var3);
					field511.method555(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 51) {
					TINBLEHZ var23 = field407[var5];
					if (var23 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var23.field57[0], 0, var23.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field421++;
						if (field421 >= 110) {
							field511.method518(164);
							field511.method523(0);
							field421 = 0;
						}

						field511.method518(143);
						field511.method520(var5);
					}
				}

				if (var4 == 990) {
					ZHNLOFBM var24 = field397[var5];
					if (var24 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var24.field57[0], 0, var24.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(191);
						field511.method554(var5);
					}
				}

				if (var4 == 98) {
					field511.method518(50);
					field511.method520(var3);
					IJNDWVIL var25 = IJNDWVIL.method311(var3);
					if (var25.field836 != null && var25.field836[0][0] == 5) {
						int var26 = var25.field836[0][1];
						field472[var26] = 1 - field472[var26];
						method167(var26);
						field344 = true;
					}
				}

				if (var4 == 8) {
					TINBLEHZ var27 = field407[var5];
					if (var27 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var27.field57[0], 0, var27.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(73);
						field511.method553(field462);
						field511.method553(field463);
						field511.method553(field464);
						field511.method520(var5);
					}
				}

				if (var4 == 882) {
					boolean var28 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
					if (!var28) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
					}

					field238 = field808;
					field239 = field809;
					field241 = 2;
					field240 = 0;
					field511.method518(202);
					field511.method554(var5);
					field511.method554(field232 + var3);
					field511.method520(field231 + var2);
				}

				if (var4 == 352) {
					field511.method518(82);
					field511.method554(var2);
					field511.method553(var3);
					field511.method553(var5);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 228) {
					field511.method518(109);
					field511.method553(var3);
					field511.method553(var5);
					field511.method520(var2);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 1071) {
					ZHNLOFBM var30 = field397[var5];
					if (var30 != null) {
						YXSRFNQD var31 = var30.field1510;
						if (var31.field1481 != null) {
							var31 = var31.method593();
						}

						if (var31 != null) {
							String var32;
							if (var31.field1505 == null) {
								var32 = "It's a " + var31.field1474 + ".";
							} else {
								var32 = new String(var31.field1505);
							}

							method111(var32, 0, "");
						}
					}
				}

				if (var4 == 553) {
					ZHNLOFBM var33 = field397[var5];
					if (var33 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var33.field57[0], 0, var33.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(165);
						field511.method554(var5);
					}
				}

				if (var4 == 768) {
					method166();
				}

				if (var4 == 648) {
					field511.method518(212);
					field511.method553(var2);
					field511.method555(var3);
					field511.method555(var5);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 246) {
					TINBLEHZ var34 = field407[var5];
					if (var34 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var34.field57[0], 0, var34.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(204);
						field511.method555(var5);
					}
				}

				if (var4 == 436) {
					field511.method518(50);
					field511.method520(var3);
					IJNDWVIL var35 = IJNDWVIL.method311(var3);
					if (var35.field836 != null && var35.field836[0][0] == 5) {
						int var36 = var35.field836[0][1];
						if (field472[var36] != var35.field849[0]) {
							field472[var36] = var35.field849[0];
							method167(var36);
							field344 = true;
						}
					}
				}

				if (var4 == 978) {
					boolean var37 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
					if (!var37) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
					}

					field238 = field808;
					field239 = field809;
					field241 = 2;
					field240 = 0;
					field511.method518(55);
					field511.method554(field231 + var2);
					field511.method554(var5);
					field511.method553(field319);
					field511.method520(field232 + var3);
				}

				if (var4 == 233) {
					boolean var39 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
					if (!var39) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
					}

					field238 = field808;
					field239 = field809;
					field241 = 2;
					field240 = 0;
					field511.method518(123);
					field511.method555(var5);
					field511.method520(field231 + var2);
					field511.method520(field232 + var3);
				}

				if (var4 == 618) {
					boolean var41 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
					if (!var41) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
					}

					field238 = field808;
					field239 = field809;
					field241 = 2;
					field240 = 0;
					field511.method518(18);
					field511.method520(field231 + var2);
					field511.method554(var5);
					field511.method520(field232 + var3);
				}

				if (var4 == 633) {
					field511.method518(171);
					field511.method555(var3);
					field511.method520(var2);
					field511.method553(var5);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 417) {
					field511.method518(245);
					field511.method554(var2);
					field511.method520(var5);
					field511.method555(var3);
					field511.method555(field319);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (IJNDWVIL.method311(var3).field892 == field370) {
						field427 = 1;
					}

					if (IJNDWVIL.method311(var3).field892 == field434) {
						field427 = 3;
					}
				}

				if (var4 == 438 && method174(var2, var3, var5)) {
					field511.method518(54);
					field511.method520(field231 + var2);
					field511.method520(var5 >> 14 & 0x7FFF);
					field511.method554(field462);
					field511.method554(field464);
					field511.method555(field463);
					field511.method553(field232 + var3);
				}

				if (var4 == 471) {
					String var43 = field451[arg0];
					int var44 = var43.indexOf("@whi@");
					if (var44 != -1) {
						if (field370 == -1) {
							method166();
							field276 = var43.substring(var44 + 5).trim();
							field526 = false;
							field438 = field370 = IJNDWVIL.field844;
						} else {
							method111("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 227) {
					ZHNLOFBM var45 = field397[var5];
					if (var45 != null) {
						method49(1, 0, field204.field58[0], field204.field57[0], 0, var45.field57[0], 0, var45.field58[0], 2, 1, false);
						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;

						if ((var5 & 0x3) == 0) {
							field255++;
						}

						if (field255 >= 81) {
							field511.method518(239);
							field511.method519(166);
							field255 = 0;
						}

						field511.method518(187);
						field511.method553(var5);
					}
				}

				if (var4 == 266) {
					IJNDWVIL var46 = IJNDWVIL.method311(var3);
					field318 = 1;
					field319 = var3;
					field320 = var46.field838;
					field461 = 0;
					field344 = true;
					String var47 = var46.field850;
					if (var47.indexOf(" ") != -1) {
						var47 = var47.substring(0, var47.indexOf(" "));
					}

					String var48 = var46.field850;
					if (var48.indexOf(" ") != -1) {
						var48 = var48.substring(var48.indexOf(" ") + 1);
					}

					field321 = var47 + " " + var46.field852 + " " + var48;

					if (field320 == 16) {
						field344 = true;
						field275 = 3;
						field263 = true;
					}
				} else {
					if (var4 == 561) {
						field511.method518(63);
						field511.method554(var2);
						field511.method554(var3);
						field511.method554(var5);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (IJNDWVIL.method311(var3).field892 == field370) {
							field427 = 1;
						}

						if (IJNDWVIL.method311(var3).field892 == field434) {
							field427 = 3;
						}
					}

					if (var4 == 660) {
						field511.method518(113);
						field511.method520(var2);
						field511.method520(var5);
						field511.method553(var3);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (IJNDWVIL.method311(var3).field892 == field370) {
							field427 = 1;
						}

						if (IJNDWVIL.method311(var3).field892 == field434) {
							field427 = 3;
						}
					}

					if (var4 == 103) {
						field583 += var3;
						if (field583 >= 78) {
							field511.method518(153);
							field511.method519(42);
							field583 = 0;
						}

						field511.method518(240);
						field511.method520(var5);
						field511.method554(var3);
						field511.method520(var2);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (IJNDWVIL.method311(var3).field892 == field370) {
							field427 = 1;
						}

						if (IJNDWVIL.method311(var3).field892 == field434) {
							field427 = 3;
						}
					}

					if (var4 == 147) {
						TINBLEHZ var49 = field407[var5];
						if (var49 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var49.field57[0], 0, var49.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(20);
							field511.method554(var5);
						}
					}

					if (var4 == 672) {
						ZHNLOFBM var50 = field397[var5];
						if (var50 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var50.field57[0], 0, var50.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(34);
							field511.method553(var5);
						}
					}

					if (var4 == 240) {
						if ((var3 & 0x3) == 0) {
							field548++;
						}

						if (field548 >= 144) {
							field511.method518(91);
							field511.method522(0x5D17D6);
							field548 = 0;
						}

						field511.method518(205);
						field511.method555(var3);
						field511.method554(var2);
						field511.method520(var5);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (IJNDWVIL.method311(var3).field892 == field370) {
							field427 = 1;
						}

						if (IJNDWVIL.method311(var3).field892 == field434) {
							field427 = 3;
						}
					}

					if (var4 == 111) {
						method174(var2, var3, var5);
						field511.method518(188);
						field511.method555(field232 + var3);
						field511.method555(var5 >> 14 & 0x7FFF);
						field511.method553(field231 + var2);
					}

					if (var4 == 1936) {
						SNJEZIDX var51 = SNJEZIDX.method482(var5);
						String var52;
						if (var51.field1238 == null) {
							var52 = "It's a " + var51.field1243 + ".";
						} else {
							var52 = new String(var51.field1238);
						}

						method111(var52, 0, "");
					}

					if (var4 == 724) {
						field511.method518(38);
						field511.method554(var3);
						field511.method555(var5);
						field511.method520(var2);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (IJNDWVIL.method311(var3).field892 == field370) {
							field427 = 1;
						}

						if (IJNDWVIL.method311(var3).field892 == field434) {
							field427 = 3;
						}
					}

					if (var4 == 138) {
						IJNDWVIL var53 = IJNDWVIL.method311(var3);
						boolean var54 = true;
						if (var53.field888 > 0) {
							var54 = method88(var53);
						}

						if (var54) {
							field511.method518(50);
							field511.method520(var3);
						}
					}

					if (var4 == 229) {
						ZHNLOFBM var55 = field397[var5];
						if (var55 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var55.field57[0], 0, var55.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(79);
							field511.method555(field464);
							field511.method553(field463);
							field511.method553(field462);
							field511.method554(var5);
						}
					}

					if (var4 == 493) {
						TINBLEHZ var56 = field407[var5];
						if (var56 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var56.field57[0], 0, var56.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(25);
							field511.method555(field319);
							field511.method555(var5);
						}
					}

					if (var4 == 389) {
						TINBLEHZ var57 = field407[var5];
						if (var57 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var57.field57[0], 0, var57.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(137);
							field511.method555(var5);
						}
					}

					if (var4 == 1790) {
						method174(var2, var3, var5);
						field511.method518(216);
						field511.method555(field232 + var3);
						field511.method555(var5 >> 14 & 0x7FFF);
						field511.method520(field231 + var2);
					}

					if (var4 == 469) {
						boolean var58 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
						if (!var58) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
						}

						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field511.method518(41);
						field511.method554(var5);
						field511.method555(field462);
						field511.method520(field464);
						field511.method555(field232 + var3);
						field511.method520(field231 + var2);
						field511.method555(field463);
					}

					if (var4 == 918 && method174(var2, var3, var5)) {
						field511.method518(247);
						field511.method555(field231 + var2);
						field511.method554(field319);
						field511.method554(var5 >> 14 & 0x7FFF);
						field511.method553(field232 + var3);
					}

					if (var4 == 81) {
						ZHNLOFBM var60 = field397[var5];
						if (var60 != null) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var60.field57[0], 0, var60.field58[0], 2, 1, false);
							field238 = field808;
							field239 = field809;
							field241 = 2;
							field240 = 0;
							field511.method518(233);
							field511.method553(var5);
						}
					}

					if (var4 == 908) {
						method157(field606);
						field606 = -1;
						field284 = true;
					}

					if (var4 == 756) {
						boolean var61 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 0, false);
						if (!var61) {
							method49(1, 0, field204.field58[0], field204.field57[0], 0, var2, 0, var3, 2, 1, false);
						}

						field238 = field808;
						field239 = field809;
						field241 = 2;
						field240 = 0;
						field356 += var3;
						if (field356 >= 121) {
							field511.method518(10);
							field511.method522(0x1C7C0C);
							field356 = 0;
						}

						field511.method518(174);
						field511.method554(var5);
						field511.method520(field232 + var3);
						field511.method555(field231 + var2);
					}

					if (var4 == 1083) {
						int var63 = var5 >> 14 & 0x7FFF;
						SOLNFIIQ var64 = SOLNFIIQ.method499(var63);
						String var65;
						if (var64.field1294 == null) {
							var65 = "It's a " + var64.field1317 + ".";
						} else {
							var65 = new String(var64.field1294);
						}

						method111(var65, 0, "");
					}

					if (var4 == 824) {
						String var66 = field451[arg0];
						int var67 = var66.indexOf("@whi@");
						if (var67 != -1) {
							long var68 = DQKGVELR.method182(var66.substring(var67 + 5).trim());
							int var70 = -1;
							for (int var71 = 0; var71 < field385; var71++) {
								if (field523[var71] == var68) {
									var70 = var71;
									break;
								}
							}

							if (var70 != -1 && field389[var70] > 0) {
								field284 = true;
								field506 = 0;
								field560 = true;
								field554 = "";
								field300 = 3;
								field257 = field523[var70];
								field510 = "Enter message to send to " + field507[var70];
							}
						}
					}

					field461 = 0;
					field318 = 0;
					field344 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LBHRFVUZN;Z)V")
	public final void method63(BHRFVUZN arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field72 == 0) {
			var2 = field401.method346(arg0.field71, arg0.field73, arg0.field74);
		}

		if (arg0.field72 == 1) {
			var2 = field401.method347(arg0.field74, arg0.field71, arg0.field73);
		}

		if (arg0.field72 == 2) {
			var2 = field401.method348(arg0.field71, arg0.field73, arg0.field74);
		}

		if (arg0.field72 == 3) {
			var2 = field401.method349(arg0.field71, arg0.field73, arg0.field74);
		}

		if (var2 != 0) {
			int var6 = field401.method350(arg0.field71, arg0.field73, arg0.field74, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field75 = var3;
		arg0.field77 = var4;
		arg0.field76 = var5;
	}

	@ObfuscatedName("client.a(LNPZZPPRD;Z)V")
	public final void method64(NPZZPPRD arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field504.length; var3++) {
			field504[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field504[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field505[var9] = (field504[var9 - 1] + field504[var9 + 1] + field504[var9 - 128] + field504[var9 + 128]) / 4;
				}
			}

			int[] var10 = field504;
			field504 = field505;
			field505 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1090; var12++) {
				for (int var13 = 0; var13 < arg0.field1089; var13++) {
					if (arg0.field1087[var11++] != 0) {
						int var14 = var13 + arg0.field1091 + 16;
						int var15 = var12 + arg0.field1092 + 16;
						int var16 = (var15 << 7) + var14;
						field504[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LIJNDWVIL;I)Z")
	public final boolean method65(IJNDWVIL arg0) {
		int var2 = arg0.field888;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field451[field569] = "Remove @whi@" + arg0.field853;
				field186[field569] = 650;
				field569++;
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

		field451[field569] = "Remove @whi@" + field507[var2];
		field186[field569] = 819;
		field569++;
		field451[field569] = "Message @whi@" + field507[var2];
		field186[field569] = 824;
		field569++;
		return true;
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method66(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field482; var3++) {
				if (field450[var3] == arg0) {
					field482--;
					field344 = true;

					for (int var4 = var3; var4 < field482; var4++) {
						field450[var4] = field450[var4 + 1];
					}

					field511.method518(215);
					field511.method525(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method67(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method68() {
		byte[] var1 = field317.method372("title.dat", null);
		LOVQYTIZ var2 = new LOVQYTIZ(var1, this);
		field610.method1();
		var2.method398(0, 0);
		field611.method1();
		var2.method398(-637, 0);
		field607.method1();
		var2.method398(-128, 0);
		field608.method1();
		var2.method398(-202, -371);
		field609.method1();
		var2.method398(-202, -171);
		field612.method1();
		var2.method398(0, -265);
		field613.method1();
		var2.method398(-562, -265);
		field614.method1();
		var2.method398(-128, -171);
		field615.method1();
		var2.method398(-562, -171);
		int[] var3 = new int[var2.field1053];
		for (int var4 = 0; var4 < var2.field1054; var4++) {
			for (int var5 = 0; var5 < var2.field1053; var5++) {
				var3[var5] = var2.field1052[var2.field1053 * var4 + var2.field1053 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1053; var6++) {
				var2.field1052[var2.field1053 * var4 + var6] = var3[var6];
			}
		}

		field610.method1();
		var2.method398(382, 0);
		field611.method1();
		var2.method398(-255, 0);
		field607.method1();
		var2.method398(254, 0);
		field608.method1();
		var2.method398(180, -371);
		field609.method1();
		var2.method398(180, -171);
		field612.method1();
		var2.method398(382, -265);
		field613.method1();
		var2.method398(-180, -265);
		field614.method1();
		var2.method398(254, -171);
		field615.method1();
		var2.method398(-180, -171);
		LOVQYTIZ var7 = new LOVQYTIZ(field317, "logo", 0);
		field607.method1();
		var7.method400(18, 382 - var7.field1053 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		BHRFVUZN var10 = null;
		for (BHRFVUZN var11 = (BHRFVUZN) field369.method509(); var11 != null; var11 = (BHRFVUZN) field369.method511()) {
			if (var11.field71 == arg7 && var11.field73 == arg4 && var11.field74 == arg6 && var11.field72 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new BHRFVUZN();
			var10.field71 = arg7;
			var10.field72 = arg8;
			var10.field73 = arg4;
			var10.field74 = arg6;
			method63(var10);
			field369.method506(var10);
		}

		var10.field79 = arg0;
		var10.field81 = arg5;
		var10.field80 = arg1;
		var10.field82 = arg2;
		var10.field78 = arg3;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method70() {
		for (int var1 = -1; var1 < field408; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field406;
			} else {
				var2 = field409[var1];
			}

			TINBLEHZ var3 = field407[var2];
			if (var3 != null && var3.field40 > 0) {
				var3.field40--;
				if (var3.field40 == 0) {
					var3.field38 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field398; var4++) {
			int var5 = field399[var4];
			ZHNLOFBM var6 = field397[var5];
			if (var6 != null && var6.field40 > 0) {
				var6.field40--;
				if (var6.field40 == 0) {
					var6.field38 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method71() {
		Graphics var1 = method85().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method249(1);

		if (field524) {
			field458 = false;
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

		if (field201) {
			field458 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field326) {
			field458 = false;
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

	@ObfuscatedName("client.e(B)V")
	public final void method72() {
		if (field807 == 1) {
			if (field808 >= 6 && field808 <= 106 && field809 >= 467 && field809 <= 499) {
				field536 = (field536 + 1) % 4;
				field538 = true;
				field284 = true;
				field511.method518(14);
				field511.method519(field536);
				field511.method519(field334);
				field511.method519(field496);
			}

			if (field808 >= 135 && field808 <= 235 && field809 >= 467 && field809 <= 499) {
				field334 = (field334 + 1) % 3;
				field538 = true;
				field284 = true;
				field511.method518(14);
				field511.method519(field536);
				field511.method519(field334);
				field511.method519(field496);
			}

			if (field808 >= 273 && field808 <= 373 && field809 >= 467 && field809 <= 499) {
				field496 = (field496 + 1) % 3;
				field538 = true;
				field284 = true;
				field511.method518(14);
				field511.method519(field536);
				field511.method519(field334);
				field511.method519(field496);
			}

			if (field808 >= 412 && field808 <= 512 && field809 >= 467 && field809 <= 499) {
				if (field370 == -1) {
					method166();
					field276 = "";
					field526 = false;
					field438 = field370 = IJNDWVIL.field844;
					return;
				}

				method111("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method73(int arg0) {
		IJNDWVIL var2 = IJNDWVIL.method311(arg0);
		for (int var3 = 0; var3 < var2.field874.length && var2.field874[var3] != -1; var3++) {
			IJNDWVIL var4 = IJNDWVIL.method311(var2.field874[var3]);
			if (var4.field894 == 1) {
				method73(var4.field864);
			}

			var4.field861 = 0;
			var4.field889 = 0;
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method74(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method75() {
		if (field339 > 1) {
			field339--;
		}

		if (field227 > 0) {
			field227--;
		}

		for (int var1 = 0; var1 < 5 && method155(); var1++) {
		}

		if (field395) {
			synchronized (field446.field1190) {
				if (!field383) {
					field446.field1191 = 0;
				} else if (field807 != 0 || field446.field1191 >= 40) {
					field511.method518(43);
					field511.method519(0);
					int var3 = field511.field1382;
					int var4 = 0;
					for (int var5 = 0; var5 < field446.field1191 && var3 - field511.field1382 < 240; var5++) {
						var4++;
						int var6 = field446.field1193[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field446.field1192[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field446.field1193[var5] == -1 && field446.field1192[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field585 != var7 || field586 != var6) {
							int var9 = var7 - field585;
							field585 = var7;
							int var10 = var6 - field586;
							field586 = var6;

							if (field430 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field511.method520((field430 << 12) + (var9 << 6) + var10);
								field430 = 0;
							} else if (field430 < 8) {
								field511.method522((field430 << 19) + var8 + 0x800000);
								field430 = 0;
							} else {
								field511.method523((field430 << 19) + var8 - 0x40000000);
								field430 = 0;
							}
						} else if (field430 < 2047) {
							field430++;
						}
					}

					field511.method528(field511.field1382 - var3);

					if (var4 >= field446.field1191) {
						field446.field1191 = 0;
					} else {
						field446.field1191 -= var4;
						for (int var11 = 0; var11 < field446.field1191; var11++) {
							field446.field1192[var11] = field446.field1192[var4 + var11];
							field446.field1193[var11] = field446.field1193[var4 + var11];
						}
					}
				}
			}

			if (field807 != 0) {
				long var12 = (field810 - field487) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field487 = field810;
				int var14 = field809;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field808;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field807 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field511.method518(135);
				field511.method563((var17 << 19) + (var18 << 20) + var16);
			}

			if (field353 > 0) {
				field353--;
			}

			if (field811[1] == 1 || field811[2] == 1 || field811[3] == 1 || field811[4] == 1) {
				field354 = true;
			}

			if (field354 && field353 <= 0) {
				field353 = 20;
				field354 = false;
				field511.method518(219);
				field511.method520(field345);
				field511.method520(field346);
			}

			if (field798 && !field219) {
				field219 = true;
				field511.method518(30);
				field511.method519(1);
			}

			if (!field798 && field219) {
				field219 = false;
				field511.method518(30);
				field511.method519(0);
			}

			method59();
			method136();
			method61();
			field578++;
			if (field578 > 168) {
				field578 = 0;
				field511.method518(139);
				field511.method520(12152);
			}

			field225++;
			if (field225 > 750) {
				method58();
			}

			method77();
			method92();
			method70();
			field299++;

			if (field241 != 0) {
				field240 += 20;
				if (field240 >= 400) {
					field241 = 0;
				}
			}

			if (field427 != 0) {
				field424++;
				if (field424 >= 15) {
					if (field427 == 2) {
						field344 = true;
					}

					if (field427 == 3) {
						field284 = true;
					}

					field427 = 0;
				}
			}

			if (field443 != 0) {
				field570++;

				if (field801 > field444 + 5 || field801 < field444 - 5 || field802 > field445 + 5 || field802 < field445 - 5) {
					field228 = true;
				}

				if (field800 == 0) {
					if (field443 == 2) {
						field344 = true;
					}

					if (field443 == 3) {
						field284 = true;
					}

					field443 = 0;

					if (field228 && field570 >= 5) {
						field329 = -1;
						method79();

						if (field441 == field329 && field442 != field328) {
							IJNDWVIL var19 = IJNDWVIL.method311(field441);
							byte var20 = 0;
							if (field250 == 1 && var19.field888 == 206) {
								var20 = 1;
							}

							if (var19.field878[field328] <= 0) {
								var20 = 0;
							}

							if (var19.field884) {
								int var21 = field442;
								int var22 = field328;
								var19.field878[var22] = var19.field878[var21];
								var19.field859[var22] = var19.field859[var21];
								var19.field878[var21] = -1;
								var19.field859[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field442;
								int var24 = field328;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method309(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method309(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method309(field442, field328);
							}

							field511.method518(157);
							field511.method545(var20);
							field511.method520(field328);
							field511.method553(field442);
							field511.method520(field441);
						}
					} else if ((field546 == 1 || method113(field569 - 1)) && field569 > 2) {
						method35();
					} else if (field569 > 0) {
						method62(field569 - 1);
					}

					field424 = 10;
					field807 = 0;
				}
			}

			if (JPCEPCNA.field940 != -1) {
				int var25 = JPCEPCNA.field940;
				int var26 = JPCEPCNA.field941;
				boolean var27 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var25, 0, var26, 0, 0, true);
				JPCEPCNA.field940 = -1;

				if (var27) {
					field238 = field808;
					field239 = field809;
					field241 = 1;
					field240 = 0;
				}
			}

			if (field807 == 1 && field484 != null) {
				field484 = null;
				field284 = true;
				field807 = 0;
			}

			method176();

			if (field243 == -1) {
				method82();
				method117();
				method72();
			}

			if (field800 == 1 || field807 == 1) {
				field349++;
			}

			if (field567 == 0 && field314 == 0 && field307 == 0) {
				if (field178 > 0) {
					field178--;
				}
			} else if (field178 < 100) {
				field178++;
				if (field178 == 100) {
					if (field567 != 0) {
						field284 = true;
					}

					if (field314 != 0) {
						field344 = true;
					}
				}
			}

			if (field256 == 2) {
				method90();
			}

			if (field256 == 2 && field584) {
				method36();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field236[var28]++;
			}

			method107();
			field799++;
			if (field799 > 4500) {
				field227 = 250;
				field799 -= 500;
				field511.method518(120);
			}

			field341++;
			if (field341 > 500) {
				field341 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field475 += field476;
				}

				if ((var29 & 0x2) == 2) {
					field315 += field316;
				}

				if ((var29 & 0x4) == 4) {
					field379 += field380;
				}
			}

			if (field475 < -50) {
				field476 = 2;
			}

			if (field475 > 50) {
				field476 = -2;
			}

			if (field315 < -55) {
				field316 = 2;
			}

			if (field315 > 55) {
				field316 = -2;
			}

			if (field379 < -40) {
				field380 = 1;
			}

			if (field379 > 40) {
				field380 = -1;
			}

			field286++;
			if (field286 > 500) {
				field286 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field599 += field600;
				}

				if ((var30 & 0x2) == 2) {
					field452 += field453;
				}
			}

			if (field599 < -60) {
				field600 = 2;
			}

			if (field599 > 60) {
				field600 = -2;
			}

			if (field452 < -20) {
				field453 = 1;
			}

			if (field452 > 10) {
				field453 = -1;
			}

			field189++;
			if (field189 > 1503) {
				field189 = 0;
				field511.method518(148);
				field511.method519(0);
				int var31 = field511.field1382;

				if ((int) (Math.random() * 2.0D) == 0) {
					field511.method520(49529);
				}

				field511.method519(10);
				field511.method519(242);
				field511.method519(58);
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method519(245);
				field511.method520(51582);
				field511.method519(73);
				field511.method520(62060);

				if ((int) (Math.random() * 2.0D) == 0) {
					field511.method519(175);
				}

				field511.method528(field511.field1382 - var31);
			}

			field226++;
			if (field226 > 50) {
				field511.method518(122);
			}

			try {
				if (field302 != null && field511.field1382 > 0) {
					field302.method472(field511.field1381, field511.field1382, 0);
					field511.field1382 = 0;
					field226 = 0;
				}
			} catch (IOException var33) {
				method58();
			} catch (Exception var34) {
				method137();
			}
		}
	}

	@ObfuscatedName("client.a(IILIJNDWVIL;)I")
	public final int method76(int arg0, IJNDWVIL arg1) {
		if (arg1.field836 == null || arg0 >= arg1.field836.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field836[arg0];
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
					var8 = field467[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field267[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field514[var3[var5++]];
				}

				if (var7 == 4) {
					IJNDWVIL var10 = IJNDWVIL.method311(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < SNJEZIDX.field1246 && (!SNJEZIDX.method482(var11).field1250 || field502)) {
						for (int var12 = 0; var12 < var10.field878.length; var12++) {
							if (var11 + 1 == var10.field878[var12]) {
								var8 += var10.field859[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field472[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field343[field267[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field472[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field204.field1374;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < ZGXDMAYA.field1507; var13++) {
						if (ZGXDMAYA.field1509[var13]) {
							var8 += field267[var13];
						}
					}
				}

				if (var7 == 10) {
					IJNDWVIL var14 = IJNDWVIL.method311(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < SNJEZIDX.field1246 && (!SNJEZIDX.method482(var15).field1250 || field502)) {
						for (int var16 = 0; var16 < var14.field878.length; var16++) {
							if (var14.field878[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field429;
				}

				if (var7 == 12) {
					var8 = field278;
				}

				if (var7 == 13) {
					int var17 = field472[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					UDCHKCCJ var20 = UDCHKCCJ.field1395[var19];
					int var21 = var20.field1397;
					int var22 = var20.field1398;
					int var23 = var20.field1399;
					int var24 = field571[var23 - var22];
					var8 = field472[var21] >> var22 & var24;
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
					var8 = (field204.field26 >> 7) + field231;
				}

				if (var7 == 19) {
					var8 = (field204.field27 >> 7) + field232;
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

	@ObfuscatedName("client.p(I)V")
	public final void method77() {
		for (int var1 = -1; var1 < field408; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field406;
			} else {
				var2 = field409[var1];
			}

			TINBLEHZ var3 = field407[var2];
			if (var3 != null) {
				method93(1, var3);
			}
		}

		field296++;
		if (field296 > 69) {
			field296 = 0;
			field511.method518(75);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method78() {
		field458 = false;
		while (field440) {
			field458 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field414 = null;
		field415 = null;
		field266 = null;
		field602 = null;
		field603 = null;
		field604 = null;
		field605 = null;
		field504 = null;
		field505 = null;
		field541 = null;
		field542 = null;
		field549 = null;
		field550 = null;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method79() {
		if (field443 == 0) {
			field451[0] = "Cancel";
			field186[0] = 1946;
			field569 = 1;
			if (field243 == -1) {
				method163();
				field215 = 0;
				field237 = 0;

				if (field801 > 4 && field802 > 4 && field801 < 516 && field802 < 338) {
					if (field370 == -1) {
						method169();
					} else {
						method180(4, IJNDWVIL.method311(field370), 0, 0, 4, field801, field802);
					}
				}

				if (field564 != field215) {
					field564 = field215;
				}

				if (field307 != field237) {
					field307 = field237;
				}

				field215 = 0;
				field237 = 0;

				if (field801 > 553 && field802 > 205 && field801 < 743 && field802 < 466) {
					if (field413 != -1) {
						method180(553, IJNDWVIL.method311(field413), 1, 0, 205, field801, field802);
					} else if (field297[field275] != -1) {
						method180(553, IJNDWVIL.method311(field297[field275]), 1, 0, 205, field801, field802);
					}
				}

				if (field289 != field215) {
					field344 = true;
					field289 = field215;
				}

				if (field314 != field237) {
					field344 = true;
					field314 = field237;
				}

				field215 = 0;
				field237 = 0;

				if (field801 > 17 && field802 > 357 && field801 < 496 && field802 < 453) {
					if (field434 != -1) {
						method180(17, IJNDWVIL.method311(field434), 2, 0, 357, field801, field802);
					} else if (field606 != -1) {
						method180(17, IJNDWVIL.method311(field606), 3, 0, 357, field801, field802);
					} else if (field802 < 434 && field801 < 426 && field506 == 0) {
						method129(field801 - 17, field802 - 357);
					}
				}

				if ((field434 != -1 || field606 != -1) && field350 != field215) {
					field284 = true;
					field350 = field215;
				}

				if ((field434 != -1 || field606 != -1) && field567 != field237) {
					field284 = true;
					field567 = field237;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field569 - 1; var2++) {
						if (field186[var2] < 1000 && field186[var2 + 1] > 1000) {
							String var3 = field451[var2];
							field451[var2] = field451[var2 + 1];
							field451[var2 + 1] = var3;
							int var4 = field186[var2];
							field186[var2] = field186[var2 + 1];
							field186[var2 + 1] = var4;
							int var5 = field184[var2];
							field184[var2] = field184[var2 + 1];
							field184[var2 + 1] = var5;
							int var6 = field185[var2];
							field185[var2] = field185[var2 + 1];
							field185[var2 + 1] = var6;
							int var7 = field187[var2];
							field187[var2] = field187[var2 + 1];
							field187[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field215 = 0;
				field237 = 0;
				method180(0, IJNDWVIL.method311(field243), 0, 0, 0, field801, field802);

				if (field564 != field215) {
					field564 = field215;
				}

				if (field307 != field237) {
					field307 = field237;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZILIJNDWVIL;)V")
	public final void method80(int arg0, int arg1, int arg2, IJNDWVIL arg3) {
		if (arg3.field894 == 0 && arg3.field874 != null && (!arg3.field890 || field564 == arg3.field864 || field289 == arg3.field864 || field350 == arg3.field864)) {
			int var5 = IBBQNXJX.field820;
			int var6 = IBBQNXJX.field818;
			int var7 = IBBQNXJX.field821;
			int var8 = IBBQNXJX.field819;
			IBBQNXJX.method253(arg1, arg2, arg3.field856 + arg2, arg3.field880 + arg1);
			int var9 = arg3.field874.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field872[var10] + arg2;
				int var12 = arg3.field899[var10] + arg1 - arg0;
				IJNDWVIL var13 = IJNDWVIL.method311(arg3.field874[var10]);
				var11 += var13.field855;
				var12 += var13.field860;

				if (var13.field888 > 0) {
					method177(var13);
				}

				if (var13.field894 == 0) {
					if (var13.field857 > var13.field862 - var13.field880) {
						var13.field857 = var13.field862 - var13.field880;
					}

					if (var13.field857 < 0) {
						var13.field857 = 0;
					}

					method80(var13.field857, var12, var11, var13);

					if (var13.field862 > var13.field880) {
						method105(var13.field880, var13.field857, var13.field862, var12, var13.field856 + var11);
					}
				} else if (var13.field894 != 1) {
					if (var13.field894 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field880; var15++) {
							for (int var16 = 0; var16 < var13.field856; var16++) {
								int var17 = (var13.field881 + 32) * var16 + var11;
								int var18 = (var13.field869 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field900[var14];
									var18 += var13.field903[var14];
								}

								if (var13.field878[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field878[var14] - 1;
									if (var17 > IBBQNXJX.field820 - 32 && var17 < IBBQNXJX.field821 && var18 > IBBQNXJX.field818 - 32 && var18 < IBBQNXJX.field819 || field443 != 0 && field442 == var14) {
										int var22 = 0;
										if (field461 == 1 && field462 == var14 && field463 == var13.field864) {
											var22 = 0xFFFFFF;
										}

										LOVQYTIZ var23 = SNJEZIDX.method492(var21, var13.field859[var14], var22);
										if (var23 != null) {
											if (field443 != 0 && field442 == var14 && field441 == var13.field864) {
												var19 = field801 - field444;
												var20 = field802 - field445;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field570 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method402(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < IBBQNXJX.field818 && arg3.field857 > 0) {
													int var24 = (IBBQNXJX.field818 - var18 - var20) * field299 / 3;
													if (var24 > field299 * 10) {
														var24 = field299 * 10;
													}

													if (var24 > arg3.field857) {
														var24 = arg3.field857;
													}

													arg3.field857 -= var24;
													field445 += var24;
												}

												if (var18 + var20 + 32 > IBBQNXJX.field819 && arg3.field857 < arg3.field862 - arg3.field880) {
													int var25 = (var18 + var20 + 32 - IBBQNXJX.field819) * field299 / 3;
													if (var25 > field299 * 10) {
														var25 = field299 * 10;
													}

													if (var25 > arg3.field862 - arg3.field880 - arg3.field857) {
														var25 = arg3.field862 - arg3.field880 - arg3.field857;
													}

													arg3.field857 += var25;
													field445 -= var25;
												}
											} else if (field427 != 0 && field426 == var14 && field425 == var13.field864) {
												var23.method402(var17, var18, 128);
											} else {
												var23.method400(var18, var17);
											}

											if (var23.field1057 == 33 || var13.field859[var14] != 1) {
												int var26 = var13.field859[var14];
												field374.method384(method101(var26), var18 + var20 + 10, var17 + 1 + var19, 0);
												field374.method384(method101(var26), var18 + var20 + 9, var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field865 != null && var14 < 20) {
									LOVQYTIZ var27 = var13.field865[var14];
									if (var27 != null) {
										var27.method400(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field894 == 3) {
						boolean var28 = false;
						if (field350 == var13.field864 || field289 == var13.field864 || field564 == var13.field864) {
							var28 = true;
						}

						int var29;
						if (method150(var13)) {
							var29 = var13.field851;
							if (var28 && var13.field833 != 0) {
								var29 = var13.field833;
							}
						} else {
							var29 = var13.field879;
							if (var28 && var13.field847 != 0) {
								var29 = var13.field847;
							}
						}

						if (var13.field870 == 0) {
							if (var13.field854) {
								IBBQNXJX.method256(var11, var13.field856, var12, var29, var13.field880);
							} else {
								IBBQNXJX.method257(var11, var12, var13.field880, var13.field856, var29);
							}
						} else if (var13.field854) {
							IBBQNXJX.method255(var29, var13.field856, 256 - (var13.field870 & 0xFF), var13.field880, var12, var11);
						} else {
							IBBQNXJX.method258(256 - (var13.field870 & 0xFF), var12, var13.field856, var29, var13.field880, var11);
						}
					} else if (var13.field894 == 4) {
						LICHOWDY var30 = var13.field886;
						String var31 = var13.field853;
						boolean var32 = false;
						if (field350 == var13.field864 || field289 == var13.field864 || field564 == var13.field864) {
							var32 = true;
						}

						int var33;
						if (method150(var13)) {
							var33 = var13.field851;
							if (var32 && var13.field833 != 0) {
								var33 = var13.field833;
							}

							if (var13.field877.length() > 0) {
								var31 = var13.field877;
							}
						} else {
							var33 = var13.field879;
							if (var32 && var13.field847 != 0) {
								var33 = var13.field847;
							}
						}

						if (var13.field887 == 6 && field298) {
							var31 = "Please wait...";
							var33 = var13.field879;
						}

						if (IBBQNXJX.field816 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1048 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method144(method76(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method144(method76(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method144(method76(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method144(method76(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method144(method76(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field902) {
								var30.method381(var41, var13.field897, var34, var33, var13.field856 / 2 + var11);
							} else {
								var30.method388(var11, var34, var33, var13.field897, var41);
							}

							var34 += var30.field1048;
						}
					} else if (var13.field894 == 5) {
						LOVQYTIZ var42;
						if (method150(var13)) {
							var42 = var13.field848;
						} else {
							var42 = var13.field904;
						}

						if (var42 != null) {
							var42.method400(var12, var11);
						}
					} else if (var13.field894 == 6) {
						int var43 = GHWCMNQP.field745;
						int var44 = GHWCMNQP.field746;
						GHWCMNQP.field745 = var13.field856 / 2 + var11;
						GHWCMNQP.field746 = var13.field880 / 2 + var12;
						int var45 = GHWCMNQP.field749[var13.field867] * var13.field866 >> 16;
						int var46 = GHWCMNQP.field750[var13.field867] * var13.field866 >> 16;
						boolean var47 = method150(var13);
						int var48;
						if (var47) {
							var48 = var13.field846;
						} else {
							var48 = var13.field845;
						}

						OGORHYVW var49;
						if (var48 == -1) {
							var49 = var13.method314(var47, -1, -1);
						} else {
							KSVXFIAD var50 = KSVXFIAD.field1002[var48];
							var49 = var13.method314(var47, var50.field1005[var13.field861], var50.field1004[var13.field861]);
						}

						if (var49 != null) {
							var49.method454(0, var13.field868, 0, var13.field867, 0, var45, var46);
						}

						GHWCMNQP.field745 = var43;
						GHWCMNQP.field746 = var44;
					} else {
						if (var13.field894 == 7) {
							LICHOWDY var51 = var13.field886;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field880; var53++) {
								for (int var54 = 0; var54 < var13.field856; var54++) {
									if (var13.field878[var52] > 0) {
										SNJEZIDX var55 = SNJEZIDX.method482(var13.field878[var52] - 1);
										String var56 = String.valueOf(var55.field1243);
										if (var55.field1249 || var13.field859[var52] != 1) {
											var56 = var56 + " x" + method112(var13.field859[var52]);
										}

										int var57 = (var13.field881 + 115) * var54 + var11;
										int var58 = (var13.field869 + 12) * var53 + var12;
										if (var13.field902) {
											var51.method381(var56, var13.field897, var58, var13.field879, var13.field856 / 2 + var57);
										} else {
											var51.method388(var57, var58, var13.field879, var13.field897, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field894 == 8 && (field567 == var13.field864 || field314 == var13.field864 || field307 == var13.field864) && field178 == 100) {
							int var59 = 0;
							int var60 = 0;
							LICHOWDY var61 = field375;
							String var62 = var13.field853;
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

								int var65 = var61.method382(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1048 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field856 + var11 - var59 - 5;
							int var67 = var13.field880 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field856 + arg2) {
								var66 = arg3.field856 + arg2 - var59;
							}

							if (var60 + var67 > arg3.field880 + arg1) {
								var67 = arg3.field880 + arg1 - var60;
							}

							IBBQNXJX.method256(var66, var59, var67, 0xFFFFA0, var60);
							IBBQNXJX.method257(var66, var67, var60, var59, 0);
							String var68 = var13.field853;
							int var69 = var61.field1048 + var67 + 2;
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

								var61.method388(var66 + 3, var69, 0, false, var71);
								var69 += var61.field1048 + 1;
							}
						}
					}
				}
			}

			IBBQNXJX.method253(var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method81() {
		field414 = new NPZZPPRD(field317, "titlebox", 0);
		field415 = new NPZZPPRD(field317, "titlebutton", 0);
		field266 = new NPZZPPRD[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field266[var1] = new NPZZPPRD(field317, "runes", var1);
		}

		field549 = new LOVQYTIZ(128, 265);
		field550 = new LOVQYTIZ(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field549.field1052[var2] = field610.field1[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field550.field1052[var3] = field611.field1[var3];
		}

		field603 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field603[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field603[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field603[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field603[var7 + 192] = 0xFFFFFF;
		}

		field604 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field604[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field604[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field604[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field604[var11 + 192] = 0xFFFFFF;
		}

		field605 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field605[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field605[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field605[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field605[var15 + 192] = 0xFFFFFF;
		}

		field602 = new int[256];
		field504 = new int[32768];
		field505 = new int[32768];
		method64(null);
		field541 = new int[32768];
		field542 = new int[32768];
		method118(10, "Connecting to fileserver");

		if (!field458) {
			field188 = true;
			field458 = true;
			method154(this, 2);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method82() {
		if (field220 == 0 && field807 == 1) {
			int var1 = field808 - 25 - 550;
			int var2 = field809 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field599 + field346 & 0x7FF;
				int var4 = GHWCMNQP.field749[var3];
				int var5 = GHWCMNQP.field750[var3];
				var4 = (field452 + 256) * var4 >> 8;
				var5 = (field452 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field204.field26 + var6 >> 7;
				int var9 = field204.field27 - var7 >> 7;
				boolean var10 = method49(0, 0, field204.field58[0], field204.field57[0], 0, var8, 0, var9, 1, 0, true);
				if (var10) {
					field511.method519(var1);
					field511.method519(var2);
					field511.method520(field346);
					field511.method519(57);
					field511.method519(field599);
					field511.method519(field452);
					field511.method519(89);
					field511.method520(field204.field26);
					field511.method520(field204.field27);
					field511.method519(field535);
					field511.method519(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method83(int arg0) {
		int[] var2 = field618.field1052;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field499[arg0][var7][var5] & 0x18) == 0) {
					field401.method355(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field499[arg0 + 1][var7][var5] & 0x8) != 0) {
					field401.method355(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field618.method395();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field499[arg0][var11][var10] & 0x18) == 0) {
					method126(var10, var8, var11, arg0, var9);
				}

				if (arg0 < 3 && (field499[arg0 + 1][var11][var10] & 0x8) != 0) {
					method126(var10, var8, var11, arg0 + 1, var9);
				}
			}
		}

		if (field312 != null) {
			field312.method1();
			GHWCMNQP.field751 = field393;
		}

		field478 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field401.method349(field384, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SOLNFIIQ.method499(var14).field1289;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field265[field384].field1415;
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

						field439[field478] = field544[var15];
						field479[field478] = var16;
						field480[field478] = var17;
						field478++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public void method84() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field290);

		if (field303 != null) {
			System.out.println("Od-cycle:" + field303.field737);
		}

		System.out.println("loop-cycle:" + field456);
		System.out.println("draw-cycle:" + field404);
		System.out.println("ptype:" + field224);
		System.out.println("psize:" + field223);

		if (field302 != null) {
			field302.method473();
		}

		field790 = true;
	}

	@ObfuscatedName("client.b(Z)Ljava/awt/Component;")
	public final Component method85() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field796 != null) {
			return field796;
		}

		return this;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method86() {
		if (field607 == null) {
			field794 = null;
			field313 = null;
			field311 = null;
			field310 = null;
			field312 = null;
			field212 = null;
			field213 = null;
			field214 = null;
			field610 = new AKBGAGNS(265, method85(), 128);
			IBBQNXJX.method254();
			field611 = new AKBGAGNS(265, method85(), 128);
			IBBQNXJX.method254();
			field607 = new AKBGAGNS(171, method85(), 509);
			IBBQNXJX.method254();
			field608 = new AKBGAGNS(132, method85(), 360);
			IBBQNXJX.method254();
			field609 = new AKBGAGNS(200, method85(), 360);
			IBBQNXJX.method254();
			field612 = new AKBGAGNS(238, method85(), 202);
			IBBQNXJX.method254();
			field613 = new AKBGAGNS(238, method85(), 203);
			IBBQNXJX.method254();
			field614 = new AKBGAGNS(94, method85(), 74);
			IBBQNXJX.method254();
			field615 = new AKBGAGNS(94, method85(), 75);
			IBBQNXJX.method254();

			if (field317 != null) {
				method68();
				method81();
			}

			field287 = true;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method87() {
		if (field794 == null) {
			method78();
			field607 = null;
			field608 = null;
			field609 = null;
			field610 = null;
			field611 = null;
			field612 = null;
			field613 = null;
			field614 = null;
			field615 = null;
			field313 = null;
			field311 = null;
			field310 = null;
			field312 = null;
			field212 = null;
			field213 = null;
			field214 = null;
			field794 = new AKBGAGNS(503, method85(), 765);
			field287 = true;
		}
	}

	@ObfuscatedName("client.a(ILIJNDWVIL;)Z")
	public final boolean method88(IJNDWVIL arg0) {
		int var2 = arg0.field888;
		if (field386 == 2) {
			if (var2 == 201) {
				field284 = true;
				field506 = 0;
				field560 = true;
				field554 = "";
				field300 = 1;
				field510 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field284 = true;
				field506 = 0;
				field560 = true;
				field554 = "";
				field300 = 2;
				field510 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field227 = 250;
			return true;
		}

		if (var2 == 501) {
			field284 = true;
			field506 = 0;
			field560 = true;
			field554 = "";
			field300 = 4;
			field510 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field284 = true;
			field506 = 0;
			field560 = true;
			field554 = "";
			field300 = 5;
			field510 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field304[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = NTHXISGN.field1095 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= NTHXISGN.field1095) {
							var5 = 0;
						}
					}

					if (!NTHXISGN.field1096[var5].field1102 && NTHXISGN.field1096[var5].field1097 == var3 + (field485 ? 0 : 7)) {
						break;
					}
				}

				field304[var3] = var5;
				field551 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field330[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field327[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field327[var6].length) {
					var8 = 0;
				}
			}

			field330[var6] = var8;
			field551 = true;
		}

		if (var2 == 324 && !field485) {
			field485 = true;
			method46();
		}

		if (var2 == 325 && field485) {
			field485 = false;
			method46();
		}

		if (var2 == 326) {
			field511.method518(115);
			field511.method519(field485 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field511.method519(field304[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field511.method519(field330[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field526 = !field526;
		}

		if (var2 >= 601 && var2 <= 613) {
			method166();

			if (field276.length() > 0) {
				field511.method518(114);
				field511.method525(DQKGVELR.method182(field276));
				field511.method519(var2 - 601);
				field511.method519(field526 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method89() {
		if (field569 >= 2 || field461 != 0 || field318 != 0) {
			String var1;
			if (field461 == 1 && field569 < 2) {
				var1 = "Use " + field465 + " with...";
			} else if (field318 == 1 && field569 < 2) {
				var1 = field321 + "...";
			} else {
				var1 = field451[field569 - 1];
			}

			if (field569 > 2) {
				var1 = var1 + "@whi@ / " + (field569 - 2) + " more options";
			}

			field376.method389(field456 / 1000, 15, 0xFFFFFF, 4, true, var1);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 366);

			if (arg0.length == 5) {
				field500 = Integer.parseInt(arg0[0]);
				field501 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method123();
				} else if (arg0[2].equals("highmem")) {
					method116();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field502 = false;
				} else if (arg0[3].equals("members")) {
					field502 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method246(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method90() {
		try {
			int var1 = field204.field26 + field475;
			int var2 = field204.field27 + field315;
			if (field351 - var1 < -500 || field351 - var1 > 500 || field352 - var2 < -500 || field352 - var2 > 500) {
				field351 = var1;
				field352 = var2;
			}

			if (field351 != var1) {
				field351 += (var1 - field351) / 16;
			}

			if (field352 != var2) {
				field352 += (var2 - field352) / 16;
			}

			if (field811[1] == 1) {
				field347 += (-field347 - 24) / 2;
			} else if (field811[2] == 1) {
				field347 += (24 - field347) / 2;
			} else {
				field347 /= 2;
			}

			if (field811[3] == 1) {
				field348 += (12 - field348) / 2;
			} else if (field811[4] == 1) {
				field348 += (-field348 - 12) / 2;
			} else {
				field348 /= 2;
			}

			field346 = field347 / 2 + field346 & 0x7FF;
			field345 += field348 / 2;
			if (field345 < 128) {
				field345 = 128;
			}

			if (field345 > 383) {
				field345 = 383;
			}

			int var3 = field351 >> 7;
			int var4 = field352 >> 7;
			int var5 = method173(field351, field384, field352);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field384;
						if (var9 < 3 && (field499[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field363[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			field534++;
			if (field534 > 1496) {
				field534 = 0;
				field511.method518(253);
				field511.method519(0);
				int var11 = field511.field1382;
				field511.method520(33963);
				field511.method519(182);

				if ((int) (Math.random() * 2.0D) == 0) {
					field511.method520(51200);
				}

				field511.method519((int) (Math.random() * 256.0D));
				field511.method520((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field511.method520(6721);
				}

				field511.method520((int) (Math.random() * 65536.0D));
				field511.method519(136);
				field511.method519(59);
				field511.method520(42501);
				field511.method528(field511.field1382 - var11);
			}

			int var12 = var6 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}

			if (var12 < 32768) {
				var12 = 32768;
			}

			if (var12 > field582) {
				field582 += (var12 - field582) / 24;
			} else if (var12 < field582) {
				field582 += (var12 - field582) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field204.field26 + "," + field204.field27 + "," + field351 + "," + field352 + "," + field210 + "," + field211 + "," + field231 + "," + field232);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LTKPFKOXP;ZI)V")
	public final void method91(TKPFKOXP arg0, int arg1) {
		for (int var3 = 0; var3 < field410; var3++) {
			int var4 = field411[var3];
			ZHNLOFBM var5 = field397[var4];
			int var6 = arg0.method529();
			if ((var6 & 0x20) != 0) {
				var5.field16 = arg0.method557();
				int var7 = arg0.method534();
				var5.field20 = var7 >> 16;
				var5.field19 = (var7 & 0xFFFF) + field456;
				var5.field17 = 0;
				var5.field18 = 0;

				if (var5.field19 > field456) {
					var5.field17 = -1;
				}

				if (var5.field16 == 0xFFFF) {
					var5.field16 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var8 = arg0.method558();
				if (var8 == 0xFFFF) {
					var8 = -1;
				}

				int var9 = arg0.method548();
				if (var5.field42 == var8 && var8 != -1) {
					int var10 = KSVXFIAD.field1002[var8].field1016;
					if (var10 == 1) {
						var5.field43 = 0;
						var5.field44 = 0;
						var5.field45 = var9;
						var5.field46 = 0;
					}

					if (var10 == 2) {
						var5.field46 = 0;
					}
				} else if (var8 == -1 || var5.field42 == -1 || KSVXFIAD.field1002[var8].field1010 >= KSVXFIAD.field1002[var5.field42].field1010) {
					var5.field42 = var8;
					var5.field43 = 0;
					var5.field44 = 0;
					var5.field45 = var9;
					var5.field46 = 0;
					var5.field47 = var5.field39;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var11 = arg0.method547();
				int var12 = arg0.method548();
				var5.method10(var11, field456, var12);
				var5.field31 = field456 + 300;
				var5.field32 = arg0.method529();
				var5.field33 = arg0.method529();
			}

			if ((var6 & 0x80) != 0) {
				var5.field38 = arg0.method536();
				var5.field40 = 100;
			}

			if ((var6 & 0x10) != 0) {
				var5.field30 = arg0.method531();
				if (var5.field30 == 0xFFFF) {
					var5.field30 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg0.method549();
				int var14 = arg0.method549();
				var5.method10(var13, field456, var14);
				var5.field31 = field456 + 300;
				var5.field32 = arg0.method548();
				var5.field33 = arg0.method529();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1510 = YXSRFNQD.method598(arg0.method556());
				var5.field36 = var5.field1510.field1492;
				var5.field29 = var5.field1510.field1470;
				var5.field21 = var5.field1510.field1483;
				var5.field22 = var5.field1510.field1498;
				var5.field23 = var5.field1510.field1497;
				var5.field24 = var5.field1510.field1473;
				var5.field60 = var5.field1510.field1477;
			}

			if ((var6 & 0x8) != 0) {
				var5.field52 = arg0.method558();
				var5.field53 = arg0.method558();
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method92() {
		for (int var1 = 0; var1 < field398; var1++) {
			int var2 = field399[var1];
			ZHNLOFBM var3 = field397[var2];
			if (var3 != null) {
				method93(var3.field1510.field1492, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILAQPBLKMD;)V")
	public final void method93(int arg0, AQPBLKMD arg1) {
		if (arg1.field26 < 128 || arg1.field27 < 128 || arg1.field26 >= 13184 || arg1.field27 >= 13184) {
			arg1.field42 = -1;
			arg1.field16 = -1;
			arg1.field66 = 0;
			arg1.field67 = 0;
			arg1.field26 = arg1.field57[0] * 128 + arg1.field36 * 64;
			arg1.field27 = arg1.field58[0] * 128 + arg1.field36 * 64;
			arg1.method6();
		}

		if (field204 == arg1 && (arg1.field26 < 1536 || arg1.field27 < 1536 || arg1.field26 >= 11776 || arg1.field27 >= 11776)) {
			arg1.field42 = -1;
			arg1.field16 = -1;
			arg1.field66 = 0;
			arg1.field67 = 0;
			arg1.field26 = arg1.field57[0] * 128 + arg1.field36 * 64;
			arg1.field27 = arg1.field58[0] * 128 + arg1.field36 * 64;
			arg1.method6();
		}

		if (arg1.field66 > field456) {
			method94(arg1);
		} else if (arg1.field67 >= field456) {
			method95(arg1);
		} else {
			method96(arg1);
		}

		method97(arg1);
		method98(arg1);
	}

	@ObfuscatedName("client.a(LAQPBLKMD;B)V")
	public final void method94(AQPBLKMD arg0) {
		int var2 = arg0.field66 - field456;
		int var3 = arg0.field62 * 128 + arg0.field36 * 64;
		int var4 = arg0.field64 * 128 + arg0.field36 * 64;
		arg0.field26 += (var3 - arg0.field26) / var2;
		arg0.field27 += (var4 - arg0.field27) / var2;
		arg0.field69 = 0;

		if (arg0.field68 == 0) {
			arg0.field70 = 1024;
		}

		if (arg0.field68 == 1) {
			arg0.field70 = 1536;
		}

		if (arg0.field68 == 2) {
			arg0.field70 = 0;
		}

		if (arg0.field68 == 3) {
			arg0.field70 = 512;
		}
	}

	@ObfuscatedName("client.a(LAQPBLKMD;I)V")
	public final void method95(AQPBLKMD arg0) {
		if (field456 == arg0.field67 || arg0.field42 == -1 || arg0.field45 != 0 || arg0.field44 + 1 > KSVXFIAD.field1002[arg0.field42].method375(arg0.field43)) {
			int var2 = arg0.field67 - arg0.field66;
			int var3 = field456 - arg0.field66;
			int var4 = arg0.field62 * 128 + arg0.field36 * 64;
			int var5 = arg0.field64 * 128 + arg0.field36 * 64;
			int var6 = arg0.field63 * 128 + arg0.field36 * 64;
			int var7 = arg0.field65 * 128 + arg0.field36 * 64;
			arg0.field26 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field27 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field69 = 0;

		if (arg0.field68 == 0) {
			arg0.field70 = 1024;
		}

		if (arg0.field68 == 1) {
			arg0.field70 = 1536;
		}

		if (arg0.field68 == 2) {
			arg0.field70 = 0;
		}

		if (arg0.field68 == 3) {
			arg0.field70 = 512;
		}

		arg0.field28 = arg0.field70;
	}

	@ObfuscatedName("client.a(LAQPBLKMD;Z)V")
	public final void method96(AQPBLKMD arg0) {
		arg0.field48 = arg0.field60;
		if (arg0.field39 == 0) {
			arg0.field69 = 0;
		} else {
			if (arg0.field42 != -1 && arg0.field45 == 0) {
				KSVXFIAD var2 = KSVXFIAD.field1002[arg0.field42];
				if (arg0.field47 > 0 && var2.field1014 == 0) {
					arg0.field69++;
					return;
				}

				if (arg0.field47 <= 0 && var2.field1015 == 0) {
					arg0.field69++;
					return;
				}
			}

			int var3 = arg0.field26;
			int var4 = arg0.field27;
			int var5 = arg0.field57[arg0.field39 - 1] * 128 + arg0.field36 * 64;
			int var6 = arg0.field58[arg0.field39 - 1] * 128 + arg0.field36 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field70 = 1280;
					} else if (var4 > var6) {
						arg0.field70 = 1792;
					} else {
						arg0.field70 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field70 = 768;
					} else if (var4 > var6) {
						arg0.field70 = 256;
					} else {
						arg0.field70 = 512;
					}
				} else if (var4 < var6) {
					arg0.field70 = 1024;
				} else {
					arg0.field70 = 0;
				}

				int var7 = arg0.field70 - arg0.field28 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field22;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field21;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field24;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field23;
				}

				if (var8 == -1) {
					var8 = arg0.field21;
				}

				arg0.field48 = var8;
				int var9 = 4;
				if (arg0.field70 != arg0.field28 && arg0.field30 == -1 && arg0.field29 != 0) {
					var9 = 2;
				}

				if (arg0.field39 > 2) {
					var9 = 6;
				}

				if (arg0.field39 > 3) {
					var9 = 8;
				}

				if (arg0.field69 > 0 && arg0.field39 > 1) {
					var9 = 8;
					arg0.field69--;
				}

				if (arg0.field35[arg0.field39 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field48 == arg0.field21 && arg0.field59 != -1) {
					arg0.field48 = arg0.field59;
				}

				if (var3 < var5) {
					arg0.field26 += var9;
					if (arg0.field26 > var5) {
						arg0.field26 = var5;
					}
				} else if (var3 > var5) {
					arg0.field26 -= var9;
					if (arg0.field26 < var5) {
						arg0.field26 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field27 += var9;
					if (arg0.field27 > var6) {
						arg0.field27 = var6;
					}
				} else if (var4 > var6) {
					arg0.field27 -= var9;
					if (arg0.field27 < var6) {
						arg0.field27 = var6;
					}
				}

				if (arg0.field26 == var5 && arg0.field27 == var6) {
					arg0.field39--;

					if (arg0.field47 > 0) {
						arg0.field47--;
						return;
					}
				}
			} else {
				arg0.field26 = var5;
				arg0.field27 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLAQPBLKMD;)V")
	public final void method97(AQPBLKMD arg0) {
		if (arg0.field29 != 0) {
			if (arg0.field30 != -1 && arg0.field30 < 32768) {
				ZHNLOFBM var2 = field397[arg0.field30];
				if (var2 != null) {
					int var3 = arg0.field26 - var2.field26;
					int var4 = arg0.field27 - var2.field27;
					if (var3 != 0 || var4 != 0) {
						arg0.field70 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field30 >= 32768) {
				int var5 = arg0.field30 - 32768;
				if (field466 == var5) {
					var5 = field406;
				}

				TINBLEHZ var6 = field407[var5];
				if (var6 != null) {
					int var7 = arg0.field26 - var6.field26;
					int var8 = arg0.field27 - var6.field27;
					if (var7 != 0 || var8 != 0) {
						arg0.field70 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field52 != 0 || arg0.field53 != 0) && (arg0.field39 == 0 || arg0.field69 > 0)) {
				int var9 = arg0.field26 - (arg0.field52 - field231 - field231) * 64;
				int var10 = arg0.field27 - (arg0.field53 - field232 - field232) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field70 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field52 = 0;
				arg0.field53 = 0;
			}

			int var11 = arg0.field70 - arg0.field28 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field29 || var11 > 2048 - arg0.field29) {
					arg0.field28 = arg0.field70;
				} else if (var11 > 1024) {
					arg0.field28 -= arg0.field29;
				} else {
					arg0.field28 += arg0.field29;
				}

				arg0.field28 &= 0x7FF;
				if (arg0.field60 == arg0.field48 && arg0.field70 != arg0.field28) {
					if (arg0.field61 != -1) {
						arg0.field48 = arg0.field61;
						return;
					}

					arg0.field48 = arg0.field21;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILAQPBLKMD;)V")
	public final void method98(AQPBLKMD arg0) {
		arg0.field34 = false;

		if (arg0.field48 != -1) {
			KSVXFIAD var2 = KSVXFIAD.field1002[arg0.field48];
			arg0.field50++;
			if (arg0.field49 < var2.field1003 && arg0.field50 > var2.method375(arg0.field49)) {
				arg0.field50 = 0;
				arg0.field49++;
			}

			if (arg0.field49 >= var2.field1003) {
				arg0.field50 = 0;
				arg0.field49 = 0;
			}
		}

		if (arg0.field16 != -1 && field456 >= arg0.field19) {
			if (arg0.field17 < 0) {
				arg0.field17 = 0;
			}

			KSVXFIAD var3 = HTOEUNMD.field772[arg0.field16].field776;
			arg0.field18++;
			while (arg0.field17 < var3.field1003 && arg0.field18 > var3.method375(arg0.field17)) {
				arg0.field18 -= var3.method375(arg0.field17);
				arg0.field17++;
			}

			if (arg0.field17 >= var3.field1003 && (arg0.field17 < 0 || arg0.field17 >= var3.field1003)) {
				arg0.field16 = -1;
			}
		}

		if (arg0.field42 != -1 && arg0.field45 <= 1) {
			KSVXFIAD var4 = KSVXFIAD.field1002[arg0.field42];
			if (var4.field1014 == 1 && arg0.field47 > 0 && arg0.field66 <= field456 && arg0.field67 < field456) {
				arg0.field45 = 1;
				return;
			}
		}

		if (arg0.field42 != -1 && arg0.field45 == 0) {
			KSVXFIAD var5 = KSVXFIAD.field1002[arg0.field42];
			arg0.field44++;
			while (arg0.field43 < var5.field1003 && arg0.field44 > var5.method375(arg0.field43)) {
				arg0.field44 -= var5.method375(arg0.field43);
				arg0.field43++;
			}

			if (arg0.field43 >= var5.field1003) {
				arg0.field43 -= var5.field1007;
				arg0.field46++;
				if (arg0.field46 >= var5.field1013) {
					arg0.field42 = -1;
				}

				if (arg0.field43 < 0 || arg0.field43 >= var5.field1003) {
					arg0.field42 = -1;
				}
			}

			arg0.field34 = var5.field1009;
		}

		if (arg0.field45 > 0) {
			arg0.field45--;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method99() {
		if (field243 == -1 || field256 != 2 && field794 == null) {
			if (field287) {
				method143();
				field287 = false;
				field191.method2(4, 0, field793);
				field192.method2(357, 0, field793);
				field193.method2(4, 722, field793);
				field194.method2(205, 743, field793);
				field195.method2(0, 0, field793);
				field196.method2(4, 516, field793);
				field197.method2(205, 516, field793);
				field198.method2(357, 496, field793);
				field199.method2(338, 0, field793);
				field344 = true;
				field284 = true;
				field263 = true;
				field538 = true;

				if (field256 != 2) {
					field312.method2(4, 4, field793);
					field311.method2(4, 550, field793);
				}
			}

			if (field256 == 2) {
				method158();
			}

			if (field539 && field244 == 1) {
				field344 = true;
			}

			if (field413 != -1) {
				boolean var3 = method127(field299, field413);
				if (var3) {
					field344 = true;
				}
			}

			if (field427 == 2) {
				field344 = true;
			}

			if (field443 == 2) {
				field344 = true;
			}

			if (field344) {
				method47();
				field344 = false;
			}

			if (field434 == -1 && field506 == 0) {
				field293.field857 = field323 - field497 - 77;

				if (field801 > 448 && field801 < 560 && field802 > 332) {
					method140(77, 0, field323, field802 - 357, -1, field801 - 17, 463, field293);
				}

				int var4 = field323 - field293.field857 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field323 - 77) {
					var4 = field323 - 77;
				}

				if (field497 != var4) {
					field497 = var4;
					field284 = true;
				}
			}

			if (field434 == -1 && field506 == 3) {
				int var5 = field556 * 14 + 7;
				field293.field857 = field559;

				if (field801 > 448 && field801 < 560 && field802 > 332) {
					method140(77, 0, var5, field802 - 357, -1, field801 - 17, 463, field293);
				}

				int var6 = field293.field857;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field559 != var6) {
					field559 = var6;
					field284 = true;
				}
			}

			if (field434 != -1) {
				boolean var7 = method127(field299, field434);
				if (var7) {
					field284 = true;
				}
			}

			if (field427 == 3) {
				field284 = true;
			}

			if (field443 == 3) {
				field284 = true;
			}

			if (field484 != null) {
				field284 = true;
			}

			if (field539 && field244 == 2) {
				field284 = true;
			}

			if (field284) {
				method52();
				field284 = false;
			}

			if (field256 == 2) {
				method148();
				field311.method2(4, 550, field793);
				field177++;
				if (field177 > 69) {
					field177 = 0;
					field511.method518(167);
				}
			}

			if (field521 != -1) {
				field263 = true;
			}

			if (field263) {
				if (field521 != -1 && field521 == field275) {
					field521 = -1;
					field511.method518(178);
					field511.method519(field275);
				}

				field263 = false;
				field214.method1();
				field271.method421(0, 0);

				if (field413 == -1) {
					if (field297[field275] != -1) {
						if (field275 == 0) {
							field258.method421(10, 22);
						}

						if (field275 == 1) {
							field259.method421(8, 54);
						}

						if (field275 == 2) {
							field259.method421(8, 82);
						}

						if (field275 == 3) {
							field260.method421(8, 110);
						}

						if (field275 == 4) {
							field262.method421(8, 153);
						}

						if (field275 == 5) {
							field262.method421(8, 181);
						}

						if (field275 == 6) {
							field261.method421(9, 209);
						}
					}

					if (field297[0] != -1 && (field521 != 0 || field456 % 20 < 10)) {
						field601[0].method421(13, 29);
					}

					if (field297[1] != -1 && (field521 != 1 || field456 % 20 < 10)) {
						field601[1].method421(11, 53);
					}

					if (field297[2] != -1 && (field521 != 2 || field456 % 20 < 10)) {
						field601[2].method421(11, 82);
					}

					if (field297[3] != -1 && (field521 != 3 || field456 % 20 < 10)) {
						field601[3].method421(12, 115);
					}

					if (field297[4] != -1 && (field521 != 4 || field456 % 20 < 10)) {
						field601[4].method421(13, 153);
					}

					if (field297[5] != -1 && (field521 != 5 || field456 % 20 < 10)) {
						field601[5].method421(11, 180);
					}

					if (field297[6] != -1 && (field521 != 6 || field456 % 20 < 10)) {
						field601[6].method421(13, 208);
					}
				}

				field214.method2(160, 516, field793);
				field213.method1();
				field270.method421(0, 0);

				if (field413 == -1) {
					if (field297[field275] != -1) {
						if (field275 == 7) {
							field279.method421(0, 42);
						}

						if (field275 == 8) {
							field280.method421(0, 74);
						}

						if (field275 == 9) {
							field280.method421(0, 102);
						}

						if (field275 == 10) {
							field281.method421(1, 130);
						}

						if (field275 == 11) {
							field283.method421(0, 173);
						}

						if (field275 == 12) {
							field283.method421(0, 201);
						}

						if (field275 == 13) {
							field282.method421(0, 229);
						}
					}

					if (field297[8] != -1 && (field521 != 8 || field456 % 20 < 10)) {
						field601[7].method421(2, 74);
					}

					if (field297[9] != -1 && (field521 != 9 || field456 % 20 < 10)) {
						field601[8].method421(3, 102);
					}

					if (field297[10] != -1 && (field521 != 10 || field456 % 20 < 10)) {
						field601[9].method421(4, 137);
					}

					if (field297[11] != -1 && (field521 != 11 || field456 % 20 < 10)) {
						field601[10].method421(2, 174);
					}

					if (field297[12] != -1 && (field521 != 12 || field456 % 20 < 10)) {
						field601[11].method421(2, 201);
					}

					if (field297[13] != -1 && (field521 != 13 || field456 % 20 < 10)) {
						field601[12].method421(2, 226);
					}
				}

				field213.method2(466, 496, field793);
				field312.method1();
				GHWCMNQP.field751 = field393;
			}

			if (field538) {
				field538 = false;
				field212.method1();
				field269.method421(0, 0);
				field375.method381("Public chat", true, 28, 0xFFFFFF, 55);

				if (field536 == 0) {
					field375.method381("On", true, 41, 0xFF00, 55);
				}

				if (field536 == 1) {
					field375.method381("Friends", true, 41, 0xFFFF00, 55);
				}

				if (field536 == 2) {
					field375.method381("Off", true, 41, 0xFF0000, 55);
				}

				if (field536 == 3) {
					field375.method381("Hide", true, 41, 0xFFFF, 55);
				}

				field375.method381("Private chat", true, 28, 0xFFFFFF, 184);

				if (field334 == 0) {
					field375.method381("On", true, 41, 0xFF00, 184);
				}

				if (field334 == 1) {
					field375.method381("Friends", true, 41, 0xFFFF00, 184);
				}

				if (field334 == 2) {
					field375.method381("Off", true, 41, 0xFF0000, 184);
				}

				field375.method381("Trade/compete", true, 28, 0xFFFFFF, 324);

				if (field496 == 0) {
					field375.method381("On", true, 41, 0xFF00, 324);
				}

				if (field496 == 1) {
					field375.method381("Friends", true, 41, 0xFFFF00, 324);
				}

				if (field496 == 2) {
					field375.method381("Off", true, 41, 0xFF0000, 324);
				}

				field375.method381("Report abuse", true, 33, 0xFFFFFF, 458);
				field212.method2(453, 0, field793);
				field312.method1();
				GHWCMNQP.field751 = field393;
			}

			field299 = 0;
		} else {
			if (field256 == 2) {
				method127(field299, field243);

				if (field288 != -1) {
					method127(field299, field288);
				}

				field299 = 0;
				method87();
				field794.method1();
				GHWCMNQP.field751 = field394;
				IBBQNXJX.method254();
				field287 = true;
				IJNDWVIL var1 = IJNDWVIL.method311(field243);
				if (var1.field856 == 512 && var1.field880 == 334 && var1.field894 == 0) {
					var1.field856 = 765;
					var1.field880 = 503;
				}

				method80(0, 0, 0, var1);

				if (field288 != -1) {
					IJNDWVIL var2 = IJNDWVIL.method311(field288);
					if (var2.field856 == 512 && var2.field880 == 334 && var2.field894 == 0) {
						var2.field856 = 765;
						var2.field880 = 503;
					}

					method80(0, 0, 0, var2);
				}

				if (field539) {
					method50();
				} else {
					method79();
					method89();
				}
			}

			field794.method2(0, 0, field793);
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method100() {
		if (field357 == 2) {
			method171((field205 - field231 << 7) + field208, (field206 - field232 << 7) + field209, field207 * 2);

			if (field402 > -1 && field456 % 20 < 10) {
				field249[0].method400(field403 - 28, field402 - 12);
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method101(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.d(I)V")
	public final void method102() {
		if (field326 || field524 || field201) {
			method71();
		} else {
			field404++;

			if (field395) {
				method99();
			} else {
				method162(false);
			}

			field349 = 0;
		}
	}

	@ObfuscatedName("client.a(LTKPFKOXP;II)V")
	public final void method103(TKPFKOXP arg0, int arg1) {
		int var3 = arg0.method540(8);
		if (var3 < field408) {
			for (int var4 = var3; var4 < field408; var4++) {
				field517[field516++] = field409[var4];
			}
		}

		if (var3 > field408) {
			signlink.reporterror(field387 + " Too many players");
			throw new RuntimeException("eek");
		}

		field408 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field409[var5];
			TINBLEHZ var7 = field407[var6];
			int var8 = arg0.method540(1);
			if (var8 == 0) {
				field409[field408++] = var6;
				var7.field25 = field456;
			} else {
				int var9 = arg0.method540(2);
				if (var9 == 0) {
					field409[field408++] = var6;
					var7.field25 = field456;
					field411[field410++] = var6;
				} else if (var9 == 1) {
					field409[field408++] = var6;
					var7.field25 = field456;
					int var10 = arg0.method540(3);
					var7.method9(var10, false);
					int var11 = arg0.method540(1);
					if (var11 == 1) {
						field411[field410++] = var6;
					}
				} else if (var9 == 2) {
					field409[field408++] = var6;
					var7.field25 = field456;
					int var12 = arg0.method540(3);
					var7.method9(var12, true);
					int var13 = arg0.method540(3);
					var7.method9(var13, true);
					int var14 = arg0.method540(1);
					if (var14 == 1) {
						field411[field410++] = var6;
					}
				} else if (var9 == 3) {
					field517[field516++] = var6;
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

	@ObfuscatedName("client.e(II)V")
	public final void method104(int arg0) {
		if (!field503) {
			for (int var2 = 0; var2 < field525.length; var2++) {
				int var3 = field525[var2];
				if (GHWCMNQP.field759[var3] >= arg0) {
					NPZZPPRD var4 = GHWCMNQP.field753[var3];
					int var5 = var4.field1090 * var4.field1089 - 1;
					int var6 = field299 * var4.field1089 * 2;
					byte[] var7 = var4.field1087;
					byte[] var8 = field579;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1087 = var8;
					field579 = var7;
					GHWCMNQP.method233(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field580.method421(arg3, arg4);
		field581.method421(arg0 + arg3 - 16, arg4);
		IBBQNXJX.method256(arg4, 16, arg3 + 16, field598, arg0 - 32);
		int var6 = (arg0 - 32) * arg0 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg1 / (arg2 - arg0);
		IBBQNXJX.method256(arg4, 16, arg3 + var7 + 16, field268, var6);
		IBBQNXJX.method261(var6, arg3 + var7 + 16, arg4, field222);
		IBBQNXJX.method261(var6, arg3 + var7 + 16, arg4 + 1, field222);
		IBBQNXJX.method259(16, arg4, arg3 + var7 + 16, field222);
		IBBQNXJX.method259(16, arg4, arg3 + var7 + 17, field222);
		IBBQNXJX.method261(var6, arg3 + var7 + 16, arg4 + 15, field218);
		IBBQNXJX.method261(var6 - 1, arg3 + 17 + var7, arg4 + 14, field218);
		IBBQNXJX.method259(16, arg4, arg3 + var7 + var6 + 15, field218);
		IBBQNXJX.method259(15, arg4 + 1, arg3 + 14 + var7 + var6, field218);
	}

	@ObfuscatedName("client.j(B)V")
	public final void method106() {
		for (BHRFVUZN var1 = (BHRFVUZN) field369.method509(); var1 != null; var1 = (BHRFVUZN) field369.method511()) {
			if (var1.field78 == -1) {
				var1.field82 = 0;
				method63(var1);
			} else {
				var1.method588();
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method107() {
		while (true) {
			int var1 = method250();
			if (var1 == -1) {
				return;
			}

			if (field370 != -1 && field438 == field370) {
				if (var1 == 8 && field276.length() > 0) {
					field276 = field276.substring(0, field276.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field276.length() < 12) {
					field276 = field276 + (char) var1;
				}
			} else if (field560) {
				if (var1 >= 32 && var1 <= 122 && field554.length() < 80) {
					field554 = field554 + (char) var1;
					field284 = true;
				}

				if (var1 == 8 && field554.length() > 0) {
					field554 = field554.substring(0, field554.length() - 1);
					field284 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field560 = false;
					field284 = true;

					if (field300 == 1) {
						long var2 = DQKGVELR.method182(field554);
						method139(var2);
					}

					if (field300 == 2 && field385 > 0) {
						long var4 = DQKGVELR.method182(field554);
						method108(var4);
					}

					if (field300 == 3 && field554.length() > 0) {
						field511.method518(28);
						field511.method519(0);
						int var6 = field511.field1382;
						field511.method525(field257);
						YXRFKVAX.method590(field511, field554);
						field511.method528(field511.field1382 - var6);
						field554 = YXRFKVAX.method591(field554);
						field554 = IHSJPYKH.method281(field554);
						method111(field554, 6, DQKGVELR.method186(DQKGVELR.method183(field257)));

						if (field334 == 2) {
							field334 = 1;
							field538 = true;
							field511.method518(14);
							field511.method519(field536);
							field511.method519(field334);
							field511.method519(field496);
						}
					}

					if (field300 == 4 && field482 < 100) {
						long var7 = DQKGVELR.method182(field554);
						method42(var7);
					}

					if (field300 == 5 && field482 > 0) {
						long var9 = DQKGVELR.method182(field554);
						method66(var9);
					}
				}
			} else if (field506 == 1) {
				if (var1 >= 48 && var1 <= 57 && field572.length() < 10) {
					field572 = field572 + (char) var1;
					field284 = true;
				}

				if (var1 == 8 && field572.length() > 0) {
					field572 = field572.substring(0, field572.length() - 1);
					field284 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field572.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field572);
						} catch (Exception var21) {
						}

						field511.method518(234);
						field511.method523(var11);
					}

					field506 = 0;
					field284 = true;
				}
			} else if (field506 == 2) {
				if (var1 >= 32 && var1 <= 122 && field572.length() < 12) {
					field572 = field572 + (char) var1;
					field284 = true;
				}

				if (var1 == 8 && field572.length() > 0) {
					field572 = field572.substring(0, field572.length() - 1);
					field284 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field572.length() > 0) {
						field511.method518(224);
						field511.method525(DQKGVELR.method182(field572));
					}

					field506 = 0;
					field284 = true;
				}
			} else if (field506 == 3) {
				if (var1 >= 32 && var1 <= 122 && field572.length() < 40) {
					field572 = field572 + (char) var1;
					field284 = true;
				}

				if (var1 == 8 && field572.length() > 0) {
					field572 = field572.substring(0, field572.length() - 1);
					field284 = true;
				}
			} else if (field434 == -1 && field243 == -1) {
				if (var1 >= 32 && var1 <= 122 && field468.length() < 80) {
					field468 = field468 + (char) var1;
					field284 = true;
				}

				if (var1 == 8 && field468.length() > 0) {
					field468 = field468.substring(0, field468.length() - 1);
					field284 = true;
				}

				if ((var1 == 13 || var1 == 10) && field468.length() > 0) {
					if (field563 == 2) {
						if (field468.equals("::clientdrop")) {
							method58();
						}

						if (field468.equals("::lag")) {
							method84();
						}

						if (field468.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field303.method221(2); var12++) {
								field303.method213((byte) 1, var12, 2);
							}
						}

						if (field468.equals("::fpson")) {
							field457 = true;
						}

						if (field468.equals("::fpsoff")) {
							field457 = false;
						}

						if (field468.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field265[var13].field1415[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field468.startsWith("::")) {
						field511.method518(235);
						field511.method519(field468.length() - 1);
						field511.method526(field468.substring(2));
					} else {
						String var16 = field468.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field468 = field468.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field468 = field468.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field468 = field468.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field468 = field468.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field468 = field468.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field468 = field468.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field468 = field468.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field468 = field468.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field468 = field468.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field468 = field468.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field468 = field468.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field468 = field468.substring(6);
						}

						String var18 = field468.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field468 = field468.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field468 = field468.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field468 = field468.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field468 = field468.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field468 = field468.substring(6);
						}

						field511.method518(175);
						field511.method519(0);
						int var20 = field511.field1382;
						field511.method519(var17);
						field396.field1382 = 0;
						YXRFKVAX.method590(field396, field468);
						field511.method527(0, field396.field1381, field396.field1382);
						field511.method545(var19);
						field511.method528(field511.field1382 - var20);
						field468 = YXRFKVAX.method591(field468);
						field468 = IHSJPYKH.method281(field468);
						field204.field38 = field468;
						field204.field41 = var17;
						field204.field37 = var19;
						field204.field40 = 150;

						if (field563 == 2) {
							method111(field204.field38, 2, "@cr2@" + field204.field1380);
						} else if (field563 == 1) {
							method111(field204.field38, 2, "@cr1@" + field204.field1380);
						} else {
							method111(field204.field38, 2, field204.field1380);
						}

						if (field536 == 2) {
							field536 = 3;
							field538 = true;
							field511.method518(14);
							field511.method519(field536);
							field511.method519(field334);
							field511.method519(field496);
						}
					}

					field468 = "";
					field284 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method108(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field385; var3++) {
				if (field523[var3] == arg0) {
					field385--;
					field344 = true;

					for (int var4 = var3; var4 < field385; var4++) {
						field507[var4] = field507[var4 + 1];
						field389[var4] = field389[var4 + 1];
						field523[var4] = field523[var4 + 1];
					}

					field511.method518(142);
					field511.method525(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method109() {
		short var1 = 256;

		if (field436 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field436 > 768) {
					field602[var2] = method134(field603[var2], field604[var2], 1024 - field436);
				} else if (field436 > 256) {
					field602[var2] = field604[var2];
				} else {
					field602[var2] = method134(field604[var2], field603[var2], 256 - field436);
				}
			}
		} else if (field437 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field437 > 768) {
					field602[var3] = method134(field603[var3], field605[var3], 1024 - field437);
				} else if (field437 > 256) {
					field602[var3] = field605[var3];
				} else {
					field602[var3] = method134(field605[var3], field603[var3], 256 - field437);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field602[var4] = field603[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field610.field1[var5] = field549.field1052[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field515[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field541[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field602[var12];
					int var15 = field610.field1[var7];
					field610.field1[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field610.method2(0, 0, field793);

		for (int var16 = 0; var16 < 33920; var16++) {
			field611.field1[var16] = field550.field1052[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field515[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field541[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field602[var23];
					int var26 = field611.field1[var18];
					field611.field1[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field611.method2(0, 637, field793);
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field796 != null) {
				return new URL("http://127.0.0.1:" + (field501 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method110(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field385; var2++) {
			if (arg0.equalsIgnoreCase(field507[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field204.field1380)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;I)V")
	public final void method111(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field606 != -1) {
			field484 = arg0;
			field807 = 0;
		}

		if (field434 == -1) {
			field284 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field336[var4] = field336[var4 - 1];
			field337[var4] = field337[var4 - 1];
			field338[var4] = field338[var4 - 1];
		}

		field336[0] = arg1;
		field337[0] = arg2;
		field338[0] = arg0;
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method112(int arg0) {
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

	public final void init() {
		field500 = Integer.parseInt(getParameter("nodeid"));
		field501 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method123();
		} else {
			method116();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field502 = false;
		} else {
			field502 = true;
		}

		method247(503, 765);
	}

	@ObfuscatedName("client.g(II)Z")
	public final boolean method113(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field186[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 627) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method114() {
		int var1 = 3;
		if (field182 < 310) {
			int var2 = field179 >> 7;
			int var3 = field181 >> 7;
			int var4 = field204.field26 >> 7;
			int var5 = field204.field27 >> 7;

			if ((field499[field384][var2][var3] & 0x4) != 0) {
				var1 = field384;
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

					if ((field499[field384][var2][var3] & 0x4) != 0) {
						var1 = field384;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field499[field384][var2][var3] & 0x4) != 0) {
							var1 = field384;
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

					if ((field499[field384][var2][var3] & 0x4) != 0) {
						var1 = field384;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field499[field384][var2][var3] & 0x4) != 0) {
							var1 = field384;
						}
					}
				}
			}
		}

		if ((field499[field384][field204.field26 >> 7][field204.field27 >> 7] & 0x4) != 0) {
			var1 = field384;
		}

		return var1;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method115() {
		int var1 = method173(field179, field384, field181);
		if (var1 - field180 < 800 && (field499[field384][field179 >> 7][field181 >> 7] & 0x4) != 0) {
			return field384;
		}

		return 3;
	}

	@ObfuscatedName("client.k(B)V")
	public static final void method116() {
		JPCEPCNA.field906 = false;
		GHWCMNQP.field740 = false;
		field503 = false;
		BXGEDAMF.field114 = false;
		SOLNFIIQ.field1298 = false;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method117() {
		if (field807 == 1) {
			if (field808 >= 539 && field808 <= 573 && field809 >= 169 && field809 < 205 && field297[0] != -1) {
				field344 = true;
				field275 = 0;
				field263 = true;
			}

			if (field808 >= 569 && field808 <= 599 && field809 >= 168 && field809 < 205 && field297[1] != -1) {
				field344 = true;
				field275 = 1;
				field263 = true;
			}

			if (field808 >= 597 && field808 <= 627 && field809 >= 168 && field809 < 205 && field297[2] != -1) {
				field344 = true;
				field275 = 2;
				field263 = true;
			}

			if (field808 >= 625 && field808 <= 669 && field809 >= 168 && field809 < 203 && field297[3] != -1) {
				field344 = true;
				field275 = 3;
				field263 = true;
			}

			if (field808 >= 666 && field808 <= 696 && field809 >= 168 && field809 < 205 && field297[4] != -1) {
				field344 = true;
				field275 = 4;
				field263 = true;
			}

			if (field808 >= 694 && field808 <= 724 && field809 >= 168 && field809 < 205 && field297[5] != -1) {
				field344 = true;
				field275 = 5;
				field263 = true;
			}

			if (field808 >= 722 && field808 <= 756 && field809 >= 169 && field809 < 205 && field297[6] != -1) {
				field344 = true;
				field275 = 6;
				field263 = true;
			}

			if (field808 >= 540 && field808 <= 574 && field809 >= 466 && field809 < 502 && field297[7] != -1) {
				field344 = true;
				field275 = 7;
				field263 = true;
			}

			if (field808 >= 572 && field808 <= 602 && field809 >= 466 && field809 < 503 && field297[8] != -1) {
				field344 = true;
				field275 = 8;
				field263 = true;
			}

			if (field808 >= 599 && field808 <= 629 && field809 >= 466 && field809 < 503 && field297[9] != -1) {
				field344 = true;
				field275 = 9;
				field263 = true;
			}

			if (field808 >= 627 && field808 <= 671 && field809 >= 467 && field809 < 502 && field297[10] != -1) {
				field344 = true;
				field275 = 10;
				field263 = true;
			}

			if (field808 >= 669 && field808 <= 699 && field809 >= 466 && field809 < 503 && field297[11] != -1) {
				field344 = true;
				field275 = 11;
				field263 = true;
			}

			if (field808 >= 696 && field808 <= 726 && field809 >= 466 && field809 < 503 && field297[12] != -1) {
				field344 = true;
				field275 = 12;
				field263 = true;
			}

			if (field808 >= 724 && field808 <= 758 && field809 >= 466 && field809 < 502 && field297[13] != -1) {
				field344 = true;
				field275 = 13;
				field263 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method118(int arg0, String arg1) {
		field422 = arg0;
		field448 = arg1;
		method86();

		if (field317 == null) {
			super.method118(arg0, arg1);
		} else {
			field609.method1();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field376.method380("RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			IBBQNXJX.method257(var3 / 2 - 152, var6, 34, 304, 0x8C1111);
			IBBQNXJX.method257(var3 / 2 - 151, var6 + 1, 32, 302, 0);
			IBBQNXJX.method256(var3 / 2 - 150, arg0 * 3, var6 + 2, 0x8C1111, 30);
			IBBQNXJX.method256(arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, var6 + 2, 0, 30);
			field376.method380(arg1, var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF);
			field609.method2(171, 202, field793);

			if (field287) {
				field287 = false;

				if (!field458) {
					field610.method2(0, 0, field793);
					field611.method2(0, 637, field793);
				}

				field607.method2(0, 128, field793);
				field608.method2(371, 202, field793);
				field612.method2(265, 0, field793);
				field613.method2(265, 562, field793);
				field614.method2(171, 128, field793);
				field615.method2(171, 562, field793);
			}
		}
	}

	@ObfuscatedName("client.a(IILLOVQYTIZ;I)V")
	public final void method119(int arg0, int arg1, LOVQYTIZ arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field599 + field346 & 0x7FF;
			int var6 = OGORHYVW.field1171[var5];
			int var7 = OGORHYVW.field1172[var5];
			var6 = var6 * 256 / (field452 + 256);
			var7 = var7 * 256 / (field452 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field477.method405(20, var10, 15, 15, 20, 83 - var13 - 20, var12 + 94 + 4 - 10, 256);
		} else {
			method53(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.z(I)Ljava/net/Socket;")
	public final Socket method120(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.A(I)Ljava/lang/String;")
	public final String method121() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field796 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.l(B)V")
	public final void method122() {
		method161();

		if (field241 == 1) {
			field498[field240 / 100].method400(field239 - 8 - 4, field238 - 8 - 4);
		}

		if (field241 == 2) {
			field498[field240 / 100 + 4].method400(field239 - 8 - 4, field238 - 8 - 4);
		}

		if (field577 != -1) {
			method127(field299, field577);
			method80(0, 0, 0, IJNDWVIL.method311(field577));
		}

		if (field370 != -1) {
			method127(field299, field370);
			method80(0, 0, 0, IJNDWVIL.method311(field370));
		}

		method128();

		if (!field539) {
			method79();
			method89();
		} else if (field244 == 0) {
			method50();
		}

		if (field382 == 1) {
			field333.method400(296, 472);
		}

		if (field457) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field789 < 30 && field503) {
				var3 = 0xFF0000;
			}

			if (field789 < 20 && !field503) {
				var3 = 0xFF0000;
			}

			field375.method379(var3, var2, "Fps:" + field789, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field503) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field503) {
				int var8 = 0xFF0000;
			}

			field375.method379(0xFFFF00, var2, "Mem:" + var5 + "k", var1);
			var2 += 15;
		}

		if (field339 != 0) {
			int var9 = field339 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field375.method384("System update in: " + var10 + ":0" + var9, 329, 4, 0xFFFF00);
			} else {
				field375.method384("System update in: " + var10 + ":" + var9, 329, 4, 0xFFFF00);
			}

			field565++;
			if (field565 > 1696) {
				field565 = 0;
				field511.method518(11);
				field511.method519(0);
				int var11 = field511.field1382;
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method520(15088);
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method520((int) (Math.random() * 65536.0D));
				field511.method519(226);
				field511.method519((int) (Math.random() * 256.0D));
				field511.method520(61697);

				if ((int) (Math.random() * 2.0D) == 0) {
					field511.method520(35704);
				}

				field511.method528(field511.field1382 - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public static final void method123() {
		JPCEPCNA.field906 = true;
		GHWCMNQP.field740 = true;
		field503 = true;
		BXGEDAMF.field114 = true;
		SOLNFIIQ.field1298 = true;
	}

	@ObfuscatedName("client.a()V")
	public final void method124() {
		method118(20, "Starting up");

		if (signlink.sunjava) {
			field787 = 5;
		}

		if (field449) {
			field326 = true;
		} else {
			field449 = true;
			boolean var1 = false;
			String var2 = method121();
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
						field203[var3] = new ZLYJLLFY(signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, 500000);
					}
				}

				try {
					method149();
					field317 = method41(1, "title", 25, "title screen", field373[1]);
					field374 = new LICHOWDY(field317, "p11_full", false);
					field375 = new LICHOWDY(field317, "p12_full", false);
					field376 = new LICHOWDY(field317, "b12_full", false);
					field377 = new LICHOWDY(field317, "q8_full", true);
					method68();
					method81();
					JUPFHAZZ var4 = method41(2, "config", 30, "config", field373[2]);
					JUPFHAZZ var5 = method41(3, "interface", 35, "interface", field373[3]);
					JUPFHAZZ var6 = method41(4, "media", 40, "2d graphics", field373[4]);
					JUPFHAZZ var7 = method41(6, "textures", 45, "textures", field373[6]);
					JUPFHAZZ var8 = method41(7, "wordenc", 50, "chat system", field373[7]);
					JUPFHAZZ var9 = method41(8, "sounds", 55, "sound effects", field373[8]);
					field499 = new byte[4][104][104];
					field363 = new int[4][105][105];
					field401 = new JPCEPCNA(104, field363, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field265[var10] = new VDSFJUIR(104, 104);
					}

					field618 = new LOVQYTIZ(512, 512);
					JUPFHAZZ var11 = method41(5, "versionlist", 60, "update list", field373[5]);
					method118(60, "Connecting to update server");
					field303 = new FOFQGQZJ();
					field303.method206(var11, this);
					OYJABRDD.method463(field303.method209());
					OGORHYVW.method430(field303.method221(0), field303);

					if (!field503) {
						field488 = 0;
						field489 = true;
						field303.method208(2, field488);

						while (field303.method207() > 0) {
							method145();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field303.field728 > 3) {
								method159("ondemand");
								return;
							}
						}
					}

					method118(65, "Requesting animations");
					int var12 = field303.method221(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field303.method208(1, var13);
					}

					while (field303.method207() > 0) {
						int var14 = var12 - field303.method207();
						if (var14 > 0) {
							method118(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method145();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field303.field728 > 3) {
							method159("ondemand");
							return;
						}
					}

					method118(70, "Requesting models");
					int var15 = field303.method221(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field303.method212(var16);
						if ((var17 & 0x1) != 0) {
							field303.method208(0, var16);
						}
					}

					int var18 = field303.method207();
					while (field303.method207() > 0) {
						int var19 = var18 - field303.method207();
						if (var19 > 0) {
							method118(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method145();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field203[0] != null) {
						method118(75, "Requesting maps");
						field303.method208(3, field303.method217(0, 48, 47));
						field303.method208(3, field303.method217(1, 48, 47));
						field303.method208(3, field303.method217(0, 48, 48));
						field303.method208(3, field303.method217(1, 48, 48));
						field303.method208(3, field303.method217(0, 48, 49));
						field303.method208(3, field303.method217(1, 48, 49));
						field303.method208(3, field303.method217(0, 47, 47));
						field303.method208(3, field303.method217(1, 47, 47));
						field303.method208(3, field303.method217(0, 47, 48));
						field303.method208(3, field303.method217(1, 47, 48));
						field303.method208(3, field303.method217(0, 148, 48));
						field303.method208(3, field303.method217(1, 148, 48));
						int var20 = field303.method207();
						while (field303.method207() > 0) {
							int var21 = var20 - field303.method207();
							if (var21 > 0) {
								method118(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method145();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field303.method221(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field303.method212(var23);
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
							field303.method213(var25, var23, 0);
						}
					}

					field303.method216(field502);

					if (!field503) {
						int var26 = field303.method221(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field303.method222(var27)) {
								field303.method213((byte) 1, var27, 2);
							}
						}
					}

					method118(80, "Unpacking media");
					field431 = new NPZZPPRD(var6, "invback", 0);
					field433 = new NPZZPPRD(var6, "chatback", 0);
					field432 = new NPZZPPRD(var6, "mapback", 0);
					field269 = new NPZZPPRD(var6, "backbase1", 0);
					field270 = new NPZZPPRD(var6, "backbase2", 0);
					field271 = new NPZZPPRD(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field601[var28] = new NPZZPPRD(var6, "sideicons", var28);
					}

					field292 = new LOVQYTIZ(var6, "compass", 0);
					field477 = new LOVQYTIZ(var6, "mapedge", 0);
					field477.method397();

					for (int var29 = 0; var29 < 72; var29++) {
						field490[var29] = new NPZZPPRD(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field544[var30] = new LOVQYTIZ(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field553[var31] = new LOVQYTIZ(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field190[var32] = new LOVQYTIZ(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field306[var33] = new LOVQYTIZ(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field249[var34] = new LOVQYTIZ(var6, "headicons_hint", var34);
					}

					field333 = new LOVQYTIZ(var6, "overlay_multiway", 0);
					field508 = new LOVQYTIZ(var6, "mapmarker", 0);
					field509 = new LOVQYTIZ(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field498[var35] = new LOVQYTIZ(var6, "cross", var35);
					}

					field491 = new LOVQYTIZ(var6, "mapdots", 0);
					field492 = new LOVQYTIZ(var6, "mapdots", 1);
					field493 = new LOVQYTIZ(var6, "mapdots", 2);
					field494 = new LOVQYTIZ(var6, "mapdots", 3);
					field495 = new LOVQYTIZ(var6, "mapdots", 4);
					field580 = new NPZZPPRD(var6, "scrollbar", 0);
					field581 = new NPZZPPRD(var6, "scrollbar", 1);
					field258 = new NPZZPPRD(var6, "redstone1", 0);
					field259 = new NPZZPPRD(var6, "redstone2", 0);
					field260 = new NPZZPPRD(var6, "redstone3", 0);
					field261 = new NPZZPPRD(var6, "redstone1", 0);
					field261.method418();
					field262 = new NPZZPPRD(var6, "redstone2", 0);
					field262.method418();
					field279 = new NPZZPPRD(var6, "redstone1", 0);
					field279.method419();
					field280 = new NPZZPPRD(var6, "redstone2", 0);
					field280.method419();
					field281 = new NPZZPPRD(var6, "redstone3", 0);
					field281.method419();
					field282 = new NPZZPPRD(var6, "redstone1", 0);
					field282.method418();
					field282.method419();
					field283 = new NPZZPPRD(var6, "redstone2", 0);
					field283.method418();
					field283.method419();

					for (int var36 = 0; var36 < 2; var36++) {
						field378[var36] = new NPZZPPRD(var6, "mod_icons", var36);
					}

					LOVQYTIZ var37 = new LOVQYTIZ(var6, "backleft1", 0);
					field191 = new AKBGAGNS(var37.field1054, method85(), var37.field1053);
					var37.method398(0, 0);
					LOVQYTIZ var38 = new LOVQYTIZ(var6, "backleft2", 0);
					field192 = new AKBGAGNS(var38.field1054, method85(), var38.field1053);
					var38.method398(0, 0);
					LOVQYTIZ var39 = new LOVQYTIZ(var6, "backright1", 0);
					field193 = new AKBGAGNS(var39.field1054, method85(), var39.field1053);
					var39.method398(0, 0);
					LOVQYTIZ var40 = new LOVQYTIZ(var6, "backright2", 0);
					field194 = new AKBGAGNS(var40.field1054, method85(), var40.field1053);
					var40.method398(0, 0);
					LOVQYTIZ var41 = new LOVQYTIZ(var6, "backtop1", 0);
					field195 = new AKBGAGNS(var41.field1054, method85(), var41.field1053);
					var41.method398(0, 0);
					LOVQYTIZ var42 = new LOVQYTIZ(var6, "backvmid1", 0);
					field196 = new AKBGAGNS(var42.field1054, method85(), var42.field1053);
					var42.method398(0, 0);
					LOVQYTIZ var43 = new LOVQYTIZ(var6, "backvmid2", 0);
					field197 = new AKBGAGNS(var43.field1054, method85(), var43.field1053);
					var43.method398(0, 0);
					LOVQYTIZ var44 = new LOVQYTIZ(var6, "backvmid3", 0);
					field198 = new AKBGAGNS(var44.field1054, method85(), var44.field1053);
					var44.method398(0, 0);
					LOVQYTIZ var45 = new LOVQYTIZ(var6, "backhmid2", 0);
					field199 = new AKBGAGNS(var45.field1054, method85(), var45.field1053);
					var45.method398(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field544[var50] != null) {
							field544[var50].method396(var48 + var49, var47 + var49, var46 + var49);
						}

						if (field490[var50] != null) {
							field490[var50].method420(var48 + var49, var47 + var49, var46 + var49);
						}
					}

					method118(83, "Unpacking textures");
					GHWCMNQP.method231(var7);
					GHWCMNQP.method235(0.8D);
					GHWCMNQP.method230(20);
					method118(86, "Unpacking config");
					KSVXFIAD.method374(var4);
					SOLNFIIQ.method497(var4);
					FBZMYCDC.method197(var4);
					SNJEZIDX.method493(var4);
					YXSRFNQD.method592(var4);
					NTHXISGN.method423(var4);
					HTOEUNMD.method243(var4);
					RGMKWKCG.method474(var4);
					UDCHKCCJ.method568(var4);
					SNJEZIDX.field1253 = field502;

					if (!field503) {
						method118(90, "Unpacking sounds");
						byte[] var51 = var9.method372("sounds.dat", null);
						TKPFKOXP var52 = new TKPFKOXP(var51);
						SHTECHVG.method476(var52);
					}

					method118(95, "Unpacking interfaces");
					LICHOWDY[] var53 = new LICHOWDY[] { field374, field375, field376, field377 };
					IJNDWVIL.method315(var5, var53, var6);
					method118(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field432.field1087[field432.field1089 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field335[var54] = var55;
						field423[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field432.field1087[field432.field1089 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field367[var58 - 5] = var59 - 25;
						field522[var58 - 5] = var60 - var59;
					}

					GHWCMNQP.method228(765, 503);
					field394 = GHWCMNQP.field751;
					GHWCMNQP.method228(479, 96);
					field391 = GHWCMNQP.field751;
					GHWCMNQP.method228(190, 261);
					field392 = GHWCMNQP.field751;
					GHWCMNQP.method228(512, 334);
					field393 = GHWCMNQP.field751;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = GHWCMNQP.field749[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					JPCEPCNA.method356(var62, 800, 512, 334, 500);
					IHSJPYKH.method271(var8);
					field446 = new PDGRVIXR(this);
					method154(field446, 10);
					BMMXGYBV.field95 = this;
					SOLNFIIQ.field1323 = this;
					YXSRFNQD.field1500 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field448 + " " + field422);
					field524 = true;
				}
			} else {
				field201 = true;
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method125(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field401.method346(arg3, arg2, arg0);
		if (var6 != 0) {
			int var7 = field401.method350(arg3, arg2, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field618.field1052;
			int var12 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SOLNFIIQ var14 = SOLNFIIQ.method499(var13);
			if (var14.field1307 == -1) {
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
				NPZZPPRD var15 = field490[var14.field1307];
				if (var15 != null) {
					int var16 = (var14.field1284 * 4 - var15.field1089) / 2;
					int var17 = (var14.field1326 * 4 - var15.field1090) / 2;
					var15.method421((104 - arg0 - var14.field1326) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field401.method348(arg3, arg2, arg0);
		if (var18 != 0) {
			int var19 = field401.method350(arg3, arg2, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SOLNFIIQ var23 = SOLNFIIQ.method499(var22);
			if (var23.field1307 != -1) {
				NPZZPPRD var24 = field490[var23.field1307];
				if (var24 != null) {
					int var25 = (var23.field1284 * 4 - var24.field1089) / 2;
					int var26 = (var23.field1326 * 4 - var24.field1090) / 2;
					var24.method421((104 - arg0 - var23.field1326) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field618.field1052;
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

		int var30 = field401.method349(arg3, arg2, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SOLNFIIQ var32 = SOLNFIIQ.method499(var31);
			if (var32.field1307 != -1) {
				NPZZPPRD var33 = field490[var32.field1307];
				if (var33 != null) {
					int var34 = (var32.field1284 * 4 - var33.field1089) / 2;
					int var35 = (var32.field1326 * 4 - var33.field1090) / 2;
					var33.method421((104 - arg0 - var32.field1326) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBI)Z")
	public final boolean method127(int arg0, int arg1) {
		boolean var3 = false;
		IJNDWVIL var4 = IJNDWVIL.method311(arg1);
		for (int var5 = 0; var5 < var4.field874.length && var4.field874[var5] != -1; var5++) {
			IJNDWVIL var6 = IJNDWVIL.method311(var4.field874[var5]);
			if (var6.field894 == 0) {
				var3 |= method127(arg0, var6.field864);
			}

			if (var6.field894 == 6 && (var6.field845 != -1 || var6.field846 != -1)) {
				boolean var7 = method150(var6);
				int var8;
				if (var7) {
					var8 = var6.field846;
				} else {
					var8 = var6.field845;
				}

				if (var8 != -1) {
					KSVXFIAD var9 = KSVXFIAD.field1002[var8];
					var6.field889 += arg0;
					while (var6.field889 > var9.method375(var6.field861)) {
						var6.field889 -= var9.method375(var6.field861) + 1;
						var6.field861++;
						if (var6.field861 >= var9.field1003) {
							var6.field861 -= var9.field1007;
							if (var6.field861 < 0 || var6.field861 >= var9.field1003) {
								var6.field861 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field894 == 6 && var6.field876 != 0) {
				int var10 = var6.field876 >> 16;
				int var11 = var6.field876 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field867 = var6.field867 + var10 & 0x7FF;
				var6.field868 = var6.field868 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method128() {
		field530 = 0;
		int var1 = (field204.field26 >> 7) + field231;
		int var2 = (field204.field27 >> 7) + field232;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field530 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field530 = 1;
		}

		if (field530 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field530 = 0;
		}
	}

	@ObfuscatedName("client.b(IZI)V")
	public final void method129(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field338[var4] != null) {
				int var5 = field336[var4];
				int var6 = field497 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field337[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field536 == 0 || field536 == 1 && method110(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field204.field1380)) {
						if (field563 >= 1) {
							field451[field569] = "Report abuse @whi@" + var7;
							field186[field569] = 471;
							field569++;
						}

						field451[field569] = "Add ignore @whi@" + var7;
						field186[field569] = 608;
						field569++;
						field451[field569] = "Add friend @whi@" + var7;
						field186[field569] = 627;
						field569++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field340 == 0 && (var5 == 7 || field334 == 0 || field334 == 1 && method110(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field563 >= 1) {
							field451[field569] = "Report abuse @whi@" + var7;
							field186[field569] = 471;
							field569++;
						}

						field451[field569] = "Add ignore @whi@" + var7;
						field186[field569] = 608;
						field569++;
						field451[field569] = "Add friend @whi@" + var7;
						field186[field569] = 627;
						field569++;
					}

					var3++;
				}

				if (var5 == 4 && (field496 == 0 || field496 == 1 && method110(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field451[field569] = "Accept trade @whi@" + var7;
						field186[field569] = 404;
						field569++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field340 == 0 && field334 < 2) {
					var3++;
				}

				if (var5 == 8 && (field496 == 0 || field496 == 1 && method110(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field451[field569] = "Accept challenge @whi@" + var7;
						field186[field569] = 394;
						field569++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method130(boolean arg0) {
		for (int var2 = 0; var2 < field398; var2++) {
			ZHNLOFBM var3 = field397[field399[var2]];
			int var4 = (field399[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method8() && var3.field1510.field1480 == arg0 && var3.field1510.method597()) {
				int var5 = var3.field26 >> 7;
				int var6 = var3.field27 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field36 == 1 && (var3.field26 & 0x7F) == 0x40 && (var3.field27 & 0x7F) == 0x40) {
						if (field483[var5][var6] == field364) {
							continue;
						}

						field483[var5][var6] = field364;
					}

					if (!var3.field1510.field1502) {
						var4 += Integer.MIN_VALUE;
					}

					field401.method331(var3.field27, method173(var3.field26, field384, var3.field27), var3.field28, var3.field26, field384, (var3.field36 - 1) * 64 + 60, var4, var3.field34, var3);
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method131() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field541[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field541[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field542[var10] = (field541[var10 - 1] + field541[var10 + 1] + field541[var10 - 128] + field541[var10 + 128]) / 4;
			}
		}

		field381 += 128;
		if (field381 > field504.length) {
			field381 -= field504.length;
			int var11 = (int) (Math.random() * 12.0D);
			method64(field266[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field542[var14 + 128] - field504[field381 + var14 & field504.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field541[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field515[var16] = field515[var16 + 1];
		}

		field515[var1 - 1] = (int) (Math.sin(field456 / 14.0D) * 16.0D + Math.sin(field456 / 15.0D) * 14.0D + Math.sin(field456 / 16.0D) * 12.0D);

		if (field436 > 0) {
			field436 -= 4;
		}

		if (field437 > 0) {
			field437 -= 4;
		}

		if (field436 == 0 && field437 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field436 = 1024;
			}

			if (var17 == 1) {
				field437 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method132() {
		field440 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field458) {
				field290++;
				method131();
				method131();
				method109();
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

		field440 = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method133() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method134(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method135() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.E(I)V")
	public final void method136() {
		if (field256 == 2) {
			for (BHRFVUZN var1 = (BHRFVUZN) field369.method509(); var1 != null; var1 = (BHRFVUZN) field369.method511()) {
				if (var1.field78 > 0) {
					var1.field78--;
				}

				if (var1.field78 != 0) {
					if (var1.field82 > 0) {
						var1.field82--;
					}

					if (var1.field82 == 0 && var1.field73 >= 1 && var1.field74 >= 1 && var1.field73 <= 102 && var1.field74 <= 102 && (var1.field79 < 0 || BXGEDAMF.method27(var1.field81, var1.field79))) {
						method43(var1.field81, var1.field80, var1.field79, var1.field74, var1.field71, var1.field73, var1.field72);
						var1.field82 = -1;

						if (var1.field79 == var1.field75 && var1.field75 == -1) {
							var1.method588();
						} else if (var1.field79 == var1.field75 && var1.field80 == var1.field76 && var1.field81 == var1.field77) {
							var1.method588();
						}
					}
				} else if (var1.field75 < 0 || BXGEDAMF.method27(var1.field77, var1.field75)) {
					method43(var1.field77, var1.field76, var1.field75, var1.field74, var1.field71, var1.field73, var1.field72);
					var1.method588();
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method137() {
		try {
			if (field302 != null) {
				field302.method468();
			}
		} catch (Exception var2) {
		}

		field302 = null;
		field395 = false;
		field576 = 0;
		field387 = "";
		field388 = "";
		method172();
		field401.method320();

		for (int var1 = 0; var1 < 4; var1++) {
			field265[var1].method570();
		}

		System.gc();
		method133();
		field537 = -1;
		field488 = -1;
		field400 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;)V")
	public final void method138(String arg0, String arg1) {
		if (field312 != null) {
			field312.method1();
			GHWCMNQP.field751 = field393;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field375.method380(arg0, 257, var3, 0);
			field375.method380(arg0, 256, var3 - 1, 0xFFFFFF);
			var3 += 15;
			if (arg1 != null) {
				field375.method380(arg1, 257, var3, 0);
				field375.method380(arg1, 256, var3 - 1, 0xFFFFFF);
			}

			field312.method2(4, 4, field793);
		} else if (field794 != null) {
			field794.method1();
			GHWCMNQP.field751 = field394;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			IBBQNXJX.method256(383 - var5 / 2, var5, var4 - var6 / 2 - 5, 0, var6);
			IBBQNXJX.method257(383 - var5 / 2, var4 - 5 - var6 / 2, var6, var5, 0xFFFFFF);

			if (arg1 != null) {
				var4 -= 7;
			}

			field375.method380(arg0, 383, var4, 0);
			field375.method380(arg0, 382, var4 - 1, 0xFFFFFF);
			var4 += 15;
			if (arg1 != null) {
				field375.method380(arg1, 383, var4, 0);
				field375.method380(arg1, 382, var4 - 1, 0xFFFFFF);
			}

			field794.method2(0, 0, field793);
		}
	}

	@ObfuscatedName("client.b(JB)V")
	public final void method139(long arg0) {
		if (arg0 != 0L) {
			if (field385 >= 100 && field325 != 1) {
				method111("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field385 >= 200) {
				method111("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = DQKGVELR.method186(DQKGVELR.method183(arg0));
				for (int var4 = 0; var4 < field385; var4++) {
					if (field523[var4] == arg0) {
						method111(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field482; var5++) {
					if (field450[var5] == arg0) {
						method111("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field204.field1380)) {
					field507[field385] = var3;
					field523[field385] = arg0;
					field389[field385] = 0;
					field385++;
					field344 = true;
					field511.method518(172);
					field511.method525(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIILIJNDWVIL;)V")
	public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, IJNDWVIL arg7) {
		if (field562) {
			field547 = 32;
		} else {
			field547 = 0;
		}

		field562 = false;
		if (arg5 >= arg6 && arg5 < arg6 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg7.field857 -= field349 * 4;

			if (arg4 == 1) {
				field344 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field284 = true;
			}
		} else if (arg5 >= arg6 && arg5 < arg6 + 16 && arg3 >= arg0 + arg1 - 16 && arg3 < arg0 + arg1) {
			arg7.field857 += field349 * 4;

			if (arg4 == 1) {
				field344 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field284 = true;
			}
		} else if (arg5 >= arg6 - field547 && arg5 < arg6 + field547 + 16 && arg3 >= arg1 + 16 && arg3 < arg0 + arg1 - 16 && field349 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg1 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg7.field857 = (arg2 - arg0) * var10 / var11;

			if (arg4 == 1) {
				field344 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field284 = true;
			}

			field562 = true;
		}
	}

	@ObfuscatedName("client.a(BILTKPFKOXP;)V")
	public final void method141(int arg0, TKPFKOXP arg1) {
		while (arg1.field1383 + 21 < arg0 * 8) {
			int var3 = arg1.method540(14);
			if (var3 == 16383) {
				break;
			}

			if (field397[var3] == null) {
				field397[var3] = new ZHNLOFBM();
			}

			ZHNLOFBM var4 = field397[var3];
			field399[field398++] = var3;
			var4.field25 = field456;
			int var5 = arg1.method540(1);
			if (var5 == 1) {
				field411[field410++] = var3;
			}

			int var6 = arg1.method540(1);
			var4.field1510 = YXSRFNQD.method598(arg1.method540(13));
			int var7 = arg1.method540(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method540(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field36 = var4.field1510.field1492;
			var4.field29 = var4.field1510.field1470;
			var4.field21 = var4.field1510.field1483;
			var4.field22 = var4.field1510.field1498;
			var4.field23 = var4.field1510.field1497;
			var4.field24 = var4.field1510.field1473;
			var4.field60 = var4.field1510.field1477;
			var4.method7(field204.field57[0] + var8, var6 == 1, field204.field58[0] + var7);
		}

		arg1.method541();
	}

	@ObfuscatedName("client.a(BIIIIII)V")
	public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = OGORHYVW.field1171[var7];
			int var13 = OGORHYVW.field1172[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = OGORHYVW.field1171[var8];
			int var16 = OGORHYVW.field1172[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field179 = arg1 - var9;
		field180 = arg5 - var10;
		field181 = arg3 - var11;
		field182 = arg2;
		field183 = arg4;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method143() {
		if (field313 == null) {
			method78();
			field794 = null;
			field607 = null;
			field608 = null;
			field609 = null;
			field610 = null;
			field611 = null;
			field612 = null;
			field613 = null;
			field614 = null;
			field615 = null;
			field313 = new AKBGAGNS(96, method85(), 479);
			field311 = new AKBGAGNS(156, method85(), 172);
			IBBQNXJX.method254();
			field432.method421(0, 0);
			field310 = new AKBGAGNS(261, method85(), 190);
			field312 = new AKBGAGNS(334, method85(), 512);
			IBBQNXJX.method254();
			field212 = new AKBGAGNS(50, method85(), 496);
			field213 = new AKBGAGNS(37, method85(), 269);
			field214 = new AKBGAGNS(45, method85(), 249);
			field287 = true;
			field312.method1();
			GHWCMNQP.field751 = field393;
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public final String method144(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method145() {
		while (true) {
			BJSSVIRC var1 = field303.method204();
			if (var1 == null) {
				return;
			}

			if (var1.field83 == 0) {
				OGORHYVW.method431(var1.field87, var1.field86);

				if ((field303.method212(var1.field86) & 0x62) != 0) {
					field344 = true;

					if (field434 != -1 || field606 != -1) {
						field284 = true;
					}
				}
			}

			if (var1.field83 == 1 && var1.field87 != null) {
				OYJABRDD.method464(var1.field87);
			}

			if (var1.field83 == 2 && field488 == var1.field86 && var1.field87 != null) {
				method44(field489, var1.field87);
			}

			if (var1.field83 == 3 && field256 == 1) {
				for (int var2 = 0; var2 < field324.length; var2++) {
					if (field253[var2] == var1.field86) {
						field324[var2] = var1.field87;

						if (var1.field87 == null) {
							field253[var2] = -1;
						}

						break;
					}

					if (field254[var2] == var1.field86) {
						field242[var2] = var1.field87;

						if (var1.field87 == null) {
							field254[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field83 == 93 && field303.method219(var1.field86)) {
				BXGEDAMF.method13(new TKPFKOXP(var1.field87), field303);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)V")
	public final void method146(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field556 = 0;
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

			field556 = 0;
			label46: for (int var7 = 0; var7 < SNJEZIDX.field1246; var7++) {
				SNJEZIDX var8 = SNJEZIDX.method482(var7);
				if (var8.field1240 == -1 && var8.field1243 != null) {
					String var9 = var8.field1243.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field557[field556] = var9;
					field558[field556] = var7;
					field556++;
					if (field556 >= field557.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method147() {
		if (!field326 && !field524 && !field201) {
			field456++;

			if (field395) {
				method75();
			} else {
				method45();
			}

			method145();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method148() {
		field311.method1();

		if (field220 == 2) {
			byte[] var1 = field432.field1087;
			int[] var2 = IBBQNXJX.field815;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field292.method404(0, 256, 0, field335, field346, field423, 33, 33, 25, 25);
			field312.method1();
			GHWCMNQP.field751 = field393;
		} else {
			int var5 = field599 + field346 & 0x7FF;
			int var6 = field204.field26 / 32 + 48;
			int var7 = 464 - field204.field27 / 32;
			field618.method404(5, field452 + 256, 25, field367, var5, field522, 151, 146, var7, var6);
			field292.method404(0, 256, 0, field335, field346, field423, 33, 33, 25, 25);

			for (int var8 = 0; var8 < field478; var8++) {
				int var9 = field479[var8] * 4 + 2 - field204.field26 / 32;
				int var10 = field480[var8] * 4 + 2 - field204.field27 / 32;
				method53(field439[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					SXQMCHPP var13 = field543[field384][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field204.field26 / 32;
						int var15 = var12 * 4 + 2 - field204.field27 / 32;
						method53(field491, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field398; var16++) {
				ZHNLOFBM var17 = field397[field399[var16]];
				if (var17 != null && var17.method8()) {
					YXSRFNQD var18 = var17.field1510;
					if (var18.field1481 != null) {
						var18 = var18.method593();
					}

					if (var18 != null && var18.field1487 && var18.field1502) {
						int var19 = var17.field26 / 32 - field204.field26 / 32;
						int var20 = var17.field27 / 32 - field204.field27 / 32;
						method53(field492, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field408; var21++) {
				TINBLEHZ var22 = field407[field409[var21]];
				if (var22 != null && var22.method8()) {
					int var23 = var22.field26 / 32 - field204.field26 / 32;
					int var24 = var22.field27 / 32 - field204.field27 / 32;
					boolean var25 = false;
					long var26 = DQKGVELR.method182(var22.field1380);
					for (int var28 = 0; var28 < field385; var28++) {
						if (field523[var28] == var26 && field389[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field204.field1363 != 0 && var22.field1363 != 0 && field204.field1363 == var22.field1363) {
						var29 = true;
					}

					if (var25) {
						method53(field494, var23, var24);
					} else if (var29) {
						method53(field495, var23, var24);
					} else {
						method53(field493, var23, var24);
					}
				}
			}

			if (field357 != 0 && field456 % 20 < 10) {
				if (field357 == 1 && field568 >= 0 && field568 < field397.length) {
					ZHNLOFBM var30 = field397[field568];
					if (var30 != null) {
						int var31 = var30.field26 / 32 - field204.field26 / 32;
						int var32 = var30.field27 / 32 - field204.field27 / 32;
						method119(var32, var31, field509);
					}
				}

				if (field357 == 2) {
					int var33 = (field205 - field231) * 4 + 2 - field204.field26 / 32;
					int var34 = (field206 - field232) * 4 + 2 - field204.field27 / 32;
					method119(var34, var33, field509);
				}

				if (field357 == 10 && field217 >= 0 && field217 < field407.length) {
					TINBLEHZ var35 = field407[field217];
					if (var35 != null) {
						int var36 = var35.field26 / 32 - field204.field26 / 32;
						int var37 = var35.field27 / 32 - field204.field27 / 32;
						method119(var37, var36, field509);
					}
				}
			}

			if (field616 != 0) {
				int var38 = field616 * 4 + 2 - field204.field26 / 32;
				int var39 = field617 * 4 + 2 - field204.field27 / 32;
				method53(field508, var38, var39);
			}

			IBBQNXJX.method256(97, 3, 78, 0xFFFFFF, 3);
			field312.method1();
			GHWCMNQP.field751 = field393;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method149() {
		int var1 = 5;
		field373[8] = 0;
		int var2 = 0;
		while (field373[8] == 0) {
			String var3 = "Unknown problem";
			method118(20, "Connecting to web server");

			try {
				DataInputStream var4 = method153("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 366);
				TKPFKOXP var5 = new TKPFKOXP(new byte[40]);
				var4.readFully(var5.field1381, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field373[var6] = var5.method534();
				}

				int var7 = var5.method534();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field373[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field373[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field373[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field373[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field373[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field373[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method118(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method118(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field552 = !field552;
			}
		}
	}

	@ObfuscatedName("client.b(ILIJNDWVIL;)Z")
	public final boolean method150(IJNDWVIL arg0) {
		if (arg0.field905 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field905.length; var2++) {
			int var3 = method76(var2, arg0);
			int var4 = arg0.field849[var2];
			if (arg0.field905[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field905[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field905[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(ILYXSRFNQD;IBI)V")
	public final void method151(int arg0, YXSRFNQD arg1, int arg2, int arg3) {
		if (field569 < 400) {
			if (arg1.field1481 != null) {
				arg1 = arg1.method593();
			}

			if (arg1 != null && arg1.field1502) {
				String var5 = arg1.field1474;
				if (arg1.field1501 != 0) {
					var5 = var5 + method125(arg1.field1501, field204.field1374) + " (level-" + arg1.field1501 + ")";
				}

				if (field461 == 1) {
					field451[field569] = "Use " + field465 + " with @yel@" + var5;
					field186[field569] = 229;
					field187[field569] = arg3;
					field184[field569] = arg0;
					field185[field569] = arg2;
					field569++;
				} else if (field318 != 1) {
					if (arg1.field1488 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1488[var6] != null && !arg1.field1488[var6].equalsIgnoreCase("attack")) {
								field451[field569] = arg1.field1488[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field186[field569] = 990;
								}

								if (var6 == 1) {
									field186[field569] = 553;
								}

								if (var6 == 2) {
									field186[field569] = 672;
								}

								if (var6 == 3) {
									field186[field569] = 81;
								}

								if (var6 == 4) {
									field186[field569] = 227;
								}

								field187[field569] = arg3;
								field184[field569] = arg0;
								field185[field569] = arg2;
								field569++;
							}
						}
					}

					if (arg1.field1488 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1488[var7] != null && arg1.field1488[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1501 > field204.field1374) {
									var8 = 2000;
								}

								field451[field569] = arg1.field1488[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field186[field569] = var8 + 990;
								}

								if (var7 == 1) {
									field186[field569] = var8 + 553;
								}

								if (var7 == 2) {
									field186[field569] = var8 + 672;
								}

								if (var7 == 3) {
									field186[field569] = var8 + 81;
								}

								if (var7 == 4) {
									field186[field569] = var8 + 227;
								}

								field187[field569] = arg3;
								field184[field569] = arg0;
								field185[field569] = arg2;
								field569++;
							}
						}
					}

					field451[field569] = "Examine @yel@" + var5;
					field186[field569] = 1071;
					field187[field569] = arg3;
					field184[field569] = arg0;
					field185[field569] = arg2;
					field569++;
				} else if ((field320 & 0x2) == 2) {
					field451[field569] = field321 + " @yel@" + var5;
					field186[field569] = 764;
					field187[field569] = arg3;
					field184[field569] = arg0;
					field185[field569] = arg2;
					field569++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method152(int arg0, int arg1) {
		SXQMCHPP var3 = field543[field384][arg0][arg1];
		if (var3 == null) {
			field401.method341(field384, arg0, arg1);
		} else {
			int var4 = -99999999;
			ETOKKIHH var5 = null;
			for (ETOKKIHH var6 = (ETOKKIHH) var3.method509(); var6 != null; var6 = (ETOKKIHH) var3.method511()) {
				SNJEZIDX var7 = SNJEZIDX.method482(var6.field669);
				int var8 = var7.field1256;
				if (var7.field1249) {
					var8 = (var6.field670 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method507(var5);
			ETOKKIHH var9 = null;
			ETOKKIHH var10 = null;
			for (ETOKKIHH var11 = (ETOKKIHH) var3.method509(); var11 != null; var11 = (ETOKKIHH) var3.method511()) {
				if (var5.field669 != var11.field669 && var9 == null) {
					var9 = var11;
				}

				if (var5.field669 != var11.field669 && var9.field669 != var11.field669 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field401.method327(arg0, field384, method173(arg0 * 128 + 64, field384, arg1 * 128 + 64), var5, var12, var9, arg1, var10);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method153(String arg0) throws IOException {
		if (field552) {
			if (field575 != null) {
				try {
					field575.close();
				} catch (Exception var4) {
				}

				field575 = null;
			}

			field575 = method120(43595);
			field575.setSoTimeout(10000);
			InputStream var2 = field575.getInputStream();
			OutputStream var3 = field575.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method154(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method154(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.G(I)Z")
	public final boolean method155() {
		if (field302 == null) {
			return false;
		}

		try {
			int var1 = field302.method470();
			if (var1 == 0) {
				return false;
			}

			if (field224 == -1) {
				field302.method471(field272.field1381, 0, 1);
				field224 = field272.field1381[0] & 0xFF;
				if (field545 != null) {
					field224 = field224 - field545.method201() & 0xFF;
				}

				field223 = CJWFAPIY.field176[field224];
				var1--;
			}

			if (field223 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field302.method471(field272.field1381, 0, 1);
				field223 = field272.field1381[0] & 0xFF;
				var1--;
			}

			if (field223 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field302.method471(field272.field1381, 0, 2);
				field272.field1382 = 0;
				field223 = field272.method531();
				var1 -= 2;
			}

			if (var1 < field223) {
				return false;
			}

			field272.field1382 = 0;
			field302.method471(field272.field1381, 0, field223);
			field225 = 0;
			field520 = field519;
			field519 = field518;
			field518 = field224;

			if (field224 == 255) {
				int var2 = field272.method557();
				IJNDWVIL.method311(var2).field882 = 3;

				if (field204.field1375 == null) {
					IJNDWVIL.method311(var2).field883 = (field204.field1369[11] << 5) + (field204.field1369[8] << 10) + (field204.field1369[0] << 15) + (field204.field1366[0] << 25) + (field204.field1366[4] << 20) + field204.field1369[1];
				} else {
					IJNDWVIL.method311(var2).field883 = (int) (field204.field1375.field1486 + 0x12345678L);
				}

				field224 = -1;
				return true;
			}

			if (field224 == 165) {
				field220 = field272.method529();
				field224 = -1;
				return true;
			}

			if (field224 == 203) {
				field386 = field272.method529();
				field344 = true;
				field224 = -1;
				return true;
			}

			if (field224 == 79) {
				field584 = true;
				field416 = field272.method529();
				field417 = field272.method529();
				field418 = field272.method531();
				field419 = field272.method529();
				field420 = field272.method529();
				if (field420 >= 100) {
					int var3 = field416 * 128 + 64;
					int var4 = field417 * 128 + 64;
					int var5 = method173(var3, field384, var4) - field418;
					int var6 = var3 - field179;
					int var7 = var5 - field180;
					int var8 = var4 - field181;
					int var9 = (int) Math.sqrt(var6 * var6 + var8 * var8);
					field182 = (int) (Math.atan2(var7, var9) * 325.949D) & 0x7FF;
					field183 = (int) (Math.atan2(var6, var8) * -325.949D) & 0x7FF;

					if (field182 < 128) {
						field182 = 128;
					}

					if (field182 > 383) {
						field182 = 383;
					}
				}

				field224 = -1;
				return true;
			}

			if (field224 == 37) {
				field521 = field272.method529();
				if (field521 == field275) {
					if (field521 == 3) {
						field275 = 1;
					} else {
						field275 = 3;
					}

					field344 = true;
				}

				field224 = -1;
				return true;
			}

			if (field224 == 66) {
				field466 = field272.method531();
				field325 = field272.method547();
				field224 = -1;
				return true;
			}

			if (field224 == 72) {
				field272.method556();
				field216 = field272.method556();
				field390 = field272.method556();
				field365 = field272.method556();
				field272.method548();
				field272.method531();
				field486 = field272.method556();
				field471 = field272.method531();
				field272.method557();
				field308 = field272.method565();
				field533 = field272.method531();
				signlink.dnslookup(DQKGVELR.method185(field308));
				field224 = -1;
				return true;
			}

			if (field224 == 148) {
				field560 = false;
				field506 = 2;
				field572 = "";
				field284 = true;
				field224 = -1;
				return true;
			}

			if (field224 == 56) {
				field344 = true;
				int var10 = field272.method531();
				IJNDWVIL var11 = IJNDWVIL.method311(var10);
				while (field272.field1382 < field223) {
					int var12 = field272.method543();
					int var13 = field272.method531();
					int var14 = field272.method529();
					if (var14 == 255) {
						var14 = field272.method534();
					}

					if (var12 >= 0 && var12 < var11.field878.length) {
						var11.field878[var12] = var13;
						var11.field859[var12] = var14;
					}
				}

				field224 = -1;
				return true;
			}

			if (field224 == 215) {
				field574 = field272.method549();
				field573 = field272.method548();
				for (int var15 = field573; var15 < field573 + 8; var15++) {
					for (int var16 = field574; var16 < field574 + 8; var16++) {
						if (field543[field384][var15][var16] != null) {
							field543[field384][var15][var16] = null;
							method152(var15, var16);
						}
					}
				}

				for (BHRFVUZN var17 = (BHRFVUZN) field369.method509(); var17 != null; var17 = (BHRFVUZN) field369.method511()) {
					if (var17.field73 >= field573 && var17.field73 < field573 + 8 && var17.field74 >= field574 && var17.field74 < field574 + 8 && field384 == var17.field71) {
						var17.field78 = 0;
					}
				}

				field224 = -1;
				return true;
			}

			if (field224 == 235) {
				int var18 = field272.method558();
				if (var18 == 0xFFFF) {
					var18 = -1;
				}

				if (field537 != var18 && field531 && !field503 && field400 == 0) {
					field488 = var18;
					field489 = true;
					field303.method208(2, field488);
				}

				field537 = var18;
				field224 = -1;
				return true;
			}

			if (field224 == 179) {
				int var19 = field272.method558();
				int var20 = field272.method562();
				if (field531 && !field503) {
					field488 = var19;
					field489 = false;
					field303.method208(2, field488);
					field400 = var20;
				}

				field224 = -1;
				return true;
			}

			if (field224 == 174) {
				int var21 = field272.method556();
				method73(var21);

				if (field413 != -1) {
					method157(field413);
					field413 = -1;
					field344 = true;
					field263 = true;
				}

				if (field243 != -1) {
					method157(field243);
					field243 = -1;
					field287 = true;
				}

				if (field288 != -1) {
					method157(field288);
					field288 = -1;
				}

				if (field370 != -1) {
					method157(field370);
					field370 = -1;
				}

				if (field434 != var21) {
					method157(field434);
					field434 = var21;
				}

				field298 = false;
				field284 = true;
				field224 = -1;
				return true;
			}

			if (field224 == 111) {
				field482 = field223 / 8;
				for (int var22 = 0; var22 < field482; var22++) {
					field450[var22] = field272.method535();
				}

				field224 = -1;
				return true;
			}

			if (field224 != 44 && field224 != 110 && field224 != 58 && field224 != 40 && field224 != 145 && field224 != 90 && field224 != 146 && field224 != 142 && field224 != 33 && field224 != 16 && field224 != 197) {
				if (field224 == 64) {
					int var23 = field272.method557();
					int var24 = field272.method557();
					IJNDWVIL var25 = IJNDWVIL.method311(var23);
					if (var25 != null && var25.field894 == 0) {
						if (var24 < 0) {
							var24 = 0;
						}

						if (var24 > var25.field862 - var25.field880) {
							var24 = var25.field862 - var25.field880;
						}

						var25.field857 = var24;
					}

					field224 = -1;
					return true;
				}

				if (field224 == 138) {
					field584 = false;

					for (int var26 = 0; var26 < 5; var26++) {
						field366[var26] = false;
					}

					field224 = -1;
					return true;
				}

				if (field224 == 247) {
					String var27 = field272.method536();
					if (var27.endsWith(":tradereq:")) {
						String var28 = var27.substring(0, var27.indexOf(":"));
						long var29 = DQKGVELR.method182(var28);
						boolean var31 = false;
						for (int var32 = 0; var32 < field482; var32++) {
							if (field450[var32] == var29) {
								var31 = true;
								break;
							}
						}

						if (!var31 && field530 == 0) {
							method111("wishes to trade with you.", 4, var28);
						}
					} else if (var27.endsWith(":duelreq:")) {
						String var33 = var27.substring(0, var27.indexOf(":"));
						long var34 = DQKGVELR.method182(var33);
						boolean var36 = false;
						for (int var37 = 0; var37 < field482; var37++) {
							if (field450[var37] == var34) {
								var36 = true;
								break;
							}
						}

						if (!var36 && field530 == 0) {
							method111("wishes to duel with you.", 8, var33);
						}
					} else if (var27.endsWith(":chalreq:")) {
						String var38 = var27.substring(0, var27.indexOf(":"));
						long var39 = DQKGVELR.method182(var38);
						boolean var41 = false;
						for (int var42 = 0; var42 < field482; var42++) {
							if (field450[var42] == var39) {
								var41 = true;
								break;
							}
						}

						if (!var41 && field530 == 0) {
							String var43 = var27.substring(var27.indexOf(":") + 1, var27.length() - 9);
							method111(var43, 8, var38);
						}
					} else {
						method111(var27, 0, "");
					}

					field224 = -1;
					return true;
				}

				if (field224 == 120) {
					field560 = false;
					field506 = 1;
					field572 = "";
					field284 = true;
					field224 = -1;
					return true;
				}

				if (field224 != 211) {
					if (field224 == 202) {
						field573 = field272.method529();
						field574 = field272.method549();
						field224 = -1;
						return true;
					}

					if (field224 == 125) {
						int var46 = field272.method531();
						IJNDWVIL var47 = IJNDWVIL.method311(var46);
						for (int var48 = 0; var48 < var47.field878.length; var48++) {
							var47.field878[var48] = -1;
							var47.field878[var48] = 0;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 204) {
						field357 = field272.method529();
						if (field357 == 1) {
							field568 = field272.method531();
						}

						if (field357 >= 2 && field357 <= 6) {
							if (field357 == 2) {
								field208 = 64;
								field209 = 64;
							}

							if (field357 == 3) {
								field208 = 0;
								field209 = 64;
							}

							if (field357 == 4) {
								field208 = 128;
								field209 = 64;
							}

							if (field357 == 5) {
								field208 = 64;
								field209 = 0;
							}

							if (field357 == 6) {
								field208 = 64;
								field209 = 128;
							}

							field357 = 2;
							field205 = field272.method531();
							field206 = field272.method531();
							field207 = field272.method529();
						}

						if (field357 == 10) {
							field217 = field272.method531();
						}

						field224 = -1;
						return true;
					}

					if (field224 == 196) {
						int var49 = field272.method558();
						int var50 = field272.method531();
						int var51 = field272.method531();
						int var52 = field272.method558();
						IJNDWVIL.method311(var52).field867 = var50;
						IJNDWVIL.method311(var52).field868 = var51;
						IJNDWVIL.method311(var52).field866 = var49;
						field224 = -1;
						return true;
					}

					if (field224 == 112) {
						method137();
						field224 = -1;
						return false;
					}

					if (field224 == 129) {
						field339 = field272.method556() * 30;
						field224 = -1;
						return true;
					}

					if (field224 == 124) {
						int var53 = field272.method531();
						int var54 = field272.method557();
						IJNDWVIL.method311(var54).field882 = 2;
						IJNDWVIL.method311(var54).field883 = var53;
						field224 = -1;
						return true;
					}

					if (field224 == 42) {
						byte var55 = field272.method550();
						int var56 = field272.method558();
						field454[var56] = var55;

						if (field472[var56] != var55) {
							field472[var56] = var55;
							method167(var56);
							field344 = true;

							if (field606 != -1) {
								field284 = true;
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 32) {
						int var57 = field272.method560();
						if (var57 >= 0) {
							method73(var57);
						}

						if (field577 != var57) {
							method157(field577);
							field577 = var57;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 81) {
						field616 = 0;
						field224 = -1;
						return true;
					}

					if (field224 == 39) {
						field574 = field272.method548();
						field573 = field272.method549();

						while (field272.field1382 < field223) {
							int var58 = field272.method529();
							method164(field272, var58);
						}

						field224 = -1;
						return true;
					}

					if (field224 == 73) {
						for (int var59 = 0; var59 < field472.length; var59++) {
							if (field472[var59] != field454[var59]) {
								field472[var59] = field454[var59];
								method167(var59);
								field344 = true;
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 95) {
						int var60 = field272.method529();
						int var61 = field272.method557();
						if (var61 == 0xFFFF) {
							var61 = -1;
						}

						if (field297[var60] != var61) {
							method157(field297[var60]);
							field297[var60] = var61;
						}

						field344 = true;
						field263 = true;
						field224 = -1;
						return true;
					}

					if (field224 == 224) {
						field275 = field272.method547();
						field344 = true;
						field263 = true;
						field224 = -1;
						return true;
					}

					if (field224 == 149) {
						int var62 = field272.method558();
						int var63 = field272.method531();
						int var64 = field272.method558();
						IJNDWVIL.method311(var62).field876 = (var64 << 16) + var63;
						field224 = -1;
						return true;
					}

					if (field224 == 136 || field224 == 244) {
						int var65 = field210;
						int var66 = field211;
						if (field224 == 136) {
							var66 = field272.method531();
							var65 = field272.method531();
							field481 = false;
						}

						if (field224 == 244) {
							field272.method539();

							for (int var67 = 0; var67 < 4; var67++) {
								for (int var68 = 0; var68 < 13; var68++) {
									for (int var69 = 0; var69 < 13; var69++) {
										int var70 = field272.method540(1);
										if (var70 == 1) {
											field264[var67][var68][var69] = field272.method540(26);
										} else {
											field264[var67][var68][var69] = -1;
										}
									}
								}
							}

							field272.method541();
							var66 = field272.method558();
							var65 = field272.method556();
							field481 = true;
						}

						if (field210 == var65 && field211 == var66 && field256 == 2) {
							field224 = -1;
							return true;
						}

						field210 = var65;
						field211 = var66;
						field231 = (field210 - 6) * 8;
						field232 = (field211 - 6) * 8;
						field597 = false;
						if ((field210 / 8 == 48 || field210 / 8 == 49) && field211 / 8 == 48) {
							field597 = true;
						}

						if (field210 / 8 == 48 && field211 / 8 == 148) {
							field597 = true;
						}

						field256 = 1;
						field277 = System.currentTimeMillis();
						method138("Loading - please wait.", null);

						if (field224 == 136) {
							int var71 = 0;
							for (int var72 = (field210 - 6) / 8; var72 <= (field210 + 6) / 8; var72++) {
								for (int var73 = (field211 - 6) / 8; var73 <= (field211 + 6) / 8; var73++) {
									var71++;
								}
							}

							field324 = new byte[var71][];
							field242 = new byte[var71][];
							field252 = new int[var71];
							field253 = new int[var71];
							field254 = new int[var71];
							int var74 = 0;
							for (int var75 = (field210 - 6) / 8; var75 <= (field210 + 6) / 8; var75++) {
								for (int var76 = (field211 - 6) / 8; var76 <= (field211 + 6) / 8; var76++) {
									field252[var74] = (var75 << 8) + var76;

									if (field597 && (var76 == 49 || var76 == 149 || var76 == 147 || var75 == 50 || var75 == 49 && var76 == 47)) {
										field253[var74] = -1;
										field254[var74] = -1;
										var74++;
									} else {
										int var77 = field253[var74] = field303.method217(0, var76, var75);
										if (var77 != -1) {
											field303.method208(3, var77);
										}

										int var78 = field254[var74] = field303.method217(1, var76, var75);
										if (var78 != -1) {
											field303.method208(3, var78);
										}

										var74++;
									}
								}
							}
						}

						if (field224 == 244) {
							int var79 = 0;
							int[] var80 = new int[676];
							for (int var81 = 0; var81 < 4; var81++) {
								for (int var82 = 0; var82 < 13; var82++) {
									for (int var83 = 0; var83 < 13; var83++) {
										int var84 = field264[var81][var82][var83];
										if (var84 != -1) {
											int var85 = var84 >> 14 & 0x3FF;
											int var86 = var84 >> 3 & 0x7FF;
											int var87 = (var85 / 8 << 8) + var86 / 8;
											for (int var88 = 0; var88 < var79; var88++) {
												if (var80[var88] == var87) {
													var87 = -1;
													break;
												}
											}

											if (var87 != -1) {
												var80[var79++] = var87;
											}
										}
									}
								}
							}

							field324 = new byte[var79][];
							field242 = new byte[var79][];
							field252 = new int[var79];
							field253 = new int[var79];
							field254 = new int[var79];
							for (int var89 = 0; var89 < var79; var89++) {
								int var90 = field252[var89] = var80[var89];
								int var91 = var90 >> 8 & 0xFF;
								int var92 = var90 & 0xFF;
								int var93 = field253[var89] = field303.method217(0, var92, var91);
								if (var93 != -1) {
									field303.method208(3, var93);
								}

								int var94 = field254[var89] = field303.method217(1, var92, var91);
								if (var94 != -1) {
									field303.method208(3, var94);
								}
							}
						}

						int var95 = field231 - field233;
						int var96 = field232 - field234;
						field233 = field231;
						field234 = field232;

						for (int var97 = 0; var97 < 16384; var97++) {
							ZHNLOFBM var98 = field397[var97];
							if (var98 != null) {
								for (int var99 = 0; var99 < 10; var99++) {
									var98.field57[var99] -= var95;
									var98.field58[var99] -= var96;
								}

								var98.field26 -= var95 * 128;
								var98.field27 -= var96 * 128;
							}
						}

						for (int var100 = 0; var100 < field405; var100++) {
							TINBLEHZ var101 = field407[var100];
							if (var101 != null) {
								for (int var102 = 0; var102 < 10; var102++) {
									var101.field57[var102] -= var95;
									var101.field58[var102] -= var96;
								}

								var101.field26 -= var95 * 128;
								var101.field27 -= var96 * 128;
							}
						}

						field251 = true;
						byte var103 = 0;
						byte var104 = 104;
						byte var105 = 1;
						if (var95 < 0) {
							var103 = 103;
							var104 = -1;
							var105 = -1;
						}

						byte var106 = 0;
						byte var107 = 104;
						byte var108 = 1;
						if (var96 < 0) {
							var106 = 103;
							var107 = -1;
							var108 = -1;
						}

						for (int var109 = var103; var109 != var104; var109 += var105) {
							for (int var110 = var106; var110 != var107; var110 += var108) {
								int var111 = var95 + var109;
								int var112 = var96 + var110;
								for (int var113 = 0; var113 < 4; var113++) {
									if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
										field543[var113][var109][var110] = field543[var113][var111][var112];
									} else {
										field543[var113][var109][var110] = null;
									}
								}
							}
						}

						for (BHRFVUZN var114 = (BHRFVUZN) field369.method509(); var114 != null; var114 = (BHRFVUZN) field369.method511()) {
							var114.field73 -= var95;
							var114.field74 -= var96;
							if (var114.field73 < 0 || var114.field74 < 0 || var114.field73 >= 104 || var114.field74 >= 104) {
								var114.method588();
							}
						}

						if (field616 != 0) {
							field616 -= var95;
							field617 -= var96;
						}

						field584 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 246) {
						if (field275 == 12) {
							field344 = true;
						}

						field429 = field272.method529();
						field224 = -1;
						return true;
					}

					if (field224 == 243) {
						int var115 = field272.method556();
						method73(var115);

						if (field413 != -1) {
							method157(field413);
							field413 = -1;
							field344 = true;
							field263 = true;
						}

						if (field434 != -1) {
							method157(field434);
							field434 = -1;
							field284 = true;
						}

						if (field243 != -1) {
							method157(field243);
							field243 = -1;
							field287 = true;
						}

						if (field288 != -1) {
							method157(field288);
							field288 = -1;
						}

						if (field370 != var115) {
							method157(field370);
							field370 = var115;
						}

						if (field506 != 0) {
							field506 = 0;
							field284 = true;
						}

						field298 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 70) {
						if (field413 != -1) {
							method157(field413);
							field413 = -1;
							field344 = true;
							field263 = true;
						}

						if (field434 != -1) {
							method157(field434);
							field434 = -1;
							field284 = true;
						}

						if (field243 != -1) {
							method157(field243);
							field243 = -1;
							field287 = true;
						}

						if (field288 != -1) {
							method157(field288);
							field288 = -1;
						}

						if (field370 != -1) {
							method157(field370);
							field370 = -1;
						}

						if (field506 != 0) {
							field506 = 0;
							field284 = true;
						}

						field298 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 36) {
						long var116 = field272.method535();
						int var118 = field272.method529();
						String var119 = DQKGVELR.method186(DQKGVELR.method183(var116));
						for (int var120 = 0; var120 < field385; var120++) {
							if (field523[var120] == var116) {
								if (field389[var120] != var118) {
									field389[var120] = var118;
									field344 = true;

									if (var118 > 0) {
										method111(var119 + " has logged in.", 5, "");
									}

									if (var118 == 0) {
										method111(var119 + " has logged out.", 5, "");
									}
								}

								var119 = null;
								break;
							}
						}

						if (var119 != null && field385 < 200) {
							field523[field385] = var116;
							field507[field385] = var119;
							field389[field385] = var118;
							field385++;
							field344 = true;
						}

						boolean var121 = false;
						while (!var121) {
							var121 = true;
							for (int var122 = 0; var122 < field385 - 1; var122++) {
								if (field389[var122] != field500 && field389[var122 + 1] == field500 || field389[var122] == 0 && field389[var122 + 1] != 0) {
									int var123 = field389[var122];
									field389[var122] = field389[var122 + 1];
									field389[var122 + 1] = var123;
									String var124 = field507[var122];
									field507[var122] = field507[var122 + 1];
									field507[var122 + 1] = var124;
									long var125 = field523[var122];
									field523[var122] = field523[var122 + 1];
									field523[var122 + 1] = var125;
									field344 = true;
									var121 = false;
								}
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 53) {
						long var127 = field272.method535();
						int var129 = field272.method534();
						int var130 = field272.method529();
						boolean var131 = false;
						for (int var132 = 0; var132 < 100; var132++) {
							if (field295[var132] == var129) {
								var131 = true;
								break;
							}
						}

						if (var130 <= 1) {
							for (int var133 = 0; var133 < field482; var133++) {
								if (field450[var133] == var127) {
									var131 = true;
									break;
								}
							}
						}

						if (!var131 && field530 == 0) {
							try {
								field295[field561] = var129;
								field561 = (field561 + 1) % 100;
								String var134 = YXRFKVAX.method589(field223 - 13, field272);
								if (var130 != 3) {
									var134 = IHSJPYKH.method281(var134);
								}

								if (var130 == 2 || var130 == 3) {
									method111(var134, 7, "@cr2@" + DQKGVELR.method186(DQKGVELR.method183(var127)));
								} else if (var130 == 1) {
									method111(var134, 7, "@cr1@" + DQKGVELR.method186(DQKGVELR.method183(var127)));
								} else {
									method111(var134, 3, DQKGVELR.method186(DQKGVELR.method183(var127)));
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 183) {
						if (field275 == 12) {
							field344 = true;
						}

						field278 = field272.method532();
						field224 = -1;
						return true;
					}

					if (field224 == 47) {
						field584 = true;
						field358 = field272.method529();
						field359 = field272.method529();
						field360 = field272.method531();
						field361 = field272.method529();
						field362 = field272.method529();
						if (field362 >= 100) {
							field179 = field358 * 128 + 64;
							field181 = field359 * 128 + 64;
							field180 = method173(field179, field384, field181) - field360;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 218) {
						field344 = true;
						int var136 = field272.method531();
						IJNDWVIL var137 = IJNDWVIL.method311(var136);
						int var138 = field272.method531();
						for (int var139 = 0; var139 < var138; var139++) {
							int var140 = field272.method547();
							if (var140 == 255) {
								var140 = field272.method564();
							}

							var137.field878[var139] = field272.method558();
							var137.field859[var139] = var140;
						}

						for (int var141 = var138; var141 < var137.field878.length; var141++) {
							var137.field878[var141] = 0;
							var137.field859[var141] = 0;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 49) {
						method37(field223, field272);
						field224 = -1;
						return true;
					}

					if (field224 == 80) {
						int var142 = field272.method558();
						int var143 = field272.method558();
						int var144 = field272.method556();
						if (var144 == 0xFFFF) {
							IJNDWVIL.method311(var142).field882 = 0;
							field224 = -1;
							return true;
						}

						SNJEZIDX var145 = SNJEZIDX.method482(var144);
						IJNDWVIL.method311(var142).field882 = 4;
						IJNDWVIL.method311(var142).field883 = var144;
						IJNDWVIL.method311(var142).field867 = var145.field1264;
						IJNDWVIL.method311(var142).field868 = var145.field1248;
						IJNDWVIL.method311(var142).field866 = var145.field1267 * 100 / var143;
						field224 = -1;
						return true;
					}

					if (field224 == 214) {
						field536 = field272.method529();
						field334 = field272.method529();
						field496 = field272.method529();
						field538 = true;
						field284 = true;
						field224 = -1;
						return true;
					}

					if (field224 == 175) {
						field344 = true;
						int var146 = field272.method564();
						int var147 = field272.method547();
						int var148 = field272.method548();
						field514[var148] = var146;
						field467[var148] = var147;
						field267[var148] = 1;
						for (int var149 = 0; var149 < 98; var149++) {
							if (var146 >= field343[var149]) {
								field267[var148] = var149 + 2;
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 172) {
						int var150 = field272.method557();
						int var151 = field272.method558();
						int var152 = var150 >> 10 & 0x1F;
						int var153 = var150 >> 5 & 0x1F;
						int var154 = var150 & 0x1F;
						IJNDWVIL.method311(var151).field879 = (var154 << 3) + (var152 << 19) + (var153 << 11);
						field224 = -1;
						return true;
					}

					if (field224 == 134) {
						int var155 = field272.method556();
						boolean var156 = field272.method548() == 1;
						IJNDWVIL.method311(var155).field890 = var156;
						field224 = -1;
						return true;
					}

					if (field224 == 189) {
						method34(field223, field272);
						field251 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 223) {
						int var157 = field272.method549();
						int var158 = field272.method549();
						String var159 = field272.method536();
						if (var158 >= 1 && var158 <= 5) {
							if (var159.equalsIgnoreCase("null")) {
								var159 = null;
							}

							field473[var158 - 1] = var159;
							field474[var158 - 1] = var157 == 0;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 141) {
						int var160 = field272.method561();
						if (field606 != var160) {
							method157(field606);
							field606 = var160;
						}

						field284 = true;
						field224 = -1;
						return true;
					}

					if (field224 == 20) {
						int var161 = field272.method531();
						int var162 = field272.method558();
						IJNDWVIL.method311(var162).field882 = 1;
						IJNDWVIL.method311(var162).field883 = var161;
						field224 = -1;
						return true;
					}

					if (field224 == 226) {
						int var163 = field272.method531();
						int var164 = field272.method558();
						method73(var164);

						if (var163 != -1) {
							method73(var163);
						}

						if (field370 != -1) {
							method157(field370);
							field370 = -1;
						}

						if (field413 != -1) {
							method157(field413);
							field413 = -1;
						}

						if (field434 != -1) {
							method157(field434);
							field434 = -1;
						}

						if (field243 != var164) {
							method157(field243);
							field243 = var164;
						}

						if (field288 != var164) {
							method157(field288);
							field288 = var163;
						}

						field506 = 0;
						field298 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 167) {
						int var165 = field272.method556();
						String var166 = field272.method536();
						IJNDWVIL.method311(var165).field853 = var166;

						if (field297[field275] == IJNDWVIL.method311(var165).field892) {
							field344 = true;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 131) {
						int var167 = field272.method564();
						int var168 = field272.method558();
						field454[var168] = var167;

						if (field472[var168] != var167) {
							field472[var168] = var167;
							method167(var168);
							field344 = true;

							if (field606 != -1) {
								field284 = true;
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 249) {
						int var169 = field272.method531();
						int var170 = field272.method561();
						int var171 = field272.method532();
						IJNDWVIL var172 = IJNDWVIL.method311(var169);
						var172.field855 = var171;
						var172.field860 = var170;
						field224 = -1;
						return true;
					}

					if (field224 == 209) {
						for (int var173 = 0; var173 < field407.length; var173++) {
							if (field407[var173] != null) {
								field407[var173].field42 = -1;
							}
						}

						for (int var174 = 0; var174 < field397.length; var174++) {
							if (field397[var174] != null) {
								field397[var174].field42 = -1;
							}
						}

						field224 = -1;
						return true;
					}

					if (field224 == 239) {
						int var175 = field272.method559();
						int var176 = field272.method531();
						IJNDWVIL var177 = IJNDWVIL.method311(var176);
						if (var177.field845 != var175 || var175 == -1) {
							var177.field845 = var175;
							var177.field861 = 0;
							var177.field889 = 0;
						}

						field224 = -1;
						return true;
					}

					if (field224 == 71) {
						field382 = field272.method529();
						field224 = -1;
						return true;
					}

					if (field224 == 92) {
						int var178 = field272.method529();
						int var179 = field272.method529();
						int var180 = field272.method529();
						int var181 = field272.method529();
						field366[var178] = true;
						field342[var178] = var179;
						field202[var178] = var180;
						field291[var178] = var181;
						field236[var178] = 0;
						field224 = -1;
						return true;
					}

					if (field224 == 221) {
						int var182 = field272.method557();
						method73(var182);

						if (field434 != -1) {
							method157(field434);
							field434 = -1;
							field284 = true;
						}

						if (field243 != -1) {
							method157(field243);
							field243 = -1;
							field287 = true;
						}

						if (field288 != -1) {
							method157(field288);
							field288 = -1;
						}

						if (field370 != -1) {
							method157(field370);
							field370 = -1;
						}

						if (field413 != var182) {
							method157(field413);
							field413 = var182;
						}

						if (field506 != 0) {
							field506 = 0;
							field284 = true;
						}

						field344 = true;
						field263 = true;
						field298 = false;
						field224 = -1;
						return true;
					}

					if (field224 == 97) {
						int var183 = field272.method531();
						int var184 = field272.method529();
						int var185 = field272.method531();
						if (var185 == 0xFFFF) {
							if (field331 < 50) {
								field200[field331] = (short) var183;
								field355[field331] = var184;
								field566[field331] = 0;
								field331++;
							}
						} else if (field470 && !field503 && field331 < 50) {
							field200[field331] = var183;
							field355[field331] = var184;
							field566[field331] = SHTECHVG.field1227[var183] + var185;
							field331++;
						}

						field224 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field224 + "," + field223 + " - " + field519 + "," + field520);
					method137();
					return true;
				}

				int var44 = field272.method531();
				int var45 = field272.method557();

				if (field434 != -1) {
					method157(field434);
					field434 = -1;
					field284 = true;
				}

				if (field243 != -1) {
					method157(field243);
					field243 = -1;
					field287 = true;
				}

				if (field288 != -1) {
					method157(field288);
					field288 = -1;
				}

				if (field370 != var45) {
					method157(field370);
					field370 = var45;
				}

				if (field413 != var44) {
					method157(field413);
					field413 = var44;
				}

				if (field506 != 0) {
					field506 = 0;
					field284 = true;
				}

				field344 = true;
				field263 = true;
				field298 = false;
				field224 = -1;
				return true;
			}

			method164(field272, field224);
			field224 = -1;
			return true;
		} catch (IOException var190) {
			method58();
		} catch (Exception var191) {
			String var187 = "T2 - " + field224 + "," + field519 + "," + field520 + " - " + field223 + "," + (field204.field57[0] + field231) + "," + (field204.field58[0] + field232) + " - ";
			for (int var188 = 0; var188 < field223 && var188 < 50; var188++) {
				var187 = var187 + field272.field1381[var188] + ",";
			}

			signlink.reporterror(var187);
			method137();
		}

		return true;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method156(boolean arg0) {
		if (field204.field26 >> 7 == field616 && field204.field27 >> 7 == field617) {
			field616 = 0;
		}

		int var2 = field408;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			TINBLEHZ var4;
			int var5;
			if (arg0) {
				var4 = field204;
				var5 = field406 << 14;
			} else {
				var4 = field407[field409[var3]];
				var5 = field409[var3] << 14;
			}

			if (var4 != null && var4.method8()) {
				var4.field1379 = false;
				if ((field503 && field408 > 50 || field408 > 200) && !arg0 && var4.field60 == var4.field48) {
					var4.field1379 = true;
				}

				int var6 = var4.field26 >> 7;
				int var7 = var4.field27 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1373 == null || field456 < var4.field1360 || field456 >= var4.field1361) {
						if ((var4.field26 & 0x7F) == 0x40 && (var4.field27 & 0x7F) == 0x40) {
							if (field483[var6][var7] == field364) {
								continue;
							}

							field483[var6][var7] = field364;
						}

						var4.field1377 = method173(var4.field26, field384, var4.field27);
						field401.method331(var4.field27, var4.field1377, var4.field28, var4.field26, field384, 60, var5, var4.field34, var4);
					} else {
						var4.field1379 = false;
						var4.field1377 = method173(var4.field26, field384, var4.field27);
						field401.method332(var4.field1355, var4.field27, var4, field384, 60, var4.field1377, var5, var4.field28, var4.field1358, var4.field26, var4.field1356, var4.field1357);
					}
				}
			}
		}
	}

	public final void run() {
		if (field188) {
			method132();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method157(int arg0) {
		IJNDWVIL.method313(arg0);
	}

	@ObfuscatedName("client.o(B)V")
	public final void method158() {
		field364++;
		method156(true);
		method130(true);
		method156(false);
		method130(false);
		method48();
		method57();

		if (!field584) {
			int var1 = field345;
			if (field582 / 256 > var1) {
				var1 = field582 / 256;
			}

			if (field366[4] && field202[4] + 128 > var1) {
				var1 = field202[4] + 128;
			}

			int var2 = field379 + field346 & 0x7FF;
			method142(var1 * 3 + 600, field351, var1, field352, var2, method173(field204.field26, field384, field204.field27) - 50);
		}

		int var3;
		if (field584) {
			var3 = method115();
		} else {
			var3 = method114();
		}

		int var4 = field179;
		int var5 = field180;
		int var6 = field181;
		int var7 = field182;
		int var8 = field183;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field366[var9]) {
				int var10 = (int) (Math.random() * (field342[var9] * 2 + 1) + Math.sin(field291[var9] / 100.0D * field236[var9]) * field202[var9] - field342[var9]);
				if (var9 == 0) {
					field179 += var10;
				}

				if (var9 == 1) {
					field180 += var10;
				}

				if (var9 == 2) {
					field181 += var10;
				}

				if (var9 == 3) {
					field183 = field183 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field182 += var10;
					if (field182 < 128) {
						field182 = 128;
					}

					if (field182 > 383) {
						field182 = 383;
					}
				}
			}
		}

		int var11 = GHWCMNQP.field760;
		OGORHYVW.field1166 = true;
		OGORHYVW.field1169 = 0;
		OGORHYVW.field1167 = field801 - 4;
		OGORHYVW.field1168 = field802 - 4;
		IBBQNXJX.method254();
		field401.method359(field182, var3, field181, field179, field183, field180);
		field401.method334();
		method55();
		method100();
		method104(var11);
		method122();
		field312.method2(4, 4, field793);
		field179 = var4;
		field180 = var5;
		field181 = var6;
		field182 = var7;
		field183 = var8;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method159(String arg0) {
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

	@ObfuscatedName("client.b(LTKPFKOXP;II)V")
	public final void method160(TKPFKOXP arg0, int arg1) {
		while (arg0.field1383 + 10 < arg1 * 8) {
			int var3 = arg0.method540(11);
			if (var3 == 2047) {
				break;
			}

			if (field407[var3] == null) {
				field407[var3] = new TINBLEHZ();
				if (field412[var3] != null) {
					field407[var3].method516(field412[var3]);
				}
			}

			field409[field408++] = var3;
			TINBLEHZ var4 = field407[var3];
			var4.field25 = field456;
			int var5 = arg0.method540(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method540(1);
			if (var6 == 1) {
				field411[field410++] = var3;
			}

			int var7 = arg0.method540(1);
			int var8 = arg0.method540(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method7(field204.field57[0] + var8, var7 == 1, field204.field58[0] + var5);
		}

		arg0.method541();
	}

	@ObfuscatedName("client.H(I)V")
	public final void method161() {
		if (field340 != 0) {
			LICHOWDY var1 = field375;
			int var2 = 0;
			if (field339 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field338[var3] != null) {
					int var4 = field336[var3];
					String var5 = field337[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field334 == 0 || field334 == 1 && method110(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method384("From", var7, var8, 0);
						var1.method384("From", var7 - 1, var8, 0xFFFF);
						int var11 = var8 + var1.method382("From ");
						if (var6 == 1) {
							field378[0].method421(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field378[1].method421(var7 - 12, var11);
							var11 += 14;
						}

						var1.method384(var5 + ": " + field338[var3], var7, var11, 0);
						var1.method384(var5 + ": " + field338[var3], var7 - 1, var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field334 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method384(field338[var3], var9, 4, 0);
						var1.method384(field338[var3], var9 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field334 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method384("To " + var5 + ": " + field338[var3], var10, 4, 0);
						var1.method384("To " + var5 + ": " + field338[var3], var10 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method162(boolean arg0) {
		method86();
		field609.method1();
		field414.method421(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field576 == 0) {
			int var4 = var3 / 2 + 80;
			field374.method381(field303.field705, true, var4, 0x75A9A9, var2 / 2);
			int var5 = var3 / 2 - 20;
			field376.method381("Welcome to RuneScape", true, var5, 0xFFFF00, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field415.method421(var7 - 20, var6 - 73);
			field376.method381("New User", true, var7 + 5, 0xFFFFFF, var6);
			int var8 = var2 / 2 + 80;
			field415.method421(var7 - 20, var8 - 73);
			field376.method381("Existing User", true, var7 + 5, 0xFFFFFF, var8);
		}

		if (field576 == 2) {
			int var9 = var3 / 2 - 40;
			if (field229.length() > 0) {
				field376.method381(field229, true, var9 - 15, 0xFFFF00, var2 / 2);
				field376.method381(field230, true, var9, 0xFFFF00, var2 / 2);
				var9 += 30;
			} else {
				field376.method381(field230, true, var9 - 7, 0xFFFF00, var2 / 2);
				var9 += 30;
			}

			field376.method388(var2 / 2 - 90, var9, 0xFFFFFF, true, "Username: " + field387 + (field322 == 0 & field456 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field376.method388(var2 / 2 - 88, var9, 0xFFFFFF, true, "Password: " + DQKGVELR.method187(field388) + (field322 == 1 & field456 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field415.method421(var11 - 20, var10 - 73);
				field376.method381("Login", true, var11 + 5, 0xFFFFFF, var10);
				int var12 = var2 / 2 + 80;
				field415.method421(var11 - 20, var12 - 73);
				field376.method381("Cancel", true, var11 + 5, 0xFFFFFF, var12);
			}
		}

		if (field576 == 3) {
			field376.method381("Create a free account", true, var3 / 2 - 60, 0xFFFF00, var2 / 2);
			int var13 = var3 / 2 - 35;
			field376.method381("To create a new account you need to", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field376.method381("go back to the main RuneScape webpage", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field376.method381("and choose the 'create account'", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field376.method381("button near the top of that page.", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field415.method421(var15 - 20, var14 - 73);
			field376.method381("Cancel", true, var15 + 5, 0xFFFFFF, var14);
		}

		field609.method2(171, 202, field793);

		if (field287) {
			field287 = false;
			field607.method2(0, 128, field793);
			field608.method2(371, 202, field793);
			field612.method2(265, 0, field793);
			field613.method2(265, 562, field793);
			field614.method2(171, 128, field793);
			field615.method2(171, 562, field793);
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method163() {
		if (field340 != 0) {
			int var1 = 0;
			if (field339 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field338[var2] != null) {
					int var3 = field336[var2];
					String var4 = field337[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field334 == 0 || field334 == 1 && method110(var4))) {
						int var8 = 329 - var1 * 13;
						if (field801 > 4 && field802 - 4 > var8 - 10 && field802 - 4 <= var8 + 3) {
							int var9 = field375.method382("From:  " + var4 + field338[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field801 < var9 + 4) {
								if (field563 >= 1) {
									field451[field569] = "Report abuse @whi@" + var4;
									field186[field569] = 2471;
									field569++;
								}

								field451[field569] = "Add ignore @whi@" + var4;
								field186[field569] = 2608;
								field569++;
								field451[field569] = "Add friend @whi@" + var4;
								field186[field569] = 2627;
								field569++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field334 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILTKPFKOXP;I)V")
	public final void method164(TKPFKOXP arg0, int arg1) {
		if (arg1 == 197) {
			int var3 = arg0.method558();
			int var4 = arg0.method549();
			int var5 = var4 >> 2;
			int var6 = var4 & 0x3;
			int var7 = field368[var5];
			int var8 = arg0.method547();
			int var9 = (var8 >> 4 & 0x7) + field573;
			int var10 = (var8 & 0x7) + field574;
			if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
				method69(var3, var6, 0, -1, var9, var5, var10, field384, var7);
			}
		} else if (arg1 == 145) {
			int var11 = arg0.method529();
			int var12 = (var11 >> 4 & 0x7) + field573;
			int var13 = (var11 & 0x7) + field574;
			int var14 = arg0.method531();
			int var15 = arg0.method529();
			int var16 = arg0.method531();
			if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
				var12 = var12 * 128 + 64;
				var13 = var13 * 128 + 64;
				AMMGDAXD var17 = new AMMGDAXD(method173(var12, field384, var13) - var15, field456, var14, var13, field384, var16, var12);
				field435.method506(var17);
			}
		} else if (arg1 == 110) {
			int var18 = arg0.method529();
			int var19 = (var18 >> 4 & 0x7) + field573;
			int var20 = (var18 & 0x7) + field574;
			int var21 = arg0.method531();
			int var22 = arg0.method531();
			int var23 = arg0.method531();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				SXQMCHPP var24 = field543[field384][var19][var20];
				if (var24 != null) {
					for (ETOKKIHH var25 = (ETOKKIHH) var24.method509(); var25 != null; var25 = (ETOKKIHH) var24.method511()) {
						if ((var21 & 0x7FFF) == var25.field669 && var25.field670 == var22) {
							var25.field670 = var23;
							break;
						}
					}

					method152(var19, var20);
				}
			}
		} else if (arg1 == 16) {
			int var26 = arg0.method548();
			int var27 = (var26 >> 4 & 0x7) + field573;
			int var28 = (var26 & 0x7) + field574;
			int var29 = arg0.method529();
			int var30 = var29 >> 2;
			int var31 = var29 & 0x3;
			int var32 = field368[var30];
			if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
				method69(-1, var31, 0, -1, var27, var30, var28, field384, var32);
			}
		} else if (arg1 == 40) {
			int var33 = arg0.method558();
			int var34 = arg0.method531();
			int var35 = arg0.method557();
			int var36 = arg0.method549();
			int var37 = (var36 >> 4 & 0x7) + field573;
			int var38 = (var36 & 0x7) + field574;
			if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && field466 != var35) {
				ETOKKIHH var39 = new ETOKKIHH();
				var39.field669 = var34;
				var39.field670 = var33;

				if (field543[field384][var37][var38] == null) {
					field543[field384][var37][var38] = new SXQMCHPP();
				}

				field543[field384][var37][var38].method506(var39);
				method152(var37, var38);
			}
		} else {
			if (arg1 == 58) {
				int var40 = arg0.method557();
				int var41 = arg0.method547();
				int var42 = var41 >> 2;
				int var43 = var41 & 0x3;
				int var44 = field368[var42];
				byte var45 = arg0.method550();
				int var46 = arg0.method531();
				int var47 = arg0.method547();
				int var48 = (var47 >> 4 & 0x7) + field573;
				int var49 = (var47 & 0x7) + field574;
				byte var50 = arg0.method551();
				byte var51 = arg0.method552();
				int var52 = arg0.method556();
				int var53 = arg0.method556();
				byte var54 = arg0.method552();
				TINBLEHZ var55;
				if (field466 == var40) {
					var55 = field204;
				} else {
					var55 = field407[var40];
				}

				if (var55 != null) {
					SOLNFIIQ var56 = SOLNFIIQ.method499(var52);
					int var57 = field363[field384][var48][var49];
					int var58 = field363[field384][var48 + 1][var49];
					int var59 = field363[field384][var48 + 1][var49 + 1];
					int var60 = field363[field384][var48][var49 + 1];
					OGORHYVW var61 = var56.method496(var42, var43, var57, var58, var59, var60, -1);
					if (var61 != null) {
						method69(-1, 0, var46 + 1, var53 + 1, var48, 0, var49, field384, var44);
						var55.field1360 = field456 + var46;
						var55.field1361 = field456 + var53;
						var55.field1373 = var61;
						int var62 = var56.field1284;
						int var63 = var56.field1326;
						if (var43 == 1 || var43 == 3) {
							var62 = var56.field1326;
							var63 = var56.field1284;
						}

						var55.field1370 = var48 * 128 + var62 * 64;
						var55.field1372 = var49 * 128 + var63 * 64;
						var55.field1371 = method173(var55.field1370, field384, var55.field1372);

						if (var51 > var50) {
							byte var64 = var51;
							var51 = var50;
							var50 = var64;
						}

						if (var54 > var45) {
							byte var65 = var54;
							var54 = var45;
							var45 = var65;
						}

						var55.field1355 = var48 + var51;
						var55.field1357 = var48 + var50;
						var55.field1356 = var49 + var54;
						var55.field1358 = var45 + var49;
					}
				}
			}

			if (arg1 == 142) {
				int var66 = arg0.method531();
				int var67 = arg0.method549();
				int var68 = (var67 >> 4 & 0x7) + field573;
				int var69 = (var67 & 0x7) + field574;
				int var70 = arg0.method556();
				if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
					ETOKKIHH var71 = new ETOKKIHH();
					var71.field669 = var70;
					var71.field670 = var66;

					if (field543[field384][var68][var69] == null) {
						field543[field384][var68][var69] = new SXQMCHPP();
					}

					field543[field384][var68][var69].method506(var71);
					method152(var68, var69);
				}
			} else {
				if (arg1 == 44) {
					int var72 = arg0.method529();
					int var73 = (var72 >> 4 & 0x7) + field573;
					int var74 = (var72 & 0x7) + field574;
					int var75 = arg0.method531();
					int var76 = arg0.method529();
					int var77 = var76 >> 4 & 0xF;
					int var78 = var76 & 0x7;
					if (field204.field57[0] >= var73 - var77 && field204.field57[0] <= var73 + var77 && field204.field58[0] >= var74 - var77 && field204.field58[0] <= var74 + var77 && field470 && !field503 && field331 < 50) {
						field200[field331] = var75;
						field355[field331] = var78;
						field566[field331] = SHTECHVG.field1227[var75];
						field331++;
					}
				}

				if (arg1 == 33) {
					int var79 = arg0.method548();
					int var80 = var79 >> 2;
					int var81 = var79 & 0x3;
					int var82 = field368[var80];
					int var83 = arg0.method558();
					int var84 = arg0.method547();
					int var85 = (var84 >> 4 & 0x7) + field573;
					int var86 = (var84 & 0x7) + field574;
					if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
						int var87 = field363[field384][var85][var86];
						int var88 = field363[field384][var85 + 1][var86];
						int var89 = field363[field384][var85 + 1][var86 + 1];
						int var90 = field363[field384][var85][var86 + 1];
						if (var82 == 0) {
							MSNLASDH var91 = field401.method342(var86, var85, field384);
							if (var91 != null) {
								int var92 = var91.field1085 >> 14 & 0x7FFF;
								if (var80 == 2) {
									var91.field1083 = new BMMXGYBV(2, var90, var92, var83, var89, var88, var87, false, var81 + 4);
									var91.field1084 = new BMMXGYBV(2, var90, var92, var83, var89, var88, var87, false, var81 + 1 & 0x3);
								} else {
									var91.field1083 = new BMMXGYBV(var80, var90, var92, var83, var89, var88, var87, false, var81);
								}
							}
						}

						if (var82 == 1) {
							HRTHMLJC var93 = field401.method343(var85, var86, field384);
							if (var93 != null) {
								var93.field768 = new BMMXGYBV(4, var90, var93.field769 >> 14 & 0x7FFF, var83, var89, var88, var87, false, 0);
							}
						}

						if (var82 == 2) {
							EMLXSMMX var94 = field401.method344(var85, var86, field384);

							if (var80 == 11) {
								var80 = 10;
							}

							if (var94 != null) {
								var94.field659 = new BMMXGYBV(var80, var90, var94.field667 >> 14 & 0x7FFF, var83, var89, var88, var87, false, var81);
							}
						}

						if (var82 == 3) {
							OYYVOEEI var95 = field401.method345(var85, field384, var86);
							if (var95 != null) {
								var95.field1187 = new BMMXGYBV(22, var90, var95.field1188 >> 14 & 0x7FFF, var83, var89, var88, var87, false, var81);
							}
						}
					}
				} else if (arg1 == 90) {
					int var96 = arg0.method529();
					int var97 = (var96 >> 4 & 0x7) + field573;
					int var98 = (var96 & 0x7) + field574;
					int var99 = var97 + arg0.method530();
					int var100 = var98 + arg0.method530();
					int var101 = arg0.method532();
					int var102 = arg0.method531();
					int var103 = arg0.method529() * 4;
					int var104 = arg0.method529() * 4;
					int var105 = arg0.method531();
					int var106 = arg0.method531();
					int var107 = arg0.method529();
					int var108 = arg0.method529();
					if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var102 != 0xFFFF) {
						var97 = var97 * 128 + 64;
						var98 = var98 * 128 + 64;
						var99 = var99 * 128 + 64;
						var100 = var100 * 128 + 64;
						KTKZBCIU var109 = new KTKZBCIU(method173(var97, field384, var98) - var103, var102, field456 + var106, var108, var104, var107, var97, field456 + var105, field384, var101, var98);
						var109.method377(var100, method173(var99, field384, var100) - var104, var99, field456 + var105);
						field512.method506(var109);
					}
				} else if (arg1 == 146) {
					int var110 = arg0.method558();
					int var111 = arg0.method547();
					int var112 = (var111 >> 4 & 0x7) + field573;
					int var113 = (var111 & 0x7) + field574;
					if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
						SXQMCHPP var114 = field543[field384][var112][var113];
						if (var114 != null) {
							for (ETOKKIHH var115 = (ETOKKIHH) var114.method509(); var115 != null; var115 = (ETOKKIHH) var114.method511()) {
								if ((var110 & 0x7FFF) == var115.field669) {
									var115.method588();
									break;
								}
							}

							if (var114.method509() == null) {
								field543[field384][var112][var113] = null;
							}

							method152(var112, var113);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LTKPFKOXP;LTINBLEHZ;III)V")
	public final void method165(TKPFKOXP arg0, TINBLEHZ arg1, int arg2, int arg3) {
		if ((arg2 & 0x4) != 0) {
			arg1.field30 = arg0.method557();
			if (arg1.field30 == 0xFFFF) {
				arg1.field30 = -1;
			}
		}

		if ((arg2 & 0x20) != 0) {
			int var5 = arg0.method558();
			if (var5 == 0xFFFF) {
				var5 = -1;
			}

			int var6 = arg0.method549();
			if (arg1.field42 == var5 && var5 != -1) {
				int var7 = KSVXFIAD.field1002[var5].field1016;
				if (var7 == 1) {
					arg1.field43 = 0;
					arg1.field44 = 0;
					arg1.field45 = var6;
					arg1.field46 = 0;
				}

				if (var7 == 2) {
					arg1.field46 = 0;
				}
			} else if (var5 == -1 || arg1.field42 == -1 || KSVXFIAD.field1002[var5].field1010 >= KSVXFIAD.field1002[arg1.field42].field1010) {
				arg1.field42 = var5;
				arg1.field43 = 0;
				arg1.field44 = 0;
				arg1.field45 = var6;
				arg1.field46 = 0;
				arg1.field47 = arg1.field39;
			}
		}

		if ((arg2 & 0x8) != 0) {
			arg1.field52 = arg0.method558();
			arg1.field53 = arg0.method531();
		}

		if ((arg2 & 0x40) != 0) {
			arg1.field38 = arg0.method536();
			if (arg1.field38.charAt(0) == '~') {
				arg1.field38 = arg1.field38.substring(1);
				method111(arg1.field38, 2, arg1.field1380);
			} else if (field204 == arg1) {
				method111(arg1.field38, 2, arg1.field1380);
			}

			arg1.field41 = 0;
			arg1.field37 = 0;
			arg1.field40 = 150;
		}

		if ((arg2 & 0x2) != 0) {
			int var8 = arg0.method557();
			int var9 = arg0.method548();
			int var10 = arg0.method529();
			int var11 = arg0.field1382;

			if (arg1.field1380 != null && arg1.field1367) {
				long var12 = DQKGVELR.method182(arg1.field1380);
				boolean var14 = false;
				if (var9 <= 1) {
					for (int var15 = 0; var15 < field482; var15++) {
						if (field450[var15] == var12) {
							var14 = true;
							break;
						}
					}
				}

				if (!var14 && field530 == 0) {
					try {
						field396.field1382 = 0;
						arg0.method567(0, field396.field1381, var10);
						field396.field1382 = 0;
						String var16 = YXRFKVAX.method589(var10, field396);
						var16 = IHSJPYKH.method281(var16);
						arg1.field38 = var16;
						arg1.field41 = var8 >> 8;
						arg1.field37 = var8 & 0xFF;
						arg1.field40 = 150;

						if (var9 == 2 || var9 == 3) {
							method111(var16, 1, "@cr2@" + arg1.field1380);
						} else if (var9 == 1) {
							method111(var16, 1, "@cr1@" + arg1.field1380);
						} else {
							method111(var16, 2, arg1.field1380);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field1382 = var10 + var11;
		}

		if ((arg2 & 0x400) != 0) {
			arg1.field16 = arg0.method557();
			int var18 = arg0.method566();
			arg1.field20 = var18 >> 16;
			arg1.field19 = (var18 & 0xFFFF) + field456;
			arg1.field17 = 0;
			arg1.field18 = 0;

			if (arg1.field19 > field456) {
				arg1.field17 = -1;
			}

			if (arg1.field16 == 0xFFFF) {
				arg1.field16 = -1;
			}
		}

		if ((arg2 & 0x200) != 0) {
			arg1.field62 = arg0.method529();
			arg1.field64 = arg0.method529();
			arg1.field63 = arg0.method529();
			arg1.field65 = arg0.method549();
			arg1.field66 = arg0.method531() + field456;
			arg1.field67 = arg0.method556() + field456;
			arg1.field68 = arg0.method529();
			arg1.method6();
		}

		if ((arg2 & 0x10) != 0) {
			int var19 = arg0.method547();
			int var20 = arg0.method549();
			arg1.method10(var19, field456, var20);
			arg1.field31 = field456 + 300;
			arg1.field32 = arg0.method547();
			arg1.field33 = arg0.method529();
		}

		if ((arg2 & 0x80) != 0) {
			int var21 = arg0.method548();
			byte[] var22 = new byte[var21];
			TKPFKOXP var23 = new TKPFKOXP(var22);
			arg0.method567(0, var22, var21);
			field412[arg3] = var23;
			arg1.method516(var23);
		}

		if ((arg2 & 0x100) != 0) {
			int var24 = arg0.method548();
			int var25 = arg0.method548();
			arg1.method10(var24, field456, var25);
			arg1.field31 = field456 + 300;
			arg1.field32 = arg0.method547();
			arg1.field33 = arg0.method549();
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method166() {
		field511.method518(1);

		if (field413 != -1) {
			method157(field413);
			field413 = -1;
			field344 = true;
			field298 = false;
			field263 = true;
		}

		if (field434 != -1) {
			method157(field434);
			field434 = -1;
			field284 = true;
			field298 = false;
		}

		if (field243 != -1) {
			method157(field243);
			field243 = -1;
			field287 = true;
		}

		if (field288 != -1) {
			method157(field288);
			field288 = -1;
		}

		if (field370 != -1) {
			method157(field370);
			field370 = -1;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method167(int arg0) {
		int var2 = RGMKWKCG.field1207[arg0].field1215;
		if (var2 != 0) {
			int var3 = field472[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					GHWCMNQP.method235(0.9D);
				}

				if (var3 == 2) {
					GHWCMNQP.method235(0.8D);
				}

				if (var3 == 3) {
					GHWCMNQP.method235(0.7D);
				}

				if (var3 == 4) {
					GHWCMNQP.method235(0.6D);
				}

				SNJEZIDX.field1276.method415();
				field287 = true;
			}

			if (var2 == 3) {
				boolean var4 = field531;

				if (var3 == 0) {
					method56(field531, 0);
					field531 = true;
				}

				if (var3 == 1) {
					method56(field531, -400);
					field531 = true;
				}

				if (var3 == 2) {
					method56(field531, -800);
					field531 = true;
				}

				if (var3 == 3) {
					method56(field531, -1200);
					field531 = true;
				}

				if (var3 == 4) {
					field531 = false;
				}

				if (field531 != var4 && !field503) {
					if (field531) {
						field488 = field537;
						field489 = true;
						field303.method208(2, field488);
					} else {
						method133();
					}

					field400 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field470 = true;
					method67(0);
				}

				if (var3 == 1) {
					field470 = true;
					method67(-400);
				}

				if (var3 == 2) {
					field470 = true;
					method67(-800);
				}

				if (var3 == 3) {
					field470 = true;
					method67(-1200);
				}

				if (var3 == 4) {
					field470 = false;
				}
			}

			if (var2 == 5) {
				field546 = var3;
			}

			if (var2 == 6) {
				field301 = var3;
			}

			if (var2 == 8) {
				field340 = var3;
				field284 = true;
			}

			if (var2 == 9) {
				field250 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method168() {
		field191 = null;
		field192 = null;
		field193 = null;
		field194 = null;
		field511 = null;
		field540 = null;
		field272 = null;
		field507 = null;
		field523 = null;
		field389 = null;
		field310 = null;
		field311 = null;
		field312 = null;
		field313 = null;
		field610 = null;
		field611 = null;
		field607 = null;
		field608 = null;
		field609 = null;
		field195 = null;
		field196 = null;
		field197 = null;
		field198 = null;
		field199 = null;

		try {
			if (field302 != null) {
				field302.method468();
			}
		} catch (Exception var1) {
		}

		field302 = null;
		method133();
		field333 = null;
		field491 = null;
		field492 = null;
		field493 = null;
		field494 = null;
		field495 = null;
		field618 = null;
		field184 = null;
		field185 = null;
		field186 = null;
		field187 = null;
		field451 = null;
		field601 = null;
		field363 = null;
		field499 = null;
		field401 = null;
		field265 = null;
		field479 = null;
		field480 = null;
		field439 = null;
		field407 = null;
		field409 = null;
		field411 = null;
		field412 = null;
		field517 = null;
		field396 = null;
		field472 = null;
		field397 = null;
		field399 = null;
		field483 = null;
		field512 = null;
		field435 = null;
		field258 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field262 = null;
		field431 = null;
		field432 = null;
		field433 = null;
		field279 = null;
		field280 = null;
		field281 = null;
		field282 = null;
		field283 = null;

		if (field303 != null) {
			field303.method210();
		}

		field303 = null;
		field371 = null;
		field332 = null;
		field459 = null;
		field460 = null;
		field212 = null;
		field213 = null;
		field214 = null;
		field292 = null;
		field553 = null;
		field190 = null;
		field306 = null;
		field249 = null;
		field498 = null;
		field252 = null;
		field324 = null;
		field242 = null;
		field253 = null;
		field254 = null;
		field579 = null;
		field543 = null;
		field369 = null;
		field612 = null;
		field613 = null;
		field614 = null;
		field615 = null;
		field490 = null;
		field544 = null;

		if (field446 != null) {
			field446.field1194 = false;
		}

		field446 = null;
		field269 = null;
		field270 = null;
		field271 = null;
		method78();
		SOLNFIIQ.method495();
		YXSRFNQD.method594();
		SNJEZIDX.method485();
		IJNDWVIL.method318();
		FBZMYCDC.field680 = null;
		NTHXISGN.field1096 = null;
		LRKPIWQZ.field1059 = null;
		KSVXFIAD.field1002 = null;
		HTOEUNMD.field772 = null;
		HTOEUNMD.field784 = null;
		RGMKWKCG.field1207 = null;
		field794 = null;
		TINBLEHZ.field1365 = null;
		GHWCMNQP.method226();
		JPCEPCNA.method319();
		OGORHYVW.method429();
		OYJABRDD.method465();
		System.gc();
	}

	@ObfuscatedName("client.J(I)V")
	public final void method169() {
		if (field461 == 0 && field318 == 0) {
			field451[field569] = "Walk here";
			field186[field569] = 113;
			field184[field569] = field801;
			field185[field569] = field802;
			field569++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < OGORHYVW.field1169; var2++) {
			int var3 = OGORHYVW.field1170[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field401.method350(field384, var4, var5, var3) >= 0) {
					SOLNFIIQ var8 = SOLNFIIQ.method499(var7);
					if (var8.field1327 != null) {
						var8 = var8.method503();
					}

					if (var8 == null) {
						continue;
					}

					if (field461 == 1) {
						field451[field569] = "Use " + field465 + " with @cya@" + var8.field1317;
						field186[field569] = 438;
						field187[field569] = var3;
						field184[field569] = var4;
						field185[field569] = var5;
						field569++;
					} else if (field318 != 1) {
						if (var8.field1304 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1304[var9] != null) {
									field451[field569] = var8.field1304[var9] + " @cya@" + var8.field1317;

									if (var9 == 0) {
										field186[field569] = 479;
									}

									if (var9 == 1) {
										field186[field569] = 753;
									}

									if (var9 == 2) {
										field186[field569] = 202;
									}

									if (var9 == 3) {
										field186[field569] = 111;
									}

									if (var9 == 4) {
										field186[field569] = 1790;
									}

									field187[field569] = var3;
									field184[field569] = var4;
									field185[field569] = var5;
									field569++;
								}
							}
						}

						field451[field569] = "Examine @cya@" + var8.field1317;
						field186[field569] = 1083;
						field187[field569] = var8.field1291 << 14;
						field184[field569] = var4;
						field185[field569] = var5;
						field569++;
					} else if ((field320 & 0x4) == 4) {
						field451[field569] = field321 + " @cya@" + var8.field1317;
						field186[field569] = 918;
						field187[field569] = var3;
						field184[field569] = var4;
						field185[field569] = var5;
						field569++;
					}
				}

				if (var6 == 1) {
					ZHNLOFBM var10 = field397[var7];
					if (var10.field1510.field1492 == 1 && (var10.field26 & 0x7F) == 0x40 && (var10.field27 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field398; var11++) {
							ZHNLOFBM var12 = field397[field399[var11]];
							if (var12 != null && var10 != var12 && var12.field1510.field1492 == 1 && var10.field26 == var12.field26 && var10.field27 == var12.field27) {
								method151(var4, var12.field1510, var5, field399[var11]);
							}
						}

						for (int var13 = 0; var13 < field408; var13++) {
							TINBLEHZ var14 = field407[field409[var13]];
							if (var14 != null && var10.field26 == var14.field26 && var10.field27 == var14.field27) {
								method54(var14, var4, field409[var13], var5);
							}
						}
					}

					method151(var4, var10.field1510, var5, var7);
				}

				if (var6 == 0) {
					TINBLEHZ var15 = field407[var7];
					if ((var15.field26 & 0x7F) == 0x40 && (var15.field27 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field398; var16++) {
							ZHNLOFBM var17 = field397[field399[var16]];
							if (var17 != null && var17.field1510.field1492 == 1 && var15.field26 == var17.field26 && var15.field27 == var17.field27) {
								method151(var4, var17.field1510, var5, field399[var16]);
							}
						}

						for (int var18 = 0; var18 < field408; var18++) {
							TINBLEHZ var19 = field407[field409[var18]];
							if (var19 != null && var15 != var19 && var15.field26 == var19.field26 && var15.field27 == var19.field27) {
								method54(var19, var4, field409[var18], var5);
							}
						}
					}

					method54(var15, var4, var7, var5);
				}

				if (var6 == 3) {
					SXQMCHPP var20 = field543[field384][var4][var5];
					if (var20 != null) {
						for (ETOKKIHH var21 = (ETOKKIHH) var20.method510(); var21 != null; var21 = (ETOKKIHH) var20.method512()) {
							SNJEZIDX var22 = SNJEZIDX.method482(var21.field669);
							if (field461 == 1) {
								field451[field569] = "Use " + field465 + " with @lre@" + var22.field1243;
								field186[field569] = 469;
								field187[field569] = var21.field669;
								field184[field569] = var4;
								field185[field569] = var5;
								field569++;
							} else if (field318 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1271 != null && var22.field1271[var23] != null) {
										field451[field569] = var22.field1271[var23] + " @lre@" + var22.field1243;

										if (var23 == 0) {
											field186[field569] = 882;
										}

										if (var23 == 1) {
											field186[field569] = 756;
										}

										if (var23 == 2) {
											field186[field569] = 420;
										}

										if (var23 == 3) {
											field186[field569] = 618;
										}

										if (var23 == 4) {
											field186[field569] = 233;
										}

										field187[field569] = var21.field669;
										field184[field569] = var4;
										field185[field569] = var5;
										field569++;
									} else if (var23 == 2) {
										field451[field569] = "Take @lre@" + var22.field1243;
										field186[field569] = 420;
										field187[field569] = var21.field669;
										field184[field569] = var4;
										field185[field569] = var5;
										field569++;
									}
								}

								field451[field569] = "Examine @lre@" + var22.field1243;
								field186[field569] = 1936;
								field187[field569] = var21.field669;
								field184[field569] = var4;
								field185[field569] = var5;
								field569++;
							} else if ((field320 & 0x1) == 1) {
								field451[field569] = field321 + " @lre@" + var22.field1243;
								field186[field569] = 978;
								field187[field569] = var21.field669;
								field184[field569] = var4;
								field185[field569] = var5;
								field569++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LAQPBLKMD;II)V")
	public final void method170(AQPBLKMD arg0, int arg1) {
		method171(arg0.field26, arg0.field27, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method171(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method173(arg0, field384, arg1) - arg2;
			arg0 -= field179;
			var4 -= field180;
			arg1 -= field181;
			int var5 = OGORHYVW.field1171[field182];
			int var6 = OGORHYVW.field1172[field182];
			int var7 = OGORHYVW.field1171[field183];
			int var8 = OGORHYVW.field1172[field183];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field402 = (var9 << 9) / arg1 + GHWCMNQP.field745;
				field403 = (var11 << 9) / arg1 + GHWCMNQP.field746;
			} else {
				field402 = -1;
				field403 = -1;
			}
		} else {
			field402 = -1;
			field403 = -1;
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method172() {
		SOLNFIIQ.field1310.method415();
		SOLNFIIQ.field1321.method415();
		YXSRFNQD.field1479.method415();
		SNJEZIDX.field1244.method415();
		SNJEZIDX.field1276.method415();
		TINBLEHZ.field1365.method415();
		HTOEUNMD.field784.method415();
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method173(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field499[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field363[var6][var4][var5] + field363[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field363[var6][var4][var5 + 1] + field363[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method174(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field401.method350(field384, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SOLNFIIQ var8 = SOLNFIIQ.method499(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1284;
				var10 = var8.field1326;
			} else {
				var9 = var8.field1326;
				var10 = var8.field1284;
			}

			int var11 = var8.field1324;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method49(var9, var11, field204.field58[0], field204.field57[0], 0, arg0, 0, arg1, 2, var10, true);
		} else {
			method49(0, 0, field204.field58[0], field204.field57[0], var7, arg0, var6 + 1, arg1, 2, 0, true);
		}

		field238 = field808;
		field239 = field809;
		field241 = 2;
		field240 = 0;
		return true;
	}

	@ObfuscatedName("client.c(ILTKPFKOXP;I)V")
	public final void method175(int arg0, TKPFKOXP arg1) {
		for (int var3 = 0; var3 < field410; var3++) {
			int var4 = field411[var3];
			TINBLEHZ var5 = field407[var4];
			int var6 = arg1.method529();
			if ((var6 & 0x1) != 0) {
				var6 += arg1.method529() << 8;
			}

			method165(arg1, var5, var6, var4);
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method176() {
		if (field443 == 0) {
			int var1 = field807;
			if (field318 == 1 && field808 >= 516 && field809 >= 160 && field808 <= 765 && field809 <= 205) {
				var1 = 0;
			}

			if (field539) {
				if (var1 != 1) {
					int var2 = field801;
					int var3 = field802;
					if (field244 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field244 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field244 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field245 - 10 || var2 > field247 + field245 + 10 || var3 < field246 - 10 || var3 > field248 + field246 + 10) {
						field539 = false;

						if (field244 == 1) {
							field344 = true;
						}

						if (field244 == 2) {
							field284 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field245;
					int var5 = field246;
					int var6 = field247;
					int var7 = field808;
					int var8 = field809;
					if (field244 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field244 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field244 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field569; var10++) {
						int var11 = (field569 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method62(var9);
					}

					field539 = false;

					if (field244 == 1) {
						field344 = true;
					}

					if (field244 == 2) {
						field284 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field569 > 0) {
					int var12 = field186[field569 - 1];
					if (var12 == 352 || var12 == 839 || var12 == 561 || var12 == 240 || var12 == 648 || var12 == 724 || var12 == 660 || var12 == 228 || var12 == 633 || var12 == 103 || var12 == 440 || var12 == 1251) {
						int var13 = field184[field569 - 1];
						int var14 = field185[field569 - 1];
						IJNDWVIL var15 = IJNDWVIL.method311(var14);
						if (var15.field875 || var15.field884) {
							field228 = false;
							field570 = 0;
							field441 = var14;
							field442 = var13;
							field443 = 2;
							field444 = field808;
							field445 = field809;

							if (IJNDWVIL.method311(var14).field892 == field370) {
								field443 = 1;
							}

							if (IJNDWVIL.method311(var14).field892 == field434) {
								field443 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field546 == 1 || method113(field569 - 1)) && field569 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field569 > 0) {
					method62(field569 - 1);
				}

				if (var1 != 2 || field569 <= 0) {
					return;
				}

				method35();
			}
		}
	}

	@ObfuscatedName("client.a(LIJNDWVIL;Z)V")
	public final void method177(IJNDWVIL arg0) {
		int var2 = arg0.field888;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field386 == 0) {
				arg0.field853 = "Loading friend list";
				arg0.field887 = 0;
			} else if (var2 == 1 && field386 == 1) {
				arg0.field853 = "Connecting to friendserver";
				arg0.field887 = 0;
			} else if (var2 == 2 && field386 != 2) {
				arg0.field853 = "Please wait...";
				arg0.field887 = 0;
			} else {
				int var3 = field385;
				if (field386 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field853 = "";
					arg0.field887 = 0;
				} else {
					arg0.field853 = field507[var2];
					arg0.field887 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field385;
			if (field386 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field853 = "";
				arg0.field887 = 0;
			} else {
				if (field389[var2] == 0) {
					arg0.field853 = "@red@Offline";
				} else if (field389[var2] < 200) {
					if (field389[var2] == field500) {
						arg0.field853 = "@gre@World" + (field389[var2] - 9);
					} else {
						arg0.field853 = "@yel@World" + (field389[var2] - 9);
					}
				} else if (field389[var2] == field500) {
					arg0.field853 = "@gre@Classic" + (field389[var2] - 219);
				} else {
					arg0.field853 = "@yel@Classic" + (field389[var2] - 219);
				}

				arg0.field887 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field385;
			if (field386 != 2) {
				var5 = 0;
			}

			arg0.field862 = var5 * 15 + 20;
			if (arg0.field862 <= arg0.field880) {
				arg0.field862 = arg0.field880 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field386 == 0) {
				arg0.field853 = "Loading ignore list";
				arg0.field887 = 0;
			} else if (var2 == 1 && field386 == 0) {
				arg0.field853 = "Please wait...";
				arg0.field887 = 0;
			} else {
				int var6 = field482;
				if (field386 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field853 = "";
					arg0.field887 = 0;
				} else {
					arg0.field853 = DQKGVELR.method186(DQKGVELR.method183(field450[var2]));
					arg0.field887 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field862 = field482 * 15 + 20;
			if (arg0.field862 <= arg0.field880) {
				arg0.field862 = arg0.field880 + 1;
			}
		} else if (var2 == 327) {
			arg0.field867 = 150;
			arg0.field868 = (int) (Math.sin(field456 / 40.0D) * 256.0D) & 0x7FF;

			if (field551) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field304[var7];
					if (var8 >= 0 && !NTHXISGN.field1096[var8].method425()) {
						return;
					}
				}

				field551 = false;
				OGORHYVW[] var9 = new OGORHYVW[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field304[var11];
					if (var12 >= 0) {
						var9[var10++] = NTHXISGN.field1096[var12].method426();
					}
				}

				OGORHYVW var13 = new OGORHYVW(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field330[var14] != 0) {
						var13.method447(field327[var14][0], field327[var14][field330[var14]]);

						if (var14 == 1) {
							var13.method447(field285[0], field285[field330[var14]]);
						}
					}
				}

				var13.method440();
				var13.method441(KSVXFIAD.field1002[field204.field60].field1004[0]);
				var13.method450(64, 850, -30, -50, -30, true);
				arg0.field882 = 5;
				arg0.field883 = 0;
				IJNDWVIL.method317(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field527 == null) {
				field527 = arg0.field904;
				field528 = arg0.field848;
			}

			if (field485) {
				arg0.field904 = field528;
			} else {
				arg0.field904 = field527;
			}
		} else if (var2 == 325) {
			if (field527 == null) {
				field527 = arg0.field904;
				field528 = arg0.field848;
			}

			if (field485) {
				arg0.field904 = field527;
			} else {
				arg0.field904 = field528;
			}
		} else if (var2 == 600) {
			arg0.field853 = field276;
			if (field456 % 20 < 10) {
				arg0.field853 = arg0.field853 + "|";
			} else {
				arg0.field853 = arg0.field853 + " ";
			}
		} else if (var2 == 620) {
			if (field563 < 1) {
				arg0.field853 = "";
			} else if (field526) {
				arg0.field879 = 0xFF0000;
				arg0.field853 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field879 = 0xFFFFFF;
				arg0.field853 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field216 - field390;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field853 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field486 == 0) {
				arg0.field853 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field486 <= field216) {
				arg0.field853 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method178(field486);
			} else {
				int var17 = field216 + 14 - field486;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field853 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method178(field486) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field533 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field533 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field533 + " unread messages";
			}

			arg0.field853 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field471 > 0 && field471 <= field216 + 10) {
				arg0.field853 = "Last password change:\\n@gre@" + method178(field471);
			} else {
				arg0.field853 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field365 > 2 && !field502) {
				arg0.field853 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field365 > 2) {
				arg0.field853 = "\\n\\nYou have @gre@" + field365 + "@yel@ days of\\nmember credit remaining.";
			} else if (field365 > 0) {
				arg0.field853 = "You have @gre@" + field365 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field853 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field365 > 2 && !field502) {
				arg0.field853 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field365 > 0) {
				arg0.field853 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field853 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field486 > field216) {
				arg0.field853 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field853 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.k(II)Ljava/lang/String;")
	public final String method178(int arg0) {
		if (arg0 > field216 + 10) {
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

	@ObfuscatedName("client.a(IBLTKPFKOXP;)V")
	public final void method179(int arg0, TKPFKOXP arg1) {
		arg1.method539();
		int var3 = arg1.method540(1);
		if (var3 != 0) {
			int var4 = arg1.method540(2);
			if (var4 == 0) {
				field411[field410++] = field406;
			} else if (var4 == 1) {
				int var5 = arg1.method540(3);
				field204.method9(var5, false);
				int var6 = arg1.method540(1);
				if (var6 == 1) {
					field411[field410++] = field406;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method540(3);
				field204.method9(var7, true);
				int var8 = arg1.method540(3);
				field204.method9(var8, true);
				int var9 = arg1.method540(1);
				if (var9 == 1) {
					field411[field410++] = field406;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method540(7);
				int var11 = arg1.method540(1);
				int var12 = arg1.method540(1);
				if (var12 == 1) {
					field411[field410++] = field406;
				}

				int var13 = arg1.method540(7);
				field384 = arg1.method540(2);
				field204.method7(var13, var11 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.a(ILIJNDWVIL;IIIIII)V")
	public final void method180(int arg0, IJNDWVIL arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field894 == 0 && arg1.field874 != null && !arg1.field890 && (arg5 >= arg0 && arg6 >= arg4 && arg5 <= arg1.field856 + arg0 && arg6 <= arg1.field880 + arg4)) {
			int var8 = arg1.field874.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field872[var9] + arg0;
				int var11 = arg1.field899[var9] + arg4 - arg3;
				IJNDWVIL var12 = IJNDWVIL.method311(arg1.field874[var9]);
				var10 += var12.field855;
				var11 += var12.field860;
				if ((var12.field873 >= 0 || var12.field847 != 0) && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
					if (var12.field873 >= 0) {
						field215 = var12.field873;
					} else {
						field215 = var12.field864;
					}
				}

				if (var12.field894 == 8 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
					field237 = var12.field864;
				}

				if (var12.field894 == 0) {
					method180(var10, var12, arg2, var12.field857, var11, arg5, arg6);

					if (var12.field862 > var12.field880) {
						method140(var12.field880, var11, var12.field862, arg6, arg2, arg5, var12.field856 + var10, var12);
					}
				} else {
					if (var12.field887 == 1 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						boolean var13 = false;
						if (var12.field888 != 0) {
							var13 = method65(var12);
						}

						if (!var13) {
							field451[field569] = var12.field834;
							field186[field569] = 138;
							field185[field569] = var12.field864;
							field569++;
						}
					}

					if (var12.field887 == 2 && field318 == 0 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						String var14 = var12.field850;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field451[field569] = var14 + " @gre@" + var12.field852;
						field186[field569] = 266;
						field185[field569] = var12.field864;
						field569++;
					}

					if (var12.field887 == 3 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						field451[field569] = "Close";

						if (arg2 == 3) {
							field186[field569] = 908;
						} else {
							field186[field569] = 768;
						}

						field185[field569] = var12.field864;
						field569++;
					}

					if (var12.field887 == 4 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						field451[field569] = var12.field834;
						field186[field569] = 98;
						field185[field569] = var12.field864;
						field569++;
					}

					if (var12.field887 == 5 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						field451[field569] = var12.field834;
						field186[field569] = 436;
						field185[field569] = var12.field864;
						field569++;
					}

					if (var12.field887 == 6 && !field298 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field856 + var10 && arg6 < var12.field880 + var11) {
						field451[field569] = var12.field834;
						field186[field569] = 221;
						field185[field569] = var12.field864;
						field569++;
					}

					if (var12.field894 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field880; var16++) {
							for (int var17 = 0; var17 < var12.field856; var17++) {
								int var18 = (var12.field881 + 32) * var17 + var10;
								int var19 = (var12.field869 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field900[var15];
									var19 += var12.field903[var15];
								}

								if (arg5 >= var18 && arg6 >= var19 && arg5 < var18 + 32 && arg6 < var19 + 32) {
									field328 = var15;
									field329 = var12.field864;

									if (var12.field878[var15] > 0) {
										SNJEZIDX var20 = SNJEZIDX.method482(var12.field878[var15] - 1);
										if (field461 == 1 && var12.field885) {
											if (field463 != var12.field864 || field462 != var15) {
												field451[field569] = "Use " + field465 + " with @lre@" + var20.field1243;
												field186[field569] = 280;
												field187[field569] = var20.field1258;
												field184[field569] = var15;
												field185[field569] = var12.field864;
												field569++;
											}
										} else if (field318 != 1 || !var12.field885) {
											if (var12.field885) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1235 != null && var20.field1235[var21] != null) {
														field451[field569] = var20.field1235[var21] + " @lre@" + var20.field1243;

														if (var21 == 3) {
															field186[field569] = 633;
														}

														if (var21 == 4) {
															field186[field569] = 103;
														}

														field187[field569] = var20.field1258;
														field184[field569] = var15;
														field185[field569] = var12.field864;
														field569++;
													} else if (var21 == 4) {
														field451[field569] = "Drop @lre@" + var20.field1243;
														field186[field569] = 103;
														field187[field569] = var20.field1258;
														field184[field569] = var15;
														field185[field569] = var12.field864;
														field569++;
													}
												}
											}

											if (var12.field858) {
												field451[field569] = "Use @lre@" + var20.field1243;
												field186[field569] = 440;
												field187[field569] = var20.field1258;
												field184[field569] = var15;
												field185[field569] = var12.field864;
												field569++;
											}

											if (var12.field885 && var20.field1235 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1235[var22] != null) {
														field451[field569] = var20.field1235[var22] + " @lre@" + var20.field1243;

														if (var22 == 0) {
															field186[field569] = 724;
														}

														if (var22 == 1) {
															field186[field569] = 660;
														}

														if (var22 == 2) {
															field186[field569] = 228;
														}

														field187[field569] = var20.field1258;
														field184[field569] = var15;
														field185[field569] = var12.field864;
														field569++;
													}
												}
											}

											if (var12.field893 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field893[var23] != null) {
														field451[field569] = var12.field893[var23] + " @lre@" + var20.field1243;

														if (var23 == 0) {
															field186[field569] = 352;
														}

														if (var23 == 1) {
															field186[field569] = 839;
														}

														if (var23 == 2) {
															field186[field569] = 561;
														}

														if (var23 == 3) {
															field186[field569] = 240;
														}

														if (var23 == 4) {
															field186[field569] = 648;
														}

														field187[field569] = var20.field1258;
														field184[field569] = var15;
														field185[field569] = var12.field864;
														field569++;
													}
												}
											}

											field451[field569] = "Examine @lre@" + var20.field1243;
											field186[field569] = 1251;
											field187[field569] = var20.field1258;
											field184[field569] = var15;
											field185[field569] = var12.field864;
											field569++;
										} else if ((field320 & 0x10) == 0x10) {
											field451[field569] = field321 + " @lre@" + var20.field1243;
											field186[field569] = 417;
											field187[field569] = var20.field1258;
											field184[field569] = var15;
											field185[field569] = var12.field864;
											field569++;
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

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field343[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field571[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
