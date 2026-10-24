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
public final class client extends KISFBCOP {

	@ObfuscatedName("client.K")
	public int[] field102 = new int[33];

	@ObfuscatedName("client.M")
	public int field104 = 50;

	@ObfuscatedName("client.N")
	public int[] field105 = new int[field104];

	@ObfuscatedName("client.O")
	public int[] field106 = new int[field104];

	@ObfuscatedName("client.P")
	public int[] field107 = new int[field104];

	@ObfuscatedName("client.Q")
	public int[] field108 = new int[field104];

	@ObfuscatedName("client.R")
	public int[] field109 = new int[field104];

	@ObfuscatedName("client.S")
	public int[] field110 = new int[field104];

	@ObfuscatedName("client.T")
	public int[] field111 = new int[field104];

	@ObfuscatedName("client.U")
	public String[] field112 = new String[field104];

	@ObfuscatedName("client.Y")
	public int[] field116 = new int[7];

	@ObfuscatedName("client.ib")
	public boolean field126 = true;

	@ObfuscatedName("client.kb")
	public String[] field128 = new String[200];

	@ObfuscatedName("client.yb")
	public XANVNPIN[] field140 = new XANVNPIN[32];

	@ObfuscatedName("client.Hb")
	public boolean field148 = false;

	@ObfuscatedName("client.Kb")
	public int field150 = -1;

	@ObfuscatedName("client.Nb")
	public XANVNPIN[] field153 = new XANVNPIN[32];

	@ObfuscatedName("client.Qb")
	public int field155 = 2;

	@ObfuscatedName("client.Rb")
	public boolean[] field156 = new boolean[5];

	@ObfuscatedName("client.Tb")
	public int[] field158 = new int[1000];

	@ObfuscatedName("client.Ub")
	public int[] field159 = new int[1000];

	@ObfuscatedName("client.qc")
	public int[] field177 = new int[5];

	@ObfuscatedName("client.sc")
	public int field179 = -1;

	@ObfuscatedName("client.tc")
	public int[][] field180 = new int[104][104];

	@ObfuscatedName("client.uc")
	public int field181 = -1;

	@ObfuscatedName("client.vc")
	public int field182 = -1;

	@ObfuscatedName("client.wc")
	public int[] field183 = new int[5];

	@ObfuscatedName("client.Dc")
	public boolean field188 = false;

	@ObfuscatedName("client.Ec")
	public int field189 = 128;

	@ObfuscatedName("client.Ic")
	public PQKEJITK[] field193 = new PQKEJITK[13];

	@ObfuscatedName("client.Lc")
	public DNRIFKTO field194 = DNRIFKTO.method177(1);

	@ObfuscatedName("client.Rc")
	public int[] field200 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Uc")
	public CRC32 field203 = new CRC32();

	@ObfuscatedName("client.Wc")
	public boolean field205 = false;

	@ObfuscatedName("client.Xc")
	public boolean field206 = true;

	@ObfuscatedName("client.Zc")
	public boolean field208 = false;

	@ObfuscatedName("client.hd")
	public int field216 = 0x23201B;

	@ObfuscatedName("client.Cd")
	public String field237 = "";

	@ObfuscatedName("client.Dd")
	public ZCVCEQHJ field238 = new ZCVCEQHJ();

	@ObfuscatedName("client.Ed")
	public boolean field239 = false;

	@ObfuscatedName("client.Gd")
	public int[] field241 = new int[50];

	@ObfuscatedName("client.Id")
	public volatile boolean field242 = false;

	@ObfuscatedName("client.Kd")
	public int field244 = -1;

	@ObfuscatedName("client.Od")
	public XANVNPIN[] field246 = new XANVNPIN[100];

	@ObfuscatedName("client.Ud")
	public ZCVCEQHJ field251 = new ZCVCEQHJ();

	@ObfuscatedName("client.be")
	public int field254 = 2;

	@ObfuscatedName("client.ce")
	public ZCVCEQHJ field255 = new ZCVCEQHJ();

	@ObfuscatedName("client.oe")
	public String field264 = "";

	@ObfuscatedName("client.pe")
	public String field265 = "";

	@ObfuscatedName("client.ve")
	public int[][][] field271 = new int[4][13][13];

	@ObfuscatedName("client.xe")
	public DNRIFKTO field272 = new DNRIFKTO(new byte[5000]);

	@ObfuscatedName("client.ye")
	public DLNPJUEQ[] field273 = new DLNPJUEQ[16384];

	@ObfuscatedName("client.Ae")
	public int[] field275 = new int[16384];

	@ObfuscatedName("client.Be")
	public int field276 = 78;

	@ObfuscatedName("client.Ce")
	public boolean field277 = false;

	@ObfuscatedName("client.De")
	public GYSQYVEV[] field278 = new GYSQYVEV[5];

	@ObfuscatedName("client.Fe")
	public long[] field280 = new long[200];

	@ObfuscatedName("client.Ge")
	public int[] field281 = new int[5];

	@ObfuscatedName("client.He")
	public int[] field282 = new int[2000];

	@ObfuscatedName("client.Ie")
	public String[] field283 = new String[500];

	@ObfuscatedName("client.Je")
	public PQKEJITK[] field284 = new PQKEJITK[2];

	@ObfuscatedName("client.Ve")
	public String field296 = "";

	@ObfuscatedName("client.Ze")
	public String field299 = "";

	@ObfuscatedName("client.af")
	public boolean field300 = true;

	@ObfuscatedName("client.cf")
	public int field302 = 1;

	@ObfuscatedName("client.kf")
	public int[] field309 = new int[CEBVDRFM.field99];

	@ObfuscatedName("client.lf")
	public int field310 = -1;

	@ObfuscatedName("client.wf")
	public int[] field321 = new int[256];

	@ObfuscatedName("client.yf")
	public int[] field323 = new int[100];

	@ObfuscatedName("client.zf")
	public String[] field324 = new String[100];

	@ObfuscatedName("client.Af")
	public String[] field325 = new String[100];

	@ObfuscatedName("client.Bf")
	public XANVNPIN[] field326 = new XANVNPIN[8];

	@ObfuscatedName("client.Ff")
	public int field330 = 0x4D4233;

	@ObfuscatedName("client.Kf")
	public long[] field335 = new long[100];

	@ObfuscatedName("client.Nf")
	public boolean field338 = false;

	@ObfuscatedName("client.Of")
	public boolean field339 = false;

	@ObfuscatedName("client.Pf")
	public boolean field340 = false;

	@ObfuscatedName("client.Sf")
	public XANVNPIN[] field342 = new XANVNPIN[1000];

	@ObfuscatedName("client.Tf")
	public boolean field343 = false;

	@ObfuscatedName("client.Wf")
	public boolean field346 = false;

	@ObfuscatedName("client.ag")
	public boolean field350 = false;

	@ObfuscatedName("client.bg")
	public int field351 = 3;

	@ObfuscatedName("client.cg")
	public XANVNPIN[] field352 = new XANVNPIN[32];

	@ObfuscatedName("client.kg")
	public byte[] field360 = new byte[16384];

	@ObfuscatedName("client.ng")
	public boolean field363 = false;

	@ObfuscatedName("client.pg")
	public int[] field365 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.wg")
	public boolean field372 = false;

	@ObfuscatedName("client.yg")
	public int field374 = 0x332D25;

	@ObfuscatedName("client.Cg")
	public int field377 = 0x766654;

	@ObfuscatedName("client.Og")
	public volatile boolean field388 = false;

	@ObfuscatedName("client.Sg")
	public int[] field392 = new int[500];

	@ObfuscatedName("client.Tg")
	public int[] field393 = new int[500];

	@ObfuscatedName("client.Ug")
	public int[] field394 = new int[500];

	@ObfuscatedName("client.Vg")
	public int[] field395 = new int[500];

	@ObfuscatedName("client.Yg")
	public int[][] field397 = new int[104][104];

	@ObfuscatedName("client.ah")
	public volatile boolean field399 = false;

	@ObfuscatedName("client.bh")
	public boolean field400 = false;

	@ObfuscatedName("client.ih")
	public final int[] field407 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.jh")
	public int[] field408 = new int[5];

	@ObfuscatedName("client.yh")
	public int[] field421 = new int[1000];

	@ObfuscatedName("client.Bh")
	public DNRIFKTO field424 = DNRIFKTO.method177(1);

	@ObfuscatedName("client.Dh")
	public LUAMUNXO field425 = new LUAMUNXO();

	@ObfuscatedName("client.Fh")
	public int field427 = 2;

	@ObfuscatedName("client.Sh")
	public boolean field438 = false;

	@ObfuscatedName("client.Th")
	public String field439 = "";

	@ObfuscatedName("client.Uh")
	public String field440 = "";

	@ObfuscatedName("client.Vh")
	public int[] field441 = new int[151];

	@ObfuscatedName("client.Xh")
	public int[] field442 = new int[200];

	@ObfuscatedName("client.ai")
	public final int field443 = 100;

	@ObfuscatedName("client.bi")
	public int[] field444 = new int[100];

	@ObfuscatedName("client.ci")
	public int field445 = -1;

	@ObfuscatedName("client.di")
	public int[] field446 = new int[50];

	@ObfuscatedName("client.ei")
	public int[] field447 = new int[9];

	@ObfuscatedName("client.fi")
	public DNRIFKTO field448 = DNRIFKTO.method177(1);

	@ObfuscatedName("client.hi")
	public boolean field450 = false;

	@ObfuscatedName("client.oi")
	public int[] field456 = new int[50];

	@ObfuscatedName("client.qi")
	public int field458 = -1;

	@ObfuscatedName("client.ri")
	public ZCVCEQHJ[][][] field459 = new ZCVCEQHJ[4][104][104];

	@ObfuscatedName("client.vi")
	public boolean field462 = true;

	@ObfuscatedName("client.xi")
	public int field464 = -1;

	@ObfuscatedName("client.Di")
	public int[][] field470 = new int[104][104];

	@ObfuscatedName("client.Ni")
	public int field478 = -1;

	@ObfuscatedName("client.Oi")
	public boolean field479 = true;

	@ObfuscatedName("client.Pi")
	public boolean field480 = false;

	@ObfuscatedName("client.Qi")
	public int[] field481 = new int[4000];

	@ObfuscatedName("client.Ri")
	public int[] field482 = new int[4000];

	@ObfuscatedName("client.Yi")
	public int[] field489 = new int[151];

	@ObfuscatedName("client.aj")
	public int[] field490 = new int[33];

	@ObfuscatedName("client.dj")
	public String[] field491 = new String[5];

	@ObfuscatedName("client.ej")
	public boolean[] field492 = new boolean[5];

	@ObfuscatedName("client.fj")
	public int[] field493 = new int[CEBVDRFM.field99];

	@ObfuscatedName("client.hj")
	public int[] field495 = new int[CEBVDRFM.field99];

	@ObfuscatedName("client.jj")
	public int field497 = 1;

	@ObfuscatedName("client.oj")
	public int[] field500 = new int[5];

	@ObfuscatedName("client.qj")
	public int field502 = 2048;

	@ObfuscatedName("client.rj")
	public int field503 = 2047;

	@ObfuscatedName("client.sj")
	public HHCKFJEO[] field504 = new HHCKFJEO[field502];

	@ObfuscatedName("client.uj")
	public int[] field506 = new int[field502];

	@ObfuscatedName("client.wj")
	public int[] field508 = new int[field502];

	@ObfuscatedName("client.xj")
	public DNRIFKTO[] field509 = new DNRIFKTO[field502];

	@ObfuscatedName("client.yj")
	public URWDWMOD[] field510 = new URWDWMOD[4];

	@ObfuscatedName("client.Aj")
	public PQKEJITK[] field512 = new PQKEJITK[100];

	@ObfuscatedName("client.Cj")
	public int field514 = -1;

	@ObfuscatedName("client.Fj")
	public boolean field516 = false;

	@ObfuscatedName("client.Tj")
	public int field528 = -1;

	@ObfuscatedName("client.Uj")
	public int field529 = -1;

	@ObfuscatedName("client.Wj")
	public boolean field531 = false;

	@ObfuscatedName("client.Xj")
	public int[] field532 = new int[2000];

	@ObfuscatedName("client.Yj")
	public boolean field533 = false;

	@ObfuscatedName("client.Zj")
	public String field534 = "";

	@ObfuscatedName("client.bk")
	public String field535 = "";

	@ObfuscatedName("client.ek")
	public int field536 = -1;

	@ObfuscatedName("client.fk")
	public XANVNPIN[] field537 = new XANVNPIN[20];

	@ObfuscatedName("client.hk")
	public int field538 = -1;

	@ObfuscatedName("client.jk")
	public boolean field540 = false;

	@ObfuscatedName("client.Ad")
	public static String field235 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.de")
	public static int field256 = 10;

	@ObfuscatedName("client.fe")
	public static boolean field258 = true;

	@ObfuscatedName("client.We")
	public static BigInteger field297 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Uf")
	public static final int[][] field344 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.lg")
	public static int[] field361 = new int[99];

	@ObfuscatedName("client.ch")
	public static BigInteger field401 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.yi")
	public static final int[] field465 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.pj")
	public static int[] field501 = new int[32];

	@ObfuscatedName("client.L")
	public int field103;

	@ObfuscatedName("client.W")
	public int field114;

	@ObfuscatedName("client.Z")
	public int field117;

	@ObfuscatedName("client.ab")
	public int field118;

	@ObfuscatedName("client.db")
	public int field121;

	@ObfuscatedName("client.eb")
	public int field122;

	@ObfuscatedName("client.fb")
	public int field123;

	@ObfuscatedName("client.gb")
	public int field124;

	@ObfuscatedName("client.hb")
	public int field125;

	@ObfuscatedName("client.jb")
	public int field127;

	@ObfuscatedName("client.wb")
	public int field138;

	@ObfuscatedName("client.xb")
	public int field139;

	@ObfuscatedName("client.zb")
	public int field141;

	@ObfuscatedName("client.Ab")
	public int field142;

	@ObfuscatedName("client.Bb")
	public int field143;

	@ObfuscatedName("client.Cb")
	public int field144;

	@ObfuscatedName("client.Db")
	public int field145;

	@ObfuscatedName("client.Fb")
	public int field147;

	@ObfuscatedName("client.Jb")
	public int field149;

	@ObfuscatedName("client.Pb")
	public int field154;

	@ObfuscatedName("client.Sb")
	public int field157;

	@ObfuscatedName("client.Vb")
	public int field160;

	@ObfuscatedName("client.Wb")
	public int field161;

	@ObfuscatedName("client.ec")
	public static int field166;

	@ObfuscatedName("client.fc")
	public int field167;

	@ObfuscatedName("client.hc")
	public int field168;

	@ObfuscatedName("client.ic")
	public int field169;

	@ObfuscatedName("client.jc")
	public int field170;

	@ObfuscatedName("client.mc")
	public int field173;

	@ObfuscatedName("client.nc")
	public int field174;

	@ObfuscatedName("client.oc")
	public int field175;

	@ObfuscatedName("client.rc")
	public int field178;

	@ObfuscatedName("client.Bc")
	public int field187;

	@ObfuscatedName("client.Fc")
	public int field190;

	@ObfuscatedName("client.Gc")
	public int field191;

	@ObfuscatedName("client.Hc")
	public int field192;

	@ObfuscatedName("client.Qc")
	public int field199;

	@ObfuscatedName("client.Sc")
	public int field201;

	@ObfuscatedName("client.Yc")
	public int field207;

	@ObfuscatedName("client.fd")
	public int field214;

	@ObfuscatedName("client.gd")
	public static int field215;

	@ObfuscatedName("client.ld")
	public int field220;

	@ObfuscatedName("client.vd")
	public int field230;

	@ObfuscatedName("client.wd")
	public int field231;

	@ObfuscatedName("client.xd")
	public int field232;

	@ObfuscatedName("client.yd")
	public int field233;

	@ObfuscatedName("client.zd")
	public int field234;

	@ObfuscatedName("client.Bd")
	public int field236;

	@ObfuscatedName("client.Fd")
	public int field240;

	@ObfuscatedName("client.Ld")
	public int field245;

	@ObfuscatedName("client.Sd")
	public int field250;

	@ObfuscatedName("client.ae")
	public int field253;

	@ObfuscatedName("client.ee")
	public static int field257;

	@ObfuscatedName("client.le")
	public static int field261;

	@ObfuscatedName("client.ne")
	public int field263;

	@ObfuscatedName("client.qe")
	public int field266;

	@ObfuscatedName("client.re")
	public static int field267;

	@ObfuscatedName("client.se")
	public int field268;

	@ObfuscatedName("client.te")
	public int field269;

	@ObfuscatedName("client.ue")
	public static int field270;

	@ObfuscatedName("client.ze")
	public int field274;

	@ObfuscatedName("client.Ee")
	public static int field279;

	@ObfuscatedName("client.Le")
	public static int field286;

	@ObfuscatedName("client.Qe")
	public int field291;

	@ObfuscatedName("client.Re")
	public int field292;

	@ObfuscatedName("client.Se")
	public int field293;

	@ObfuscatedName("client.Te")
	public int field294;

	@ObfuscatedName("client.Ue")
	public int field295;

	@ObfuscatedName("client.Xe")
	public int field298;

	@ObfuscatedName("client.bf")
	public int field301;

	@ObfuscatedName("client.df")
	public int field303;

	@ObfuscatedName("client.ef")
	public int field304;

	@ObfuscatedName("client.ff")
	public int field305;

	@ObfuscatedName("client.gf")
	public int field306;

	@ObfuscatedName("client.hf")
	public int field307;

	@ObfuscatedName("client.jf")
	public int field308;

	@ObfuscatedName("client.mf")
	public int field311;

	@ObfuscatedName("client.nf")
	public int field312;

	@ObfuscatedName("client.of")
	public int field313;

	@ObfuscatedName("client.pf")
	public int field314;

	@ObfuscatedName("client.qf")
	public int field315;

	@ObfuscatedName("client.rf")
	public int field316;

	@ObfuscatedName("client.sf")
	public int field317;

	@ObfuscatedName("client.tf")
	public int field318;

	@ObfuscatedName("client.uf")
	public static int field319;

	@ObfuscatedName("client.vf")
	public int field320;

	@ObfuscatedName("client.xf")
	public int field322;

	@ObfuscatedName("client.Cf")
	public int field327;

	@ObfuscatedName("client.Df")
	public int field328;

	@ObfuscatedName("client.Ef")
	public int field329;

	@ObfuscatedName("client.Gf")
	public int field331;

	@ObfuscatedName("client.Hf")
	public int field332;

	@ObfuscatedName("client.Lf")
	public int field336;

	@ObfuscatedName("client.Mf")
	public static int field337;

	@ObfuscatedName("client.Qf")
	public int field341;

	@ObfuscatedName("client.Vf")
	public int field345;

	@ObfuscatedName("client.Xf")
	public int field347;

	@ObfuscatedName("client.Yf")
	public static int field348;

	@ObfuscatedName("client.Zf")
	public static int field349;

	@ObfuscatedName("client.dg")
	public int field353;

	@ObfuscatedName("client.eg")
	public static int field354;

	@ObfuscatedName("client.jg")
	public int field359;

	@ObfuscatedName("client.mg")
	public int field362;

	@ObfuscatedName("client.og")
	public int field364;

	@ObfuscatedName("client.qg")
	public int field366;

	@ObfuscatedName("client.rg")
	public int field367;

	@ObfuscatedName("client.sg")
	public int field368;

	@ObfuscatedName("client.tg")
	public int field369;

	@ObfuscatedName("client.ug")
	public int field370;

	@ObfuscatedName("client.vg")
	public int field371;

	@ObfuscatedName("client.xg")
	public static int field373;

	@ObfuscatedName("client.Ag")
	public int field375;

	@ObfuscatedName("client.Bg")
	public int field376;

	@ObfuscatedName("client.Dg")
	public int field378;

	@ObfuscatedName("client.Pg")
	public int field389;

	@ObfuscatedName("client.Qg")
	public int field390;

	@ObfuscatedName("client.Xg")
	public static int field396;

	@ObfuscatedName("client.dh")
	public static int field402;

	@ObfuscatedName("client.rh")
	public int field415;

	@ObfuscatedName("client.sh")
	public int field416;

	@ObfuscatedName("client.uh")
	public int field418;

	@ObfuscatedName("client.xh")
	public int field420;

	@ObfuscatedName("client.Ah")
	public int field423;

	@ObfuscatedName("client.Eh")
	public int field426;

	@ObfuscatedName("client.Gh")
	public int field428;

	@ObfuscatedName("client.Hh")
	public int field429;

	@ObfuscatedName("client.Ih")
	public int field430;

	@ObfuscatedName("client.Jh")
	public int field431;

	@ObfuscatedName("client.Lh")
	public int field432;

	@ObfuscatedName("client.Mh")
	public static int field433;

	@ObfuscatedName("client.Nh")
	public int field434;

	@ObfuscatedName("client.Ph")
	public int field435;

	@ObfuscatedName("client.Qh")
	public int field436;

	@ObfuscatedName("client.Rh")
	public int field437;

	@ObfuscatedName("client.gi")
	public int field449;

	@ObfuscatedName("client.ii")
	public int field451;

	@ObfuscatedName("client.ji")
	public int field452;

	@ObfuscatedName("client.ki")
	public int field453;

	@ObfuscatedName("client.li")
	public int field454;

	@ObfuscatedName("client.pi")
	public int field457;

	@ObfuscatedName("client.si")
	public static int field460;

	@ObfuscatedName("client.ui")
	public int field461;

	@ObfuscatedName("client.wi")
	public static int field463;

	@ObfuscatedName("client.zi")
	public int field466;

	@ObfuscatedName("client.Ai")
	public int field467;

	@ObfuscatedName("client.Bi")
	public int field468;

	@ObfuscatedName("client.Ci")
	public int field469;

	@ObfuscatedName("client.Ii")
	public int field473;

	@ObfuscatedName("client.Ji")
	public int field474;

	@ObfuscatedName("client.Ki")
	public int field475;

	@ObfuscatedName("client.Li")
	public int field476;

	@ObfuscatedName("client.Mi")
	public int field477;

	@ObfuscatedName("client.Xi")
	public int field488;

	@ObfuscatedName("client.ij")
	public int field496;

	@ObfuscatedName("client.tj")
	public int field505;

	@ObfuscatedName("client.vj")
	public int field507;

	@ObfuscatedName("client.zj")
	public int field511;

	@ObfuscatedName("client.Bj")
	public int field513;

	@ObfuscatedName("client.Ej")
	public int field515;

	@ObfuscatedName("client.Gj")
	public int field517;

	@ObfuscatedName("client.Ij")
	public int field518;

	@ObfuscatedName("client.Kj")
	public static int field520;

	@ObfuscatedName("client.Lj")
	public int field521;

	@ObfuscatedName("client.Mj")
	public int field522;

	@ObfuscatedName("client.Oj")
	public int field523;

	@ObfuscatedName("client.Pj")
	public int field524;

	@ObfuscatedName("client.Qj")
	public int field525;

	@ObfuscatedName("client.Rj")
	public int field526;

	@ObfuscatedName("client.Sj")
	public int field527;

	@ObfuscatedName("client.ik")
	public int field539;

	@ObfuscatedName("client.kk")
	public int field541;

	@ObfuscatedName("client.lc")
	public long field172;

	@ObfuscatedName("client.Tc")
	public long field202;

	@ObfuscatedName("client.ie")
	public long field260;

	@ObfuscatedName("client.Zg")
	public long field398;

	@ObfuscatedName("client.qh")
	public long field414;

	@ObfuscatedName("client.Mc")
	public CNFMYDSL field195;

	@ObfuscatedName("client.lh")
	public EOVZRNPE field410;

	@ObfuscatedName("client.mh")
	public EOVZRNPE field411;

	@ObfuscatedName("client.nh")
	public EOVZRNPE field412;

	@ObfuscatedName("client.oh")
	public EOVZRNPE field413;

	@ObfuscatedName("client.Ac")
	public FNOQZAYQ field186;

	@ObfuscatedName("client.zh")
	public GOLMSHHL field422;

	@ObfuscatedName("client.Wd")
	public static HHCKFJEO field252;

	@ObfuscatedName("client.Eb")
	public MWSOISVX field146;

	@ObfuscatedName("client.Pe")
	public OAGIEZRU field290;

	@ObfuscatedName("client.yc")
	public PQKEJITK field184;

	@ObfuscatedName("client.zc")
	public PQKEJITK field185;

	@ObfuscatedName("client.id")
	public PQKEJITK field217;

	@ObfuscatedName("client.jd")
	public PQKEJITK field218;

	@ObfuscatedName("client.kd")
	public PQKEJITK field219;

	@ObfuscatedName("client.Me")
	public PQKEJITK field287;

	@ObfuscatedName("client.Ne")
	public PQKEJITK field288;

	@ObfuscatedName("client.Oe")
	public PQKEJITK field289;

	@ObfuscatedName("client.If")
	public PQKEJITK field333;

	@ObfuscatedName("client.Jf")
	public PQKEJITK field334;

	@ObfuscatedName("client.Eg")
	public PQKEJITK field379;

	@ObfuscatedName("client.Fg")
	public PQKEJITK field380;

	@ObfuscatedName("client.Gg")
	public PQKEJITK field381;

	@ObfuscatedName("client.Hg")
	public PQKEJITK field382;

	@ObfuscatedName("client.Ig")
	public PQKEJITK field383;

	@ObfuscatedName("client.Si")
	public PQKEJITK field483;

	@ObfuscatedName("client.Ti")
	public PQKEJITK field484;

	@ObfuscatedName("client.Ui")
	public PQKEJITK field485;

	@ObfuscatedName("client.Vi")
	public PQKEJITK field486;

	@ObfuscatedName("client.Wi")
	public PQKEJITK field487;

	@ObfuscatedName("client.mb")
	public TRQPVNER field129;

	@ObfuscatedName("client.nb")
	public TRQPVNER field130;

	@ObfuscatedName("client.ob")
	public TRQPVNER field131;

	@ObfuscatedName("client.pb")
	public TRQPVNER field132;

	@ObfuscatedName("client.qb")
	public TRQPVNER field133;

	@ObfuscatedName("client.rb")
	public TRQPVNER field134;

	@ObfuscatedName("client.sb")
	public TRQPVNER field135;

	@ObfuscatedName("client.tb")
	public TRQPVNER field136;

	@ObfuscatedName("client.ub")
	public TRQPVNER field137;

	@ObfuscatedName("client.Nc")
	public TRQPVNER field196;

	@ObfuscatedName("client.Oc")
	public TRQPVNER field197;

	@ObfuscatedName("client.Pc")
	public TRQPVNER field198;

	@ObfuscatedName("client.md")
	public TRQPVNER field221;

	@ObfuscatedName("client.nd")
	public TRQPVNER field222;

	@ObfuscatedName("client.od")
	public TRQPVNER field223;

	@ObfuscatedName("client.pd")
	public TRQPVNER field224;

	@ObfuscatedName("client.qd")
	public TRQPVNER field225;

	@ObfuscatedName("client.rd")
	public TRQPVNER field226;

	@ObfuscatedName("client.sd")
	public TRQPVNER field227;

	@ObfuscatedName("client.td")
	public TRQPVNER field228;

	@ObfuscatedName("client.ud")
	public TRQPVNER field229;

	@ObfuscatedName("client.fg")
	public TRQPVNER field355;

	@ObfuscatedName("client.gg")
	public TRQPVNER field356;

	@ObfuscatedName("client.hg")
	public TRQPVNER field357;

	@ObfuscatedName("client.ig")
	public TRQPVNER field358;

	@ObfuscatedName("client.Lb")
	public XANVNPIN field151;

	@ObfuscatedName("client.Mb")
	public XANVNPIN field152;

	@ObfuscatedName("client.ad")
	public XANVNPIN field209;

	@ObfuscatedName("client.bd")
	public XANVNPIN field210;

	@ObfuscatedName("client.cd")
	public XANVNPIN field211;

	@ObfuscatedName("client.dd")
	public XANVNPIN field212;

	@ObfuscatedName("client.ed")
	public XANVNPIN field213;

	@ObfuscatedName("client.Rg")
	public XANVNPIN field391;

	@ObfuscatedName("client.kh")
	public XANVNPIN field409;

	@ObfuscatedName("client.Ei")
	public XANVNPIN field471;

	@ObfuscatedName("client.Fi")
	public XANVNPIN field472;

	@ObfuscatedName("client.lj")
	public XANVNPIN field498;

	@ObfuscatedName("client.mj")
	public XANVNPIN field499;

	@ObfuscatedName("client.Jj")
	public XANVNPIN field519;

	@ObfuscatedName("client.Vj")
	public XANVNPIN field530;

	@ObfuscatedName("client.X")
	public XSMXYXEY field115;

	@ObfuscatedName("client.kc")
	public String field171;

	@ObfuscatedName("client.pc")
	public String field176;

	@ObfuscatedName("client.Vc")
	public String field204;

	@ObfuscatedName("client.mi")
	public String field455;

	@ObfuscatedName("client.me")
	public Socket field262;

	@ObfuscatedName("client.V")
	public static boolean field113;

	@ObfuscatedName("client.Jd")
	public static boolean field243;

	@ObfuscatedName("client.ge")
	public static boolean field259;

	@ObfuscatedName("client.Ke")
	public static boolean field285;

	@ObfuscatedName("client.bb")
	public int[] field119;

	@ObfuscatedName("client.cb")
	public int[] field120;

	@ObfuscatedName("client.Xb")
	public int[] field162;

	@ObfuscatedName("client.Yb")
	public int[] field163;

	@ObfuscatedName("client.Zb")
	public int[] field164;

	@ObfuscatedName("client.ac")
	public int[] field165;

	@ObfuscatedName("client.Pd")
	public int[] field247;

	@ObfuscatedName("client.Qd")
	public int[] field248;

	@ObfuscatedName("client.Rd")
	public int[] field249;

	@ObfuscatedName("client.Lg")
	public int[] field386;

	@ObfuscatedName("client.Mg")
	public int[] field387;

	@ObfuscatedName("client.eh")
	public int[] field403;

	@ObfuscatedName("client.fh")
	public int[] field404;

	@ObfuscatedName("client.gh")
	public int[] field405;

	@ObfuscatedName("client.hh")
	public int[] field406;

	@ObfuscatedName("client.gj")
	public PQKEJITK[] field494;

	@ObfuscatedName("client.th")
	public byte[][] field417;

	@ObfuscatedName("client.wh")
	public byte[][] field419;

	@ObfuscatedName("client.Jg")
	public byte[][][] field384;

	@ObfuscatedName("client.Kg")
	public int[][][] field385;

