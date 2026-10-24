package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.Component;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.config.UnkType;
import jagex2.config.VarbitType;
import jagex2.config.VarpType;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ClientEntity;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.ClientNpc;
import jagex2.dash3d.ClientObj;
import jagex2.dash3d.ClientPlayer;
import jagex2.dash3d.ClientProj;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Decor;
import jagex2.dash3d.GroundDecor;
import jagex2.dash3d.LocChange;
import jagex2.dash3d.MapSpotAnim;
import jagex2.dash3d.Model;
import jagex2.dash3d.Sprite;
import jagex2.dash3d.Wall;
import jagex2.dash3d.World;
import jagex2.dash3d.World3D;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.jstring.JString;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
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
public final class Client extends GameShell {

	@ObfuscatedName("client.K")
	public int[] field120 = new int[9];

	@ObfuscatedName("client.M")
	public String field122 = "";

	@ObfuscatedName("client.P")
	public int[] field124 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Q")
	public int[] field125 = new int[Stats.field1299];

	@ObfuscatedName("client.W")
	public String[] field131 = new String[200];

	@ObfuscatedName("client.Z")
	public int[] field134 = new int[5];

	@ObfuscatedName("client.bb")
	public int field136 = 2;

	@ObfuscatedName("client.ib")
	public String field143 = "";

	@ObfuscatedName("client.kb")
	public String[] field145 = new String[100];

	@ObfuscatedName("client.lb")
	public int[] field146 = new int[100];

	@ObfuscatedName("client.nb")
	public boolean field148 = false;

	@ObfuscatedName("client.Ab")
	public int[][][] field161 = new int[4][13][13];

	@ObfuscatedName("client.Gb")
	public int[][] field167 = new int[104][104];

	@ObfuscatedName("client.Hb")
	public int[][] field168 = new int[104][104];

	@ObfuscatedName("client.Rb")
	public Pix32[] field176 = new Pix32[8];

	@ObfuscatedName("client.Vb")
	public boolean field178 = false;

	@ObfuscatedName("client.mc")
	public int field194 = 2;

	@ObfuscatedName("client.pc")
	public int[] field195 = new int[151];

	@ObfuscatedName("client.wc")
	public boolean[] field200 = new boolean[5];

	@ObfuscatedName("client.yc")
	public Packet field201 = Packet.alloc(1);

	@ObfuscatedName("client.Ac")
	public int field203 = 0x23201B;

	@ObfuscatedName("client.Bc")
	public int field204 = -1;

	@ObfuscatedName("client.Cc")
	public int field205 = -1;

	@ObfuscatedName("client.Ec")
	public int field206 = -1;

	@ObfuscatedName("client.Gc")
	public String field207 = "";

	@ObfuscatedName("client.Jc")
	public int field209 = 50;

	@ObfuscatedName("client.Kc")
	public int[] field210 = new int[field209];

	@ObfuscatedName("client.Lc")
	public int[] field211 = new int[field209];

	@ObfuscatedName("client.Mc")
	public int[] field212 = new int[field209];

	@ObfuscatedName("client.Nc")
	public int[] field213 = new int[field209];

	@ObfuscatedName("client.Oc")
	public int[] field214 = new int[field209];

	@ObfuscatedName("client.Pc")
	public int[] field215 = new int[field209];

	@ObfuscatedName("client.Qc")
	public int[] field216 = new int[field209];

	@ObfuscatedName("client.Rc")
	public String[] field217 = new String[field209];

	@ObfuscatedName("client.Sc")
	public String field218 = "";

	@ObfuscatedName("client.Tc")
	public boolean field219 = false;

	@ObfuscatedName("client.Xc")
	public Pix32[] field222 = new Pix32[32];

	@ObfuscatedName("client.ad")
	public String field224 = "";

	@ObfuscatedName("client.bd")
	public String field225 = "";

	@ObfuscatedName("client.dd")
	public int field226 = -1;

	@ObfuscatedName("client.ed")
	public int field227 = -1;

	@ObfuscatedName("client.hd")
	public Packet field229 = Packet.alloc(1);

	@ObfuscatedName("client.ld")
	public int field233 = 2048;

	@ObfuscatedName("client.md")
	public int field234 = 2047;

	@ObfuscatedName("client.nd")
	public ClientPlayer[] field235 = new ClientPlayer[field233];

	@ObfuscatedName("client.pd")
	public int[] field237 = new int[field233];

	@ObfuscatedName("client.rd")
	public int[] field239 = new int[field233];

	@ObfuscatedName("client.sd")
	public Packet[] field240 = new Packet[field233];

	@ObfuscatedName("client.td")
	public Pix8[] field241 = new Pix8[13];

	@ObfuscatedName("client.wd")
	public int[] field244 = new int[500];

	@ObfuscatedName("client.xd")
	public int[] field245 = new int[500];

	@ObfuscatedName("client.yd")
	public int[] field246 = new int[500];

	@ObfuscatedName("client.zd")
	public int[] field247 = new int[500];

	@ObfuscatedName("client.Fd")
	public int field253 = -1;

	@ObfuscatedName("client.Id")
	public int[] field256 = new int[5];

	@ObfuscatedName("client.Wd")
	public int[] field269 = new int[2000];

	@ObfuscatedName("client.be")
	public int field274 = 2;

	@ObfuscatedName("client.he")
	public boolean field277 = false;

	@ObfuscatedName("client.ke")
	public int[] field280 = new int[151];

	@ObfuscatedName("client.re")
	public String field286 = "";

	@ObfuscatedName("client.ue")
	public int[] field288 = new int[Stats.field1299];

	@ObfuscatedName("client.we")
	public Pix32[] field290 = new Pix32[100];

	@ObfuscatedName("client.xe")
	public final int[] field291 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ee")
	public int[] field296 = new int[2000];

	@ObfuscatedName("client.Le")
	public boolean field303 = false;

	@ObfuscatedName("client.Se")
	public int field308 = -1;

	@ObfuscatedName("client.Te")
	public int[] field309 = new int[Stats.field1299];

	@ObfuscatedName("client.ef")
	public boolean field318 = false;

	@ObfuscatedName("client.gf")
	public boolean field319 = false;

	@ObfuscatedName("client.jf")
	public String[] field321 = new String[5];

	@ObfuscatedName("client.kf")
	public boolean[] field322 = new boolean[5];

	@ObfuscatedName("client.nf")
	public long[] field324 = new long[100];

	@ObfuscatedName("client.rf")
	public int[] field326 = new int[1000];

	@ObfuscatedName("client.sf")
	public int[] field327 = new int[1000];

	@ObfuscatedName("client.tf")
	public Pix32[] field328 = new Pix32[32];

	@ObfuscatedName("client.uf")
	public int field329 = 0x4D4233;

	@ObfuscatedName("client.vf")
	public int[] field330 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Cf")
	public CRC32 field336 = new CRC32();

	@ObfuscatedName("client.Df")
	public int field337 = -1;

	@ObfuscatedName("client.Ef")
	public int[] field338 = new int[50];

	@ObfuscatedName("client.Gf")
	public String field340 = "";

	@ObfuscatedName("client.Hf")
	public String field341 = "";

	@ObfuscatedName("client.Lf")
	public boolean field345 = false;

	@ObfuscatedName("client.Mf")
	public boolean field346 = false;

	@ObfuscatedName("client.Nf")
	public int[] field347 = new int[5];

	@ObfuscatedName("client.Sf")
	public String field352 = "";

	@ObfuscatedName("client.Tf")
	public int[] field353 = new int[5];

	@ObfuscatedName("client.Vf")
	public int field355 = 78;

	@ObfuscatedName("client.lg")
	public int[] field370 = new int[4000];

	@ObfuscatedName("client.mg")
	public int[] field371 = new int[4000];

	@ObfuscatedName("client.pg")
	public boolean field374 = false;

	@ObfuscatedName("client.sg")
	public long[] field377 = new long[200];

	@ObfuscatedName("client.tg")
	public Packet field378 = new Packet(new byte[5000]);

	@ObfuscatedName("client.ug")
	public ClientNpc[] field379 = new ClientNpc[16384];

	@ObfuscatedName("client.wg")
	public int[] field381 = new int[16384];

	@ObfuscatedName("client.xg")
	public int field382 = 0x766654;

	@ObfuscatedName("client.zg")
	public boolean field383 = false;

	@ObfuscatedName("client.Eg")
	public Pix8[] field387 = new Pix8[2];

	@ObfuscatedName("client.Gg")
	public boolean field388 = true;

	@ObfuscatedName("client.Hg")
	public int[] field389 = new int[5];

	@ObfuscatedName("client.Pg")
	public Pix8[] field397 = new Pix8[100];

	@ObfuscatedName("client.Rg")
	public boolean field398 = false;

	@ObfuscatedName("client.Zg")
	public boolean field404 = false;

	@ObfuscatedName("client.ch")
	public int[] field407 = new int[256];

	@ObfuscatedName("client.fh")
	public int field410 = -1;

	@ObfuscatedName("client.qh")
	public int[] field419 = new int[33];

	@ObfuscatedName("client.rh")
	public boolean field420 = false;

	@ObfuscatedName("client.sh")
	public Pix32[] field421 = new Pix32[20];

	@ObfuscatedName("client.uh")
	public String[] field423 = new String[500];

	@ObfuscatedName("client.yh")
	public Packet field427 = Packet.alloc(1);

	@ObfuscatedName("client.zh")
	public int[][] field428 = new int[104][104];

	@ObfuscatedName("client.Bh")
	public int field429 = -1;

	@ObfuscatedName("client.Th")
	public boolean field445 = false;

	@ObfuscatedName("client.Uh")
	public LinkList field446 = new LinkList();

	@ObfuscatedName("client.Vh")
	public boolean field447 = false;

	@ObfuscatedName("client.Wh")
	public boolean field448 = false;

	@ObfuscatedName("client.Xh")
	public int field449 = -1;

	@ObfuscatedName("client.mi")
	public FileStream[] field463 = new FileStream[5];

	@ObfuscatedName("client.pi")
	public int field465 = -1;

	@ObfuscatedName("client.si")
	public int field468 = 1;

	@ObfuscatedName("client.xi")
	public boolean field472 = false;

	@ObfuscatedName("client.yi")
	public boolean field473 = false;

	@ObfuscatedName("client.Bi")
	public volatile boolean field475 = false;

	@ObfuscatedName("client.Di")
	public byte[] field477 = new byte[16384];

	@ObfuscatedName("client.Hi")
	public Component field481 = new Component();

	@ObfuscatedName("client.Ji")
	public int field483 = 128;

	@ObfuscatedName("client.Oi")
	public int field488 = 1;

	@ObfuscatedName("client.Pi")
	public final int field489 = 100;

	@ObfuscatedName("client.Qi")
	public int[] field490 = new int[100];

	@ObfuscatedName("client.Ri")
	public int[] field491 = new int[50];

	@ObfuscatedName("client.Si")
	public CollisionMap[] field492 = new CollisionMap[4];

	@ObfuscatedName("client.Ti")
	public LinkList field493 = new LinkList();

	@ObfuscatedName("client.Xi")
	public boolean field497 = false;

	@ObfuscatedName("client.Yi")
	public boolean field498 = true;

	@ObfuscatedName("client.Zi")
	public int[] field499 = new int[200];

	@ObfuscatedName("client.dj")
	public boolean field503 = true;

	@ObfuscatedName("client.ej")
	public int field504 = -1;

	@ObfuscatedName("client.hj")
	public boolean field506 = true;

	@ObfuscatedName("client.ij")
	public int field507 = -1;

	@ObfuscatedName("client.jj")
	public boolean field508 = false;

	@ObfuscatedName("client.kj")
	public Pix32[] field509 = new Pix32[1000];

	@ObfuscatedName("client.lj")
	public int field510 = -1;

	@ObfuscatedName("client.oj")
	public LinkList field512 = new LinkList();

	@ObfuscatedName("client.pj")
	public boolean field513 = false;

	@ObfuscatedName("client.rj")
	public int field515 = 3;

	@ObfuscatedName("client.sj")
	public int[] field516 = new int[33];

	@ObfuscatedName("client.tj")
	public int field517 = 0x332D25;

	@ObfuscatedName("client.uj")
	public Pix32[] field518 = new Pix32[32];

	@ObfuscatedName("client.wj")
	public int[] field520 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Bj")
	public int[] field525 = new int[1000];

	@ObfuscatedName("client.Cj")
	public int[] field526 = new int[100];

	@ObfuscatedName("client.Dj")
	public String[] field527 = new String[100];

	@ObfuscatedName("client.Ej")
	public String[] field528 = new String[100];

	@ObfuscatedName("client.Hj")
	public boolean field531 = true;

	@ObfuscatedName("client.Uj")
	public volatile boolean field544 = false;

	@ObfuscatedName("client.ak")
	public volatile boolean field548 = false;

	@ObfuscatedName("client.bk")
	public int[] field549 = new int[50];

	@ObfuscatedName("client.dk")
	public LinkList[][][] field551 = new LinkList[4][104][104];

	@ObfuscatedName("client.gk")
	public int[] field554 = new int[7];

	@ObfuscatedName("client.hk")
	public int field555 = -1;

	@ObfuscatedName("client.N")
	public static BigInteger field123 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sc")
	public static int field196 = 10;

	@ObfuscatedName("client.uc")
	public static boolean field198 = true;

	@ObfuscatedName("client.Vc")
	public static int[] field221 = new int[99];

	@ObfuscatedName("client.Yd")
	public static String field271 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Zd")
	public static final int[][] field272 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Yh")
	public static int[] field450 = new int[32];

	@ObfuscatedName("client.aj")
	public static final int[] field500 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Wj")
	public static BigInteger field546 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.R")
	public int field126;

	@ObfuscatedName("client.S")
	public int field127;

	@ObfuscatedName("client.T")
	public int field128;

	@ObfuscatedName("client.U")
	public int field129;

	@ObfuscatedName("client.V")
	public int field130;

	@ObfuscatedName("client.X")
	public int field132;

	@ObfuscatedName("client.Y")
	public int field133;

	@ObfuscatedName("client.ab")
	public int field135;

	@ObfuscatedName("client.cb")
	public int field137;

	@ObfuscatedName("client.gb")
	public int field141;

	@ObfuscatedName("client.hb")
	public int field142;

	@ObfuscatedName("client.jb")
	public int field144;

	@ObfuscatedName("client.mb")
	public int field147;

	@ObfuscatedName("client.ob")
	public int field149;

	@ObfuscatedName("client.qb")
	public int field151;

	@ObfuscatedName("client.rb")
	public int field152;

	@ObfuscatedName("client.sb")
	public int field153;

	@ObfuscatedName("client.tb")
	public int field154;

	@ObfuscatedName("client.ub")
	public int field155;

	@ObfuscatedName("client.vb")
	public int field156;

	@ObfuscatedName("client.wb")
	public int field157;

	@ObfuscatedName("client.xb")
	public int field158;

	@ObfuscatedName("client.yb")
	public int field159;

	@ObfuscatedName("client.zb")
	public int field160;

	@ObfuscatedName("client.Ib")
	public int field169;

	@ObfuscatedName("client.Kb")
	public int field171;

	@ObfuscatedName("client.Lb")
	public int field172;

	@ObfuscatedName("client.Ob")
	public int field174;

	@ObfuscatedName("client.Qb")
	public static int field175;

	@ObfuscatedName("client.Yb")
	public int field180;

	@ObfuscatedName("client.Zb")
	public int field181;

	@ObfuscatedName("client.ac")
	public int field182;

	@ObfuscatedName("client.kc")
	public int field192;

	@ObfuscatedName("client.lc")
	public int field193;

	@ObfuscatedName("client.tc")
	public static int field197;

	@ObfuscatedName("client.Ic")
	public int field208;

	@ObfuscatedName("client.Uc")
	public int field220;

	@ObfuscatedName("client.Yc")
	public int field223;

	@ObfuscatedName("client.od")
	public int field236;

	@ObfuscatedName("client.qd")
	public int field238;

	@ObfuscatedName("client.ud")
	public int field242;

	@ObfuscatedName("client.vd")
	public static int field243;

	@ObfuscatedName("client.Gd")
	public int field254;

	@ObfuscatedName("client.Hd")
	public int field255;

	@ObfuscatedName("client.Jd")
	public int field257;

	@ObfuscatedName("client.Kd")
	public int field258;

	@ObfuscatedName("client.Ld")
	public int field259;

	@ObfuscatedName("client.Md")
	public int field260;

	@ObfuscatedName("client.Nd")
	public int field261;

	@ObfuscatedName("client.Od")
	public int field262;

	@ObfuscatedName("client.Pd")
	public int field263;

	@ObfuscatedName("client.Xd")
	public int field270;

	@ObfuscatedName("client.ae")
	public int field273;

	@ObfuscatedName("client.ce")
	public int field275;

	@ObfuscatedName("client.de")
	public int field276;

	@ObfuscatedName("client.le")
	public int field281;

	@ObfuscatedName("client.me")
	public int field282;

	@ObfuscatedName("client.ne")
	public int field283;

	@ObfuscatedName("client.oe")
	public int field284;

	@ObfuscatedName("client.ve")
	public int field289;

	@ObfuscatedName("client.ze")
	public int field292;

	@ObfuscatedName("client.Ae")
	public int field293;

	@ObfuscatedName("client.Fe")
	public int field297;

	@ObfuscatedName("client.Ge")
	public int field298;

	@ObfuscatedName("client.He")
	public int field299;

	@ObfuscatedName("client.Ie")
	public int field300;

	@ObfuscatedName("client.Je")
	public int field301;

	@ObfuscatedName("client.Ke")
	public int field302;

	@ObfuscatedName("client.Me")
	public int field304;

	@ObfuscatedName("client.Ne")
	public int field305;

	@ObfuscatedName("client.Pe")
	public int field306;

	@ObfuscatedName("client.Re")
	public static int field307;

	@ObfuscatedName("client.We")
	public int field310;

	@ObfuscatedName("client.cf")
	public int field316;

	@ObfuscatedName("client.df")
	public int field317;

	@ObfuscatedName("client.hf")
	public int field320;

	@ObfuscatedName("client.lf")
	public int field323;

	@ObfuscatedName("client.qf")
	public int field325;

	@ObfuscatedName("client.wf")
	public static int field331;

	@ObfuscatedName("client.xf")
	public int field332;

	@ObfuscatedName("client.Ff")
	public int field339;

	@ObfuscatedName("client.If")
	public int field342;

	@ObfuscatedName("client.Of")
	public static int field348;

	@ObfuscatedName("client.Pf")
	public int field349;

	@ObfuscatedName("client.Uf")
	public int field354;

	@ObfuscatedName("client.Zf")
	public int field359;

	@ObfuscatedName("client.ag")
	public int field360;

	@ObfuscatedName("client.bg")
	public int field361;

	@ObfuscatedName("client.cg")
	public int field362;

	@ObfuscatedName("client.dg")
	public int field363;

	@ObfuscatedName("client.gg")
	public int field366;

	@ObfuscatedName("client.ig")
	public int field367;

	@ObfuscatedName("client.jg")
	public int field368;

	@ObfuscatedName("client.og")
	public int field373;

	@ObfuscatedName("client.qg")
	public int field375;

	@ObfuscatedName("client.rg")
	public int field376;

	@ObfuscatedName("client.vg")
	public int field380;

	@ObfuscatedName("client.Ag")
	public int field384;

	@ObfuscatedName("client.Bg")
	public static int field385;

	@ObfuscatedName("client.Ig")
	public int field390;

	@ObfuscatedName("client.Jg")
	public int field391;

	@ObfuscatedName("client.Kg")
	public int field392;

	@ObfuscatedName("client.Lg")
	public int field393;

	@ObfuscatedName("client.Ng")
	public int field395;

	@ObfuscatedName("client.Og")
	public int field396;

	@ObfuscatedName("client.Wg")
	public static int field403;

	@ObfuscatedName("client.bh")
	public static int field406;

	@ObfuscatedName("client.eh")
	public static int field409;

	@ObfuscatedName("client.gh")
	public int field411;

	@ObfuscatedName("client.hh")
	public int field412;

	@ObfuscatedName("client.ih")
	public int field413;

	@ObfuscatedName("client.jh")
	public int field414;

	@ObfuscatedName("client.ph")
	public int field418;

	@ObfuscatedName("client.th")
	public int field422;

	@ObfuscatedName("client.Hh")
	public int field435;

	@ObfuscatedName("client.Zh")
	public int field451;

	@ObfuscatedName("client.ai")
	public int field452;

	@ObfuscatedName("client.bi")
	public int field453;

	@ObfuscatedName("client.ci")
	public int field454;

	@ObfuscatedName("client.di")
	public int field455;

	@ObfuscatedName("client.ei")
	public int field456;

	@ObfuscatedName("client.fi")
	public int field457;

	@ObfuscatedName("client.hi")
	public int field458;

	@ObfuscatedName("client.ji")
	public int field460;

	@ObfuscatedName("client.ki")
	public int field461;

	@ObfuscatedName("client.li")
	public int field462;

	@ObfuscatedName("client.ri")
	public int field467;

	@ObfuscatedName("client.ti")
	public static int field469;

	@ObfuscatedName("client.vi")
	public static int field470;

	@ObfuscatedName("client.wi")
	public int field471;

	@ObfuscatedName("client.zi")
	public int field474;

	@ObfuscatedName("client.Ci")
	public int field476;

	@ObfuscatedName("client.Ei")
	public int field478;

	@ObfuscatedName("client.Ki")
	public int field484;

	@ObfuscatedName("client.Li")
	public int field485;

	@ObfuscatedName("client.Mi")
	public int field486;

	@ObfuscatedName("client.Ni")
	public int field487;

	@ObfuscatedName("client.Ui")
	public int field494;

	@ObfuscatedName("client.Vi")
	public int field495;

	@ObfuscatedName("client.Wi")
	public int field496;

	@ObfuscatedName("client.bj")
	public int field501;

	@ObfuscatedName("client.cj")
	public int field502;

	@ObfuscatedName("client.fj")
	public int field505;

	@ObfuscatedName("client.mj")
	public int field511;

	@ObfuscatedName("client.qj")
	public int field514;

	@ObfuscatedName("client.vj")
	public int field519;

	@ObfuscatedName("client.Aj")
	public int field524;

	@ObfuscatedName("client.Fj")
	public int field529;

	@ObfuscatedName("client.Gj")
	public int field530;

	@ObfuscatedName("client.Ij")
	public int field532;

	@ObfuscatedName("client.Jj")
	public int field533;

	@ObfuscatedName("client.Kj")
	public int field534;

	@ObfuscatedName("client.Lj")
	public int field535;

	@ObfuscatedName("client.Mj")
	public int field536;

	@ObfuscatedName("client.Nj")
	public int field537;

	@ObfuscatedName("client.Oj")
	public int field538;

	@ObfuscatedName("client.Pj")
	public static int field539;

	@ObfuscatedName("client.Vj")
	public int field545;

	@ObfuscatedName("client.Zj")
	public int field547;

	@ObfuscatedName("client.ck")
	public int field550;

	@ObfuscatedName("client.ek")
	public int field552;

	@ObfuscatedName("client.fk")
	public static int field553;

	@ObfuscatedName("client.jk")
	public int field556;

	@ObfuscatedName("client.kk")
	public int field557;

	@ObfuscatedName("client.lk")
	public int field558;

	@ObfuscatedName("client.mk")
	public int field559;

	@ObfuscatedName("client.Xb")
	public long field179;

	@ObfuscatedName("client.zc")
	public long field202;

	@ObfuscatedName("client.Dg")
	public long field386;

	@ObfuscatedName("client.ni")
	public long field464;

	@ObfuscatedName("client.Ii")
	public long field482;

	@ObfuscatedName("client.Jb")
	public Jagfile field170;

	@ObfuscatedName("client.Gi")
	public MouseTracking field480;

	@ObfuscatedName("client.ie")
	public Pix32 field278;

	@ObfuscatedName("client.je")
	public Pix32 field279;

	@ObfuscatedName("client.Be")
	public Pix32 field294;

	@ObfuscatedName("client.Ce")
	public Pix32 field295;

	@ObfuscatedName("client.Af")
	public Pix32 field335;

	@ObfuscatedName("client.Qf")
	public Pix32 field350;

	@ObfuscatedName("client.Rf")
	public Pix32 field351;

	@ObfuscatedName("client.eg")
	public Pix32 field364;

	@ObfuscatedName("client.kg")
	public Pix32 field369;

	@ObfuscatedName("client.Ch")
	public Pix32 field430;

	@ObfuscatedName("client.Dh")
	public Pix32 field431;

	@ObfuscatedName("client.Eh")
	public Pix32 field432;

	@ObfuscatedName("client.Fh")
	public Pix32 field433;

	@ObfuscatedName("client.Gh")
	public Pix32 field434;

	@ObfuscatedName("client.Fi")
	public Pix32 field479;

	@ObfuscatedName("client.pe")
	public ClientStream field285;

	@ObfuscatedName("client.bc")
	public PixMap field183;

	@ObfuscatedName("client.cc")
	public PixMap field184;

	@ObfuscatedName("client.dc")
	public PixMap field185;

	@ObfuscatedName("client.ec")
	public PixMap field186;

	@ObfuscatedName("client.fc")
	public PixMap field187;

	@ObfuscatedName("client.gc")
	public PixMap field188;

	@ObfuscatedName("client.hc")
	public PixMap field189;

	@ObfuscatedName("client.ic")
	public PixMap field190;

	@ObfuscatedName("client.jc")
	public PixMap field191;

	@ObfuscatedName("client.Wf")
	public PixMap field356;

	@ObfuscatedName("client.Xf")
	public PixMap field357;

	@ObfuscatedName("client.Yf")
	public PixMap field358;

	@ObfuscatedName("client.Sg")
	public PixMap field399;

	@ObfuscatedName("client.Tg")
	public PixMap field400;

	@ObfuscatedName("client.Ug")
	public PixMap field401;

	@ObfuscatedName("client.Vg")
	public PixMap field402;

	@ObfuscatedName("client.Ih")
	public PixMap field436;

	@ObfuscatedName("client.Jh")
	public PixMap field437;

	@ObfuscatedName("client.Kh")
	public PixMap field438;

	@ObfuscatedName("client.Lh")
	public PixMap field439;

	@ObfuscatedName("client.Mh")
	public PixMap field440;

	@ObfuscatedName("client.Nh")
	public PixMap field441;

	@ObfuscatedName("client.Oh")
	public PixMap field442;

	@ObfuscatedName("client.Ph")
	public PixMap field443;

	@ObfuscatedName("client.Qh")
	public PixMap field444;

	@ObfuscatedName("client.Ye")
	public PixFont field312;

	@ObfuscatedName("client.Ze")
	public PixFont field313;

	@ObfuscatedName("client.af")
	public PixFont field314;

	@ObfuscatedName("client.bf")
	public PixFont field315;

	@ObfuscatedName("client.ah")
	public World3D field405;

	@ObfuscatedName("client.Ub")
	public Isaac field177;

	@ObfuscatedName("client.Bb")
	public Pix8 field162;

	@ObfuscatedName("client.Cb")
	public Pix8 field163;

	@ObfuscatedName("client.Db")
	public Pix8 field164;

	@ObfuscatedName("client.Eb")
	public Pix8 field165;

	@ObfuscatedName("client.Fb")
	public Pix8 field166;

	@ObfuscatedName("client.id")
	public Pix8 field230;

	@ObfuscatedName("client.jd")
	public Pix8 field231;

	@ObfuscatedName("client.kd")
	public Pix8 field232;

	@ObfuscatedName("client.Ad")
	public Pix8 field248;

	@ObfuscatedName("client.Bd")
	public Pix8 field249;

	@ObfuscatedName("client.Cd")
	public Pix8 field250;

	@ObfuscatedName("client.Dd")
	public Pix8 field251;

	@ObfuscatedName("client.Ed")
	public Pix8 field252;

	@ObfuscatedName("client.Jf")
	public Pix8 field343;

	@ObfuscatedName("client.Kf")
	public Pix8 field344;

	@ObfuscatedName("client.vh")
	public Pix8 field424;

	@ObfuscatedName("client.wh")
	public Pix8 field425;

	@ObfuscatedName("client.xh")
	public Pix8 field426;

	@ObfuscatedName("client.yj")
	public Pix8 field522;

	@ObfuscatedName("client.zj")
	public Pix8 field523;

	@ObfuscatedName("client.dh")
	public static ClientPlayer field408;

	@ObfuscatedName("client.xj")
	public OnDemand field521;

	@ObfuscatedName("client.se")
	public String field287;

	@ObfuscatedName("client.Xe")
	public String field311;

	@ObfuscatedName("client.Mg")
	public String field394;

	@ObfuscatedName("client.kh")
	public String field415;

	@ObfuscatedName("client.ii")
	public Socket field459;

	@ObfuscatedName("client.pb")
	public static boolean field150;

	@ObfuscatedName("client.vc")
	public static boolean field199;

	@ObfuscatedName("client.fd")
	public static boolean field228;

	@ObfuscatedName("client.Qd")
	public static boolean field264;

	@ObfuscatedName("client.db")
	public int[] field138;

	@ObfuscatedName("client.eb")
	public int[] field139;

	@ObfuscatedName("client.fb")
	public int[] field140;

	@ObfuscatedName("client.Rd")
	public int[] field265;

	@ObfuscatedName("client.Sd")
	public int[] field266;

	@ObfuscatedName("client.Td")
	public int[] field267;

	@ObfuscatedName("client.Ud")
	public int[] field268;

	@ObfuscatedName("client.yf")
	public int[] field333;

	@ObfuscatedName("client.zf")
	public int[] field334;

	@ObfuscatedName("client.mh")
	public int[] field416;

	@ObfuscatedName("client.nh")
	public int[] field417;

	@ObfuscatedName("client.Qj")
	public int[] field540;

	@ObfuscatedName("client.Rj")
	public int[] field541;

	@ObfuscatedName("client.Sj")
	public int[] field542;

	@ObfuscatedName("client.Tj")
	public int[] field543;

	@ObfuscatedName("client.fg")
	public Pix8[] field365;

	@ObfuscatedName("client.L")
	public byte[][] field121;

	@ObfuscatedName("client.qi")
	public byte[][] field466;

	@ObfuscatedName("client.ng")
	public byte[][][] field372;

