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
public final class client extends VZUGTFOW {

	@ObfuscatedName("client.K")
	public RZNFVLPG[] field128 = new RZNFVLPG[5];

	@ObfuscatedName("client.L")
	public String field129 = "";

	@ObfuscatedName("client.M")
	public String field130 = "";

	@ObfuscatedName("client.cb")
	public int field144 = 0x766654;

	@ObfuscatedName("client.ib")
	public String field148 = "";

	@ObfuscatedName("client.jb")
	public String field149 = "";

	@ObfuscatedName("client.kb")
	public boolean field150 = false;

	@ObfuscatedName("client.mb")
	public int field152 = 50;

	@ObfuscatedName("client.nb")
	public int[] field153 = new int[field152];

	@ObfuscatedName("client.ob")
	public int[] field154 = new int[field152];

	@ObfuscatedName("client.pb")
	public int[] field155 = new int[field152];

	@ObfuscatedName("client.qb")
	public int[] field156 = new int[field152];

	@ObfuscatedName("client.rb")
	public int[] field157 = new int[field152];

	@ObfuscatedName("client.sb")
	public int[] field158 = new int[field152];

	@ObfuscatedName("client.tb")
	public int[] field159 = new int[field152];

	@ObfuscatedName("client.ub")
	public String[] field160 = new String[field152];

	@ObfuscatedName("client.vb")
	public final int field161 = 100;

	@ObfuscatedName("client.wb")
	public int[] field162 = new int[100];

	@ObfuscatedName("client.Db")
	public boolean field167 = true;

	@ObfuscatedName("client.Eb")
	public boolean field168 = false;

	@ObfuscatedName("client.Nb")
	public int[] field176 = new int[5];

	@ObfuscatedName("client.Ob")
	public int[] field177 = new int[5];

	@ObfuscatedName("client.Ub")
	public boolean field183 = false;

	@ObfuscatedName("client.Vb")
	public int[] field184 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Wb")
	public int[] field185 = new int[50];

	@ObfuscatedName("client.Xb")
	public int[][][] field186 = new int[4][13][13];

	@ObfuscatedName("client.Yb")
	public int[] field187 = new int[2000];

	@ObfuscatedName("client.dc")
	public int field192 = -1;

	@ObfuscatedName("client.fc")
	public IMUIZRAF field194 = IMUIZRAF.method226(1);

	@ObfuscatedName("client.hc")
	public long[] field195 = new long[100];

	@ObfuscatedName("client.jc")
	public YHASUFYG[] field197 = new YHASUFYG[20];

	@ObfuscatedName("client.lc")
	public int[] field198 = new int[50];

	@ObfuscatedName("client.tc")
	public int[] field206 = new int[1000];

	@ObfuscatedName("client.uc")
	public int[] field207 = new int[1000];

	@ObfuscatedName("client.yc")
	public int[] field210 = new int[JSUJDBKH.field792];

	@ObfuscatedName("client.zc")
	public CRC32 field211 = new CRC32();

	@ObfuscatedName("client.Ac")
	public AGTHLVTI[] field212 = new AGTHLVTI[13];

	@ObfuscatedName("client.Cc")
	public IMUIZRAF field213 = IMUIZRAF.method226(1);

	@ObfuscatedName("client.Ec")
	public String field215 = "";

	@ObfuscatedName("client.Fc")
	public YHASUFYG[] field216 = new YHASUFYG[20];

	@ObfuscatedName("client.Hc")
	public byte[] field218 = new byte[16384];

	@ObfuscatedName("client.Kc")
	public boolean field219 = false;

	@ObfuscatedName("client.Rc")
	public int[] field225 = new int[JSUJDBKH.field792];

	@ObfuscatedName("client.Sc")
	public int field226 = -1;

	@ObfuscatedName("client.Tc")
	public String field227 = "";

	@ObfuscatedName("client.cd")
	public volatile boolean field235 = false;

	@ObfuscatedName("client.dd")
	public boolean field236 = false;

	@ObfuscatedName("client.md")
	public IMUIZRAF field243 = new IMUIZRAF(new byte[5000]);

	@ObfuscatedName("client.nd")
	public OTOMPFCI[] field244 = new OTOMPFCI[16384];

	@ObfuscatedName("client.pd")
	public int[] field246 = new int[16384];

	@ObfuscatedName("client.qd")
	public String[] field247 = new String[500];

	@ObfuscatedName("client.sd")
	public int field249 = 1;

	@ObfuscatedName("client.td")
	public String field250 = "";

	@ObfuscatedName("client.ud")
	public PILILDKN[][][] field251 = new PILILDKN[4][104][104];

	@ObfuscatedName("client.Cd")
	public boolean field258 = false;

	@ObfuscatedName("client.Gd")
	public int field262 = 2;

	@ObfuscatedName("client.Id")
	public boolean field264 = true;

	@ObfuscatedName("client.Sd")
	public int[] field274 = new int[5];

	@ObfuscatedName("client.Yd")
	public int field280 = 2;

	@ObfuscatedName("client.ae")
	public int[] field282 = new int[5];

	@ObfuscatedName("client.fe")
	public volatile boolean field287 = false;

	@ObfuscatedName("client.he")
	public SJPORZIF field289 = new SJPORZIF();

	@ObfuscatedName("client.ne")
	public int field294 = 0x23201B;

	@ObfuscatedName("client.pe")
	public int[] field296 = new int[33];

	@ObfuscatedName("client.qe")
	public int[] field297 = new int[100];

	@ObfuscatedName("client.re")
	public String[] field298 = new String[100];

	@ObfuscatedName("client.se")
	public String[] field299 = new String[100];

	@ObfuscatedName("client.te")
	public int[] field300 = new int[5];

	@ObfuscatedName("client.ve")
	public long[] field302 = new long[200];

	@ObfuscatedName("client.we")
	public int field303 = -1;

	@ObfuscatedName("client.ze")
	public boolean field306 = true;

	@ObfuscatedName("client.Ae")
	public String field307 = "";

	@ObfuscatedName("client.De")
	public boolean field310 = true;

	@ObfuscatedName("client.Ge")
	public boolean field313 = false;

	@ObfuscatedName("client.Je")
	public int[] field314 = new int[9];

	@ObfuscatedName("client.Ne")
	public int[] field318 = new int[JSUJDBKH.field792];

	@ObfuscatedName("client.Re")
	public volatile boolean field321 = false;

	@ObfuscatedName("client.Xe")
	public boolean field326 = false;

	@ObfuscatedName("client.Ze")
	public final int[] field327 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.df")
	public int field329 = -1;

	@ObfuscatedName("client.pf")
	public int[] field337 = new int[4000];

	@ObfuscatedName("client.qf")
	public int[] field338 = new int[4000];

	@ObfuscatedName("client.rf")
	public AGTHLVTI[] field339 = new AGTHLVTI[2];

	@ObfuscatedName("client.sf")
	public int field340 = -1;

	@ObfuscatedName("client.tf")
	public int field341 = -1;

	@ObfuscatedName("client.wf")
	public int field344 = -1;

	@ObfuscatedName("client.zf")
	public boolean[] field346 = new boolean[5];

	@ObfuscatedName("client.Af")
	public int[] field347 = new int[50];

	@ObfuscatedName("client.Bf")
	public int[][] field348 = new int[104][104];

	@ObfuscatedName("client.Cf")
	public int[] field349 = new int[256];

	@ObfuscatedName("client.Ff")
	public int field351 = -1;

	@ObfuscatedName("client.Hf")
	public boolean field353 = false;

	@ObfuscatedName("client.Nf")
	public int field358 = 128;

	@ObfuscatedName("client.Tf")
	public YHASUFYG[] field362 = new YHASUFYG[1000];

	@ObfuscatedName("client.Uf")
	public String[] field363 = new String[200];

	@ObfuscatedName("client.Xf")
	public int field365 = -1;

	@ObfuscatedName("client.Zf")
	public boolean field367 = false;

	@ObfuscatedName("client.fg")
	public IMUIZRAF field373 = IMUIZRAF.method226(1);

	@ObfuscatedName("client.kg")
	public PILILDKN field378 = new PILILDKN();

	@ObfuscatedName("client.ng")
	public boolean field381 = false;

	@ObfuscatedName("client.ug")
	public int[] field388 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.wg")
	public int field390 = 78;

	@ObfuscatedName("client.Fg")
	public AGTHLVTI[] field399 = new AGTHLVTI[100];

	@ObfuscatedName("client.Hg")
	public int[] field400 = new int[151];

	@ObfuscatedName("client.Lg")
	public int field404 = -1;

	@ObfuscatedName("client.Qg")
	public String field408 = "";

	@ObfuscatedName("client.Xg")
	public boolean field415 = false;

	@ObfuscatedName("client.ch")
	public YHASUFYG[] field420 = new YHASUFYG[100];

	@ObfuscatedName("client.eh")
	public int[] field422 = new int[1000];

	@ObfuscatedName("client.nh")
	public int field430 = -1;

	@ObfuscatedName("client.oh")
	public PILILDKN field431 = new PILILDKN();

	@ObfuscatedName("client.qh")
	public int[][] field433 = new int[104][104];

	@ObfuscatedName("client.sh")
	public int field435 = 0x4D4233;

	@ObfuscatedName("client.zh")
	public int field442 = 2;

	@ObfuscatedName("client.Bh")
	public boolean field443 = false;

	@ObfuscatedName("client.Ch")
	public String[] field444 = new String[5];

	@ObfuscatedName("client.Dh")
	public boolean[] field445 = new boolean[5];

	@ObfuscatedName("client.Eh")
	public int field446 = 2048;

	@ObfuscatedName("client.Fh")
	public int field447 = 2047;

	@ObfuscatedName("client.Gh")
	public SJUCHLXH[] field448 = new SJUCHLXH[field446];

	@ObfuscatedName("client.Ih")
	public int[] field450 = new int[field446];

	@ObfuscatedName("client.Kh")
	public int[] field452 = new int[field446];

	@ObfuscatedName("client.Lh")
	public IMUIZRAF[] field453 = new IMUIZRAF[field446];

	@ObfuscatedName("client.Nh")
	public boolean field455 = false;

	@ObfuscatedName("client.Th")
	public int[] field461 = new int[200];

	@ObfuscatedName("client.Uh")
	public boolean field462 = true;

	@ObfuscatedName("client.Yh")
	public int[] field466 = new int[151];

	@ObfuscatedName("client.ci")
	public int[] field470 = new int[7];

	@ObfuscatedName("client.fi")
	public boolean field473 = false;

	@ObfuscatedName("client.ni")
	public boolean field480 = false;

	@ObfuscatedName("client.xi")
	public int field490 = 0x332D25;

	@ObfuscatedName("client.yi")
	public WWMUUFBO[] field491 = new WWMUUFBO[4];

	@ObfuscatedName("client.Bi")
	public int field494 = -1;

	@ObfuscatedName("client.Ci")
	public int field495 = -1;

	@ObfuscatedName("client.Di")
	public YHASUFYG[] field496 = new YHASUFYG[8];

	@ObfuscatedName("client.Fi")
	public int[] field497 = new int[500];

	@ObfuscatedName("client.Gi")
	public int[] field498 = new int[500];

	@ObfuscatedName("client.Hi")
	public int[] field499 = new int[500];

	@ObfuscatedName("client.Ii")
	public int[] field500 = new int[500];

	@ObfuscatedName("client.Pi")
	public int[][] field505 = new int[104][104];

	@ObfuscatedName("client.hj")
	public boolean field519 = false;

	@ObfuscatedName("client.ij")
	public boolean field520 = false;

	@ObfuscatedName("client.jj")
	public int[] field521 = new int[2000];

	@ObfuscatedName("client.kj")
	public int field522 = 3;

	@ObfuscatedName("client.tj")
	public int field530 = 1;

	@ObfuscatedName("client.vj")
	public boolean field531 = false;

	@ObfuscatedName("client.wj")
	public int field532 = -1;

	@ObfuscatedName("client.yj")
	public boolean field534 = false;

	@ObfuscatedName("client.Ej")
	public boolean field540 = false;

	@ObfuscatedName("client.Gj")
	public boolean field541 = false;

	@ObfuscatedName("client.Mj")
	public PILILDKN field546 = new PILILDKN();

	@ObfuscatedName("client.Sj")
	public int[] field552 = new int[33];

	@ObfuscatedName("client.Kb")
	public static final int[][] field174 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.jd")
	public static BigInteger field242 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Dd")
	public static int[] field259 = new int[32];

	@ObfuscatedName("client.Td")
	public static int field275 = 10;

	@ObfuscatedName("client.Vd")
	public static boolean field277 = true;

	@ObfuscatedName("client.ag")
	public static String field368 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Yg")
	public static final int[] field416 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.mh")
	public static int[] field429 = new int[99];

	@ObfuscatedName("client.ei")
	public static BigInteger field472 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.J")
	public int field127;

	@ObfuscatedName("client.N")
	public int field131;

	@ObfuscatedName("client.O")
	public int field132;

	@ObfuscatedName("client.P")
	public int field133;

	@ObfuscatedName("client.Q")
	public int field134;

	@ObfuscatedName("client.R")
	public int field135;

	@ObfuscatedName("client.S")
	public int field136;

	@ObfuscatedName("client.T")
	public static int field137;

	@ObfuscatedName("client.U")
	public int field138;

	@ObfuscatedName("client.X")
	public static int field140;

	@ObfuscatedName("client.fb")
	public static int field146;

	@ObfuscatedName("client.lb")
	public int field151;

	@ObfuscatedName("client.yb")
	public static int field164;

	@ObfuscatedName("client.Ab")
	public static int field165;

	@ObfuscatedName("client.Cb")
	public int field166;

	@ObfuscatedName("client.Lb")
	public int field175;

	@ObfuscatedName("client.Pb")
	public int field178;

	@ObfuscatedName("client.Qb")
	public int field179;

	@ObfuscatedName("client.Rb")
	public int field180;

	@ObfuscatedName("client.Sb")
	public int field181;

	@ObfuscatedName("client.Tb")
	public int field182;

	@ObfuscatedName("client.Zb")
	public int field188;

	@ObfuscatedName("client.ac")
	public int field189;

	@ObfuscatedName("client.bc")
	public int field190;

	@ObfuscatedName("client.ec")
	public int field193;

	@ObfuscatedName("client.ic")
	public int field196;

	@ObfuscatedName("client.mc")
	public int field199;

	@ObfuscatedName("client.nc")
	public int field200;

	@ObfuscatedName("client.oc")
	public int field201;

	@ObfuscatedName("client.pc")
	public int field202;

	@ObfuscatedName("client.qc")
	public int field203;

	@ObfuscatedName("client.rc")
	public int field204;

	@ObfuscatedName("client.sc")
	public int field205;

	@ObfuscatedName("client.vc")
	public int field208;

	@ObfuscatedName("client.Dc")
	public int field214;

	@ObfuscatedName("client.Gc")
	public int field217;

	@ObfuscatedName("client.Nc")
	public int field221;

	@ObfuscatedName("client.Oc")
	public int field222;

	@ObfuscatedName("client.Vc")
	public int field229;

	@ObfuscatedName("client.Xc")
	public static int field230;

	@ObfuscatedName("client.Yc")
	public int field231;

	@ObfuscatedName("client.Zc")
	public int field232;

	@ObfuscatedName("client.ad")
	public int field233;

	@ObfuscatedName("client.bd")
	public int field234;

	@ObfuscatedName("client.ed")
	public int field237;

	@ObfuscatedName("client.fd")
	public int field238;

	@ObfuscatedName("client.gd")
	public int field239;

	@ObfuscatedName("client.hd")
	public int field240;

	@ObfuscatedName("client.id")
	public int field241;

	@ObfuscatedName("client.od")
	public int field245;

	@ObfuscatedName("client.rd")
	public int field248;

	@ObfuscatedName("client.xd")
	public static int field254;

	@ObfuscatedName("client.yd")
	public int field255;

	@ObfuscatedName("client.Bd")
	public int field257;

	@ObfuscatedName("client.Ed")
	public int field260;

	@ObfuscatedName("client.Fd")
	public int field261;

	@ObfuscatedName("client.Hd")
	public int field263;

	@ObfuscatedName("client.Ud")
	public static int field276;

	@ObfuscatedName("client.Xd")
	public int field279;

	@ObfuscatedName("client.Zd")
	public static int field281;

	@ObfuscatedName("client.be")
	public int field283;

	@ObfuscatedName("client.ce")
	public static int field284;

	@ObfuscatedName("client.ie")
	public int field290;

	@ObfuscatedName("client.je")
	public int field291;

	@ObfuscatedName("client.ke")
	public int field292;

	@ObfuscatedName("client.le")
	public int field293;

	@ObfuscatedName("client.oe")
	public int field295;

	@ObfuscatedName("client.ue")
	public int field301;

	@ObfuscatedName("client.xe")
	public int field304;

	@ObfuscatedName("client.ye")
	public int field305;

	@ObfuscatedName("client.Be")
	public int field308;

	@ObfuscatedName("client.Ce")
	public int field309;

	@ObfuscatedName("client.Fe")
	public int field312;

	@ObfuscatedName("client.Ke")
	public int field315;

	@ObfuscatedName("client.Le")
	public int field316;

	@ObfuscatedName("client.Me")
	public int field317;

	@ObfuscatedName("client.Oe")
	public static int field319;

	@ObfuscatedName("client.Pe")
	public int field320;

	@ObfuscatedName("client.Se")
	public int field322;

	@ObfuscatedName("client.Ue")
	public int field324;

	@ObfuscatedName("client.Ve")
	public int field325;

	@ObfuscatedName("client.bf")
	public int field328;

	@ObfuscatedName("client.ef")
	public int field330;

	@ObfuscatedName("client.ff")
	public int field331;

	@ObfuscatedName("client.kf")
	public int field332;

	@ObfuscatedName("client.uf")
	public int field342;

	@ObfuscatedName("client.vf")
	public int field343;

	@ObfuscatedName("client.Ef")
	public int field350;

	@ObfuscatedName("client.Gf")
	public static int field352;

	@ObfuscatedName("client.Mf")
	public static int field357;

	@ObfuscatedName("client.Of")
	public int field359;

	@ObfuscatedName("client.Pf")
	public int field360;

	@ObfuscatedName("client.Qf")
	public int field361;

	@ObfuscatedName("client.Wf")
	public int field364;

	@ObfuscatedName("client.jg")
	public static int field377;

	@ObfuscatedName("client.tg")
	public int field387;

	@ObfuscatedName("client.vg")
	public static int field389;

	@ObfuscatedName("client.xg")
	public int field391;

	@ObfuscatedName("client.yg")
	public int field392;

	@ObfuscatedName("client.zg")
	public int field393;

	@ObfuscatedName("client.Ag")
	public int field394;

	@ObfuscatedName("client.Bg")
	public int field395;

	@ObfuscatedName("client.Cg")
	public int field396;

	@ObfuscatedName("client.Dg")
	public int field397;

	@ObfuscatedName("client.Ig")
	public static int field401;

	@ObfuscatedName("client.Jg")
	public int field402;

	@ObfuscatedName("client.Kg")
	public int field403;

	@ObfuscatedName("client.Rg")
	public int field409;

	@ObfuscatedName("client.Sg")
	public int field410;

	@ObfuscatedName("client.Tg")
	public int field411;

	@ObfuscatedName("client.Ug")
	public int field412;

	@ObfuscatedName("client.Vg")
	public int field413;

	@ObfuscatedName("client.Wg")
	public int field414;

	@ObfuscatedName("client.Zg")
	public int field417;

	@ObfuscatedName("client.ah")
	public int field418;

	@ObfuscatedName("client.dh")
	public int field421;

	@ObfuscatedName("client.fh")
	public int field423;

	@ObfuscatedName("client.gh")
	public int field424;

	@ObfuscatedName("client.hh")
	public int field425;

	@ObfuscatedName("client.ih")
	public int field426;

	@ObfuscatedName("client.lh")
	public int field428;

	@ObfuscatedName("client.ph")
	public int field432;

	@ObfuscatedName("client.rh")
	public static int field434;

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

	@ObfuscatedName("client.Hh")
	public int field449;

	@ObfuscatedName("client.Jh")
	public int field451;

	@ObfuscatedName("client.Mh")
	public int field454;

	@ObfuscatedName("client.ai")
	public int field468;

	@ObfuscatedName("client.di")
	public int field471;

	@ObfuscatedName("client.gi")
	public int field474;

	@ObfuscatedName("client.Ai")
	public int field493;

	@ObfuscatedName("client.Ki")
	public int field501;

	@ObfuscatedName("client.Mi")
	public int field502;

	@ObfuscatedName("client.Ni")
	public int field503;

	@ObfuscatedName("client.Si")
	public int field506;

	@ObfuscatedName("client.Ti")
	public int field507;

	@ObfuscatedName("client.Ui")
	public int field508;

	@ObfuscatedName("client.Vi")
	public int field509;

	@ObfuscatedName("client.Wi")
	public int field510;

	@ObfuscatedName("client.Xi")
	public int field511;

	@ObfuscatedName("client.Yi")
	public int field512;

	@ObfuscatedName("client.Zi")
	public int field513;

	@ObfuscatedName("client.aj")
	public int field514;

	@ObfuscatedName("client.bj")
	public int field515;

	@ObfuscatedName("client.fj")
	public int field518;

	@ObfuscatedName("client.lj")
	public int field523;

	@ObfuscatedName("client.sj")
	public int field529;

	@ObfuscatedName("client.zj")
	public int field535;

	@ObfuscatedName("client.Aj")
	public int field536;

	@ObfuscatedName("client.Bj")
	public static int field537;

	@ObfuscatedName("client.Cj")
	public static int field538;

	@ObfuscatedName("client.Dj")
	public int field539;

	@ObfuscatedName("client.Nj")
	public int field547;

	@ObfuscatedName("client.Oj")
	public int field548;

	@ObfuscatedName("client.Pj")
	public int field549;

	@ObfuscatedName("client.Qj")
	public int field550;

	@ObfuscatedName("client.Rj")
	public int field551;

	@ObfuscatedName("client.Mc")
	public long field220;

	@ObfuscatedName("client.Te")
	public long field323;

	@ObfuscatedName("client.Yf")
	public long field366;

	@ObfuscatedName("client.lg")
	public long field379;

	@ObfuscatedName("client.Eg")
	public long field398;

	@ObfuscatedName("client.vd")
	public AGTHLVTI field252;

	@ObfuscatedName("client.wd")
	public AGTHLVTI field253;

	@ObfuscatedName("client.de")
	public AGTHLVTI field285;

	@ObfuscatedName("client.ee")
	public AGTHLVTI field286;

	@ObfuscatedName("client.gg")
	public AGTHLVTI field374;

	@ObfuscatedName("client.hg")
	public AGTHLVTI field375;

	@ObfuscatedName("client.ig")
	public AGTHLVTI field376;

	@ObfuscatedName("client.og")
	public AGTHLVTI field382;

	@ObfuscatedName("client.pg")
	public AGTHLVTI field383;

	@ObfuscatedName("client.qg")
	public AGTHLVTI field384;

	@ObfuscatedName("client.rg")
	public AGTHLVTI field385;

	@ObfuscatedName("client.sg")
	public AGTHLVTI field386;

	@ObfuscatedName("client.Mg")
	public AGTHLVTI field405;

	@ObfuscatedName("client.Ng")
	public AGTHLVTI field406;

	@ObfuscatedName("client.Og")
	public AGTHLVTI field407;

	@ObfuscatedName("client.Oh")
	public AGTHLVTI field456;

	@ObfuscatedName("client.Ph")
	public AGTHLVTI field457;

	@ObfuscatedName("client.Qh")
	public AGTHLVTI field458;

	@ObfuscatedName("client.Rh")
	public AGTHLVTI field459;

	@ObfuscatedName("client.Sh")
	public AGTHLVTI field460;

	@ObfuscatedName("client.Ad")
	public BYZSQZUF field256;

	@ObfuscatedName("client.lf")
	public DIVYVFFL field333;

	@ObfuscatedName("client.mf")
	public DIVYVFFL field334;

	@ObfuscatedName("client.nf")
	public DIVYVFFL field335;

	@ObfuscatedName("client.of")
	public DIVYVFFL field336;

	@ObfuscatedName("client.xf")
	public HUWYSFFT field345;

	@ObfuscatedName("client.bi")
	public LIOYHOWO field469;

	@ObfuscatedName("client.xb")
	public static SJUCHLXH field163;

	@ObfuscatedName("client.Z")
	public SKZHQGHX field141;

	@ObfuscatedName("client.ab")
	public SKZHQGHX field142;

	@ObfuscatedName("client.bb")
	public SKZHQGHX field143;

	@ObfuscatedName("client.Jd")
	public SKZHQGHX field265;

	@ObfuscatedName("client.Kd")
	public SKZHQGHX field266;

	@ObfuscatedName("client.Ld")
	public SKZHQGHX field267;

	@ObfuscatedName("client.Md")
	public SKZHQGHX field268;

	@ObfuscatedName("client.Nd")
	public SKZHQGHX field269;

	@ObfuscatedName("client.Od")
	public SKZHQGHX field270;

	@ObfuscatedName("client.Pd")
	public SKZHQGHX field271;

	@ObfuscatedName("client.Qd")
	public SKZHQGHX field272;

	@ObfuscatedName("client.Rd")
	public SKZHQGHX field273;

	@ObfuscatedName("client.oi")
	public SKZHQGHX field481;

	@ObfuscatedName("client.pi")
	public SKZHQGHX field482;

	@ObfuscatedName("client.qi")
	public SKZHQGHX field483;

	@ObfuscatedName("client.ri")
	public SKZHQGHX field484;

	@ObfuscatedName("client.si")
	public SKZHQGHX field485;

	@ObfuscatedName("client.ti")
	public SKZHQGHX field486;

	@ObfuscatedName("client.ui")
	public SKZHQGHX field487;

	@ObfuscatedName("client.vi")
	public SKZHQGHX field488;

	@ObfuscatedName("client.wi")
	public SKZHQGHX field489;

	@ObfuscatedName("client.Hj")
	public SKZHQGHX field542;

	@ObfuscatedName("client.Ij")
	public SKZHQGHX field543;

	@ObfuscatedName("client.Jj")
	public SKZHQGHX field544;

	@ObfuscatedName("client.Kj")
	public SKZHQGHX field545;

	@ObfuscatedName("client.mg")
	public TDBJVJCU field380;

	@ObfuscatedName("client.If")
	public XAXJBOWU field354;

	@ObfuscatedName("client.Oi")
	public XXDUCPOC field504;

	@ObfuscatedName("client.Fb")
	public YHASUFYG field169;

	@ObfuscatedName("client.Gb")
	public YHASUFYG field170;

	@ObfuscatedName("client.Hb")
	public YHASUFYG field171;

	@ObfuscatedName("client.Ib")
	public YHASUFYG field172;

	@ObfuscatedName("client.Jb")
	public YHASUFYG field173;

	@ObfuscatedName("client.Ee")
	public YHASUFYG field311;

	@ObfuscatedName("client.Kf")
	public YHASUFYG field355;

	@ObfuscatedName("client.Lf")
	public YHASUFYG field356;

	@ObfuscatedName("client.bh")
	public YHASUFYG field419;

	@ObfuscatedName("client.Wh")
	public YHASUFYG field464;

	@ObfuscatedName("client.Xh")
	public YHASUFYG field465;

	@ObfuscatedName("client.dj")
	public YHASUFYG field516;

	@ObfuscatedName("client.ej")
	public YHASUFYG field517;

	@ObfuscatedName("client.xj")
	public YHASUFYG field533;

	@ObfuscatedName("client.cc")
	public String field191;

	@ObfuscatedName("client.xc")
	public String field209;

	@ObfuscatedName("client.jh")
	public String field427;

	@ObfuscatedName("client.nj")
	public String field524;

	@ObfuscatedName("client.Zh")
	public Socket field467;

	@ObfuscatedName("client.eb")
	public static boolean field145;

	@ObfuscatedName("client.Wd")
	public static boolean field278;

	@ObfuscatedName("client.zi")
	public static boolean field492;

	@ObfuscatedName("client.rj")
	public static boolean field528;

	@ObfuscatedName("client.Pc")
	public int[] field223;

	@ObfuscatedName("client.Qc")
	public int[] field224;

	@ObfuscatedName("client.bg")
	public int[] field369;

	@ObfuscatedName("client.cg")
	public int[] field370;

	@ObfuscatedName("client.dg")
	public int[] field371;

	@ObfuscatedName("client.eg")
	public int[] field372;

	@ObfuscatedName("client.hi")
	public int[] field475;

	@ObfuscatedName("client.ii")
	public int[] field476;

	@ObfuscatedName("client.ki")
	public int[] field477;

	@ObfuscatedName("client.li")
	public int[] field478;

	@ObfuscatedName("client.mi")
	public int[] field479;

	@ObfuscatedName("client.oj")
	public int[] field525;

	@ObfuscatedName("client.pj")
	public int[] field526;

	@ObfuscatedName("client.qj")
	public int[] field527;

	@ObfuscatedName("client.Uc")
	public AGTHLVTI[] field228;

	@ObfuscatedName("client.hb")
	public byte[][] field147;

	@ObfuscatedName("client.ge")
	public byte[][] field288;

	@ObfuscatedName("client.Vh")
	public byte[][][] field463;

	@ObfuscatedName("client.V")
	public int[][][] field139;

