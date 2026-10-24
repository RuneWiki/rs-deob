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
public final class client extends DKKOWNCZ {

	@ObfuscatedName("client.Q")
	public int field72 = 78;

	@ObfuscatedName("client.U")
	public int[] field74 = new int[33];

	@ObfuscatedName("client.V")
	public int field75 = -1;

	@ObfuscatedName("client.X")
	public boolean field77 = false;

	@ObfuscatedName("client.ab")
	public int[] field80 = new int[7];

	@ObfuscatedName("client.db")
	public int field82 = -1;

	@ObfuscatedName("client.eb")
	public boolean field83 = false;

	@ObfuscatedName("client.nb")
	public int field91 = -1;

	@ObfuscatedName("client.ob")
	public int[] field92 = new int[33];

	@ObfuscatedName("client.tb")
	public volatile boolean field97 = false;

	@ObfuscatedName("client.ub")
	public int field98 = -1;

	@ObfuscatedName("client.yb")
	public EYTQJNEM[] field101 = new EYTQJNEM[1000];

	@ObfuscatedName("client.zb")
	public String field102 = "";

	@ObfuscatedName("client.Ab")
	public String field103 = "";

	@ObfuscatedName("client.Eb")
	public boolean field107 = false;

	@ObfuscatedName("client.Fb")
	public String field108 = "";

	@ObfuscatedName("client.Ib")
	public int field111 = 1;

	@ObfuscatedName("client.Jb")
	public boolean field112 = false;

	@ObfuscatedName("client.Kb")
	public String[] field113 = new String[200];

	@ObfuscatedName("client.Mb")
	public boolean field115 = false;

	@ObfuscatedName("client.Pb")
	public long[] field118 = new long[100];

	@ObfuscatedName("client.Sb")
	public boolean field120 = false;

	@ObfuscatedName("client.Tb")
	public boolean field121 = false;

	@ObfuscatedName("client.bc")
	public SWVPDERM field126 = new SWVPDERM();

	@ObfuscatedName("client.cc")
	public int[] field127 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.ic")
	public MUKVLYLC field132 = new MUKVLYLC(new byte[5000]);

	@ObfuscatedName("client.jc")
	public PNBDNSXO[] field133 = new PNBDNSXO[16384];

	@ObfuscatedName("client.lc")
	public int[] field135 = new int[16384];

	@ObfuscatedName("client.xc")
	public int field147 = -1;

	@ObfuscatedName("client.yc")
	public int[] field148 = new int[200];

	@ObfuscatedName("client.Gc")
	public CRC32 field156 = new CRC32();

	@ObfuscatedName("client.Ic")
	public TOROBAKX[] field157 = new TOROBAKX[100];

	@ObfuscatedName("client.Pc")
	public boolean field162 = true;

	@ObfuscatedName("client.bd")
	public boolean field174 = false;

	@ObfuscatedName("client.fd")
	public int[] field178 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.gd")
	public boolean field179 = false;

	@ObfuscatedName("client.md")
	public String field184 = "";

	@ObfuscatedName("client.td")
	public TOROBAKX[] field190 = new TOROBAKX[13];

	@ObfuscatedName("client.ud")
	public boolean field191 = false;

	@ObfuscatedName("client.wd")
	public boolean field192 = false;

	@ObfuscatedName("client.yd")
	public SWVPDERM field194 = new SWVPDERM();

	@ObfuscatedName("client.Gd")
	public int field201 = -1;

	@ObfuscatedName("client.Rd")
	public String[] field212 = new String[500];

	@ObfuscatedName("client.Zd")
	public boolean field220 = false;

	@ObfuscatedName("client.ae")
	public boolean[] field221 = new boolean[5];

	@ObfuscatedName("client.be")
	public boolean field222 = false;

	@ObfuscatedName("client.ie")
	public int[] field226 = new int[XYOGJTRE.field1432];

	@ObfuscatedName("client.je")
	public int[] field227 = new int[151];

	@ObfuscatedName("client.ne")
	public int[] field230 = new int[2000];

	@ObfuscatedName("client.oe")
	public int field231 = 0x766654;

	@ObfuscatedName("client.ue")
	public int field236 = 50;

	@ObfuscatedName("client.ve")
	public int[] field237 = new int[field236];

	@ObfuscatedName("client.we")
	public int[] field238 = new int[field236];

	@ObfuscatedName("client.xe")
	public int[] field239 = new int[field236];

	@ObfuscatedName("client.ye")
	public int[] field240 = new int[field236];

	@ObfuscatedName("client.ze")
	public int[] field241 = new int[field236];

	@ObfuscatedName("client.Ae")
	public int[] field242 = new int[field236];

	@ObfuscatedName("client.Be")
	public int[] field243 = new int[field236];

	@ObfuscatedName("client.Ce")
	public String[] field244 = new String[field236];

	@ObfuscatedName("client.De")
	public int[] field245 = new int[4000];

	@ObfuscatedName("client.Ee")
	public int[] field246 = new int[4000];

	@ObfuscatedName("client.Fe")
	public int field247 = -1;

	@ObfuscatedName("client.Ie")
	public boolean field250 = false;

	@ObfuscatedName("client.Je")
	public String field251 = "";

	@ObfuscatedName("client.Ue")
	public int field262 = -1;

	@ObfuscatedName("client.Ze")
	public MUKVLYLC field265 = MUKVLYLC.method280(1);

	@ObfuscatedName("client.jf")
	public boolean field273 = false;

	@ObfuscatedName("client.kf")
	public int[] field274 = new int[5];

	@ObfuscatedName("client.tf")
	public TOROBAKX[] field283 = new TOROBAKX[2];

	@ObfuscatedName("client.uf")
	public String field284 = "";

	@ObfuscatedName("client.wf")
	public boolean field286 = true;

	@ObfuscatedName("client.xf")
	public DQPGJUSB[] field287 = new DQPGJUSB[5];

	@ObfuscatedName("client.yf")
	public int[] field288 = new int[50];

	@ObfuscatedName("client.zf")
	public int[] field289 = new int[50];

	@ObfuscatedName("client.Af")
	public int[] field290 = new int[256];

	@ObfuscatedName("client.Bf")
	public int[] field291 = new int[100];

	@ObfuscatedName("client.Cf")
	public String[] field292 = new String[100];

	@ObfuscatedName("client.Df")
	public String[] field293 = new String[100];

	@ObfuscatedName("client.Ef")
	public SWVPDERM field294 = new SWVPDERM();

	@ObfuscatedName("client.Gf")
	public int[] field295 = new int[5];

	@ObfuscatedName("client.Of")
	public int[][] field301 = new int[104][104];

	@ObfuscatedName("client.Xf")
	public boolean field310 = false;

	@ObfuscatedName("client.ag")
	public boolean field313 = true;

	@ObfuscatedName("client.gg")
	public int[] field319 = new int[50];

	@ObfuscatedName("client.hg")
	public boolean field320 = false;

	@ObfuscatedName("client.ig")
	public int[][] field321 = new int[104][104];

	@ObfuscatedName("client.lg")
	public int field324 = 2;

	@ObfuscatedName("client.pg")
	public int field326 = 128;

	@ObfuscatedName("client.vg")
	public final int[] field331 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Kg")
	public int field346 = 2;

	@ObfuscatedName("client.Qg")
	public int field351 = 0x332D25;

	@ObfuscatedName("client.Rg")
	public int field352 = -1;

	@ObfuscatedName("client.Tg")
	public int field354 = 1;

	@ObfuscatedName("client.Vg")
	public int[][] field355 = new int[104][104];

	@ObfuscatedName("client.Zg")
	public byte[] field358 = new byte[16384];

	@ObfuscatedName("client.ah")
	public EYTQJNEM[] field359 = new EYTQJNEM[100];

	@ObfuscatedName("client.ch")
	public MUKVLYLC field361 = MUKVLYLC.method280(1);

	@ObfuscatedName("client.dh")
	public int field362 = 2048;

	@ObfuscatedName("client.eh")
	public int field363 = 2047;

	@ObfuscatedName("client.fh")
	public HPYXKOFA[] field364 = new HPYXKOFA[field362];

	@ObfuscatedName("client.hh")
	public int[] field366 = new int[field362];

	@ObfuscatedName("client.jh")
	public int[] field368 = new int[field362];

	@ObfuscatedName("client.kh")
	public MUKVLYLC[] field369 = new MUKVLYLC[field362];

	@ObfuscatedName("client.lh")
	public int field370 = -1;

	@ObfuscatedName("client.mh")
	public final int field371 = 100;

	@ObfuscatedName("client.nh")
	public int[] field372 = new int[100];

	@ObfuscatedName("client.ph")
	public String[] field373 = new String[5];

	@ObfuscatedName("client.qh")
	public boolean[] field374 = new boolean[5];

	@ObfuscatedName("client.rh")
	public int field375 = -1;

	@ObfuscatedName("client.sh")
	public int[] field376 = new int[2000];

	@ObfuscatedName("client.yh")
	public int[] field382 = new int[5];

	@ObfuscatedName("client.Mh")
	public int[] field396 = new int[1000];

	@ObfuscatedName("client.Nh")
	public int[] field397 = new int[1000];

	@ObfuscatedName("client.Qh")
	public MUKVLYLC field400 = MUKVLYLC.method280(1);

	@ObfuscatedName("client.Th")
	public String field402 = "";

	@ObfuscatedName("client.Uh")
	public String field403 = "";

	@ObfuscatedName("client.Vh")
	public boolean field404 = false;

	@ObfuscatedName("client.Xh")
	public int[][][] field406 = new int[4][13][13];

	@ObfuscatedName("client.Yh")
	public EYTQJNEM[] field407 = new EYTQJNEM[20];

	@ObfuscatedName("client.ai")
	public UKJEXUVU field409 = new UKJEXUVU();

	@ObfuscatedName("client.ei")
	public boolean field413 = true;

	@ObfuscatedName("client.fi")
	public boolean field414 = true;

	@ObfuscatedName("client.mi")
	public MNHXSMWL[] field421 = new MNHXSMWL[4];

	@ObfuscatedName("client.oi")
	public int[] field423 = new int[1000];

	@ObfuscatedName("client.xi")
	public boolean field431 = false;

	@ObfuscatedName("client.Hi")
	public int field440 = 0x4D4233;

	@ObfuscatedName("client.Ii")
	public int field441 = 0x23201B;

	@ObfuscatedName("client.Ji")
	public int[] field442 = new int[500];

	@ObfuscatedName("client.Ki")
	public int[] field443 = new int[500];

	@ObfuscatedName("client.Li")
	public int[] field444 = new int[500];

	@ObfuscatedName("client.Mi")
	public int[] field445 = new int[500];

	@ObfuscatedName("client.Ni")
	public int[] field446 = new int[9];

	@ObfuscatedName("client.Si")
	public volatile boolean field449 = false;

	@ObfuscatedName("client.Vi")
	public String field451 = "";

	@ObfuscatedName("client.Xi")
	public int field453 = -1;

	@ObfuscatedName("client.Zi")
	public boolean field455 = false;

	@ObfuscatedName("client.bj")
	public EYTQJNEM[] field457 = new EYTQJNEM[8];

	@ObfuscatedName("client.cj")
	public EYTQJNEM[] field458 = new EYTQJNEM[20];

	@ObfuscatedName("client.dj")
	public int[] field459 = new int[151];

	@ObfuscatedName("client.gj")
	public boolean field461 = false;

	@ObfuscatedName("client.hj")
	public SWVPDERM[][][] field462 = new SWVPDERM[4][104][104];

	@ObfuscatedName("client.jj")
	public boolean field464 = false;

	@ObfuscatedName("client.lj")
	public int field466 = 2;

	@ObfuscatedName("client.mj")
	public int[] field467 = new int[5];

	@ObfuscatedName("client.nj")
	public int field468 = -1;

	@ObfuscatedName("client.oj")
	public int field469 = -1;

	@ObfuscatedName("client.pj")
	public int[] field470 = new int[XYOGJTRE.field1432];

	@ObfuscatedName("client.vj")
	public int field476 = 3;

	@ObfuscatedName("client.Ej")
	public int[] field484 = new int[5];

	@ObfuscatedName("client.Fj")
	public volatile boolean field485 = false;

	@ObfuscatedName("client.Gj")
	public int[] field486 = new int[XYOGJTRE.field1432];

	@ObfuscatedName("client.Hj")
	public long[] field487 = new long[200];

	@ObfuscatedName("client.Z")
	public static String field79 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Lb")
	public static int[] field114 = new int[32];

	@ObfuscatedName("client.Ob")
	public static int[] field117 = new int[99];

	@ObfuscatedName("client.ld")
	public static final int[] field183 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Me")
	public static final int[][] field254 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Fg")
	public static int field341 = 10;

	@ObfuscatedName("client.Hg")
	public static boolean field343 = true;

	@ObfuscatedName("client.Wg")
	public static BigInteger field356 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Wh")
	public static BigInteger field405 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.xb")
	public int field100;

	@ObfuscatedName("client.Bb")
	public int field104;

	@ObfuscatedName("client.Cb")
	public int field105;

	@ObfuscatedName("client.Db")
	public int field106;

	@ObfuscatedName("client.Gb")
	public int field109;

	@ObfuscatedName("client.Hb")
	public int field110;

	@ObfuscatedName("client.Nb")
	public int field116;

	@ObfuscatedName("client.Rb")
	public static int field119;

	@ObfuscatedName("client.Xb")
	public int field122;

	@ObfuscatedName("client.Yb")
	public int field123;

	@ObfuscatedName("client.Zb")
	public int field124;

	@ObfuscatedName("client.ac")
	public int field125;

	@ObfuscatedName("client.kc")
	public int field134;

	@ObfuscatedName("client.mc")
	public int field136;

	@ObfuscatedName("client.nc")
	public static int field137;

	@ObfuscatedName("client.pc")
	public int field139;

	@ObfuscatedName("client.qc")
	public int field140;

	@ObfuscatedName("client.rc")
	public int field141;

	@ObfuscatedName("client.sc")
	public int field142;

	@ObfuscatedName("client.tc")
	public int field143;

	@ObfuscatedName("client.uc")
	public int field144;

	@ObfuscatedName("client.zc")
	public int field149;

	@ObfuscatedName("client.Ac")
	public int field150;

	@ObfuscatedName("client.Bc")
	public int field151;

	@ObfuscatedName("client.Dc")
	public int field153;

	@ObfuscatedName("client.Ec")
	public int field154;

	@ObfuscatedName("client.Fc")
	public int field155;

	@ObfuscatedName("client.Rc")
	public int field164;

	@ObfuscatedName("client.dd")
	public int field176;

	@ObfuscatedName("client.ed")
	public int field177;

	@ObfuscatedName("client.hd")
	public int field180;

	@ObfuscatedName("client.xd")
	public static int field193;

	@ObfuscatedName("client.zd")
	public int field195;

	@ObfuscatedName("client.Bd")
	public int field196;

	@ObfuscatedName("client.Cd")
	public int field197;

	@ObfuscatedName("client.Dd")
	public int field198;

	@ObfuscatedName("client.Ed")
	public int field199;

	@ObfuscatedName("client.Fd")
	public int field200;

	@ObfuscatedName("client.Id")
	public static int field203;

	@ObfuscatedName("client.Jd")
	public static int field204;

	@ObfuscatedName("client.Kd")
	public int field205;

	@ObfuscatedName("client.Ld")
	public int field206;

	@ObfuscatedName("client.Md")
	public int field207;

	@ObfuscatedName("client.Nd")
	public int field208;

	@ObfuscatedName("client.Od")
	public int field209;

	@ObfuscatedName("client.Pd")
	public int field210;

	@ObfuscatedName("client.Qd")
	public int field211;

	@ObfuscatedName("client.Sd")
	public int field213;

	@ObfuscatedName("client.ce")
	public static int field223;

	@ObfuscatedName("client.de")
	public int field224;

	@ObfuscatedName("client.ge")
	public int field225;

	@ObfuscatedName("client.ke")
	public static int field228;

	@ObfuscatedName("client.pe")
	public int field232;

	@ObfuscatedName("client.re")
	public int field233;

	@ObfuscatedName("client.se")
	public int field234;

	@ObfuscatedName("client.te")
	public int field235;

	@ObfuscatedName("client.Ge")
	public int field248;

	@ObfuscatedName("client.He")
	public static int field249;

	@ObfuscatedName("client.Ke")
	public int field252;

	@ObfuscatedName("client.Le")
	public int field253;

	@ObfuscatedName("client.Ne")
	public int field255;

	@ObfuscatedName("client.Oe")
	public int field256;

	@ObfuscatedName("client.Pe")
	public int field257;

	@ObfuscatedName("client.Qe")
	public int field258;

	@ObfuscatedName("client.Re")
	public int field259;

	@ObfuscatedName("client.Se")
	public int field260;

	@ObfuscatedName("client.Te")
	public int field261;

	@ObfuscatedName("client.We")
	public int field263;

	@ObfuscatedName("client.af")
	public int field266;

	@ObfuscatedName("client.bf")
	public int field267;

	@ObfuscatedName("client.cf")
	public int field268;

	@ObfuscatedName("client.df")
	public int field269;

	@ObfuscatedName("client.ef")
	public int field270;

	@ObfuscatedName("client.ff")
	public int field271;

	@ObfuscatedName("client.gf")
	public int field272;

	@ObfuscatedName("client.lf")
	public int field275;

	@ObfuscatedName("client.nf")
	public int field277;

	@ObfuscatedName("client.of")
	public int field278;

	@ObfuscatedName("client.pf")
	public int field279;

	@ObfuscatedName("client.qf")
	public int field280;

	@ObfuscatedName("client.rf")
	public int field281;

	@ObfuscatedName("client.vf")
	public static int field285;

	@ObfuscatedName("client.Jf")
	public int field296;

	@ObfuscatedName("client.Pf")
	public int field302;

	@ObfuscatedName("client.Qf")
	public int field303;

	@ObfuscatedName("client.Yf")
	public int field311;

	@ObfuscatedName("client.Zf")
	public int field312;

	@ObfuscatedName("client.bg")
	public int field314;

	@ObfuscatedName("client.cg")
	public int field315;

	@ObfuscatedName("client.kg")
	public int field323;

	@ObfuscatedName("client.qg")
	public int field327;

	@ObfuscatedName("client.rg")
	public int field328;

	@ObfuscatedName("client.sg")
	public int field329;

	@ObfuscatedName("client.tg")
	public int field330;

	@ObfuscatedName("client.Gg")
	public static int field342;

	@ObfuscatedName("client.Jg")
	public int field345;

	@ObfuscatedName("client.Sg")
	public int field353;

	@ObfuscatedName("client.gh")
	public int field365;

	@ObfuscatedName("client.ih")
	public int field367;

	@ObfuscatedName("client.th")
	public int field377;

	@ObfuscatedName("client.xh")
	public int field381;

	@ObfuscatedName("client.Eh")
	public int field388;

	@ObfuscatedName("client.Fh")
	public int field389;

	@ObfuscatedName("client.Gh")
	public int field390;

	@ObfuscatedName("client.Hh")
	public int field391;

	@ObfuscatedName("client.Ih")
	public int field392;

	@ObfuscatedName("client.Jh")
	public int field393;

	@ObfuscatedName("client.Lh")
	public int field395;

	@ObfuscatedName("client.Oh")
	public int field398;

	@ObfuscatedName("client.Ph")
	public static int field399;

	@ObfuscatedName("client.Rh")
	public int field401;

	@ObfuscatedName("client.Zh")
	public int field408;

	@ObfuscatedName("client.bi")
	public static int field410;

	@ObfuscatedName("client.di")
	public int field412;

	@ObfuscatedName("client.li")
	public static int field420;

	@ObfuscatedName("client.ni")
	public int field422;

	@ObfuscatedName("client.pi")
	public int field424;

	@ObfuscatedName("client.qi")
	public int field425;

	@ObfuscatedName("client.ri")
	public int field426;

	@ObfuscatedName("client.si")
	public int field427;

	@ObfuscatedName("client.wi")
	public int field430;

	@ObfuscatedName("client.yi")
	public static int field432;

	@ObfuscatedName("client.zi")
	public int field433;

	@ObfuscatedName("client.Gi")
	public int field439;

	@ObfuscatedName("client.Ri")
	public int field448;

	@ObfuscatedName("client.Ti")
	public static int field450;

	@ObfuscatedName("client.Wi")
	public int field452;

	@ObfuscatedName("client.Yi")
	public int field454;

	@ObfuscatedName("client.aj")
	public int field456;

	@ObfuscatedName("client.fj")
	public int field460;

	@ObfuscatedName("client.kj")
	public int field465;

	@ObfuscatedName("client.qj")
	public int field471;

	@ObfuscatedName("client.rj")
	public int field472;

	@ObfuscatedName("client.sj")
	public int field473;

	@ObfuscatedName("client.tj")
	public int field474;

	@ObfuscatedName("client.uj")
	public int field475;

	@ObfuscatedName("client.Bj")
	public int field481;

	@ObfuscatedName("client.Cj")
	public int field482;

	@ObfuscatedName("client.Dj")
	public int field483;

	@ObfuscatedName("client.Ij")
	public int field488;

	@ObfuscatedName("client.Kj")
	public int field489;

	@ObfuscatedName("client.J")
	public static int field65;

	@ObfuscatedName("client.K")
	public int field66;

	@ObfuscatedName("client.L")
	public static int field67;

	@ObfuscatedName("client.M")
	public int field68;

	@ObfuscatedName("client.N")
	public int field69;

	@ObfuscatedName("client.O")
	public int field70;

	@ObfuscatedName("client.P")
	public static int field71;

	@ObfuscatedName("client.W")
	public int field76;

	@ObfuscatedName("client.Y")
	public int field78;

	@ObfuscatedName("client.gb")
	public int field84;

	@ObfuscatedName("client.hb")
	public int field85;

	@ObfuscatedName("client.ib")
	public int field86;

	@ObfuscatedName("client.jb")
	public int field87;

	@ObfuscatedName("client.kb")
	public int field88;

	@ObfuscatedName("client.lb")
	public int field89;

	@ObfuscatedName("client.mb")
	public int field90;

	@ObfuscatedName("client.pb")
	public int field93;

	@ObfuscatedName("client.qb")
	public int field94;

	@ObfuscatedName("client.rb")
	public int field95;

	@ObfuscatedName("client.sb")
	public int field96;

	@ObfuscatedName("client.Qc")
	public long field163;

	@ObfuscatedName("client.Pg")
	public long field350;

	@ObfuscatedName("client.Xg")
	public long field357;

	@ObfuscatedName("client.ci")
	public long field411;

	@ObfuscatedName("client.bb")
	public long field81;

	@ObfuscatedName("client.Jc")
	public ARAKDHLD field158;

	@ObfuscatedName("client.Kc")
	public ARAKDHLD field159;

	@ObfuscatedName("client.Lc")
	public ARAKDHLD field160;

	@ObfuscatedName("client.Mc")
	public ARAKDHLD field161;

	@ObfuscatedName("client.Sc")
	public ARAKDHLD field165;

	@ObfuscatedName("client.Tc")
	public ARAKDHLD field166;

	@ObfuscatedName("client.Uc")
	public ARAKDHLD field167;

	@ObfuscatedName("client.Vc")
	public ARAKDHLD field168;

	@ObfuscatedName("client.Wc")
	public ARAKDHLD field169;

	@ObfuscatedName("client.Xc")
	public ARAKDHLD field170;

	@ObfuscatedName("client.Yc")
	public ARAKDHLD field171;

	@ObfuscatedName("client.Zc")
	public ARAKDHLD field172;

	@ObfuscatedName("client.ad")
	public ARAKDHLD field173;

	@ObfuscatedName("client.wg")
	public ARAKDHLD field332;

	@ObfuscatedName("client.xg")
	public ARAKDHLD field333;

	@ObfuscatedName("client.yg")
	public ARAKDHLD field334;

	@ObfuscatedName("client.zg")
	public ARAKDHLD field335;

	@ObfuscatedName("client.Ag")
	public ARAKDHLD field336;

	@ObfuscatedName("client.Bg")
	public ARAKDHLD field337;

	@ObfuscatedName("client.Cg")
	public ARAKDHLD field338;

	@ObfuscatedName("client.Dg")
	public ARAKDHLD field339;

	@ObfuscatedName("client.Eg")
	public ARAKDHLD field340;

	@ObfuscatedName("client.uh")
	public ARAKDHLD field378;

	@ObfuscatedName("client.vh")
	public ARAKDHLD field379;

	@ObfuscatedName("client.wh")
	public ARAKDHLD field380;

	@ObfuscatedName("client.jd")
	public EYTQJNEM field181;

	@ObfuscatedName("client.kd")
	public EYTQJNEM field182;

	@ObfuscatedName("client.Vd")
	public EYTQJNEM field216;

	@ObfuscatedName("client.Wd")
	public EYTQJNEM field217;

	@ObfuscatedName("client.sf")
	public EYTQJNEM field282;

	@ObfuscatedName("client.Mg")
	public EYTQJNEM field347;

	@ObfuscatedName("client.Ng")
	public EYTQJNEM field348;

	@ObfuscatedName("client.Og")
	public EYTQJNEM field349;

	@ObfuscatedName("client.Ai")
	public EYTQJNEM field434;

	@ObfuscatedName("client.Bi")
	public EYTQJNEM field435;

	@ObfuscatedName("client.Ci")
	public EYTQJNEM field436;

	@ObfuscatedName("client.Di")
	public EYTQJNEM field437;

	@ObfuscatedName("client.Ei")
	public EYTQJNEM field438;

	@ObfuscatedName("client.wb")
	public EYTQJNEM field99;

	@ObfuscatedName("client.pd")
	public FIGUVTWB field186;

	@ObfuscatedName("client.Td")
	public FLUCRVAS field214;

	@ObfuscatedName("client.od")
	public FRNMNGGN field185;

	@ObfuscatedName("client.R")
	public static HPYXKOFA field73;

	@ObfuscatedName("client.Ud")
	public LUUCVUQY field215;

	@ObfuscatedName("client.vc")
	public TOROBAKX field145;

	@ObfuscatedName("client.wc")
	public TOROBAKX field146;

	@ObfuscatedName("client.Xd")
	public TOROBAKX field218;

	@ObfuscatedName("client.Yd")
	public TOROBAKX field219;

	@ObfuscatedName("client.Uf")
	public TOROBAKX field307;

	@ObfuscatedName("client.Vf")
	public TOROBAKX field308;

	@ObfuscatedName("client.Wf")
	public TOROBAKX field309;

	@ObfuscatedName("client.dg")
	public TOROBAKX field316;

	@ObfuscatedName("client.eg")
	public TOROBAKX field317;

	@ObfuscatedName("client.fg")
	public TOROBAKX field318;

	@ObfuscatedName("client.zh")
	public TOROBAKX field383;

	@ObfuscatedName("client.Ah")
	public TOROBAKX field384;

	@ObfuscatedName("client.Bh")
	public TOROBAKX field385;

	@ObfuscatedName("client.Ch")
	public TOROBAKX field386;

	@ObfuscatedName("client.Dh")
	public TOROBAKX field387;

	@ObfuscatedName("client.gi")
	public TOROBAKX field415;

	@ObfuscatedName("client.hi")
	public TOROBAKX field416;

	@ObfuscatedName("client.ii")
	public TOROBAKX field417;

	@ObfuscatedName("client.ji")
	public TOROBAKX field418;

	@ObfuscatedName("client.ki")
	public TOROBAKX field419;

	@ObfuscatedName("client.jg")
	public UWQNYVPL field322;

	@ObfuscatedName("client.xj")
	public YZXOZYLM field477;

	@ObfuscatedName("client.yj")
	public YZXOZYLM field478;

	@ObfuscatedName("client.zj")
	public YZXOZYLM field479;

	@ObfuscatedName("client.Aj")
	public YZXOZYLM field480;

	@ObfuscatedName("client.me")
	public ZZMUCPQP field229;

	@ObfuscatedName("client.Cc")
	public String field152;

	@ObfuscatedName("client.qd")
	public String field187;

	@ObfuscatedName("client.Ye")
	public String field264;

	@ObfuscatedName("client.Kh")
	public String field394;

	@ObfuscatedName("client.Qi")
	public Socket field447;

	@ObfuscatedName("client.hc")
	public static boolean field131;

	@ObfuscatedName("client.mf")
	public static boolean field276;

	@ObfuscatedName("client.Ig")
	public static boolean field344;

	@ObfuscatedName("client.ij")
	public static boolean field463;

	@ObfuscatedName("client.dc")
	public int[] field128;

	@ObfuscatedName("client.ec")
	public int[] field129;

	@ObfuscatedName("client.fc")
	public int[] field130;

	@ObfuscatedName("client.rd")
	public int[] field188;

	@ObfuscatedName("client.sd")
	public int[] field189;

	@ObfuscatedName("client.Kf")
	public int[] field297;

	@ObfuscatedName("client.Lf")
	public int[] field298;

	@ObfuscatedName("client.Mf")
	public int[] field299;

	@ObfuscatedName("client.Nf")
	public int[] field300;

	@ObfuscatedName("client.Rf")
	public int[] field304;

	@ObfuscatedName("client.Sf")
	public int[] field305;

	@ObfuscatedName("client.Tf")
	public int[] field306;

	@ObfuscatedName("client.ui")
	public int[] field428;

	@ObfuscatedName("client.vi")
	public int[] field429;

	@ObfuscatedName("client.oc")
	public TOROBAKX[] field138;

	@ObfuscatedName("client.Hd")
	public byte[][] field202;

	@ObfuscatedName("client.bh")
	public byte[][] field360;

	@ObfuscatedName("client.cd")
	public byte[][][] field175;

	@ObfuscatedName("client.mg")
	public int[][][] field325;

