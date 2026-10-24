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
public final class client extends class1 {

	@ObfuscatedName("client.ab")
	public static int field1077;

	@ObfuscatedName("client.bb")
	public byte[][] field1078;

	@ObfuscatedName("client.cb")
	public int field1079;

	@ObfuscatedName("client.db")
	public int[] field1080;

	@ObfuscatedName("client.eb")
	public int[] field1081;

	@ObfuscatedName("client.fb")
	public int[] field1082;

	@ObfuscatedName("client.gb")
	public int[] field1083;

	@ObfuscatedName("client.hb")
	public int field1084;

	@ObfuscatedName("client.ib")
	public int field1085;

	@ObfuscatedName("client.jb")
	public class35 field1086;

	@ObfuscatedName("client.kb")
	public int field1087;

	@ObfuscatedName("client.lb")
	public int field1088;

	@ObfuscatedName("client.mb")
	public int field1089;

	@ObfuscatedName("client.nb")
	public int field1090;

	@ObfuscatedName("client.ob")
	public int field1091;

	@ObfuscatedName("client.pb")
	public int[][] field1092 = new int[104][104];

	@ObfuscatedName("client.qb")
	public class35[] field1093 = new class35[8];

	@ObfuscatedName("client.rb")
	public int field1094 = -1;

	@ObfuscatedName("client.sb")
	public boolean field1095 = false;

	@ObfuscatedName("client.tb")
	public boolean field1096 = false;

	@ObfuscatedName("client.ub")
	public int field1097 = 0x332D25;

	@ObfuscatedName("client.xb")
	public int[] field1098 = new int[50];

	@ObfuscatedName("client.yb")
	public boolean field1099 = false;

	@ObfuscatedName("client.zb")
	public class35 field1100;

	@ObfuscatedName("client.ac")
	public int field1124;

	@ObfuscatedName("client.bc")
	public class49 field1125;

	@ObfuscatedName("client.cc")
	public long field1126;

	@ObfuscatedName("client.dc")
	public int field1127;

	@ObfuscatedName("client.ec")
	public int field1128 = -1;

	@ObfuscatedName("client.fc")
	public boolean field1129 = false;

	@ObfuscatedName("client.gc")
	public String field1130;

	@ObfuscatedName("client.hc")
	public int field1131;

	@ObfuscatedName("client.ic")
	public int[] field1132 = new int[5];

	@ObfuscatedName("client.jc")
	public int field1133;

	@ObfuscatedName("client.mc")
	public boolean field1134 = false;

	@ObfuscatedName("client.nc")
	public int field1135;

	@ObfuscatedName("client.oc")
	public int field1136;

	@ObfuscatedName("client.pc")
	public int field1137;

	@ObfuscatedName("client.qc")
	public int field1138;

	@ObfuscatedName("client.rc")
	public int field1139;

	@ObfuscatedName("client.sc")
	public int field1140;

	@ObfuscatedName("client.K")
	public int[] field1062 = new int[500];

	@ObfuscatedName("client.L")
	public int[] field1063 = new int[500];

	@ObfuscatedName("client.M")
	public int[] field1064 = new int[500];

	@ObfuscatedName("client.N")
	public int[] field1065 = new int[500];

	@ObfuscatedName("client.Q")
	public long[] field1068 = new long[200];

	@ObfuscatedName("client.W")
	public int field1074 = -1;

	@ObfuscatedName("client.Y")
	public CRC32 field1076 = new CRC32();

	@ObfuscatedName("client.Eb")
	public class36[] field1105 = new class36[13];

	@ObfuscatedName("client.Qb")
	public boolean field1114 = true;

	@ObfuscatedName("client.Rb")
	public class48[] field1115 = new class48[5];

	@ObfuscatedName("client.Tb")
	public String field1117 = "";

	@ObfuscatedName("client.Ub")
	public int field1118 = -1;

	@ObfuscatedName("client.Vb")
	public int[] field1119 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.tc")
	public int field1141 = 1;

	@ObfuscatedName("client.xc")
	public int field1144 = 2048;

	@ObfuscatedName("client.yc")
	public int field1145 = 2047;

	@ObfuscatedName("client.zc")
	public class27[] field1146 = new class27[field1144];

	@ObfuscatedName("client.Bc")
	public int[] field1148 = new int[field1144];

	@ObfuscatedName("client.Dc")
	public int[] field1150 = new int[field1144];

	@ObfuscatedName("client.Ec")
	public class38[] field1151 = new class38[field1144];

	@ObfuscatedName("client.Fc")
	public int field1152 = -1;

	@ObfuscatedName("client.Hc")
	public String field1154 = "";

	@ObfuscatedName("client.Ic")
	public int[][] field1155 = new int[104][104];

	@ObfuscatedName("client.Lc")
	public int field1158 = -1;

	@ObfuscatedName("client.Pc")
	public int field1162 = 2;

	@ObfuscatedName("client.Vc")
	public boolean field1168 = false;

	@ObfuscatedName("client.gd")
	public int field1178 = 2;

	@ObfuscatedName("client.jd")
	public int field1181 = 1;

	@ObfuscatedName("client.kd")
	public int field1182 = -1;

	@ObfuscatedName("client.ld")
	public int[] field1183 = new int[200];

	@ObfuscatedName("client.od")
	public int[] field1186 = new int[50];

	@ObfuscatedName("client.pd")
	public boolean[] field1187 = new boolean[5];

	@ObfuscatedName("client.qd")
	public int[] field1188 = new int[50];

	@ObfuscatedName("client.vd")
	public boolean field1192 = false;

	@ObfuscatedName("client.Ld")
	public int field1208 = 3;

	@ObfuscatedName("client.Md")
	public class62[] field1209 = new class62[4];

	@ObfuscatedName("client.Od")
	public boolean field1211 = false;

	@ObfuscatedName("client.Sd")
	public int[] field1215 = new int[1000];

	@ObfuscatedName("client.Ud")
	public boolean field1217 = false;

	@ObfuscatedName("client.Vd")
	public class41 field1218 = new class41();

	@ObfuscatedName("client.Wd")
	public String field1219 = "";

	@ObfuscatedName("client.Zd")
	public int[] field1221 = new int[7];

	@ObfuscatedName("client.me")
	public int[] field1233 = new int[5];

	@ObfuscatedName("client.ne")
	public class41 field1234 = new class41();

	@ObfuscatedName("client.ue")
	public int[] field1241 = new int[2000];

	@ObfuscatedName("client.we")
	public boolean field1242 = false;

	@ObfuscatedName("client.Ee")
	public byte[] field1248 = new byte[16384];

	@ObfuscatedName("client.Le")
	public String[] field1254 = new String[500];

	@ObfuscatedName("client.Me")
	public class38 field1255 = class38.method217(1);

	@ObfuscatedName("client.Oe")
	public int[] field1257 = new int[5];

	@ObfuscatedName("client.Se")
	public boolean field1261 = false;

	@ObfuscatedName("client.Ye")
	public int field1266 = 0x4D4233;

	@ObfuscatedName("client.Ze")
	public boolean field1267 = false;

	@ObfuscatedName("client.mf")
	public class4 field1279 = new class4();

	@ObfuscatedName("client.nf")
	public int[] field1280 = new int[151];

	@ObfuscatedName("client.of")
	public String[] field1281 = new String[200];

	@ObfuscatedName("client.pf")
	public int[] field1282 = new int[5];

	@ObfuscatedName("client.rf")
	public boolean field1284 = true;

	@ObfuscatedName("client.uf")
	public int field1287 = 2;

	@ObfuscatedName("client.xf")
	public String field1289 = "";

	@ObfuscatedName("client.yf")
	public String field1290 = "";

	@ObfuscatedName("client.zf")
	public int field1291 = -1;

	@ObfuscatedName("client.Bf")
	public String field1292 = "";

	@ObfuscatedName("client.Cf")
	public String field1293 = "";

	@ObfuscatedName("client.Df")
	public boolean field1294 = false;

	@ObfuscatedName("client.Hf")
	public int field1298 = -1;

	@ObfuscatedName("client.Jf")
	public boolean field1299 = false;

	@ObfuscatedName("client.Lf")
	public int[] field1300 = new int[2000];

	@ObfuscatedName("client.Nf")
	public long[] field1302 = new long[100];

	@ObfuscatedName("client.Pf")
	public int field1304 = 0x23201B;

	@ObfuscatedName("client.Rf")
	public boolean field1306 = false;

	@ObfuscatedName("client.Sf")
	public int[] field1307 = new int[151];

	@ObfuscatedName("client.Tf")
	public int[][] field1308 = new int[104][104];

	@ObfuscatedName("client.Wf")
	public int field1311 = -1;

	@ObfuscatedName("client.Yf")
	public int[] field1313 = new int[5];

	@ObfuscatedName("client.Zf")
	public boolean field1314 = false;

	@ObfuscatedName("client.ag")
	public class35[] field1315 = new class35[20];

	@ObfuscatedName("client.cg")
	public int[] field1317 = new int[256];

	@ObfuscatedName("client.gg")
	public int[] field1321 = new int[100];

	@ObfuscatedName("client.hg")
	public String[] field1322 = new String[100];

	@ObfuscatedName("client.ig")
	public String[] field1323 = new String[100];

	@ObfuscatedName("client.mg")
	public class36[] field1327 = new class36[100];

	@ObfuscatedName("client.ng")
	public int[] field1328 = new int[class67.field1012];

	@ObfuscatedName("client.sg")
	public int field1333 = -1;

	@ObfuscatedName("client.vg")
	public int[] field1335 = new int[1000];

	@ObfuscatedName("client.wg")
	public int[] field1336 = new int[1000];

	@ObfuscatedName("client.yg")
	public boolean field1338 = false;

	@ObfuscatedName("client.zg")
	public final int field1339 = 100;

	@ObfuscatedName("client.Ag")
	public int[] field1340 = new int[100];

	@ObfuscatedName("client.Cg")
	public int[] field1342 = new int[33];

	@ObfuscatedName("client.Hg")
	public class41[][][] field1346 = new class41[4][104][104];

	@ObfuscatedName("client.Lg")
	public int field1349 = 50;

	@ObfuscatedName("client.Mg")
	public int[] field1350 = new int[field1349];

	@ObfuscatedName("client.Ng")
	public int[] field1351 = new int[field1349];

	@ObfuscatedName("client.Og")
	public int[] field1352 = new int[field1349];

	@ObfuscatedName("client.Pg")
	public int[] field1353 = new int[field1349];

	@ObfuscatedName("client.Qg")
	public int[] field1354 = new int[field1349];

	@ObfuscatedName("client.Rg")
	public int[] field1355 = new int[field1349];

	@ObfuscatedName("client.Sg")
	public int[] field1356 = new int[field1349];

	@ObfuscatedName("client.Tg")
	public String[] field1357 = new String[field1349];

	@ObfuscatedName("client.Ug")
	public int[] field1358 = new int[33];

	@ObfuscatedName("client.ch")
	public int[] field1366 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.dh")
	public class35[] field1367 = new class35[1000];

	@ObfuscatedName("client.ih")
	public boolean field1372 = false;

	@ObfuscatedName("client.kh")
	public boolean field1373 = false;

	@ObfuscatedName("client.lh")
	public int field1374 = -1;

	@ObfuscatedName("client.ph")
	public int[] field1378 = new int[9];

	@ObfuscatedName("client.rh")
	public String[] field1379 = new String[5];

	@ObfuscatedName("client.sh")
	public boolean[] field1380 = new boolean[5];

	@ObfuscatedName("client.th")
	public final int[] field1381 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.vh")
	public String field1383 = "";

	@ObfuscatedName("client.Fh")
	public boolean field1393 = false;

	@ObfuscatedName("client.Sh")
	public int[] field1406 = new int[class67.field1012];

	@ObfuscatedName("client.Uh")
	public boolean field1408 = false;

	@ObfuscatedName("client.Vh")
	public int field1409 = 78;

	@ObfuscatedName("client.bi")
	public boolean field1415 = false;

	@ObfuscatedName("client.ci")
	public int[] field1416 = new int[class67.field1012];

	@ObfuscatedName("client.li")
	public class38 field1424 = class38.method217(1);

	@ObfuscatedName("client.qi")
	public boolean field1429 = false;

	@ObfuscatedName("client.si")
	public class41 field1431 = new class41();

	@ObfuscatedName("client.ti")
	public class35[] field1432 = new class35[20];

	@ObfuscatedName("client.yi")
	public boolean field1436 = true;

	@ObfuscatedName("client.zi")
	public boolean field1437 = true;

	@ObfuscatedName("client.Ai")
	public String field1438 = "";

	@ObfuscatedName("client.Ci")
	public class38 field1440 = class38.method217(1);

	@ObfuscatedName("client.Gi")
	public int field1444 = -1;

	@ObfuscatedName("client.Hi")
	public int field1445 = -1;

	@ObfuscatedName("client.Li")
	public int field1449 = 128;

	@ObfuscatedName("client.Pi")
	public boolean field1453 = true;

	@ObfuscatedName("client.Qi")
	public int field1454 = 0x766654;

	@ObfuscatedName("client.Ri")
	public class26[] field1455 = new class26[16384];

	@ObfuscatedName("client.Ti")
	public int[] field1457 = new int[16384];

	@ObfuscatedName("client.fj")
	public boolean field1469 = false;

	@ObfuscatedName("client.gj")
	public class36[] field1470 = new class36[2];

	@ObfuscatedName("client.ij")
	public boolean field1471 = false;

	@ObfuscatedName("client.jj")
	public class35[] field1472 = new class35[100];

	@ObfuscatedName("client.sj")
	public int[] field1480 = new int[4000];

	@ObfuscatedName("client.tj")
	public int[] field1481 = new int[4000];

	@ObfuscatedName("client.J")
	public static final int[][] field1061 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Kd")
	public static BigInteger field1207 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.De")
	public static int[] field1247 = new int[32];

	@ObfuscatedName("client.Fe")
	public static int field1249 = 10;

	@ObfuscatedName("client.He")
	public static boolean field1251 = true;

	@ObfuscatedName("client.Je")
	public static int[] field1253 = new int[99];

	@ObfuscatedName("client.kg")
	public static final int[] field1325 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.oi")
	public static BigInteger field1427 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Ii")
	public static String field1446 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.I")
	public int field1060;

	@ObfuscatedName("client.O")
	public static int field1066;

	@ObfuscatedName("client.P")
	public int field1067;

	@ObfuscatedName("client.R")
	public static int field1069;

	@ObfuscatedName("client.Db")
	public int field1104;

	@ObfuscatedName("client.Gb")
	public int field1106;

	@ObfuscatedName("client.Ib")
	public int field1107;

	@ObfuscatedName("client.Jb")
	public int field1108;

	@ObfuscatedName("client.Kb")
	public int field1109;

	@ObfuscatedName("client.Lb")
	public int field1110;

	@ObfuscatedName("client.Mb")
	public int field1111;

	@ObfuscatedName("client.Nb")
	public static int field1112;

	@ObfuscatedName("client.Pb")
	public int field1113;

	@ObfuscatedName("client.Sb")
	public int field1116;

	@ObfuscatedName("client.Wb")
	public int field1120;

	@ObfuscatedName("client.Xb")
	public int field1121;

	@ObfuscatedName("client.Yb")
	public int field1122;

	@ObfuscatedName("client.Zb")
	public int field1123;

	@ObfuscatedName("client.vc")
	public int field1142;

	@ObfuscatedName("client.wc")
	public static int field1143;

	@ObfuscatedName("client.Ac")
	public int field1147;

	@ObfuscatedName("client.Cc")
	public int field1149;

	@ObfuscatedName("client.Nc")
	public int field1160;

	@ObfuscatedName("client.Oc")
	public int field1161;

	@ObfuscatedName("client.Qc")
	public int field1163;

	@ObfuscatedName("client.Wc")
	public static int field1169;

	@ObfuscatedName("client.Zc")
	public int field1171;

	@ObfuscatedName("client.ad")
	public int field1172;

	@ObfuscatedName("client.bd")
	public int field1173;

	@ObfuscatedName("client.cd")
	public int field1174;

	@ObfuscatedName("client.dd")
	public int field1175;

	@ObfuscatedName("client.ed")
	public static int field1176;

	@ObfuscatedName("client.fd")
	public int field1177;

	@ObfuscatedName("client.hd")
	public int field1179;

	@ObfuscatedName("client.id")
	public int field1180;

	@ObfuscatedName("client.nd")
	public int field1185;

	@ObfuscatedName("client.sd")
	public int field1190;

	@ObfuscatedName("client.ud")
	public int field1191;

	@ObfuscatedName("client.zd")
	public int field1196;

	@ObfuscatedName("client.Ad")
	public int field1197;

	@ObfuscatedName("client.Rd")
	public int field1214;

	@ObfuscatedName("client.Td")
	public int field1216;

	@ObfuscatedName("client.Xd")
	public int field1220;

	@ObfuscatedName("client.ee")
	public int field1226;

	@ObfuscatedName("client.fe")
	public int field1227;

	@ObfuscatedName("client.ge")
	public int field1228;

	@ObfuscatedName("client.he")
	public int field1229;

	@ObfuscatedName("client.je")
	public int field1231;

	@ObfuscatedName("client.ke")
	public int field1232;

	@ObfuscatedName("client.oe")
	public int field1235;

	@ObfuscatedName("client.pe")
	public int field1236;

	@ObfuscatedName("client.qe")
	public int field1237;

	@ObfuscatedName("client.re")
	public int field1238;

	@ObfuscatedName("client.te")
	public int field1240;

	@ObfuscatedName("client.xe")
	public static int field1243;

	@ObfuscatedName("client.ye")
	public int field1244;

	@ObfuscatedName("client.Be")
	public int field1245;

	@ObfuscatedName("client.Ge")
	public static int field1250;

	@ObfuscatedName("client.Ne")
	public int field1256;

	@ObfuscatedName("client.Qe")
	public int field1259;

	@ObfuscatedName("client.Re")
	public int field1260;

	@ObfuscatedName("client.Te")
	public int field1262;

	@ObfuscatedName("client.Ue")
	public int field1263;

	@ObfuscatedName("client.Ve")
	public int field1264;

	@ObfuscatedName("client.af")
	public static int field1268;

	@ObfuscatedName("client.bf")
	public int field1269;

	@ObfuscatedName("client.cf")
	public int field1270;

	@ObfuscatedName("client.gf")
	public int field1274;

	@ObfuscatedName("client.jf")
	public static int field1276;

	@ObfuscatedName("client.lf")
	public int field1278;

	@ObfuscatedName("client.qf")
	public int field1283;

	@ObfuscatedName("client.sf")
	public int field1285;

	@ObfuscatedName("client.tf")
	public int field1286;

	@ObfuscatedName("client.vf")
	public int field1288;

	@ObfuscatedName("client.Gf")
	public int field1297;

	@ObfuscatedName("client.Mf")
	public int field1301;

	@ObfuscatedName("client.Of")
	public static int field1303;

	@ObfuscatedName("client.Uf")
	public int field1309;

	@ObfuscatedName("client.Vf")
	public int field1310;

	@ObfuscatedName("client.Xf")
	public int field1312;

	@ObfuscatedName("client.dg")
	public int field1318;

	@ObfuscatedName("client.fg")
	public int field1320;

	@ObfuscatedName("client.lg")
	public int field1326;

	@ObfuscatedName("client.og")
	public int field1329;

	@ObfuscatedName("client.pg")
	public int field1330;

	@ObfuscatedName("client.qg")
	public int field1331;

	@ObfuscatedName("client.rg")
	public int field1332;

	@ObfuscatedName("client.ug")
	public int field1334;

	@ObfuscatedName("client.xg")
	public int field1337;

	@ObfuscatedName("client.Bg")
	public int field1341;

	@ObfuscatedName("client.Eg")
	public int field1344;

	@ObfuscatedName("client.Fg")
	public int field1345;

	@ObfuscatedName("client.Jg")
	public int field1347;

	@ObfuscatedName("client.Kg")
	public int field1348;

	@ObfuscatedName("client.Vg")
	public int field1359;

	@ObfuscatedName("client.Wg")
	public int field1360;

	@ObfuscatedName("client.Xg")
	public int field1361;

	@ObfuscatedName("client.eh")
	public static int field1368;

	@ObfuscatedName("client.fh")
	public int field1369;

	@ObfuscatedName("client.gh")
	public int field1370;

	@ObfuscatedName("client.hh")
	public int field1371;

	@ObfuscatedName("client.uh")
	public int field1382;

	@ObfuscatedName("client.wh")
	public int field1384;

	@ObfuscatedName("client.xh")
	public int field1385;

	@ObfuscatedName("client.yh")
	public int field1386;

	@ObfuscatedName("client.zh")
	public int field1387;

	@ObfuscatedName("client.Ah")
	public static int field1388;

	@ObfuscatedName("client.Bh")
	public int field1389;

	@ObfuscatedName("client.Ch")
	public int field1390;

	@ObfuscatedName("client.Dh")
	public int field1391;

	@ObfuscatedName("client.Eh")
	public int field1392;

	@ObfuscatedName("client.Ih")
	public int field1396;

	@ObfuscatedName("client.Jh")
	public int field1397;

	@ObfuscatedName("client.Kh")
	public int field1398;

	@ObfuscatedName("client.Lh")
	public int field1399;

	@ObfuscatedName("client.Mh")
	public int field1400;

	@ObfuscatedName("client.Th")
	public int field1407;

	@ObfuscatedName("client.Wh")
	public int field1410;

	@ObfuscatedName("client.Xh")
	public int field1411;

	@ObfuscatedName("client.Yh")
	public int field1412;

	@ObfuscatedName("client.Zh")
	public int field1413;

	@ObfuscatedName("client.ai")
	public int field1414;

	@ObfuscatedName("client.fi")
	public int field1419;

	@ObfuscatedName("client.gi")
	public int field1420;

	@ObfuscatedName("client.hi")
	public int field1421;

	@ObfuscatedName("client.ii")
	public int field1422;

	@ObfuscatedName("client.ji")
	public int field1423;

	@ObfuscatedName("client.ni")
	public static int field1426;

	@ObfuscatedName("client.pi")
	public int field1428;

	@ObfuscatedName("client.ri")
	public int field1430;

	@ObfuscatedName("client.vi")
	public static int field1433;

	@ObfuscatedName("client.Bi")
	public static int field1439;

	@ObfuscatedName("client.Ji")
	public int field1447;

	@ObfuscatedName("client.Ki")
	public int field1448;

	@ObfuscatedName("client.Mi")
	public int field1450;

	@ObfuscatedName("client.Ni")
	public int field1451;

	@ObfuscatedName("client.Oi")
	public int field1452;

	@ObfuscatedName("client.Si")
	public int field1456;

	@ObfuscatedName("client.Ui")
	public static int field1458;

	@ObfuscatedName("client.Vi")
	public static int field1459;

	@ObfuscatedName("client.pj")
	public int field1478;

	@ObfuscatedName("client.qj")
	public int field1479;

	@ObfuscatedName("client.ie")
	public long field1230;

	@ObfuscatedName("client.hf")
	public long field1275;

	@ObfuscatedName("client.kf")
	public long field1277;

	@ObfuscatedName("client.eg")
	public long field1319;

	@ObfuscatedName("client.md")
	public class18 field1184;

	@ObfuscatedName("client.V")
	public static class27 field1073;

	@ObfuscatedName("client.Ab")
	public class35 field1101;

	@ObfuscatedName("client.Bb")
	public class35 field1102;

	@ObfuscatedName("client.Cb")
	public class35 field1103;

	@ObfuscatedName("client.Jc")
	public class35 field1156;

	@ObfuscatedName("client.Kc")
	public class35 field1157;

	@ObfuscatedName("client.Mc")
	public class35 field1159;

	@ObfuscatedName("client.Ef")
	public class35 field1295;

	@ObfuscatedName("client.Ff")
	public class35 field1296;

	@ObfuscatedName("client.bg")
	public class35 field1316;

	@ObfuscatedName("client.Yg")
	public class35 field1362;

	@ObfuscatedName("client.Zg")
	public class35 field1363;

	@ObfuscatedName("client.wd")
	public class36 field1193;

	@ObfuscatedName("client.xd")
	public class36 field1194;

	@ObfuscatedName("client.yd")
	public class36 field1195;

	@ObfuscatedName("client.df")
	public class36 field1271;

	@ObfuscatedName("client.ef")
	public class36 field1272;

	@ObfuscatedName("client.ff")
	public class36 field1273;

	@ObfuscatedName("client.ah")
	public class36 field1364;

	@ObfuscatedName("client.bh")
	public class36 field1365;

	@ObfuscatedName("client.Nh")
	public class36 field1401;

	@ObfuscatedName("client.Oh")
	public class36 field1402;

	@ObfuscatedName("client.Ph")
	public class36 field1403;

	@ObfuscatedName("client.Qh")
	public class36 field1404;

	@ObfuscatedName("client.Rh")
	public class36 field1405;

	@ObfuscatedName("client.di")
	public class36 field1417;

	@ObfuscatedName("client.ei")
	public class36 field1418;

	@ObfuscatedName("client.kj")
	public class36 field1473;

	@ObfuscatedName("client.lj")
	public class36 field1474;

	@ObfuscatedName("client.mj")
	public class36 field1475;

	@ObfuscatedName("client.nj")
	public class36 field1476;

	@ObfuscatedName("client.oj")
	public class36 field1477;

	@ObfuscatedName("client.ae")
	public class37 field1222;

	@ObfuscatedName("client.be")
	public class37 field1223;

	@ObfuscatedName("client.ce")
	public class37 field1224;

	@ObfuscatedName("client.de")
	public class37 field1225;

	@ObfuscatedName("client.Rc")
	public class43 field1164;

	@ObfuscatedName("client.Sc")
	public class43 field1165;

	@ObfuscatedName("client.Tc")
	public class43 field1166;

	@ObfuscatedName("client.Uc")
	public class43 field1167;

	@ObfuscatedName("client.Bd")
	public class43 field1198;

	@ObfuscatedName("client.Cd")
	public class43 field1199;

	@ObfuscatedName("client.Dd")
	public class43 field1200;

	@ObfuscatedName("client.Ed")
	public class43 field1201;

	@ObfuscatedName("client.Fd")
	public class43 field1202;

	@ObfuscatedName("client.Gd")
	public class43 field1203;

	@ObfuscatedName("client.Hd")
	public class43 field1204;

	@ObfuscatedName("client.Id")
	public class43 field1205;

	@ObfuscatedName("client.Jd")
	public class43 field1206;

	@ObfuscatedName("client.Di")
	public class43 field1441;

	@ObfuscatedName("client.Ei")
	public class43 field1442;

	@ObfuscatedName("client.Fi")
	public class43 field1443;

	@ObfuscatedName("client.Wi")
	public class43 field1460;

	@ObfuscatedName("client.Xi")
	public class43 field1461;

	@ObfuscatedName("client.Yi")
	public class43 field1462;

	@ObfuscatedName("client.Zi")
	public class43 field1463;

	@ObfuscatedName("client.aj")
	public class43 field1464;

	@ObfuscatedName("client.bj")
	public class43 field1465;

	@ObfuscatedName("client.cj")
	public class43 field1466;

	@ObfuscatedName("client.dj")
	public class43 field1467;

	@ObfuscatedName("client.ej")
	public class43 field1468;

	@ObfuscatedName("client.Nd")
	public class47 field1210;

	@ObfuscatedName("client.X")
	public class50 field1075;

	@ObfuscatedName("client.jg")
	public class58 field1324;

	@ObfuscatedName("client.mi")
	public class5 field1425;

	@ObfuscatedName("client.se")
	public String field1239;

	@ObfuscatedName("client.We")
	public String field1265;

	@ObfuscatedName("client.wi")
	public String field1434;

	@ObfuscatedName("client.Dg")
	public Socket field1343;

	@ObfuscatedName("client.Yc")
	public static boolean field1170;

	@ObfuscatedName("client.rd")
	public static boolean field1189;

	@ObfuscatedName("client.Ce")
	public static boolean field1246;

	@ObfuscatedName("client.Ie")
	public static boolean field1252;

	@ObfuscatedName("client.S")
	public int[] field1070;

	@ObfuscatedName("client.T")
	public int[] field1071;

	@ObfuscatedName("client.U")
	public int[] field1072;

	@ObfuscatedName("client.Pd")
	public int[] field1212;

	@ObfuscatedName("client.Qd")
	public int[] field1213;

	@ObfuscatedName("client.mh")
	public int[] field1375;

	@ObfuscatedName("client.nh")
	public int[] field1376;

	@ObfuscatedName("client.oh")
	public int[] field1377;

	@ObfuscatedName("client.Gh")
	public int[] field1394;

	@ObfuscatedName("client.Hh")
	public int[] field1395;

	@ObfuscatedName("client.Pe")
	public class36[] field1258;

	@ObfuscatedName("client.Gc")
	public byte[][] field1153;

	@ObfuscatedName("client.Qf")
	public byte[][][] field1305;

	@ObfuscatedName("client.xi")
	public int[][][] field1435;

