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
public final class client extends HXQNMAEJ {

	@ObfuscatedName("client.S")
	public ULLVQOAK field42 = new ULLVQOAK();

	@ObfuscatedName("client.W")
	public boolean field46 = false;

	@ObfuscatedName("client.Y")
	public int[] field47 = new int[5];

	@ObfuscatedName("client.fb")
	public int[][][] field54 = new int[4][13][13];

	@ObfuscatedName("client.gb")
	public LKEIRLLI[] field55 = new LKEIRLLI[13];

	@ObfuscatedName("client.hb")
	public int[] field56 = new int[50];

	@ObfuscatedName("client.ub")
	public int[] field68 = new int[QRJTCTJX.field1073];

	@ObfuscatedName("client.xb")
	public int field71 = 2;

	@ObfuscatedName("client.yb")
	public int field72 = -1;

	@ObfuscatedName("client.zb")
	public int field73 = 128;

	@ObfuscatedName("client.Fb")
	public boolean field78 = true;

	@ObfuscatedName("client.Gb")
	public int field79 = -1;

	@ObfuscatedName("client.Hb")
	public int field80 = -1;

	@ObfuscatedName("client.Mb")
	public byte[] field85 = new byte[16384];

	@ObfuscatedName("client.Nb")
	public boolean field86 = false;

	@ObfuscatedName("client.Ob")
	public DUMEPGRH[] field87 = new DUMEPGRH[20];

	@ObfuscatedName("client.Qb")
	public boolean field89 = false;

	@ObfuscatedName("client.Ub")
	public boolean field93 = true;

	@ObfuscatedName("client.Vb")
	public int[] field94 = new int[5];

	@ObfuscatedName("client.Wb")
	public String field95 = "";

	@ObfuscatedName("client.Xb")
	public String field96 = "";

	@ObfuscatedName("client.ac")
	public String field98 = "";

	@ObfuscatedName("client.cc")
	public volatile boolean field99 = false;

	@ObfuscatedName("client.dc")
	public int[] field100 = new int[200];

	@ObfuscatedName("client.fc")
	public int field102 = 0x766654;

	@ObfuscatedName("client.hc")
	public int field104 = -1;

	@ObfuscatedName("client.rc")
	public int[] field112 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ac")
	public int field120 = -1;

	@ObfuscatedName("client.Dc")
	public boolean field123 = false;

	@ObfuscatedName("client.Fc")
	public int[] field124 = new int[151];

	@ObfuscatedName("client.Gc")
	public int field125 = -1;

	@ObfuscatedName("client.Pc")
	public int field134 = 50;

	@ObfuscatedName("client.Qc")
	public int[] field135 = new int[field134];

	@ObfuscatedName("client.Rc")
	public int[] field136 = new int[field134];

	@ObfuscatedName("client.Sc")
	public int[] field137 = new int[field134];

	@ObfuscatedName("client.Tc")
	public int[] field138 = new int[field134];

	@ObfuscatedName("client.Uc")
	public int[] field139 = new int[field134];

	@ObfuscatedName("client.Vc")
	public int[] field140 = new int[field134];

	@ObfuscatedName("client.Wc")
	public int[] field141 = new int[field134];

	@ObfuscatedName("client.Xc")
	public String[] field142 = new String[field134];

	@ObfuscatedName("client.cd")
	public String field147 = "";

	@ObfuscatedName("client.ed")
	public int[] field148 = new int[QRJTCTJX.field1073];

	@ObfuscatedName("client.fd")
	public boolean field149 = true;

	@ObfuscatedName("client.gd")
	public int[] field150 = new int[5];

	@ObfuscatedName("client.id")
	public final int field151 = 100;

	@ObfuscatedName("client.jd")
	public int[] field152 = new int[100];

	@ObfuscatedName("client.md")
	public SJIXUDLP[] field155 = new SJIXUDLP[5];

	@ObfuscatedName("client.nd")
	public boolean field156 = false;

	@ObfuscatedName("client.qd")
	public int[] field159 = new int[QRJTCTJX.field1073];

	@ObfuscatedName("client.sd")
	public boolean field161 = false;

	@ObfuscatedName("client.td")
	public volatile boolean field162 = false;

	@ObfuscatedName("client.ud")
	public String[] field163 = new String[500];

	@ObfuscatedName("client.Bd")
	public int field169 = -1;

	@ObfuscatedName("client.Dd")
	public int field171 = 1;

	@ObfuscatedName("client.Ed")
	public int[] field172 = new int[33];

	@ObfuscatedName("client.Fd")
	public String field173 = "";

	@ObfuscatedName("client.Jd")
	public String[] field177 = new String[200];

	@ObfuscatedName("client.Ld")
	public DUMEPGRH[] field178 = new DUMEPGRH[100];

	@ObfuscatedName("client.Qd")
	public String[] field183 = new String[5];

	@ObfuscatedName("client.Rd")
	public boolean[] field184 = new boolean[5];

	@ObfuscatedName("client.Ud")
	public int[] field186 = new int[100];

	@ObfuscatedName("client.Vd")
	public String[] field187 = new String[100];

	@ObfuscatedName("client.Wd")
	public String[] field188 = new String[100];

	@ObfuscatedName("client.Xd")
	public boolean[] field189 = new boolean[5];

	@ObfuscatedName("client.fe")
	public boolean field196 = false;

	@ObfuscatedName("client.le")
	public int field201 = 78;

	@ObfuscatedName("client.qe")
	public int[][] field206 = new int[104][104];

	@ObfuscatedName("client.ve")
	public int[] field210 = new int[1000];

	@ObfuscatedName("client.we")
	public int[] field211 = new int[1000];

	@ObfuscatedName("client.Ae")
	public int[] field214 = new int[33];

	@ObfuscatedName("client.Ee")
	public LKEIRLLI[] field218 = new LKEIRLLI[2];

	@ObfuscatedName("client.Qe")
	public LOISKKJJ field227 = new LOISKKJJ();

	@ObfuscatedName("client.Re")
	public int field228 = 0x4D4233;

	@ObfuscatedName("client.Se")
	public int field229 = -1;

	@ObfuscatedName("client.Xe")
	public boolean field232 = false;

	@ObfuscatedName("client.Ze")
	public boolean field233 = false;

	@ObfuscatedName("client.af")
	public int[][] field234 = new int[104][104];

	@ObfuscatedName("client.cf")
	public LKEIRLLI[] field235 = new LKEIRLLI[100];

	@ObfuscatedName("client.jf")
	public int field239 = 1;

	@ObfuscatedName("client.lf")
	public int[] field240 = new int[50];

	@ObfuscatedName("client.mf")
	public int field241 = 0x23201B;

	@ObfuscatedName("client.wf")
	public int field251 = 2048;

	@ObfuscatedName("client.xf")
	public int field252 = 2047;

	@ObfuscatedName("client.yf")
	public AHUILQJH[] field253 = new AHUILQJH[field251];

	@ObfuscatedName("client.Af")
	public int[] field255 = new int[field251];

	@ObfuscatedName("client.Cf")
	public int[] field257 = new int[field251];

	@ObfuscatedName("client.Df")
	public LDILQFVA[] field258 = new LDILQFVA[field251];

	@ObfuscatedName("client.Gf")
	public int field261 = -1;

	@ObfuscatedName("client.Jf")
	public int[] field263 = new int[5];

	@ObfuscatedName("client.Uf")
	public String field274 = "";

	@ObfuscatedName("client.Vf")
	public int field275 = -1;

	@ObfuscatedName("client.Wf")
	public CRC32 field276 = new CRC32();

	@ObfuscatedName("client.dg")
	public boolean field283 = false;

	@ObfuscatedName("client.fg")
	public LOISKKJJ field284 = new LOISKKJJ();

	@ObfuscatedName("client.hg")
	public boolean field285 = false;

	@ObfuscatedName("client.kg")
	public int[] field287 = new int[256];

	@ObfuscatedName("client.og")
	public boolean field291 = false;

	@ObfuscatedName("client.pg")
	public LDILQFVA field292 = LDILQFVA.method390(1);

	@ObfuscatedName("client.zg")
	public long[] field300 = new long[100];

	@ObfuscatedName("client.Ag")
	public boolean field301 = false;

	@ObfuscatedName("client.Fg")
	public boolean field306 = false;

	@ObfuscatedName("client.Qg")
	public int field315 = 3;

	@ObfuscatedName("client.Rg")
	public int[] field316 = new int[500];

	@ObfuscatedName("client.Sg")
	public int[] field317 = new int[500];

	@ObfuscatedName("client.Tg")
	public int[] field318 = new int[500];

	@ObfuscatedName("client.Ug")
	public int[] field319 = new int[500];

	@ObfuscatedName("client.Yg")
	public boolean field322 = false;

	@ObfuscatedName("client.ch")
	public boolean field326 = false;

	@ObfuscatedName("client.eh")
	public int[] field328 = new int[9];

	@ObfuscatedName("client.gh")
	public DUMEPGRH[] field330 = new DUMEPGRH[8];

	@ObfuscatedName("client.hh")
	public int field331 = -1;

	@ObfuscatedName("client.ih")
	public LOISKKJJ field332 = new LOISKKJJ();

	@ObfuscatedName("client.jh")
	public boolean field333 = false;

	@ObfuscatedName("client.kh")
	public int[] field334 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.vh")
	public int[] field345 = new int[4000];

	@ObfuscatedName("client.wh")
	public int[] field346 = new int[4000];

	@ObfuscatedName("client.Bh")
	public int field351 = 0x332D25;

	@ObfuscatedName("client.Eh")
	public int field354 = 2;

	@ObfuscatedName("client.Hh")
	public boolean field357 = true;

	@ObfuscatedName("client.Jh")
	public volatile boolean field358 = false;

	@ObfuscatedName("client.Mh")
	public int[] field361 = new int[1000];

	@ObfuscatedName("client.Vh")
	public LDILQFVA field366 = LDILQFVA.method390(1);

	@ObfuscatedName("client.ai")
	public int[] field370 = new int[50];

	@ObfuscatedName("client.ci")
	public LOISKKJJ[][][] field372 = new LOISKKJJ[4][104][104];

	@ObfuscatedName("client.di")
	public DUMEPGRH[] field373 = new DUMEPGRH[1000];

	@ObfuscatedName("client.ei")
	public DUMEPGRH[] field374 = new DUMEPGRH[20];

	@ObfuscatedName("client.gi")
	public boolean field375 = true;

	@ObfuscatedName("client.ii")
	public final int[] field377 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.li")
	public boolean field379 = false;

	@ObfuscatedName("client.oi")
	public int field382 = 2;

	@ObfuscatedName("client.zi")
	public LDILQFVA field393 = new LDILQFVA(new byte[5000]);

	@ObfuscatedName("client.Ai")
	public TVKIEQYR[] field394 = new TVKIEQYR[16384];

	@ObfuscatedName("client.Ci")
	public int[] field396 = new int[16384];

	@ObfuscatedName("client.Hi")
	public boolean field401 = false;

	@ObfuscatedName("client.Li")
	public int[] field405 = new int[2000];

	@ObfuscatedName("client.Mi")
	public int field406 = -1;

	@ObfuscatedName("client.aj")
	public boolean field418 = false;

	@ObfuscatedName("client.bj")
	public boolean field419 = false;

	@ObfuscatedName("client.gj")
	public String field423 = "";

	@ObfuscatedName("client.hj")
	public String field424 = "";

	@ObfuscatedName("client.pj")
	public EXLGBZBR[] field431 = new EXLGBZBR[4];

	@ObfuscatedName("client.sj")
	public int[] field433 = new int[5];

	@ObfuscatedName("client.uj")
	public long[] field435 = new long[200];

	@ObfuscatedName("client.wj")
	public int field437 = -1;

	@ObfuscatedName("client.zj")
	public LDILQFVA field439 = LDILQFVA.method390(1);

	@ObfuscatedName("client.Cj")
	public int field441 = -1;

	@ObfuscatedName("client.Kj")
	public int[] field446 = new int[151];

	@ObfuscatedName("client.Oj")
	public int[] field448 = new int[7];

	@ObfuscatedName("client.Sj")
	public boolean field452 = false;

	@ObfuscatedName("client.Uj")
	public String field454 = "";

	@ObfuscatedName("client.Vj")
	public int[] field455 = new int[2000];

	@ObfuscatedName("client.Xj")
	public int[][] field457 = new int[104][104];

	@ObfuscatedName("client.ec")
	public static BigInteger field101 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.rd")
	public static int[] field160 = new int[32];

	@ObfuscatedName("client.Ge")
	public static final int[][] field220 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Nf")
	public static String field267 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Rh")
	public static int field362 = 10;

	@ObfuscatedName("client.Th")
	public static boolean field364 = true;

	@ObfuscatedName("client.Yh")
	public static BigInteger field368 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.hi")
	public static final int[] field376 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Ji")
	public static int[] field403 = new int[99];

	@ObfuscatedName("client.ic")
	public int field105;

	@ObfuscatedName("client.kc")
	public int field106;

	@ObfuscatedName("client.sc")
	public int field113;

	@ObfuscatedName("client.tc")
	public int field114;

	@ObfuscatedName("client.uc")
	public int field115;

	@ObfuscatedName("client.vc")
	public int field116;

	@ObfuscatedName("client.wc")
	public int field117;

	@ObfuscatedName("client.yc")
	public int field118;

	@ObfuscatedName("client.Bc")
	public int field121;

	@ObfuscatedName("client.Cc")
	public int field122;

	@ObfuscatedName("client.Hc")
	public static int field126;

	@ObfuscatedName("client.Ic")
	public int field127;

	@ObfuscatedName("client.Jc")
	public int field128;

	@ObfuscatedName("client.Lc")
	public static int field130;

	@ObfuscatedName("client.Mc")
	public int field131;

	@ObfuscatedName("client.Nc")
	public static int field132;

	@ObfuscatedName("client.Oc")
	public int field133;

	@ObfuscatedName("client.Yc")
	public int field143;

	@ObfuscatedName("client.Zc")
	public int field144;

	@ObfuscatedName("client.kd")
	public static int field153;

	@ObfuscatedName("client.od")
	public static int field157;

	@ObfuscatedName("client.Ad")
	public static int field168;

	@ObfuscatedName("client.Cd")
	public int field170;

	@ObfuscatedName("client.Id")
	public int field176;

	@ObfuscatedName("client.Md")
	public int field179;

	@ObfuscatedName("client.Nd")
	public static int field180;

	@ObfuscatedName("client.Od")
	public int field181;

	@ObfuscatedName("client.Pd")
	public int field182;

	@ObfuscatedName("client.Sd")
	public int field185;

	@ObfuscatedName("client.Zd")
	public int field190;

	@ObfuscatedName("client.ae")
	public int field191;

	@ObfuscatedName("client.be")
	public int field192;

	@ObfuscatedName("client.ce")
	public int field193;

	@ObfuscatedName("client.de")
	public int field194;

	@ObfuscatedName("client.je")
	public int field200;

	@ObfuscatedName("client.me")
	public int field202;

	@ObfuscatedName("client.ne")
	public int field203;

	@ObfuscatedName("client.oe")
	public int field204;

	@ObfuscatedName("client.pe")
	public int field205;

	@ObfuscatedName("client.se")
	public int field208;

	@ObfuscatedName("client.ue")
	public int field209;

	@ObfuscatedName("client.Fe")
	public static int field219;

	@ObfuscatedName("client.Je")
	public static int field221;

	@ObfuscatedName("client.Ke")
	public int field222;

	@ObfuscatedName("client.Ne")
	public int field224;

	@ObfuscatedName("client.Oe")
	public int field225;

	@ObfuscatedName("client.Pe")
	public static int field226;

	@ObfuscatedName("client.Te")
	public int field230;

	@ObfuscatedName("client.Ue")
	public int field231;

	@ObfuscatedName("client.df")
	public int field236;

	@ObfuscatedName("client.ff")
	public int field237;

	@ObfuscatedName("client.hf")
	public int field238;

	@ObfuscatedName("client.nf")
	public int field242;

	@ObfuscatedName("client.of")
	public int field243;

	@ObfuscatedName("client.pf")
	public int field244;

	@ObfuscatedName("client.qf")
	public int field245;

	@ObfuscatedName("client.rf")
	public int field246;

	@ObfuscatedName("client.sf")
	public int field247;

	@ObfuscatedName("client.tf")
	public int field248;

	@ObfuscatedName("client.zf")
	public int field254;

	@ObfuscatedName("client.Bf")
	public int field256;

	@ObfuscatedName("client.Ff")
	public static int field260;

	@ObfuscatedName("client.If")
	public int field262;

	@ObfuscatedName("client.Kf")
	public int field264;

	@ObfuscatedName("client.Lf")
	public int field265;

	@ObfuscatedName("client.Of")
	public int field268;

	@ObfuscatedName("client.Pf")
	public int field269;

	@ObfuscatedName("client.Qf")
	public int field270;

	@ObfuscatedName("client.Rf")
	public int field271;

	@ObfuscatedName("client.Sf")
	public int field272;

	@ObfuscatedName("client.Tf")
	public int field273;

	@ObfuscatedName("client.jg")
	public int field286;

	@ObfuscatedName("client.tg")
	public int field295;

	@ObfuscatedName("client.ug")
	public int field296;

	@ObfuscatedName("client.vg")
	public int field297;

	@ObfuscatedName("client.wg")
	public int field298;

	@ObfuscatedName("client.xg")
	public int field299;

	@ObfuscatedName("client.Eg")
	public int field305;

	@ObfuscatedName("client.Gg")
	public static int field307;

	@ObfuscatedName("client.Jg")
	public static int field308;

	@ObfuscatedName("client.Kg")
	public int field309;

	@ObfuscatedName("client.Lg")
	public int field310;

	@ObfuscatedName("client.Mg")
	public int field311;

	@ObfuscatedName("client.Ng")
	public int field312;

	@ObfuscatedName("client.Og")
	public int field313;

	@ObfuscatedName("client.Pg")
	public int field314;

	@ObfuscatedName("client.Zg")
	public int field323;

	@ObfuscatedName("client.ah")
	public int field324;

	@ObfuscatedName("client.bh")
	public int field325;

	@ObfuscatedName("client.dh")
	public int field327;

	@ObfuscatedName("client.fh")
	public int field329;

	@ObfuscatedName("client.lh")
	public int field335;

	@ObfuscatedName("client.mh")
	public int field336;

	@ObfuscatedName("client.nh")
	public int field337;

	@ObfuscatedName("client.oh")
	public int field338;

	@ObfuscatedName("client.ph")
	public int field339;

	@ObfuscatedName("client.K")
	public int field34;

	@ObfuscatedName("client.qh")
	public int field340;

	@ObfuscatedName("client.rh")
	public int field341;

	@ObfuscatedName("client.L")
	public int field35;

	@ObfuscatedName("client.Ch")
	public int field352;

	@ObfuscatedName("client.Dh")
	public int field353;

	@ObfuscatedName("client.Fh")
	public int field355;

	@ObfuscatedName("client.Gh")
	public int field356;

	@ObfuscatedName("client.M")
	public int field36;

	@ObfuscatedName("client.Lh")
	public int field360;

	@ObfuscatedName("client.Sh")
	public static int field363;

	@ObfuscatedName("client.Wh")
	public int field367;

	@ObfuscatedName("client.Zh")
	public int field369;

	@ObfuscatedName("client.N")
	public int field37;

	@ObfuscatedName("client.bi")
	public int field371;

	@ObfuscatedName("client.ki")
	public int field378;

	@ObfuscatedName("client.O")
	public int field38;

	@ObfuscatedName("client.mi")
	public int field380;

	@ObfuscatedName("client.ni")
	public int field381;

	@ObfuscatedName("client.qi")
	public int field384;

	@ObfuscatedName("client.ri")
	public int field385;

	@ObfuscatedName("client.si")
	public int field386;

	@ObfuscatedName("client.ui")
	public int field388;

	@ObfuscatedName("client.vi")
	public int field389;

	@ObfuscatedName("client.P")
	public int field39;

	@ObfuscatedName("client.wi")
	public int field390;

	@ObfuscatedName("client.xi")
	public int field391;

	@ObfuscatedName("client.yi")
	public int field392;

	@ObfuscatedName("client.Bi")
	public int field395;

	@ObfuscatedName("client.Di")
	public int field397;

	@ObfuscatedName("client.Ei")
	public int field398;

	@ObfuscatedName("client.Q")
	public int field40;

	@ObfuscatedName("client.Gi")
	public int field400;

	@ObfuscatedName("client.Ii")
	public int field402;

	@ObfuscatedName("client.Ki")
	public static int field404;

	@ObfuscatedName("client.Oi")
	public int field407;

	@ObfuscatedName("client.Pi")
	public int field408;

	@ObfuscatedName("client.cj")
	public int field420;

	@ObfuscatedName("client.dj")
	public int field421;

	@ObfuscatedName("client.ej")
	public int field422;

	@ObfuscatedName("client.qj")
	public int field432;

	@ObfuscatedName("client.tj")
	public static int field434;

	@ObfuscatedName("client.vj")
	public int field436;

	@ObfuscatedName("client.Aj")
	public int field440;

	@ObfuscatedName("client.Fj")
	public int field442;

	@ObfuscatedName("client.Gj")
	public int field443;

	@ObfuscatedName("client.Ij")
	public int field444;

	@ObfuscatedName("client.Nj")
	public int field447;

	@ObfuscatedName("client.Rj")
	public int field451;

	@ObfuscatedName("client.Wj")
	public static int field456;

	@ObfuscatedName("client.Z")
	public int field48;

	@ObfuscatedName("client.ab")
	public int field49;

	@ObfuscatedName("client.bb")
	public int field50;

	@ObfuscatedName("client.cb")
	public int field51;

	@ObfuscatedName("client.eb")
	public int field53;

	@ObfuscatedName("client.ib")
	public int field57;

	@ObfuscatedName("client.tb")
	public int field67;

	@ObfuscatedName("client.wb")
	public int field70;

	@ObfuscatedName("client.Ab")
	public int field74;

	@ObfuscatedName("client.Bb")
	public int field75;

	@ObfuscatedName("client.Cb")
	public int field76;

	@ObfuscatedName("client.Db")
	public int field77;

	@ObfuscatedName("client.Pb")
	public int field88;

	@ObfuscatedName("client.Tb")
	public int field92;

	@ObfuscatedName("client.gc")
	public long field103;

	@ObfuscatedName("client.Xf")
	public long field277;

	@ObfuscatedName("client.Kh")
	public long field359;

	@ObfuscatedName("client.pi")
	public long field383;

	@ObfuscatedName("client.ti")
	public long field387;

	@ObfuscatedName("client.zc")
	public static AHUILQJH field119;

	@ObfuscatedName("client.pd")
	public DLDGGHZP field158;

	@ObfuscatedName("client.Gd")
	public DUMEPGRH field174;

	@ObfuscatedName("client.Hd")
	public DUMEPGRH field175;

	@ObfuscatedName("client.ee")
	public DUMEPGRH field195;

	@ObfuscatedName("client.vf")
	public DUMEPGRH field250;

	@ObfuscatedName("client.Mf")
	public DUMEPGRH field266;

	@ObfuscatedName("client.Bg")
	public DUMEPGRH field302;

	@ObfuscatedName("client.Cg")
	public DUMEPGRH field303;

	@ObfuscatedName("client.kj")
	public DUMEPGRH field426;

	@ObfuscatedName("client.lj")
	public DUMEPGRH field427;

	@ObfuscatedName("client.mj")
	public DUMEPGRH field428;

	@ObfuscatedName("client.nj")
	public DUMEPGRH field429;

	@ObfuscatedName("client.oj")
	public DUMEPGRH field430;

	@ObfuscatedName("client.Rb")
	public DUMEPGRH field90;

	@ObfuscatedName("client.Sb")
	public DUMEPGRH field91;

	@ObfuscatedName("client.uf")
	public EDOAEAIN field249;

	@ObfuscatedName("client.xh")
	public EYHVDWTF field347;

	@ObfuscatedName("client.yh")
	public EYHVDWTF field348;

	@ObfuscatedName("client.zh")
	public EYHVDWTF field349;

	@ObfuscatedName("client.Ah")
	public EYHVDWTF field350;

	@ObfuscatedName("client.Zb")
	public GLPUEKVZ field97;

	@ObfuscatedName("client.Tj")
	public JHNSGCOV field453;

	@ObfuscatedName("client.Fi")
	public KUQMNLGP field399;

	@ObfuscatedName("client.lc")
	public LKEIRLLI field107;

	@ObfuscatedName("client.mc")
	public LKEIRLLI field108;

	@ObfuscatedName("client.nc")
	public LKEIRLLI field109;

	@ObfuscatedName("client.oc")
	public LKEIRLLI field110;

	@ObfuscatedName("client.pc")
	public LKEIRLLI field111;

	@ObfuscatedName("client.Be")
	public LKEIRLLI field215;

	@ObfuscatedName("client.Ce")
	public LKEIRLLI field216;

	@ObfuscatedName("client.De")
	public LKEIRLLI field217;

	@ObfuscatedName("client.Yf")
	public LKEIRLLI field278;

	@ObfuscatedName("client.Zf")
	public LKEIRLLI field279;

	@ObfuscatedName("client.ag")
	public LKEIRLLI field280;

	@ObfuscatedName("client.bg")
	public LKEIRLLI field281;

	@ObfuscatedName("client.cg")
	public LKEIRLLI field282;

	@ObfuscatedName("client.qg")
	public LKEIRLLI field293;

	@ObfuscatedName("client.rg")
	public LKEIRLLI field294;

	@ObfuscatedName("client.Vg")
	public LKEIRLLI field320;

	@ObfuscatedName("client.Wg")
	public LKEIRLLI field321;

	@ObfuscatedName("client.T")
	public LKEIRLLI field43;

	@ObfuscatedName("client.U")
	public LKEIRLLI field44;

	@ObfuscatedName("client.V")
	public LKEIRLLI field45;

	@ObfuscatedName("client.ze")
	public SPZBTZXL field213;

	@ObfuscatedName("client.lg")
	public TWKZMYGD field288;

	@ObfuscatedName("client.mg")
	public TWKZMYGD field289;

	@ObfuscatedName("client.ng")
	public TWKZMYGD field290;

	@ObfuscatedName("client.Qi")
	public TWKZMYGD field409;

	@ObfuscatedName("client.Ri")
	public TWKZMYGD field410;

	@ObfuscatedName("client.Si")
	public TWKZMYGD field411;

	@ObfuscatedName("client.Ti")
	public TWKZMYGD field412;

	@ObfuscatedName("client.Ui")
	public TWKZMYGD field413;

	@ObfuscatedName("client.Vi")
	public TWKZMYGD field414;

	@ObfuscatedName("client.Wi")
	public TWKZMYGD field415;

	@ObfuscatedName("client.Xi")
	public TWKZMYGD field416;

	@ObfuscatedName("client.Yi")
	public TWKZMYGD field417;

	@ObfuscatedName("client.jb")
	public TWKZMYGD field58;

	@ObfuscatedName("client.kb")
	public TWKZMYGD field59;

	@ObfuscatedName("client.lb")
	public TWKZMYGD field60;

	@ObfuscatedName("client.mb")
	public TWKZMYGD field61;

	@ObfuscatedName("client.nb")
	public TWKZMYGD field62;

	@ObfuscatedName("client.ob")
	public TWKZMYGD field63;

	@ObfuscatedName("client.pb")
	public TWKZMYGD field64;

	@ObfuscatedName("client.qb")
	public TWKZMYGD field65;

	@ObfuscatedName("client.rb")
	public TWKZMYGD field66;

	@ObfuscatedName("client.Ib")
	public TWKZMYGD field81;

	@ObfuscatedName("client.Jb")
	public TWKZMYGD field82;

	@ObfuscatedName("client.Kb")
	public TWKZMYGD field83;

	@ObfuscatedName("client.Lb")
	public TWKZMYGD field84;

	@ObfuscatedName("client.R")
	public String field41;

	@ObfuscatedName("client.Jj")
	public String field445;

	@ObfuscatedName("client.db")
	public String field52;

	@ObfuscatedName("client.vb")
	public String field69;

	@ObfuscatedName("client.Me")
	public Socket field223;

	@ObfuscatedName("client.Kc")
	public static boolean field129;

	@ObfuscatedName("client.re")
	public static boolean field207;

	@ObfuscatedName("client.xe")
	public static boolean field212;

	@ObfuscatedName("client.Uh")
	public static boolean field365;

	@ObfuscatedName("client.ad")
	public int[] field145;

	@ObfuscatedName("client.bd")
	public int[] field146;

	@ObfuscatedName("client.vd")
	public int[] field164;

	@ObfuscatedName("client.wd")
	public int[] field165;

	@ObfuscatedName("client.xd")
	public int[] field166;

	@ObfuscatedName("client.yd")
	public int[] field167;

	@ObfuscatedName("client.ge")
	public int[] field197;

	@ObfuscatedName("client.he")
	public int[] field198;

	@ObfuscatedName("client.ie")
	public int[] field199;

	@ObfuscatedName("client.sh")
	public int[] field342;

	@ObfuscatedName("client.th")
	public int[] field343;

	@ObfuscatedName("client.uh")
	public int[] field344;

	@ObfuscatedName("client.Pj")
	public int[] field449;

	@ObfuscatedName("client.Qj")
	public int[] field450;

	@ObfuscatedName("client.Dg")
	public LKEIRLLI[] field304;

	@ObfuscatedName("client.ld")
	public byte[][] field154;

	@ObfuscatedName("client.xj")
	public byte[][] field438;

	@ObfuscatedName("client.jj")
	public byte[][][] field425;

	@ObfuscatedName("client.Ef")
	public int[][][] field259;

