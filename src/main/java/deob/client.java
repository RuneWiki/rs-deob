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
public final class client extends QNTDRCTM {

	@ObfuscatedName("client.L")
	public boolean[] field64 = new boolean[5];

	@ObfuscatedName("client.X")
	public XQPFGONL field74 = XQPFGONL.method466(1);

	@ObfuscatedName("client.Y")
	public YPWLUGYN[] field75 = new YPWLUGYN[2];

	@ObfuscatedName("client.cb")
	public boolean field79 = false;

	@ObfuscatedName("client.db")
	public boolean field80 = false;

	@ObfuscatedName("client.fb")
	public XSQWUDHM[] field82 = new XSQWUDHM[4];

	@ObfuscatedName("client.jb")
	public boolean field86 = false;

	@ObfuscatedName("client.pb")
	public YPWLUGYN[] field92 = new YPWLUGYN[100];

	@ObfuscatedName("client.qb")
	public boolean field93 = false;

	@ObfuscatedName("client.rb")
	public int field94 = 3;

	@ObfuscatedName("client.sb")
	public long[] field95 = new long[100];

	@ObfuscatedName("client.tb")
	public boolean field96 = true;

	@ObfuscatedName("client.vb")
	public byte[] field98 = new byte[16384];

	@ObfuscatedName("client.Hb")
	public int field109 = 1;

	@ObfuscatedName("client.Ib")
	public boolean field110 = false;

	@ObfuscatedName("client.Vb")
	public int field123 = -1;

	@ObfuscatedName("client.Wb")
	public boolean field124 = false;

	@ObfuscatedName("client.Xb")
	public int[] field125 = new int[50];

	@ObfuscatedName("client.cc")
	public final int[] field128 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.dc")
	public BFUTXOBU[] field129 = new BFUTXOBU[20];

	@ObfuscatedName("client.fc")
	public int[] field130 = new int[CJHWPMKB.field61];

	@ObfuscatedName("client.nc")
	public String field136 = "";

	@ObfuscatedName("client.zc")
	public boolean field147 = false;

	@ObfuscatedName("client.Gc")
	public int field151 = -1;

	@ObfuscatedName("client.Ic")
	public int[] field153 = new int[151];

	@ObfuscatedName("client.Sc")
	public int field163 = -1;

	@ObfuscatedName("client.Uc")
	public int field164 = 78;

	@ObfuscatedName("client.Wc")
	public int[][][] field166 = new int[4][13][13];

	@ObfuscatedName("client.Zc")
	public int field168 = -1;

	@ObfuscatedName("client.ed")
	public IEGUBMVC[] field173 = new IEGUBMVC[5];

	@ObfuscatedName("client.ld")
	public XQPFGONL field180 = XQPFGONL.method466(1);

	@ObfuscatedName("client.md")
	public int[] field181 = new int[33];

	@ObfuscatedName("client.nd")
	public String[] field182 = new String[500];

	@ObfuscatedName("client.od")
	public int[][] field183 = new int[104][104];

	@ObfuscatedName("client.qd")
	public volatile boolean field184 = false;

	@ObfuscatedName("client.rd")
	public int[] field185 = new int[50];

	@ObfuscatedName("client.Cd")
	public int[] field196 = new int[7];

	@ObfuscatedName("client.Dd")
	public int[] field197 = new int[5];

	@ObfuscatedName("client.Jd")
	public boolean field202 = false;

	@ObfuscatedName("client.Kd")
	public int[] field203 = new int[100];

	@ObfuscatedName("client.Ld")
	public String[] field204 = new String[100];

	@ObfuscatedName("client.Md")
	public String[] field205 = new String[100];

	@ObfuscatedName("client.Od")
	public int[] field207 = new int[200];

	@ObfuscatedName("client.Sd")
	public int[] field209 = new int[5];

	@ObfuscatedName("client.Td")
	public String field210 = "";

	@ObfuscatedName("client.Vd")
	public boolean field212 = false;

	@ObfuscatedName("client.Wd")
	public boolean field213 = false;

	@ObfuscatedName("client.Xd")
	public XQPFGONL field214 = XQPFGONL.method466(1);

	@ObfuscatedName("client.le")
	public int field227 = 0x4D4233;

	@ObfuscatedName("client.oe")
	public int field230 = -1;

	@ObfuscatedName("client.qe")
	public int field231 = -1;

	@ObfuscatedName("client.re")
	public int field232 = -1;

	@ObfuscatedName("client.se")
	public long[] field233 = new long[200];

	@ObfuscatedName("client.we")
	public int field235 = 1;

	@ObfuscatedName("client.ze")
	public int[] field238 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Be")
	public int field240 = 50;

	@ObfuscatedName("client.Ce")
	public int[] field241 = new int[field240];

	@ObfuscatedName("client.De")
	public int[] field242 = new int[field240];

	@ObfuscatedName("client.Ee")
	public int[] field243 = new int[field240];

	@ObfuscatedName("client.Fe")
	public int[] field244 = new int[field240];

	@ObfuscatedName("client.Ge")
	public int[] field245 = new int[field240];

	@ObfuscatedName("client.He")
	public int[] field246 = new int[field240];

	@ObfuscatedName("client.Ie")
	public int[] field247 = new int[field240];

	@ObfuscatedName("client.Je")
	public String[] field248 = new String[field240];

	@ObfuscatedName("client.Te")
	public boolean field258 = true;

	@ObfuscatedName("client.Ve")
	public int field260 = -1;

	@ObfuscatedName("client.cf")
	public String field267 = "";

	@ObfuscatedName("client.ef")
	public boolean field268 = false;

	@ObfuscatedName("client.ff")
	public int[][] field269 = new int[104][104];

	@ObfuscatedName("client.gf")
	public FOKYUBQV field270 = new FOKYUBQV();

	@ObfuscatedName("client.jf")
	public int[] field271 = new int[50];

	@ObfuscatedName("client.lf")
	public int[] field273 = new int[33];

	@ObfuscatedName("client.of")
	public int[] field276 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.pf")
	public int field277 = -1;

	@ObfuscatedName("client.qf")
	public int field278 = -1;

	@ObfuscatedName("client.rf")
	public int field279 = -1;

	@ObfuscatedName("client.yf")
	public int field286 = 2;

	@ObfuscatedName("client.Af")
	public boolean field288 = false;

	@ObfuscatedName("client.Cf")
	public int[] field290 = new int[9];

	@ObfuscatedName("client.Ef")
	public String field291 = "";

	@ObfuscatedName("client.Ff")
	public String field292 = "";

	@ObfuscatedName("client.Lf")
	public int field298 = -1;

	@ObfuscatedName("client.Pf")
	public int field300 = 2;

	@ObfuscatedName("client.Qf")
	public boolean field301 = false;

	@ObfuscatedName("client.Wf")
	public boolean field307 = false;

	@ObfuscatedName("client.Xf")
	public BFUTXOBU[] field308 = new BFUTXOBU[8];

	@ObfuscatedName("client.Zf")
	public int[] field310 = new int[CJHWPMKB.field61];

	@ObfuscatedName("client.ag")
	public int[] field311 = new int[5];

	@ObfuscatedName("client.cg")
	public int[] field312 = new int[2000];

	@ObfuscatedName("client.gg")
	public int[][] field316 = new int[104][104];

	@ObfuscatedName("client.hg")
	public YPWLUGYN[] field317 = new YPWLUGYN[13];

	@ObfuscatedName("client.ig")
	public boolean field318 = false;

	@ObfuscatedName("client.kg")
	public FOKYUBQV field320 = new FOKYUBQV();

	@ObfuscatedName("client.pg")
	public boolean field325 = false;

	@ObfuscatedName("client.rg")
	public int[] field327 = new int[2000];

	@ObfuscatedName("client.tg")
	public FOKYUBQV[][][] field329 = new FOKYUBQV[4][104][104];

	@ObfuscatedName("client.Fg")
	public boolean field338 = false;

	@ObfuscatedName("client.Hg")
	public int field340 = 2;

	@ObfuscatedName("client.Ig")
	public BFUTXOBU[] field341 = new BFUTXOBU[1000];

	@ObfuscatedName("client.Kg")
	public int[] field343 = new int[5];

	@ObfuscatedName("client.Mg")
	public int field345 = -1;

	@ObfuscatedName("client.Ng")
	public boolean field346 = true;

	@ObfuscatedName("client.Ug")
	public int[] field352 = new int[500];

	@ObfuscatedName("client.Vg")
	public int[] field353 = new int[500];

	@ObfuscatedName("client.Wg")
	public int[] field354 = new int[500];

	@ObfuscatedName("client.Xg")
	public int[] field355 = new int[500];

	@ObfuscatedName("client.Yg")
	public boolean field356 = false;

	@ObfuscatedName("client.ch")
	public int[] field359 = new int[151];

	@ObfuscatedName("client.eh")
	public BFUTXOBU[] field361 = new BFUTXOBU[20];

	@ObfuscatedName("client.gh")
	public FOKYUBQV field362 = new FOKYUBQV();

	@ObfuscatedName("client.jh")
	public int field365 = 2048;

	@ObfuscatedName("client.kh")
	public int field366 = 2047;

	@ObfuscatedName("client.lh")
	public TKIWGAGO[] field367 = new TKIWGAGO[field365];

	@ObfuscatedName("client.nh")
	public int[] field369 = new int[field365];

	@ObfuscatedName("client.ph")
	public int[] field371 = new int[field365];

	@ObfuscatedName("client.qh")
	public XQPFGONL[] field372 = new XQPFGONL[field365];

	@ObfuscatedName("client.rh")
	public boolean field373 = false;

	@ObfuscatedName("client.wh")
	public String[] field377 = new String[200];

	@ObfuscatedName("client.xh")
	public int field378 = 0x332D25;

	@ObfuscatedName("client.Mh")
	public int field391 = -1;

	@ObfuscatedName("client.Sh")
	public int field395 = 0x23201B;

	@ObfuscatedName("client.bi")
	public int[] field401 = new int[1000];

	@ObfuscatedName("client.ci")
	public int[] field402 = new int[1000];

	@ObfuscatedName("client.fi")
	public int[] field403 = new int[5];

	@ObfuscatedName("client.ii")
	public volatile boolean field405 = false;

	@ObfuscatedName("client.mi")
	public String field409 = "";

	@ObfuscatedName("client.ti")
	public boolean field415 = true;

	@ObfuscatedName("client.vi")
	public String[] field417 = new String[5];

	@ObfuscatedName("client.wi")
	public boolean[] field418 = new boolean[5];

	@ObfuscatedName("client.xi")
	public int[] field419 = new int[4000];

	@ObfuscatedName("client.yi")
	public int[] field420 = new int[4000];

	@ObfuscatedName("client.zi")
	public int field421 = 128;

	@ObfuscatedName("client.Di")
	public KFCZNNDM field425 = new KFCZNNDM();

	@ObfuscatedName("client.Oi")
	public volatile boolean field435 = false;

	@ObfuscatedName("client.Pi")
	public final int field436 = 100;

	@ObfuscatedName("client.Qi")
	public int[] field437 = new int[100];

	@ObfuscatedName("client.Ri")
	public boolean field438 = false;

	@ObfuscatedName("client.Ti")
	public int[] field439 = new int[CJHWPMKB.field61];

	@ObfuscatedName("client.Vi")
	public boolean field440 = true;

	@ObfuscatedName("client.cj")
	public int field447 = 0x766654;

	@ObfuscatedName("client.dj")
	public boolean field448 = false;

	@ObfuscatedName("client.nj")
	public XQPFGONL field458 = new XQPFGONL(new byte[5000]);

	@ObfuscatedName("client.oj")
	public AHIOLHWV[] field459 = new AHIOLHWV[16384];

	@ObfuscatedName("client.qj")
	public int[] field461 = new int[16384];

	@ObfuscatedName("client.uj")
	public String field465 = "";

	@ObfuscatedName("client.vj")
	public BFUTXOBU[] field466 = new BFUTXOBU[100];

	@ObfuscatedName("client.Bj")
	public int[] field472 = new int[1000];

	@ObfuscatedName("client.Cj")
	public CRC32 field473 = new CRC32();

	@ObfuscatedName("client.Ej")
	public boolean field475 = false;

	@ObfuscatedName("client.Ij")
	public int[] field478 = new int[256];

	@ObfuscatedName("client.Qj")
	public String field485 = "";

	@ObfuscatedName("client.Rj")
	public String field486 = "";

	@ObfuscatedName("client.Vc")
	public static int[] field165 = new int[32];

	@ObfuscatedName("client.Ed")
	public static int field198 = 10;

	@ObfuscatedName("client.Gd")
	public static boolean field200 = true;

	@ObfuscatedName("client.Rd")
	public static BigInteger field208 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.mf")
	public static String field274 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Bf")
	public static int[] field289 = new int[99];

	@ObfuscatedName("client.Lg")
	public static BigInteger field344 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Zg")
	public static final int[][] field357 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.zh")
	public static final int[] field380 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.xb")
	public int field100;

	@ObfuscatedName("client.yb")
	public int field101;

	@ObfuscatedName("client.zb")
	public int field102;

	@ObfuscatedName("client.Ab")
	public int field103;

	@ObfuscatedName("client.Bb")
	public int field104;

	@ObfuscatedName("client.Cb")
	public int field105;

	@ObfuscatedName("client.Db")
	public int field106;

	@ObfuscatedName("client.Eb")
	public int field107;

	@ObfuscatedName("client.Gb")
	public int field108;

	@ObfuscatedName("client.Nb")
	public int field115;

	@ObfuscatedName("client.Ob")
	public int field116;

	@ObfuscatedName("client.Pb")
	public int field117;

	@ObfuscatedName("client.Qb")
	public int field118;

	@ObfuscatedName("client.Rb")
	public int field119;

	@ObfuscatedName("client.Yb")
	public int field126;

	@ObfuscatedName("client.bc")
	public int field127;

	@ObfuscatedName("client.gc")
	public int field131;

	@ObfuscatedName("client.hc")
	public int field132;

	@ObfuscatedName("client.ic")
	public static int field133;

	@ObfuscatedName("client.kc")
	public static int field134;

	@ObfuscatedName("client.mc")
	public int field135;

	@ObfuscatedName("client.oc")
	public int field137;

	@ObfuscatedName("client.uc")
	public static int field142;

	@ObfuscatedName("client.vc")
	public int field143;

	@ObfuscatedName("client.Ec")
	public int field150;

	@ObfuscatedName("client.Xc")
	public int field167;

	@ObfuscatedName("client.ad")
	public int field169;

	@ObfuscatedName("client.bd")
	public int field170;

	@ObfuscatedName("client.cd")
	public static int field171;

	@ObfuscatedName("client.dd")
	public int field172;

	@ObfuscatedName("client.sd")
	public int field186;

	@ObfuscatedName("client.td")
	public int field187;

	@ObfuscatedName("client.ud")
	public int field188;

	@ObfuscatedName("client.vd")
	public int field189;

	@ObfuscatedName("client.wd")
	public int field190;

	@ObfuscatedName("client.xd")
	public int field191;

	@ObfuscatedName("client.yd")
	public int field192;

	@ObfuscatedName("client.zd")
	public int field193;

	@ObfuscatedName("client.Ad")
	public static int field194;

	@ObfuscatedName("client.Fd")
	public static int field199;

	@ObfuscatedName("client.Nd")
	public int field206;

	@ObfuscatedName("client.Ud")
	public int field211;

	@ObfuscatedName("client.ce")
	public int field218;

	@ObfuscatedName("client.de")
	public int field219;

	@ObfuscatedName("client.ee")
	public int field220;

	@ObfuscatedName("client.ge")
	public int field222;

	@ObfuscatedName("client.he")
	public int field223;

	@ObfuscatedName("client.ie")
	public int field224;

	@ObfuscatedName("client.je")
	public int field225;

	@ObfuscatedName("client.me")
	public int field228;

	@ObfuscatedName("client.ne")
	public int field229;

	@ObfuscatedName("client.ve")
	public int field234;

	@ObfuscatedName("client.xe")
	public int field236;

	@ObfuscatedName("client.ye")
	public int field237;

	@ObfuscatedName("client.Ae")
	public int field239;

	@ObfuscatedName("client.Ke")
	public int field249;

	@ObfuscatedName("client.Le")
	public int field250;

	@ObfuscatedName("client.Me")
	public int field251;

	@ObfuscatedName("client.Ne")
	public int field252;

	@ObfuscatedName("client.Oe")
	public int field253;

	@ObfuscatedName("client.Pe")
	public int field254;

	@ObfuscatedName("client.Qe")
	public int field255;

	@ObfuscatedName("client.Se")
	public int field257;

	@ObfuscatedName("client.Ue")
	public int field259;

	@ObfuscatedName("client.We")
	public int field261;

	@ObfuscatedName("client.nf")
	public int field275;

	@ObfuscatedName("client.sf")
	public int field280;

	@ObfuscatedName("client.uf")
	public int field282;

	@ObfuscatedName("client.wf")
	public int field284;

	@ObfuscatedName("client.xf")
	public int field285;

	@ObfuscatedName("client.zf")
	public static int field287;

	@ObfuscatedName("client.Gf")
	public int field293;

	@ObfuscatedName("client.Hf")
	public int field294;

	@ObfuscatedName("client.If")
	public int field295;

	@ObfuscatedName("client.Jf")
	public int field296;

	@ObfuscatedName("client.Kf")
	public int field297;

	@ObfuscatedName("client.Of")
	public int field299;

	@ObfuscatedName("client.Rf")
	public int field302;

	@ObfuscatedName("client.Sf")
	public int field303;

	@ObfuscatedName("client.Tf")
	public int field304;

	@ObfuscatedName("client.Uf")
	public int field305;

	@ObfuscatedName("client.Vf")
	public int field306;

	@ObfuscatedName("client.Yf")
	public static int field309;

	@ObfuscatedName("client.dg")
	public int field313;

	@ObfuscatedName("client.eg")
	public int field314;

	@ObfuscatedName("client.fg")
	public static int field315;

	@ObfuscatedName("client.jg")
	public int field319;

	@ObfuscatedName("client.lg")
	public int field321;

	@ObfuscatedName("client.mg")
	public int field322;

	@ObfuscatedName("client.qg")
	public int field326;

	@ObfuscatedName("client.sg")
	public int field328;

	@ObfuscatedName("client.vg")
	public static int field330;

	@ObfuscatedName("client.xg")
	public int field331;

	@ObfuscatedName("client.yg")
	public int field332;

	@ObfuscatedName("client.zg")
	public int field333;

	@ObfuscatedName("client.Ag")
	public int field334;

	@ObfuscatedName("client.Bg")
	public int field335;

	@ObfuscatedName("client.Cg")
	public int field336;

	@ObfuscatedName("client.Eg")
	public int field337;

	@ObfuscatedName("client.Gg")
	public int field339;

	@ObfuscatedName("client.Og")
	public int field347;

	@ObfuscatedName("client.Pg")
	public int field348;

	@ObfuscatedName("client.Qg")
	public int field349;

	@ObfuscatedName("client.Rg")
	public int field350;

	@ObfuscatedName("client.Sg")
	public int field351;

	@ObfuscatedName("client.dh")
	public int field360;

	@ObfuscatedName("client.hh")
	public static int field363;

	@ObfuscatedName("client.ih")
	public int field364;

	@ObfuscatedName("client.mh")
	public int field368;

	@ObfuscatedName("client.oh")
	public int field370;

	@ObfuscatedName("client.uh")
	public int field375;

	@ObfuscatedName("client.vh")
	public int field376;

	@ObfuscatedName("client.yh")
	public int field379;

	@ObfuscatedName("client.Bh")
	public static int field381;

	@ObfuscatedName("client.Xh")
	public int field397;

	@ObfuscatedName("client.Yh")
	public int field398;

	@ObfuscatedName("client.ai")
	public int field400;

	@ObfuscatedName("client.hi")
	public int field404;

	@ObfuscatedName("client.ji")
	public int field406;

	@ObfuscatedName("client.ki")
	public int field407;

	@ObfuscatedName("client.li")
	public int field408;

	@ObfuscatedName("client.ui")
	public int field416;

	@ObfuscatedName("client.Ai")
	public int field422;

	@ObfuscatedName("client.Bi")
	public int field423;

	@ObfuscatedName("client.Ci")
	public int field424;

	@ObfuscatedName("client.Ei")
	public int field426;

	@ObfuscatedName("client.Ki")
	public static int field432;

	@ObfuscatedName("client.Li")
	public int field433;

	@ObfuscatedName("client.Mi")
	public static int field434;

	@ObfuscatedName("client.Xi")
	public int field442;

	@ObfuscatedName("client.hj")
	public static int field452;

	@ObfuscatedName("client.mj")
	public int field457;

	@ObfuscatedName("client.pj")
	public int field460;

	@ObfuscatedName("client.tj")
	public int field464;

	@ObfuscatedName("client.yj")
	public int field469;

	@ObfuscatedName("client.zj")
	public int field470;

	@ObfuscatedName("client.Aj")
	public int field471;

	@ObfuscatedName("client.Dj")
	public int field474;

	@ObfuscatedName("client.Gj")
	public int field476;

	@ObfuscatedName("client.Hj")
	public int field477;

	@ObfuscatedName("client.Mj")
	public int field481;

	@ObfuscatedName("client.Nj")
	public int field482;

	@ObfuscatedName("client.Oj")
	public int field483;

	@ObfuscatedName("client.Pj")
	public static int field484;

	@ObfuscatedName("client.O")
	public int field66;

	@ObfuscatedName("client.P")
	public int field67;

	@ObfuscatedName("client.W")
	public int field73;

	@ObfuscatedName("client.ab")
	public int field77;

	@ObfuscatedName("client.eb")
	public int field81;

	@ObfuscatedName("client.gb")
	public int field83;

	@ObfuscatedName("client.hb")
	public int field84;

	@ObfuscatedName("client.ib")
	public int field85;

	@ObfuscatedName("client.kb")
	public int field87;

	@ObfuscatedName("client.lb")
	public int field88;

	@ObfuscatedName("client.mb")
	public int field89;

	@ObfuscatedName("client.nb")
	public int field90;

	@ObfuscatedName("client.ob")
	public int field91;

	@ObfuscatedName("client.ub")
	public int field97;

	@ObfuscatedName("client.wb")
	public int field99;

	@ObfuscatedName("client.Mb")
	public long field114;

	@ObfuscatedName("client.qc")
	public long field138;

	@ObfuscatedName("client.Zd")
	public long field215;

	@ObfuscatedName("client.Jg")
	public long field342;

	@ObfuscatedName("client.wj")
	public long field467;

	@ObfuscatedName("client.Jb")
	public BFUTXOBU field111;

	@ObfuscatedName("client.Kb")
	public BFUTXOBU field112;

	@ObfuscatedName("client.wc")
	public BFUTXOBU field144;

	@ObfuscatedName("client.Dc")
	public BFUTXOBU field149;

	@ObfuscatedName("client.Re")
	public BFUTXOBU field256;

	@ObfuscatedName("client.ng")
	public BFUTXOBU field323;

	@ObfuscatedName("client.og")
	public BFUTXOBU field324;

	@ObfuscatedName("client.Fi")
	public BFUTXOBU field427;

	@ObfuscatedName("client.Gi")
	public BFUTXOBU field428;

	@ObfuscatedName("client.Hi")
	public BFUTXOBU field429;

	@ObfuscatedName("client.Ii")
	public BFUTXOBU field430;

	@ObfuscatedName("client.Ji")
	public BFUTXOBU field431;

	@ObfuscatedName("client.rj")
	public BFUTXOBU field462;

	@ObfuscatedName("client.sj")
	public BFUTXOBU field463;

	@ObfuscatedName("client.xc")
	public LLYASRTI field145;

	@ObfuscatedName("client.Yi")
	public NSKCCMMO field443;

	@ObfuscatedName("client.Zi")
	public NSKCCMMO field444;

	@ObfuscatedName("client.aj")
	public NSKCCMMO field445;

	@ObfuscatedName("client.bj")
	public NSKCCMMO field446;

	@ObfuscatedName("client.Jc")
	public SBWJLPSR field154;

	@ObfuscatedName("client.Kc")
	public SBWJLPSR field155;

	@ObfuscatedName("client.Lc")
	public SBWJLPSR field156;

	@ObfuscatedName("client.Mc")
	public SBWJLPSR field157;

	@ObfuscatedName("client.Nc")
	public SBWJLPSR field158;

	@ObfuscatedName("client.Oc")
	public SBWJLPSR field159;

	@ObfuscatedName("client.Pc")
	public SBWJLPSR field160;

	@ObfuscatedName("client.Qc")
	public SBWJLPSR field161;

	@ObfuscatedName("client.Rc")
	public SBWJLPSR field162;

	@ObfuscatedName("client.Ch")
	public SBWJLPSR field382;

	@ObfuscatedName("client.Dh")
	public SBWJLPSR field383;

	@ObfuscatedName("client.Eh")
	public SBWJLPSR field384;

	@ObfuscatedName("client.Fh")
	public SBWJLPSR field385;

	@ObfuscatedName("client.Gh")
	public SBWJLPSR field386;

	@ObfuscatedName("client.Hh")
	public SBWJLPSR field387;

	@ObfuscatedName("client.Ih")
	public SBWJLPSR field388;

	@ObfuscatedName("client.Jh")
	public SBWJLPSR field389;

	@ObfuscatedName("client.Kh")
	public SBWJLPSR field390;

	@ObfuscatedName("client.Nh")
	public SBWJLPSR field392;

	@ObfuscatedName("client.Oh")
	public SBWJLPSR field393;

	@ObfuscatedName("client.Ph")
	public SBWJLPSR field394;

	@ObfuscatedName("client.ij")
	public SBWJLPSR field453;

	@ObfuscatedName("client.jj")
	public SBWJLPSR field454;

	@ObfuscatedName("client.kj")
	public SBWJLPSR field455;

	@ObfuscatedName("client.lj")
	public SBWJLPSR field456;

	@ObfuscatedName("client.yc")
	public static TKIWGAGO field146;

	@ObfuscatedName("client.Hc")
	public UWFCTTCD field152;

	@ObfuscatedName("client.tf")
	public WNPVPVVL field281;

	@ObfuscatedName("client.Th")
	public XLANGUSV field396;

	@ObfuscatedName("client.sh")
	public XMRRKSSB field374;

	@ObfuscatedName("client.fd")
	public YPWLUGYN field174;

	@ObfuscatedName("client.gd")
	public YPWLUGYN field175;

	@ObfuscatedName("client.Xe")
	public YPWLUGYN field262;

	@ObfuscatedName("client.Ye")
	public YPWLUGYN field263;

	@ObfuscatedName("client.Ze")
	public YPWLUGYN field264;

	@ObfuscatedName("client.af")
	public YPWLUGYN field265;

	@ObfuscatedName("client.bf")
	public YPWLUGYN field266;

	@ObfuscatedName("client.oi")
	public YPWLUGYN field410;

	@ObfuscatedName("client.pi")
	public YPWLUGYN field411;

	@ObfuscatedName("client.qi")
	public YPWLUGYN field412;

	@ObfuscatedName("client.ri")
	public YPWLUGYN field413;

	@ObfuscatedName("client.si")
	public YPWLUGYN field414;

	@ObfuscatedName("client.ej")
	public YPWLUGYN field449;

	@ObfuscatedName("client.fj")
	public YPWLUGYN field450;

	@ObfuscatedName("client.gj")
	public YPWLUGYN field451;

	@ObfuscatedName("client.Jj")
	public YPWLUGYN field479;

	@ObfuscatedName("client.Kj")
	public YPWLUGYN field480;

	@ObfuscatedName("client.R")
	public YPWLUGYN field68;

	@ObfuscatedName("client.S")
	public YPWLUGYN field69;

	@ObfuscatedName("client.T")
	public YPWLUGYN field70;

	@ObfuscatedName("client.ah")
	public ZCHENGKI field358;

	@ObfuscatedName("client.Bd")
	public String field195;

	@ObfuscatedName("client.fe")
	public String field221;

	@ObfuscatedName("client.ke")
	public String field226;

	@ObfuscatedName("client.bb")
	public String field78;

	@ObfuscatedName("client.Wi")
	public Socket field441;

	@ObfuscatedName("client.Bc")
	public static boolean field148;

	@ObfuscatedName("client.Hd")
	public static boolean field201;

	@ObfuscatedName("client.kf")
	public static boolean field272;

	@ObfuscatedName("client.xj")
	public static boolean field468;

	@ObfuscatedName("client.Sb")
	public int[] field120;

	@ObfuscatedName("client.Tb")
	public int[] field121;

	@ObfuscatedName("client.Ub")
	public int[] field122;

	@ObfuscatedName("client.rc")
	public int[] field139;

	@ObfuscatedName("client.sc")
	public int[] field140;

	@ObfuscatedName("client.tc")
	public int[] field141;

	@ObfuscatedName("client.hd")
	public int[] field176;

	@ObfuscatedName("client.id")
	public int[] field177;

	@ObfuscatedName("client.jd")
	public int[] field178;

	@ObfuscatedName("client.kd")
	public int[] field179;

	@ObfuscatedName("client.ae")
	public int[] field216;

	@ObfuscatedName("client.be")
	public int[] field217;

	@ObfuscatedName("client.U")
	public int[] field71;

	@ObfuscatedName("client.V")
	public int[] field72;

	@ObfuscatedName("client.vf")
	public YPWLUGYN[] field283;

	@ObfuscatedName("client.Lb")
	public byte[][] field113;

	@ObfuscatedName("client.Z")
	public byte[][] field76;

	@ObfuscatedName("client.Zh")
	public byte[][][] field399;

	@ObfuscatedName("client.M")
	public int[][][] field65;