	@ObfuscatedName("client.a(ILSJPORZIF;)Z")
	public final boolean method33(SJPORZIF arg0) {
		if (arg0.field1042 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1042.length; var2++) {
			int var3 = method41(var2, arg0);
			int var4 = arg0.field1064[var2];
			if (arg0.field1042[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1042[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1042[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method34() {
		field542.method455();
		VRKDWHDQ.field1269 = field526;
		field405.method13(0, 0);

		if (field344 != -1) {
			method131(0, 0, 0, SJPORZIF.field1040[field344]);
		} else if (field388[field522] != -1) {
			method131(0, 0, 0, SJPORZIF.field1040[field388[field522]]);
		}

		if (field455 && field178 == 1) {
			method135();
		}

		field542.method456(553, 205, field1289);
		field544.method455();
		VRKDWHDQ.field1269 = field527;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method35() {
		field252 = new AGTHLVTI(field256, "titlebox", 0);
		field253 = new AGTHLVTI(field256, "titlebutton", 0);
		field228 = new AGTHLVTI[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field228[var2] = new AGTHLVTI(field256, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field228[var3] = new AGTHLVTI(field256, "runes", (var3 & 0x3) + 12);
			}
		}

		field355 = new YHASUFYG(128, 265);
		field356 = new YHASUFYG(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field355.field1450[var4] = field484.field1127[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field356.field1450[var5] = field485.field1127[var5];
		}

		field370 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field370[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field370[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field370[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field370[var9 + 192] = 0xFFFFFF;
		}

		field371 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field371[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field371[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field371[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field371[var13 + 192] = 0xFFFFFF;
		}

		field372 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field372[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field372[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field372[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field372[var17 + 192] = 0xFFFFFF;
		}

		field369 = new int[256];
		field223 = new int[32768];
		field224 = new int[32768];
		method40(null);
		field475 = new int[32768];
		field476 = new int[32768];
		method83(10, "Connecting to fileserver");

		if (!field321) {
			field235 = true;
			field321 = true;
			method36(this, 2);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method36(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method36(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 330);

			if (arg0.length == 5) {
				field275 = Integer.parseInt(arg0[0]);
				field276 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method105();
				} else if (arg0[2].equals("highmem")) {
					method51();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field277 = false;
				} else if (arg0[3].equals("members")) {
					field277 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method511(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(BILYHASUFYG;I)V")
	public final void method37(int arg0, YHASUFYG arg1, int arg2) {
		int var4 = field359 + field279 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = YABPKWWG.field1446[var4];
			int var7 = YABPKWWG.field1447[var4];
			var6 = var6 * 256 / (field248 + 256);
			var7 = var7 * 256 / (field248 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method584(83 - var9 - arg1.field1456 / 2 - 4, field406, var8 + 94 + 4 - arg1.field1455 / 2);
			} else {
				arg1.method578(var8 + 94 + 4 - arg1.field1455 / 2, 83 - var9 - arg1.field1456 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method38() {
		method162();

		if (field234 == 1) {
			field496[field233 / 100].method578(field231 - 8 - 4, field232 - 8 - 4);
		}

		if (field234 == 2) {
			field496[field233 / 100 + 4].method578(field231 - 8 - 4, field232 - 8 - 4);
		}

		if (field340 != -1) {
			method163(field536, field340);
			method131(0, 0, 0, SJPORZIF.field1040[field340]);
		}

		if (field226 != -1) {
			method163(field536, field226);
			method131(0, 0, 0, SJPORZIF.field1040[field226]);
		}

		method70();

		if (!field455) {
			method168();
			method103();
		} else if (field178 == 0) {
			method135();
		}

		if (field523 == 1) {
			field197[1].method578(472, 296);
		}

		if (field528) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1285 < 15) {
				var3 = 0xFF0000;
			}

			field334.method175("Fps:" + field1285, var3, var1, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field278) {
				int var7 = 0xFF0000;
			}

			field334.method175("Mem:" + var5 + "k", 0xFFFF00, var1, var2);
			var2 += 15;
		}

		if (field515 != 0) {
			int var8 = field515 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field334.method180(329, "System update in: " + var9 + ":0" + var8, 4, 0xFFFF00);
			} else {
				field334.method180(329, "System update in: " + var9 + ":" + var8, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(IBIILSJUCHLXH;)V")
	public final void method39(int arg0, int arg1, int arg2, SJUCHLXH arg3) {
		if (field163 != arg3 && field175 < 400) {
			String var5;
			if (arg3.field1126 == 0) {
				var5 = arg3.field1116 + method57(arg3.field1115, field163.field1115) + " (level-" + arg3.field1115 + ")";
			} else {
				var5 = arg3.field1116 + " (skill-" + arg3.field1126 + ")";
			}

			if (field423 == 1) {
				field247[field175] = "Use " + field427 + " with @whi@" + var5;
				field499[field175] = 29;
				field500[field175] = arg1;
				field497[field175] = arg0;
				field498[field175] = arg2;
				field175++;
			} else if (field188 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field444[var6] != null) {
						field247[field175] = field444[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field444[var6].equalsIgnoreCase("attack")) {
							if (arg3.field1115 > field163.field1115) {
								var7 = 2000;
							}

							if (field163.field1104 != 0 && arg3.field1104 != 0) {
								if (field163.field1104 == arg3.field1104) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field445[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field499[field175] = var7 + 409;
						}

						if (var6 == 1) {
							field499[field175] = var7 + 148;
						}

						if (var6 == 2) {
							field499[field175] = var7 + 743;
						}

						if (var6 == 3) {
							field499[field175] = var7 + 540;
						}

						if (var6 == 4) {
							field499[field175] = var7 + 575;
						}

						field500[field175] = arg1;
						field497[field175] = arg0;
						field498[field175] = arg2;
						field175++;
					}
				}
			} else if ((field190 & 0x8) == 8) {
				field247[field175] = field191 + " @whi@" + var5;
				field499[field175] = 313;
				field500[field175] = arg1;
				field497[field175] = arg0;
				field498[field175] = arg2;
				field175++;
			}

			for (int var8 = 0; var8 < field175; var8++) {
				if (field499[var8] == 797) {
					field247[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LAGTHLVTI;Z)V")
	public final void method40(AGTHLVTI arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field223.length; var3++) {
			field223[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field223[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field224[var9] = (field223[var9 - 1] + field223[var9 + 1] + field223[var9 - 128] + field223[var9 + 128]) / 4;
				}
			}

			int[] var10 = field223;
			field223 = field224;
			field224 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field22; var12++) {
				for (int var13 = 0; var13 < arg0.field21; var13++) {
					if (arg0.field19[var11++] != 0) {
						int var14 = var13 + arg0.field23 + 16;
						int var15 = var12 + arg0.field24 + 16;
						int var16 = (var15 << 7) + var14;
						field223[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILSJPORZIF;)I")
	public final int method41(int arg0, SJPORZIF arg1) {
		if (arg1.field1056 == null || arg0 >= arg1.field1056.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1056[arg0];
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
					var8 = field318[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field210[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field225[var3[var5++]];
				}

				if (var7 == 4) {
					SJPORZIF var10 = SJPORZIF.field1040[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < SFKBIDFK.field988 && (!SFKBIDFK.method438(var11).field1023 || field277)) {
						for (int var12 = 0; var12 < var10.field1075.length; var12++) {
							if (var11 + 1 == var10.field1075[var12]) {
								var8 += var10.field1039[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field187[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field429[field210[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field187[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field163.field1115;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < JSUJDBKH.field792; var13++) {
						if (JSUJDBKH.field794[var13]) {
							var8 += field210[var13];
						}
					}
				}

				if (var7 == 10) {
					SJPORZIF var14 = SJPORZIF.field1040[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < SFKBIDFK.field988 && (!SFKBIDFK.method438(var15).field1023 || field277)) {
						for (int var16 = 0; var16 < var14.field1075.length; var16++) {
							if (var14.field1075[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field411;
				}

				if (var7 == 12) {
					var8 = field214;
				}

				if (var7 == 13) {
					int var17 = field187[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					AFWJXAMU var20 = AFWJXAMU.field10[var19];
					int var21 = var20.field12;
					int var22 = var20.field13;
					int var23 = var20.field14;
					int var24 = field259[var23 - var22];
					var8 = field187[var21] >> var22 & var24;
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
					var8 = (field163.field41 >> 7) + field290;
				}

				if (var7 == 19) {
					var8 = (field163.field42 >> 7) + field291;
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

	@ObfuscatedName("client.a(IILIMUIZRAF;)V")
	public final void method42(int arg0, IMUIZRAF arg1) {
		field421 = 0;
		field451 = 0;
		method46(arg0, arg1);
		method133(arg0, arg1);
		method82(arg1, arg0);

		for (int var3 = 0; var3 < field421; var3++) {
			int var4 = field422[var3];
			if (field538 != field244[var4].field69) {
				field244[var4].field894 = null;
				field244[var4] = null;
			}
		}

		if (arg1.field714 != arg0) {
			signlink.reporterror(field129 + " size mismatch in getnpcpos - pos:" + arg1.field714 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field245; var5++) {
			if (field244[field246[var5]] == null) {
				signlink.reporterror(field129 + " null entry in npc list - pos:" + var5 + " size:" + field245);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public void method43() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field332);

		if (field380 != null) {
			System.out.println("Od-cycle:" + field380.field1179);
		}

		System.out.println("loop-cycle:" + field538);
		System.out.println("draw-cycle:" + field389);
		System.out.println("ptype:" + field437);
		System.out.println("psize:" + field436);

		if (field345 != null) {
			field345.method225();
		}

		field1286 = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component method44() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1292 != null) {
			return field1292;
		}

		return this;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method45(boolean arg0) {
		for (int var2 = 0; var2 < field245; var2++) {
			OTOMPFCI var3 = field244[field246[var2]];
			int var4 = (field246[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method21() && var3.field894.field1318 == arg0 && var3.field894.method519()) {
				int var5 = var3.field41 >> 7;
				int var6 = var3.field42 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field30 == 1 && (var3.field41 & 0x7F) == 0x40 && (var3.field42 & 0x7F) == 0x40) {
						if (field348[var5][var6] == field331) {
							continue;
						}

						field348[var5][var6] = field331;
					}

					if (!var3.field894.field1328) {
						var4 += Integer.MIN_VALUE;
					}

					field469.method336(method84(var3.field42, field263, var3.field41), var4, (var3.field30 - 1) * 64 + 60, var3.field41, var3, field263, var3.field42, var3.field43, var3.field29);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLIMUIZRAF;)V")
	public final void method46(int arg0, IMUIZRAF arg1) {
		arg1.method248();
		int var3 = arg1.method249(8);
		if (var3 < field245) {
			for (int var4 = var3; var4 < field245; var4++) {
				field422[field421++] = field246[var4];
			}
		}

		if (var3 > field245) {
			signlink.reporterror(field129 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field245 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field246[var5];
			OTOMPFCI var7 = field244[var6];
			int var8 = arg1.method249(1);
			if (var8 == 0) {
				field246[field245++] = var6;
				var7.field69 = field538;
			} else {
				int var9 = arg1.method249(2);
				if (var9 == 0) {
					field246[field245++] = var6;
					var7.field69 = field538;
					field452[field451++] = var6;
				} else if (var9 == 1) {
					field246[field245++] = var6;
					var7.field69 = field538;
					int var10 = arg1.method249(3);
					var7.method20(false, var10);
					int var11 = arg1.method249(1);
					if (var11 == 1) {
						field452[field451++] = var6;
					}
				} else if (var9 == 2) {
					field246[field245++] = var6;
					var7.field69 = field538;
					int var12 = arg1.method249(3);
					var7.method20(true, var12);
					int var13 = arg1.method249(3);
					var7.method20(true, var13);
					int var14 = arg1.method249(1);
					if (var14 == 1) {
						field452[field451++] = var6;
					}
				} else if (var9 == 3) {
					field422[field421++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILBBWFUJHQ;I)V")
	public final void method47(int arg0, BBWFUJHQ arg1) {
		method48(arg0, arg1.field41, arg1.field42);
	}

	@ObfuscatedName("client.a(IBII)V")
	public final void method48(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method84(arg2, field263, arg1) - arg0;
			arg1 -= field199;
			var4 -= field200;
			arg2 -= field201;
			int var5 = YABPKWWG.field1446[field202];
			int var6 = YABPKWWG.field1447[field202];
			int var7 = YABPKWWG.field1446[field203];
			int var8 = YABPKWWG.field1447[field203];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field494 = (var9 << 9) / arg2 + VRKDWHDQ.field1263;
				field495 = (var11 << 9) / arg2 + VRKDWHDQ.field1264;
			} else {
				field494 = -1;
				field495 = -1;
			}
		} else {
			field494 = -1;
			field495 = -1;
		}
	}

	@ObfuscatedName("client.a(LSJPORZIF;I)Z")
	public final boolean method49(SJPORZIF arg0) {
		int var2 = arg0.field1086;
		if (field512 == 2) {
			if (var2 == 201) {
				field183 = true;
				field432 = 0;
				field367 = true;
				field227 = "";
				field493 = 1;
				field307 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field183 = true;
				field432 = 0;
				field367 = true;
				field227 = "";
				field493 = 2;
				field307 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field440 = 250;
			return true;
		}

		if (var2 == 501) {
			field183 = true;
			field432 = 0;
			field367 = true;
			field227 = "";
			field493 = 4;
			field307 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field183 = true;
			field432 = 0;
			field367 = true;
			field227 = "";
			field493 = 5;
			field307 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field470[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = BDUNOHSG.field84 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= BDUNOHSG.field84) {
							var5 = 0;
						}
					}

					if (!BDUNOHSG.field85[var5].field91 && BDUNOHSG.field85[var5].field86 == var3 + (field264 ? 0 : 7)) {
						break;
					}
				}

				field470[var3] = var5;
				field168 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field300[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field174[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field174[var6].length) {
					var8 = 0;
				}
			}

			field300[var6] = var8;
			field168 = true;
		}

		if (var2 == 324 && !field264) {
			field264 = true;
			method174();
		}

		if (var2 == 325 && field264) {
			field264 = false;
			method174();
		}

		if (var2 == 326) {
			field194.method227(159);
			field194.method228(field264 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field194.method228(field470[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field194.method228(field300[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field353 = !field353;
		}

		if (var2 >= 601 && var2 <= 612) {
			method76();

			if (field215.length() > 0) {
				field194.method227(40);
				field194.method234(JYGZTITV.method318(field215));
				field194.method228(var2 - 601);
				field194.method228(field353 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(LFHZFOSDU;B)V")
	public final void method50(FHZFOSDU arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field621 == 0) {
			var2 = field469.method351(arg0.field620, arg0.field622, arg0.field623);
		}

		if (arg0.field621 == 1) {
			var2 = field469.method352(arg0.field620, arg0.field623, arg0.field622);
		}

		if (arg0.field621 == 2) {
			var2 = field469.method353(arg0.field620, arg0.field622, arg0.field623);
		}

		if (arg0.field621 == 3) {
			var2 = field469.method354(arg0.field620, arg0.field622, arg0.field623);
		}

		if (var2 != 0) {
			int var6 = field469.method355(arg0.field620, arg0.field622, arg0.field623, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field624 = var3;
		arg0.field626 = var4;
		arg0.field625 = var5;
	}

	@ObfuscatedName("client.h(I)V")
	public static final void method51() {
		LIOYHOWO.field805 = false;
		VRKDWHDQ.field1258 = false;
		field278 = false;
		QJLJTPQV.field947 = false;
		PZZVQRQI.field900 = false;
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method52(int arg0) {
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

	@ObfuscatedName("client.a(B)V")
	public final void method53() {
		if (field519 || field326 || field480) {
			method97();
		} else {
			field389++;

			if (field219) {
				method151();
			} else {
				method130(false);
			}

			field518 = 0;
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method54(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field285.method13(arg2, arg4);
		field286.method13(arg2, arg1 + arg4 - 16);
		DSAVPBJG.method196(field294, arg2, 16, arg1 - 32, arg4 + 16);
		int var6 = (arg1 - 32) * arg1 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg3 - arg1);
		DSAVPBJG.method196(field435, arg2, 16, var6, arg4 + var7 + 16);
		DSAVPBJG.method201(arg2, var6, arg4 + var7 + 16, field144);
		DSAVPBJG.method201(arg2 + 1, var6, arg4 + var7 + 16, field144);
		DSAVPBJG.method199(field144, arg2, arg4 + var7 + 16, 16);
		DSAVPBJG.method199(field144, arg2, arg4 + var7 + 17, 16);
		DSAVPBJG.method201(arg2 + 15, var6, arg4 + var7 + 16, field490);
		DSAVPBJG.method201(arg2 + 14, var6 - 1, arg4 + var7 + 17, field490);
		DSAVPBJG.method199(field490, arg2, arg4 + var7 + var6 + 15, 16);
		DSAVPBJG.method199(field490, arg2 + 1, arg4 + 14 + var7 + var6, 15);
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field469.method351(arg3, arg4, arg1);
		if (var6 != 0) {
			int var7 = field469.method355(arg3, arg4, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field419.field1450;
			int var12 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			PZZVQRQI var14 = PZZVQRQI.method398(var13);
			if (var14.field935 == -1) {
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
				AGTHLVTI var15 = field399[var14.field935];
				if (var15 != null) {
					int var16 = (var14.field939 * 4 - var15.field21) / 2;
					int var17 = (var14.field913 * 4 - var15.field22) / 2;
					var15.method13(arg4 * 4 + var16 + 48, (104 - arg1 - var14.field913) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field469.method353(arg3, arg4, arg1);
		if (var18 != 0) {
			int var19 = field469.method355(arg3, arg4, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			PZZVQRQI var23 = PZZVQRQI.method398(var22);
			if (var23.field935 != -1) {
				AGTHLVTI var24 = field399[var23.field935];
				if (var24 != null) {
					int var25 = (var23.field939 * 4 - var24.field21) / 2;
					int var26 = (var23.field913 * 4 - var24.field22) / 2;
					var24.method13(arg4 * 4 + var25 + 48, (104 - arg1 - var23.field913) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field419.field1450;
				int var29 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field469.method354(arg3, arg4, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			PZZVQRQI var32 = PZZVQRQI.method398(var31);
			if (var32.field935 != -1) {
				AGTHLVTI var33 = field399[var32.field935];
				if (var33 != null) {
					int var34 = (var32.field939 * 4 - var33.field21) / 2;
					int var35 = (var32.field913 * 4 - var33.field22) / 2;
					var33.method13(arg4 * 4 + var34 + 48, (104 - arg1 - var32.field913) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String method57(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method58() {
		PZZVQRQI.field918.method527();
		PZZVQRQI.field924.method527();
		WHKCNEXD.field1330.method527();
		SFKBIDFK.field1014.method527();
		SFKBIDFK.field987.method527();
		SJUCHLXH.field1109.method527();
		CIVOPMKV.field126.method527();
	}

	@ObfuscatedName("client.a(ILIMUIZRAF;I)V")
	public final void method59(IMUIZRAF arg0, int arg1) {
		for (int var3 = 0; var3 < field451; var3++) {
			int var4 = field452[var3];
			SJUCHLXH var5 = field448[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x4) != 0) {
				var6 += arg0.method238() << 8;
			}

			method119(arg0, var5, var6, var4);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method60() {
		if (field278 && field196 == 2 && QJLJTPQV.field959 != field263) {
			field544.method455();
			field334.method176(151, 0, 257, "Loading - please wait.");
			field334.method176(150, 0xFFFFFF, 256, "Loading - please wait.");
			field544.method456(4, 4, field1289);
			field196 = 1;
			field398 = System.currentTimeMillis();
		}

		if (field196 == 1) {
			int var1 = method61();
			if (var1 != 0 && System.currentTimeMillis() - field398 > 360000L) {
				signlink.reporterror(field129 + " glcfb " + field366 + "," + var1 + "," + field278 + "," + field128[0] + "," + field380.method472() + "," + field263 + "," + field402 + "," + field403);
				field398 = System.currentTimeMillis();
			}
		}

		if (field196 == 2 && field365 != field263) {
			field365 = field263;
			method114(field263);
		}
	}

	@ObfuscatedName("client.c(Z)I")
	public final int method61() {
		for (int var1 = 0; var1 < field147.length; var1++) {
			if (field147[var1] == null && field478[var1] != -1) {
				return -1;
			}

			if (field288[var1] == null && field479[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field147.length; var3++) {
			byte[] var4 = field288[var3];
			if (var4 != null) {
				int var5 = (field477[var3] >> 8) * 64 - field290;
				int var6 = (field477[var3] & 0xFF) * 64 - field291;
				if (field541) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= QJLJTPQV.method407(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field443) {
			return -4;
		} else {
			field196 = 2;
			QJLJTPQV.field959 = field263;
			method128();
			field194.method227(231);
			return 0;
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method62(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field511; var2++) {
			if (arg0.equalsIgnoreCase(field363[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field163.field1116)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method63(int arg0) {
		int var2 = SXXYSOJW.field1159[arg0].field1167;
		if (var2 != 0) {
			int var3 = field187[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					VRKDWHDQ.method503(0.9D);
				}

				if (var3 == 2) {
					VRKDWHDQ.method503(0.8D);
				}

				if (var3 == 3) {
					VRKDWHDQ.method503(0.7D);
				}

				if (var3 == 4) {
					VRKDWHDQ.method503(0.6D);
				}

				SFKBIDFK.field987.method527();
				field540 = true;
			}

			if (var2 == 3) {
				boolean var4 = field167;

				if (var3 == 0) {
					method153(field167, 0);
					field167 = true;
				}

				if (var3 == 1) {
					method153(field167, -400);
					field167 = true;
				}

				if (var3 == 2) {
					method153(field167, -800);
					field167 = true;
				}

				if (var3 == 3) {
					method153(field167, -1200);
					field167 = true;
				}

				if (var3 == 4) {
					field167 = false;
				}

				if (field167 != var4 && !field278) {
					if (field167) {
						field305 = field329;
						field306 = true;
						field380.method469(2, field305);
					} else {
						method99();
					}

					field193 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field310 = true;
					method102(0);
				}

				if (var3 == 1) {
					field310 = true;
					method102(-400);
				}

				if (var3 == 2) {
					field310 = true;
					method102(-800);
				}

				if (var3 == 3) {
					field310 = true;
					method102(-1200);
				}

				if (var3 == 4) {
					field310 = false;
				}
			}

			if (var2 == 5) {
				field322 = var3;
			}

			if (var2 == 6) {
				field397 = var3;
			}

			if (var2 == 8) {
				field295 = var3;
				field183 = true;
			}

			if (var2 == 9) {
				field208 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method64() {
		if (field440 > 0) {
			method166();
		} else {
			field544.method455();
			field334.method176(144, 0, 257, "Connection lost");
			field334.method176(143, 0xFFFFFF, 256, "Connection lost");
			field334.method176(159, 0, 257, "Please wait - attempting to reestablish");
			field334.method176(158, 0xFFFFFF, 256, "Please wait - attempting to reestablish");
			field544.method456(4, 4, field1289);
			field325 = 0;
			field417 = 0;
			HUWYSFFT var1 = field345;
			field219 = false;
			field320 = 0;
			method109(field129, field130, true);

			if (!field219) {
				method166();
			}

			try {
				var1.method220();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BLSJPORZIF;)V")
	public final void method65(SJPORZIF arg0) {
		int var2 = arg0.field1086;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field512 == 0) {
				arg0.field1041 = "Loading friend list";
				arg0.field1047 = 0;
			} else if (var2 == 1 && field512 == 1) {
				arg0.field1041 = "Connecting to friendserver";
				arg0.field1047 = 0;
			} else if (var2 == 2 && field512 != 2) {
				arg0.field1041 = "Please wait...";
				arg0.field1047 = 0;
			} else {
				int var3 = field511;
				if (field512 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1041 = "";
					arg0.field1047 = 0;
				} else {
					arg0.field1041 = field363[var2];
					arg0.field1047 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field511;
			if (field512 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1041 = "";
				arg0.field1047 = 0;
			} else {
				if (field461[var2] == 0) {
					arg0.field1041 = "@red@Offline";
				} else if (field461[var2] < 200) {
					if (field461[var2] == field275) {
						arg0.field1041 = "@gre@World-" + (field461[var2] - 9);
					} else {
						arg0.field1041 = "@yel@World-" + (field461[var2] - 9);
					}
				} else if (field461[var2] == field275) {
					arg0.field1041 = "@gre@Classic" + (field461[var2] - 219);
				} else {
					arg0.field1041 = "@yel@Classic" + (field461[var2] - 219);
				}

				arg0.field1047 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field511;
			if (field512 != 2) {
				var5 = 0;
			}

			arg0.field1037 = var5 * 15 + 20;
			if (arg0.field1037 <= arg0.field1085) {
				arg0.field1037 = arg0.field1085 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field512 == 0) {
				arg0.field1041 = "Loading ignore list";
				arg0.field1047 = 0;
			} else if (var2 == 1 && field512 == 0) {
				arg0.field1041 = "Please wait...";
				arg0.field1047 = 0;
			} else {
				int var6 = field391;
				if (field512 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1041 = "";
					arg0.field1047 = 0;
				} else {
					arg0.field1041 = JYGZTITV.method322(JYGZTITV.method319(field195[var2]));
					arg0.field1047 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1037 = field391 * 15 + 20;
			if (arg0.field1037 <= arg0.field1085) {
				arg0.field1037 = arg0.field1085 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1053 = 150;
			arg0.field1054 = (int) (Math.sin(field538 / 40.0D) * 256.0D) & 0x7FF;

			if (field168) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field470[var7];
					if (var8 >= 0 && !BDUNOHSG.field85[var8].method24()) {
						return;
					}
				}

				field168 = false;
				YABPKWWG[] var9 = new YABPKWWG[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field470[var11];
					if (var12 >= 0) {
						var9[var10++] = BDUNOHSG.field85[var12].method25();
					}
				}

				YABPKWWG var13 = new YABPKWWG(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field300[var14] != 0) {
						var13.method562(field174[var14][0], field174[var14][field300[var14]]);

						if (var14 == 1) {
							var13.method562(field416[0], field416[field300[var14]]);
						}
					}
				}

				var13.method555();
				var13.method556(ZKWMIVTX.field1461[field163.field78].field1463[0]);
				var13.method565(64, 850, -30, -50, -30, true);
				arg0.field1061 = 5;
				arg0.field1062 = 0;
				SJPORZIF.method451(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field516 == null) {
				field516 = arg0.field1095;
				field517 = arg0.field1082;
			}

			if (field264) {
				arg0.field1095 = field517;
			} else {
				arg0.field1095 = field516;
			}
		} else if (var2 == 325) {
			if (field516 == null) {
				field516 = arg0.field1095;
				field517 = arg0.field1082;
			}

			if (field264) {
				arg0.field1095 = field516;
			} else {
				arg0.field1095 = field517;
			}
		} else if (var2 == 600) {
			arg0.field1041 = field215;
			if (field538 % 20 < 10) {
				arg0.field1041 = arg0.field1041 + "|";
			} else {
				arg0.field1041 = arg0.field1041 + " ";
			}
		} else if (var2 == 613) {
			if (field204 < 1) {
				arg0.field1041 = "";
			} else if (field353) {
				arg0.field1051 = 0xFF0000;
				arg0.field1041 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1051 = 0xFFFFFF;
				arg0.field1041 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field217 == 0) {
				arg0.field1041 = "";
			} else {
				String var15;
				if (field350 == 0) {
					var15 = "earlier today";
				} else if (field350 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field350 + " days ago";
				}

				arg0.field1041 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field301 == 0) {
				arg0.field1041 = "0 unread messages";
				arg0.field1051 = 0xFFFF00;
			}

			if (field301 == 1) {
				arg0.field1041 = "1 unread message";
				arg0.field1051 = 0xFF00;
			}

			if (field301 > 1) {
				arg0.field1041 = field301 + " unread messages";
				arg0.field1051 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field260 == 201) {
				if (field255 == 1) {
					arg0.field1041 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1041 = "";
				}
			} else if (field260 == 200) {
				arg0.field1041 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field260 == 0) {
					var16 = "Earlier today";
				} else if (field260 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field260 + " days ago";
				}

				arg0.field1041 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field260 == 201) {
				if (field255 == 1) {
					arg0.field1041 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1041 = "";
				}
			} else if (field260 == 200) {
				arg0.field1041 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1041 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field260 == 201) {
				if (field255 == 1) {
					arg0.field1041 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1041 = "";
				}
			} else if (field260 == 200) {
				arg0.field1041 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1041 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method66(long arg0) {
		if (arg0 != 0L) {
			if (field391 >= 100) {
				method125(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = JYGZTITV.method322(JYGZTITV.method319(arg0));
				for (int var4 = 0; var4 < field391; var4++) {
					if (field195[var4] == arg0) {
						method125(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field511; var5++) {
					if (field302[var5] == arg0) {
						method125(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field195[field391++] = arg0;
				field520 = true;
				field194.method227(235);
				field194.method234(arg0);
			}
		}
	}

	@ObfuscatedName("client.e(Z)I")
	public final int method67() {
		int var1 = 3;
		if (field202 < 310) {
			int var2 = field199 >> 7;
			int var3 = field201 >> 7;
			int var4 = field163.field41 >> 7;
			int var5 = field163.field42 >> 7;

			if ((field463[field263][var2][var3] & 0x4) != 0) {
				var1 = field263;
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

					if ((field463[field263][var2][var3] & 0x4) != 0) {
						var1 = field263;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field463[field263][var2][var3] & 0x4) != 0) {
							var1 = field263;
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

					if ((field463[field263][var2][var3] & 0x4) != 0) {
						var1 = field263;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field463[field263][var2][var3] & 0x4) != 0) {
							var1 = field263;
						}
					}
				}
			}
		}

		if ((field463[field263][field163.field41 >> 7][field163.field42 >> 7] & 0x4) != 0) {
			var1 = field263;
		}

		return var1;
	}

	@ObfuscatedName("client.d(B)I")
	public final int method68() {
		int var1 = method84(field201, field263, field199);
		if (var1 - field200 < 800 && (field463[field263][field199 >> 7][field201 >> 7] & 0x4) != 0) {
			return field263;
		}

		return 3;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method69() {
		int var1 = field335.method178("Choose Option");
		for (int var2 = 0; var2 < field175; var2++) {
			int var3 = field335.method178(field247[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field175 * 15 + 21;
		if (field1304 > 4 && field1305 > 4 && field1304 < 516 && field1305 < 338) {
			int var5 = field1304 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1305 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field455 = true;
			field178 = 0;
			field179 = var5;
			field180 = var6;
			field181 = var1;
			field182 = field175 * 15 + 22;
		}

		if (field1304 > 553 && field1305 > 205 && field1304 < 743 && field1305 < 466) {
			int var7 = field1304 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1305 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field455 = true;
			field178 = 1;
			field179 = var7;
			field180 = var8;
			field181 = var1;
			field182 = field175 * 15 + 22;
		}

		if (field1304 > 17 && field1305 > 357 && field1304 < 496 && field1305 < 453) {
			int var9 = field1304 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1305 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field455 = true;
			field178 = 2;
			field179 = var9;
			field180 = var10;
			field181 = var1;
			field182 = field175 * 15 + 22;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method70() {
		field501 = 0;
		int var1 = (field163.field41 >> 7) + field290;
		int var2 = (field163.field42 >> 7) + field291;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field501 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field501 = 1;
		}

		if (field501 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field501 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIBIIIII)V")
	public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		FHZFOSDU var10 = null;
		for (FHZFOSDU var11 = (FHZFOSDU) field378.method382(); var11 != null; var11 = (FHZFOSDU) field378.method384()) {
			if (var11.field620 == arg0 && var11.field622 == arg7 && var11.field623 == arg3 && var11.field621 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new FHZFOSDU();
			var10.field620 = arg0;
			var10.field621 = arg5;
			var10.field622 = arg7;
			var10.field623 = arg3;
			method50(var10);
			field378.method379(var10);
		}

		var10.field627 = arg1;
		var10.field629 = arg4;
		var10.field628 = arg8;
		var10.field631 = arg6;
		var10.field630 = arg2;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method72() {
		if (field1303 == 1) {
			if (field1304 >= 6 && field1304 <= 106 && field1305 >= 467 && field1305 <= 499) {
				field364 = (field364 + 1) % 4;
				field150 = true;
				field183 = true;
				field194.method227(112);
				field194.method228(field364);
				field194.method228(field454);
				field194.method228(field428);
			}

			if (field1304 >= 135 && field1304 <= 235 && field1305 >= 467 && field1305 <= 499) {
				field454 = (field454 + 1) % 3;
				field150 = true;
				field183 = true;
				field194.method227(112);
				field194.method228(field364);
				field194.method228(field454);
				field194.method228(field428);
			}

			if (field1304 >= 273 && field1304 <= 373 && field1305 >= 467 && field1305 <= 499) {
				field428 = (field428 + 1) % 3;
				field150 = true;
				field183 = true;
				field194.method227(112);
				field194.method228(field364);
				field194.method228(field454);
				field194.method228(field428);
			}

			if (field1304 >= 412 && field1304 <= 512 && field1305 >= 467 && field1305 <= 499) {
				if (field226 == -1) {
					method76();
					field215 = "";
					field353 = false;

					for (int var1 = 0; var1 < SJPORZIF.field1040.length; var1++) {
						if (SJPORZIF.field1040[var1] != null && SJPORZIF.field1040[var1].field1086 == 600) {
							field430 = field226 = SJPORZIF.field1040[var1].field1049;
							break;
						}
					}
				} else {
					method125(0, "", "Please close the interface you have open before using 'report abuse'");
				}
			}

			field165++;
			if (field165 > 1463) {
				field165 = 0;
				field194.method227(79);
				field194.method228(0);
				int var2 = field194.field714;

				if ((int) (Math.random() * 2.0D) == 0) {
					field194.method229(31213);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field194.method229(17777);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field194.method229(29378);
				}

				field194.method229(63715);
				field194.method228((int) (Math.random() * 256.0D));
				field194.method228(38);
				field194.method229(31503);
				field194.method228(5);
				field194.method228((int) (Math.random() * 256.0D));
				field194.method228((int) (Math.random() * 256.0D));
				field194.method237(field194.field714 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method73(int arg0) {
		if (!field278) {
			if (VRKDWHDQ.field1277[17] >= arg0) {
				AGTHLVTI var2 = VRKDWHDQ.field1271[17];
				int var3 = var2.field22 * var2.field21 - 1;
				int var4 = field536 * var2.field21 * 2;
				byte[] var5 = var2.field19;
				byte[] var6 = field218;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field19 = var6;
				field218 = var5;
				VRKDWHDQ.method501(17);
				field401++;
				if (field401 > 57) {
					field401 = 0;
					field194.method227(16);
				}
			}

			if (VRKDWHDQ.field1277[24] >= arg0) {
				AGTHLVTI var8 = VRKDWHDQ.field1271[24];
				int var9 = var8.field22 * var8.field21 - 1;
				int var10 = field536 * var8.field21 * 2;
				byte[] var11 = var8.field19;
				byte[] var12 = field218;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field19 = var12;
				field218 = var11;
				VRKDWHDQ.method501(24);
			}

			if (VRKDWHDQ.field1277[34] >= arg0) {
				AGTHLVTI var14 = VRKDWHDQ.field1271[34];
				int var15 = var14.field22 * var14.field21 - 1;
				int var16 = field536 * var14.field21 * 2;
				byte[] var17 = var14.field19;
				byte[] var18 = field218;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field19 = var18;
				field218 = var17;
				VRKDWHDQ.method501(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method74(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.e(B)V")
	public final void method75() {
		short var1 = 256;

		if (field221 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field221 > 768) {
					field369[var2] = method124(field371[var2], field370[var2], 1024 - field221);
				} else if (field221 > 256) {
					field369[var2] = field371[var2];
				} else {
					field369[var2] = method124(field370[var2], field371[var2], 256 - field221);
				}
			}
		} else if (field222 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field222 > 768) {
					field369[var3] = method124(field372[var3], field370[var3], 1024 - field222);
				} else if (field222 > 256) {
					field369[var3] = field372[var3];
				} else {
					field369[var3] = method124(field370[var3], field372[var3], 256 - field222);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field369[var4] = field370[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field484.field1127[var5] = field355.field1450[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field349[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field475[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field369[var12];
					int var15 = field484.field1127[var7];
					field484.field1127[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field484.method456(0, 0, field1289);

		for (int var16 = 0; var16 < 33920; var16++) {
			field485.field1127[var16] = field356.field1450[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field349[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field475[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field369[var23];
					int var26 = field485.field1127[var18];
					field485.field1127[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field485.method456(637, 0, field1289);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method76() {
		field194.method227(169);

		if (field344 != -1) {
			field344 = -1;
			field520 = true;
			field258 = false;
			field313 = true;
		}

		if (field192 != -1) {
			field192 = -1;
			field183 = true;
			field258 = false;
		}

		field226 = -1;
	}

	@ObfuscatedName("client.c(III)V")
	public final void method77(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field299[var4] != null) {
				int var5 = field297[var4];
				int var6 = field409 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field298[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field364 == 0 || field364 == 1 && method62(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field163.field1116)) {
						if (field204 >= 1) {
							field247[field175] = "Report abuse @whi@" + var7;
							field499[field175] = 629;
							field175++;
						}

						field247[field175] = "Add ignore @whi@" + var7;
						field499[field175] = 51;
						field175++;
						field247[field175] = "Add friend @whi@" + var7;
						field499[field175] = 79;
						field175++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field295 == 0 && (var5 == 7 || field454 == 0 || field454 == 1 && method62(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field204 >= 1) {
							field247[field175] = "Report abuse @whi@" + var7;
							field499[field175] = 629;
							field175++;
						}

						field247[field175] = "Add ignore @whi@" + var7;
						field499[field175] = 51;
						field175++;
						field247[field175] = "Add friend @whi@" + var7;
						field499[field175] = 79;
						field175++;
					}

					var3++;
				}

				if (var5 == 4 && (field428 == 0 || field428 == 1 && method62(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field247[field175] = "Accept trade @whi@" + var7;
						field499[field175] = 457;
						field175++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field295 == 0 && field454 < 2) {
					var3++;
				}

				if (var5 == 8 && (field428 == 0 || field428 == 1 && method62(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field247[field175] = "Accept challenge @whi@" + var7;
						field499[field175] = 502;
						field175++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZZIIIIII)Z")
	public final boolean method78(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field505[var14][var15] = 0;
				field433[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg2;
		field505[arg1][arg2] = 99;
		field433[arg1][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field337[var18] = arg1;
		int var35 = var18 + 1;
		field338[var18] = arg2;
		boolean var20 = false;
		int var21 = field337.length;
		int[][] var22 = field491[field263].field1361;
		while (var35 != var19) {
			var16 = field337[var19];
			var17 = field338[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg6 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field491[field263].method537(arg7, arg0 - 1, arg3, var17, var16, arg6)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field491[field263].method538(arg0 - 1, arg7, arg6, arg3, var17, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg10 != 0 && field491[field263].method539(arg10, arg8, arg9, arg7, var17, arg6, var16)) {
				var20 = true;
				break;
			}

			int var23 = field433[var16][var17] + 1;
			if (var16 > 0 && field505[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field337[var35] = var16 - 1;
				field338[var35] = var17;
				var35 = (var35 + 1) % var21;
				field505[var16 - 1][var17] = 2;
				field433[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field505[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field337[var35] = var16 + 1;
				field338[var35] = var17;
				var35 = (var35 + 1) % var21;
				field505[var16 + 1][var17] = 8;
				field433[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field505[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field337[var35] = var16;
				field338[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field505[var16][var17 - 1] = 1;
				field433[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field505[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field337[var35] = var16;
				field338[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field505[var16][var17 + 1] = 4;
				field433[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field505[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field337[var35] = var16 - 1;
				field338[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field505[var16 - 1][var17 - 1] = 3;
				field433[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field505[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field337[var35] = var16 + 1;
				field338[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field505[var16 + 1][var17 - 1] = 9;
				field433[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field505[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field337[var35] = var16 - 1;
				field338[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field505[var16 - 1][var17 + 1] = 6;
				field433[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field505[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field337[var35] = var16 + 1;
				field338[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field505[var16 + 1][var17 + 1] = 12;
				field433[var16 + 1][var17 + 1] = var23;
			}
		}

		field535 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg6 - var25; var27 <= arg6 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field433[var26][var27] < var24) {
								var24 = field433[var26][var27];
								var16 = var26;
								var17 = var27;
								field535 = 1;
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
		field337[var28] = var16;
		int var36 = var28 + 1;
		field338[var28] = var17;
		int var29;
		int var30 = var29 = field505[var16][var17];
		while (arg1 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field337[var36] = var16;
				field338[var36++] = var17;
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

			var30 = field505[var16][var17];
		}

		if (var36 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field337[var36];
		int var33 = field338[var36];

		if (arg5 == 0) {
			field194.method227(58);
			field194.method228(var31 + var31 + 3);
		}

		if (arg5 == 1) {
			field194.method227(21);
			field194.method228(var31 + var31 + 3 + 14);
		}

		if (arg5 == 2) {
			field194.method227(221);
			field194.method228(var31 + var31 + 3);
		}

		field194.method262(field290 + var32);
		field194.method255(field1307[5] == 1 ? 1 : 0);
		field417 = field337[0];
		field418 = field338[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field194.method228(field337[var36] - var32);
			field194.method254(field338[var36] - var33);
		}

		field194.method262(field291 + var33);
		return true;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg0 >= 1 && arg5 <= 102 && arg0 <= 102) {
			if (field278 && field263 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field469.method351(arg1, arg5, arg0);
			}

			if (arg6 == 1) {
				var8 = field469.method352(arg1, arg0, arg5);
			}

			if (arg6 == 2) {
				var8 = field469.method353(arg1, arg5, arg0);
			}

			if (arg6 == 3) {
				var8 = field469.method354(arg1, arg5, arg0);
			}

			if (var8 != 0) {
				int var12 = field469.method355(arg1, arg5, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field469.method342(arg1, arg0, arg5);
					PZZVQRQI var16 = PZZVQRQI.method398(var13);
					if (var16.field943) {
						field491[arg1].method533(var16.field936, var15, arg5, var14, arg0);
					}
				}

				if (arg6 == 1) {
					field469.method343(arg0, arg1, arg5);
				}

				if (arg6 == 2) {
					field469.method344(arg0, arg1, arg5);
					PZZVQRQI var17 = PZZVQRQI.method398(var13);
					if (var17.field939 + arg5 > 103 || var17.field939 + arg0 > 103 || var17.field913 + arg5 > 103 || var17.field913 + arg0 > 103) {
						return;
					}

					if (var17.field943) {
						field491[arg1].method534(arg5, var17.field913, arg0, var15, var17.field939, var17.field936);
					}
				}

				if (arg6 == 3) {
					field469.method345(arg5, arg1, arg0);
					PZZVQRQI var18 = PZZVQRQI.method398(var13);
					if (var18.field943 && var18.field928) {
						field491[arg1].method536(arg0, arg5);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field463[1][arg5][arg0] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				QJLJTPQV.method417(arg5, field139, var19, arg3, field491[arg1], arg2, arg0, arg4, arg1, field469);
				return;
			}
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method80(byte[] arg0, boolean arg1) {
		if (field167) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(LYHASUFYG;III)V")
	public final void method81(YHASUFYG arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field359 + field279 & 0x7FF;
			int var6 = YABPKWWG.field1446[var5];
			int var7 = YABPKWWG.field1447[var5];
			var6 = var6 * 256 / (field248 + 256);
			var7 = var7 * 256 / (field248 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field533.method583(var12 + 94 + 4 - 10, 20, var10, 15, 15, 256, 20, 83 - var13 - 20);
		} else {
			method37(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.a(LIMUIZRAF;IZ)V")
	public final void method82(IMUIZRAF arg0, int arg1) {
		for (int var3 = 0; var3 < field451; var3++) {
			int var4 = field452[var3];
			OTOMPFCI var5 = field244[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x2) != 0) {
				var5.field45 = arg0.method266();
				var5.field46 = arg0.method240();
			}

			if ((var6 & 0x4) != 0) {
				int var7 = arg0.method259();
				int var8 = arg0.method238();
				var5.method18(var8, field538, var7);
				var5.field80 = field538 + 300;
				var5.field81 = arg0.method238();
				var5.field82 = arg0.method238();
			}

			if ((var6 & 0x1) != 0) {
				var5.field66 = arg0.method245();
				var5.field48 = 100;
			}

			if ((var6 & 0x40) != 0) {
				var5.field894 = WHKCNEXD.method521(arg0.method265());
				var5.field30 = var5.field894.field1343;
				var5.field60 = var5.field894.field1323;
				var5.field62 = var5.field894.field1315;
				var5.field63 = var5.field894.field1327;
				var5.field64 = var5.field894.field1333;
				var5.field65 = var5.field894.field1319;
				var5.field78 = var5.field894.field1317;
			}

			if ((var6 & 0x20) != 0) {
				var5.field70 = arg0.method240();
				int var9 = arg0.method271();
				var5.field74 = var9 >> 16;
				var5.field73 = (var9 & 0xFFFF) + field538;
				var5.field71 = 0;
				var5.field72 = 0;

				if (var5.field73 > field538) {
					var5.field71 = -1;
				}

				if (var5.field70 == 0xFFFF) {
					var5.field70 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field36 = arg0.method266();
				if (var5.field36 == 0xFFFF) {
					var5.field36 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg0.method267();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method259();
				if (var5.field31 == var10 && var10 != -1) {
					int var12 = ZKWMIVTX.field1461[var10].field1475;
					if (var12 == 1) {
						var5.field32 = 0;
						var5.field33 = 0;
						var5.field34 = var11;
						var5.field35 = 0;
					}

					if (var12 == 2) {
						var5.field35 = 0;
					}
				} else if (var10 == -1 || var5.field31 == -1 || ZKWMIVTX.field1461[var10].field1469 >= ZKWMIVTX.field1461[var5.field31].field1469) {
					var5.field31 = var10;
					var5.field32 = 0;
					var5.field33 = 0;
					var5.field34 = var11;
					var5.field35 = 0;
					var5.field49 = var5.field67;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg0.method258();
				int var14 = arg0.method257();
				var5.method18(var14, field538, var13);
				var5.field80 = field538 + 300;
				var5.field81 = arg0.method259();
				var5.field82 = arg0.method258();
			}
		}
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;)V")
	public final void method83(int arg0, String arg1) {
		field387 = arg0;
		field524 = arg1;
		method121();

		if (field256 == null) {
			super.method83(arg0, arg1);
		} else {
			field483.method455();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field335.method176(var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			DSAVPBJG.method197(var6, 304, var3 / 2 - 152, 34, 0x8C1111);
			DSAVPBJG.method197(var6 + 1, 302, var3 / 2 - 151, 32, 0);
			DSAVPBJG.method196(0x8C1111, var3 / 2 - 150, arg0 * 3, 30, var6 + 2);
			DSAVPBJG.method196(0, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 30, var6 + 2);
			field335.method176(var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2, arg1);
			field483.method456(202, 171, field1289);

			if (field540) {
				field540 = false;

				if (!field321) {
					field484.method456(0, 0, field1289);
					field485.method456(637, 0, field1289);
				}

				field481.method456(128, 0, field1289);
				field482.method456(202, 371, field1289);
				field486.method456(0, 265, field1289);
				field487.method456(562, 265, field1289);
				field488.method456(128, 171, field1289);
				field489.method456(562, 171, field1289);
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method84(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field463[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field139[var6][var4][var5] + field139[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field139[var6][var4][var5 + 1] + field139[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IZZLSJPORZIF;IIIII)V")
	public final void method85(int arg0, boolean arg1, SJPORZIF arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field381) {
			field283 = 32;
		} else {
			field283 = 0;
		}

		field381 = false;
		if (arg6 >= arg5 && arg6 < arg5 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
			arg2.field1084 -= field518 * 4;

			if (arg1) {
				field520 = true;
				return;
			}
		} else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg7 >= arg0 + arg3 - 16 && arg7 < arg0 + arg3) {
			arg2.field1084 += field518 * 4;

			if (arg1) {
				field520 = true;
				return;
			}
		} else if (arg6 >= arg5 - field283 && arg6 < arg5 + field283 + 16 && arg7 >= arg3 + 16 && arg7 < arg0 + arg3 - 16 && field518 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg4;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg3 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg2.field1084 = (arg4 - arg0) * var10 / var11;

			if (arg1) {
				field520 = true;
			}

			field381 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method86() {
		for (int var1 = -1; var1 < field449; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field447;
			} else {
				var2 = field450[var1];
			}

			SJUCHLXH var3 = field448[var2];
			if (var3 != null && var3.field48 > 0) {
				var3.field48--;
				if (var3.field48 == 0) {
					var3.field66 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field245; var4++) {
			int var5 = field246[var4];
			OTOMPFCI var6 = field244[var5];
			if (var6 != null && var6.field48 > 0) {
				var6.field48--;
				if (var6.field48 == 0) {
					var6.field66 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method87(long arg0) {
		if (arg0 != 0L) {
			if (field511 >= 100 && field471 != 1) {
				method125(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field511 >= 200) {
				method125(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = JYGZTITV.method322(JYGZTITV.method319(arg0));
				for (int var4 = 0; var4 < field511; var4++) {
					if (field302[var4] == arg0) {
						method125(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field391; var5++) {
					if (field195[var5] == arg0) {
						method125(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field163.field1116)) {
					field363[field511] = var3;
					field302[field511] = arg0;
					field461[field511] = 0;
					field511++;
					field520 = true;
					field194.method227(22);
					field194.method234(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method88() {
		if (field468 == 0) {
			int var1 = field1287 / 2 - 80;
			int var2 = field1288 / 2 + 20;
			var2 += 20;
			if (field1303 == 1 && field1304 >= var1 - 75 && field1304 <= var1 + 75 && field1305 >= var2 - 20 && field1305 <= var2 + 20) {
				field468 = 3;
				field138 = 0;
			}

			int var3 = field1287 / 2 + 80;
			if (field1303 == 1 && field1304 >= var3 - 75 && field1304 <= var3 + 75 && field1305 >= var2 - 20 && field1305 <= var2 + 20) {
				field148 = "";
				field149 = "Enter your username & password.";
				field468 = 2;
				field138 = 0;
			}
		} else if (field468 == 2) {
			int var4 = field1288 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1303 == 1 && field1305 >= var4 - 15 && field1305 < var4) {
				field138 = 0;
			}

			var4 += 15;
			if (field1303 == 1 && field1305 >= var4 - 15 && field1305 < var4) {
				field138 = 1;
			}

			var4 += 15;
			int var5 = field1287 / 2 - 80;
			int var6 = field1288 / 2 + 50;
			var6 += 20;
			if (field1303 == 1 && field1304 >= var5 - 75 && field1304 <= var5 + 75 && field1305 >= var6 - 20 && field1305 <= var6 + 20) {
				field320 = 0;
				method109(field129, field130, false);

				if (field219) {
					return;
				}
			}

			int var7 = field1287 / 2 + 80;
			if (field1303 == 1 && field1304 >= var7 - 75 && field1304 <= var7 + 75 && field1305 >= var6 - 20 && field1305 <= var6 + 20) {
				field468 = 0;
				field129 = "";
				field130 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method515();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field368.length(); var10++) {
					if (var8 == field368.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field138 == 0) {
					if (var8 == 8 && field129.length() > 0) {
						field129 = field129.substring(0, field129.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field138 = 1;
					}

					if (var9) {
						field129 = field129 + (char) var8;
					}

					if (field129.length() > 12) {
						field129 = field129.substring(0, 12);
					}
				} else if (field138 == 1) {
					if (var8 == 8 && field130.length() > 0) {
						field130 = field130.substring(0, field130.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field138 = 0;
					}

					if (var9) {
						field130 = field130 + (char) var8;
					}

					if (field130.length() > 20) {
						field130 = field130.substring(0, 20);
					}
				}
			}
		} else if (field468 == 3) {
			int var11 = field1287 / 2;
			int var12 = field1288 / 2 + 50;
			var12 += 20;
			if (field1303 == 1 && field1304 >= var11 - 75 && field1304 <= var11 + 75 && field1305 >= var12 - 20 && field1305 <= var12 + 20) {
				field468 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method89() {
		byte[] var1 = field256.method29("title.dat", null);
		YHASUFYG var2 = new YHASUFYG(var1, this);
		field484.method455();
		var2.method576(0, 0);
		field485.method455();
		var2.method576(-637, 0);
		field481.method455();
		var2.method576(-128, 0);
		field482.method455();
		var2.method576(-202, -371);
		field483.method455();
		var2.method576(-202, -171);
		field486.method455();
		var2.method576(0, -265);
		field487.method455();
		var2.method576(-562, -265);
		field488.method455();
		var2.method576(-128, -171);
		field489.method455();
		var2.method576(-562, -171);
		int[] var3 = new int[var2.field1451];
		for (int var4 = 0; var4 < var2.field1452; var4++) {
			for (int var5 = 0; var5 < var2.field1451; var5++) {
				var3[var5] = var2.field1450[var2.field1451 * var4 + var2.field1451 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1451; var6++) {
				var2.field1450[var2.field1451 * var4 + var6] = var3[var6];
			}
		}

		field484.method455();
		var2.method576(382, 0);
		field485.method455();
		var2.method576(-255, 0);
		field481.method455();
		var2.method576(254, 0);
		field482.method455();
		var2.method576(180, -371);
		field483.method455();
		var2.method576(180, -171);
		field486.method455();
		var2.method576(382, -265);
		field487.method455();
		var2.method576(-180, -265);
		field488.method455();
		var2.method576(254, -171);
		field489.method455();
		var2.method576(-180, -171);
		YHASUFYG var7 = new YHASUFYG(field256, "logo", 0);
		field481.method455();
		var7.method578(382 - var7.field1451 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.p(I)V")
	public final void method90() {
		int var1 = 5;
		field314[8] = 0;
		int var2 = 0;
		while (field314[8] == 0) {
			String var3 = "Unknown problem";
			method83(20, "Connecting to web server");

			try {
				DataInputStream var4 = method167("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 330);
				IMUIZRAF var5 = new IMUIZRAF(new byte[40]);
				var4.readFully(var5.field713, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field314[var6] = var5.method243();
				}

				int var7 = var5.method243();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field314[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field314[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field314[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field314[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field314[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field314[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method83(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method83(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field236 = !field236;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method91(int arg0, int arg1) {
		PILILDKN var3 = field251[field263][arg0][arg1];
		if (var3 == null) {
			field469.method346(field263, arg0, arg1);
		} else {
			int var4 = -99999999;
			SIBDNEIR var5 = null;
			for (SIBDNEIR var6 = (SIBDNEIR) var3.method382(); var6 != null; var6 = (SIBDNEIR) var3.method384()) {
				SFKBIDFK var7 = SFKBIDFK.method438(var6.field1034);
				int var8 = var7.field1013;
				if (var7.field1020) {
					var8 = (var6.field1033 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method380(var5);
			SIBDNEIR var9 = null;
			SIBDNEIR var10 = null;
			for (SIBDNEIR var11 = (SIBDNEIR) var3.method382(); var11 != null; var11 = (SIBDNEIR) var3.method384()) {
				if (var5.field1034 != var11.field1034 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1034 != var11.field1034 && var9.field1034 != var11.field1034 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field469.method332(var9, field263, method84(arg1 * 128 + 64, field263, arg0 * 128 + 64), var12, arg1, var5, var10, arg0);
		}
	}

	@ObfuscatedName("client.a(IILWHKCNEXD;II)V")
	public final void method92(int arg0, WHKCNEXD arg1, int arg2, int arg3) {
		if (field175 < 400) {
			if (arg1.field1332 != null) {
				arg1 = arg1.method518();
			}

			if (arg1 != null && arg1.field1328) {
				String var5 = arg1.field1331;
				if (arg1.field1322 != 0) {
					var5 = var5 + method57(arg1.field1322, field163.field1115) + " (level-" + arg1.field1322 + ")";
				}

				if (field423 == 1) {
					field247[field175] = "Use " + field427 + " with @yel@" + var5;
					field499[field175] = 124;
					field500[field175] = arg2;
					field497[field175] = arg0;
					field498[field175] = arg3;
					field175++;
				} else if (field188 != 1) {
					if (arg1.field1347 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1347[var6] != null && !arg1.field1347[var6].equalsIgnoreCase("attack")) {
								field247[field175] = arg1.field1347[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field499[field175] = 17;
								}

								if (var6 == 1) {
									field499[field175] = 507;
								}

								if (var6 == 2) {
									field499[field175] = 215;
								}

								if (var6 == 3) {
									field499[field175] = 919;
								}

								if (var6 == 4) {
									field499[field175] = 216;
								}

								field500[field175] = arg2;
								field497[field175] = arg0;
								field498[field175] = arg3;
								field175++;
							}
						}
					}

					if (arg1.field1347 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1347[var7] != null && arg1.field1347[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1322 > field163.field1115) {
									var8 = 2000;
								}

								field247[field175] = arg1.field1347[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field499[field175] = var8 + 17;
								}

								if (var7 == 1) {
									field499[field175] = var8 + 507;
								}

								if (var7 == 2) {
									field499[field175] = var8 + 215;
								}

								if (var7 == 3) {
									field499[field175] = var8 + 919;
								}

								if (var7 == 4) {
									field499[field175] = var8 + 216;
								}

								field500[field175] = arg2;
								field497[field175] = arg0;
								field498[field175] = arg3;
								field175++;
							}
						}
					}

					field247[field175] = "Examine @yel@" + var5;
					field499[field175] = 1159;
					field500[field175] = arg2;
					field497[field175] = arg0;
					field498[field175] = arg3;
					field175++;
				} else if ((field190 & 0x2) == 2) {
					field247[field175] = field191 + " @yel@" + var5;
					field499[field175] = 53;
					field500[field175] = arg2;
					field497[field175] = arg0;
					field498[field175] = arg3;
					field175++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method93() {
		if (field423 == 0 && field188 == 0) {
			field247[field175] = "Walk here";
			field499[field175] = 797;
			field497[field175] = field1297;
			field498[field175] = field1298;
			field175++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < YABPKWWG.field1444; var2++) {
			int var3 = YABPKWWG.field1445[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field469.method355(field263, var4, var5, var3) >= 0) {
					PZZVQRQI var8 = PZZVQRQI.method398(var7);
					if (var8.field915 != null) {
						var8 = var8.method402();
					}

					if (var8 == null) {
						continue;
					}

					if (field423 == 1) {
						field247[field175] = "Use " + field427 + " with @cya@" + var8.field930;
						field499[field175] = 748;
						field500[field175] = var3;
						field497[field175] = var4;
						field498[field175] = var5;
						field175++;
					} else if (field188 != 1) {
						if (var8.field926 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field926[var9] != null) {
									field247[field175] = var8.field926[var9] + " @cya@" + var8.field930;

									if (var9 == 0) {
										field499[field175] = 314;
									}

									if (var9 == 1) {
										field499[field175] = 217;
									}

									if (var9 == 2) {
										field499[field175] = 139;
									}

									if (var9 == 3) {
										field499[field175] = 693;
									}

									if (var9 == 4) {
										field499[field175] = 1963;
									}

									field500[field175] = var3;
									field497[field175] = var4;
									field498[field175] = var5;
									field175++;
								}
							}
						}

						field247[field175] = "Examine @cya@" + var8.field930;
						field499[field175] = 1619;
						field500[field175] = var8.field927 << 14;
						field497[field175] = var4;
						field498[field175] = var5;
						field175++;
					} else if ((field190 & 0x4) == 4) {
						field247[field175] = field191 + " @cya@" + var8.field930;
						field499[field175] = 749;
						field500[field175] = var3;
						field497[field175] = var4;
						field498[field175] = var5;
						field175++;
					}
				}

				if (var6 == 1) {
					OTOMPFCI var10 = field244[var7];
					if (var10.field894.field1343 == 1 && (var10.field41 & 0x7F) == 0x40 && (var10.field42 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field245; var11++) {
							OTOMPFCI var12 = field244[field246[var11]];
							if (var12 != null && var10 != var12 && var12.field894.field1343 == 1 && var10.field41 == var12.field41 && var10.field42 == var12.field42) {
								method92(var4, var12.field894, field246[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field449; var13++) {
							SJUCHLXH var14 = field448[field450[var13]];
							if (var14 != null && var10.field41 == var14.field41 && var10.field42 == var14.field42) {
								method39(var4, field450[var13], var5, var14);
							}
						}
					}

					method92(var4, var10.field894, var7, var5);
				}

				if (var6 == 0) {
					SJUCHLXH var15 = field448[var7];
					if ((var15.field41 & 0x7F) == 0x40 && (var15.field42 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field245; var16++) {
							OTOMPFCI var17 = field244[field246[var16]];
							if (var17 != null && var17.field894.field1343 == 1 && var15.field41 == var17.field41 && var15.field42 == var17.field42) {
								method92(var4, var17.field894, field246[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field449; var18++) {
							SJUCHLXH var19 = field448[field450[var18]];
							if (var19 != null && var15 != var19 && var15.field41 == var19.field41 && var15.field42 == var19.field42) {
								method39(var4, field450[var18], var5, var19);
							}
						}
					}

					method39(var4, var7, var5, var15);
				}

				if (var6 == 3) {
					PILILDKN var20 = field251[field263][var4][var5];
					if (var20 != null) {
						for (SIBDNEIR var21 = (SIBDNEIR) var20.method383(); var21 != null; var21 = (SIBDNEIR) var20.method385()) {
							SFKBIDFK var22 = SFKBIDFK.method438(var21.field1034);
							if (field423 == 1) {
								field247[field175] = "Use " + field427 + " with @lre@" + var22.field990;
								field499[field175] = 567;
								field500[field175] = var21.field1034;
								field497[field175] = var4;
								field498[field175] = var5;
								field175++;
							} else if (field188 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1017 != null && var22.field1017[var23] != null) {
										field247[field175] = var22.field1017[var23] + " @lre@" + var22.field990;

										if (var23 == 0) {
											field499[field175] = 464;
										}

										if (var23 == 1) {
											field499[field175] = 6;
										}

										if (var23 == 2) {
											field499[field175] = 263;
										}

										if (var23 == 3) {
											field499[field175] = 348;
										}

										if (var23 == 4) {
											field499[field175] = 482;
										}

										field500[field175] = var21.field1034;
										field497[field175] = var4;
										field498[field175] = var5;
										field175++;
									} else if (var23 == 2) {
										field247[field175] = "Take @lre@" + var22.field990;
										field499[field175] = 263;
										field500[field175] = var21.field1034;
										field497[field175] = var4;
										field498[field175] = var5;
										field175++;
									}
								}

								field247[field175] = "Examine @lre@" + var22.field990;
								field499[field175] = 1334;
								field500[field175] = var21.field1034;
								field497[field175] = var4;
								field498[field175] = var5;
								field175++;
							} else if ((field190 & 0x1) == 1) {
								field247[field175] = field191 + " @lre@" + var22.field990;
								field499[field175] = 862;
								field500[field175] = var21.field1034;
								field497[field175] = var4;
								field498[field175] = var5;
								field175++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method94(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field391; var3++) {
				if (field195[var3] == arg0) {
					field391--;
					field520 = true;

					for (int var4 = var3; var4 < field391; var4++) {
						field195[var4] = field195[var4 + 1];
					}

					field194.method227(33);
					field194.method234(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;IZI)LBYZSQZUF;")
	public final BYZSQZUF method95(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field128[0] != null) {
				var6 = field128[0].method427(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field211.reset();
			field211.update(var6);
			int var8 = (int) field211.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new BYZSQZUF(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method83(arg0, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method167(arg1 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				IMUIZRAF var16 = new IMUIZRAF(var15);
				var16.field714 = 3;
				int var17 = var16.method242() + 6;
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
						method83(arg0, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field128[0] != null) {
						field128[0].method428(arg4, var6.length, var6);
					}
				} catch (Exception var28) {
					field128[0] = null;
				}

				if (var6 != null) {
					field211.reset();
					field211.update(var6);
					int var23 = (int) field211.getValue();
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
						method83(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method83(arg0, var11 + " - Retrying in " + var25);
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

				field236 = !field236;
			}
		}

		return new BYZSQZUF(var6);
	}

	@ObfuscatedName("client.e(I)V")
	public final void method96() {
		field540 = true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method97() {
		Graphics var1 = method44().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method514(1);

		if (field326) {
			field321 = false;
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

		if (field480) {
			field321 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field519) {
			field321 = false;
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

	public final void run() {
		if (field235) {
			method161();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method98() {
		for (OPRNYJBH var1 = (OPRNYJBH) field431.method382(); var1 != null; var1 = (OPRNYJBH) field431.method384()) {
			if (field263 != var1.field875 || field538 > var1.field887) {
				var1.method540();
			} else if (field538 >= var1.field886) {
				if (var1.field872 > 0) {
					OTOMPFCI var2 = field244[var1.field872 - 1];
					if (var2 != null && var2.field41 >= 0 && var2.field41 < 13312 && var2.field42 >= 0 && var2.field42 < 13312) {
						var1.method376(var2.field41, var2.field42, field538, method84(var2.field42, var1.field875, var2.field41) - var1.field885);
					}
				}

				if (var1.field872 < 0) {
					int var3 = -var1.field872 - 1;
					SJUCHLXH var4;
					if (field351 == var3) {
						var4 = field163;
					} else {
						var4 = field448[var3];
					}

					if (var4 != null && var4.field41 >= 0 && var4.field41 < 13312 && var4.field42 >= 0 && var4.field42 < 13312) {
						var1.method376(var4.field41, var4.field42, field538, method84(var4.field42, var1.field875, var4.field41) - var1.field885);
					}
				}

				var1.method377(field536);
				field469.method336((int) var1.field879, -1, 60, (int) var1.field877, var1, field263, (int) var1.field878, var1.field880, false);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method99() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(B)V")
	public final void method100() {
		for (int var1 = -1; var1 < field449; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field447;
			} else {
				var2 = field450[var1];
			}

			SJUCHLXH var3 = field448[var2];
			if (var3 != null) {
				method145(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.b(IILIMUIZRAF;)V")
	public final void method101(int arg0, IMUIZRAF arg1) {
		field421 = 0;
		field451 = 0;
		method104(arg1, arg0);
		method138(arg1, arg0);
		method157(arg1, arg0);
		method59(arg1, arg0);

		for (int var3 = 0; var3 < field421; var3++) {
			int var4 = field422[var3];
			if (field538 != field448[var4].field69) {
				field448[var4] = null;
			}
		}

		if (arg1.field714 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field714 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field449; var5++) {
			if (field448[field450[var5]] == null) {
				signlink.reporterror(field129 + " null entry in pl list - pos:" + var5 + " size:" + field449);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method102(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method103() {
		if (field175 >= 2 || field423 != 0 || field188 != 0) {
			String var1;
			if (field423 == 1 && field175 < 2) {
				var1 = "Use " + field427 + " with...";
			} else if (field188 == 1 && field175 < 2) {
				var1 = field191 + "...";
			} else {
				var1 = field247[field175 - 1];
			}

			if (field175 > 2) {
				var1 = var1 + "@whi@ / " + (field175 - 2) + " more options";
			}

			field335.method185(15, 4, var1, true, 0xFFFFFF, field538 / 1000);
		}
	}

	@ObfuscatedName("client.a(LIMUIZRAF;IB)V")
	public final void method104(IMUIZRAF arg0, int arg1) {
		arg0.method248();
		int var3 = arg0.method249(1);
		if (var3 != 0) {
			int var4 = arg0.method249(2);
			if (var4 == 0) {
				field452[field451++] = field447;
			} else if (var4 == 1) {
				int var5 = arg0.method249(3);
				field163.method20(false, var5);
				int var6 = arg0.method249(1);
				if (var6 == 1) {
					field452[field451++] = field447;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method249(3);
				field163.method20(true, var7);
				int var8 = arg0.method249(3);
				field163.method20(true, var8);
				int var9 = arg0.method249(1);
				if (var9 == 1) {
					field452[field451++] = field447;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method249(7);
				field263 = arg0.method249(2);
				int var11 = arg0.method249(1);
				int var12 = arg0.method249(7);
				int var13 = arg0.method249(1);
				if (var13 == 1) {
					field452[field451++] = field447;
				}

				field163.method19(var12, var11 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public static final void method105() {
		LIOYHOWO.field805 = true;
		VRKDWHDQ.field1258 = true;
		field278 = true;
		QJLJTPQV.field947 = true;
		PZZVQRQI.field900 = true;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method106() {
		for (EPOYVBCN var1 = (EPOYVBCN) field546.method382(); var1 != null; var1 = (EPOYVBCN) field546.method384()) {
			if (field263 != var1.field582 || var1.field586) {
				var1.method540();
			} else if (field538 >= var1.field587) {
				var1.method209(field536);

				if (var1.field586) {
					var1.method540();
				} else {
					field469.method336(var1.field585, -1, 60, var1.field583, var1, var1.field582, var1.field584, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method107() {
		if (field515 > 1) {
			field515--;
		}

		if (field440 > 0) {
			field440--;
		}

		for (int var1 = 0; var1 < 5 && method123(); var1++) {
		}

		if (field219) {
			synchronized (field354.field1365) {
				if (!field145) {
					field354.field1367 = 0;
				} else if (field1303 != 0 || field354.field1367 >= 40) {
					field194.method227(42);
					field194.method228(0);
					int var3 = field194.field714;
					int var4 = 0;
					for (int var5 = 0; var5 < field354.field1367 && var3 - field194.field714 < 240; var5++) {
						var4++;
						int var6 = field354.field1366[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field354.field1368[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field354.field1366[var5] == -1 && field354.field1368[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field342 != var7 || field343 != var6) {
							int var9 = var7 - field342;
							field342 = var7;
							int var10 = var6 - field343;
							field343 = var6;

							if (field312 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field194.method229((field312 << 12) + (var9 << 6) + var10);
								field312 = 0;
							} else if (field312 < 8) {
								field194.method231((field312 << 19) + var8 + 0x800000);
								field312 = 0;
							} else {
								field194.method232((field312 << 19) + var8 - 0x40000000);
								field312 = 0;
							}
						} else if (field312 < 2047) {
							field312++;
						}
					}

					field194.method237(field194.field714 - var3);

					if (var4 >= field354.field1367) {
						field354.field1367 = 0;
					} else {
						field354.field1367 -= var4;
						for (int var11 = 0; var11 < field354.field1367; var11++) {
							field354.field1368[var11] = field354.field1368[var4 + var11];
							field354.field1366[var11] = field354.field1366[var4 + var11];
						}
					}
				}
			}

			if (field1303 != 0) {
				long var12 = (field1306 - field323) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field323 = field1306;
				int var14 = field1305;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1304;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1303 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field194.method227(185);
				field194.method232((var17 << 19) + (var18 << 20) + var16);
			}

			if (field414 > 0) {
				field414--;
			}

			if (field1307[1] == 1 || field1307[2] == 1 || field1307[3] == 1 || field1307[4] == 1) {
				field415 = true;
			}

			if (field415 && field414 <= 0) {
				field414 = 20;
				field415 = false;
				field194.method227(29);
				field194.method264(field359);
				field194.method229(field358);
			}

			if (field1294 && !field462) {
				field462 = true;
				field194.method227(239);
				field194.method228(1);
			}

			if (!field1294 && field462) {
				field462 = false;
				field194.method227(239);
				field194.method228(0);
			}

			method60();
			method159();
			method154();
			field281++;
			if (field281 > 120) {
				field281 = 0;
				field194.method227(24);
				field194.method229(20610);
			}

			field438++;
			if (field438 > 750) {
				method64();
			}

			method100();
			method144();
			method86();
			field357++;
			if (field357 > 1891) {
				field357 = 0;
				field194.method227(226);
				field194.method228(0);
				int var19 = field194.field714;

				if ((int) (Math.random() * 2.0D) == 0) {
					field194.method228(173);
				}

				field194.method229(47741);
				field194.method229(19406);
				field194.method228((int) (Math.random() * 256.0D));
				field194.method228(255);
				field194.method229(61428);
				field194.method229(35709);

				if ((int) (Math.random() * 2.0D) == 0) {
					field194.method228(79);
				}

				field194.method229(26314);
				field194.method229((int) (Math.random() * 65536.0D));
				field194.method237(field194.field714 - var19);
			}

			field536++;

			if (field234 != 0) {
				field233 += 20;
				if (field233 >= 400) {
					field234 = 0;
				}
			}

			if (field134 != 0) {
				field131++;
				if (field131 >= 15) {
					if (field134 == 2) {
						field520 = true;
					}

					if (field134 == 3) {
						field183 = true;
					}

					field134 = 0;
				}
			}

			if (field394 != 0) {
				field502++;

				if (field1297 > field395 + 5 || field1297 < field395 - 5 || field1298 > field396 + 5 || field1298 < field396 - 5) {
					field473 = true;
				}

				if (field1296 == 0) {
					if (field394 == 2) {
						field520 = true;
					}

					if (field394 == 3) {
						field183 = true;
					}

					field394 = 0;

					if (field473 && field502 >= 5) {
						field514 = -1;
						method168();

						if (field514 == field392 && field513 != field393) {
							SJPORZIF var20 = SJPORZIF.field1040[field392];
							byte var21 = 0;
							if (field208 == 1 && var20.field1086 == 206) {
								var21 = 1;
							}

							if (var20.field1075[field513] <= 0) {
								var21 = 0;
							}

							if (var20.field1088) {
								int var22 = field393;
								int var23 = field513;
								var20.field1075[var23] = var20.field1075[var22];
								var20.field1039[var23] = var20.field1039[var22];
								var20.field1075[var22] = -1;
								var20.field1039[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field393;
								int var25 = field513;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method447(var24, var24 - 1);
										var24--;
									} else if (var24 < var25) {
										var20.method447(var24, var24 + 1);
										var24++;
									}
								}
							} else {
								var20.method447(field393, field513);
							}

							field194.method227(3);
							field194.method263(field392);
							field194.method264(field393);
							field194.method263(field513);
							field194.method255(var21);
						}
					} else if ((field322 == 1 || method122(field175 - 1)) && field175 > 2) {
						method69();
					} else if (field175 > 0) {
						method115(field175 - 1);
					}

					field131 = 10;
					field1303 = 0;
				}
			}

			if (LIOYHOWO.field839 != -1) {
				int var26 = LIOYHOWO.field839;
				int var27 = LIOYHOWO.field840;
				boolean var28 = method78(0, field163.field75[0], field163.field76[0], 0, true, 0, var27, var26, 0, 0, 0);
				LIOYHOWO.field839 = -1;

				if (var28) {
					field231 = field1304;
					field232 = field1305;
					field234 = 1;
					field233 = 0;
				}
			}

			if (field1303 == 1 && field209 != null) {
				field209 = null;
				field183 = true;
				field1303 = 0;
			}

			method137();
			method156();
			method171();
			method72();

			if (field1296 == 1 || field1303 == 1) {
				field518++;
			}

			if (field196 == 2) {
				method140();
			}

			if (field196 == 2 && field534) {
				method134();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field274[var29]++;
			}

			method141();
			field140++;
			if (field140 > 97) {
				field140 = 0;
				field194.method227(207);
			}

			field1295++;
			if (field1295 > 4500) {
				field440 = 250;
				field1295 -= 500;
				field194.method227(41);
			}

			field135++;
			if (field135 > 500) {
				field135 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field441 += field442;
				}

				if ((var30 & 0x2) == 2) {
					field261 += field262;
				}

				if ((var30 & 0x4) == 4) {
					field529 += field530;
				}
			}

			if (field441 < -50) {
				field442 = 2;
			}

			if (field441 > 50) {
				field442 = -2;
			}

			if (field261 < -55) {
				field262 = 2;
			}

			if (field261 > 55) {
				field262 = -2;
			}

			if (field529 < -40) {
				field530 = 1;
			}

			if (field529 > 40) {
				field530 = -1;
			}

			field539++;
			if (field539 > 500) {
				field539 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field279 += field280;
				}

				if ((var31 & 0x2) == 2) {
					field248 += field249;
				}
			}

			if (field279 < -60) {
				field280 = 2;
			}

			if (field279 > 60) {
				field280 = -2;
			}

			if (field248 < -20) {
				field249 = 1;
			}

			if (field248 > 10) {
				field249 = -1;
			}

			field439++;
			if (field439 > 50) {
				field194.method227(184);
			}

			try {
				if (field345 != null && field194.field714 > 0) {
					field345.method224(0, field194.field713, field194.field714);
					field194.field714 = 0;
					field439 = 0;
				}
			} catch (IOException var33) {
				method64();
			} catch (Exception var34) {
				method166();
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method108() {
		if (field545 == null) {
			method169();
			field1290 = null;
			field481 = null;
			field482 = null;
			field483 = null;
			field484 = null;
			field485 = null;
			field486 = null;
			field487 = null;
			field488 = null;
			field489 = null;
			field545 = new SKZHQGHX(96, 479, method44());
			field543 = new SKZHQGHX(156, 172, method44());
			DSAVPBJG.method194();
			field406.method13(0, 0);
			field542 = new SKZHQGHX(261, 190, method44());
			field544 = new SKZHQGHX(334, 512, method44());
			DSAVPBJG.method194();
			field141 = new SKZHQGHX(50, 496, method44());
			field142 = new SKZHQGHX(37, 269, method44());
			field143 = new SKZHQGHX(45, 249, method44());
			field540 = true;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method109(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field148 = "";
				field149 = "Connecting to server...";
				method130(true);
			}

			field345 = new HUWYSFFT(method111(field276 + 43594), this);
			long var4 = JYGZTITV.method318(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field194.field714 = 0;
			field194.method228(14);
			field194.method228(var6);
			field345.method224(0, field194.field713, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field345.method221();
			}

			int var8 = field345.method221();
			int var9 = var8;

			if (var8 == 0) {
				field345.method223(field213.field713, 0, 8);
				field213.field714 = 0;
				field366 = field213.method244();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field366 >> 32), (int) field366 };
				field194.field714 = 0;
				field194.method228(10);
				field194.method232(var10[0]);
				field194.method232(var10[1]);
				field194.method232(var10[2]);
				field194.method232(var10[3]);
				field194.method232(signlink.uid);
				field194.method235(arg0);
				field194.method235(arg1);
				field194.method253(field472, field242);
				field373.field714 = 0;

				if (arg2) {
					field373.method228(18);
				} else {
					field373.method228(16);
				}

				field373.method228(field194.field714 + 36 + 1 + 1 + 2);
				field373.method228(255);
				field373.method229(330);
				field373.method228(field278 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field373.method232(field314[var11]);
				}

				field373.method236(0, field194.field713, field194.field714);
				field194.field718 = new XXDUCPOC(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field504 = new XXDUCPOC(var10);
				field345.method224(0, field373.field713, field373.field714);
				var8 = field345.method221();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method109(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field204 = field345.method221();
				field145 = field345.method221() == 1;
				field323 = 0L;
				field312 = 0;
				field354.field1367 = 0;
				field1294 = true;
				field462 = true;
				field219 = true;
				field194.field714 = 0;
				field213.field714 = 0;
				field437 = -1;
				field315 = -1;
				field316 = -1;
				field317 = -1;
				field436 = 0;
				field438 = 0;
				field515 = 0;
				field440 = 0;
				field304 = 0;
				field175 = 0;
				field455 = false;
				field1295 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field299[var13] = null;
				}

				field423 = 0;
				field188 = 0;
				field196 = 0;
				field257 = 0;
				field441 = (int) (Math.random() * 100.0D) - 50;
				field261 = (int) (Math.random() * 110.0D) - 55;
				field529 = (int) (Math.random() * 80.0D) - 40;
				field279 = (int) (Math.random() * 120.0D) - 60;
				field248 = (int) (Math.random() * 30.0D) - 20;
				field359 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field325 = 0;
				field365 = -1;
				field417 = 0;
				field418 = 0;
				field449 = 0;
				field245 = 0;

				for (int var14 = 0; var14 < field446; var14++) {
					field448[var14] = null;
					field453[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field244[var15] = null;
				}

				field163 = field448[field447] = new SJUCHLXH();
				field431.method386();
				field546.method386();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field251[var16][var17][var18] = null;
						}
					}
				}

				field378 = new PILILDKN();
				field512 = 0;
				field511 = 0;
				field404 = -1;
				field192 = -1;
				field226 = -1;
				field344 = -1;
				field340 = -1;
				field258 = false;
				field522 = 3;
				field432 = 0;
				field455 = false;
				field367 = false;
				field209 = null;
				field523 = 0;
				field341 = -1;
				field264 = true;
				method174();

				for (int var19 = 0; var19 < 5; var19++) {
					field300[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field444[var20] = null;
					field445[var20] = false;
				}

				field164 = 0;
				field137 = 0;
				field319 = 0;
				field377 = 0;
				field230 = 0;
				field352 = 0;
				field537 = 0;
				field146 = 0;
				method108();
			} else if (var8 == 3) {
				field148 = "";
				field149 = "Invalid username or password.";
			} else if (var8 == 4) {
				field148 = "Your account has been disabled.";
				field149 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field148 = "Your account is already logged in.";
				field149 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field148 = "RuneScape has been updated!";
				field149 = "Please reload this page.";
			} else if (var8 == 7) {
				field148 = "This world is full.";
				field149 = "Please use a different world.";
			} else if (var8 == 8) {
				field148 = "Unable to connect.";
				field149 = "Login server offline.";
			} else if (var8 == 9) {
				field148 = "Login limit exceeded.";
				field149 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field148 = "Unable to connect.";
				field149 = "Bad session id.";
			} else if (var8 == 11) {
				field149 = "Login server rejected session.";
				field149 = "Please try again.";
			} else if (var8 == 12) {
				field148 = "You need a members account to login to this world.";
				field149 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field148 = "Could not complete login.";
				field149 = "Please try using a different world.";
			} else if (var8 == 14) {
				field148 = "The server is being updated.";
				field149 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field219 = true;
				field194.field714 = 0;
				field213.field714 = 0;
				field437 = -1;
				field315 = -1;
				field316 = -1;
				field317 = -1;
				field436 = 0;
				field438 = 0;
				field515 = 0;
				field175 = 0;
				field455 = false;
				field398 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field148 = "Login attempts exceeded.";
				field149 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field148 = "You are standing in a members-only area.";
				field149 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field148 = "Invalid loginserver requested";
				field149 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field345.method221();
				for (var21 += 3; var21 >= 0; var21--) {
					field148 = "You have only just left another world";
					field149 = "Your profile will be transferred in: " + var21;
					method130(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method109(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field148 = "Unexpected server response";
				field149 = "Please try using a different world.";
			} else if (var9 != 0) {
				field148 = "No response from server";
				field149 = "Please try using a different world.";
			} else if (field320 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field320++;
				method109(arg0, arg1, arg2);
			} else {
				field148 = "No response from loginserver";
				field149 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field148 = "";
			field149 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method110() {
		signlink.reporterror = false;

		try {
			if (field345 != null) {
				field345.method220();
			}
		} catch (Exception var1) {
		}

		field345 = null;
		method99();

		if (field354 != null) {
			field354.field1370 = false;
		}

		field354 = null;
		field380.method470();
		field380 = null;
		field243 = null;
		field194 = null;
		field373 = null;
		field213 = null;
		field477 = null;
		field147 = null;
		field288 = null;
		field478 = null;
		field479 = null;
		field139 = null;
		field463 = null;
		field469 = null;
		field491 = null;
		field505 = null;
		field433 = null;
		field337 = null;
		field338 = null;
		field218 = null;
		field542 = null;
		field543 = null;
		field544 = null;
		field545 = null;
		field141 = null;
		field142 = null;
		field143 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field268 = null;
		field269 = null;
		field270 = null;
		field271 = null;
		field272 = null;
		field273 = null;
		field405 = null;
		field406 = null;
		field407 = null;
		field374 = null;
		field375 = null;
		field376 = null;
		field212 = null;
		field382 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field456 = null;
		field457 = null;
		field458 = null;
		field459 = null;
		field460 = null;
		field311 = null;
		field216 = null;
		field197 = null;
		field496 = null;
		field169 = null;
		field170 = null;
		field171 = null;
		field172 = null;
		field173 = null;
		field399 = null;
		field420 = null;
		field348 = null;
		field448 = null;
		field450 = null;
		field452 = null;
		field453 = null;
		field422 = null;
		field244 = null;
		field246 = null;
		field251 = null;
		field378 = null;
		field431 = null;
		field546 = null;
		field497 = null;
		field498 = null;
		field499 = null;
		field500 = null;
		field247 = null;
		field187 = null;
		field206 = null;
		field207 = null;
		field362 = null;
		field419 = null;
		field363 = null;
		field302 = null;
		field461 = null;
		field484 = null;
		field485 = null;
		field481 = null;
		field482 = null;
		field483 = null;
		field486 = null;
		field487 = null;
		field488 = null;
		field489 = null;
		method169();
		PZZVQRQI.method399();
		WHKCNEXD.method516();
		SFKBIDFK.method439();
		GQFZPMGS.field647 = null;
		BDUNOHSG.field85 = null;
		SJPORZIF.field1040 = null;
		HJNHDQSX.field684 = null;
		ZKWMIVTX.field1461 = null;
		CIVOPMKV.field114 = null;
		CIVOPMKV.field126 = null;
		SXXYSOJW.field1159 = null;
		field1290 = null;
		SJUCHLXH.field1109 = null;
		VRKDWHDQ.method494();
		LIOYHOWO.method324();
		YABPKWWG.method544();
		HQHBJEDA.method217();
		System.gc();
	}

	@ObfuscatedName("client.v(I)Ljava/net/Socket;")
	public final Socket method111(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method112(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field511; var3++) {
				if (field302[var3] == arg0) {
					field511--;
					field520 = true;

					for (int var4 = var3; var4 < field511; var4++) {
						field363[var4] = field363[var4 + 1];
						field461[var4] = field461[var4 + 1];
						field302[var4] = field302[var4 + 1];
					}

					field194.method227(253);
					field194.method234(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method113(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field469.method355(field263, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field284++;
		if (field284 > 91) {
			field284 = 0;
			field194.method227(233);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			PZZVQRQI var8 = PZZVQRQI.method398(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field939;
				var10 = var8.field913;
			} else {
				var9 = var8.field913;
				var10 = var8.field939;
			}

			int var11 = var8.field910;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method78(0, field163.field75[0], field163.field76[0], 0, false, 2, arg2, arg1, var11, var9, var10);
		} else {
			method78(var6 + 1, field163.field75[0], field163.field76[0], var7, false, 2, arg2, arg1, 0, 0, 0);
		}

		field231 = field1304;
		field232 = field1305;
		field234 = 2;
		field233 = 0;
		return true;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method114(int arg0) {
		int[] var2 = field419.field1450;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field463[arg0][var7][var5] & 0x18) == 0) {
					field469.method360(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field463[arg0 + 1][var7][var5] & 0x8) != 0) {
					field469.method360(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field419.method573();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field463[arg0][var11][var10] & 0x18) == 0) {
					method56(var9, var10, var8, arg0, var11);
				}

				if (arg0 < 3 && (field463[arg0 + 1][var11][var10] & 0x8) != 0) {
					method56(var9, var10, var8, arg0 + 1, var11);
				}
			}
		}

		field544.method455();
		field205 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field469.method354(field263, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = PZZVQRQI.method398(var14).field944;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field491[field263].field1361;
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

						field362[field205] = field420[var15];
						field206[field205] = var16;
						field207[field205] = var17;
						field205++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method115(int arg0) {
		if (arg0 >= 0) {
			if (field432 != 0) {
				field432 = 0;
				field183 = true;
			}

			int var2 = field497[arg0];
			int var3 = field498[arg0];
			int var4 = field499[arg0];
			int var5 = field500[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 629) {
				String var6 = field247[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					if (field226 == -1) {
						method76();
						field215 = var6.substring(var7 + 5).trim();
						field353 = false;

						for (int var8 = 0; var8 < SJPORZIF.field1040.length; var8++) {
							if (SJPORZIF.field1040[var8] != null && SJPORZIF.field1040[var8].field1086 == 600) {
								field430 = field226 = SJPORZIF.field1040[var8].field1049;
								break;
							}
						}
					} else {
						method125(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 575) {
				SJUCHLXH var9 = field448[var5];
				if (var9 != null) {
					method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var9.field76[0], var9.field75[0], 0, 1, 1);
					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(124);
					field194.method262(var5);
				}
			}

			if (var4 == 843) {
				SJPORZIF var10 = SJPORZIF.field1040[var3];
				boolean var11 = true;
				if (var10.field1086 > 0) {
					var11 = method49(var10);
				}

				if (var11) {
					field194.method227(166);
					field194.method229(var3);
				}
			}

			if (var4 == 68) {
				field423 = 1;
				field424 = var2;
				field425 = var3;
				field426 = var5;
				field427 = SFKBIDFK.method438(var5).field990;
				field188 = 0;
				field520 = true;
			} else {
				if (var4 == 36) {
					field194.method227(165);
					field194.method263(var5);
					field194.method229(var3);
					field194.method264(var2);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 567) {
					boolean var12 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var12) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(215);
					field194.method264(field426);
					field194.method264(field424);
					field194.method262(field425);
					field194.method264(field290 + var2);
					field194.method229(var5);
					field194.method262(field291 + var3);
				}

				if (var4 == 6) {
					boolean var14 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var14) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(189);
					field194.method262(field290 + var2);
					field194.method264(var5);
					field194.method263(field291 + var3);
				}

				if (var4 == 79 || var4 == 51 || var4 == 647 || var4 == 320) {
					String var16 = field247[arg0];
					int var17 = var16.indexOf("@whi@");
					if (var17 != -1) {
						long var18 = JYGZTITV.method318(var16.substring(var17 + 5).trim());
						if (var4 == 79) {
							method87(var18);
						}

						if (var4 == 51) {
							method66(var18);
						}

						if (var4 == 647) {
							method112(var18);
						}

						if (var4 == 320) {
							method94(var18);
						}
					}
				}

				if (var4 == 819) {
					field194.method227(177);
					field194.method264(var2);
					field194.method229(var3);
					field194.method262(var5);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 482) {
					boolean var20 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var20) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field537 += field290;
					if (field537 >= 143) {
						field194.method227(115);
						field194.method231(0xCEE8B6);
						field537 = 0;
					}

					field194.method227(141);
					field194.method264(var5);
					field194.method263(field290 + var2);
					field194.method263(field291 + var3);
				}

				if (var4 == 936) {
					field194.method227(166);
					field194.method229(var3);
					SJPORZIF var22 = SJPORZIF.field1040[var3];
					if (var22.field1056 != null && var22.field1056[0][0] == 5) {
						int var23 = var22.field1056[0][1];
						if (field187[var23] != var22.field1064[0]) {
							field187[var23] = var22.field1064[0];
							method63(var23);
							field520 = true;
						}
					}
				}

				if (var4 == 464) {
					boolean var24 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var24) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(237);
					field194.method263(field290 + var2);
					field194.method229(var5);
					field194.method263(field291 + var3);
				}

				if (var4 == 17) {
					OTOMPFCI var26 = field244[var5];
					if (var26 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var26.field76[0], var26.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(82);
						field194.method264(var5);
					}
				}

				if (var4 == 29) {
					SJUCHLXH var27 = field448[var5];
					if (var27 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var27.field76[0], var27.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(154);
						field194.method229(var5);
						field194.method264(field426);
						field194.method229(field425);
						field194.method229(field424);
					}
				}

				if (var4 == 348) {
					boolean var28 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var28) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(8);
					field194.method262(var5);
					field194.method264(field290 + var2);
					field194.method264(field291 + var3);
				}

				if (var4 == 329) {
					method76();
				}

				if (var4 == 313) {
					SJUCHLXH var30 = field448[var5];
					if (var30 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var30.field76[0], var30.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(72);
						field194.method264(var5);
						field194.method264(field189);
					}
				}

				if (var4 == 409) {
					SJUCHLXH var31 = field448[var5];
					if (var31 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var31.field76[0], var31.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field137++;
						if (field137 >= 128) {
							field194.method227(90);
							field137 = 0;
						}

						field194.method227(240);
						field194.method229(var5);
					}
				}

				if (var4 == 139) {
					method113(var5, var2, var3);
					field194.method227(217);
					field194.method262(field291 + var3);
					field194.method262(field290 + var2);
					field194.method229(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 1334) {
					SFKBIDFK var32 = SFKBIDFK.method438(var5);
					String var33;
					if (var32.field1003 == null) {
						var33 = "It's a " + var32.field990 + ".";
					} else {
						var33 = new String(var32.field1003);
					}

					method125(0, "", var33);
				}

				if (var4 == 748 && method113(var5, var2, var3)) {
					field194.method227(176);
					field194.method262(var5 >> 14 & 0x7FFF);
					field194.method264(field424);
					field194.method264(field426);
					field194.method264(field425);
					field194.method229(field290 + var2);
					field194.method262(field291 + var3);
				}

				if (var4 == 749 && method113(var5, var2, var3)) {
					field194.method227(174);
					field194.method264(field290 + var2);
					field194.method263(field291 + var3);
					field194.method262(field189);
					field194.method264(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 457 || var4 == 502) {
					String var34 = field247[arg0];
					int var35 = var34.indexOf("@whi@");
					if (var35 != -1) {
						var34 = var34.substring(var35 + 5).trim();
						String var36 = JYGZTITV.method322(JYGZTITV.method319(JYGZTITV.method318(var34)));
						boolean var37 = false;
						for (int var38 = 0; var38 < field449; var38++) {
							SJUCHLXH var39 = field448[field450[var38]];
							if (var39 != null && var39.field1116 != null && var39.field1116.equalsIgnoreCase(var36)) {
								method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var39.field76[0], var39.field75[0], 0, 1, 1);

								if (var4 == 457) {
									field230++;
									if (field230 >= 76) {
										field194.method227(129);
										field194.method228(78);
										field230 = 0;
									}

									field194.method227(78);
									field194.method262(field450[var38]);
								}

								if (var4 == 502) {
									field137++;
									if (field137 >= 128) {
										field194.method227(90);
										field137 = 0;
									}

									field194.method227(240);
									field194.method229(field450[var38]);
								}

								var37 = true;
								break;
							}
						}

						if (!var37) {
							method125(0, "", "Unable to find " + var36);
						}
					}
				}

				if (var4 == 215) {
					OTOMPFCI var40 = field244[var5];
					if (var40 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var40.field76[0], var40.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field319++;
						if (field319 >= 86) {
							field194.method227(136);
							field194.method228(103);
							field319 = 0;
						}

						field194.method227(108);
						field194.method263(var5);
					}
				}

				if (var4 == 314) {
					method113(var5, var2, var3);
					field194.method227(12);
					field194.method229(var5 >> 14 & 0x7FFF);
					field194.method229(field290 + var2);
					field194.method263(field291 + var3);
				}

				if (var4 == 541) {
					field194.method227(47);
					field194.method262(var2);
					field194.method262(var5);
					field194.method262(var3);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 1313) {
					SFKBIDFK var41 = SFKBIDFK.method438(var5);
					SJPORZIF var42 = SJPORZIF.field1040[var3];
					String var43;
					if (var42 != null && var42.field1039[var2] >= 100000) {
						var43 = var42.field1039[var2] + " x " + var41.field990;
					} else if (var41.field1003 == null) {
						var43 = "It's a " + var41.field990 + ".";
					} else {
						var43 = new String(var41.field1003);
					}

					method125(0, "", var43);
				}

				if (var4 == 257) {
					field194.method227(70);
					field194.method262(var3);
					field194.method264(var2);
					field194.method263(var5);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 124) {
					OTOMPFCI var44 = field244[var5];
					if (var44 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var44.field76[0], var44.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(96);
						field194.method262(field426);
						field194.method264(field425);
						field194.method229(field424);
						field194.method262(var5);
					}
				}

				if (var4 == 114) {
					field194.method227(67);
					field194.method264(var3);
					field194.method229(var5);
					field194.method264(var2);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 862) {
					boolean var45 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var45) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;
					field194.method227(125);
					field194.method262(field189);
					field194.method264(var5);
					field194.method262(field290 + var2);
					field194.method263(field291 + var3);
				}

				if (var4 == 797) {
					if (field455) {
						field469.method363(var2 - 4, var3 - 4);
					} else {
						field469.method363(field1304 - 4, field1305 - 4);
					}
				}

				if (var4 == 140) {
					field194.method227(188);
					field194.method229(var5);
					field194.method264(var2);
					field194.method263(var3);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 148) {
					SJUCHLXH var47 = field448[var5];
					if (var47 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var47.field76[0], var47.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(131);
						field194.method229(var5);
					}
				}

				if (var4 == 693) {
					method113(var5, var2, var3);
					field194.method227(10);
					field194.method264(field291 + var3);
					field194.method262(var5 >> 14 & 0x7FFF);
					field194.method229(field290 + var2);
				}

				if (var4 == 263) {
					boolean var48 = method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 0, 0);
					if (!var48) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var3, var2, 0, 1, 1);
					}

					field231 = field1304;
					field232 = field1305;
					field234 = 2;
					field233 = 0;

					if ((var3 & 0x3) == 0) {
						field352++;
					}

					if (field352 >= 133) {
						field194.method227(110);
						field194.method228(182);
						field352 = 0;
					}

					field194.method227(206);
					field194.method262(field290 + var2);
					field194.method262(field291 + var3);
					field194.method264(var5);
				}

				if (var4 == 815) {
					field194.method227(241);
					field194.method263(var2);
					field194.method262(var5);
					field194.method229(var3);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 1619) {
					int var50 = var5 >> 14 & 0x7FFF;
					PZZVQRQI var51 = PZZVQRQI.method398(var50);
					String var52;
					if (var51.field922 == null) {
						var52 = "It's a " + var51.field930 + ".";
					} else {
						var52 = new String(var51.field922);
					}

					method125(0, "", var52);
				}

				if (var4 == 507) {
					OTOMPFCI var53 = field244[var5];
					if (var53 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var53.field76[0], var53.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field146++;
						if (field146 >= 62) {
							field194.method227(109);
							field146 = 0;
						}

						field194.method227(175);
						field194.method229(var5);
					}
				}

				if (var4 == 938) {
					field194.method227(166);
					field194.method229(var3);
					SJPORZIF var54 = SJPORZIF.field1040[var3];
					if (var54.field1056 != null && var54.field1056[0][0] == 5) {
						int var55 = var54.field1056[0][1];
						field187[var55] = 1 - field187[var55];
						method63(var55);
						field520 = true;
					}
				}

				if (var4 == 474) {
					field194.method227(81);
					field194.method229(var5);
					field194.method263(var2);
					field194.method229(var3);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 919) {
					OTOMPFCI var56 = field244[var5];
					if (var56 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var56.field76[0], var56.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(225);
						field194.method262(var5);
					}
				}

				if (var4 == 104) {
					field194.method227(76);
					field194.method262(var5);
					field194.method262(var3);
					field194.method262(var2);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 637) {
					field194.method227(28);
					field194.method264(var3);
					field194.method263(field425);
					field194.method229(field426);
					field194.method262(var2);
					field194.method264(field424);
					field194.method262(var5);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 522) {
					field194.method227(45);
					field194.method263(field189);
					field194.method263(var5);
					field194.method229(var3);
					field194.method264(var2);
					field131 = 0;
					field132 = var3;
					field133 = var2;
					field134 = 2;
					if (SJPORZIF.field1040[var3].field1049 == field226) {
						field134 = 1;
					}

					if (SJPORZIF.field1040[var3].field1049 == field192) {
						field134 = 3;
					}
				}

				if (var4 == 1963) {
					method113(var5, var2, var3);
					field194.method227(190);
					field194.method262(field291 + var3);
					field194.method264(field290 + var2);
					field194.method229(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 216) {
					OTOMPFCI var57 = field244[var5];
					if (var57 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var57.field76[0], var57.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field164++;
						if (field164 >= 144) {
							field194.method227(71);
							field194.method228(125);
							field164 = 0;
						}

						field194.method227(242);
						field194.method264(var5);
					}
				}

				if (var4 == 1159) {
					OTOMPFCI var58 = field244[var5];
					if (var58 != null) {
						WHKCNEXD var59 = var58.field894;
						if (var59.field1332 != null) {
							var59 = var59.method518();
						}

						if (var59 != null) {
							String var60;
							if (var59.field1324 == null) {
								var60 = "It's a " + var59.field1331 + ".";
							} else {
								var60 = new String(var59.field1324);
							}

							method125(0, "", var60);
						}
					}
				}

				if (var4 == 499) {
					String var61 = field247[arg0];
					int var62 = var61.indexOf("@whi@");
					if (var62 != -1) {
						long var63 = JYGZTITV.method318(var61.substring(var62 + 5).trim());
						int var65 = -1;
						for (int var66 = 0; var66 < field511; var66++) {
							if (field302[var66] == var63) {
								var65 = var66;
								break;
							}
						}

						if (var65 != -1 && field461[var65] > 0) {
							field183 = true;
							field432 = 0;
							field367 = true;
							field227 = "";
							field493 = 3;
							field220 = field302[var65];
							field307 = "Enter message to send to " + field363[var65];
						}
					}
				}

				if (var4 == 264 && !field258) {
					field194.method227(99);
					field194.method229(var3);
					field258 = true;
				}

				if (var4 == 743) {
					SJUCHLXH var67 = field448[var5];
					if (var67 != null) {
						method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var67.field76[0], var67.field75[0], 0, 1, 1);
						field231 = field1304;
						field232 = field1305;
						field234 = 2;
						field233 = 0;
						field194.method227(196);
						field194.method262(var5);
					}
				}

				if (var4 == 217) {
					method113(var5, var2, var3);
					field194.method227(119);
					field194.method263(field290 + var2);
					field194.method262(field291 + var3);
					field194.method263(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 841) {
					SJPORZIF var68 = SJPORZIF.field1040[var3];
					field188 = 1;
					field189 = var3;
					field190 = var68.field1098;
					field423 = 0;
					field520 = true;
					String var69 = var68.field1076;
					if (var69.indexOf(" ") != -1) {
						var69 = var69.substring(0, var69.indexOf(" "));
					}

					String var70 = var68.field1076;
					if (var70.indexOf(" ") != -1) {
						var70 = var70.substring(var70.indexOf(" ") + 1);
					}

					field191 = var69 + " " + var68.field1083 + " " + var70;

					if (field190 == 16) {
						field520 = true;
						field522 = 3;
						field313 = true;
					}
				} else {
					if (var4 == 540) {
						SJUCHLXH var71 = field448[var5];
						if (var71 != null) {
							method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var71.field76[0], var71.field75[0], 0, 1, 1);
							field231 = field1304;
							field232 = field1305;
							field234 = 2;
							field233 = 0;
							field230++;
							if (field230 >= 76) {
								field194.method227(129);
								field194.method228(78);
								field230 = 0;
							}

							field194.method227(78);
							field194.method262(var5);
						}
					}

					if (var4 == 53) {
						OTOMPFCI var72 = field244[var5];
						if (var72 != null) {
							method78(0, field163.field75[0], field163.field76[0], 0, false, 2, var72.field76[0], var72.field75[0], 0, 1, 1);
							field231 = field1304;
							field232 = field1305;
							field234 = 2;
							field233 = 0;
							field194.method227(152);
							field194.method263(field189);
							field194.method264(var5);
						}
					}

					if (var4 == 984) {
						field377 += var3;
						if (field377 >= 136) {
							field194.method227(197);
							field194.method229(41190);
							field377 = 0;
						}

						field194.method227(181);
						field194.method262(var5);
						field194.method229(var2);
						field194.method264(var3);
						field131 = 0;
						field132 = var3;
						field133 = var2;
						field134 = 2;
						if (SJPORZIF.field1040[var3].field1049 == field226) {
							field134 = 1;
						}

						if (SJPORZIF.field1040[var3].field1049 == field192) {
							field134 = 3;
						}
					}

					field423 = 0;
					field188 = 0;
					field520 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method116() {
		method83(20, "Starting up");

		if (signlink.sunjava) {
			field1283 = 5;
		}

		if (field492) {
			field519 = true;
		} else {
			field492 = true;
			boolean var1 = false;
			String var2 = method160();
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
						field128[var3] = new RZNFVLPG(signlink.cache_dat, var3 + 1, 500000, signlink.cache_idx[var3]);
					}
				}

				try {
					method90();
					field256 = method95(25, "title", "title screen", field314[1], 1);
					field333 = new DIVYVFFL(false, "p11_full", field256);
					field334 = new DIVYVFFL(false, "p12_full", field256);
					field335 = new DIVYVFFL(false, "b12_full", field256);
					field336 = new DIVYVFFL(true, "q8_full", field256);
					method89();
					method35();
					BYZSQZUF var4 = method95(30, "config", "config", field314[2], 2);
					BYZSQZUF var5 = method95(35, "interface", "interface", field314[3], 3);
					BYZSQZUF var6 = method95(40, "media", "2d graphics", field314[4], 4);
					BYZSQZUF var7 = method95(45, "textures", "textures", field314[6], 6);
					BYZSQZUF var8 = method95(50, "wordenc", "chat system", field314[7], 7);
					BYZSQZUF var9 = method95(55, "sounds", "sound effects", field314[8], 8);
					field463 = new byte[4][104][104];
					field139 = new int[4][105][105];
					field469 = new LIOYHOWO(104, field139, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field491[var10] = new WWMUUFBO(104, 104);
					}

					field419 = new YHASUFYG(512, 512);
					BYZSQZUF var11 = method95(60, "versionlist", "update list", field314[5], 5);
					method83(60, "Connecting to update server");
					field380 = new TDBJVJCU();
					field380.method464(var11, this);
					HQHBJEDA.method215(field380.method467());
					YABPKWWG.method545(field380.method474(0), field380);

					if (!field278) {
						field305 = 0;
						try {
							field305 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field306 = true;
						field380.method469(2, field305);

						while (field380.method472() > 0) {
							method172();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field380.field1210 > 3) {
								method164("ondemand");
								return;
							}
						}
					}

					method83(65, "Requesting animations");
					int var12 = field380.method474(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field380.method469(1, var13);
					}

					while (field380.method472() > 0) {
						int var14 = var12 - field380.method472();
						if (var14 > 0) {
							method83(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method172();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field380.field1210 > 3) {
							method164("ondemand");
							return;
						}
					}

					method83(70, "Requesting models");
					int var15 = field380.method474(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field380.method480(var16);
						if ((var17 & 0x1) != 0) {
							field380.method469(0, var16);
						}
					}

					int var18 = field380.method472();
					while (field380.method472() > 0) {
						int var19 = var18 - field380.method472();
						if (var19 > 0) {
							method83(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method172();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field128[0] != null) {
						method83(75, "Requesting maps");
						field380.method469(3, field380.method465(47, 48, 0));
						field380.method469(3, field380.method465(47, 48, 1));
						field380.method469(3, field380.method465(48, 48, 0));
						field380.method469(3, field380.method465(48, 48, 1));
						field380.method469(3, field380.method465(49, 48, 0));
						field380.method469(3, field380.method465(49, 48, 1));
						field380.method469(3, field380.method465(47, 47, 0));
						field380.method469(3, field380.method465(47, 47, 1));
						field380.method469(3, field380.method465(48, 47, 0));
						field380.method469(3, field380.method465(48, 47, 1));
						field380.method469(3, field380.method465(48, 148, 0));
						field380.method469(3, field380.method465(48, 148, 1));
						int var20 = field380.method472();
						while (field380.method472() > 0) {
							int var21 = var20 - field380.method472();
							if (var21 > 0) {
								method83(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method172();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field380.method474(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field380.method480(var23);
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
							field380.method468(0, var23, var25);
						}
					}

					field380.method478(field277);

					if (!field278) {
						int var26 = field380.method474(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field380.method479(var27)) {
								field380.method468(2, var27, (byte) 1);
							}
						}
					}

					method83(80, "Unpacking media");
					field405 = new AGTHLVTI(var6, "invback", 0);
					field407 = new AGTHLVTI(var6, "chatback", 0);
					field406 = new AGTHLVTI(var6, "mapback", 0);
					field374 = new AGTHLVTI(var6, "backbase1", 0);
					field375 = new AGTHLVTI(var6, "backbase2", 0);
					field376 = new AGTHLVTI(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field212[var28] = new AGTHLVTI(var6, "sideicons", var28);
					}

					field311 = new YHASUFYG(var6, "compass", 0);
					field533 = new YHASUFYG(var6, "mapedge", 0);
					field533.method575();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field399[var29] = new AGTHLVTI(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field420[var30] = new YHASUFYG(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field216[var31] = new YHASUFYG(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field197[var32] = new YHASUFYG(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field464 = new YHASUFYG(var6, "mapmarker", 0);
					field465 = new YHASUFYG(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field496[var33] = new YHASUFYG(var6, "cross", var33);
					}

					field169 = new YHASUFYG(var6, "mapdots", 0);
					field170 = new YHASUFYG(var6, "mapdots", 1);
					field171 = new YHASUFYG(var6, "mapdots", 2);
					field172 = new YHASUFYG(var6, "mapdots", 3);
					field173 = new YHASUFYG(var6, "mapdots", 4);
					field285 = new AGTHLVTI(var6, "scrollbar", 0);
					field286 = new AGTHLVTI(var6, "scrollbar", 1);
					field382 = new AGTHLVTI(var6, "redstone1", 0);
					field383 = new AGTHLVTI(var6, "redstone2", 0);
					field384 = new AGTHLVTI(var6, "redstone3", 0);
					field385 = new AGTHLVTI(var6, "redstone1", 0);
					field385.method10();
					field386 = new AGTHLVTI(var6, "redstone2", 0);
					field386.method10();
					field456 = new AGTHLVTI(var6, "redstone1", 0);
					field456.method11();
					field457 = new AGTHLVTI(var6, "redstone2", 0);
					field457.method11();
					field458 = new AGTHLVTI(var6, "redstone3", 0);
					field458.method11();
					field459 = new AGTHLVTI(var6, "redstone1", 0);
					field459.method10();
					field459.method11();
					field460 = new AGTHLVTI(var6, "redstone2", 0);
					field460.method10();
					field460.method11();

					for (int var34 = 0; var34 < 2; var34++) {
						field339[var34] = new AGTHLVTI(var6, "mod_icons", var34);
					}

					YHASUFYG var35 = new YHASUFYG(var6, "backleft1", 0);
					field265 = new SKZHQGHX(var35.field1452, var35.field1451, method44());
					var35.method576(0, 0);
					YHASUFYG var36 = new YHASUFYG(var6, "backleft2", 0);
					field266 = new SKZHQGHX(var36.field1452, var36.field1451, method44());
					var36.method576(0, 0);
					YHASUFYG var37 = new YHASUFYG(var6, "backright1", 0);
					field267 = new SKZHQGHX(var37.field1452, var37.field1451, method44());
					var37.method576(0, 0);
					YHASUFYG var38 = new YHASUFYG(var6, "backright2", 0);
					field268 = new SKZHQGHX(var38.field1452, var38.field1451, method44());
					var38.method576(0, 0);
					YHASUFYG var39 = new YHASUFYG(var6, "backtop1", 0);
					field269 = new SKZHQGHX(var39.field1452, var39.field1451, method44());
					var39.method576(0, 0);
					YHASUFYG var40 = new YHASUFYG(var6, "backvmid1", 0);
					field270 = new SKZHQGHX(var40.field1452, var40.field1451, method44());
					var40.method576(0, 0);
					YHASUFYG var41 = new YHASUFYG(var6, "backvmid2", 0);
					field271 = new SKZHQGHX(var41.field1452, var41.field1451, method44());
					var41.method576(0, 0);
					YHASUFYG var42 = new YHASUFYG(var6, "backvmid3", 0);
					field272 = new SKZHQGHX(var42.field1452, var42.field1451, method44());
					var42.method576(0, 0);
					YHASUFYG var43 = new YHASUFYG(var6, "backhmid2", 0);
					field273 = new SKZHQGHX(var43.field1452, var43.field1451, method44());
					var43.method576(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field420[var48] != null) {
							field420[var48].method574(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field399[var48] != null) {
							field399[var48].method12(var44 + var47, var46 + var47, var45 + var47);
						}
					}

					method83(83, "Unpacking textures");
					VRKDWHDQ.method499(var7);
					VRKDWHDQ.method503(0.8D);
					VRKDWHDQ.method498(20);
					method83(86, "Unpacking config");
					ZKWMIVTX.method590(var4);
					PZZVQRQI.method400(var4);
					GQFZPMGS.method211(var4);
					SFKBIDFK.method434(var4);
					WHKCNEXD.method517(var4);
					BDUNOHSG.method22(var4);
					CIVOPMKV.method30(var4);
					SXXYSOJW.method462(var4);
					AFWJXAMU.method6(var4);
					SFKBIDFK.field1016 = field277;

					if (!field278) {
						method83(90, "Unpacking sounds");
						byte[] var49 = var9.method29("sounds.dat", null);
						IMUIZRAF var50 = new IMUIZRAF(var49);
						EJAYDEWE.method203(var50);
					}

					method83(95, "Unpacking interfaces");
					DIVYVFFL[] var51 = new DIVYVFFL[] { field333, field334, field335, field336 };
					SJPORZIF.method450(var5, var51, var6);
					method83(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field406.field19[field406.field21 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field552[var52] = var53;
						field296[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field406.field19[field406.field21 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field466[var56 - 5] = var57 - 25;
						field400[var56 - 5] = var58 - var57;
					}

					VRKDWHDQ.method496(96, 479);
					field525 = VRKDWHDQ.field1269;
					VRKDWHDQ.method496(261, 190);
					field526 = VRKDWHDQ.field1269;
					VRKDWHDQ.method496(334, 512);
					field527 = VRKDWHDQ.field1269;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = VRKDWHDQ.field1267[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					LIOYHOWO.method361(500, 800, var60, 334, 512);
					JSEWQIYU.method280(var8);
					field354 = new XAXJBOWU(this);
					method36(field354, 10);
					EZOFESYN.field619 = this;
					PZZVQRQI.field932 = this;
					WHKCNEXD.field1313 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field524 + " " + field387);
					field326 = true;
				}
			} else {
				field480 = true;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method117() {
		for (FHZFOSDU var1 = (FHZFOSDU) field378.method382(); var1 != null; var1 = (FHZFOSDU) field378.method384()) {
			if (var1.field630 == -1) {
				var1.field631 = 0;
				method50(var1);
			} else {
				var1.method540();
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method118() {
		if (field295 != 0) {
			int var1 = 0;
			if (field515 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field299[var2] != null) {
					int var3 = field297[var2];
					String var4 = field298[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field454 == 0 || field454 == 1 && method62(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1297 > 4 && field1298 - 4 > var8 - 10 && field1298 - 4 <= var8 + 3) {
							int var9 = field334.method178("From:  " + var4 + field299[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1297 < var9 + 4) {
								if (field204 >= 1) {
									field247[field175] = "Report abuse @whi@" + var4;
									field499[field175] = 2629;
									field175++;
								}

								field247[field175] = "Add ignore @whi@" + var4;
								field499[field175] = 2051;
								field175++;
								field247[field175] = "Add friend @whi@" + var4;
								field499[field175] = 2079;
								field175++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field454 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LIMUIZRAF;LSJUCHLXH;IIB)V")
	public final void method119(IMUIZRAF arg0, SJUCHLXH arg1, int arg2, int arg3) {
		if ((arg2 & 0x10) != 0) {
			int var5 = arg0.method258();
			byte[] var6 = new byte[var5];
			IMUIZRAF var7 = new IMUIZRAF(var6);
			arg0.method274(0, var5, var6);
			field453[arg3] = var7;
			arg1.method452(var7);
		}

		if ((arg2 & 0x8) != 0) {
			int var8 = arg0.method257();
			int var9 = arg0.method258();
			arg1.method18(var9, field538, var8);
			arg1.field80 = field538 + 300;
			arg1.field81 = arg0.method258();
			arg1.field82 = arg0.method257();
		}

		if ((arg2 & 0x80) != 0) {
			int var10 = arg0.method267();
			if (var10 == 0xFFFF) {
				var10 = -1;
			}

			int var11 = arg0.method238();
			if (arg1.field31 == var10 && var10 != -1) {
				int var12 = ZKWMIVTX.field1461[var10].field1475;
				if (var12 == 1) {
					arg1.field32 = 0;
					arg1.field33 = 0;
					arg1.field34 = var11;
					arg1.field35 = 0;
				}

				if (var12 == 2) {
					arg1.field35 = 0;
				}
			} else if (var10 == -1 || arg1.field31 == -1 || ZKWMIVTX.field1461[var10].field1469 >= ZKWMIVTX.field1461[arg1.field31].field1469) {
				arg1.field31 = var10;
				arg1.field32 = 0;
				arg1.field33 = 0;
				arg1.field34 = var11;
				arg1.field35 = 0;
				arg1.field49 = arg1.field67;
			}
		}

		if ((arg2 & 0x20) != 0) {
			arg1.field36 = arg0.method240();
			if (arg1.field36 == 0xFFFF) {
				arg1.field36 = -1;
			}
		}

		if ((arg2 & 0x100) != 0) {
			int var13 = arg0.method259();
			int var14 = arg0.method259();
			arg1.method18(var14, field538, var13);
			arg1.field80 = field538 + 300;
			arg1.field81 = arg0.method238();
			arg1.field82 = arg0.method259();
		}

		if ((arg2 & 0x200) != 0) {
			arg1.field50 = arg0.method238();
			arg1.field52 = arg0.method238();
			arg1.field51 = arg0.method259();
			arg1.field53 = arg0.method238();
			arg1.field54 = arg0.method240() + field538;
			arg1.field55 = arg0.method267() + field538;
			arg1.field56 = arg0.method238();
			arg1.method17();
		}

		if ((arg2 & 0x40) != 0) {
			int var15 = arg0.method267();
			int var16 = arg0.method259();
			int var17 = arg0.method238();
			int var18 = arg0.field714;

			if (arg1.field1116 != null && arg1.field1103) {
				long var19 = JYGZTITV.method318(arg1.field1116);
				boolean var21 = false;
				if (var16 <= 1) {
					for (int var22 = 0; var22 < field391; var22++) {
						if (field195[var22] == var19) {
							var21 = true;
							break;
						}
					}
				}

				if (!var21 && field501 == 0) {
					try {
						field243.field714 = 0;
						arg0.method275(field243.field713, 0, var17);
						field243.field714 = 0;
						String var23 = JBXCIWFE.method276(field243, var17);
						var23 = JSEWQIYU.method290(var23);
						arg1.field66 = var23;
						arg1.field44 = var15 >> 8;
						arg1.field68 = var15 & 0xFF;
						arg1.field48 = 150;

						if (var16 == 2 || var16 == 3) {
							method125(1, "@cr2@" + arg1.field1116, var23);
						} else if (var16 == 1) {
							method125(1, "@cr1@" + arg1.field1116, var23);
						} else {
							method125(2, arg1.field1116, var23);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field714 = var17 + var18;
		}

		if ((arg2 & 0x2) != 0) {
			arg1.field66 = arg0.method245();
			if (arg1.field66.charAt(0) == '~') {
				arg1.field66 = arg1.field66.substring(1);
				method125(2, arg1.field1116, arg1.field66);
			} else if (field163 == arg1) {
				method125(2, arg1.field1116, arg1.field66);
			}

			arg1.field44 = 0;
			arg1.field68 = 0;
			arg1.field48 = 150;
		}

		if ((arg2 & 0x1) != 0) {
			arg1.field45 = arg0.method240();
			arg1.field46 = arg0.method240();
		}

		if ((arg2 & 0x400) != 0) {
			arg1.field70 = arg0.method240();
			int var25 = arg0.method271();
			arg1.field74 = var25 >> 16;
			arg1.field73 = (var25 & 0xFFFF) + field538;
			arg1.field71 = 0;
			arg1.field72 = 0;

			if (arg1.field73 > field538) {
				arg1.field71 = -1;
			}

			if (arg1.field70 == 0xFFFF) {
				arg1.field70 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method120() {
		field543.method455();

		if (field325 == 2) {
			byte[] var1 = field406.field19;
			int[] var2 = DSAVPBJG.field562;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field311.method582(field359, 33, field296, 25, 0, 0, 33, 256, field552, 25);
			field544.method455();
		} else {
			int var5 = field359 + field279 & 0x7FF;
			int var6 = field163.field41 / 32 + 48;
			int var7 = 464 - field163.field42 / 32;
			field419.method582(var5, 151, field400, var6, 5, 25, 146, field248 + 256, field466, var7);
			field311.method582(field359, 33, field296, 25, 0, 0, 33, 256, field552, 25);

			for (int var8 = 0; var8 < field205; var8++) {
				int var9 = field206[var8] * 4 + 2 - field163.field41 / 32;
				int var10 = field207[var8] * 4 + 2 - field163.field42 / 32;
				method37(var9, field362[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					PILILDKN var13 = field251[field263][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field163.field41 / 32;
						int var15 = var12 * 4 + 2 - field163.field42 / 32;
						method37(var14, field169, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field245; var16++) {
				OTOMPFCI var17 = field244[field246[var16]];
				if (var17 != null && var17.method21()) {
					WHKCNEXD var18 = var17.field894;
					if (var18.field1332 != null) {
						var18 = var18.method518();
					}

					if (var18 != null && var18.field1312 && var18.field1328) {
						int var19 = var17.field41 / 32 - field163.field41 / 32;
						int var20 = var17.field42 / 32 - field163.field42 / 32;
						method37(var19, field170, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field449; var21++) {
				SJUCHLXH var22 = field448[field450[var21]];
				if (var22 != null && var22.method21()) {
					int var23 = var22.field41 / 32 - field163.field41 / 32;
					int var24 = var22.field42 / 32 - field163.field42 / 32;
					boolean var25 = false;
					long var26 = JYGZTITV.method318(var22.field1116);
					for (int var28 = 0; var28 < field511; var28++) {
						if (field302[var28] == var26 && field461[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field163.field1104 != 0 && var22.field1104 != 0 && field163.field1104 == var22.field1104) {
						var29 = true;
					}

					if (var25) {
						method37(var23, field172, var24);
					} else if (var29) {
						method37(var23, field173, var24);
					} else {
						method37(var23, field171, var24);
					}
				}
			}

			if (field304 != 0 && field538 % 20 < 10) {
				if (field304 == 1 && field474 >= 0 && field474 < field244.length) {
					OTOMPFCI var30 = field244[field474];
					if (var30 != null) {
						int var31 = var30.field41 / 32 - field163.field41 / 32;
						int var32 = var30.field42 / 32 - field163.field42 / 32;
						method81(field465, var31, var32);
					}
				}

				if (field304 == 2) {
					int var33 = (field506 - field290) * 4 + 2 - field163.field41 / 32;
					int var34 = (field507 - field291) * 4 + 2 - field163.field42 / 32;
					method81(field465, var33, var34);
				}

				if (field304 == 10 && field328 >= 0 && field328 < field448.length) {
					SJUCHLXH var35 = field448[field328];
					if (var35 != null) {
						int var36 = var35.field41 / 32 - field163.field41 / 32;
						int var37 = var35.field42 / 32 - field163.field42 / 32;
						method81(field465, var36, var37);
					}
				}
			}

			if (field417 != 0) {
				int var38 = field417 * 4 + 2 - field163.field41 / 32;
				int var39 = field418 * 4 + 2 - field163.field42 / 32;
				method37(var38, field464, var39);
			}

			DSAVPBJG.method196(0xFFFFFF, 97, 3, 3, 78);
			field544.method455();
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method121() {
		if (field481 == null) {
			field1290 = null;
			field545 = null;
			field543 = null;
			field542 = null;
			field544 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field484 = new SKZHQGHX(265, 128, method44());
			DSAVPBJG.method194();
			field485 = new SKZHQGHX(265, 128, method44());
			DSAVPBJG.method194();
			field481 = new SKZHQGHX(171, 509, method44());
			DSAVPBJG.method194();
			field482 = new SKZHQGHX(132, 360, method44());
			DSAVPBJG.method194();
			field483 = new SKZHQGHX(200, 360, method44());
			DSAVPBJG.method194();
			field486 = new SKZHQGHX(238, 202, method44());
			DSAVPBJG.method194();
			field487 = new SKZHQGHX(238, 203, method44());
			DSAVPBJG.method194();
			field488 = new SKZHQGHX(94, 74, method44());
			DSAVPBJG.method194();
			field489 = new SKZHQGHX(94, 75, method44());
			DSAVPBJG.method194();

			if (field256 != null) {
				method89();
				method35();
			}

			field540 = true;
		}
	}

	@ObfuscatedName("client.a(BI)Z")
	public final boolean method122(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field499[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 79) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.k(B)Z")
	public final boolean method123() {
		if (field345 == null) {
			return false;
		}

		try {
			int var1 = field345.method222();
			if (var1 == 0) {
				return false;
			}

			if (field437 == -1) {
				field345.method223(field213.field713, 0, 1);
				field437 = field213.field713[0] & 0xFF;
				if (field504 != null) {
					field437 = field437 - field504.method541() & 0xFF;
				}

				field436 = NSXWNAZM.field869[field437];
				var1--;
			}

			if (field436 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field345.method223(field213.field713, 0, 1);
				field436 = field213.field713[0] & 0xFF;
				var1--;
			}

			if (field436 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field345.method223(field213.field713, 0, 2);
				field213.field714 = 0;
				field436 = field213.method240();
				var1 -= 2;
			}

			if (var1 < field436) {
				return false;
			}

			field213.field714 = 0;
			field345.method223(field213.field713, 0, field436);
			field438 = 0;
			field317 = field316;
			field316 = field315;
			field315 = field437;

			if (field437 == 44) {
				field325 = field213.method238();
				field437 = -1;
				return true;
			}

			if (field437 == 117) {
				int var2 = field213.method265();
				method129(var2);

				if (field192 != -1) {
					field192 = -1;
					field183 = true;
				}

				if (field432 != 0) {
					field432 = 0;
					field183 = true;
				}

				field344 = var2;
				field520 = true;
				field313 = true;
				field226 = -1;
				field258 = false;
				field437 = -1;
				return true;
			}

			if (field437 == 253) {
				field534 = true;
				field547 = field213.method238();
				field548 = field213.method238();
				field549 = field213.method240();
				field550 = field213.method238();
				field551 = field213.method238();
				if (field551 >= 100) {
					field199 = field547 * 128 + 64;
					field201 = field548 * 128 + 64;
					field200 = method84(field201, field263, field199) - field549;
				}

				field437 = -1;
				return true;
			}

			if (field437 == 177) {
				String var3 = field213.method245();
				if (var3.endsWith(":tradereq:")) {
					String var4 = var3.substring(0, var3.indexOf(":"));
					long var5 = JYGZTITV.method318(var4);
					boolean var7 = false;
					for (int var8 = 0; var8 < field391; var8++) {
						if (field195[var8] == var5) {
							var7 = true;
							break;
						}
					}

					if (!var7 && field501 == 0) {
						method125(4, var4, "wishes to trade with you.");
					}
				} else if (var3.endsWith(":duelreq:")) {
					String var9 = var3.substring(0, var3.indexOf(":"));
					long var10 = JYGZTITV.method318(var9);
					boolean var12 = false;
					for (int var13 = 0; var13 < field391; var13++) {
						if (field195[var13] == var10) {
							var12 = true;
							break;
						}
					}

					if (!var12 && field501 == 0) {
						method125(8, var9, "wishes to duel with you.");
					}
				} else if (var3.endsWith(":chalreq:")) {
					String var14 = var3.substring(0, var3.indexOf(":"));
					long var15 = JYGZTITV.method318(var14);
					boolean var17 = false;
					for (int var18 = 0; var18 < field391; var18++) {
						if (field195[var18] == var15) {
							var17 = true;
							break;
						}
					}

					if (!var17 && field501 == 0) {
						String var19 = var3.substring(var3.indexOf(":") + 1, var3.length() - 9);
						method125(8, var14, var19);
					}
				} else {
					method125(0, "", var3);
				}

				field437 = -1;
				return true;
			}

			if (field437 == 179) {
				field417 = 0;
				field437 = -1;
				return true;
			}

			if (field437 == 254) {
				int var20 = field213.method265();
				int var21 = field213.method268();
				SJPORZIF var22 = SJPORZIF.field1040[var20];
				var22.field1057 = var21;

				if (var21 == -1) {
					var22.field1038 = 0;
					var22.field1043 = 0;
				}

				field437 = -1;
				return true;
			}

			if (field437 == 239) {
				int var23 = field213.method266();
				SJPORZIF.field1040[var23].field1061 = 3;

				if (field163.field1110 == null) {
					SJPORZIF.field1040[var23].field1062 = (field163.field1102[11] << 5) + (field163.field1102[8] << 10) + (field163.field1102[0] << 15) + (field163.field1124[0] << 25) + (field163.field1124[4] << 20) + field163.field1102[1];
				} else {
					SJPORZIF.field1040[var23].field1062 = (int) (field163.field1110.field1329 + 0x12345678L);
				}

				field437 = -1;
				return true;
			}

			if (field437 == 62) {
				field391 = field436 / 8;
				for (int var24 = 0; var24 < field391; var24++) {
					field195[var24] = field213.method244();
				}

				field437 = -1;
				return true;
			}

			if (field437 == 156) {
				field520 = true;
				int var25 = field213.method240();
				SJPORZIF var26 = SJPORZIF.field1040[var25];
				while (field213.field714 < field436) {
					int var27 = field213.method252();
					int var28 = field213.method240();
					int var29 = field213.method238();
					if (var29 == 255) {
						var29 = field213.method243();
					}

					if (var27 >= 0 && var27 < var26.field1075.length) {
						var26.field1075[var27] = var28;
						var26.field1039[var27] = var29;
					}
				}

				field437 = -1;
				return true;
			}

			if (field437 == 22) {
				field522 = field213.method259();
				field520 = true;
				field313 = true;
				field437 = -1;
				return true;
			}

			if (field437 == 144) {
				for (int var30 = 0; var30 < field187.length; var30++) {
					if (field521[var30] != field187[var30]) {
						field187[var30] = field521[var30];
						method63(var30);
						field520 = true;
					}
				}

				field437 = -1;
				return true;
			}

			if (field437 == 163) {
				if (field344 != -1) {
					field344 = -1;
					field520 = true;
					field313 = true;
				}

				if (field192 != -1) {
					field192 = -1;
					field183 = true;
				}

				if (field432 != 0) {
					field432 = 0;
					field183 = true;
				}

				field226 = -1;
				field258 = false;
				field437 = -1;
				return true;
			}

			if (field437 == 86) {
				int var31 = field213.method265();
				int var32 = field213.method266();
				int var33 = field213.method240();
				SJPORZIF.field1040[var33].field1096 = (var32 << 16) + var31;
				field437 = -1;
				return true;
			}

			if (field437 == 69) {
				method101(field436, field213);
				field443 = false;
				field437 = -1;
				return true;
			}

			if (field437 == 155) {
				long var34 = field213.method244();
				int var36 = field213.method238();
				String var37 = JYGZTITV.method322(JYGZTITV.method319(var34));
				for (int var38 = 0; var38 < field511; var38++) {
					if (field302[var38] == var34) {
						if (field461[var38] != var36) {
							field461[var38] = var36;
							field520 = true;

							if (var36 > 0) {
								method125(5, "", var37 + " has logged in.");
							}

							if (var36 == 0) {
								method125(5, "", var37 + " has logged out.");
							}
						}

						var37 = null;
						break;
					}
				}

				if (var37 != null && field511 < 200) {
					field302[field511] = var34;
					field363[field511] = var37;
					field461[field511] = var36;
					field511++;
					field520 = true;
				}

				boolean var39 = false;
				while (!var39) {
					var39 = true;
					for (int var40 = 0; var40 < field511 - 1; var40++) {
						if (field461[var40] != field275 && field461[var40 + 1] == field275 || field461[var40] == 0 && field461[var40 + 1] != 0) {
							int var41 = field461[var40];
							field461[var40] = field461[var40 + 1];
							field461[var40 + 1] = var41;
							String var42 = field363[var40];
							field363[var40] = field363[var40 + 1];
							field363[var40 + 1] = var42;
							long var43 = field302[var40];
							field302[var40] = field302[var40 + 1];
							field302[var40 + 1] = var43;
							field520 = true;
							var39 = false;
						}
					}
				}

				field437 = -1;
				return true;
			}

			if (field437 == 213) {
				method42(field436, field213);
				field437 = -1;
				return true;
			}

			if (field437 == 60) {
				int var45 = field213.method267();
				int var46 = field213.method240();
				int var47 = field213.method265();
				int var48 = field213.method267();
				SJPORZIF.field1040[var47].field1053 = var48;
				SJPORZIF.field1040[var47].field1054 = var46;
				SJPORZIF.field1040[var47].field1052 = var45;
				field437 = -1;
				return true;
			}

			if (field437 == 153) {
				field351 = field213.method240();
				field471 = field213.method259();
				field437 = -1;
				return true;
			}

			if (field437 == 85) {
				byte var49 = field213.method261();
				int var50 = field213.method265();
				field521[var50] = var49;

				if (field187[var50] != var49) {
					field187[var50] = var49;
					method63(var50);
					field520 = true;

					if (field404 != -1) {
						field183 = true;
					}
				}

				field437 = -1;
				return true;
			}

			if (field437 == 252) {
				field515 = field213.method240() * 30;
				field437 = -1;
				return true;
			}

			if (field437 != 66 && field437 != 97) {
				if (field437 == 6) {
					int var101 = field213.method266();
					int var102 = field213.method240();
					SJPORZIF var103 = SJPORZIF.field1040[var102];
					if (var103 != null && var103.field1087 == 0) {
						if (var101 < 0) {
							var101 = 0;
						}

						if (var101 > var103.field1037 - var103.field1085) {
							var101 = var103.field1037 - var103.field1085;
						}

						var103.field1084 = var101;
					}

					field437 = -1;
					return true;
				}

				if (field437 != 76 && field437 != 147 && field437 != 54 && field437 != 243 && field437 != 100 && field437 != 96 && field437 != 9 && field437 != 107 && field437 != 222 && field437 != 211 && field437 != 94) {
					if (field437 == 64) {
						field304 = field213.method238();
						if (field304 == 1) {
							field474 = field213.method240();
						}

						if (field304 >= 2 && field304 <= 6) {
							if (field304 == 2) {
								field509 = 64;
								field510 = 64;
							}

							if (field304 == 3) {
								field509 = 0;
								field510 = 64;
							}

							if (field304 == 4) {
								field509 = 128;
								field510 = 64;
							}

							if (field304 == 5) {
								field509 = 64;
								field510 = 0;
							}

							if (field304 == 6) {
								field509 = 64;
								field510 = 128;
							}

							field304 = 2;
							field506 = field213.method240();
							field507 = field213.method240();
							field508 = field213.method238();
						}

						if (field304 == 10) {
							field328 = field213.method240();
						}

						field437 = -1;
						return true;
					}

					if (field437 == 16) {
						int var104 = field213.method266();
						SJPORZIF var105 = SJPORZIF.field1040[var104];
						for (int var106 = 0; var106 < var105.field1075.length; var106++) {
							var105.field1075[var106] = -1;
							var105.field1075[var106] = 0;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 152) {
						int var107 = field213.method240();
						method129(var107);

						if (field344 != -1) {
							field344 = -1;
							field520 = true;
							field313 = true;
						}

						field192 = var107;
						field183 = true;
						field226 = -1;
						field258 = false;
						field437 = -1;
						return true;
					}

					if (field437 == 40) {
						method166();
						field437 = -1;
						return false;
					}

					if (field437 == 208) {
						field523 = field213.method238();
						field437 = -1;
						return true;
					}

					if (field437 == 203) {
						int var108 = field213.method240();
						int var109 = field213.method266();
						int var110 = field213.method267();
						if (var110 == 0xFFFF) {
							SJPORZIF.field1040[var108].field1061 = 0;
							field437 = -1;
							return true;
						}

						SFKBIDFK var111 = SFKBIDFK.method438(var110);
						SJPORZIF.field1040[var108].field1061 = 4;
						SJPORZIF.field1040[var108].field1062 = var110;
						SJPORZIF.field1040[var108].field1053 = var111.field1004;
						SJPORZIF.field1040[var108].field1054 = var111.field995;
						SJPORZIF.field1040[var108].field1052 = var111.field1011 * 100 / var109;
						field437 = -1;
						return true;
					}

					if (field437 == 240) {
						int var112 = field213.method240();
						int var113 = field213.method240();
						SJPORZIF.field1040[var113].field1061 = 2;
						SJPORZIF.field1040[var113].field1062 = var112;
						field437 = -1;
						return true;
					}

					if (field437 == 204) {
						boolean var114 = field213.method259() == 1;
						int var115 = field213.method265();
						SJPORZIF.field1040[var115].field1046 = var114;
						field437 = -1;
						return true;
					}

					if (field437 == 205) {
						int var116 = field213.method266();
						if (var116 == 0xFFFF) {
							var116 = -1;
						}

						if (field329 != var116 && field167 && !field278 && field193 == 0) {
							field305 = var116;
							field306 = true;
							field380.method469(2, field305);
						}

						field329 = var116;
						field437 = -1;
						return true;
					}

					if (field437 == 194) {
						int var117 = field213.method240();
						int var118 = field213.method242();
						if (field167 && !field278) {
							field305 = var117;
							field306 = false;
							field380.method469(2, field305);
							field193 = var118;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 73) {
						if (field522 == 12) {
							field520 = true;
						}

						field411 = field213.method238();
						field437 = -1;
						return true;
					}

					if (field437 == 167) {
						String var119 = field213.method245();
						int var120 = field213.method266();
						SJPORZIF.field1040[var120].field1041 = var119;

						if (field388[field522] == SJPORZIF.field1040[var120].field1049) {
							field520 = true;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 180) {
						String var121 = field213.method245();
						int var122 = field213.method258();
						int var123 = field213.method257();
						if (var123 >= 1 && var123 <= 5) {
							if (var121.equalsIgnoreCase("null")) {
								var121 = null;
							}

							field444[var123 - 1] = var121;
							field445[var123 - 1] = var122 == 0;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 224) {
						int var124 = field213.method238();
						int var125 = field213.method238();
						int var126 = field213.method238();
						int var127 = field213.method238();
						field346[var124] = true;
						field282[var124] = var125;
						field177[var124] = var126;
						field176[var124] = var127;
						field274[var124] = 0;
						field437 = -1;
						return true;
					}

					if (field437 == 114) {
						int var128 = field213.method240();
						int var129 = field213.method238();
						int var130 = field213.method240();
						if (field310 && !field278 && field257 < 50) {
							field198[field257] = var128;
							field185[field257] = var129;
							field347[field257] = EJAYDEWE.field573[var128] + var130;
							field257++;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 4) {
						int var131 = field213.method241();
						int var132 = field213.method266();
						int var133 = field213.method268();
						SJPORZIF var134 = SJPORZIF.field1040[var132];
						var134.field1089 = var131;
						var134.field1092 = var133;
						field437 = -1;
						return true;
					}

					if (field437 == 41) {
						int var135 = field213.method238();
						int var136 = field213.method240();
						if (var136 == 0xFFFF) {
							var136 = -1;
						}

						field388[var135] = var136;
						field520 = true;
						field313 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 226) {
						field520 = true;
						int var137 = field213.method240();
						SJPORZIF var138 = SJPORZIF.field1040[var137];
						int var139 = field213.method240();
						for (int var140 = 0; var140 < var139; var140++) {
							var138.field1075[var140] = field213.method267();
							int var141 = field213.method259();
							if (var141 == 255) {
								var141 = field213.method272();
							}

							var138.field1039[var140] = var141;
						}

						for (int var142 = var139; var142 < var138.field1075.length; var142++) {
							var138.field1075[var142] = 0;
							var138.field1039[var142] = 0;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 170) {
						int var143 = field213.method270();
						int var144 = field213.method267();
						field521[var144] = var143;

						if (field187[var144] != var143) {
							field187[var144] = var143;
							method63(var144);
							field520 = true;

							if (field404 != -1) {
								field183 = true;
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 88) {
						if (field522 == 12) {
							field520 = true;
						}

						field214 = field213.method241();
						field437 = -1;
						return true;
					}

					if (field437 == 32) {
						int var145 = field213.method265();
						int var146 = field213.method267();
						int var147 = var146 >> 10 & 0x1F;
						int var148 = var146 >> 5 & 0x1F;
						int var149 = var146 & 0x1F;
						SJPORZIF.field1040[var145].field1051 = (var149 << 3) + (var147 << 19) + (var148 << 11);
						field437 = -1;
						return true;
					}

					if (field437 == 238) {
						field534 = true;
						field237 = field213.method238();
						field238 = field213.method238();
						field239 = field213.method240();
						field240 = field213.method238();
						field241 = field213.method238();
						if (field241 >= 100) {
							int var150 = field237 * 128 + 64;
							int var151 = field238 * 128 + 64;
							int var152 = method84(var151, field263, var150) - field239;
							int var153 = var150 - field199;
							int var154 = var152 - field200;
							int var155 = var151 - field201;
							int var156 = (int) Math.sqrt(var153 * var153 + var155 * var155);
							field202 = (int) (Math.atan2(var154, var156) * 325.949D) & 0x7FF;
							field203 = (int) (Math.atan2(var153, var155) * -325.949D) & 0x7FF;

							if (field202 < 128) {
								field202 = 128;
							}

							if (field202 > 383) {
								field202 = 383;
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 98) {
						int var157 = field213.method269();
						if (var157 >= 0) {
							method129(var157);
						}

						field340 = var157;
						field437 = -1;
						return true;
					}

					if (field437 == 131) {
						field308 = field213.method257();
						field309 = field213.method258();
						field437 = -1;
						return true;
					}

					if (field437 == 166) {
						field217 = field213.method270();
						field260 = field213.method238();
						field350 = field213.method267();
						field301 = field213.method265();
						field255 = field213.method258();
						if (field217 != 0 && field226 == -1) {
							signlink.dnslookup(JYGZTITV.method321(field217));
							method76();
							short var158 = 650;
							if (field260 != 201 || field255 == 1) {
								var158 = 655;
							}

							field215 = "";
							field353 = false;

							for (int var159 = 0; var159 < SJPORZIF.field1040.length; var159++) {
								if (SJPORZIF.field1040[var159] != null && SJPORZIF.field1040[var159].field1086 == var158) {
									field226 = SJPORZIF.field1040[var159].field1049;
									break;
								}
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 67) {
						long var160 = field213.method244();
						int var162 = field213.method243();
						int var163 = field213.method238();
						boolean var164 = false;
						for (int var165 = 0; var165 < 100; var165++) {
							if (field162[var165] == var162) {
								var164 = true;
								break;
							}
						}

						if (var163 <= 1) {
							for (int var166 = 0; var166 < field391; var166++) {
								if (field195[var166] == var160) {
									var164 = true;
									break;
								}
							}
						}

						if (!var164 && field501 == 0) {
							try {
								field162[field503] = var162;
								field503 = (field503 + 1) % 100;
								String var167 = JBXCIWFE.method276(field213, field436 - 13);
								if (var163 != 3) {
									var167 = JSEWQIYU.method290(var167);
								}

								if (var163 == 2 || var163 == 3) {
									method125(7, "@cr2@" + JYGZTITV.method322(JYGZTITV.method319(var160)), var167);
								} else if (var163 == 1) {
									method125(7, "@cr1@" + JYGZTITV.method322(JYGZTITV.method319(var160)), var167);
								} else {
									method125(3, JYGZTITV.method322(JYGZTITV.method319(var160)), var167);
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 87) {
						field308 = field213.method259();
						field309 = field213.method238();

						while (field213.field714 < field436) {
							int var169 = field213.method238();
							method127(var169, field213);
						}

						field437 = -1;
						return true;
					}

					if (field437 == 115) {
						field341 = field213.method257();
						if (field522 == field341) {
							if (field341 == 3) {
								field522 = 1;
							} else {
								field522 = 3;
							}

							field520 = true;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 0) {
						field367 = false;
						field432 = 2;
						field408 = "";
						field183 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 199) {
						field534 = false;

						for (int var170 = 0; var170 < 5; var170++) {
							field346[var170] = false;
						}

						field437 = -1;
						return true;
					}

					if (field437 == 154) {
						field364 = field213.method238();
						field454 = field213.method238();
						field428 = field213.method238();
						field150 = true;
						field183 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 17) {
						field512 = field213.method238();
						field520 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 92) {
						int var171 = field213.method241();
						field404 = var171;
						field183 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 113) {
						int var172 = field213.method266();
						int var173 = field213.method240();
						SJPORZIF.field1040[var173].field1061 = 1;
						SJPORZIF.field1040[var173].field1062 = var172;
						field437 = -1;
						return true;
					}

					if (field437 == 126) {
						field367 = false;
						field432 = 1;
						field408 = "";
						field183 = true;
						field437 = -1;
						return true;
					}

					if (field437 == 145) {
						field520 = true;
						int var174 = field213.method257();
						int var175 = field213.method243();
						int var176 = field213.method258();
						field225[var174] = var175;
						field318[var174] = var176;
						field210[var174] = 1;
						for (int var177 = 0; var177 < 98; var177++) {
							if (var175 >= field429[var177]) {
								field210[var174] = var177 + 2;
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 178) {
						int var178 = field213.method265();
						int var179 = field213.method240();

						if (field192 != -1) {
							field192 = -1;
							field183 = true;
						}

						if (field432 != 0) {
							field432 = 0;
							field183 = true;
						}

						field226 = var179;
						field344 = var178;
						field520 = true;
						field313 = true;
						field258 = false;
						field437 = -1;
						return true;
					}

					if (field437 == 39) {
						field308 = field213.method257();
						field309 = field213.method238();
						for (int var180 = field308; var180 < field308 + 8; var180++) {
							for (int var181 = field309; var181 < field309 + 8; var181++) {
								if (field251[field263][var180][var181] != null) {
									field251[field263][var180][var181] = null;
									method91(var180, var181);
								}
							}
						}

						for (FHZFOSDU var182 = (FHZFOSDU) field378.method382(); var182 != null; var182 = (FHZFOSDU) field378.method384()) {
							if (var182.field622 >= field308 && var182.field622 < field308 + 8 && var182.field623 >= field309 && var182.field623 < field309 + 8 && field263 == var182.field620) {
								var182.field630 = 0;
							}
						}

						field437 = -1;
						return true;
					}

					if (field437 == 112) {
						int var183 = field213.method266();
						method129(var183);

						if (field344 != -1) {
							field344 = -1;
							field520 = true;
							field313 = true;
						}

						if (field192 != -1) {
							field192 = -1;
							field183 = true;
						}

						if (field432 != 0) {
							field432 = 0;
							field183 = true;
						}

						field226 = var183;
						field258 = false;
						field437 = -1;
						return true;
					}

					if (field437 == 249) {
						for (int var184 = 0; var184 < field448.length; var184++) {
							if (field448[var184] != null) {
								field448[var184].field31 = -1;
							}
						}

						for (int var185 = 0; var185 < field244.length; var185++) {
							if (field244[var185] != null) {
								field244[var185].field31 = -1;
							}
						}

						field437 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field437 + "," + field436 + " - " + field316 + "," + field317);
					method166();
					return true;
				}

				method127(field437, field213);
				field437 = -1;
				return true;
			}

			int var51 = field402;
			int var52 = field403;
			if (field437 == 66) {
				var51 = field213.method265();
				var52 = field213.method240();
				field541 = false;
			}

			if (field437 == 97) {
				var52 = field213.method240();
				var51 = field213.method265();
				field213.method248();

				for (int var53 = 0; var53 < 4; var53++) {
					for (int var54 = 0; var54 < 13; var54++) {
						for (int var55 = 0; var55 < 13; var55++) {
							int var56 = field213.method249(1);
							if (var56 == 1) {
								field186[var53][var54][var55] = field213.method249(26);
							} else {
								field186[var53][var54][var55] = -1;
							}
						}
					}
				}

				field213.method250();
				field541 = true;
			}

			if (field402 == var51 && field403 == var52 && field196 == 2) {
				field437 = -1;
				return true;
			}

			field402 = var51;
			field403 = var52;
			field290 = (field402 - 6) * 8;
			field291 = (field403 - 6) * 8;
			field531 = false;
			if ((field402 / 8 == 48 || field402 / 8 == 49) && field403 / 8 == 48) {
				field531 = true;
			}

			if (field402 / 8 == 48 && field403 / 8 == 148) {
				field531 = true;
			}

			field196 = 1;
			field398 = System.currentTimeMillis();
			field544.method455();
			field334.method176(151, 0, 257, "Loading - please wait.");
			field334.method176(150, 0xFFFFFF, 256, "Loading - please wait.");
			field544.method456(4, 4, field1289);

			if (field437 == 66) {
				int var57 = 0;
				for (int var58 = (field402 - 6) / 8; var58 <= (field402 + 6) / 8; var58++) {
					for (int var59 = (field403 - 6) / 8; var59 <= (field403 + 6) / 8; var59++) {
						var57++;
					}
				}

				field147 = new byte[var57][];
				field288 = new byte[var57][];
				field477 = new int[var57];
				field478 = new int[var57];
				field479 = new int[var57];
				int var60 = 0;
				for (int var61 = (field402 - 6) / 8; var61 <= (field402 + 6) / 8; var61++) {
					for (int var62 = (field403 - 6) / 8; var62 <= (field403 + 6) / 8; var62++) {
						field477[var60] = (var61 << 8) + var62;

						if (field531 && (var62 == 49 || var62 == 149 || var62 == 147 || var61 == 50 || var61 == 49 && var62 == 47)) {
							field478[var60] = -1;
							field479[var60] = -1;
							var60++;
						} else {
							int var63 = field478[var60] = field380.method465(var61, var62, 0);
							if (var63 != -1) {
								field380.method469(3, var63);
							}

							int var64 = field479[var60] = field380.method465(var61, var62, 1);
							if (var64 != -1) {
								field380.method469(3, var64);
							}

							var60++;
						}
					}
				}
			}

			if (field437 == 97) {
				int var65 = 0;
				int[] var66 = new int[676];
				for (int var67 = 0; var67 < 4; var67++) {
					for (int var68 = 0; var68 < 13; var68++) {
						for (int var69 = 0; var69 < 13; var69++) {
							int var70 = field186[var67][var68][var69];
							if (var70 != -1) {
								int var71 = var70 >> 14 & 0x3FF;
								int var72 = var70 >> 3 & 0x7FF;
								int var73 = (var71 / 8 << 8) + var72 / 8;
								for (int var74 = 0; var74 < var65; var74++) {
									if (var66[var74] == var73) {
										var73 = -1;
										break;
									}
								}

								if (var73 != -1) {
									var66[var65++] = var73;
								}
							}
						}
					}
				}

				field147 = new byte[var65][];
				field288 = new byte[var65][];
				field477 = new int[var65];
				field478 = new int[var65];
				field479 = new int[var65];
				for (int var75 = 0; var75 < var65; var75++) {
					int var76 = field477[var75] = var66[var75];
					int var77 = var76 >> 8 & 0xFF;
					int var78 = var76 & 0xFF;
					int var79 = field478[var75] = field380.method465(var77, var78, 0);
					if (var79 != -1) {
						field380.method469(3, var79);
					}

					int var80 = field479[var75] = field380.method465(var77, var78, 1);
					if (var80 != -1) {
						field380.method469(3, var80);
					}
				}
			}

			int var81 = field290 - field292;
			int var82 = field291 - field293;
			field292 = field290;
			field293 = field291;

			for (int var83 = 0; var83 < 16384; var83++) {
				OTOMPFCI var84 = field244[var83];
				if (var84 != null) {
					for (int var85 = 0; var85 < 10; var85++) {
						var84.field75[var85] -= var81;
						var84.field76[var85] -= var82;
					}

					var84.field41 -= var81 * 128;
					var84.field42 -= var82 * 128;
				}
			}

			for (int var86 = 0; var86 < field446; var86++) {
				SJUCHLXH var87 = field448[var86];
				if (var87 != null) {
					for (int var88 = 0; var88 < 10; var88++) {
						var87.field75[var88] -= var81;
						var87.field76[var88] -= var82;
					}

					var87.field41 -= var81 * 128;
					var87.field42 -= var82 * 128;
				}
			}

			field443 = true;
			byte var89 = 0;
			byte var90 = 104;
			byte var91 = 1;
			if (var81 < 0) {
				var89 = 103;
				var90 = -1;
				var91 = -1;
			}

			byte var92 = 0;
			byte var93 = 104;
			byte var94 = 1;
			if (var82 < 0) {
				var92 = 103;
				var93 = -1;
				var94 = -1;
			}

			for (int var95 = var89; var95 != var90; var95 += var91) {
				for (int var96 = var92; var96 != var93; var96 += var94) {
					int var97 = var81 + var95;
					int var98 = var82 + var96;
					for (int var99 = 0; var99 < 4; var99++) {
						if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
							field251[var99][var95][var96] = field251[var99][var97][var98];
						} else {
							field251[var99][var95][var96] = null;
						}
					}
				}
			}

			for (FHZFOSDU var100 = (FHZFOSDU) field378.method382(); var100 != null; var100 = (FHZFOSDU) field378.method384()) {
				var100.field622 -= var81;
				var100.field623 -= var82;
				if (var100.field622 < 0 || var100.field623 < 0 || var100.field622 >= 104 || var100.field623 >= 104) {
					var100.method540();
				}
			}

			if (field417 != 0) {
				field417 -= var81;
				field418 -= var82;
			}

			field534 = false;
			field437 = -1;
			return true;
		} catch (IOException var190) {
			method64();
		} catch (Exception var191) {
			String var187 = "T2 - " + field437 + "," + field316 + "," + field317 + " - " + field436 + "," + (field163.field75[0] + field290) + "," + (field163.field76[0] + field291) + " - ";
			for (int var188 = 0; var188 < field436 && var188 < 50; var188++) {
				var187 = var187 + field213.field713[var188] + ",";
			}

			signlink.reporterror(var187);
			method166();
		}

		return true;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method124(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;B)V")
	public final void method125(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field404 != -1) {
			field209 = arg2;
			field1303 = 0;
		}

		if (field192 == -1) {
			field183 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field297[var4] = field297[var4 - 1];
			field298[var4] = field298[var4 - 1];
			field299[var4] = field299[var4 - 1];
		}

		field297[0] = arg0;
		field298[0] = arg1;
		field299[0] = arg2;
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
	public final String method126(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILIMUIZRAF;Z)V")
	public final void method127(int arg0, IMUIZRAF arg1) {
		if (arg0 == 211) {
			int var3 = arg1.method259();
			int var4 = (var3 >> 4 & 0x7) + field308;
			int var5 = (var3 & 0x7) + field309;
			int var6 = arg1.method258();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field327[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method71(field263, -1, -1, var5, var7, var9, 0, var4, var8);
			}
		} else if (arg0 == 243) {
			int var10 = arg1.method265();
			int var11 = arg1.method240();
			int var12 = arg1.method267();
			int var13 = arg1.method258();
			int var14 = (var13 >> 4 & 0x7) + field308;
			int var15 = (var13 & 0x7) + field309;
			if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && field351 != var11) {
				SIBDNEIR var16 = new SIBDNEIR();
				var16.field1034 = var12;
				var16.field1033 = var10;

				if (field251[field263][var14][var15] == null) {
					field251[field263][var14][var15] = new PILILDKN();
				}

				field251[field263][var14][var15].method379(var16);
				method91(var14, var15);
			}
		} else if (arg0 == 147) {
			int var17 = arg1.method238();
			int var18 = (var17 >> 4 & 0x7) + field308;
			int var19 = (var17 & 0x7) + field309;
			int var20 = arg1.method240();
			int var21 = arg1.method240();
			int var22 = arg1.method240();
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
				PILILDKN var23 = field251[field263][var18][var19];
				if (var23 != null) {
					for (SIBDNEIR var24 = (SIBDNEIR) var23.method382(); var24 != null; var24 = (SIBDNEIR) var23.method384()) {
						if ((var20 & 0x7FFF) == var24.field1034 && var24.field1033 == var21) {
							var24.field1033 = var22;
							break;
						}
					}

					method91(var18, var19);
				}
			}
		} else {
			if (arg0 == 54) {
				int var25 = arg1.method240();
				int var26 = arg1.method266();
				byte var27 = arg1.method239();
				byte var28 = arg1.method239();
				byte var29 = arg1.method261();
				byte var30 = arg1.method260();
				int var31 = arg1.method238();
				int var32 = (var31 >> 4 & 0x7) + field308;
				int var33 = (var31 & 0x7) + field309;
				int var34 = arg1.method265();
				int var35 = arg1.method240();
				int var36 = arg1.method259();
				int var37 = var36 >> 2;
				int var38 = var36 & 0x3;
				int var39 = field327[var37];
				SJUCHLXH var40;
				if (field351 == var35) {
					var40 = field163;
				} else {
					var40 = field448[var35];
				}

				if (var40 != null) {
					PZZVQRQI var41 = PZZVQRQI.method398(var26);
					int var42 = field139[field263][var32][var33];
					int var43 = field139[field263][var32 + 1][var33];
					int var44 = field139[field263][var32 + 1][var33 + 1];
					int var45 = field139[field263][var32][var33 + 1];
					YABPKWWG var46 = var41.method405(var37, var38, var42, var43, var44, var45, -1);
					if (var46 != null) {
						method71(field263, -1, var34 + 1, var33, 0, var39, var25 + 1, var32, 0);
						var40.field1105 = field538 + var25;
						var40.field1106 = field538 + var34;
						var40.field1122 = var46;
						int var47 = var41.field939;
						int var48 = var41.field913;
						if (var38 == 1 || var38 == 3) {
							var47 = var41.field913;
							var48 = var41.field939;
						}

						var40.field1119 = var32 * 128 + var47 * 64;
						var40.field1121 = var33 * 128 + var48 * 64;
						var40.field1120 = method84(var40.field1121, field263, var40.field1119);

						if (var30 > var27) {
							byte var49 = var30;
							var30 = var27;
							var27 = var49;
						}

						if (var29 > var28) {
							byte var50 = var29;
							var29 = var28;
							var28 = var50;
						}

						var40.field1111 = var30 + var32;
						var40.field1113 = var27 + var32;
						var40.field1112 = var29 + var33;
						var40.field1114 = var28 + var33;
					}
				}
			}

			if (arg0 == 107) {
				int var51 = arg1.method258();
				int var52 = (var51 >> 4 & 0x7) + field308;
				int var53 = (var51 & 0x7) + field309;
				int var54 = arg1.method266();
				int var55 = arg1.method240();
				if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
					SIBDNEIR var56 = new SIBDNEIR();
					var56.field1034 = var54;
					var56.field1033 = var55;

					if (field251[field263][var52][var53] == null) {
						field251[field263][var52][var53] = new PILILDKN();
					}

					field251[field263][var52][var53].method379(var56);
					method91(var52, var53);
				}
			} else if (arg0 == 9) {
				int var57 = arg1.method258();
				int var58 = (var57 >> 4 & 0x7) + field308;
				int var59 = (var57 & 0x7) + field309;
				int var60 = arg1.method267();
				if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
					PILILDKN var61 = field251[field263][var58][var59];
					if (var61 != null) {
						for (SIBDNEIR var62 = (SIBDNEIR) var61.method382(); var62 != null; var62 = (SIBDNEIR) var61.method384()) {
							if ((var60 & 0x7FFF) == var62.field1034) {
								var62.method540();
								break;
							}
						}

						if (var61.method382() == null) {
							field251[field263][var58][var59] = null;
						}

						method91(var58, var59);
					}
				}
			} else if (arg0 == 222) {
				int var63 = arg1.method240();
				int var64 = arg1.method258();
				int var65 = var64 >> 2;
				int var66 = var64 & 0x3;
				int var67 = field327[var65];
				int var68 = arg1.method257();
				int var69 = (var68 >> 4 & 0x7) + field308;
				int var70 = (var68 & 0x7) + field309;
				if (var69 >= 0 && var70 >= 0 && var69 < 103 && var70 < 103) {
					int var71 = field139[field263][var69][var70];
					int var72 = field139[field263][var69 + 1][var70];
					int var73 = field139[field263][var69 + 1][var70 + 1];
					int var74 = field139[field263][var69][var70 + 1];
					if (var67 == 0) {
						VGKCLWHN var75 = field469.method347(var69, var70, field263);
						if (var75 != null) {
							int var76 = var75.field1254 >> 14 & 0x7FFF;
							if (var65 == 2) {
								var75.field1252 = new EZOFESYN(var66 + 4, false, var72, var74, var73, var71, var76, var63, 2);
								var75.field1253 = new EZOFESYN(var66 + 1 & 0x3, false, var72, var74, var73, var71, var76, var63, 2);
							} else {
								var75.field1252 = new EZOFESYN(var66, false, var72, var74, var73, var71, var76, var63, var65);
							}
						}
					}

					if (var67 == 1) {
						FMITQVWZ var77 = field469.method348(field263, var70, var69);
						if (var77 != null) {
							var77.field637 = new EZOFESYN(0, false, var72, var74, var73, var71, var77.field638 >> 14 & 0x7FFF, var63, 4);
						}
					}

					if (var67 == 2) {
						CFFZYHSC var78 = field469.method349(var70, field263, var69);

						if (var65 == 11) {
							var65 = 10;
						}

						if (var78 != null) {
							var78.field103 = new EZOFESYN(var66, false, var72, var74, var73, var71, var78.field111 >> 14 & 0x7FFF, var63, var65);
						}
					}

					if (var67 == 3) {
						GECRAMUD var79 = field469.method350(field263, var70, var69);
						if (var79 != null) {
							var79.field643 = new EZOFESYN(var66, false, var72, var74, var73, var71, var79.field644 >> 14 & 0x7FFF, var63, 22);
						}
					}
				}
			} else if (arg0 == 94) {
				int var80 = arg1.method238();
				int var81 = (var80 >> 4 & 0x7) + field308;
				int var82 = (var80 & 0x7) + field309;
				int var83 = arg1.method238();
				int var84 = var83 >> 2;
				int var85 = var83 & 0x3;
				int var86 = field327[var84];
				int var87 = arg1.method265();
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
					method71(field263, var87, -1, var82, var84, var86, 0, var81, var85);
				}
			} else if (arg0 == 100) {
				int var88 = arg1.method238();
				int var89 = (var88 >> 4 & 0x7) + field308;
				int var90 = (var88 & 0x7) + field309;
				int var91 = arg1.method240();
				int var92 = arg1.method238();
				int var93 = arg1.method240();
				if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
					var89 = var89 * 128 + 64;
					var90 = var90 * 128 + 64;
					EPOYVBCN var94 = new EPOYVBCN(var89, var90, field538, field263, method84(var90, field263, var89) - var92, var93, var91);
					field546.method379(var94);
				}
			} else if (arg0 == 76) {
				int var95 = arg1.method238();
				int var96 = (var95 >> 4 & 0x7) + field308;
				int var97 = (var95 & 0x7) + field309;
				int var98 = arg1.method240();
				int var99 = arg1.method238();
				int var100 = var99 >> 4 & 0xF;
				int var101 = var99 & 0x7;
				if (field163.field75[0] >= var96 - var100 && field163.field75[0] <= var96 + var100 && field163.field76[0] >= var97 - var100 && field163.field76[0] <= var97 + var100 && field310 && !field278 && field257 < 50) {
					field198[field257] = var98;
					field185[field257] = var101;
					field347[field257] = EJAYDEWE.field573[var98];
					field257++;
				}
			} else if (arg0 == 96) {
				int var102 = arg1.method238();
				int var103 = (var102 >> 4 & 0x7) + field308;
				int var104 = (var102 & 0x7) + field309;
				int var105 = var103 + arg1.method239();
				int var106 = var104 + arg1.method239();
				int var107 = arg1.method241();
				int var108 = arg1.method240();
				int var109 = arg1.method238() * 4;
				int var110 = arg1.method238() * 4;
				int var111 = arg1.method240();
				int var112 = arg1.method240();
				int var113 = arg1.method238();
				int var114 = arg1.method238();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
					var103 = var103 * 128 + 64;
					var104 = var104 * 128 + 64;
					var105 = var105 * 128 + 64;
					var106 = var106 * 128 + 64;
					OPRNYJBH var115 = new OPRNYJBH(var114, field538 + var111, var113, method84(var104, field263, var103) - var109, field263, var104, var110, var103, var107, field538 + var112, var108);
					var115.method376(var105, var106, field538 + var111, method84(var106, field263, var105) - var110);
					field431.method379(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method128() {
		try {
			field365 = -1;
			field546.method386();
			field431.method386();
			VRKDWHDQ.method497();
			method58();
			field469.method325();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field491[var1].method528();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field463[var2][var3][var4] = 0;
					}
				}
			}

			QJLJTPQV var5 = new QJLJTPQV(104, field463, 104, field139);
			int var6 = field147.length;
			field194.method227(184);

			if (!field541) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field477[var7] >> 8) * 64 - field290;
					int var9 = (field477[var7] & 0xFF) * 64 - field291;
					byte[] var10 = field147[var7];
					if (var10 != null) {
						var5.method408(var10, var8, var9, (field402 - 6) * 8, field491, (field403 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field477[var11] >> 8) * 64 - field290;
					int var13 = (field477[var11] & 0xFF) * 64 - field291;
					byte[] var14 = field147[var11];
					if (var14 == null && field403 < 800) {
						var5.method424(64, var12, var13, 64);
					}
				}

				field194.method227(184);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field288[var15];
					if (var16 != null) {
						int var17 = (field477[var15] >> 8) * 64 - field290;
						int var18 = (field477[var15] & 0xFF) * 64 - field291;
						var5.method414(field469, var16, var17, field491, var18);
					}
				}
			}

			if (field541) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field186[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field477.length; var28++) {
									if (field477[var28] == var27 && field147[var28] != null) {
										var5.method411(var21 * 8, var24, field491, var23, var20 * 8, (var25 & 0x7) * 8, var19, (var26 & 0x7) * 8, field147[var28]);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field186[0][var29][var30];
						if (var31 == -1) {
							var5.method424(8, var29 * 8, var30 * 8, 8);
						}
					}
				}

				field194.method227(184);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field186[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field477.length; var41++) {
									if (field477[var41] == var40 && field288[var41] != null) {
										var5.method420(var33 * 8, field491, (var38 & 0x7) * 8, var37, var36, var32, field469, (var39 & 0x7) * 8, var34 * 8, field288[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field194.method227(184);
			var5.method422(field469, field491);
			field544.method455();
			field194.method227(184);
			int var42 = QJLJTPQV.field967;
			if (var42 > field263) {
				var42 = field263;
			}

			if (var42 < field263 - 1) {
				int var43 = field263 - 1;
			}

			if (field278) {
				field469.method326(QJLJTPQV.field967);
			} else {
				field469.method326(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method91(var44, var45);
				}
			}

			method117();
		} catch (Exception var58) {
		}

		PZZVQRQI.field918.method527();

		if (field1292 != null) {
			field194.method227(4);
			field194.method232(1057001181);
		}

		if (field278 && signlink.cache_dat != null) {
			int var47 = field380.method474(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field380.method480(var48);
				if ((var49 & 0x79) == 0) {
					YABPKWWG.method547(var48);
				}
			}
		}

		System.gc();
		VRKDWHDQ.method498(20);
		field380.method475();
		int var50 = (field402 - 6) / 8 - 1;
		int var51 = (field402 + 6) / 8 + 1;
		int var52 = (field403 - 6) / 8 - 1;
		int var53 = (field403 + 6) / 8 + 1;
		if (field531) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field380.method465(var54, var55, 0);
					if (var56 != -1) {
						field380.method477(var56, 3);
					}

					int var57 = field380.method465(var54, var55, 1);
					if (var57 != -1) {
						field380.method477(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method129(int arg0) {
		SJPORZIF var2 = SJPORZIF.field1040[arg0];
		for (int var3 = 0; var3 < var2.field1035.length && var2.field1035[var3] != -1; var3++) {
			SJPORZIF var4 = SJPORZIF.field1040[var2.field1035[var3]];
			if (var4.field1087 == 1) {
				method129(var4.field1081);
			}

			var4.field1038 = 0;
			var4.field1043 = 0;
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method130(boolean arg0) {
		method121();
		field483.method455();
		field252.method13(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field468 == 0) {
			int var4 = var3 / 2 + 80;
			field333.method177(field380.field1200, var2 / 2, var4, true, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field335.method177("Welcome to RuneScape", var2 / 2, var5, true, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field253.method13(var6 - 73, var7 - 20);
			field335.method177("New User", var6, var7 + 5, true, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field253.method13(var8 - 73, var7 - 20);
			field335.method177("Existing User", var8, var7 + 5, true, 0xFFFFFF);
		}

		if (field468 == 2) {
			int var9 = var3 / 2 - 40;
			if (field148.length() > 0) {
				field335.method177(field148, var2 / 2, var9 - 15, true, 0xFFFF00);
				field335.method177(field149, var2 / 2, var9, true, 0xFFFF00);
				var9 += 30;
			} else {
				field335.method177(field149, var2 / 2, var9 - 7, true, 0xFFFF00);
				var9 += 30;
			}

			field335.method184(0xFFFFFF, "Username: " + field129 + (field138 == 0 & field538 % 40 < 20 ? "@yel@|" : ""), true, var9, var2 / 2 - 90);
			var9 += 15;
			field335.method184(0xFFFFFF, "Password: " + JYGZTITV.method323(field130) + (field138 == 1 & field538 % 40 < 20 ? "@yel@|" : ""), true, var9, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field253.method13(var10 - 73, var11 - 20);
				field335.method177("Login", var10, var11 + 5, true, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field253.method13(var12 - 73, var11 - 20);
				field335.method177("Cancel", var12, var11 + 5, true, 0xFFFFFF);
			}
		}

		if (field468 == 3) {
			field335.method177("Create a free account", var2 / 2, var3 / 2 - 60, true, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field335.method177("To create a new account you need to", var2 / 2, var13, true, 0xFFFFFF);
			var13 += 15;
			field335.method177("go back to the main RuneScape webpage", var2 / 2, var13, true, 0xFFFFFF);
			var13 += 15;
			field335.method177("and choose the red 'create account'", var2 / 2, var13, true, 0xFFFFFF);
			var13 += 15;
			field335.method177("button at the top right of that page.", var2 / 2, var13, true, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field253.method13(var14 - 73, var15 - 20);
			field335.method177("Cancel", var14, var15 + 5, true, 0xFFFFFF);
		}

		field483.method456(202, 171, field1289);

		if (field540) {
			field540 = false;
			field481.method456(128, 0, field1289);
			field482.method456(202, 371, field1289);
			field486.method456(0, 265, field1289);
			field487.method456(562, 265, field1289);
			field488.method456(128, 171, field1289);
			field489.method456(562, 171, field1289);
		}
	}

	@ObfuscatedName("client.a(IIIILSJPORZIF;)V")
	public final void method131(int arg0, int arg1, int arg2, SJPORZIF arg3) {
		if (arg3.field1087 == 0 && arg3.field1035 != null && (!arg3.field1046 || field229 == arg3.field1081 || field136 == arg3.field1081 || field330 == arg3.field1081)) {
			int var5 = DSAVPBJG.field567;
			int var6 = DSAVPBJG.field565;
			int var7 = DSAVPBJG.field568;
			int var8 = DSAVPBJG.field566;
			DSAVPBJG.method193(arg3.field1067 + arg1, arg3.field1085 + arg0, arg1, arg0);
			int var9 = arg3.field1035.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field1094[var10] + arg1;
				int var12 = arg3.field1091[var10] + arg0 - arg2;
				SJPORZIF var13 = SJPORZIF.field1040[arg3.field1035[var10]];
				var11 += var13.field1089;
				var12 += var13.field1092;

				if (var13.field1086 > 0) {
					method65(var13);
				}

				if (var13.field1087 == 0) {
					if (var13.field1084 > var13.field1037 - var13.field1085) {
						var13.field1084 = var13.field1037 - var13.field1085;
					}

					if (var13.field1084 < 0) {
						var13.field1084 = 0;
					}

					method131(var12, var11, var13.field1084, var13);

					if (var13.field1037 > var13.field1085) {
						method55(var13.field1084, var13.field1085, var13.field1067 + var11, var13.field1037, var12);
					}
				} else if (var13.field1087 != 1) {
					if (var13.field1087 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1085; var15++) {
							for (int var16 = 0; var16 < var13.field1067; var16++) {
								int var17 = (var13.field1070 + 32) * var16 + var11;
								int var18 = (var13.field1080 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1065[var14];
									var18 += var13.field1055[var14];
								}

								if (var13.field1075[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1075[var14] - 1;
									if (var17 > DSAVPBJG.field567 - 32 && var17 < DSAVPBJG.field568 && var18 > DSAVPBJG.field565 - 32 && var18 < DSAVPBJG.field566 || field394 != 0 && field393 == var14) {
										int var22 = 0;
										if (field423 == 1 && field424 == var14 && field425 == var13.field1081) {
											var22 = 0xFFFFFF;
										}

										YHASUFYG var23 = SFKBIDFK.method445(var13.field1039[var14], var22, var21);
										if (var23 != null) {
											if (field394 != 0 && field393 == var14 && field392 == var13.field1081) {
												var19 = field1297 - field395;
												var20 = field1298 - field396;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field502 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method580(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < DSAVPBJG.field565 && arg3.field1084 > 0) {
													int var24 = (DSAVPBJG.field565 - var18 - var20) * field536 / 3;
													if (var24 > field536 * 10) {
														var24 = field536 * 10;
													}

													if (var24 > arg3.field1084) {
														var24 = arg3.field1084;
													}

													arg3.field1084 -= var24;
													field396 += var24;
												}

												if (var18 + var20 + 32 > DSAVPBJG.field566 && arg3.field1084 < arg3.field1037 - arg3.field1085) {
													int var25 = (var18 + var20 + 32 - DSAVPBJG.field566) * field536 / 3;
													if (var25 > field536 * 10) {
														var25 = field536 * 10;
													}

													if (var25 > arg3.field1037 - arg3.field1085 - arg3.field1084) {
														var25 = arg3.field1037 - arg3.field1085 - arg3.field1084;
													}

													arg3.field1084 += var25;
													field396 -= var25;
												}
											} else if (field134 != 0 && field133 == var14 && field132 == var13.field1081) {
												var23.method580(var18, var17, 128);
											} else {
												var23.method578(var17, var18);
											}

											if (var23.field1455 == 33 || var13.field1039[var14] != 1) {
												int var26 = var13.field1039[var14];
												field333.method180(var18 + var20 + 10, method54(var26), var17 + var19 + 1, 0);
												field333.method180(var18 + var20 + 9, method54(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1077 != null && var14 < 20) {
									YHASUFYG var27 = var13.field1077[var14];
									if (var27 != null) {
										var27.method578(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1087 == 3) {
						boolean var28 = false;
						if (field330 == var13.field1081 || field136 == var13.field1081 || field229 == var13.field1081) {
							var28 = true;
						}

						int var29;
						if (method33(var13)) {
							var29 = var13.field1063;
							if (var28 && var13.field1060 != 0) {
								var29 = var13.field1060;
							}
						} else {
							var29 = var13.field1051;
							if (var28 && var13.field1066 != 0) {
								var29 = var13.field1066;
							}
						}

						if (var13.field1071 == 0) {
							if (var13.field1044) {
								DSAVPBJG.method196(var29, var11, var13.field1067, var13.field1085, var12);
							} else {
								DSAVPBJG.method197(var12, var13.field1067, var11, var13.field1085, var29);
							}
						} else if (var13.field1044) {
							DSAVPBJG.method195(256 - (var13.field1071 & 0xFF), var13.field1067, var12, var11, var13.field1085, var29);
						} else {
							DSAVPBJG.method198(var12, var13.field1067, var11, var29, var13.field1085, 256 - (var13.field1071 & 0xFF));
						}
					} else if (var13.field1087 == 4) {
						DIVYVFFL var30 = var13.field1074;
						String var31 = var13.field1041;
						boolean var32 = false;
						if (field330 == var13.field1081 || field136 == var13.field1081 || field229 == var13.field1081) {
							var32 = true;
						}

						int var33;
						if (method33(var13)) {
							var33 = var13.field1063;
							if (var32 && var13.field1060 != 0) {
								var33 = var13.field1060;
							}

							if (var13.field1045.length() > 0) {
								var31 = var13.field1045;
							}
						} else {
							var33 = var13.field1051;
							if (var32 && var13.field1066 != 0) {
								var33 = var13.field1066;
							}
						}

						if (var13.field1047 == 6 && field258) {
							var31 = "Please wait...";
							var33 = var13.field1051;
						}

						if (DSAVPBJG.field563 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field559 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method126(method41(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method126(method41(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method126(method41(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method126(method41(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method126(method41(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1078) {
								var30.method177(var41, var13.field1067 / 2 + var11, var34, var13.field1059, var33);
							} else {
								var30.method184(var33, var41, var13.field1059, var34, var11);
							}

							var34 += var30.field559;
						}
					} else if (var13.field1087 == 5) {
						YHASUFYG var42;
						if (method33(var13)) {
							var42 = var13.field1082;
						} else {
							var42 = var13.field1095;
						}

						if (var42 != null) {
							var42.method578(var11, var12);
						}
					} else if (var13.field1087 == 6) {
						int var43 = VRKDWHDQ.field1263;
						int var44 = VRKDWHDQ.field1264;
						VRKDWHDQ.field1263 = var13.field1067 / 2 + var11;
						VRKDWHDQ.field1264 = var13.field1085 / 2 + var12;
						int var45 = VRKDWHDQ.field1267[var13.field1053] * var13.field1052 >> 16;
						int var46 = VRKDWHDQ.field1268[var13.field1053] * var13.field1052 >> 16;
						boolean var47 = method33(var13);
						int var48;
						if (var47) {
							var48 = var13.field1058;
						} else {
							var48 = var13.field1057;
						}

						YABPKWWG var49;
						if (var48 == -1) {
							var49 = var13.method446(var47, -1, -1);
						} else {
							ZKWMIVTX var50 = ZKWMIVTX.field1461[var48];
							var49 = var13.method446(var47, var50.field1463[var13.field1038], var50.field1464[var13.field1038]);
						}

						if (var49 != null) {
							var49.method568(0, var13.field1054, 0, var13.field1053, 0, var45, var46);
						}

						VRKDWHDQ.field1263 = var43;
						VRKDWHDQ.field1264 = var44;
					} else if (var13.field1087 == 7) {
						DIVYVFFL var51 = var13.field1074;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1085; var53++) {
							for (int var54 = 0; var54 < var13.field1067; var54++) {
								if (var13.field1075[var52] > 0) {
									SFKBIDFK var55 = SFKBIDFK.method438(var13.field1075[var52] - 1);
									String var56 = var55.field990;
									if (var55.field1020 || var13.field1039[var52] != 1) {
										var56 = var56 + " x" + method52(var13.field1039[var52]);
									}

									int var57 = (var13.field1070 + 115) * var54 + var11;
									int var58 = (var13.field1080 + 12) * var53 + var12;
									if (var13.field1078) {
										var51.method177(var56, var13.field1067 / 2 + var57, var58, var13.field1059, var13.field1051);
									} else {
										var51.method184(var13.field1051, var56, var13.field1059, var58, var57);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			DSAVPBJG.method193(var7, var8, var5, var6);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method132() {
		field331++;
		method139(true);
		method45(true);
		method139(false);
		method45(false);
		method98();
		method106();

		if (!field534) {
			int var1 = field358;
			if (field324 / 256 > var1) {
				var1 = field324 / 256;
			}

			if (field346[4] && field177[4] + 128 > var1) {
				var1 = field177[4] + 128;
			}

			int var2 = field529 + field359 & 0x7FF;
			method155(var1 * 3 + 600, var1, field413, var2, field412, method84(field163.field42, field263, field163.field41) - 50);
		}

		int var3;
		if (field534) {
			var3 = method68();
		} else {
			var3 = method67();
		}

		int var4 = field199;
		int var5 = field200;
		int var6 = field201;
		int var7 = field202;
		int var8 = field203;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field346[var9]) {
				int var10 = (int) (Math.random() * (field282[var9] * 2 + 1) + Math.sin(field176[var9] / 100.0D * field274[var9]) * field177[var9] - field282[var9]);
				if (var9 == 0) {
					field199 += var10;
				}

				if (var9 == 1) {
					field200 += var10;
				}

				if (var9 == 2) {
					field201 += var10;
				}

				if (var9 == 3) {
					field203 = field203 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field202 += var10;
					if (field202 < 128) {
						field202 = 128;
					}

					if (field202 > 383) {
						field202 = 383;
					}
				}
			}
		}

		int var11 = VRKDWHDQ.field1278;
		YABPKWWG.field1441 = true;
		YABPKWWG.field1444 = 0;
		YABPKWWG.field1442 = field1297 - 4;
		YABPKWWG.field1443 = field1298 - 4;
		DSAVPBJG.method194();
		field469.method364(field199, var3, field200, field202, field203, field201);
		field469.method339();
		method165();
		method143();
		method73(var11);
		method38();
		field544.method456(4, 4, field1289);
		field199 = var4;
		field200 = var5;
		field201 = var6;
		field202 = var7;
		field203 = var8;
	}

	@ObfuscatedName("client.a(ZILIMUIZRAF;)V")
	public final void method133(int arg0, IMUIZRAF arg1) {
		while (arg1.field715 + 21 < arg0 * 8) {
			int var3 = arg1.method249(14);
			if (var3 == 16383) {
				break;
			}

			if (field244[var3] == null) {
				field244[var3] = new OTOMPFCI();
			}

			OTOMPFCI var4 = field244[var3];
			field246[field245++] = var3;
			var4.field69 = field538;
			int var5 = arg1.method249(1);
			var4.field894 = WHKCNEXD.method521(arg1.method249(12));
			int var6 = arg1.method249(1);
			if (var6 == 1) {
				field452[field451++] = var3;
			}

			int var7 = arg1.method249(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method249(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field30 = var4.field894.field1343;
			var4.field60 = var4.field894.field1323;
			var4.field62 = var4.field894.field1315;
			var4.field63 = var4.field894.field1327;
			var4.field64 = var4.field894.field1333;
			var4.field65 = var4.field894.field1319;
			var4.field78 = var4.field894.field1317;
			var4.method19(field163.field75[0] + var7, var5 == 1, field163.field76[0] + var8);
		}

		arg1.method250();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method134() {
		int var1 = field547 * 128 + 64;
		int var2 = field548 * 128 + 64;
		int var3 = method84(var2, field263, var1) - field549;

		if (field199 < var1) {
			field199 += (var1 - field199) * field551 / 1000 + field550;
			if (field199 > var1) {
				field199 = var1;
			}
		}

		if (field199 > var1) {
			field199 -= (field199 - var1) * field551 / 1000 + field550;
			if (field199 < var1) {
				field199 = var1;
			}
		}

		if (field200 < var3) {
			field200 += (var3 - field200) * field551 / 1000 + field550;
			if (field200 > var3) {
				field200 = var3;
			}
		}

		if (field200 > var3) {
			field200 -= (field200 - var3) * field551 / 1000 + field550;
			if (field200 < var3) {
				field200 = var3;
			}
		}

		if (field201 < var2) {
			field201 += (var2 - field201) * field551 / 1000 + field550;
			if (field201 > var2) {
				field201 = var2;
			}
		}

		if (field201 > var2) {
			field201 -= (field201 - var2) * field551 / 1000 + field550;
			if (field201 < var2) {
				field201 = var2;
			}
		}

		int var4 = field237 * 128 + 64;
		int var5 = field238 * 128 + 64;
		int var6 = method84(var5, field263, var4) - field239;
		int var7 = var4 - field199;
		int var8 = var6 - field200;
		int var9 = var5 - field201;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field202 < var11) {
			field202 += (var11 - field202) * field241 / 1000 + field240;
			if (field202 > var11) {
				field202 = var11;
			}
		}

		if (field202 > var11) {
			field202 -= (field202 - var11) * field241 / 1000 + field240;
			if (field202 < var11) {
				field202 = var11;
			}
		}

		int var13 = var12 - field203;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field203 += field241 * var13 / 1000 + field240;
			field203 &= 0x7FF;
		}

		if (var13 < 0) {
			field203 -= -var13 * field241 / 1000 + field240;
			field203 &= 0x7FF;
		}

		int var14 = var12 - field203;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field203 = var12;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method135() {
		int var1 = field179;
		int var2 = field180;
		int var3 = field181;
		int var4 = field182;
		int var5 = 0x5D5447;
		DSAVPBJG.method196(var5, var1, var3, var4, var2);
		DSAVPBJG.method196(0, var1 + 1, var3 - 2, 16, var2 + 1);
		DSAVPBJG.method197(var2 + 18, var3 - 2, var1 + 1, var4 - 19, 0);
		field335.method180(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field1297;
		int var7 = field1298;
		if (field178 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field178 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field178 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field175; var8++) {
			int var9 = (field175 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field335.method184(var10, field247[var8], true, var9, var1 + 3);
		}
	}

	@ObfuscatedName("client.a(IIIIIILSJPORZIF;)V")
	public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, SJPORZIF arg5) {
		if (arg5.field1087 == 0 && arg5.field1035 != null && !arg5.field1046 && (arg1 >= arg2 && arg0 >= arg4 && arg1 <= arg5.field1067 + arg2 && arg0 <= arg5.field1085 + arg4)) {
			int var7 = arg5.field1035.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field1094[var8] + arg2;
				int var10 = arg5.field1091[var8] + arg4 - arg3;
				SJPORZIF var11 = SJPORZIF.field1040[arg5.field1035[var8]];
				var9 += var11.field1089;
				var10 += var11.field1092;
				if ((var11.field1093 >= 0 || var11.field1066 != 0) && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
					if (var11.field1093 >= 0) {
						field127 = var11.field1093;
					} else {
						field127 = var11.field1081;
					}
				}

				if (var11.field1087 == 0) {
					method136(arg0, arg1, var9, var11.field1084, var10, var11);

					if (var11.field1037 > var11.field1085) {
						method85(var11.field1085, true, var11, var10, var11.field1037, var11.field1067 + var9, arg1, arg0);
					}
				} else {
					if (var11.field1047 == 1 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						boolean var12 = false;
						if (var11.field1086 != 0) {
							var12 = method142(var11);
						}

						if (!var12) {
							field247[field175] = var11.field1036;
							field499[field175] = 843;
							field498[field175] = var11.field1081;
							field175++;
						}
					}

					if (var11.field1047 == 2 && field188 == 0 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						String var13 = var11.field1076;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field247[field175] = var13 + " @gre@" + var11.field1083;
						field499[field175] = 841;
						field498[field175] = var11.field1081;
						field175++;
					}

					if (var11.field1047 == 3 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						field247[field175] = "Close";
						field499[field175] = 329;
						field498[field175] = var11.field1081;
						field175++;
					}

					if (var11.field1047 == 4 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						field247[field175] = var11.field1036;
						field499[field175] = 938;
						field498[field175] = var11.field1081;
						field175++;
					}

					if (var11.field1047 == 5 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						field247[field175] = var11.field1036;
						field499[field175] = 936;
						field498[field175] = var11.field1081;
						field175++;
					}

					if (var11.field1047 == 6 && !field258 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.field1067 + var9 && arg0 < var11.field1085 + var10) {
						field247[field175] = var11.field1036;
						field499[field175] = 264;
						field498[field175] = var11.field1081;
						field175++;
					}

					if (var11.field1087 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1085; var15++) {
							for (int var16 = 0; var16 < var11.field1067; var16++) {
								int var17 = (var11.field1070 + 32) * var16 + var9;
								int var18 = (var11.field1080 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1065[var14];
									var18 += var11.field1055[var14];
								}

								if (arg1 >= var17 && arg0 >= var18 && arg1 < var17 + 32 && arg0 < var18 + 32) {
									field513 = var14;
									field514 = var11.field1081;

									if (var11.field1075[var14] > 0) {
										SFKBIDFK var19 = SFKBIDFK.method438(var11.field1075[var14] - 1);
										if (field423 == 1 && var11.field1097) {
											if (field425 != var11.field1081 || field424 != var14) {
												field247[field175] = "Use " + field427 + " with @lre@" + var19.field990;
												field499[field175] = 637;
												field500[field175] = var19.field999;
												field497[field175] = var14;
												field498[field175] = var11.field1081;
												field175++;
											}
										} else if (field188 != 1 || !var11.field1097) {
											if (var11.field1097) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field1001 != null && var19.field1001[var20] != null) {
														field247[field175] = var19.field1001[var20] + " @lre@" + var19.field990;

														if (var20 == 3) {
															field499[field175] = 36;
														}

														if (var20 == 4) {
															field499[field175] = 815;
														}

														field500[field175] = var19.field999;
														field497[field175] = var14;
														field498[field175] = var11.field1081;
														field175++;
													} else if (var20 == 4) {
														field247[field175] = "Drop @lre@" + var19.field990;
														field499[field175] = 815;
														field500[field175] = var19.field999;
														field497[field175] = var14;
														field498[field175] = var11.field1081;
														field175++;
													}
												}
											}

											if (var11.field1073) {
												field247[field175] = "Use @lre@" + var19.field990;
												field499[field175] = 68;
												field500[field175] = var19.field999;
												field497[field175] = var14;
												field498[field175] = var11.field1081;
												field175++;
											}

											if (var11.field1097 && var19.field1001 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field1001[var21] != null) {
														field247[field175] = var19.field1001[var21] + " @lre@" + var19.field990;

														if (var21 == 0) {
															field499[field175] = 257;
														}

														if (var21 == 1) {
															field499[field175] = 104;
														}

														if (var21 == 2) {
															field499[field175] = 984;
														}

														field500[field175] = var19.field999;
														field497[field175] = var14;
														field498[field175] = var11.field1081;
														field175++;
													}
												}
											}

											if (var11.field1048 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1048[var22] != null) {
														field247[field175] = var11.field1048[var22] + " @lre@" + var19.field990;

														if (var22 == 0) {
															field499[field175] = 114;
														}

														if (var22 == 1) {
															field499[field175] = 819;
														}

														if (var22 == 2) {
															field499[field175] = 474;
														}

														if (var22 == 3) {
															field499[field175] = 541;
														}

														if (var22 == 4) {
															field499[field175] = 140;
														}

														field500[field175] = var19.field999;
														field497[field175] = var14;
														field498[field175] = var11.field1081;
														field175++;
													}
												}
											}

											field247[field175] = "Examine @lre@" + var19.field990;
											field499[field175] = 1313;
											field500[field175] = var19.field999;
											field497[field175] = var14;
											field498[field175] = var11.field1081;
											field175++;
										} else if ((field190 & 0x10) == 0x10) {
											field247[field175] = field191 + " @lre@" + var19.field990;
											field499[field175] = 522;
											field500[field175] = var19.field999;
											field497[field175] = var14;
											field498[field175] = var11.field1081;
											field175++;
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

	@ObfuscatedName("client.B(I)V")
	public final void method137() {
		if (field394 == 0) {
			int var1 = field1303;
			if (field188 == 1 && field1304 >= 516 && field1305 >= 160 && field1304 <= 765 && field1305 <= 205) {
				var1 = 0;
			}

			if (field455) {
				if (var1 != 1) {
					int var2 = field1297;
					int var3 = field1298;
					if (field178 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field178 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field178 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field179 - 10 || var2 > field181 + field179 + 10 || var3 < field180 - 10 || var3 > field182 + field180 + 10) {
						field455 = false;

						if (field178 == 1) {
							field520 = true;
						}

						if (field178 == 2) {
							field183 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field179;
					int var5 = field180;
					int var6 = field181;
					int var7 = field1304;
					int var8 = field1305;
					if (field178 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field178 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field178 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field175; var10++) {
						int var11 = (field175 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method115(var9);
					}

					field455 = false;

					if (field178 == 1) {
						field520 = true;
					}

					if (field178 == 2) {
						field183 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field175 > 0) {
					int var12 = field499[field175 - 1];
					if (var12 == 114 || var12 == 819 || var12 == 474 || var12 == 541 || var12 == 140 || var12 == 257 || var12 == 104 || var12 == 984 || var12 == 36 || var12 == 815 || var12 == 68 || var12 == 1313) {
						int var13 = field497[field175 - 1];
						int var14 = field498[field175 - 1];
						SJPORZIF var15 = SJPORZIF.field1040[var14];
						if (var15.field1068 || var15.field1088) {
							field473 = false;
							field502 = 0;
							field392 = var14;
							field393 = var13;
							field394 = 2;
							field395 = field1304;
							field396 = field1305;

							if (SJPORZIF.field1040[var14].field1049 == field226) {
								field394 = 1;
							}

							if (SJPORZIF.field1040[var14].field1049 == field192) {
								field394 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field322 == 1 || method122(field175 - 1)) && field175 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field175 > 0) {
					method115(field175 - 1);
				}

				if (var1 != 2 || field175 <= 0) {
					return;
				}

				method69();
			}
		}
	}

	@ObfuscatedName("client.b(ILIMUIZRAF;I)V")
	public final void method138(IMUIZRAF arg0, int arg1) {
		int var3 = arg0.method249(8);
		if (var3 < field449) {
			for (int var4 = var3; var4 < field449; var4++) {
				field422[field421++] = field450[var4];
			}
		}

		if (var3 > field449) {
			signlink.reporterror(field129 + " Too many players");
			throw new RuntimeException("eek");
		}

		field449 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field450[var5];
			SJUCHLXH var7 = field448[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field450[field449++] = var6;
				var7.field69 = field538;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field450[field449++] = var6;
					var7.field69 = field538;
					field452[field451++] = var6;
				} else if (var9 == 1) {
					field450[field449++] = var6;
					var7.field69 = field538;
					int var10 = arg0.method249(3);
					var7.method20(false, var10);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field452[field451++] = var6;
					}
				} else if (var9 == 2) {
					field450[field449++] = var6;
					var7.field69 = field538;
					int var12 = arg0.method249(3);
					var7.method20(true, var12);
					int var13 = arg0.method249(3);
					var7.method20(true, var13);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field452[field451++] = var6;
					}
				} else if (var9 == 3) {
					field422[field421++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method139(boolean arg0) {
		if (field163.field41 >> 7 == field417 && field163.field42 >> 7 == field418) {
			field417 = 0;
		}

		int var2 = field449;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			SJUCHLXH var4;
			int var5;
			if (arg0) {
				var4 = field163;
				var5 = field447 << 14;
			} else {
				var4 = field448[field450[var3]];
				var5 = field450[var3] << 14;
			}

			if (var4 != null && var4.method21()) {
				var4.field1107 = false;
				if ((field278 && field449 > 50 || field449 > 200) && !arg0 && var4.field78 == var4.field57) {
					var4.field1107 = true;
				}

				int var6 = var4.field41 >> 7;
				int var7 = var4.field42 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1122 == null || field538 < var4.field1105 || field538 >= var4.field1106) {
						if ((var4.field41 & 0x7F) == 0x40 && (var4.field42 & 0x7F) == 0x40) {
							if (field348[var6][var7] == field331) {
								continue;
							}

							field348[var6][var7] = field331;
						}

						var4.field1125 = method84(var4.field42, field263, var4.field41);
						field469.method336(var4.field1125, var5, 60, var4.field41, var4, field263, var4.field42, var4.field43, var4.field29);
					} else {
						var4.field1107 = false;
						var4.field1125 = method84(var4.field42, field263, var4.field41);
						field469.method337(60, var4.field41, var4.field1114, var5, var4.field1111, var4.field1125, var4.field43, field263, var4, var4.field1113, var4.field1112, var4.field42);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method140() {
		try {
			int var1 = field163.field41 + field441;
			int var2 = field163.field42 + field261;
			if (field412 - var1 < -500 || field412 - var1 > 500 || field413 - var2 < -500 || field413 - var2 > 500) {
				field412 = var1;
				field413 = var2;
			}

			if (field412 != var1) {
				field412 += (var1 - field412) / 16;
			}

			if (field413 != var2) {
				field413 += (var2 - field413) / 16;
			}

			if (field1307[1] == 1) {
				field360 += (-field360 - 24) / 2;
			} else if (field1307[2] == 1) {
				field360 += (24 - field360) / 2;
			} else {
				field360 /= 2;
			}

			if (field1307[3] == 1) {
				field361 += (12 - field361) / 2;
			} else if (field1307[4] == 1) {
				field361 += (-field361 - 12) / 2;
			} else {
				field361 /= 2;
			}

			field359 = field360 / 2 + field359 & 0x7FF;
			field358 += field361 / 2;
			if (field358 < 128) {
				field358 = 128;
			}

			if (field358 > 383) {
				field358 = 383;
			}

			int var3 = field412 >> 7;
			int var4 = field413 >> 7;
			int var5 = method84(field413, field263, field412);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field263;
						if (var9 < 3 && (field463[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field139[var9][var7][var8];
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

			if (var11 > field324) {
				field324 += (var11 - field324) / 24;
			} else if (var11 < field324) {
				field324 += (var11 - field324) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field163.field41 + "," + field163.field42 + "," + field412 + "," + field413 + "," + field402 + "," + field403 + "," + field290 + "," + field291);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method141() {
		field434++;
		if (field434 > 138) {
			field434 = 0;
			field194.method227(104);
			field194.method228(156);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method515();
					if (var1 == -1) {
						return;
					}

					if (field226 != -1 && field430 == field226) {
						break;
					}

					if (field367) {
						if (var1 >= 32 && var1 <= 122 && field227.length() < 80) {
							field227 = field227 + (char) var1;
							field183 = true;
						}

						if (var1 == 8 && field227.length() > 0) {
							field227 = field227.substring(0, field227.length() - 1);
							field183 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field367 = false;
							field183 = true;

							if (field493 == 1) {
								long var2 = JYGZTITV.method318(field227);
								method87(var2);
							}

							if (field493 == 2 && field511 > 0) {
								long var4 = JYGZTITV.method318(field227);
								method112(var4);
							}

							if (field493 == 3 && field227.length() > 0) {
								field194.method227(53);
								field194.method228(0);
								int var6 = field194.field714;
								field194.method234(field220);
								JBXCIWFE.method277(field227, field194);
								field194.method237(field194.field714 - var6);
								field227 = JBXCIWFE.method278(field227);
								field227 = JSEWQIYU.method290(field227);
								method125(6, JYGZTITV.method322(JYGZTITV.method319(field220)), field227);

								if (field454 == 2) {
									field454 = 1;
									field150 = true;
									field194.method227(112);
									field194.method228(field364);
									field194.method228(field454);
									field194.method228(field428);
								}
							}

							if (field493 == 4 && field391 < 100) {
								long var7 = JYGZTITV.method318(field227);
								method66(var7);
							}

							if (field493 == 5 && field391 > 0) {
								long var9 = JYGZTITV.method318(field227);
								method94(var9);
							}
						}
					} else if (field432 == 1) {
						if (var1 >= 48 && var1 <= 57 && field408.length() < 10) {
							field408 = field408 + (char) var1;
							field183 = true;
						}

						if (var1 == 8 && field408.length() > 0) {
							field408 = field408.substring(0, field408.length() - 1);
							field183 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field408.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field408);
								} catch (Exception var21) {
								}

								field194.method227(134);
								field194.method232(var11);
							}

							field432 = 0;
							field183 = true;
						}
					} else if (field432 == 2) {
						if (var1 >= 32 && var1 <= 122 && field408.length() < 12) {
							field408 = field408 + (char) var1;
							field183 = true;
						}

						if (var1 == 8 && field408.length() > 0) {
							field408 = field408.substring(0, field408.length() - 1);
							field183 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field408.length() > 0) {
								field194.method227(69);
								field194.method234(JYGZTITV.method318(field408));
							}

							field432 = 0;
							field183 = true;
						}
					} else if (field192 == -1) {
						if (var1 >= 32 && var1 <= 122 && field250.length() < 80) {
							field250 = field250 + (char) var1;
							field183 = true;
						}

						if (var1 == 8 && field250.length() > 0) {
							field250 = field250.substring(0, field250.length() - 1);
							field183 = true;
						}

						if ((var1 == 13 || var1 == 10) && field250.length() > 0) {
							if (field204 == 2) {
								if (field250.equals("::clientdrop")) {
									method64();
								}

								if (field250.equals("::lag")) {
									method43();
								}

								if (field250.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field380.method474(2); var12++) {
										field380.method468(2, var12, (byte) 1);
									}
								}

								if (field250.equals("::fpson")) {
									field528 = true;
								}

								if (field250.equals("::fpsoff")) {
									field528 = false;
								}

								if (field250.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field491[var13].field1361[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field250.startsWith("::")) {
								field194.method227(98);
								field194.method228(field250.length() - 1);
								field194.method235(field250.substring(2));
							} else {
								String var16 = field250.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field250 = field250.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field250 = field250.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field250 = field250.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field250 = field250.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field250 = field250.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field250 = field250.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field250 = field250.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field250 = field250.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field250 = field250.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field250 = field250.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field250 = field250.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field250 = field250.substring(6);
								}

								String var18 = field250.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field250 = field250.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field250 = field250.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field250 = field250.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field250 = field250.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field250 = field250.substring(6);
								}

								field194.method227(228);
								field194.method228(0);
								int var20 = field194.field714;
								field194.method256(var17);
								field243.field714 = 0;
								JBXCIWFE.method277(field250, field243);
								field194.method273(field243.field713, field243.field714, 0);
								field194.method228(var19);
								field194.method237(field194.field714 - var20);
								field250 = JBXCIWFE.method278(field250);
								field250 = JSEWQIYU.method290(field250);
								field163.field66 = field250;
								field163.field44 = var17;
								field163.field68 = var19;
								field163.field48 = 150;

								if (field204 == 2) {
									method125(2, "@cr2@" + field163.field1116, field163.field66);
								} else if (field204 == 1) {
									method125(2, "@cr1@" + field163.field1116, field163.field66);
								} else {
									method125(2, field163.field1116, field163.field66);
								}

								if (field364 == 2) {
									field364 = 3;
									field150 = true;
									field194.method227(112);
									field194.method228(field364);
									field194.method228(field454);
									field194.method228(field428);
								}
							}

							field250 = "";
							field183 = true;
						}
					}
				}

				if (var1 == 8 && field215.length() > 0) {
					field215 = field215.substring(0, field215.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field215.length() < 12) {
				field215 = field215 + (char) var1;
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(LSJPORZIF;I)Z")
	public final boolean method142(SJPORZIF arg0) {
		int var2 = arg0.field1086;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field247[field175] = "Remove @whi@" + arg0.field1041;
				field499[field175] = 320;
				field175++;
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

		field247[field175] = "Remove @whi@" + field363[var2];
		field499[field175] = 647;
		field175++;
		field247[field175] = "Message @whi@" + field363[var2];
		field499[field175] = 499;
		field175++;
		return true;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method143() {
		if (field304 == 2) {
			method48(field508 * 2, (field506 - field290 << 7) + field509, (field507 - field291 << 7) + field510);

			if (field494 > -1 && field538 % 20 < 10) {
				field197[2].method578(field494 - 12, field495 - 28);
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method144() {
		for (int var1 = 0; var1 < field245; var1++) {
			int var2 = field246[var1];
			OTOMPFCI var3 = field244[var2];
			if (var3 != null) {
				method145(var3, var3.field894.field1343);
			}
		}
	}

	@ObfuscatedName("client.a(LBBWFUJHQ;BI)V")
	public final void method145(BBWFUJHQ arg0, int arg1) {
		if (arg0.field41 < 128 || arg0.field42 < 128 || arg0.field41 >= 13184 || arg0.field42 >= 13184) {
			arg0.field31 = -1;
			arg0.field70 = -1;
			arg0.field54 = 0;
			arg0.field55 = 0;
			arg0.field41 = arg0.field75[0] * 128 + arg0.field30 * 64;
			arg0.field42 = arg0.field76[0] * 128 + arg0.field30 * 64;
			arg0.method17();
		}

		if (field163 == arg0 && (arg0.field41 < 1536 || arg0.field42 < 1536 || arg0.field41 >= 11776 || arg0.field42 >= 11776)) {
			arg0.field31 = -1;
			arg0.field70 = -1;
			arg0.field54 = 0;
			arg0.field55 = 0;
			arg0.field41 = arg0.field75[0] * 128 + arg0.field30 * 64;
			arg0.field42 = arg0.field76[0] * 128 + arg0.field30 * 64;
			arg0.method17();
		}

		if (arg0.field54 > field538) {
			method146(arg0);
		} else if (arg0.field55 >= field538) {
			method147(arg0);
		} else {
			method148(arg0);
		}

		method149(arg0);
		method150(arg0);
	}

	@ObfuscatedName("client.a(ILBBWFUJHQ;)V")
	public final void method146(BBWFUJHQ arg0) {
		int var2 = arg0.field54 - field538;
		int var3 = arg0.field50 * 128 + arg0.field30 * 64;
		int var4 = arg0.field52 * 128 + arg0.field30 * 64;
		arg0.field41 += (var3 - arg0.field41) / var2;
		arg0.field42 += (var4 - arg0.field42) / var2;
		arg0.field37 = 0;

		if (arg0.field56 == 0) {
			arg0.field83 = 1024;
		}

		if (arg0.field56 == 1) {
			arg0.field83 = 1536;
		}

		if (arg0.field56 == 2) {
			arg0.field83 = 0;
		}

		if (arg0.field56 == 3) {
			arg0.field83 = 512;
		}
	}

	@ObfuscatedName("client.a(LBBWFUJHQ;Z)V")
	public final void method147(BBWFUJHQ arg0) {
		if (field538 == arg0.field55 || arg0.field31 == -1 || arg0.field34 != 0 || arg0.field33 + 1 > ZKWMIVTX.field1461[arg0.field31].method591(arg0.field32)) {
			int var2 = arg0.field55 - arg0.field54;
			int var3 = field538 - arg0.field54;
			int var4 = arg0.field50 * 128 + arg0.field30 * 64;
			int var5 = arg0.field52 * 128 + arg0.field30 * 64;
			int var6 = arg0.field51 * 128 + arg0.field30 * 64;
			int var7 = arg0.field53 * 128 + arg0.field30 * 64;
			arg0.field41 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field42 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field37 = 0;

		if (arg0.field56 == 0) {
			arg0.field83 = 1024;
		}

		if (arg0.field56 == 1) {
			arg0.field83 = 1536;
		}

		if (arg0.field56 == 2) {
			arg0.field83 = 0;
		}

		if (arg0.field56 == 3) {
			arg0.field83 = 512;
		}

		arg0.field43 = arg0.field83;
	}

	@ObfuscatedName("client.a(BLBBWFUJHQ;)V")
	public final void method148(BBWFUJHQ arg0) {
		arg0.field57 = arg0.field78;
		if (arg0.field67 == 0) {
			arg0.field37 = 0;
		} else {
			if (arg0.field31 != -1 && arg0.field34 == 0) {
				ZKWMIVTX var2 = ZKWMIVTX.field1461[arg0.field31];
				if (arg0.field49 > 0 && var2.field1473 == 0) {
					arg0.field37++;
					return;
				}

				if (arg0.field49 <= 0 && var2.field1474 == 0) {
					arg0.field37++;
					return;
				}
			}

			int var3 = arg0.field41;
			int var4 = arg0.field42;
			int var5 = arg0.field75[arg0.field67 - 1] * 128 + arg0.field30 * 64;
			int var6 = arg0.field76[arg0.field67 - 1] * 128 + arg0.field30 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field83 = 1280;
					} else if (var4 > var6) {
						arg0.field83 = 1792;
					} else {
						arg0.field83 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field83 = 768;
					} else if (var4 > var6) {
						arg0.field83 = 256;
					} else {
						arg0.field83 = 512;
					}
				} else if (var4 < var6) {
					arg0.field83 = 1024;
				} else {
					arg0.field83 = 0;
				}

				int var7 = arg0.field83 - arg0.field43 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field63;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field62;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field65;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field64;
				}

				if (var8 == -1) {
					var8 = arg0.field62;
				}

				arg0.field57 = var8;
				int var9 = 4;
				if (arg0.field83 != arg0.field43 && arg0.field36 == -1 && arg0.field60 != 0) {
					var9 = 2;
				}

				if (arg0.field67 > 2) {
					var9 = 6;
				}

				if (arg0.field67 > 3) {
					var9 = 8;
				}

				if (arg0.field37 > 0 && arg0.field67 > 1) {
					var9 = 8;
					arg0.field37--;
				}

				if (arg0.field61[arg0.field67 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field62 == arg0.field57 && arg0.field77 != -1) {
					arg0.field57 = arg0.field77;
				}

				if (var3 < var5) {
					arg0.field41 += var9;
					if (arg0.field41 > var5) {
						arg0.field41 = var5;
					}
				} else if (var3 > var5) {
					arg0.field41 -= var9;
					if (arg0.field41 < var5) {
						arg0.field41 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field42 += var9;
					if (arg0.field42 > var6) {
						arg0.field42 = var6;
					}
				} else if (var4 > var6) {
					arg0.field42 -= var9;
					if (arg0.field42 < var6) {
						arg0.field42 = var6;
					}
				}

				if (arg0.field41 == var5 && arg0.field42 == var6) {
					arg0.field67--;

					if (arg0.field49 > 0) {
						arg0.field49--;
						return;
					}
				}
			} else {
				arg0.field41 = var5;
				arg0.field42 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLBBWFUJHQ;)V")
	public final void method149(BBWFUJHQ arg0) {
		if (arg0.field60 != 0) {
			if (arg0.field36 != -1 && arg0.field36 < 32768) {
				OTOMPFCI var2 = field244[arg0.field36];
				if (var2 != null) {
					int var3 = arg0.field41 - var2.field41;
					int var4 = arg0.field42 - var2.field42;
					if (var3 != 0 || var4 != 0) {
						arg0.field83 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field36 >= 32768) {
				int var5 = arg0.field36 - 32768;
				if (field351 == var5) {
					var5 = field447;
				}

				SJUCHLXH var6 = field448[var5];
				if (var6 != null) {
					int var7 = arg0.field41 - var6.field41;
					int var8 = arg0.field42 - var6.field42;
					if (var7 != 0 || var8 != 0) {
						arg0.field83 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field45 != 0 || arg0.field46 != 0) && (arg0.field67 == 0 || arg0.field37 > 0)) {
				int var9 = arg0.field41 - (arg0.field45 - field290 - field290) * 64;
				int var10 = arg0.field42 - (arg0.field46 - field291 - field291) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field83 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field45 = 0;
				arg0.field46 = 0;
			}

			int var11 = arg0.field83 - arg0.field43 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field60 || var11 > 2048 - arg0.field60) {
					arg0.field43 = arg0.field83;
				} else if (var11 > 1024) {
					arg0.field43 -= arg0.field60;
				} else {
					arg0.field43 += arg0.field60;
				}

				arg0.field43 &= 0x7FF;
				if (arg0.field78 == arg0.field57 && arg0.field83 != arg0.field43) {
					if (arg0.field79 != -1) {
						arg0.field57 = arg0.field79;
						return;
					}

					arg0.field57 = arg0.field62;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILBBWFUJHQ;)V")
	public final void method150(BBWFUJHQ arg0) {
		arg0.field29 = false;

		if (arg0.field57 != -1) {
			ZKWMIVTX var2 = ZKWMIVTX.field1461[arg0.field57];
			arg0.field59++;
			if (arg0.field58 < var2.field1462 && arg0.field59 > var2.method591(arg0.field58)) {
				arg0.field59 = 0;
				arg0.field58++;
			}

			if (arg0.field58 >= var2.field1462) {
				arg0.field59 = 0;
				arg0.field58 = 0;
			}
		}

		if (arg0.field70 != -1 && field538 >= arg0.field73) {
			if (arg0.field71 < 0) {
				arg0.field71 = 0;
			}

			ZKWMIVTX var3 = CIVOPMKV.field114[arg0.field70].field118;
			arg0.field72++;
			while (arg0.field71 < var3.field1462 && arg0.field72 > var3.method591(arg0.field71)) {
				arg0.field72 -= var3.method591(arg0.field71);
				arg0.field71++;
			}

			if (arg0.field71 >= var3.field1462 && (arg0.field71 < 0 || arg0.field71 >= var3.field1462)) {
				arg0.field70 = -1;
			}
		}

		if (arg0.field31 != -1 && arg0.field34 <= 1) {
			ZKWMIVTX var4 = ZKWMIVTX.field1461[arg0.field31];
			if (var4.field1473 == 1 && arg0.field49 > 0 && arg0.field54 <= field538 && arg0.field55 < field538) {
				arg0.field34 = 1;
				return;
			}
		}

		if (arg0.field31 != -1 && arg0.field34 == 0) {
			ZKWMIVTX var5 = ZKWMIVTX.field1461[arg0.field31];
			arg0.field33++;
			while (arg0.field32 < var5.field1462 && arg0.field33 > var5.method591(arg0.field32)) {
				arg0.field33 -= var5.method591(arg0.field32);
				arg0.field32++;
			}

			if (arg0.field32 >= var5.field1462) {
				arg0.field32 -= var5.field1466;
				arg0.field35++;
				if (arg0.field35 >= var5.field1472) {
					arg0.field31 = -1;
				}

				if (arg0.field32 < 0 || arg0.field32 >= var5.field1462) {
					arg0.field31 = -1;
				}
			}

			arg0.field29 = var5.field1468;
		}

		if (arg0.field34 > 0) {
			arg0.field34--;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method151() {
		if (field540) {
			field540 = false;
			field265.method456(0, 4, field1289);
			field266.method456(0, 357, field1289);
			field267.method456(722, 4, field1289);
			field268.method456(743, 205, field1289);
			field269.method456(0, 0, field1289);
			field270.method456(516, 4, field1289);
			field271.method456(516, 205, field1289);
			field272.method456(496, 357, field1289);
			field273.method456(0, 338, field1289);
			field520 = true;
			field183 = true;
			field313 = true;
			field150 = true;

			if (field196 != 2) {
				field544.method456(4, 4, field1289);
				field543.method456(550, 4, field1289);
			}
		}

		if (field196 == 2) {
			method132();
		}

		if (field455 && field178 == 1) {
			field520 = true;
		}

		if (field344 != -1) {
			boolean var1 = method163(field536, field344);
			if (var1) {
				field520 = true;
			}
		}

		if (field134 == 2) {
			field520 = true;
		}

		if (field394 == 2) {
			field520 = true;
		}

		if (field520) {
			method34();
			field520 = false;
		}

		if (field192 == -1) {
			field289.field1084 = field390 - field409 - 77;

			if (field1297 > 448 && field1297 < 560 && field1298 > 332) {
				method85(77, false, field289, 0, field390, 463, field1297 - 17, field1298 - 357);
			}

			int var2 = field390 - field289.field1084 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field390 - 77) {
				var2 = field390 - 77;
			}

			if (field409 != var2) {
				field409 = var2;
				field183 = true;
			}
		}

		if (field192 != -1) {
			boolean var3 = method163(field536, field192);
			if (var3) {
				field183 = true;
			}
		}

		if (field134 == 3) {
			field183 = true;
		}

		if (field394 == 3) {
			field183 = true;
		}

		if (field209 != null) {
			field183 = true;
		}

		if (field455 && field178 == 2) {
			field183 = true;
		}

		if (field183) {
			method173();
			field183 = false;
		}

		if (field196 == 2) {
			method120();
			field543.method456(550, 4, field1289);
		}

		if (field341 != -1) {
			field313 = true;
		}

		if (field313) {
			if (field341 != -1 && field522 == field341) {
				field341 = -1;
				field194.method227(150);
				field194.method228(field522);
			}

			field313 = false;
			field143.method455();
			field376.method13(0, 0);

			if (field344 == -1) {
				if (field388[field522] != -1) {
					if (field522 == 0) {
						field382.method13(22, 10);
					}

					if (field522 == 1) {
						field383.method13(54, 8);
					}

					if (field522 == 2) {
						field383.method13(82, 8);
					}

					if (field522 == 3) {
						field384.method13(110, 8);
					}

					if (field522 == 4) {
						field386.method13(153, 8);
					}

					if (field522 == 5) {
						field386.method13(181, 8);
					}

					if (field522 == 6) {
						field385.method13(209, 9);
					}
				}

				if (field388[0] != -1 && (field341 != 0 || field538 % 20 < 10)) {
					field212[0].method13(29, 13);
				}

				if (field388[1] != -1 && (field341 != 1 || field538 % 20 < 10)) {
					field212[1].method13(53, 11);
				}

				if (field388[2] != -1 && (field341 != 2 || field538 % 20 < 10)) {
					field212[2].method13(82, 11);
				}

				if (field388[3] != -1 && (field341 != 3 || field538 % 20 < 10)) {
					field212[3].method13(115, 12);
				}

				if (field388[4] != -1 && (field341 != 4 || field538 % 20 < 10)) {
					field212[4].method13(153, 13);
				}

				if (field388[5] != -1 && (field341 != 5 || field538 % 20 < 10)) {
					field212[5].method13(180, 11);
				}

				if (field388[6] != -1 && (field341 != 6 || field538 % 20 < 10)) {
					field212[6].method13(208, 13);
				}
			}

			field143.method456(516, 160, field1289);
			field142.method455();
			field375.method13(0, 0);

			if (field344 == -1) {
				if (field388[field522] != -1) {
					if (field522 == 7) {
						field456.method13(42, 0);
					}

					if (field522 == 8) {
						field457.method13(74, 0);
					}

					if (field522 == 9) {
						field457.method13(102, 0);
					}

					if (field522 == 10) {
						field458.method13(130, 1);
					}

					if (field522 == 11) {
						field460.method13(173, 0);
					}

					if (field522 == 12) {
						field460.method13(201, 0);
					}

					if (field522 == 13) {
						field459.method13(229, 0);
					}
				}

				if (field388[8] != -1 && (field341 != 8 || field538 % 20 < 10)) {
					field212[7].method13(74, 2);
				}

				if (field388[9] != -1 && (field341 != 9 || field538 % 20 < 10)) {
					field212[8].method13(102, 3);
				}

				if (field388[10] != -1 && (field341 != 10 || field538 % 20 < 10)) {
					field212[9].method13(137, 4);
				}

				if (field388[11] != -1 && (field341 != 11 || field538 % 20 < 10)) {
					field212[10].method13(174, 2);
				}

				if (field388[12] != -1 && (field341 != 12 || field538 % 20 < 10)) {
					field212[11].method13(201, 2);
				}

				if (field388[13] != -1 && (field341 != 13 || field538 % 20 < 10)) {
					field212[12].method13(226, 2);
				}
			}

			field142.method456(496, 466, field1289);
			field544.method455();
		}

		if (field150) {
			field150 = false;
			field141.method455();
			field374.method13(0, 0);
			field334.method177("Public chat", 55, 28, true, 0xFFFFFF);

			if (field364 == 0) {
				field334.method177("On", 55, 41, true, 0xFF00);
			}

			if (field364 == 1) {
				field334.method177("Friends", 55, 41, true, 0xFFFF00);
			}

			if (field364 == 2) {
				field334.method177("Off", 55, 41, true, 0xFF0000);
			}

			if (field364 == 3) {
				field334.method177("Hide", 55, 41, true, 0xFFFF);
			}

			field334.method177("Private chat", 184, 28, true, 0xFFFFFF);

			if (field454 == 0) {
				field334.method177("On", 184, 41, true, 0xFF00);
			}

			if (field454 == 1) {
				field334.method177("Friends", 184, 41, true, 0xFFFF00);
			}

			if (field454 == 2) {
				field334.method177("Off", 184, 41, true, 0xFF0000);
			}

			field334.method177("Trade/compete", 324, 28, true, 0xFFFFFF);

			if (field428 == 0) {
				field334.method177("On", 324, 41, true, 0xFF00);
			}

			if (field428 == 1) {
				field334.method177("Friends", 324, 41, true, 0xFFFF00);
			}

			if (field428 == 2) {
				field334.method177("Off", 324, 41, true, 0xFF0000);
			}

			field334.method177("Report abuse", 458, 33, true, 0xFFFFFF);
			field141.method456(0, 453, field1289);
			field544.method455();
		}

		field536 = 0;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method152() {
		if (!field519 && !field326 && !field480) {
			field538++;

			if (field219) {
				method107();
			} else {
				method88();
			}

			method172();
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method153(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method154() {
		for (int var1 = 0; var1 < field257; var1++) {
			if (field347[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field198[var1] != field532 || field185[var1] != field303) {
						IMUIZRAF var3 = EJAYDEWE.method204(field198[var1], field185[var1]);
						if (System.currentTimeMillis() + var3.field714 / 22 > field410 / 22 + field379) {
							field410 = var3.field714;
							field379 = System.currentTimeMillis();

							if (method74(var3.field714, var3.field713)) {
								field532 = field198[var1];
								field303 = field185[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method170()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field347[var1] != -5) {
					field347[var1] = -5;
				} else {
					field257--;
					for (int var5 = var1; var5 < field257; var5++) {
						field198[var5] = field198[var5 + 1];
						field185[var5] = field185[var5 + 1];
						field347[var5] = field347[var5 + 1];
					}

					var1--;
				}
			} else {
				field347[var1]--;
			}
		}

		if (field193 > 0) {
			field193 -= 20;
			if (field193 < 0) {
				field193 = 0;
			}

			if (field193 == 0 && field167 && !field278) {
				field305 = field329;
				field306 = true;
				field380.method469(2, field305);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIII)V")
	public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = YABPKWWG.field1446[var7];
			int var13 = YABPKWWG.field1447[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = YABPKWWG.field1446[var8];
			int var16 = YABPKWWG.field1447[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field199 = arg4 - var9;
		field200 = arg5 - var10;
		field201 = arg2 - var11;
		field202 = arg1;
		field203 = arg3;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method156() {
		if (field325 == 0 && field1303 == 1) {
			int var1 = field1304 - 25 - 550;
			int var2 = field1305 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field359 + field279 & 0x7FF;
				int var4 = VRKDWHDQ.field1267[var3];
				int var5 = VRKDWHDQ.field1268[var3];
				var4 = (field248 + 256) * var4 >> 8;
				var5 = (field248 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field163.field41 + var6 >> 7;
				int var9 = field163.field42 - var7 >> 7;
				boolean var10 = method78(0, field163.field75[0], field163.field76[0], 0, true, 1, var9, var8, 0, 0, 0);
				if (var10) {
					field194.method228(var1);
					field194.method228(var2);
					field194.method229(field359);
					field194.method228(57);
					field194.method228(field279);
					field194.method228(field248);
					field194.method228(89);
					field194.method229(field163.field41);
					field194.method229(field163.field42);
					field194.method228(field535);
					field194.method228(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LIMUIZRAF;II)V")
	public final void method157(IMUIZRAF arg0, int arg1) {
		while (arg0.field715 + 10 < arg1 * 8) {
			int var3 = arg0.method249(11);
			if (var3 == 2047) {
				break;
			}

			if (field448[var3] == null) {
				field448[var3] = new SJUCHLXH();
				if (field453[var3] != null) {
					field448[var3].method452(field453[var3]);
				}
			}

			field450[field449++] = var3;
			SJUCHLXH var4 = field448[var3];
			var4.field69 = field538;
			int var5 = arg0.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method249(1);
			int var7 = arg0.method249(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method249(1);
			if (var8 == 1) {
				field452[field451++] = var3;
			}

			var4.method19(field163.field75[0] + var5, var6 == 1, field163.field76[0] + var7);
		}

		arg0.method250();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1292 != null) {
				return new URL("http://127.0.0.1:" + (field276 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method158() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field475[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field475[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field476[var10] = (field475[var10 - 1] + field475[var10 + 1] + field475[var10 - 128] + field475[var10 + 128]) / 4;
			}
		}

		field166 += 128;
		if (field166 > field223.length) {
			field166 -= field223.length;
			int var11 = (int) (Math.random() * 12.0D);
			method40(field228[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field476[var14 + 128] - field223[field166 + var14 & field223.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field475[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field349[var16] = field349[var16 + 1];
		}

		field349[var1 - 1] = (int) (Math.sin(field538 / 14.0D) * 16.0D + Math.sin(field538 / 15.0D) * 14.0D + Math.sin(field538 / 16.0D) * 12.0D);

		if (field221 > 0) {
			field221 -= 4;
		}

		if (field222 > 0) {
			field222 -= 4;
		}

		if (field221 == 0 && field222 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field221 = 1024;
			}

			if (var17 == 1) {
				field222 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method159() {
		if (field196 == 2) {
			for (FHZFOSDU var1 = (FHZFOSDU) field378.method382(); var1 != null; var1 = (FHZFOSDU) field378.method384()) {
				if (var1.field630 > 0) {
					var1.field630--;
				}

				if (var1.field630 != 0) {
					if (var1.field631 > 0) {
						var1.field631--;
					}

					if (var1.field631 == 0 && var1.field622 >= 1 && var1.field623 >= 1 && var1.field622 <= 102 && var1.field623 <= 102 && (var1.field627 < 0 || QJLJTPQV.method425(var1.field629, var1.field627))) {
						method79(var1.field623, var1.field620, var1.field629, var1.field628, var1.field627, var1.field622, var1.field621);
						var1.field631 = -1;

						if (var1.field627 == var1.field624 && var1.field624 == -1) {
							var1.method540();
						} else if (var1.field627 == var1.field624 && var1.field628 == var1.field625 && var1.field629 == var1.field626) {
							var1.method540();
						}
					}
				} else if (var1.field624 < 0 || QJLJTPQV.method425(var1.field626, var1.field624)) {
					method79(var1.field623, var1.field620, var1.field626, var1.field625, var1.field624, var1.field622, var1.field621);
					var1.method540();
				}
			}

			field254++;
			if (field254 > 100) {
				field254 = 0;
				field194.method227(15);
				field194.method228(209);
				return;
			}
		}
	}

	@ObfuscatedName("client.n(Z)Ljava/lang/String;")
	public final String method160() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1292 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.H(I)V")
	public final void method161() {
		field287 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field321) {
				field332++;
				method158();
				method158();
				method75();
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

		field287 = false;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method162() {
		if (field295 != 0) {
			DIVYVFFL var1 = field334;
			int var2 = 0;
			if (field515 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field299[var3] != null) {
					int var4 = field297[var3];
					String var5 = field298[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field454 == 0 || field454 == 1 && method62(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method180(var7, "From", var8, 0);
						var1.method180(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method178("From ");
						if (var6 == 1) {
							field339[0].method13(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field339[1].method13(var11, var7 - 12);
							var11 += 14;
						}

						var1.method180(var7, var5 + ": " + field299[var3], var11, 0);
						var1.method180(var7 - 1, var5 + ": " + field299[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field454 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method180(var9, field299[var3], 4, 0);
						var1.method180(var9 - 1, field299[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field454 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method180(var10, "To " + var5 + ": " + field299[var3], 4, 0);
						var1.method180(var10 - 1, "To " + var5 + ": " + field299[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean method163(int arg0, int arg1) {
		boolean var3 = false;
		SJPORZIF var4 = SJPORZIF.field1040[arg1];
		for (int var5 = 0; var5 < var4.field1035.length && var4.field1035[var5] != -1; var5++) {
			SJPORZIF var6 = SJPORZIF.field1040[var4.field1035[var5]];
			if (var6.field1087 == 1) {
				var3 |= method163(arg0, var6.field1081);
			}

			if (var6.field1087 == 6 && (var6.field1057 != -1 || var6.field1058 != -1)) {
				boolean var7 = method33(var6);
				int var8;
				if (var7) {
					var8 = var6.field1058;
				} else {
					var8 = var6.field1057;
				}

				if (var8 != -1) {
					ZKWMIVTX var9 = ZKWMIVTX.field1461[var8];
					var6.field1043 += arg0;
					while (var6.field1043 > var9.method591(var6.field1038)) {
						var6.field1043 -= var9.method591(var6.field1038) + 1;
						var6.field1038++;
						if (var6.field1038 >= var9.field1462) {
							var6.field1038 -= var9.field1466;
							if (var6.field1038 < 0 || var6.field1038 >= var9.field1462) {
								var6.field1038 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1087 == 6 && var6.field1096 != 0) {
				int var10 = var6.field1096 >> 16;
				int var11 = var6.field1096 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1053 = var6.field1053 + var10 & 0x7FF;
				var6.field1054 = var6.field1054 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method164(String arg0) {
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

	@ObfuscatedName("client.I(I)V")
	public final void method165() {
		field151 = 0;
		for (int var1 = -1; var1 < field449 + field245; var1++) {
			BBWFUJHQ var2;
			if (var1 == -1) {
				var2 = field163;
			} else if (var1 < field449) {
				var2 = field448[field450[var1]];
			} else {
				var2 = field244[field246[var1 - field449]];
			}

			if (var2 != null && var2.method21()) {
				if (var2 instanceof OTOMPFCI) {
					WHKCNEXD var3 = ((OTOMPFCI) var2).field894;
					if (var3.field1332 != null) {
						var3 = var3.method518();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field449) {
					WHKCNEXD var7 = ((OTOMPFCI) var2).field894;
					if (var7.field1338 >= 0 && var7.field1338 < field197.length) {
						method47(var2.field47 + 15, var2);

						if (field494 > -1) {
							field197[var7.field1338].method578(field494 - 12, field495 - 30);
						}
					}

					if (field304 == 1 && field246[var1 - field449] == field474 && field538 % 20 < 10) {
						method47(var2.field47 + 15, var2);

						if (field494 > -1) {
							field197[2].method578(field494 - 12, field495 - 28);
						}
					}
				} else {
					int var4 = 30;
					SJUCHLXH var5 = (SJUCHLXH) var2;
					if (var5.field1108 != 0) {
						method47(var2.field47 + 15, var2);

						if (field494 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1108 & 1 << var6) != 0) {
									field197[var6].method578(field494 - 12, field495 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field304 == 10 && field450[var1] == field328) {
						method47(var2.field47 + 15, var2);

						if (field494 > -1) {
							field197[7].method578(field494 - 12, field495 - var4);
						}
					}
				}

				if (var2.field66 != null && (var1 >= field449 || field364 == 0 || field364 == 3 || field364 == 1 && method62(((SJUCHLXH) var2).field1116))) {
					method47(var2.field47, var2);

					if (field494 > -1 && field151 < field152) {
						field156[field151] = field335.method179(var2.field66) / 2;
						field155[field151] = field335.field559;
						field153[field151] = field494;
						field154[field151] = field495;
						field157[field151] = var2.field44;
						field158[field151] = var2.field68;
						field159[field151] = var2.field48;
						field160[field151++] = var2.field66;

						if (field397 == 0 && var2.field68 >= 1 && var2.field68 <= 3) {
							field155[field151] += 10;
							field154[field151] += 5;
						}

						if (field397 == 0 && var2.field68 == 4) {
							field156[field151] = 60;
						}

						if (field397 == 0 && var2.field68 == 5) {
							field155[field151] += 5;
						}
					}
				}

				if (var2.field80 > field538) {
					method47(var2.field47 + 15, var2);

					if (field494 > -1) {
						int var8 = var2.field81 * 30 / var2.field82;
						if (var8 > 30) {
							var8 = 30;
						}

						DSAVPBJG.method196(0xFF00, field494 - 15, var8, 5, field495 - 3);
						DSAVPBJG.method196(0xFF0000, field494 + var8 - 15, 30 - var8, 5, field495 - 3);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field40[var9] > field538) {
						method47(var2.field47 / 2, var2);

						if (field494 > -1) {
							if (var9 == 1) {
								field495 -= 20;
							}

							if (var9 == 2) {
								field494 -= 15;
								field495 -= 10;
							}

							if (var9 == 3) {
								field494 += 15;
								field495 -= 10;
							}

							field216[var2.field39[var9]].method578(field494 - 12, field495 - 12);
							field333.method176(field495 + 4, 0, field494, String.valueOf(var2.field38[var9]));
							field333.method176(field495 + 3, 0xFFFFFF, field494 - 1, String.valueOf(var2.field38[var9]));
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field151; var10++) {
			int var11 = field153[var10];
			int var12 = field154[var10];
			int var13 = field156[var10];
			int var14 = field155[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field154[var16] - field155[var16] && var12 - var14 < field154[var16] + 2 && var11 - var13 < field156[var16] + field153[var16] && var11 + var13 > field153[var16] - field156[var16] && field154[var16] - field155[var16] < var12) {
						var12 = field154[var16] - field155[var16];
						var15 = true;
					}
				}
			}

			field494 = field153[var10];
			field495 = field154[var10] = var12;
			String var17 = field160[var10];
			if (field397 == 0) {
				int var18 = 0xFFFF00;
				if (field157[var10] < 6) {
					var18 = field184[field157[var10]];
				}

				if (field157[var10] == 6) {
					var18 = field331 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field157[var10] == 7) {
					var18 = field331 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field157[var10] == 8) {
					var18 = field331 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field157[var10] == 9) {
					int var19 = 150 - field159[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field157[var10] == 10) {
					int var20 = 150 - field159[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field157[var10] == 11) {
					int var21 = 150 - field159[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field158[var10] == 0) {
					field335.method176(field495 + 1, 0, field494, var17);
					field335.method176(field495, var18, field494, var17);
				}

				if (field158[var10] == 1) {
					field335.method181(field495 + 1, field331, var17, field494, 0);
					field335.method181(field495, field331, var17, field494, var18);
				}

				if (field158[var10] == 2) {
					field335.method182(0, field331, var17, field494, field495 + 1);
					field335.method182(var18, field331, var17, field494, field495);
				}

				if (field158[var10] == 3) {
					field335.method183(field331, 150 - field159[var10], var17, field494, 0, field495 + 1);
					field335.method183(field331, 150 - field159[var10], var17, field494, var18, field495);
				}

				if (field158[var10] == 4) {
					int var22 = field335.method179(var17);
					int var23 = (150 - field159[var10]) * (var22 + 100) / 150;
					DSAVPBJG.method193(field494 + 50, 334, field494 - 50, 0);
					field335.method180(field495 + 1, var17, field494 + 50 - var23, 0);
					field335.method180(field495, var17, field494 + 50 - var23, var18);
					DSAVPBJG.method192();
				}

				if (field158[var10] == 5) {
					int var24 = 150 - field159[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					DSAVPBJG.method193(512, field495 + 5, 0, field495 - field335.field559 - 1);
					field335.method176(field495 + var25 + 1, 0, field494, var17);
					field335.method176(field495 + var25, var18, field494, var17);
					DSAVPBJG.method192();
				}
			} else {
				field335.method176(field495 + 1, 0, field494, var17);
				field335.method176(field495, 0xFFFF00, field494, var17);
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method166() {
		try {
			if (field345 != null) {
				field345.method220();
			}
		} catch (Exception var2) {
		}

		field345 = null;
		field219 = false;
		field468 = 0;
		field129 = "";
		field130 = "";
		method58();
		field469.method325();

		for (int var1 = 0; var1 < 4; var1++) {
			field491[var1].method528();
		}

		System.gc();
		method99();
		field329 = -1;
		field305 = -1;
		field193 = 0;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method167(String arg0) throws IOException {
		if (field236) {
			if (field467 != null) {
				try {
					field467.close();
				} catch (Exception var4) {
				}

				field467 = null;
			}

			field467 = method111(43595);
			field467.setSoTimeout(10000);
			InputStream var2 = field467.getInputStream();
			OutputStream var3 = field467.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	public final void init() {
		field275 = Integer.parseInt(getParameter("nodeid"));
		field276 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method105();
		} else {
			method51();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field277 = false;
		} else {
			field277 = true;
		}

		method512(503, 765);
	}

	@ObfuscatedName("client.J(I)V")
	public final void method168() {
		if (field394 == 0) {
			field247[0] = "Cancel";
			field499[0] = 1575;
			field175 = 1;
			method118();
			field127 = 0;

			if (field1297 > 4 && field1298 > 4 && field1297 < 516 && field1298 < 338) {
				if (field226 == -1) {
					method93();
				} else {
					method136(field1298, field1297, 4, 0, 4, SJPORZIF.field1040[field226]);
				}
			}

			if (field229 != field127) {
				field229 = field127;
			}

			field127 = 0;

			if (field1297 > 553 && field1298 > 205 && field1297 < 743 && field1298 < 466) {
				if (field344 != -1) {
					method136(field1298, field1297, 553, 0, 205, SJPORZIF.field1040[field344]);
				} else if (field388[field522] != -1) {
					method136(field1298, field1297, 553, 0, 205, SJPORZIF.field1040[field388[field522]]);
				}
			}

			if (field136 != field127) {
				field520 = true;
				field136 = field127;
			}

			field127 = 0;

			if (field1297 > 17 && field1298 > 357 && field1297 < 496 && field1298 < 453) {
				if (field192 != -1) {
					method136(field1298, field1297, 17, 0, 357, SJPORZIF.field1040[field192]);
				} else if (field1298 < 434 && field1297 < 426) {
					method77(field1297 - 17, field1298 - 357);
				}
			}

			if (field192 != -1 && field330 != field127) {
				field183 = true;
				field330 = field127;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field175 - 1; var2++) {
					if (field499[var2] < 1000 && field499[var2 + 1] > 1000) {
						String var3 = field247[var2];
						field247[var2] = field247[var2 + 1];
						field247[var2 + 1] = var3;
						int var4 = field499[var2];
						field499[var2] = field499[var2 + 1];
						field499[var2 + 1] = var4;
						int var5 = field497[var2];
						field497[var2] = field497[var2 + 1];
						field497[var2 + 1] = var5;
						int var6 = field498[var2];
						field498[var2] = field498[var2 + 1];
						field498[var2 + 1] = var6;
						int var7 = field500[var2];
						field500[var2] = field500[var2 + 1];
						field500[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method169() {
		field321 = false;
		while (field287) {
			field321 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field252 = null;
		field253 = null;
		field228 = null;
		field369 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field223 = null;
		field224 = null;
		field475 = null;
		field476 = null;
		field355 = null;
		field356 = null;
	}

	@ObfuscatedName("client.L(I)Z")
	public final boolean method170() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.M(I)V")
	public final void method171() {
		if (field1303 == 1) {
			if (field1304 >= 539 && field1304 <= 573 && field1305 >= 169 && field1305 < 205 && field388[0] != -1) {
				field520 = true;
				field522 = 0;
				field313 = true;
			}

			if (field1304 >= 569 && field1304 <= 599 && field1305 >= 168 && field1305 < 205 && field388[1] != -1) {
				field520 = true;
				field522 = 1;
				field313 = true;
			}

			if (field1304 >= 597 && field1304 <= 627 && field1305 >= 168 && field1305 < 205 && field388[2] != -1) {
				field520 = true;
				field522 = 2;
				field313 = true;
			}

			if (field1304 >= 625 && field1304 <= 669 && field1305 >= 168 && field1305 < 203 && field388[3] != -1) {
				field520 = true;
				field522 = 3;
				field313 = true;
			}

			if (field1304 >= 666 && field1304 <= 696 && field1305 >= 168 && field1305 < 205 && field388[4] != -1) {
				field520 = true;
				field522 = 4;
				field313 = true;
			}

			if (field1304 >= 694 && field1304 <= 724 && field1305 >= 168 && field1305 < 205 && field388[5] != -1) {
				field520 = true;
				field522 = 5;
				field313 = true;
			}

			if (field1304 >= 722 && field1304 <= 756 && field1305 >= 169 && field1305 < 205 && field388[6] != -1) {
				field520 = true;
				field522 = 6;
				field313 = true;
			}

			if (field1304 >= 540 && field1304 <= 574 && field1305 >= 466 && field1305 < 502 && field388[7] != -1) {
				field520 = true;
				field522 = 7;
				field313 = true;
			}

			if (field1304 >= 572 && field1304 <= 602 && field1305 >= 466 && field1305 < 503 && field388[8] != -1) {
				field520 = true;
				field522 = 8;
				field313 = true;
			}

			if (field1304 >= 599 && field1304 <= 629 && field1305 >= 466 && field1305 < 503 && field388[9] != -1) {
				field520 = true;
				field522 = 9;
				field313 = true;
			}

			if (field1304 >= 627 && field1304 <= 671 && field1305 >= 467 && field1305 < 502 && field388[10] != -1) {
				field520 = true;
				field522 = 10;
				field313 = true;
			}

			if (field1304 >= 669 && field1304 <= 699 && field1305 >= 466 && field1305 < 503 && field388[11] != -1) {
				field520 = true;
				field522 = 11;
				field313 = true;
			}

			if (field1304 >= 696 && field1304 <= 726 && field1305 >= 466 && field1305 < 503 && field388[12] != -1) {
				field520 = true;
				field522 = 12;
				field313 = true;
			}

			if (field1304 >= 724 && field1304 <= 758 && field1305 >= 466 && field1305 < 502 && field388[13] != -1) {
				field520 = true;
				field522 = 13;
				field313 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method172() {
		while (true) {
			KRPFBUJX var1 = field380.method476();
			if (var1 == null) {
				return;
			}

			if (var1.field801 == 0) {
				YABPKWWG.method546(var1.field802, var1.field804);

				if ((field380.method480(var1.field802) & 0x62) != 0) {
					field520 = true;

					if (field192 != -1) {
						field183 = true;
					}
				}
			}

			if (var1.field801 == 1 && var1.field804 != null) {
				HQHBJEDA.method216(var1.field804);
			}

			if (var1.field801 == 2 && field305 == var1.field802 && var1.field804 != null) {
				method80(var1.field804, field306);
			}

			if (var1.field801 == 3 && field196 == 1) {
				for (int var2 = 0; var2 < field147.length; var2++) {
					if (field478[var2] == var1.field802) {
						field147[var2] = var1.field804;

						if (var1.field804 == null) {
							field478[var2] = -1;
						}

						break;
					}

					if (field479[var2] == var1.field802) {
						field288[var2] = var1.field804;

						if (var1.field804 == null) {
							field479[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field801 == 93 && field380.method483(var1.field802)) {
				QJLJTPQV.method415(new IMUIZRAF(var1.field804), field380);
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method173() {
		field545.method455();
		VRKDWHDQ.field1269 = field525;
		field407.method13(0, 0);

		if (field367) {
			field335.method176(40, 0, 239, field307);
			field335.method176(60, 128, 239, field227 + "*");
		} else if (field432 == 1) {
			field335.method176(40, 0, 239, "Enter amount:");
			field335.method176(60, 128, 239, field408 + "*");
		} else if (field432 == 2) {
			field335.method176(40, 0, 239, "Enter name:");
			field335.method176(60, 128, 239, field408 + "*");
		} else if (field209 != null) {
			field335.method176(40, 0, 239, field209);
			field335.method176(60, 128, 239, "Click to continue");
		} else if (field192 != -1) {
			method131(0, 0, 0, SJPORZIF.field1040[field192]);
		} else if (field404 == -1) {
			DIVYVFFL var1 = field334;
			int var2 = 0;
			DSAVPBJG.method193(463, 77, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field299[var3] != null) {
					int var4 = field297[var3];
					int var5 = field409 + 70 - var2 * 14;
					String var6 = field298[var3];
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
							var1.method180(var5, field299[var3], 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field364 == 0 || field364 == 1 && method62(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field339[0].method13(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field339[1].method13(var8, var5 - 12);
								var8 += 14;
							}

							var1.method180(var5, var6 + ":", var8, 0);
							var8 += var1.method178(var6) + 8;
							var1.method180(var5, field299[var3], var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field295 == 0 && (var4 == 7 || field454 == 0 || field454 == 1 && method62(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method180(var5, "From", var9, 0);
							int var11 = var9 + var1.method178("From ");
							if (var7 == 1) {
								field339[0].method13(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field339[1].method13(var11, var5 - 12);
								var11 += 14;
							}

							var1.method180(var5, var6 + ":", var11, 0);
							var11 += var1.method178(var6) + 8;
							var1.method180(var5, field299[var3], var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field428 == 0 || field428 == 1 && method62(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method180(var5, var6 + " " + field299[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field295 == 0 && field454 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method180(var5, field299[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field295 == 0 && field454 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method180(var5, "To " + var6 + ":", 4, 0);
							var1.method180(var5, field299[var3], var1.method178("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field428 == 0 || field428 == 1 && method62(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method180(var5, var6 + " " + field299[var3], 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			DSAVPBJG.method192();
			field390 = var2 * 14 + 7;
			if (field390 < 78) {
				field390 = 78;
			}

			method55(field390 - field409 - 77, 77, 463, field390, 0);
			String var10;
			if (field163 == null || field163.field1116 == null) {
				var10 = JYGZTITV.method322(field129);
			} else {
				var10 = field163.field1116;
			}

			var1.method180(90, var10 + ":", 4, 0);
			var1.method180(90, field250 + "*", var1.method178(var10 + ": ") + 6, 255);
			DSAVPBJG.method199(0, 0, 77, 479);
		} else {
			method131(0, 0, 0, SJPORZIF.field1040[field404]);
		}

		if (field455 && field178 == 2) {
			method135();
		}

		field545.method456(17, 357, field1289);
		field544.method455();
		VRKDWHDQ.field1269 = field527;
	}

	@ObfuscatedName("client.O(I)V")
	public final void method174() {
		field168 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field470[var1] = -1;
			for (int var2 = 0; var2 < BDUNOHSG.field84; var2++) {
				if (!BDUNOHSG.field85[var2].field91 && BDUNOHSG.field85[var2].field86 == var1 + (field264 ? 0 : 7)) {
					field470[var1] = var2;
					break;
				}
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field259[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field429[var3] = var2 / 4;
		}
	}
}