	@ObfuscatedName("client.e(I)V")
	public final void method429() {
		for (int var1 = -1; var1 < field1147; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1145;
			} else {
				var2 = field1148[var1];
			}

			class27 var3 = field1146[var2];
			if (var3 != null) {
				method530(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class31.field550[var7];
			int var13 = class31.field551[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field550[var8];
			int var16 = class31.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1419 = arg0 - var9;
		field1420 = arg4 - var10;
		field1421 = arg3 - var11;
		field1422 = arg5;
		field1423 = arg1;
	}

	@ObfuscatedName("client.f(I)Z")
	public final boolean method431() {
		if (field1425 == null) {
			return false;
		}

		try {
			int var1 = field1425.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1121 == -1) {
				field1425.method41(field1440.field620, 0, 1);
				field1121 = field1440.field620[0] & 0xFF;
				if (field1125 != null) {
					field1121 = field1121 - field1125.method295() & 0xFF;
				}

				field1120 = class61.field958[field1121];
				var1--;
			}

			if (field1120 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1425.method41(field1440.field620, 0, 1);
				field1120 = field1440.field620[0] & 0xFF;
				var1--;
			}

			if (field1120 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1425.method41(field1440.field620, 0, 2);
				field1440.field621 = 0;
				field1120 = field1440.method231();
				var1 -= 2;
			}

			if (var1 < field1120) {
				return false;
			}

			field1440.field621 = 0;
			field1425.method41(field1440.field620, 0, field1120);
			field1122 = 0;
			field1361 = field1360;
			field1360 = field1359;
			field1359 = field1121;

			if (field1121 == 236) {
				int var2 = field1440.method231();
				method537(var2);

				if (field1158 != -1) {
					field1158 = -1;
					field1261 = true;
					field1314 = true;
				}

				if (field1074 != -1) {
					field1074 = -1;
					field1415 = true;
				}

				if (field1306) {
					field1306 = false;
					field1415 = true;
				}

				field1311 = var2;
				field1471 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 92) {
				int var3 = field1440.method229();
				int var4 = field1440.method229();
				int var5 = field1440.method229();
				int var6 = field1440.method229();
				field1187[var3] = true;
				field1282[var3] = var4;
				field1313[var3] = var5;
				field1233[var3] = var6;
				field1132[var3] = 0;
				field1121 = -1;
				return true;
			}

			if (field1121 == 213) {
				int var7 = field1440.method231();
				byte var8 = field1440.method230();
				field1300[var7] = var8;

				if (field1241[var7] != var8) {
					field1241[var7] = var8;
					method474(var7);
					field1261 = true;

					if (field1291 != -1) {
						field1415 = true;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 131) {
				field1104 = field1440.method229();
				field1121 = -1;
				return true;
			}

			if (field1121 == 81) {
				int var9 = field1440.method231();
				int var10 = field1440.method231();
				int var11 = field1440.method231();
				int var12 = field1440.method231();
				class4.field56[var9].field112 = var10;
				class4.field56[var9].field113 = var11;
				class4.field56[var9].field111 = var12;
				field1121 = -1;
				return true;
			}

			if (field1121 == 170) {
				int var13 = field1440.method231();
				int var14 = field1440.method231();
				if (field1196 == var13 && field1197 == var14 && field1220 == 2) {
					field1121 = -1;
					return true;
				}

				field1196 = var13;
				field1197 = var14;
				field1384 = (field1196 - 6) * 8;
				field1385 = (field1197 - 6) * 8;
				field1267 = false;
				if ((field1196 / 8 == 48 || field1196 / 8 == 49) && field1197 / 8 == 48) {
					field1267 = true;
				}

				if (field1196 / 8 == 48 && field1197 / 8 == 148) {
					field1267 = true;
				}

				field1220 = 1;
				field1275 = System.currentTimeMillis();
				field1166.method258();
				field1223.method202("Loading - please wait.", 151, 0, 257);
				field1223.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
				field1166.method259(4, field9, 4);
				int var15 = 0;
				for (int var16 = (field1196 - 6) / 8; var16 <= (field1196 + 6) / 8; var16++) {
					for (int var17 = (field1197 - 6) / 8; var17 <= (field1197 + 6) / 8; var17++) {
						var15++;
					}
				}

				field1153 = new byte[var15][];
				field1078 = new byte[var15][];
				field1070 = new int[var15];
				field1071 = new int[var15];
				field1072 = new int[var15];
				int var18 = 0;
				for (int var19 = (field1196 - 6) / 8; var19 <= (field1196 + 6) / 8; var19++) {
					for (int var20 = (field1197 - 6) / 8; var20 <= (field1197 + 6) / 8; var20++) {
						field1070[var18] = (var19 << 8) + var20;

						if (field1267 && (var20 == 49 || var20 == 149 || var20 == 147 || var19 == 50 || var19 == 49 && var20 == 47)) {
							field1071[var18] = -1;
							field1072[var18] = -1;
							var18++;
						} else {
							int var21 = field1071[var18] = field1210.method274(0, var20, var19);
							if (var21 != -1) {
								field1210.method279(3, var21);
							}

							int var22 = field1072[var18] = field1210.method274(1, var20, var19);
							if (var22 != -1) {
								field1210.method279(3, var22);
							}

							var18++;
						}
					}
				}

				int var23 = field1384 - field1386;
				int var24 = field1385 - field1387;
				field1386 = field1384;
				field1387 = field1385;

				for (int var25 = 0; var25 < 16384; var25++) {
					class26 var26 = field1455[var25];
					if (var26 != null) {
						for (int var27 = 0; var27 < 10; var27++) {
							var26.field410[var27] -= var23;
							var26.field411[var27] -= var24;
						}

						var26.field360 -= var23 * 128;
						var26.field361 -= var24 * 128;
					}
				}

				for (int var28 = 0; var28 < field1144; var28++) {
					class27 var29 = field1146[var28];
					if (var29 != null) {
						for (int var30 = 0; var30 < 10; var30++) {
							var29.field410[var30] -= var23;
							var29.field411[var30] -= var24;
						}

						var29.field360 -= var23 * 128;
						var29.field361 -= var24 * 128;
					}
				}

				field1211 = true;
				byte var31 = 0;
				byte var32 = 104;
				byte var33 = 1;
				if (var23 < 0) {
					var31 = 103;
					var32 = -1;
					var33 = -1;
				}

				byte var34 = 0;
				byte var35 = 104;
				byte var36 = 1;
				if (var24 < 0) {
					var34 = 103;
					var35 = -1;
					var36 = -1;
				}

				for (int var37 = var31; var37 != var32; var37 += var33) {
					for (int var38 = var34; var38 != var35; var38 += var36) {
						int var39 = var23 + var37;
						int var40 = var24 + var38;
						for (int var41 = 0; var41 < 4; var41++) {
							if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
								field1346[var41][var37][var38] = field1346[var41][var39][var40];
							} else {
								field1346[var41][var37][var38] = null;
							}
						}
					}
				}

				for (class40 var42 = (class40) field1218.method248(); var42 != null; var42 = (class40) field1218.method250()) {
					var42.field640 -= var23;
					var42.field641 -= var24;
					if (var42.field640 < 0 || var42.field641 < 0 || var42.field640 >= 104 || var42.field641 >= 104) {
						var42.method106();
					}
				}

				if (field1084 != 0) {
					field1084 -= var23;
					field1085 -= var24;
				}

				field1095 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 214) {
				int var43 = field1440.method231();
				int var44 = field1440.method231();
				int var45 = var44 >> 10 & 0x1F;
				int var46 = var44 >> 5 & 0x1F;
				int var47 = var44 & 0x1F;
				class4.field56[var43].field99 = (var47 << 3) + (var45 << 19) + (var46 << 11);
				field1121 = -1;
				return true;
			}

			if (field1121 == 206) {
				field1133 = field1440.method229();
				field1185 = field1440.method229();
				field1060 = field1440.method229();
				field1096 = true;
				field1415 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 51) {
				int var48 = field1440.method231();
				boolean var49 = field1440.method229() == 1;
				class4.field56[var48].field77 = var49;
				field1121 = -1;
				return true;
			}

			if (field1121 == 83) {
				field1084 = 0;
				field1121 = -1;
				return true;
			}

			if (field1121 == 45) {
				int var50 = field1440.method231();
				int var51 = field1440.method229();
				int var52 = field1440.method231();
				if (field1437 && !field1252 && field1244 < 50) {
					field1188[field1244] = var50;
					field1098[field1244] = var51;
					field1186[field1244] = class55.field790[var50] + var52;
					field1244++;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 151) {
				field1261 = true;
				int var53 = field1440.method229();
				int var54 = field1440.method234();
				int var55 = field1440.method229();
				field1328[var53] = var54;
				field1406[var53] = var55;
				field1416[var53] = 1;
				for (int var56 = 0; var56 < 98; var56++) {
					if (var54 >= field1253[var56]) {
						field1416[var53] = var56 + 2;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 222 || field1121 == 253 || field1121 == 191 || field1121 == 137 || field1121 == 193 || field1121 == 30 || field1121 == 53 || field1121 == 147 || field1121 == 2 || field1121 == 211 || field1121 == 136) {
				method546(field1440, field1121);
				field1121 = -1;
				return true;
			}

			if (field1121 == 98) {
				int var57 = field1440.method229();
				int var58 = field1440.method229();
				String var59 = field1440.method236();
				if (var57 >= 1 && var57 <= 5) {
					if (var59.equalsIgnoreCase("null")) {
						var59 = null;
					}

					field1379[var57 - 1] = var59;
					field1380[var57 - 1] = var58 == 0;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 44) {
				field1269 = field1440.method229();
				field1270 = field1440.method229();
				for (int var60 = field1269; var60 < field1269 + 8; var60++) {
					for (int var61 = field1270; var61 < field1270 + 8; var61++) {
						if (field1346[field1131][var60][var61] != null) {
							field1346[field1131][var60][var61] = null;
							method476(var60, var61);
						}
					}
				}

				for (class40 var62 = (class40) field1218.method248(); var62 != null; var62 = (class40) field1218.method250()) {
					if (var62.field640 >= field1269 && var62.field640 < field1269 + 8 && var62.field641 >= field1270 && var62.field641 < field1270 + 8 && field1131 == var62.field638) {
						var62.field649 = 0;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 181) {
				field1152 = field1440.method229();
				if (field1208 == field1152) {
					if (field1152 == 3) {
						field1208 = 1;
					} else {
						field1208 = 3;
					}

					field1261 = true;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 237) {
				int var63 = field1440.method231();
				method537(var63);

				if (field1074 != -1) {
					field1074 = -1;
					field1415 = true;
				}

				if (field1306) {
					field1306 = false;
					field1415 = true;
				}

				field1158 = var63;
				field1261 = true;
				field1314 = true;
				field1311 = -1;
				field1471 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 186) {
				int var64 = field1440.method231();
				int var65 = field1440.method232();
				class4 var66 = class4.field56[var64];
				var66.field109 = var65;

				if (var65 == -1) {
					var66.field59 = 0;
					var66.field60 = 0;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 27) {
				if (field1208 == 12) {
					field1261 = true;
				}

				field1190 = field1440.method229();
				field1121 = -1;
				return true;
			}

			if (field1121 == 141) {
				int var67 = field1440.method231();
				int var68 = field1440.method229();

				if (var67 == 0xFFFF) {
					var67 = -1;
				}

				field1366[var68] = var67;
				field1261 = true;
				field1314 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 228) {
				field1228 = field1440.method231() * 30;
				field1121 = -1;
				return true;
			}

			if (field1121 == 185) {
				int var69 = field1440.method231();
				int var70 = field1440.method231();
				class4.field56[var69].field105 = 1;
				class4.field56[var69].field106 = var70;
				field1121 = -1;
				return true;
			}

			if (field1121 == 149) {
				long var71 = field1440.method235();
				int var73 = field1440.method229();
				String var74 = class51.method304(class51.method301(var71));
				for (int var75 = 0; var75 < field1370; var75++) {
					if (field1068[var75] == var71) {
						if (field1183[var75] != var73) {
							field1183[var75] = var73;
							field1261 = true;

							if (var73 > 0) {
								method553(var74 + " has logged in.", 5, "");
							}

							if (var73 == 0) {
								method553(var74 + " has logged out.", 5, "");
							}
						}

						var74 = null;
						break;
					}
				}

				if (var74 != null && field1370 < 200) {
					field1068[field1370] = var71;
					field1281[field1370] = var74;
					field1183[field1370] = var73;
					field1370++;
					field1261 = true;
				}

				boolean var76 = false;
				while (!var76) {
					var76 = true;
					for (int var77 = 0; var77 < field1370 - 1; var77++) {
						if (field1183[var77] != field1249 && field1183[var77 + 1] == field1249 || field1183[var77] == 0 && field1183[var77 + 1] != 0) {
							int var78 = field1183[var77];
							field1183[var77] = field1183[var77 + 1];
							field1183[var77 + 1] = var78;
							String var79 = field1281[var77];
							field1281[var77] = field1281[var77 + 1];
							field1281[var77 + 1] = var79;
							long var80 = field1068[var77];
							field1068[var77] = field1068[var77 + 1];
							field1068[var77 + 1] = var80;
							field1261 = true;
							var76 = false;
						}
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 55) {
				field1240 = field1440.method229();
				if (field1240 == 1) {
					field1160 = field1440.method231();
				}

				if (field1240 >= 2 && field1240 <= 6) {
					if (field1240 == 2) {
						field1090 = 64;
						field1091 = 64;
					}

					if (field1240 == 3) {
						field1090 = 0;
						field1091 = 64;
					}

					if (field1240 == 4) {
						field1090 = 128;
						field1091 = 64;
					}

					if (field1240 == 5) {
						field1090 = 64;
						field1091 = 0;
					}

					if (field1240 == 6) {
						field1090 = 64;
						field1091 = 128;
					}

					field1240 = 2;
					field1087 = field1440.method231();
					field1088 = field1440.method231();
					field1089 = field1440.method229();
				}

				if (field1240 == 10) {
					field1274 = field1440.method231();
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 138) {
				field1095 = false;

				for (int var82 = 0; var82 < 5; var82++) {
					field1187[var82] = false;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 241) {
				field1095 = true;
				field1396 = field1440.method229();
				field1397 = field1440.method229();
				field1398 = field1440.method231();
				field1399 = field1440.method229();
				field1400 = field1440.method229();
				if (field1400 >= 100) {
					int var83 = field1396 * 128 + 64;
					int var84 = field1397 * 128 + 64;
					int var85 = method551(field1131, var84, var83) - field1398;
					int var86 = var83 - field1419;
					int var87 = var85 - field1420;
					int var88 = var84 - field1421;
					int var89 = (int) Math.sqrt(var86 * var86 + var88 * var88);
					field1422 = (int) (Math.atan2(var87, var89) * 325.949D) & 0x7FF;
					field1423 = (int) (Math.atan2(var86, var88) * -325.949D) & 0x7FF;

					if (field1422 < 128) {
						field1422 = 128;
					}

					if (field1422 > 383) {
						field1422 = 383;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 224) {
				long var90 = field1440.method235();
				int var92 = field1440.method234();
				int var93 = field1440.method229();
				boolean var94 = false;
				for (int var95 = 0; var95 < 100; var95++) {
					if (field1340[var95] == var92) {
						var94 = true;
						break;
					}
				}

				if (var93 <= 1) {
					for (int var96 = 0; var96 < field1245; var96++) {
						if (field1302[var96] == var90) {
							var94 = true;
							break;
						}
					}
				}

				if (!var94 && field1229 == 0) {
					try {
						field1340[field1285] = var92;
						field1285 = (field1285 + 1) % 100;
						String var97 = class52.method306(field1120 - 13, field1440);
						var97 = class71.method401(var97);
						if (var93 == 2 || var93 == 3) {
							method553(var97, 7, "@cr2@" + class51.method304(class51.method301(var90)));
						} else if (var93 == 1) {
							method553(var97, 7, "@cr1@" + class51.method304(class51.method301(var90)));
						} else {
							method553(var97, 3, class51.method304(class51.method301(var90)));
						}
					} catch (Exception var166) {
						signlink.reporterror("cde1");
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 119) {
				field1347 = field1440.method234();
				field1337 = field1440.method231();
				field1079 = field1440.method229();
				field1231 = field1440.method231();
				field1278 = field1440.method229();
				if (field1347 != 0 && field1311 == -1) {
					signlink.dnslookup(class51.method303(field1347));
					method461();
					short var99 = 650;
					if (field1079 != 201 || field1278 == 1) {
						var99 = 655;
					}

					field1219 = "";
					field1294 = false;

					for (int var100 = 0; var100 < class4.field56.length; var100++) {
						if (class4.field56[var100] != null && class4.field56[var100].field65 == var99) {
							field1311 = class4.field56[var100].field62;
							break;
						}
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 19) {
				field1106 = field1440.method229();
				field1121 = -1;
				return true;
			}

			if (field1121 == 94) {
				int var101 = field1440.method231();
				class4.field56[var101].field105 = 3;

				if (field1073.field438 == null) {
					class4.field56[var101].field106 = (field1073.field420[11] << 5) + (field1073.field420[8] << 10) + (field1073.field420[0] << 15) + (field1073.field421[0] << 25) + (field1073.field421[4] << 20) + field1073.field420[1];
				} else {
					class4.field56[var101].field106 = (int) (field1073.field438.field879 + 0x12345678L);
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 245) {
				int var102 = field1440.method231();
				int var103 = field1440.method231();

				if (field1074 != -1) {
					field1074 = -1;
					field1415 = true;
				}

				if (field1306) {
					field1306 = false;
					field1415 = true;
				}

				field1311 = var102;
				field1158 = var103;
				field1261 = true;
				field1314 = true;
				field1471 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 156) {
				if (field1208 == 12) {
					field1261 = true;
				}

				field1288 = field1440.method232();
				field1121 = -1;
				return true;
			}

			if (field1121 == 13) {
				field1261 = true;
				int var104 = field1440.method231();
				class4 var105 = class4.field56[var104];
				while (field1440.field621 < field1120) {
					int var106 = field1440.method243();
					int var107 = field1440.method231();
					int var108 = field1440.method229();
					if (var108 == 255) {
						var108 = field1440.method234();
					}

					if (var106 >= 0 && var106 < var105.field57.length) {
						var105.field57[var106] = var107;
						var105.field58[var106] = var108;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 75) {
				method562();
				field1121 = -1;
				return false;
			}

			if (field1121 == 118) {
				field1371 = field1440.method229();
				field1261 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 226) {
				for (int var109 = 0; var109 < field1241.length; var109++) {
					if (field1300[var109] != field1241[var109]) {
						field1241[var109] = field1300[var109];
						method474(var109);
						field1261 = true;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 115) {
				field1095 = true;
				field1107 = field1440.method229();
				field1108 = field1440.method229();
				field1109 = field1440.method231();
				field1110 = field1440.method229();
				field1111 = field1440.method229();
				if (field1111 >= 100) {
					field1419 = field1107 * 128 + 64;
					field1421 = field1108 * 128 + 64;
					field1420 = method551(field1131, field1421, field1419) - field1109;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 169) {
				int var110 = field1440.method231();
				String var111 = field1440.method236();
				class4.field56[var110].field97 = var111;

				if (field1366[field1208] == class4.field56[var110].field62) {
					field1261 = true;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 145) {
				int var112 = field1440.method231();
				int var113 = field1440.method234();
				field1300[var112] = var113;

				if (field1241[var112] != var113) {
					field1241[var112] = var113;
					method474(var112);
					field1261 = true;

					if (field1291 != -1) {
						field1415 = true;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 7) {
				int var114 = field1440.method231();
				int var115 = field1440.method231();
				class4.field56[var114].field105 = 2;
				class4.field56[var114].field106 = var115;
				field1121 = -1;
				return true;
			}

			if (field1121 == 238) {
				String var116 = field1440.method236();
				if (var116.endsWith(":tradereq:")) {
					String var117 = var116.substring(0, var116.indexOf(":"));
					long var118 = class51.method300(var117);
					boolean var120 = false;
					for (int var121 = 0; var121 < field1245; var121++) {
						if (field1302[var121] == var118) {
							var120 = true;
							break;
						}
					}

					if (!var120 && field1229 == 0) {
						method553("wishes to trade with you.", 4, var117);
					}
				} else if (var116.endsWith(":duelreq:")) {
					String var122 = var116.substring(0, var116.indexOf(":"));
					long var123 = class51.method300(var122);
					boolean var125 = false;
					for (int var126 = 0; var126 < field1245; var126++) {
						if (field1302[var126] == var123) {
							var125 = true;
							break;
						}
					}

					if (!var125 && field1229 == 0) {
						method553("wishes to duel with you.", 8, var122);
					}
				} else if (var116.endsWith(":chalreq:")) {
					String var127 = var116.substring(0, var116.indexOf(":"));
					long var128 = class51.method300(var127);
					boolean var130 = false;
					for (int var131 = 0; var131 < field1245; var131++) {
						if (field1302[var131] == var128) {
							var130 = true;
							break;
						}
					}

					if (!var130 && field1229 == 0) {
						String var132 = var116.substring(var116.indexOf(":") + 1, var116.length() - 9);
						method553(var132, 8, var127);
					}
				} else {
					method553(var116, 0, "");
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 9) {
				int var133 = field1440.method232();
				field1291 = var133;
				field1415 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 153) {
				int var134 = field1440.method231();
				int var135 = field1440.method231();
				int var136 = field1440.method231();

				if (var135 == 0xFFFF) {
					class4.field56[var134].field105 = 0;
					field1121 = -1;
					return true;
				}

				class60 var137 = class60.method348(var135);
				class4.field56[var134].field105 = 4;
				class4.field56[var134].field106 = var135;
				class4.field56[var134].field112 = var137.field922;
				class4.field56[var134].field113 = var137.field923;
				class4.field56[var134].field111 = var137.field921 * 100 / var136;
				field1121 = -1;
				return true;
			}

			if (field1121 == 22) {
				field1269 = field1440.method229();
				field1270 = field1440.method229();
				field1121 = -1;
				return true;
			}

			if (field1121 == 196) {
				method434(field1120, field1440);
				field1211 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 62) {
				field1242 = false;
				field1306 = true;
				field1154 = "";
				field1415 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 33) {
				field1094 = field1440.method231();
				field1320 = field1440.method229();
				field1121 = -1;
				return true;
			}

			if (field1121 == 108) {
				field1269 = field1440.method229();
				field1270 = field1440.method229();

				while (field1440.field621 < field1120) {
					int var138 = field1440.method229();
					method546(field1440, var138);
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 188) {
				field1261 = true;
				int var139 = field1440.method231();
				class4 var140 = class4.field56[var139];
				int var141 = field1440.method231();
				for (int var142 = 0; var142 < var141; var142++) {
					var140.field57[var142] = field1440.method231();
					int var143 = field1440.method229();
					if (var143 == 255) {
						var143 = field1440.method234();
					}

					var140.field58[var142] = var143;
				}

				for (int var144 = var141; var144 < var140.field57.length; var144++) {
					var140.field57[var144] = 0;
					var140.field58[var144] = 0;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 38) {
				int var145 = field1440.method231();
				if (var145 == 0xFFFF) {
					var145 = -1;
				}

				if (field1298 != var145 && field1436 && !field1252 && field1142 == 0) {
					field1283 = var145;
					field1284 = true;
					field1210.method279(2, field1283);
				}

				field1298 = var145;
				field1121 = -1;
				return true;
			}

			if (field1121 == 183) {
				int var146 = field1440.method231();
				int var147 = field1440.method231();
				if (field1436 && !field1252) {
					field1283 = var146;
					field1284 = false;
					field1210.method279(2, field1283);
					field1142 = var147;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 204) {
				int var148 = field1440.method231();
				class4 var149 = class4.field56[var148];
				for (int var150 = 0; var150 < var149.field57.length; var150++) {
					var149.field57[var150] = -1;
					var149.field57[var150] = 0;
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 111) {
				for (int var151 = 0; var151 < field1146.length; var151++) {
					if (field1146[var151] != null) {
						field1146[var151].field388 = -1;
					}
				}

				for (int var152 = 0; var152 < field1455.length; var152++) {
					if (field1455[var152] != null) {
						field1455[var152].field388 = -1;
					}
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 246) {
				int var153 = field1440.method232();
				if (var153 >= 0) {
					method537(var153);
				}

				field1333 = var153;
				field1121 = -1;
				return true;
			}

			if (field1121 == 3) {
				field1208 = field1440.method229();
				field1261 = true;
				field1314 = true;
				field1121 = -1;
				return true;
			}

			if (field1121 == 105) {
				field1245 = field1120 / 8;
				for (int var154 = 0; var154 < field1245; var154++) {
					field1302[var154] = field1440.method235();
				}

				field1121 = -1;
				return true;
			}

			if (field1121 == 77) {
				int var155 = field1440.method231();
				method537(var155);

				if (field1158 != -1) {
					field1158 = -1;
					field1261 = true;
					field1314 = true;
				}

				field1074 = var155;
				field1415 = true;
				field1311 = -1;
				field1471 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 195) {
				method516(field1440, field1120);
				field1121 = -1;
				return true;
			}

			if (field1121 == 212) {
				if (field1158 != -1) {
					field1158 = -1;
					field1261 = true;
					field1314 = true;
				}

				if (field1074 != -1) {
					field1074 = -1;
					field1415 = true;
				}

				if (field1306) {
					field1306 = false;
					field1415 = true;
				}

				field1311 = -1;
				field1471 = false;
				field1121 = -1;
				return true;
			}

			if (field1121 == 130) {
				int var156 = field1440.method231();
				int var157 = field1440.method232();
				int var158 = field1440.method232();
				class4 var159 = class4.field56[var156];
				var159.field69 = var157;
				var159.field70 = var158;
				field1121 = -1;
				return true;
			}

			if (field1121 == 85) {
				int var160 = field1440.method231();
				int var161 = field1440.method231();
				class4 var162 = class4.field56[var160];
				if (var162 != null && var162.field63 == 0) {
					if (var161 < 0) {
						var161 = 0;
					}

					if (var161 > var162.field75 - var162.field67) {
						var161 = var162.field75 - var162.field67;
					}

					var162.field76 = var161;
				}

				field1121 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1121 + "," + field1120 + " - " + field1360 + "," + field1361);
			method562();
		} catch (IOException var167) {
			method445();
		} catch (Exception var168) {
			String var164 = "T2 - " + field1121 + "," + field1360 + "," + field1361 + " - " + field1120 + "," + (field1073.field410[0] + field1384) + "," + (field1073.field411[0] + field1385) + " - ";
			for (int var165 = 0; var165 < field1120 && var165 < 50; var165++) {
				var164 = var164 + field1440.field620[var165] + ",";
			}

			signlink.reporterror(var164);
			method562();
		}

		return true;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method432(int arg0) {
		int[] var2 = field1086.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1305[arg0][var7][var5] & 0x18) == 0) {
					field1184.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1305[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1184.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1086.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1305[arg0][var11][var10] & 0x18) == 0) {
					method508(var10, var11, arg0, var9, var8);
				}

				if (arg0 < 3 && (field1305[arg0 + 1][var11][var10] & 0x8) != 0) {
					method508(var10, var11, arg0 + 1, var9, var8);
				}
			}
		}

		field1166.method258();
		field1334 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1184.method79(field1131, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field848;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1209[field1131].field963;
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

						field1367[field1334] = field1472[var15];
						field1335[field1334] = var16;
						field1336[field1334] = var17;
						field1334++;
					}
				}
			}
		}

		field1243++;
		if (field1243 > 112) {
			field1243 = 0;
			field1424.method218(164);
			field1424.method219(50);
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method433(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method434(int arg0, class38 arg1) {
		field1214 = 0;
		field1149 = 0;
		method459(arg1, arg0);
		method457(arg1, arg0);
		method544(arg0, arg1);
		method469(arg1, arg0);

		for (int var3 = 0; var3 < field1214; var3++) {
			int var4 = field1215[var3];
			if (field1143 != field1146[var4].field405) {
				field1146[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1147; var5++) {
			if (field1146[field1148[var5]] == null) {
				signlink.reporterror(field1292 + " null entry in pl list - pos:" + var5 + " size:" + field1147);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method435(String arg0) {
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

	@ObfuscatedName("client.b(B)V")
	public final void method436() {
		for (class30 var1 = (class30) field1431.method248(); var1 != null; var1 = (class30) field1431.method250()) {
			if (field1131 != var1.field458 || field1143 > var1.field464) {
				var1.method106();
			} else if (field1143 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1455[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(field1143, method551(var1.field458, var2.field361, var2.field360) - var1.field462, var2.field361, var2.field360);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1094 == var3) {
						var4 = field1073;
					} else {
						var4 = field1146[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(field1143, method551(var1.field458, var4.field361, var4.field360) - var1.field462, var4.field361, var4.field360);
					}
				}

				var1.method121(field1341);
				field1184.method61(var1, (int) var1.field470, var1.field477, -1, (int) var1.field469, field1131, 60, (int) var1.field471, false);
			}
		}

		field1433++;
		if (field1433 > 1174) {
			field1433 = 0;
			field1424.method218(90);
			field1424.method219(0);
			int var5 = field1424.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method220(11499);
			}

			field1424.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method219(94);
			}

			field1424.method220(51693);
			field1424.method219(16);
			field1424.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method219(65);
			}

			field1424.method219((int) (Math.random() * 256.0D));
			field1424.method220(22990);
			field1424.method228(field1424.field621 - var5);
		}
	}

	@ObfuscatedName("client.a(Ld;Z)Z")
	public final boolean method437(class4 arg0) {
		int var2 = arg0.field65;
		if (field1371 == 2) {
			if (var2 == 201) {
				field1415 = true;
				field1306 = false;
				field1242 = true;
				field1438 = "";
				field1326 = 1;
				field1383 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1415 = true;
				field1306 = false;
				field1242 = true;
				field1438 = "";
				field1326 = 2;
				field1383 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1124 = 250;
			return true;
		}

		if (var2 == 501) {
			field1415 = true;
			field1306 = false;
			field1242 = true;
			field1438 = "";
			field1326 = 4;
			field1383 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1415 = true;
			field1306 = false;
			field1242 = true;
			field1438 = "";
			field1326 = 5;
			field1383 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1221[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field977 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field977) {
							var5 = 0;
						}
					}

					if (!class64.field978[var5].field984 && class64.field978[var5].field979 == var3 + (field1114 ? 0 : 7)) {
						break;
					}
				}

				field1221[var3] = var5;
				field1372 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1257[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1061[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1061[var6].length) {
					var8 = 0;
				}
			}

			field1257[var6] = var8;
			field1372 = true;
		}

		if (var2 == 324 && !field1114) {
			field1114 = true;
			method560();
		}

		if (var2 == 325 && field1114) {
			field1114 = false;
			method560();
		}

		if (var2 == 326) {
			field1424.method218(145);
			field1424.method219(field1114 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1424.method219(field1221[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1424.method219(field1257[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1294 = !field1294;
		}

		if (var2 >= 601 && var2 <= 612) {
			method461();

			if (field1219.length() > 0) {
				field1424.method218(85);
				field1424.method225(class51.method300(field1219));
				field1424.method219(var2 - 601);
				field1424.method219(field1294 ? 1 : 0);
			}
		}

		return false;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.g(I)V")
	public final void method438() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1133 = (field1133 + 1) % 4;
				field1096 = true;
				field1415 = true;
				field1424.method218(242);
				field1424.method219(field1133);
				field1424.method219(field1185);
				field1424.method219(field1060);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1185 = (field1185 + 1) % 3;
				field1096 = true;
				field1415 = true;
				field1424.method218(242);
				field1424.method219(field1133);
				field1424.method219(field1185);
				field1424.method219(field1060);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1060 = (field1060 + 1) % 3;
				field1096 = true;
				field1415 = true;
				field1424.method218(242);
				field1424.method219(field1133);
				field1424.method219(field1185);
				field1424.method219(field1060);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1311 == -1) {
					method461();
					field1219 = "";
					field1294 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1118 = field1311 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method553("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;ILab;I)V")
	public final void method439(class38 arg0, int arg1, class27 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg0.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg0.method238(var6, var5, 0);
			field1151[arg1] = var7;
			arg2.method116(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg0.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field388 == var8) {
				arg2.field392 = 0;
			}

			int var9 = arg0.method229();
			if (arg2.field388 == var8 && var8 != -1) {
				int var10 = class66.field996[var8].field1010;
				if (var10 == 1) {
					arg2.field389 = 0;
					arg2.field390 = 0;
					arg2.field391 = var9;
					arg2.field392 = 0;
				}

				if (var10 == 2) {
					arg2.field392 = 0;
				}
			} else if (var8 == -1 || arg2.field388 == -1 || class66.field996[var8].field1004 >= class66.field996[arg2.field388].field1004) {
				arg2.field388 = var8;
				arg2.field389 = 0;
				arg2.field390 = 0;
				arg2.field391 = var9;
				arg2.field392 = 0;
				arg2.field414 = arg2.field409;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg2.field382 = arg0.method231();
			if (arg2.field382 == 0xFFFF) {
				arg2.field382 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg2.field372 = arg0.method236();
			if (arg2.field372.charAt(0) == '~') {
				arg2.field372 = arg2.field372.substring(1);
				method553(arg2.field372, 2, arg2.field416);
			} else if (field1073 == arg2) {
				method553(arg2.field372, 2, arg2.field416);
			}

			arg2.field374 = 0;
			arg2.field375 = 0;
			arg2.field373 = 150;
		}

		if ((arg3 & 0x10) == 0x10) {
			int var11 = arg0.method229();
			int var12 = arg0.method229();
			arg2.method114(var11, field1143, var12);
			arg2.field379 = field1143 + 300;
			arg2.field380 = arg0.method229();
			arg2.field381 = arg0.method229();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg2.field383 = arg0.method231();
			arg2.field384 = arg0.method231();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var13 = arg0.method231();
			int var14 = arg0.method229();
			int var15 = arg0.method229();
			int var16 = arg0.field621;

			if (arg2.field416 != null && arg2.field417) {
				long var17 = class51.method300(arg2.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1245; var20++) {
						if (field1302[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1229 == 0) {
					try {
						String var21 = class52.method306(var15, arg0);
						var21 = class71.method401(var21);
						arg2.field372 = var21;
						arg2.field374 = var13 >> 8;
						arg2.field375 = var13 & 0xFF;
						arg2.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method553(var21, 1, "@cr2@" + arg2.field416);
						} else if (var14 == 1) {
							method553(var21, 1, "@cr1@" + arg2.field416);
						} else {
							method553(var21, 2, arg2.field416);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field621 = var15 + var16;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg2.field393 = arg0.method231();
			int var23 = arg0.method234();
			arg2.field397 = var23 >> 16;
			arg2.field396 = (var23 & 0xFFFF) + field1143;
			arg2.field394 = 0;
			arg2.field395 = 0;

			if (arg2.field396 > field1143) {
				arg2.field394 = -1;
			}

			if (arg2.field393 == 0xFFFF) {
				arg2.field393 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg2.field398 = arg0.method229();
			arg2.field400 = arg0.method229();
			arg2.field399 = arg0.method229();
			arg2.field401 = arg0.method229();
			arg2.field402 = arg0.method231() + field1143;
			arg2.field403 = arg0.method231() + field1143;
			arg2.field404 = arg0.method229();
			arg2.method112();
		}

		if ((arg3 & 0x400) == 0x400) {
			int var24 = arg0.method229();
			int var25 = arg0.method229();
			arg2.method114(var24, field1143, var25);
			arg2.field379 = field1143 + 300;
			arg2.field380 = arg0.method229();
			arg2.field381 = arg0.method229();
		}
	}

	@ObfuscatedName("client.a(ILib;II)V")
	public final void method440(class35 arg0, int arg1, int arg2) {
		int var4 = field1450 + field1286 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1180 + 256);
			var7 = var7 * 256 / (field1180 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method192(var8 + 94 + 4 - arg0.field601 / 2, 83 - var9 - arg0.field602 / 2 - 4, field1194);
			} else {
				arg0.method186(var8 + 94 + 4 - arg0.field601 / 2, 83 - var9 - arg0.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method441(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1254[field1382] = "Remove @whi@" + arg0.field97;
				field1064[field1382] = 884;
				field1382++;
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

		field1254[field1382] = "Remove @whi@" + field1281[var2];
		field1064[field1382] = 513;
		field1382++;
		field1254[field1382] = "Message @whi@" + field1281[var2];
		field1064[field1382] = 902;
		field1382++;
		return true;
	}

	@ObfuscatedName("client.a(Lib;IIZ)V")
	public final void method442(class35 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1450 + field1286 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1180 + 256);
			var7 = var7 * 256 / (field1180 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1159.method191(256, 20, 20, 15, var10, 15, var12 + 94 + 4 - 10, 83 - var13 - 20);
		} else {
			method440(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method443() {
		if (field1389 != 0) {
			class37 var1 = field1223;
			int var2 = 0;
			if (field1228 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1323[var3] != null) {
					int var4 = field1321[var3];
					String var5 = field1322[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1185 == 0 || field1185 == 1 && method557(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206("From", var7, var8, 0);
						var1.method206("From", var7 - 1, var8, 0xFFFF);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1470[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1470[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var5 + ": " + field1323[var3], var7, var11, 0);
						var1.method206(var5 + ": " + field1323[var3], var7 - 1, var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1185 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(field1323[var3], var9, 4, 0);
						var1.method206(field1323[var3], var9 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1185 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206("To " + var5 + ": " + field1323[var3], var10, 4, 0);
						var1.method206("To " + var5 + ": " + field1323[var3], var10 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method444() {
		if (field1137 == 0) {
			field1254[0] = "Cancel";
			field1064[0] = 1106;
			field1382 = 1;
			method484();
			field1067 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1311 == -1) {
					method460();
				} else {
					method494(4, class4.field56[field1311], field18, 0, 4, field17);
				}
			}

			if (field1318 != field1067) {
				field1318 = field1067;
			}

			field1067 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1158 != -1) {
					method494(553, class4.field56[field1158], field18, 0, 205, field17);
				} else if (field1366[field1208] != -1) {
					method494(553, class4.field56[field1366[field1208]], field18, 0, 205, field17);
				}
			}

			if (field1216 != field1067) {
				field1261 = true;
				field1216 = field1067;
			}

			field1067 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1074 != -1) {
					method494(17, class4.field56[field1074], field18, 0, 357, field17);
				} else if (field18 < 434 && field17 < 426) {
					method452(field18 - 357, field17 - 17);
				}
			}

			if (field1074 != -1 && field1447 != field1067) {
				field1415 = true;
				field1447 = field1067;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1382 - 1; var2++) {
					if (field1064[var2] < 1000 && field1064[var2 + 1] > 1000) {
						String var3 = field1254[var2];
						field1254[var2] = field1254[var2 + 1];
						field1254[var2 + 1] = var3;
						int var4 = field1064[var2];
						field1064[var2] = field1064[var2 + 1];
						field1064[var2 + 1] = var4;
						int var5 = field1062[var2];
						field1062[var2] = field1062[var2 + 1];
						field1062[var2 + 1] = var5;
						int var6 = field1063[var2];
						field1063[var2] = field1063[var2 + 1];
						field1063[var2 + 1] = var6;
						int var7 = field1065[var2];
						field1065[var2] = field1065[var2 + 1];
						field1065[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	public final void init() {
		field1249 = Integer.parseInt(getParameter("nodeid"));
		field1250 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method453();
		} else {
			method549();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1251 = false;
		} else {
			field1251 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.c(B)V")
	public final void method445() {
		if (field1124 > 0) {
			method562();
		} else {
			field1166.method258();
			field1223.method202("Connection lost", 144, 0, 257);
			field1223.method202("Connection lost", 143, 0xFFFFFF, 256);
			field1223.method202("Please wait - attempting to reestablish", 159, 0, 257);
			field1223.method202("Please wait - attempting to reestablish", 158, 0xFFFFFF, 256);
			field1166.method259(4, field9, 4);
			field1104 = 0;
			field1084 = 0;
			class5 var1 = field1425;
			field1429 = false;
			field1414 = 0;
			method472(field1292, field1293, true);

			if (!field1429) {
				method562();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1364.method199(arg1, arg4);
		field1365.method199(arg1, arg2 + arg4 - 16);
		class33.method157(field1304, arg2 - 32, arg4 + 16, 16, arg1);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg3 / (arg0 - arg2);
		class33.method157(field1266, var6, arg4 + var7 + 16, 16, arg1);
		class33.method162(arg4 + var7 + 16, field1454, arg1, var6);
		class33.method162(arg4 + var7 + 16, field1454, arg1 + 1, var6);
		class33.method160(field1454, arg4 + var7 + 16, 16, arg1);
		class33.method160(field1454, arg4 + var7 + 17, 16, arg1);
		class33.method162(arg4 + var7 + 16, field1097, arg1 + 15, var6);
		class33.method162(arg4 + var7 + 17, field1097, arg1 + 14, var6 - 1);
		class33.method160(field1097, arg4 + var7 + var6 + 15, 16, arg1);
		class33.method160(field1097, arg4 + var7 + var6 + 14, 15, arg1 + 1);
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1256 = arg0;
		field1434 = arg1;
		method449();

		if (field1075 == null) {
			super.method13(arg0, arg1);
		} else {
			field1462.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1224.method202("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(var3 / 2 - 152, var6, 34, 0x8C1111, 304);
			class33.method158(var3 / 2 - 151, var6 + 1, 32, 0, 302);
			class33.method157(0x8C1111, 30, var6 + 2, arg0 * 3, var3 / 2 - 150);
			class33.method157(0, 30, var6 + 2, 300 - arg0 * 3, arg0 * 3 + var3 / 2 - 150);
			field1224.method202(arg1, var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2);
			field1462.method259(202, field9, 171);

			if (field1192) {
				field1192 = false;

				if (!field1338) {
					field1463.method259(0, field9, 0);
					field1464.method259(637, field9, 0);
				}

				field1460.method259(128, field9, 0);
				field1461.method259(202, field9, 371);
				field1465.method259(0, field9, 265);
				field1466.method259(562, field9, 265);
				field1467.method259(128, field9, 171);
				field1468.method259(562, field9, 171);
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method447() {
		for (int var1 = 0; var1 < field1244; var1++) {
			if (field1186[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1188[var1] != field1128 || field1098[var1] != field1182) {
						class38 var3 = class55.method319(field1098[var1], field1188[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1232 / 22 + field1126) {
							field1232 = var3.field621;
							field1126 = System.currentTimeMillis();

							if (method523(var3.field620, var3.field621)) {
								field1128 = field1188[var1];
								field1182 = field1098[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method463()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1186[var1] != -5) {
					field1186[var1] = -5;
				} else {
					field1244--;
					for (int var5 = var1; var5 < field1244; var5++) {
						field1188[var5] = field1188[var5 + 1];
						field1098[var5] = field1098[var5 + 1];
						field1186[var5] = field1186[var5 + 1];
					}

					var1--;
				}
			} else {
				field1186[var1]--;
			}
		}

		if (field1142 > 0) {
			field1142 -= 20;
			if (field1142 < 0) {
				field1142 = 0;
			}

			if (field1142 == 0 && field1436 && !field1252) {
				field1283 = field1298;
				field1284 = true;
				field1210.method279(2, field1283);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method448() {
		int var1 = 5;
		field1378[8] = 0;
		int var2 = 0;
		while (field1378[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method495("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 298);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1378[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1378[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1378[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1378[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1378[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1378[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1378[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method13(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method13(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field1373 = !field1373;
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method449() {
		if (field1460 == null) {
			field10 = null;
			field1167 = null;
			field1165 = null;
			field1164 = null;
			field1166 = null;
			field1441 = null;
			field1442 = null;
			field1443 = null;
			field1463 = new class43(method11(), 265, 128);
			class33.method155();
			field1464 = new class43(method11(), 265, 128);
			class33.method155();
			field1460 = new class43(method11(), 171, 509);
			class33.method155();
			field1461 = new class43(method11(), 132, 360);
			class33.method155();
			field1462 = new class43(method11(), 200, 360);
			class33.method155();
			field1465 = new class43(method11(), 238, 202);
			class33.method155();
			field1466 = new class43(method11(), 238, 203);
			class33.method155();
			field1467 = new class43(method11(), 94, 74);
			class33.method155();
			field1468 = new class43(method11(), 94, 75);
			class33.method155();

			if (field1075 != null) {
				method512();
				method519();
			}

			field1192 = true;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method450() {
		if (field1104 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1450 + field1286 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1180 + 256) * var4 >> 8;
				var5 = (field1180 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1073.field360 + var6 >> 7;
				int var9 = field1073.field361 - var7 >> 7;
				boolean var10 = method488(field1073.field411[0], field1073.field410[0], 0, var8, var9, 0, true, 0, 0, 1, 0);
				if (var10) {
					field1424.method219(var1);
					field1424.method219(var2);
					field1424.method220(field1450);
					field1424.method219(57);
					field1424.method219(field1286);
					field1424.method219(field1180);
					field1424.method219(89);
					field1424.method220(field1073.field360);
					field1424.method220(field1073.field361);
					field1424.method219(field1407);
					field1424.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method451(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(III)V")
	public final void method452(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1323[var4] != null) {
				int var5 = field1321[var4];
				int var6 = field1259 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1322[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1133 == 0 || field1133 == 1 && method557(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1073.field416)) {
						if (field1297 >= 1) {
							field1254[field1382] = "Report abuse @whi@" + var7;
							field1064[field1382] = 524;
							field1382++;
						}

						field1254[field1382] = "Add ignore @whi@" + var7;
						field1064[field1382] = 47;
						field1382++;
						field1254[field1382] = "Add friend @whi@" + var7;
						field1064[field1382] = 605;
						field1382++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1389 == 0 && (var5 == 7 || field1185 == 0 || field1185 == 1 && method557(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1297 >= 1) {
							field1254[field1382] = "Report abuse @whi@" + var7;
							field1064[field1382] = 524;
							field1382++;
						}

						field1254[field1382] = "Add ignore @whi@" + var7;
						field1064[field1382] = 47;
						field1382++;
						field1254[field1382] = "Add friend @whi@" + var7;
						field1064[field1382] = 605;
						field1382++;
					}

					var3++;
				}

				if (var5 == 4 && (field1060 == 0 || field1060 == 1 && method557(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1254[field1382] = "Accept trade @whi@" + var7;
						field1064[field1382] = 507;
						field1382++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1389 == 0 && field1185 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1060 == 0 || field1060 == 1 && method557(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1254[field1382] = "Accept challenge @whi@" + var7;
						field1064[field1382] = 957;
						field1382++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void method453() {
		class18.field258 = true;
		class34.field573 = true;
		field1252 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method454() {
		if (field1137 == 0) {
			int var1 = field23;
			if (field1262 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1408) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1171 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1171 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1171 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1172 - 10 || var2 > field1174 + field1172 + 10 || var3 < field1173 - 10 || var3 > field1175 + field1173 + 10) {
						field1408 = false;

						if (field1171 == 1) {
							field1261 = true;
						}

						if (field1171 == 2) {
							field1415 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1172;
					int var5 = field1173;
					int var6 = field1174;
					int var7 = field24;
					int var8 = field25;
					if (field1171 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1171 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1171 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1382; var10++) {
						int var11 = (field1382 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method555(var9);
					}

					field1408 = false;

					if (field1171 == 1) {
						field1261 = true;
					}

					if (field1171 == 2) {
						field1415 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1382 > 0) {
					int var12 = field1064[field1382 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1062[field1382 - 1];
						int var14 = field1063[field1382 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1134 = false;
							field1116 = 0;
							field1135 = var14;
							field1136 = var13;
							field1137 = 2;
							field1138 = field24;
							field1139 = field25;

							if (class4.field56[var14].field62 == field1311) {
								field1137 = 1;
							}

							if (class4.field56[var14].field62 == field1074) {
								field1137 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1113 == 1 || method496(field1382 - 1)) && field1382 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1382 > 0) {
					method555(field1382 - 1);
				}

				if (var1 != 2 || field1382 <= 0) {
					return;
				}

				method480();
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method455(long arg0) {
		if (arg0 != 0L) {
			if (field1370 >= 100 && field1320 != 1) {
				method553("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field1370 >= 200) {
				method553("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1370; var4++) {
					if (field1068[var4] == arg0) {
						method553(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1245; var5++) {
					if (field1302[var5] == arg0) {
						method553("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field1073.field416)) {
					field1281[field1370] = var3;
					field1068[field1370] = arg0;
					field1183[field1370] = 0;
					field1370++;
					field1261 = true;
					field1424.method218(221);
					field1424.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method456() {
		field1167.method258();
		class34.field584 = field1375;
		field1195.method199(0, 0);

		if (field1242) {
			field1224.method202(field1383, 40, 0, 239);
			field1224.method202(field1438 + "*", 60, 128, 239);
		} else if (field1306) {
			field1224.method202("Enter amount:", 40, 0, 239);
			field1224.method202(field1154 + "*", 60, 128, 239);
		} else if (field1130 != null) {
			field1224.method202(field1130, 40, 0, 239);
			field1224.method202("Click to continue", 60, 128, 239);
		} else if (field1074 != -1) {
			method522(0, 0, class4.field56[field1074], 0);
		} else if (field1291 == -1) {
			class37 var1 = field1223;
			int var2 = 0;
			class33.method154(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1323[var3] != null) {
					int var4 = field1321[var3];
					int var5 = field1259 + 70 - var2 * 14;
					String var6 = field1322[var3];
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
							var1.method206(field1323[var3], var5, 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1133 == 0 || field1133 == 1 && method557(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1470[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1470[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var6 + ":", var5, var8, 0);
							var8 += var1.method204(var6) + 8;
							var1.method206(field1323[var3], var5, var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1389 == 0 && (var4 == 7 || field1185 == 0 || field1185 == 1 && method557(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206("From", var5, var9, 0);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1470[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1470[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var6 + ":", var5, var11, 0);
							var11 += var1.method204(var6) + 8;
							var1.method206(field1323[var3], var5, var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1060 == 0 || field1060 == 1 && method557(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1323[var3], var5, 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1389 == 0 && field1185 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(field1323[var3], var5, 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1389 == 0 && field1185 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206("To " + var6 + ":", var5, 4, 0);
							var1.method206(field1323[var3], var5, var1.method204("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1060 == 0 || field1060 == 1 && method557(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1323[var3], var5, 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1409 = var2 * 14 + 7;
			if (field1409 < 78) {
				field1409 = 78;
			}

			method446(field1409, 463, 77, field1409 - field1259 - 77, 0);
			String var10;
			if (field1073 == null || field1073.field416 == null) {
				var10 = class51.method304(field1292);
			} else {
				var10 = field1073.field416;
			}

			var1.method206(var10 + ":", 90, 4, 0);
			var1.method206(field1117 + "*", 90, var1.method204(var10 + ": ") + 6, 255);
			class33.method160(0, 77, 479, 0);
		} else {
			method522(0, 0, class4.field56[field1291], 0);
		}

		if (field1408 && field1171 == 2) {
			method506();
		}

		field1167.method259(17, field9, 357);
		field1166.method258();
		class34.field584 = field1377;
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method457(class38 arg0, int arg1) {
		int var3 = arg0.method240(8);
		if (var3 < field1147) {
			for (int var4 = var3; var4 < field1147; var4++) {
				field1215[field1214++] = field1148[var4];
			}
		}

		if (var3 > field1147) {
			signlink.reporterror(field1292 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1147 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1148[var5];
			class27 var7 = field1146[var6];
			int var8 = arg0.method240(1);
			if (var8 == 0) {
				field1148[field1147++] = var6;
				var7.field405 = field1143;
			} else {
				int var9 = arg0.method240(2);
				if (var9 == 0) {
					field1148[field1147++] = var6;
					var7.field405 = field1143;
					field1150[field1149++] = var6;
				} else if (var9 == 1) {
					field1148[field1147++] = var6;
					var7.field405 = field1143;
					int var10 = arg0.method240(3);
					var7.method111(var10, false);
					int var11 = arg0.method240(1);
					if (var11 == 1) {
						field1150[field1149++] = var6;
					}
				} else if (var9 == 2) {
					field1148[field1147++] = var6;
					var7.field405 = field1143;
					int var12 = arg0.method240(3);
					var7.method111(var12, true);
					int var13 = arg0.method240(3);
					var7.method111(var13, true);
					int var14 = arg0.method240(1);
					if (var14 == 1) {
						field1150[field1149++] = var6;
					}
				} else if (var9 == 3) {
					field1215[field1214++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method458(class38 arg0, int arg1) {
		while (arg0.field622 + 21 < arg1 * 8) {
			int var3 = arg0.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1455[var3] == null) {
				field1455[var3] = new class26();
			}

			class26 var4 = field1455[var3];
			field1457[field1456++] = var3;
			var4.field405 = field1143;
			var4.field415 = class59.method341(arg0.method240(12));
			var4.field364 = var4.field415.field882;
			var4.field408 = var4.field415.field904;
			var4.field367 = var4.field415.field886;
			var4.field368 = var4.field415.field887;
			var4.field369 = var4.field415.field888;
			var4.field370 = var4.field415.field889;
			var4.field365 = var4.field415.field885;
			int var5 = arg0.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method240(1);
			var4.method110(field1073.field410[0] + var5, var7 == 1, field1073.field411[0] + var6);
			int var8 = arg0.method240(1);
			if (var8 == 1) {
				field1150[field1149++] = var3;
			}
		}

		arg0.method241();
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1170) {
			field1168 = true;
		} else {
			field1170 = true;
			boolean var1 = false;
			String var2 = method547();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.246")) {
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

			if (var2.endsWith("192.168.1.242")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field1115[var3] = new class48(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					method448();
					field1075 = method527(field1378[1], 1, "title screen", "title", 25);
					field1222 = new class37(false, "p11_full", field1075);
					field1223 = new class37(false, "p12_full", field1075);
					field1224 = new class37(false, "b12_full", field1075);
					field1225 = new class37(true, "q8_full", field1075);
					method512();
					method519();
					class50 var4 = method527(field1378[2], 2, "config", "config", 30);
					class50 var5 = method527(field1378[3], 3, "interface", "interface", 35);
					class50 var6 = method527(field1378[4], 4, "2d graphics", "media", 40);
					class50 var7 = method527(field1378[6], 6, "textures", "textures", 45);
					class50 var8 = method527(field1378[7], 7, "chat system", "wordenc", 50);
					class50 var9 = method527(field1378[8], 8, "sound effects", "sounds", 55);
					field1305 = new byte[4][104][104];
					field1435 = new int[4][105][105];
					field1184 = new class18(104, 104, field1435, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field1209[var10] = new class62(104, 104);
					}

					field1086 = new class35(512, 512);
					class50 var11 = method527(field1378[5], 5, "update list", "versionlist", 60);
					method13(60, "Connecting to update server");
					field1210 = new class47();
					field1210.method270(var11, this);
					class7.method44(field1210.method273());
					class31.method123(field1210.method272(0), field1210);

					if (!field1252) {
						field1283 = 0;
						try {
							field1283 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1284 = true;
						field1210.method279(2, field1283);

						while (field1210.method280() > 0) {
							method498();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1210.field738 > 3) {
								method435("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1210.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1210.method279(1, var13);
					}

					while (field1210.method280() > 0) {
						int var14 = var12 - field1210.method280();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method498();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1210.field738 > 3) {
							method435("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1210.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1210.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1210.method279(0, var16);
						}
					}

					int var18 = field1210.method280();
					while (field1210.method280() > 0) {
						int var19 = var18 - field1210.method280();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method498();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1115[0] != null) {
						method13(75, "Requesting maps");
						field1210.method279(3, field1210.method274(0, 48, 47));
						field1210.method279(3, field1210.method274(1, 48, 47));
						field1210.method279(3, field1210.method274(0, 48, 48));
						field1210.method279(3, field1210.method274(1, 48, 48));
						field1210.method279(3, field1210.method274(0, 48, 49));
						field1210.method279(3, field1210.method274(1, 48, 49));
						field1210.method279(3, field1210.method274(0, 47, 47));
						field1210.method279(3, field1210.method274(1, 47, 47));
						field1210.method279(3, field1210.method274(0, 47, 48));
						field1210.method279(3, field1210.method274(1, 47, 48));
						field1210.method279(3, field1210.method274(0, 148, 48));
						field1210.method279(3, field1210.method274(1, 148, 48));
						int var20 = field1210.method280();
						while (field1210.method280() > 0) {
							int var21 = var20 - field1210.method280();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method498();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1210.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1210.method277(var23);
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
							field1210.method282(var25, 0, var23);
						}
					}

					field1210.method275(field1251);

					if (!field1252) {
						int var26 = field1210.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1210.method278(var27)) {
								field1210.method282((byte) 1, 2, var27);
							}
						}
					}

					method13(80, "Unpacking media");
					field1193 = new class36(var6, "invback", 0);
					field1195 = new class36(var6, "chatback", 0);
					field1194 = new class36(var6, "mapback", 0);
					field1271 = new class36(var6, "backbase1", 0);
					field1272 = new class36(var6, "backbase2", 0);
					field1273 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1105[var28] = new class36(var6, "sideicons", var28);
					}

					field1316 = new class35(var6, "compass", 0);
					field1159 = new class35(var6, "mapedge", 0);
					field1159.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1327[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1472[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1432[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1315[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1362 = new class35(var6, "mapmarker", 0);
					field1363 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1093[var33] = new class35(var6, "cross", var33);
					}

					field1100 = new class35(var6, "mapdots", 0);
					field1101 = new class35(var6, "mapdots", 1);
					field1102 = new class35(var6, "mapdots", 2);
					field1103 = new class35(var6, "mapdots", 3);
					field1364 = new class36(var6, "scrollbar", 0);
					field1365 = new class36(var6, "scrollbar", 1);
					field1473 = new class36(var6, "redstone1", 0);
					field1474 = new class36(var6, "redstone2", 0);
					field1475 = new class36(var6, "redstone3", 0);
					field1476 = new class36(var6, "redstone1", 0);
					field1476.method196();
					field1477 = new class36(var6, "redstone2", 0);
					field1477.method196();
					field1401 = new class36(var6, "redstone1", 0);
					field1401.method197();
					field1402 = new class36(var6, "redstone2", 0);
					field1402.method197();
					field1403 = new class36(var6, "redstone3", 0);
					field1403.method197();
					field1404 = new class36(var6, "redstone1", 0);
					field1404.method196();
					field1404.method197();
					field1405 = new class36(var6, "redstone2", 0);
					field1405.method196();
					field1405.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1470[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1198 = new class43(method11(), var35.field598, var35.field597);
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1199 = new class43(method11(), var36.field598, var36.field597);
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1200 = new class43(method11(), var37.field598, var37.field597);
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1201 = new class43(method11(), var38.field598, var38.field597);
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1202 = new class43(method11(), var39.field598, var39.field597);
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1203 = new class43(method11(), var40.field598, var40.field597);
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1204 = new class43(method11(), var41.field598, var41.field597);
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1205 = new class43(method11(), var42.field598, var42.field597);
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1206 = new class43(method11(), var43.field598, var43.field597);
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1472[var48] != null) {
							field1472[var48].method182(var45 + var47, var46 + var47, var44 + var47);
						}

						if (field1327[var48] != null) {
							field1327[var48].method198(var45 + var47, var46 + var47, var44 + var47);
						}
					}

					method13(83, "Unpacking textures");
					class34.method169(var7);
					class34.method173(0.8D);
					class34.method168(20);
					method13(86, "Unpacking config");
					class66.method381(var4);
					class57.method328(var4);
					class63.method371(var4);
					class60.method346(var4);
					class59.method339(var4);
					class64.method375(var4);
					class68.method384(var4);
					class70.method389(var4);
					class69.method387(var4);
					class60.field914 = field1251;

					if (!field1252) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1222, field1223, field1224, field1225 };
					class4.method32(var5, var6, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1194.field603[field1194.field605 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1342[var52] = var53;
						field1358[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1194.field603[field1194.field605 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1280[var56 - 5] = var57 - 25;
						field1307[var56 - 5] = var58 - var57;
					}

					class34.method166(96, 479);
					field1375 = class34.field584;
					class34.method166(261, 190);
					field1376 = class34.field584;
					class34.method166(334, 512);
					field1377 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(512, var60, 800, 500, 334);
					class71.method391(var8);
					field1324 = new class58(this);
					method12(field1324, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field873 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1434 + " " + field1256);
					field1217 = true;
				}
			} else {
				field1099 = true;
			}
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void method459(class38 arg0, int arg1) {
		arg0.method239();
		int var3 = arg0.method240(1);
		if (var3 != 0) {
			int var4 = arg0.method240(2);
			if (var4 == 0) {
				field1150[field1149++] = field1145;
			} else if (var4 == 1) {
				int var5 = arg0.method240(3);
				field1073.method111(var5, false);
				int var6 = arg0.method240(1);
				if (var6 == 1) {
					field1150[field1149++] = field1145;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method240(3);
				field1073.method111(var7, true);
				int var8 = arg0.method240(3);
				field1073.method111(var8, true);
				int var9 = arg0.method240(1);
				if (var9 == 1) {
					field1150[field1149++] = field1145;
				}
			} else if (var4 == 3) {
				field1131 = arg0.method240(2);
				int var10 = arg0.method240(7);
				int var11 = arg0.method240(7);
				int var12 = arg0.method240(1);
				field1073.method110(var10, var12 == 1, var11);
				int var13 = arg0.method240(1);
				if (var13 == 1) {
					field1150[field1149++] = field1145;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method460() {
		if (field1235 == 0 && field1262 == 0) {
			field1254[field1382] = "Walk here";
			field1064[field1382] = 718;
			field1062[field1382] = field17;
			field1063[field1382] = field18;
			field1382++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field548; var2++) {
			int var3 = class31.field549[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1184.method80(field1131, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field862 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1235 == 1) {
						field1254[field1382] = "Use " + field1239 + " with @cya@" + var8.field831;
						field1064[field1382] = 810;
						field1065[field1382] = var3;
						field1062[field1382] = var4;
						field1063[field1382] = var5;
						field1382++;
					} else if (field1262 != 1) {
						if (var8.field847 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field847[var9] != null) {
									field1254[field1382] = var8.field847[var9] + " @cya@" + var8.field831;

									if (var9 == 0) {
										field1064[field1382] = 625;
									}

									if (var9 == 1) {
										field1064[field1382] = 721;
									}

									if (var9 == 2) {
										field1064[field1382] = 743;
									}

									if (var9 == 3) {
										field1064[field1382] = 357;
									}

									if (var9 == 4) {
										field1064[field1382] = 1071;
									}

									field1065[field1382] = var3;
									field1062[field1382] = var4;
									field1063[field1382] = var5;
									field1382++;
								}
							}
						}

						field1254[field1382] = "Examine @cya@" + var8.field831;
						field1064[field1382] = 1381;
						field1065[field1382] = var8.field828 << 14;
						field1062[field1382] = var4;
						field1063[field1382] = var5;
						field1382++;
					} else if ((field1264 & 0x4) == 4) {
						field1254[field1382] = field1265 + " @cya@" + var8.field831;
						field1064[field1382] = 899;
						field1065[field1382] = var3;
						field1062[field1382] = var4;
						field1063[field1382] = var5;
						field1382++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1455[var7];
					if (var10.field415.field882 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1456; var11++) {
							class26 var12 = field1455[field1457[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field882 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method526(var12.field415, field1457[var11], var4, var5);
							}
						}

						for (int var13 = 0; var13 < field1147; var13++) {
							class27 var14 = field1146[field1148[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method515(var5, var4, var14, field1148[var13]);
							}
						}
					}

					method526(var10.field415, var7, var4, var5);
				}

				if (var6 == 0) {
					class27 var15 = field1146[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1456; var16++) {
							class26 var17 = field1455[field1457[var16]];
							if (var17 != null && var17.field415.field882 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method526(var17.field415, field1457[var16], var4, var5);
							}
						}

						for (int var18 = 0; var18 < field1147; var18++) {
							class27 var19 = field1146[field1148[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method515(var5, var4, var19, field1148[var18]);
							}
						}
					}

					method515(var5, var4, var15, var7);
				}

				if (var6 == 3) {
					class41 var20 = field1346[field1131][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1235 == 1) {
								field1254[field1382] = "Use " + field1239 + " with @lre@" + var22.field917;
								field1064[field1382] = 111;
								field1065[field1382] = var21.field455;
								field1062[field1382] = var4;
								field1063[field1382] = var5;
								field1382++;
							} else if (field1262 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field931 != null && var22.field931[var23] != null) {
										field1254[field1382] = var22.field931[var23] + " @lre@" + var22.field917;

										if (var23 == 0) {
											field1064[field1382] = 139;
										}

										if (var23 == 1) {
											field1064[field1382] = 778;
										}

										if (var23 == 2) {
											field1064[field1382] = 617;
										}

										if (var23 == 3) {
											field1064[field1382] = 224;
										}

										if (var23 == 4) {
											field1064[field1382] = 662;
										}

										field1065[field1382] = var21.field455;
										field1062[field1382] = var4;
										field1063[field1382] = var5;
										field1382++;
									} else if (var23 == 2) {
										field1254[field1382] = "Take @lre@" + var22.field917;
										field1064[field1382] = 617;
										field1065[field1382] = var21.field455;
										field1062[field1382] = var4;
										field1063[field1382] = var5;
										field1382++;
									}
								}

								field1254[field1382] = "Examine @lre@" + var22.field917;
								field1064[field1382] = 1152;
								field1065[field1382] = var21.field455;
								field1062[field1382] = var4;
								field1063[field1382] = var5;
								field1382++;
							} else if ((field1264 & 0x1) == 1) {
								field1254[field1382] = field1265 + " @lre@" + var22.field917;
								field1064[field1382] = 370;
								field1065[field1382] = var21.field455;
								field1062[field1382] = var4;
								field1063[field1382] = var5;
								field1382++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method461() {
		field1424.method218(165);

		if (field1158 != -1) {
			field1158 = -1;
			field1261 = true;
			field1471 = false;
			field1314 = true;
		}

		if (field1074 != -1) {
			field1074 = -1;
			field1415 = true;
			field1471 = false;
		}

		field1311 = -1;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method462() {
		field1165.method258();

		if (field1104 == 2) {
			byte[] var1 = field1194.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1316.method190(0, 0, 33, field1358, field1342, 33, 256, field1450, 25, 25);
			field1166.method258();
		} else {
			int var5 = field1450 + field1286 & 0x7FF;
			int var6 = field1073.field360 / 32 + 48;
			int var7 = 464 - field1073.field361 / 32;
			field1086.method190(5, 25, 151, field1307, field1280, 146, field1180 + 256, var5, var7, var6);
			field1316.method190(0, 0, 33, field1358, field1342, 33, 256, field1450, 25, 25);

			for (int var8 = 0; var8 < field1334; var8++) {
				int var9 = field1335[var8] * 4 + 2 - field1073.field360 / 32;
				int var10 = field1336[var8] * 4 + 2 - field1073.field361 / 32;
				method440(field1367[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1346[field1131][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1073.field360 / 32;
						int var15 = var12 * 4 + 2 - field1073.field361 / 32;
						method440(field1100, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field1456; var16++) {
				class26 var17 = field1455[field1457[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field905 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field896) {
						int var19 = var17.field360 / 32 - field1073.field360 / 32;
						int var20 = var17.field361 / 32 - field1073.field361 / 32;
						method440(field1101, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field1147; var21++) {
				class27 var22 = field1146[field1148[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1073.field360 / 32;
					int var24 = var22.field361 / 32 - field1073.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1370; var28++) {
						if (field1068[var28] == var26 && field1183[var28] != 0) {
							var25 = true;
							break;
						}
					}

					if (field1073.field439 != 0 && var22.field439 != 0) {
						if (field1073.field439 == var22.field439) {
							var25 = true;
						} else {
							var25 = false;
						}
					}

					if (var25) {
						method440(field1103, var24, var23);
					} else {
						method440(field1102, var24, var23);
					}
				}
			}

			if (field1240 != 0 && field1143 % 20 < 10) {
				if (field1240 == 1 && field1160 >= 0 && field1160 < field1455.length) {
					class26 var29 = field1455[field1160];
					if (var29 != null) {
						int var30 = var29.field360 / 32 - field1073.field360 / 32;
						int var31 = var29.field361 / 32 - field1073.field361 / 32;
						method442(field1363, var30, var31);
					}
				}

				if (field1240 == 2) {
					int var32 = (field1087 - field1384) * 4 + 2 - field1073.field360 / 32;
					int var33 = (field1088 - field1385) * 4 + 2 - field1073.field361 / 32;
					method442(field1363, var32, var33);
				}

				if (field1240 == 10 && field1274 >= 0 && field1274 < field1146.length) {
					class27 var34 = field1146[field1274];
					if (var34 != null) {
						int var35 = var34.field360 / 32 - field1073.field360 / 32;
						int var36 = var34.field361 / 32 - field1073.field361 / 32;
						method442(field1363, var35, var36);
					}
				}
			}

			if (field1084 != 0) {
				int var37 = field1084 * 4 + 2 - field1073.field360 / 32;
				int var38 = field1085 * 4 + 2 - field1073.field361 / 32;
				method440(field1362, var38, var37);
			}

			class33.method157(0xFFFFFF, 3, 78, 3, 97);
			field1166.method258();
		}
	}

	@ObfuscatedName("client.g(B)Z")
	public final boolean method463() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method464(int arg0, int arg1) {
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

	@ObfuscatedName("client.f(Z)V")
	public final void method465() {
		field1229 = 0;
		int var1 = (field1073.field360 >> 7) + field1384;
		int var2 = (field1073.field361 >> 7) + field1385;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1229 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1229 = 1;
		}

		if (field1229 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1229 = 0;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method466() {
		if (field1167 == null) {
			method487();
			field10 = null;
			field1460 = null;
			field1461 = null;
			field1462 = null;
			field1463 = null;
			field1464 = null;
			field1465 = null;
			field1466 = null;
			field1467 = null;
			field1468 = null;
			field1167 = new class43(method11(), 96, 479);
			field1165 = new class43(method11(), 156, 172);
			class33.method155();
			field1194.method199(0, 0);
			field1164 = new class43(method11(), 261, 190);
			field1166 = new class43(method11(), 334, 512);
			class33.method155();
			field1441 = new class43(method11(), 50, 496);
			field1442 = new class43(method11(), 37, 269);
			field1443 = new class43(method11(), 45, 249);
			field1192 = true;
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method467() {
		if (field1252 && field1220 == 2 && class3.field33 != field1131) {
			field1166.method258();
			field1223.method202("Loading - please wait.", 151, 0, 257);
			field1223.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
			field1166.method259(4, field9, 4);
			field1220 = 1;
			field1275 = System.currentTimeMillis();
		}

		if (field1220 == 1) {
			int var1 = method468();
			if (var1 != 0 && System.currentTimeMillis() - field1275 > 360000L) {
				signlink.reporterror(field1292 + " glcfb " + field1230 + "," + var1 + "," + field1252 + "," + field1115[0] + "," + field1210.method280() + "," + field1131 + "," + field1196 + "," + field1197);
				field1275 = System.currentTimeMillis();
			}
		}

		if (field1220 == 2 && field1374 != field1131) {
			field1374 = field1131;
			method432(field1131);
		}
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method468() {
		for (int var1 = 0; var1 < field1153.length; var1++) {
			if (field1153[var1] == null && field1071[var1] != -1) {
				return -1;
			}

			if (field1078[var1] == null && field1072[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1153.length; var3++) {
			byte[] var4 = field1078[var3];
			if (var4 != null) {
				int var5 = (field1070[var3] >> 8) * 64 - field1384;
				int var6 = (field1070[var3] & 0xFF) * 64 - field1385;
				var2 &= class3.method16(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1211) {
			return -4;
		} else {
			field1220 = 2;
			class3.field33 = field1131;
			method505();
			field1424.method218(81);
			return 0;
		}
	}

	@ObfuscatedName("client.a(Llb;BI)V")
	public final void method469(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1149; var3++) {
			int var4 = field1150[var3];
			class27 var5 = field1146[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method229() << 8;
			}

			method439(arg0, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method470() {
		if (field1382 >= 2 || field1235 != 0 || field1262 != 0) {
			String var1;
			if (field1235 == 1 && field1382 < 2) {
				var1 = "Use " + field1239 + " with...";
			} else if (field1262 == 1 && field1382 < 2) {
				var1 = field1265 + "...";
			} else {
				var1 = field1254[field1382 - 1];
			}

			if (field1382 > 2) {
				var1 = var1 + "@whi@ / " + (field1382 - 2) + " more options";
			}

			field1224.method211(15, 0xFFFFFF, field1143 / 1000, true, var1, 4);
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method471() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1212[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1212[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1213[var10] = (field1212[var10 - 1] + field1212[var10 + 1] + field1212[var10 - 128] + field1212[var10 + 128]) / 4;
			}
		}

		field1345 += 128;
		if (field1345 > field1394.length) {
			field1345 -= field1394.length;
			int var11 = (int) (Math.random() * 12.0D);
			method481(field1258[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1213[var14 + 128] - field1394[field1345 + var14 & field1394.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1212[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1317[var16] = field1317[var16 + 1];
		}

		field1317[var1 - 1] = (int) (Math.sin(field1143 / 14.0D) * 16.0D + Math.sin(field1143 / 15.0D) * 14.0D + Math.sin(field1143 / 16.0D) * 12.0D);

		if (field1226 > 0) {
			field1226 -= 4;
		}

		if (field1227 > 0) {
			field1227 -= 4;
		}

		if (field1226 == 0 && field1227 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1226 = 1024;
			}

			if (var17 == 1) {
				field1227 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method9() {
		if (field1168 || field1217 || field1099) {
			method538();
		} else {
			field1388++;

			if (field1429) {
				method536();
			} else {
				method490(false);
			}

			field1179 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method472(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1289 = "";
				field1290 = "Connecting to server...";
				method490(true);
			}

			field1425 = new class5(method518(field1250 + 43594), this);
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1424.field621 = 0;
			field1424.method219(14);
			field1424.method219(var6);
			field1425.method42(0, 2, field1424.field620);

			for (int var7 = 0; var7 < 8; var7++) {
				field1425.method39();
			}

			int var8 = field1425.method39();
			int var9 = var8;

			if (var8 == 0) {
				field1425.method41(field1440.field620, 0, 8);
				field1440.field621 = 0;
				field1230 = field1440.method235();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1230 >> 32), (int) field1230 };
				field1424.field621 = 0;
				field1424.method219(10);
				field1424.method223(var10[0]);
				field1424.method223(var10[1]);
				field1424.method223(var10[2]);
				field1424.method223(var10[3]);
				field1424.method223(signlink.uid);
				field1424.method226(arg0);
				field1424.method226(arg1);
				field1424.method244(field1427, field1207);
				field1255.field621 = 0;

				if (arg2) {
					field1255.method219(18);
				} else {
					field1255.method219(16);
				}

				field1255.method219(field1424.field621 + 36 + 1 + 1 + 2);
				field1255.method219(255);
				field1255.method220(298);
				field1255.method219(field1252 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field1255.method223(field1378[var11]);
				}

				field1255.method227(0, field1424.field620, field1424.field621);
				field1424.field625 = new class49(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field1125 = new class49(var10);
				field1425.method42(0, field1255.field621, field1255.field620);
				var8 = field1425.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method472(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1297 = field1425.method39();
				field1189 = field1425.method39() == 1;
				field1319 = 0L;
				field1448 = 0;
				field1324.field870 = 0;
				field14 = true;
				field1453 = true;
				field1429 = true;
				field1424.field621 = 0;
				field1440.field621 = 0;
				field1121 = -1;
				field1359 = -1;
				field1360 = -1;
				field1361 = -1;
				field1120 = 0;
				field1122 = 0;
				field1228 = 0;
				field1124 = 0;
				field1240 = 0;
				field1382 = 0;
				field1408 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field1323[var13] = null;
				}

				field1235 = 0;
				field1262 = 0;
				field1220 = 0;
				field1244 = 0;
				field1161 = (int) (Math.random() * 100.0D) - 50;
				field1177 = (int) (Math.random() * 110.0D) - 55;
				field1140 = (int) (Math.random() * 80.0D) - 40;
				field1286 = (int) (Math.random() * 120.0D) - 60;
				field1180 = (int) (Math.random() * 30.0D) - 20;
				field1450 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1104 = 0;
				field1374 = -1;
				field1084 = 0;
				field1085 = 0;
				field1147 = 0;
				field1456 = 0;

				for (int var14 = 0; var14 < field1144; var14++) {
					field1146[var14] = null;
					field1151[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field1455[var15] = null;
				}

				field1073 = field1146[field1145] = new class27();
				field1431.method252();
				field1234.method252();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field1346[var16][var17][var18] = null;
						}
					}
				}

				field1218 = new class41();
				field1371 = 0;
				field1370 = 0;
				field1291 = -1;
				field1074 = -1;
				field1311 = -1;
				field1158 = -1;
				field1333 = -1;
				field1471 = false;
				field1208 = 3;
				field1306 = false;
				field1408 = false;
				field1242 = false;
				field1130 = null;
				field1106 = 0;
				field1152 = -1;
				field1114 = true;
				method560();

				for (int var19 = 0; var19 < 5; var19++) {
					field1257[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field1379[var20] = null;
					field1380[var20] = false;
				}

				field1066 = 0;
				field1458 = 0;
				field1268 = 0;
				field1176 = 0;
				field1169 = 0;
				field1276 = 0;
				field1112 = 0;
				field1368 = 0;
				field1303 = 0;
				method466();
			} else if (var8 == 3) {
				field1289 = "";
				field1290 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1289 = "Your account has been disabled.";
				field1290 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1289 = "Your account is already logged in.";
				field1290 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1289 = "RuneScape has been updated!";
				field1290 = "Please reload this page.";
			} else if (var8 == 7) {
				field1289 = "This world is full.";
				field1290 = "Please use a different world.";
			} else if (var8 == 8) {
				field1289 = "Unable to connect.";
				field1290 = "Login server offline.";
			} else if (var8 == 9) {
				field1289 = "Login limit exceeded.";
				field1290 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1289 = "Unable to connect.";
				field1290 = "Bad session id.";
			} else if (var8 == 11) {
				field1290 = "Login server rejected session.";
				field1290 = "Please try again.";
			} else if (var8 == 12) {
				field1289 = "You need a members account to login to this world.";
				field1290 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1289 = "Could not complete login.";
				field1290 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1289 = "The server is being updated.";
				field1290 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1429 = true;
				field1424.field621 = 0;
				field1440.field621 = 0;
				field1121 = -1;
				field1359 = -1;
				field1360 = -1;
				field1361 = -1;
				field1120 = 0;
				field1122 = 0;
				field1228 = 0;
				field1382 = 0;
				field1408 = false;
				field1275 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1289 = "Login attempts exceeded.";
				field1290 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1289 = "You are standing in a members-only area.";
				field1290 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1289 = "Invalid loginserver requested";
				field1290 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field1425.method39(); var21 >= 0; var21--) {
					field1289 = "You have only just left another world";
					field1290 = "Your profile will be transferred in: " + var21 + " seconds";
					method490(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method472(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field1289 = "Unexpected server response";
				field1290 = "Please try using a different world.";
			} else if (var9 != 0) {
				field1289 = "No response from server";
				field1290 = "Please try using a different world.";
			} else if (field1414 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field1414++;
				method472(arg0, arg1, arg2);
			} else {
				field1289 = "No response from loginserver";
				field1290 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field1289 = "";
			field1290 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method473() {
		int var1 = field1107 * 128 + 64;
		int var2 = field1108 * 128 + 64;
		int var3 = method551(field1131, var2, var1) - field1109;

		if (field1419 < var1) {
			field1419 += (var1 - field1419) * field1111 / 1000 + field1110;
			if (field1419 > var1) {
				field1419 = var1;
			}
		}

		if (field1419 > var1) {
			field1419 -= (field1419 - var1) * field1111 / 1000 + field1110;
			if (field1419 < var1) {
				field1419 = var1;
			}
		}

		if (field1420 < var3) {
			field1420 += (var3 - field1420) * field1111 / 1000 + field1110;
			if (field1420 > var3) {
				field1420 = var3;
			}
		}

		if (field1420 > var3) {
			field1420 -= (field1420 - var3) * field1111 / 1000 + field1110;
			if (field1420 < var3) {
				field1420 = var3;
			}
		}

		if (field1421 < var2) {
			field1421 += (var2 - field1421) * field1111 / 1000 + field1110;
			if (field1421 > var2) {
				field1421 = var2;
			}
		}

		if (field1421 > var2) {
			field1421 -= (field1421 - var2) * field1111 / 1000 + field1110;
			if (field1421 < var2) {
				field1421 = var2;
			}
		}

		int var4 = field1396 * 128 + 64;
		int var5 = field1397 * 128 + 64;
		int var6 = method551(field1131, var5, var4) - field1398;
		int var7 = var4 - field1419;
		int var8 = var6 - field1420;
		int var9 = var5 - field1421;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1422 < var11) {
			field1422 += (var11 - field1422) * field1400 / 1000 + field1399;
			if (field1422 > var11) {
				field1422 = var11;
			}
		}

		if (field1422 > var11) {
			field1422 -= (field1422 - var11) * field1400 / 1000 + field1399;
			if (field1422 < var11) {
				field1422 = var11;
			}
		}

		int var13 = var12 - field1423;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1423 += field1400 * var13 / 1000 + field1399;
			field1423 &= 0x7FF;
		}

		if (var13 < 0) {
			field1423 -= -var13 * field1400 / 1000 + field1399;
			field1423 &= 0x7FF;
		}

		int var14 = var12 - field1423;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1423 = var12;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method474(int arg0) {
		int var2 = class70.field1039[arg0].field1047;
		if (var2 != 0) {
			int var3 = field1241[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class34.method173(0.9D);
				}

				if (var3 == 2) {
					class34.method173(0.8D);
				}

				if (var3 == 3) {
					class34.method173(0.7D);
				}

				if (var3 == 4) {
					class34.method173(0.6D);
				}

				class60.field956.method103();
				field1192 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1436;

				if (var3 == 0) {
					method475(field1436, 0);
					field1436 = true;
				}

				if (var3 == 1) {
					method475(field1436, -400);
					field1436 = true;
				}

				if (var3 == 2) {
					method475(field1436, -800);
					field1436 = true;
				}

				if (var3 == 3) {
					method475(field1436, -1200);
					field1436 = true;
				}

				if (var3 == 4) {
					field1436 = false;
				}

				if (field1436 != var4 && !field1252) {
					if (field1436) {
						field1283 = field1298;
						field1284 = true;
						field1210.method279(2, field1283);
					} else {
						method521();
					}

					field1142 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1437 = true;
					method501(0);
				}

				if (var3 == 1) {
					field1437 = true;
					method501(-400);
				}

				if (var3 == 2) {
					field1437 = true;
					method501(-800);
				}

				if (var3 == 3) {
					field1437 = true;
					method501(-1200);
				}

				if (var3 == 4) {
					field1437 = false;
				}
			}

			if (var2 == 5) {
				field1113 = var3;
			}

			if (var2 == 6) {
				field1369 = var3;
			}

			if (var2 == 8) {
				field1389 = var3;
				field1415 = true;
			}

			if (var2 == 9) {
				field1163 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method475(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method476(int arg0, int arg1) {
		class41 var3 = field1346[field1131][arg0][arg1];
		if (var3 == null) {
			field1184.method71(field1131, arg0, arg1);
		} else {
			int var4 = -99999999;
			class29 var5 = null;
			for (class29 var6 = (class29) var3.method248(); var6 != null; var6 = (class29) var3.method250()) {
				class60 var7 = class60.method348(var6.field455);
				int var8 = var7.field929;
				if (var7.field928) {
					var8 = (var6.field456 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method246(var5);
			class29 var9 = null;
			class29 var10 = null;
			for (class29 var11 = (class29) var3.method248(); var11 != null; var11 = (class29) var3.method250()) {
				if (var5.field455 != var11.field455 && var9 == null) {
					var9 = var11;
				}

				if (var5.field455 != var11.field455 && var9.field455 != var11.field455 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1184.method57(var12, method551(field1131, arg1 * 128 + 64, arg0 * 128 + 64), field1131, arg0, arg1, var9, var5, var10);
		}
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method477(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1370; var3++) {
				if (field1068[var3] == arg0) {
					field1370--;
					field1261 = true;

					for (int var4 = var3; var4 < field1370; var4++) {
						field1281[var4] = field1281[var4 + 1];
						field1183[var4] = field1183[var4 + 1];
						field1068[var4] = field1068[var4 + 1];
					}

					field1424.method218(160);
					field1424.method225(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)I")
	public final int method478() {
		int var1 = 3;
		if (field1422 < 310) {
			int var2 = field1419 >> 7;
			int var3 = field1421 >> 7;
			int var4 = field1073.field360 >> 7;
			int var5 = field1073.field361 >> 7;

			if ((field1305[field1131][var2][var3] & 0x4) != 0) {
				var1 = field1131;
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

					if ((field1305[field1131][var2][var3] & 0x4) != 0) {
						var1 = field1131;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1305[field1131][var2][var3] & 0x4) != 0) {
							var1 = field1131;
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

					if ((field1305[field1131][var2][var3] & 0x4) != 0) {
						var1 = field1131;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1305[field1131][var2][var3] & 0x4) != 0) {
							var1 = field1131;
						}
					}
				}
			}
		}

		if ((field1305[field1131][field1073.field360 >> 7][field1073.field361 >> 7] & 0x4) != 0) {
			var1 = field1131;
		}

		return var1;
	}

	@ObfuscatedName("client.q(I)I")
	public final int method479() {
		int var1 = method551(field1131, field1421, field1419);
		if (var1 - field1420 < 800 && (field1305[field1131][field1419 >> 7][field1421 >> 7] & 0x4) != 0) {
			return field1131;
		}

		return 3;
	}

	public final void run() {
		if (field1469) {
			method520();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method480() {
		int var1 = field1224.method204("Choose Option");
		for (int var2 = 0; var2 < field1382; var2++) {
			int var3 = field1224.method204(field1254[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1382 * 15 + 21;
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

			field1408 = true;
			field1171 = 0;
			field1172 = var5;
			field1173 = var6;
			field1174 = var1;
			field1175 = field1382 * 15 + 22;
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

			field1408 = true;
			field1171 = 1;
			field1172 = var7;
			field1173 = var8;
			field1174 = var1;
			field1175 = field1382 * 15 + 22;
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

			field1408 = true;
			field1171 = 2;
			field1172 = var9;
			field1173 = var10;
			field1174 = var1;
			field1175 = field1382 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method481(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1394.length; var3++) {
			field1394[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1394[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1395[var9] = (field1394[var9 - 1] + field1394[var9 + 1] + field1394[var9 - 128] + field1394[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1394;
			field1394 = field1395;
			field1395 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1394[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(ZILy;)V")
	public final void method482(int arg0, class25 arg1) {
		method483(arg1.field360, arg0, arg1.field361);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method483(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method551(field1131, arg2, arg0) - arg1;
			arg0 -= field1419;
			var4 -= field1420;
			arg2 -= field1421;
			int var5 = class31.field550[field1422];
			int var6 = class31.field551[field1422];
			int var7 = class31.field550[field1423];
			int var8 = class31.field551[field1423];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1444 = (var9 << 9) / arg2 + class34.field578;
				field1445 = (var11 << 9) / arg2 + class34.field579;
			} else {
				field1444 = -1;
				field1445 = -1;
			}
		} else {
			field1444 = -1;
			field1445 = -1;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method484() {
		if (field1389 != 0) {
			int var1 = 0;
			if (field1228 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1323[var2] != null) {
					int var3 = field1321[var2];
					String var4 = field1322[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1185 == 0 || field1185 == 1 && method557(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1223.method204("From:  " + var4 + field1323[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1297 >= 1) {
									field1254[field1382] = "Report abuse @whi@" + var4;
									field1064[field1382] = 2524;
									field1382++;
								}

								field1254[field1382] = "Add ignore @whi@" + var4;
								field1064[field1382] = 2047;
								field1382++;
								field1254[field1382] = "Add friend @whi@" + var4;
								field1064[field1382] = 2605;
								field1382++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1185 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method485() {
		method443();

		if (field1413 == 1) {
			field1093[field1412 / 100].method186(field1410 - 8 - 4, field1411 - 8 - 4);
		}

		if (field1413 == 2) {
			field1093[field1412 / 100 + 4].method186(field1410 - 8 - 4, field1411 - 8 - 4);
			field1077++;
			if (field1077 > 57) {
				field1077 = 0;
				field1424.method218(34);
			}
		}

		if (field1333 != -1) {
			method552(field1341, field1333);
			method522(0, 0, class4.field56[field1333], 0);
		}

		if (field1311 != -1) {
			method552(field1341, field1311);
			method522(0, 0, class4.field56[field1311], 0);
		}

		method465();

		if (!field1408) {
			method444();
			method470();
		} else if (field1171 == 0) {
			method506();
		}

		if (field1106 == 1) {
			field1315[1].method186(472, 296);
		}

		if (field1246) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1223.method201("Fps:" + field5, var1, var2, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1252) {
				int var7 = 0xFF0000;
			}

			field1223.method201("Mem:" + var5 + "k", var1, var2, 0xFFFF00);
			var2 += 15;
		}

		if (field1228 != 0) {
			int var8 = field1228 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1223.method206("System update in: " + var9 + ":0" + var8, 329, 4, 0xFFFF00);
			} else {
				field1223.method206("System update in: " + var9 + ":" + var8, 329, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method486(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method487() {
		field1338 = false;
		while (field1299) {
			field1338 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1417 = null;
		field1418 = null;
		field1258 = null;
		field1080 = null;
		field1081 = null;
		field1082 = null;
		field1083 = null;
		field1394 = null;
		field1395 = null;
		field1212 = null;
		field1213 = null;
		field1295 = null;
		field1296 = null;
	}

	@ObfuscatedName("client.a(IIIIIIZIIBII)Z")
	public final boolean method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1155[var14][var15] = 0;
				field1092[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg0;
		field1155[arg1][arg0] = 99;
		field1092[arg1][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1480[var18] = arg1;
		int var35 = var18 + 1;
		field1481[var18] = arg0;
		boolean var20 = false;
		int var21 = field1480.length;
		int[][] var22 = field1209[field1131].field963;
		while (var35 != var19) {
			var16 = field1480[var19];
			var17 = field1481[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg4 == var17) {
				var20 = true;
				break;
			}

			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && field1209[field1131].method368(var17, arg5 - 1, var16, arg10, arg4, arg3)) {
					var20 = true;
					break;
				}

				if (arg5 < 10 && field1209[field1131].method369(var17, arg5 - 1, arg3, arg10, arg4, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg7 != 0 && field1209[field1131].method370(arg2, arg3, arg4, var16, arg7, arg8, var17)) {
				var20 = true;
				break;
			}

			int var23 = field1092[var16][var17] + 1;
			if (var16 > 0 && field1155[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1480[var35] = var16 - 1;
				field1481[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1155[var16 - 1][var17] = 2;
				field1092[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1155[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1480[var35] = var16 + 1;
				field1481[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1155[var16 + 1][var17] = 8;
				field1092[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1155[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1480[var35] = var16;
				field1481[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1155[var16][var17 - 1] = 1;
				field1092[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1155[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1480[var35] = var16;
				field1481[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1155[var16][var17 + 1] = 4;
				field1092[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1155[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1480[var35] = var16 - 1;
				field1481[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1155[var16 - 1][var17 - 1] = 3;
				field1092[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1155[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1480[var35] = var16 + 1;
				field1481[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1155[var16 + 1][var17 - 1] = 9;
				field1092[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1155[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1480[var35] = var16 - 1;
				field1481[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1155[var16 - 1][var17 + 1] = 6;
				field1092[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1155[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1480[var35] = var16 + 1;
				field1481[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1155[var16 + 1][var17 + 1] = 12;
				field1092[var16 + 1][var17 + 1] = var23;
			}
		}

		field1407 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg4 - var25; var27 <= arg4 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1092[var26][var27] < var24) {
								var24 = field1092[var26][var27];
								var16 = var26;
								var17 = var27;
								field1407 = 1;
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
		field1480[var28] = var16;
		int var36 = var28 + 1;
		field1481[var28] = var17;
		int var29;
		int var30 = var29 = field1155[var16][var17];
		while (arg1 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1480[var36] = var16;
				field1481[var36++] = var17;
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

			var30 = field1155[var16][var17];
		}

		if (var36 <= 0) {
			if (arg9 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1480[var36];
		int var33 = field1481[var36];

		if (arg9 == 0) {
			field1424.method218(141);
			field1424.method219(var31 + var31 + 3);
		}

		if (arg9 == 1) {
			field1424.method218(196);
			field1424.method219(var31 + var31 + 3 + 14);
		}

		if (arg9 == 2) {
			field1424.method218(70);
			field1424.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1424.method219(1);
		} else {
			field1424.method219(0);
		}

		field1424.method220(field1384 + var32);
		field1424.method220(field1385 + var33);
		field1084 = field1480[0];
		field1085 = field1481[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1424.method219(field1480[var36] - var32);
			field1424.method219(field1481[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method489(boolean arg0) {
		for (int var2 = 0; var2 < field1456; var2++) {
			class26 var3 = field1455[field1457[var2]];
			int var4 = (field1457[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field900 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1308[var5][var6] == field1312) {
							continue;
						}

						field1308[var5][var6] = field1312;
					}

					field1184.method61(var3, var3.field361, var3.field362, var4, var3.field360, field1131, (var3.field364 - 1) * 64 + 60, method551(field1131, var3.field361, var3.field360), var3.field363);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method490(boolean arg0) {
		method449();
		field1462.method258();
		field1417.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1344 == 0) {
			int var4 = var3 / 2 + 80;
			field1222.method203(true, 0x75A9A9, field1210.field732, var2 / 2, var4);
			int var5 = var3 / 2 - 20;
			field1224.method203(true, 0xFFFF00, "Welcome to RuneScape", var2 / 2, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1418.method199(var6 - 73, var7 - 20);
			field1224.method203(true, 0xFFFFFF, "New User", var6, var7 + 5);
			int var8 = var2 / 2 + 80;
			field1418.method199(var8 - 73, var7 - 20);
			field1224.method203(true, 0xFFFFFF, "Existing User", var8, var7 + 5);
		}

		if (field1344 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1289.length() > 0) {
				field1224.method203(true, 0xFFFF00, field1289, var2 / 2, var9 - 15);
				field1224.method203(true, 0xFFFF00, field1290, var2 / 2, var9);
				var9 += 30;
			} else {
				field1224.method203(true, 0xFFFF00, field1290, var2 / 2, var9 - 7);
				var9 += 30;
			}

			field1224.method210(var9, var2 / 2 - 90, "Username: " + field1292 + (field1127 == 0 & field1143 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true);
			var9 += 15;
			field1224.method210(var9, var2 / 2 - 88, "Password: " + class51.method305(field1293) + (field1127 == 1 & field1143 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1418.method199(var10 - 73, var11 - 20);
				field1224.method203(true, 0xFFFFFF, "Login", var10, var11 + 5);
				int var12 = var2 / 2 + 80;
				field1418.method199(var12 - 73, var11 - 20);
				field1224.method203(true, 0xFFFFFF, "Cancel", var12, var11 + 5);
			}
		}

		if (field1344 == 3) {
			field1224.method203(true, 0xFFFF00, "Create a free account", var2 / 2, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field1224.method203(true, 0xFFFFFF, "To create a new account you need to", var2 / 2, var13);
			var13 += 15;
			field1224.method203(true, 0xFFFFFF, "go back to the main RuneScape webpage", var2 / 2, var13);
			var13 += 15;
			field1224.method203(true, 0xFFFFFF, "and choose the red 'create account'", var2 / 2, var13);
			var13 += 15;
			field1224.method203(true, 0xFFFFFF, "button at the top right of that page.", var2 / 2, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1418.method199(var14 - 73, var15 - 20);
			field1224.method203(true, 0xFFFFFF, "Cancel", var14, var15 + 5);
		}

		field1462.method259(202, field9, 171);

		if (field1192) {
			field1192 = false;
			field1460.method259(128, field9, 0);
			field1461.method259(202, field9, 371);
			field1465.method259(0, field9, 265);
			field1466.method259(562, field9, 265);
			field1467.method259(128, field9, 171);
			field1468.method259(562, field9, 171);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method491() {
		for (int var1 = -1; var1 < field1147; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1145;
			} else {
				var2 = field1148[var1];
			}

			class27 var3 = field1146[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1456; var4++) {
			int var5 = field1457[var4];
			class26 var6 = field1455[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method492() {
		field1459++;
		if (field1459 > 192) {
			field1459 = 0;
			field1424.method218(24);
			field1424.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1311 != -1 && field1311 == field1118) {
						break;
					}

					if (field1242) {
						if (var1 >= 32 && var1 <= 122 && field1438.length() < 80) {
							field1438 = field1438 + (char) var1;
							field1415 = true;
						}

						if (var1 == 8 && field1438.length() > 0) {
							field1438 = field1438.substring(0, field1438.length() - 1);
							field1415 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1242 = false;
							field1415 = true;

							if (field1326 == 1) {
								long var2 = class51.method300(field1438);
								method455(var2);
							}

							if (field1326 == 2 && field1370 > 0) {
								long var4 = class51.method300(field1438);
								method477(var4);
							}

							if (field1326 == 3 && field1438.length() > 0) {
								field1424.method218(47);
								field1424.method219(0);
								int var6 = field1424.field621;
								field1424.method225(field1277);
								class52.method307(field1438, field1424);
								field1424.method228(field1424.field621 - var6);
								field1438 = class52.method308(field1438);
								field1438 = class71.method401(field1438);
								method553(field1438, 6, class51.method304(class51.method301(field1277)));

								if (field1185 == 2) {
									field1185 = 1;
									field1096 = true;
									field1424.method218(242);
									field1424.method219(field1133);
									field1424.method219(field1185);
									field1424.method219(field1060);
								}
							}

							if (field1326 == 4 && field1245 < 100) {
								long var7 = class51.method300(field1438);
								method543(var7);
							}

							if (field1326 == 5 && field1245 > 0) {
								long var9 = class51.method300(field1438);
								method542(var9);
							}
						}
					} else if (field1306) {
						if (var1 >= 48 && var1 <= 57 && field1154.length() < 10) {
							field1154 = field1154 + (char) var1;
							field1415 = true;
						}

						if (var1 == 8 && field1154.length() > 0) {
							field1154 = field1154.substring(0, field1154.length() - 1);
							field1415 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1154.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1154);
								} catch (Exception var18) {
								}

								field1424.method218(236);
								field1424.method223(var11);
							}

							field1306 = false;
							field1415 = true;
						}
					} else if (field1074 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1117.length() < 80) {
							field1117 = field1117 + (char) var1;
							field1415 = true;
						}

						if (var1 == 8 && field1117.length() > 0) {
							field1117 = field1117.substring(0, field1117.length() - 1);
							field1415 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1117.length() > 0) {
							if (field1297 == 2) {
								if (field1117.equals("::clientdrop")) {
									method445();
								}

								if (field1117.equals("::lag")) {
									method545();
								}

								if (field1117.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1210.method272(2); var12++) {
										field1210.method282((byte) 1, 2, var12);
									}
								}

								if (field1117.equals("::fpson")) {
									field1246 = true;
								}

								if (field1117.equals("::fpsoff")) {
									field1246 = false;
								}
							}

							if (field1117.startsWith("::")) {
								field1424.method218(248);
								field1424.method219(field1117.length() - 1);
								field1424.method226(field1117.substring(2));
							} else {
								String var13 = field1117.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1117 = field1117.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1117 = field1117.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1117 = field1117.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1117 = field1117.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1117 = field1117.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1117 = field1117.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1117 = field1117.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1117 = field1117.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1117 = field1117.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1117 = field1117.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1117 = field1117.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1117 = field1117.substring(6);
								}

								String var15 = field1117.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1117 = field1117.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1117 = field1117.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1117 = field1117.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1117 = field1117.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1117 = field1117.substring(6);
								}

								field1424.method218(37);
								field1424.method219(0);
								int var17 = field1424.field621;
								field1424.method219(var14);
								field1424.method219(var16);
								class52.method307(field1117, field1424);
								field1424.method228(field1424.field621 - var17);
								field1117 = class52.method308(field1117);
								field1117 = class71.method401(field1117);
								field1073.field372 = field1117;
								field1073.field374 = var14;
								field1073.field375 = var16;
								field1073.field373 = 150;

								if (field1297 == 2) {
									method553(field1073.field372, 2, "@cr2@" + field1073.field416);
								} else if (field1297 == 1) {
									method553(field1073.field372, 2, "@cr1@" + field1073.field416);
								} else {
									method553(field1073.field372, 2, field1073.field416);
								}

								if (field1133 == 2) {
									field1133 = 3;
									field1096 = true;
									field1424.method218(242);
									field1424.method219(field1133);
									field1424.method219(field1185);
									field1424.method219(field1060);
								}
							}

							field1117 = "";
							field1415 = true;
						}
					}
				}

				if (var1 == 8 && field1219.length() > 0) {
					field1219 = field1219.substring(0, field1219.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1219.length() < 12) {
				field1219 = field1219 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method493() {
		field1348 = 0;
		for (int var1 = -1; var1 < field1456 + field1147; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1073;
			} else if (var1 < field1147) {
				var2 = field1146[field1148[var1]];
			} else {
				var2 = field1455[field1457[var1 - field1147]];
			}

			if (var2 != null && var2.method113()) {
				if (var2 instanceof class26) {
					class59 var3 = ((class26) var2).field415;
					if (var3.field905 != null) {
						var3 = var3.method345();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field1147) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field903 >= 0 && var7.field903 < field1315.length) {
						method482(var2.field406 + 15, var2);

						if (field1444 > -1) {
							field1315[var7.field903].method186(field1444 - 12, field1445 - 30);
						}
					}

					if (field1240 == 1 && field1457[var1 - field1147] == field1160 && field1143 % 20 < 10) {
						method482(var2.field406 + 15, var2);

						if (field1444 > -1) {
							field1315[2].method186(field1444 - 12, field1445 - 28);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method482(var2.field406 + 15, var2);

						if (field1444 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1315[var6].method186(field1444 - 12, field1445 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1240 == 10 && field1148[var1] == field1274) {
						method482(var2.field406 + 15, var2);

						if (field1444 > -1) {
							field1315[7].method186(field1444 - 12, field1445 - var4);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1147 || field1133 == 0 || field1133 == 3 || field1133 == 1 && method557(((class27) var2).field416))) {
					method482(var2.field406, var2);

					if (field1444 > -1 && field1348 < field1349) {
						field1353[field1348] = field1224.method205(var2.field372) / 2;
						field1352[field1348] = field1224.field617;
						field1350[field1348] = field1444;
						field1351[field1348] = field1445;
						field1354[field1348] = var2.field374;
						field1355[field1348] = var2.field375;
						field1356[field1348] = var2.field373;
						field1357[field1348++] = var2.field372;

						if (field1369 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1352[field1348] += 10;
							field1351[field1348] += 5;
						}

						if (field1369 == 0 && var2.field375 == 4) {
							field1353[field1348] = 60;
						}

						if (field1369 == 0 && var2.field375 == 5) {
							field1352[field1348] += 5;
						}
					}
				}

				if (var2.field379 > field1143) {
					method482(var2.field406 + 15, var2);

					if (field1444 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(0xFF00, 5, field1445 - 3, var8, field1444 - 15);
						class33.method157(0xFF0000, 5, field1445 - 3, 30 - var8, field1444 + var8 - 15);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1143) {
						method482(var2.field406 / 2, var2);

						if (field1444 > -1) {
							if (var9 == 1) {
								field1445 -= 20;
							}

							if (var9 == 2) {
								field1444 -= 15;
								field1445 -= 10;
							}

							if (var9 == 3) {
								field1444 += 15;
								field1445 -= 10;
							}

							field1432[var2.field377[var9]].method186(field1444 - 12, field1445 - 12);
							field1222.method202(String.valueOf(var2.field376[var9]), field1445 + 4, 0, field1444);
							field1222.method202(String.valueOf(var2.field376[var9]), field1445 + 3, 0xFFFFFF, field1444 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1348; var10++) {
			int var11 = field1350[var10];
			int var12 = field1351[var10];
			int var13 = field1353[var10];
			int var14 = field1352[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1351[var16] - field1352[var16] && var12 - var14 < field1351[var16] + 2 && var11 - var13 < field1353[var16] + field1350[var16] && var11 + var13 > field1350[var16] - field1353[var16] && field1351[var16] - field1352[var16] < var12) {
						var12 = field1351[var16] - field1352[var16];
						var15 = true;
					}
				}
			}

			field1444 = field1350[var10];
			field1445 = field1351[var10] = var12;
			String var17 = field1357[var10];
			if (field1369 == 0) {
				int var18 = 0xFFFF00;
				if (field1354[var10] < 6) {
					var18 = field1119[field1354[var10]];
				}

				if (field1354[var10] == 6) {
					var18 = field1312 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1354[var10] == 7) {
					var18 = field1312 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1354[var10] == 8) {
					var18 = field1312 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1354[var10] == 9) {
					int var19 = 150 - field1356[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1354[var10] == 10) {
					int var20 = 150 - field1356[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1354[var10] == 11) {
					int var21 = 150 - field1356[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1355[var10] == 0) {
					field1224.method202(var17, field1445 + 1, 0, field1444);
					field1224.method202(var17, field1445, var18, field1444);
				}

				if (field1355[var10] == 1) {
					field1224.method207(0, field1312, field1444, var17, field1445 + 1);
					field1224.method207(var18, field1312, field1444, var17, field1445);
				}

				if (field1355[var10] == 2) {
					field1224.method208(var17, 0, field1444, field1312, field1445 + 1);
					field1224.method208(var17, var18, field1444, field1312, field1445);
				}

				if (field1355[var10] == 3) {
					field1224.method209(0, var17, field1445 + 1, 150 - field1356[var10], field1312, field1444);
					field1224.method209(var18, var17, field1445, 150 - field1356[var10], field1312, field1444);
				}

				if (field1355[var10] == 4) {
					int var22 = field1224.method205(var17);
					int var23 = (150 - field1356[var10]) * (var22 + 100) / 150;
					class33.method154(field1444 - 50, 0, field1444 + 50, 334);
					field1224.method206(var17, field1445 + 1, field1444 + 50 - var23, 0);
					field1224.method206(var17, field1445, field1444 + 50 - var23, var18);
					class33.method153();
				}

				if (field1355[var10] == 5) {
					int var24 = 150 - field1356[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(0, field1445 - field1224.field617 - 1, 512, field1445 + 5);
					field1224.method202(var17, field1445 + var25 + 1, 0, field1444);
					field1224.method202(var17, field1445 + var25, var18, field1444);
					class33.method153();
				}
			} else {
				field1224.method202(var17, field1445 + 1, 0, field1444);
				field1224.method202(var17, field1445, 0xFFFF00, field1444);
			}
		}
	}

	@ObfuscatedName("client.a(IILd;IIII)V")
	public final void method494(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field63 == 0 && arg1.field78 != null && !arg1.field77 && (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg1.field66 + arg0 && arg2 <= arg1.field67 + arg4)) {
			int var7 = arg1.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field79[var8] + arg0;
				int var10 = arg1.field80[var8] + arg4 - arg3;
				class4 var11 = class4.field56[arg1.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1067 = var11.field74;
					} else {
						field1067 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method494(var9, var11, arg2, var11.field76, var10, arg5);

					if (var11.field75 > var11.field67) {
						method540(var10, var11, var11.field75, var11.field67, true, arg2, arg5, var11.field66 + var9);
					}
				} else {
					if (var11.field64 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method441(var11);
						}

						if (!var12) {
							field1254[field1382] = var11.field117;
							field1064[field1382] = 231;
							field1063[field1382] = var11.field61;
							field1382++;
						}
					}

					if (var11.field64 == 2 && field1262 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1254[field1382] = var13 + " @gre@" + var11.field115;
						field1064[field1382] = 274;
						field1063[field1382] = var11.field61;
						field1382++;
					}

					if (var11.field64 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1254[field1382] = "Close";
						field1064[field1382] = 737;
						field1063[field1382] = var11.field61;
						field1382++;
					}

					if (var11.field64 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1254[field1382] = var11.field117;
						field1064[field1382] = 435;
						field1063[field1382] = var11.field61;
						field1382++;
					}

					if (var11.field64 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1254[field1382] = var11.field117;
						field1064[field1382] = 225;
						field1063[field1382] = var11.field61;
						field1382++;
					}

					if (var11.field64 == 6 && !field1471 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1254[field1382] = var11.field117;
						field1064[field1382] = 997;
						field1063[field1382] = var11.field61;
						field1382++;
					}

					if (var11.field63 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field67; var15++) {
							for (int var16 = 0; var16 < var11.field66; var16++) {
								int var17 = (var11.field87 + 32) * var16 + var9;
								int var18 = (var11.field88 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field90[var14];
									var18 += var11.field91[var14];
								}

								if (arg5 >= var17 && arg2 >= var18 && arg5 < var17 + 32 && arg2 < var18 + 32) {
									field1309 = var14;
									field1310 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1235 == 1 && var11.field84) {
											if (field1237 != var11.field61 || field1236 != var14) {
												field1254[field1382] = "Use " + field1239 + " with @lre@" + var19.field917;
												field1064[field1382] = 398;
												field1065[field1382] = var19.field915;
												field1062[field1382] = var14;
												field1063[field1382] = var11.field61;
												field1382++;
											}
										} else if (field1262 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field932 != null && var19.field932[var20] != null) {
														field1254[field1382] = var19.field932[var20] + " @lre@" + var19.field917;

														if (var20 == 3) {
															field1064[field1382] = 681;
														}

														if (var20 == 4) {
															field1064[field1382] = 100;
														}

														field1065[field1382] = var19.field915;
														field1062[field1382] = var14;
														field1063[field1382] = var11.field61;
														field1382++;
													} else if (var20 == 4) {
														field1254[field1382] = "Drop @lre@" + var19.field917;
														field1064[field1382] = 100;
														field1065[field1382] = var19.field915;
														field1062[field1382] = var14;
														field1063[field1382] = var11.field61;
														field1382++;
													}
												}
											}

											if (var11.field85) {
												field1254[field1382] = "Use @lre@" + var19.field917;
												field1064[field1382] = 102;
												field1065[field1382] = var19.field915;
												field1062[field1382] = var14;
												field1063[field1382] = var11.field61;
												field1382++;
											}

											if (var11.field84 && var19.field932 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field932[var21] != null) {
														field1254[field1382] = var19.field932[var21] + " @lre@" + var19.field917;

														if (var21 == 0) {
															field1064[field1382] = 694;
														}

														if (var21 == 1) {
															field1064[field1382] = 962;
														}

														if (var21 == 2) {
															field1064[field1382] = 795;
														}

														field1065[field1382] = var19.field915;
														field1062[field1382] = var14;
														field1063[field1382] = var11.field61;
														field1382++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1254[field1382] = var11.field92[var22] + " @lre@" + var19.field917;

														if (var22 == 0) {
															field1064[field1382] = 582;
														}

														if (var22 == 1) {
															field1064[field1382] = 113;
														}

														if (var22 == 2) {
															field1064[field1382] = 555;
														}

														if (var22 == 3) {
															field1064[field1382] = 331;
														}

														if (var22 == 4) {
															field1064[field1382] = 354;
														}

														field1065[field1382] = var19.field915;
														field1062[field1382] = var14;
														field1063[field1382] = var11.field61;
														field1382++;
													}
												}
											}

											field1254[field1382] = "Examine @lre@" + var19.field917;
											field1064[field1382] = 1328;
											field1065[field1382] = var19.field915;
											field1062[field1382] = var14;
											field1063[field1382] = var11.field61;
											field1382++;
										} else if ((field1264 & 0x10) == 0x10) {
											field1254[field1382] = field1265 + " @lre@" + var19.field917;
											field1064[field1382] = 563;
											field1065[field1382] = var19.field915;
											field1062[field1382] = var14;
											field1063[field1382] = var11.field61;
											field1382++;
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

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method495(String arg0) throws IOException {
		if (field1373) {
			if (field1343 != null) {
				try {
					field1343.close();
				} catch (Exception var4) {
				}

				field1343 = null;
			}

			field1343 = method518(43595);
			field1343.setSoTimeout(10000);
			InputStream var2 = field1343.getInputStream();
			OutputStream var3 = field1343.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 298);

			if (arg0.length == 5) {
				field1249 = Integer.parseInt(arg0[0]);
				field1250 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method453();
				} else if (arg0[2].equals("highmem")) {
					method549();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1251 = false;
				} else if (arg0[3].equals("members")) {
					field1251 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ZI)Z")
	public final boolean method496(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1064[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public final void method497(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1149; var3++) {
			int var4 = field1150[var3];
			class26 var5 = field1455[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method229();
				int var8 = arg1.method229();
				var5.method114(var7, field1143, var8);
				var5.field379 = field1143 + 300;
				var5.field380 = arg1.method229();
				var5.field381 = arg1.method229();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.method231();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg1.method229();
				if (var5.field388 == var9 && var9 != -1) {
					int var11 = class66.field996[var9].field1010;
					if (var11 == 1) {
						var5.field389 = 0;
						var5.field390 = 0;
						var5.field391 = var10;
						var5.field392 = 0;
					}

					if (var11 == 2) {
						var5.field392 = 0;
					}
				} else if (var9 == -1 || var5.field388 == -1 || class66.field996[var9].field1004 >= class66.field996[var5.field388].field1004) {
					var5.field388 = var9;
					var5.field389 = 0;
					var5.field390 = 0;
					var5.field391 = var10;
					var5.field392 = 0;
					var5.field414 = var5.field409;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field382 = arg1.method231();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg1.method236();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.method229();
				int var13 = arg1.method229();
				var5.method114(var12, field1143, var13);
				var5.field379 = field1143 + 300;
				var5.field380 = arg1.method229();
				var5.field381 = arg1.method229();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method341(arg1.method231());
				var5.field364 = var5.field415.field882;
				var5.field408 = var5.field415.field904;
				var5.field367 = var5.field415.field886;
				var5.field368 = var5.field415.field887;
				var5.field369 = var5.field415.field888;
				var5.field370 = var5.field415.field889;
				var5.field365 = var5.field415.field885;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg1.method231();
				int var14 = arg1.method234();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1143;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1143) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg1.method231();
				var5.field384 = arg1.method231();
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method498() {
		while (true) {
			class39 var1 = field1210.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field635, var1.field634);

				if ((field1210.method277(var1.field634) & 0x62) != 0) {
					field1261 = true;

					if (field1074 != -1) {
						field1415 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1283 == var1.field634 && var1.field635 != null) {
				method510(field1284, var1.field635);
			}

			if (var1.field633 == 3 && field1220 == 1) {
				for (int var2 = 0; var2 < field1153.length; var2++) {
					if (field1071[var2] == var1.field634) {
						field1153[var2] = var1.field635;

						if (var1.field635 == null) {
							field1071[var2] = -1;
						}

						break;
					}

					if (field1072[var2] == var1.field634) {
						field1078[var2] = var1.field635;

						if (var1.field635 == null) {
							field1072[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1210.method276(var1.field634)) {
				class3.method17(field1210, new class38(var1.field635));
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method499(boolean arg0) {
		if (field1073.field360 >> 7 == field1084 && field1073.field361 >> 7 == field1085) {
			field1084 = 0;
			field1069++;
			if (field1069 > 122) {
				field1069 = 0;
				field1424.method218(110);
				field1424.method219(62);
			}
		}

		int var2 = field1147;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1073;
				var5 = field1145 << 14;
			} else {
				var4 = field1146[field1148[var3]];
				var5 = field1148[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1252 && field1147 > 50 || field1147 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1143 < var4.field426 || field1143 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1308[var6][var7] == field1312) {
								continue;
							}

							field1308[var6][var7] = field1312;
						}

						var4.field425 = method551(field1131, var4.field361, var4.field360);
						field1184.method61(var4, var4.field361, var4.field362, var5, var4.field360, field1131, 60, var4.field425, var4.field363);
					} else {
						var4.field436 = false;
						var4.field425 = method551(field1131, var4.field361, var4.field360);
						field1184.method62(var4.field361, var4.field360, var4.field433, var4.field425, var4.field434, var4.field432, var4.field435, field1131, var4, var5, 60, var4.field362);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method500(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field1184.method80(field1131, arg1, arg3, arg2);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1426++;
		if (field1426 > 1086) {
			field1426 = 0;
			field1424.method218(170);
			field1424.method219(0);
			int var9 = field1424.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method220(16791);
			}

			field1424.method219(254);
			field1424.method220((int) (Math.random() * 65536.0D));
			field1424.method220(16128);
			field1424.method220(52610);
			field1424.method220((int) (Math.random() * 65536.0D));
			field1424.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1424.method220(35025);
			}

			field1424.method220(46628);
			field1424.method219((int) (Math.random() * 256.0D));
			field1424.method228(field1424.field621 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var10 = class57.method330(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.field835;
				var12 = var10.field836;
			} else {
				var11 = var10.field836;
				var12 = var10.field835;
			}

			int var13 = var10.field858;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			method488(field1073.field411[0], field1073.field410[0], var13, arg1, arg3, 0, false, var12, var11, 2, 0);
		} else {
			method488(field1073.field411[0], field1073.field410[0], 0, arg1, arg3, var7 + 1, false, 0, 0, 2, var8);
		}

		field1410 = field24;
		field1411 = field25;
		field1413 = 2;
		field1412 = 0;
		field1424.method218(arg0);
		field1424.method220(field1384 + arg1);
		field1424.method220(field1385 + arg3);
		field1424.method220(var5);
		return true;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method501(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method502() {
		for (class40 var1 = (class40) field1218.method248(); var1 != null; var1 = (class40) field1218.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method503(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.a(ZLnb;)V")
	public final void method503(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1184.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1184.method77(arg0.field640, arg0.field641, arg0.field638);
		}

		if (arg0.field639 == 2) {
			var2 = field1184.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1184.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1184.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method504() {
		if (field1344 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1344 = 3;
				field1127 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1289 = "";
				field1290 = "Enter your username & password.";
				field1344 = 2;
				field1127 = 0;
			}
		} else if (field1344 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1127 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1127 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1414 = 0;
				method472(field1292, field1293, false);

				if (field1429) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1344 = 0;
				field1292 = "";
				field1293 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1446.length(); var10++) {
					if (var8 == field1446.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1127 == 0) {
					if (var8 == 8 && field1292.length() > 0) {
						field1292 = field1292.substring(0, field1292.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1127 = 1;
					}

					if (var9) {
						field1292 = field1292 + (char) var8;
					}

					if (field1292.length() > 12) {
						field1292 = field1292.substring(0, 12);
					}
				} else if (field1127 == 1) {
					if (var8 == 8 && field1293.length() > 0) {
						field1293 = field1293.substring(0, field1293.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1127 = 0;
					}

					if (var9) {
						field1293 = field1293 + (char) var8;
					}

					if (field1293.length() > 20) {
						field1293 = field1293.substring(0, 20);
					}
				}
			}
		} else if (field1344 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1344 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method505() {
		try {
			field1374 = -1;
			field1234.method252();
			field1431.method252();
			class34.method167();
			method514();
			field1184.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1209[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(104, field1435, 104, field1305);
			int var3 = field1153.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1070[var4] >> 8;
				int var6 = field1070[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1184.method51(field1131);
			} else {
				field1184.method51(0);
			}

			field1424.method218(115);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1070[var7] >> 8) * 64 - field1384;
				int var9 = (field1070[var7] & 0xFF) * 64 - field1385;
				byte[] var10 = field1153[var7];
				if (var10 != null) {
					var2.method15(var9, (field1197 - 6) * 8, (field1196 - 6) * 8, var10, var8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1070[var11] >> 8) * 64 - field1384;
				int var13 = (field1070[var11] & 0xFF) * 64 - field1385;
				byte[] var14 = field1153[var11];
				if (var14 == null && field1197 < 800) {
					var2.method14(var12, 64, 64, var13);
				}
			}

			field1424.method218(115);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1078[var15];
				if (var16 != null) {
					int var17 = (field1070[var15] >> 8) * 64 - field1384;
					int var18 = (field1070[var15] & 0xFF) * 64 - field1385;
					var2.method18(field1209, var16, var18, field1184, var17);
				}
			}

			field1424.method218(115);
			var2.method20(field1184, field1209);
			field1166.method258();
			field1424.method218(115);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method476(var19, var20);
				}
			}

			method502();
		} catch (Exception var33) {
		}

		class57.field865.method103();

		if (field1252 && signlink.cache_dat != null) {
			int var22 = field1210.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1210.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1210.method283();
		int var25 = (field1196 - 6) / 8 - 1;
		int var26 = (field1196 + 6) / 8 + 1;
		int var27 = (field1197 - 6) / 8 - 1;
		int var28 = (field1197 + 6) / 8 + 1;
		if (field1267) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1210.method274(0, var30, var29);
					if (var31 != -1) {
						field1210.method284(var31, 3);
					}

					int var32 = field1210.method274(1, var30, var29);
					if (var32 != -1) {
						field1210.method284(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method506() {
		int var1 = field1172;
		int var2 = field1173;
		int var3 = field1174;
		int var4 = field1175;
		int var5 = 0x5D5447;
		class33.method157(var5, var4, var2, var3, var1);
		class33.method157(0, 16, var2 + 1, var3 - 2, var1 + 1);
		class33.method158(var1 + 1, var2 + 18, var4 - 19, 0, var3 - 2);
		field1224.method206("Choose Option", var2 + 14, var1 + 3, var5);
		int var6 = field17;
		int var7 = field18;
		if (field1171 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1171 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1171 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1382; var8++) {
			int var9 = (field1382 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1224.method210(var9, var1 + 3, field1254[var8], var10, true);
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
			if (field1252 && field1131 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field1184.method76(arg2, arg1, arg3);
			}

			if (arg6 == 1) {
				var8 = field1184.method77(arg1, arg3, arg2);
			}

			if (arg6 == 2) {
				var8 = field1184.method78(arg2, arg1, arg3);
			}

			if (arg6 == 3) {
				var8 = field1184.method79(arg2, arg1, arg3);
			}

			if (var8 != 0) {
				int var12 = field1184.method80(arg2, arg1, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field1184.method67(arg2, arg3, arg1);
					class57 var16 = class57.method330(var13);
					if (var16.field837) {
						field1209[arg2].method364(arg3, arg1, var16.field838, var15, var14);
					}
				}

				if (arg6 == 1) {
					field1184.method68(arg2, arg1, arg3);
				}

				if (arg6 == 2) {
					field1184.method69(arg1, arg2, arg3);
					class57 var17 = class57.method330(var13);
					if (var17.field835 + arg1 > 103 || var17.field835 + arg3 > 103 || var17.field836 + arg1 > 103 || var17.field836 + arg3 > 103) {
						return;
					}

					if (var17.field837) {
						field1209[arg2].method365(var15, arg1, var17.field835, var17.field836, var17.field838, arg3);
					}
				}

				if (arg6 == 3) {
					field1184.method70(arg3, arg2, arg1);
					class57 var18 = class57.method330(var13);
					if (var18.field837 && var18.field839) {
						field1209[arg2].method367(arg3, arg1);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field1305[1][arg1][arg3] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				class3.method31(arg0, arg2, field1184, arg3, field1209[arg2], arg4, field1435, arg1, var19, arg5);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1184.method76(arg2, arg1, arg0);
		if (var6 != 0) {
			int var7 = field1184.method80(arg2, arg1, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field1086.field596;
			int var12 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method330(var13);
			if (var14.field849 == -1) {
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
				class36 var15 = field1327[var14.field849];
				if (var15 != null) {
					int var16 = (var14.field835 * 4 - var15.field605) / 2;
					int var17 = (var14.field836 * 4 - var15.field606) / 2;
					var15.method199(arg1 * 4 + var16 + 48, (104 - arg0 - var14.field836) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1184.method78(arg2, arg1, arg0);
		if (var18 != 0) {
			int var19 = field1184.method80(arg2, arg1, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field849 != -1) {
				class36 var24 = field1327[var23.field849];
				if (var24 != null) {
					int var25 = (var23.field835 * 4 - var24.field605) / 2;
					int var26 = (var23.field836 * 4 - var24.field606) / 2;
					var24.method199(arg1 * 4 + var25 + 48, (104 - arg0 - var23.field836) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1086.field596;
				int var29 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field1184.method79(arg2, arg1, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field849 != -1) {
				class36 var33 = field1327[var32.field849];
				if (var33 != null) {
					int var34 = (var32.field835 * 4 - var33.field605) / 2;
					int var35 = (var32.field836 * 4 - var33.field606) / 2;
					var33.method199(arg1 * 4 + var34 + 48, (104 - arg0 - var32.field836) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method509() {
		try {
			int var1 = field1073.field360 + field1161;
			int var2 = field1073.field361 + field1177;
			if (field1390 - var1 < -500 || field1390 - var1 > 500 || field1391 - var2 < -500 || field1391 - var2 > 500) {
				field1390 = var1;
				field1391 = var2;
			}

			if (field1390 != var1) {
				field1390 += (var1 - field1390) / 16;
			}

			if (field1391 != var2) {
				field1391 += (var2 - field1391) / 16;
			}

			if (field27[1] == 1) {
				field1451 += (-field1451 - 24) / 2;
			} else if (field27[2] == 1) {
				field1451 += (24 - field1451) / 2;
			} else {
				field1451 /= 2;
			}

			if (field27[3] == 1) {
				field1452 += (12 - field1452) / 2;
			} else if (field27[4] == 1) {
				field1452 += (-field1452 - 12) / 2;
			} else {
				field1452 /= 2;
			}

			field1450 = field1451 / 2 + field1450 & 0x7FF;
			field1449 += field1452 / 2;
			if (field1449 < 128) {
				field1449 = 128;
			}

			if (field1449 > 383) {
				field1449 = 383;
			}

			int var3 = field1390 >> 7;
			int var4 = field1391 >> 7;
			int var5 = method551(field1131, field1391, field1390);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1131;
						if (var9 < 3 && (field1305[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1435[var9][var7][var8];
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

			if (var11 > field1301) {
				field1301 += (var11 - field1301) / 24;
			} else if (var11 < field1301) {
				field1301 += (var11 - field1301) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1073.field360 + "," + field1073.field361 + "," + field1390 + "," + field1391 + "," + field1196 + "," + field1197 + "," + field1384 + "," + field1385);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method510(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method511() {
		for (class32 var1 = (class32) field1234.method248(); var1 != null; var1 = (class32) field1234.method250()) {
			if (field1131 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1143 >= var1.field555) {
				var1.method151(field1341);

				if (var1.field562) {
					var1.method106();
				} else {
					field1184.method61(var1, var1.field558, 0, -1, var1.field557, var1.field556, 60, var1.field559, false);
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method512() {
		byte[] var1 = field1075.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1463.method258();
		var2.method184(0, 0);
		field1464.method258();
		var2.method184(-637, 0);
		field1460.method258();
		var2.method184(-128, 0);
		field1461.method258();
		var2.method184(-202, -371);
		field1462.method258();
		var2.method184(-202, -171);
		field1465.method258();
		var2.method184(0, -265);
		field1466.method258();
		var2.method184(-562, -265);
		field1467.method258();
		var2.method184(-128, -171);
		field1468.method258();
		var2.method184(-562, -171);
		int[] var3 = new int[var2.field597];
		for (int var4 = 0; var4 < var2.field598; var4++) {
			for (int var5 = 0; var5 < var2.field597; var5++) {
				var3[var5] = var2.field596[var2.field597 * var4 + var2.field597 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field597; var6++) {
				var2.field596[var2.field597 * var4 + var6] = var3[var6];
			}
		}

		field1463.method258();
		var2.method184(382, 0);
		field1464.method258();
		var2.method184(-255, 0);
		field1460.method258();
		var2.method184(254, 0);
		field1461.method258();
		var2.method184(180, -371);
		field1462.method258();
		var2.method184(180, -171);
		field1465.method258();
		var2.method184(382, -265);
		field1466.method258();
		var2.method184(-180, -265);
		field1467.method258();
		var2.method184(254, -171);
		field1468.method258();
		var2.method184(-180, -171);
		class35 var7 = new class35(field1075, "logo", 0);
		field1460.method258();
		var7.method186(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Ld;BI)I")
	public final int method513(class4 arg0, int arg1) {
		if (arg0.field71 == null || arg1 >= arg0.field71.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field71[arg1];
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
					var8 = field1406[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1416[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1328[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field909 && (!class60.method348(var11).field930 || field1251)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1241[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1253[field1416[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1241[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1073.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1012; var13++) {
						if (class67.field1014[var13]) {
							var8 += field1416[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field909 && (!class60.method348(var15).field930 || field1251)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1190;
				}

				if (var7 == 12) {
					var8 = field1288;
				}

				if (var7 == 13) {
					int var17 = field1241[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1030[var19];
					int var21 = var20.field1032;
					int var22 = var20.field1033;
					int var23 = var20.field1034;
					int var24 = field1247[var23 - var22];
					var8 = field1241[var21] >> var22 & var24;
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
					var8 = (field1073.field360 >> 7) + field1384;
				}

				if (var7 == 19) {
					var8 = (field1073.field361 >> 7) + field1385;
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

	@ObfuscatedName("client.w(I)V")
	public final void method514() {
		class57.field865.method103();
		class57.field866.method103();
		class59.field908.method103();
		class60.field955.method103();
		class60.field956.method103();
		class27.field440.method103();
		class68.field1028.method103();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method10() {
		field1192 = true;
	}

	@ObfuscatedName("client.a(IILab;IZ)V")
	public final void method515(int arg0, int arg1, class27 arg2, int arg3) {
		if (field1073 != arg2 && field1382 < 400) {
			String var5;
			if (arg2.field423 == 0) {
				var5 = arg2.field416 + method464(arg2.field422, field1073.field422) + " (level-" + arg2.field422 + ")";
			} else {
				var5 = arg2.field416 + " (skill-" + arg2.field423 + ")";
			}

			if (field1235 == 1) {
				field1254[field1382] = "Use " + field1239 + " with @whi@" + var5;
				field1064[field1382] = 275;
				field1065[field1382] = arg3;
				field1062[field1382] = arg1;
				field1063[field1382] = arg0;
				field1382++;
			} else if (field1262 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1379[var6] != null) {
						field1254[field1382] = field1379[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1379[var6].equalsIgnoreCase("attack")) {
							if (arg2.field422 > field1073.field422) {
								var7 = 2000;
							}

							if (field1073.field439 != 0 && arg2.field439 != 0) {
								if (field1073.field439 == arg2.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1380[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1064[field1382] = var7 + 639;
						}

						if (var6 == 1) {
							field1064[field1382] = var7 + 499;
						}

						if (var6 == 2) {
							field1064[field1382] = var7 + 27;
						}

						if (var6 == 3) {
							field1064[field1382] = var7 + 387;
						}

						if (var6 == 4) {
							field1064[field1382] = var7 + 185;
						}

						field1065[field1382] = arg3;
						field1062[field1382] = arg1;
						field1063[field1382] = arg0;
						field1382++;
					}
				}
			} else if ((field1264 & 0x8) == 8) {
				field1254[field1382] = field1265 + " @whi@" + var5;
				field1064[field1382] = 131;
				field1065[field1382] = arg3;
				field1062[field1382] = arg1;
				field1063[field1382] = arg0;
				field1382++;
			}

			for (int var8 = 0; var8 < field1382; var8++) {
				if (field1064[var8] == 718) {
					field1254[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public final void method516(class38 arg0, int arg1) {
		field1214 = 0;
		field1149 = 0;
		method556(arg1, arg0);
		method458(arg0, arg1);
		method497(arg1, arg0);

		for (int var3 = 0; var3 < field1214; var3++) {
			int var4 = field1215[var3];
			if (field1143 != field1455[var4].field405) {
				field1455[var4].field415 = null;
				field1455[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1292 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1456; var5++) {
			if (field1455[field1457[var5]] == null) {
				signlink.reporterror(field1292 + " null entry in npc list - pos:" + var5 + " size:" + field1456);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(Ld;Z)Z")
	public final boolean method517(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method513(arg0, var2);
			int var4 = arg0.field73[var2];
			if (arg0.field72[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field72[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field72[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method518(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method519() {
		field1417 = new class36(field1075, "titlebox", 0);
		field1418 = new class36(field1075, "titlebutton", 0);
		field1258 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1258[var2] = new class36(field1075, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1258[var3] = new class36(field1075, "runes", (var3 & 0x3) + 12);
			}
		}

		field1295 = new class35(128, 265);
		field1296 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1295.field596[var4] = field1463.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1296.field596[var5] = field1464.field654[var5];
		}

		field1081 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1081[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1081[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1081[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1081[var9 + 192] = 0xFFFFFF;
		}

		field1082 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1082[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1082[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1082[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1082[var13 + 192] = 0xFFFFFF;
		}

		field1083 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1083[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1083[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1083[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1083[var17 + 192] = 0xFFFFFF;
		}

		field1080 = new int[256];
		field1394 = new int[32768];
		field1395 = new int[32768];
		method481(null);
		field1212 = new int[32768];
		field1213 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1338) {
			field1469 = true;
			field1338 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method520() {
		field1299 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1338) {
				field1430++;
				method471();
				method471();
				method550();
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

		field1299 = false;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method521() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IILd;IZ)V")
	public final void method522(int arg0, int arg1, class4 arg2, int arg3) {
		if (arg2.field63 == 0 && arg2.field78 != null && (!arg2.field77 || field1318 == arg2.field61 || field1216 == arg2.field61 || field1447 == arg2.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg1, arg3, arg2.field66 + arg1, arg2.field67 + arg3);
			int var9 = arg2.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field79[var10] + arg1;
				int var12 = arg2.field80[var10] + arg3 - arg0;
				class4 var13 = class4.field56[arg2.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method554(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method522(var13.field76, var11, var13, var12);

					if (var13.field75 > var13.field67) {
						method446(var13.field75, var13.field66 + var11, var13.field67, var13.field76, var12);
					}
				} else if (var13.field63 != 1) {
					if (var13.field63 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field67; var15++) {
							for (int var16 = 0; var16 < var13.field66; var16++) {
								int var17 = (var13.field87 + 32) * var16 + var11;
								int var18 = (var13.field88 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field90[var14];
									var18 += var13.field91[var14];
								}

								if (var13.field57[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field57[var14] - 1;
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1137 != 0 && field1136 == var14) {
										int var22 = 0;
										if (field1235 == 1 && field1236 == var14 && field1237 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var22, var21, var13.field58[var14]);
										if (var23 != null) {
											if (field1137 != 0 && field1136 == var14 && field1135 == var13.field61) {
												var19 = field17 - field1138;
												var20 = field18 - field1139;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1116 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < class33.field566 && arg2.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1341 / 3;
													if (var24 > field1341 * 10) {
														var24 = field1341 * 10;
													}

													if (var24 > arg2.field76) {
														var24 = arg2.field76;
													}

													arg2.field76 -= var24;
													field1139 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg2.field76 < arg2.field75 - arg2.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1341 / 3;
													if (var25 > field1341 * 10) {
														var25 = field1341 * 10;
													}

													if (var25 > arg2.field75 - arg2.field67 - arg2.field76) {
														var25 = arg2.field75 - arg2.field67 - arg2.field76;
													}

													arg2.field76 += var25;
													field1139 -= var25;
												}
											} else if (field1332 != 0 && field1331 == var14 && field1330 == var13.field61) {
												var23.method188(var18, var17, 128);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1222.method206(method451(var26), var18 + var20 + 10, var17 + 1 + var19, 0);
												field1222.method206(method451(var26), var18 + var20 + 9, var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class35 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method186(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1447 == var13.field61 || field1216 == var13.field61 || field1318 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method517(var13)) {
							var29 = var13.field100;
							if (var28 && var13.field102 != 0) {
								var29 = var13.field102;
							}
						} else {
							var29 = var13.field99;
							if (var28 && var13.field101 != 0) {
								var29 = var13.field101;
							}
						}

						if (var13.field68 == 0) {
							if (var13.field93) {
								class33.method157(var29, var13.field67, var12, var13.field66, var11);
							} else {
								class33.method158(var11, var12, var13.field67, var29, var13.field66);
							}
						} else if (var13.field93) {
							class33.method156(var13.field67, var13.field66, 256 - (var13.field68 & 0xFF), var29, var11, var12);
						} else {
							class33.method159(var12, 256 - (var13.field68 & 0xFF), var13.field67, var13.field66, var29, var11);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1447 == var13.field61 || field1216 == var13.field61 || field1318 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method517(var13)) {
							var33 = var13.field100;
							if (var32 && var13.field102 != 0) {
								var33 = var13.field102;
							}

							if (var13.field98.length() > 0) {
								var31 = var13.field98;
							}
						} else {
							var33 = var13.field99;
							if (var32 && var13.field101 != 0) {
								var33 = var13.field101;
							}
						}

						if (var13.field64 == 6 && field1471) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class33.field564 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field617 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method433(method513(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method433(method513(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method433(method513(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method433(method513(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method433(method513(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field94) {
								var30.method203(var13.field95, var33, var41, var13.field66 / 2 + var11, var34);
							} else {
								var30.method210(var34, var11, var41, var33, var13.field95);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method517(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method186(var11, var12);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field578;
						int var44 = class34.field579;
						class34.field578 = var13.field66 / 2 + var11;
						class34.field579 = var13.field67 / 2 + var12;
						int var45 = class34.field582[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field583[var13.field112] * var13.field111 >> 16;
						boolean var47 = method517(var13);
						int var48;
						if (var47) {
							var48 = var13.field110;
						} else {
							var48 = var13.field109;
						}

						class31 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, -1, var47);
						} else {
							class66 var50 = class66.field996[var48];
							var49 = var13.method34(var50.field999[var13.field59], var50.field998[var13.field59], var47);
						}

						if (var49 != null) {
							var49.method146(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class34.field578 = var43;
						class34.field579 = var44;
					} else if (var13.field63 == 7) {
						class37 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method348(var13.field57[var52] - 1);
									String var56 = var55.field917;
									if (var55.field928 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method524(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var13.field95, var13.field99, var56, var13.field66 / 2 + var57, var58);
									} else {
										var51.method210(var58, var57, var56, var13.field99, var13.field95);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1168 && !field1217 && !field1099) {
			field1143++;

			if (field1429) {
				method525();
			} else {
				method504();
			}

			method498();
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method523(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.c(IZ)Ljava/lang/String;")
	public static final String method524(int arg0) {
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

	@ObfuscatedName("client.p(Z)V")
	public final void method525() {
		if (field1228 > 1) {
			field1228--;
		}

		if (field1124 > 0) {
			field1124--;
		}

		for (int var1 = 0; var1 < 5 && method431(); var1++) {
		}

		if (field1429) {
			synchronized (field1324.field869) {
				if (!field1189) {
					field1324.field870 = 0;
				} else if (field23 != 0 || field1324.field870 >= 40) {
					field1424.method218(151);
					field1424.method219(0);
					int var3 = field1424.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1324.field870 && var3 - field1424.field621 < 240; var5++) {
						var4++;
						int var6 = field1324.field872[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1324.field871[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1324.field872[var5] == -1 && field1324.field871[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1478 != var7 || field1479 != var6) {
							int var9 = var7 - field1478;
							field1478 = var7;
							int var10 = var6 - field1479;
							field1479 = var6;

							if (field1448 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1424.method220((field1448 << 12) + (var9 << 6) + var10);
								field1448 = 0;
							} else if (field1448 < 8) {
								field1424.method222((field1448 << 19) + var8 + 0x800000);
								field1448 = 0;
							} else {
								field1424.method223((field1448 << 19) + var8 - 0x40000000);
								field1448 = 0;
							}
						} else if (field1448 < 2047) {
							field1448++;
						}
					}

					field1424.method228(field1424.field621 - var3);

					if (var4 >= field1324.field870) {
						field1324.field870 = 0;
					} else {
						field1324.field870 -= var4;
						for (int var11 = 0; var11 < field1324.field870; var11++) {
							field1324.field871[var11] = field1324.field871[var4 + var11];
							field1324.field872[var11] = field1324.field872[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1319) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1319 = field26;
				int var14 = field25;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field24;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field23 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field1424.method218(240);
				field1424.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1392 > 0) {
				field1392--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1393 = true;
			}

			if (field1393 && field1392 <= 0) {
				field1392 = 20;
				field1393 = false;
				field1424.method218(169);
				field1424.method220(field1449);
				field1424.method220(field1450);
			}

			if (field14 && !field1453) {
				field1453 = true;
				field1424.method218(247);
				field1424.method219(1);
			}

			if (!field14 && field1453) {
				field1453 = false;
				field1424.method218(247);
				field1424.method219(0);
			}

			method467();
			method541();
			method447();
			field1122++;
			if (field1122 > 750) {
				method445();
			}

			method429();
			method529();
			method491();
			field1341++;

			if (field1413 != 0) {
				field1412 += 20;
				if (field1412 >= 400) {
					field1413 = 0;
				}
			}

			if (field1332 != 0) {
				field1329++;
				if (field1329 >= 15) {
					if (field1332 == 2) {
						field1261 = true;
					}

					if (field1332 == 3) {
						field1415 = true;
					}

					field1332 = 0;
				}
			}

			if (field1137 != 0) {
				field1116++;

				if (field17 > field1138 + 5 || field17 < field1138 - 5 || field18 > field1139 + 5 || field18 < field1139 - 5) {
					field1134 = true;
				}

				if (field16 == 0) {
					if (field1137 == 2) {
						field1261 = true;
					}

					if (field1137 == 3) {
						field1415 = true;
					}

					field1137 = 0;

					if (field1134 && field1116 >= 5) {
						field1310 = -1;
						method444();

						if (field1310 == field1135 && field1309 != field1136) {
							class4 var19 = class4.field56[field1135];
							byte var20 = 0;
							if (field1163 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1309] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1136;
								int var22 = field1309;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1136;
								int var24 = field1309;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method33(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method33(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method33(field1309, field1136);
							}

							field1424.method218(38);
							field1424.method220(field1135);
							field1424.method220(field1136);
							field1424.method220(field1309);
							field1424.method219(var20);
						}
					} else if ((field1113 == 1 || method496(field1382 - 1)) && field1382 > 2) {
						method480();
					} else if (field1382 > 0) {
						method555(field1382 - 1);
					}

					field1329 = 10;
					field23 = 0;
				}
			}

			field1439++;
			if (field1439 > 62) {
				field1439 = 0;
				field1424.method218(6);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method488(field1073.field411[0], field1073.field410[0], 0, var25, var26, 0, true, 0, 0, 0, 0);
				class18.field292 = -1;

				if (var27) {
					field1410 = field24;
					field1411 = field25;
					field1413 = 1;
					field1412 = 0;
				}
			}

			if (field23 == 1 && field1130 != null) {
				field1130 = null;
				field1415 = true;
				field23 = 0;
			}

			method454();
			method450();
			method528();
			method438();

			if (field16 == 1 || field23 == 1) {
				field1179++;
			}

			if (field1220 == 2) {
				method509();
			}

			if (field1220 == 2 && field1095) {
				method473();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1132[var28]++;
			}

			method492();
			field15++;
			if (field15 > 4500) {
				field1124 = 250;
				field15 -= 500;
				field1424.method218(80);
			}

			field1260++;
			if (field1260 > 500) {
				field1260 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1161 += field1162;
				}

				if ((var29 & 0x2) == 2) {
					field1177 += field1178;
				}

				if ((var29 & 0x4) == 4) {
					field1140 += field1141;
				}
			}

			if (field1161 < -50) {
				field1162 = 2;
			}

			if (field1161 > 50) {
				field1162 = -2;
			}

			if (field1177 < -55) {
				field1178 = 2;
			}

			if (field1177 > 55) {
				field1178 = -2;
			}

			if (field1140 < -40) {
				field1141 = 1;
			}

			if (field1140 > 40) {
				field1141 = -1;
			}

			field1191++;
			if (field1191 > 500) {
				field1191 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1286 += field1287;
				}

				if ((var30 & 0x2) == 2) {
					field1180 += field1181;
				}
			}

			if (field1286 < -60) {
				field1287 = 2;
			}

			if (field1286 > 60) {
				field1287 = -2;
			}

			if (field1180 < -20) {
				field1181 = 1;
			}

			if (field1180 > 10) {
				field1181 = -1;
			}

			field1123++;
			if (field1123 > 50) {
				field1424.method218(115);
			}

			try {
				if (field1425 != null && field1424.field621 > 0) {
					field1425.method42(0, field1424.field621, field1424.field620);
					field1424.field621 = 0;
					field1123 = 0;
				}
			} catch (IOException var32) {
				method445();
			} catch (Exception var33) {
				method562();
			}
		}
	}

	@ObfuscatedName("client.a(Lgc;IIII)V")
	public final void method526(class59 arg0, int arg1, int arg2, int arg3) {
		if (field1382 < 400) {
			if (arg0.field905 != null) {
				arg0 = arg0.method345();
			}

			if (arg0 != null) {
				String var5 = arg0.field880;
				if (arg0.field897 != 0) {
					var5 = var5 + method464(arg0.field897, field1073.field422) + " (level-" + arg0.field897 + ")";
				}

				if (field1235 == 1) {
					field1254[field1382] = "Use " + field1239 + " with @yel@" + var5;
					field1064[field1382] = 829;
					field1065[field1382] = arg1;
					field1062[field1382] = arg2;
					field1063[field1382] = arg3;
					field1382++;
				} else if (field1262 != 1) {
					if (arg0.field892 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field892[var6] != null && !arg0.field892[var6].equalsIgnoreCase("attack")) {
								field1254[field1382] = arg0.field892[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1064[field1382] = 242;
								}

								if (var6 == 1) {
									field1064[field1382] = 209;
								}

								if (var6 == 2) {
									field1064[field1382] = 309;
								}

								if (var6 == 3) {
									field1064[field1382] = 852;
								}

								if (var6 == 4) {
									field1064[field1382] = 793;
								}

								field1065[field1382] = arg1;
								field1062[field1382] = arg2;
								field1063[field1382] = arg3;
								field1382++;
							}
						}
					}

					if (arg0.field892 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field892[var7] != null && arg0.field892[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field897 > field1073.field422) {
									var8 = 2000;
								}

								field1254[field1382] = arg0.field892[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1064[field1382] = var8 + 242;
								}

								if (var7 == 1) {
									field1064[field1382] = var8 + 209;
								}

								if (var7 == 2) {
									field1064[field1382] = var8 + 309;
								}

								if (var7 == 3) {
									field1064[field1382] = var8 + 852;
								}

								if (var7 == 4) {
									field1064[field1382] = var8 + 793;
								}

								field1065[field1382] = arg1;
								field1062[field1382] = arg2;
								field1063[field1382] = arg3;
								field1382++;
							}
						}
					}

					field1254[field1382] = "Examine @yel@" + var5;
					field1064[field1382] = 1714;
					field1065[field1382] = arg1;
					field1062[field1382] = arg2;
					field1063[field1382] = arg3;
					field1382++;
				} else if ((field1264 & 0x2) == 2) {
					field1254[field1382] = field1265 + " @yel@" + var5;
					field1064[field1382] = 240;
					field1065[field1382] = arg1;
					field1062[field1382] = arg2;
					field1063[field1382] = arg3;
					field1382++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBILjava/lang/String;Ljava/lang/String;I)Lxb;")
	public final class50 method527(int arg0, int arg1, String arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1115[0] != null) {
				var6 = field1115[0].method291(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1076.reset();
			field1076.update(var6);
			int var8 = (int) field1076.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class50(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg4, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method495(arg3 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class38 var16 = new class38(var15);
				var16.field621 = 3;
				int var17 = var16.method233() + 6;
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
						method13(arg4, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1115[0] != null) {
						field1115[0].method292(var6, arg1, var6.length);
					}
				} catch (Exception var28) {
					field1115[0] = null;
				}

				if (var6 != null) {
					field1076.reset();
					field1076.update(var6);
					int var23 = (int) field1076.getValue();
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
						method13(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg4, var11 + " - Retrying in " + var25);
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

				field1373 = !field1373;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.m(B)V")
	public final void method528() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1366[0] != -1) {
				field1261 = true;
				field1208 = 0;
				field1314 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1366[1] != -1) {
				field1261 = true;
				field1208 = 1;
				field1314 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1366[2] != -1) {
				field1261 = true;
				field1208 = 2;
				field1314 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1366[3] != -1) {
				field1261 = true;
				field1208 = 3;
				field1314 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1366[4] != -1) {
				field1261 = true;
				field1208 = 4;
				field1314 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1366[5] != -1) {
				field1261 = true;
				field1208 = 5;
				field1314 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1366[6] != -1) {
				field1261 = true;
				field1208 = 6;
				field1314 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1366[7] != -1) {
				field1261 = true;
				field1208 = 7;
				field1314 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1366[8] != -1) {
				field1261 = true;
				field1208 = 8;
				field1314 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1366[9] != -1) {
				field1261 = true;
				field1208 = 9;
				field1314 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1366[10] != -1) {
				field1261 = true;
				field1208 = 10;
				field1314 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1366[11] != -1) {
				field1261 = true;
				field1208 = 11;
				field1314 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1366[12] != -1) {
				field1261 = true;
				field1208 = 12;
				field1314 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1366[13] != -1) {
				field1261 = true;
				field1208 = 13;
				field1314 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method529() {
		for (int var1 = 0; var1 < field1456; var1++) {
			int var2 = field1457[var1];
			class26 var3 = field1455[var2];
			if (var3 != null) {
				method530(var3, var3.field415.field882);
			}
		}
	}

	@ObfuscatedName("client.a(ILy;I)V")
	public final void method530(class25 arg0, int arg1) {
		if (arg0.field360 < 128 || arg0.field361 < 128 || arg0.field360 >= 13184 || arg0.field361 >= 13184) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (field1073 == arg0 && (arg0.field360 < 1536 || arg0.field361 < 1536 || arg0.field360 >= 11776 || arg0.field361 >= 11776)) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (arg0.field402 > field1143) {
			method531(arg0);
		} else if (arg0.field403 >= field1143) {
			method532(arg0);
		} else {
			method533(arg0);
		}

		method534(arg0);
		method535(arg0);
	}

	@ObfuscatedName("client.a(Ly;I)V")
	public final void method531(class25 arg0) {
		int var2 = arg0.field402 - field1143;
		int var3 = arg0.field398 * 128 + arg0.field364 * 64;
		int var4 = arg0.field400 * 128 + arg0.field364 * 64;
		arg0.field360 += (var3 - arg0.field360) / var2;
		arg0.field361 += (var4 - arg0.field361) / var2;
		arg0.field413 = 0;

		if (arg0.field404 == 0) {
			arg0.field407 = 1024;
		}

		if (arg0.field404 == 1) {
			arg0.field407 = 1536;
		}

		if (arg0.field404 == 2) {
			arg0.field407 = 0;
		}

		if (arg0.field404 == 3) {
			arg0.field407 = 512;
		}
	}

	@ObfuscatedName("client.a(Ly;B)V")
	public final void method532(class25 arg0) {
		if (field1143 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field996[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1143 - arg0.field402;
			int var4 = arg0.field398 * 128 + arg0.field364 * 64;
			int var5 = arg0.field400 * 128 + arg0.field364 * 64;
			int var6 = arg0.field399 * 128 + arg0.field364 * 64;
			int var7 = arg0.field401 * 128 + arg0.field364 * 64;
			arg0.field360 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field361 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field413 = 0;

		if (arg0.field404 == 0) {
			arg0.field407 = 1024;
		}

		if (arg0.field404 == 1) {
			arg0.field407 = 1536;
		}

		if (arg0.field404 == 2) {
			arg0.field407 = 0;
		}

		if (arg0.field404 == 3) {
			arg0.field407 = 512;
		}

		arg0.field362 = arg0.field407;
	}

	@ObfuscatedName("client.b(Ly;I)V")
	public final void method533(class25 arg0) {
		arg0.field385 = arg0.field365;
		if (arg0.field409 == 0) {
			arg0.field413 = 0;
		} else {
			if (arg0.field388 != -1 && arg0.field391 == 0) {
				class66 var2 = class66.field996[arg0.field388];
				if (arg0.field414 > 0 && var2.field1008 == 0) {
					arg0.field413++;
					return;
				}

				if (arg0.field414 <= 0 && var2.field1009 == 0) {
					arg0.field413++;
					return;
				}
			}

			int var3 = arg0.field360;
			int var4 = arg0.field361;
			int var5 = arg0.field410[arg0.field409 - 1] * 128 + arg0.field364 * 64;
			int var6 = arg0.field411[arg0.field409 - 1] * 128 + arg0.field364 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field407 = 1280;
					} else if (var4 > var6) {
						arg0.field407 = 1792;
					} else {
						arg0.field407 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field407 = 768;
					} else if (var4 > var6) {
						arg0.field407 = 256;
					} else {
						arg0.field407 = 512;
					}
				} else if (var4 < var6) {
					arg0.field407 = 1024;
				} else {
					arg0.field407 = 0;
				}

				int var7 = arg0.field407 - arg0.field362 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field368;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field367;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field370;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field369;
				}

				if (var8 == -1) {
					var8 = arg0.field367;
				}

				arg0.field385 = var8;
				int var9 = 4;
				if (arg0.field407 != arg0.field362 && arg0.field382 == -1 && arg0.field408 != 0) {
					var9 = 2;
				}

				if (arg0.field409 > 2) {
					var9 = 6;
				}

				if (arg0.field409 > 3) {
					var9 = 8;
				}

				if (arg0.field413 > 0 && arg0.field409 > 1) {
					var9 = 8;
					arg0.field413--;
				}

				if (arg0.field412[arg0.field409 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field385 == arg0.field367 && arg0.field371 != -1) {
					arg0.field385 = arg0.field371;
				}

				if (var3 < var5) {
					arg0.field360 += var9;
					if (arg0.field360 > var5) {
						arg0.field360 = var5;
					}
				} else if (var3 > var5) {
					arg0.field360 -= var9;
					if (arg0.field360 < var5) {
						arg0.field360 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field361 += var9;
					if (arg0.field361 > var6) {
						arg0.field361 = var6;
					}
				} else if (var4 > var6) {
					arg0.field361 -= var9;
					if (arg0.field361 < var6) {
						arg0.field361 = var6;
					}
				}

				if (arg0.field360 == var5 && arg0.field361 == var6) {
					arg0.field409--;

					if (arg0.field414 > 0) {
						arg0.field414--;
						return;
					}
				}
			} else {
				arg0.field360 = var5;
				arg0.field361 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Ly;Z)V")
	public final void method534(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1455[arg0.field382];
				if (var2 != null) {
					int var3 = arg0.field360 - var2.field360;
					int var4 = arg0.field361 - var2.field361;
					if (var3 != 0 || var4 != 0) {
						arg0.field407 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field382 >= 32768) {
				int var5 = arg0.field382 - 32768;
				if (field1094 == var5) {
					var5 = field1145;
				}

				class27 var6 = field1146[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1384 - field1384) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1385 - field1385) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field407 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field383 = 0;
				arg0.field384 = 0;
			}

			int var11 = arg0.field407 - arg0.field362 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field408 || var11 > 2048 - arg0.field408) {
					arg0.field362 = arg0.field407;
				} else if (var11 > 1024) {
					arg0.field362 -= arg0.field408;
				} else {
					arg0.field362 += arg0.field408;
				}

				arg0.field362 &= 0x7FF;
				if (arg0.field385 == arg0.field365 && arg0.field407 != arg0.field362) {
					if (arg0.field366 != -1) {
						arg0.field385 = arg0.field366;
						return;
					}

					arg0.field385 = arg0.field367;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ly;Z)V")
	public final void method535(class25 arg0) {
		arg0.field363 = false;

		if (arg0.field385 != -1) {
			class66 var2 = class66.field996[arg0.field385];
			arg0.field387++;
			if (arg0.field386 < var2.field997 && arg0.field387 > var2.method382(arg0.field386)) {
				arg0.field387 = 0;
				arg0.field386++;
			}

			if (arg0.field386 >= var2.field997) {
				arg0.field387 = 0;
				arg0.field386 = 0;
			}
		}

		if (arg0.field393 != -1 && field1143 >= arg0.field396) {
			if (arg0.field394 < 0) {
				arg0.field394 = 0;
			}

			class66 var3 = class68.field1016[arg0.field393].field1020;
			arg0.field395++;
			while (arg0.field394 < var3.field997 && arg0.field395 > var3.method382(arg0.field394)) {
				arg0.field395 -= var3.method382(arg0.field394);
				arg0.field394++;
			}

			if (arg0.field394 >= var3.field997 && (arg0.field394 < 0 || arg0.field394 >= var3.field997)) {
				arg0.field393 = -1;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 <= 1) {
			class66 var4 = class66.field996[arg0.field388];
			if (var4.field1008 == 1 && arg0.field414 > 0 && arg0.field402 <= field1143 && arg0.field403 < field1143) {
				arg0.field391 = 1;
				return;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 == 0) {
			class66 var5 = class66.field996[arg0.field388];
			arg0.field390++;
			while (arg0.field389 < var5.field997 && arg0.field390 > var5.method382(arg0.field389)) {
				arg0.field390 -= var5.method382(arg0.field389);
				arg0.field389++;
			}

			if (arg0.field389 >= var5.field997) {
				arg0.field389 -= var5.field1001;
				arg0.field392++;
				if (arg0.field392 >= var5.field1007) {
					arg0.field388 = -1;
				}

				if (arg0.field389 < 0 || arg0.field389 >= var5.field997) {
					arg0.field388 = -1;
				}
			}

			arg0.field363 = var5.field1003;
		}

		if (arg0.field391 > 0) {
			arg0.field391--;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method536() {
		if (field1192) {
			field1192 = false;
			field1198.method259(0, field9, 4);
			field1199.method259(0, field9, 357);
			field1200.method259(722, field9, 4);
			field1201.method259(743, field9, 205);
			field1202.method259(0, field9, 0);
			field1203.method259(516, field9, 4);
			field1204.method259(516, field9, 205);
			field1205.method259(496, field9, 357);
			field1206.method259(0, field9, 338);
			field1261 = true;
			field1415 = true;
			field1314 = true;
			field1096 = true;

			if (field1220 != 2) {
				field1166.method259(4, field9, 4);
				field1165.method259(550, field9, 4);
			}
		}

		if (field1220 == 2) {
			method548();
		}

		if (field1408 && field1171 == 1) {
			field1261 = true;
		}

		if (field1158 != -1) {
			boolean var1 = method552(field1341, field1158);
			if (var1) {
				field1261 = true;
			}
		}

		if (field1332 == 2) {
			field1261 = true;
		}

		if (field1137 == 2) {
			field1261 = true;
		}

		if (field1261) {
			method561();
			field1261 = false;
		}

		if (field1074 == -1) {
			field1279.field76 = field1409 - field1259 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method540(0, field1279, field1409, 77, false, field18 - 357, field17 - 17, 463);
			}

			int var2 = field1409 - field1279.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1409 - 77) {
				var2 = field1409 - 77;
			}

			if (field1259 != var2) {
				field1259 = var2;
				field1415 = true;
			}
		}

		if (field1074 != -1) {
			boolean var3 = method552(field1341, field1074);
			if (var3) {
				field1415 = true;
			}
		}

		if (field1332 == 3) {
			field1415 = true;
		}

		if (field1137 == 3) {
			field1415 = true;
		}

		if (field1130 != null) {
			field1415 = true;
		}

		if (field1408 && field1171 == 2) {
			field1415 = true;
		}

		if (field1415) {
			method456();
			field1415 = false;
		}

		if (field1220 == 2) {
			method462();
			field1165.method259(550, field9, 4);
		}

		if (field1152 != -1) {
			field1314 = true;
		}

		if (field1314) {
			if (field1152 != -1 && field1208 == field1152) {
				field1152 = -1;
				field1424.method218(36);
				field1424.method219(field1208);
			}

			field1314 = false;
			field1443.method258();
			field1273.method199(0, 0);

			if (field1158 == -1) {
				if (field1366[field1208] != -1) {
					if (field1208 == 0) {
						field1473.method199(22, 10);
					}

					if (field1208 == 1) {
						field1474.method199(54, 8);
					}

					if (field1208 == 2) {
						field1474.method199(82, 8);
					}

					if (field1208 == 3) {
						field1475.method199(110, 8);
					}

					if (field1208 == 4) {
						field1477.method199(153, 8);
					}

					if (field1208 == 5) {
						field1477.method199(181, 8);
					}

					if (field1208 == 6) {
						field1476.method199(209, 9);
					}
				}

				if (field1366[0] != -1 && (field1152 != 0 || field1143 % 20 < 10)) {
					field1105[0].method199(29, 13);
				}

				if (field1366[1] != -1 && (field1152 != 1 || field1143 % 20 < 10)) {
					field1105[1].method199(53, 11);
				}

				if (field1366[2] != -1 && (field1152 != 2 || field1143 % 20 < 10)) {
					field1105[2].method199(82, 11);
				}

				if (field1366[3] != -1 && (field1152 != 3 || field1143 % 20 < 10)) {
					field1105[3].method199(115, 12);
				}

				if (field1366[4] != -1 && (field1152 != 4 || field1143 % 20 < 10)) {
					field1105[4].method199(153, 13);
				}

				if (field1366[5] != -1 && (field1152 != 5 || field1143 % 20 < 10)) {
					field1105[5].method199(180, 11);
				}

				if (field1366[6] != -1 && (field1152 != 6 || field1143 % 20 < 10)) {
					field1105[6].method199(208, 13);
				}
			}

			field1443.method259(516, field9, 160);
			field1442.method258();
			field1272.method199(0, 0);

			if (field1158 == -1) {
				if (field1366[field1208] != -1) {
					if (field1208 == 7) {
						field1401.method199(42, 0);
					}

					if (field1208 == 8) {
						field1402.method199(74, 0);
					}

					if (field1208 == 9) {
						field1402.method199(102, 0);
					}

					if (field1208 == 10) {
						field1403.method199(130, 1);
					}

					if (field1208 == 11) {
						field1405.method199(173, 0);
					}

					if (field1208 == 12) {
						field1405.method199(201, 0);
					}

					if (field1208 == 13) {
						field1404.method199(229, 0);
					}
				}

				if (field1366[8] != -1 && (field1152 != 8 || field1143 % 20 < 10)) {
					field1105[7].method199(74, 2);
				}

				if (field1366[9] != -1 && (field1152 != 9 || field1143 % 20 < 10)) {
					field1105[8].method199(102, 3);
				}

				if (field1366[10] != -1 && (field1152 != 10 || field1143 % 20 < 10)) {
					field1105[9].method199(137, 4);
				}

				if (field1366[11] != -1 && (field1152 != 11 || field1143 % 20 < 10)) {
					field1105[10].method199(174, 2);
				}

				if (field1366[12] != -1 && (field1152 != 12 || field1143 % 20 < 10)) {
					field1105[11].method199(201, 2);
				}

				if (field1366[13] != -1 && (field1152 != 13 || field1143 % 20 < 10)) {
					field1105[12].method199(226, 2);
				}
			}

			field1442.method259(496, field9, 466);
			field1166.method258();
		}

		if (field1096) {
			field1096 = false;
			field1441.method258();
			field1271.method199(0, 0);
			field1223.method203(true, 0xFFFFFF, "Public chat", 55, 28);

			if (field1133 == 0) {
				field1223.method203(true, 0xFF00, "On", 55, 41);
			}

			if (field1133 == 1) {
				field1223.method203(true, 0xFFFF00, "Friends", 55, 41);
			}

			if (field1133 == 2) {
				field1223.method203(true, 0xFF0000, "Off", 55, 41);
			}

			if (field1133 == 3) {
				field1223.method203(true, 0xFFFF, "Hide", 55, 41);
			}

			field1223.method203(true, 0xFFFFFF, "Private chat", 184, 28);

			if (field1185 == 0) {
				field1223.method203(true, 0xFF00, "On", 184, 41);
			}

			if (field1185 == 1) {
				field1223.method203(true, 0xFFFF00, "Friends", 184, 41);
			}

			if (field1185 == 2) {
				field1223.method203(true, 0xFF0000, "Off", 184, 41);
			}

			field1223.method203(true, 0xFFFFFF, "Trade/compete", 324, 28);

			if (field1060 == 0) {
				field1223.method203(true, 0xFF00, "On", 324, 41);
			}

			if (field1060 == 1) {
				field1223.method203(true, 0xFFFF00, "Friends", 324, 41);
			}

			if (field1060 == 2) {
				field1223.method203(true, 0xFF0000, "Off", 324, 41);
			}

			field1223.method203(true, 0xFFFFFF, "Report abuse", 458, 33);
			field1441.method259(0, field9, 453);
			field1166.method258();
		}

		field1341 = 0;
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method537(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method537(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method538() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1217) {
			field1338 = false;
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

		if (field1099) {
			field1338 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1168) {
			field1338 = false;
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

	@ObfuscatedName("client.g(II)V")
	public final void method539(int arg0) {
		if (!field1252) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1341 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1248;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1248 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1341 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1248;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1248 = var11;
				class34.method171(24);
			}

			if (class34.field592[34] >= arg0) {
				class36 var14 = class34.field586[34];
				int var15 = var14.field606 * var14.field605 - 1;
				int var16 = field1341 * var14.field605 * 2;
				byte[] var17 = var14.field603;
				byte[] var18 = field1248;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field603 = var18;
				field1248 = var17;
				class34.method171(34);
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1250 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IILd;IIZIII)V")
	public final void method540(int arg0, class4 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		if (field1129) {
			field1428 = 32;
		} else {
			field1428 = 0;
		}

		field1129 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 && arg5 < arg0 + 16) {
			arg1.field76 -= field1179 * 4;

			if (arg4) {
				field1261 = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 + arg3 - 16 && arg5 < arg0 + arg3) {
			arg1.field76 += field1179 * 4;

			if (arg4) {
				field1261 = true;
				return;
			}
		} else if (arg6 >= arg7 - field1428 && arg6 < arg7 + field1428 + 16 && arg5 >= arg0 + 16 && arg5 < arg0 + arg3 - 16 && field1179 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg0 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg1.field76 = (arg2 - arg3) * var10 / var11;

			if (arg4) {
				field1261 = true;
			}

			field1129 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method541() {
		if (field1220 == 2) {
			for (class40 var1 = (class40) field1218.method248(); var1 != null; var1 = (class40) field1218.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field645, var1.field647))) {
						method507(var1.field646, var1.field640, var1.field638, var1.field641, var1.field647, var1.field645, var1.field639);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field642, var1.field644)) {
					method507(var1.field643, var1.field640, var1.field638, var1.field641, var1.field644, var1.field642, var1.field639);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZJ)V")
	public final void method542(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1245; var3++) {
				if (field1302[var3] == arg0) {
					field1245--;
					field1261 = true;

					for (int var4 = var3; var4 < field1245; var4++) {
						field1302[var4] = field1302[var4 + 1];
					}

					field1424.method218(104);
					field1424.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.d(ZJ)V")
	public final void method543(long arg0) {
		if (arg0 != 0L) {
			if (field1245 >= 100) {
				method553("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1245; var4++) {
					if (field1302[var4] == arg0) {
						method553(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1370; var5++) {
					if (field1068[var5] == arg0) {
						method553("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field1302[field1245++] = arg0;
				field1261 = true;
				field1424.method218(158);
				field1424.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public final void method544(int arg0, class38 arg1) {
		while (arg1.field622 + 10 < arg0 * 8) {
			int var3 = arg1.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1146[var3] == null) {
				field1146[var3] = new class27();
				if (field1151[var3] != null) {
					field1146[var3].method116(field1151[var3]);
				}
			}

			field1148[field1147++] = var3;
			class27 var4 = field1146[var3];
			var4.field405 = field1143;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(field1073.field410[0] + var5, var7 == 1, field1073.field411[0] + var6);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1150[field1149++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.o(B)V")
	public void method545() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1430);

		if (field1210 != null) {
			System.out.println("Od-cycle:" + field1210.field747);
		}

		System.out.println("loop-cycle:" + field1143);
		System.out.println("draw-cycle:" + field1388);
		System.out.println("ptype:" + field1121);
		System.out.println("psize:" + field1120);

		if (field1425 != null) {
			field1425.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.c(Llb;II)V")
	public final void method546(class38 arg0, int arg1) {
		if (arg1 == 136 || arg1 == 211) {
			int var3 = arg0.method229();
			int var4 = (var3 >> 4 & 0x7) + field1269;
			int var5 = (var3 & 0x7) + field1270;
			int var6 = arg0.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1381[var7];
			int var10;
			if (arg1 == 211) {
				var10 = -1;
			} else {
				var10 = arg0.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method559(var5, var10, -1, 0, var4, var7, var9, field1131, var8);
			}
		} else if (arg1 == 2) {
			int var11 = arg0.method229();
			int var12 = (var11 >> 4 & 0x7) + field1269;
			int var13 = (var11 & 0x7) + field1270;
			int var14 = arg0.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1381[var15];
			int var18 = arg0.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1435[field1131][var12][var13];
				int var20 = field1435[field1131][var12 + 1][var13];
				int var21 = field1435[field1131][var12 + 1][var13 + 1];
				int var22 = field1435[field1131][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1184.method72(field1131, var13, var12);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var18, false, 2, var16 + 4, var20, var24, var21, var19, var22);
							var23.field255 = new class28(var18, false, 2, var16 + 1 & 0x3, var20, var24, var21, var19, var22);
						} else {
							var23.field254 = new class28(var18, false, var15, var16, var20, var24, var21, var19, var22);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1184.method73(var12, field1131, var13);
					if (var25 != null) {
						var25.field147 = new class28(var18, false, 4, 0, var20, var25.field148 >> 14 & 0x7FFF, var21, var19, var22);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1184.method74(var13, field1131, var12);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var18, false, var15, var16, var20, var26.field247 >> 14 & 0x7FFF, var21, var19, var22);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1184.method75(var13, var12, field1131);
					if (var27 != null) {
						var27.field178 = new class28(var18, false, 22, var16, var20, var27.field179 >> 14 & 0x7FFF, var21, var19, var22);
					}
				}
			}
		} else if (arg1 == 147) {
			int var28 = arg0.method229();
			int var29 = (var28 >> 4 & 0x7) + field1269;
			int var30 = (var28 & 0x7) + field1270;
			int var31 = arg0.method231();
			int var32 = arg0.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1346[field1131][var29][var30] == null) {
					field1346[field1131][var29][var30] = new class41();
				}

				field1346[field1131][var29][var30].method245(var33);
				method476(var29, var30);
			}
		} else if (arg1 == 53) {
			int var34 = arg0.method229();
			int var35 = (var34 >> 4 & 0x7) + field1269;
			int var36 = (var34 & 0x7) + field1270;
			int var37 = arg0.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1346[field1131][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1346[field1131][var35][var36] = null;
					}

					method476(var35, var36);
				}
			}
		} else if (arg1 == 30) {
			int var40 = arg0.method229();
			int var41 = (var40 >> 4 & 0x7) + field1269;
			int var42 = (var40 & 0x7) + field1270;
			int var43 = var41 + arg0.method230();
			int var44 = var42 + arg0.method230();
			int var45 = arg0.method232();
			int var46 = arg0.method231();
			int var47 = arg0.method229() * 4;
			int var48 = arg0.method229() * 4;
			int var49 = arg0.method231();
			int var50 = arg0.method231();
			int var51 = arg0.method229();
			int var52 = arg0.method229();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var46 != 0xFFFF) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class30 var53 = new class30(var41, var45, method551(field1131, var42, var41) - var47, var42, var48, var46, field1143 + var50, var52, field1143 + var49, field1131, var51);
				var53.method120(field1143 + var49, method551(field1131, var44, var43) - var48, var44, var43);
				field1431.method245(var53);
			}
		} else if (arg1 == 193) {
			int var54 = arg0.method229();
			int var55 = (var54 >> 4 & 0x7) + field1269;
			int var56 = (var54 & 0x7) + field1270;
			int var57 = arg0.method231();
			int var58 = arg0.method229();
			int var59 = arg0.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var59, field1131, var55, var57, method551(field1131, var56, var55) - var58, field1143, var56);
				field1234.method245(var60);
			}
		} else if (arg1 == 137) {
			int var61 = arg0.method229();
			int var62 = (var61 >> 4 & 0x7) + field1269;
			int var63 = (var61 & 0x7) + field1270;
			int var64 = arg0.method231();
			int var65 = arg0.method231();
			int var66 = arg0.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1094 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1346[field1131][var62][var63] == null) {
					field1346[field1131][var62][var63] = new class41();
				}

				field1346[field1131][var62][var63].method245(var67);
				method476(var62, var63);
			}
		} else {
			if (arg1 == 191) {
				int var68 = arg0.method229();
				int var69 = (var68 >> 4 & 0x7) + field1269;
				int var70 = (var68 & 0x7) + field1270;
				int var71 = arg0.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1381[var72];
				int var75 = arg0.method231();
				int var76 = arg0.method231();
				int var77 = arg0.method231();
				int var78 = arg0.method231();
				byte var79 = arg0.method230();
				byte var80 = arg0.method230();
				byte var81 = arg0.method230();
				byte var82 = arg0.method230();
				class27 var83;
				if (field1094 == var78) {
					var83 = field1073;
				} else {
					var83 = field1146[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1435[field1131][var69][var70];
					int var86 = field1435[field1131][var69 + 1][var70];
					int var87 = field1435[field1131][var69 + 1][var70 + 1];
					int var88 = field1435[field1131][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method559(var70, -1, var77 + 1, var76 + 1, var69, 0, var74, field1131, 0);
						var83.field426 = field1143 + var76;
						var83.field427 = field1143 + var77;
						var83.field431 = var89;
						int var90 = var84.field835;
						int var91 = var84.field836;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field836;
							var91 = var84.field835;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method551(field1131, var83.field430, var83.field428);

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

						var83.field432 = var69 + var79;
						var83.field434 = var69 + var81;
						var83.field433 = var70 + var80;
						var83.field435 = var70 + var82;
					}
				}
			}

			if (arg1 == 253) {
				int var94 = arg0.method229();
				int var95 = (var94 >> 4 & 0x7) + field1269;
				int var96 = (var94 & 0x7) + field1270;
				int var97 = arg0.method231();
				int var98 = arg0.method231();
				int var99 = arg0.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1346[field1131][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method476(var95, var96);
					}
				}
			} else if (arg1 == 222) {
				int var102 = arg0.method229();
				int var103 = (var102 >> 4 & 0x7) + field1269;
				int var104 = (var102 & 0x7) + field1270;
				int var105 = arg0.method231();
				int var106 = arg0.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1073.field410[0] >= var103 - var107 && field1073.field410[0] <= var103 + var107 && field1073.field411[0] >= var104 - var107 && field1073.field411[0] <= var104 + var107 && field1437 && !field1252 && field1244 < 50) {
					field1188[field1244] = var105;
					field1098[field1244] = var108;
					field1186[field1244] = class55.field790[var105];
					field1244++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)Ljava/lang/String;")
	public final String method547() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.F(I)V")
	public final void method548() {
		field1312++;
		method499(true);
		method489(true);
		method499(false);
		method489(false);
		method436();
		method511();

		if (!field1095) {
			int var1 = field1449;
			if (field1301 / 256 > var1) {
				var1 = field1301 / 256;
			}

			if (field1187[4] && field1313[4] + 128 > var1) {
				var1 = field1313[4] + 128;
			}

			int var2 = field1450 + field1140 & 0x7FF;
			method430(field1390, var2, var1 * 3 + 600, field1391, method551(field1131, field1073.field361, field1073.field360) - 50, var1);
		}

		int var3;
		if (field1095) {
			var3 = method479();
		} else {
			var3 = method478();
		}

		int var4 = field1419;
		int var5 = field1420;
		int var6 = field1421;
		int var7 = field1422;
		int var8 = field1423;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1187[var9]) {
				int var10 = (int) (Math.random() * (field1282[var9] * 2 + 1) + Math.sin(field1233[var9] / 100.0D * field1132[var9]) * field1313[var9] - field1282[var9]);
				if (var9 == 0) {
					field1419 += var10;
				}

				if (var9 == 1) {
					field1420 += var10;
				}

				if (var9 == 2) {
					field1421 += var10;
				}

				if (var9 == 3) {
					field1423 = field1423 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1422 += var10;
					if (field1422 < 128) {
						field1422 = 128;
					}

					if (field1422 > 383) {
						field1422 = 383;
					}
				}
			}
		}

		int var11 = class34.field593;
		class31.field545 = true;
		class31.field548 = 0;
		class31.field546 = field17 - 4;
		class31.field547 = field18 - 4;
		class33.method155();
		field1184.method89(var3, field1422, field1421, field1423, field1419, field1420);
		field1184.method64();
		method493();
		method558();
		method539(var11);
		method485();
		field1166.method259(4, field9, 4);
		field1419 = var4;
		field1420 = var5;
		field1421 = var6;
		field1422 = var7;
		field1423 = var8;
	}

	@ObfuscatedName("client.q(Z)V")
	public static final void method549() {
		class18.field258 = false;
		class34.field573 = false;
		field1252 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method550() {
		short var1 = 256;

		if (field1226 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1226 > 768) {
					field1080[var2] = method486(1024 - field1226, field1082[var2], field1081[var2]);
				} else if (field1226 > 256) {
					field1080[var2] = field1082[var2];
				} else {
					field1080[var2] = method486(256 - field1226, field1081[var2], field1082[var2]);
				}
			}
		} else if (field1227 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1227 > 768) {
					field1080[var3] = method486(1024 - field1227, field1083[var3], field1081[var3]);
				} else if (field1227 > 256) {
					field1080[var3] = field1083[var3];
				} else {
					field1080[var3] = method486(256 - field1227, field1081[var3], field1083[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1080[var4] = field1081[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1463.field654[var5] = field1295.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1317[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1212[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1080[var12];
					int var15 = field1463.field654[var7];
					field1463.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1463.method259(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1464.field654[var16] = field1296.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1317[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1212[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1080[var23];
					int var26 = field1464.field654[var18];
					field1464.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1464.method259(637, field9, 0);
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method551(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field1305[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field1435[var6][var4][var5] + field1435[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1435[var6][var4][var5 + 1] + field1435[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method552(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method552(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method517(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field996[var8];
					var6.field60 += arg0;
					while (var6.field60 > var9.method382(var6.field59)) {
						var6.field60 -= var9.method382(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field997) {
							var6.field59 -= var9.field1001;
							if (var6.field59 < 0 || var6.field59 >= var9.field997) {
								var6.field59 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IZLjava/lang/String;)V")
	public final void method553(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field1291 != -1) {
			field1130 = arg0;
			field23 = 0;
		}

		if (field1074 == -1) {
			field1415 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1321[var4] = field1321[var4 - 1];
			field1322[var4] = field1322[var4 - 1];
			field1323[var4] = field1323[var4 - 1];
		}

		field1321[0] = arg1;
		field1322[0] = arg2;
		field1323[0] = arg0;
	}

	@ObfuscatedName("client.c(Ld;Z)V")
	public final void method554(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1371 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1371 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1371 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1370;
				if (field1371 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = field1281[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1370;
			if (field1371 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field97 = "";
				arg0.field64 = 0;
			} else {
				if (field1183[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1183[var2] == field1249) {
					arg0.field97 = "@gre@World-" + (field1183[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1183[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1370;
			if (field1371 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1371 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1371 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1245;
				if (field1371 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1302[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1245 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1143 / 40.0D) * 256.0D) & 0x7FF;

			if (field1372) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1221[var7];
					if (var8 >= 0 && !class64.field978[var8].method377()) {
						return;
					}
				}

				field1372 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1221[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field978[var12].method378();
					}
				}

				class31 var13 = new class31(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1257[var14] != 0) {
						var13.method140(field1061[var14][0], field1061[var14][field1257[var14]]);

						if (var14 == 1) {
							var13.method140(field1325[0], field1325[field1257[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field996[field1073.field365].field998[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field1156 == null) {
				field1156 = arg0.field103;
				field1157 = arg0.field104;
			}

			if (field1114) {
				arg0.field103 = field1157;
			} else {
				arg0.field103 = field1156;
			}
		} else if (var2 == 325) {
			if (field1156 == null) {
				field1156 = arg0.field103;
				field1157 = arg0.field104;
			}

			if (field1114) {
				arg0.field103 = field1156;
			} else {
				arg0.field103 = field1157;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1219;
			if (field1143 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1297 < 1) {
				arg0.field97 = "";
			} else if (field1294) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1347 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1337 == 0) {
					var15 = "earlier today";
				} else if (field1337 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1337 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1231 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1231 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1231 > 1) {
				arg0.field97 = field1231 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1079 == 201) {
				if (field1278 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1079 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1079 == 0) {
					var16 = "Earlier today";
				} else if (field1079 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1079 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1079 == 201) {
				if (field1278 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1079 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1079 == 201) {
				if (field1278 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1079 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1425 != null) {
				field1425.method38();
			}
		} catch (Exception var1) {
		}

		field1425 = null;
		method521();

		if (field1324 != null) {
			field1324.field868 = false;
		}

		field1324 = null;
		field1210.method271();
		field1210 = null;
		field1424 = null;
		field1255 = null;
		field1440 = null;
		field1070 = null;
		field1153 = null;
		field1078 = null;
		field1071 = null;
		field1072 = null;
		field1435 = null;
		field1305 = null;
		field1184 = null;
		field1209 = null;
		field1155 = null;
		field1092 = null;
		field1480 = null;
		field1481 = null;
		field1248 = null;
		field1164 = null;
		field1165 = null;
		field1166 = null;
		field1167 = null;
		field1441 = null;
		field1442 = null;
		field1443 = null;
		field1198 = null;
		field1199 = null;
		field1200 = null;
		field1201 = null;
		field1202 = null;
		field1203 = null;
		field1204 = null;
		field1205 = null;
		field1206 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1271 = null;
		field1272 = null;
		field1273 = null;
		field1105 = null;
		field1473 = null;
		field1474 = null;
		field1475 = null;
		field1476 = null;
		field1477 = null;
		field1401 = null;
		field1402 = null;
		field1403 = null;
		field1404 = null;
		field1405 = null;
		field1316 = null;
		field1432 = null;
		field1315 = null;
		field1093 = null;
		field1100 = null;
		field1101 = null;
		field1102 = null;
		field1103 = null;
		field1327 = null;
		field1472 = null;
		field1308 = null;
		field1146 = null;
		field1148 = null;
		field1150 = null;
		field1151 = null;
		field1215 = null;
		field1455 = null;
		field1457 = null;
		field1346 = null;
		field1218 = null;
		field1431 = null;
		field1234 = null;
		field1062 = null;
		field1063 = null;
		field1064 = null;
		field1065 = null;
		field1254 = null;
		field1241 = null;
		field1335 = null;
		field1336 = null;
		field1367 = null;
		field1086 = null;
		field1281 = null;
		field1068 = null;
		field1183 = null;
		field1463 = null;
		field1464 = null;
		field1460 = null;
		field1461 = null;
		field1462 = null;
		field1465 = null;
		field1466 = null;
		field1467 = null;
		field1468 = null;
		method487();
		class57.method329();
		class59.method340();
		class60.method347();
		class63.field965 = null;
		class64.field978 = null;
		class4.field56 = null;
		class65.field985 = null;
		class66.field996 = null;
		class68.field1016 = null;
		class68.field1028 = null;
		class70.field1039 = null;
		field10 = null;
		class27.field440 = null;
		class34.method164();
		class18.method49();
		class31.method122();
		class7.method46();
		System.gc();
	}

	@ObfuscatedName("client.h(II)V")
	public final void method555(int arg0) {
		if (arg0 >= 0) {
			if (field1306) {
				field1306 = false;
				field1415 = true;
			}

			int var2 = field1062[arg0];
			int var3 = field1063[arg0];
			int var4 = field1064[arg0];
			int var5 = field1065[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 810 && method500(215, var2, var5, var3)) {
				field1424.method220(field1238);
				field1424.method220(field1236);
				field1424.method220(field1237);
			}

			if (var4 == 398) {
				field1424.method218(101);
				field1424.method220(var5);
				field1424.method220(var2);
				field1424.method220(var3);
				field1424.method220(field1238);
				field1424.method220(field1236);
				field1424.method220(field1237);
				field1329 = 0;
				field1330 = var3;
				field1331 = var2;
				field1332 = 2;
				if (class4.field56[var3].field62 == field1311) {
					field1332 = 1;
				}

				if (class4.field56[var3].field62 == field1074) {
					field1332 = 3;
				}
			}

			if (var4 == 111) {
				boolean var6 = method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 0, 0, 2, 0);
				if (!var6) {
					method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 1, 1, 2, 0);
				}

				field1410 = field24;
				field1411 = field25;
				field1413 = 2;
				field1412 = 0;
				field1424.method218(163);
				field1424.method220(field1384 + var2);
				field1424.method220(field1385 + var3);
				field1424.method220(var5);
				field1424.method220(field1238);
				field1424.method220(field1236);
				field1424.method220(field1237);
			}

			if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
				class26 var8 = field1455[var5];
				if (var8 != null) {
					method488(field1073.field411[0], field1073.field410[0], 0, var8.field410[0], var8.field411[0], 0, false, 1, 1, 2, 0);
					field1410 = field24;
					field1411 = field25;
					field1413 = 2;
					field1412 = 0;

					if (var4 == 793) {
						field1424.method218(188);
					}

					if (var4 == 852) {
						field1424.method218(22);
					}

					if (var4 == 209) {
						field1424.method218(4);
					}

					if (var4 == 242) {
						field1424.method218(35);
					}

					if (var4 == 309) {
						field1424.method218(239);
					}

					field1424.method220(var5);
				}
			}

			if (var4 == 1071) {
				method500(253, var2, var5, var3);
			}

			if (var4 == 743) {
				field1458++;
				if (field1458 >= 124) {
					field1424.method218(173);
					field1424.method220(37954);
				}

				method500(98, var2, var5, var3);
			}

			if (var4 == 275) {
				class27 var9 = field1146[var5];
				if (var9 != null) {
					method488(field1073.field411[0], field1073.field410[0], 0, var9.field410[0], var9.field411[0], 0, false, 1, 1, 2, 0);
					field1410 = field24;
					field1411 = field25;
					field1413 = 2;
					field1412 = 0;
					field1424.method218(136);
					field1424.method220(var5);
					field1424.method220(field1238);
					field1424.method220(field1236);
					field1424.method220(field1237);
				}
			}

			if (var4 == 357) {
				method500(5, var2, var5, var3);
			}

			if (var4 == 829) {
				class26 var10 = field1455[var5];
				if (var10 != null) {
					method488(field1073.field411[0], field1073.field410[0], 0, var10.field410[0], var10.field411[0], 0, false, 1, 1, 2, 0);
					field1410 = field24;
					field1411 = field25;
					field1413 = 2;
					field1412 = 0;
					field1424.method218(120);
					field1424.method220(var5);
					field1424.method220(field1238);
					field1424.method220(field1236);
					field1424.method220(field1237);
				}
			}

			if (var4 == 274) {
				class4 var11 = class4.field56[var3];
				field1262 = 1;
				field1263 = var3;
				field1264 = var11.field116;
				field1235 = 0;
				field1261 = true;
				String var12 = var11.field114;
				if (var12.indexOf(" ") != -1) {
					var12 = var12.substring(0, var12.indexOf(" "));
				}

				String var13 = var11.field114;
				if (var13.indexOf(" ") != -1) {
					var13 = var13.substring(var13.indexOf(" ") + 1);
				}

				field1265 = var12 + " " + var11.field115 + " " + var13;

				if (field1264 == 16) {
					field1261 = true;
					field1208 = 3;
					field1314 = true;
				}
			} else {
				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var14 = field1254[arg0];
					int var15 = var14.indexOf("@whi@");
					if (var15 != -1) {
						long var16 = class51.method300(var14.substring(var15 + 5).trim());
						if (var4 == 605) {
							method455(var16);
						}

						if (var4 == 47) {
							method543(var16);
						}

						if (var4 == 513) {
							method477(var16);
						}

						if (var4 == 884) {
							method542(var16);
						}
					}
				}

				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 100) {
						field1424.method218(127);
					}

					if (var4 == 694) {
						field1424.method218(64);
					}

					if (var4 == 795) {
						field1424.method218(213);
					}

					if (var4 == 962) {
						field1424.method218(156);
					}

					if (var4 == 681) {
						field1303++;
						if (field1303 >= 116) {
							field1424.method218(152);
							field1424.method222(0xC6A439);
						}

						field1424.method218(254);
					}

					field1424.method220(var5);
					field1424.method220(var2);
					field1424.method220(var3);
					field1329 = 0;
					field1330 = var3;
					field1331 = var2;
					field1332 = 2;
					if (class4.field56[var3].field62 == field1311) {
						field1332 = 1;
					}

					if (class4.field56[var3].field62 == field1074) {
						field1332 = 3;
					}
				}

				if (var4 == 737) {
					method461();
				}

				if (var4 == 370) {
					boolean var18 = method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 0, 0, 2, 0);
					if (!var18) {
						method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 1, 1, 2, 0);
					}

					field1410 = field24;
					field1411 = field25;
					field1413 = 2;
					field1412 = 0;
					field1424.method218(195);
					field1424.method220(field1384 + var2);
					field1424.method220(field1385 + var3);
					field1424.method220(var5);
					field1424.method220(field1263);
				}

				if (var4 == 1381) {
					int var20 = var5 >> 14 & 0x7FFF;
					class57 var21 = class57.method330(var20);
					String var22;
					if (var21.field832 == null) {
						var22 = "It's a " + var21.field831 + ".";
					} else {
						var22 = new String(var21.field832);
					}

					method553(var22, 0, "");
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var23 = field1146[var5];
					if (var23 != null) {
						method488(field1073.field411[0], field1073.field410[0], 0, var23.field410[0], var23.field411[0], 0, false, 1, 1, 2, 0);
						field1410 = field24;
						field1411 = field25;
						field1413 = 2;
						field1412 = 0;

						if (var4 == 185) {
							field1424.method218(83);
						}

						if (var4 == 387) {
							field1169 += var5;
							if (field1169 >= 66) {
								field1424.method218(222);
								field1424.method219(154);
							}

							field1424.method218(241);
						}

						if (var4 == 499) {
							field1424.method218(40);
						}

						if (var4 == 639) {
							field1176++;
							if (field1176 >= 52) {
								field1424.method218(0);
								field1424.method219(131);
							}

							field1424.method218(10);
						}

						if (var4 == 27) {
							field1424.method218(17);
						}

						field1424.method220(var5);
					}
				}

				if (var4 == 721) {
					field1066 += var3;
					if (field1066 >= 139) {
						field1424.method218(202);
						field1424.method223(0);
					}

					method500(207, var2, var5, var3);
				}

				if (var4 == 997 && !field1471) {
					field1424.method218(223);
					field1424.method220(var3);
					field1471 = true;
				}

				if (var4 == 435) {
					field1424.method218(62);
					field1424.method220(var3);
					class4 var24 = class4.field56[var3];
					if (var24.field71 != null && var24.field71[0][0] == 5) {
						int var25 = var24.field71[0][1];
						field1241[var25] = 1 - field1241[var25];
						method474(var25);
						field1261 = true;
					}
				}

				if (var4 == 102) {
					field1235 = 1;
					field1236 = var2;
					field1237 = var3;
					field1238 = var5;
					field1239 = class60.method348(var5).field917;
					field1262 = 0;
					field1261 = true;
				} else {
					if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
						boolean var26 = method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 0, 0, 2, 0);
						if (!var26) {
							method488(field1073.field411[0], field1073.field410[0], 0, var2, var3, 0, false, 1, 1, 2, 0);
						}

						field1410 = field24;
						field1411 = field25;
						field1413 = 2;
						field1412 = 0;

						if (var4 == 139) {
							if ((var2 & 0x3) == 0) {
								field1112++;
							}

							if (field1112 >= 123) {
								field1424.method218(58);
								field1424.method223(0);
							}

							field1424.method218(27);
						}

						if (var4 == 617) {
							field1424.method218(60);
						}

						if (var4 == 662) {
							field1268 += field1385;
							if (field1268 >= 118) {
								field1424.method218(26);
								field1424.method223(0);
							}

							field1424.method218(211);
						}

						if (var4 == 224) {
							field1368 += var3;
							if (field1368 >= 75) {
								field1424.method218(41);
								field1424.method219(19);
							}

							field1424.method218(123);
						}

						if (var4 == 778) {
							field1424.method218(42);
						}

						field1424.method220(field1384 + var2);
						field1424.method220(field1385 + var3);
						field1424.method220(var5);
					}

					if (var4 == 524) {
						String var28 = field1254[arg0];
						int var29 = var28.indexOf("@whi@");
						if (var29 != -1) {
							if (field1311 == -1) {
								method461();
								field1219 = var28.substring(var29 + 5).trim();
								field1294 = false;

								for (int var30 = 0; var30 < class4.field56.length; var30++) {
									if (class4.field56[var30] != null && class4.field56[var30].field65 == 600) {
										field1118 = field1311 = class4.field56[var30].field62;
										break;
									}
								}
							} else {
								method553("Please close the interface you have open before using 'report abuse'", 0, "");
							}
						}
					}

					if (var4 == 902) {
						String var31 = field1254[arg0];
						int var32 = var31.indexOf("@whi@");
						if (var32 != -1) {
							long var33 = class51.method300(var31.substring(var32 + 5).trim());
							int var35 = -1;
							for (int var36 = 0; var36 < field1370; var36++) {
								if (field1068[var36] == var33) {
									var35 = var36;
									break;
								}
							}

							if (var35 != -1 && field1183[var35] > 0) {
								field1415 = true;
								field1306 = false;
								field1242 = true;
								field1438 = "";
								field1326 = 3;
								field1277 = field1068[var35];
								field1383 = "Enter message to send to " + field1281[var35];
							}
						}
					}

					if (var4 == 1152) {
						class60 var37 = class60.method348(var5);
						String var38;
						if (var37.field918 == null) {
							var38 = "It's a " + var37.field917 + ".";
						} else {
							var38 = new String(var37.field918);
						}

						method553(var38, 0, "");
					}

					if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
						if (var4 == 113) {
							field1424.method218(88);
						}

						if (var4 == 555) {
							field1424.method218(130);
						}

						if (var4 == 354) {
							field1424.method218(87);
						}

						if (var4 == 582) {
							if ((var5 & 0x3) == 0) {
								field1276++;
							}

							if (field1276 >= 133) {
								field1424.method218(203);
								field1424.method220(6118);
							}

							field1424.method218(198);
						}

						if (var4 == 331) {
							field1424.method218(125);
						}

						field1424.method220(var5);
						field1424.method220(var2);
						field1424.method220(var3);
						field1329 = 0;
						field1330 = var3;
						field1331 = var2;
						field1332 = 2;
						if (class4.field56[var3].field62 == field1311) {
							field1332 = 1;
						}

						if (class4.field56[var3].field62 == field1074) {
							field1332 = 3;
						}
					}

					if (var4 == 507 || var4 == 957) {
						String var39 = field1254[arg0];
						int var40 = var39.indexOf("@whi@");
						if (var40 != -1) {
							var39 = var39.substring(var40 + 5).trim();
							String var41 = class51.method304(class51.method301(class51.method300(var39)));
							boolean var42 = false;
							for (int var43 = 0; var43 < field1147; var43++) {
								class27 var44 = field1146[field1148[var43]];
								if (var44 != null && var44.field416 != null && var44.field416.equalsIgnoreCase(var41)) {
									method488(field1073.field411[0], field1073.field410[0], 0, var44.field410[0], var44.field411[0], 0, false, 1, 1, 2, 0);

									if (var4 == 507) {
										field1169 += var5;
										if (field1169 >= 66) {
											field1424.method218(222);
											field1424.method219(154);
										}

										field1424.method218(241);
									}

									if (var4 == 957) {
										field1176++;
										if (field1176 >= 52) {
											field1424.method218(0);
											field1424.method219(131);
										}

										field1424.method218(10);
									}

									field1424.method220(field1148[var43]);
									var42 = true;
									break;
								}
							}

							if (!var42) {
								method553("Unable to find " + var41, 0, "");
							}
						}
					}

					if (var4 == 718) {
						if (field1408) {
							field1184.method88(var2 - 4, var3 - 4);
						} else {
							field1184.method88(field24 - 4, field25 - 4);
						}
					}

					if (var4 == 131) {
						class27 var45 = field1146[var5];
						if (var45 != null) {
							method488(field1073.field411[0], field1073.field410[0], 0, var45.field410[0], var45.field411[0], 0, false, 1, 1, 2, 0);
							field1410 = field24;
							field1411 = field25;
							field1413 = 2;
							field1412 = 0;
							field1424.method218(97);
							field1424.method220(var5);
							field1424.method220(field1263);
						}
					}

					if (var4 == 625) {
						method500(238, var2, var5, var3);
					}

					if (var4 == 1714) {
						class26 var46 = field1455[var5];
						if (var46 != null) {
							class59 var47 = var46.field415;
							if (var47.field905 != null) {
								var47 = var47.method345();
							}

							if (var47 != null) {
								String var48;
								if (var47.field881 == null) {
									var48 = "It's a " + var47.field880 + ".";
								} else {
									var48 = new String(var47.field881);
								}

								method553(var48, 0, "");
							}
						}
					}

					if (var4 == 225) {
						field1424.method218(62);
						field1424.method220(var3);
						class4 var49 = class4.field56[var3];
						if (var49.field71 != null && var49.field71[0][0] == 5) {
							int var50 = var49.field71[0][1];
							if (field1241[var50] != var49.field73[0]) {
								field1241[var50] = var49.field73[0];
								method474(var50);
								field1261 = true;
							}
						}
					}

					if (var4 == 231) {
						class4 var51 = class4.field56[var3];
						boolean var52 = true;
						if (var51.field65 > 0) {
							var52 = method437(var51);
						}

						if (var52) {
							field1424.method218(62);
							field1424.method220(var3);
						}
					}

					if (var4 == 563) {
						field1424.method218(199);
						field1424.method220(var5);
						field1424.method220(var2);
						field1424.method220(var3);
						field1424.method220(field1263);
						field1329 = 0;
						field1330 = var3;
						field1331 = var2;
						field1332 = 2;
						if (class4.field56[var3].field62 == field1311) {
							field1332 = 1;
						}

						if (class4.field56[var3].field62 == field1074) {
							field1332 = 3;
						}
					}

					if (var4 == 240) {
						class26 var53 = field1455[var5];
						if (var53 != null) {
							method488(field1073.field411[0], field1073.field410[0], 0, var53.field410[0], var53.field411[0], 0, false, 1, 1, 2, 0);
							field1410 = field24;
							field1411 = field25;
							field1413 = 2;
							field1412 = 0;
							field1424.method218(100);
							field1424.method220(var5);
							field1424.method220(field1263);
						}
					}

					if (var4 == 1328) {
						class60 var54 = class60.method348(var5);
						class4 var55 = class4.field56[var3];
						String var56;
						if (var55 != null && var55.field58[var2] >= 100000) {
							var56 = var55.field58[var2] + " x " + var54.field917;
						} else if (var54.field918 == null) {
							var56 = "It's a " + var54.field917 + ".";
						} else {
							var56 = new String(var54.field918);
						}

						method553(var56, 0, "");
					}

					if (var4 == 899 && method500(124, var2, var5, var3)) {
						field1424.method220(field1263);
					}

					field1235 = 0;
					field1262 = 0;
					field1261 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.d(IILlb;)V")
	public final void method556(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1456) {
			for (int var4 = var3; var4 < field1456; var4++) {
				field1215[field1214++] = field1457[var4];
			}
		}

		if (var3 > field1456) {
			signlink.reporterror(field1292 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1456 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1457[var5];
			class26 var7 = field1455[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1457[field1456++] = var6;
				var7.field405 = field1143;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1457[field1456++] = var6;
					var7.field405 = field1143;
					field1150[field1149++] = var6;
				} else if (var9 == 1) {
					field1457[field1456++] = var6;
					var7.field405 = field1143;
					int var10 = arg1.method240(3);
					var7.method111(var10, false);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1150[field1149++] = var6;
					}
				} else if (var9 == 2) {
					field1457[field1456++] = var6;
					var7.field405 = field1143;
					int var12 = arg1.method240(3);
					var7.method111(var12, true);
					int var13 = arg1.method240(3);
					var7.method111(var13, true);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1150[field1149++] = var6;
					}
				} else if (var9 == 3) {
					field1215[field1214++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method557(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1370; var2++) {
			if (arg0.equalsIgnoreCase(field1281[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1073.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method558() {
		if (field1240 == 2) {
			method483((field1087 - field1384 << 7) + field1090, field1089 * 2, (field1088 - field1385 << 7) + field1091);

			if (field1444 > -1 && field1143 % 20 < 10) {
				field1315[2].method186(field1444 - 12, field1445 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(IZIIIIIIII)V")
	public final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1218.method248(); var11 != null; var11 = (class40) field1218.method250()) {
			if (var11.field638 == arg7 && var11.field640 == arg4 && var11.field641 == arg0 && var11.field639 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg7;
			var10.field639 = arg6;
			var10.field640 = arg4;
			var10.field641 = arg0;
			method503(var10);
			field1218.method245(var10);
		}

		var10.field645 = arg1;
		var10.field647 = arg5;
		var10.field646 = arg8;
		var10.field648 = arg3;
		var10.field649 = arg2;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method560() {
		field1372 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1221[var1] = -1;
			for (int var2 = 0; var2 < class64.field977; var2++) {
				if (!class64.field978[var2].field984 && class64.field978[var2].field979 == var1 + (field1114 ? 0 : 7)) {
					field1221[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method561() {
		field1164.method258();
		class34.field584 = field1376;
		field1193.method199(0, 0);

		if (field1158 != -1) {
			method522(0, 0, class4.field56[field1158], 0);
		} else if (field1366[field1208] != -1) {
			method522(0, 0, class4.field56[field1366[field1208]], 0);
		}

		if (field1408 && field1171 == 1) {
			method506();
		}

		field1164.method259(553, field9, 205);
		field1166.method258();
		class34.field584 = field1377;
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method562() {
		try {
			if (field1425 != null) {
				field1425.method38();
			}
		} catch (Exception var2) {
		}

		field1425 = null;
		field1429 = false;
		field1344 = 0;
		field1292 = "";
		field1293 = "";
		method514();
		field1184.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1209[var1].method359();
		}

		System.gc();
		method521();
		field1298 = -1;
		field1283 = -1;
		field1142 = 0;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1247[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1253[var3] = var2 / 4;
		}
	}
}