	@ObfuscatedName("client.Mb")
	public int[][][] field173;

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method33(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field144 = 0;
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

			field144 = 0;
			label46: for (int var7 = 0; var7 < ObjType.field718; var7++) {
				ObjType var8 = ObjType.method221(var7);
				if (var8.field726 == -1 && var8.field712 != null) {
					String var9 = var8.field712.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field145[field144] = var9;
					field146[field144] = var7;
					field144++;
					if (field144 >= field145.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method34() {
		field229.p1isaac(110);

		if (field337 != -1) {
			method64(field337);
			field337 = -1;
			field420 = true;
			field472 = false;
			field219 = true;
		}

		if (field253 != -1) {
			method64(field253);
			field253 = -1;
			field473 = true;
			field472 = false;
		}

		if (field308 != -1) {
			method64(field308);
			field308 = -1;
			field303 = true;
		}

		if (field226 != -1) {
			method64(field226);
			field226 = -1;
		}

		if (field410 != -1) {
			method64(field410);
			field410 = -1;
		}
	}

	@ObfuscatedName("client.a(IBLMFMVIYHT;)V")
	public final void method35(int arg0, Packet arg1) {
		while (arg1.field1106 + 10 < arg0 * 8) {
			int var3 = arg1.gBit(11);
			if (var3 == 2047) {
				break;
			}

			if (field235[var3] == null) {
				field235[var3] = new ClientPlayer();
				if (field240[var3] != null) {
					field235[var3].method574(field240[var3]);
				}
			}

			field237[field236++] = var3;
			ClientPlayer var4 = field235[var3];
			var4.field981 = field553;
			int var5 = arg1.gBit(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.gBit(1);
			if (var6 == 1) {
				field239[field238++] = var3;
			}

			int var7 = arg1.gBit(1);
			int var8 = arg1.gBit(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method354(field408.field983[0] + var8, var7 == 1, field408.field982[0] + var5);
		}

		arg1.accessBytes();
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 377);

			if (arg0.length == 5) {
				field196 = Integer.parseInt(arg0[0]);
				field197 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method124();
				} else if (arg0[2].equals("highmem")) {
					method47();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field198 = false;
				} else if (arg0[3].equals("members")) {
					field198 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.method266(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method36() {
		field548 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field475) {
				field349++;
				method103();
				method103();
				method121();
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

		field548 = false;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method37() {
		for (LocChange var1 = (LocChange) field493.method6(); var1 != null; var1 = (LocChange) field493.method8()) {
			if (var1.field1143 == -1) {
				var1.field1148 = 0;
				method167(var1);
			} else {
				var1.method604();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method38(String arg0) {
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

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method39(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(I)V")
	public final void method40() {
		field235 = null;
		field237 = null;
		field239 = null;
		field240 = null;
		field525 = null;
		field183 = null;
		field184 = null;
		field185 = null;
		field186 = null;
		field162 = null;
		field163 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field248 = null;
		field249 = null;
		field250 = null;
		field251 = null;
		field252 = null;
		field131 = null;
		field377 = null;
		field499 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field296 = null;
		field138 = null;
		field121 = null;
		field466 = null;
		field139 = null;
		field140 = null;
		field441 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field167 = null;
		field428 = null;
		field370 = null;
		field371 = null;
		field430 = null;
		field431 = null;
		field432 = null;
		field433 = null;
		field434 = null;

		if (field480 != null) {
			field480.field89 = false;
		}

		field480 = null;
		field230 = null;
		field231 = null;
		field232 = null;
		field187 = null;
		field188 = null;
		field189 = null;
		field190 = null;
		field191 = null;
		field173 = null;
		field372 = null;
		field405 = null;
		field492 = null;
		field369 = null;
		field439 = null;
		field440 = null;
		field436 = null;
		field437 = null;
		field438 = null;
		field364 = null;
		field421 = null;
		field518 = null;
		field328 = null;
		field222 = null;
		field176 = null;
		method70();
		field229 = null;
		field201 = null;
		field427 = null;
		field399 = null;
		field400 = null;
		field401 = null;
		field402 = null;
		field424 = null;
		field425 = null;
		field426 = null;

		try {
			if (field285 != null) {
				field285.method233();
			}
		} catch (Exception var1) {
		}

		field285 = null;
		field326 = null;
		field327 = null;
		field509 = null;
		field379 = null;
		field381 = null;
		field477 = null;
		field378 = null;
		field397 = null;
		field290 = null;
		field168 = null;
		field241 = null;
		field512 = null;
		field446 = null;
		field335 = null;

		if (field521 != null) {
			field521.method596();
		}

		field521 = null;
		field244 = null;
		field245 = null;
		field246 = null;
		field247 = null;
		field423 = null;
		field551 = null;
		field493 = null;
		method168();
		LocType.method571();
		NpcType.method471();
		ObjType.method231();
		Component.method211();
		FloType.field697 = null;
		IdkType.field1453 = null;
		UnkType.field63 = null;
		SeqType.field680 = null;
		SpotAnimType.field1118 = null;
		SpotAnimType.field1130 = null;
		VarpType.field1303 = null;
		field830 = null;
		ClientPlayer.field1443 = null;
		Pix3D.method544();
		World3D.method273();
		Model.method355();
		AnimFrame.method263();
		System.gc();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method41() {
		if (field843 == 1) {
			if (field844 >= 539 && field844 <= 573 && field845 >= 169 && field845 < 205 && field330[0] != -1) {
				field420 = true;
				field515 = 0;
				field219 = true;
			}

			if (field844 >= 569 && field844 <= 599 && field845 >= 168 && field845 < 205 && field330[1] != -1) {
				field420 = true;
				field515 = 1;
				field219 = true;
			}

			if (field844 >= 597 && field844 <= 627 && field845 >= 168 && field845 < 205 && field330[2] != -1) {
				field420 = true;
				field515 = 2;
				field219 = true;
			}

			if (field844 >= 625 && field844 <= 669 && field845 >= 168 && field845 < 203 && field330[3] != -1) {
				field420 = true;
				field515 = 3;
				field219 = true;
			}

			if (field844 >= 666 && field844 <= 696 && field845 >= 168 && field845 < 205 && field330[4] != -1) {
				field420 = true;
				field515 = 4;
				field219 = true;
			}

			if (field844 >= 694 && field844 <= 724 && field845 >= 168 && field845 < 205 && field330[5] != -1) {
				field420 = true;
				field515 = 5;
				field219 = true;
			}

			if (field844 >= 722 && field844 <= 756 && field845 >= 169 && field845 < 205 && field330[6] != -1) {
				field420 = true;
				field515 = 6;
				field219 = true;
			}

			if (field844 >= 540 && field844 <= 574 && field845 >= 466 && field845 < 502 && field330[7] != -1) {
				field420 = true;
				field515 = 7;
				field219 = true;
			}

			if (field844 >= 572 && field844 <= 602 && field845 >= 466 && field845 < 503 && field330[8] != -1) {
				field420 = true;
				field515 = 8;
				field219 = true;
			}

			if (field844 >= 599 && field844 <= 629 && field845 >= 466 && field845 < 503 && field330[9] != -1) {
				field420 = true;
				field515 = 9;
				field219 = true;
			}

			if (field844 >= 627 && field844 <= 671 && field845 >= 467 && field845 < 502 && field330[10] != -1) {
				field420 = true;
				field515 = 10;
				field219 = true;
			}

			if (field844 >= 669 && field844 <= 699 && field845 >= 466 && field845 < 503 && field330[11] != -1) {
				field420 = true;
				field515 = 11;
				field219 = true;
			}

			if (field844 >= 696 && field844 <= 726 && field845 >= 466 && field845 < 503 && field330[12] != -1) {
				field420 = true;
				field515 = 12;
				field219 = true;
			}

			if (field844 >= 724 && field844 <= 758 && field845 >= 466 && field845 < 502 && field330[13] != -1) {
				field420 = true;
				field515 = 13;
				field219 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method42() {
		try {
			int var1 = field408.field1006 + field135;
			int var2 = field408.field1007 + field273;
			if (field494 - var1 < -500 || field494 - var1 > 500 || field495 - var2 < -500 || field495 - var2 > 500) {
				field494 = var1;
				field495 = var2;
			}

			if (field494 != var1) {
				field494 += (var1 - field494) / 16;
			}

			if (field495 != var2) {
				field495 += (var2 - field495) / 16;
			}

			if (field847[1] == 1) {
				field485 += (-field485 - 24) / 2;
			} else if (field847[2] == 1) {
				field485 += (24 - field485) / 2;
			} else {
				field485 /= 2;
			}

			if (field847[3] == 1) {
				field486 += (12 - field486) / 2;
			} else if (field847[4] == 1) {
				field486 += (-field486 - 12) / 2;
			} else {
				field486 /= 2;
			}

			field484 = field485 / 2 + field484 & 0x7FF;
			field483 += field486 / 2;
			if (field483 < 128) {
				field483 = 128;
			}

			if (field483 > 383) {
				field483 = 383;
			}

			int var3 = field494 >> 7;
			int var4 = field495 >> 7;
			int var5 = method133(field495, field494, field339);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field339;
						if (var9 < 3 && (field372[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field173[var9][var7][var8];
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

			if (var11 > field519) {
				field519 += (var11 - field519) / 24;
			} else if (var11 < field519) {
				field519 += (var11 - field519) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field408.field1006 + "," + field408.field1007 + "," + field494 + "," + field495 + "," + field171 + "," + field172 + "," + field297 + "," + field298);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LEWIXBTLV;I)Z")
	public final boolean method43(Component arg0) {
		int var2 = arg0.field637;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field423[field422] = "Remove @whi@" + arg0.field625;
				field246[field422] = 859;
				field422++;
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

		field423[field422] = "Remove @whi@" + field131[var2];
		field246[field422] = 775;
		field422++;
		field423[field422] = "Message @whi@" + field131[var2];
		field246[field422] = 984;
		field422++;
		return true;
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method44(boolean arg0, byte[] arg1) {
		if (field498) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method45() {
		field508 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field554[var1] = -1;
			for (int var2 = 0; var2 < IdkType.field1452; var2++) {
				if (!IdkType.field1453[var2].field1459 && IdkType.field1453[var2].field1454 == var1 + (field388 ? 0 : 7)) {
					field554[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method46(int arg0, int arg1) {
		LinkList var3 = field551[field339][arg0][arg1];
		if (var3 == null) {
			field405.method295(field339, arg0, arg1);
		} else {
			int var4 = -99999999;
			ClientObj var5 = null;
			for (ClientObj var6 = (ClientObj) var3.method6(); var6 != null; var6 = (ClientObj) var3.method8()) {
				ObjType var7 = ObjType.method221(var6.field767);
				int var8 = var7.field728;
				if (var7.field750) {
					var8 = (var6.field768 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method4(var5);
			ClientObj var9 = null;
			ClientObj var10 = null;
			for (ClientObj var11 = (ClientObj) var3.method6(); var11 != null; var11 = (ClientObj) var3.method8()) {
				if (var5.field767 != var11.field767 && var9 == null) {
					var9 = var11;
				}

				if (var5.field767 != var11.field767 && var9.field767 != var11.field767 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field405.method281(method133(arg1 * 128 + 64, arg0 * 128 + 64, field339), field339, var5, var9, var12, var10, arg1, arg0);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public static final void method47() {
		World3D.field875 = false;
		Pix3D.field1356 = false;
		field199 = false;
		World.field119 = false;
		LocType.field1392 = false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method48() {
		if (field310 > 1) {
			field310--;
		}

		if (field155 > 0) {
			field155--;
		}

		for (int var1 = 0; var1 < 5 && method53(); var1++) {
		}

		if (field383) {
			synchronized (field480.field91) {
				if (!field228) {
					field480.field93 = 0;
				} else if (field843 != 0 || field480.field93 >= 40) {
					field229.p1isaac(171);
					field229.p1(0);
					int var3 = field229.pos;
					int var4 = 0;
					for (int var5 = 0; var5 < field480.field93 && var3 - field229.pos < 240; var5++) {
						var4++;
						int var6 = field480.field90[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field480.field94[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field480.field90[var5] == -1 && field480.field94[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field275 != var7 || field276 != var6) {
							int var9 = var7 - field275;
							field275 = var7;
							int var10 = var6 - field276;
							field276 = var6;

							if (field529 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field229.p2((field529 << 12) + (var9 << 6) + var10);
								field529 = 0;
							} else if (field529 < 8) {
								field229.p3((field529 << 19) + var8 + 0x800000);
								field529 = 0;
							} else {
								field229.p4((field529 << 19) + var8 - 0x40000000);
								field529 = 0;
							}
						} else if (field529 < 2047) {
							field529++;
						}
					}

					field229.psize1(field229.pos - var3);

					if (var4 >= field480.field93) {
						field480.field93 = 0;
					} else {
						field480.field93 -= var4;
						for (int var11 = 0; var11 < field480.field93; var11++) {
							field480.field94[var11] = field480.field94[var4 + var11];
							field480.field90[var11] = field480.field90[var4 + var11];
						}
					}
				}
			}

			if (field843 != 0) {
				long var12 = (field846 - field179) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field179 = field846;
				int var14 = field845;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field844;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field843 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field229.p1isaac(19);
				field229.p4((var17 << 19) + (var18 << 20) + var16);
			}

			if (field496 > 0) {
				field496--;
			}

			if (field847[1] == 1 || field847[2] == 1 || field847[3] == 1 || field847[4] == 1) {
				field497 = true;
			}

			if (field497 && field496 <= 0) {
				field496 = 20;
				field497 = false;
				field229.p1isaac(140);
				field229.p2_alt1(field483);
				field229.p2_alt1(field484);
			}

			if (field834 && !field506) {
				field506 = true;
				field229.p1isaac(187);
				field229.p1(1);
			}

			if (!field834 && field506) {
				field506 = false;
				field229.p1isaac(187);
				field229.p1(0);
			}

			method170();
			method56();
			method179();
			field153++;
			if (field153 > 750) {
				method79();
			}

			method123();
			method89();
			method107();
			field220++;

			if (field284 != 0) {
				field283 += 20;
				if (field283 >= 400) {
					field284 = 0;
				}
			}

			if (field559 != 0) {
				field556++;
				if (field556 >= 15) {
					if (field559 == 2) {
						field420 = true;
					}

					if (field559 == 3) {
						field473 = true;
					}

					field559 = 0;
				}
			}

			if (field361 != 0) {
				field501++;

				if (field837 > field362 + 5 || field837 < field362 - 5 || field838 > field363 + 5 || field838 < field363 - 5) {
					field398 = true;
				}

				if (field836 == 0) {
					if (field361 == 2) {
						field420 = true;
					}

					if (field361 == 3) {
						field473 = true;
					}

					field361 = 0;

					if (field398 && field501 >= 5) {
						field317 = -1;
						method114();

						if (field359 == field317 && field360 != field316) {
							Component var19 = Component.method204(field359);
							byte var20 = 0;
							if (field223 == 1 && var19.field637 == 206) {
								var20 = 1;
							}

							if (var19.field663[field316] <= 0) {
								var20 = 0;
							}

							if (var19.field612) {
								int var21 = field360;
								int var22 = field316;
								var19.field663[var22] = var19.field663[var21];
								var19.field619[var22] = var19.field619[var21];
								var19.field663[var21] = -1;
								var19.field619[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field360;
								int var24 = field316;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method205(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method205(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method205(field316, field360);
							}

							field229.p1isaac(123);
							field229.p2_alt3(field316);
							field229.p1_alt1(var20);
							field229.p2_alt2(field359);
							field229.p2_alt1(field360);
						}
					} else if ((field530 == 1 || method150(field422 - 1)) && field422 > 2) {
						method131();
					} else if (field422 > 0) {
						method144(field422 - 1);
					}

					field556 = 10;
					field843 = 0;
				}
			}

			if (World3D.field909 != -1) {
				int var25 = World3D.field909;
				int var26 = World3D.field910;
				boolean var27 = method55(true, var26, field408.field983[0], 0, 0, 0, 0, var25, 0, 0, field408.field982[0]);
				World3D.field909 = -1;

				if (var27) {
					field281 = field844;
					field282 = field845;
					field284 = 1;
					field283 = 0;
				}
			}

			if (field843 == 1 && field311 != null) {
				field311 = null;
				field473 = true;
				field843 = 0;
			}

			method74();

			if (field308 == -1) {
				method173();
				method41();
				method59();
			}

			if (field836 == 1 || field843 == 1) {
				field342++;
			}

			if (field514 == 0 && field301 == 0 && field376 == 0) {
				if (field174 > 0) {
					field174--;
				}
			} else if (field174 < 100) {
				field174++;
				if (field174 == 100) {
					if (field514 != 0) {
						field473 = true;
					}

					if (field301 != 0) {
						field420 = true;
					}
				}
			}

			if (field323 == 2) {
				method42();
			}

			if (field323 == 2 && field447) {
				method49();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field389[var28]++;
			}

			method50();
			field835++;
			if (field835 > 4500) {
				field155 = 250;
				field835 -= 500;
				field229.p1isaac(202);
			}

			field366++;
			if (field366 > 500) {
				field366 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field135 += field136;
				}

				if ((var29 & 0x2) == 2) {
					field273 += field274;
				}

				if ((var29 & 0x4) == 4) {
					field487 += field488;
				}
			}

			if (field135 < -50) {
				field136 = 2;
			}

			if (field135 > 50) {
				field136 = -2;
			}

			if (field273 < -55) {
				field274 = 2;
			}

			if (field273 > 55) {
				field274 = -2;
			}

			if (field487 < -40) {
				field488 = 1;
			}

			if (field487 > 40) {
				field488 = -1;
			}

			field302++;
			if (field302 > 500) {
				field302 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field193 += field194;
				}

				if ((var30 & 0x2) == 2) {
					field467 += field468;
				}
			}

			if (field193 < -60) {
				field194 = 2;
			}

			if (field193 > 60) {
				field194 = -2;
			}

			if (field467 < -20) {
				field468 = 1;
			}

			if (field467 > 10) {
				field468 = -1;
			}

			field154++;
			if (field154 > 50) {
				field229.p1isaac(40);
			}

			try {
				if (field285 != null && field229.pos > 0) {
					field285.method237(field229.pos, 0, field229.data);
					field229.pos = 0;
					field154 = 0;
				}
			} catch (IOException var32) {
				method79();
			} catch (Exception var33) {
				method148();
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method49() {
		int var1 = field156 * 128 + 64;
		int var2 = field157 * 128 + 64;
		int var3 = method133(var2, var1, field339) - field158;

		if (field452 < var1) {
			field452 += (var1 - field452) * field160 / 1000 + field159;
			if (field452 > var1) {
				field452 = var1;
			}
		}

		if (field452 > var1) {
			field452 -= (field452 - var1) * field160 / 1000 + field159;
			if (field452 < var1) {
				field452 = var1;
			}
		}

		if (field453 < var3) {
			field453 += (var3 - field453) * field160 / 1000 + field159;
			if (field453 > var3) {
				field453 = var3;
			}
		}

		if (field453 > var3) {
			field453 -= (field453 - var3) * field160 / 1000 + field159;
			if (field453 < var3) {
				field453 = var3;
			}
		}

		if (field454 < var2) {
			field454 += (var2 - field454) * field160 / 1000 + field159;
			if (field454 > var2) {
				field454 = var2;
			}
		}

		if (field454 > var2) {
			field454 -= (field454 - var2) * field160 / 1000 + field159;
			if (field454 < var2) {
				field454 = var2;
			}
		}

		int var4 = field258 * 128 + 64;
		int var5 = field259 * 128 + 64;
		int var6 = method133(var5, var4, field339) - field260;
		int var7 = var4 - field452;
		int var8 = var6 - field453;
		int var9 = var5 - field454;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field455 < var11) {
			field455 += (var11 - field455) * field262 / 1000 + field261;
			if (field455 > var11) {
				field455 = var11;
			}
		}

		if (field455 > var11) {
			field455 -= (field455 - var11) * field262 / 1000 + field261;
			if (field455 < var11) {
				field455 = var11;
			}
		}

		int var13 = var12 - field456;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field456 += field262 * var13 / 1000 + field261;
			field456 &= 0x7FF;
		}

		if (var13 < 0) {
			field456 -= -var13 * field262 / 1000 + field261;
			field456 &= 0x7FF;
		}

		int var14 = var12 - field456;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field456 = var12;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method50() {
		while (true) {
			int var1 = method270();
			if (var1 == -1) {
				return;
			}

			if (field410 != -1 && field465 == field410) {
				if (var1 == 8 && field122.length() > 0) {
					field122 = field122.substring(0, field122.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field122.length() < 12) {
					field122 = field122 + (char) var1;
				}
			} else if (field148) {
				if (var1 >= 32 && var1 <= 122 && field286.length() < 80) {
					field286 = field286 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field286.length() > 0) {
					field286 = field286.substring(0, field286.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field148 = false;
					field473 = true;

					if (field457 == 1) {
						long var2 = JString.method344(field286);
						method125(var2);
					}

					if (field457 == 2 && field141 > 0) {
						long var4 = JString.method344(field286);
						method73(var4);
					}

					if (field457 == 3 && field286.length() > 0) {
						field229.p1isaac(227);
						field229.p1(0);
						int var6 = field229.pos;
						field229.p8(field386);
						WordPack.method454(field286, field229);
						field229.psize1(field229.pos - var6);
						field286 = WordPack.method455(field286);
						field286 = WordFilter.method504(field286);
						method67(JString.method348(JString.method345(field386)), field286, 6);

						if (field169 == 2) {
							field169 = 1;
							field448 = true;
							field229.p1isaac(176);
							field229.p1(field270);
							field229.p1(field169);
							field229.p1(field462);
						}
					}

					if (field457 == 4 && field137 < 100) {
						long var7 = JString.method344(field286);
						method112(var7);
					}

					if (field457 == 5 && field137 > 0) {
						long var9 = JString.method344(field286);
						method120(var9);
					}
				}
			} else if (field476 == 1) {
				if (var1 >= 48 && var1 <= 57 && field218.length() < 10) {
					field218 = field218 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field218.length() > 0) {
					field218 = field218.substring(0, field218.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field218.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field218);
						} catch (Exception var21) {
						}

						field229.p1isaac(75);
						field229.p4(var11);
					}

					field476 = 0;
					field473 = true;
				}
			} else if (field476 == 2) {
				if (var1 >= 32 && var1 <= 122 && field218.length() < 12) {
					field218 = field218 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field218.length() > 0) {
					field218 = field218.substring(0, field218.length() - 1);
					field473 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field218.length() > 0) {
						field229.p1isaac(206);
						field229.p8(JString.method344(field218));
					}

					field476 = 0;
					field473 = true;
				}
			} else if (field476 == 3) {
				if (var1 >= 32 && var1 <= 122 && field218.length() < 40) {
					field218 = field218 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field218.length() > 0) {
					field218 = field218.substring(0, field218.length() - 1);
					field473 = true;
				}
			} else if (field253 == -1 && field308 == -1) {
				if (var1 >= 32 && var1 <= 122 && field352.length() < 80) {
					field352 = field352 + (char) var1;
					field473 = true;
				}

				if (var1 == 8 && field352.length() > 0) {
					field352 = field352.substring(0, field352.length() - 1);
					field473 = true;
				}

				if ((var1 == 13 || var1 == 10) && field352.length() > 0) {
					if (field149 == 2) {
						if (field352.equals("::clientdrop")) {
							method79();
						}

						if (field352.equals("::lag")) {
							method163();
						}

						if (field352.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field521.method597(2); var12++) {
								field521.method584(2, (byte) 1, var12);
							}
						}

						if (field352.equals("::fpson")) {
							field150 = true;
						}

						if (field352.equals("::fpsoff")) {
							field150 = false;
						}

						if (field352.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field492[var13].field1355[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field352.startsWith("::")) {
						field229.p1isaac(56);
						field229.p1(field352.length() - 1);
						field229.pjstr(field352.substring(2));
					} else {
						String var16 = field352.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field352 = field352.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field352 = field352.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field352 = field352.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field352 = field352.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field352 = field352.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field352 = field352.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field352 = field352.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field352 = field352.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field352 = field352.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field352 = field352.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field352 = field352.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field352 = field352.substring(6);
						}

						String var18 = field352.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field352 = field352.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field352 = field352.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field352 = field352.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field352 = field352.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field352 = field352.substring(6);
						}

						field229.p1isaac(49);
						field229.p1(0);
						int var20 = field229.pos;
						field229.p1_alt2(var17);
						field229.p1_alt1(var19);
						field378.pos = 0;
						WordPack.method454(field352, field378);
						field229.pdata(field378.data, field378.pos, 0);
						field229.psize1(field229.pos - var20);
						field352 = WordPack.method455(field352);
						field352 = WordFilter.method504(field352);
						field408.field977 = field352;
						field408.field979 = var17;
						field408.field989 = var19;
						field408.field978 = 150;

						if (field149 == 2) {
							method67("@cr2@" + field408.field1433, field408.field977, 2);
						} else if (field149 == 1) {
							method67("@cr1@" + field408.field1433, field408.field977, 2);
						} else {
							method67(field408.field1433, field408.field977, 2);
						}

						if (field270 == 2) {
							field270 = 3;
							field448 = true;
							field229.p1isaac(176);
							field229.p1(field270);
							field229.p1(field169);
							field229.p1(field462);
						}
					}

					field352 = "";
					field473 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method51(String arg0) throws IOException {
		if (field178) {
			if (field459 != null) {
				try {
					field459.close();
				} catch (Exception var4) {
				}

				field459 = null;
			}

			field459 = method52(43595);
			field459.setSoTimeout(10000);
			InputStream var2 = field459.getInputStream();
			OutputStream var3 = field459.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.g(I)Ljava/net/Socket;")
	public final Socket method52(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method53() {
		if (field285 == null) {
			return false;
		}

		try {
			int var1 = field285.method235();
			if (var1 == 0) {
				return false;
			}

			if (field152 == -1) {
				field285.method236(field427.data, 0, 1);
				field152 = field427.data[0] & 0xFF;
				if (field177 != null) {
					field152 = field152 - field177.method329() & 0xFF;
				}

				field151 = Protocol.field598[field152];
				var1--;
			}

			if (field151 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field285.method236(field427.data, 0, 1);
				field151 = field427.data[0] & 0xFF;
				var1--;
			}

			if (field151 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field285.method236(field427.data, 0, 2);
				field427.pos = 0;
				field151 = field427.g2();
				var1 -= 2;
			}

			if (var1 < field151) {
				return false;
			}

			field427.pos = 0;
			field285.method236(field427.data, 0, field151);
			field153 = 0;
			field182 = field181;
			field181 = field180;
			field180 = field152;

			if (field152 == 166) {
				int var2 = field427.g2b_alt1();
				int var3 = field427.g2b_alt1();
				int var4 = field427.g2();
				Component var5 = Component.method204(var4);
				var5.field623 = var3;
				var5.field653 = var2;
				field152 = -1;
				return true;
			}

			if (field152 == 186) {
				int var6 = field427.g2_alt2();
				int var7 = field427.g2_alt3();
				int var8 = field427.g2_alt2();
				int var9 = field427.g2_alt1();
				Component.method204(var7).field647 = var6;
				Component.method204(var7).field648 = var9;
				Component.method204(var7).field646 = var8;
				field152 = -1;
				return true;
			}

			if (field152 == 216) {
				int var10 = field427.g2_alt3();
				int var11 = field427.g2_alt3();
				Component.method204(var11).field672 = 1;
				Component.method204(var11).field673 = var10;
				field152 = -1;
				return true;
			}

			if (field152 == 26) {
				int var12 = field427.g2();
				int var13 = field427.g1();
				int var14 = field427.g2();
				if (var14 == 0xFFFF) {
					if (field293 < 50) {
						field338[field293] = (short) var12;
						field549[field293] = var13;
						field491[field293] = 0;
						field293++;
					}
				} else if (field531 && !field199 && field293 < 50) {
					field338[field293] = var12;
					field549[field293] = var13;
					field491[field293] = Wave.field1268[var12] + var14;
					field293++;
				}

				field152 = -1;
				return true;
			}

			if (field152 == 182) {
				int var15 = field427.g2_alt2();
				byte var16 = field427.g1b_alt3();
				field269[var15] = var16;

				if (field296[var15] != var16) {
					field296[var15] = var16;
					method128(var15);
					field420 = true;

					if (field429 != -1) {
						field473 = true;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 13) {
				for (int var17 = 0; var17 < field235.length; var17++) {
					if (field235[var17] != null) {
						field235[var17].field1020 = -1;
					}
				}

				for (int var18 = 0; var18 < field379.length; var18++) {
					if (field379[var18] != null) {
						field379[var18].field1020 = -1;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 156) {
				field306 = field427.g1();
				field152 = -1;
				return true;
			}

			if (field152 == 162) {
				int var19 = field427.g2_alt2();
				int var20 = field427.g2_alt1();
				Component.method204(var20).field672 = 2;
				Component.method204(var20).field673 = var19;
				field152 = -1;
				return true;
			}

			if (field152 == 109) {
				int var21 = field427.g2();
				method135(var21);

				if (field337 != -1) {
					method64(field337);
					field337 = -1;
					field420 = true;
					field219 = true;
				}

				if (field308 != -1) {
					method64(field308);
					field308 = -1;
					field303 = true;
				}

				if (field226 != -1) {
					method64(field226);
					field226 = -1;
				}

				if (field410 != -1) {
					method64(field410);
					field410 = -1;
				}

				if (field253 != var21) {
					method64(field253);
					field253 = var21;
				}

				field472 = false;
				field473 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 220) {
				int var22 = field427.g2_alt3();
				if (var22 == 0xFFFF) {
					var22 = -1;
				}

				if (field555 != var22 && field498 && !field199 && field375 == 0) {
					field502 = var22;
					field503 = true;
					field521.method586(2, field502);
				}

				field555 = var22;
				field152 = -1;
				return true;
			}

			if (field152 == 249) {
				int var23 = field427.g2_alt1();
				int var24 = field427.g3_alt3();
				if (field498 && !field199) {
					field502 = var23;
					field503 = false;
					field521.method586(2, field502);
					field375 = var24;
				}

				field152 = -1;
				return true;
			}

			if (field152 == 158) {
				int var25 = field427.g2b_alt1();
				if (field429 != var25) {
					method64(field429);
					field429 = var25;
				}

				field473 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 218) {
				int var26 = field427.g2();
				int var27 = field427.g2_alt2();
				int var28 = var27 >> 10 & 0x1F;
				int var29 = var27 >> 5 & 0x1F;
				int var30 = var27 & 0x1F;
				Component.method204(var26).field635 = (var30 << 3) + (var28 << 19) + (var29 << 11);
				field152 = -1;
				return true;
			}

			if (field152 == 157) {
				int var31 = field427.g1_alt2();
				String var32 = field427.gjstr();
				int var33 = field427.g1();
				if (var31 >= 1 && var31 <= 5) {
					if (var32.equalsIgnoreCase("null")) {
						var32 = null;
					}

					field321[var31 - 1] = var32;
					field322[var31 - 1] = var33 == 0;
				}

				field152 = -1;
				return true;
			}

			if (field152 == 6) {
				field148 = false;
				field476 = 2;
				field218 = "";
				field473 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 201) {
				field270 = field427.g1();
				field169 = field427.g1();
				field462 = field427.g1();
				field448 = true;
				field473 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 199) {
				field435 = field427.g1();
				if (field435 == 1) {
					field461 = field427.g2();
				}

				if (field435 >= 2 && field435 <= 6) {
					if (field435 == 2) {
						field129 = 64;
						field130 = 64;
					}

					if (field435 == 3) {
						field129 = 0;
						field130 = 64;
					}

					if (field435 == 4) {
						field129 = 128;
						field130 = 64;
					}

					if (field435 == 5) {
						field129 = 64;
						field130 = 0;
					}

					if (field435 == 6) {
						field129 = 64;
						field130 = 128;
					}

					field435 = 2;
					field126 = field427.g2();
					field127 = field427.g2();
					field128 = field427.g1();
				}

				if (field435 == 10) {
					field395 = field427.g2();
				}

				field152 = -1;
				return true;
			}

			if (field152 == 167) {
				field447 = true;
				field258 = field427.g1();
				field259 = field427.g1();
				field260 = field427.g2();
				field261 = field427.g1();
				field262 = field427.g1();
				if (field262 >= 100) {
					int var34 = field258 * 128 + 64;
					int var35 = field259 * 128 + 64;
					int var36 = method133(var35, var34, field339) - field260;
					int var37 = var34 - field452;
					int var38 = var36 - field453;
					int var39 = var35 - field454;
					int var40 = (int) Math.sqrt(var37 * var37 + var39 * var39);
					field455 = (int) (Math.atan2(var38, var40) * 325.949D) & 0x7FF;
					field456 = (int) (Math.atan2(var37, var39) * -325.949D) & 0x7FF;

					if (field455 < 128) {
						field455 = 128;
					}

					if (field455 > 383) {
						field455 = 383;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 5) {
				method148();
				field152 = -1;
				return false;
			}

			if (field152 == 115) {
				int var41 = field427.g4_alt3();
				int var42 = field427.g2_alt1();
				field269[var42] = var41;

				if (field296[var42] != var41) {
					field296[var42] = var41;
					method128(var42);
					field420 = true;

					if (field429 != -1) {
						field473 = true;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 29) {
				if (field337 != -1) {
					method64(field337);
					field337 = -1;
					field420 = true;
					field219 = true;
				}

				if (field253 != -1) {
					method64(field253);
					field253 = -1;
					field473 = true;
				}

				if (field308 != -1) {
					method64(field308);
					field308 = -1;
					field303 = true;
				}

				if (field226 != -1) {
					method64(field226);
					field226 = -1;
				}

				if (field410 != -1) {
					method64(field410);
					field410 = -1;
				}

				if (field476 != 0) {
					field476 = 0;
					field473 = true;
				}

				field472 = false;
				field152 = -1;
				return true;
			}

			if (field152 == 76) {
				field332 = field427.g2_alt1();
				field427.g2_alt3();
				field427.g2();
				field427.g2();
				field411 = field427.g2_alt1();
				field505 = field427.g2_alt2();
				field451 = field427.g2_alt2();
				field257 = field427.g2();
				field474 = field427.g4_alt1();
				field292 = field427.g2_alt3();
				field427.g1_alt1();
				signlink.dnslookup(JString.method347(field474));
				field152 = -1;
				return true;
			}

			if (field152 == 63) {
				String var43 = field427.gjstr();
				if (var43.endsWith(":tradereq:")) {
					String var44 = var43.substring(0, var43.indexOf(":"));
					long var45 = JString.method344(var44);
					boolean var47 = false;
					for (int var48 = 0; var48 < field137; var48++) {
						if (field324[var48] == var45) {
							var47 = true;
							break;
						}
					}

					if (!var47 && field478 == 0) {
						method67(var44, "wishes to trade with you.", 4);
					}
				} else if (var43.endsWith(":duelreq:")) {
					String var49 = var43.substring(0, var43.indexOf(":"));
					long var50 = JString.method344(var49);
					boolean var52 = false;
					for (int var53 = 0; var53 < field137; var53++) {
						if (field324[var53] == var50) {
							var52 = true;
							break;
						}
					}

					if (!var52 && field478 == 0) {
						method67(var49, "wishes to duel with you.", 8);
					}
				} else if (var43.endsWith(":chalreq:")) {
					String var54 = var43.substring(0, var43.indexOf(":"));
					long var55 = JString.method344(var54);
					boolean var57 = false;
					for (int var58 = 0; var58 < field137; var58++) {
						if (field324[var58] == var55) {
							var57 = true;
							break;
						}
					}

					if (!var57 && field478 == 0) {
						String var59 = var43.substring(var43.indexOf(":") + 1, var43.length() - 9);
						method67(var54, var59, 8);
					}
				} else {
					method67("", var43, 0);
				}

				field152 = -1;
				return true;
			}

			if (field152 == 50) {
				int var60 = field427.g2b();
				if (var60 >= 0) {
					method135(var60);
				}

				if (field510 != var60) {
					method64(field510);
					field510 = var60;
				}

				field152 = -1;
				return true;
			}

			if (field152 == 82) {
				boolean var61 = field427.g1() == 1;
				int var62 = field427.g2();
				Component.method204(var62).field614 = var61;
				field152 = -1;
				return true;
			}

			if (field152 == 174) {
				if (field515 == 12) {
					field420 = true;
				}

				field289 = field427.g2b();
				field152 = -1;
				return true;
			}

			if (field152 == 233) {
				field547 = field427.g1();
				field152 = -1;
				return true;
			}

			if (field152 == 61) {
				field367 = 0;
				field152 = -1;
				return true;
			}

			if (field152 == 128) {
				int var63 = field427.g2_alt2();
				int var64 = field427.g2_alt3();

				if (field253 != -1) {
					method64(field253);
					field253 = -1;
					field473 = true;
				}

				if (field308 != -1) {
					method64(field308);
					field308 = -1;
					field303 = true;
				}

				if (field226 != -1) {
					method64(field226);
					field226 = -1;
				}

				if (field410 != var63) {
					method64(field410);
					field410 = var63;
				}

				if (field337 != var64) {
					method64(field337);
					field337 = var64;
				}

				if (field476 != 0) {
					field476 = 0;
					field473 = true;
				}

				field420 = true;
				field219 = true;
				field472 = false;
				field152 = -1;
				return true;
			}

			if (field152 == 67) {
				int var65 = field427.g1();
				int var66 = field427.g1();
				int var67 = field427.g1();
				int var68 = field427.g1();
				field200[var65] = true;
				field353[var65] = var66;
				field134[var65] = var67;
				field256[var65] = var68;
				field389[var65] = 0;
				field152 = -1;
				return true;
			}

			if (field152 == 134) {
				field420 = true;
				int var69 = field427.g2();
				Component var70 = Component.method204(var69);
				while (field427.pos < field151) {
					int var71 = field427.gsmarts();
					int var72 = field427.g2();
					int var73 = field427.g1();
					if (var73 == 255) {
						var73 = field427.g4();
					}

					if (var71 >= 0 && var71 < var70.field663.length) {
						var70.field663[var71] = var72;
						var70.field619[var71] = var73;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 78) {
				long var74 = field427.g8();
				int var76 = field427.g1();
				String var77 = JString.method348(JString.method345(var74));
				for (int var78 = 0; var78 < field141; var78++) {
					if (field377[var78] == var74) {
						if (field499[var78] != var76) {
							field499[var78] = var76;
							field420 = true;

							if (var76 > 0) {
								method67("", var77 + " has logged in.", 5);
							}

							if (var76 == 0) {
								method67("", var77 + " has logged out.", 5);
							}
						}

						var77 = null;
						break;
					}
				}

				if (var77 != null && field141 < 200) {
					field377[field141] = var74;
					field131[field141] = var77;
					field499[field141] = var76;
					field141++;
					field420 = true;
				}

				boolean var79 = false;
				while (!var79) {
					var79 = true;
					for (int var80 = 0; var80 < field141 - 1; var80++) {
						if (field499[var80] != field196 && field499[var80 + 1] == field196 || field499[var80] == 0 && field499[var80 + 1] != 0) {
							int var81 = field499[var80];
							field499[var80] = field499[var80 + 1];
							field499[var80 + 1] = var81;
							String var82 = field131[var80];
							field131[var80] = field131[var80 + 1];
							field131[var80 + 1] = var82;
							long var83 = field377[var80];
							field377[var80] = field377[var80 + 1];
							field377[var80 + 1] = var83;
							field420 = true;
							var79 = false;
						}
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 58) {
				field148 = false;
				field476 = 1;
				field218 = "";
				field473 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 252) {
				field515 = field427.g1_alt2();
				field420 = true;
				field219 = true;
				field152 = -1;
				return true;
			}

			if (field152 == 40) {
				field255 = field427.g1_alt3();
				field254 = field427.g1_alt2();
				for (int var85 = field254; var85 < field254 + 8; var85++) {
					for (int var86 = field255; var86 < field255 + 8; var86++) {
						if (field551[field339][var85][var86] != null) {
							field551[field339][var85][var86] = null;
							method46(var85, var86);
						}
					}
				}

				for (LocChange var87 = (LocChange) field493.method6(); var87 != null; var87 = (LocChange) field493.method8()) {
					if (var87.field1146 >= field254 && var87.field1146 < field254 + 8 && var87.field1147 >= field255 && var87.field1147 < field255 + 8 && field339 == var87.field1144) {
						var87.field1143 = 0;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 255) {
				int var88 = field427.g2_alt3();
				Component.method204(var88).field672 = 3;

				if (field408.field1439 == null) {
					Component.method204(var88).field673 = (field408.field1434[11] << 5) + (field408.field1434[8] << 10) + (field408.field1434[0] << 15) + (field408.field1442[0] << 25) + (field408.field1442[4] << 20) + field408.field1434[1];
				} else {
					Component.method204(var88).field673 = (int) (field408.field1439.field1235 + 0x12345678L);
				}

				field152 = -1;
				return true;
			}

			if (field152 == 135) {
				long var89 = field427.g8();
				int var91 = field427.g4();
				int var92 = field427.g1();
				boolean var93 = false;
				for (int var94 = 0; var94 < 100; var94++) {
					if (field490[var94] == var91) {
						var93 = true;
						break;
					}
				}

				if (var92 <= 1) {
					for (int var95 = 0; var95 < field137; var95++) {
						if (field324[var95] == var89) {
							var93 = true;
							break;
						}
					}
				}

				if (!var93 && field478 == 0) {
					try {
						field490[field396] = var91;
						field396 = (field396 + 1) % 100;
						String var96 = WordPack.method453(field427, field151 - 13);
						if (var92 != 3) {
							var96 = WordFilter.method504(var96);
						}

						if (var92 == 2 || var92 == 3) {
							method67("@cr2@" + JString.method348(JString.method345(var89)), var96, 7);
						} else if (var92 == 1) {
							method67("@cr1@" + JString.method348(JString.method345(var89)), var96, 7);
						} else {
							method67(JString.method348(JString.method345(var89)), var96, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 183) {
				field254 = field427.g1();
				field255 = field427.g1_alt1();

				while (field427.pos < field151) {
					int var98 = field427.g1();
					method158(field427, var98);
				}

				field152 = -1;
				return true;
			}

			if (field152 == 159) {
				int var99 = field427.g2_alt3();
				method135(var99);

				if (field337 != -1) {
					method64(field337);
					field337 = -1;
					field420 = true;
					field219 = true;
				}

				if (field253 != -1) {
					method64(field253);
					field253 = -1;
					field473 = true;
				}

				if (field308 != -1) {
					method64(field308);
					field308 = -1;
					field303 = true;
				}

				if (field226 != -1) {
					method64(field226);
					field226 = -1;
				}

				if (field410 != var99) {
					method64(field410);
					field410 = var99;
				}

				if (field476 != 0) {
					field476 = 0;
					field473 = true;
				}

				field472 = false;
				field152 = -1;
				return true;
			}

			if (field152 == 246) {
				int var100 = field427.g2_alt3();
				method135(var100);

				if (field253 != -1) {
					method64(field253);
					field253 = -1;
					field473 = true;
				}

				if (field308 != -1) {
					method64(field308);
					field308 = -1;
					field303 = true;
				}

				if (field226 != -1) {
					method64(field226);
					field226 = -1;
				}

				if (field410 != -1) {
					method64(field410);
					field410 = -1;
				}

				if (field337 != var100) {
					method64(field337);
					field337 = var100;
				}

				if (field476 != 0) {
					field476 = 0;
					field473 = true;
				}

				field420 = true;
				field219 = true;
				field472 = false;
				field152 = -1;
				return true;
			}

			if (field152 == 49) {
				field420 = true;
				int var101 = field427.g1_alt2();
				int var102 = field427.g1();
				int var103 = field427.g4();
				field125[var101] = var103;
				field288[var101] = var102;
				field309[var101] = 1;
				for (int var104 = 0; var104 < 98; var104++) {
					if (var103 >= field221[var104]) {
						field309[var101] = var104 + 2;
					}
				}

				field152 = -1;
				return true;
			}

			if (field152 == 206) {
				field420 = true;
				int var105 = field427.g2();
				Component var106 = Component.method204(var105);
				int var107 = field427.g2();
				for (int var108 = 0; var108 < var107; var108++) {
					var106.field663[var108] = field427.g2_alt3();
					int var109 = field427.g1_alt2();
					if (var109 == 255) {
						var109 = field427.g4_alt1();
					}

					var106.field619[var108] = var109;
				}

				for (int var110 = var107; var110 < var106.field663.length; var110++) {
					var106.field663[var110] = 0;
					var106.field619[var110] = 0;
				}

				field152 = -1;
				return true;
			}

			if (field152 != 222 && field152 != 53) {
				if (field152 == 190) {
					field310 = field427.g2_alt1() * 30;
					field152 = -1;
					return true;
				}

				if (field152 != 41 && field152 != 121 && field152 != 203 && field152 != 106 && field152 != 59 && field152 != 181 && field152 != 208 && field152 != 107 && field152 != 142 && field152 != 88 && field152 != 152) {
					if (field152 == 125) {
						if (field515 == 12) {
							field420 = true;
						}

						field552 = field427.g1();
						field152 = -1;
						return true;
					}

					if (field152 == 21) {
						int var161 = field427.g2();
						int var162 = field427.g2_alt1();
						int var163 = field427.g2_alt3();
						if (var162 == 0xFFFF) {
							Component.method204(var163).field672 = 0;
							field152 = -1;
							return true;
						}

						ObjType var164 = ObjType.method221(var162);
						Component.method204(var163).field672 = 4;
						Component.method204(var163).field673 = var162;
						Component.method204(var163).field647 = var164.field738;
						Component.method204(var163).field648 = var164.field735;
						Component.method204(var163).field646 = var164.field748 * 100 / var161;
						field152 = -1;
						return true;
					}

					if (field152 == 3) {
						field447 = true;
						field156 = field427.g1();
						field157 = field427.g1();
						field158 = field427.g2();
						field159 = field427.g1();
						field160 = field427.g1();
						if (field160 >= 100) {
							field452 = field156 * 128 + 64;
							field454 = field157 * 128 + 64;
							field453 = method133(field454, field452, field339) - field158;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 2) {
						int var165 = field427.g2_alt3();
						int var166 = field427.g2b_alt2();
						Component var167 = Component.method204(var165);
						if (var167.field675 != var166 || var166 == -1) {
							var167.field675 = var166;
							var167.field630 = 0;
							var167.field622 = 0;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 71) {
						method68(field427, field151);
						field152 = -1;
						return true;
					}

					if (field152 == 226) {
						field137 = field151 / 8;
						for (int var168 = 0; var168 < field137; var168++) {
							field324[var168] = field427.g8();
						}

						field152 = -1;
						return true;
					}

					if (field152 == 10) {
						int var169 = field427.g1_alt3();
						int var170 = field427.g2_alt2();
						if (var170 == 0xFFFF) {
							var170 = -1;
						}

						if (field330[var169] != var170) {
							method64(field330[var169]);
							field330[var169] = var170;
						}

						field420 = true;
						field219 = true;
						field152 = -1;
						return true;
					}

					if (field152 == 219) {
						int var171 = field427.g2_alt1();
						Component var172 = Component.method204(var171);
						for (int var173 = 0; var173 < var172.field663.length; var173++) {
							var172.field663[var173] = -1;
							var172.field663[var173] = 0;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 238) {
						field449 = field427.g1();
						if (field515 == field449) {
							if (field449 == 3) {
								field515 = 1;
							} else {
								field515 = 3;
							}

							field420 = true;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 148) {
						field447 = false;

						for (int var174 = 0; var174 < 5; var174++) {
							field200[var174] = false;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 126) {
						field320 = field427.g1();
						field227 = field427.g2_alt1();
						field152 = -1;
						return true;
					}

					if (field152 == 75) {
						field254 = field427.g1_alt2();
						field255 = field427.g1_alt1();
						field152 = -1;
						return true;
					}

					if (field152 == 253) {
						int var175 = field427.g2_alt1();
						int var176 = field427.g2_alt2();
						method135(var176);

						if (var175 != -1) {
							method135(var175);
						}

						if (field410 != -1) {
							method64(field410);
							field410 = -1;
						}

						if (field337 != -1) {
							method64(field337);
							field337 = -1;
						}

						if (field253 != -1) {
							method64(field253);
							field253 = -1;
						}

						if (field308 != var176) {
							method64(field308);
							field308 = var176;
						}

						if (field226 != var176) {
							method64(field226);
							field226 = var175;
						}

						field476 = 0;
						field472 = false;
						field152 = -1;
						return true;
					}

					if (field152 == 251) {
						field142 = field427.g1();
						field420 = true;
						field152 = -1;
						return true;
					}

					if (field152 == 18) {
						int var177 = field427.g2();
						int var178 = field427.g2_alt2();
						int var179 = field427.g2_alt1();
						Component.method204(var178).field613 = (var177 << 16) + var179;
						field152 = -1;
						return true;
					}

					if (field152 == 90) {
						method119(field151, field427);
						field445 = false;
						field152 = -1;
						return true;
					}

					if (field152 == 113) {
						for (int var180 = 0; var180 < field296.length; var180++) {
							if (field296[var180] != field269[var180]) {
								field296[var180] = field269[var180];
								method128(var180);
								field420 = true;
							}
						}

						field152 = -1;
						return true;
					}

					if (field152 == 232) {
						int var181 = field427.g2_alt3();
						String var182 = field427.gjstr();
						Component.method204(var181).field625 = var182;

						if (field330[field515] == Component.method204(var181).field643) {
							field420 = true;
						}

						field152 = -1;
						return true;
					}

					if (field152 == 200) {
						int var183 = field427.g2();
						int var184 = field427.g2_alt3();
						Component var185 = Component.method204(var183);
						if (var185 != null && var185.field631 == 0) {
							if (var184 < 0) {
								var184 = 0;
							}

							if (var184 > var185.field674 - var185.field633) {
								var184 = var185.field674 - var185.field633;
							}

							var185.field626 = var184;
						}

						field152 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field152 + "," + field151 + " - " + field181 + "," + field182);
					method148();
					return true;
				}

				method158(field427, field152);
				field152 = -1;
				return true;
			}

			int var111 = field171;
			int var112 = field172;
			if (field152 == 222) {
				var112 = field427.g2();
				var111 = field427.g2_alt3();
				field404 = false;
			}

			if (field152 == 53) {
				var111 = field427.g2_alt2();
				field427.accessBits();

				for (int var113 = 0; var113 < 4; var113++) {
					for (int var114 = 0; var114 < 13; var114++) {
						for (int var115 = 0; var115 < 13; var115++) {
							int var116 = field427.gBit(1);
							if (var116 == 1) {
								field161[var113][var114][var115] = field427.gBit(26);
							} else {
								field161[var113][var114][var115] = -1;
							}
						}
					}
				}

				field427.accessBytes();
				var112 = field427.g2_alt2();
				field404 = true;
			}

			if (field171 == var111 && field172 == var112 && field323 == 2) {
				field152 = -1;
				return true;
			}

			field171 = var111;
			field172 = var112;
			field297 = (field171 - 6) * 8;
			field298 = (field172 - 6) * 8;
			field319 = false;
			if ((field171 / 8 == 48 || field171 / 8 == 49) && field172 / 8 == 48) {
				field319 = true;
			}

			if (field171 / 8 == 48 && field172 / 8 == 148) {
				field319 = true;
			}

			field323 = 1;
			field464 = System.currentTimeMillis();
			method149(null, "Loading - please wait.");

			if (field152 == 222) {
				int var117 = 0;
				for (int var118 = (field171 - 6) / 8; var118 <= (field171 + 6) / 8; var118++) {
					for (int var119 = (field172 - 6) / 8; var119 <= (field172 + 6) / 8; var119++) {
						var117++;
					}
				}

				field121 = new byte[var117][];
				field466 = new byte[var117][];
				field138 = new int[var117];
				field139 = new int[var117];
				field140 = new int[var117];
				int var120 = 0;
				for (int var121 = (field171 - 6) / 8; var121 <= (field171 + 6) / 8; var121++) {
					for (int var122 = (field172 - 6) / 8; var122 <= (field172 + 6) / 8; var122++) {
						field138[var120] = (var121 << 8) + var122;

						if (field319 && (var122 == 49 || var122 == 149 || var122 == 147 || var121 == 50 || var121 == 49 && var122 == 47)) {
							field139[var120] = -1;
							field140[var120] = -1;
							var120++;
						} else {
							int var123 = field139[var120] = field521.method601(var121, var122, 0);
							if (var123 != -1) {
								field521.method586(3, var123);
							}

							int var124 = field140[var120] = field521.method601(var121, var122, 1);
							if (var124 != -1) {
								field521.method586(3, var124);
							}

							var120++;
						}
					}
				}
			}

			if (field152 == 53) {
				int var125 = 0;
				int[] var126 = new int[676];
				for (int var127 = 0; var127 < 4; var127++) {
					for (int var128 = 0; var128 < 13; var128++) {
						for (int var129 = 0; var129 < 13; var129++) {
							int var130 = field161[var127][var128][var129];
							if (var130 != -1) {
								int var131 = var130 >> 14 & 0x3FF;
								int var132 = var130 >> 3 & 0x7FF;
								int var133 = (var131 / 8 << 8) + var132 / 8;
								for (int var134 = 0; var134 < var125; var134++) {
									if (var126[var134] == var133) {
										var133 = -1;
										break;
									}
								}

								if (var133 != -1) {
									var126[var125++] = var133;
								}
							}
						}
					}
				}

				field121 = new byte[var125][];
				field466 = new byte[var125][];
				field138 = new int[var125];
				field139 = new int[var125];
				field140 = new int[var125];
				for (int var135 = 0; var135 < var125; var135++) {
					int var136 = field138[var135] = var126[var135];
					int var137 = var136 >> 8 & 0xFF;
					int var138 = var136 & 0xFF;
					int var139 = field139[var135] = field521.method601(var137, var138, 0);
					if (var139 != -1) {
						field521.method586(3, var139);
					}

					int var140 = field140[var135] = field521.method601(var137, var138, 1);
					if (var140 != -1) {
						field521.method586(3, var140);
					}
				}
			}

			int var141 = field297 - field299;
			int var142 = field298 - field300;
			field299 = field297;
			field300 = field298;

			for (int var143 = 0; var143 < 16384; var143++) {
				ClientNpc var144 = field379[var143];
				if (var144 != null) {
					for (int var145 = 0; var145 < 10; var145++) {
						var144.field982[var145] -= var141;
						var144.field983[var145] -= var142;
					}

					var144.field1006 -= var141 * 128;
					var144.field1007 -= var142 * 128;
				}
			}

			for (int var146 = 0; var146 < field233; var146++) {
				ClientPlayer var147 = field235[var146];
				if (var147 != null) {
					for (int var148 = 0; var148 < 10; var148++) {
						var147.field982[var148] -= var141;
						var147.field983[var148] -= var142;
					}

					var147.field1006 -= var141 * 128;
					var147.field1007 -= var142 * 128;
				}
			}

			field445 = true;
			byte var149 = 0;
			byte var150 = 104;
			byte var151 = 1;
			if (var141 < 0) {
				var149 = 103;
				var150 = -1;
				var151 = -1;
			}

			byte var152 = 0;
			byte var153 = 104;
			byte var154 = 1;
			if (var142 < 0) {
				var152 = 103;
				var153 = -1;
				var154 = -1;
			}

			for (int var155 = var149; var155 != var150; var155 += var151) {
				for (int var156 = var152; var156 != var153; var156 += var154) {
					int var157 = var141 + var155;
					int var158 = var142 + var156;
					for (int var159 = 0; var159 < 4; var159++) {
						if (var157 >= 0 && var158 >= 0 && var157 < 104 && var158 < 104) {
							field551[var159][var155][var156] = field551[var159][var157][var158];
						} else {
							field551[var159][var155][var156] = null;
						}
					}
				}
			}

			for (LocChange var160 = (LocChange) field493.method6(); var160 != null; var160 = (LocChange) field493.method8()) {
				var160.field1146 -= var141;
				var160.field1147 -= var142;
				if (var160.field1146 < 0 || var160.field1147 < 0 || var160.field1146 >= 104 || var160.field1147 >= 104) {
					var160.method604();
				}
			}

			if (field367 != 0) {
				field367 -= var141;
				field368 -= var142;
			}

			field447 = false;
			field152 = -1;
			return true;
		} catch (IOException var190) {
			method79();
		} catch (Exception var191) {
			String var187 = "T2 - " + field152 + "," + field181 + "," + field182 + " - " + field151 + "," + (field408.field982[0] + field297) + "," + (field408.field983[0] + field298) + " - ";
			for (int var188 = 0; var188 < field151 && var188 < 50; var188++) {
				var187 = var187 + field427.data[var188] + ",";
			}

			signlink.reporterror(var187);
			method148();
		}

		return true;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method54() {
		if (field422 >= 2 || field390 != 0 || field412 != 0) {
			String var1;
			if (field390 == 1 && field422 < 2) {
				var1 = "Use " + field394 + " with...";
			} else if (field412 == 1 && field422 < 2) {
				var1 = field415 + "...";
			} else {
				var1 = field423[field422 - 1];
			}

			if (field422 > 2) {
				var1 = var1 + "@whi@ / " + (field422 - 2) + " more options";
			}

			field314.method253(true, field553 / 1000, 4, 0xFFFFFF, 15, var1);
		}
	}

	@ObfuscatedName("client.a(ZZIIIIIIIIII)Z")
	public final boolean method55(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field167[var14][var15] = 0;
				field428[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg2;
		field167[arg10][arg2] = 99;
		field428[arg10][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field370[var18] = arg10;
		int var39 = var18 + 1;
		field371[var18] = arg2;
		boolean var20 = false;
		int var21 = field370.length;
		int[][] var22 = field492[field339].field1355;
		while (var39 != var19) {
			var16 = field370[var19];
			var17 = field371[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && field492[field339].method541(arg7, arg1, arg6 - 1, var16, var17, arg9)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && field492[field339].method542(var17, arg7, var16, arg9, arg6 - 1, arg1)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg4 != 0 && field492[field339].method543(arg3, var16, arg7, arg8, arg4, arg1, var17)) {
				var20 = true;
				break;
			}

			int var23 = field428[var16][var17] + 1;
			if (var16 > 0 && field167[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field370[var39] = var16 - 1;
				field371[var39] = var17;
				var39 = (var39 + 1) % var21;
				field167[var16 - 1][var17] = 2;
				field428[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field167[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field370[var39] = var16 + 1;
				field371[var39] = var17;
				var39 = (var39 + 1) % var21;
				field167[var16 + 1][var17] = 8;
				field428[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field167[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field370[var39] = var16;
				field371[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field167[var16][var17 - 1] = 1;
				field428[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field167[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field370[var39] = var16;
				field371[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field167[var16][var17 + 1] = 4;
				field428[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field167[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field370[var39] = var16 - 1;
				field371[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field167[var16 - 1][var17 - 1] = 3;
				field428[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field167[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field370[var39] = var16 + 1;
				field371[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field167[var16 + 1][var17 - 1] = 9;
				field428[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field167[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field370[var39] = var16 - 1;
				field371[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field167[var16 - 1][var17 + 1] = 6;
				field428[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field167[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field370[var39] = var16 + 1;
				field371[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field167[var16 + 1][var17 + 1] = 12;
				field428[var16 + 1][var17 + 1] = var23;
			}
		}

		field373 = 0;
		if (!var20) {
			if (!arg0) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg7 - var26; var27 <= arg7 + var26; var27++) {
				for (int var28 = arg1 - var26; var28 <= arg1 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field428[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg7) {
							var29 = arg7 - var27;
						} else if (var27 > arg3 + arg7 - 1) {
							var29 = var27 + 1 - arg3 - arg7;
						}

						int var30 = 0;
						if (var28 < arg1) {
							var30 = arg1 - var28;
						} else if (var28 > arg1 + arg4 - 1) {
							var30 = var28 + 1 - arg1 - arg4;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field428[var27][var28] < var25) {
							var24 = var31;
							var25 = field428[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg10 == var16 && arg2 == var17) {
				return false;
			}

			field373 = 1;
		}

		byte var32 = 0;
		field370[var32] = var16;
		int var40 = var32 + 1;
		field371[var32] = var17;
		int var33;
		int var34 = var33 = field167[var16][var17];
		while (arg10 != var16 || arg2 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field370[var40] = var16;
				field371[var40++] = var17;
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

			var34 = field167[var16][var17];
		}

		if (var40 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field370[var40];
		int var37 = field371[var40];

		if (arg5 == 0) {
			field229.p1isaac(28);
			field229.p1(var35 + var35 + 3);
		}

		if (arg5 == 1) {
			field229.p1isaac(213);
			field229.p1(var35 + var35 + 3 + 14);
		}

		if (arg5 == 2) {
			field229.p1isaac(247);
			field229.p1(var35 + var35 + 3);
		}

		field229.p2_alt3(field297 + var36);
		field229.p1(field847[5] == 1 ? 1 : 0);
		field229.p2_alt3(field298 + var37);
		field367 = field370[0];
		field368 = field371[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field229.p1(field370[var40] - var36);
			field229.p1_alt3(field371[var40] - var37);
		}

		return true;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method56() {
		if (field323 == 2) {
			for (LocChange var1 = (LocChange) field493.method6(); var1 != null; var1 = (LocChange) field493.method8()) {
				if (var1.field1143 > 0) {
					var1.field1143--;
				}

				if (var1.field1143 != 0) {
					if (var1.field1148 > 0) {
						var1.field1148--;
					}

					if (var1.field1148 == 0 && var1.field1146 >= 1 && var1.field1147 >= 1 && var1.field1146 <= 102 && var1.field1147 <= 102 && (var1.field1137 < 0 || World.method18(var1.field1139, var1.field1137))) {
						method65(var1.field1138, var1.field1146, var1.field1137, var1.field1147, var1.field1144, var1.field1139, var1.field1145);
						var1.field1148 = -1;

						if (var1.field1140 == var1.field1137 && var1.field1140 == -1) {
							var1.method604();
						} else if (var1.field1140 == var1.field1137 && var1.field1141 == var1.field1138 && var1.field1142 == var1.field1139) {
							var1.method604();
						}
					}
				} else if (var1.field1140 < 0 || World.method18(var1.field1142, var1.field1140)) {
					method65(var1.field1141, var1.field1146, var1.field1140, var1.field1147, var1.field1144, var1.field1142, var1.field1145);
					var1.method604();
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)Ljava/lang/String;")
	public final String method57() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field832 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIILZGNGQRPJ;I)V")
	public final void method58(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (field408 != arg3 && field422 < 400) {
			String var5;
			if (arg3.field1441 == 0) {
				var5 = arg3.field1433 + method115(arg3.field1435, field408.field1435) + " (level-" + arg3.field1435 + ")";
			} else {
				var5 = arg3.field1433 + " (skill-" + arg3.field1441 + ")";
			}

			if (field390 == 1) {
				field423[field422] = "Use " + field394 + " with @whi@" + var5;
				field246[field422] = 596;
				field247[field422] = arg0;
				field244[field422] = arg2;
				field245[field422] = arg1;
				field422++;
			} else if (field412 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field321[var6] != null) {
						field423[field422] = field321[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field321[var6].equalsIgnoreCase("attack")) {
							if (arg3.field1435 > field408.field1435) {
								var7 = 2000;
							}

							if (field408.field1447 != 0 && arg3.field1447 != 0) {
								if (field408.field1447 == arg3.field1447) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field322[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field246[field422] = var7 + 200;
						}

						if (var6 == 1) {
							field246[field422] = var7 + 493;
						}

						if (var6 == 2) {
							field246[field422] = var7 + 408;
						}

						if (var6 == 3) {
							field246[field422] = var7 + 677;
						}

						if (var6 == 4) {
							field246[field422] = var7 + 876;
						}

						field247[field422] = arg0;
						field244[field422] = arg2;
						field245[field422] = arg1;
						field422++;
					}
				}
			} else if ((field414 & 0x8) == 8) {
				field423[field422] = field415 + " @whi@" + var5;
				field246[field422] = 918;
				field247[field422] = arg0;
				field244[field422] = arg2;
				field245[field422] = arg1;
				field422++;
			}

			for (int var8 = 0; var8 < field422; var8++) {
				if (field246[var8] == 14) {
					field423[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method59() {
		if (field843 == 1) {
			if (field844 >= 6 && field844 <= 106 && field845 >= 467 && field845 <= 499) {
				field270 = (field270 + 1) % 4;
				field448 = true;
				field473 = true;
				field229.p1isaac(176);
				field229.p1(field270);
				field229.p1(field169);
				field229.p1(field462);
			}

			if (field844 >= 135 && field844 <= 235 && field845 >= 467 && field845 <= 499) {
				field169 = (field169 + 1) % 3;
				field448 = true;
				field473 = true;
				field229.p1isaac(176);
				field229.p1(field270);
				field229.p1(field169);
				field229.p1(field462);
			}

			if (field844 >= 273 && field844 <= 373 && field845 >= 467 && field845 <= 499) {
				field462 = (field462 + 1) % 3;
				field448 = true;
				field473 = true;
				field229.p1isaac(176);
				field229.p1(field270);
				field229.p1(field169);
				field229.p1(field462);
			}

			if (field844 >= 412 && field844 <= 512 && field845 >= 467 && field845 <= 499) {
				if (field410 == -1) {
					method34();
					field122 = "";
					field346 = false;
					field465 = field410 = Component.field641;
				} else {
					method67("", "Please close the interface you have open before using 'report abuse'", 0);
				}
			}

			field403++;
			if (field403 > 161) {
				field403 = 0;
				field229.p1isaac(22);
				field229.p2(38304);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILMFMVIYHT;I)V")
	public final void method60(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < field238; var3++) {
			int var4 = field239[var3];
			ClientPlayer var5 = field235[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x20) != 0) {
				var6 += arg0.g1() << 8;
			}

			method84(var4, var5, var6, arg0);
		}
	}

	@ObfuscatedName("client.a(IZLMFMVIYHT;)V")
	public final void method61(int arg0, Packet arg1) {
		arg1.accessBits();
		int var3 = arg1.gBit(1);
		if (var3 != 0) {
			int var4 = arg1.gBit(2);
			if (var4 == 0) {
				field239[field238++] = field234;
			} else if (var4 == 1) {
				int var5 = arg1.gBit(3);
				field408.method352(false, var5);
				int var6 = arg1.gBit(1);
				if (var6 == 1) {
					field239[field238++] = field234;
				}
			} else if (var4 == 2) {
				int var7 = arg1.gBit(3);
				field408.method352(true, var7);
				int var8 = arg1.gBit(3);
				field408.method352(true, var8);
				int var9 = arg1.gBit(1);
				if (var9 == 1) {
					field239[field238++] = field234;
				}
			} else if (var4 == 3) {
				int var10 = arg1.gBit(1);
				field339 = arg1.gBit(2);
				int var11 = arg1.gBit(7);
				int var12 = arg1.gBit(7);
				int var13 = arg1.gBit(1);
				if (var13 == 1) {
					field239[field238++] = field234;
				}

				field408.method354(var11, var10 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;BIIIII)V")
	public final void method62(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field374) {
			field533 = 32;
		} else {
			field533 = 0;
		}

		field374 = false;
		if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg2.field626 -= field342 * 4;

			if (arg4 == 1) {
				field420 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field473 = true;
			}
		} else if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 + arg6 - 16 && arg3 < arg1 + arg6) {
			arg2.field626 += field342 * 4;

			if (arg4 == 1) {
				field420 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field473 = true;
			}
		} else if (arg5 >= arg7 - field533 && arg5 < arg7 + field533 + 16 && arg3 >= arg1 + 16 && arg3 < arg1 + arg6 - 16 && field342 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg1 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg2.field626 = (arg0 - arg6) * var10 / var11;

			if (arg4 == 1) {
				field420 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field473 = true;
			}

			field374 = true;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method63() {
		if (field390 == 0 && field412 == 0) {
			field423[field422] = "Walk here";
			field246[field422] = 14;
			field244[field422] = field837;
			field245[field422] = field838;
			field422++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < Model.field1098; var2++) {
			int var3 = Model.field1099[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field405.method304(field339, var4, var5, var3) >= 0) {
					LocType var8 = LocType.method561(var7);
					if (var8.field1420 != null) {
						var8 = var8.method562();
					}

					if (var8 == null) {
						continue;
					}

					if (field390 == 1) {
						field423[field422] = "Use " + field394 + " with @cya@" + var8.field1395;
						field246[field422] = 467;
						field247[field422] = var3;
						field244[field422] = var4;
						field245[field422] = var5;
						field422++;
					} else if (field412 != 1) {
						if (var8.field1407 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1407[var9] != null) {
									field423[field422] = var8.field1407[var9] + " @cya@" + var8.field1395;

									if (var9 == 0) {
										field246[field422] = 35;
									}

									if (var9 == 1) {
										field246[field422] = 389;
									}

									if (var9 == 2) {
										field246[field422] = 888;
									}

									if (var9 == 3) {
										field246[field422] = 892;
									}

									if (var9 == 4) {
										field246[field422] = 1280;
									}

									field247[field422] = var3;
									field244[field422] = var4;
									field245[field422] = var5;
									field422++;
								}
							}
						}

						field423[field422] = "Examine @cya@" + var8.field1395;
						field246[field422] = 1412;
						field247[field422] = var8.field1393 << 14;
						field244[field422] = var4;
						field245[field422] = var5;
						field422++;
					} else if ((field414 & 0x4) == 4) {
						field423[field422] = field415 + " @cya@" + var8.field1395;
						field246[field422] = 376;
						field247[field422] = var3;
						field244[field422] = var4;
						field245[field422] = var5;
						field422++;
					}
				}

				if (var6 == 1) {
					ClientNpc var10 = field379[var7];
					if (var10.field1183.field1248 == 1 && (var10.field1006 & 0x7F) == 0x40 && (var10.field1007 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field380; var11++) {
							ClientNpc var12 = field379[field381[var11]];
							if (var12 != null && var10 != var12 && var12.field1183.field1248 == 1 && var10.field1006 == var12.field1006 && var10.field1007 == var12.field1007) {
								method104(var12.field1183, var5, var4, field381[var11]);
							}
						}

						for (int var13 = 0; var13 < field236; var13++) {
							ClientPlayer var14 = field235[field237[var13]];
							if (var14 != null && var10.field1006 == var14.field1006 && var10.field1007 == var14.field1007) {
								method58(field237[var13], var5, var4, var14);
							}
						}
					}

					method104(var10.field1183, var5, var4, var7);
				}

				if (var6 == 0) {
					ClientPlayer var15 = field235[var7];
					if ((var15.field1006 & 0x7F) == 0x40 && (var15.field1007 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field380; var16++) {
							ClientNpc var17 = field379[field381[var16]];
							if (var17 != null && var17.field1183.field1248 == 1 && var15.field1006 == var17.field1006 && var15.field1007 == var17.field1007) {
								method104(var17.field1183, var5, var4, field381[var16]);
							}
						}

						for (int var18 = 0; var18 < field236; var18++) {
							ClientPlayer var19 = field235[field237[var18]];
							if (var19 != null && var15 != var19 && var15.field1006 == var19.field1006 && var15.field1007 == var19.field1007) {
								method58(field237[var18], var5, var4, var19);
							}
						}
					}

					method58(var7, var5, var4, var15);
				}

				if (var6 == 3) {
					LinkList var20 = field551[field339][var4][var5];
					if (var20 != null) {
						for (ClientObj var21 = (ClientObj) var20.method7(); var21 != null; var21 = (ClientObj) var20.method9()) {
							ObjType var22 = ObjType.method221(var21.field767);
							if (field390 == 1) {
								field423[field422] = "Use " + field394 + " with @lre@" + var22.field712;
								field246[field422] = 100;
								field247[field422] = var21.field767;
								field244[field422] = var4;
								field245[field422] = var5;
								field422++;
							} else if (field412 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field721 != null && var22.field721[var23] != null) {
										field423[field422] = var22.field721[var23] + " @lre@" + var22.field712;

										if (var23 == 0) {
											field246[field422] = 68;
										}

										if (var23 == 1) {
											field246[field422] = 26;
										}

										if (var23 == 2) {
											field246[field422] = 684;
										}

										if (var23 == 3) {
											field246[field422] = 930;
										}

										if (var23 == 4) {
											field246[field422] = 270;
										}

										field247[field422] = var21.field767;
										field244[field422] = var4;
										field245[field422] = var5;
										field422++;
									} else if (var23 == 2) {
										field423[field422] = "Take @lre@" + var22.field712;
										field246[field422] = 684;
										field247[field422] = var21.field767;
										field244[field422] = var4;
										field245[field422] = var5;
										field422++;
									}
								}

								field423[field422] = "Examine @lre@" + var22.field712;
								field246[field422] = 1564;
								field247[field422] = var21.field767;
								field244[field422] = var4;
								field245[field422] = var5;
								field422++;
							} else if ((field414 & 0x1) == 1) {
								field423[field422] = field415 + " @lre@" + var22.field712;
								field246[field422] = 199;
								field247[field422] = var21.field767;
								field244[field422] = var4;
								field245[field422] = var5;
								field422++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method64(int arg0) {
		Component.method209(arg0);
	}

	@ObfuscatedName("client.a(IIIIIIBI)V")
	public final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
			if (field199 && field339 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field405.method300(arg4, arg1, arg3);
			}

			if (arg6 == 1) {
				var8 = field405.method301(arg1, arg4, arg3);
			}

			if (arg6 == 2) {
				var8 = field405.method302(arg4, arg1, arg3);
			}

			if (arg6 == 3) {
				var8 = field405.method303(arg4, arg1, arg3);
			}

			if (var8 != 0) {
				int var12 = field405.method304(arg4, arg1, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field405.method291(arg3, arg4, arg1);
					LocType var16 = LocType.method561(var13);
					if (var16.field1425) {
						field492[arg4].method537(var15, arg1, arg3, var14, var16.field1424);
					}
				}

				if (arg6 == 1) {
					field405.method292(arg1, arg3, arg4);
				}

				if (arg6 == 2) {
					field405.method293(arg3, arg4, arg1);
					LocType var17 = LocType.method561(var13);
					if (var17.field1416 + arg1 > 103 || var17.field1416 + arg3 > 103 || var17.field1394 + arg1 > 103 || var17.field1394 + arg3 > 103) {
						return;
					}

					if (var17.field1425) {
						field492[arg4].method538(arg3, arg1, var15, var17.field1394, var17.field1424, var17.field1416);
					}
				}

				if (arg6 == 3) {
					field405.method294(arg1, arg3, arg4);
					LocType var18 = LocType.method561(var13);
					if (var18.field1425 && var18.field1380) {
						field492[arg4].method540(arg1, arg3);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field372[1][arg1][arg3] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				World.method13(arg2, var19, arg5, arg3, field492[arg4], arg0, arg1, arg4, field405, field173);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IBLMFMVIYHT;)V")
	public final void method66(int arg0, Packet arg1) {
		arg1.accessBits();
		int var3 = arg1.gBit(8);
		if (var3 < field380) {
			for (int var4 = var3; var4 < field380; var4++) {
				field525[field524++] = field381[var4];
			}
		}

		if (var3 > field380) {
			signlink.reporterror(field340 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field380 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field381[var5];
			ClientNpc var7 = field379[var6];
			int var8 = arg1.gBit(1);
			if (var8 == 0) {
				field381[field380++] = var6;
				var7.field981 = field553;
			} else {
				int var9 = arg1.gBit(2);
				if (var9 == 0) {
					field381[field380++] = var6;
					var7.field981 = field553;
					field239[field238++] = var6;
				} else if (var9 == 1) {
					field381[field380++] = var6;
					var7.field981 = field553;
					int var10 = arg1.gBit(3);
					var7.method352(false, var10);
					int var11 = arg1.gBit(1);
					if (var11 == 1) {
						field239[field238++] = var6;
					}
				} else if (var9 == 2) {
					field381[field380++] = var6;
					var7.field981 = field553;
					int var12 = arg1.gBit(3);
					var7.method352(true, var12);
					int var13 = arg1.gBit(3);
					var7.method352(true, var13);
					int var14 = arg1.gBit(1);
					if (var14 == 1) {
						field239[field238++] = var6;
					}
				} else if (var9 == 3) {
					field525[field524++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;I)V")
	public final void method67(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field429 != -1) {
			field311 = arg1;
			field843 = 0;
		}

		if (field253 == -1) {
			field473 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field526[var4] = field526[var4 - 1];
			field527[var4] = field527[var4 - 1];
			field528[var4] = field528[var4 - 1];
		}

		field526[0] = arg2;
		field527[0] = arg0;
		field528[0] = arg1;
	}

	@ObfuscatedName("client.a(LMFMVIYHT;ZI)V")
	public final void method68(Packet arg0, int arg1) {
		field524 = 0;
		field238 = 0;
		method66(arg1, arg0);
		method157(arg0, arg1);
		method83(arg0, arg1);

		for (int var3 = 0; var3 < field524; var3++) {
			int var4 = field525[var3];
			if (field553 != field379[var4].field981) {
				field379[var4].field1183 = null;
				field379[var4] = null;
			}
		}

		if (arg0.pos != arg1) {
			signlink.reporterror(field340 + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field380; var5++) {
			if (field379[field381[var5]] == null) {
				signlink.reporterror(field340 + " null entry in npc list - pos:" + var5 + " size:" + field380);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method69() {
		LocType.field1398.method460();
		LocType.field1383.method460();
		NpcType.field1242.method460();
		ObjType.field720.method460();
		ObjType.field729.method460();
		ClientPlayer.field1443.method460();
		SpotAnimType.field1130.method460();
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method70() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method71() {
		for (ClientProj var1 = (ClientProj) field512.method6(); var1 != null; var1 = (ClientProj) field512.method8()) {
			if (field339 != var1.field852 || field553 > var1.field862) {
				var1.method604();
			} else if (field553 >= var1.field861) {
				if (var1.field858 > 0) {
					ClientNpc var2 = field379[var1.field858 - 1];
					if (var2 != null && var2.field1006 >= 0 && var2.field1006 < 13312 && var2.field1007 >= 0 && var2.field1007 < 13312) {
						var1.method271(var2.field1006, var2.field1007, method133(var2.field1007, var2.field1006, var1.field852) - var1.field874, field553);
					}
				}

				if (var1.field858 < 0) {
					int var3 = -var1.field858 - 1;
					ClientPlayer var4;
					if (field227 == var3) {
						var4 = field408;
					} else {
						var4 = field235[var3];
					}

					if (var4 != null && var4.field1006 >= 0 && var4.field1006 < 13312 && var4.field1007 >= 0 && var4.field1007 < 13312) {
						var1.method271(var4.field1006, var4.field1007, method133(var4.field1007, var4.field1006, var1.field852) - var1.field874, field553);
					}
				}

				var1.method272(field220);
				field405.method285(-1, var1, (int) var1.field853, (int) var1.field855, false, field339, 60, (int) var1.field854, var1.field859);
			}
		}

		field409++;
		if (field409 > 51) {
			field409 = 0;
			field229.p1isaac(248);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method72() {
		field522 = new Pix8(field170, "titlebox", 0);
		field523 = new Pix8(field170, "titlebutton", 0);
		field365 = new Pix8[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field365[var1] = new Pix8(field170, "runes", var1);
		}

		field278 = new Pix32(128, 265);
		field279 = new Pix32(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field278.field599[var2] = field439.field770[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field279.field599[var3] = field440.field770[var3];
		}

		field541 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field541[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field541[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field541[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field541[var7 + 192] = 0xFFFFFF;
		}

		field542 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field542[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field542[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field542[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field542[var11 + 192] = 0xFFFFFF;
		}

		field543 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field543[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field543[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field543[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field543[var15 + 192] = 0xFFFFFF;
		}

		field540 = new int[256];
		field416 = new int[32768];
		field417 = new int[32768];
		method105(null);
		field333 = new int[32768];
		field334 = new int[32768];
		method165(10, "Connecting to fileserver");

		if (!field475) {
			field544 = true;
			field475 = true;
			method142(this, 2);
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method73(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field141; var3++) {
				if (field377[var3] == arg0) {
					field141--;
					field420 = true;

					for (int var4 = var3; var4 < field141; var4++) {
						field131[var4] = field131[var4 + 1];
						field499[var4] = field499[var4 + 1];
						field377[var4] = field377[var4 + 1];
					}

					field229.p1isaac(141);
					field229.p8(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method74() {
		if (field361 == 0) {
			int var1 = field843;
			if (field412 == 1 && field844 >= 516 && field845 >= 160 && field844 <= 765 && field845 <= 205) {
				var1 = 0;
			}

			if (field318) {
				if (var1 != 1) {
					int var2 = field837;
					int var3 = field838;
					if (field534 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field534 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field534 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field535 - 10 || var2 > field537 + field535 + 10 || var3 < field536 - 10 || var3 > field538 + field536 + 10) {
						field318 = false;

						if (field534 == 1) {
							field420 = true;
						}

						if (field534 == 2) {
							field473 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field535;
					int var5 = field536;
					int var6 = field537;
					int var7 = field844;
					int var8 = field845;
					if (field534 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field534 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field534 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field422; var10++) {
						int var11 = (field422 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method144(var9);
					}

					field318 = false;

					if (field534 == 1) {
						field420 = true;
					}

					if (field534 == 2) {
						field473 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field422 > 0) {
					int var12 = field246[field422 - 1];
					if (var12 == 9 || var12 == 225 || var12 == 444 || var12 == 564 || var12 == 894 || var12 == 961 || var12 == 399 || var12 == 324 || var12 == 227 || var12 == 891 || var12 == 52 || var12 == 1094) {
						int var13 = field244[field422 - 1];
						int var14 = field245[field422 - 1];
						Component var15 = Component.method204(var14);
						if (var15.field666 || var15.field612) {
							field398 = false;
							field501 = 0;
							field359 = var14;
							field360 = var13;
							field361 = 2;
							field362 = field844;
							field363 = field845;

							if (Component.method204(var14).field643 == field410) {
								field361 = 1;
							}

							if (Component.method204(var14).field643 == field253) {
								field361 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field530 == 1 || method150(field422 - 1)) && field422 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field422 > 0) {
					method144(field422 - 1);
				}

				if (var1 != 2 || field422 <= 0) {
					return;
				}

				method131();
			}
		}
	}

	@ObfuscatedName("client.a(ILEPQDEJTO;II)V")
	public final void method75(int arg0, Pix32 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field484 + field193 & 0x7FF;
			int var6 = Model.field1100[var5];
			int var7 = Model.field1101[var5];
			var6 = var6 * 256 / (field467 + 256);
			var7 = var7 * 256 / (field467 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field479.method200(256, 15, var12 + 94 + 4 - 10, 15, 20, 20, var10, 83 - var13 - 20);
		} else {
			method155(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.a(ZIIIII)V")
	public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field343.method492(arg4, arg1);
		field344.method492(arg2 + arg4 - 16, arg1);
		Pix2D.method337(arg2 - 32, arg4 + 16, field203, 16, arg1);
		int var6 = (arg2 - 32) * arg2 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg3 - arg2);
		Pix2D.method337(var6, arg4 + var7 + 16, field329, 16, arg1);
		Pix2D.method342(arg1, field382, var6, arg4 + var7 + 16);
		Pix2D.method342(arg1 + 1, field382, var6, arg4 + var7 + 16);
		Pix2D.method340(arg1, field382, arg4 + var7 + 16, 16);
		Pix2D.method340(arg1, field382, arg4 + var7 + 17, 16);
		Pix2D.method342(arg1 + 15, field517, var6, arg4 + var7 + 16);
		Pix2D.method342(arg1 + 14, field517, var6 - 1, arg4 + 17 + var7);
		Pix2D.method340(arg1, field517, arg4 + var7 + var6 + 15, 16);
		Pix2D.method340(arg1 + 1, field517, arg4 + var7 + var6 + 14, 15);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method77(boolean arg0) {
		for (int var2 = 0; var2 < field380; var2++) {
			ClientNpc var3 = field379[field381[var2]];
			int var4 = (field381[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method351() && var3.field1183.field1250 == arg0 && var3.field1183.method473()) {
				int var5 = var3.field1006 >> 7;
				int var6 = var3.field1007 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field997 == 1 && (var3.field1006 & 0x7F) == 0x40 && (var3.field1007 & 0x7F) == 0x40) {
						if (field168[var5][var6] == field384) {
							continue;
						}

						field168[var5][var6] = field384;
					}

					if (!var3.field1183.field1238) {
						var4 += Integer.MIN_VALUE;
					}

					field405.method285(var4, var3, var3.field1006, method133(var3.field1007, var3.field1006, field339), var3.field988, field339, (var3.field997 - 1) * 64 + 60, var3.field1007, var3.field1008);
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method78(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method79() {
		if (field155 > 0) {
			method148();
		} else {
			method149("Please wait - attempting to reestablish", "Connection lost");
			field306 = 0;
			field367 = 0;
			ClientStream var1 = field285;
			field383 = false;
			field132 = 0;
			method101(field340, field341, true);

			if (!field383) {
				method148();
			}

			try {
				var1.method233();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;)Z")
	public final boolean method80(Component arg0) {
		int var2 = arg0.field637;
		if (field142 == 2) {
			if (var2 == 201) {
				field473 = true;
				field476 = 0;
				field148 = true;
				field286 = "";
				field457 = 1;
				field207 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field473 = true;
				field476 = 0;
				field148 = true;
				field286 = "";
				field457 = 2;
				field207 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field155 = 250;
			return true;
		}

		if (var2 == 501) {
			field473 = true;
			field476 = 0;
			field148 = true;
			field286 = "";
			field457 = 4;
			field207 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field473 = true;
			field476 = 0;
			field148 = true;
			field286 = "";
			field457 = 5;
			field207 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field554[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IdkType.field1452 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IdkType.field1452) {
							var5 = 0;
						}
					}

					if (!IdkType.field1453[var5].field1459 && IdkType.field1453[var5].field1454 == var3 + (field388 ? 0 : 7)) {
						break;
					}
				}

				field554[var3] = var5;
				field508 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field347[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field272[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field272[var6].length) {
					var8 = 0;
				}
			}

			field347[var6] = var8;
			field508 = true;
		}

		if (var2 == 324 && !field388) {
			field388 = true;
			method45();
		}

		if (var2 == 325 && field388) {
			field388 = false;
			method45();
		}

		if (var2 == 326) {
			field229.p1isaac(163);
			field229.p1(field388 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field229.p1(field554[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field229.p1(field347[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field346 = !field346;
		}

		if (var2 >= 601 && var2 <= 613) {
			method34();

			if (field122.length() > 0) {
				field229.p1isaac(184);
				field229.p8(JString.method344(field122));
				field229.p1(var2 - 601);
				field229.p1(field346 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)LATJMVOZR;")
	public final Jagfile method81(int arg0, String arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field463[0] != null) {
				var6 = field463[0].method325(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field336.reset();
			field336.update(var6);
			int var8 = (int) field336.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new Jagfile(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method165(arg2, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method51(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				Packet var16 = new Packet(var15);
				var16.pos = 3;
				int var17 = var16.g3() + 6;
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
						method165(arg2, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field463[0] != null) {
						field463[0].method326(var6.length, var6, arg3);
					}
				} catch (Exception var28) {
					field463[0] = null;
				}

				if (var6 != null) {
					field336.reset();
					field336.update(var6);
					int var23 = (int) field336.getValue();
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
						method165(arg2, "Game updated - please reload page");
						var25 = 10;
					} else {
						method165(arg2, var11 + " - Retrying in " + var25);
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

				field178 = !field178;
			}
		}

		return new Jagfile(var6);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method82() {
		field303 = true;
	}

	@ObfuscatedName("client.a(LMFMVIYHT;II)V")
	public final void method83(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < field238; var3++) {
			int var4 = field239[var3];
			ClientNpc var5 = field379[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x1) != 0) {
				var5.field1183 = NpcType.method477(arg0.g2_alt2());
				var5.field997 = var5.field1183.field1248;
				var5.field996 = var5.field1183.field1256;
				var5.field1015 = var5.field1183.field1251;
				var5.field1016 = var5.field1183.field1249;
				var5.field1017 = var5.field1183.field1247;
				var5.field1018 = var5.field1183.field1240;
				var5.field1030 = var5.field1183.field1230;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1005 = arg0.g2_alt1();
				if (var5.field1005 == 0xFFFF) {
					var5.field1005 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var7 = arg0.g1_alt1();
				int var8 = arg0.g1_alt1();
				var5.method353(field553, var7, var8);
				var5.field991 = field553 + 300;
				var5.field992 = arg0.g1();
				var5.field993 = arg0.g1_alt3();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1010 = arg0.g2();
				int var9 = arg0.g4_alt2();
				var5.field1014 = var9 >> 16;
				var5.field1013 = (var9 & 0xFFFF) + field553;
				var5.field1011 = 0;
				var5.field1012 = 0;

				if (var5.field1013 > field553) {
					var5.field1011 = -1;
				}

				if (var5.field1010 == 0xFFFF) {
					var5.field1010 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field977 = arg0.gjstr();
				var5.field978 = 100;
			}

			if ((var6 & 0x8) != 0) {
				var5.field994 = arg0.g2_alt3();
				var5.field995 = arg0.g2_alt1();
			}

			if ((var6 & 0x2) != 0) {
				int var10 = arg0.g2();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.g1_alt3();
				if (var5.field1020 == var10 && var10 != -1) {
					int var12 = SeqType.field680[var10].field694;
					if (var12 == 1) {
						var5.field1021 = 0;
						var5.field1022 = 0;
						var5.field1023 = var11;
						var5.field1024 = 0;
					}

					if (var12 == 2) {
						var5.field1024 = 0;
					}
				} else if (var10 == -1 || var5.field1020 == -1 || SeqType.field680[var10].field688 >= SeqType.field680[var5.field1020].field688) {
					var5.field1020 = var10;
					var5.field1021 = 0;
					var5.field1022 = 0;
					var5.field1023 = var11;
					var5.field1024 = 0;
					var5.field1009 = var5.field1029;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg0.g1_alt3();
				int var14 = arg0.g1_alt3();
				var5.method353(field553, var13, var14);
				var5.field991 = field553 + 300;
				var5.field992 = arg0.g1();
				var5.field993 = arg0.g1_alt2();
			}
		}
	}

	@ObfuscatedName("client.a(IILZGNGQRPJ;ILMFMVIYHT;)V")
	public final void method84(int arg0, ClientPlayer arg1, int arg2, Packet arg3) {
		if ((arg2 & 0x8) != 0) {
			int var5 = arg3.g2();
			if (var5 == 0xFFFF) {
				var5 = -1;
			}

			int var6 = arg3.g1_alt3();
			if (arg1.field1020 == var5 && var5 != -1) {
				int var7 = SeqType.field680[var5].field694;
				if (var7 == 1) {
					arg1.field1021 = 0;
					arg1.field1022 = 0;
					arg1.field1023 = var6;
					arg1.field1024 = 0;
				}

				if (var7 == 2) {
					arg1.field1024 = 0;
				}
			} else if (var5 == -1 || arg1.field1020 == -1 || SeqType.field680[var5].field688 >= SeqType.field680[arg1.field1020].field688) {
				arg1.field1020 = var5;
				arg1.field1021 = 0;
				arg1.field1022 = 0;
				arg1.field1023 = var6;
				arg1.field1024 = 0;
				arg1.field1009 = arg1.field1029;
			}
		}

		if ((arg2 & 0x10) != 0) {
			arg1.field977 = arg3.gjstr();
			if (arg1.field977.charAt(0) == '~') {
				arg1.field977 = arg1.field977.substring(1);
				method67(arg1.field1433, arg1.field977, 2);
			} else if (field408 == arg1) {
				method67(arg1.field1433, arg1.field977, 2);
			}

			arg1.field979 = 0;
			arg1.field989 = 0;
			arg1.field978 = 150;
		}

		if ((arg2 & 0x100) != 0) {
			arg1.field998 = arg3.g1_alt1();
			arg1.field1000 = arg3.g1_alt2();
			arg1.field999 = arg3.g1_alt3();
			arg1.field1001 = arg3.g1();
			arg1.field1002 = arg3.g2() + field553;
			arg1.field1003 = arg3.g2_alt2() + field553;
			arg1.field1004 = arg3.g1();
			arg1.method350();
		}

		if ((arg2 & 0x1) != 0) {
			arg1.field1005 = arg3.g2_alt2();
			if (arg1.field1005 == 0xFFFF) {
				arg1.field1005 = -1;
			}
		}

		if ((arg2 & 0x2) != 0) {
			arg1.field994 = arg3.g2();
			arg1.field995 = arg3.g2();
		}

		if ((arg2 & 0x200) != 0) {
			arg1.field1010 = arg3.g2_alt2();
			int var8 = arg3.g4_alt2();
			arg1.field1014 = var8 >> 16;
			arg1.field1013 = (var8 & 0xFFFF) + field553;
			arg1.field1011 = 0;
			arg1.field1012 = 0;

			if (arg1.field1013 > field553) {
				arg1.field1011 = -1;
			}

			if (arg1.field1010 == 0xFFFF) {
				arg1.field1010 = -1;
			}
		}

		if ((arg2 & 0x4) != 0) {
			int var9 = arg3.g1();
			byte[] var10 = new byte[var9];
			Packet var11 = new Packet(var10);
			arg3.gdata_alt1(var10, var9, 0);
			field240[arg0] = var11;
			arg1.method574(var11);
		}

		if ((arg2 & 0x400) != 0) {
			int var12 = arg3.g1_alt1();
			int var13 = arg3.g1_alt3();
			arg1.method353(field553, var12, var13);
			arg1.field991 = field553 + 300;
			arg1.field992 = arg3.g1_alt2();
			arg1.field993 = arg3.g1();
		}

		if ((arg2 & 0x40) != 0) {
			int var14 = arg3.g2();
			int var15 = arg3.g1_alt2();
			int var16 = arg3.g1_alt1();
			int var17 = arg3.pos;

			if (arg1.field1433 != null && arg1.field1440) {
				long var18 = JString.method344(arg1.field1433);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < field137; var21++) {
						if (field324[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}

				if (!var20 && field478 == 0) {
					try {
						field378.pos = 0;
						arg3.gdata_alt2(field378.data, var16, 0);
						field378.pos = 0;
						String var22 = WordPack.method453(field378, var16);
						var22 = WordFilter.method504(var22);
						arg1.field977 = var22;
						arg1.field979 = var14 >> 8;
						arg1.field989 = var14 & 0xFF;
						arg1.field978 = 150;

						if (var15 == 2 || var15 == 3) {
							method67("@cr2@" + arg1.field1433, var22, 1);
						} else if (var15 == 1) {
							method67("@cr1@" + arg1.field1433, var22, 1);
						} else {
							method67(arg1.field1433, var22, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.pos = var16 + var17;
		}

		if ((arg2 & 0x80) != 0) {
			int var24 = arg3.g1_alt3();
			int var25 = arg3.g1_alt2();
			arg1.method353(field553, var24, var25);
			arg1.field991 = field553 + 300;
			arg1.field992 = arg3.g1_alt3();
			arg1.field993 = arg3.g1();
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method85() {
		if (field436 == null) {
			field830 = null;
			field402 = null;
			field400 = null;
			field399 = null;
			field401 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field439 = new PixMap(265, method164(), 128);
			Pix2D.method335();
			field440 = new PixMap(265, method164(), 128);
			Pix2D.method335();
			field436 = new PixMap(171, method164(), 509);
			Pix2D.method335();
			field437 = new PixMap(132, method164(), 360);
			Pix2D.method335();
			field438 = new PixMap(200, method164(), 360);
			Pix2D.method335();
			field441 = new PixMap(238, method164(), 202);
			Pix2D.method335();
			field442 = new PixMap(238, method164(), 203);
			Pix2D.method335();
			field443 = new PixMap(94, method164(), 74);
			Pix2D.method335();
			field444 = new PixMap(94, method164(), 75);
			Pix2D.method335();

			if (field170 != null) {
				method166();
				method72();
			}

			field303 = true;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method86() {
		method165(20, "Starting up");

		if (signlink.sunjava) {
			field823 = 5;
		}

		if (field264) {
			field277 = true;
		} else {
			field264 = true;
			boolean var1 = false;
			String var2 = method57();
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
						field463[var3] = new FileStream(var3 + 1, 600000, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method108();
					field170 = method81(field120[1], "title", 25, 1, "title screen");
					field312 = new PixFont(false, field170, "p11_full");
					field313 = new PixFont(false, field170, "p12_full");
					field314 = new PixFont(false, field170, "b12_full");
					field315 = new PixFont(true, field170, "q8_full");
					method166();
					method72();
					Jagfile var4 = method81(field120[2], "config", 30, 2, "config");
					Jagfile var5 = method81(field120[3], "interface", 35, 3, "interface");
					Jagfile var6 = method81(field120[4], "media", 40, 4, "2d graphics");
					Jagfile var7 = method81(field120[6], "textures", 45, 6, "textures");
					Jagfile var8 = method81(field120[7], "wordenc", 50, 7, "chat system");
					Jagfile var9 = method81(field120[8], "sounds", 55, 8, "sound effects");
					field372 = new byte[4][104][104];
					field173 = new int[4][105][105];
					field405 = new World3D(field173, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field492[var10] = new CollisionMap(104, 104);
					}

					field369 = new Pix32(512, 512);
					Jagfile var11 = method81(field120[5], "versionlist", 60, 5, "update list");
					method165(60, "Connecting to update server");
					field521 = new OnDemand();
					field521.method592(var11, this);
					AnimFrame.method261(field521.method600());
					Model.method356(field521.method597(0), field521);

					if (!field199) {
						field502 = 0;
						field503 = true;
						field521.method586(2, field502);

						while (field521.method590() > 0) {
							method99();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field521.field1500 > 3) {
								method38("ondemand");
								return;
							}
						}
					}

					method165(65, "Requesting animations");
					int var12 = field521.method597(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field521.method586(1, var13);
					}

					while (field521.method590() > 0) {
						int var14 = var12 - field521.method590();
						if (var14 > 0) {
							method165(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method99();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field521.field1500 > 3) {
							method38("ondemand");
							return;
						}
					}

					method165(70, "Requesting models");
					int var15 = field521.method597(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field521.method582(var16);
						if ((var17 & 0x1) != 0) {
							field521.method586(0, var16);
						}
					}

					int var18 = field521.method590();
					while (field521.method590() > 0) {
						int var19 = var18 - field521.method590();
						if (var19 > 0) {
							method165(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method99();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field463[0] != null) {
						method165(75, "Requesting maps");
						field521.method586(3, field521.method601(47, 48, 0));
						field521.method586(3, field521.method601(47, 48, 1));
						field521.method586(3, field521.method601(48, 48, 0));
						field521.method586(3, field521.method601(48, 48, 1));
						field521.method586(3, field521.method601(49, 48, 0));
						field521.method586(3, field521.method601(49, 48, 1));
						field521.method586(3, field521.method601(47, 47, 0));
						field521.method586(3, field521.method601(47, 47, 1));
						field521.method586(3, field521.method601(48, 47, 0));
						field521.method586(3, field521.method601(48, 47, 1));
						field521.method586(3, field521.method601(48, 148, 0));
						field521.method586(3, field521.method601(48, 148, 1));
						int var20 = field521.method590();
						while (field521.method590() > 0) {
							int var21 = var20 - field521.method590();
							if (var21 > 0) {
								method165(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method99();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field521.method597(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field521.method582(var23);
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
							field521.method584(0, var25, var23);
						}
					}

					field521.method589(field198);

					if (!field199) {
						int var26 = field521.method597(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field521.method585(var27)) {
								field521.method584(2, (byte) 1, var27);
							}
						}
					}

					int var28 = field521.method597(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field521.method582(var29);
						if (var30 == 0 && field521.field1477 < 200) {
							field521.method584(0, (byte) 1, var29);
						}
					}

					method165(80, "Unpacking media");
					field424 = new Pix8(var6, "invback", 0);
					field426 = new Pix8(var6, "chatback", 0);
					field425 = new Pix8(var6, "mapback", 0);
					field230 = new Pix8(var6, "backbase1", 0);
					field231 = new Pix8(var6, "backbase2", 0);
					field232 = new Pix8(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field241[var31] = new Pix8(var6, "sideicons", var31);
					}

					field364 = new Pix32(var6, "compass", 0);
					field479 = new Pix32(var6, "mapedge", 0);
					field479.method192();

					for (int var32 = 0; var32 < 72; var32++) {
						field397[var32] = new Pix8(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field290[var33] = new Pix32(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field421[var34] = new Pix32(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field518[var35] = new Pix32(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field328[var36] = new Pix32(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field222[var37] = new Pix32(var6, "headicons_hint", var37);
					}

					field335 = new Pix32(var6, "overlay_multiway", 0);
					field294 = new Pix32(var6, "mapmarker", 0);
					field295 = new Pix32(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field176[var38] = new Pix32(var6, "cross", var38);
					}

					field430 = new Pix32(var6, "mapdots", 0);
					field431 = new Pix32(var6, "mapdots", 1);
					field432 = new Pix32(var6, "mapdots", 2);
					field433 = new Pix32(var6, "mapdots", 3);
					field434 = new Pix32(var6, "mapdots", 4);
					field343 = new Pix8(var6, "scrollbar", 0);
					field344 = new Pix8(var6, "scrollbar", 1);
					field162 = new Pix8(var6, "redstone1", 0);
					field163 = new Pix8(var6, "redstone2", 0);
					field164 = new Pix8(var6, "redstone3", 0);
					field165 = new Pix8(var6, "redstone1", 0);
					field165.method489();
					field166 = new Pix8(var6, "redstone2", 0);
					field166.method489();
					field248 = new Pix8(var6, "redstone1", 0);
					field248.method490();
					field249 = new Pix8(var6, "redstone2", 0);
					field249.method490();
					field250 = new Pix8(var6, "redstone3", 0);
					field250.method490();
					field251 = new Pix8(var6, "redstone1", 0);
					field251.method489();
					field251.method490();
					field252 = new Pix8(var6, "redstone2", 0);
					field252.method489();
					field252.method490();

					for (int var39 = 0; var39 < 2; var39++) {
						field387[var39] = new Pix8(var6, "mod_icons", var39);
					}

					Pix32 var40 = new Pix32(var6, "backleft1", 0);
					field183 = new PixMap(var40.field601, method164(), var40.field600);
					var40.method193(0, 0);
					Pix32 var41 = new Pix32(var6, "backleft2", 0);
					field184 = new PixMap(var41.field601, method164(), var41.field600);
					var41.method193(0, 0);
					Pix32 var42 = new Pix32(var6, "backright1", 0);
					field185 = new PixMap(var42.field601, method164(), var42.field600);
					var42.method193(0, 0);
					Pix32 var43 = new Pix32(var6, "backright2", 0);
					field186 = new PixMap(var43.field601, method164(), var43.field600);
					var43.method193(0, 0);
					Pix32 var44 = new Pix32(var6, "backtop1", 0);
					field187 = new PixMap(var44.field601, method164(), var44.field600);
					var44.method193(0, 0);
					Pix32 var45 = new Pix32(var6, "backvmid1", 0);
					field188 = new PixMap(var45.field601, method164(), var45.field600);
					var45.method193(0, 0);
					Pix32 var46 = new Pix32(var6, "backvmid2", 0);
					field189 = new PixMap(var46.field601, method164(), var46.field600);
					var46.method193(0, 0);
					Pix32 var47 = new Pix32(var6, "backvmid3", 0);
					field190 = new PixMap(var47.field601, method164(), var47.field600);
					var47.method193(0, 0);
					Pix32 var48 = new Pix32(var6, "backhmid2", 0);
					field191 = new PixMap(var48.field601, method164(), var48.field600);
					var48.method193(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field290[var53] != null) {
							field290[var53].method191(var51 + var52, var50 + var52, var49 + var52);
						}

						if (field397[var53] != null) {
							field397[var53].method491(var51 + var52, var50 + var52, var49 + var52);
						}
					}

					method165(83, "Unpacking textures");
					Pix3D.method549(var7);
					Pix3D.method553(0.8D);
					Pix3D.method548(20);
					method165(86, "Unpacking config");
					SeqType.method213(var4);
					LocType.method564(var4);
					FloType.method216(var4);
					ObjType.method223(var4);
					NpcType.method474(var4);
					IdkType.method575(var4);
					SpotAnimType.method437(var4);
					VarpType.method484(var4);
					VarbitType.method602(var4);
					ObjType.field727 = field198;

					if (!field199) {
						method165(90, "Unpacking sounds");
						byte[] var54 = var9.method2("sounds.dat", null);
						Packet var55 = new Packet(var54);
						Wave.method478(var55);
					}

					method165(95, "Unpacking interfaces");
					PixFont[] var56 = new PixFont[] { field312, field313, field314, field315 };
					Component.method208(var56, var5, var6);
					method165(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field425.field1336[field425.field1338 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field419[var57] = var58;
						field516[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field425.field1336[field425.field1338 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field280[var61 - 5] = var62 - 25;
						field195[var61 - 5] = var63 - var62;
					}

					Pix3D.method546(503, 765);
					field268 = Pix3D.field1367;
					Pix3D.method546(96, 479);
					field265 = Pix3D.field1367;
					Pix3D.method546(261, 190);
					field266 = Pix3D.field1367;
					Pix3D.method546(334, 512);
					field267 = Pix3D.field1367;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = Pix3D.field1365[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					World3D.method310(334, var65, 800, 500, 512);
					WordFilter.method494(var8);
					field480 = new MouseTracking(this);
					method142(field480, 10);
					ClientLocAnim.field1156 = this;
					LocType.field1390 = this;
					NpcType.field1236 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field287 + " " + field550);
					field513 = true;
				}
			} else {
				field345 = true;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method87(int arg0) {
		if (!field199) {
			for (int var2 = 0; var2 < field520.length; var2++) {
				int var3 = field520[var2];
				if (Pix3D.field1375[var3] >= arg0) {
					Pix8 var4 = Pix3D.field1369[var3];
					int var5 = var4.field1339 * var4.field1338 - 1;
					int var6 = field220 * var4.field1338 * 2;
					byte[] var7 = var4.field1336;
					byte[] var8 = field477;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1336 = var8;
					field477 = var7;
					Pix3D.method551(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;IIIIII)V")
	public final void method88(int arg0, Component arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field631 == 0 && arg1.field652 != null && !arg1.field614 && (arg5 >= arg4 && arg6 >= arg0 && arg5 <= arg1.field636 + arg4 && arg6 <= arg1.field633 + arg0)) {
			int var8 = arg1.field652.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field627[var9] + arg4;
				int var11 = arg1.field667[var9] + arg0 - arg3;
				Component var12 = Component.method204(arg1.field652[var9]);
				var10 += var12.field623;
				var11 += var12.field653;
				if ((var12.field649 >= 0 || var12.field655 != 0) && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
					if (var12.field649 >= 0) {
						field192 = var12.field649;
					} else {
						field192 = var12.field610;
					}
				}

				if (var12.field631 == 8 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
					field545 = var12.field610;
				}

				if (var12.field631 == 0) {
					method88(var11, var12, arg2, var12.field626, var10, arg5, arg6);

					if (var12.field674 > var12.field633) {
						method62(var12.field674, var11, var12, arg6, arg2, arg5, var12.field633, var12.field636 + var10);
					}
				} else {
					if (var12.field678 == 1 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						boolean var13 = false;
						if (var12.field637 != 0) {
							var13 = method43(var12);
						}

						if (!var13) {
							field423[field422] = var12.field662;
							field246[field422] = 352;
							field245[field422] = var12.field610;
							field422++;
						}
					}

					if (var12.field678 == 2 && field412 == 0 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						String var14 = var12.field670;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field423[field422] = var14 + " @gre@" + var12.field606;
						field246[field422] = 70;
						field245[field422] = var12.field610;
						field422++;
					}

					if (var12.field678 == 3 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						field423[field422] = "Close";

						if (arg2 == 3) {
							field246[field422] = 55;
						} else {
							field246[field422] = 639;
						}

						field245[field422] = var12.field610;
						field422++;
					}

					if (var12.field678 == 4 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						field423[field422] = var12.field662;
						field246[field422] = 890;
						field245[field422] = var12.field610;
						field422++;
					}

					if (var12.field678 == 5 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						field423[field422] = var12.field662;
						field246[field422] = 518;
						field245[field422] = var12.field610;
						field422++;
					}

					if (var12.field678 == 6 && !field472 && arg5 >= var10 && arg6 >= var11 && arg5 < var12.field636 + var10 && arg6 < var12.field633 + var11) {
						field423[field422] = var12.field662;
						field246[field422] = 575;
						field245[field422] = var12.field610;
						field422++;
					}

					if (var12.field631 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field633; var16++) {
							for (int var17 = 0; var17 < var12.field636; var17++) {
								int var18 = (var12.field657 + 32) * var17 + var10;
								int var19 = (var12.field639 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field616[var15];
									var19 += var12.field608[var15];
								}

								if (arg5 >= var18 && arg6 >= var19 && arg5 < var18 + 32 && arg6 < var19 + 32) {
									field316 = var15;
									field317 = var12.field610;

									if (var12.field663[var15] > 0) {
										ObjType var20 = ObjType.method221(var12.field663[var15] - 1);
										if (field390 == 1 && var12.field624) {
											if (field392 != var12.field610 || field391 != var15) {
												field423[field422] = "Use " + field394 + " with @lre@" + var20.field712;
												field246[field422] = 903;
												field247[field422] = var20.field742;
												field244[field422] = var15;
												field245[field422] = var12.field610;
												field422++;
											}
										} else if (field412 != 1 || !var12.field624) {
											if (var12.field624) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field730 != null && var20.field730[var21] != null) {
														field423[field422] = var20.field730[var21] + " @lre@" + var20.field712;

														if (var21 == 3) {
															field246[field422] = 227;
														}

														if (var21 == 4) {
															field246[field422] = 891;
														}

														field247[field422] = var20.field742;
														field244[field422] = var15;
														field245[field422] = var12.field610;
														field422++;
													} else if (var21 == 4) {
														field423[field422] = "Drop @lre@" + var20.field712;
														field246[field422] = 891;
														field247[field422] = var20.field742;
														field244[field422] = var15;
														field245[field422] = var12.field610;
														field422++;
													}
												}
											}

											if (var12.field677) {
												field423[field422] = "Use @lre@" + var20.field712;
												field246[field422] = 52;
												field247[field422] = var20.field742;
												field244[field422] = var15;
												field245[field422] = var12.field610;
												field422++;
											}

											if (var12.field624 && var20.field730 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field730[var22] != null) {
														field423[field422] = var20.field730[var22] + " @lre@" + var20.field712;

														if (var22 == 0) {
															field246[field422] = 961;
														}

														if (var22 == 1) {
															field246[field422] = 399;
														}

														if (var22 == 2) {
															field246[field422] = 324;
														}

														field247[field422] = var20.field742;
														field244[field422] = var15;
														field245[field422] = var12.field610;
														field422++;
													}
												}
											}

											if (var12.field656 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field656[var23] != null) {
														field423[field422] = var12.field656[var23] + " @lre@" + var20.field712;

														if (var23 == 0) {
															field246[field422] = 9;
														}

														if (var23 == 1) {
															field246[field422] = 225;
														}

														if (var23 == 2) {
															field246[field422] = 444;
														}

														if (var23 == 3) {
															field246[field422] = 564;
														}

														if (var23 == 4) {
															field246[field422] = 894;
														}

														field247[field422] = var20.field742;
														field244[field422] = var15;
														field245[field422] = var12.field610;
														field422++;
													}
												}
											}

											field423[field422] = "Examine @lre@" + var20.field712;
											field246[field422] = 1094;
											field247[field422] = var20.field742;
											field244[field422] = var15;
											field245[field422] = var12.field610;
											field422++;
										} else if ((field414 & 0x10) == 0x10) {
											field423[field422] = field415 + " @lre@" + var20.field712;
											field246[field422] = 361;
											field247[field422] = var20.field742;
											field244[field422] = var15;
											field245[field422] = var12.field610;
											field422++;
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

	@ObfuscatedName("client.o(I)V")
	public final void method89() {
		for (int var1 = 0; var1 < field380; var1++) {
			int var2 = field381[var1];
			ClientNpc var3 = field379[var2];
			if (var3 != null) {
				method90(var3.field1183.field1248, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IBLLRUWCBNN;)V")
	public final void method90(int arg0, ClientEntity arg1) {
		if (arg1.field1006 < 128 || arg1.field1007 < 128 || arg1.field1006 >= 13184 || arg1.field1007 >= 13184) {
			arg1.field1020 = -1;
			arg1.field1010 = -1;
			arg1.field1002 = 0;
			arg1.field1003 = 0;
			arg1.field1006 = arg1.field982[0] * 128 + arg1.field997 * 64;
			arg1.field1007 = arg1.field983[0] * 128 + arg1.field997 * 64;
			arg1.method350();
		}

		if (field408 == arg1 && (arg1.field1006 < 1536 || arg1.field1007 < 1536 || arg1.field1006 >= 11776 || arg1.field1007 >= 11776)) {
			arg1.field1020 = -1;
			arg1.field1010 = -1;
			arg1.field1002 = 0;
			arg1.field1003 = 0;
			arg1.field1006 = arg1.field982[0] * 128 + arg1.field997 * 64;
			arg1.field1007 = arg1.field983[0] * 128 + arg1.field997 * 64;
			arg1.method350();
		}

		if (arg1.field1002 > field553) {
			method91(arg1);
		} else if (arg1.field1003 >= field553) {
			method92(arg1);
		} else {
			method93(arg1);
		}

		method94(arg1);
		method95(arg1);
	}

	@ObfuscatedName("client.a(LLRUWCBNN;Z)V")
	public final void method91(ClientEntity arg0) {
		int var2 = arg0.field1002 - field553;
		int var3 = arg0.field998 * 128 + arg0.field997 * 64;
		int var4 = arg0.field997 * 64 + arg0.field1000 * 128;
		arg0.field1006 += (var3 - arg0.field1006) / var2;
		arg0.field1007 += (var4 - arg0.field1007) / var2;
		arg0.field1019 = 0;

		if (arg0.field1004 == 0) {
			arg0.field980 = 1024;
		}

		if (arg0.field1004 == 1) {
			arg0.field980 = 1536;
		}

		if (arg0.field1004 == 2) {
			arg0.field980 = 0;
		}

		if (arg0.field1004 == 3) {
			arg0.field980 = 512;
		}
	}

	@ObfuscatedName("client.a(LLRUWCBNN;I)V")
	public final void method92(ClientEntity arg0) {
		if (field553 == arg0.field1003 || arg0.field1020 == -1 || arg0.field1023 != 0 || arg0.field1022 + 1 > SeqType.field680[arg0.field1020].method214(arg0.field1021)) {
			int var2 = arg0.field1003 - arg0.field1002;
			int var3 = field553 - arg0.field1002;
			int var4 = arg0.field998 * 128 + arg0.field997 * 64;
			int var5 = arg0.field997 * 64 + arg0.field1000 * 128;
			int var6 = arg0.field999 * 128 + arg0.field997 * 64;
			int var7 = arg0.field997 * 64 + arg0.field1001 * 128;
			arg0.field1006 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1007 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1019 = 0;

		if (arg0.field1004 == 0) {
			arg0.field980 = 1024;
		}

		if (arg0.field1004 == 1) {
			arg0.field980 = 1536;
		}

		if (arg0.field1004 == 2) {
			arg0.field980 = 0;
		}

		if (arg0.field1004 == 3) {
			arg0.field980 = 512;
		}

		arg0.field1008 = arg0.field980;
	}

	@ObfuscatedName("client.b(LLRUWCBNN;I)V")
	public final void method93(ClientEntity arg0) {
		arg0.field984 = arg0.field1030;
		if (arg0.field1029 == 0) {
			arg0.field1019 = 0;
		} else {
			if (arg0.field1020 != -1 && arg0.field1023 == 0) {
				SeqType var2 = SeqType.field680[arg0.field1020];
				if (arg0.field1009 > 0 && var2.field692 == 0) {
					arg0.field1019++;
					return;
				}

				if (arg0.field1009 <= 0 && var2.field693 == 0) {
					arg0.field1019++;
					return;
				}
			}

			int var3 = arg0.field1006;
			int var4 = arg0.field1007;
			int var5 = arg0.field982[arg0.field1029 - 1] * 128 + arg0.field997 * 64;
			int var6 = arg0.field983[arg0.field1029 - 1] * 128 + arg0.field997 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field980 = 1280;
					} else if (var4 > var6) {
						arg0.field980 = 1792;
					} else {
						arg0.field980 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field980 = 768;
					} else if (var4 > var6) {
						arg0.field980 = 256;
					} else {
						arg0.field980 = 512;
					}
				} else if (var4 < var6) {
					arg0.field980 = 1024;
				} else {
					arg0.field980 = 0;
				}

				int var7 = arg0.field980 - arg0.field1008 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1016;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1015;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1018;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1017;
				}

				if (var8 == -1) {
					var8 = arg0.field1015;
				}

				arg0.field984 = var8;
				int var9 = 4;
				if (arg0.field980 != arg0.field1008 && arg0.field1005 == -1 && arg0.field996 != 0) {
					var9 = 2;
				}

				if (arg0.field1029 > 2) {
					var9 = 6;
				}

				if (arg0.field1029 > 3) {
					var9 = 8;
				}

				if (arg0.field1019 > 0 && arg0.field1029 > 1) {
					var9 = 8;
					arg0.field1019--;
				}

				if (arg0.field987[arg0.field1029 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field984 == arg0.field1015 && arg0.field1025 != -1) {
					arg0.field984 = arg0.field1025;
				}

				if (var3 < var5) {
					arg0.field1006 += var9;
					if (arg0.field1006 > var5) {
						arg0.field1006 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1006 -= var9;
					if (arg0.field1006 < var5) {
						arg0.field1006 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1007 += var9;
					if (arg0.field1007 > var6) {
						arg0.field1007 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1007 -= var9;
					if (arg0.field1007 < var6) {
						arg0.field1007 = var6;
					}
				}

				if (arg0.field1006 == var5 && arg0.field1007 == var6) {
					arg0.field1029--;

					if (arg0.field1009 > 0) {
						arg0.field1009--;
						return;
					}
				}
			} else {
				arg0.field1006 = var5;
				arg0.field1007 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLLRUWCBNN;)V")
	public final void method94(ClientEntity arg0) {
		if (arg0.field996 != 0) {
			if (arg0.field1005 != -1 && arg0.field1005 < 32768) {
				ClientNpc var2 = field379[arg0.field1005];
				if (var2 != null) {
					int var3 = arg0.field1006 - var2.field1006;
					int var4 = arg0.field1007 - var2.field1007;
					if (var3 != 0 || var4 != 0) {
						arg0.field980 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1005 >= 32768) {
				int var5 = arg0.field1005 - 32768;
				if (field227 == var5) {
					var5 = field234;
				}

				ClientPlayer var6 = field235[var5];
				if (var6 != null) {
					int var7 = arg0.field1006 - var6.field1006;
					int var8 = arg0.field1007 - var6.field1007;
					if (var7 != 0 || var8 != 0) {
						arg0.field980 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field994 != 0 || arg0.field995 != 0) && (arg0.field1029 == 0 || arg0.field1019 > 0)) {
				int var9 = arg0.field1006 - (arg0.field994 - field297 - field297) * 64;
				int var10 = arg0.field1007 - (arg0.field995 - field298 - field298) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field980 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field994 = 0;
				arg0.field995 = 0;
			}

			int var11 = arg0.field980 - arg0.field1008 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field996 || var11 > 2048 - arg0.field996) {
					arg0.field1008 = arg0.field980;
				} else if (var11 > 1024) {
					arg0.field1008 -= arg0.field996;
				} else {
					arg0.field1008 += arg0.field996;
				}

				arg0.field1008 &= 0x7FF;
				if (arg0.field984 == arg0.field1030 && arg0.field980 != arg0.field1008) {
					if (arg0.field1031 != -1) {
						arg0.field984 = arg0.field1031;
						return;
					}

					arg0.field984 = arg0.field1015;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(LLRUWCBNN;I)V")
	public final void method95(ClientEntity arg0) {
		arg0.field988 = false;

		if (arg0.field984 != -1) {
			SeqType var2 = SeqType.field680[arg0.field984];
			arg0.field986++;
			if (arg0.field985 < var2.field681 && arg0.field986 > var2.method214(arg0.field985)) {
				arg0.field986 = 1;
				arg0.field985++;
			}

			if (arg0.field985 >= var2.field681) {
				arg0.field986 = 1;
				arg0.field985 = 0;
			}
		}

		if (arg0.field1010 != -1 && field553 >= arg0.field1013) {
			if (arg0.field1011 < 0) {
				arg0.field1011 = 0;
			}

			SeqType var3 = SpotAnimType.field1118[arg0.field1010].field1122;
			arg0.field1012++;
			if (arg0.field1011 < var3.field681 && arg0.field1012 > var3.method214(arg0.field1011)) {
				arg0.field1012 = 1;
				arg0.field1011++;
			}

			if (arg0.field1011 >= var3.field681 && (arg0.field1011 < 0 || arg0.field1011 >= var3.field681)) {
				arg0.field1010 = -1;
			}
		}

		if (arg0.field1020 != -1 && arg0.field1023 <= 1) {
			SeqType var4 = SeqType.field680[arg0.field1020];
			if (var4.field692 == 1 && arg0.field1009 > 0 && arg0.field1002 <= field553 && arg0.field1003 < field553) {
				arg0.field1023 = 1;
				return;
			}
		}

		if (arg0.field1020 != -1 && arg0.field1023 == 0) {
			SeqType var5 = SeqType.field680[arg0.field1020];
			arg0.field1022++;
			if (arg0.field1021 < var5.field681 && arg0.field1022 > var5.method214(arg0.field1021)) {
				arg0.field1022 = 1;
				arg0.field1021++;
			}

			if (arg0.field1021 >= var5.field681) {
				arg0.field1021 -= var5.field685;
				arg0.field1024++;
				if (arg0.field1024 >= var5.field691) {
					arg0.field1020 = -1;
				}

				if (arg0.field1021 < 0 || arg0.field1021 >= var5.field681) {
					arg0.field1020 = -1;
				}
			}

			arg0.field988 = var5.field687;
		}

		if (arg0.field1023 > 0) {
			arg0.field1023--;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method96() {
		if (field308 == -1 || field323 != 2 && field830 == null) {
			if (field303) {
				method146();
				field303 = false;
				field183.method241(4, 0, field829);
				field184.method241(357, 0, field829);
				field185.method241(4, 722, field829);
				field186.method241(205, 743, field829);
				field187.method241(0, 0, field829);
				field188.method241(4, 516, field829);
				field189.method241(205, 516, field829);
				field190.method241(357, 496, field829);
				field191.method241(338, 0, field829);
				field420 = true;
				field473 = true;
				field219 = true;
				field448 = true;

				if (field323 != 2) {
					field401.method241(4, 4, field829);
					field400.method241(4, 550, field829);
				}

				field470++;
				if (field470 > 85) {
					field470 = 0;
					field229.p1isaac(168);
				}
			}

			if (field323 == 2) {
				method178();
			}

			if (field318 && field534 == 1) {
				field420 = true;
			}

			if (field337 != -1) {
				boolean var3 = method110(field220, field337);
				if (var3) {
					field420 = true;
				}
			}

			if (field559 == 2) {
				field420 = true;
			}

			if (field361 == 2) {
				field420 = true;
			}

			if (field420) {
				method159();
				field420 = false;
			}

			if (field253 == -1 && field476 == 0) {
				field481.field626 = field355 - field133 - 77;

				if (field837 > 448 && field837 < 560 && field838 > 332) {
					method62(field355, 0, field481, field838 - 357, -1, field837 - 17, 77, 463);
				}

				int var4 = field355 - field481.field626 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field355 - 77) {
					var4 = field355 - 77;
				}

				if (field133 != var4) {
					field133 = var4;
					field473 = true;
				}
			}

			if (field253 == -1 && field476 == 3) {
				int var5 = field144 * 14 + 7;
				field481.field626 = field147;

				if (field837 > 448 && field837 < 560 && field838 > 332) {
					method62(var5, 0, field481, field838 - 357, -1, field837 - 17, 77, 463);
				}

				int var6 = field481.field626;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field147 != var6) {
					field147 = var6;
					field473 = true;
				}
			}

			if (field253 != -1) {
				boolean var7 = method110(field220, field253);
				if (var7) {
					field473 = true;
				}
			}

			if (field559 == 3) {
				field473 = true;
			}

			if (field361 == 3) {
				field473 = true;
			}

			if (field311 != null) {
				field473 = true;
			}

			if (field318 && field534 == 2) {
				field473 = true;
			}

			if (field473) {
				method106();
				field473 = false;
			}

			if (field323 == 2) {
				method109();
				field400.method241(4, 550, field829);
			}

			if (field449 != -1) {
				field219 = true;
			}

			if (field219) {
				if (field449 != -1 && field515 == field449) {
					field449 = -1;
					field229.p1isaac(119);
					field229.p1(field515);
				}

				field219 = false;
				field358.method240();
				field232.method492(0, 0);

				if (field337 == -1) {
					if (field330[field515] != -1) {
						if (field515 == 0) {
							field162.method492(10, 22);
						}

						if (field515 == 1) {
							field163.method492(8, 54);
						}

						if (field515 == 2) {
							field163.method492(8, 82);
						}

						if (field515 == 3) {
							field164.method492(8, 110);
						}

						if (field515 == 4) {
							field166.method492(8, 153);
						}

						if (field515 == 5) {
							field166.method492(8, 181);
						}

						if (field515 == 6) {
							field165.method492(9, 209);
						}
					}

					if (field330[0] != -1 && (field449 != 0 || field553 % 20 < 10)) {
						field241[0].method492(13, 29);
					}

					if (field330[1] != -1 && (field449 != 1 || field553 % 20 < 10)) {
						field241[1].method492(11, 53);
					}

					if (field330[2] != -1 && (field449 != 2 || field553 % 20 < 10)) {
						field241[2].method492(11, 82);
					}

					if (field330[3] != -1 && (field449 != 3 || field553 % 20 < 10)) {
						field241[3].method492(12, 115);
					}

					if (field330[4] != -1 && (field449 != 4 || field553 % 20 < 10)) {
						field241[4].method492(13, 153);
					}

					if (field330[5] != -1 && (field449 != 5 || field553 % 20 < 10)) {
						field241[5].method492(11, 180);
					}

					if (field330[6] != -1 && (field449 != 6 || field553 % 20 < 10)) {
						field241[6].method492(13, 208);
					}
				}

				field358.method241(160, 516, field829);
				field357.method240();
				field231.method492(0, 0);

				if (field337 == -1) {
					if (field330[field515] != -1) {
						if (field515 == 7) {
							field248.method492(0, 42);
						}

						if (field515 == 8) {
							field249.method492(0, 74);
						}

						if (field515 == 9) {
							field249.method492(0, 102);
						}

						if (field515 == 10) {
							field250.method492(1, 130);
						}

						if (field515 == 11) {
							field252.method492(0, 173);
						}

						if (field515 == 12) {
							field252.method492(0, 201);
						}

						if (field515 == 13) {
							field251.method492(0, 229);
						}
					}

					if (field330[8] != -1 && (field449 != 8 || field553 % 20 < 10)) {
						field241[7].method492(2, 74);
					}

					if (field330[9] != -1 && (field449 != 9 || field553 % 20 < 10)) {
						field241[8].method492(3, 102);
					}

					if (field330[10] != -1 && (field449 != 10 || field553 % 20 < 10)) {
						field241[9].method492(4, 137);
					}

					if (field330[11] != -1 && (field449 != 11 || field553 % 20 < 10)) {
						field241[10].method492(2, 174);
					}

					if (field330[12] != -1 && (field449 != 12 || field553 % 20 < 10)) {
						field241[11].method492(2, 201);
					}

					if (field330[13] != -1 && (field449 != 13 || field553 % 20 < 10)) {
						field241[12].method492(2, 226);
					}
				}

				field357.method241(466, 496, field829);
				field401.method240();
				Pix3D.field1367 = field267;
			}

			if (field448) {
				field448 = false;
				field356.method240();
				field230.method492(0, 0);
				field313.method245(true, 0xFFFFFF, 28, 55, "Public chat");

				if (field270 == 0) {
					field313.method245(true, 0xFF00, 41, 55, "On");
				}

				if (field270 == 1) {
					field313.method245(true, 0xFFFF00, 41, 55, "Friends");
				}

				if (field270 == 2) {
					field313.method245(true, 0xFF0000, 41, 55, "Off");
				}

				if (field270 == 3) {
					field313.method245(true, 0xFFFF, 41, 55, "Hide");
				}

				field313.method245(true, 0xFFFFFF, 28, 184, "Private chat");

				if (field169 == 0) {
					field313.method245(true, 0xFF00, 41, 184, "On");
				}

				if (field169 == 1) {
					field313.method245(true, 0xFFFF00, 41, 184, "Friends");
				}

				if (field169 == 2) {
					field313.method245(true, 0xFF0000, 41, 184, "Off");
				}

				field313.method245(true, 0xFFFFFF, 28, 324, "Trade/compete");

				if (field462 == 0) {
					field313.method245(true, 0xFF00, 41, 324, "On");
				}

				if (field462 == 1) {
					field313.method245(true, 0xFFFF00, 41, 324, "Friends");
				}

				if (field462 == 2) {
					field313.method245(true, 0xFF0000, 41, 324, "Off");
				}

				field313.method245(true, 0xFFFFFF, 33, 458, "Report abuse");
				field356.method241(453, 0, field829);
				field401.method240();
				Pix3D.field1367 = field267;
			}

			field220 = 0;
		} else {
			if (field323 == 2) {
				method110(field220, field308);

				if (field226 != -1) {
					method110(field220, field226);
				}

				field220 = 0;
				method174();
				field830.method240();
				Pix3D.field1367 = field268;
				Pix2D.method335();
				field303 = true;
				Component var1 = Component.method204(field308);
				if (var1.field636 == 512 && var1.field633 == 334 && var1.field631 == 0) {
					var1.field636 = 765;
					var1.field633 = 503;
				}

				method169(0, 0, var1, 0);

				if (field226 != -1) {
					Component var2 = Component.method204(field226);
					if (var2.field636 == 512 && var2.field633 == 334 && var2.field631 == 0) {
						var2.field636 = 765;
						var2.field633 = 503;
					}

					method169(0, 0, var2, 0);
				}

				if (field318) {
					method153();
				} else {
					method114();
					method54();
				}
			}

			field830.method241(0, 0, field829);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method97() {
		if (field458 != 0) {
			PixFont var1 = field313;
			int var2 = 0;
			if (field310 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field528[var3] != null) {
					int var4 = field526[var3];
					String var5 = field527[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field169 == 0 || field169 == 1 && method175(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method248(var8, 0, var7, "From");
						var1.method248(var8, 0xFFFF, var7 - 1, "From");
						int var11 = var8 + var1.method246("From ");
						if (var6 == 1) {
							field387[0].method492(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field387[1].method492(var7 - 12, var11);
							var11 += 14;
						}

						var1.method248(var11, 0, var7, var5 + ": " + field528[var3]);
						var1.method248(var11, 0xFFFF, var7 - 1, var5 + ": " + field528[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field169 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method248(4, 0, var9, field528[var3]);
						var1.method248(4, 0xFFFF, var9 - 1, field528[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field169 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method248(4, 0, var10, "To " + var5 + ": " + field528[var3]);
						var1.method248(4, 0xFFFF, var10 - 1, "To " + var5 + ": " + field528[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public final void init() {
		field196 = Integer.parseInt(getParameter("nodeid"));
		field197 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method124();
		} else {
			method47();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field198 = false;
		} else {
			field198 = true;
		}

		method267(765, 503);
	}

	@ObfuscatedName("client.r(I)V")
	public final void method98() {
		for (MapSpotAnim var1 = (MapSpotAnim) field446.method6(); var1 != null; var1 = (MapSpotAnim) field446.method8()) {
			if (field339 != var1.field1318 || var1.field1322) {
				var1.method604();
			} else if (field553 >= var1.field1326) {
				var1.method486(field220);

				if (var1.field1322) {
					var1.method604();
				} else {
					field405.method285(-1, var1, var1.field1319, var1.field1321, false, var1.field1318, 60, var1.field1320, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method99() {
		while (true) {
			OnDemandRequest var1 = field521.method587();
			if (var1 == null) {
				return;
			}

			if (var1.field1178 == 0) {
				Model.method357(var1.field1181, var1.field1179);

				if ((field521.method582(var1.field1179) & 0x62) != 0) {
					field420 = true;

					if (field253 != -1 || field429 != -1) {
						field473 = true;
					}
				}
			}

			if (var1.field1178 == 1 && var1.field1181 != null) {
				AnimFrame.method262(var1.field1181);
			}

			if (var1.field1178 == 2 && field502 == var1.field1179 && var1.field1181 != null) {
				method44(field503, var1.field1181);
			}

			if (var1.field1178 == 3 && field323 == 1) {
				for (int var2 = 0; var2 < field121.length; var2++) {
					if (field139[var2] == var1.field1179) {
						field121[var2] = var1.field1181;

						if (var1.field1181 == null) {
							field139[var2] = -1;
						}

						break;
					}

					if (field140[var2] == var1.field1179) {
						field466[var2] = var1.field1181;

						if (var1.field1181 == null) {
							field140[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1178 == 93 && field521.method591(var1.field1179)) {
				World.method17(field521, new Packet(var1.field1181));
			}
		}
	}

	@ObfuscatedName("client.s(I)Z")
	public final boolean method100() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method101(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field224 = "";
				field225 = "Connecting to server...";
				method156(true);
			}

			field285 = new ClientStream(method52(field197 + 43594), this);
			long var4 = JString.method344(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field229.pos = 0;
			field229.p1(14);
			field229.p1(var6);
			field285.method237(2, 0, field229.data);

			for (int var7 = 0; var7 < 8; var7++) {
				field285.method234();
			}

			int var8 = field285.method234();
			int var9 = var8;

			if (var8 == 0) {
				field285.method236(field427.data, 0, 8);
				field427.pos = 0;
				field202 = field427.g8();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field202 >> 32), (int) field202 };
				field229.pos = 0;
				field229.p1(10);
				field229.p4(var10[0]);
				field229.p4(var10[1]);
				field229.p4(var10[2]);
				field229.p4(var10[3]);
				field229.p4(signlink.uid);
				field229.pjstr(arg0);
				field229.pjstr(arg1);
				field229.rsaenc(field123, field546);
				field201.pos = 0;

				if (arg2) {
					field201.p1(18);
				} else {
					field201.p1(16);
				}

				field201.p1(field229.pos + 36 + 1 + 1 + 2);
				field201.p1(255);
				field201.p2(377);
				field201.p1(field199 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field201.p4(field120[var11]);
				}

				field201.pdata(field229.data, field229.pos, 0);
				field229.field1109 = new Isaac(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field177 = new Isaac(var10);
				field285.method237(field201.pos, 0, field201.data);
				var8 = field285.method234();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method101(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field149 = field285.method234();
				field228 = field285.method234() == 1;
				field179 = 0L;
				field529 = 0;
				field480.field93 = 0;
				field834 = true;
				field506 = true;
				field383 = true;
				field229.pos = 0;
				field427.pos = 0;
				field152 = -1;
				field180 = -1;
				field181 = -1;
				field182 = -1;
				field151 = 0;
				field153 = 0;
				field310 = 0;
				field155 = 0;
				field435 = 0;
				field422 = 0;
				field318 = false;
				field835 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field528[var13] = null;
				}

				field390 = 0;
				field412 = 0;
				field323 = 0;
				field293 = 0;
				field135 = (int) (Math.random() * 100.0D) - 50;
				field273 = (int) (Math.random() * 110.0D) - 55;
				field487 = (int) (Math.random() * 80.0D) - 40;
				field193 = (int) (Math.random() * 120.0D) - 60;
				field467 = (int) (Math.random() * 30.0D) - 20;
				field484 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field306 = 0;
				field507 = -1;
				field367 = 0;
				field368 = 0;
				field236 = 0;
				field380 = 0;

				for (int var14 = 0; var14 < field233; var14++) {
					field235[var14] = null;
					field240[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field379[var15] = null;
				}

				field408 = field235[field234] = new ClientPlayer();
				field512.method10();
				field446.method10();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field551[var16][var17][var18] = null;
						}
					}
				}

				field493 = new LinkList();
				field142 = 0;
				field141 = 0;
				method64(field429);
				field429 = -1;
				method64(field253);
				field253 = -1;
				method64(field410);
				field410 = -1;
				method64(field308);
				field308 = -1;
				method64(field226);
				field226 = -1;
				method64(field337);
				field337 = -1;
				method64(field510);
				field510 = -1;
				field472 = false;
				field515 = 3;
				field476 = 0;
				field318 = false;
				field148 = false;
				field311 = null;
				field547 = 0;
				field449 = -1;
				field388 = true;
				method45();

				for (int var19 = 0; var19 < 5; var19++) {
					field347[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field321[var20] = null;
					field322[var20] = false;
				}

				field348 = 0;
				field406 = 0;
				field469 = 0;
				field307 = 0;
				field385 = 0;
				method146();
			} else if (var8 == 3) {
				field224 = "";
				field225 = "Invalid username or password.";
			} else if (var8 == 4) {
				field224 = "Your account has been disabled.";
				field225 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field224 = "Your account is already logged in.";
				field225 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field224 = "RuneScape has been updated!";
				field225 = "Please reload this page.";
			} else if (var8 == 7) {
				field224 = "This world is full.";
				field225 = "Please use a different world.";
			} else if (var8 == 8) {
				field224 = "Unable to connect.";
				field225 = "Login server offline.";
			} else if (var8 == 9) {
				field224 = "Login limit exceeded.";
				field225 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field224 = "Unable to connect.";
				field225 = "Bad session id.";
			} else if (var8 == 12) {
				field224 = "You need a members account to login to this world.";
				field225 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field224 = "Could not complete login.";
				field225 = "Please try using a different world.";
			} else if (var8 == 14) {
				field224 = "The server is being updated.";
				field225 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field383 = true;
				field229.pos = 0;
				field427.pos = 0;
				field152 = -1;
				field180 = -1;
				field181 = -1;
				field182 = -1;
				field151 = 0;
				field153 = 0;
				field310 = 0;
				field422 = 0;
				field318 = false;
				field464 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field224 = "Login attempts exceeded.";
				field225 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field224 = "You are standing in a members-only area.";
				field225 = "To play on this world move to a free area first";
			} else if (var8 == 18) {
				field224 = "Account locked as we suspect it has been stolen.";
				field225 = "Press 'recover a locked account' on front page.";
			} else if (var8 == 20) {
				field224 = "Invalid loginserver requested";
				field225 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field285.method234();
				for (var21 += 3; var21 >= 0; var21--) {
					field224 = "You have only just left another world";
					field225 = "Your profile will be transferred in: " + var21;
					method156(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method101(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field224 = "Malformed login packet.";
				field225 = "Please try again.";
			} else if (var8 == 23) {
				field224 = "No reply from loginserver.";
				field225 = "Please try again.";
			} else if (var8 == 24) {
				field224 = "Error loading your profile.";
				field225 = "Please contact customer support.";
			} else if (var8 == 25) {
				field224 = "Unexpected loginserver response.";
				field225 = "Please try using a different world.";
			} else if (var8 == 26) {
				field224 = "This computers address has been blocked";
				field225 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field224 = "Unexpected server response";
				field225 = "Please try using a different world.";
			} else if (var9 != 0) {
				field224 = "No response from server";
				field225 = "Please try using a different world.";
			} else if (field132 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field132++;
				method101(arg0, arg1, arg2);
			} else {
				field224 = "No response from loginserver";
				field225 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field224 = "";
			field225 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method102(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field405.method304(field339, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LocType var8 = LocType.method561(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1416;
				var10 = var8.field1394;
			} else {
				var9 = var8.field1394;
				var10 = var8.field1416;
			}

			int var11 = var8.field1385;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method55(true, arg0, field408.field983[0], var9, var10, 2, 0, arg1, var11, 0, field408.field982[0]);
		} else {
			method55(true, arg0, field408.field983[0], 0, 0, 2, var6 + 1, arg1, 0, var7, field408.field982[0]);
		}

		field281 = field844;
		field282 = field845;
		field284 = 2;
		field283 = 0;
		return true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method103() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field333[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field333[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field334[var10] = (field333[var10 - 1] + field333[var10 + 1] + field333[var10 - 128] + field333[var10 + 128]) / 4;
			}
		}

		field471 += 128;
		if (field471 > field416.length) {
			field471 -= field416.length;
			int var11 = (int) (Math.random() * 12.0D);
			method105(field365[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field334[var14 + 128] - field416[field471 + var14 & field416.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field333[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field407[var16] = field407[var16 + 1];
		}

		field407[var1 - 1] = (int) (Math.sin(field553 / 14.0D) * 16.0D + Math.sin(field553 / 15.0D) * 14.0D + Math.sin(field553 / 16.0D) * 12.0D);

		if (field304 > 0) {
			field304 -= 4;
		}

		if (field305 > 0) {
			field305 -= 4;
		}

		if (field304 == 0 && field305 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field304 = 1024;
			}

			if (var17 == 1) {
				field305 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LSLDUQHOR;IIIB)V")
	public final void method104(NpcType arg0, int arg1, int arg2, int arg3) {
		if (field422 < 400) {
			if (arg0.field1231 != null) {
				arg0 = arg0.method476();
			}

			if (arg0 != null && arg0.field1238) {
				String var5 = arg0.field1257;
				if (arg0.field1246 != 0) {
					var5 = var5 + method115(arg0.field1246, field408.field1435) + " (level-" + arg0.field1246 + ")";
				}

				if (field390 == 1) {
					field423[field422] = "Use " + field394 + " with @yel@" + var5;
					field246[field422] = 347;
					field247[field422] = arg3;
					field244[field422] = arg2;
					field245[field422] = arg1;
					field422++;
				} else if (field412 != 1) {
					if (arg0.field1252 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1252[var6] != null && !arg0.field1252[var6].equalsIgnoreCase("attack")) {
								field423[field422] = arg0.field1252[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field246[field422] = 318;
								}

								if (var6 == 1) {
									field246[field422] = 921;
								}

								if (var6 == 2) {
									field246[field422] = 118;
								}

								if (var6 == 3) {
									field246[field422] = 553;
								}

								if (var6 == 4) {
									field246[field422] = 432;
								}

								field247[field422] = arg3;
								field244[field422] = arg2;
								field245[field422] = arg1;
								field422++;
							}
						}
					}

					if (arg0.field1252 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1252[var7] != null && arg0.field1252[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field1246 > field408.field1435) {
									var8 = 2000;
								}

								field423[field422] = arg0.field1252[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field246[field422] = var8 + 318;
								}

								if (var7 == 1) {
									field246[field422] = var8 + 921;
								}

								if (var7 == 2) {
									field246[field422] = var8 + 118;
								}

								if (var7 == 3) {
									field246[field422] = var8 + 553;
								}

								if (var7 == 4) {
									field246[field422] = var8 + 432;
								}

								field247[field422] = arg3;
								field244[field422] = arg2;
								field245[field422] = arg1;
								field422++;
							}
						}
					}

					field423[field422] = "Examine @yel@" + var5;
					field246[field422] = 1668;
					field247[field422] = arg3;
					field244[field422] = arg2;
					field245[field422] = arg1;
					field422++;
				} else if ((field414 & 0x2) == 2) {
					field423[field422] = field415 + " @yel@" + var5;
					field246[field422] = 67;
					field247[field422] = arg3;
					field244[field422] = arg2;
					field245[field422] = arg1;
					field422++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LWRRBQEHV;I)V")
	public final void method105(Pix8 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field416.length; var3++) {
			field416[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field416[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field417[var9] = (field416[var9 - 1] + field416[var9 + 1] + field416[var9 - 128] + field416[var9 + 128]) / 4;
				}
			}

			int[] var10 = field416;
			field416 = field417;
			field417 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1339; var12++) {
				for (int var13 = 0; var13 < arg0.field1338; var13++) {
					if (arg0.field1336[var11++] != 0) {
						int var14 = var13 + arg0.field1340 + 16;
						int var15 = var12 + arg0.field1341 + 16;
						int var16 = (var15 << 7) + var14;
						field416[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method106() {
		field402.method240();
		Pix3D.field1367 = field265;
		field426.method492(0, 0);

		if (field148) {
			field314.method244(239, 40, 0, field207);
			field314.method244(239, 60, 128, field286 + "*");
		} else if (field476 == 1) {
			field314.method244(239, 40, 0, "Enter amount:");
			field314.method244(239, 60, 128, field218 + "*");
		} else if (field476 == 2) {
			field314.method244(239, 40, 0, "Enter name:");
			field314.method244(239, 60, 128, field218 + "*");
		} else if (field476 == 3) {
			if (field218 != field143) {
				method33(field218);
				field143 = field218;
			}

			PixFont var1 = field313;
			Pix2D.method334(0, 0, 77, 463);

			for (int var2 = 0; var2 < field144; var2++) {
				int var3 = var2 * 14 + 18 - field147;
				if (var3 > 0 && var3 < 110) {
					var1.method244(239, var3, 0, field145[var2]);
				}
			}

			Pix2D.method333();

			if (field144 > 5) {
				method76(field147, 463, 77, field144 * 14 + 7, 0);
			}

			if (field218.length() == 0) {
				field314.method244(239, 40, 255, "Enter object name");
			} else if (field144 == 0) {
				field314.method244(239, 40, 0, "No matching objects found, please shorten search");
			}

			var1.method244(239, 90, 0, field218 + "*");
			Pix2D.method340(0, 0, 77, 479);
		} else if (field311 != null) {
			field314.method244(239, 40, 0, field311);
			field314.method244(239, 60, 128, "Click to continue");
		} else if (field253 != -1) {
			method169(0, 0, Component.method204(field253), 0);
		} else if (field429 == -1) {
			PixFont var4 = field313;
			int var5 = 0;
			Pix2D.method334(0, 0, 77, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field528[var6] != null) {
					int var7 = field526[var6];
					int var8 = field133 + 70 - var5 * 14;
					String var9 = field527[var6];
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
							var4.method248(4, 0, var8, field528[var6]);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field270 == 0 || field270 == 1 && method175(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field387[0].method492(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field387[1].method492(var8 - 12, var11);
								var11 += 14;
							}

							var4.method248(var11, 0, var8, var9 + ":");
							var11 += var4.method246(var9) + 8;
							var4.method248(var11, 255, var8, field528[var6]);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field458 == 0 && (var7 == 7 || field169 == 0 || field169 == 1 && method175(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method248(var12, 0, var8, "From");
							int var14 = var12 + var4.method246("From ");
							if (var10 == 1) {
								field387[0].method492(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field387[1].method492(var8 - 12, var14);
								var14 += 14;
							}

							var4.method248(var14, 0, var8, var9 + ":");
							var14 += var4.method246(var9) + 8;
							var4.method248(var14, 0x800000, var8, field528[var6]);
						}

						var5++;
					}

					if (var7 == 4 && (field462 == 0 || field462 == 1 && method175(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method248(4, 0x800080, var8, var9 + " " + field528[var6]);
						}

						var5++;
					}

					if (var7 == 5 && field458 == 0 && field169 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method248(4, 0x800000, var8, field528[var6]);
						}

						var5++;
					}

					if (var7 == 6 && field458 == 0 && field169 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method248(4, 0, var8, "To " + var9 + ":");
							var4.method248(var4.method246("To " + var9) + 12, 0x800000, var8, field528[var6]);
						}

						var5++;
					}

					if (var7 == 8 && (field462 == 0 || field462 == 1 && method175(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method248(4, 0x7E3200, var8, var9 + " " + field528[var6]);
						}

						var5++;
					}
				}
			}

			Pix2D.method333();
			field355 = var5 * 14 + 7;
			if (field355 < 78) {
				field355 = 78;
			}

			method76(field355 - field133 - 77, 463, 77, field355, 0);
			String var13;
			if (field408 == null || field408.field1433 == null) {
				var13 = JString.method348(field340);
			} else {
				var13 = field408.field1433;
			}

			var4.method248(4, 0, 90, var13 + ":");
			var4.method248(var4.method246(var13 + ": ") + 6, 255, 90, field352 + "*");
			Pix2D.method340(0, 0, 77, 479);
		} else {
			method169(0, 0, Component.method204(field429), 0);
		}

		if (field318 && field534 == 2) {
			method153();
		}

		field402.method241(357, 17, field829);
		field401.method240();
		Pix3D.field1367 = field267;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method107() {
		for (int var1 = -1; var1 < field236; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field234;
			} else {
				var2 = field237[var1];
			}

			ClientPlayer var3 = field235[var2];
			if (var3 != null && var3.field978 > 0) {
				var3.field978--;
				if (var3.field978 == 0) {
					var3.field977 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field380; var4++) {
			int var5 = field381[var4];
			ClientNpc var6 = field379[var5];
			if (var6 != null && var6.field978 > 0) {
				var6.field978--;
				if (var6.field978 == 0) {
					var6.field977 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method108() {
		int var1 = 5;
		field120[8] = 0;
		int var2 = 0;
		while (field120[8] == 0) {
			String var3 = "Unknown problem";
			method165(20, "Connecting to web server");

			try {
				DataInputStream var4 = method51("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 377);
				Packet var5 = new Packet(new byte[40]);
				var4.readFully(var5.data, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field120[var6] = var5.g4();
				}

				int var7 = var5.g4();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field120[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field120[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field120[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field120[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field120[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field120[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method165(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method165(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field178 = !field178;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method109() {
		field400.method240();

		if (field306 == 2) {
			byte[] var1 = field425.field1336;
			int[] var2 = Pix2D.field949;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field364.method199(0, 33, 25, 33, field516, 0, field484, 256, field419, 25);
			field401.method240();
			Pix3D.field1367 = field267;
		} else {
			int var5 = field484 + field193 & 0x7FF;
			int var6 = field408.field1006 / 32 + 48;
			int var7 = 464 - field408.field1007 / 32;
			field369.method199(5, 151, var6, 146, field195, 25, var5, field467 + 256, field280, var7);
			field364.method199(0, 33, 25, 33, field516, 0, field484, 256, field419, 25);

			for (int var8 = 0; var8 < field325; var8++) {
				int var9 = field326[var8] * 4 + 2 - field408.field1006 / 32;
				int var10 = field327[var8] * 4 + 2 - field408.field1007 / 32;
				method155(var10, field509[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LinkList var13 = field551[field339][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field408.field1006 / 32;
						int var15 = var12 * 4 + 2 - field408.field1007 / 32;
						method155(var15, field430, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field380; var16++) {
				ClientNpc var17 = field379[field381[var16]];
				if (var17 != null && var17.method351()) {
					NpcType var18 = var17.field1183;
					if (var18.field1231 != null) {
						var18 = var18.method476();
					}

					if (var18 != null && var18.field1243 && var18.field1238) {
						int var19 = var17.field1006 / 32 - field408.field1006 / 32;
						int var20 = var17.field1007 / 32 - field408.field1007 / 32;
						method155(var20, field431, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field236; var21++) {
				ClientPlayer var22 = field235[field237[var21]];
				if (var22 != null && var22.method351()) {
					int var23 = var22.field1006 / 32 - field408.field1006 / 32;
					int var24 = var22.field1007 / 32 - field408.field1007 / 32;
					boolean var25 = false;
					long var26 = JString.method344(var22.field1433);
					for (int var28 = 0; var28 < field141; var28++) {
						if (field377[var28] == var26 && field499[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field408.field1447 != 0 && var22.field1447 != 0 && field408.field1447 == var22.field1447) {
						var29 = true;
					}

					if (var25) {
						method155(var24, field433, var23);
					} else if (var29) {
						method155(var24, field434, var23);
					} else {
						method155(var24, field432, var23);
					}
				}
			}

			if (field435 != 0 && field553 % 20 < 10) {
				if (field435 == 1 && field461 >= 0 && field461 < field379.length) {
					ClientNpc var30 = field379[field461];
					if (var30 != null) {
						int var31 = var30.field1006 / 32 - field408.field1006 / 32;
						int var32 = var30.field1007 / 32 - field408.field1007 / 32;
						method75(var32, field295, var31);
					}
				}

				if (field435 == 2) {
					int var33 = (field126 - field297) * 4 + 2 - field408.field1006 / 32;
					int var34 = (field127 - field298) * 4 + 2 - field408.field1007 / 32;
					method75(var34, field295, var33);
				}

				if (field435 == 10 && field395 >= 0 && field395 < field235.length) {
					ClientPlayer var35 = field235[field395];
					if (var35 != null) {
						int var36 = var35.field1006 / 32 - field408.field1006 / 32;
						int var37 = var35.field1007 / 32 - field408.field1007 / 32;
						method75(var37, field295, var36);
					}
				}
			}

			if (field367 != 0) {
				int var38 = field367 * 4 + 2 - field408.field1006 / 32;
				int var39 = field368 * 4 + 2 - field408.field1007 / 32;
				method155(var39, field294, var38);
			}

			Pix2D.method337(3, 78, 0xFFFFFF, 3, 97);
			field401.method240();
			Pix3D.field1367 = field267;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field832 != null) {
				return new URL("http://127.0.0.1:" + (field197 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method110(int arg0, int arg1) {
		boolean var3 = false;
		Component var4 = Component.method204(arg1);
		for (int var5 = 0; var5 < var4.field652.length && var4.field652[var5] != -1; var5++) {
			Component var6 = Component.method204(var4.field652[var5]);
			if (var6.field631 == 0) {
				var3 |= method110(arg0, var6.field610);
			}

			if (var6.field631 == 6 && (var6.field675 != -1 || var6.field676 != -1)) {
				boolean var7 = method118(var6);
				int var8;
				if (var7) {
					var8 = var6.field676;
				} else {
					var8 = var6.field675;
				}

				if (var8 != -1) {
					SeqType var9 = SeqType.field680[var8];
					var6.field622 += arg0;
					while (var6.field622 > var9.method214(var6.field630)) {
						var6.field622 -= var9.method214(var6.field630);
						var6.field630++;
						if (var6.field630 >= var9.field681) {
							var6.field630 -= var9.field685;
							if (var6.field630 < 0 || var6.field630 >= var9.field681) {
								var6.field630 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field631 == 6 && var6.field613 != 0) {
				int var10 = var6.field613 >> 16;
				int var11 = var6.field613 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field647 = var6.field647 + var10 & 0x7FF;
				var6.field648 = var6.field648 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method111(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method112(long arg0) {
		if (arg0 != 0L) {
			if (field137 >= 100) {
				method67("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = JString.method348(JString.method345(arg0));
				for (int var4 = 0; var4 < field137; var4++) {
					if (field324[var4] == arg0) {
						method67("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field141; var5++) {
					if (field377[var5] == arg0) {
						method67("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field324[field137++] = arg0;
				field420 = true;
				field229.p1isaac(217);
				field229.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method113() {
		if (!field277 && !field513 && !field345) {
			field553++;

			if (field383) {
				method48();
			} else {
				method176();
			}

			method99();
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method114() {
		if (field361 == 0) {
			field423[0] = "Cancel";
			field246[0] = 1016;
			field422 = 1;
			if (field308 == -1) {
				method134();
				field192 = 0;
				field545 = 0;

				if (field837 > 4 && field838 > 4 && field837 < 516 && field838 < 338) {
					if (field410 == -1) {
						method63();
					} else {
						method88(4, Component.method204(field410), 0, 0, 4, field837, field838);
					}
				}

				if (field532 != field192) {
					field532 = field192;
				}

				if (field545 != field376) {
					field376 = field545;
				}

				field192 = 0;
				field545 = 0;

				if (field837 > 553 && field838 > 205 && field837 < 743 && field838 < 466) {
					if (field337 != -1) {
						method88(205, Component.method204(field337), 1, 0, 553, field837, field838);
					} else if (field330[field515] != -1) {
						method88(205, Component.method204(field330[field515]), 1, 0, 553, field837, field838);
					}
				}

				if (field511 != field192) {
					field420 = true;
					field511 = field192;
				}

				if (field545 != field301) {
					field420 = true;
					field301 = field545;
				}

				field192 = 0;
				field545 = 0;

				if (field837 > 17 && field838 > 357 && field837 < 496 && field838 < 453) {
					if (field253 != -1) {
						method88(357, Component.method204(field253), 2, 0, 17, field837, field838);
					} else if (field429 != -1) {
						method88(357, Component.method204(field429), 3, 0, 17, field837, field838);
					} else if (field838 < 434 && field837 < 426 && field476 == 0) {
						method136(field837 - 17, field838 - 357);
					}
				}

				if ((field253 != -1 || field429 != -1) && field354 != field192) {
					field473 = true;
					field354 = field192;
				}

				if ((field253 != -1 || field429 != -1) && field545 != field514) {
					field473 = true;
					field514 = field545;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field422 - 1; var2++) {
						if (field246[var2] < 1000 && field246[var2 + 1] > 1000) {
							String var3 = field423[var2];
							field423[var2] = field423[var2 + 1];
							field423[var2 + 1] = var3;
							int var4 = field246[var2];
							field246[var2] = field246[var2 + 1];
							field246[var2 + 1] = var4;
							int var5 = field244[var2];
							field244[var2] = field244[var2 + 1];
							field244[var2 + 1] = var5;
							int var6 = field245[var2];
							field245[var2] = field245[var2 + 1];
							field245[var2 + 1] = var6;
							int var7 = field247[var2];
							field247[var2] = field247[var2 + 1];
							field247[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field192 = 0;
				field545 = 0;
				method88(0, Component.method204(field308), 0, 0, 0, field837, field838);

				if (field532 != field192) {
					field532 = field192;
				}

				if (field545 != field376) {
					field376 = field545;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method115(int arg0, int arg1) {
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

	@ObfuscatedName("client.x(I)V")
	public final void method116() {
		try {
			field507 = -1;
			field446.method10();
			field512.method10();
			Pix3D.method547();
			method69();
			field405.method274();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field492[var1].method532();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field372[var2][var3][var4] = 0;
					}
				}
			}

			World var5 = new World(field173, field372, 104, 104);
			int var6 = field121.length;
			field229.p1isaac(40);

			if (!field404) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field138[var7] >> 8) * 64 - field297;
					int var9 = (field138[var7] & 0xFF) * 64 - field298;
					byte[] var10 = field121[var7];
					if (var10 != null) {
						var5.method22(var9, (field172 - 6) * 8, var8, var10, (field171 - 6) * 8, field492);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field138[var11] >> 8) * 64 - field297;
					int var13 = (field138[var11] & 0xFF) * 64 - field298;
					byte[] var14 = field121[var11];
					if (var14 == null && field172 < 800) {
						var5.method28(var12, var13, 64, 64);
					}
				}

				field229.p1isaac(40);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field466[var15];
					if (var16 != null) {
						int var17 = (field138[var15] >> 8) * 64 - field297;
						int var18 = (field138[var15] & 0xFF) * 64 - field298;
						var5.method27(var18, field492, var17, field405, var16);
					}
				}
			}

			if (field404) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field161[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field138.length; var29++) {
									if (field138[var29] == var28 && field121[var29] != null) {
										var5.method16(var25, (var27 & 0x7) * 8, field121[var29], var19, var24, var20 * 8, field492, var21 * 8, (var26 & 0x7) * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method14(var19, var21 * 8, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field161[0][var30][var31];
						if (var32 == -1) {
							var5.method28(var30 * 8, var31 * 8, 8, 8);
						}
					}
				}

				field229.p1isaac(40);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field161[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field138.length; var42++) {
									if (field138[var42] == var41 && field466[var42] != null) {
										var5.method20(var33, field492, field405, field466[var42], var35 * 8, var38, (var39 & 0x7) * 8, var34 * 8, (var40 & 0x7) * 8, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field229.p1isaac(40);
			var5.method15(field492, field405);

			if (field401 != null) {
				field401.method240();
				Pix3D.field1367 = field267;
			}

			field229.p1isaac(40);
			int var43 = World.field105;
			if (var43 > field339) {
				var43 = field339;
			}

			if (var43 < field339 - 1) {
				int var44 = field339 - 1;
			}

			if (field199) {
				field405.method275(World.field105);
			} else {
				field405.method275(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method46(var45, var46);
				}
			}

			method37();
		} catch (Exception var59) {
		}

		LocType.field1398.method460();

		if (field832 != null) {
			field229.p1isaac(78);
			field229.p4(1057001181);
		}

		if (field199 && signlink.cache_dat != null) {
			int var48 = field521.method597(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field521.method582(var49);
				if ((var50 & 0x79) == 0) {
					Model.method358(var49);
				}
			}
		}

		System.gc();
		Pix3D.method548(20);
		field521.method593();
		int var51 = (field171 - 6) / 8 - 1;
		int var52 = (field171 + 6) / 8 + 1;
		int var53 = (field172 - 6) / 8 - 1;
		int var54 = (field172 + 6) / 8 + 1;
		if (field319) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field521.method601(var55, var56, 0);
					if (var57 != -1) {
						field521.method594(var57, 3);
					}

					int var58 = field521.method601(var55, var56, 1);
					if (var58 != -1) {
						field521.method594(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIB)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = Model.field1100[var7];
			int var13 = Model.field1101[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = Model.field1100[var8];
			int var16 = Model.field1101[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field452 = arg1 - var9;
		field453 = arg0 - var10;
		field454 = arg5 - var11;
		field455 = arg2;
		field456 = arg4;
	}

	@ObfuscatedName("client.b(LEWIXBTLV;I)Z")
	public final boolean method118(Component arg0) {
		if (arg0.field665 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field665.length; var2++) {
			int var3 = method154(var2, arg0);
			int var4 = arg0.field651[var2];
			if (arg0.field665[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field665[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field665[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IILMFMVIYHT;)V")
	public final void method119(int arg0, Packet arg1) {
		field524 = 0;
		field238 = 0;
		method61(arg0, arg1);
		method137(arg0, arg1);
		method35(arg0, arg1);
		method60(arg1, arg0);

		for (int var3 = 0; var3 < field524; var3++) {
			int var4 = field525[var3];
			if (field553 != field235[var4].field981) {
				field235[var4] = null;
			}
		}

		if (arg1.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field236; var5++) {
			if (field235[field237[var5]] == null) {
				signlink.reporterror(field340 + " null entry in pl list - pos:" + var5 + " size:" + field236);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method120(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field137; var3++) {
				if (field324[var3] == arg0) {
					field137--;
					field420 = true;

					for (int var4 = var3; var4 < field137; var4++) {
						field324[var4] = field324[var4 + 1];
					}

					field229.p1isaac(160);
					field229.p8(arg0);
					break;
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

	@ObfuscatedName("client.y(I)V")
	public final void method121() {
		short var1 = 256;

		if (field304 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field304 > 768) {
					field540[var2] = method129(field541[var2], field542[var2], 1024 - field304);
				} else if (field304 > 256) {
					field540[var2] = field542[var2];
				} else {
					field540[var2] = method129(field542[var2], field541[var2], 256 - field304);
				}
			}
		} else if (field305 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field305 > 768) {
					field540[var3] = method129(field541[var3], field543[var3], 1024 - field305);
				} else if (field305 > 256) {
					field540[var3] = field543[var3];
				} else {
					field540[var3] = method129(field543[var3], field541[var3], 256 - field305);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field540[var4] = field541[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field439.field770[var5] = field278.field599[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field407[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field333[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field540[var12];
					int var15 = field439.field770[var7];
					field439.field770[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field439.method241(0, 0, field829);

		for (int var16 = 0; var16 < 33920; var16++) {
			field440.field770[var16] = field279.field599[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field407[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field333[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field540[var23];
					int var26 = field440.field770[var18];
					field440.field770[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field440.method241(0, 637, field829);
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method122(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method123() {
		for (int var1 = -1; var1 < field236; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field234;
			} else {
				var2 = field237[var1];
			}

			ClientPlayer var3 = field235[var2];
			if (var3 != null) {
				method90(1, var3);
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public static final void method124() {
		World3D.field875 = true;
		Pix3D.field1356 = true;
		field199 = true;
		World.field119 = true;
		LocType.field1392 = true;
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method125(long arg0) {
		if (arg0 != 0L) {
			if (field141 >= 100 && field320 != 1) {
				method67("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field141 >= 200) {
				method67("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = JString.method348(JString.method345(arg0));
				for (int var4 = 0; var4 < field141; var4++) {
					if (field377[var4] == arg0) {
						method67("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field137; var5++) {
					if (field324[var5] == arg0) {
						method67("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field408.field1433)) {
					field131[field141] = var3;
					field377[field141] = arg0;
					field499[field141] = 0;
					field141++;
					field420 = true;
					field229.p1isaac(120);
					field229.p8(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLEWIXBTLV;)V")
	public final void method126(Component arg0) {
		int var2 = arg0.field637;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field142 == 0) {
				arg0.field625 = "Loading friend list";
				arg0.field678 = 0;
			} else if (var2 == 1 && field142 == 1) {
				arg0.field625 = "Connecting to friendserver";
				arg0.field678 = 0;
			} else if (var2 == 2 && field142 != 2) {
				arg0.field625 = "Please wait...";
				arg0.field678 = 0;
			} else {
				int var3 = field141;
				if (field142 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field625 = "";
					arg0.field678 = 0;
				} else {
					arg0.field625 = field131[var2];
					arg0.field678 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field141;
			if (field142 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field625 = "";
				arg0.field678 = 0;
			} else {
				if (field499[var2] == 0) {
					arg0.field625 = "@red@Offline";
				} else if (field499[var2] < 200) {
					if (field499[var2] == field196) {
						arg0.field625 = "@gre@World" + (field499[var2] - 9);
					} else {
						arg0.field625 = "@yel@World" + (field499[var2] - 9);
					}
				} else if (field499[var2] == field196) {
					arg0.field625 = "@gre@Classic" + (field499[var2] - 219);
				} else {
					arg0.field625 = "@yel@Classic" + (field499[var2] - 219);
				}

				arg0.field678 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field141;
			if (field142 != 2) {
				var5 = 0;
			}

			arg0.field674 = var5 * 15 + 20;
			if (arg0.field674 <= arg0.field633) {
				arg0.field674 = arg0.field633 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field142 == 0) {
				arg0.field625 = "Loading ignore list";
				arg0.field678 = 0;
			} else if (var2 == 1 && field142 == 0) {
				arg0.field625 = "Please wait...";
				arg0.field678 = 0;
			} else {
				int var6 = field137;
				if (field142 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field625 = "";
					arg0.field678 = 0;
				} else {
					arg0.field625 = JString.method348(JString.method345(field324[var2]));
					arg0.field678 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field674 = field137 * 15 + 20;
			if (arg0.field674 <= arg0.field633) {
				arg0.field674 = arg0.field633 + 1;
			}
		} else if (var2 == 327) {
			arg0.field647 = 150;
			arg0.field648 = (int) (Math.sin(field553 / 40.0D) * 256.0D) & 0x7FF;

			if (field508) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field554[var7];
					if (var8 >= 0 && !IdkType.field1453[var8].method577()) {
						return;
					}
				}

				field508 = false;
				Model[] var9 = new Model[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field554[var11];
					if (var12 >= 0) {
						var9[var10++] = IdkType.field1453[var12].method578();
					}
				}

				Model var13 = new Model(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field347[var14] != 0) {
						var13.method373(field272[var14][0], field272[var14][field347[var14]]);

						if (var14 == 1) {
							var13.method373(field500[0], field500[field347[var14]]);
						}
					}
				}

				var13.method366();
				var13.method367(SeqType.field680[field408.field1030].field682[0]);
				var13.method376(64, 850, -30, -50, -30, true);
				arg0.field672 = 5;
				arg0.field673 = 0;
				Component.method210(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field350 == null) {
				field350 = arg0.field607;
				field351 = arg0.field640;
			}

			if (field388) {
				arg0.field607 = field351;
			} else {
				arg0.field607 = field350;
			}
		} else if (var2 == 325) {
			if (field350 == null) {
				field350 = arg0.field607;
				field351 = arg0.field640;
			}

			if (field388) {
				arg0.field607 = field350;
			} else {
				arg0.field607 = field351;
			}
		} else if (var2 == 600) {
			arg0.field625 = field122;
			if (field553 % 20 < 10) {
				arg0.field625 = arg0.field625 + "|";
			} else {
				arg0.field625 = arg0.field625 + " ";
			}
		} else if (var2 == 620) {
			if (field149 < 1) {
				arg0.field625 = "";
			} else if (field346) {
				arg0.field635 = 0xFF0000;
				arg0.field625 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field635 = 0xFFFFFF;
				arg0.field625 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field411 - field451;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field625 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field292 == 0) {
				arg0.field625 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field292 <= field411) {
				arg0.field625 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method127(field292);
			} else {
				int var17 = field411 + 14 - field292;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field625 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method127(field292) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field505 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field505 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field505 + " unread messages";
			}

			arg0.field625 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field332 > 0 && field332 <= field411 + 10) {
				arg0.field625 = "Last password change:\\n@gre@" + method127(field332);
			} else {
				arg0.field625 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field257 > 2 && !field198) {
				arg0.field625 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field257 > 2) {
				arg0.field625 = "\\n\\nYou have @gre@" + field257 + "@yel@ days of\\nmember credit remaining.";
			} else if (field257 > 0) {
				arg0.field625 = "You have @gre@" + field257 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field625 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field257 > 2 && !field198) {
				arg0.field625 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field257 > 0) {
				arg0.field625 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field625 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field292 > field411) {
				arg0.field625 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field625 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method127(int arg0) {
		if (arg0 > field411 + 10) {
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

	@ObfuscatedName("client.f(II)V")
	public final void method128(int arg0) {
		int var2 = VarpType.field1303[arg0].field1311;
		if (var2 != 0) {
			int var3 = field296[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					Pix3D.method553(0.9D);
				}

				if (var3 == 2) {
					Pix3D.method553(0.8D);
				}

				if (var3 == 3) {
					Pix3D.method553(0.7D);
				}

				if (var3 == 4) {
					Pix3D.method553(0.6D);
				}

				ObjType.field729.method460();
				field303 = true;
			}

			if (var2 == 3) {
				boolean var4 = field498;

				if (var3 == 0) {
					method122(field498, 0);
					field498 = true;
				}

				if (var3 == 1) {
					method122(field498, -400);
					field498 = true;
				}

				if (var3 == 2) {
					method122(field498, -800);
					field498 = true;
				}

				if (var3 == 3) {
					method122(field498, -1200);
					field498 = true;
				}

				if (var3 == 4) {
					field498 = false;
				}

				if (field498 != var4 && !field199) {
					if (field498) {
						field502 = field555;
						field503 = true;
						field521.method586(2, field502);
					} else {
						method70();
					}

					field375 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field531 = true;
					method78(0);
				}

				if (var3 == 1) {
					field531 = true;
					method78(-400);
				}

				if (var3 == 2) {
					field531 = true;
					method78(-800);
				}

				if (var3 == 3) {
					field531 = true;
					method78(-1200);
				}

				if (var3 == 4) {
					field531 = false;
				}
			}

			if (var2 == 5) {
				field530 = var3;
			}

			if (var2 == 6) {
				field263 = var3;
			}

			if (var2 == 8) {
				field458 = var3;
				field473 = true;
			}

			if (var2 == 9) {
				field223 = var3;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method129(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method130() {
		field478 = 0;
		int var1 = (field408.field1006 >> 7) + field297;
		int var2 = (field408.field1007 >> 7) + field298;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field478 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field478 = 1;
		}

		if (field478 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field478 = 0;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method131() {
		int var1 = field314.method246("Choose Option");
		for (int var2 = 0; var2 < field422; var2++) {
			int var3 = field314.method246(field423[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field422 * 15 + 21;
		if (field844 > 4 && field845 > 4 && field844 < 516 && field845 < 338) {
			int var5 = field844 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field845 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field318 = true;
			field534 = 0;
			field535 = var5;
			field536 = var6;
			field537 = var1;
			field538 = field422 * 15 + 22;
		}

		if (field844 > 553 && field845 > 205 && field844 < 743 && field845 < 466) {
			int var7 = field844 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field845 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field318 = true;
			field534 = 1;
			field535 = var7;
			field536 = var8;
			field537 = var1;
			field538 = field422 * 15 + 22;
		}

		if (field844 > 17 && field845 > 357 && field844 < 496 && field845 < 453) {
			int var9 = field844 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field845 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field318 = true;
			field534 = 2;
			field535 = var9;
			field536 = var10;
			field537 = var1;
			field538 = field422 * 15 + 22;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method132() {
		method97();

		if (field284 == 1) {
			field176[field283 / 100].method195(field282 - 8 - 4, field281 - 8 - 4);
		}

		if (field284 == 2) {
			field176[field283 / 100 + 4].method195(field282 - 8 - 4, field281 - 8 - 4);
		}

		if (field510 != -1) {
			method110(field220, field510);
			method169(0, 0, Component.method204(field510), 0);
		}

		if (field410 != -1) {
			method110(field220, field410);
			method169(0, 0, Component.method204(field410), 0);
		}

		method130();

		if (!field318) {
			method114();
			method54();
		} else if (field534 == 0) {
			method153();
		}

		if (field547 == 1) {
			field335.method195(296, 472);
		}

		if (field150) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field825 < 30 && field199) {
				var3 = 0xFF0000;
			}

			if (field825 < 20 && !field199) {
				var3 = 0xFF0000;
			}

			field313.method243("Fps:" + field825, var3, var1, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field199) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field199) {
				int var8 = 0xFF0000;
			}

			field313.method243("Mem:" + var5 + "k", 0xFFFF00, var1, var2);
			var2 += 15;
		}

		if (field310 != 0) {
			int var9 = field310 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field313.method248(4, 0xFFFF00, 329, "System update in: " + var10 + ":0" + var9);
			} else {
				field313.method248(4, 0xFFFF00, 329, "System update in: " + var10 + ":" + var9);
			}

			field175++;
			if (field175 > 112) {
				field175 = 0;
				field229.p1isaac(197);
				field229.p4(0);
				return;
			}
		}
	}

	public final void run() {
		if (field544) {
			method36();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method133(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field372[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field173[var6][var4][var5] + field173[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field173[var6][var4][var5 + 1] + field173[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method134() {
		if (field458 != 0) {
			int var1 = 0;
			if (field310 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field528[var2] != null) {
					int var3 = field526[var2];
					String var4 = field527[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field169 == 0 || field169 == 1 && method175(var4))) {
						int var8 = 329 - var1 * 13;
						if (field837 > 4 && field838 - 4 > var8 - 10 && field838 - 4 <= var8 + 3) {
							int var9 = field313.method246("From:  " + var4 + field528[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field837 < var9 + 4) {
								if (field149 >= 1) {
									field423[field422] = "Report abuse @whi@" + var4;
									field246[field422] = 2507;
									field422++;
								}

								field423[field422] = "Add ignore @whi@" + var4;
								field246[field422] = 2574;
								field422++;
								field423[field422] = "Add friend @whi@" + var4;
								field246[field422] = 2762;
								field422++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field169 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method135(int arg0) {
		Component var2 = Component.method204(arg0);
		for (int var3 = 0; var3 < var2.field652.length && var2.field652[var3] != -1; var3++) {
			Component var4 = Component.method204(var2.field652[var3]);
			if (var4.field631 == 1) {
				method135(var4.field610);
			}

			var4.field630 = 0;
			var4.field622 = 0;
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method136(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field528[var4] != null) {
				int var5 = field526[var4];
				int var6 = field133 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field527[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field270 == 0 || field270 == 1 && method175(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field408.field1433)) {
						if (field149 >= 1) {
							field423[field422] = "Report abuse @whi@" + var7;
							field246[field422] = 507;
							field422++;
						}

						field423[field422] = "Add ignore @whi@" + var7;
						field246[field422] = 574;
						field422++;
						field423[field422] = "Add friend @whi@" + var7;
						field246[field422] = 762;
						field422++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field458 == 0 && (var5 == 7 || field169 == 0 || field169 == 1 && method175(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field149 >= 1) {
							field423[field422] = "Report abuse @whi@" + var7;
							field246[field422] = 507;
							field422++;
						}

						field423[field422] = "Add ignore @whi@" + var7;
						field246[field422] = 574;
						field422++;
						field423[field422] = "Add friend @whi@" + var7;
						field246[field422] = 762;
						field422++;
					}

					var3++;
				}

				if (var5 == 4 && (field462 == 0 || field462 == 1 && method175(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field423[field422] = "Accept trade @whi@" + var7;
						field246[field422] = 544;
						field422++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field458 == 0 && field169 < 2) {
					var3++;
				}

				if (var5 == 8 && (field462 == 0 || field462 == 1 && method175(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field423[field422] = "Accept challenge @whi@" + var7;
						field246[field422] = 695;
						field422++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILMFMVIYHT;)V")
	public final void method137(int arg0, Packet arg1) {
		int var3 = arg1.gBit(8);
		if (var3 < field236) {
			for (int var4 = var3; var4 < field236; var4++) {
				field525[field524++] = field237[var4];
			}
		}

		if (var3 > field236) {
			signlink.reporterror(field340 + " Too many players");
			throw new RuntimeException("eek");
		}

		field236 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field237[var5];
			ClientPlayer var7 = field235[var6];
			int var8 = arg1.gBit(1);
			if (var8 == 0) {
				field237[field236++] = var6;
				var7.field981 = field553;
			} else {
				int var9 = arg1.gBit(2);
				if (var9 == 0) {
					field237[field236++] = var6;
					var7.field981 = field553;
					field239[field238++] = var6;
				} else if (var9 == 1) {
					field237[field236++] = var6;
					var7.field981 = field553;
					int var10 = arg1.gBit(3);
					var7.method352(false, var10);
					int var11 = arg1.gBit(1);
					if (var11 == 1) {
						field239[field238++] = var6;
					}
				} else if (var9 == 2) {
					field237[field236++] = var6;
					var7.field981 = field553;
					int var12 = arg1.gBit(3);
					var7.method352(true, var12);
					int var13 = arg1.gBit(3);
					var7.method352(true, var13);
					int var14 = arg1.gBit(1);
					if (var14 == 1) {
						field239[field238++] = var6;
					}
				} else if (var9 == 3) {
					field525[field524++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method138(int arg0) {
		int[] var2 = field369.field599;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field372[arg0][var7][var5] & 0x18) == 0) {
					field405.method309(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field372[arg0 + 1][var7][var5] & 0x8) != 0) {
					field405.method309(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field369.method190();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field372[arg0][var11][var10] & 0x18) == 0) {
					method177(var10, arg0, var11, var9, var8);
				}

				if (arg0 < 3 && (field372[arg0 + 1][var11][var10] & 0x8) != 0) {
					method177(var10, arg0 + 1, var11, var9, var8);
				}
			}
		}

		if (field401 != null) {
			field401.method240();
			Pix3D.field1367 = field267;
		}

		field331++;
		if (field331 > 177) {
			field331 = 0;
			field229.p1isaac(173);
			field229.p3(0x288B80);
		}

		field325 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field405.method303(field339, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LocType.method561(var14).field1421;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field492[field339].field1355;
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

						field509[field325] = field290[var15];
						field326[field325] = var16;
						field327[field325] = var17;
						field325++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method139(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.j(B)I")
	public final int method140() {
		int var1 = 3;
		if (field455 < 310) {
			field243++;
			if (field243 > 1457) {
				field243 = 0;
				field229.p1isaac(244);
				field229.p1(0);
				int var2 = field229.pos;
				field229.p1(219);
				field229.p2(37745);
				field229.p1(61);
				field229.p2(43756);
				field229.p2((int) (Math.random() * 65536.0D));
				field229.p1((int) (Math.random() * 256.0D));
				field229.p2(51171);

				if ((int) (Math.random() * 2.0D) == 0) {
					field229.p2(15808);
				}

				field229.p1(97);
				field229.p1((int) (Math.random() * 256.0D));
				field229.psize1(field229.pos - var2);
			}

			int var3 = field452 >> 7;
			int var4 = field454 >> 7;
			int var5 = field408.field1006 >> 7;
			int var6 = field408.field1007 >> 7;

			if ((field372[field339][var3][var4] & 0x4) != 0) {
				var1 = field339;
			}

			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}

			int var8;
			if (var6 > var4) {
				var8 = var6 - var4;
			} else {
				var8 = var4 - var6;
			}

			if (var7 > var8) {
				int var9 = var8 * 0x10000 / var7;
				int var10 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}

					if ((field372[field339][var3][var4] & 0x4) != 0) {
						var1 = field339;
					}

					var10 += var9;
					if (var10 >= 0x10000) {
						var10 -= 0x10000;

						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}

						if ((field372[field339][var3][var4] & 0x4) != 0) {
							var1 = field339;
						}
					}
				}
			} else {
				int var11 = var7 * 0x10000 / var8;
				int var12 = 32768;
				while (var4 != var6) {
					if (var4 < var6) {
						var4++;
					} else if (var4 > var6) {
						var4--;
					}

					if ((field372[field339][var3][var4] & 0x4) != 0) {
						var1 = field339;
					}

					var12 += var11;
					if (var12 >= 0x10000) {
						var12 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field372[field339][var3][var4] & 0x4) != 0) {
							var1 = field339;
						}
					}
				}
			}
		}

		if ((field372[field339][field408.field1006 >> 7][field408.field1007 >> 7] & 0x4) != 0) {
			var1 = field339;
		}

		return var1;
	}

	@ObfuscatedName("client.E(I)I")
	public final int method141() {
		int var1 = method133(field454, field452, field339);
		if (var1 - field453 < 800 && (field372[field339][field452 >> 7][field454 >> 7] & 0x4) != 0) {
			return field339;
		}

		return 3;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method142(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method142(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method143(boolean arg0) {
		if (field408.field1006 >> 7 == field367 && field408.field1007 >> 7 == field368) {
			field367 = 0;
		}

		int var2 = field236;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			ClientPlayer var4;
			int var5;
			if (arg0) {
				var4 = field408;
				var5 = field234 << 14;
			} else {
				var4 = field235[field237[var3]];
				var5 = field237[var3] << 14;
			}

			if (var4 != null && var4.method351()) {
				var4.field1444 = false;
				if ((field199 && field236 > 50 || field236 > 200) && !arg0 && var4.field984 == var4.field1030) {
					var4.field1444 = true;
				}

				int var6 = var4.field1006 >> 7;
				int var7 = var4.field1007 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1429 == null || field553 < var4.field1445 || field553 >= var4.field1446) {
						if ((var4.field1006 & 0x7F) == 0x40 && (var4.field1007 & 0x7F) == 0x40) {
							if (field168[var6][var7] == field384) {
								continue;
							}

							field168[var6][var7] = field384;
						}

						var4.field1432 = method133(var4.field1007, var4.field1006, field339);
						field405.method285(var5, var4, var4.field1006, var4.field1432, var4.field988, field339, 60, var4.field1007, var4.field1008);
					} else {
						var4.field1444 = false;
						var4.field1432 = method133(var4.field1007, var4.field1006, field339);
						field405.method286(var4.field1432, var4.field1449, 60, var4, var4.field1448, var4.field1007, var4.field1451, var4.field1006, var4.field1008, var4.field1450, field339, var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method144(int arg0) {
		if (arg0 >= 0) {
			int var2 = field244[arg0];
			int var3 = field245[arg0];
			int var4 = field246[arg0];
			int var5 = field247[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field476 != 0 && var4 != 1016) {
				field476 = 0;
				field473 = true;
			}

			if (var4 == 200) {
				ClientPlayer var6 = field235[var5];
				if (var6 != null) {
					method55(false, var6.field983[0], field408.field983[0], 1, 1, 2, 0, var6.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(245);
					field229.p2_alt3(var5);
				}
			}

			if (var4 == 227) {
				field406++;
				if (field406 >= 62) {
					field229.p1isaac(165);
					field229.p1(206);
					field406 = 0;
				}

				field229.p1isaac(228);
				field229.p2_alt1(var2);
				field229.p2_alt2(var5);
				field229.p2(var3);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 876) {
				ClientPlayer var7 = field235[var5];
				if (var7 != null) {
					method55(false, var7.field983[0], field408.field983[0], 1, 1, 2, 0, var7.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(45);
					field229.p2_alt2(var5);
				}
			}

			if (var4 == 921) {
				ClientNpc var8 = field379[var5];
				if (var8 != null) {
					method55(false, var8.field983[0], field408.field983[0], 1, 1, 2, 0, var8.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(67);
					field229.p2_alt2(var5);
				}
			}

			if (var4 == 961) {
				field385 += var5;
				if (field385 >= 115) {
					field229.p1isaac(126);
					field229.p1(125);
					field385 = 0;
				}

				field229.p1isaac(203);
				field229.p2_alt2(var3);
				field229.p2_alt1(var2);
				field229.p2_alt1(var5);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 467 && method102(var3, var2, var5)) {
				field229.p1isaac(152);
				field229.p2_alt1(var5 >> 14 & 0x7FFF);
				field229.p2_alt1(field392);
				field229.p2_alt1(field393);
				field229.p2_alt1(field298 + var3);
				field229.p2(field391);
				field229.p2_alt3(field297 + var2);
			}

			if (var4 == 9) {
				field229.p1isaac(3);
				field229.p2_alt2(var5);
				field229.p2(var3);
				field229.p2(var2);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 553) {
				ClientNpc var9 = field379[var5];
				if (var9 != null) {
					method55(false, var9.field983[0], field408.field983[0], 1, 1, 2, 0, var9.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(42);
					field229.p2_alt1(var5);
				}
			}

			if (var4 == 677) {
				ClientPlayer var10 = field235[var5];
				if (var10 != null) {
					method55(false, var10.field983[0], field408.field983[0], 1, 1, 2, 0, var10.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(116);
					field229.p2_alt1(var5);
				}
			}

			if (var4 == 762 || var4 == 574 || var4 == 775 || var4 == 859) {
				String var11 = field423[arg0];
				int var12 = var11.indexOf("@whi@");
				if (var12 != -1) {
					long var13 = JString.method344(var11.substring(var12 + 5).trim());
					if (var4 == 762) {
						method125(var13);
					}

					if (var4 == 574) {
						method112(var13);
					}

					if (var4 == 775) {
						method73(var13);
					}

					if (var4 == 859) {
						method120(var13);
					}
				}
			}

			if (var4 == 930) {
				boolean var15 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
				if (!var15) {
					method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
				}

				field281 = field844;
				field282 = field845;
				field284 = 2;
				field283 = 0;
				field229.p1isaac(54);
				field229.p2_alt2(var5);
				field229.p2_alt1(field298 + var3);
				field229.p2(field297 + var2);
			}

			if (var4 == 399) {
				field229.p1isaac(24);
				field229.p2_alt1(var3);
				field229.p2_alt1(var5);
				field229.p2_alt2(var2);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 347) {
				ClientNpc var17 = field379[var5];
				if (var17 != null) {
					method55(false, var17.field983[0], field408.field983[0], 1, 1, 2, 0, var17.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(57);
					field229.p2(var5);
					field229.p2_alt1(field393);
					field229.p2_alt3(field392);
					field229.p2(field391);
				}
			}

			if (var4 == 890) {
				field229.p1isaac(79);
				field229.p2(var3);
				Component var18 = Component.method204(var3);
				if (var18.field629 != null && var18.field629[0][0] == 5) {
					int var19 = var18.field629[0][1];
					field296[var19] = 1 - field296[var19];
					method128(var19);
					field420 = true;
				}
			}

			if (var4 == 493) {
				ClientPlayer var20 = field235[var5];
				if (var20 != null) {
					method55(false, var20.field983[0], field408.field983[0], 1, 1, 2, 0, var20.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(233);
					field229.p2_alt2(var5);
				}
			}

			if (var4 == 14) {
				if (field318) {
					field405.method312(var2 - 4, var3 - 4);
				} else {
					field405.method312(field844 - 4, field845 - 4);
				}
			}

			if (var4 == 903) {
				field229.p1isaac(1);
				field229.p2(var5);
				field229.p2_alt1(field391);
				field229.p2_alt1(field393);
				field229.p2_alt3(field392);
				field229.p2_alt2(var2);
				field229.p2_alt2(var3);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 361) {
				field229.p1isaac(36);
				field229.p2(field413);
				field229.p2_alt2(var3);
				field229.p2_alt2(var2);
				field229.p2_alt2(var5);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 118) {
				ClientNpc var21 = field379[var5];
				if (var21 != null) {
					method55(false, var21.field983[0], field408.field983[0], 1, 1, 2, 0, var21.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field469 += var5;
					if (field469 >= 143) {
						field229.p1isaac(157);
						field229.p4(0);
						field469 = 0;
					}

					field229.p1isaac(13);
					field229.p2_alt3(var5);
				}
			}

			if (var4 == 376 && method102(var3, var2, var5)) {
				field229.p1isaac(210);
				field229.p2(field413);
				field229.p2_alt1(var5 >> 14 & 0x7FFF);
				field229.p2_alt2(field297 + var2);
				field229.p2_alt1(field298 + var3);
			}

			if (var4 == 432) {
				ClientNpc var22 = field379[var5];
				if (var22 != null) {
					method55(false, var22.field983[0], field408.field983[0], 1, 1, 2, 0, var22.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(8);
					field229.p2_alt1(var5);
				}
			}

			if (var4 == 639) {
				method34();
			}

			if (var4 == 918) {
				ClientPlayer var23 = field235[var5];
				if (var23 != null) {
					method55(false, var23.field983[0], field408.field983[0], 1, 1, 2, 0, var23.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(31);
					field229.p2(var5);
					field229.p2_alt1(field413);
				}
			}

			if (var4 == 67) {
				ClientNpc var24 = field379[var5];
				if (var24 != null) {
					method55(false, var24.field983[0], field408.field983[0], 1, 1, 2, 0, var24.field982[0], 0, 0, field408.field982[0]);
					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(104);
					field229.p2_alt2(field413);
					field229.p2_alt1(var5);
				}
			}

			if (var4 == 68) {
				boolean var25 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
				if (!var25) {
					method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
				}

				field281 = field844;
				field282 = field845;
				field284 = 2;
				field283 = 0;
				field229.p1isaac(77);
				field229.p2_alt2(field297 + var2);
				field229.p2(field298 + var3);
				field229.p2_alt3(var5);
			}

			if (var4 == 684) {
				boolean var27 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
				if (!var27) {
					method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
				}

				field281 = field844;
				field282 = field845;
				field284 = 2;
				field283 = 0;

				if ((var5 & 0x3) == 0) {
					field307++;
				}

				if (field307 >= 84) {
					field229.p1isaac(222);
					field229.p3(0xABC842);
					field307 = 0;
				}

				field229.p1isaac(71);
				field229.p2_alt3(var5);
				field229.p2_alt3(field297 + var2);
				field229.p2_alt2(field298 + var3);
			}

			if (var4 == 544 || var4 == 695) {
				String var29 = field423[arg0];
				int var30 = var29.indexOf("@whi@");
				if (var30 != -1) {
					var29 = var29.substring(var30 + 5).trim();
					String var31 = JString.method348(JString.method345(JString.method344(var29)));
					boolean var32 = false;
					for (int var33 = 0; var33 < field236; var33++) {
						ClientPlayer var34 = field235[field237[var33]];
						if (var34 != null && var34.field1433 != null && var34.field1433.equalsIgnoreCase(var31)) {
							method55(false, var34.field983[0], field408.field983[0], 1, 1, 2, 0, var34.field982[0], 0, 0, field408.field982[0]);

							if (var4 == 544) {
								field229.p1isaac(116);
								field229.p2_alt1(field237[var33]);
							}

							if (var4 == 695) {
								field229.p1isaac(245);
								field229.p2_alt3(field237[var33]);
							}

							var32 = true;
							break;
						}
					}

					if (!var32) {
						method67("", "Unable to find " + var31, 0);
					}
				}
			}

			if (var4 == 225) {
				field229.p1isaac(177);
				field229.p2_alt2(var2);
				field229.p2_alt1(var5);
				field229.p2_alt1(var3);
				field556 = 0;
				field557 = var3;
				field558 = var2;
				field559 = 2;
				if (Component.method204(var3).field643 == field410) {
					field559 = 1;
				}

				if (Component.method204(var3).field643 == field253) {
					field559 = 3;
				}
			}

			if (var4 == 70) {
				Component var35 = Component.method204(var3);
				field412 = 1;
				field413 = var3;
				field414 = var35.field617;
				field390 = 0;
				field420 = true;
				String var36 = var35.field670;
				if (var36.indexOf(" ") != -1) {
					var36 = var36.substring(0, var36.indexOf(" "));
				}

				String var37 = var35.field670;
				if (var37.indexOf(" ") != -1) {
					var37 = var37.substring(var37.indexOf(" ") + 1);
				}

				field415 = var36 + " " + var35.field606 + " " + var37;

				if (field414 == 16) {
					field420 = true;
					field515 = 3;
					field219 = true;
				}
			} else {
				if (var4 == 891) {
					field229.p1isaac(4);
					field229.p2_alt1(var2);
					field229.p2_alt3(var5);
					field229.p2_alt3(var3);
					field556 = 0;
					field557 = var3;
					field558 = var2;
					field559 = 2;
					if (Component.method204(var3).field643 == field410) {
						field559 = 1;
					}

					if (Component.method204(var3).field643 == field253) {
						field559 = 3;
					}
				}

				if (var4 == 894) {
					field229.p1isaac(158);
					field229.p2_alt3(var2);
					field229.p2_alt3(var5);
					field229.p2_alt1(var3);
					field556 = 0;
					field557 = var3;
					field558 = var2;
					field559 = 2;
					if (Component.method204(var3).field643 == field410) {
						field559 = 1;
					}

					if (Component.method204(var3).field643 == field253) {
						field559 = 3;
					}
				}

				if (var4 == 1280) {
					method102(var3, var2, var5);
					field229.p1isaac(55);
					field229.p2_alt1(var5 >> 14 & 0x7FFF);
					field229.p2_alt1(field298 + var3);
					field229.p2(field297 + var2);
				}

				if (var4 == 35) {
					method102(var3, var2, var5);
					field229.p1isaac(181);
					field229.p2_alt2(field297 + var2);
					field229.p2_alt1(field298 + var3);
					field229.p2_alt1(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 888) {
					method102(var3, var2, var5);
					field229.p1isaac(50);
					field229.p2_alt2(field298 + var3);
					field229.p2_alt1(var5 >> 14 & 0x7FFF);
					field229.p2_alt3(field297 + var2);
				}

				if (var4 == 324) {
					field229.p1isaac(161);
					field229.p2_alt3(var2);
					field229.p2_alt3(var5);
					field229.p2_alt1(var3);
					field556 = 0;
					field557 = var3;
					field558 = var2;
					field559 = 2;
					if (Component.method204(var3).field643 == field410) {
						field559 = 1;
					}

					if (Component.method204(var3).field643 == field253) {
						field559 = 3;
					}
				}

				if (var4 == 1094) {
					ObjType var38 = ObjType.method221(var5);
					Component var39 = Component.method204(var3);
					String var40;
					if (var39 != null && var39.field619[var2] >= 100000) {
						var40 = var39.field619[var2] + " x " + var38.field712;
					} else if (var38.field711 == null) {
						var40 = "It's a " + var38.field712 + ".";
					} else {
						var40 = new String(var38.field711);
					}

					method67("", var40, 0);
				}

				if (var4 == 352) {
					Component var41 = Component.method204(var3);
					boolean var42 = true;
					if (var41.field637 > 0) {
						var42 = method80(var41);
					}

					if (var42) {
						field229.p1isaac(79);
						field229.p2(var3);
					}
				}

				if (var4 == 1412) {
					int var43 = var5 >> 14 & 0x7FFF;
					LocType var44 = LocType.method561(var43);
					String var45;
					if (var44.field1402 == null) {
						var45 = "It's a " + var44.field1395 + ".";
					} else {
						var45 = new String(var44.field1402);
					}

					method67("", var45, 0);
				}

				if (var4 == 575 && !field472) {
					field229.p1isaac(226);
					field229.p2(var3);
					field472 = true;
				}

				if (var4 == 892) {
					method102(var3, var2, var5);
					field229.p1isaac(136);
					field229.p2(field297 + var2);
					field229.p2_alt1(field298 + var3);
					field229.p2(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 270) {
					boolean var46 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
					if (!var46) {
						method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
					}

					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(230);
					field229.p2_alt1(var5);
					field229.p2_alt2(field297 + var2);
					field229.p2(field298 + var3);
				}

				if (var4 == 596) {
					ClientPlayer var48 = field235[var5];
					if (var48 != null) {
						method55(false, var48.field983[0], field408.field983[0], 1, 1, 2, 0, var48.field982[0], 0, 0, field408.field982[0]);
						field281 = field844;
						field282 = field845;
						field284 = 2;
						field283 = 0;
						field229.p1isaac(143);
						field229.p2_alt1(field393);
						field229.p2_alt3(field391);
						field229.p2(field392);
						field229.p2_alt2(var5);
					}
				}

				if (var4 == 100) {
					boolean var49 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
					if (!var49) {
						method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
					}

					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(211);
					field229.p2_alt3(field391);
					field229.p2_alt2(field393);
					field229.p2_alt3(field298 + var3);
					field229.p2_alt3(field297 + var2);
					field229.p2_alt1(field392);
					field229.p2_alt1(var5);
				}

				if (var4 == 1668) {
					ClientNpc var51 = field379[var5];
					if (var51 != null) {
						NpcType var52 = var51.field1183;
						if (var52.field1231 != null) {
							var52 = var52.method476();
						}

						if (var52 != null) {
							String var53;
							if (var52.field1264 == null) {
								var53 = "It's a " + var52.field1257 + ".";
							} else {
								var53 = new String(var52.field1264);
							}

							method67("", var53, 0);
						}
					}
				}

				if (var4 == 26) {
					boolean var54 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
					if (!var54) {
						method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
					}

					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field348++;
					if (field348 >= 120) {
						field229.p1isaac(95);
						field229.p4(0);
						field348 = 0;
					}

					field229.p1isaac(100);
					field229.p2(field297 + var2);
					field229.p2_alt2(field298 + var3);
					field229.p2_alt3(var5);
				}

				if (var4 == 444) {
					field229.p1isaac(91);
					field229.p2_alt1(var5);
					field229.p2_alt3(var2);
					field229.p2(var3);
					field556 = 0;
					field557 = var3;
					field558 = var2;
					field559 = 2;
					if (Component.method204(var3).field643 == field410) {
						field559 = 1;
					}

					if (Component.method204(var3).field643 == field253) {
						field559 = 3;
					}
				}

				if (var4 == 507) {
					String var56 = field423[arg0];
					int var57 = var56.indexOf("@whi@");
					if (var57 != -1) {
						if (field410 == -1) {
							method34();
							field122 = var56.substring(var57 + 5).trim();
							field346 = false;
							field465 = field410 = Component.field641;
						} else {
							method67("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 389) {
					method102(var3, var2, var5);
					field229.p1isaac(241);
					field229.p2(var5 >> 14 & 0x7FFF);
					field229.p2(field297 + var2);
					field229.p2_alt2(field298 + var3);
				}

				if (var4 == 564) {
					field229.p1isaac(231);
					field229.p2_alt3(var3);
					field229.p2_alt1(var2);
					field229.p2(var5);
					field556 = 0;
					field557 = var3;
					field558 = var2;
					field559 = 2;
					if (Component.method204(var3).field643 == field410) {
						field559 = 1;
					}

					if (Component.method204(var3).field643 == field253) {
						field559 = 3;
					}
				}

				if (var4 == 984) {
					String var58 = field423[arg0];
					int var59 = var58.indexOf("@whi@");
					if (var59 != -1) {
						long var60 = JString.method344(var58.substring(var59 + 5).trim());
						int var62 = -1;
						for (int var63 = 0; var63 < field141; var63++) {
							if (field377[var63] == var60) {
								var62 = var63;
								break;
							}
						}

						if (var62 != -1 && field499[var62] > 0) {
							field473 = true;
							field476 = 0;
							field148 = true;
							field286 = "";
							field457 = 3;
							field386 = field377[var62];
							field207 = "Enter message to send to " + field131[var62];
						}
					}
				}

				if (var4 == 518) {
					field229.p1isaac(79);
					field229.p2(var3);
					Component var64 = Component.method204(var3);
					if (var64.field629 != null && var64.field629[0][0] == 5) {
						int var65 = var64.field629[0][1];
						if (field296[var65] != var64.field651[0]) {
							field296[var65] = var64.field651[0];
							method128(var65);
							field420 = true;
						}
					}
				}

				if (var4 == 318) {
					ClientNpc var66 = field379[var5];
					if (var66 != null) {
						method55(false, var66.field983[0], field408.field983[0], 1, 1, 2, 0, var66.field982[0], 0, 0, field408.field982[0]);
						field281 = field844;
						field282 = field845;
						field284 = 2;
						field283 = 0;
						field229.p1isaac(112);
						field229.p2_alt1(var5);
					}
				}

				if (var4 == 199) {
					boolean var67 = method55(false, var3, field408.field983[0], 0, 0, 2, 0, var2, 0, 0, field408.field982[0]);
					if (!var67) {
						method55(false, var3, field408.field983[0], 1, 1, 2, 0, var2, 0, 0, field408.field982[0]);
					}

					field281 = field844;
					field282 = field845;
					field284 = 2;
					field283 = 0;
					field229.p1isaac(83);
					field229.p2_alt1(var5);
					field229.p2(field298 + var3);
					field229.p2_alt1(field413);
					field229.p2_alt3(field297 + var2);
				}

				if (var4 == 55) {
					method64(field429);
					field429 = -1;
					field473 = true;
				}

				if (var4 == 52) {
					field390 = 1;
					field391 = var2;
					field392 = var3;
					field393 = var5;
					field394 = String.valueOf(ObjType.method221(var5).field712);
					field412 = 0;
					field420 = true;
				} else {
					if (var4 == 1564) {
						ObjType var69 = ObjType.method221(var5);
						String var70;
						if (var69.field711 == null) {
							var70 = "It's a " + var69.field712 + ".";
						} else {
							var70 = new String(var69.field711);
						}

						method67("", var70, 0);
					}

					if (var4 == 408) {
						ClientPlayer var71 = field235[var5];
						if (var71 != null) {
							method55(false, var71.field983[0], field408.field983[0], 1, 1, 2, 0, var71.field982[0], 0, 0, field408.field982[0]);
							field281 = field844;
							field282 = field845;
							field284 = 2;
							field283 = 0;
							field229.p1isaac(194);
							field229.p2_alt1(var5);
						}
					}

					field390 = 0;
					field412 = 0;
					field420 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method145() {
		field208 = 0;
		for (int var1 = -1; var1 < field380 + field236; var1++) {
			ClientEntity var2;
			if (var1 == -1) {
				var2 = field408;
			} else if (var1 < field236) {
				var2 = field235[field237[var1]];
			} else {
				var2 = field379[field381[var1 - field236]];
			}

			if (var2 != null && var2.method351()) {
				if (var2 instanceof ClientNpc) {
					NpcType var3 = ((ClientNpc) var2).field1183;
					if (var3.field1231 != null) {
						var3 = var3.method476();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field236) {
					NpcType var6 = ((ClientNpc) var2).field1183;
					if (var6.field1245 >= 0 && var6.field1245 < field328.length) {
						method161(var2, var2.field990 + 15);

						if (field204 > -1) {
							field328[var6.field1245].method195(field205 - 30, field204 - 12);
						}
					}

					if (field435 == 1 && field381[var1 - field236] == field461 && field553 % 20 < 10) {
						method161(var2, var2.field990 + 15);

						if (field204 > -1) {
							field222[0].method195(field205 - 28, field204 - 12);
						}
					}
				} else {
					int var4 = 30;
					ClientPlayer var5 = (ClientPlayer) var2;
					if (var5.field1438 != -1 || var5.field1430 != -1) {
						method161(var2, var2.field990 + 15);

						if (field204 > -1) {
							if (var5.field1438 != -1) {
								field518[var5.field1438].method195(field205 - var4, field204 - 12);
								var4 += 25;
							}

							if (var5.field1430 != -1) {
								field328[var5.field1430].method195(field205 - var4, field204 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field435 == 10 && field237[var1] == field395) {
						method161(var2, var2.field990 + 15);

						if (field204 > -1) {
							field222[1].method195(field205 - var4, field204 - 12);
						}
					}
				}

				if (var2.field977 != null && (var1 >= field236 || field270 == 0 || field270 == 3 || field270 == 1 && method175(((ClientPlayer) var2).field1433))) {
					method161(var2, var2.field990);

					if (field204 > -1 && field208 < field209) {
						field213[field208] = field314.method247(var2.field977) / 2;
						field212[field208] = field314.field782;
						field210[field208] = field204;
						field211[field208] = field205;
						field214[field208] = var2.field979;
						field215[field208] = var2.field989;
						field216[field208] = var2.field978;
						field217[field208++] = var2.field977;

						if (field263 == 0 && var2.field989 >= 1 && var2.field989 <= 3) {
							field212[field208] += 10;
							field211[field208] += 5;
						}

						if (field263 == 0 && var2.field989 == 4) {
							field213[field208] = 60;
						}

						if (field263 == 0 && var2.field989 == 5) {
							field212[field208] += 5;
						}
					}
				}

				if (var2.field991 > field553) {
					method161(var2, var2.field990 + 15);

					if (field204 > -1) {
						int var7 = var2.field992 * 30 / var2.field993;
						if (var7 > 30) {
							var7 = 30;
						}

						Pix2D.method337(5, field205 - 3, 0xFF00, var7, field204 - 15);
						Pix2D.method337(5, field205 - 3, 0xFF0000, 30 - var7, field204 - 15 + var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1028[var8] > field553) {
						method161(var2, var2.field990 / 2);

						if (field204 > -1) {
							if (var8 == 1) {
								field205 -= 20;
							}

							if (var8 == 2) {
								field204 -= 15;
								field205 -= 10;
							}

							if (var8 == 3) {
								field204 += 15;
								field205 -= 10;
							}

							field421[var2.field1027[var8]].method195(field205 - 12, field204 - 12);
							field312.method244(field204, field205 + 4, 0, String.valueOf(var2.field1026[var8]));
							field312.method244(field204 - 1, field205 + 3, 0xFFFFFF, String.valueOf(var2.field1026[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field208; var9++) {
			int var10 = field210[var9];
			int var11 = field211[var9];
			int var12 = field213[var9];
			int var13 = field212[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field211[var15] - field212[var15] && var11 - var13 < field211[var15] + 2 && var10 - var12 < field213[var15] + field210[var15] && var10 + var12 > field210[var15] - field213[var15] && field211[var15] - field212[var15] < var11) {
						var11 = field211[var15] - field212[var15];
						var14 = true;
					}
				}
			}

			field204 = field210[var9];
			field205 = field211[var9] = var11;
			String var16 = field217[var9];
			if (field263 == 0) {
				int var17 = 0xFFFF00;
				if (field214[var9] < 6) {
					var17 = field124[field214[var9]];
				}

				if (field214[var9] == 6) {
					var17 = field384 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field214[var9] == 7) {
					var17 = field384 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field214[var9] == 8) {
					var17 = field384 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field214[var9] == 9) {
					int var18 = 150 - field216[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field214[var9] == 10) {
					int var19 = 150 - field216[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field214[var9] == 11) {
					int var20 = 150 - field216[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field215[var9] == 0) {
					field314.method244(field204, field205 + 1, 0, var16);
					field314.method244(field204, field205, var17, var16);
				}

				if (field215[var9] == 1) {
					field314.method249(field205 + 1, field384, var16, field204, 0);
					field314.method249(field205, field384, var16, field204, var17);
				}

				if (field215[var9] == 2) {
					field314.method250(field205 + 1, 0, var16, field204, field384);
					field314.method250(field205, var17, var16, field204, field384);
				}

				if (field215[var9] == 3) {
					field314.method251(var16, 0, field204, field205 + 1, 150 - field216[var9], field384);
					field314.method251(var16, var17, field204, field205, 150 - field216[var9], field384);
				}

				if (field215[var9] == 4) {
					int var21 = field314.method247(var16);
					int var22 = (150 - field216[var9]) * (var21 + 100) / 150;
					Pix2D.method334(0, field204 - 50, 334, field204 + 50);
					field314.method248(field204 + 50 - var22, 0, field205 + 1, var16);
					field314.method248(field204 + 50 - var22, var17, field205, var16);
					Pix2D.method333();
				}

				if (field215[var9] == 5) {
					int var23 = 150 - field216[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					Pix2D.method334(field205 - field314.field782 - 1, 0, field205 + 5, 512);
					field314.method244(field204, field205 + var24 + 1, 0, var16);
					field314.method244(field204, field205 + var24, var17, var16);
					Pix2D.method333();
				}
			} else {
				field314.method244(field204, field205 + 1, 0, var16);
				field314.method244(field204, field205, 0xFFFF00, var16);
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method146() {
		if (field402 == null) {
			method168();
			field830 = null;
			field436 = null;
			field437 = null;
			field438 = null;
			field439 = null;
			field440 = null;
			field441 = null;
			field442 = null;
			field443 = null;
			field444 = null;
			field402 = new PixMap(96, method164(), 479);
			field400 = new PixMap(156, method164(), 172);
			Pix2D.method335();
			field425.method492(0, 0);
			field399 = new PixMap(261, method164(), 190);
			field401 = new PixMap(334, method164(), 512);
			Pix2D.method335();
			field356 = new PixMap(50, method164(), 496);
			field357 = new PixMap(37, method164(), 269);
			field358 = new PixMap(45, method164(), 249);
			field303 = true;
			field401.method240();
			Pix3D.field1367 = field267;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method147() {
		Graphics var1 = method164().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method269(1);

		if (field513) {
			field475 = false;
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

		if (field345) {
			field475 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field277) {
			field475 = false;
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

	@ObfuscatedName("client.n(Z)V")
	public final void method148() {
		try {
			if (field285 != null) {
				field285.method233();
			}
		} catch (Exception var2) {
		}

		field285 = null;
		field383 = false;
		field460 = 0;
		field340 = "";
		field341 = "";
		method69();
		field405.method274();

		for (int var1 = 0; var1 < 4; var1++) {
			field492[var1].method532();
		}

		System.gc();
		method70();
		field555 = -1;
		field502 = -1;
		field375 = 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;)V")
	public final void method149(String arg0, String arg1) {
		if (field401 != null) {
			field401.method240();
			Pix3D.field1367 = field267;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field313.method244(257, var3, 0, arg1);
			field313.method244(256, var3 - 1, 0xFFFFFF, arg1);
			var3 += 15;
			if (arg0 != null) {
				field313.method244(257, var3, 0, arg0);
				field313.method244(256, var3 - 1, 0xFFFFFF, arg0);
			}

			field401.method241(4, 4, field829);
		} else if (field830 != null) {
			field830.method240();
			Pix3D.field1367 = field268;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			Pix2D.method337(var6, var4 - var6 / 2 - 5, 0, var5, 383 - var5 / 2);
			Pix2D.method338(var4 - var6 / 2 - 5, var6, 0xFFFFFF, 383 - var5 / 2, var5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field313.method244(383, var4, 0, arg1);
			field313.method244(382, var4 - 1, 0xFFFFFF, arg1);
			var4 += 15;
			if (arg0 != null) {
				field313.method244(383, var4, 0, arg0);
				field313.method244(382, var4 - 1, 0xFFFFFF, arg0);
			}

			field830.method241(0, 0, field829);
		}
	}

	@ObfuscatedName("client.b(IB)Z")
	public final boolean method150(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field246[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 762) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method151() {
		if (field435 == 2) {
			method162((field126 - field297 << 7) + field129, field128 * 2, (field127 - field298 << 7) + field130);

			if (field204 > -1 && field553 % 20 < 10) {
				field222[0].method195(field205 - 28, field204 - 12);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method152() {
		if (field277 || field513 || field345) {
			method147();
		} else {
			field539++;

			if (field383) {
				method96();
			} else {
				method156(false);
			}

			field342 = 0;
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method153() {
		int var1 = field535;
		int var2 = field536;
		int var3 = field537;
		int var4 = field538;
		int var5 = 0x5D5447;
		Pix2D.method337(var4, var2, var5, var3, var1);
		Pix2D.method337(16, var2 + 1, 0, var3 - 2, var1 + 1);
		Pix2D.method338(var2 + 18, var4 - 19, 0, var1 + 1, var3 - 2);
		field314.method248(var1 + 3, var5, var2 + 14, "Choose Option");
		int var6 = field837;
		int var7 = field838;
		if (field534 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field534 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field534 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field422; var8++) {
			int var9 = (field422 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field314.method252(var10, var1 + 3, var9, true, field423[var8]);
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;)I")
	public final int method154(int arg0, Component arg1) {
		if (arg1.field629 == null || arg0 >= arg1.field629.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field629[arg0];
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
					var8 = field288[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field309[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field125[var3[var5++]];
				}

				if (var7 == 4) {
					Component var10 = Component.method204(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ObjType.field718 && (!ObjType.method221(var11).field755 || field198)) {
						for (int var12 = 0; var12 < var10.field663.length; var12++) {
							if (var11 + 1 == var10.field663[var12]) {
								var8 += var10.field619[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field296[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field221[field309[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field296[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field408.field1435;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < Stats.field1299; var13++) {
						if (Stats.field1301[var13]) {
							var8 += field309[var13];
						}
					}
				}

				if (var7 == 10) {
					Component var14 = Component.method204(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ObjType.field718 && (!ObjType.method221(var15).field755 || field198)) {
						for (int var16 = 0; var16 < var14.field663.length; var16++) {
							if (var14.field663[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field552;
				}

				if (var7 == 12) {
					var8 = field289;
				}

				if (var7 == 13) {
					int var17 = field296[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					VarbitType var20 = VarbitType.field1502[var19];
					int var21 = var20.field1504;
					int var22 = var20.field1505;
					int var23 = var20.field1506;
					int var24 = field450[var23 - var22];
					var8 = field296[var21] >> var22 & var24;
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
					var8 = (field408.field1006 >> 7) + field297;
				}

				if (var7 == 19) {
					var8 = (field408.field1007 >> 7) + field298;
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

	@ObfuscatedName("client.a(IZLEPQDEJTO;I)V")
	public final void method155(int arg0, Pix32 arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field484 + field193 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = Model.field1100[var4];
				int var7 = Model.field1101[var4];
				var6 = var6 * 256 / (field467 + 256);
				var7 = var7 * 256 / (field467 + 256);
				int var8 = arg0 * var6 + arg2 * var7 >> 16;
				int var9 = arg0 * var7 - arg2 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method201(field425, 83 - var9 - arg1.field605 / 2 - 4, var8 + 94 - arg1.field604 / 2 + 4);
				} else {
					arg1.method195(83 - var9 - arg1.field605 / 2 - 4, var8 + 94 - arg1.field604 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method156(boolean arg0) {
		method85();
		field438.method240();
		field522.method492(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field460 == 0) {
			int var4 = var3 / 2 + 80;
			field312.method245(true, 0x75A9A9, var4, var2 / 2, field521.field1474);
			int var5 = var3 / 2 - 20;
			field314.method245(true, 0xFFFF00, var5, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field523.method492(var7 - 20, var6 - 73);
			field314.method245(true, 0xFFFFFF, var7 + 5, var6, "New User");
			int var8 = var2 / 2 + 80;
			field523.method492(var7 - 20, var8 - 73);
			field314.method245(true, 0xFFFFFF, var7 + 5, var8, "Existing User");
		}

		if (field460 == 2) {
			int var9 = var3 / 2 - 40;
			if (field224.length() > 0) {
				field314.method245(true, 0xFFFF00, var9 - 15, var2 / 2, field224);
				field314.method245(true, 0xFFFF00, var9, var2 / 2, field225);
				var9 += 30;
			} else {
				field314.method245(true, 0xFFFF00, var9 - 7, var2 / 2, field225);
				var9 += 30;
			}

			field314.method252(0xFFFFFF, var2 / 2 - 90, var9, true, "Username: " + field340 + (field242 == 0 & field553 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field314.method252(0xFFFFFF, var2 / 2 - 88, var9, true, "Password: " + JString.method349(field341) + (field242 == 1 & field553 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field523.method492(var11 - 20, var10 - 73);
				field314.method245(true, 0xFFFFFF, var11 + 5, var10, "Login");
				int var12 = var2 / 2 + 80;
				field523.method492(var11 - 20, var12 - 73);
				field314.method245(true, 0xFFFFFF, var11 + 5, var12, "Cancel");
			}
		}

		if (field460 == 3) {
			field314.method245(true, 0xFFFF00, var3 / 2 - 60, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field314.method245(true, 0xFFFFFF, var13, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field314.method245(true, 0xFFFFFF, var13, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field314.method245(true, 0xFFFFFF, var13, var2 / 2, "and choose the 'create account'");
			var13 += 15;
			field314.method245(true, 0xFFFFFF, var13, var2 / 2, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field523.method492(var15 - 20, var14 - 73);
			field314.method245(true, 0xFFFFFF, var15 + 5, var14, "Cancel");
		}

		field438.method241(171, 202, field829);

		if (field303) {
			field303 = false;
			field436.method241(0, 128, field829);
			field437.method241(371, 202, field829);
			field441.method241(265, 0, field829);
			field442.method241(265, 562, field829);
			field443.method241(171, 128, field829);
			field444.method241(171, 562, field829);
		}
	}

	@ObfuscatedName("client.a(LMFMVIYHT;IZ)V")
	public final void method157(Packet arg0, int arg1) {
		while (arg0.field1106 + 21 < arg1 * 8) {
			int var3 = arg0.gBit(14);
			if (var3 == 16383) {
				break;
			}

			if (field379[var3] == null) {
				field379[var3] = new ClientNpc();
			}

			ClientNpc var4 = field379[var3];
			field381[field380++] = var3;
			var4.field981 = field553;
			int var5 = arg0.gBit(1);
			if (var5 == 1) {
				field239[field238++] = var3;
			}

			int var6 = arg0.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.gBit(1);
			var4.field1183 = NpcType.method477(arg0.gBit(13));
			var4.field997 = var4.field1183.field1248;
			var4.field996 = var4.field1183.field1256;
			var4.field1015 = var4.field1183.field1251;
			var4.field1016 = var4.field1183.field1249;
			var4.field1017 = var4.field1183.field1247;
			var4.field1018 = var4.field1183.field1240;
			var4.field1030 = var4.field1183.field1230;
			var4.method354(field408.field983[0] + var6, var8 == 1, field408.field982[0] + var7);
		}

		arg0.accessBytes();
	}

	@ObfuscatedName("client.b(LMFMVIYHT;II)V")
	public final void method158(Packet arg0, int arg1) {
		if (arg1 == 203) {
			int var3 = arg0.g2();
			int var4 = arg0.g1();
			int var5 = var4 >> 2;
			int var6 = var4 & 0x3;
			int var7 = field291[var5];
			byte var8 = arg0.g1b_alt2();
			int var9 = arg0.g1_alt1();
			int var10 = (var9 >> 4 & 0x7) + field254;
			int var11 = (var9 & 0x7) + field255;
			byte var12 = arg0.g1b_alt1();
			int var13 = arg0.g2_alt2();
			int var14 = arg0.g2_alt1();
			byte var15 = arg0.g1b();
			byte var16 = arg0.g1b_alt1();
			int var17 = arg0.g2();
			ClientPlayer var18;
			if (field227 == var14) {
				var18 = field408;
			} else {
				var18 = field235[var14];
			}

			if (var18 != null) {
				LocType var19 = LocType.method561(var3);
				int var20 = field173[field339][var10][var11];
				int var21 = field173[field339][var10 + 1][var11];
				int var22 = field173[field339][var10 + 1][var11 + 1];
				int var23 = field173[field339][var10][var11 + 1];
				Model var24 = var19.method569(var5, var6, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method172(field339, var10, 0, var13 + 1, 0, -1, var17 + 1, var7, var11);
					var18.field1445 = field553 + var17;
					var18.field1446 = field553 + var13;
					var18.field1429 = var24;
					int var25 = var19.field1416;
					int var26 = var19.field1394;
					if (var6 == 1 || var6 == 3) {
						var25 = var19.field1394;
						var26 = var19.field1416;
					}

					var18.field1426 = var10 * 128 + var25 * 64;
					var18.field1428 = var11 * 128 + var26 * 64;
					var18.field1427 = method133(var18.field1428, var18.field1426, field339);

					if (var12 > var8) {
						byte var27 = var12;
						var12 = var8;
						var8 = var27;
					}

					if (var16 > var15) {
						byte var28 = var16;
						var16 = var15;
						var15 = var28;
					}

					var18.field1448 = var10 + var12;
					var18.field1450 = var8 + var10;
					var18.field1449 = var11 + var16;
					var18.field1451 = var11 + var15;
				}
			}
		}

		if (arg1 == 106) {
			int var29 = arg0.g1_alt1();
			int var30 = (var29 >> 4 & 0x7) + field254;
			int var31 = (var29 & 0x7) + field255;
			int var32 = arg0.g2_alt3();
			int var33 = arg0.g2_alt2();
			int var34 = arg0.g2_alt2();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && field227 != var34) {
				ClientObj var35 = new ClientObj();
				var35.field767 = var33;
				var35.field768 = var32;

				if (field551[field339][var30][var31] == null) {
					field551[field339][var30][var31] = new LinkList();
				}

				field551[field339][var30][var31].method3(var35);
				method46(var30, var31);
			}
		} else if (arg1 == 142) {
			int var36 = arg0.g2();
			int var37 = arg0.g1_alt1();
			int var38 = var37 >> 2;
			int var39 = var37 & 0x3;
			int var40 = field291[var38];
			int var41 = arg0.g1();
			int var42 = (var41 >> 4 & 0x7) + field254;
			int var43 = (var41 & 0x7) + field255;
			if (var42 >= 0 && var43 >= 0 && var42 < 103 && var43 < 103) {
				int var44 = field173[field339][var42][var43];
				int var45 = field173[field339][var42 + 1][var43];
				int var46 = field173[field339][var42 + 1][var43 + 1];
				int var47 = field173[field339][var42][var43 + 1];
				if (var40 == 0) {
					Wall var48 = field405.method296(field339, var42, var43);
					if (var48 != null) {
						int var49 = var48.field1334 >> 14 & 0x7FFF;
						if (var38 == 2) {
							var48.field1332 = new ClientLocAnim(var36, var46, var47, var45, 2, var49, false, var44, var39 + 4);
							var48.field1333 = new ClientLocAnim(var36, var46, var47, var45, 2, var49, false, var44, var39 + 1 & 0x3);
						} else {
							var48.field1332 = new ClientLocAnim(var36, var46, var47, var45, var38, var49, false, var44, var39);
						}
					}
				}

				if (var40 == 1) {
					Decor var50 = field405.method297(field339, var43, var42);
					if (var50 != null) {
						var50.field1219 = new ClientLocAnim(var36, var46, var47, var45, 4, var50.field1220 >> 14 & 0x7FFF, false, var44, 0);
					}
				}

				if (var40 == 2) {
					Sprite var51 = field405.method298(var42, var43, field339);

					if (var38 == 11) {
						var38 = 10;
					}

					if (var51 != null) {
						var51.field77 = new ClientLocAnim(var36, var46, var47, var45, var38, var51.field85 >> 14 & 0x7FFF, false, var44, var39);
					}
				}

				if (var40 == 3) {
					GroundDecor var52 = field405.method299(field339, var43, var42);
					if (var52 != null) {
						var52.field1134 = new ClientLocAnim(var36, var46, var47, var45, 22, var52.field1135 >> 14 & 0x7FFF, false, var44, var39);
					}
				}
			}
		} else if (arg1 == 107) {
			int var53 = arg0.g2();
			int var54 = arg0.g1_alt2();
			int var55 = (var54 >> 4 & 0x7) + field254;
			int var56 = (var54 & 0x7) + field255;
			int var57 = arg0.g2_alt2();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				ClientObj var58 = new ClientObj();
				var58.field767 = var53;
				var58.field768 = var57;

				if (field551[field339][var55][var56] == null) {
					field551[field339][var55][var56] = new LinkList();
				}

				field551[field339][var55][var56].method3(var58);
				method46(var55, var56);
			}
		} else if (arg1 == 121) {
			int var59 = arg0.g1();
			int var60 = (var59 >> 4 & 0x7) + field254;
			int var61 = (var59 & 0x7) + field255;
			int var62 = arg0.g2();
			int var63 = arg0.g2();
			int var64 = arg0.g2();
			if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
				LinkList var65 = field551[field339][var60][var61];
				if (var65 != null) {
					for (ClientObj var66 = (ClientObj) var65.method6(); var66 != null; var66 = (ClientObj) var65.method8()) {
						if ((var62 & 0x7FFF) == var66.field767 && var66.field768 == var63) {
							var66.field768 = var64;
							break;
						}
					}

					method46(var60, var61);
				}
			}
		} else if (arg1 == 181) {
			int var67 = arg0.g1();
			int var68 = (var67 >> 4 & 0x7) + field254;
			int var69 = (var67 & 0x7) + field255;
			int var70 = var68 + arg0.g1b();
			int var71 = var69 + arg0.g1b();
			int var72 = arg0.g2b();
			int var73 = arg0.g2();
			int var74 = arg0.g1() * 4;
			int var75 = arg0.g1() * 4;
			int var76 = arg0.g2();
			int var77 = arg0.g2();
			int var78 = arg0.g1();
			int var79 = arg0.g1();
			if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 0xFFFF) {
				var68 = var68 * 128 + 64;
				var69 = var69 * 128 + 64;
				var70 = var70 * 128 + 64;
				var71 = var71 * 128 + 64;
				ClientProj var80 = new ClientProj(field339, var75, var79, var69, var73, field553 + var77, var78, var72, method133(var69, var68, field339) - var74, var68, field553 + var76);
				var80.method271(var70, var71, method133(var71, var70, field339) - var75, field553 + var76);
				field512.method3(var80);
			}
		} else {
			if (arg1 == 41) {
				int var81 = arg0.g1();
				int var82 = (var81 >> 4 & 0x7) + field254;
				int var83 = (var81 & 0x7) + field255;
				int var84 = arg0.g2();
				int var85 = arg0.g1();
				int var86 = var85 >> 4 & 0xF;
				int var87 = var85 & 0x7;
				if (field408.field982[0] >= var82 - var86 && field408.field982[0] <= var82 + var86 && field408.field983[0] >= var83 - var86 && field408.field983[0] <= var83 + var86 && field531 && !field199 && field293 < 50) {
					field338[field293] = var84;
					field549[field293] = var87;
					field491[field293] = Wave.field1268[var84];
					field293++;
				}
			}

			if (arg1 == 59) {
				int var88 = arg0.g1();
				int var89 = (var88 >> 4 & 0x7) + field254;
				int var90 = (var88 & 0x7) + field255;
				int var91 = arg0.g2();
				int var92 = arg0.g1();
				int var93 = arg0.g2();
				if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
					var89 = var89 * 128 + 64;
					var90 = var90 * 128 + 64;
					MapSpotAnim var94 = new MapSpotAnim(var89, field339, method133(var90, var89, field339) - var92, var93, var91, field553, var90);
					field446.method3(var94);
				}
			} else if (arg1 == 152) {
				int var95 = arg0.g1_alt2();
				int var96 = var95 >> 2;
				int var97 = var95 & 0x3;
				int var98 = field291[var96];
				int var99 = arg0.g2_alt3();
				int var100 = arg0.g1_alt1();
				int var101 = (var100 >> 4 & 0x7) + field254;
				int var102 = (var100 & 0x7) + field255;
				if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
					method172(field339, var101, var97, -1, var96, var99, 0, var98, var102);
				}
			} else if (arg1 == 208) {
				int var103 = arg0.g2_alt2();
				int var104 = arg0.g1_alt1();
				int var105 = (var104 >> 4 & 0x7) + field254;
				int var106 = (var104 & 0x7) + field255;
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
					LinkList var107 = field551[field339][var105][var106];
					if (var107 != null) {
						for (ClientObj var108 = (ClientObj) var107.method6(); var108 != null; var108 = (ClientObj) var107.method8()) {
							if ((var103 & 0x7FFF) == var108.field767) {
								var108.method604();
								break;
							}
						}

						if (var107.method6() == null) {
							field551[field339][var105][var106] = null;
						}

						method46(var105, var106);
					}
				}
			} else if (arg1 == 88) {
				int var109 = arg0.g1_alt3();
				int var110 = (var109 >> 4 & 0x7) + field254;
				int var111 = (var109 & 0x7) + field255;
				int var112 = arg0.g1_alt3();
				int var113 = var112 >> 2;
				int var114 = var112 & 0x3;
				int var115 = field291[var113];
				if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
					method172(field339, var110, var114, -1, var113, -1, 0, var115, var111);
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method159() {
		field399.method240();
		Pix3D.field1367 = field266;
		field424.method492(0, 0);

		if (field337 != -1) {
			method169(0, 0, Component.method204(field337), 0);
		} else if (field330[field515] != -1) {
			method169(0, 0, Component.method204(field330[field515]), 0);
		}

		if (field318 && field534 == 1) {
			method153();
		}

		field399.method241(205, 553, field829);
		field401.method240();
		Pix3D.field1367 = field267;
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
	public static final String method160(int arg0) {
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

	@ObfuscatedName("client.a(LLRUWCBNN;ZI)V")
	public final void method161(ClientEntity arg0, int arg1) {
		method162(arg0.field1006, arg1, arg0.field1007);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method162(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method133(arg2, arg0, field339) - arg1;
			arg0 -= field452;
			var4 -= field453;
			arg2 -= field454;
			int var5 = Model.field1100[field455];
			int var6 = Model.field1101[field455];
			int var7 = Model.field1100[field456];
			int var8 = Model.field1101[field456];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field204 = (var9 << 9) / arg2 + Pix3D.field1361;
				field205 = (var11 << 9) / arg2 + Pix3D.field1362;
			} else {
				field204 = -1;
				field205 = -1;
			}
		} else {
			field204 = -1;
			field205 = -1;
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public void method163() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field349);

		if (field521 != null) {
			System.out.println("Od-cycle:" + field521.field1475);
		}

		System.out.println("loop-cycle:" + field553);
		System.out.println("draw-cycle:" + field539);
		System.out.println("ptype:" + field152);
		System.out.println("psize:" + field151);

		if (field285 != null) {
			field285.method238();
		}

		field826 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final java.awt.Component method164() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field832 != null) {
			return field832;
		}

		return this;
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;)V")
	public final void method165(int arg0, String arg1) {
		field550 = arg0;
		field287 = arg1;
		method85();

		if (field170 == null) {
			super.method165(arg0, arg1);
		} else {
			field438.method240();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field314.method244(var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			Pix2D.method338(var6, 34, 0x8C1111, var3 / 2 - 152, 304);
			Pix2D.method338(var6 + 1, 32, 0, var3 / 2 - 151, 302);
			Pix2D.method337(30, var6 + 2, 0x8C1111, arg0 * 3, var3 / 2 - 150);
			Pix2D.method337(30, var6 + 2, 0, 300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150));
			field314.method244(var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF, arg1);
			field438.method241(171, 202, field829);

			if (field303) {
				field303 = false;

				if (!field475) {
					field439.method241(0, 0, field829);
					field440.method241(0, 637, field829);
				}

				field436.method241(0, 128, field829);
				field437.method241(371, 202, field829);
				field441.method241(265, 0, field829);
				field442.method241(265, 562, field829);
				field443.method241(171, 128, field829);
				field444.method241(171, 562, field829);
			}
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method166() {
		byte[] var1 = field170.method2("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		field439.method240();
		var2.method193(0, 0);
		field440.method240();
		var2.method193(0, -637);
		field436.method240();
		var2.method193(0, -128);
		field437.method240();
		var2.method193(-371, -202);
		field438.method240();
		var2.method193(-171, -202);
		field441.method240();
		var2.method193(-265, 0);
		field442.method240();
		var2.method193(-265, -562);
		field443.method240();
		var2.method193(-171, -128);
		field444.method240();
		var2.method193(-171, -562);
		int[] var3 = new int[var2.field600];
		for (int var4 = 0; var4 < var2.field601; var4++) {
			for (int var5 = 0; var5 < var2.field600; var5++) {
				var3[var5] = var2.field599[var2.field600 * var4 + var2.field600 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field600; var6++) {
				var2.field599[var2.field600 * var4 + var6] = var3[var6];
			}
		}

		field439.method240();
		var2.method193(0, 382);
		field440.method240();
		var2.method193(0, -255);
		field436.method240();
		var2.method193(0, 254);
		field437.method240();
		var2.method193(-371, 180);
		field438.method240();
		var2.method193(-171, 180);
		field441.method240();
		var2.method193(-265, 382);
		field442.method240();
		var2.method193(-265, -180);
		field443.method240();
		var2.method193(-171, 254);
		field444.method240();
		var2.method193(-171, -180);
		Pix32 var7 = new Pix32(field170, "logo", 0);
		field436.method240();
		var7.method195(18, 382 - var7.field600 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(BLNLLHDXXJ;)V")
	public final void method167(LocChange arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1145 == 0) {
			var2 = field405.method300(arg0.field1144, arg0.field1146, arg0.field1147);
		}

		if (arg0.field1145 == 1) {
			var2 = field405.method301(arg0.field1146, arg0.field1144, arg0.field1147);
		}

		if (arg0.field1145 == 2) {
			var2 = field405.method302(arg0.field1144, arg0.field1146, arg0.field1147);
		}

		if (arg0.field1145 == 3) {
			var2 = field405.method303(arg0.field1144, arg0.field1146, arg0.field1147);
		}

		if (var2 != 0) {
			int var6 = field405.method304(arg0.field1144, arg0.field1146, arg0.field1147, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1140 = var3;
		arg0.field1142 = var4;
		arg0.field1141 = var5;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method168() {
		field475 = false;
		while (field548) {
			field475 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field522 = null;
		field523 = null;
		field365 = null;
		field540 = null;
		field541 = null;
		field542 = null;
		field543 = null;
		field416 = null;
		field417 = null;
		field333 = null;
		field334 = null;
		field278 = null;
		field279 = null;
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;II)V")
	public final void method169(int arg0, int arg1, Component arg2, int arg3) {
		if (arg2.field631 == 0 && arg2.field652 != null && (!arg2.field614 || field532 == arg2.field610 || field511 == arg2.field610 || field354 == arg2.field610)) {
			int var5 = Pix2D.field954;
			int var6 = Pix2D.field952;
			int var7 = Pix2D.field955;
			int var8 = Pix2D.field953;
			Pix2D.method334(arg0, arg1, arg2.field633 + arg0, arg2.field636 + arg1);
			int var9 = arg2.field652.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field627[var10] + arg1;
				int var12 = arg2.field667[var10] + arg0 - arg3;
				Component var13 = Component.method204(arg2.field652[var10]);
				var11 += var13.field623;
				var12 += var13.field653;

				if (var13.field637 > 0) {
					method126(var13);
				}

				if (var13.field631 == 0) {
					if (var13.field626 > var13.field674 - var13.field633) {
						var13.field626 = var13.field674 - var13.field633;
					}

					if (var13.field626 < 0) {
						var13.field626 = 0;
					}

					method169(var12, var11, var13, var13.field626);

					if (var13.field674 > var13.field633) {
						method76(var13.field626, var13.field636 + var11, var13.field633, var13.field674, var12);
					}
				} else if (var13.field631 != 1) {
					if (var13.field631 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field633; var15++) {
							for (int var16 = 0; var16 < var13.field636; var16++) {
								int var17 = (var13.field657 + 32) * var16 + var11;
								int var18 = (var13.field639 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field616[var14];
									var18 += var13.field608[var14];
								}

								if (var13.field663[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field663[var14] - 1;
									if (var17 > Pix2D.field954 - 32 && var17 < Pix2D.field955 && var18 > Pix2D.field952 - 32 && var18 < Pix2D.field953 || field361 != 0 && field360 == var14) {
										int var22 = 0;
										if (field390 == 1 && field391 == var14 && field392 == var13.field610) {
											var22 = 0xFFFFFF;
										}

										Pix32 var23 = ObjType.method230(var22, var13.field619[var14], var21);
										if (var23 != null) {
											if (field361 != 0 && field360 == var14 && field359 == var13.field610) {
												var19 = field837 - field362;
												var20 = field838 - field363;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field501 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method197(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < Pix2D.field952 && arg2.field626 > 0) {
													int var24 = (Pix2D.field952 - var18 - var20) * field220 / 3;
													if (var24 > field220 * 10) {
														var24 = field220 * 10;
													}

													if (var24 > arg2.field626) {
														var24 = arg2.field626;
													}

													arg2.field626 -= var24;
													field363 += var24;
												}

												if (var18 + var20 + 32 > Pix2D.field953 && arg2.field626 < arg2.field674 - arg2.field633) {
													int var25 = (var18 + var20 + 32 - Pix2D.field953) * field220 / 3;
													if (var25 > field220 * 10) {
														var25 = field220 * 10;
													}

													if (var25 > arg2.field674 - arg2.field633 - arg2.field626) {
														var25 = arg2.field674 - arg2.field633 - arg2.field626;
													}

													arg2.field626 += var25;
													field363 -= var25;
												}
											} else if (field559 != 0 && field558 == var14 && field557 == var13.field610) {
												var23.method197(var17, var18, 128);
											} else {
												var23.method195(var18, var17);
											}

											if (var23.field604 == 33 || var13.field619[var14] != 1) {
												int var26 = var13.field619[var14];
												field312.method248(var17 + var19 + 1, 0, var18 + var20 + 10, method39(var26));
												field312.method248(var17 + var19, 0xFFFF00, var18 + var20 + 9, method39(var26));
											}
										}
									}
								} else if (var13.field659 != null && var14 < 20) {
									Pix32 var27 = var13.field659[var14];
									if (var27 != null) {
										var27.method195(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field631 == 3) {
						boolean var28 = false;
						if (field354 == var13.field610 || field511 == var13.field610 || field532 == var13.field610) {
							var28 = true;
						}

						int var29;
						if (method118(var13)) {
							var29 = var13.field654;
							if (var28 && var13.field621 != 0) {
								var29 = var13.field621;
							}
						} else {
							var29 = var13.field635;
							if (var28 && var13.field655 != 0) {
								var29 = var13.field655;
							}
						}

						if (var13.field615 == 0) {
							if (var13.field634) {
								Pix2D.method337(var13.field633, var12, var29, var13.field636, var11);
							} else {
								Pix2D.method338(var12, var13.field633, var29, var11, var13.field636);
							}
						} else if (var13.field634) {
							Pix2D.method336(var29, var12, var13.field636, var13.field633, 256 - (var13.field615 & 0xFF), var11);
						} else {
							Pix2D.method339(var11, var13.field636, var29, var13.field633, var12, 256 - (var13.field615 & 0xFF));
						}
					} else if (var13.field631 == 4) {
						PixFont var30 = var13.field632;
						String var31 = var13.field625;
						boolean var32 = false;
						if (field354 == var13.field610 || field511 == var13.field610 || field532 == var13.field610) {
							var32 = true;
						}

						int var33;
						if (method118(var13)) {
							var33 = var13.field654;
							if (var32 && var13.field621 != 0) {
								var33 = var13.field621;
							}

							if (var13.field644.length() > 0) {
								var31 = var13.field644;
							}
						} else {
							var33 = var13.field635;
							if (var32 && var13.field655 != 0) {
								var33 = var13.field655;
							}
						}

						if (var13.field678 == 6 && field472) {
							var31 = "Please wait...";
							var33 = var13.field635;
						}

						if (Pix2D.field950 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field782 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method111(method154(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method111(method154(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method111(method154(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method111(method154(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method111(method154(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field664) {
								var30.method245(var13.field642, var33, var34, var13.field636 / 2 + var11, var41);
							} else {
								var30.method252(var33, var11, var34, var13.field642, var41);
							}

							var34 += var30.field782;
						}
					} else if (var13.field631 == 5) {
						Pix32 var42;
						if (method118(var13)) {
							var42 = var13.field640;
						} else {
							var42 = var13.field607;
						}

						if (var42 != null) {
							var42.method195(var12, var11);
						}
					} else if (var13.field631 == 6) {
						int var43 = Pix3D.field1361;
						int var44 = Pix3D.field1362;
						Pix3D.field1361 = var13.field636 / 2 + var11;
						Pix3D.field1362 = var13.field633 / 2 + var12;
						int var45 = Pix3D.field1365[var13.field647] * var13.field646 >> 16;
						int var46 = Pix3D.field1366[var13.field647] * var13.field646 >> 16;
						boolean var47 = method118(var13);
						int var48;
						if (var47) {
							var48 = var13.field676;
						} else {
							var48 = var13.field675;
						}

						Model var49;
						if (var48 == -1) {
							var49 = var13.method212(-1, -1, var47);
						} else {
							SeqType var50 = SeqType.field680[var48];
							var49 = var13.method212(var50.field682[var13.field630], var50.field683[var13.field630], var47);
						}

						if (var49 != null) {
							var49.method380(0, var13.field648, 0, var13.field647, 0, var45, var46);
						}

						Pix3D.field1361 = var43;
						Pix3D.field1362 = var44;
					} else {
						if (var13.field631 == 7) {
							PixFont var51 = var13.field632;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field633; var53++) {
								for (int var54 = 0; var54 < var13.field636; var54++) {
									if (var13.field663[var52] > 0) {
										ObjType var55 = ObjType.method221(var13.field663[var52] - 1);
										String var56 = String.valueOf(var55.field712);
										if (var55.field750 || var13.field619[var52] != 1) {
											var56 = var56 + " x" + method160(var13.field619[var52]);
										}

										int var57 = (var13.field657 + 115) * var54 + var11;
										int var58 = (var13.field639 + 12) * var53 + var12;
										if (var13.field664) {
											var51.method245(var13.field642, var13.field635, var58, var13.field636 / 2 + var57, var56);
										} else {
											var51.method252(var13.field635, var57, var58, var13.field642, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field631 == 8 && (field514 == var13.field610 || field301 == var13.field610 || field376 == var13.field610) && field174 == 100) {
							int var59 = 0;
							int var60 = 0;
							PixFont var61 = field313;
							String var62 = var13.field625;
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

								int var65 = var61.method246(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field782 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field636 + var11 - var59 - 5;
							int var67 = var13.field633 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field636 + arg1) {
								var66 = arg2.field636 + arg1 - var59;
							}

							if (var60 + var67 > arg2.field633 + arg0) {
								var67 = arg2.field633 + arg0 - var60;
							}

							Pix2D.method337(var60, var67, 0xFFFFA0, var59, var66);
							Pix2D.method338(var67, var60, 0, var66, var59);
							String var68 = var13.field625;
							int var69 = var61.field782 + var67 + 2;
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

								var61.method252(0, var66 + 3, var69, false, var71);
								var69 += var61.field782 + 1;
							}
						}
					}
				}
			}

			Pix2D.method334(var6, var5, var8, var7);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method170() {
		if (field199 && field323 == 2 && World.field113 != field339) {
			method149(null, "Loading - please wait.");
			field323 = 1;
			field464 = System.currentTimeMillis();
		}

		if (field323 == 1) {
			int var1 = method171();
			if (var1 != 0 && System.currentTimeMillis() - field464 > 360000L) {
				signlink.reporterror(field340 + " glcfb " + field202 + "," + var1 + "," + field199 + "," + field463[0] + "," + field521.method590() + "," + field339 + "," + field171 + "," + field172);
				field464 = System.currentTimeMillis();
			}
		}

		if (field323 == 2 && field507 != field339) {
			field507 = field339;
			method138(field339);
		}
	}

	@ObfuscatedName("client.I(I)I")
	public final int method171() {
		for (int var1 = 0; var1 < field121.length; var1++) {
			if (field121[var1] == null && field139[var1] != -1) {
				return -1;
			}

			if (field466[var1] == null && field140[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field121.length; var3++) {
			byte[] var4 = field466[var3];
			if (var4 != null) {
				int var5 = (field138[var3] >> 8) * 64 - field297;
				int var6 = (field138[var3] & 0xFF) * 64 - field298;
				if (field404) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= World.method29(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field445) {
			return -4;
		} else {
			field323 = 2;
			World.field113 = field339;
			method116();
			field229.p1isaac(6);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIII)V")
	public final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var10 = null;
		for (LocChange var11 = (LocChange) field493.method6(); var11 != null; var11 = (LocChange) field493.method8()) {
			if (var11.field1144 == arg0 && var11.field1146 == arg1 && var11.field1147 == arg8 && var11.field1145 == arg7) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LocChange();
			var10.field1144 = arg0;
			var10.field1145 = arg7;
			var10.field1146 = arg1;
			var10.field1147 = arg8;
			method167(var10);
			field493.method3(var10);
		}

		var10.field1137 = arg5;
		var10.field1139 = arg4;
		var10.field1138 = arg2;
		var10.field1148 = arg6;
		var10.field1143 = arg3;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method173() {
		if (field306 == 0 && field843 == 1) {
			int var1 = field844 - 25 - 550;
			int var2 = field845 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field484 + field193 & 0x7FF;
				int var4 = Pix3D.field1365[var3];
				int var5 = Pix3D.field1366[var3];
				var4 = (field467 + 256) * var4 >> 8;
				var5 = (field467 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field408.field1006 + var6 >> 7;
				int var9 = field408.field1007 - var7 >> 7;
				boolean var10 = method55(true, var9, field408.field983[0], 0, 0, 1, 0, var8, 0, 0, field408.field982[0]);
				if (var10) {
					field229.p1(var1);
					field229.p1(var2);
					field229.p2(field484);
					field229.p1(57);
					field229.p1(field193);
					field229.p1(field467);
					field229.p1(89);
					field229.p2(field408.field1006);
					field229.p2(field408.field1007);
					field229.p1(field373);
					field229.p1(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method174() {
		if (field830 == null) {
			method168();
			field436 = null;
			field437 = null;
			field438 = null;
			field439 = null;
			field440 = null;
			field441 = null;
			field442 = null;
			field443 = null;
			field444 = null;
			field402 = null;
			field400 = null;
			field399 = null;
			field401 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field830 = new PixMap(503, method164(), 765);
			field303 = true;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method175(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field141; var2++) {
			if (arg0.equalsIgnoreCase(field131[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field408.field1433)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method176() {
		if (field460 == 0) {
			int var1 = field827 / 2 - 80;
			int var2 = field828 / 2 + 20;
			var2 += 20;
			if (field843 == 1 && field844 >= var1 - 75 && field844 <= var1 + 75 && field845 >= var2 - 20 && field845 <= var2 + 20) {
				field460 = 3;
				field242 = 0;
			}

			int var3 = field827 / 2 + 80;
			if (field843 == 1 && field844 >= var3 - 75 && field844 <= var3 + 75 && field845 >= var2 - 20 && field845 <= var2 + 20) {
				field224 = "";
				field225 = "Enter your username & password.";
				field460 = 2;
				field242 = 0;
			}
		} else if (field460 == 2) {
			int var4 = field828 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field843 == 1 && field845 >= var4 - 15 && field845 < var4) {
				field242 = 0;
			}

			var4 += 15;
			if (field843 == 1 && field845 >= var4 - 15 && field845 < var4) {
				field242 = 1;
			}

			var4 += 15;
			int var5 = field827 / 2 - 80;
			int var6 = field828 / 2 + 50;
			var6 += 20;
			if (field843 == 1 && field844 >= var5 - 75 && field844 <= var5 + 75 && field845 >= var6 - 20 && field845 <= var6 + 20) {
				field132 = 0;
				method101(field340, field341, false);

				if (field383) {
					return;
				}
			}

			int var7 = field827 / 2 + 80;
			if (field843 == 1 && field844 >= var7 - 75 && field844 <= var7 + 75 && field845 >= var6 - 20 && field845 <= var6 + 20) {
				field460 = 0;
				field340 = "";
				field341 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method270();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field271.length(); var10++) {
					if (var8 == field271.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field242 == 0) {
					if (var8 == 8 && field340.length() > 0) {
						field340 = field340.substring(0, field340.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field242 = 1;
					}

					if (var9) {
						field340 = field340 + (char) var8;
					}

					if (field340.length() > 12) {
						field340 = field340.substring(0, 12);
					}
				} else if (field242 == 1) {
					if (var8 == 8 && field341.length() > 0) {
						field341 = field341.substring(0, field341.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field242 = 0;
					}

					if (var9) {
						field341 = field341 + (char) var8;
					}

					if (field341.length() > 20) {
						field341 = field341.substring(0, 20);
					}
				}
			}
		} else if (field460 == 3) {
			int var11 = field827 / 2;
			int var12 = field828 / 2 + 50;
			var12 += 20;
			if (field843 == 1 && field844 >= var11 - 75 && field844 <= var11 + 75 && field845 >= var12 - 20 && field845 <= var12 + 20) {
				field460 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method177(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field405.method300(arg1, arg2, arg0);
		if (var6 != 0) {
			int var7 = field405.method304(arg1, arg2, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field369.field599;
			int var12 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.method561(var13);
			if (var14.field1411 == -1) {
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
				Pix8 var15 = field397[var14.field1411];
				if (var15 != null) {
					int var16 = (var14.field1416 * 4 - var15.field1338) / 2;
					int var17 = (var14.field1394 * 4 - var15.field1339) / 2;
					var15.method492((104 - arg0 - var14.field1394) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field405.method302(arg1, arg2, arg0);
		if (var18 != 0) {
			int var19 = field405.method304(arg1, arg2, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.method561(var22);
			if (var23.field1411 != -1) {
				Pix8 var24 = field397[var23.field1411];
				if (var24 != null) {
					int var25 = (var23.field1416 * 4 - var24.field1338) / 2;
					int var26 = (var23.field1394 * 4 - var24.field1339) / 2;
					var24.method492((104 - arg0 - var23.field1394) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field369.field599;
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

		int var30 = field405.method303(arg1, arg2, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.method561(var31);
			if (var32.field1411 != -1) {
				Pix8 var33 = field397[var32.field1411];
				if (var33 != null) {
					int var34 = (var32.field1416 * 4 - var33.field1338) / 2;
					int var35 = (var32.field1394 * 4 - var33.field1339) / 2;
					var33.method492((104 - arg0 - var32.field1394) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method178() {
		field384++;
		method143(true);
		method77(true);
		method143(false);
		method77(false);
		method71();
		method98();

		if (!field447) {
			int var1 = field483;
			if (field519 / 256 > var1) {
				var1 = field519 / 256;
			}

			if (field200[4] && field134[4] + 128 > var1) {
				var1 = field134[4] + 128;
			}

			int var2 = field487 + field484 & 0x7FF;
			method117(method133(field408.field1007, field408.field1006, field339) - 50, field494, var1, var1 * 3 + 600, var2, field495);
		}

		int var3;
		if (field447) {
			var3 = method141();
		} else {
			var3 = method140();
		}

		int var4 = field452;
		int var5 = field453;
		int var6 = field454;
		int var7 = field455;
		int var8 = field456;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field200[var9]) {
				int var10 = (int) (Math.random() * (field353[var9] * 2 + 1) + Math.sin(field256[var9] / 100.0D * field389[var9]) * field134[var9] - field353[var9]);
				if (var9 == 0) {
					field452 += var10;
				}

				if (var9 == 1) {
					field453 += var10;
				}

				if (var9 == 2) {
					field454 += var10;
				}

				if (var9 == 3) {
					field456 = field456 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field455 += var10;
					if (field455 < 128) {
						field455 = 128;
					}

					if (field455 > 383) {
						field455 = 383;
					}
				}
			}
		}

		int var11 = Pix3D.field1376;
		Model.field1095 = true;
		Model.field1098 = 0;
		Model.field1096 = field837 - 4;
		Model.field1097 = field838 - 4;
		Pix2D.method335();
		field405.method313(field452, var3, field453, field454, field456, field455);
		field405.method288();
		method145();
		method151();
		method87(var11);
		method132();
		field401.method241(4, 4, field829);
		field452 = var4;
		field453 = var5;
		field454 = var6;
		field455 = var7;
		field456 = var8;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method179() {
		for (int var1 = 0; var1 < field293; var1++) {
			if (field491[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field338[var1] != field504 || field549[var1] != field206) {
						Packet var3 = Wave.method479(field549[var1], field338[var1]);
						if (System.currentTimeMillis() + var3.pos / 22 > field418 / 22 + field482) {
							field418 = var3.pos;
							field482 = System.currentTimeMillis();

							if (method139(var3.pos, var3.data)) {
								field504 = field338[var1];
								field206 = field549[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method100()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field229.p1isaac(80);
						field229.p2(field338[var1] & 0x7FFF);
					} else {
						field229.p1isaac(80);
						field229.p2(-1);
					}
				}

				if (var2 && field491[var1] != -5) {
					field491[var1] = -5;
				} else {
					field293--;
					for (int var5 = var1; var5 < field293; var5++) {
						field338[var5] = field338[var5 + 1];
						field549[var5] = field549[var5 + 1];
						field491[var5] = field491[var5 + 1];
					}

					var1--;
				}
			} else {
				field491[var1]--;
			}
		}

		if (field375 > 0) {
			field375 -= 20;
			if (field375 < 0) {
				field375 = 0;
			}

			if (field375 == 0 && field498 && !field199) {
				field502 = field555;
				field503 = true;
				field521.method586(2, field502);
				return;
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field221[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field450[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