	@ObfuscatedName("client.c(I)V")
	public final void method10() {
		field293 = new LKEIRLLI(field213, "titlebox", 0);
		field294 = new LKEIRLLI(field213, "titlebutton", 0);
		field304 = new LKEIRLLI[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field304[var2] = new LKEIRLLI(field213, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field304[var3] = new LKEIRLLI(field213, "runes", (var3 & 0x3) + 12);
			}
		}

		field302 = new DUMEPGRH(128, 265);
		field303 = new DUMEPGRH(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field302.field543[var4] = field412.field1136[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field303.field543[var5] = field413.field1136[var5];
		}

		field165 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field165[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field165[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field165[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field165[var9 + 192] = 0xFFFFFF;
		}

		field166 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field166[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field166[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field166[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field166[var13 + 192] = 0xFFFFFF;
		}

		field167 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field167[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field167[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field167[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field167[var17 + 192] = 0xFFFFFF;
		}

		field164 = new int[256];
		field449 = new int[32768];
		field450 = new int[32768];
		method126(null);
		field145 = new int[32768];
		field146 = new int[32768];
		method23("Connecting to fileserver", 10);

		if (!field358) {
			field99 = true;
			field358 = true;
			method64(this, 2);
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method11() {
		if (field46 || field86 || field196) {
			method12();
		} else {
			field219++;

			if (field285) {
				method33();
			} else {
				method66(false);
			}

			field378 = 0;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method12() {
		Graphics var1 = method71().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method371(1);

		if (field86) {
			field358 = false;
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

		if (field196) {
			field358 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field46) {
			field358 = false;
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

	@ObfuscatedName("client.d(B)V")
	public final void method13() {
		if (field392 > 0) {
			method74();
		} else {
			field83.method529();
			field348.method253("Connection lost", 257, 144, 0);
			field348.method253("Connection lost", 256, 143, 0xFFFFFF);
			field348.method253("Please wait - attempting to reestablish", 257, 159, 0);
			field348.method253("Please wait - attempting to reestablish", 256, 158, 0xFFFFFF);
			field83.method530(4, 4, field817);
			field53 = 0;
			field264 = 0;
			EDOAEAIN var1 = field249;
			field285 = false;
			field432 = 0;
			method77(field95, field96, true);

			if (!field285) {
				method74();
			}

			try {
				var1.method227();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method14() {
		field327 = 0;
		int var1 = (field119.field1391 >> 7) + field202;
		int var2 = (field119.field1392 >> 7) + field203;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field327 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field327 = 1;
		}

		if (field327 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field327 = 0;
		}
	}

	@ObfuscatedName("client.a(ILULLVQOAK;)V")
	public final void method15(ULLVQOAK arg0) {
		int var2 = arg0.field1188;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field398 == 0) {
				arg0.field1211 = "Loading friend list";
				arg0.field1177 = 0;
			} else if (var2 == 1 && field398 == 1) {
				arg0.field1211 = "Connecting to friendserver";
				arg0.field1177 = 0;
			} else if (var2 == 2 && field398 != 2) {
				arg0.field1211 = "Please wait...";
				arg0.field1177 = 0;
			} else {
				int var3 = field397;
				if (field398 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1211 = "";
					arg0.field1177 = 0;
				} else {
					arg0.field1211 = field177[var2];
					arg0.field1177 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field397;
			if (field398 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1211 = "";
				arg0.field1177 = 0;
			} else {
				if (field100[var2] == 0) {
					arg0.field1211 = "@red@Offline";
				} else if (field100[var2] == field362) {
					arg0.field1211 = "@gre@World-" + (field100[var2] - 9);
				} else {
					arg0.field1211 = "@yel@World-" + (field100[var2] - 9);
				}

				arg0.field1177 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field397;
			if (field398 != 2) {
				var5 = 0;
			}

			arg0.field1168 = var5 * 15 + 20;
			if (arg0.field1168 <= arg0.field1218) {
				arg0.field1168 = arg0.field1218 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field398 == 0) {
				arg0.field1211 = "Loading ignore list";
				arg0.field1177 = 0;
			} else if (var2 == 1 && field398 == 0) {
				arg0.field1211 = "Please wait...";
				arg0.field1177 = 0;
			} else {
				int var6 = field225;
				if (field398 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1211 = "";
					arg0.field1177 = 0;
				} else {
					arg0.field1211 = FBIFPAXF.method272(FBIFPAXF.method269(field300[var2]));
					arg0.field1177 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1168 = field225 * 15 + 20;
			if (arg0.field1168 <= arg0.field1218) {
				arg0.field1168 = arg0.field1218 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1182 = 150;
			arg0.field1183 = (int) (Math.sin(field221 / 40.0D) * 256.0D) & 0x7FF;

			if (field333) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field448[var7];
					if (var8 >= 0 && !YMQGRGSI.field1381[var8].method570()) {
						return;
					}
				}

				field333 = false;
				HEQROJXW[] var9 = new HEQROJXW[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field448[var11];
					if (var12 >= 0) {
						var9[var10++] = YMQGRGSI.field1381[var12].method571();
					}
				}

				HEQROJXW var13 = new HEQROJXW(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field94[var14] != 0) {
						var13.method336(field220[var14][0], field220[var14][field94[var14]]);

						if (var14 == 1) {
							var13.method336(field376[0], field376[field94[var14]]);
						}
					}
				}

				var13.method329();
				var13.method330(XKEHWKFH.field1362[field119.field1402].field1364[0]);
				var13.method339(64, 850, -30, -50, -30, true);
				arg0.field1195 = 5;
				arg0.field1196 = 0;
				ULLVQOAK.method541(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field90 == null) {
				field90 = arg0.field1209;
				field91 = arg0.field1190;
			}

			if (field357) {
				arg0.field1209 = field91;
			} else {
				arg0.field1209 = field90;
			}
		} else if (var2 == 325) {
			if (field90 == null) {
				field90 = arg0.field1209;
				field91 = arg0.field1190;
			}

			if (field357) {
				arg0.field1209 = field90;
			} else {
				arg0.field1209 = field91;
			}
		} else if (var2 == 600) {
			arg0.field1211 = field98;
			if (field221 % 20 < 10) {
				arg0.field1211 = arg0.field1211 + "|";
			} else {
				arg0.field1211 = arg0.field1211 + " ";
			}
		} else if (var2 == 613) {
			if (field131 < 1) {
				arg0.field1211 = "";
			} else if (field452) {
				arg0.field1169 = 0xFF0000;
				arg0.field1211 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1169 = 0xFFFFFF;
				arg0.field1211 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field237 == 0) {
				arg0.field1211 = "";
			} else {
				String var15;
				if (field200 == 0) {
					var15 = "earlier today";
				} else if (field200 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field200 + " days ago";
				}

				arg0.field1211 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field222 == 0) {
				arg0.field1211 = "0 unread messages";
				arg0.field1169 = 0xFFFF00;
			}

			if (field222 == 1) {
				arg0.field1211 = "1 unread message";
				arg0.field1169 = 0xFF00;
			}

			if (field222 > 1) {
				arg0.field1211 = field222 + " unread messages";
				arg0.field1169 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field262 == 201) {
				if (field442 == 1) {
					arg0.field1211 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1211 = "";
				}
			} else if (field262 == 200) {
				arg0.field1211 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field262 == 0) {
					var16 = "Earlier today";
				} else if (field262 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field262 + " days ago";
				}

				arg0.field1211 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field262 == 201) {
				if (field442 == 1) {
					arg0.field1211 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1211 = "";
				}
			} else if (field262 == 200) {
				arg0.field1211 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1211 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field262 == 201) {
				if (field442 == 1) {
					arg0.field1211 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1211 = "";
				}
			} else if (field262 == 200) {
				arg0.field1211 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1211 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method16() {
		if (field831 == 1) {
			if (field832 >= 539 && field832 <= 573 && field833 >= 169 && field833 < 205 && field334[0] != -1) {
				field161 = true;
				field315 = 0;
				field123 = true;
			}

			if (field832 >= 569 && field832 <= 599 && field833 >= 168 && field833 < 205 && field334[1] != -1) {
				field161 = true;
				field315 = 1;
				field123 = true;
			}

			if (field832 >= 597 && field832 <= 627 && field833 >= 168 && field833 < 205 && field334[2] != -1) {
				field161 = true;
				field315 = 2;
				field123 = true;
			}

			if (field832 >= 625 && field832 <= 669 && field833 >= 168 && field833 < 203 && field334[3] != -1) {
				field161 = true;
				field315 = 3;
				field123 = true;
			}

			if (field832 >= 666 && field832 <= 696 && field833 >= 168 && field833 < 205 && field334[4] != -1) {
				field161 = true;
				field315 = 4;
				field123 = true;
			}

			if (field832 >= 694 && field832 <= 724 && field833 >= 168 && field833 < 205 && field334[5] != -1) {
				field161 = true;
				field315 = 5;
				field123 = true;
			}

			if (field832 >= 722 && field832 <= 756 && field833 >= 169 && field833 < 205 && field334[6] != -1) {
				field161 = true;
				field315 = 6;
				field123 = true;
			}

			if (field832 >= 540 && field832 <= 574 && field833 >= 466 && field833 < 502 && field334[7] != -1) {
				field161 = true;
				field315 = 7;
				field123 = true;
			}

			if (field832 >= 572 && field832 <= 602 && field833 >= 466 && field833 < 503 && field334[8] != -1) {
				field161 = true;
				field315 = 8;
				field123 = true;
			}

			if (field832 >= 599 && field832 <= 629 && field833 >= 466 && field833 < 503 && field334[9] != -1) {
				field161 = true;
				field315 = 9;
				field123 = true;
			}

			if (field832 >= 627 && field832 <= 671 && field833 >= 467 && field833 < 502 && field334[10] != -1) {
				field161 = true;
				field315 = 10;
				field123 = true;
			}

			if (field832 >= 669 && field832 <= 699 && field833 >= 466 && field833 < 503 && field334[11] != -1) {
				field161 = true;
				field315 = 11;
				field123 = true;
			}

			if (field832 >= 696 && field832 <= 726 && field833 >= 466 && field833 < 503 && field334[12] != -1) {
				field161 = true;
				field315 = 12;
				field123 = true;
			}

			if (field832 >= 724 && field832 <= 758 && field833 >= 466 && field833 < 502 && field334[13] != -1) {
				field161 = true;
				field315 = 13;
				field123 = true;
			}

			field168++;
			if (field168 > 184) {
				field168 = 0;
				field292.method391(213);
				field292.method393(6488);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIBLULLVQOAK;II)V")
	public final void method17(int arg0, int arg1, int arg2, ULLVQOAK arg3, int arg4, int arg5) {
		if (arg3.field1176 == 0 && arg3.field1187 != null && !arg3.field1208 && (arg2 >= arg4 && arg5 >= arg1 && arg2 <= arg3.field1217 + arg4 && arg5 <= arg3.field1218 + arg1)) {
			int var7 = arg3.field1187.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field1210[var8] + arg4;
				int var10 = arg3.field1221[var8] + arg1 - arg0;
				ULLVQOAK var11 = ULLVQOAK.field1172[arg3.field1187[var8]];
				var9 += var11.field1173;
				var10 += var11.field1189;
				if ((var11.field1185 >= 0 || var11.field1166 != 0) && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
					if (var11.field1185 >= 0) {
						field88 = var11.field1185;
					} else {
						field88 = var11.field1224;
					}
				}

				if (var11.field1176 == 0) {
					method17(var11.field1201, var10, arg2, var11, var9, arg5);

					if (var11.field1168 > var11.field1218) {
						method122(arg2, var10, arg5, var11.field1217 + var9, var11.field1218, var11, true, var11.field1168);
					}
				} else {
					if (var11.field1177 == 1 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						boolean var12 = false;
						if (var11.field1188 != 0) {
							var12 = method56(var11);
						}

						if (!var12) {
							field163[field367] = var11.field1219;
							field318[field367] = 158;
							field317[field367] = var11.field1224;
							field367++;
						}
					}

					if (var11.field1177 == 2 && field38 == 0 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						String var13 = var11.field1204;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field163[field367] = var13 + " @gre@" + var11.field1174;
						field318[field367] = 358;
						field317[field367] = var11.field1224;
						field367++;
					}

					if (var11.field1177 == 3 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						field163[field367] = "Close";
						field318[field367] = 242;
						field317[field367] = var11.field1224;
						field367++;
					}

					if (var11.field1177 == 4 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						field163[field367] = var11.field1219;
						field318[field367] = 682;
						field317[field367] = var11.field1224;
						field367++;
					}

					if (var11.field1177 == 5 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						field163[field367] = var11.field1219;
						field318[field367] = 552;
						field317[field367] = var11.field1224;
						field367++;
					}

					if (var11.field1177 == 6 && !field379 && arg2 >= var9 && arg5 >= var10 && arg2 < var11.field1217 + var9 && arg5 < var11.field1218 + var10) {
						field163[field367] = var11.field1219;
						field318[field367] = 622;
						field317[field367] = var11.field1224;
						field367++;
					}

					if (var11.field1176 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1218; var15++) {
							for (int var16 = 0; var16 < var11.field1217; var16++) {
								int var17 = (var11.field1165 + 32) * var16 + var9;
								int var18 = (var11.field1199 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1213[var14];
									var18 += var11.field1179[var14];
								}

								if (arg2 >= var17 && arg5 >= var18 && arg2 < var17 + 32 && arg5 < var18 + 32) {
									field407 = var14;
									field408 = var11.field1224;

									if (var11.field1167[var14] > 0) {
										KNYKYROC var19 = KNYKYROC.method380(var11.field1167[var14] - 1);
										if (field48 == 1 && var11.field1229) {
											if (field50 != var11.field1224 || field49 != var14) {
												field163[field367] = "Use " + field52 + " with @lre@" + var19.field865;
												field318[field367] = 829;
												field319[field367] = var19.field882;
												field316[field367] = var14;
												field317[field367] = var11.field1224;
												field367++;
											}
										} else if (field38 != 1 || !var11.field1229) {
											if (var11.field1229) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field890 != null && var19.field890[var20] != null) {
														field163[field367] = var19.field890[var20] + " @lre@" + var19.field865;

														if (var20 == 3) {
															field318[field367] = 598;
														}

														if (var20 == 4) {
															field318[field367] = 975;
														}

														field319[field367] = var19.field882;
														field316[field367] = var14;
														field317[field367] = var11.field1224;
														field367++;
													} else if (var20 == 4) {
														field163[field367] = "Drop @lre@" + var19.field865;
														field318[field367] = 975;
														field319[field367] = var19.field882;
														field316[field367] = var14;
														field317[field367] = var11.field1224;
														field367++;
													}
												}
											}

											if (var11.field1178) {
												field163[field367] = "Use @lre@" + var19.field865;
												field318[field367] = 787;
												field319[field367] = var19.field882;
												field316[field367] = var14;
												field317[field367] = var11.field1224;
												field367++;
											}

											if (var11.field1229 && var19.field890 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field890[var21] != null) {
														field163[field367] = var19.field890[var21] + " @lre@" + var19.field865;

														if (var21 == 0) {
															field318[field367] = 579;
														}

														if (var21 == 1) {
															field318[field367] = 540;
														}

														if (var21 == 2) {
															field318[field367] = 422;
														}

														field319[field367] = var19.field882;
														field316[field367] = var14;
														field317[field367] = var11.field1224;
														field367++;
													}
												}
											}

											if (var11.field1214 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1214[var22] != null) {
														field163[field367] = var11.field1214[var22] + " @lre@" + var19.field865;

														if (var22 == 0) {
															field318[field367] = 855;
														}

														if (var22 == 1) {
															field318[field367] = 822;
														}

														if (var22 == 2) {
															field318[field367] = 589;
														}

														if (var22 == 3) {
															field318[field367] = 914;
														}

														if (var22 == 4) {
															field318[field367] = 568;
														}

														field319[field367] = var19.field882;
														field316[field367] = var14;
														field317[field367] = var11.field1224;
														field367++;
													}
												}
											}

											field163[field367] = "Examine @lre@" + var19.field865;
											field318[field367] = 1186;
											field319[field367] = var19.field882;
											field316[field367] = var14;
											field317[field367] = var11.field1224;
											field367++;
										} else if ((field40 & 0x10) == 0x10) {
											field163[field367] = field41 + " @lre@" + var19.field865;
											field318[field367] = 943;
											field319[field367] = var19.field882;
											field316[field367] = var14;
											field317[field367] = var11.field1224;
											field367++;
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

	@ObfuscatedName("client.a(ZLLDILQFVA;I)V")
	public final void method18(LDILQFVA arg0, int arg1) {
		arg0.method412();
		int var3 = arg0.method413(8);
		if (var3 < field395) {
			for (int var4 = var3; var4 < field395; var4++) {
				field361[field360++] = field396[var4];
			}
		}

		if (var3 > field395) {
			signlink.reporterror(field95 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field395 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field396[var5];
			TVKIEQYR var7 = field394[var6];
			int var8 = arg0.method413(1);
			if (var8 == 0) {
				field396[field395++] = var6;
				var7.field1442 = field221;
			} else {
				int var9 = arg0.method413(2);
				if (var9 == 0) {
					field396[field395++] = var6;
					var7.field1442 = field221;
					field257[field256++] = var6;
				} else if (var9 == 1) {
					field396[field395++] = var6;
					var7.field1442 = field221;
					int var10 = arg0.method413(3);
					var7.method574(var10, false);
					int var11 = arg0.method413(1);
					if (var11 == 1) {
						field257[field256++] = var6;
					}
				} else if (var9 == 2) {
					field396[field395++] = var6;
					var7.field1442 = field221;
					int var12 = arg0.method413(3);
					var7.method574(var12, true);
					int var13 = arg0.method413(3);
					var7.method574(var13, true);
					int var14 = arg0.method413(1);
					if (var14 == 1) {
						field257[field256++] = var6;
					}
				} else if (var9 == 3) {
					field361[field360++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String method19(int arg0) {
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

	@ObfuscatedName("client.c(III)Z")
	public final boolean method20(int arg0, int arg1) {
		boolean var3 = false;
		ULLVQOAK var4 = ULLVQOAK.field1172[arg0];
		for (int var5 = 0; var5 < var4.field1187.length && var4.field1187[var5] != -1; var5++) {
			ULLVQOAK var6 = ULLVQOAK.field1172[var4.field1187[var5]];
			if (var6.field1176 == 1) {
				var3 |= method20(var6.field1224, arg1);
			}

			if (var6.field1176 == 6 && (var6.field1193 != -1 || var6.field1194 != -1)) {
				boolean var7 = method91(var6);
				int var8;
				if (var7) {
					var8 = var6.field1194;
				} else {
					var8 = var6.field1193;
				}

				if (var8 != -1) {
					XKEHWKFH var9 = XKEHWKFH.field1362[var8];
					var6.field1197 += arg1;
					while (var6.field1197 > var9.method566(var6.field1200)) {
						var6.field1197 -= var9.method566(var6.field1200) + 1;
						var6.field1200++;
						if (var6.field1200 >= var9.field1363) {
							var6.field1200 -= var9.field1367;
							if (var6.field1200 < 0 || var6.field1200 >= var9.field1363) {
								var6.field1200 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1176 == 6 && var6.field1180 != 0) {
				int var10 = var6.field1180 >> 16;
				int var11 = var6.field1180 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1182 = var6.field1182 + var10 & 0x7FF;
				var6.field1183 = var6.field1183 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method21() {
		field126++;
		if (field126 > 178) {
			field126 = 0;
			field292.method391(128);
			field292.method396(0);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method372();
					if (var1 == -1) {
						return;
					}

					if (field229 != -1 && field441 == field229) {
						break;
					}

					if (field418) {
						if (var1 >= 32 && var1 <= 122 && field173.length() < 80) {
							field173 = field173 + (char) var1;
							field232 = true;
						}

						if (var1 == 8 && field173.length() > 0) {
							field173 = field173.substring(0, field173.length() - 1);
							field232 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field418 = false;
							field232 = true;

							if (field121 == 1) {
								long var2 = FBIFPAXF.method268(field173);
								method69(var2);
							}

							if (field121 == 2 && field397 > 0) {
								long var4 = FBIFPAXF.method268(field173);
								method46(var4);
							}

							if (field121 == 3 && field173.length() > 0) {
								field292.method391(226);
								field292.method392(0);
								int var6 = field292.field902;
								field292.method398(field383);
								GTOTZKQF.method316(field292, field173);
								field292.method401(field292.field902 - var6);
								field173 = GTOTZKQF.method317(field173);
								field173 = NBTRSNNF.method470(field173);
								method131(FBIFPAXF.method272(FBIFPAXF.method269(field383)), 6, field173);

								if (field371 == 2) {
									field371 = 1;
									field89 = true;
									field292.method391(39);
									field292.method392(field67);
									field292.method392(field371);
									field292.method392(field440);
								}
							}

							if (field121 == 4 && field225 < 100) {
								long var7 = FBIFPAXF.method268(field173);
								method151(var7);
							}

							if (field121 == 5 && field225 > 0) {
								long var9 = FBIFPAXF.method268(field173);
								method57(var9);
							}
						}
					} else if (field106 == 1) {
						if (var1 >= 48 && var1 <= 57 && field454.length() < 10) {
							field454 = field454 + (char) var1;
							field232 = true;
						}

						if (var1 == 8 && field454.length() > 0) {
							field454 = field454.substring(0, field454.length() - 1);
							field232 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field454.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field454);
								} catch (Exception var21) {
								}

								field292.method391(98);
								field292.method396(var11);
							}

							field106 = 0;
							field232 = true;
						}
					} else if (field106 == 2) {
						if (var1 >= 32 && var1 <= 122 && field454.length() < 12) {
							field454 = field454 + (char) var1;
							field232 = true;
						}

						if (var1 == 8 && field454.length() > 0) {
							field454 = field454.substring(0, field454.length() - 1);
							field232 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field454.length() > 0) {
								field292.method391(13);
								field292.method398(FBIFPAXF.method268(field454));
							}

							field106 = 0;
							field232 = true;
						}
					} else if (field120 == -1) {
						if (var1 >= 32 && var1 <= 122 && field147.length() < 80) {
							field147 = field147 + (char) var1;
							field232 = true;
						}

						if (var1 == 8 && field147.length() > 0) {
							field147 = field147.substring(0, field147.length() - 1);
							field232 = true;
						}

						if ((var1 == 13 || var1 == 10) && field147.length() > 0) {
							if (field131 == 2) {
								if (field147.equals("::clientdrop")) {
									method13();
								}

								if (field147.equals("::lag")) {
									method70();
								}

								if (field147.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field97.method295(2); var12++) {
										field97.method283(var12, (byte) 1, 2);
									}
								}

								if (field147.equals("::fpson")) {
									field212 = true;
								}

								if (field147.equals("::fpsoff")) {
									field212 = false;
								}

								if (field147.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field431[var13].field615[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field147.startsWith("::")) {
								field292.method391(135);
								field292.method392(field147.length() - 1);
								field292.method399(field147.substring(2));
							} else {
								String var16 = field147.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field147 = field147.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field147 = field147.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field147 = field147.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field147 = field147.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field147 = field147.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field147 = field147.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field147 = field147.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field147 = field147.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field147 = field147.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field147 = field147.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field147 = field147.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field147 = field147.substring(6);
								}

								String var18 = field147.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field147 = field147.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field147 = field147.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field147 = field147.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field147 = field147.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field147 = field147.substring(6);
								}

								field292.method391(100);
								field292.method392(0);
								int var20 = field292.field902;
								field393.field902 = 0;
								GTOTZKQF.method316(field393, field147);
								field292.method438(field393.field902, field393.field901, 0);
								field292.method419(var19);
								field292.method419(var17);
								field292.method401(field292.field902 - var20);
								field147 = GTOTZKQF.method317(field147);
								field147 = NBTRSNNF.method470(field147);
								field119.field1435 = field147;
								field119.field1430 = var17;
								field119.field1388 = var19;
								field119.field1441 = 150;

								if (field131 == 2) {
									method131("@cr2@" + field119.field16, 2, field119.field1435);
								} else if (field131 == 1) {
									method131("@cr1@" + field119.field16, 2, field119.field1435);
								} else {
									method131(field119.field16, 2, field119.field1435);
								}

								if (field67 == 2) {
									field67 = 3;
									field89 = true;
									field292.method391(39);
									field292.method392(field67);
									field292.method392(field371);
									field292.method392(field440);
								}
							}

							field147 = "";
							field232 = true;
						}
					}
				}

				if (var1 == 8 && field98.length() > 0) {
					field98 = field98.substring(0, field98.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field98.length() < 12) {
				field98 = field98 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(Z[BB)V")
	public final void method22(boolean arg0, byte[] arg1) {
		if (field149) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method23(String arg0, int arg1) {
		field402 = arg1;
		field445 = arg0;
		method51();

		if (field213 == null) {
			super.method23(arg0, arg1);
		} else {
			field411.method529();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field349.method253("RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			SXFSGYHA.method522(0x8C1111, var3 / 2 - 152, 304, 34, var6);
			SXFSGYHA.method522(0, var3 / 2 - 151, 302, 32, var6 + 1);
			SXFSGYHA.method521(0x8C1111, arg1 * 3, var3 / 2 - 150, var6 + 2, 30);
			SXFSGYHA.method521(0, 300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), var6 + 2, 30);
			field349.method253(arg0, var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF);
			field411.method530(171, 202, field817);

			if (field401) {
				field401 = false;

				if (!field358) {
					field412.method530(0, 0, field817);
					field413.method530(0, 637, field817);
				}

				field409.method530(0, 128, field817);
				field410.method530(371, 202, field817);
				field414.method530(265, 0, field817);
				field415.method530(265, 562, field817);
				field416.method530(171, 128, field817);
				field417.method530(171, 562, field817);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method24() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = HEQROJXW.field780[var7];
			int var13 = HEQROJXW.field781[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = HEQROJXW.field780[var8];
			int var16 = HEQROJXW.field781[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field113 = arg2 - var9;
		field114 = arg5 - var10;
		field115 = arg0 - var11;
		field116 = arg4;
		field117 = arg3;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method26() {
		for (int var1 = 0; var1 < field395; var1++) {
			int var2 = field396[var1];
			TVKIEQYR var3 = field394[var2];
			if (var3 != null) {
				method27(var3.field1135.field1455, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IZLZGJLFNLC;)V")
	public final void method27(int arg0, ZGJLFNLC arg1) {
		if (arg1.field1391 < 128 || arg1.field1392 < 128 || arg1.field1391 >= 13184 || arg1.field1392 >= 13184) {
			arg1.field1436 = -1;
			arg1.field1409 = -1;
			arg1.field1420 = 0;
			arg1.field1421 = 0;
			arg1.field1391 = arg1.field1389[0] * 128 + arg1.field1414 * 64;
			arg1.field1392 = arg1.field1390[0] * 128 + arg1.field1414 * 64;
			arg1.method575();
		}

		if (field119 == arg1 && (arg1.field1391 < 1536 || arg1.field1392 < 1536 || arg1.field1391 >= 11776 || arg1.field1392 >= 11776)) {
			arg1.field1436 = -1;
			arg1.field1409 = -1;
			arg1.field1420 = 0;
			arg1.field1421 = 0;
			arg1.field1391 = arg1.field1389[0] * 128 + arg1.field1414 * 64;
			arg1.field1392 = arg1.field1390[0] * 128 + arg1.field1414 * 64;
			arg1.method575();
		}

		if (arg1.field1420 > field221) {
			method28(arg1);
		} else if (arg1.field1421 >= field221) {
			method29(arg1);
		} else {
			method30(arg1);
		}

		method31(arg1);
		method32(arg1);
	}

	@ObfuscatedName("client.a(LZGJLFNLC;I)V")
	public final void method28(ZGJLFNLC arg0) {
		int var2 = arg0.field1420 - field221;
		int var3 = arg0.field1416 * 128 + arg0.field1414 * 64;
		int var4 = arg0.field1418 * 128 + arg0.field1414 * 64;
		arg0.field1391 += (var3 - arg0.field1391) / var2;
		arg0.field1392 += (var4 - arg0.field1392) / var2;
		arg0.field1415 = 0;

		if (arg0.field1422 == 0) {
			arg0.field1434 = 1024;
		}

		if (arg0.field1422 == 1) {
			arg0.field1434 = 1536;
		}

		if (arg0.field1422 == 2) {
			arg0.field1434 = 0;
		}

		if (arg0.field1422 == 3) {
			arg0.field1434 = 512;
		}
	}

	@ObfuscatedName("client.a(LZGJLFNLC;B)V")
	public final void method29(ZGJLFNLC arg0) {
		if (field221 == arg0.field1421 || arg0.field1436 == -1 || arg0.field1439 != 0 || arg0.field1438 + 1 > XKEHWKFH.field1362[arg0.field1436].method566(arg0.field1437)) {
			int var2 = arg0.field1421 - arg0.field1420;
			int var3 = field221 - arg0.field1420;
			int var4 = arg0.field1416 * 128 + arg0.field1414 * 64;
			int var5 = arg0.field1418 * 128 + arg0.field1414 * 64;
			int var6 = arg0.field1417 * 128 + arg0.field1414 * 64;
			int var7 = arg0.field1419 * 128 + arg0.field1414 * 64;
			arg0.field1391 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1392 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1415 = 0;

		if (arg0.field1422 == 0) {
			arg0.field1434 = 1024;
		}

		if (arg0.field1422 == 1) {
			arg0.field1434 = 1536;
		}

		if (arg0.field1422 == 2) {
			arg0.field1434 = 0;
		}

		if (arg0.field1422 == 3) {
			arg0.field1434 = 512;
		}

		arg0.field1393 = arg0.field1434;
	}

	@ObfuscatedName("client.a(ILZGJLFNLC;)V")
	public final void method30(ZGJLFNLC arg0) {
		arg0.field1395 = arg0.field1402;
		if (arg0.field1394 == 0) {
			arg0.field1415 = 0;
		} else {
			if (arg0.field1436 != -1 && arg0.field1439 == 0) {
				XKEHWKFH var2 = XKEHWKFH.field1362[arg0.field1436];
				if (arg0.field1432 > 0 && var2.field1374 == 0) {
					arg0.field1415++;
					return;
				}

				if (arg0.field1432 <= 0 && var2.field1375 == 0) {
					arg0.field1415++;
					return;
				}
			}

			int var3 = arg0.field1391;
			int var4 = arg0.field1392;
			int var5 = arg0.field1389[arg0.field1394 - 1] * 128 + arg0.field1414 * 64;
			int var6 = arg0.field1390[arg0.field1394 - 1] * 128 + arg0.field1414 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1434 = 1280;
					} else if (var4 > var6) {
						arg0.field1434 = 1792;
					} else {
						arg0.field1434 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1434 = 768;
					} else if (var4 > var6) {
						arg0.field1434 = 256;
					} else {
						arg0.field1434 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1434 = 1024;
				} else {
					arg0.field1434 = 0;
				}

				int var7 = arg0.field1434 - arg0.field1393 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1424;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1423;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1426;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1425;
				}

				if (var8 == -1) {
					var8 = arg0.field1423;
				}

				arg0.field1395 = var8;
				int var9 = 4;
				if (arg0.field1434 != arg0.field1393 && arg0.field1431 == -1 && arg0.field1405 != 0) {
					var9 = 2;
				}

				if (arg0.field1394 > 2) {
					var9 = 6;
				}

				if (arg0.field1394 > 3) {
					var9 = 8;
				}

				if (arg0.field1415 > 0 && arg0.field1394 > 1) {
					var9 = 8;
					arg0.field1415--;
				}

				if (arg0.field1401[arg0.field1394 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1423 == arg0.field1395 && arg0.field1427 != -1) {
					arg0.field1395 = arg0.field1427;
				}

				if (var3 < var5) {
					arg0.field1391 += var9;
					if (arg0.field1391 > var5) {
						arg0.field1391 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1391 -= var9;
					if (arg0.field1391 < var5) {
						arg0.field1391 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1392 += var9;
					if (arg0.field1392 > var6) {
						arg0.field1392 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1392 -= var9;
					if (arg0.field1392 < var6) {
						arg0.field1392 = var6;
					}
				}

				if (arg0.field1391 == var5 && arg0.field1392 == var6) {
					arg0.field1394--;

					if (arg0.field1432 > 0) {
						arg0.field1432--;
						return;
					}
				}
			} else {
				arg0.field1391 = var5;
				arg0.field1392 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LZGJLFNLC;B)V")
	public final void method31(ZGJLFNLC arg0) {
		if (arg0.field1405 != 0) {
			if (arg0.field1431 != -1 && arg0.field1431 < 32768) {
				TVKIEQYR var2 = field394[arg0.field1431];
				if (var2 != null) {
					int var3 = arg0.field1391 - var2.field1391;
					int var4 = arg0.field1392 - var2.field1392;
					if (var3 != 0 || var4 != 0) {
						arg0.field1434 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1431 >= 32768) {
				int var5 = arg0.field1431 - 32768;
				if (field72 == var5) {
					var5 = field252;
				}

				AHUILQJH var6 = field253[var5];
				if (var6 != null) {
					int var7 = arg0.field1391 - var6.field1391;
					int var8 = arg0.field1392 - var6.field1392;
					if (var7 != 0 || var8 != 0) {
						arg0.field1434 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1428 != 0 || arg0.field1429 != 0) && (arg0.field1394 == 0 || arg0.field1415 > 0)) {
				int var9 = arg0.field1391 - (arg0.field1428 - field202 - field202) * 64;
				int var10 = arg0.field1392 - (arg0.field1429 - field203 - field203) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1434 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1428 = 0;
				arg0.field1429 = 0;
			}

			int var11 = arg0.field1434 - arg0.field1393 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1405 || var11 > 2048 - arg0.field1405) {
					arg0.field1393 = arg0.field1434;
				} else if (var11 > 1024) {
					arg0.field1393 -= arg0.field1405;
				} else {
					arg0.field1393 += arg0.field1405;
				}

				arg0.field1393 &= 0x7FF;
				if (arg0.field1402 == arg0.field1395 && arg0.field1434 != arg0.field1393) {
					if (arg0.field1403 != -1) {
						arg0.field1395 = arg0.field1403;
						return;
					}

					arg0.field1395 = arg0.field1423;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLZGJLFNLC;)V")
	public final void method32(ZGJLFNLC arg0) {
		arg0.field1433 = false;

		if (arg0.field1395 != -1) {
			XKEHWKFH var2 = XKEHWKFH.field1362[arg0.field1395];
			arg0.field1397++;
			if (arg0.field1396 < var2.field1363 && arg0.field1397 > var2.method566(arg0.field1396)) {
				arg0.field1397 = 0;
				arg0.field1396++;
			}

			if (arg0.field1396 >= var2.field1363) {
				arg0.field1397 = 0;
				arg0.field1396 = 0;
			}
		}

		if (arg0.field1409 != -1 && field221 >= arg0.field1412) {
			if (arg0.field1410 < 0) {
				arg0.field1410 = 0;
			}

			XKEHWKFH var3 = UIVLSYQW.field1152[arg0.field1409].field1156;
			arg0.field1411++;
			while (arg0.field1410 < var3.field1363 && arg0.field1411 > var3.method566(arg0.field1410)) {
				arg0.field1411 -= var3.method566(arg0.field1410);
				arg0.field1410++;
			}

			if (arg0.field1410 >= var3.field1363 && (arg0.field1410 < 0 || arg0.field1410 >= var3.field1363)) {
				arg0.field1409 = -1;
			}
		}

		if (arg0.field1436 != -1 && arg0.field1439 <= 1) {
			XKEHWKFH var4 = XKEHWKFH.field1362[arg0.field1436];
			if (var4.field1374 == 1 && arg0.field1432 > 0 && arg0.field1420 <= field221 && arg0.field1421 < field221) {
				arg0.field1439 = 1;
				return;
			}
		}

		if (arg0.field1436 != -1 && arg0.field1439 == 0) {
			XKEHWKFH var5 = XKEHWKFH.field1362[arg0.field1436];
			arg0.field1438++;
			while (arg0.field1437 < var5.field1363 && arg0.field1438 > var5.method566(arg0.field1437)) {
				arg0.field1438 -= var5.method566(arg0.field1437);
				arg0.field1437++;
			}

			if (arg0.field1437 >= var5.field1363) {
				arg0.field1437 -= var5.field1367;
				arg0.field1440++;
				if (arg0.field1440 >= var5.field1373) {
					arg0.field1436 = -1;
				}

				if (arg0.field1437 < 0 || arg0.field1437 >= var5.field1363) {
					arg0.field1436 = -1;
				}
			}

			arg0.field1433 = var5.field1369;
		}

		if (arg0.field1439 > 0) {
			arg0.field1439--;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method33() {
		if (field401) {
			field401 = false;
			field58.method530(4, 0, field817);
			field59.method530(357, 0, field817);
			field60.method530(4, 722, field817);
			field61.method530(205, 743, field817);
			field62.method530(0, 0, field817);
			field63.method530(4, 516, field817);
			field64.method530(205, 516, field817);
			field65.method530(357, 496, field817);
			field66.method530(338, 0, field817);
			field161 = true;
			field232 = true;
			field123 = true;
			field89 = true;

			if (field380 != 2) {
				field83.method530(4, 4, field817);
				field82.method530(4, 550, field817);
			}
		}

		if (field380 == 2) {
			method129();
		}

		if (field306 && field295 == 1) {
			field161 = true;
		}

		if (field125 != -1) {
			boolean var1 = method20(field125, field369);
			if (var1) {
				field161 = true;
			}
		}

		if (field314 == 2) {
			field161 = true;
		}

		if (field192 == 2) {
			field161 = true;
		}

		if (field161) {
			method96();
			field161 = false;
		}

		if (field120 == -1) {
			field42.field1201 = field201 - field230 - 77;

			if (field825 > 448 && field825 < 560 && field826 > 332) {
				method122(field825 - 17, 0, field826 - 357, 463, 77, field42, false, field201);
			}

			int var2 = field201 - field42.field1201 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field201 - 77) {
				var2 = field201 - 77;
			}

			if (field230 != var2) {
				field230 = var2;
				field232 = true;
			}
		}

		if (field120 != -1) {
			boolean var3 = method20(field120, field369);
			if (var3) {
				field232 = true;
			}
		}

		if (field314 == 3) {
			field232 = true;
		}

		if (field192 == 3) {
			field232 = true;
		}

		if (field69 != null) {
			field232 = true;
		}

		if (field306 && field295 == 2) {
			field232 = true;
		}

		if (field232) {
			method144();
			field232 = false;
		}

		if (field380 == 2) {
			method93();
			field82.method530(4, 550, field817);
		}

		if (field406 != -1) {
			field123 = true;
		}

		if (field123) {
			if (field406 != -1 && field406 == field315) {
				field406 = -1;
				field292.method391(37);
				field292.method392(field315);
			}

			field123 = false;
			field290.method529();
			field217.method446(0, 0);

			if (field125 == -1) {
				if (field334[field315] != -1) {
					if (field315 == 0) {
						field107.method446(10, 22);
					}

					if (field315 == 1) {
						field108.method446(8, 54);
					}

					if (field315 == 2) {
						field108.method446(8, 82);
					}

					if (field315 == 3) {
						field109.method446(8, 110);
					}

					if (field315 == 4) {
						field111.method446(8, 153);
					}

					if (field315 == 5) {
						field111.method446(8, 181);
					}

					if (field315 == 6) {
						field110.method446(9, 209);
					}
				}

				if (field334[0] != -1 && (field406 != 0 || field221 % 20 < 10)) {
					field55[0].method446(13, 29);
				}

				if (field334[1] != -1 && (field406 != 1 || field221 % 20 < 10)) {
					field55[1].method446(11, 53);
				}

				if (field334[2] != -1 && (field406 != 2 || field221 % 20 < 10)) {
					field55[2].method446(11, 82);
				}

				if (field334[3] != -1 && (field406 != 3 || field221 % 20 < 10)) {
					field55[3].method446(12, 115);
				}

				if (field334[4] != -1 && (field406 != 4 || field221 % 20 < 10)) {
					field55[4].method446(13, 153);
				}

				if (field334[5] != -1 && (field406 != 5 || field221 % 20 < 10)) {
					field55[5].method446(11, 180);
				}

				if (field334[6] != -1 && (field406 != 6 || field221 % 20 < 10)) {
					field55[6].method446(13, 208);
				}
			}

			field290.method530(160, 516, field817);
			field404++;
			if (field404 > 88) {
				field404 = 0;
				field292.method391(222);
			}

			field289.method529();
			field216.method446(0, 0);

			if (field125 == -1) {
				if (field334[field315] != -1) {
					if (field315 == 7) {
						field278.method446(0, 42);
					}

					if (field315 == 8) {
						field279.method446(0, 74);
					}

					if (field315 == 9) {
						field279.method446(0, 102);
					}

					if (field315 == 10) {
						field280.method446(1, 130);
					}

					if (field315 == 11) {
						field282.method446(0, 173);
					}

					if (field315 == 12) {
						field282.method446(0, 201);
					}

					if (field315 == 13) {
						field281.method446(0, 229);
					}
				}

				if (field334[8] != -1 && (field406 != 8 || field221 % 20 < 10)) {
					field55[7].method446(2, 74);
				}

				if (field334[9] != -1 && (field406 != 9 || field221 % 20 < 10)) {
					field55[8].method446(3, 102);
				}

				if (field334[10] != -1 && (field406 != 10 || field221 % 20 < 10)) {
					field55[9].method446(4, 137);
				}

				if (field334[11] != -1 && (field406 != 11 || field221 % 20 < 10)) {
					field55[10].method446(2, 174);
				}

				if (field334[12] != -1 && (field406 != 12 || field221 % 20 < 10)) {
					field55[11].method446(2, 201);
				}

				if (field334[13] != -1 && (field406 != 13 || field221 % 20 < 10)) {
					field55[12].method446(2, 226);
				}
			}

			field289.method530(466, 496, field817);
			field83.method529();
		}

		if (field89) {
			field89 = false;
			field288.method529();
			field215.method446(0, 0);
			field348.method254(55, 28, 0xFFFFFF, "Public chat", true);

			if (field67 == 0) {
				field348.method254(55, 41, 0xFF00, "On", true);
			}

			if (field67 == 1) {
				field348.method254(55, 41, 0xFFFF00, "Friends", true);
			}

			if (field67 == 2) {
				field348.method254(55, 41, 0xFF0000, "Off", true);
			}

			if (field67 == 3) {
				field348.method254(55, 41, 0xFFFF, "Hide", true);
			}

			field348.method254(184, 28, 0xFFFFFF, "Private chat", true);

			if (field371 == 0) {
				field348.method254(184, 41, 0xFF00, "On", true);
			}

			if (field371 == 1) {
				field348.method254(184, 41, 0xFFFF00, "Friends", true);
			}

			if (field371 == 2) {
				field348.method254(184, 41, 0xFF0000, "Off", true);
			}

			field348.method254(324, 28, 0xFFFFFF, "Trade/compete", true);

			if (field440 == 0) {
				field348.method254(324, 41, 0xFF00, "On", true);
			}

			if (field440 == 1) {
				field348.method254(324, 41, 0xFFFF00, "Friends", true);
			}

			if (field440 == 2) {
				field348.method254(324, 41, 0xFF0000, "Off", true);
			}

			field348.method254(458, 33, 0xFFFFFF, "Report abuse", true);
			field288.method530(453, 0, field817);
			field83.method529();
		}

		field369 = 0;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method34(int arg0) {
		if (!field365) {
			if (GSZOCBMU.field704[17] >= arg0) {
				LKEIRLLI var2 = GSZOCBMU.field698[17];
				int var3 = var2.field917 * var2.field916 - 1;
				int var4 = field369 * var2.field916 * 2;
				byte[] var5 = var2.field914;
				byte[] var6 = field85;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field914 = var6;
				field85 = var5;
				GSZOCBMU.method305(17);
			}

			if (GSZOCBMU.field704[24] >= arg0) {
				LKEIRLLI var8 = GSZOCBMU.field698[24];
				int var9 = var8.field917 * var8.field916 - 1;
				int var10 = field369 * var8.field916 * 2;
				byte[] var11 = var8.field914;
				byte[] var12 = field85;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field914 = var12;
				field85 = var11;
				GSZOCBMU.method305(24);
			}

			if (GSZOCBMU.field704[34] >= arg0) {
				LKEIRLLI var14 = GSZOCBMU.field698[34];
				int var15 = var14.field917 * var14.field916 - 1;
				int var16 = field369 * var14.field916 * 2;
				byte[] var17 = var14.field914;
				byte[] var18 = field85;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field914 = var18;
				field85 = var17;
				GSZOCBMU.method305(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method35(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field188[var4] != null) {
				int var5 = field186[var4];
				int var6 = field230 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field187[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field67 == 0 || field67 == 1 && method36(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field119.field16)) {
						if (field131 >= 1) {
							field163[field367] = "Report abuse @whi@" + var7;
							field318[field367] = 200;
							field367++;
						}

						field163[field367] = "Add ignore @whi@" + var7;
						field318[field367] = 76;
						field367++;
						field163[field367] = "Add friend @whi@" + var7;
						field318[field367] = 394;
						field367++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field444 == 0 && (var5 == 7 || field371 == 0 || field371 == 1 && method36(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field131 >= 1) {
							field163[field367] = "Report abuse @whi@" + var7;
							field318[field367] = 200;
							field367++;
						}

						field163[field367] = "Add ignore @whi@" + var7;
						field318[field367] = 76;
						field367++;
						field163[field367] = "Add friend @whi@" + var7;
						field318[field367] = 394;
						field367++;
					}

					var3++;
				}

				if (var5 == 4 && (field440 == 0 || field440 == 1 && method36(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field163[field367] = "Accept trade @whi@" + var7;
						field318[field367] = 762;
						field367++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field444 == 0 && field371 < 2) {
					var3++;
				}

				if (var5 == 8 && (field440 == 0 || field440 == 1 && method36(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field163[field367] = "Accept challenge @whi@" + var7;
						field318[field367] = 680;
						field367++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method36(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field397; var2++) {
			if (arg0.equalsIgnoreCase(field177[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field119.field16)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method37() {
		signlink.reporterror = false;

		try {
			if (field249 != null) {
				field249.method227();
			}
		} catch (Exception var1) {
		}

		field249 = null;
		method24();

		if (field453 != null) {
			field453.field843 = false;
		}

		field453 = null;
		field97.method282();
		field97 = null;
		field393 = null;
		field292 = null;
		field439 = null;
		field366 = null;
		field342 = null;
		field154 = null;
		field438 = null;
		field343 = null;
		field344 = null;
		field259 = null;
		field425 = null;
		field158 = null;
		field431 = null;
		field457 = null;
		field234 = null;
		field345 = null;
		field346 = null;
		field85 = null;
		field81 = null;
		field82 = null;
		field83 = null;
		field84 = null;
		field288 = null;
		field289 = null;
		field290 = null;
		field58 = null;
		field59 = null;
		field60 = null;
		field61 = null;
		field62 = null;
		field63 = null;
		field64 = null;
		field65 = null;
		field66 = null;
		field43 = null;
		field44 = null;
		field45 = null;
		field215 = null;
		field216 = null;
		field217 = null;
		field55 = null;
		field107 = null;
		field108 = null;
		field109 = null;
		field110 = null;
		field111 = null;
		field278 = null;
		field279 = null;
		field280 = null;
		field281 = null;
		field282 = null;
		field195 = null;
		field87 = null;
		field374 = null;
		field330 = null;
		field426 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field430 = null;
		field235 = null;
		field178 = null;
		field206 = null;
		field253 = null;
		field255 = null;
		field257 = null;
		field258 = null;
		field361 = null;
		field394 = null;
		field396 = null;
		field372 = null;
		field227 = null;
		field332 = null;
		field284 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field319 = null;
		field163 = null;
		field405 = null;
		field210 = null;
		field211 = null;
		field373 = null;
		field266 = null;
		field177 = null;
		field435 = null;
		field100 = null;
		field412 = null;
		field413 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field414 = null;
		field415 = null;
		field416 = null;
		field417 = null;
		method134();
		USIJLMTP.method553();
		ZNUYRYPY.method592();
		KNYKYROC.method384();
		WDDURNZH.field1333 = null;
		YMQGRGSI.field1381 = null;
		ULLVQOAK.field1172 = null;
		WPQLQPCK.field1345 = null;
		XKEHWKFH.field1362 = null;
		UIVLSYQW.field1152 = null;
		UIVLSYQW.field1164 = null;
		EEUUOAGX.field584 = null;
		field818 = null;
		AHUILQJH.field1 = null;
		GSZOCBMU.method298();
		DLDGGHZP.method157();
		HEQROJXW.method318();
		UEUSJYYO.method534();
		System.gc();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method38() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field145[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field145[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field146[var10] = (field145[var10 - 1] + field145[var10 + 1] + field145[var10 - 128] + field145[var10 + 128]) / 4;
			}
		}

		field143 += 128;
		if (field143 > field449.length) {
			field143 -= field449.length;
			int var11 = (int) (Math.random() * 12.0D);
			method126(field304[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field146[var14 + 128] - field449[field143 + var14 & field449.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field145[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field287[var16] = field287[var16 + 1];
		}

		field287[var1 - 1] = (int) (Math.sin(field221 / 14.0D) * 16.0D + Math.sin(field221 / 15.0D) * 14.0D + Math.sin(field221 / 16.0D) * 12.0D);

		if (field309 > 0) {
			field309 -= 4;
		}

		if (field310 > 0) {
			field310 -= 4;
		}

		if (field309 == 0 && field310 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field309 = 1024;
			}

			if (var17 == 1) {
				field310 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field320.method446(arg4, arg2);
		field321.method446(arg3 + arg4 - 16, arg2);
		SXFSGYHA.method521(field241, 16, arg2, arg4 + 16, arg3 - 32);
		int var6 = (arg3 - 32) * arg3 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg1 / (arg0 - arg3);
		SXFSGYHA.method521(field228, 16, arg2, arg4 + var7 + 16, var6);
		SXFSGYHA.method526(field102, var6, arg2, arg4 + var7 + 16);
		SXFSGYHA.method526(field102, var6, arg2 + 1, arg4 + 16 + var7);
		SXFSGYHA.method524(arg4 + var7 + 16, arg2, field102, 16);
		SXFSGYHA.method524(arg4 + var7 + 17, arg2, field102, 16);
		SXFSGYHA.method526(field351, var6, arg2 + 15, arg4 + 16 + var7);
		SXFSGYHA.method526(field351, var6 - 1, arg2 + 14, arg4 + var7 + 17);
		SXFSGYHA.method524(arg4 + var7 + var6 + 15, arg2, field351, 16);
		SXFSGYHA.method524(arg4 + var7 + var6 + 14, arg2 + 1, field351, 15);
	}

	@ObfuscatedName("client.a(BZI)V")
	public final void method40(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method41() {
		if (field77 > 1) {
			field77--;
		}

		if (field392 > 0) {
			field392--;
		}

		for (int var1 = 0; var1 < 5 && method117(); var1++) {
		}

		if (field285) {
			synchronized (field453.field845) {
				if (!field207) {
					field453.field846 = 0;
				} else if (field831 != 0 || field453.field846 >= 40) {
					field292.method391(129);
					field292.method392(0);
					int var3 = field292.field902;
					int var4 = 0;
					for (int var5 = 0; var5 < field453.field846 && var3 - field292.field902 < 240; var5++) {
						var4++;
						int var6 = field453.field842[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field453.field841[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field453.field842[var5] == -1 && field453.field841[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field127 != var7 || field128 != var6) {
							int var9 = var7 - field127;
							field127 = var7;
							int var10 = var6 - field128;
							field128 = var6;

							if (field385 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field292.method393((field385 << 12) + (var9 << 6) + var10);
								field385 = 0;
							} else if (field385 < 8) {
								field292.method395((field385 << 19) + var8 + 0x800000);
								field385 = 0;
							} else {
								field292.method396((field385 << 19) + var8 - 0x40000000);
								field385 = 0;
							}
						} else if (field385 < 2047) {
							field385++;
						}
					}

					field292.method401(field292.field902 - var3);

					if (var4 >= field453.field846) {
						field453.field846 = 0;
					} else {
						field453.field846 -= var4;
						for (int var11 = 0; var11 < field453.field846; var11++) {
							field453.field841[var11] = field453.field841[var4 + var11];
							field453.field842[var11] = field453.field842[var4 + var11];
						}
					}
				}
			}

			if (field831 != 0) {
				long var12 = (field834 - field277) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field277 = field834;
				int var14 = field833;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field832;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field831 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field292.method391(96);
				field292.method396((var17 << 19) + (var18 << 20) + var16);
			}

			if (field325 > 0) {
				field325--;
			}

			if (field835[1] == 1 || field835[2] == 1 || field835[3] == 1 || field835[4] == 1) {
				field326 = true;
			}

			if (field326 && field325 <= 0) {
				field325 = 20;
				field326 = false;
				field292.method391(35);
				field292.method393(field74);
				field292.method393(field73);
			}

			if (field822 && !field375) {
				field375 = true;
				field292.method391(103);
				field292.method392(1);
			}

			if (!field822 && field375) {
				field375 = false;
				field292.method391(103);
				field292.method392(0);
			}

			method48();
			method53();
			method118();
			field307++;
			if (field307 > 1607) {
				field307 = 0;
				field292.method391(155);
				field292.method392(0);
				int var19 = field292.field902;

				if ((int) (Math.random() * 2.0D) == 0) {
					field292.method393(29516);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field292.method392(34);
				}

				field292.method393((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field292.method392(192);
				}

				field292.method392(228);

				if ((int) (Math.random() * 2.0D) == 0) {
					field292.method393(16924);
				}

				field292.method392(78);
				field292.method392((int) (Math.random() * 256.0D));
				field292.method392(88);
				field292.method393(38427);
				field292.method401(field292.field902 - var19);
			}

			field390++;
			if (field390 > 750) {
				method13();
			}

			method88();
			method26();
			method50();
			field369++;

			if (field37 != 0) {
				field36 += 20;
				if (field36 >= 400) {
					field37 = 0;
				}
			}

			if (field314 != 0) {
				field311++;
				if (field311 >= 15) {
					if (field314 == 2) {
						field161 = true;
					}

					if (field314 == 3) {
						field232 = true;
					}

					field314 = 0;
				}
			}

			if (field192 != 0) {
				field231++;

				if (field825 > field193 + 5 || field825 < field193 - 5 || field826 > field194 + 5 || field826 < field194 - 5) {
					field283 = true;
				}

				if (field824 == 0) {
					if (field192 == 2) {
						field161 = true;
					}

					if (field192 == 3) {
						field232 = true;
					}

					field192 = 0;

					if (field283 && field231 >= 5) {
						field408 = -1;
						method95();

						if (field408 == field190 && field407 != field191) {
							ULLVQOAK var20 = ULLVQOAK.field1172[field190];
							byte var21 = 0;
							if (field447 == 1 && var20.field1188 == 206) {
								var21 = 1;
							}

							if (var20.field1167[field407] <= 0) {
								var21 = 0;
							}

							if (var20.field1170) {
								int var22 = field191;
								int var23 = field407;
								var20.field1167[var23] = var20.field1167[var22];
								var20.field1206[var23] = var20.field1206[var22];
								var20.field1167[var22] = -1;
								var20.field1206[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field191;
								int var25 = field407;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method542(var24, var24 - 1);
										var24--;
									} else if (var24 < var25) {
										var20.method542(var24, var24 + 1);
										var24++;
									}
								}
							} else {
								var20.method542(field191, field407);
							}

							field292.method391(63);
							field292.method418(var21);
							field292.method393(field407);
							field292.method427(field190);
							field292.method428(field191);
						}
					} else if ((field105 == 1 || method148(field367 - 1)) && field367 > 2) {
						method102();
					} else if (field367 > 0) {
						method100(field367 - 1);
					}

					field311 = 10;
					field831 = 0;
				}
			}

			if (DLDGGHZP.field511 != -1) {
				int var26 = DLDGGHZP.field511;
				int var27 = DLDGGHZP.field512;
				boolean var28 = method98(var26, field119.field1389[0], 0, 0, 0, true, 0, 0, var27, 0, field119.field1390[0]);
				DLDGGHZP.field511 = -1;

				if (var28) {
					field34 = field832;
					field35 = field833;
					field37 = 1;
					field36 = 0;
				}
			}

			if (field831 == 1 && field69 != null) {
				field69 = null;
				field232 = true;
				field831 = 0;
			}

			method110();
			method58();
			method16();
			method132();

			if (field824 == 1 || field831 == 1) {
				field378++;
			}

			if (field380 == 2) {
				method121();
			}

			if (field380 == 2 && field322) {
				method101();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field47[var29]++;
			}

			method21();
			field823++;
			if (field823 > 4500) {
				field392 = 250;
				field823 -= 500;
				field292.method391(86);
			}

			field248++;
			if (field248 > 500) {
				field248 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field353 += field354;
				}

				if ((var30 & 0x2) == 2) {
					field70 += field71;
				}

				if ((var30 & 0x4) == 4) {
					field170 += field171;
				}
			}

			if (field353 < -50) {
				field354 = 2;
			}

			if (field353 > 50) {
				field354 = -2;
			}

			if (field70 < -55) {
				field71 = 2;
			}

			if (field70 > 55) {
				field71 = -2;
			}

			if (field170 < -40) {
				field171 = 1;
			}

			if (field170 > 40) {
				field171 = -1;
			}

			field400++;
			if (field400 > 500) {
				field400 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field381 += field382;
				}

				if ((var31 & 0x2) == 2) {
					field238 += field239;
				}
			}

			if (field381 < -60) {
				field382 = 2;
			}

			if (field381 > 60) {
				field382 = -2;
			}

			if (field238 < -20) {
				field239 = 1;
			}

			if (field238 > 10) {
				field239 = -1;
			}

			field308++;
			if (field308 > 107) {
				field308 = 0;
				field292.method391(45);
				field292.method392(4);
			}

			field391++;
			if (field391 > 50) {
				field292.method391(184);
			}

			try {
				if (field249 != null && field292.field902 > 0) {
					field249.method231(field292.field901, field292.field902, 0);
					field292.field902 = 0;
					field391 = 0;
				}
			} catch (IOException var33) {
				method13();
			} catch (Exception var34) {
				method74();
			}
		}
	}

	@ObfuscatedName("client.a(LULLVQOAK;I)Z")
	public final boolean method42(ULLVQOAK arg0) {
		int var2 = arg0.field1188;
		if (field398 == 2) {
			if (var2 == 201) {
				field232 = true;
				field106 = 0;
				field418 = true;
				field173 = "";
				field121 = 1;
				field274 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field232 = true;
				field106 = 0;
				field418 = true;
				field173 = "";
				field121 = 2;
				field274 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field392 = 250;
			return true;
		}

		if (var2 == 501) {
			field232 = true;
			field106 = 0;
			field418 = true;
			field173 = "";
			field121 = 4;
			field274 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field232 = true;
			field106 = 0;
			field418 = true;
			field173 = "";
			field121 = 5;
			field274 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field448[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = YMQGRGSI.field1380 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= YMQGRGSI.field1380) {
							var5 = 0;
						}
					}

					if (!YMQGRGSI.field1381[var5].field1387 && YMQGRGSI.field1381[var5].field1382 == var3 + (field357 ? 0 : 7)) {
						break;
					}
				}

				field448[var3] = var5;
				field333 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field94[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field220[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field220[var6].length) {
					var8 = 0;
				}
			}

			field94[var6] = var8;
			field333 = true;
		}

		if (var2 == 324 && !field357) {
			field357 = true;
			method128();
		}

		if (var2 == 325 && field357) {
			field357 = false;
			method128();
		}

		if (var2 == 326) {
			field292.method391(76);
			field292.method392(field357 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field292.method392(field448[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field292.method392(field94[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field452 = !field452;
		}

		if (var2 >= 601 && var2 <= 612) {
			method89();

			if (field98.length() > 0) {
				field292.method391(66);
				field292.method398(FBIFPAXF.method268(field98));
				field292.method392(var2 - 601);
				field292.method392(field452 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method43() {
		try {
			field331 = -1;
			field284.method455();
			field332.method455();
			GSZOCBMU.method301();
			method115();
			field158.method158();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field431[var1].method240();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field425[var2][var3][var4] = 0;
					}
				}
			}

			HTMZBQHM var5 = new HTMZBQHM(field425, 104, field259, 104);
			int var6 = field154.length;
			field292.method391(184);

			if (!field156) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field342[var7] >> 8) * 64 - field202;
					int var9 = (field342[var7] & 0xFF) * 64 - field203;
					byte[] var10 = field154[var7];
					if (var10 != null) {
						var5.method364(field431, var10, var8, (field182 - 6) * 8, (field181 - 6) * 8, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field342[var11] >> 8) * 64 - field202;
					int var13 = (field342[var11] & 0xFF) * 64 - field203;
					byte[] var14 = field154[var11];
					if (var14 == null && field182 < 800) {
						var5.method362(64, 64, var13, var12);
					}
				}

				field292.method391(184);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field438[var15];
					if (var16 != null) {
						int var17 = (field342[var15] >> 8) * 64 - field202;
						int var18 = (field342[var15] & 0xFF) * 64 - field203;
						var5.method347(var17, field158, var16, field431, var18);
					}
				}
			}

			if (field156) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field54[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field342.length; var28++) {
									if (field342[var28] == var27 && field154[var28] != null) {
										var5.method367(field431, field154[var28], var21 * 8, var20 * 8, var19, var23, (var26 & 0x7) * 8, var24, (var25 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field54[0][var29][var30];
						if (var31 == -1) {
							var5.method362(8, 8, var30 * 8, var29 * 8);
						}
					}
				}

				field292.method391(184);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field54[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field342.length; var41++) {
									if (field342[var41] == var40 && field438[var41] != null) {
										var5.method358((var38 & 0x7) * 8, field431, var37, var32, field158, (var39 & 0x7) * 8, var33 * 8, field438[var41], var34 * 8, var36);
										break;
									}
								}
							}
						}
					}
				}
			}

			field292.method391(184);
			var5.method348(field158, field431);
			field83.method529();
			field292.method391(184);
			int var42 = HTMZBQHM.field798;
			if (var42 > field273) {
				var42 = field273;
			}

			if (var42 < field273 - 1) {
				int var43 = field273 - 1;
			}

			if (field365) {
				field158.method159(HTMZBQHM.field798);
			} else {
				field158.method159(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method54(var44, var45);
				}
			}

			field260++;
			if (field260 > 126) {
				field260 = 0;
				field292.method391(121);
				field292.method392(109);
			}

			method150();
		} catch (Exception var58) {
		}

		USIJLMTP.field1231.method154();

		if (field820 != null) {
			field292.method391(119);
			field292.method396(1057001181);
		}

		if (field365 && signlink.cache_dat != null) {
			int var47 = field97.method295(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field97.method279(var48);
				if ((var49 & 0x79) == 0) {
					HEQROJXW.method321(var48);
				}
			}
		}

		System.gc();
		GSZOCBMU.method302(20);
		field97.method291();
		int var50 = (field181 - 6) / 8 - 1;
		int var51 = (field181 + 6) / 8 + 1;
		int var52 = (field182 - 6) / 8 - 1;
		int var53 = (field182 + 6) / 8 + 1;
		if (field233) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field97.method285(var55, 0, var54);
					if (var56 != -1) {
						field97.method296(3, var56);
					}

					int var57 = field97.method285(var55, 1, var54);
					if (var57 != -1) {
						field97.method296(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method44() {
		method47();

		if (field37 == 1) {
			field330[field36 / 100].method219(field35 - 8 - 4, field34 - 8 - 4);
		}

		if (field37 == 2) {
			field330[field36 / 100 + 4].method219(field35 - 8 - 4, field34 - 8 - 4);
		}

		if (field104 != -1) {
			method20(field104, field369);
			method140(0, ULLVQOAK.field1172[field104], 0, 0);
		}

		if (field229 != -1) {
			method20(field229, field369);
			method140(0, ULLVQOAK.field1172[field229], 0, 0);
		}

		method14();

		if (!field306) {
			method95();
			method65();
		} else if (field295 == 0) {
			method104();
		}

		if (field305 == 1) {
			field374[1].method219(296, 472);
		}

		if (field212) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field813 < 15) {
				var3 = 0xFF0000;
			}

			field348.method252("Fps:" + field813, var1, var3, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field365) {
				int var7 = 0xFF0000;
			}

			field348.method252("Mem:" + var5 + "k", var1, 0xFFFF00, var2);
			var2 += 15;
		}

		if (field77 != 0) {
			int var8 = field77 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field348.method257(4, "System update in: " + var9 + ":0" + var8, 329, 0xFFFF00);
			} else {
				field348.method257(4, "System update in: " + var9 + ":" + var8, 329, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method45() {
		if (field224 == 0) {
			int var1 = field815 / 2 - 80;
			int var2 = field816 / 2 + 20;
			var2 += 20;
			if (field831 == 1 && field832 >= var1 - 75 && field832 <= var1 + 75 && field833 >= var2 - 20 && field833 <= var2 + 20) {
				field224 = 3;
				field247 = 0;
			}

			int var3 = field815 / 2 + 80;
			if (field831 == 1 && field832 >= var3 - 75 && field832 <= var3 + 75 && field833 >= var2 - 20 && field833 <= var2 + 20) {
				field423 = "";
				field424 = "Enter your username & password.";
				field224 = 2;
				field247 = 0;
			}
		} else if (field224 == 2) {
			int var4 = field816 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field831 == 1 && field833 >= var4 - 15 && field833 < var4) {
				field247 = 0;
			}

			var4 += 15;
			if (field831 == 1 && field833 >= var4 - 15 && field833 < var4) {
				field247 = 1;
			}

			var4 += 15;
			int var5 = field815 / 2 - 80;
			int var6 = field816 / 2 + 50;
			var6 += 20;
			if (field831 == 1 && field832 >= var5 - 75 && field832 <= var5 + 75 && field833 >= var6 - 20 && field833 <= var6 + 20) {
				field432 = 0;
				method77(field95, field96, false);

				if (field285) {
					return;
				}
			}

			int var7 = field815 / 2 + 80;
			if (field831 == 1 && field832 >= var7 - 75 && field832 <= var7 + 75 && field833 >= var6 - 20 && field833 <= var6 + 20) {
				field224 = 0;
				field95 = "";
				field96 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method372();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field267.length(); var10++) {
					if (var8 == field267.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field247 == 0) {
					if (var8 == 8 && field95.length() > 0) {
						field95 = field95.substring(0, field95.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field247 = 1;
					}

					if (var9) {
						field95 = field95 + (char) var8;
					}

					if (field95.length() > 12) {
						field95 = field95.substring(0, 12);
					}
				} else if (field247 == 1) {
					if (var8 == 8 && field96.length() > 0) {
						field96 = field96.substring(0, field96.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field247 = 0;
					}

					if (var9) {
						field96 = field96 + (char) var8;
					}

					if (field96.length() > 20) {
						field96 = field96.substring(0, 20);
					}
				}
			}
		} else if (field224 == 3) {
			int var11 = field815 / 2;
			int var12 = field816 / 2 + 50;
			var12 += 20;
			if (field831 == 1 && field832 >= var11 - 75 && field832 <= var11 + 75 && field833 >= var12 - 20 && field833 <= var12 + 20) {
				field224 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method46(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field397; var3++) {
				if (field435[var3] == arg0) {
					field397--;
					field161 = true;

					for (int var4 = var3; var4 < field397; var4++) {
						field177[var4] = field177[var4 + 1];
						field100[var4] = field100[var4 + 1];
						field435[var4] = field435[var4 + 1];
					}

					field292.method391(205);
					field292.method398(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method47() {
		if (field444 != 0) {
			EYHVDWTF var1 = field348;
			int var2 = 0;
			if (field77 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field188[var3] != null) {
					int var4 = field186[var3];
					String var5 = field187[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field371 == 0 || field371 == 1 && method36(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method257(var8, "From", var7, 0);
						var1.method257(var8, "From", var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method255("From ");
						if (var6 == 1) {
							field218[0].method446(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field218[1].method446(var7 - 12, var11);
							var11 += 14;
						}

						var1.method257(var11, var5 + ": " + field188[var3], var7, 0);
						var1.method257(var11, var5 + ": " + field188[var3], var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field371 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method257(4, field188[var3], var9, 0);
						var1.method257(4, field188[var3], var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field371 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method257(4, "To " + var5 + ": " + field188[var3], var10, 0);
						var1.method257(4, "To " + var5 + ": " + field188[var3], var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method48() {
		if (field365 && field380 == 2 && HTMZBQHM.field806 != field273) {
			field83.method529();
			field348.method253("Loading - please wait.", 257, 151, 0);
			field348.method253("Loading - please wait.", 256, 150, 0xFFFFFF);
			field83.method530(4, 4, field817);
			field380 = 1;
			field387 = System.currentTimeMillis();
		}

		if (field380 == 1) {
			int var1 = method49();
			if (var1 != 0 && System.currentTimeMillis() - field387 > 360000L) {
				signlink.reporterror(field95 + " glcfb " + field103 + "," + var1 + "," + field365 + "," + field155[0] + "," + field97.method280() + "," + field273 + "," + field181 + "," + field182);
				field387 = System.currentTimeMillis();
			}
		}

		if (field380 == 2 && field331 != field273) {
			field331 = field273;
			method97(field273);
		}
	}

	@ObfuscatedName("client.h(B)I")
	public final int method49() {
		for (int var1 = 0; var1 < field154.length; var1++) {
			if (field154[var1] == null && field343[var1] != -1) {
				return -1;
			}

			if (field438[var1] == null && field344[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field154.length; var3++) {
			byte[] var4 = field438[var3];
			if (var4 != null) {
				int var5 = (field342[var3] >> 8) * 64 - field202;
				int var6 = (field342[var3] & 0xFF) * 64 - field203;
				if (field156) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= HTMZBQHM.method354(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field419) {
			return -4;
		} else {
			field380 = 2;
			HTMZBQHM.field806 = field273;
			method43();
			field292.method391(132);
			return 0;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method50() {
		for (int var1 = -1; var1 < field254; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field252;
			} else {
				var2 = field255[var1];
			}

			AHUILQJH var3 = field253[var2];
			if (var3 != null && var3.field1441 > 0) {
				var3.field1441--;
				if (var3.field1441 == 0) {
					var3.field1435 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field395; var4++) {
			int var5 = field396[var4];
			TVKIEQYR var6 = field394[var5];
			if (var6 != null && var6.field1441 > 0) {
				var6.field1441--;
				if (var6.field1441 == 0) {
					var6.field1435 = null;
				}
			}
		}
	}

	public final void run() {
		if (field99) {
			method142();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method51() {
		if (field409 == null) {
			field818 = null;
			field84 = null;
			field82 = null;
			field81 = null;
			field83 = null;
			field288 = null;
			field289 = null;
			field290 = null;
			field412 = new TWKZMYGD(265, 128, method71());
			SXFSGYHA.method519();
			field413 = new TWKZMYGD(265, 128, method71());
			SXFSGYHA.method519();
			field409 = new TWKZMYGD(171, 509, method71());
			SXFSGYHA.method519();
			field410 = new TWKZMYGD(132, 360, method71());
			SXFSGYHA.method519();
			field411 = new TWKZMYGD(200, 360, method71());
			SXFSGYHA.method519();
			field414 = new TWKZMYGD(238, 202, method71());
			SXFSGYHA.method519();
			field415 = new TWKZMYGD(238, 203, method71());
			SXFSGYHA.method519();
			field416 = new TWKZMYGD(94, 74, method71());
			SXFSGYHA.method519();
			field417 = new TWKZMYGD(94, 75, method71());
			SXFSGYHA.method519();

			if (field213 != null) {
				method149();
				method10();
			}

			field401 = true;
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method52(int arg0) {
		int var2 = EEUUOAGX.field584[arg0].field592;
		if (var2 != 0) {
			int var3 = field405[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					GSZOCBMU.method307(0.9D);
				}

				if (var3 == 2) {
					GSZOCBMU.method307(0.8D);
				}

				if (var3 == 3) {
					GSZOCBMU.method307(0.7D);
				}

				if (var3 == 4) {
					GSZOCBMU.method307(0.6D);
				}

				KNYKYROC.field874.method154();
				field401 = true;
			}

			if (var2 == 3) {
				boolean var4 = field149;

				if (var3 == 0) {
					method40(field149, 0);
					field149 = true;
				}

				if (var3 == 1) {
					method40(field149, -400);
					field149 = true;
				}

				if (var3 == 2) {
					method40(field149, -800);
					field149 = true;
				}

				if (var3 == 3) {
					method40(field149, -1200);
					field149 = true;
				}

				if (var3 == 4) {
					field149 = false;
				}

				if (field149 != var4 && !field365) {
					if (field149) {
						field92 = field437;
						field93 = true;
						field97.method284(2, field92);
					} else {
						method24();
					}

					field57 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field78 = true;
					method114(0);
				}

				if (var3 == 1) {
					field78 = true;
					method114(-400);
				}

				if (var3 == 2) {
					field78 = true;
					method114(-800);
				}

				if (var3 == 3) {
					field78 = true;
					method114(-1200);
				}

				if (var3 == 4) {
					field78 = false;
				}
			}

			if (var2 == 5) {
				field105 = var3;
			}

			if (var2 == 6) {
				field185 = var3;
			}

			if (var2 == 8) {
				field444 = var3;
				field232 = true;
			}

			if (var2 == 9) {
				field447 = var3;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method53() {
		if (field380 == 2) {
			for (QXQLENZA var1 = (QXQLENZA) field227.method451(); var1 != null; var1 = (QXQLENZA) field227.method453()) {
				if (var1.field1087 > 0) {
					var1.field1087--;
				}

				if (var1.field1087 != 0) {
					if (var1.field1083 > 0) {
						var1.field1083--;
					}

					if (var1.field1083 == 0 && var1.field1081 >= 1 && var1.field1082 >= 1 && var1.field1081 <= 102 && var1.field1082 <= 102 && (var1.field1084 < 0 || HTMZBQHM.method360(var1.field1086, var1.field1084))) {
						method76(var1.field1085, var1.field1082, var1.field1079, var1.field1080, var1.field1086, var1.field1084, var1.field1081);
						var1.field1083 = -1;

						if (var1.field1084 == var1.field1076 && var1.field1076 == -1) {
							var1.method156();
						} else if (var1.field1084 == var1.field1076 && var1.field1085 == var1.field1077 && var1.field1086 == var1.field1078) {
							var1.method156();
						}
					}
				} else if (var1.field1076 < 0 || HTMZBQHM.method360(var1.field1078, var1.field1076)) {
					method76(var1.field1077, var1.field1082, var1.field1079, var1.field1080, var1.field1078, var1.field1076, var1.field1081);
					var1.method156();
				}
			}

			field456++;
			if (field456 > 55) {
				field456 = 0;
				field292.method391(139);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method54(int arg0, int arg1) {
		LOISKKJJ var3 = field372[field273][arg0][arg1];
		if (var3 == null) {
			field158.method179(field273, arg0, arg1);
		} else {
			int var4 = -99999999;
			XMCAJXJH var5 = null;
			for (XMCAJXJH var6 = (XMCAJXJH) var3.method451(); var6 != null; var6 = (XMCAJXJH) var3.method453()) {
				KNYKYROC var7 = KNYKYROC.method380(var6.field1378);
				int var8 = var7.field866;
				if (var7.field847) {
					var8 = (var6.field1379 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method449(var5);
			XMCAJXJH var9 = null;
			XMCAJXJH var10 = null;
			for (XMCAJXJH var11 = (XMCAJXJH) var3.method451(); var11 != null; var11 = (XMCAJXJH) var3.method453()) {
				if (var5.field1378 != var11.field1378 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1378 != var11.field1378 && var9.field1378 != var11.field1378 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field158.method165(var12, var5, method141(arg1 * 128 + 64, field273, arg0 * 128 + 64), var9, arg0, field273, var10, arg1);
		}
	}

	@ObfuscatedName("client.a(IZILDUMEPGRH;)V")
	public final void method55(int arg0, int arg1, DUMEPGRH arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field74 + field381 & 0x7FF;
			int var6 = HEQROJXW.field780[var5];
			int var7 = HEQROJXW.field781[var5];
			var6 = var6 * 256 / (field238 + 256);
			var7 = var7 * 256 / (field238 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field250.method224(15, 20, 83 - var13 - 20, var12 + 94 + 4 - 10, 256, var10, 15, 20);
		} else {
			method81(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.a(LULLVQOAK;B)Z")
	public final boolean method56(ULLVQOAK arg0) {
		int var2 = arg0.field1188;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field163[field367] = "Remove @whi@" + arg0.field1211;
				field318[field367] = 215;
				field367++;
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

		field163[field367] = "Remove @whi@" + field177[var2];
		field318[field367] = 484;
		field367++;
		field163[field367] = "Message @whi@" + field177[var2];
		field318[field367] = 403;
		field367++;
		return true;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method57(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field225; var3++) {
				if (field300[var3] == arg0) {
					field225--;
					field161 = true;

					for (int var4 = var3; var4 < field225; var4++) {
						field300[var4] = field300[var4 + 1];
					}

					field292.method391(97);
					field292.method398(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method58() {
		if (field53 == 0 && field831 == 1) {
			int var1 = field832 - 25 - 550;
			int var2 = field833 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field74 + field381 & 0x7FF;
				int var4 = GSZOCBMU.field694[var3];
				int var5 = GSZOCBMU.field695[var3];
				var4 = (field238 + 256) * var4 >> 8;
				var5 = (field238 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field119.field1391 + var6 >> 7;
				int var9 = field119.field1392 - var7 >> 7;
				boolean var10 = method98(var8, field119.field1389[0], 0, 0, 0, true, 1, 0, var9, 0, field119.field1390[0]);
				if (var10) {
					field292.method392(var1);
					field292.method392(var2);
					field292.method393(field74);
					field292.method392(57);
					field292.method392(field381);
					field292.method392(field238);
					field292.method392(89);
					field292.method393(field119.field1391);
					field292.method393(field119.field1392);
					field292.method392(field443);
					field292.method392(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method59(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	public final void init() {
		field362 = Integer.parseInt(getParameter("nodeid"));
		field363 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method60();
		} else {
			method62();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field364 = false;
		} else {
			field364 = true;
		}

		method369(765, 503);
	}

	@ObfuscatedName("client.o(I)V")
	public static final void method60() {
		DLDGGHZP.field477 = true;
		GSZOCBMU.field685 = true;
		field365 = true;
		HTMZBQHM.field791 = true;
		USIJLMTP.field1234 = true;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field820 != null) {
				return new URL("http://127.0.0.1:" + (field363 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method61() {
		if (!field46 && !field86 && !field196) {
			field221++;

			if (field285) {
				method41();
			} else {
				method45();
			}

			method94();
		}
	}

	@ObfuscatedName("client.p(I)V")
	public static final void method62() {
		DLDGGHZP.field477 = false;
		GSZOCBMU.field685 = false;
		field365 = false;
		HTMZBQHM.field791 = false;
		USIJLMTP.field1234 = false;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 327);

			if (arg0.length == 5) {
				field362 = Integer.parseInt(arg0[0]);
				field363 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method60();
				} else if (arg0[2].equals("highmem")) {
					method62();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field364 = false;
				} else if (arg0[3].equals("members")) {
					field364 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method368(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method63() {
		if (field352 == 2) {
			method85((field243 - field203 << 7) + field246, field244 * 2, (field242 - field202 << 7) + field245);

			if (field79 > -1 && field221 % 20 < 10) {
				field374[2].method219(field80 - 28, field79 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method64(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method64(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method65() {
		if (field367 >= 2 || field48 != 0 || field38 != 0) {
			String var1;
			if (field48 == 1 && field367 < 2) {
				var1 = "Use " + field52 + " with...";
			} else if (field38 == 1 && field367 < 2) {
				var1 = field41 + "...";
			} else {
				var1 = field163[field367 - 1];
			}

			if (field367 > 2) {
				var1 = var1 + "@whi@ / " + (field367 - 2) + " more options";
			}

			field349.method262(0xFFFFFF, var1, true, 4, field221 / 1000, 15);
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method66(boolean arg0) {
		method51();
		field411.method529();
		field293.method446(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field224 == 0) {
			int var4 = var3 / 2 + 80;
			field347.method254(var2 / 2, var4, 0x75A9A9, field97.field652, true);
			int var5 = var3 / 2 - 20;
			field349.method254(var2 / 2, var5, 0xFFFF00, "Welcome to RuneScape", true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field294.method446(var7 - 20, var6 - 73);
			field349.method254(var6, var7 + 5, 0xFFFFFF, "New User", true);
			int var8 = var2 / 2 + 80;
			field294.method446(var7 - 20, var8 - 73);
			field349.method254(var8, var7 + 5, 0xFFFFFF, "Existing User", true);
		}

		if (field224 == 2) {
			int var9 = var3 / 2 - 40;
			if (field423.length() > 0) {
				field349.method254(var2 / 2, var9 - 15, 0xFFFF00, field423, true);
				field349.method254(var2 / 2, var9, 0xFFFF00, field424, true);
				var9 += 30;
			} else {
				field349.method254(var2 / 2, var9 - 7, 0xFFFF00, field424, true);
				var9 += 30;
			}

			field349.method261(0xFFFFFF, var2 / 2 - 90, true, "Username: " + field95 + (field247 == 0 & field221 % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;
			field349.method261(0xFFFFFF, var2 / 2 - 88, true, "Password: " + FBIFPAXF.method273(field96) + (field247 == 1 & field221 % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field294.method446(var11 - 20, var10 - 73);
				field349.method254(var10, var11 + 5, 0xFFFFFF, "Login", true);
				int var12 = var2 / 2 + 80;
				field294.method446(var11 - 20, var12 - 73);
				field349.method254(var12, var11 + 5, 0xFFFFFF, "Cancel", true);
			}
		}

		if (field224 == 3) {
			field349.method254(var2 / 2, var3 / 2 - 60, 0xFFFF00, "Create a free account", true);
			int var13 = var3 / 2 - 35;
			field349.method254(var2 / 2, var13, 0xFFFFFF, "To create a new account you need to", true);
			var13 += 15;
			field349.method254(var2 / 2, var13, 0xFFFFFF, "go back to the main RuneScape webpage", true);
			var13 += 15;
			field349.method254(var2 / 2, var13, 0xFFFFFF, "and choose the red 'create account'", true);
			var13 += 15;
			field349.method254(var2 / 2, var13, 0xFFFFFF, "button at the top right of that page.", true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field294.method446(var15 - 20, var14 - 73);
			field349.method254(var14, var15 + 5, 0xFFFFFF, "Cancel", true);
		}

		field411.method530(171, 202, field817);

		if (field401) {
			field401 = false;
			field409.method530(0, 128, field817);
			field410.method530(371, 202, field817);
			field414.method530(265, 0, field817);
			field415.method530(265, 562, field817);
			field416.method530(171, 128, field817);
			field417.method530(171, 562, field817);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method67() {
		if (field84 == null) {
			method134();
			field818 = null;
			field409 = null;
			field410 = null;
			field411 = null;
			field412 = null;
			field413 = null;
			field414 = null;
			field415 = null;
			field416 = null;
			field417 = null;
			field84 = new TWKZMYGD(96, 479, method71());
			field82 = new TWKZMYGD(156, 172, method71());
			SXFSGYHA.method519();
			field44.method446(0, 0);
			field81 = new TWKZMYGD(261, 190, method71());
			field83 = new TWKZMYGD(334, 512, method71());
			SXFSGYHA.method519();
			field288 = new TWKZMYGD(50, 496, method71());
			field289 = new TWKZMYGD(37, 269, method71());
			field290 = new TWKZMYGD(45, 249, method71());
			field401 = true;
		}
	}

	@ObfuscatedName("client.a(ILLDILQFVA;I)V")
	public final void method68(LDILQFVA arg0, int arg1) {
		while (arg0.field903 + 10 < arg1 * 8) {
			int var3 = arg0.method413(11);
			if (var3 == 2047) {
				break;
			}

			if (field253[var3] == null) {
				field253[var3] = new AHUILQJH();
				if (field258[var3] != null) {
					field253[var3].method4(field258[var3]);
				}
			}

			field255[field254++] = var3;
			AHUILQJH var4 = field253[var3];
			var4.field1442 = field221;
			int var5 = arg0.method413(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method413(1);
			int var7 = arg0.method413(1);
			if (var7 == 1) {
				field257[field256++] = var3;
			}

			int var8 = arg0.method413(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method577(field119.field1390[0] + var8, var6 == 1, field119.field1389[0] + var5);
		}

		arg0.method414();
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method69(long arg0) {
		if (arg0 != 0L) {
			if (field397 >= 100 && field144 != 1) {
				method131("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field397 >= 200) {
				method131("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = FBIFPAXF.method272(FBIFPAXF.method269(arg0));
				for (int var4 = 0; var4 < field397; var4++) {
					if (field435[var4] == arg0) {
						method131("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field225; var5++) {
					if (field300[var5] == arg0) {
						method131("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field119.field16)) {
					field177[field397] = var3;
					field435[field397] = arg0;
					field100[field397] = 0;
					field397++;
					field161 = true;
					field292.method391(125);
					field292.method398(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void method70() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field384);

		if (field97 != null) {
			System.out.println("Od-cycle:" + field97.field664);
		}

		System.out.println("loop-cycle:" + field221);
		System.out.println("draw-cycle:" + field219);
		System.out.println("ptype:" + field389);
		System.out.println("psize:" + field388);

		if (field249 != null) {
			field249.method232();
		}

		field814 = true;
	}

	@ObfuscatedName("client.b(I)Ljava/awt/Component;")
	public final Component method71() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field820 != null) {
			return field820;
		}

		return this;
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method72(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(LULLVQOAK;IZ)I")
	public final int method73(ULLVQOAK arg0, int arg1) {
		if (arg0.field1225 == null || arg1 >= arg0.field1225.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1225[arg1];
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
					var8 = field159[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field148[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field68[var3[var5++]];
				}

				if (var7 == 4) {
					ULLVQOAK var10 = ULLVQOAK.field1172[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < KNYKYROC.field853 && (!KNYKYROC.method380(var11).field892 || field364)) {
						for (int var12 = 0; var12 < var10.field1167.length; var12++) {
							if (var11 + 1 == var10.field1167[var12]) {
								var8 += var10.field1206[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field405[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field403[field148[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field405[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field119.field10;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < QRJTCTJX.field1073; var13++) {
						if (QRJTCTJX.field1075[var13]) {
							var8 += field148[var13];
						}
					}
				}

				if (var7 == 10) {
					ULLVQOAK var14 = ULLVQOAK.field1172[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < KNYKYROC.field853 && (!KNYKYROC.method380(var15).field892 || field364)) {
						for (int var16 = 0; var16 < var14.field1167.length; var16++) {
							if (var14.field1167[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field208;
				}

				if (var7 == 12) {
					var8 = field122;
				}

				if (var7 == 13) {
					int var17 = field405[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					LPMARHLZ var20 = LPMARHLZ.field925[var19];
					int var21 = var20.field927;
					int var22 = var20.field928;
					int var23 = var20.field929;
					int var24 = field160[var23 - var22];
					var8 = field405[var21] >> var22 & var24;
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
					var8 = (field119.field1391 >> 7) + field202;
				}

				if (var7 == 19) {
					var8 = (field119.field1392 >> 7) + field203;
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

	@ObfuscatedName("client.i(B)V")
	public final void method74() {
		try {
			if (field249 != null) {
				field249.method227();
			}
		} catch (Exception var2) {
		}

		field249 = null;
		field285 = false;
		field224 = 0;
		field95 = "";
		field96 = "";
		method115();
		field158.method158();

		for (int var1 = 0; var1 < 4; var1++) {
			field431[var1].method240();
		}

		System.gc();
		method24();
		field437 = -1;
		field92 = -1;
		field57 = 0;
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field158.method184(arg2, arg0, arg4);
		if (var6 != 0) {
			int var7 = field158.method188(arg2, arg0, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field266.field543;
			int var12 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			USIJLMTP var14 = USIJLMTP.method555(var13);
			if (var14.field1267 == -1) {
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
				LKEIRLLI var15 = field235[var14.field1267];
				if (var15 != null) {
					int var16 = (var14.field1269 * 4 - var15.field916) / 2;
					int var17 = (var14.field1237 * 4 - var15.field917) / 2;
					var15.method446((104 - arg4 - var14.field1237) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field158.method186(arg2, arg0, arg4);
		if (var18 != 0) {
			int var19 = field158.method188(arg2, arg0, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			USIJLMTP var23 = USIJLMTP.method555(var22);
			if (var23.field1267 != -1) {
				LKEIRLLI var24 = field235[var23.field1267];
				if (var24 != null) {
					int var25 = (var23.field1269 * 4 - var24.field916) / 2;
					int var26 = (var23.field1237 * 4 - var24.field917) / 2;
					var24.method446((104 - arg4 - var23.field1237) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field266.field543;
				int var29 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field158.method187(arg2, arg0, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			USIJLMTP var32 = USIJLMTP.method555(var31);
			if (var32.field1267 != -1) {
				LKEIRLLI var33 = field235[var32.field1267];
				if (var33 != null) {
					int var34 = (var32.field1269 * 4 - var33.field916) / 2;
					int var35 = (var32.field1237 * 4 - var33.field917) / 2;
					var33.method446((104 - arg4 - var32.field1237) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
			if (field365 && field273 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field158.method184(arg2, arg6, arg1);
			}

			if (arg3 == 1) {
				var8 = field158.method185(arg2, arg6, arg1);
			}

			if (arg3 == 2) {
				var8 = field158.method186(arg2, arg6, arg1);
			}

			if (arg3 == 3) {
				var8 = field158.method187(arg2, arg6, arg1);
			}

			if (var8 != 0) {
				int var12 = field158.method188(arg2, arg6, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field158.method175(arg1, arg6, arg2);
					USIJLMTP var16 = USIJLMTP.method555(var13);
					if (var16.field1244) {
						field431[arg2].method245(arg1, var16.field1253, arg6, var14, var15);
					}
				}

				if (arg3 == 1) {
					field158.method176(arg6, arg2, arg1);
				}

				if (arg3 == 2) {
					field158.method177(arg2, arg1, arg6);
					USIJLMTP var17 = USIJLMTP.method555(var13);
					if (var17.field1269 + arg6 > 103 || var17.field1269 + arg1 > 103 || var17.field1237 + arg6 > 103 || var17.field1237 + arg1 > 103) {
						return;
					}

					if (var17.field1244) {
						field431[arg2].method246(var17.field1253, var17.field1269, var17.field1237, arg6, var15, arg1);
					}
				}

				if (arg3 == 3) {
					field158.method178(arg6, arg2, arg1);
					USIJLMTP var18 = USIJLMTP.method555(var13);
					if (var18.field1244 && var18.field1242) {
						field431[arg2].method248(arg1, arg6);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field425[1][arg6][arg1] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				HTMZBQHM.method350(field259, arg2, arg1, var19, arg4, field158, arg0, arg5, arg6, field431[arg2]);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method77(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field423 = "";
				field424 = "Connecting to server...";
				method66(true);
			}

			field249 = new EDOAEAIN(method105(field363 + 43594), this);
			long var4 = FBIFPAXF.method268(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field292.field902 = 0;
			field292.method392(14);
			field292.method392(var6);
			field249.method231(field292.field901, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field249.method228();
			}

			int var8 = field249.method228();
			int var9 = var8;

			if (var8 == 0) {
				field249.method230(field366.field901, 0, 8);
				field366.field902 = 0;
				field103 = field366.method408();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field103 >> 32), (int) field103 };
				field292.field902 = 0;
				field292.method392(10);
				field292.method396(var10[0]);
				field292.method396(var10[1]);
				field292.method396(var10[2]);
				field292.method396(var10[3]);
				field292.method396(signlink.uid);
				field292.method399(arg0);
				field292.method399(arg1);
				field292.method417(field368, field101);
				field439.field902 = 0;

				if (arg2) {
					field439.method392(18);
				} else {
					field439.method392(16);
				}

				field439.method392(field292.field902 + 36 + 1 + 1 + 2);
				field439.method392(255);
				field439.method393(327);
				field439.method392(field365 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field439.method396(field328[var11]);
				}

				field439.method400(field292.field902, field292.field901, 0);
				field292.field906 = new KUQMNLGP(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field399 = new KUQMNLGP(var10);
				field249.method231(field439.field901, field439.field902, 0);
				var8 = field249.method228();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method77(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field131 = field249.method228();
				field207 = field249.method228() == 1;
				field277 = 0L;
				field385 = 0;
				field453.field846 = 0;
				field822 = true;
				field375 = true;
				field285 = true;
				field292.field902 = 0;
				field366.field902 = 0;
				field389 = -1;
				field420 = -1;
				field421 = -1;
				field422 = -1;
				field388 = 0;
				field390 = 0;
				field77 = 0;
				field392 = 0;
				field352 = 0;
				field367 = 0;
				field306 = false;
				field823 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field188[var13] = null;
				}

				field48 = 0;
				field38 = 0;
				field380 = 0;
				field386 = 0;
				field353 = (int) (Math.random() * 100.0D) - 50;
				field70 = (int) (Math.random() * 110.0D) - 55;
				field170 = (int) (Math.random() * 80.0D) - 40;
				field381 = (int) (Math.random() * 120.0D) - 60;
				field238 = (int) (Math.random() * 30.0D) - 20;
				field74 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field53 = 0;
				field331 = -1;
				field264 = 0;
				field265 = 0;
				field254 = 0;
				field395 = 0;

				for (int var14 = 0; var14 < field251; var14++) {
					field253[var14] = null;
					field258[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field394[var15] = null;
				}

				field119 = field253[field252] = new AHUILQJH();
				field332.method455();
				field284.method455();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field372[var16][var17][var18] = null;
						}
					}
				}

				field227 = new LOISKKJJ();
				field398 = 0;
				field397 = 0;
				field169 = -1;
				field120 = -1;
				field229 = -1;
				field125 = -1;
				field104 = -1;
				field379 = false;
				field315 = 3;
				field106 = 0;
				field306 = false;
				field418 = false;
				field69 = null;
				field305 = 0;
				field406 = -1;
				field357 = true;
				method128();

				for (int var19 = 0; var19 < 5; var19++) {
					field94[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field183[var20] = null;
					field184[var20] = false;
				}

				field180 = 0;
				field153 = 0;
				field157 = 0;
				field130 = 0;
				field226 = 0;
				field434 = 0;
				method67();
			} else if (var8 == 3) {
				field423 = "";
				field424 = "Invalid username or password.";
			} else if (var8 == 4) {
				field423 = "Your account has been disabled.";
				field424 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field423 = "Your account is already logged in.";
				field424 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field423 = "RuneScape has been updated!";
				field424 = "Please reload this page.";
			} else if (var8 == 7) {
				field423 = "This world is full.";
				field424 = "Please use a different world.";
			} else if (var8 == 8) {
				field423 = "Unable to connect.";
				field424 = "Login server offline.";
			} else if (var8 == 9) {
				field423 = "Login limit exceeded.";
				field424 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field423 = "Unable to connect.";
				field424 = "Bad session id.";
			} else if (var8 == 11) {
				field424 = "Login server rejected session.";
				field424 = "Please try again.";
			} else if (var8 == 12) {
				field423 = "You need a members account to login to this world.";
				field424 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field423 = "Could not complete login.";
				field424 = "Please try using a different world.";
			} else if (var8 == 14) {
				field423 = "The server is being updated.";
				field424 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field285 = true;
				field292.field902 = 0;
				field366.field902 = 0;
				field389 = -1;
				field420 = -1;
				field421 = -1;
				field422 = -1;
				field388 = 0;
				field390 = 0;
				field77 = 0;
				field367 = 0;
				field306 = false;
				field387 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field423 = "Login attempts exceeded.";
				field424 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field423 = "You are standing in a members-only area.";
				field424 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field423 = "Invalid loginserver requested";
				field424 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field249.method228();
				for (var21 += 3; var21 >= 0; var21--) {
					field423 = "You have only just left another world";
					field424 = "Your profile will be transferred in: " + var21;
					method66(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method77(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field423 = "Unexpected server response";
				field424 = "Please try using a different world.";
			} else if (var9 != 0) {
				field423 = "No response from server";
				field424 = "Please try using a different world.";
			} else if (field432 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field432++;
				method77(arg0, arg1, arg2);
			} else {
				field423 = "No response from loginserver";
				field424 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field423 = "";
			field424 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method78(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(LLDILQFVA;II)V")
	public final void method79(LDILQFVA arg0, int arg1) {
		arg0.method412();
		int var3 = arg0.method413(1);
		if (var3 != 0) {
			int var4 = arg0.method413(2);
			if (var4 == 0) {
				field257[field256++] = field252;
			} else if (var4 == 1) {
				int var5 = arg0.method413(3);
				field119.method574(var5, false);
				int var6 = arg0.method413(1);
				if (var6 == 1) {
					field257[field256++] = field252;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method413(3);
				field119.method574(var7, true);
				int var8 = arg0.method413(3);
				field119.method574(var8, true);
				int var9 = arg0.method413(1);
				if (var9 == 1) {
					field257[field256++] = field252;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method413(1);
				int var11 = arg0.method413(1);
				if (var11 == 1) {
					field257[field256++] = field252;
				}

				field273 = arg0.method413(2);
				int var12 = arg0.method413(7);
				int var13 = arg0.method413(7);
				field119.method577(var12, var10 == 1, var13);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		QXQLENZA var10 = null;
		for (QXQLENZA var11 = (QXQLENZA) field227.method451(); var11 != null; var11 = (QXQLENZA) field227.method453()) {
			if (var11.field1079 == arg0 && var11.field1081 == arg5 && var11.field1082 == arg3 && var11.field1080 == arg4) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new QXQLENZA();
			var10.field1079 = arg0;
			var10.field1080 = arg4;
			var10.field1081 = arg5;
			var10.field1082 = arg3;
			method82(var10);
			field227.method448(var10);
		}

		var10.field1084 = arg7;
		var10.field1086 = arg1;
		var10.field1085 = arg8;
		var10.field1083 = arg2;
		var10.field1087 = arg6;
	}

	@ObfuscatedName("client.a(IIILDUMEPGRH;)V")
	public final void method81(int arg0, int arg1, DUMEPGRH arg2) {
		int var4 = field74 + field381 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = HEQROJXW.field780[var4];
			int var7 = HEQROJXW.field781[var4];
			var6 = var6 * 256 / (field238 + 256);
			var7 = var7 * 256 / (field238 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method225(83 - var9 - arg2.field549 / 2 - 4, var8 + 94 - arg2.field548 / 2 + 4, field44);
			} else {
				arg2.method219(83 - var9 - arg2.field549 / 2 - 4, var8 + 94 - arg2.field548 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(LQXQLENZA;I)V")
	public final void method82(QXQLENZA arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1080 == 0) {
			var2 = field158.method184(arg0.field1079, arg0.field1081, arg0.field1082);
		}

		if (arg0.field1080 == 1) {
			var2 = field158.method185(arg0.field1079, arg0.field1081, arg0.field1082);
		}

		if (arg0.field1080 == 2) {
			var2 = field158.method186(arg0.field1079, arg0.field1081, arg0.field1082);
		}

		if (arg0.field1080 == 3) {
			var2 = field158.method187(arg0.field1079, arg0.field1081, arg0.field1082);
		}

		if (var2 != 0) {
			int var6 = field158.method188(arg0.field1079, arg0.field1081, arg0.field1082, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1076 = var3;
		arg0.field1078 = var4;
		arg0.field1077 = var5;
	}

	@ObfuscatedName("client.a()V")
	public final void method83() {
		method23("Starting up", 20);

		if (signlink.sunjava) {
			field811 = 5;
		}

		if (field129) {
			field46 = true;
		} else {
			field129 = true;
			boolean var1 = false;
			String var2 = method119();
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
						field155[var3] = new SJIXUDLP(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method123();
					field213 = method99(1, field328[1], "title screen", 25, "title");
					field347 = new EYHVDWTF(field213, false, "p11_full");
					field348 = new EYHVDWTF(field213, false, "p12_full");
					field349 = new EYHVDWTF(field213, false, "b12_full");
					field350 = new EYHVDWTF(field213, true, "q8_full");
					method149();
					method10();
					SPZBTZXL var4 = method99(2, field328[2], "config", 30, "config");
					SPZBTZXL var5 = method99(3, field328[3], "interface", 35, "interface");
					SPZBTZXL var6 = method99(4, field328[4], "2d graphics", 40, "media");
					SPZBTZXL var7 = method99(6, field328[6], "textures", 45, "textures");
					SPZBTZXL var8 = method99(7, field328[7], "chat system", 50, "wordenc");
					SPZBTZXL var9 = method99(8, field328[8], "sound effects", 55, "sounds");
					field425 = new byte[4][104][104];
					field259 = new int[4][105][105];
					field158 = new DLDGGHZP(field259, 104, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field431[var10] = new EXLGBZBR(104, 104);
					}

					field266 = new DUMEPGRH(512, 512);
					SPZBTZXL var11 = method99(5, field328[5], "update list", 60, "versionlist");
					method23("Connecting to update server", 60);
					field97 = new GLPUEKVZ();
					field97.method287(var11, this);
					UEUSJYYO.method532(field97.method297());
					HEQROJXW.method319(field97.method295(0), field97);

					if (!field365) {
						field92 = 0;
						try {
							field92 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field93 = true;
						field97.method284(2, field92);

						while (field97.method280() > 0) {
							method94();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field97.field648 > 3) {
								method146("ondemand");
								return;
							}
						}
					}

					method23("Requesting animations", 65);
					int var12 = field97.method295(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field97.method284(1, var13);
					}

					while (field97.method280() > 0) {
						int var14 = var12 - field97.method280();
						if (var14 > 0) {
							method23("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method94();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field97.field648 > 3) {
							method146("ondemand");
							return;
						}
					}

					method23("Requesting models", 70);
					int var15 = field97.method295(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field97.method279(var16);
						if ((var17 & 0x1) != 0) {
							field97.method284(0, var16);
						}
					}

					int var18 = field97.method280();
					while (field97.method280() > 0) {
						int var19 = var18 - field97.method280();
						if (var19 > 0) {
							method23("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method94();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field155[0] != null) {
						method23("Requesting maps", 75);
						field97.method284(3, field97.method285(48, 0, 47));
						field97.method284(3, field97.method285(48, 1, 47));
						field97.method284(3, field97.method285(48, 0, 48));
						field97.method284(3, field97.method285(48, 1, 48));
						field97.method284(3, field97.method285(48, 0, 49));
						field97.method284(3, field97.method285(48, 1, 49));
						field97.method284(3, field97.method285(47, 0, 47));
						field97.method284(3, field97.method285(47, 1, 47));
						field97.method284(3, field97.method285(47, 0, 48));
						field97.method284(3, field97.method285(47, 1, 48));
						field97.method284(3, field97.method285(148, 0, 48));
						field97.method284(3, field97.method285(148, 1, 48));
						int var20 = field97.method280();
						while (field97.method280() > 0) {
							int var21 = var20 - field97.method280();
							if (var21 > 0) {
								method23("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method94();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field97.method295(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field97.method279(var23);
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
							field97.method283(var23, var25, 0);
						}
					}

					field97.method292(field364);

					if (!field365) {
						int var26 = field97.method295(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field97.method288(var27)) {
								field97.method283(var27, (byte) 1, 2);
							}
						}
					}

					method23("Unpacking media", 80);
					field43 = new LKEIRLLI(var6, "invback", 0);
					field45 = new LKEIRLLI(var6, "chatback", 0);
					field44 = new LKEIRLLI(var6, "mapback", 0);
					field215 = new LKEIRLLI(var6, "backbase1", 0);
					field216 = new LKEIRLLI(var6, "backbase2", 0);
					field217 = new LKEIRLLI(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field55[var28] = new LKEIRLLI(var6, "sideicons", var28);
					}

					field195 = new DUMEPGRH(var6, "compass", 0);
					field250 = new DUMEPGRH(var6, "mapedge", 0);
					field250.method216();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field235[var29] = new LKEIRLLI(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field178[var30] = new DUMEPGRH(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field87[var31] = new DUMEPGRH(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field374[var32] = new DUMEPGRH(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field174 = new DUMEPGRH(var6, "mapmarker", 0);
					field175 = new DUMEPGRH(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field330[var33] = new DUMEPGRH(var6, "cross", var33);
					}

					field426 = new DUMEPGRH(var6, "mapdots", 0);
					field427 = new DUMEPGRH(var6, "mapdots", 1);
					field428 = new DUMEPGRH(var6, "mapdots", 2);
					field429 = new DUMEPGRH(var6, "mapdots", 3);
					field430 = new DUMEPGRH(var6, "mapdots", 4);
					field320 = new LKEIRLLI(var6, "scrollbar", 0);
					field321 = new LKEIRLLI(var6, "scrollbar", 1);
					field107 = new LKEIRLLI(var6, "redstone1", 0);
					field108 = new LKEIRLLI(var6, "redstone2", 0);
					field109 = new LKEIRLLI(var6, "redstone3", 0);
					field110 = new LKEIRLLI(var6, "redstone1", 0);
					field110.method443();
					field111 = new LKEIRLLI(var6, "redstone2", 0);
					field111.method443();
					field278 = new LKEIRLLI(var6, "redstone1", 0);
					field278.method444();
					field279 = new LKEIRLLI(var6, "redstone2", 0);
					field279.method444();
					field280 = new LKEIRLLI(var6, "redstone3", 0);
					field280.method444();
					field281 = new LKEIRLLI(var6, "redstone1", 0);
					field281.method443();
					field281.method444();
					field282 = new LKEIRLLI(var6, "redstone2", 0);
					field282.method443();
					field282.method444();

					for (int var34 = 0; var34 < 2; var34++) {
						field218[var34] = new LKEIRLLI(var6, "mod_icons", var34);
					}

					DUMEPGRH var35 = new DUMEPGRH(var6, "backleft1", 0);
					field58 = new TWKZMYGD(var35.field545, var35.field544, method71());
					var35.method217(0, 0);
					DUMEPGRH var36 = new DUMEPGRH(var6, "backleft2", 0);
					field59 = new TWKZMYGD(var36.field545, var36.field544, method71());
					var36.method217(0, 0);
					DUMEPGRH var37 = new DUMEPGRH(var6, "backright1", 0);
					field60 = new TWKZMYGD(var37.field545, var37.field544, method71());
					var37.method217(0, 0);
					DUMEPGRH var38 = new DUMEPGRH(var6, "backright2", 0);
					field61 = new TWKZMYGD(var38.field545, var38.field544, method71());
					var38.method217(0, 0);
					DUMEPGRH var39 = new DUMEPGRH(var6, "backtop1", 0);
					field62 = new TWKZMYGD(var39.field545, var39.field544, method71());
					var39.method217(0, 0);
					DUMEPGRH var40 = new DUMEPGRH(var6, "backvmid1", 0);
					field63 = new TWKZMYGD(var40.field545, var40.field544, method71());
					var40.method217(0, 0);
					DUMEPGRH var41 = new DUMEPGRH(var6, "backvmid2", 0);
					field64 = new TWKZMYGD(var41.field545, var41.field544, method71());
					var41.method217(0, 0);
					DUMEPGRH var42 = new DUMEPGRH(var6, "backvmid3", 0);
					field65 = new TWKZMYGD(var42.field545, var42.field544, method71());
					var42.method217(0, 0);
					DUMEPGRH var43 = new DUMEPGRH(var6, "backhmid2", 0);
					field66 = new TWKZMYGD(var43.field545, var43.field544, method71());
					var43.method217(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field178[var48] != null) {
							field178[var48].method215(var45 + var47, var44 + var47, var46 + var47);
						}

						if (field235[var48] != null) {
							field235[var48].method445(var45 + var47, var44 + var47, var46 + var47);
						}
					}

					method23("Unpacking textures", 83);
					GSZOCBMU.method303(var7);
					GSZOCBMU.method307(0.8D);
					GSZOCBMU.method302(20);
					method23("Unpacking config", 86);
					XKEHWKFH.method565(var4);
					USIJLMTP.method546(var4);
					WDDURNZH.method561(var4);
					KNYKYROC.method383(var4);
					ZNUYRYPY.method588(var4);
					YMQGRGSI.method568(var4);
					UIVLSYQW.method537(var4);
					EEUUOAGX.method233(var4);
					LPMARHLZ.method456(var4);
					KNYKYROC.field891 = field364;

					if (!field365) {
						method23("Unpacking sounds", 90);
						byte[] var49 = var9.method515("sounds.dat", null);
						LDILQFVA var50 = new LDILQFVA(var49);
						QQGIMXLX.method502(var50);
					}

					method23("Unpacking interfaces", 95);
					EYHVDWTF[] var51 = new EYHVDWTF[] { field347, field348, field349, field350 };
					ULLVQOAK.method540(var51, var6, var5);
					method23("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field44.field914[field44.field916 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field214[var52] = var53;
						field172[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field44.field914[field44.field916 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field124[var56 - 5] = var57 - 25;
						field446[var56 - 5] = var58 - var57;
					}

					GSZOCBMU.method300(96, 479);
					field197 = GSZOCBMU.field696;
					GSZOCBMU.method300(261, 190);
					field198 = GSZOCBMU.field696;
					GSZOCBMU.method300(334, 512);
					field199 = GSZOCBMU.field696;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = GSZOCBMU.field694[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					DLDGGHZP.method194(334, 500, 800, 512, var60);
					NBTRSNNF.method460(var8);
					field453 = new JHNSGCOV(this);
					method64(field453, 10);
					FSCCBLKX.field641 = this;
					USIJLMTP.field1272 = this;
					ZNUYRYPY.field1452 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field445 + " " + field402);
					field86 = true;
				}
			} else {
				field196 = true;
			}
		}
	}

	@ObfuscatedName("client.a(LZGJLFNLC;IB)V")
	public final void method84(ZGJLFNLC arg0, int arg1) {
		method85(arg0.field1392, arg1, arg0.field1391);
	}

	@ObfuscatedName("client.b(IBII)V")
	public final void method85(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method141(arg0, field273, arg2) - arg1;
			arg2 -= field113;
			var4 -= field114;
			arg0 -= field115;
			int var5 = HEQROJXW.field780[field116];
			int var6 = HEQROJXW.field781[field116];
			int var7 = HEQROJXW.field780[field117];
			int var8 = HEQROJXW.field781[field117];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field79 = (var9 << 9) / arg0 + GSZOCBMU.field690;
				field80 = (var11 << 9) / arg0 + GSZOCBMU.field691;
			} else {
				field79 = -1;
				field80 = -1;
			}
		} else {
			field79 = -1;
			field80 = -1;
		}
	}

	@ObfuscatedName("client.e(III)Ljava/lang/String;")
	public static final String method86(int arg0, int arg1) {
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

	@ObfuscatedName("client.t(I)V")
	public final void method87() {
		short var1 = 256;

		if (field309 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field309 > 768) {
					field164[var2] = method72(1024 - field309, field165[var2], field166[var2]);
				} else if (field309 > 256) {
					field164[var2] = field166[var2];
				} else {
					field164[var2] = method72(256 - field309, field166[var2], field165[var2]);
				}
			}
		} else if (field310 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field310 > 768) {
					field164[var3] = method72(1024 - field310, field165[var3], field167[var3]);
				} else if (field310 > 256) {
					field164[var3] = field167[var3];
				} else {
					field164[var3] = method72(256 - field310, field167[var3], field165[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field164[var4] = field165[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field412.field1136[var5] = field302.field543[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field287[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field145[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field164[var12];
					int var15 = field412.field1136[var7];
					field412.field1136[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field412.method530(0, 0, field817);

		for (int var16 = 0; var16 < 33920; var16++) {
			field413.field1136[var16] = field303.field543[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field287[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field145[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field164[var23];
					int var26 = field413.field1136[var18];
					field413.field1136[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field413.method530(0, 637, field817);
	}

	@ObfuscatedName("client.u(I)V")
	public final void method88() {
		for (int var1 = -1; var1 < field254; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field252;
			} else {
				var2 = field255[var1];
			}

			AHUILQJH var3 = field253[var2];
			if (var3 != null) {
				method27(1, var3);
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method89() {
		field292.method391(120);

		if (field125 != -1) {
			field125 = -1;
			field161 = true;
			field379 = false;
			field123 = true;
		}

		if (field120 != -1) {
			field120 = -1;
			field232 = true;
			field379 = false;
		}

		field229 = -1;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method90() {
		field401 = true;
	}

	@ObfuscatedName("client.a(ZLULLVQOAK;)Z")
	public final boolean method91(ULLVQOAK arg0) {
		if (arg0.field1205 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1205.length; var2++) {
			int var3 = method73(arg0, var2);
			int var4 = arg0.field1202[var2];
			if (arg0.field1205[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1205[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1205[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.b(ZZ)V")
	public final void method92(boolean arg0) {
		if (field119.field1391 >> 7 == field264 && field119.field1392 >> 7 == field265) {
			field264 = 0;
		}

		int var2 = field254;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			AHUILQJH var4;
			int var5;
			if (arg0) {
				var4 = field119;
				var5 = field252 << 14;
			} else {
				var4 = field253[field255[var3]];
				var5 = field255[var3] << 14;
			}

			if (var4 != null && var4.method3()) {
				var4.field12 = false;
				if ((field365 && field254 > 50 || field254 > 200) && !arg0 && var4.field1402 == var4.field1395) {
					var4.field12 = true;
				}

				int var6 = var4.field1391 >> 7;
				int var7 = var4.field1392 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field7 == null || field221 < var4.field8 || field221 >= var4.field9) {
						if ((var4.field1391 & 0x7F) == 0x40 && (var4.field1392 & 0x7F) == 0x40) {
							if (field206[var6][var7] == field176) {
								continue;
							}

							field206[var6][var7] = field176;
						}

						var4.field13 = method141(var4.field1392, field273, var4.field1391);
						field158.method169(field273, 60, var4.field1391, var4.field13, var5, var4.field1392, var4.field1433, var4.field1393, var4);
					} else {
						var4.field12 = false;
						var4.field13 = method141(var4.field1392, field273, var4.field1391);
						field158.method170(var4.field20, var4, var4.field22, var4.field23, var4.field13, var4.field1392, field273, var4.field21, 60, var4.field1393, var5, var4.field1391);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method93() {
		field82.method529();

		if (field53 == 2) {
			byte[] var1 = field44.field914;
			int[] var2 = SXFSGYHA.field1125;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field195.method223(0, field74, 33, 25, 25, field214, 33, 0, field172, 256);
			field83.method529();
		} else {
			int var5 = field74 + field381 & 0x7FF;
			int var6 = field119.field1391 / 32 + 48;
			int var7 = 464 - field119.field1392 / 32;
			field266.method223(25, var5, 151, var6, var7, field124, 146, 5, field446, field238 + 256);
			field195.method223(0, field74, 33, 25, 25, field214, 33, 0, field172, 256);

			for (int var8 = 0; var8 < field209; var8++) {
				int var9 = field210[var8] * 4 + 2 - field119.field1391 / 32;
				int var10 = field211[var8] * 4 + 2 - field119.field1392 / 32;
				method81(var9, var10, field373[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LOISKKJJ var13 = field372[field273][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field119.field1391 / 32;
						int var15 = var12 * 4 + 2 - field119.field1392 / 32;
						method81(var14, var15, field426);
					}
				}
			}

			for (int var16 = 0; var16 < field395; var16++) {
				TVKIEQYR var17 = field394[field396[var16]];
				if (var17 != null && var17.method3()) {
					ZNUYRYPY var18 = var17.field1135;
					if (var18.field1464 != null) {
						var18 = var18.method591();
					}

					if (var18 != null && var18.field1470 && var18.field1454) {
						int var19 = var17.field1391 / 32 - field119.field1391 / 32;
						int var20 = var17.field1392 / 32 - field119.field1392 / 32;
						method81(var19, var20, field427);
					}
				}
			}

			for (int var21 = 0; var21 < field254; var21++) {
				AHUILQJH var22 = field253[field255[var21]];
				if (var22 != null && var22.method3()) {
					int var23 = var22.field1391 / 32 - field119.field1391 / 32;
					int var24 = var22.field1392 / 32 - field119.field1392 / 32;
					boolean var25 = false;
					long var26 = FBIFPAXF.method268(var22.field16);
					for (int var28 = 0; var28 < field397; var28++) {
						if (field435[var28] == var26 && field100[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field119.field11 != 0 && var22.field11 != 0 && field119.field11 == var22.field11) {
						var29 = true;
					}

					if (var25) {
						method81(var23, var24, field429);
					} else if (var29) {
						method81(var23, var24, field430);
					} else {
						method81(var23, var24, field428);
					}
				}
			}

			if (field352 != 0 && field221 % 20 < 10) {
				if (field352 == 1 && field236 >= 0 && field236 < field394.length) {
					TVKIEQYR var30 = field394[field236];
					if (var30 != null) {
						int var31 = var30.field1391 / 32 - field119.field1391 / 32;
						int var32 = var30.field1392 / 32 - field119.field1392 / 32;
						method55(var31, var32, field175);
					}
				}

				if (field352 == 2) {
					int var33 = (field242 - field202) * 4 + 2 - field119.field1391 / 32;
					int var34 = (field243 - field203) * 4 + 2 - field119.field1392 / 32;
					method55(var33, var34, field175);
				}

				if (field352 == 10 && field335 >= 0 && field335 < field253.length) {
					AHUILQJH var35 = field253[field335];
					if (var35 != null) {
						int var36 = var35.field1391 / 32 - field119.field1391 / 32;
						int var37 = var35.field1392 / 32 - field119.field1392 / 32;
						method55(var36, var37, field175);
					}
				}
			}

			if (field264 != 0) {
				int var38 = field264 * 4 + 2 - field119.field1391 / 32;
				int var39 = field265 * 4 + 2 - field119.field1392 / 32;
				method81(var38, var39, field174);
			}

			SXFSGYHA.method521(0xFFFFFF, 3, 97, 78, 3);
			field83.method529();
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method94() {
		while (true) {
			UWCGEJPY var1 = field97.method294();
			if (var1 == null) {
				return;
			}

			if (var1.field1280 == 0) {
				HEQROJXW.method320(var1.field1278, var1.field1279);

				if ((field97.method279(var1.field1279) & 0x62) != 0) {
					field161 = true;

					if (field120 != -1) {
						field232 = true;
					}
				}
			}

			if (var1.field1280 == 1 && var1.field1278 != null) {
				UEUSJYYO.method533(var1.field1278);
			}

			if (var1.field1280 == 2 && field92 == var1.field1279 && var1.field1278 != null) {
				method22(field93, var1.field1278);
			}

			if (var1.field1280 == 3 && field380 == 1) {
				for (int var2 = 0; var2 < field154.length; var2++) {
					if (field343[var2] == var1.field1279) {
						field154[var2] = var1.field1278;

						if (var1.field1278 == null) {
							field343[var2] = -1;
						}

						break;
					}

					if (field344[var2] == var1.field1279) {
						field438[var2] = var1.field1278;

						if (var1.field1278 == null) {
							field344[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1280 == 93 && field97.method289(var1.field1279)) {
				HTMZBQHM.method356(new LDILQFVA(var1.field1278), field97);
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method95() {
		if (field192 == 0) {
			field163[0] = "Cancel";
			field318[0] = 1845;
			field367 = 1;
			method120();
			field88 = 0;

			if (field825 > 4 && field826 > 4 && field825 < 516 && field826 < 338) {
				if (field229 == -1) {
					method133();
				} else {
					method17(0, 4, field825, ULLVQOAK.field1172[field229], 4, field826);
				}
			}

			if (field88 != field286) {
				field286 = field88;
			}

			field88 = 0;

			if (field825 > 553 && field826 > 205 && field825 < 743 && field826 < 466) {
				if (field125 != -1) {
					method17(0, 205, field825, ULLVQOAK.field1172[field125], 553, field826);
				} else if (field334[field315] != -1) {
					method17(0, 205, field825, ULLVQOAK.field1172[field334[field315]], 553, field826);
				}
			}

			if (field88 != field329) {
				field161 = true;
				field329 = field88;
			}

			field88 = 0;

			if (field825 > 17 && field826 > 357 && field825 < 496 && field826 < 453) {
				if (field120 != -1) {
					method17(0, 357, field825, ULLVQOAK.field1172[field120], 17, field826);
				} else if (field826 < 434 && field825 < 426) {
					method35(field825 - 17, field826 - 357);
				}
			}

			if (field120 != -1 && field88 != field436) {
				field232 = true;
				field436 = field88;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field367 - 1; var2++) {
					if (field318[var2] < 1000 && field318[var2 + 1] > 1000) {
						String var3 = field163[var2];
						field163[var2] = field163[var2 + 1];
						field163[var2 + 1] = var3;
						int var4 = field318[var2];
						field318[var2] = field318[var2 + 1];
						field318[var2 + 1] = var4;
						int var5 = field316[var2];
						field316[var2] = field316[var2 + 1];
						field316[var2 + 1] = var5;
						int var6 = field317[var2];
						field317[var2] = field317[var2 + 1];
						field317[var2 + 1] = var6;
						int var7 = field319[var2];
						field319[var2] = field319[var2 + 1];
						field319[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method96() {
		field81.method529();
		GSZOCBMU.field696 = field198;
		field43.method446(0, 0);

		if (field125 != -1) {
			method140(0, ULLVQOAK.field1172[field125], 0, 0);
		} else if (field334[field315] != -1) {
			method140(0, ULLVQOAK.field1172[field334[field315]], 0, 0);
		}

		if (field306 && field295 == 1) {
			method104();
		}

		field81.method530(205, 553, field817);
		field83.method529();
		GSZOCBMU.field696 = field199;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method97(int arg0) {
		int[] var2 = field266.field543;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field425[arg0][var7][var5] & 0x18) == 0) {
					field158.method193(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field425[arg0 + 1][var7][var5] & 0x8) != 0) {
					field158.method193(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field266.method214();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field425[arg0][var11][var10] & 0x18) == 0) {
					method75(var11, var8, arg0, var9, var10);
				}

				if (arg0 < 3 && (field425[arg0 + 1][var11][var10] & 0x8) != 0) {
					method75(var11, var8, arg0 + 1, var9, var10);
				}
			}
		}

		field83.method529();
		field209 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field158.method187(field273, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = USIJLMTP.method555(var14).field1250;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field431[field273].field615;
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

						field373[field209] = field178[var15];
						field210[field209] = var16;
						field211[field209] = var17;
						field209++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBIIIZIIIII)Z")
	public final boolean method98(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field457[var14][var15] = 0;
				field234[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg10;
		field457[arg1][arg10] = 99;
		field234[arg1][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field345[var18] = arg1;
		int var35 = var18 + 1;
		field346[var18] = arg10;
		boolean var20 = false;
		int var21 = field345.length;
		int[][] var22 = field431[field273].field615;
		while (var35 != var19) {
			var16 = field345[var19];
			var17 = field346[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field431[field273].method249(var17, arg8, arg9 - 1, arg0, var16, arg2)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field431[field273].method250(arg8, arg2, arg9 - 1, var17, arg0, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg7 != 0 && field431[field273].method251(arg7, arg0, arg4, var16, arg3, var17, arg8)) {
				var20 = true;
				break;
			}

			int var23 = field234[var16][var17] + 1;
			if (var16 > 0 && field457[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field345[var35] = var16 - 1;
				field346[var35] = var17;
				var35 = (var35 + 1) % var21;
				field457[var16 - 1][var17] = 2;
				field234[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field457[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field345[var35] = var16 + 1;
				field346[var35] = var17;
				var35 = (var35 + 1) % var21;
				field457[var16 + 1][var17] = 8;
				field234[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field457[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field345[var35] = var16;
				field346[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field457[var16][var17 - 1] = 1;
				field234[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field457[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field345[var35] = var16;
				field346[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field457[var16][var17 + 1] = 4;
				field234[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field457[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field345[var35] = var16 - 1;
				field346[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field457[var16 - 1][var17 - 1] = 3;
				field234[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field457[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field345[var35] = var16 + 1;
				field346[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field457[var16 + 1][var17 - 1] = 9;
				field234[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field457[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field345[var35] = var16 - 1;
				field346[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field457[var16 - 1][var17 + 1] = 6;
				field234[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field457[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field345[var35] = var16 + 1;
				field346[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field457[var16 + 1][var17 + 1] = 12;
				field234[var16 + 1][var17 + 1] = var23;
			}
		}

		field443 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field234[var26][var27] < var24) {
								var24 = field234[var26][var27];
								var16 = var26;
								var17 = var27;
								field443 = 1;
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
		field345[var28] = var16;
		int var36 = var28 + 1;
		field346[var28] = var17;
		int var29;
		int var30 = var29 = field457[var16][var17];
		while (arg1 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field345[var36] = var16;
				field346[var36++] = var17;
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

			var30 = field457[var16][var17];
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
		int var32 = field345[var36];
		int var33 = field346[var36];
		field180++;
		if (field180 >= 133) {
			field292.method391(229);
			field292.method393(47151);
			field180 = 0;
		}

		if (arg6 == 0) {
			field292.method391(22);
			field292.method392(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field292.method391(212);
			field292.method392(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field292.method391(162);
			field292.method392(var31 + var31 + 3);
		}

		field292.method392(field835[5] == 1 ? 1 : 0);
		field264 = field345[0];
		field265 = field346[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field292.method392(field345[var36] - var32);
			field292.method392(field346[var36] - var33);
		}

		field292.method428(field202 + var32);
		field292.method428(field203 + var33);
		return true;
	}

	@ObfuscatedName("client.a(BIILjava/lang/String;ILjava/lang/String;)LSPZBTZXL;")
	public final SPZBTZXL method99(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field155[0] != null) {
				var6 = field155[0].method510(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field276.reset();
			field276.update(var6);
			int var8 = (int) field276.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new SPZBTZXL(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method23("Requesting " + arg2, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method106(arg4 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				LDILQFVA var16 = new LDILQFVA(var15);
				var16.field902 = 3;
				int var17 = var16.method406() + 6;
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
						method23("Loading " + arg2 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field155[0] != null) {
						field155[0].method511(var6, arg0, var6.length);
					}
				} catch (Exception var28) {
					field155[0] = null;
				}

				if (var6 != null) {
					field276.reset();
					field276.update(var6);
					int var23 = (int) field276.getValue();
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
						method23("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method23(var11 + " - Retrying in " + var25, arg3);
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

				field291 = !field291;
			}
		}

		return new SPZBTZXL(var6);
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method100(int arg0) {
		if (arg0 >= 0) {
			if (field106 != 0) {
				field106 = 0;
				field232 = true;
			}

			int var2 = field316[arg0];
			int var3 = field317[arg0];
			int var4 = field318[arg0];
			int var5 = field319[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 584 && method139(var2, var3, var5)) {
				field292.method391(65);
				field292.method427(var5 >> 14 & 0x7FFF);
				field292.method427(field50);
				field292.method426(field49);
				field292.method426(field202 + var2);
				field292.method428(field51);
				field292.method426(field203 + var3);
			}

			if (var4 == 682) {
				field292.method391(188);
				field292.method393(var3);
				ULLVQOAK var6 = ULLVQOAK.field1172[var3];
				if (var6.field1225 != null && var6.field1225[0][0] == 5) {
					int var7 = var6.field1225[0][1];
					field405[var7] = 1 - field405[var7];
					method52(var7);
					field161 = true;
				}
			}

			if (var4 == 822) {
				field292.method391(88);
				field292.method428(var2);
				field292.method426(var5);
				field292.method427(var3);
				field311 = 0;
				field312 = var3;
				field313 = var2;
				field314 = 2;
				if (ULLVQOAK.field1172[var3].field1192 == field229) {
					field314 = 1;
				}

				if (ULLVQOAK.field1172[var3].field1192 == field120) {
					field314 = 3;
				}
			}

			if (var4 == 978) {
				boolean var8 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
				if (!var8) {
					method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
				}

				field34 = field832;
				field35 = field833;
				field37 = 2;
				field36 = 0;
				field292.method391(204);
				field292.method426(field203 + var3);
				field292.method428(field202 + var2);
				field292.method393(var5);
			}

			if (var4 == 345) {
				AHUILQJH var10 = field253[var5];
				if (var10 != null) {
					method98(var10.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var10.field1390[0], 0, field119.field1390[0]);
					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(154);
					field292.method393(var5);
				}
			}

			if (var4 == 329) {
				method139(var2, var3, var5);
				field292.method391(233);
				field292.method393(var5 >> 14 & 0x7FFF);
				field292.method426(field203 + var3);
				field292.method427(field202 + var2);
			}

			if (var4 == 787) {
				field48 = 1;
				field49 = var2;
				field50 = var3;
				field51 = var5;
				field52 = KNYKYROC.method380(var5).field865;
				field38 = 0;
				field161 = true;
			} else {
				if (var4 == 84) {
					if (field306) {
						field158.method196(var2 - 4, var3 - 4);
					} else {
						field158.method196(field832 - 4, field833 - 4);
					}
				}

				if (var4 == 348) {
					AHUILQJH var11 = field253[var5];
					if (var11 != null) {
						method98(var11.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var11.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(70);
						field292.method428(field39);
						field292.method426(var5);
					}
				}

				if (var4 == 914) {
					field292.method391(6);
					field292.method428(var3);
					field292.method393(var5);
					field292.method426(var2);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 568) {
					field292.method391(60);
					field292.method428(var3);
					field292.method426(var5);
					field292.method427(var2);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 492) {
					AHUILQJH var12 = field253[var5];
					if (var12 != null) {
						method98(var12.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var12.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(55);
						field292.method426(var5);
					}
				}

				if (var4 == 589) {
					field292.method391(192);
					field292.method428(var3);
					field292.method393(var5);
					field292.method426(var2);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 1713) {
					TVKIEQYR var13 = field394[var5];
					if (var13 != null) {
						ZNUYRYPY var14 = var13.field1135;
						if (var14.field1464 != null) {
							var14 = var14.method591();
						}

						if (var14 != null) {
							String var15;
							if (var14.field1447 == null) {
								var15 = "It's a " + var14.field1471 + ".";
							} else {
								var15 = new String(var14.field1447);
							}

							method131("", 0, var15);
						}
					}
				}

				if (var4 == 100) {
					boolean var16 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
					if (!var16) {
						method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
					}

					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(199);
					field292.method393(var5);
					field292.method427(field203 + var3);
					field292.method428(field202 + var2);
				}

				if (var4 == 552) {
					field292.method391(188);
					field292.method393(var3);
					ULLVQOAK var18 = ULLVQOAK.field1172[var3];
					if (var18.field1225 != null && var18.field1225[0][0] == 5) {
						int var19 = var18.field1225[0][1];
						if (field405[var19] != var18.field1202[0]) {
							field405[var19] = var18.field1202[0];
							method52(var19);
							field161 = true;
						}
					}
				}

				if (var4 == 403) {
					String var20 = field163[arg0];
					int var21 = var20.indexOf("@whi@");
					if (var21 != -1) {
						long var22 = FBIFPAXF.method268(var20.substring(var21 + 5).trim());
						int var24 = -1;
						for (int var25 = 0; var25 < field397; var25++) {
							if (field435[var25] == var22) {
								var24 = var25;
								break;
							}
						}

						if (var24 != -1 && field100[var24] > 0) {
							field232 = true;
							field106 = 0;
							field418 = true;
							field173 = "";
							field121 = 3;
							field383 = field435[var24];
							field274 = "Enter message to send to " + field177[var24];
						}
					}
				}

				if (var4 == 174) {
					boolean var26 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
					if (!var26) {
						method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
					}

					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(137);
					field292.method428(field203 + var3);
					field292.method393(field39);
					field292.method427(var5);
					field292.method426(field202 + var2);
				}

				if (var4 == 622 && !field379) {
					field292.method391(109);
					field292.method393(var3);
					field379 = true;
				}

				if (var4 == 943) {
					field292.method391(87);
					field292.method393(var5);
					field292.method427(var2);
					field292.method393(field39);
					field292.method393(var3);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 422) {
					if ((var2 & 0x3) == 0) {
						field153++;
					}

					if (field153 >= 132) {
						field292.method391(48);
						field292.method392(205);
						field153 = 0;
					}

					field292.method391(78);
					field292.method427(var5);
					field292.method426(var2);
					field292.method427(var3);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 747) {
					TVKIEQYR var28 = field394[var5];
					if (var28 != null) {
						method98(var28.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var28.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(246);
						field292.method428(var5);
					}
				}

				if (var4 == 746) {
					TVKIEQYR var29 = field394[var5];
					if (var29 != null) {
						method98(var29.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var29.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(24);
						field292.method428(var5);
					}
				}

				if (var4 == 45) {
					AHUILQJH var30 = field253[var5];
					if (var30 != null) {
						method98(var30.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var30.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(168);
						field292.method426(var5);
					}
				}

				if (var4 == 200) {
					String var31 = field163[arg0];
					int var32 = var31.indexOf("@whi@");
					if (var32 != -1) {
						if (field229 == -1) {
							method89();
							field98 = var31.substring(var32 + 5).trim();
							field452 = false;

							for (int var33 = 0; var33 < ULLVQOAK.field1172.length; var33++) {
								if (ULLVQOAK.field1172[var33] != null && ULLVQOAK.field1172[var33].field1188 == 600) {
									field441 = field229 = ULLVQOAK.field1172[var33].field1192;
									break;
								}
							}
						} else {
							method131("", 0, "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 829) {
					field292.method391(61);
					field292.method393(field50);
					field292.method428(field51);
					field292.method428(field49);
					field292.method393(var3);
					field292.method428(var2);
					field292.method427(var5);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 718) {
					TVKIEQYR var34 = field394[var5];
					if (var34 != null) {
						method98(var34.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var34.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(110);
						field292.method393(var5);
						field292.method428(field50);
						field292.method426(field51);
						field292.method393(field49);
					}
				}

				if (var4 == 1951) {
					int var35 = var5 >> 14 & 0x7FFF;
					USIJLMTP var36 = USIJLMTP.method555(var35);
					String var37;
					if (var36.field1262 == null) {
						var37 = "It's a " + var36.field1260 + ".";
					} else {
						var37 = new String(var36.field1262);
					}

					method131("", 0, var37);
				}

				if (var4 == 748) {
					boolean var38 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
					if (!var38) {
						method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
					}

					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(146);
					field292.method427(var5);
					field292.method426(field202 + var2);
					field292.method426(field203 + var3);
				}

				if (var4 == 144 && method139(var2, var3, var5)) {
					field292.method391(53);
					field292.method427(field203 + var3);
					field292.method428(var5 >> 14 & 0x7FFF);
					field292.method427(field39);
					field292.method428(field202 + var2);
				}

				if (var4 == 253) {
					boolean var40 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
					if (!var40) {
						method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
					}

					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(252);
					field292.method427(field203 + var3);
					field292.method426(var5);
					field292.method428(field202 + var2);
				}

				if (var4 == 394 || var4 == 76 || var4 == 484 || var4 == 215) {
					String var42 = field163[arg0];
					int var43 = var42.indexOf("@whi@");
					if (var43 != -1) {
						long var44 = FBIFPAXF.method268(var42.substring(var43 + 5).trim());
						if (var4 == 394) {
							method69(var44);
						}

						if (var4 == 76) {
							method151(var44);
						}

						if (var4 == 484) {
							method46(var44);
						}

						if (var4 == 215) {
							method57(var44);
						}
					}
				}

				if (var4 == 726) {
					boolean var46 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
					if (!var46) {
						method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
					}

					field34 = field832;
					field35 = field833;
					field37 = 2;
					field36 = 0;
					field292.method391(171);
					field292.method427(field49);
					field292.method393(field203 + var3);
					field292.method428(var5);
					field292.method427(field51);
					field292.method428(field202 + var2);
					field292.method393(field50);
				}

				if (var4 == 762 || var4 == 680) {
					String var48 = field163[arg0];
					int var49 = var48.indexOf("@whi@");
					if (var49 != -1) {
						var48 = var48.substring(var49 + 5).trim();
						String var50 = FBIFPAXF.method272(FBIFPAXF.method269(FBIFPAXF.method268(var48)));
						boolean var51 = false;
						for (int var52 = 0; var52 < field254; var52++) {
							AHUILQJH var53 = field253[field255[var52]];
							if (var53 != null && var53.field16 != null && var53.field16.equalsIgnoreCase(var50)) {
								method98(var53.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var53.field1390[0], 0, field119.field1390[0]);

								if (var4 == 762) {
									field292.method391(168);
									field292.method426(field255[var52]);
								}

								if (var4 == 680) {
									field292.method391(154);
									field292.method393(field255[var52]);
								}

								var51 = true;
								break;
							}
						}

						if (!var51) {
							method131("", 0, "Unable to find " + var50);
						}
					}
				}

				if (var4 == 975) {
					field292.method391(216);
					field292.method426(var3);
					field292.method393(var5);
					field292.method427(var2);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 447) {
					AHUILQJH var54 = field253[var5];
					if (var54 != null) {
						method98(var54.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var54.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(126);
						field292.method426(var5);
						field292.method428(field49);
						field292.method428(field51);
						field292.method393(field50);
					}
				}

				if (var4 == 499) {
					field434++;
					if (field434 >= 109) {
						field292.method391(185);
						field292.method395(715994);
						field434 = 0;
					}

					method139(var2, var3, var5);
					field292.method391(50);
					field292.method393(field202 + var2);
					field292.method393(field203 + var3);
					field292.method428(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 1186) {
					KNYKYROC var55 = KNYKYROC.method380(var5);
					ULLVQOAK var56 = ULLVQOAK.field1172[var3];
					String var57;
					if (var56 != null && var56.field1206[var2] >= 100000) {
						var57 = var56.field1206[var2] + " x " + var55.field865;
					} else if (var55.field887 == null) {
						var57 = "It's a " + var55.field865 + ".";
					} else {
						var57 = new String(var55.field887);
					}

					method131("", 0, var57);
				}

				if (var4 == 891) {
					TVKIEQYR var58 = field394[var5];
					if (var58 != null) {
						method98(var58.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var58.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(227);
						field292.method427(var5);
					}
				}

				if (var4 == 855) {
					field292.method391(164);
					field292.method428(var2);
					field292.method393(var3);
					field292.method428(var5);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 1174) {
					field130++;
					if (field130 >= 87) {
						field292.method391(167);
						field130 = 0;
					}

					method139(var2, var3, var5);
					field292.method391(182);
					field292.method427(var5 >> 14 & 0x7FFF);
					field292.method426(field203 + var3);
					field292.method428(field202 + var2);
				}

				if (var4 == 664) {
					TVKIEQYR var59 = field394[var5];
					if (var59 != null) {
						method98(var59.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var59.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(113);
						field292.method426(var5);
					}
				}

				if (var4 == 598) {
					field292.method391(214);
					field292.method426(var2);
					field292.method426(var3);
					field292.method426(var5);
					field311 = 0;
					field312 = var3;
					field313 = var2;
					field314 = 2;
					if (ULLVQOAK.field1172[var3].field1192 == field229) {
						field314 = 1;
					}

					if (ULLVQOAK.field1172[var3].field1192 == field120) {
						field314 = 3;
					}
				}

				if (var4 == 478) {
					method139(var2, var3, var5);
					field292.method391(228);
					field292.method428(var5 >> 14 & 0x7FFF);
					field292.method393(field202 + var2);
					field292.method427(field203 + var3);
				}

				if (var4 == 382) {
					TVKIEQYR var60 = field394[var5];
					if (var60 != null) {
						method98(var60.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var60.field1390[0], 0, field119.field1390[0]);
						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(43);
						field292.method393(var5);
						field292.method393(field39);
					}
				}

				if (var4 == 1022) {
					KNYKYROC var61 = KNYKYROC.method380(var5);
					String var62;
					if (var61.field887 == null) {
						var62 = "It's a " + var61.field865 + ".";
					} else {
						var62 = new String(var61.field887);
					}

					method131("", 0, var62);
				}

				if (var4 == 358) {
					ULLVQOAK var63 = ULLVQOAK.field1172[var3];
					field38 = 1;
					field39 = var3;
					field40 = var63.field1186;
					field48 = 0;
					field161 = true;
					String var64 = var63.field1204;
					if (var64.indexOf(" ") != -1) {
						var64 = var64.substring(0, var64.indexOf(" "));
					}

					String var65 = var63.field1204;
					if (var65.indexOf(" ") != -1) {
						var65 = var65.substring(var65.indexOf(" ") + 1);
					}

					field41 = var64 + " " + var63.field1174 + " " + var65;

					if (field40 == 16) {
						field161 = true;
						field315 = 3;
						field123 = true;
					}
				} else {
					if (var4 == 131) {
						TVKIEQYR var66 = field394[var5];
						if (var66 != null) {
							method98(var66.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var66.field1390[0], 0, field119.field1390[0]);
							field34 = field832;
							field35 = field833;
							field37 = 2;
							field36 = 0;
							field292.method391(107);
							field292.method426(var5);
						}
					}

					if (var4 == 320) {
						AHUILQJH var67 = field253[var5];
						if (var67 != null) {
							method98(var67.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var67.field1390[0], 0, field119.field1390[0]);
							field34 = field832;
							field35 = field833;
							field37 = 2;
							field36 = 0;
							field292.method391(240);
							field292.method393(var5);
						}
					}

					if (var4 == 863) {
						AHUILQJH var68 = field253[var5];
						if (var68 != null) {
							method98(var68.field1389[0], field119.field1389[0], 0, 1, 0, false, 2, 1, var68.field1390[0], 0, field119.field1390[0]);
							field34 = field832;
							field35 = field833;
							field37 = 2;
							field36 = 0;
							field292.method391(249);
							field292.method393(var5);
						}
					}

					if (var4 == 242) {
						method89();
					}

					if (var4 == 698) {
						boolean var69 = method98(var2, field119.field1389[0], 0, 0, 0, false, 2, 0, var3, 0, field119.field1390[0]);
						if (!var69) {
							method98(var2, field119.field1389[0], 0, 1, 0, false, 2, 1, var3, 0, field119.field1390[0]);
						}

						field34 = field832;
						field35 = field833;
						field37 = 2;
						field36 = 0;
						field292.method391(219);
						field292.method426(var5);
						field292.method428(field202 + var2);
						field292.method427(field203 + var3);
					}

					if (var4 == 579) {
						field226 += var5;
						if (field226 >= 64) {
							field292.method391(31);
							field292.method392(4);
							field226 = 0;
						}

						field292.method391(32);
						field292.method428(var3);
						field292.method427(var2);
						field292.method428(var5);
						field311 = 0;
						field312 = var3;
						field313 = var2;
						field314 = 2;
						if (ULLVQOAK.field1172[var3].field1192 == field229) {
							field314 = 1;
						}

						if (ULLVQOAK.field1172[var3].field1192 == field120) {
							field314 = 3;
						}
					}

					if (var4 == 549) {
						field157++;
						if (field157 >= 56) {
							field292.method391(242);
							field292.method393(22200);
							field157 = 0;
						}

						method139(var2, var3, var5);
						field292.method391(141);
						field292.method428(var5 >> 14 & 0x7FFF);
						field292.method426(field203 + var3);
						field292.method428(field202 + var2);
					}

					if (var4 == 158) {
						ULLVQOAK var71 = ULLVQOAK.field1172[var3];
						boolean var72 = true;
						if (var71.field1188 > 0) {
							var72 = method42(var71);
						}

						if (var72) {
							field292.method391(188);
							field292.method393(var3);
						}
					}

					if (var4 == 540) {
						field292.method391(180);
						field292.method427(var5);
						field292.method393(var3);
						field292.method393(var2);
						field311 = 0;
						field312 = var3;
						field313 = var2;
						field314 = 2;
						if (ULLVQOAK.field1172[var3].field1192 == field229) {
							field314 = 1;
						}

						if (ULLVQOAK.field1172[var3].field1192 == field120) {
							field314 = 3;
						}
					}

					field48 = 0;
					field38 = 0;
					field161 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method101() {
		int var1 = field336 * 128 + 64;
		int var2 = field337 * 128 + 64;
		int var3 = method141(var2, field273, var1) - field338;

		if (field113 < var1) {
			field113 += (var1 - field113) * field340 / 1000 + field339;
			if (field113 > var1) {
				field113 = var1;
			}
		}

		if (field113 > var1) {
			field113 -= (field113 - var1) * field340 / 1000 + field339;
			if (field113 < var1) {
				field113 = var1;
			}
		}

		if (field114 < var3) {
			field114 += (var3 - field114) * field340 / 1000 + field339;
			if (field114 > var3) {
				field114 = var3;
			}
		}

		if (field114 > var3) {
			field114 -= (field114 - var3) * field340 / 1000 + field339;
			if (field114 < var3) {
				field114 = var3;
			}
		}

		if (field115 < var2) {
			field115 += (var2 - field115) * field340 / 1000 + field339;
			if (field115 > var2) {
				field115 = var2;
			}
		}

		if (field115 > var2) {
			field115 -= (field115 - var2) * field340 / 1000 + field339;
			if (field115 < var2) {
				field115 = var2;
			}
		}

		int var4 = field268 * 128 + 64;
		int var5 = field269 * 128 + 64;
		int var6 = method141(var5, field273, var4) - field270;
		int var7 = var4 - field113;
		int var8 = var6 - field114;
		int var9 = var5 - field115;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field116 < var11) {
			field116 += (var11 - field116) * field272 / 1000 + field271;
			if (field116 > var11) {
				field116 = var11;
			}
		}

		if (field116 > var11) {
			field116 -= (field116 - var11) * field272 / 1000 + field271;
			if (field116 < var11) {
				field116 = var11;
			}
		}

		int var13 = var12 - field117;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field117 += field272 * var13 / 1000 + field271;
			field117 &= 0x7FF;
		}

		if (var13 < 0) {
			field117 -= -var13 * field272 / 1000 + field271;
			field117 &= 0x7FF;
		}

		int var14 = var12 - field117;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field117 = var12;
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method102() {
		int var1 = field349.method255("Choose Option");
		for (int var2 = 0; var2 < field367; var2++) {
			int var3 = field349.method255(field163[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field367 * 15 + 21;
		if (field832 > 4 && field833 > 4 && field832 < 516 && field833 < 338) {
			int var5 = field832 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field833 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field306 = true;
			field295 = 0;
			field296 = var5;
			field297 = var6;
			field298 = var1;
			field299 = field367 * 15 + 22;
		}

		if (field832 > 553 && field833 > 205 && field832 < 743 && field833 < 466) {
			int var7 = field832 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field833 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field306 = true;
			field295 = 1;
			field296 = var7;
			field297 = var8;
			field298 = var1;
			field299 = field367 * 15 + 22;
		}

		if (field832 > 17 && field833 > 357 && field832 < 496 && field833 < 453) {
			int var9 = field832 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field833 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field306 = true;
			field295 = 2;
			field296 = var9;
			field297 = var10;
			field298 = var1;
			field299 = field367 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(ILLDILQFVA;I)V")
	public final void method103(LDILQFVA arg0, int arg1) {
		field360 = 0;
		field256 = 0;
		method18(arg0, arg1);
		method125(arg1, arg0);
		method143(arg1, arg0);

		for (int var3 = 0; var3 < field360; var3++) {
			int var4 = field361[var3];
			if (field221 != field394[var4].field1442) {
				field394[var4].field1135 = null;
				field394[var4] = null;
			}
		}

		if (arg0.field902 != arg1) {
			signlink.reporterror(field95 + " size mismatch in getnpcpos - pos:" + arg0.field902 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field395; var5++) {
			if (field394[field396[var5]] == null) {
				signlink.reporterror(field95 + " null entry in npc list - pos:" + var5 + " size:" + field395);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method104() {
		int var1 = field296;
		int var2 = field297;
		int var3 = field298;
		int var4 = field299;
		int var5 = 0x5D5447;
		SXFSGYHA.method521(var5, var3, var1, var2, var4);
		SXFSGYHA.method521(0, var3 - 2, var1 + 1, var2 + 1, 16);
		SXFSGYHA.method522(0, var1 + 1, var3 - 2, var4 - 19, var2 + 18);
		field349.method257(var1 + 3, "Choose Option", var2 + 14, var5);
		int var6 = field825;
		int var7 = field826;
		if (field295 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field295 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field295 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field367; var8++) {
			int var9 = (field367 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field349.method261(var10, var1 + 3, true, field163[var8], var9);
		}
	}

	@ObfuscatedName("client.z(I)Ljava/net/Socket;")
	public final Socket method105(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method106(String arg0) throws IOException {
		if (field291) {
			if (field223 != null) {
				try {
					field223.close();
				} catch (Exception var4) {
				}

				field223 = null;
			}

			field223 = method105(43595);
			field223.setSoTimeout(10000);
			InputStream var2 = field223.getInputStream();
			OutputStream var3 = field223.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.A(I)I")
	public final int method107() {
		int var1 = 3;
		if (field116 < 310) {
			int var2 = field113 >> 7;
			int var3 = field115 >> 7;
			int var4 = field119.field1391 >> 7;
			int var5 = field119.field1392 >> 7;

			if ((field425[field273][var2][var3] & 0x4) != 0) {
				var1 = field273;
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

					if ((field425[field273][var2][var3] & 0x4) != 0) {
						var1 = field273;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field425[field273][var2][var3] & 0x4) != 0) {
							var1 = field273;
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

					if ((field425[field273][var2][var3] & 0x4) != 0) {
						var1 = field273;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field425[field273][var2][var3] & 0x4) != 0) {
							var1 = field273;
						}
					}
				}
			}
		}

		if ((field425[field273][field119.field1391 >> 7][field119.field1392 >> 7] & 0x4) != 0) {
			var1 = field273;
		}

		return var1;
	}

	@ObfuscatedName("client.B(I)I")
	public final int method108() {
		int var1 = method141(field115, field273, field113);
		if (var1 - field114 < 800 && (field425[field273][field113 >> 7][field115 >> 7] & 0x4) != 0) {
			return field273;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IILAHUILQJH;II)V")
	public final void method109(int arg0, int arg1, AHUILQJH arg2, int arg3) {
		if (field119 != arg2 && field367 < 400) {
			String var5;
			if (arg2.field25 == 0) {
				var5 = arg2.field16 + method86(arg2.field10, field119.field10) + " (level-" + arg2.field10 + ")";
			} else {
				var5 = arg2.field16 + " (skill-" + arg2.field25 + ")";
			}

			if (field48 == 1) {
				field163[field367] = "Use " + field52 + " with @whi@" + var5;
				field318[field367] = 447;
				field319[field367] = arg0;
				field316[field367] = arg3;
				field317[field367] = arg1;
				field367++;
			} else if (field38 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field183[var6] != null) {
						field163[field367] = field183[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field183[var6].equalsIgnoreCase("attack")) {
							if (arg2.field10 > field119.field10) {
								var7 = 2000;
							}

							if (field119.field11 != 0 && arg2.field11 != 0) {
								if (field119.field11 == arg2.field11) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field184[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field318[field367] = var7 + 345;
						}

						if (var6 == 1) {
							field318[field367] = var7 + 492;
						}

						if (var6 == 2) {
							field318[field367] = var7 + 863;
						}

						if (var6 == 3) {
							field318[field367] = var7 + 45;
						}

						if (var6 == 4) {
							field318[field367] = var7 + 320;
						}

						field319[field367] = arg0;
						field316[field367] = arg3;
						field317[field367] = arg1;
						field367++;
					}
				}
			} else if ((field40 & 0x8) == 8) {
				field163[field367] = field41 + " @whi@" + var5;
				field318[field367] = 348;
				field319[field367] = arg0;
				field316[field367] = arg3;
				field317[field367] = arg1;
				field367++;
			}

			for (int var8 = 0; var8 < field367; var8++) {
				if (field318[var8] == 84) {
					field163[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method110() {
		if (field192 == 0) {
			int var1 = field831;
			if (field38 == 1 && field832 >= 516 && field833 >= 160 && field832 <= 765 && field833 <= 205) {
				var1 = 0;
			}

			if (field306) {
				if (var1 != 1) {
					int var2 = field825;
					int var3 = field826;
					if (field295 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field295 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field295 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field296 - 10 || var2 > field298 + field296 + 10 || var3 < field297 - 10 || var3 > field299 + field297 + 10) {
						field306 = false;

						if (field295 == 1) {
							field161 = true;
						}

						if (field295 == 2) {
							field232 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field296;
					int var5 = field297;
					int var6 = field298;
					int var7 = field832;
					int var8 = field833;
					if (field295 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field295 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field295 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field367; var10++) {
						int var11 = (field367 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method100(var9);
					}

					field306 = false;

					if (field295 == 1) {
						field161 = true;
					}

					if (field295 == 2) {
						field232 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field367 > 0) {
					int var12 = field318[field367 - 1];
					if (var12 == 855 || var12 == 822 || var12 == 589 || var12 == 914 || var12 == 568 || var12 == 579 || var12 == 540 || var12 == 422 || var12 == 598 || var12 == 975 || var12 == 787 || var12 == 1186) {
						int var13 = field316[field367 - 1];
						int var14 = field317[field367 - 1];
						ULLVQOAK var15 = ULLVQOAK.field1172[var14];
						if (var15.field1222 || var15.field1170) {
							field283 = false;
							field231 = 0;
							field190 = var14;
							field191 = var13;
							field192 = 2;
							field193 = field832;
							field194 = field833;

							if (ULLVQOAK.field1172[var14].field1192 == field229) {
								field192 = 1;
							}

							if (ULLVQOAK.field1172[var14].field1192 == field120) {
								field192 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field105 == 1 || method148(field367 - 1)) && field367 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field367 > 0) {
					method100(field367 - 1);
				}

				if (var1 != 2 || field367 <= 0) {
					return;
				}

				method102();
			}
		}
	}

	@ObfuscatedName("client.b(LLDILQFVA;II)V")
	public final void method111(LDILQFVA arg0, int arg1) {
		int var3 = arg0.method413(8);
		if (var3 < field254) {
			for (int var4 = var3; var4 < field254; var4++) {
				field361[field360++] = field255[var4];
			}
		}

		if (var3 > field254) {
			signlink.reporterror(field95 + " Too many players");
			throw new RuntimeException("eek");
		}

		field254 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field255[var5];
			AHUILQJH var7 = field253[var6];
			int var8 = arg0.method413(1);
			if (var8 == 0) {
				field255[field254++] = var6;
				var7.field1442 = field221;
			} else {
				int var9 = arg0.method413(2);
				if (var9 == 0) {
					field255[field254++] = var6;
					var7.field1442 = field221;
					field257[field256++] = var6;
				} else if (var9 == 1) {
					field255[field254++] = var6;
					var7.field1442 = field221;
					int var10 = arg0.method413(3);
					var7.method574(var10, false);
					int var11 = arg0.method413(1);
					if (var11 == 1) {
						field257[field256++] = var6;
					}
				} else if (var9 == 2) {
					field255[field254++] = var6;
					var7.field1442 = field221;
					int var12 = arg0.method413(3);
					var7.method574(var12, true);
					int var13 = arg0.method413(3);
					var7.method574(var13, true);
					int var14 = arg0.method413(1);
					if (var14 == 1) {
						field257[field256++] = var6;
					}
				} else if (var9 == 3) {
					field361[field360++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method112(int arg0) {
		ULLVQOAK var2 = ULLVQOAK.field1172[arg0];
		for (int var3 = 0; var3 < var2.field1187.length && var2.field1187[var3] != -1; var3++) {
			ULLVQOAK var4 = ULLVQOAK.field1172[var2.field1187[var3]];
			if (var4.field1176 == 1) {
				method112(var4.field1224);
			}

			var4.field1200 = 0;
			var4.field1197 = 0;
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(ZLLDILQFVA;I)V")
	public final void method113(LDILQFVA arg0, int arg1) {
		field360 = 0;
		field256 = 0;
		method79(arg0, arg1);
		method111(arg0, arg1);
		method68(arg0, arg1);
		method124(arg1, arg0);

		for (int var3 = 0; var3 < field360; var3++) {
			int var4 = field361[var3];
			if (field221 != field253[var4].field1442) {
				field253[var4] = null;
			}
		}

		if (arg0.field902 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field902 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field254; var5++) {
			if (field253[field255[var5]] == null) {
				signlink.reporterror(field95 + " null entry in pl list - pos:" + var5 + " size:" + field254);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method114(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method115() {
		USIJLMTP.field1231.method154();
		USIJLMTP.field1246.method154();
		ZNUYRYPY.field1458.method154();
		KNYKYROC.field876.method154();
		KNYKYROC.field874.method154();
		AHUILQJH.field1.method154();
		UIVLSYQW.field1164.method154();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method116(boolean arg0) {
		for (int var2 = 0; var2 < field395; var2++) {
			TVKIEQYR var3 = field394[field396[var2]];
			int var4 = (field396[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method3() && var3.field1135.field1479 == arg0) {
				int var5 = var3.field1391 >> 7;
				int var6 = var3.field1392 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1414 == 1 && (var3.field1391 & 0x7F) == 0x40 && (var3.field1392 & 0x7F) == 0x40) {
						if (field206[var5][var6] == field176) {
							continue;
						}

						field206[var5][var6] = field176;
					}

					if (!var3.field1135.field1454) {
						var4 += Integer.MIN_VALUE;
					}

					field158.method169(field273, (var3.field1414 - 1) * 64 + 60, var3.field1391, method141(var3.field1392, field273, var3.field1391), var4, var3.field1392, var3.field1433, var3.field1393, var3);
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method117() {
		if (field249 == null) {
			return false;
		}

		try {
			int var1 = field249.method229();
			if (var1 == 0) {
				return false;
			}

			if (field389 == -1) {
				field249.method230(field366.field901, 0, 1);
				field389 = field366.field901[0] & 0xFF;
				if (field399 != null) {
					field389 = field389 - field399.method387() & 0xFF;
				}

				field388 = EIWOOQUJ.field599[field389];
				var1--;
			}

			if (field388 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field249.method230(field366.field901, 0, 1);
				field388 = field366.field901[0] & 0xFF;
				var1--;
			}

			if (field388 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field249.method230(field366.field901, 0, 2);
				field366.field902 = 0;
				field388 = field366.method404();
				var1 -= 2;
			}

			if (var1 < field388) {
				return false;
			}

			field366.field902 = 0;
			field249.method230(field366.field901, 0, field388);
			field390 = 0;
			field422 = field421;
			field421 = field420;
			field420 = field389;

			if (field389 == 188) {
				field352 = field366.method402();
				if (field352 == 1) {
					field236 = field366.method404();
				}

				if (field352 >= 2 && field352 <= 6) {
					if (field352 == 2) {
						field245 = 64;
						field246 = 64;
					}

					if (field352 == 3) {
						field245 = 0;
						field246 = 64;
					}

					if (field352 == 4) {
						field245 = 128;
						field246 = 64;
					}

					if (field352 == 5) {
						field245 = 64;
						field246 = 0;
					}

					if (field352 == 6) {
						field245 = 64;
						field246 = 128;
					}

					field352 = 2;
					field242 = field366.method404();
					field243 = field366.method404();
					field244 = field366.method402();
				}

				if (field352 == 10) {
					field335 = field366.method404();
				}

				field389 = -1;
				return true;
			}

			if (field389 == 34) {
				int var2 = field366.method431();
				int var3 = field366.method429();
				ULLVQOAK.field1172[var3].field1195 = 2;
				ULLVQOAK.field1172[var3].field1196 = var2;
				field389 = -1;
				return true;
			}

			if (field389 == 103) {
				field356 = field366.method421();
				field355 = field366.method422();

				while (field366.field902 < field388) {
					int var4 = field366.method402();
					method136(field366, var4);
				}

				field389 = -1;
				return true;
			}

			if (field389 == 53) {
				int var5 = field366.method431();
				ULLVQOAK.field1172[var5].field1195 = 3;

				if (field119.field17 == null) {
					ULLVQOAK.field1172[var5].field1196 = (field119.field14[11] << 5) + (field119.field14[8] << 10) + (field119.field14[0] << 15) + (field119.field3[0] << 25) + (field119.field3[4] << 20) + field119.field14[1];
				} else {
					ULLVQOAK.field1172[var5].field1196 = (int) (field119.field17.field1456 + 0x12345678L);
				}

				field389 = -1;
				return true;
			}

			if (field389 == 118) {
				field406 = field366.method420();
				if (field406 == field315) {
					if (field406 == 3) {
						field315 = 1;
					} else {
						field315 = 3;
					}

					field161 = true;
				}

				field389 = -1;
				return true;
			}

			if (field389 == 222) {
				int var6 = field366.method432();
				int var7 = field366.method404();
				ULLVQOAK var8 = ULLVQOAK.field1172[var7];
				var8.field1193 = var6;

				if (var6 == -1) {
					var8.field1200 = 0;
					var8.field1197 = 0;
				}

				field389 = -1;
				return true;
			}

			if (field389 == 110) {
				field161 = true;
				int var9 = field366.method404();
				ULLVQOAK var10 = ULLVQOAK.field1172[var9];
				int var11 = field366.method404();
				for (int var12 = 0; var12 < var11; var12++) {
					var10.field1167[var12] = field366.method430();
					int var13 = field366.method402();
					if (var13 == 255) {
						var13 = field366.method436();
					}

					var10.field1206[var12] = var13;
				}

				for (int var14 = var11; var14 < var10.field1167.length; var14++) {
					var10.field1167[var14] = 0;
					var10.field1206[var14] = 0;
				}

				field389 = -1;
				return true;
			}

			if (field389 == 52) {
				field418 = false;
				field106 = 2;
				field454 = "";
				field232 = true;
				field389 = -1;
				return true;
			}

			if (field389 == 248) {
				for (int var15 = 0; var15 < field405.length; var15++) {
					if (field455[var15] != field405[var15]) {
						field405[var15] = field455[var15];
						method52(var15);
						field161 = true;
					}
				}

				field389 = -1;
				return true;
			}

			if (field389 == 159) {
				method103(field366, field388);
				field389 = -1;
				return true;
			}

			if (field389 == 92) {
				int var16 = field366.method434();
				if (var16 >= 0) {
					method112(var16);
				}

				field104 = var16;
				field389 = -1;
				return true;
			}

			if (field389 == 193) {
				int var17 = field366.method432();
				int var18 = field366.method431();
				int var19 = field366.method433();
				ULLVQOAK var20 = ULLVQOAK.field1172[var18];
				var20.field1173 = var19;
				var20.field1189 = var17;
				field389 = -1;
				return true;
			}

			if (field389 == 237) {
				int var21 = field366.method431();
				int var22 = field366.method404();
				ULLVQOAK var23 = ULLVQOAK.field1172[var22];
				if (var23 != null && var23.field1176 == 0) {
					if (var21 < 0) {
						var21 = 0;
					}

					if (var21 > var23.field1168 - var23.field1218) {
						var21 = var23.field1168 - var23.field1218;
					}

					var23.field1201 = var21;
				}

				field389 = -1;
				return true;
			}

			if (field389 == 114) {
				int var24 = field366.method433();
				field169 = var24;
				field232 = true;
				field389 = -1;
				return true;
			}

			if (field389 == 5) {
				if (field315 == 12) {
					field161 = true;
				}

				field122 = field366.method405();
				field389 = -1;
				return true;
			}

			if (field389 == 246) {
				field398 = field366.method402();
				field161 = true;
				field389 = -1;
				return true;
			}

			if (field389 == 226) {
				int var25 = field366.method431();
				boolean var26 = field366.method422() == 1;
				ULLVQOAK.field1172[var25].field1208 = var26;
				field389 = -1;
				return true;
			}

			if (field389 == 121) {
				field356 = field366.method422();
				field355 = field366.method420();
				for (int var27 = field355; var27 < field355 + 8; var27++) {
					for (int var28 = field356; var28 < field356 + 8; var28++) {
						if (field372[field273][var27][var28] != null) {
							field372[field273][var27][var28] = null;
							method54(var27, var28);
						}
					}
				}

				for (QXQLENZA var29 = (QXQLENZA) field227.method451(); var29 != null; var29 = (QXQLENZA) field227.method453()) {
					if (var29.field1081 >= field355 && var29.field1081 < field355 + 8 && var29.field1082 >= field356 && var29.field1082 < field356 + 8 && field273 == var29.field1079) {
						var29.field1087 = 0;
					}
				}

				field389 = -1;
				return true;
			}

			if (field389 == 229) {
				method74();
				field389 = -1;
				return false;
			}

			if (field389 == 22) {
				int var30 = field366.method430();
				int var31 = field366.method404();
				int var32 = field366.method404();

				if (var30 == 0xFFFF) {
					ULLVQOAK.field1172[var31].field1195 = 0;
					field389 = -1;
					return true;
				}

				KNYKYROC var33 = KNYKYROC.method380(var30);
				ULLVQOAK.field1172[var31].field1195 = 4;
				ULLVQOAK.field1172[var31].field1196 = var30;
				ULLVQOAK.field1172[var31].field1182 = var33.field858;
				ULLVQOAK.field1172[var31].field1183 = var33.field879;
				ULLVQOAK.field1172[var31].field1181 = var33.field881 * 100 / var32;
				field389 = -1;
				return true;
			}

			if (field389 == 54) {
				if (field125 != -1) {
					field125 = -1;
					field161 = true;
					field123 = true;
				}

				if (field120 != -1) {
					field120 = -1;
					field232 = true;
				}

				if (field106 != 0) {
					field106 = 0;
					field232 = true;
				}

				field229 = -1;
				field379 = false;
				field389 = -1;
				return true;
			}

			if (field389 != 169 && field389 != 243) {
				if (field389 == 155) {
					field322 = true;
					field268 = field366.method402();
					field269 = field366.method402();
					field270 = field366.method404();
					field271 = field366.method402();
					field272 = field366.method402();
					if (field272 >= 100) {
						int var84 = field268 * 128 + 64;
						int var85 = field269 * 128 + 64;
						int var86 = method141(var85, field273, var84) - field270;
						int var87 = var84 - field113;
						int var88 = var86 - field114;
						int var89 = var85 - field115;
						int var90 = (int) Math.sqrt(var87 * var87 + var89 * var89);
						field116 = (int) (Math.atan2(var88, var90) * 325.949D) & 0x7FF;
						field117 = (int) (Math.atan2(var87, var89) * -325.949D) & 0x7FF;

						if (field116 < 128) {
							field116 = 128;
						}

						if (field116 > 383) {
							field116 = 383;
						}
					}

					field389 = -1;
					return true;
				}

				if (field389 == 37) {
					for (int var91 = 0; var91 < field253.length; var91++) {
						if (field253[var91] != null) {
							field253[var91].field1436 = -1;
						}
					}

					for (int var92 = 0; var92 < field394.length; var92++) {
						if (field394[var92] != null) {
							field394[var92].field1436 = -1;
						}
					}

					field389 = -1;
					return true;
				}

				if (field389 == 99) {
					int var93 = field366.method431();
					String var94 = field366.method409();
					ULLVQOAK.field1172[var93].field1211 = var94;

					if (field334[field315] == ULLVQOAK.field1172[var93].field1192) {
						field161 = true;
					}

					field389 = -1;
					return true;
				}

				if (field389 == 26) {
					if (field315 == 12) {
						field161 = true;
					}

					field208 = field366.method402();
					field389 = -1;
					return true;
				}

				if (field389 == 195) {
					field161 = true;
					int var95 = field366.method404();
					ULLVQOAK var96 = ULLVQOAK.field1172[var95];
					while (field366.field902 < field388) {
						int var97 = field366.method416();
						int var98 = field366.method404();
						int var99 = field366.method402();
						if (var99 == 255) {
							var99 = field366.method407();
						}

						if (var97 >= 0 && var97 < var96.field1167.length) {
							var96.field1167[var97] = var98;
							var96.field1206[var97] = var99;
						}
					}

					field389 = -1;
					return true;
				}

				if (field389 == 23) {
					int var100 = field366.method404();
					int var101 = field366.method430();
					int var102 = field366.method429();
					ULLVQOAK.field1172[var101].field1180 = (var102 << 16) + var100;
					field389 = -1;
					return true;
				}

				if (field389 == 65) {
					field53 = field366.method402();
					field389 = -1;
					return true;
				}

				if (field389 == 74) {
					int var103 = field366.method429();
					method112(var103);

					if (field120 != -1) {
						field120 = -1;
						field232 = true;
					}

					if (field106 != 0) {
						field106 = 0;
						field232 = true;
					}

					field125 = var103;
					field161 = true;
					field123 = true;
					field229 = -1;
					field379 = false;
					field389 = -1;
					return true;
				}

				if (field389 == 64) {
					field77 = field366.method429() * 30;
					field389 = -1;
					return true;
				}

				if (field389 != 76) {
					if (field389 == 78) {
						String var105 = field366.method409();
						if (var105.endsWith(":tradereq:")) {
							String var106 = var105.substring(0, var105.indexOf(":"));
							long var107 = FBIFPAXF.method268(var106);
							boolean var109 = false;
							for (int var110 = 0; var110 < field225; var110++) {
								if (field300[var110] == var107) {
									var109 = true;
									break;
								}
							}

							if (!var109 && field327 == 0) {
								method131(var106, 4, "wishes to trade with you.");
							}
						} else if (var105.endsWith(":duelreq:")) {
							String var111 = var105.substring(0, var105.indexOf(":"));
							long var112 = FBIFPAXF.method268(var111);
							boolean var114 = false;
							for (int var115 = 0; var115 < field225; var115++) {
								if (field300[var115] == var112) {
									var114 = true;
									break;
								}
							}

							if (!var114 && field327 == 0) {
								method131(var111, 8, "wishes to duel with you.");
							}
						} else if (var105.endsWith(":chalreq:")) {
							String var116 = var105.substring(0, var105.indexOf(":"));
							long var117 = FBIFPAXF.method268(var116);
							boolean var119 = false;
							for (int var120 = 0; var120 < field225; var120++) {
								if (field300[var120] == var117) {
									var119 = true;
									break;
								}
							}

							if (!var119 && field327 == 0) {
								String var121 = var105.substring(var105.indexOf(":") + 1, var105.length() - 9);
								method131(var116, 8, var121);
							}
						} else {
							method131("", 0, var105);
						}

						field389 = -1;
						return true;
					}

					if (field389 == 95) {
						int var122 = field366.method436();
						int var123 = field366.method430();
						field455[var123] = var122;

						if (field405[var123] != var122) {
							field405[var123] = var122;
							method52(var123);
							field161 = true;

							if (field169 != -1) {
								field232 = true;
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 135) {
						int var124 = field366.method429();
						if (var124 == 0xFFFF) {
							var124 = -1;
						}

						if (field437 != var124 && field149 && !field365 && field57 == 0) {
							field92 = var124;
							field93 = true;
							field97.method284(2, field92);
						}

						field437 = var124;
						field389 = -1;
						return true;
					}

					if (field389 == 137) {
						int var125 = field366.method429();
						int var126 = field366.method435();
						if (field149 && !field365) {
							field92 = var125;
							field93 = false;
							field97.method284(2, field92);
							field57 = var126;
						}

						field389 = -1;
						return true;
					}

					if (field389 == 179) {
						int var127 = field366.method404();
						int var128 = field366.method402();
						int var129 = field366.method404();
						if (field78 && !field365 && field386 < 50) {
							field56[field386] = var127;
							field240[field386] = var128;
							field370[field386] = QQGIMXLX.field1067[var127] + var129;
							field386++;
						}

						field389 = -1;
						return true;
					}

					if (field389 == 239) {
						int var130 = field366.method402();
						int var131 = field366.method402();
						int var132 = field366.method402();
						int var133 = field366.method402();
						field189[var130] = true;
						field263[var130] = var131;
						field150[var130] = var132;
						field433[var130] = var133;
						field47[var130] = 0;
						field389 = -1;
						return true;
					}

					if (field389 == 21) {
						field264 = 0;
						field389 = -1;
						return true;
					}

					if (field389 == 131) {
						int var134 = field366.method431();
						ULLVQOAK var135 = ULLVQOAK.field1172[var134];
						for (int var136 = 0; var136 < var135.field1167.length; var136++) {
							var135.field1167[var136] = -1;
							var135.field1167[var136] = 0;
						}

						field389 = -1;
						return true;
					}

					if (field389 == 57) {
						field161 = true;
						int var137 = field366.method402();
						int var138 = field366.method422();
						int var139 = field366.method407();
						field68[var138] = var139;
						field159[var138] = var137;
						field148[var138] = 1;
						for (int var140 = 0; var140 < 98; var140++) {
							if (var139 >= field403[var140]) {
								field148[var138] = var140 + 2;
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 255) {
						field355 = field366.method402();
						field356 = field366.method402();
						field389 = -1;
						return true;
					}

					if (field389 == 185) {
						int var141 = field366.method429();
						int var142 = field366.method431();
						int var143 = field366.method430();
						int var144 = field366.method430();
						ULLVQOAK.field1172[var141].field1182 = var143;
						ULLVQOAK.field1172[var141].field1183 = var144;
						ULLVQOAK.field1172[var141].field1181 = var142;
						field389 = -1;
						return true;
					}

					if (field389 == 197) {
						field418 = false;
						field106 = 1;
						field454 = "";
						field232 = true;
						field389 = -1;
						return true;
					}

					if (field389 == 141) {
						int var145 = field366.method430();
						int var146 = field366.method420();

						if (var145 == 0xFFFF) {
							var145 = -1;
						}

						field334[var146] = var145;
						field161 = true;
						field123 = true;
						field389 = -1;
						return true;
					}

					if (field389 == 88) {
						long var147 = field366.method408();
						int var149 = field366.method402();
						String var150 = FBIFPAXF.method272(FBIFPAXF.method269(var147));
						for (int var151 = 0; var151 < field397; var151++) {
							if (field435[var151] == var147) {
								if (field100[var151] != var149) {
									field100[var151] = var149;
									field161 = true;

									if (var149 > 0) {
										method131("", 5, var150 + " has logged in.");
									}

									if (var149 == 0) {
										method131("", 5, var150 + " has logged out.");
									}
								}

								var150 = null;
								break;
							}
						}

						if (var150 != null && field397 < 200) {
							field435[field397] = var147;
							field177[field397] = var150;
							field100[field397] = var149;
							field397++;
							field161 = true;
						}

						boolean var152 = false;
						while (!var152) {
							var152 = true;
							for (int var153 = 0; var153 < field397 - 1; var153++) {
								if (field100[var153] != field362 && field100[var153 + 1] == field362 || field100[var153] == 0 && field100[var153 + 1] != 0) {
									int var154 = field100[var153];
									field100[var153] = field100[var153 + 1];
									field100[var153 + 1] = var154;
									String var155 = field177[var153];
									field177[var153] = field177[var153 + 1];
									field177[var153 + 1] = var155;
									long var156 = field435[var153];
									field435[var153] = field435[var153 + 1];
									field435[var153 + 1] = var156;
									field161 = true;
									var152 = false;
								}
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 228) {
						field225 = field388 / 8;
						for (int var158 = 0; var158 < field225; var158++) {
							field300[var158] = field366.method408();
						}

						field389 = -1;
						return true;
					}

					if (field389 == 160) {
						int var159 = field366.method430();
						method112(var159);

						if (field125 != -1) {
							field125 = -1;
							field161 = true;
							field123 = true;
						}

						if (field120 != -1) {
							field120 = -1;
							field232 = true;
						}

						if (field106 != 0) {
							field106 = 0;
							field232 = true;
						}

						field229 = var159;
						field379 = false;
						field389 = -1;
						return true;
					}

					if (field389 == 116) {
						long var160 = field366.method408();
						int var162 = field366.method407();
						int var163 = field366.method402();
						boolean var164 = false;
						for (int var165 = 0; var165 < 100; var165++) {
							if (field152[var165] == var162) {
								var164 = true;
								break;
							}
						}

						if (var163 <= 1) {
							for (int var166 = 0; var166 < field225; var166++) {
								if (field300[var166] == var160) {
									var164 = true;
									break;
								}
							}
						}

						if (!var164 && field327 == 0) {
							try {
								field152[field179] = var162;
								field179 = (field179 + 1) % 100;
								String var167 = GTOTZKQF.method315(field388 - 13, field366);
								if (var163 != 3) {
									var167 = NBTRSNNF.method470(var167);
								}

								if (var163 == 2 || var163 == 3) {
									method131("@cr2@" + FBIFPAXF.method272(FBIFPAXF.method269(var160)), 7, var167);
								} else if (var163 == 1) {
									method131("@cr1@" + FBIFPAXF.method272(FBIFPAXF.method269(var160)), 7, var167);
								} else {
									method131(FBIFPAXF.method272(FBIFPAXF.method269(var160)), 3, var167);
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 113) {
						field144 = field366.method402();
						field72 = field366.method430();
						field389 = -1;
						return true;
					}

					if (field389 == 71) {
						int var169 = field366.method431();
						method112(var169);

						if (field125 != -1) {
							field125 = -1;
							field161 = true;
							field123 = true;
						}

						field120 = var169;
						field232 = true;
						field229 = -1;
						field379 = false;
						field389 = -1;
						return true;
					}

					if (field389 == 55) {
						field67 = field366.method402();
						field371 = field366.method402();
						field440 = field366.method402();
						field89 = true;
						field232 = true;
						field389 = -1;
						return true;
					}

					if (field389 == 109) {
						int var170 = field366.method421();
						int var171 = field366.method402();
						String var172 = field366.method409();
						if (var170 >= 1 && var170 <= 5) {
							if (var172.equalsIgnoreCase("null")) {
								var172 = null;
							}

							field183[var170 - 1] = var172;
							field184[var170 - 1] = var171 == 0;
						}

						field389 = -1;
						return true;
					}

					if (field389 == 216) {
						field322 = true;
						field336 = field366.method402();
						field337 = field366.method402();
						field338 = field366.method404();
						field339 = field366.method402();
						field340 = field366.method402();
						if (field340 >= 100) {
							field113 = field336 * 128 + 64;
							field115 = field337 * 128 + 64;
							field114 = method141(field115, field273, field113) - field338;
						}

						field389 = -1;
						return true;
					}

					if (field389 == 3) {
						method113(field366, field388);
						field419 = false;
						field389 = -1;
						return true;
					}

					if (field389 == 196) {
						field315 = field366.method402();
						field161 = true;
						field123 = true;
						field389 = -1;
						return true;
					}

					if (field389 == 8) {
						field200 = field366.method429();
						field237 = field366.method436();
						field262 = field366.method421();
						field442 = field366.method420();
						field222 = field366.method429();

						if (field237 != 0 && field229 == -1) {
							signlink.dnslookup(FBIFPAXF.method271(field237));
							method89();
							short var173 = 650;
							if (field262 != 201 || field442 == 1) {
								var173 = 655;
							}

							field98 = "";
							field452 = false;

							for (int var174 = 0; var174 < ULLVQOAK.field1172.length; var174++) {
								if (ULLVQOAK.field1172[var174] != null && ULLVQOAK.field1172[var174].field1188 == var173) {
									field229 = ULLVQOAK.field1172[var174].field1192;
									break;
								}
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 192) {
						field305 = field366.method402();
						field389 = -1;
						return true;
					}

					if (field389 == 205) {
						int var175 = field366.method429();
						int var176 = field366.method431();
						int var177 = var175 >> 10 & 0x1F;
						int var178 = var175 >> 5 & 0x1F;
						int var179 = var175 & 0x1F;
						ULLVQOAK.field1172[var176].field1169 = (var179 << 3) + (var177 << 19) + (var178 << 11);
						field389 = -1;
						return true;
					}

					if (field389 == 152 || field389 == 120 || field389 == 194 || field389 == 127 || field389 == 47 || field389 == 81 || field389 == 170 || field389 == 86 || field389 == 254 || field389 == 75 || field389 == 124) {
						method136(field366, field389);
						field389 = -1;
						return true;
					}

					if (field389 == 140) {
						int var180 = field366.method404();
						byte var181 = field366.method424();
						field455[var180] = var181;

						if (field405[var180] != var181) {
							field405[var180] = var181;
							method52(var180);
							field161 = true;

							if (field169 != -1) {
								field232 = true;
							}
						}

						field389 = -1;
						return true;
					}

					if (field389 == 145) {
						int var182 = field366.method430();
						int var183 = field366.method431();
						ULLVQOAK.field1172[var182].field1195 = 1;
						ULLVQOAK.field1172[var182].field1196 = var183;
						field389 = -1;
						return true;
					}

					if (field389 == 206) {
						int var184 = field366.method429();
						int var185 = field366.method429();

						if (field120 != -1) {
							field120 = -1;
							field232 = true;
						}

						if (field106 != 0) {
							field106 = 0;
							field232 = true;
						}

						field229 = var184;
						field125 = var185;
						field161 = true;
						field123 = true;
						field379 = false;
						field389 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field389 + "," + field388 + " - " + field421 + "," + field422);
					method74();
					return true;
				}

				field322 = false;

				for (int var104 = 0; var104 < 5; var104++) {
					field189[var104] = false;
				}

				field389 = -1;
				return true;
			}

			int var34 = field181;
			int var35 = field182;
			if (field389 == 169) {
				var35 = field366.method430();
				var34 = field366.method429();
				field156 = false;
			}

			if (field389 == 243) {
				var34 = field366.method431();
				var35 = field366.method404();
				field366.method412();

				for (int var36 = 0; var36 < 4; var36++) {
					for (int var37 = 0; var37 < 13; var37++) {
						for (int var38 = 0; var38 < 13; var38++) {
							int var39 = field366.method413(1);
							if (var39 == 1) {
								field54[var36][var37][var38] = field366.method413(26);
							} else {
								field54[var36][var37][var38] = -1;
							}
						}
					}
				}

				field366.method414();
				field156 = true;
			}

			if (field181 == var34 && field182 == var35 && field380 == 2) {
				field389 = -1;
				return true;
			}

			field181 = var34;
			field182 = var35;
			field202 = (field181 - 6) * 8;
			field203 = (field182 - 6) * 8;
			field233 = false;
			if ((field181 / 8 == 48 || field181 / 8 == 49) && field182 / 8 == 48) {
				field233 = true;
			}

			if (field181 / 8 == 48 && field182 / 8 == 148) {
				field233 = true;
			}

			field380 = 1;
			field387 = System.currentTimeMillis();
			field83.method529();
			field348.method253("Loading - please wait.", 257, 151, 0);
			field348.method253("Loading - please wait.", 256, 150, 0xFFFFFF);
			field83.method530(4, 4, field817);

			if (field389 == 169) {
				int var40 = 0;
				for (int var41 = (field181 - 6) / 8; var41 <= (field181 + 6) / 8; var41++) {
					for (int var42 = (field182 - 6) / 8; var42 <= (field182 + 6) / 8; var42++) {
						var40++;
					}
				}

				field154 = new byte[var40][];
				field438 = new byte[var40][];
				field342 = new int[var40];
				field343 = new int[var40];
				field344 = new int[var40];
				int var43 = 0;
				for (int var44 = (field181 - 6) / 8; var44 <= (field181 + 6) / 8; var44++) {
					for (int var45 = (field182 - 6) / 8; var45 <= (field182 + 6) / 8; var45++) {
						field342[var43] = (var44 << 8) + var45;

						if (field233 && (var45 == 49 || var45 == 149 || var45 == 147 || var44 == 50 || var44 == 49 && var45 == 47)) {
							field343[var43] = -1;
							field344[var43] = -1;
							var43++;
						} else {
							int var46 = field343[var43] = field97.method285(var45, 0, var44);
							if (var46 != -1) {
								field97.method284(3, var46);
							}

							int var47 = field344[var43] = field97.method285(var45, 1, var44);
							if (var47 != -1) {
								field97.method284(3, var47);
							}

							var43++;
						}
					}
				}
			}

			if (field389 == 243) {
				int var48 = 0;
				int[] var49 = new int[676];
				for (int var50 = 0; var50 < 4; var50++) {
					for (int var51 = 0; var51 < 13; var51++) {
						for (int var52 = 0; var52 < 13; var52++) {
							int var53 = field54[var50][var51][var52];
							if (var53 != -1) {
								int var54 = var53 >> 14 & 0x3FF;
								int var55 = var53 >> 3 & 0x7FF;
								int var56 = (var54 / 8 << 8) + var55 / 8;
								for (int var57 = 0; var57 < var48; var57++) {
									if (var49[var57] == var56) {
										var56 = -1;
										break;
									}
								}

								if (var56 != -1) {
									var49[var48++] = var56;
								}
							}
						}
					}
				}

				field154 = new byte[var48][];
				field438 = new byte[var48][];
				field342 = new int[var48];
				field343 = new int[var48];
				field344 = new int[var48];
				for (int var58 = 0; var58 < var48; var58++) {
					int var59 = field342[var58] = var49[var58];
					int var60 = var59 >> 8 & 0xFF;
					int var61 = var59 & 0xFF;
					int var62 = field343[var58] = field97.method285(var61, 0, var60);
					if (var62 != -1) {
						field97.method284(3, var62);
					}

					int var63 = field344[var58] = field97.method285(var61, 1, var60);
					if (var63 != -1) {
						field97.method284(3, var63);
					}
				}
			}

			int var64 = field202 - field204;
			int var65 = field203 - field205;
			field204 = field202;
			field205 = field203;

			for (int var66 = 0; var66 < 16384; var66++) {
				TVKIEQYR var67 = field394[var66];
				if (var67 != null) {
					for (int var68 = 0; var68 < 10; var68++) {
						var67.field1389[var68] -= var64;
						var67.field1390[var68] -= var65;
					}

					var67.field1391 -= var64 * 128;
					var67.field1392 -= var65 * 128;
				}
			}

			for (int var69 = 0; var69 < field251; var69++) {
				AHUILQJH var70 = field253[var69];
				if (var70 != null) {
					for (int var71 = 0; var71 < 10; var71++) {
						var70.field1389[var71] -= var64;
						var70.field1390[var71] -= var65;
					}

					var70.field1391 -= var64 * 128;
					var70.field1392 -= var65 * 128;
				}
			}

			field419 = true;
			byte var72 = 0;
			byte var73 = 104;
			byte var74 = 1;
			if (var64 < 0) {
				var72 = 103;
				var73 = -1;
				var74 = -1;
			}

			byte var75 = 0;
			byte var76 = 104;
			byte var77 = 1;
			if (var65 < 0) {
				var75 = 103;
				var76 = -1;
				var77 = -1;
			}

			for (int var78 = var72; var78 != var73; var78 += var74) {
				for (int var79 = var75; var79 != var76; var79 += var77) {
					int var80 = var64 + var78;
					int var81 = var65 + var79;
					for (int var82 = 0; var82 < 4; var82++) {
						if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
							field372[var82][var78][var79] = field372[var82][var80][var81];
						} else {
							field372[var82][var78][var79] = null;
						}
					}
				}
			}

			for (QXQLENZA var83 = (QXQLENZA) field227.method451(); var83 != null; var83 = (QXQLENZA) field227.method453()) {
				var83.field1081 -= var64;
				var83.field1082 -= var65;
				if (var83.field1081 < 0 || var83.field1082 < 0 || var83.field1081 >= 104 || var83.field1082 >= 104) {
					var83.method156();
				}
			}

			if (field264 != 0) {
				field264 -= var64;
				field265 -= var65;
			}

			field322 = false;
			field389 = -1;
			return true;
		} catch (IOException var190) {
			method13();
		} catch (Exception var191) {
			String var187 = "T2 - " + field389 + "," + field421 + "," + field422 + " - " + field388 + "," + (field119.field1389[0] + field202) + "," + (field119.field1390[0] + field203) + " - ";
			for (int var188 = 0; var188 < field388 && var188 < 50; var188++) {
				var187 = var187 + field366.field901[var188] + ",";
			}

			signlink.reporterror(var187);
			method74();
		}

		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method118() {
		for (int var1 = 0; var1 < field386; var1++) {
			if (field370[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field56[var1] != field275 || field240[var1] != field261) {
						LDILQFVA var3 = QQGIMXLX.method503(field56[var1], field240[var1]);
						if (System.currentTimeMillis() + var3.field902 / 22 > field118 / 22 + field359) {
							field118 = var3.field902;
							field359 = System.currentTimeMillis();

							if (method78(var3.field901, var3.field902)) {
								field275 = field56[var1];
								field261 = field240[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method145()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field370[var1] != -5) {
					field370[var1] = -5;
				} else {
					field386--;
					for (int var5 = var1; var5 < field386; var5++) {
						field56[var5] = field56[var5 + 1];
						field240[var5] = field240[var5 + 1];
						field370[var5] = field370[var5 + 1];
					}

					var1--;
				}
			} else {
				field370[var1]--;
			}
		}

		if (field57 > 0) {
			field57 -= 20;
			if (field57 < 0) {
				field57 = 0;
			}

			if (field57 == 0 && field149 && !field365) {
				field92 = field437;
				field93 = true;
				field97.method284(2, field92);
				return;
			}
		}
	}

	@ObfuscatedName("client.E(I)Ljava/lang/String;")
	public final String method119() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field820 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method120() {
		if (field444 != 0) {
			int var1 = 0;
			if (field77 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field188[var2] != null) {
					int var3 = field186[var2];
					String var4 = field187[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field371 == 0 || field371 == 1 && method36(var4))) {
						int var8 = 329 - var1 * 13;
						if (field825 > 4 && field826 - 4 > var8 - 10 && field826 - 4 <= var8 + 3) {
							int var9 = field348.method255("From:  " + var4 + field188[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field825 < var9 + 4) {
								if (field131 >= 1) {
									field163[field367] = "Report abuse @whi@" + var4;
									field318[field367] = 2200;
									field367++;
								}

								field163[field367] = "Add ignore @whi@" + var4;
								field318[field367] = 2076;
								field367++;
								field163[field367] = "Add friend @whi@" + var4;
								field318[field367] = 2394;
								field367++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field371 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method121() {
		try {
			int var1 = field119.field1391 + field353;
			int var2 = field119.field1392 + field70;
			if (field323 - var1 < -500 || field323 - var1 > 500 || field324 - var2 < -500 || field324 - var2 > 500) {
				field323 = var1;
				field324 = var2;
			}

			if (field323 != var1) {
				field323 += (var1 - field323) / 16;
			}

			if (field324 != var2) {
				field324 += (var2 - field324) / 16;
			}

			if (field835[1] == 1) {
				field75 += (-field75 - 24) / 2;
			} else if (field835[2] == 1) {
				field75 += (24 - field75) / 2;
			} else {
				field75 /= 2;
			}

			if (field835[3] == 1) {
				field76 += (12 - field76) / 2;
			} else if (field835[4] == 1) {
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

			int var3 = field323 >> 7;
			int var4 = field324 >> 7;
			int var5 = method141(field324, field273, field323);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field273;
						if (var9 < 3 && (field425[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field259[var9][var7][var8];
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

			if (var11 > field341) {
				field341 += (var11 - field341) / 24;
			} else if (var11 < field341) {
				field341 += (var11 - field341) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field119.field1391 + "," + field119.field1392 + "," + field323 + "," + field324 + "," + field181 + "," + field182 + "," + field202 + "," + field203);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIIIIILULLVQOAK;ZI)V")
	public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, ULLVQOAK arg5, boolean arg6, int arg7) {
		if (field301) {
			field451 = 32;
		} else {
			field451 = 0;
		}

		field301 = false;
		if (arg0 >= arg3 && arg0 < arg3 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
			arg5.field1201 -= field378 * 4;

			if (arg6) {
				field161 = true;
				return;
			}
		} else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
			arg5.field1201 += field378 * 4;

			if (arg6) {
				field161 = true;
				return;
			}
		} else if (arg0 >= arg3 - field451 && arg0 < arg3 + field451 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && field378 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg1 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg5.field1201 = (arg7 - arg4) * var10 / var11;

			if (arg6) {
				field161 = true;
			}

			field301 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method123() {
		int var1 = 5;
		field328[8] = 0;
		int var2 = 0;
		while (field328[8] == 0) {
			String var3 = "Unknown problem";
			method23("Connecting to web server", 20);

			try {
				DataInputStream var4 = method106("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 327);
				LDILQFVA var5 = new LDILQFVA(new byte[40]);
				var4.readFully(var5.field901, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field328[var6] = var5.method407();
				}

				int var7 = var5.method407();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field328[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field328[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field328[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field328[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field328[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field328[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method23("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method23(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field291 = !field291;
			}
		}
	}

	@ObfuscatedName("client.a(IILLDILQFVA;)V")
	public final void method124(int arg0, LDILQFVA arg1) {
		for (int var3 = 0; var3 < field256; var3++) {
			int var4 = field257[var3];
			AHUILQJH var5 = field253[var4];
			int var6 = arg1.method402();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method402() << 8;
			}

			method127(var4, arg1, var6, var5);
		}
	}

	@ObfuscatedName("client.c(ILLDILQFVA;I)V")
	public final void method125(int arg0, LDILQFVA arg1) {
		while (arg1.field903 + 21 < arg0 * 8) {
			int var3 = arg1.method413(14);
			if (var3 == 16383) {
				break;
			}

			if (field394[var3] == null) {
				field394[var3] = new TVKIEQYR();
			}

			TVKIEQYR var4 = field394[var3];
			field396[field395++] = var3;
			var4.field1442 = field221;
			int var5 = arg1.method413(1);
			if (var5 == 1) {
				field257[field256++] = var3;
			}

			var4.field1135 = ZNUYRYPY.method589(arg1.method413(12));
			int var6 = arg1.method413(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method413(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method413(1);
			var4.field1414 = var4.field1135.field1455;
			var4.field1405 = var4.field1135.field1477;
			var4.field1423 = var4.field1135.field1462;
			var4.field1424 = var4.field1135.field1473;
			var4.field1425 = var4.field1135.field1459;
			var4.field1426 = var4.field1135.field1450;
			var4.field1402 = var4.field1135.field1463;
			var4.method577(field119.field1390[0] + var7, var8 == 1, field119.field1389[0] + var6);
		}

		arg1.method414();
	}

	@ObfuscatedName("client.a(ILLKEIRLLI;)V")
	public final void method126(LKEIRLLI arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field449.length; var3++) {
			field449[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field449[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field450[var9] = (field449[var9 - 1] + field449[var9 + 1] + field449[var9 - 128] + field449[var9 + 128]) / 4;
				}
			}

			int[] var10 = field449;
			field449 = field450;
			field450 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field917; var12++) {
				for (int var13 = 0; var13 < arg0.field916; var13++) {
					if (arg0.field914[var11++] != 0) {
						int var14 = var13 + arg0.field918 + 16;
						int var15 = var12 + arg0.field919 + 16;
						int var16 = (var15 << 7) + var14;
						field449[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILLDILQFVA;ILAHUILQJH;B)V")
	public final void method127(int arg0, LDILQFVA arg1, int arg2, AHUILQJH arg3) {
		if ((arg2 & 0x4) != 0) {
			int var5 = arg1.method422();
			int var6 = arg1.method422();
			arg3.method576(var6, var5, field221);
			arg3.field1398 = field221 + 300;
			arg3.field1399 = arg1.method420();
			arg3.field1400 = arg1.method422();
		}

		if ((arg2 & 0x10) != 0) {
			int var7 = arg1.method430();
			if (var7 == 0xFFFF) {
				var7 = -1;
			}

			int var8 = arg1.method421();
			if (arg3.field1436 == var7 && var7 != -1) {
				int var9 = XKEHWKFH.field1362[var7].field1376;
				if (var9 == 1) {
					arg3.field1437 = 0;
					arg3.field1438 = 0;
					arg3.field1439 = var8;
					arg3.field1440 = 0;
				}

				if (var9 == 2) {
					arg3.field1440 = 0;
				}
			} else if (var7 == -1 || arg3.field1436 == -1 || XKEHWKFH.field1362[var7].field1370 >= XKEHWKFH.field1362[arg3.field1436].field1370) {
				arg3.field1436 = var7;
				arg3.field1437 = 0;
				arg3.field1438 = 0;
				arg3.field1439 = var8;
				arg3.field1440 = 0;
				arg3.field1432 = arg3.field1394;
			}
		}

		if ((arg2 & 0x80) != 0) {
			arg3.field1435 = arg1.method409();
			if (arg3.field1435.charAt(0) == '~') {
				arg3.field1435 = arg3.field1435.substring(1);
				method131(arg3.field16, 2, arg3.field1435);
			} else if (field119 == arg3) {
				method131(arg3.field16, 2, arg3.field1435);
			}

			arg3.field1430 = 0;
			arg3.field1388 = 0;
			arg3.field1441 = 150;
		}

		if ((arg2 & 0x200) != 0) {
			int var10 = arg1.method421();
			int var11 = arg1.method422();
			arg3.method576(var11, var10, field221);
			arg3.field1398 = field221 + 300;
			arg3.field1399 = arg1.method402();
			arg3.field1400 = arg1.method422();
		}

		if ((arg2 & 0x40) != 0) {
			int var12 = arg1.method404();
			int var13 = arg1.method421();
			int var14 = arg1.method402();
			int var15 = arg1.field902;

			if (arg3.field16 != null && arg3.field15) {
				long var16 = FBIFPAXF.method268(arg3.field16);
				boolean var18 = false;
				if (var13 <= 1) {
					for (int var19 = 0; var19 < field225; var19++) {
						if (field300[var19] == var16) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field327 == 0) {
					try {
						field393.field902 = 0;
						arg1.method440(var14, field393.field901, 0);
						field393.field902 = 0;
						String var20 = GTOTZKQF.method315(var14, field393);
						var20 = NBTRSNNF.method470(var20);
						arg3.field1435 = var20;
						arg3.field1430 = var12 >> 8;
						arg3.field1388 = var12 & 0xFF;
						arg3.field1441 = 150;

						if (var13 == 2 || var13 == 3) {
							method131("@cr2@" + arg3.field16, 1, var20);
						} else if (var13 == 1) {
							method131("@cr1@" + arg3.field16, 1, var20);
						} else {
							method131(arg3.field16, 2, var20);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field902 = var14 + var15;
		}

		if ((arg2 & 0x2) != 0) {
			arg3.field1428 = arg1.method431();
			arg3.field1429 = arg1.method430();
		}

		if ((arg2 & 0x8) != 0) {
			arg3.field1431 = arg1.method430();
			if (arg3.field1431 == 0xFFFF) {
				arg3.field1431 = -1;
			}
		}

		if ((arg2 & 0x1) != 0) {
			int var22 = arg1.method421();
			byte[] var23 = new byte[var22];
			LDILQFVA var24 = new LDILQFVA(var23);
			arg1.method439(0, var22, var23);
			field258[arg0] = var24;
			arg3.method4(var24);
		}

		if ((arg2 & 0x400) != 0) {
			arg3.field1416 = arg1.method421();
			arg3.field1418 = arg1.method420();
			arg3.field1417 = arg1.method421();
			arg3.field1419 = arg1.method402();
			arg3.field1420 = arg1.method431() + field221;
			arg3.field1421 = arg1.method431() + field221;
			arg3.field1422 = arg1.method421();
			arg3.method575();
		}

		if ((arg2 & 0x100) != 0) {
			arg3.field1409 = arg1.method404();
			int var25 = arg1.method436();
			arg3.field1413 = var25 >> 16;
			arg3.field1412 = (var25 & 0xFFFF) + field221;
			arg3.field1410 = 0;
			arg3.field1411 = 0;

			if (arg3.field1412 > field221) {
				arg3.field1410 = -1;
			}

			if (arg3.field1409 == 0xFFFF) {
				arg3.field1409 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method128() {
		field333 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field448[var1] = -1;
			for (int var2 = 0; var2 < YMQGRGSI.field1380; var2++) {
				if (!YMQGRGSI.field1381[var2].field1387 && YMQGRGSI.field1381[var2].field1382 == var1 + (field357 ? 0 : 7)) {
					field448[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method129() {
		field176++;
		method92(true);
		method116(true);
		method92(false);
		method116(false);
		method137();
		method138();

		if (!field322) {
			int var1 = field73;
			if (field341 / 256 > var1) {
				var1 = field341 / 256;
			}

			if (field189[4] && field150[4] + 128 > var1) {
				var1 = field150[4] + 128;
			}

			int var2 = field74 + field170 & 0x7FF;
			method25(field324, var1 * 3 + 600, field323, var2, var1, method141(field119.field1392, field273, field119.field1391) - 50);
		}

		int var3;
		if (field322) {
			var3 = method108();
		} else {
			var3 = method107();
		}

		int var4 = field113;
		int var5 = field114;
		int var6 = field115;
		int var7 = field116;
		int var8 = field117;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field189[var9]) {
				int var10 = (int) (Math.random() * (field263[var9] * 2 + 1) + Math.sin(field433[var9] / 100.0D * field47[var9]) * field150[var9] - field263[var9]);
				if (var9 == 0) {
					field113 += var10;
				}

				if (var9 == 1) {
					field114 += var10;
				}

				if (var9 == 2) {
					field115 += var10;
				}

				if (var9 == 3) {
					field117 = field117 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field116 += var10;
					if (field116 < 128) {
						field116 = 128;
					}

					if (field116 > 383) {
						field116 = 383;
					}
				}
			}
		}

		int var11 = GSZOCBMU.field705;
		HEQROJXW.field775 = true;
		HEQROJXW.field778 = 0;
		HEQROJXW.field776 = field825 - 4;
		HEQROJXW.field777 = field826 - 4;
		SXFSGYHA.method519();
		field158.method197(field115, field113, var3, field117, field114, field116);
		field158.method172();
		method135();
		method63();
		method34(var11);
		method44();
		field83.method530(4, 4, field817);
		field113 = var4;
		field114 = var5;
		field115 = var6;
		field116 = var7;
		field117 = var8;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method130(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(BLjava/lang/String;ILjava/lang/String;)V")
	public final void method131(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field169 != -1) {
			field69 = arg2;
			field831 = 0;
		}

		if (field120 == -1) {
			field232 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field186[var4] = field186[var4 - 1];
			field187[var4] = field187[var4 - 1];
			field188[var4] = field188[var4 - 1];
		}

		field186[0] = arg1;
		field187[0] = arg0;
		field188[0] = arg2;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method132() {
		if (field831 == 1) {
			if (field832 >= 6 && field832 <= 106 && field833 >= 467 && field833 <= 499) {
				field67 = (field67 + 1) % 4;
				field89 = true;
				field232 = true;
				field292.method391(39);
				field292.method392(field67);
				field292.method392(field371);
				field292.method392(field440);
			}

			if (field832 >= 135 && field832 <= 235 && field833 >= 467 && field833 <= 499) {
				field371 = (field371 + 1) % 3;
				field89 = true;
				field232 = true;
				field292.method391(39);
				field292.method392(field67);
				field292.method392(field371);
				field292.method392(field440);
			}

			if (field832 >= 273 && field832 <= 373 && field833 >= 467 && field833 <= 499) {
				field440 = (field440 + 1) % 3;
				field89 = true;
				field232 = true;
				field292.method391(39);
				field292.method392(field67);
				field292.method392(field371);
				field292.method392(field440);
			}

			if (field832 >= 412 && field832 <= 512 && field833 >= 467 && field833 <= 499) {
				if (field229 == -1) {
					method89();
					field98 = "";
					field452 = false;

					for (int var1 = 0; var1 < ULLVQOAK.field1172.length; var1++) {
						if (ULLVQOAK.field1172[var1] != null && ULLVQOAK.field1172[var1].field1188 == 600) {
							field441 = field229 = ULLVQOAK.field1172[var1].field1192;
							return;
						}
					}

					return;
				}

				method131("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method133() {
		if (field48 == 0 && field38 == 0) {
			field163[field367] = "Walk here";
			field318[field367] = 84;
			field316[field367] = field825;
			field317[field367] = field826;
			field367++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < HEQROJXW.field778; var2++) {
			int var3 = HEQROJXW.field779[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field158.method188(field273, var4, var5, var3) >= 0) {
					USIJLMTP var8 = USIJLMTP.method555(var7);
					if (var8.field1265 != null) {
						var8 = var8.method547();
					}

					if (var8 == null) {
						continue;
					}

					if (field48 == 1) {
						field163[field367] = "Use " + field52 + " with @cya@" + var8.field1260;
						field318[field367] = 584;
						field319[field367] = var3;
						field316[field367] = var4;
						field317[field367] = var5;
						field367++;
					} else if (field38 != 1) {
						if (var8.field1252 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1252[var9] != null) {
									field163[field367] = var8.field1252[var9] + " @cya@" + var8.field1260;

									if (var9 == 0) {
										field318[field367] = 329;
									}

									if (var9 == 1) {
										field318[field367] = 549;
									}

									if (var9 == 2) {
										field318[field367] = 478;
									}

									if (var9 == 3) {
										field318[field367] = 499;
									}

									if (var9 == 4) {
										field318[field367] = 1174;
									}

									field319[field367] = var3;
									field316[field367] = var4;
									field317[field367] = var5;
									field367++;
								}
							}
						}

						field163[field367] = "Examine @cya@" + var8.field1260;
						field318[field367] = 1951;
						field319[field367] = var8.field1266 << 14;
						field316[field367] = var4;
						field317[field367] = var5;
						field367++;
					} else if ((field40 & 0x4) == 4) {
						field163[field367] = field41 + " @cya@" + var8.field1260;
						field318[field367] = 144;
						field319[field367] = var3;
						field316[field367] = var4;
						field317[field367] = var5;
						field367++;
					}
				}

				if (var6 == 1) {
					TVKIEQYR var10 = field394[var7];
					if (var10.field1135.field1455 == 1 && (var10.field1391 & 0x7F) == 0x40 && (var10.field1392 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field395; var11++) {
							TVKIEQYR var12 = field394[field396[var11]];
							if (var12 != null && var10 != var12 && var12.field1135.field1455 == 1 && var10.field1391 == var12.field1391 && var10.field1392 == var12.field1392) {
								method147(var5, var12.field1135, field396[var11], var4);
							}
						}

						for (int var13 = 0; var13 < field254; var13++) {
							AHUILQJH var14 = field253[field255[var13]];
							if (var14 != null && var10.field1391 == var14.field1391 && var10.field1392 == var14.field1392) {
								method109(field255[var13], var5, var14, var4);
							}
						}
					}

					method147(var5, var10.field1135, var7, var4);
				}

				if (var6 == 0) {
					AHUILQJH var15 = field253[var7];
					if ((var15.field1391 & 0x7F) == 0x40 && (var15.field1392 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field395; var16++) {
							TVKIEQYR var17 = field394[field396[var16]];
							if (var17 != null && var17.field1135.field1455 == 1 && var15.field1391 == var17.field1391 && var15.field1392 == var17.field1392) {
								method147(var5, var17.field1135, field396[var16], var4);
							}
						}

						for (int var18 = 0; var18 < field254; var18++) {
							AHUILQJH var19 = field253[field255[var18]];
							if (var19 != null && var15 != var19 && var15.field1391 == var19.field1391 && var15.field1392 == var19.field1392) {
								method109(field255[var18], var5, var19, var4);
							}
						}
					}

					method109(var7, var5, var15, var4);
				}

				if (var6 == 3) {
					LOISKKJJ var20 = field372[field273][var4][var5];
					if (var20 != null) {
						for (XMCAJXJH var21 = (XMCAJXJH) var20.method452(); var21 != null; var21 = (XMCAJXJH) var20.method454()) {
							KNYKYROC var22 = KNYKYROC.method380(var21.field1378);
							if (field48 == 1) {
								field163[field367] = "Use " + field52 + " with @lre@" + var22.field865;
								field318[field367] = 726;
								field319[field367] = var21.field1378;
								field316[field367] = var4;
								field317[field367] = var5;
								field367++;
							} else if (field38 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field871 != null && var22.field871[var23] != null) {
										field163[field367] = var22.field871[var23] + " @lre@" + var22.field865;

										if (var23 == 0) {
											field318[field367] = 748;
										}

										if (var23 == 1) {
											field318[field367] = 253;
										}

										if (var23 == 2) {
											field318[field367] = 978;
										}

										if (var23 == 3) {
											field318[field367] = 100;
										}

										if (var23 == 4) {
											field318[field367] = 698;
										}

										field319[field367] = var21.field1378;
										field316[field367] = var4;
										field317[field367] = var5;
										field367++;
									} else if (var23 == 2) {
										field163[field367] = "Take @lre@" + var22.field865;
										field318[field367] = 978;
										field319[field367] = var21.field1378;
										field316[field367] = var4;
										field317[field367] = var5;
										field367++;
									}
								}

								field163[field367] = "Examine @lre@" + var22.field865;
								field318[field367] = 1022;
								field319[field367] = var21.field1378;
								field316[field367] = var4;
								field317[field367] = var5;
								field367++;
							} else if ((field40 & 0x1) == 1) {
								field163[field367] = field41 + " @lre@" + var22.field865;
								field318[field367] = 174;
								field319[field367] = var21.field1378;
								field316[field367] = var4;
								field317[field367] = var5;
								field367++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method134() {
		field358 = false;
		while (field162) {
			field358 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field293 = null;
		field294 = null;
		field304 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field167 = null;
		field449 = null;
		field450 = null;
		field145 = null;
		field146 = null;
		field302 = null;
		field303 = null;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method135() {
		field133 = 0;
		for (int var1 = -1; var1 < field395 + field254; var1++) {
			ZGJLFNLC var2;
			if (var1 == -1) {
				var2 = field119;
			} else if (var1 < field254) {
				var2 = field253[field255[var1]];
			} else {
				var2 = field394[field396[var1 - field254]];
			}

			if (var2 != null && var2.method3()) {
				if (var2 instanceof TVKIEQYR) {
					ZNUYRYPY var3 = ((TVKIEQYR) var2).field1135;
					if (var3.field1464 != null) {
						var3 = var3.method591();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field254) {
					ZNUYRYPY var7 = ((TVKIEQYR) var2).field1135;
					if (var7.field1461 >= 0 && var7.field1461 < field374.length) {
						method84(var2, var2.field1404 + 15);

						if (field79 > -1) {
							field374[var7.field1461].method219(field80 - 30, field79 - 12);
						}
					}

					if (field352 == 1 && field396[var1 - field254] == field236 && field221 % 20 < 10) {
						method84(var2, var2.field1404 + 15);

						if (field79 > -1) {
							field374[2].method219(field80 - 28, field79 - 12);
						}
					}
				} else {
					int var4 = 30;
					AHUILQJH var5 = (AHUILQJH) var2;
					if (var5.field18 != 0) {
						method84(var2, var2.field1404 + 15);

						if (field79 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field18 & 1 << var6) != 0) {
									field374[var6].method219(field80 - var4, field79 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field352 == 10 && field255[var1] == field335) {
						method84(var2, var2.field1404 + 15);

						if (field79 > -1) {
							field374[7].method219(field80 - var4, field79 - 12);
						}
					}
				}

				if (var2.field1435 != null && (var1 >= field254 || field67 == 0 || field67 == 3 || field67 == 1 && method36(((AHUILQJH) var2).field16))) {
					method84(var2, var2.field1404);

					if (field79 > -1 && field133 < field134) {
						field138[field133] = field349.method256(var2.field1435) / 2;
						field137[field133] = field349.field622;
						field135[field133] = field79;
						field136[field133] = field80;
						field139[field133] = var2.field1430;
						field140[field133] = var2.field1388;
						field141[field133] = var2.field1441;
						field142[field133++] = var2.field1435;

						if (field185 == 0 && var2.field1388 >= 1 && var2.field1388 <= 3) {
							field137[field133] += 10;
							field136[field133] += 5;
						}

						if (field185 == 0 && var2.field1388 == 4) {
							field138[field133] = 60;
						}

						if (field185 == 0 && var2.field1388 == 5) {
							field137[field133] += 5;
						}
					}
				}

				if (var2.field1398 > field221) {
					method84(var2, var2.field1404 + 15);

					if (field79 > -1) {
						int var8 = var2.field1399 * 30 / var2.field1400;
						if (var8 > 30) {
							var8 = 30;
						}

						SXFSGYHA.method521(0xFF00, var8, field79 - 15, field80 - 3, 5);
						SXFSGYHA.method521(0xFF0000, 30 - var8, field79 - 15 + var8, field80 - 3, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1408[var9] > field221) {
						method84(var2, var2.field1404 / 2);

						if (field79 > -1) {
							if (var9 == 1) {
								field80 -= 20;
							}

							if (var9 == 2) {
								field79 -= 15;
								field80 -= 10;
							}

							if (var9 == 3) {
								field79 += 15;
								field80 -= 10;
							}

							field87[var2.field1407[var9]].method219(field80 - 12, field79 - 12);
							field347.method253(String.valueOf(var2.field1406[var9]), field79, field80 + 4, 0);
							field347.method253(String.valueOf(var2.field1406[var9]), field79 - 1, field80 + 3, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field133; var10++) {
			int var11 = field135[var10];
			int var12 = field136[var10];
			int var13 = field138[var10];
			int var14 = field137[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field136[var16] - field137[var16] && var12 - var14 < field136[var16] + 2 && var11 - var13 < field138[var16] + field135[var16] && var11 + var13 > field135[var16] - field138[var16] && field136[var16] - field137[var16] < var12) {
						var12 = field136[var16] - field137[var16];
						var15 = true;
					}
				}
			}

			field79 = field135[var10];
			field80 = field136[var10] = var12;
			String var17 = field142[var10];
			if (field185 == 0) {
				int var18 = 0xFFFF00;
				if (field139[var10] < 6) {
					var18 = field112[field139[var10]];
				}

				if (field139[var10] == 6) {
					var18 = field176 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field139[var10] == 7) {
					var18 = field176 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field139[var10] == 8) {
					var18 = field176 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field139[var10] == 9) {
					int var19 = 150 - field141[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field139[var10] == 10) {
					int var20 = 150 - field141[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field139[var10] == 11) {
					int var21 = 150 - field141[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field140[var10] == 0) {
					field349.method253(var17, field79, field80 + 1, 0);
					field349.method253(var17, field79, field80, var18);
				}

				if (field140[var10] == 1) {
					field349.method258(var17, field176, 0, field80 + 1, field79);
					field349.method258(var17, field176, var18, field80, field79);
				}

				if (field140[var10] == 2) {
					field349.method259(var17, 0, field176, field79, field80 + 1);
					field349.method259(var17, var18, field176, field79, field80);
				}

				if (field140[var10] == 3) {
					field349.method260(var17, field80 + 1, field79, 0, 150 - field141[var10], field176);
					field349.method260(var17, field80, field79, var18, 150 - field141[var10], field176);
				}

				if (field140[var10] == 4) {
					int var22 = field349.method256(var17);
					int var23 = (150 - field141[var10]) * (var22 + 100) / 150;
					SXFSGYHA.method518(0, field79 + 50, 334, field79 - 50);
					field349.method257(field79 + 50 - var23, var17, field80 + 1, 0);
					field349.method257(field79 + 50 - var23, var17, field80, var18);
					SXFSGYHA.method517();
				}

				if (field140[var10] == 5) {
					int var24 = 150 - field141[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					SXFSGYHA.method518(field80 - field349.field622 - 1, 512, field80 + 5, 0);
					field349.method253(var17, field79, field80 + var25 + 1, 0);
					field349.method253(var17, field79, field80 + var25, var18);
					SXFSGYHA.method517();
				}
			} else {
				field349.method253(var17, field79, field80 + 1, 0);
				field349.method253(var17, field79, field80, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.c(ZLLDILQFVA;I)V")
	public final void method136(LDILQFVA arg0, int arg1) {
		if (arg1 == 81) {
			int var3 = arg0.method402();
			int var4 = (var3 >> 4 & 0x7) + field355;
			int var5 = (var3 & 0x7) + field356;
			int var6 = var4 + arg0.method403();
			int var7 = var5 + arg0.method403();
			int var8 = arg0.method405();
			int var9 = arg0.method404();
			int var10 = arg0.method402() * 4;
			int var11 = arg0.method402() * 4;
			int var12 = arg0.method404();
			int var13 = arg0.method404();
			int var14 = arg0.method402();
			int var15 = arg0.method402();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 0xFFFF) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				LQMHWDJZ var16 = new LQMHWDJZ(var9, field273, method141(var5, field273, var4) - var10, var8, var11, field221 + var12, field221 + var13, var4, var5, var15, var14);
				var16.method458(var7, method141(var7, field273, var6) - var11, var6, field221 + var12);
				field332.method448(var16);
			}
		} else {
			if (arg1 == 152) {
				int var17 = arg0.method402();
				int var18 = (var17 >> 4 & 0x7) + field355;
				int var19 = (var17 & 0x7) + field356;
				int var20 = arg0.method404();
				int var21 = arg0.method402();
				int var22 = var21 >> 4 & 0xF;
				int var23 = var21 & 0x7;
				if (field119.field1389[0] >= var18 - var22 && field119.field1389[0] <= var18 + var22 && field119.field1390[0] >= var19 - var22 && field119.field1390[0] <= var19 + var22 && field78 && !field365 && field386 < 50) {
					field56[field386] = var20;
					field240[field386] = var23;
					field370[field386] = QQGIMXLX.field1067[var20];
					field386++;
				}
			}

			if (arg1 == 170) {
				int var24 = arg0.method420();
				int var25 = (var24 >> 4 & 0x7) + field355;
				int var26 = (var24 & 0x7) + field356;
				int var27 = arg0.method430();
				if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
					LOISKKJJ var28 = field372[field273][var25][var26];
					if (var28 != null) {
						for (XMCAJXJH var29 = (XMCAJXJH) var28.method451(); var29 != null; var29 = (XMCAJXJH) var28.method453()) {
							if ((var27 & 0x7FFF) == var29.field1378) {
								var29.method156();
								break;
							}
						}

						if (var28.method451() == null) {
							field372[field273][var25][var26] = null;
						}

						method54(var25, var26);
					}
				}
			} else if (arg1 == 254) {
				int var30 = arg0.method421();
				int var31 = var30 >> 2;
				int var32 = var30 & 0x3;
				int var33 = field377[var31];
				int var34 = arg0.method422();
				int var35 = (var34 >> 4 & 0x7) + field355;
				int var36 = (var34 & 0x7) + field356;
				int var37 = arg0.method404();
				if (var35 >= 0 && var36 >= 0 && var35 < 103 && var36 < 103) {
					int var38 = field259[field273][var35][var36];
					int var39 = field259[field273][var35 + 1][var36];
					int var40 = field259[field273][var35 + 1][var36 + 1];
					int var41 = field259[field273][var35][var36 + 1];
					if (var33 == 0) {
						EBWGOMQJ var42 = field158.method180(var36, field273, var35);
						if (var42 != null) {
							int var43 = var42.field571 >> 14 & 0x7FFF;
							if (var31 == 2) {
								var42.field569 = new FSCCBLKX(var32 + 4, var39, false, var37, var43, 2, var38, var40, var41);
								var42.field570 = new FSCCBLKX(var32 + 1 & 0x3, var39, false, var37, var43, 2, var38, var40, var41);
							} else {
								var42.field569 = new FSCCBLKX(var32, var39, false, var37, var43, var31, var38, var40, var41);
							}
						}
					}

					if (var33 == 1) {
						PGCABBWD var44 = field158.method181(field273, var35, var36);
						if (var44 != null) {
							var44.field1015 = new FSCCBLKX(0, var39, false, var37, var44.field1016 >> 14 & 0x7FFF, 4, var38, var40, var41);
						}
					}

					if (var33 == 2) {
						DYDZTPTH var45 = field158.method182(field273, var35, var36);

						if (var31 == 11) {
							var31 = 10;
						}

						if (var45 != null) {
							var45.field554 = new FSCCBLKX(var32, var39, false, var37, var45.field562 >> 14 & 0x7FFF, var31, var38, var40, var41);
						}
					}

					if (var33 == 3) {
						WZHIQBVZ var46 = field158.method183(field273, var35, var36);
						if (var46 != null) {
							var46.field1358 = new FSCCBLKX(var32, var39, false, var37, var46.field1359 >> 14 & 0x7FFF, 22, var38, var40, var41);
						}
					}
				}
			} else if (arg1 == 47) {
				int var47 = arg0.method402();
				int var48 = (var47 >> 4 & 0x7) + field355;
				int var49 = (var47 & 0x7) + field356;
				int var50 = arg0.method404();
				int var51 = arg0.method402();
				int var52 = arg0.method404();
				if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
					var48 = var48 * 128 + 64;
					var49 = var49 * 128 + 64;
					DAUNRADK var53 = new DAUNRADK(var52, var50, method141(var49, field273, var48) - var51, field221, var49, var48, field273);
					field284.method448(var53);
				}
			} else if (arg1 == 120) {
				int var54 = arg0.method402();
				int var55 = (var54 >> 4 & 0x7) + field355;
				int var56 = (var54 & 0x7) + field356;
				int var57 = arg0.method404();
				int var58 = arg0.method404();
				int var59 = arg0.method404();
				if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
					LOISKKJJ var60 = field372[field273][var55][var56];
					if (var60 != null) {
						for (XMCAJXJH var61 = (XMCAJXJH) var60.method451(); var61 != null; var61 = (XMCAJXJH) var60.method453()) {
							if ((var57 & 0x7FFF) == var61.field1378 && var61.field1379 == var58) {
								var61.field1379 = var59;
								break;
							}
						}

						method54(var55, var56);
					}
				}
			} else if (arg1 == 75) {
				int var62 = arg0.method421();
				int var63 = var62 >> 2;
				int var64 = var62 & 0x3;
				int var65 = field377[var63];
				int var66 = arg0.method402();
				int var67 = (var66 >> 4 & 0x7) + field355;
				int var68 = (var66 & 0x7) + field356;
				if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
					method80(field273, var63, 0, var68, var65, var67, -1, -1, var64);
				}
			} else if (arg1 == 124) {
				int var69 = arg0.method422();
				int var70 = (var69 >> 4 & 0x7) + field355;
				int var71 = (var69 & 0x7) + field356;
				int var72 = arg0.method421();
				int var73 = var72 >> 2;
				int var74 = var72 & 0x3;
				int var75 = field377[var73];
				int var76 = arg0.method430();
				if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
					method80(field273, var73, 0, var71, var75, var70, -1, var76, var74);
				}
			} else {
				if (arg1 == 194) {
					byte var77 = arg0.method425();
					int var78 = arg0.method421();
					int var79 = var78 >> 2;
					int var80 = var78 & 0x3;
					int var81 = field377[var79];
					int var82 = arg0.method431();
					byte var83 = arg0.method425();
					int var84 = arg0.method404();
					int var85 = arg0.method404();
					int var86 = arg0.method429();
					byte var87 = arg0.method425();
					int var88 = arg0.method402();
					int var89 = (var88 >> 4 & 0x7) + field355;
					int var90 = (var88 & 0x7) + field356;
					byte var91 = arg0.method423();
					AHUILQJH var92;
					if (field72 == var84) {
						var92 = field119;
					} else {
						var92 = field253[var84];
					}

					if (var92 != null) {
						USIJLMTP var93 = USIJLMTP.method555(var86);
						int var94 = field259[field273][var89][var90];
						int var95 = field259[field273][var89 + 1][var90];
						int var96 = field259[field273][var89 + 1][var90 + 1];
						int var97 = field259[field273][var89][var90 + 1];
						HEQROJXW var98 = var93.method548(var79, var80, var94, var95, var96, var97, -1);
						if (var98 != null) {
							method80(field273, 0, var82 + 1, var90, var81, var89, var85 + 1, -1, 0);
							var92.field8 = field221 + var82;
							var92.field9 = field221 + var85;
							var92.field7 = var98;
							int var99 = var93.field1269;
							int var100 = var93.field1237;
							if (var80 == 1 || var80 == 3) {
								var99 = var93.field1237;
								var100 = var93.field1269;
							}

							var92.field4 = var89 * 128 + var99 * 64;
							var92.field6 = var90 * 128 + var100 * 64;
							var92.field5 = method141(var92.field6, field273, var92.field4);

							if (var91 > var87) {
								byte var101 = var91;
								var91 = var87;
								var87 = var101;
							}

							if (var77 > var83) {
								byte var102 = var77;
								var77 = var83;
								var83 = var102;
							}

							var92.field20 = var89 + var91;
							var92.field22 = var87 + var89;
							var92.field21 = var77 + var90;
							var92.field23 = var83 + var90;
						}
					}
				}

				if (arg1 == 127) {
					int var103 = arg0.method420();
					int var104 = (var103 >> 4 & 0x7) + field355;
					int var105 = (var103 & 0x7) + field356;
					int var106 = arg0.method430();
					int var107 = arg0.method404();
					int var108 = arg0.method404();
					if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104 && field72 != var108) {
						XMCAJXJH var109 = new XMCAJXJH();
						var109.field1378 = var106;
						var109.field1379 = var107;

						if (field372[field273][var104][var105] == null) {
							field372[field273][var104][var105] = new LOISKKJJ();
						}

						field372[field273][var104][var105].method448(var109);
						method54(var104, var105);
					}
				} else if (arg1 == 86) {
					int var110 = arg0.method429();
					int var111 = arg0.method429();
					int var112 = arg0.method402();
					int var113 = (var112 >> 4 & 0x7) + field355;
					int var114 = (var112 & 0x7) + field356;
					if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
						XMCAJXJH var115 = new XMCAJXJH();
						var115.field1378 = var111;
						var115.field1379 = var110;

						if (field372[field273][var113][var114] == null) {
							field372[field273][var113][var114] = new LOISKKJJ();
						}

						field372[field273][var113][var114].method448(var115);
						method54(var113, var114);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method137() {
		for (LQMHWDJZ var1 = (LQMHWDJZ) field332.method451(); var1 != null; var1 = (LQMHWDJZ) field332.method453()) {
			if (field273 != var1.field933 || field221 > var1.field939) {
				var1.method156();
			} else if (field221 >= var1.field938) {
				if (var1.field956 > 0) {
					TVKIEQYR var2 = field394[var1.field956 - 1];
					if (var2 != null && var2.field1391 >= 0 && var2.field1391 < 13312 && var2.field1392 >= 0 && var2.field1392 < 13312) {
						var1.method458(var2.field1392, method141(var2.field1392, var1.field933, var2.field1391) - var1.field943, var2.field1391, field221);
					}
				}

				if (var1.field956 < 0) {
					int var3 = -var1.field956 - 1;
					AHUILQJH var4;
					if (field72 == var3) {
						var4 = field119;
					} else {
						var4 = field253[var3];
					}

					if (var4 != null && var4.field1391 >= 0 && var4.field1391 < 13312 && var4.field1392 >= 0 && var4.field1392 < 13312) {
						var1.method458(var4.field1392, method141(var4.field1392, var1.field933, var4.field1391) - var1.field943, var4.field1391, field221);
					}
				}

				var1.method459(field369);
				field158.method169(field273, 60, (int) var1.field948, (int) var1.field950, -1, (int) var1.field949, false, var1.field952, var1);
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method138() {
		for (DAUNRADK var1 = (DAUNRADK) field284.method451(); var1 != null; var1 = (DAUNRADK) field284.method453()) {
			if (field273 != var1.field467 || var1.field471) {
				var1.method156();
			} else if (field221 >= var1.field466) {
				var1.method155(field369);

				if (var1.field471) {
					var1.method156();
				} else {
					field158.method169(var1.field467, 60, var1.field468, var1.field470, -1, var1.field469, false, 0, var1);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method139(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field158.method188(field273, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field132++;
		if (field132 > 99) {
			field132 = 0;
			field292.method391(217);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			USIJLMTP var8 = USIJLMTP.method555(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1269;
				var10 = var8.field1237;
			} else {
				var9 = var8.field1237;
				var10 = var8.field1269;
			}

			int var11 = var8.field1270;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method98(arg0, field119.field1389[0], 0, var9, var11, false, 2, var10, arg1, 0, field119.field1390[0]);
		} else {
			method98(arg0, field119.field1389[0], var7, 0, 0, false, 2, 0, arg1, var6 + 1, field119.field1390[0]);
		}

		field34 = field832;
		field35 = field833;
		field37 = 2;
		field36 = 0;
		return true;
	}

	@ObfuscatedName("client.a(ILULLVQOAK;III)V")
	public final void method140(int arg0, ULLVQOAK arg1, int arg2, int arg3) {
		if (arg1.field1176 == 0 && arg1.field1187 != null && (!arg1.field1208 || field286 == arg1.field1224 || field329 == arg1.field1224 || field436 == arg1.field1224)) {
			int var5 = SXFSGYHA.field1130;
			int var6 = SXFSGYHA.field1128;
			int var7 = SXFSGYHA.field1131;
			int var8 = SXFSGYHA.field1129;
			SXFSGYHA.method518(arg3, arg1.field1217 + arg0, arg1.field1218 + arg3, arg0);
			int var9 = arg1.field1187.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1210[var10] + arg0;
				int var12 = arg1.field1221[var10] + arg3 - arg2;
				ULLVQOAK var13 = ULLVQOAK.field1172[arg1.field1187[var10]];
				var11 += var13.field1173;
				var12 += var13.field1189;

				if (var13.field1188 > 0) {
					method15(var13);
				}

				if (var13.field1176 == 0) {
					if (var13.field1201 > var13.field1168 - var13.field1218) {
						var13.field1201 = var13.field1168 - var13.field1218;
					}

					if (var13.field1201 < 0) {
						var13.field1201 = 0;
					}

					method140(var11, var13, var13.field1201, var12);

					if (var13.field1168 > var13.field1218) {
						method39(var13.field1168, var13.field1201, var13.field1217 + var11, var13.field1218, var12);
					}
				} else if (var13.field1176 != 1) {
					if (var13.field1176 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1218; var15++) {
							for (int var16 = 0; var16 < var13.field1217; var16++) {
								int var17 = (var13.field1165 + 32) * var16 + var11;
								int var18 = (var13.field1199 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1213[var14];
									var18 += var13.field1179[var14];
								}

								if (var13.field1167[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1167[var14] - 1;
									if (var17 > SXFSGYHA.field1130 - 32 && var17 < SXFSGYHA.field1131 && var18 > SXFSGYHA.field1128 - 32 && var18 < SXFSGYHA.field1129 || field192 != 0 && field191 == var14) {
										int var22 = 0;
										if (field48 == 1 && field49 == var14 && field50 == var13.field1224) {
											var22 = 0xFFFFFF;
										}

										DUMEPGRH var23 = KNYKYROC.method377(var13.field1206[var14], var21, var22);
										if (var23 != null) {
											if (field192 != 0 && field191 == var14 && field190 == var13.field1224) {
												var19 = field825 - field193;
												var20 = field826 - field194;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field231 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method221(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < SXFSGYHA.field1128 && arg1.field1201 > 0) {
													int var24 = (SXFSGYHA.field1128 - var18 - var20) * field369 / 3;
													if (var24 > field369 * 10) {
														var24 = field369 * 10;
													}

													if (var24 > arg1.field1201) {
														var24 = arg1.field1201;
													}

													arg1.field1201 -= var24;
													field194 += var24;
												}

												if (var18 + var20 + 32 > SXFSGYHA.field1129 && arg1.field1201 < arg1.field1168 - arg1.field1218) {
													int var25 = (var18 + var20 + 32 - SXFSGYHA.field1129) * field369 / 3;
													if (var25 > field369 * 10) {
														var25 = field369 * 10;
													}

													if (var25 > arg1.field1168 - arg1.field1218 - arg1.field1201) {
														var25 = arg1.field1168 - arg1.field1218 - arg1.field1201;
													}

													arg1.field1201 += var25;
													field194 -= var25;
												}
											} else if (field314 != 0 && field313 == var14 && field312 == var13.field1224) {
												var23.method221(var17, 128, var18);
											} else {
												var23.method219(var18, var17);
											}

											if (var23.field548 == 33 || var13.field1206[var14] != 1) {
												int var26 = var13.field1206[var14];
												field347.method257(var17 + var19 + 1, method130(var26), var18 + var20 + 10, 0);
												field347.method257(var17 + var19, method130(var26), var18 + var20 + 9, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1191 != null && var14 < 20) {
									DUMEPGRH var27 = var13.field1191[var14];
									if (var27 != null) {
										var27.method219(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1176 == 3) {
						boolean var28 = false;
						if (field436 == var13.field1224 || field329 == var13.field1224 || field286 == var13.field1224) {
							var28 = true;
						}

						int var29;
						if (method91(var13)) {
							var29 = var13.field1215;
							if (var28 && var13.field1198 != 0) {
								var29 = var13.field1198;
							}
						} else {
							var29 = var13.field1169;
							if (var28 && var13.field1166 != 0) {
								var29 = var13.field1166;
							}
						}

						if (var13.field1216 == 0) {
							if (var13.field1220) {
								SXFSGYHA.method521(var29, var13.field1217, var11, var12, var13.field1218);
							} else {
								SXFSGYHA.method522(var29, var11, var13.field1217, var13.field1218, var12);
							}
						} else if (var13.field1220) {
							SXFSGYHA.method520(var29, var12, var13.field1218, 256 - (var13.field1216 & 0xFF), var13.field1217, var11);
						} else {
							SXFSGYHA.method523(var11, var29, 256 - (var13.field1216 & 0xFF), var13.field1217, var12, var13.field1218);
						}
					} else if (var13.field1176 == 4) {
						EYHVDWTF var30 = var13.field1207;
						String var31 = var13.field1211;
						boolean var32 = false;
						if (field436 == var13.field1224 || field329 == var13.field1224 || field286 == var13.field1224) {
							var32 = true;
						}

						int var33;
						if (method91(var13)) {
							var33 = var13.field1215;
							if (var32 && var13.field1198 != 0) {
								var33 = var13.field1198;
							}

							if (var13.field1212.length() > 0) {
								var31 = var13.field1212;
							}
						} else {
							var33 = var13.field1169;
							if (var32 && var13.field1166 != 0) {
								var33 = var13.field1166;
							}
						}

						if (var13.field1177 == 6 && field379) {
							var31 = "Please wait...";
							var33 = var13.field1169;
						}

						if (SXFSGYHA.field1126 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field622 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method59(method73(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method59(method73(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method59(method73(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method59(method73(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method59(method73(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1228) {
								var30.method254(var13.field1217 / 2 + var11, var34, var33, var41, var13.field1203);
							} else {
								var30.method261(var33, var11, var13.field1203, var41, var34);
							}

							var34 += var30.field622;
						}
					} else if (var13.field1176 == 5) {
						DUMEPGRH var42;
						if (method91(var13)) {
							var42 = var13.field1190;
						} else {
							var42 = var13.field1209;
						}

						if (var42 != null) {
							var42.method219(var12, var11);
						}
					} else if (var13.field1176 == 6) {
						int var43 = GSZOCBMU.field690;
						int var44 = GSZOCBMU.field691;
						GSZOCBMU.field690 = var13.field1217 / 2 + var11;
						GSZOCBMU.field691 = var13.field1218 / 2 + var12;
						int var45 = GSZOCBMU.field694[var13.field1182] * var13.field1181 >> 16;
						int var46 = GSZOCBMU.field695[var13.field1182] * var13.field1181 >> 16;
						boolean var47 = method91(var13);
						int var48;
						if (var47) {
							var48 = var13.field1194;
						} else {
							var48 = var13.field1193;
						}

						HEQROJXW var49;
						if (var48 == -1) {
							var49 = var13.method544(var47, -1, -1);
						} else {
							XKEHWKFH var50 = XKEHWKFH.field1362[var48];
							var49 = var13.method544(var47, var50.field1365[var13.field1200], var50.field1364[var13.field1200]);
						}

						if (var49 != null) {
							var49.method342(0, var13.field1183, 0, var13.field1182, 0, var45, var46);
						}

						GSZOCBMU.field690 = var43;
						GSZOCBMU.field691 = var44;
					} else if (var13.field1176 == 7) {
						EYHVDWTF var51 = var13.field1207;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1218; var53++) {
							for (int var54 = 0; var54 < var13.field1217; var54++) {
								if (var13.field1167[var52] > 0) {
									KNYKYROC var55 = KNYKYROC.method380(var13.field1167[var52] - 1);
									String var56 = var55.field865;
									if (var55.field847 || var13.field1206[var52] != 1) {
										var56 = var56 + " x" + method19(var13.field1206[var52]);
									}

									int var57 = (var13.field1165 + 115) * var54 + var11;
									int var58 = (var13.field1199 + 12) * var53 + var12;
									if (var13.field1228) {
										var51.method254(var13.field1217 / 2 + var57, var58, var13.field1169, var56, var13.field1203);
									} else {
										var51.method261(var13.field1169, var57, var13.field1203, var56, var58);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			SXFSGYHA.method518(var6, var7, var8, var5);
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method141(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field425[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field259[var6][var4][var5] + field259[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field259[var6][var4][var5 + 1] + field259[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method142() {
		field162 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field358) {
				field384++;
				method38();
				method38();
				method87();
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

		field162 = false;
	}

	@ObfuscatedName("client.d(ILLDILQFVA;I)V")
	public final void method143(int arg0, LDILQFVA arg1) {
		for (int var3 = 0; var3 < field256; var3++) {
			int var4 = field257[var3];
			TVKIEQYR var5 = field394[var4];
			int var6 = arg1.method402();
			if ((var6 & 0x8) != 0) {
				var5.field1435 = arg1.method409();
				var5.field1441 = 100;
			}

			if ((var6 & 0x10) != 0) {
				var5.field1428 = arg1.method429();
				var5.field1429 = arg1.method404();
			}

			if ((var6 & 0x4) != 0) {
				int var7 = arg1.method421();
				int var8 = arg1.method421();
				var5.method576(var8, var7, field221);
				var5.field1398 = field221 + 300;
				var5.field1399 = arg1.method422();
				var5.field1400 = arg1.method402();
			}

			if ((var6 & 0x1) != 0) {
				int var9 = arg1.method422();
				int var10 = arg1.method421();
				var5.method576(var10, var9, field221);
				var5.field1398 = field221 + 300;
				var5.field1399 = arg1.method420();
				var5.field1400 = arg1.method420();
			}

			if ((var6 & 0x40) != 0) {
				var5.field1409 = arg1.method404();
				int var11 = arg1.method437();
				var5.field1413 = var11 >> 16;
				var5.field1412 = (var11 & 0xFFFF) + field221;
				var5.field1410 = 0;
				var5.field1411 = 0;

				if (var5.field1412 > field221) {
					var5.field1410 = -1;
				}

				if (var5.field1409 == 0xFFFF) {
					var5.field1409 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1431 = arg1.method430();
				if (var5.field1431 == 0xFFFF) {
					var5.field1431 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var12 = arg1.method430();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method420();
				if (var5.field1436 == var12 && var12 != -1) {
					int var14 = XKEHWKFH.field1362[var12].field1376;
					if (var14 == 1) {
						var5.field1437 = 0;
						var5.field1438 = 0;
						var5.field1439 = var13;
						var5.field1440 = 0;
					}

					if (var14 == 2) {
						var5.field1440 = 0;
					}
				} else if (var12 == -1 || var5.field1436 == -1 || XKEHWKFH.field1362[var12].field1370 >= XKEHWKFH.field1362[var5.field1436].field1370) {
					var5.field1436 = var12;
					var5.field1437 = 0;
					var5.field1438 = 0;
					var5.field1439 = var13;
					var5.field1440 = 0;
					var5.field1432 = var5.field1394;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field1135 = ZNUYRYPY.method589(arg1.method430());
				var5.field1414 = var5.field1135.field1455;
				var5.field1405 = var5.field1135.field1477;
				var5.field1423 = var5.field1135.field1462;
				var5.field1424 = var5.field1135.field1473;
				var5.field1425 = var5.field1135.field1459;
				var5.field1426 = var5.field1135.field1450;
				var5.field1402 = var5.field1135.field1463;
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method144() {
		field84.method529();
		GSZOCBMU.field696 = field197;
		field45.method446(0, 0);

		if (field418) {
			field349.method253(field274, 239, 40, 0);
			field349.method253(field173 + "*", 239, 60, 128);
		} else if (field106 == 1) {
			field349.method253("Enter amount:", 239, 40, 0);
			field349.method253(field454 + "*", 239, 60, 128);
		} else if (field106 == 2) {
			field349.method253("Enter name:", 239, 40, 0);
			field349.method253(field454 + "*", 239, 60, 128);
		} else if (field69 != null) {
			field349.method253(field69, 239, 40, 0);
			field349.method253("Click to continue", 239, 60, 128);
		} else if (field120 != -1) {
			method140(0, ULLVQOAK.field1172[field120], 0, 0);
		} else if (field169 == -1) {
			EYHVDWTF var1 = field348;
			int var2 = 0;
			SXFSGYHA.method518(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field188[var3] != null) {
					int var4 = field186[var3];
					int var5 = field230 + 70 - var2 * 14;
					String var6 = field187[var3];
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
							var1.method257(4, field188[var3], var5, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field67 == 0 || field67 == 1 && method36(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field218[0].method446(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field218[1].method446(var5 - 12, var8);
								var8 += 14;
							}

							var1.method257(var8, var6 + ":", var5, 0);
							var8 += var1.method255(var6) + 8;
							var1.method257(var8, field188[var3], var5, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field444 == 0 && (var4 == 7 || field371 == 0 || field371 == 1 && method36(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method257(var9, "From", var5, 0);
							int var11 = var9 + var1.method255("From ");
							if (var7 == 1) {
								field218[0].method446(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field218[1].method446(var5 - 12, var11);
								var11 += 14;
							}

							var1.method257(var11, var6 + ":", var5, 0);
							var11 += var1.method255(var6) + 8;
							var1.method257(var11, field188[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field440 == 0 || field440 == 1 && method36(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method257(4, var6 + " " + field188[var3], var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field444 == 0 && field371 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method257(4, field188[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field444 == 0 && field371 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method257(4, "To " + var6 + ":", var5, 0);
							var1.method257(var1.method255("To " + var6) + 12, field188[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field440 == 0 || field440 == 1 && method36(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method257(4, var6 + " " + field188[var3], var5, 0x7E3200);
						}

						var2++;
					}
				}
			}

			SXFSGYHA.method517();
			field201 = var2 * 14 + 7;
			if (field201 < 78) {
				field201 = 78;
			}

			method39(field201, field201 - field230 - 77, 463, 77, 0);
			String var10;
			if (field119 == null || field119.field16 == null) {
				var10 = FBIFPAXF.method272(field95);
			} else {
				var10 = field119.field16;
			}

			var1.method257(4, var10 + ":", 90, 0);
			var1.method257(var1.method255(var10 + ": ") + 6, field147 + "*", 90, 255);
			SXFSGYHA.method524(77, 0, 0, 479);
		} else {
			method140(0, ULLVQOAK.field1172[field169], 0, 0);
		}

		if (field306 && field295 == 2) {
			method104();
		}

		field84.method530(357, 17, field817);
		field83.method529();
		GSZOCBMU.field696 = field199;
	}

	@ObfuscatedName("client.N(I)Z")
	public final boolean method145() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method146(String arg0) {
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

	@ObfuscatedName("client.a(ILZNUYRYPY;IZI)V")
	public final void method147(int arg0, ZNUYRYPY arg1, int arg2, int arg3) {
		if (field367 < 400) {
			if (arg1.field1464 != null) {
				arg1 = arg1.method591();
			}

			if (arg1 != null && arg1.field1454) {
				String var5 = arg1.field1471;
				if (arg1.field1478 != 0) {
					var5 = var5 + method86(arg1.field1478, field119.field10) + " (level-" + arg1.field1478 + ")";
				}

				if (field48 == 1) {
					field163[field367] = "Use " + field52 + " with @yel@" + var5;
					field318[field367] = 718;
					field319[field367] = arg2;
					field316[field367] = arg3;
					field317[field367] = arg0;
					field367++;
				} else if (field38 != 1) {
					if (arg1.field1465 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1465[var6] != null && !arg1.field1465[var6].equalsIgnoreCase("attack")) {
								field163[field367] = arg1.field1465[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field318[field367] = 747;
								}

								if (var6 == 1) {
									field318[field367] = 891;
								}

								if (var6 == 2) {
									field318[field367] = 664;
								}

								if (var6 == 3) {
									field318[field367] = 746;
								}

								if (var6 == 4) {
									field318[field367] = 131;
								}

								field319[field367] = arg2;
								field316[field367] = arg3;
								field317[field367] = arg0;
								field367++;
							}
						}
					}

					if (arg1.field1465 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1465[var7] != null && arg1.field1465[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1478 > field119.field10) {
									var8 = 2000;
								}

								field163[field367] = arg1.field1465[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field318[field367] = var8 + 747;
								}

								if (var7 == 1) {
									field318[field367] = var8 + 891;
								}

								if (var7 == 2) {
									field318[field367] = var8 + 664;
								}

								if (var7 == 3) {
									field318[field367] = var8 + 746;
								}

								if (var7 == 4) {
									field318[field367] = var8 + 131;
								}

								field319[field367] = arg2;
								field316[field367] = arg3;
								field317[field367] = arg0;
								field367++;
							}
						}
					}

					field163[field367] = "Examine @yel@" + var5;
					field318[field367] = 1713;
					field319[field367] = arg2;
					field316[field367] = arg3;
					field317[field367] = arg0;
					field367++;
				} else if ((field40 & 0x2) == 2) {
					field163[field367] = field41 + " @yel@" + var5;
					field318[field367] = 382;
					field319[field367] = arg2;
					field316[field367] = arg3;
					field317[field367] = arg0;
					field367++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)Z")
	public final boolean method148(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field318[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 394) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.O(I)V")
	public final void method149() {
		byte[] var1 = field213.method515("title.dat", null);
		DUMEPGRH var2 = new DUMEPGRH(var1, this);
		field412.method529();
		var2.method217(0, 0);
		field413.method529();
		var2.method217(-637, 0);
		field409.method529();
		var2.method217(-128, 0);
		field410.method529();
		var2.method217(-202, -371);
		field411.method529();
		var2.method217(-202, -171);
		field414.method529();
		var2.method217(0, -265);
		field415.method529();
		var2.method217(-562, -265);
		field416.method529();
		var2.method217(-128, -171);
		field417.method529();
		var2.method217(-562, -171);
		int[] var3 = new int[var2.field544];
		for (int var4 = 0; var4 < var2.field545; var4++) {
			for (int var5 = 0; var5 < var2.field544; var5++) {
				var3[var5] = var2.field543[var2.field544 * var4 + var2.field544 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field544; var6++) {
				var2.field543[var2.field544 * var4 + var6] = var3[var6];
			}
		}

		field412.method529();
		var2.method217(382, 0);
		field413.method529();
		var2.method217(-255, 0);
		field409.method529();
		var2.method217(254, 0);
		field410.method529();
		var2.method217(180, -371);
		field411.method529();
		var2.method217(180, -171);
		field414.method529();
		var2.method217(382, -265);
		field415.method529();
		var2.method217(-180, -265);
		field416.method529();
		var2.method217(254, -171);
		field417.method529();
		var2.method217(-180, -171);
		DUMEPGRH var7 = new DUMEPGRH(field213, "logo", 0);
		field409.method529();
		var7.method219(18, 382 - var7.field544 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method150() {
		for (QXQLENZA var1 = (QXQLENZA) field227.method451(); var1 != null; var1 = (QXQLENZA) field227.method453()) {
			if (var1.field1087 == -1) {
				var1.field1083 = 0;
				method82(var1);
			} else {
				var1.method156();
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method151(long arg0) {
		if (arg0 != 0L) {
			if (field225 >= 100) {
				method131("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = FBIFPAXF.method272(FBIFPAXF.method269(arg0));
				for (int var4 = 0; var4 < field225; var4++) {
					if (field300[var4] == arg0) {
						method131("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field397; var5++) {
					if (field435[var5] == arg0) {
						method131("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field300[field225++] = arg0;
				field161 = true;
				field292.method391(142);
				field292.method398(arg0);
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field160[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field403[var3] = var2 / 4;
		}
	}
}