	@ObfuscatedName("client.a(ZZ[B)V")
	public final void method32(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.a(LXQPFGONL;II)V")
	public final void method33(XQPFGONL arg0, int arg1) {
		for (int var3 = 0; var3 < field370; var3++) {
			int var4 = field371[var3];
			AHIOLHWV var5 = field459[var4];
			int var6 = arg0.method478();
			if ((var6 & 0x2) != 0) {
				var5.field523 = arg0.method504();
				var5.field524 = arg0.method480();
			}

			if ((var6 & 0x80) != 0) {
				var5.field511 = arg0.method485();
				var5.field528 = 100;
			}

			if ((var6 & 0x20) != 0) {
				var5.field1 = FWGUGZKU.method210(arg0.method480());
				var5.field540 = var5.field1.field681;
				var5.field562 = var5.field1.field688;
				var5.field519 = var5.field1.field679;
				var5.field520 = var5.field1.field691;
				var5.field521 = var5.field1.field687;
				var5.field522 = var5.field1.field694;
				var5.field541 = var5.field1.field689;
			}

			if ((var6 & 0x40) != 0) {
				var5.field557 = arg0.method504();
				int var7 = arg0.method483();
				var5.field561 = var7 >> 16;
				var5.field560 = (var7 & 0xFFFF) + field287;
				var5.field558 = 0;
				var5.field559 = 0;

				if (var5.field560 > field287) {
					var5.field558 = -1;
				}

				if (var5.field557 == 0xFFFF) {
					var5.field557 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var8 = arg0.method498();
				int var9 = arg0.method498();
				var5.method181(var9, field287, var8);
				var5.field508 = field287 + 300;
				var5.field509 = arg0.method498();
				var5.field510 = arg0.method496();
			}

			if ((var6 & 0x8) != 0) {
				var5.field518 = arg0.method480();
				if (var5.field518 == 0xFFFF) {
					var5.field518 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg0.method504();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method478();
				if (var5.field532 == var10 && var10 != -1) {
					int var12 = HZCWGKOF.field712[var10].field726;
					if (var12 == 1) {
						var5.field533 = 0;
						var5.field534 = 0;
						var5.field535 = var11;
						var5.field536 = 0;
					}

					if (var12 == 2) {
						var5.field536 = 0;
					}
				} else if (var10 == -1 || var5.field532 == -1 || HZCWGKOF.field712[var10].field720 >= HZCWGKOF.field712[var5.field532].field720) {
					var5.field532 = var10;
					var5.field533 = 0;
					var5.field534 = 0;
					var5.field535 = var11;
					var5.field536 = 0;
					var5.field512 = var5.field543;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg0.method498();
				int var14 = arg0.method496();
				var5.method181(var14, field287, var13);
				var5.field508 = field287 + 300;
				var5.field509 = arg0.method498();
				var5.field510 = arg0.method498();
			}
		}
	}

	@ObfuscatedName("client.a(IILXQPFGONL;)V")
	public final void method34(int arg0, XQPFGONL arg1) {
		if (arg0 == 36) {
			int var3 = arg1.method478();
			int var4 = (var3 >> 4 & 0x7) + field321;
			int var5 = (var3 & 0x7) + field322;
			int var6 = arg1.method498();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field128[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method42(var8, var9, var5, field137, var7, var4, -1, 0, -1);
			}
		} else if (arg0 == 172) {
			int var10 = arg1.method478();
			int var11 = (var10 >> 4 & 0x7) + field321;
			int var12 = (var10 & 0x7) + field322;
			int var13 = var11 + arg1.method479();
			int var14 = var12 + arg1.method479();
			int var15 = arg1.method481();
			int var16 = arg1.method480();
			int var17 = arg1.method478() * 4;
			int var18 = arg1.method478() * 4;
			int var19 = arg1.method480();
			int var20 = arg1.method480();
			int var21 = arg1.method478();
			int var22 = arg1.method478();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var16 != 0xFFFF) {
				var11 = var11 * 128 + 64;
				var12 = var12 * 128 + 64;
				var13 = var13 * 128 + 64;
				var14 = var14 * 128 + 64;
				YRQDGGKN var23 = new YRQDGGKN(var21, var18, var22, var16, method65(var12, field137, var11) - var17, field287 + var20, field137, var12, var11, var15, field287 + var19);
				var23.method535(var14, var13, method65(var14, field137, var13) - var18, field287 + var19);
				field362.method196(var23);
			}
		} else if (arg0 == 41) {
			int var24 = arg1.method478();
			int var25 = (var24 >> 4 & 0x7) + field321;
			int var26 = (var24 & 0x7) + field322;
			int var27 = arg1.method480();
			int var28 = arg1.method478();
			int var29 = arg1.method480();
			if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
				var25 = var25 * 128 + 64;
				var26 = var26 * 128 + 64;
				NLSYPUNJ var30 = new NLSYPUNJ(var26, var27, var25, field137, field287, var29, method65(var26, field137, var25) - var28);
				field270.method196(var30);
			}
		} else if (arg0 == 156) {
			int var31 = arg1.method496();
			int var32 = (var31 >> 4 & 0x7) + field321;
			int var33 = (var31 & 0x7) + field322;
			int var34 = arg1.method504();
			int var35 = arg1.method496();
			int var36 = var35 >> 2;
			int var37 = var35 & 0x3;
			int var38 = field128[var36];
			if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
				method42(var37, var38, var33, field137, var36, var32, var34, 0, -1);
			}
		} else if (arg0 == 0) {
			int var39 = arg1.method478();
			int var40 = (var39 >> 4 & 0x7) + field321;
			int var41 = (var39 & 0x7) + field322;
			int var42 = arg1.method480();
			int var43 = arg1.method480();
			int var44 = arg1.method480();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
				FOKYUBQV var45 = field329[field137][var40][var41];
				if (var45 != null) {
					for (NDUHNYJR var46 = (NDUHNYJR) var45.method199(); var46 != null; var46 = (NDUHNYJR) var45.method201()) {
						if ((var42 & 0x7FFF) == var46.field993 && var46.field994 == var43) {
							var46.field994 = var44;
							break;
						}
					}

					method156(var40, var41);
				}
			}
		} else {
			if (arg0 == 101) {
				int var47 = arg1.method478();
				int var48 = (var47 >> 4 & 0x7) + field321;
				int var49 = (var47 & 0x7) + field322;
				int var50 = arg1.method480();
				int var51 = arg1.method478();
				int var52 = var51 >> 4 & 0xF;
				int var53 = var51 & 0x7;
				if (field146.field544[0] >= var48 - var52 && field146.field544[0] <= var48 + var52 && field146.field545[0] >= var49 - var52 && field146.field545[0] <= var49 + var52 && field440 && !field201 && field313 < 50) {
					field271[field313] = var50;
					field125[field313] = var53;
					field185[field313] = CUQKGTCO.field488[var50];
					field313++;
				}
			}

			if (arg0 == 81) {
				int var54 = arg1.method506();
				int var55 = arg1.method497();
				int var56 = (var55 >> 4 & 0x7) + field321;
				int var57 = (var55 & 0x7) + field322;
				int var58 = arg1.method504();
				if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
					NDUHNYJR var59 = new NDUHNYJR();
					var59.field993 = var58;
					var59.field994 = var54;

					if (field329[field137][var56][var57] == null) {
						field329[field137][var56][var57] = new FOKYUBQV();
					}

					field329[field137][var56][var57].method196(var59);
					method156(var56, var57);
				}
			} else if (arg0 == 180) {
				int var60 = arg1.method506();
				int var61 = arg1.method496();
				int var62 = (var61 >> 4 & 0x7) + field321;
				int var63 = (var61 & 0x7) + field322;
				if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
					FOKYUBQV var64 = field329[field137][var62][var63];
					if (var64 != null) {
						for (NDUHNYJR var65 = (NDUHNYJR) var64.method199(); var65 != null; var65 = (NDUHNYJR) var64.method201()) {
							if ((var60 & 0x7FFF) == var65.field993) {
								var65.method195();
								break;
							}
						}

						if (var64.method199() == null) {
							field329[field137][var62][var63] = null;
						}

						method156(var62, var63);
					}
				}
			} else if (arg0 == 252) {
				int var66 = arg1.method498();
				int var67 = (var66 >> 4 & 0x7) + field321;
				int var68 = (var66 & 0x7) + field322;
				int var69 = arg1.method480();
				int var70 = arg1.method498();
				int var71 = var70 >> 2;
				int var72 = var70 & 0x3;
				int var73 = field128[var71];
				if (var67 >= 0 && var68 >= 0 && var67 < 103 && var68 < 103) {
					int var74 = field65[field137][var67][var68];
					int var75 = field65[field137][var67 + 1][var68];
					int var76 = field65[field137][var67 + 1][var68 + 1];
					int var77 = field65[field137][var67][var68 + 1];
					if (var73 == 0) {
						CFGAIMJK var78 = field358.method561(var67, field137, var68);
						if (var78 != null) {
							int var79 = var78.field51 >> 14 & 0x7FFF;
							if (var71 == 2) {
								var78.field49 = new IKYTXJCI(var75, var72 + 4, var74, false, var79, 2, var76, var77, var69);
								var78.field50 = new IKYTXJCI(var75, var72 + 1 & 0x3, var74, false, var79, 2, var76, var77, var69);
							} else {
								var78.field49 = new IKYTXJCI(var75, var72, var74, false, var79, var71, var76, var77, var69);
							}
						}
					}

					if (var73 == 1) {
						KAOFVJDN var80 = field358.method562(var68, var67, field137);
						if (var80 != null) {
							var80.field877 = new IKYTXJCI(var75, 0, var74, false, var80.field878 >> 14 & 0x7FFF, 4, var76, var77, var69);
						}
					}

					if (var73 == 2) {
						SKGGBBTO var81 = field358.method563(var67, field137, var68);

						if (var71 == 11) {
							var71 = 10;
						}

						if (var81 != null) {
							var81.field1163 = new IKYTXJCI(var75, var72, var74, false, var81.field1171 >> 14 & 0x7FFF, var71, var76, var77, var69);
						}
					}

					if (var73 == 3) {
						JBBEIQXF var82 = field358.method564(var67, field137, var68);
						if (var82 != null) {
							var82.field836 = new IKYTXJCI(var75, var72, var74, false, var82.field837 >> 14 & 0x7FFF, 22, var76, var77, var69);
						}
					}
				}
			} else if (arg0 == 84) {
				int var83 = arg1.method480();
				int var84 = arg1.method480();
				int var85 = arg1.method496();
				int var86 = (var85 >> 4 & 0x7) + field321;
				int var87 = (var85 & 0x7) + field322;
				int var88 = arg1.method505();
				if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && field260 != var88) {
					NDUHNYJR var89 = new NDUHNYJR();
					var89.field993 = var84;
					var89.field994 = var83;

					if (field329[field137][var86][var87] == null) {
						field329[field137][var86][var87] = new FOKYUBQV();
					}

					field329[field137][var86][var87].method196(var89);
					method156(var86, var87);
				}
			} else if (arg0 == 229) {
				byte var90 = arg1.method500();
				byte var91 = arg1.method499();
				byte var92 = arg1.method479();
				int var93 = arg1.method505();
				int var94 = arg1.method496();
				int var95 = (var94 >> 4 & 0x7) + field321;
				int var96 = (var94 & 0x7) + field322;
				int var97 = arg1.method504();
				int var98 = arg1.method478();
				int var99 = var98 >> 2;
				int var100 = var98 & 0x3;
				int var101 = field128[var99];
				int var102 = arg1.method504();
				byte var103 = arg1.method500();
				int var104 = arg1.method505();
				TKIWGAGO var105;
				if (field260 == var93) {
					var105 = field146;
				} else {
					var105 = field367[var93];
				}

				if (var105 != null) {
					DHQCHKXN var106 = DHQCHKXN.method194(var102);
					int var107 = field65[field137][var95][var96];
					int var108 = field65[field137][var95 + 1][var96];
					int var109 = field65[field137][var95 + 1][var96 + 1];
					int var110 = field65[field137][var95][var96 + 1];
					ITSMSHJO var111 = var106.method191(var99, var100, var107, var108, var109, var110, -1);
					if (var111 != null) {
						method42(0, var101, var96, field137, 0, var95, -1, var97 + 1, var104 + 1);
						var105.field1198 = field287 + var97;
						var105.field1199 = field287 + var104;
						var105.field1194 = var111;
						int var112 = var106.field598;
						int var113 = var106.field567;
						if (var100 == 1 || var100 == 3) {
							var112 = var106.field567;
							var113 = var106.field598;
						}

						var105.field1191 = var95 * 128 + var112 * 64;
						var105.field1193 = var96 * 128 + var113 * 64;
						var105.field1192 = method65(var105.field1193, field137, var105.field1191);

						if (var92 > var91) {
							byte var114 = var92;
							var92 = var91;
							var91 = var114;
						}

						if (var103 > var90) {
							byte var115 = var103;
							var103 = var90;
							var90 = var115;
						}

						var105.field1179 = var92 + var95;
						var105.field1181 = var91 + var95;
						var105.field1180 = var96 + var103;
						var105.field1182 = var90 + var96;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILBFUTXOBU;I)V")
	public final void method35(int arg0, BFUTXOBU arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field422 + field285 & 0x7FF;
			int var6 = ITSMSHJO.field816[var5];
			int var7 = ITSMSHJO.field817[var5];
			var6 = var6 * 256 / (field108 + 256);
			var7 = var7 * 256 / (field108 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field149.method18(var12 + 94 + 4 - 10, 20, var10, 256, 20, 15, 15, 83 - var13 - 20);
		} else {
			method151(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.g(I)Ljava/net/Socket;")
	public final Socket method36(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method37() {
		int var1 = 5;
		field290[8] = 0;
		int var2 = 0;
		while (field290[8] == 0) {
			String var3 = "Unknown problem";
			method163(20, "Connecting to web server");

			try {
				DataInputStream var4 = method159("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 313);
				XQPFGONL var5 = new XQPFGONL(new byte[40]);
				var4.readFully(var5.field1334, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field290[var6] = var5.method483();
				}

				int var7 = var5.method483();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field290[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field290[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field290[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field290[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field290[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field290[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method163(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method163(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field80 = !field80;
			}
		}
	}

	@ObfuscatedName("client.a(ILKFCZNNDM;)Z")
	public final boolean method38(KFCZNNDM arg0) {
		int var2 = arg0.field909;
		if (field398 == 2) {
			if (var2 == 201) {
				field79 = true;
				field407 = 0;
				field448 = true;
				field210 = "";
				field319 = 1;
				field136 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field79 = true;
				field407 = 0;
				field448 = true;
				field210 = "";
				field319 = 2;
				field136 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field103 = 250;
			return true;
		}

		if (var2 == 501) {
			field79 = true;
			field407 = 0;
			field448 = true;
			field210 = "";
			field319 = 4;
			field136 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field79 = true;
			field407 = 0;
			field448 = true;
			field210 = "";
			field319 = 5;
			field136 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field196[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = BYTDRQNR.field36 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= BYTDRQNR.field36) {
							var5 = 0;
						}
					}

					if (!BYTDRQNR.field37[var5].field43 && BYTDRQNR.field37[var5].field38 == var3 + (field346 ? 0 : 7)) {
						break;
					}
				}

				field196[var3] = var5;
				field213 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field197[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field357[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field357[var6].length) {
					var8 = 0;
				}
			}

			field197[var6] = var8;
			field213 = true;
		}

		if (var2 == 324 && !field346) {
			field346 = true;
			method40();
		}

		if (var2 == 325 && field346) {
			field346 = false;
			method40();
		}

		if (var2 == 326) {
			field180.method467(94);
			field180.method468(field346 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field180.method468(field196[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field180.method468(field197[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field93 = !field93;
		}

		if (var2 >= 601 && var2 <= 612) {
			method97();

			if (field267.length() > 0) {
				field180.method467(63);
				field180.method474(FYSVECDN.method214(field267));
				field180.method468(var2 - 601);
				field180.method468(field93 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method39() {
		if (field103 > 0) {
			method121();
		} else {
			field455.method394();
			field444.method370("Connection lost", 257, 0, 144);
			field444.method370("Connection lost", 256, 0xFFFFFF, 143);
			field444.method370("Please wait - attempting to reestablish", 257, 0, 159);
			field444.method370("Please wait - attempting to reestablish", 256, 0xFFFFFF, 158);
			field455.method395(field1021, 4, 4);
			field143 = 0;
			field254 = 0;
			LLYASRTI var1 = field145;
			field307 = false;
			field275 = 0;
			method154(field485, field486, true);

			if (!field307) {
				method121();
			}

			try {
				var1.method351();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method40() {
		field213 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field196[var1] = -1;
			for (int var2 = 0; var2 < BYTDRQNR.field36; var2++) {
				if (!BYTDRQNR.field37[var2].field43 && BYTDRQNR.field37[var2].field38 == var1 + (field346 ? 0 : 7)) {
					field196[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method41() {
		field184 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field405) {
				field67++;
				method66();
				method66();
				method107();
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

		field184 = false;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		ZDLIXYKO var10 = null;
		for (ZDLIXYKO var11 = (ZDLIXYKO) field320.method199(); var11 != null; var11 = (ZDLIXYKO) field320.method201()) {
			if (var11.field1482 == arg3 && var11.field1484 == arg5 && var11.field1485 == arg2 && var11.field1483 == arg1) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new ZDLIXYKO();
			var10.field1482 = arg3;
			var10.field1483 = arg1;
			var10.field1484 = arg5;
			var10.field1485 = arg2;
			method131(var10);
			field320.method196(var10);
		}

		var10.field1478 = arg6;
		var10.field1480 = arg4;
		var10.field1479 = arg0;
		var10.field1477 = arg7;
		var10.field1481 = arg8;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method43(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field397; var3++) {
				if (field233[var3] == arg0) {
					field397--;
					field438 = true;

					for (int var4 = var3; var4 < field397; var4++) {
						field377[var4] = field377[var4 + 1];
						field207[var4] = field207[var4 + 1];
						field233[var4] = field233[var4 + 1];
					}

					field180.method467(37);
					field180.method474(arg0);
					break;
				}
			}
		}
	}

	public final void run() {
		if (field435) {
			method41();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method44() {
		method163(20, "Starting up");

		if (signlink.sunjava) {
			field1015 = 5;
		}

		if (field468) {
			field147 = true;
		} else {
			field468 = true;
			boolean var1 = false;
			String var2 = method165();
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
						field173[var3] = new IEGUBMVC(signlink.cache_idx[var3], signlink.cache_dat, var3 + 1, 500000);
					}
				}

				try {
					method37();
					field374 = method120("title", 25, "title screen", field290[1], 1);
					field443 = new NSKCCMMO("p11_full", false, field374);
					field444 = new NSKCCMMO("p12_full", false, field374);
					field445 = new NSKCCMMO("b12_full", false, field374);
					field446 = new NSKCCMMO("q8_full", true, field374);
					method172();
					method106();
					XMRRKSSB var4 = method120("config", 30, "config", field290[2], 2);
					XMRRKSSB var5 = method120("interface", 35, "interface", field290[3], 3);
					XMRRKSSB var6 = method120("media", 40, "2d graphics", field290[4], 4);
					XMRRKSSB var7 = method120("textures", 45, "textures", field290[6], 6);
					XMRRKSSB var8 = method120("wordenc", 50, "chat system", field290[7], 7);
					XMRRKSSB var9 = method120("sounds", 55, "sound effects", field290[8], 8);
					field399 = new byte[4][104][104];
					field65 = new int[4][105][105];
					field358 = new ZCHENGKI(field65, 4, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field82[var10] = new XSQWUDHM(104, 104);
					}

					field256 = new BFUTXOBU(512, 512);
					XMRRKSSB var11 = method120("versionlist", 60, "update list", field290[5], 5);
					method163(60, "Connecting to update server");
					field281 = new WNPVPVVL();
					field281.method442(var11, this);
					SCIASJXX.method397(field281.method443());
					ITSMSHJO.method235(field281.method439(0), field281);

					if (!field201) {
						field257 = 0;
						try {
							field257 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field258 = true;
						field281.method451(2, field257);

						while (field281.method456() > 0) {
							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field281.field1277 > 3) {
								method138("ondemand");
								return;
							}
						}
					}

					method163(65, "Requesting animations");
					int var12 = field281.method439(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field281.method451(1, var13);
					}

					while (field281.method456() > 0) {
						int var14 = var12 - field281.method456();
						if (var14 > 0) {
							method163(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field281.field1277 > 3) {
							method138("ondemand");
							return;
						}
					}

					method163(70, "Requesting models");
					int var15 = field281.method439(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field281.method458(var16);
						if ((var17 & 0x1) != 0) {
							field281.method451(0, var16);
						}
					}

					int var18 = field281.method456();
					while (field281.method456() > 0) {
						int var19 = var18 - field281.method456();
						if (var19 > 0) {
							method163(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field173[0] != null) {
						method163(75, "Requesting maps");
						field281.method451(3, field281.method449(47, 0, 48));
						field281.method451(3, field281.method449(47, 1, 48));
						field281.method451(3, field281.method449(48, 0, 48));
						field281.method451(3, field281.method449(48, 1, 48));
						field281.method451(3, field281.method449(49, 0, 48));
						field281.method451(3, field281.method449(49, 1, 48));
						field281.method451(3, field281.method449(47, 0, 47));
						field281.method451(3, field281.method449(47, 1, 47));
						field281.method451(3, field281.method449(48, 0, 47));
						field281.method451(3, field281.method449(48, 1, 47));
						field281.method451(3, field281.method449(48, 0, 148));
						field281.method451(3, field281.method449(48, 1, 148));
						int var20 = field281.method456();
						while (field281.method456() > 0) {
							int var21 = var20 - field281.method456();
							if (var21 > 0) {
								method163(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field281.method439(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field281.method458(var23);
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
							field281.method447(var23, 0, var25);
						}
					}

					field281.method455(field200);

					if (!field201) {
						int var26 = field281.method439(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field281.method452(var27)) {
								field281.method447(var27, 2, (byte) 1);
							}
						}
					}

					method163(80, "Unpacking media");
					field449 = new YPWLUGYN(var6, "invback", 0);
					field451 = new YPWLUGYN(var6, "chatback", 0);
					field450 = new YPWLUGYN(var6, "mapback", 0);
					field68 = new YPWLUGYN(var6, "backbase1", 0);
					field69 = new YPWLUGYN(var6, "backbase2", 0);
					field70 = new YPWLUGYN(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field317[var28] = new YPWLUGYN(var6, "sideicons", var28);
					}

					field144 = new BFUTXOBU(var6, "compass", 0);
					field149 = new BFUTXOBU(var6, "mapedge", 0);
					field149.method10();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field92[var29] = new YPWLUGYN(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field466[var30] = new BFUTXOBU(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field129[var31] = new BFUTXOBU(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field361[var32] = new BFUTXOBU(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field462 = new BFUTXOBU(var6, "mapmarker", 0);
					field463 = new BFUTXOBU(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field308[var33] = new BFUTXOBU(var6, "cross", var33);
					}

					field427 = new BFUTXOBU(var6, "mapdots", 0);
					field428 = new BFUTXOBU(var6, "mapdots", 1);
					field429 = new BFUTXOBU(var6, "mapdots", 2);
					field430 = new BFUTXOBU(var6, "mapdots", 3);
					field431 = new BFUTXOBU(var6, "mapdots", 4);
					field174 = new YPWLUGYN(var6, "scrollbar", 0);
					field175 = new YPWLUGYN(var6, "scrollbar", 1);
					field410 = new YPWLUGYN(var6, "redstone1", 0);
					field411 = new YPWLUGYN(var6, "redstone2", 0);
					field412 = new YPWLUGYN(var6, "redstone3", 0);
					field413 = new YPWLUGYN(var6, "redstone1", 0);
					field413.method530();
					field414 = new YPWLUGYN(var6, "redstone2", 0);
					field414.method530();
					field262 = new YPWLUGYN(var6, "redstone1", 0);
					field262.method531();
					field263 = new YPWLUGYN(var6, "redstone2", 0);
					field263.method531();
					field264 = new YPWLUGYN(var6, "redstone3", 0);
					field264.method531();
					field265 = new YPWLUGYN(var6, "redstone1", 0);
					field265.method530();
					field265.method531();
					field266 = new YPWLUGYN(var6, "redstone2", 0);
					field266.method530();
					field266.method531();

					for (int var34 = 0; var34 < 2; var34++) {
						field75[var34] = new YPWLUGYN(var6, "mod_icons", var34);
					}

					BFUTXOBU var35 = new BFUTXOBU(var6, "backleft1", 0);
					field382 = new SBWJLPSR(var35.field31, var35.field30, method73());
					var35.method11(0, 0);
					BFUTXOBU var36 = new BFUTXOBU(var6, "backleft2", 0);
					field383 = new SBWJLPSR(var36.field31, var36.field30, method73());
					var36.method11(0, 0);
					BFUTXOBU var37 = new BFUTXOBU(var6, "backright1", 0);
					field384 = new SBWJLPSR(var37.field31, var37.field30, method73());
					var37.method11(0, 0);
					BFUTXOBU var38 = new BFUTXOBU(var6, "backright2", 0);
					field385 = new SBWJLPSR(var38.field31, var38.field30, method73());
					var38.method11(0, 0);
					BFUTXOBU var39 = new BFUTXOBU(var6, "backtop1", 0);
					field386 = new SBWJLPSR(var39.field31, var39.field30, method73());
					var39.method11(0, 0);
					BFUTXOBU var40 = new BFUTXOBU(var6, "backvmid1", 0);
					field387 = new SBWJLPSR(var40.field31, var40.field30, method73());
					var40.method11(0, 0);
					BFUTXOBU var41 = new BFUTXOBU(var6, "backvmid2", 0);
					field388 = new SBWJLPSR(var41.field31, var41.field30, method73());
					var41.method11(0, 0);
					BFUTXOBU var42 = new BFUTXOBU(var6, "backvmid3", 0);
					field389 = new SBWJLPSR(var42.field31, var42.field30, method73());
					var42.method11(0, 0);
					BFUTXOBU var43 = new BFUTXOBU(var6, "backhmid2", 0);
					field390 = new SBWJLPSR(var43.field31, var43.field30, method73());
					var43.method11(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field466[var48] != null) {
							field466[var48].method9(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field92[var48] != null) {
							field92[var48].method532(var44 + var47, var46 + var47, var45 + var47);
						}
					}

					method163(83, "Unpacking textures");
					JJAEHWOM.method275(var7);
					JJAEHWOM.method279(0.8D);
					JJAEHWOM.method274(20);
					method163(86, "Unpacking config");
					HZCWGKOF.method226(var4);
					DHQCHKXN.method187(var4);
					IWTQKRSS.method264(var4);
					WKEFMNQD.method426(var4);
					FWGUGZKU.method211(var4);
					BYTDRQNR.method21(var4);
					FPSNPMMW.method204(var4);
					YBKVSPMW.method526(var4);
					JHLQAAYP.method268(var4);
					WKEFMNQD.field1239 = field200;

					if (!field201) {
						method163(90, "Unpacking sounds");
						byte[] var49 = var9.method465("sounds.dat", null);
						XQPFGONL var50 = new XQPFGONL(var49);
						CUQKGTCO.method174(var50);
					}

					method163(95, "Unpacking interfaces");
					NSKCCMMO[] var51 = new NSKCCMMO[] { field443, field444, field445, field446 };
					KFCZNNDM.method298(var5, var6, var51);
					method163(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field450.field1374[field450.field1376 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field181[var52] = var53;
						field273[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field450.field1374[field450.field1376 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field359[var56 - 5] = var57 - 25;
						field153[var56 - 5] = var58 - var57;
					}

					JJAEHWOM.method272(96, 479);
					field120 = JJAEHWOM.field859;
					JJAEHWOM.method272(261, 190);
					field121 = JJAEHWOM.field859;
					JJAEHWOM.method272(334, 512);
					field122 = JJAEHWOM.field859;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = JJAEHWOM.field857[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					ZCHENGKI.method575(500, var60, 512, 334, 800);
					KUCFVEDX.method301(var8);
					field152 = new UWFCTTCD(this);
					method102(field152, 10);
					IKYTXJCI.field733 = this;
					DHQCHKXN.field580 = this;
					FWGUGZKU.field676 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field78 + " " + field150);
					field318 = true;
				}
			} else {
				field288 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public final boolean method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field269[var14][var15] = 0;
				field183[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg3;
		field269[arg6][arg3] = 99;
		field183[arg6][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field419[var18] = arg6;
		int var35 = var18 + 1;
		field420[var18] = arg3;
		boolean var20 = false;
		int var21 = field419.length;
		int[][] var22 = field82[field137].field1351;
		while (var35 != var19) {
			var16 = field419[var19];
			var17 = field420[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field82[field137].method523(arg7 - 1, arg5, var17, arg0, var16, arg9)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field82[field137].method524(var16, arg5, arg7 - 1, arg9, var17, arg0)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg2 != 0 && field82[field137].method525(arg0, arg4, arg5, var16, var17, arg10, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field183[var16][var17] + 1;
			if (var16 > 0 && field269[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field419[var35] = var16 - 1;
				field420[var35] = var17;
				var35 = (var35 + 1) % var21;
				field269[var16 - 1][var17] = 2;
				field183[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field269[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field419[var35] = var16 + 1;
				field420[var35] = var17;
				var35 = (var35 + 1) % var21;
				field269[var16 + 1][var17] = 8;
				field183[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field269[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field419[var35] = var16;
				field420[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field269[var16][var17 - 1] = 1;
				field183[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field269[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field419[var35] = var16;
				field420[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field269[var16][var17 + 1] = 4;
				field183[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field269[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field419[var35] = var16 - 1;
				field420[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field269[var16 - 1][var17 - 1] = 3;
				field183[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field269[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field419[var35] = var16 + 1;
				field420[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field269[var16 + 1][var17 - 1] = 9;
				field183[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field269[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field419[var35] = var16 - 1;
				field420[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field269[var16 - 1][var17 + 1] = 6;
				field183[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field269[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field419[var35] = var16 + 1;
				field420[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field269[var16 + 1][var17 + 1] = 12;
				field183[var16 + 1][var17 + 1] = var23;
			}
		}

		field326 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg5 - var25; var26 <= arg5 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field183[var26][var27] < var24) {
								var24 = field183[var26][var27];
								var16 = var26;
								var17 = var27;
								field326 = 1;
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
		field419[var28] = var16;
		int var36 = var28 + 1;
		field420[var28] = var17;
		int var29;
		int var30 = var29 = field269[var16][var17];
		while (arg6 != var16 || arg3 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field419[var36] = var16;
				field420[var36++] = var17;
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

			var30 = field269[var16][var17];
		}

		if (var36 <= 0) {
			if (arg1 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field419[var36];
		int var33 = field420[var36];

		if (arg1 == 0) {
			field180.method467(190);
			field180.method468(var31 + var31 + 3);
		}

		if (arg1 == 1) {
			field180.method467(212);
			field180.method468(var31 + var31 + 3 + 14);
		}

		if (arg1 == 2) {
			field180.method467(196);
			field180.method468(var31 + var31 + 3);
		}

		field180.method495(field1039[5] == 1 ? 1 : 0);
		field180.method502(field105 + var33);
		field254 = field419[0];
		field255 = field420[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field180.method495(field419[var36] - var32);
			field180.method494(field420[var36] - var33);
		}

		field180.method503(field104 + var32);
		return true;
	}

	@ObfuscatedName("client.b(III)V")
	public final void method46(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field205[var4] != null) {
				int var5 = field203[var4];
				int var6 = field73 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field204[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field477 == 0 || field477 == 1 && method98(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field146.field1187)) {
						if (field364 >= 1) {
							field182[field476] = "Report abuse @whi@" + var7;
							field354[field476] = 218;
							field476++;
						}

						field182[field476] = "Add ignore @whi@" + var7;
						field354[field476] = 979;
						field476++;
						field182[field476] = "Add friend @whi@" + var7;
						field354[field476] = 754;
						field476++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field81 == 0 && (var5 == 7 || field360 == 0 || field360 == 1 && method98(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field364 >= 1) {
							field182[field476] = "Report abuse @whi@" + var7;
							field354[field476] = 218;
							field476++;
						}

						field182[field476] = "Add ignore @whi@" + var7;
						field354[field476] = 979;
						field476++;
						field182[field476] = "Add friend @whi@" + var7;
						field354[field476] = 754;
						field476++;
					}

					var3++;
				}

				if (var5 == 4 && (field135 == 0 || field135 == 1 && method98(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field182[field476] = "Accept trade @whi@" + var7;
						field354[field476] = 734;
						field476++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field81 == 0 && field360 < 2) {
					var3++;
				}

				if (var5 == 8 && (field135 == 0 || field135 == 1 && method98(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field182[field476] = "Accept challenge @whi@" + var7;
						field354[field476] = 205;
						field476++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method47() {
		if (field201 && field261 == 2 && SGOFWBIX.field1138 != field137) {
			field455.method394();
			field444.method370("Loading - please wait.", 257, 0, 151);
			field444.method370("Loading - please wait.", 256, 0xFFFFFF, 150);
			field455.method395(field1021, 4, 4);
			field261 = 1;
			field215 = System.currentTimeMillis();
		}

		if (field261 == 1) {
			int var1 = method48();
			if (var1 != 0 && System.currentTimeMillis() - field215 > 360000L) {
				signlink.reporterror(field485 + " glcfb " + field342 + "," + var1 + "," + field201 + "," + field173[0] + "," + field281.method456() + "," + field137 + "," + field236 + "," + field237);
				field215 = System.currentTimeMillis();
			}
		}

		if (field261 == 2 && field391 != field137) {
			field391 = field137;
			method132(field137);
		}
	}

	@ObfuscatedName("client.k(I)I")
	public final int method48() {
		for (int var1 = 0; var1 < field76.length; var1++) {
			if (field76[var1] == null && field140[var1] != -1) {
				return -1;
			}

			if (field113[var1] == null && field141[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field76.length; var3++) {
			byte[] var4 = field113[var3];
			if (var4 != null) {
				int var5 = (field139[var3] >> 8) * 64 - field104;
				int var6 = (field139[var3] & 0xFF) * 64 - field105;
				if (field202) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= SGOFWBIX.method410(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field301) {
			return -4;
		} else {
			field261 = 2;
			SGOFWBIX.field1138 = field137;
			method149();
			field180.method467(130);
			return 0;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method49() {
		for (int var1 = 0; var1 < field313; var1++) {
			if (field185[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field271[var1] != field278 || field125[var1] != field123) {
						XQPFGONL var3 = CUQKGTCO.method175(field271[var1], field125[var1]);
						if (System.currentTimeMillis() + var3.field1335 / 22 > field77 / 22 + field467) {
							field77 = var3.field1335;
							field467 = System.currentTimeMillis();

							if (method125(var3.field1335, var3.field1334)) {
								field278 = field271[var1];
								field123 = field125[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method79()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field185[var1] != -5) {
					field185[var1] = -5;
				} else {
					field313--;
					for (int var5 = var1; var5 < field313; var5++) {
						field271[var5] = field271[var5 + 1];
						field125[var5] = field125[var5 + 1];
						field185[var5] = field185[var5 + 1];
					}

					var1--;
				}
			} else {
				field185[var1]--;
			}
		}

		if (field474 > 0) {
			field474 -= 20;
			if (field474 < 0) {
				field474 = 0;
			}

			if (field474 == 0 && field415 && !field201) {
				field257 = field151;
				field258 = true;
				field281.method451(2, field257);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LKFCZNNDM;Z)Z")
	public final boolean method50(KFCZNNDM arg0) {
		if (arg0.field929 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field929.length; var2++) {
			int var3 = method101(var2, arg0);
			int var4 = arg0.field930[var2];
			if (arg0.field929[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field929[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field929[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method51() {
		for (int var1 = -1; var1 < field368; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field366;
			} else {
				var2 = field369[var1];
			}

			TKIWGAGO var3 = field367[var2];
			if (var3 != null && var3.field528 > 0) {
				var3.field528--;
				if (var3.field528 == 0) {
					var3.field511 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field460; var4++) {
			int var5 = field461[var4];
			AHIOLHWV var6 = field459[var5];
			if (var6 != null && var6.field528 > 0) {
				var6.field528--;
				if (var6.field528 == 0) {
					var6.field511 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method52() {
		while (true) {
			WHTATTJS var1 = field281.method441();
			if (var1 == null) {
				return;
			}

			if (var1.field1209 == 0) {
				ITSMSHJO.method236(var1.field1206, var1.field1210);

				if ((field281.method458(var1.field1206) & 0x62) != 0) {
					field438 = true;

					if (field279 != -1) {
						field79 = true;
					}
				}
			}

			if (var1.field1209 == 1 && var1.field1210 != null) {
				SCIASJXX.method398(var1.field1210);
			}

			if (var1.field1209 == 2 && field257 == var1.field1206 && var1.field1210 != null) {
				method32(field258, var1.field1210);
			}

			if (var1.field1209 == 3 && field261 == 1) {
				for (int var2 = 0; var2 < field76.length; var2++) {
					if (field140[var2] == var1.field1206) {
						field76[var2] = var1.field1210;

						if (var1.field1210 == null) {
							field140[var2] = -1;
						}

						break;
					}

					if (field141[var2] == var1.field1206) {
						field113[var2] = var1.field1210;

						if (var1.field1210 == null) {
							field141[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1209 == 93 && field281.method445(var1.field1206)) {
				SGOFWBIX.method412(field281, new XQPFGONL(var1.field1210));
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
			if (field201 && field137 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field358.method565(arg4, arg5, arg2);
			}

			if (arg1 == 1) {
				var8 = field358.method566(arg5, arg4, arg2);
			}

			if (arg1 == 2) {
				var8 = field358.method567(arg4, arg5, arg2);
			}

			if (arg1 == 3) {
				var8 = field358.method568(arg4, arg5, arg2);
			}

			if (var8 != 0) {
				int var12 = field358.method569(arg4, arg5, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field358.method556(arg5, arg2, arg4);
					DHQCHKXN var16 = DHQCHKXN.method194(var13);
					if (var16.field566) {
						field82[arg4].method519(arg2, var14, arg5, var16.field586, var15);
					}
				}

				if (arg1 == 1) {
					field358.method557(arg4, arg5, arg2);
				}

				if (arg1 == 2) {
					field358.method558(arg2, arg4, arg5);
					DHQCHKXN var17 = DHQCHKXN.method194(var13);
					if (var17.field598 + arg5 > 103 || var17.field598 + arg2 > 103 || var17.field567 + arg5 > 103 || var17.field567 + arg2 > 103) {
						return;
					}

					if (var17.field566) {
						field82[arg4].method520(var17.field598, arg5, arg2, var15, var17.field567, var17.field586);
					}
				}

				if (arg1 == 3) {
					field358.method559(arg2, arg5, arg4);
					DHQCHKXN var18 = DHQCHKXN.method194(var13);
					if (var18.field566 && var18.field585) {
						field82[arg4].method522(arg5, arg2);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field399[1][arg5][arg2] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				SGOFWBIX.method419(field358, arg3, arg0, var19, arg2, arg5, field65, field82[arg4], arg6, arg4);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IBLXQPFGONL;)V")
	public final void method54(int arg0, XQPFGONL arg1) {
		int var3 = arg1.method489(8);
		if (var3 < field368) {
			for (int var4 = var3; var4 < field368; var4++) {
				field472[field471++] = field369[var4];
			}
		}

		if (var3 > field368) {
			signlink.reporterror(field485 + " Too many players");
			throw new RuntimeException("eek");
		}

		field368 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field369[var5];
			TKIWGAGO var7 = field367[var6];
			int var8 = arg1.method489(1);
			if (var8 == 0) {
				field369[field368++] = var6;
				var7.field555 = field287;
			} else {
				int var9 = arg1.method489(2);
				if (var9 == 0) {
					field369[field368++] = var6;
					var7.field555 = field287;
					field371[field370++] = var6;
				} else if (var9 == 1) {
					field369[field368++] = var6;
					var7.field555 = field287;
					int var10 = arg1.method489(3);
					var7.method180(var10, false);
					int var11 = arg1.method489(1);
					if (var11 == 1) {
						field371[field370++] = var6;
					}
				} else if (var9 == 2) {
					field369[field368++] = var6;
					var7.field555 = field287;
					int var12 = arg1.method489(3);
					var7.method180(var12, true);
					int var13 = arg1.method489(3);
					var7.method180(var13, true);
					int var14 = arg1.method489(1);
					if (var14 == 1) {
						field371[field370++] = var6;
					}
				} else if (var9 == 3) {
					field472[field471++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method55() {
		if (field143 == 0 && field1035 == 1) {
			int var1 = field1036 - 25 - 550;
			int var2 = field1037 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field422 + field285 & 0x7FF;
				int var4 = JJAEHWOM.field857[var3];
				int var5 = JJAEHWOM.field858[var3];
				var4 = (field108 + 256) * var4 >> 8;
				var5 = (field108 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field146.field514 + var6 >> 7;
				int var9 = field146.field515 - var7 >> 7;
				boolean var10 = method45(var9, 1, 0, field146.field545[0], 0, var8, field146.field544[0], 0, true, 0, 0);
				if (var10) {
					field180.method468(var1);
					field180.method468(var2);
					field180.method469(field422);
					field180.method468(57);
					field180.method468(field285);
					field180.method468(field108);
					field180.method468(89);
					field180.method469(field146.field514);
					field180.method469(field146.field515);
					field180.method468(field326);
					field180.method468(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method56() {
		signlink.reporterror = false;

		try {
			if (field145 != null) {
				field145.method351();
			}
		} catch (Exception var1) {
		}

		field145 = null;
		method57();

		if (field152 != null) {
			field152.field1205 = false;
		}

		field152 = null;
		field281.method459();
		field281 = null;
		field458 = null;
		field180 = null;
		field74 = null;
		field214 = null;
		field139 = null;
		field76 = null;
		field113 = null;
		field140 = null;
		field141 = null;
		field65 = null;
		field399 = null;
		field358 = null;
		field82 = null;
		field269 = null;
		field183 = null;
		field419 = null;
		field420 = null;
		field98 = null;
		field453 = null;
		field454 = null;
		field455 = null;
		field456 = null;
		field392 = null;
		field393 = null;
		field394 = null;
		field382 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field387 = null;
		field388 = null;
		field389 = null;
		field390 = null;
		field449 = null;
		field450 = null;
		field451 = null;
		field68 = null;
		field69 = null;
		field70 = null;
		field317 = null;
		field410 = null;
		field411 = null;
		field412 = null;
		field413 = null;
		field414 = null;
		field262 = null;
		field263 = null;
		field264 = null;
		field265 = null;
		field266 = null;
		field144 = null;
		field129 = null;
		field361 = null;
		field308 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field430 = null;
		field431 = null;
		field92 = null;
		field466 = null;
		field316 = null;
		field367 = null;
		field369 = null;
		field371 = null;
		field372 = null;
		field472 = null;
		field459 = null;
		field461 = null;
		field329 = null;
		field320 = null;
		field362 = null;
		field270 = null;
		field352 = null;
		field353 = null;
		field354 = null;
		field355 = null;
		field182 = null;
		field327 = null;
		field401 = null;
		field402 = null;
		field341 = null;
		field256 = null;
		field377 = null;
		field233 = null;
		field207 = null;
		field157 = null;
		field158 = null;
		field154 = null;
		field155 = null;
		field156 = null;
		field159 = null;
		field160 = null;
		field161 = null;
		field162 = null;
		method160();
		DHQCHKXN.method185();
		FWGUGZKU.method209();
		WKEFMNQD.method434();
		IWTQKRSS.field821 = null;
		BYTDRQNR.field37 = null;
		KFCZNNDM.field939 = null;
		DGPZHKUN.field498 = null;
		HZCWGKOF.field712 = null;
		FPSNPMMW.field641 = null;
		FPSNPMMW.field653 = null;
		YBKVSPMW.field1360 = null;
		field1022 = null;
		TKIWGAGO.field1197 = null;
		JJAEHWOM.method270();
		ZCHENGKI.method538();
		ITSMSHJO.method234();
		SCIASJXX.method399();
		System.gc();
	}

	@ObfuscatedName("client.o(I)V")
	public final void method57() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.p(I)V")
	public final void method58() {
		for (ZDLIXYKO var1 = (ZDLIXYKO) field320.method199(); var1 != null; var1 = (ZDLIXYKO) field320.method201()) {
			if (var1.field1481 == -1) {
				var1.field1477 = 0;
				method131(var1);
			} else {
				var1.method195();
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method59() {
		if (field154 == null) {
			field1022 = null;
			field456 = null;
			field454 = null;
			field453 = null;
			field455 = null;
			field392 = null;
			field393 = null;
			field394 = null;
			field157 = new SBWJLPSR(265, 128, method73());
			KVJNUKIT.method342();
			field158 = new SBWJLPSR(265, 128, method73());
			KVJNUKIT.method342();
			field154 = new SBWJLPSR(171, 509, method73());
			KVJNUKIT.method342();
			field155 = new SBWJLPSR(132, 360, method73());
			KVJNUKIT.method342();
			field156 = new SBWJLPSR(200, 360, method73());
			KVJNUKIT.method342();
			field159 = new SBWJLPSR(238, 202, method73());
			KVJNUKIT.method342();
			field160 = new SBWJLPSR(238, 203, method73());
			KVJNUKIT.method342();
			field161 = new SBWJLPSR(94, 74, method73());
			KVJNUKIT.method342();
			field162 = new SBWJLPSR(94, 75, method73());
			KVJNUKIT.method342();

			if (field374 != null) {
				method172();
				method106();
			}

			field212 = true;
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method60(int arg0) {
		KFCZNNDM var2 = KFCZNNDM.field939[arg0];
		for (int var3 = 0; var3 < var2.field913.length && var2.field913[var3] != -1; var3++) {
			KFCZNNDM var4 = KFCZNNDM.field939[var2.field913[var3]];
			if (var4.field940 == 1) {
				method60(var4.field925);
			}

			var4.field926 = 0;
			var4.field899 = 0;
		}
	}

	@ObfuscatedName("client.a(ZIILFWGUGZKU;I)V")
	public final void method61(int arg0, int arg1, FWGUGZKU arg2, int arg3) {
		if (field476 < 400) {
			if (arg2.field675 != null) {
				arg2 = arg2.method208();
			}

			if (arg2 != null && arg2.field682) {
				String var5 = arg2.field698;
				if (arg2.field663 != 0) {
					var5 = var5 + method173(arg2.field663, field146.field1177) + " (level-" + arg2.field663 + ")";
				}

				if (field222 == 1) {
					field182[field476] = "Use " + field226 + " with @yel@" + var5;
					field354[field476] = 690;
					field355[field476] = arg0;
					field352[field476] = arg1;
					field353[field476] = arg3;
					field476++;
				} else if (field218 != 1) {
					if (arg2.field674 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field674[var6] != null && !arg2.field674[var6].equalsIgnoreCase("attack")) {
								field182[field476] = arg2.field674[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field354[field476] = 703;
								}

								if (var6 == 1) {
									field354[field476] = 125;
								}

								if (var6 == 2) {
									field354[field476] = 62;
								}

								if (var6 == 3) {
									field354[field476] = 737;
								}

								if (var6 == 4) {
									field354[field476] = 532;
								}

								field355[field476] = arg0;
								field352[field476] = arg1;
								field353[field476] = arg3;
								field476++;
							}
						}
					}

					if (arg2.field674 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field674[var7] != null && arg2.field674[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field663 > field146.field1177) {
									var8 = 2000;
								}

								field182[field476] = arg2.field674[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field354[field476] = var8 + 703;
								}

								if (var7 == 1) {
									field354[field476] = var8 + 125;
								}

								if (var7 == 2) {
									field354[field476] = var8 + 62;
								}

								if (var7 == 3) {
									field354[field476] = var8 + 737;
								}

								if (var7 == 4) {
									field354[field476] = var8 + 532;
								}

								field355[field476] = arg0;
								field352[field476] = arg1;
								field353[field476] = arg3;
								field476++;
							}
						}
					}

					field182[field476] = "Examine @yel@" + var5;
					field354[field476] = 1914;
					field355[field476] = arg0;
					field352[field476] = arg1;
					field353[field476] = arg3;
					field476++;
				} else if ((field220 & 0x2) == 2) {
					field182[field476] = field221 + " @yel@" + var5;
					field354[field476] = 140;
					field355[field476] = arg0;
					field352[field476] = arg1;
					field353[field476] = arg3;
					field476++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method62() {
		int var1 = field348;
		int var2 = field349;
		int var3 = field350;
		int var4 = field351;
		int var5 = 0x5D5447;
		KVJNUKIT.method344(var3, var5, var2, var1, var4);
		KVJNUKIT.method344(var3 - 2, 0, var2 + 1, var1 + 1, 16);
		KVJNUKIT.method345(var3 - 2, var1 + 1, var4 - 19, 0, var2 + 18);
		field445.method374(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field1029;
		int var7 = field1030;
		if (field347 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field347 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field347 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field476; var8++) {
			int var9 = (field476 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field445.method378(field182[var8], true, var1 + 3, var9, var10);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method63() {
		if (field126 == 2) {
			method134(field117 * 2, (field116 - field105 << 7) + field119, (field115 - field104 << 7) + field118);

			if (field231 > -1 && field287 % 20 < 10) {
				field361[2].method13(field232 - 28, field231 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method64(long arg0) {
		if (arg0 != 0L) {
			if (field397 >= 100 && field457 != 1) {
				method155(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field397 >= 200) {
				method155(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = FYSVECDN.method218(FYSVECDN.method215(arg0));
				for (int var4 = 0; var4 < field397; var4++) {
					if (field233[var4] == arg0) {
						method155(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field379; var5++) {
					if (field95[var5] == arg0) {
						method155(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field146.field1187)) {
					field377[field397] = var3;
					field233[field397] = arg0;
					field207[field397] = 0;
					field397++;
					field438 = true;
					field180.method467(172);
					field180.method474(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method65(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field399[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field65[var6][var4][var5] + field65[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field65[var6][var4][var5 + 1] + field65[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method66() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field71[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field71[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field72[var10] = (field71[var10 - 1] + field71[var10 + 1] + field71[var10 - 128] + field71[var10 + 128]) / 4;
			}
		}

		field190 += 128;
		if (field190 > field216.length) {
			field190 -= field216.length;
			int var11 = (int) (Math.random() * 12.0D);
			method130(field283[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field72[var14 + 128] - field216[field190 + var14 & field216.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field71[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field478[var16] = field478[var16 + 1];
		}

		field478[var1 - 1] = (int) (Math.sin(field287 / 14.0D) * 16.0D + Math.sin(field287 / 15.0D) * 14.0D + Math.sin(field287 / 16.0D) * 12.0D);

		if (field131 > 0) {
			field131 -= 4;
		}

		if (field132 > 0) {
			field132 -= 4;
		}

		if (field131 == 0 && field132 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field131 = 1024;
			}

			if (var17 == 1) {
				field132 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILKFCZNNDM;)Z")
	public final boolean method67(KFCZNNDM arg0) {
		int var2 = arg0.field909;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field182[field476] = "Remove @whi@" + arg0.field885;
				field354[field476] = 817;
				field476++;
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

		field182[field476] = "Remove @whi@" + field377[var2];
		field354[field476] = 224;
		field476++;
		field182[field476] = "Message @whi@" + field377[var2];
		field354[field476] = 808;
		field476++;
		return true;
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public static final String method68(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IILTKIWGAGO;II)V")
	public final void method69(int arg0, TKIWGAGO arg1, int arg2, int arg3) {
		if (field146 != arg1 && field476 < 400) {
			String var5;
			if (arg1.field1176 == 0) {
				var5 = arg1.field1187 + method173(arg1.field1177, field146.field1177) + " (level-" + arg1.field1177 + ")";
			} else {
				var5 = arg1.field1187 + " (skill-" + arg1.field1176 + ")";
			}

			if (field222 == 1) {
				field182[field476] = "Use " + field226 + " with @whi@" + var5;
				field354[field476] = 245;
				field355[field476] = arg2;
				field352[field476] = arg3;
				field353[field476] = arg0;
				field476++;
			} else if (field218 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field417[var6] != null) {
						field182[field476] = field417[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field417[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1177 > field146.field1177) {
								var7 = 2000;
							}

							if (field146.field1188 != 0 && arg1.field1188 != 0) {
								if (field146.field1188 == arg1.field1188) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field418[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field354[field476] = var7 + 589;
						}

						if (var6 == 1) {
							field354[field476] = var7 + 970;
						}

						if (var6 == 2) {
							field354[field476] = var7 + 439;
						}

						if (var6 == 3) {
							field354[field476] = var7 + 257;
						}

						if (var6 == 4) {
							field354[field476] = var7 + 319;
						}

						field355[field476] = arg2;
						field352[field476] = arg3;
						field353[field476] = arg0;
						field476++;
					}
				}
			} else if ((field220 & 0x8) == 8) {
				field182[field476] = field221 + " @whi@" + var5;
				field354[field476] = 609;
				field355[field476] = arg2;
				field352[field476] = arg3;
				field353[field476] = arg0;
				field476++;
			}

			for (int var8 = 0; var8 < field476; var8++) {
				if (field354[var8] == 252) {
					field182[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method70() {
		if (field1035 == 1) {
			if (field1036 >= 6 && field1036 <= 106 && field1037 >= 467 && field1037 <= 499) {
				field477 = (field477 + 1) % 4;
				field268 = true;
				field79 = true;
				field180.method467(16);
				field180.method468(field477);
				field180.method468(field360);
				field180.method468(field135);
			}

			if (field1036 >= 135 && field1036 <= 235 && field1037 >= 467 && field1037 <= 499) {
				field360 = (field360 + 1) % 3;
				field268 = true;
				field79 = true;
				field180.method467(16);
				field180.method468(field477);
				field180.method468(field360);
				field180.method468(field135);
			}

			if (field1036 >= 273 && field1036 <= 373 && field1037 >= 467 && field1037 <= 499) {
				field135 = (field135 + 1) % 3;
				field268 = true;
				field79 = true;
				field180.method467(16);
				field180.method468(field477);
				field180.method468(field360);
				field180.method468(field135);
			}

			if (field1036 >= 412 && field1036 <= 512 && field1037 >= 467 && field1037 <= 499) {
				if (field230 == -1) {
					method97();
					field267 = "";
					field93 = false;

					for (int var1 = 0; var1 < KFCZNNDM.field939.length; var1++) {
						if (KFCZNNDM.field939[var1] != null && KFCZNNDM.field939[var1].field909 == 600) {
							field277 = field230 = KFCZNNDM.field939[var1].field884;
							return;
						}
					}

					return;
				}

				method155(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public static final void method71() {
		ZCHENGKI.field1411 = true;
		JJAEHWOM.field848 = true;
		field201 = true;
		SGOFWBIX.field1148 = true;
		DHQCHKXN.field591 = true;
	}

	@ObfuscatedName("client.u(I)V")
	public void method72() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field67);

		if (field281 != null) {
			System.out.println("Od-cycle:" + field281.field1272);
		}

		System.out.println("loop-cycle:" + field287);
		System.out.println("draw-cycle:" + field452);
		System.out.println("ptype:" + field100);
		System.out.println("psize:" + field99);

		if (field145 != null) {
			field145.method356();
		}

		field1018 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method73() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1024 != null) {
			return field1024;
		}

		return this;
	}

	@ObfuscatedName("client.a(LKFCZNNDM;IIIIZIIB)V")
	public final void method74(KFCZNNDM arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (field124) {
			field314 = 32;
		} else {
			field314 = 0;
		}

		field124 = false;
		if (arg3 >= arg4 && arg3 < arg4 + 16 && arg7 >= arg6 && arg7 < arg6 + 16) {
			arg0.field931 -= field404 * 4;

			if (arg5) {
				field438 = true;
				return;
			}
		} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg7 >= arg1 + arg6 - 16 && arg7 < arg1 + arg6) {
			arg0.field931 += field404 * 4;

			if (arg5) {
				field438 = true;
				return;
			}
		} else if (arg3 >= arg4 - field314 && arg3 < arg4 + field314 + 16 && arg7 >= arg6 + 16 && arg7 < arg1 + arg6 - 16 && field404 > 0) {
			int var9 = (arg1 - 32) * arg1 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg6 - var9 / 2 - 16;
			int var11 = arg1 - var9 - 32;
			arg0.field931 = (arg2 - arg1) * var10 / var11;

			if (arg5) {
				field438 = true;
			}

			field124 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public static final void method75() {
		ZCHENGKI.field1411 = false;
		JJAEHWOM.field848 = false;
		field201 = false;
		SGOFWBIX.field1148 = false;
		DHQCHKXN.field591 = false;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field174.method533(arg1, arg2);
		field175.method533(arg1 + arg4 - 16, arg2);
		KVJNUKIT.method344(16, field395, arg1 + 16, arg2, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
		KVJNUKIT.method344(16, field227, arg1 + var7 + 16, arg2, var6);
		KVJNUKIT.method349(arg2, var6, arg1 + var7 + 16, field447);
		KVJNUKIT.method349(arg2 + 1, var6, arg1 + var7 + 16, field447);
		KVJNUKIT.method347(16, arg1 + var7 + 16, field447, arg2);
		KVJNUKIT.method347(16, arg1 + var7 + 17, field447, arg2);
		KVJNUKIT.method349(arg2 + 15, var6, arg1 + var7 + 16, field378);
		KVJNUKIT.method349(arg2 + 14, var6 - 1, arg1 + var7 + 17, field378);
		KVJNUKIT.method347(16, arg1 + var7 + var6 + 15, field378, arg2);
		KVJNUKIT.method347(15, arg1 + var7 + var6 + 14, field378, arg2 + 1);
	}

	@ObfuscatedName("client.a(IIIIZLKFCZNNDM;I)V")
	public final void method77(int arg0, int arg1, int arg2, int arg3, KFCZNNDM arg4, int arg5) {
		if (arg4.field940 == 0 && arg4.field913 != null && !arg4.field898 && (arg2 >= arg5 && arg3 >= arg0 && arg2 <= arg4.field915 + arg5 && arg3 <= arg4.field938 + arg0)) {
			int var7 = arg4.field913.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg4.field894[var8] + arg5;
				int var10 = arg4.field907[var8] + arg0 - arg1;
				KFCZNNDM var11 = KFCZNNDM.field939[arg4.field913[var8]];
				var9 += var11.field901;
				var10 += var11.field883;
				if ((var11.field942 >= 0 || var11.field896 != 0) && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
					if (var11.field942 >= 0) {
						field170 = var11.field942;
					} else {
						field170 = var11.field925;
					}
				}

				if (var11.field940 == 0) {
					method77(var10, var11.field931, arg2, arg3, var11, var9);

					if (var11.field908 > var11.field938) {
						method74(var11, var11.field938, var11.field908, arg2, var11.field915 + var9, true, var10, arg3);
					}
				} else {
					if (var11.field941 == 1 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						boolean var12 = false;
						if (var11.field909 != 0) {
							var12 = method67(var11);
						}

						if (!var12) {
							field182[field476] = var11.field920;
							field354[field476] = 927;
							field353[field476] = var11.field925;
							field476++;
						}
					}

					if (var11.field941 == 2 && field218 == 0 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						String var13 = var11.field881;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field182[field476] = var13 + " @gre@" + var11.field900;
						field354[field476] = 743;
						field353[field476] = var11.field925;
						field476++;
					}

					if (var11.field941 == 3 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						field182[field476] = "Close";
						field354[field476] = 974;
						field353[field476] = var11.field925;
						field476++;
					}

					if (var11.field941 == 4 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						field182[field476] = var11.field920;
						field354[field476] = 222;
						field353[field476] = var11.field925;
						field476++;
					}

					if (var11.field941 == 5 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						field182[field476] = var11.field920;
						field354[field476] = 872;
						field353[field476] = var11.field925;
						field476++;
					}

					if (var11.field941 == 6 && !field110 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field915 + var9 && arg3 < var11.field938 + var10) {
						field182[field476] = var11.field920;
						field354[field476] = 731;
						field353[field476] = var11.field925;
						field476++;
					}

					if (var11.field940 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field938; var15++) {
							for (int var16 = 0; var16 < var11.field915; var16++) {
								int var17 = (var11.field919 + 32) * var16 + var9;
								int var18 = (var11.field906 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field934[var14];
									var18 += var11.field924[var14];
								}

								if (arg2 >= var17 && arg3 >= var18 && arg2 < var17 + 32 && arg3 < var18 + 32) {
									field228 = var14;
									field229 = var11.field925;

									if (var11.field886[var14] > 0) {
										WKEFMNQD var19 = WKEFMNQD.method437(var11.field886[var14] - 1);
										if (field222 == 1 && var11.field921) {
											if (field224 != var11.field925 || field223 != var14) {
												field182[field476] = "Use " + field226 + " with @lre@" + var19.field1219;
												field354[field476] = 741;
												field355[field476] = var19.field1222;
												field352[field476] = var14;
												field353[field476] = var11.field925;
												field476++;
											}
										} else if (field218 != 1 || !var11.field921) {
											if (var11.field921) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field1251 != null && var19.field1251[var20] != null) {
														field182[field476] = var19.field1251[var20] + " @lre@" + var19.field1219;

														if (var20 == 3) {
															field354[field476] = 652;
														}

														if (var20 == 4) {
															field354[field476] = 996;
														}

														field355[field476] = var19.field1222;
														field352[field476] = var14;
														field353[field476] = var11.field925;
														field476++;
													} else if (var20 == 4) {
														field182[field476] = "Drop @lre@" + var19.field1219;
														field354[field476] = 996;
														field355[field476] = var19.field1222;
														field352[field476] = var14;
														field353[field476] = var11.field925;
														field476++;
													}
												}
											}

											if (var11.field910) {
												field182[field476] = "Use @lre@" + var19.field1219;
												field354[field476] = 237;
												field355[field476] = var19.field1222;
												field352[field476] = var14;
												field353[field476] = var11.field925;
												field476++;
											}

											if (var11.field921 && var19.field1251 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field1251[var21] != null) {
														field182[field476] = var19.field1251[var21] + " @lre@" + var19.field1219;

														if (var21 == 0) {
															field354[field476] = 276;
														}

														if (var21 == 1) {
															field354[field476] = 428;
														}

														if (var21 == 2) {
															field354[field476] = 921;
														}

														field355[field476] = var19.field1222;
														field352[field476] = var14;
														field353[field476] = var11.field925;
														field476++;
													}
												}
											}

											if (var11.field892 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field892[var22] != null) {
														field182[field476] = var11.field892[var22] + " @lre@" + var19.field1219;

														if (var22 == 0) {
															field354[field476] = 97;
														}

														if (var22 == 1) {
															field354[field476] = 657;
														}

														if (var22 == 2) {
															field354[field476] = 298;
														}

														if (var22 == 3) {
															field354[field476] = 601;
														}

														if (var22 == 4) {
															field354[field476] = 855;
														}

														field355[field476] = var19.field1222;
														field352[field476] = var14;
														field353[field476] = var11.field925;
														field476++;
													}
												}
											}

											field182[field476] = "Examine @lre@" + var19.field1219;
											field354[field476] = 1562;
											field355[field476] = var19.field1222;
											field352[field476] = var14;
											field353[field476] = var11.field925;
											field476++;
										} else if ((field220 & 0x10) == 0x10) {
											field182[field476] = field221 + " @lre@" + var19.field1219;
											field354[field476] = 2;
											field355[field476] = var19.field1222;
											field352[field476] = var14;
											field353[field476] = var11.field925;
											field476++;
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

	@ObfuscatedName("client.w(I)V")
	public final void method78() {
		if (field1035 == 1) {
			if (field1036 >= 539 && field1036 <= 573 && field1037 >= 169 && field1037 < 205 && field276[0] != -1) {
				field438 = true;
				field94 = 0;
				field338 = true;
			}

			if (field1036 >= 569 && field1036 <= 599 && field1037 >= 168 && field1037 < 205 && field276[1] != -1) {
				field438 = true;
				field94 = 1;
				field338 = true;
			}

			if (field1036 >= 597 && field1036 <= 627 && field1037 >= 168 && field1037 < 205 && field276[2] != -1) {
				field438 = true;
				field94 = 2;
				field338 = true;
			}

			if (field1036 >= 625 && field1036 <= 669 && field1037 >= 168 && field1037 < 203 && field276[3] != -1) {
				field438 = true;
				field94 = 3;
				field338 = true;
			}

			if (field1036 >= 666 && field1036 <= 696 && field1037 >= 168 && field1037 < 205 && field276[4] != -1) {
				field438 = true;
				field94 = 4;
				field338 = true;
			}

			if (field1036 >= 694 && field1036 <= 724 && field1037 >= 168 && field1037 < 205 && field276[5] != -1) {
				field438 = true;
				field94 = 5;
				field338 = true;
			}

			if (field1036 >= 722 && field1036 <= 756 && field1037 >= 169 && field1037 < 205 && field276[6] != -1) {
				field438 = true;
				field94 = 6;
				field338 = true;
			}

			if (field1036 >= 540 && field1036 <= 574 && field1037 >= 466 && field1037 < 502 && field276[7] != -1) {
				field438 = true;
				field94 = 7;
				field338 = true;
			}

			if (field1036 >= 572 && field1036 <= 602 && field1037 >= 466 && field1037 < 503 && field276[8] != -1) {
				field438 = true;
				field94 = 8;
				field338 = true;
			}

			if (field1036 >= 599 && field1036 <= 629 && field1037 >= 466 && field1037 < 503 && field276[9] != -1) {
				field438 = true;
				field94 = 9;
				field338 = true;
			}

			if (field1036 >= 627 && field1036 <= 671 && field1037 >= 467 && field1037 < 502 && field276[10] != -1) {
				field438 = true;
				field94 = 10;
				field338 = true;
			}

			if (field1036 >= 669 && field1036 <= 699 && field1037 >= 466 && field1037 < 503 && field276[11] != -1) {
				field438 = true;
				field94 = 11;
				field338 = true;
			}

			if (field1036 >= 696 && field1036 <= 726 && field1037 >= 466 && field1037 < 503 && field276[12] != -1) {
				field438 = true;
				field94 = 12;
				field338 = true;
			}

			if (field1036 >= 724 && field1036 <= 758 && field1037 >= 466 && field1037 < 502 && field276[13] != -1) {
				field438 = true;
				field94 = 13;
				field338 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)Z")
	public final boolean method79() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.y(I)V")
	public final void method80() {
		DHQCHKXN.field606.method222();
		DHQCHKXN.field596.method222();
		FWGUGZKU.field666.method222();
		WKEFMNQD.field1237.method222();
		WKEFMNQD.field1246.method222();
		TKIWGAGO.field1197.method222();
		FPSNPMMW.field653.method222();
	}

	@ObfuscatedName("client.z(I)V")
	public final void method81() {
		if (field261 == 2) {
			for (ZDLIXYKO var1 = (ZDLIXYKO) field320.method199(); var1 != null; var1 = (ZDLIXYKO) field320.method201()) {
				if (var1.field1481 > 0) {
					var1.field1481--;
				}

				if (var1.field1481 != 0) {
					if (var1.field1477 > 0) {
						var1.field1477--;
					}

					if (var1.field1477 == 0 && var1.field1484 >= 1 && var1.field1485 >= 1 && var1.field1484 <= 102 && var1.field1485 <= 102 && (var1.field1478 < 0 || SGOFWBIX.method402(var1.field1478, var1.field1480))) {
						method53(var1.field1480, var1.field1483, var1.field1485, var1.field1479, var1.field1482, var1.field1484, var1.field1478);
						var1.field1477 = -1;

						if (var1.field1478 == var1.field1474 && var1.field1474 == -1) {
							var1.method195();
						} else if (var1.field1478 == var1.field1474 && var1.field1479 == var1.field1475 && var1.field1480 == var1.field1476) {
							var1.method195();
						}
					}
				} else if (var1.field1474 < 0 || SGOFWBIX.method402(var1.field1474, var1.field1476)) {
					method53(var1.field1476, var1.field1483, var1.field1485, var1.field1475, var1.field1482, var1.field1484, var1.field1474);
					var1.method195();
				}
			}

			field434++;
			if (field434 > 1068) {
				field434 = 0;
				field180.method467(173);
				field180.method468(0);
				int var2 = field180.field1335;

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method469(9630);
				}

				field180.method469(18906);
				field180.method469((int) (Math.random() * 65536.0D));
				field180.method469(51983);

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method469(14946);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method468(185);
				}

				field180.method468((int) (Math.random() * 256.0D));
				field180.method468(69);
				field180.method468((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method469(2883);
				}

				field180.method477(field180.field1335 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method82(boolean arg0) {
		if (field146.field514 >> 7 == field254 && field146.field515 >> 7 == field255) {
			field254 = 0;
		}

		int var2 = field368;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			TKIWGAGO var4;
			int var5;
			if (arg0) {
				var4 = field146;
				var5 = field366 << 14;
			} else {
				var4 = field367[field369[var3]];
				var5 = field369[var3] << 14;
			}

			if (var4 != null && var4.method1()) {
				var4.field1190 = false;
				if ((field201 && field368 > 50 || field368 > 200) && !arg0 && var4.field541 == var4.field537) {
					var4.field1190 = true;
				}

				int var6 = var4.field514 >> 7;
				int var7 = var4.field515 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1194 == null || field287 < var4.field1198 || field287 >= var4.field1199) {
						if ((var4.field514 & 0x7F) == 0x40 && (var4.field515 & 0x7F) == 0x40) {
							if (field316[var6][var7] == field464) {
								continue;
							}

							field316[var6][var7] = field464;
						}

						var4.field1186 = method65(var4.field515, field137, var4.field514);
						field358.method550(var4.field1186, var4.field514, var4.field516, 60, field137, var4, var4.field515, var5, var4.field513);
					} else {
						var4.field1190 = false;
						var4.field1186 = method65(var4.field515, field137, var4.field514);
						field358.method551(var4.field1186, var5, var4.field1180, var4.field1181, var4.field516, field137, var4.field515, var4, var4.field514, var4.field1179, 60, var4.field1182);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method83() {
		while (true) {
			int var1 = method389();
			if (var1 == -1) {
				return;
			}

			if (field230 != -1 && field277 == field230) {
				if (var1 == 8 && field267.length() > 0) {
					field267 = field267.substring(0, field267.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field267.length() < 12) {
					field267 = field267 + (char) var1;
				}
			} else if (field448) {
				if (var1 >= 32 && var1 <= 122 && field210.length() < 80) {
					field210 = field210 + (char) var1;
					field79 = true;
				}

				if (var1 == 8 && field210.length() > 0) {
					field210 = field210.substring(0, field210.length() - 1);
					field79 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field448 = false;
					field79 = true;

					if (field319 == 1) {
						long var2 = FYSVECDN.method214(field210);
						method64(var2);
					}

					if (field319 == 2 && field397 > 0) {
						long var4 = FYSVECDN.method214(field210);
						method43(var4);
					}

					if (field319 == 3 && field210.length() > 0) {
						field180.method467(252);
						field180.method468(0);
						int var6 = field180.field1335;
						field180.method474(field114);
						GYTJTJWK.method224(field180, field210);
						field180.method477(field180.field1335 - var6);
						field210 = GYTJTJWK.method225(field210);
						field210 = KUCFVEDX.method311(field210);
						method155(6, field210, FYSVECDN.method218(FYSVECDN.method215(field114)));

						if (field360 == 2) {
							field360 = 1;
							field268 = true;
							field180.method467(16);
							field180.method468(field477);
							field180.method468(field360);
							field180.method468(field135);
						}
					}

					if (field319 == 4 && field379 < 100) {
						long var7 = FYSVECDN.method214(field210);
						method91(var7);
					}

					if (field319 == 5 && field379 > 0) {
						long var9 = FYSVECDN.method214(field210);
						method128(var9);
					}
				}
			} else if (field407 == 1) {
				if (var1 >= 48 && var1 <= 57 && field409.length() < 10) {
					field409 = field409 + (char) var1;
					field79 = true;
				}

				if (var1 == 8 && field409.length() > 0) {
					field409 = field409.substring(0, field409.length() - 1);
					field79 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field409.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field409);
						} catch (Exception var21) {
						}

						field180.method467(211);
						field180.method472(var11);
					}

					field407 = 0;
					field79 = true;
				}
			} else if (field407 == 2) {
				if (var1 >= 32 && var1 <= 122 && field409.length() < 12) {
					field409 = field409 + (char) var1;
					field79 = true;
				}

				if (var1 == 8 && field409.length() > 0) {
					field409 = field409.substring(0, field409.length() - 1);
					field79 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field409.length() > 0) {
						field180.method467(227);
						field180.method474(FYSVECDN.method214(field409));
					}

					field407 = 0;
					field79 = true;
				}
			} else if (field279 == -1) {
				if (var1 >= 32 && var1 <= 122 && field465.length() < 80) {
					field465 = field465 + (char) var1;
					field79 = true;
				}

				if (var1 == 8 && field465.length() > 0) {
					field465 = field465.substring(0, field465.length() - 1);
					field79 = true;
				}

				if ((var1 == 13 || var1 == 10) && field465.length() > 0) {
					if (field364 == 2) {
						if (field465.equals("::clientdrop")) {
							method39();
						}

						if (field465.equals("::lag")) {
							method72();
						}

						if (field465.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field281.method439(2); var12++) {
								field281.method447(var12, 2, (byte) 1);
							}
						}

						if (field465.equals("::fpson")) {
							field272 = true;
						}

						if (field465.equals("::fpsoff")) {
							field272 = false;
						}

						if (field465.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field82[var13].field1351[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field465.startsWith("::")) {
						field180.method467(180);
						field180.method468(field465.length() - 1);
						field180.method475(field465.substring(2));
					} else {
						String var16 = field465.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field465 = field465.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field465 = field465.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field465 = field465.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field465 = field465.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field465 = field465.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field465 = field465.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field465 = field465.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field465 = field465.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field465 = field465.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field465 = field465.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field465 = field465.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field465 = field465.substring(6);
						}

						String var18 = field465.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field465 = field465.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field465 = field465.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field465 = field465.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field465 = field465.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field465 = field465.substring(6);
						}

						field180.method467(119);
						field180.method468(0);
						int var20 = field180.field1335;
						field180.method468(var17);
						field458.field1335 = 0;
						GYTJTJWK.method224(field458, field465);
						field180.method476(field458.field1335, 0, field458.field1334);
						field180.method468(var19);
						field180.method477(field180.field1335 - var20);
						field465 = GYTJTJWK.method225(field465);
						field465 = KUCFVEDX.method311(field465);
						field146.field511 = field465;
						field146.field546 = var17;
						field146.field554 = var19;
						field146.field528 = 150;

						if (field364 == 2) {
							method155(2, field146.field511, "@cr2@" + field146.field1187);
						} else if (field364 == 1) {
							method155(2, field146.field511, "@cr1@" + field146.field1187);
						} else {
							method155(2, field146.field511, field146.field1187);
						}

						if (field477 == 2) {
							field477 = 3;
							field268 = true;
							field180.method467(16);
							field180.method468(field477);
							field180.method468(field360);
							field180.method468(field135);
						}
					}

					field465 = "";
					field79 = true;
				}
			}
		}
	}

	public final void init() {
		field198 = Integer.parseInt(getParameter("nodeid"));
		field199 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method71();
		} else {
			method75();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field200 = false;
		} else {
			field200 = true;
		}

		method386(765, 503);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method84() {
		if (field222 == 0 && field218 == 0) {
			field182[field476] = "Walk here";
			field354[field476] = 252;
			field352[field476] = field1029;
			field353[field476] = field1030;
			field476++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < ITSMSHJO.field814; var2++) {
			int var3 = ITSMSHJO.field815[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field358.method569(field137, var4, var5, var3) >= 0) {
					DHQCHKXN var8 = DHQCHKXN.method194(var7);
					if (var8.field604 != null) {
						var8 = var8.method189();
					}

					if (var8 == null) {
						continue;
					}

					if (field222 == 1) {
						field182[field476] = "Use " + field226 + " with @cya@" + var8.field607;
						field354[field476] = 521;
						field355[field476] = var3;
						field352[field476] = var4;
						field353[field476] = var5;
						field476++;
					} else if (field218 != 1) {
						if (var8.field576 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field576[var9] != null) {
									field182[field476] = var8.field576[var9] + " @cya@" + var8.field607;

									if (var9 == 0) {
										field354[field476] = 516;
									}

									if (var9 == 1) {
										field354[field476] = 656;
									}

									if (var9 == 2) {
										field354[field476] = 294;
									}

									if (var9 == 3) {
										field354[field476] = 190;
									}

									if (var9 == 4) {
										field354[field476] = 1190;
									}

									field355[field476] = var3;
									field352[field476] = var4;
									field353[field476] = var5;
									field476++;
								}
							}
						}

						field182[field476] = "Examine @cya@" + var8.field607;
						field354[field476] = 1579;
						field355[field476] = var8.field587 << 14;
						field352[field476] = var4;
						field353[field476] = var5;
						field476++;
					} else if ((field220 & 0x4) == 4) {
						field182[field476] = field221 + " @cya@" + var8.field607;
						field354[field476] = 502;
						field355[field476] = var3;
						field352[field476] = var4;
						field353[field476] = var5;
						field476++;
					}
				}

				if (var6 == 1) {
					AHIOLHWV var10 = field459[var7];
					if (var10.field1.field681 == 1 && (var10.field514 & 0x7F) == 0x40 && (var10.field515 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field460; var11++) {
							AHIOLHWV var12 = field459[field461[var11]];
							if (var12 != null && var10 != var12 && var12.field1.field681 == 1 && var10.field514 == var12.field514 && var10.field515 == var12.field515) {
								method61(field461[var11], var4, var12.field1, var5);
							}
						}

						for (int var13 = 0; var13 < field368; var13++) {
							TKIWGAGO var14 = field367[field369[var13]];
							if (var14 != null && var10.field514 == var14.field514 && var10.field515 == var14.field515) {
								method69(var5, var14, field369[var13], var4);
							}
						}
					}

					method61(var7, var4, var10.field1, var5);
				}

				if (var6 == 0) {
					TKIWGAGO var15 = field367[var7];
					if ((var15.field514 & 0x7F) == 0x40 && (var15.field515 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field460; var16++) {
							AHIOLHWV var17 = field459[field461[var16]];
							if (var17 != null && var17.field1.field681 == 1 && var15.field514 == var17.field514 && var15.field515 == var17.field515) {
								method61(field461[var16], var4, var17.field1, var5);
							}
						}

						for (int var18 = 0; var18 < field368; var18++) {
							TKIWGAGO var19 = field367[field369[var18]];
							if (var19 != null && var15 != var19 && var15.field514 == var19.field514 && var15.field515 == var19.field515) {
								method69(var5, var19, field369[var18], var4);
							}
						}
					}

					method69(var5, var15, var7, var4);
				}

				if (var6 == 3) {
					FOKYUBQV var20 = field329[field137][var4][var5];
					if (var20 != null) {
						for (NDUHNYJR var21 = (NDUHNYJR) var20.method200(); var21 != null; var21 = (NDUHNYJR) var20.method202()) {
							WKEFMNQD var22 = WKEFMNQD.method437(var21.field993);
							if (field222 == 1) {
								field182[field476] = "Use " + field226 + " with @lre@" + var22.field1219;
								field354[field476] = 726;
								field355[field476] = var21.field993;
								field352[field476] = var4;
								field353[field476] = var5;
								field476++;
							} else if (field218 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1212 != null && var22.field1212[var23] != null) {
										field182[field476] = var22.field1212[var23] + " @lre@" + var22.field1219;

										if (var23 == 0) {
											field354[field476] = 71;
										}

										if (var23 == 1) {
											field354[field476] = 154;
										}

										if (var23 == 2) {
											field354[field476] = 560;
										}

										if (var23 == 3) {
											field354[field476] = 596;
										}

										if (var23 == 4) {
											field354[field476] = 301;
										}

										field355[field476] = var21.field993;
										field352[field476] = var4;
										field353[field476] = var5;
										field476++;
									} else if (var23 == 2) {
										field182[field476] = "Take @lre@" + var22.field1219;
										field354[field476] = 560;
										field355[field476] = var21.field993;
										field352[field476] = var4;
										field353[field476] = var5;
										field476++;
									}
								}

								field182[field476] = "Examine @lre@" + var22.field1219;
								field354[field476] = 1038;
								field355[field476] = var21.field993;
								field352[field476] = var4;
								field353[field476] = var5;
								field476++;
							} else if ((field220 & 0x1) == 1) {
								field182[field476] = field221 + " @lre@" + var22.field1219;
								field354[field476] = 962;
								field355[field476] = var21.field993;
								field352[field476] = var4;
								field353[field476] = var5;
								field476++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method85() {
		try {
			int var1 = field146.field514 + field299;
			int var2 = field146.field515 + field339;
			if (field83 - var1 < -500 || field83 - var1 > 500 || field84 - var2 < -500 || field84 - var2 > 500) {
				field83 = var1;
				field84 = var2;
			}

			if (field83 != var1) {
				field83 += (var1 - field83) / 16;
			}

			if (field84 != var2) {
				field84 += (var2 - field84) / 16;
			}

			if (field1039[1] == 1) {
				field423 += (-field423 - 24) / 2;
			} else if (field1039[2] == 1) {
				field423 += (24 - field423) / 2;
			} else {
				field423 /= 2;
			}

			if (field1039[3] == 1) {
				field424 += (12 - field424) / 2;
			} else if (field1039[4] == 1) {
				field424 += (-field424 - 12) / 2;
			} else {
				field424 /= 2;
			}

			field422 = field423 / 2 + field422 & 0x7FF;
			field421 += field424 / 2;
			if (field421 < 128) {
				field421 = 128;
			}

			if (field421 > 383) {
				field421 = 383;
			}

			int var3 = field83 >> 7;
			int var4 = field84 >> 7;
			int var5 = method65(field84, field137, field83);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field137;
						if (var9 < 3 && (field399[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field65[var9][var7][var8];
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

			if (var11 > field483) {
				field483 += (var11 - field483) / 24;
			} else if (var11 < field483) {
				field483 += (var11 - field483) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field146.field514 + "," + field146.field515 + "," + field83 + "," + field84 + "," + field236 + "," + field237 + "," + field104 + "," + field105);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method86() {
		if (field442 == 0) {
			int var1 = field1019 / 2 - 80;
			int var2 = field1020 / 2 + 20;
			var2 += 20;
			if (field1035 == 1 && field1036 >= var1 - 75 && field1036 <= var1 + 75 && field1037 >= var2 - 20 && field1037 <= var2 + 20) {
				field442 = 3;
				field328 = 0;
			}

			int var3 = field1019 / 2 + 80;
			if (field1035 == 1 && field1036 >= var3 - 75 && field1036 <= var3 + 75 && field1037 >= var2 - 20 && field1037 <= var2 + 20) {
				field291 = "";
				field292 = "Enter your username & password.";
				field442 = 2;
				field328 = 0;
			}
		} else if (field442 == 2) {
			int var4 = field1020 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1035 == 1 && field1037 >= var4 - 15 && field1037 < var4) {
				field328 = 0;
			}

			var4 += 15;
			if (field1035 == 1 && field1037 >= var4 - 15 && field1037 < var4) {
				field328 = 1;
			}

			var4 += 15;
			int var5 = field1019 / 2 - 80;
			int var6 = field1020 / 2 + 50;
			var6 += 20;
			if (field1035 == 1 && field1036 >= var5 - 75 && field1036 <= var5 + 75 && field1037 >= var6 - 20 && field1037 <= var6 + 20) {
				field275 = 0;
				method154(field485, field486, false);

				if (field307) {
					return;
				}
			}

			int var7 = field1019 / 2 + 80;
			if (field1035 == 1 && field1036 >= var7 - 75 && field1036 <= var7 + 75 && field1037 >= var6 - 20 && field1037 <= var6 + 20) {
				field442 = 0;
				field485 = "";
				field486 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method389();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field274.length(); var10++) {
					if (var8 == field274.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field328 == 0) {
					if (var8 == 8 && field485.length() > 0) {
						field485 = field485.substring(0, field485.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field328 = 1;
					}

					if (var9) {
						field485 = field485 + (char) var8;
					}

					if (field485.length() > 12) {
						field485 = field485.substring(0, 12);
					}
				} else if (field328 == 1) {
					if (var8 == 8 && field486.length() > 0) {
						field486 = field486.substring(0, field486.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field328 = 0;
					}

					if (var9) {
						field486 = field486 + (char) var8;
					}

					if (field486.length() > 20) {
						field486 = field486.substring(0, 20);
					}
				}
			}
		} else if (field442 == 3) {
			int var11 = field1019 / 2;
			int var12 = field1020 / 2 + 50;
			var12 += 20;
			if (field1035 == 1 && field1036 >= var11 - 75 && field1036 <= var11 + 75 && field1037 >= var12 - 20 && field1037 <= var12 + 20) {
				field442 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILKFCZNNDM;I)V")
	public final void method87(int arg0, int arg1, int arg2, KFCZNNDM arg3) {
		if (arg3.field940 == 0 && arg3.field913 != null && (!arg3.field898 || field406 == arg3.field925 || field482 == arg3.field925 || field282 == arg3.field925)) {
			int var5 = KVJNUKIT.field956;
			int var6 = KVJNUKIT.field954;
			int var7 = KVJNUKIT.field957;
			int var8 = KVJNUKIT.field955;
			KVJNUKIT.method341(arg2, arg1, arg3.field915 + arg2, arg3.field938 + arg1);
			int var9 = arg3.field913.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field894[var10] + arg2;
				int var12 = arg3.field907[var10] + arg1 - arg0;
				KFCZNNDM var13 = KFCZNNDM.field939[arg3.field913[var10]];
				var11 += var13.field901;
				var12 += var13.field883;

				if (var13.field909 > 0) {
					method137(var13);
				}

				if (var13.field940 == 0) {
					if (var13.field931 > var13.field908 - var13.field938) {
						var13.field931 = var13.field908 - var13.field938;
					}

					if (var13.field931 < 0) {
						var13.field931 = 0;
					}

					method87(var13.field931, var12, var11, var13);

					if (var13.field908 > var13.field938) {
						method76(var13.field908, var12, var13.field915 + var11, var13.field931, var13.field938);
					}
				} else if (var13.field940 != 1) {
					if (var13.field940 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field938; var15++) {
							for (int var16 = 0; var16 < var13.field915; var16++) {
								int var17 = (var13.field919 + 32) * var16 + var11;
								int var18 = (var13.field906 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field934[var14];
									var18 += var13.field924[var14];
								}

								if (var13.field886[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field886[var14] - 1;
									if (var17 > KVJNUKIT.field956 - 32 && var17 < KVJNUKIT.field957 && var18 > KVJNUKIT.field954 - 32 && var18 < KVJNUKIT.field955 || field334 != 0 && field333 == var14) {
										int var22 = 0;
										if (field222 == 1 && field223 == var14 && field224 == var13.field925) {
											var22 = 0xFFFFFF;
										}

										BFUTXOBU var23 = WKEFMNQD.method436(var22, var13.field918[var14], var21);
										if (var23 != null) {
											if (field334 != 0 && field333 == var14 && field332 == var13.field925) {
												var19 = field1029 - field335;
												var20 = field1030 - field336;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field167 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method15(128, var17 + var19, var18 + var20);

												if (var18 + var20 < KVJNUKIT.field954 && arg3.field931 > 0) {
													int var24 = (KVJNUKIT.field954 - var18 - var20) * field433 / 3;
													if (var24 > field433 * 10) {
														var24 = field433 * 10;
													}

													if (var24 > arg3.field931) {
														var24 = arg3.field931;
													}

													arg3.field931 -= var24;
													field336 += var24;
												}

												if (var18 + var20 + 32 > KVJNUKIT.field955 && arg3.field931 < arg3.field908 - arg3.field938) {
													int var25 = (var18 + var20 + 32 - KVJNUKIT.field955) * field433 / 3;
													if (var25 > field433 * 10) {
														var25 = field433 * 10;
													}

													if (var25 > arg3.field908 - arg3.field938 - arg3.field931) {
														var25 = arg3.field908 - arg3.field938 - arg3.field931;
													}

													arg3.field931 += var25;
													field336 -= var25;
												}
											} else if (field296 != 0 && field295 == var14 && field294 == var13.field925) {
												var23.method15(128, var17, var18);
											} else {
												var23.method13(var18, var17);
											}

											if (var23.field34 == 33 || var13.field918[var14] != 1) {
												int var26 = var13.field918[var14];
												field443.method374(var18 + var20 + 10, method68(var26), var17 + var19 + 1, 0);
												field443.method374(var18 + var20 + 9, method68(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field911 != null && var14 < 20) {
									BFUTXOBU var27 = var13.field911[var14];
									if (var27 != null) {
										var27.method13(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field940 == 3) {
						boolean var28 = false;
						if (field282 == var13.field925 || field482 == var13.field925 || field406 == var13.field925) {
							var28 = true;
						}

						int var29;
						if (method50(var13)) {
							var29 = var13.field880;
							if (var28 && var13.field927 != 0) {
								var29 = var13.field927;
							}
						} else {
							var29 = var13.field928;
							if (var28 && var13.field896 != 0) {
								var29 = var13.field896;
							}
						}

						if (var13.field882 == 0) {
							if (var13.field912) {
								KVJNUKIT.method344(var13.field915, var29, var12, var11, var13.field938);
							} else {
								KVJNUKIT.method345(var13.field915, var11, var13.field938, var29, var12);
							}
						} else if (var13.field912) {
							KVJNUKIT.method343(var11, var13.field915, var13.field938, var29, 256 - (var13.field882 & 0xFF), var12);
						} else {
							KVJNUKIT.method346(var12, 256 - (var13.field882 & 0xFF), var13.field915, var29, var13.field938, var11);
						}
					} else if (var13.field940 == 4) {
						NSKCCMMO var30 = var13.field887;
						String var31 = var13.field885;
						boolean var32 = false;
						if (field282 == var13.field925 || field482 == var13.field925 || field406 == var13.field925) {
							var32 = true;
						}

						int var33;
						if (method50(var13)) {
							var33 = var13.field880;
							if (var32 && var13.field927 != 0) {
								var33 = var13.field927;
							}

							if (var13.field902.length() > 0) {
								var31 = var13.field902;
							}
						} else {
							var33 = var13.field928;
							if (var32 && var13.field896 != 0) {
								var33 = var13.field896;
							}
						}

						if (var13.field941 == 6 && field110) {
							var31 = "Please wait...";
							var33 = var13.field928;
						}

						if (KVJNUKIT.field952 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1010 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method166(method101(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method166(method101(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method166(method101(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method166(method101(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method166(method101(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field943) {
								var30.method371(var33, var13.field915 / 2 + var11, var41, var34, var13.field914);
							} else {
								var30.method378(var41, var13.field914, var11, var34, var33);
							}

							var34 += var30.field1010;
						}
					} else if (var13.field940 == 5) {
						BFUTXOBU var42;
						if (method50(var13)) {
							var42 = var13.field888;
						} else {
							var42 = var13.field922;
						}

						if (var42 != null) {
							var42.method13(var12, var11);
						}
					} else if (var13.field940 == 6) {
						int var43 = JJAEHWOM.field853;
						int var44 = JJAEHWOM.field854;
						JJAEHWOM.field853 = var13.field915 / 2 + var11;
						JJAEHWOM.field854 = var13.field938 / 2 + var12;
						int var45 = JJAEHWOM.field857[var13.field936] * var13.field935 >> 16;
						int var46 = JJAEHWOM.field858[var13.field936] * var13.field935 >> 16;
						boolean var47 = method50(var13);
						int var48;
						if (var47) {
							var48 = var13.field891;
						} else {
							var48 = var13.field890;
						}

						ITSMSHJO var49;
						if (var48 == -1) {
							var49 = var13.method300(-1, var47, -1);
						} else {
							HZCWGKOF var50 = HZCWGKOF.field712[var48];
							var49 = var13.method300(var50.field714[var13.field926], var47, var50.field715[var13.field926]);
						}

						if (var49 != null) {
							var49.method258(0, var13.field937, 0, var13.field936, 0, var45, var46);
						}

						JJAEHWOM.field853 = var43;
						JJAEHWOM.field854 = var44;
					} else if (var13.field940 == 7) {
						NSKCCMMO var51 = var13.field887;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field938; var53++) {
							for (int var54 = 0; var54 < var13.field915; var54++) {
								if (var13.field886[var52] > 0) {
									WKEFMNQD var55 = WKEFMNQD.method437(var13.field886[var52] - 1);
									String var56 = var55.field1219;
									if (var55.field1213 || var13.field918[var52] != 1) {
										var56 = var56 + " x" + method168(var13.field918[var52]);
									}

									int var57 = (var13.field919 + 115) * var54 + var11;
									int var58 = (var13.field906 + 12) * var53 + var12;
									if (var13.field943) {
										var51.method371(var13.field928, var13.field915 / 2 + var57, var56, var58, var13.field914);
									} else {
										var51.method378(var56, var13.field914, var57, var58, var13.field928);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			KVJNUKIT.method341(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method88() {
		if (field337 > 1) {
			field337--;
		}

		if (field103 > 0) {
			field103--;
		}

		for (int var1 = 0; var1 < 5 && method129(); var1++) {
		}

		if (field307) {
			synchronized (field152.field1201) {
				if (!field148) {
					field152.field1202 = 0;
				} else if (field1035 != 0 || field152.field1202 >= 40) {
					field180.method467(11);
					field180.method468(0);
					int var3 = field180.field1335;
					int var4 = 0;
					for (int var5 = 0; var5 < field152.field1202 && var3 - field180.field1335 < 240; var5++) {
						var4++;
						int var6 = field152.field1200[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field152.field1204[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field152.field1200[var5] == -1 && field152.field1204[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field375 != var7 || field376 != var6) {
							int var9 = var7 - field375;
							field375 = var7;
							int var10 = var6 - field376;
							field376 = var6;

							if (field469 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field180.method469((field469 << 12) + (var9 << 6) + var10);
								field469 = 0;
							} else if (field469 < 8) {
								field180.method471((field469 << 19) + var8 + 0x800000);
								field469 = 0;
							} else {
								field180.method472((field469 << 19) + var8 - 0x40000000);
								field469 = 0;
							}
						} else if (field469 < 2047) {
							field469++;
						}
					}

					field180.method477(field180.field1335 - var3);

					if (var4 >= field152.field1202) {
						field152.field1202 = 0;
					} else {
						field152.field1202 -= var4;
						for (int var11 = 0; var11 < field152.field1202; var11++) {
							field152.field1204[var11] = field152.field1204[var4 + var11];
							field152.field1200[var11] = field152.field1200[var4 + var11];
						}
					}
				}
			}

			if (field1035 != 0) {
				long var12 = (field1038 - field138) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field138 = field1038;
				int var14 = field1037;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1036;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1035 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field180.method467(217);
				field180.method509((var17 << 19) + (var18 << 20) + var16);
			}

			if (field85 > 0) {
				field85--;
			}

			if (field1039[1] == 1 || field1039[2] == 1 || field1039[3] == 1 || field1039[4] == 1) {
				field86 = true;
			}

			if (field86 && field85 <= 0) {
				field85 = 20;
				field86 = false;
				field180.method467(61);
				field180.method502(field421);
				field180.method501(field422);
			}

			if (field1026 && !field96) {
				field96 = true;
				field180.method467(194);
				field180.method468(1);
			}

			if (!field1026 && field96) {
				field96 = false;
				field180.method467(194);
				field180.method468(0);
			}

			method47();
			method81();
			method49();
			field101++;
			if (field101 > 750) {
				method39();
			}

			method164();
			method111();
			method51();
			field433++;

			if (field189 != 0) {
				field188 += 20;
				if (field188 >= 400) {
					field189 = 0;
				}
			}

			if (field296 != 0) {
				field293++;
				if (field293 >= 15) {
					if (field296 == 2) {
						field438 = true;
					}

					if (field296 == 3) {
						field79 = true;
					}

					field296 = 0;
				}
			}

			if (field334 != 0) {
				field167++;

				if (field1029 > field335 + 5 || field1029 < field335 - 5 || field1030 > field336 + 5 || field1030 < field336 - 5) {
					field373 = true;
				}

				if (field1028 == 0) {
					if (field334 == 2) {
						field438 = true;
					}

					if (field334 == 3) {
						field79 = true;
					}

					field334 = 0;

					if (field373 && field167 >= 5) {
						field229 = -1;
						method110();

						if (field332 == field229 && field333 != field228) {
							KFCZNNDM var19 = KFCZNNDM.field939[field332];
							byte var20 = 0;
							if (field408 == 1 && var19.field909 == 206) {
								var20 = 1;
							}

							if (var19.field886[field228] <= 0) {
								var20 = 0;
							}

							if (var19.field895) {
								int var21 = field333;
								int var22 = field228;
								var19.field886[var22] = var19.field886[var21];
								var19.field918[var22] = var19.field918[var21];
								var19.field886[var21] = -1;
								var19.field918[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field333;
								int var24 = field228;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method295(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method295(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method295(field228, field333);
							}

							field180.method467(113);
							field180.method503(field333);
							field180.method494(var20);
							field180.method501(field228);
							field180.method503(field332);
						}
					} else if ((field280 == 1 || method170(field476 - 1)) && field476 > 2) {
						method90();
					} else if (field476 > 0) {
						method158(field476 - 1);
					}

					field293 = 10;
					field1035 = 0;
				}
			}

			if (ZCHENGKI.field1445 != -1) {
				int var25 = ZCHENGKI.field1445;
				int var26 = ZCHENGKI.field1446;
				boolean var27 = method45(var26, 0, 0, field146.field545[0], 0, var25, field146.field544[0], 0, true, 0, 0);
				ZCHENGKI.field1445 = -1;

				if (var27) {
					field186 = field1036;
					field187 = field1037;
					field189 = 1;
					field188 = 0;
				}
			}

			if (field1035 == 1 && field195 != null) {
				field195 = null;
				field79 = true;
				field1035 = 0;
			}

			method104();
			method55();
			method78();
			method70();

			if (field1028 == 1 || field1035 == 1) {
				field404++;
			}

			if (field261 == 2) {
				method85();
			}

			if (field261 == 2 && field325) {
				method124();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field343[var28]++;
			}

			method83();
			field1027++;
			if (field1027 > 4500) {
				field103 = 250;
				field1027 -= 500;
				field180.method467(162);
			}

			field169++;
			if (field169 > 500) {
				field169 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field299 += field300;
				}

				if ((var29 & 0x2) == 2) {
					field339 += field340;
				}

				if ((var29 & 0x4) == 4) {
					field234 += field235;
				}
			}

			if (field299 < -50) {
				field300 = 2;
			}

			if (field299 > 50) {
				field300 = -2;
			}

			if (field339 < -55) {
				field340 = 2;
			}

			if (field339 > 55) {
				field340 = -2;
			}

			if (field234 < -40) {
				field235 = 1;
			}

			if (field234 > 40) {
				field235 = -1;
			}

			field211++;
			if (field211 > 500) {
				field211 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field285 += field286;
				}

				if ((var30 & 0x2) == 2) {
					field108 += field109;
				}
			}

			if (field285 < -60) {
				field286 = 2;
			}

			if (field285 > 60) {
				field286 = -2;
			}

			if (field108 < -20) {
				field109 = 1;
			}

			if (field108 > 10) {
				field109 = -1;
			}

			field102++;
			if (field102 > 50) {
				field180.method467(126);
			}

			try {
				if (field145 != null && field180.field1335 > 0) {
					field145.method355(0, field180.field1335, field180.field1334);
					field180.field1335 = 0;
					field102 = 0;
				}
			} catch (IOException var32) {
				method39();
			} catch (Exception var33) {
				method121();
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method89(boolean arg0) {
		method59();
		field156.method394();
		field479.method533(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field442 == 0) {
			int var4 = var3 / 2 + 80;
			field443.method371(0x75A9A9, var2 / 2, field281.field1296, var4, true);
			int var5 = var3 / 2 - 20;
			field445.method371(0xFFFF00, var2 / 2, "Welcome to RuneScape", var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field480.method533(var7 - 20, var6 - 73);
			field445.method371(0xFFFFFF, var6, "New User", var7 + 5, true);
			int var8 = var2 / 2 + 80;
			field480.method533(var7 - 20, var8 - 73);
			field445.method371(0xFFFFFF, var8, "Existing User", var7 + 5, true);
		}

		if (field442 == 2) {
			int var9 = var3 / 2 - 40;
			if (field291.length() > 0) {
				field445.method371(0xFFFF00, var2 / 2, field291, var9 - 15, true);
				field445.method371(0xFFFF00, var2 / 2, field292, var9, true);
				var9 += 30;
			} else {
				field445.method371(0xFFFF00, var2 / 2, field292, var9 - 7, true);
				var9 += 30;
			}

			field445.method378("Username: " + field485 + (field328 == 0 & field287 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90, var9, 0xFFFFFF);
			var9 += 15;
			field445.method378("Password: " + FYSVECDN.method219(field486) + (field328 == 1 & field287 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88, var9, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field480.method533(var11 - 20, var10 - 73);
				field445.method371(0xFFFFFF, var10, "Login", var11 + 5, true);
				int var12 = var2 / 2 + 80;
				field480.method533(var11 - 20, var12 - 73);
				field445.method371(0xFFFFFF, var12, "Cancel", var11 + 5, true);
			}
		}

		if (field442 == 3) {
			field445.method371(0xFFFF00, var2 / 2, "Create a free account", var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			field445.method371(0xFFFFFF, var2 / 2, "To create a new account you need to", var13, true);
			var13 += 15;
			field445.method371(0xFFFFFF, var2 / 2, "go back to the main RuneScape webpage", var13, true);
			var13 += 15;
			field445.method371(0xFFFFFF, var2 / 2, "and choose the red 'create account'", var13, true);
			var13 += 15;
			field445.method371(0xFFFFFF, var2 / 2, "button at the top right of that page.", var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field480.method533(var15 - 20, var14 - 73);
			field445.method371(0xFFFFFF, var14, "Cancel", var15 + 5, true);
		}

		field156.method395(field1021, 171, 202);

		if (field212) {
			field212 = false;
			field154.method395(field1021, 0, 128);
			field155.method395(field1021, 371, 202);
			field159.method395(field1021, 265, 0);
			field160.method395(field1021, 265, 562);
			field161.method395(field1021, 171, 128);
			field162.method395(field1021, 171, 562);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method90() {
		int var1 = field445.method372("Choose Option");
		for (int var2 = 0; var2 < field476; var2++) {
			int var3 = field445.method372(field182[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field476 * 15 + 21;
		if (field1036 > 4 && field1037 > 4 && field1036 < 516 && field1037 < 338) {
			int var5 = field1036 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1037 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field475 = true;
			field347 = 0;
			field348 = var5;
			field349 = var6;
			field350 = var1;
			field351 = field476 * 15 + 22;
		}

		if (field1036 > 553 && field1037 > 205 && field1036 < 743 && field1037 < 466) {
			int var7 = field1036 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1037 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field475 = true;
			field347 = 1;
			field348 = var7;
			field349 = var8;
			field350 = var1;
			field351 = field476 * 15 + 22;
		}

		if (field1036 > 17 && field1037 > 357 && field1036 < 496 && field1037 < 453) {
			int var9 = field1036 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1037 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field475 = true;
			field347 = 2;
			field348 = var9;
			field349 = var10;
			field350 = var1;
			field351 = field476 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method91(long arg0) {
		if (arg0 != 0L) {
			if (field379 >= 100) {
				method155(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = FYSVECDN.method218(FYSVECDN.method215(arg0));
				for (int var4 = 0; var4 < field379; var4++) {
					if (field95[var4] == arg0) {
						method155(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field397; var5++) {
					if (field233[var5] == arg0) {
						method155(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field95[field379++] = arg0;
				field438 = true;
				field180.method467(92);
				field180.method474(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(ILXQPFGONL;I)V")
	public final void method92(XQPFGONL arg0, int arg1) {
		arg0.method488();
		int var3 = arg0.method489(1);
		if (var3 != 0) {
			int var4 = arg0.method489(2);
			if (var4 == 0) {
				field371[field370++] = field366;
			} else if (var4 == 1) {
				int var5 = arg0.method489(3);
				field146.method180(var5, false);
				int var6 = arg0.method489(1);
				if (var6 == 1) {
					field371[field370++] = field366;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method489(3);
				field146.method180(var7, true);
				int var8 = arg0.method489(3);
				field146.method180(var8, true);
				int var9 = arg0.method489(1);
				if (var9 == 1) {
					field371[field370++] = field366;
				}
			} else if (var4 == 3) {
				field137 = arg0.method489(2);
				int var10 = arg0.method489(7);
				int var11 = arg0.method489(1);
				int var12 = arg0.method489(7);
				int var13 = arg0.method489(1);
				if (var13 == 1) {
					field371[field370++] = field366;
				}

				field146.method183(var10, var12, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method93(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method94(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field358.method569(field137, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			DHQCHKXN var8 = DHQCHKXN.method194(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field598;
				var10 = var8.field567;
			} else {
				var9 = var8.field567;
				var10 = var8.field598;
			}

			int var11 = var8.field594;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method45(arg0, 2, var10, field146.field545[0], var11, arg2, field146.field544[0], 0, false, 0, var9);
		} else {
			method45(arg0, 2, 0, field146.field545[0], 0, arg2, field146.field544[0], var6 + 1, false, var7, 0);
		}

		field186 = field1036;
		field187 = field1037;
		field189 = 2;
		field188 = 0;
		return true;
	}

	@ObfuscatedName("client.E(I)I")
	public final int method95() {
		int var1 = 3;
		if (field305 < 310) {
			int var2 = field302 >> 7;
			int var3 = field304 >> 7;
			int var4 = field146.field514 >> 7;
			int var5 = field146.field515 >> 7;

			if ((field399[field137][var2][var3] & 0x4) != 0) {
				var1 = field137;
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

					if ((field399[field137][var2][var3] & 0x4) != 0) {
						var1 = field137;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field399[field137][var2][var3] & 0x4) != 0) {
							var1 = field137;
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

					if ((field399[field137][var2][var3] & 0x4) != 0) {
						var1 = field137;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field399[field137][var2][var3] & 0x4) != 0) {
							var1 = field137;
						}
					}
				}
			}
		}

		if ((field399[field137][field146.field514 >> 7][field146.field515 >> 7] & 0x4) != 0) {
			var1 = field137;
		}

		return var1;
	}

	@ObfuscatedName("client.F(I)I")
	public final int method96() {
		int var1 = method65(field304, field137, field302);
		if (var1 - field303 < 800 && (field399[field137][field302 >> 7][field304 >> 7] & 0x4) != 0) {
			return field137;
		}

		return 3;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method97() {
		field180.method467(106);

		if (field298 != -1) {
			field298 = -1;
			field438 = true;
			field110 = false;
			field338 = true;
		}

		if (field279 != -1) {
			field279 = -1;
			field79 = true;
			field110 = false;
		}

		field230 = -1;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method98(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field397; var2++) {
			if (arg0.equalsIgnoreCase(field377[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field146.field1187)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method99() {
		method127();

		if (field189 == 1) {
			field308[field188 / 100].method13(field187 - 8 - 4, field186 - 8 - 4);
		}

		if (field189 == 2) {
			field308[field188 / 100 + 4].method13(field187 - 8 - 4, field186 - 8 - 4);
			field432++;
			if (field432 > 120) {
				field432 = 0;
				field180.method467(15);
				field180.method471(0x5500C8);
			}
		}

		if (field163 != -1) {
			method162(field163, field433);
			method87(0, 0, 0, KFCZNNDM.field939[field163]);
		}

		if (field230 != -1) {
			method162(field230, field433);
			method87(0, 0, 0, KFCZNNDM.field939[field230]);
		}

		method100();

		if (!field475) {
			method110();
			method126();
		} else if (field347 == 0) {
			method62();
		}

		if (field416 == 1) {
			field361[1].method13(296, 472);
		}

		if (field272) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1017 < 15) {
				var3 = 0xFF0000;
			}

			field444.method369(var3, "Fps:" + field1017, var1, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field201) {
				int var7 = 0xFF0000;
			}

			field444.method369(0xFFFF00, "Mem:" + var5 + "k", var1, var2);
			var2 += 15;
		}

		if (field337 != 0) {
			int var8 = field337 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field444.method374(329, "System update in: " + var9 + ":0" + var8, 4, 0xFFFF00);
			} else {
				field444.method374(329, "System update in: " + var9 + ":" + var8, 4, 0xFFFF00);
			}

			field309++;
			if (field309 > 77) {
				field309 = 0;
				field180.method467(179);
				return;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method100() {
		field97 = 0;
		int var1 = (field146.field514 >> 7) + field104;
		int var2 = (field146.field515 >> 7) + field105;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field97 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field97 = 1;
		}

		if (field97 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field97 = 0;
		}
	}

	@ObfuscatedName("client.a(IBLKFCZNNDM;)I")
	public final int method101(int arg0, KFCZNNDM arg1) {
		if (arg1.field932 == null || arg0 >= arg1.field932.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field932[arg0];
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
					var8 = field439[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field130[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field310[var3[var5++]];
				}

				if (var7 == 4) {
					KFCZNNDM var10 = KFCZNNDM.field939[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < WKEFMNQD.field1247 && (!WKEFMNQD.method437(var11).field1217 || field200)) {
						for (int var12 = 0; var12 < var10.field886.length; var12++) {
							if (var11 + 1 == var10.field886[var12]) {
								var8 += var10.field918[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field327[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field289[field130[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field327[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field146.field1177;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < CJHWPMKB.field61; var13++) {
						if (CJHWPMKB.field63[var13]) {
							var8 += field130[var13];
						}
					}
				}

				if (var7 == 10) {
					KFCZNNDM var14 = KFCZNNDM.field939[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < WKEFMNQD.field1247 && (!WKEFMNQD.method437(var15).field1217 || field200)) {
						for (int var16 = 0; var16 < var14.field886.length; var16++) {
							if (var14.field886[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field470;
				}

				if (var7 == 12) {
					var8 = field259;
				}

				if (var7 == 13) {
					int var17 = field327[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					JHLQAAYP var20 = JHLQAAYP.field840[var19];
					int var21 = var20.field842;
					int var22 = var20.field843;
					int var23 = var20.field844;
					int var24 = field165[var23 - var22];
					var8 = field327[var21] >> var22 & var24;
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
					var8 = (field146.field514 >> 7) + field104;
				}

				if (var7 == 19) {
					var8 = (field146.field515 >> 7) + field105;
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

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method102(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method102(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method103() {
		field239 = 0;
		for (int var1 = -1; var1 < field460 + field368; var1++) {
			DGZJCXBC var2;
			if (var1 == -1) {
				var2 = field146;
			} else if (var1 < field368) {
				var2 = field367[field369[var1]];
			} else {
				var2 = field459[field461[var1 - field368]];
			}

			if (var2 != null && var2.method1()) {
				if (var2 instanceof AHIOLHWV) {
					FWGUGZKU var3 = ((AHIOLHWV) var2).field1;
					if (var3.field675 != null) {
						var3 = var3.method208();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field368) {
					FWGUGZKU var7 = ((AHIOLHWV) var2).field1;
					if (var7.field680 >= 0 && var7.field680 < field361.length) {
						method133(var2, var2.field530 + 15);

						if (field231 > -1) {
							field361[var7.field680].method13(field232 - 30, field231 - 12);
						}
					}

					if (field126 == 1 && field461[var1 - field368] == field206 && field287 % 20 < 10) {
						method133(var2, var2.field530 + 15);

						if (field231 > -1) {
							field361[2].method13(field232 - 28, field231 - 12);
						}
					}
				} else {
					int var4 = 30;
					TKIWGAGO var5 = (TKIWGAGO) var2;
					if (var5.field1178 != 0) {
						method133(var2, var2.field530 + 15);

						if (field231 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1178 & 1 << var6) != 0) {
									field361[var6].method13(field232 - var4, field231 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field126 == 10 && field369[var1] == field284) {
						method133(var2, var2.field530 + 15);

						if (field231 > -1) {
							field361[7].method13(field232 - var4, field231 - 12);
						}
					}
				}

				if (var2.field511 != null && (var1 >= field368 || field477 == 0 || field477 == 3 || field477 == 1 && method98(((TKIWGAGO) var2).field1187))) {
					method133(var2, var2.field530);

					if (field231 > -1 && field239 < field240) {
						field244[field239] = field445.method373(var2.field511) / 2;
						field243[field239] = field445.field1010;
						field241[field239] = field231;
						field242[field239] = field232;
						field245[field239] = var2.field546;
						field246[field239] = var2.field554;
						field247[field239] = var2.field528;
						field248[field239++] = var2.field511;

						if (field297 == 0 && var2.field554 >= 1 && var2.field554 <= 3) {
							field243[field239] += 10;
							field242[field239] += 5;
						}

						if (field297 == 0 && var2.field554 == 4) {
							field244[field239] = 60;
						}

						if (field297 == 0 && var2.field554 == 5) {
							field243[field239] += 5;
						}
					}
				}

				if (var2.field508 > field287) {
					method133(var2, var2.field530 + 15);

					if (field231 > -1) {
						int var8 = var2.field509 * 30 / var2.field510;
						if (var8 > 30) {
							var8 = 30;
						}

						KVJNUKIT.method344(var8, 0xFF00, field232 - 3, field231 - 15, 5);
						KVJNUKIT.method344(30 - var8, 0xFF0000, field232 - 3, field231 - 15 + var8, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field527[var9] > field287) {
						method133(var2, var2.field530 / 2);

						if (field231 > -1) {
							if (var9 == 1) {
								field232 -= 20;
							}

							if (var9 == 2) {
								field231 -= 15;
								field232 -= 10;
							}

							if (var9 == 3) {
								field231 += 15;
								field232 -= 10;
							}

							field129[var2.field526[var9]].method13(field232 - 12, field231 - 12);
							field443.method370(String.valueOf(var2.field525[var9]), field231, 0, field232 + 4);
							field443.method370(String.valueOf(var2.field525[var9]), field231 - 1, 0xFFFFFF, field232 + 3);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field239; var10++) {
			int var11 = field241[var10];
			int var12 = field242[var10];
			int var13 = field244[var10];
			int var14 = field243[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field242[var16] - field243[var16] && var12 - var14 < field242[var16] + 2 && var11 - var13 < field244[var16] + field241[var16] && var11 + var13 > field241[var16] - field244[var16] && field242[var16] - field243[var16] < var12) {
						var12 = field242[var16] - field243[var16];
						var15 = true;
					}
				}
			}

			field231 = field241[var10];
			field232 = field242[var10] = var12;
			String var17 = field248[var10];
			if (field297 == 0) {
				int var18 = 0xFFFF00;
				if (field245[var10] < 6) {
					var18 = field238[field245[var10]];
				}

				if (field245[var10] == 6) {
					var18 = field464 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field245[var10] == 7) {
					var18 = field464 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field245[var10] == 8) {
					var18 = field464 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field245[var10] == 9) {
					int var19 = 150 - field247[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field245[var10] == 10) {
					int var20 = 150 - field247[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field245[var10] == 11) {
					int var21 = 150 - field247[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field246[var10] == 0) {
					field445.method370(var17, field231, 0, field232 + 1);
					field445.method370(var17, field231, var18, field232);
				}

				if (field246[var10] == 1) {
					field445.method375(var17, field231, field464, 0, field232 + 1);
					field445.method375(var17, field231, field464, var18, field232);
				}

				if (field246[var10] == 2) {
					field445.method376(var17, field464, 0, field231, field232 + 1);
					field445.method376(var17, field464, var18, field231, field232);
				}

				if (field246[var10] == 3) {
					field445.method377(var17, field464, 150 - field247[var10], field231, 0, field232 + 1);
					field445.method377(var17, field464, 150 - field247[var10], field231, var18, field232);
				}

				if (field246[var10] == 4) {
					int var22 = field445.method373(var17);
					int var23 = (150 - field247[var10]) * (var22 + 100) / 150;
					KVJNUKIT.method341(field231 - 50, 0, field231 + 50, 334);
					field445.method374(field232 + 1, var17, field231 + 50 - var23, 0);
					field445.method374(field232, var17, field231 + 50 - var23, var18);
					KVJNUKIT.method340();
				}

				if (field246[var10] == 5) {
					int var24 = 150 - field247[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					KVJNUKIT.method341(0, field232 - field445.field1010 - 1, 512, field232 + 5);
					field445.method370(var17, field231, 0, field232 + var25 + 1);
					field445.method370(var17, field231, var18, field232 + var25);
					KVJNUKIT.method340();
				}
			} else {
				field445.method370(var17, field231, 0, field232 + 1);
				field445.method370(var17, field231, 0xFFFF00, field232);
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 313);

			if (arg0.length == 5) {
				field198 = Integer.parseInt(arg0[0]);
				field199 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method71();
				} else if (arg0[2].equals("highmem")) {
					method75();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field200 = false;
				} else if (arg0[3].equals("members")) {
					field200 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method385(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method104() {
		if (field334 == 0) {
			int var1 = field1035;
			if (field218 == 1 && field1036 >= 516 && field1037 >= 160 && field1036 <= 765 && field1037 <= 205) {
				var1 = 0;
			}

			if (field475) {
				if (var1 != 1) {
					int var2 = field1029;
					int var3 = field1030;
					if (field347 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field347 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field347 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field348 - 10 || var2 > field350 + field348 + 10 || var3 < field349 - 10 || var3 > field351 + field349 + 10) {
						field475 = false;

						if (field347 == 1) {
							field438 = true;
						}

						if (field347 == 2) {
							field79 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field348;
					int var5 = field349;
					int var6 = field350;
					int var7 = field1036;
					int var8 = field1037;
					if (field347 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field347 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field347 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field476; var10++) {
						int var11 = (field476 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method158(var9);
					}

					field475 = false;

					if (field347 == 1) {
						field438 = true;
					}

					if (field347 == 2) {
						field79 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field476 > 0) {
					int var12 = field354[field476 - 1];
					if (var12 == 97 || var12 == 657 || var12 == 298 || var12 == 601 || var12 == 855 || var12 == 276 || var12 == 428 || var12 == 921 || var12 == 652 || var12 == 996 || var12 == 237 || var12 == 1562) {
						int var13 = field352[field476 - 1];
						int var14 = field353[field476 - 1];
						KFCZNNDM var15 = KFCZNNDM.field939[var14];
						if (var15.field897 || var15.field895) {
							field373 = false;
							field167 = 0;
							field332 = var14;
							field333 = var13;
							field334 = 2;
							field335 = field1036;
							field336 = field1037;

							if (KFCZNNDM.field939[var14].field884 == field230) {
								field334 = 1;
							}

							if (KFCZNNDM.field939[var14].field884 == field279) {
								field334 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field280 == 1 || method170(field476 - 1)) && field476 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field476 > 0) {
					method158(field476 - 1);
				}

				if (var1 != 2 || field476 <= 0) {
					return;
				}

				method90();
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method105() {
		if (field147 || field318 || field288) {
			method148();
		} else {
			field452++;

			if (field307) {
				method118();
			} else {
				method89(false);
			}

			field404 = 0;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method106() {
		field479 = new YPWLUGYN(field374, "titlebox", 0);
		field480 = new YPWLUGYN(field374, "titlebutton", 0);
		field283 = new YPWLUGYN[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field283[var2] = new YPWLUGYN(field374, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field283[var3] = new YPWLUGYN(field374, "runes", (var3 & 0x3) + 12);
			}
		}

		field323 = new BFUTXOBU(128, 265);
		field324 = new BFUTXOBU(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field323.field29[var4] = field157.field1102[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field324.field29[var5] = field158.field1102[var5];
		}

		field177 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field177[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field177[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field177[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field177[var9 + 192] = 0xFFFFFF;
		}

		field178 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field178[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field178[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field178[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field178[var13 + 192] = 0xFFFFFF;
		}

		field179 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field179[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field179[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field179[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field179[var17 + 192] = 0xFFFFFF;
		}

		field176 = new int[256];
		field216 = new int[32768];
		field217 = new int[32768];
		method130(null);
		field71 = new int[32768];
		field72 = new int[32768];
		method163(10, "Connecting to fileserver");

		if (!field405) {
			field435 = true;
			field405 = true;
			method102(this, 2);
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method107() {
		short var1 = 256;

		if (field131 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field131 > 768) {
					field176[var2] = method93(1024 - field131, field177[var2], field178[var2]);
				} else if (field131 > 256) {
					field176[var2] = field178[var2];
				} else {
					field176[var2] = method93(256 - field131, field178[var2], field177[var2]);
				}
			}
		} else if (field132 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field132 > 768) {
					field176[var3] = method93(1024 - field132, field177[var3], field179[var3]);
				} else if (field132 > 256) {
					field176[var3] = field179[var3];
				} else {
					field176[var3] = method93(256 - field132, field179[var3], field177[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field176[var4] = field177[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field157.field1102[var5] = field323.field29[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field478[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field71[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field176[var12];
					int var15 = field157.field1102[var7];
					field157.field1102[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field157.method395(field1021, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field158.field1102[var16] = field324.field29[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field478[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field71[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field176[var23];
					int var26 = field158.field1102[var18];
					field158.field1102[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field158.method395(field1021, 0, 637);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method108() {
		field464++;
		method82(true);
		method145(true);
		method82(false);
		method145(false);
		method150();
		method144();

		if (!field325) {
			int var1 = field421;
			if (field483 / 256 > var1) {
				var1 = field483 / 256;
			}

			if (field64[4] && field403[4] + 128 > var1) {
				var1 = field403[4] + 128;
			}

			int var2 = field422 + field234 & 0x7FF;
			method140(var2, method65(field146.field515, field137, field146.field514) - 50, field84, var1 * 3 + 600, field83, var1);
		}

		int var3;
		if (field325) {
			var3 = method96();
		} else {
			var3 = method95();
		}

		int var4 = field302;
		int var5 = field303;
		int var6 = field304;
		int var7 = field305;
		int var8 = field306;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field64[var9]) {
				int var10 = (int) (Math.random() * (field311[var9] * 2 + 1) + Math.sin(field209[var9] / 100.0D * field343[var9]) * field403[var9] - field311[var9]);
				if (var9 == 0) {
					field302 += var10;
				}

				if (var9 == 1) {
					field303 += var10;
				}

				if (var9 == 2) {
					field304 += var10;
				}

				if (var9 == 3) {
					field306 = field306 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field305 += var10;
					if (field305 < 128) {
						field305 = 128;
					}

					if (field305 > 383) {
						field305 = 383;
					}
				}
			}
		}

		int var11 = JJAEHWOM.field868;
		ITSMSHJO.field811 = true;
		ITSMSHJO.field814 = 0;
		ITSMSHJO.field812 = field1029 - 4;
		ITSMSHJO.field813 = field1030 - 4;
		KVJNUKIT.method342();
		field358.method578(field305, field302, field303, field304, var3, field306);
		field358.method553();
		method103();
		method63();
		method152(var11);
		method99();
		field455.method395(field1021, 4, 4);
		field302 = var4;
		field303 = var5;
		field304 = var6;
		field305 = var7;
		field306 = var8;
	}

	@ObfuscatedName("client.b(IILXQPFGONL;)V")
	public final void method109(int arg0, XQPFGONL arg1) {
		field471 = 0;
		field370 = 0;
		method92(arg1, arg0);
		method54(arg0, arg1);
		method167(arg0, arg1);
		method139(arg1, arg0);

		for (int var3 = 0; var3 < field471; var3++) {
			int var4 = field472[var3];
			if (field287 != field367[var4].field555) {
				field367[var4] = null;
			}
		}

		if (arg1.field1335 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1335 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field368; var5++) {
			if (field367[field369[var5]] == null) {
				signlink.reporterror(field485 + " null entry in pl list - pos:" + var5 + " size:" + field368);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method110() {
		if (field334 == 0) {
			field182[0] = "Cancel";
			field354[0] = 1296;
			field476 = 1;
			method157();
			field170 = 0;

			if (field1029 > 4 && field1030 > 4 && field1029 < 516 && field1030 < 338) {
				if (field230 == -1) {
					method84();
				} else {
					method77(4, 0, field1029, field1030, KFCZNNDM.field939[field230], 4);
				}
			}

			if (field406 != field170) {
				field406 = field170;
			}

			field170 = 0;

			if (field1029 > 553 && field1030 > 205 && field1029 < 743 && field1030 < 466) {
				if (field298 != -1) {
					method77(205, 0, field1029, field1030, KFCZNNDM.field939[field298], 553);
				} else if (field276[field94] != -1) {
					method77(205, 0, field1029, field1030, KFCZNNDM.field939[field276[field94]], 553);
				}
			}

			if (field482 != field170) {
				field438 = true;
				field482 = field170;
			}

			field170 = 0;

			if (field1029 > 17 && field1030 > 357 && field1029 < 496 && field1030 < 453) {
				if (field279 != -1) {
					method77(357, 0, field1029, field1030, KFCZNNDM.field939[field279], 17);
				} else if (field1030 < 434 && field1029 < 426) {
					method46(field1030 - 357, field1029 - 17);
				}
			}

			if (field279 != -1 && field282 != field170) {
				field79 = true;
				field282 = field170;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field476 - 1; var2++) {
					if (field354[var2] < 1000 && field354[var2 + 1] > 1000) {
						String var3 = field182[var2];
						field182[var2] = field182[var2 + 1];
						field182[var2 + 1] = var3;
						int var4 = field354[var2];
						field354[var2] = field354[var2 + 1];
						field354[var2 + 1] = var4;
						int var5 = field352[var2];
						field352[var2] = field352[var2 + 1];
						field352[var2 + 1] = var5;
						int var6 = field353[var2];
						field353[var2] = field353[var2 + 1];
						field353[var2 + 1] = var6;
						int var7 = field355[var2];
						field355[var2] = field355[var2 + 1];
						field355[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method111() {
		for (int var1 = 0; var1 < field460; var1++) {
			int var2 = field461[var1];
			AHIOLHWV var3 = field459[var2];
			if (var3 != null) {
				method112(var3.field1.field681, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ZILDGZJCXBC;)V")
	public final void method112(int arg0, DGZJCXBC arg1) {
		if (arg1.field514 < 128 || arg1.field515 < 128 || arg1.field514 >= 13184 || arg1.field515 >= 13184) {
			arg1.field532 = -1;
			arg1.field557 = -1;
			arg1.field551 = 0;
			arg1.field552 = 0;
			arg1.field514 = arg1.field544[0] * 128 + arg1.field540 * 64;
			arg1.field515 = arg1.field545[0] * 128 + arg1.field540 * 64;
			arg1.method182();
		}

		if (field146 == arg1 && (arg1.field514 < 1536 || arg1.field515 < 1536 || arg1.field514 >= 11776 || arg1.field515 >= 11776)) {
			arg1.field532 = -1;
			arg1.field557 = -1;
			arg1.field551 = 0;
			arg1.field552 = 0;
			arg1.field514 = arg1.field544[0] * 128 + arg1.field540 * 64;
			arg1.field515 = arg1.field545[0] * 128 + arg1.field540 * 64;
			arg1.method182();
		}

		if (arg1.field551 > field287) {
			method113(arg1);
		} else if (arg1.field552 >= field287) {
			method114(arg1);
		} else {
			method115(arg1);
		}

		method116(arg1);
		method117(arg1);
	}

	@ObfuscatedName("client.a(LDGZJCXBC;B)V")
	public final void method113(DGZJCXBC arg0) {
		int var2 = arg0.field551 - field287;
		int var3 = arg0.field547 * 128 + arg0.field540 * 64;
		int var4 = arg0.field549 * 128 + arg0.field540 * 64;
		arg0.field514 += (var3 - arg0.field514) / var2;
		arg0.field515 += (var4 - arg0.field515) / var2;
		arg0.field556 = 0;

		if (arg0.field553 == 0) {
			arg0.field529 = 1024;
		}

		if (arg0.field553 == 1) {
			arg0.field529 = 1536;
		}

		if (arg0.field553 == 2) {
			arg0.field529 = 0;
		}

		if (arg0.field553 == 3) {
			arg0.field529 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLDGZJCXBC;)V")
	public final void method114(DGZJCXBC arg0) {
		if (field287 == arg0.field552 || arg0.field532 == -1 || arg0.field535 != 0 || arg0.field534 + 1 > HZCWGKOF.field712[arg0.field532].method227(arg0.field533)) {
			int var2 = arg0.field552 - arg0.field551;
			int var3 = field287 - arg0.field551;
			int var4 = arg0.field547 * 128 + arg0.field540 * 64;
			int var5 = arg0.field549 * 128 + arg0.field540 * 64;
			int var6 = arg0.field548 * 128 + arg0.field540 * 64;
			int var7 = arg0.field550 * 128 + arg0.field540 * 64;
			arg0.field514 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field515 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field556 = 0;

		if (arg0.field553 == 0) {
			arg0.field529 = 1024;
		}

		if (arg0.field553 == 1) {
			arg0.field529 = 1536;
		}

		if (arg0.field553 == 2) {
			arg0.field529 = 0;
		}

		if (arg0.field553 == 3) {
			arg0.field529 = 512;
		}

		arg0.field516 = arg0.field529;
	}

	@ObfuscatedName("client.a(LDGZJCXBC;I)V")
	public final void method115(DGZJCXBC arg0) {
		arg0.field537 = arg0.field541;
		if (arg0.field543 == 0) {
			arg0.field556 = 0;
		} else {
			if (arg0.field532 != -1 && arg0.field535 == 0) {
				HZCWGKOF var2 = HZCWGKOF.field712[arg0.field532];
				if (arg0.field512 > 0 && var2.field724 == 0) {
					arg0.field556++;
					return;
				}

				if (arg0.field512 <= 0 && var2.field725 == 0) {
					arg0.field556++;
					return;
				}
			}

			int var3 = arg0.field514;
			int var4 = arg0.field515;
			int var5 = arg0.field544[arg0.field543 - 1] * 128 + arg0.field540 * 64;
			int var6 = arg0.field545[arg0.field543 - 1] * 128 + arg0.field540 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field529 = 1280;
					} else if (var4 > var6) {
						arg0.field529 = 1792;
					} else {
						arg0.field529 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field529 = 768;
					} else if (var4 > var6) {
						arg0.field529 = 256;
					} else {
						arg0.field529 = 512;
					}
				} else if (var4 < var6) {
					arg0.field529 = 1024;
				} else {
					arg0.field529 = 0;
				}

				int var7 = arg0.field529 - arg0.field516 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field520;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field519;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field522;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field521;
				}

				if (var8 == -1) {
					var8 = arg0.field519;
				}

				arg0.field537 = var8;
				int var9 = 4;
				if (arg0.field529 != arg0.field516 && arg0.field518 == -1 && arg0.field562 != 0) {
					var9 = 2;
				}

				if (arg0.field543 > 2) {
					var9 = 6;
				}

				if (arg0.field543 > 3) {
					var9 = 8;
				}

				if (arg0.field556 > 0 && arg0.field543 > 1) {
					var9 = 8;
					arg0.field556--;
				}

				if (arg0.field517[arg0.field543 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field537 == arg0.field519 && arg0.field531 != -1) {
					arg0.field537 = arg0.field531;
				}

				if (var3 < var5) {
					arg0.field514 += var9;
					if (arg0.field514 > var5) {
						arg0.field514 = var5;
					}
				} else if (var3 > var5) {
					arg0.field514 -= var9;
					if (arg0.field514 < var5) {
						arg0.field514 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field515 += var9;
					if (arg0.field515 > var6) {
						arg0.field515 = var6;
					}
				} else if (var4 > var6) {
					arg0.field515 -= var9;
					if (arg0.field515 < var6) {
						arg0.field515 = var6;
					}
				}

				if (arg0.field514 == var5 && arg0.field515 == var6) {
					arg0.field543--;

					if (arg0.field512 > 0) {
						arg0.field512--;
						return;
					}
				}
			} else {
				arg0.field514 = var5;
				arg0.field515 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILDGZJCXBC;)V")
	public final void method116(DGZJCXBC arg0) {
		if (arg0.field562 != 0) {
			if (arg0.field518 != -1 && arg0.field518 < 32768) {
				AHIOLHWV var2 = field459[arg0.field518];
				if (var2 != null) {
					int var3 = arg0.field514 - var2.field514;
					int var4 = arg0.field515 - var2.field515;
					if (var3 != 0 || var4 != 0) {
						arg0.field529 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field518 >= 32768) {
				int var5 = arg0.field518 - 32768;
				if (field260 == var5) {
					var5 = field366;
				}

				TKIWGAGO var6 = field367[var5];
				if (var6 != null) {
					int var7 = arg0.field514 - var6.field514;
					int var8 = arg0.field515 - var6.field515;
					if (var7 != 0 || var8 != 0) {
						arg0.field529 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field523 != 0 || arg0.field524 != 0) && (arg0.field543 == 0 || arg0.field556 > 0)) {
				int var9 = arg0.field514 - (arg0.field523 - field104 - field104) * 64;
				int var10 = arg0.field515 - (arg0.field524 - field105 - field105) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field529 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field523 = 0;
				arg0.field524 = 0;
			}

			int var11 = arg0.field529 - arg0.field516 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field562 || var11 > 2048 - arg0.field562) {
					arg0.field516 = arg0.field529;
				} else if (var11 > 1024) {
					arg0.field516 -= arg0.field562;
				} else {
					arg0.field516 += arg0.field562;
				}

				arg0.field516 &= 0x7FF;
				if (arg0.field541 == arg0.field537 && arg0.field529 != arg0.field516) {
					if (arg0.field542 != -1) {
						arg0.field537 = arg0.field542;
						return;
					}

					arg0.field537 = arg0.field519;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILDGZJCXBC;)V")
	public final void method117(DGZJCXBC arg0) {
		arg0.field513 = false;

		if (arg0.field537 != -1) {
			HZCWGKOF var2 = HZCWGKOF.field712[arg0.field537];
			arg0.field539++;
			if (arg0.field538 < var2.field713 && arg0.field539 > var2.method227(arg0.field538)) {
				arg0.field539 = 0;
				arg0.field538++;
			}

			if (arg0.field538 >= var2.field713) {
				arg0.field539 = 0;
				arg0.field538 = 0;
			}
		}

		if (arg0.field557 != -1 && field287 >= arg0.field560) {
			if (arg0.field558 < 0) {
				arg0.field558 = 0;
			}

			HZCWGKOF var3 = FPSNPMMW.field641[arg0.field557].field645;
			arg0.field559++;
			while (arg0.field558 < var3.field713 && arg0.field559 > var3.method227(arg0.field558)) {
				arg0.field559 -= var3.method227(arg0.field558);
				arg0.field558++;
			}

			if (arg0.field558 >= var3.field713 && (arg0.field558 < 0 || arg0.field558 >= var3.field713)) {
				arg0.field557 = -1;
			}
		}

		if (arg0.field532 != -1 && arg0.field535 <= 1) {
			HZCWGKOF var4 = HZCWGKOF.field712[arg0.field532];
			if (var4.field724 == 1 && arg0.field512 > 0 && arg0.field551 <= field287 && arg0.field552 < field287) {
				arg0.field535 = 1;
				return;
			}
		}

		if (arg0.field532 != -1 && arg0.field535 == 0) {
			HZCWGKOF var5 = HZCWGKOF.field712[arg0.field532];
			arg0.field534++;
			while (arg0.field533 < var5.field713 && arg0.field534 > var5.method227(arg0.field533)) {
				arg0.field534 -= var5.method227(arg0.field533);
				arg0.field533++;
			}

			if (arg0.field533 >= var5.field713) {
				arg0.field533 -= var5.field717;
				arg0.field536++;
				if (arg0.field536 >= var5.field723) {
					arg0.field532 = -1;
				}

				if (arg0.field533 < 0 || arg0.field533 >= var5.field713) {
					arg0.field532 = -1;
				}
			}

			arg0.field513 = var5.field719;
		}

		if (arg0.field535 > 0) {
			arg0.field535--;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method118() {
		if (field212) {
			field212 = false;
			field382.method395(field1021, 4, 0);
			field383.method395(field1021, 357, 0);
			field384.method395(field1021, 4, 722);
			field385.method395(field1021, 205, 743);
			field386.method395(field1021, 0, 0);
			field387.method395(field1021, 4, 516);
			field388.method395(field1021, 205, 516);
			field389.method395(field1021, 357, 496);
			field390.method395(field1021, 338, 0);
			field438 = true;
			field79 = true;
			field338 = true;
			field268 = true;

			if (field261 != 2) {
				field455.method395(field1021, 4, 4);
				field454.method395(field1021, 4, 550);
			}

			field330++;
			if (field330 > 1910) {
				field330 = 0;
				field180.method467(60);
				field180.method468(0);
				int var1 = field180.field1335;

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method469(23900);
				}

				field180.method469(61843);
				field180.method468((int) (Math.random() * 256.0D));
				field180.method469(18658);
				field180.method468((int) (Math.random() * 256.0D));
				field180.method469(45247);
				field180.method468(238);
				field180.method468(56);

				if ((int) (Math.random() * 2.0D) == 0) {
					field180.method469(35837);
				}

				field180.method469(52115);
				field180.method477(field180.field1335 - var1);
			}
		}

		if (field261 == 2) {
			method108();
		}

		if (field475 && field347 == 1) {
			field438 = true;
		}

		if (field298 != -1) {
			boolean var2 = method162(field298, field433);
			if (var2) {
				field438 = true;
			}
		}

		if (field296 == 2) {
			field438 = true;
		}

		if (field334 == 2) {
			field438 = true;
		}

		if (field438) {
			method169();
			field438 = false;
		}

		if (field279 == -1) {
			field425.field931 = field164 - field73 - 77;

			if (field1029 > 448 && field1029 < 560 && field1030 > 332) {
				method74(field425, 77, field164, field1029 - 17, 463, false, 0, field1030 - 357);
			}

			int var3 = field164 - field425.field931 - 77;
			if (var3 < 0) {
				var3 = 0;
			}

			if (var3 > field164 - 77) {
				var3 = field164 - 77;
			}

			if (field73 != var3) {
				field73 = var3;
				field79 = true;
			}
		}

		if (field279 != -1) {
			boolean var4 = method162(field279, field433);
			if (var4) {
				field79 = true;
			}
		}

		if (field296 == 3) {
			field79 = true;
		}

		if (field334 == 3) {
			field79 = true;
		}

		if (field195 != null) {
			field79 = true;
		}

		if (field475 && field347 == 2) {
			field79 = true;
		}

		if (field79) {
			method153();
			field79 = false;
		}

		if (field261 == 2) {
			method161();
			field454.method395(field1021, 4, 550);
		}

		if (field168 != -1) {
			field338 = true;
		}

		if (field338) {
			if (field168 != -1 && field94 == field168) {
				field168 = -1;
				field180.method467(3);
				field180.method468(field94);
			}

			field338 = false;
			field394.method394();
			field70.method533(0, 0);

			if (field298 == -1) {
				if (field276[field94] != -1) {
					if (field94 == 0) {
						field410.method533(10, 22);
					}

					if (field94 == 1) {
						field411.method533(8, 54);
					}

					if (field94 == 2) {
						field411.method533(8, 82);
					}

					if (field94 == 3) {
						field412.method533(8, 110);
					}

					if (field94 == 4) {
						field414.method533(8, 153);
					}

					if (field94 == 5) {
						field414.method533(8, 181);
					}

					if (field94 == 6) {
						field413.method533(9, 209);
					}
				}

				if (field276[0] != -1 && (field168 != 0 || field287 % 20 < 10)) {
					field317[0].method533(13, 29);
				}

				if (field276[1] != -1 && (field168 != 1 || field287 % 20 < 10)) {
					field317[1].method533(11, 53);
				}

				if (field276[2] != -1 && (field168 != 2 || field287 % 20 < 10)) {
					field317[2].method533(11, 82);
				}

				if (field276[3] != -1 && (field168 != 3 || field287 % 20 < 10)) {
					field317[3].method533(12, 115);
				}

				if (field276[4] != -1 && (field168 != 4 || field287 % 20 < 10)) {
					field317[4].method533(13, 153);
				}

				if (field276[5] != -1 && (field168 != 5 || field287 % 20 < 10)) {
					field317[5].method533(11, 180);
				}

				if (field276[6] != -1 && (field168 != 6 || field287 % 20 < 10)) {
					field317[6].method533(13, 208);
				}
			}

			field394.method395(field1021, 160, 516);
			field393.method394();
			field69.method533(0, 0);

			if (field298 == -1) {
				if (field276[field94] != -1) {
					if (field94 == 7) {
						field262.method533(0, 42);
					}

					if (field94 == 8) {
						field263.method533(0, 74);
					}

					if (field94 == 9) {
						field263.method533(0, 102);
					}

					if (field94 == 10) {
						field264.method533(1, 130);
					}

					if (field94 == 11) {
						field266.method533(0, 173);
					}

					if (field94 == 12) {
						field266.method533(0, 201);
					}

					if (field94 == 13) {
						field265.method533(0, 229);
					}
				}

				if (field276[8] != -1 && (field168 != 8 || field287 % 20 < 10)) {
					field317[7].method533(2, 74);
				}

				if (field276[9] != -1 && (field168 != 9 || field287 % 20 < 10)) {
					field317[8].method533(3, 102);
				}

				if (field276[10] != -1 && (field168 != 10 || field287 % 20 < 10)) {
					field317[9].method533(4, 137);
				}

				if (field276[11] != -1 && (field168 != 11 || field287 % 20 < 10)) {
					field317[10].method533(2, 174);
				}

				if (field276[12] != -1 && (field168 != 12 || field287 % 20 < 10)) {
					field317[11].method533(2, 201);
				}

				if (field276[13] != -1 && (field168 != 13 || field287 % 20 < 10)) {
					field317[12].method533(2, 226);
				}
			}

			field393.method395(field1021, 466, 496);
			field455.method394();
		}

		if (field268) {
			field268 = false;
			field392.method394();
			field68.method533(0, 0);
			field444.method371(0xFFFFFF, 55, "Public chat", 28, true);

			if (field477 == 0) {
				field444.method371(0xFF00, 55, "On", 41, true);
			}

			if (field477 == 1) {
				field444.method371(0xFFFF00, 55, "Friends", 41, true);
			}

			if (field477 == 2) {
				field444.method371(0xFF0000, 55, "Off", 41, true);
			}

			if (field477 == 3) {
				field444.method371(0xFFFF, 55, "Hide", 41, true);
			}

			field444.method371(0xFFFFFF, 184, "Private chat", 28, true);

			if (field360 == 0) {
				field444.method371(0xFF00, 184, "On", 41, true);
			}

			if (field360 == 1) {
				field444.method371(0xFFFF00, 184, "Friends", 41, true);
			}

			if (field360 == 2) {
				field444.method371(0xFF0000, 184, "Off", 41, true);
			}

			field444.method371(0xFFFFFF, 324, "Trade/compete", 28, true);

			if (field135 == 0) {
				field444.method371(0xFF00, 324, "On", 41, true);
			}

			if (field135 == 1) {
				field444.method371(0xFFFF00, 324, "Friends", 41, true);
			}

			if (field135 == 2) {
				field444.method371(0xFF0000, 324, "Off", 41, true);
			}

			field444.method371(0xFFFFFF, 458, "Report abuse", 33, true);
			field392.method395(field1021, 453, 0);
			field455.method394();
		}

		field433 = 0;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method119() {
		if (field456 == null) {
			method160();
			field1022 = null;
			field154 = null;
			field155 = null;
			field156 = null;
			field157 = null;
			field158 = null;
			field159 = null;
			field160 = null;
			field161 = null;
			field162 = null;
			field456 = new SBWJLPSR(96, 479, method73());
			field454 = new SBWJLPSR(156, 172, method73());
			KVJNUKIT.method342();
			field450.method533(0, 0);
			field453 = new SBWJLPSR(261, 190, method73());
			field455 = new SBWJLPSR(334, 512, method73());
			KVJNUKIT.method342();
			field392 = new SBWJLPSR(50, 496, method73());
			field393 = new SBWJLPSR(37, 269, method73());
			field394 = new SBWJLPSR(45, 249, method73());
			field212 = true;
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;ILjava/lang/String;II)LXMRRKSSB;")
	public final XMRRKSSB method120(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field173[0] != null) {
				var6 = field173[0].method229(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field473.reset();
			field473.update(var6);
			int var8 = (int) field473.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new XMRRKSSB(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method163(arg1, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method159(arg0 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				XQPFGONL var16 = new XQPFGONL(var15);
				var16.field1335 = 3;
				int var17 = var16.method482() + 6;
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
						method163(arg1, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field173[0] != null) {
						field173[0].method230(arg4, var6, var6.length);
					}
				} catch (Exception var28) {
					field173[0] = null;
				}

				if (var6 != null) {
					field473.reset();
					field473.update(var6);
					int var23 = (int) field473.getValue();
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
						method163(arg1, "Game updated - please reload page");
						var25 = 10;
					} else {
						method163(arg1, var11 + " - Retrying in " + var25);
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

				field80 = !field80;
			}
		}

		return new XMRRKSSB(var6);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method121() {
		try {
			if (field145 != null) {
				field145.method351();
			}
		} catch (Exception var2) {
		}

		field145 = null;
		field307 = false;
		field442 = 0;
		field485 = "";
		field486 = "";
		method80();
		field358.method539();

		for (int var1 = 0; var1 < 4; var1++) {
			field82[var1].method514();
		}

		System.gc();
		method57();
		field151 = -1;
		field257 = -1;
		field474 = 0;
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method122(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(IILXQPFGONL;)V")
	public final void method123(int arg0, XQPFGONL arg1) {
		field471 = 0;
		field370 = 0;
		method136(arg0, arg1);
		method135(arg1, arg0);
		method33(arg1, arg0);

		for (int var3 = 0; var3 < field471; var3++) {
			int var4 = field472[var3];
			if (field287 != field459[var4].field555) {
				field459[var4].field1 = null;
				field459[var4] = null;
			}
		}

		if (arg1.field1335 != arg0) {
			signlink.reporterror(field485 + " size mismatch in getnpcpos - pos:" + arg1.field1335 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field460; var5++) {
			if (field459[field461[var5]] == null) {
				signlink.reporterror(field485 + " null entry in npc list - pos:" + var5 + " size:" + field460);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method124() {
		int var1 = field249 * 128 + 64;
		int var2 = field250 * 128 + 64;
		int var3 = method65(var2, field137, var1) - field251;

		if (field302 < var1) {
			field302 += (var1 - field302) * field253 / 1000 + field252;
			if (field302 > var1) {
				field302 = var1;
			}
		}

		if (field302 > var1) {
			field302 -= (field302 - var1) * field253 / 1000 + field252;
			if (field302 < var1) {
				field302 = var1;
			}
		}

		if (field303 < var3) {
			field303 += (var3 - field303) * field253 / 1000 + field252;
			if (field303 > var3) {
				field303 = var3;
			}
		}

		if (field303 > var3) {
			field303 -= (field303 - var3) * field253 / 1000 + field252;
			if (field303 < var3) {
				field303 = var3;
			}
		}

		if (field304 < var2) {
			field304 += (var2 - field304) * field253 / 1000 + field252;
			if (field304 > var2) {
				field304 = var2;
			}
		}

		if (field304 > var2) {
			field304 -= (field304 - var2) * field253 / 1000 + field252;
			if (field304 < var2) {
				field304 = var2;
			}
		}

		int var4 = field87 * 128 + 64;
		int var5 = field88 * 128 + 64;
		int var6 = method65(var5, field137, var4) - field89;
		int var7 = var4 - field302;
		int var8 = var6 - field303;
		int var9 = var5 - field304;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field305 < var11) {
			field305 += (var11 - field305) * field91 / 1000 + field90;
			if (field305 > var11) {
				field305 = var11;
			}
		}

		if (field305 > var11) {
			field305 -= (field305 - var11) * field91 / 1000 + field90;
			if (field305 < var11) {
				field305 = var11;
			}
		}

		int var13 = var12 - field306;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field306 += field91 * var13 / 1000 + field90;
			field306 &= 0x7FF;
		}

		if (var13 < 0) {
			field306 -= -var13 * field91 / 1000 + field90;
			field306 &= 0x7FF;
		}

		int var14 = var12 - field306;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field306 = var12;
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method125(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method126() {
		if (field476 >= 2 || field222 != 0 || field218 != 0) {
			String var1;
			if (field222 == 1 && field476 < 2) {
				var1 = "Use " + field226 + " with...";
			} else if (field218 == 1 && field476 < 2) {
				var1 = field221 + "...";
			} else {
				var1 = field182[field476 - 1];
			}

			if (field476 > 2) {
				var1 = var1 + "@whi@ / " + (field476 - 2) + " more options";
			}

			field445.method379(0xFFFFFF, true, 15, field287 / 1000, var1, 4);
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method127() {
		if (field81 != 0) {
			NSKCCMMO var1 = field444;
			int var2 = 0;
			if (field337 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field205[var3] != null) {
					int var4 = field203[var3];
					String var5 = field204[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field360 == 0 || field360 == 1 && method98(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method374(var7, "From", var8, 0);
						var1.method374(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method372("From ");
						if (var6 == 1) {
							field75[0].method533(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field75[1].method533(var7 - 12, var11);
							var11 += 14;
						}

						var1.method374(var7, var5 + ": " + field205[var3], var11, 0);
						var1.method374(var7 - 1, var5 + ": " + field205[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field360 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method374(var9, field205[var3], 4, 0);
						var1.method374(var9 - 1, field205[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field360 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method374(var10, "To " + var5 + ": " + field205[var3], 4, 0);
						var1.method374(var10 - 1, "To " + var5 + ": " + field205[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method128(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field379; var3++) {
				if (field95[var3] == arg0) {
					field379--;
					field438 = true;

					for (int var4 = var3; var4 < field379; var4++) {
						field95[var4] = field95[var4 + 1];
					}

					field180.method467(9);
					field180.method474(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)Z")
	public final boolean method129() {
		if (field145 == null) {
			return false;
		}

		try {
			int var1 = field145.method353();
			if (var1 == 0) {
				return false;
			}

			if (field100 == -1) {
				field145.method354(field214.field1334, 0, 1);
				field100 = field214.field1334[0] & 0xFF;
				if (field396 != null) {
					field100 = field100 - field396.method461() & 0xFF;
				}

				field99 = BEQTVALI.field28[field100];
				var1--;
			}

			if (field99 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field145.method354(field214.field1334, 0, 1);
				field99 = field214.field1334[0] & 0xFF;
				var1--;
			}

			if (field99 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field145.method354(field214.field1334, 0, 2);
				field214.field1335 = 0;
				field99 = field214.method480();
				var1 -= 2;
			}

			if (var1 < field99) {
				return false;
			}

			field214.field1335 = 0;
			field145.method354(field214.field1334, 0, field99);
			field101 = 0;
			field193 = field192;
			field192 = field191;
			field191 = field100;

			if (field100 == 23) {
				field168 = field214.method478();
				if (field94 == field168) {
					if (field168 == 3) {
						field94 = 1;
					} else {
						field94 = 3;
					}

					field438 = true;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 31) {
				for (int var2 = 0; var2 < field367.length; var2++) {
					if (field367[var2] != null) {
						field367[var2].field532 = -1;
					}
				}

				for (int var3 = 0; var3 < field459.length; var3++) {
					if (field459[var3] != null) {
						field459[var3].field532 = -1;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 100) {
				int var4 = field214.method506();
				int var5 = field214.method505();
				int var6 = var4 >> 10 & 0x1F;
				int var7 = var4 >> 5 & 0x1F;
				int var8 = var4 & 0x1F;
				KFCZNNDM.field939[var5].field928 = (var8 << 3) + (var6 << 19) + (var7 << 11);
				field100 = -1;
				return true;
			}

			if (field100 == 192) {
				int var9 = field214.method506();
				int var10 = field214.method505();
				int var11 = field214.method505();
				int var12 = field214.method505();
				KFCZNNDM.field939[var11].field936 = var12;
				KFCZNNDM.field939[var11].field937 = var9;
				KFCZNNDM.field939[var11].field935 = var10;
				field100 = -1;
				return true;
			}

			if (field100 == 223) {
				String var13 = field214.method485();
				int var14 = field214.method478();
				int var15 = field214.method496();
				if (var14 >= 1 && var14 <= 5) {
					if (var13.equalsIgnoreCase("null")) {
						var13 = null;
					}

					field417[var14 - 1] = var13;
					field418[var14 - 1] = var15 == 0;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 7) {
				field379 = field99 / 8;
				for (int var16 = 0; var16 < field379; var16++) {
					field95[var16] = field214.method484();
				}

				field100 = -1;
				return true;
			}

			if (field100 == 39) {
				for (int var17 = 0; var17 < field327.length; var17++) {
					if (field327[var17] != field312[var17]) {
						field327[var17] = field312[var17];
						method141(var17);
						field438 = true;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 26) {
				if (field94 == 12) {
					field438 = true;
				}

				field259 = field214.method481();
				field100 = -1;
				return true;
			}

			if (field100 == 32) {
				int var18 = field214.method496();
				int var19 = field214.method506();
				if (var19 == 0xFFFF) {
					var19 = -1;
				}

				field276[var18] = var19;
				field438 = true;
				field338 = true;
				field100 = -1;
				return true;
			}

			if (field100 == 28) {
				field331 = field214.method496();
				field66 = field214.method480();
				field127 = field214.method505();
				field172 = field214.method478();
				field481 = field214.method510();
				if (field481 != 0 && field230 == -1) {
					signlink.dnslookup(FYSVECDN.method217(field481));
					method97();
					short var20 = 650;
					if (field172 != 201 || field331 == 1) {
						var20 = 655;
					}

					field267 = "";
					field93 = false;

					for (int var21 = 0; var21 < KFCZNNDM.field939.length; var21++) {
						if (KFCZNNDM.field939[var21] != null && KFCZNNDM.field939[var21].field909 == var20) {
							field230 = KFCZNNDM.field939[var21].field884;
							break;
						}
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 225) {
				field438 = true;
				int var22 = field214.method496();
				int var23 = field214.method496();
				int var24 = field214.method483();
				field310[var22] = var24;
				field439[var22] = var23;
				field130[var22] = 1;
				for (int var25 = 0; var25 < 98; var25++) {
					if (var24 >= field289[var25]) {
						field130[var22] = var25 + 2;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 45) {
				long var26 = field214.method484();
				int var28 = field214.method478();
				String var29 = FYSVECDN.method218(FYSVECDN.method215(var26));
				for (int var30 = 0; var30 < field397; var30++) {
					if (field233[var30] == var26) {
						if (field207[var30] != var28) {
							field207[var30] = var28;
							field438 = true;

							if (var28 > 0) {
								method155(5, var29 + " has logged in.", "");
							}

							if (var28 == 0) {
								method155(5, var29 + " has logged out.", "");
							}
						}

						var29 = null;
						break;
					}
				}

				if (var29 != null && field397 < 200) {
					field233[field397] = var26;
					field377[field397] = var29;
					field207[field397] = var28;
					field397++;
					field438 = true;
				}

				boolean var31 = false;
				while (!var31) {
					var31 = true;
					for (int var32 = 0; var32 < field397 - 1; var32++) {
						if (field207[var32] != field198 && field207[var32 + 1] == field198 || field207[var32] == 0 && field207[var32 + 1] != 0) {
							int var33 = field207[var32];
							field207[var32] = field207[var32 + 1];
							field207[var32 + 1] = var33;
							String var34 = field377[var32];
							field377[var32] = field377[var32 + 1];
							field377[var32 + 1] = var34;
							long var35 = field233[var32];
							field233[var32] = field233[var32 + 1];
							field233[var32 + 1] = var35;
							field438 = true;
							var31 = false;
						}
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 193) {
				method123(field99, field214);
				field100 = -1;
				return true;
			}

			if (field100 == 40) {
				int var37 = field214.method506();
				int var38 = field214.method505();

				if (field279 != -1) {
					field279 = -1;
					field79 = true;
				}

				if (field407 != 0) {
					field407 = 0;
					field79 = true;
				}

				field230 = var38;
				field298 = var37;
				field438 = true;
				field338 = true;
				field110 = false;
				field100 = -1;
				return true;
			}

			if (field100 == 95) {
				int var39 = field214.method506();
				int var40 = field214.method506();
				int var41 = field214.method480();
				if (var41 == 0xFFFF) {
					KFCZNNDM.field939[var40].field904 = 0;
					field100 = -1;
					return true;
				}

				WKEFMNQD var42 = WKEFMNQD.method437(var41);
				KFCZNNDM.field939[var40].field904 = 4;
				KFCZNNDM.field939[var40].field905 = var41;
				KFCZNNDM.field939[var40].field936 = var42.field1224;
				KFCZNNDM.field939[var40].field937 = var42.field1243;
				KFCZNNDM.field939[var40].field935 = var42.field1226 * 100 / var39;
				field100 = -1;
				return true;
			}

			if (field100 == 93) {
				field438 = true;
				int var43 = field214.method480();
				KFCZNNDM var44 = KFCZNNDM.field939[var43];
				while (field214.field1335 < field99) {
					int var45 = field214.method492();
					int var46 = field214.method480();
					int var47 = field214.method478();
					if (var47 == 255) {
						var47 = field214.method483();
					}

					if (var45 >= 0 && var45 < var44.field886.length) {
						var44.field886[var45] = var46;
						var44.field918[var45] = var47;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 204) {
				long var48 = field214.method484();
				int var50 = field214.method483();
				int var51 = field214.method478();
				boolean var52 = false;
				for (int var53 = 0; var53 < 100; var53++) {
					if (field437[var53] == var50) {
						var52 = true;
						break;
					}
				}

				if (var51 <= 1) {
					for (int var54 = 0; var54 < field379; var54++) {
						if (field95[var54] == var48) {
							var52 = true;
							break;
						}
					}
				}

				if (!var52 && field97 == 0) {
					try {
						field437[field426] = var50;
						field426 = (field426 + 1) % 100;
						String var55 = GYTJTJWK.method223(field99 - 13, field214);
						if (var51 != 3) {
							var55 = KUCFVEDX.method311(var55);
						}

						if (var51 == 2 || var51 == 3) {
							method155(7, var55, "@cr2@" + FYSVECDN.method218(FYSVECDN.method215(var48)));
						} else if (var51 == 1) {
							method155(7, var55, "@cr1@" + FYSVECDN.method218(FYSVECDN.method215(var48)));
						} else {
							method155(3, var55, FYSVECDN.method218(FYSVECDN.method215(var48)));
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 3) {
				field448 = false;
				field407 = 1;
				field409 = "";
				field79 = true;
				field100 = -1;
				return true;
			}

			if (field100 == 50) {
				int var57 = field214.method511();
				int var58 = field214.method504();
				field312[var58] = var57;

				if (field327[var58] != var57) {
					field327[var58] = var57;
					method141(var58);
					field438 = true;

					if (field345 != -1) {
						field79 = true;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 72) {
				field322 = field214.method498();
				field321 = field214.method497();
				for (int var59 = field321; var59 < field321 + 8; var59++) {
					for (int var60 = field322; var60 < field322 + 8; var60++) {
						if (field329[field137][var59][var60] != null) {
							field329[field137][var59][var60] = null;
							method156(var59, var60);
						}
					}
				}

				for (ZDLIXYKO var61 = (ZDLIXYKO) field320.method199(); var61 != null; var61 = (ZDLIXYKO) field320.method201()) {
					if (var61.field1484 >= field321 && var61.field1484 < field321 + 8 && var61.field1485 >= field322 && var61.field1485 < field322 + 8 && field137 == var61.field1482) {
						var61.field1481 = 0;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 144) {
				int var62 = field214.method504();
				KFCZNNDM.field939[var62].field904 = 3;

				if (field146.field1185 == null) {
					KFCZNNDM.field939[var62].field905 = (field146.field1196[11] << 5) + (field146.field1196[8] << 10) + (field146.field1196[0] << 15) + (field146.field1183[0] << 25) + (field146.field1183[4] << 20) + field146.field1196[1];
				} else {
					KFCZNNDM.field939[var62].field905 = (int) (field146.field1185.field695 + 0x12345678L);
				}

				field100 = -1;
				return true;
			}

			if (field100 == 160) {
				int var63 = field214.method506();
				byte var64 = field214.method500();
				field312[var63] = var64;

				if (field327[var63] != var64) {
					field327[var63] = var64;
					method141(var63);
					field438 = true;

					if (field345 != -1) {
						field79 = true;
					}
				}

				field100 = -1;
				return true;
			}

			if (field100 == 214) {
				int var65 = field214.method480();
				method60(var65);

				if (field298 != -1) {
					field298 = -1;
					field438 = true;
					field338 = true;
				}

				if (field279 != -1) {
					field279 = -1;
					field79 = true;
				}

				if (field407 != 0) {
					field407 = 0;
					field79 = true;
				}

				field230 = var65;
				field110 = false;
				field100 = -1;
				return true;
			}

			if (field100 == 6) {
				field325 = false;

				for (int var66 = 0; var66 < 5; var66++) {
					field64[var66] = false;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 212) {
				int var67 = field214.method504();
				int var68 = field214.method480();
				KFCZNNDM var69 = KFCZNNDM.field939[var67];
				if (var69 != null && var69.field940 == 0) {
					if (var68 < 0) {
						var68 = 0;
					}

					if (var68 > var69.field908 - var69.field938) {
						var68 = var69.field908 - var69.field938;
					}

					var69.field931 = var68;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 199) {
				method109(field99, field214);
				field301 = false;
				field100 = -1;
				return true;
			}

			if (field100 == 85) {
				int var70 = field214.method507();
				field345 = var70;
				field79 = true;
				field100 = -1;
				return true;
			}

			if (field100 == 56) {
				int var71 = field214.method508();
				if (var71 >= 0) {
					method60(var71);
				}

				field163 = var71;
				field100 = -1;
				return true;
			}

			if (field100 == 166) {
				field94 = field214.method497();
				field438 = true;
				field338 = true;
				field100 = -1;
				return true;
			}

			if (field100 == 126) {
				int var72 = field214.method480();
				method60(var72);

				if (field298 != -1) {
					field298 = -1;
					field438 = true;
					field338 = true;
				}

				field279 = var72;
				field79 = true;
				field230 = -1;
				field110 = false;
				field100 = -1;
				return true;
			}

			if (field100 == 92) {
				field254 = 0;
				field100 = -1;
				return true;
			}

			if (field100 == 196) {
				field416 = field214.method478();
				field100 = -1;
				return true;
			}

			if (field100 == 61) {
				int var73 = field214.method480();
				boolean var74 = field214.method496() == 1;
				KFCZNNDM.field939[var73].field898 = var74;
				field100 = -1;
				return true;
			}

			if (field100 == 13) {
				int var75 = field214.method480();
				int var76 = field214.method478();
				int var77 = field214.method480();
				if (field440 && !field201 && field313 < 50) {
					field271[field313] = var75;
					field125[field313] = var76;
					field185[field313] = CUQKGTCO.field488[var75] + var77;
					field313++;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 157) {
				field337 = field214.method480() * 30;
				field100 = -1;
				return true;
			}

			if (field100 == 232) {
				field321 = field214.method496();
				field322 = field214.method498();
				field100 = -1;
				return true;
			}

			if (field100 == 76) {
				field438 = true;
				int var78 = field214.method480();
				KFCZNNDM var79 = KFCZNNDM.field939[var78];
				int var80 = field214.method480();
				for (int var81 = 0; var81 < var80; var81++) {
					int var82 = field214.method478();
					if (var82 == 255) {
						var82 = field214.method511();
					}

					var79.field886[var81] = field214.method504();
					var79.field918[var81] = var82;
				}

				for (int var83 = var80; var83 < var79.field886.length; var83++) {
					var79.field886[var83] = 0;
					var79.field918[var83] = 0;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 44) {
				int var84 = field214.method506();
				if (var84 == 0xFFFF) {
					var84 = -1;
				}

				if (field151 != var84 && field415 && !field201 && field474 == 0) {
					field257 = var84;
					field258 = true;
					field281.method451(2, field257);
				}

				field151 = var84;
				field100 = -1;
				return true;
			}

			if (field100 == 203) {
				int var85 = field214.method504();
				int var86 = field214.method504();
				if (field415 && !field201) {
					field257 = var85;
					field258 = false;
					field281.method451(2, field257);
					field474 = var86;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 97) {
				field143 = field214.method478();
				field100 = -1;
				return true;
			}

			if (field100 == 153) {
				field398 = field214.method478();
				field438 = true;
				field100 = -1;
				return true;
			}

			if (field100 == 46) {
				int var87 = field214.method505();
				int var88 = field214.method507();
				KFCZNNDM var89 = KFCZNNDM.field939[var87];
				var89.field890 = var88;

				if (var88 == -1) {
					var89.field926 = 0;
					var89.field899 = 0;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 149) {
				int var90 = field214.method478();
				int var91 = field214.method478();
				int var92 = field214.method478();
				int var93 = field214.method478();
				field64[var90] = true;
				field311[var90] = var91;
				field403[var90] = var92;
				field209[var90] = var93;
				field343[var90] = 0;
				field100 = -1;
				return true;
			}

			if (field100 == 108) {
				if (field94 == 12) {
					field438 = true;
				}

				field470 = field214.method478();
				field100 = -1;
				return true;
			}

			if (field100 == 123) {
				int var94 = field214.method505();
				int var95 = field214.method506();
				KFCZNNDM.field939[var94].field904 = 1;
				KFCZNNDM.field939[var94].field905 = var95;
				field100 = -1;
				return true;
			}

			if (field100 == 64) {
				String var96 = field214.method485();
				if (var96.endsWith(":tradereq:")) {
					String var97 = var96.substring(0, var96.indexOf(":"));
					long var98 = FYSVECDN.method214(var97);
					boolean var100 = false;
					for (int var101 = 0; var101 < field379; var101++) {
						if (field95[var101] == var98) {
							var100 = true;
							break;
						}
					}

					if (!var100 && field97 == 0) {
						method155(4, "wishes to trade with you.", var97);
					}
				} else if (var96.endsWith(":duelreq:")) {
					String var102 = var96.substring(0, var96.indexOf(":"));
					long var103 = FYSVECDN.method214(var102);
					boolean var105 = false;
					for (int var106 = 0; var106 < field379; var106++) {
						if (field95[var106] == var103) {
							var105 = true;
							break;
						}
					}

					if (!var105 && field97 == 0) {
						method155(8, "wishes to duel with you.", var102);
					}
				} else if (var96.endsWith(":chalreq:")) {
					String var107 = var96.substring(0, var96.indexOf(":"));
					long var108 = FYSVECDN.method214(var107);
					boolean var110 = false;
					for (int var111 = 0; var111 < field379; var111++) {
						if (field95[var111] == var108) {
							var110 = true;
							break;
						}
					}

					if (!var110 && field97 == 0) {
						String var112 = var96.substring(var96.indexOf(":") + 1, var96.length() - 9);
						method155(8, var112, var107);
					}
				} else {
					method155(0, var96, "");
				}

				field100 = -1;
				return true;
			}

			if (field100 == 15) {
				int var113 = field214.method480();
				KFCZNNDM var114 = KFCZNNDM.field939[var113];
				for (int var115 = 0; var115 < var114.field886.length; var115++) {
					var114.field886[var115] = -1;
					var114.field886[var115] = 0;
				}

				field100 = -1;
				return true;
			}

			if (field100 == 18) {
				int var116 = field214.method506();
				String var117 = field214.method485();
				KFCZNNDM.field939[var116].field885 = var117;

				if (field276[field94] == KFCZNNDM.field939[var116].field884) {
					field438 = true;
				}

				field100 = -1;
				return true;
			}

			if (field100 != 68 && field100 != 217) {
				if (field100 == 89) {
					field477 = field214.method478();
					field360 = field214.method478();
					field135 = field214.method478();
					field268 = true;
					field79 = true;
					field100 = -1;
					return true;
				}

				if (field100 == 161) {
					int var168 = field214.method504();
					method60(var168);

					if (field279 != -1) {
						field279 = -1;
						field79 = true;
					}

					if (field407 != 0) {
						field407 = 0;
						field79 = true;
					}

					field298 = var168;
					field438 = true;
					field338 = true;
					field230 = -1;
					field110 = false;
					field100 = -1;
					return true;
				}

				if (field100 != 240) {
					if (field100 == 237) {
						if (field298 != -1) {
							field298 = -1;
							field438 = true;
							field338 = true;
						}

						if (field279 != -1) {
							field279 = -1;
							field79 = true;
						}

						if (field407 != 0) {
							field407 = 0;
							field79 = true;
						}

						field230 = -1;
						field110 = false;
						field100 = -1;
						return true;
					}

					if (field100 == 101 || field100 == 0 || field100 == 229 || field100 == 84 || field100 == 41 || field100 == 172 || field100 == 180 || field100 == 81 || field100 == 252 || field100 == 36 || field100 == 156) {
						method34(field100, field214);
						field100 = -1;
						return true;
					}

					if (field100 == 102) {
						field126 = field214.method478();
						if (field126 == 1) {
							field206 = field214.method480();
						}

						if (field126 >= 2 && field126 <= 6) {
							if (field126 == 2) {
								field118 = 64;
								field119 = 64;
							}

							if (field126 == 3) {
								field118 = 0;
								field119 = 64;
							}

							if (field126 == 4) {
								field118 = 128;
								field119 = 64;
							}

							if (field126 == 5) {
								field118 = 64;
								field119 = 0;
							}

							if (field126 == 6) {
								field118 = 64;
								field119 = 128;
							}

							field126 = 2;
							field115 = field214.method480();
							field116 = field214.method480();
							field117 = field214.method478();
						}

						if (field126 == 10) {
							field284 = field214.method480();
						}

						field100 = -1;
						return true;
					}

					if (field100 == 250) {
						field448 = false;
						field407 = 2;
						field409 = "";
						field79 = true;
						field100 = -1;
						return true;
					}

					if (field100 == 90) {
						field321 = field214.method497();
						field322 = field214.method497();

						while (field214.field1335 < field99) {
							int var171 = field214.method478();
							method34(var171, field214);
						}

						field100 = -1;
						return true;
					}

					if (field100 == 228) {
						field325 = true;
						field87 = field214.method478();
						field88 = field214.method478();
						field89 = field214.method480();
						field90 = field214.method478();
						field91 = field214.method478();
						if (field91 >= 100) {
							int var172 = field87 * 128 + 64;
							int var173 = field88 * 128 + 64;
							int var174 = method65(var173, field137, var172) - field89;
							int var175 = var172 - field302;
							int var176 = var174 - field303;
							int var177 = var173 - field304;
							int var178 = (int) Math.sqrt(var175 * var175 + var177 * var177);
							field305 = (int) (Math.atan2(var176, var178) * 325.949D) & 0x7FF;
							field306 = (int) (Math.atan2(var175, var177) * -325.949D) & 0x7FF;

							if (field305 < 128) {
								field305 = 128;
							}

							if (field305 > 383) {
								field305 = 383;
							}
						}

						field100 = -1;
						return true;
					}

					if (field100 == 245) {
						int var179 = field214.method504();
						int var180 = field214.method507();
						int var181 = field214.method507();
						KFCZNNDM var182 = KFCZNNDM.field939[var179];
						var182.field901 = var181;
						var182.field883 = var180;
						field100 = -1;
						return true;
					}

					if (field100 == 25) {
						field325 = true;
						field249 = field214.method478();
						field250 = field214.method478();
						field251 = field214.method480();
						field252 = field214.method478();
						field253 = field214.method478();
						if (field253 >= 100) {
							field302 = field249 * 128 + 64;
							field304 = field250 * 128 + 64;
							field303 = method65(field304, field137, field302) - field251;
						}

						field100 = -1;
						return true;
					}

					if (field100 == 159) {
						field457 = field214.method497();
						field260 = field214.method505();
						field100 = -1;
						return true;
					}

					if (field100 == 234) {
						method121();
						field100 = -1;
						return false;
					}

					signlink.reporterror("T1 - " + field100 + "," + field99 + " - " + field192 + "," + field193);
					method121();
					return true;
				}

				int var169 = field214.method506();
				int var170 = field214.method505();
				KFCZNNDM.field939[var170].field904 = 2;
				KFCZNNDM.field939[var170].field905 = var169;
				field100 = -1;
				return true;
			}

			int var118 = field236;
			int var119 = field237;
			if (field100 == 68) {
				var119 = field214.method480();
				var118 = field214.method504();
				field202 = false;
			}

			if (field100 == 217) {
				field214.method488();

				for (int var120 = 0; var120 < 4; var120++) {
					for (int var121 = 0; var121 < 13; var121++) {
						for (int var122 = 0; var122 < 13; var122++) {
							int var123 = field214.method489(1);
							if (var123 == 1) {
								field166[var120][var121][var122] = field214.method489(26);
							} else {
								field166[var120][var121][var122] = -1;
							}
						}
					}
				}

				field214.method490();
				var119 = field214.method480();
				var118 = field214.method480();
				field202 = true;
			}

			if (field236 == var118 && field237 == var119 && field261 == 2) {
				field100 = -1;
				return true;
			}

			field236 = var118;
			field237 = var119;
			field104 = (field236 - 6) * 8;
			field105 = (field237 - 6) * 8;
			field356 = false;
			if ((field236 / 8 == 48 || field236 / 8 == 49) && field237 / 8 == 48) {
				field356 = true;
			}

			if (field236 / 8 == 48 && field237 / 8 == 148) {
				field356 = true;
			}

			field261 = 1;
			field215 = System.currentTimeMillis();
			field455.method394();
			field444.method370("Loading - please wait.", 257, 0, 151);
			field444.method370("Loading - please wait.", 256, 0xFFFFFF, 150);
			field455.method395(field1021, 4, 4);

			if (field100 == 68) {
				int var124 = 0;
				for (int var125 = (field236 - 6) / 8; var125 <= (field236 + 6) / 8; var125++) {
					for (int var126 = (field237 - 6) / 8; var126 <= (field237 + 6) / 8; var126++) {
						var124++;
					}
				}

				field76 = new byte[var124][];
				field113 = new byte[var124][];
				field139 = new int[var124];
				field140 = new int[var124];
				field141 = new int[var124];
				int var127 = 0;
				for (int var128 = (field236 - 6) / 8; var128 <= (field236 + 6) / 8; var128++) {
					for (int var129 = (field237 - 6) / 8; var129 <= (field237 + 6) / 8; var129++) {
						field139[var127] = (var128 << 8) + var129;

						if (field356 && (var129 == 49 || var129 == 149 || var129 == 147 || var128 == 50 || var128 == 49 && var129 == 47)) {
							field140[var127] = -1;
							field141[var127] = -1;
							var127++;
						} else {
							int var130 = field140[var127] = field281.method449(var128, 0, var129);
							if (var130 != -1) {
								field281.method451(3, var130);
							}

							int var131 = field141[var127] = field281.method449(var128, 1, var129);
							if (var131 != -1) {
								field281.method451(3, var131);
							}

							var127++;
						}
					}
				}
			}

			if (field100 == 217) {
				int var132 = 0;
				int[] var133 = new int[676];
				for (int var134 = 0; var134 < 4; var134++) {
					for (int var135 = 0; var135 < 13; var135++) {
						for (int var136 = 0; var136 < 13; var136++) {
							int var137 = field166[var134][var135][var136];
							if (var137 != -1) {
								int var138 = var137 >> 14 & 0x3FF;
								int var139 = var137 >> 3 & 0x7FF;
								int var140 = (var138 / 8 << 8) + var139 / 8;
								for (int var141 = 0; var141 < var132; var141++) {
									if (var133[var141] == var140) {
										var140 = -1;
										break;
									}
								}

								if (var140 != -1) {
									var133[var132++] = var140;
								}
							}
						}
					}
				}

				field76 = new byte[var132][];
				field113 = new byte[var132][];
				field139 = new int[var132];
				field140 = new int[var132];
				field141 = new int[var132];
				for (int var142 = 0; var142 < var132; var142++) {
					int var143 = field139[var142] = var133[var142];
					int var144 = var143 >> 8 & 0xFF;
					int var145 = var143 & 0xFF;
					int var146 = field140[var142] = field281.method449(var144, 0, var145);
					if (var146 != -1) {
						field281.method451(3, var146);
					}

					int var147 = field141[var142] = field281.method449(var144, 1, var145);
					if (var147 != -1) {
						field281.method451(3, var147);
					}
				}
			}

			int var148 = field104 - field106;
			int var149 = field105 - field107;
			field106 = field104;
			field107 = field105;

			for (int var150 = 0; var150 < 16384; var150++) {
				AHIOLHWV var151 = field459[var150];
				if (var151 != null) {
					for (int var152 = 0; var152 < 10; var152++) {
						var151.field544[var152] -= var148;
						var151.field545[var152] -= var149;
					}

					var151.field514 -= var148 * 128;
					var151.field515 -= var149 * 128;
				}
			}

			for (int var153 = 0; var153 < field365; var153++) {
				TKIWGAGO var154 = field367[var153];
				if (var154 != null) {
					for (int var155 = 0; var155 < 10; var155++) {
						var154.field544[var155] -= var148;
						var154.field545[var155] -= var149;
					}

					var154.field514 -= var148 * 128;
					var154.field515 -= var149 * 128;
				}
			}

			field301 = true;
			byte var156 = 0;
			byte var157 = 104;
			byte var158 = 1;
			if (var148 < 0) {
				var156 = 103;
				var157 = -1;
				var158 = -1;
			}

			byte var159 = 0;
			byte var160 = 104;
			byte var161 = 1;
			if (var149 < 0) {
				var159 = 103;
				var160 = -1;
				var161 = -1;
			}

			for (int var162 = var156; var162 != var157; var162 += var158) {
				for (int var163 = var159; var163 != var160; var163 += var161) {
					int var164 = var148 + var162;
					int var165 = var149 + var163;
					for (int var166 = 0; var166 < 4; var166++) {
						if (var164 >= 0 && var165 >= 0 && var164 < 104 && var165 < 104) {
							field329[var166][var162][var163] = field329[var166][var164][var165];
						} else {
							field329[var166][var162][var163] = null;
						}
					}
				}
			}

			for (ZDLIXYKO var167 = (ZDLIXYKO) field320.method199(); var167 != null; var167 = (ZDLIXYKO) field320.method201()) {
				var167.field1484 -= var148;
				var167.field1485 -= var149;
				if (var167.field1484 < 0 || var167.field1485 < 0 || var167.field1484 >= 104 || var167.field1485 >= 104) {
					var167.method195();
				}
			}

			if (field254 != 0) {
				field254 -= var148;
				field255 -= var149;
			}

			field325 = false;
			field100 = -1;
			return true;
		} catch (IOException var187) {
			method39();
		} catch (Exception var188) {
			String var184 = "T2 - " + field100 + "," + field192 + "," + field193 + " - " + field99 + "," + (field146.field544[0] + field104) + "," + (field146.field545[0] + field105) + " - ";
			for (int var185 = 0; var185 < field99 && var185 < 50; var185++) {
				var184 = var184 + field214.field1334[var185] + ",";
			}

			signlink.reporterror(var184);
			method121();
		}

		return true;
	}

	@ObfuscatedName("client.a(LYPWLUGYN;I)V")
	public final void method130(YPWLUGYN arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field216.length; var3++) {
			field216[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field216[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field217[var9] = (field216[var9 - 1] + field216[var9 + 1] + field216[var9 - 128] + field216[var9 + 128]) / 4;
				}
			}

			int[] var10 = field216;
			field216 = field217;
			field217 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1377; var12++) {
				for (int var13 = 0; var13 < arg0.field1376; var13++) {
					if (arg0.field1374[var11++] != 0) {
						int var14 = var13 + arg0.field1378 + 16;
						int var15 = var12 + arg0.field1379 + 16;
						int var16 = (var15 << 7) + var14;
						field216[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LZDLIXYKO;B)V")
	public final void method131(ZDLIXYKO arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1483 == 0) {
			var2 = field358.method565(arg0.field1482, arg0.field1484, arg0.field1485);
		}

		if (arg0.field1483 == 1) {
			var2 = field358.method566(arg0.field1484, arg0.field1482, arg0.field1485);
		}

		if (arg0.field1483 == 2) {
			var2 = field358.method567(arg0.field1482, arg0.field1484, arg0.field1485);
		}

		if (arg0.field1483 == 3) {
			var2 = field358.method568(arg0.field1482, arg0.field1484, arg0.field1485);
		}

		if (var2 != 0) {
			int var6 = field358.method569(arg0.field1482, arg0.field1484, arg0.field1485, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1474 = var3;
		arg0.field1476 = var4;
		arg0.field1475 = var5;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method132(int arg0) {
		int[] var2 = field256.field29;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field399[arg0][var7][var5] & 0x18) == 0) {
					field358.method574(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field399[arg0 + 1][var7][var5] & 0x8) != 0) {
					field358.method574(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field256.method8();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field399[arg0][var11][var10] & 0x18) == 0) {
					method171(var8, arg0, var10, var11, var9);
				}

				if (arg0 < 3 && (field399[arg0 + 1][var11][var10] & 0x8) != 0) {
					method171(var8, arg0 + 1, var10, var11, var9);
				}
			}
		}

		field455.method394();
		field400 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field358.method568(field137, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = DHQCHKXN.method194(var14).field609;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field82[field137].field1351;
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

						field341[field400] = field466[var15];
						field401[field400] = var16;
						field402[field400] = var17;
						field400++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LDGZJCXBC;II)V")
	public final void method133(DGZJCXBC arg0, int arg1) {
		method134(arg1, arg0.field515, arg0.field514);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method134(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method65(arg1, field137, arg2) - arg0;
			arg2 -= field302;
			var4 -= field303;
			arg1 -= field304;
			int var5 = ITSMSHJO.field816[field305];
			int var6 = ITSMSHJO.field817[field305];
			int var7 = ITSMSHJO.field816[field306];
			int var8 = ITSMSHJO.field817[field306];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field231 = (var9 << 9) / arg1 + JJAEHWOM.field853;
				field232 = (var11 << 9) / arg1 + JJAEHWOM.field854;
			} else {
				field231 = -1;
				field232 = -1;
			}
		} else {
			field231 = -1;
			field232 = -1;
		}
	}

	@ObfuscatedName("client.b(LXQPFGONL;II)V")
	public final void method135(XQPFGONL arg0, int arg1) {
		while (arg0.field1336 + 21 < arg1 * 8) {
			int var3 = arg0.method489(14);
			if (var3 == 16383) {
				break;
			}

			if (field459[var3] == null) {
				field459[var3] = new AHIOLHWV();
			}

			AHIOLHWV var4 = field459[var3];
			field461[field460++] = var3;
			var4.field555 = field287;
			int var5 = arg0.method489(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method489(1);
			int var7 = arg0.method489(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			var4.field1 = FWGUGZKU.method210(arg0.method489(12));
			int var8 = arg0.method489(1);
			if (var8 == 1) {
				field371[field370++] = var3;
			}

			var4.field540 = var4.field1.field681;
			var4.field562 = var4.field1.field688;
			var4.field519 = var4.field1.field679;
			var4.field520 = var4.field1.field691;
			var4.field521 = var4.field1.field687;
			var4.field522 = var4.field1.field694;
			var4.field541 = var4.field1.field689;
			var4.method183(field146.field545[0] + var7, field146.field544[0] + var5, var6 == 1);
		}

		arg0.method490();
	}

	@ObfuscatedName("client.d(IILXQPFGONL;)V")
	public final void method136(int arg0, XQPFGONL arg1) {
		arg1.method488();
		int var3 = arg1.method489(8);
		if (var3 < field460) {
			for (int var4 = var3; var4 < field460; var4++) {
				field472[field471++] = field461[var4];
			}
		}

		if (var3 > field460) {
			signlink.reporterror(field485 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field460 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field461[var5];
			AHIOLHWV var7 = field459[var6];
			int var8 = arg1.method489(1);
			if (var8 == 0) {
				field461[field460++] = var6;
				var7.field555 = field287;
			} else {
				int var9 = arg1.method489(2);
				if (var9 == 0) {
					field461[field460++] = var6;
					var7.field555 = field287;
					field371[field370++] = var6;
				} else if (var9 == 1) {
					field461[field460++] = var6;
					var7.field555 = field287;
					int var10 = arg1.method489(3);
					var7.method180(var10, false);
					int var11 = arg1.method489(1);
					if (var11 == 1) {
						field371[field370++] = var6;
					}
				} else if (var9 == 2) {
					field461[field460++] = var6;
					var7.field555 = field287;
					int var12 = arg1.method489(3);
					var7.method180(var12, true);
					int var13 = arg1.method489(3);
					var7.method180(var13, true);
					int var14 = arg1.method489(1);
					if (var14 == 1) {
						field371[field370++] = var6;
					}
				} else if (var9 == 3) {
					field472[field471++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LKFCZNNDM;B)V")
	public final void method137(KFCZNNDM arg0) {
		int var2 = arg0.field909;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field398 == 0) {
				arg0.field885 = "Loading friend list";
				arg0.field941 = 0;
			} else if (var2 == 1 && field398 == 1) {
				arg0.field885 = "Connecting to friendserver";
				arg0.field941 = 0;
			} else if (var2 == 2 && field398 != 2) {
				arg0.field885 = "Please wait...";
				arg0.field941 = 0;
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
					arg0.field885 = "";
					arg0.field941 = 0;
				} else {
					arg0.field885 = field377[var2];
					arg0.field941 = 1;
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
				arg0.field885 = "";
				arg0.field941 = 0;
			} else {
				if (field207[var2] == 0) {
					arg0.field885 = "@red@Offline";
				} else if (field207[var2] == field198) {
					arg0.field885 = "@gre@World-" + (field207[var2] - 9);
				} else {
					arg0.field885 = "@yel@World-" + (field207[var2] - 9);
				}

				arg0.field941 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field397;
			if (field398 != 2) {
				var5 = 0;
			}

			arg0.field908 = var5 * 15 + 20;
			if (arg0.field908 <= arg0.field938) {
				arg0.field908 = arg0.field938 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field398 == 0) {
				arg0.field885 = "Loading ignore list";
				arg0.field941 = 0;
			} else if (var2 == 1 && field398 == 0) {
				arg0.field885 = "Please wait...";
				arg0.field941 = 0;
			} else {
				int var6 = field379;
				if (field398 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field885 = "";
					arg0.field941 = 0;
				} else {
					arg0.field885 = FYSVECDN.method218(FYSVECDN.method215(field95[var2]));
					arg0.field941 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field908 = field379 * 15 + 20;
			if (arg0.field908 <= arg0.field938) {
				arg0.field908 = arg0.field938 + 1;
			}
		} else if (var2 == 327) {
			arg0.field936 = 150;
			arg0.field937 = (int) (Math.sin(field287 / 40.0D) * 256.0D) & 0x7FF;

			if (field213) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field196[var7];
					if (var8 >= 0 && !BYTDRQNR.field37[var8].method23()) {
						return;
					}
				}

				field213 = false;
				ITSMSHJO[] var9 = new ITSMSHJO[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field196[var11];
					if (var12 >= 0) {
						var9[var10++] = BYTDRQNR.field37[var12].method24();
					}
				}

				ITSMSHJO var13 = new ITSMSHJO(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field197[var14] != 0) {
						var13.method252(field357[var14][0], field357[var14][field197[var14]]);

						if (var14 == 1) {
							var13.method252(field380[0], field380[field197[var14]]);
						}
					}
				}

				var13.method245();
				var13.method246(HZCWGKOF.field712[field146.field541].field714[0]);
				var13.method255(64, 850, -30, -50, -30, true);
				arg0.field904 = 5;
				arg0.field905 = 0;
				KFCZNNDM.method297(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field111 == null) {
				field111 = arg0.field922;
				field112 = arg0.field888;
			}

			if (field346) {
				arg0.field922 = field112;
			} else {
				arg0.field922 = field111;
			}
		} else if (var2 == 325) {
			if (field111 == null) {
				field111 = arg0.field922;
				field112 = arg0.field888;
			}

			if (field346) {
				arg0.field922 = field111;
			} else {
				arg0.field922 = field112;
			}
		} else if (var2 == 600) {
			arg0.field885 = field267;
			if (field287 % 20 < 10) {
				arg0.field885 = arg0.field885 + "|";
			} else {
				arg0.field885 = arg0.field885 + " ";
			}
		} else if (var2 == 613) {
			if (field364 < 1) {
				arg0.field885 = "";
			} else if (field93) {
				arg0.field928 = 0xFF0000;
				arg0.field885 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field928 = 0xFFFFFF;
				arg0.field885 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field481 == 0) {
				arg0.field885 = "";
			} else {
				String var15;
				if (field66 == 0) {
					var15 = "earlier today";
				} else if (field66 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field66 + " days ago";
				}

				arg0.field885 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field127 == 0) {
				arg0.field885 = "0 unread messages";
				arg0.field928 = 0xFFFF00;
			}

			if (field127 == 1) {
				arg0.field885 = "1 unread message";
				arg0.field928 = 0xFF00;
			}

			if (field127 > 1) {
				arg0.field885 = field127 + " unread messages";
				arg0.field928 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field172 == 201) {
				if (field331 == 1) {
					arg0.field885 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field885 = "";
				}
			} else if (field172 == 200) {
				arg0.field885 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field172 == 0) {
					var16 = "Earlier today";
				} else if (field172 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field172 + " days ago";
				}

				arg0.field885 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field172 == 201) {
				if (field331 == 1) {
					arg0.field885 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field885 = "";
				}
			} else if (field172 == 200) {
				arg0.field885 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field885 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field172 == 201) {
				if (field331 == 1) {
					arg0.field885 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field885 = "";
				}
			} else if (field172 == 200) {
				arg0.field885 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field885 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method138(String arg0) {
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

	@ObfuscatedName("client.c(LXQPFGONL;II)V")
	public final void method139(XQPFGONL arg0, int arg1) {
		for (int var3 = 0; var3 < field370; var3++) {
			int var4 = field371[var3];
			TKIWGAGO var5 = field367[var4];
			int var6 = arg0.method478();
			if ((var6 & 0x4) != 0) {
				var6 += arg0.method478() << 8;
			}

			method146(var6, var4, arg0, var5);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1024 != null) {
				return new URL("http://127.0.0.1:" + (field199 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = ITSMSHJO.field816[var7];
			int var13 = ITSMSHJO.field817[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = ITSMSHJO.field816[var8];
			int var16 = ITSMSHJO.field817[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field302 = arg4 - var9;
		field303 = arg1 - var10;
		field304 = arg2 - var11;
		field305 = arg5;
		field306 = arg0;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method141(int arg0) {
		int var2 = YBKVSPMW.field1360[arg0].field1368;
		if (var2 != 0) {
			int var3 = field327[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					JJAEHWOM.method279(0.9D);
				}

				if (var3 == 2) {
					JJAEHWOM.method279(0.8D);
				}

				if (var3 == 3) {
					JJAEHWOM.method279(0.7D);
				}

				if (var3 == 4) {
					JJAEHWOM.method279(0.6D);
				}

				WKEFMNQD.field1246.method222();
				field212 = true;
			}

			if (var2 == 3) {
				boolean var4 = field415;

				if (var3 == 0) {
					method122(0, field415);
					field415 = true;
				}

				if (var3 == 1) {
					method122(-400, field415);
					field415 = true;
				}

				if (var3 == 2) {
					method122(-800, field415);
					field415 = true;
				}

				if (var3 == 3) {
					method122(-1200, field415);
					field415 = true;
				}

				if (var3 == 4) {
					field415 = false;
				}

				if (field415 != var4 && !field201) {
					if (field415) {
						field257 = field151;
						field258 = true;
						field281.method451(2, field257);
					} else {
						method57();
					}

					field474 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field440 = true;
					method142(0);
				}

				if (var3 == 1) {
					field440 = true;
					method142(-400);
				}

				if (var3 == 2) {
					field440 = true;
					method142(-800);
				}

				if (var3 == 3) {
					field440 = true;
					method142(-1200);
				}

				if (var3 == 4) {
					field440 = false;
				}
			}

			if (var2 == 5) {
				field280 = var3;
			}

			if (var2 == 6) {
				field297 = var3;
			}

			if (var2 == 8) {
				field81 = var3;
				field79 = true;
			}

			if (var2 == 9) {
				field408 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method142(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.e(I)V")
	public final void method143() {
		field212 = true;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method144() {
		for (NLSYPUNJ var1 = (NLSYPUNJ) field270.method199(); var1 != null; var1 = (NLSYPUNJ) field270.method201()) {
			if (field137 != var1.field995 || var1.field999) {
				var1.method195();
			} else if (field287 >= var1.field1000) {
				var1.method368(field433);

				if (var1.field999) {
					var1.method195();
				} else {
					field358.method550(var1.field998, var1.field996, 0, 60, var1.field995, var1, var1.field997, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method145(boolean arg0) {
		for (int var2 = 0; var2 < field460; var2++) {
			AHIOLHWV var3 = field459[field461[var2]];
			int var4 = (field461[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method1() && var3.field1.field670 == arg0) {
				int var5 = var3.field514 >> 7;
				int var6 = var3.field515 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field540 == 1 && (var3.field514 & 0x7F) == 0x40 && (var3.field515 & 0x7F) == 0x40) {
						if (field316[var5][var6] == field464) {
							continue;
						}

						field316[var5][var6] = field464;
					}

					if (!var3.field1.field682) {
						var4 += Integer.MIN_VALUE;
					}

					field358.method550(method65(var3.field515, field137, var3.field514), var3.field514, var3.field516, (var3.field540 - 1) * 64 + 60, field137, var3, var3.field515, var4, var3.field513);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILXQPFGONL;LTKIWGAGO;)V")
	public final void method146(int arg0, int arg1, XQPFGONL arg2, TKIWGAGO arg3) {
		if ((arg0 & 0x100) != 0) {
			arg3.field547 = arg2.method496();
			arg3.field549 = arg2.method496();
			arg3.field548 = arg2.method498();
			arg3.field550 = arg2.method497();
			arg3.field551 = arg2.method505() + field287;
			arg3.field552 = arg2.method506() + field287;
			arg3.field553 = arg2.method496();
			arg3.method182();
		}

		if ((arg0 & 0x1) != 0) {
			arg3.field518 = arg2.method480();
			if (arg3.field518 == 0xFFFF) {
				arg3.field518 = -1;
			}
		}

		if ((arg0 & 0x40) != 0) {
			arg3.field523 = arg2.method505();
			arg3.field524 = arg2.method480();
		}

		if ((arg0 & 0x20) != 0) {
			int var5 = arg2.method497();
			byte[] var6 = new byte[var5];
			XQPFGONL var7 = new XQPFGONL(var6);
			arg2.method513(var5, var6, 0);
			field372[arg1] = var7;
			arg3.method425(var7);
		}

		if ((arg0 & 0x80) != 0) {
			int var8 = arg2.method498();
			int var9 = arg2.method496();
			arg3.method181(var9, field287, var8);
			arg3.field508 = field287 + 300;
			arg3.field509 = arg2.method496();
			arg3.field510 = arg2.method478();
		}

		if ((arg0 & 0x8) != 0) {
			int var10 = arg2.method505();
			int var11 = arg2.method496();
			int var12 = arg2.method498();
			int var13 = arg2.field1335;

			if (arg3.field1187 != null && arg3.field1175) {
				long var14 = FYSVECDN.method214(arg3.field1187);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < field379; var17++) {
						if (field95[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && field97 == 0) {
					try {
						field458.field1335 = 0;
						arg2.method487(var12, 0, field458.field1334);
						field458.field1335 = 0;
						String var18 = GYTJTJWK.method223(var12, field458);
						var18 = KUCFVEDX.method311(var18);
						arg3.field511 = var18;
						arg3.field546 = var10 >> 8;
						arg3.field554 = var10 & 0xFF;
						arg3.field528 = 150;

						if (var11 == 2 || var11 == 3) {
							method155(1, var18, "@cr2@" + arg3.field1187);
						} else if (var11 == 1) {
							method155(1, var18, "@cr1@" + arg3.field1187);
						} else {
							method155(2, var18, arg3.field1187);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field1335 = var12 + var13;
		}

		if ((arg0 & 0x2) != 0) {
			int var20 = arg2.method505();
			if (var20 == 0xFFFF) {
				var20 = -1;
			}

			int var21 = arg2.method497();
			if (arg3.field532 == var20 && var20 != -1) {
				int var22 = HZCWGKOF.field712[var20].field726;
				if (var22 == 1) {
					arg3.field533 = 0;
					arg3.field534 = 0;
					arg3.field535 = var21;
					arg3.field536 = 0;
				}

				if (var22 == 2) {
					arg3.field536 = 0;
				}
			} else if (var20 == -1 || arg3.field532 == -1 || HZCWGKOF.field712[var20].field720 >= HZCWGKOF.field712[arg3.field532].field720) {
				arg3.field532 = var20;
				arg3.field533 = 0;
				arg3.field534 = 0;
				arg3.field535 = var21;
				arg3.field536 = 0;
				arg3.field512 = arg3.field543;
			}
		}

		if ((arg0 & 0x10) != 0) {
			arg3.field511 = arg2.method485();
			if (arg3.field511.charAt(0) == '~') {
				arg3.field511 = arg3.field511.substring(1);
				method155(2, arg3.field511, arg3.field1187);
			} else if (field146 == arg3) {
				method155(2, arg3.field511, arg3.field1187);
			}

			arg3.field546 = 0;
			arg3.field554 = 0;
			arg3.field528 = 150;
		}

		if ((arg0 & 0x400) != 0) {
			int var23 = arg2.method478();
			int var24 = arg2.method478();
			arg3.method181(var24, field287, var23);
			arg3.field508 = field287 + 300;
			arg3.field509 = arg2.method497();
			arg3.field510 = arg2.method497();
		}

		if ((arg0 & 0x200) != 0) {
			arg3.field557 = arg2.method480();
			int var25 = arg2.method512();
			arg3.field561 = var25 >> 16;
			arg3.field560 = (var25 & 0xFFFF) + field287;
			arg3.field558 = 0;
			arg3.field559 = 0;

			if (arg3.field560 > field287) {
				arg3.field558 = -1;
			}

			if (arg3.field557 == 0xFFFF) {
				arg3.field557 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method147() {
		if (!field147 && !field318 && !field288) {
			field287++;

			if (field307) {
				method88();
			} else {
				method86();
			}

			method52();
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method148() {
		Graphics var1 = method73().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method388(1);

		if (field318) {
			field405 = false;
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

		if (field288) {
			field405 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field147) {
			field405 = false;
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

	@ObfuscatedName("client.P(I)V")
	public final void method149() {
		try {
			field391 = -1;
			field270.method203();
			field362.method203();
			JJAEHWOM.method273();
			method80();
			field358.method539();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field82[var1].method514();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field399[var2][var3][var4] = 0;
					}
				}
			}

			SGOFWBIX var5 = new SGOFWBIX(field65, 104, 104, field399);
			int var6 = field76.length;
			field180.method467(126);

			if (!field202) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field139[var7] >> 8) * 64 - field104;
					int var9 = (field139[var7] & 0xFF) * 64 - field105;
					byte[] var10 = field76[var7];
					if (var10 != null) {
						var5.method407(var10, field82, var8, var9, (field237 - 6) * 8, (field236 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field139[var11] >> 8) * 64 - field104;
					int var13 = (field139[var11] & 0xFF) * 64 - field105;
					byte[] var14 = field76[var11];
					if (var14 == null && field237 < 800) {
						var5.method414(var13, 64, 64, var12);
					}
				}

				field363++;
				if (field363 > 133) {
					field363 = 0;
					field180.method467(204);
					field180.method472(0);
				}

				field180.method467(126);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field113[var15];
					if (var16 != null) {
						int var17 = (field139[var15] >> 8) * 64 - field104;
						int var18 = (field139[var15] & 0xFF) * 64 - field105;
						var5.method417(field358, var17, var16, field82, var18);
					}
				}
			}

			if (field202) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field166[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field139.length; var28++) {
									if (field139[var28] == var27 && field76[var28] != null) {
										var5.method418((var25 & 0x7) * 8, var19, var21 * 8, field82, var20 * 8, (var26 & 0x7) * 8, field76[var28], var24, var23);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field166[0][var29][var30];
						if (var31 == -1) {
							var5.method414(var30 * 8, 8, 8, var29 * 8);
						}
					}
				}

				field180.method467(126);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field166[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field139.length; var41++) {
									if (field139[var41] == var40 && field113[var41] != null) {
										var5.method415(field358, field82, var36, (var38 & 0x7) * 8, var34 * 8, field113[var41], var33 * 8, var32, (var39 & 0x7) * 8, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field180.method467(126);
			var5.method416(field82, field358);
			field455.method394();
			field180.method467(126);
			int var42 = SGOFWBIX.field1154;
			if (var42 > field137) {
				var42 = field137;
			}

			if (var42 < field137 - 1) {
				int var43 = field137 - 1;
			}

			if (field201) {
				field358.method540(SGOFWBIX.field1154);
			} else {
				field358.method540(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method156(var44, var45);
				}
			}

			method58();
		} catch (Exception var58) {
		}

		DHQCHKXN.field606.method222();

		if (field1024 != null) {
			field180.method467(22);
			field180.method472(1057001181);
		}

		if (field201 && signlink.cache_dat != null) {
			int var47 = field281.method439(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field281.method458(var48);
				if ((var49 & 0x79) == 0) {
					ITSMSHJO.method237(var48);
				}
			}
		}

		System.gc();
		JJAEHWOM.method274(20);
		field281.method454();
		int var50 = (field236 - 6) / 8 - 1;
		int var51 = (field236 + 6) / 8 + 1;
		int var52 = (field237 - 6) / 8 - 1;
		int var53 = (field237 + 6) / 8 + 1;
		if (field356) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field281.method449(var54, 0, var55);
					if (var56 != -1) {
						field281.method448(3, var56);
					}

					int var57 = field281.method449(var54, 1, var55);
					if (var57 != -1) {
						field281.method448(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method150() {
		for (YRQDGGKN var1 = (YRQDGGKN) field362.method199(); var1 != null; var1 = (YRQDGGKN) field362.method201()) {
			if (field137 != var1.field1402 || field287 > var1.field1388) {
				var1.method195();
			} else if (field287 >= var1.field1387) {
				if (var1.field1405 > 0) {
					AHIOLHWV var2 = field459[var1.field1405 - 1];
					if (var2 != null && var2.field514 >= 0 && var2.field514 < 13312 && var2.field515 >= 0 && var2.field515 < 13312) {
						var1.method535(var2.field515, var2.field514, method65(var2.field515, var1.field1402, var2.field514) - var1.field1401, field287);
					}
				}

				if (var1.field1405 < 0) {
					int var3 = -var1.field1405 - 1;
					TKIWGAGO var4;
					if (field260 == var3) {
						var4 = field146;
					} else {
						var4 = field367[var3];
					}

					if (var4 != null && var4.field514 >= 0 && var4.field514 < 13312 && var4.field515 >= 0 && var4.field515 < 13312) {
						var1.method535(var4.field515, var4.field514, method65(var4.field515, var1.field1402, var4.field514) - var1.field1401, field287);
					}
				}

				var1.method536(field433);
				field358.method550((int) var1.field1393, (int) var1.field1391, var1.field1396, 60, field137, var1, (int) var1.field1392, -1, false);
			}
		}
	}

	@ObfuscatedName("client.a(BIILBFUTXOBU;)V")
	public final void method151(int arg0, int arg1, BFUTXOBU arg2) {
		int var4 = field422 + field285 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = ITSMSHJO.field816[var4];
			int var7 = ITSMSHJO.field817[var4];
			var6 = var6 * 256 / (field108 + 256);
			var7 = var7 * 256 / (field108 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method19(field450, 83 - var9 - arg2.field35 / 2 - 4, var8 + 94 - arg2.field34 / 2 + 4);
			} else {
				arg2.method13(83 - var9 - arg2.field35 / 2 - 4, var8 + 94 - arg2.field34 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method152(int arg0) {
		if (!field201) {
			if (JJAEHWOM.field867[17] >= arg0) {
				YPWLUGYN var2 = JJAEHWOM.field861[17];
				int var3 = var2.field1377 * var2.field1376 - 1;
				int var4 = field433 * var2.field1376 * 2;
				byte[] var5 = var2.field1374;
				byte[] var6 = field98;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1374 = var6;
				field98 = var5;
				JJAEHWOM.method277(17);
				field315++;
				if (field315 > 120) {
					field315 = 0;
					field180.method467(242);
					field180.method471(0x31C98C);
				}
			}

			if (JJAEHWOM.field867[24] >= arg0) {
				YPWLUGYN var8 = JJAEHWOM.field861[24];
				int var9 = var8.field1377 * var8.field1376 - 1;
				int var10 = field433 * var8.field1376 * 2;
				byte[] var11 = var8.field1374;
				byte[] var12 = field98;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1374 = var12;
				field98 = var11;
				JJAEHWOM.method277(24);
			}

			if (JJAEHWOM.field867[34] >= arg0) {
				YPWLUGYN var14 = JJAEHWOM.field861[34];
				int var15 = var14.field1377 * var14.field1376 - 1;
				int var16 = field433 * var14.field1376 * 2;
				byte[] var17 = var14.field1374;
				byte[] var18 = field98;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1374 = var18;
				field98 = var17;
				JJAEHWOM.method277(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method153() {
		field456.method394();
		JJAEHWOM.field859 = field120;
		field451.method533(0, 0);

		if (field448) {
			field445.method370(field136, 239, 0, 40);
			field445.method370(field210 + "*", 239, 128, 60);
		} else if (field407 == 1) {
			field445.method370("Enter amount:", 239, 0, 40);
			field445.method370(field409 + "*", 239, 128, 60);
		} else if (field407 == 2) {
			field445.method370("Enter name:", 239, 0, 40);
			field445.method370(field409 + "*", 239, 128, 60);
		} else if (field195 != null) {
			field445.method370(field195, 239, 0, 40);
			field445.method370("Click to continue", 239, 128, 60);
		} else if (field279 != -1) {
			method87(0, 0, 0, KFCZNNDM.field939[field279]);
		} else if (field345 == -1) {
			NSKCCMMO var1 = field444;
			int var2 = 0;
			KVJNUKIT.method341(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field205[var3] != null) {
					int var4 = field203[var3];
					int var5 = field73 + 70 - var2 * 14;
					String var6 = field204[var3];
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
							var1.method374(var5, field205[var3], 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field477 == 0 || field477 == 1 && method98(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field75[0].method533(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field75[1].method533(var5 - 12, var8);
								var8 += 14;
							}

							var1.method374(var5, var6 + ":", var8, 0);
							var8 += var1.method372(var6) + 8;
							var1.method374(var5, field205[var3], var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field81 == 0 && (var4 == 7 || field360 == 0 || field360 == 1 && method98(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method374(var5, "From", var9, 0);
							int var11 = var9 + var1.method372("From ");
							if (var7 == 1) {
								field75[0].method533(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field75[1].method533(var5 - 12, var11);
								var11 += 14;
							}

							var1.method374(var5, var6 + ":", var11, 0);
							var11 += var1.method372(var6) + 8;
							var1.method374(var5, field205[var3], var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field135 == 0 || field135 == 1 && method98(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method374(var5, var6 + " " + field205[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field81 == 0 && field360 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method374(var5, field205[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field81 == 0 && field360 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method374(var5, "To " + var6 + ":", 4, 0);
							var1.method374(var5, field205[var3], var1.method372("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field135 == 0 || field135 == 1 && method98(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method374(var5, var6 + " " + field205[var3], 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			KVJNUKIT.method340();
			field164 = var2 * 14 + 7;
			if (field164 < 78) {
				field164 = 78;
			}

			method76(field164, 0, 463, field164 - field73 - 77, 77);
			String var10;
			if (field146 == null || field146.field1187 == null) {
				var10 = FYSVECDN.method218(field485);
			} else {
				var10 = field146.field1187;
			}

			var1.method374(90, var10 + ":", 4, 0);
			var1.method374(90, field465 + "*", var1.method372(var10 + ": ") + 6, 255);
			KVJNUKIT.method347(479, 77, 0, 0);
		} else {
			method87(0, 0, 0, KFCZNNDM.field939[field345]);
		}

		if (field475 && field347 == 2) {
			method62();
		}

		field456.method395(field1021, 357, 17);
		field455.method394();
		JJAEHWOM.field859 = field122;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method154(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field291 = "";
				field292 = "Connecting to server...";
				method89(true);
			}

			field145 = new LLYASRTI(method36(field199 + 43594), this);
			long var4 = FYSVECDN.method214(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field180.field1335 = 0;
			field180.method468(14);
			field180.method468(var6);
			field145.method355(0, 2, field180.field1334);

			for (int var7 = 0; var7 < 8; var7++) {
				field145.method352();
			}

			int var8 = field145.method352();
			int var9 = var8;

			if (var8 == 0) {
				field145.method354(field214.field1334, 0, 8);
				field214.field1335 = 0;
				field342 = field214.method484();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field342 >> 32), (int) field342 };
				field180.field1335 = 0;
				field180.method468(10);
				field180.method472(var10[0]);
				field180.method472(var10[1]);
				field180.method472(var10[2]);
				field180.method472(var10[3]);
				field180.method472(signlink.uid);
				field180.method475(arg0);
				field180.method475(arg1);
				field180.method493(field208, field344);
				field74.field1335 = 0;

				if (arg2) {
					field74.method468(18);
				} else {
					field74.method468(16);
				}

				field74.method468(field180.field1335 + 36 + 1 + 1 + 2);
				field74.method468(255);
				field74.method469(313);
				field74.method468(field201 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field74.method472(field290[var11]);
				}

				field74.method476(field180.field1335, 0, field180.field1334);
				field180.field1339 = new XLANGUSV(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field396 = new XLANGUSV(var10);
				field145.method355(0, field74.field1335, field74.field1334);
				var8 = field145.method352();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method154(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field364 = field145.method352();
				field148 = field145.method352() == 1;
				field138 = 0L;
				field469 = 0;
				field152.field1202 = 0;
				field1026 = true;
				field96 = true;
				field307 = true;
				field180.field1335 = 0;
				field214.field1335 = 0;
				field100 = -1;
				field191 = -1;
				field192 = -1;
				field193 = -1;
				field99 = 0;
				field101 = 0;
				field337 = 0;
				field103 = 0;
				field126 = 0;
				field476 = 0;
				field475 = false;
				field1027 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field205[var13] = null;
				}

				field222 = 0;
				field218 = 0;
				field261 = 0;
				field313 = 0;
				field299 = (int) (Math.random() * 100.0D) - 50;
				field339 = (int) (Math.random() * 110.0D) - 55;
				field234 = (int) (Math.random() * 80.0D) - 40;
				field285 = (int) (Math.random() * 120.0D) - 60;
				field108 = (int) (Math.random() * 30.0D) - 20;
				field422 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field143 = 0;
				field391 = -1;
				field254 = 0;
				field255 = 0;
				field368 = 0;
				field460 = 0;

				for (int var14 = 0; var14 < field365; var14++) {
					field367[var14] = null;
					field372[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field459[var15] = null;
				}

				field146 = field367[field366] = new TKIWGAGO();
				field362.method203();
				field270.method203();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field329[var16][var17][var18] = null;
						}
					}
				}

				field320 = new FOKYUBQV();
				field398 = 0;
				field397 = 0;
				field345 = -1;
				field279 = -1;
				field230 = -1;
				field298 = -1;
				field163 = -1;
				field110 = false;
				field94 = 3;
				field407 = 0;
				field475 = false;
				field448 = false;
				field195 = null;
				field416 = 0;
				field168 = -1;
				field346 = true;
				method40();

				for (int var19 = 0; var19 < 5; var19++) {
					field197[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field417[var20] = null;
					field418[var20] = false;
				}

				field134 = 0;
				field194 = 0;
				field142 = 0;
				field381 = 0;
				field133 = 0;
				field484 = 0;
				method119();
			} else if (var8 == 3) {
				field291 = "";
				field292 = "Invalid username or password.";
			} else if (var8 == 4) {
				field291 = "Your account has been disabled.";
				field292 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field291 = "Your account is already logged in.";
				field292 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field291 = "RuneScape has been updated!";
				field292 = "Please reload this page.";
			} else if (var8 == 7) {
				field291 = "This world is full.";
				field292 = "Please use a different world.";
			} else if (var8 == 8) {
				field291 = "Unable to connect.";
				field292 = "Login server offline.";
			} else if (var8 == 9) {
				field291 = "Login limit exceeded.";
				field292 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field291 = "Unable to connect.";
				field292 = "Bad session id.";
			} else if (var8 == 11) {
				field292 = "Login server rejected session.";
				field292 = "Please try again.";
			} else if (var8 == 12) {
				field291 = "You need a members account to login to this world.";
				field292 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field291 = "Could not complete login.";
				field292 = "Please try using a different world.";
			} else if (var8 == 14) {
				field291 = "The server is being updated.";
				field292 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field307 = true;
				field180.field1335 = 0;
				field214.field1335 = 0;
				field100 = -1;
				field191 = -1;
				field192 = -1;
				field193 = -1;
				field99 = 0;
				field101 = 0;
				field337 = 0;
				field476 = 0;
				field475 = false;
				field215 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field291 = "Login attempts exceeded.";
				field292 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field291 = "You are standing in a members-only area.";
				field292 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field291 = "Invalid loginserver requested";
				field292 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field145.method352(); var21 >= 0; var21--) {
					field291 = "You have only just left another world";
					field292 = "Your profile will be transferred in: " + var21 + " seconds";
					method89(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method154(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field291 = "Unexpected server response";
				field292 = "Please try using a different world.";
			} else if (var9 != 0) {
				field291 = "No response from server";
				field292 = "Please try using a different world.";
			} else if (field275 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field275++;
				method154(arg0, arg1, arg2);
			} else {
				field291 = "No response from loginserver";
				field292 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field291 = "";
			field292 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method155(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field345 != -1) {
			field195 = arg1;
			field1035 = 0;
		}

		if (field279 == -1) {
			field79 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field203[var4] = field203[var4 - 1];
			field204[var4] = field204[var4 - 1];
			field205[var4] = field205[var4 - 1];
		}

		field203[0] = arg0;
		field204[0] = arg2;
		field205[0] = arg1;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method156(int arg0, int arg1) {
		FOKYUBQV var3 = field329[field137][arg0][arg1];
		if (var3 == null) {
			field358.method560(field137, arg0, arg1);
		} else {
			int var4 = -99999999;
			NDUHNYJR var5 = null;
			for (NDUHNYJR var6 = (NDUHNYJR) var3.method199(); var6 != null; var6 = (NDUHNYJR) var3.method201()) {
				WKEFMNQD var7 = WKEFMNQD.method437(var6.field993);
				int var8 = var7.field1253;
				if (var7.field1213) {
					var8 = (var6.field994 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method197(var5);
			NDUHNYJR var9 = null;
			NDUHNYJR var10 = null;
			for (NDUHNYJR var11 = (NDUHNYJR) var3.method199(); var11 != null; var11 = (NDUHNYJR) var3.method201()) {
				if (var5.field993 != var11.field993 && var9 == null) {
					var9 = var11;
				}

				if (var5.field993 != var11.field993 && var9.field993 != var11.field993 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field358.method546(method65(arg1 * 128 + 64, field137, arg0 * 128 + 64), var9, var5, arg0, field137, var10, arg1, var12);
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void method157() {
		if (field81 != 0) {
			int var1 = 0;
			if (field337 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field205[var2] != null) {
					int var3 = field203[var2];
					String var4 = field204[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field360 == 0 || field360 == 1 && method98(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1029 > 4 && field1030 - 4 > var8 - 10 && field1030 - 4 <= var8 + 3) {
							int var9 = field444.method372("From:  " + var4 + field205[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1029 < var9 + 4) {
								if (field364 >= 1) {
									field182[field476] = "Report abuse @whi@" + var4;
									field354[field476] = 2218;
									field476++;
								}

								field182[field476] = "Add ignore @whi@" + var4;
								field354[field476] = 2979;
								field476++;
								field182[field476] = "Add friend @whi@" + var4;
								field354[field476] = 2754;
								field476++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field360 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method158(int arg0) {
		if (arg0 >= 0) {
			if (field407 != 0) {
				field407 = 0;
				field79 = true;
			}

			int var2 = field352[arg0];
			int var3 = field353[arg0];
			int var4 = field354[arg0];
			int var5 = field355[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 741) {
				field180.method467(134);
				field180.method503(var3);
				field180.method501(field224);
				field180.method501(var2);
				field180.method469(var5);
				field180.method503(field225);
				field180.method501(field223);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 609) {
				TKIWGAGO var6 = field367[var5];
				if (var6 != null) {
					method45(var6.field545[0], 2, 1, field146.field545[0], 0, var6.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(249);
					field180.method503(field219);
					field180.method503(var5);
				}
			}

			if (var4 == 731 && !field110) {
				field180.method467(65);
				field180.method469(var3);
				field110 = true;
			}

			if (var4 == 690) {
				AHIOLHWV var7 = field459[var5];
				if (var7 != null) {
					method45(var7.field545[0], 2, 1, field146.field545[0], 0, var7.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(137);
					field180.method501(field225);
					field180.method503(field223);
					field180.method501(var5);
					field180.method503(field224);
				}
			}

			if (var4 == 601) {
				field180.method467(208);
				field180.method469(var3);
				field180.method501(var5);
				field180.method469(var2);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 257) {
				TKIWGAGO var8 = field367[var5];
				if (var8 != null) {
					method45(var8.field545[0], 2, 1, field146.field545[0], 0, var8.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field133++;
					if (field133 >= 80) {
						field180.method467(131);
						field133 = 0;
					}

					field180.method467(45);
					field180.method469(var5);
				}
			}

			if (var4 == 294) {
				field134 += var3;
				if (field134 >= 71) {
					field180.method467(233);
					field180.method472(0);
					field134 = 0;
				}

				method94(var3, var5, var2);
				field180.method467(116);
				field180.method502(field105 + var3);
				field180.method503(var5 >> 14 & 0x7FFF);
				field180.method501(field104 + var2);
			}

			if (var4 == 737) {
				AHIOLHWV var9 = field459[var5];
				if (var9 != null) {
					method45(var9.field545[0], 2, 1, field146.field545[0], 0, var9.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(146);
					field180.method501(var5);
				}
			}

			if (var4 == 298) {
				field180.method467(169);
				field180.method502(var5);
				field180.method502(var3);
				field180.method503(var2);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 71) {
				boolean var10 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
				if (!var10) {
					method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
				}

				field186 = field1036;
				field187 = field1037;
				field189 = 2;
				field188 = 0;
				field180.method467(165);
				field180.method469(field105 + var3);
				field180.method502(var5);
				field180.method502(field104 + var2);
			}

			if (var4 == 921) {
				if ((var3 & 0x3) == 0) {
					field194++;
				}

				if (field194 >= 110) {
					field180.method467(23);
					field180.method469(7536);
					field194 = 0;
				}

				field180.method467(107);
				field180.method469(var5);
				field180.method502(var2);
				field180.method501(var3);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 140) {
				AHIOLHWV var12 = field459[var5];
				if (var12 != null) {
					method45(var12.field545[0], 2, 1, field146.field545[0], 0, var12.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(221);
					field180.method469(field219);
					field180.method502(var5);
				}
			}

			if (var4 == 222) {
				field180.method467(100);
				field180.method469(var3);
				KFCZNNDM var13 = KFCZNNDM.field939[var3];
				if (var13.field932 != null && var13.field932[0][0] == 5) {
					int var14 = var13.field932[0][1];
					field327[var14] = 1 - field327[var14];
					method141(var14);
					field438 = true;
				}
			}

			if (var4 == 62) {
				AHIOLHWV var15 = field459[var5];
				if (var15 != null) {
					method45(var15.field545[0], 2, 1, field146.field545[0], 0, var15.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field484++;
					if (field484 >= 94) {
						field180.method467(101);
						field180.method472(0);
						field484 = 0;
					}

					field180.method467(105);
					field180.method502(var5);
				}
			}

			if (var4 == 726) {
				boolean var16 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
				if (!var16) {
					method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
				}

				field186 = field1036;
				field187 = field1037;
				field189 = 2;
				field188 = 0;
				field180.method467(125);
				field180.method502(var5);
				field180.method502(field223);
				field180.method469(field105 + var3);
				field180.method501(field225);
				field180.method469(field104 + var2);
				field180.method469(field224);
			}

			if (var4 == 2) {
				field180.method467(2);
				field180.method501(var3);
				field180.method469(field219);
				field180.method501(var2);
				field180.method502(var5);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 301) {
				boolean var18 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
				if (!var18) {
					method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
				}

				field186 = field1036;
				field187 = field1037;
				field189 = 2;
				field188 = 0;
				field180.method467(68);
				field180.method501(var5);
				field180.method502(field105 + var3);
				field180.method502(field104 + var2);
			}

			if (var4 == 560) {
				boolean var20 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
				if (!var20) {
					method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
				}

				field186 = field1036;
				field187 = field1037;
				field189 = 2;
				field188 = 0;
				field180.method467(216);
				field180.method503(field105 + var3);
				field180.method503(var5);
				field180.method469(field104 + var2);
			}

			if (var4 == 97) {
				field180.method467(253);
				field180.method502(var5);
				field180.method502(var3);
				field180.method469(var2);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 1562) {
				WKEFMNQD var22 = WKEFMNQD.method437(var5);
				KFCZNNDM var23 = KFCZNNDM.field939[var3];
				String var24;
				if (var23 != null && var23.field918[var2] >= 100000) {
					var24 = var23.field918[var2] + " x " + var22.field1219;
				} else if (var22.field1240 == null) {
					var24 = "It's a " + var22.field1219 + ".";
				} else {
					var24 = new String(var22.field1240);
				}

				method155(0, var24, "");
			}

			if (var4 == 1038) {
				WKEFMNQD var25 = WKEFMNQD.method437(var5);
				String var26;
				if (var25.field1240 == null) {
					var26 = "It's a " + var25.field1219 + ".";
				} else {
					var26 = new String(var25.field1240);
				}

				method155(0, var26, "");
			}

			if (var4 == 502 && method94(var3, var5, var2)) {
				field180.method467(27);
				field180.method501(field105 + var3);
				field180.method501(var5 >> 14 & 0x7FFF);
				field180.method501(field219);
				field180.method503(field104 + var2);
			}

			if (var4 == 734 || var4 == 205) {
				String var27 = field182[arg0];
				int var28 = var27.indexOf("@whi@");
				if (var28 != -1) {
					var27 = var27.substring(var28 + 5).trim();
					String var29 = FYSVECDN.method218(FYSVECDN.method215(FYSVECDN.method214(var27)));
					boolean var30 = false;
					for (int var31 = 0; var31 < field368; var31++) {
						TKIWGAGO var32 = field367[field369[var31]];
						if (var32 != null && var32.field1187 != null && var32.field1187.equalsIgnoreCase(var29)) {
							method45(var32.field545[0], 2, 1, field146.field545[0], 0, var32.field544[0], field146.field544[0], 0, false, 0, 1);

							if (var4 == 734) {
								field133++;
								if (field133 >= 80) {
									field180.method467(131);
									field133 = 0;
								}

								field180.method467(45);
								field180.method469(field369[var31]);
							}

							if (var4 == 205) {
								field180.method467(184);
								field180.method501(field369[var31]);
							}

							var30 = true;
							break;
						}
					}

					if (!var30) {
						method155(0, "Unable to find " + var29, "");
					}
				}
			}

			if (var4 == 428) {
				if ((var5 & 0x3) == 0) {
					field381++;
				}

				if (field381 >= 134) {
					field180.method467(56);
					field180.method468(150);
					field381 = 0;
				}

				field180.method467(191);
				field180.method469(var3);
				field180.method501(var5);
				field180.method503(var2);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 754 || var4 == 979 || var4 == 224 || var4 == 817) {
				String var33 = field182[arg0];
				int var34 = var33.indexOf("@whi@");
				if (var34 != -1) {
					long var35 = FYSVECDN.method214(var33.substring(var34 + 5).trim());
					if (var4 == 754) {
						method64(var35);
					}

					if (var4 == 979) {
						method91(var35);
					}

					if (var4 == 224) {
						method43(var35);
					}

					if (var4 == 817) {
						method128(var35);
					}
				}
			}

			if (var4 == 125) {
				AHIOLHWV var37 = field459[var5];
				if (var37 != null) {
					method45(var37.field545[0], 2, 1, field146.field545[0], 0, var37.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(57);
					field180.method501(var5);
				}
			}

			if (var4 == 1579) {
				int var38 = var5 >> 14 & 0x7FFF;
				DHQCHKXN var39 = DHQCHKXN.method194(var38);
				String var40;
				if (var39.field589 == null) {
					var40 = "It's a " + var39.field607 + ".";
				} else {
					var40 = new String(var39.field589);
				}

				method155(0, var40, "");
			}

			if (var4 == 855) {
				field180.method467(40);
				field180.method502(var5);
				field180.method503(var2);
				field180.method469(var3);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 927) {
				KFCZNNDM var41 = KFCZNNDM.field939[var3];
				boolean var42 = true;
				if (var41.field909 > 0) {
					var42 = method38(var41);
				}

				if (var42) {
					field180.method467(100);
					field180.method469(var3);
				}
			}

			if (var4 == 516) {
				method94(var3, var5, var2);
				field180.method467(157);
				field180.method501(var5 >> 14 & 0x7FFF);
				field180.method469(field104 + var2);
				field180.method503(field105 + var3);
			}

			if (var4 == 872) {
				field180.method467(100);
				field180.method469(var3);
				KFCZNNDM var43 = KFCZNNDM.field939[var3];
				if (var43.field932 != null && var43.field932[0][0] == 5) {
					int var44 = var43.field932[0][1];
					if (field327[var44] != var43.field930[0]) {
						field327[var44] = var43.field930[0];
						method141(var44);
						field438 = true;
					}
				}
			}

			if (var4 == 974) {
				method97();
			}

			if (var4 == 1914) {
				AHIOLHWV var45 = field459[var5];
				if (var45 != null) {
					FWGUGZKU var46 = var45.field1;
					if (var46.field675 != null) {
						var46 = var46.method208();
					}

					if (var46 != null) {
						String var47;
						if (var46.field669 == null) {
							var47 = "It's a " + var46.field698 + ".";
						} else {
							var47 = new String(var46.field669);
						}

						method155(0, var47, "");
					}
				}
			}

			if (var4 == 703) {
				AHIOLHWV var48 = field459[var5];
				if (var48 != null) {
					method45(var48.field545[0], 2, 1, field146.field545[0], 0, var48.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(31);
					field180.method469(var5);
				}
			}

			if (var4 == 589) {
				TKIWGAGO var49 = field367[var5];
				if (var49 != null) {
					method45(var49.field545[0], 2, 1, field146.field545[0], 0, var49.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(184);
					field180.method501(var5);
				}
			}

			if (var4 == 1190) {
				method94(var3, var5, var2);
				field180.method467(236);
				field180.method503(field104 + var2);
				field180.method469(field105 + var3);
				field180.method502(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 276) {
				field180.method467(86);
				field180.method501(var5);
				field180.method501(var2);
				field180.method501(var3);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 808) {
				String var50 = field182[arg0];
				int var51 = var50.indexOf("@whi@");
				if (var51 != -1) {
					long var52 = FYSVECDN.method214(var50.substring(var51 + 5).trim());
					int var54 = -1;
					for (int var55 = 0; var55 < field397; var55++) {
						if (field233[var55] == var52) {
							var54 = var55;
							break;
						}
					}

					if (var54 != -1 && field207[var54] > 0) {
						field79 = true;
						field407 = 0;
						field448 = true;
						field210 = "";
						field319 = 3;
						field114 = field233[var54];
						field136 = "Enter message to send to " + field377[var54];
					}
				}
			}

			if (var4 == 532) {
				AHIOLHWV var56 = field459[var5];
				if (var56 != null) {
					method45(var56.field545[0], 2, 1, field146.field545[0], 0, var56.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(88);
					field180.method469(var5);
				}
			}

			if (var4 == 252) {
				if (field475) {
					field358.method577(var3 - 4, var2 - 4);
				} else {
					field358.method577(field1037 - 4, field1036 - 4);
				}
			}

			if (var4 == 996) {
				field180.method467(139);
				field180.method503(var5);
				field180.method503(var2);
				field180.method501(var3);
				field293 = 0;
				field294 = var3;
				field295 = var2;
				field296 = 2;
				if (KFCZNNDM.field939[var3].field884 == field230) {
					field296 = 1;
				}

				if (KFCZNNDM.field939[var3].field884 == field279) {
					field296 = 3;
				}
			}

			if (var4 == 319) {
				TKIWGAGO var57 = field367[var5];
				if (var57 != null) {
					method45(var57.field545[0], 2, 1, field146.field545[0], 0, var57.field544[0], field146.field544[0], 0, false, 0, 1);
					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(30);
					field180.method469(var5);
				}
			}

			if (var4 == 521 && method94(var3, var5, var2)) {
				field180.method467(43);
				field180.method503(var5 >> 14 & 0x7FFF);
				field180.method469(field105 + var3);
				field180.method502(field223);
				field180.method469(field224);
				field180.method469(field225);
				field180.method503(field104 + var2);
			}

			if (var4 == 190) {
				method94(var3, var5, var2);
				field180.method467(93);
				field180.method502(field105 + var3);
				field180.method469(field104 + var2);
				field180.method469(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 237) {
				field222 = 1;
				field223 = var2;
				field224 = var3;
				field225 = var5;
				field226 = WKEFMNQD.method437(var5).field1219;
				field218 = 0;
				field438 = true;
			} else {
				if (var4 == 962) {
					boolean var58 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
					if (!var58) {
						method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
					}

					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(205);
					field180.method503(field105 + var3);
					field180.method503(var5);
					field180.method501(field219);
					field180.method469(field104 + var2);
				}

				if (var4 == 596) {
					boolean var60 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
					if (!var60) {
						method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
					}

					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field142++;
					if (field142 >= 88) {
						field180.method467(115);
						field180.method471(0x6EABAB);
						field142 = 0;
					}

					field180.method467(177);
					field180.method503(field105 + var3);
					field180.method502(field104 + var2);
					field180.method469(var5);
				}

				if (var4 == 154) {
					boolean var62 = method45(var3, 2, 0, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 0);
					if (!var62) {
						method45(var3, 2, 1, field146.field545[0], 0, var2, field146.field544[0], 0, false, 0, 1);
					}

					field186 = field1036;
					field187 = field1037;
					field189 = 2;
					field188 = 0;
					field180.method467(248);
					field180.method503(field104 + var2);
					field180.method469(field105 + var3);
					field180.method501(var5);
				}

				if (var4 == 656) {
					method94(var3, var5, var2);
					field180.method467(17);
					field180.method469(var5 >> 14 & 0x7FFF);
					field180.method503(field104 + var2);
					field180.method469(field105 + var3);
				}

				if (var4 == 657) {
					field180.method467(48);
					field180.method502(var5);
					field180.method501(var3);
					field180.method501(var2);
					field293 = 0;
					field294 = var3;
					field295 = var2;
					field296 = 2;
					if (KFCZNNDM.field939[var3].field884 == field230) {
						field296 = 1;
					}

					if (KFCZNNDM.field939[var3].field884 == field279) {
						field296 = 3;
					}
				}

				if (var4 == 970) {
					TKIWGAGO var64 = field367[var5];
					if (var64 != null) {
						method45(var64.field545[0], 2, 1, field146.field545[0], 0, var64.field544[0], field146.field544[0], 0, false, 0, 1);
						field186 = field1036;
						field187 = field1037;
						field189 = 2;
						field188 = 0;
						field180.method467(246);
						field180.method501(var5);
					}
				}

				if (var4 == 245) {
					TKIWGAGO var65 = field367[var5];
					if (var65 != null) {
						method45(var65.field545[0], 2, 1, field146.field545[0], 0, var65.field544[0], field146.field544[0], 0, false, 0, 1);
						field186 = field1036;
						field187 = field1037;
						field189 = 2;
						field188 = 0;
						field180.method467(39);
						field180.method469(field223);
						field180.method469(var5);
						field180.method469(field224);
						field180.method503(field225);
					}
				}

				if (var4 == 218) {
					String var66 = field182[arg0];
					int var67 = var66.indexOf("@whi@");
					if (var67 != -1) {
						if (field230 == -1) {
							method97();
							field267 = var66.substring(var67 + 5).trim();
							field93 = false;

							for (int var68 = 0; var68 < KFCZNNDM.field939.length; var68++) {
								if (KFCZNNDM.field939[var68] != null && KFCZNNDM.field939[var68].field909 == 600) {
									field277 = field230 = KFCZNNDM.field939[var68].field884;
									break;
								}
							}
						} else {
							method155(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 439) {
					TKIWGAGO var69 = field367[var5];
					if (var69 != null) {
						method45(var69.field545[0], 2, 1, field146.field545[0], 0, var69.field544[0], field146.field544[0], 0, false, 0, 1);
						field186 = field1036;
						field187 = field1037;
						field189 = 2;
						field188 = 0;
						field180.method467(69);
						field180.method469(var5);
					}
				}

				if (var4 == 743) {
					KFCZNNDM var70 = KFCZNNDM.field939[var3];
					field218 = 1;
					field219 = var3;
					field220 = var70.field923;
					field222 = 0;
					field438 = true;
					String var71 = var70.field881;
					if (var71.indexOf(" ") != -1) {
						var71 = var71.substring(0, var71.indexOf(" "));
					}

					String var72 = var70.field881;
					if (var72.indexOf(" ") != -1) {
						var72 = var72.substring(var72.indexOf(" ") + 1);
					}

					field221 = var71 + " " + var70.field900 + " " + var72;

					if (field220 == 16) {
						field438 = true;
						field94 = 3;
						field338 = true;
					}
				} else {
					if (var4 == 652) {
						field180.method467(197);
						field180.method502(var5);
						field180.method503(var3);
						field180.method503(var2);
						field293 = 0;
						field294 = var3;
						field295 = var2;
						field296 = 2;
						if (KFCZNNDM.field939[var3].field884 == field230) {
							field296 = 1;
						}

						if (KFCZNNDM.field939[var3].field884 == field279) {
							field296 = 3;
						}
					}

					field222 = 0;
					field218 = 0;
					field438 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method159(String arg0) throws IOException {
		if (field80) {
			if (field441 != null) {
				try {
					field441.close();
				} catch (Exception var4) {
				}

				field441 = null;
			}

			field441 = method36(43595);
			field441.setSoTimeout(10000);
			InputStream var2 = field441.getInputStream();
			OutputStream var3 = field441.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.T(I)V")
	public final void method160() {
		field405 = false;
		while (field184) {
			field405 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field479 = null;
		field480 = null;
		field283 = null;
		field176 = null;
		field177 = null;
		field178 = null;
		field179 = null;
		field216 = null;
		field217 = null;
		field71 = null;
		field72 = null;
		field323 = null;
		field324 = null;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method161() {
		field454.method394();

		if (field143 == 2) {
			byte[] var1 = field450.field1374;
			int[] var2 = KVJNUKIT.field951;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field144.method17(field181, field273, 33, 0, 25, field422, 0, 25, 256, 33);
			field455.method394();
		} else {
			int var5 = field422 + field285 & 0x7FF;
			int var6 = field146.field514 / 32 + 48;
			int var7 = 464 - field146.field515 / 32;
			field256.method17(field359, field153, 151, 5, var6, var5, 25, var7, field108 + 256, 146);
			field144.method17(field181, field273, 33, 0, 25, field422, 0, 25, 256, 33);

			for (int var8 = 0; var8 < field400; var8++) {
				int var9 = field401[var8] * 4 + 2 - field146.field514 / 32;
				int var10 = field402[var8] * 4 + 2 - field146.field515 / 32;
				method151(var10, var9, field341[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					FOKYUBQV var13 = field329[field137][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field146.field514 / 32;
						int var15 = var12 * 4 + 2 - field146.field515 / 32;
						method151(var15, var14, field427);
					}
				}
			}

			for (int var16 = 0; var16 < field460; var16++) {
				AHIOLHWV var17 = field459[field461[var16]];
				if (var17 != null && var17.method1()) {
					FWGUGZKU var18 = var17.field1;
					if (var18.field675 != null) {
						var18 = var18.method208();
					}

					if (var18 != null && var18.field693 && var18.field682) {
						int var19 = var17.field514 / 32 - field146.field514 / 32;
						int var20 = var17.field515 / 32 - field146.field515 / 32;
						method151(var20, var19, field428);
					}
				}
			}

			for (int var21 = 0; var21 < field368; var21++) {
				TKIWGAGO var22 = field367[field369[var21]];
				if (var22 != null && var22.method1()) {
					int var23 = var22.field514 / 32 - field146.field514 / 32;
					int var24 = var22.field515 / 32 - field146.field515 / 32;
					boolean var25 = false;
					long var26 = FYSVECDN.method214(var22.field1187);
					for (int var28 = 0; var28 < field397; var28++) {
						if (field233[var28] == var26 && field207[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field146.field1188 != 0 && var22.field1188 != 0 && field146.field1188 == var22.field1188) {
						var29 = true;
					}

					if (var25) {
						method151(var24, var23, field430);
					} else if (var29) {
						method151(var24, var23, field431);
					} else {
						method151(var24, var23, field429);
					}
				}
			}

			if (field126 != 0 && field287 % 20 < 10) {
				if (field126 == 1 && field206 >= 0 && field206 < field459.length) {
					AHIOLHWV var30 = field459[field206];
					if (var30 != null) {
						int var31 = var30.field514 / 32 - field146.field514 / 32;
						int var32 = var30.field515 / 32 - field146.field515 / 32;
						method35(var32, field463, var31);
					}
				}

				if (field126 == 2) {
					int var33 = (field115 - field104) * 4 + 2 - field146.field514 / 32;
					int var34 = (field116 - field105) * 4 + 2 - field146.field515 / 32;
					method35(var34, field463, var33);
				}

				if (field126 == 10 && field284 >= 0 && field284 < field367.length) {
					TKIWGAGO var35 = field367[field284];
					if (var35 != null) {
						int var36 = var35.field514 / 32 - field146.field514 / 32;
						int var37 = var35.field515 / 32 - field146.field515 / 32;
						method35(var37, field463, var36);
					}
				}
			}

			if (field254 != 0) {
				int var38 = field254 * 4 + 2 - field146.field514 / 32;
				int var39 = field255 * 4 + 2 - field146.field515 / 32;
				method151(var39, var38, field462);
			}

			KVJNUKIT.method344(3, 0xFFFFFF, 78, 97, 3);
			field455.method394();
		}
	}

	@ObfuscatedName("client.a(IZI)Z")
	public final boolean method162(int arg0, int arg1) {
		boolean var3 = false;
		KFCZNNDM var4 = KFCZNNDM.field939[arg0];
		for (int var5 = 0; var5 < var4.field913.length && var4.field913[var5] != -1; var5++) {
			KFCZNNDM var6 = KFCZNNDM.field939[var4.field913[var5]];
			if (var6.field940 == 1) {
				var3 |= method162(var6.field925, arg1);
			}

			if (var6.field940 == 6 && (var6.field890 != -1 || var6.field891 != -1)) {
				boolean var7 = method50(var6);
				int var8;
				if (var7) {
					var8 = var6.field891;
				} else {
					var8 = var6.field890;
				}

				if (var8 != -1) {
					HZCWGKOF var9 = HZCWGKOF.field712[var8];
					var6.field899 += arg1;
					while (var6.field899 > var9.method227(var6.field926)) {
						var6.field899 -= var9.method227(var6.field926) + 1;
						var6.field926++;
						if (var6.field926 >= var9.field713) {
							var6.field926 -= var9.field717;
							if (var6.field926 < 0 || var6.field926 >= var9.field713) {
								var6.field926 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;)V")
	public final void method163(int arg0, String arg1) {
		field150 = arg0;
		field78 = arg1;
		method59();

		if (field374 == null) {
			super.method163(arg0, arg1);
		} else {
			field156.method394();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field445.method370("RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			KVJNUKIT.method345(304, var3 / 2 - 152, 34, 0x8C1111, var6);
			KVJNUKIT.method345(302, var3 / 2 - 151, 32, 0, var6 + 1);
			KVJNUKIT.method344(arg0 * 3, 0x8C1111, var6 + 2, var3 / 2 - 150, 30);
			KVJNUKIT.method344(300 - arg0 * 3, 0, var6 + 2, arg0 * 3 + (var3 / 2 - 150), 30);
			field445.method370(arg1, var3 / 2, 0xFFFFFF, var4 / 2 + 5 - var5);
			field156.method395(field1021, 171, 202);

			if (field212) {
				field212 = false;

				if (!field405) {
					field157.method395(field1021, 0, 0);
					field158.method395(field1021, 0, 637);
				}

				field154.method395(field1021, 0, 128);
				field155.method395(field1021, 371, 202);
				field159.method395(field1021, 265, 0);
				field160.method395(field1021, 265, 562);
				field161.method395(field1021, 171, 128);
				field162.method395(field1021, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method164() {
		for (int var1 = -1; var1 < field368; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field366;
			} else {
				var2 = field369[var1];
			}

			TKIWGAGO var3 = field367[var2];
			if (var3 != null) {
				method112(1, var3);
			}
		}

		field171++;
		if (field171 > 65) {
			field171 = 0;
			field180.method467(201);
		}
	}

	@ObfuscatedName("client.U(I)Ljava/lang/String;")
	public final String method165() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1024 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method166(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ZILXQPFGONL;)V")
	public final void method167(int arg0, XQPFGONL arg1) {
		while (arg1.field1336 + 10 < arg0 * 8) {
			int var3 = arg1.method489(11);
			if (var3 == 2047) {
				break;
			}

			if (field367[var3] == null) {
				field367[var3] = new TKIWGAGO();
				if (field372[var3] != null) {
					field367[var3].method425(field372[var3]);
				}
			}

			field369[field368++] = var3;
			TKIWGAGO var4 = field367[var3];
			var4.field555 = field287;
			int var5 = arg1.method489(1);
			if (var5 == 1) {
				field371[field370++] = var3;
			}

			int var6 = arg1.method489(1);
			int var7 = arg1.method489(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method489(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method183(field146.field545[0] + var8, field146.field544[0] + var7, var6 == 1);
		}

		arg1.method490();
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public static final String method168(int arg0) {
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

	@ObfuscatedName("client.l(Z)V")
	public final void method169() {
		field453.method394();
		JJAEHWOM.field859 = field121;
		field449.method533(0, 0);

		if (field298 != -1) {
			method87(0, 0, 0, KFCZNNDM.field939[field298]);
		} else if (field276[field94] != -1) {
			method87(0, 0, 0, KFCZNNDM.field939[field276[field94]]);
		}

		if (field475 && field347 == 1) {
			method62();
		}

		field453.method395(field1021, 205, 553);
		field455.method394();
		JJAEHWOM.field859 = field122;
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method170(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field354[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 754) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field358.method565(arg1, arg3, arg2);
		if (var6 != 0) {
			int var7 = field358.method569(arg1, arg3, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field256.field29;
			int var12 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			DHQCHKXN var14 = DHQCHKXN.method194(var13);
			if (var14.field577 == -1) {
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
				YPWLUGYN var15 = field92[var14.field577];
				if (var15 != null) {
					int var16 = (var14.field598 * 4 - var15.field1376) / 2;
					int var17 = (var14.field567 * 4 - var15.field1377) / 2;
					var15.method533((104 - arg2 - var14.field567) * 4 + var17 + 48, arg3 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field358.method567(arg1, arg3, arg2);
		if (var18 != 0) {
			int var19 = field358.method569(arg1, arg3, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			DHQCHKXN var23 = DHQCHKXN.method194(var22);
			if (var23.field577 != -1) {
				YPWLUGYN var24 = field92[var23.field577];
				if (var24 != null) {
					int var25 = (var23.field598 * 4 - var24.field1376) / 2;
					int var26 = (var23.field567 * 4 - var24.field1377) / 2;
					var24.method533((104 - arg2 - var23.field567) * 4 + var26 + 48, arg3 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field256.field29;
				int var29 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field358.method568(arg1, arg3, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			DHQCHKXN var32 = DHQCHKXN.method194(var31);
			if (var32.field577 != -1) {
				YPWLUGYN var33 = field92[var32.field577];
				if (var33 != null) {
					int var34 = (var32.field598 * 4 - var33.field1376) / 2;
					int var35 = (var32.field567 * 4 - var33.field1377) / 2;
					var33.method533((104 - arg2 - var32.field567) * 4 + var35 + 48, arg3 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.V(I)V")
	public final void method172() {
		byte[] var1 = field374.method465("title.dat", null);
		BFUTXOBU var2 = new BFUTXOBU(var1, this);
		field157.method394();
		var2.method11(0, 0);
		field158.method394();
		var2.method11(-637, 0);
		field154.method394();
		var2.method11(-128, 0);
		field155.method394();
		var2.method11(-202, -371);
		field156.method394();
		var2.method11(-202, -171);
		field159.method394();
		var2.method11(0, -265);
		field160.method394();
		var2.method11(-562, -265);
		field161.method394();
		var2.method11(-128, -171);
		field162.method394();
		var2.method11(-562, -171);
		int[] var3 = new int[var2.field30];
		for (int var4 = 0; var4 < var2.field31; var4++) {
			for (int var5 = 0; var5 < var2.field30; var5++) {
				var3[var5] = var2.field29[var2.field30 * var4 + var2.field30 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field30; var6++) {
				var2.field29[var2.field30 * var4 + var6] = var3[var6];
			}
		}

		field157.method394();
		var2.method11(382, 0);
		field158.method394();
		var2.method11(-255, 0);
		field154.method394();
		var2.method11(254, 0);
		field155.method394();
		var2.method11(180, -371);
		field156.method394();
		var2.method11(180, -171);
		field159.method394();
		var2.method11(382, -265);
		field160.method394();
		var2.method11(-180, -265);
		field161.method394();
		var2.method11(254, -171);
		field162.method394();
		var2.method11(-180, -171);
		BFUTXOBU var7 = new BFUTXOBU(field374, "logo", 0);
		field154.method394();
		var7.method13(18, 382 - var7.field30 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(IBI)Ljava/lang/String;")
	public static final String method173(int arg0, int arg1) {
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

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field165[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field289[var3] = var2 / 4;
		}
	}
}
