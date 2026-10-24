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
	public int field1076;

	@ObfuscatedName("client.bb")
	public class48[] field1077 = new class48[5];

	@ObfuscatedName("client.cb")
	public int field1078;

	@ObfuscatedName("client.db")
	public int[] field1079 = new int[9];

	@ObfuscatedName("client.eb")
	public static int field1080;

	@ObfuscatedName("client.fb")
	public int[] field1081 = new int[151];

	@ObfuscatedName("client.hb")
	public class4 field1082 = new class4();

	@ObfuscatedName("client.ib")
	public byte[][][] field1083;

	@ObfuscatedName("client.jb")
	public int field1084;

	@ObfuscatedName("client.kb")
	public int field1085;

	@ObfuscatedName("client.lb")
	public boolean field1086 = true;

	@ObfuscatedName("client.pb")
	public int[] field1087 = new int[500];

	@ObfuscatedName("client.qb")
	public int[] field1088 = new int[500];

	@ObfuscatedName("client.rb")
	public int[] field1089 = new int[500];

	@ObfuscatedName("client.sb")
	public int[] field1090 = new int[500];

	@ObfuscatedName("client.wb")
	public int field1091;

	@ObfuscatedName("client.xb")
	public int field1092;

	@ObfuscatedName("client.yb")
	public int field1093;

	@ObfuscatedName("client.zb")
	public int field1094;

	@ObfuscatedName("client.ac")
	public int field1118;

	@ObfuscatedName("client.bc")
	public int field1119;

	@ObfuscatedName("client.cc")
	public class35 field1120;

	@ObfuscatedName("client.dc")
	public class35 field1121;

	@ObfuscatedName("client.ec")
	public int field1122;

	@ObfuscatedName("client.fc")
	public class41[][][] field1123 = new class41[4][104][104];

	@ObfuscatedName("client.gc")
	public int[] field1124 = new int[5];

	@ObfuscatedName("client.hc")
	public static int field1125;

	@ObfuscatedName("client.ic")
	public static int field1126 = 10;

	@ObfuscatedName("client.jc")
	public static int field1127;

	@ObfuscatedName("client.kc")
	public static boolean field1128 = true;

	@ObfuscatedName("client.lc")
	public static boolean field1129;

	@ObfuscatedName("client.mc")
	public class36[] field1130 = new class36[2];

	@ObfuscatedName("client.nc")
	public long field1131;

	@ObfuscatedName("client.pc")
	public static int field1132;

	@ObfuscatedName("client.qc")
	public int[][][] field1133;

	@ObfuscatedName("client.sc")
	public int field1134 = 0x766654;

	@ObfuscatedName("client.N")
	public int[] field1063 = new int[100];

	@ObfuscatedName("client.O")
	public String[] field1064 = new String[100];

	@ObfuscatedName("client.P")
	public String[] field1065 = new String[100];

	@ObfuscatedName("client.Q")
	public int field1066 = -1;

	@ObfuscatedName("client.Z")
	public int field1075 = 2;

	@ObfuscatedName("client.Bb")
	public int field1096 = -1;

	@ObfuscatedName("client.Xb")
	public String[] field1115 = new String[500];

	@ObfuscatedName("client.Yb")
	public int field1116 = 128;

	@ObfuscatedName("client.vc")
	public int field1137 = 2;

	@ObfuscatedName("client.Cc")
	public int field1144 = 1;

	@ObfuscatedName("client.Ic")
	public int[] field1150 = new int[50];

	@ObfuscatedName("client.Wc")
	public class41 field1164 = new class41();

	@ObfuscatedName("client.Xc")
	public String field1165 = "";

	@ObfuscatedName("client.Yc")
	public String field1166 = "";

	@ObfuscatedName("client.ad")
	public boolean field1168 = false;

	@ObfuscatedName("client.bd")
	public boolean field1169 = false;

	@ObfuscatedName("client.cd")
	public boolean field1170 = false;

	@ObfuscatedName("client.hd")
	public boolean field1174 = false;

	@ObfuscatedName("client.nd")
	public int field1179 = -1;

	@ObfuscatedName("client.pd")
	public int field1181 = -1;

	@ObfuscatedName("client.qd")
	public int[] field1182 = new int[50];

	@ObfuscatedName("client.rd")
	public boolean[] field1183 = new boolean[5];

	@ObfuscatedName("client.sd")
	public class36[] field1184 = new class36[13];

	@ObfuscatedName("client.ud")
	public byte[] field1186 = new byte[16384];

	@ObfuscatedName("client.wd")
	public int[] field1188 = new int[class67.field1012];

	@ObfuscatedName("client.yd")
	public int[] field1190 = new int[2000];

	@ObfuscatedName("client.zd")
	public int[] field1191 = new int[256];

	@ObfuscatedName("client.Ad")
	public String field1192 = "";

	@ObfuscatedName("client.Bd")
	public class35[] field1193 = new class35[1000];

	@ObfuscatedName("client.Cd")
	public int[] field1194 = new int[class67.field1012];

	@ObfuscatedName("client.Dd")
	public class26[] field1195 = new class26[16384];

	@ObfuscatedName("client.Fd")
	public int[] field1197 = new int[16384];

	@ObfuscatedName("client.Hd")
	public int[] field1199 = new int[50];

	@ObfuscatedName("client.Jd")
	public boolean field1200 = true;

	@ObfuscatedName("client.Kd")
	public boolean field1201 = false;

	@ObfuscatedName("client.Ld")
	public int[] field1202 = new int[class67.field1012];

	@ObfuscatedName("client.Md")
	public class35[] field1203 = new class35[100];

	@ObfuscatedName("client.Qd")
	public boolean field1205 = false;

	@ObfuscatedName("client.Td")
	public class38 field1208 = class38.method217(1);

	@ObfuscatedName("client.Ud")
	public boolean field1209 = false;

	@ObfuscatedName("client.Xd")
	public class36[] field1212 = new class36[100];

	@ObfuscatedName("client.Yd")
	public int[][] field1213 = new int[104][104];

	@ObfuscatedName("client.fe")
	public boolean field1219 = false;

	@ObfuscatedName("client.le")
	public String field1225 = "";

	@ObfuscatedName("client.me")
	public String field1226 = "";

	@ObfuscatedName("client.re")
	public class35[] field1231 = new class35[20];

	@ObfuscatedName("client.Ce")
	public String field1241 = "";

	@ObfuscatedName("client.De")
	public class38 field1242 = class38.method217(1);

	@ObfuscatedName("client.Fe")
	public boolean field1243 = false;

	@ObfuscatedName("client.Ge")
	public boolean field1244 = true;

	@ObfuscatedName("client.Re")
	public class35[] field1255 = new class35[20];

	@ObfuscatedName("client.Se")
	public int[] field1256 = new int[5];

	@ObfuscatedName("client.Xe")
	public boolean field1261 = false;

	@ObfuscatedName("client.Ye")
	public int field1262 = -1;

	@ObfuscatedName("client.bf")
	public int field1265 = 50;

	@ObfuscatedName("client.cf")
	public int[] field1266 = new int[field1265];

	@ObfuscatedName("client.df")
	public int[] field1267 = new int[field1265];

	@ObfuscatedName("client.ef")
	public int[] field1268 = new int[field1265];

	@ObfuscatedName("client.ff")
	public int[] field1269 = new int[field1265];

	@ObfuscatedName("client.gf")
	public int[] field1270 = new int[field1265];

	@ObfuscatedName("client.hf")
	public int[] field1271 = new int[field1265];

	@ObfuscatedName("client.jf")
	public int[] field1272 = new int[field1265];

	@ObfuscatedName("client.kf")
	public String[] field1273 = new String[field1265];

	@ObfuscatedName("client.pf")
	public int[] field1278 = new int[5];

	@ObfuscatedName("client.sf")
	public int field1281 = 3;

	@ObfuscatedName("client.yf")
	public int field1287 = -1;

	@ObfuscatedName("client.Ef")
	public int field1293 = -1;

	@ObfuscatedName("client.Gf")
	public boolean field1295 = false;

	@ObfuscatedName("client.Jf")
	public int[] field1297 = new int[1000];

	@ObfuscatedName("client.Mf")
	public boolean field1299 = false;

	@ObfuscatedName("client.Vf")
	public boolean field1307 = false;

	@ObfuscatedName("client.Xf")
	public boolean field1309 = false;

	@ObfuscatedName("client.eg")
	public int field1315 = -1;

	@ObfuscatedName("client.fg")
	public int field1316 = 2048;

	@ObfuscatedName("client.gg")
	public int field1317 = 2047;

	@ObfuscatedName("client.hg")
	public class27[] field1318 = new class27[field1316];

	@ObfuscatedName("client.jg")
	public int[] field1320 = new int[field1316];

	@ObfuscatedName("client.lg")
	public int[] field1322 = new int[field1316];

	@ObfuscatedName("client.mg")
	public class38[] field1323 = new class38[field1316];

	@ObfuscatedName("client.ng")
	public final int[] field1324 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.pg")
	public class41 field1326 = new class41();

	@ObfuscatedName("client.qg")
	public int field1327 = -1;

	@ObfuscatedName("client.rg")
	public int field1328 = -1;

	@ObfuscatedName("client.sg")
	public int[][] field1329 = new int[104][104];

	@ObfuscatedName("client.tg")
	public int[] field1330 = new int[200];

	@ObfuscatedName("client.Ag")
	public boolean field1337 = true;

	@ObfuscatedName("client.Bg")
	public int field1338 = 78;

	@ObfuscatedName("client.Cg")
	public boolean field1339 = false;

	@ObfuscatedName("client.Hg")
	public String[] field1343 = new String[5];

	@ObfuscatedName("client.Ig")
	public boolean[] field1344 = new boolean[5];

	@ObfuscatedName("client.Qg")
	public int[] field1351 = new int[33];

	@ObfuscatedName("client.Rg")
	public int field1352 = -1;

	@ObfuscatedName("client.Sg")
	public String field1353 = "";

	@ObfuscatedName("client.Tg")
	public int[] field1354 = new int[5];

	@ObfuscatedName("client.Wg")
	public int field1356 = -1;

	@ObfuscatedName("client.Xg")
	public boolean field1357 = false;

	@ObfuscatedName("client.eh")
	public int field1364 = 0x332D25;

	@ObfuscatedName("client.fh")
	public CRC32 field1365 = new CRC32();

	@ObfuscatedName("client.ih")
	public long[] field1368 = new long[100];

	@ObfuscatedName("client.jh")
	public int[][] field1369 = new int[104][104];

	@ObfuscatedName("client.lh")
	public boolean field1371 = false;

	@ObfuscatedName("client.nh")
	public int field1373 = 2;

	@ObfuscatedName("client.oh")
	public int[] field1374 = new int[151];

	@ObfuscatedName("client.vh")
	public boolean field1381 = false;

	@ObfuscatedName("client.yh")
	public String field1383 = "";

	@ObfuscatedName("client.Ah")
	public int[] field1385 = new int[1000];

	@ObfuscatedName("client.Bh")
	public int[] field1386 = new int[1000];

	@ObfuscatedName("client.Ch")
	public boolean field1387 = false;

	@ObfuscatedName("client.Dh")
	public boolean field1388 = false;

	@ObfuscatedName("client.Rh")
	public int field1399 = 0x4D4233;

	@ObfuscatedName("client.Th")
	public boolean field1401 = false;

	@ObfuscatedName("client.Uh")
	public int field1402 = -1;

	@ObfuscatedName("client.Wh")
	public boolean field1404 = false;

	@ObfuscatedName("client.Xh")
	public int[] field1405 = new int[33];

	@ObfuscatedName("client.Yh")
	public class35[] field1406 = new class35[8];

	@ObfuscatedName("client.ci")
	public class62[] field1410 = new class62[4];

	@ObfuscatedName("client.fi")
	public int field1413 = 0x23201B;

	@ObfuscatedName("client.ki")
	public long[] field1418 = new long[200];

	@ObfuscatedName("client.li")
	public boolean field1419 = false;

	@ObfuscatedName("client.mi")
	public class41 field1420 = new class41();

	@ObfuscatedName("client.qi")
	public boolean field1424 = false;

	@ObfuscatedName("client.yi")
	public String field1432 = "";

	@ObfuscatedName("client.Ei")
	public final int field1438 = 100;

	@ObfuscatedName("client.Fi")
	public int[] field1439 = new int[100];

	@ObfuscatedName("client.Hi")
	public class38 field1441 = class38.method217(1);

	@ObfuscatedName("client.Ki")
	public int[] field1443 = new int[7];

	@ObfuscatedName("client.Ri")
	public int[] field1450 = new int[5];

	@ObfuscatedName("client.Vi")
	public String[] field1453 = new String[200];

	@ObfuscatedName("client.Yi")
	public int[] field1456 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.ej")
	public int[] field1461 = new int[4000];

	@ObfuscatedName("client.fj")
	public int[] field1462 = new int[4000];

	@ObfuscatedName("client.ij")
	public int field1465 = 1;

	@ObfuscatedName("client.jj")
	public int[] field1466 = new int[2000];

	@ObfuscatedName("client.lj")
	public boolean field1468 = false;

	@ObfuscatedName("client.nj")
	public int field1470 = -1;

	@ObfuscatedName("client.vj")
	public int[] field1476 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.zj")
	public boolean field1480 = true;

	@ObfuscatedName("client.M")
	public static String field1062 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Hc")
	public static final int[] field1149 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.od")
	public static int[] field1180 = new int[32];

	@ObfuscatedName("client.Ze")
	public static BigInteger field1263 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.tf")
	public static final int[][] field1282 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.og")
	public static int[] field1325 = new int[99];

	@ObfuscatedName("client.ch")
	public static BigInteger field1362 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.K")
	public int field1060;

	@ObfuscatedName("client.L")
	public static int field1061;

	@ObfuscatedName("client.R")
	public int field1067;

	@ObfuscatedName("client.S")
	public int field1068;

	@ObfuscatedName("client.T")
	public int field1069;

	@ObfuscatedName("client.U")
	public int field1070;

	@ObfuscatedName("client.V")
	public int field1071;

	@ObfuscatedName("client.W")
	public int field1072;

	@ObfuscatedName("client.X")
	public int field1073;

	@ObfuscatedName("client.Y")
	public int field1074;

	@ObfuscatedName("client.Ab")
	public int field1095;

	@ObfuscatedName("client.Hb")
	public int field1100;

	@ObfuscatedName("client.Ib")
	public int field1101;

	@ObfuscatedName("client.Jb")
	public int field1102;

	@ObfuscatedName("client.Mb")
	public static int field1104;

	@ObfuscatedName("client.Wb")
	public static int field1114;

	@ObfuscatedName("client.Zb")
	public int field1117;

	@ObfuscatedName("client.tc")
	public int field1135;

	@ObfuscatedName("client.uc")
	public int field1136;

	@ObfuscatedName("client.wc")
	public int field1138;

	@ObfuscatedName("client.xc")
	public int field1139;

	@ObfuscatedName("client.yc")
	public int field1140;

	@ObfuscatedName("client.zc")
	public int field1141;

	@ObfuscatedName("client.Ac")
	public int field1142;

	@ObfuscatedName("client.Bc")
	public int field1143;

	@ObfuscatedName("client.Dc")
	public int field1145;

	@ObfuscatedName("client.Ec")
	public int field1146;

	@ObfuscatedName("client.Fc")
	public int field1147;

	@ObfuscatedName("client.Vc")
	public int field1163;

	@ObfuscatedName("client.Zc")
	public int field1167;

	@ObfuscatedName("client.jd")
	public static int field1175;

	@ObfuscatedName("client.kd")
	public int field1176;

	@ObfuscatedName("client.ld")
	public int field1177;

	@ObfuscatedName("client.md")
	public int field1178;

	@ObfuscatedName("client.td")
	public int field1185;

	@ObfuscatedName("client.vd")
	public int field1187;

	@ObfuscatedName("client.xd")
	public int field1189;

	@ObfuscatedName("client.Ed")
	public int field1196;

	@ObfuscatedName("client.Nd")
	public static int field1204;

	@ObfuscatedName("client.Rd")
	public int field1206;

	@ObfuscatedName("client.Sd")
	public static int field1207;

	@ObfuscatedName("client.Vd")
	public int field1210;

	@ObfuscatedName("client.Wd")
	public int field1211;

	@ObfuscatedName("client.Zd")
	public int field1214;

	@ObfuscatedName("client.ae")
	public int field1215;

	@ObfuscatedName("client.be")
	public int field1216;

	@ObfuscatedName("client.ce")
	public int field1217;

	@ObfuscatedName("client.de")
	public int field1218;

	@ObfuscatedName("client.ge")
	public int field1220;

	@ObfuscatedName("client.ke")
	public int field1224;

	@ObfuscatedName("client.we")
	public int field1235;

	@ObfuscatedName("client.xe")
	public int field1236;

	@ObfuscatedName("client.ye")
	public int field1237;

	@ObfuscatedName("client.ze")
	public int field1238;

	@ObfuscatedName("client.Ae")
	public int field1239;

	@ObfuscatedName("client.Be")
	public int field1240;

	@ObfuscatedName("client.Ie")
	public static int field1246;

	@ObfuscatedName("client.Je")
	public int field1247;

	@ObfuscatedName("client.Ke")
	public static int field1248;

	@ObfuscatedName("client.Qe")
	public int field1254;

	@ObfuscatedName("client.Te")
	public int field1257;

	@ObfuscatedName("client.Ue")
	public int field1258;

	@ObfuscatedName("client.Ve")
	public int field1259;

	@ObfuscatedName("client.We")
	public int field1260;

	@ObfuscatedName("client.af")
	public int field1264;

	@ObfuscatedName("client.qf")
	public int field1279;

	@ObfuscatedName("client.rf")
	public int field1280;

	@ObfuscatedName("client.uf")
	public static int field1283;

	@ObfuscatedName("client.vf")
	public int field1284;

	@ObfuscatedName("client.wf")
	public int field1285;

	@ObfuscatedName("client.xf")
	public int field1286;

	@ObfuscatedName("client.zf")
	public int field1288;

	@ObfuscatedName("client.Af")
	public int field1289;

	@ObfuscatedName("client.Bf")
	public int field1290;

	@ObfuscatedName("client.Cf")
	public int field1291;

	@ObfuscatedName("client.Ff")
	public int field1294;

	@ObfuscatedName("client.If")
	public int field1296;

	@ObfuscatedName("client.Lf")
	public int field1298;

	@ObfuscatedName("client.Of")
	public int field1300;

	@ObfuscatedName("client.Pf")
	public int field1301;

	@ObfuscatedName("client.Qf")
	public int field1302;

	@ObfuscatedName("client.Rf")
	public int field1303;

	@ObfuscatedName("client.Sf")
	public int field1304;

	@ObfuscatedName("client.Uf")
	public int field1306;

	@ObfuscatedName("client.Yf")
	public static int field1310;

	@ObfuscatedName("client.ag")
	public int field1311;

	@ObfuscatedName("client.bg")
	public int field1312;

	@ObfuscatedName("client.cg")
	public int field1313;

	@ObfuscatedName("client.dg")
	public int field1314;

	@ObfuscatedName("client.ig")
	public int field1319;

	@ObfuscatedName("client.kg")
	public int field1321;

	@ObfuscatedName("client.ug")
	public int field1331;

	@ObfuscatedName("client.vg")
	public int field1332;

	@ObfuscatedName("client.wg")
	public int field1333;

	@ObfuscatedName("client.xg")
	public int field1334;

	@ObfuscatedName("client.yg")
	public int field1335;

	@ObfuscatedName("client.zg")
	public int field1336;

	@ObfuscatedName("client.Eg")
	public int field1340;

	@ObfuscatedName("client.Fg")
	public int field1341;

	@ObfuscatedName("client.Lg")
	public int field1346;

	@ObfuscatedName("client.Mg")
	public int field1347;

	@ObfuscatedName("client.Ng")
	public int field1348;

	@ObfuscatedName("client.Og")
	public int field1349;

	@ObfuscatedName("client.Pg")
	public int field1350;

	@ObfuscatedName("client.Vg")
	public int field1355;

	@ObfuscatedName("client.Zg")
	public static int field1359;

	@ObfuscatedName("client.dh")
	public static int field1363;

	@ObfuscatedName("client.gh")
	public int field1366;

	@ObfuscatedName("client.kh")
	public int field1370;

	@ObfuscatedName("client.mh")
	public int field1372;

	@ObfuscatedName("client.ph")
	public int field1375;

	@ObfuscatedName("client.qh")
	public int field1376;

	@ObfuscatedName("client.rh")
	public int field1377;

	@ObfuscatedName("client.sh")
	public int field1378;

	@ObfuscatedName("client.th")
	public int field1379;

	@ObfuscatedName("client.uh")
	public int field1380;

	@ObfuscatedName("client.xh")
	public int field1382;

	@ObfuscatedName("client.zh")
	public int field1384;

	@ObfuscatedName("client.Fh")
	public int field1389;

	@ObfuscatedName("client.Gh")
	public int field1390;

	@ObfuscatedName("client.Kh")
	public int field1393;

	@ObfuscatedName("client.Mh")
	public static int field1394;

	@ObfuscatedName("client.Nh")
	public int field1395;

	@ObfuscatedName("client.Zh")
	public int field1407;

	@ObfuscatedName("client.ai")
	public int field1408;

	@ObfuscatedName("client.bi")
	public int field1409;

	@ObfuscatedName("client.di")
	public int field1411;

	@ObfuscatedName("client.gi")
	public int field1414;

	@ObfuscatedName("client.oi")
	public int field1422;

	@ObfuscatedName("client.pi")
	public int field1423;

	@ObfuscatedName("client.ri")
	public int field1425;

	@ObfuscatedName("client.si")
	public int field1426;

	@ObfuscatedName("client.ti")
	public int field1427;

	@ObfuscatedName("client.ui")
	public int field1428;

	@ObfuscatedName("client.vi")
	public int field1429;

	@ObfuscatedName("client.wi")
	public int field1430;

	@ObfuscatedName("client.Di")
	public int field1437;

	@ObfuscatedName("client.Gi")
	public static int field1440;

	@ObfuscatedName("client.Si")
	public int field1451;

	@ObfuscatedName("client.Xi")
	public int field1455;

	@ObfuscatedName("client.gj")
	public int field1463;

	@ObfuscatedName("client.hj")
	public int field1464;

	@ObfuscatedName("client.kj")
	public int field1467;

	@ObfuscatedName("client.mj")
	public int field1469;

	@ObfuscatedName("client.yj")
	public static int field1479;

	@ObfuscatedName("client.Df")
	public long field1292;

	@ObfuscatedName("client.Yg")
	public long field1358;

	@ObfuscatedName("client.Sh")
	public long field1400;

	@ObfuscatedName("client.Ii")
	public long field1442;

	@ObfuscatedName("client.Vh")
	public class18 field1403;

	@ObfuscatedName("client.Jg")
	public static class27 field1345;

	@ObfuscatedName("client.ne")
	public class35 field1227;

	@ObfuscatedName("client.oe")
	public class35 field1228;

	@ObfuscatedName("client.se")
	public class35 field1232;

	@ObfuscatedName("client.te")
	public class35 field1233;

	@ObfuscatedName("client.Wf")
	public class35 field1308;

	@ObfuscatedName("client.Hh")
	public class35 field1391;

	@ObfuscatedName("client.Li")
	public class35 field1444;

	@ObfuscatedName("client.Mi")
	public class35 field1445;

	@ObfuscatedName("client.Ni")
	public class35 field1446;

	@ObfuscatedName("client.Oi")
	public class35 field1447;

	@ObfuscatedName("client.Wi")
	public class35 field1454;

	@ObfuscatedName("client.Jc")
	public class36 field1151;

	@ObfuscatedName("client.Kc")
	public class36 field1152;

	@ObfuscatedName("client.Lc")
	public class36 field1153;

	@ObfuscatedName("client.ed")
	public class36 field1171;

	@ObfuscatedName("client.fd")
	public class36 field1172;

	@ObfuscatedName("client.gd")
	public class36 field1173;

	@ObfuscatedName("client.Le")
	public class36 field1249;

	@ObfuscatedName("client.Me")
	public class36 field1250;

	@ObfuscatedName("client.Ne")
	public class36 field1251;

	@ObfuscatedName("client.Oe")
	public class36 field1252;

	@ObfuscatedName("client.Pe")
	public class36 field1253;

	@ObfuscatedName("client.Pi")
	public class36 field1448;

	@ObfuscatedName("client.Qi")
	public class36 field1449;

	@ObfuscatedName("client.qj")
	public class36 field1471;

	@ObfuscatedName("client.rj")
	public class36 field1472;

	@ObfuscatedName("client.sj")
	public class36 field1473;

	@ObfuscatedName("client.tj")
	public class36 field1474;

	@ObfuscatedName("client.uj")
	public class36 field1475;

	@ObfuscatedName("client.wj")
	public class36 field1477;

	@ObfuscatedName("client.xj")
	public class36 field1478;

	@ObfuscatedName("client.lf")
	public class37 field1274;

	@ObfuscatedName("client.mf")
	public class37 field1275;

	@ObfuscatedName("client.nf")
	public class37 field1276;

	@ObfuscatedName("client.of")
	public class37 field1277;

	@ObfuscatedName("client.Nb")
	public class43 field1105;

	@ObfuscatedName("client.Ob")
	public class43 field1106;

	@ObfuscatedName("client.Pb")
	public class43 field1107;

	@ObfuscatedName("client.Qb")
	public class43 field1108;

	@ObfuscatedName("client.Rb")
	public class43 field1109;

	@ObfuscatedName("client.Sb")
	public class43 field1110;

	@ObfuscatedName("client.Tb")
	public class43 field1111;

	@ObfuscatedName("client.Ub")
	public class43 field1112;

	@ObfuscatedName("client.Vb")
	public class43 field1113;

	@ObfuscatedName("client.Mc")
	public class43 field1154;

	@ObfuscatedName("client.Nc")
	public class43 field1155;

	@ObfuscatedName("client.Oc")
	public class43 field1156;

	@ObfuscatedName("client.Pc")
	public class43 field1157;

	@ObfuscatedName("client.Qc")
	public class43 field1158;

	@ObfuscatedName("client.Rc")
	public class43 field1159;

	@ObfuscatedName("client.Sc")
	public class43 field1160;

	@ObfuscatedName("client.Tc")
	public class43 field1161;

	@ObfuscatedName("client.Uc")
	public class43 field1162;

	@ObfuscatedName("client.Oh")
	public class43 field1396;

	@ObfuscatedName("client.Ph")
	public class43 field1397;

	@ObfuscatedName("client.Qh")
	public class43 field1398;

	@ObfuscatedName("client.zi")
	public class43 field1433;

	@ObfuscatedName("client.Ai")
	public class43 field1434;

	@ObfuscatedName("client.Bi")
	public class43 field1435;

	@ObfuscatedName("client.Ci")
	public class43 field1436;

	@ObfuscatedName("client.hh")
	public class47 field1367;

	@ObfuscatedName("client.ue")
	public class49 field1234;

	@ObfuscatedName("client.Cb")
	public class50 field1097;

	@ObfuscatedName("client.Ti")
	public class58 field1452;

	@ObfuscatedName("client.Fb")
	public class5 field1099;

	@ObfuscatedName("client.Gc")
	public String field1148;

	@ObfuscatedName("client.Gd")
	public String field1198;

	@ObfuscatedName("client.Gg")
	public String field1342;

	@ObfuscatedName("client.xi")
	public String field1431;

	@ObfuscatedName("client.ni")
	public Socket field1421;

	@ObfuscatedName("client.Kb")
	public static boolean field1103;

	@ObfuscatedName("client.Tf")
	public static boolean field1305;

	@ObfuscatedName("client.ei")
	public static boolean field1412;

	@ObfuscatedName("client.he")
	public int[] field1221;

	@ObfuscatedName("client.ie")
	public int[] field1222;

	@ObfuscatedName("client.je")
	public int[] field1223;

	@ObfuscatedName("client.pe")
	public int[] field1229;

	@ObfuscatedName("client.qe")
	public int[] field1230;

	@ObfuscatedName("client.ah")
	public int[] field1360;

	@ObfuscatedName("client.bh")
	public int[] field1361;

	@ObfuscatedName("client.hi")
	public int[] field1415;

	@ObfuscatedName("client.ii")
	public int[] field1416;

	@ObfuscatedName("client.ji")
	public int[] field1417;

	@ObfuscatedName("client.Zi")
	public int[] field1457;

	@ObfuscatedName("client.aj")
	public int[] field1458;

	@ObfuscatedName("client.bj")
	public int[] field1459;

	@ObfuscatedName("client.cj")
	public int[] field1460;

	@ObfuscatedName("client.He")
	public class36[] field1245;

	@ObfuscatedName("client.Db")
	public byte[][] field1098;

	@ObfuscatedName("client.Ih")
	public byte[][] field1392;

	@ObfuscatedName("client.b(B)V")
	public final void method429() {
		if (field1185 != 0) {
			class37 var1 = field1275;
			int var2 = 0;
			if (field1423 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1065[var3] != null) {
					int var4 = field1063[var3];
					String var5 = field1064[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1426 == 0 || field1426 == 1 && method437(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206("From", 0, var8, var7);
						var1.method206("From", 0xFFFF, var8, var7 - 1);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1130[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1130[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var5 + ": " + field1065[var3], 0, var11, var7);
						var1.method206(var5 + ": " + field1065[var3], 0xFFFF, var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1426 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(field1065[var3], 0, 4, var9);
						var1.method206(field1065[var3], 0xFFFF, 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1426 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206("To " + var5 + ": " + field1065[var3], 0, 4, var10);
						var1.method206("To " + var5 + ": " + field1065[var3], 0xFFFF, 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method430() {
		field1448 = new class36(field1097, "titlebox", 0);
		field1449 = new class36(field1097, "titlebutton", 0);
		field1245 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1245[var2] = new class36(field1097, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1245[var3] = new class36(field1097, "runes", (var3 & 0x3) + 12);
			}
		}

		field1120 = new class35(128, 265);
		field1121 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1120.field596[var4] = field1108.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1121.field596[var5] = field1109.field654[var5];
		}

		field1458 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1458[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1458[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1458[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1458[var9 + 192] = 0xFFFFFF;
		}

		field1459 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1459[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1459[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1459[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1459[var13 + 192] = 0xFFFFFF;
		}

		field1460 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1460[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1460[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1460[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1460[var17 + 192] = 0xFFFFFF;
		}

		field1457 = new int[256];
		field1360 = new int[32768];
		field1361 = new int[32768];
		method505(null);
		field1229 = new int[32768];
		field1230 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1371) {
			field1468 = true;
			field1371 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method431() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1167 = (field1167 + 1) % 4;
				field1357 = true;
				field1381 = true;
				field1242.method218(158);
				field1242.method219(field1167);
				field1242.method219(field1426);
				field1242.method219(field1285);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1426 = (field1426 + 1) % 3;
				field1357 = true;
				field1381 = true;
				field1242.method218(158);
				field1242.method219(field1167);
				field1242.method219(field1426);
				field1242.method219(field1285);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1285 = (field1285 + 1) % 3;
				field1357 = true;
				field1381 = true;
				field1242.method218(158);
				field1242.method219(field1167);
				field1242.method219(field1426);
				field1242.method219(field1285);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1066 == -1) {
					method542();
					field1353 = "";
					field1309 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1096 = field1066 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method536("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method432() {
		if (field1348 == 0) {
			int var1 = field23;
			if (field1145 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1387) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1091 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1091 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1091 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1092 - 10 || var2 > field1094 + field1092 + 10 || var3 < field1093 - 10 || var3 > field1095 + field1093 + 10) {
						field1387 = false;

						if (field1091 == 1) {
							field1401 = true;
						}

						if (field1091 == 2) {
							field1381 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1092;
					int var5 = field1093;
					int var6 = field1094;
					int var7 = field24;
					int var8 = field25;
					if (field1091 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1091 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1091 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1210; var10++) {
						int var11 = (field1210 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method457(var9);
					}

					field1387 = false;

					if (field1091 == 1) {
						field1401 = true;
					}

					if (field1091 == 2) {
						field1381 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1210 > 0) {
					int var12 = field1089[field1210 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1087[field1210 - 1];
						int var14 = field1088[field1210 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1243 = false;
							field1224 = 0;
							field1346 = var14;
							field1347 = var13;
							field1348 = 2;
							field1349 = field24;
							field1350 = field25;

							if (class4.field56[var14].field62 == field1066) {
								field1348 = 1;
							}

							if (class4.field56[var14].field62 == field1179) {
								field1348 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1073 == 1 || method525(field1210 - 1)) && field1210 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1210 > 0) {
					method457(field1210 - 1);
				}

				if (var1 != 2 || field1210 <= 0) {
					return;
				}

				method551();
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method433() {
		for (class30 var1 = (class30) field1326.method248(); var1 != null; var1 = (class30) field1326.method250()) {
			if (field1286 != var1.field458 || field1114 > var1.field464) {
				var1.method106();
			} else if (field1114 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1195[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(var2.field361, field1114, var2.field360, method550(var2.field360, var2.field361, var1.field458) - var1.field462);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1287 == var3) {
						var4 = field1345;
					} else {
						var4 = field1318[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(var4.field361, field1114, var4.field360, method550(var4.field360, var4.field361, var1.field458) - var1.field462);
					}
				}

				var1.method121(field1060);
				field1403.method61(60, field1286, (int) var1.field470, -1, var1, (int) var1.field471, (int) var1.field469, var1.field477, false);
			}
		}

		field1363++;
		if (field1363 > 1174) {
			field1363 = 0;
			field1242.method218(63);
			field1242.method219(0);
			int var5 = field1242.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method220(11499);
			}

			field1242.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method219(94);
			}

			field1242.method220(51693);
			field1242.method219(16);
			field1242.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method219(65);
			}

			field1242.method219((int) (Math.random() * 256.0D));
			field1242.method220(22990);
			field1242.method228(field1242.field621 - var5);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method434() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1229[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1229[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1230[var10] = (field1229[var10 - 1] + field1229[var10 + 1] + field1229[var10 - 128] + field1229[var10 + 128]) / 4;
			}
		}

		field1254 += 128;
		if (field1254 > field1360.length) {
			field1254 -= field1360.length;
			int var11 = (int) (Math.random() * 12.0D);
			method505(field1245[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1230[var14 + 128] - field1360[field1254 + var14 & field1360.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1229[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1191[var16] = field1191[var16 + 1];
		}

		field1191[var1 - 1] = (int) (Math.sin(field1114 / 14.0D) * 16.0D + Math.sin(field1114 / 15.0D) * 14.0D + Math.sin(field1114 / 16.0D) * 12.0D);

		if (field1301 > 0) {
			field1301 -= 4;
		}

		if (field1302 > 0) {
			field1302 -= 4;
		}

		if (field1301 == 0 && field1302 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1301 = 1024;
			}

			if (var17 == 1) {
				field1302 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method435() {
		if (field1185 != 0) {
			int var1 = 0;
			if (field1423 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1065[var2] != null) {
					int var3 = field1063[var2];
					String var4 = field1064[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1426 == 0 || field1426 == 1 && method437(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1275.method204("From:  " + var4 + field1065[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1163 >= 1) {
									field1115[field1210] = "Report abuse @whi@" + var4;
									field1089[field1210] = 2524;
									field1210++;
								}

								field1115[field1210] = "Add ignore @whi@" + var4;
								field1089[field1210] = 2047;
								field1210++;
								field1115[field1210] = "Add friend @whi@" + var4;
								field1089[field1210] = 2605;
								field1210++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1426 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method436(class38 arg0, int arg1) {
		if (arg1 == 99 || arg1 == 131) {
			int var3 = arg0.method229();
			int var4 = (var3 >> 4 & 0x7) + field1279;
			int var5 = (var3 & 0x7) + field1280;
			int var6 = arg0.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1324[var7];
			int var10;
			if (arg1 == 131) {
				var10 = -1;
			} else {
				var10 = arg0.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method483(var9, 0, var7, field1286, var5, var10, -1, var8, var4);
			}
		} else if (arg1 == 82) {
			int var11 = arg0.method229();
			int var12 = (var11 >> 4 & 0x7) + field1279;
			int var13 = (var11 & 0x7) + field1280;
			int var14 = arg0.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1324[var15];
			int var18 = arg0.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1133[field1286][var12][var13];
				int var20 = field1133[field1286][var12 + 1][var13];
				int var21 = field1133[field1286][var12 + 1][var13 + 1];
				int var22 = field1133[field1286][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1403.method72(var13, var12, field1286);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var24, false, var22, var19, 2, var18, var21, var20, var16 + 4);
							var23.field255 = new class28(var24, false, var22, var19, 2, var18, var21, var20, var16 + 1 & 0x3);
						} else {
							var23.field254 = new class28(var24, false, var22, var19, var15, var18, var21, var20, var16);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1403.method73(field1286, var13, var12);
					if (var25 != null) {
						var25.field147 = new class28(var25.field148 >> 14 & 0x7FFF, false, var22, var19, 4, var18, var21, var20, 0);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1403.method74(var12, field1286, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var26.field247 >> 14 & 0x7FFF, false, var22, var19, var15, var18, var21, var20, var16);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1403.method75(var12, var13, field1286);
					if (var27 != null) {
						var27.field178 = new class28(var27.field179 >> 14 & 0x7FFF, false, var22, var19, 22, var18, var21, var20, var16);
					}
				}
			}
		} else if (arg1 == 42) {
			int var28 = arg0.method229();
			int var29 = (var28 >> 4 & 0x7) + field1279;
			int var30 = (var28 & 0x7) + field1280;
			int var31 = arg0.method231();
			int var32 = arg0.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1123[field1286][var29][var30] == null) {
					field1123[field1286][var29][var30] = new class41();
				}

				field1123[field1286][var29][var30].method245(var33);
				method538(var29, var30);
			}
		} else if (arg1 == 139) {
			int var34 = arg0.method229();
			int var35 = (var34 >> 4 & 0x7) + field1279;
			int var36 = (var34 & 0x7) + field1280;
			int var37 = arg0.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1123[field1286][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1123[field1286][var35][var36] = null;
					}

					method538(var35, var36);
				}
			}
		} else if (arg1 == 164) {
			int var40 = arg0.method229();
			int var41 = (var40 >> 4 & 0x7) + field1279;
			int var42 = (var40 & 0x7) + field1280;
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
				class30 var53 = new class30(field1114 + var49, field1286, var41, var42, field1114 + var50, var46, method550(var41, var42, field1286) - var47, var52, var51, var48, var45);
				var53.method120(var44, field1114 + var49, var43, method550(var43, var44, field1286) - var48);
				field1326.method245(var53);
			}
		} else if (arg1 == 127) {
			int var54 = arg0.method229();
			int var55 = (var54 >> 4 & 0x7) + field1279;
			int var56 = (var54 & 0x7) + field1280;
			int var57 = arg0.method231();
			int var58 = arg0.method229();
			int var59 = arg0.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(field1114, var57, var59, var55, var56, method550(var55, var56, field1286) - var58, field1286);
				field1420.method245(var60);
			}
		} else if (arg1 == 138) {
			int var61 = arg0.method229();
			int var62 = (var61 >> 4 & 0x7) + field1279;
			int var63 = (var61 & 0x7) + field1280;
			int var64 = arg0.method231();
			int var65 = arg0.method231();
			int var66 = arg0.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1287 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1123[field1286][var62][var63] == null) {
					field1123[field1286][var62][var63] = new class41();
				}

				field1123[field1286][var62][var63].method245(var67);
				method538(var62, var63);
			}
		} else {
			if (arg1 == 91) {
				int var68 = arg0.method229();
				int var69 = (var68 >> 4 & 0x7) + field1279;
				int var70 = (var68 & 0x7) + field1280;
				int var71 = arg0.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1324[var72];
				int var75 = arg0.method231();
				int var76 = arg0.method231();
				int var77 = arg0.method231();
				int var78 = arg0.method231();
				byte var79 = arg0.method230();
				byte var80 = arg0.method230();
				byte var81 = arg0.method230();
				byte var82 = arg0.method230();
				class27 var83;
				if (field1287 == var78) {
					var83 = field1345;
				} else {
					var83 = field1318[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1133[field1286][var69][var70];
					int var86 = field1133[field1286][var69 + 1][var70];
					int var87 = field1133[field1286][var69 + 1][var70 + 1];
					int var88 = field1133[field1286][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method483(var74, var76 + 1, 0, field1286, var70, -1, var77 + 1, 0, var69);
						var83.field426 = field1114 + var76;
						var83.field427 = field1114 + var77;
						var83.field431 = var89;
						int var90 = var84.field835;
						int var91 = var84.field836;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field836;
							var91 = var84.field835;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method550(var83.field428, var83.field430, field1286);

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

			if (arg1 == 193) {
				int var94 = arg0.method229();
				int var95 = (var94 >> 4 & 0x7) + field1279;
				int var96 = (var94 & 0x7) + field1280;
				int var97 = arg0.method231();
				int var98 = arg0.method231();
				int var99 = arg0.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1123[field1286][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method538(var95, var96);
					}
				}
			} else if (arg1 == 196) {
				int var102 = arg0.method229();
				int var103 = (var102 >> 4 & 0x7) + field1279;
				int var104 = (var102 & 0x7) + field1280;
				int var105 = arg0.method231();
				int var106 = arg0.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1345.field410[0] >= var103 - var107 && field1345.field410[0] <= var103 + var107 && field1345.field411[0] >= var104 - var107 && field1345.field411[0] <= var104 + var107 && field1480 && !field1129 && field1298 < 50) {
					field1199[field1298] = var105;
					field1182[field1298] = var108;
					field1150[field1298] = class55.field790[var105];
					field1298++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method437(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1084; var2++) {
			if (arg0.equalsIgnoreCase(field1453[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1345.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.l(I)V")
	public void method438() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1393);

		if (field1367 != null) {
			System.out.println("Od-cycle:" + field1367.field747);
		}

		System.out.println("loop-cycle:" + field1114);
		System.out.println("draw-cycle:" + field1310);
		System.out.println("ptype:" + field1376);
		System.out.println("psize:" + field1375);

		if (field1099 != null) {
			field1099.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method439() {
		field1436.method258();
		class34.field584 = field1415;
		field1153.method199(0, 0);

		if (field1388) {
			field1276.method202(0, 40, 239, field1192);
			field1276.method202(128, 60, 239, field1241 + "*");
		} else if (field1174) {
			field1276.method202(0, 40, 239, "Enter amount:");
			field1276.method202(128, 60, 239, field1432 + "*");
		} else if (field1198 != null) {
			field1276.method202(0, 40, 239, field1198);
			field1276.method202(128, 60, 239, "Click to continue");
		} else if (field1179 != -1) {
			method535(0, 0, class4.field56[field1179], 0);
		} else if (field1315 == -1) {
			class37 var1 = field1275;
			int var2 = 0;
			class33.method154(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1065[var3] != null) {
					int var4 = field1063[var3];
					int var5 = field1463 + 70 - var2 * 14;
					String var6 = field1064[var3];
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
							var1.method206(field1065[var3], 0, 4, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1167 == 0 || field1167 == 1 && method437(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1130[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1130[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var6 + ":", 0, var8, var5);
							var8 += var1.method204(var6) + 8;
							var1.method206(field1065[var3], 255, var8, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1185 == 0 && (var4 == 7 || field1426 == 0 || field1426 == 1 && method437(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206("From", 0, var9, var5);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1130[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1130[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var6 + ":", 0, var11, var5);
							var11 += var1.method204(var6) + 8;
							var1.method206(field1065[var3], 0x800000, var11, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1285 == 0 || field1285 == 1 && method437(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1065[var3], 0x800080, 4, var5);
						}

						var2++;
					}

					if (var4 == 5 && field1185 == 0 && field1426 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(field1065[var3], 0x800000, 4, var5);
						}

						var2++;
					}

					if (var4 == 6 && field1185 == 0 && field1426 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206("To " + var6 + ":", 0, 4, var5);
							var1.method206(field1065[var3], 0x800000, var1.method204("To " + var6) + 12, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1285 == 0 || field1285 == 1 && method437(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1065[var3], 0x7E3200, 4, var5);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1338 = var2 * 14 + 7;
			if (field1338 < 78) {
				field1338 = 78;
			}

			method454(77, 463, field1338, field1338 - field1463 - 77, 0);
			String var10;
			if (field1345 == null || field1345.field416 == null) {
				var10 = class51.method304(field1225);
			} else {
				var10 = field1345.field416;
			}

			var1.method206(var10 + ":", 0, 4, 90);
			var1.method206(field1383 + "*", 255, var1.method204(var10 + ": ") + 6, 90);
			class33.method160(77, 0, 479, 0);
		} else {
			method535(0, 0, class4.field56[field1315], 0);
		}

		if (field1387 && field1091 == 2) {
			method562();
		}

		field1436.method259(17, 357, field9);
		field1435.method258();
		class34.field584 = field1417;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method440(int arg0) {
		if (!field1129) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1060 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1186;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1186 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1060 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1186;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1186 = var11;
				class34.method171(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method441() {
		if (field1436 == null) {
			method479();
			field10 = null;
			field1105 = null;
			field1106 = null;
			field1107 = null;
			field1108 = null;
			field1109 = null;
			field1110 = null;
			field1111 = null;
			field1112 = null;
			field1113 = null;
			field1436 = new class43(method11(), 479, 96);
			field1434 = new class43(method11(), 172, 156);
			class33.method155();
			field1152.method199(0, 0);
			field1433 = new class43(method11(), 190, 261);
			field1435 = new class43(method11(), 512, 334);
			class33.method155();
			field1396 = new class43(method11(), 496, 50);
			field1397 = new class43(method11(), 269, 37);
			field1398 = new class43(method11(), 249, 45);
			field1295 = true;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method442() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1456[0] != -1) {
				field1401 = true;
				field1281 = 0;
				field1201 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1456[1] != -1) {
				field1401 = true;
				field1281 = 1;
				field1201 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1456[2] != -1) {
				field1401 = true;
				field1281 = 2;
				field1201 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1456[3] != -1) {
				field1401 = true;
				field1281 = 3;
				field1201 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1456[4] != -1) {
				field1401 = true;
				field1281 = 4;
				field1201 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1456[5] != -1) {
				field1401 = true;
				field1281 = 5;
				field1201 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1456[6] != -1) {
				field1401 = true;
				field1281 = 6;
				field1201 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1456[7] != -1) {
				field1401 = true;
				field1281 = 7;
				field1201 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1456[8] != -1) {
				field1401 = true;
				field1281 = 8;
				field1201 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1456[9] != -1) {
				field1401 = true;
				field1281 = 9;
				field1201 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1456[10] != -1) {
				field1401 = true;
				field1281 = 10;
				field1201 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1456[11] != -1) {
				field1401 = true;
				field1281 = 11;
				field1201 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1456[12] != -1) {
				field1401 = true;
				field1281 = 12;
				field1201 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1456[13] != -1) {
				field1401 = true;
				field1281 = 13;
				field1201 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method443() {
		byte[] var1 = field1097.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1108.method258();
		var2.method184(0, 0);
		field1109.method258();
		var2.method184(0, -637);
		field1105.method258();
		var2.method184(0, -128);
		field1106.method258();
		var2.method184(-371, -202);
		field1107.method258();
		var2.method184(-171, -202);
		field1110.method258();
		var2.method184(-265, 0);
		field1111.method258();
		var2.method184(-265, -562);
		field1112.method258();
		var2.method184(-171, -128);
		field1113.method258();
		var2.method184(-171, -562);
		int[] var3 = new int[var2.field597];
		for (int var4 = 0; var4 < var2.field598; var4++) {
			for (int var5 = 0; var5 < var2.field597; var5++) {
				var3[var5] = var2.field596[var2.field597 * var4 + var2.field597 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field597; var6++) {
				var2.field596[var2.field597 * var4 + var6] = var3[var6];
			}
		}

		field1108.method258();
		var2.method184(0, 382);
		field1109.method258();
		var2.method184(0, -255);
		field1105.method258();
		var2.method184(0, 254);
		field1106.method258();
		var2.method184(-371, 180);
		field1107.method258();
		var2.method184(-171, 180);
		field1110.method258();
		var2.method184(-265, 382);
		field1111.method258();
		var2.method184(-265, -180);
		field1112.method258();
		var2.method184(-171, 254);
		field1113.method258();
		var2.method184(-171, -180);
		class35 var7 = new class35(field1097, "logo", 0);
		field1105.method258();
		var7.method186(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.o(I)Z")
	public final boolean method444() {
		if (field1099 == null) {
			return false;
		}

		try {
			int var1 = field1099.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1376 == -1) {
				field1099.method41(field1441.field620, 0, 1);
				field1376 = field1441.field620[0] & 0xFF;
				if (field1234 != null) {
					field1376 = field1376 - field1234.method295() & 0xFF;
				}

				field1375 = class61.field958[field1376];
				var1--;
			}

			if (field1375 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1099.method41(field1441.field620, 0, 1);
				field1375 = field1441.field620[0] & 0xFF;
				var1--;
			}

			if (field1375 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1099.method41(field1441.field620, 0, 2);
				field1441.field621 = 0;
				field1375 = field1441.method231();
				var1 -= 2;
			}

			if (var1 < field1375) {
				return false;
			}

			field1441.field621 = 0;
			field1099.method41(field1441.field620, 0, field1375);
			field1377 = 0;
			field1178 = field1177;
			field1177 = field1176;
			field1176 = field1376;

			if (field1376 == 29) {
				int var2 = field1441.method232();
				field1315 = var2;
				field1381 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 65) {
				field1279 = field1441.method229();
				field1280 = field1441.method229();
				field1376 = -1;
				return true;
			}

			if (field1376 == 247) {
				int var3 = field1441.method231();
				int var4 = field1441.method229();

				if (var3 == 0xFFFF) {
					var3 = -1;
				}

				field1456[var4] = var3;
				field1401 = true;
				field1201 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 171) {
				field1470 = field1441.method229();
				if (field1470 == field1281) {
					if (field1470 == 3) {
						field1281 = 1;
					} else {
						field1281 = 3;
					}

					field1401 = true;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 246) {
				int var5 = field1441.method229();
				int var6 = field1441.method229();
				int var7 = field1441.method229();
				int var8 = field1441.method229();
				field1183[var5] = true;
				field1450[var5] = var6;
				field1124[var5] = var7;
				field1256[var5] = var8;
				field1278[var5] = 0;
				field1376 = -1;
				return true;
			}

			if (field1376 == 13) {
				int var9 = field1441.method231();
				String var10 = field1441.method236();
				class4.field56[var9].field97 = var10;

				if (field1456[field1281] == class4.field56[var9].field62) {
					field1401 = true;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 213) {
				field1284 = field1441.method229();
				if (field1284 == 1) {
					field1437 = field1441.method231();
				}

				if (field1284 >= 2 && field1284 <= 6) {
					if (field1284 == 2) {
						field1239 = 64;
						field1240 = 64;
					}

					if (field1284 == 3) {
						field1239 = 0;
						field1240 = 64;
					}

					if (field1284 == 4) {
						field1239 = 128;
						field1240 = 64;
					}

					if (field1284 == 5) {
						field1239 = 64;
						field1240 = 0;
					}

					if (field1284 == 6) {
						field1239 = 64;
						field1240 = 128;
					}

					field1284 = 2;
					field1236 = field1441.method231();
					field1237 = field1441.method231();
					field1238 = field1441.method229();
				}

				if (field1284 == 10) {
					field1122 = field1441.method231();
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 7) {
				field1388 = false;
				field1174 = true;
				field1432 = "";
				field1381 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 74) {
				long var11 = field1441.method235();
				int var13 = field1441.method234();
				int var14 = field1441.method229();
				boolean var15 = false;
				for (int var16 = 0; var16 < 100; var16++) {
					if (field1439[var16] == var13) {
						var15 = true;
						break;
					}
				}

				if (var14 <= 1) {
					for (int var17 = 0; var17 < field1425; var17++) {
						if (field1368[var17] == var11) {
							var15 = true;
							break;
						}
					}
				}

				if (!var15 && field1395 == 0) {
					try {
						field1439[field1331] = var13;
						field1331 = (field1331 + 1) % 100;
						String var18 = class52.method306(field1375 - 13, field1441);
						var18 = class71.method401(var18);
						if (var14 == 2 || var14 == 3) {
							method536("@cr2@" + class51.method304(class51.method301(var11)), 7, var18);
						} else if (var14 == 1) {
							method536("@cr1@" + class51.method304(class51.method301(var11)), 7, var18);
						} else {
							method536(class51.method304(class51.method301(var11)), 3, var18);
						}
					} catch (Exception var162) {
						signlink.reporterror("cde1");
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 22) {
				int var20 = field1441.method231();
				int var21 = field1441.method232();
				int var22 = field1441.method232();
				class4 var23 = class4.field56[var20];
				var23.field69 = var21;
				var23.field70 = var22;
				field1376 = -1;
				return true;
			}

			if (field1376 == 79) {
				field1085 = field1441.method229();
				field1401 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 182) {
				int var24 = field1441.method231();
				byte var25 = field1441.method230();
				field1466[var24] = var25;

				if (field1190[var24] != var25) {
					field1190[var24] = var25;
					method462(var24);
					field1401 = true;

					if (field1315 != -1) {
						field1381 = true;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 87) {
				int var26 = field1441.method231();
				method539(var26);

				if (field1179 != -1) {
					field1179 = -1;
					field1381 = true;
				}

				if (field1174) {
					field1174 = false;
					field1381 = true;
				}

				field1181 = var26;
				field1401 = true;
				field1201 = true;
				field1066 = -1;
				field1205 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 140) {
				method475(field1441, field1375);
				field1169 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 81) {
				field1401 = true;
				int var27 = field1441.method231();
				class4 var28 = class4.field56[var27];
				while (field1441.field621 < field1375) {
					int var29 = field1441.method243();
					int var30 = field1441.method231();
					int var31 = field1441.method229();
					if (var31 == 255) {
						var31 = field1441.method234();
					}

					if (var29 >= 0 && var29 < var28.field57.length) {
						var28.field57[var29] = var30;
						var28.field58[var29] = var31;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 1) {
				field1423 = field1441.method231() * 30;
				field1376 = -1;
				return true;
			}

			if (field1376 == 195) {
				field1389 = 0;
				field1376 = -1;
				return true;
			}

			if (field1376 == 90) {
				int var32 = field1441.method231();
				if (var32 == 0xFFFF) {
					var32 = -1;
				}

				if (field1402 != var32 && field1200 && !field1129 && field1076 == 0) {
					field1336 = var32;
					field1337 = true;
					field1367.method279(2, field1336);
				}

				field1402 = var32;
				field1376 = -1;
				return true;
			}

			if (field1376 == 84) {
				int var33 = field1441.method231();
				int var34 = field1441.method231();
				if (field1200 && !field1129) {
					field1336 = var33;
					field1337 = false;
					field1367.method279(2, field1336);
					field1076 = var34;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 154) {
				int var35 = field1441.method231();
				int var36 = field1441.method229();
				int var37 = field1441.method231();
				if (field1480 && !field1129 && field1298 < 50) {
					field1199[field1298] = var35;
					field1182[field1298] = var36;
					field1150[field1298] = class55.field790[var35] + var37;
					field1298++;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 214) {
				int var38 = field1441.method231();
				int var39 = field1441.method234();
				field1466[var38] = var39;

				if (field1190[var38] != var39) {
					field1190[var38] = var39;
					method462(var38);
					field1401 = true;

					if (field1315 != -1) {
						field1381 = true;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 219) {
				field1339 = false;

				for (int var40 = 0; var40 < 5; var40++) {
					field1183[var40] = false;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 153) {
				field1411 = field1441.method229();
				field1376 = -1;
				return true;
			}

			if (field1376 == 220) {
				int var41 = field1441.method231();
				int var42 = field1441.method231();
				class4.field56[var41].field105 = 2;
				class4.field56[var41].field106 = var42;
				field1376 = -1;
				return true;
			}

			if (field1376 == 23) {
				int var43 = field1441.method231();
				boolean var44 = field1441.method229() == 1;
				class4.field56[var43].field77 = var44;
				field1376 = -1;
				return true;
			}

			if (field1376 == 108) {
				int var45 = field1441.method231();
				class4.field56[var45].field105 = 3;

				if (field1345.field438 == null) {
					class4.field56[var45].field106 = (field1345.field420[11] << 5) + (field1345.field420[8] << 10) + (field1345.field420[0] << 15) + (field1345.field421[0] << 25) + (field1345.field421[4] << 20) + field1345.field420[1];
				} else {
					class4.field56[var45].field106 = (int) (field1345.field438.field879 + 0x12345678L);
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 77) {
				field1425 = field1375 / 8;
				for (int var46 = 0; var46 < field1425; var46++) {
					field1368[var46] = field1441.method235();
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 85) {
				field1287 = field1441.method231();
				field1467 = field1441.method229();
				field1376 = -1;
				return true;
			}

			if (field1376 == 142) {
				field1279 = field1441.method229();
				field1280 = field1441.method229();

				while (field1441.field621 < field1375) {
					int var47 = field1441.method229();
					method436(field1441, var47);
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 111) {
				int var48 = field1441.method231();
				int var49 = field1441.method231();

				if (field1179 != -1) {
					field1179 = -1;
					field1381 = true;
				}

				if (field1174) {
					field1174 = false;
					field1381 = true;
				}

				field1066 = var48;
				field1181 = var49;
				field1401 = true;
				field1201 = true;
				field1205 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 191) {
				int var50 = field1441.method231();
				method539(var50);

				if (field1181 != -1) {
					field1181 = -1;
					field1401 = true;
					field1201 = true;
				}

				if (field1179 != -1) {
					field1179 = -1;
					field1381 = true;
				}

				if (field1174) {
					field1174 = false;
					field1381 = true;
				}

				field1066 = var50;
				field1205 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 165) {
				if (field1181 != -1) {
					field1181 = -1;
					field1401 = true;
					field1201 = true;
				}

				if (field1179 != -1) {
					field1179 = -1;
					field1381 = true;
				}

				if (field1174) {
					field1174 = false;
					field1381 = true;
				}

				field1066 = -1;
				field1205 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 24) {
				if (field1281 == 12) {
					field1401 = true;
				}

				field1211 = field1441.method229();
				field1376 = -1;
				return true;
			}

			if (field1376 == 106) {
				long var51 = field1441.method235();
				int var53 = field1441.method229();
				String var54 = class51.method304(class51.method301(var51));
				for (int var55 = 0; var55 < field1084; var55++) {
					if (field1418[var55] == var51) {
						if (field1330[var55] != var53) {
							field1330[var55] = var53;
							field1401 = true;

							if (var53 > 0) {
								method536("", 5, var54 + " has logged in.");
							}

							if (var53 == 0) {
								method536("", 5, var54 + " has logged out.");
							}
						}

						var54 = null;
						break;
					}
				}

				if (var54 != null && field1084 < 200) {
					field1418[field1084] = var51;
					field1453[field1084] = var54;
					field1330[field1084] = var53;
					field1084++;
					field1401 = true;
				}

				boolean var56 = false;
				while (!var56) {
					var56 = true;
					for (int var57 = 0; var57 < field1084 - 1; var57++) {
						if (field1330[var57] != field1126 && field1330[var57 + 1] == field1126 || field1330[var57] == 0 && field1330[var57 + 1] != 0) {
							int var58 = field1330[var57];
							field1330[var57] = field1330[var57 + 1];
							field1330[var57 + 1] = var58;
							String var59 = field1453[var57];
							field1453[var57] = field1453[var57 + 1];
							field1453[var57 + 1] = var59;
							long var60 = field1418[var57];
							field1418[var57] = field1418[var57 + 1];
							field1418[var57 + 1] = var60;
							field1401 = true;
							var56 = false;
						}
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 68) {
				field1304 = field1441.method234();
				field1306 = field1441.method231();
				field1366 = field1441.method229();
				field1300 = field1441.method231();
				field1370 = field1441.method229();
				if (field1304 != 0 && field1066 == -1) {
					signlink.dnslookup(class51.method303(field1304));
					method542();
					short var62 = 650;
					if (field1366 != 201 || field1370 == 1) {
						var62 = 655;
					}

					field1353 = "";
					field1309 = false;

					for (int var63 = 0; var63 < class4.field56.length; var63++) {
						if (class4.field56[var63] != null && class4.field56[var63].field65 == var62) {
							field1066 = class4.field56[var63].field62;
							break;
						}
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 20) {
				field1167 = field1441.method229();
				field1426 = field1441.method229();
				field1285 = field1441.method229();
				field1357 = true;
				field1381 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 224) {
				method445();
				field1376 = -1;
				return false;
			}

			if (field1376 == 126) {
				int var64 = field1441.method231();
				class4 var65 = class4.field56[var64];
				for (int var66 = 0; var66 < var65.field57.length; var66++) {
					var65.field57[var66] = -1;
					var65.field57[var66] = 0;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 159) {
				for (int var67 = 0; var67 < field1190.length; var67++) {
					if (field1466[var67] != field1190[var67]) {
						field1190[var67] = field1466[var67];
						method462(var67);
						field1401 = true;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 133) {
				int var68 = field1441.method231();
				int var69 = field1441.method232();
				class4 var70 = class4.field56[var68];
				var70.field109 = var69;

				if (var69 == -1) {
					var70.field59 = 0;
					var70.field60 = 0;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 10) {
				field1339 = true;
				field1067 = field1441.method229();
				field1068 = field1441.method229();
				field1069 = field1441.method231();
				field1070 = field1441.method229();
				field1071 = field1441.method229();
				if (field1071 >= 100) {
					int var71 = field1067 * 128 + 64;
					int var72 = field1068 * 128 + 64;
					int var73 = method550(var71, var72, field1286) - field1069;
					int var74 = var71 - field1138;
					int var75 = var73 - field1139;
					int var76 = var72 - field1140;
					int var77 = (int) Math.sqrt(var74 * var74 + var76 * var76);
					field1141 = (int) (Math.atan2(var75, var77) * 325.949D) & 0x7FF;
					field1142 = (int) (Math.atan2(var74, var76) * -325.949D) & 0x7FF;

					if (field1141 < 128) {
						field1141 = 128;
					}

					if (field1141 > 383) {
						field1141 = 383;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 151) {
				for (int var78 = 0; var78 < field1318.length; var78++) {
					if (field1318[var78] != null) {
						field1318[var78].field388 = -1;
					}
				}

				for (int var79 = 0; var79 < field1195.length; var79++) {
					if (field1195[var79] != null) {
						field1195[var79].field388 = -1;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 163) {
				int var80 = field1441.method231();
				int var81 = field1441.method231();
				class4 var82 = class4.field56[var80];
				if (var82 != null && var82.field63 == 0) {
					if (var81 < 0) {
						var81 = 0;
					}

					if (var81 > var82.field75 - var82.field67) {
						var81 = var82.field75 - var82.field67;
					}

					var82.field76 = var81;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 110) {
				int var83 = field1441.method231();
				method539(var83);

				if (field1181 != -1) {
					field1181 = -1;
					field1401 = true;
					field1201 = true;
				}

				field1179 = var83;
				field1381 = true;
				field1066 = -1;
				field1205 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 232) {
				field1401 = true;
				int var84 = field1441.method231();
				class4 var85 = class4.field56[var84];
				int var86 = field1441.method231();
				for (int var87 = 0; var87 < var86; var87++) {
					var85.field57[var87] = field1441.method231();
					int var88 = field1441.method229();
					if (var88 == 255) {
						var88 = field1441.method234();
					}

					var85.field58[var87] = var88;
				}

				for (int var89 = var86; var89 < var85.field57.length; var89++) {
					var85.field57[var89] = 0;
					var85.field58[var89] = 0;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 38) {
				int var90 = field1441.method231();
				int var91 = field1441.method231();
				class4.field56[var90].field105 = 1;
				class4.field56[var90].field106 = var91;
				field1376 = -1;
				return true;
			}

			if (field1376 == 103) {
				int var92 = field1441.method232();
				if (var92 >= 0) {
					method539(var92);
				}

				field1293 = var92;
				field1376 = -1;
				return true;
			}

			if (field1376 == 125) {
				field1279 = field1441.method229();
				field1280 = field1441.method229();
				for (int var93 = field1279; var93 < field1279 + 8; var93++) {
					for (int var94 = field1280; var94 < field1280 + 8; var94++) {
						if (field1123[field1286][var93][var94] != null) {
							field1123[field1286][var93][var94] = null;
							method538(var93, var94);
						}
					}
				}

				for (class40 var95 = (class40) field1164.method248(); var95 != null; var95 = (class40) field1164.method250()) {
					if (var95.field640 >= field1279 && var95.field640 < field1279 + 8 && var95.field641 >= field1280 && var95.field641 < field1280 + 8 && field1286 == var95.field638) {
						var95.field649 = 0;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 53) {
				int var96 = field1441.method229();
				int var97 = field1441.method229();
				String var98 = field1441.method236();
				if (var96 >= 1 && var96 <= 5) {
					if (var98.equalsIgnoreCase("null")) {
						var98 = null;
					}

					field1343[var96 - 1] = var98;
					field1344[var96 - 1] = var97 == 0;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 3) {
				field1401 = true;
				int var99 = field1441.method229();
				int var100 = field1441.method234();
				int var101 = field1441.method229();
				field1202[var99] = var100;
				field1194[var99] = var101;
				field1188[var99] = 1;
				for (int var102 = 0; var102 < 98; var102++) {
					if (var100 >= field1325[var102]) {
						field1188[var99] = var102 + 2;
					}
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 196 || field1376 == 193 || field1376 == 91 || field1376 == 138 || field1376 == 127 || field1376 == 164 || field1376 == 139 || field1376 == 42 || field1376 == 82 || field1376 == 131 || field1376 == 99) {
				method436(field1441, field1376);
				field1376 = -1;
				return true;
			}

			if (field1376 == 59) {
				String var103 = field1441.method236();
				if (var103.endsWith(":tradereq:")) {
					String var104 = var103.substring(0, var103.indexOf(":"));
					long var105 = class51.method300(var104);
					boolean var107 = false;
					for (int var108 = 0; var108 < field1425; var108++) {
						if (field1368[var108] == var105) {
							var107 = true;
							break;
						}
					}

					if (!var107 && field1395 == 0) {
						method536(var104, 4, "wishes to trade with you.");
					}
				} else if (var103.endsWith(":duelreq:")) {
					String var109 = var103.substring(0, var103.indexOf(":"));
					long var110 = class51.method300(var109);
					boolean var112 = false;
					for (int var113 = 0; var113 < field1425; var113++) {
						if (field1368[var113] == var110) {
							var112 = true;
							break;
						}
					}

					if (!var112 && field1395 == 0) {
						method536(var109, 8, "wishes to duel with you.");
					}
				} else if (var103.endsWith(":chalreq:")) {
					String var114 = var103.substring(0, var103.indexOf(":"));
					long var115 = class51.method300(var114);
					boolean var117 = false;
					for (int var118 = 0; var118 < field1425; var118++) {
						if (field1368[var118] == var115) {
							var117 = true;
							break;
						}
					}

					if (!var117 && field1395 == 0) {
						String var119 = var103.substring(var103.indexOf(":") + 1, var103.length() - 9);
						method536(var114, 8, var119);
					}
				} else {
					method536("", 0, var103);
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 40) {
				int var120 = field1441.method231();
				int var121 = field1441.method231();
				if (field1101 == var120 && field1102 == var121 && field1414 == 2) {
					field1376 = -1;
					return true;
				}

				field1101 = var120;
				field1102 = var121;
				field1332 = (field1101 - 6) * 8;
				field1333 = (field1102 - 6) * 8;
				field1299 = false;
				if ((field1101 / 8 == 48 || field1101 / 8 == 49) && field1102 / 8 == 48) {
					field1299 = true;
				}

				if (field1101 / 8 == 48 && field1102 / 8 == 148) {
					field1299 = true;
				}

				field1414 = 1;
				field1442 = System.currentTimeMillis();
				field1435.method258();
				field1275.method202(0, 151, 257, "Loading - please wait.");
				field1275.method202(0xFFFFFF, 150, 256, "Loading - please wait.");
				field1435.method259(4, 4, field9);
				int var122 = 0;
				for (int var123 = (field1101 - 6) / 8; var123 <= (field1101 + 6) / 8; var123++) {
					for (int var124 = (field1102 - 6) / 8; var124 <= (field1102 + 6) / 8; var124++) {
						var122++;
					}
				}

				field1392 = new byte[var122][];
				field1098 = new byte[var122][];
				field1221 = new int[var122];
				field1222 = new int[var122];
				field1223 = new int[var122];
				int var125 = 0;
				for (int var126 = (field1101 - 6) / 8; var126 <= (field1101 + 6) / 8; var126++) {
					for (int var127 = (field1102 - 6) / 8; var127 <= (field1102 + 6) / 8; var127++) {
						field1221[var125] = (var126 << 8) + var127;

						if (field1299 && (var127 == 49 || var127 == 149 || var127 == 147 || var126 == 50 || var126 == 49 && var127 == 47)) {
							field1222[var125] = -1;
							field1223[var125] = -1;
							var125++;
						} else {
							int var128 = field1222[var125] = field1367.method274(var126, 0, var127);
							if (var128 != -1) {
								field1367.method279(3, var128);
							}

							int var129 = field1223[var125] = field1367.method274(var126, 1, var127);
							if (var129 != -1) {
								field1367.method279(3, var129);
							}

							var125++;
						}
					}
				}

				int var130 = field1332 - field1334;
				int var131 = field1333 - field1335;
				field1334 = field1332;
				field1335 = field1333;

				for (int var132 = 0; var132 < 16384; var132++) {
					class26 var133 = field1195[var132];
					if (var133 != null) {
						for (int var134 = 0; var134 < 10; var134++) {
							var133.field410[var134] -= var130;
							var133.field411[var134] -= var131;
						}

						var133.field360 -= var130 * 128;
						var133.field361 -= var131 * 128;
					}
				}

				for (int var135 = 0; var135 < field1316; var135++) {
					class27 var136 = field1318[var135];
					if (var136 != null) {
						for (int var137 = 0; var137 < 10; var137++) {
							var136.field410[var137] -= var130;
							var136.field411[var137] -= var131;
						}

						var136.field360 -= var130 * 128;
						var136.field361 -= var131 * 128;
					}
				}

				field1169 = true;
				byte var138 = 0;
				byte var139 = 104;
				byte var140 = 1;
				if (var130 < 0) {
					var138 = 103;
					var139 = -1;
					var140 = -1;
				}

				byte var141 = 0;
				byte var142 = 104;
				byte var143 = 1;
				if (var131 < 0) {
					var141 = 103;
					var142 = -1;
					var143 = -1;
				}

				for (int var144 = var138; var144 != var139; var144 += var140) {
					for (int var145 = var141; var145 != var142; var145 += var143) {
						int var146 = var130 + var144;
						int var147 = var131 + var145;
						for (int var148 = 0; var148 < 4; var148++) {
							if (var146 >= 0 && var147 >= 0 && var146 < 104 && var147 < 104) {
								field1123[var148][var144][var145] = field1123[var148][var146][var147];
							} else {
								field1123[var148][var144][var145] = null;
							}
						}
					}
				}

				for (class40 var149 = (class40) field1164.method248(); var149 != null; var149 = (class40) field1164.method250()) {
					var149.field640 -= var130;
					var149.field641 -= var131;
					if (var149.field640 < 0 || var149.field641 < 0 || var149.field640 >= 104 || var149.field641 >= 104) {
						var149.method106();
					}
				}

				if (field1389 != 0) {
					field1389 -= var130;
					field1390 -= var131;
				}

				field1339 = false;
				field1376 = -1;
				return true;
			}

			if (field1376 == 237) {
				int var150 = field1441.method231();
				int var151 = field1441.method231();
				int var152 = var151 >> 10 & 0x1F;
				int var153 = var151 >> 5 & 0x1F;
				int var154 = var151 & 0x1F;
				class4.field56[var150].field99 = (var154 << 3) + (var152 << 19) + (var153 << 11);
				field1376 = -1;
				return true;
			}

			if (field1376 == 89) {
				field1339 = true;
				field1214 = field1441.method229();
				field1215 = field1441.method229();
				field1216 = field1441.method231();
				field1217 = field1441.method229();
				field1218 = field1441.method229();
				if (field1218 >= 100) {
					field1138 = field1214 * 128 + 64;
					field1140 = field1215 * 128 + 64;
					field1139 = method550(field1138, field1140, field1286) - field1216;
				}

				field1376 = -1;
				return true;
			}

			if (field1376 == 194) {
				field1380 = field1441.method229();
				field1376 = -1;
				return true;
			}

			if (field1376 == 50) {
				field1281 = field1441.method229();
				field1401 = true;
				field1201 = true;
				field1376 = -1;
				return true;
			}

			if (field1376 == 115) {
				int var155 = field1441.method231();
				int var156 = field1441.method231();
				int var157 = field1441.method231();

				if (var156 == 0xFFFF) {
					class4.field56[var155].field105 = 0;
					field1376 = -1;
					return true;
				}

				class60 var158 = class60.method348(var156);
				class4.field56[var155].field105 = 4;
				class4.field56[var155].field106 = var156;
				class4.field56[var155].field112 = var158.field922;
				class4.field56[var155].field113 = var158.field923;
				class4.field56[var155].field111 = var158.field921 * 100 / var157;
				field1376 = -1;
				return true;
			}

			if (field1376 == 14) {
				if (field1281 == 12) {
					field1401 = true;
				}

				field1455 = field1441.method232();
				field1376 = -1;
				return true;
			}

			if (field1376 == 67) {
				method540(field1441, field1375);
				field1376 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1376 + "," + field1375 + " - " + field1177 + "," + field1178);
			method445();
		} catch (IOException var163) {
			method502();
		} catch (Exception var164) {
			String var160 = "T2 - " + field1376 + "," + field1177 + "," + field1178 + " - " + field1375 + "," + (field1345.field410[0] + field1332) + "," + (field1345.field411[0] + field1333) + " - ";
			for (int var161 = 0; var161 < field1375 && var161 < 50; var161++) {
				var160 = var160 + field1441.field620[var161] + ",";
			}

			signlink.reporterror(var160);
			method445();
		}

		return true;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method445() {
		try {
			if (field1099 != null) {
				field1099.method38();
			}
		} catch (Exception var2) {
		}

		field1099 = null;
		field1170 = false;
		field1422 = 0;
		field1225 = "";
		field1226 = "";
		method529();
		field1403.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1410[var1].method359();
		}

		System.gc();
		method467();
		field1402 = -1;
		field1336 = -1;
		field1076 = 0;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method446(boolean arg0) {
		method486();
		field1107.method258();
		field1448.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1422 == 0) {
			int var4 = var3 / 2 + 80;
			field1274.method203(var2 / 2, true, var4, 0x75A9A9, field1367.field732);
			int var5 = var3 / 2 - 20;
			field1276.method203(var2 / 2, true, var5, 0xFFFF00, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1449.method199(var6 - 73, var7 - 20);
			field1276.method203(var6, true, var7 + 5, 0xFFFFFF, "New User");
			int var8 = var2 / 2 + 80;
			field1449.method199(var8 - 73, var7 - 20);
			field1276.method203(var8, true, var7 + 5, 0xFFFFFF, "Existing User");
		}

		if (field1422 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1165.length() > 0) {
				field1276.method203(var2 / 2, true, var9 - 15, 0xFFFF00, field1165);
				field1276.method203(var2 / 2, true, var9, 0xFFFF00, field1166);
				var9 += 30;
			} else {
				field1276.method203(var2 / 2, true, var9 - 7, 0xFFFF00, field1166);
				var9 += 30;
			}

			field1276.method210(var9, true, var2 / 2 - 90, 0xFFFFFF, "Username: " + field1225 + (field1135 == 0 & field1114 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field1276.method210(var9, true, var2 / 2 - 88, 0xFFFFFF, "Password: " + class51.method305(field1226) + (field1135 == 1 & field1114 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1449.method199(var10 - 73, var11 - 20);
				field1276.method203(var10, true, var11 + 5, 0xFFFFFF, "Login");
				int var12 = var2 / 2 + 80;
				field1449.method199(var12 - 73, var11 - 20);
				field1276.method203(var12, true, var11 + 5, 0xFFFFFF, "Cancel");
			}
		}

		if (field1422 == 3) {
			field1276.method203(var2 / 2, true, var3 / 2 - 60, 0xFFFF00, "Create a free account");
			int var13 = var3 / 2 - 35;
			field1276.method203(var2 / 2, true, var13, 0xFFFFFF, "To create a new account you need to");
			var13 += 15;
			field1276.method203(var2 / 2, true, var13, 0xFFFFFF, "go back to the main RuneScape webpage");
			var13 += 15;
			field1276.method203(var2 / 2, true, var13, 0xFFFFFF, "and choose the red 'create account'");
			var13 += 15;
			field1276.method203(var2 / 2, true, var13, 0xFFFFFF, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1449.method199(var14 - 73, var15 - 20);
			field1276.method203(var14, true, var15 + 5, 0xFFFFFF, "Cancel");
		}

		field1107.method259(202, 171, field9);

		if (field1295) {
			field1295 = false;
			field1105.method259(128, 0, field9);
			field1106.method259(202, 371, field9);
			field1110.method259(0, 265, field9);
			field1111.method259(562, 265, field9);
			field1112.method259(128, 171, field9);
			field1113.method259(562, 171, field9);
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method447(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1403.method80(field1286, arg0, arg1, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1248++;
		if (field1248 > 1086) {
			field1248 = 0;
			field1242.method218(162);
			field1242.method219(0);
			int var9 = field1242.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method220(16791);
			}

			field1242.method219(254);
			field1242.method220((int) (Math.random() * 65536.0D));
			field1242.method220(16128);
			field1242.method220(52610);
			field1242.method220((int) (Math.random() * 65536.0D));
			field1242.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1242.method220(35025);
			}

			field1242.method220(46628);
			field1242.method219((int) (Math.random() * 256.0D));
			field1242.method228(field1242.field621 - var9);
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

			method482(2, var13, 0, var11, false, field1345.field410[0], arg0, 0, field1345.field411[0], var12, arg1);
		} else {
			method482(2, 0, var7 + 1, 0, false, field1345.field410[0], arg0, var8, field1345.field411[0], 0, arg1);
		}

		field1288 = field24;
		field1289 = field25;
		field1291 = 2;
		field1290 = 0;
		field1242.method218(arg2);
		field1242.method220(field1332 + arg0);
		field1242.method220(field1333 + arg1);
		field1242.method220(var5);
		return true;
	}

	@ObfuscatedName("client.a(Llb;IIILab;)V")
	public final void method448(class38 arg0, int arg1, int arg2, class27 arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg0.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg0.method238(0, var6, var5);
			field1323[arg2] = var7;
			arg3.method116(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg0.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field388 == var8) {
				arg3.field392 = 0;
			}

			int var9 = arg0.method229();
			if (arg3.field388 == var8 && var8 != -1) {
				int var10 = class66.field996[var8].field1010;
				if (var10 == 1) {
					arg3.field389 = 0;
					arg3.field390 = 0;
					arg3.field391 = var9;
					arg3.field392 = 0;
				}

				if (var10 == 2) {
					arg3.field392 = 0;
				}
			} else if (var8 == -1 || arg3.field388 == -1 || class66.field996[var8].field1004 >= class66.field996[arg3.field388].field1004) {
				arg3.field388 = var8;
				arg3.field389 = 0;
				arg3.field390 = 0;
				arg3.field391 = var9;
				arg3.field392 = 0;
				arg3.field414 = arg3.field409;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg3.field382 = arg0.method231();
			if (arg3.field382 == 0xFFFF) {
				arg3.field382 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg3.field372 = arg0.method236();
			if (arg3.field372.charAt(0) == '~') {
				arg3.field372 = arg3.field372.substring(1);
				method536(arg3.field416, 2, arg3.field372);
			} else if (field1345 == arg3) {
				method536(arg3.field416, 2, arg3.field372);
			}

			arg3.field374 = 0;
			arg3.field375 = 0;
			arg3.field373 = 150;
		}

		if ((arg1 & 0x10) == 0x10) {
			int var11 = arg0.method229();
			int var12 = arg0.method229();
			arg3.method114(var11, var12, field1114);
			arg3.field379 = field1114 + 300;
			arg3.field380 = arg0.method229();
			arg3.field381 = arg0.method229();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg3.field383 = arg0.method231();
			arg3.field384 = arg0.method231();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var13 = arg0.method231();
			int var14 = arg0.method229();
			int var15 = arg0.method229();
			int var16 = arg0.field621;

			if (arg3.field416 != null && arg3.field417) {
				long var17 = class51.method300(arg3.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1425; var20++) {
						if (field1368[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1395 == 0) {
					try {
						String var21 = class52.method306(var15, arg0);
						var21 = class71.method401(var21);
						arg3.field372 = var21;
						arg3.field374 = var13 >> 8;
						arg3.field375 = var13 & 0xFF;
						arg3.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method536("@cr2@" + arg3.field416, 1, var21);
						} else if (var14 == 1) {
							method536("@cr1@" + arg3.field416, 1, var21);
						} else {
							method536(arg3.field416, 2, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field621 = var15 + var16;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg3.field393 = arg0.method231();
			int var23 = arg0.method234();
			arg3.field397 = var23 >> 16;
			arg3.field396 = (var23 & 0xFFFF) + field1114;
			arg3.field394 = 0;
			arg3.field395 = 0;

			if (arg3.field396 > field1114) {
				arg3.field394 = -1;
			}

			if (arg3.field393 == 0xFFFF) {
				arg3.field393 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg3.field398 = arg0.method229();
			arg3.field400 = arg0.method229();
			arg3.field399 = arg0.method229();
			arg3.field401 = arg0.method229();
			arg3.field402 = arg0.method231() + field1114;
			arg3.field403 = arg0.method231() + field1114;
			arg3.field404 = arg0.method229();
			arg3.method112();
		}

		if ((arg1 & 0x400) == 0x400) {
			int var24 = arg0.method229();
			int var25 = arg0.method229();
			arg3.method114(var24, var25, field1114);
			arg3.field379 = field1114 + 300;
			arg3.field380 = arg0.method229();
			arg3.field381 = arg0.method229();
		}
	}

	@ObfuscatedName("client.a([BBI)Z")
	public final boolean method449(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(Lib;IBI)V")
	public final void method450(class35 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1136 + field1117 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1143 + 256);
			var7 = var7 * 256 / (field1143 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1454.method191(var10, 15, 15, 20, var12 + 94 + 4 - 10, 20, 256, 83 - var13 - 20);
		} else {
			method543(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.a(IIB)Ljava/lang/String;")
	public static final String method451(int arg0, int arg1) {
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

	@ObfuscatedName("client.q(I)V")
	public final void method452() {
		int var1 = 5;
		field1079[8] = 0;
		int var2 = 0;
		while (field1079[8] == 0) {
			String var3 = "Unknown problem";
			method13("Connecting to web server", 20);

			try {
				DataInputStream var4 = method532("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 294);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1079[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1079[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1079[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1079[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1079[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1079[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1079[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method13("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method13(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field1219 = !field1219;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method453() {
		if (field1422 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1422 = 3;
				field1135 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1165 = "";
				field1166 = "Enter your username & password.";
				field1422 = 2;
				field1135 = 0;
			}
		} else if (field1422 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1135 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1135 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method500(field1225, field1226, false);

				if (field1170) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1422 = 0;
				field1225 = "";
				field1226 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1062.length(); var10++) {
					if (var8 == field1062.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1135 == 0) {
					if (var8 == 8 && field1225.length() > 0) {
						field1225 = field1225.substring(0, field1225.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1135 = 1;
					}

					if (var9) {
						field1225 = field1225 + (char) var8;
					}

					if (field1225.length() > 12) {
						field1225 = field1225.substring(0, 12);
					}
				} else if (field1135 == 1) {
					if (var8 == 8 && field1226.length() > 0) {
						field1226 = field1226.substring(0, field1226.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1135 = 0;
					}

					if (var9) {
						field1226 = field1226 + (char) var8;
					}

					if (field1226.length() > 20) {
						field1226 = field1226.substring(0, 20);
					}
				}
			}
		} else if (field1422 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1422 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1477.method199(arg1, arg4);
		field1478.method199(arg1, arg0 + arg4 - 16);
		class33.method157(arg1, 16, field1413, arg0 - 32, arg4 + 16);
		int var6 = (arg0 - 32) * arg0 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg3 / (arg2 - arg0);
		class33.method157(arg1, 16, field1399, var6, arg4 + var7 + 16);
		class33.method162(field1134, arg4 + var7 + 16, var6, arg1);
		class33.method162(field1134, arg4 + var7 + 16, var6, arg1 + 1);
		class33.method160(arg4 + var7 + 16, arg1, 16, field1134);
		class33.method160(arg4 + var7 + 17, arg1, 16, field1134);
		class33.method162(field1364, arg4 + var7 + 16, var6, arg1 + 15);
		class33.method162(field1364, arg4 + var7 + 17, var6 - 1, arg1 + 14);
		class33.method160(arg4 + var7 + var6 + 15, arg1, 16, field1364);
		class33.method160(arg4 + var7 + var6 + 14, arg1 + 1, 15, field1364);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method455(boolean arg0) {
		for (int var2 = 0; var2 < field1196; var2++) {
			class26 var3 = field1195[field1197[var2]];
			int var4 = (field1197[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field900 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1369[var5][var6] == field1187) {
							continue;
						}

						field1369[var5][var6] = field1187;
					}

					field1403.method61((var3.field364 - 1) * 64 + 60, field1286, var3.field361, var4, var3, method550(var3.field360, var3.field361, field1286), var3.field360, var3.field362, var3.field363);
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method456() {
		for (int var1 = 0; var1 < field1298; var1++) {
			if (field1150[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1199[var1] != field1352 || field1182[var1] != field1356) {
						class38 var3 = class55.method319(field1199[var1], field1182[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1257 / 22 + field1292) {
							field1257 = var3.field621;
							field1292 = System.currentTimeMillis();

							if (method449(var3.field620, var3.field621)) {
								field1352 = field1199[var1];
								field1356 = field1182[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method472()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1150[var1] != -5) {
					field1150[var1] = -5;
				} else {
					field1298--;
					for (int var5 = var1; var5 < field1298; var5++) {
						field1199[var5] = field1199[var5 + 1];
						field1182[var5] = field1182[var5 + 1];
						field1150[var5] = field1150[var5 + 1];
					}

					var1--;
				}
			} else {
				field1150[var1]--;
			}
		}

		if (field1076 > 0) {
			field1076 -= 20;
			if (field1076 < 0) {
				field1076 = 0;
			}

			if (field1076 == 0 && field1200 && !field1129) {
				field1336 = field1402;
				field1337 = true;
				field1367.method279(2, field1336);
				return;
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

	@ObfuscatedName("client.d(I)V")
	public final void method9() {
		if (field1419 || field1168 || field1404) {
			method508();
		} else {
			field1310++;

			if (field1170) {
				method522();
			} else {
				method446(false);
			}

			field1382 = 0;
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method457(int arg0) {
		if (arg0 >= 0) {
			if (field1174) {
				field1174 = false;
				field1381 = true;
			}

			int var2 = field1087[arg0];
			int var3 = field1088[arg0];
			int var4 = field1089[arg0];
			int var5 = field1090[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 1714) {
				class26 var6 = field1195[var5];
				if (var6 != null) {
					class59 var7 = var6.field415;
					if (var7.field905 != null) {
						var7 = var7.method345();
					}

					if (var7 != null) {
						String var8;
						if (var7.field881 == null) {
							var8 = "It's a " + var7.field880 + ".";
						} else {
							var8 = new String(var7.field881);
						}

						method536("", 0, var8);
					}
				}
			}

			if (var4 == 275) {
				class27 var9 = field1318[var5];
				if (var9 != null) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var9.field410[0], 0, field1345.field411[0], 1, var9.field411[0]);
					field1288 = field24;
					field1289 = field25;
					field1291 = 2;
					field1290 = 0;
					field1242.method218(15);
					field1242.method220(var5);
					field1242.method220(field1430);
					field1242.method220(field1428);
					field1242.method220(field1429);
				}
			}

			if (var4 == 563) {
				field1242.method218(47);
				field1242.method220(var5);
				field1242.method220(var2);
				field1242.method220(var3);
				field1242.method220(field1146);
				field1311 = 0;
				field1312 = var3;
				field1313 = var2;
				field1314 = 2;
				if (class4.field56[var3].field62 == field1066) {
					field1314 = 1;
				}

				if (class4.field56[var3].field62 == field1179) {
					field1314 = 3;
				}
			}

			if (var4 == 357) {
				method447(var2, var3, 172, var5);
			}

			if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
				boolean var10 = method482(2, 0, 0, 0, false, field1345.field410[0], var2, 0, field1345.field411[0], 0, var3);
				if (!var10) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var2, 0, field1345.field411[0], 1, var3);
				}

				field1288 = field24;
				field1289 = field25;
				field1291 = 2;
				field1290 = 0;

				if (var4 == 617) {
					field1242.method218(170);
				}

				if (var4 == 662) {
					field1204 += field1333;
					if (field1204 >= 118) {
						field1242.method218(100);
						field1242.method223(0);
					}

					field1242.method218(222);
				}

				if (var4 == 778) {
					field1242.method218(52);
				}

				if (var4 == 224) {
					field1283 += var3;
					if (field1283 >= 75) {
						field1242.method218(198);
						field1242.method219(19);
					}

					field1242.method218(251);
				}

				if (var4 == 139) {
					if ((var2 & 0x3) == 0) {
						field1080++;
					}

					if (field1080 >= 123) {
						field1242.method218(20);
						field1242.method223(0);
					}

					field1242.method218(122);
				}

				field1242.method220(field1332 + var2);
				field1242.method220(field1333 + var3);
				field1242.method220(var5);
			}

			if (var4 == 1328) {
				class60 var12 = class60.method348(var5);
				class4 var13 = class4.field56[var3];
				String var14;
				if (var13 != null && var13.field58[var2] >= 100000) {
					var14 = var13.field58[var2] + " x " + var12.field917;
				} else if (var12.field918 == null) {
					var14 = "It's a " + var12.field917 + ".";
				} else {
					var14 = new String(var12.field918);
				}

				method536("", 0, var14);
			}

			if (var4 == 240) {
				class26 var15 = field1195[var5];
				if (var15 != null) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var15.field410[0], 0, field1345.field411[0], 1, var15.field411[0]);
					field1288 = field24;
					field1289 = field25;
					field1291 = 2;
					field1290 = 0;
					field1242.method218(58);
					field1242.method220(var5);
					field1242.method220(field1146);
				}
			}

			if (var4 == 1152) {
				class60 var16 = class60.method348(var5);
				String var17;
				if (var16.field918 == null) {
					var17 = "It's a " + var16.field917 + ".";
				} else {
					var17 = new String(var16.field918);
				}

				method536("", 0, var17);
			}

			if (var4 == 111) {
				boolean var18 = method482(2, 0, 0, 0, false, field1345.field410[0], var2, 0, field1345.field411[0], 0, var3);
				if (!var18) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var2, 0, field1345.field411[0], 1, var3);
				}

				field1288 = field24;
				field1289 = field25;
				field1291 = 2;
				field1290 = 0;
				field1242.method218(59);
				field1242.method220(field1332 + var2);
				field1242.method220(field1333 + var3);
				field1242.method220(var5);
				field1242.method220(field1430);
				field1242.method220(field1428);
				field1242.method220(field1429);
			}

			if (var4 == 1071) {
				method447(var2, var3, 165, var5);
			}

			if (var4 == 718) {
				if (field1387) {
					field1403.method88(var2 - 4, var3 - 4);
				} else {
					field1403.method88(field24 - 4, field25 - 4);
				}
			}

			if (var4 == 370) {
				boolean var20 = method482(2, 0, 0, 0, false, field1345.field410[0], var2, 0, field1345.field411[0], 0, var3);
				if (!var20) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var2, 0, field1345.field411[0], 1, var3);
				}

				field1288 = field24;
				field1289 = field25;
				field1291 = 2;
				field1290 = 0;
				field1242.method218(46);
				field1242.method220(field1332 + var2);
				field1242.method220(field1333 + var3);
				field1242.method220(var5);
				field1242.method220(field1146);
			}

			if (var4 == 737) {
				method542();
			}

			if (var4 == 131) {
				class27 var22 = field1318[var5];
				if (var22 != null) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var22.field410[0], 0, field1345.field411[0], 1, var22.field411[0]);
					field1288 = field24;
					field1289 = field25;
					field1291 = 2;
					field1290 = 0;
					field1242.method218(189);
					field1242.method220(var5);
					field1242.method220(field1146);
				}
			}

			if (var4 == 435) {
				field1242.method218(107);
				field1242.method220(var3);
				class4 var23 = class4.field56[var3];
				if (var23.field71 != null && var23.field71[0][0] == 5) {
					int var24 = var23.field71[0][1];
					field1190[var24] = 1 - field1190[var24];
					method462(var24);
					field1401 = true;
				}
			}

			if (var4 == 721) {
				field1359 += var3;
				if (field1359 >= 139) {
					field1242.method218(73);
					field1242.method223(0);
				}

				method447(var2, var3, 187, var5);
			}

			if (var4 == 899 && method447(var2, var3, 156, var5)) {
				field1242.method220(field1146);
			}

			if (var4 == 810 && method447(var2, var3, 111, var5)) {
				field1242.method220(field1430);
				field1242.method220(field1428);
				field1242.method220(field1429);
			}

			if (var4 == 1381) {
				int var25 = var5 >> 14 & 0x7FFF;
				class57 var26 = class57.method330(var25);
				String var27;
				if (var26.field832 == null) {
					var27 = "It's a " + var26.field831 + ".";
				} else {
					var27 = new String(var26.field832);
				}

				method536("", 0, var27);
			}

			if (var4 == 625) {
				method447(var2, var3, 85, var5);
			}

			if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
				if (var4 == 331) {
					field1242.method218(112);
				}

				if (var4 == 555) {
					field1242.method218(86);
				}

				if (var4 == 582) {
					if ((var5 & 0x3) == 0) {
						field1104++;
					}

					if (field1104 >= 133) {
						field1242.method218(134);
						field1242.method220(6118);
					}

					field1242.method218(202);
				}

				if (var4 == 113) {
					field1242.method218(105);
				}

				if (var4 == 354) {
					field1242.method218(255);
				}

				field1242.method220(var5);
				field1242.method220(var2);
				field1242.method220(var3);
				field1311 = 0;
				field1312 = var3;
				field1313 = var2;
				field1314 = 2;
				if (class4.field56[var3].field62 == field1066) {
					field1314 = 1;
				}

				if (class4.field56[var3].field62 == field1179) {
					field1314 = 3;
				}
			}

			if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
				String var28 = field1115[arg0];
				int var29 = var28.indexOf("@whi@");
				if (var29 != -1) {
					long var30 = class51.method300(var28.substring(var29 + 5).trim());
					if (var4 == 605) {
						method476(var30);
					}

					if (var4 == 47) {
						method561(var30);
					}

					if (var4 == 513) {
						method537(var30);
					}

					if (var4 == 884) {
						method511(var30);
					}
				}
			}

			if (var4 == 507 || var4 == 957) {
				String var32 = field1115[arg0];
				int var33 = var32.indexOf("@whi@");
				if (var33 != -1) {
					var32 = var32.substring(var33 + 5).trim();
					String var34 = class51.method304(class51.method301(class51.method300(var32)));
					boolean var35 = false;
					for (int var36 = 0; var36 < field1319; var36++) {
						class27 var37 = field1318[field1320[var36]];
						if (var37 != null && var37.field416 != null && var37.field416.equalsIgnoreCase(var34)) {
							method482(2, 0, 0, 1, false, field1345.field410[0], var37.field410[0], 0, field1345.field411[0], 1, var37.field411[0]);

							if (var4 == 507) {
								field1479 += var5;
								if (field1479 >= 66) {
									field1242.method218(246);
									field1242.method219(154);
								}

								field1242.method218(171);
							}

							if (var4 == 957) {
								field1246++;
								if (field1246 >= 52) {
									field1242.method218(210);
									field1242.method219(131);
								}

								field1242.method218(38);
							}

							field1242.method220(field1320[var36]);
							var35 = true;
							break;
						}
					}

					if (!var35) {
						method536("", 0, "Unable to find " + var34);
					}
				}
			}

			if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
				if (var4 == 681) {
					field1125++;
					if (field1125 >= 116) {
						field1242.method218(252);
						field1242.method222(0xC6A439);
					}

					field1242.method218(76);
				}

				if (var4 == 962) {
					field1242.method218(149);
				}

				if (var4 == 795) {
					field1242.method218(219);
				}

				if (var4 == 100) {
					field1242.method218(215);
				}

				if (var4 == 694) {
					field1242.method218(88);
				}

				field1242.method220(var5);
				field1242.method220(var2);
				field1242.method220(var3);
				field1311 = 0;
				field1312 = var3;
				field1313 = var2;
				field1314 = 2;
				if (class4.field56[var3].field62 == field1066) {
					field1314 = 1;
				}

				if (class4.field56[var3].field62 == field1179) {
					field1314 = 3;
				}
			}

			if (var4 == 902) {
				String var38 = field1115[arg0];
				int var39 = var38.indexOf("@whi@");
				if (var39 != -1) {
					long var40 = class51.method300(var38.substring(var39 + 5).trim());
					int var42 = -1;
					for (int var43 = 0; var43 < field1084; var43++) {
						if (field1418[var43] == var40) {
							var42 = var43;
							break;
						}
					}

					if (var42 != -1 && field1330[var42] > 0) {
						field1381 = true;
						field1174 = false;
						field1388 = true;
						field1241 = "";
						field1078 = 3;
						field1358 = field1418[var42];
						field1192 = "Enter message to send to " + field1453[var42];
					}
				}
			}

			if (var4 == 398) {
				field1242.method218(93);
				field1242.method220(var5);
				field1242.method220(var2);
				field1242.method220(var3);
				field1242.method220(field1430);
				field1242.method220(field1428);
				field1242.method220(field1429);
				field1311 = 0;
				field1312 = var3;
				field1313 = var2;
				field1314 = 2;
				if (class4.field56[var3].field62 == field1066) {
					field1314 = 1;
				}

				if (class4.field56[var3].field62 == field1179) {
					field1314 = 3;
				}
			}

			if (var4 == 225) {
				field1242.method218(107);
				field1242.method220(var3);
				class4 var44 = class4.field56[var3];
				if (var44.field71 != null && var44.field71[0][0] == 5) {
					int var45 = var44.field71[0][1];
					if (field1190[var45] != var44.field73[0]) {
						field1190[var45] = var44.field73[0];
						method462(var45);
						field1401 = true;
					}
				}
			}

			if (var4 == 829) {
				class26 var46 = field1195[var5];
				if (var46 != null) {
					method482(2, 0, 0, 1, false, field1345.field410[0], var46.field410[0], 0, field1345.field411[0], 1, var46.field411[0]);
					field1288 = field24;
					field1289 = field25;
					field1291 = 2;
					field1290 = 0;
					field1242.method218(120);
					field1242.method220(var5);
					field1242.method220(field1430);
					field1242.method220(field1428);
					field1242.method220(field1429);
				}
			}

			if (var4 == 524) {
				String var47 = field1115[arg0];
				int var48 = var47.indexOf("@whi@");
				if (var48 != -1) {
					if (field1066 == -1) {
						method542();
						field1353 = var47.substring(var48 + 5).trim();
						field1309 = false;

						for (int var49 = 0; var49 < class4.field56.length; var49++) {
							if (class4.field56[var49] != null && class4.field56[var49].field65 == 600) {
								field1096 = field1066 = class4.field56[var49].field62;
								break;
							}
						}
					} else {
						method536("", 0, "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 274) {
				class4 var50 = class4.field56[var3];
				field1145 = 1;
				field1146 = var3;
				field1147 = var50.field116;
				field1427 = 0;
				field1401 = true;
				String var51 = var50.field114;
				if (var51.indexOf(" ") != -1) {
					var51 = var51.substring(0, var51.indexOf(" "));
				}

				String var52 = var50.field114;
				if (var52.indexOf(" ") != -1) {
					var52 = var52.substring(var52.indexOf(" ") + 1);
				}

				field1148 = var51 + " " + var50.field115 + " " + var52;

				if (field1147 == 16) {
					field1401 = true;
					field1281 = 3;
					field1201 = true;
				}
			} else {
				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var53 = field1195[var5];
					if (var53 != null) {
						method482(2, 0, 0, 1, false, field1345.field410[0], var53.field410[0], 0, field1345.field411[0], 1, var53.field411[0]);
						field1288 = field24;
						field1289 = field25;
						field1291 = 2;
						field1290 = 0;

						if (var4 == 852) {
							field1242.method218(50);
						}

						if (var4 == 209) {
							field1242.method218(64);
						}

						if (var4 == 242) {
							field1242.method218(138);
						}

						if (var4 == 793) {
							field1242.method218(196);
						}

						if (var4 == 309) {
							field1242.method218(99);
						}

						field1242.method220(var5);
					}
				}

				if (var4 == 231) {
					class4 var54 = class4.field56[var3];
					boolean var55 = true;
					if (var54.field65 > 0) {
						var55 = method485(var54);
					}

					if (var55) {
						field1242.method218(107);
						field1242.method220(var3);
					}
				}

				if (var4 == 997 && !field1205) {
					field1242.method218(27);
					field1242.method220(var3);
					field1205 = true;
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var56 = field1318[var5];
					if (var56 != null) {
						method482(2, 0, 0, 1, false, field1345.field410[0], var56.field410[0], 0, field1345.field411[0], 1, var56.field411[0]);
						field1288 = field24;
						field1289 = field25;
						field1291 = 2;
						field1290 = 0;

						if (var4 == 499) {
							field1242.method218(124);
						}

						if (var4 == 639) {
							field1246++;
							if (field1246 >= 52) {
								field1242.method218(210);
								field1242.method219(131);
							}

							field1242.method218(38);
						}

						if (var4 == 27) {
							field1242.method218(123);
						}

						if (var4 == 387) {
							field1479 += var5;
							if (field1479 >= 66) {
								field1242.method218(246);
								field1242.method219(154);
							}

							field1242.method218(171);
						}

						if (var4 == 185) {
							field1242.method218(89);
						}

						field1242.method220(var5);
					}
				}

				if (var4 == 102) {
					field1427 = 1;
					field1428 = var2;
					field1429 = var3;
					field1430 = var5;
					field1431 = class60.method348(var5).field917;
					field1145 = 0;
					field1401 = true;
				} else {
					if (var4 == 743) {
						field1175++;
						if (field1175 >= 124) {
							field1242.method218(129);
							field1242.method220(37954);
						}

						method447(var2, var3, 250, var5);
					}

					field1427 = 0;
					field1145 = 0;
					field1401 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;B)V")
	public final void method458(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1196) {
			for (int var4 = var3; var4 < field1196; var4++) {
				field1297[field1296++] = field1197[var4];
			}
		}

		if (var3 > field1196) {
			signlink.reporterror(field1225 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1196 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1197[var5];
			class26 var7 = field1195[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1197[field1196++] = var6;
				var7.field405 = field1114;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1197[field1196++] = var6;
					var7.field405 = field1114;
					field1322[field1321++] = var6;
				} else if (var9 == 1) {
					field1197[field1196++] = var6;
					var7.field405 = field1114;
					int var10 = arg1.method240(3);
					var7.method111(var10, false);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1322[field1321++] = var6;
					}
				} else if (var9 == 2) {
					field1197[field1196++] = var6;
					var7.field405 = field1114;
					int var12 = arg1.method240(3);
					var7.method111(var12, true);
					int var13 = arg1.method240(3);
					var7.method111(var13, true);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1322[field1321++] = var6;
					}
				} else if (var9 == 3) {
					field1297[field1296++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method459() {
		field1209 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1443[var1] = -1;
			for (int var2 = 0; var2 < class64.field977; var2++) {
				if (!class64.field978[var2].field984 && class64.field978[var2].field979 == var1 + (field1086 ? 0 : 7)) {
					field1443[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method13(String arg0, int arg1) {
		field1235 = arg1;
		field1342 = arg0;
		method486();

		if (field1097 == null) {
			super.method13(arg0, arg1);
		} else {
			field1107.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1276.method202(0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(304, 34, var3 / 2 - 152, var6, 0x8C1111);
			class33.method158(302, 32, var3 / 2 - 151, var6 + 1, 0);
			class33.method157(var3 / 2 - 150, arg1 * 3, 0x8C1111, 30, var6 + 2);
			class33.method157(arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 0, 30, var6 + 2);
			field1276.method202(0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2, arg0);
			field1107.method259(202, 171, field9);

			if (field1295) {
				field1295 = false;

				if (!field1371) {
					field1108.method259(0, 0, field9);
					field1109.method259(637, 0, field9);
				}

				field1105.method259(128, 0, field9);
				field1106.method259(202, 371, field9);
				field1110.method259(0, 265, field9);
				field1111.method259(562, 265, field9);
				field1112.method259(128, 171, field9);
				field1113.method259(562, 171, field9);
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method460() {
		short var1 = 256;

		if (field1301 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1301 > 768) {
					field1457[var2] = method557(field1458[var2], field1459[var2], 1024 - field1301);
				} else if (field1301 > 256) {
					field1457[var2] = field1459[var2];
				} else {
					field1457[var2] = method557(field1459[var2], field1458[var2], 256 - field1301);
				}
			}
		} else if (field1302 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1302 > 768) {
					field1457[var3] = method557(field1458[var3], field1460[var3], 1024 - field1302);
				} else if (field1302 > 256) {
					field1457[var3] = field1460[var3];
				} else {
					field1457[var3] = method557(field1460[var3], field1458[var3], 256 - field1302);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1457[var4] = field1458[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1108.field654[var5] = field1120.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1191[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1229[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1457[var12];
					int var15 = field1108.field654[var7];
					field1108.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1108.method259(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1109.field654[var16] = field1121.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1191[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1229[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1457[var23];
					int var26 = field1109.field654[var18];
					field1109.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1109.method259(637, 0, field9);
	}

	@ObfuscatedName("client.d(B)V")
	public static final void method461() {
		class18.field258 = true;
		class34.field573 = true;
		field1129 = true;
		class3.field32 = true;
	}

	public final void init() {
		field1126 = Integer.parseInt(getParameter("nodeid"));
		field1127 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method461();
		} else {
			method499();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1128 = false;
		} else {
			field1128 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method462(int arg0) {
		int var2 = class70.field1039[arg0].field1047;
		if (var2 != 0) {
			int var3 = field1190[arg0];
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
				field1295 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1200;

				if (var3 == 0) {
					method474(0, field1200);
					field1200 = true;
				}

				if (var3 == 1) {
					method474(-400, field1200);
					field1200 = true;
				}

				if (var3 == 2) {
					method474(-800, field1200);
					field1200 = true;
				}

				if (var3 == 3) {
					method474(-1200, field1200);
					field1200 = true;
				}

				if (var3 == 4) {
					field1200 = false;
				}

				if (field1200 != var4 && !field1129) {
					if (field1200) {
						field1336 = field1402;
						field1337 = true;
						field1367.method279(2, field1336);
					} else {
						method467();
					}

					field1076 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1480 = true;
					method494(0);
				}

				if (var3 == 1) {
					field1480 = true;
					method494(-400);
				}

				if (var3 == 2) {
					field1480 = true;
					method494(-800);
				}

				if (var3 == 3) {
					field1480 = true;
					method494(-1200);
				}

				if (var3 == 4) {
					field1480 = false;
				}
			}

			if (var2 == 5) {
				field1073 = var3;
			}

			if (var2 == 6) {
				field1409 = var3;
			}

			if (var2 == 8) {
				field1185 = var3;
				field1381 = true;
			}

			if (var2 == 9) {
				field1247 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method463(String arg0) {
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

	@ObfuscatedName("client.u(I)V")
	public final void method464() {
		int var1 = field1214 * 128 + 64;
		int var2 = field1215 * 128 + 64;
		int var3 = method550(var1, var2, field1286) - field1216;

		if (field1138 < var1) {
			field1138 += (var1 - field1138) * field1218 / 1000 + field1217;
			if (field1138 > var1) {
				field1138 = var1;
			}
		}

		if (field1138 > var1) {
			field1138 -= (field1138 - var1) * field1218 / 1000 + field1217;
			if (field1138 < var1) {
				field1138 = var1;
			}
		}

		if (field1139 < var3) {
			field1139 += (var3 - field1139) * field1218 / 1000 + field1217;
			if (field1139 > var3) {
				field1139 = var3;
			}
		}

		if (field1139 > var3) {
			field1139 -= (field1139 - var3) * field1218 / 1000 + field1217;
			if (field1139 < var3) {
				field1139 = var3;
			}
		}

		if (field1140 < var2) {
			field1140 += (var2 - field1140) * field1218 / 1000 + field1217;
			if (field1140 > var2) {
				field1140 = var2;
			}
		}

		if (field1140 > var2) {
			field1140 -= (field1140 - var2) * field1218 / 1000 + field1217;
			if (field1140 < var2) {
				field1140 = var2;
			}
		}

		int var4 = field1067 * 128 + 64;
		int var5 = field1068 * 128 + 64;
		int var6 = method550(var4, var5, field1286) - field1069;
		int var7 = var4 - field1138;
		int var8 = var6 - field1139;
		int var9 = var5 - field1140;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1141 < var11) {
			field1141 += (var11 - field1141) * field1071 / 1000 + field1070;
			if (field1141 > var11) {
				field1141 = var11;
			}
		}

		if (field1141 > var11) {
			field1141 -= (field1141 - var11) * field1071 / 1000 + field1070;
			if (field1141 < var11) {
				field1141 = var11;
			}
		}

		int var13 = var12 - field1142;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1142 += field1071 * var13 / 1000 + field1070;
			field1142 &= 0x7FF;
		}

		if (var13 < 0) {
			field1142 -= -var13 * field1071 / 1000 + field1070;
			field1142 &= 0x7FF;
		}

		int var14 = var12 - field1142;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1142 = var12;
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method465(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.v(I)V")
	public final void method466() {
		field1395 = 0;
		int var1 = (field1345.field360 >> 7) + field1332;
		int var2 = (field1345.field361 >> 7) + field1333;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1395 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1395 = 1;
		}

		if (field1395 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1395 = 0;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method467() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.x(I)V")
	public final void method468() {
		while (true) {
			class39 var1 = field1367.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field634, var1.field635);

				if ((field1367.method277(var1.field634) & 0x62) != 0) {
					field1401 = true;

					if (field1179 != -1) {
						field1381 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1336 == var1.field634 && var1.field635 != null) {
				method465(var1.field635, field1337);
			}

			if (var1.field633 == 3 && field1414 == 1) {
				for (int var2 = 0; var2 < field1392.length; var2++) {
					if (field1222[var2] == var1.field634) {
						field1392[var2] = var1.field635;

						if (var1.field635 == null) {
							field1222[var2] = -1;
						}

						break;
					}

					if (field1223[var2] == var1.field634) {
						field1098[var2] = var1.field635;

						if (var1.field635 == null) {
							field1223[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1367.method276(var1.field634)) {
				class3.method17(new class38(var1.field635), field1367);
			}
		}
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public final boolean method469(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method478(var2, arg0);
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

	@ObfuscatedName("client.y(I)V")
	public final void method470() {
		if (field1414 == 2) {
			for (class40 var1 = (class40) field1164.method248(); var1 != null; var1 = (class40) field1164.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field647, var1.field645))) {
						method512(var1.field641, var1.field640, var1.field639, var1.field646, var1.field638, var1.field647, var1.field645);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field644, var1.field642)) {
					method512(var1.field641, var1.field640, var1.field639, var1.field643, var1.field638, var1.field644, var1.field642);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1419 && !field1168 && !field1404) {
			field1114++;

			if (field1170) {
				method533();
			} else {
				method453();
			}

			method468();
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method471(int arg0) {
		int[] var2 = field1391.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1083[arg0][var7][var5] & 0x18) == 0) {
					field1403.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1083[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1403.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1391.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1083[arg0][var11][var10] & 0x18) == 0) {
					method534(var9, var10, arg0, var11, var8);
				}

				if (arg0 < 3 && (field1083[arg0 + 1][var11][var10] & 0x8) != 0) {
					method534(var9, var10, arg0 + 1, var11, var8);
				}
			}
		}

		field1435.method258();
		field1384 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1403.method79(field1286, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field848;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1410[field1286].field963;
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

						field1193[field1384] = field1203[var15];
						field1385[field1384] = var16;
						field1386[field1384] = var17;
						field1384++;
					}
				}
			}
		}

		field1061++;
		if (field1061 > 112) {
			field1061 = 0;
			field1242.method218(39);
			field1242.method219(50);
		}
	}

	@ObfuscatedName("client.d(Z)Z")
	public final boolean method472() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.z(I)Ljava/lang/String;")
	public final String method473() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method474(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public final void method475(class38 arg0, int arg1) {
		field1296 = 0;
		field1321 = 0;
		method527(arg1, arg0);
		method514(arg1, arg0);
		method509(arg1, arg0);
		method549(arg0, arg1);

		for (int var3 = 0; var3 < field1296; var3++) {
			int var4 = field1297[var3];
			if (field1114 != field1318[var4].field405) {
				field1318[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1319; var5++) {
			if (field1318[field1320[var5]] == null) {
				signlink.reporterror(field1225 + " null entry in pl list - pos:" + var5 + " size:" + field1319);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method476(long arg0) {
		if (arg0 != 0L) {
			if (field1084 >= 100 && field1467 != 1) {
				method536("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field1084 >= 200) {
				method536("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1084; var4++) {
					if (field1418[var4] == arg0) {
						method536("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1425; var5++) {
					if (field1368[var5] == arg0) {
						method536("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field1345.field416)) {
					field1453[field1084] = var3;
					field1418[field1084] = arg0;
					field1330[field1084] = 0;
					field1084++;
					field1401 = true;
					field1242.method218(176);
					field1242.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method477() {
		if (field1427 == 0 && field1145 == 0) {
			field1115[field1210] = "Walk here";
			field1089[field1210] = 718;
			field1087[field1210] = field17;
			field1088[field1210] = field18;
			field1210++;
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

				if (var6 == 2 && field1403.method80(field1286, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field862 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1427 == 1) {
						field1115[field1210] = "Use " + field1431 + " with @cya@" + var8.field831;
						field1089[field1210] = 810;
						field1090[field1210] = var3;
						field1087[field1210] = var4;
						field1088[field1210] = var5;
						field1210++;
					} else if (field1145 != 1) {
						if (var8.field847 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field847[var9] != null) {
									field1115[field1210] = var8.field847[var9] + " @cya@" + var8.field831;

									if (var9 == 0) {
										field1089[field1210] = 625;
									}

									if (var9 == 1) {
										field1089[field1210] = 721;
									}

									if (var9 == 2) {
										field1089[field1210] = 743;
									}

									if (var9 == 3) {
										field1089[field1210] = 357;
									}

									if (var9 == 4) {
										field1089[field1210] = 1071;
									}

									field1090[field1210] = var3;
									field1087[field1210] = var4;
									field1088[field1210] = var5;
									field1210++;
								}
							}
						}

						field1115[field1210] = "Examine @cya@" + var8.field831;
						field1089[field1210] = 1381;
						field1090[field1210] = var8.field828 << 14;
						field1087[field1210] = var4;
						field1088[field1210] = var5;
						field1210++;
					} else if ((field1147 & 0x4) == 4) {
						field1115[field1210] = field1148 + " @cya@" + var8.field831;
						field1089[field1210] = 899;
						field1090[field1210] = var3;
						field1087[field1210] = var4;
						field1088[field1210] = var5;
						field1210++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1195[var7];
					if (var10.field415.field882 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1196; var11++) {
							class26 var12 = field1195[field1197[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field882 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method559(var5, var12.field415, var4, field1197[var11]);
							}
						}

						for (int var13 = 0; var13 < field1319; var13++) {
							class27 var14 = field1318[field1320[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method504(var14, var4, var5, field1320[var13]);
							}
						}
					}

					method559(var5, var10.field415, var4, var7);
				}

				if (var6 == 0) {
					class27 var15 = field1318[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1196; var16++) {
							class26 var17 = field1195[field1197[var16]];
							if (var17 != null && var17.field415.field882 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method559(var5, var17.field415, var4, field1197[var16]);
							}
						}

						for (int var18 = 0; var18 < field1319; var18++) {
							class27 var19 = field1318[field1320[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method504(var19, var4, var5, field1320[var18]);
							}
						}
					}

					method504(var15, var4, var5, var7);
				}

				if (var6 == 3) {
					class41 var20 = field1123[field1286][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1427 == 1) {
								field1115[field1210] = "Use " + field1431 + " with @lre@" + var22.field917;
								field1089[field1210] = 111;
								field1090[field1210] = var21.field455;
								field1087[field1210] = var4;
								field1088[field1210] = var5;
								field1210++;
							} else if (field1145 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field931 != null && var22.field931[var23] != null) {
										field1115[field1210] = var22.field931[var23] + " @lre@" + var22.field917;

										if (var23 == 0) {
											field1089[field1210] = 139;
										}

										if (var23 == 1) {
											field1089[field1210] = 778;
										}

										if (var23 == 2) {
											field1089[field1210] = 617;
										}

										if (var23 == 3) {
											field1089[field1210] = 224;
										}

										if (var23 == 4) {
											field1089[field1210] = 662;
										}

										field1090[field1210] = var21.field455;
										field1087[field1210] = var4;
										field1088[field1210] = var5;
										field1210++;
									} else if (var23 == 2) {
										field1115[field1210] = "Take @lre@" + var22.field917;
										field1089[field1210] = 617;
										field1090[field1210] = var21.field455;
										field1087[field1210] = var4;
										field1088[field1210] = var5;
										field1210++;
									}
								}

								field1115[field1210] = "Examine @lre@" + var22.field917;
								field1089[field1210] = 1152;
								field1090[field1210] = var21.field455;
								field1087[field1210] = var4;
								field1088[field1210] = var5;
								field1210++;
							} else if ((field1147 & 0x1) == 1) {
								field1115[field1210] = field1148 + " @lre@" + var22.field917;
								field1089[field1210] = 370;
								field1090[field1210] = var21.field455;
								field1087[field1210] = var4;
								field1088[field1210] = var5;
								field1210++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILd;)I")
	public final int method478(int arg0, class4 arg1) {
		if (arg1.field71 == null || arg0 >= arg1.field71.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field71[arg0];
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
					var8 = field1194[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1188[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1202[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field909 && (!class60.method348(var11).field930 || field1128)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1190[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1325[field1188[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1190[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1345.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1012; var13++) {
						if (class67.field1014[var13]) {
							var8 += field1188[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field909 && (!class60.method348(var15).field930 || field1128)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1211;
				}

				if (var7 == 12) {
					var8 = field1455;
				}

				if (var7 == 13) {
					int var17 = field1190[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1030[var19];
					int var21 = var20.field1032;
					int var22 = var20.field1033;
					int var23 = var20.field1034;
					int var24 = field1180[var23 - var22];
					var8 = field1190[var21] >> var22 & var24;
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
					var8 = (field1345.field360 >> 7) + field1332;
				}

				if (var7 == 19) {
					var8 = (field1345.field361 >> 7) + field1333;
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

	@ObfuscatedName("client.A(I)V")
	public final void method479() {
		field1371 = false;
		while (field1307) {
			field1371 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1448 = null;
		field1449 = null;
		field1245 = null;
		field1457 = null;
		field1458 = null;
		field1459 = null;
		field1460 = null;
		field1360 = null;
		field1361 = null;
		field1229 = null;
		field1230 = null;
		field1120 = null;
		field1121 = null;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method480() {
		for (class40 var1 = (class40) field1164.method248(); var1 != null; var1 = (class40) field1164.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method526(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method481() {
		field1207++;
		if (field1207 > 192) {
			field1207 = 0;
			field1242.method218(57);
			field1242.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1066 != -1 && field1096 == field1066) {
						break;
					}

					if (field1388) {
						if (var1 >= 32 && var1 <= 122 && field1241.length() < 80) {
							field1241 = field1241 + (char) var1;
							field1381 = true;
						}

						if (var1 == 8 && field1241.length() > 0) {
							field1241 = field1241.substring(0, field1241.length() - 1);
							field1381 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1388 = false;
							field1381 = true;

							if (field1078 == 1) {
								long var2 = class51.method300(field1241);
								method476(var2);
							}

							if (field1078 == 2 && field1084 > 0) {
								long var4 = class51.method300(field1241);
								method537(var4);
							}

							if (field1078 == 3 && field1241.length() > 0) {
								field1242.method218(236);
								field1242.method219(0);
								int var6 = field1242.field621;
								field1242.method225(field1358);
								class52.method307(field1242, field1241);
								field1242.method228(field1242.field621 - var6);
								field1241 = class52.method308(field1241);
								field1241 = class71.method401(field1241);
								method536(class51.method304(class51.method301(field1358)), 6, field1241);

								if (field1426 == 2) {
									field1426 = 1;
									field1357 = true;
									field1242.method218(158);
									field1242.method219(field1167);
									field1242.method219(field1426);
									field1242.method219(field1285);
								}
							}

							if (field1078 == 4 && field1425 < 100) {
								long var7 = class51.method300(field1241);
								method561(var7);
							}

							if (field1078 == 5 && field1425 > 0) {
								long var9 = class51.method300(field1241);
								method511(var9);
							}
						}
					} else if (field1174) {
						if (var1 >= 48 && var1 <= 57 && field1432.length() < 10) {
							field1432 = field1432 + (char) var1;
							field1381 = true;
						}

						if (var1 == 8 && field1432.length() > 0) {
							field1432 = field1432.substring(0, field1432.length() - 1);
							field1381 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1432.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1432);
								} catch (Exception var18) {
								}

								field1242.method218(12);
								field1242.method223(var11);
							}

							field1174 = false;
							field1381 = true;
						}
					} else if (field1179 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1383.length() < 80) {
							field1383 = field1383 + (char) var1;
							field1381 = true;
						}

						if (var1 == 8 && field1383.length() > 0) {
							field1383 = field1383.substring(0, field1383.length() - 1);
							field1381 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1383.length() > 0) {
							if (field1163 == 2) {
								if (field1383.equals("::clientdrop")) {
									method502();
								}

								if (field1383.equals("::lag")) {
									method438();
								}

								if (field1383.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1367.method272(2); var12++) {
										field1367.method282(2, (byte) 1, var12);
									}
								}

								if (field1383.equals("::fpson")) {
									field1103 = true;
								}

								if (field1383.equals("::fpsoff")) {
									field1103 = false;
								}
							}

							if (field1383.startsWith("::")) {
								field1242.method218(95);
								field1242.method219(field1383.length() - 1);
								field1242.method226(field1383.substring(2));
							} else {
								String var13 = field1383.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1383 = field1383.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1383 = field1383.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1383 = field1383.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1383 = field1383.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1383 = field1383.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1383 = field1383.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1383 = field1383.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1383 = field1383.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1383 = field1383.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1383 = field1383.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1383 = field1383.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1383 = field1383.substring(6);
								}

								String var15 = field1383.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1383 = field1383.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1383 = field1383.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1383 = field1383.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1383 = field1383.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1383 = field1383.substring(6);
								}

								field1242.method218(29);
								field1242.method219(0);
								int var17 = field1242.field621;
								field1242.method219(var14);
								field1242.method219(var16);
								class52.method307(field1242, field1383);
								field1242.method228(field1242.field621 - var17);
								field1383 = class52.method308(field1383);
								field1383 = class71.method401(field1383);
								field1345.field372 = field1383;
								field1345.field374 = var14;
								field1345.field375 = var16;
								field1345.field373 = 150;

								if (field1163 == 2) {
									method536("@cr2@" + field1345.field416, 2, field1345.field372);
								} else if (field1163 == 1) {
									method536("@cr1@" + field1345.field416, 2, field1345.field372);
								} else {
									method536(field1345.field416, 2, field1345.field372);
								}

								if (field1167 == 2) {
									field1167 = 3;
									field1357 = true;
									field1242.method218(158);
									field1242.method219(field1167);
									field1242.method219(field1426);
									field1242.method219(field1285);
								}
							}

							field1383 = "";
							field1381 = true;
						}
					}
				}

				if (var1 == 8 && field1353.length() > 0) {
					field1353 = field1353.substring(0, field1353.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1353.length() < 12) {
				field1353 = field1353 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBZIIIIII)Z")
	public final boolean method482(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1329[var14][var15] = 0;
				field1213[var14][var15] = 99999999;
			}
		}

		int var16 = arg5;
		int var17 = arg8;
		field1329[arg5][arg8] = 99;
		field1213[arg5][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1461[var18] = arg5;
		int var35 = var18 + 1;
		field1462[var18] = arg8;
		boolean var20 = false;
		int var21 = field1461.length;
		int[][] var22 = field1410[field1286].field963;
		while (var35 != var19) {
			var16 = field1461[var19];
			var17 = field1462[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field1410[field1286].method368(arg7, var16, arg10, var17, arg6, arg2 - 1)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field1410[field1286].method369(arg7, var17, arg10, arg6, arg2 - 1, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg9 != 0 && field1410[field1286].method370(arg3, arg6, var17, arg9, arg1, arg10, var16)) {
				var20 = true;
				break;
			}

			int var23 = field1213[var16][var17] + 1;
			if (var16 > 0 && field1329[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1461[var35] = var16 - 1;
				field1462[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1329[var16 - 1][var17] = 2;
				field1213[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1329[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1461[var35] = var16 + 1;
				field1462[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1329[var16 + 1][var17] = 8;
				field1213[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1329[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1461[var35] = var16;
				field1462[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1329[var16][var17 - 1] = 1;
				field1213[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1329[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1461[var35] = var16;
				field1462[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1329[var16][var17 + 1] = 4;
				field1213[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1329[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1461[var35] = var16 - 1;
				field1462[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1329[var16 - 1][var17 - 1] = 3;
				field1213[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1329[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1461[var35] = var16 + 1;
				field1462[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1329[var16 + 1][var17 - 1] = 9;
				field1213[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1329[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1461[var35] = var16 - 1;
				field1462[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1329[var16 - 1][var17 + 1] = 6;
				field1213[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1329[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1461[var35] = var16 + 1;
				field1462[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1329[var16 + 1][var17 + 1] = 12;
				field1213[var16 + 1][var17 + 1] = var23;
			}
		}

		field1072 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1213[var26][var27] < var24) {
								var24 = field1213[var26][var27];
								var16 = var26;
								var17 = var27;
								field1072 = 1;
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
		field1461[var28] = var16;
		int var36 = var28 + 1;
		field1462[var28] = var17;
		int var29;
		int var30 = var29 = field1329[var16][var17];
		while (arg5 != var16 || arg8 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1461[var36] = var16;
				field1462[var36++] = var17;
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

			var30 = field1329[var16][var17];
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
		int var32 = field1461[var36];
		int var33 = field1462[var36];

		if (arg0 == 0) {
			field1242.method218(201);
			field1242.method219(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field1242.method218(77);
			field1242.method219(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field1242.method218(41);
			field1242.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1242.method219(1);
		} else {
			field1242.method219(0);
		}

		field1242.method220(field1332 + var32);
		field1242.method220(field1333 + var33);
		field1389 = field1461[0];
		field1390 = field1462[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1242.method219(field1461[var36] - var32);
			field1242.method219(field1462[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1164.method248(); var11 != null; var11 = (class40) field1164.method250()) {
			if (var11.field638 == arg3 && var11.field640 == arg8 && var11.field641 == arg4 && var11.field639 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg3;
			var10.field639 = arg0;
			var10.field640 = arg8;
			var10.field641 = arg4;
			method526(var10);
			field1164.method245(var10);
		}

		var10.field645 = arg5;
		var10.field647 = arg2;
		var10.field646 = arg7;
		var10.field648 = arg1;
		var10.field649 = arg6;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method484() {
		for (class32 var1 = (class32) field1420.method248(); var1 != null; var1 = (class32) field1420.method250()) {
			if (field1286 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1114 >= var1.field555) {
				var1.method151(field1060);

				if (var1.field562) {
					var1.method106();
				} else {
					field1403.method61(60, var1.field556, var1.field558, -1, var1, var1.field559, var1.field557, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;Z)Z")
	public final boolean method485(class4 arg0) {
		int var2 = arg0.field65;
		if (field1085 == 2) {
			if (var2 == 201) {
				field1381 = true;
				field1174 = false;
				field1388 = true;
				field1241 = "";
				field1078 = 1;
				field1192 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1381 = true;
				field1174 = false;
				field1388 = true;
				field1241 = "";
				field1078 = 2;
				field1192 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1379 = 250;
			return true;
		}

		if (var2 == 501) {
			field1381 = true;
			field1174 = false;
			field1388 = true;
			field1241 = "";
			field1078 = 4;
			field1192 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1381 = true;
			field1174 = false;
			field1388 = true;
			field1241 = "";
			field1078 = 5;
			field1192 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1443[var3];
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

					if (!class64.field978[var5].field984 && class64.field978[var5].field979 == var3 + (field1086 ? 0 : 7)) {
						break;
					}
				}

				field1443[var3] = var5;
				field1209 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1354[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1282[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1282[var6].length) {
					var8 = 0;
				}
			}

			field1354[var6] = var8;
			field1209 = true;
		}

		if (var2 == 324 && !field1086) {
			field1086 = true;
			method459();
		}

		if (var2 == 325 && field1086) {
			field1086 = false;
			method459();
		}

		if (var2 == 326) {
			field1242.method218(169);
			field1242.method219(field1086 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1242.method219(field1443[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1242.method219(field1354[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1309 = !field1309;
		}

		if (var2 >= 601 && var2 <= 612) {
			method542();

			if (field1353.length() > 0) {
				field1242.method218(91);
				field1242.method225(class51.method300(field1353));
				field1242.method219(var2 - 601);
				field1242.method219(field1309 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method486() {
		if (field1105 == null) {
			field10 = null;
			field1436 = null;
			field1434 = null;
			field1433 = null;
			field1435 = null;
			field1396 = null;
			field1397 = null;
			field1398 = null;
			field1108 = new class43(method11(), 128, 265);
			class33.method155();
			field1109 = new class43(method11(), 128, 265);
			class33.method155();
			field1105 = new class43(method11(), 509, 171);
			class33.method155();
			field1106 = new class43(method11(), 360, 132);
			class33.method155();
			field1107 = new class43(method11(), 360, 200);
			class33.method155();
			field1110 = new class43(method11(), 202, 238);
			class33.method155();
			field1111 = new class43(method11(), 203, 238);
			class33.method155();
			field1112 = new class43(method11(), 74, 94);
			class33.method155();
			field1113 = new class43(method11(), 75, 94);
			class33.method155();

			if (field1097 != null) {
				method443();
				method430();
			}

			field1295 = true;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = class31.field550[var7];
			int var13 = class31.field551[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field550[var8];
			int var16 = class31.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1138 = arg1 - var9;
		field1139 = arg3 - var10;
		field1140 = arg5 - var11;
		field1141 = arg0;
		field1142 = arg2;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method488() {
		field1264 = 0;
		for (int var1 = -1; var1 < field1319 + field1196; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1345;
			} else if (var1 < field1319) {
				var2 = field1318[field1320[var1]];
			} else {
				var2 = field1195[field1197[var1 - field1319]];
			}

			if (var2 != null && var2.method113()) {
				if (var1 >= field1319) {
					class59 var6 = ((class26) var2).field415;
					if (var6.field903 >= 0 && var6.field903 < field1231.length) {
						method490(var2, var2.field406 + 15);

						if (field1327 > -1) {
							field1231[var6.field903].method186(field1327 - 12, field1328 - 30);
						}
					}

					if (field1284 == 1 && field1197[var1 - field1319] == field1437 && field1114 % 20 < 10) {
						method490(var2, var2.field406 + 15);

						if (field1327 > -1) {
							field1231[2].method186(field1327 - 12, field1328 - 28);
						}
					}
				} else {
					int var3 = 30;
					class27 var4 = (class27) var2;
					if (var4.field419 != 0) {
						method490(var2, var2.field406 + 15);

						if (field1327 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field419 & 1 << var5) != 0) {
									field1231[var5].method186(field1327 - 12, field1328 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1284 == 10 && field1320[var1] == field1122) {
						method490(var2, var2.field406 + 15);

						if (field1327 > -1) {
							field1231[7].method186(field1327 - 12, field1328 - var3);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1319 || field1167 == 0 || field1167 == 3 || field1167 == 1 && method437(((class27) var2).field416))) {
					method490(var2, var2.field406);

					if (field1327 > -1 && field1264 < field1265) {
						field1269[field1264] = field1276.method205(var2.field372) / 2;
						field1268[field1264] = field1276.field617;
						field1266[field1264] = field1327;
						field1267[field1264] = field1328;
						field1270[field1264] = var2.field374;
						field1271[field1264] = var2.field375;
						field1272[field1264] = var2.field373;
						field1273[field1264++] = var2.field372;

						if (field1409 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1268[field1264] += 10;
							field1267[field1264] += 5;
						}

						if (field1409 == 0 && var2.field375 == 4) {
							field1269[field1264] = 60;
						}

						if (field1409 == 0 && var2.field375 == 5) {
							field1268[field1264] += 5;
						}
					}
				}

				if (var2.field379 > field1114) {
					method490(var2, var2.field406 + 15);

					if (field1327 > -1) {
						int var7 = var2.field380 * 30 / var2.field381;
						if (var7 > 30) {
							var7 = 30;
						}

						class33.method157(field1327 - 15, var7, 0xFF00, 5, field1328 - 3);
						class33.method157(field1327 + var7 - 15, 30 - var7, 0xFF0000, 5, field1328 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field378[var8] > field1114) {
						method490(var2, var2.field406 / 2);

						if (field1327 > -1) {
							if (var8 == 1) {
								field1328 -= 20;
							}

							if (var8 == 2) {
								field1327 -= 15;
								field1328 -= 10;
							}

							if (var8 == 3) {
								field1327 += 15;
								field1328 -= 10;
							}

							field1255[var2.field377[var8]].method186(field1327 - 12, field1328 - 12);
							field1274.method202(0, field1328 + 4, field1327, String.valueOf(var2.field376[var8]));
							field1274.method202(0xFFFFFF, field1328 + 3, field1327 - 1, String.valueOf(var2.field376[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1264; var9++) {
			int var10 = field1266[var9];
			int var11 = field1267[var9];
			int var12 = field1269[var9];
			int var13 = field1268[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1267[var15] - field1268[var15] && var11 - var13 < field1267[var15] + 2 && var10 - var12 < field1269[var15] + field1266[var15] && var10 + var12 > field1266[var15] - field1269[var15] && field1267[var15] - field1268[var15] < var11) {
						var11 = field1267[var15] - field1268[var15];
						var14 = true;
					}
				}
			}

			field1327 = field1266[var9];
			field1328 = field1267[var9] = var11;
			String var16 = field1273[var9];
			if (field1409 == 0) {
				int var17 = 0xFFFF00;
				if (field1270[var9] < 6) {
					var17 = field1476[field1270[var9]];
				}

				if (field1270[var9] == 6) {
					var17 = field1187 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1270[var9] == 7) {
					var17 = field1187 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1270[var9] == 8) {
					var17 = field1187 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1270[var9] == 9) {
					int var18 = 150 - field1272[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1270[var9] == 10) {
					int var19 = 150 - field1272[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1270[var9] == 11) {
					int var20 = 150 - field1272[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1271[var9] == 0) {
					field1276.method202(0, field1328 + 1, field1327, var16);
					field1276.method202(var17, field1328, field1327, var16);
				}

				if (field1271[var9] == 1) {
					field1276.method207(0, field1328 + 1, field1327, field1187, var16);
					field1276.method207(var17, field1328, field1327, field1187, var16);
				}

				if (field1271[var9] == 2) {
					field1276.method208(field1327, 0, field1328 + 1, var16, field1187);
					field1276.method208(field1327, var17, field1328, var16, field1187);
				}

				if (field1271[var9] == 3) {
					field1276.method209(field1328 + 1, var16, field1327, 150 - field1272[var9], field1187, 0);
					field1276.method209(field1328, var16, field1327, 150 - field1272[var9], field1187, var17);
				}

				if (field1271[var9] == 4) {
					int var21 = field1276.method205(var16);
					int var22 = (150 - field1272[var9]) * (var21 + 100) / 150;
					class33.method154(0, field1327 - 50, field1327 + 50, 334);
					field1276.method206(var16, 0, field1327 + 50 - var22, field1328 + 1);
					field1276.method206(var16, var17, field1327 + 50 - var22, field1328);
					class33.method153();
				}

				if (field1271[var9] == 5) {
					int var23 = 150 - field1272[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					class33.method154(field1328 - field1276.field617 - 1, 0, 512, field1328 + 5);
					field1276.method202(0, field1328 + var24 + 1, field1327, var16);
					field1276.method202(var17, field1328 + var24, field1327, var16);
					class33.method153();
				}
			} else {
				field1276.method202(0, field1328 + 1, field1327, var16);
				field1276.method202(0xFFFF00, field1328, field1327, var16);
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method489(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1321; var3++) {
			int var4 = field1322[var3];
			class26 var5 = field1195[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method229();
				int var8 = arg0.method229();
				var5.method114(var7, var8, field1114);
				var5.field379 = field1114 + 300;
				var5.field380 = arg0.method229();
				var5.field381 = arg0.method229();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method231();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg0.method229();
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
				var5.field382 = arg0.method231();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg0.method236();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method229();
				int var13 = arg0.method229();
				var5.method114(var12, var13, field1114);
				var5.field379 = field1114 + 300;
				var5.field380 = arg0.method229();
				var5.field381 = arg0.method229();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method341(arg0.method231());
				var5.field364 = var5.field415.field882;
				var5.field408 = var5.field415.field904;
				var5.field367 = var5.field415.field886;
				var5.field368 = var5.field415.field887;
				var5.field369 = var5.field415.field888;
				var5.field370 = var5.field415.field889;
				var5.field365 = var5.field415.field885;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg0.method231();
				int var14 = arg0.method234();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1114;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1114) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg0.method231();
				var5.field384 = arg0.method231();
			}
		}
	}

	@ObfuscatedName("client.a(ILy;I)V")
	public final void method490(class25 arg0, int arg1) {
		method491(arg0.field361, arg0.field360, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method491(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method550(arg1, arg0, field1286) - arg2;
			arg1 -= field1138;
			var4 -= field1139;
			arg0 -= field1140;
			int var5 = class31.field550[field1141];
			int var6 = class31.field551[field1141];
			int var7 = class31.field550[field1142];
			int var8 = class31.field551[field1142];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1327 = (var9 << 9) / arg0 + class34.field578;
				field1328 = (var11 << 9) / arg0 + class34.field579;
			} else {
				field1327 = -1;
				field1328 = -1;
			}
		} else {
			field1327 = -1;
			field1328 = -1;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method492() {
		if (field1129 && field1414 == 2 && class3.field33 != field1286) {
			field1435.method258();
			field1275.method202(0, 151, 257, "Loading - please wait.");
			field1275.method202(0xFFFFFF, 150, 256, "Loading - please wait.");
			field1435.method259(4, 4, field9);
			field1414 = 1;
			field1442 = System.currentTimeMillis();
		}

		if (field1414 == 1) {
			int var1 = method493();
			if (var1 != 0 && System.currentTimeMillis() - field1442 > 360000L) {
				signlink.reporterror(field1225 + " glcfb " + field1400 + "," + var1 + "," + field1129 + "," + field1077[0] + "," + field1367.method280() + "," + field1286 + "," + field1101 + "," + field1102);
				field1442 = System.currentTimeMillis();
			}
		}

		if (field1414 == 2 && field1286 != field1262) {
			field1262 = field1286;
			method471(field1286);
		}
	}

	@ObfuscatedName("client.F(I)I")
	public final int method493() {
		for (int var1 = 0; var1 < field1392.length; var1++) {
			if (field1392[var1] == null && field1222[var1] != -1) {
				return -1;
			}

			if (field1098[var1] == null && field1223[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1392.length; var3++) {
			byte[] var4 = field1098[var3];
			if (var4 != null) {
				int var5 = (field1221[var3] >> 8) * 64 - field1332;
				int var6 = (field1221[var3] & 0xFF) * 64 - field1333;
				var2 &= class3.method16(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1169) {
			return -4;
		} else {
			field1414 = 2;
			class3.field33 = field1286;
			method496();
			field1242.method218(218);
			return 0;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method494(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.G(I)Ljava/net/Socket;")
	public final Socket method495(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method496() {
		try {
			field1262 = -1;
			field1420.method252();
			field1326.method252();
			class34.method167();
			method529();
			field1403.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1410[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(field1083, 104, 104, field1133);
			int var3 = field1392.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1221[var4] >> 8;
				int var6 = field1221[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1403.method51(field1286);
			} else {
				field1403.method51(0);
			}

			field1242.method218(146);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1221[var7] >> 8) * 64 - field1332;
				int var9 = (field1221[var7] & 0xFF) * 64 - field1333;
				byte[] var10 = field1392[var7];
				if (var10 != null) {
					var2.method15((field1102 - 6) * 8, var10, (field1101 - 6) * 8, var8, var9);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1221[var11] >> 8) * 64 - field1332;
				int var13 = (field1221[var11] & 0xFF) * 64 - field1333;
				byte[] var14 = field1392[var11];
				if (var14 == null && field1102 < 800) {
					var2.method14(var12, var13, 64, 64);
				}
			}

			field1242.method218(146);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1098[var15];
				if (var16 != null) {
					int var17 = (field1221[var15] >> 8) * 64 - field1332;
					int var18 = (field1221[var15] & 0xFF) * 64 - field1333;
					var2.method18(field1410, var17, var16, field1403, var18);
				}
			}

			field1242.method218(146);
			var2.method20(field1403, field1410);
			field1435.method258();
			field1242.method218(146);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method538(var19, var20);
				}
			}

			method480();
		} catch (Exception var33) {
		}

		class57.field865.method103();

		if (field1129 && signlink.cache_dat != null) {
			int var22 = field1367.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1367.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1367.method283();
		int var25 = (field1101 - 6) / 8 - 1;
		int var26 = (field1101 + 6) / 8 + 1;
		int var27 = (field1102 - 6) / 8 - 1;
		int var28 = (field1102 + 6) / 8 + 1;
		if (field1299) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1367.method274(var29, 0, var30);
					if (var31 != -1) {
						field1367.method284(3, var31);
					}

					int var32 = field1367.method274(var29, 1, var30);
					if (var32 != -1) {
						field1367.method284(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method497() {
		if (field1411 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1136 + field1117 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1143 + 256) * var4 >> 8;
				var5 = (field1143 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1345.field360 + var6 >> 7;
				int var9 = field1345.field361 - var7 >> 7;
				boolean var10 = method482(1, 0, 0, 0, true, field1345.field410[0], var8, 0, field1345.field411[0], 0, var9);
				if (var10) {
					field1242.method219(var1);
					field1242.method219(var2);
					field1242.method220(field1117);
					field1242.method219(57);
					field1242.method219(field1136);
					field1242.method219(field1143);
					field1242.method219(89);
					field1242.method220(field1345.field360);
					field1242.method220(field1345.field361);
					field1242.method219(field1072);
					field1242.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)V")
	public final void method498(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1085 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1085 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1085 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1084;
				if (field1085 != 2) {
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
					arg0.field97 = field1453[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1084;
			if (field1085 != 2) {
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
				if (field1330[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1330[var2] == field1126) {
					arg0.field97 = "@gre@World-" + (field1330[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1330[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1084;
			if (field1085 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1085 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1085 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1425;
				if (field1085 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1368[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1425 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1114 / 40.0D) * 256.0D) & 0x7FF;

			if (field1209) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1443[var7];
					if (var8 >= 0 && !class64.field978[var8].method377()) {
						return;
					}
				}

				field1209 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1443[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field978[var12].method378();
					}
				}

				class31 var13 = new class31(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1354[var14] != 0) {
						var13.method140(field1282[var14][0], field1282[var14][field1354[var14]]);

						if (var14 == 1) {
							var13.method140(field1149[0], field1149[field1354[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field996[field1345.field365].field998[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field1232 == null) {
				field1232 = arg0.field103;
				field1233 = arg0.field104;
			}

			if (field1086) {
				arg0.field103 = field1233;
			} else {
				arg0.field103 = field1232;
			}
		} else if (var2 == 325) {
			if (field1232 == null) {
				field1232 = arg0.field103;
				field1233 = arg0.field104;
			}

			if (field1086) {
				arg0.field103 = field1232;
			} else {
				arg0.field103 = field1233;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1353;
			if (field1114 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1163 < 1) {
				arg0.field97 = "";
			} else if (field1309) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1304 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1306 == 0) {
					var15 = "earlier today";
				} else if (field1306 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1306 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1300 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1300 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1300 > 1) {
				arg0.field97 = field1300 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1366 == 201) {
				if (field1370 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1366 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1366 == 0) {
					var16 = "Earlier today";
				} else if (field1366 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1366 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1366 == 201) {
				if (field1370 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1366 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1366 == 201) {
				if (field1370 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1366 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 294);

			if (arg0.length == 5) {
				field1126 = Integer.parseInt(arg0[0]);
				field1127 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method461();
				} else if (arg0[2].equals("highmem")) {
					method499();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1128 = false;
				} else if (arg0[3].equals("members")) {
					field1128 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public static final void method499() {
		class18.field258 = false;
		class34.field573 = false;
		field1129 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method500(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1165 = "";
				field1166 = "Connecting to server...";
				method446(true);
			}

			field1099 = new class5(method495(field1127 + 43594), this);
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1242.field621 = 0;
			field1242.method219(14);
			field1242.method219(var6);
			field1099.method42(2, field1242.field620, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1099.method39();
			}

			int var8 = field1099.method39();
			if (var8 == 0) {
				field1099.method41(field1441.field620, 0, 8);
				field1441.field621 = 0;
				field1400 = field1441.method235();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1400 >> 32), (int) field1400 };
				field1242.field621 = 0;
				field1242.method219(10);
				field1242.method223(var9[0]);
				field1242.method223(var9[1]);
				field1242.method223(var9[2]);
				field1242.method223(var9[3]);
				field1242.method223(signlink.uid);
				field1242.method226(arg0);
				field1242.method226(arg1);
				field1242.method244(field1362, field1263);
				field1208.field621 = 0;

				if (arg2) {
					field1208.method219(18);
				} else {
					field1208.method219(16);
				}

				field1208.method219(field1242.field621 + 36 + 1 + 1 + 2);
				field1208.method219(255);
				field1208.method220(294);
				field1208.method219(field1129 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1208.method223(field1079[var10]);
				}

				field1208.method227(field1242.field620, 0, field1242.field621);
				field1242.field625 = new class49(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1234 = new class49(var9);
				field1099.method42(field1208.field621, field1208.field620, 0);
				var8 = field1099.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method500(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1163 = field1099.method39();
				field1305 = field1099.method39() == 1;
				field1131 = 0L;
				field1100 = 0;
				field1452.field870 = 0;
				field14 = true;
				field1244 = true;
				field1170 = true;
				field1242.field621 = 0;
				field1441.field621 = 0;
				field1376 = -1;
				field1176 = -1;
				field1177 = -1;
				field1178 = -1;
				field1375 = 0;
				field1377 = 0;
				field1423 = 0;
				field1379 = 0;
				field1284 = 0;
				field1210 = 0;
				field1387 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1065[var12] = null;
				}

				field1427 = 0;
				field1145 = 0;
				field1414 = 0;
				field1298 = 0;
				field1074 = (int) (Math.random() * 100.0D) - 50;
				field1372 = (int) (Math.random() * 110.0D) - 55;
				field1464 = (int) (Math.random() * 80.0D) - 40;
				field1136 = (int) (Math.random() * 120.0D) - 60;
				field1143 = (int) (Math.random() * 30.0D) - 20;
				field1117 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1411 = 0;
				field1262 = -1;
				field1389 = 0;
				field1390 = 0;
				field1319 = 0;
				field1196 = 0;

				for (int var13 = 0; var13 < field1316; var13++) {
					field1318[var13] = null;
					field1323[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1195[var14] = null;
				}

				field1345 = field1318[field1317] = new class27();
				field1326.method252();
				field1420.method252();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1123[var15][var16][var17] = null;
						}
					}
				}

				field1164 = new class41();
				field1085 = 0;
				field1084 = 0;
				field1315 = -1;
				field1179 = -1;
				field1066 = -1;
				field1181 = -1;
				field1293 = -1;
				field1205 = false;
				field1281 = 3;
				field1174 = false;
				field1387 = false;
				field1388 = false;
				field1198 = null;
				field1380 = 0;
				field1470 = -1;
				field1086 = true;
				method459();

				for (int var18 = 0; var18 < 5; var18++) {
					field1354[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1343[var19] = null;
					field1344[var19] = false;
				}

				field1359 = 0;
				field1175 = 0;
				field1204 = 0;
				field1246 = 0;
				field1479 = 0;
				field1104 = 0;
				field1080 = 0;
				field1283 = 0;
				field1125 = 0;
				method441();
			} else if (var8 == 3) {
				field1165 = "";
				field1166 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1165 = "Your account has been disabled.";
				field1166 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1165 = "Your account is already logged in.";
				field1166 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1165 = "RuneScape has been updated!";
				field1166 = "Please reload this page.";
			} else if (var8 == 7) {
				field1165 = "This world is full.";
				field1166 = "Please use a different world.";
			} else if (var8 == 8) {
				field1165 = "Unable to connect.";
				field1166 = "Login server offline.";
			} else if (var8 == 9) {
				field1165 = "Login limit exceeded.";
				field1166 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1165 = "Unable to connect.";
				field1166 = "Bad session id.";
			} else if (var8 == 11) {
				field1166 = "Login server rejected session.";
				field1166 = "Please try again.";
			} else if (var8 == 12) {
				field1165 = "You need a members account to login to this world.";
				field1166 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1165 = "Could not complete login.";
				field1166 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1165 = "The server is being updated.";
				field1166 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1170 = true;
				field1242.field621 = 0;
				field1441.field621 = 0;
				field1376 = -1;
				field1176 = -1;
				field1177 = -1;
				field1178 = -1;
				field1375 = 0;
				field1377 = 0;
				field1423 = 0;
				field1210 = 0;
				field1387 = false;
				field1442 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1165 = "Login attempts exceeded.";
				field1166 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1165 = "You are standing in a members-only area.";
				field1166 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1165 = "Invalid loginserver requested";
				field1166 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1099.method39(); var20 >= 0; var20--) {
					field1165 = "You have only just left another world";
					field1166 = "Your profile will be transferred in: " + var20 + " seconds";
					method446(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method500(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1165 = "No response from server";
				field1166 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1165 = "Unexpected server response";
				field1166 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1165 = "";
			field1166 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(Ld;IIIIIIIZ)V")
	public final void method501(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (field1424) {
			field1355 = 32;
		} else {
			field1355 = 0;
		}

		field1424 = false;
		if (arg6 >= arg5 && arg6 < arg5 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
			arg0.field76 -= field1382 * 4;

			if (arg7) {
				field1401 = true;
				return;
			}
		} else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg1 >= arg2 + arg4 - 16 && arg1 < arg2 + arg4) {
			arg0.field76 += field1382 * 4;

			if (arg7) {
				field1401 = true;
				return;
			}
		} else if (arg6 >= arg5 - field1355 && arg6 < arg5 + field1355 + 16 && arg1 >= arg4 + 16 && arg1 < arg2 + arg4 - 16 && field1382 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg4 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg0.field76 = (arg3 - arg2) * var10 / var11;

			if (arg7) {
				field1401 = true;
			}

			field1424 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method502() {
		if (field1379 > 0) {
			method445();
		} else {
			field1435.method258();
			field1275.method202(0, 144, 257, "Connection lost");
			field1275.method202(0xFFFFFF, 143, 256, "Connection lost");
			field1275.method202(0, 159, 257, "Please wait - attempting to reestablish");
			field1275.method202(0xFFFFFF, 158, 256, "Please wait - attempting to reestablish");
			field1435.method259(4, 4, field9);
			field1411 = 0;
			field1389 = 0;
			class5 var1 = field1099;
			field1170 = false;
			method500(field1225, field1226, true);

			if (!field1170) {
				method445();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method503(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1115[field1210] = "Remove @whi@" + arg0.field97;
				field1089[field1210] = 884;
				field1210++;
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

		field1115[field1210] = "Remove @whi@" + field1453[var2];
		field1089[field1210] = 513;
		field1210++;
		field1115[field1210] = "Message @whi@" + field1453[var2];
		field1089[field1210] = 902;
		field1210++;
		return true;
	}

	@ObfuscatedName("client.a(BLab;III)V")
	public final void method504(class27 arg0, int arg1, int arg2, int arg3) {
		if (field1345 != arg0 && field1210 < 400) {
			String var5;
			if (arg0.field423 == 0) {
				var5 = arg0.field416 + method451(field1345.field422, arg0.field422) + " (level-" + arg0.field422 + ")";
			} else {
				var5 = arg0.field416 + " (skill-" + arg0.field423 + ")";
			}

			if (field1427 == 1) {
				field1115[field1210] = "Use " + field1431 + " with @whi@" + var5;
				field1089[field1210] = 275;
				field1090[field1210] = arg3;
				field1087[field1210] = arg1;
				field1088[field1210] = arg2;
				field1210++;
			} else if (field1145 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1343[var6] != null) {
						field1115[field1210] = field1343[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1343[var6].equalsIgnoreCase("attack")) {
							if (arg0.field422 > field1345.field422) {
								var7 = 2000;
							}

							if (field1345.field439 != 0 && arg0.field439 != 0) {
								if (field1345.field439 == arg0.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1344[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1089[field1210] = var7 + 639;
						}

						if (var6 == 1) {
							field1089[field1210] = var7 + 499;
						}

						if (var6 == 2) {
							field1089[field1210] = var7 + 27;
						}

						if (var6 == 3) {
							field1089[field1210] = var7 + 387;
						}

						if (var6 == 4) {
							field1089[field1210] = var7 + 185;
						}

						field1090[field1210] = arg3;
						field1087[field1210] = arg1;
						field1088[field1210] = arg2;
						field1210++;
					}
				}
			} else if ((field1147 & 0x8) == 8) {
				field1115[field1210] = field1148 + " @whi@" + var5;
				field1089[field1210] = 131;
				field1090[field1210] = arg3;
				field1087[field1210] = arg1;
				field1088[field1210] = arg2;
				field1210++;
			}

			for (int var8 = 0; var8 < field1210; var8++) {
				if (field1089[var8] == 718) {
					field1115[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;Z)V")
	public final void method505(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1360.length; var3++) {
			field1360[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1360[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1361[var9] = (field1360[var9 - 1] + field1360[var9 + 1] + field1360[var9 - 128] + field1360[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1360;
			field1360 = field1361;
			field1361 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1360[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method506() {
		method429();

		if (field1291 == 1) {
			field1406[field1290 / 100].method186(field1288 - 8 - 4, field1289 - 8 - 4);
		}

		if (field1291 == 2) {
			field1406[field1290 / 100 + 4].method186(field1288 - 8 - 4, field1289 - 8 - 4);
			field1394++;
			if (field1394 > 57) {
				field1394 = 0;
				field1242.method218(254);
			}
		}

		if (field1293 != -1) {
			method545(field1060, field1293);
			method535(0, 0, class4.field56[field1293], 0);
		}

		if (field1066 != -1) {
			method545(field1060, field1066);
			method535(0, 0, class4.field56[field1066], 0);
		}

		method466();

		if (!field1387) {
			method510();
			method558();
		} else if (field1091 == 0) {
			method562();
		}

		if (field1380 == 1) {
			field1231[1].method186(472, 296);
		}

		if (field1103) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1275.method201(var3, "Fps:" + field5, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1129) {
				int var7 = 0xFF0000;
			}

			field1275.method201(0xFFFF00, "Mem:" + var5 + "k", var2, var1);
			var2 += 15;
		}

		if (field1423 != 0) {
			int var8 = field1423 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1275.method206("System update in: " + var9 + ":0" + var8, 0xFFFF00, 4, 329);
			} else {
				field1275.method206("System update in: " + var9 + ":" + var8, 0xFFFF00, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method507(boolean arg0) {
		if (field1345.field360 >> 7 == field1389 && field1345.field361 >> 7 == field1390) {
			field1389 = 0;
			field1132++;
			if (field1132 > 122) {
				field1132 = 0;
				field1242.method218(174);
				field1242.method219(62);
			}
		}

		int var2 = field1319;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1345;
				var5 = field1317 << 14;
			} else {
				var4 = field1318[field1320[var3]];
				var5 = field1320[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1129 && field1319 > 50 || field1319 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1114 < var4.field426 || field1114 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1369[var6][var7] == field1187) {
								continue;
							}

							field1369[var6][var7] = field1187;
						}

						var4.field425 = method550(var4.field360, var4.field361, field1286);
						field1403.method61(60, field1286, var4.field361, var5, var4, var4.field425, var4.field360, var4.field362, var4.field363);
					} else {
						var4.field436 = false;
						var4.field425 = method550(var4.field360, var4.field361, field1286);
						field1403.method62(var4.field425, var4.field360, var4.field435, var4.field432, var5, field1286, var4.field361, var4, var4.field362, var4.field433, var4.field434, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method508() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1168) {
			field1371 = false;
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

		if (field1404) {
			field1371 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1419) {
			field1371 = false;
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

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method509(int arg0, class38 arg1) {
		while (arg1.field622 + 10 < arg0 * 8) {
			int var3 = arg1.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1318[var3] == null) {
				field1318[var3] = new class27();
				if (field1323[var3] != null) {
					field1318[var3].method116(field1323[var3]);
				}
			}

			field1320[field1319++] = var3;
			class27 var4 = field1318[var3];
			var4.field405 = field1114;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(var7 == 1, field1345.field410[0] + var5, field1345.field411[0] + var6);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1322[field1321++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.I(I)V")
	public final void method510() {
		if (field1348 == 0) {
			field1115[0] = "Cancel";
			field1089[0] = 1106;
			field1210 = 1;
			method435();
			field1303 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1066 == -1) {
					method477();
				} else {
					method530(4, 4, class4.field56[field1066], field18, 0, field17);
				}
			}

			if (field1303 != field1220) {
				field1220 = field1303;
			}

			field1303 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1181 != -1) {
					method530(553, 205, class4.field56[field1181], field18, 0, field17);
				} else if (field1456[field1281] != -1) {
					method530(553, 205, class4.field56[field1456[field1281]], field18, 0, field17);
				}
			}

			if (field1303 != field1206) {
				field1401 = true;
				field1206 = field1303;
			}

			field1303 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1179 != -1) {
					method530(17, 357, class4.field56[field1179], field18, 0, field17);
				} else if (field18 < 434 && field17 < 426) {
					method547(field18 - 357, field17 - 17);
				}
			}

			if (field1179 != -1 && field1469 != field1303) {
				field1381 = true;
				field1469 = field1303;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1210 - 1; var2++) {
					if (field1089[var2] < 1000 && field1089[var2 + 1] > 1000) {
						String var3 = field1115[var2];
						field1115[var2] = field1115[var2 + 1];
						field1115[var2 + 1] = var3;
						int var4 = field1089[var2];
						field1089[var2] = field1089[var2 + 1];
						field1089[var2 + 1] = var4;
						int var5 = field1087[var2];
						field1087[var2] = field1087[var2 + 1];
						field1087[var2 + 1] = var5;
						int var6 = field1088[var2];
						field1088[var2] = field1088[var2 + 1];
						field1088[var2 + 1] = var6;
						int var7 = field1090[var2];
						field1090[var2] = field1090[var2 + 1];
						field1090[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method511(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1425; var3++) {
				if (field1368[var3] == arg0) {
					field1425--;
					field1401 = true;

					for (int var4 = var3; var4 < field1425; var4++) {
						field1368[var4] = field1368[var4 + 1];
					}

					field1242.method218(228);
					field1242.method225(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg0 >= 1 && arg1 <= 102 && arg0 <= 102) {
			if (field1129 && field1286 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field1403.method76(arg4, arg1, arg0);
			}

			if (arg2 == 1) {
				var8 = field1403.method77(arg1, arg0, arg4);
			}

			if (arg2 == 2) {
				var8 = field1403.method78(arg4, arg1, arg0);
			}

			if (arg2 == 3) {
				var8 = field1403.method79(arg4, arg1, arg0);
			}

			if (var8 != 0) {
				int var12 = field1403.method80(arg4, arg1, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field1403.method67(arg1, arg0, arg4);
					class57 var16 = class57.method330(var13);
					if (var16.field837) {
						field1410[arg4].method364(var16.field838, var15, arg0, arg1, var14);
					}
				}

				if (arg2 == 1) {
					field1403.method68(arg4, arg1, arg0);
				}

				if (arg2 == 2) {
					field1403.method69(arg1, arg4, arg0);
					class57 var17 = class57.method330(var13);
					if (var17.field835 + arg1 > 103 || var17.field835 + arg0 > 103 || var17.field836 + arg1 > 103 || var17.field836 + arg0 > 103) {
						return;
					}

					if (var17.field837) {
						field1410[arg4].method365(var17.field838, arg1, var17.field835, var15, var17.field836, arg0);
					}
				}

				if (arg2 == 3) {
					field1403.method70(arg4, arg0, arg1);
					class57 var18 = class57.method330(var13);
					if (var18.field837 && var18.field839) {
						field1410[arg4].method367(arg0, arg1);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field1083[1][arg1][arg0] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				class3.method31(arg0, arg3, arg4, field1403, var19, field1410[arg4], field1133, arg5, arg6, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method513() {
		for (int var1 = -1; var1 < field1319; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1317;
			} else {
				var2 = field1320[var1];
			}

			class27 var3 = field1318[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1196; var4++) {
			int var5 = field1197[var4];
			class26 var6 = field1195[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void method514(int arg0, class38 arg1) {
		int var3 = arg1.method240(8);
		if (var3 < field1319) {
			for (int var4 = var3; var4 < field1319; var4++) {
				field1297[field1296++] = field1320[var4];
			}
		}

		if (var3 > field1319) {
			signlink.reporterror(field1225 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1319 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1320[var5];
			class27 var7 = field1318[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1320[field1319++] = var6;
				var7.field405 = field1114;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1320[field1319++] = var6;
					var7.field405 = field1114;
					field1322[field1321++] = var6;
				} else if (var9 == 1) {
					field1320[field1319++] = var6;
					var7.field405 = field1114;
					int var10 = arg1.method240(3);
					var7.method111(var10, false);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1322[field1321++] = var6;
					}
				} else if (var9 == 2) {
					field1320[field1319++] = var6;
					var7.field405 = field1114;
					int var12 = arg1.method240(3);
					var7.method111(var12, true);
					int var13 = arg1.method240(3);
					var7.method111(var13, true);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1322[field1321++] = var6;
					}
				} else if (var9 == 3) {
					field1297[field1296++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method515() {
		for (int var1 = 0; var1 < field1196; var1++) {
			int var2 = field1197[var1];
			class26 var3 = field1195[var2];
			if (var3 != null) {
				method516(var3.field415.field882, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILy;)V")
	public final void method516(int arg0, class25 arg1) {
		if (arg1.field360 < 128 || arg1.field361 < 128 || arg1.field360 >= 13184 || arg1.field361 >= 13184) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (field1345 == arg1 && (arg1.field360 < 1536 || arg1.field361 < 1536 || arg1.field360 >= 11776 || arg1.field361 >= 11776)) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (arg1.field402 > field1114) {
			method517(arg1);
		} else if (arg1.field403 >= field1114) {
			method518(arg1);
		} else {
			method519(arg1);
		}

		method520(arg1);
		method521(arg1);
	}

	@ObfuscatedName("client.a(Ly;Z)V")
	public final void method517(class25 arg0) {
		int var2 = arg0.field402 - field1114;
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
	public final void method518(class25 arg0) {
		if (field1114 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field996[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1114 - arg0.field402;
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

	@ObfuscatedName("client.a(ZLy;)V")
	public final void method519(class25 arg0) {
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

	@ObfuscatedName("client.b(ZLy;)V")
	public final void method520(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1195[arg0.field382];
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
				if (field1287 == var5) {
					var5 = field1317;
				}

				class27 var6 = field1318[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1332 - field1332) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1333 - field1333) * 64;
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
	public final void method521(class25 arg0) {
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

		if (arg0.field393 != -1 && field1114 >= arg0.field396) {
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
			if (var4.field1008 == 1 && arg0.field414 > 0 && arg0.field402 <= field1114 && arg0.field403 < field1114) {
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

	@ObfuscatedName("client.K(I)V")
	public final void method522() {
		if (field1295) {
			field1295 = false;
			field1154.method259(0, 4, field9);
			field1155.method259(0, 357, field9);
			field1156.method259(722, 4, field9);
			field1157.method259(743, 205, field9);
			field1158.method259(0, 0, field9);
			field1159.method259(516, 4, field9);
			field1160.method259(516, 205, field9);
			field1161.method259(496, 357, field9);
			field1162.method259(0, 338, field9);
			field1401 = true;
			field1381 = true;
			field1201 = true;
			field1357 = true;

			if (field1414 != 2) {
				field1435.method259(4, 4, field9);
				field1434.method259(550, 4, field9);
			}
		}

		if (field1414 == 2) {
			method544();
		}

		if (field1387 && field1091 == 1) {
			field1401 = true;
		}

		if (field1181 != -1) {
			boolean var1 = method545(field1060, field1181);
			if (var1) {
				field1401 = true;
			}
		}

		if (field1314 == 2) {
			field1401 = true;
		}

		if (field1348 == 2) {
			field1401 = true;
		}

		if (field1401) {
			method553();
			field1401 = false;
		}

		if (field1179 == -1) {
			field1082.field76 = field1338 - field1463 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method501(field1082, field18 - 357, 77, field1338, 0, 463, field17 - 17, false);
			}

			int var2 = field1338 - field1082.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1338 - 77) {
				var2 = field1338 - 77;
			}

			if (field1463 != var2) {
				field1463 = var2;
				field1381 = true;
			}
		}

		if (field1179 != -1) {
			boolean var3 = method545(field1060, field1179);
			if (var3) {
				field1381 = true;
			}
		}

		if (field1314 == 3) {
			field1381 = true;
		}

		if (field1348 == 3) {
			field1381 = true;
		}

		if (field1198 != null) {
			field1381 = true;
		}

		if (field1387 && field1091 == 2) {
			field1381 = true;
		}

		if (field1381) {
			method439();
			field1381 = false;
		}

		if (field1414 == 2) {
			method523();
			field1434.method259(550, 4, field9);
		}

		if (field1470 != -1) {
			field1201 = true;
		}

		if (field1201) {
			if (field1470 != -1 && field1470 == field1281) {
				field1470 = -1;
				field1242.method218(53);
				field1242.method219(field1281);
			}

			field1201 = false;
			field1398.method258();
			field1173.method199(0, 0);

			if (field1181 == -1) {
				if (field1456[field1281] != -1) {
					if (field1281 == 0) {
						field1249.method199(22, 10);
					}

					if (field1281 == 1) {
						field1250.method199(54, 8);
					}

					if (field1281 == 2) {
						field1250.method199(82, 8);
					}

					if (field1281 == 3) {
						field1251.method199(110, 8);
					}

					if (field1281 == 4) {
						field1253.method199(153, 8);
					}

					if (field1281 == 5) {
						field1253.method199(181, 8);
					}

					if (field1281 == 6) {
						field1252.method199(209, 9);
					}
				}

				if (field1456[0] != -1 && (field1470 != 0 || field1114 % 20 < 10)) {
					field1184[0].method199(29, 13);
				}

				if (field1456[1] != -1 && (field1470 != 1 || field1114 % 20 < 10)) {
					field1184[1].method199(53, 11);
				}

				if (field1456[2] != -1 && (field1470 != 2 || field1114 % 20 < 10)) {
					field1184[2].method199(82, 11);
				}

				if (field1456[3] != -1 && (field1470 != 3 || field1114 % 20 < 10)) {
					field1184[3].method199(115, 12);
				}

				if (field1456[4] != -1 && (field1470 != 4 || field1114 % 20 < 10)) {
					field1184[4].method199(153, 13);
				}

				if (field1456[5] != -1 && (field1470 != 5 || field1114 % 20 < 10)) {
					field1184[5].method199(180, 11);
				}

				if (field1456[6] != -1 && (field1470 != 6 || field1114 % 20 < 10)) {
					field1184[6].method199(208, 13);
				}
			}

			field1398.method259(516, 160, field9);
			field1397.method258();
			field1172.method199(0, 0);

			if (field1181 == -1) {
				if (field1456[field1281] != -1) {
					if (field1281 == 7) {
						field1471.method199(42, 0);
					}

					if (field1281 == 8) {
						field1472.method199(74, 0);
					}

					if (field1281 == 9) {
						field1472.method199(102, 0);
					}

					if (field1281 == 10) {
						field1473.method199(130, 1);
					}

					if (field1281 == 11) {
						field1475.method199(173, 0);
					}

					if (field1281 == 12) {
						field1475.method199(201, 0);
					}

					if (field1281 == 13) {
						field1474.method199(229, 0);
					}
				}

				if (field1456[8] != -1 && (field1470 != 8 || field1114 % 20 < 10)) {
					field1184[7].method199(74, 2);
				}

				if (field1456[9] != -1 && (field1470 != 9 || field1114 % 20 < 10)) {
					field1184[8].method199(102, 3);
				}

				if (field1456[10] != -1 && (field1470 != 10 || field1114 % 20 < 10)) {
					field1184[9].method199(137, 4);
				}

				if (field1456[11] != -1 && (field1470 != 11 || field1114 % 20 < 10)) {
					field1184[10].method199(174, 2);
				}

				if (field1456[12] != -1 && (field1470 != 12 || field1114 % 20 < 10)) {
					field1184[11].method199(201, 2);
				}

				if (field1456[13] != -1 && (field1470 != 13 || field1114 % 20 < 10)) {
					field1184[12].method199(226, 2);
				}
			}

			field1397.method259(496, 466, field9);
			field1435.method258();
		}

		if (field1357) {
			field1357 = false;
			field1396.method258();
			field1171.method199(0, 0);
			field1275.method203(55, true, 28, 0xFFFFFF, "Public chat");

			if (field1167 == 0) {
				field1275.method203(55, true, 41, 0xFF00, "On");
			}

			if (field1167 == 1) {
				field1275.method203(55, true, 41, 0xFFFF00, "Friends");
			}

			if (field1167 == 2) {
				field1275.method203(55, true, 41, 0xFF0000, "Off");
			}

			if (field1167 == 3) {
				field1275.method203(55, true, 41, 0xFFFF, "Hide");
			}

			field1275.method203(184, true, 28, 0xFFFFFF, "Private chat");

			if (field1426 == 0) {
				field1275.method203(184, true, 41, 0xFF00, "On");
			}

			if (field1426 == 1) {
				field1275.method203(184, true, 41, 0xFFFF00, "Friends");
			}

			if (field1426 == 2) {
				field1275.method203(184, true, 41, 0xFF0000, "Off");
			}

			field1275.method203(324, true, 28, 0xFFFFFF, "Trade/compete");

			if (field1285 == 0) {
				field1275.method203(324, true, 41, 0xFF00, "On");
			}

			if (field1285 == 1) {
				field1275.method203(324, true, 41, 0xFFFF00, "Friends");
			}

			if (field1285 == 2) {
				field1275.method203(324, true, 41, 0xFF0000, "Off");
			}

			field1275.method203(458, true, 33, 0xFFFFFF, "Report abuse");
			field1396.method259(0, 453, field9);
			field1435.method258();
		}

		field1060 = 0;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method10() {
		field1295 = true;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method523() {
		field1434.method258();

		if (field1411 == 2) {
			byte[] var1 = field1152.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1308.method190(field1405, field1351, field1117, 0, 256, 33, 0, 25, 25, 33);
			field1435.method258();
		} else {
			int var5 = field1136 + field1117 & 0x7FF;
			int var6 = field1345.field360 / 32 + 48;
			int var7 = 464 - field1345.field361 / 32;
			field1391.method190(field1081, field1374, var5, 5, field1143 + 256, 146, 25, var6, var7, 151);
			field1308.method190(field1405, field1351, field1117, 0, 256, 33, 0, 25, 25, 33);

			for (int var8 = 0; var8 < field1384; var8++) {
				int var9 = field1385[var8] * 4 + 2 - field1345.field360 / 32;
				int var10 = field1386[var8] * 4 + 2 - field1345.field361 / 32;
				method543(var10, field1193[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1123[field1286][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1345.field360 / 32;
						int var15 = var12 * 4 + 2 - field1345.field361 / 32;
						method543(var15, field1444, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field1196; var16++) {
				class26 var17 = field1195[field1197[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field905 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field896) {
						int var19 = var17.field360 / 32 - field1345.field360 / 32;
						int var20 = var17.field361 / 32 - field1345.field361 / 32;
						method543(var20, field1445, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field1319; var21++) {
				class27 var22 = field1318[field1320[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1345.field360 / 32;
					int var24 = var22.field361 / 32 - field1345.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1084; var28++) {
						if (field1418[var28] == var26 && field1330[var28] != 0) {
							var25 = true;
							break;
						}
					}

					if (field1345.field439 != 0 && var22.field439 != 0) {
						if (field1345.field439 == var22.field439) {
							var25 = true;
						} else {
							var25 = false;
						}
					}

					if (var25) {
						method543(var24, field1447, var23);
					} else {
						method543(var24, field1446, var23);
					}
				}
			}

			if (field1284 != 0 && field1114 % 20 < 10) {
				if (field1284 == 1 && field1437 >= 0 && field1437 < field1195.length) {
					class26 var29 = field1195[field1437];
					if (var29 != null) {
						int var30 = var29.field360 / 32 - field1345.field360 / 32;
						int var31 = var29.field361 / 32 - field1345.field361 / 32;
						method450(field1228, var31, var30);
					}
				}

				if (field1284 == 2) {
					int var32 = (field1236 - field1332) * 4 + 2 - field1345.field360 / 32;
					int var33 = (field1237 - field1333) * 4 + 2 - field1345.field361 / 32;
					method450(field1228, var33, var32);
				}

				if (field1284 == 10 && field1122 >= 0 && field1122 < field1318.length) {
					class27 var34 = field1318[field1122];
					if (var34 != null) {
						int var35 = var34.field360 / 32 - field1345.field360 / 32;
						int var36 = var34.field361 / 32 - field1345.field361 / 32;
						method450(field1228, var36, var35);
					}
				}
			}

			if (field1389 != 0) {
				int var37 = field1389 * 4 + 2 - field1345.field360 / 32;
				int var38 = field1390 * 4 + 2 - field1345.field361 / 32;
				method543(var38, field1227, var37);
			}

			class33.method157(97, 3, 0xFFFFFF, 3, 78);
			field1435.method258();
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method524() {
		for (int var1 = -1; var1 < field1319; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1317;
			} else {
				var2 = field1320[var1];
			}

			class27 var3 = field1318[var2];
			if (var3 != null) {
				method516(1, var3);
			}
		}
	}

	@ObfuscatedName("client.e(II)Z")
	public final boolean method525(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1089[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BLnb;)V")
	public final void method526(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1403.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1403.method77(arg0.field640, arg0.field641, arg0.field638);
		}

		if (arg0.field639 == 2) {
			var2 = field1403.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1403.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1403.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.a(ILlb;Z)V")
	public final void method527(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(1);
		if (var3 != 0) {
			int var4 = arg1.method240(2);
			if (var4 == 0) {
				field1322[field1321++] = field1317;
			} else if (var4 == 1) {
				int var5 = arg1.method240(3);
				field1345.method111(var5, false);
				int var6 = arg1.method240(1);
				if (var6 == 1) {
					field1322[field1321++] = field1317;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method240(3);
				field1345.method111(var7, true);
				int var8 = arg1.method240(3);
				field1345.method111(var8, true);
				int var9 = arg1.method240(1);
				if (var9 == 1) {
					field1322[field1321++] = field1317;
				}
			} else if (var4 == 3) {
				field1286 = arg1.method240(2);
				int var10 = arg1.method240(7);
				int var11 = arg1.method240(7);
				int var12 = arg1.method240(1);
				field1345.method110(var12 == 1, var10, var11);
				int var13 = arg1.method240(1);
				if (var13 == 1) {
					field1322[field1321++] = field1317;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public static final String method528(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.L(I)V")
	public final void method529() {
		class57.field865.method103();
		class57.field866.method103();
		class59.field908.method103();
		class60.field955.method103();
		class60.field956.method103();
		class27.field440.method103();
		class68.field1028.method103();
	}

	@ObfuscatedName("client.a(IILd;IIII)V")
	public final void method530(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
		if (arg2.field63 == 0 && arg2.field78 != null && !arg2.field77 && (arg5 >= arg0 && arg3 >= arg1 && arg5 <= arg2.field66 + arg0 && arg3 <= arg2.field67 + arg1)) {
			int var7 = arg2.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field79[var8] + arg0;
				int var10 = arg2.field80[var8] + arg1 - arg4;
				class4 var11 = class4.field56[arg2.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1303 = var11.field74;
					} else {
						field1303 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method530(var9, var10, var11, arg3, var11.field76, arg5);

					if (var11.field75 > var11.field67) {
						method501(var11, arg3, var11.field67, var11.field75, var10, var11.field66 + var9, arg5, true);
					}
				} else {
					if (var11.field64 == 1 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method503(var11);
						}

						if (!var12) {
							field1115[field1210] = var11.field117;
							field1089[field1210] = 231;
							field1088[field1210] = var11.field61;
							field1210++;
						}
					}

					if (var11.field64 == 2 && field1145 == 0 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1115[field1210] = var13 + " @gre@" + var11.field115;
						field1089[field1210] = 274;
						field1088[field1210] = var11.field61;
						field1210++;
					}

					if (var11.field64 == 3 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1115[field1210] = "Close";
						field1089[field1210] = 737;
						field1088[field1210] = var11.field61;
						field1210++;
					}

					if (var11.field64 == 4 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1115[field1210] = var11.field117;
						field1089[field1210] = 435;
						field1088[field1210] = var11.field61;
						field1210++;
					}

					if (var11.field64 == 5 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1115[field1210] = var11.field117;
						field1089[field1210] = 225;
						field1088[field1210] = var11.field61;
						field1210++;
					}

					if (var11.field64 == 6 && !field1205 && arg5 >= var9 && arg3 >= var10 && arg5 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1115[field1210] = var11.field117;
						field1089[field1210] = 997;
						field1088[field1210] = var11.field61;
						field1210++;
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

								if (arg5 >= var17 && arg3 >= var18 && arg5 < var17 + 32 && arg3 < var18 + 32) {
									field1340 = var14;
									field1341 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1427 == 1 && var11.field84) {
											if (field1429 != var11.field61 || field1428 != var14) {
												field1115[field1210] = "Use " + field1431 + " with @lre@" + var19.field917;
												field1089[field1210] = 398;
												field1090[field1210] = var19.field915;
												field1087[field1210] = var14;
												field1088[field1210] = var11.field61;
												field1210++;
											}
										} else if (field1145 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field932 != null && var19.field932[var20] != null) {
														field1115[field1210] = var19.field932[var20] + " @lre@" + var19.field917;

														if (var20 == 3) {
															field1089[field1210] = 681;
														}

														if (var20 == 4) {
															field1089[field1210] = 100;
														}

														field1090[field1210] = var19.field915;
														field1087[field1210] = var14;
														field1088[field1210] = var11.field61;
														field1210++;
													} else if (var20 == 4) {
														field1115[field1210] = "Drop @lre@" + var19.field917;
														field1089[field1210] = 100;
														field1090[field1210] = var19.field915;
														field1087[field1210] = var14;
														field1088[field1210] = var11.field61;
														field1210++;
													}
												}
											}

											if (var11.field85) {
												field1115[field1210] = "Use @lre@" + var19.field917;
												field1089[field1210] = 102;
												field1090[field1210] = var19.field915;
												field1087[field1210] = var14;
												field1088[field1210] = var11.field61;
												field1210++;
											}

											if (var11.field84 && var19.field932 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field932[var21] != null) {
														field1115[field1210] = var19.field932[var21] + " @lre@" + var19.field917;

														if (var21 == 0) {
															field1089[field1210] = 694;
														}

														if (var21 == 1) {
															field1089[field1210] = 962;
														}

														if (var21 == 2) {
															field1089[field1210] = 795;
														}

														field1090[field1210] = var19.field915;
														field1087[field1210] = var14;
														field1088[field1210] = var11.field61;
														field1210++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1115[field1210] = var11.field92[var22] + " @lre@" + var19.field917;

														if (var22 == 0) {
															field1089[field1210] = 582;
														}

														if (var22 == 1) {
															field1089[field1210] = 113;
														}

														if (var22 == 2) {
															field1089[field1210] = 555;
														}

														if (var22 == 3) {
															field1089[field1210] = 331;
														}

														if (var22 == 4) {
															field1089[field1210] = 354;
														}

														field1090[field1210] = var19.field915;
														field1087[field1210] = var14;
														field1088[field1210] = var11.field61;
														field1210++;
													}
												}
											}

											field1115[field1210] = "Examine @lre@" + var19.field917;
											field1089[field1210] = 1328;
											field1090[field1210] = var19.field915;
											field1087[field1210] = var14;
											field1088[field1210] = var11.field61;
											field1210++;
										} else if ((field1147 & 0x10) == 0x10) {
											field1115[field1210] = field1148 + " @lre@" + var19.field917;
											field1089[field1210] = 563;
											field1090[field1210] = var19.field915;
											field1087[field1210] = var14;
											field1088[field1210] = var11.field61;
											field1210++;
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

	public final void run() {
		if (field1468) {
			method560();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method531() {
		try {
			int var1 = field1345.field360 + field1074;
			int var2 = field1345.field361 + field1372;
			if (field1258 - var1 < -500 || field1258 - var1 > 500 || field1259 - var2 < -500 || field1259 - var2 > 500) {
				field1258 = var1;
				field1259 = var2;
			}

			if (field1258 != var1) {
				field1258 += (var1 - field1258) / 16;
			}

			if (field1259 != var2) {
				field1259 += (var2 - field1259) / 16;
			}

			if (field27[1] == 1) {
				field1118 += (-field1118 - 24) / 2;
			} else if (field27[2] == 1) {
				field1118 += (24 - field1118) / 2;
			} else {
				field1118 /= 2;
			}

			if (field27[3] == 1) {
				field1119 += (12 - field1119) / 2;
			} else if (field27[4] == 1) {
				field1119 += (-field1119 - 12) / 2;
			} else {
				field1119 /= 2;
			}

			field1117 = field1118 / 2 + field1117 & 0x7FF;
			field1116 += field1119 / 2;
			if (field1116 < 128) {
				field1116 = 128;
			}

			if (field1116 > 383) {
				field1116 = 383;
			}

			int var3 = field1258 >> 7;
			int var4 = field1259 >> 7;
			int var5 = method550(field1258, field1259, field1286);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1286;
						if (var9 < 3 && (field1083[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1133[var9][var7][var8];
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

			if (var11 > field1189) {
				field1189 += (var11 - field1189) / 24;
			} else if (var11 < field1189) {
				field1189 += (var11 - field1189) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1345.field360 + "," + field1345.field361 + "," + field1258 + "," + field1259 + "," + field1101 + "," + field1102 + "," + field1332 + "," + field1333);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method532(String arg0) throws IOException {
		if (field1219) {
			if (field1421 != null) {
				try {
					field1421.close();
				} catch (Exception var4) {
				}

				field1421 = null;
			}

			field1421 = method495(43595);
			field1421.setSoTimeout(10000);
			InputStream var2 = field1421.getInputStream();
			OutputStream var3 = field1421.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.M(I)V")
	public final void method533() {
		if (field1423 > 1) {
			field1423--;
		}

		if (field1379 > 0) {
			field1379--;
		}

		for (int var1 = 0; var1 < 5 && method444(); var1++) {
		}

		if (field1170) {
			synchronized (field1452.field869) {
				if (!field1305) {
					field1452.field870 = 0;
				} else if (field23 != 0 || field1452.field870 >= 40) {
					field1242.method218(1);
					field1242.method219(0);
					int var3 = field1242.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1452.field870 && var3 - field1242.field621 < 240; var5++) {
						var4++;
						int var6 = field1452.field872[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1452.field871[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1452.field872[var5] == -1 && field1452.field871[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1407 != var7 || field1408 != var6) {
							int var9 = var7 - field1407;
							field1407 = var7;
							int var10 = var6 - field1408;
							field1408 = var6;

							if (field1100 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1242.method220((field1100 << 12) + (var9 << 6) + var10);
								field1100 = 0;
							} else if (field1100 < 8) {
								field1242.method222((field1100 << 19) + var8 + 0x800000);
								field1100 = 0;
							} else {
								field1242.method223((field1100 << 19) + var8 - 0x40000000);
								field1100 = 0;
							}
						} else if (field1100 < 2047) {
							field1100++;
						}
					}

					field1242.method228(field1242.field621 - var3);

					if (var4 >= field1452.field870) {
						field1452.field870 = 0;
					} else {
						field1452.field870 -= var4;
						for (int var11 = 0; var11 < field1452.field870; var11++) {
							field1452.field871[var11] = field1452.field871[var4 + var11];
							field1452.field872[var11] = field1452.field872[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1131) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1131 = field26;
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
				field1242.method218(131);
				field1242.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1260 > 0) {
				field1260--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1261 = true;
			}

			if (field1261 && field1260 <= 0) {
				field1260 = 20;
				field1261 = false;
				field1242.method218(65);
				field1242.method220(field1116);
				field1242.method220(field1117);
			}

			if (field14 && !field1244) {
				field1244 = true;
				field1242.method218(60);
				field1242.method219(1);
			}

			if (!field14 && field1244) {
				field1244 = false;
				field1242.method218(60);
				field1242.method219(0);
			}

			method492();
			method470();
			method456();
			field1377++;
			if (field1377 > 750) {
				method502();
			}

			method524();
			method515();
			method513();
			field1060++;

			if (field1291 != 0) {
				field1290 += 20;
				if (field1290 >= 400) {
					field1291 = 0;
				}
			}

			if (field1314 != 0) {
				field1311++;
				if (field1311 >= 15) {
					if (field1314 == 2) {
						field1401 = true;
					}

					if (field1314 == 3) {
						field1381 = true;
					}

					field1314 = 0;
				}
			}

			if (field1348 != 0) {
				field1224++;

				if (field17 > field1349 + 5 || field17 < field1349 - 5 || field18 > field1350 + 5 || field18 < field1350 - 5) {
					field1243 = true;
				}

				if (field16 == 0) {
					if (field1348 == 2) {
						field1401 = true;
					}

					if (field1348 == 3) {
						field1381 = true;
					}

					field1348 = 0;

					if (field1243 && field1224 >= 5) {
						field1341 = -1;
						method510();

						if (field1346 == field1341 && field1347 != field1340) {
							class4 var19 = class4.field56[field1346];
							byte var20 = 0;
							if (field1247 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1340] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1347;
								int var22 = field1340;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1347;
								int var24 = field1340;
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
								var19.method33(field1340, field1347);
							}

							field1242.method218(28);
							field1242.method220(field1346);
							field1242.method220(field1347);
							field1242.method220(field1340);
							field1242.method219(var20);
						}
					} else if ((field1073 == 1 || method525(field1210 - 1)) && field1210 > 2) {
						method551();
					} else if (field1210 > 0) {
						method457(field1210 - 1);
					}

					field1311 = 10;
					field23 = 0;
				}
			}

			field1440++;
			if (field1440 > 62) {
				field1440 = 0;
				field1242.method218(153);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method482(0, 0, 0, 0, true, field1345.field410[0], var25, 0, field1345.field411[0], 0, var26);
				class18.field292 = -1;

				if (var27) {
					field1288 = field24;
					field1289 = field25;
					field1291 = 1;
					field1290 = 0;
				}
			}

			if (field23 == 1 && field1198 != null) {
				field1198 = null;
				field1381 = true;
				field23 = 0;
			}

			method432();
			method497();
			method442();
			method431();

			if (field16 == 1 || field23 == 1) {
				field1382++;
			}

			if (field1414 == 2) {
				method531();
			}

			if (field1414 == 2 && field1339) {
				method464();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1278[var28]++;
			}

			method481();
			field15++;
			if (field15 > 4500) {
				field1379 = 250;
				field15 -= 500;
				field1242.method218(36);
			}

			field1451++;
			if (field1451 > 500) {
				field1451 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1074 += field1075;
				}

				if ((var29 & 0x2) == 2) {
					field1372 += field1373;
				}

				if ((var29 & 0x4) == 4) {
					field1464 += field1465;
				}
			}

			if (field1074 < -50) {
				field1075 = 2;
			}

			if (field1074 > 50) {
				field1075 = -2;
			}

			if (field1372 < -55) {
				field1373 = 2;
			}

			if (field1372 > 55) {
				field1373 = -2;
			}

			if (field1464 < -40) {
				field1465 = 1;
			}

			if (field1464 > 40) {
				field1465 = -1;
			}

			field1294++;
			if (field1294 > 500) {
				field1294 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1136 += field1137;
				}

				if ((var30 & 0x2) == 2) {
					field1143 += field1144;
				}
			}

			if (field1136 < -60) {
				field1137 = 2;
			}

			if (field1136 > 60) {
				field1137 = -2;
			}

			if (field1143 < -20) {
				field1144 = 1;
			}

			if (field1143 > 10) {
				field1144 = -1;
			}

			field1378++;
			if (field1378 > 50) {
				field1242.method218(146);
			}

			try {
				if (field1099 != null && field1242.field621 > 0) {
					field1099.method42(field1242.field621, field1242.field620, 0);
					field1242.field621 = 0;
					field1378 = 0;
				}
			} catch (IOException var32) {
				method502();
			} catch (Exception var33) {
				method445();
			}
		}
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method534(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1403.method76(arg2, arg3, arg1);
		if (var6 != 0) {
			int var7 = field1403.method80(arg2, arg3, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field1391.field596;
			int var12 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
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
				class36 var15 = field1212[var14.field849];
				if (var15 != null) {
					int var16 = (var14.field835 * 4 - var15.field605) / 2;
					int var17 = (var14.field836 * 4 - var15.field606) / 2;
					var15.method199(arg3 * 4 + var16 + 48, (104 - arg1 - var14.field836) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1403.method78(arg2, arg3, arg1);
		if (var18 != 0) {
			int var19 = field1403.method80(arg2, arg3, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field849 != -1) {
				class36 var24 = field1212[var23.field849];
				if (var24 != null) {
					int var25 = (var23.field835 * 4 - var24.field605) / 2;
					int var26 = (var23.field836 * 4 - var24.field606) / 2;
					var24.method199(arg3 * 4 + var25 + 48, (104 - arg1 - var23.field836) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1391.field596;
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

		int var30 = field1403.method79(arg2, arg3, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field849 != -1) {
				class36 var33 = field1212[var32.field849];
				if (var33 != null) {
					int var34 = (var32.field835 * 4 - var33.field605) / 2;
					int var35 = (var32.field836 * 4 - var33.field606) / 2;
					var33.method199(arg3 * 4 + var34 + 48, (104 - arg1 - var32.field836) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILd;IB)V")
	public final void method535(int arg0, int arg1, class4 arg2, int arg3) {
		if (arg2.field63 == 0 && arg2.field78 != null && (!arg2.field77 || field1220 == arg2.field61 || field1206 == arg2.field61 || field1469 == arg2.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg3, arg0, arg2.field66 + arg0, arg2.field67 + arg3);
			int var9 = arg2.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field79[var10] + arg0;
				int var12 = arg2.field80[var10] + arg3 - arg1;
				class4 var13 = class4.field56[arg2.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method498(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method535(var11, var13.field76, var13, var12);

					if (var13.field75 > var13.field67) {
						method454(var13.field67, var13.field66 + var11, var13.field75, var13.field76, var12);
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
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1348 != 0 && field1347 == var14) {
										int var22 = 0;
										if (field1427 == 1 && field1428 == var14 && field1429 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var21, var22, var13.field58[var14]);
										if (var23 != null) {
											if (field1348 != 0 && field1347 == var14 && field1346 == var13.field61) {
												var19 = field17 - field1349;
												var20 = field18 - field1350;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1224 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < class33.field566 && arg2.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1060 / 3;
													if (var24 > field1060 * 10) {
														var24 = field1060 * 10;
													}

													if (var24 > arg2.field76) {
														var24 = arg2.field76;
													}

													arg2.field76 -= var24;
													field1350 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg2.field76 < arg2.field75 - arg2.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1060 / 3;
													if (var25 > field1060 * 10) {
														var25 = field1060 * 10;
													}

													if (var25 > arg2.field75 - arg2.field67 - arg2.field76) {
														var25 = arg2.field75 - arg2.field67 - arg2.field76;
													}

													arg2.field76 += var25;
													field1350 -= var25;
												}
											} else if (field1314 != 0 && field1313 == var14 && field1312 == var13.field61) {
												var23.method188(var18, var17, 128);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1274.method206(method528(var26), 0, var17 + var19 + 1, var18 + 10 + var20);
												field1274.method206(method528(var26), 0xFFFF00, var17 + var19, var18 + 9 + var20);
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
						if (field1469 == var13.field61 || field1206 == var13.field61 || field1220 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method469(var13)) {
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
								class33.method157(var11, var13.field66, var29, var13.field67, var12);
							} else {
								class33.method158(var13.field66, var13.field67, var11, var12, var29);
							}
						} else if (var13.field93) {
							class33.method156(256 - (var13.field68 & 0xFF), var29, var12, var13.field66, var11, var13.field67);
						} else {
							class33.method159(var13.field66, var13.field67, var29, var12, 256 - (var13.field68 & 0xFF), var11);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1469 == var13.field61 || field1206 == var13.field61 || field1220 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method469(var13)) {
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

						if (var13.field64 == 6 && field1205) {
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

									var31 = var31.substring(0, var35) + method541(method478(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method541(method478(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method541(method478(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method541(method478(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method541(method478(4, var13)) + var31.substring(var39 + 2);
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
								var30.method203(var13.field66 / 2 + var11, var13.field95, var34, var33, var41);
							} else {
								var30.method210(var34, var13.field95, var11, var33, var41);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method469(var13)) {
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
						boolean var47 = method469(var13);
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
							var49 = var13.method34(var50.field998[var13.field59], var50.field999[var13.field59], var47);
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
										var56 = var56 + " x" + method546(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var13.field66 / 2 + var57, var13.field95, var58, var13.field99, var56);
									} else {
										var51.method210(var58, var13.field95, var57, var13.field99, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;)V")
	public final void method536(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field1315 != -1) {
			field1198 = arg2;
			field23 = 0;
		}

		if (field1179 == -1) {
			field1381 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1063[var4] = field1063[var4 - 1];
			field1064[var4] = field1064[var4 - 1];
			field1065[var4] = field1065[var4 - 1];
		}

		field1063[0] = arg1;
		field1064[0] = arg0;
		field1065[0] = arg2;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method537(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1084; var3++) {
				if (field1418[var3] == arg0) {
					field1084--;
					field1401 = true;

					for (int var4 = var3; var4 < field1084; var4++) {
						field1453[var4] = field1453[var4 + 1];
						field1330[var4] = field1330[var4 + 1];
						field1418[var4] = field1418[var4 + 1];
					}

					field1242.method218(214);
					field1242.method225(arg0);
					break;
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1127 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.f(II)V")
	public final void method538(int arg0, int arg1) {
		class41 var3 = field1123[field1286][arg0][arg1];
		if (var3 == null) {
			field1403.method71(field1286, arg0, arg1);
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
			field1403.method57(arg1, var9, var12, var5, field1286, var10, method550(arg0 * 128 + 64, arg1 * 128 + 64, field1286), arg0);
		}
	}

	@ObfuscatedName("client.c(IB)V")
	public final void method539(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method539(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.c(ILlb;I)V")
	public final void method540(class38 arg0, int arg1) {
		field1296 = 0;
		field1321 = 0;
		method458(arg1, arg0);
		method552(arg0, arg1);
		method489(arg0, arg1);

		for (int var3 = 0; var3 < field1296; var3++) {
			int var4 = field1297[var3];
			if (field1114 != field1195[var4].field405) {
				field1195[var4].field415 = null;
				field1195[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1225 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1196; var5++) {
			if (field1195[field1197[var5]] == null) {
				signlink.reporterror(field1225 + " null entry in npc list - pos:" + var5 + " size:" + field1196);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method541(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.k(B)V")
	public final void method542() {
		field1242.method218(84);

		if (field1181 != -1) {
			field1181 = -1;
			field1401 = true;
			field1205 = false;
			field1201 = true;
		}

		if (field1179 != -1) {
			field1179 = -1;
			field1381 = true;
			field1205 = false;
		}

		field1066 = -1;
	}

	@ObfuscatedName("client.a(ZILib;I)V")
	public final void method543(int arg0, class35 arg1, int arg2) {
		int var4 = field1136 + field1117 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1143 + 256);
			var7 = var7 * 256 / (field1143 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method192(var8 + 94 + 4 - arg1.field601 / 2, field1152, 83 - var9 - arg1.field602 / 2 - 4);
			} else {
				arg1.method186(var8 + 94 + 4 - arg1.field601 / 2, 83 - var9 - arg1.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method544() {
		field1187++;
		method507(true);
		method455(true);
		method507(false);
		method455(false);
		method433();
		method484();

		if (!field1339) {
			int var1 = field1116;
			if (field1189 / 256 > var1) {
				var1 = field1189 / 256;
			}

			if (field1183[4] && field1124[4] + 128 > var1) {
				var1 = field1124[4] + 128;
			}

			int var2 = field1464 + field1117 & 0x7FF;
			method487(var1, field1258, var2, method550(field1345.field360, field1345.field361, field1286) - 50, var1 * 3 + 600, field1259);
		}

		int var3;
		if (field1339) {
			var3 = method556();
		} else {
			var3 = method555();
		}

		int var4 = field1138;
		int var5 = field1139;
		int var6 = field1140;
		int var7 = field1141;
		int var8 = field1142;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1183[var9]) {
				int var10 = (int) (Math.random() * (field1450[var9] * 2 + 1) + Math.sin(field1256[var9] / 100.0D * field1278[var9]) * field1124[var9] - field1450[var9]);
				if (var9 == 0) {
					field1138 += var10;
				}

				if (var9 == 1) {
					field1139 += var10;
				}

				if (var9 == 2) {
					field1140 += var10;
				}

				if (var9 == 3) {
					field1142 = field1142 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1141 += var10;
					if (field1141 < 128) {
						field1141 = 128;
					}

					if (field1141 > 383) {
						field1141 = 383;
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
		field1403.method89(field1138, field1140, var3, field1141, field1139, field1142);
		field1403.method64();
		method488();
		method554();
		method440(var11);
		method506();
		field1435.method259(4, 4, field9);
		field1138 = var4;
		field1139 = var5;
		field1140 = var6;
		field1141 = var7;
		field1142 = var8;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1099 != null) {
				field1099.method38();
			}
		} catch (Exception var1) {
		}

		field1099 = null;
		method467();

		if (field1452 != null) {
			field1452.field868 = false;
		}

		field1452 = null;
		field1367.method271();
		field1367 = null;
		field1242 = null;
		field1208 = null;
		field1441 = null;
		field1221 = null;
		field1392 = null;
		field1098 = null;
		field1222 = null;
		field1223 = null;
		field1133 = null;
		field1083 = null;
		field1403 = null;
		field1410 = null;
		field1329 = null;
		field1213 = null;
		field1461 = null;
		field1462 = null;
		field1186 = null;
		field1433 = null;
		field1434 = null;
		field1435 = null;
		field1436 = null;
		field1396 = null;
		field1397 = null;
		field1398 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1157 = null;
		field1158 = null;
		field1159 = null;
		field1160 = null;
		field1161 = null;
		field1162 = null;
		field1151 = null;
		field1152 = null;
		field1153 = null;
		field1171 = null;
		field1172 = null;
		field1173 = null;
		field1184 = null;
		field1249 = null;
		field1250 = null;
		field1251 = null;
		field1252 = null;
		field1253 = null;
		field1471 = null;
		field1472 = null;
		field1473 = null;
		field1474 = null;
		field1475 = null;
		field1308 = null;
		field1255 = null;
		field1231 = null;
		field1406 = null;
		field1444 = null;
		field1445 = null;
		field1446 = null;
		field1447 = null;
		field1212 = null;
		field1203 = null;
		field1369 = null;
		field1318 = null;
		field1320 = null;
		field1322 = null;
		field1323 = null;
		field1297 = null;
		field1195 = null;
		field1197 = null;
		field1123 = null;
		field1164 = null;
		field1326 = null;
		field1420 = null;
		field1087 = null;
		field1088 = null;
		field1089 = null;
		field1090 = null;
		field1115 = null;
		field1190 = null;
		field1385 = null;
		field1386 = null;
		field1193 = null;
		field1391 = null;
		field1453 = null;
		field1418 = null;
		field1330 = null;
		field1108 = null;
		field1109 = null;
		field1105 = null;
		field1106 = null;
		field1107 = null;
		field1110 = null;
		field1111 = null;
		field1112 = null;
		field1113 = null;
		method479();
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

	@ObfuscatedName("client.b(III)Z")
	public final boolean method545(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method545(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method469(var6);
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

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method546(int arg0) {
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

	@ObfuscatedName("client.c(III)V")
	public final void method547(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1065[var4] != null) {
				int var5 = field1063[var4];
				int var6 = field1463 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1064[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1167 == 0 || field1167 == 1 && method437(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1345.field416)) {
						if (field1163 >= 1) {
							field1115[field1210] = "Report abuse @whi@" + var7;
							field1089[field1210] = 524;
							field1210++;
						}

						field1115[field1210] = "Add ignore @whi@" + var7;
						field1089[field1210] = 47;
						field1210++;
						field1115[field1210] = "Add friend @whi@" + var7;
						field1089[field1210] = 605;
						field1210++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1185 == 0 && (var5 == 7 || field1426 == 0 || field1426 == 1 && method437(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1163 >= 1) {
							field1115[field1210] = "Report abuse @whi@" + var7;
							field1089[field1210] = 524;
							field1210++;
						}

						field1115[field1210] = "Add ignore @whi@" + var7;
						field1089[field1210] = 47;
						field1210++;
						field1115[field1210] = "Add friend @whi@" + var7;
						field1089[field1210] = 605;
						field1210++;
					}

					var3++;
				}

				if (var5 == 4 && (field1285 == 0 || field1285 == 1 && method437(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1115[field1210] = "Accept trade @whi@" + var7;
						field1089[field1210] = 507;
						field1210++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1185 == 0 && field1426 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1285 == 0 || field1285 == 1 && method437(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1115[field1210] = "Accept challenge @whi@" + var7;
						field1089[field1210] = 957;
						field1210++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIILjava/lang/String;Ljava/lang/String;)Lxb;")
	public final class50 method548(int arg0, int arg1, int arg2, String arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1077[0] != null) {
				var6 = field1077[0].method291(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1365.reset();
			field1365.update(var6);
			int var8 = (int) field1365.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class50(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13("Requesting " + arg4, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method532(arg3 + arg1);
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
						method13("Loading " + arg4 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1077[0] != null) {
						field1077[0].method292(arg0, var6, var6.length);
					}
				} catch (Exception var28) {
					field1077[0] = null;
				}

				if (var6 != null) {
					field1365.reset();
					field1365.update(var6);
					int var23 = (int) field1365.getValue();
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
						method13("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method13(var11 + " - Retrying in " + var25, arg2);
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

				field1219 = !field1219;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.a(Llb;ZI)V")
	public final void method549(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1321; var3++) {
			int var4 = field1322[var3];
			class27 var5 = field1318[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method229() << 8;
			}

			method448(arg0, var6, var4, var5);
		}
	}

	@ObfuscatedName("client.a(IIIZ)I")
	public final int method550(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1083[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field1133[var6][var4][var5] + field1133[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1133[var6][var4][var5 + 1] + field1133[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.O(I)V")
	public final void method551() {
		int var1 = field1276.method204("Choose Option");
		for (int var2 = 0; var2 < field1210; var2++) {
			int var3 = field1276.method204(field1115[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1210 * 15 + 21;
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

			field1387 = true;
			field1091 = 0;
			field1092 = var5;
			field1093 = var6;
			field1094 = var1;
			field1095 = field1210 * 15 + 22;
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

			field1387 = true;
			field1091 = 1;
			field1092 = var7;
			field1093 = var8;
			field1094 = var1;
			field1095 = field1210 * 15 + 22;
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

			field1387 = true;
			field1091 = 2;
			field1092 = var9;
			field1093 = var10;
			field1094 = var1;
			field1095 = field1210 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(Llb;IB)V")
	public final void method552(class38 arg0, int arg1) {
		while (arg0.field622 + 21 < arg1 * 8) {
			int var3 = arg0.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1195[var3] == null) {
				field1195[var3] = new class26();
			}

			class26 var4 = field1195[var3];
			field1197[field1196++] = var3;
			var4.field405 = field1114;
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
			var4.method110(var7 == 1, field1345.field410[0] + var5, field1345.field411[0] + var6);
			int var8 = arg0.method240(1);
			if (var8 == 1) {
				field1322[field1321++] = var3;
			}
		}

		arg0.method241();
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method553() {
		field1433.method258();
		class34.field584 = field1416;
		field1151.method199(0, 0);

		if (field1181 != -1) {
			method535(0, 0, class4.field56[field1181], 0);
		} else if (field1456[field1281] != -1) {
			method535(0, 0, class4.field56[field1456[field1281]], 0);
		}

		if (field1387 && field1091 == 1) {
			method562();
		}

		field1433.method259(553, 205, field9);
		field1435.method258();
		class34.field584 = field1417;
	}

	@ObfuscatedName("client.P(I)V")
	public final void method554() {
		if (field1284 == 2) {
			method491((field1237 - field1333 << 7) + field1240, (field1236 - field1332 << 7) + field1239, field1238 * 2);

			if (field1327 > -1 && field1114 % 20 < 10) {
				field1231[2].method186(field1327 - 12, field1328 - 28);
			}
		}
	}

	@ObfuscatedName("client.l(Z)I")
	public final int method555() {
		int var1 = 3;
		if (field1141 < 310) {
			int var2 = field1138 >> 7;
			int var3 = field1140 >> 7;
			int var4 = field1345.field360 >> 7;
			int var5 = field1345.field361 >> 7;

			if ((field1083[field1286][var2][var3] & 0x4) != 0) {
				var1 = field1286;
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

					if ((field1083[field1286][var2][var3] & 0x4) != 0) {
						var1 = field1286;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1083[field1286][var2][var3] & 0x4) != 0) {
							var1 = field1286;
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

					if ((field1083[field1286][var2][var3] & 0x4) != 0) {
						var1 = field1286;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1083[field1286][var2][var3] & 0x4) != 0) {
							var1 = field1286;
						}
					}
				}
			}
		}

		if ((field1083[field1286][field1345.field360 >> 7][field1345.field361 >> 7] & 0x4) != 0) {
			var1 = field1286;
		}

		return var1;
	}

	@ObfuscatedName("client.Q(I)I")
	public final int method556() {
		int var1 = method550(field1138, field1140, field1286);
		if (var1 - field1139 < 800 && (field1083[field1286][field1138 >> 7][field1140 >> 7] & 0x4) != 0) {
			return field1286;
		}

		return 3;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method557(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13("Starting up", 20);

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1412) {
			field1419 = true;
		} else {
			field1412 = true;
			boolean var1 = false;
			String var2 = method473();
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
						field1077[var3] = new class48(var3 + 1, 500000, signlink.cache_idx[var3], signlink.cache_dat);
					}
				}

				try {
					method452();
					field1097 = method548(1, field1079[1], 25, "title", "title screen");
					field1274 = new class37(false, field1097, "p11_full");
					field1275 = new class37(false, field1097, "p12_full");
					field1276 = new class37(false, field1097, "b12_full");
					field1277 = new class37(true, field1097, "q8_full");
					method443();
					method430();
					class50 var4 = method548(2, field1079[2], 30, "config", "config");
					class50 var5 = method548(3, field1079[3], 35, "interface", "interface");
					class50 var6 = method548(4, field1079[4], 40, "media", "2d graphics");
					class50 var7 = method548(6, field1079[6], 45, "textures", "textures");
					class50 var8 = method548(7, field1079[7], 50, "wordenc", "chat system");
					class50 var9 = method548(8, field1079[8], 55, "sounds", "sound effects");
					field1083 = new byte[4][104][104];
					field1133 = new int[4][105][105];
					field1403 = new class18(4, field1133, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1410[var10] = new class62(104, 104);
					}

					field1391 = new class35(512, 512);
					class50 var11 = method548(5, field1079[5], 60, "versionlist", "update list");
					method13("Connecting to update server", 60);
					field1367 = new class47();
					field1367.method270(var11, this);
					class7.method44(field1367.method273());
					class31.method123(field1367.method272(0), field1367);

					if (!field1129) {
						field1336 = 0;
						try {
							field1336 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1337 = true;
						field1367.method279(2, field1336);

						while (field1367.method280() > 0) {
							method468();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1367.field738 > 3) {
								method463("ondemand");
								return;
							}
						}
					}

					method13("Requesting animations", 65);
					int var12 = field1367.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1367.method279(1, var13);
					}

					while (field1367.method280() > 0) {
						int var14 = var12 - field1367.method280();
						if (var14 > 0) {
							method13("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method468();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1367.field738 > 3) {
							method463("ondemand");
							return;
						}
					}

					method13("Requesting models", 70);
					int var15 = field1367.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1367.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1367.method279(0, var16);
						}
					}

					int var18 = field1367.method280();
					while (field1367.method280() > 0) {
						int var19 = var18 - field1367.method280();
						if (var19 > 0) {
							method13("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method468();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1077[0] != null) {
						method13("Requesting maps", 75);
						field1367.method279(3, field1367.method274(47, 0, 48));
						field1367.method279(3, field1367.method274(47, 1, 48));
						field1367.method279(3, field1367.method274(48, 0, 48));
						field1367.method279(3, field1367.method274(48, 1, 48));
						field1367.method279(3, field1367.method274(49, 0, 48));
						field1367.method279(3, field1367.method274(49, 1, 48));
						field1367.method279(3, field1367.method274(47, 0, 47));
						field1367.method279(3, field1367.method274(47, 1, 47));
						field1367.method279(3, field1367.method274(48, 0, 47));
						field1367.method279(3, field1367.method274(48, 1, 47));
						field1367.method279(3, field1367.method274(48, 0, 148));
						field1367.method279(3, field1367.method274(48, 1, 148));
						int var20 = field1367.method280();
						while (field1367.method280() > 0) {
							int var21 = var20 - field1367.method280();
							if (var21 > 0) {
								method13("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method468();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1367.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1367.method277(var23);
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
							field1367.method282(0, var25, var23);
						}
					}

					field1367.method275(field1128);

					if (!field1129) {
						int var26 = field1367.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1367.method278(var27)) {
								field1367.method282(2, (byte) 1, var27);
							}
						}
					}

					method13("Unpacking media", 80);
					field1151 = new class36(var6, "invback", 0);
					field1153 = new class36(var6, "chatback", 0);
					field1152 = new class36(var6, "mapback", 0);
					field1171 = new class36(var6, "backbase1", 0);
					field1172 = new class36(var6, "backbase2", 0);
					field1173 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1184[var28] = new class36(var6, "sideicons", var28);
					}

					field1308 = new class35(var6, "compass", 0);
					field1454 = new class35(var6, "mapedge", 0);
					field1454.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1212[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1203[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1255[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1231[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1227 = new class35(var6, "mapmarker", 0);
					field1228 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1406[var33] = new class35(var6, "cross", var33);
					}

					field1444 = new class35(var6, "mapdots", 0);
					field1445 = new class35(var6, "mapdots", 1);
					field1446 = new class35(var6, "mapdots", 2);
					field1447 = new class35(var6, "mapdots", 3);
					field1477 = new class36(var6, "scrollbar", 0);
					field1478 = new class36(var6, "scrollbar", 1);
					field1249 = new class36(var6, "redstone1", 0);
					field1250 = new class36(var6, "redstone2", 0);
					field1251 = new class36(var6, "redstone3", 0);
					field1252 = new class36(var6, "redstone1", 0);
					field1252.method196();
					field1253 = new class36(var6, "redstone2", 0);
					field1253.method196();
					field1471 = new class36(var6, "redstone1", 0);
					field1471.method197();
					field1472 = new class36(var6, "redstone2", 0);
					field1472.method197();
					field1473 = new class36(var6, "redstone3", 0);
					field1473.method197();
					field1474 = new class36(var6, "redstone1", 0);
					field1474.method196();
					field1474.method197();
					field1475 = new class36(var6, "redstone2", 0);
					field1475.method196();
					field1475.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1130[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1154 = new class43(method11(), var35.field597, var35.field598);
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1155 = new class43(method11(), var36.field597, var36.field598);
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1156 = new class43(method11(), var37.field597, var37.field598);
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1157 = new class43(method11(), var38.field597, var38.field598);
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1158 = new class43(method11(), var39.field597, var39.field598);
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1159 = new class43(method11(), var40.field597, var40.field598);
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1160 = new class43(method11(), var41.field597, var41.field598);
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1161 = new class43(method11(), var42.field597, var42.field598);
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1162 = new class43(method11(), var43.field597, var43.field598);
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1203[var48] != null) {
							field1203[var48].method182(var45 + var47, var44 + var47, var46 + var47);
						}

						if (field1212[var48] != null) {
							field1212[var48].method198(var45 + var47, var44 + var47, var46 + var47);
						}
					}

					method13("Unpacking textures", 83);
					class34.method169(var7);
					class34.method173(0.8D);
					class34.method168(20);
					method13("Unpacking config", 86);
					class66.method381(var4);
					class57.method328(var4);
					class63.method371(var4);
					class60.method346(var4);
					class59.method339(var4);
					class64.method375(var4);
					class68.method384(var4);
					class70.method389(var4);
					class69.method387(var4);
					class60.field914 = field1128;

					if (!field1129) {
						method13("Unpacking sounds", 90);
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13("Unpacking interfaces", 95);
					class37[] var51 = new class37[] { field1274, field1275, field1276, field1277 };
					class4.method32(var6, var51, var5);
					method13("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1152.field603[field1152.field605 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1405[var52] = var53;
						field1351[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1152.field603[field1152.field605 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1081[var56 - 5] = var57 - 25;
						field1374[var56 - 5] = var58 - var57;
					}

					class34.method166(96, 479);
					field1415 = class34.field584;
					class34.method166(261, 190);
					field1416 = class34.field584;
					class34.method166(334, 512);
					field1417 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(var60, 800, 334, 512, 500);
					class71.method391(var8);
					field1452 = new class58(this);
					method12(field1452, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field873 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1342 + " " + field1235);
					field1168 = true;
				}
			} else {
				field1404 = true;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method558() {
		if (field1210 >= 2 || field1427 != 0 || field1145 != 0) {
			String var1;
			if (field1427 == 1 && field1210 < 2) {
				var1 = "Use " + field1431 + " with...";
			} else if (field1145 == 1 && field1210 < 2) {
				var1 = field1148 + "...";
			} else {
				var1 = field1115[field1210 - 1];
			}

			if (field1210 > 2) {
				var1 = var1 + "@whi@ / " + (field1210 - 2) + " more options";
			}

			field1276.method211(true, field1114 / 1000, 15, 0xFFFFFF, var1, 4);
		}
	}

	@ObfuscatedName("client.a(IILgc;II)V")
	public final void method559(int arg0, class59 arg1, int arg2, int arg3) {
		if (field1210 < 400) {
			if (arg1.field905 != null) {
				arg1 = arg1.method345();
			}

			if (arg1 != null) {
				String var5 = arg1.field880;
				if (arg1.field897 != 0) {
					var5 = var5 + method451(field1345.field422, arg1.field897) + " (level-" + arg1.field897 + ")";
				}

				if (field1427 == 1) {
					field1115[field1210] = "Use " + field1431 + " with @yel@" + var5;
					field1089[field1210] = 829;
					field1090[field1210] = arg3;
					field1087[field1210] = arg2;
					field1088[field1210] = arg0;
					field1210++;
				} else if (field1145 != 1) {
					if (arg1.field892 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field892[var6] != null && !arg1.field892[var6].equalsIgnoreCase("attack")) {
								field1115[field1210] = arg1.field892[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1089[field1210] = 242;
								}

								if (var6 == 1) {
									field1089[field1210] = 209;
								}

								if (var6 == 2) {
									field1089[field1210] = 309;
								}

								if (var6 == 3) {
									field1089[field1210] = 852;
								}

								if (var6 == 4) {
									field1089[field1210] = 793;
								}

								field1090[field1210] = arg3;
								field1087[field1210] = arg2;
								field1088[field1210] = arg0;
								field1210++;
							}
						}
					}

					if (arg1.field892 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field892[var7] != null && arg1.field892[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field897 > field1345.field422) {
									var8 = 2000;
								}

								field1115[field1210] = arg1.field892[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1089[field1210] = var8 + 242;
								}

								if (var7 == 1) {
									field1089[field1210] = var8 + 209;
								}

								if (var7 == 2) {
									field1089[field1210] = var8 + 309;
								}

								if (var7 == 3) {
									field1089[field1210] = var8 + 852;
								}

								if (var7 == 4) {
									field1089[field1210] = var8 + 793;
								}

								field1090[field1210] = arg3;
								field1087[field1210] = arg2;
								field1088[field1210] = arg0;
								field1210++;
							}
						}
					}

					field1115[field1210] = "Examine @yel@" + var5;
					field1089[field1210] = 1714;
					field1090[field1210] = arg3;
					field1087[field1210] = arg2;
					field1088[field1210] = arg0;
					field1210++;
				} else if ((field1147 & 0x2) == 2) {
					field1115[field1210] = field1148 + " @yel@" + var5;
					field1089[field1210] = 240;
					field1090[field1210] = arg3;
					field1087[field1210] = arg2;
					field1088[field1210] = arg0;
					field1210++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method560() {
		field1307 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1371) {
				field1393++;
				method434();
				method434();
				method460();
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

		field1307 = false;
	}

	@ObfuscatedName("client.b(JZ)V")
	public final void method561(long arg0) {
		if (arg0 != 0L) {
			if (field1425 >= 100) {
				method536("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1425; var4++) {
					if (field1368[var4] == arg0) {
						method536("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field1084; var5++) {
					if (field1418[var5] == arg0) {
						method536("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field1368[field1425++] = arg0;
				field1401 = true;
				field1242.method218(32);
				field1242.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method562() {
		int var1 = field1092;
		int var2 = field1093;
		int var3 = field1094;
		int var4 = field1095;
		int var5 = 0x5D5447;
		class33.method157(var1, var3, var5, var4, var2);
		class33.method157(var1 + 1, var3 - 2, 0, 16, var2 + 1);
		class33.method158(var3 - 2, var4 - 19, var1 + 1, var2 + 18, 0);
		field1276.method206("Choose Option", var5, var1 + 3, var2 + 14);
		int var6 = field17;
		int var7 = field18;
		if (field1091 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1091 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1091 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1210; var8++) {
			int var9 = (field1210 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1276.method210(var9, true, var1 + 3, var10, field1115[var8]);
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1180[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1325[var3] = var2 / 4;
		}
	}
}
