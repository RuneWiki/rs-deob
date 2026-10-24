package jagex2.client;

import deob.ObfuscatedName;
import jagex2.client.sign.SignLink;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.config.UnkType;
import jagex2.config.VarpType;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.World;
import jagex2.dash3d.World3D;
import jagex2.dash3d.entity.LocEntity;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.ObjStackEntity;
import jagex2.dash3d.entity.PathingEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.dash3d.entity.ProjectileEntity;
import jagex2.dash3d.entity.SpotAnimEntity;
import jagex2.dash3d.type.Decor;
import jagex2.dash3d.type.GroundDecor;
import jagex2.dash3d.type.LocChange;
import jagex2.dash3d.type.Location;
import jagex2.dash3d.type.Wall;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Component;
import jagex2.graphics.Model;
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
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.ab")
	public int[] field1036 = new int[500];

	@ObfuscatedName("client.bb")
	public int[] field1037 = new int[500];

	@ObfuscatedName("client.cb")
	public int[] field1038 = new int[500];

	@ObfuscatedName("client.db")
	public int[] field1039 = new int[500];

	@ObfuscatedName("client.eb")
	public int field1040;

	@ObfuscatedName("client.gb")
	public int[] field1041 = new int[151];

	@ObfuscatedName("client.hb")
	public long[] field1042 = new long[200];

	@ObfuscatedName("client.ib")
	public static int field1043;

	@ObfuscatedName("client.jb")
	public int field1044;

	@ObfuscatedName("client.kb")
	public int[] field1045 = new int[1000];

	@ObfuscatedName("client.lb")
	public int[] field1046 = new int[1000];

	@ObfuscatedName("client.mb")
	public String field1047 = "";

	@ObfuscatedName("client.nb")
	public byte[] field1048 = new byte[16384];

	@ObfuscatedName("client.ob")
	public int[] field1049;

	@ObfuscatedName("client.pb")
	public int[] field1050;

	@ObfuscatedName("client.qb")
	public int[] field1051;

	@ObfuscatedName("client.rb")
	public int[] field1052;

	@ObfuscatedName("client.sb")
	public static int field1053;

	@ObfuscatedName("client.ub")
	public boolean field1054 = false;

	@ObfuscatedName("client.vb")
	public int[] field1055 = new int[50];

	@ObfuscatedName("client.xb")
	public static String field1056 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yb")
	public int field1057 = 3;

	@ObfuscatedName("client.zb")
	public int field1058;

	@ObfuscatedName("client.ac")
	public int field1083 = -1;

	@ObfuscatedName("client.bc")
	public int field1084;

	@ObfuscatedName("client.cc")
	public int field1085;

	@ObfuscatedName("client.dc")
	public int field1086;

	@ObfuscatedName("client.ec")
	public int[] field1087 = new int[5];

	@ObfuscatedName("client.fc")
	public World3D field1088;

	@ObfuscatedName("client.gc")
	public int field1089;

	@ObfuscatedName("client.hc")
	public int field1090;

	@ObfuscatedName("client.ic")
	public int field1091;

	@ObfuscatedName("client.jc")
	public int field1092;

	@ObfuscatedName("client.kc")
	public int field1093;

	@ObfuscatedName("client.lc")
	public int field1094;

	@ObfuscatedName("client.mc")
	public int field1095 = -1;

	@ObfuscatedName("client.nc")
	public int field1096;

	@ObfuscatedName("client.oc")
	public int field1097 = 2;

	@ObfuscatedName("client.pc")
	public byte[][] field1098;

	@ObfuscatedName("client.qc")
	public Pix32 field1099;

	@ObfuscatedName("client.L")
	public int[] field1024 = new int[50];

	@ObfuscatedName("client.P")
	public LinkList field1028 = new LinkList();

	@ObfuscatedName("client.R")
	public int field1029 = -1;

	@ObfuscatedName("client.V")
	public boolean field1031 = false;

	@ObfuscatedName("client.Z")
	public int[][] field1035 = new int[104][104];

	@ObfuscatedName("client.Bb")
	public int field1060 = 1;

	@ObfuscatedName("client.Cb")
	public int field1061 = -1;

	@ObfuscatedName("client.Db")
	public int[] field1062 = new int[50];

	@ObfuscatedName("client.Eb")
	public FileStream[] field1063 = new FileStream[5];

	@ObfuscatedName("client.Fb")
	public boolean field1064 = false;

	@ObfuscatedName("client.Hb")
	public int[] field1066 = new int[50];

	@ObfuscatedName("client.Jb")
	public boolean field1067 = false;

	@ObfuscatedName("client.Kb")
	public int[] field1068 = new int[5];

	@ObfuscatedName("client.Mb")
	public int[][] field1070 = new int[104][104];

	@ObfuscatedName("client.Nb")
	public final int field1071 = 100;

	@ObfuscatedName("client.Ob")
	public int[] field1072 = new int[100];

	@ObfuscatedName("client.Pb")
	public int[] field1073 = new int[5];

	@ObfuscatedName("client.Wb")
	public boolean field1080 = false;

	@ObfuscatedName("client.Yb")
	public int field1081 = -1;

	@ObfuscatedName("client.Zb")
	public boolean field1082 = true;

	@ObfuscatedName("client.sc")
	public int[][] field1101 = new int[104][104];

	@ObfuscatedName("client.uc")
	public int field1102 = -1;

	@ObfuscatedName("client.xc")
	public int field1105 = 0x332D25;

	@ObfuscatedName("client.zc")
	public int[] field1107 = new int[2000];

	@ObfuscatedName("client.Ac")
	public int[] field1108 = new int[5];

	@ObfuscatedName("client.Bc")
	public int field1109 = 0x4D4233;

	@ObfuscatedName("client.Ec")
	public int field1111 = 2048;

	@ObfuscatedName("client.Fc")
	public int field1112 = 2047;

	@ObfuscatedName("client.Gc")
	public PlayerEntity[] field1113 = new PlayerEntity[field1111];

	@ObfuscatedName("client.Ic")
	public int[] field1115 = new int[field1111];

	@ObfuscatedName("client.Kc")
	public int[] field1117 = new int[field1111];

	@ObfuscatedName("client.Lc")
	public Packet[] field1118 = new Packet[field1111];

	@ObfuscatedName("client.Mc")
	public int[] field1119 = new int[9];

	@ObfuscatedName("client.Pc")
	public int field1122 = -1;

	@ObfuscatedName("client.Qc")
	public int field1123 = -1;

	@ObfuscatedName("client.Zc")
	public int field1131 = 0x23201B;

	@ObfuscatedName("client.ad")
	public final int[] field1132 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.sd")
	public int[] field1148 = new int[1000];

	@ObfuscatedName("client.td")
	public int[] field1149 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public CRC32 field1154 = new CRC32();

	@ObfuscatedName("client.Ad")
	public int field1156 = 1;

	@ObfuscatedName("client.Bd")
	public Pix8[] field1157 = new Pix8[2];

	@ObfuscatedName("client.Fd")
	public String field1161 = "";

	@ObfuscatedName("client.Id")
	public long[] field1164 = new long[100];

	@ObfuscatedName("client.Od")
	public String field1170 = "";

	@ObfuscatedName("client.Vd")
	public boolean[] field1177 = new boolean[5];

	@ObfuscatedName("client.Zd")
	public boolean field1181 = false;

	@ObfuscatedName("client.be")
	public boolean field1182 = false;

	@ObfuscatedName("client.ee")
	public boolean field1185 = false;

	@ObfuscatedName("client.te")
	public boolean field1197 = false;

	@ObfuscatedName("client.Be")
	public boolean field1204 = false;

	@ObfuscatedName("client.Ge")
	public Pix32[] field1209 = new Pix32[20];

	@ObfuscatedName("client.Ne")
	public int field1216 = -1;

	@ObfuscatedName("client.Oe")
	public int field1217 = -1;

	@ObfuscatedName("client.Ve")
	public Packet field1224 = Packet.method225(1);

	@ObfuscatedName("client.ef")
	public int[] field1232 = new int[50];

	@ObfuscatedName("client.tf")
	public int[] field1242 = new int[33];

	@ObfuscatedName("client.vf")
	public int[] field1244 = new int[100];

	@ObfuscatedName("client.wf")
	public String[] field1245 = new String[100];

	@ObfuscatedName("client.xf")
	public String[] field1246 = new String[100];

	@ObfuscatedName("client.yf")
	public LinkList[][][] field1247 = new LinkList[4][104][104];

	@ObfuscatedName("client.Df")
	public boolean field1250 = false;

	@ObfuscatedName("client.Ef")
	public NpcEntity[] field1251 = new NpcEntity[8192];

	@ObfuscatedName("client.Gf")
	public int[] field1253 = new int[8192];

	@ObfuscatedName("client.Of")
	public Pix32[] field1261 = new Pix32[1000];

	@ObfuscatedName("client.Pf")
	public String field1262 = "";

	@ObfuscatedName("client.Qf")
	public boolean field1263 = false;

	@ObfuscatedName("client.Rf")
	public boolean field1264 = false;

	@ObfuscatedName("client.Sf")
	public boolean field1265 = false;

	@ObfuscatedName("client.ag")
	public boolean field1272 = true;

	@ObfuscatedName("client.eg")
	public int[] field1276 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.kg")
	public int[] field1282 = new int[200];

	@ObfuscatedName("client.lg")
	public boolean field1283 = false;

	@ObfuscatedName("client.mg")
	public int field1284 = -1;

	@ObfuscatedName("client.xg")
	public boolean field1293 = false;

	@ObfuscatedName("client.yg")
	public Packet field1294 = Packet.method225(1);

	@ObfuscatedName("client.Ag")
	public int field1296 = 2;

	@ObfuscatedName("client.Rg")
	public boolean field1311 = false;

	@ObfuscatedName("client.Tg")
	public int[] field1312 = new int[151];

	@ObfuscatedName("client.Vg")
	public boolean field1314 = false;

	@ObfuscatedName("client.Wg")
	public String field1315 = "";

	@ObfuscatedName("client.Xg")
	public String field1316 = "";

	@ObfuscatedName("client.Yg")
	public int[] field1317 = new int[2000];

	@ObfuscatedName("client.Zg")
	public int[] field1318 = new int[4000];

	@ObfuscatedName("client.ah")
	public int[] field1319 = new int[4000];

	@ObfuscatedName("client.ch")
	public Pix32[] field1321 = new Pix32[20];

	@ObfuscatedName("client.hh")
	public int[] field1326 = new int[50];

	@ObfuscatedName("client.jh")
	public Packet field1327 = Packet.method225(1);

	@ObfuscatedName("client.sh")
	public int field1334 = -1;

	@ObfuscatedName("client.wh")
	public int field1338 = 2;

	@ObfuscatedName("client.xh")
	public int field1339 = 0x766654;

	@ObfuscatedName("client.Ch")
	public int[] field1341 = new int[256];

	@ObfuscatedName("client.Qh")
	public CollisionMap[] field1353 = new CollisionMap[4];

	@ObfuscatedName("client.Sh")
	public String[] field1354 = new String[200];

	@ObfuscatedName("client.Th")
	public int[] field1355 = new int[5];

	@ObfuscatedName("client.Vh")
	public int field1357 = 128;

	@ObfuscatedName("client.Zh")
	public int field1361 = 78;

	@ObfuscatedName("client.bi")
	public int field1363 = -1;

	@ObfuscatedName("client.ci")
	public Pix32[] field1364 = new Pix32[50];

	@ObfuscatedName("client.di")
	public int field1365 = -1;

	@ObfuscatedName("client.fi")
	public boolean field1367 = false;

	@ObfuscatedName("client.gi")
	public boolean field1368 = true;

	@ObfuscatedName("client.ji")
	public LinkList field1371 = new LinkList();

	@ObfuscatedName("client.ki")
	public Pix8[] field1372 = new Pix8[50];

	@ObfuscatedName("client.ni")
	public String field1374 = "";

	@ObfuscatedName("client.oi")
	public String field1375 = "";

	@ObfuscatedName("client.pi")
	public String[] field1376 = new String[500];

	@ObfuscatedName("client.Bi")
	public LinkList field1388 = new LinkList();

	@ObfuscatedName("client.Di")
	public Pix8[] field1390 = new Pix8[13];

	@ObfuscatedName("client.Gi")
	public String field1392 = "";

	@ObfuscatedName("client.Hi")
	public int[] field1393 = new int[7];

	@ObfuscatedName("client.Ji")
	public Pix32[] field1395 = new Pix32[8];

	@ObfuscatedName("client.Ri")
	public int[] field1401 = new int[33];

	@ObfuscatedName("client.Xi")
	public boolean field1406 = false;

	@ObfuscatedName("client.Yi")
	public boolean field1407 = true;

	@ObfuscatedName("client.Zi")
	public boolean field1408 = false;

	@ObfuscatedName("client.aj")
	public boolean field1409 = false;

	@ObfuscatedName("client.dj")
	public Component field1412 = new Component();

	@ObfuscatedName("client.fj")
	public boolean field1413 = false;

	@ObfuscatedName("client.kj")
	public boolean field1418 = false;

	@ObfuscatedName("client.mj")
	public int field1420 = 50;

	@ObfuscatedName("client.nj")
	public int[] field1421 = new int[field1420];

	@ObfuscatedName("client.oj")
	public int[] field1422 = new int[field1420];

	@ObfuscatedName("client.pj")
	public int[] field1423 = new int[field1420];

	@ObfuscatedName("client.qj")
	public int[] field1424 = new int[field1420];

	@ObfuscatedName("client.rj")
	public int[] field1425 = new int[field1420];

	@ObfuscatedName("client.sj")
	public int[] field1426 = new int[field1420];

	@ObfuscatedName("client.tj")
	public int[] field1427 = new int[field1420];

	@ObfuscatedName("client.uj")
	public String[] field1428 = new String[field1420];

	@ObfuscatedName("client.N")
	public static BigInteger field1026 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.we")
	public static final int[][] field1199 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Pe")
	public static int field1218 = 10;

	@ObfuscatedName("client.Re")
	public static boolean field1220 = true;

	@ObfuscatedName("client.vg")
	public static int[] field1291 = new int[99];

	@ObfuscatedName("client.qh")
	public static final int[] field1332 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Si")
	public static BigInteger field1402 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.M")
	public int field1025;

	@ObfuscatedName("client.O")
	public int field1027;

	@ObfuscatedName("client.T")
	public static int field1030;

	@ObfuscatedName("client.Ab")
	public int field1059;

	@ObfuscatedName("client.Gb")
	public int field1065;

	@ObfuscatedName("client.Lb")
	public int field1069;

	@ObfuscatedName("client.Qb")
	public int field1074;

	@ObfuscatedName("client.Rb")
	public int field1075;

	@ObfuscatedName("client.Sb")
	public int field1076;

	@ObfuscatedName("client.Tb")
	public int field1077;

	@ObfuscatedName("client.Ub")
	public int field1078;

	@ObfuscatedName("client.Vb")
	public int field1079;

	@ObfuscatedName("client.wc")
	public int field1104;

	@ObfuscatedName("client.yc")
	public int field1106;

	@ObfuscatedName("client.Hc")
	public int field1114;

	@ObfuscatedName("client.Jc")
	public int field1116;

	@ObfuscatedName("client.Nc")
	public int field1120;

	@ObfuscatedName("client.Oc")
	public int field1121;

	@ObfuscatedName("client.Rc")
	public int field1124;

	@ObfuscatedName("client.Sc")
	public int field1125;

	@ObfuscatedName("client.Tc")
	public int field1126;

	@ObfuscatedName("client.Uc")
	public int field1127;

	@ObfuscatedName("client.Vc")
	public int field1128;

	@ObfuscatedName("client.cd")
	public int field1133;

	@ObfuscatedName("client.dd")
	public int field1134;

	@ObfuscatedName("client.ed")
	public int field1135;

	@ObfuscatedName("client.rd")
	public int field1147;

	@ObfuscatedName("client.xd")
	public int field1153;

	@ObfuscatedName("client.zd")
	public int field1155;

	@ObfuscatedName("client.Cd")
	public int field1158;

	@ObfuscatedName("client.Dd")
	public int field1159;

	@ObfuscatedName("client.Ed")
	public int field1160;

	@ObfuscatedName("client.Gd")
	public int field1162;

	@ObfuscatedName("client.Hd")
	public int field1163;

	@ObfuscatedName("client.Jd")
	public int field1165;

	@ObfuscatedName("client.Kd")
	public int field1166;

	@ObfuscatedName("client.Ld")
	public int field1167;

	@ObfuscatedName("client.Md")
	public int field1168;

	@ObfuscatedName("client.Nd")
	public static int field1169;

	@ObfuscatedName("client.Pd")
	public int field1171;

	@ObfuscatedName("client.Qd")
	public int field1172;

	@ObfuscatedName("client.Rd")
	public int field1173;

	@ObfuscatedName("client.Sd")
	public int field1174;

	@ObfuscatedName("client.Td")
	public int field1175;

	@ObfuscatedName("client.Ud")
	public int field1176;

	@ObfuscatedName("client.ce")
	public int field1183;

	@ObfuscatedName("client.de")
	public int field1184;

	@ObfuscatedName("client.ve")
	public int field1198;

	@ObfuscatedName("client.xe")
	public int field1200;

	@ObfuscatedName("client.ye")
	public int field1201;

	@ObfuscatedName("client.ze")
	public int field1202;

	@ObfuscatedName("client.Ae")
	public int field1203;

	@ObfuscatedName("client.Ce")
	public int field1205;

	@ObfuscatedName("client.De")
	public static int field1206;

	@ObfuscatedName("client.Fe")
	public int field1208;

	@ObfuscatedName("client.Qe")
	public static int field1219;

	@ObfuscatedName("client.Ue")
	public int field1223;

	@ObfuscatedName("client.Ze")
	public int field1228;

	@ObfuscatedName("client.bf")
	public int field1230;

	@ObfuscatedName("client.cf")
	public int field1231;

	@ObfuscatedName("client.ff")
	public int field1233;

	@ObfuscatedName("client.gf")
	public int field1234;

	@ObfuscatedName("client.hf")
	public int field1235;

	@ObfuscatedName("client.kf")
	public int field1236;

	@ObfuscatedName("client.rf")
	public int field1241;

	@ObfuscatedName("client.Ff")
	public int field1252;

	@ObfuscatedName("client.Tf")
	public static int field1266;

	@ObfuscatedName("client.Vf")
	public int field1267;

	@ObfuscatedName("client.Wf")
	public int field1268;

	@ObfuscatedName("client.Xf")
	public int field1269;

	@ObfuscatedName("client.Yf")
	public int field1270;

	@ObfuscatedName("client.Zf")
	public int field1271;

	@ObfuscatedName("client.bg")
	public int field1273;

	@ObfuscatedName("client.cg")
	public int field1274;

	@ObfuscatedName("client.fg")
	public int field1277;

	@ObfuscatedName("client.gg")
	public int field1278;

	@ObfuscatedName("client.hg")
	public int field1279;

	@ObfuscatedName("client.ig")
	public int field1280;

	@ObfuscatedName("client.jg")
	public int field1281;

	@ObfuscatedName("client.pg")
	public int field1287;

	@ObfuscatedName("client.qg")
	public int field1288;

	@ObfuscatedName("client.tg")
	public int field1290;

	@ObfuscatedName("client.wg")
	public int field1292;

	@ObfuscatedName("client.zg")
	public int field1295;

	@ObfuscatedName("client.Bg")
	public int field1297;

	@ObfuscatedName("client.Cg")
	public int field1298;

	@ObfuscatedName("client.Eg")
	public int field1300;

	@ObfuscatedName("client.Lg")
	public int field1305;

	@ObfuscatedName("client.Mg")
	public int field1306;

	@ObfuscatedName("client.Ng")
	public int field1307;

	@ObfuscatedName("client.Og")
	public int field1308;

	@ObfuscatedName("client.Ug")
	public static int field1313;

	@ObfuscatedName("client.bh")
	public static int field1320;

	@ObfuscatedName("client.kh")
	public int field1328;

	@ObfuscatedName("client.oh")
	public int field1330;

	@ObfuscatedName("client.ph")
	public int field1331;

	@ObfuscatedName("client.rh")
	public int field1333;

	@ObfuscatedName("client.th")
	public int field1335;

	@ObfuscatedName("client.uh")
	public int field1336;

	@ObfuscatedName("client.vh")
	public int field1337;

	@ObfuscatedName("client.Dh")
	public int field1342;

	@ObfuscatedName("client.Eh")
	public static int field1343;

	@ObfuscatedName("client.Gh")
	public int field1344;

	@ObfuscatedName("client.Ih")
	public int field1345;

	@ObfuscatedName("client.Jh")
	public int field1346;

	@ObfuscatedName("client.Kh")
	public int field1347;

	@ObfuscatedName("client.Lh")
	public int field1348;

	@ObfuscatedName("client.Mh")
	public int field1349;

	@ObfuscatedName("client.Nh")
	public int field1350;

	@ObfuscatedName("client.Ph")
	public static int field1352;

	@ObfuscatedName("client.Uh")
	public static int field1356;

	@ObfuscatedName("client.Wh")
	public int field1358;

	@ObfuscatedName("client.Xh")
	public int field1359;

	@ObfuscatedName("client.Yh")
	public int field1360;

	@ObfuscatedName("client.ai")
	public int field1362;

	@ObfuscatedName("client.ei")
	public int field1366;

	@ObfuscatedName("client.mi")
	public int field1373;

	@ObfuscatedName("client.qi")
	public int field1377;

	@ObfuscatedName("client.ri")
	public int field1378;

	@ObfuscatedName("client.si")
	public int field1379;

	@ObfuscatedName("client.yi")
	public static int field1385;

	@ObfuscatedName("client.zi")
	public int field1386;

	@ObfuscatedName("client.Ai")
	public int field1387;

	@ObfuscatedName("client.Ci")
	public int field1389;

	@ObfuscatedName("client.Ei")
	public int field1391;

	@ObfuscatedName("client.Ii")
	public static int field1394;

	@ObfuscatedName("client.Ki")
	public int field1396;

	@ObfuscatedName("client.Li")
	public int field1397;

	@ObfuscatedName("client.Mi")
	public int field1398;

	@ObfuscatedName("client.Ni")
	public int field1399;

	@ObfuscatedName("client.Qi")
	public static int field1400;

	@ObfuscatedName("client.Ui")
	public static int field1404;

	@ObfuscatedName("client.Wi")
	public static int field1405;

	@ObfuscatedName("client.bj")
	public int field1410;

	@ObfuscatedName("client.cj")
	public int field1411;

	@ObfuscatedName("client.gj")
	public static int field1414;

	@ObfuscatedName("client.lj")
	public int field1419;

	@ObfuscatedName("client.vj")
	public int field1429;

	@ObfuscatedName("client.wj")
	public int field1430;

	@ObfuscatedName("client.xj")
	public int field1431;

	@ObfuscatedName("client.yj")
	public int field1432;

	@ObfuscatedName("client.zj")
	public int field1433;

	@ObfuscatedName("client.Ee")
	public long field1207;

	@ObfuscatedName("client.Te")
	public long field1222;

	@ObfuscatedName("client.mf")
	public long field1237;

	@ObfuscatedName("client.Dg")
	public long field1299;

	@ObfuscatedName("client.jj")
	public long field1417;

	@ObfuscatedName("client.uf")
	public static PlayerEntity field1243;

	@ObfuscatedName("client.rc")
	public Pix32 field1100;

	@ObfuscatedName("client.Bf")
	public Pix32 field1248;

	@ObfuscatedName("client.Cf")
	public Pix32 field1249;

	@ObfuscatedName("client.dg")
	public Pix32 field1275;

	@ObfuscatedName("client.ng")
	public Pix32 field1285;

	@ObfuscatedName("client.og")
	public Pix32 field1286;

	@ObfuscatedName("client.sg")
	public Pix32 field1289;

	@ObfuscatedName("client.Fg")
	public Pix32 field1301;

	@ObfuscatedName("client.Gg")
	public Pix32 field1302;

	@ObfuscatedName("client.Hg")
	public Pix32 field1303;

	@ObfuscatedName("client.Ig")
	public Pix32 field1304;

	@ObfuscatedName("client.Oh")
	public Pix32 field1351;

	@ObfuscatedName("client.W")
	public Pix8 field1032;

	@ObfuscatedName("client.X")
	public Pix8 field1033;

	@ObfuscatedName("client.fe")
	public Pix8 field1186;

	@ObfuscatedName("client.ge")
	public Pix8 field1187;

	@ObfuscatedName("client.Ie")
	public Pix8 field1211;

	@ObfuscatedName("client.Je")
	public Pix8 field1212;

	@ObfuscatedName("client.Ke")
	public Pix8 field1213;

	@ObfuscatedName("client.Le")
	public Pix8 field1214;

	@ObfuscatedName("client.Me")
	public Pix8 field1215;

	@ObfuscatedName("client.of")
	public Pix8 field1238;

	@ObfuscatedName("client.pf")
	public Pix8 field1239;

	@ObfuscatedName("client.qf")
	public Pix8 field1240;

	@ObfuscatedName("client.Lf")
	public Pix8 field1258;

	@ObfuscatedName("client.Mf")
	public Pix8 field1259;

	@ObfuscatedName("client.Nf")
	public Pix8 field1260;

	@ObfuscatedName("client.ti")
	public Pix8 field1380;

	@ObfuscatedName("client.ui")
	public Pix8 field1381;

	@ObfuscatedName("client.vi")
	public Pix8 field1382;

	@ObfuscatedName("client.wi")
	public Pix8 field1383;

	@ObfuscatedName("client.xi")
	public Pix8 field1384;

	@ObfuscatedName("client.Hf")
	public PixFont field1254;

	@ObfuscatedName("client.If")
	public PixFont field1255;

	@ObfuscatedName("client.Jf")
	public PixFont field1256;

	@ObfuscatedName("client.Kf")
	public PixFont field1257;

	@ObfuscatedName("client.id")
	public PixMap field1138;

	@ObfuscatedName("client.jd")
	public PixMap field1139;

	@ObfuscatedName("client.kd")
	public PixMap field1140;

	@ObfuscatedName("client.ld")
	public PixMap field1141;

	@ObfuscatedName("client.md")
	public PixMap field1142;

	@ObfuscatedName("client.nd")
	public PixMap field1143;

	@ObfuscatedName("client.od")
	public PixMap field1144;

	@ObfuscatedName("client.pd")
	public PixMap field1145;

	@ObfuscatedName("client.qd")
	public PixMap field1146;

	@ObfuscatedName("client.ud")
	public PixMap field1150;

	@ObfuscatedName("client.vd")
	public PixMap field1151;

	@ObfuscatedName("client.wd")
	public PixMap field1152;

	@ObfuscatedName("client.he")
	public PixMap field1188;

	@ObfuscatedName("client.ie")
	public PixMap field1189;

	@ObfuscatedName("client.je")
	public PixMap field1190;

	@ObfuscatedName("client.ke")
	public PixMap field1191;

	@ObfuscatedName("client.le")
	public PixMap field1192;

	@ObfuscatedName("client.me")
	public PixMap field1193;

	@ObfuscatedName("client.ne")
	public PixMap field1194;

	@ObfuscatedName("client.oe")
	public PixMap field1195;

	@ObfuscatedName("client.pe")
	public PixMap field1196;

	@ObfuscatedName("client.dh")
	public PixMap field1322;

	@ObfuscatedName("client.eh")
	public PixMap field1323;

	@ObfuscatedName("client.fh")
	public PixMap field1324;

	@ObfuscatedName("client.gh")
	public PixMap field1325;

	@ObfuscatedName("client.nh")
	public OnDemand field1329;

	@ObfuscatedName("client.zh")
	public Isaac field1340;

	@ObfuscatedName("client.He")
	public Jagfile field1210;

	@ObfuscatedName("client.hj")
	public MouseTracking field1415;

	@ObfuscatedName("client.vc")
	public ClientStream field1103;

	@ObfuscatedName("client.Y")
	public String field1034;

	@ObfuscatedName("client.fd")
	public String field1136;

	@ObfuscatedName("client.Pg")
	public String field1309;

	@ObfuscatedName("client.ij")
	public String field1416;

	@ObfuscatedName("client.Se")
	public static boolean field1221;

	@ObfuscatedName("client.Ti")
	public static boolean field1403;

	@ObfuscatedName("client.Wc")
	public int[] field1129;

	@ObfuscatedName("client.Xc")
	public int[] field1130;

	@ObfuscatedName("client.Wd")
	public int[] field1178;

	@ObfuscatedName("client.Xd")
	public int[] field1179;

	@ObfuscatedName("client.Yd")
	public int[] field1180;

	@ObfuscatedName("client.We")
	public int[] field1225;

	@ObfuscatedName("client.Xe")
	public int[] field1226;

	@ObfuscatedName("client.Ye")
	public int[] field1227;

	@ObfuscatedName("client.hi")
	public int[] field1369;

	@ObfuscatedName("client.ii")
	public int[] field1370;

	@ObfuscatedName("client.Qg")
	public Pix8[] field1310;

	@ObfuscatedName("client.gd")
	public byte[][] field1137;

	@ObfuscatedName("client.Cc")
	public byte[][][] field1110;

	@ObfuscatedName("client.af")
	public int[][][] field1229;

	@ObfuscatedName("client.b(Z)V")
	public final void method427() {
		field1377++;
		method453(true);
		method486();
		method453(false);
		method449();
		method465();

		if (!field1283) {
			int var1 = field1357;
			if (field1058 / 256 > var1) {
				var1 = field1058 / 256;
			}

			if (field1177[4] && field1073[4] + 128 > var1) {
				var1 = field1073[4] + 128;
			}

			int var2 = field1358 + field1059 & 0x7FF;
			method491(var2, method473(field1243.field367, field1290, field1243.field366) - 50, var1, field1288, var1 * 3 + 600, field1287);
			field1043++;
			if (field1043 > 1802) {
				field1043 = 0;
				field1224.method227(148);
				field1224.method228(0);
				int var3 = field1224.field621;
				field1224.method229(29711);
				field1224.method228(70);
				field1224.method228((int) (Math.random() * 256.0D));
				field1224.method228(242);
				field1224.method228(186);
				field1224.method228(39);
				field1224.method228(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1224.method228(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1224.method229(57856);
				}

				field1224.method229((int) (Math.random() * 65536.0D));
				field1224.method237(field1224.field621 - var3);
			}
		}

		int var4;
		if (field1283) {
			var4 = method521();
		} else {
			var4 = method520();
		}

		int var5 = field1429;
		int var6 = field1430;
		int var7 = field1431;
		int var8 = field1432;
		int var9 = field1433;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1177[var10]) {
				int var11 = (int) (Math.random() * (field1108[var10] * 2 + 1) + Math.sin(field1068[var10] / 100.0D * field1087[var10]) * field1073[var10] - field1108[var10]);
				if (var10 == 0) {
					field1429 += var11;
				}

				if (var10 == 1) {
					field1430 += var11;
				}

				if (var10 == 2) {
					field1431 += var11;
				}

				if (var10 == 3) {
					field1433 = field1433 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1432 += var11;
					if (field1432 < 128) {
						field1432 = 128;
					}

					if (field1432 > 383) {
						field1432 = 383;
					}
				}
			}
		}

		int var12 = Pix3D.field591;
		Model.field543 = true;
		Model.field546 = 0;
		Model.field544 = field17 - 4;
		Model.field545 = field18 - 4;
		Pix2D.method167();
		field1088.method102(field1429, var4, field1433, field1432, field1431, field1430);
		field1088.method77();
		method462();
		method509();
		method555(var12);
		method475();
		field1324.method268(graphics, 4, 4);
		field1429 = var5;
		field1430 = var6;
		field1431 = var7;
		field1432 = var8;
		field1433 = var9;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method428(int arg0, Packet arg1) {
		field1147 = 0;
		field1116 = 0;
		method485(arg1, arg0);
		method518(arg0, arg1);
		method498(arg1, arg0);

		for (int var3 = 0; var3 < field1147; var3++) {
			int var4 = field1148[var3];
			if (field1385 != field1251[var4].field411) {
				field1251[var4].field420 = null;
				field1251[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			SignLink.reporterror(field1374 + " size mismatch in getnpcpos - pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1252; var5++) {
			if (field1251[field1253[var5]] == null) {
				SignLink.reporterror(field1374 + " null entry in npc list - pos:" + var5 + " size:" + field1252);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method429() {
		if (field1078 > 0) {
			method476();
		} else {
			field1324.method267();
			field1255.method213(257, 0, "Connection lost", 144);
			field1255.method213(256, 0xFFFFFF, "Connection lost", 143);
			field1255.method213(257, 0, "Please wait - attempting to reestablish", 159);
			field1255.method213(256, 0xFFFFFF, "Please wait - attempting to reestablish", 158);
			field1324.method268(graphics, 4, 4);
			field1273 = 0;
			ClientStream var1 = field1103;
			field1185 = false;
			method448(field1374, field1375, true);

			if (!field1185) {
				method476();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method430() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1149[0] != -1) {
				field1054 = true;
				field1057 = 0;
				field1204 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1149[1] != -1) {
				field1054 = true;
				field1057 = 1;
				field1204 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1149[2] != -1) {
				field1054 = true;
				field1057 = 2;
				field1204 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1149[3] != -1) {
				field1054 = true;
				field1057 = 3;
				field1204 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1149[4] != -1) {
				field1054 = true;
				field1057 = 4;
				field1204 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1149[5] != -1) {
				field1054 = true;
				field1057 = 5;
				field1204 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1149[6] != -1) {
				field1054 = true;
				field1057 = 6;
				field1204 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1149[7] != -1) {
				field1054 = true;
				field1057 = 7;
				field1204 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1149[8] != -1) {
				field1054 = true;
				field1057 = 8;
				field1204 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1149[9] != -1) {
				field1054 = true;
				field1057 = 9;
				field1204 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1149[10] != -1) {
				field1054 = true;
				field1057 = 10;
				field1204 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1149[11] != -1) {
				field1054 = true;
				field1057 = 11;
				field1204 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1149[12] != -1) {
				field1054 = true;
				field1057 = 12;
				field1204 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1149[13] != -1) {
				field1054 = true;
				field1057 = 13;
				field1204 = true;
			}

			field1320++;
			if (field1320 > 150) {
				field1320 = 0;
				field1224.method227(46);
				field1224.method228(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void method431(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1363 != -1) {
			field1034 = arg0;
			field23 = 0;
		}

		if (field1216 == -1) {
			field1067 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1244[var4] = field1244[var4 - 1];
			field1245[var4] = field1245[var4 - 1];
			field1246[var4] = field1246[var4 - 1];
		}

		field1244[0] = arg2;
		field1245[0] = arg1;
		field1246[0] = arg0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method432() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1228 = (field1228 + 1) % 4;
				field1409 = true;
				field1067 = true;
				field1224.method227(98);
				field1224.method228(field1228);
				field1224.method228(field1373);
				field1224.method228(field1104);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1373 = (field1373 + 1) % 3;
				field1409 = true;
				field1067 = true;
				field1224.method227(98);
				field1224.method228(field1228);
				field1224.method228(field1373);
				field1224.method228(field1104);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1104 = (field1104 + 1) % 3;
				field1409 = true;
				field1067 = true;
				field1224.method227(98);
				field1224.method228(field1228);
				field1224.method228(field1373);
				field1224.method228(field1104);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method450();
				field1170 = "";
				field1264 = false;

				for (int var1 = 0; var1 < Component.field57.length; var1++) {
					if (Component.field57[var1] != null && Component.field57[var1].field66 == 600) {
						field1029 = field1102 = Component.field57[var1].field63;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)V")
	public final void method433(Component arg0) {
		int var2 = arg0.field66;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}

			if (var2 >= field1236) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				arg0.field97 = field1354[var2];
				arg0.field65 = 1;
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= field1236) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				if (field1282[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1282[var2] == field1218) {
					arg0.field97 = "@gre@World-" + (field1282[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1282[var2] - 9);
				}

				arg0.field65 = 1;
			}
		} else if (var2 == 203) {
			arg0.field76 = field1236 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1183) {
				arg0.field97 = "";
				arg0.field65 = 0;
			} else {
				arg0.field97 = JString.method313(JString.method310(field1164[var2]));
				arg0.field65 = 1;
			}
		} else if (var2 == 503) {
			arg0.field76 = field1183 * 15 + 20;
			if (arg0.field76 <= arg0.field68) {
				arg0.field76 = arg0.field68 + 1;
			}
		} else if (var2 == 327) {
			arg0.field111 = 150;
			arg0.field112 = (int) (Math.sin(field1385 / 40.0D) * 256.0D) & 0x7FF;

			if (field1031) {
				for (int var3 = 0; var3 < 7; var3++) {
					int var4 = field1393[var3];
					if (var4 >= 0 && !IdkType.field956[var4].method377()) {
						return;
					}
				}

				field1031 = false;
				Model[] var5 = new Model[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1393[var7];
					if (var8 >= 0) {
						var5[var6++] = IdkType.field956[var8].method378();
					}
				}

				Model var9 = new Model(var6, var5);
				for (int var10 = 0; var10 < 5; var10++) {
					if (field1355[var10] != 0) {
						var9.method152(field1199[var10][0], field1199[var10][field1355[var10]]);

						if (var10 == 1) {
							var9.method152(field1332[0], field1332[field1355[var10]]);
						}
					}
				}

				var9.method145();
				var9.method146(SeqType.field973[field1243.field371].field975[0]);
				var9.method155(64, 850, -30, -50, -30, true);
				arg0.field104 = 5;
				arg0.field105 = 0;
				Component.method36(var9, 0, 5);
			}
		} else if (var2 == 324) {
			if (field1248 == null) {
				field1248 = arg0.field102;
				field1249 = arg0.field103;
			}

			if (field1368) {
				arg0.field102 = field1249;
			} else {
				arg0.field102 = field1248;
			}
		} else if (var2 == 325) {
			if (field1248 == null) {
				field1248 = arg0.field102;
				field1249 = arg0.field103;
			}

			if (field1368) {
				arg0.field102 = field1248;
			} else {
				arg0.field102 = field1249;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1170;
			if (field1385 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1198 < 1) {
				arg0.field97 = "";
			} else if (field1264) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1297 == 0) {
				arg0.field97 = "";
			} else {
				String var11;
				if (field1333 == 0) {
					var11 = "earlier today";
				} else if (field1333 == 1) {
					var11 = "yesterday";
				} else {
					var11 = field1333 + " days ago";
				}

				arg0.field97 = "You last logged in " + var11 + " from: " + SignLink.dns;
			}
		} else if (var2 == 651) {
			if (field1027 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1027 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1027 > 1) {
				arg0.field97 = field1027 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1069 == 201) {
				if (field1241 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1069 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var12;
				if (field1069 == 0) {
					var12 = "Earlier today";
				} else if (field1069 == 1) {
					var12 = "Yesterday";
				} else {
					var12 = field1069 + " days ago";
				}

				arg0.field97 = var12 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1069 == 201) {
				if (field1241 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1069 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1069 == 201) {
				if (field1241 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1069 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method434() {
		if (field1091 == 0) {
			int var1 = field23;
			if (field1133 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1181) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1267 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1267 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1267 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1268 - 10 || var2 > field1270 + field1268 + 10 || var3 < field1269 - 10 || var3 > field1271 + field1269 + 10) {
						field1181 = false;

						if (field1267 == 1) {
							field1054 = true;
						}

						if (field1267 == 2) {
							field1067 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1268;
					int var5 = field1269;
					int var6 = field1270;
					int var7 = field24;
					int var8 = field25;
					if (field1267 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1267 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1267 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1362; var10++) {
						int var11 = (field1362 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method512(var9);
					}

					field1181 = false;

					if (field1267 == 1) {
						field1054 = true;
					}

					if (field1267 == 2) {
						field1067 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1362 > 0) {
					int var12 = field1038[field1362 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = field1036[field1362 - 1];
						int var14 = field1037[field1362 - 1];
						Component var15 = Component.field57[var14];
						if (var15.field84) {
							field1064 = false;
							field1084 = 0;
							field1089 = var14;
							field1090 = var13;
							field1091 = 2;
							field1092 = field24;
							field1093 = field25;

							if (Component.field57[var14].field63 == field1102) {
								field1091 = 1;
							}

							if (Component.field57[var14].field63 == field1216) {
								field1091 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1328 == 1 || method487(field1362 - 1)) && field1362 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1362 > 0) {
					method512(field1362 - 1);
				}

				if (var1 != 2 || field1362 <= 0) {
					return;
				}

				method541();
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method435() {
		byte[] var1 = field1210.method308("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		field1191.method267();
		var2.method196(0, 0);
		field1192.method267();
		var2.method196(-637, 0);
		field1188.method267();
		var2.method196(-128, 0);
		field1189.method267();
		var2.method196(-202, -371);
		field1190.method267();
		var2.method196(-202, -171);
		field1193.method267();
		var2.method196(0, -265);
		field1194.method267();
		var2.method196(-562, -265);
		field1195.method267();
		var2.method196(-128, -171);
		field1196.method267();
		var2.method196(-562, -171);
		int[] var3 = new int[var2.field595];
		for (int var4 = 0; var4 < var2.field596; var4++) {
			for (int var5 = 0; var5 < var2.field595; var5++) {
				var3[var5] = var2.field594[var2.field595 * var4 + var2.field595 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field595; var6++) {
				var2.field594[var2.field595 * var4 + var6] = var3[var6];
			}
		}

		field1191.method267();
		var2.method196(382, 0);
		field1192.method267();
		var2.method196(-255, 0);
		field1188.method267();
		var2.method196(254, 0);
		field1189.method267();
		var2.method196(180, -371);
		field1190.method267();
		var2.method196(180, -171);
		field1193.method267();
		var2.method196(382, -265);
		field1194.method267();
		var2.method196(-180, -265);
		field1195.method267();
		var2.method196(254, -171);
		field1196.method267();
		var2.method196(-180, -171);
		Pix32 var7 = new Pix32(field1210, "logo", 0);
		field1188.method267();
		var7.method198(382 - var7.field595 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method436(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field1088.method93(field1290, arg1, arg3, arg2);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var9 = LocType.method333(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field822;
				var11 = var9.field823;
			} else {
				var10 = var9.field823;
				var11 = var9.field822;
			}

			int var12 = var9.field846;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method515(var10, field1243.field416[0], var12, 2, false, 0, arg1, 0, arg3, var11, field1243.field415[0]);
		} else {
			method515(0, field1243.field416[0], 0, 2, false, var8, arg1, var7 + 1, arg3, 0, field1243.field415[0]);
		}

		field1396 = field24;
		field1397 = field25;
		field1399 = 2;
		field1398 = 0;
		field1224.method227(arg0);
		field1224.method229(field1165 + arg1);
		field1224.method229(field1166 + arg3);
		field1224.method229(var5);
		return true;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method437() {
		for (int var1 = 0; var1 < field1252; var1++) {
			int var2 = field1253[var1];
			NpcEntity var3 = field1251[var2];
			if (var3 != null) {
				method438(var3, var3.field420.field864);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method438(PathingEntity arg0, int arg1) {
		if (arg0.field366 < 128 || arg0.field367 < 128 || arg0.field366 >= 13184 || arg0.field367 >= 13184) {
			arg0.field394 = -1;
			arg0.field399 = -1;
			arg0.field408 = 0;
			arg0.field409 = 0;
			arg0.field366 = arg0.field415[0] * 128 + arg0.field370 * 64;
			arg0.field367 = arg0.field416[0] * 128 + arg0.field370 * 64;
			arg0.method125();
		}

		if (field1243 == arg0 && (arg0.field366 < 1536 || arg0.field367 < 1536 || arg0.field366 >= 11776 || arg0.field367 >= 11776)) {
			arg0.field394 = -1;
			arg0.field399 = -1;
			arg0.field408 = 0;
			arg0.field409 = 0;
			arg0.field366 = arg0.field415[0] * 128 + arg0.field370 * 64;
			arg0.field367 = arg0.field416[0] * 128 + arg0.field370 * 64;
			arg0.method125();
		}

		if (arg0.field408 > field1385) {
			method439(arg0);
		} else if (arg0.field409 >= field1385) {
			method440(arg0);
		} else {
			method441(arg0);
		}

		method442(arg0);
		method443(arg0);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method439(PathingEntity arg0) {
		int var2 = arg0.field408 - field1385;
		int var3 = arg0.field404 * 128 + arg0.field370 * 64;
		int var4 = arg0.field406 * 128 + arg0.field370 * 64;
		arg0.field366 += (var3 - arg0.field366) / var2;
		arg0.field367 += (var4 - arg0.field367) / var2;
		arg0.field418 = 0;

		if (arg0.field410 == 0) {
			arg0.field413 = 1024;
		}

		if (arg0.field410 == 1) {
			arg0.field413 = 1536;
		}

		if (arg0.field410 == 2) {
			arg0.field413 = 0;
		}

		if (arg0.field410 == 3) {
			arg0.field413 = 512;
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method440(PathingEntity arg0) {
		if (field1385 == arg0.field409 || arg0.field394 == -1 || arg0.field397 != 0 || arg0.field396 + 1 > SeqType.field973[arg0.field394].method382(arg0.field395)) {
			int var2 = arg0.field409 - arg0.field408;
			int var3 = field1385 - arg0.field408;
			int var4 = arg0.field404 * 128 + arg0.field370 * 64;
			int var5 = arg0.field406 * 128 + arg0.field370 * 64;
			int var6 = arg0.field405 * 128 + arg0.field370 * 64;
			int var7 = arg0.field407 * 128 + arg0.field370 * 64;
			arg0.field366 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field367 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field418 = 0;

		if (arg0.field410 == 0) {
			arg0.field413 = 1024;
		}

		if (arg0.field410 == 1) {
			arg0.field413 = 1536;
		}

		if (arg0.field410 == 2) {
			arg0.field413 = 0;
		}

		if (arg0.field410 == 3) {
			arg0.field413 = 512;
		}

		arg0.field368 = arg0.field413;
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method441(PathingEntity arg0) {
		arg0.field391 = arg0.field371;
		if (arg0.field414 == 0) {
			arg0.field418 = 0;
		} else {
			if (arg0.field394 != -1 && arg0.field397 == 0) {
				SeqType var2 = SeqType.field973[arg0.field394];
				if (arg0.field419 > 0 && var2.field985 == 0) {
					arg0.field418++;
					return;
				}

				if (arg0.field419 <= 0 && var2.field986 == 0) {
					arg0.field418++;
					return;
				}
			}

			int var3 = arg0.field366;
			int var4 = arg0.field367;
			int var5 = arg0.field415[arg0.field414 - 1] * 128 + arg0.field370 * 64;
			int var6 = arg0.field416[arg0.field414 - 1] * 128 + arg0.field370 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field413 = 1280;
					} else if (var4 > var6) {
						arg0.field413 = 1792;
					} else {
						arg0.field413 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field413 = 768;
					} else if (var4 > var6) {
						arg0.field413 = 256;
					} else {
						arg0.field413 = 512;
					}
				} else if (var4 < var6) {
					arg0.field413 = 1024;
				} else {
					arg0.field413 = 0;
				}

				int var7 = arg0.field413 - arg0.field368 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field374;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field373;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field376;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field375;
				}

				if (var8 == -1) {
					var8 = arg0.field373;
				}

				arg0.field391 = var8;
				int var9 = 4;
				if (arg0.field413 != arg0.field368 && arg0.field388 == -1) {
					var9 = 2;
				}

				if (arg0.field414 > 2) {
					var9 = 6;
				}

				if (arg0.field414 > 3) {
					var9 = 8;
				}

				if (arg0.field418 > 0 && arg0.field414 > 1) {
					var9 = 8;
					arg0.field418--;
				}

				if (arg0.field417[arg0.field414 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field391 == arg0.field373 && arg0.field377 != -1) {
					arg0.field391 = arg0.field377;
				}

				if (var3 < var5) {
					arg0.field366 += var9;
					if (arg0.field366 > var5) {
						arg0.field366 = var5;
					}
				} else if (var3 > var5) {
					arg0.field366 -= var9;
					if (arg0.field366 < var5) {
						arg0.field366 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field367 += var9;
					if (arg0.field367 > var6) {
						arg0.field367 = var6;
					}
				} else if (var4 > var6) {
					arg0.field367 -= var9;
					if (arg0.field367 < var6) {
						arg0.field367 = var6;
					}
				}

				if (arg0.field366 == var5 && arg0.field367 == var6) {
					arg0.field414--;

					if (arg0.field419 > 0) {
						arg0.field419--;
						return;
					}
				}
			} else {
				arg0.field366 = var5;
				arg0.field367 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(Lz;I)V")
	public final void method442(PathingEntity arg0) {
		if (arg0.field388 != -1 && arg0.field388 < 32768) {
			NpcEntity var2 = field1251[arg0.field388];
			if (var2 != null) {
				int var3 = arg0.field366 - var2.field366;
				int var4 = arg0.field367 - var2.field367;
				if (var3 != 0 || var4 != 0) {
					arg0.field413 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field388 >= 32768) {
			int var5 = arg0.field388 - 32768;
			if (field1217 == var5) {
				var5 = field1112;
			}

			PlayerEntity var6 = field1113[var5];
			if (var6 != null) {
				int var7 = arg0.field366 - var6.field366;
				int var8 = arg0.field367 - var6.field367;
				if (var7 != 0 || var8 != 0) {
					arg0.field413 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field389 != 0 || arg0.field390 != 0) && (arg0.field414 == 0 || arg0.field418 > 0)) {
			int var9 = arg0.field366 - (arg0.field389 - field1165 - field1165) * 64;
			int var10 = arg0.field367 - (arg0.field390 - field1166 - field1166) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field413 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field389 = 0;
			arg0.field390 = 0;
		}

		int var11 = arg0.field413 - arg0.field368 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field368 = arg0.field413;
			} else if (var11 > 1024) {
				arg0.field368 -= 32;
			} else {
				arg0.field368 += 32;
			}

			arg0.field368 &= 0x7FF;
			if (arg0.field391 == arg0.field371 && arg0.field413 != arg0.field368) {
				if (arg0.field372 != -1) {
					arg0.field391 = arg0.field372;
					return;
				}

				arg0.field391 = arg0.field373;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(Lz;I)V")
	public final void method443(PathingEntity arg0) {
		arg0.field369 = false;

		if (arg0.field391 != -1) {
			SeqType var2 = SeqType.field973[arg0.field391];
			arg0.field393++;
			if (arg0.field392 < var2.field974 && arg0.field393 > var2.method382(arg0.field392)) {
				arg0.field393 = 0;
				arg0.field392++;
			}

			if (arg0.field392 >= var2.field974) {
				arg0.field393 = 0;
				arg0.field392 = 0;
			}
		}

		if (arg0.field399 != -1 && field1385 >= arg0.field402) {
			if (arg0.field400 < 0) {
				arg0.field400 = 0;
			}

			SeqType var3 = SpotAnimType.field989[arg0.field399].field993;
			arg0.field401++;
			while (arg0.field400 < var3.field974 && arg0.field401 > var3.method382(arg0.field400)) {
				arg0.field401 -= var3.method382(arg0.field400);
				arg0.field400++;
			}

			if (arg0.field400 >= var3.field974 && (arg0.field400 < 0 || arg0.field400 >= var3.field974)) {
				arg0.field399 = -1;
			}
		}

		if (arg0.field394 != -1 && arg0.field397 <= 1) {
			SeqType var4 = SeqType.field973[arg0.field394];
			if (var4.field985 == 1 && arg0.field419 > 0 && arg0.field408 <= field1385 && arg0.field409 < field1385) {
				arg0.field397 = 1;
				return;
			}
		}

		if (arg0.field394 != -1 && arg0.field397 == 0) {
			SeqType var5 = SeqType.field973[arg0.field394];
			arg0.field396++;
			while (arg0.field395 < var5.field974 && arg0.field396 > var5.method382(arg0.field395)) {
				arg0.field396 -= var5.method382(arg0.field395);
				arg0.field395++;
			}

			if (arg0.field395 >= var5.field974) {
				arg0.field395 -= var5.field978;
				arg0.field398++;
				if (arg0.field398 >= var5.field984) {
					arg0.field394 = -1;
				}

				if (arg0.field395 < 0 || arg0.field395 >= var5.field974) {
					arg0.field394 = -1;
				}
			}

			arg0.field369 = var5.field980;
		}

		if (arg0.field397 > 0) {
			arg0.field397--;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method444() {
		if (field1293) {
			field1293 = false;
			field1138.method268(graphics, 4, 0);
			field1139.method268(graphics, 357, 0);
			field1140.method268(graphics, 4, 722);
			field1141.method268(graphics, 205, 743);
			field1142.method268(graphics, 0, 0);
			field1143.method268(graphics, 4, 516);
			field1144.method268(graphics, 205, 516);
			field1145.method268(graphics, 357, 496);
			field1146.method268(graphics, 338, 0);
			field1054 = true;
			field1067 = true;
			field1204 = true;
			field1409 = true;

			if (field1331 != 2) {
				field1324.method268(graphics, 4, 4);
				field1323.method268(graphics, 4, 550);
			}
		}

		if (field1331 == 2) {
			method427();
		}

		if (field1181 && field1267 == 1) {
			field1054 = true;
		}

		if (field1365 != -1) {
			boolean var1 = method489(field1298, field1365);
			if (var1) {
				field1054 = true;
			}
		}

		if (field1128 == 2) {
			field1054 = true;
		}

		if (field1091 == 2) {
			field1054 = true;
		}

		if (field1054) {
			method464();
			field1054 = false;
		}

		if (field1216 == -1) {
			field1412.field77 = field1361 - field1079 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method542(field1412, 0, false, field18 - 357, 77, field1361, field17 - 17, 463);
			}

			int var2 = field1361 - field1412.field77 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1361 - 77) {
				var2 = field1361 - 77;
			}

			if (field1079 != var2) {
				field1079 = var2;
				field1067 = true;
			}
		}

		if (field1216 != -1) {
			boolean var3 = method489(field1298, field1216);
			if (var3) {
				field1067 = true;
			}
		}

		if (field1128 == 3) {
			field1067 = true;
		}

		if (field1091 == 3) {
			field1067 = true;
		}

		if (field1034 != null) {
			field1067 = true;
		}

		if (field1181 && field1267 == 2) {
			field1067 = true;
		}

		if (field1067) {
			method492();
			field1067 = false;
		}

		if (field1331 == 2) {
			method456();
			field1323.method268(graphics, 4, 550);
		}

		if (field1083 != -1) {
			field1204 = true;
		}

		if (field1204) {
			if (field1083 != -1 && field1083 == field1057) {
				field1083 = -1;
				field1224.method227(233);
				field1224.method228(field1057);
			}

			field1204 = false;
			field1152.method267();
			field1240.method211(0, 0);

			if (field1365 == -1) {
				if (field1149[field1057] != -1) {
					if (field1057 == 0) {
						field1211.method211(22, 10);
					}

					if (field1057 == 1) {
						field1212.method211(54, 8);
					}

					if (field1057 == 2) {
						field1212.method211(82, 8);
					}

					if (field1057 == 3) {
						field1213.method211(110, 8);
					}

					if (field1057 == 4) {
						field1215.method211(153, 8);
					}

					if (field1057 == 5) {
						field1215.method211(181, 8);
					}

					if (field1057 == 6) {
						field1214.method211(209, 9);
					}
				}

				if (field1149[0] != -1 && (field1083 != 0 || field1385 % 20 < 10)) {
					field1390[0].method211(29, 13);
				}

				if (field1149[1] != -1 && (field1083 != 1 || field1385 % 20 < 10)) {
					field1390[1].method211(53, 11);
				}

				if (field1149[2] != -1 && (field1083 != 2 || field1385 % 20 < 10)) {
					field1390[2].method211(82, 11);
				}

				if (field1149[3] != -1 && (field1083 != 3 || field1385 % 20 < 10)) {
					field1390[3].method211(115, 12);
				}

				if (field1149[4] != -1 && (field1083 != 4 || field1385 % 20 < 10)) {
					field1390[4].method211(153, 13);
				}

				if (field1149[5] != -1 && (field1083 != 5 || field1385 % 20 < 10)) {
					field1390[5].method211(180, 11);
				}

				if (field1149[6] != -1 && (field1083 != 6 || field1385 % 20 < 10)) {
					field1390[6].method211(208, 13);
				}
			}

			field1152.method268(graphics, 160, 516);
			field1151.method267();
			field1239.method211(0, 0);

			if (field1365 == -1) {
				if (field1149[field1057] != -1) {
					if (field1057 == 7) {
						field1380.method211(42, 0);
					}

					if (field1057 == 8) {
						field1381.method211(74, 0);
					}

					if (field1057 == 9) {
						field1381.method211(102, 0);
					}

					if (field1057 == 10) {
						field1382.method211(130, 1);
					}

					if (field1057 == 11) {
						field1384.method211(173, 0);
					}

					if (field1057 == 12) {
						field1384.method211(201, 0);
					}

					if (field1057 == 13) {
						field1383.method211(229, 0);
					}
				}

				if (field1149[8] != -1 && (field1083 != 8 || field1385 % 20 < 10)) {
					field1390[7].method211(74, 2);
				}

				if (field1149[9] != -1 && (field1083 != 9 || field1385 % 20 < 10)) {
					field1390[8].method211(102, 3);
				}

				if (field1149[10] != -1 && (field1083 != 10 || field1385 % 20 < 10)) {
					field1390[9].method211(137, 4);
				}

				if (field1149[11] != -1 && (field1083 != 11 || field1385 % 20 < 10)) {
					field1390[10].method211(174, 2);
				}

				if (field1149[12] != -1 && (field1083 != 12 || field1385 % 20 < 10)) {
					field1390[11].method211(201, 2);
				}

				if (field1149[13] != -1 && (field1083 != 13 || field1385 % 20 < 10)) {
					field1390[12].method211(226, 2);
				}
			}

			field1151.method268(graphics, 466, 496);
			field1324.method267();
		}

		if (field1409) {
			field1409 = false;
			field1150.method267();
			field1238.method211(0, 0);
			field1255.method214(55, true, "Public chat", 28, 0xFFFFFF);

			if (field1228 == 0) {
				field1255.method214(55, true, "On", 41, 0xFF00);
			}

			if (field1228 == 1) {
				field1255.method214(55, true, "Friends", 41, 0xFFFF00);
			}

			if (field1228 == 2) {
				field1255.method214(55, true, "Off", 41, 0xFF0000);
			}

			if (field1228 == 3) {
				field1255.method214(55, true, "Hide", 41, 0xFFFF);
			}

			field1255.method214(184, true, "Private chat", 28, 0xFFFFFF);

			if (field1373 == 0) {
				field1255.method214(184, true, "On", 41, 0xFF00);
			}

			if (field1373 == 1) {
				field1255.method214(184, true, "Friends", 41, 0xFFFF00);
			}

			if (field1373 == 2) {
				field1255.method214(184, true, "Off", 41, 0xFF0000);
			}

			field1255.method214(324, true, "Trade/duel", 28, 0xFFFFFF);

			if (field1104 == 0) {
				field1255.method214(324, true, "On", 41, 0xFF00);
			}

			if (field1104 == 1) {
				field1255.method214(324, true, "Friends", 41, 0xFFFF00);
			}

			if (field1104 == 2) {
				field1255.method214(324, true, "Off", 41, 0xFF0000);
			}

			field1255.method214(458, true, "Report abuse", 33, 0xFFFFFF);
			field1150.method268(graphics, 453, 0);
			field1324.method267();
		}

		field1298 = 0;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method445() {
		if (field1305 == 0 && field1133 == 0) {
			field1376[field1362] = "Walk here";
			field1038[field1362] = 660;
			field1036[field1362] = field17;
			field1037[field1362] = field18;
			field1362++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < Model.field546; var2++) {
			int var3 = Model.field547[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1088.method93(field1290, var4, var5, var3) >= 0) {
					LocType var8 = LocType.method333(var7);
					if (field1305 == 1) {
						field1376[field1362] = "Use " + field1309 + " with @cya@" + var8.field818;
						field1038[field1362] = 450;
						field1039[field1362] = var3;
						field1036[field1362] = var4;
						field1037[field1362] = var5;
						field1362++;
					} else if (field1133 != 1) {
						if (var8.field834 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field834[var9] != null) {
									field1376[field1362] = var8.field834[var9] + " @cya@" + var8.field818;

									if (var9 == 0) {
										field1038[field1362] = 285;
									}

									if (var9 == 1) {
										field1038[field1362] = 504;
									}

									if (var9 == 2) {
										field1038[field1362] = 364;
									}

									if (var9 == 3) {
										field1038[field1362] = 581;
									}

									if (var9 == 4) {
										field1038[field1362] = 1501;
									}

									field1039[field1362] = var3;
									field1036[field1362] = var4;
									field1037[field1362] = var5;
									field1362++;
								}
							}
						}

						field1376[field1362] = "Examine @cya@" + var8.field818;
						field1038[field1362] = 1175;
						field1039[field1362] = var3;
						field1036[field1362] = var4;
						field1037[field1362] = var5;
						field1362++;
					} else if ((field1135 & 0x4) == 4) {
						field1376[field1362] = field1136 + " @cya@" + var8.field818;
						field1038[field1362] = 55;
						field1039[field1362] = var3;
						field1036[field1362] = var4;
						field1037[field1362] = var5;
						field1362++;
					}
				}

				if (var6 == 1) {
					NpcEntity var10 = field1251[var7];
					if (var10.field420.field864 == 1 && (var10.field366 & 0x7F) == 0x40 && (var10.field367 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1252; var11++) {
							NpcEntity var12 = field1251[field1253[var11]];
							if (var12 != null && var10 != var12 && var12.field420.field864 == 1 && var10.field366 == var12.field366 && var10.field367 == var12.field367) {
								method511(var5, var4, field1253[var11], var12.field420);
							}
						}
					}

					method511(var5, var4, var7, var10.field420);
				}

				if (var6 == 0) {
					PlayerEntity var13 = field1113[var7];
					if ((var13.field366 & 0x7F) == 0x40 && (var13.field367 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1252; var14++) {
							NpcEntity var15 = field1251[field1253[var14]];
							if (var15 != null && var15.field420.field864 == 1 && var13.field366 == var15.field366 && var13.field367 == var15.field367) {
								method511(var5, var4, field1253[var14], var15.field420);
							}
						}

						for (int var16 = 0; var16 < field1114; var16++) {
							PlayerEntity var17 = field1113[field1115[var16]];
							if (var17 != null && var13 != var17 && var13.field366 == var17.field366 && var13.field367 == var17.field367) {
								method554(field1115[var16], var4, var5, var17);
							}
						}
					}

					method554(var7, var4, var5, var13);
				}

				if (var6 == 3) {
					LinkList var18 = field1247[field1290][var4][var5];
					if (var18 != null) {
						for (ObjStackEntity var19 = (ObjStackEntity) var18.method258(); var19 != null; var19 = (ObjStackEntity) var18.method260()) {
							ObjType var20 = ObjType.method348(var19.field453);
							if (field1305 == 1) {
								field1376[field1362] = "Use " + field1309 + " with @lre@" + var20.field896;
								field1038[field1362] = 217;
								field1039[field1362] = var19.field453;
								field1036[field1362] = var4;
								field1037[field1362] = var5;
								field1362++;
							} else if (field1133 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field910 != null && var20.field910[var21] != null) {
										field1376[field1362] = var20.field910[var21] + " @lre@" + var20.field896;

										if (var21 == 0) {
											field1038[field1362] = 224;
										}

										if (var21 == 1) {
											field1038[field1362] = 993;
										}

										if (var21 == 2) {
											field1038[field1362] = 99;
										}

										if (var21 == 3) {
											field1038[field1362] = 746;
										}

										if (var21 == 4) {
											field1038[field1362] = 877;
										}

										field1039[field1362] = var19.field453;
										field1036[field1362] = var4;
										field1037[field1362] = var5;
										field1362++;
									} else if (var21 == 2) {
										field1376[field1362] = "Take @lre@" + var20.field896;
										field1038[field1362] = 99;
										field1039[field1362] = var19.field453;
										field1036[field1362] = var4;
										field1037[field1362] = var5;
										field1362++;
									}
								}

								field1376[field1362] = "Examine @lre@" + var20.field896;
								field1038[field1362] = 1102;
								field1039[field1362] = var19.field453;
								field1036[field1362] = var4;
								field1037[field1362] = var5;
								field1362++;
							} else if ((field1135 & 0x1) == 1) {
								field1376[field1362] = field1136 + " @lre@" + var20.field896;
								field1038[field1362] = 965;
								field1039[field1362] = var19.field453;
								field1036[field1362] = var4;
								field1037[field1362] = var5;
								field1362++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method446(long arg0) {
		if (arg0 != 0L) {
			if (field1183 >= 100) {
				method431("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = JString.method313(JString.method310(arg0));
				for (int var4 = 0; var4 < field1183; var4++) {
					if (field1164[var4] == arg0) {
						method431(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1236; var5++) {
					if (field1042[var5] == arg0) {
						method431("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field1164[field1183++] = arg0;
				field1054 = true;
				field1224.method227(203);
				field1224.method234(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IBILjb;)V")
	public final void method447(int arg0, int arg1, Pix32 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1358 + field1337 & 0x7FF;
			int var6 = Model.field548[var5];
			int var7 = Model.field549[var5];
			var6 = var6 * 256 / (field1155 + 256);
			var7 = var7 * 256 / (field1155 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1351.method203(83 - var13 - 20, var10, 256, 15, 15, 20, 20, var12 + 94 + 4 - 10);
		} else {
			method553(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method448(String arg0, String arg1, boolean arg2) {
		SignLink.errorname = arg0;

		try {
			if (!arg2) {
				field1315 = "";
				field1316 = "Connecting to server...";
				method517();
			}

			field1103 = new ClientStream(method507(field1219 + 43594), this);
			long var4 = JString.method309(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1224.field621 = 0;
			field1224.method228(14);
			field1224.method228(var6);
			field1103.method42(2, 0, field1224.field620);

			for (int var7 = 0; var7 < 8; var7++) {
				field1103.method39();
			}

			int var8 = field1103.method39();
			if (var8 == 0) {
				field1103.method41(field1294.field620, 0, 8);
				field1294.field621 = 0;
				field1207 = field1294.method244();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1207 >> 32), (int) field1207 };
				field1224.field621 = 0;
				field1224.method228(10);
				field1224.method232(var9[0]);
				field1224.method232(var9[1]);
				field1224.method232(var9[2]);
				field1224.method232(var9[3]);
				field1224.method232(SignLink.uid);
				field1224.method235(arg0);
				field1224.method235(arg1);
				field1224.method253(field1402, field1026);
				field1327.field621 = 0;

				if (arg2) {
					field1327.method228(18);
				} else {
					field1327.method228(16);
				}

				field1327.method228(field1224.field621 + 36 + 1 + 1);
				field1327.method228(244);
				field1327.method228(field1221 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1327.method232(field1119[var10]);
				}

				field1327.method236(field1224.field621, 0, field1224.field620);
				field1224.field625 = new Isaac(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1340 = new Isaac(var9);
				field1103.method42(field1327.field621, 0, field1327.field620);
				var8 = field1103.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}

				method448(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				field1198 = 0;
				if (var8 == 18) {
					field1198 = 1;
				}

				if (var8 == 19) {
					field1198 = 2;
				}

				InputTracking.method45();
				field1222 = 0L;
				field1223 = 0;
				field1415.field853 = 0;
				field14 = true;
				field1082 = true;
				field1185 = true;
				field1224.field621 = 0;
				field1294.field621 = 0;
				field1075 = -1;
				field1200 = -1;
				field1201 = -1;
				field1202 = -1;
				field1074 = 0;
				field1076 = 0;
				field1389 = 0;
				field1078 = 0;
				field1378 = 0;
				field1094 = 0;
				field1362 = 0;
				field1181 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1246[var12] = null;
				}

				field1305 = 0;
				field1133 = 0;
				field1331 = 0;
				field1159 = 0;
				field1295 = (int) (Math.random() * 100.0D) - 50;
				field1096 = (int) (Math.random() * 110.0D) - 55;
				field1059 = (int) (Math.random() * 80.0D) - 40;
				field1337 = (int) (Math.random() * 120.0D) - 60;
				field1155 = (int) (Math.random() * 30.0D) - 20;
				field1358 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1095 = -1;
				field1273 = 0;
				field1274 = 0;
				field1114 = 0;
				field1252 = 0;

				for (int var13 = 0; var13 < field1111; var13++) {
					field1113[var13] = null;
					field1118[var13] = null;
				}

				for (int var14 = 0; var14 < 8192; var14++) {
					field1251[var14] = null;
				}

				field1243 = field1113[field1112] = new PlayerEntity();
				field1371.method261();
				field1388.method261();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1247[var15][var16][var17] = null;
						}
					}
				}

				field1028 = new LinkList();
				field1236 = 0;
				field1363 = -1;
				field1216 = -1;
				field1102 = -1;
				field1365 = -1;
				field1061 = -1;
				field1406 = false;
				field1057 = 3;
				field1197 = false;
				field1181 = false;
				field1418 = false;
				field1034 = null;
				field1235 = 0;
				field1083 = -1;
				field1368 = true;
				method501();

				for (int var18 = 0; var18 < 5; var18++) {
					field1355[var18] = 0;
				}

				field1313 = 0;
				field1405 = 0;
				field1400 = 0;
				field1352 = 0;
				field1053 = 0;
				field1343 = 0;
				field1414 = 0;
				field1206 = 0;
				field1356 = 0;
				method467();
			} else if (var8 == 3) {
				field1315 = "";
				field1316 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1315 = "Your account has been disabled.";
				field1316 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1315 = "Your account is already logged in.";
				field1316 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1315 = "RuneScape has been updated!";
				field1316 = "Please reload this page.";
			} else if (var8 == 7) {
				field1315 = "This world is full.";
				field1316 = "Please use a different world.";
			} else if (var8 == 8) {
				field1315 = "Unable to connect.";
				field1316 = "Login server offline.";
			} else if (var8 == 9) {
				field1315 = "Login limit exceeded.";
				field1316 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1315 = "Unable to connect.";
				field1316 = "Bad session id.";
			} else if (var8 == 11) {
				field1316 = "Login server rejected session.";
				field1316 = "Please try again.";
			} else if (var8 == 12) {
				field1315 = "You need a members account to login to this world.";
				field1316 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1315 = "Could not complete login.";
				field1316 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1315 = "The server is being updated.";
				field1316 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1185 = true;
				field1224.field621 = 0;
				field1294.field621 = 0;
				field1075 = -1;
				field1200 = -1;
				field1201 = -1;
				field1202 = -1;
				field1074 = 0;
				field1076 = 0;
				field1389 = 0;
				field1362 = 0;
				field1181 = false;
				field1299 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1315 = "Login attempts exceeded.";
				field1316 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1315 = "You are standing in a members-only area.";
				field1316 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1315 = "Invalid loginserver requested";
				field1316 = "Please try using a different world.";
			} else {
				field1315 = "Unexpected server response";
				field1316 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			field1315 = "";
			field1316 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method449() {
		for (ProjectileEntity var1 = (ProjectileEntity) field1371.method257(); var1 != null; var1 = (ProjectileEntity) field1371.method259()) {
			if (field1290 != var1.field456 || field1385 > var1.field462) {
				var1.method119();
			} else if (field1385 >= var1.field461) {
				if (var1.field465 > 0) {
					NpcEntity var2 = field1251[var1.field465 - 1];
					if (var2 != null && var2.field366 >= 0 && var2.field366 < 13312 && var2.field367 >= 0 && var2.field367 < 13312) {
						var1.method132(var2.field367, method473(var2.field367, var1.field456, var2.field366) - var1.field460, var2.field366, field1385);
					}
				}

				if (var1.field465 < 0) {
					int var3 = -var1.field465 - 1;
					PlayerEntity var4;
					if (field1217 == var3) {
						var4 = field1243;
					} else {
						var4 = field1113[var3];
					}

					if (var4 != null && var4.field366 >= 0 && var4.field366 < 13312 && var4.field367 >= 0 && var4.field367 < 13312) {
						var1.method132(var4.field367, method473(var4.field367, var1.field456, var4.field366) - var1.field460, var4.field366, field1385);
					}
				}

				var1.method133(field1298);
				field1088.method74(60, false, (int) var1.field469, var1.field475, (int) var1.field468, var1, (int) var1.field467, -1, field1290);
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method450() {
		field1224.method227(187);

		if (field1365 != -1) {
			field1365 = -1;
			field1054 = true;
			field1406 = false;
			field1204 = true;
		}

		if (field1216 != -1) {
			field1216 = -1;
			field1067 = true;
			field1406 = false;
		}

		field1102 = -1;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method451() {
		if (field1091 == 0) {
			field1376[0] = "Cancel";
			field1038[0] = 1252;
			field1362 = 1;
			method550();
			field1124 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1102 == -1) {
					method445();
				} else {
					method523(field17, 4, field18, 4, Component.field57[field1102], 0);
				}
			}

			if (field1342 != field1124) {
				field1342 = field1124;
			}

			field1124 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1365 != -1) {
					method523(field17, 205, field18, 553, Component.field57[field1365], 0);
				} else if (field1149[field1057] != -1) {
					method523(field17, 205, field18, 553, Component.field57[field1149[field1057]], 0);
				}
			}

			if (field1411 != field1124) {
				field1054 = true;
				field1411 = field1124;
			}

			field1124 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 426 && field18 < 453) {
				if (field1216 != -1) {
					method523(field17, 357, field18, 17, Component.field57[field1216], 0);
				} else if (field18 < 434) {
					method533(field17 - 17, field18 - 357);
				}
			}

			if (field1216 != -1 && field1300 != field1124) {
				field1067 = true;
				field1300 = field1124;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1362 - 1; var2++) {
					if (field1038[var2] < 1000 && field1038[var2 + 1] > 1000) {
						String var3 = field1376[var2];
						field1376[var2] = field1376[var2 + 1];
						field1376[var2 + 1] = var3;
						int var4 = field1038[var2];
						field1038[var2] = field1038[var2 + 1];
						field1038[var2 + 1] = var4;
						int var5 = field1036[var2];
						field1036[var2] = field1036[var2 + 1];
						field1036[var2 + 1] = var5;
						int var6 = field1037[var2];
						field1037[var2] = field1037[var2 + 1];
						field1037[var2 + 1] = var6;
						int var7 = field1039[var2];
						field1039[var2] = field1039[var2 + 1];
						field1039[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLob;)V")
	public final void method452(LocChange arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field638 == 0) {
			var2 = field1088.method89(arg0.field637, arg0.field639, arg0.field640);
		}

		if (arg0.field638 == 1) {
			var2 = field1088.method90(arg0.field640, arg0.field637, arg0.field639);
		}

		if (arg0.field638 == 2) {
			var2 = field1088.method91(arg0.field637, arg0.field639, arg0.field640);
		}

		if (arg0.field638 == 3) {
			var2 = field1088.method92(arg0.field637, arg0.field639, arg0.field640);
		}

		if (var2 != 0) {
			int var6 = field1088.method93(arg0.field637, arg0.field639, arg0.field640, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field641 = var3;
		arg0.field643 = var4;
		arg0.field642 = var5;
	}

	public final void run() {
		if (field1413) {
			method556();
		} else {
			super.run();
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 244);

			if (arg0.length == 5) {
				field1218 = Integer.parseInt(arg0[0]);
				field1219 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method483();
				} else if (arg0[2].equals("highmem")) {
					method488();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1220 = false;
				} else if (arg0[3].equals("members")) {
					field1220 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				SignLink.storeid = Integer.parseInt(arg0[4]);
				SignLink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method453(boolean arg0) {
		for (int var2 = 0; var2 < field1252; var2++) {
			NpcEntity var3 = field1251[field1253[var2]];
			int var4 = (field1253[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method126() && var3.field420.field883 == arg0) {
				int var5 = var3.field366 >> 7;
				int var6 = var3.field367 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field370 == 1 && (var3.field366 & 0x7F) == 0x40 && (var3.field367 & 0x7F) == 0x40) {
						if (field1035[var5][var6] == field1377) {
							continue;
						}

						field1035[var5][var6] = field1377;
					}

					field1088.method74((var3.field370 - 1) * 64 + 60, var3.field369, method473(var3.field367, field1290, var3.field366), var3.field368, var3.field367, var3, var3.field366, var4, field1290);
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method454() {
		if (field1171 != 0) {
			PixFont var1 = field1255;
			int var2 = 0;
			if (field1389 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1246[var3] != null) {
					int var4 = field1244[var3];
					String var5 = field1245[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1373 == 0 || field1373 == 1 && method502(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method216("From", 0, var7, var8);
						var1.method216("From", 0xFFFF, var7 - 1, var8);
						int var11 = var8 + var1.method215("From ");
						if (var6 == 1) {
							field1157[0].method211(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1157[1].method211(var11, var7 - 12);
							var11 += 14;
						}

						var1.method216(var5 + ": " + field1246[var3], 0, var7, var11);
						var1.method216(var5 + ": " + field1246[var3], 0xFFFF, var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1373 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method216(field1246[var3], 0, var9, 4);
						var1.method216(field1246[var3], 0xFFFF, var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1373 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method216("To " + var5 + ": " + field1246[var3], 0, var10, 4);
						var1.method216("To " + var5 + ": " + field1246[var3], 0xFFFF, var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method455() {
		if (field1362 >= 2 || field1305 != 0 || field1133 != 0) {
			String var1;
			if (field1305 == 1 && field1362 < 2) {
				var1 = "Use " + field1309 + " with...";
			} else if (field1133 == 1 && field1362 < 2) {
				var1 = field1136 + "...";
			} else {
				var1 = field1376[field1362 - 1];
			}

			if (field1362 > 2) {
				var1 = var1 + "@whi@ / " + (field1362 - 2) + " more options";
			}

			field1256.method219(true, field1385 / 1000, 4, 15, 0xFFFFFF, var1);
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method456() {
		field1323.method267();
		int var1 = field1358 + field1337 & 0x7FF;
		int var2 = field1243.field366 / 32 + 48;
		int var3 = 464 - field1243.field367 / 32;
		field1275.method202(25, var3, 146, field1155 + 256, 5, var1, field1041, field1312, var2, 151);
		field1289.method202(0, 25, 33, 256, 0, field1358, field1401, field1242, 25, 33);

		for (int var4 = 0; var4 < field1044; var4++) {
			int var5 = field1045[var4] * 4 + 2 - field1243.field366 / 32;
			int var6 = field1046[var4] * 4 + 2 - field1243.field367 / 32;
			method553(var5, field1261[var4], var6);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				LinkList var9 = field1247[field1290][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1243.field366 / 32;
					int var11 = var8 * 4 + 2 - field1243.field367 / 32;
					method553(var10, field1301, var11);
				}
			}
		}

		for (int var12 = 0; var12 < field1252; var12++) {
			NpcEntity var13 = field1251[field1253[var12]];
			if (var13 != null && var13.method126() && var13.field420.field879) {
				int var14 = var13.field366 / 32 - field1243.field366 / 32;
				int var15 = var13.field367 / 32 - field1243.field367 / 32;
				method553(var14, field1302, var15);
			}
		}

		for (int var16 = 0; var16 < field1114; var16++) {
			PlayerEntity var17 = field1113[field1115[var16]];
			if (var17 != null && var17.method126()) {
				int var18 = var17.field366 / 32 - field1243.field366 / 32;
				int var19 = var17.field367 / 32 - field1243.field367 / 32;
				boolean var20 = false;
				long var21 = JString.method309(var17.field421);
				for (int var23 = 0; var23 < field1236; var23++) {
					if (field1042[var23] == var21 && field1282[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method553(var18, field1304, var19);
				} else {
					method553(var18, field1303, var19);
				}
			}
		}

		if (field1378 != 0 && field1385 % 20 < 10) {
			if (field1378 == 1 && field1106 >= 0 && field1106 < field1251.length) {
				NpcEntity var24 = field1251[field1106];
				if (var24 != null) {
					int var25 = var24.field366 / 32 - field1243.field366 / 32;
					int var26 = var24.field367 / 32 - field1243.field367 / 32;
					method447(var25, var26, field1286);
				}
			}

			if (field1378 == 2) {
				int var27 = (field1172 - field1165) * 4 + 2 - field1243.field366 / 32;
				int var28 = (field1173 - field1166) * 4 + 2 - field1243.field367 / 32;
				method447(var27, var28, field1286);
			}

			if (field1378 == 10 && field1234 >= 0 && field1234 < field1113.length) {
				PlayerEntity var29 = field1113[field1234];
				if (var29 != null) {
					int var30 = var29.field366 / 32 - field1243.field366 / 32;
					int var31 = var29.field367 / 32 - field1243.field367 / 32;
					method447(var30, var31, field1286);
				}
			}
		}

		if (field1273 != 0) {
			int var32 = field1273 * 4 + 2 - field1243.field366 / 32;
			int var33 = field1274 * 4 + 2 - field1243.field367 / 32;
			method553(var32, field1285, var33);
		}

		Pix2D.method169(0xFFFFFF, 3, 3, 97, 78);
		field1324.method267();
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)Lyb;")
	public final Jagfile method457(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1063[0] != null) {
				var6 = field1063[0].method300(arg2);
			}
		} catch (Exception var27) {
		}

		if (var6 != null) {
			field1154.reset();
			field1154.update(var6);
			int var8 = (int) field1154.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new Jagfile(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			drawProgress(arg4, "Requesting " + arg3);
			Object var11 = null;

			try {
				int var12 = 0;
				DataInputStream var13 = method506(arg1 + arg0);
				byte[] var14 = new byte[6];
				var13.readFully(var14, 0, 6);
				Packet var15 = new Packet(var14);
				var15.field621 = 3;
				int var16 = var15.method242() + 6;
				int var17 = 6;
				var6 = new byte[var16];
				for (int var18 = 0; var18 < 6; var18++) {
					var6[var18] = var14[var18];
				}

				while (var17 < var16) {
					int var19 = var16 - var17;
					if (var19 > 1000) {
						var19 = 1000;
					}

					int var20 = var13.read(var6, var17, var19);
					if (var20 < 0) {
						throw new IOException("EOF");
					}

					var17 += var20;
					int var21 = var17 * 100 / var16;
					if (var12 != var21) {
						drawProgress(arg4, "Loading " + arg3 + " - " + var21 + "%");
					}

					var12 = var21;
				}

				var13.close();

				try {
					if (field1063[0] != null) {
						field1063[0].method301(var6, arg2, var6.length);
					}
				} catch (Exception var26) {
					field1063[0] = null;
				}

				if (var6 != null) {
					field1154.reset();
					field1154.update(var6);
					int var22 = (int) field1154.getValue();
					if (arg0 != var22) {
						var6 = null;
						var10++;
					}
				}
			} catch (IOException var28) {
				var6 = null;
			} catch (Exception var29) {
				var6 = null;

				if (!SignLink.reporterror) {
					return null;
				}
			}

			if (var6 == null) {
				for (int var23 = var7; var23 > 0; var23--) {
					if (var10 >= 3) {
						drawProgress(arg4, "Game updated - please reload page");
						var23 = 10;
					} else {
						drawProgress(arg4, "Error loading - Will retry in " + var23 + " secs.");
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var25) {
					}
				}

				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}
			}
		}

		return new Jagfile(var6);
	}

	@ObfuscatedName("client.a()V")
	public final void load() {
		if (SignLink.sunjava) {
			mindel = 5;
		}

		if (field1403) {
			field1263 = true;
		} else {
			field1403 = true;
			boolean var1 = false;
			String var2 = method531();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.247")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.249")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.253")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.254")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (SignLink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field1063[var3] = new FileStream(var3 + 1, SignLink.cache_idx[var3], SignLink.cache_dat, 500000);
					}
				}

				try {
					int var4 = 5;
					field1119[8] = 0;
					while (field1119[8] == 0) {
						drawProgress(20, "Connecting to web server");

						try {
							DataInputStream var5 = method506("crc" + (int) (Math.random() * 9.9999999E7D));
							Packet var6 = new Packet(new byte[36]);
							var5.readFully(var6.field620, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1119[var7] = var6.method243();
							}

							var5.close();
						} catch (IOException var80) {
							for (int var8 = var4; var8 > 0; var8--) {
								drawProgress(10, "Error loading - Will retry in " + var8 + " secs.");

								try {
									Thread.sleep(1000L);
								} catch (Exception var75) {
								}
							}

							var4 *= 2;
							if (var4 > 60) {
								var4 = 60;
							}
						}
					}

					field1210 = method457(field1119[1], "title", 1, "title screen", 25);
					field1254 = new PixFont(field1210, "p11");
					field1255 = new PixFont(field1210, "p12");
					field1256 = new PixFont(field1210, "b12");
					field1257 = new PixFont(field1210, "q8");
					method435();
					method495();
					Jagfile var9 = method457(field1119[2], "config", 2, "config", 30);
					Jagfile var10 = method457(field1119[3], "interface", 3, "interface", 35);
					Jagfile var11 = method457(field1119[4], "media", 4, "2d graphics", 40);
					Jagfile var12 = method457(field1119[6], "textures", 6, "textures", 45);
					Jagfile var13 = method457(field1119[7], "wordenc", 7, "chat system", 50);
					Jagfile var14 = method457(field1119[8], "sounds", 8, "sound effects", 55);
					field1110 = new byte[4][104][104];
					field1229 = new int[4][105][105];
					field1088 = new World3D(104, field1229, 104, 4);

					for (int var15 = 0; var15 < 4; var15++) {
						field1353[var15] = new CollisionMap(104, 104);
					}

					field1275 = new Pix32(512, 512);
					Jagfile var16 = method457(field1119[5], "versionlist", 5, "update list", 60);
					drawProgress(60, "Connecting to update server");
					field1329 = new OnDemand();
					field1329.method279(var16, this);
					AnimFrame.method58(field1329.method282());
					Model.method135(field1329.method281(0), field1329);

					if (!field1221) {
						field1366 = 0;
						field1367 = false;
						field1329.method288(2, field1366);

						while (field1329.method289() > 0) {
							method460();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					drawProgress(65, "Requesting animations");
					int var17 = field1329.method281(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1329.method288(1, var18);
					}

					while (field1329.method289() > 0) {
						int var19 = var17 - field1329.method289();
						if (var19 > 0) {
							drawProgress(65, "Loading animations - " + var19 * 100 / var17 + "%");
						}

						method460();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					drawProgress(70, "Requesting models");
					int var20 = field1329.method281(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1329.method286(var21);
						if ((var22 & 0x1) != 0) {
							field1329.method288(0, var21);
						}
					}

					int var23 = field1329.method289();
					while (field1329.method289() > 0) {
						int var24 = var23 - field1329.method289();
						if (var24 > 0) {
							drawProgress(70, "Loading models - " + var24 * 100 / var23 + "%");
						}

						method460();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1063[0] != null) {
						drawProgress(75, "Requesting maps");
						field1329.method288(3, field1329.method283(48, 47, 0));
						field1329.method288(3, field1329.method283(48, 47, 1));
						field1329.method288(3, field1329.method283(48, 48, 0));
						field1329.method288(3, field1329.method283(48, 48, 1));
						field1329.method288(3, field1329.method283(48, 49, 0));
						field1329.method288(3, field1329.method283(48, 49, 1));
						field1329.method288(3, field1329.method283(47, 47, 0));
						field1329.method288(3, field1329.method283(47, 47, 1));
						field1329.method288(3, field1329.method283(47, 48, 0));
						field1329.method288(3, field1329.method283(47, 48, 1));
						field1329.method288(3, field1329.method283(148, 48, 0));
						field1329.method288(3, field1329.method283(148, 48, 1));
						int var25 = field1329.method289();
						while (field1329.method289() > 0) {
							int var26 = var25 - field1329.method289();
							if (var26 > 0) {
								drawProgress(75, "Loading maps - " + var26 * 100 / var25 + "%");
							}

							method460();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1329.method281(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1329.method286(var28);
						byte var30 = 0;
						if ((var29 & 0x8) != 0) {
							var30 = 10;
						} else if ((var29 & 0x20) != 0) {
							var30 = 9;
						} else if ((var29 & 0x10) != 0) {
							var30 = 8;
						} else if ((var29 & 0x40) != 0) {
							var30 = 7;
						} else if ((var29 & 0x80) != 0) {
							var30 = 6;
						} else if ((var29 & 0x2) != 0) {
							var30 = 5;
						} else if ((var29 & 0x4) != 0) {
							var30 = 4;
						}

						if ((var29 & 0x1) != 0) {
							var30 = 3;
						}

						if (var30 != 0) {
							field1329.method291(0, var28, var30);
						}
					}

					field1329.method284(field1220);

					if (!field1221) {
						int var31 = field1329.method281(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1329.method287(var32)) {
								field1329.method291(2, var32, (byte) 1);
							}
						}
					}

					drawProgress(80, "Unpacking media");
					field1258 = new Pix8(var11, "invback", 0);
					field1260 = new Pix8(var11, "chatback", 0);
					field1259 = new Pix8(var11, "mapback", 0);
					field1238 = new Pix8(var11, "backbase1", 0);
					field1239 = new Pix8(var11, "backbase2", 0);
					field1240 = new Pix8(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1390[var33] = new Pix8(var11, "sideicons", var33);
					}

					field1289 = new Pix32(var11, "compass", 0);
					field1351 = new Pix32(var11, "mapedge", 0);
					field1351.method195();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1372[var34] = new Pix8(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1364[var35] = new Pix32(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1321[var36] = new Pix32(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1209[var37] = new Pix32(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1285 = new Pix32(var11, "mapmarker", 0);
					field1286 = new Pix32(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1395[var38] = new Pix32(var11, "cross", var38);
					}

					field1301 = new Pix32(var11, "mapdots", 0);
					field1302 = new Pix32(var11, "mapdots", 1);
					field1303 = new Pix32(var11, "mapdots", 2);
					field1304 = new Pix32(var11, "mapdots", 3);
					field1032 = new Pix8(var11, "scrollbar", 0);
					field1033 = new Pix8(var11, "scrollbar", 1);
					field1211 = new Pix8(var11, "redstone1", 0);
					field1212 = new Pix8(var11, "redstone2", 0);
					field1213 = new Pix8(var11, "redstone3", 0);
					field1214 = new Pix8(var11, "redstone1", 0);
					field1214.method208();
					field1215 = new Pix8(var11, "redstone2", 0);
					field1215.method208();
					field1380 = new Pix8(var11, "redstone1", 0);
					field1380.method209();
					field1381 = new Pix8(var11, "redstone2", 0);
					field1381.method209();
					field1382 = new Pix8(var11, "redstone3", 0);
					field1382.method209();
					field1383 = new Pix8(var11, "redstone1", 0);
					field1383.method208();
					field1383.method209();
					field1384 = new Pix8(var11, "redstone2", 0);
					field1384.method208();
					field1384.method209();

					for (int var39 = 0; var39 < 2; var39++) {
						field1157[var39] = new Pix8(var11, "mod_icons", var39);
					}

					Pix32 var40 = new Pix32(var11, "backleft1", 0);
					field1138 = new PixMap(getBaseComponent(), var40.field596, var40.field595);
					var40.method196(0, 0);
					Pix32 var41 = new Pix32(var11, "backleft2", 0);
					field1139 = new PixMap(getBaseComponent(), var41.field596, var41.field595);
					var41.method196(0, 0);
					Pix32 var42 = new Pix32(var11, "backright1", 0);
					field1140 = new PixMap(getBaseComponent(), var42.field596, var42.field595);
					var42.method196(0, 0);
					Pix32 var43 = new Pix32(var11, "backright2", 0);
					field1141 = new PixMap(getBaseComponent(), var43.field596, var43.field595);
					var43.method196(0, 0);
					Pix32 var44 = new Pix32(var11, "backtop1", 0);
					field1142 = new PixMap(getBaseComponent(), var44.field596, var44.field595);
					var44.method196(0, 0);
					Pix32 var45 = new Pix32(var11, "backvmid1", 0);
					field1143 = new PixMap(getBaseComponent(), var45.field596, var45.field595);
					var45.method196(0, 0);
					Pix32 var46 = new Pix32(var11, "backvmid2", 0);
					field1144 = new PixMap(getBaseComponent(), var46.field596, var46.field595);
					var46.method196(0, 0);
					Pix32 var47 = new Pix32(var11, "backvmid3", 0);
					field1145 = new PixMap(getBaseComponent(), var47.field596, var47.field595);
					var47.method196(0, 0);
					Pix32 var48 = new Pix32(var11, "backhmid2", 0);
					field1146 = new PixMap(getBaseComponent(), var48.field596, var48.field595);
					var48.method196(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1364[var53] != null) {
							field1364[var53].method194(var49 + var52, var51 + var52, var50 + var52);
						}

						if (field1372[var53] != null) {
							field1372[var53].method210(var49 + var52, var51 + var52, var50 + var52);
						}
					}

					drawProgress(83, "Unpacking textures");
					Pix3D.method181(var12);
					Pix3D.method185(0.8D);
					Pix3D.method180(20);
					drawProgress(86, "Unpacking config");
					SeqType.method381(var9);
					LocType.method331(var9);
					FloType.method371(var9);
					ObjType.method346(var9);
					NpcType.method340(var9);
					IdkType.method375(var9);
					SpotAnimType.method384(var9);
					VarpType.method387(var9);
					ObjType.field893 = field1220;

					if (!field1221) {
						drawProgress(90, "Unpacking sounds");
						byte[] var54 = var14.method308("sounds.dat", null);
						Packet var55 = new Packet(var54);
						Wave.method321(var55);
					}

					drawProgress(95, "Unpacking interfaces");
					PixFont[] var56 = new PixFont[] { field1254, field1255, field1256, field1257 };
					Component.method32(var10, var11, var56);
					drawProgress(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1259.field601[field1259.field603 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1242[var57] = var58;
						field1401[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1259.field601[field1259.field603 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1312[var61 - 5] = var62 - 25;
						field1041[var61 - 5] = var63 - var62;
					}

					Pix3D.method178(96, 479);
					field1178 = Pix3D.field582;
					Pix3D.method178(261, 190);
					field1179 = Pix3D.field582;
					Pix3D.method178(334, 512);
					field1180 = Pix3D.field582;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = Pix3D.field580[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					World3D.method99(800, 334, 500, 512, var65);
					WordFilter.method389(var13);
					field1415 = new MouseTracking(this);
				} catch (Exception var81) {
					SignLink.reporterror("loaderror " + field1416 + " " + field1410);
					field1250 = true;
				}
			} else {
				field1311 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method458(int arg0, Packet arg1) {
		arg1.method248();
		int var3 = arg1.method249(1);
		if (var3 != 0) {
			int var4 = arg1.method249(2);
			if (var4 == 0) {
				field1117[field1116++] = field1112;
			} else if (var4 == 1) {
				int var5 = arg1.method249(3);
				field1243.method124(var5, false);
				int var6 = arg1.method249(1);
				if (var6 == 1) {
					field1117[field1116++] = field1112;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method249(3);
				field1243.method124(var7, true);
				int var8 = arg1.method249(3);
				field1243.method124(var8, true);
				int var9 = arg1.method249(1);
				if (var9 == 1) {
					field1117[field1116++] = field1112;
				}
			} else if (var4 == 3) {
				field1290 = arg1.method249(2);
				int var10 = arg1.method249(7);
				int var11 = arg1.method249(7);
				int var12 = arg1.method249(1);
				field1243.method123(var12 == 1, var10, var11);
				int var13 = arg1.method249(1);
				if (var13 == 1) {
					field1117[field1116++] = field1112;
				}
			}
		}
	}

	public final void init() {
		field1218 = Integer.parseInt(getParameter("nodeid"));
		field1219 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method483();
		} else {
			method488();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1220 = false;
		} else {
			field1220 = true;
		}

		initApplet(503, 765);
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method459(int arg0) {
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

	@ObfuscatedName("client.d(B)V")
	public final void method460() {
		while (true) {
			OnDemandRequest var1 = field1329.method290();
			if (var1 == null) {
				return;
			}

			if (var1.field632 == 0) {
				Model.method136(var1.field633, var1.field634);

				if ((field1329.method286(var1.field633) & 0x62) != 0) {
					field1054 = true;

					if (field1216 != -1) {
						field1067 = true;
					}
				}
			}

			if (var1.field632 == 1 && var1.field634 != null) {
				AnimFrame.method59(var1.field634);
			}

			if (var1.field632 == 2 && field1366 == var1.field633 && var1.field634 != null) {
				method466(field1367, var1.field634);
			}

			if (var1.field632 == 3 && field1331 == 1) {
				for (int var2 = 0; var2 < field1098.length; var2++) {
					if (field1226[var2] == var1.field633) {
						field1098[var2] = var1.field634;

						if (var1.field634 == null) {
							field1226[var2] = -1;
						}

						break;
					}

					if (field1227[var2] == var1.field633) {
						field1137[var2] = var1.field634;

						if (var1.field634 == null) {
							field1227[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field632 == 93 && field1329.method285(var1.field633)) {
				World.method17(new Packet(var1.field634), field1329);
			}
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method461(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method462() {
		field1419 = 0;
		for (int var1 = -1; var1 < field1252 + field1114; var1++) {
			PathingEntity var2;
			if (var1 == -1) {
				var2 = field1243;
			} else if (var1 < field1114) {
				var2 = field1113[field1115[var1]];
			} else {
				var2 = field1251[field1253[var1 - field1114]];
			}

			if (var2 != null && var2.method126()) {
				if (var1 >= field1114) {
					NpcType var6 = ((NpcEntity) var2).field420;
					if (var6.field886 >= 0 && var6.field886 < field1209.length) {
						method479(var2.field412 + 15, var2);

						if (field1122 > -1) {
							field1209[var6.field886].method198(field1122 - 12, field1123 - 30);
						}
					}

					if (field1378 == 1 && field1253[var1 - field1114] == field1106 && field1385 % 20 < 10) {
						method479(var2.field412 + 15, var2);

						if (field1122 > -1) {
							field1209[2].method198(field1122 - 12, field1123 - 28);
						}
					}
				} else {
					int var3 = 30;
					PlayerEntity var4 = (PlayerEntity) var2;
					if (var4.field424 != 0) {
						method479(var2.field412 + 15, var2);

						if (field1122 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field424 & 1 << var5) != 0) {
									field1209[var5].method198(field1122 - 12, field1123 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1378 == 10 && field1115[var1] == field1234) {
						method479(var2.field412 + 15, var2);

						if (field1122 > -1) {
							field1209[7].method198(field1122 - 12, field1123 - var3);
						}
					}
				}

				if (var2.field378 != null && (var1 >= field1114 || field1228 == 0 || field1228 == 3 || field1228 == 1 && method502(((PlayerEntity) var2).field421))) {
					method479(var2.field412, var2);

					if (field1122 > -1 && field1419 < field1420) {
						field1424[field1419] = field1256.method215(var2.field378) / 2;
						field1423[field1419] = field1256.field616;
						field1421[field1419] = field1122;
						field1422[field1419] = field1123;
						field1425[field1419] = var2.field380;
						field1426[field1419] = var2.field381;
						field1427[field1419] = var2.field379;
						field1428[field1419++] = var2.field378;

						if (field1158 == 0 && var2.field381 == 1) {
							field1423[field1419] += 10;
							field1422[field1419] += 5;
						}

						if (field1158 == 0 && var2.field381 == 2) {
							field1424[field1419] = 60;
						}
					}
				}

				if (var2.field385 > field1385) {
					method479(var2.field412 + 15, var2);

					if (field1122 > -1) {
						int var7 = var2.field386 * 30 / var2.field387;
						if (var7 > 30) {
							var7 = 30;
						}

						Pix2D.method169(0xFF00, var7, 5, field1122 - 15, field1123 - 3);
						Pix2D.method169(0xFF0000, 30 - var7, 5, field1122 + var7 - 15, field1123 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field384[var8] > field1385) {
						method479(var2.field412 / 2, var2);

						if (field1122 > -1) {
							if (var8 == 1) {
								field1123 -= 20;
							}

							if (var8 == 2) {
								field1122 -= 15;
								field1123 -= 10;
							}

							if (var8 == 3) {
								field1122 += 15;
								field1123 -= 10;
							}

							field1321[var2.field383[var8]].method198(field1122 - 12, field1123 - 12);
							field1254.method213(field1122, 0, String.valueOf(var2.field382[var8]), field1123 + 4);
							field1254.method213(field1122 - 1, 0xFFFFFF, String.valueOf(var2.field382[var8]), field1123 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1419; var9++) {
			int var10 = field1421[var9];
			int var11 = field1422[var9];
			int var12 = field1424[var9];
			int var13 = field1423[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1422[var15] - field1423[var15] && var11 - var13 < field1422[var15] + 2 && var10 - var12 < field1424[var15] + field1421[var15] && var10 + var12 > field1421[var15] - field1424[var15] && field1422[var15] - field1423[var15] < var11) {
						var11 = field1422[var15] - field1423[var15];
						var14 = true;
					}
				}
			}

			field1122 = field1421[var9];
			field1123 = field1422[var9] = var11;
			String var16 = field1428[var9];
			if (field1158 == 0) {
				int var17 = 0xFFFF00;
				if (field1425[var9] < 6) {
					var17 = field1276[field1425[var9]];
				}

				if (field1425[var9] == 6) {
					var17 = field1377 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1425[var9] == 7) {
					var17 = field1377 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1425[var9] == 8) {
					var17 = field1377 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1425[var9] == 9) {
					int var18 = 150 - field1427[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1425[var9] == 10) {
					int var19 = 150 - field1427[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1425[var9] == 11) {
					int var20 = 150 - field1427[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1426[var9] == 0) {
					field1256.method213(field1122, 0, var16, field1123 + 1);
					field1256.method213(field1122, var17, var16, field1123);
				}

				if (field1426[var9] == 1) {
					field1256.method217(field1123 + 1, field1377, var16, field1122, 0);
					field1256.method217(field1123, field1377, var16, field1122, var17);
				}

				if (field1426[var9] == 2) {
					int var21 = field1256.method215(var16);
					int var22 = (150 - field1427[var9]) * (var21 + 100) / 150;
					Pix2D.method166(field1122 + 50, 334, 0, field1122 - 50);
					field1256.method216(var16, 0, field1123 + 1, field1122 + 50 - var22);
					field1256.method216(var16, var17, field1123, field1122 + 50 - var22);
					Pix2D.method165();
				}
			} else {
				field1256.method213(field1122, 0, var16, field1123 + 1);
				field1256.method213(field1122, 0xFFFF00, var16, field1123);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method463(int arg0) {
		SignLink.wavevol = arg0;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method464() {
		field1322.method267();
		Pix3D.field582 = field1179;
		field1258.method211(0, 0);

		if (field1365 != -1) {
			method544(0, 0, Component.field57[field1365], 0);
		} else if (field1149[field1057] != -1) {
			method544(0, 0, Component.field57[field1149[field1057]], 0);
		}

		if (field1181 && field1267 == 1) {
			method477();
		}

		field1322.method268(graphics, 205, 553);
		field1324.method267();
		Pix3D.field582 = field1180;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method465() {
		for (SpotAnimEntity var1 = (SpotAnimEntity) field1388.method257(); var1 != null; var1 = (SpotAnimEntity) field1388.method259()) {
			if (field1290 != var1.field554 || var1.field560) {
				var1.method119();
			} else if (field1385 >= var1.field553) {
				var1.method163(field1298);

				if (var1.field560) {
					var1.method119();
				} else {
					field1088.method74(60, false, var1.field557, 0, var1.field556, var1, var1.field555, -1, var1.field554);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method466(boolean arg0, byte[] arg1) {
		SignLink.midifade = arg0 ? 1 : 0;
		SignLink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.p(I)V")
	public final void method467() {
		if (field1325 == null) {
			method525();
			drawArea = null;
			field1188 = null;
			field1189 = null;
			field1190 = null;
			field1191 = null;
			field1192 = null;
			field1193 = null;
			field1194 = null;
			field1195 = null;
			field1196 = null;
			field1325 = new PixMap(getBaseComponent(), 96, 479);
			field1323 = new PixMap(getBaseComponent(), 156, 172);
			Pix2D.method167();
			field1259.method211(0, 0);
			field1322 = new PixMap(getBaseComponent(), 261, 190);
			field1324 = new PixMap(getBaseComponent(), 334, 512);
			Pix2D.method167();
			field1150 = new PixMap(getBaseComponent(), 50, 496);
			field1151 = new PixMap(getBaseComponent(), 37, 269);
			field1152 = new PixMap(getBaseComponent(), 45, 249);
			field1293 = true;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method468() {
		int var1 = (field1243.field366 >> 7) + field1165;
		int var2 = (field1243.field367 >> 7) + field1166;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1230 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1230 = (var2 - 9920) / 8 + 1;
		} else {
			field1230 = 0;
		}

		field1025 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1025 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1025 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1025 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1025 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1025 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1025 = 1;
			}
		}

		if (field1025 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1025 = 2;
		}

		field1184 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1184 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1184 = 1;
		}

		if (field1184 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1184 = 0;
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method469(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
			if (field1221 && field1290 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field1088.method89(arg4, arg1, arg5);
			}

			if (arg6 == 1) {
				var8 = field1088.method90(arg5, arg4, arg1);
			}

			if (arg6 == 2) {
				var8 = field1088.method91(arg4, arg1, arg5);
			}

			if (arg6 == 3) {
				var8 = field1088.method92(arg4, arg1, arg5);
			}

			if (var8 != 0) {
				int var12 = field1088.method93(arg4, arg1, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field1088.method80(arg1, arg4, arg5);
					LocType var16 = LocType.method333(var13);
					if (var16.field824) {
						field1353[arg4].method364(var16.field825, arg5, var15, var14, arg1);
					}
				}

				if (arg6 == 1) {
					field1088.method81(arg5, arg1, arg4);
				}

				if (arg6 == 2) {
					field1088.method82(arg1, arg5, arg4);
					LocType var17 = LocType.method333(var13);
					if (var17.field822 + arg1 > 103 || var17.field822 + arg5 > 103 || var17.field823 + arg1 > 103 || var17.field823 + arg5 > 103) {
						return;
					}

					if (var17.field824) {
						field1353[arg4].method365(var17.field822, arg5, arg1, var17.field825, var17.field823, var15);
					}
				}

				if (arg6 == 3) {
					field1088.method83(arg5, arg4, arg1);
					LocType var18 = LocType.method333(var13);
					if (var18.field824 && var18.field826) {
						field1353[arg4].method367(arg5, arg1);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field1110[1][arg1][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				World.method31(arg1, arg3, arg0, arg5, field1088, arg2, field1229, field1353[arg4], var19, arg4);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method471(int arg0) {
		Component var2 = Component.field57[arg0];
		for (int var3 = 0; var3 < var2.field79.length && var2.field79[var3] != -1; var3++) {
			Component var4 = Component.field57[var2.field79[var3]];
			if (var4.field64 == 1) {
				method471(var4.field62);
			}

			var4.field60 = 0;
			var4.field61 = 0;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method472(long arg0) {
		if (arg0 != 0L) {
			if (field1236 >= 100 && field1085 != 1) {
				method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field1236 >= 200) {
				method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = JString.method313(JString.method310(arg0));
				for (int var4 = 0; var4 < field1236; var4++) {
					if (field1042[var4] == arg0) {
						method431(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1183; var5++) {
					if (field1164[var5] == arg0) {
						method431("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field1243.field421)) {
					field1354[field1236] = var3;
					field1042[field1236] = arg0;
					field1282[field1236] = 0;
					field1236++;
					field1054 = true;
					field1224.method227(9);
					field1224.method234(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method473(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1110[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field1229[var6][var4][var5] + field1229[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1229[var6][var4][var5 + 1] + field1229[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method474(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1183; var3++) {
				if (field1164[var3] == arg0) {
					field1183--;
					field1054 = true;

					for (int var4 = var3; var4 < field1183; var4++) {
						field1164[var4] = field1164[var4 + 1];
					}

					field1224.method227(207);
					field1224.method234(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method475() {
		method454();

		if (field1399 == 1) {
			field1395[field1398 / 100].method198(field1396 - 8 - 4, field1397 - 8 - 4);
		}

		if (field1399 == 2) {
			field1395[field1398 / 100 + 4].method198(field1396 - 8 - 4, field1397 - 8 - 4);
		}

		if (field1061 != -1) {
			method489(field1298, field1061);
			method544(0, 0, Component.field57[field1061], 0);
		}

		if (field1094 > 0) {
			int var1 = 302 - (int) Math.abs(Math.sin(field1094 / 10.0D) * 10.0D);
			for (int var2 = 0; var2 < 30; var2++) {
				int var3 = (30 - var2) * 16;
				Pix2D.method173(var1 + var2, var3, 0xFFFF00, 256 - var3 / 2, field1094);
			}
		}

		if (field1102 != -1) {
			method489(field1298, field1102);
			method544(0, 0, Component.field57[field1102], 0);
		}

		method468();

		if (!field1181) {
			method451();
			method455();
		} else if (field1267 == 0) {
			method477();
		}

		if (field1235 == 1) {
			if (field1230 > 0 || field1025 == 1) {
				field1209[1].method198(472, 258);
			} else {
				field1209[1].method198(472, 296);
			}
		}

		if (field1230 > 0) {
			field1209[0].method198(472, 296);
			field1255.method213(484, 0xFFFF00, "Level: " + field1230, 329);
		}

		if (field1025 == 1) {
			field1209[6].method198(472, 296);
			field1255.method213(484, 0xFFFF00, "Arena", 329);
		}

		if (field1389 != 0) {
			int var4 = field1389 / 50;
			int var5 = var4 / 60;
			var4 %= 60;
			if (var4 < 10) {
				field1255.method216("System update in: " + var5 + ":0" + var4, 0xFFFF00, 329, 4);
			} else {
				field1255.method216("System update in: " + var5 + ":" + var4, 0xFFFF00, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method476() {
		try {
			if (field1103 != null) {
				field1103.method38();
			}
		} catch (Exception var2) {
		}

		field1103 = null;
		field1185 = false;
		field1233 = 0;
		field1374 = "";
		field1375 = "";
		InputTracking.method45();
		method481();
		field1088.method63();

		for (int var1 = 0; var1 < 4; var1++) {
			field1353[var1].method359();
		}

		System.gc();
		method503();
		field1284 = -1;
		field1366 = -1;
		field1040 = 0;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method477() {
		int var1 = field1268;
		int var2 = field1269;
		int var3 = field1270;
		int var4 = field1271;
		int var5 = 0x5D5447;
		Pix2D.method169(var5, var3, var4, var1, var2);
		Pix2D.method169(0, var3 - 2, 16, var1 + 1, var2 + 1);
		Pix2D.method170(var4 - 19, var3 - 2, 0, var1 + 1, var2 + 18);
		field1256.method216("Choose Option", var5, var2 + 14, var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field1267 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1267 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1267 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1362; var8++) {
			int var9 = (field1362 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1256.method218(var10, var1 + 3, true, var9, field1376[var8]);
		}
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void method478(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < field1116; var3++) {
			int var4 = field1117[var3];
			PlayerEntity var5 = field1113[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method238() << 8;
			}

			method522(var6, arg0, var4, var5);
		}
	}

	@ObfuscatedName("client.a(IILz;)V")
	public final void method479(int arg0, PathingEntity arg1) {
		method480(arg1.field367, arg0, arg1.field366);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method480(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method473(arg0, field1290, arg2) - arg1;
			arg2 -= field1429;
			var4 -= field1430;
			arg0 -= field1431;
			int var5 = Model.field548[field1432];
			int var6 = Model.field549[field1432];
			int var7 = Model.field548[field1433];
			int var8 = Model.field549[field1433];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1122 = (var9 << 9) / arg0 + Pix3D.field576;
				field1123 = (var11 << 9) / arg0 + Pix3D.field577;
			} else {
				field1122 = -1;
				field1123 = -1;
			}
		} else {
			field1122 = -1;
			field1123 = -1;
		}
	}

	public final URL getCodeBase() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getCodeBase();
		}

		try {
			if (frame != null) {
				return new URL("http://127.0.0.1:" + (field1219 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method481() {
		LocType.field848.method116();
		LocType.field849.method116();
		NpcType.field887.method116();
		ObjType.field933.method116();
		ObjType.field934.method116();
		PlayerEntity.field442.method116();
		SpotAnimType.field1002.method116();
	}

	@ObfuscatedName("client.r(I)V")
	public final void method482() {
		for (int var1 = 0; var1 < field1159; var1++) {
			if (field1232[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1024[var1] != field1334 || field1062[var1] != field1081) {
						Packet var3 = Wave.method322(field1062[var1], field1024[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1153 / 22 + field1237) {
							field1153 = var3.field621;
							field1237 = System.currentTimeMillis();

							if (method552(var3.field620, var3.field621)) {
								field1334 = field1024[var1];
								field1081 = field1062[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method497()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1232[var1] != -5) {
					field1232[var1] = -5;
				} else {
					field1159--;
					for (int var5 = var1; var5 < field1159; var5++) {
						field1024[var5] = field1024[var5 + 1];
						field1062[var5] = field1062[var5 + 1];
						field1232[var5] = field1232[var5 + 1];
					}

					var1--;
				}
			} else {
				field1232[var1]--;
			}
		}

		if (field1040 > 0) {
			field1040 -= 20;
			if (field1040 < 0) {
				field1040 = 0;
			}

			if (field1040 == 0 && field1272 && !field1221) {
				field1366 = field1284;
				field1367 = false;
				field1329.method288(2, field1366);
				return;
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method483() {
		World3D.field264 = true;
		Pix3D.field571 = true;
		field1221 = true;
		World.field32 = true;
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void method484(int arg0, Packet arg1) {
		if (arg0 == 232 || arg0 == 125) {
			int var3 = arg1.method238();
			int var4 = (var3 >> 4 & 0x7) + field1162;
			int var5 = (var3 & 0x7) + field1163;
			int var6 = arg1.method238();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1132[var7];
			int var10;
			if (arg0 == 125) {
				var10 = -1;
			} else {
				var10 = arg1.method240();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method500(var4, var7, -1, var10, var8, var9, var5, field1290, 0);
			}
		} else if (arg0 == 155) {
			int var11 = arg1.method238();
			int var12 = (var11 >> 4 & 0x7) + field1162;
			int var13 = (var11 & 0x7) + field1163;
			int var14 = arg1.method238();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1132[var15];
			int var18 = arg1.method240();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1229[field1290][var12][var13];
				int var20 = field1229[field1290][var12 + 1][var13];
				int var21 = field1229[field1290][var12 + 1][var13 + 1];
				int var22 = field1229[field1290][var12][var13 + 1];
				if (var17 == 0) {
					Wall var23 = field1088.method85(var12, var13, field1290);
					if (var23 != null) {
						int var24 = var23.field262 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field260 = new LocEntity(var22, var21, var19, 2, var16 + 4, false, var20, var24, var18);
							var23.field261 = new LocEntity(var22, var21, var19, 2, var16 + 1 & 0x3, false, var20, var24, var18);
						} else {
							var23.field260 = new LocEntity(var22, var21, var19, var15, var16, false, var20, var24, var18);
						}
					}
				}

				if (var17 == 1) {
					Decor var25 = field1088.method86(var12, field1290, var13);
					if (var25 != null) {
						var25.field153 = new LocEntity(var22, var21, var19, 4, 0, false, var20, var25.field154 >> 14 & 0x7FFF, var18);
					}
				}

				if (var17 == 2) {
					Location var26 = field1088.method87(field1290, var13, var12);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field245 = new LocEntity(var22, var21, var19, var15, var16, false, var20, var26.field253 >> 14 & 0x7FFF, var18);
					}
				}

				if (var17 == 3) {
					GroundDecor var27 = field1088.method88(var12, var13, field1290);
					if (var27 != null) {
						var27.field184 = new LocEntity(var22, var21, var19, 22, var16, false, var20, var27.field185 >> 14 & 0x7FFF, var18);
					}
				}
			}
		} else if (arg0 == 234) {
			int var28 = arg1.method238();
			int var29 = (var28 >> 4 & 0x7) + field1162;
			int var30 = (var28 & 0x7) + field1163;
			int var31 = arg1.method240();
			int var32 = arg1.method240();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				ObjStackEntity var33 = new ObjStackEntity();
				var33.field453 = var31;
				var33.field454 = var32;

				if (field1247[field1290][var29][var30] == null) {
					field1247[field1290][var29][var30] = new LinkList();
				}

				field1247[field1290][var29][var30].method254(var33);
				method536(var29, var30);
			}
		} else if (arg0 == 39) {
			int var34 = arg1.method238();
			int var35 = (var34 >> 4 & 0x7) + field1162;
			int var36 = (var34 & 0x7) + field1163;
			int var37 = arg1.method240();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				LinkList var38 = field1247[field1290][var35][var36];
				if (var38 != null) {
					for (ObjStackEntity var39 = (ObjStackEntity) var38.method257(); var39 != null; var39 = (ObjStackEntity) var38.method259()) {
						if ((var37 & 0x7FFF) == var39.field453) {
							var39.method119();
							break;
						}
					}

					if (var38.method257() == null) {
						field1247[field1290][var35][var36] = null;
					}

					method536(var35, var36);
				}
			}
		} else if (arg0 == 137) {
			int var40 = arg1.method238();
			int var41 = (var40 >> 4 & 0x7) + field1162;
			int var42 = (var40 & 0x7) + field1163;
			int var43 = var41 + arg1.method239();
			int var44 = var42 + arg1.method239();
			int var45 = arg1.method241();
			int var46 = arg1.method240();
			int var47 = arg1.method238();
			int var48 = arg1.method238();
			int var49 = arg1.method240();
			int var50 = arg1.method240();
			int var51 = arg1.method238();
			int var52 = arg1.method238();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				ProjectileEntity var53 = new ProjectileEntity(var41, var46, var51, var48, field1290, var42, method473(var42, field1290, var41) - var47, var52, field1385 + var49, var45, field1385 + var50);
				var53.method132(var44, method473(var44, field1290, var43) - var48, var43, field1385 + var49);
				field1371.method254(var53);
			}
		} else if (arg0 == 198) {
			int var54 = arg1.method238();
			int var55 = (var54 >> 4 & 0x7) + field1162;
			int var56 = (var54 & 0x7) + field1163;
			int var57 = arg1.method240();
			int var58 = arg1.method238();
			int var59 = arg1.method240();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				SpotAnimEntity var60 = new SpotAnimEntity(var56, var55, field1290, var57, method473(var56, field1290, var55) - var58, field1385, var59);
				field1388.method254(var60);
			}
		} else if (arg0 == 69) {
			int var61 = arg1.method238();
			int var62 = (var61 >> 4 & 0x7) + field1162;
			int var63 = (var61 & 0x7) + field1163;
			int var64 = arg1.method240();
			int var65 = arg1.method240();
			int var66 = arg1.method240();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1217 != var66) {
				ObjStackEntity var67 = new ObjStackEntity();
				var67.field453 = var64;
				var67.field454 = var65;

				if (field1247[field1290][var62][var63] == null) {
					field1247[field1290][var62][var63] = new LinkList();
				}

				field1247[field1290][var62][var63].method254(var67);
				method536(var62, var63);
			}
		} else if (arg0 == 29) {
			int var68 = arg1.method238();
			int var69 = (var68 >> 4 & 0x7) + field1162;
			int var70 = (var68 & 0x7) + field1163;
			int var71 = arg1.method238();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1132[var72];
			int var75 = arg1.method240();
			int var76 = arg1.method240();
			int var77 = arg1.method240();
			int var78 = arg1.method240();
			byte var79 = arg1.method239();
			byte var80 = arg1.method239();
			byte var81 = arg1.method239();
			byte var82 = arg1.method239();
			PlayerEntity var83;
			if (field1217 == var78) {
				var83 = field1243;
			} else {
				var83 = field1113[var78];
			}

			if (var83 != null) {
				LocType var84 = LocType.method333(var75);
				int var85 = field1229[field1290][var69][var70];
				int var86 = field1229[field1290][var69 + 1][var70];
				int var87 = field1229[field1290][var69 + 1][var70 + 1];
				int var88 = field1229[field1290][var69][var70 + 1];
				Model var89 = var84.method339(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method500(var69, 0, var77 + 1, -1, 0, var74, var70, field1290, var76 + 1);
					var83.field430 = field1385 + var76;
					var83.field431 = field1385 + var77;
					var83.field435 = var89;
					int var90 = var84.field822;
					int var91 = var84.field823;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field823;
						var91 = var84.field822;
					}

					var83.field432 = var69 * 128 + var90 * 64;
					var83.field434 = var70 * 128 + var91 * 64;
					var83.field433 = method473(var83.field434, field1290, var83.field432);

					if (var79 > var81) {
						byte var92 = var79;
						var79 = var81;
						var81 = var92;
					}

					if (var80 > var82) {
						byte var93 = var80;
						var80 = var82;
						var82 = var93;
					}

					var83.field436 = var69 + var79;
					var83.field438 = var69 + var81;
					var83.field437 = var70 + var80;
					var83.field439 = var70 + var82;
				}
			}
		} else if (arg0 == 209) {
			int var94 = arg1.method238();
			int var95 = (var94 >> 4 & 0x7) + field1162;
			int var96 = (var94 & 0x7) + field1163;
			int var97 = arg1.method240();
			int var98 = arg1.method240();
			int var99 = arg1.method240();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				LinkList var100 = field1247[field1290][var95][var96];
				if (var100 != null) {
					for (ObjStackEntity var101 = (ObjStackEntity) var100.method257(); var101 != null; var101 = (ObjStackEntity) var100.method259()) {
						if ((var97 & 0x7FFF) == var101.field453 && var101.field454 == var98) {
							var101.field454 = var99;
							break;
						}
					}

					method536(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void method485(Packet arg0, int arg1) {
		arg0.method248();
		int var3 = arg0.method249(8);
		if (var3 < field1252) {
			for (int var4 = var3; var4 < field1252; var4++) {
				field1148[field1147++] = field1253[var4];
			}
		}

		if (var3 > field1252) {
			SignLink.reporterror(field1374 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1252 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1253[var5];
			NpcEntity var7 = field1251[var6];
			int var8 = arg0.method249(1);
			if (var8 == 0) {
				field1253[field1252++] = var6;
				var7.field411 = field1385;
			} else {
				int var9 = arg0.method249(2);
				if (var9 == 0) {
					field1253[field1252++] = var6;
					var7.field411 = field1385;
					field1117[field1116++] = var6;
				} else if (var9 == 1) {
					field1253[field1252++] = var6;
					var7.field411 = field1385;
					int var10 = arg0.method249(3);
					var7.method124(var10, false);
					int var11 = arg0.method249(1);
					if (var11 == 1) {
						field1117[field1116++] = var6;
					}
				} else if (var9 == 2) {
					field1253[field1252++] = var6;
					var7.field411 = field1385;
					int var12 = arg0.method249(3);
					var7.method124(var12, true);
					int var13 = arg0.method249(3);
					var7.method124(var13, true);
					int var14 = arg0.method249(1);
					if (var14 == 1) {
						field1117[field1116++] = var6;
					}
				} else if (var9 == 3) {
					field1148[field1147++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method486() {
		if (field1243.field366 >> 7 == field1273 && field1243.field367 >> 7 == field1274) {
			field1273 = 0;
		}

		for (int var1 = -1; var1 < field1114; var1++) {
			PlayerEntity var2;
			int var3;
			if (var1 == -1) {
				var2 = field1243;
				var3 = field1112 << 14;
			} else {
				var2 = field1113[field1115[var1]];
				var3 = field1115[var1] << 14;
			}

			if (var2 != null && var2.method126()) {
				var2.field440 = false;
				if ((field1221 && field1114 > 50 || field1114 > 200) && var1 != -1 && var2.field391 == var2.field371) {
					var2.field440 = true;
				}

				int var4 = var2.field366 >> 7;
				int var5 = var2.field367 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field435 == null || field1385 < var2.field430 || field1385 >= var2.field431) {
						if ((var2.field366 & 0x7F) == 0x40 && (var2.field367 & 0x7F) == 0x40) {
							if (field1035[var4][var5] == field1377 && var1 != -1) {
								continue;
							}

							field1035[var4][var5] = field1377;
						}

						var2.field429 = method473(var2.field367, field1290, var2.field366);
						field1088.method74(60, var2.field369, var2.field429, var2.field368, var2.field367, var2, var2.field366, var3, field1290);
					} else {
						var2.field440 = false;
						var2.field429 = method473(var2.field367, field1290, var2.field366);
						field1088.method75(field1290, var2, var2.field367, var2.field438, var2.field439, var2.field429, var2.field368, var2.field366, var2.field436, 60, var3, var2.field437);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method487(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1038[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.h(B)V")
	public static final void method488() {
		World3D.field264 = false;
		Pix3D.field571 = false;
		field1221 = false;
		World.field32 = false;
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method489(int arg0, int arg1) {
		boolean var3 = false;
		Component var4 = Component.field57[arg1];
		for (int var5 = 0; var5 < var4.field79.length && var4.field79[var5] != -1; var5++) {
			Component var6 = Component.field57[var4.field79[var5]];
			if (var6.field64 == 1) {
				var3 |= method489(arg0, var6.field62);
			}

			if (var6.field64 == 6 && (var6.field108 != -1 || var6.field109 != -1)) {
				boolean var7 = method516(var6);
				int var8;
				if (var7) {
					var8 = var6.field109;
				} else {
					var8 = var6.field108;
				}

				if (var8 != -1) {
					SeqType var9 = SeqType.field973[var8];
					var6.field61 += arg0;
					while (var6.field61 > var9.method382(var6.field60)) {
						var6.field61 -= var9.method382(var6.field60) + 1;
						var6.field60++;
						if (var6.field60 >= var9.field974) {
							var6.field60 -= var9.field978;
							if (var6.field60 < 0 || var6.field60 >= var9.field974) {
								var6.field60 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method490() {
		for (int var1 = -1; var1 < field1114; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1112;
			} else {
				var2 = field1115[var1];
			}

			PlayerEntity var3 = field1113[var2];
			if (var3 != null) {
				method438(var3, 1);
			}
		}

		field1404++;
		if (field1404 > 1406) {
			field1404 = 0;
			field1224.method227(215);
			field1224.method228(0);
			int var4 = field1224.field621;
			field1224.method228(162);
			field1224.method228(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1224.method228(84);
			}

			field1224.method229(31824);
			field1224.method229(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1224.method228(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1224.method228(134);
			}

			field1224.method228(100);
			field1224.method228(94);
			field1224.method229(35521);
			field1224.method237(field1224.field621 - var4);
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = Model.field548[var7];
			int var13 = Model.field549[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = Model.field548[var8];
			int var16 = Model.field549[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1429 = arg5 - var9;
		field1430 = arg1 - var10;
		field1431 = arg3 - var11;
		field1432 = arg2;
		field1433 = arg0;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void drawProgress(int arg0, String arg1) {
		field1410 = arg0;
		field1416 = arg1;
		method540();

		if (field1210 == null) {
			super.drawProgress(arg0, arg1);
		} else {
			field1190.method267();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1256.method213(var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			Pix2D.method170(34, 304, 0x8C1111, var3 / 2 - 152, var6);
			Pix2D.method170(32, 302, 0, var3 / 2 - 151, var6 + 1);
			Pix2D.method169(0x8C1111, arg0 * 3, 30, var3 / 2 - 150, var6 + 2);
			Pix2D.method169(0, 300 - arg0 * 3, 30, arg0 * 3 + var3 / 2 - 150, var6 + 2);
			field1256.method213(var3 / 2, 0xFFFFFF, arg1, var4 / 2 + 5 - var5);
			field1190.method268(graphics, 171, 202);

			if (field1293) {
				field1293 = false;

				if (!field1265) {
					field1191.method268(graphics, 0, 0);
					field1192.method268(graphics, 0, 637);
				}

				field1188.method268(graphics, 0, 128);
				field1189.method268(graphics, 371, 202);
				field1193.method268(graphics, 265, 0);
				field1194.method268(graphics, 265, 562);
				field1195.method268(graphics, 171, 128);
				field1196.method268(graphics, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method492() {
		field1325.method267();
		Pix3D.field582 = field1178;
		field1260.method211(0, 0);

		if (field1418) {
			field1256.method213(239, 0, field1047, 40);
			field1256.method213(239, 128, field1262 + "*", 60);
		} else if (field1197) {
			field1256.method213(239, 0, "Enter amount:", 40);
			field1256.method213(239, 128, field1161 + "*", 60);
		} else if (field1034 != null) {
			field1256.method213(239, 0, field1034, 40);
			field1256.method213(239, 128, "Click to continue", 60);
		} else if (field1216 != -1) {
			method544(0, 0, Component.field57[field1216], 0);
		} else if (field1363 == -1) {
			PixFont var1 = field1255;
			int var2 = 0;
			Pix2D.method166(463, 77, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1246[var3] != null) {
					int var4 = field1244[var3];
					int var5 = field1079 + 70 - var2 * 14;
					String var6 = field1245[var3];
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
							var1.method216(field1246[var3], 0, var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1228 == 0 || field1228 == 1 && method502(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1157[0].method211(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1157[1].method211(var8, var5 - 12);
								var8 += 14;
							}

							var1.method216(var6 + ":", 0, var5, var8);
							var8 += var1.method215(var6) + 8;
							var1.method216(field1246[var3], 255, var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1171 == 0 && (var4 == 7 || field1373 == 0 || field1373 == 1 && method502(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method216("From", 0, var5, var9);
							int var11 = var9 + var1.method215("From ");
							if (var7 == 1) {
								field1157[0].method211(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1157[1].method211(var11, var5 - 12);
								var11 += 14;
							}

							var1.method216(var6 + ":", 0, var5, var11);
							var11 += var1.method215(var6) + 8;
							var1.method216(field1246[var3], 0x800000, var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field1104 == 0 || field1104 == 1 && method502(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field1246[var3], 0x800080, var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field1171 == 0 && field1373 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(field1246[var3], 0x800000, var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field1171 == 0 && field1373 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216("To " + var6 + ":", 0, var5, 4);
							var1.method216(field1246[var3], 0x800000, var5, var1.method215("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1104 == 0 || field1104 == 1 && method502(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field1246[var3], 0x7E3200, var5, 4);
						}

						var2++;
					}
				}
			}

			Pix2D.method165();
			field1361 = var2 * 14 + 7;
			if (field1361 < 78) {
				field1361 = 78;
			}

			method551(463, field1361, 0, field1361 - field1079 - 77, 77);
			String var10;
			if (field1243 == null || field1243.field421 == null) {
				var10 = JString.method313(field1374);
			} else {
				var10 = field1243.field421;
			}

			var1.method216(var10 + ":", 0, 90, 4);
			var1.method216(field1392 + "*", 255, 90, var1.method215(var10 + ": ") + 6);
			Pix2D.method172(0, 77, 479, 0);
		} else {
			method544(0, 0, Component.field57[field1363], 0);
		}

		if (field1181 && field1267 == 2) {
			method477();
		}

		field1325.method268(graphics, 357, 17);
		field1324.method267();
		Pix3D.field582 = field1180;
	}

	@ObfuscatedName("client.j(B)V")
	public void method493() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1205);

		if (field1329 != null) {
			System.out.println("Od-cycle:" + field1329.field745);
		}

		System.out.println("loop-cycle:" + field1385);
		System.out.println("draw-cycle:" + field1169);
		System.out.println("ptype:" + field1075);
		System.out.println("psize:" + field1074);

		if (field1103 != null) {
			field1103.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp;
		}

		if (frame != null) {
			return frame;
		}

		return this;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method494() {
		for (int var1 = -1; var1 < field1114; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1112;
			} else {
				var2 = field1115[var1];
			}

			PlayerEntity var3 = field1113[var2];
			if (var3 != null && var3.field379 > 0) {
				var3.field379--;
				if (var3.field379 == 0) {
					var3.field378 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1252; var4++) {
			int var5 = field1253[var4];
			NpcEntity var6 = field1251[var5];
			if (var6 != null && var6.field379 > 0) {
				var6.field379--;
				if (var6.field379 == 0) {
					var6.field378 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method495() {
		field1186 = new Pix8(field1210, "titlebox", 0);
		field1187 = new Pix8(field1210, "titlebutton", 0);
		field1310 = new Pix8[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1310[var1] = new Pix8(field1210, "runes", var1);
		}

		field1099 = new Pix32(128, 265);
		field1100 = new Pix32(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1099.field594[var2] = field1191.field653[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1100.field594[var3] = field1192.field653[var3];
		}

		field1050 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1050[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1050[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1050[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1050[var7 + 192] = 0xFFFFFF;
		}

		field1051 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1051[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1051[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1051[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1051[var11 + 192] = 0xFFFFFF;
		}

		field1052 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1052[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1052[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1052[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1052[var15 + 192] = 0xFFFFFF;
		}

		field1049 = new int[256];
		field1129 = new int[32768];
		field1130 = new int[32768];
		method527(null);
		field1369 = new int[32768];
		field1370 = new int[32768];
		drawProgress(10, "Connecting to fileserver");

		if (!field1265) {
			field1413 = true;
			field1265 = true;
			startThread(this, 2);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method496() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1358 + field1337 & 0x7FF;
				int var4 = Pix3D.field580[var3];
				int var5 = Pix3D.field581[var3];
				var4 = (field1155 + 256) * var4 >> 8;
				var5 = (field1155 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1243.field366 + var6 >> 7;
				int var9 = field1243.field367 - var7 >> 7;
				boolean var10 = method515(0, field1243.field416[0], 0, 1, true, 0, var8, 0, var9, 0, field1243.field415[0]);
				if (var10) {
					field1224.method228(var1);
					field1224.method228(var2);
					field1224.method229(field1358);
					field1224.method228(57);
					field1224.method228(field1337);
					field1224.method228(field1155);
					field1224.method228(89);
					field1224.method229(field1243.field366);
					field1224.method229(field1243.field367);
					field1224.method228(field1344);
					field1224.method228(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean method497() {
		return SignLink.wavereplay();
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method498(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < field1116; var3++) {
			int var4 = field1117[var3];
			NpcEntity var5 = field1251[var4];
			int var6 = arg0.method238();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method238();
				int var8 = arg0.method238();
				var5.method127(var8, var7);
				var5.field385 = field1385 + 300;
				var5.field386 = arg0.method238();
				var5.field387 = arg0.method238();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method240();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field394 == var9) {
					var5.field398 = 0;
				}

				int var10 = arg0.method238();
				if (var5.field394 == var9 && var9 != -1) {
					int var11 = SeqType.field973[var9].field987;
					if (var11 == 1) {
						var5.field395 = 0;
						var5.field396 = 0;
						var5.field397 = var10;
						var5.field398 = 0;
					}

					if (var11 == 2) {
						var5.field398 = 0;
					}
				} else if (var9 == -1 || var5.field394 == -1 || SeqType.field973[var9].field981 >= SeqType.field973[var5.field394].field981) {
					var5.field394 = var9;
					var5.field395 = 0;
					var5.field396 = 0;
					var5.field397 = var10;
					var5.field398 = 0;
					var5.field419 = var5.field414;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field388 = arg0.method240();
				if (var5.field388 == 0xFFFF) {
					var5.field388 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field378 = arg0.method245();
				var5.field379 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method238();
				int var13 = arg0.method238();
				var5.method127(var13, var12);
				var5.field385 = field1385 + 300;
				var5.field386 = arg0.method238();
				var5.field387 = arg0.method238();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field420 = NpcType.method342(arg0.method240());
				var5.field373 = var5.field420.field868;
				var5.field374 = var5.field420.field869;
				var5.field375 = var5.field420.field870;
				var5.field376 = var5.field420.field871;
				var5.field371 = var5.field420.field867;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field399 = arg0.method240();
				int var14 = arg0.method243();
				var5.field403 = var14 >> 16;
				var5.field402 = (var14 & 0xFFFF) + field1385;
				var5.field400 = 0;
				var5.field401 = 0;

				if (var5.field402 > field1385) {
					var5.field400 = -1;
				}

				if (var5.field399 == 0xFFFF) {
					var5.field399 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field389 = arg0.method240();
				var5.field390 = arg0.method240();
			}
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method499(int arg0, Packet arg1) {
		int var3 = arg1.method249(8);
		if (var3 < field1114) {
			for (int var4 = var3; var4 < field1114; var4++) {
				field1148[field1147++] = field1115[var4];
			}
		}

		if (var3 > field1114) {
			SignLink.reporterror(field1374 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1114 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1115[var5];
			PlayerEntity var7 = field1113[var6];
			int var8 = arg1.method249(1);
			if (var8 == 0) {
				field1115[field1114++] = var6;
				var7.field411 = field1385;
			} else {
				int var9 = arg1.method249(2);
				if (var9 == 0) {
					field1115[field1114++] = var6;
					var7.field411 = field1385;
					field1117[field1116++] = var6;
				} else if (var9 == 1) {
					field1115[field1114++] = var6;
					var7.field411 = field1385;
					int var10 = arg1.method249(3);
					var7.method124(var10, false);
					int var11 = arg1.method249(1);
					if (var11 == 1) {
						field1117[field1116++] = var6;
					}
				} else if (var9 == 2) {
					field1115[field1114++] = var6;
					var7.field411 = field1385;
					int var12 = arg1.method249(3);
					var7.method124(var12, true);
					int var13 = arg1.method249(3);
					var7.method124(var13, true);
					int var14 = arg1.method249(1);
					if (var14 == 1) {
						field1117[field1116++] = var6;
					}
				} else if (var9 == 3) {
					field1148[field1147++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void refresh() {
		field1293 = true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var10 = null;
		for (LocChange var11 = (LocChange) field1028.method257(); var11 != null; var11 = (LocChange) field1028.method259()) {
			if (var11.field637 == arg7 && var11.field639 == arg0 && var11.field640 == arg6 && var11.field638 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LocChange();
			var10.field637 = arg7;
			var10.field638 = arg5;
			var10.field639 = arg0;
			var10.field640 = arg6;
			method452(var10);
			field1028.method254(var10);
		}

		var10.field644 = arg3;
		var10.field646 = arg1;
		var10.field645 = arg4;
		var10.field647 = arg8;
		var10.field648 = arg2;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method501() {
		field1031 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1393[var1] = -1;
			for (int var2 = 0; var2 < IdkType.field955; var2++) {
				if (!IdkType.field956[var2].field962 && IdkType.field956[var2].field957 == var1 + (field1368 ? 0 : 7)) {
					field1393[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method502(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1236; var2++) {
			if (arg0.equalsIgnoreCase(field1354[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1243.field421)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method503() {
		SignLink.midifade = 0;
		SignLink.midi = "stop";
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method504(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1236; var3++) {
				if (field1042[var3] == arg0) {
					field1236--;
					field1054 = true;

					for (int var4 = var3; var4 < field1236; var4++) {
						field1354[var4] = field1354[var4 + 1];
						field1282[var4] = field1282[var4 + 1];
						field1042[var4] = field1042[var4 + 1];
					}

					field1224.method227(69);
					field1224.method234(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method505() {
		int var1 = field1345 * 128 + 64;
		int var2 = field1346 * 128 + 64;
		int var3 = method473(var2, field1290, var1) - field1347;

		if (field1429 < var1) {
			field1429 += (var1 - field1429) * field1349 / 1000 + field1348;
			if (field1429 > var1) {
				field1429 = var1;
			}
		}

		if (field1429 > var1) {
			field1429 -= (field1429 - var1) * field1349 / 1000 + field1348;
			if (field1429 < var1) {
				field1429 = var1;
			}
		}

		if (field1430 < var3) {
			field1430 += (var3 - field1430) * field1349 / 1000 + field1348;
			if (field1430 > var3) {
				field1430 = var3;
			}
		}

		if (field1430 > var3) {
			field1430 -= (field1430 - var3) * field1349 / 1000 + field1348;
			if (field1430 < var3) {
				field1430 = var3;
			}
		}

		if (field1431 < var2) {
			field1431 += (var2 - field1431) * field1349 / 1000 + field1348;
			if (field1431 > var2) {
				field1431 = var2;
			}
		}

		if (field1431 > var2) {
			field1431 -= (field1431 - var2) * field1349 / 1000 + field1348;
			if (field1431 < var2) {
				field1431 = var2;
			}
		}

		int var4 = field1277 * 128 + 64;
		int var5 = field1278 * 128 + 64;
		int var6 = method473(var5, field1290, var4) - field1279;
		int var7 = var4 - field1429;
		int var8 = var6 - field1430;
		int var9 = var5 - field1431;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1432 < var11) {
			field1432 += (var11 - field1432) * field1281 / 1000 + field1280;
			if (field1432 > var11) {
				field1432 = var11;
			}
		}

		if (field1432 > var11) {
			field1432 -= (field1432 - var11) * field1281 / 1000 + field1280;
			if (field1432 < var11) {
				field1432 = var11;
			}
		}

		int var13 = var12 - field1433;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1433 += field1281 * var13 / 1000 + field1280;
			field1433 &= 0x7FF;
		}

		if (var13 < 0) {
			field1433 -= -var13 * field1281 / 1000 + field1280;
			field1433 &= 0x7FF;
		}

		int var14 = var12 - field1433;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1433 = var12;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method506(String arg0) throws IOException {
		if (SignLink.mainapp != null) {
			return SignLink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.C(I)Ljava/net/Socket;")
	public final Socket method507(int arg0) throws IOException {
		if (SignLink.mainapp != null) {
			return SignLink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (SignLink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			SignLink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method508() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1102 != -1 && field1102 == field1029) {
				if (var1 == 8 && field1170.length() > 0) {
					field1170 = field1170.substring(0, field1170.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1170.length() < 12) {
					field1170 = field1170 + (char) var1;
				}
			} else if (field1418) {
				if (var1 >= 32 && var1 <= 122 && field1262.length() < 80) {
					field1262 = field1262 + (char) var1;
					field1067 = true;
				}

				if (var1 == 8 && field1262.length() > 0) {
					field1262 = field1262.substring(0, field1262.length() - 1);
					field1067 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1418 = false;
					field1067 = true;

					if (field1086 == 1) {
						long var2 = JString.method309(field1262);
						method472(var2);
					}

					if (field1086 == 2 && field1236 > 0) {
						long var4 = JString.method309(field1262);
						method504(var4);
					}

					if (field1086 == 3 && field1262.length() > 0) {
						field1224.method227(170);
						field1224.method228(0);
						int var6 = field1224.field621;
						field1224.method234(field1417);
						WordPack.method317(field1262, field1224);
						field1224.method237(field1224.field621 - var6);
						field1262 = JString.method314(field1262);
						field1262 = WordFilter.method399(field1262);
						method431(field1262, JString.method313(JString.method310(field1417)), 6);

						if (field1373 == 2) {
							field1373 = 1;
							field1409 = true;
							field1224.method227(98);
							field1224.method228(field1228);
							field1224.method228(field1373);
							field1224.method228(field1104);
						}
					}

					if (field1086 == 4 && field1183 < 100) {
						long var7 = JString.method309(field1262);
						method446(var7);
					}

					if (field1086 == 5 && field1183 > 0) {
						long var9 = JString.method309(field1262);
						method474(var9);
					}
				}
			} else if (field1197) {
				if (var1 >= 48 && var1 <= 57 && field1161.length() < 10) {
					field1161 = field1161 + (char) var1;
					field1067 = true;
				}

				if (var1 == 8 && field1161.length() > 0) {
					field1161 = field1161.substring(0, field1161.length() - 1);
					field1067 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1161.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1161);
						} catch (Exception var16) {
						}

						field1224.method227(190);
						field1224.method232(var11);
					}

					field1197 = false;
					field1067 = true;
				}
			} else if (field1216 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1392.length() < 80) {
					field1392 = field1392 + (char) var1;
					field1067 = true;
				}

				if (var1 == 8 && field1392.length() > 0) {
					field1392 = field1392.substring(0, field1392.length() - 1);
					field1067 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1392.length() > 0) {
					if (field1198 == 2) {
						if (field1392.equals("::clientdrop")) {
							method429();
						}

						if (field1392.equals("::lag")) {
							method493();
						}

						if (field1392.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field1329.method281(2); var12++) {
								field1329.method291(2, var12, (byte) 1);
							}
						}
					}

					if (field1392.startsWith("::")) {
						field1224.method227(76);
						field1224.method228(field1392.length() - 1);
						field1224.method235(field1392.substring(2));
					} else {
						byte var13 = 0;
						if (field1392.startsWith("yellow:")) {
							var13 = 0;
							field1392 = field1392.substring(7);
						}

						if (field1392.startsWith("red:")) {
							var13 = 1;
							field1392 = field1392.substring(4);
						}

						if (field1392.startsWith("green:")) {
							var13 = 2;
							field1392 = field1392.substring(6);
						}

						if (field1392.startsWith("cyan:")) {
							var13 = 3;
							field1392 = field1392.substring(5);
						}

						if (field1392.startsWith("purple:")) {
							var13 = 4;
							field1392 = field1392.substring(7);
						}

						if (field1392.startsWith("white:")) {
							var13 = 5;
							field1392 = field1392.substring(6);
						}

						if (field1392.startsWith("flash1:")) {
							var13 = 6;
							field1392 = field1392.substring(7);
						}

						if (field1392.startsWith("flash2:")) {
							var13 = 7;
							field1392 = field1392.substring(7);
						}

						if (field1392.startsWith("flash3:")) {
							var13 = 8;
							field1392 = field1392.substring(7);
						}

						if (field1392.startsWith("glow1:")) {
							var13 = 9;
							field1392 = field1392.substring(6);
						}

						if (field1392.startsWith("glow2:")) {
							var13 = 10;
							field1392 = field1392.substring(6);
						}

						if (field1392.startsWith("glow3:")) {
							var13 = 11;
							field1392 = field1392.substring(6);
						}

						byte var14 = 0;
						if (field1392.startsWith("wave:")) {
							var14 = 1;
							field1392 = field1392.substring(5);
						}

						if (field1392.startsWith("scroll:")) {
							var14 = 2;
							field1392 = field1392.substring(7);
						}

						field1224.method227(171);
						field1224.method228(0);
						int var15 = field1224.field621;
						field1224.method228(var13);
						field1224.method228(var14);
						WordPack.method317(field1392, field1224);
						field1224.method237(field1224.field621 - var15);
						field1392 = JString.method314(field1392);
						field1392 = WordFilter.method399(field1392);
						field1243.field378 = field1392;
						field1243.field380 = var13;
						field1243.field381 = var14;
						field1243.field379 = 150;

						if (field1198 == 2) {
							method431(field1243.field378, "@cr2@" + field1243.field421, 2);
						} else if (field1198 == 1) {
							method431(field1243.field378, "@cr1@" + field1243.field421, 2);
						} else {
							method431(field1243.field378, field1243.field421, 2);
						}

						if (field1228 == 2) {
							field1228 = 3;
							field1409 = true;
							field1224.method227(98);
							field1224.method228(field1228);
							field1224.method228(field1373);
							field1224.method228(field1104);
						}
					}

					field1392 = "";
					field1067 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method509() {
		if (field1378 == 2) {
			method480((field1173 - field1166 << 7) + field1176, field1174 * 2, (field1172 - field1165 << 7) + field1175);

			if (field1122 > -1 && field1385 % 20 < 10) {
				field1209[2].method198(field1122 - 12, field1123 - 28);
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method510(int arg0) {
		int var2 = VarpType.field1004[arg0].field1012;
		if (var2 != 0) {
			int var3 = field1107[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					Pix3D.method185(0.9D);
				}

				if (var3 == 2) {
					Pix3D.method185(0.8D);
				}

				if (var3 == 3) {
					Pix3D.method185(0.7D);
				}

				if (var3 == 4) {
					Pix3D.method185(0.6D);
				}

				ObjType.field934.method116();
				field1293 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1272;

				if (var3 == 0) {
					method534(0, field1272);
					field1272 = true;
				}

				if (var3 == 1) {
					method534(-400, field1272);
					field1272 = true;
				}

				if (var3 == 2) {
					method534(-800, field1272);
					field1272 = true;
				}

				if (var3 == 3) {
					method534(-1200, field1272);
					field1272 = true;
				}

				if (var3 == 4) {
					field1272 = false;
				}

				if (field1272 != var4 && !field1221) {
					if (field1272) {
						field1366 = field1284;
						field1367 = false;
						field1329.method288(2, field1366);
					} else {
						method503();
					}

					field1040 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1407 = true;
					method463(0);
				}

				if (var3 == 1) {
					field1407 = true;
					method463(-400);
				}

				if (var3 == 2) {
					field1407 = true;
					method463(-800);
				}

				if (var3 == 3) {
					field1407 = true;
					method463(-1200);
				}

				if (var3 == 4) {
					field1407 = false;
				}
			}

			if (var2 == 5) {
				field1328 = var3;
			}

			if (var2 == 6) {
				field1158 = var3;
			}

			if (var2 == 8) {
				field1171 = var3;
				field1067 = true;
			}

			if (var2 == 9) {
				field1350 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIILgc;)V")
	public final void method511(int arg0, int arg1, int arg2, NpcType arg3) {
		if (field1362 < 400) {
			String var5 = arg3.field862;
			if (arg3.field880 != 0) {
				var5 = var5 + method469(arg3.field880, field1243.field427) + " (level-" + arg3.field880 + ")";
			}

			if (field1305 == 1) {
				field1376[field1362] = "Use " + field1309 + " with @yel@" + var5;
				field1038[field1362] = 900;
				field1039[field1362] = arg2;
				field1036[field1362] = arg1;
				field1037[field1362] = arg0;
				field1362++;
			} else if (field1133 != 1) {
				if (arg3.field875 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg3.field875[var6] != null && !arg3.field875[var6].equalsIgnoreCase("attack")) {
							field1376[field1362] = arg3.field875[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1038[field1362] = 728;
							}

							if (var6 == 1) {
								field1038[field1362] = 542;
							}

							if (var6 == 2) {
								field1038[field1362] = 6;
							}

							if (var6 == 3) {
								field1038[field1362] = 963;
							}

							if (var6 == 4) {
								field1038[field1362] = 245;
							}

							field1039[field1362] = arg2;
							field1036[field1362] = arg1;
							field1037[field1362] = arg0;
							field1362++;
						}
					}
				}

				if (arg3.field875 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg3.field875[var7] != null && arg3.field875[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg3.field880 > field1243.field427) {
								var8 = 2000;
							}

							field1376[field1362] = arg3.field875[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1038[field1362] = var8 + 728;
							}

							if (var7 == 1) {
								field1038[field1362] = var8 + 542;
							}

							if (var7 == 2) {
								field1038[field1362] = var8 + 6;
							}

							if (var7 == 3) {
								field1038[field1362] = var8 + 963;
							}

							if (var7 == 4) {
								field1038[field1362] = var8 + 245;
							}

							field1039[field1362] = arg2;
							field1036[field1362] = arg1;
							field1037[field1362] = arg0;
							field1362++;
						}
					}
				}

				field1376[field1362] = "Examine @yel@" + var5;
				field1038[field1362] = 1607;
				field1039[field1362] = arg2;
				field1036[field1362] = arg1;
				field1037[field1362] = arg0;
				field1362++;
			} else if ((field1135 & 0x2) == 2) {
				field1376[field1362] = field1136 + " @yel@" + var5;
				field1038[field1362] = 265;
				field1039[field1362] = arg2;
				field1036[field1362] = arg1;
				field1037[field1362] = arg0;
				field1362++;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method512(int arg0) {
		if (arg0 >= 0) {
			if (field1197) {
				field1197 = false;
				field1067 = true;
			}

			int var2 = field1036[arg0];
			int var3 = field1037[arg0];
			int var4 = field1038[arg0];
			int var5 = field1039[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 1501) {
				field1343 += field1166;
				if (field1343 >= 92) {
					field1224.method227(177);
					field1224.method232(0);
				}

				method436(243, var2, var5, var3);
			}

			if (var4 == 34) {
				String var6 = field1376[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					method450();
					field1170 = var6.substring(var7 + 5).trim();
					field1264 = false;

					for (int var8 = 0; var8 < Component.field57.length; var8++) {
						if (Component.field57[var8] != null && Component.field57[var8].field66 == 600) {
							field1029 = field1102 = Component.field57[var8].field63;
							break;
						}
					}
				}
			}

			if (var4 == 367) {
				PlayerEntity var9 = field1113[var5];
				if (var9 != null) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var9.field415[0], 0, var9.field416[0], 1, field1243.field415[0]);
					field1396 = field24;
					field1397 = field25;
					field1399 = 2;
					field1398 = 0;
					field1224.method227(48);
					field1224.method229(var5);
					field1224.method229(field1308);
					field1224.method229(field1306);
					field1224.method229(field1307);
				}
			}

			if (var4 == 951) {
				Component var10 = Component.field57[var3];
				boolean var11 = true;
				if (var10.field66 > 0) {
					var11 = method532(var10);
				}

				if (var11) {
					field1224.method227(39);
					field1224.method229(var3);
				}
			}

			if (var4 == 217) {
				boolean var12 = method515(0, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 0, field1243.field415[0]);
				if (!var12) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 1, field1243.field415[0]);
				}

				field1396 = field24;
				field1397 = field25;
				field1399 = 2;
				field1398 = 0;
				field1224.method227(111);
				field1224.method229(field1165 + var2);
				field1224.method229(field1166 + var3);
				field1224.method229(var5);
				field1224.method229(field1308);
				field1224.method229(field1306);
				field1224.method229(field1307);
			}

			if (var4 == 450 && method436(106, var2, var5, var3)) {
				field1224.method229(field1308);
				field1224.method229(field1306);
				field1224.method229(field1307);
			}

			if (var4 == 265) {
				NpcEntity var14 = field1251[var5];
				if (var14 != null) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var14.field415[0], 0, var14.field416[0], 1, field1243.field415[0]);
					field1396 = field24;
					field1397 = field25;
					field1399 = 2;
					field1398 = 0;
					field1224.method227(101);
					field1224.method229(var5);
					field1224.method229(field1134);
				}
			}

			if (var4 == 364) {
				method436(19, var2, var5, var3);
			}

			if (var4 == 55 && method436(182, var2, var5, var3)) {
				field1224.method229(field1134);
			}

			if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
				boolean var15 = method515(0, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 0, field1243.field415[0]);
				if (!var15) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 1, field1243.field415[0]);
				}

				field1396 = field24;
				field1397 = field25;
				field1399 = 2;
				field1398 = 0;

				if (var4 == 99) {
					field1224.method227(27);
				}

				if (var4 == 993) {
					field1224.method227(110);
				}

				if (var4 == 224) {
					field1224.method227(231);
				}

				if (var4 == 877) {
					field1224.method227(225);
				}

				if (var4 == 746) {
					field1224.method227(17);
				}

				field1224.method229(field1165 + var2);
				field1224.method229(field1166 + var3);
				field1224.method229(var5);
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field1313++;
				}

				if (field1313 >= 99) {
					field1224.method227(47);
					field1224.method232(0);
				}

				method436(55, var2, var5, var3);
			}

			if (var4 == 679) {
				String var17 = field1376[arg0];
				int var18 = var17.indexOf("@whi@");
				if (var18 != -1) {
					long var19 = JString.method309(var17.substring(var18 + 5).trim());
					int var21 = -1;
					for (int var22 = 0; var22 < field1236; var22++) {
						if (field1042[var22] == var19) {
							var21 = var22;
							break;
						}
					}

					if (var21 != -1 && field1282[var21] > 0) {
						field1067 = true;
						field1197 = false;
						field1418 = true;
						field1262 = "";
						field1086 = 3;
						field1417 = field1042[var21];
						field1047 = "Enter message to send to " + field1354[var21];
					}
				}
			}

			if (var4 == 960) {
				field1224.method227(39);
				field1224.method229(var3);
				Component var23 = Component.field57[var3];
				if (var23.field72 != null && var23.field72[0][0] == 5) {
					int var24 = var23.field72[0][1];
					if (field1107[var24] != var23.field74[0]) {
						field1107[var24] = var23.field74[0];
						method510(var24);
						field1054 = true;
					}
				}
			}

			if (var4 == 1175) {
				int var25 = var5 >> 14 & 0x7FFF;
				LocType var26 = LocType.method333(var25);
				String var27;
				if (var26.field819 == null) {
					var27 = "It's a " + var26.field818 + ".";
				} else {
					var27 = new String(var26.field819);
				}

				method431(var27, "", 0);
			}

			if (var4 == 881) {
				field1224.method227(58);
				field1224.method229(var5);
				field1224.method229(var2);
				field1224.method229(var3);
				field1224.method229(field1308);
				field1224.method229(field1306);
				field1224.method229(field1307);
				field1125 = 0;
				field1126 = var3;
				field1127 = var2;
				field1128 = 2;
				if (Component.field57[var3].field63 == field1102) {
					field1128 = 1;
				}

				if (Component.field57[var3].field63 == field1216) {
					field1128 = 3;
				}
			}

			if (var4 == 44 && !field1406) {
				field1224.method227(11);
				field1224.method229(var3);
				field1406 = true;
			}

			if (var4 == 285) {
				method436(238, var2, var5, var3);
			}

			if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
				String var28 = field1376[arg0];
				int var29 = var28.indexOf("@whi@");
				if (var29 != -1) {
					long var30 = JString.method309(var28.substring(var29 + 5).trim());
					if (var4 == 406) {
						method472(var30);
					}

					if (var4 == 436) {
						method446(var30);
					}

					if (var4 == 557) {
						method504(var30);
					}

					if (var4 == 556) {
						method474(var30);
					}
				}
			}

			if (var4 == 947) {
				method450();
			}

			if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
				if (var4 == 347) {
					field1224.method227(133);
				}

				if (var4 == 422) {
					field1224.method227(221);
				}

				if (var4 == 478) {
					if ((var2 & 0x3) == 0) {
						field1053++;
					}

					if (field1053 >= 90) {
						field1224.method227(7);
					}

					field1224.method227(6);
				}

				if (var4 == 405) {
					field1400 += var5;
					if (field1400 >= 97) {
						field1224.method227(37);
						field1224.method231(0xE42D58);
					}

					field1224.method227(228);
				}

				if (var4 == 38) {
					field1224.method227(166);
				}

				field1224.method229(var5);
				field1224.method229(var2);
				field1224.method229(var3);
				field1125 = 0;
				field1126 = var3;
				field1127 = var2;
				field1128 = 2;
				if (Component.field57[var3].field63 == field1102) {
					field1128 = 1;
				}

				if (Component.field57[var3].field63 == field1216) {
					field1128 = 3;
				}
			}

			if (var4 == 965) {
				boolean var32 = method515(0, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 0, field1243.field415[0]);
				if (!var32) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var2, 0, var3, 1, field1243.field415[0]);
				}

				field1396 = field24;
				field1397 = field25;
				field1399 = 2;
				field1398 = 0;
				field1224.method227(25);
				field1224.method229(field1165 + var2);
				field1224.method229(field1166 + var3);
				field1224.method229(var5);
				field1224.method229(field1134);
			}

			if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
				if (var4 == 415) {
					if ((var3 & 0x3) == 0) {
						field1414++;
					}

					if (field1414 >= 55) {
						field1224.method227(50);
						field1224.method232(0);
					}

					field1224.method227(212);
				}

				if (var4 == 22) {
					field1224.method227(158);
				}

				if (var4 == 596) {
					field1224.method227(193);
				}

				if (var4 == 892) {
					if ((var2 & 0x3) == 0) {
						field1356++;
					}

					if (field1356 >= 130) {
						field1224.method227(169);
						field1224.method228(177);
					}

					field1224.method227(204);
				}

				if (var4 == 602) {
					field1224.method227(153);
				}

				field1224.method229(var5);
				field1224.method229(var2);
				field1224.method229(var3);
				field1125 = 0;
				field1126 = var3;
				field1127 = var2;
				field1128 = 2;
				if (Component.field57[var3].field63 == field1102) {
					field1128 = 1;
				}

				if (Component.field57[var3].field63 == field1216) {
					field1128 = 3;
				}
			}

			if (var4 == 465) {
				field1224.method227(39);
				field1224.method229(var3);
				Component var34 = Component.field57[var3];
				if (var34.field72 != null && var34.field72[0][0] == 5) {
					int var35 = var34.field72[0][1];
					field1107[var35] = 1 - field1107[var35];
					method510(var35);
					field1054 = true;
				}
			}

			if (var4 == 900) {
				NpcEntity var36 = field1251[var5];
				if (var36 != null) {
					method515(1, field1243.field416[0], 0, 2, false, 0, var36.field415[0], 0, var36.field416[0], 1, field1243.field415[0]);
					field1396 = field24;
					field1397 = field25;
					field1399 = 2;
					field1398 = 0;
					field1224.method227(52);
					field1224.method229(var5);
					field1224.method229(field1308);
					field1224.method229(field1306);
					field1224.method229(field1307);
				}
			}

			if (var4 == 188) {
				field1305 = 1;
				field1306 = var2;
				field1307 = var3;
				field1308 = var5;
				field1309 = ObjType.method348(var5).field896;
				field1133 = 0;
				field1054 = true;
			} else {
				if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
					NpcEntity var37 = field1251[var5];
					if (var37 != null) {
						method515(1, field1243.field416[0], 0, 2, false, 0, var37.field415[0], 0, var37.field416[0], 1, field1243.field415[0]);
						field1396 = field24;
						field1397 = field25;
						field1399 = 2;
						field1398 = 0;

						if (var4 == 963) {
							field1224.method227(229);
						}

						if (var4 == 6) {
							if ((var5 & 0x3) == 0) {
								field1405++;
							}

							if (field1405 >= 124) {
								field1224.method227(218);
								field1224.method232(0);
							}

							field1224.method227(132);
						}

						if (var4 == 245) {
							if ((var5 & 0x3) == 0) {
								field1352++;
							}

							if (field1352 >= 85) {
								field1224.method227(34);
								field1224.method229(39596);
							}

							field1224.method227(102);
						}

						if (var4 == 728) {
							field1224.method227(222);
						}

						if (var4 == 542) {
							field1224.method227(84);
						}

						field1224.method229(var5);
					}
				}

				if (var4 == 391) {
					field1224.method227(143);
					field1224.method229(var5);
					field1224.method229(var2);
					field1224.method229(var3);
					field1224.method229(field1134);
					field1125 = 0;
					field1126 = var3;
					field1127 = var2;
					field1128 = 2;
					if (Component.field57[var3].field63 == field1102) {
						field1128 = 1;
					}

					if (Component.field57[var3].field63 == field1216) {
						field1128 = 3;
					}
				}

				if (var4 == 930) {
					Component var38 = Component.field57[var3];
					field1133 = 1;
					field1134 = var3;
					field1135 = var38.field115;
					field1305 = 0;
					field1054 = true;
					String var39 = var38.field113;
					if (var39.indexOf(" ") != -1) {
						var39 = var39.substring(0, var39.indexOf(" "));
					}

					String var40 = var38.field113;
					if (var40.indexOf(" ") != -1) {
						var40 = var40.substring(var40.indexOf(" ") + 1);
					}

					field1136 = var39 + " " + var38.field114 + " " + var40;

					if (field1135 == 16) {
						field1054 = true;
						field1057 = 3;
						field1204 = true;
					}
				} else {
					if (var4 == 660) {
						if (field1181) {
							field1088.method101(var3 - 4, var2 - 4);
						} else {
							field1088.method101(field25 - 4, field24 - 4);
						}
					}

					if (var4 == 903 || var4 == 363) {
						String var41 = field1376[arg0];
						int var42 = var41.indexOf("@whi@");
						if (var42 != -1) {
							var41 = var41.substring(var42 + 5).trim();
							String var43 = JString.method313(JString.method310(JString.method309(var41)));
							boolean var44 = false;
							for (int var45 = 0; var45 < field1114; var45++) {
								PlayerEntity var46 = field1113[field1115[var45]];
								if (var46 != null && var46.field421 != null && var46.field421.equalsIgnoreCase(var43)) {
									method515(1, field1243.field416[0], 0, 2, false, 0, var46.field415[0], 0, var46.field416[0], 1, field1243.field415[0]);

									if (var4 == 903) {
										field1224.method227(43);
									}

									if (var4 == 363) {
										field1224.method227(211);
									}

									field1224.method229(field1115[var45]);
									var44 = true;
									break;
								}
							}

							if (!var44) {
								method431("Unable to find " + var43, "", 0);
							}
						}
					}

					if (var4 == 1607) {
						NpcEntity var47 = field1251[var5];
						if (var47 != null) {
							String var48;
							if (var47.field420.field863 == null) {
								var48 = "It's a " + var47.field420.field862 + ".";
							} else {
								var48 = new String(var47.field420.field863);
							}

							method431(var48, "", 0);
						}
					}

					if (var4 == 651) {
						PlayerEntity var49 = field1113[var5];
						if (var49 != null) {
							method515(1, field1243.field416[0], 0, 2, false, 0, var49.field415[0], 0, var49.field416[0], 1, field1243.field415[0]);
							field1396 = field24;
							field1397 = field25;
							field1399 = 2;
							field1398 = 0;
							field1224.method227(73);
							field1224.method229(var5);
							field1224.method229(field1134);
						}
					}

					if (var4 == 1102) {
						ObjType var50 = ObjType.method348(var5);
						String var51;
						if (var50.field897 == null) {
							var51 = "It's a " + var50.field896 + ".";
						} else {
							var51 = new String(var50.field897);
						}

						method431(var51, "", 0);
					}

					if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
						PlayerEntity var52 = field1113[var5];
						if (var52 != null) {
							method515(1, field1243.field416[0], 0, 2, false, 0, var52.field415[0], 0, var52.field416[0], 1, field1243.field415[0]);
							field1396 = field24;
							field1397 = field25;
							field1399 = 2;
							field1398 = 0;

							if (var4 == 1544) {
								field1224.method227(64);
							}

							if (var4 == 1373) {
								field1224.method227(43);
							}

							if (var4 == 151) {
								field1206++;
								if (field1206 >= 90) {
									field1224.method227(100);
									field1224.method229(31114);
								}

								field1224.method227(219);
							}

							if (var4 == 1101) {
								field1224.method227(211);
							}

							field1224.method229(var5);
						}
					}

					if (var4 == 504) {
						method436(38, var2, var5, var3);
					}

					if (var4 == 1773) {
						ObjType var53 = ObjType.method348(var5);
						String var54;
						if (var3 >= 100000) {
							var54 = var3 + " x " + var53.field896;
						} else if (var53.field897 == null) {
							var54 = "It's a " + var53.field896 + ".";
						} else {
							var54 = new String(var53.field897);
						}

						method431(var54, "", 0);
					}

					field1305 = 0;
					field1133 = 0;
					field1054 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method513() {
		for (LocChange var1 = (LocChange) field1028.method257(); var1 != null; var1 = (LocChange) field1028.method259()) {
			if (var1.field648 == -1) {
				var1.field647 = 0;
				method452(var1);
			} else {
				var1.method119();
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method514() {
		try {
			int var1 = field1243.field366 + field1295;
			int var2 = field1243.field367 + field1096;
			if (field1287 - var1 < -500 || field1287 - var1 > 500 || field1288 - var2 < -500 || field1288 - var2 > 500) {
				field1287 = var1;
				field1288 = var2;
			}

			if (field1287 != var1) {
				field1287 += (var1 - field1287) / 16;
			}

			if (field1288 != var2) {
				field1288 += (var2 - field1288) / 16;
			}

			if (field27[1] == 1) {
				field1359 += (-field1359 - 24) / 2;
			} else if (field27[2] == 1) {
				field1359 += (24 - field1359) / 2;
			} else {
				field1359 /= 2;
			}

			if (field27[3] == 1) {
				field1360 += (12 - field1360) / 2;
			} else if (field27[4] == 1) {
				field1360 += (-field1360 - 12) / 2;
			} else {
				field1360 /= 2;
			}

			field1358 = field1359 / 2 + field1358 & 0x7FF;
			field1357 += field1360 / 2;
			if (field1357 < 128) {
				field1357 = 128;
			}

			if (field1357 > 383) {
				field1357 = 383;
			}

			int var3 = field1287 >> 7;
			int var4 = field1288 >> 7;
			int var5 = method473(field1288, field1290, field1287);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1290;
						if (var9 < 3 && (field1110[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1229[var9][var7][var8];
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

			if (var11 > field1058) {
				field1058 += (var11 - field1058) / 24;
			} else if (var11 < field1058) {
				field1058 += (var11 - field1058) / 80;
			}
		} catch (Exception var12) {
			SignLink.reporterror("glfc_ex " + field1243.field366 + "," + field1243.field367 + "," + field1287 + "," + field1288 + "," + field1386 + "," + field1387 + "," + field1165 + "," + field1166);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZIIIIZIIIIII)Z")
	public final boolean method515(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1101[var14][var15] = 0;
				field1070[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg1;
		field1101[arg10][arg1] = 99;
		field1070[arg10][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1318[var18] = arg10;
		int var35 = var18 + 1;
		field1319[var18] = arg1;
		boolean var20 = false;
		int var21 = field1318.length;
		int[][] var22 = field1353[field1290].field941;
		while (var35 != var19) {
			var16 = field1318[var19];
			var17 = field1319[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field1353[field1290].method368(arg6, arg7 - 1, arg8, var17, var16, arg5)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field1353[field1290].method369(var17, var16, arg6, arg7 - 1, arg5, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg9 != 0 && field1353[field1290].method370(arg0, var16, arg6, arg8, arg2, var17, arg9)) {
				var20 = true;
				break;
			}

			int var23 = field1070[var16][var17] + 1;
			if (var16 > 0 && field1101[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1318[var35] = var16 - 1;
				field1319[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1101[var16 - 1][var17] = 2;
				field1070[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1101[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1318[var35] = var16 + 1;
				field1319[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1101[var16 + 1][var17] = 8;
				field1070[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1101[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1318[var35] = var16;
				field1319[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1101[var16][var17 - 1] = 1;
				field1070[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1101[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1318[var35] = var16;
				field1319[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1101[var16][var17 + 1] = 4;
				field1070[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1101[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1318[var35] = var16 - 1;
				field1319[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1101[var16 - 1][var17 - 1] = 3;
				field1070[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1101[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1318[var35] = var16 + 1;
				field1319[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1101[var16 + 1][var17 - 1] = 9;
				field1070[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1101[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1318[var35] = var16 - 1;
				field1319[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1101[var16 - 1][var17 + 1] = 6;
				field1070[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1101[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1318[var35] = var16 + 1;
				field1319[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1101[var16 + 1][var17 + 1] = 12;
				field1070[var16 + 1][var17 + 1] = var23;
			}
		}

		field1344 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1070[var26][var27] < var24) {
								var24 = field1070[var26][var27];
								var16 = var26;
								var17 = var27;
								field1344 = 1;
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
		field1318[var28] = var16;
		int var36 = var28 + 1;
		field1319[var28] = var17;
		int var29;
		int var30 = var29 = field1101[var16][var17];
		while (arg10 != var16 || arg1 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1318[var36] = var16;
				field1319[var36++] = var17;
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

			var30 = field1101[var16][var17];
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
		int var32 = field1318[var36];
		int var33 = field1319[var36];

		if (arg3 == 0) {
			field1224.method227(63);
			field1224.method228(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field1224.method227(56);
			field1224.method228(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field1224.method227(167);
			field1224.method228(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1224.method228(1);
		} else {
			field1224.method228(0);
		}

		field1224.method229(field1165 + var32);
		field1224.method229(field1166 + var33);
		field1273 = field1318[0];
		field1274 = field1319[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1224.method228(field1318[var36] - var32);
			field1224.method228(field1319[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method516(Component arg0) {
		if (arg0.field73 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field73.length; var2++) {
			int var3 = method526(arg0, var2);
			int var4 = arg0.field74[var2];
			if (arg0.field73[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field73[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field73[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method517() {
		method540();
		field1190.method267();
		field1186.method211(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (field1233 == 0) {
			int var3 = var2 / 2 + 80;
			field1254.method214(var1 / 2, true, field1329.field731, var3, 0x75A9A9);
			int var4 = var2 / 2 - 20;
			field1256.method214(var1 / 2, true, "Welcome to RuneScape", var4, 0xFFFF00);
			var4 += 30;
			int var5 = var1 / 2 - 80;
			int var6 = var2 / 2 + 20;
			field1187.method211(var5 - 73, var6 - 20);
			field1256.method214(var5, true, "New user", var6 + 5, 0xFFFFFF);
			int var7 = var1 / 2 + 80;
			field1187.method211(var7 - 73, var6 - 20);
			field1256.method214(var7, true, "Existing User", var6 + 5, 0xFFFFFF);
		}

		if (field1233 == 2) {
			int var8 = var2 / 2 - 40;
			if (field1315.length() > 0) {
				field1256.method214(var1 / 2, true, field1315, var8 - 15, 0xFFFF00);
				field1256.method214(var1 / 2, true, field1316, var8, 0xFFFF00);
				var8 += 30;
			} else {
				field1256.method214(var1 / 2, true, field1316, var8 - 7, 0xFFFF00);
				var8 += 30;
			}

			field1256.method218(0xFFFFFF, var1 / 2 - 90, true, var8, "Username: " + field1374 + (field1330 == 0 & field1385 % 40 < 20 ? "@yel@|" : ""));
			var8 += 15;
			field1256.method218(0xFFFFFF, var1 / 2 - 88, true, var8, "Password: " + JString.method315(field1375) + (field1330 == 1 & field1385 % 40 < 20 ? "@yel@|" : ""));
			var8 += 15;
			int var9 = var1 / 2 - 80;
			int var10 = var2 / 2 + 50;
			field1187.method211(var9 - 73, var10 - 20);
			field1256.method214(var9, true, "Login", var10 + 5, 0xFFFFFF);
			int var11 = var1 / 2 + 80;
			field1187.method211(var11 - 73, var10 - 20);
			field1256.method214(var11, true, "Cancel", var10 + 5, 0xFFFFFF);
		}

		if (field1233 == 3) {
			field1256.method214(var1 / 2, true, "Create a free account", var2 / 2 - 60, 0xFFFF00);
			int var12 = var2 / 2 - 35;
			field1256.method214(var1 / 2, true, "To create a new account you need to", var12, 0xFFFFFF);
			var12 += 15;
			field1256.method214(var1 / 2, true, "go back to the main RuneScape webpage", var12, 0xFFFFFF);
			var12 += 15;
			field1256.method214(var1 / 2, true, "and choose the red 'create account'", var12, 0xFFFFFF);
			var12 += 15;
			field1256.method214(var1 / 2, true, "button at the top right of that page.", var12, 0xFFFFFF);
			var12 += 15;
			int var13 = var1 / 2;
			int var14 = var2 / 2 + 50;
			field1187.method211(var13 - 73, var14 - 20);
			field1256.method214(var13, true, "Cancel", var14 + 5, 0xFFFFFF);
		}

		field1190.method268(graphics, 171, 202);

		if (field1293) {
			field1293 = false;
			field1188.method268(graphics, 0, 128);
			field1189.method268(graphics, 371, 202);
			field1193.method268(graphics, 265, 0);
			field1194.method268(graphics, 265, 562);
			field1195.method268(graphics, 171, 128);
			field1196.method268(graphics, 171, 562);
		}
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method518(int arg0, Packet arg1) {
		while (arg1.field622 + 21 < arg0 * 8) {
			int var3 = arg1.method249(13);
			if (var3 == 8191) {
				break;
			}

			if (field1251[var3] == null) {
				field1251[var3] = new NpcEntity();
			}

			NpcEntity var4 = field1251[var3];
			field1253[field1252++] = var3;
			var4.field411 = field1385;
			var4.field420 = NpcType.method342(arg1.method249(11));
			var4.field370 = var4.field420.field864;
			var4.field373 = var4.field420.field868;
			var4.field374 = var4.field420.field869;
			var4.field375 = var4.field420.field870;
			var4.field376 = var4.field420.field871;
			var4.field371 = var4.field420.field867;
			int var5 = arg1.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method123(false, field1243.field415[0] + var5, field1243.field416[0] + var6);
			int var7 = arg1.method249(1);
			if (var7 == 1) {
				field1117[field1116++] = var3;
			}
		}

		arg1.method250();
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method519(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.H(I)I")
	public final int method520() {
		int var1 = 3;
		if (field1432 < 310) {
			int var2 = field1429 >> 7;
			int var3 = field1431 >> 7;
			int var4 = field1243.field366 >> 7;
			int var5 = field1243.field367 >> 7;

			if ((field1110[field1290][var2][var3] & 0x4) != 0) {
				var1 = field1290;
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

					if ((field1110[field1290][var2][var3] & 0x4) != 0) {
						var1 = field1290;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1110[field1290][var2][var3] & 0x4) != 0) {
							var1 = field1290;
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

					if ((field1110[field1290][var2][var3] & 0x4) != 0) {
						var1 = field1290;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1110[field1290][var2][var3] & 0x4) != 0) {
							var1 = field1290;
						}
					}
				}
			}
		}

		if ((field1110[field1290][field1243.field366 >> 7][field1243.field367 >> 7] & 0x4) != 0) {
			var1 = field1290;
		}

		return var1;
	}

	@ObfuscatedName("client.I(I)I")
	public final int method521() {
		int var1 = method473(field1431, field1290, field1429);
		if (var1 - field1430 < 800 && (field1110[field1290][field1429 >> 7][field1431 >> 7] & 0x4) != 0) {
			return field1290;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void method522(int arg0, Packet arg1, int arg2, PlayerEntity arg3) {
		if ((arg0 & 0x1) == 1) {
			int var5 = arg1.method238();
			byte[] var6 = new byte[var5];
			Packet var7 = new Packet(var6);
			arg1.method247(var6, 0, var5);
			field1118[arg2] = var7;
			arg3.method129(var7);
		}

		if ((arg0 & 0x2) == 2) {
			int var8 = arg1.method240();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field394 == var8) {
				arg3.field398 = 0;
			}

			int var9 = arg1.method238();
			if (arg3.field394 == var8 && var8 != -1) {
				int var10 = SeqType.field973[var8].field987;
				if (var10 == 1) {
					arg3.field395 = 0;
					arg3.field396 = 0;
					arg3.field397 = var9;
					arg3.field398 = 0;
				}

				if (var10 == 2) {
					arg3.field398 = 0;
				}
			} else if (var8 == -1 || arg3.field394 == -1 || SeqType.field973[var8].field981 >= SeqType.field973[arg3.field394].field981) {
				arg3.field394 = var8;
				arg3.field395 = 0;
				arg3.field396 = 0;
				arg3.field397 = var9;
				arg3.field398 = 0;
				arg3.field419 = arg3.field414;
			}
		}

		if ((arg0 & 0x4) == 4) {
			arg3.field388 = arg1.method240();
			if (arg3.field388 == 0xFFFF) {
				arg3.field388 = -1;
			}
		}

		if ((arg0 & 0x8) == 8) {
			arg3.field378 = arg1.method245();
			arg3.field380 = 0;
			arg3.field381 = 0;
			arg3.field379 = 150;
			method431(arg3.field378, arg3.field421, 2);
		}

		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg1.method238();
			int var12 = arg1.method238();
			arg3.method127(var12, var11);
			arg3.field385 = field1385 + 300;
			arg3.field386 = arg1.method238();
			arg3.field387 = arg1.method238();
		}

		if ((arg0 & 0x20) == 0x20) {
			arg3.field389 = arg1.method240();
			arg3.field390 = arg1.method240();
		}

		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg1.method240();
			int var14 = arg1.method238();
			int var15 = arg1.method238();
			int var16 = arg1.field621;

			if (arg3.field421 != null && arg3.field422) {
				long var17 = JString.method309(arg3.field421);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1183; var20++) {
						if (field1164[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1184 == 0) {
					try {
						String var21 = WordPack.method316(var15, arg1);
						var21 = WordFilter.method399(var21);
						arg3.field378 = var21;
						arg3.field380 = var13 >> 8;
						arg3.field381 = var13 & 0xFF;
						arg3.field379 = 150;

						if (var14 == 2 || var14 == 3) {
							method431(var21, "@cr2@" + arg3.field421, 1);
						} else if (var14 == 1) {
							method431(var21, "@cr1@" + arg3.field421, 1);
						} else {
							method431(var21, arg3.field421, 2);
						}
					} catch (Exception var26) {
						SignLink.reporterror("cde2");
					}
				}
			}

			arg1.field621 = var15 + var16;
		}

		if ((arg0 & 0x100) == 0x100) {
			arg3.field399 = arg1.method240();
			int var23 = arg1.method243();
			arg3.field403 = var23 >> 16;
			arg3.field402 = (var23 & 0xFFFF) + field1385;
			arg3.field400 = 0;
			arg3.field401 = 0;

			if (arg3.field402 > field1385) {
				arg3.field400 = -1;
			}

			if (arg3.field399 == 0xFFFF) {
				arg3.field399 = -1;
			}
		}

		if ((arg0 & 0x200) == 0x200) {
			arg3.field404 = arg1.method238();
			arg3.field406 = arg1.method238();
			arg3.field405 = arg1.method238();
			arg3.field407 = arg1.method238();
			arg3.field408 = arg1.method240() + field1385;
			arg3.field409 = arg1.method240() + field1385;
			arg3.field410 = arg1.method238();
			arg3.method125();
		}

		if ((arg0 & 0x400) == 0x400) {
			int var24 = arg1.method238();
			int var25 = arg1.method238();
			arg3.method127(var25, var24);
			arg3.field385 = field1385 + 300;
			arg3.field386 = arg1.method238();
			arg3.field387 = arg1.method238();
		}
	}

	@ObfuscatedName("client.a(IIIIILd;I)V")
	public final void method523(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5) {
		if (arg4.field64 == 0 && arg4.field79 != null && !arg4.field78 && (arg0 >= arg3 && arg2 >= arg1 && arg0 <= arg4.field67 + arg3 && arg2 <= arg4.field68 + arg1)) {
			int var7 = arg4.field79.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg4.field80[var8] + arg3;
				int var10 = arg4.field81[var8] + arg1 - arg5;
				Component var11 = Component.field57[arg4.field79[var8]];
				var9 += var11.field70;
				var10 += var11.field71;
				if ((var11.field75 >= 0 || var11.field101 != 0) && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
					if (var11.field75 >= 0) {
						field1124 = var11.field75;
					} else {
						field1124 = var11.field62;
					}
				}

				if (var11.field64 == 0) {
					method523(arg0, var10, arg2, var9, var11, var11.field77);

					if (var11.field76 > var11.field68) {
						method542(var11, var10, true, arg2, var11.field68, var11.field76, arg0, var11.field67 + var9);
					}
				} else {
					if (var11.field65 == 1 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						boolean var12 = false;
						if (var11.field66 != 0) {
							var12 = method558(var11);
						}

						if (!var12) {
							field1376[field1362] = var11.field116;
							field1038[field1362] = 951;
							field1037[field1362] = var11.field62;
							field1362++;
						}
					}

					if (var11.field65 == 2 && field1133 == 0 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						String var13 = var11.field113;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1376[field1362] = var13 + " @gre@" + var11.field114;
						field1038[field1362] = 930;
						field1037[field1362] = var11.field62;
						field1362++;
					}

					if (var11.field65 == 3 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						field1376[field1362] = "Close";
						field1038[field1362] = 947;
						field1037[field1362] = var11.field62;
						field1362++;
					}

					if (var11.field65 == 4 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						field1376[field1362] = var11.field116;
						field1038[field1362] = 465;
						field1037[field1362] = var11.field62;
						field1362++;
					}

					if (var11.field65 == 5 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						field1376[field1362] = var11.field116;
						field1038[field1362] = 960;
						field1037[field1362] = var11.field62;
						field1362++;
					}

					if (var11.field65 == 6 && !field1406 && arg0 >= var9 && arg2 >= var10 && arg0 < var11.field67 + var9 && arg2 < var11.field68 + var10) {
						field1376[field1362] = var11.field116;
						field1038[field1362] = 44;
						field1037[field1362] = var11.field62;
						field1362++;
					}

					if (var11.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field68; var15++) {
							for (int var16 = 0; var16 < var11.field67; var16++) {
								int var17 = (var11.field87 + 32) * var16 + var9;
								int var18 = (var11.field88 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field90[var14];
									var18 += var11.field91[var14];
								}

								if (arg0 >= var17 && arg2 >= var18 && arg0 < var17 + 32 && arg2 < var18 + 32) {
									field1335 = var14;
									field1336 = var11.field62;

									if (var11.field58[var14] > 0) {
										ObjType var19 = ObjType.method348(var11.field58[var14] - 1);
										if (field1305 == 1 && var11.field85) {
											if (field1307 != var11.field62 || field1306 != var14) {
												field1376[field1362] = "Use " + field1309 + " with @lre@" + var19.field896;
												field1038[field1362] = 881;
												field1039[field1362] = var19.field894;
												field1036[field1362] = var14;
												field1037[field1362] = var11.field62;
												field1362++;
											}
										} else if (field1133 != 1 || !var11.field85) {
											if (var11.field85) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field911 != null && var19.field911[var20] != null) {
														field1376[field1362] = var19.field911[var20] + " @lre@" + var19.field896;

														if (var20 == 3) {
															field1038[field1362] = 478;
														}

														if (var20 == 4) {
															field1038[field1362] = 347;
														}

														field1039[field1362] = var19.field894;
														field1036[field1362] = var14;
														field1037[field1362] = var11.field62;
														field1362++;
													} else if (var20 == 4) {
														field1376[field1362] = "Drop @lre@" + var19.field896;
														field1038[field1362] = 347;
														field1039[field1362] = var19.field894;
														field1036[field1362] = var14;
														field1037[field1362] = var11.field62;
														field1362++;
													}
												}
											}

											if (var11.field86) {
												field1376[field1362] = "Use @lre@" + var19.field896;
												field1038[field1362] = 188;
												field1039[field1362] = var19.field894;
												field1036[field1362] = var14;
												field1037[field1362] = var11.field62;
												field1362++;
											}

											if (var11.field85 && var19.field911 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field911[var21] != null) {
														field1376[field1362] = var19.field911[var21] + " @lre@" + var19.field896;

														if (var21 == 0) {
															field1038[field1362] = 405;
														}

														if (var21 == 1) {
															field1038[field1362] = 38;
														}

														if (var21 == 2) {
															field1038[field1362] = 422;
														}

														field1039[field1362] = var19.field894;
														field1036[field1362] = var14;
														field1037[field1362] = var11.field62;
														field1362++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1376[field1362] = var11.field92[var22] + " @lre@" + var19.field896;

														if (var22 == 0) {
															field1038[field1362] = 602;
														}

														if (var22 == 1) {
															field1038[field1362] = 596;
														}

														if (var22 == 2) {
															field1038[field1362] = 22;
														}

														if (var22 == 3) {
															field1038[field1362] = 892;
														}

														if (var22 == 4) {
															field1038[field1362] = 415;
														}

														field1039[field1362] = var19.field894;
														field1036[field1362] = var14;
														field1037[field1362] = var11.field62;
														field1362++;
													}
												}
											}

											field1376[field1362] = "Examine @lre@" + var19.field896;
											field1038[field1362] = 1773;
											field1039[field1362] = var19.field894;
											field1037[field1362] = var11.field59[var14];
											field1362++;
										} else if ((field1135 & 0x10) == 0x10) {
											field1376[field1362] = field1136 + " @lre@" + var19.field896;
											field1038[field1362] = 391;
											field1039[field1362] = var19.field894;
											field1036[field1362] = var14;
											field1037[field1362] = var11.field62;
											field1362++;
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

	@ObfuscatedName("client.J(I)Z")
	public final boolean method524() {
		if (field1103 == null) {
			return false;
		}

		try {
			int var1 = field1103.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1075 == -1) {
				field1103.method41(field1294.field620, 0, 1);
				field1075 = field1294.field620[0] & 0xFF;
				if (field1340 != null) {
					field1075 = field1075 - field1340.method304() & 0xFF;
				}

				field1074 = Protocol.field936[field1075];
				var1--;
			}

			if (field1074 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1103.method41(field1294.field620, 0, 1);
				field1074 = field1294.field620[0] & 0xFF;
				var1--;
			}

			if (field1074 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1103.method41(field1294.field620, 0, 2);
				field1294.field621 = 0;
				field1074 = field1294.method240();
				var1 -= 2;
			}

			if (var1 < field1074) {
				return false;
			}

			field1294.field621 = 0;
			field1103.method41(field1294.field620, 0, field1074);
			field1076 = 0;
			field1202 = field1201;
			field1201 = field1200;
			field1200 = field1075;

			if (field1075 == 44) {
				field1297 = field1294.method243();
				field1333 = field1294.method240();
				field1069 = field1294.method238();
				field1027 = field1294.method240();
				field1241 = field1294.method238();
				if (field1297 != 0 && field1102 == -1) {
					SignLink.dnslookup(JString.method312(field1297));
					method450();
					short var2 = 650;
					if (field1069 != 201 || field1241 == 1) {
						var2 = 655;
					}

					field1170 = "";
					field1264 = false;

					for (int var3 = 0; var3 < Component.field57.length; var3++) {
						if (Component.field57[var3] != null && Component.field57[var3].field66 == var2) {
							field1102 = Component.field57[var3].field63;
							break;
						}
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 72) {
				field1054 = true;
				int var4 = field1294.method240();
				Component var5 = Component.field57[var4];
				int var6 = field1294.method238();
				for (int var7 = 0; var7 < var6; var7++) {
					var5.field58[var7] = field1294.method240();
					int var8 = field1294.method238();
					if (var8 == 255) {
						var8 = field1294.method243();
					}

					var5.field59[var7] = var8;
				}

				for (int var9 = var6; var9 < var5.field58.length; var9++) {
					var5.field58[var9] = 0;
					var5.field59[var9] = 0;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 164) {
				int var10 = field1294.method240();
				int var11 = field1294.method240();
				int var12 = field1294.method240();
				ObjType var13 = ObjType.method348(var11);
				Component.field57[var10].field104 = 4;
				Component.field57[var10].field105 = var11;
				Component.field57[var10].field111 = var13.field901;
				Component.field57[var10].field112 = var13.field902;
				Component.field57[var10].field110 = var13.field900 * 100 / var12;
				field1075 = -1;
				return true;
			}

			if (field1075 == 207) {
				int var14 = field1294.method240();
				int var15 = field1294.method240();

				if (field1216 != -1) {
					field1216 = -1;
					field1067 = true;
				}

				if (field1197) {
					field1197 = false;
					field1067 = true;
				}

				field1102 = var14;
				field1365 = var15;
				field1054 = true;
				field1204 = true;
				field1406 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 192) {
				field1094 = 255;
				field1075 = -1;
				return true;
			}

			if (field1075 == 70) {
				long var16 = field1294.method244();
				int var18 = field1294.method238();
				String var19 = JString.method313(JString.method310(var16));
				for (int var20 = 0; var20 < field1236; var20++) {
					if (field1042[var20] == var16) {
						if (field1282[var20] != var18) {
							field1282[var20] = var18;
							field1054 = true;

							if (var18 > 0) {
								method431(var19 + " has logged in.", "", 5);
							}

							if (var18 == 0) {
								method431(var19 + " has logged out.", "", 5);
							}
						}

						var19 = null;
						break;
					}
				}

				if (var19 != null && field1236 < 200) {
					field1042[field1236] = var16;
					field1354[field1236] = var19;
					field1282[field1236] = var18;
					field1236++;
					field1054 = true;
				}

				boolean var21 = false;
				while (!var21) {
					var21 = true;
					for (int var22 = 0; var22 < field1236 - 1; var22++) {
						if (field1282[var22] != field1218 && field1282[var22 + 1] == field1218 || field1282[var22] == 0 && field1282[var22 + 1] != 0) {
							int var23 = field1282[var22];
							field1282[var22] = field1282[var22 + 1];
							field1282[var22 + 1] = var23;
							String var24 = field1354[var22];
							field1354[var22] = field1354[var22 + 1];
							field1354[var22 + 1] = var24;
							long var25 = field1042[var22];
							field1042[var22] = field1042[var22 + 1];
							field1042[var22 + 1] = var25;
							field1054 = true;
							var21 = false;
						}
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 17) {
				method476();
				field1075 = -1;
				return false;
			}

			if (field1075 == 50) {
				int var27 = field1294.method238();
				int var28 = field1294.method238();
				int var29 = field1294.method238();
				int var30 = field1294.method238();
				field1177[var27] = true;
				field1108[var27] = var28;
				field1073[var27] = var29;
				field1068[var27] = var30;
				field1087[var27] = 0;
				field1075 = -1;
				return true;
			}

			if (field1075 == 22) {
				InputTracking.method44();
				field1075 = -1;
				return true;
			}

			if (field1075 == 160) {
				if (field1057 == 12) {
					field1054 = true;
				}

				field1208 = field1294.method241();
				field1075 = -1;
				return true;
			}

			if (field1075 == 94) {
				field1162 = field1294.method238();
				field1163 = field1294.method238();
				field1075 = -1;
				return true;
			}

			if (field1075 == 78) {
				int var31 = field1294.method240();
				int var32 = field1294.method240();
				int var33 = var32 >> 10 & 0x1F;
				int var34 = var32 >> 5 & 0x1F;
				int var35 = var32 & 0x1F;
				Component.field57[var31].field99 = (var35 << 3) + (var33 << 19) + (var34 << 11);
				field1075 = -1;
				return true;
			}

			if (field1075 == 152) {
				field1418 = false;
				field1197 = true;
				field1161 = "";
				field1067 = true;
				field1075 = -1;
				return true;
			}

			if (field1075 == 53) {
				field1283 = false;

				for (int var36 = 0; var36 < 5; var36++) {
					field1177[var36] = false;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 240) {
				int var37 = field1294.method240();
				if (var37 == 0xFFFF) {
					var37 = -1;
				}

				if (field1284 != var37 && field1272 && !field1221) {
					field1366 = var37;
					field1367 = true;
					field1329.method288(2, field1366);
				}

				field1284 = var37;
				field1040 = 0;
				field1075 = -1;
				return true;
			}

			if (field1075 == 173) {
				int var38 = field1294.method240();
				int var39 = field1294.method240();
				if (field1272 && !field1221) {
					field1366 = var38;
					field1367 = false;
					field1329.method288(2, field1366);
					field1040 = var39;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 158) {
				int var40 = field1294.method241();
				field1061 = var40;
				field1075 = -1;
				return true;
			}

			if (field1075 == 9) {
				field1228 = field1294.method238();
				field1373 = field1294.method238();
				field1104 = field1294.method238();
				field1409 = true;
				field1067 = true;
				field1075 = -1;
				return true;
			}

			if (field1075 == 209 || field1075 == 29 || field1075 == 69 || field1075 == 198 || field1075 == 137 || field1075 == 39 || field1075 == 234 || field1075 == 155 || field1075 == 125 || field1075 == 232) {
				method484(field1075, field1294);
				field1075 = -1;
				return true;
			}

			if (field1075 == 241) {
				int var41 = field1294.method240();
				int var42 = field1294.method241();
				int var43 = field1294.method241();
				Component var44 = Component.field57[var41];
				var44.field70 = var42;
				var44.field71 = var43;
				field1075 = -1;
				return true;
			}

			if (field1075 == 226) {
				int var45 = field1294.method240();
				int var46 = field1294.method243();
				field1317[var45] = var46;

				if (field1107[var45] != var46) {
					field1107[var45] = var46;
					method510(var45);
					field1054 = true;

					if (field1363 != -1) {
						field1067 = true;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 210) {
				field1217 = field1294.method240();
				field1085 = field1294.method238();
				field1075 = -1;
				return true;
			}

			if (field1075 == 97) {
				field1235 = field1294.method238();
				field1075 = -1;
				return true;
			}

			if (field1075 == 85) {
				field1389 = field1294.method240() * 30;
				field1075 = -1;
				return true;
			}

			if (field1075 == 245) {
				int var47 = field1294.method240();
				int var48 = field1294.method240();
				Component.field57[var47].field104 = 1;
				Component.field57[var47].field105 = var48;
				field1075 = -1;
				return true;
			}

			if (field1075 == 151) {
				int var49 = field1294.method240();
				int var50 = field1294.method238();
				int var51 = field1294.method240();
				if (field1407 && !field1221 && field1159 < 50) {
					field1024[field1159] = var49;
					field1062[field1159] = var50;
					field1232[field1159] = Wave.field780[var49] + var51;
					field1159++;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 87) {
				for (int var52 = 0; var52 < field1107.length; var52++) {
					if (field1317[var52] != field1107[var52]) {
						field1107[var52] = field1317[var52];
						method510(var52);
						field1054 = true;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 165) {
				int var53 = field1294.method240();
				int var54 = field1294.method240();
				if (field1386 == var53 && field1387 == var54 && field1331 == 2) {
					field1075 = -1;
					return true;
				}

				field1386 = var53;
				field1387 = var54;
				field1165 = (field1386 - 6) * 8;
				field1166 = (field1387 - 6) * 8;
				field1314 = false;
				if ((field1386 / 8 == 48 || field1386 / 8 == 49) && field1387 / 8 == 48) {
					field1314 = true;
				}

				if (field1386 / 8 == 48 && field1387 / 8 == 148) {
					field1314 = true;
				}

				field1331 = 1;
				field1299 = System.currentTimeMillis();
				field1324.method267();
				field1255.method213(257, 0, "Loading - please wait.", 151);
				field1255.method213(256, 0xFFFFFF, "Loading - please wait.", 150);
				field1324.method268(graphics, 4, 4);
				int var55 = 0;
				for (int var56 = (field1386 - 6) / 8; var56 <= (field1386 + 6) / 8; var56++) {
					for (int var57 = (field1387 - 6) / 8; var57 <= (field1387 + 6) / 8; var57++) {
						var55++;
					}
				}

				field1098 = new byte[var55][];
				field1137 = new byte[var55][];
				field1225 = new int[var55];
				field1226 = new int[var55];
				field1227 = new int[var55];
				int var58 = 0;
				for (int var59 = (field1386 - 6) / 8; var59 <= (field1386 + 6) / 8; var59++) {
					for (int var60 = (field1387 - 6) / 8; var60 <= (field1387 + 6) / 8; var60++) {
						field1225[var58] = (var59 << 8) + var60;

						if (field1314 && (var60 == 49 || var60 == 149 || var60 == 147 || var59 == 50 || var59 == 49 && var60 == 47)) {
							field1226[var58] = -1;
							field1227[var58] = -1;
							var58++;
						} else {
							int var61 = field1226[var58] = field1329.method283(var60, var59, 0);
							if (var61 != -1) {
								field1329.method288(3, var61);
							}

							int var62 = field1227[var58] = field1329.method283(var60, var59, 1);
							if (var62 != -1) {
								field1329.method288(3, var62);
							}

							var58++;
						}
					}
				}

				int var63 = field1165 - field1167;
				int var64 = field1166 - field1168;
				field1167 = field1165;
				field1168 = field1166;

				for (int var65 = 0; var65 < 8192; var65++) {
					NpcEntity var66 = field1251[var65];
					if (var66 != null) {
						for (int var67 = 0; var67 < 10; var67++) {
							var66.field415[var67] -= var63;
							var66.field416[var67] -= var64;
						}

						var66.field366 -= var63 * 128;
						var66.field367 -= var64 * 128;
					}
				}

				for (int var68 = 0; var68 < field1111; var68++) {
					PlayerEntity var69 = field1113[var68];
					if (var69 != null) {
						for (int var70 = 0; var70 < 10; var70++) {
							var69.field415[var70] -= var63;
							var69.field416[var70] -= var64;
						}

						var69.field366 -= var63 * 128;
						var69.field367 -= var64 * 128;
					}
				}

				field1408 = true;
				byte var71 = 0;
				byte var72 = 104;
				byte var73 = 1;
				if (var63 < 0) {
					var71 = 103;
					var72 = -1;
					var73 = -1;
				}

				byte var74 = 0;
				byte var75 = 104;
				byte var76 = 1;
				if (var64 < 0) {
					var74 = 103;
					var75 = -1;
					var76 = -1;
				}

				for (int var77 = var71; var77 != var72; var77 += var73) {
					for (int var78 = var74; var78 != var75; var78 += var76) {
						int var79 = var63 + var77;
						int var80 = var64 + var78;
						for (int var81 = 0; var81 < 4; var81++) {
							if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
								field1247[var81][var77][var78] = field1247[var81][var79][var80];
							} else {
								field1247[var81][var77][var78] = null;
							}
						}
					}
				}

				for (LocChange var82 = (LocChange) field1028.method257(); var82 != null; var82 = (LocChange) field1028.method259()) {
					var82.field639 -= var63;
					var82.field640 -= var64;
					if (var82.field639 < 0 || var82.field640 < 0 || var82.field639 >= 104 || var82.field640 >= 104) {
						var82.method119();
					}
				}

				if (field1273 != 0) {
					field1273 -= var63;
					field1274 -= var64;
				}

				field1283 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 214) {
				if (field1365 != -1) {
					field1365 = -1;
					field1054 = true;
					field1204 = true;
				}

				if (field1216 != -1) {
					field1216 = -1;
					field1067 = true;
				}

				if (field1197) {
					field1197 = false;
					field1067 = true;
				}

				field1102 = -1;
				field1406 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 219) {
				int var83 = field1294.method240();
				int var84 = field1294.method240();
				Component.field57[var83].field108 = var84;
				field1075 = -1;
				return true;
			}

			if (field1075 == 95) {
				String var85 = field1294.method245();
				if (var85.endsWith(":tradereq:")) {
					String var86 = var85.substring(0, var85.indexOf(":"));
					long var87 = JString.method309(var86);
					boolean var89 = false;
					for (int var90 = 0; var90 < field1183; var90++) {
						if (field1164[var90] == var87) {
							var89 = true;
							break;
						}
					}

					if (!var89 && field1184 == 0) {
						method431("wishes to trade with you.", var86, 4);
					}
				} else if (var85.endsWith(":duelreq:")) {
					String var91 = var85.substring(0, var85.indexOf(":"));
					long var92 = JString.method309(var91);
					boolean var94 = false;
					for (int var95 = 0; var95 < field1183; var95++) {
						if (field1164[var95] == var92) {
							var94 = true;
							break;
						}
					}

					if (!var94 && field1184 == 0) {
						method431("wishes to duel with you.", var91, 8);
					}
				} else {
					method431(var85, "", 0);
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 24) {
				field1054 = true;
				int var96 = field1294.method238();
				int var97 = field1294.method243();
				int var98 = field1294.method238();
				field1066[var96] = var97;
				field1326[var96] = var98;
				field1055[var96] = 1;
				for (int var99 = 0; var99 < 98; var99++) {
					if (var97 >= field1291[var99]) {
						field1055[var96] = var99 + 2;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 60) {
				Packet var100 = InputTracking.method47();
				if (var100 != null) {
					field1224.method227(217);
					field1224.method229(var100.field621);
					field1224.method236(var100.field621, 0, var100.field620);
					var100.method226();
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 242) {
				for (int var101 = 0; var101 < field1113.length; var101++) {
					if (field1113[var101] != null) {
						field1113[var101].field394 = -1;
					}
				}

				for (int var102 = 0; var102 < field1251.length; var102++) {
					if (field1251[var102] != null) {
						field1251[var102].field394 = -1;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 108) {
				int var103 = field1294.method240();
				Component.field57[var103].field104 = 3;
				Component.field57[var103].field105 = (field1243.field425[8] << 6) + (field1243.field425[0] << 12) + (field1243.field426[0] << 24) + (field1243.field426[4] << 18) + field1243.field425[11];
				field1075 = -1;
				return true;
			}

			if (field1075 == 86) {
				method547(field1074, field1294);
				field1408 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 176) {
				int var104 = field1294.method240();
				method471(var104);

				if (field1216 != -1) {
					field1216 = -1;
					field1067 = true;
				}

				if (field1197) {
					field1197 = false;
					field1067 = true;
				}

				field1365 = var104;
				field1054 = true;
				field1204 = true;
				field1102 = -1;
				field1406 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 168) {
				field1083 = field1294.method238();
				if (field1083 == field1057) {
					if (field1083 == 3) {
						field1057 = 1;
					} else {
						field1057 = 3;
					}

					field1054 = true;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 174) {
				int var105 = field1294.method241();
				field1363 = var105;
				field1067 = true;
				field1075 = -1;
				return true;
			}

			if (field1075 == 154) {
				int var106 = field1294.method240();
				String var107 = field1294.method245();
				Component.field57[var106].field97 = var107;

				if (field1149[field1057] == Component.field57[var106].field63) {
					field1054 = true;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 200) {
				int var108 = field1294.method240();
				int var109 = field1294.method238();

				if (var108 == 0xFFFF) {
					var108 = -1;
				}

				field1149[var109] = var108;
				field1054 = true;
				field1204 = true;
				field1075 = -1;
				return true;
			}

			if (field1075 == 56) {
				field1057 = field1294.method238();
				field1054 = true;
				field1204 = true;
				field1075 = -1;
				return true;
			}

			if (field1075 == 129) {
				int var110 = field1294.method240();
				int var111 = field1294.method240();
				Component.field57[var110].field104 = 2;
				Component.field57[var110].field105 = var111;
				field1075 = -1;
				return true;
			}

			if (field1075 == 222) {
				field1283 = true;
				field1277 = field1294.method238();
				field1278 = field1294.method238();
				field1279 = field1294.method240();
				field1280 = field1294.method238();
				field1281 = field1294.method238();
				if (field1281 >= 100) {
					int var112 = field1277 * 128 + 64;
					int var113 = field1278 * 128 + 64;
					int var114 = method473(var113, field1290, var112) - field1279;
					int var115 = var112 - field1429;
					int var116 = var114 - field1430;
					int var117 = var113 - field1431;
					int var118 = (int) Math.sqrt(var115 * var115 + var117 * var117);
					field1432 = (int) (Math.atan2(var116, var118) * 325.949D) & 0x7FF;
					field1433 = (int) (Math.atan2(var115, var117) * -325.949D) & 0x7FF;

					if (field1432 < 128) {
						field1432 = 128;
					}

					if (field1432 > 383) {
						field1432 = 383;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 177) {
				if (field1057 == 12) {
					field1054 = true;
				}

				field1065 = field1294.method238();
				field1075 = -1;
				return true;
			}

			if (field1075 == 62) {
				field1273 = 0;
				field1075 = -1;
				return true;
			}

			if (field1075 == 162) {
				int var119 = field1294.method240();
				Component var120 = Component.field57[var119];
				for (int var121 = 0; var121 < var120.field58.length; var121++) {
					var120.field58[var121] = -1;
					var120.field58[var121] = 0;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 49) {
				field1378 = field1294.method238();
				if (field1378 == 1) {
					field1106 = field1294.method240();
				}

				if (field1378 >= 2 && field1378 <= 6) {
					if (field1378 == 2) {
						field1175 = 64;
						field1176 = 64;
					}

					if (field1378 == 3) {
						field1175 = 0;
						field1176 = 64;
					}

					if (field1378 == 4) {
						field1175 = 128;
						field1176 = 64;
					}

					if (field1378 == 5) {
						field1175 = 64;
						field1176 = 0;
					}

					if (field1378 == 6) {
						field1175 = 64;
						field1176 = 128;
					}

					field1378 = 2;
					field1172 = field1294.method240();
					field1173 = field1294.method240();
					field1174 = field1294.method238();
				}

				if (field1378 == 10) {
					field1234 = field1294.method240();
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 10) {
				int var122 = field1294.method240();
				method471(var122);

				if (field1365 != -1) {
					field1365 = -1;
					field1054 = true;
					field1204 = true;
				}

				if (field1216 != -1) {
					field1216 = -1;
					field1067 = true;
				}

				if (field1197) {
					field1197 = false;
					field1067 = true;
				}

				field1102 = var122;
				field1406 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 189) {
				int var123 = field1294.method240();
				method471(var123);

				if (field1365 != -1) {
					field1365 = -1;
					field1054 = true;
					field1204 = true;
				}

				field1216 = var123;
				field1067 = true;
				field1102 = -1;
				field1406 = false;
				field1075 = -1;
				return true;
			}

			if (field1075 == 244) {
				method428(field1074, field1294);
				field1075 = -1;
				return true;
			}

			if (field1075 == 132) {
				field1054 = true;
				int var124 = field1294.method240();
				Component var125 = Component.field57[var124];
				while (field1294.field621 < field1074) {
					int var126 = field1294.method238();
					int var127 = field1294.method240();
					int var128 = field1294.method238();
					if (var128 == 255) {
						var128 = field1294.method243();
					}

					if (var126 >= 0 && var126 < var125.field58.length) {
						var125.field58[var126] = var127;
						var125.field59[var126] = var128;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 12) {
				field1283 = true;
				field1345 = field1294.method238();
				field1346 = field1294.method238();
				field1347 = field1294.method240();
				field1348 = field1294.method238();
				field1349 = field1294.method238();
				if (field1349 >= 100) {
					field1429 = field1345 * 128 + 64;
					field1431 = field1346 * 128 + 64;
					field1430 = method473(field1431, field1290, field1429) - field1347;
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 233) {
				field1162 = field1294.method238();
				field1163 = field1294.method238();

				while (field1294.field621 < field1074) {
					int var129 = field1294.method238();
					method484(var129, field1294);
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 131) {
				field1162 = field1294.method238();
				field1163 = field1294.method238();
				for (int var130 = field1162; var130 < field1162 + 8; var130++) {
					for (int var131 = field1163; var131 < field1163 + 8; var131++) {
						if (field1247[field1290][var130][var131] != null) {
							field1247[field1290][var130][var131] = null;
							method536(var130, var131);
						}
					}
				}

				for (LocChange var132 = (LocChange) field1028.method257(); var132 != null; var132 = (LocChange) field1028.method259()) {
					if (var132.field639 >= field1162 && var132.field639 < field1162 + 8 && var132.field640 >= field1163 && var132.field640 < field1163 + 8 && field1290 == var132.field637) {
						var132.field648 = 0;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 30) {
				long var133 = field1294.method244();
				int var135 = field1294.method243();
				int var136 = field1294.method238();
				boolean var137 = false;
				for (int var138 = 0; var138 < 100; var138++) {
					if (field1072[var138] == var135) {
						var137 = true;
						break;
					}
				}

				if (var136 <= 1) {
					for (int var139 = 0; var139 < field1183; var139++) {
						if (field1164[var139] == var133) {
							var137 = true;
							break;
						}
					}
				}

				if (!var137 && field1184 == 0) {
					try {
						field1072[field1231] = var135;
						field1231 = (field1231 + 1) % 100;
						String var140 = WordPack.method316(field1074 - 13, field1294);
						var140 = WordFilter.method399(var140);
						if (var136 == 2 || var136 == 3) {
							method431(var140, "@cr2@" + JString.method313(JString.method310(var133)), 7);
						} else if (var136 == 1) {
							method431(var140, "@cr1@" + JString.method313(JString.method310(var133)), 7);
						} else {
							method431(var140, JString.method313(JString.method310(var133)), 3);
						}
					} catch (Exception var150) {
						SignLink.reporterror("cde1");
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 123) {
				int var142 = field1294.method240();
				boolean var143 = field1294.method238() == 1;
				Component.field57[var142].field78 = var143;
				field1075 = -1;
				return true;
			}

			if (field1075 == 236) {
				int var144 = field1294.method240();
				byte var145 = field1294.method239();
				field1317[var144] = var145;

				if (field1107[var144] != var145) {
					field1107[var144] = var145;
					method510(var144);
					field1054 = true;

					if (field1363 != -1) {
						field1067 = true;
					}
				}

				field1075 = -1;
				return true;
			}

			if (field1075 == 7) {
				field1183 = field1074 / 8;
				for (int var146 = 0; var146 < field1183; var146++) {
					field1164[var146] = field1294.method244();
				}

				field1075 = -1;
				return true;
			}

			SignLink.reporterror("T1 - " + field1075 + "," + field1074 + " - " + field1201 + "," + field1202);
			method476();
		} catch (IOException var151) {
			method429();
		} catch (Exception var152) {
			String var148 = "T2 - " + field1075 + "," + field1201 + "," + field1202 + " - " + field1074 + "," + (field1243.field415[0] + field1165) + "," + (field1243.field416[0] + field1166) + " - ";
			for (int var149 = 0; var149 < field1074 && var149 < 50; var149++) {
				var148 = var148 + field1294.field620[var149] + ",";
			}

			SignLink.reporterror(var148);
			method476();
		}

		return true;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void draw() {
		if (field1263 || field1250 || field1311) {
			method545();
		} else {
			field1169++;

			if (field1185) {
				method444();
			} else {
				method517();
			}

			field1379 = 0;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method525() {
		field1265 = false;
		while (field1182) {
			field1265 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1186 = null;
		field1187 = null;
		field1310 = null;
		field1049 = null;
		field1050 = null;
		field1051 = null;
		field1052 = null;
		field1129 = null;
		field1130 = null;
		field1369 = null;
		field1370 = null;
		field1099 = null;
		field1100 = null;
	}

	@ObfuscatedName("client.a(Ld;II)I")
	public final int method526(Component arg0, int arg1) {
		if (arg0.field72 == null || arg1 >= arg0.field72.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field72[arg1];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1326[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1055[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1066[var3[var5++]];
				}

				if (var6 == 4) {
					Component var7 = Component.field57[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.field58.length; var9++) {
						if (var7.field58[var9] == var8) {
							var4 += var7.field59[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += field1107[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1291[field1055[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1107[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1243.field427;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += field1055[var10];
					}
				}

				if (var6 == 10) {
					Component var11 = Component.field57[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.field58.length; var13++) {
						if (var11.field58[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += field1065;
				}

				if (var6 == 12) {
					var4 += field1208;
				}

				if (var6 == 13) {
					int var14 = field1107[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(Lkb;B)V")
	public final void method527(Pix8 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1129.length; var3++) {
			field1129[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1129[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1130[var9] = (field1129[var9 - 1] + field1129[var9 + 1] + field1129[var9 - 128] + field1129[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1129;
			field1129 = field1130;
			field1130 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field604; var12++) {
				for (int var13 = 0; var13 < arg0.field603; var13++) {
					if (arg0.field601[var11++] != 0) {
						int var14 = var13 + arg0.field605 + 16;
						int var15 = var12 + arg0.field606 + 16;
						int var16 = (var15 << 7) + var14;
						field1129[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method528(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IIBIII)V")
	public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1088.method89(arg1, arg4, arg0);
		if (var6 != 0) {
			int var7 = field1088.method93(arg1, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field1275.field594;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.method333(var13);
			if (var14.field837 == -1) {
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
				Pix8 var15 = field1372[var14.field837];
				if (var15 != null) {
					int var16 = (var14.field822 * 4 - var15.field603) / 2;
					int var17 = (var14.field823 * 4 - var15.field604) / 2;
					var15.method211(arg4 * 4 + var16 + 48, (104 - arg0 - var14.field823) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1088.method91(arg1, arg4, arg0);
		if (var18 != 0) {
			int var19 = field1088.method93(arg1, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.method333(var22);
			if (var23.field837 != -1) {
				Pix8 var24 = field1372[var23.field837];
				if (var24 != null) {
					int var25 = (var23.field822 * 4 - var24.field603) / 2;
					int var26 = (var23.field823 * 4 - var24.field604) / 2;
					var24.method211(arg4 * 4 + var25 + 48, (104 - arg0 - var23.field823) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1275.field594;
				int var29 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field1088.method92(arg1, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.method333(var31);
			if (var32.field837 != -1) {
				Pix8 var33 = field1372[var32.field837];
				if (var33 != null) {
					int var34 = (var32.field822 * 4 - var33.field603) / 2;
					int var35 = (var32.field823 * 4 - var33.field604) / 2;
					var33.method211(arg4 * 4 + var34 + 48, (104 - arg0 - var32.field823) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	public final String getParameter(String arg0) {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.L(I)V")
	public final void method530() {
		if (field1331 == 2) {
			for (LocChange var1 = (LocChange) field1028.method257(); var1 != null; var1 = (LocChange) field1028.method259()) {
				if (var1.field648 > 0) {
					var1.field648--;
				}

				if (var1.field648 != 0) {
					if (var1.field647 > 0) {
						var1.field647--;
					}

					if (var1.field647 == 0 && (var1.field644 < 0 || World.method30(var1.field644, var1.field646))) {
						method470(var1.field644, var1.field639, var1.field645, var1.field646, var1.field637, var1.field640, var1.field638);
						var1.field647 = -1;

						if (var1.field644 == var1.field641 && var1.field641 == -1) {
							var1.method119();
						} else if (var1.field644 == var1.field641 && var1.field645 == var1.field642 && var1.field646 == var1.field643) {
							var1.method119();
						}
					}
				} else if (var1.field641 < 0 || World.method30(var1.field641, var1.field643)) {
					method470(var1.field641, var1.field639, var1.field642, var1.field643, var1.field637, var1.field640, var1.field638);
					var1.method119();
				}
			}

			field1266++;
			if (field1266 > 85) {
				field1266 = 0;
				field1224.method227(232);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void unload() {
		SignLink.reporterror = false;

		try {
			if (field1103 != null) {
				field1103.method38();
			}
		} catch (Exception var1) {
		}

		field1103 = null;
		method503();

		if (field1415 != null) {
			field1415.field851 = false;
		}

		field1415 = null;
		field1329.method280();
		field1329 = null;
		field1224 = null;
		field1327 = null;
		field1294 = null;
		field1225 = null;
		field1098 = null;
		field1137 = null;
		field1226 = null;
		field1227 = null;
		field1229 = null;
		field1110 = null;
		field1088 = null;
		field1353 = null;
		field1101 = null;
		field1070 = null;
		field1318 = null;
		field1319 = null;
		field1048 = null;
		field1322 = null;
		field1323 = null;
		field1324 = null;
		field1325 = null;
		field1150 = null;
		field1151 = null;
		field1152 = null;
		field1138 = null;
		field1139 = null;
		field1140 = null;
		field1141 = null;
		field1142 = null;
		field1143 = null;
		field1144 = null;
		field1145 = null;
		field1146 = null;
		field1258 = null;
		field1259 = null;
		field1260 = null;
		field1238 = null;
		field1239 = null;
		field1240 = null;
		field1390 = null;
		field1211 = null;
		field1212 = null;
		field1213 = null;
		field1214 = null;
		field1215 = null;
		field1380 = null;
		field1381 = null;
		field1382 = null;
		field1383 = null;
		field1384 = null;
		field1289 = null;
		field1321 = null;
		field1209 = null;
		field1395 = null;
		field1301 = null;
		field1302 = null;
		field1303 = null;
		field1304 = null;
		field1372 = null;
		field1364 = null;
		field1035 = null;
		field1113 = null;
		field1115 = null;
		field1117 = null;
		field1118 = null;
		field1148 = null;
		field1251 = null;
		field1253 = null;
		field1247 = null;
		field1028 = null;
		field1371 = null;
		field1388 = null;
		field1036 = null;
		field1037 = null;
		field1038 = null;
		field1039 = null;
		field1376 = null;
		field1107 = null;
		field1045 = null;
		field1046 = null;
		field1261 = null;
		field1275 = null;
		field1354 = null;
		field1042 = null;
		field1282 = null;
		field1191 = null;
		field1192 = null;
		field1188 = null;
		field1189 = null;
		field1190 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1196 = null;
		method525();
		LocType.method332();
		NpcType.method341();
		ObjType.method347();
		FloType.field943 = null;
		IdkType.field956 = null;
		Component.field57 = null;
		UnkType.field963 = null;
		SeqType.field973 = null;
		SpotAnimType.field989 = null;
		SpotAnimType.field1002 = null;
		VarpType.field1004 = null;
		drawArea = null;
		PlayerEntity.field442 = null;
		Pix3D.method176();
		World3D.method62();
		Model.method134();
		AnimFrame.method60();
		System.gc();
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String method531() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(Ld;B)Z")
	public final boolean method532(Component arg0) {
		int var2 = arg0.field66;
		if (var2 == 201) {
			field1067 = true;
			field1197 = false;
			field1418 = true;
			field1262 = "";
			field1086 = 1;
			field1047 = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			field1067 = true;
			field1197 = false;
			field1418 = true;
			field1262 = "";
			field1086 = 2;
			field1047 = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			field1078 = 250;
			return true;
		}

		if (var2 == 501) {
			field1067 = true;
			field1197 = false;
			field1418 = true;
			field1262 = "";
			field1086 = 4;
			field1047 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1067 = true;
			field1197 = false;
			field1418 = true;
			field1262 = "";
			field1086 = 5;
			field1047 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1393[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IdkType.field955 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IdkType.field955) {
							var5 = 0;
						}
					}

					if (!IdkType.field956[var5].field962 && IdkType.field956[var5].field957 == var3 + (field1368 ? 0 : 7)) {
						break;
					}
				}

				field1393[var3] = var5;
				field1031 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1355[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1199[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1199[var6].length) {
					var8 = 0;
				}
			}

			field1355[var6] = var8;
			field1031 = true;
		}

		if (var2 == 324 && !field1368) {
			field1368 = true;
			method501();
		}

		if (var2 == 325 && field1368) {
			field1368 = false;
			method501();
		}

		if (var2 == 326) {
			field1224.method227(8);
			field1224.method228(field1368 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1224.method228(field1393[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1224.method228(field1355[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1264 = !field1264;
		}

		if (var2 >= 601 && var2 <= 612) {
			method450();

			if (field1170.length() > 0) {
				field1224.method227(251);
				field1224.method234(JString.method309(field1170));
				field1224.method228(var2 - 601);
				field1224.method228(field1264 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method533(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1246[var4] != null) {
				int var5 = field1244[var4];
				int var6 = field1079 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1245[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1228 == 0 || field1228 == 1 && method502(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1243.field421)) {
						if (field1198 >= 1) {
							field1376[field1362] = "Report abuse @whi@" + var7;
							field1038[field1362] = 34;
							field1362++;
						}

						field1376[field1362] = "Add ignore @whi@" + var7;
						field1038[field1362] = 436;
						field1362++;
						field1376[field1362] = "Add friend @whi@" + var7;
						field1038[field1362] = 406;
						field1362++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1171 == 0 && (var5 == 7 || field1373 == 0 || field1373 == 1 && method502(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1198 >= 1) {
							field1376[field1362] = "Report abuse @whi@" + var7;
							field1038[field1362] = 34;
							field1362++;
						}

						field1376[field1362] = "Add ignore @whi@" + var7;
						field1038[field1362] = 436;
						field1362++;
						field1376[field1362] = "Add friend @whi@" + var7;
						field1038[field1362] = 406;
						field1362++;
					}

					var3++;
				}

				if (var5 == 4 && (field1104 == 0 || field1104 == 1 && method502(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1376[field1362] = "Accept trade @whi@" + var7;
						field1038[field1362] = 903;
						field1362++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1171 == 0 && field1373 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1104 == 0 || field1104 == 1 && method502(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1376[field1362] = "Accept duel @whi@" + var7;
						field1038[field1362] = 363;
						field1362++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void method534(int arg0, boolean arg1) {
		SignLink.midivol = arg0;

		if (arg1) {
			SignLink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method535() {
		if (field1233 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1233 = 3;
				field1330 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1315 = "";
				field1316 = "Enter your username & password.";
				field1233 = 2;
				field1330 = 0;
			}
		} else if (field1233 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1330 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1330 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method448(field1374, field1375, false);

				if (field1185) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1233 = 0;
				field1374 = "";
				field1375 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1056.length(); var10++) {
					if (var8 == field1056.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1330 == 0) {
					if (var8 == 8 && field1374.length() > 0) {
						field1374 = field1374.substring(0, field1374.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1330 = 1;
					}

					if (var9) {
						field1374 = field1374 + (char) var8;
					}

					if (field1374.length() > 12) {
						field1374 = field1374.substring(0, 12);
					}
				} else if (field1330 == 1) {
					if (var8 == 8 && field1375.length() > 0) {
						field1375 = field1375.substring(0, field1375.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1330 = 0;
					}

					if (var9) {
						field1375 = field1375 + (char) var8;
					}

					if (field1375.length() > 20) {
						field1375 = field1375.substring(0, 20);
					}
				}
			}
		} else if (field1233 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1233 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method536(int arg0, int arg1) {
		LinkList var3 = field1247[field1290][arg0][arg1];
		if (var3 == null) {
			field1088.method84(field1290, arg0, arg1);
		} else {
			int var4 = -99999999;
			ObjStackEntity var5 = null;
			for (ObjStackEntity var6 = (ObjStackEntity) var3.method257(); var6 != null; var6 = (ObjStackEntity) var3.method259()) {
				ObjType var7 = ObjType.method348(var6.field453);
				int var8 = var7.field908;
				if (var7.field907) {
					var8 = (var6.field454 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method255(var5);
			ObjStackEntity var9 = null;
			ObjStackEntity var10 = null;
			for (ObjStackEntity var11 = (ObjStackEntity) var3.method257(); var11 != null; var11 = (ObjStackEntity) var3.method259()) {
				if (var5.field453 != var11.field453 && var9 == null) {
					var9 = var11;
				}

				if (var5.field453 != var11.field453 && var9.field453 != var11.field453 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1088.method70(var12, method473(arg1 * 128 + 64, field1290, arg0 * 128 + 64), arg0, arg1, var10, var5, field1290, var9);
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method537() {
		try {
			field1095 = -1;
			field1388.method261();
			field1371.method261();
			Pix3D.method179();
			method481();
			field1088.method63();

			for (int var1 = 0; var1 < 4; var1++) {
				field1353[var1].method359();
			}

			System.gc();
			World var2 = new World(field1229, field1110, 104, 104);
			int var3 = field1098.length;
			World.field32 = World3D.field264;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1225[var4] >> 8;
				int var6 = field1225[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					World.field32 = false;
				}
			}

			if (World.field32) {
				field1088.method64(field1290);
			} else {
				field1088.method64(0);
			}

			field1224.method227(107);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1225[var7] >> 8) * 64 - field1165;
				int var9 = (field1225[var7] & 0xFF) * 64 - field1166;
				byte[] var10 = field1098[var7];
				if (var10 != null) {
					var2.method15(var10, var8, var9, (field1386 - 6) * 8, (field1387 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1225[var11] >> 8) * 64 - field1165;
				int var13 = (field1225[var11] & 0xFF) * 64 - field1166;
				byte[] var14 = field1098[var11];
				if (var14 == null && field1387 < 800) {
					var2.method14(var12, var13, 64, 64);
				}
			}

			field1224.method227(107);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1137[var15];
				if (var16 != null) {
					int var17 = (field1225[var15] >> 8) * 64 - field1165;
					int var18 = (field1225[var15] & 0xFF) * 64 - field1166;
					var2.method18(var18, field1088, field1353, var17, var16);
				}
			}

			field1224.method227(107);
			var2.method20(field1088, field1353);
			field1324.method267();
			field1224.method227(107);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method536(var19, var20);
				}
			}

			method513();
		} catch (Exception var33) {
		}

		LocType.field848.method116();

		if (field1221 && SignLink.cache_dat != null) {
			int var22 = field1329.method281(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1329.method286(var23);
				if ((var24 & 0x79) == 0) {
					Model.method137(var23);
				}
			}
		}

		System.gc();
		Pix3D.method180(20);
		field1329.method292();
		int var25 = (field1386 - 6) / 8 - 1;
		int var26 = (field1386 + 6) / 8 + 1;
		int var27 = (field1387 - 6) / 8 - 1;
		int var28 = (field1387 + 6) / 8 + 1;
		if (field1314) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1329.method283(var30, var29, 0);
					if (var31 != -1) {
						field1329.method293(3, var31);
					}

					int var32 = field1329.method283(var30, var29, 1);
					if (var32 != -1) {
						field1329.method293(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method538() {
		short var1 = 256;

		if (field1120 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1120 > 768) {
					field1049[var2] = method461(1024 - field1120, field1050[var2], field1051[var2]);
				} else if (field1120 > 256) {
					field1049[var2] = field1051[var2];
				} else {
					field1049[var2] = method461(256 - field1120, field1051[var2], field1050[var2]);
				}
			}
		} else if (field1121 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1121 > 768) {
					field1049[var3] = method461(1024 - field1121, field1050[var3], field1052[var3]);
				} else if (field1121 > 256) {
					field1049[var3] = field1052[var3];
				} else {
					field1049[var3] = method461(256 - field1121, field1052[var3], field1050[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1049[var4] = field1050[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1191.field653[var5] = field1099.field594[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1341[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1369[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1049[var12];
					int var15 = field1191.field653[var7];
					field1191.field653[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1191.method268(graphics, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1192.field653[var16] = field1100.field594[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1341[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1369[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1049[var23];
					int var26 = field1192.field653[var18];
					field1192.field653[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1192.method268(graphics, 0, 637);
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method539(int arg0) {
		int[] var2 = field1275.field594;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1110[arg0][var7][var5] & 0x18) == 0) {
					field1088.method98(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1110[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1088.method98(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1275.method193();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1110[arg0][var11][var10] & 0x18) == 0) {
					method529(var10, arg0, var9, var8, var11);
				}

				if (arg0 < 3 && (field1110[arg0 + 1][var11][var10] & 0x8) != 0) {
					method529(var10, arg0 + 1, var9, var8, var11);
				}
			}
		}

		field1324.method267();
		field1044 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1088.method92(field1290, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LocType.method333(var14).field836;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1353[field1290].field941;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var16 > 0 && var16 > var12 - 3 && (var20[var16 - 1][var17] & 0x280108) == 0) {
									var16--;
								}

								if (var22 == 1 && var16 < var18 - 1 && var16 < var12 + 3 && (var20[var16 + 1][var17] & 0x280180) == 0) {
									var16++;
								}

								if (var22 == 2 && var17 > 0 && var17 > var13 - 3 && (var20[var16][var17 - 1] & 0x280102) == 0) {
									var17--;
								}

								if (var22 == 3 && var17 < var19 - 1 && var17 < var13 + 3 && (var20[var16][var17 + 1] & 0x280120) == 0) {
									var17++;
								}
							}
						}

						field1261[field1044] = field1364[var15];
						field1045[field1044] = var16;
						field1046[field1044] = var17;
						field1044++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method540() {
		if (field1188 == null) {
			drawArea = null;
			field1325 = null;
			field1323 = null;
			field1322 = null;
			field1324 = null;
			field1150 = null;
			field1151 = null;
			field1152 = null;
			field1191 = new PixMap(getBaseComponent(), 265, 128);
			Pix2D.method167();
			field1192 = new PixMap(getBaseComponent(), 265, 128);
			Pix2D.method167();
			field1188 = new PixMap(getBaseComponent(), 171, 509);
			Pix2D.method167();
			field1189 = new PixMap(getBaseComponent(), 132, 360);
			Pix2D.method167();
			field1190 = new PixMap(getBaseComponent(), 200, 360);
			Pix2D.method167();
			field1193 = new PixMap(getBaseComponent(), 238, 202);
			Pix2D.method167();
			field1194 = new PixMap(getBaseComponent(), 238, 203);
			Pix2D.method167();
			field1195 = new PixMap(getBaseComponent(), 94, 74);
			Pix2D.method167();
			field1196 = new PixMap(getBaseComponent(), 94, 75);
			Pix2D.method167();

			if (field1210 != null) {
				method435();
				method495();
			}

			field1293 = true;
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method541() {
		int var1 = field1256.method215("Choose Option");
		for (int var2 = 0; var2 < field1362; var2++) {
			int var3 = field1256.method215(field1376[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1362 * 15 + 21;
		if (field24 > 4 && field25 > 4 && field24 < 516 && field25 < 338) {
			int var5 = field24 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field25 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field1181 = true;
			field1267 = 0;
			field1268 = var5;
			field1269 = var6;
			field1270 = var1;
			field1271 = field1362 * 15 + 22;
		}

		if (field24 > 553 && field25 > 205 && field24 < 743 && field25 < 466) {
			int var7 = field24 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field25 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field1181 = true;
			field1267 = 1;
			field1268 = var7;
			field1269 = var8;
			field1270 = var1;
			field1271 = field1362 * 15 + 22;
		}

		if (field24 > 17 && field25 > 357 && field24 < 496 && field25 < 453) {
			int var9 = field24 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field25 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field1181 = true;
			field1267 = 2;
			field1268 = var9;
			field1269 = var10;
			field1270 = var1;
			field1271 = field1362 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Ld;IZIIIIII)V")
	public final void method542(Component arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1080) {
			field1391 = 32;
		} else {
			field1391 = 0;
		}

		field1080 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg0.field77 -= field1379 * 4;

			if (arg2) {
				field1054 = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 + arg4 - 16 && arg3 < arg1 + arg4) {
			arg0.field77 += field1379 * 4;

			if (arg2) {
				field1054 = true;
				return;
			}
		} else if (arg6 >= arg7 - field1391 && arg6 < arg7 + field1391 + 16 && arg3 >= arg1 + 16 && arg3 < arg1 + arg4 - 16 && field1379 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg1 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg0.field77 = (arg5 - arg4) * var10 / var11;

			if (arg2) {
				field1054 = true;
			}

			field1080 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method543(Packet arg0, int arg1) {
		while (arg0.field622 + 10 < arg1 * 8) {
			int var3 = arg0.method249(11);
			if (var3 == 2047) {
				break;
			}

			if (field1113[var3] == null) {
				field1113[var3] = new PlayerEntity();
				if (field1118[var3] != null) {
					field1113[var3].method129(field1118[var3]);
				}
			}

			field1115[field1114++] = var3;
			PlayerEntity var4 = field1113[var3];
			var4.field411 = field1385;
			int var5 = arg0.method249(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method249(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method249(1);
			var4.method123(var7 == 1, field1243.field415[0] + var5, field1243.field416[0] + var6);
			int var8 = arg0.method249(1);
			if (var8 == 1) {
				field1117[field1116++] = var3;
			}
		}

		arg0.method250();
	}

	@ObfuscatedName("client.a(IIILd;I)V")
	public final void method544(int arg0, int arg1, Component arg2, int arg3) {
		if (arg2.field64 == 0 && arg2.field79 != null && (!arg2.field78 || field1342 == arg2.field62 || field1411 == arg2.field62 || field1300 == arg2.field62)) {
			int var5 = Pix2D.field566;
			int var6 = Pix2D.field564;
			int var7 = Pix2D.field567;
			int var8 = Pix2D.field565;
			Pix2D.method166(arg2.field67 + arg3, arg2.field68 + arg1, arg1, arg3);
			int var9 = arg2.field79.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field80[var10] + arg3;
				int var12 = arg2.field81[var10] + arg1 - arg0;
				Component var13 = Component.field57[arg2.field79[var10]];
				var11 += var13.field70;
				var12 += var13.field71;

				if (var13.field66 > 0) {
					method433(var13);
				}

				if (var13.field64 == 0) {
					if (var13.field77 > var13.field76 - var13.field68) {
						var13.field77 = var13.field76 - var13.field68;
					}

					if (var13.field77 < 0) {
						var13.field77 = 0;
					}

					method544(var13.field77, var12, var13, var11);

					if (var13.field76 > var13.field68) {
						method551(var13.field67 + var11, var13.field76, var12, var13.field77, var13.field68);
					}
				} else if (var13.field64 != 1) {
					if (var13.field64 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field68; var15++) {
							for (int var16 = 0; var16 < var13.field67; var16++) {
								int var17 = (var13.field87 + 32) * var16 + var11;
								int var18 = (var13.field88 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field90[var14];
									var18 += var13.field91[var14];
								}

								if (var13.field58[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field58[var14] - 1;
									if (var17 > Pix2D.field566 - 32 && var17 < Pix2D.field567 && var18 > Pix2D.field564 - 32 && var18 < Pix2D.field565 || field1091 != 0 && field1090 == var14) {
										int var22 = 0;
										if (field1305 == 1 && field1306 == var14 && field1307 == var13.field62) {
											var22 = 0xFFFFFF;
										}

										Pix32 var23 = ObjType.method354(var22, var13.field59[var14], var21);
										if (var23 != null) {
											if (field1091 != 0 && field1090 == var14 && field1089 == var13.field62) {
												var19 = field17 - field1092;
												var20 = field18 - field1093;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1084 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method200(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < Pix2D.field564 && arg2.field77 > 0) {
													int var24 = (Pix2D.field564 - var18 - var20) * field1298 / 3;
													if (var24 > field1298 * 10) {
														var24 = field1298 * 10;
													}

													if (var24 > arg2.field77) {
														var24 = arg2.field77;
													}

													arg2.field77 -= var24;
													field1093 += var24;
												}

												if (var18 + var20 + 32 > Pix2D.field565 && arg2.field77 < arg2.field76 - arg2.field68) {
													int var25 = (var18 + var20 + 32 - Pix2D.field565) * field1298 / 3;
													if (var25 > field1298 * 10) {
														var25 = field1298 * 10;
													}

													if (var25 > arg2.field76 - arg2.field68 - arg2.field77) {
														var25 = arg2.field76 - arg2.field68 - arg2.field77;
													}

													arg2.field77 += var25;
													field1093 -= var25;
												}
											} else if (field1128 != 0 && field1127 == var14 && field1126 == var13.field62) {
												var23.method200(var17, 128, var18);
											} else {
												var23.method198(var17, var18);
											}

											if (var23.field599 == 33 || var13.field59[var14] != 1) {
												int var26 = var13.field59[var14];
												field1254.method216(method528(var26), 0, var18 + var20 + 10, var17 + 1 + var19);
												field1254.method216(method528(var26), 0xFFFF00, var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									Pix32 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method198(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field64 == 3) {
						if (var13.field69 == 0) {
							if (var13.field93) {
								Pix2D.method169(var13.field99, var13.field67, var13.field68, var11, var12);
							} else {
								Pix2D.method170(var13.field68, var13.field67, var13.field99, var11, var12);
							}
						} else if (var13.field93) {
							Pix2D.method168(var12, 256 - (var13.field69 & 0xFF), var13.field68, var13.field67, var13.field99, var11);
						} else {
							Pix2D.method171(var13.field68, var13.field99, var11, var12, var13.field67, 256 - (var13.field69 & 0xFF));
						}
					} else if (var13.field64 == 4) {
						PixFont var28 = var13.field96;
						int var29 = var13.field99;
						String var30 = var13.field97;

						if ((field1300 == var13.field62 || field1411 == var13.field62 || field1342 == var13.field62) && var13.field101 != 0) {
							var29 = var13.field101;
						}

						if (method516(var13)) {
							var29 = var13.field100;

							if (var13.field98.length() > 0) {
								var30 = var13.field98;
							}
						}

						if (var13.field65 == 6 && field1406) {
							var30 = "Please wait...";
							var29 = var13.field99;
						}

						if (Pix2D.field562 == 479) {
							if (var29 == 0xFFFF00) {
								var29 = 255;
							}

							if (var29 == 49152) {
								var29 = 0xFFFFFF;
							}
						}

						int var31 = var28.field616 + var12;
						while (var30.length() > 0) {
							if (var30.indexOf("%") != -1) {
								while (true) {
									int var32 = var30.indexOf("%1");
									if (var32 == -1) {
										break;
									}

									var30 = var30.substring(0, var32) + method519(method526(var13, 0)) + var30.substring(var32 + 2);
								}

								while (true) {
									int var33 = var30.indexOf("%2");
									if (var33 == -1) {
										break;
									}

									var30 = var30.substring(0, var33) + method519(method526(var13, 1)) + var30.substring(var33 + 2);
								}

								while (true) {
									int var34 = var30.indexOf("%3");
									if (var34 == -1) {
										break;
									}

									var30 = var30.substring(0, var34) + method519(method526(var13, 2)) + var30.substring(var34 + 2);
								}

								while (true) {
									int var35 = var30.indexOf("%4");
									if (var35 == -1) {
										break;
									}

									var30 = var30.substring(0, var35) + method519(method526(var13, 3)) + var30.substring(var35 + 2);
								}

								while (true) {
									int var36 = var30.indexOf("%5");
									if (var36 == -1) {
										break;
									}

									var30 = var30.substring(0, var36) + method519(method526(var13, 4)) + var30.substring(var36 + 2);
								}
							}

							int var37 = var30.indexOf("\\n");
							String var38;
							if (var37 == -1) {
								var38 = var30;
								var30 = "";
							} else {
								var38 = var30.substring(0, var37);
								var30 = var30.substring(var37 + 2);
							}

							if (var13.field94) {
								var28.method214(var13.field67 / 2 + var11, var13.field95, var38, var31, var29);
							} else {
								var28.method218(var29, var11, var13.field95, var31, var38);
							}

							var31 += var28.field616;
						}
					} else if (var13.field64 == 5) {
						Pix32 var39;
						if (method516(var13)) {
							var39 = var13.field103;
						} else {
							var39 = var13.field102;
						}

						if (var39 != null) {
							var39.method198(var11, var12);
						}
					} else if (var13.field64 == 6) {
						int var40 = Pix3D.field576;
						int var41 = Pix3D.field577;
						Pix3D.field576 = var13.field67 / 2 + var11;
						Pix3D.field577 = var13.field68 / 2 + var12;
						int var42 = Pix3D.field580[var13.field111] * var13.field110 >> 16;
						int var43 = Pix3D.field581[var13.field111] * var13.field110 >> 16;
						boolean var44 = method516(var13);
						int var45;
						if (var44) {
							var45 = var13.field109;
						} else {
							var45 = var13.field108;
						}

						Model var46;
						if (var45 == -1) {
							var46 = var13.method34(-1, -1, var44);
						} else {
							SeqType var47 = SeqType.field973[var45];
							var46 = var13.method34(var47.field975[var13.field60], var47.field976[var13.field60], var44);
						}

						if (var46 != null) {
							var46.method158(0, var13.field112, 0, var13.field111, 0, var42, var43);
						}

						Pix3D.field576 = var40;
						Pix3D.field577 = var41;
					} else if (var13.field64 == 7) {
						PixFont var48 = var13.field96;
						int var49 = 0;
						for (int var50 = 0; var50 < var13.field68; var50++) {
							for (int var51 = 0; var51 < var13.field67; var51++) {
								if (var13.field58[var49] > 0) {
									ObjType var52 = ObjType.method348(var13.field58[var49] - 1);
									String var53 = var52.field896;
									if (var52.field907 || var13.field59[var49] != 1) {
										var53 = var53 + " x" + method459(var13.field59[var49]);
									}

									int var54 = (var13.field87 + 115) * var51 + var11;
									int var55 = (var13.field88 + 12) * var50 + var12;
									if (var13.field94) {
										var48.method214(var13.field67 / 2 + var54, var13.field95, var53, var55, var13.field99);
									} else {
										var48.method218(var13.field99, var54, var13.field95, var55, var53);
									}
								}

								var49++;
							}
						}
					}
				}
			}

			Pix2D.method166(var7, var8, var6, var5);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method545() {
		Graphics var1 = getBaseComponent().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		setFramerate(1);

		if (field1250) {
			field1265 = false;
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

		if (field1311) {
			field1265 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1263) {
			field1265 = false;
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

	@ObfuscatedName("client.l(Z)V")
	public final void method546() {
		if (field1389 > 1) {
			field1389--;
		}

		if (field1078 > 0) {
			field1078--;
		}

		if (field1094 > 0) {
			field1094 -= 2;
		}

		for (int var1 = 0; var1 < 5 && method524(); var1++) {
		}

		if (field1185) {
			method548();
			method530();
			method482();
			Packet var2 = InputTracking.method46();
			if (var2 != null) {
				field1224.method227(217);
				field1224.method229(var2.field621);
				field1224.method236(var2.field621, 0, var2.field620);
				var2.method226();
			}

			field1076++;
			if (field1076 > 750) {
				method429();
			}

			method490();
			method437();
			method494();
			field1298++;

			if (field1399 != 0) {
				field1398 += 20;
				if (field1398 >= 400) {
					field1399 = 0;
				}
			}

			if (field1128 != 0) {
				field1125++;
				if (field1125 >= 15) {
					if (field1128 == 2) {
						field1054 = true;
					}

					if (field1128 == 3) {
						field1067 = true;
					}

					field1128 = 0;
				}
			}

			if (field1091 != 0) {
				field1084++;

				if (field17 > field1092 + 5 || field17 < field1092 - 5 || field18 > field1093 + 5 || field18 < field1093 - 5) {
					field1064 = true;
				}

				if (field16 == 0) {
					if (field1091 == 2) {
						field1054 = true;
					}

					if (field1091 == 3) {
						field1067 = true;
					}

					field1091 = 0;

					if (field1064 && field1084 >= 5) {
						field1336 = -1;
						method451();

						if (field1336 == field1089 && field1335 != field1090) {
							Component var3 = Component.field57[field1089];
							byte var4 = 0;
							if (field1350 == 1 && var3.field66 == 206) {
								var4 = 1;
							}

							if (var3.field58[field1335] <= 0) {
								var4 = 0;
							}

							if (var4 == 1) {
								int var5 = field1090;
								int var6 = field1335;
								while (var5 != var6) {
									if (var5 > var6) {
										var3.method33(var5, var5 - 1);
										var5--;
									} else if (var5 < var6) {
										var3.method33(var5, var5 + 1);
										var5++;
									}
								}
							} else {
								var3.method33(field1090, field1335);
							}

							field1224.method227(81);
							field1224.method229(field1089);
							field1224.method229(field1090);
							field1224.method229(field1335);
							field1224.method228(var4);
						}
					} else if ((field1328 == 1 || method487(field1362 - 1)) && field1362 > 2) {
						method541();
					} else if (field1362 > 0) {
						method512(field1362 - 1);
					}

					field1125 = 10;
					field23 = 0;
				}
			}

			field1394++;
			if (field1394 > 127) {
				field1394 = 0;
				field1224.method227(144);
				field1224.method231(0x4C2B2C);
			}

			if (World3D.field298 != -1) {
				int var7 = World3D.field298;
				int var8 = World3D.field299;
				boolean var9 = method515(0, field1243.field416[0], 0, 0, true, 0, var7, 0, var8, 0, field1243.field415[0]);
				World3D.field298 = -1;

				if (var9) {
					field1396 = field24;
					field1397 = field25;
					field1399 = 1;
					field1398 = 0;
				}
			}

			if (field23 == 1 && field1034 != null) {
				field1034 = null;
				field1067 = true;
				field23 = 0;
			}

			method434();
			method496();
			method430();
			method432();

			if (field16 == 1 || field23 == 1) {
				field1379++;
			}

			if (field1331 == 2) {
				method514();
			}

			if (field1331 == 2 && field1283) {
				method505();
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1087[var10]++;
			}

			method508();
			field15++;
			if (field15 > 4500) {
				field1078 = 250;
				field15 -= 500;
				field1224.method227(146);
			}

			field1203++;
			if (field1203 > 500) {
				field1203 = 0;
				int var11 = (int) (Math.random() * 8.0D);
				if ((var11 & 0x1) == 1) {
					field1295 += field1296;
				}

				if ((var11 & 0x2) == 2) {
					field1096 += field1097;
				}

				if ((var11 & 0x4) == 4) {
					field1059 += field1060;
				}
			}

			if (field1295 < -50) {
				field1296 = 2;
			}

			if (field1295 > 50) {
				field1296 = -2;
			}

			if (field1096 < -55) {
				field1097 = 2;
			}

			if (field1096 > 55) {
				field1097 = -2;
			}

			if (field1059 < -40) {
				field1060 = 1;
			}

			if (field1059 > 40) {
				field1060 = -1;
			}

			field1292++;
			if (field1292 > 500) {
				field1292 = 0;
				int var12 = (int) (Math.random() * 8.0D);
				if ((var12 & 0x1) == 1) {
					field1337 += field1338;
				}

				if ((var12 & 0x2) == 2) {
					field1155 += field1156;
				}
			}

			if (field1337 < -60) {
				field1338 = 2;
			}

			if (field1337 > 60) {
				field1338 = -2;
			}

			if (field1155 < -20) {
				field1156 = 1;
			}

			if (field1155 > 10) {
				field1156 = -1;
			}

			field1030++;
			if (field1030 > 110) {
				field1030 = 0;
				field1224.method227(41);
				field1224.method232(0);
			}

			field1077++;
			if (field1077 > 50) {
				field1224.method227(107);
			}

			try {
				if (field1103 != null && field1224.field621 > 0) {
					field1103.method42(field1224.field621, 0, field1224.field620);
					field1224.field621 = 0;
					field1077 = 0;
				}
			} catch (IOException var14) {
				method429();
			} catch (Exception var15) {
				method476();
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void update() {
		if (!field1263 && !field1250 && !field1311) {
			field1385++;

			if (field1185) {
				method546();
			} else {
				method535();
			}

			method460();
		}
	}

	@ObfuscatedName("client.c(IILmb;)V")
	public final void method547(int arg0, Packet arg1) {
		field1147 = 0;
		field1116 = 0;
		method458(arg0, arg1);
		method499(arg0, arg1);
		method543(arg1, arg0);
		method478(arg1, arg0);

		for (int var3 = 0; var3 < field1147; var3++) {
			int var4 = field1148[var3];
			if (field1385 != field1113[var4].field411) {
				field1113[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			SignLink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1114; var5++) {
			if (field1113[field1115[var5]] == null) {
				SignLink.reporterror(field1374 + " null entry in pl list - pos:" + var5 + " size:" + field1114);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method548() {
		if (field1221 && field1331 == 2 && World.field33 != field1290) {
			field1324.method267();
			field1255.method213(257, 0, "Loading - please wait.", 151);
			field1255.method213(256, 0xFFFFFF, "Loading - please wait.", 150);
			field1324.method268(graphics, 4, 4);
			field1331 = 1;
			field1299 = System.currentTimeMillis();
		}

		if (field1331 == 1) {
			int var1 = method549();
			if (var1 != 0 && System.currentTimeMillis() - field1299 > 360000L) {
				SignLink.reporterror(field1374 + " glcfb " + field1207 + "," + var1 + "," + field1221 + "," + field1063[0] + "," + field1329.method289() + "," + field1290 + "," + field1386 + "," + field1387);
				field1299 = System.currentTimeMillis();
			}
		}

		if (field1331 == 2 && field1290 != field1095) {
			field1095 = field1290;
			method539(field1290);
		}
	}

	@ObfuscatedName("client.P(I)I")
	public final int method549() {
		for (int var1 = 0; var1 < field1098.length; var1++) {
			if (field1098[var1] == null && field1226[var1] != -1) {
				return -1;
			}

			if (field1137[var1] == null && field1227[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1098.length; var3++) {
			byte[] var4 = field1137[var3];
			if (var4 != null) {
				int var5 = (field1225[var3] >> 8) * 64 - field1165;
				int var6 = (field1225[var3] & 0xFF) * 64 - field1166;
				var2 &= World.method16(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1408) {
			return -4;
		} else {
			field1331 = 2;
			World.field33 = field1290;
			method537();
			return 0;
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method550() {
		if (field1171 != 0) {
			int var1 = 0;
			if (field1389 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1246[var2] != null) {
					int var3 = field1244[var2];
					String var4 = field1245[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1373 == 0 || field1373 == 1 && method502(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field17 < 516 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							if (field1198 >= 1) {
								field1376[field1362] = "Report abuse @whi@" + var4;
								field1038[field1362] = 2034;
								field1362++;
							}

							field1376[field1362] = "Add ignore @whi@" + var4;
							field1038[field1362] = 2436;
							field1362++;
							field1376[field1362] = "Add friend @whi@" + var4;
							field1038[field1362] = 2406;
							field1362++;
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1373 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBI)V")
	public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1032.method211(arg0, arg2);
		field1033.method211(arg0, arg2 + arg4 - 16);
		Pix2D.method169(field1131, 16, arg4 - 32, arg0, arg2 + 16);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg1 - arg4);
		Pix2D.method169(field1109, 16, var6, arg0, arg2 + var7 + 16);
		Pix2D.method174(arg0, field1339, arg2 + var7 + 16, var6);
		Pix2D.method174(arg0 + 1, field1339, arg2 + var7 + 16, var6);
		Pix2D.method172(field1339, arg2 + var7 + 16, 16, arg0);
		Pix2D.method172(field1339, arg2 + var7 + 17, 16, arg0);
		Pix2D.method174(arg0 + 15, field1105, arg2 + var7 + 16, var6);
		Pix2D.method174(arg0 + 14, field1105, arg2 + var7 + 17, var6 - 1);
		Pix2D.method172(field1105, arg2 + var7 + var6 + 15, 16, arg0);
		Pix2D.method172(field1105, arg2 + var7 + var6 + 14, 15, arg0 + 1);
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method552(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return SignLink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IZLjb;I)V")
	public final void method553(int arg0, Pix32 arg1, int arg2) {
		int var4 = field1358 + field1337 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = Model.field548[var4];
			int var7 = Model.field549[var4];
			var6 = var6 * 256 / (field1155 + 256);
			var7 = var7 * 256 / (field1155 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method204(field1259, var8 + 94 + 4 - arg1.field599 / 2, 83 - var9 - arg1.field600 / 2 - 4);
			} else {
				arg1.method198(var8 + 94 + 4 - arg1.field599 / 2, 83 - var9 - arg1.field600 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIILbb;)V")
	public final void method554(int arg0, int arg1, int arg2, PlayerEntity arg3) {
		if (field1243 != arg3 && field1362 < 400) {
			String var5 = arg3.field421 + method469(arg3.field427, field1243.field427) + " (level-" + arg3.field427 + ")";
			if (field1305 == 1) {
				field1376[field1362] = "Use " + field1309 + " with @whi@" + var5;
				field1038[field1362] = 367;
				field1039[field1362] = arg0;
				field1036[field1362] = arg1;
				field1037[field1362] = arg2;
				field1362++;
			} else if (field1133 != 1) {
				field1376[field1362] = "Follow @whi@" + var5;
				field1038[field1362] = 1544;
				field1039[field1362] = arg0;
				field1036[field1362] = arg1;
				field1037[field1362] = arg2;
				field1362++;
				if (field1184 == 0) {
					field1376[field1362] = "Trade with @whi@" + var5;
					field1038[field1362] = 1373;
					field1039[field1362] = arg0;
					field1036[field1362] = arg1;
					field1037[field1362] = arg2;
					field1362++;
				}

				if (field1230 > 0) {
					field1376[field1362] = "Attack @whi@" + var5;

					if (field1243.field427 >= arg3.field427) {
						field1038[field1362] = 151;
					} else {
						field1038[field1362] = 2151;
					}

					field1039[field1362] = arg0;
					field1036[field1362] = arg1;
					field1037[field1362] = arg2;
					field1362++;
				}

				if (field1025 == 1) {
					field1376[field1362] = "Fight @whi@" + var5;
					field1038[field1362] = 151;
					field1039[field1362] = arg0;
					field1036[field1362] = arg1;
					field1037[field1362] = arg2;
					field1362++;
				}

				if (field1025 == 2) {
					field1376[field1362] = "Duel-with @whi@" + var5;
					field1038[field1362] = 1101;
					field1039[field1362] = arg0;
					field1036[field1362] = arg1;
					field1037[field1362] = arg2;
					field1362++;
				}
			} else if ((field1135 & 0x8) == 8) {
				field1376[field1362] = field1136 + " @whi@" + var5;
				field1038[field1362] = 651;
				field1039[field1362] = arg0;
				field1036[field1362] = arg1;
				field1037[field1362] = arg2;
				field1362++;
			}

			for (int var6 = 0; var6 < field1362; var6++) {
				if (field1038[var6] == 660) {
					field1376[var6] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method555(int arg0) {
		if (!field1221) {
			if (Pix3D.field590[17] >= arg0) {
				Pix8 var2 = Pix3D.field584[17];
				int var3 = var2.field604 * var2.field603 - 1;
				int var4 = field1298 * var2.field603 * 2;
				byte[] var5 = var2.field601;
				byte[] var6 = field1048;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field601 = var6;
				field1048 = var5;
				Pix3D.method183(17);
			}

			if (Pix3D.field590[24] >= arg0) {
				Pix8 var8 = Pix3D.field584[24];
				int var9 = var8.field604 * var8.field603 - 1;
				int var10 = field1298 * var8.field603 * 2;
				byte[] var11 = var8.field601;
				byte[] var12 = field1048;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field601 = var12;
				field1048 = var11;
				Pix3D.method183(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method556() {
		field1182 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1265) {
				field1205++;
				method557();
				method557();
				method538();
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

		field1182 = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method557() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1369[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1369[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1370[var10] = (field1369[var10 - 1] + field1369[var10 + 1] + field1369[var10 - 128] + field1369[var10 + 128]) / 4;
			}
		}

		field1160 += 128;
		if (field1160 > field1129.length) {
			field1160 -= field1129.length;
			int var11 = (int) (Math.random() * 12.0D);
			method527(field1310[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1370[var14 + 128] - field1129[field1160 + var14 & field1129.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1369[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1341[var16] = field1341[var16 + 1];
		}

		field1341[var1 - 1] = (int) (Math.sin(field1385 / 14.0D) * 16.0D + Math.sin(field1385 / 15.0D) * 14.0D + Math.sin(field1385 / 16.0D) * 12.0D);

		if (field1120 > 0) {
			field1120 -= 4;
		}

		if (field1121 > 0) {
			field1121 -= 4;
		}

		if (field1120 == 0 && field1121 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1120 = 1024;
			}

			if (var17 == 1) {
				field1121 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method558(Component arg0) {
		int var2 = arg0.field66;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1376[field1362] = "Remove @whi@" + arg0.field97;
				field1038[field1362] = 556;
				field1362++;
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

		field1376[field1362] = "Remove @whi@" + field1354[var2];
		field1038[field1362] = 557;
		field1362++;
		field1376[field1362] = "Message @whi@" + field1354[var2];
		field1038[field1362] = 679;
		field1362++;
		return true;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1291[var1] = var0 / 4;
		}
	}
}