	@ObfuscatedName("client.c(B)V")
	public final void method31() {
		signlink.reporterror = false;

		try {
			if (field214 != null) {
				field214.method210();
			}
		} catch (Exception var1) {
		}

		field214 = null;
		method136();

		if (field229 != null) {
			field229.field1486 = false;
		}

		field229 = null;
		field185.method227();
		field185 = null;
		field132 = null;
		field265 = null;
		field361 = null;
		field400 = null;
		field304 = null;
		field360 = null;
		field202 = null;
		field305 = null;
		field306 = null;
		field325 = null;
		field175 = null;
		field322 = null;
		field421 = null;
		field301 = null;
		field355 = null;
		field245 = null;
		field246 = null;
		field358 = null;
		field158 = null;
		field159 = null;
		field160 = null;
		field161 = null;
		field378 = null;
		field379 = null;
		field380 = null;
		field332 = null;
		field333 = null;
		field334 = null;
		field335 = null;
		field336 = null;
		field337 = null;
		field338 = null;
		field339 = null;
		field340 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field307 = null;
		field308 = null;
		field309 = null;
		field190 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field387 = null;
		field415 = null;
		field416 = null;
		field417 = null;
		field418 = null;
		field419 = null;
		field99 = null;
		field458 = null;
		field407 = null;
		field457 = null;
		field434 = null;
		field435 = null;
		field436 = null;
		field437 = null;
		field438 = null;
		field157 = null;
		field359 = null;
		field321 = null;
		field364 = null;
		field366 = null;
		field368 = null;
		field369 = null;
		field423 = null;
		field133 = null;
		field135 = null;
		field462 = null;
		field294 = null;
		field194 = null;
		field126 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field445 = null;
		field212 = null;
		field230 = null;
		field396 = null;
		field397 = null;
		field101 = null;
		field282 = null;
		field113 = null;
		field487 = null;
		field148 = null;
		field168 = null;
		field169 = null;
		field165 = null;
		field166 = null;
		field167 = null;
		field170 = null;
		field171 = null;
		field172 = null;
		field173 = null;
		method93();
		PFIKHQJO.method410();
		BYABUZFP.method27();
		PZNZFKPU.method422();
		YTVETJJL.field1436 = null;
		CWWAFTAL.field491 = null;
		UKJEXUVU.field1300 = null;
		EGZPXFGT.field538 = null;
		TLXFHCOO.field1242 = null;
		SNGXEJOJ.field1217 = null;
		SNGXEJOJ.field1229 = null;
		ONNQWBMW.field920 = null;
		field507 = null;
		HPYXKOFA.field660 = null;
		QVVCPQSC.method433();
		UWQNYVPL.method508();
		NJPATAFL.method330();
		TDFMBTLA.method489();
		System.gc();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method32() {
		int var1 = field479.method575("Choose Option");
		for (int var2 = 0; var2 < field296; var2++) {
			int var3 = field479.method575(field212[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field296 * 15 + 21;
		if (field521 > 4 && field522 > 4 && field521 < 516 && field522 < 338) {
			int var5 = field521 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field522 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field464 = true;
			field196 = 0;
			field197 = var5;
			field198 = var6;
			field199 = var1;
			field200 = field296 * 15 + 22;
		}

		if (field521 > 553 && field522 > 205 && field521 < 743 && field522 < 466) {
			int var7 = field521 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field522 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field464 = true;
			field196 = 1;
			field197 = var7;
			field198 = var8;
			field199 = var1;
			field200 = field296 * 15 + 22;
		}

		if (field521 > 17 && field522 > 357 && field521 < 496 && field522 < 453) {
			int var9 = field521 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field522 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field464 = true;
			field196 = 2;
			field197 = var9;
			field198 = var10;
			field199 = var1;
			field200 = field296 * 15 + 22;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method33() {
		for (QRKWRHKJ var1 = (QRKWRHKJ) field126.method482(); var1 != null; var1 = (QRKWRHKJ) field126.method484()) {
			if (field315 != var1.field1077 || var1.field1083) {
				var1.method397();
			} else if (field203 >= var1.field1076) {
				var1.method432(field109);

				if (var1.field1083) {
					var1.method397();
				} else {
					field322.method520(var1, -1, 60, 0, var1.field1080, var1.field1077, var1.field1078, var1.field1079, false);
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method34() {
		if (field448 == 0) {
			int var1 = field504 / 2 - 80;
			int var2 = field505 / 2 + 20;
			var2 += 20;
			if (field520 == 1 && field521 >= var1 - 75 && field521 <= var1 + 75 && field522 >= var2 - 20 && field522 <= var2 + 20) {
				field448 = 3;
				field234 = 0;
			}

			int var3 = field504 / 2 + 80;
			if (field520 == 1 && field521 >= var3 - 75 && field521 <= var3 + 75 && field522 >= var2 - 20 && field522 <= var2 + 20) {
				field102 = "";
				field103 = "Enter your username & password.";
				field448 = 2;
				field234 = 0;
			}
		} else if (field448 == 2) {
			int var4 = field505 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field520 == 1 && field522 >= var4 - 15 && field522 < var4) {
				field234 = 0;
			}

			var4 += 15;
			if (field520 == 1 && field522 >= var4 - 15 && field522 < var4) {
				field234 = 1;
			}

			var4 += 15;
			int var5 = field504 / 2 - 80;
			int var6 = field505 / 2 + 50;
			var6 += 20;
			if (field520 == 1 && field521 >= var5 - 75 && field521 <= var5 + 75 && field522 >= var6 - 20 && field522 <= var6 + 20) {
				field430 = 0;
				method44(field402, field403, false);

				if (field115) {
					return;
				}
			}

			int var7 = field504 / 2 + 80;
			if (field520 == 1 && field521 >= var7 - 75 && field521 <= var7 + 75 && field522 >= var6 - 20 && field522 <= var6 + 20) {
				field448 = 0;
				field402 = "";
				field403 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method183();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field79.length(); var10++) {
					if (var8 == field79.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field234 == 0) {
					if (var8 == 8 && field402.length() > 0) {
						field402 = field402.substring(0, field402.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field234 = 1;
					}

					if (var9) {
						field402 = field402 + (char) var8;
					}

					if (field402.length() > 12) {
						field402 = field402.substring(0, 12);
					}
				} else if (field234 == 1) {
					if (var8 == 8 && field403.length() > 0) {
						field403 = field403.substring(0, field403.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field234 = 0;
					}

					if (var9) {
						field403 = field403 + (char) var8;
					}

					if (field403.length() > 20) {
						field403 = field403.substring(0, 20);
					}
				}
			}
		} else if (field448 == 3) {
			int var11 = field504 / 2;
			int var12 = field505 / 2 + 50;
			var12 += 20;
			if (field520 == 1 && field521 >= var11 - 75 && field521 <= var11 + 75 && field522 >= var12 - 20 && field522 <= var12 + 20) {
				field448 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method35() {
		if (field344 && field277 == 2 && SNGUFYDX.field1197 != field315) {
			field160.method13();
			field478.method573("Loading - please wait.", 151, 257, 0);
			field478.method573("Loading - please wait.", 150, 256, 0xFFFFFF);
			field160.method14(field506, 4, 4);
			field277 = 1;
			field81 = System.currentTimeMillis();
		}

		if (field277 == 1) {
			int var1 = method36();
			if (var1 != 0 && System.currentTimeMillis() - field81 > 360000L) {
				signlink.reporterror(field402 + " glcfb " + field411 + "," + var1 + "," + field344 + "," + field287[0] + "," + field185.method219() + "," + field315 + "," + field153 + "," + field154);
				field81 = System.currentTimeMillis();
			}
		}

		if (field277 == 2 && field82 != field315) {
			field82 = field315;
			method172(field315);
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method36() {
		for (int var1 = 0; var1 < field360.length; var1++) {
			if (field360[var1] == null && field305[var1] != -1) {
				return -1;
			}

			if (field202[var1] == null && field306[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field360.length; var3++) {
			byte[] var4 = field202[var3];
			if (var4 != null) {
				int var5 = (field304[var3] >> 8) * 64 - field122;
				int var6 = (field304[var3] & 0xFF) * 64 - field123;
				if (field83) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= SNGUFYDX.method460(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field431) {
			return -4;
		} else {
			field277 = 2;
			SNGUFYDX.field1197 = field315;
			method158();
			field265.method281(52);
			return 0;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method37() {
		if (field277 == 2) {
			for (MWTZCFMC var1 = (MWTZCFMC) field294.method482(); var1 != null; var1 = (MWTZCFMC) field294.method484()) {
				if (var1.field824 > 0) {
					var1.field824--;
				}

				if (var1.field824 != 0) {
					if (var1.field832 > 0) {
						var1.field832--;
					}

					if (var1.field832 == 0 && var1.field830 >= 1 && var1.field831 >= 1 && var1.field830 <= 102 && var1.field831 <= 102 && (var1.field833 < 0 || SNGUFYDX.method471(var1.field833, var1.field835))) {
						method61(var1.field831, var1.field828, var1.field830, var1.field833, var1.field835, var1.field834, var1.field829);
						var1.field832 = -1;

						if (var1.field833 == var1.field825 && var1.field825 == -1) {
							var1.method397();
						} else if (var1.field833 == var1.field825 && var1.field834 == var1.field826 && var1.field835 == var1.field827) {
							var1.method397();
						}
					}
				} else if (var1.field825 < 0 || SNGUFYDX.method471(var1.field825, var1.field827)) {
					method61(var1.field831, var1.field828, var1.field830, var1.field825, var1.field827, var1.field826, var1.field829);
					var1.method397();
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int method38() {
		int var1 = 3;
		if (field269 < 310) {
			int var2 = field266 >> 7;
			int var3 = field268 >> 7;
			int var4 = field73.field706 >> 7;
			int var5 = field73.field707 >> 7;

			if ((field175[field315][var2][var3] & 0x4) != 0) {
				var1 = field315;
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

					if ((field175[field315][var2][var3] & 0x4) != 0) {
						var1 = field315;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field175[field315][var2][var3] & 0x4) != 0) {
							var1 = field315;
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

					if ((field175[field315][var2][var3] & 0x4) != 0) {
						var1 = field315;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field175[field315][var2][var3] & 0x4) != 0) {
							var1 = field315;
						}
					}
				}
			}
		}

		if ((field175[field315][field73.field706 >> 7][field73.field707 >> 7] & 0x4) != 0) {
			var1 = field315;
		}

		return var1;
	}

	@ObfuscatedName("client.g(B)I")
	public final int method39() {
		int var1 = method114(field315, field268, field266);
		if (var1 - field267 < 800 && (field175[field315][field266 >> 7][field268 >> 7] & 0x4) != 0) {
			return field315;
		}

		return 3;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method40(long arg0) {
		if (arg0 != 0L) {
			if (field488 >= 100) {
				method139("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = POOZNYPH.method417(POOZNYPH.method414(arg0));
				for (int var4 = 0; var4 < field488; var4++) {
					if (field118[var4] == arg0) {
						method139(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field260; var5++) {
					if (field487[var5] == arg0) {
						method139("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field118[field488++] = arg0;
				field112 = true;
				field265.method281(232);
				field265.method288(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(ILITPGSHXV;Z)V")
	public final void method41(int arg0, ITPGSHXV arg1) {
		method42(arg0, arg1.field707, arg1.field706);
	}

	@ObfuscatedName("client.a(IZII)V")
	public final void method42(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method114(field315, arg1, arg2) - arg0;
			arg2 -= field266;
			var4 -= field267;
			arg1 -= field268;
			int var5 = NJPATAFL.field905[field269];
			int var6 = NJPATAFL.field906[field269];
			int var7 = NJPATAFL.field905[field270];
			int var8 = NJPATAFL.field906[field270];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field468 = (var9 << 9) / arg1 + QVVCPQSC.field1090;
				field469 = (var11 << 9) / arg1 + QVVCPQSC.field1091;
			} else {
				field468 = -1;
				field469 = -1;
			}
		} else {
			field468 = -1;
			field469 = -1;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method43() {
		short var1 = 256;

		if (field302 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field302 > 768) {
					field297[var2] = method168(field298[var2], field299[var2], 1024 - field302);
				} else if (field302 > 256) {
					field297[var2] = field299[var2];
				} else {
					field297[var2] = method168(field299[var2], field298[var2], 256 - field302);
				}
			}
		} else if (field303 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field303 > 768) {
					field297[var3] = method168(field298[var3], field300[var3], 1024 - field303);
				} else if (field303 > 256) {
					field297[var3] = field300[var3];
				} else {
					field297[var3] = method168(field300[var3], field298[var3], 256 - field303);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field297[var4] = field298[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field168.field11[var5] = field216.field552[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field290[var8] / var1;
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
					var12 = field297[var12];
					int var15 = field168.field11[var7];
					field168.field11[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field168.method14(field506, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field169.field11[var16] = field217.field552[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field290[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field428[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field297[var23];
					int var26 = field169.field11[var18];
					field169.field11[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field169.method14(field506, 637, 0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method44(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field102 = "";
				field103 = "Connecting to server...";
				method59(true);
			}

			field214 = new FLUCRVAS(this, method167(field342 + 43594));
			long var4 = POOZNYPH.method413(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field265.field812 = 0;
			field265.method282(14);
			field265.method282(var6);
			field214.method214(0, 2, field265.field811);

			for (int var7 = 0; var7 < 8; var7++) {
				field214.method211();
			}

			int var8 = field214.method211();
			int var9 = var8;

			if (var8 == 0) {
				field214.method213(field400.field811, 0, 8);
				field400.field812 = 0;
				field411 = field400.method298();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field411 >> 32), (int) field411 };
				field265.field812 = 0;
				field265.method282(10);
				field265.method286(var10[0]);
				field265.method286(var10[1]);
				field265.method286(var10[2]);
				field265.method286(var10[3]);
				field265.method286(signlink.uid);
				field265.method289(arg0);
				field265.method289(arg1);
				field265.method307(field356, field405);
				field361.field812 = 0;

				if (arg2) {
					field361.method282(18);
				} else {
					field361.method282(16);
				}

				field361.method282(field265.field812 + 36 + 1 + 1 + 2);
				field361.method282(255);
				field361.method283(311);
				field361.method282(field344 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field361.method286(field446[var11]);
				}

				field361.method290(field265.field811, 0, field265.field812);
				field265.field816 = new LUUCVUQY(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field215 = new LUUCVUQY(var10);
				field214.method214(0, field361.field812, field361.field811);
				var8 = field214.method211();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method44(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field70 = field214.method211();
				field463 = field214.method211() == 1;
				field350 = 0L;
				field388 = 0;
				field229.field1487 = 0;
				field511 = true;
				field286 = true;
				field115 = true;
				field265.field812 = 0;
				field400.field812 = 0;
				field87 = -1;
				field481 = -1;
				field482 = -1;
				field483 = -1;
				field86 = 0;
				field88 = 0;
				field180 = 0;
				field90 = 0;
				field433 = 0;
				field296 = 0;
				field464 = false;
				field512 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field293[var13] = null;
				}

				field390 = 0;
				field149 = 0;
				field277 = 0;
				field408 = 0;
				field465 = (int) (Math.random() * 100.0D) - 50;
				field345 = (int) (Math.random() * 110.0D) - 55;
				field353 = (int) (Math.random() * 80.0D) - 40;
				field323 = (int) (Math.random() * 120.0D) - 60;
				field110 = (int) (Math.random() * 30.0D) - 20;
				field327 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field78 = 0;
				field82 = -1;
				field280 = 0;
				field281 = 0;
				field365 = 0;
				field134 = 0;

				for (int var14 = 0; var14 < field362; var14++) {
					field364[var14] = null;
					field369[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field133[var15] = null;
				}

				field73 = field364[field363] = new HPYXKOFA();
				field194.method486();
				field126.method486();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field462[var16][var17][var18] = null;
						}
					}
				}

				field294 = new SWVPDERM();
				field261 = 0;
				field260 = 0;
				field247 = -1;
				field98 = -1;
				field91 = -1;
				field453 = -1;
				field375 = -1;
				field121 = false;
				field476 = 3;
				field139 = 0;
				field464 = false;
				field320 = false;
				field264 = null;
				field456 = 0;
				field201 = -1;
				field414 = true;
				method95();

				for (int var19 = 0; var19 < 5; var19++) {
					field484[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field373[var20] = null;
					field374[var20] = false;
				}

				field119 = 0;
				field193 = 0;
				field410 = 0;
				field67 = 0;
				field65 = 0;
				field432 = 0;
				field450 = 0;
				field223 = 0;
				method63();
			} else if (var8 == 3) {
				field102 = "";
				field103 = "Invalid username or password.";
			} else if (var8 == 4) {
				field102 = "Your account has been disabled.";
				field103 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field102 = "Your account is already logged in.";
				field103 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field102 = "RuneScape has been updated!";
				field103 = "Please reload this page.";
			} else if (var8 == 7) {
				field102 = "This world is full.";
				field103 = "Please use a different world.";
			} else if (var8 == 8) {
				field102 = "Unable to connect.";
				field103 = "Login server offline.";
			} else if (var8 == 9) {
				field102 = "Login limit exceeded.";
				field103 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field102 = "Unable to connect.";
				field103 = "Bad session id.";
			} else if (var8 == 11) {
				field103 = "Login server rejected session.";
				field103 = "Please try again.";
			} else if (var8 == 12) {
				field102 = "You need a members account to login to this world.";
				field103 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field102 = "Could not complete login.";
				field103 = "Please try using a different world.";
			} else if (var8 == 14) {
				field102 = "The server is being updated.";
				field103 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field115 = true;
				field265.field812 = 0;
				field400.field812 = 0;
				field87 = -1;
				field481 = -1;
				field482 = -1;
				field483 = -1;
				field86 = 0;
				field88 = 0;
				field180 = 0;
				field296 = 0;
				field464 = false;
				field81 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field102 = "Login attempts exceeded.";
				field103 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field102 = "You are standing in a members-only area.";
				field103 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field102 = "Invalid loginserver requested";
				field103 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field214.method211(); var21 >= 0; var21--) {
					field102 = "You have only just left another world";
					field103 = "Your profile will be transferred in: " + var21 + " seconds";
					method59(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method44(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field102 = "Unexpected server response";
				field103 = "Please try using a different world.";
			} else if (var9 != 0) {
				field102 = "No response from server";
				field103 = "Please try using a different world.";
			} else if (field430 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field430++;
				method44(arg0, arg1, arg2);
			} else {
				field102 = "No response from loginserver";
				field103 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field102 = "";
			field103 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method45() {
		byte[] var1 = field186.method209("title.dat", null);
		EYTQJNEM var2 = new EYTQJNEM(var1, this);
		field168.method13();
		var2.method191(0, 0);
		field169.method13();
		var2.method191(0, -637);
		field165.method13();
		var2.method191(0, -128);
		field166.method13();
		var2.method191(-371, -202);
		field167.method13();
		var2.method191(-171, -202);
		field170.method13();
		var2.method191(-265, 0);
		field171.method13();
		var2.method191(-265, -562);
		field172.method13();
		var2.method191(-171, -128);
		field173.method13();
		var2.method191(-171, -562);
		int[] var3 = new int[var2.field553];
		for (int var4 = 0; var4 < var2.field554; var4++) {
			for (int var5 = 0; var5 < var2.field553; var5++) {
				var3[var5] = var2.field552[var2.field553 * var4 + var2.field553 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field553; var6++) {
				var2.field552[var2.field553 * var4 + var6] = var3[var6];
			}
		}

		field168.method13();
		var2.method191(0, 382);
		field169.method13();
		var2.method191(0, -255);
		field165.method13();
		var2.method191(0, 254);
		field166.method13();
		var2.method191(-371, 180);
		field167.method13();
		var2.method191(-171, 180);
		field170.method13();
		var2.method191(-265, 382);
		field171.method13();
		var2.method191(-265, -180);
		field172.method13();
		var2.method191(-171, 254);
		field173.method13();
		var2.method191(-171, -180);
		EYTQJNEM var7 = new EYTQJNEM(field186, "logo", 0);
		field165.method13();
		var7.method193(382 - var7.field553 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method46() {
		if (field68 != 0) {
			int var1 = 0;
			if (field180 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field293[var2] != null) {
					int var3 = field291[var2];
					String var4 = field292[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field195 == 0 || field195 == 1 && method82(var4))) {
						int var8 = 329 - var1 * 13;
						if (field514 > 4 && field515 - 4 > var8 - 10 && field515 - 4 <= var8 + 3) {
							int var9 = field478.method575("From:  " + var4 + field293[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field514 < var9 + 4) {
								if (field70 >= 1) {
									field212[field296] = "Report abuse @whi@" + var4;
									field444[field296] = 2529;
									field296++;
								}

								field212[field296] = "Add ignore @whi@" + var4;
								field444[field296] = 2176;
								field296++;
								field212[field296] = "Add friend @whi@" + var4;
								field444[field296] = 2521;
								field296++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field195 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public static final void method47() {
		UWQNYVPL.field1348 = true;
		QVVCPQSC.field1085 = true;
		field344 = true;
		SNGUFYDX.field1206 = true;
		PFIKHQJO.field982 = true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method48() {
		field97 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field449) {
				field248++;
				method129();
				method129();
				method43();
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

		field97 = false;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method49() {
		if (field296 >= 2 || field390 != 0 || field149 != 0) {
			String var1;
			if (field390 == 1 && field296 < 2) {
				var1 = "Use " + field394 + " with...";
			} else if (field149 == 1 && field296 < 2) {
				var1 = field152 + "...";
			} else {
				var1 = field212[field296 - 1];
			}

			if (field296 > 2) {
				var1 = var1 + "@whi@ / " + (field296 - 2) + " more options";
			}

			field479.method582(field203 / 1000, 0xFFFFFF, var1, 4, 15, true);
		}
	}

	@ObfuscatedName("client.a(ILMUKVLYLC;I)V")
	public final void method50(MUKVLYLC arg0, int arg1) {
		arg0.method302();
		int var3 = arg0.method303(8);
		if (var3 < field134) {
			for (int var4 = var3; var4 < field134; var4++) {
				field423[field422++] = field135[var4];
			}
		}

		if (var3 > field134) {
			signlink.reporterror(field402 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field134 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field135[var5];
			PNBDNSXO var7 = field133[var6];
			int var8 = arg0.method303(1);
			if (var8 == 0) {
				field135[field134++] = var6;
				var7.field735 = field203;
			} else {
				int var9 = arg0.method303(2);
				if (var9 == 0) {
					field135[field134++] = var6;
					var7.field735 = field203;
					field368[field367++] = var6;
				} else if (var9 == 1) {
					field135[field134++] = var6;
					var7.field735 = field203;
					int var10 = arg0.method303(3);
					var7.method247(var10, false);
					int var11 = arg0.method303(1);
					if (var11 == 1) {
						field368[field367++] = var6;
					}
				} else if (var9 == 2) {
					field135[field134++] = var6;
					var7.field735 = field203;
					int var12 = arg0.method303(3);
					var7.method247(var12, true);
					int var13 = arg0.method303(3);
					var7.method247(var13, true);
					int var14 = arg0.method303(1);
					if (var14 == 1) {
						field368[field367++] = var6;
					}
				} else if (var9 == 3) {
					field423[field422++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method51(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field488; var3++) {
				if (field118[var3] == arg0) {
					field488--;
					field112 = true;

					for (int var4 = var3; var4 < field488; var4++) {
						field118[var4] = field118[var4 + 1];
					}

					field265.method281(165);
					field265.method288(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method52(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method53(int arg0) {
		int var2 = ONNQWBMW.field920[arg0].field928;
		if (var2 != 0) {
			int var3 = field230[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					QVVCPQSC.method442(0.9D);
				}

				if (var3 == 2) {
					QVVCPQSC.method442(0.8D);
				}

				if (var3 == 3) {
					QVVCPQSC.method442(0.7D);
				}

				if (var3 == 4) {
					QVVCPQSC.method442(0.6D);
				}

				PZNZFKPU.field1029.method452();
				field77 = true;
			}

			if (var2 == 3) {
				boolean var4 = field162;

				if (var3 == 0) {
					method111(field162, 0);
					field162 = true;
				}

				if (var3 == 1) {
					method111(field162, -400);
					field162 = true;
				}

				if (var3 == 2) {
					method111(field162, -800);
					field162 = true;
				}

				if (var3 == 3) {
					method111(field162, -1200);
					field162 = true;
				}

				if (var3 == 4) {
					field162 = false;
				}

				if (field162 != var4 && !field344) {
					if (field162) {
						field412 = field352;
						field413 = true;
						field185.method229(2, field412);
					} else {
						method136();
					}

					field272 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field313 = true;
					method153(0);
				}

				if (var3 == 1) {
					field313 = true;
					method153(-400);
				}

				if (var3 == 2) {
					field313 = true;
					method153(-800);
				}

				if (var3 == 3) {
					field313 = true;
					method153(-1200);
				}

				if (var3 == 4) {
					field313 = false;
				}
			}

			if (var2 == 5) {
				field439 = var3;
			}

			if (var2 == 6) {
				field389 = var3;
			}

			if (var2 == 8) {
				field68 = var3;
				field222 = true;
			}

			if (var2 == 9) {
				field177 = var3;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method54() {
		PFIKHQJO.field960.method452();
		PFIKHQJO.field962.method452();
		BYABUZFP.field48.method452();
		PZNZFKPU.field1039.method452();
		PZNZFKPU.field1029.method452();
		HPYXKOFA.field660.method452();
		SNGXEJOJ.field1229.method452();
	}

	@ObfuscatedName("client.a(ILHPYXKOFA;III)V")
	public final void method55(int arg0, HPYXKOFA arg1, int arg2, int arg3) {
		if (field73 != arg1 && field296 < 400) {
			String var5;
			if (arg1.field679 == 0) {
				var5 = arg1.field669 + method169(arg1.field661, field73.field661) + " (level-" + arg1.field661 + ")";
			} else {
				var5 = arg1.field669 + " (skill-" + arg1.field679 + ")";
			}

			if (field390 == 1) {
				field212[field296] = "Use " + field394 + " with @whi@" + var5;
				field444[field296] = 636;
				field445[field296] = arg2;
				field442[field296] = arg0;
				field443[field296] = arg3;
				field296++;
			} else if (field149 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field373[var6] != null) {
						field212[field296] = field373[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field373[var6].equalsIgnoreCase("attack")) {
							if (arg1.field661 > field73.field661) {
								var7 = 2000;
							}

							if (field73.field666 != 0 && arg1.field666 != 0) {
								if (field73.field666 == arg1.field666) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field374[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field444[field296] = var7 + 359;
						}

						if (var6 == 1) {
							field444[field296] = var7 + 967;
						}

						if (var6 == 2) {
							field444[field296] = var7 + 591;
						}

						if (var6 == 3) {
							field444[field296] = var7 + 52;
						}

						if (var6 == 4) {
							field444[field296] = var7 + 549;
						}

						field445[field296] = arg2;
						field442[field296] = arg0;
						field443[field296] = arg3;
						field296++;
					}
				}
			} else if ((field151 & 0x8) == 8) {
				field212[field296] = field152 + " @whi@" + var5;
				field444[field296] = 926;
				field445[field296] = arg2;
				field442[field296] = arg0;
				field443[field296] = arg3;
				field296++;
			}

			for (int var8 = 0; var8 < field296; var8++) {
				if (field444[var8] == 387) {
					field212[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method56(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field260; var3++) {
				if (field487[var3] == arg0) {
					field260--;
					field112 = true;

					for (int var4 = var3; var4 < field260; var4++) {
						field113[var4] = field113[var4 + 1];
						field148[var4] = field148[var4 + 1];
						field487[var4] = field487[var4 + 1];
					}

					field265.method281(151);
					field265.method288(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method57() {
		field218 = new TOROBAKX(field186, "titlebox", 0);
		field219 = new TOROBAKX(field186, "titlebutton", 0);
		field138 = new TOROBAKX[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field138[var2] = new TOROBAKX(field186, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field138[var3] = new TOROBAKX(field186, "runes", (var3 & 0x3) + 12);
			}
		}

		field216 = new EYTQJNEM(128, 265);
		field217 = new EYTQJNEM(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field216.field552[var4] = field168.field11[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field217.field552[var5] = field169.field11[var5];
		}

		field298 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field298[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field298[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field298[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field298[var9 + 192] = 0xFFFFFF;
		}

		field299 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field299[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field299[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field299[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field299[var13 + 192] = 0xFFFFFF;
		}

		field300 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field300[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field300[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field300[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field300[var17 + 192] = 0xFFFFFF;
		}

		field297 = new int[256];
		field188 = new int[32768];
		field189 = new int[32768];
		method140(null);
		field428 = new int[32768];
		field429 = new int[32768];
		method79("Connecting to fileserver", 10);

		if (!field449) {
			field485 = true;
			field449 = true;
			method101(this, 2);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method58() {
		int var1 = field207 * 128 + 64;
		int var2 = field208 * 128 + 64;
		int var3 = method114(field315, var2, var1) - field209;

		if (field266 < var1) {
			field266 += (var1 - field266) * field211 / 1000 + field210;
			if (field266 > var1) {
				field266 = var1;
			}
		}

		if (field266 > var1) {
			field266 -= (field266 - var1) * field211 / 1000 + field210;
			if (field266 < var1) {
				field266 = var1;
			}
		}

		if (field267 < var3) {
			field267 += (var3 - field267) * field211 / 1000 + field210;
			if (field267 > var3) {
				field267 = var3;
			}
		}

		if (field267 > var3) {
			field267 -= (field267 - var3) * field211 / 1000 + field210;
			if (field267 < var3) {
				field267 = var3;
			}
		}

		if (field268 < var2) {
			field268 += (var2 - field268) * field211 / 1000 + field210;
			if (field268 > var2) {
				field268 = var2;
			}
		}

		if (field268 > var2) {
			field268 -= (field268 - var2) * field211 / 1000 + field210;
			if (field268 < var2) {
				field268 = var2;
			}
		}

		field249++;
		if (field249 > 81) {
			field249 = 0;
			field265.method281(225);
		}

		int var4 = field471 * 128 + 64;
		int var5 = field472 * 128 + 64;
		int var6 = method114(field315, var5, var4) - field473;
		int var7 = var4 - field266;
		int var8 = var6 - field267;
		int var9 = var5 - field268;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field269 < var11) {
			field269 += (var11 - field269) * field475 / 1000 + field474;
			if (field269 > var11) {
				field269 = var11;
			}
		}

		if (field269 > var11) {
			field269 -= (field269 - var11) * field475 / 1000 + field474;
			if (field269 < var11) {
				field269 = var11;
			}
		}

		int var13 = var12 - field270;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field270 += field475 * var13 / 1000 + field474;
			field270 &= 0x7FF;
		}

		if (var13 < 0) {
			field270 -= -var13 * field475 / 1000 + field474;
			field270 &= 0x7FF;
		}

		int var14 = var12 - field270;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field270 = var12;
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method59(boolean arg0) {
		method151();
		field167.method13();
		field218.method500(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field448 == 0) {
			int var4 = var3 / 2 + 80;
			field477.method574(0x75A9A9, var2 / 2, field185.field612, var4, true);
			int var5 = var3 / 2 - 20;
			field479.method574(0xFFFF00, var2 / 2, "Welcome to RuneScape", var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field219.method500(var6 - 73, var7 - 20);
			field479.method574(0xFFFFFF, var6, "New User", var7 + 5, true);
			int var8 = var2 / 2 + 80;
			field219.method500(var8 - 73, var7 - 20);
			field479.method574(0xFFFFFF, var8, "Existing User", var7 + 5, true);
		}

		if (field448 == 2) {
			int var9 = var3 / 2 - 40;
			if (field102.length() > 0) {
				field479.method574(0xFFFF00, var2 / 2, field102, var9 - 15, true);
				field479.method574(0xFFFF00, var2 / 2, field103, var9, true);
				var9 += 30;
			} else {
				field479.method574(0xFFFF00, var2 / 2, field103, var9 - 7, true);
				var9 += 30;
			}

			field479.method581(var9, var2 / 2 - 90, 0xFFFFFF, true, "Username: " + field402 + (field234 == 0 & field203 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field479.method581(var9, var2 / 2 - 88, 0xFFFFFF, true, "Password: " + POOZNYPH.method418(field403) + (field234 == 1 & field203 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field219.method500(var10 - 73, var11 - 20);
				field479.method574(0xFFFFFF, var10, "Login", var11 + 5, true);
				int var12 = var2 / 2 + 80;
				field219.method500(var12 - 73, var11 - 20);
				field479.method574(0xFFFFFF, var12, "Cancel", var11 + 5, true);
			}
		}

		if (field448 == 3) {
			field479.method574(0xFFFF00, var2 / 2, "Create a free account", var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			field479.method574(0xFFFFFF, var2 / 2, "To create a new account you need to", var13, true);
			var13 += 15;
			field479.method574(0xFFFFFF, var2 / 2, "go back to the main RuneScape webpage", var13, true);
			var13 += 15;
			field479.method574(0xFFFFFF, var2 / 2, "and choose the red 'create account'", var13, true);
			var13 += 15;
			field479.method574(0xFFFFFF, var2 / 2, "button at the top right of that page.", var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field219.method500(var14 - 73, var15 - 20);
			field479.method574(0xFFFFFF, var14, "Cancel", var15 + 5, true);
		}

		field167.method14(field506, 202, 171);

		if (field77) {
			field77 = false;
			field165.method14(field506, 128, 0);
			field166.method14(field506, 202, 371);
			field170.method14(field506, 0, 265);
			field171.method14(field506, 562, 265);
			field172.method14(field506, 128, 171);
			field173.method14(field506, 562, 171);
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method60() {
		if (field78 == 0 && field520 == 1) {
			int var1 = field521 - 25 - 550;
			int var2 = field522 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field327 + field323 & 0x7FF;
				int var4 = QVVCPQSC.field1094[var3];
				int var5 = QVVCPQSC.field1095[var3];
				var4 = (field110 + 256) * var4 >> 8;
				var5 = (field110 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field73.field706 + var6 >> 7;
				int var9 = field73.field707 - var7 >> 7;
				boolean var10 = method66(1, 0, 0, 0, var9, 0, true, 0, field73.field746[0], field73.field747[0], var8);
				if (var10) {
					field265.method282(var1);
					field265.method282(var2);
					field265.method283(field327);
					field265.method282(57);
					field265.method282(field323);
					field265.method282(field110);
					field265.method282(89);
					field265.method283(field73.field706);
					field265.method283(field73.field707);
					field265.method282(field252);
					field265.method282(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
			if (field344 && field315 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field322.method535(arg1, arg2, arg0);
			}

			if (arg6 == 1) {
				var8 = field322.method536(arg1, arg0, arg2);
			}

			if (arg6 == 2) {
				var8 = field322.method537(arg1, arg2, arg0);
			}

			if (arg6 == 3) {
				var8 = field322.method538(arg1, arg2, arg0);
			}

			if (var8 != 0) {
				int var12 = field322.method539(arg1, arg2, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field322.method526(arg2, arg1, arg0);
					PFIKHQJO var16 = PFIKHQJO.method405(var13);
					if (var16.field974) {
						field421[arg1].method273(var15, arg2, arg0, var14, var16.field1001);
					}
				}

				if (arg6 == 1) {
					field322.method527(arg1, arg2, arg0);
				}

				if (arg6 == 2) {
					field322.method528(arg1, arg0, arg2);
					PFIKHQJO var17 = PFIKHQJO.method405(var13);
					if (var17.field966 + arg2 > 103 || var17.field966 + arg0 > 103 || var17.field995 + arg2 > 103 || var17.field995 + arg0 > 103) {
						return;
					}

					if (var17.field974) {
						field421[arg1].method274(var17.field1001, arg2, arg0, var17.field966, var15, var17.field995);
					}
				}

				if (arg6 == 3) {
					field322.method529(arg1, arg0, arg2);
					PFIKHQJO var18 = PFIKHQJO.method405(var13);
					if (var18.field974 && var18.field983) {
						field421[arg1].method276(arg2, arg0);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field175[1][arg2][arg0] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				SNGUFYDX.method475(field322, field325, arg4, arg5, arg1, arg0, field421[arg1], var19, arg3, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method62() {
		method79("Starting up", 20);

		if (signlink.sunjava) {
			field500 = 5;
		}

		if (field131) {
			field191 = true;
		} else {
			field131 = true;
			boolean var1 = false;
			String var2 = method113();
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
						field287[var3] = new DQPGJUSB(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method94();
					field186 = method97(field446[1], 1, "title", 25, "title screen");
					field477 = new YZXOZYLM(field186, "p11_full", false);
					field478 = new YZXOZYLM(field186, "p12_full", false);
					field479 = new YZXOZYLM(field186, "b12_full", false);
					field480 = new YZXOZYLM(field186, "q8_full", true);
					method45();
					method57();
					FIGUVTWB var4 = method97(field446[2], 2, "config", 30, "config");
					FIGUVTWB var5 = method97(field446[3], 3, "interface", 35, "interface");
					FIGUVTWB var6 = method97(field446[4], 4, "media", 40, "2d graphics");
					FIGUVTWB var7 = method97(field446[6], 6, "textures", 45, "textures");
					FIGUVTWB var8 = method97(field446[7], 7, "wordenc", 50, "chat system");
					FIGUVTWB var9 = method97(field446[8], 8, "sounds", 55, "sound effects");
					field175 = new byte[4][104][104];
					field325 = new int[4][105][105];
					field322 = new UWQNYVPL(104, 104, field325, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field421[var10] = new MNHXSMWL(104, 104);
					}

					field282 = new EYTQJNEM(512, 512);
					FIGUVTWB var11 = method97(field446[5], 5, "versionlist", 60, "update list");
					method79("Connecting to update server", 60);
					field185 = new FRNMNGGN();
					field185.method225(var11, this);
					TDFMBTLA.method487(field185.method226());
					NJPATAFL.method331(field185.method216(0), field185);

					if (!field344) {
						field412 = 0;
						try {
							field412 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field413 = true;
						field185.method229(2, field412);

						while (field185.method219() > 0) {
							method145();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field185.field628 > 3) {
								method154("ondemand");
								return;
							}
						}
					}

					method79("Requesting animations", 65);
					int var12 = field185.method216(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field185.method229(1, var13);
					}

					while (field185.method219() > 0) {
						int var14 = var12 - field185.method219();
						if (var14 > 0) {
							method79("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method145();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field185.field628 > 3) {
							method154("ondemand");
							return;
						}
					}

					method79("Requesting models", 70);
					int var15 = field185.method216(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field185.method220(var16);
						if ((var17 & 0x1) != 0) {
							field185.method229(0, var16);
						}
					}

					int var18 = field185.method219();
					while (field185.method219() > 0) {
						int var19 = var18 - field185.method219();
						if (var19 > 0) {
							method79("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method145();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field287[0] != null) {
						method79("Requesting maps", 75);
						field185.method229(3, field185.method236(0, 47, 48));
						field185.method229(3, field185.method236(1, 47, 48));
						field185.method229(3, field185.method236(0, 48, 48));
						field185.method229(3, field185.method236(1, 48, 48));
						field185.method229(3, field185.method236(0, 49, 48));
						field185.method229(3, field185.method236(1, 49, 48));
						field185.method229(3, field185.method236(0, 47, 47));
						field185.method229(3, field185.method236(1, 47, 47));
						field185.method229(3, field185.method236(0, 48, 47));
						field185.method229(3, field185.method236(1, 48, 47));
						field185.method229(3, field185.method236(0, 48, 148));
						field185.method229(3, field185.method236(1, 48, 148));
						int var20 = field185.method219();
						while (field185.method219() > 0) {
							int var21 = var20 - field185.method219();
							if (var21 > 0) {
								method79("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method145();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field185.method216(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field185.method220(var23);
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
							field185.method217(0, var25, var23);
						}
					}

					field185.method234(field343);

					if (!field344) {
						int var26 = field185.method216(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field185.method218(var27)) {
								field185.method217(2, (byte) 1, var27);
							}
						}
					}

					method79("Unpacking media", 80);
					field316 = new TOROBAKX(var6, "invback", 0);
					field318 = new TOROBAKX(var6, "chatback", 0);
					field317 = new TOROBAKX(var6, "mapback", 0);
					field307 = new TOROBAKX(var6, "backbase1", 0);
					field308 = new TOROBAKX(var6, "backbase2", 0);
					field309 = new TOROBAKX(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field190[var28] = new TOROBAKX(var6, "sideicons", var28);
					}

					field99 = new EYTQJNEM(var6, "compass", 0);
					field349 = new EYTQJNEM(var6, "mapedge", 0);
					field349.method190();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field157[var29] = new TOROBAKX(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field359[var30] = new EYTQJNEM(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field458[var31] = new EYTQJNEM(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field407[var32] = new EYTQJNEM(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field347 = new EYTQJNEM(var6, "mapmarker", 0);
					field348 = new EYTQJNEM(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field457[var33] = new EYTQJNEM(var6, "cross", var33);
					}

					field434 = new EYTQJNEM(var6, "mapdots", 0);
					field435 = new EYTQJNEM(var6, "mapdots", 1);
					field436 = new EYTQJNEM(var6, "mapdots", 2);
					field437 = new EYTQJNEM(var6, "mapdots", 3);
					field438 = new EYTQJNEM(var6, "mapdots", 4);
					field145 = new TOROBAKX(var6, "scrollbar", 0);
					field146 = new TOROBAKX(var6, "scrollbar", 1);
					field383 = new TOROBAKX(var6, "redstone1", 0);
					field384 = new TOROBAKX(var6, "redstone2", 0);
					field385 = new TOROBAKX(var6, "redstone3", 0);
					field386 = new TOROBAKX(var6, "redstone1", 0);
					field386.method497();
					field387 = new TOROBAKX(var6, "redstone2", 0);
					field387.method497();
					field415 = new TOROBAKX(var6, "redstone1", 0);
					field415.method498();
					field416 = new TOROBAKX(var6, "redstone2", 0);
					field416.method498();
					field417 = new TOROBAKX(var6, "redstone3", 0);
					field417.method498();
					field418 = new TOROBAKX(var6, "redstone1", 0);
					field418.method497();
					field418.method498();
					field419 = new TOROBAKX(var6, "redstone2", 0);
					field419.method497();
					field419.method498();

					for (int var34 = 0; var34 < 2; var34++) {
						field283[var34] = new TOROBAKX(var6, "mod_icons", var34);
					}

					EYTQJNEM var35 = new EYTQJNEM(var6, "backleft1", 0);
					field332 = new ARAKDHLD(var35.field554, method135(), var35.field553);
					var35.method191(0, 0);
					EYTQJNEM var36 = new EYTQJNEM(var6, "backleft2", 0);
					field333 = new ARAKDHLD(var36.field554, method135(), var36.field553);
					var36.method191(0, 0);
					EYTQJNEM var37 = new EYTQJNEM(var6, "backright1", 0);
					field334 = new ARAKDHLD(var37.field554, method135(), var37.field553);
					var37.method191(0, 0);
					EYTQJNEM var38 = new EYTQJNEM(var6, "backright2", 0);
					field335 = new ARAKDHLD(var38.field554, method135(), var38.field553);
					var38.method191(0, 0);
					EYTQJNEM var39 = new EYTQJNEM(var6, "backtop1", 0);
					field336 = new ARAKDHLD(var39.field554, method135(), var39.field553);
					var39.method191(0, 0);
					EYTQJNEM var40 = new EYTQJNEM(var6, "backvmid1", 0);
					field337 = new ARAKDHLD(var40.field554, method135(), var40.field553);
					var40.method191(0, 0);
					EYTQJNEM var41 = new EYTQJNEM(var6, "backvmid2", 0);
					field338 = new ARAKDHLD(var41.field554, method135(), var41.field553);
					var41.method191(0, 0);
					EYTQJNEM var42 = new EYTQJNEM(var6, "backvmid3", 0);
					field339 = new ARAKDHLD(var42.field554, method135(), var42.field553);
					var42.method191(0, 0);
					EYTQJNEM var43 = new EYTQJNEM(var6, "backhmid2", 0);
					field340 = new ARAKDHLD(var43.field554, method135(), var43.field553);
					var43.method191(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field359[var48] != null) {
							field359[var48].method189(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field157[var48] != null) {
							field157[var48].method499(var44 + var47, var46 + var47, var45 + var47);
						}
					}

					method79("Unpacking textures", 83);
					QVVCPQSC.method438(var7);
					QVVCPQSC.method442(0.8D);
					QVVCPQSC.method437(20);
					method79("Unpacking config", 86);
					TLXFHCOO.method492(var4);
					PFIKHQJO.method407(var4);
					YTVETJJL.method568(var4);
					PZNZFKPU.method420(var4);
					BYABUZFP.method29(var4);
					CWWAFTAL.method173(var4);
					SNGXEJOJ.method476(var4);
					ONNQWBMW.method398(var4);
					FTZZSWCP.method238(var4);
					PZNZFKPU.field1014 = field343;

					if (!field344) {
						method79("Unpacking sounds", 90);
						byte[] var49 = var9.method209("sounds.dat", null);
						MUKVLYLC var50 = new MUKVLYLC(var49);
						JDPRJRPB.method254(var50);
					}

					method79("Unpacking interfaces", 95);
					YZXOZYLM[] var51 = new YZXOZYLM[] { field477, field478, field479, field480 };
					UKJEXUVU.method506(var51, var5, var6);
					method79("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field317.field1258[field317.field1260 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field92[var52] = var53;
						field74[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field317.field1258[field317.field1260 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field459[var56 - 5] = var57 - 25;
						field227[var56 - 5] = var58 - var57;
					}

					QVVCPQSC.method435(479, 96);
					field128 = QVVCPQSC.field1096;
					QVVCPQSC.method435(190, 261);
					field129 = QVVCPQSC.field1096;
					QVVCPQSC.method435(512, 334);
					field130 = QVVCPQSC.field1096;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = QVVCPQSC.field1094[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					UWQNYVPL.method545(800, 334, 500, 512, var60);
					OCOLATKS.method359(var8);
					field229 = new ZZMUCPQP(this);
					method101(field229, 10);
					HZQUFYDK.field689 = this;
					PFIKHQJO.field987 = this;
					BYABUZFP.field54 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field187 + " " + field489);
					field174 = true;
				}
			} else {
				field404 = true;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method63() {
		if (field161 == null) {
			method93();
			field507 = null;
			field165 = null;
			field166 = null;
			field167 = null;
			field168 = null;
			field169 = null;
			field170 = null;
			field171 = null;
			field172 = null;
			field173 = null;
			field161 = new ARAKDHLD(96, method135(), 479);
			field159 = new ARAKDHLD(156, method135(), 172);
			ACKHPAZA.method4();
			field317.method500(0, 0);
			field158 = new ARAKDHLD(261, method135(), 190);
			field160 = new ARAKDHLD(334, method135(), 512);
			ACKHPAZA.method4();
			field378 = new ARAKDHLD(50, method135(), 496);
			field379 = new ARAKDHLD(37, method135(), 269);
			field380 = new ARAKDHLD(45, method135(), 249);
			field77 = true;
		}
	}

	@ObfuscatedName("client.b(ILMUKVLYLC;I)V")
	public final void method64(MUKVLYLC arg0, int arg1) {
		field422 = 0;
		field367 = 0;
		method84(arg0, arg1);
		method137(arg1, arg0);
		method88(arg0, arg1);
		method67(arg0, arg1);

		for (int var3 = 0; var3 < field422; var3++) {
			int var4 = field423[var3];
			if (field203 != field364[var4].field735) {
				field364[var4] = null;
			}
		}

		if (arg0.field812 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field812 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field365; var5++) {
			if (field364[field366[var5]] == null) {
				signlink.reporterror(field402 + " null entry in pl list - pos:" + var5 + " size:" + field365);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZIILUKJEXUVU;)V")
	public final void method65(int arg0, int arg1, int arg2, UKJEXUVU arg3) {
		if (arg3.field1317 == 0 && arg3.field1311 != null && (!arg3.field1330 || field225 == arg3.field1301 || field381 == arg3.field1301 || field253 == arg3.field1301)) {
			int var5 = ACKHPAZA.field6;
			int var6 = ACKHPAZA.field4;
			int var7 = ACKHPAZA.field7;
			int var8 = ACKHPAZA.field5;
			ACKHPAZA.method3(arg0, arg3.field1342 + arg2, arg2, arg3.field1336 + arg0);
			int var9 = arg3.field1311.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field1288[var10] + arg2;
				int var12 = arg3.field1333[var10] + arg0 - arg1;
				UKJEXUVU var13 = UKJEXUVU.field1300[arg3.field1311[var10]];
				var11 += var13.field1302;
				var12 += var13.field1296;

				if (var13.field1294 > 0) {
					method161(var13);
				}

				if (var13.field1317 == 0) {
					if (var13.field1327 > var13.field1289 - var13.field1336) {
						var13.field1327 = var13.field1289 - var13.field1336;
					}

					if (var13.field1327 < 0) {
						var13.field1327 = 0;
					}

					method65(var12, var13.field1327, var11, var13);

					if (var13.field1289 > var13.field1336) {
						method121(var12, var13.field1342 + var11, var13.field1289, var13.field1336, var13.field1327);
					}
				} else if (var13.field1317 != 1) {
					if (var13.field1317 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1336; var15++) {
							for (int var16 = 0; var16 < var13.field1342; var16++) {
								int var17 = (var13.field1322 + 32) * var16 + var11;
								int var18 = (var13.field1345 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1284[var14];
									var18 += var13.field1292[var14];
								}

								if (var13.field1287[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1287[var14] - 1;
									if (var17 > ACKHPAZA.field6 - 32 && var17 < ACKHPAZA.field7 && var18 > ACKHPAZA.field4 - 32 && var18 < ACKHPAZA.field5 || field142 != 0 && field141 == var14) {
										int var22 = 0;
										if (field390 == 1 && field391 == var14 && field392 == var13.field1301) {
											var22 = 0xFFFFFF;
										}

										EYTQJNEM var23 = PZNZFKPU.method424(var13.field1339[var14], var22, var21);
										if (var23 != null) {
											if (field142 != 0 && field141 == var14 && field140 == var13.field1301) {
												var19 = field514 - field143;
												var20 = field515 - field144;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field460 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method195(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < ACKHPAZA.field4 && arg3.field1327 > 0) {
													int var24 = (ACKHPAZA.field4 - var18 - var20) * field109 / 3;
													if (var24 > field109 * 10) {
														var24 = field109 * 10;
													}

													if (var24 > arg3.field1327) {
														var24 = arg3.field1327;
													}

													arg3.field1327 -= var24;
													field144 += var24;
												}

												if (var18 + var20 + 32 > ACKHPAZA.field5 && arg3.field1327 < arg3.field1289 - arg3.field1336) {
													int var25 = (var18 + var20 + 32 - ACKHPAZA.field5) * field109 / 3;
													if (var25 > field109 * 10) {
														var25 = field109 * 10;
													}

													if (var25 > arg3.field1289 - arg3.field1336 - arg3.field1327) {
														var25 = arg3.field1289 - arg3.field1336 - arg3.field1327;
													}

													arg3.field1327 += var25;
													field144 -= var25;
												}
											} else if (field427 != 0 && field426 == var14 && field425 == var13.field1301) {
												var23.method195(var17, var18, 128);
											} else {
												var23.method193(var17, var18);
											}

											if (var23.field557 == 33 || var13.field1339[var14] != 1) {
												int var26 = var13.field1339[var14];
												field477.method577(var18 + var20 + 10, method90(var26), var17 + var19 + 1, 0);
												field477.method577(var18 + var20 + 9, method90(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1308 != null && var14 < 20) {
									EYTQJNEM var27 = var13.field1308[var14];
									if (var27 != null) {
										var27.method193(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1317 == 3) {
						boolean var28 = false;
						if (field253 == var13.field1301 || field381 == var13.field1301 || field225 == var13.field1301) {
							var28 = true;
						}

						int var29;
						if (method148(var13)) {
							var29 = var13.field1290;
							if (var28 && var13.field1303 != 0) {
								var29 = var13.field1303;
							}
						} else {
							var29 = var13.field1343;
							if (var28 && var13.field1329 != 0) {
								var29 = var13.field1329;
							}
						}

						if (var13.field1285 == 0) {
							if (var13.field1314) {
								ACKHPAZA.method6(var13.field1342, var13.field1336, var12, var29, var11);
							} else {
								ACKHPAZA.method7(var11, var12, var29, var13.field1342, var13.field1336);
							}
						} else if (var13.field1314) {
							ACKHPAZA.method5(256 - (var13.field1285 & 0xFF), var11, var13.field1336, var29, var13.field1342, var12);
						} else {
							ACKHPAZA.method8(var11, var29, var13.field1342, 256 - (var13.field1285 & 0xFF), var13.field1336, var12);
						}
					} else if (var13.field1317 == 4) {
						YZXOZYLM var30 = var13.field1331;
						String var31 = var13.field1304;
						boolean var32 = false;
						if (field253 == var13.field1301 || field381 == var13.field1301 || field225 == var13.field1301) {
							var32 = true;
						}

						int var33;
						if (method148(var13)) {
							var33 = var13.field1290;
							if (var32 && var13.field1303 != 0) {
								var33 = var13.field1303;
							}

							if (var13.field1340.length() > 0) {
								var31 = var13.field1340;
							}
						} else {
							var33 = var13.field1343;
							if (var32 && var13.field1329 != 0) {
								var33 = var13.field1329;
							}
						}

						if (var13.field1313 == 6 && field121) {
							var31 = "Please wait...";
							var33 = var13.field1343;
						}

						if (ACKHPAZA.field2 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1454 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method125(method147(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method125(method147(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method125(method147(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method125(method147(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method125(method147(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1338) {
								var30.method574(var33, var13.field1342 / 2 + var11, var41, var34, var13.field1344);
							} else {
								var30.method581(var34, var11, var33, var13.field1344, var41);
							}

							var34 += var30.field1454;
						}
					} else if (var13.field1317 == 5) {
						EYTQJNEM var42;
						if (method148(var13)) {
							var42 = var13.field1335;
						} else {
							var42 = var13.field1315;
						}

						if (var42 != null) {
							var42.method193(var11, var12);
						}
					} else if (var13.field1317 == 6) {
						int var43 = QVVCPQSC.field1090;
						int var44 = QVVCPQSC.field1091;
						QVVCPQSC.field1090 = var13.field1342 / 2 + var11;
						QVVCPQSC.field1091 = var13.field1336 / 2 + var12;
						int var45 = QVVCPQSC.field1094[var13.field1298] * var13.field1297 >> 16;
						int var46 = QVVCPQSC.field1095[var13.field1298] * var13.field1297 >> 16;
						boolean var47 = method148(var13);
						int var48;
						if (var47) {
							var48 = var13.field1310;
						} else {
							var48 = var13.field1309;
						}

						NJPATAFL var49;
						if (var48 == -1) {
							var49 = var13.method504(var47, -1, -1);
						} else {
							TLXFHCOO var50 = TLXFHCOO.field1242[var48];
							var49 = var13.method504(var47, var50.field1245[var13.field1316], var50.field1244[var13.field1316]);
						}

						if (var49 != null) {
							var49.method354(0, var13.field1299, 0, var13.field1298, 0, var45, var46);
						}

						QVVCPQSC.field1090 = var43;
						QVVCPQSC.field1091 = var44;
					} else if (var13.field1317 == 7) {
						YZXOZYLM var51 = var13.field1331;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1336; var53++) {
							for (int var54 = 0; var54 < var13.field1342; var54++) {
								if (var13.field1287[var52] > 0) {
									PZNZFKPU var55 = PZNZFKPU.method428(var13.field1287[var52] - 1);
									String var56 = var55.field1043;
									if (var55.field1036 || var13.field1339[var52] != 1) {
										var56 = var56 + " x" + method96(var13.field1339[var52]);
									}

									int var57 = (var13.field1322 + 115) * var54 + var11;
									int var58 = (var13.field1345 + 12) * var53 + var12;
									if (var13.field1338) {
										var51.method574(var13.field1343, var13.field1342 / 2 + var57, var56, var58, var13.field1344);
									} else {
										var51.method581(var58, var57, var13.field1343, var13.field1344, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			ACKHPAZA.method3(var6, var7, var5, var8);
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIIIIZIIII)Z")
	public final boolean method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field301[var14][var15] = 0;
				field355[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg9;
		field301[arg8][arg9] = 99;
		field355[arg8][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field245[var18] = arg8;
		int var35 = var18 + 1;
		field246[var18] = arg9;
		boolean var20 = false;
		int var21 = field245.length;
		int[][] var22 = field421[field315].field793;
		while (var35 != var19) {
			var16 = field245[var19];
			var17 = field246[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field421[field315].method277(arg10, arg4, var17, arg7, var16, arg2 - 1)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field421[field315].method278(arg2 - 1, var16, arg10, arg7, arg4, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg1 != 0 && field421[field315].method279(arg5, arg4, var16, var17, arg10, arg3, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field355[var16][var17] + 1;
			if (var16 > 0 && field301[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field245[var35] = var16 - 1;
				field246[var35] = var17;
				var35 = (var35 + 1) % var21;
				field301[var16 - 1][var17] = 2;
				field355[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field301[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field245[var35] = var16 + 1;
				field246[var35] = var17;
				var35 = (var35 + 1) % var21;
				field301[var16 + 1][var17] = 8;
				field355[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field301[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field245[var35] = var16;
				field246[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field301[var16][var17 - 1] = 1;
				field355[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field301[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field245[var35] = var16;
				field246[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field301[var16][var17 + 1] = 4;
				field355[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field301[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field245[var35] = var16 - 1;
				field246[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field301[var16 - 1][var17 - 1] = 3;
				field355[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field301[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field245[var35] = var16 + 1;
				field246[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field301[var16 + 1][var17 - 1] = 9;
				field355[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field301[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field245[var35] = var16 - 1;
				field246[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field301[var16 - 1][var17 + 1] = 6;
				field355[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field301[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field245[var35] = var16 + 1;
				field246[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field301[var16 + 1][var17 + 1] = 12;
				field355[var16 + 1][var17 + 1] = var23;
			}
		}

		field252 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg10 - var25; var26 <= arg10 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field355[var26][var27] < var24) {
								var24 = field355[var26][var27];
								var16 = var26;
								var17 = var27;
								field252 = 1;
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
		field245[var28] = var16;
		int var36 = var28 + 1;
		field246[var28] = var17;
		int var29;
		int var30 = var29 = field301[var16][var17];
		while (arg8 != var16 || arg9 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field245[var36] = var16;
				field246[var36++] = var17;
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

			var30 = field301[var16][var17];
		}

		if (var36 <= 0) {
			if (arg0 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field245[var36];
		int var33 = field246[var36];

		if (arg0 == 0) {
			field265.method281(67);
			field265.method282(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field265.method281(93);
			field265.method282(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field265.method281(255);
			field265.method282(var31 + var31 + 3);
		}

		field280 = field245[0];
		field281 = field246[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field265.method309(field245[var36] - var32);
			field265.method282(field246[var36] - var33);
		}

		field265.method316(field122 + var32);
		field265.method317(field123 + var33);
		field265.method282(field524[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(ZLMUKVLYLC;I)V")
	public final void method67(MUKVLYLC arg0, int arg1) {
		for (int var3 = 0; var3 < field367; var3++) {
			int var4 = field368[var3];
			HPYXKOFA var5 = field364[var4];
			int var6 = arg0.method292();
			if ((var6 & 0x80) != 0) {
				var6 += arg0.method292() << 8;
			}

			method143(var6, arg0, var5, var4);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method68() {
		if (field90 > 0) {
			method171();
		} else {
			field160.method13();
			field478.method573("Connection lost", 144, 257, 0);
			field478.method573("Connection lost", 143, 256, 0xFFFFFF);
			field478.method573("Please wait - attempting to reestablish", 159, 257, 0);
			field478.method573("Please wait - attempting to reestablish", 158, 256, 0xFFFFFF);
			field160.method14(field506, 4, 4);
			field78 = 0;
			field280 = 0;
			FLUCRVAS var1 = field214;
			field115 = false;
			field430 = 0;
			method44(field402, field403, true);

			if (!field115) {
				method171();
			}

			try {
				var1.method210();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method69() {
		for (int var1 = 0; var1 < field134; var1++) {
			int var2 = field135[var1];
			PNBDNSXO var3 = field133[var2];
			if (var3 != null) {
				method70(var3.field1003.field41, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILITPGSHXV;I)V")
	public final void method70(int arg0, ITPGSHXV arg1) {
		if (arg1.field706 < 128 || arg1.field707 < 128 || arg1.field706 >= 13184 || arg1.field707 >= 13184) {
			arg1.field700 = -1;
			arg1.field736 = -1;
			arg1.field732 = 0;
			arg1.field733 = 0;
			arg1.field706 = arg1.field746[0] * 128 + arg1.field749 * 64;
			arg1.field707 = arg1.field747[0] * 128 + arg1.field749 * 64;
			arg1.method246();
		}

		if (field73 == arg1 && (arg1.field706 < 1536 || arg1.field707 < 1536 || arg1.field706 >= 11776 || arg1.field707 >= 11776)) {
			arg1.field700 = -1;
			arg1.field736 = -1;
			arg1.field732 = 0;
			arg1.field733 = 0;
			arg1.field706 = arg1.field746[0] * 128 + arg1.field749 * 64;
			arg1.field707 = arg1.field747[0] * 128 + arg1.field749 * 64;
			arg1.method246();
		}

		if (arg1.field732 > field203) {
			method71(arg1);
		} else if (arg1.field733 >= field203) {
			method72(arg1);
		} else {
			method73(arg1);
		}

		method74(arg1);
		method75(arg1);
	}

	@ObfuscatedName("client.a(LITPGSHXV;I)V")
	public final void method71(ITPGSHXV arg0) {
		int var2 = arg0.field732 - field203;
		int var3 = arg0.field749 * 64 + arg0.field728 * 128;
		int var4 = arg0.field749 * 64 + arg0.field730 * 128;
		arg0.field706 += (var3 - arg0.field706) / var2;
		arg0.field707 += (var4 - arg0.field707) / var2;
		arg0.field723 = 0;

		if (arg0.field734 == 0) {
			arg0.field699 = 1024;
		}

		if (arg0.field734 == 1) {
			arg0.field699 = 1536;
		}

		if (arg0.field734 == 2) {
			arg0.field699 = 0;
		}

		if (arg0.field734 == 3) {
			arg0.field699 = 512;
		}
	}

	@ObfuscatedName("client.b(LITPGSHXV;I)V")
	public final void method72(ITPGSHXV arg0) {
		if (field203 == arg0.field733 || arg0.field700 == -1 || arg0.field703 != 0 || arg0.field702 + 1 > TLXFHCOO.field1242[arg0.field700].method493(arg0.field701)) {
			int var2 = arg0.field733 - arg0.field732;
			int var3 = field203 - arg0.field732;
			int var4 = arg0.field749 * 64 + arg0.field728 * 128;
			int var5 = arg0.field749 * 64 + arg0.field730 * 128;
			int var6 = arg0.field749 * 64 + arg0.field729 * 128;
			int var7 = arg0.field749 * 64 + arg0.field731 * 128;
			arg0.field706 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field707 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field723 = 0;

		if (arg0.field734 == 0) {
			arg0.field699 = 1024;
		}

		if (arg0.field734 == 1) {
			arg0.field699 = 1536;
		}

		if (arg0.field734 == 2) {
			arg0.field699 = 0;
		}

		if (arg0.field734 == 3) {
			arg0.field699 = 512;
		}

		arg0.field708 = arg0.field699;
	}

	@ObfuscatedName("client.a(ILITPGSHXV;)V")
	public final void method73(ITPGSHXV arg0) {
		arg0.field712 = arg0.field726;
		if (arg0.field715 == 0) {
			arg0.field723 = 0;
		} else {
			if (arg0.field700 != -1 && arg0.field703 == 0) {
				TLXFHCOO var2 = TLXFHCOO.field1242[arg0.field700];
				if (arg0.field748 > 0 && var2.field1254 == 0) {
					arg0.field723++;
					return;
				}

				if (arg0.field748 <= 0 && var2.field1255 == 0) {
					arg0.field723++;
					return;
				}
			}

			int var3 = arg0.field706;
			int var4 = arg0.field707;
			int var5 = arg0.field746[arg0.field715 - 1] * 128 + arg0.field749 * 64;
			int var6 = arg0.field747[arg0.field715 - 1] * 128 + arg0.field749 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field699 = 1280;
					} else if (var4 > var6) {
						arg0.field699 = 1792;
					} else {
						arg0.field699 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field699 = 768;
					} else if (var4 > var6) {
						arg0.field699 = 256;
					} else {
						arg0.field699 = 512;
					}
				} else if (var4 < var6) {
					arg0.field699 = 1024;
				} else {
					arg0.field699 = 0;
				}

				int var7 = arg0.field699 - arg0.field708 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field742;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field741;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field744;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field743;
				}

				if (var8 == -1) {
					var8 = arg0.field741;
				}

				arg0.field712 = var8;
				int var9 = 4;
				if (arg0.field708 != arg0.field699 && arg0.field721 == -1 && arg0.field745 != 0) {
					var9 = 2;
				}

				if (arg0.field715 > 2) {
					var9 = 6;
				}

				if (arg0.field715 > 3) {
					var9 = 8;
				}

				if (arg0.field723 > 0 && arg0.field715 > 1) {
					var9 = 8;
					arg0.field723--;
				}

				if (arg0.field716[arg0.field715 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field741 == arg0.field712 && arg0.field711 != -1) {
					arg0.field712 = arg0.field711;
				}

				if (var3 < var5) {
					arg0.field706 += var9;
					if (arg0.field706 > var5) {
						arg0.field706 = var5;
					}
				} else if (var3 > var5) {
					arg0.field706 -= var9;
					if (arg0.field706 < var5) {
						arg0.field706 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field707 += var9;
					if (arg0.field707 > var6) {
						arg0.field707 = var6;
					}
				} else if (var4 > var6) {
					arg0.field707 -= var9;
					if (arg0.field707 < var6) {
						arg0.field707 = var6;
					}
				}

				if (arg0.field706 == var5 && arg0.field707 == var6) {
					arg0.field715--;

					if (arg0.field748 > 0) {
						arg0.field748--;
						return;
					}
				}
			} else {
				arg0.field706 = var5;
				arg0.field707 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(LITPGSHXV;I)V")
	public final void method74(ITPGSHXV arg0) {
		if (arg0.field745 != 0) {
			if (arg0.field721 != -1 && arg0.field721 < 32768) {
				PNBDNSXO var2 = field133[arg0.field721];
				if (var2 != null) {
					int var3 = arg0.field706 - var2.field706;
					int var4 = arg0.field707 - var2.field707;
					if (var3 != 0 || var4 != 0) {
						arg0.field699 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field721 >= 32768) {
				int var5 = arg0.field721 - 32768;
				if (field262 == var5) {
					var5 = field363;
				}

				HPYXKOFA var6 = field364[var5];
				if (var6 != null) {
					int var7 = arg0.field706 - var6.field706;
					int var8 = arg0.field707 - var6.field707;
					if (var7 != 0 || var8 != 0) {
						arg0.field699 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field724 != 0 || arg0.field725 != 0) && (arg0.field715 == 0 || arg0.field723 > 0)) {
				int var9 = arg0.field706 - (arg0.field724 - field122 - field122) * 64;
				int var10 = arg0.field707 - (arg0.field725 - field123 - field123) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field699 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field724 = 0;
				arg0.field725 = 0;
			}

			int var11 = arg0.field699 - arg0.field708 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field745 || var11 > 2048 - arg0.field745) {
					arg0.field708 = arg0.field699;
				} else if (var11 > 1024) {
					arg0.field708 -= arg0.field745;
				} else {
					arg0.field708 += arg0.field745;
				}

				arg0.field708 &= 0x7FF;
				if (arg0.field726 == arg0.field712 && arg0.field708 != arg0.field699) {
					if (arg0.field727 != -1) {
						arg0.field712 = arg0.field727;
						return;
					}

					arg0.field712 = arg0.field741;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILITPGSHXV;)V")
	public final void method75(ITPGSHXV arg0) {
		arg0.field717 = false;

		if (arg0.field712 != -1) {
			TLXFHCOO var2 = TLXFHCOO.field1242[arg0.field712];
			arg0.field714++;
			if (arg0.field713 < var2.field1243 && arg0.field714 > var2.method493(arg0.field713)) {
				arg0.field714 = 0;
				arg0.field713++;
			}

			if (arg0.field713 >= var2.field1243) {
				arg0.field714 = 0;
				arg0.field713 = 0;
			}
		}

		if (arg0.field736 != -1 && field203 >= arg0.field739) {
			if (arg0.field737 < 0) {
				arg0.field737 = 0;
			}

			TLXFHCOO var3 = SNGXEJOJ.field1217[arg0.field736].field1221;
			arg0.field738++;
			while (arg0.field737 < var3.field1243 && arg0.field738 > var3.method493(arg0.field737)) {
				arg0.field738 -= var3.method493(arg0.field737);
				arg0.field737++;
			}

			if (arg0.field737 >= var3.field1243 && (arg0.field737 < 0 || arg0.field737 >= var3.field1243)) {
				arg0.field736 = -1;
			}
		}

		if (arg0.field700 != -1 && arg0.field703 <= 1) {
			TLXFHCOO var4 = TLXFHCOO.field1242[arg0.field700];
			if (var4.field1254 == 1 && arg0.field748 > 0 && arg0.field732 <= field203 && arg0.field733 < field203) {
				arg0.field703 = 1;
				return;
			}
		}

		if (arg0.field700 != -1 && arg0.field703 == 0) {
			TLXFHCOO var5 = TLXFHCOO.field1242[arg0.field700];
			arg0.field702++;
			while (arg0.field701 < var5.field1243 && arg0.field702 > var5.method493(arg0.field701)) {
				arg0.field702 -= var5.method493(arg0.field701);
				arg0.field701++;
			}

			if (arg0.field701 >= var5.field1243) {
				arg0.field701 -= var5.field1247;
				arg0.field704++;
				if (arg0.field704 >= var5.field1253) {
					arg0.field700 = -1;
				}

				if (arg0.field701 < 0 || arg0.field701 >= var5.field1243) {
					arg0.field700 = -1;
				}
			}

			arg0.field717 = var5.field1249;
		}

		if (arg0.field703 > 0) {
			arg0.field703--;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method76() {
		if (field77) {
			field77 = false;
			field332.method14(field506, 0, 4);
			field333.method14(field506, 0, 357);
			field334.method14(field506, 722, 4);
			field335.method14(field506, 743, 205);
			field336.method14(field506, 0, 0);
			field337.method14(field506, 516, 4);
			field338.method14(field506, 516, 205);
			field339.method14(field506, 496, 357);
			field340.method14(field506, 0, 338);
			field112 = true;
			field222 = true;
			field120 = true;
			field273 = true;

			if (field277 != 2) {
				field160.method14(field506, 4, 4);
				field159.method14(field506, 550, 4);
			}
		}

		if (field277 == 2) {
			method109();
		}

		if (field464 && field196 == 1) {
			field112 = true;
		}

		if (field453 != -1) {
			boolean var1 = method81(field109, field453);
			if (var1) {
				field112 = true;
			}
		}

		if (field427 == 2) {
			field112 = true;
		}

		if (field142 == 2) {
			field112 = true;
		}

		if (field112) {
			method89();
			field112 = false;
		}

		field204++;
		if (field204 > 197) {
			field204 = 0;
			field265.method281(214);
			field265.method286(0);
		}

		if (field98 == -1) {
			field409.field1327 = field72 - field279 - 77;

			if (field514 > 448 && field514 < 560 && field515 > 332) {
				method115(false, 0, field409, field72, 463, field515 - 357, 77, field514 - 17);
			}

			int var2 = field72 - field409.field1327 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field72 - 77) {
				var2 = field72 - 77;
			}

			if (field279 != var2) {
				field279 = var2;
				field222 = true;
			}
		}

		if (field98 != -1) {
			boolean var3 = method81(field109, field98);
			if (var3) {
				field222 = true;
			}
		}

		if (field427 == 3) {
			field222 = true;
		}

		if (field142 == 3) {
			field222 = true;
		}

		if (field264 != null) {
			field222 = true;
		}

		if (field464 && field196 == 2) {
			field222 = true;
		}

		if (field222) {
			method165();
			field222 = false;
		}

		if (field277 == 2) {
			method91();
			field159.method14(field506, 550, 4);
		}

		if (field201 != -1) {
			field120 = true;
		}

		if (field120) {
			if (field201 != -1 && field476 == field201) {
				field201 = -1;
				field265.method281(46);
				field265.method282(field476);
			}

			field120 = false;
			field380.method13();
			field309.method500(0, 0);

			if (field453 == -1) {
				if (field127[field476] != -1) {
					if (field476 == 0) {
						field383.method500(22, 10);
					}

					if (field476 == 1) {
						field384.method500(54, 8);
					}

					if (field476 == 2) {
						field384.method500(82, 8);
					}

					if (field476 == 3) {
						field385.method500(110, 8);
					}

					if (field476 == 4) {
						field387.method500(153, 8);
					}

					if (field476 == 5) {
						field387.method500(181, 8);
					}

					if (field476 == 6) {
						field386.method500(209, 9);
					}
				}

				if (field127[0] != -1 && (field201 != 0 || field203 % 20 < 10)) {
					field190[0].method500(29, 13);
				}

				if (field127[1] != -1 && (field201 != 1 || field203 % 20 < 10)) {
					field190[1].method500(53, 11);
				}

				if (field127[2] != -1 && (field201 != 2 || field203 % 20 < 10)) {
					field190[2].method500(82, 11);
				}

				if (field127[3] != -1 && (field201 != 3 || field203 % 20 < 10)) {
					field190[3].method500(115, 12);
				}

				if (field127[4] != -1 && (field201 != 4 || field203 % 20 < 10)) {
					field190[4].method500(153, 13);
				}

				if (field127[5] != -1 && (field201 != 5 || field203 % 20 < 10)) {
					field190[5].method500(180, 11);
				}

				if (field127[6] != -1 && (field201 != 6 || field203 % 20 < 10)) {
					field190[6].method500(208, 13);
				}
			}

			field380.method14(field506, 516, 160);
			field379.method13();
			field308.method500(0, 0);

			if (field453 == -1) {
				if (field127[field476] != -1) {
					if (field476 == 7) {
						field415.method500(42, 0);
					}

					if (field476 == 8) {
						field416.method500(74, 0);
					}

					if (field476 == 9) {
						field416.method500(102, 0);
					}

					if (field476 == 10) {
						field417.method500(130, 1);
					}

					if (field476 == 11) {
						field419.method500(173, 0);
					}

					if (field476 == 12) {
						field419.method500(201, 0);
					}

					if (field476 == 13) {
						field418.method500(229, 0);
					}
				}

				if (field127[8] != -1 && (field201 != 8 || field203 % 20 < 10)) {
					field190[7].method500(74, 2);
				}

				if (field127[9] != -1 && (field201 != 9 || field203 % 20 < 10)) {
					field190[8].method500(102, 3);
				}

				if (field127[10] != -1 && (field201 != 10 || field203 % 20 < 10)) {
					field190[9].method500(137, 4);
				}

				if (field127[11] != -1 && (field201 != 11 || field203 % 20 < 10)) {
					field190[10].method500(174, 2);
				}

				if (field127[12] != -1 && (field201 != 12 || field203 % 20 < 10)) {
					field190[11].method500(201, 2);
				}

				if (field127[13] != -1 && (field201 != 13 || field203 % 20 < 10)) {
					field190[12].method500(226, 2);
				}
			}

			field379.method14(field506, 496, 466);
			field160.method13();
		}

		if (field273) {
			field273 = false;
			field378.method13();
			field307.method500(0, 0);
			field478.method574(0xFFFFFF, 55, "Public chat", 28, true);

			if (field164 == 0) {
				field478.method574(0xFF00, 55, "On", 41, true);
			}

			if (field164 == 1) {
				field478.method574(0xFFFF00, 55, "Friends", 41, true);
			}

			if (field164 == 2) {
				field478.method574(0xFF0000, 55, "Off", 41, true);
			}

			if (field164 == 3) {
				field478.method574(0xFFFF, 55, "Hide", 41, true);
			}

			field478.method574(0xFFFFFF, 184, "Private chat", 28, true);

			if (field195 == 0) {
				field478.method574(0xFF00, 184, "On", 41, true);
			}

			if (field195 == 1) {
				field478.method574(0xFFFF00, 184, "Friends", 41, true);
			}

			if (field195 == 2) {
				field478.method574(0xFF0000, 184, "Off", 41, true);
			}

			field478.method574(0xFFFFFF, 324, "Trade/compete", 28, true);

			if (field224 == 0) {
				field478.method574(0xFF00, 324, "On", 41, true);
			}

			if (field224 == 1) {
				field478.method574(0xFFFF00, 324, "Friends", 41, true);
			}

			if (field224 == 2) {
				field478.method574(0xFF0000, 324, "Off", 41, true);
			}

			field478.method574(0xFFFFFF, 458, "Report abuse", 33, true);
			field378.method14(field506, 0, 453);
			field160.method13();
		}

		field109 = 0;
	}

	@ObfuscatedName("client.i(I)Z")
	public final boolean method77() {
		if (field214 == null) {
			return false;
		}

		try {
			int var1 = field214.method212();
			if (var1 == 0) {
				return false;
			}

			if (field87 == -1) {
				field214.method213(field400.field811, 0, 1);
				field87 = field400.field811[0] & 0xFF;
				if (field215 != null) {
					field87 = field87 - field215.method265() & 0xFF;
				}

				field86 = WPUXKTTJ.field1431[field87];
				var1--;
			}

			if (field86 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field214.method213(field400.field811, 0, 1);
				field86 = field400.field811[0] & 0xFF;
				var1--;
			}

			if (field86 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field214.method213(field400.field811, 0, 2);
				field400.field812 = 0;
				field86 = field400.method294();
				var1 -= 2;
			}

			if (var1 < field86) {
				return false;
			}

			field400.field812 = 0;
			field214.method213(field400.field811, 0, field86);
			field88 = 0;
			field483 = field482;
			field482 = field481;
			field481 = field87;

			if (field87 == 109) {
				field112 = true;
				int var2 = field400.method297();
				int var3 = field400.method310();
				int var4 = field400.method311();
				field470[var4] = var2;
				field486[var4] = var3;
				field226[var4] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var2 >= field117[var5]) {
						field226[var4] = var5 + 2;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 67) {
				int var6 = field400.method311();
				String var7 = field400.method299();
				int var8 = field400.method311();
				if (var6 >= 1 && var6 <= 5) {
					if (var7.equalsIgnoreCase("null")) {
						var7 = null;
					}

					field373[var6 - 1] = var7;
					field374[var6 - 1] = var8 == 0;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 117) {
				int var9 = field400.method294();
				int var10 = field400.method319();
				int var11 = field400.method320();
				int var12 = field400.method319();
				UKJEXUVU.field1300[var12].field1298 = var10;
				UKJEXUVU.field1300[var12].field1299 = var9;
				UKJEXUVU.field1300[var12].field1297 = var11;
				field87 = -1;
				return true;
			}

			if (field87 == 84) {
				field192 = true;
				field471 = field400.method292();
				field472 = field400.method292();
				field473 = field400.method294();
				field474 = field400.method292();
				field475 = field400.method292();
				if (field475 >= 100) {
					int var13 = field471 * 128 + 64;
					int var14 = field472 * 128 + 64;
					int var15 = method114(field315, var14, var13) - field473;
					int var16 = var13 - field266;
					int var17 = var15 - field267;
					int var18 = var14 - field268;
					int var19 = (int) Math.sqrt(var16 * var16 + var18 * var18);
					field269 = (int) (Math.atan2(var17, var19) * 325.949D) & 0x7FF;
					field270 = (int) (Math.atan2(var16, var18) * -325.949D) & 0x7FF;

					if (field269 < 128) {
						field269 = 128;
					}

					if (field269 > 383) {
						field269 = 383;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 209) {
				int var20 = field400.method294();
				int var21 = field400.method294();

				if (field98 != -1) {
					field98 = -1;
					field222 = true;
				}

				if (field139 != 0) {
					field139 = 0;
					field222 = true;
				}

				field91 = var21;
				field453 = var20;
				field112 = true;
				field120 = true;
				field121 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 93) {
				if (field476 == 12) {
					field112 = true;
				}

				field155 = field400.method292();
				field87 = -1;
				return true;
			}

			if (field87 == 167) {
				field192 = false;

				for (int var22 = 0; var22 < 5; var22++) {
					field221[var22] = false;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 100) {
				for (int var23 = 0; var23 < field230.length; var23++) {
					if (field376[var23] != field230[var23]) {
						field230[var23] = field376[var23];
						method53(var23);
						field112 = true;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 119) {
				String var24 = field400.method299();
				if (var24.endsWith(":tradereq:")) {
					String var25 = var24.substring(0, var24.indexOf(":"));
					long var26 = POOZNYPH.method413(var25);
					boolean var28 = false;
					for (int var29 = 0; var29 < field488; var29++) {
						if (field118[var29] == var26) {
							var28 = true;
							break;
						}
					}

					if (!var28 && field398 == 0) {
						method139("wishes to trade with you.", 4, var25);
					}
				} else if (var24.endsWith(":duelreq:")) {
					String var30 = var24.substring(0, var24.indexOf(":"));
					long var31 = POOZNYPH.method413(var30);
					boolean var33 = false;
					for (int var34 = 0; var34 < field488; var34++) {
						if (field118[var34] == var31) {
							var33 = true;
							break;
						}
					}

					if (!var33 && field398 == 0) {
						method139("wishes to duel with you.", 8, var30);
					}
				} else if (var24.endsWith(":chalreq:")) {
					String var35 = var24.substring(0, var24.indexOf(":"));
					long var36 = POOZNYPH.method413(var35);
					boolean var38 = false;
					for (int var39 = 0; var39 < field488; var39++) {
						if (field118[var39] == var36) {
							var38 = true;
							break;
						}
					}

					if (!var38 && field398 == 0) {
						String var40 = var24.substring(var24.indexOf(":") + 1, var24.length() - 9);
						method139(var40, 8, var35);
					}
				} else {
					method139(var24, 0, "");
				}

				field87 = -1;
				return true;
			}

			if (field87 == 83) {
				byte var41 = field400.method293();
				int var42 = field400.method294();
				field376[var42] = var41;

				if (field230[var42] != var41) {
					field230[var42] = var41;
					method53(var42);
					field112 = true;

					if (field247 != -1) {
						field222 = true;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 180) {
				int var43 = field400.method320();
				method122(var43);

				if (field453 != -1) {
					field453 = -1;
					field112 = true;
					field120 = true;
				}

				field98 = var43;
				field222 = true;
				field91 = -1;
				field121 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 26 || field87 == 80) {
				int var44 = field153;
				int var45 = field154;
				if (field87 == 26) {
					var45 = field400.method318();
					var44 = field400.method294();
					field83 = false;
				}

				if (field87 == 80) {
					var45 = field400.method294();
					field400.method302();

					for (int var46 = 0; var46 < 4; var46++) {
						for (int var47 = 0; var47 < 13; var47++) {
							for (int var48 = 0; var48 < 13; var48++) {
								int var49 = field400.method303(1);
								if (var49 == 1) {
									field406[var46][var47][var48] = field400.method303(26);
								} else {
									field406[var46][var47][var48] = -1;
								}
							}
						}
					}

					field400.method304();
					var44 = field400.method319();
					field83 = true;
				}

				if (field153 == var44 && field154 == var45 && field277 == 2) {
					field87 = -1;
					return true;
				}

				field153 = var44;
				field154 = var45;
				field122 = (field153 - 6) * 8;
				field123 = (field154 - 6) * 8;
				field310 = false;
				if ((field153 / 8 == 48 || field153 / 8 == 49) && field154 / 8 == 48) {
					field310 = true;
				}

				if (field153 / 8 == 48 && field154 / 8 == 148) {
					field310 = true;
				}

				field277 = 1;
				field81 = System.currentTimeMillis();
				field160.method13();
				field478.method573("Loading - please wait.", 151, 257, 0);
				field478.method573("Loading - please wait.", 150, 256, 0xFFFFFF);
				field160.method14(field506, 4, 4);

				if (field87 == 26) {
					int var50 = 0;
					for (int var51 = (field153 - 6) / 8; var51 <= (field153 + 6) / 8; var51++) {
						for (int var52 = (field154 - 6) / 8; var52 <= (field154 + 6) / 8; var52++) {
							var50++;
						}
					}

					field360 = new byte[var50][];
					field202 = new byte[var50][];
					field304 = new int[var50];
					field305 = new int[var50];
					field306 = new int[var50];
					int var53 = 0;
					for (int var54 = (field153 - 6) / 8; var54 <= (field153 + 6) / 8; var54++) {
						for (int var55 = (field154 - 6) / 8; var55 <= (field154 + 6) / 8; var55++) {
							field304[var53] = (var54 << 8) + var55;

							if (field310 && (var55 == 49 || var55 == 149 || var55 == 147 || var54 == 50 || var54 == 49 && var55 == 47)) {
								field305[var53] = -1;
								field306[var53] = -1;
								var53++;
							} else {
								int var56 = field305[var53] = field185.method236(0, var54, var55);
								if (var56 != -1) {
									field185.method229(3, var56);
								}

								int var57 = field306[var53] = field185.method236(1, var54, var55);
								if (var57 != -1) {
									field185.method229(3, var57);
								}

								var53++;
							}
						}
					}
				}

				if (field87 == 80) {
					int var58 = 0;
					int[] var59 = new int[676];
					for (int var60 = 0; var60 < 4; var60++) {
						for (int var61 = 0; var61 < 13; var61++) {
							for (int var62 = 0; var62 < 13; var62++) {
								int var63 = field406[var60][var61][var62];
								if (var63 != -1) {
									int var64 = var63 >> 14 & 0x3FF;
									int var65 = var63 >> 3 & 0x7FF;
									int var66 = (var64 / 8 << 8) + var65 / 8;
									for (int var67 = 0; var67 < var58; var67++) {
										if (var59[var67] == var66) {
											var66 = -1;
											break;
										}
									}

									if (var66 != -1) {
										var59[var58++] = var66;
									}
								}
							}
						}
					}

					field360 = new byte[var58][];
					field202 = new byte[var58][];
					field304 = new int[var58];
					field305 = new int[var58];
					field306 = new int[var58];
					for (int var68 = 0; var68 < var58; var68++) {
						int var69 = field304[var68] = var59[var68];
						int var70 = var69 >> 8 & 0xFF;
						int var71 = var69 & 0xFF;
						int var72 = field305[var68] = field185.method236(0, var70, var71);
						if (var72 != -1) {
							field185.method229(3, var72);
						}

						int var73 = field306[var68] = field185.method236(1, var70, var71);
						if (var73 != -1) {
							field185.method229(3, var73);
						}
					}
				}

				int var74 = field122 - field124;
				int var75 = field123 - field125;
				field124 = field122;
				field125 = field123;

				for (int var76 = 0; var76 < 16384; var76++) {
					PNBDNSXO var77 = field133[var76];
					if (var77 != null) {
						for (int var78 = 0; var78 < 10; var78++) {
							var77.field746[var78] -= var74;
							var77.field747[var78] -= var75;
						}

						var77.field706 -= var74 * 128;
						var77.field707 -= var75 * 128;
					}
				}

				for (int var79 = 0; var79 < field362; var79++) {
					HPYXKOFA var80 = field364[var79];
					if (var80 != null) {
						for (int var81 = 0; var81 < 10; var81++) {
							var80.field746[var81] -= var74;
							var80.field747[var81] -= var75;
						}

						var80.field706 -= var74 * 128;
						var80.field707 -= var75 * 128;
					}
				}

				field431 = true;
				byte var82 = 0;
				byte var83 = 104;
				byte var84 = 1;
				if (var74 < 0) {
					var82 = 103;
					var83 = -1;
					var84 = -1;
				}

				byte var85 = 0;
				byte var86 = 104;
				byte var87 = 1;
				if (var75 < 0) {
					var85 = 103;
					var86 = -1;
					var87 = -1;
				}

				for (int var88 = var82; var88 != var83; var88 += var84) {
					for (int var89 = var85; var89 != var86; var89 += var87) {
						int var90 = var74 + var88;
						int var91 = var75 + var89;
						for (int var92 = 0; var92 < 4; var92++) {
							if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
								field462[var92][var88][var89] = field462[var92][var90][var91];
							} else {
								field462[var92][var88][var89] = null;
							}
						}
					}
				}

				for (MWTZCFMC var93 = (MWTZCFMC) field294.method482(); var93 != null; var93 = (MWTZCFMC) field294.method484()) {
					var93.field830 -= var74;
					var93.field831 -= var75;
					if (var93.field830 < 0 || var93.field831 < 0 || var93.field830 >= 104 || var93.field831 >= 104) {
						var93.method397();
					}
				}

				if (field280 != 0) {
					field280 -= var74;
					field281 -= var75;
				}

				field192 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 128) {
				int var94 = field400.method320();
				int var95 = field400.method292();

				if (var94 == 0xFFFF) {
					var94 = -1;
				}

				field127[var95] = var94;
				field112 = true;
				field120 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 218) {
				int var96 = field400.method318();
				method122(var96);

				if (field98 != -1) {
					field98 = -1;
					field222 = true;
				}

				if (field139 != 0) {
					field139 = 0;
					field222 = true;
				}

				field453 = var96;
				field112 = true;
				field120 = true;
				field91 = -1;
				field121 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 210) {
				method78(field400, field86);
				field87 = -1;
				return true;
			}

			if (field87 == 58) {
				long var97 = field400.method298();
				int var99 = field400.method297();
				int var100 = field400.method292();
				boolean var101 = false;
				for (int var102 = 0; var102 < 100; var102++) {
					if (field372[var102] == var99) {
						var101 = true;
						break;
					}
				}

				if (var100 <= 1) {
					for (int var103 = 0; var103 < field488; var103++) {
						if (field118[var103] == var97) {
							var101 = true;
							break;
						}
					}
				}

				if (!var101 && field398 == 0) {
					try {
						field372[field233] = var99;
						field233 = (field233 + 1) % 100;
						String var104 = AXMCEEOC.method21(field400, field86 - 13);
						if (var100 != 3) {
							var104 = OCOLATKS.method369(var104);
						}

						if (var100 == 2 || var100 == 3) {
							method139(var104, 7, "@cr2@" + POOZNYPH.method417(POOZNYPH.method414(var97)));
						} else if (var100 == 1) {
							method139(var104, 7, "@cr1@" + POOZNYPH.method417(POOZNYPH.method414(var97)));
						} else {
							method139(var104, 3, POOZNYPH.method417(POOZNYPH.method414(var97)));
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 27) {
				field112 = true;
				int var106 = field400.method294();
				UKJEXUVU var107 = UKJEXUVU.field1300[var106];
				int var108 = field400.method294();
				for (int var109 = 0; var109 < var108; var109++) {
					var107.field1287[var109] = field400.method319();
					int var110 = field400.method292();
					if (var110 == 255) {
						var110 = field400.method326();
					}

					var107.field1339[var109] = var110;
				}

				for (int var111 = var108; var111 < var107.field1287.length; var111++) {
					var107.field1287[var111] = 0;
					var107.field1339[var111] = 0;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 77) {
				field180 = field400.method320() * 30;
				field87 = -1;
				return true;
			}

			if (field87 == 183) {
				int var112 = field400.method294();
				int var113 = field400.method323();
				int var114 = field400.method322();
				UKJEXUVU var115 = UKJEXUVU.field1300[var112];
				var115.field1302 = var113;
				var115.field1296 = var114;
				field87 = -1;
				return true;
			}

			if (field87 == 2) {
				field201 = field400.method292();
				if (field476 == field201) {
					if (field201 == 3) {
						field476 = 1;
					} else {
						field476 = 3;
					}

					field112 = true;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 81) {
				int var116 = field400.method318();
				int var117 = field400.method294();
				UKJEXUVU var118 = UKJEXUVU.field1300[var117];
				if (var118 != null && var118.field1317 == 0) {
					if (var116 < 0) {
						var116 = 0;
					}

					if (var116 > var118.field1289 - var118.field1336) {
						var116 = var118.field1289 - var118.field1336;
					}

					var118.field1327 = var116;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 129) {
				field112 = true;
				int var119 = field400.method294();
				UKJEXUVU var120 = UKJEXUVU.field1300[var119];
				while (field400.field812 < field86) {
					int var121 = field400.method306();
					int var122 = field400.method294();
					int var123 = field400.method292();
					if (var123 == 255) {
						var123 = field400.method297();
					}

					if (var121 >= 0 && var121 < var120.field1287.length) {
						var120.field1287[var121] = var122;
						var120.field1339[var121] = var123;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 169) {
				field488 = field86 / 8;
				for (int var124 = 0; var124 < field488; var124++) {
					field118[var124] = field400.method298();
				}

				field87 = -1;
				return true;
			}

			if (field87 == 137) {
				if (field453 != -1) {
					field453 = -1;
					field112 = true;
					field120 = true;
				}

				if (field98 != -1) {
					field98 = -1;
					field222 = true;
				}

				if (field139 != 0) {
					field139 = 0;
					field222 = true;
				}

				field91 = -1;
				field121 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 160) {
				field261 = field400.method292();
				field112 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 101) {
				for (int var125 = 0; var125 < field364.length; var125++) {
					if (field364[var125] != null) {
						field364[var125].field700 = -1;
					}
				}

				for (int var126 = 0; var126 < field133.length; var126++) {
					if (field133[var126] != null) {
						field133[var126].field700 = -1;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 97) {
				int var127 = field400.method295();
				int var128 = field400.method318();
				UKJEXUVU var129 = UKJEXUVU.field1300[var128];
				var129.field1309 = var127;

				if (var127 == -1) {
					var129.field1316 = 0;
					var129.field1319 = 0;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 123) {
				int var130 = field400.method292();
				int var131 = field400.method292();
				int var132 = field400.method292();
				int var133 = field400.method292();
				field221[var130] = true;
				field382[var130] = var131;
				field467[var130] = var132;
				field295[var130] = var133;
				field274[var130] = 0;
				field87 = -1;
				return true;
			}

			if (field87 == 75) {
				int var134 = field400.method320();
				int var135 = field400.method318();
				int var136 = field400.method294();
				if (var136 == 0xFFFF) {
					UKJEXUVU.field1300[var135].field1346 = 0;
					field87 = -1;
					return true;
				}

				PZNZFKPU var137 = PZNZFKPU.method428(var136);
				UKJEXUVU.field1300[var135].field1346 = 4;
				UKJEXUVU.field1300[var135].field1347 = var136;
				UKJEXUVU.field1300[var135].field1298 = var137.field1030;
				UKJEXUVU.field1300[var135].field1299 = var137.field1009;
				UKJEXUVU.field1300[var135].field1297 = var137.field1048 * 100 / var134;
				field87 = -1;
				return true;
			}

			if (field87 == 206) {
				field476 = field400.method292();
				field112 = true;
				field120 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 203) {
				if (field476 == 12) {
					field112 = true;
				}

				field213 = field400.method295();
				field87 = -1;
				return true;
			}

			if (field87 == 171) {
				field433 = field400.method292();
				if (field433 == 1) {
					field66 = field400.method294();
				}

				if (field433 >= 2 && field433 <= 6) {
					if (field433 == 2) {
						field258 = 64;
						field259 = 64;
					}

					if (field433 == 3) {
						field258 = 0;
						field259 = 64;
					}

					if (field433 == 4) {
						field258 = 128;
						field259 = 64;
					}

					if (field433 == 5) {
						field258 = 64;
						field259 = 0;
					}

					if (field433 == 6) {
						field258 = 64;
						field259 = 128;
					}

					field433 = 2;
					field255 = field400.method294();
					field256 = field400.method294();
					field257 = field400.method292();
				}

				if (field433 == 10) {
					field314 = field400.method294();
				}

				field87 = -1;
				return true;
			}

			if (field87 == 53) {
				field69 = field400.method310();
				field100 = field400.method320();
				field232 = field400.method310();
				field454 = field400.method297();
				field330 = field400.method319();

				if (field454 != 0 && field91 == -1) {
					signlink.dnslookup(POOZNYPH.method416(field454));
					method142();
					short var138 = 650;
					if (field232 != 201 || field69 == 1) {
						var138 = 655;
					}

					field451 = "";
					field250 = false;

					for (int var139 = 0; var139 < UKJEXUVU.field1300.length; var139++) {
						if (UKJEXUVU.field1300[var139] != null && UKJEXUVU.field1300[var139].field1294 == var138) {
							field91 = UKJEXUVU.field1300[var139].field1321;
							break;
						}
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 184) {
				int var140 = field400.method294();
				String var141 = field400.method299();
				UKJEXUVU.field1300[var140].field1304 = var141;

				if (field127[field476] == UKJEXUVU.field1300[var140].field1321) {
					field112 = true;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 71) {
				int var142 = field400.method318();
				int var143 = field400.method320();
				UKJEXUVU.field1300[var142].field1346 = 2;
				UKJEXUVU.field1300[var142].field1347 = var143;
				field87 = -1;
				return true;
			}

			if (field87 == 49) {
				method171();
				field87 = -1;
				return false;
			}

			if (field87 == 139) {
				long var144 = field400.method298();
				int var146 = field400.method292();
				String var147 = POOZNYPH.method417(POOZNYPH.method414(var144));
				for (int var148 = 0; var148 < field260; var148++) {
					if (field487[var148] == var144) {
						if (field148[var148] != var146) {
							field148[var148] = var146;
							field112 = true;

							if (var146 > 0) {
								method139(var147 + " has logged in.", 5, "");
							}

							if (var146 == 0) {
								method139(var147 + " has logged out.", 5, "");
							}
						}

						var147 = null;
						break;
					}
				}

				if (var147 != null && field260 < 200) {
					field487[field260] = var144;
					field113[field260] = var147;
					field148[field260] = var146;
					field260++;
					field112 = true;
				}

				boolean var149 = false;
				while (!var149) {
					var149 = true;
					for (int var150 = 0; var150 < field260 - 1; var150++) {
						if (field148[var150] != field341 && field148[var150 + 1] == field341 || field148[var150] == 0 && field148[var150 + 1] != 0) {
							int var151 = field148[var150];
							field148[var150] = field148[var150 + 1];
							field148[var150 + 1] = var151;
							String var152 = field113[var150];
							field113[var150] = field113[var150 + 1];
							field113[var150 + 1] = var152;
							long var153 = field487[var150];
							field487[var150] = field487[var150 + 1];
							field487[var150 + 1] = var153;
							field112 = true;
							var149 = false;
						}
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 246) {
				field85 = field400.method310();
				field84 = field400.method310();

				while (field400.field812 < field86) {
					int var155 = field400.method292();
					method159(var155, field400);
				}

				field87 = -1;
				return true;
			}

			if (field87 == 78) {
				field192 = true;
				field207 = field400.method292();
				field208 = field400.method292();
				field209 = field400.method294();
				field210 = field400.method292();
				field211 = field400.method292();
				if (field211 >= 100) {
					field266 = field207 * 128 + 64;
					field268 = field208 * 128 + 64;
					field267 = method114(field315, field268, field266) - field209;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 90) {
				method64(field400, field86);
				field431 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 21) {
				field84 = field400.method312();
				field85 = field400.method312();
				field87 = -1;
				return true;
			}

			if (field87 == 146) {
				int var156 = field400.method319();
				UKJEXUVU.field1300[var156].field1346 = 3;

				if (field73.field659 == null) {
					UKJEXUVU.field1300[var156].field1347 = (field73.field680[11] << 5) + (field73.field680[8] << 10) + (field73.field680[0] << 15) + (field73.field657[0] << 25) + (field73.field657[4] << 20) + field73.field680[1];
				} else {
					UKJEXUVU.field1300[var156].field1347 = (int) (field73.field659.field50 + 0x12345678L);
				}

				field87 = -1;
				return true;
			}

			if (field87 == 28 || field87 == 85 || field87 == 186 || field87 == 87 || field87 == 0 || field87 == 107 || field87 == 150 || field87 == 219 || field87 == 254 || field87 == 54 || field87 == 245) {
				method159(field87, field400);
				field87 = -1;
				return true;
			}

			if (field87 == 5) {
				int var157 = field400.method318();
				if (var157 == 0xFFFF) {
					var157 = -1;
				}

				if (field352 != var157 && field162 && !field344 && field272 == 0) {
					field412 = var157;
					field413 = true;
					field185.method229(2, field412);
				}

				field352 = var157;
				field87 = -1;
				return true;
			}

			if (field87 == 44) {
				int var158 = field400.method320();
				int var159 = field400.method318();
				if (field162 && !field344) {
					field412 = var159;
					field413 = false;
					field185.method229(2, field412);
					field272 = var158;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 102) {
				int var160 = field400.method318();
				method122(var160);

				if (field453 != -1) {
					field453 = -1;
					field112 = true;
					field120 = true;
				}

				if (field98 != -1) {
					field98 = -1;
					field222 = true;
				}

				if (field139 != 0) {
					field139 = 0;
					field222 = true;
				}

				field91 = var160;
				field121 = false;
				field87 = -1;
				return true;
			}

			if (field87 == 36) {
				int var161 = field400.method294();
				int var162 = field400.method292();
				int var163 = field400.method294();
				if (field313 && !field344 && field408 < 50) {
					field319[field408] = var161;
					field289[field408] = var162;
					field288[field408] = JDPRJRPB.field753[var161] + var163;
					field408++;
				}

				field87 = -1;
				return true;
			}

			if (field87 == 7) {
				field320 = false;
				field139 = 1;
				field108 = "";
				field222 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 189) {
				int var164 = field400.method294();
				int var165 = field400.method320();
				int var166 = var164 >> 10 & 0x1F;
				int var167 = var164 >> 5 & 0x1F;
				int var168 = var164 & 0x1F;
				UKJEXUVU.field1300[var165].field1343 = (var168 << 3) + (var166 << 19) + (var167 << 11);
				field87 = -1;
				return true;
			}

			if (field87 == 126) {
				int var169 = field400.method294();
				boolean var170 = field400.method292() == 1;
				UKJEXUVU.field1300[var169].field1330 = var170;
				field87 = -1;
				return true;
			}

			if (field87 == 43) {
				field85 = field400.method310();
				field84 = field400.method312();
				for (int var171 = field84; var171 < field84 + 8; var171++) {
					for (int var172 = field85; var172 < field85 + 8; var172++) {
						if (field462[field315][var171][var172] != null) {
							field462[field315][var171][var172] = null;
							method133(var171, var172);
						}
					}
				}

				for (MWTZCFMC var173 = (MWTZCFMC) field294.method482(); var173 != null; var173 = (MWTZCFMC) field294.method484()) {
					if (var173.field830 >= field84 && var173.field830 < field84 + 8 && var173.field831 >= field85 && var173.field831 < field85 + 8 && field315 == var173.field828) {
						var173.field824 = 0;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 98) {
				field280 = 0;
				field87 = -1;
				return true;
			}

			if (field87 == 13) {
				int var174 = field400.method325();
				int var175 = field400.method294();
				field376[var175] = var174;

				if (field230[var175] != var174) {
					field230[var175] = var174;
					method53(var175);
					field112 = true;

					if (field247 != -1) {
						field222 = true;
					}
				}

				field87 = -1;
				return true;
			}

			if (field87 == 178) {
				int var176 = field400.method321();
				if (var176 >= 0) {
					method122(var176);
				}

				field375 = var176;
				field87 = -1;
				return true;
			}

			if (field87 == 99) {
				int var177 = field400.method321();
				field247 = var177;
				field222 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 154) {
				field78 = field400.method292();
				field87 = -1;
				return true;
			}

			if (field87 == 111) {
				int var178 = field400.method318();
				int var179 = field400.method318();
				UKJEXUVU.field1300[var179].field1346 = 1;
				UKJEXUVU.field1300[var179].field1347 = var178;
				field87 = -1;
				return true;
			}

			if (field87 == 144) {
				field456 = field400.method292();
				field87 = -1;
				return true;
			}

			if (field87 == 121) {
				field262 = field400.method294();
				field275 = field400.method311();
				field87 = -1;
				return true;
			}

			if (field87 == 168) {
				field320 = false;
				field139 = 2;
				field108 = "";
				field222 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 230) {
				field164 = field400.method292();
				field195 = field400.method292();
				field224 = field400.method292();
				field273 = true;
				field222 = true;
				field87 = -1;
				return true;
			}

			if (field87 == 241) {
				int var180 = field400.method294();
				UKJEXUVU var181 = UKJEXUVU.field1300[var180];
				for (int var182 = 0; var182 < var181.field1287.length; var182++) {
					var181.field1287[var182] = -1;
					var181.field1287[var182] = 0;
				}

				field87 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field87 + "," + field86 + " - " + field482 + "," + field483);
			method171();
		} catch (IOException var187) {
			method68();
		} catch (Exception var188) {
			String var184 = "T2 - " + field87 + "," + field482 + "," + field483 + " - " + field86 + "," + (field73.field746[0] + field122) + "," + (field73.field747[0] + field123) + " - ";
			for (int var185 = 0; var185 < field86 && var185 < 50; var185++) {
				var184 = var184 + field400.field811[var185] + ",";
			}

			signlink.reporterror(var184);
			method171();
		}

		return true;
	}

	@ObfuscatedName("client.a(BLMUKVLYLC;I)V")
	public final void method78(MUKVLYLC arg0, int arg1) {
		field422 = 0;
		field367 = 0;
		method50(arg0, arg1);
		method156(arg1, arg0);
		method106(arg1, arg0);

		for (int var3 = 0; var3 < field422; var3++) {
			int var4 = field423[var3];
			if (field203 != field133[var4].field735) {
				field133[var4].field1003 = null;
				field133[var4] = null;
			}
		}

		if (arg0.field812 != arg1) {
			signlink.reporterror(field402 + " size mismatch in getnpcpos - pos:" + arg0.field812 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field134; var5++) {
			if (field133[field135[var5]] == null) {
				signlink.reporterror(field402 + " null entry in npc list - pos:" + var5 + " size:" + field134);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method79(String arg0, int arg1) {
		field489 = arg1;
		field187 = arg0;
		method151();

		if (field186 == null) {
			super.method79(arg0, arg1);
		} else {
			field167.method13();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field479.method573("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			ACKHPAZA.method7(var3 / 2 - 152, var6, 0x8C1111, 304, 34);
			ACKHPAZA.method7(var3 / 2 - 151, var6 + 1, 0, 302, 32);
			ACKHPAZA.method6(arg1 * 3, 30, var6 + 2, 0x8C1111, var3 / 2 - 150);
			ACKHPAZA.method6(300 - arg1 * 3, 30, var6 + 2, 0, arg1 * 3 + var3 / 2 - 150);
			field479.method573(arg0, var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF);
			field167.method14(field506, 202, 171);

			if (field77) {
				field77 = false;

				if (!field449) {
					field168.method14(field506, 0, 0);
					field169.method14(field506, 637, 0);
				}

				field165.method14(field506, 128, 0);
				field166.method14(field506, 202, 371);
				field170.method14(field506, 0, 265);
				field171.method14(field506, 562, 265);
				field172.method14(field506, 128, 171);
				field173.method14(field506, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method80() {
		if (field142 == 0) {
			field212[0] = "Cancel";
			field444[0] = 1078;
			field296 = 1;
			method46();
			field278 = 0;

			if (field514 > 4 && field515 > 4 && field514 < 516 && field515 < 338) {
				if (field91 == -1) {
					method164();
				} else {
					method99(4, UKJEXUVU.field1300[field91], field514, 4, 0, field515);
				}
			}

			if (field278 != field225) {
				field225 = field278;
			}

			field278 = 0;

			if (field514 > 553 && field515 > 205 && field514 < 743 && field515 < 466) {
				if (field453 != -1) {
					method99(205, UKJEXUVU.field1300[field453], field514, 553, 0, field515);
				} else if (field127[field476] != -1) {
					method99(205, UKJEXUVU.field1300[field127[field476]], field514, 553, 0, field515);
				}
			}

			if (field381 != field278) {
				field112 = true;
				field381 = field278;
			}

			field278 = 0;

			if (field514 > 17 && field515 > 357 && field514 < 496 && field515 < 453) {
				if (field98 != -1) {
					method99(357, UKJEXUVU.field1300[field98], field514, 17, 0, field515);
				} else if (field515 < 434 && field514 < 426) {
					method146(field515 - 357, field514 - 17);
				}
			}

			if (field98 != -1 && field278 != field253) {
				field222 = true;
				field253 = field278;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field296 - 1; var2++) {
					if (field444[var2] < 1000 && field444[var2 + 1] > 1000) {
						String var3 = field212[var2];
						field212[var2] = field212[var2 + 1];
						field212[var2 + 1] = var3;
						int var4 = field444[var2];
						field444[var2] = field444[var2 + 1];
						field444[var2 + 1] = var4;
						int var5 = field442[var2];
						field442[var2] = field442[var2 + 1];
						field442[var2 + 1] = var5;
						int var6 = field443[var2];
						field443[var2] = field443[var2 + 1];
						field443[var2 + 1] = var6;
						int var7 = field445[var2];
						field445[var2] = field445[var2 + 1];
						field445[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)Z")
	public final boolean method81(int arg0, int arg1) {
		boolean var3 = false;
		UKJEXUVU var4 = UKJEXUVU.field1300[arg1];
		for (int var5 = 0; var5 < var4.field1311.length && var4.field1311[var5] != -1; var5++) {
			UKJEXUVU var6 = UKJEXUVU.field1300[var4.field1311[var5]];
			if (var6.field1317 == 1) {
				var3 |= method81(arg0, var6.field1301);
			}

			if (var6.field1317 == 6 && (var6.field1309 != -1 || var6.field1310 != -1)) {
				boolean var7 = method148(var6);
				int var8;
				if (var7) {
					var8 = var6.field1310;
				} else {
					var8 = var6.field1309;
				}

				if (var8 != -1) {
					TLXFHCOO var9 = TLXFHCOO.field1242[var8];
					var6.field1319 += arg0;
					while (var6.field1319 > var9.method493(var6.field1316)) {
						var6.field1319 -= var9.method493(var6.field1316) + 1;
						var6.field1316++;
						if (var6.field1316 >= var9.field1243) {
							var6.field1316 -= var9.field1247;
							if (var6.field1316 < 0 || var6.field1316 >= var9.field1243) {
								var6.field1316 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method82(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field260; var2++) {
			if (arg0.equalsIgnoreCase(field113[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field73.field669)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method83() {
		for (int var1 = 0; var1 < field408; var1++) {
			if (field288[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field319[var1] != field147 || field289[var1] != field370) {
						MUKVLYLC var3 = JDPRJRPB.method255(field289[var1], field319[var1]);
						if (System.currentTimeMillis() + var3.field812 / 22 > field116 / 22 + field163) {
							field116 = var3.field812;
							field163 = System.currentTimeMillis();

							if (method124(var3.field811, var3.field812)) {
								field147 = field319[var1];
								field370 = field289[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method117()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field288[var1] != -5) {
					field288[var1] = -5;
				} else {
					field408--;
					for (int var5 = var1; var5 < field408; var5++) {
						field319[var5] = field319[var5 + 1];
						field289[var5] = field289[var5 + 1];
						field288[var5] = field288[var5 + 1];
					}

					var1--;
				}
			} else {
				field288[var1]--;
			}
		}

		if (field272 > 0) {
			field272 -= 20;
			if (field272 < 0) {
				field272 = 0;
			}

			if (field272 == 0 && field162 && !field344) {
				field412 = field352;
				field413 = true;
				field185.method229(2, field412);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZLMUKVLYLC;I)V")
	public final void method84(MUKVLYLC arg0, int arg1) {
		arg0.method302();
		int var3 = arg0.method303(1);
		if (var3 != 0) {
			int var4 = arg0.method303(2);
			if (var4 == 0) {
				field368[field367++] = field363;
			} else if (var4 == 1) {
				int var5 = arg0.method303(3);
				field73.method247(var5, false);
				int var6 = arg0.method303(1);
				if (var6 == 1) {
					field368[field367++] = field363;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method303(3);
				field73.method247(var7, true);
				int var8 = arg0.method303(3);
				field73.method247(var8, true);
				int var9 = arg0.method303(1);
				if (var9 == 1) {
					field368[field367++] = field363;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method303(7);
				int var11 = arg0.method303(1);
				int var12 = arg0.method303(7);
				int var13 = arg0.method303(1);
				if (var13 == 1) {
					field368[field367++] = field363;
				}

				field315 = arg0.method303(2);
				field73.method245(var10, var11 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field322.method535(arg3, arg4, arg2);
		if (var6 != 0) {
			int var7 = field322.method539(arg3, arg4, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field282.field552;
			int var12 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			PFIKHQJO var14 = PFIKHQJO.method405(var13);
			if (var14.field999 == -1) {
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
				TOROBAKX var15 = field157[var14.field999];
				if (var15 != null) {
					int var16 = (var14.field966 * 4 - var15.field1260) / 2;
					int var17 = (var14.field995 * 4 - var15.field1261) / 2;
					var15.method500(arg4 * 4 + var16 + 48, (104 - arg2 - var14.field995) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field322.method537(arg3, arg4, arg2);
		if (var18 != 0) {
			int var19 = field322.method539(arg3, arg4, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			PFIKHQJO var23 = PFIKHQJO.method405(var22);
			if (var23.field999 != -1) {
				TOROBAKX var24 = field157[var23.field999];
				if (var24 != null) {
					int var25 = (var23.field966 * 4 - var24.field1260) / 2;
					int var26 = (var23.field995 * 4 - var24.field1261) / 2;
					var24.method500(arg4 * 4 + var25 + 48, (104 - arg2 - var23.field995) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field282.field552;
				int var29 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field322.method538(arg3, arg4, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			PFIKHQJO var32 = PFIKHQJO.method405(var31);
			if (var32.field999 != -1) {
				TOROBAKX var33 = field157[var32.field999];
				if (var33 != null) {
					int var34 = (var32.field966 * 4 - var33.field1260) / 2;
					int var35 = (var32.field995 * 4 - var33.field1261) / 2;
					var33.method500(arg4 * 4 + var34 + 48, (104 - arg2 - var32.field995) * 4 + 48 + var35);
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
			if (field509 != null) {
				return new URL("http://127.0.0.1:" + (field342 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.j(I)V")
	public final void method86() {
		if (field180 > 1) {
			field180--;
		}

		if (field90 > 0) {
			field90--;
		}

		for (int var1 = 0; var1 < 5 && method77(); var1++) {
		}

		if (field115) {
			synchronized (field229.field1485) {
				if (!field463) {
					field229.field1487 = 0;
				} else if (field520 != 0 || field229.field1487 >= 40) {
					field265.method281(127);
					field265.method282(0);
					int var3 = field265.field812;
					int var4 = 0;
					for (int var5 = 0; var5 < field229.field1487 && var3 - field265.field812 < 240; var5++) {
						var4++;
						int var6 = field229.field1482[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field229.field1484[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field229.field1482[var5] == -1 && field229.field1484[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field205 != var7 || field206 != var6) {
							int var9 = var7 - field205;
							field205 = var7;
							int var10 = var6 - field206;
							field206 = var6;

							if (field388 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field265.method283((field388 << 12) + (var9 << 6) + var10);
								field388 = 0;
							} else if (field388 < 8) {
								field265.method285((field388 << 19) + var8 + 0x800000);
								field388 = 0;
							} else {
								field265.method286((field388 << 19) + var8 - 0x40000000);
								field388 = 0;
							}
						} else if (field388 < 2047) {
							field388++;
						}
					}

					field265.method291(field265.field812 - var3);

					if (var4 >= field229.field1487) {
						field229.field1487 = 0;
					} else {
						field229.field1487 -= var4;
						for (int var11 = 0; var11 < field229.field1487; var11++) {
							field229.field1484[var11] = field229.field1484[var4 + var11];
							field229.field1482[var11] = field229.field1482[var4 + var11];
						}
					}
				}
			}

			if (field520 != 0) {
				long var12 = (field523 - field350) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field350 = field523;
				int var14 = field522;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field521;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field520 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field265.method281(150);
				field265.method324((var17 << 19) + (var18 << 20) + var16);
			}

			if (field106 > 0) {
				field106--;
			}

			if (field524[1] == 1 || field524[2] == 1 || field524[3] == 1 || field524[4] == 1) {
				field107 = true;
			}

			if (field107 && field106 <= 0) {
				field106 = 20;
				field107 = false;
				field265.method281(16);
				field265.method317(field326);
				field265.method283(field327);
			}

			if (field511 && !field286) {
				field286 = true;
				field265.method281(10);
				field265.method282(1);
			}

			if (!field511 && field286) {
				field286 = false;
				field265.method281(10);
				field265.method282(0);
			}

			method35();
			method37();
			method83();
			field88++;
			if (field88 > 750) {
				method68();
			}

			method166();
			method69();
			method103();
			field109++;

			if (field96 != 0) {
				field95 += 20;
				if (field95 >= 400) {
					field96 = 0;
				}
			}

			if (field427 != 0) {
				field424++;
				if (field424 >= 15) {
					if (field427 == 2) {
						field112 = true;
					}

					if (field427 == 3) {
						field222 = true;
					}

					field427 = 0;
				}
			}

			if (field142 != 0) {
				field460++;

				if (field514 > field143 + 5 || field514 < field143 - 5 || field515 > field144 + 5 || field515 < field144 - 5) {
					field179 = true;
				}

				if (field513 == 0) {
					if (field142 == 2) {
						field112 = true;
					}

					if (field142 == 3) {
						field222 = true;
					}

					field142 = 0;

					if (field179 && field460 >= 5) {
						field312 = -1;
						method80();

						if (field312 == field140 && field311 != field141) {
							UKJEXUVU var19 = UKJEXUVU.field1300[field140];
							byte var20 = 0;
							if (field177 == 1 && var19.field1294 == 206) {
								var20 = 1;
							}

							if (var19.field1287[field311] <= 0) {
								var20 = 0;
							}

							if (var19.field1291) {
								int var21 = field141;
								int var22 = field311;
								var19.field1287[var22] = var19.field1287[var21];
								var19.field1339[var22] = var19.field1339[var21];
								var19.field1287[var21] = -1;
								var19.field1339[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field141;
								int var24 = field311;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method507(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method507(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method507(field141, field311);
							}

							field265.method281(13);
							field265.method317(field141);
							field265.method283(field140);
							field265.method309(var20);
							field265.method316(field311);
						}
					} else if ((field439 == 1 || method157(field296 - 1)) && field296 > 2) {
						method32();
					} else if (field296 > 0) {
						method162(field296 - 1);
					}

					field424 = 10;
					field520 = 0;
				}
			}

			if (UWQNYVPL.field1382 != -1) {
				int var25 = UWQNYVPL.field1382;
				int var26 = UWQNYVPL.field1383;
				boolean var27 = method66(0, 0, 0, 0, var26, 0, true, 0, field73.field746[0], field73.field747[0], var25);
				UWQNYVPL.field1382 = -1;

				if (var27) {
					field93 = field521;
					field94 = field522;
					field96 = 1;
					field95 = 0;
				}
			}

			if (field520 == 1 && field264 != null) {
				field264 = null;
				field222 = true;
				field520 = 0;
			}

			method130();
			method60();
			method105();
			method98();

			if (field513 == 1 || field520 == 1) {
				field263++;
			}

			if (field277 == 2) {
				method100();
			}

			if (field277 == 2 && field192) {
				method58();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field274[var28]++;
			}

			method152();
			field512++;
			if (field512 > 4500) {
				field90 = 250;
				field512 -= 500;
				field265.method281(77);
			}

			field401++;
			if (field401 > 500) {
				field401 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field465 += field466;
				}

				if ((var29 & 0x2) == 2) {
					field345 += field346;
				}

				if ((var29 & 0x4) == 4) {
					field353 += field354;
				}
			}

			if (field465 < -50) {
				field466 = 2;
			}

			if (field465 > 50) {
				field466 = -2;
			}

			if (field345 < -55) {
				field346 = 2;
			}

			if (field345 > 55) {
				field346 = -2;
			}

			if (field353 < -40) {
				field354 = 1;
			}

			if (field353 > 40) {
				field354 = -1;
			}

			field76++;
			if (field76 > 500) {
				field76 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field323 += field324;
				}

				if ((var30 & 0x2) == 2) {
					field110 += field111;
				}
			}

			if (field323 < -60) {
				field324 = 2;
			}

			if (field323 > 60) {
				field324 = -2;
			}

			if (field110 < -20) {
				field111 = 1;
			}

			if (field110 > 10) {
				field111 = -1;
			}

			field89++;
			if (field89 > 50) {
				field265.method281(253);
			}

			try {
				if (field214 != null && field265.field812 > 0) {
					field214.method214(0, field265.field812, field265.field811);
					field265.field812 = 0;
					field89 = 0;
				}
			} catch (IOException var32) {
				method68();
			} catch (Exception var33) {
				method171();
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method87() {
		method128();

		if (field96 == 1) {
			field457[field95 / 100].method193(field93 - 8 - 4, field94 - 8 - 4);
		}

		if (field96 == 2) {
			field457[field95 / 100 + 4].method193(field93 - 8 - 4, field94 - 8 - 4);
		}

		if (field375 != -1) {
			method81(field109, field375);
			method65(0, 0, 0, UKJEXUVU.field1300[field375]);
		}

		if (field91 != -1) {
			method81(field109, field91);
			method65(0, 0, 0, UKJEXUVU.field1300[field91]);
		}

		method116();

		if (!field464) {
			method80();
			method49();
		} else if (field196 == 0) {
			method149();
		}

		if (field456 == 1) {
			field407[1].method193(472, 296);
		}

		if (field276) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field502 < 15) {
				var3 = 0xFF0000;
			}

			field478.method572(var1, var3, "Fps:" + field502, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field344) {
				int var7 = 0xFF0000;
			}

			field478.method572(var1, 0xFFFF00, "Mem:" + var5 + "k", var2);
			var2 += 15;
		}

		if (field180 != 0) {
			int var8 = field180 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field478.method577(329, "System update in: " + var9 + ":0" + var8, 4, 0xFFFF00);
			} else {
				field478.method577(329, "System update in: " + var9 + ":" + var8, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.b(BLMUKVLYLC;I)V")
	public final void method88(MUKVLYLC arg0, int arg1) {
		while (arg0.field813 + 10 < arg1 * 8) {
			int var3 = arg0.method303(11);
			if (var3 == 2047) {
				break;
			}

			if (field364[var3] == null) {
				field364[var3] = new HPYXKOFA();
				if (field369[var3] != null) {
					field364[var3].method243(field369[var3]);
				}
			}

			field366[field365++] = var3;
			HPYXKOFA var4 = field364[var3];
			var4.field735 = field203;
			int var5 = arg0.method303(1);
			if (var5 == 1) {
				field368[field367++] = var3;
			}

			int var6 = arg0.method303(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method303(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method303(1);
			var4.method245(field73.field747[0] + var7, var8 == 1, field73.field746[0] + var6);
		}

		arg0.method304();
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method89() {
		field158.method13();
		QVVCPQSC.field1096 = field129;
		field316.method500(0, 0);

		if (field453 != -1) {
			method65(0, 0, 0, UKJEXUVU.field1300[field453]);
		} else if (field127[field476] != -1) {
			method65(0, 0, 0, UKJEXUVU.field1300[field127[field476]]);
		}

		if (field464 && field196 == 1) {
			method149();
		}

		field158.method14(field506, 553, 205);
		field160.method13();
		QVVCPQSC.field1096 = field130;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method90(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.l(I)V")
	public final void method91() {
		field159.method13();

		if (field78 == 2) {
			byte[] var1 = field317.field1258;
			int[] var2 = ACKHPAZA.field1;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field99.method197(field92, 0, 33, field74, 25, 0, 256, 25, field327, 33);
			field160.method13();
		} else {
			int var5 = field327 + field323 & 0x7FF;
			int var6 = field73.field706 / 32 + 48;
			int var7 = 464 - field73.field707 / 32;
			field282.method197(field459, 5, 146, field227, var7, 25, field110 + 256, var6, var5, 151);
			field99.method197(field92, 0, 33, field74, 25, 0, 256, 25, field327, 33);

			for (int var8 = 0; var8 < field395; var8++) {
				int var9 = field396[var8] * 4 + 2 - field73.field706 / 32;
				int var10 = field397[var8] * 4 + 2 - field73.field707 / 32;
				method170(var10, field101[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					SWVPDERM var13 = field462[field315][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field73.field706 / 32;
						int var15 = var12 * 4 + 2 - field73.field707 / 32;
						method170(var15, field434, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field134; var16++) {
				PNBDNSXO var17 = field133[field135[var16]];
				if (var17 != null && var17.method241()) {
					BYABUZFP var18 = var17.field1003;
					if (var18.field35 != null) {
						var18 = var18.method26();
					}

					if (var18 != null && var18.field52 && var18.field33) {
						int var19 = var17.field706 / 32 - field73.field706 / 32;
						int var20 = var17.field707 / 32 - field73.field707 / 32;
						method170(var20, field435, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field365; var21++) {
				HPYXKOFA var22 = field364[field366[var21]];
				if (var22 != null && var22.method241()) {
					int var23 = var22.field706 / 32 - field73.field706 / 32;
					int var24 = var22.field707 / 32 - field73.field707 / 32;
					boolean var25 = false;
					long var26 = POOZNYPH.method413(var22.field669);
					for (int var28 = 0; var28 < field260; var28++) {
						if (field487[var28] == var26 && field148[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field73.field666 != 0 && var22.field666 != 0 && field73.field666 == var22.field666) {
						var29 = true;
					}

					if (var25) {
						method170(var24, field437, var23);
					} else if (var29) {
						method170(var24, field438, var23);
					} else {
						method170(var24, field436, var23);
					}
				}
			}

			if (field433 != 0 && field203 % 20 < 10) {
				if (field433 == 1 && field66 >= 0 && field66 < field133.length) {
					PNBDNSXO var30 = field133[field66];
					if (var30 != null) {
						int var31 = var30.field706 / 32 - field73.field706 / 32;
						int var32 = var30.field707 / 32 - field73.field707 / 32;
						method163(var32, field348, var31);
					}
				}

				if (field433 == 2) {
					int var33 = (field255 - field122) * 4 + 2 - field73.field706 / 32;
					int var34 = (field256 - field123) * 4 + 2 - field73.field707 / 32;
					method163(var34, field348, var33);
				}

				if (field433 == 10 && field314 >= 0 && field314 < field364.length) {
					HPYXKOFA var35 = field364[field314];
					if (var35 != null) {
						int var36 = var35.field706 / 32 - field73.field706 / 32;
						int var37 = var35.field707 / 32 - field73.field707 / 32;
						method163(var37, field348, var36);
					}
				}
			}

			if (field280 != 0) {
				int var38 = field280 * 4 + 2 - field73.field706 / 32;
				int var39 = field281 * 4 + 2 - field73.field707 / 32;
				method170(var39, field347, var38);
			}

			ACKHPAZA.method6(3, 3, 78, 0xFFFFFF, 97);
			field160.method13();
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method92(int arg0) {
		if (!field344) {
			if (QVVCPQSC.field1104[17] >= arg0) {
				TOROBAKX var2 = QVVCPQSC.field1098[17];
				int var3 = var2.field1261 * var2.field1260 - 1;
				int var4 = field109 * var2.field1260 * 2;
				byte[] var5 = var2.field1258;
				byte[] var6 = field358;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1258 = var6;
				field358 = var5;
				QVVCPQSC.method440(17);
			}

			if (QVVCPQSC.field1104[24] >= arg0) {
				TOROBAKX var8 = QVVCPQSC.field1098[24];
				int var9 = var8.field1261 * var8.field1260 - 1;
				int var10 = field109 * var8.field1260 * 2;
				byte[] var11 = var8.field1258;
				byte[] var12 = field358;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1258 = var12;
				field358 = var11;
				QVVCPQSC.method440(24);
				field285++;
				if (field285 > 197) {
					field285 = 0;
					field265.method281(32);
					field265.method286(0);
				}
			}

			if (QVVCPQSC.field1104[34] >= arg0) {
				TOROBAKX var14 = QVVCPQSC.field1098[34];
				int var15 = var14.field1261 * var14.field1260 - 1;
				int var16 = field109 * var14.field1260 * 2;
				byte[] var17 = var14.field1258;
				byte[] var18 = field358;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1258 = var18;
				field358 = var17;
				QVVCPQSC.method440(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method93() {
		field449 = false;
		while (field97) {
			field449 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field218 = null;
		field219 = null;
		field138 = null;
		field297 = null;
		field298 = null;
		field299 = null;
		field300 = null;
		field188 = null;
		field189 = null;
		field428 = null;
		field429 = null;
		field216 = null;
		field217 = null;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method94() {
		int var1 = 5;
		field446[8] = 0;
		int var2 = 0;
		while (field446[8] == 0) {
			String var3 = "Unknown problem";
			method79("Connecting to web server", 20);

			try {
				DataInputStream var4 = method107("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 311);
				MUKVLYLC var5 = new MUKVLYLC(new byte[40]);
				var4.readFully(var5.field811, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field446[var6] = var5.method297();
				}

				int var7 = var5.method297();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field446[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field446[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field446[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field446[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field446[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field446[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method79("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method79(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field455 = !field455;
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method95() {
		field220 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field80[var1] = -1;
			for (int var2 = 0; var2 < CWWAFTAL.field490; var2++) {
				if (!CWWAFTAL.field491[var2].field497 && CWWAFTAL.field491[var2].field492 == var1 + (field414 ? 0 : 7)) {
					field80[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method96(int arg0) {
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

	@ObfuscatedName("client.a(BIILjava/lang/String;ILjava/lang/String;)LFIGUVTWB;")
	public final FIGUVTWB method97(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field287[0] != null) {
				var6 = field287[0].method184(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field156.reset();
			field156.update(var6);
			int var8 = (int) field156.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new FIGUVTWB(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method79("Requesting " + arg4, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method107(arg2 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				MUKVLYLC var16 = new MUKVLYLC(var15);
				var16.field812 = 3;
				int var17 = var16.method296() + 6;
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
						method79("Loading " + arg4 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field287[0] != null) {
						field287[0].method185(arg1, var6, var6.length);
					}
				} catch (Exception var28) {
					field287[0] = null;
				}

				if (var6 != null) {
					field156.reset();
					field156.update(var6);
					int var23 = (int) field156.getValue();
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
						method79("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method79(var11 + " - Retrying in " + var25, arg3);
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

				field455 = !field455;
			}
		}

		return new FIGUVTWB(var6);
	}

	public final void init() {
		field341 = Integer.parseInt(getParameter("nodeid"));
		field342 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method47();
		} else {
			method127();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field343 = false;
		} else {
			field343 = true;
		}

		method180(765, 503);
	}

	@ObfuscatedName("client.n(I)V")
	public final void method98() {
		if (field520 == 1) {
			if (field521 >= 6 && field521 <= 106 && field522 >= 467 && field522 <= 499) {
				field164 = (field164 + 1) % 4;
				field273 = true;
				field222 = true;
				field265.method281(58);
				field265.method282(field164);
				field265.method282(field195);
				field265.method282(field224);
			}

			if (field521 >= 135 && field521 <= 235 && field522 >= 467 && field522 <= 499) {
				field195 = (field195 + 1) % 3;
				field273 = true;
				field222 = true;
				field265.method281(58);
				field265.method282(field164);
				field265.method282(field195);
				field265.method282(field224);
			}

			if (field521 >= 273 && field521 <= 373 && field522 >= 467 && field522 <= 499) {
				field224 = (field224 + 1) % 3;
				field273 = true;
				field222 = true;
				field265.method281(58);
				field265.method282(field164);
				field265.method282(field195);
				field265.method282(field224);
			}

			if (field521 >= 412 && field521 <= 512 && field522 >= 467 && field522 <= 499) {
				if (field91 == -1) {
					method142();
					field451 = "";
					field250 = false;

					for (int var1 = 0; var1 < UKJEXUVU.field1300.length; var1++) {
						if (UKJEXUVU.field1300[var1] != null && UKJEXUVU.field1300[var1].field1294 == 600) {
							field75 = field91 = UKJEXUVU.field1300[var1].field1321;
							return;
						}
					}

					return;
				}

				method139("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	public final void run() {
		if (field485) {
			method48();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(ILUKJEXUVU;IIIBI)V")
	public final void method99(int arg0, UKJEXUVU arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field1317 == 0 && arg1.field1311 != null && !arg1.field1330 && (arg2 >= arg3 && arg5 >= arg0 && arg2 <= arg1.field1342 + arg3 && arg5 <= arg1.field1336 + arg0)) {
			int var7 = arg1.field1311.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field1288[var8] + arg3;
				int var10 = arg1.field1333[var8] + arg0 - arg4;
				UKJEXUVU var11 = UKJEXUVU.field1300[arg1.field1311[var8]];
				var9 += var11.field1302;
				var10 += var11.field1296;
				if ((var11.field1307 >= 0 || var11.field1329 != 0) && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
					if (var11.field1307 >= 0) {
						field278 = var11.field1307;
					} else {
						field278 = var11.field1301;
					}
				}

				if (var11.field1317 == 0) {
					method99(var10, var11, arg2, var9, var11.field1327, arg5);

					if (var11.field1289 > var11.field1336) {
						method115(true, var10, var11, var11.field1289, var11.field1342 + var9, arg5, var11.field1336, arg2);
					}
				} else {
					if (var11.field1313 == 1 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						boolean var12 = false;
						if (var11.field1294 != 0) {
							var12 = method104(var11);
						}

						if (!var12) {
							field212[field296] = var11.field1341;
							field444[field296] = 415;
							field443[field296] = var11.field1301;
							field296++;
						}
					}

					if (var11.field1313 == 2 && field149 == 0 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						String var13 = var11.field1312;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field212[field296] = var13 + " @gre@" + var11.field1286;
						field444[field296] = 301;
						field443[field296] = var11.field1301;
						field296++;
					}

					if (var11.field1313 == 3 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						field212[field296] = "Close";
						field444[field296] = 913;
						field443[field296] = var11.field1301;
						field296++;
					}

					if (var11.field1313 == 4 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						field212[field296] = var11.field1341;
						field444[field296] = 212;
						field443[field296] = var11.field1301;
						field296++;
					}

					if (var11.field1313 == 5 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						field212[field296] = var11.field1341;
						field444[field296] = 938;
						field443[field296] = var11.field1301;
						field296++;
					}

					if (var11.field1313 == 6 && !field121 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1342 + var9 && arg5 < var11.field1336 + var10) {
						field212[field296] = var11.field1341;
						field444[field296] = 799;
						field443[field296] = var11.field1301;
						field296++;
					}

					if (var11.field1317 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1336; var15++) {
							for (int var16 = 0; var16 < var11.field1342; var16++) {
								int var17 = (var11.field1322 + 32) * var16 + var9;
								int var18 = (var11.field1345 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1284[var14];
									var18 += var11.field1292[var14];
								}

								if (arg2 >= var17 && arg5 >= var18 && arg2 < var17 + 32 && arg5 < var18 + 32) {
									field311 = var14;
									field312 = var11.field1301;

									if (var11.field1287[var14] > 0) {
										PZNZFKPU var19 = PZNZFKPU.method428(var11.field1287[var14] - 1);
										if (field390 == 1 && var11.field1332) {
											if (field392 != var11.field1301 || field391 != var14) {
												field212[field296] = "Use " + field394 + " with @lre@" + var19.field1043;
												field444[field296] = 192;
												field445[field296] = var19.field1013;
												field442[field296] = var14;
												field443[field296] = var11.field1301;
												field296++;
											}
										} else if (field149 != 1 || !var11.field1332) {
											if (var11.field1332) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field1049 != null && var19.field1049[var20] != null) {
														field212[field296] = var19.field1049[var20] + " @lre@" + var19.field1043;

														if (var20 == 3) {
															field444[field296] = 107;
														}

														if (var20 == 4) {
															field444[field296] = 634;
														}

														field445[field296] = var19.field1013;
														field442[field296] = var14;
														field443[field296] = var11.field1301;
														field296++;
													} else if (var20 == 4) {
														field212[field296] = "Drop @lre@" + var19.field1043;
														field444[field296] = 634;
														field445[field296] = var19.field1013;
														field442[field296] = var14;
														field443[field296] = var11.field1301;
														field296++;
													}
												}
											}

											if (var11.field1334) {
												field212[field296] = "Use @lre@" + var19.field1043;
												field444[field296] = 236;
												field445[field296] = var19.field1013;
												field442[field296] = var14;
												field443[field296] = var11.field1301;
												field296++;
											}

											if (var11.field1332 && var19.field1049 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field1049[var21] != null) {
														field212[field296] = var19.field1049[var21] + " @lre@" + var19.field1043;

														if (var21 == 0) {
															field444[field296] = 615;
														}

														if (var21 == 1) {
															field444[field296] = 898;
														}

														if (var21 == 2) {
															field444[field296] = 754;
														}

														field445[field296] = var19.field1013;
														field442[field296] = var14;
														field443[field296] = var11.field1301;
														field296++;
													}
												}
											}

											if (var11.field1295 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1295[var22] != null) {
														field212[field296] = var11.field1295[var22] + " @lre@" + var19.field1043;

														if (var22 == 0) {
															field444[field296] = 431;
														}

														if (var22 == 1) {
															field444[field296] = 262;
														}

														if (var22 == 2) {
															field444[field296] = 892;
														}

														if (var22 == 3) {
															field444[field296] = 983;
														}

														if (var22 == 4) {
															field444[field296] = 650;
														}

														field445[field296] = var19.field1013;
														field442[field296] = var14;
														field443[field296] = var11.field1301;
														field296++;
													}
												}
											}

											field212[field296] = "Examine @lre@" + var19.field1043;
											field444[field296] = 1072;
											field445[field296] = var19.field1013;
											field442[field296] = var14;
											field443[field296] = var11.field1301;
											field296++;
										} else if ((field151 & 0x10) == 0x10) {
											field212[field296] = field152 + " @lre@" + var19.field1043;
											field444[field296] = 445;
											field445[field296] = var19.field1013;
											field442[field296] = var14;
											field443[field296] = var11.field1301;
											field296++;
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

	@ObfuscatedName("client.n(Z)V")
	public final void method100() {
		try {
			int var1 = field73.field706 + field465;
			int var2 = field73.field707 + field345;
			if (field104 - var1 < -500 || field104 - var1 > 500 || field105 - var2 < -500 || field105 - var2 > 500) {
				field104 = var1;
				field105 = var2;
			}

			if (field104 != var1) {
				field104 += (var1 - field104) / 16;
			}

			if (field105 != var2) {
				field105 += (var2 - field105) / 16;
			}

			if (field524[1] == 1) {
				field328 += (-field328 - 24) / 2;
			} else if (field524[2] == 1) {
				field328 += (24 - field328) / 2;
			} else {
				field328 /= 2;
			}

			if (field524[3] == 1) {
				field329 += (12 - field329) / 2;
			} else if (field524[4] == 1) {
				field329 += (-field329 - 12) / 2;
			} else {
				field329 /= 2;
			}

			field327 = field328 / 2 + field327 & 0x7FF;
			field326 += field329 / 2;
			if (field326 < 128) {
				field326 = 128;
			}

			if (field326 > 383) {
				field326 = 383;
			}

			int var3 = field104 >> 7;
			int var4 = field105 >> 7;
			int var5 = method114(field315, field105, field104);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field315;
						if (var9 < 3 && (field175[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field325[var9][var7][var8];
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

			if (var11 > field271) {
				field271 += (var11 - field271) / 24;
			} else if (var11 < field271) {
				field271 += (var11 - field271) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field73.field706 + "," + field73.field707 + "," + field104 + "," + field105 + "," + field153 + "," + field154 + "," + field122 + "," + field123);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method101(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method101(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		MWTZCFMC var10 = null;
		for (MWTZCFMC var11 = (MWTZCFMC) field294.method482(); var11 != null; var11 = (MWTZCFMC) field294.method484()) {
			if (var11.field828 == arg4 && var11.field830 == arg8 && var11.field831 == arg5 && var11.field829 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new MWTZCFMC();
			var10.field828 = arg4;
			var10.field829 = arg3;
			var10.field830 = arg8;
			var10.field831 = arg5;
			method150(var10);
			field294.method479(var10);
		}

		var10.field833 = arg7;
		var10.field835 = arg6;
		var10.field834 = arg1;
		var10.field832 = arg2;
		var10.field824 = arg0;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method103() {
		for (int var1 = -1; var1 < field365; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field363;
			} else {
				var2 = field366[var1];
			}

			HPYXKOFA var3 = field364[var2];
			if (var3 != null && var3.field710 > 0) {
				var3.field710--;
				if (var3.field710 == 0) {
					var3.field698 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field134; var4++) {
			int var5 = field135[var4];
			PNBDNSXO var6 = field133[var5];
			if (var6 != null && var6.field710 > 0) {
				var6.field710--;
				if (var6.field710 == 0) {
					var6.field698 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LUKJEXUVU;I)Z")
	public final boolean method104(UKJEXUVU arg0) {
		int var2 = arg0.field1294;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field212[field296] = "Remove @whi@" + arg0.field1304;
				field444[field296] = 813;
				field296++;
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

		field212[field296] = "Remove @whi@" + field113[var2];
		field444[field296] = 129;
		field296++;
		field212[field296] = "Message @whi@" + field113[var2];
		field444[field296] = 936;
		field296++;
		return true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method105() {
		if (field520 == 1) {
			if (field521 >= 539 && field521 <= 573 && field522 >= 169 && field522 < 205 && field127[0] != -1) {
				field112 = true;
				field476 = 0;
				field120 = true;
			}

			if (field521 >= 569 && field521 <= 599 && field522 >= 168 && field522 < 205 && field127[1] != -1) {
				field112 = true;
				field476 = 1;
				field120 = true;
			}

			if (field521 >= 597 && field521 <= 627 && field522 >= 168 && field522 < 205 && field127[2] != -1) {
				field112 = true;
				field476 = 2;
				field120 = true;
			}

			if (field521 >= 625 && field521 <= 669 && field522 >= 168 && field522 < 203 && field127[3] != -1) {
				field112 = true;
				field476 = 3;
				field120 = true;
			}

			if (field521 >= 666 && field521 <= 696 && field522 >= 168 && field522 < 205 && field127[4] != -1) {
				field112 = true;
				field476 = 4;
				field120 = true;
			}

			if (field521 >= 694 && field521 <= 724 && field522 >= 168 && field522 < 205 && field127[5] != -1) {
				field112 = true;
				field476 = 5;
				field120 = true;
			}

			if (field521 >= 722 && field521 <= 756 && field522 >= 169 && field522 < 205 && field127[6] != -1) {
				field112 = true;
				field476 = 6;
				field120 = true;
			}

			if (field521 >= 540 && field521 <= 574 && field522 >= 466 && field522 < 502 && field127[7] != -1) {
				field112 = true;
				field476 = 7;
				field120 = true;
			}

			if (field521 >= 572 && field521 <= 602 && field522 >= 466 && field522 < 503 && field127[8] != -1) {
				field112 = true;
				field476 = 8;
				field120 = true;
			}

			if (field521 >= 599 && field521 <= 629 && field522 >= 466 && field522 < 503 && field127[9] != -1) {
				field112 = true;
				field476 = 9;
				field120 = true;
			}

			if (field521 >= 627 && field521 <= 671 && field522 >= 467 && field522 < 502 && field127[10] != -1) {
				field112 = true;
				field476 = 10;
				field120 = true;
			}

			if (field521 >= 669 && field521 <= 699 && field522 >= 466 && field522 < 503 && field127[11] != -1) {
				field112 = true;
				field476 = 11;
				field120 = true;
			}

			if (field521 >= 696 && field521 <= 726 && field522 >= 466 && field522 < 503 && field127[12] != -1) {
				field112 = true;
				field476 = 12;
				field120 = true;
			}

			if (field521 >= 724 && field521 <= 758 && field522 >= 466 && field522 < 502 && field127[13] != -1) {
				field112 = true;
				field476 = 13;
				field120 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IBLMUKVLYLC;)V")
	public final void method106(int arg0, MUKVLYLC arg1) {
		for (int var3 = 0; var3 < field367; var3++) {
			int var4 = field368[var3];
			PNBDNSXO var5 = field133[var4];
			int var6 = arg1.method292();
			if ((var6 & 0x4) != 0) {
				var5.field698 = arg1.method299();
				var5.field710 = 100;
			}

			if ((var6 & 0x10) != 0) {
				int var7 = arg1.method312();
				int var8 = arg1.method310();
				var5.method248(var7, field203, var8);
				var5.field718 = field203 + 300;
				var5.field719 = arg1.method292();
				var5.field720 = arg1.method311();
			}

			if ((var6 & 0x8) != 0) {
				var5.field724 = arg1.method318();
				var5.field725 = arg1.method318();
			}

			if ((var6 & 0x20) != 0) {
				var5.field1003 = BYABUZFP.method24(arg1.method319());
				var5.field749 = var5.field1003.field41;
				var5.field745 = var5.field1003.field49;
				var5.field741 = var5.field1003.field57;
				var5.field742 = var5.field1003.field42;
				var5.field743 = var5.field1003.field44;
				var5.field744 = var5.field1003.field45;
				var5.field726 = var5.field1003.field38;
			}

			if ((var6 & 0x1) != 0) {
				int var9 = arg1.method294();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg1.method310();
				if (var5.field700 == var9 && var9 != -1) {
					int var11 = TLXFHCOO.field1242[var9].field1256;
					if (var11 == 1) {
						var5.field701 = 0;
						var5.field702 = 0;
						var5.field703 = var10;
						var5.field704 = 0;
					}

					if (var11 == 2) {
						var5.field704 = 0;
					}
				} else if (var9 == -1 || var5.field700 == -1 || TLXFHCOO.field1242[var9].field1250 >= TLXFHCOO.field1242[var5.field700].field1250) {
					var5.field700 = var9;
					var5.field701 = 0;
					var5.field702 = 0;
					var5.field703 = var10;
					var5.field704 = 0;
					var5.field748 = var5.field715;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var12 = arg1.method312();
				int var13 = arg1.method310();
				var5.method248(var12, field203, var13);
				var5.field718 = field203 + 300;
				var5.field719 = arg1.method311();
				var5.field720 = arg1.method312();
			}

			if ((var6 & 0x80) != 0) {
				var5.field721 = arg1.method320();
				if (var5.field721 == 0xFFFF) {
					var5.field721 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field736 = arg1.method294();
				int var14 = arg1.method325();
				var5.field740 = var14 >> 16;
				var5.field739 = (var14 & 0xFFFF) + field203;
				var5.field737 = 0;
				var5.field738 = 0;

				if (var5.field739 > field203) {
					var5.field737 = -1;
				}

				if (var5.field736 == 0xFFFF) {
					var5.field736 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method107(String arg0) throws IOException {
		if (field455) {
			if (field447 != null) {
				try {
					field447.close();
				} catch (Exception var4) {
				}

				field447 = null;
			}

			field447 = method167(43595);
			field447.setSoTimeout(10000);
			InputStream var2 = field447.getInputStream();
			OutputStream var3 = field447.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.n(B)V")
	public final void method108() {
		field235 = 0;
		for (int var1 = -1; var1 < field365 + field134; var1++) {
			ITPGSHXV var2;
			if (var1 == -1) {
				var2 = field73;
			} else if (var1 < field365) {
				var2 = field364[field366[var1]];
			} else {
				var2 = field133[field135[var1 - field365]];
			}

			if (var2 != null && var2.method241()) {
				if (var2 instanceof PNBDNSXO) {
					BYABUZFP var3 = ((PNBDNSXO) var2).field1003;
					if (var3.field35 != null) {
						var3 = var3.method26();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field365) {
					BYABUZFP var7 = ((PNBDNSXO) var2).field1003;
					if (var7.field30 >= 0 && var7.field30 < field407.length) {
						method41(var2.field709 + 15, var2);

						if (field468 > -1) {
							field407[var7.field30].method193(field468 - 12, field469 - 30);
						}
					}

					if (field433 == 1 && field135[var1 - field365] == field66 && field203 % 20 < 10) {
						method41(var2.field709 + 15, var2);

						if (field468 > -1) {
							field407[2].method193(field468 - 12, field469 - 28);
						}
					}
				} else {
					int var4 = 30;
					HPYXKOFA var5 = (HPYXKOFA) var2;
					if (var5.field676 != 0) {
						method41(var2.field709 + 15, var2);

						if (field468 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field676 & 1 << var6) != 0) {
									field407[var6].method193(field468 - 12, field469 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field433 == 10 && field366[var1] == field314) {
						method41(var2.field709 + 15, var2);

						if (field468 > -1) {
							field407[7].method193(field468 - 12, field469 - var4);
						}
					}
				}

				if (var2.field698 != null && (var1 >= field365 || field164 == 0 || field164 == 3 || field164 == 1 && method82(((HPYXKOFA) var2).field669))) {
					method41(var2.field709, var2);

					if (field468 > -1 && field235 < field236) {
						field240[field235] = field479.method576(var2.field698) / 2;
						field239[field235] = field479.field1454;
						field237[field235] = field468;
						field238[field235] = field469;
						field241[field235] = var2.field722;
						field242[field235] = var2.field705;
						field243[field235] = var2.field710;
						field244[field235++] = var2.field698;

						if (field389 == 0 && var2.field705 >= 1 && var2.field705 <= 3) {
							field239[field235] += 10;
							field238[field235] += 5;
						}

						if (field389 == 0 && var2.field705 == 4) {
							field240[field235] = 60;
						}

						if (field389 == 0 && var2.field705 == 5) {
							field239[field235] += 5;
						}
					}
				}

				if (var2.field718 > field203) {
					method41(var2.field709 + 15, var2);

					if (field468 > -1) {
						int var8 = var2.field719 * 30 / var2.field720;
						if (var8 > 30) {
							var8 = 30;
						}

						ACKHPAZA.method6(var8, 5, field469 - 3, 0xFF00, field468 - 15);
						ACKHPAZA.method6(30 - var8, 5, field469 - 3, 0xFF0000, field468 + var8 - 15);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field697[var9] > field203) {
						method41(var2.field709 / 2, var2);

						if (field468 > -1) {
							if (var9 == 1) {
								field469 -= 20;
							}

							if (var9 == 2) {
								field468 -= 15;
								field469 -= 10;
							}

							if (var9 == 3) {
								field468 += 15;
								field469 -= 10;
							}

							field458[var2.field696[var9]].method193(field468 - 12, field469 - 12);
							field477.method573(String.valueOf(var2.field695[var9]), field469 + 4, field468, 0);
							field477.method573(String.valueOf(var2.field695[var9]), field469 + 3, field468 - 1, 0xFFFFFF);
						}
					}
				}
			}
		}

		field420++;
		if (field420 > 58) {
			field420 = 0;
			field265.method281(245);
		}

		for (int var10 = 0; var10 < field235; var10++) {
			int var11 = field237[var10];
			int var12 = field238[var10];
			int var13 = field240[var10];
			int var14 = field239[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field238[var16] - field239[var16] && var12 - var14 < field238[var16] + 2 && var11 - var13 < field240[var16] + field237[var16] && var11 + var13 > field237[var16] - field240[var16] && field238[var16] - field239[var16] < var12) {
						var12 = field238[var16] - field239[var16];
						var15 = true;
					}
				}
			}

			field468 = field237[var10];
			field469 = field238[var10] = var12;
			String var17 = field244[var10];
			if (field389 == 0) {
				int var18 = 0xFFFF00;
				if (field241[var10] < 6) {
					var18 = field178[field241[var10]];
				}

				if (field241[var10] == 6) {
					var18 = field377 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field241[var10] == 7) {
					var18 = field377 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field241[var10] == 8) {
					var18 = field377 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field241[var10] == 9) {
					int var19 = 150 - field243[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field241[var10] == 10) {
					int var20 = 150 - field243[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field241[var10] == 11) {
					int var21 = 150 - field243[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field242[var10] == 0) {
					field479.method573(var17, field469 + 1, field468, 0);
					field479.method573(var17, field469, field468, var18);
				}

				if (field242[var10] == 1) {
					field479.method578(0, field468, field377, var17, field469 + 1);
					field479.method578(var18, field468, field377, var17, field469);
				}

				if (field242[var10] == 2) {
					field479.method579(var17, field377, 0, field469 + 1, field468);
					field479.method579(var17, field377, var18, field469, field468);
				}

				if (field242[var10] == 3) {
					field479.method580(field377, 0, field468, field469 + 1, 150 - field243[var10], var17);
					field479.method580(field377, var18, field468, field469, 150 - field243[var10], var17);
				}

				if (field242[var10] == 4) {
					int var22 = field479.method576(var17);
					int var23 = (150 - field243[var10]) * (var22 + 100) / 150;
					ACKHPAZA.method3(0, field468 + 50, field468 - 50, 334);
					field479.method577(field469 + 1, var17, field468 + 50 - var23, 0);
					field479.method577(field469, var17, field468 + 50 - var23, var18);
					ACKHPAZA.method2();
				}

				if (field242[var10] == 5) {
					int var24 = 150 - field243[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					ACKHPAZA.method3(field469 - field479.field1454 - 1, 512, 0, field469 + 5);
					field479.method573(var17, field469 + var25 + 1, field468, 0);
					field479.method573(var17, field469 + var25, field468, var18);
					ACKHPAZA.method2();
				}
			} else {
				field479.method573(var17, field469 + 1, field468, 0);
				field479.method573(var17, field469, field468, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method109() {
		field377++;
		method110(true);
		method138(true);
		method110(false);
		method138(false);
		method112();
		method33();

		if (!field192) {
			int var1 = field326;
			if (field271 / 256 > var1) {
				var1 = field271 / 256;
			}

			if (field221[4] && field467[4] + 128 > var1) {
				var1 = field467[4] + 128;
			}

			int var2 = field353 + field327 & 0x7FF;
			method144(field105, field104, var2, var1, method114(field315, field73.field707, field73.field706) - 50, var1 * 3 + 600);
		}

		int var3;
		if (field192) {
			var3 = method39();
		} else {
			var3 = method38();
		}

		int var4 = field266;
		int var5 = field267;
		int var6 = field268;
		int var7 = field269;
		int var8 = field270;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field221[var9]) {
				int var10 = (int) (Math.random() * (field382[var9] * 2 + 1) + Math.sin(field295[var9] / 100.0D * field274[var9]) * field467[var9] - field382[var9]);
				if (var9 == 0) {
					field266 += var10;
				}

				if (var9 == 1) {
					field267 += var10;
				}

				if (var9 == 2) {
					field268 += var10;
				}

				if (var9 == 3) {
					field270 = field270 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field269 += var10;
					if (field269 < 128) {
						field269 = 128;
					}

					if (field269 > 383) {
						field269 = 383;
					}
				}
			}
		}

		int var11 = QVVCPQSC.field1105;
		NJPATAFL.field900 = true;
		NJPATAFL.field903 = 0;
		NJPATAFL.field901 = field514 - 4;
		NJPATAFL.field902 = field515 - 4;
		ACKHPAZA.method4();
		field322.method548(field266, var3, field269, field267, field270, field268);
		field322.method523();
		method108();
		method120();
		method92(var11);
		method87();
		field160.method14(field506, 4, 4);
		field266 = var4;
		field267 = var5;
		field268 = var6;
		field269 = var7;
		field270 = var8;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method110(boolean arg0) {
		if (field73.field706 >> 7 == field280 && field73.field707 >> 7 == field281) {
			field280 = 0;
		}

		int var2 = field365;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			HPYXKOFA var4;
			int var5;
			if (arg0) {
				var4 = field73;
				var5 = field363 << 14;
			} else {
				var4 = field364[field366[var3]];
				var5 = field366[var3] << 14;
			}

			if (var4 != null && var4.method241()) {
				var4.field668 = false;
				if ((field344 && field365 > 50 || field365 > 200) && !arg0 && var4.field726 == var4.field712) {
					var4.field668 = true;
				}

				int var6 = var4.field706 >> 7;
				int var7 = var4.field707 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field665 == null || field203 < var4.field677 || field203 >= var4.field678) {
						if ((var4.field706 & 0x7F) == 0x40 && (var4.field707 & 0x7F) == 0x40) {
							if (field321[var6][var7] == field377) {
								continue;
							}

							field321[var6][var7] = field377;
						}

						var4.field674 = method114(field315, var4.field707, var4.field706);
						field322.method520(var4, var5, 60, var4.field708, var4.field674, field315, var4.field706, var4.field707, var4.field717);
					} else {
						var4.field668 = false;
						var4.field674 = method114(field315, var4.field707, var4.field706);
						field322.method521(var4.field707, var5, var4.field671, var4.field673, var4.field674, 60, var4.field670, var4.field672, var4.field708, field315, var4, var4.field706);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIB)V")
	public final void method111(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method112() {
		for (FIEFABCJ var1 = (FIEFABCJ) field194.method482(); var1 != null; var1 = (FIEFABCJ) field194.method484()) {
			if (field315 != var1.field567 || field203 > var1.field563) {
				var1.method397();
			} else if (field203 >= var1.field562) {
				if (var1.field566 > 0) {
					PNBDNSXO var2 = field133[var1.field566 - 1];
					if (var2 != null && var2.field706 >= 0 && var2.field706 < 13312 && var2.field707 >= 0 && var2.field707 < 13312) {
						var1.method207(method114(var1.field567, var2.field707, var2.field706) - var1.field576, var2.field707, var2.field706, field203);
					}
				}

				if (var1.field566 < 0) {
					int var3 = -var1.field566 - 1;
					HPYXKOFA var4;
					if (field262 == var3) {
						var4 = field73;
					} else {
						var4 = field364[var3];
					}

					if (var4 != null && var4.field706 >= 0 && var4.field706 < 13312 && var4.field707 >= 0 && var4.field707 < 13312) {
						var1.method207(method114(var1.field567, var4.field707, var4.field706) - var1.field576, var4.field707, var4.field706, field203);
					}
				}

				var1.method205(field109);
				field322.method520(var1, -1, 60, var1.field559, (int) var1.field579, field315, (int) var1.field577, (int) var1.field578, false);
			}
		}

		field228++;
		if (field228 > 88) {
			field228 = 0;
			field265.method281(162);
		}
	}

	@ObfuscatedName("client.q(Z)Ljava/lang/String;")
	public final String method113() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field509 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method114(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field175[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field325[var6][var4][var5] + field325[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field325[var6][var4][var5 + 1] + field325[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ZILUKJEXUVU;IIZIII)V")
	public final void method115(boolean arg0, int arg1, UKJEXUVU arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field461) {
			field136 = 32;
		} else {
			field136 = 0;
		}

		field461 = false;
		if (arg7 >= arg4 && arg7 < arg4 + 16 && arg5 >= arg1 && arg5 < arg1 + 16) {
			arg2.field1327 -= field263 * 4;

			if (arg0) {
				field112 = true;
				return;
			}
		} else if (arg7 >= arg4 && arg7 < arg4 + 16 && arg5 >= arg1 + arg6 - 16 && arg5 < arg1 + arg6) {
			arg2.field1327 += field263 * 4;

			if (arg0) {
				field112 = true;
				return;
			}
		} else if (arg7 >= arg4 - field136 && arg7 < arg4 + field136 + 16 && arg5 >= arg1 + 16 && arg5 < arg1 + arg6 - 16 && field263 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg1 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg2.field1327 = (arg3 - arg6) * var10 / var11;

			if (arg0) {
				field112 = true;
			}

			field461 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method116() {
		field398 = 0;
		int var1 = (field73.field706 >> 7) + field122;
		int var2 = (field73.field707 >> 7) + field123;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field398 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field398 = 1;
		}

		if (field398 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field398 = 0;
		}
	}

	@ObfuscatedName("client.o(B)Z")
	public final boolean method117() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ILUKJEXUVU;)Z")
	public final boolean method118(UKJEXUVU arg0) {
		int var2 = arg0.field1294;
		if (field261 == 2) {
			if (var2 == 201) {
				field222 = true;
				field139 = 0;
				field320 = true;
				field251 = "";
				field176 = 1;
				field284 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field222 = true;
				field139 = 0;
				field320 = true;
				field251 = "";
				field176 = 2;
				field284 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field90 = 250;
			return true;
		}

		if (var2 == 501) {
			field222 = true;
			field139 = 0;
			field320 = true;
			field251 = "";
			field176 = 4;
			field284 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field222 = true;
			field139 = 0;
			field320 = true;
			field251 = "";
			field176 = 5;
			field284 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field80[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = CWWAFTAL.field490 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= CWWAFTAL.field490) {
							var5 = 0;
						}
					}

					if (!CWWAFTAL.field491[var5].field497 && CWWAFTAL.field491[var5].field492 == var3 + (field414 ? 0 : 7)) {
						break;
					}
				}

				field80[var3] = var5;
				field220 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field484[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field254[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field254[var6].length) {
					var8 = 0;
				}
			}

			field484[var6] = var8;
			field220 = true;
		}

		if (var2 == 324 && !field414) {
			field414 = true;
			method95();
		}

		if (var2 == 325 && field414) {
			field414 = false;
			method95();
		}

		if (var2 == 326) {
			field265.method281(66);
			field265.method282(field414 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field265.method282(field80[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field265.method282(field484[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field250 = !field250;
		}

		if (var2 >= 601 && var2 <= 612) {
			method142();

			if (field451.length() > 0) {
				field265.method281(223);
				field265.method288(POOZNYPH.method413(field451));
				field265.method282(var2 - 601);
				field265.method282(field250 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method119(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field322.method539(field315, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			PFIKHQJO var8 = PFIKHQJO.method405(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field966;
				var10 = var8.field995;
			} else {
				var9 = var8.field995;
				var10 = var8.field966;
			}

			int var11 = var8.field959;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method66(2, var10, 0, var9, arg0, var11, false, 0, field73.field746[0], field73.field747[0], arg1);
		} else {
			method66(2, 0, var6 + 1, 0, arg0, 0, false, var7, field73.field746[0], field73.field747[0], arg1);
		}

		field93 = field521;
		field94 = field522;
		field96 = 2;
		field95 = 0;
		return true;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method120() {
		if (field433 == 2) {
			method42(field257 * 2, (field256 - field123 << 7) + field259, (field255 - field122 << 7) + field258);

			if (field468 > -1 && field203 % 20 < 10) {
				field407[2].method193(field468 - 12, field469 - 28);
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field145.method500(arg1, arg0);
		field146.method500(arg1, arg0 + arg3 - 16);
		ACKHPAZA.method6(16, arg3 - 32, arg0 + 16, field441, arg1);
		int var6 = (arg3 - 32) * arg3 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg4 / (arg2 - arg3);
		ACKHPAZA.method6(16, var6, arg0 + var7 + 16, field440, arg1);
		ACKHPAZA.method11(arg1, arg0 + var7 + 16, var6, field231);
		ACKHPAZA.method11(arg1 + 1, arg0 + 16 + var7, var6, field231);
		ACKHPAZA.method9(field231, arg1, arg0 + var7 + 16, 16);
		ACKHPAZA.method9(field231, arg1, arg0 + var7 + 17, 16);
		ACKHPAZA.method11(arg1 + 15, arg0 + 16 + var7, var6, field351);
		ACKHPAZA.method11(arg1 + 14, arg0 + 17 + var7, var6 - 1, field351);
		ACKHPAZA.method9(field351, arg1, arg0 + var7 + var6 + 15, 16);
		ACKHPAZA.method9(field351, arg1 + 1, arg0 + 14 + var7 + var6, 15);
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method122(int arg0) {
		UKJEXUVU var2 = UKJEXUVU.field1300[arg0];
		for (int var3 = 0; var3 < var2.field1311.length && var2.field1311[var3] != -1; var3++) {
			UKJEXUVU var4 = UKJEXUVU.field1300[var2.field1311[var3]];
			if (var4.field1317 == 1) {
				method122(var4.field1301);
			}

			var4.field1316 = 0;
			var4.field1319 = 0;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method123() {
		if (field191 || field174 || field404) {
			method131();
		} else {
			field137++;

			if (field115) {
				method76();
			} else {
				method59(false);
			}

			field263 = 0;
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method124(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method125(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(B)V")
	public final void method126() {
		if (!field191 && !field174 && !field404) {
			field203++;

			if (field115) {
				method86();
			} else {
				method34();
			}

			method145();
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method127() {
		UWQNYVPL.field1348 = false;
		QVVCPQSC.field1085 = false;
		field344 = false;
		SNGUFYDX.field1206 = false;
		PFIKHQJO.field982 = false;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method128() {
		if (field68 != 0) {
			YZXOZYLM var1 = field478;
			int var2 = 0;
			if (field180 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field293[var3] != null) {
					int var4 = field291[var3];
					String var5 = field292[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field195 == 0 || field195 == 1 && method82(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method577(var7, "From", var8, 0);
						var1.method577(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method575("From ");
						if (var6 == 1) {
							field283[0].method500(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field283[1].method500(var11, var7 - 12);
							var11 += 14;
						}

						var1.method577(var7, var5 + ": " + field293[var3], var11, 0);
						var1.method577(var7 - 1, var5 + ": " + field293[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field195 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method577(var9, field293[var3], 4, 0);
						var1.method577(var9 - 1, field293[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field195 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method577(var10, "To " + var5 + ": " + field293[var3], 4, 0);
						var1.method577(var10 - 1, "To " + var5 + ": " + field293[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method129() {
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

		field452 += 128;
		if (field452 > field188.length) {
			field452 -= field188.length;
			int var11 = (int) (Math.random() * 12.0D);
			method140(field138[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field429[var14 + 128] - field188[field452 + var14 & field188.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field428[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field290[var16] = field290[var16 + 1];
		}

		field290[var1 - 1] = (int) (Math.sin(field203 / 14.0D) * 16.0D + Math.sin(field203 / 15.0D) * 14.0D + Math.sin(field203 / 16.0D) * 12.0D);

		if (field302 > 0) {
			field302 -= 4;
		}

		if (field303 > 0) {
			field303 -= 4;
		}

		if (field302 == 0 && field303 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field302 = 1024;
			}

			if (var17 == 1) {
				field303 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method130() {
		if (field142 == 0) {
			int var1 = field520;
			if (field149 == 1 && field521 >= 516 && field522 >= 160 && field521 <= 765 && field522 <= 205) {
				var1 = 0;
			}

			if (field464) {
				if (var1 != 1) {
					int var2 = field514;
					int var3 = field515;
					if (field196 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field196 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field196 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field197 - 10 || var2 > field199 + field197 + 10 || var3 < field198 - 10 || var3 > field200 + field198 + 10) {
						field464 = false;

						if (field196 == 1) {
							field112 = true;
						}

						if (field196 == 2) {
							field222 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field197;
					int var5 = field198;
					int var6 = field199;
					int var7 = field521;
					int var8 = field522;
					if (field196 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field196 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field196 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field296; var10++) {
						int var11 = (field296 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method162(var9);
					}

					field464 = false;

					if (field196 == 1) {
						field112 = true;
					}

					if (field196 == 2) {
						field222 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field296 > 0) {
					int var12 = field444[field296 - 1];
					if (var12 == 431 || var12 == 262 || var12 == 892 || var12 == 983 || var12 == 650 || var12 == 615 || var12 == 898 || var12 == 754 || var12 == 107 || var12 == 634 || var12 == 236 || var12 == 1072) {
						int var13 = field442[field296 - 1];
						int var14 = field443[field296 - 1];
						UKJEXUVU var15 = UKJEXUVU.field1300[var14];
						if (var15.field1320 || var15.field1291) {
							field179 = false;
							field460 = 0;
							field140 = var14;
							field141 = var13;
							field142 = 2;
							field143 = field521;
							field144 = field522;

							if (UKJEXUVU.field1300[var14].field1321 == field91) {
								field142 = 1;
							}

							if (UKJEXUVU.field1300[var14].field1321 == field98) {
								field142 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field439 == 1 || method157(field296 - 1)) && field296 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field296 > 0) {
					method162(field296 - 1);
				}

				if (var1 != 2 || field296 <= 0) {
					return;
				}

				method32();
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method131() {
		Graphics var1 = method135().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method182(1);

		if (field174) {
			field449 = false;
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

		if (field404) {
			field449 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field191) {
			field449 = false;
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

	@ObfuscatedName("client.a(ILBYABUZFP;III)V")
	public final void method132(int arg0, BYABUZFP arg1, int arg2, int arg3) {
		if (field296 < 400) {
			if (arg1.field35 != null) {
				arg1 = arg1.method26();
			}

			if (arg1 != null && arg1.field33) {
				String var5 = arg1.field53;
				if (arg1.field32 != 0) {
					var5 = var5 + method169(arg1.field32, field73.field661) + " (level-" + arg1.field32 + ")";
				}

				if (field390 == 1) {
					field212[field296] = "Use " + field394 + " with @yel@" + var5;
					field444[field296] = 900;
					field445[field296] = arg3;
					field442[field296] = arg0;
					field443[field296] = arg2;
					field296++;
				} else if (field149 != 1) {
					if (arg1.field56 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field56[var6] != null && !arg1.field56[var6].equalsIgnoreCase("attack")) {
								field212[field296] = arg1.field56[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field444[field296] = 648;
								}

								if (var6 == 1) {
									field444[field296] = 641;
								}

								if (var6 == 2) {
									field444[field296] = 495;
								}

								if (var6 == 3) {
									field444[field296] = 312;
								}

								if (var6 == 4) {
									field444[field296] = 837;
								}

								field445[field296] = arg3;
								field442[field296] = arg0;
								field443[field296] = arg2;
								field296++;
							}
						}
					}

					if (arg1.field56 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field56[var7] != null && arg1.field56[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field32 > field73.field661) {
									var8 = 2000;
								}

								field212[field296] = arg1.field56[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field444[field296] = var8 + 648;
								}

								if (var7 == 1) {
									field444[field296] = var8 + 641;
								}

								if (var7 == 2) {
									field444[field296] = var8 + 495;
								}

								if (var7 == 3) {
									field444[field296] = var8 + 312;
								}

								if (var7 == 4) {
									field444[field296] = var8 + 837;
								}

								field445[field296] = arg3;
								field442[field296] = arg0;
								field443[field296] = arg2;
								field296++;
							}
						}
					}

					field212[field296] = "Examine @yel@" + var5;
					field444[field296] = 1235;
					field445[field296] = arg3;
					field442[field296] = arg0;
					field443[field296] = arg2;
					field296++;
				} else if ((field151 & 0x2) == 2) {
					field212[field296] = field152 + " @yel@" + var5;
					field444[field296] = 384;
					field445[field296] = arg3;
					field442[field296] = arg0;
					field443[field296] = arg2;
					field296++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method133(int arg0, int arg1) {
		SWVPDERM var3 = field462[field315][arg0][arg1];
		if (var3 == null) {
			field322.method530(field315, arg0, arg1);
		} else {
			int var4 = -99999999;
			JKZHUQUE var5 = null;
			for (JKZHUQUE var6 = (JKZHUQUE) var3.method482(); var6 != null; var6 = (JKZHUQUE) var3.method484()) {
				PZNZFKPU var7 = PZNZFKPU.method428(var6.field759);
				int var8 = var7.field1032;
				if (var7.field1036) {
					var8 = (var6.field760 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method480(var5);
			JKZHUQUE var9 = null;
			JKZHUQUE var10 = null;
			for (JKZHUQUE var11 = (JKZHUQUE) var3.method482(); var11 != null; var11 = (JKZHUQUE) var3.method484()) {
				if (var5.field759 != var11.field759 && var9 == null) {
					var9 = var11;
				}

				if (var5.field759 != var11.field759 && var9.field759 != var11.field759 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field322.method516(var10, arg1, var12, var5, var9, arg0, field315, method114(field315, arg1 * 128 + 64, arg0 * 128 + 64));
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void method134() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field248);

		if (field185 != null) {
			System.out.println("Od-cycle:" + field185.field630);
		}

		System.out.println("loop-cycle:" + field203);
		System.out.println("draw-cycle:" + field137);
		System.out.println("ptype:" + field87);
		System.out.println("psize:" + field86);

		if (field214 != null) {
			field214.method215();
		}

		field503 = true;
	}

	@ObfuscatedName("client.b(I)Ljava/awt/Component;")
	public final Component method135() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field509 != null) {
			return field509;
		}

		return this;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method136() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(ILMUKVLYLC;I)V")
	public final void method137(int arg0, MUKVLYLC arg1) {
		int var3 = arg1.method303(8);
		if (var3 < field365) {
			for (int var4 = var3; var4 < field365; var4++) {
				field423[field422++] = field366[var4];
			}
		}

		if (var3 > field365) {
			signlink.reporterror(field402 + " Too many players");
			throw new RuntimeException("eek");
		}

		field365 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field366[var5];
			HPYXKOFA var7 = field364[var6];
			int var8 = arg1.method303(1);
			if (var8 == 0) {
				field366[field365++] = var6;
				var7.field735 = field203;
			} else {
				int var9 = arg1.method303(2);
				if (var9 == 0) {
					field366[field365++] = var6;
					var7.field735 = field203;
					field368[field367++] = var6;
				} else if (var9 == 1) {
					field366[field365++] = var6;
					var7.field735 = field203;
					int var10 = arg1.method303(3);
					var7.method247(var10, false);
					int var11 = arg1.method303(1);
					if (var11 == 1) {
						field368[field367++] = var6;
					}
				} else if (var9 == 2) {
					field366[field365++] = var6;
					var7.field735 = field203;
					int var12 = arg1.method303(3);
					var7.method247(var12, true);
					int var13 = arg1.method303(3);
					var7.method247(var13, true);
					int var14 = arg1.method303(1);
					if (var14 == 1) {
						field368[field367++] = var6;
					}
				} else if (var9 == 3) {
					field423[field422++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method138(boolean arg0) {
		for (int var2 = 0; var2 < field134; var2++) {
			PNBDNSXO var3 = field133[field135[var2]];
			int var4 = (field135[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method241() && var3.field1003.field60 == arg0) {
				int var5 = var3.field706 >> 7;
				int var6 = var3.field707 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field749 == 1 && (var3.field706 & 0x7F) == 0x40 && (var3.field707 & 0x7F) == 0x40) {
						if (field321[var5][var6] == field377) {
							continue;
						}

						field321[var5][var6] = field377;
					}

					if (!var3.field1003.field33) {
						var4 += Integer.MIN_VALUE;
					}

					field322.method520(var3, var4, (var3.field749 - 1) * 64 + 60, var3.field708, method114(field315, var3.field707, var3.field706), field315, var3.field706, var3.field707, var3.field717);
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 311);

			if (arg0.length == 5) {
				field341 = Integer.parseInt(arg0[0]);
				field342 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method47();
				} else if (arg0[2].equals("highmem")) {
					method127();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field343 = false;
				} else if (arg0[3].equals("members")) {
					field343 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method179(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZILjava/lang/String;)V")
	public final void method139(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field247 != -1) {
			field264 = arg0;
			field520 = 0;
		}

		if (field98 == -1) {
			field222 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field291[var4] = field291[var4 - 1];
			field292[var4] = field292[var4 - 1];
			field293[var4] = field293[var4 - 1];
		}

		field291[0] = arg1;
		field292[0] = arg2;
		field293[0] = arg0;
	}

	@ObfuscatedName("client.a(ZLTOROBAKX;)V")
	public final void method140(TOROBAKX arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field188.length; var3++) {
			field188[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field188[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field189[var9] = (field188[var9 - 1] + field188[var9 + 1] + field188[var9 - 128] + field188[var9 + 128]) / 4;
				}
			}

			int[] var10 = field188;
			field188 = field189;
			field189 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1261; var12++) {
				for (int var13 = 0; var13 < arg0.field1260; var13++) {
					if (arg0.field1258[var11++] != 0) {
						int var14 = var13 + arg0.field1262 + 16;
						int var15 = var12 + arg0.field1263 + 16;
						int var16 = (var15 << 7) + var14;
						field188[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method141() {
		field77 = true;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method142() {
		field265.method281(71);

		if (field453 != -1) {
			field453 = -1;
			field112 = true;
			field121 = false;
			field120 = true;
		}

		if (field98 != -1) {
			field98 = -1;
			field222 = true;
			field121 = false;
		}

		field91 = -1;
	}

	@ObfuscatedName("client.a(ZILMUKVLYLC;LHPYXKOFA;I)V")
	public final void method143(int arg0, MUKVLYLC arg1, HPYXKOFA arg2, int arg3) {
		if ((arg0 & 0x100) != 0) {
			int var5 = arg1.method312();
			int var6 = arg1.method311();
			arg2.method248(var5, field203, var6);
			arg2.field718 = field203 + 300;
			arg2.field719 = arg1.method312();
			arg2.field720 = arg1.method312();
		}

		if ((arg0 & 0x400) != 0) {
			arg2.field736 = arg1.method320();
			int var7 = arg1.method325();
			arg2.field740 = var7 >> 16;
			arg2.field739 = (var7 & 0xFFFF) + field203;
			arg2.field737 = 0;
			arg2.field738 = 0;

			if (arg2.field739 > field203) {
				arg2.field737 = -1;
			}

			if (arg2.field736 == 0xFFFF) {
				arg2.field736 = -1;
			}
		}

		if ((arg0 & 0x10) != 0) {
			int var8 = arg1.method294();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			int var9 = arg1.method312();
			if (arg2.field700 == var8 && var8 != -1) {
				int var10 = TLXFHCOO.field1242[var8].field1256;
				if (var10 == 1) {
					arg2.field701 = 0;
					arg2.field702 = 0;
					arg2.field703 = var9;
					arg2.field704 = 0;
				}

				if (var10 == 2) {
					arg2.field704 = 0;
				}
			} else if (var8 == -1 || arg2.field700 == -1 || TLXFHCOO.field1242[var8].field1250 >= TLXFHCOO.field1242[arg2.field700].field1250) {
				arg2.field700 = var8;
				arg2.field701 = 0;
				arg2.field702 = 0;
				arg2.field703 = var9;
				arg2.field704 = 0;
				arg2.field748 = arg2.field715;
			}
		}

		if ((arg0 & 0x1) != 0) {
			arg2.field721 = arg1.method319();
			if (arg2.field721 == 0xFFFF) {
				arg2.field721 = -1;
			}
		}

		if ((arg0 & 0x40) != 0) {
			arg2.field698 = arg1.method299();
			if (arg2.field698.charAt(0) == '~') {
				arg2.field698 = arg2.field698.substring(1);
				method139(arg2.field698, 2, arg2.field669);
			} else if (field73 == arg2) {
				method139(arg2.field698, 2, arg2.field669);
			}

			arg2.field722 = 0;
			arg2.field705 = 0;
			arg2.field710 = 150;
		}

		if ((arg0 & 0x200) != 0) {
			arg2.field728 = arg1.method312();
			arg2.field730 = arg1.method310();
			arg2.field729 = arg1.method292();
			arg2.field731 = arg1.method311();
			arg2.field732 = arg1.method294() + field203;
			arg2.field733 = arg1.method320() + field203;
			arg2.field734 = arg1.method311();
			arg2.method246();
		}

		if ((arg0 & 0x8) != 0) {
			int var11 = arg1.method320();
			int var12 = arg1.method310();
			int var13 = arg1.method311();
			int var14 = arg1.field812;

			if (arg2.field669 != null && arg2.field667) {
				long var15 = POOZNYPH.method413(arg2.field669);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field488; var18++) {
						if (field118[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field398 == 0) {
					try {
						field132.field812 = 0;
						arg1.method329(0, var13, field132.field811);
						field132.field812 = 0;
						String var19 = AXMCEEOC.method21(field132, var13);
						var19 = OCOLATKS.method369(var19);
						arg2.field698 = var19;
						arg2.field722 = var11 >> 8;
						arg2.field705 = var11 & 0xFF;
						arg2.field710 = 150;

						if (var12 == 2 || var12 == 3) {
							method139(var19, 1, "@cr2@" + arg2.field669);
						} else if (var12 == 1) {
							method139(var19, 1, "@cr1@" + arg2.field669);
						} else {
							method139(var19, 2, arg2.field669);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field812 = var13 + var14;
		}

		if ((arg0 & 0x4) != 0) {
			arg2.field724 = arg1.method318();
			arg2.field725 = arg1.method318();
		}

		if ((arg0 & 0x20) != 0) {
			int var21 = arg1.method312();
			byte[] var22 = new byte[var21];
			MUKVLYLC var23 = new MUKVLYLC(var22);
			arg1.method328(var22, 0, var21);
			field369[arg3] = var23;
			arg2.method243(var23);
		}

		if ((arg0 & 0x2) != 0) {
			int var24 = arg1.method312();
			int var25 = arg1.method312();
			arg2.method248(var24, field203, var25);
			arg2.field718 = field203 + 300;
			arg2.field719 = arg1.method312();
			arg2.field720 = arg1.method292();
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = NJPATAFL.field905[var7];
			int var13 = NJPATAFL.field906[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = NJPATAFL.field905[var8];
			int var16 = NJPATAFL.field906[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field266 = arg1 - var9;
		field267 = arg4 - var10;
		field268 = arg0 - var11;
		field269 = arg3;
		field270 = arg2;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method145() {
		while (true) {
			EGGOGKSD var1 = field185.method232();
			if (var1 == null) {
				return;
			}

			if (var1.field533 == 0) {
				NJPATAFL.method332(var1.field537, var1.field535);

				if ((field185.method220(var1.field537) & 0x62) != 0) {
					field112 = true;

					if (field98 != -1) {
						field222 = true;
					}
				}
			}

			if (var1.field533 == 1 && var1.field535 != null) {
				TDFMBTLA.method488(var1.field535);
			}

			if (var1.field533 == 2 && field412 == var1.field537 && var1.field535 != null) {
				method52(var1.field535, field413);
			}

			if (var1.field533 == 3 && field277 == 1) {
				for (int var2 = 0; var2 < field360.length; var2++) {
					if (field305[var2] == var1.field537) {
						field360[var2] = var1.field535;

						if (var1.field535 == null) {
							field305[var2] = -1;
						}

						break;
					}

					if (field306[var2] == var1.field537) {
						field202[var2] = var1.field535;

						if (var1.field535 == null) {
							field306[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field533 == 93 && field185.method228(var1.field537)) {
				SNGUFYDX.method464(new MUKVLYLC(var1.field535), field185);
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method146(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field293[var4] != null) {
				int var5 = field291[var4];
				int var6 = field279 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field292[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field164 == 0 || field164 == 1 && method82(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field73.field669)) {
						if (field70 >= 1) {
							field212[field296] = "Report abuse @whi@" + var7;
							field444[field296] = 529;
							field296++;
						}

						field212[field296] = "Add ignore @whi@" + var7;
						field444[field296] = 176;
						field296++;
						field212[field296] = "Add friend @whi@" + var7;
						field444[field296] = 521;
						field296++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field68 == 0 && (var5 == 7 || field195 == 0 || field195 == 1 && method82(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field70 >= 1) {
							field212[field296] = "Report abuse @whi@" + var7;
							field444[field296] = 529;
							field296++;
						}

						field212[field296] = "Add ignore @whi@" + var7;
						field444[field296] = 176;
						field296++;
						field212[field296] = "Add friend @whi@" + var7;
						field444[field296] = 521;
						field296++;
					}

					var3++;
				}

				if (var5 == 4 && (field224 == 0 || field224 == 1 && method82(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field212[field296] = "Accept trade @whi@" + var7;
						field444[field296] = 374;
						field296++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field68 == 0 && field195 < 2) {
					var3++;
				}

				if (var5 == 8 && (field224 == 0 || field224 == 1 && method82(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field212[field296] = "Accept challenge @whi@" + var7;
						field444[field296] = 35;
						field296++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLUKJEXUVU;I)I")
	public final int method147(UKJEXUVU arg0, int arg1) {
		if (arg0.field1318 == null || arg1 >= arg0.field1318.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1318[arg1];
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
					var8 = field486[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field226[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field470[var3[var5++]];
				}

				if (var7 == 4) {
					UKJEXUVU var10 = UKJEXUVU.field1300[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < PZNZFKPU.field1037 && (!PZNZFKPU.method428(var11).field1031 || field343)) {
						for (int var12 = 0; var12 < var10.field1287.length; var12++) {
							if (var11 + 1 == var10.field1287[var12]) {
								var8 += var10.field1339[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field230[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field117[field226[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field230[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field73.field661;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < XYOGJTRE.field1432; var13++) {
						if (XYOGJTRE.field1434[var13]) {
							var8 += field226[var13];
						}
					}
				}

				if (var7 == 10) {
					UKJEXUVU var14 = UKJEXUVU.field1300[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < PZNZFKPU.field1037 && (!PZNZFKPU.method428(var15).field1031 || field343)) {
						for (int var16 = 0; var16 < var14.field1287.length; var16++) {
							if (var14.field1287[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field155;
				}

				if (var7 == 12) {
					var8 = field213;
				}

				if (var7 == 13) {
					int var17 = field230[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					FTZZSWCP var20 = FTZZSWCP.field640[var19];
					int var21 = var20.field642;
					int var22 = var20.field643;
					int var23 = var20.field644;
					int var24 = field114[var23 - var22];
					var8 = field230[var21] >> var22 & var24;
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
					var8 = (field73.field706 >> 7) + field122;
				}

				if (var7 == 19) {
					var8 = (field73.field707 >> 7) + field123;
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

	@ObfuscatedName("client.a(BLUKJEXUVU;)Z")
	public final boolean method148(UKJEXUVU arg0) {
		if (arg0.field1293 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1293.length; var2++) {
			int var3 = method147(arg0, var2);
			int var4 = arg0.field1337[var2];
			if (arg0.field1293[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1293[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1293[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method149() {
		int var1 = field197;
		int var2 = field198;
		int var3 = field199;
		int var4 = field200;
		int var5 = 0x5D5447;
		ACKHPAZA.method6(var3, var4, var2, var5, var1);
		ACKHPAZA.method6(var3 - 2, 16, var2 + 1, 0, var1 + 1);
		ACKHPAZA.method7(var1 + 1, var2 + 18, 0, var3 - 2, var4 - 19);
		field479.method577(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field514;
		int var7 = field515;
		if (field196 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field196 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field196 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field296; var8++) {
			int var9 = (field296 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field479.method581(var9, var1 + 3, var10, true, field212[var8]);
		}
	}

	@ObfuscatedName("client.a(LMWTZCFMC;I)V")
	public final void method150(MWTZCFMC arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field829 == 0) {
			var2 = field322.method535(arg0.field828, arg0.field830, arg0.field831);
		}

		if (arg0.field829 == 1) {
			var2 = field322.method536(arg0.field828, arg0.field831, arg0.field830);
		}

		if (arg0.field829 == 2) {
			var2 = field322.method537(arg0.field828, arg0.field830, arg0.field831);
		}

		if (arg0.field829 == 3) {
			var2 = field322.method538(arg0.field828, arg0.field830, arg0.field831);
		}

		if (var2 != 0) {
			int var6 = field322.method539(arg0.field828, arg0.field830, arg0.field831, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field825 = var3;
		arg0.field827 = var4;
		arg0.field826 = var5;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method151() {
		if (field165 == null) {
			field507 = null;
			field161 = null;
			field159 = null;
			field158 = null;
			field160 = null;
			field378 = null;
			field379 = null;
			field380 = null;
			field168 = new ARAKDHLD(265, method135(), 128);
			ACKHPAZA.method4();
			field169 = new ARAKDHLD(265, method135(), 128);
			ACKHPAZA.method4();
			field165 = new ARAKDHLD(171, method135(), 509);
			ACKHPAZA.method4();
			field166 = new ARAKDHLD(132, method135(), 360);
			ACKHPAZA.method4();
			field167 = new ARAKDHLD(200, method135(), 360);
			ACKHPAZA.method4();
			field170 = new ARAKDHLD(238, method135(), 202);
			ACKHPAZA.method4();
			field171 = new ARAKDHLD(238, method135(), 203);
			ACKHPAZA.method4();
			field172 = new ARAKDHLD(94, method135(), 74);
			ACKHPAZA.method4();
			field173 = new ARAKDHLD(94, method135(), 75);
			ACKHPAZA.method4();

			if (field186 != null) {
				method45();
				method57();
			}

			field77 = true;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method152() {
		while (true) {
			int var1 = method183();
			if (var1 == -1) {
				return;
			}

			if (field91 != -1 && field91 == field75) {
				if (var1 == 8 && field451.length() > 0) {
					field451 = field451.substring(0, field451.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field451.length() < 12) {
					field451 = field451 + (char) var1;
				}
			} else if (field320) {
				if (var1 >= 32 && var1 <= 122 && field251.length() < 80) {
					field251 = field251 + (char) var1;
					field222 = true;
				}

				if (var1 == 8 && field251.length() > 0) {
					field251 = field251.substring(0, field251.length() - 1);
					field222 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field320 = false;
					field222 = true;

					if (field176 == 1) {
						long var2 = POOZNYPH.method413(field251);
						method155(var2);
					}

					if (field176 == 2 && field260 > 0) {
						long var4 = POOZNYPH.method413(field251);
						method56(var4);
					}

					if (field176 == 3 && field251.length() > 0) {
						field265.method281(48);
						field265.method282(0);
						int var6 = field265.field812;
						field265.method288(field357);
						AXMCEEOC.method22(field265, field251);
						field265.method291(field265.field812 - var6);
						field251 = AXMCEEOC.method23(field251);
						field251 = OCOLATKS.method369(field251);
						method139(field251, 6, POOZNYPH.method417(POOZNYPH.method414(field357)));

						if (field195 == 2) {
							field195 = 1;
							field273 = true;
							field265.method281(58);
							field265.method282(field164);
							field265.method282(field195);
							field265.method282(field224);
						}
					}

					if (field176 == 4 && field488 < 100) {
						long var7 = POOZNYPH.method413(field251);
						method40(var7);
					}

					if (field176 == 5 && field488 > 0) {
						long var9 = POOZNYPH.method413(field251);
						method51(var9);
					}
				}
			} else if (field139 == 1) {
				if (var1 >= 48 && var1 <= 57 && field108.length() < 10) {
					field108 = field108 + (char) var1;
					field222 = true;
				}

				if (var1 == 8 && field108.length() > 0) {
					field108 = field108.substring(0, field108.length() - 1);
					field222 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field108.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field108);
						} catch (Exception var21) {
						}

						field265.method281(55);
						field265.method286(var11);
					}

					field139 = 0;
					field222 = true;
				}
			} else if (field139 == 2) {
				if (var1 >= 32 && var1 <= 122 && field108.length() < 12) {
					field108 = field108 + (char) var1;
					field222 = true;
				}

				if (var1 == 8 && field108.length() > 0) {
					field108 = field108.substring(0, field108.length() - 1);
					field222 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field108.length() > 0) {
						field265.method281(244);
						field265.method288(POOZNYPH.method413(field108));
					}

					field139 = 0;
					field222 = true;
				}
			} else if (field98 == -1) {
				if (var1 >= 32 && var1 <= 122 && field184.length() < 80) {
					field184 = field184 + (char) var1;
					field222 = true;
				}

				if (var1 == 8 && field184.length() > 0) {
					field184 = field184.substring(0, field184.length() - 1);
					field222 = true;
				}

				if ((var1 == 13 || var1 == 10) && field184.length() > 0) {
					if (field70 == 2) {
						if (field184.equals("::clientdrop")) {
							method68();
						}

						if (field184.equals("::lag")) {
							method134();
						}

						if (field184.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field185.method216(2); var12++) {
								field185.method217(2, (byte) 1, var12);
							}
						}

						if (field184.equals("::fpson")) {
							field276 = true;
						}

						if (field184.equals("::fpsoff")) {
							field276 = false;
						}

						if (field184.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field421[var13].field793[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field184.startsWith("::")) {
						field265.method281(7);
						field265.method282(field184.length() - 1);
						field265.method289(field184.substring(2));
					} else {
						String var16 = field184.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field184 = field184.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field184 = field184.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field184 = field184.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field184 = field184.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field184 = field184.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field184 = field184.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field184 = field184.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field184 = field184.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field184 = field184.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field184 = field184.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field184 = field184.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field184 = field184.substring(6);
						}

						String var18 = field184.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field184 = field184.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field184 = field184.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field184 = field184.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field184 = field184.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field184 = field184.substring(6);
						}

						field265.method281(39);
						field265.method282(0);
						int var20 = field265.field812;
						field265.method282(var19);
						field132.field812 = 0;
						AXMCEEOC.method22(field132, field184);
						field265.method327(field132.field811, field132.field812, 0);
						field265.method308(var17);
						field265.method291(field265.field812 - var20);
						field184 = AXMCEEOC.method23(field184);
						field184 = OCOLATKS.method369(field184);
						field73.field698 = field184;
						field73.field722 = var17;
						field73.field705 = var19;
						field73.field710 = 150;

						if (field70 == 2) {
							method139(field73.field698, 2, "@cr2@" + field73.field669);
						} else if (field70 == 1) {
							method139(field73.field698, 2, "@cr1@" + field73.field669);
						} else {
							method139(field73.field698, 2, field73.field669);
						}

						if (field164 == 2) {
							field164 = 3;
							field273 = true;
							field265.method281(58);
							field265.method282(field164);
							field265.method282(field195);
							field265.method282(field224);
						}
					}

					field184 = "";
					field222 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method153(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method154(String arg0) {
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

	@ObfuscatedName("client.b(IJ)V")
	public final void method155(long arg0) {
		if (arg0 != 0L) {
			if (field260 >= 100 && field275 != 1) {
				method139("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field260 >= 200) {
				method139("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = POOZNYPH.method417(POOZNYPH.method414(arg0));
				for (int var4 = 0; var4 < field260; var4++) {
					if (field487[var4] == arg0) {
						method139(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field488; var5++) {
					if (field118[var5] == arg0) {
						method139("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field73.field669)) {
					field113[field260] = var3;
					field487[field260] = arg0;
					field148[field260] = 0;
					field260++;
					field112 = true;
					field265.method281(233);
					field265.method288(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILMUKVLYLC;)V")
	public final void method156(int arg0, MUKVLYLC arg1) {
		while (arg1.field813 + 21 < arg0 * 8) {
			int var3 = arg1.method303(14);
			if (var3 == 16383) {
				break;
			}

			if (field133[var3] == null) {
				field133[var3] = new PNBDNSXO();
			}

			PNBDNSXO var4 = field133[var3];
			field135[field134++] = var3;
			var4.field735 = field203;
			int var5 = arg1.method303(1);
			int var6 = arg1.method303(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method303(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method303(1);
			if (var8 == 1) {
				field368[field367++] = var3;
			}

			var4.field1003 = BYABUZFP.method24(arg1.method303(12));
			var4.field749 = var4.field1003.field41;
			var4.field745 = var4.field1003.field49;
			var4.field741 = var4.field1003.field57;
			var4.field742 = var4.field1003.field42;
			var4.field743 = var4.field1003.field44;
			var4.field744 = var4.field1003.field45;
			var4.field726 = var4.field1003.field38;
			var4.method245(field73.field747[0] + var7, var5 == 1, field73.field746[0] + var6);
		}

		arg1.method304();
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method157(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field444[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 521) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method158() {
		try {
			field82 = -1;
			field126.method486();
			field194.method486();
			QVVCPQSC.method436();
			method54();
			field322.method509();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field421[var1].method268();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field175[var2][var3][var4] = 0;
					}
				}
			}

			SNGUFYDX var5 = new SNGUFYDX(field175, 104, 104, field325);
			int var6 = field360.length;
			field265.method281(253);

			if (!field83) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field304[var7] >> 8) * 64 - field122;
					int var9 = (field304[var7] & 0xFF) * 64 - field123;
					byte[] var10 = field360[var7];
					if (var10 != null) {
						var5.method455(var9, field421, (field153 - 6) * 8, (field154 - 6) * 8, var10, var8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field304[var11] >> 8) * 64 - field122;
					int var13 = (field304[var11] & 0xFF) * 64 - field123;
					byte[] var14 = field360[var11];
					if (var14 == null && field154 < 800) {
						var5.method457(64, var12, var13, 64);
					}
				}

				field265.method281(253);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field202[var15];
					if (var16 != null) {
						int var17 = (field304[var15] >> 8) * 64 - field122;
						int var18 = (field304[var15] & 0xFF) * 64 - field123;
						var5.method469(var18, field421, var16, var17, field322);
					}
				}
			}

			if (field83) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field406[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field304.length; var28++) {
									if (field304[var28] == var27 && field360[var28] != null) {
										var5.method465(field360[var28], var20 * 8, var19, (var26 & 0x7) * 8, (var25 & 0x7) * 8, var23, field421, var21 * 8, var24);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field406[0][var29][var30];
						if (var31 == -1) {
							var5.method457(8, var29 * 8, var30 * 8, 8);
						}
					}
				}

				field265.method281(253);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field406[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field304.length; var41++) {
									if (field304[var41] == var40 && field202[var41] != null) {
										var5.method463(var34 * 8, (var38 & 0x7) * 8, var37, field421, field322, var33 * 8, var32, var36, (var39 & 0x7) * 8, field202[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field265.method281(253);
			var5.method461(field322, field421);
			field160.method13();
			field265.method281(253);
			int var42 = SNGUFYDX.field1211;
			if (var42 > field315) {
				var42 = field315;
			}

			if (var42 < field315 - 1) {
				int var43 = field315 - 1;
			}

			if (field344) {
				field322.method510(SNGUFYDX.field1211);
			} else {
				field322.method510(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method133(var44, var45);
				}
			}

			field399++;
			if (field399 > 115) {
				field399 = 0;
				field265.method281(189);
				field265.method283(44029);
			}

			method160();
		} catch (Exception var58) {
		}

		PFIKHQJO.field960.method452();

		if (field509 != null) {
			field265.method281(211);
			field265.method286(1057001181);
		}

		if (field344 && signlink.cache_dat != null) {
			int var47 = field185.method216(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field185.method220(var48);
				if ((var49 & 0x79) == 0) {
					NJPATAFL.method333(var48);
				}
			}
		}

		System.gc();
		QVVCPQSC.method437(20);
		field185.method231();
		int var50 = (field153 - 6) / 8 - 1;
		int var51 = (field153 + 6) / 8 + 1;
		int var52 = (field154 - 6) / 8 - 1;
		int var53 = (field154 + 6) / 8 + 1;
		if (field310) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field185.method236(0, var54, var55);
					if (var56 != -1) {
						field185.method222(var56, 3);
					}

					int var57 = field185.method236(1, var54, var55);
					if (var57 != -1) {
						field185.method222(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILMUKVLYLC;)V")
	public final void method159(int arg0, MUKVLYLC arg1) {
		if (arg0 == 254) {
			int var3 = arg1.method310();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field331[var4];
			int var7 = arg1.method294();
			int var8 = arg1.method312();
			int var9 = (var8 >> 4 & 0x7) + field84;
			int var10 = (var8 & 0x7) + field85;
			if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
				int var11 = field325[field315][var9][var10];
				int var12 = field325[field315][var9 + 1][var10];
				int var13 = field325[field315][var9 + 1][var10 + 1];
				int var14 = field325[field315][var9][var10 + 1];
				if (var6 == 0) {
					KFWQXFET var15 = field322.method531(field315, var10, var9);
					if (var15 != null) {
						int var16 = var15.field768 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var15.field766 = new HZQUFYDK(var7, var14, var12, 2, var13, var5 + 4, false, var11, var16);
							var15.field767 = new HZQUFYDK(var7, var14, var12, 2, var13, var5 + 1 & 0x3, false, var11, var16);
						} else {
							var15.field766 = new HZQUFYDK(var7, var14, var12, var4, var13, var5, false, var11, var16);
						}
					}
				}

				if (var6 == 1) {
					WDSRMRFF var17 = field322.method532(var10, field315, var9);
					if (var17 != null) {
						var17.field1426 = new HZQUFYDK(var7, var14, var12, 4, var13, 0, false, var11, var17.field1427 >> 14 & 0x7FFF);
					}
				}

				if (var6 == 2) {
					OQDQPWNZ var18 = field322.method533(var9, field315, var10);

					if (var4 == 11) {
						var4 = 10;
					}

					if (var18 != null) {
						var18.field938 = new HZQUFYDK(var7, var14, var12, var4, var13, var5, false, var11, var18.field946 >> 14 & 0x7FFF);
					}
				}

				if (var6 == 3) {
					OSYQEOQE var19 = field322.method534(var9, field315, var10);
					if (var19 != null) {
						var19.field953 = new HZQUFYDK(var7, var14, var12, 22, var13, var5, false, var11, var19.field954 >> 14 & 0x7FFF);
					}
				}
			}
		} else if (arg0 == 0) {
			int var20 = arg1.method292();
			int var21 = (var20 >> 4 & 0x7) + field84;
			int var22 = (var20 & 0x7) + field85;
			int var23 = arg1.method294();
			int var24 = arg1.method292();
			int var25 = arg1.method294();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				var21 = var21 * 128 + 64;
				var22 = var22 * 128 + 64;
				QRKWRHKJ var26 = new QRKWRHKJ(method114(field315, var22, var21) - var24, field203, var23, var25, var21, field315, var22);
				field126.method479(var26);
			}
		} else {
			if (arg0 == 28) {
				int var27 = arg1.method292();
				int var28 = (var27 >> 4 & 0x7) + field84;
				int var29 = (var27 & 0x7) + field85;
				int var30 = arg1.method294();
				int var31 = arg1.method292();
				int var32 = var31 >> 4 & 0xF;
				int var33 = var31 & 0x7;
				if (field73.field746[0] >= var28 - var32 && field73.field746[0] <= var28 + var32 && field73.field747[0] >= var29 - var32 && field73.field747[0] <= var29 + var32 && field313 && !field344 && field408 < 50) {
					field319[field408] = var30;
					field289[field408] = var33;
					field288[field408] = JDPRJRPB.field753[var30];
					field408++;
				}
			}

			if (arg0 == 54) {
				int var34 = arg1.method311();
				int var35 = (var34 >> 4 & 0x7) + field84;
				int var36 = (var34 & 0x7) + field85;
				int var37 = arg1.method312();
				int var38 = var37 >> 2;
				int var39 = var37 & 0x3;
				int var40 = field331[var38];
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					method102(-1, var39, 0, var40, field315, var36, var38, -1, var35);
				}
			} else if (arg0 == 85) {
				int var41 = arg1.method292();
				int var42 = (var41 >> 4 & 0x7) + field84;
				int var43 = (var41 & 0x7) + field85;
				int var44 = arg1.method294();
				int var45 = arg1.method294();
				int var46 = arg1.method294();
				if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
					SWVPDERM var47 = field462[field315][var42][var43];
					if (var47 != null) {
						for (JKZHUQUE var48 = (JKZHUQUE) var47.method482(); var48 != null; var48 = (JKZHUQUE) var47.method484()) {
							if ((var44 & 0x7FFF) == var48.field759 && var48.field760 == var45) {
								var48.field760 = var46;
								break;
							}
						}

						method133(var42, var43);
					}
				}
			} else if (arg0 == 107) {
				int var49 = arg1.method292();
				int var50 = (var49 >> 4 & 0x7) + field84;
				int var51 = (var49 & 0x7) + field85;
				int var52 = var50 + arg1.method293();
				int var53 = var51 + arg1.method293();
				int var54 = arg1.method295();
				int var55 = arg1.method294();
				int var56 = arg1.method292() * 4;
				int var57 = arg1.method292() * 4;
				int var58 = arg1.method294();
				int var59 = arg1.method294();
				int var60 = arg1.method292();
				int var61 = arg1.method292();
				if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var55 != 0xFFFF) {
					var50 = var50 * 128 + 64;
					var51 = var51 * 128 + 64;
					var52 = var52 * 128 + 64;
					var53 = var53 * 128 + 64;
					FIEFABCJ var62 = new FIEFABCJ(field203 + var58, var54, field315, field203 + var59, var55, var50, var57, var61, method114(field315, var51, var50) - var56, var60, var51);
					var62.method207(method114(field315, var53, var52) - var57, var53, var52, field203 + var58);
					field194.method479(var62);
				}
			} else if (arg0 == 245) {
				int var63 = arg1.method310();
				int var64 = (var63 >> 4 & 0x7) + field84;
				int var65 = (var63 & 0x7) + field85;
				int var66 = arg1.method311();
				int var67 = var66 >> 2;
				int var68 = var66 & 0x3;
				int var69 = field331[var67];
				int var70 = arg1.method320();
				if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
					method102(-1, var68, 0, var69, field315, var65, var67, var70, var64);
				}
			} else if (arg0 == 219) {
				int var71 = arg1.method319();
				int var72 = arg1.method311();
				int var73 = (var72 >> 4 & 0x7) + field84;
				int var74 = (var72 & 0x7) + field85;
				int var75 = arg1.method318();
				if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
					JKZHUQUE var76 = new JKZHUQUE();
					var76.field759 = var75;
					var76.field760 = var71;

					if (field462[field315][var73][var74] == null) {
						field462[field315][var73][var74] = new SWVPDERM();
					}

					field462[field315][var73][var74].method479(var76);
					method133(var73, var74);
				}
			} else if (arg0 == 87) {
				int var77 = arg1.method318();
				int var78 = arg1.method320();
				int var79 = arg1.method311();
				int var80 = (var79 >> 4 & 0x7) + field84;
				int var81 = (var79 & 0x7) + field85;
				int var82 = arg1.method320();
				if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && field262 != var77) {
					JKZHUQUE var83 = new JKZHUQUE();
					var83.field759 = var78;
					var83.field760 = var82;

					if (field462[field315][var80][var81] == null) {
						field462[field315][var80][var81] = new SWVPDERM();
					}

					field462[field315][var80][var81].method479(var83);
					method133(var80, var81);
				}
			} else if (arg0 == 186) {
				int var84 = arg1.method312();
				int var85 = (var84 >> 4 & 0x7) + field84;
				int var86 = (var84 & 0x7) + field85;
				byte var87 = arg1.method314();
				byte var88 = arg1.method313();
				byte var89 = arg1.method313();
				int var90 = arg1.method320();
				int var91 = arg1.method318();
				int var92 = arg1.method292();
				int var93 = var92 >> 2;
				int var94 = var92 & 0x3;
				int var95 = field331[var93];
				int var96 = arg1.method294();
				byte var97 = arg1.method313();
				int var98 = arg1.method294();
				HPYXKOFA var99;
				if (field262 == var90) {
					var99 = field73;
				} else {
					var99 = field364[var90];
				}

				if (var99 != null) {
					PFIKHQJO var100 = PFIKHQJO.method405(var91);
					int var101 = field325[field315][var85][var86];
					int var102 = field325[field315][var85 + 1][var86];
					int var103 = field325[field315][var85 + 1][var86 + 1];
					int var104 = field325[field315][var85][var86 + 1];
					NJPATAFL var105 = var100.method406(var93, var94, var101, var102, var103, var104, -1);
					if (var105 != null) {
						method102(var98 + 1, 0, var96 + 1, var95, field315, var86, 0, -1, var85);
						var99.field677 = field203 + var96;
						var99.field678 = field203 + var98;
						var99.field665 = var105;
						int var106 = var100.field966;
						int var107 = var100.field995;
						if (var94 == 1 || var94 == 3) {
							var106 = var100.field995;
							var107 = var100.field966;
						}

						var99.field662 = var85 * 128 + var106 * 64;
						var99.field664 = var86 * 128 + var107 * 64;
						var99.field663 = method114(field315, var99.field664, var99.field662);

						if (var97 > var89) {
							byte var108 = var97;
							var97 = var89;
							var89 = var108;
						}

						if (var87 > var88) {
							byte var109 = var87;
							var87 = var88;
							var88 = var109;
						}

						var99.field670 = var85 + var97;
						var99.field672 = var85 + var89;
						var99.field671 = var86 + var87;
						var99.field673 = var86 + var88;
					}
				}
			} else if (arg0 == 150) {
				int var110 = arg1.method310();
				int var111 = (var110 >> 4 & 0x7) + field84;
				int var112 = (var110 & 0x7) + field85;
				int var113 = arg1.method319();
				if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
					SWVPDERM var114 = field462[field315][var111][var112];
					if (var114 != null) {
						for (JKZHUQUE var115 = (JKZHUQUE) var114.method482(); var115 != null; var115 = (JKZHUQUE) var114.method484()) {
							if ((var113 & 0x7FFF) == var115.field759) {
								var115.method397();
								break;
							}
						}

						if (var114.method482() == null) {
							field462[field315][var111][var112] = null;
						}

						method133(var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method160() {
		for (MWTZCFMC var1 = (MWTZCFMC) field294.method482(); var1 != null; var1 = (MWTZCFMC) field294.method484()) {
			if (var1.field824 == -1) {
				var1.field832 = 0;
				method150(var1);
			} else {
				var1.method397();
			}
		}
	}

	@ObfuscatedName("client.a(LUKJEXUVU;B)V")
	public final void method161(UKJEXUVU arg0) {
		int var2 = arg0.field1294;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field261 == 0) {
				arg0.field1304 = "Loading friend list";
				arg0.field1313 = 0;
			} else if (var2 == 1 && field261 == 1) {
				arg0.field1304 = "Connecting to friendserver";
				arg0.field1313 = 0;
			} else if (var2 == 2 && field261 != 2) {
				arg0.field1304 = "Please wait...";
				arg0.field1313 = 0;
			} else {
				int var3 = field260;
				if (field261 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1304 = "";
					arg0.field1313 = 0;
				} else {
					arg0.field1304 = field113[var2];
					arg0.field1313 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field260;
			if (field261 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1304 = "";
				arg0.field1313 = 0;
			} else {
				if (field148[var2] == 0) {
					arg0.field1304 = "@red@Offline";
				} else if (field148[var2] == field341) {
					arg0.field1304 = "@gre@World-" + (field148[var2] - 9);
				} else {
					arg0.field1304 = "@yel@World-" + (field148[var2] - 9);
				}

				arg0.field1313 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field260;
			if (field261 != 2) {
				var5 = 0;
			}

			arg0.field1289 = var5 * 15 + 20;
			if (arg0.field1289 <= arg0.field1336) {
				arg0.field1289 = arg0.field1336 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field261 == 0) {
				arg0.field1304 = "Loading ignore list";
				arg0.field1313 = 0;
			} else if (var2 == 1 && field261 == 0) {
				arg0.field1304 = "Please wait...";
				arg0.field1313 = 0;
			} else {
				int var6 = field488;
				if (field261 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1304 = "";
					arg0.field1313 = 0;
				} else {
					arg0.field1304 = POOZNYPH.method417(POOZNYPH.method414(field118[var2]));
					arg0.field1313 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1289 = field488 * 15 + 20;
			if (arg0.field1289 <= arg0.field1336) {
				arg0.field1289 = arg0.field1336 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1298 = 150;
			arg0.field1299 = (int) (Math.sin(field203 / 40.0D) * 256.0D) & 0x7FF;

			if (field220) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field80[var7];
					if (var8 >= 0 && !CWWAFTAL.field491[var8].method175()) {
						return;
					}
				}

				field220 = false;
				NJPATAFL[] var9 = new NJPATAFL[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field80[var11];
					if (var12 >= 0) {
						var9[var10++] = CWWAFTAL.field491[var12].method176();
					}
				}

				NJPATAFL var13 = new NJPATAFL(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field484[var14] != 0) {
						var13.method348(field254[var14][0], field254[var14][field484[var14]]);

						if (var14 == 1) {
							var13.method348(field183[0], field183[field484[var14]]);
						}
					}
				}

				var13.method341();
				var13.method342(TLXFHCOO.field1242[field73.field726].field1244[0]);
				var13.method351(64, 850, -30, -50, -30, true);
				arg0.field1346 = 5;
				arg0.field1347 = 0;
				UKJEXUVU.method503(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field181 == null) {
				field181 = arg0.field1315;
				field182 = arg0.field1335;
			}

			if (field414) {
				arg0.field1315 = field182;
			} else {
				arg0.field1315 = field181;
			}
		} else if (var2 == 325) {
			if (field181 == null) {
				field181 = arg0.field1315;
				field182 = arg0.field1335;
			}

			if (field414) {
				arg0.field1315 = field181;
			} else {
				arg0.field1315 = field182;
			}
		} else if (var2 == 600) {
			arg0.field1304 = field451;
			if (field203 % 20 < 10) {
				arg0.field1304 = arg0.field1304 + "|";
			} else {
				arg0.field1304 = arg0.field1304 + " ";
			}
		} else if (var2 == 613) {
			if (field70 < 1) {
				arg0.field1304 = "";
			} else if (field250) {
				arg0.field1343 = 0xFF0000;
				arg0.field1304 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1343 = 0xFFFFFF;
				arg0.field1304 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field454 == 0) {
				arg0.field1304 = "";
			} else {
				String var15;
				if (field100 == 0) {
					var15 = "earlier today";
				} else if (field100 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field100 + " days ago";
				}

				arg0.field1304 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field330 == 0) {
				arg0.field1304 = "0 unread messages";
				arg0.field1343 = 0xFFFF00;
			}

			if (field330 == 1) {
				arg0.field1304 = "1 unread message";
				arg0.field1343 = 0xFF00;
			}

			if (field330 > 1) {
				arg0.field1304 = field330 + " unread messages";
				arg0.field1343 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field232 == 201) {
				if (field69 == 1) {
					arg0.field1304 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1304 = "";
				}
			} else if (field232 == 200) {
				arg0.field1304 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field232 == 0) {
					var16 = "Earlier today";
				} else if (field232 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field232 + " days ago";
				}

				arg0.field1304 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field232 == 201) {
				if (field69 == 1) {
					arg0.field1304 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1304 = "";
				}
			} else if (field232 == 200) {
				arg0.field1304 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1304 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field232 == 201) {
				if (field69 == 1) {
					arg0.field1304 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1304 = "";
				}
			} else if (field232 == 200) {
				arg0.field1304 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1304 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method162(int arg0) {
		if (arg0 >= 0) {
			if (field139 != 0) {
				field139 = 0;
				field222 = true;
			}

			int var2 = field442[arg0];
			int var3 = field443[arg0];
			int var4 = field444[arg0];
			int var5 = field445[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 36) {
				method119(var3, var2, var5);
				field265.method281(96);
				field265.method317(field123 + var3);
				field265.method283(var5 >> 14 & 0x7FFF);
				field265.method283(field122 + var2);
			}

			if (var4 == 1072) {
				PZNZFKPU var6 = PZNZFKPU.method428(var5);
				UKJEXUVU var7 = UKJEXUVU.field1300[var3];
				String var8;
				if (var7 != null && var7.field1339[var2] >= 100000) {
					var8 = var7.field1339[var2] + " x " + var6.field1043;
				} else if (var6.field1034 == null) {
					var8 = "It's a " + var6.field1043 + ".";
				} else {
					var8 = new String(var6.field1034);
				}

				method139(var8, 0, "");
			}

			if (var4 == 1830) {
				int var9 = var5 >> 14 & 0x7FFF;
				PFIKHQJO var10 = PFIKHQJO.method405(var9);
				String var11;
				if (var10.field961 == null) {
					var11 = "It's a " + var10.field986 + ".";
				} else {
					var11 = new String(var10.field961);
				}

				method139(var11, 0, "");
			}

			if (var4 == 32) {
				boolean var12 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
				if (!var12) {
					method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
				}

				field93 = field521;
				field94 = field522;
				field96 = 2;
				field95 = 0;
				field265.method281(236);
				field265.method316(field123 + var3);
				field265.method316(var5);
				field265.method283(field122 + var2);
			}

			if (var4 == 192) {
				field265.method281(142);
				field265.method317(var2);
				field265.method315(var3);
				field265.method317(field391);
				field265.method283(field393);
				field265.method317(field392);
				field265.method283(var5);
				field424 = 0;
				field425 = var3;
				field426 = var2;
				field427 = 2;
				if (UKJEXUVU.field1300[var3].field1321 == field91) {
					field427 = 1;
				}

				if (UKJEXUVU.field1300[var3].field1321 == field98) {
					field427 = 3;
				}
			}

			if (var4 == 634) {
				field410++;
				if (field410 >= 139) {
					field265.method281(143);
					field265.method282(249);
					field410 = 0;
				}

				field265.method281(130);
				field265.method315(var2);
				field265.method315(var5);
				field265.method315(var3);
				field424 = 0;
				field425 = var3;
				field426 = var2;
				field427 = 2;
				if (UKJEXUVU.field1300[var3].field1321 == field91) {
					field427 = 1;
				}

				if (UKJEXUVU.field1300[var3].field1321 == field98) {
					field427 = 3;
				}
			}

			if (var4 == 512) {
				method119(var3, var2, var5);
				field265.method281(27);
				field265.method315(field122 + var2);
				field265.method283(field123 + var3);
				field265.method317(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 52) {
				HPYXKOFA var14 = field364[var5];
				if (var14 != null) {
					method66(2, 1, 0, 1, var14.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var14.field746[0]);
					field93 = field521;
					field94 = field522;
					field96 = 2;
					field95 = 0;
					field265.method281(5);
					field265.method315(var5);
				}
			}

			if (var4 == 495) {
				PNBDNSXO var15 = field133[var5];
				if (var15 != null) {
					method66(2, 1, 0, 1, var15.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var15.field746[0]);
					field93 = field521;
					field94 = field522;
					field96 = 2;
					field95 = 0;
					field265.method281(38);
					field265.method316(var5);
				}
			}

			if (var4 == 301) {
				UKJEXUVU var16 = UKJEXUVU.field1300[var3];
				field149 = 1;
				field150 = var3;
				field151 = var16.field1326;
				field390 = 0;
				field112 = true;
				String var17 = var16.field1312;
				if (var17.indexOf(" ") != -1) {
					var17 = var17.substring(0, var17.indexOf(" "));
				}

				String var18 = var16.field1312;
				if (var18.indexOf(" ") != -1) {
					var18 = var18.substring(var18.indexOf(" ") + 1);
				}

				field152 = var17 + " " + var16.field1286 + " " + var18;

				if (field151 == 16) {
					field112 = true;
					field476 = 3;
					field120 = true;
				}
			} else {
				if (var4 == 936) {
					String var19 = field212[arg0];
					int var20 = var19.indexOf("@whi@");
					if (var20 != -1) {
						long var21 = POOZNYPH.method413(var19.substring(var20 + 5).trim());
						int var23 = -1;
						for (int var24 = 0; var24 < field260; var24++) {
							if (field487[var24] == var21) {
								var23 = var24;
								break;
							}
						}

						if (var23 != -1 && field148[var23] > 0) {
							field222 = true;
							field139 = 0;
							field320 = true;
							field251 = "";
							field176 = 3;
							field357 = field487[var23];
							field284 = "Enter message to send to " + field113[var23];
						}
					}
				}

				if (var4 == 212) {
					field265.method281(57);
					field265.method283(var3);
					UKJEXUVU var25 = UKJEXUVU.field1300[var3];
					if (var25.field1318 != null && var25.field1318[0][0] == 5) {
						int var26 = var25.field1318[0][1];
						field230[var26] = 1 - field230[var26];
						method53(var26);
						field112 = true;
					}
				}

				if (var4 == 830) {
					boolean var27 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					if (!var27) {
						method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					}

					field93 = field521;
					field94 = field522;
					field96 = 2;
					field95 = 0;
					field265.method281(182);
					field265.method316(field123 + var3);
					field265.method317(field122 + var2);
					field265.method316(var5);
				}

				if (var4 == 107) {
					field265.method281(208);
					field265.method315(var5);
					field265.method316(var2);
					field265.method316(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 420) {
					boolean var29 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					if (!var29) {
						method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					}

					field93 = field521;
					field94 = field522;
					field96 = 2;
					field95 = 0;
					field265.method281(160);
					field265.method317(field122 + var2);
					field265.method316(var5);
					field265.method316(field123 + var3);
				}

				if (var4 == 415) {
					UKJEXUVU var31 = UKJEXUVU.field1300[var3];
					boolean var32 = true;
					if (var31.field1294 > 0) {
						var32 = method118(var31);
					}

					if (var32) {
						field265.method281(57);
						field265.method283(var3);
					}
				}

				if (var4 == 387) {
					if (field464) {
						field322.method547(var3 - 4, var2 - 4);
					} else {
						field322.method547(field522 - 4, field521 - 4);
					}
				}

				if (var4 == 374 || var4 == 35) {
					String var33 = field212[arg0];
					int var34 = var33.indexOf("@whi@");
					if (var34 != -1) {
						var33 = var33.substring(var34 + 5).trim();
						String var35 = POOZNYPH.method417(POOZNYPH.method414(POOZNYPH.method413(var33)));
						boolean var36 = false;
						for (int var37 = 0; var37 < field365; var37++) {
							HPYXKOFA var38 = field364[field366[var37]];
							if (var38 != null && var38.field669 != null && var38.field669.equalsIgnoreCase(var35)) {
								method66(2, 1, 0, 1, var38.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var38.field746[0]);

								if (var4 == 374) {
									field265.method281(5);
									field265.method315(field366[var37]);
								}

								if (var4 == 35) {
									field265.method281(107);
									field265.method317(field366[var37]);
								}

								var36 = true;
								break;
							}
						}

						if (!var36) {
							method139("Unable to find " + var35, 0, "");
						}
					}
				}

				if (var4 == 591) {
					HPYXKOFA var39 = field364[var5];
					if (var39 != null) {
						method66(2, 1, 0, 1, var39.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var39.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field223 += var5;
						if (field223 >= 58) {
							field265.method281(17);
							field265.method282(38);
							field223 = 0;
						}

						field265.method281(204);
						field265.method315(var5);
					}
				}

				if (var4 == 321) {
					boolean var40 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					if (!var40) {
						method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
					}

					field93 = field521;
					field94 = field522;
					field96 = 2;
					field95 = 0;
					field450 += var2;
					if (field450 >= 53) {
						field265.method281(132);
						field450 = 0;
					}

					field265.method281(203);
					field265.method317(field123 + var3);
					field265.method317(var5);
					field265.method317(field122 + var2);
				}

				if (var4 == 944 && method119(var3, var2, var5)) {
					field265.method281(54);
					field265.method315(field122 + var2);
					field265.method316(field150);
					field265.method283(var5 >> 14 & 0x7FFF);
					field265.method283(field123 + var3);
				}

				if (var4 == 786) {
					method119(var3, var2, var5);
					field265.method281(133);
					field265.method316(field122 + var2);
					field265.method283(field123 + var3);
					field265.method315(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 602) {
					method119(var3, var2, var5);
					field265.method281(4);
					field265.method283(field122 + var2);
					field265.method316(var5 >> 14 & 0x7FFF);
					field265.method316(field123 + var3);
				}

				if (var4 == 648) {
					PNBDNSXO var42 = field133[var5];
					if (var42 != null) {
						method66(2, 1, 0, 1, var42.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var42.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;

						if ((var5 & 0x3) == 0) {
							field432++;
						}

						if (field432 >= 76) {
							field265.method281(169);
							field432 = 0;
						}

						field265.method281(139);
						field265.method317(var5);
					}
				}

				if (var4 == 754) {
					field265.method281(238);
					field265.method317(var5);
					field265.method316(var2);
					field265.method315(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 926) {
					HPYXKOFA var43 = field364[var5];
					if (var43 != null) {
						method66(2, 1, 0, 1, var43.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var43.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(243);
						field265.method283(field150);
						field265.method315(var5);
					}
				}

				if (var4 == 384) {
					PNBDNSXO var44 = field133[var5];
					if (var44 != null) {
						method66(2, 1, 0, 1, var44.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var44.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(75);
						field265.method283(field150);
						field265.method283(var5);
					}
				}

				if (var4 == 799 && !field121) {
					field265.method281(28);
					field265.method283(var3);
					field121 = true;
				}

				if (var4 == 1118) {
					PZNZFKPU var45 = PZNZFKPU.method428(var5);
					String var46;
					if (var45.field1034 == null) {
						var46 = "It's a " + var45.field1043 + ".";
					} else {
						var46 = new String(var45.field1034);
					}

					method139(var46, 0, "");
				}

				if (var4 == 615) {
					field265.method281(85);
					field265.method315(var5);
					field265.method315(var3);
					field265.method317(var2);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 521 || var4 == 176 || var4 == 129 || var4 == 813) {
					String var47 = field212[arg0];
					int var48 = var47.indexOf("@whi@");
					if (var48 != -1) {
						long var49 = POOZNYPH.method413(var47.substring(var48 + 5).trim());
						if (var4 == 521) {
							method155(var49);
						}

						if (var4 == 176) {
							method40(var49);
						}

						if (var4 == 129) {
							method56(var49);
						}

						if (var4 == 813) {
							method51(var49);
						}
					}
				}

				if (var4 == 967) {
					HPYXKOFA var51 = field364[var5];
					if (var51 != null) {
						method66(2, 1, 0, 1, var51.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var51.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(82);
						field265.method283(var5);
					}
				}

				if (var4 == 892) {
					field265.method281(74);
					field265.method315(var5);
					field265.method283(var2);
					field265.method317(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 549) {
					HPYXKOFA var52 = field364[var5];
					if (var52 != null) {
						method66(2, 1, 0, 1, var52.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var52.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(51);
						field265.method283(var5);
					}
				}

				if (var4 == 529) {
					String var53 = field212[arg0];
					int var54 = var53.indexOf("@whi@");
					if (var54 != -1) {
						if (field91 == -1) {
							method142();
							field451 = var53.substring(var54 + 5).trim();
							field250 = false;

							for (int var55 = 0; var55 < UKJEXUVU.field1300.length; var55++) {
								if (UKJEXUVU.field1300[var55] != null && UKJEXUVU.field1300[var55].field1294 == 600) {
									field75 = field91 = UKJEXUVU.field1300[var55].field1321;
									break;
								}
							}
						} else {
							method139("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 641) {
					PNBDNSXO var56 = field133[var5];
					if (var56 != null) {
						method66(2, 1, 0, 1, var56.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var56.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(197);
						field265.method283(var5);
					}
				}

				if (var4 == 837) {
					PNBDNSXO var57 = field133[var5];
					if (var57 != null) {
						method66(2, 1, 0, 1, var57.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var57.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(206);
						field265.method283(var5);
					}
				}

				if (var4 == 900) {
					PNBDNSXO var58 = field133[var5];
					if (var58 != null) {
						method66(2, 1, 0, 1, var58.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var58.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(181);
						field265.method316(field392);
						field265.method316(var5);
						field265.method283(field393);
						field265.method316(field391);
					}
				}

				if (var4 == 262) {
					field265.method281(72);
					field265.method315(var2);
					field265.method317(var5);
					field265.method283(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 312) {
					PNBDNSXO var59 = field133[var5];
					if (var59 != null) {
						method66(2, 1, 0, 1, var59.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var59.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field193 += var5;
						if (field193 >= 95) {
							field265.method281(50);
							field193 = 0;
						}

						field265.method281(183);
						field265.method316(var5);
					}
				}

				if (var4 == 650) {
					field265.method281(157);
					field265.method315(var2);
					field265.method315(var5);
					field265.method315(var3);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 445) {
					field265.method281(145);
					field265.method316(var3);
					field265.method315(field150);
					field265.method315(var5);
					field265.method283(var2);
					field424 = 0;
					field425 = var3;
					field426 = var2;
					field427 = 2;
					if (UKJEXUVU.field1300[var3].field1321 == field91) {
						field427 = 1;
					}

					if (UKJEXUVU.field1300[var3].field1321 == field98) {
						field427 = 3;
					}
				}

				if (var4 == 636) {
					HPYXKOFA var60 = field364[var5];
					if (var60 != null) {
						method66(2, 1, 0, 1, var60.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var60.field746[0]);
						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(198);
						field265.method283(field393);
						field265.method316(var5);
						field265.method317(field392);
						field265.method316(field391);
					}
				}

				if (var4 == 913) {
					method142();
				}

				if (var4 == 236) {
					field390 = 1;
					field391 = var2;
					field392 = var3;
					field393 = var5;
					field394 = PZNZFKPU.method428(var5).field1043;
					field149 = 0;
					field112 = true;
				} else {
					if (var4 == 359) {
						HPYXKOFA var61 = field364[var5];
						if (var61 != null) {
							method66(2, 1, 0, 1, var61.field747[0], 0, false, 0, field73.field746[0], field73.field747[0], var61.field746[0]);
							field93 = field521;
							field94 = field522;
							field96 = 2;
							field95 = 0;
							field265.method281(107);
							field265.method317(var5);
						}
					}

					if (var4 == 938) {
						field265.method281(57);
						field265.method283(var3);
						UKJEXUVU var62 = UKJEXUVU.field1300[var3];
						if (var62.field1318 != null && var62.field1318[0][0] == 5) {
							int var63 = var62.field1318[0][1];
							if (field230[var63] != var62.field1337[0]) {
								field230[var63] = var62.field1337[0];
								method53(var63);
								field112 = true;
							}
						}
					}

					if (var4 == 84) {
						boolean var64 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						if (!var64) {
							method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						}

						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(121);
						field265.method316(field123 + var3);
						field265.method283(var5);
						field265.method317(field122 + var2);
						field265.method283(field150);
					}

					if (var4 == 983) {
						if ((var3 & 0x3) == 0) {
							field67++;
						}

						if (field67 >= 130) {
							field265.method281(12);
							field67 = 0;
						}

						field265.method281(168);
						field265.method317(var2);
						field265.method315(var5);
						field265.method283(var3);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (UKJEXUVU.field1300[var3].field1321 == field91) {
							field427 = 1;
						}

						if (UKJEXUVU.field1300[var3].field1321 == field98) {
							field427 = 3;
						}
					}

					if (var4 == 345) {
						boolean var66 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						if (!var66) {
							method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						}

						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(254);
						field265.method283(field122 + var2);
						field265.method317(var5);
						field265.method315(field392);
						field265.method316(field391);
						field265.method283(field393);
						field265.method317(field123 + var3);
					}

					if (var4 == 63 && method119(var3, var2, var5)) {
						field265.method281(179);
						field265.method317(field391);
						field265.method283(field393);
						field265.method316(var5 >> 14 & 0x7FFF);
						field265.method283(field392);
						field265.method316(field123 + var3);
						field265.method317(field122 + var2);
					}

					if (var4 == 898) {
						field65++;
						if (field65 >= 79) {
							field265.method281(247);
							field265.method283(31844);
							field65 = 0;
						}

						field265.method281(60);
						field265.method315(var2);
						field265.method316(var5);
						field265.method283(var3);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (UKJEXUVU.field1300[var3].field1321 == field91) {
							field427 = 1;
						}

						if (UKJEXUVU.field1300[var3].field1321 == field98) {
							field427 = 3;
						}
					}

					if (var4 == 431) {
						if ((var2 & 0x3) == 0) {
							field119++;
						}

						if (field119 >= 82) {
							field265.method281(126);
							field265.method285(0x4FAEAB);
							field119 = 0;
						}

						field265.method281(219);
						field265.method315(var2);
						field265.method315(var5);
						field265.method315(var3);
						field424 = 0;
						field425 = var3;
						field426 = var2;
						field427 = 2;
						if (UKJEXUVU.field1300[var3].field1321 == field91) {
							field427 = 1;
						}

						if (UKJEXUVU.field1300[var3].field1321 == field98) {
							field427 = 3;
						}
					}

					if (var4 == 134) {
						boolean var68 = method66(2, 0, 0, 0, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						if (!var68) {
							method66(2, 1, 0, 1, var3, 0, false, 0, field73.field746[0], field73.field747[0], var2);
						}

						field93 = field521;
						field94 = field522;
						field96 = 2;
						field95 = 0;
						field265.method281(94);
						field265.method316(field122 + var2);
						field265.method283(var5);
						field265.method316(field123 + var3);
					}

					if (var4 == 1019) {
						method119(var3, var2, var5);
						field265.method281(109);
						field265.method283(field122 + var2);
						field265.method283(field123 + var3);
						field265.method283(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 1235) {
						PNBDNSXO var70 = field133[var5];
						if (var70 != null) {
							BYABUZFP var71 = var70.field1003;
							if (var71.field35 != null) {
								var71 = var71.method26();
							}

							if (var71 != null) {
								String var72;
								if (var71.field37 == null) {
									var72 = "It's a " + var71.field53 + ".";
								} else {
									var72 = new String(var71.field37);
								}

								method139(var72, 0, "");
							}
						}
					}

					field390 = 0;
					field149 = 0;
					field112 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILEYTQJNEM;II)V")
	public final void method163(int arg0, EYTQJNEM arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field327 + field323 & 0x7FF;
			int var6 = NJPATAFL.field905[var5];
			int var7 = NJPATAFL.field906[var5];
			var6 = var6 * 256 / (field110 + 256);
			var7 = var7 * 256 / (field110 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field349.method198(var12 + 94 + 4 - 10, 256, 15, var10, 15, 83 - var13 - 20, 20, 20);
		} else {
			method170(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method164() {
		if (field390 == 0 && field149 == 0) {
			field212[field296] = "Walk here";
			field444[field296] = 387;
			field442[field296] = field514;
			field443[field296] = field515;
			field296++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < NJPATAFL.field903; var2++) {
			int var3 = NJPATAFL.field904[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field322.method539(field315, var4, var5, var3) >= 0) {
					PFIKHQJO var8 = PFIKHQJO.method405(var7);
					if (var8.field965 != null) {
						var8 = var8.method403();
					}

					if (var8 == null) {
						continue;
					}

					if (field390 == 1) {
						field212[field296] = "Use " + field394 + " with @cya@" + var8.field986;
						field444[field296] = 63;
						field445[field296] = var3;
						field442[field296] = var4;
						field443[field296] = var5;
						field296++;
					} else if (field149 != 1) {
						if (var8.field996 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field996[var9] != null) {
									field212[field296] = var8.field996[var9] + " @cya@" + var8.field986;

									if (var9 == 0) {
										field444[field296] = 786;
									}

									if (var9 == 1) {
										field444[field296] = 512;
									}

									if (var9 == 2) {
										field444[field296] = 602;
									}

									if (var9 == 3) {
										field444[field296] = 36;
									}

									if (var9 == 4) {
										field444[field296] = 1019;
									}

									field445[field296] = var3;
									field442[field296] = var4;
									field443[field296] = var5;
									field296++;
								}
							}
						}

						field212[field296] = "Examine @cya@" + var8.field986;
						field444[field296] = 1830;
						field445[field296] = var8.field980 << 14;
						field442[field296] = var4;
						field443[field296] = var5;
						field296++;
					} else if ((field151 & 0x4) == 4) {
						field212[field296] = field152 + " @cya@" + var8.field986;
						field444[field296] = 944;
						field445[field296] = var3;
						field442[field296] = var4;
						field443[field296] = var5;
						field296++;
					}
				}

				if (var6 == 1) {
					PNBDNSXO var10 = field133[var7];
					if (var10.field1003.field41 == 1 && (var10.field706 & 0x7F) == 0x40 && (var10.field707 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field134; var11++) {
							PNBDNSXO var12 = field133[field135[var11]];
							if (var12 != null && var10 != var12 && var12.field1003.field41 == 1 && var10.field706 == var12.field706 && var10.field707 == var12.field707) {
								method132(var4, var12.field1003, var5, field135[var11]);
							}
						}

						for (int var13 = 0; var13 < field365; var13++) {
							HPYXKOFA var14 = field364[field366[var13]];
							if (var14 != null && var10.field706 == var14.field706 && var10.field707 == var14.field707) {
								method55(var4, var14, field366[var13], var5);
							}
						}
					}

					method132(var4, var10.field1003, var5, var7);
				}

				if (var6 == 0) {
					HPYXKOFA var15 = field364[var7];
					if ((var15.field706 & 0x7F) == 0x40 && (var15.field707 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field134; var16++) {
							PNBDNSXO var17 = field133[field135[var16]];
							if (var17 != null && var17.field1003.field41 == 1 && var15.field706 == var17.field706 && var15.field707 == var17.field707) {
								method132(var4, var17.field1003, var5, field135[var16]);
							}
						}

						for (int var18 = 0; var18 < field365; var18++) {
							HPYXKOFA var19 = field364[field366[var18]];
							if (var19 != null && var15 != var19 && var15.field706 == var19.field706 && var15.field707 == var19.field707) {
								method55(var4, var19, field366[var18], var5);
							}
						}
					}

					method55(var4, var15, var7, var5);
				}

				if (var6 == 3) {
					SWVPDERM var20 = field462[field315][var4][var5];
					if (var20 != null) {
						for (JKZHUQUE var21 = (JKZHUQUE) var20.method483(); var21 != null; var21 = (JKZHUQUE) var20.method485()) {
							PZNZFKPU var22 = PZNZFKPU.method428(var21.field759);
							if (field390 == 1) {
								field212[field296] = "Use " + field394 + " with @lre@" + var22.field1043;
								field444[field296] = 345;
								field445[field296] = var21.field759;
								field442[field296] = var4;
								field443[field296] = var5;
								field296++;
							} else if (field149 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1026 != null && var22.field1026[var23] != null) {
										field212[field296] = var22.field1026[var23] + " @lre@" + var22.field1043;

										if (var23 == 0) {
											field444[field296] = 32;
										}

										if (var23 == 1) {
											field444[field296] = 134;
										}

										if (var23 == 2) {
											field444[field296] = 321;
										}

										if (var23 == 3) {
											field444[field296] = 830;
										}

										if (var23 == 4) {
											field444[field296] = 420;
										}

										field445[field296] = var21.field759;
										field442[field296] = var4;
										field443[field296] = var5;
										field296++;
									} else if (var23 == 2) {
										field212[field296] = "Take @lre@" + var22.field1043;
										field444[field296] = 321;
										field445[field296] = var21.field759;
										field442[field296] = var4;
										field443[field296] = var5;
										field296++;
									}
								}

								field212[field296] = "Examine @lre@" + var22.field1043;
								field444[field296] = 1118;
								field445[field296] = var21.field759;
								field442[field296] = var4;
								field443[field296] = var5;
								field296++;
							} else if ((field151 & 0x1) == 1) {
								field212[field296] = field152 + " @lre@" + var22.field1043;
								field444[field296] = 84;
								field445[field296] = var21.field759;
								field442[field296] = var4;
								field443[field296] = var5;
								field296++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(Z)V")
	public final void method165() {
		field161.method13();
		QVVCPQSC.field1096 = field128;
		field318.method500(0, 0);

		if (field320) {
			field479.method573(field284, 40, 239, 0);
			field479.method573(field251 + "*", 60, 239, 128);
		} else if (field139 == 1) {
			field479.method573("Enter amount:", 40, 239, 0);
			field479.method573(field108 + "*", 60, 239, 128);
		} else if (field139 == 2) {
			field479.method573("Enter name:", 40, 239, 0);
			field479.method573(field108 + "*", 60, 239, 128);
		} else if (field264 != null) {
			field479.method573(field264, 40, 239, 0);
			field479.method573("Click to continue", 60, 239, 128);
		} else if (field98 != -1) {
			method65(0, 0, 0, UKJEXUVU.field1300[field98]);
		} else if (field247 == -1) {
			YZXOZYLM var1 = field478;
			int var2 = 0;
			ACKHPAZA.method3(0, 463, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field293[var3] != null) {
					int var4 = field291[var3];
					int var5 = field279 + 70 - var2 * 14;
					String var6 = field292[var3];
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
							var1.method577(var5, field293[var3], 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field164 == 0 || field164 == 1 && method82(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field283[0].method500(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field283[1].method500(var8, var5 - 12);
								var8 += 14;
							}

							var1.method577(var5, var6 + ":", var8, 0);
							var8 += var1.method575(var6) + 8;
							var1.method577(var5, field293[var3], var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field68 == 0 && (var4 == 7 || field195 == 0 || field195 == 1 && method82(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method577(var5, "From", var9, 0);
							int var11 = var9 + var1.method575("From ");
							if (var7 == 1) {
								field283[0].method500(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field283[1].method500(var11, var5 - 12);
								var11 += 14;
							}

							var1.method577(var5, var6 + ":", var11, 0);
							var11 += var1.method575(var6) + 8;
							var1.method577(var5, field293[var3], var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field224 == 0 || field224 == 1 && method82(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method577(var5, var6 + " " + field293[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field68 == 0 && field195 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method577(var5, field293[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field68 == 0 && field195 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method577(var5, "To " + var6 + ":", 4, 0);
							var1.method577(var5, field293[var3], var1.method575("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field224 == 0 || field224 == 1 && method82(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method577(var5, var6 + " " + field293[var3], 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			ACKHPAZA.method2();
			field72 = var2 * 14 + 7;
			if (field72 < 78) {
				field72 = 78;
			}

			method121(0, 463, field72, 77, field72 - field279 - 77);
			String var10;
			if (field73 == null || field73.field669 == null) {
				var10 = POOZNYPH.method417(field402);
			} else {
				var10 = field73.field669;
			}

			var1.method577(90, var10 + ":", 4, 0);
			var1.method577(90, field184 + "*", var1.method575(var10 + ": ") + 6, 255);
			ACKHPAZA.method9(0, 0, 77, 479);
		} else {
			method65(0, 0, 0, UKJEXUVU.field1300[field247]);
		}

		if (field464 && field196 == 2) {
			method149();
		}

		field161.method14(field506, 17, 357);
		field160.method13();
		QVVCPQSC.field1096 = field130;
	}

	@ObfuscatedName("client.t(Z)V")
	public final void method166() {
		for (int var1 = -1; var1 < field365; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field363;
			} else {
				var2 = field366[var1];
			}

			HPYXKOFA var3 = field364[var2];
			if (var3 != null) {
				method70(1, var3);
			}
		}
	}

	@ObfuscatedName("client.F(I)Ljava/net/Socket;")
	public final Socket method167(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method168(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IBI)Ljava/lang/String;")
	public static final String method169(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(ILEYTQJNEM;II)V")
	public final void method170(int arg0, EYTQJNEM arg1, int arg2) {
		int var4 = field327 + field323 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = NJPATAFL.field905[var4];
			int var7 = NJPATAFL.field906[var4];
			var6 = var6 * 256 / (field110 + 256);
			var7 = var7 * 256 / (field110 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method199(field317, var8 + 94 + 4 - arg1.field557 / 2, 83 - var9 - arg1.field558 / 2 - 4);
			} else {
				arg1.method193(var8 + 94 + 4 - arg1.field557 / 2, 83 - var9 - arg1.field558 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method171() {
		try {
			if (field214 != null) {
				field214.method210();
			}
		} catch (Exception var2) {
		}

		field214 = null;
		field115 = false;
		field448 = 0;
		field402 = "";
		field403 = "";
		method54();
		field322.method509();

		for (int var1 = 0; var1 < 4; var1++) {
			field421[var1].method268();
		}

		System.gc();
		method136();
		field352 = -1;
		field412 = -1;
		field272 = 0;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.h(II)V")
	public final void method172(int arg0) {
		int[] var2 = field282.field552;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field175[arg0][var7][var5] & 0x18) == 0) {
					field322.method544(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field175[arg0 + 1][var7][var5] & 0x8) != 0) {
					field322.method544(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field282.method188();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field175[arg0][var11][var10] & 0x18) == 0) {
					method85(var8, var9, var10, arg0, var11);
				}

				if (arg0 < 3 && (field175[arg0 + 1][var11][var10] & 0x8) != 0) {
					method85(var8, var9, var10, arg0 + 1, var11);
				}
			}
		}

		field160.method13();
		field395 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field322.method538(field315, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = PFIKHQJO.method405(var14).field985;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field421[field315].field793;
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

						field101[field395] = field359[var15];
						field396[field395] = var16;
						field397[field395] = var17;
						field395++;
					}
				}
			}
		}

		field71++;
		if (field71 > 72) {
			field71 = 0;
			field265.method281(146);
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field114[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field117[var3] = var2 / 4;
		}
	}
}