	@ObfuscatedName("client.c(I)V")
	public final void method24() {
		Graphics var1 = method73().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method300(1);

		if (field372) {
			field399 = false;
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

		if (field208) {
			field399 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field338) {
			field399 = false;
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

	public final void init() {
		field256 = Integer.parseInt(getParameter("nodeid"));
		field257 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method95();
		} else {
			method85();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field258 = false;
		} else {
			field258 = true;
		}

		method298(503, 765);
	}

	@ObfuscatedName("client.a(BLLUAMUNXO;)Z")
	public final boolean method25(LUAMUNXO arg0) {
		int var2 = arg0.field833;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field283[field541] = "Remove @whi@" + arg0.field871;
				field394[field541] = 156;
				field541++;
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

		field283[field541] = "Remove @whi@" + field128[var2];
		field394[field541] = 942;
		field541++;
		field283[field541] = "Message @whi@" + field128[var2];
		field394[field541] = 765;
		field541++;
		return true;
	}

	@ObfuscatedName("client.a(ZILDNRIFKTO;)V")
	public final void method26(int arg0, DNRIFKTO arg1) {
		arg1.method199();
		int var3 = arg1.method200(1);
		if (var3 != 0) {
			int var4 = arg1.method200(2);
			if (var4 == 0) {
				field508[field507++] = field503;
			} else if (var4 == 1) {
				int var5 = arg1.method200(3);
				field252.method19(var5, false);
				int var6 = arg1.method200(1);
				if (var6 == 1) {
					field508[field507++] = field503;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method200(3);
				field252.method19(var7, true);
				int var8 = arg1.method200(3);
				field252.method19(var8, true);
				int var9 = arg1.method200(1);
				if (var9 == 1) {
					field508[field507++] = field503;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method200(1);
				if (var10 == 1) {
					field508[field507++] = field503;
				}

				int var11 = arg1.method200(7);
				int var12 = arg1.method200(1);
				int var13 = arg1.method200(7);
				field295 = arg1.method200(2);
				field252.method22(var11, var13, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method27(int arg0, String arg1) {
		field347 = arg0;
		field176 = arg1;
		method88();

		if (field186 == null) {
			super.method27(arg0, arg1);
		} else {
			field223.method455();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field412.method230(0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			VDGJUQAS.method518(34, var3 / 2 - 152, 0x8C1111, 304, var6);
			VDGJUQAS.method518(32, var3 / 2 - 151, 0, 302, var6 + 1);
			VDGJUQAS.method517(30, 0x8C1111, var3 / 2 - 150, arg0 * 3, var6 + 2);
			VDGJUQAS.method517(30, 0, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, var6 + 2);
			field412.method230(0xFFFFFF, var3 / 2, arg1, var4 / 2 + 5 - var5);
			field223.method456(202, field781, 171);

			if (field346) {
				field346 = false;

				if (!field399) {
					field224.method456(0, field781, 0);
					field225.method456(637, field781, 0);
				}

				field221.method456(128, field781, 0);
				field222.method456(202, field781, 371);
				field226.method456(0, field781, 265);
				field227.method456(562, field781, 265);
				field228.method456(128, field781, 171);
				field229.method456(562, field781, 171);
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method28() {
		int var1 = 5;
		field447[8] = 0;
		int var2 = 0;
		while (field447[8] == 0) {
			String var3 = "Unknown problem";
			method27(20, "Connecting to web server");

			try {
				DataInputStream var4 = method162("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 336);
				DNRIFKTO var5 = new DNRIFKTO(new byte[40]);
				var4.readFully(var5.field562, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field447[var6] = var5.method194();
				}

				int var7 = var5.method194();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field447[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field447[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field447[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field447[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field447[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field447[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method27(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method27(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field148 = !field148;
			}
		}
	}

	@ObfuscatedName("client.e(I)Ljava/net/Socket;")
	public final Socket method29(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(BIII)Z")
	public final boolean method30(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field115.method568(field295, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SRQVPDWQ var8 = SRQVPDWQ.method445(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1239;
				var10 = var8.field1238;
			} else {
				var9 = var8.field1238;
				var10 = var8.field1239;
			}

			int var11 = var8.field1220;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method46(field252.field83[0], var9, false, arg0, 0, arg2, var10, var11, 0, field252.field82[0], 2);
		} else {
			method46(field252.field83[0], 0, false, arg0, var7, arg2, 0, 0, var6 + 1, field252.field82[0], 2);
		}

		field121 = field796;
		field122 = field797;
		field124 = 2;
		field123 = 0;
		return true;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method31() {
		int var1 = field412.method232("Choose Option");
		for (int var2 = 0; var2 < field541; var2++) {
			int var3 = field412.method232(field283[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field541 * 15 + 21;
		if (field796 > 4 && field797 > 4 && field796 < 516 && field797 < 338) {
			int var5 = field796 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field797 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field363 = true;
			field473 = 0;
			field474 = var5;
			field475 = var6;
			field476 = var1;
			field477 = field541 * 15 + 22;
		}

		if (field796 > 553 && field797 > 205 && field796 < 743 && field797 < 466) {
			int var7 = field796 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field797 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field363 = true;
			field473 = 1;
			field474 = var7;
			field475 = var8;
			field476 = var1;
			field477 = field541 * 15 + 22;
		}

		if (field796 > 17 && field797 > 357 && field796 < 496 && field797 < 453) {
			int var9 = field796 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field797 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field363 = true;
			field473 = 2;
			field474 = var9;
			field475 = var10;
			field476 = var1;
			field477 = field541 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(LHHCKFJEO;ILDNRIFKTO;II)V")
	public final void method32(HHCKFJEO arg0, DNRIFKTO arg1, int arg2, int arg3) {
		if ((arg3 & 0x80) != 0) {
			arg0.field65 = arg1.method215();
			if (arg0.field65 == 0xFFFF) {
				arg0.field65 = -1;
			}
		}

		if ((arg3 & 0x400) != 0) {
			arg0.field70 = arg1.method206();
			arg0.field72 = arg1.method208();
			arg0.field71 = arg1.method206();
			arg0.field73 = arg1.method206();
			arg0.field74 = arg1.method214() + field402;
			arg0.field75 = arg1.method215() + field402;
			arg0.field76 = arg1.method189();
			arg0.method21();
		}

		if ((arg3 & 0x10) != 0) {
			int var5 = arg1.method207();
			byte[] var6 = new byte[var5];
			DNRIFKTO var7 = new DNRIFKTO(var6);
			arg1.method226(var5, 0, var6);
			field509[arg2] = var7;
			arg0.method277(var7);
		}

		if ((arg3 & 0x100) != 0) {
			int var8 = arg1.method207();
			int var9 = arg1.method207();
			arg0.method23(var9, var8, field402);
			arg0.field48 = field402 + 300;
			arg0.field49 = arg1.method208();
			arg0.field50 = arg1.method189();
		}

		if ((arg3 & 0x40) != 0) {
			arg0.field80 = arg1.method215();
			arg0.field81 = arg1.method191();
		}

		if ((arg3 & 0x20) != 0) {
			int var10 = arg1.method189();
			int var11 = arg1.method208();
			arg0.method23(var11, var10, field402);
			arg0.field48 = field402 + 300;
			arg0.field49 = arg1.method189();
			arg0.field50 = arg1.method206();
		}

		if ((arg3 & 0x1) != 0) {
			int var12 = arg1.method214();
			int var13 = arg1.method206();
			int var14 = arg1.method208();
			int var15 = arg1.field563;

			if (arg0.field698 != null && arg0.field697) {
				long var16 = JDMIWTSP.method278(arg0.field698);
				boolean var18 = false;
				if (var13 <= 1) {
					for (int var19 = 0; var19 < field114; var19++) {
						if (field335[var19] == var16) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field240 == 0) {
					try {
						field272.field563 = 0;
						arg1.method226(var14, 0, field272.field562);
						field272.field563 = 0;
						String var20 = REROLFNU.method398(var14, field272);
						var20 = ULPSDNZC.method472(var20);
						arg0.field93 = var20;
						arg0.field60 = var12 >> 8;
						arg0.field66 = var12 & 0xFF;
						arg0.field68 = 150;

						if (var13 == 2 || var13 == 3) {
							method136(1, var20, "@cr2@" + arg0.field698);
						} else if (var13 == 1) {
							method136(1, var20, "@cr1@" + arg0.field698);
						} else {
							method136(2, var20, arg0.field698);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field563 = var14 + var15;
		}

		if ((arg3 & 0x4) != 0) {
			int var22 = arg1.method215();
			if (var22 == 0xFFFF) {
				var22 = -1;
			}

			int var23 = arg1.method207();
			if (arg0.field84 == var22 && var22 != -1) {
				int var24 = ZGXCNUJM.field1481[var22].field1495;
				if (var24 == 1) {
					arg0.field85 = 0;
					arg0.field86 = 0;
					arg0.field87 = var23;
					arg0.field88 = 0;
				}

				if (var24 == 2) {
					arg0.field88 = 0;
				}
			} else if (var22 == -1 || arg0.field84 == -1 || ZGXCNUJM.field1481[var22].field1489 >= ZGXCNUJM.field1481[arg0.field84].field1489) {
				arg0.field84 = var22;
				arg0.field85 = 0;
				arg0.field86 = 0;
				arg0.field87 = var23;
				arg0.field88 = 0;
				arg0.field89 = arg0.field77;
			}
		}

		if ((arg3 & 0x2) != 0) {
			arg0.field93 = arg1.method196();
			if (arg0.field93.charAt(0) == '~') {
				arg0.field93 = arg0.field93.substring(1);
				method136(2, arg0.field93, arg0.field698);
			} else if (field252 == arg0) {
				method136(2, arg0.field93, arg0.field698);
			}

			arg0.field60 = 0;
			arg0.field66 = 0;
			arg0.field68 = 150;
		}

		if ((arg3 & 0x200) != 0) {
			arg0.field55 = arg1.method216();
			int var25 = arg1.method224();
			arg0.field59 = var25 >> 16;
			arg0.field58 = (var25 & 0xFFFF) + field402;
			arg0.field56 = 0;
			arg0.field57 = 0;

			if (arg0.field58 > field402) {
				arg0.field56 = -1;
			}

			if (arg0.field55 == 0xFFFF) {
				arg0.field55 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LDNRIFKTO;II)V")
	public final void method33(DNRIFKTO arg0, int arg1) {
		while (arg0.field564 + 10 < arg1 * 8) {
			int var3 = arg0.method200(11);
			if (var3 == 2047) {
				break;
			}

			if (field504[var3] == null) {
				field504[var3] = new HHCKFJEO();
				if (field509[var3] != null) {
					field504[var3].method277(field509[var3]);
				}
			}

			field506[field505++] = var3;
			HHCKFJEO var4 = field504[var3];
			var4.field67 = field402;
			int var5 = arg0.method200(1);
			if (var5 == 1) {
				field508[field507++] = var3;
			}

			int var6 = arg0.method200(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method200(1);
			int var8 = arg0.method200(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method22(field252.field83[0] + var8, field252.field82[0] + var6, var7 == 1);
		}

		arg0.method201();
	}

	@ObfuscatedName("client.e(B)V")
	public final void method34() {
		field356.method455();

		if (field431 == 2) {
			byte[] var1 = field218.field1094;
			int[] var2 = VDGJUQAS.field1311;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field409.method533(33, 25, 256, field190, 25, field490, field102, 0, 0, 33);
			field357.method455();
			AWNOLVYV.field32 = field405;
		} else {
			int var5 = field426 + field190 & 0x7FF;
			int var6 = field252.field96 / 32 + 48;
			int var7 = 464 - field252.field97 / 32;
			field391.method533(146, var7, field496 + 256, var5, var6, field489, field441, 25, 5, 151);
			field409.method533(33, 25, 256, field190, 25, field490, field102, 0, 0, 33);

			for (int var8 = 0; var8 < field157; var8++) {
				int var9 = field158[var8] * 4 + 2 - field252.field96 / 32;
				int var10 = field159[var8] * 4 + 2 - field252.field97 / 32;
				method77(field342[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ZCVCEQHJ var13 = field459[field295][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field252.field96 / 32;
						int var15 = var12 * 4 + 2 - field252.field97 / 32;
						method77(field209, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field274; var16++) {
				DLNPJUEQ var17 = field273[field275[var16]];
				if (var17 != null && var17.method20()) {
					HEKJNUPL var18 = var17.field561;
					if (var18.field636 != null) {
						var18 = var18.method272();
					}

					if (var18 != null && var18.field656 && var18.field661) {
						int var19 = var17.field96 / 32 - field252.field96 / 32;
						int var20 = var17.field97 / 32 - field252.field97 / 32;
						method77(field210, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field505; var21++) {
				HHCKFJEO var22 = field504[field506[var21]];
				if (var22 != null && var22.method20()) {
					int var23 = var22.field96 / 32 - field252.field96 / 32;
					int var24 = var22.field97 / 32 - field252.field97 / 32;
					boolean var25 = false;
					long var26 = JDMIWTSP.method278(var22.field698);
					for (int var28 = 0; var28 < field268; var28++) {
						if (field280[var28] == var26 && field442[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field252.field674 != 0 && var22.field674 != 0 && field252.field674 == var22.field674) {
						var29 = true;
					}

					if (var25) {
						method77(field212, var24, var23);
					} else if (var29) {
						method77(field213, var24, var23);
					} else {
						method77(field211, var24, var23);
					}
				}
			}

			if (field327 != 0 && field402 % 20 < 10) {
				if (field327 == 1 && field178 >= 0 && field178 < field273.length) {
					DLNPJUEQ var30 = field273[field178];
					if (var30 != null) {
						int var31 = var30.field96 / 32 - field252.field96 / 32;
						int var32 = var30.field97 / 32 - field252.field97 / 32;
						method149(var32, var31, field499);
					}
				}

				if (field327 == 2) {
					int var33 = (field304 - field291) * 4 + 2 - field252.field96 / 32;
					int var34 = (field305 - field292) * 4 + 2 - field252.field97 / 32;
					method149(var34, var33, field499);
				}

				if (field327 == 10 && field201 >= 0 && field201 < field504.length) {
					HHCKFJEO var35 = field504[field201];
					if (var35 != null) {
						int var36 = var35.field96 / 32 - field252.field96 / 32;
						int var37 = var35.field97 / 32 - field252.field97 / 32;
						method149(var37, var36, field499);
					}
				}
			}

			if (field389 != 0) {
				int var38 = field389 * 4 + 2 - field252.field96 / 32;
				int var39 = field390 * 4 + 2 - field252.field97 / 32;
				method77(field498, var39, var38);
			}

			VDGJUQAS.method517(3, 0xFFFFFF, 97, 3, 78);
			field357.method455();
			AWNOLVYV.field32 = field405;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method35() {
		if (field451 == 0 && field168 == 0) {
			field283[field541] = "Walk here";
			field394[field541] = 579;
			field392[field541] = field789;
			field393[field541] = field790;
			field541++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < SNMMQNPZ.field1214; var2++) {
			int var3 = SNMMQNPZ.field1215[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field115.method568(field295, var4, var5, var3) >= 0) {
					SRQVPDWQ var8 = SRQVPDWQ.method445(var7);
					if (var8.field1247 != null) {
						var8 = var8.method451();
					}

					if (var8 == null) {
						continue;
					}

					if (field451 == 1) {
						field283[field541] = "Use " + field455 + " with @cya@" + var8.field1263;
						field394[field541] = 748;
						field395[field541] = var3;
						field392[field541] = var4;
						field393[field541] = var5;
						field541++;
					} else if (field168 != 1) {
						if (var8.field1223 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1223[var9] != null) {
									field283[field541] = var8.field1223[var9] + " @cya@" + var8.field1263;

									if (var9 == 0) {
										field394[field541] = 633;
									}

									if (var9 == 1) {
										field394[field541] = 33;
									}

									if (var9 == 2) {
										field394[field541] = 76;
									}

									if (var9 == 3) {
										field394[field541] = 800;
									}

									if (var9 == 4) {
										field394[field541] = 1194;
									}

									field395[field541] = var3;
									field392[field541] = var4;
									field393[field541] = var5;
									field541++;
								}
							}
						}

						field283[field541] = "Examine @cya@" + var8.field1263;
						field394[field541] = 1704;
						field395[field541] = var8.field1231 << 14;
						field392[field541] = var4;
						field393[field541] = var5;
						field541++;
					} else if ((field170 & 0x4) == 4) {
						field283[field541] = field171 + " @cya@" + var8.field1263;
						field394[field541] = 212;
						field395[field541] = var3;
						field392[field541] = var4;
						field393[field541] = var5;
						field541++;
					}
				}

				if (var6 == 1) {
					DLNPJUEQ var10 = field273[var7];
					if (var10.field561.field652 == 1 && (var10.field96 & 0x7F) == 0x40 && (var10.field97 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field274; var11++) {
							DLNPJUEQ var12 = field273[field275[var11]];
							if (var12 != null && var10 != var12 && var12.field561.field652 == 1 && var10.field96 == var12.field96 && var10.field97 == var12.field97) {
								method116(var4, var12.field561, field275[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field505; var13++) {
							HHCKFJEO var14 = field504[field506[var13]];
							if (var14 != null && var10.field96 == var14.field96 && var10.field97 == var14.field97) {
								method125(var4, var14, var5, field506[var13]);
							}
						}
					}

					method116(var4, var10.field561, var7, var5);
				}

				if (var6 == 0) {
					HHCKFJEO var15 = field504[var7];
					if ((var15.field96 & 0x7F) == 0x40 && (var15.field97 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field274; var16++) {
							DLNPJUEQ var17 = field273[field275[var16]];
							if (var17 != null && var17.field561.field652 == 1 && var15.field96 == var17.field96 && var15.field97 == var17.field97) {
								method116(var4, var17.field561, field275[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field505; var18++) {
							HHCKFJEO var19 = field504[field506[var18]];
							if (var19 != null && var15 != var19 && var15.field96 == var19.field96 && var15.field97 == var19.field97) {
								method125(var4, var19, var5, field506[var18]);
							}
						}
					}

					method125(var4, var15, var5, var7);
				}

				if (var6 == 3) {
					ZCVCEQHJ var20 = field459[field295][var4][var5];
					if (var20 != null) {
						for (ZCNDKOXC var21 = (ZCNDKOXC) var20.method593(); var21 != null; var21 = (ZCNDKOXC) var20.method595()) {
							JKSNDEQS var22 = JKSNDEQS.method293(var21.field1476);
							if (field451 == 1) {
								field283[field541] = "Use " + field455 + " with @lre@" + var22.field729;
								field394[field541] = 341;
								field395[field541] = var21.field1476;
								field392[field541] = var4;
								field393[field541] = var5;
								field541++;
							} else if (field168 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field763 != null && var22.field763[var23] != null) {
										field283[field541] = var22.field763[var23] + " @lre@" + var22.field729;

										if (var23 == 0) {
											field394[field541] = 862;
										}

										if (var23 == 1) {
											field394[field541] = 784;
										}

										if (var23 == 2) {
											field394[field541] = 647;
										}

										if (var23 == 3) {
											field394[field541] = 58;
										}

										if (var23 == 4) {
											field394[field541] = 321;
										}

										field395[field541] = var21.field1476;
										field392[field541] = var4;
										field393[field541] = var5;
										field541++;
									} else if (var23 == 2) {
										field283[field541] = "Take @lre@" + var22.field729;
										field394[field541] = 647;
										field395[field541] = var21.field1476;
										field392[field541] = var4;
										field393[field541] = var5;
										field541++;
									}
								}

								field283[field541] = "Examine @lre@" + var22.field729;
								field394[field541] = 1608;
								field395[field541] = var21.field1476;
								field392[field541] = var4;
								field393[field541] = var5;
								field541++;
							} else if ((field170 & 0x1) == 1) {
								field283[field541] = field171 + " @lre@" + var22.field729;
								field394[field541] = 534;
								field395[field541] = var21.field1476;
								field392[field541] = var4;
								field393[field541] = var5;
								field541++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method36() {
		if (field259 && field522 == 2 && NSTMHEDV.field1041 != field295) {
			if (field357 != null) {
				field357.method455();
				AWNOLVYV.field32 = field405;
				field411.method230(0, 257, "Loading - please wait.", 151);
				field411.method230(0xFFFFFF, 256, "Loading - please wait.", 150);
				field357.method456(4, field781, 4);
			} else if (field782 != null) {
				field782.method455();
				AWNOLVYV.field32 = field406;
				field411.method230(0, 383, "Loading - please wait.", 471);
				field411.method230(0xFFFFFF, 382, "Loading - please wait.", 470);
				field782.method456(0, field781, 0);
			}

			field522 = 1;
			field172 = System.currentTimeMillis();
		}

		if (field522 == 1) {
			int var1 = method37();
			if (var1 != 0 && System.currentTimeMillis() - field172 > 360000L) {
				signlink.reporterror(field264 + " glcfb " + field202 + "," + var1 + "," + field259 + "," + field278[0] + "," + field146.method337() + "," + field295 + "," + field328 + "," + field329);
				field172 = System.currentTimeMillis();
			}
		}

		if (field522 == 2 && field445 != field295) {
			field445 = field295;
			method126(field295);
		}
	}

	@ObfuscatedName("client.g(B)I")
	public final int method37() {
		for (int var1 = 0; var1 < field419.length; var1++) {
			if (field419[var1] == null && field248[var1] != -1) {
				return -1;
			}

			if (field417[var1] == null && field249[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field419.length; var3++) {
			byte[] var4 = field417[var3];
			if (var4 != null) {
				int var5 = (field247[var3] >> 8) * 64 - field291;
				int var6 = (field247[var3] & 0xFF) * 64 - field292;
				if (field533) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= NSTMHEDV.method371(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field205) {
			return -4;
		} else {
			field522 = 2;
			NSTMHEDV.field1041 = field295;
			method69();
			field194.method178(226);
			return 0;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method38() {
		short var1 = 256;

		if (field331 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field331 > 768) {
					field162[var2] = method92(field164[var2], 1024 - field331, field163[var2]);
				} else if (field331 > 256) {
					field162[var2] = field164[var2];
				} else {
					field162[var2] = method92(field163[var2], 256 - field331, field164[var2]);
				}
			}
		} else if (field332 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field332 > 768) {
					field162[var3] = method92(field165[var3], 1024 - field332, field163[var3]);
				} else if (field332 > 256) {
					field162[var3] = field165[var3];
				} else {
					field162[var3] = method92(field163[var3], 256 - field332, field165[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field162[var4] = field163[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field224.field1267[var5] = field151.field1392[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field321[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field386[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field162[var12];
					int var15 = field224.field1267[var7];
					field224.field1267[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field224.method456(0, field781, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field225.field1267[var16] = field152.field1392[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field321[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field386[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field162[var23];
					int var26 = field225.field1267[var18];
					field225.field1267[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field225.method456(637, field781, 0);
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method39(int arg0) {
		if (arg0 >= 0) {
			if (field457 != 0) {
				field457 = 0;
				field188 = true;
			}

			int var2 = field392[arg0];
			int var3 = field393[arg0];
			int var4 = field394[arg0];
			int var5 = field395[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 723 || var4 == 64 || var4 == 942 || var4 == 156) {
				String var6 = field283[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = JDMIWTSP.method278(var6.substring(var7 + 5).trim());
					if (var4 == 723) {
						method161(var8);
					}

					if (var4 == 64) {
						method121(var8);
					}

					if (var4 == 942) {
						method129(var8);
					}

					if (var4 == 156) {
						method70(var8);
					}
				}
			}

			if (var4 == 690) {
				HHCKFJEO var10 = field504[var5];
				if (var10 != null) {
					method46(field252.field83[0], 1, false, var10.field82[0], 0, var10.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(69);
					field194.method211(var5);
					field194.method180(field169);
				}
			}

			if (var4 == 837) {
				HHCKFJEO var11 = field504[var5];
				if (var11 != null) {
					method46(field252.field83[0], 1, false, var11.field82[0], 0, var11.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(25);
					field194.method212(var5);
				}
			}

			if (var4 == 1608) {
				JKSNDEQS var12 = JKSNDEQS.method293(var5);
				String var13;
				if (var12.field742 == null) {
					var13 = "It's a " + var12.field729 + ".";
				} else {
					var13 = new String(var12.field742);
				}

				method136(0, var13, "");
			}

			if (var4 == 579) {
				if (field363) {
					field115.method576(var3 - 4, var2 - 4);
				} else {
					field115.method576(field797 - 4, field796 - 4);
				}
			}

			if (var4 == 534) {
				boolean var14 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
				if (!var14) {
					method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
				}

				field121 = field796;
				field122 = field797;
				field124 = 2;
				field123 = 0;
				field194.method178(48);
				field194.method212(field291 + var2);
				field194.method213(field292 + var3);
				field194.method212(field169);
				field194.method212(var5);
			}

			if (var4 == 777) {
				HHCKFJEO var16 = field504[var5];
				if (var16 != null) {
					method46(field252.field83[0], 1, false, var16.field82[0], 0, var16.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(29);
					field194.method212(field454);
					field194.method213(var5);
					field194.method213(field453);
					field194.method180(field452);
				}
			}

			if (var4 == 433) {
				field194.method178(35);
				field194.method213(var5);
				field194.method212(var2);
				field194.method212(var3);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 1194) {
				method30(var2, var5, var3);
				field194.method178(24);
				field194.method213(field291 + var2);
				field194.method213(var5 >> 14 & 0x7FFF);
				field194.method180(field292 + var3);
			}

			if (var4 == 1704) {
				int var17 = var5 >> 14 & 0x7FFF;
				SRQVPDWQ var18 = SRQVPDWQ.method445(var17);
				String var19;
				if (var18.field1224 == null) {
					var19 = "It's a " + var18.field1263 + ".";
				} else {
					var19 = new String(var18.field1224);
				}

				method136(0, var19, "");
			}

			if (var4 == 212 && method30(var2, var5, var3)) {
				field194.method178(210);
				field194.method180(field292 + var3);
				field194.method212(var5 >> 14 & 0x7FFF);
				field194.method211(field169);
				field194.method211(field291 + var2);
			}

			if (var4 == 503) {
				field194.method178(182);
				field194.method212(var3);
				field194.method212(var5);
				field194.method180(var2);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 236) {
				LUAMUNXO var20 = LUAMUNXO.method316(var3);
				boolean var21 = true;
				if (var20.field833 > 0) {
					var21 = method130(var20);
				}

				if (var21) {
					field194.method178(44);
					field194.method180(var3);
				}
			}

			if (var4 == 321) {
				boolean var22 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
				if (!var22) {
					method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
				}

				field121 = field796;
				field122 = field797;
				field124 = 2;
				field123 = 0;
				field194.method178(96);
				field194.method211(var5);
				field194.method211(field291 + var2);
				field194.method213(field292 + var3);
			}

			if (var4 == 591 && !field531) {
				field194.method178(179);
				field194.method180(var3);
				field531 = true;
			}

			if (var4 == 526) {
				field194.method178(247);
				field194.method212(var2);
				field194.method213(field452);
				field194.method211(var3);
				field194.method213(field454);
				field194.method213(field453);
				field194.method213(var5);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 192) {
				field194.method178(44);
				field194.method180(var3);
				LUAMUNXO var24 = LUAMUNXO.method316(var3);
				if (var24.field893 != null && var24.field893[0][0] == 5) {
					int var25 = var24.field893[0][1];
					if (field532[var25] != var24.field883[0]) {
						field532[var25] = var24.field883[0];
						method139(var25);
						field340 = true;
					}
				}
			}

			if (var4 == 988) {
				DLNPJUEQ var26 = field273[var5];
				if (var26 != null) {
					method46(field252.field83[0], 1, false, var26.field82[0], 0, var26.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(71);
					field194.method212(var5);
				}
			}

			if (var4 == 33) {
				method30(var2, var5, var3);
				field194.method178(86);
				field194.method213(var5 >> 14 & 0x7FFF);
				field194.method180(field292 + var3);
				field194.method180(field291 + var2);
			}

			if (var4 == 18) {
				if ((var3 & 0x3) == 0) {
					field460++;
				}

				if (field460 >= 125) {
					field194.method178(11);
					field194.method179(17);
					field460 = 0;
				}

				field194.method178(0);
				field194.method212(var2);
				field194.method212(var3);
				field194.method211(var5);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 871) {
				field194.method178(239);
				field194.method180(var2);
				field194.method213(var3);
				field194.method180(var5);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 567) {
				method135(field179);
				field179 = -1;
				field188 = true;
			}

			if (var4 == 862) {
				boolean var27 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
				if (!var27) {
					method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
				}

				field121 = field796;
				field122 = field797;
				field124 = 2;
				field123 = 0;
				field194.method178(74);
				field194.method212(field292 + var3);
				field194.method212(var5);
				field194.method213(field291 + var2);
			}

			if (var4 == 20) {
				HHCKFJEO var29 = field504[var5];
				if (var29 != null) {
					method46(field252.field83[0], 1, false, var29.field82[0], 0, var29.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field349 += var5;
					if (field349 >= 114) {
						field194.method178(162);
						field194.method182(0x8B249C);
						field349 = 0;
					}

					field194.method178(201);
					field194.method213(var5);
				}
			}

			if (var4 == 800) {
				method30(var2, var5, var3);
				field194.method178(119);
				field194.method211(field291 + var2);
				field194.method211(var5 >> 14 & 0x7FFF);
				field194.method213(field292 + var3);
			}

			if (var4 == 359) {
				DLNPJUEQ var30 = field273[var5];
				if (var30 != null) {
					method46(field252.field83[0], 1, false, var30.field82[0], 0, var30.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field279 += var5;
					if (field279 >= 132) {
						field194.method178(65);
						field279 = 0;
					}

					field194.method178(230);
					field194.method211(var5);
				}
			}

			if (var4 == 914) {
				field194.method178(127);
				field194.method213(var3);
				field194.method212(var5);
				field194.method211(var2);
				field466 = 0;
				field467 = var3;
				field468 = var2;
				field469 = 2;
				if (LUAMUNXO.method316(var3).field857 == field536) {
					field469 = 1;
				}

				if (LUAMUNXO.method316(var3).field857 == field529) {
					field469 = 3;
				}
			}

			if (var4 == 850) {
				DLNPJUEQ var31 = field273[var5];
				if (var31 != null) {
					method46(field252.field83[0], 1, false, var31.field82[0], 0, var31.field83[0], 1, 0, 0, field252.field82[0], 2);
					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(134);
					field194.method213(var5);
					field194.method211(field454);
					field194.method213(field452);
					field194.method213(field453);
				}
			}

			if (var4 == 633) {
				method30(var2, var5, var3);
				field194.method178(84);
				field194.method212(var5 >> 14 & 0x7FFF);
				field194.method212(field291 + var2);
				field194.method212(field292 + var3);
			}

			if (var4 == 686) {
				LUAMUNXO var32 = LUAMUNXO.method316(var3);
				field168 = 1;
				field169 = var3;
				field170 = var32.field880;
				field451 = 0;
				field340 = true;
				String var33 = var32.field879;
				if (var33.indexOf(" ") != -1) {
					var33 = var33.substring(0, var33.indexOf(" "));
				}

				String var34 = var32.field879;
				if (var34.indexOf(" ") != -1) {
					var34 = var34.substring(var34.indexOf(" ") + 1);
				}

				field171 = var33 + " " + var32.field846 + " " + var34;

				if (field170 == 16) {
					field340 = true;
					field351 = 3;
					field239 = true;
				}
			} else {
				if (var4 == 361) {
					HHCKFJEO var35 = field504[var5];
					if (var35 != null) {
						method46(field252.field83[0], 1, false, var35.field82[0], 0, var35.field83[0], 1, 0, 0, field252.field82[0], 2);
						field121 = field796;
						field122 = field797;
						field124 = 2;
						field123 = 0;
						field194.method178(60);
						field194.method212(var5);
					}
				}

				if (var4 == 283) {
					DLNPJUEQ var36 = field273[var5];
					if (var36 != null) {
						method46(field252.field83[0], 1, false, var36.field82[0], 0, var36.field83[0], 1, 0, 0, field252.field82[0], 2);
						field121 = field796;
						field122 = field797;
						field124 = 2;
						field123 = 0;
						field194.method178(40);
						field194.method212(var5);
						field194.method213(field169);
					}
				}

				if (var4 == 784) {
					boolean var37 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
					if (!var37) {
						method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
					}

					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(244);
					field194.method211(var5);
					field194.method212(field292 + var3);
					field194.method213(field291 + var2);
				}

				if (var4 == 341) {
					boolean var39 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
					if (!var39) {
						method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
					}

					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(187);
					field194.method211(field292 + var3);
					field194.method213(field453);
					field194.method211(field454);
					field194.method180(field452);
					field194.method180(var5);
					field194.method213(field291 + var2);
				}

				if (var4 == 647) {
					boolean var41 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
					if (!var41) {
						method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
					}

					field121 = field796;
					field122 = field797;
					field124 = 2;
					field123 = 0;
					field194.method178(66);
					field194.method180(var5);
					field194.method211(field292 + var3);
					field194.method213(field291 + var2);
				}

				if (var4 == 269) {
					DLNPJUEQ var43 = field273[var5];
					if (var43 != null) {
						method46(field252.field83[0], 1, false, var43.field82[0], 0, var43.field83[0], 1, 0, 0, field252.field82[0], 2);
						field121 = field796;
						field122 = field797;
						field124 = 2;
						field123 = 0;
						field194.method178(107);
						field194.method180(var5);
					}
				}

				if (var4 == 76) {
					method30(var2, var5, var3);
					field194.method178(128);
					field194.method211(field292 + var3);
					field194.method211(var5 >> 14 & 0x7FFF);
					field194.method180(field291 + var2);
				}

				if (var4 == 959) {
					field337 += var3;
					if (field337 >= 132) {
						field194.method178(173);
						field337 = 0;
					}

					field194.method178(249);
					field194.method180(var5);
					field194.method211(var2);
					field194.method213(var3);
					field466 = 0;
					field467 = var3;
					field468 = var2;
					field469 = 2;
					if (LUAMUNXO.method316(var3).field857 == field536) {
						field469 = 1;
					}

					if (LUAMUNXO.method316(var3).field857 == field529) {
						field469 = 3;
					}
				}

				if (var4 == 137) {
					field194.method178(72);
					field194.method211(var5);
					field194.method213(var3);
					field194.method180(var2);
					field466 = 0;
					field467 = var3;
					field468 = var2;
					field469 = 2;
					if (LUAMUNXO.method316(var3).field857 == field536) {
						field469 = 1;
					}

					if (LUAMUNXO.method316(var3).field857 == field529) {
						field469 = 3;
					}
				}

				if (var4 == 601) {
					field194.method178(149);
					field194.method211(var5);
					field194.method180(var2);
					field194.method212(var3);
					field466 = 0;
					field467 = var3;
					field468 = var2;
					field469 = 2;
					if (LUAMUNXO.method316(var3).field857 == field536) {
						field469 = 1;
					}

					if (LUAMUNXO.method316(var3).field857 == field529) {
						field469 = 3;
					}
				}

				if (var4 == 562) {
					field194.method178(202);
					field194.method180(field169);
					field194.method211(var2);
					field194.method180(var3);
					field194.method211(var5);
					field466 = 0;
					field467 = var3;
					field468 = var2;
					field469 = 2;
					if (LUAMUNXO.method316(var3).field857 == field536) {
						field469 = 1;
					}

					if (LUAMUNXO.method316(var3).field857 == field529) {
						field469 = 3;
					}
				}

				if (var4 == 1675) {
					JKSNDEQS var44 = JKSNDEQS.method293(var5);
					LUAMUNXO var45 = LUAMUNXO.method316(var3);
					String var46;
					if (var45 != null && var45.field899[var2] >= 100000) {
						var46 = var45.field899[var2] + " x " + var44.field729;
					} else if (var44.field742 == null) {
						var46 = "It's a " + var44.field729 + ".";
					} else {
						var46 = new String(var44.field742);
					}

					method136(0, var46, "");
				}

				if (var4 == 509) {
					field194.method178(44);
					field194.method180(var3);
					LUAMUNXO var47 = LUAMUNXO.method316(var3);
					if (var47.field893 != null && var47.field893[0][0] == 5) {
						int var48 = var47.field893[0][1];
						field532[var48] = 1 - field532[var48];
						method139(var48);
						field340 = true;
					}
				}

				if (var4 == 407) {
					method152();
				}

				if (var4 == 711) {
					field451 = 1;
					field452 = var2;
					field453 = var3;
					field454 = var5;
					field455 = JKSNDEQS.method293(var5).field729;
					field168 = 0;
					field340 = true;
				} else {
					if (var4 == 765) {
						String var49 = field283[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							long var51 = JDMIWTSP.method278(var49.substring(var50 + 5).trim());
							int var53 = -1;
							for (int var54 = 0; var54 < field268; var54++) {
								if (field280[var54] == var51) {
									var53 = var54;
									break;
								}
							}

							if (var53 != -1 && field442[var53] > 0) {
								field188 = true;
								field457 = 0;
								field400 = true;
								field299 = "";
								field513 = 3;
								field414 = field280[var53];
								field534 = "Enter message to send to " + field128[var53];
							}
						}
					}

					if (var4 == 511) {
						field261++;
						if (field261 >= 93) {
							field194.method178(3);
							field194.method182(0xB87CE7);
							field261 = 0;
						}

						field194.method178(28);
						field194.method212(var3);
						field194.method212(var5);
						field194.method213(var2);
						field466 = 0;
						field467 = var3;
						field468 = var2;
						field469 = 2;
						if (LUAMUNXO.method316(var3).field857 == field536) {
							field469 = 1;
						}

						if (LUAMUNXO.method316(var3).field857 == field529) {
							field469 = 3;
						}
					}

					if (var4 == 111) {
						DLNPJUEQ var55 = field273[var5];
						if (var55 != null) {
							method46(field252.field83[0], 1, false, var55.field82[0], 0, var55.field83[0], 1, 0, 0, field252.field82[0], 2);
							field121 = field796;
							field122 = field797;
							field124 = 2;
							field123 = 0;
							field348 += var5;
							if (field348 >= 139) {
								field194.method178(203);
								field194.method182(0xB40F5B);
								field348 = 0;
							}

							field194.method178(229);
							field194.method211(var5);
						}
					}

					if (var4 == 446) {
						HHCKFJEO var56 = field504[var5];
						if (var56 != null) {
							method46(field252.field83[0], 1, false, var56.field82[0], 0, var56.field83[0], 1, 0, 0, field252.field82[0], 2);
							field121 = field796;
							field122 = field797;
							field124 = 2;
							field123 = 0;
							field194.method178(41);
							field194.method213(var5);
						}
					}

					if (var4 == 164) {
						field194.method178(133);
						field194.method180(var2);
						field194.method212(var3);
						field194.method180(var5);
						field466 = 0;
						field467 = var3;
						field468 = var2;
						field469 = 2;
						if (LUAMUNXO.method316(var3).field857 == field536) {
							field469 = 1;
						}

						if (LUAMUNXO.method316(var3).field857 == field529) {
							field469 = 3;
						}
					}

					if (var4 == 208) {
						String var57 = field283[arg0];
						int var58 = var57.indexOf("@whi@");
						if (var58 != -1) {
							if (field536 == -1) {
								method152();
								field296 = var57.substring(var58 + 5).trim();
								field516 = false;
								field458 = field536 = LUAMUNXO.field892;
							} else {
								method136(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}

					if (var4 == 58) {
						boolean var59 = method46(field252.field83[0], 0, false, var2, 0, var3, 0, 0, 0, field252.field82[0], 2);
						if (!var59) {
							method46(field252.field83[0], 1, false, var2, 0, var3, 1, 0, 0, field252.field82[0], 2);
						}

						field121 = field796;
						field122 = field797;
						field124 = 2;
						field123 = 0;
						field194.method178(197);
						field194.method180(var5);
						field194.method212(field291 + var2);
						field194.method213(field292 + var3);
					}

					if (var4 == 625) {
						DLNPJUEQ var61 = field273[var5];
						if (var61 != null) {
							method46(field252.field83[0], 1, false, var61.field82[0], 0, var61.field83[0], 1, 0, 0, field252.field82[0], 2);
							field121 = field796;
							field122 = field797;
							field124 = 2;
							field123 = 0;
							field286 += var5;
							if (field286 >= 119) {
								field194.method178(196);
								field194.method179(12);
								field286 = 0;
							}

							field194.method178(223);
							field194.method212(var5);
						}
					}

					if (var4 == 1860) {
						DLNPJUEQ var62 = field273[var5];
						if (var62 != null) {
							HEKJNUPL var63 = var62.field561;
							if (var63.field636 != null) {
								var63 = var63.method272();
							}

							if (var63 != null) {
								String var64;
								if (var63.field648 == null) {
									var64 = "It's a " + var63.field654 + ".";
								} else {
									var64 = new String(var63.field648);
								}

								method136(0, var64, "");
							}
						}
					}

					if (var4 == 748 && method30(var2, var5, var3)) {
						field194.method178(126);
						field194.method211(var5 >> 14 & 0x7FFF);
						field194.method212(field453);
						field194.method212(field452);
						field194.method213(field291 + var2);
						field194.method211(field292 + var3);
						field194.method211(field454);
					}

					if (var4 == 65 || var4 == 426) {
						String var65 = field283[arg0];
						int var66 = var65.indexOf("@whi@");
						if (var66 != -1) {
							var65 = var65.substring(var66 + 5).trim();
							String var67 = JDMIWTSP.method282(JDMIWTSP.method279(JDMIWTSP.method278(var65)));
							boolean var68 = false;
							for (int var69 = 0; var69 < field505; var69++) {
								HHCKFJEO var70 = field504[field506[var69]];
								if (var70 != null && var70.field698 != null && var70.field698.equalsIgnoreCase(var67)) {
									method46(field252.field83[0], 1, false, var70.field82[0], 0, var70.field83[0], 1, 0, 0, field252.field82[0], 2);

									if (var4 == 65) {
										field520++;
										if (field520 >= 95) {
											field194.method178(141);
											field194.method179(118);
											field520 = 0;
										}

										field194.method178(209);
										field194.method180(field506[var69]);
									}

									if (var4 == 426) {
										field194.method178(25);
										field194.method212(field506[var69]);
									}

									var68 = true;
									break;
								}
							}

							if (!var68) {
								method136(0, "Unable to find " + var67, "");
							}
						}
					}

					if (var4 == 349) {
						HHCKFJEO var71 = field504[var5];
						if (var71 != null) {
							method46(field252.field83[0], 1, false, var71.field82[0], 0, var71.field83[0], 1, 0, 0, field252.field82[0], 2);
							field121 = field796;
							field122 = field797;
							field124 = 2;
							field123 = 0;
							field520++;
							if (field520 >= 95) {
								field194.method178(141);
								field194.method179(118);
								field520 = 0;
							}

							field194.method178(209);
							field194.method180(var5);
						}
					}

					field451 = 0;
					field168 = 0;
					field340 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method40(int arg0) {
		LUAMUNXO var2 = LUAMUNXO.method316(arg0);
		for (int var3 = 0; var3 < var2.field855.length && var2.field855[var3] != -1; var3++) {
			LUAMUNXO var4 = LUAMUNXO.method316(var2.field855[var3]);
			if (var4.field873 == 1) {
				method40(var4.field864);
			}

			var4.field861 = 0;
			var4.field836 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method41(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field439 = "";
				field440 = "Connecting to server...";
				method68(true);
			}

			field290 = new OAGIEZRU(this, method29(field257 + 43594));
			long var4 = JDMIWTSP.method278(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field194.field563 = 0;
			field194.method179(14);
			field194.method179(var6);
			field290.method382(field194.field562, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field290.method379();
			}

			int var8 = field290.method379();
			int var9 = var8;

			if (var8 == 0) {
				field290.method381(field448.field562, 0, 8);
				field448.field563 = 0;
				field202 = field448.method195();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field202 >> 32), (int) field202 };
				field194.field563 = 0;
				field194.method179(10);
				field194.method183(var10[0]);
				field194.method183(var10[1]);
				field194.method183(var10[2]);
				field194.method183(var10[3]);
				field194.method183(signlink.uid);
				field194.method186(arg0);
				field194.method186(arg1);
				field194.method204(field297, field401);
				field424.field563 = 0;

				if (arg2) {
					field424.method179(18);
				} else {
					field424.method179(16);
				}

				field424.method179(field194.field563 + 36 + 1 + 1 + 2);
				field424.method179(255);
				field424.method180(336);
				field424.method179(field259 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field424.method183(field447[var11]);
				}

				field424.method187(field194.field563, field194.field562, 0);
				field194.field567 = new GOLMSHHL(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field422 = new GOLMSHHL(var10);
				field290.method382(field424.field562, 0, field424.field563);
				var8 = field290.method379();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method41(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field518 = field290.method379();
				field243 = field290.method379() == 1;
				field398 = 0L;
				field220 = 0;
				field195.field542 = 0;
				field786 = true;
				field206 = true;
				field480 = true;
				field194.field563 = 0;
				field448.field563 = 0;
				field142 = -1;
				field311 = -1;
				field312 = -1;
				field313 = -1;
				field141 = 0;
				field143 = 0;
				field371 = 0;
				field145 = 0;
				field327 = 0;
				field541 = 0;
				field363 = false;
				field787 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field325[var13] = null;
				}

				field451 = 0;
				field168 = 0;
				field522 = 0;
				field461 = 0;
				field253 = (int) (Math.random() * 100.0D) - 50;
				field154 = (int) (Math.random() * 110.0D) - 55;
				field301 = (int) (Math.random() * 80.0D) - 40;
				field426 = (int) (Math.random() * 120.0D) - 60;
				field496 = (int) (Math.random() * 30.0D) - 20;
				field190 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field431 = 0;
				field445 = -1;
				field389 = 0;
				field390 = 0;
				field505 = 0;
				field274 = 0;

				for (int var14 = 0; var14 < field502; var14++) {
					field504[var14] = null;
					field509[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field273[var15] = null;
				}

				field252 = field504[field503] = new HHCKFJEO();
				field251.method596();
				field255.method596();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field459[var16][var17][var18] = null;
						}
					}
				}

				field238 = new ZCVCEQHJ();
				field269 = 0;
				field268 = 0;
				method135(field179);
				field179 = -1;
				method135(field529);
				field529 = -1;
				method135(field536);
				field536 = -1;
				method135(field528);
				field528 = -1;
				method135(field310);
				field310 = -1;
				method135(field464);
				field464 = -1;
				field531 = false;
				field351 = 3;
				field457 = 0;
				field363 = false;
				field400 = false;
				field204 = null;
				field378 = 0;
				field514 = -1;
				field300 = true;
				method84();

				for (int var19 = 0; var19 < 5; var19++) {
					field408[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field491[var20] = null;
					field492[var20] = false;
				}

				field520 = 0;
				field348 = 0;
				field279 = 0;
				field460 = 0;
				field337 = 0;
				field286 = 0;
				field261 = 0;
				field433 = 0;
				field349 = 0;
				method118();
			} else if (var8 == 3) {
				field439 = "";
				field440 = "Invalid username or password.";
			} else if (var8 == 4) {
				field439 = "Your account has been disabled.";
				field440 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field439 = "Your account is already logged in.";
				field440 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field439 = "RuneScape has been updated!";
				field440 = "Please reload this page.";
			} else if (var8 == 7) {
				field439 = "This world is full.";
				field440 = "Please use a different world.";
			} else if (var8 == 8) {
				field439 = "Unable to connect.";
				field440 = "Login server offline.";
			} else if (var8 == 9) {
				field439 = "Login limit exceeded.";
				field440 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field439 = "Unable to connect.";
				field440 = "Bad session id.";
			} else if (var8 == 11) {
				field439 = "Login server rejected session.";
				field440 = "Please try again.";
			} else if (var8 == 12) {
				field439 = "You need a members account to login to this world.";
				field440 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field439 = "Could not complete login.";
				field440 = "Please try using a different world.";
			} else if (var8 == 14) {
				field439 = "The server is being updated.";
				field440 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field480 = true;
				field194.field563 = 0;
				field448.field563 = 0;
				field142 = -1;
				field311 = -1;
				field312 = -1;
				field313 = -1;
				field141 = 0;
				field143 = 0;
				field371 = 0;
				field541 = 0;
				field363 = false;
				field172 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field439 = "Login attempts exceeded.";
				field440 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field439 = "You are standing in a members-only area.";
				field440 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field439 = "Invalid loginserver requested";
				field440 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field290.method379();
				for (var21 += 3; var21 >= 0; var21--) {
					field439 = "You have only just left another world";
					field440 = "Your profile will be transferred in: " + var21;
					method68(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method41(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field439 = "Malformed login packet.";
				field440 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field439 = "Unexpected server response";
				field440 = "Please try using a different world.";
			} else if (var9 != 0) {
				field439 = "No response from server";
				field440 = "Please try using a different world.";
			} else if (field364 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field364++;
				method41(arg0, arg1, arg2);
			} else {
				field439 = "No response from loginserver";
				field440 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field439 = "";
			field440 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method42(int arg0) {
		if (!field259) {
			if (AWNOLVYV.field40[17] >= arg0) {
				PQKEJITK var2 = AWNOLVYV.field34[17];
				int var3 = var2.field1097 * var2.field1096 - 1;
				int var4 = field167 * var2.field1096 * 2;
				byte[] var5 = var2.field1094;
				byte[] var6 = field360;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1094 = var6;
				field360 = var5;
				AWNOLVYV.method9(17);
			}

			if (AWNOLVYV.field40[24] >= arg0) {
				PQKEJITK var8 = AWNOLVYV.field34[24];
				int var9 = var8.field1097 * var8.field1096 - 1;
				int var10 = field167 * var8.field1096 * 2;
				byte[] var11 = var8.field1094;
				byte[] var12 = field360;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1094 = var12;
				field360 = var11;
				AWNOLVYV.method9(24);
			}

			if (AWNOLVYV.field40[34] >= arg0) {
				PQKEJITK var14 = AWNOLVYV.field34[34];
				int var15 = var14.field1097 * var14.field1096 - 1;
				int var16 = field167 * var14.field1096 * 2;
				byte[] var17 = var14.field1094;
				byte[] var18 = field360;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1094 = var18;
				field360 = var17;
				AWNOLVYV.method9(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method43() {
		for (int var1 = -1; var1 < field505; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field503;
			} else {
				var2 = field506[var1];
			}

			HHCKFJEO var3 = field504[var2];
			if (var3 != null) {
				method102(1, var3);
			}
		}

		field396++;
		if (field396 > 67) {
			field396 = 0;
			field194.method178(222);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method44() {
		if (field782 == null) {
			method165();
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field226 = null;
			field227 = null;
			field228 = null;
			field229 = null;
			field358 = null;
			field356 = null;
			field355 = null;
			field357 = null;
			field196 = null;
			field197 = null;
			field198 = null;
			field782 = new TRQPVNER(765, method73(), 503);
			field346 = true;
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method45() {
		try {
			if (field290 != null) {
				field290.method378();
			}
		} catch (Exception var2) {
		}

		field290 = null;
		field480 = false;
		field263 = 0;
		field264 = "";
		field265 = "";
		method80();
		field115.method538();

		for (int var1 = 0; var1 < 4; var1++) {
			field510[var1].method500();
		}

		System.gc();
		method97();
		field244 = -1;
		field125 = -1;
		field488 = 0;
	}

	@ObfuscatedName("client.a(IIZIIIIIIIII)Z")
	public final boolean method46(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field470[var14][var15] = 0;
				field180[var14][var15] = 99999999;
			}
		}

		int var16 = arg9;
		int var17 = arg0;
		field470[arg9][arg0] = 99;
		field180[arg9][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field481[var18] = arg9;
		int var35 = var18 + 1;
		field482[var18] = arg0;
		boolean var20 = false;
		int var21 = field481.length;
		int[][] var22 = field510[field295].field1310;
		while (var35 != var19) {
			var16 = field481[var19];
			var17 = field482[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && field510[field295].method509(arg8 - 1, var17, arg3, var16, arg5, arg4)) {
					var20 = true;
					break;
				}

				if (arg8 < 10 && field510[field295].method510(arg8 - 1, arg3, var16, var17, arg4, arg5)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg6 != 0 && field510[field295].method511(var16, arg7, var17, arg3, arg5, arg1, arg6)) {
				var20 = true;
				break;
			}

			int var23 = field180[var16][var17] + 1;
			if (var16 > 0 && field470[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field481[var35] = var16 - 1;
				field482[var35] = var17;
				var35 = (var35 + 1) % var21;
				field470[var16 - 1][var17] = 2;
				field180[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field470[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field481[var35] = var16 + 1;
				field482[var35] = var17;
				var35 = (var35 + 1) % var21;
				field470[var16 + 1][var17] = 8;
				field180[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field470[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field481[var35] = var16;
				field482[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field470[var16][var17 - 1] = 1;
				field180[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field470[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field481[var35] = var16;
				field482[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field470[var16][var17 + 1] = 4;
				field180[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field470[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field481[var35] = var16 - 1;
				field482[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field470[var16 - 1][var17 - 1] = 3;
				field180[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field470[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field481[var35] = var16 + 1;
				field482[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field470[var16 + 1][var17 - 1] = 9;
				field180[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field470[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field481[var35] = var16 - 1;
				field482[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field470[var16 - 1][var17 + 1] = 6;
				field180[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field470[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field481[var35] = var16 + 1;
				field482[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field470[var16 + 1][var17 + 1] = 12;
				field180[var16 + 1][var17 + 1] = var23;
			}
		}

		field423 = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg5 - var25; var27 <= arg5 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field180[var26][var27] < var24) {
								var24 = field180[var26][var27];
								var16 = var26;
								var17 = var27;
								field423 = 1;
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
		field481[var28] = var16;
		int var36 = var28 + 1;
		field482[var28] = var17;
		int var29;
		int var30 = var29 = field470[var16][var17];
		while (arg9 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field481[var36] = var16;
				field482[var36++] = var17;
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

			var30 = field470[var16][var17];
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
		int var32 = field481[var36];
		int var33 = field482[var36];
		field433++;
		if (field433 >= 101) {
			field194.method178(106);
			field433 = 0;
		}

		if (arg10 == 0) {
			field194.method178(225);
			field194.method179(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field194.method178(160);
			field194.method179(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field194.method178(234);
			field194.method179(var31 + var31 + 3);
		}

		field194.method211(field292 + var33);
		field389 = field481[0];
		field390 = field482[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field194.method205(field481[var36] - var32);
			field194.method205(field482[var36] - var33);
		}

		field194.method213(field291 + var32);
		field194.method179(field799[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IIIB)LFNOQZAYQ;")
	public final FNOQZAYQ method47(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field278[0] != null) {
				var6 = field278[0].method259(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field203.reset();
			field203.update(var6);
			int var8 = (int) field203.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new FNOQZAYQ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method27(arg3, "Requesting " + arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method162(arg1 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				DNRIFKTO var16 = new DNRIFKTO(var15);
				var16.field563 = 3;
				int var17 = var16.method193() + 6;
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
						method27(arg3, "Loading " + arg0 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field278[0] != null) {
						field278[0].method260(var6.length, var6, arg4);
					}
				} catch (Exception var28) {
					field278[0] = null;
				}

				if (var6 != null) {
					field203.reset();
					field203.update(var6);
					int var23 = (int) field203.getValue();
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
						method27(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method27(arg3, var11 + " - Retrying in " + var25);
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

				field148 = !field148;
			}
		}

		return new FNOQZAYQ(var6);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method48(boolean arg0) {
		for (int var2 = 0; var2 < field274; var2++) {
			DLNPJUEQ var3 = field273[field275[var2]];
			int var4 = (field275[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method20() && var3.field561.field655 == arg0 && var3.field561.method267()) {
				int var5 = var3.field96 >> 7;
				int var6 = var3.field97 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field64 == 1 && (var3.field96 & 0x7F) == 0x40 && (var3.field97 & 0x7F) == 0x40) {
						if (field397[var5][var6] == field376) {
							continue;
						}

						field397[var5][var6] = field376;
					}

					if (!var3.field561.field661) {
						var4 += Integer.MIN_VALUE;
					}

					field115.method549(var4, var3, var3.field97, var3.field98, method83(field295, var3.field96, var3.field97), (var3.field64 - 1) * 64 + 60, var3.field96, var3.field61, field295);
				}
			}
		}
	}

	@ObfuscatedName("client.a(LLUAMUNXO;IIIIIII)V")
	public final void method49(LUAMUNXO arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0.field873 == 0 && arg0.field855 != null && !arg0.field894 && (arg5 >= arg6 && arg2 >= arg1 && arg5 <= arg0.field872 + arg6 && arg2 <= arg0.field896 + arg1)) {
			int var8 = arg0.field855.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg0.field860[var9] + arg6;
				int var11 = arg0.field878[var9] + arg1 - arg4;
				LUAMUNXO var12 = LUAMUNXO.method316(arg0.field855[var9]);
				var10 += var12.field888;
				var11 += var12.field853;
				if ((var12.field852 >= 0 || var12.field854 != 0) && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
					if (var12.field852 >= 0) {
						field250 = var12.field852;
					} else {
						field250 = var12.field864;
					}
				}

				if (var12.field873 == 8 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
					field147 = var12.field864;
				}

				if (var12.field873 == 0) {
					method49(var12, var11, arg2, arg3, var12.field858, arg5, var10);

					if (var12.field895 > var12.field896) {
						method78(arg5, var12.field872 + var10, var12.field895, arg2, arg3, var11, var12.field896, var12);
					}
				} else {
					if (var12.field851 == 1 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						boolean var13 = false;
						if (var12.field833 != 0) {
							var13 = method25(var12);
						}

						if (!var13) {
							field283[field541] = var12.field869;
							field394[field541] = 236;
							field393[field541] = var12.field864;
							field541++;
						}
					}

					if (var12.field851 == 2 && field168 == 0 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						String var14 = var12.field879;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field283[field541] = var14 + " @gre@" + var12.field846;
						field394[field541] = 686;
						field393[field541] = var12.field864;
						field541++;
					}

					if (var12.field851 == 3 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						field283[field541] = "Close";

						if (arg3 == 3) {
							field394[field541] = 567;
						} else {
							field394[field541] = 407;
						}

						field393[field541] = var12.field864;
						field541++;
					}

					if (var12.field851 == 4 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						field283[field541] = var12.field869;
						field394[field541] = 509;
						field393[field541] = var12.field864;
						field541++;
					}

					if (var12.field851 == 5 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						field283[field541] = var12.field869;
						field394[field541] = 192;
						field393[field541] = var12.field864;
						field541++;
					}

					if (var12.field851 == 6 && !field531 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field872 + var10 && arg2 < var12.field896 + var11) {
						field283[field541] = var12.field869;
						field394[field541] = 591;
						field393[field541] = var12.field864;
						field541++;
					}

					if (var12.field873 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field896; var16++) {
							for (int var17 = 0; var17 < var12.field872; var17++) {
								int var18 = (var12.field834 + 32) * var17 + var10;
								int var19 = (var12.field882 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field859[var15];
									var19 += var12.field845[var15];
								}

								if (arg5 >= var18 && arg2 >= var19 && arg5 < var18 + 32 && arg2 < var19 + 32) {
									field429 = var15;
									field430 = var12.field864;

									if (var12.field827[var15] > 0) {
										JKSNDEQS var20 = JKSNDEQS.method293(var12.field827[var15] - 1);
										if (field451 == 1 && var12.field862) {
											if (field453 != var12.field864 || field452 != var15) {
												field283[field541] = "Use " + field455 + " with @lre@" + var20.field729;
												field394[field541] = 526;
												field395[field541] = var20.field766;
												field392[field541] = var15;
												field393[field541] = var12.field864;
												field541++;
											}
										} else if (field168 != 1 || !var12.field862) {
											if (var12.field862) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field744 != null && var20.field744[var21] != null) {
														field283[field541] = var20.field744[var21] + " @lre@" + var20.field729;

														if (var21 == 3) {
															field394[field541] = 503;
														}

														if (var21 == 4) {
															field394[field541] = 914;
														}

														field395[field541] = var20.field766;
														field392[field541] = var15;
														field393[field541] = var12.field864;
														field541++;
													} else if (var21 == 4) {
														field283[field541] = "Drop @lre@" + var20.field729;
														field394[field541] = 914;
														field395[field541] = var20.field766;
														field392[field541] = var15;
														field393[field541] = var12.field864;
														field541++;
													}
												}
											}

											if (var12.field866) {
												field283[field541] = "Use @lre@" + var20.field729;
												field394[field541] = 711;
												field395[field541] = var20.field766;
												field392[field541] = var15;
												field393[field541] = var12.field864;
												field541++;
											}

											if (var12.field862 && var20.field744 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field744[var22] != null) {
														field283[field541] = var20.field744[var22] + " @lre@" + var20.field729;

														if (var22 == 0) {
															field394[field541] = 871;
														}

														if (var22 == 1) {
															field394[field541] = 164;
														}

														if (var22 == 2) {
															field394[field541] = 137;
														}

														field395[field541] = var20.field766;
														field392[field541] = var15;
														field393[field541] = var12.field864;
														field541++;
													}
												}
											}

											if (var12.field890 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field890[var23] != null) {
														field283[field541] = var12.field890[var23] + " @lre@" + var20.field729;

														if (var23 == 0) {
															field394[field541] = 959;
														}

														if (var23 == 1) {
															field394[field541] = 433;
														}

														if (var23 == 2) {
															field394[field541] = 18;
														}

														if (var23 == 3) {
															field394[field541] = 601;
														}

														if (var23 == 4) {
															field394[field541] = 511;
														}

														field395[field541] = var20.field766;
														field392[field541] = var15;
														field393[field541] = var12.field864;
														field541++;
													}
												}
											}

											field283[field541] = "Examine @lre@" + var20.field729;
											field394[field541] = 1675;
											field395[field541] = var20.field766;
											field392[field541] = var15;
											field393[field541] = var12.field864;
											field541++;
										} else if ((field170 & 0x10) == 0x10) {
											field283[field541] = field171 + " @lre@" + var20.field729;
											field394[field541] = 562;
											field395[field541] = var20.field766;
											field392[field541] = var15;
											field393[field541] = var12.field864;
											field541++;
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

	@ObfuscatedName("client.g(I)V")
	public final void method50() {
		int var1 = field230 * 128 + 64;
		int var2 = field231 * 128 + 64;
		int var3 = method83(field295, var1, var2) - field232;

		if (field314 < var1) {
			field314 += (var1 - field314) * field234 / 1000 + field233;
			if (field314 > var1) {
				field314 = var1;
			}
		}

		if (field314 > var1) {
			field314 -= (field314 - var1) * field234 / 1000 + field233;
			if (field314 < var1) {
				field314 = var1;
			}
		}

		if (field315 < var3) {
			field315 += (var3 - field315) * field234 / 1000 + field233;
			if (field315 > var3) {
				field315 = var3;
			}
		}

		if (field315 > var3) {
			field315 -= (field315 - var3) * field234 / 1000 + field233;
			if (field315 < var3) {
				field315 = var3;
			}
		}

		if (field316 < var2) {
			field316 += (var2 - field316) * field234 / 1000 + field233;
			if (field316 > var2) {
				field316 = var2;
			}
		}

		if (field316 > var2) {
			field316 -= (field316 - var2) * field234 / 1000 + field233;
			if (field316 < var2) {
				field316 = var2;
			}
		}

		field166++;
		if (field166 > 82) {
			field166 = 0;
			field194.method178(250);
		}

		int var4 = field523 * 128 + 64;
		int var5 = field524 * 128 + 64;
		int var6 = method83(field295, var4, var5) - field525;
		int var7 = var4 - field314;
		int var8 = var6 - field315;
		int var9 = var5 - field316;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field317 < var11) {
			field317 += (var11 - field317) * field527 / 1000 + field526;
			if (field317 > var11) {
				field317 = var11;
			}
		}

		if (field317 > var11) {
			field317 -= (field317 - var11) * field527 / 1000 + field526;
			if (field317 < var11) {
				field317 = var11;
			}
		}

		int var13 = var12 - field318;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field318 += field527 * var13 / 1000 + field526;
			field318 &= 0x7FF;
		}

		if (var13 < 0) {
			field318 -= -var13 * field527 / 1000 + field526;
			field318 &= 0x7FF;
		}

		int var14 = var12 - field318;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field318 = var12;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method51() {
		field355.method455();
		AWNOLVYV.field32 = field404;
		field217.method390(0, 0);

		if (field310 != -1) {
			method138(0, 0, LUAMUNXO.method316(field310), 0);
		} else if (field365[field351] != -1) {
			method138(0, 0, LUAMUNXO.method316(field365[field351]), 0);
		}

		if (field363 && field473 == 1) {
			method59();
		}

		field355.method456(553, field781, 205);
		field357.method455();
		AWNOLVYV.field32 = field405;
	}

	@ObfuscatedName("client.a(LLUAMUNXO;I)V")
	public final void method52(LUAMUNXO arg0) {
		int var2 = arg0.field833;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field269 == 0) {
				arg0.field871 = "Loading friend list";
				arg0.field851 = 0;
			} else if (var2 == 1 && field269 == 1) {
				arg0.field871 = "Connecting to friendserver";
				arg0.field851 = 0;
			} else if (var2 == 2 && field269 != 2) {
				arg0.field871 = "Please wait...";
				arg0.field851 = 0;
			} else {
				int var3 = field268;
				if (field269 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field871 = "";
					arg0.field851 = 0;
				} else {
					arg0.field871 = field128[var2];
					arg0.field851 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field268;
			if (field269 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field871 = "";
				arg0.field851 = 0;
			} else {
				if (field442[var2] == 0) {
					arg0.field871 = "@red@Offline";
				} else if (field442[var2] < 200) {
					if (field442[var2] == field256) {
						arg0.field871 = "@gre@World-" + (field442[var2] - 9);
					} else {
						arg0.field871 = "@yel@World-" + (field442[var2] - 9);
					}
				} else if (field442[var2] == field256) {
					arg0.field871 = "@gre@Classic" + (field442[var2] - 219);
				} else {
					arg0.field871 = "@yel@Classic" + (field442[var2] - 219);
				}

				arg0.field851 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field268;
			if (field269 != 2) {
				var5 = 0;
			}

			arg0.field895 = var5 * 15 + 20;
			if (arg0.field895 <= arg0.field896) {
				arg0.field895 = arg0.field896 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field269 == 0) {
				arg0.field871 = "Loading ignore list";
				arg0.field851 = 0;
			} else if (var2 == 1 && field269 == 0) {
				arg0.field871 = "Please wait...";
				arg0.field851 = 0;
			} else {
				int var6 = field114;
				if (field269 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field871 = "";
					arg0.field851 = 0;
				} else {
					arg0.field871 = JDMIWTSP.method282(JDMIWTSP.method279(field335[var2]));
					arg0.field851 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field895 = field114 * 15 + 20;
			if (arg0.field895 <= arg0.field896) {
				arg0.field895 = arg0.field896 + 1;
			}
		} else if (var2 == 327) {
			arg0.field839 = 150;
			arg0.field840 = (int) (Math.sin(field402 / 40.0D) * 256.0D) & 0x7FF;

			if (field343) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field116[var7];
					if (var8 >= 0 && !CSHXCUHU.field554[var8].method171()) {
						return;
					}
				}

				field343 = false;
				SNMMQNPZ[] var9 = new SNMMQNPZ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field116[var11];
					if (var12 >= 0) {
						var9[var10++] = CSHXCUHU.field554[var12].method172();
					}
				}

				SNMMQNPZ var13 = new SNMMQNPZ(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field408[var14] != 0) {
						var13.method432(field344[var14][0], field344[var14][field408[var14]]);

						if (var14 == 1) {
							var13.method432(field465[0], field465[field408[var14]]);
						}
					}
				}

				var13.method425();
				var13.method426(ZGXCNUJM.field1481[field252.field62].field1483[0]);
				var13.method435(64, 850, -30, -50, -30, true);
				arg0.field874 = 5;
				arg0.field875 = 0;
				LUAMUNXO.method308(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field471 == null) {
				field471 = arg0.field877;
				field472 = arg0.field844;
			}

			if (field300) {
				arg0.field877 = field472;
			} else {
				arg0.field877 = field471;
			}
		} else if (var2 == 325) {
			if (field471 == null) {
				field471 = arg0.field877;
				field472 = arg0.field844;
			}

			if (field300) {
				arg0.field877 = field471;
			} else {
				arg0.field877 = field472;
			}
		} else if (var2 == 600) {
			arg0.field871 = field296;
			if (field402 % 20 < 10) {
				arg0.field871 = arg0.field871 + "|";
			} else {
				arg0.field871 = arg0.field871 + " ";
			}
		} else if (var2 == 620) {
			if (field518 < 1) {
				arg0.field871 = "";
			} else if (field516) {
				arg0.field850 = 0xFF0000;
				arg0.field871 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field850 = 0xFFFFFF;
				arg0.field871 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			int var15 = field449 - field428;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field871 = "You last logged in " + var16 + " from: " + signlink.dns;
		} else if (var2 == 651) {
			if (field127 == 0) {
				arg0.field871 = "0 unread messages";
				arg0.field850 = 0xFFFF00;
			}

			if (field127 == 1) {
				arg0.field871 = "1 unread message";
				arg0.field850 = 0xFF00;
			}

			if (field127 > 1) {
				arg0.field871 = field127 + " unread messages";
				arg0.field850 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field375 == 0) {
				arg0.field871 = "You have not yet set any password recovery questions.";
			} else if (field375 > field449) {
				int var17 = field449 + 14 - field375;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field871 = var18 + " you changed your recovery questions";
			} else if (field415 <= 0 || field258) {
				arg0.field871 = "";
			} else {
				arg0.field871 = "@yel@This is a non-members world: @whi@Since you are a member we";
			}
		} else if (var2 == 653) {
			if (field375 == 0) {
				arg0.field871 = "We strongly recommend you do so now to secure your account.";
			} else if (field375 > field449) {
				arg0.field871 = "If you do not remember making this change then cancel it immediately";
			} else if (field415 <= 0 || field258) {
				arg0.field871 = "";
			} else {
				arg0.field871 = "@whi@recommend you use a members world instead. You may use";
			}
		} else if (var2 == 654) {
			if (field375 == 0) {
				arg0.field871 = "Do this from the 'account management' area on our front webpage";
			} else if (field375 > field449) {
				arg0.field871 = "Do this from the 'account management' area on our front webpage";
			} else if (field415 <= 0 || field258) {
				arg0.field871 = "";
			} else {
				arg0.field871 = "@whi@this world but member benefits are unavailable whilst here.";
			}
		} else if (var2 == 660) {
			int var19 = field449 - field428;
			String var20;
			if (var19 <= 0) {
				var20 = "earlier today";
			} else if (var19 == 1) {
				var20 = "yesterday";
			} else {
				var20 = var19 + " days ago";
			}

			arg0.field871 = "You last logged in @red@" + var20 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field375 == 0) {
				arg0.field871 = "\\nYou have not yet set any recovery questions.\\nIt is @red@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @red@unable to recover your\\n@red@password@yel@ if you forget it, or it is stolen.";
			} else if (field375 <= field449) {
				arg0.field871 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method53(field375);
			} else {
				int var21 = field449 + 14 - field375;
				String var22;
				if (var21 <= 0) {
					var22 = "Earlier today";
				} else if (var21 == 1) {
					var22 = "Yesterday";
				} else {
					var22 = var21 + " days ago";
				}

				arg0.field871 = var22 + " you requested@red@ new recovery\\n@red@questions.@yel@ The requested change will occur\\non: @red@" + method53(field375) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var23;
			if (field127 == 0) {
				var23 = "@yel@0 unread messages";
			} else if (field127 == 1) {
				var23 = "@gre@1 unread message";
			} else {
				var23 = "@gre@" + field127 + " unread messages";
			}

			arg0.field871 = "You have " + var23 + "\\nin your message centre.";
		} else if (var2 == 663) {
			arg0.field871 = "Last password change:\\n@gre@" + method53(field117);
		} else if (var2 == 664) {
			if (field517 == 0) {
				arg0.field871 = "You have not yet set\\nany contact details.";
			}

			if (field517 == 1) {
				arg0.field871 = "Contact Details Last Set:\\n@gre@" + method53(field336);
			}

			if (field517 == 2) {
				arg0.field871 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field415 > 2) {
				arg0.field871 = "\\n\\nYou have @gre@" + field415 + "@yel@ days of\\nmember credit remaining.";
			} else if (field415 > 0) {
				arg0.field871 = "You have @gre@" + field415 + "@yel@ days of\\nmember credit remaining.\\n\\n@red@Credit low! Renew now\\n@red@to avoid losing members.";
			} else {
				arg0.field871 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field415 == 0) {
				arg0.field871 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}

			if (field415 > 0) {
				arg0.field871 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			}
		} else if (var2 == 668) {
			if (field375 > field449) {
				arg0.field871 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'cancel recovery questions'.";
			} else {
				arg0.field871 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method53(int arg0) {
		if (arg0 > field449 + 10) {
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

	@ObfuscatedName("client.h(I)V")
	public final void method54() {
		if (field368 == 0) {
			field283[0] = "Cancel";
			field394[0] = 1109;
			field541 = 1;
			if (field528 == -1) {
				method67();
				field250 = 0;
				field147 = 0;

				if (field789 > 4 && field790 > 4 && field789 < 516 && field790 < 338) {
					if (field536 == -1) {
						method35();
					} else {
						method49(LUAMUNXO.method316(field536), 4, field790, 0, 0, field789, 4);
					}
				}

				if (field362 != field250) {
					field362 = field250;
				}

				if (field236 != field147) {
					field236 = field147;
				}

				field250 = 0;
				field147 = 0;

				if (field789 > 553 && field790 > 205 && field789 < 743 && field790 < 466) {
					if (field310 != -1) {
						method49(LUAMUNXO.method316(field310), 205, field790, 1, 0, field789, 553);
					} else if (field365[field351] != -1) {
						method49(LUAMUNXO.method316(field365[field351]), 205, field790, 1, 0, field789, 553);
					}
				}

				if (field250 != field187) {
					field340 = true;
					field187 = field250;
				}

				if (field160 != field147) {
					field340 = true;
					field160 = field147;
				}

				field250 = 0;
				field147 = 0;

				if (field789 > 17 && field790 > 357 && field789 < 496 && field790 < 453) {
					if (field529 != -1) {
						method49(LUAMUNXO.method316(field529), 357, field790, 2, 0, field789, 17);
					} else if (field179 != -1) {
						method49(LUAMUNXO.method316(field179), 357, field790, 3, 0, field789, 17);
					} else if (field790 < 434 && field789 < 426) {
						method156(field789 - 17, field790 - 357);
					}
				}

				if ((field529 != -1 || field179 != -1) && field418 != field250) {
					field188 = true;
					field418 = field250;
				}

				if ((field529 != -1 || field179 != -1) && field353 != field147) {
					field188 = true;
					field353 = field147;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field541 - 1; var2++) {
						if (field394[var2] < 1000 && field394[var2 + 1] > 1000) {
							String var3 = field283[var2];
							field283[var2] = field283[var2 + 1];
							field283[var2 + 1] = var3;
							int var4 = field394[var2];
							field394[var2] = field394[var2 + 1];
							field394[var2 + 1] = var4;
							int var5 = field392[var2];
							field392[var2] = field392[var2 + 1];
							field392[var2 + 1] = var5;
							int var6 = field393[var2];
							field393[var2] = field393[var2 + 1];
							field393[var2 + 1] = var6;
							int var7 = field395[var2];
							field395[var2] = field395[var2 + 1];
							field395[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field250 = 0;
				field147 = 0;
				method49(LUAMUNXO.method316(field528), 0, field790, 0, 0, field789, 0);

				if (field362 != field250) {
					field362 = field250;
				}

				if (field236 != field147) {
					field236 = field147;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method55(int arg0) {
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

	@ObfuscatedName("client.a(I)V")
	public final void method56() {
		if (!field338 && !field372 && !field208) {
			field402++;

			if (field480) {
				method119();
			} else {
				method163();
			}

			method168();
		}
	}

	@ObfuscatedName("client.a(LXQZVTAMW;I)V")
	public final void method57(XQZVTAMW arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1407 == 0) {
			var2 = field115.method564(arg0.field1406, arg0.field1408, arg0.field1409);
		}

		if (arg0.field1407 == 1) {
			var2 = field115.method565(arg0.field1409, arg0.field1406, arg0.field1408);
		}

		if (arg0.field1407 == 2) {
			var2 = field115.method566(arg0.field1406, arg0.field1408, arg0.field1409);
		}

		if (arg0.field1407 == 3) {
			var2 = field115.method567(arg0.field1406, arg0.field1408, arg0.field1409);
		}

		if (var2 != 0) {
			int var6 = field115.method568(arg0.field1406, arg0.field1408, arg0.field1409, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1401 = var3;
		arg0.field1403 = var4;
		arg0.field1402 = var5;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method58() {
		if (field338 || field372 || field208) {
			method24();
		} else {
			field373++;

			if (field480) {
				method108();
			} else {
				method68(false);
			}

			field149 = 0;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method59() {
		int var1 = field474;
		int var2 = field475;
		int var3 = field476;
		int var4 = field477;
		int var5 = 0x5D5447;
		VDGJUQAS.method517(var4, var5, var1, var3, var2);
		VDGJUQAS.method517(16, 0, var1 + 1, var3 - 2, var2 + 1);
		VDGJUQAS.method518(var4 - 19, var1 + 1, 0, var3 - 2, var2 + 18);
		field412.method234(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field789;
		int var7 = field790;
		if (field473 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field473 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field473 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field541; var8++) {
			int var9 = (field541 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field412.method238(var1 + 3, field283[var8], true, var9, var10);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method60() {
		field358.method455();
		AWNOLVYV.field32 = field403;
		field219.method390(0, 0);

		if (field400) {
			field412.method230(0, 239, field534, 40);
			field412.method230(128, 239, field299 + "*", 60);
		} else if (field457 == 1) {
			field412.method230(0, 239, "Enter amount:", 40);
			field412.method230(128, 239, field237 + "*", 60);
		} else if (field457 == 2) {
			field412.method230(0, 239, "Enter name:", 40);
			field412.method230(128, 239, field237 + "*", 60);
		} else if (field204 != null) {
			field412.method230(0, 239, field204, 40);
			field412.method230(128, 239, "Click to continue", 60);
		} else if (field529 != -1) {
			method138(0, 0, LUAMUNXO.method316(field529), 0);
		} else if (field179 == -1) {
			EOVZRNPE var1 = field411;
			int var2 = 0;
			VDGJUQAS.method514(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field325[var3] != null) {
					int var4 = field323[var3];
					int var5 = field434 + 70 - var2 * 14;
					String var6 = field324[var3];
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
							var1.method234(4, field325[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field521 == 0 || field521 == 1 && method99(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field284[0].method390(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field284[1].method390(var8, var5 - 12);
								var8 += 14;
							}

							var1.method234(var8, var6 + ":", 0, var5);
							var8 += var1.method232(var6) + 8;
							var1.method234(var8, field325[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field320 == 0 && (var4 == 7 || field341 == 0 || field341 == 1 && method99(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method234(var9, "From", 0, var5);
							int var11 = var9 + var1.method232("From ");
							if (var7 == 1) {
								field284[0].method390(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field284[1].method390(var11, var5 - 12);
								var11 += 14;
							}

							var1.method234(var11, var6 + ":", 0, var5);
							var11 += var1.method232(var6) + 8;
							var1.method234(var11, field325[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field416 == 0 || field416 == 1 && method99(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method234(4, var6 + " " + field325[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field320 == 0 && field341 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method234(4, field325[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field320 == 0 && field341 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method234(4, "To " + var6 + ":", 0, var5);
							var1.method234(var1.method232("To " + var6) + 12, field325[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field416 == 0 || field416 == 1 && method99(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method234(4, var6 + " " + field325[var3], 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			VDGJUQAS.method513();
			field276 = var2 * 14 + 7;
			if (field276 < 78) {
				field276 = 78;
			}

			method111(field276, field276 - field434 - 77, 0, 77, 463);
			String var10;
			if (field252 == null || field252.field698 == null) {
				var10 = JDMIWTSP.method282(field264);
			} else {
				var10 = field252.field698;
			}

			var1.method234(4, var10 + ":", 0, 90);
			var1.method234(var1.method232(var10 + ": ") + 6, field535 + "*", 255, 90);
			VDGJUQAS.method520(77, 479, 0, 0);
		} else {
			method138(0, 0, LUAMUNXO.method316(field179), 0);
		}

		if (field363 && field473 == 2) {
			method59();
		}

		field358.method456(17, field781, 357);
		field357.method455();
		AWNOLVYV.field32 = field405;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method61(int arg0, int arg1) {
		ZCVCEQHJ var3 = field459[field295][arg0][arg1];
		if (var3 == null) {
			field115.method559(field295, arg0, arg1);
		} else {
			int var4 = -99999999;
			ZCNDKOXC var5 = null;
			for (ZCNDKOXC var6 = (ZCNDKOXC) var3.method592(); var6 != null; var6 = (ZCNDKOXC) var3.method594()) {
				JKSNDEQS var7 = JKSNDEQS.method293(var6.field1476);
				int var8 = var7.field764;
				if (var7.field749) {
					var8 = (var6.field1477 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method590(var5);
			ZCNDKOXC var9 = null;
			ZCNDKOXC var10 = null;
			for (ZCNDKOXC var11 = (ZCNDKOXC) var3.method592(); var11 != null; var11 = (ZCNDKOXC) var3.method594()) {
				if (var5.field1476 != var11.field1476 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1476 != var11.field1476 && var9.field1476 != var11.field1476 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field115.method545(arg0, var9, method83(field295, arg0 * 128 + 64, arg1 * 128 + 64), field295, var12, arg1, var10, var5);
		}
	}

	@ObfuscatedName("client.b(LDNRIFKTO;II)V")
	public final void method62(DNRIFKTO arg0, int arg1) {
		field420 = 0;
		field507 = 0;
		method98(arg0, arg1);
		method155(arg1, arg0);
		method143(arg1, arg0);

		for (int var3 = 0; var3 < field420; var3++) {
			int var4 = field421[var3];
			if (field402 != field273[var4].field67) {
				field273[var4].field561 = null;
				field273[var4] = null;
			}
		}

		if (arg0.field563 != arg1) {
			signlink.reporterror(field264 + " size mismatch in getnpcpos - pos:" + arg0.field563 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field274; var5++) {
			if (field273[field275[var5]] == null) {
				signlink.reporterror(field264 + " null entry in npc list - pos:" + var5 + " size:" + field274);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LPQKEJITK;Z)V")
	public final void method63(PQKEJITK arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field119.length; var3++) {
			field119[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field119[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field120[var9] = (field119[var9 - 1] + field119[var9 + 1] + field119[var9 - 128] + field119[var9 + 128]) / 4;
				}
			}

			int[] var10 = field119;
			field119 = field120;
			field120 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1097; var12++) {
				for (int var13 = 0; var13 < arg0.field1096; var13++) {
					if (arg0.field1094[var11++] != 0) {
						int var14 = var13 + arg0.field1098 + 16;
						int var15 = var12 + arg0.field1099 + 16;
						int var16 = (var15 << 7) + var14;
						field119[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
			if (field259 && field295 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field115.method564(arg4, arg1, arg5);
			}

			if (arg2 == 1) {
				var8 = field115.method565(arg5, arg4, arg1);
			}

			if (arg2 == 2) {
				var8 = field115.method566(arg4, arg1, arg5);
			}

			if (arg2 == 3) {
				var8 = field115.method567(arg4, arg1, arg5);
			}

			if (var8 != 0) {
				int var12 = field115.method568(arg4, arg1, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field115.method555(arg1, arg4, arg5);
					SRQVPDWQ var16 = SRQVPDWQ.method445(var13);
					if (var16.field1242) {
						field510[arg4].method505(var16.field1243, arg5, arg1, var15, var14);
					}
				}

				if (arg2 == 1) {
					field115.method556(arg4, arg5, arg1);
				}

				if (arg2 == 2) {
					field115.method557(arg1, arg4, arg5);
					SRQVPDWQ var17 = SRQVPDWQ.method445(var13);
					if (var17.field1239 + arg1 > 103 || var17.field1239 + arg5 > 103 || var17.field1238 + arg1 > 103 || var17.field1238 + arg5 > 103) {
						return;
					}

					if (var17.field1242) {
						field510[arg4].method506(var17.field1239, arg5, var17.field1238, var17.field1243, var15, arg1);
					}
				}

				if (arg2 == 3) {
					field115.method558(arg5, arg1, arg4);
					SRQVPDWQ var18 = SRQVPDWQ.method445(var13);
					if (var18.field1242 && var18.field1249) {
						field510[arg4].method508(arg1, arg5);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field384[1][arg1][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				NSTMHEDV.method364(arg3, arg4, arg5, arg6, arg1, var19, field510[arg4], field115, arg0, field385);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method65() {
		for (KJLDUSCX var1 = (KJLDUSCX) field251.method592(); var1 != null; var1 = (KJLDUSCX) field251.method594()) {
			if (field295 != var1.field814 || field402 > var1.field804) {
				var1.method1();
			} else if (field402 >= var1.field803) {
				if (var1.field818 > 0) {
					DLNPJUEQ var2 = field273[var1.field818 - 1];
					if (var2 != null && var2.field96 >= 0 && var2.field96 < 13312 && var2.field97 >= 0 && var2.field97 < 13312) {
						var1.method303(field402, var2.field96, method83(var1.field814, var2.field96, var2.field97) - var1.field822, var2.field97);
					}
				}

				if (var1.field818 < 0) {
					int var3 = -var1.field818 - 1;
					HHCKFJEO var4;
					if (field478 == var3) {
						var4 = field252;
					} else {
						var4 = field504[var3];
					}

					if (var4 != null && var4.field96 >= 0 && var4.field96 < 13312 && var4.field97 >= 0 && var4.field97 < 13312) {
						var1.method303(field402, var4.field96, method83(var1.field814, var4.field96, var4.field97) - var1.field822, var4.field97);
					}
				}

				var1.method302(field167);
				field115.method549(-1, var1, (int) var1.field811, var1.field823, (int) var1.field812, 60, (int) var1.field810, false, field295);
			}
		}
	}

	@ObfuscatedName("client.k(I)Z")
	public final boolean method66() {
		if (field290 == null) {
			return false;
		}

		try {
			int var1 = field290.method380();
			if (var1 == 0) {
				return false;
			}

			if (field142 == -1) {
				field290.method381(field448.field562, 0, 1);
				field142 = field448.field562[0] & 0xFF;
				if (field422 != null) {
					field142 = field142 - field422.method256() & 0xFF;
				}

				field141 = PHFKKLTI.field1093[field142];
				var1--;
			}

			if (field141 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field290.method381(field448.field562, 0, 1);
				field141 = field448.field562[0] & 0xFF;
				var1--;
			}

			if (field141 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field290.method381(field448.field562, 0, 2);
				field448.field563 = 0;
				field141 = field448.method191();
				var1 -= 2;
			}

			if (var1 < field141) {
				return false;
			}

			field448.field563 = 0;
			field290.method381(field448.field562, 0, field141);
			field143 = 0;
			field313 = field312;
			field312 = field311;
			field311 = field142;

			if (field142 == 161) {
				field266 = field448.method189();
				field478 = field448.method214();
				field142 = -1;
				return true;
			}

			if (field142 == 111) {
				int var2 = field448.method191();
				int var3 = field448.method189();
				int var4 = field448.method191();
				if (field479 && !field259 && field461 < 50) {
					field456[field461] = var2;
					field446[field461] = var3;
					field241[field461] = MAPQLTQU.field921[var2] + var4;
					field461++;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 92) {
				field400 = false;
				field457 = 1;
				field237 = "";
				field188 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 244) {
				field521 = field448.method189();
				field341 = field448.method189();
				field416 = field448.method189();
				field277 = true;
				field188 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 23) {
				field117 = field448.method216();
				field448.method191();
				field428 = field448.method191();
				field375 = field448.method191();
				field517 = field448.method189();
				field336 = field448.method191();
				field415 = field448.method191();
				field322 = field448.method194();
				field449 = field448.method191();
				field448.method191();
				field127 = field448.method214();

				if (field322 != 0 && field536 == -1) {
					signlink.dnslookup(JDMIWTSP.method281(field322));
					method152();
					short var5 = 650;
					if (field375 > field449 || field375 == 0 || field415 > 0 && !field258) {
						var5 = 655;
					}

					field296 = "";
					field516 = false;

					if (var5 == 650) {
						field536 = LUAMUNXO.field849;
					} else {
						field536 = LUAMUNXO.field887;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 100) {
				int var6 = field448.method218();
				int var7 = field448.method219();
				int var8 = field448.method215();
				LUAMUNXO var9 = LUAMUNXO.method316(var8);
				var9.field888 = var6;
				var9.field853 = var7;
				field142 = -1;
				return true;
			}

			if (field142 == 117) {
				int var10 = field448.method223();
				int var11 = field448.method191();
				field282[var11] = var10;

				if (field532[var11] != var10) {
					field532[var11] = var10;
					method139(var11);
					field340 = true;

					if (field179 != -1) {
						field188 = true;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 123) {
				field431 = field448.method189();
				field142 = -1;
				return true;
			}

			if (field142 == 133) {
				int var12 = field448.method214();
				int var13 = field448.method214();
				int var14 = field448.method191();
				LUAMUNXO.method316(var12).field867 = (var14 << 16) + var13;
				field142 = -1;
				return true;
			}

			if (field142 == 243) {
				int var15 = field448.method214();
				method40(var15);

				if (field310 != -1) {
					method135(field310);
					field310 = -1;
					field340 = true;
					field239 = true;
				}

				if (field529 != -1) {
					method135(field529);
					field529 = -1;
					field188 = true;
				}

				if (field528 != -1) {
					method135(field528);
					field528 = -1;
					field346 = true;
				}

				if (field536 != var15) {
					method135(field536);
					field536 = var15;
				}

				if (field457 != 0) {
					field457 = 0;
					field188 = true;
				}

				field531 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 102) {
				int var16 = field448.method191();
				LUAMUNXO.method316(var16).field874 = 3;

				if (field252.field696 == null) {
					LUAMUNXO.method316(var16).field875 = (field252.field694[11] << 5) + (field252.field694[8] << 10) + (field252.field694[0] << 15) + (field252.field673[0] << 25) + (field252.field673[4] << 20) + field252.field694[1];
				} else {
					LUAMUNXO.method316(var16).field875 = (int) (field252.field696.field659 + 0x12345678L);
				}

				field142 = -1;
				return true;
			}

			if (field142 == 93) {
				for (int var17 = 0; var17 < field504.length; var17++) {
					if (field504[var17] != null) {
						field504[var17].field84 = -1;
					}
				}

				for (int var18 = 0; var18 < field273.length; var18++) {
					if (field273[var18] != null) {
						field273[var18].field84 = -1;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 106) {
				field514 = field448.method189();
				if (field514 == field351) {
					if (field514 == 3) {
						field351 = 1;
					} else {
						field351 = 3;
					}

					field340 = true;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 83) {
				field540 = true;
				field523 = field448.method189();
				field524 = field448.method189();
				field525 = field448.method191();
				field526 = field448.method189();
				field527 = field448.method189();
				if (field527 >= 100) {
					int var19 = field523 * 128 + 64;
					int var20 = field524 * 128 + 64;
					int var21 = method83(field295, var19, var20) - field525;
					int var22 = var19 - field314;
					int var23 = var21 - field315;
					int var24 = var20 - field316;
					int var25 = (int) Math.sqrt(var22 * var22 + var24 * var24);
					field317 = (int) (Math.atan2(var23, var25) * 325.949D) & 0x7FF;
					field318 = (int) (Math.atan2(var22, var24) * -325.949D) & 0x7FF;

					if (field317 < 128) {
						field317 = 128;
					}

					if (field317 > 383) {
						field317 = 383;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 151) {
				field269 = field448.method189();
				field340 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 189) {
				int var26 = field448.method214();
				int var27 = field448.method216();
				LUAMUNXO.method316(var27).field874 = 1;
				LUAMUNXO.method316(var27).field875 = var26;
				field142 = -1;
				return true;
			}

			if (field142 == 140) {
				field340 = true;
				int var28 = field448.method191();
				LUAMUNXO var29 = LUAMUNXO.method316(var28);
				int var30 = field448.method191();
				for (int var31 = 0; var31 < var30; var31++) {
					int var32 = field448.method189();
					if (var32 == 255) {
						var32 = field448.method194();
					}

					var29.field827[var31] = field448.method214();
					var29.field899[var31] = var32;
				}

				for (int var33 = var30; var33 < var29.field827.length; var33++) {
					var29.field827[var33] = 0;
					var29.field899[var33] = 0;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 11) {
				int var34 = field448.method216();
				int var35 = field448.method191();
				int var36 = var35 >> 10 & 0x1F;
				int var37 = var35 >> 5 & 0x1F;
				int var38 = var35 & 0x1F;
				LUAMUNXO.method316(var34).field850 = (var38 << 3) + (var36 << 19) + (var37 << 11);
				field142 = -1;
				return true;
			}

			if (field142 == 225) {
				field540 = false;

				for (int var39 = 0; var39 < 5; var39++) {
					field156[var39] = false;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 53) {
				int var40 = field448.method216();
				method40(var40);

				if (field529 != -1) {
					method135(field529);
					field529 = -1;
					field188 = true;
				}

				if (field528 != -1) {
					method135(field528);
					field528 = -1;
					field346 = true;
				}

				if (field536 != -1) {
					method135(field536);
					field536 = -1;
				}

				if (field310 != var40) {
					method135(field310);
					field310 = var40;
				}

				if (field457 != 0) {
					field457 = 0;
					field188 = true;
				}

				field340 = true;
				field239 = true;
				field531 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 202) {
				int var41 = field448.method216();
				method40(var41);

				if (field536 != -1) {
					method135(field536);
					field536 = -1;
				}

				if (field310 != -1) {
					method135(field310);
					field310 = -1;
				}

				if (field529 != -1) {
					method135(field529);
					field529 = -1;
				}

				if (field528 != var41) {
					method135(field528);
					field528 = var41;
				}

				field457 = 0;
				field531 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 233) {
				int var42 = field448.method219();
				if (var42 >= 0) {
					method40(var42);
				}

				if (field464 != var42) {
					method135(field464);
					field464 = var42;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 192) {
				field400 = false;
				field457 = 2;
				field237 = "";
				field188 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 6) {
				boolean var43 = field448.method208() == 1;
				int var44 = field448.method191();
				LUAMUNXO.method316(var44).field894 = var43;
				field142 = -1;
				return true;
			}

			if (field142 == 128) {
				field378 = field448.method189();
				field142 = -1;
				return true;
			}

			if (field142 == 209) {
				int var45 = field448.method214();
				byte var46 = field448.method190();
				field282[var45] = var46;

				if (field532[var45] != var46) {
					field532[var45] = var46;
					method139(var45);
					field340 = true;

					if (field179 != -1) {
						field188 = true;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 13) {
				int var47 = field448.method216();
				LUAMUNXO var48 = LUAMUNXO.method316(var47);
				for (int var49 = 0; var49 < var48.field827.length; var49++) {
					var48.field827[var49] = -1;
					var48.field827[var49] = 0;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 149) {
				field340 = true;
				int var50 = field448.method222();
				int var51 = field448.method208();
				int var52 = field448.method189();
				field309[var52] = var50;
				field493[var52] = var51;
				field495[var52] = 1;
				for (int var53 = 0; var53 < 98; var53++) {
					if (var50 >= field361[var53]) {
						field495[var52] = var53 + 2;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 235) {
				method62(field448, field141);
				field142 = -1;
				return true;
			}

			if (field142 == 166) {
				method45();
				field142 = -1;
				return false;
			}

			if (field142 == 223) {
				int var54 = field448.method217();
				if (field179 != var54) {
					method135(field179);
					field179 = var54;
				}

				field188 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 238) {
				int var55 = field448.method191();
				int var56 = field448.method191();
				LUAMUNXO.method316(var55).field874 = 2;
				LUAMUNXO.method316(var55).field875 = var56;
				field142 = -1;
				return true;
			}

			if (field142 == 147) {
				if (field310 != -1) {
					method135(field310);
					field310 = -1;
					field340 = true;
					field239 = true;
				}

				if (field529 != -1) {
					method135(field529);
					field529 = -1;
					field188 = true;
				}

				if (field528 != -1) {
					method135(field528);
					field528 = -1;
					field346 = true;
				}

				if (field536 != -1) {
					method135(field536);
					field536 = -1;
				}

				if (field457 != 0) {
					field457 = 0;
					field188 = true;
				}

				field531 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 141) {
				String var57 = field448.method196();
				if (var57.endsWith(":tradereq:")) {
					String var58 = var57.substring(0, var57.indexOf(":"));
					long var59 = JDMIWTSP.method278(var58);
					boolean var61 = false;
					for (int var62 = 0; var62 < field114; var62++) {
						if (field335[var62] == var59) {
							var61 = true;
							break;
						}
					}

					if (!var61 && field240 == 0) {
						method136(4, "wishes to trade with you.", var58);
					}
				} else if (var57.endsWith(":duelreq:")) {
					String var63 = var57.substring(0, var57.indexOf(":"));
					long var64 = JDMIWTSP.method278(var63);
					boolean var66 = false;
					for (int var67 = 0; var67 < field114; var67++) {
						if (field335[var67] == var64) {
							var66 = true;
							break;
						}
					}

					if (!var66 && field240 == 0) {
						method136(8, "wishes to duel with you.", var63);
					}
				} else if (var57.endsWith(":chalreq:")) {
					String var68 = var57.substring(0, var57.indexOf(":"));
					long var69 = JDMIWTSP.method278(var68);
					boolean var71 = false;
					for (int var72 = 0; var72 < field114; var72++) {
						if (field335[var72] == var69) {
							var71 = true;
							break;
						}
					}

					if (!var71 && field240 == 0) {
						String var73 = var57.substring(var57.indexOf(":") + 1, var57.length() - 9);
						method136(8, var73, var68);
					}
				} else {
					method136(0, var57, "");
				}

				field142 = -1;
				return true;
			}

			if (field142 == 51) {
				int var74 = field448.method216();
				method40(var74);

				if (field310 != -1) {
					method135(field310);
					field310 = -1;
					field340 = true;
					field239 = true;
				}

				if (field528 != -1) {
					method135(field528);
					field528 = -1;
					field346 = true;
				}

				if (field536 != -1) {
					method135(field536);
					field536 = -1;
				}

				if (field529 != var74) {
					method135(field529);
					field529 = var74;
				}

				field531 = false;
				field188 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 109) {
				String var75 = field448.method196();
				int var76 = field448.method216();
				LUAMUNXO.method316(var76).field871 = var75;

				if (field365[field351] == LUAMUNXO.method316(var76).field857) {
					field340 = true;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 69) {
				method110(field141, field448);
				field205 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 113) {
				field371 = field448.method216() * 30;
				field142 = -1;
				return true;
			}

			if (field142 == 241) {
				int var77 = field448.method216();
				if (var77 == 0xFFFF) {
					var77 = -1;
				}

				if (field244 != var77 && field462 && !field259 && field488 == 0) {
					field125 = var77;
					field126 = true;
					field146.method328(2, field125);
				}

				field244 = var77;
				field142 = -1;
				return true;
			}

			if (field142 == 239) {
				int var78 = field448.method215();
				int var79 = field448.method220();
				if (field462 && !field259) {
					field125 = var78;
					field126 = false;
					field146.method328(2, field125);
					field488 = var79;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 108) {
				int var80 = field448.method191();
				int var81 = field448.method216();
				int var82 = field448.method191();

				if (var81 == 0xFFFF) {
					LUAMUNXO.method316(var80).field874 = 0;
					field142 = -1;
					return true;
				}

				JKSNDEQS var83 = JKSNDEQS.method293(var81);
				LUAMUNXO.method316(var80).field874 = 4;
				LUAMUNXO.method316(var80).field875 = var81;
				LUAMUNXO.method316(var80).field839 = var83.field735;
				LUAMUNXO.method316(var80).field840 = var83.field760;
				LUAMUNXO.method316(var80).field838 = var83.field736 * 100 / var82;
				field142 = -1;
				return true;
			}

			if (field142 == 72) {
				int var84 = field448.method189();
				int var85 = field448.method189();
				int var86 = field448.method189();
				int var87 = field448.method189();
				field156[var84] = true;
				field281[var84] = var85;
				field183[var84] = var86;
				field177[var84] = var87;
				field500[var84] = 0;
				field142 = -1;
				return true;
			}

			if (field142 == 26) {
				field114 = field141 / 8;
				for (int var88 = 0; var88 < field114; var88++) {
					field335[var88] = field448.method195();
				}

				field142 = -1;
				return true;
			}

			if (field142 == 54) {
				int var89 = field448.method216();
				int var90 = field448.method217();
				LUAMUNXO var91 = LUAMUNXO.method316(var89);
				if (var91.field829 != var90 || var90 == -1) {
					var91.field829 = var90;
					var91.field861 = 0;
					var91.field836 = 0;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 29) {
				int var92 = field448.method216();
				int var93 = field448.method191();
				LUAMUNXO var94 = LUAMUNXO.method316(var92);
				if (var94 != null && var94.field873 == 0) {
					if (var93 < 0) {
						var93 = 0;
					}

					if (var93 > var94.field895 - var94.field896) {
						var93 = var94.field895 - var94.field896;
					}

					var94.field858 = var93;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 175) {
				field389 = 0;
				field142 = -1;
				return true;
			}

			if (field142 == 75) {
				if (field351 == 12) {
					field340 = true;
				}

				field173 = field448.method189();
				field142 = -1;
				return true;
			}

			if (field142 == 245) {
				long var95 = field448.method195();
				int var97 = field448.method189();
				String var98 = JDMIWTSP.method282(JDMIWTSP.method279(var95));
				for (int var99 = 0; var99 < field268; var99++) {
					if (field280[var99] == var95) {
						if (field442[var99] != var97) {
							field442[var99] = var97;
							field340 = true;

							if (var97 > 0) {
								method136(5, var98 + " has logged in.", "");
							}

							if (var97 == 0) {
								method136(5, var98 + " has logged out.", "");
							}
						}

						var98 = null;
						break;
					}
				}

				if (var98 != null && field268 < 200) {
					field280[field268] = var95;
					field128[field268] = var98;
					field442[field268] = var97;
					field268++;
					field340 = true;
				}

				boolean var100 = false;
				while (!var100) {
					var100 = true;
					for (int var101 = 0; var101 < field268 - 1; var101++) {
						if (field442[var101] != field256 && field442[var101 + 1] == field256 || field442[var101] == 0 && field442[var101 + 1] != 0) {
							int var102 = field442[var101];
							field442[var101] = field442[var101 + 1];
							field442[var101 + 1] = var102;
							String var103 = field128[var101];
							field128[var101] = field128[var101 + 1];
							field128[var101 + 1] = var103;
							long var104 = field280[var101];
							field280[var101] = field280[var101 + 1];
							field280[var101 + 1] = var104;
							field340 = true;
							var100 = false;
						}
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 15) {
				field138 = field448.method208();
				field139 = field448.method208();

				while (field448.field563 < field141) {
					int var106 = field448.method189();
					method127(field448, var106);
				}

				field142 = -1;
				return true;
			}

			if (field142 == 217) {
				field138 = field448.method189();
				field139 = field448.method208();
				for (int var107 = field138; var107 < field138 + 8; var107++) {
					for (int var108 = field139; var108 < field139 + 8; var108++) {
						if (field459[field295][var107][var108] != null) {
							field459[field295][var107][var108] = null;
							method61(var107, var108);
						}
					}
				}

				for (XQZVTAMW var109 = (XQZVTAMW) field238.method592(); var109 != null; var109 = (XQZVTAMW) field238.method594()) {
					if (var109.field1408 >= field138 && var109.field1408 < field138 + 8 && var109.field1409 >= field139 && var109.field1409 < field139 + 8 && field295 == var109.field1406) {
						var109.field1404 = 0;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 185 || field142 == 87 || field142 == 207 || field142 == 253 || field142 == 94 || field142 == 24 || field142 == 212 || field142 == 52 || field142 == 77 || field142 == 211 || field142 == 197) {
				method127(field448, field142);
				field142 = -1;
				return true;
			}

			if (field142 == 130) {
				field540 = true;
				field230 = field448.method189();
				field231 = field448.method189();
				field232 = field448.method191();
				field233 = field448.method189();
				field234 = field448.method189();
				if (field234 >= 100) {
					field314 = field230 * 128 + 64;
					field316 = field231 * 128 + 64;
					field315 = method83(field295, field314, field316) - field232;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 38) {
				if (field351 == 12) {
					field340 = true;
				}

				field207 = field448.method192();
				field142 = -1;
				return true;
			}

			if (field142 == 165 || field142 == 95) {
				int var110 = field328;
				int var111 = field329;
				if (field142 == 165) {
					var110 = field448.method214();
					var111 = field448.method216();
					field533 = false;
				}

				if (field142 == 95) {
					var110 = field448.method214();
					field448.method199();

					for (int var112 = 0; var112 < 4; var112++) {
						for (int var113 = 0; var113 < 13; var113++) {
							for (int var114 = 0; var114 < 13; var114++) {
								int var115 = field448.method200(1);
								if (var115 == 1) {
									field271[var112][var113][var114] = field448.method200(26);
								} else {
									field271[var112][var113][var114] = -1;
								}
							}
						}
					}

					field448.method201();
					var111 = field448.method191();
					field533 = true;
				}

				if (field328 == var110 && field329 == var111 && field522 == 2) {
					field142 = -1;
					return true;
				}

				field328 = var110;
				field329 = var111;
				field291 = (field328 - 6) * 8;
				field292 = (field329 - 6) * 8;
				field350 = false;
				if ((field328 / 8 == 48 || field328 / 8 == 49) && field329 / 8 == 48) {
					field350 = true;
				}

				if (field328 / 8 == 48 && field329 / 8 == 148) {
					field350 = true;
				}

				field522 = 1;
				field172 = System.currentTimeMillis();

				if (field357 != null) {
					field357.method455();
					AWNOLVYV.field32 = field405;
					field411.method230(0, 257, "Loading - please wait.", 151);
					field411.method230(0xFFFFFF, 256, "Loading - please wait.", 150);
					field357.method456(4, field781, 4);
				} else if (field782 != null) {
					field782.method455();
					AWNOLVYV.field32 = field406;
					field411.method230(0, 383, "Loading - please wait.", 471);
					field411.method230(0xFFFFFF, 382, "Loading - please wait.", 470);
					field782.method456(0, field781, 0);
				}

				if (field142 == 165) {
					int var116 = 0;
					for (int var117 = (field328 - 6) / 8; var117 <= (field328 + 6) / 8; var117++) {
						for (int var118 = (field329 - 6) / 8; var118 <= (field329 + 6) / 8; var118++) {
							var116++;
						}
					}

					field419 = new byte[var116][];
					field417 = new byte[var116][];
					field247 = new int[var116];
					field248 = new int[var116];
					field249 = new int[var116];
					int var119 = 0;
					for (int var120 = (field328 - 6) / 8; var120 <= (field328 + 6) / 8; var120++) {
						for (int var121 = (field329 - 6) / 8; var121 <= (field329 + 6) / 8; var121++) {
							field247[var119] = (var120 << 8) + var121;

							if (field350 && (var121 == 49 || var121 == 149 || var121 == 147 || var120 == 50 || var120 == 49 && var121 == 47)) {
								field248[var119] = -1;
								field249[var119] = -1;
								var119++;
							} else {
								int var122 = field248[var119] = field146.method340(var121, var120, 0);
								if (var122 != -1) {
									field146.method328(3, var122);
								}

								int var123 = field249[var119] = field146.method340(var121, var120, 1);
								if (var123 != -1) {
									field146.method328(3, var123);
								}

								var119++;
							}
						}
					}
				}

				if (field142 == 95) {
					int var124 = 0;
					int[] var125 = new int[676];
					for (int var126 = 0; var126 < 4; var126++) {
						for (int var127 = 0; var127 < 13; var127++) {
							for (int var128 = 0; var128 < 13; var128++) {
								int var129 = field271[var126][var127][var128];
								if (var129 != -1) {
									int var130 = var129 >> 14 & 0x3FF;
									int var131 = var129 >> 3 & 0x7FF;
									int var132 = (var130 / 8 << 8) + var131 / 8;
									for (int var133 = 0; var133 < var124; var133++) {
										if (var125[var133] == var132) {
											var132 = -1;
											break;
										}
									}

									if (var132 != -1) {
										var125[var124++] = var132;
									}
								}
							}
						}
					}

					field419 = new byte[var124][];
					field417 = new byte[var124][];
					field247 = new int[var124];
					field248 = new int[var124];
					field249 = new int[var124];
					for (int var134 = 0; var134 < var124; var134++) {
						int var135 = field247[var134] = var125[var134];
						int var136 = var135 >> 8 & 0xFF;
						int var137 = var135 & 0xFF;
						int var138 = field248[var134] = field146.method340(var137, var136, 0);
						if (var138 != -1) {
							field146.method328(3, var138);
						}

						int var139 = field249[var134] = field146.method340(var137, var136, 1);
						if (var139 != -1) {
							field146.method328(3, var139);
						}
					}
				}

				int var140 = field291 - field293;
				int var141 = field292 - field294;
				field293 = field291;
				field294 = field292;

				for (int var142 = 0; var142 < 16384; var142++) {
					DLNPJUEQ var143 = field273[var142];
					if (var143 != null) {
						for (int var144 = 0; var144 < 10; var144++) {
							var143.field82[var144] -= var140;
							var143.field83[var144] -= var141;
						}

						var143.field96 -= var140 * 128;
						var143.field97 -= var141 * 128;
					}
				}

				for (int var145 = 0; var145 < field502; var145++) {
					HHCKFJEO var146 = field504[var145];
					if (var146 != null) {
						for (int var147 = 0; var147 < 10; var147++) {
							var146.field82[var147] -= var140;
							var146.field83[var147] -= var141;
						}

						var146.field96 -= var140 * 128;
						var146.field97 -= var141 * 128;
					}
				}

				field205 = true;
				byte var148 = 0;
				byte var149 = 104;
				byte var150 = 1;
				if (var140 < 0) {
					var148 = 103;
					var149 = -1;
					var150 = -1;
				}

				byte var151 = 0;
				byte var152 = 104;
				byte var153 = 1;
				if (var141 < 0) {
					var151 = 103;
					var152 = -1;
					var153 = -1;
				}

				for (int var154 = var148; var154 != var149; var154 += var150) {
					for (int var155 = var151; var155 != var152; var155 += var153) {
						int var156 = var140 + var154;
						int var157 = var141 + var155;
						for (int var158 = 0; var158 < 4; var158++) {
							if (var156 >= 0 && var157 >= 0 && var156 < 104 && var157 < 104) {
								field459[var158][var154][var155] = field459[var158][var156][var157];
							} else {
								field459[var158][var154][var155] = null;
							}
						}
					}
				}

				for (XQZVTAMW var159 = (XQZVTAMW) field238.method592(); var159 != null; var159 = (XQZVTAMW) field238.method594()) {
					var159.field1408 -= var140;
					var159.field1409 -= var141;
					if (var159.field1408 < 0 || var159.field1409 < 0 || var159.field1408 >= 104 || var159.field1409 >= 104) {
						var159.method1();
					}
				}

				if (field389 != 0) {
					field389 -= var140;
					field390 -= var141;
				}

				field540 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 232) {
				int var160 = field448.method215();
				int var161 = field448.method214();

				if (field529 != -1) {
					method135(field529);
					field529 = -1;
					field188 = true;
				}

				if (field528 != -1) {
					method135(field528);
					field528 = -1;
					field346 = true;
				}

				if (field536 != var160) {
					method135(field536);
					field536 = var160;
				}

				if (field310 != var161) {
					method135(field310);
					field310 = var161;
				}

				if (field457 != 0) {
					field457 = 0;
					field188 = true;
				}

				field340 = true;
				field239 = true;
				field531 = false;
				field142 = -1;
				return true;
			}

			if (field142 == 213) {
				field138 = field448.method207();
				field139 = field448.method189();
				field142 = -1;
				return true;
			}

			if (field142 == 169) {
				field327 = field448.method189();
				if (field327 == 1) {
					field178 = field448.method191();
				}

				if (field327 >= 2 && field327 <= 6) {
					if (field327 == 2) {
						field307 = 64;
						field308 = 64;
					}

					if (field327 == 3) {
						field307 = 0;
						field308 = 64;
					}

					if (field327 == 4) {
						field307 = 128;
						field308 = 64;
					}

					if (field327 == 5) {
						field307 = 64;
						field308 = 0;
					}

					if (field327 == 6) {
						field307 = 64;
						field308 = 128;
					}

					field327 = 2;
					field304 = field448.method191();
					field305 = field448.method191();
					field306 = field448.method189();
				}

				if (field327 == 10) {
					field201 = field448.method191();
				}

				field142 = -1;
				return true;
			}

			if (field142 == 249) {
				int var162 = field448.method216();
				int var163 = field448.method189();

				if (var162 == 0xFFFF) {
					var162 = -1;
				}

				if (field365[var163] != var162) {
					method135(field365[var163]);
					field365[var163] = var162;
				}

				field340 = true;
				field239 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 33) {
				int var164 = field448.method189();
				String var165 = field448.method196();
				int var166 = field448.method207();
				if (var166 >= 1 && var166 <= 5) {
					if (var165.equalsIgnoreCase("null")) {
						var165 = null;
					}

					field491[var166 - 1] = var165;
					field492[var166 - 1] = var164 == 0;
				}

				field142 = -1;
				return true;
			}

			if (field142 == 18) {
				int var167 = field448.method214();
				int var168 = field448.method191();
				int var169 = field448.method214();
				int var170 = field448.method216();
				LUAMUNXO.method316(var169).field839 = var170;
				LUAMUNXO.method316(var169).field840 = var167;
				LUAMUNXO.method316(var169).field838 = var168;
				field142 = -1;
				return true;
			}

			if (field142 == 110) {
				field351 = field448.method207();
				field340 = true;
				field239 = true;
				field142 = -1;
				return true;
			}

			if (field142 == 48) {
				for (int var171 = 0; var171 < field532.length; var171++) {
					if (field532[var171] != field282[var171]) {
						field532[var171] = field282[var171];
						method139(var171);
						field340 = true;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 67) {
				field340 = true;
				int var172 = field448.method191();
				LUAMUNXO var173 = LUAMUNXO.method316(var172);
				while (field448.field563 < field141) {
					int var174 = field448.method203();
					int var175 = field448.method191();
					int var176 = field448.method189();
					if (var176 == 255) {
						var176 = field448.method194();
					}

					if (var174 >= 0 && var174 < var173.field827.length) {
						var173.field827[var174] = var175;
						var173.field899[var174] = var176;
					}
				}

				field142 = -1;
				return true;
			}

			if (field142 == 208) {
				long var177 = field448.method195();
				int var179 = field448.method194();
				int var180 = field448.method189();
				boolean var181 = false;
				for (int var182 = 0; var182 < 100; var182++) {
					if (field444[var182] == var179) {
						var181 = true;
						break;
					}
				}

				if (var180 <= 1) {
					for (int var183 = 0; var183 < field114; var183++) {
						if (field335[var183] == var177) {
							var181 = true;
							break;
						}
					}
				}

				if (!var181 && field240 == 0) {
					try {
						field444[field161] = var179;
						field161 = (field161 + 1) % 100;
						String var184 = REROLFNU.method398(field141 - 13, field448);
						if (var180 != 3) {
							var184 = ULPSDNZC.method472(var184);
						}

						if (var180 == 2 || var180 == 3) {
							method136(7, var184, "@cr2@" + JDMIWTSP.method282(JDMIWTSP.method279(var177)));
						} else if (var180 == 1) {
							method136(7, var184, "@cr1@" + JDMIWTSP.method282(JDMIWTSP.method279(var177)));
						} else {
							method136(3, var184, JDMIWTSP.method282(JDMIWTSP.method279(var177)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field142 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field142 + "," + field141 + " - " + field312 + "," + field313);
			method45();
		} catch (IOException var190) {
			method132();
		} catch (Exception var191) {
			String var187 = "T2 - " + field142 + "," + field312 + "," + field313 + " - " + field141 + "," + (field252.field82[0] + field291) + "," + (field252.field83[0] + field292) + " - ";
			for (int var188 = 0; var188 < field141 && var188 < 50; var188++) {
				var187 = var187 + field448.field562[var188] + ",";
			}

			signlink.reporterror(var187);
			method45();
		}

		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method67() {
		if (field320 != 0) {
			int var1 = 0;
			if (field371 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field325[var2] != null) {
					int var3 = field323[var2];
					String var4 = field324[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field341 == 0 || field341 == 1 && method99(var4))) {
						int var8 = 329 - var1 * 13;
						if (field789 > 4 && field790 - 4 > var8 - 10 && field790 - 4 <= var8 + 3) {
							int var9 = field411.method232("From:  " + var4 + field325[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field789 < var9 + 4) {
								if (field518 >= 1) {
									field283[field541] = "Report abuse @whi@" + var4;
									field394[field541] = 2208;
									field541++;
								}

								field283[field541] = "Add ignore @whi@" + var4;
								field394[field541] = 2064;
								field541++;
								field283[field541] = "Add friend @whi@" + var4;
								field394[field541] = 2723;
								field541++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field341 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method68(boolean arg0) {
		method88();
		field223.method455();
		field184.method390(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field263 == 0) {
			int var4 = var3 / 2 + 80;
			field410.method231(field146.field966, true, var4, 0x75A9A9, var2 / 2);
			int var5 = var3 / 2 - 20;
			field412.method231("Welcome to RuneScape", true, var5, 0xFFFF00, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field185.method390(var6 - 73, var7 - 20);
			field412.method231("New User", true, var7 + 5, 0xFFFFFF, var6);
			int var8 = var2 / 2 + 80;
			field185.method390(var8 - 73, var7 - 20);
			field412.method231("Existing User", true, var7 + 5, 0xFFFFFF, var8);
		}

		if (field263 == 2) {
			int var9 = var3 / 2 - 40;
			if (field439.length() > 0) {
				field412.method231(field439, true, var9 - 15, 0xFFFF00, var2 / 2);
				field412.method231(field440, true, var9, 0xFFFF00, var2 / 2);
				var9 += 30;
			} else {
				field412.method231(field440, true, var9 - 7, 0xFFFF00, var2 / 2);
				var9 += 30;
			}

			field412.method238(var2 / 2 - 90, "Username: " + field264 + (field515 == 0 & field402 % 40 < 20 ? "@yel@|" : ""), true, var9, 0xFFFFFF);
			var9 += 15;
			field412.method238(var2 / 2 - 88, "Password: " + JDMIWTSP.method283(field265) + (field515 == 1 & field402 % 40 < 20 ? "@yel@|" : ""), true, var9, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field185.method390(var10 - 73, var11 - 20);
				field412.method231("Login", true, var11 + 5, 0xFFFFFF, var10);
				int var12 = var2 / 2 + 80;
				field185.method390(var12 - 73, var11 - 20);
				field412.method231("Cancel", true, var11 + 5, 0xFFFFFF, var12);
			}
		}

		if (field263 == 3) {
			field412.method231("Create a free account", true, var3 / 2 - 60, 0xFFFF00, var2 / 2);
			int var13 = var3 / 2 - 35;
			field412.method231("To create a new account you need to", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field412.method231("go back to the main RuneScape webpage", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field412.method231("and choose the red 'create account'", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field412.method231("button at the top right of that page.", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field185.method390(var14 - 73, var15 - 20);
			field412.method231("Cancel", true, var15 + 5, 0xFFFFFF, var14);
		}

		field223.method456(202, field781, 171);

		if (field346) {
			field346 = false;
			field221.method456(128, field781, 0);
			field222.method456(202, field781, 371);
			field226.method456(0, field781, 265);
			field227.method456(562, field781, 265);
			field228.method456(128, field781, 171);
			field229.method456(562, field781, 171);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method69() {
		try {
			field445 = -1;
			field255.method596();
			field251.method596();
			field463++;
			if (field463 > 94) {
				field463 = 0;
				field194.method178(129);
			}

			AWNOLVYV.method5();
			method80();
			field115.method538();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field510[var1].method500();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field384[var2][var3][var4] = 0;
					}
				}
			}

			NSTMHEDV var5 = new NSTMHEDV(104, field384, field385, 104);
			int var6 = field419.length;
			field194.method178(231);

			if (!field533) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field247[var7] >> 8) * 64 - field291;
					int var9 = (field247[var7] & 0xFF) * 64 - field292;
					byte[] var10 = field419[var7];
					if (var10 != null) {
						var5.method376(var9, (field329 - 6) * 8, var8, var10, field510, (field328 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field247[var11] >> 8) * 64 - field291;
					int var13 = (field247[var11] & 0xFF) * 64 - field292;
					byte[] var14 = field419[var11];
					if (var14 == null && field329 < 800) {
						var5.method359(64, 64, var13, var12);
					}
				}

				field194.method178(231);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field417[var15];
					if (var16 != null) {
						int var17 = (field247[var15] >> 8) * 64 - field291;
						int var18 = (field247[var15] & 0xFF) * 64 - field292;
						var5.method372(var18, var17, var16, field115, field510);
					}
				}
			}

			if (field533) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field271[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field247.length; var28++) {
									if (field247[var28] == var27 && field419[var28] != null) {
										var5.method373((var26 & 0x7) * 8, var21 * 8, var20 * 8, var23, field510, var24, field419[var28], (var25 & 0x7) * 8, var19);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field271[0][var29][var30];
						if (var31 == -1) {
							var5.method359(8, 8, var30 * 8, var29 * 8);
						}
					}
				}

				field194.method178(231);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field271[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field247.length; var41++) {
									if (field247[var41] == var40 && field417[var41] != null) {
										var5.method368((var39 & 0x7) * 8, var37, field510, var36, var33 * 8, (var38 & 0x7) * 8, var34 * 8, field115, var32, field417[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field194.method178(231);
			var5.method374(field510, field115);

			if (field357 != null) {
				field357.method455();
				AWNOLVYV.field32 = field405;
			}

			field194.method178(231);
			int var42 = NSTMHEDV.field1045;
			if (var42 > field295) {
				var42 = field295;
			}

			if (var42 < field295 - 1) {
				int var43 = field295 - 1;
			}

			if (field259) {
				field115.method539(NSTMHEDV.field1045);
			} else {
				field115.method539(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method61(var44, var45);
				}
			}

			method128();
		} catch (Exception var58) {
		}

		SRQVPDWQ.field1227.method403();

		if (field784 != null) {
			field194.method178(207);
			field194.method183(1057001181);
		}

		if (field259 && signlink.cache_dat != null) {
			int var47 = field146.method342(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field146.method338(var48);
				if ((var49 & 0x79) == 0) {
					SNMMQNPZ.method417(var48);
				}
			}
		}

		System.gc();
		AWNOLVYV.method6(20);
		field146.method331();
		int var50 = (field328 - 6) / 8 - 1;
		int var51 = (field328 + 6) / 8 + 1;
		int var52 = (field329 - 6) / 8 - 1;
		int var53 = (field329 + 6) / 8 + 1;
		if (field350) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field146.method340(var55, var54, 0);
					if (var56 != -1) {
						field146.method330(var56, 3);
					}

					int var57 = field146.method340(var55, var54, 1);
					if (var57 != -1) {
						field146.method330(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method70(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field114; var3++) {
				if (field335[var3] == arg0) {
					field114--;
					field340 = true;

					for (int var4 = var3; var4 < field114; var4++) {
						field335[var4] = field335[var4 + 1];
					}

					field194.method178(46);
					field194.method185(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method71() {
		method109();

		if (field124 == 1) {
			field326[field123 / 100].method529(field121 - 8 - 4, field122 - 8 - 4);
		}

		if (field124 == 2) {
			field326[field123 / 100 + 4].method529(field121 - 8 - 4, field122 - 8 - 4);
		}

		if (field464 != -1) {
			method166(field167, field464);
			method138(0, 0, LUAMUNXO.method316(field464), 0);
		}

		if (field536 != -1) {
			method166(field167, field536);
			method138(0, 0, LUAMUNXO.method316(field536), 0);
		}

		method113();

		if (!field363) {
			method54();
			method134();
		} else if (field473 == 0) {
			method59();
		}

		if (field378 == 1) {
			field530.method529(472, 296);
		}

		if (field113) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field777 < 15) {
				var3 = 0xFF0000;
			}

			field411.method229(var3, var2, "Fps:" + field777, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field259) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field259) {
				int var8 = 0xFF0000;
			}

			field411.method229(0xFFFF00, var2, "Mem:" + var5 + "k", var1);
			var2 += 15;
		}

		if (field371 != 0) {
			int var9 = field371 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field411.method234(4, "System update in: " + var10 + ":0" + var9, 0xFFFF00, 329);
			} else {
				field411.method234(4, "System update in: " + var10 + ":" + var9, 0xFFFF00, 329);
			}

			field319++;
			if (field319 > 65) {
				field319 = 0;
				field194.method178(116);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void method72() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field359);

		if (field146 != null) {
			System.out.println("Od-cycle:" + field146.field974);
		}

		System.out.println("loop-cycle:" + field402);
		System.out.println("draw-cycle:" + field373);
		System.out.println("ptype:" + field142);
		System.out.println("psize:" + field141);

		if (field290 != null) {
			field290.method383();
		}

		field778 = true;
	}

	@ObfuscatedName("client.c(B)Ljava/awt/Component;")
	public final Component method73() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field784 != null) {
			return field784;
		}

		return this;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method74() {
		field184 = new PQKEJITK(field186, "titlebox", 0);
		field185 = new PQKEJITK(field186, "titlebutton", 0);
		field494 = new PQKEJITK[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field494[var2] = new PQKEJITK(field186, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field494[var3] = new PQKEJITK(field186, "runes", (var3 & 0x3) + 12);
			}
		}

		field151 = new XANVNPIN(128, 265);
		field152 = new XANVNPIN(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field151.field1392[var4] = field224.field1267[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field152.field1392[var5] = field225.field1267[var5];
		}

		field163 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field163[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field163[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field163[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field163[var9 + 192] = 0xFFFFFF;
		}

		field164 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field164[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field164[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field164[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field164[var13 + 192] = 0xFFFFFF;
		}

		field165 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field165[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field165[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field165[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field165[var17 + 192] = 0xFFFFFF;
		}

		field162 = new int[256];
		field119 = new int[32768];
		field120 = new int[32768];
		method63(null);
		field386 = new int[32768];
		field387 = new int[32768];
		method27(10, "Connecting to fileserver");

		if (!field399) {
			field242 = true;
			field399 = true;
			method86(this, 2);
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method75(boolean arg0) {
		if (field252.field96 >> 7 == field389 && field252.field97 >> 7 == field390) {
			field389 = 0;
		}

		int var2 = field505;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			HHCKFJEO var4;
			int var5;
			if (arg0) {
				var4 = field252;
				var5 = field503 << 14;
			} else {
				var4 = field504[field506[var3]];
				var5 = field506[var3] << 14;
			}

			if (var4 != null && var4.method20()) {
				var4.field677 = false;
				if ((field259 && field505 > 50 || field505 > 200) && !arg0 && var4.field62 == var4.field45) {
					var4.field677 = true;
				}

				int var6 = var4.field96 >> 7;
				int var7 = var4.field97 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field681 == null || field402 < var4.field691 || field402 >= var4.field692) {
						if ((var4.field96 & 0x7F) == 0x40 && (var4.field97 & 0x7F) == 0x40) {
							if (field397[var6][var7] == field376) {
								continue;
							}

							field397[var6][var7] = field376;
						}

						var4.field684 = method83(field295, var4.field96, var4.field97);
						field115.method549(var5, var4, var4.field97, var4.field98, var4.field684, 60, var4.field96, var4.field61, field295);
					} else {
						var4.field677 = false;
						var4.field684 = method83(field295, var4.field96, var4.field97);
						field115.method550(field295, var4.field684, var4.field687, var4.field96, var4.field688, var4.field689, var4, var4.field98, 60, var4.field97, var5, var4.field690);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		XQZVTAMW var10 = null;
		for (XQZVTAMW var11 = (XQZVTAMW) field238.method592(); var11 != null; var11 = (XQZVTAMW) field238.method594()) {
			if (var11.field1406 == arg3 && var11.field1408 == arg0 && var11.field1409 == arg4 && var11.field1407 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new XQZVTAMW();
			var10.field1406 = arg3;
			var10.field1407 = arg2;
			var10.field1408 = arg0;
			var10.field1409 = arg4;
			method57(var10);
			field238.method589(var10);
		}

		var10.field1410 = arg8;
		var10.field1412 = arg6;
		var10.field1411 = arg5;
		var10.field1405 = arg1;
		var10.field1404 = arg7;
	}

	@ObfuscatedName("client.a(ZLXANVNPIN;II)V")
	public final void method77(XANVNPIN arg0, int arg1, int arg2) {
		int var4 = field426 + field190 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = SNMMQNPZ.field1216[var4];
			int var7 = SNMMQNPZ.field1217[var4];
			var6 = var6 * 256 / (field496 + 256);
			var7 = var7 * 256 / (field496 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method535(field218, 83 - var9 - arg0.field1398 / 2 - 4, var8 + 94 - arg0.field1397 / 2 + 4);
			} else {
				arg0.method529(var8 + 94 + 4 - arg0.field1397 / 2, 83 - var9 - arg0.field1398 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIILLUAMUNXO;)V")
	public final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, LUAMUNXO arg7) {
		if (field450) {
			field118 = 32;
		} else {
			field118 = 0;
		}

		field450 = false;
		if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
			arg7.field858 -= field149 * 4;

			if (arg4 == 1) {
				field340 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field188 = true;
			}
		} else if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg5 + arg6 - 16 && arg3 < arg5 + arg6) {
			arg7.field858 += field149 * 4;

			if (arg4 == 1) {
				field340 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field188 = true;
			}
		} else if (arg0 >= arg1 - field118 && arg0 < arg1 + field118 + 16 && arg3 >= arg5 + 16 && arg3 < arg5 + arg6 - 16 && field149 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg5 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg7.field858 = (arg2 - arg6) * var10 / var11;

			if (arg4 == 1) {
				field340 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field188 = true;
			}

			field450 = true;
		}
	}

	@ObfuscatedName("client.a(ZIZ)V")
	public final void method79(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method80() {
		SRQVPDWQ.field1227.method403();
		SRQVPDWQ.field1245.method403();
		HEKJNUPL.field649.method403();
		JKSNDEQS.field765.method403();
		JKSNDEQS.field725.method403();
		HHCKFJEO.field685.method403();
		NGIGHQOG.field998.method403();
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method81() {
		signlink.reporterror = false;

		try {
			if (field290 != null) {
				field290.method378();
			}
		} catch (Exception var1) {
		}

		field290 = null;
		method97();

		if (field195 != null) {
			field195.field544 = false;
		}

		field195 = null;
		field146.method329();
		field146 = null;
		field272 = null;
		field194 = null;
		field424 = null;
		field448 = null;
		field247 = null;
		field419 = null;
		field417 = null;
		field248 = null;
		field249 = null;
		field385 = null;
		field384 = null;
		field115 = null;
		field510 = null;
		field470 = null;
		field180 = null;
		field481 = null;
		field482 = null;
		field360 = null;
		field355 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field196 = null;
		field197 = null;
		field198 = null;
		field129 = null;
		field130 = null;
		field131 = null;
		field132 = null;
		field133 = null;
		field134 = null;
		field135 = null;
		field136 = null;
		field137 = null;
		field217 = null;
		field218 = null;
		field219 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field193 = null;
		field483 = null;
		field484 = null;
		field485 = null;
		field486 = null;
		field487 = null;
		field379 = null;
		field380 = null;
		field381 = null;
		field382 = null;
		field383 = null;
		field409 = null;
		field537 = null;
		field153 = null;
		field352 = null;
		field140 = null;
		field326 = null;
		field530 = null;
		field209 = null;
		field210 = null;
		field211 = null;
		field212 = null;
		field213 = null;
		field512 = null;
		field246 = null;
		field397 = null;
		field504 = null;
		field506 = null;
		field508 = null;
		field509 = null;
		field421 = null;
		field273 = null;
		field275 = null;
		field459 = null;
		field238 = null;
		field251 = null;
		field255 = null;
		field392 = null;
		field393 = null;
		field394 = null;
		field395 = null;
		field283 = null;
		field532 = null;
		field158 = null;
		field159 = null;
		field342 = null;
		field391 = null;
		field128 = null;
		field280 = null;
		field442 = null;
		field224 = null;
		field225 = null;
		field221 = null;
		field222 = null;
		field223 = null;
		field226 = null;
		field227 = null;
		field228 = null;
		field229 = null;
		method165();
		SRQVPDWQ.method449();
		HEKJNUPL.method274();
		JKSNDEQS.method288();
		LUAMUNXO.method309();
		HCUFYAUI.field624 = null;
		CSHXCUHU.field554 = null;
		MAECDUZS.field910 = null;
		ZGXCNUJM.field1481 = null;
		NGIGHQOG.field986 = null;
		NGIGHQOG.field998 = null;
		SFNSVANZ.field1132 = null;
		field782 = null;
		HHCKFJEO.field685 = null;
		AWNOLVYV.method2();
		XSMXYXEY.method537();
		SNMMQNPZ.method414();
		NLIOLBXV.method354();
		System.gc();
	}

	@ObfuscatedName("client.m(I)V")
	public final void method82() {
		for (int var1 = -1; var1 < field505; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field503;
			} else {
				var2 = field506[var1];
			}

			HHCKFJEO var3 = field504[var2];
			if (var3 != null && var3.field68 > 0) {
				var3.field68--;
				if (var3.field68 == 0) {
					var3.field93 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field274; var4++) {
			int var5 = field275[var4];
			DLNPJUEQ var6 = field273[var5];
			if (var6 != null && var6.field68 > 0) {
				var6.field68--;
				if (var6.field68 == 0) {
					var6.field93 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method83(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field384[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field385[var6][var4][var5] + field385[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field385[var6][var4][var5 + 1] + field385[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 336);

			if (arg0.length == 5) {
				field256 = Integer.parseInt(arg0[0]);
				field257 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method95();
				} else if (arg0[2].equals("highmem")) {
					method85();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field258 = false;
				} else if (arg0[3].equals("members")) {
					field258 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method297(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method84() {
		field343 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field116[var1] = -1;
			for (int var2 = 0; var2 < CSHXCUHU.field553; var2++) {
				if (!CSHXCUHU.field554[var2].field560 && CSHXCUHU.field554[var2].field555 == var1 + (field300 ? 0 : 7)) {
					field116[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public static final void method85() {
		XSMXYXEY.field1413 = false;
		AWNOLVYV.field21 = false;
		field259 = false;
		NSTMHEDV.field1044 = false;
		SRQVPDWQ.field1258 = false;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method86(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method86(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public final String method87(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.m(B)V")
	public final void method88() {
		if (field221 == null) {
			field782 = null;
			field358 = null;
			field356 = null;
			field355 = null;
			field357 = null;
			field196 = null;
			field197 = null;
			field198 = null;
			field224 = new TRQPVNER(128, method73(), 265);
			VDGJUQAS.method515();
			field225 = new TRQPVNER(128, method73(), 265);
			VDGJUQAS.method515();
			field221 = new TRQPVNER(509, method73(), 171);
			VDGJUQAS.method515();
			field222 = new TRQPVNER(360, method73(), 132);
			VDGJUQAS.method515();
			field223 = new TRQPVNER(360, method73(), 200);
			VDGJUQAS.method515();
			field226 = new TRQPVNER(202, method73(), 238);
			VDGJUQAS.method515();
			field227 = new TRQPVNER(203, method73(), 238);
			VDGJUQAS.method515();
			field228 = new TRQPVNER(74, method73(), 94);
			VDGJUQAS.method515();
			field229 = new TRQPVNER(75, method73(), 94);
			VDGJUQAS.method515();

			if (field186 != null) {
				method158();
				method74();
			}

			field346 = true;
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method89() {
		field346 = true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method90() {
		if (field795 == 1) {
			if (field796 >= 539 && field796 <= 573 && field797 >= 169 && field797 < 205 && field365[0] != -1) {
				field340 = true;
				field351 = 0;
				field239 = true;
			}

			if (field796 >= 569 && field796 <= 599 && field797 >= 168 && field797 < 205 && field365[1] != -1) {
				field340 = true;
				field351 = 1;
				field239 = true;
			}

			if (field796 >= 597 && field796 <= 627 && field797 >= 168 && field797 < 205 && field365[2] != -1) {
				field340 = true;
				field351 = 2;
				field239 = true;
			}

			if (field796 >= 625 && field796 <= 669 && field797 >= 168 && field797 < 203 && field365[3] != -1) {
				field340 = true;
				field351 = 3;
				field239 = true;
			}

			if (field796 >= 666 && field796 <= 696 && field797 >= 168 && field797 < 205 && field365[4] != -1) {
				field340 = true;
				field351 = 4;
				field239 = true;
			}

			if (field796 >= 694 && field796 <= 724 && field797 >= 168 && field797 < 205 && field365[5] != -1) {
				field340 = true;
				field351 = 5;
				field239 = true;
			}

			if (field796 >= 722 && field796 <= 756 && field797 >= 169 && field797 < 205 && field365[6] != -1) {
				field340 = true;
				field351 = 6;
				field239 = true;
			}

			if (field796 >= 540 && field796 <= 574 && field797 >= 466 && field797 < 502 && field365[7] != -1) {
				field340 = true;
				field351 = 7;
				field239 = true;
			}

			if (field796 >= 572 && field796 <= 602 && field797 >= 466 && field797 < 503 && field365[8] != -1) {
				field340 = true;
				field351 = 8;
				field239 = true;
			}

			if (field796 >= 599 && field796 <= 629 && field797 >= 466 && field797 < 503 && field365[9] != -1) {
				field340 = true;
				field351 = 9;
				field239 = true;
			}

			if (field796 >= 627 && field796 <= 671 && field797 >= 467 && field797 < 502 && field365[10] != -1) {
				field340 = true;
				field351 = 10;
				field239 = true;
			}

			if (field796 >= 669 && field796 <= 699 && field797 >= 466 && field797 < 503 && field365[11] != -1) {
				field340 = true;
				field351 = 11;
				field239 = true;
			}

			if (field796 >= 696 && field796 <= 726 && field797 >= 466 && field797 < 503 && field365[12] != -1) {
				field340 = true;
				field351 = 12;
				field239 = true;
			}

			if (field796 >= 724 && field796 <= 758 && field797 >= 466 && field797 < 502 && field365[13] != -1) {
				field340 = true;
				field351 = 13;
				field239 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LLUAMUNXO;B)Z")
	public final boolean method91(LUAMUNXO arg0) {
		if (arg0.field831 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field831.length; var2++) {
			int var3 = method167(var2, arg0);
			int var4 = arg0.field883[var2];
			if (arg0.field831[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field831[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field831[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method92(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a()V")
	public final void method93() {
		method27(20, "Starting up");

		if (signlink.sunjava) {
			field775 = 5;
		}

		if (field285) {
			field338 = true;
		} else {
			field285 = true;
			boolean var1 = false;
			String var2 = method157();
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
						field278[var3] = new GYSQYVEV(var3 + 1, 500000, signlink.cache_idx[var3], signlink.cache_dat);
					}
				}

				try {
					method28();
					field186 = method47("title screen", "title", field447[1], 25, 1);
					field410 = new EOVZRNPE("p11_full", false, field186);
					field411 = new EOVZRNPE("p12_full", false, field186);
					field412 = new EOVZRNPE("b12_full", false, field186);
					field413 = new EOVZRNPE("q8_full", true, field186);
					method158();
					method74();
					FNOQZAYQ var4 = method47("config", "config", field447[2], 30, 2);
					FNOQZAYQ var5 = method47("interface", "interface", field447[3], 35, 3);
					FNOQZAYQ var6 = method47("2d graphics", "media", field447[4], 40, 4);
					FNOQZAYQ var7 = method47("textures", "textures", field447[6], 45, 6);
					FNOQZAYQ var8 = method47("chat system", "wordenc", field447[7], 50, 7);
					FNOQZAYQ var9 = method47("sound effects", "sounds", field447[8], 55, 8);
					field384 = new byte[4][104][104];
					field385 = new int[4][105][105];
					field115 = new XSMXYXEY(104, 4, field385, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field510[var10] = new URWDWMOD(104, 104);
					}

					field391 = new XANVNPIN(512, 512);
					FNOQZAYQ var11 = method47("update list", "versionlist", field447[5], 60, 5);
					method27(60, "Connecting to update server");
					field146 = new MWSOISVX();
					field146.method347(var11, this);
					NLIOLBXV.method352(field146.method335());
					SNMMQNPZ.method415(field146.method342(0), field146);

					if (!field259) {
						field125 = 0;
						try {
							field125 = Integer.parseInt(getParameter("music"));
						} catch (Exception var72) {
						}

						field126 = true;
						field146.method328(2, field125);

						while (field146.method337() > 0) {
							method168();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field146.field964 > 3) {
								method145("ondemand");
								return;
							}
						}
					}

					method27(65, "Requesting animations");
					int var12 = field146.method342(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field146.method328(1, var13);
					}

					while (field146.method337() > 0) {
						int var14 = var12 - field146.method337();
						if (var14 > 0) {
							method27(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method168();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field146.field964 > 3) {
							method145("ondemand");
							return;
						}
					}

					method27(70, "Requesting models");
					int var15 = field146.method342(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field146.method338(var16);
						if ((var17 & 0x1) != 0) {
							field146.method328(0, var16);
						}
					}

					int var18 = field146.method337();
					while (field146.method337() > 0) {
						int var19 = var18 - field146.method337();
						if (var19 > 0) {
							method27(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method168();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field278[0] != null) {
						method27(75, "Requesting maps");
						field146.method328(3, field146.method340(48, 47, 0));
						field146.method328(3, field146.method340(48, 47, 1));
						field146.method328(3, field146.method340(48, 48, 0));
						field146.method328(3, field146.method340(48, 48, 1));
						field146.method328(3, field146.method340(48, 49, 0));
						field146.method328(3, field146.method340(48, 49, 1));
						field146.method328(3, field146.method340(47, 47, 0));
						field146.method328(3, field146.method340(47, 47, 1));
						field146.method328(3, field146.method340(47, 48, 0));
						field146.method328(3, field146.method340(47, 48, 1));
						field146.method328(3, field146.method340(148, 48, 0));
						field146.method328(3, field146.method340(148, 48, 1));
						int var20 = field146.method337();
						while (field146.method337() > 0) {
							int var21 = var20 - field146.method337();
							if (var21 > 0) {
								method27(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method168();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field146.method342(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field146.method338(var23);
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
							field146.method332(0, var25, var23);
						}
					}

					field146.method334(field258);

					if (!field259) {
						int var26 = field146.method342(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field146.method339(var27)) {
								field146.method332(2, (byte) 1, var27);
							}
						}
					}

					method27(80, "Unpacking media");
					field217 = new PQKEJITK(var6, "invback", 0);
					field219 = new PQKEJITK(var6, "chatback", 0);
					field218 = new PQKEJITK(var6, "mapback", 0);
					field287 = new PQKEJITK(var6, "backbase1", 0);
					field288 = new PQKEJITK(var6, "backbase2", 0);
					field289 = new PQKEJITK(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field193[var28] = new PQKEJITK(var6, "sideicons", var28);
					}

					field409 = new XANVNPIN(var6, "compass", 0);
					field519 = new XANVNPIN(var6, "mapedge", 0);
					field519.method526();

					for (int var29 = 0; var29 < 72; var29++) {
						field512[var29] = new PQKEJITK(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field246[var30] = new XANVNPIN(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field537[var31] = new XANVNPIN(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field153[var32] = new XANVNPIN(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field352[var33] = new XANVNPIN(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field140[var34] = new XANVNPIN(var6, "headicons_hint", var34);
					}

					field530 = new XANVNPIN(var6, "overlay_multiway", 0);
					field498 = new XANVNPIN(var6, "mapmarker", 0);
					field499 = new XANVNPIN(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field326[var35] = new XANVNPIN(var6, "cross", var35);
					}

					field209 = new XANVNPIN(var6, "mapdots", 0);
					field210 = new XANVNPIN(var6, "mapdots", 1);
					field211 = new XANVNPIN(var6, "mapdots", 2);
					field212 = new XANVNPIN(var6, "mapdots", 3);
					field213 = new XANVNPIN(var6, "mapdots", 4);
					field333 = new PQKEJITK(var6, "scrollbar", 0);
					field334 = new PQKEJITK(var6, "scrollbar", 1);
					field483 = new PQKEJITK(var6, "redstone1", 0);
					field484 = new PQKEJITK(var6, "redstone2", 0);
					field485 = new PQKEJITK(var6, "redstone3", 0);
					field486 = new PQKEJITK(var6, "redstone1", 0);
					field486.method387();
					field487 = new PQKEJITK(var6, "redstone2", 0);
					field487.method387();
					field379 = new PQKEJITK(var6, "redstone1", 0);
					field379.method388();
					field380 = new PQKEJITK(var6, "redstone2", 0);
					field380.method388();
					field381 = new PQKEJITK(var6, "redstone3", 0);
					field381.method388();
					field382 = new PQKEJITK(var6, "redstone1", 0);
					field382.method387();
					field382.method388();
					field383 = new PQKEJITK(var6, "redstone2", 0);
					field383.method387();
					field383.method388();

					for (int var36 = 0; var36 < 2; var36++) {
						field284[var36] = new PQKEJITK(var6, "mod_icons", var36);
					}

					XANVNPIN var37 = new XANVNPIN(var6, "backleft1", 0);
					field129 = new TRQPVNER(var37.field1393, method73(), var37.field1394);
					var37.method527(0, 0);
					XANVNPIN var38 = new XANVNPIN(var6, "backleft2", 0);
					field130 = new TRQPVNER(var38.field1393, method73(), var38.field1394);
					var38.method527(0, 0);
					XANVNPIN var39 = new XANVNPIN(var6, "backright1", 0);
					field131 = new TRQPVNER(var39.field1393, method73(), var39.field1394);
					var39.method527(0, 0);
					XANVNPIN var40 = new XANVNPIN(var6, "backright2", 0);
					field132 = new TRQPVNER(var40.field1393, method73(), var40.field1394);
					var40.method527(0, 0);
					XANVNPIN var41 = new XANVNPIN(var6, "backtop1", 0);
					field133 = new TRQPVNER(var41.field1393, method73(), var41.field1394);
					var41.method527(0, 0);
					XANVNPIN var42 = new XANVNPIN(var6, "backvmid1", 0);
					field134 = new TRQPVNER(var42.field1393, method73(), var42.field1394);
					var42.method527(0, 0);
					XANVNPIN var43 = new XANVNPIN(var6, "backvmid2", 0);
					field135 = new TRQPVNER(var43.field1393, method73(), var43.field1394);
					var43.method527(0, 0);
					XANVNPIN var44 = new XANVNPIN(var6, "backvmid3", 0);
					field136 = new TRQPVNER(var44.field1393, method73(), var44.field1394);
					var44.method527(0, 0);
					XANVNPIN var45 = new XANVNPIN(var6, "backhmid2", 0);
					field137 = new TRQPVNER(var45.field1393, method73(), var45.field1394);
					var45.method527(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field246[var50] != null) {
							field246[var50].method525(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field512[var50] != null) {
							field512[var50].method389(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method27(83, "Unpacking textures");
					AWNOLVYV.method7(var7);
					AWNOLVYV.method11(0.8D);
					AWNOLVYV.method6(20);
					method27(86, "Unpacking config");
					ZGXCNUJM.method597(var4);
					SRQVPDWQ.method447(var4);
					HCUFYAUI.method263(var4);
					JKSNDEQS.method290(var4);
					HEKJNUPL.method271(var4);
					CSHXCUHU.method169(var4);
					NGIGHQOG.method349(var4);
					SFNSVANZ.method412(var4);
					LVQCDTJA.method318(var4);
					JKSNDEQS.field762 = field258;

					if (!field259) {
						method27(90, "Unpacking sounds");
						byte[] var51 = var9.method246("sounds.dat", null);
						DNRIFKTO var52 = new DNRIFKTO(var51);
						MAPQLTQU.method320(var52);
					}

					method27(95, "Unpacking interfaces");
					EOVZRNPE[] var53 = new EOVZRNPE[] { field410, field411, field412, field413 };
					LUAMUNXO.method315(var5, var53, var6);
					method27(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field218.field1094[field218.field1096 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field102[var54] = var55;
						field490[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field218.field1094[field218.field1096 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field441[var58 - 5] = var59 - 25;
						field489[var58 - 5] = var60 - var59;
					}

					AWNOLVYV.method4(765, 503);
					field406 = AWNOLVYV.field32;
					AWNOLVYV.method4(479, 96);
					field403 = AWNOLVYV.field32;
					AWNOLVYV.method4(190, 261);
					field404 = AWNOLVYV.field32;
					AWNOLVYV.method4(512, 334);
					field405 = AWNOLVYV.field32;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = AWNOLVYV.field30[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					XSMXYXEY.method574(var62, 334, 512, 500, 800);
					ULPSDNZC.method462(var8);
					field195 = new CNFMYDSL(this);
					method86(field195, 10);
					OXCIEWBY.field1084 = this;
					SRQVPDWQ.field1228 = this;
					HEKJNUPL.field670 = this;
				} catch (Exception var73) {
					signlink.reporterror("loaderror " + field176 + " " + field347);
					field372 = true;
				}
			} else {
				field208 = true;
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method94() {
		field388 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field399) {
				field359++;
				method133();
				method133();
				method38();
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

		field388 = false;
	}

	@ObfuscatedName("client.n(B)V")
	public static final void method95() {
		XSMXYXEY.field1413 = true;
		AWNOLVYV.field21 = true;
		field259 = true;
		NSTMHEDV.field1044 = true;
		SRQVPDWQ.field1258 = true;
	}

	@ObfuscatedName("client.a(ILDNRIFKTO;B)V")
	public final void method96(int arg0, DNRIFKTO arg1) {
		for (int var3 = 0; var3 < field507; var3++) {
			int var4 = field508[var3];
			HHCKFJEO var5 = field504[var4];
			int var6 = arg1.method189();
			if ((var6 & 0x8) != 0) {
				var6 += arg1.method189() << 8;
			}

			method32(var5, arg1, var4, var6);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method97() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(LDNRIFKTO;IZ)V")
	public final void method98(DNRIFKTO arg0, int arg1) {
		arg0.method199();
		int var3 = arg0.method200(8);
		if (var3 < field274) {
			for (int var4 = var3; var4 < field274; var4++) {
				field421[field420++] = field275[var4];
			}
		}

		if (var3 > field274) {
			signlink.reporterror(field264 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field274 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field275[var5];
			DLNPJUEQ var7 = field273[var6];
			int var8 = arg0.method200(1);
			if (var8 == 0) {
				field275[field274++] = var6;
				var7.field67 = field402;
			} else {
				int var9 = arg0.method200(2);
				if (var9 == 0) {
					field275[field274++] = var6;
					var7.field67 = field402;
					field508[field507++] = var6;
				} else if (var9 == 1) {
					field275[field274++] = var6;
					var7.field67 = field402;
					int var10 = arg0.method200(3);
					var7.method19(var10, false);
					int var11 = arg0.method200(1);
					if (var11 == 1) {
						field508[field507++] = var6;
					}
				} else if (var9 == 2) {
					field275[field274++] = var6;
					var7.field67 = field402;
					int var12 = arg0.method200(3);
					var7.method19(var12, true);
					int var13 = arg0.method200(3);
					var7.method19(var13, true);
					int var14 = arg0.method200(1);
					if (var14 == 1) {
						field508[field507++] = var6;
					}
				} else if (var9 == 3) {
					field421[field420++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method99(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field268; var2++) {
			if (arg0.equalsIgnoreCase(field128[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field252.field698)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method100() {
		for (int var1 = 0; var1 < field461; var1++) {
			if (field241[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field456[var1] != field538 || field446[var1] != field150) {
						DNRIFKTO var3 = MAPQLTQU.method321(field456[var1], field446[var1]);
						if (System.currentTimeMillis() + var3.field563 / 22 > field511 / 22 + field260) {
							field511 = var3.field563;
							field260 = System.currentTimeMillis();

							if (method115(var3.field562, var3.field563)) {
								field538 = field456[var1];
								field150 = field446[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method112()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field241[var1] != -5) {
					field241[var1] = -5;
				} else {
					field461--;
					for (int var5 = var1; var5 < field461; var5++) {
						field456[var5] = field456[var5 + 1];
						field446[var5] = field446[var5 + 1];
						field241[var5] = field241[var5 + 1];
					}

					var1--;
				}
			} else {
				field241[var1]--;
			}
		}

		if (field488 > 0) {
			field488 -= 20;
			if (field488 < 0) {
				field488 = 0;
			}

			if (field488 == 0 && field462 && !field259) {
				field125 = field244;
				field126 = true;
				field146.method328(2, field125);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method101() {
		field267++;
		if (field267 > 191) {
			field267 = 0;
			field194.method178(123);
			field194.method183(0);
		}

		for (int var1 = 0; var1 < field274; var1++) {
			int var2 = field275[var1];
			DLNPJUEQ var3 = field273[var2];
			if (var3 != null) {
				method102(var3.field561.field652, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILBTOCNVPA;)V")
	public final void method102(int arg0, BTOCNVPA arg1) {
		if (arg1.field96 < 128 || arg1.field97 < 128 || arg1.field96 >= 13184 || arg1.field97 >= 13184) {
			arg1.field84 = -1;
			arg1.field55 = -1;
			arg1.field74 = 0;
			arg1.field75 = 0;
			arg1.field96 = arg1.field82[0] * 128 + arg1.field64 * 64;
			arg1.field97 = arg1.field83[0] * 128 + arg1.field64 * 64;
			arg1.method21();
		}

		if (field252 == arg1 && (arg1.field96 < 1536 || arg1.field97 < 1536 || arg1.field96 >= 11776 || arg1.field97 >= 11776)) {
			arg1.field84 = -1;
			arg1.field55 = -1;
			arg1.field74 = 0;
			arg1.field75 = 0;
			arg1.field96 = arg1.field82[0] * 128 + arg1.field64 * 64;
			arg1.field97 = arg1.field83[0] * 128 + arg1.field64 * 64;
			arg1.method21();
		}

		if (arg1.field74 > field402) {
			method103(arg1);
		} else if (arg1.field75 >= field402) {
			method104(arg1);
		} else {
			method105(arg1);
		}

		method106(arg1);
		method107(arg1);
	}

	@ObfuscatedName("client.a(ILBTOCNVPA;)V")
	public final void method103(BTOCNVPA arg0) {
		int var2 = arg0.field74 - field402;
		int var3 = arg0.field70 * 128 + arg0.field64 * 64;
		int var4 = arg0.field72 * 128 + arg0.field64 * 64;
		arg0.field96 += (var3 - arg0.field96) / var2;
		arg0.field97 += (var4 - arg0.field97) / var2;
		arg0.field95 = 0;

		if (arg0.field76 == 0) {
			arg0.field69 = 1024;
		}

		if (arg0.field76 == 1) {
			arg0.field69 = 1536;
		}

		if (arg0.field76 == 2) {
			arg0.field69 = 0;
		}

		if (arg0.field76 == 3) {
			arg0.field69 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLBTOCNVPA;)V")
	public final void method104(BTOCNVPA arg0) {
		if (field402 == arg0.field75 || arg0.field84 == -1 || arg0.field87 != 0 || arg0.field86 + 1 > ZGXCNUJM.field1481[arg0.field84].method598(arg0.field85)) {
			int var2 = arg0.field75 - arg0.field74;
			int var3 = field402 - arg0.field74;
			int var4 = arg0.field70 * 128 + arg0.field64 * 64;
			int var5 = arg0.field72 * 128 + arg0.field64 * 64;
			int var6 = arg0.field71 * 128 + arg0.field64 * 64;
			int var7 = arg0.field73 * 128 + arg0.field64 * 64;
			arg0.field96 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field97 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field95 = 0;

		if (arg0.field76 == 0) {
			arg0.field69 = 1024;
		}

		if (arg0.field76 == 1) {
			arg0.field69 = 1536;
		}

		if (arg0.field76 == 2) {
			arg0.field69 = 0;
		}

		if (arg0.field76 == 3) {
			arg0.field69 = 512;
		}

		arg0.field98 = arg0.field69;
	}

	@ObfuscatedName("client.a(LBTOCNVPA;I)V")
	public final void method105(BTOCNVPA arg0) {
		arg0.field45 = arg0.field62;
		if (arg0.field77 == 0) {
			arg0.field95 = 0;
		} else {
			if (arg0.field84 != -1 && arg0.field87 == 0) {
				ZGXCNUJM var2 = ZGXCNUJM.field1481[arg0.field84];
				if (arg0.field89 > 0 && var2.field1493 == 0) {
					arg0.field95++;
					return;
				}

				if (arg0.field89 <= 0 && var2.field1494 == 0) {
					arg0.field95++;
					return;
				}
			}

			int var3 = arg0.field96;
			int var4 = arg0.field97;
			int var5 = arg0.field82[arg0.field77 - 1] * 128 + arg0.field64 * 64;
			int var6 = arg0.field83[arg0.field77 - 1] * 128 + arg0.field64 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field69 = 1280;
					} else if (var4 > var6) {
						arg0.field69 = 1792;
					} else {
						arg0.field69 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field69 = 768;
					} else if (var4 > var6) {
						arg0.field69 = 256;
					} else {
						arg0.field69 = 512;
					}
				} else if (var4 < var6) {
					arg0.field69 = 1024;
				} else {
					arg0.field69 = 0;
				}

				int var7 = arg0.field69 - arg0.field98 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field52;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field51;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field54;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field53;
				}

				if (var8 == -1) {
					var8 = arg0.field51;
				}

				arg0.field45 = var8;
				int var9 = 4;
				if (arg0.field98 != arg0.field69 && arg0.field65 == -1 && arg0.field79 != 0) {
					var9 = 2;
				}

				if (arg0.field77 > 2) {
					var9 = 6;
				}

				if (arg0.field77 > 3) {
					var9 = 8;
				}

				if (arg0.field95 > 0 && arg0.field77 > 1) {
					var9 = 8;
					arg0.field95--;
				}

				if (arg0.field44[arg0.field77 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field51 == arg0.field45 && arg0.field94 != -1) {
					arg0.field45 = arg0.field94;
				}

				if (var3 < var5) {
					arg0.field96 += var9;
					if (arg0.field96 > var5) {
						arg0.field96 = var5;
					}
				} else if (var3 > var5) {
					arg0.field96 -= var9;
					if (arg0.field96 < var5) {
						arg0.field96 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field97 += var9;
					if (arg0.field97 > var6) {
						arg0.field97 = var6;
					}
				} else if (var4 > var6) {
					arg0.field97 -= var9;
					if (arg0.field97 < var6) {
						arg0.field97 = var6;
					}
				}

				if (arg0.field96 == var5 && arg0.field97 == var6) {
					arg0.field77--;

					if (arg0.field89 > 0) {
						arg0.field89--;
						return;
					}
				}
			} else {
				arg0.field96 = var5;
				arg0.field97 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ILBTOCNVPA;)V")
	public final void method106(BTOCNVPA arg0) {
		if (arg0.field79 != 0) {
			if (arg0.field65 != -1 && arg0.field65 < 32768) {
				DLNPJUEQ var2 = field273[arg0.field65];
				if (var2 != null) {
					int var3 = arg0.field96 - var2.field96;
					int var4 = arg0.field97 - var2.field97;
					if (var3 != 0 || var4 != 0) {
						arg0.field69 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field65 >= 32768) {
				int var5 = arg0.field65 - 32768;
				if (field478 == var5) {
					var5 = field503;
				}

				HHCKFJEO var6 = field504[var5];
				if (var6 != null) {
					int var7 = arg0.field96 - var6.field96;
					int var8 = arg0.field97 - var6.field97;
					if (var7 != 0 || var8 != 0) {
						arg0.field69 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field80 != 0 || arg0.field81 != 0) && (arg0.field77 == 0 || arg0.field95 > 0)) {
				int var9 = arg0.field96 - (arg0.field80 - field291 - field291) * 64;
				int var10 = arg0.field97 - (arg0.field81 - field292 - field292) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field69 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field80 = 0;
				arg0.field81 = 0;
			}

			int var11 = arg0.field69 - arg0.field98 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field79 || var11 > 2048 - arg0.field79) {
					arg0.field98 = arg0.field69;
				} else if (var11 > 1024) {
					arg0.field98 -= arg0.field79;
				} else {
					arg0.field98 += arg0.field79;
				}

				arg0.field98 &= 0x7FF;
				if (arg0.field62 == arg0.field45 && arg0.field98 != arg0.field69) {
					if (arg0.field63 != -1) {
						arg0.field45 = arg0.field63;
						return;
					}

					arg0.field45 = arg0.field51;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLBTOCNVPA;)V")
	public final void method107(BTOCNVPA arg0) {
		arg0.field61 = false;

		if (arg0.field45 != -1) {
			ZGXCNUJM var2 = ZGXCNUJM.field1481[arg0.field45];
			arg0.field47++;
			if (arg0.field46 < var2.field1482 && arg0.field47 > var2.method598(arg0.field46)) {
				arg0.field47 = 0;
				arg0.field46++;
			}

			if (arg0.field46 >= var2.field1482) {
				arg0.field47 = 0;
				arg0.field46 = 0;
			}
		}

		if (arg0.field55 != -1 && field402 >= arg0.field58) {
			if (arg0.field56 < 0) {
				arg0.field56 = 0;
			}

			ZGXCNUJM var3 = NGIGHQOG.field986[arg0.field55].field990;
			arg0.field57++;
			while (arg0.field56 < var3.field1482 && arg0.field57 > var3.method598(arg0.field56)) {
				arg0.field57 -= var3.method598(arg0.field56);
				arg0.field56++;
			}

			if (arg0.field56 >= var3.field1482 && (arg0.field56 < 0 || arg0.field56 >= var3.field1482)) {
				arg0.field55 = -1;
			}
		}

		if (arg0.field84 != -1 && arg0.field87 <= 1) {
			ZGXCNUJM var4 = ZGXCNUJM.field1481[arg0.field84];
			if (var4.field1493 == 1 && arg0.field89 > 0 && arg0.field74 <= field402 && arg0.field75 < field402) {
				arg0.field87 = 1;
				return;
			}
		}

		if (arg0.field84 != -1 && arg0.field87 == 0) {
			ZGXCNUJM var5 = ZGXCNUJM.field1481[arg0.field84];
			arg0.field86++;
			while (arg0.field85 < var5.field1482 && arg0.field86 > var5.method598(arg0.field85)) {
				arg0.field86 -= var5.method598(arg0.field85);
				arg0.field85++;
			}

			if (arg0.field85 >= var5.field1482) {
				arg0.field85 -= var5.field1486;
				arg0.field88++;
				if (arg0.field88 >= var5.field1492) {
					arg0.field84 = -1;
				}

				if (arg0.field85 < 0 || arg0.field85 >= var5.field1482) {
					arg0.field84 = -1;
				}
			}

			arg0.field61 = var5.field1488;
		}

		if (arg0.field87 > 0) {
			arg0.field87--;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method108() {
		if (field528 == -1) {
			if (field346) {
				method118();
				field346 = false;
				field129.method456(0, field781, 4);
				field130.method456(0, field781, 357);
				field131.method456(722, field781, 4);
				field132.method456(743, field781, 205);
				field133.method456(0, field781, 0);
				field134.method456(516, field781, 4);
				field135.method456(516, field781, 205);
				field136.method456(496, field781, 357);
				field137.method456(0, field781, 338);
				field340 = true;
				field188 = true;
				field239 = true;
				field277 = true;

				if (field522 != 2) {
					field357.method456(4, field781, 4);
					field356.method456(550, field781, 4);
				}
			}

			if (field522 == 2) {
				method122();
			}

			if (field363 && field473 == 1) {
				field340 = true;
			}

			if (field310 != -1) {
				boolean var2 = method166(field167, field310);
				if (var2) {
					field340 = true;
				}
			}

			if (field469 == 2) {
				field340 = true;
			}

			if (field368 == 2) {
				field340 = true;
			}

			if (field340) {
				method51();
				field340 = false;
			}

			if (field529 == -1) {
				field425.field858 = field276 - field434 - 77;

				if (field789 > 448 && field789 < 560 && field790 > 332) {
					method78(field789 - 17, 463, field276, field790 - 357, -1, 0, 77, field425);
				}

				int var3 = field276 - field425.field858 - 77;
				if (var3 < 0) {
					var3 = 0;
				}

				if (var3 > field276 - 77) {
					var3 = field276 - 77;
				}

				if (field434 != var3) {
					field434 = var3;
					field188 = true;
				}
			}

			if (field529 != -1) {
				boolean var4 = method166(field167, field529);
				if (var4) {
					field188 = true;
				}
			}

			if (field469 == 3) {
				field188 = true;
			}

			if (field368 == 3) {
				field188 = true;
			}

			if (field204 != null) {
				field188 = true;
			}

			if (field363 && field473 == 2) {
				field188 = true;
			}

			if (field188) {
				method60();
				field188 = false;
			}

			if (field522 == 2) {
				method34();
				field356.method456(550, field781, 4);
			}

			if (field514 != -1) {
				field239 = true;
			}

			if (field239) {
				if (field514 != -1 && field514 == field351) {
					field514 = -1;
					field194.method178(64);
					field194.method179(field351);
				}

				field239 = false;
				field198.method455();
				field289.method390(0, 0);

				if (field310 == -1) {
					if (field365[field351] != -1) {
						if (field351 == 0) {
							field483.method390(22, 10);
						}

						if (field351 == 1) {
							field484.method390(54, 8);
						}

						if (field351 == 2) {
							field484.method390(82, 8);
						}

						if (field351 == 3) {
							field485.method390(110, 8);
						}

						if (field351 == 4) {
							field487.method390(153, 8);
						}

						if (field351 == 5) {
							field487.method390(181, 8);
						}

						if (field351 == 6) {
							field486.method390(209, 9);
						}
					}

					if (field365[0] != -1 && (field514 != 0 || field402 % 20 < 10)) {
						field193[0].method390(29, 13);
					}

					if (field365[1] != -1 && (field514 != 1 || field402 % 20 < 10)) {
						field193[1].method390(53, 11);
					}

					if (field365[2] != -1 && (field514 != 2 || field402 % 20 < 10)) {
						field193[2].method390(82, 11);
					}

					if (field365[3] != -1 && (field514 != 3 || field402 % 20 < 10)) {
						field193[3].method390(115, 12);
					}

					if (field365[4] != -1 && (field514 != 4 || field402 % 20 < 10)) {
						field193[4].method390(153, 13);
					}

					if (field365[5] != -1 && (field514 != 5 || field402 % 20 < 10)) {
						field193[5].method390(180, 11);
					}

					if (field365[6] != -1 && (field514 != 6 || field402 % 20 < 10)) {
						field193[6].method390(208, 13);
					}
				}

				field198.method456(516, field781, 160);
				field197.method455();
				field288.method390(0, 0);

				if (field310 == -1) {
					if (field365[field351] != -1) {
						if (field351 == 7) {
							field379.method390(42, 0);
						}

						if (field351 == 8) {
							field380.method390(74, 0);
						}

						if (field351 == 9) {
							field380.method390(102, 0);
						}

						if (field351 == 10) {
							field381.method390(130, 1);
						}

						if (field351 == 11) {
							field383.method390(173, 0);
						}

						if (field351 == 12) {
							field383.method390(201, 0);
						}

						if (field351 == 13) {
							field382.method390(229, 0);
						}
					}

					if (field365[8] != -1 && (field514 != 8 || field402 % 20 < 10)) {
						field193[7].method390(74, 2);
					}

					if (field365[9] != -1 && (field514 != 9 || field402 % 20 < 10)) {
						field193[8].method390(102, 3);
					}

					if (field365[10] != -1 && (field514 != 10 || field402 % 20 < 10)) {
						field193[9].method390(137, 4);
					}

					if (field365[11] != -1 && (field514 != 11 || field402 % 20 < 10)) {
						field193[10].method390(174, 2);
					}

					if (field365[12] != -1 && (field514 != 12 || field402 % 20 < 10)) {
						field193[11].method390(201, 2);
					}

					if (field365[13] != -1 && (field514 != 13 || field402 % 20 < 10)) {
						field193[12].method390(226, 2);
					}
				}

				field197.method456(496, field781, 466);
				field357.method455();
				AWNOLVYV.field32 = field405;
			}

			if (field277) {
				field277 = false;
				field196.method455();
				field287.method390(0, 0);
				field411.method231("Public chat", true, 28, 0xFFFFFF, 55);

				if (field521 == 0) {
					field411.method231("On", true, 41, 0xFF00, 55);
				}

				if (field521 == 1) {
					field411.method231("Friends", true, 41, 0xFFFF00, 55);
				}

				if (field521 == 2) {
					field411.method231("Off", true, 41, 0xFF0000, 55);
				}

				if (field521 == 3) {
					field411.method231("Hide", true, 41, 0xFFFF, 55);
				}

				field411.method231("Private chat", true, 28, 0xFFFFFF, 184);

				if (field341 == 0) {
					field411.method231("On", true, 41, 0xFF00, 184);
				}

				if (field341 == 1) {
					field411.method231("Friends", true, 41, 0xFFFF00, 184);
				}

				if (field341 == 2) {
					field411.method231("Off", true, 41, 0xFF0000, 184);
				}

				field411.method231("Trade/compete", true, 28, 0xFFFFFF, 324);

				if (field416 == 0) {
					field411.method231("On", true, 41, 0xFF00, 324);
				}

				if (field416 == 1) {
					field411.method231("Friends", true, 41, 0xFFFF00, 324);
				}

				if (field416 == 2) {
					field411.method231("Off", true, 41, 0xFF0000, 324);
				}

				field411.method231("Report abuse", true, 33, 0xFFFFFF, 458);
				field196.method456(0, field781, 453);
				field357.method455();
				AWNOLVYV.field32 = field405;
			}

			field167 = 0;
		} else {
			method166(field167, field528);
			field167 = 0;
			method44();
			field782.method455();
			AWNOLVYV.field32 = field406;
			VDGJUQAS.method515();
			field346 = true;
			LUAMUNXO var1 = LUAMUNXO.method316(field528);
			if (var1.field872 == 512 && var1.field896 == 334 && var1.field873 == 0) {
				var1.field872 = 765;
				var1.field896 = 503;
			}

			method138(0, 0, var1, 0);

			if (field363) {
				method59();
			} else {
				method54();
				method134();
			}

			field782.method456(0, field781, 0);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method109() {
		if (field320 != 0) {
			EOVZRNPE var1 = field411;
			int var2 = 0;
			if (field371 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field325[var3] != null) {
					int var4 = field323[var3];
					String var5 = field324[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field341 == 0 || field341 == 1 && method99(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method234(var8, "From", 0, var7);
						var1.method234(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method232("From ");
						if (var6 == 1) {
							field284[0].method390(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field284[1].method390(var11, var7 - 12);
							var11 += 14;
						}

						var1.method234(var11, var5 + ": " + field325[var3], 0, var7);
						var1.method234(var11, var5 + ": " + field325[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field341 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method234(4, field325[var3], 0, var9);
						var1.method234(4, field325[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field341 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method234(4, "To " + var5 + ": " + field325[var3], 0, var10);
						var1.method234(4, "To " + var5 + ": " + field325[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILDNRIFKTO;I)V")
	public final void method110(int arg0, DNRIFKTO arg1) {
		field420 = 0;
		field507 = 0;
		method26(arg0, arg1);
		method140(arg0, arg1);
		method33(arg1, arg0);
		method96(arg0, arg1);

		for (int var3 = 0; var3 < field420; var3++) {
			int var4 = field421[var3];
			if (field402 != field504[var4].field67) {
				field504[var4] = null;
			}
		}

		if (arg1.field563 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field563 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field505; var5++) {
			if (field504[field506[var5]] == null) {
				signlink.reporterror(field264 + " null entry in pl list - pos:" + var5 + " size:" + field505);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field333.method390(arg4, arg2);
		field334.method390(arg4, arg2 + arg3 - 16);
		VDGJUQAS.method517(arg3 - 32, field216, arg4, 16, arg2 + 16);
		int var6 = (arg3 - 32) * arg3 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg1 / (arg0 - arg3);
		VDGJUQAS.method517(var6, field330, arg4, 16, arg2 + var7 + 16);
		VDGJUQAS.method522(field377, arg4, var6, arg2 + var7 + 16);
		VDGJUQAS.method522(field377, arg4 + 1, var6, arg2 + var7 + 16);
		VDGJUQAS.method520(arg2 + var7 + 16, 16, arg4, field377);
		VDGJUQAS.method520(arg2 + var7 + 17, 16, arg4, field377);
		VDGJUQAS.method522(field374, arg4 + 15, var6, arg2 + var7 + 16);
		VDGJUQAS.method522(field374, arg4 + 14, var6 - 1, arg2 + var7 + 17);
		VDGJUQAS.method520(arg2 + var7 + var6 + 15, 16, arg4, field374);
		VDGJUQAS.method520(arg2 + var7 + var6 + 14, 15, arg4 + 1, field374);
	}

	@ObfuscatedName("client.o(B)Z")
	public final boolean method112() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.s(I)V")
	public final void method113() {
		field240 = 0;
		int var1 = (field252.field96 >> 7) + field291;
		int var2 = (field252.field97 >> 7) + field292;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field240 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field240 = 1;
		}

		if (field240 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field240 = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method114() {
		for (QFKXENAK var1 = (QFKXENAK) field255.method592(); var1 != null; var1 = (QFKXENAK) field255.method594()) {
			if (field295 != var1.field1107 || var1.field1103) {
				var1.method1();
			} else if (field402 >= var1.field1104) {
				var1.method392(field167);

				if (var1.field1103) {
					var1.method1();
				} else {
					field115.method549(-1, var1, var1.field1109, 0, var1.field1110, 60, var1.field1108, false, var1.field1107);
				}
			}
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method115(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(ILHEKJNUPL;IIB)V")
	public final void method116(int arg0, HEKJNUPL arg1, int arg2, int arg3) {
		if (field541 < 400) {
			if (arg1.field636 != null) {
				arg1 = arg1.method272();
			}

			if (arg1 != null && arg1.field661) {
				String var5 = arg1.field654;
				if (arg1.field658 != 0) {
					var5 = var5 + method148(field252.field693, arg1.field658) + " (level-" + arg1.field658 + ")";
				}

				if (field451 == 1) {
					field283[field541] = "Use " + field455 + " with @yel@" + var5;
					field394[field541] = 850;
					field395[field541] = arg2;
					field392[field541] = arg0;
					field393[field541] = arg3;
					field541++;
				} else if (field168 != 1) {
					if (arg1.field640 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field640[var6] != null && !arg1.field640[var6].equalsIgnoreCase("attack")) {
								field283[field541] = arg1.field640[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field394[field541] = 111;
								}

								if (var6 == 1) {
									field394[field541] = 269;
								}

								if (var6 == 2) {
									field394[field541] = 625;
								}

								if (var6 == 3) {
									field394[field541] = 988;
								}

								if (var6 == 4) {
									field394[field541] = 359;
								}

								field395[field541] = arg2;
								field392[field541] = arg0;
								field393[field541] = arg3;
								field541++;
							}
						}
					}

					if (arg1.field640 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field640[var7] != null && arg1.field640[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field658 > field252.field693) {
									var8 = 2000;
								}

								field283[field541] = arg1.field640[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field394[field541] = var8 + 111;
								}

								if (var7 == 1) {
									field394[field541] = var8 + 269;
								}

								if (var7 == 2) {
									field394[field541] = var8 + 625;
								}

								if (var7 == 3) {
									field394[field541] = var8 + 988;
								}

								if (var7 == 4) {
									field394[field541] = var8 + 359;
								}

								field395[field541] = arg2;
								field392[field541] = arg0;
								field393[field541] = arg3;
								field541++;
							}
						}
					}

					field283[field541] = "Examine @yel@" + var5;
					field394[field541] = 1860;
					field395[field541] = arg2;
					field392[field541] = arg0;
					field393[field541] = arg3;
					field541++;
				} else if ((field170 & 0x2) == 2) {
					field283[field541] = field171 + " @yel@" + var5;
					field394[field541] = 283;
					field395[field541] = arg2;
					field392[field541] = arg0;
					field393[field541] = arg3;
					field541++;
					return;
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field784 != null) {
				return new URL("http://127.0.0.1:" + (field257 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = SNMMQNPZ.field1216[var7];
			int var13 = SNMMQNPZ.field1217[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = SNMMQNPZ.field1216[var8];
			int var16 = SNMMQNPZ.field1217[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field314 = arg2 - var9;
		field315 = arg0 - var10;
		field316 = arg3 - var11;
		field317 = arg5;
		field318 = arg1;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method118() {
		if (field358 == null) {
			method165();
			field782 = null;
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field226 = null;
			field227 = null;
			field228 = null;
			field229 = null;
			field358 = new TRQPVNER(479, method73(), 96);
			field356 = new TRQPVNER(172, method73(), 156);
			VDGJUQAS.method515();
			field218.method390(0, 0);
			field355 = new TRQPVNER(190, method73(), 261);
			field357 = new TRQPVNER(512, method73(), 334);
			VDGJUQAS.method515();
			field196 = new TRQPVNER(496, method73(), 50);
			field197 = new TRQPVNER(269, method73(), 37);
			field198 = new TRQPVNER(249, method73(), 45);
			field346 = true;
			field357.method455();
			AWNOLVYV.field32 = field405;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method119() {
		if (field371 > 1) {
			field371--;
		}

		if (field145 > 0) {
			field145--;
		}

		for (int var1 = 0; var1 < 5 && method66(); var1++) {
		}

		if (field480) {
			synchronized (field195.field545) {
				if (!field243) {
					field195.field542 = 0;
				} else if (field795 != 0 || field195.field542 >= 40) {
					field194.method178(147);
					field194.method179(0);
					int var3 = field194.field563;
					int var4 = 0;
					for (int var5 = 0; var5 < field195.field542 && var3 - field194.field563 < 240; var5++) {
						var4++;
						int var6 = field195.field547[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field195.field546[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field195.field547[var5] == -1 && field195.field546[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field174 != var7 || field175 != var6) {
							int var9 = var7 - field174;
							field174 = var7;
							int var10 = var6 - field175;
							field175 = var6;

							if (field220 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field194.method180((field220 << 12) + (var9 << 6) + var10);
								field220 = 0;
							} else if (field220 < 8) {
								field194.method182((field220 << 19) + var8 + 0x800000);
								field220 = 0;
							} else {
								field194.method183((field220 << 19) + var8 - 0x40000000);
								field220 = 0;
							}
						} else if (field220 < 2047) {
							field220++;
						}
					}

					field194.method188(field194.field563 - var3);

					if (var4 >= field195.field542) {
						field195.field542 = 0;
					} else {
						field195.field542 -= var4;
						for (int var11 = 0; var11 < field195.field542; var11++) {
							field195.field546[var11] = field195.field546[var4 + var11];
							field195.field547[var11] = field195.field547[var4 + var11];
						}
					}
				}
			}

			if (field795 != 0) {
				long var12 = (field798 - field398) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field398 = field798;
				int var14 = field797;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field796;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field795 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field194.method178(144);
				field194.method221((var17 << 19) + (var18 << 20) + var16);
			}

			if (field437 > 0) {
				field437--;
			}

			if (field799[1] == 1 || field799[2] == 1 || field799[3] == 1 || field799[4] == 1) {
				field438 = true;
			}

			if (field438 && field437 <= 0) {
				field437 = 20;
				field438 = false;
				field194.method178(232);
				field194.method212(field190);
				field194.method211(field189);
			}

			if (field786 && !field206) {
				field206 = true;
				field194.method178(199);
				field194.method179(1);
			}

			if (!field786 && field206) {
				field206 = false;
				field194.method178(199);
				field194.method179(0);
			}

			method36();
			method147();
			method100();
			field354++;
			if (field354 > 110) {
				field354 = 0;
				field194.method178(140);
				field194.method180(46885);
			}

			field143++;
			if (field143 > 750) {
				method132();
			}

			method43();
			method101();
			method82();
			field167++;

			if (field124 != 0) {
				field123 += 20;
				if (field123 >= 400) {
					field124 = 0;
				}
			}

			if (field469 != 0) {
				field466++;
				if (field466 >= 15) {
					if (field469 == 2) {
						field340 = true;
					}

					if (field469 == 3) {
						field188 = true;
					}

					field469 = 0;
				}
			}

			if (field368 != 0) {
				field245++;

				if (field789 > field369 + 5 || field789 < field369 - 5 || field790 > field370 + 5 || field790 < field370 - 5) {
					field339 = true;
				}

				if (field788 == 0) {
					if (field368 == 2) {
						field340 = true;
					}

					if (field368 == 3) {
						field188 = true;
					}

					field368 = 0;

					if (field339 && field245 >= 5) {
						field430 = -1;
						method54();

						if (field430 == field366 && field429 != field367) {
							LUAMUNXO var19 = LUAMUNXO.method316(field366);
							byte var20 = 0;
							if (field539 == 1 && var19.field833 == 206) {
								var20 = 1;
							}

							if (var19.field827[field429] <= 0) {
								var20 = 0;
							}

							if (var19.field886) {
								int var21 = field367;
								int var22 = field429;
								var19.field827[var22] = var19.field827[var21];
								var19.field899[var22] = var19.field899[var21];
								var19.field827[var21] = -1;
								var19.field899[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field367;
								int var24 = field429;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method317(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method317(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method317(field429, field367);
							}

							field194.method178(205);
							field194.method211(field366);
							field194.method179(var20);
							field194.method180(field367);
							field194.method180(field429);
						}
					} else if ((field298 == 1 || method131(field541 - 1)) && field541 > 2) {
						method31();
					} else if (field541 > 0) {
						method39(field541 - 1);
					}

					field466 = 10;
					field795 = 0;
				}
			}

			if (XSMXYXEY.field1447 != -1) {
				int var25 = XSMXYXEY.field1447;
				int var26 = XSMXYXEY.field1448;
				boolean var27 = method46(field252.field83[0], 0, true, var25, 0, var26, 0, 0, 0, field252.field82[0], 0);
				XSMXYXEY.field1447 = -1;

				if (var27) {
					field121 = field796;
					field122 = field797;
					field124 = 1;
					field123 = 0;
				}
			}

			if (field795 == 1 && field204 != null) {
				field204 = null;
				field188 = true;
				field795 = 0;
			}

			method141();

			if (field528 == -1) {
				method160();
				method90();
				method144();
			}

			if (field788 == 1 || field795 == 1) {
				field149++;
			}

			if (field522 == 2) {
				method150();
			}

			if (field522 == 2 && field540) {
				method50();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field500[var28]++;
			}

			method146();
			field787++;
			if (field787 > 4500) {
				field145 = 250;
				field787 -= 500;
				field194.method178(136);
			}

			field432++;
			if (field432 > 500) {
				field432 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field253 += field254;
				}

				if ((var29 & 0x2) == 2) {
					field154 += field155;
				}

				if ((var29 & 0x4) == 4) {
					field301 += field302;
				}
			}

			if (field253 < -50) {
				field254 = 2;
			}

			if (field253 > 50) {
				field254 = -2;
			}

			if (field154 < -55) {
				field155 = 2;
			}

			if (field154 > 55) {
				field155 = -2;
			}

			if (field301 < -40) {
				field302 = 1;
			}

			if (field301 > 40) {
				field302 = -1;
			}

			field345++;
			if (field345 > 500) {
				field345 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field426 += field427;
				}

				if ((var30 & 0x2) == 2) {
					field496 += field497;
				}
			}

			if (field426 < -60) {
				field427 = 2;
			}

			if (field426 > 60) {
				field427 = -2;
			}

			if (field496 < -20) {
				field497 = 1;
			}

			if (field496 > 10) {
				field497 = -1;
			}

			field144++;
			if (field144 > 50) {
				field194.method178(231);
			}

			try {
				if (field290 != null && field194.field563 > 0) {
					field290.method382(field194.field562, 0, field194.field563);
					field194.field563 = 0;
					field144 = 0;
				}
			} catch (IOException var32) {
				method132();
			} catch (Exception var33) {
				method45();
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method120() {
		field103 = 0;
		for (int var1 = -1; var1 < field505 + field274; var1++) {
			BTOCNVPA var2;
			if (var1 == -1) {
				var2 = field252;
			} else if (var1 < field505) {
				var2 = field504[field506[var1]];
			} else {
				var2 = field273[field275[var1 - field505]];
			}

			if (var2 != null && var2.method20()) {
				if (var2 instanceof DLNPJUEQ) {
					HEKJNUPL var3 = ((DLNPJUEQ) var2).field561;
					if (var3.field636 != null) {
						var3 = var3.method272();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field505) {
					HEKJNUPL var6 = ((DLNPJUEQ) var2).field561;
					if (var6.field665 >= 0 && var6.field665 < field352.length) {
						method123(var2, var2.field78 + 15);

						if (field181 > -1) {
							field352[var6.field665].method529(field181 - 12, field182 - 30);
						}
					}

					if (field327 == 1 && field275[var1 - field505] == field178 && field402 % 20 < 10) {
						method123(var2, var2.field78 + 15);

						if (field181 > -1) {
							field140[0].method529(field181 - 12, field182 - 28);
						}
					}
				} else {
					int var4 = 30;
					HHCKFJEO var5 = (HHCKFJEO) var2;
					if (var5.field682 != -1 || var5.field675 != -1) {
						method123(var2, var2.field78 + 15);

						if (field181 > -1) {
							if (var5.field682 != -1) {
								field153[var5.field682].method529(field181 - 12, field182 - var4);
								var4 += 25;
							}

							if (var5.field675 != -1) {
								field352[var5.field675].method529(field181 - 12, field182 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field327 == 10 && field506[var1] == field201) {
						method123(var2, var2.field78 + 15);

						if (field181 > -1) {
							field140[1].method529(field181 - 12, field182 - var4);
						}
					}
				}

				if (var2.field93 != null && (var1 >= field505 || field521 == 0 || field521 == 3 || field521 == 1 && method99(((HHCKFJEO) var2).field698))) {
					method123(var2, var2.field78);

					if (field181 > -1 && field103 < field104) {
						field108[field103] = field412.method233(var2.field93) / 2;
						field107[field103] = field412.field583;
						field105[field103] = field181;
						field106[field103] = field182;
						field109[field103] = var2.field60;
						field110[field103] = var2.field66;
						field111[field103] = var2.field68;
						field112[field103++] = var2.field93;

						if (field303 == 0 && var2.field66 >= 1 && var2.field66 <= 3) {
							field107[field103] += 10;
							field106[field103] += 5;
						}

						if (field303 == 0 && var2.field66 == 4) {
							field108[field103] = 60;
						}

						if (field303 == 0 && var2.field66 == 5) {
							field107[field103] += 5;
						}
					}
				}

				if (var2.field48 > field402) {
					method123(var2, var2.field78 + 15);

					if (field181 > -1) {
						int var7 = var2.field49 * 30 / var2.field50;
						if (var7 > 30) {
							var7 = 30;
						}

						VDGJUQAS.method517(5, 0xFF00, field181 - 15, var7, field182 - 3);
						VDGJUQAS.method517(5, 0xFF0000, field181 + var7 - 15, 30 - var7, field182 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field92[var8] > field402) {
						method123(var2, var2.field78 / 2);

						if (field181 > -1) {
							if (var8 == 1) {
								field182 -= 20;
							}

							if (var8 == 2) {
								field181 -= 15;
								field182 -= 10;
							}

							if (var8 == 3) {
								field181 += 15;
								field182 -= 10;
							}

							field537[var2.field91[var8]].method529(field181 - 12, field182 - 12);
							field410.method230(0, field181, String.valueOf(var2.field90[var8]), field182 + 4);
							field410.method230(0xFFFFFF, field181 - 1, String.valueOf(var2.field90[var8]), field182 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field103; var9++) {
			int var10 = field105[var9];
			int var11 = field106[var9];
			int var12 = field108[var9];
			int var13 = field107[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field106[var15] - field107[var15] && var11 - var13 < field106[var15] + 2 && var10 - var12 < field108[var15] + field105[var15] && var10 + var12 > field105[var15] - field108[var15] && field106[var15] - field107[var15] < var11) {
						var11 = field106[var15] - field107[var15];
						var14 = true;
					}
				}
			}

			field181 = field105[var9];
			field182 = field106[var9] = var11;
			String var16 = field112[var9];
			if (field303 == 0) {
				int var17 = 0xFFFF00;
				if (field109[var9] < 6) {
					var17 = field200[field109[var9]];
				}

				if (field109[var9] == 6) {
					var17 = field376 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field109[var9] == 7) {
					var17 = field376 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field109[var9] == 8) {
					var17 = field376 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field109[var9] == 9) {
					int var18 = 150 - field111[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field109[var9] == 10) {
					int var19 = 150 - field111[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field109[var9] == 11) {
					int var20 = 150 - field111[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field110[var9] == 0) {
					field412.method230(0, field181, var16, field182 + 1);
					field412.method230(var17, field181, var16, field182);
				}

				if (field110[var9] == 1) {
					field412.method235(0, var16, field182 + 1, field181, field376);
					field412.method235(var17, var16, field182, field181, field376);
				}

				if (field110[var9] == 2) {
					field412.method236(field182 + 1, var16, field181, field376, 0);
					field412.method236(field182, var16, field181, field376, var17);
				}

				if (field110[var9] == 3) {
					field412.method237(field182 + 1, field181, 0, 150 - field111[var9], var16, field376);
					field412.method237(field182, field181, var17, 150 - field111[var9], var16, field376);
				}

				if (field110[var9] == 4) {
					int var21 = field412.method233(var16);
					int var22 = (150 - field111[var9]) * (var21 + 100) / 150;
					VDGJUQAS.method514(field181 - 50, 0, 334, field181 + 50);
					field412.method234(field181 + 50 - var22, var16, 0, field182 + 1);
					field412.method234(field181 + 50 - var22, var16, var17, field182);
					VDGJUQAS.method513();
				}

				if (field110[var9] == 5) {
					int var23 = 150 - field111[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					VDGJUQAS.method514(0, field182 - field412.field583 - 1, field182 + 5, 512);
					field412.method230(0, field181, var16, field182 + var24 + 1);
					field412.method230(var17, field181, var16, field182 + var24);
					VDGJUQAS.method513();
				}
			} else {
				field412.method230(0, field181, var16, field182 + 1);
				field412.method230(0xFFFF00, field181, var16, field182);
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method121(long arg0) {
		if (arg0 != 0L) {
			if (field114 >= 100) {
				method136(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = JDMIWTSP.method282(JDMIWTSP.method279(arg0));
				for (int var4 = 0; var4 < field114; var4++) {
					if (field335[var4] == arg0) {
						method136(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field268; var5++) {
					if (field280[var5] == arg0) {
						method136(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field335[field114++] = arg0;
				field340 = true;
				field194.method178(85);
				field194.method185(arg0);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method122() {
		field376++;
		method75(true);
		method48(true);
		method75(false);
		method48(false);
		method65();
		method114();

		if (!field540) {
			int var1 = field189;
			if (field214 / 256 > var1) {
				var1 = field214 / 256;
			}

			if (field156[4] && field183[4] + 128 > var1) {
				var1 = field183[4] + 128;
			}

			int var2 = field301 + field190 & 0x7FF;
			method117(method83(field295, field252.field96, field252.field97) - 50, var2, field435, field436, var1 * 3 + 600, var1);
		}

		int var3;
		if (field540) {
			var3 = method154();
		} else {
			var3 = method153();
		}

		int var4 = field314;
		int var5 = field315;
		int var6 = field316;
		int var7 = field317;
		int var8 = field318;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field156[var9]) {
				int var10 = (int) (Math.random() * (field281[var9] * 2 + 1) + Math.sin(field177[var9] / 100.0D * field500[var9]) * field183[var9] - field281[var9]);
				if (var9 == 0) {
					field314 += var10;
				}

				if (var9 == 1) {
					field315 += var10;
				}

				if (var9 == 2) {
					field316 += var10;
				}

				if (var9 == 3) {
					field318 = field318 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field317 += var10;
					if (field317 < 128) {
						field317 = 128;
					}

					if (field317 > 383) {
						field317 = 383;
					}
				}
			}
		}

		int var11 = AWNOLVYV.field41;
		SNMMQNPZ.field1211 = true;
		SNMMQNPZ.field1214 = 0;
		SNMMQNPZ.field1212 = field789 - 4;
		SNMMQNPZ.field1213 = field790 - 4;
		VDGJUQAS.method515();
		field115.method577(field315, field314, field317, var3, field316, field318);
		field115.method552();
		method120();
		method137();
		method42(var11);
		method71();
		field357.method456(4, field781, 4);
		field314 = var4;
		field315 = var5;
		field316 = var6;
		field317 = var7;
		field318 = var8;
	}

	@ObfuscatedName("client.a(LBTOCNVPA;ZI)V")
	public final void method123(BTOCNVPA arg0, int arg1) {
		method124(arg1, arg0.field96, arg0.field97);
	}

	@ObfuscatedName("client.a(IIZI)V")
	public final void method124(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method83(field295, arg1, arg2) - arg0;
			arg1 -= field314;
			var4 -= field315;
			arg2 -= field316;
			int var5 = SNMMQNPZ.field1216[field317];
			int var6 = SNMMQNPZ.field1217[field317];
			int var7 = SNMMQNPZ.field1216[field318];
			int var8 = SNMMQNPZ.field1217[field318];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field181 = (var9 << 9) / arg2 + AWNOLVYV.field26;
				field182 = (var11 << 9) / arg2 + AWNOLVYV.field27;
			} else {
				field181 = -1;
				field182 = -1;
			}
		} else {
			field181 = -1;
			field182 = -1;
		}
	}

	@ObfuscatedName("client.a(ILHHCKFJEO;IBI)V")
	public final void method125(int arg0, HHCKFJEO arg1, int arg2, int arg3) {
		if (field252 != arg1 && field541 < 400) {
			String var5;
			if (arg1.field686 == 0) {
				var5 = arg1.field698 + method148(field252.field693, arg1.field693) + " (level-" + arg1.field693 + ")";
			} else {
				var5 = arg1.field698 + " (skill-" + arg1.field686 + ")";
			}

			if (field451 == 1) {
				field283[field541] = "Use " + field455 + " with @whi@" + var5;
				field394[field541] = 777;
				field395[field541] = arg3;
				field392[field541] = arg0;
				field393[field541] = arg2;
				field541++;
			} else if (field168 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field491[var6] != null) {
						field283[field541] = field491[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field491[var6].equalsIgnoreCase("attack")) {
							if (arg1.field693 > field252.field693) {
								var7 = 2000;
							}

							if (field252.field674 != 0 && arg1.field674 != 0) {
								if (field252.field674 == arg1.field674) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field492[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field394[field541] = var7 + 837;
						}

						if (var6 == 1) {
							field394[field541] = var7 + 446;
						}

						if (var6 == 2) {
							field394[field541] = var7 + 361;
						}

						if (var6 == 3) {
							field394[field541] = var7 + 349;
						}

						if (var6 == 4) {
							field394[field541] = var7 + 20;
						}

						field395[field541] = arg3;
						field392[field541] = arg0;
						field393[field541] = arg2;
						field541++;
					}
				}
			} else if ((field170 & 0x8) == 8) {
				field283[field541] = field171 + " @whi@" + var5;
				field394[field541] = 690;
				field395[field541] = arg3;
				field392[field541] = arg0;
				field393[field541] = arg2;
				field541++;
			}

			for (int var8 = 0; var8 < field541; var8++) {
				if (field394[var8] == 579) {
					field283[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method126(int arg0) {
		int[] var2 = field391.field1392;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field384[arg0][var7][var5] & 0x18) == 0) {
					field115.method573(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field384[arg0 + 1][var7][var5] & 0x8) != 0) {
					field115.method573(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field391.method524();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field384[arg0][var11][var10] & 0x18) == 0) {
					method159(var11, var10, var9, var8, arg0);
				}

				if (arg0 < 3 && (field384[arg0 + 1][var11][var10] & 0x8) != 0) {
					method159(var11, var10, var9, var8, arg0 + 1);
				}
			}
		}

		if (field357 != null) {
			field357.method455();
			AWNOLVYV.field32 = field405;
		}

		field270++;
		if (field270 > 82) {
			field270 = 0;
			field194.method178(155);
		}

		field157 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field115.method567(field295, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SRQVPDWQ.method445(var14).field1248;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field510[field295].field1310;
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

						field342[field157] = field246[var15];
						field158[field157] = var16;
						field159[field157] = var17;
						field157++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LDNRIFKTO;IZ)V")
	public final void method127(DNRIFKTO arg0, int arg1) {
		if (arg1 == 24) {
			int var3 = arg0.method189();
			int var4 = (var3 >> 4 & 0x7) + field138;
			int var5 = (var3 & 0x7) + field139;
			int var6 = var4 + arg0.method190();
			int var7 = var5 + arg0.method190();
			int var8 = arg0.method192();
			int var9 = arg0.method191();
			int var10 = arg0.method189() * 4;
			int var11 = arg0.method189() * 4;
			int var12 = arg0.method191();
			int var13 = arg0.method191();
			int var14 = arg0.method189();
			int var15 = arg0.method189();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 0xFFFF) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				KJLDUSCX var16 = new KJLDUSCX(field402 + var12, var11, var8, var5, var15, field295, var14, field402 + var13, var4, method83(field295, var4, var5) - var10, var9);
				var16.method303(field402 + var12, var6, method83(field295, var6, var7) - var11, var7);
				field251.method589(var16);
			}
		} else if (arg1 == 211) {
			int var17 = arg0.method207();
			int var18 = (var17 >> 4 & 0x7) + field138;
			int var19 = (var17 & 0x7) + field139;
			int var20 = arg0.method207();
			int var21 = var20 >> 2;
			int var22 = var20 & 0x3;
			int var23 = field407[var21];
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
				method76(var18, 0, var23, field295, var19, var22, var21, -1, -1);
			}
		} else if (arg1 == 253) {
			int var24 = arg0.method216();
			int var25 = arg0.method189();
			int var26 = (var25 >> 4 & 0x7) + field138;
			int var27 = (var25 & 0x7) + field139;
			int var28 = arg0.method214();
			int var29 = arg0.method216();
			if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field478 != var28) {
				ZCNDKOXC var30 = new ZCNDKOXC();
				var30.field1476 = var24;
				var30.field1477 = var29;

				if (field459[field295][var26][var27] == null) {
					field459[field295][var26][var27] = new ZCVCEQHJ();
				}

				field459[field295][var26][var27].method589(var30);
				method61(var26, var27);
			}
		} else if (arg1 == 77) {
			int var31 = arg0.method215();
			int var32 = arg0.method208();
			int var33 = (var32 >> 4 & 0x7) + field138;
			int var34 = (var32 & 0x7) + field139;
			int var35 = arg0.method189();
			int var36 = var35 >> 2;
			int var37 = var35 & 0x3;
			int var38 = field407[var36];
			if (var33 >= 0 && var34 >= 0 && var33 < 103 && var34 < 103) {
				int var39 = field385[field295][var33][var34];
				int var40 = field385[field295][var33 + 1][var34];
				int var41 = field385[field295][var33 + 1][var34 + 1];
				int var42 = field385[field295][var33][var34 + 1];
				if (var38 == 0) {
					ABMEGWYT var43 = field115.method560(var34, field295, var33);
					if (var43 != null) {
						int var44 = var43.field8 >> 14 & 0x7FFF;
						if (var36 == 2) {
							var43.field6 = new OXCIEWBY(var39, var40, var31, var37 + 4, var41, var44, var42, false, 2);
							var43.field7 = new OXCIEWBY(var39, var40, var31, var37 + 1 & 0x3, var41, var44, var42, false, 2);
						} else {
							var43.field6 = new OXCIEWBY(var39, var40, var31, var37, var41, var44, var42, false, var36);
						}
					}
				}

				if (var38 == 1) {
					ATLSOCLJ var45 = field115.method561(var34, var33, field295);
					if (var45 != null) {
						var45.field18 = new OXCIEWBY(var39, var40, var31, 0, var41, var45.field19 >> 14 & 0x7FFF, var42, false, 4);
					}
				}

				if (var38 == 2) {
					HJTTFSQF var46 = field115.method562(var34, field295, var33);

					if (var36 == 11) {
						var36 = 10;
					}

					if (var46 != null) {
						var46.field703 = new OXCIEWBY(var39, var40, var31, var37, var41, var46.field711 >> 14 & 0x7FFF, var42, false, var36);
					}
				}

				if (var38 == 3) {
					OPZZBTLK var47 = field115.method563(var33, field295, var34);
					if (var47 != null) {
						var47.field1075 = new OXCIEWBY(var39, var40, var31, var37, var41, var47.field1076 >> 14 & 0x7FFF, var42, false, 22);
					}
				}
			}
		} else if (arg1 == 52) {
			int var48 = arg0.method216();
			int var49 = arg0.method214();
			int var50 = arg0.method208();
			int var51 = (var50 >> 4 & 0x7) + field138;
			int var52 = (var50 & 0x7) + field139;
			if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
				ZCNDKOXC var53 = new ZCNDKOXC();
				var53.field1476 = var48;
				var53.field1477 = var49;

				if (field459[field295][var51][var52] == null) {
					field459[field295][var51][var52] = new ZCVCEQHJ();
				}

				field459[field295][var51][var52].method589(var53);
				method61(var51, var52);
			}
		} else if (arg1 == 197) {
			int var54 = arg0.method191();
			int var55 = arg0.method189();
			int var56 = (var55 >> 4 & 0x7) + field138;
			int var57 = (var55 & 0x7) + field139;
			int var58 = arg0.method189();
			int var59 = var58 >> 2;
			int var60 = var58 & 0x3;
			int var61 = field407[var59];
			if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
				method76(var56, 0, var61, field295, var57, var60, var59, -1, var54);
			}
		} else {
			if (arg1 == 185) {
				int var62 = arg0.method189();
				int var63 = (var62 >> 4 & 0x7) + field138;
				int var64 = (var62 & 0x7) + field139;
				int var65 = arg0.method191();
				int var66 = arg0.method189();
				int var67 = var66 >> 4 & 0xF;
				int var68 = var66 & 0x7;
				if (field252.field82[0] >= var63 - var67 && field252.field82[0] <= var63 + var67 && field252.field83[0] >= var64 - var67 && field252.field83[0] <= var64 + var67 && field479 && !field259 && field461 < 50) {
					field456[field461] = var65;
					field446[field461] = var68;
					field241[field461] = MAPQLTQU.field921[var65];
					field461++;
				}
			}

			if (arg1 == 87) {
				int var69 = arg0.method189();
				int var70 = (var69 >> 4 & 0x7) + field138;
				int var71 = (var69 & 0x7) + field139;
				int var72 = arg0.method191();
				int var73 = arg0.method191();
				int var74 = arg0.method191();
				if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
					ZCVCEQHJ var75 = field459[field295][var70][var71];
					if (var75 != null) {
						for (ZCNDKOXC var76 = (ZCNDKOXC) var75.method592(); var76 != null; var76 = (ZCNDKOXC) var75.method594()) {
							if ((var72 & 0x7FFF) == var76.field1476 && var76.field1477 == var73) {
								var76.field1477 = var74;
								break;
							}
						}

						method61(var70, var71);
					}
				}
			} else if (arg1 == 94) {
				int var77 = arg0.method189();
				int var78 = (var77 >> 4 & 0x7) + field138;
				int var79 = (var77 & 0x7) + field139;
				int var80 = arg0.method191();
				int var81 = arg0.method189();
				int var82 = arg0.method191();
				if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
					var78 = var78 * 128 + 64;
					var79 = var79 * 128 + 64;
					QFKXENAK var83 = new QFKXENAK(var80, var82, method83(field295, var78, var79) - var81, var79, field295, var78, field402);
					field255.method589(var83);
				}
			} else if (arg1 == 207) {
				int var84 = arg0.method215();
				int var85 = arg0.method214();
				byte var86 = arg0.method210();
				byte var87 = arg0.method209();
				int var88 = arg0.method191();
				int var89 = arg0.method208();
				int var90 = (var89 >> 4 & 0x7) + field138;
				int var91 = (var89 & 0x7) + field139;
				int var92 = arg0.method191();
				int var93 = arg0.method189();
				int var94 = var93 >> 2;
				int var95 = var93 & 0x3;
				int var96 = field407[var94];
				byte var97 = arg0.method190();
				byte var98 = arg0.method209();
				HHCKFJEO var99;
				if (field478 == var88) {
					var99 = field252;
				} else {
					var99 = field504[var88];
				}

				if (var99 != null) {
					SRQVPDWQ var100 = SRQVPDWQ.method445(var85);
					int var101 = field385[field295][var90][var91];
					int var102 = field385[field295][var90 + 1][var91];
					int var103 = field385[field295][var90 + 1][var91 + 1];
					int var104 = field385[field295][var90][var91 + 1];
					SNMMQNPZ var105 = var100.method446(var94, var95, var101, var102, var103, var104, -1);
					if (var105 != null) {
						method76(var90, var92 + 1, var96, field295, var91, 0, 0, var84 + 1, -1);
						var99.field691 = field402 + var92;
						var99.field692 = field402 + var84;
						var99.field681 = var105;
						int var106 = var100.field1239;
						int var107 = var100.field1238;
						if (var95 == 1 || var95 == 3) {
							var106 = var100.field1238;
							var107 = var100.field1239;
						}

						var99.field678 = var90 * 128 + var106 * 64;
						var99.field680 = var91 * 128 + var107 * 64;
						var99.field679 = method83(field295, var99.field678, var99.field680);

						if (var98 > var97) {
							byte var108 = var98;
							var98 = var97;
							var97 = var108;
						}

						if (var87 > var86) {
							byte var109 = var87;
							var87 = var86;
							var86 = var109;
						}

						var99.field687 = var90 + var98;
						var99.field689 = var90 + var97;
						var99.field688 = var87 + var91;
						var99.field690 = var86 + var91;
					}
				}
			} else if (arg1 == 212) {
				int var110 = arg0.method206();
				int var111 = (var110 >> 4 & 0x7) + field138;
				int var112 = (var110 & 0x7) + field139;
				int var113 = arg0.method214();
				if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
					ZCVCEQHJ var114 = field459[field295][var111][var112];
					if (var114 != null) {
						for (ZCNDKOXC var115 = (ZCNDKOXC) var114.method592(); var115 != null; var115 = (ZCNDKOXC) var114.method594()) {
							if ((var113 & 0x7FFF) == var115.field1476) {
								var115.method1();
								break;
							}
						}

						if (var114.method592() == null) {
							field459[field295][var111][var112] = null;
						}

						method61(var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method128() {
		for (XQZVTAMW var1 = (XQZVTAMW) field238.method592(); var1 != null; var1 = (XQZVTAMW) field238.method594()) {
			if (var1.field1404 == -1) {
				var1.field1405 = 0;
				method57(var1);
			} else {
				var1.method1();
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method129(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field268; var3++) {
				if (field280[var3] == arg0) {
					field268--;
					field340 = true;

					for (int var4 = var3; var4 < field268; var4++) {
						field128[var4] = field128[var4 + 1];
						field442[var4] = field442[var4 + 1];
						field280[var4] = field280[var4 + 1];
					}

					field194.method178(188);
					field194.method185(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LLUAMUNXO;I)Z")
	public final boolean method130(LUAMUNXO arg0) {
		int var2 = arg0.field833;
		if (field269 == 2) {
			if (var2 == 201) {
				field188 = true;
				field457 = 0;
				field400 = true;
				field299 = "";
				field513 = 1;
				field534 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field188 = true;
				field457 = 0;
				field400 = true;
				field299 = "";
				field513 = 2;
				field534 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field145 = 250;
			return true;
		}

		if (var2 == 501) {
			field188 = true;
			field457 = 0;
			field400 = true;
			field299 = "";
			field513 = 4;
			field534 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field188 = true;
			field457 = 0;
			field400 = true;
			field299 = "";
			field513 = 5;
			field534 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field116[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = CSHXCUHU.field553 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= CSHXCUHU.field553) {
							var5 = 0;
						}
					}

					if (!CSHXCUHU.field554[var5].field560 && CSHXCUHU.field554[var5].field555 == var3 + (field300 ? 0 : 7)) {
						break;
					}
				}

				field116[var3] = var5;
				field343 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field408[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field344[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field344[var6].length) {
					var8 = 0;
				}
			}

			field408[var6] = var8;
			field343 = true;
		}

		if (var2 == 324 && !field300) {
			field300 = true;
			method84();
		}

		if (var2 == 325 && field300) {
			field300 = false;
			method84();
		}

		if (var2 == 326) {
			field194.method178(154);
			field194.method179(field300 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field194.method179(field116[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field194.method179(field408[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field516 = !field516;
		}

		if (var2 >= 601 && var2 <= 613) {
			method152();

			if (field296.length() > 0) {
				field194.method178(192);
				field194.method185(JDMIWTSP.method278(field296));
				field194.method179(var2 - 601);
				field194.method179(field516 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(BI)Z")
	public final boolean method131(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field394[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 723) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method132() {
		if (field145 > 0) {
			method45();
		} else {
			if (field357 != null) {
				field357.method455();
				AWNOLVYV.field32 = field405;
				field411.method230(0, 257, "Connection lost", 144);
				field411.method230(0xFFFFFF, 256, "Connection lost", 143);
				field411.method230(0, 257, "Please wait - attempting to reestablish", 159);
				field411.method230(0xFFFFFF, 256, "Please wait - attempting to reestablish", 158);
				field357.method456(4, field781, 4);
			} else if (field782 != null) {
				field782.method455();
				AWNOLVYV.field32 = field406;
				field411.method230(0, 383, "Connection lost", 464);
				field411.method230(0xFFFFFF, 382, "Connection lost", 463);
				field411.method230(0, 383, "Please wait - attempting to reestablish", 479);
				field411.method230(0xFFFFFF, 382, "Please wait - attempting to reestablish", 478);
				field782.method456(0, field781, 0);
			}

			field431 = 0;
			field389 = 0;
			OAGIEZRU var1 = field290;
			field480 = false;
			field364 = 0;
			method41(field264, field265, true);

			if (!field480) {
				method45();
			}

			try {
				var1.method378();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method133() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field386[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field386[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field387[var10] = (field386[var10 - 1] + field386[var10 + 1] + field386[var10 - 128] + field386[var10 + 128]) / 4;
			}
		}

		field199 += 128;
		if (field199 > field119.length) {
			field199 -= field119.length;
			int var11 = (int) (Math.random() * 12.0D);
			method63(field494[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field387[var14 + 128] - field119[field199 + var14 & field119.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field386[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field321[var16] = field321[var16 + 1];
		}

		field321[var1 - 1] = (int) (Math.sin(field402 / 14.0D) * 16.0D + Math.sin(field402 / 15.0D) * 14.0D + Math.sin(field402 / 16.0D) * 12.0D);

		if (field331 > 0) {
			field331 -= 4;
		}

		if (field332 > 0) {
			field332 -= 4;
		}

		if (field331 == 0 && field332 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field331 = 1024;
			}

			if (var17 == 1) {
				field332 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method134() {
		if (field541 >= 2 || field451 != 0 || field168 != 0) {
			String var1;
			if (field451 == 1 && field541 < 2) {
				var1 = "Use " + field455 + " with...";
			} else if (field168 == 1 && field541 < 2) {
				var1 = field171 + "...";
			} else {
				var1 = field283[field541 - 1];
			}

			if (field541 > 2) {
				var1 = var1 + "@whi@ / " + (field541 - 2) + " more options";
			}

			field412.method239(4, var1, true, 15, field402 / 1000, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method135(int arg0) {
		LUAMUNXO.method312(arg0);
	}

	@ObfuscatedName("client.a(BILjava/lang/String;Ljava/lang/String;)V")
	public final void method136(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field179 != -1) {
			field204 = arg1;
			field795 = 0;
		}

		if (field529 == -1) {
			field188 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field323[var4] = field323[var4 - 1];
			field324[var4] = field324[var4 - 1];
			field325[var4] = field325[var4 - 1];
		}

		field323[0] = arg0;
		field324[0] = arg2;
		field325[0] = arg1;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method137() {
		if (field327 == 2) {
			method124(field306 * 2, (field304 - field291 << 7) + field307, (field305 - field292 << 7) + field308);

			if (field181 > -1 && field402 % 20 < 10) {
				field140[0].method529(field181 - 12, field182 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(IIILLUAMUNXO;I)V")
	public final void method138(int arg0, int arg1, LUAMUNXO arg2, int arg3) {
		if (arg2.field873 == 0 && arg2.field855 != null && (!arg2.field894 || field362 == arg2.field864 || field187 == arg2.field864 || field418 == arg2.field864)) {
			int var5 = VDGJUQAS.field1316;
			int var6 = VDGJUQAS.field1314;
			int var7 = VDGJUQAS.field1317;
			int var8 = VDGJUQAS.field1315;
			VDGJUQAS.method514(arg3, arg0, arg2.field896 + arg0, arg2.field872 + arg3);
			int var9 = arg2.field855.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field860[var10] + arg3;
				int var12 = arg2.field878[var10] + arg0 - arg1;
				LUAMUNXO var13 = LUAMUNXO.method316(arg2.field855[var10]);
				var11 += var13.field888;
				var12 += var13.field853;

				if (var13.field833 > 0) {
					method52(var13);
				}

				if (var13.field873 == 0) {
					if (var13.field858 > var13.field895 - var13.field896) {
						var13.field858 = var13.field895 - var13.field896;
					}

					if (var13.field858 < 0) {
						var13.field858 = 0;
					}

					method138(var12, var13.field858, var13, var11);

					if (var13.field895 > var13.field896) {
						method111(var13.field895, var13.field858, var12, var13.field896, var13.field872 + var11);
					}
				} else if (var13.field873 != 1) {
					if (var13.field873 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field896; var15++) {
							for (int var16 = 0; var16 < var13.field872; var16++) {
								int var17 = (var13.field834 + 32) * var16 + var11;
								int var18 = (var13.field882 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field859[var14];
									var18 += var13.field845[var14];
								}

								if (var13.field827[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field827[var14] - 1;
									if (var17 > VDGJUQAS.field1316 - 32 && var17 < VDGJUQAS.field1317 && var18 > VDGJUQAS.field1314 - 32 && var18 < VDGJUQAS.field1315 || field368 != 0 && field367 == var14) {
										int var22 = 0;
										if (field451 == 1 && field452 == var14 && field453 == var13.field864) {
											var22 = 0xFFFFFF;
										}

										XANVNPIN var23 = JKSNDEQS.method295(var22, var21, var13.field899[var14]);
										if (var23 != null) {
											if (field368 != 0 && field367 == var14 && field366 == var13.field864) {
												var19 = field789 - field369;
												var20 = field790 - field370;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field245 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method531(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < VDGJUQAS.field1314 && arg2.field858 > 0) {
													int var24 = (VDGJUQAS.field1314 - var18 - var20) * field167 / 3;
													if (var24 > field167 * 10) {
														var24 = field167 * 10;
													}

													if (var24 > arg2.field858) {
														var24 = arg2.field858;
													}

													arg2.field858 -= var24;
													field370 += var24;
												}

												if (var18 + var20 + 32 > VDGJUQAS.field1315 && arg2.field858 < arg2.field895 - arg2.field896) {
													int var25 = (var18 + var20 + 32 - VDGJUQAS.field1315) * field167 / 3;
													if (var25 > field167 * 10) {
														var25 = field167 * 10;
													}

													if (var25 > arg2.field895 - arg2.field896 - arg2.field858) {
														var25 = arg2.field895 - arg2.field896 - arg2.field858;
													}

													arg2.field858 += var25;
													field370 -= var25;
												}
											} else if (field469 != 0 && field468 == var14 && field467 == var13.field864) {
												var23.method531(var17, var18, 128);
											} else {
												var23.method529(var17, var18);
											}

											if (var23.field1397 == 33 || var13.field899[var14] != 1) {
												int var26 = var13.field899[var14];
												field410.method234(var17 + var19 + 1, method151(var26), 0, var18 + var20 + 10);
												field410.method234(var17 + var19, method151(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field837 != null && var14 < 20) {
									XANVNPIN var27 = var13.field837[var14];
									if (var27 != null) {
										var27.method529(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field873 == 3) {
						boolean var28 = false;
						if (field418 == var13.field864 || field187 == var13.field864 || field362 == var13.field864) {
							var28 = true;
						}

						int var29;
						if (method91(var13)) {
							var29 = var13.field889;
							if (var28 && var13.field884 != 0) {
								var29 = var13.field884;
							}
						} else {
							var29 = var13.field850;
							if (var28 && var13.field854 != 0) {
								var29 = var13.field854;
							}
						}

						if (var13.field847 == 0) {
							if (var13.field841) {
								VDGJUQAS.method517(var13.field896, var29, var11, var13.field872, var12);
							} else {
								VDGJUQAS.method518(var13.field896, var11, var29, var13.field872, var12);
							}
						} else if (var13.field841) {
							VDGJUQAS.method516(var13.field872, 256 - (var13.field847 & 0xFF), var13.field896, var11, var29, var12);
						} else {
							VDGJUQAS.method519(var13.field872, var11, var12, 256 - (var13.field847 & 0xFF), var29, var13.field896);
						}
					} else if (var13.field873 == 4) {
						EOVZRNPE var30 = var13.field865;
						String var31 = var13.field871;
						boolean var32 = false;
						if (field418 == var13.field864 || field187 == var13.field864 || field362 == var13.field864) {
							var32 = true;
						}

						int var33;
						if (method91(var13)) {
							var33 = var13.field889;
							if (var32 && var13.field884 != 0) {
								var33 = var13.field884;
							}

							if (var13.field868.length() > 0) {
								var31 = var13.field868;
							}
						} else {
							var33 = var13.field850;
							if (var32 && var13.field854 != 0) {
								var33 = var13.field854;
							}
						}

						if (var13.field851 == 6 && field531) {
							var31 = "Please wait...";
							var33 = var13.field850;
						}

						if (VDGJUQAS.field1312 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field583 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method87(method167(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method87(method167(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method87(method167(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method87(method167(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method87(method167(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field870) {
								var30.method231(var41, var13.field885, var34, var33, var13.field872 / 2 + var11);
							} else {
								var30.method238(var11, var41, var13.field885, var34, var33);
							}

							var34 += var30.field583;
						}
					} else if (var13.field873 == 5) {
						XANVNPIN var42;
						if (method91(var13)) {
							var42 = var13.field844;
						} else {
							var42 = var13.field877;
						}

						if (var42 != null) {
							var42.method529(var11, var12);
						}
					} else if (var13.field873 == 6) {
						int var43 = AWNOLVYV.field26;
						int var44 = AWNOLVYV.field27;
						AWNOLVYV.field26 = var13.field872 / 2 + var11;
						AWNOLVYV.field27 = var13.field896 / 2 + var12;
						int var45 = AWNOLVYV.field30[var13.field839] * var13.field838 >> 16;
						int var46 = AWNOLVYV.field31[var13.field839] * var13.field838 >> 16;
						boolean var47 = method91(var13);
						int var48;
						if (var47) {
							var48 = var13.field830;
						} else {
							var48 = var13.field829;
						}

						SNMMQNPZ var49;
						if (var48 == -1) {
							var49 = var13.method314(-1, var47, -1);
						} else {
							ZGXCNUJM var50 = ZGXCNUJM.field1481[var48];
							var49 = var13.method314(var50.field1483[var13.field861], var47, var50.field1484[var13.field861]);
						}

						if (var49 != null) {
							var49.method438(0, var13.field840, 0, var13.field839, 0, var45, var46);
						}

						AWNOLVYV.field26 = var43;
						AWNOLVYV.field27 = var44;
					} else {
						if (var13.field873 == 7) {
							EOVZRNPE var51 = var13.field865;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field896; var53++) {
								for (int var54 = 0; var54 < var13.field872; var54++) {
									if (var13.field827[var52] > 0) {
										JKSNDEQS var55 = JKSNDEQS.method293(var13.field827[var52] - 1);
										String var56 = var55.field729;
										if (var55.field749 || var13.field899[var52] != 1) {
											var56 = var56 + " x" + method55(var13.field899[var52]);
										}

										int var57 = (var13.field834 + 115) * var54 + var11;
										int var58 = (var13.field882 + 12) * var53 + var12;
										if (var13.field870) {
											var51.method231(var56, var13.field885, var58, var13.field850, var13.field872 / 2 + var57);
										} else {
											var51.method238(var57, var56, var13.field885, var58, var13.field850);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field873 == 8 && (field353 == var13.field864 || field160 == var13.field864 || field236 == var13.field864)) {
							int var59 = 0;
							int var60 = 0;
							EOVZRNPE var61 = field411;
							String var62 = var13.field871;
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

								int var65 = var61.method232(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field583 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field872 + var11 - var59 - 5;
							int var67 = var13.field896 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field872 + arg3) {
								var66 = arg2.field872 + arg3 - var59;
							}

							VDGJUQAS.method517(var60, 0xFFFFA0, var66, var59, var67);
							VDGJUQAS.method518(var60, var66, 0, var59, var67);
							String var68 = var13.field871;
							int var69 = var61.field583 + var67 + 2;
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

								var61.method238(var66 + 3, var71, false, var69, 0);
								var69 += var61.field583 + 1;
							}
						}
					}
				}
			}

			VDGJUQAS.method514(var5, var6, var8, var7);
		}
	}

	@ObfuscatedName("client.d(BI)V")
	public final void method139(int arg0) {
		int var2 = SFNSVANZ.field1132[arg0].field1140;
		if (var2 != 0) {
			int var3 = field532[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					AWNOLVYV.method11(0.9D);
				}

				if (var3 == 2) {
					AWNOLVYV.method11(0.8D);
				}

				if (var3 == 3) {
					AWNOLVYV.method11(0.7D);
				}

				if (var3 == 4) {
					AWNOLVYV.method11(0.6D);
				}

				JKSNDEQS.field725.method403();
				field346 = true;
			}

			if (var2 == 3) {
				boolean var4 = field462;

				if (var3 == 0) {
					method79(0, field462);
					field462 = true;
				}

				if (var3 == 1) {
					method79(-400, field462);
					field462 = true;
				}

				if (var3 == 2) {
					method79(-800, field462);
					field462 = true;
				}

				if (var3 == 3) {
					method79(-1200, field462);
					field462 = true;
				}

				if (var3 == 4) {
					field462 = false;
				}

				if (field462 != var4 && !field259) {
					if (field462) {
						field125 = field244;
						field126 = true;
						field146.method328(2, field125);
					} else {
						method97();
					}

					field488 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field479 = true;
					method142(0);
				}

				if (var3 == 1) {
					field479 = true;
					method142(-400);
				}

				if (var3 == 2) {
					field479 = true;
					method142(-800);
				}

				if (var3 == 3) {
					field479 = true;
					method142(-1200);
				}

				if (var3 == 4) {
					field479 = false;
				}
			}

			if (var2 == 5) {
				field298 = var3;
			}

			if (var2 == 6) {
				field303 = var3;
			}

			if (var2 == 8) {
				field320 = var3;
				field188 = true;
			}

			if (var2 == 9) {
				field539 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IILDNRIFKTO;)V")
	public final void method140(int arg0, DNRIFKTO arg1) {
		int var3 = arg1.method200(8);
		if (var3 < field505) {
			for (int var4 = var3; var4 < field505; var4++) {
				field421[field420++] = field506[var4];
			}
		}

		if (var3 > field505) {
			signlink.reporterror(field264 + " Too many players");
			throw new RuntimeException("eek");
		}

		field505 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field506[var5];
			HHCKFJEO var7 = field504[var6];
			int var8 = arg1.method200(1);
			if (var8 == 0) {
				field506[field505++] = var6;
				var7.field67 = field402;
			} else {
				int var9 = arg1.method200(2);
				if (var9 == 0) {
					field506[field505++] = var6;
					var7.field67 = field402;
					field508[field507++] = var6;
				} else if (var9 == 1) {
					field506[field505++] = var6;
					var7.field67 = field402;
					int var10 = arg1.method200(3);
					var7.method19(var10, false);
					int var11 = arg1.method200(1);
					if (var11 == 1) {
						field508[field507++] = var6;
					}
				} else if (var9 == 2) {
					field506[field505++] = var6;
					var7.field67 = field402;
					int var12 = arg1.method200(3);
					var7.method19(var12, true);
					int var13 = arg1.method200(3);
					var7.method19(var13, true);
					int var14 = arg1.method200(1);
					if (var14 == 1) {
						field508[field507++] = var6;
					}
				} else if (var9 == 3) {
					field421[field420++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method141() {
		if (field368 == 0) {
			int var1 = field795;
			if (field168 == 1 && field796 >= 516 && field797 >= 160 && field796 <= 765 && field797 <= 205) {
				var1 = 0;
			}

			if (field363) {
				if (var1 != 1) {
					int var2 = field789;
					int var3 = field790;
					if (field473 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field473 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field473 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field474 - 10 || var2 > field476 + field474 + 10 || var3 < field475 - 10 || var3 > field477 + field475 + 10) {
						field363 = false;

						if (field473 == 1) {
							field340 = true;
						}

						if (field473 == 2) {
							field188 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field474;
					int var5 = field475;
					int var6 = field476;
					int var7 = field796;
					int var8 = field797;
					if (field473 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field473 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field473 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field541; var10++) {
						int var11 = (field541 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method39(var9);
					}

					field363 = false;

					if (field473 == 1) {
						field340 = true;
					}

					if (field473 == 2) {
						field188 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field541 > 0) {
					int var12 = field394[field541 - 1];
					if (var12 == 959 || var12 == 433 || var12 == 18 || var12 == 601 || var12 == 511 || var12 == 871 || var12 == 164 || var12 == 137 || var12 == 503 || var12 == 914 || var12 == 711 || var12 == 1675) {
						int var13 = field392[field541 - 1];
						int var14 = field393[field541 - 1];
						LUAMUNXO var15 = LUAMUNXO.method316(var14);
						if (var15.field897 || var15.field886) {
							field339 = false;
							field245 = 0;
							field366 = var14;
							field367 = var13;
							field368 = 2;
							field369 = field796;
							field370 = field797;

							if (LUAMUNXO.method316(var14).field857 == field536) {
								field368 = 1;
							}

							if (LUAMUNXO.method316(var14).field857 == field529) {
								field368 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field298 == 1 || method131(field541 - 1)) && field541 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field541 > 0) {
					method39(field541 - 1);
				}

				if (var1 != 2 || field541 <= 0) {
					return;
				}

				method31();
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method142(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(IILDNRIFKTO;)V")
	public final void method143(int arg0, DNRIFKTO arg1) {
		for (int var3 = 0; var3 < field507; var3++) {
			int var4 = field508[var3];
			DLNPJUEQ var5 = field273[var4];
			int var6 = arg1.method189();
			if ((var6 & 0x8) != 0) {
				var5.field80 = arg1.method191();
				var5.field81 = arg1.method214();
			}

			if ((var6 & 0x1) != 0) {
				int var7 = arg1.method206();
				int var8 = arg1.method206();
				var5.method23(var8, var7, field402);
				var5.field48 = field402 + 300;
				var5.field49 = arg1.method207();
				var5.field50 = arg1.method207();
			}

			if ((var6 & 0x10) != 0) {
				var5.field561 = HEKJNUPL.method273(arg1.method214());
				var5.field64 = var5.field561.field652;
				var5.field79 = var5.field561.field644;
				var5.field51 = var5.field561.field653;
				var5.field52 = var5.field561.field646;
				var5.field53 = var5.field561.field647;
				var5.field54 = var5.field561.field668;
				var5.field62 = var5.field561.field666;
			}

			if ((var6 & 0x2) != 0) {
				var5.field55 = arg1.method216();
				int var9 = arg1.method224();
				var5.field59 = var9 >> 16;
				var5.field58 = (var9 & 0xFFFF) + field402;
				var5.field56 = 0;
				var5.field57 = 0;

				if (var5.field58 > field402) {
					var5.field56 = -1;
				}

				if (var5.field55 == 0xFFFF) {
					var5.field55 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var10 = arg1.method208();
				int var11 = arg1.method189();
				var5.method23(var11, var10, field402);
				var5.field48 = field402 + 300;
				var5.field49 = arg1.method206();
				var5.field50 = arg1.method207();
			}

			if ((var6 & 0x20) != 0) {
				var5.field93 = arg1.method196();
				var5.field68 = 100;
			}

			if ((var6 & 0x4) != 0) {
				var5.field65 = arg1.method191();
				if (var5.field65 == 0xFFFF) {
					var5.field65 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var12 = arg1.method215();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method206();
				if (var5.field84 == var12 && var12 != -1) {
					int var14 = ZGXCNUJM.field1481[var12].field1495;
					if (var14 == 1) {
						var5.field85 = 0;
						var5.field86 = 0;
						var5.field87 = var13;
						var5.field88 = 0;
					}

					if (var14 == 2) {
						var5.field88 = 0;
					}
				} else if (var12 == -1 || var5.field84 == -1 || ZGXCNUJM.field1481[var12].field1489 >= ZGXCNUJM.field1481[var5.field84].field1489) {
					var5.field84 = var12;
					var5.field85 = 0;
					var5.field86 = 0;
					var5.field87 = var13;
					var5.field88 = 0;
					var5.field89 = var5.field77;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method144() {
		if (field795 == 1) {
			if (field796 >= 6 && field796 <= 106 && field797 >= 467 && field797 <= 499) {
				field521 = (field521 + 1) % 4;
				field277 = true;
				field188 = true;
				field194.method178(235);
				field194.method179(field521);
				field194.method179(field341);
				field194.method179(field416);
			}

			if (field796 >= 135 && field796 <= 235 && field797 >= 467 && field797 <= 499) {
				field341 = (field341 + 1) % 3;
				field277 = true;
				field188 = true;
				field194.method178(235);
				field194.method179(field521);
				field194.method179(field341);
				field194.method179(field416);
			}

			if (field796 >= 273 && field796 <= 373 && field797 >= 467 && field797 <= 499) {
				field416 = (field416 + 1) % 3;
				field277 = true;
				field188 = true;
				field194.method178(235);
				field194.method179(field521);
				field194.method179(field341);
				field194.method179(field416);
			}

			if (field796 >= 412 && field796 <= 512 && field797 >= 467 && field797 <= 499) {
				if (field536 == -1) {
					method152();
					field296 = "";
					field516 = false;
					field458 = field536 = LUAMUNXO.field892;
					return;
				}

				method136(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method145(String arg0) {
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

	@ObfuscatedName("client.q(B)V")
	public final void method146() {
		field215++;
		if (field215 > 1849) {
			field215 = 0;
			field194.method178(131);
			field194.method179(0);
			int var1 = field194.field563;
			field194.method180(2104);

			if ((int) (Math.random() * 2.0D) == 0) {
				field194.method179(178);
			}

			field194.method179(92);
			field194.method180(12175);

			if ((int) (Math.random() * 2.0D) == 0) {
				field194.method179(56);
			}

			field194.method179(255);
			field194.method180(19906);
			field194.method180(49688);
			field194.method180(30019);
			field194.method179(185);
			field194.method188(field194.field563 - var1);
		}

		while (true) {
			int var2;
			do {
				while (true) {
					var2 = method301();
					if (var2 == -1) {
						return;
					}

					if (field536 != -1 && field536 == field458) {
						break;
					}

					if (field400) {
						if (var2 >= 32 && var2 <= 122 && field299.length() < 80) {
							field299 = field299 + (char) var2;
							field188 = true;
						}

						if (var2 == 8 && field299.length() > 0) {
							field299 = field299.substring(0, field299.length() - 1);
							field188 = true;
						}

						if (var2 == 13 || var2 == 10) {
							field400 = false;
							field188 = true;

							if (field513 == 1) {
								long var3 = JDMIWTSP.method278(field299);
								method161(var3);
							}

							if (field513 == 2 && field268 > 0) {
								long var5 = JDMIWTSP.method278(field299);
								method129(var5);
							}

							if (field513 == 3 && field299.length() > 0) {
								field194.method178(191);
								field194.method179(0);
								int var7 = field194.field563;
								field194.method185(field414);
								REROLFNU.method399(field299, field194);
								field194.method188(field194.field563 - var7);
								field299 = REROLFNU.method400(field299);
								field299 = ULPSDNZC.method472(field299);
								method136(6, field299, JDMIWTSP.method282(JDMIWTSP.method279(field414)));

								if (field341 == 2) {
									field341 = 1;
									field277 = true;
									field194.method178(235);
									field194.method179(field521);
									field194.method179(field341);
									field194.method179(field416);
								}
							}

							if (field513 == 4 && field114 < 100) {
								long var8 = JDMIWTSP.method278(field299);
								method121(var8);
							}

							if (field513 == 5 && field114 > 0) {
								long var10 = JDMIWTSP.method278(field299);
								method70(var10);
							}
						}
					} else if (field457 == 1) {
						if (var2 >= 48 && var2 <= 57 && field237.length() < 10) {
							field237 = field237 + (char) var2;
							field188 = true;
						}

						if (var2 == 8 && field237.length() > 0) {
							field237 = field237.substring(0, field237.length() - 1);
							field188 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field237.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(field237);
								} catch (Exception var22) {
								}

								field194.method178(102);
								field194.method183(var12);
							}

							field457 = 0;
							field188 = true;
						}
					} else if (field457 == 2) {
						if (var2 >= 32 && var2 <= 122 && field237.length() < 12) {
							field237 = field237 + (char) var2;
							field188 = true;
						}

						if (var2 == 8 && field237.length() > 0) {
							field237 = field237.substring(0, field237.length() - 1);
							field188 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field237.length() > 0) {
								field194.method178(236);
								field194.method185(JDMIWTSP.method278(field237));
							}

							field457 = 0;
							field188 = true;
						}
					} else if (field529 == -1) {
						if (var2 >= 32 && var2 <= 122 && field535.length() < 80) {
							field535 = field535 + (char) var2;
							field188 = true;
						}

						if (var2 == 8 && field535.length() > 0) {
							field535 = field535.substring(0, field535.length() - 1);
							field188 = true;
						}

						if ((var2 == 13 || var2 == 10) && field535.length() > 0) {
							if (field518 == 2) {
								if (field535.equals("::clientdrop")) {
									method132();
								}

								if (field535.equals("::lag")) {
									method72();
								}

								if (field535.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < field146.method342(2); var13++) {
										field146.method332(2, (byte) 1, var13);
									}
								}

								if (field535.equals("::fpson")) {
									field113 = true;
								}

								if (field535.equals("::fpsoff")) {
									field113 = false;
								}

								if (field535.equals("::noclip")) {
									for (int var14 = 0; var14 < 4; var14++) {
										for (int var15 = 1; var15 < 103; var15++) {
											for (int var16 = 1; var16 < 103; var16++) {
												field510[var14].field1310[var15][var16] = 0;
											}
										}
									}
								}
							}

							if (field535.startsWith("::")) {
								field194.method178(255);
								field194.method179(field535.length() - 1);
								field194.method186(field535.substring(2));
							} else {
								String var17 = field535.toLowerCase();
								byte var18 = 0;
								if (var17.startsWith("yellow:")) {
									var18 = 0;
									field535 = field535.substring(7);
								} else if (var17.startsWith("red:")) {
									var18 = 1;
									field535 = field535.substring(4);
								} else if (var17.startsWith("green:")) {
									var18 = 2;
									field535 = field535.substring(6);
								} else if (var17.startsWith("cyan:")) {
									var18 = 3;
									field535 = field535.substring(5);
								} else if (var17.startsWith("purple:")) {
									var18 = 4;
									field535 = field535.substring(7);
								} else if (var17.startsWith("white:")) {
									var18 = 5;
									field535 = field535.substring(6);
								} else if (var17.startsWith("flash1:")) {
									var18 = 6;
									field535 = field535.substring(7);
								} else if (var17.startsWith("flash2:")) {
									var18 = 7;
									field535 = field535.substring(7);
								} else if (var17.startsWith("flash3:")) {
									var18 = 8;
									field535 = field535.substring(7);
								} else if (var17.startsWith("glow1:")) {
									var18 = 9;
									field535 = field535.substring(6);
								} else if (var17.startsWith("glow2:")) {
									var18 = 10;
									field535 = field535.substring(6);
								} else if (var17.startsWith("glow3:")) {
									var18 = 11;
									field535 = field535.substring(6);
								}

								String var19 = field535.toLowerCase();
								byte var20 = 0;
								if (var19.startsWith("wave:")) {
									var20 = 1;
									field535 = field535.substring(5);
								} else if (var19.startsWith("wave2:")) {
									var20 = 2;
									field535 = field535.substring(6);
								} else if (var19.startsWith("shake:")) {
									var20 = 3;
									field535 = field535.substring(6);
								} else if (var19.startsWith("scroll:")) {
									var20 = 4;
									field535 = field535.substring(7);
								} else if (var19.startsWith("slide:")) {
									var20 = 5;
									field535 = field535.substring(6);
								}

								field194.method178(115);
								field194.method179(0);
								int var21 = field194.field563;
								field194.method205(var18);
								field272.field563 = 0;
								REROLFNU.method399(field535, field272);
								field194.method225(field272.field563, field272.field562, 0);
								field194.method205(var20);
								field194.method188(field194.field563 - var21);
								field535 = REROLFNU.method400(field535);
								field535 = ULPSDNZC.method472(field535);
								field252.field93 = field535;
								field252.field60 = var18;
								field252.field66 = var20;
								field252.field68 = 150;

								if (field518 == 2) {
									method136(2, field252.field93, "@cr2@" + field252.field698);
								} else if (field518 == 1) {
									method136(2, field252.field93, "@cr1@" + field252.field698);
								} else {
									method136(2, field252.field93, field252.field698);
								}

								if (field521 == 2) {
									field521 = 3;
									field277 = true;
									field194.method178(235);
									field194.method179(field521);
									field194.method179(field341);
									field194.method179(field416);
								}
							}

							field535 = "";
							field188 = true;
						}
					}
				}

				if (var2 == 8 && field296.length() > 0) {
					field296 = field296.substring(0, field296.length() - 1);
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);

			if (field296.length() < 12) {
				field296 = field296 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method147() {
		if (field522 == 2) {
			for (XQZVTAMW var1 = (XQZVTAMW) field238.method592(); var1 != null; var1 = (XQZVTAMW) field238.method594()) {
				if (var1.field1404 > 0) {
					var1.field1404--;
				}

				if (var1.field1404 != 0) {
					if (var1.field1405 > 0) {
						var1.field1405--;
					}

					if (var1.field1405 == 0 && var1.field1408 >= 1 && var1.field1409 >= 1 && var1.field1408 <= 102 && var1.field1409 <= 102 && (var1.field1410 < 0 || NSTMHEDV.method370(var1.field1412, var1.field1410))) {
						method64(var1.field1412, var1.field1408, var1.field1407, var1.field1411, var1.field1406, var1.field1409, var1.field1410);
						var1.field1405 = -1;

						if (var1.field1410 == var1.field1401 && var1.field1401 == -1) {
							var1.method1();
						} else if (var1.field1410 == var1.field1401 && var1.field1411 == var1.field1402 && var1.field1412 == var1.field1403) {
							var1.method1();
						}
					}
				} else if (var1.field1401 < 0 || NSTMHEDV.method370(var1.field1403, var1.field1401)) {
					method64(var1.field1403, var1.field1408, var1.field1407, var1.field1402, var1.field1406, var1.field1409, var1.field1401);
					var1.method1();
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method148(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IILXANVNPIN;B)V")
	public final void method149(int arg0, int arg1, XANVNPIN arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field426 + field190 & 0x7FF;
			int var6 = SNMMQNPZ.field1216[var5];
			int var7 = SNMMQNPZ.field1217[var5];
			var6 = var6 * 256 / (field496 + 256);
			var7 = var7 * 256 / (field496 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field519.method534(256, 15, 15, var12 + 94 + 4 - 10, 83 - var13 - 20, var10, 20, 20);
		} else {
			method77(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.s(B)V")
	public final void method150() {
		try {
			int var1 = field252.field96 + field253;
			int var2 = field252.field97 + field154;
			if (field435 - var1 < -500 || field435 - var1 > 500 || field436 - var2 < -500 || field436 - var2 > 500) {
				field435 = var1;
				field436 = var2;
			}

			if (field435 != var1) {
				field435 += (var1 - field435) / 16;
			}

			if (field436 != var2) {
				field436 += (var2 - field436) / 16;
			}

			if (field799[1] == 1) {
				field191 += (-field191 - 24) / 2;
			} else if (field799[2] == 1) {
				field191 += (24 - field191) / 2;
			} else {
				field191 /= 2;
			}

			if (field799[3] == 1) {
				field192 += (12 - field192) / 2;
			} else if (field799[4] == 1) {
				field192 += (-field192 - 12) / 2;
			} else {
				field192 /= 2;
			}

			field190 = field191 / 2 + field190 & 0x7FF;
			field189 += field192 / 2;
			if (field189 < 128) {
				field189 = 128;
			}

			if (field189 > 383) {
				field189 = 383;
			}

			int var3 = field435 >> 7;
			int var4 = field436 >> 7;
			int var5 = method83(field295, field435, field436);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field295;
						if (var9 < 3 && (field384[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field385[var9][var7][var8];
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

			if (var11 > field214) {
				field214 += (var11 - field214) / 24;
			} else if (var11 < field214) {
				field214 += (var11 - field214) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field252.field96 + "," + field252.field97 + "," + field435 + "," + field436 + "," + field328 + "," + field329 + "," + field291 + "," + field292);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method151(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.A(I)V")
	public final void method152() {
		field194.method178(36);

		if (field310 != -1) {
			method135(field310);
			field310 = -1;
			field340 = true;
			field531 = false;
			field239 = true;
		}

		if (field529 != -1) {
			method135(field529);
			field529 = -1;
			field188 = true;
			field531 = false;
		}

		if (field528 != -1) {
			method135(field528);
			field528 = -1;
			field346 = true;
		}

		if (field536 != -1) {
			method135(field536);
			field536 = -1;
		}
	}

	@ObfuscatedName("client.B(I)I")
	public final int method153() {
		int var1 = 3;
		if (field317 < 310) {
			int var2 = field314 >> 7;
			int var3 = field316 >> 7;
			int var4 = field252.field96 >> 7;
			int var5 = field252.field97 >> 7;

			if ((field384[field295][var2][var3] & 0x4) != 0) {
				var1 = field295;
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

					if ((field384[field295][var2][var3] & 0x4) != 0) {
						var1 = field295;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field384[field295][var2][var3] & 0x4) != 0) {
							var1 = field295;
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

					if ((field384[field295][var2][var3] & 0x4) != 0) {
						var1 = field295;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field384[field295][var2][var3] & 0x4) != 0) {
							var1 = field295;
						}
					}
				}
			}
		}

		if ((field384[field295][field252.field96 >> 7][field252.field97 >> 7] & 0x4) != 0) {
			var1 = field295;
		}

		return var1;
	}

	@ObfuscatedName("client.t(B)I")
	public final int method154() {
		int var1 = method83(field295, field314, field316);
		if (var1 - field315 < 800 && (field384[field295][field314 >> 7][field316 >> 7] & 0x4) != 0) {
			return field295;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IBLDNRIFKTO;)V")
	public final void method155(int arg0, DNRIFKTO arg1) {
		while (arg1.field564 + 21 < arg0 * 8) {
			int var3 = arg1.method200(14);
			if (var3 == 16383) {
				break;
			}

			if (field273[var3] == null) {
				field273[var3] = new DLNPJUEQ();
			}

			DLNPJUEQ var4 = field273[var3];
			field275[field274++] = var3;
			var4.field67 = field402;
			int var5 = arg1.method200(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method200(1);
			if (var6 == 1) {
				field508[field507++] = var3;
			}

			int var7 = arg1.method200(1);
			int var8 = arg1.method200(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field561 = HEKJNUPL.method273(arg1.method200(12));
			var4.field64 = var4.field561.field652;
			var4.field79 = var4.field561.field644;
			var4.field51 = var4.field561.field653;
			var4.field52 = var4.field561.field646;
			var4.field53 = var4.field561.field647;
			var4.field54 = var4.field561.field668;
			var4.field62 = var4.field561.field666;
			var4.method22(field252.field83[0] + var8, field252.field82[0] + var5, var7 == 1);
		}

		arg1.method201();
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method156(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field325[var4] != null) {
				int var5 = field323[var4];
				int var6 = field434 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field324[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field521 == 0 || field521 == 1 && method99(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field252.field698)) {
						if (field518 >= 1) {
							field283[field541] = "Report abuse @whi@" + var7;
							field394[field541] = 208;
							field541++;
						}

						field283[field541] = "Add ignore @whi@" + var7;
						field394[field541] = 64;
						field541++;
						field283[field541] = "Add friend @whi@" + var7;
						field394[field541] = 723;
						field541++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field320 == 0 && (var5 == 7 || field341 == 0 || field341 == 1 && method99(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field518 >= 1) {
							field283[field541] = "Report abuse @whi@" + var7;
							field394[field541] = 208;
							field541++;
						}

						field283[field541] = "Add ignore @whi@" + var7;
						field394[field541] = 64;
						field541++;
						field283[field541] = "Add friend @whi@" + var7;
						field394[field541] = 723;
						field541++;
					}

					var3++;
				}

				if (var5 == 4 && (field416 == 0 || field416 == 1 && method99(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field541] = "Accept trade @whi@" + var7;
						field394[field541] = 65;
						field541++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field320 == 0 && field341 < 2) {
					var3++;
				}

				if (var5 == 8 && (field416 == 0 || field416 == 1 && method99(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field541] = "Accept challenge @whi@" + var7;
						field394[field541] = 426;
						field541++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)Ljava/lang/String;")
	public final String method157() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field784 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method158() {
		byte[] var1 = field186.method246("title.dat", null);
		XANVNPIN var2 = new XANVNPIN(var1, this);
		field224.method455();
		var2.method527(0, 0);
		field225.method455();
		var2.method527(-637, 0);
		field221.method455();
		var2.method527(-128, 0);
		field222.method455();
		var2.method527(-202, -371);
		field223.method455();
		var2.method527(-202, -171);
		field226.method455();
		var2.method527(0, -265);
		field227.method455();
		var2.method527(-562, -265);
		field228.method455();
		var2.method527(-128, -171);
		field229.method455();
		var2.method527(-562, -171);
		int[] var3 = new int[var2.field1393];
		for (int var4 = 0; var4 < var2.field1394; var4++) {
			for (int var5 = 0; var5 < var2.field1393; var5++) {
				var3[var5] = var2.field1392[var2.field1393 * var4 + var2.field1393 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1393; var6++) {
				var2.field1392[var2.field1393 * var4 + var6] = var3[var6];
			}
		}

		field224.method455();
		var2.method527(382, 0);
		field225.method455();
		var2.method527(-255, 0);
		field221.method455();
		var2.method527(254, 0);
		field222.method455();
		var2.method527(180, -371);
		field223.method455();
		var2.method527(180, -171);
		field226.method455();
		var2.method527(382, -265);
		field227.method455();
		var2.method527(-180, -265);
		field228.method455();
		var2.method527(254, -171);
		field229.method455();
		var2.method527(-180, -171);
		XANVNPIN var7 = new XANVNPIN(field186, "logo", 0);
		field221.method455();
		var7.method529(382 - var7.field1393 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field115.method564(arg4, arg0, arg1);
		if (var6 != 0) {
			int var7 = field115.method568(arg4, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field391.field1392;
			int var12 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SRQVPDWQ var14 = SRQVPDWQ.method445(var13);
			if (var14.field1256 == -1) {
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
				PQKEJITK var15 = field512[var14.field1256];
				if (var15 != null) {
					int var16 = (var14.field1239 * 4 - var15.field1096) / 2;
					int var17 = (var14.field1238 * 4 - var15.field1097) / 2;
					var15.method390(arg0 * 4 + var16 + 48, (104 - arg1 - var14.field1238) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field115.method566(arg4, arg0, arg1);
		if (var18 != 0) {
			int var19 = field115.method568(arg4, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SRQVPDWQ var23 = SRQVPDWQ.method445(var22);
			if (var23.field1256 != -1) {
				PQKEJITK var24 = field512[var23.field1256];
				if (var24 != null) {
					int var25 = (var23.field1239 * 4 - var24.field1096) / 2;
					int var26 = (var23.field1238 * 4 - var24.field1097) / 2;
					var24.method390(arg0 * 4 + var25 + 48, (104 - arg1 - var23.field1238) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field391.field1392;
				int var29 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field115.method567(arg4, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SRQVPDWQ var32 = SRQVPDWQ.method445(var31);
			if (var32.field1256 != -1) {
				PQKEJITK var33 = field512[var32.field1256];
				if (var33 != null) {
					int var34 = (var32.field1239 * 4 - var33.field1096) / 2;
					int var35 = (var32.field1238 * 4 - var33.field1097) / 2;
					var33.method390(arg0 * 4 + var34 + 48, (104 - arg1 - var32.field1238) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	public final void run() {
		if (field242) {
			method94();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method160() {
		if (field431 == 0 && field795 == 1) {
			int var1 = field796 - 25 - 550;
			int var2 = field797 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field426 + field190 & 0x7FF;
				int var4 = AWNOLVYV.field30[var3];
				int var5 = AWNOLVYV.field31[var3];
				var4 = (field496 + 256) * var4 >> 8;
				var5 = (field496 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field252.field96 + var6 >> 7;
				int var9 = field252.field97 - var7 >> 7;
				boolean var10 = method46(field252.field83[0], 0, true, var8, 0, var9, 0, 0, 0, field252.field82[0], 1);
				if (var10) {
					field194.method179(var1);
					field194.method179(var2);
					field194.method180(field190);
					field194.method179(57);
					field194.method179(field426);
					field194.method179(field496);
					field194.method179(89);
					field194.method180(field252.field96);
					field194.method180(field252.field97);
					field194.method179(field423);
					field194.method179(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method161(long arg0) {
		if (arg0 != 0L) {
			if (field268 >= 100 && field266 != 1) {
				method136(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field268 >= 200) {
				method136(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = JDMIWTSP.method282(JDMIWTSP.method279(arg0));
				for (int var4 = 0; var4 < field268; var4++) {
					if (field280[var4] == arg0) {
						method136(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field114; var5++) {
					if (field335[var5] == arg0) {
						method136(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field252.field698)) {
					field128[field268] = var3;
					field280[field268] = arg0;
					field442[field268] = 0;
					field268++;
					field340 = true;
					field194.method178(70);
					field194.method185(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method162(String arg0) throws IOException {
		if (field148) {
			if (field262 != null) {
				try {
					field262.close();
				} catch (Exception var4) {
				}

				field262 = null;
			}

			field262 = method29(43595);
			field262.setSoTimeout(10000);
			InputStream var2 = field262.getInputStream();
			OutputStream var3 = field262.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.u(B)V")
	public final void method163() {
		if (field263 == 0) {
			int var1 = field779 / 2 - 80;
			int var2 = field780 / 2 + 20;
			var2 += 20;
			if (field795 == 1 && field796 >= var1 - 75 && field796 <= var1 + 75 && field797 >= var2 - 20 && field797 <= var2 + 20) {
				field263 = 3;
				field515 = 0;
			}

			int var3 = field779 / 2 + 80;
			if (field795 == 1 && field796 >= var3 - 75 && field796 <= var3 + 75 && field797 >= var2 - 20 && field797 <= var2 + 20) {
				field439 = "";
				field440 = "Enter your username & password.";
				field263 = 2;
				field515 = 0;
			}
		} else if (field263 == 2) {
			int var4 = field780 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field795 == 1 && field797 >= var4 - 15 && field797 < var4) {
				field515 = 0;
			}

			var4 += 15;
			if (field795 == 1 && field797 >= var4 - 15 && field797 < var4) {
				field515 = 1;
			}

			var4 += 15;
			int var5 = field779 / 2 - 80;
			int var6 = field780 / 2 + 50;
			var6 += 20;
			if (field795 == 1 && field796 >= var5 - 75 && field796 <= var5 + 75 && field797 >= var6 - 20 && field797 <= var6 + 20) {
				field364 = 0;
				method41(field264, field265, false);

				if (field480) {
					return;
				}
			}

			int var7 = field779 / 2 + 80;
			if (field795 == 1 && field796 >= var7 - 75 && field796 <= var7 + 75 && field797 >= var6 - 20 && field797 <= var6 + 20) {
				field263 = 0;
				field264 = "";
				field265 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method301();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field235.length(); var10++) {
					if (var8 == field235.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field515 == 0) {
					if (var8 == 8 && field264.length() > 0) {
						field264 = field264.substring(0, field264.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field515 = 1;
					}

					if (var9) {
						field264 = field264 + (char) var8;
					}

					if (field264.length() > 12) {
						field264 = field264.substring(0, 12);
					}
				} else if (field515 == 1) {
					if (var8 == 8 && field265.length() > 0) {
						field265 = field265.substring(0, field265.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field515 = 0;
					}

					if (var9) {
						field265 = field265 + (char) var8;
					}

					if (field265.length() > 20) {
						field265 = field265.substring(0, 20);
					}
				}
			}
		} else if (field263 == 3) {
			int var11 = field779 / 2;
			int var12 = field780 / 2 + 50;
			var12 += 20;
			if (field795 == 1 && field796 >= var11 - 75 && field796 <= var11 + 75 && field797 >= var12 - 20 && field797 <= var12 + 20) {
				field263 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method164(boolean arg0, byte[] arg1) {
		if (field462) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method165() {
		field399 = false;
		while (field388) {
			field399 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field184 = null;
		field185 = null;
		field494 = null;
		field162 = null;
		field163 = null;
		field164 = null;
		field165 = null;
		field119 = null;
		field120 = null;
		field386 = null;
		field387 = null;
		field151 = null;
		field152 = null;
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method166(int arg0, int arg1) {
		boolean var3 = false;
		LUAMUNXO var4 = LUAMUNXO.method316(arg1);
		for (int var5 = 0; var5 < var4.field855.length && var4.field855[var5] != -1; var5++) {
			LUAMUNXO var6 = LUAMUNXO.method316(var4.field855[var5]);
			if (var6.field873 == 1) {
				var3 |= method166(arg0, var6.field864);
			}

			if (var6.field873 == 6 && (var6.field829 != -1 || var6.field830 != -1)) {
				boolean var7 = method91(var6);
				int var8;
				if (var7) {
					var8 = var6.field830;
				} else {
					var8 = var6.field829;
				}

				if (var8 != -1) {
					ZGXCNUJM var9 = ZGXCNUJM.field1481[var8];
					var6.field836 += arg0;
					while (var6.field836 > var9.method598(var6.field861)) {
						var6.field836 -= var9.method598(var6.field861) + 1;
						var6.field861++;
						if (var6.field861 >= var9.field1482) {
							var6.field861 -= var9.field1486;
							if (var6.field861 < 0 || var6.field861 >= var9.field1482) {
								var6.field861 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field873 == 6 && var6.field867 != 0) {
				int var10 = var6.field867 >> 16;
				int var11 = var6.field867 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field839 = var6.field839 + var10 & 0x7FF;
				var6.field840 = var6.field840 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(ILLUAMUNXO;I)I")
	public final int method167(int arg0, LUAMUNXO arg1) {
		if (arg1.field893 == null || arg0 >= arg1.field893.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field893[arg0];
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
					var8 = field493[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field495[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field309[var3[var5++]];
				}

				if (var7 == 4) {
					LUAMUNXO var10 = LUAMUNXO.method316(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < JKSNDEQS.field768 && (!JKSNDEQS.method293(var11).field751 || field258)) {
						for (int var12 = 0; var12 < var10.field827.length; var12++) {
							if (var11 + 1 == var10.field827[var12]) {
								var8 += var10.field899[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field532[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field361[field495[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field532[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field252.field693;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < CEBVDRFM.field99; var13++) {
						if (CEBVDRFM.field101[var13]) {
							var8 += field495[var13];
						}
					}
				}

				if (var7 == 10) {
					LUAMUNXO var14 = LUAMUNXO.method316(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < JKSNDEQS.field768 && (!JKSNDEQS.method293(var15).field751 || field258)) {
						for (int var16 = 0; var16 < var14.field827.length; var16++) {
							if (var14.field827[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field173;
				}

				if (var7 == 12) {
					var8 = field207;
				}

				if (var7 == 13) {
					int var17 = field532[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					LVQCDTJA var20 = LVQCDTJA.field901[var19];
					int var21 = var20.field903;
					int var22 = var20.field904;
					int var23 = var20.field905;
					int var24 = field501[var23 - var22];
					var8 = field532[var21] >> var22 & var24;
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
					var8 = (field252.field96 >> 7) + field291;
				}

				if (var7 == 19) {
					var8 = (field252.field97 >> 7) + field292;
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

	@ObfuscatedName("client.F(I)V")
	public final void method168() {
		while (true) {
			COEBDAGX var1 = field146.method333();
			if (var1 == null) {
				return;
			}

			if (var1.field552 == 0) {
				SNMMQNPZ.method416(var1.field549, var1.field550);

				if ((field146.method338(var1.field549) & 0x62) != 0) {
					field340 = true;

					if (field529 != -1 || field179 != -1) {
						field188 = true;
					}
				}
			}

			if (var1.field552 == 1 && var1.field550 != null) {
				NLIOLBXV.method353(var1.field550);
			}

			if (var1.field552 == 2 && field125 == var1.field549 && var1.field550 != null) {
				method164(field126, var1.field550);
			}

			if (var1.field552 == 3 && field522 == 1) {
				for (int var2 = 0; var2 < field419.length; var2++) {
					if (field248[var2] == var1.field549) {
						field419[var2] = var1.field550;

						if (var1.field550 == null) {
							field248[var2] = -1;
						}

						break;
					}

					if (field249[var2] == var1.field549) {
						field417[var2] = var1.field550;

						if (var1.field550 == null) {
							field249[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field552 == 93 && field146.method327(var1.field549)) {
				NSTMHEDV.method357(new DNRIFKTO(var1.field550), field146);
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field361[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field501[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
