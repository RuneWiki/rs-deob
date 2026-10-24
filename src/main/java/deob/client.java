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
	public class35[] field1072 = new class35[100];

	@ObfuscatedName("client.bb")
	public class49 field1073;

	@ObfuscatedName("client.db")
	public byte[][] field1074;

	@ObfuscatedName("client.eb")
	public int field1075 = -1;

	@ObfuscatedName("client.fb")
	public int field1076 = -1;

	@ObfuscatedName("client.gb")
	public int field1077;

	@ObfuscatedName("client.hb")
	public int field1078;

	@ObfuscatedName("client.ib")
	public int field1079 = -1;

	@ObfuscatedName("client.kb")
	public int field1080 = 2048;

	@ObfuscatedName("client.lb")
	public int field1081 = 2047;

	@ObfuscatedName("client.mb")
	public class27[] field1082 = new class27[field1080];

	@ObfuscatedName("client.nb")
	public int field1083;

	@ObfuscatedName("client.ob")
	public int[] field1084 = new int[field1080];

	@ObfuscatedName("client.pb")
	public int field1085;

	@ObfuscatedName("client.qb")
	public int[] field1086 = new int[field1080];

	@ObfuscatedName("client.rb")
	public class38[] field1087 = new class38[field1080];

	@ObfuscatedName("client.tb")
	public static int field1088;

	@ObfuscatedName("client.ub")
	public final int[] field1089 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.vb")
	public int[] field1090 = new int[100];

	@ObfuscatedName("client.wb")
	public String[] field1091 = new String[100];

	@ObfuscatedName("client.xb")
	public String[] field1092 = new String[100];

	@ObfuscatedName("client.yb")
	public class48[] field1093 = new class48[5];

	@ObfuscatedName("client.ac")
	public static int field1118;

	@ObfuscatedName("client.bc")
	public class62[] field1119 = new class62[4];

	@ObfuscatedName("client.cc")
	public int field1120;

	@ObfuscatedName("client.dc")
	public int field1121 = 1;

	@ObfuscatedName("client.fc")
	public static int field1122;

	@ObfuscatedName("client.gc")
	public int[] field1123 = new int[class67.field1013];

	@ObfuscatedName("client.hc")
	public static boolean field1124;

	@ObfuscatedName("client.jc")
	public static int field1125;

	@ObfuscatedName("client.kc")
	public int field1126;

	@ObfuscatedName("client.lc")
	public class38 field1127 = class38.method217(1);

	@ObfuscatedName("client.nc")
	public String field1128 = "";

	@ObfuscatedName("client.oc")
	public static int field1129;

	@ObfuscatedName("client.pc")
	public int field1130;

	@ObfuscatedName("client.qc")
	public int field1131;

	@ObfuscatedName("client.rc")
	public byte[][][] field1132;

	@ObfuscatedName("client.sc")
	public int field1133;

	@ObfuscatedName("client.M")
	public long[] field1061 = new long[200];

	@ObfuscatedName("client.Q")
	public class35[] field1063 = new class35[8];

	@ObfuscatedName("client.R")
	public boolean field1064 = false;

	@ObfuscatedName("client.T")
	public boolean field1065 = false;

	@ObfuscatedName("client.V")
	public int[] field1067 = new int[1000];

	@ObfuscatedName("client.W")
	public int[] field1068 = new int[1000];

	@ObfuscatedName("client.Ab")
	public boolean field1094 = false;

	@ObfuscatedName("client.Bb")
	public int field1095 = -1;

	@ObfuscatedName("client.Cb")
	public int[] field1096 = new int[50];

	@ObfuscatedName("client.Db")
	public class41 field1097 = new class41();

	@ObfuscatedName("client.Eb")
	public int field1098 = 0x23201B;

	@ObfuscatedName("client.Fb")
	public class35[] field1099 = new class35[1000];

	@ObfuscatedName("client.Ib")
	public int[] field1101 = new int[256];

	@ObfuscatedName("client.Kb")
	public String[] field1102 = new String[5];

	@ObfuscatedName("client.Lb")
	public boolean[] field1103 = new boolean[5];

	@ObfuscatedName("client.Mb")
	public boolean field1104 = true;

	@ObfuscatedName("client.Ob")
	public boolean field1106 = true;

	@ObfuscatedName("client.Tb")
	public String field1111 = "";

	@ObfuscatedName("client.Wb")
	public boolean field1114 = false;

	@ObfuscatedName("client.Zb")
	public boolean field1117 = false;

	@ObfuscatedName("client.tc")
	public class35[] field1134 = new class35[20];

	@ObfuscatedName("client.uc")
	public int[] field1135 = new int[50];

	@ObfuscatedName("client.wc")
	public class41[][][] field1137 = new class41[4][104][104];

	@ObfuscatedName("client.yc")
	public String field1139 = "";

	@ObfuscatedName("client.zc")
	public String field1140 = "";

	@ObfuscatedName("client.Hc")
	public CRC32 field1147 = new CRC32();

	@ObfuscatedName("client.Ic")
	public int[] field1148 = new int[4000];

	@ObfuscatedName("client.Jc")
	public int[] field1149 = new int[4000];

	@ObfuscatedName("client.Kc")
	public boolean field1150 = false;

	@ObfuscatedName("client.Mc")
	public int field1152 = 2;

	@ObfuscatedName("client.Nc")
	public boolean field1153 = false;

	@ObfuscatedName("client.Qc")
	public boolean field1156 = true;

	@ObfuscatedName("client.Rc")
	public int field1157 = 0x766654;

	@ObfuscatedName("client.Tc")
	public class41 field1159 = new class41();

	@ObfuscatedName("client.Xc")
	public int field1162 = -1;

	@ObfuscatedName("client.Zc")
	public int field1164 = 50;

	@ObfuscatedName("client.ad")
	public int[] field1165 = new int[field1164];

	@ObfuscatedName("client.bd")
	public int[] field1166 = new int[field1164];

	@ObfuscatedName("client.cd")
	public int[] field1167 = new int[field1164];

	@ObfuscatedName("client.dd")
	public int[] field1168 = new int[field1164];

	@ObfuscatedName("client.ed")
	public int[] field1169 = new int[field1164];

	@ObfuscatedName("client.fd")
	public int[] field1170 = new int[field1164];

	@ObfuscatedName("client.gd")
	public int[] field1171 = new int[field1164];

	@ObfuscatedName("client.hd")
	public String[] field1172 = new String[field1164];

	@ObfuscatedName("client.id")
	public class26[] field1173 = new class26[16384];

	@ObfuscatedName("client.kd")
	public int[] field1175 = new int[16384];

	@ObfuscatedName("client.ld")
	public boolean field1176 = true;

	@ObfuscatedName("client.nd")
	public int[] field1178 = new int[1000];

	@ObfuscatedName("client.pd")
	public class38 field1179 = class38.method217(1);

	@ObfuscatedName("client.rd")
	public byte[] field1181 = new byte[16384];

	@ObfuscatedName("client.Id")
	public int field1196 = -1;

	@ObfuscatedName("client.Jd")
	public int[] field1197 = new int[7];

	@ObfuscatedName("client.Nd")
	public boolean field1201 = false;

	@ObfuscatedName("client.Od")
	public String field1202 = "";

	@ObfuscatedName("client.Pd")
	public class38 field1203 = class38.method217(1);

	@ObfuscatedName("client.ce")
	public String field1215 = "";

	@ObfuscatedName("client.ge")
	public boolean field1219 = false;

	@ObfuscatedName("client.he")
	public class36[] field1220 = new class36[2];

	@ObfuscatedName("client.ie")
	public int[][] field1221 = new int[104][104];

	@ObfuscatedName("client.ke")
	public int[] field1222 = new int[9];

	@ObfuscatedName("client.se")
	public int[] field1228 = new int[33];

	@ObfuscatedName("client.we")
	public int[] field1230 = new int[5];

	@ObfuscatedName("client.xe")
	public boolean field1231 = false;

	@ObfuscatedName("client.Me")
	public boolean field1246 = false;

	@ObfuscatedName("client.Ne")
	public int field1247 = 3;

	@ObfuscatedName("client.Oe")
	public int field1248 = 0x332D25;

	@ObfuscatedName("client.Te")
	public int[] field1253 = new int[200];

	@ObfuscatedName("client.Ue")
	public boolean field1254 = false;

	@ObfuscatedName("client.ef")
	public boolean field1263 = false;

	@ObfuscatedName("client.vf")
	public int field1279 = -1;

	@ObfuscatedName("client.xf")
	public int[] field1281 = new int[500];

	@ObfuscatedName("client.yf")
	public int[] field1282 = new int[500];

	@ObfuscatedName("client.zf")
	public int[] field1283 = new int[500];

	@ObfuscatedName("client.Af")
	public int[] field1284 = new int[500];

	@ObfuscatedName("client.Gf")
	public int[][] field1289 = new int[104][104];

	@ObfuscatedName("client.If")
	public class36[] field1291 = new class36[100];

	@ObfuscatedName("client.Jf")
	public String field1292 = "";

	@ObfuscatedName("client.Kf")
	public boolean field1293 = false;

	@ObfuscatedName("client.Pf")
	public boolean field1296 = false;

	@ObfuscatedName("client.Rf")
	public class35[] field1298 = new class35[20];

	@ObfuscatedName("client.Uf")
	public int[] field1301 = new int[class67.field1013];

	@ObfuscatedName("client.gg")
	public boolean field1313 = false;

	@ObfuscatedName("client.sg")
	public int field1325 = -1;

	@ObfuscatedName("client.xg")
	public String field1329 = "";

	@ObfuscatedName("client.yg")
	public String field1330 = "";

	@ObfuscatedName("client.Dg")
	public int field1335 = -1;

	@ObfuscatedName("client.Fg")
	public int field1337 = 2;

	@ObfuscatedName("client.Jg")
	public String[] field1341 = new String[200];

	@ObfuscatedName("client.Qg")
	public boolean field1347 = false;

	@ObfuscatedName("client.bh")
	public int[] field1357 = new int[5];

	@ObfuscatedName("client.fh")
	public int[] field1359 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.gh")
	public long[] field1360 = new long[100];

	@ObfuscatedName("client.hh")
	public int[][] field1361 = new int[104][104];

	@ObfuscatedName("client.ih")
	public boolean field1362 = true;

	@ObfuscatedName("client.kh")
	public class41 field1363 = new class41();

	@ObfuscatedName("client.mh")
	public int field1365 = 1;

	@ObfuscatedName("client.nh")
	public int[] field1366 = new int[5];

	@ObfuscatedName("client.th")
	public boolean field1372 = false;

	@ObfuscatedName("client.vh")
	public int[] field1374 = new int[5];

	@ObfuscatedName("client.Ah")
	public int[] field1378 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Dh")
	public final int field1381 = 100;

	@ObfuscatedName("client.Eh")
	public int[] field1382 = new int[100];

	@ObfuscatedName("client.Fh")
	public String[] field1383 = new String[500];

	@ObfuscatedName("client.Hh")
	public class36[] field1384 = new class36[13];

	@ObfuscatedName("client.Ih")
	public class4 field1385 = new class4();

	@ObfuscatedName("client.Qh")
	public int[] field1392 = new int[151];

	@ObfuscatedName("client.Rh")
	public int[] field1393 = new int[2000];

	@ObfuscatedName("client.Sh")
	public int[] field1394 = new int[2000];

	@ObfuscatedName("client.Th")
	public boolean field1395 = false;

	@ObfuscatedName("client.Xh")
	public int field1399 = 2;

	@ObfuscatedName("client.ai")
	public int field1402 = 0x4D4233;

	@ObfuscatedName("client.ei")
	public boolean field1405 = false;

	@ObfuscatedName("client.gi")
	public int field1407 = -1;

	@ObfuscatedName("client.ki")
	public boolean field1411 = false;

	@ObfuscatedName("client.li")
	public int field1412 = -1;

	@ObfuscatedName("client.ri")
	public int[] field1418 = new int[5];

	@ObfuscatedName("client.xi")
	public int field1421 = 78;

	@ObfuscatedName("client.yi")
	public int field1422 = -1;

	@ObfuscatedName("client.Ai")
	public boolean field1424 = false;

	@ObfuscatedName("client.Bi")
	public int field1425 = 128;

	@ObfuscatedName("client.Ji")
	public int[] field1432 = new int[50];

	@ObfuscatedName("client.Ki")
	public int field1433 = -1;

	@ObfuscatedName("client.Mi")
	public int field1435 = -1;

	@ObfuscatedName("client.Oi")
	public int[] field1437 = new int[33];

	@ObfuscatedName("client.Pi")
	public boolean[] field1438 = new boolean[5];

	@ObfuscatedName("client.bj")
	public boolean field1449 = false;

	@ObfuscatedName("client.ej")
	public boolean field1452 = false;

	@ObfuscatedName("client.tj")
	public int[] field1465 = new int[151];

	@ObfuscatedName("client.zj")
	public int[] field1471 = new int[class67.field1013];

	@ObfuscatedName("client.Bj")
	public boolean field1473 = false;

	@ObfuscatedName("client.Hf")
	public static int[] field1290 = new int[99];

	@ObfuscatedName("client.ag")
	public static int field1307 = 10;

	@ObfuscatedName("client.cg")
	public static boolean field1309 = true;

	@ObfuscatedName("client.rg")
	public static String field1324 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Yg")
	public static final int[] field1354 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ah")
	public static final int[][] field1356 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.fi")
	public static BigInteger field1406 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ji")
	public static BigInteger field1410 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.sj")
	public static int[] field1464 = new int[32];

	@ObfuscatedName("client.U")
	public int field1066;

	@ObfuscatedName("client.X")
	public int field1069;

	@ObfuscatedName("client.Y")
	public int field1070;

	@ObfuscatedName("client.Z")
	public int field1071;

	@ObfuscatedName("client.Gb")
	public int field1100;

	@ObfuscatedName("client.Nb")
	public int field1105;

	@ObfuscatedName("client.Xb")
	public int field1115;

	@ObfuscatedName("client.vc")
	public static int field1136;

	@ObfuscatedName("client.xc")
	public static int field1138;

	@ObfuscatedName("client.Ac")
	public int field1141;

	@ObfuscatedName("client.Bc")
	public int field1142;

	@ObfuscatedName("client.Cc")
	public int field1143;

	@ObfuscatedName("client.Lc")
	public int field1151;

	@ObfuscatedName("client.Oc")
	public int field1154;

	@ObfuscatedName("client.Pc")
	public int field1155;

	@ObfuscatedName("client.Sc")
	public static int field1158;

	@ObfuscatedName("client.Yc")
	public int field1163;

	@ObfuscatedName("client.jd")
	public int field1174;

	@ObfuscatedName("client.md")
	public int field1177;

	@ObfuscatedName("client.qd")
	public int field1180;

	@ObfuscatedName("client.Ld")
	public static int field1199;

	@ObfuscatedName("client.Md")
	public int field1200;

	@ObfuscatedName("client.Rd")
	public int field1204;

	@ObfuscatedName("client.Sd")
	public int field1205;

	@ObfuscatedName("client.Td")
	public int field1206;

	@ObfuscatedName("client.Ud")
	public int field1207;

	@ObfuscatedName("client.Vd")
	public int field1208;

	@ObfuscatedName("client.Wd")
	public int field1209;

	@ObfuscatedName("client.Xd")
	public int field1210;

	@ObfuscatedName("client.Yd")
	public int field1211;

	@ObfuscatedName("client.Zd")
	public int field1212;

	@ObfuscatedName("client.ae")
	public int field1213;

	@ObfuscatedName("client.be")
	public int field1214;

	@ObfuscatedName("client.de")
	public int field1216;

	@ObfuscatedName("client.ee")
	public int field1217;

	@ObfuscatedName("client.me")
	public int field1223;

	@ObfuscatedName("client.ne")
	public int field1224;

	@ObfuscatedName("client.oe")
	public int field1225;

	@ObfuscatedName("client.pe")
	public int field1226;

	@ObfuscatedName("client.qe")
	public int field1227;

	@ObfuscatedName("client.ue")
	public static int field1229;

	@ObfuscatedName("client.ye")
	public static int field1232;

	@ObfuscatedName("client.ze")
	public int field1233;

	@ObfuscatedName("client.Ae")
	public int field1234;

	@ObfuscatedName("client.Be")
	public int field1235;

	@ObfuscatedName("client.Ce")
	public int field1236;

	@ObfuscatedName("client.De")
	public int field1237;

	@ObfuscatedName("client.Fe")
	public int field1239;

	@ObfuscatedName("client.Ge")
	public int field1240;

	@ObfuscatedName("client.He")
	public int field1241;

	@ObfuscatedName("client.Ie")
	public int field1242;

	@ObfuscatedName("client.Je")
	public int field1243;

	@ObfuscatedName("client.Ke")
	public int field1244;

	@ObfuscatedName("client.Le")
	public int field1245;

	@ObfuscatedName("client.Pe")
	public int field1249;

	@ObfuscatedName("client.Qe")
	public int field1250;

	@ObfuscatedName("client.Re")
	public int field1251;

	@ObfuscatedName("client.Se")
	public int field1252;

	@ObfuscatedName("client.Ve")
	public int field1255;

	@ObfuscatedName("client.We")
	public int field1256;

	@ObfuscatedName("client.Xe")
	public int field1257;

	@ObfuscatedName("client.Ye")
	public int field1258;

	@ObfuscatedName("client.Ze")
	public int field1259;

	@ObfuscatedName("client.lf")
	public int field1269;

	@ObfuscatedName("client.nf")
	public int field1271;

	@ObfuscatedName("client.sf")
	public int field1276;

	@ObfuscatedName("client.tf")
	public int field1277;

	@ObfuscatedName("client.uf")
	public int field1278;

	@ObfuscatedName("client.wf")
	public int field1280;

	@ObfuscatedName("client.Bf")
	public int field1285;

	@ObfuscatedName("client.Cf")
	public int field1286;

	@ObfuscatedName("client.Df")
	public int field1287;

	@ObfuscatedName("client.Mf")
	public int field1294;

	@ObfuscatedName("client.Of")
	public int field1295;

	@ObfuscatedName("client.Qf")
	public int field1297;

	@ObfuscatedName("client.Sf")
	public int field1299;

	@ObfuscatedName("client.Tf")
	public int field1300;

	@ObfuscatedName("client.Vf")
	public int field1302;

	@ObfuscatedName("client.Wf")
	public int field1303;

	@ObfuscatedName("client.Xf")
	public int field1304;

	@ObfuscatedName("client.Yf")
	public int field1305;

	@ObfuscatedName("client.Zf")
	public int field1306;

	@ObfuscatedName("client.bg")
	public static int field1308;

	@ObfuscatedName("client.hg")
	public int field1314;

	@ObfuscatedName("client.zg")
	public int field1331;

	@ObfuscatedName("client.Ag")
	public int field1332;

	@ObfuscatedName("client.Bg")
	public int field1333;

	@ObfuscatedName("client.Cg")
	public int field1334;

	@ObfuscatedName("client.Eg")
	public int field1336;

	@ObfuscatedName("client.Og")
	public int field1345;

	@ObfuscatedName("client.Pg")
	public int field1346;

	@ObfuscatedName("client.Rg")
	public int field1348;

	@ObfuscatedName("client.Sg")
	public int field1349;

	@ObfuscatedName("client.Tg")
	public int field1350;

	@ObfuscatedName("client.Zg")
	public int field1355;

	@ObfuscatedName("client.dh")
	public static int field1358;

	@ObfuscatedName("client.lh")
	public int field1364;

	@ObfuscatedName("client.ph")
	public int field1368;

	@ObfuscatedName("client.qh")
	public int field1369;

	@ObfuscatedName("client.rh")
	public int field1370;

	@ObfuscatedName("client.sh")
	public int field1371;

	@ObfuscatedName("client.wh")
	public int field1375;

	@ObfuscatedName("client.yh")
	public static int field1376;

	@ObfuscatedName("client.zh")
	public static int field1377;

	@ObfuscatedName("client.Lh")
	public int field1387;

	@ObfuscatedName("client.Mh")
	public int field1388;

	@ObfuscatedName("client.Nh")
	public int field1389;

	@ObfuscatedName("client.Oh")
	public int field1390;

	@ObfuscatedName("client.Ph")
	public int field1391;

	@ObfuscatedName("client.Uh")
	public int field1396;

	@ObfuscatedName("client.Vh")
	public int field1397;

	@ObfuscatedName("client.Wh")
	public int field1398;

	@ObfuscatedName("client.Yh")
	public int field1400;

	@ObfuscatedName("client.Zh")
	public int field1401;

	@ObfuscatedName("client.bi")
	public int field1403;

	@ObfuscatedName("client.hi")
	public int field1408;

	@ObfuscatedName("client.ii")
	public int field1409;

	@ObfuscatedName("client.mi")
	public static int field1413;

	@ObfuscatedName("client.qi")
	public int field1417;

	@ObfuscatedName("client.vi")
	public static int field1419;

	@ObfuscatedName("client.wi")
	public int field1420;

	@ObfuscatedName("client.zi")
	public int field1423;

	@ObfuscatedName("client.Ci")
	public int field1426;

	@ObfuscatedName("client.Di")
	public int field1427;

	@ObfuscatedName("client.Ei")
	public int field1428;

	@ObfuscatedName("client.Hi")
	public int field1431;

	@ObfuscatedName("client.Ni")
	public int field1436;

	@ObfuscatedName("client.Ri")
	public int field1439;

	@ObfuscatedName("client.Si")
	public int field1440;

	@ObfuscatedName("client.Xi")
	public int field1445;

	@ObfuscatedName("client.Yi")
	public int field1446;

	@ObfuscatedName("client.Zi")
	public int field1447;

	@ObfuscatedName("client.aj")
	public int field1448;

	@ObfuscatedName("client.cj")
	public int field1450;

	@ObfuscatedName("client.dj")
	public int field1451;

	@ObfuscatedName("client.fj")
	public int field1453;

	@ObfuscatedName("client.gj")
	public int field1454;

	@ObfuscatedName("client.hj")
	public int field1455;

	@ObfuscatedName("client.jj")
	public int field1457;

	@ObfuscatedName("client.lj")
	public int field1459;

	@ObfuscatedName("client.mj")
	public static int field1460;

	@ObfuscatedName("client.pj")
	public static int field1463;

	@ObfuscatedName("client.uj")
	public int field1466;

	@ObfuscatedName("client.vj")
	public int field1467;

	@ObfuscatedName("client.wj")
	public int field1468;

	@ObfuscatedName("client.xj")
	public int field1469;

	@ObfuscatedName("client.yj")
	public int field1470;

	@ObfuscatedName("client.Yb")
	public long field1116;

	@ObfuscatedName("client.Dc")
	public long field1144;

	@ObfuscatedName("client.oh")
	public long field1367;

	@ObfuscatedName("client.uh")
	public long field1373;

	@ObfuscatedName("client.kj")
	public long field1458;

	@ObfuscatedName("client.eg")
	public class18 field1311;

	@ObfuscatedName("client.Lg")
	public static class27 field1342;

	@ObfuscatedName("client.Ub")
	public class35 field1112;

	@ObfuscatedName("client.Vb")
	public class35 field1113;

	@ObfuscatedName("client.fe")
	public class35 field1218;

	@ObfuscatedName("client.fg")
	public class35 field1312;

	@ObfuscatedName("client.Mg")
	public class35 field1343;

	@ObfuscatedName("client.Ng")
	public class35 field1344;

	@ObfuscatedName("client.Li")
	public class35 field1434;

	@ObfuscatedName("client.nj")
	public class35 field1461;

	@ObfuscatedName("client.oj")
	public class35 field1462;

	@ObfuscatedName("client.Ij")
	public class35 field1479;

	@ObfuscatedName("client.Jj")
	public class35 field1480;

	@ObfuscatedName("client.Kj")
	public class35 field1481;

	@ObfuscatedName("client.Lj")
	public class35 field1482;

	@ObfuscatedName("client.sd")
	public class36 field1182;

	@ObfuscatedName("client.td")
	public class36 field1183;

	@ObfuscatedName("client.ud")
	public class36 field1184;

	@ObfuscatedName("client.vd")
	public class36 field1185;

	@ObfuscatedName("client.wd")
	public class36 field1186;

	@ObfuscatedName("client.af")
	public class36 field1260;

	@ObfuscatedName("client.bf")
	public class36 field1261;

	@ObfuscatedName("client.cf")
	public class36 field1262;

	@ObfuscatedName("client.ff")
	public class36 field1264;

	@ObfuscatedName("client.gf")
	public class36 field1265;

	@ObfuscatedName("client.hf")
	public class36 field1266;

	@ObfuscatedName("client.jf")
	public class36 field1267;

	@ObfuscatedName("client.kf")
	public class36 field1268;

	@ObfuscatedName("client.Ug")
	public class36 field1351;

	@ObfuscatedName("client.Vg")
	public class36 field1352;

	@ObfuscatedName("client.Cj")
	public class36 field1474;

	@ObfuscatedName("client.Dj")
	public class36 field1475;

	@ObfuscatedName("client.Ej")
	public class36 field1476;

	@ObfuscatedName("client.Fj")
	public class36 field1477;

	@ObfuscatedName("client.Gj")
	public class36 field1478;

	@ObfuscatedName("client.Pb")
	public class37 field1107;

	@ObfuscatedName("client.Qb")
	public class37 field1108;

	@ObfuscatedName("client.Rb")
	public class37 field1109;

	@ObfuscatedName("client.Sb")
	public class37 field1110;

	@ObfuscatedName("client.yd")
	public class43 field1187;

	@ObfuscatedName("client.zd")
	public class43 field1188;

	@ObfuscatedName("client.Ad")
	public class43 field1189;

	@ObfuscatedName("client.Bd")
	public class43 field1190;

	@ObfuscatedName("client.Cd")
	public class43 field1191;

	@ObfuscatedName("client.Dd")
	public class43 field1192;

	@ObfuscatedName("client.Ed")
	public class43 field1193;

	@ObfuscatedName("client.Fd")
	public class43 field1194;

	@ObfuscatedName("client.Gd")
	public class43 field1195;

	@ObfuscatedName("client.of")
	public class43 field1272;

	@ObfuscatedName("client.pf")
	public class43 field1273;

	@ObfuscatedName("client.qf")
	public class43 field1274;

	@ObfuscatedName("client.rf")
	public class43 field1275;

	@ObfuscatedName("client.ig")
	public class43 field1315;

	@ObfuscatedName("client.jg")
	public class43 field1316;

	@ObfuscatedName("client.kg")
	public class43 field1317;

	@ObfuscatedName("client.lg")
	public class43 field1318;

	@ObfuscatedName("client.mg")
	public class43 field1319;

	@ObfuscatedName("client.ng")
	public class43 field1320;

	@ObfuscatedName("client.og")
	public class43 field1321;

	@ObfuscatedName("client.pg")
	public class43 field1322;

	@ObfuscatedName("client.qg")
	public class43 field1323;

	@ObfuscatedName("client.ni")
	public class43 field1414;

	@ObfuscatedName("client.oi")
	public class43 field1415;

	@ObfuscatedName("client.pi")
	public class43 field1416;

	@ObfuscatedName("client.Aj")
	public class47 field1472;

	@ObfuscatedName("client.ij")
	public class50 field1456;

	@ObfuscatedName("client.Kd")
	public class58 field1198;

	@ObfuscatedName("client.Bh")
	public class5 field1379;

	@ObfuscatedName("client.Uc")
	public String field1160;

	@ObfuscatedName("client.Vc")
	public String field1161;

	@ObfuscatedName("client.Ee")
	public String field1238;

	@ObfuscatedName("client.Ef")
	public String field1288;

	@ObfuscatedName("client.mf")
	public Socket field1270;

	@ObfuscatedName("client.dg")
	public static boolean field1310;

	@ObfuscatedName("client.Xg")
	public static boolean field1353;

	@ObfuscatedName("client.di")
	public static boolean field1404;

	@ObfuscatedName("client.Ec")
	public int[] field1145;

	@ObfuscatedName("client.Fc")
	public int[] field1146;

	@ObfuscatedName("client.ug")
	public int[] field1326;

	@ObfuscatedName("client.vg")
	public int[] field1327;

	@ObfuscatedName("client.wg")
	public int[] field1328;

	@ObfuscatedName("client.Gg")
	public int[] field1338;

	@ObfuscatedName("client.Hg")
	public int[] field1339;

	@ObfuscatedName("client.Ig")
	public int[] field1340;

	@ObfuscatedName("client.Fi")
	public int[] field1429;

	@ObfuscatedName("client.Gi")
	public int[] field1430;

	@ObfuscatedName("client.Ti")
	public int[] field1441;

	@ObfuscatedName("client.Ui")
	public int[] field1442;

	@ObfuscatedName("client.Vi")
	public int[] field1443;

	@ObfuscatedName("client.Wi")
	public int[] field1444;

	@ObfuscatedName("client.N")
	public class36[] field1062;

	@ObfuscatedName("client.Ch")
	public byte[][] field1380;

	@ObfuscatedName("client.Jh")
	public int[][][] field1386;

	@ObfuscatedName("client.a(BI)V")
	public final void method429(int arg0) {
		if (arg0 >= 0) {
			if (field1313) {
				field1313 = false;
				field1246 = true;
			}

			int var2 = field1281[arg0];
			int var3 = field1282[arg0];
			int var4 = field1283[arg0];
			int var5 = field1284[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 737) {
				method432();
			}

			if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
				String var6 = field1383[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = class51.method300(var6.substring(var7 + 5).trim());
					if (var4 == 605) {
						method509(var8);
					}

					if (var4 == 47) {
						method553(var8);
					}

					if (var4 == 513) {
						method430(var8);
					}

					if (var4 == 884) {
						method458(var8);
					}
				}
			}

			if (var4 == 902) {
				String var10 = field1383[arg0];
				int var11 = var10.indexOf("@whi@");
				if (var11 != -1) {
					long var12 = class51.method300(var10.substring(var11 + 5).trim());
					int var14 = -1;
					for (int var15 = 0; var15 < field1345; var15++) {
						if (field1061[var15] == var12) {
							var14 = var15;
							break;
						}
					}

					if (var14 != -1 && field1253[var14] > 0) {
						field1246 = true;
						field1313 = false;
						field1293 = true;
						field1292 = "";
						field1154 = 3;
						field1367 = field1061[var14];
						field1111 = "Enter message to send to " + field1341[var14];
					}
				}
			}

			if (var4 == 370) {
				boolean var16 = method516(var3, var2, field1342.field410[0], 0, 0, 0, 0, 2, 0, false, field1342.field411[0]);
				if (!var16) {
					method516(var3, var2, field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
				}

				field1331 = field24;
				field1332 = field25;
				field1334 = 2;
				field1333 = 0;
				field1203.method218(195);
				field1203.method220(field1240 + var2);
				field1203.method220(field1241 + var3);
				field1203.method220(var5);
				field1203.method220(field1286);
			}

			if (var4 == 357) {
				method536(var5, 5, var3, var2);
			}

			if (var4 == 743) {
				field1377++;
				if (field1377 >= 124) {
					field1203.method218(173);
					field1203.method220(37954);
				}

				method536(var5, 98, var3, var2);
			}

			if (var4 == 275) {
				class27 var18 = field1082[var5];
				if (var18 != null) {
					method516(var18.field411[0], var18.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
					field1331 = field24;
					field1332 = field25;
					field1334 = 2;
					field1333 = 0;
					field1203.method218(136);
					field1203.method220(var5);
					field1203.method220(field1237);
					field1203.method220(field1235);
					field1203.method220(field1236);
				}
			}

			if (var4 == 1152) {
				class60 var19 = class60.method348(var5);
				String var20;
				if (var19.field919 == null) {
					var20 = "It's a " + var19.field918 + ".";
				} else {
					var20 = new String(var19.field919);
				}

				method484("", var20, 0);
			}

			if (var4 == 102) {
				field1234 = 1;
				field1235 = var2;
				field1236 = var3;
				field1237 = var5;
				field1238 = class60.method348(var5).field918;
				field1285 = 0;
				field1405 = true;
			} else {
				if (var4 == 1071) {
					method536(var5, 253, var3, var2);
				}

				if (var4 == 810 && method536(var5, 215, var3, var2)) {
					field1203.method220(field1237);
					field1203.method220(field1235);
					field1203.method220(field1236);
				}

				if (var4 == 563) {
					field1203.method218(199);
					field1203.method220(var5);
					field1203.method220(var2);
					field1203.method220(var3);
					field1203.method220(field1286);
					field1249 = 0;
					field1250 = var3;
					field1251 = var2;
					field1252 = 2;
					if (class4.field56[var3].field62 == field1412) {
						field1252 = 1;
					}

					if (class4.field56[var3].field62 == field1095) {
						field1252 = 3;
					}
				}

				if (var4 == 997 && !field1449) {
					field1203.method218(223);
					field1203.method220(var3);
					field1449 = true;
				}

				if (var4 == 131) {
					class27 var21 = field1082[var5];
					if (var21 != null) {
						method516(var21.field411[0], var21.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;
						field1203.method218(97);
						field1203.method220(var5);
						field1203.method220(field1286);
					}
				}

				if (var4 == 524) {
					String var22 = field1383[arg0];
					int var23 = var22.indexOf("@whi@");
					if (var23 != -1) {
						if (field1412 == -1) {
							method432();
							field1128 = var22.substring(var23 + 5).trim();
							field1452 = false;

							for (int var24 = 0; var24 < class4.field56.length; var24++) {
								if (class4.field56[var24] != null && class4.field56[var24].field65 == 600) {
									field1279 = field1412 = class4.field56[var24].field62;
									break;
								}
							}
						} else {
							method484("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
					if (var4 == 354) {
						field1203.method218(87);
					}

					if (var4 == 582) {
						if ((var5 & 0x3) == 0) {
							field1419++;
						}

						if (field1419 >= 133) {
							field1203.method218(203);
							field1203.method220(6118);
						}

						field1203.method218(198);
					}

					if (var4 == 555) {
						field1203.method218(130);
					}

					if (var4 == 113) {
						field1203.method218(88);
					}

					if (var4 == 331) {
						field1203.method218(125);
					}

					field1203.method220(var5);
					field1203.method220(var2);
					field1203.method220(var3);
					field1249 = 0;
					field1250 = var3;
					field1251 = var2;
					field1252 = 2;
					if (class4.field56[var3].field62 == field1412) {
						field1252 = 1;
					}

					if (class4.field56[var3].field62 == field1095) {
						field1252 = 3;
					}
				}

				if (var4 == 899 && method536(var5, 124, var3, var2)) {
					field1203.method220(field1286);
				}

				if (var4 == 225) {
					field1203.method218(62);
					field1203.method220(var3);
					class4 var25 = class4.field56[var3];
					if (var25.field71 != null && var25.field71[0][0] == 5) {
						int var26 = var25.field71[0][1];
						if (field1394[var26] != var25.field73[0]) {
							field1394[var26] = var25.field73[0];
							method465(var26);
							field1405 = true;
						}
					}
				}

				if (var4 == 625) {
					method536(var5, 238, var3, var2);
				}

				if (var4 == 1714) {
					class26 var27 = field1173[var5];
					if (var27 != null) {
						class59 var28 = var27.field415;
						if (var28.field906 != null) {
							var28 = var28.method345();
						}

						if (var28 != null) {
							String var29;
							if (var28.field882 == null) {
								var29 = "It's a " + var28.field881 + ".";
							} else {
								var29 = new String(var28.field882);
							}

							method484("", var29, 0);
						}
					}
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var30 = field1082[var5];
					if (var30 != null) {
						method516(var30.field411[0], var30.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;

						if (var4 == 387) {
							field1118 += var5;
							if (field1118 >= 66) {
								field1203.method218(222);
								field1203.method219(154);
							}

							field1203.method218(241);
						}

						if (var4 == 185) {
							field1203.method218(83);
						}

						if (var4 == 27) {
							field1203.method218(17);
						}

						if (var4 == 499) {
							field1203.method218(40);
						}

						if (var4 == 639) {
							field1232++;
							if (field1232 >= 52) {
								field1203.method218(0);
								field1203.method219(131);
							}

							field1203.method218(10);
						}

						field1203.method220(var5);
					}
				}

				if (var4 == 240) {
					class26 var31 = field1173[var5];
					if (var31 != null) {
						method516(var31.field411[0], var31.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;
						field1203.method218(100);
						field1203.method220(var5);
						field1203.method220(field1286);
					}
				}

				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var32 = field1173[var5];
					if (var32 != null) {
						method516(var32.field411[0], var32.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;

						if (var4 == 209) {
							field1203.method218(4);
						}

						if (var4 == 852) {
							field1203.method218(22);
						}

						if (var4 == 793) {
							field1203.method218(188);
						}

						if (var4 == 242) {
							field1203.method218(35);
						}

						if (var4 == 309) {
							field1203.method218(239);
						}

						field1203.method220(var5);
					}
				}

				if (var4 == 274) {
					class4 var33 = class4.field56[var3];
					field1285 = 1;
					field1286 = var3;
					field1287 = var33.field116;
					field1234 = 0;
					field1405 = true;
					String var34 = var33.field114;
					if (var34.indexOf(" ") != -1) {
						var34 = var34.substring(0, var34.indexOf(" "));
					}

					String var35 = var33.field114;
					if (var35.indexOf(" ") != -1) {
						var35 = var35.substring(var35.indexOf(" ") + 1);
					}

					field1288 = var34 + " " + var33.field115 + " " + var35;

					if (field1287 == 16) {
						field1405 = true;
						field1247 = 3;
						field1219 = true;
					}
				} else {
					if (var4 == 721) {
						field1125 += var3;
						if (field1125 >= 139) {
							field1203.method218(202);
							field1203.method223(0);
						}

						method536(var5, 207, var3, var2);
					}

					if (var4 == 507 || var4 == 957) {
						String var36 = field1383[arg0];
						int var37 = var36.indexOf("@whi@");
						if (var37 != -1) {
							var36 = var36.substring(var37 + 5).trim();
							String var38 = class51.method304(class51.method301(class51.method300(var36)));
							boolean var39 = false;
							for (int var40 = 0; var40 < field1083; var40++) {
								class27 var41 = field1082[field1084[var40]];
								if (var41 != null && var41.field416 != null && var41.field416.equalsIgnoreCase(var38)) {
									method516(var41.field411[0], var41.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);

									if (var4 == 507) {
										field1118 += var5;
										if (field1118 >= 66) {
											field1203.method218(222);
											field1203.method219(154);
										}

										field1203.method218(241);
									}

									if (var4 == 957) {
										field1232++;
										if (field1232 >= 52) {
											field1203.method218(0);
											field1203.method219(131);
										}

										field1203.method218(10);
									}

									field1203.method220(field1084[var40]);
									var39 = true;
									break;
								}
							}

							if (!var39) {
								method484("", "Unable to find " + var38, 0);
							}
						}
					}

					if (var4 == 435) {
						field1203.method218(62);
						field1203.method220(var3);
						class4 var42 = class4.field56[var3];
						if (var42.field71 != null && var42.field71[0][0] == 5) {
							int var43 = var42.field71[0][1];
							field1394[var43] = 1 - field1394[var43];
							method465(var43);
							field1405 = true;
						}
					}

					if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
						boolean var44 = method516(var3, var2, field1342.field410[0], 0, 0, 0, 0, 2, 0, false, field1342.field411[0]);
						if (!var44) {
							method516(var3, var2, field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						}

						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;

						if (var4 == 662) {
							field1122 += field1241;
							if (field1122 >= 118) {
								field1203.method218(26);
								field1203.method223(0);
							}

							field1203.method218(211);
						}

						if (var4 == 617) {
							field1203.method218(60);
						}

						if (var4 == 778) {
							field1203.method218(42);
						}

						if (var4 == 139) {
							if ((var2 & 0x3) == 0) {
								field1129++;
							}

							if (field1129 >= 123) {
								field1203.method218(58);
								field1203.method223(0);
							}

							field1203.method218(27);
						}

						if (var4 == 224) {
							field1460 += var3;
							if (field1460 >= 75) {
								field1203.method218(41);
								field1203.method219(19);
							}

							field1203.method218(123);
						}

						field1203.method220(field1240 + var2);
						field1203.method220(field1241 + var3);
						field1203.method220(var5);
					}

					if (var4 == 231) {
						class4 var46 = class4.field56[var3];
						boolean var47 = true;
						if (var46.field65 > 0) {
							var47 = method481(var46);
						}

						if (var47) {
							field1203.method218(62);
							field1203.method220(var3);
						}
					}

					if (var4 == 1381) {
						int var48 = var5 >> 14 & 0x7FFF;
						class57 var49 = class57.method330(var48);
						String var50;
						if (var49.field833 == null) {
							var50 = "It's a " + var49.field832 + ".";
						} else {
							var50 = new String(var49.field833);
						}

						method484("", var50, 0);
					}

					if (var4 == 829) {
						class26 var51 = field1173[var5];
						if (var51 != null) {
							method516(var51.field411[0], var51.field410[0], field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
							field1331 = field24;
							field1332 = field25;
							field1334 = 2;
							field1333 = 0;
							field1203.method218(120);
							field1203.method220(var5);
							field1203.method220(field1237);
							field1203.method220(field1235);
							field1203.method220(field1236);
						}
					}

					if (var4 == 111) {
						boolean var52 = method516(var3, var2, field1342.field410[0], 0, 0, 0, 0, 2, 0, false, field1342.field411[0]);
						if (!var52) {
							method516(var3, var2, field1342.field410[0], 0, 1, 0, 0, 2, 1, false, field1342.field411[0]);
						}

						field1331 = field24;
						field1332 = field25;
						field1334 = 2;
						field1333 = 0;
						field1203.method218(163);
						field1203.method220(field1240 + var2);
						field1203.method220(field1241 + var3);
						field1203.method220(var5);
						field1203.method220(field1237);
						field1203.method220(field1235);
						field1203.method220(field1236);
					}

					if (var4 == 398) {
						field1203.method218(101);
						field1203.method220(var5);
						field1203.method220(var2);
						field1203.method220(var3);
						field1203.method220(field1237);
						field1203.method220(field1235);
						field1203.method220(field1236);
						field1249 = 0;
						field1250 = var3;
						field1251 = var2;
						field1252 = 2;
						if (class4.field56[var3].field62 == field1412) {
							field1252 = 1;
						}

						if (class4.field56[var3].field62 == field1095) {
							field1252 = 3;
						}
					}

					if (var4 == 718) {
						if (field1201) {
							field1311.method88(var2 - 4, var3 - 4);
						} else {
							field1311.method88(field24 - 4, field25 - 4);
						}
					}

					if (var4 == 1328) {
						class60 var54 = class60.method348(var5);
						class4 var55 = class4.field56[var3];
						String var56;
						if (var55 != null && var55.field58[var2] >= 100000) {
							var56 = var55.field58[var2] + " x " + var54.field918;
						} else if (var54.field919 == null) {
							var56 = "It's a " + var54.field918 + ".";
						} else {
							var56 = new String(var54.field919);
						}

						method484("", var56, 0);
					}

					if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
						if (var4 == 795) {
							field1203.method218(213);
						}

						if (var4 == 694) {
							field1203.method218(64);
						}

						if (var4 == 681) {
							field1088++;
							if (field1088 >= 116) {
								field1203.method218(152);
								field1203.method222(0xC6A439);
							}

							field1203.method218(254);
						}

						if (var4 == 100) {
							field1203.method218(127);
						}

						if (var4 == 962) {
							field1203.method218(156);
						}

						field1203.method220(var5);
						field1203.method220(var2);
						field1203.method220(var3);
						field1249 = 0;
						field1250 = var3;
						field1251 = var2;
						field1252 = 2;
						if (class4.field56[var3].field62 == field1412) {
							field1252 = 1;
						}

						if (class4.field56[var3].field62 == field1095) {
							field1252 = 3;
						}
					}

					field1234 = 0;
					field1285 = 0;
					field1405 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method430(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1345; var3++) {
				if (field1061[var3] == arg0) {
					field1345--;
					field1405 = true;

					for (int var4 = var3; var4 < field1345; var4++) {
						field1341[var4] = field1341[var4 + 1];
						field1253[var4] = field1253[var4 + 1];
						field1061[var4] = field1061[var4 + 1];
					}

					field1203.method218(160);
					field1203.method225(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLib;II)V")
	public final void method431(class35 arg0, int arg1, int arg2) {
		int var4 = field1426 + field1336 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field551[var4];
			int var7 = class31.field552[var4];
			var6 = var6 * 256 / (field1120 + 256);
			var7 = var7 * 256 / (field1120 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method192(83 - var9 - arg0.field603 / 2 - 4, field1261, var8 + 94 + 4 - arg0.field602 / 2);
			} else {
				arg0.method186(var8 + 94 + 4 - arg0.field602 / 2, 83 - var9 - arg0.field603 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method432() {
		field1203.method218(165);

		if (field1407 != -1) {
			field1407 = -1;
			field1405 = true;
			field1449 = false;
			field1219 = true;
		}

		if (field1095 != -1) {
			field1095 = -1;
			field1246 = true;
			field1449 = false;
		}

		field1412 = -1;
	}

	@ObfuscatedName("client.a(Lab;IIII)V")
	public final void method433(class27 arg0, int arg1, int arg2, int arg3) {
		if (field1342 != arg0 && field1294 < 400) {
			String var5;
			if (arg0.field423 == 0) {
				var5 = arg0.field416 + method547(field1342.field422, arg0.field422) + " (level-" + arg0.field422 + ")";
			} else {
				var5 = arg0.field416 + " (skill-" + arg0.field423 + ")";
			}

			if (field1234 == 1) {
				field1383[field1294] = "Use " + field1238 + " with @whi@" + var5;
				field1283[field1294] = 275;
				field1284[field1294] = arg1;
				field1281[field1294] = arg3;
				field1282[field1294] = arg2;
				field1294++;
			} else if (field1285 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1102[var6] != null) {
						field1383[field1294] = field1102[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1102[var6].equalsIgnoreCase("attack")) {
							if (arg0.field422 > field1342.field422) {
								var7 = 2000;
							}

							if (field1342.field439 != 0 && arg0.field439 != 0) {
								if (field1342.field439 == arg0.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1103[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1283[field1294] = var7 + 639;
						}

						if (var6 == 1) {
							field1283[field1294] = var7 + 499;
						}

						if (var6 == 2) {
							field1283[field1294] = var7 + 27;
						}

						if (var6 == 3) {
							field1283[field1294] = var7 + 387;
						}

						if (var6 == 4) {
							field1283[field1294] = var7 + 185;
						}

						field1284[field1294] = arg1;
						field1281[field1294] = arg3;
						field1282[field1294] = arg2;
						field1294++;
					}
				}
			} else if ((field1287 & 0x8) == 8) {
				field1383[field1294] = field1288 + " @whi@" + var5;
				field1283[field1294] = 131;
				field1284[field1294] = arg1;
				field1281[field1294] = arg3;
				field1282[field1294] = arg2;
				field1294++;
			}

			for (int var8 = 0; var8 < field1294; var8++) {
				if (field1283[var8] == 718) {
					field1383[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;BI)V")
	public final void method434(class38 arg0, int arg1) {
		field1177 = 0;
		field1085 = 0;
		method561(arg1, arg0);
		method535(arg1, arg0);
		method530(arg0, arg1);
		method460(arg0, arg1);

		for (int var3 = 0; var3 < field1177; var3++) {
			int var4 = field1178[var3];
			if (field1136 != field1082[var4].field405) {
				field1082[var4] = null;
			}
		}

		if (arg0.field622 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field622 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1083; var5++) {
			if (field1082[field1084[var5]] == null) {
				signlink.reporterror(field1139 + " null entry in pl list - pos:" + var5 + " size:" + field1083);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method435() {
		if (field1259 > 0) {
			method503();
		} else {
			field1274.method258();
			field1108.method202("Connection lost", 0, 257, 144);
			field1108.method202("Connection lost", 0xFFFFFF, 256, 143);
			field1108.method202("Please wait - attempting to reestablish", 0, 257, 159);
			field1108.method202("Please wait - attempting to reestablish", 0xFFFFFF, 256, 158);
			field1274.method259(4, 4, field9);
			field1355 = 0;
			field1216 = 0;
			class5 var1 = field1379;
			field1263 = false;
			field1130 = 0;
			method488(field1139, field1140, true);

			if (!field1263) {
				method503();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method436() {
		if (field1453 > 1) {
			field1453--;
		}

		if (field1259 > 0) {
			field1259--;
		}

		for (int var1 = 0; var1 < 5 && method557(); var1++) {
		}

		if (field1263) {
			synchronized (field1198.field870) {
				if (!field1353) {
					field1198.field871 = 0;
				} else if (field23 != 0 || field1198.field871 >= 40) {
					field1203.method218(151);
					field1203.method219(0);
					int var3 = field1203.field622;
					int var4 = 0;
					for (int var5 = 0; var5 < field1198.field871 && var3 - field1203.field622 < 240; var5++) {
						var4++;
						int var6 = field1198.field873[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1198.field872[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1198.field873[var5] == -1 && field1198.field872[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1400 != var7 || field1401 != var6) {
							int var9 = var7 - field1400;
							field1400 = var7;
							int var10 = var6 - field1401;
							field1401 = var6;

							if (field1214 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1203.method220((field1214 << 12) + (var9 << 6) + var10);
								field1214 = 0;
							} else if (field1214 < 8) {
								field1203.method222((field1214 << 19) + var8 + 0x800000);
								field1214 = 0;
							} else {
								field1203.method223((field1214 << 19) + var8 - 0x40000000);
								field1214 = 0;
							}
						} else if (field1214 < 2047) {
							field1214++;
						}
					}

					field1203.method228(field1203.field622 - var3);

					if (var4 >= field1198.field871) {
						field1198.field871 = 0;
					} else {
						field1198.field871 -= var4;
						for (int var11 = 0; var11 < field1198.field871; var11++) {
							field1198.field872[var11] = field1198.field872[var4 + var11];
							field1198.field873[var11] = field1198.field873[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1144) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1144 = field26;
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
				field1203.method218(240);
				field1203.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1371 > 0) {
				field1371--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1372 = true;
			}

			if (field1372 && field1371 <= 0) {
				field1371 = 20;
				field1372 = false;
				field1203.method218(169);
				field1203.method220(field1425);
				field1203.method220(field1426);
			}

			if (field14 && !field1176) {
				field1176 = true;
				field1203.method218(247);
				field1203.method219(1);
			}

			if (!field14 && field1176) {
				field1176 = false;
				field1203.method218(247);
				field1203.method219(0);
			}

			method491();
			method537();
			method541();
			field1257++;
			if (field1257 > 750) {
				method435();
			}

			method527();
			method441();
			method439();
			field1300++;

			if (field1334 != 0) {
				field1333 += 20;
				if (field1333 >= 400) {
					field1334 = 0;
				}
			}

			if (field1252 != 0) {
				field1249++;
				if (field1249 >= 15) {
					if (field1252 == 2) {
						field1405 = true;
					}

					if (field1252 == 3) {
						field1246 = true;
					}

					field1252 = 0;
				}
			}

			if (field1304 != 0) {
				field1403++;

				if (field17 > field1305 + 5 || field17 < field1305 - 5 || field18 > field1306 + 5 || field18 < field1306 - 5) {
					field1150 = true;
				}

				if (field16 == 0) {
					if (field1304 == 2) {
						field1405 = true;
					}

					if (field1304 == 3) {
						field1246 = true;
					}

					field1304 = 0;

					if (field1150 && field1403 >= 5) {
						field1142 = -1;
						method496();

						if (field1302 == field1142 && field1303 != field1141) {
							class4 var19 = class4.field56[field1302];
							byte var20 = 0;
							if (field1423 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1141] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1303;
								int var22 = field1141;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1303;
								int var24 = field1141;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method33(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method33(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method33(field1303, field1141);
							}

							field1203.method218(38);
							field1203.method220(field1302);
							field1203.method220(field1303);
							field1203.method220(field1141);
							field1203.method219(var20);
						}
					} else if ((field1143 == 1 || method556(field1294 - 1)) && field1294 > 2) {
						method523();
					} else if (field1294 > 0) {
						method429(field1294 - 1);
					}

					field1249 = 10;
					field23 = 0;
				}
			}

			field1199++;
			if (field1199 > 62) {
				field1199 = 0;
				field1203.method218(6);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method516(var26, var25, field1342.field410[0], 0, 0, 0, 0, 0, 0, true, field1342.field411[0]);
				class18.field292 = -1;

				if (var27) {
					field1331 = field24;
					field1332 = field25;
					field1334 = 1;
					field1333 = 0;
				}
			}

			if (field23 == 1 && field1161 != null) {
				field1161 = null;
				field1246 = true;
				field23 = 0;
			}

			method560();
			method531();
			method528();
			method463();

			if (field16 == 1 || field23 == 1) {
				field1105++;
			}

			if (field1417 == 2) {
				method438();
			}

			if (field1417 == 2 && field1094) {
				method548();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1366[var28]++;
			}

			method474();
			field15++;
			if (field15 > 4500) {
				field1259 = 250;
				field15 -= 500;
				field1203.method218(80);
			}

			field1439++;
			if (field1439 > 500) {
				field1439 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1151 += field1152;
				}

				if ((var29 & 0x2) == 2) {
					field1398 += field1399;
				}

				if ((var29 & 0x4) == 4) {
					field1364 += field1365;
				}
			}

			if (field1151 < -50) {
				field1152 = 2;
			}

			if (field1151 > 50) {
				field1152 = -2;
			}

			if (field1398 < -55) {
				field1399 = 2;
			}

			if (field1398 > 55) {
				field1399 = -2;
			}

			if (field1364 < -40) {
				field1365 = 1;
			}

			if (field1364 > 40) {
				field1365 = -1;
			}

			field1295++;
			if (field1295 > 500) {
				field1295 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1336 += field1337;
				}

				if ((var30 & 0x2) == 2) {
					field1120 += field1121;
				}
			}

			if (field1336 < -60) {
				field1337 = 2;
			}

			if (field1336 > 60) {
				field1337 = -2;
			}

			if (field1120 < -20) {
				field1121 = 1;
			}

			if (field1120 > 10) {
				field1121 = -1;
			}

			field1258++;
			if (field1258 > 50) {
				field1203.method218(115);
			}

			try {
				if (field1379 != null && field1203.field622 > 0) {
					field1379.method42(field1203.field622, 0, field1203.field621);
					field1203.field622 = 0;
					field1258 = 0;
				}
			} catch (IOException var32) {
				method435();
			} catch (Exception var33) {
				method503();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method437(String arg0) throws IOException {
		if (field1153) {
			if (field1270 != null) {
				try {
					field1270.close();
				} catch (Exception var4) {
				}

				field1270 = null;
			}

			field1270 = method500(43595);
			field1270.setSoTimeout(10000);
			InputStream var2 = field1270.getInputStream();
			OutputStream var3 = field1270.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.c(I)V")
	public final void method438() {
		try {
			int var1 = field1342.field360 + field1151;
			int var2 = field1342.field361 + field1398;
			if (field1369 - var1 < -500 || field1369 - var1 > 500 || field1370 - var2 < -500 || field1370 - var2 > 500) {
				field1369 = var1;
				field1370 = var2;
			}

			if (field1369 != var1) {
				field1369 += (var1 - field1369) / 16;
			}

			if (field1370 != var2) {
				field1370 += (var2 - field1370) / 16;
			}

			if (field27[1] == 1) {
				field1427 += (-field1427 - 24) / 2;
			} else if (field27[2] == 1) {
				field1427 += (24 - field1427) / 2;
			} else {
				field1427 /= 2;
			}

			if (field27[3] == 1) {
				field1428 += (12 - field1428) / 2;
			} else if (field27[4] == 1) {
				field1428 += (-field1428 - 12) / 2;
			} else {
				field1428 /= 2;
			}

			field1426 = field1427 / 2 + field1426 & 0x7FF;
			field1425 += field1428 / 2;
			if (field1425 < 128) {
				field1425 = 128;
			}

			if (field1425 > 383) {
				field1425 = 383;
			}

			int var3 = field1369 >> 7;
			int var4 = field1370 >> 7;
			int var5 = method532(field1369, field1350, field1370);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1350;
						if (var9 < 3 && (field1132[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1386[var9][var7][var8];
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

			if (var11 > field1457) {
				field1457 += (var11 - field1457) / 24;
			} else if (var11 < field1457) {
				field1457 += (var11 - field1457) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1342.field360 + "," + field1342.field361 + "," + field1369 + "," + field1370 + "," + field1454 + "," + field1455 + "," + field1240 + "," + field1241);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method439() {
		for (int var1 = -1; var1 < field1083; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1081;
			} else {
				var2 = field1084[var1];
			}

			class27 var3 = field1082[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1174; var4++) {
			int var5 = field1175[var4];
			class26 var6 = field1173[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1379 != null) {
				field1379.method38();
			}
		} catch (Exception var1) {
		}

		field1379 = null;
		method562();

		if (field1198 != null) {
			field1198.field869 = false;
		}

		field1198 = null;
		field1472.method271();
		field1472 = null;
		field1203 = null;
		field1127 = null;
		field1179 = null;
		field1338 = null;
		field1074 = null;
		field1380 = null;
		field1339 = null;
		field1340 = null;
		field1386 = null;
		field1132 = null;
		field1311 = null;
		field1119 = null;
		field1289 = null;
		field1221 = null;
		field1148 = null;
		field1149 = null;
		field1181 = null;
		field1272 = null;
		field1273 = null;
		field1274 = null;
		field1275 = null;
		field1414 = null;
		field1415 = null;
		field1416 = null;
		field1187 = null;
		field1188 = null;
		field1189 = null;
		field1190 = null;
		field1191 = null;
		field1192 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1260 = null;
		field1261 = null;
		field1262 = null;
		field1474 = null;
		field1475 = null;
		field1476 = null;
		field1384 = null;
		field1182 = null;
		field1183 = null;
		field1184 = null;
		field1185 = null;
		field1186 = null;
		field1264 = null;
		field1265 = null;
		field1266 = null;
		field1267 = null;
		field1268 = null;
		field1312 = null;
		field1134 = null;
		field1298 = null;
		field1063 = null;
		field1479 = null;
		field1480 = null;
		field1481 = null;
		field1482 = null;
		field1291 = null;
		field1072 = null;
		field1361 = null;
		field1082 = null;
		field1084 = null;
		field1086 = null;
		field1087 = null;
		field1178 = null;
		field1173 = null;
		field1175 = null;
		field1137 = null;
		field1363 = null;
		field1097 = null;
		field1159 = null;
		field1281 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1383 = null;
		field1394 = null;
		field1067 = null;
		field1068 = null;
		field1099 = null;
		field1218 = null;
		field1341 = null;
		field1061 = null;
		field1253 = null;
		field1318 = null;
		field1319 = null;
		field1315 = null;
		field1316 = null;
		field1317 = null;
		field1320 = null;
		field1321 = null;
		field1322 = null;
		field1323 = null;
		method486();
		class57.method329();
		class59.method340();
		class60.method347();
		class63.field966 = null;
		class64.field979 = null;
		class4.field56 = null;
		class65.field986 = null;
		class66.field997 = null;
		class68.field1017 = null;
		class68.field1029 = null;
		class70.field1040 = null;
		field10 = null;
		class27.field440 = null;
		class34.method164();
		class18.method49();
		class31.method122();
		class7.method46();
		System.gc();
	}

	@ObfuscatedName("client.b(B)V")
	public final void method9() {
		if (field1424 || field1473 || field1411) {
			method478();
		} else {
			field1138++;

			if (field1263) {
				method448();
			} else {
				method507(false);
			}

			field1105 = 0;
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public final void method440(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method441() {
		for (int var1 = 0; var1 < field1174; var1++) {
			int var2 = field1175[var1];
			class26 var3 = field1173[var2];
			if (var3 != null) {
				method442(var3, var3.field415.field883);
			}
		}
	}

	@ObfuscatedName("client.a(Ly;IZ)V")
	public final void method442(class25 arg0, int arg1) {
		if (arg0.field360 < 128 || arg0.field361 < 128 || arg0.field360 >= 13184 || arg0.field361 >= 13184) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (field1342 == arg0 && (arg0.field360 < 1536 || arg0.field361 < 1536 || arg0.field360 >= 11776 || arg0.field361 >= 11776)) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (arg0.field402 > field1136) {
			method443(arg0);
		} else if (arg0.field403 >= field1136) {
			method444(arg0);
		} else {
			method445(arg0);
		}

		method446(arg0);
		method447(arg0);
	}

	@ObfuscatedName("client.a(ILy;)V")
	public final void method443(class25 arg0) {
		int var2 = arg0.field402 - field1136;
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

	@ObfuscatedName("client.a(Ly;I)V")
	public final void method444(class25 arg0) {
		if (field1136 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field997[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1136 - arg0.field402;
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

	@ObfuscatedName("client.a(BLy;)V")
	public final void method445(class25 arg0) {
		arg0.field385 = arg0.field365;
		if (arg0.field409 == 0) {
			arg0.field413 = 0;
		} else {
			if (arg0.field388 != -1 && arg0.field391 == 0) {
				class66 var2 = class66.field997[arg0.field388];
				if (arg0.field414 > 0 && var2.field1009 == 0) {
					arg0.field413++;
					return;
				}

				if (arg0.field414 <= 0 && var2.field1010 == 0) {
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

	@ObfuscatedName("client.b(BLy;)V")
	public final void method446(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1173[arg0.field382];
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
				if (field1433 == var5) {
					var5 = field1081;
				}

				class27 var6 = field1082[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1240 - field1240) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1241 - field1241) * 64;
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

	@ObfuscatedName("client.a(ZLy;)V")
	public final void method447(class25 arg0) {
		arg0.field363 = false;

		if (arg0.field385 != -1) {
			class66 var2 = class66.field997[arg0.field385];
			arg0.field387++;
			if (arg0.field386 < var2.field998 && arg0.field387 > var2.method382(arg0.field386)) {
				arg0.field387 = 0;
				arg0.field386++;
			}

			if (arg0.field386 >= var2.field998) {
				arg0.field387 = 0;
				arg0.field386 = 0;
			}
		}

		if (arg0.field393 != -1 && field1136 >= arg0.field396) {
			if (arg0.field394 < 0) {
				arg0.field394 = 0;
			}

			class66 var3 = class68.field1017[arg0.field393].field1021;
			arg0.field395++;
			while (arg0.field394 < var3.field998 && arg0.field395 > var3.method382(arg0.field394)) {
				arg0.field395 -= var3.method382(arg0.field394);
				arg0.field394++;
			}

			if (arg0.field394 >= var3.field998 && (arg0.field394 < 0 || arg0.field394 >= var3.field998)) {
				arg0.field393 = -1;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 <= 1) {
			class66 var4 = class66.field997[arg0.field388];
			if (var4.field1009 == 1 && arg0.field414 > 0 && arg0.field402 <= field1136 && arg0.field403 < field1136) {
				arg0.field391 = 1;
				return;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 == 0) {
			class66 var5 = class66.field997[arg0.field388];
			arg0.field390++;
			while (arg0.field389 < var5.field998 && arg0.field390 > var5.method382(arg0.field389)) {
				arg0.field390 -= var5.method382(arg0.field389);
				arg0.field389++;
			}

			if (arg0.field389 >= var5.field998) {
				arg0.field389 -= var5.field1002;
				arg0.field392++;
				if (arg0.field392 >= var5.field1008) {
					arg0.field388 = -1;
				}

				if (arg0.field389 < 0 || arg0.field389 >= var5.field998) {
					arg0.field388 = -1;
				}
			}

			arg0.field363 = var5.field1004;
		}

		if (arg0.field391 > 0) {
			arg0.field391--;
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method448() {
		if (field1296) {
			field1296 = false;
			field1187.method259(0, 4, field9);
			field1188.method259(0, 357, field9);
			field1189.method259(722, 4, field9);
			field1190.method259(743, 205, field9);
			field1191.method259(0, 0, field9);
			field1192.method259(516, 4, field9);
			field1193.method259(516, 205, field9);
			field1194.method259(496, 357, field9);
			field1195.method259(0, 338, field9);
			field1405 = true;
			field1246 = true;
			field1219 = true;
			field1254 = true;

			if (field1417 != 2) {
				field1274.method259(4, 4, field9);
				field1273.method259(550, 4, field9);
			}
		}

		if (field1417 == 2) {
			method538();
		}

		if (field1201 && field1387 == 1) {
			field1405 = true;
		}

		if (field1407 != -1) {
			boolean var1 = method519(field1300, field1407);
			if (var1) {
				field1405 = true;
			}
		}

		if (field1252 == 2) {
			field1405 = true;
		}

		if (field1304 == 2) {
			field1405 = true;
		}

		if (field1405) {
			method468();
			field1405 = false;
		}

		if (field1095 == -1) {
			field1385.field76 = field1421 - field1349 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method467(0, false, 77, field1385, field18 - 357, field1421, field17 - 17, 463);
			}

			int var2 = field1421 - field1385.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1421 - 77) {
				var2 = field1421 - 77;
			}

			if (field1349 != var2) {
				field1349 = var2;
				field1246 = true;
			}
		}

		if (field1095 != -1) {
			boolean var3 = method519(field1300, field1095);
			if (var3) {
				field1246 = true;
			}
		}

		if (field1252 == 3) {
			field1246 = true;
		}

		if (field1304 == 3) {
			field1246 = true;
		}

		if (field1161 != null) {
			field1246 = true;
		}

		if (field1201 && field1387 == 2) {
			field1246 = true;
		}

		if (field1246) {
			method456();
			field1246 = false;
		}

		if (field1417 == 2) {
			method473();
			field1273.method259(550, 4, field9);
		}

		if (field1422 != -1) {
			field1219 = true;
		}

		if (field1219) {
			if (field1422 != -1 && field1422 == field1247) {
				field1422 = -1;
				field1203.method218(36);
				field1203.method219(field1247);
			}

			field1219 = false;
			field1416.method258();
			field1476.method199(0, 0);

			if (field1407 == -1) {
				if (field1359[field1247] != -1) {
					if (field1247 == 0) {
						field1182.method199(22, 10);
					}

					if (field1247 == 1) {
						field1183.method199(54, 8);
					}

					if (field1247 == 2) {
						field1183.method199(82, 8);
					}

					if (field1247 == 3) {
						field1184.method199(110, 8);
					}

					if (field1247 == 4) {
						field1186.method199(153, 8);
					}

					if (field1247 == 5) {
						field1186.method199(181, 8);
					}

					if (field1247 == 6) {
						field1185.method199(209, 9);
					}
				}

				if (field1359[0] != -1 && (field1422 != 0 || field1136 % 20 < 10)) {
					field1384[0].method199(29, 13);
				}

				if (field1359[1] != -1 && (field1422 != 1 || field1136 % 20 < 10)) {
					field1384[1].method199(53, 11);
				}

				if (field1359[2] != -1 && (field1422 != 2 || field1136 % 20 < 10)) {
					field1384[2].method199(82, 11);
				}

				if (field1359[3] != -1 && (field1422 != 3 || field1136 % 20 < 10)) {
					field1384[3].method199(115, 12);
				}

				if (field1359[4] != -1 && (field1422 != 4 || field1136 % 20 < 10)) {
					field1384[4].method199(153, 13);
				}

				if (field1359[5] != -1 && (field1422 != 5 || field1136 % 20 < 10)) {
					field1384[5].method199(180, 11);
				}

				if (field1359[6] != -1 && (field1422 != 6 || field1136 % 20 < 10)) {
					field1384[6].method199(208, 13);
				}
			}

			field1416.method259(516, 160, field9);
			field1415.method258();
			field1475.method199(0, 0);

			if (field1407 == -1) {
				if (field1359[field1247] != -1) {
					if (field1247 == 7) {
						field1264.method199(42, 0);
					}

					if (field1247 == 8) {
						field1265.method199(74, 0);
					}

					if (field1247 == 9) {
						field1265.method199(102, 0);
					}

					if (field1247 == 10) {
						field1266.method199(130, 1);
					}

					if (field1247 == 11) {
						field1268.method199(173, 0);
					}

					if (field1247 == 12) {
						field1268.method199(201, 0);
					}

					if (field1247 == 13) {
						field1267.method199(229, 0);
					}
				}

				if (field1359[8] != -1 && (field1422 != 8 || field1136 % 20 < 10)) {
					field1384[7].method199(74, 2);
				}

				if (field1359[9] != -1 && (field1422 != 9 || field1136 % 20 < 10)) {
					field1384[8].method199(102, 3);
				}

				if (field1359[10] != -1 && (field1422 != 10 || field1136 % 20 < 10)) {
					field1384[9].method199(137, 4);
				}

				if (field1359[11] != -1 && (field1422 != 11 || field1136 % 20 < 10)) {
					field1384[10].method199(174, 2);
				}

				if (field1359[12] != -1 && (field1422 != 12 || field1136 % 20 < 10)) {
					field1384[11].method199(201, 2);
				}

				if (field1359[13] != -1 && (field1422 != 13 || field1136 % 20 < 10)) {
					field1384[12].method199(226, 2);
				}
			}

			field1415.method259(496, 466, field9);
			field1274.method258();
		}

		if (field1254) {
			field1254 = false;
			field1414.method258();
			field1474.method199(0, 0);
			field1108.method203(28, 55, "Public chat", 0xFFFFFF, true);

			if (field1126 == 0) {
				field1108.method203(41, 55, "On", 0xFF00, true);
			}

			if (field1126 == 1) {
				field1108.method203(41, 55, "Friends", 0xFFFF00, true);
			}

			if (field1126 == 2) {
				field1108.method203(41, 55, "Off", 0xFF0000, true);
			}

			if (field1126 == 3) {
				field1108.method203(41, 55, "Hide", 0xFFFF, true);
			}

			field1108.method203(28, 184, "Private chat", 0xFFFFFF, true);

			if (field1459 == 0) {
				field1108.method203(41, 184, "On", 0xFF00, true);
			}

			if (field1459 == 1) {
				field1108.method203(41, 184, "Friends", 0xFFFF00, true);
			}

			if (field1459 == 2) {
				field1108.method203(41, 184, "Off", 0xFF0000, true);
			}

			field1108.method203(28, 324, "Trade/compete", 0xFFFFFF, true);

			if (field1397 == 0) {
				field1108.method203(41, 324, "On", 0xFF00, true);
			}

			if (field1397 == 1) {
				field1108.method203(41, 324, "Friends", 0xFFFF00, true);
			}

			if (field1397 == 2) {
				field1108.method203(41, 324, "Off", 0xFF0000, true);
			}

			field1108.method203(33, 458, "Report abuse", 0xFFFFFF, true);
			field1414.method259(0, 453, field9);
			field1274.method258();
		}

		field1300 = 0;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method449() {
		field1477 = new class36(field1456, "titlebox", 0);
		field1478 = new class36(field1456, "titlebutton", 0);
		field1062 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1062[var2] = new class36(field1456, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1062[var3] = new class36(field1456, "runes", (var3 & 0x3) + 12);
			}
		}

		field1461 = new class35(128, 265);
		field1462 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1461.field597[var4] = field1318.field655[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1462.field597[var5] = field1319.field655[var5];
		}

		field1442 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1442[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1442[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1442[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1442[var9 + 192] = 0xFFFFFF;
		}

		field1443 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1443[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1443[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1443[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1443[var13 + 192] = 0xFFFFFF;
		}

		field1444 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1444[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1444[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1444[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1444[var17 + 192] = 0xFFFFFF;
		}

		field1441 = new int[256];
		field1145 = new int[32768];
		field1146 = new int[32768];
		method511(null);
		field1429 = new int[32768];
		field1430 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1114) {
			field1395 = true;
			field1114 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = class31.field551[var7];
			int var13 = class31.field552[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field551[var8];
			int var16 = class31.field552[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1204 = arg5 - var9;
		field1205 = arg0 - var10;
		field1206 = arg4 - var11;
		field1207 = arg2;
		field1208 = arg3;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method451(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.h(Z)V")
	public static final void method452() {
		class18.field258 = false;
		class34.field574 = false;
		field1310 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1351.method199(arg2, arg3);
		field1352.method199(arg2, arg1 + arg3 - 16);
		class33.method157(field1098, arg3 + 16, arg1 - 32, arg2, 16);
		int var6 = (arg1 - 32) * arg1 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg0 - arg1);
		class33.method157(field1402, arg3 + var7 + 16, var6, arg2, 16);
		class33.method162(field1157, arg2, var6, arg3 + var7 + 16);
		class33.method162(field1157, arg2 + 1, var6, arg3 + var7 + 16);
		class33.method160(16, field1157, arg3 + var7 + 16, arg2);
		class33.method160(16, field1157, arg3 + var7 + 17, arg2);
		class33.method162(field1248, arg2 + 15, var6, arg3 + var7 + 16);
		class33.method162(field1248, arg2 + 14, var6 - 1, arg3 + var7 + 17);
		class33.method160(16, field1248, arg3 + var7 + var6 + 15, arg2);
		class33.method160(15, field1248, arg3 + var7 + var6 + 14, arg2 + 1);
	}

	@ObfuscatedName("client.f(I)V")
	public final void method454() {
		field1064 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1197[var1] = -1;
			for (int var2 = 0; var2 < class64.field978; var2++) {
				if (!class64.field979[var2].field985 && class64.field979[var2].field980 == var1 + (field1106 ? 0 : 7)) {
					field1197[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1100 = arg0;
		field1160 = arg1;
		method482();

		if (field1456 == null) {
			super.method13(arg0, arg1);
		} else {
			field1317.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1109.method202("RuneScape is loading - please wait...", 0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(0x8C1111, 304, 34, var3 / 2 - 152, var6);
			class33.method158(0, 302, 32, var3 / 2 - 151, var6 + 1);
			class33.method157(0x8C1111, var6 + 2, 30, var3 / 2 - 150, arg0 * 3);
			class33.method157(0, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3);
			field1109.method202(arg1, 0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5);
			field1317.method259(202, 171, field9);

			if (field1296) {
				field1296 = false;

				if (!field1114) {
					field1318.method259(0, 0, field9);
					field1319.method259(637, 0, field9);
				}

				field1315.method259(128, 0, field9);
				field1316.method259(202, 371, field9);
				field1320.method259(0, 265, field9);
				field1321.method259(562, 265, field9);
				field1322.method259(128, 171, field9);
				field1323.method259(562, 171, field9);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method455() {
		for (class30 var1 = (class30) field1097.method248(); var1 != null; var1 = (class30) field1097.method250()) {
			if (field1350 != var1.field458 || field1136 > var1.field464) {
				var1.method106();
			} else if (field1136 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1173[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(method532(var2.field360, var1.field458, var2.field361) - var1.field462, var2.field361, var2.field360, field1136);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1433 == var3) {
						var4 = field1342;
					} else {
						var4 = field1082[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(method532(var4.field360, var1.field458, var4.field361) - var1.field462, var4.field361, var4.field360, field1136);
					}
				}

				var1.method121(field1300);
				field1311.method61(false, var1.field477, (int) var1.field470, (int) var1.field469, -1, 60, field1350, var1, (int) var1.field471);
			}
		}

		field1358++;
		if (field1358 > 1174) {
			field1358 = 0;
			field1203.method218(90);
			field1203.method219(0);
			int var5 = field1203.field622;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method220(11499);
			}

			field1203.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method219(94);
			}

			field1203.method220(51693);
			field1203.method219(16);
			field1203.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method219(65);
			}

			field1203.method219((int) (Math.random() * 256.0D));
			field1203.method220(22990);
			field1203.method228(field1203.field622 - var5);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1308 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.d(B)V")
	public final void method456() {
		field1275.method258();
		class34.field585 = field1326;
		field1262.method199(0, 0);

		if (field1293) {
			field1109.method202(field1111, 0, 239, 40);
			field1109.method202(field1292 + "*", 128, 239, 60);
		} else if (field1313) {
			field1109.method202("Enter amount:", 0, 239, 40);
			field1109.method202(field1202 + "*", 128, 239, 60);
		} else if (field1161 != null) {
			field1109.method202(field1161, 0, 239, 40);
			field1109.method202("Click to continue", 128, 239, 60);
		} else if (field1095 != -1) {
			method515(0, 0, 0, class4.field56[field1095]);
		} else if (field1162 == -1) {
			class37 var1 = field1108;
			int var2 = 0;
			class33.method154(77, 0, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1092[var3] != null) {
					int var4 = field1090[var3];
					int var5 = field1349 + 70 - var2 * 14;
					String var6 = field1091[var3];
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
							var1.method206(var5, field1092[var3], 0, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1126 == 0 || field1126 == 1 && method514(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1220[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1220[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var5, var6 + ":", 0, var8);
							var8 += var1.method204(var6) + 8;
							var1.method206(var5, field1092[var3], 255, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1131 == 0 && (var4 == 7 || field1459 == 0 || field1459 == 1 && method514(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206(var5, "From", 0, var9);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1220[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1220[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var5, var6 + ":", 0, var11);
							var11 += var1.method204(var6) + 8;
							var1.method206(var5, field1092[var3], 0x800000, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field1397 == 0 || field1397 == 1 && method514(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, var6 + " " + field1092[var3], 0x800080, 4);
						}

						var2++;
					}

					if (var4 == 5 && field1131 == 0 && field1459 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, field1092[var3], 0x800000, 4);
						}

						var2++;
					}

					if (var4 == 6 && field1131 == 0 && field1459 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, "To " + var6 + ":", 0, 4);
							var1.method206(var5, field1092[var3], 0x800000, var1.method204("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1397 == 0 || field1397 == 1 && method514(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, var6 + " " + field1092[var3], 0x7E3200, 4);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1421 = var2 * 14 + 7;
			if (field1421 < 78) {
				field1421 = 78;
			}

			method453(field1421, 77, 463, 0, field1421 - field1349 - 77);
			String var10;
			if (field1342 == null || field1342.field416 == null) {
				var10 = class51.method304(field1139);
			} else {
				var10 = field1342.field416;
			}

			var1.method206(90, var10 + ":", 0, 4);
			var1.method206(90, field1215 + "*", 255, var1.method204(var10 + ": ") + 6);
			class33.method160(479, 0, 77, 0);
		} else {
			method515(0, 0, 0, class4.field56[field1162]);
		}

		if (field1201 && field1387 == 2) {
			method543();
		}

		field1275.method259(17, 357, field9);
		field1274.method258();
		class34.field585 = field1328;
	}

	@ObfuscatedName("client.a(ILlb;B)V")
	public final void method457(int arg0, class38 arg1) {
		if (arg0 == 136 || arg0 == 211) {
			int var3 = arg1.method229();
			int var4 = (var3 >> 4 & 0x7) + field1446;
			int var5 = (var3 & 0x7) + field1447;
			int var6 = arg1.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1089[var7];
			int var10;
			if (arg0 == 211) {
				var10 = -1;
			} else {
				var10 = arg1.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method526(var9, var5, var10, var8, -1, 0, var7, field1350, var4);
			}
		} else if (arg0 == 2) {
			int var11 = arg1.method229();
			int var12 = (var11 >> 4 & 0x7) + field1446;
			int var13 = (var11 & 0x7) + field1447;
			int var14 = arg1.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1089[var15];
			int var18 = arg1.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1386[field1350][var12][var13];
				int var20 = field1386[field1350][var12 + 1][var13];
				int var21 = field1386[field1350][var12 + 1][var13 + 1];
				int var22 = field1386[field1350][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1311.method72(var13, field1350, var12);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(2, var24, var19, var22, var16 + 4, var18, false, var20, var21);
							var23.field255 = new class28(2, var24, var19, var22, var16 + 1 & 0x3, var18, false, var20, var21);
						} else {
							var23.field254 = new class28(var15, var24, var19, var22, var16, var18, false, var20, var21);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1311.method73(var13, var12, field1350);
					if (var25 != null) {
						var25.field147 = new class28(4, var25.field148 >> 14 & 0x7FFF, var19, var22, 0, var18, false, var20, var21);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1311.method74(field1350, var12, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var15, var26.field247 >> 14 & 0x7FFF, var19, var22, var16, var18, false, var20, var21);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1311.method75(var12, field1350, var13);
					if (var27 != null) {
						var27.field178 = new class28(22, var27.field179 >> 14 & 0x7FFF, var19, var22, var16, var18, false, var20, var21);
					}
				}
			}
		} else if (arg0 == 147) {
			int var28 = arg1.method229();
			int var29 = (var28 >> 4 & 0x7) + field1446;
			int var30 = (var28 & 0x7) + field1447;
			int var31 = arg1.method231();
			int var32 = arg1.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1137[field1350][var29][var30] == null) {
					field1137[field1350][var29][var30] = new class41();
				}

				field1137[field1350][var29][var30].method245(var33);
				method470(var29, var30);
			}
		} else if (arg0 == 53) {
			int var34 = arg1.method229();
			int var35 = (var34 >> 4 & 0x7) + field1446;
			int var36 = (var34 & 0x7) + field1447;
			int var37 = arg1.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1137[field1350][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1137[field1350][var35][var36] = null;
					}

					method470(var35, var36);
				}
			}
		} else if (arg0 == 30) {
			int var40 = arg1.method229();
			int var41 = (var40 >> 4 & 0x7) + field1446;
			int var42 = (var40 & 0x7) + field1447;
			int var43 = var41 + arg1.method230();
			int var44 = var42 + arg1.method230();
			int var45 = arg1.method232();
			int var46 = arg1.method231();
			int var47 = arg1.method229() * 4;
			int var48 = arg1.method229() * 4;
			int var49 = arg1.method231();
			int var50 = arg1.method231();
			int var51 = arg1.method229();
			int var52 = arg1.method229();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var46 != 0xFFFF) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class30 var53 = new class30(field1136 + var50, method532(var41, field1350, var42) - var47, field1136 + var49, var46, var45, var41, var48, field1350, var51, var42, var52);
				var53.method120(method532(var43, field1350, var44) - var48, var44, var43, field1136 + var49);
				field1097.method245(var53);
			}
		} else if (arg0 == 193) {
			int var54 = arg1.method229();
			int var55 = (var54 >> 4 & 0x7) + field1446;
			int var56 = (var54 & 0x7) + field1447;
			int var57 = arg1.method231();
			int var58 = arg1.method229();
			int var59 = arg1.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(field1136, method532(var55, field1350, var56) - var58, var55, field1350, var57, var59, var56);
				field1159.method245(var60);
			}
		} else if (arg0 == 137) {
			int var61 = arg1.method229();
			int var62 = (var61 >> 4 & 0x7) + field1446;
			int var63 = (var61 & 0x7) + field1447;
			int var64 = arg1.method231();
			int var65 = arg1.method231();
			int var66 = arg1.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1433 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1137[field1350][var62][var63] == null) {
					field1137[field1350][var62][var63] = new class41();
				}

				field1137[field1350][var62][var63].method245(var67);
				method470(var62, var63);
			}
		} else {
			if (arg0 == 191) {
				int var68 = arg1.method229();
				int var69 = (var68 >> 4 & 0x7) + field1446;
				int var70 = (var68 & 0x7) + field1447;
				int var71 = arg1.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1089[var72];
				int var75 = arg1.method231();
				int var76 = arg1.method231();
				int var77 = arg1.method231();
				int var78 = arg1.method231();
				byte var79 = arg1.method230();
				byte var80 = arg1.method230();
				byte var81 = arg1.method230();
				byte var82 = arg1.method230();
				class27 var83;
				if (field1433 == var78) {
					var83 = field1342;
				} else {
					var83 = field1082[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1386[field1350][var69][var70];
					int var86 = field1386[field1350][var69 + 1][var70];
					int var87 = field1386[field1350][var69 + 1][var70 + 1];
					int var88 = field1386[field1350][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method526(var74, var70, -1, 0, var77 + 1, var76 + 1, 0, field1350, var69);
						var83.field426 = field1136 + var76;
						var83.field427 = field1136 + var77;
						var83.field431 = var89;
						int var90 = var84.field836;
						int var91 = var84.field837;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field837;
							var91 = var84.field836;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method532(var83.field428, field1350, var83.field430);

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

			if (arg0 == 253) {
				int var94 = arg1.method229();
				int var95 = (var94 >> 4 & 0x7) + field1446;
				int var96 = (var94 & 0x7) + field1447;
				int var97 = arg1.method231();
				int var98 = arg1.method231();
				int var99 = arg1.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1137[field1350][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method470(var95, var96);
					}
				}
			} else if (arg0 == 222) {
				int var102 = arg1.method229();
				int var103 = (var102 >> 4 & 0x7) + field1446;
				int var104 = (var102 & 0x7) + field1447;
				int var105 = arg1.method231();
				int var106 = arg1.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1342.field410[0] >= var103 - var107 && field1342.field410[0] <= var103 + var107 && field1342.field411[0] >= var104 - var107 && field1342.field411[0] <= var104 + var107 && field1362 && !field1310 && field1445 < 50) {
					field1096[field1445] = var105;
					field1432[field1445] = var108;
					field1135[field1445] = class55.field791[var105];
					field1445++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method458(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1408; var3++) {
				if (field1360[var3] == arg0) {
					field1408--;
					field1405 = true;

					for (int var4 = var3; var4 < field1408; var4++) {
						field1360[var4] = field1360[var4 + 1];
					}

					field1203.method218(104);
					field1203.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZII)V")
	public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg6 >= 1 && arg4 <= 102 && arg6 <= 102) {
			if (field1310 && field1350 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field1311.method76(arg3, arg4, arg6);
			}

			if (arg0 == 1) {
				var8 = field1311.method77(arg3, arg4, arg6);
			}

			if (arg0 == 2) {
				var8 = field1311.method78(arg3, arg4, arg6);
			}

			if (arg0 == 3) {
				var8 = field1311.method79(arg3, arg4, arg6);
			}

			if (var8 != 0) {
				int var12 = field1311.method80(arg3, arg4, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field1311.method67(arg3, arg4, arg6);
					class57 var16 = class57.method330(var13);
					if (var16.field838) {
						field1119[arg3].method364(var14, var15, arg6, var16.field839, arg4);
					}
				}

				if (arg0 == 1) {
					field1311.method68(arg3, arg6, arg4);
				}

				if (arg0 == 2) {
					field1311.method69(arg4, arg6, arg3);
					class57 var17 = class57.method330(var13);
					if (var17.field836 + arg4 > 103 || var17.field836 + arg6 > 103 || var17.field837 + arg4 > 103 || var17.field837 + arg6 > 103) {
						return;
					}

					if (var17.field838) {
						field1119[arg3].method365(var17.field836, var17.field839, var15, arg4, arg6, var17.field837);
					}
				}

				if (arg0 == 3) {
					field1311.method70(arg4, arg6, arg3);
					class57 var18 = class57.method330(var13);
					if (var18.field838 && var18.field840) {
						field1119[arg3].method367(arg4, arg6);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1132[1][arg4][arg6] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method31(arg6, var19, arg5, field1119[arg3], arg4, arg3, field1386, field1311, arg1, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Llb;BI)V")
	public final void method460(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1085; var3++) {
			int var4 = field1086[var3];
			class27 var5 = field1082[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method229() << 8;
			}

			method494(var6, arg0, var4, var5);
		}
	}

	@ObfuscatedName("client.i(Z)Ljava/lang/String;")
	public final String method461() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 297);

			if (arg0.length == 5) {
				field1307 = Integer.parseInt(arg0[0]);
				field1308 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method471();
				} else if (arg0[2].equals("highmem")) {
					method452();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1309 = false;
				} else if (arg0[3].equals("members")) {
					field1309 = true;
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

	@ObfuscatedName("client.e(B)V")
	public final void method462() {
		try {
			field1196 = -1;
			field1159.method252();
			field1097.method252();
			class34.method167();
			method480();
			field1311.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1119[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(104, field1386, 104, field1132);
			int var3 = field1074.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1338[var4] >> 8;
				int var6 = field1338[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1311.method51(field1350);
			} else {
				field1311.method51(0);
			}

			field1203.method218(115);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1338[var7] >> 8) * 64 - field1240;
				int var9 = (field1338[var7] & 0xFF) * 64 - field1241;
				byte[] var10 = field1074[var7];
				if (var10 != null) {
					var2.method15((field1454 - 6) * 8, (field1455 - 6) * 8, var8, var10, var9);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1338[var11] >> 8) * 64 - field1240;
				int var13 = (field1338[var11] & 0xFF) * 64 - field1241;
				byte[] var14 = field1074[var11];
				if (var14 == null && field1455 < 800) {
					var2.method14(var12, 64, var13, 64);
				}
			}

			field1203.method218(115);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1380[var15];
				if (var16 != null) {
					int var17 = (field1338[var15] >> 8) * 64 - field1240;
					int var18 = (field1338[var15] & 0xFF) * 64 - field1241;
					var2.method18(field1311, var18, var16, field1119, var17);
				}
			}

			field1203.method218(115);
			var2.method20(field1119, field1311);
			field1274.method258();
			field1203.method218(115);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method470(var19, var20);
				}
			}

			method540();
		} catch (Exception var33) {
		}

		class57.field866.method103();

		if (field1310 && signlink.cache_dat != null) {
			int var22 = field1472.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1472.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1472.method283();
		int var25 = (field1454 - 6) / 8 - 1;
		int var26 = (field1454 + 6) / 8 + 1;
		int var27 = (field1455 - 6) / 8 - 1;
		int var28 = (field1455 + 6) / 8 + 1;
		if (field1347) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1472.method274(var30, var29, 0);
					if (var31 != -1) {
						field1472.method284(3, var31);
					}

					int var32 = field1472.method274(var30, var29, 1);
					if (var32 != -1) {
						field1472.method284(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method463() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1126 = (field1126 + 1) % 4;
				field1254 = true;
				field1246 = true;
				field1203.method218(242);
				field1203.method219(field1126);
				field1203.method219(field1459);
				field1203.method219(field1397);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1459 = (field1459 + 1) % 3;
				field1254 = true;
				field1246 = true;
				field1203.method218(242);
				field1203.method219(field1126);
				field1203.method219(field1459);
				field1203.method219(field1397);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1397 = (field1397 + 1) % 3;
				field1254 = true;
				field1246 = true;
				field1203.method218(242);
				field1203.method219(field1126);
				field1203.method219(field1459);
				field1203.method219(field1397);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1412 == -1) {
					method432();
					field1128 = "";
					field1452 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1279 = field1412 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method484("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method464(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1085; var3++) {
			int var4 = field1086[var3];
			class26 var5 = field1173[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method229();
				int var8 = arg1.method229();
				var5.method114(field1136, var7, var8);
				var5.field379 = field1136 + 300;
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
					int var11 = class66.field997[var9].field1011;
					if (var11 == 1) {
						var5.field389 = 0;
						var5.field390 = 0;
						var5.field391 = var10;
						var5.field392 = 0;
					}

					if (var11 == 2) {
						var5.field392 = 0;
					}
				} else if (var9 == -1 || var5.field388 == -1 || class66.field997[var9].field1005 >= class66.field997[var5.field388].field1005) {
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
				var5.method114(field1136, var12, var13);
				var5.field379 = field1136 + 300;
				var5.field380 = arg1.method229();
				var5.field381 = arg1.method229();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method341(arg1.method231());
				var5.field364 = var5.field415.field883;
				var5.field408 = var5.field415.field905;
				var5.field367 = var5.field415.field887;
				var5.field368 = var5.field415.field888;
				var5.field369 = var5.field415.field889;
				var5.field370 = var5.field415.field890;
				var5.field365 = var5.field415.field886;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg1.method231();
				int var14 = arg1.method234();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1136;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1136) {
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

	@ObfuscatedName("client.c(II)V")
	public final void method465(int arg0) {
		int var2 = class70.field1040[arg0].field1048;
		if (var2 != 0) {
			int var3 = field1394[arg0];
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

				class60.field957.method103();
				field1296 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1104;

				if (var3 == 0) {
					method440(0, field1104);
					field1104 = true;
				}

				if (var3 == 1) {
					method440(-400, field1104);
					field1104 = true;
				}

				if (var3 == 2) {
					method440(-800, field1104);
					field1104 = true;
				}

				if (var3 == 3) {
					method440(-1200, field1104);
					field1104 = true;
				}

				if (var3 == 4) {
					field1104 = false;
				}

				if (field1104 != var4 && !field1310) {
					if (field1104) {
						field1155 = field1079;
						field1156 = true;
						field1472.method279(2, field1155);
					} else {
						method562();
					}

					field1239 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1362 = true;
					method451(0);
				}

				if (var3 == 1) {
					field1362 = true;
					method451(-400);
				}

				if (var3 == 2) {
					field1362 = true;
					method451(-800);
				}

				if (var3 == 3) {
					field1362 = true;
					method451(-1200);
				}

				if (var3 == 4) {
					field1362 = false;
				}
			}

			if (var2 == 5) {
				field1143 = var3;
			}

			if (var2 == 6) {
				field1420 = var3;
			}

			if (var2 == 8) {
				field1131 = var3;
				field1246 = true;
			}

			if (var2 == 9) {
				field1423 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method466(int arg0) {
		int[] var2 = field1218.field597;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1132[arg0][var7][var5] & 0x18) == 0) {
					field1311.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1132[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1311.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1218.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1132[arg0][var11][var10] & 0x18) == 0) {
					method539(var11, var9, var8, arg0, var10);
				}

				if (arg0 < 3 && (field1132[arg0 + 1][var11][var10] & 0x8) != 0) {
					method539(var11, var9, var8, arg0 + 1, var10);
				}
			}
		}

		field1274.method258();
		field1066 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1311.method79(field1350, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field849;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1119[field1350].field964;
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

						field1099[field1066] = field1072[var15];
						field1067[field1066] = var16;
						field1068[field1066] = var17;
						field1066++;
					}
				}
			}
		}

		field1376++;
		if (field1376 > 112) {
			field1376 = 0;
			field1203.method218(164);
			field1203.method219(50);
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method10() {
		field1296 = true;
	}

	@ObfuscatedName("client.a(IZILd;BIIII)V")
	public final void method467(int arg0, boolean arg1, int arg2, class4 arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1231) {
			field1077 = 32;
		} else {
			field1077 = 0;
		}

		field1231 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg4 >= arg0 && arg4 < arg0 + 16) {
			arg3.field76 -= field1105 * 4;

			if (arg1) {
				field1405 = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg4 >= arg0 + arg2 - 16 && arg4 < arg0 + arg2) {
			arg3.field76 += field1105 * 4;

			if (arg1) {
				field1405 = true;
				return;
			}
		} else if (arg6 >= arg7 - field1077 && arg6 < arg7 + field1077 + 16 && arg4 >= arg0 + 16 && arg4 < arg0 + arg2 - 16 && field1105 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg0 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg3.field76 = (arg5 - arg2) * var10 / var11;

			if (arg1) {
				field1405 = true;
			}

			field1231 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method468() {
		field1272.method258();
		class34.field585 = field1327;
		field1260.method199(0, 0);

		if (field1407 != -1) {
			method515(0, 0, 0, class4.field56[field1407]);
		} else if (field1359[field1247] != -1) {
			method515(0, 0, 0, class4.field56[field1359[field1247]]);
		}

		if (field1201 && field1387 == 1) {
			method543();
		}

		field1272.method259(553, 205, field9);
		field1274.method258();
		class34.field585 = field1328;
	}

	@ObfuscatedName("client.a(BILd;)I")
	public final int method469(int arg0, class4 arg1) {
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
					var8 = field1471[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1301[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1123[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field910 && (!class60.method348(var11).field931 || field1309)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1394[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1290[field1301[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1394[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1342.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1013; var13++) {
						if (class67.field1015[var13]) {
							var8 += field1301[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field910 && (!class60.method348(var15).field931 || field1309)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1180;
				}

				if (var7 == 12) {
					var8 = field1448;
				}

				if (var7 == 13) {
					int var17 = field1394[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1031[var19];
					int var21 = var20.field1033;
					int var22 = var20.field1034;
					int var23 = var20.field1035;
					int var24 = field1464[var23 - var22];
					var8 = field1394[var21] >> var22 & var24;
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
					var8 = (field1342.field360 >> 7) + field1240;
				}

				if (var7 == 19) {
					var8 = (field1342.field361 >> 7) + field1241;
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

	@ObfuscatedName("client.e(II)V")
	public final void method470(int arg0, int arg1) {
		class41 var3 = field1137[field1350][arg0][arg1];
		if (var3 == null) {
			field1311.method71(field1350, arg0, arg1);
		} else {
			int var4 = -99999999;
			class29 var5 = null;
			for (class29 var6 = (class29) var3.method248(); var6 != null; var6 = (class29) var3.method250()) {
				class60 var7 = class60.method348(var6.field455);
				int var8 = var7.field930;
				if (var7.field929) {
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
			field1311.method57(arg0, var5, var9, var10, method532(arg0 * 128 + 64, field1350, arg1 * 128 + 64), var12, field1350, arg1);
		}
	}

	@ObfuscatedName("client.f(B)V")
	public static final void method471() {
		class18.field258 = true;
		class34.field574 = true;
		field1310 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void method472(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1174) {
			for (int var4 = var3; var4 < field1174; var4++) {
				field1178[field1177++] = field1175[var4];
			}
		}

		if (var3 > field1174) {
			signlink.reporterror(field1139 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1174 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1175[var5];
			class26 var7 = field1173[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1175[field1174++] = var6;
				var7.field405 = field1136;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1175[field1174++] = var6;
					var7.field405 = field1136;
					field1086[field1085++] = var6;
				} else if (var9 == 1) {
					field1175[field1174++] = var6;
					var7.field405 = field1136;
					int var10 = arg1.method240(3);
					var7.method111(false, var10);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1086[field1085++] = var6;
					}
				} else if (var9 == 2) {
					field1175[field1174++] = var6;
					var7.field405 = field1136;
					int var12 = arg1.method240(3);
					var7.method111(true, var12);
					int var13 = arg1.method240(3);
					var7.method111(true, var13);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1086[field1085++] = var6;
					}
				} else if (var9 == 3) {
					field1178[field1177++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method473() {
		field1273.method258();

		if (field1355 == 2) {
			byte[] var1 = field1261.field604;
			int[] var2 = class33.field564;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1312.method190(field1426, 33, 25, field1437, 0, 256, 25, field1228, 0, 33);
			field1274.method258();
		} else {
			int var5 = field1426 + field1336 & 0x7FF;
			int var6 = field1342.field360 / 32 + 48;
			int var7 = 464 - field1342.field361 / 32;
			field1218.method190(var5, 146, var7, field1465, 25, field1120 + 256, var6, field1392, 5, 151);
			field1312.method190(field1426, 33, 25, field1437, 0, 256, 25, field1228, 0, 33);

			for (int var8 = 0; var8 < field1066; var8++) {
				int var9 = field1067[var8] * 4 + 2 - field1342.field360 / 32;
				int var10 = field1068[var8] * 4 + 2 - field1342.field361 / 32;
				method431(field1099[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1137[field1350][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1342.field360 / 32;
						int var15 = var12 * 4 + 2 - field1342.field361 / 32;
						method431(field1479, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field1174; var16++) {
				class26 var17 = field1173[field1175[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field906 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field897) {
						int var19 = var17.field360 / 32 - field1342.field360 / 32;
						int var20 = var17.field361 / 32 - field1342.field361 / 32;
						method431(field1480, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field1083; var21++) {
				class27 var22 = field1082[field1084[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1342.field360 / 32;
					int var24 = var22.field361 / 32 - field1342.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1345; var28++) {
						if (field1061[var28] == var26 && field1253[var28] != 0) {
							var25 = true;
							break;
						}
					}

					if (field1342.field439 != 0 && var22.field439 != 0) {
						if (field1342.field439 == var22.field439) {
							var25 = true;
						} else {
							var25 = false;
						}
					}

					if (var25) {
						method431(field1482, var24, var23);
					} else {
						method431(field1481, var24, var23);
					}
				}
			}

			if (field1368 != 0 && field1136 % 20 < 10) {
				if (field1368 == 1 && field1244 >= 0 && field1244 < field1173.length) {
					class26 var29 = field1173[field1244];
					if (var29 != null) {
						int var30 = var29.field360 / 32 - field1342.field360 / 32;
						int var31 = var29.field361 / 32 - field1342.field361 / 32;
						method534(var30, var31, field1113);
					}
				}

				if (field1368 == 2) {
					int var32 = (field1466 - field1240) * 4 + 2 - field1342.field360 / 32;
					int var33 = (field1467 - field1241) * 4 + 2 - field1342.field361 / 32;
					method534(var32, var33, field1113);
				}

				if (field1368 == 10 && field1409 >= 0 && field1409 < field1082.length) {
					class27 var34 = field1082[field1409];
					if (var34 != null) {
						int var35 = var34.field360 / 32 - field1342.field360 / 32;
						int var36 = var34.field361 / 32 - field1342.field361 / 32;
						method534(var35, var36, field1113);
					}
				}
			}

			if (field1216 != 0) {
				int var37 = field1216 * 4 + 2 - field1342.field360 / 32;
				int var38 = field1217 * 4 + 2 - field1342.field361 / 32;
				method431(field1112, var38, var37);
			}

			class33.method157(0xFFFFFF, 78, 3, 97, 3);
			field1274.method258();
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method474() {
		field1463++;
		if (field1463 > 192) {
			field1463 = 0;
			field1203.method218(24);
			field1203.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1412 != -1 && field1412 == field1279) {
						break;
					}

					if (field1293) {
						if (var1 >= 32 && var1 <= 122 && field1292.length() < 80) {
							field1292 = field1292 + (char) var1;
							field1246 = true;
						}

						if (var1 == 8 && field1292.length() > 0) {
							field1292 = field1292.substring(0, field1292.length() - 1);
							field1246 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1293 = false;
							field1246 = true;

							if (field1154 == 1) {
								long var2 = class51.method300(field1292);
								method509(var2);
							}

							if (field1154 == 2 && field1345 > 0) {
								long var4 = class51.method300(field1292);
								method430(var4);
							}

							if (field1154 == 3 && field1292.length() > 0) {
								field1203.method218(47);
								field1203.method219(0);
								int var6 = field1203.field622;
								field1203.method225(field1367);
								class52.method307(field1292, field1203);
								field1203.method228(field1203.field622 - var6);
								field1292 = class52.method308(field1292);
								field1292 = class71.method401(field1292);
								method484(class51.method304(class51.method301(field1367)), field1292, 6);

								if (field1459 == 2) {
									field1459 = 1;
									field1254 = true;
									field1203.method218(242);
									field1203.method219(field1126);
									field1203.method219(field1459);
									field1203.method219(field1397);
								}
							}

							if (field1154 == 4 && field1408 < 100) {
								long var7 = class51.method300(field1292);
								method553(var7);
							}

							if (field1154 == 5 && field1408 > 0) {
								long var9 = class51.method300(field1292);
								method458(var9);
							}
						}
					} else if (field1313) {
						if (var1 >= 48 && var1 <= 57 && field1202.length() < 10) {
							field1202 = field1202 + (char) var1;
							field1246 = true;
						}

						if (var1 == 8 && field1202.length() > 0) {
							field1202 = field1202.substring(0, field1202.length() - 1);
							field1246 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1202.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1202);
								} catch (Exception var18) {
								}

								field1203.method218(236);
								field1203.method223(var11);
							}

							field1313 = false;
							field1246 = true;
						}
					} else if (field1095 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1215.length() < 80) {
							field1215 = field1215 + (char) var1;
							field1246 = true;
						}

						if (var1 == 8 && field1215.length() > 0) {
							field1215 = field1215.substring(0, field1215.length() - 1);
							field1246 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1215.length() > 0) {
							if (field1297 == 2) {
								if (field1215.equals("::clientdrop")) {
									method435();
								}

								if (field1215.equals("::lag")) {
									method493();
								}

								if (field1215.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1472.method272(2); var12++) {
										field1472.method282(var12, (byte) 1, 2);
									}
								}

								if (field1215.equals("::fpson")) {
									field1404 = true;
								}

								if (field1215.equals("::fpsoff")) {
									field1404 = false;
								}
							}

							if (field1215.startsWith("::")) {
								field1203.method218(248);
								field1203.method219(field1215.length() - 1);
								field1203.method226(field1215.substring(2));
							} else {
								String var13 = field1215.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1215 = field1215.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1215 = field1215.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1215 = field1215.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1215 = field1215.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1215 = field1215.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1215 = field1215.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1215 = field1215.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1215 = field1215.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1215 = field1215.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1215 = field1215.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1215 = field1215.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1215 = field1215.substring(6);
								}

								String var15 = field1215.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1215 = field1215.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1215 = field1215.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1215 = field1215.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1215 = field1215.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1215 = field1215.substring(6);
								}

								field1203.method218(37);
								field1203.method219(0);
								int var17 = field1203.field622;
								field1203.method219(var14);
								field1203.method219(var16);
								class52.method307(field1215, field1203);
								field1203.method228(field1203.field622 - var17);
								field1215 = class52.method308(field1215);
								field1215 = class71.method401(field1215);
								field1342.field372 = field1215;
								field1342.field374 = var14;
								field1342.field375 = var16;
								field1342.field373 = 150;

								if (field1297 == 2) {
									method484("@cr2@" + field1342.field416, field1342.field372, 2);
								} else if (field1297 == 1) {
									method484("@cr1@" + field1342.field416, field1342.field372, 2);
								} else {
									method484(field1342.field416, field1342.field372, 2);
								}

								if (field1126 == 2) {
									field1126 = 3;
									field1254 = true;
									field1203.method218(242);
									field1203.method219(field1126);
									field1203.method219(field1459);
									field1203.method219(field1397);
								}
							}

							field1215 = "";
							field1246 = true;
						}
					}
				}

				if (var1 == 8 && field1128.length() > 0) {
					field1128 = field1128.substring(0, field1128.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1128.length() < 12) {
				field1128 = field1128 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(ZLd;)V")
	public final void method475(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1346 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1346 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1346 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1345;
				if (field1346 != 2) {
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
					arg0.field97 = field1341[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1345;
			if (field1346 != 2) {
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
				if (field1253[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1253[var2] == field1307) {
					arg0.field97 = "@gre@World-" + (field1253[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1253[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1345;
			if (field1346 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1346 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1346 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1408;
				if (field1346 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1360[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1408 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1136 / 40.0D) * 256.0D) & 0x7FF;

			if (field1064) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1197[var7];
					if (var8 >= 0 && !class64.field979[var8].method377()) {
						return;
					}
				}

				field1064 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1197[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field979[var12].method378();
					}
				}

				class31 var13 = new class31(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1357[var14] != 0) {
						var13.method140(field1356[var14][0], field1356[var14][field1357[var14]]);

						if (var14 == 1) {
							var13.method140(field1354[0], field1354[field1357[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field997[field1342.field365].field999[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field1343 == null) {
				field1343 = arg0.field103;
				field1344 = arg0.field104;
			}

			if (field1106) {
				arg0.field103 = field1344;
			} else {
				arg0.field103 = field1343;
			}
		} else if (var2 == 325) {
			if (field1343 == null) {
				field1343 = arg0.field103;
				field1344 = arg0.field104;
			}

			if (field1106) {
				arg0.field103 = field1343;
			} else {
				arg0.field103 = field1344;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1128;
			if (field1136 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1297 < 1) {
				arg0.field97 = "";
			} else if (field1452) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1245 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1280 == 0) {
					var15 = "earlier today";
				} else if (field1280 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1280 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1396 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1396 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1396 > 1) {
				arg0.field97 = field1396 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1200 == 201) {
				if (field1269 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1200 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1200 == 0) {
					var16 = "Earlier today";
				} else if (field1200 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1200 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1200 == 201) {
				if (field1269 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1200 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1200 == 201) {
				if (field1269 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1200 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method476(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public final void method477(int arg0, int arg1, class59 arg2, int arg3) {
		if (field1294 < 400) {
			if (arg2.field906 != null) {
				arg2 = arg2.method345();
			}

			if (arg2 != null) {
				String var5 = arg2.field881;
				if (arg2.field898 != 0) {
					var5 = var5 + method547(field1342.field422, arg2.field898) + " (level-" + arg2.field898 + ")";
				}

				if (field1234 == 1) {
					field1383[field1294] = "Use " + field1238 + " with @yel@" + var5;
					field1283[field1294] = 829;
					field1284[field1294] = arg0;
					field1281[field1294] = arg3;
					field1282[field1294] = arg1;
					field1294++;
				} else if (field1285 != 1) {
					if (arg2.field893 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field893[var6] != null && !arg2.field893[var6].equalsIgnoreCase("attack")) {
								field1383[field1294] = arg2.field893[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1283[field1294] = 242;
								}

								if (var6 == 1) {
									field1283[field1294] = 209;
								}

								if (var6 == 2) {
									field1283[field1294] = 309;
								}

								if (var6 == 3) {
									field1283[field1294] = 852;
								}

								if (var6 == 4) {
									field1283[field1294] = 793;
								}

								field1284[field1294] = arg0;
								field1281[field1294] = arg3;
								field1282[field1294] = arg1;
								field1294++;
							}
						}
					}

					if (arg2.field893 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field893[var7] != null && arg2.field893[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field898 > field1342.field422) {
									var8 = 2000;
								}

								field1383[field1294] = arg2.field893[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1283[field1294] = var8 + 242;
								}

								if (var7 == 1) {
									field1283[field1294] = var8 + 209;
								}

								if (var7 == 2) {
									field1283[field1294] = var8 + 309;
								}

								if (var7 == 3) {
									field1283[field1294] = var8 + 852;
								}

								if (var7 == 4) {
									field1283[field1294] = var8 + 793;
								}

								field1284[field1294] = arg0;
								field1281[field1294] = arg3;
								field1282[field1294] = arg1;
								field1294++;
							}
						}
					}

					field1383[field1294] = "Examine @yel@" + var5;
					field1283[field1294] = 1714;
					field1284[field1294] = arg0;
					field1281[field1294] = arg3;
					field1282[field1294] = arg1;
					field1294++;
				} else if ((field1287 & 0x2) == 2) {
					field1383[field1294] = field1288 + " @yel@" + var5;
					field1283[field1294] = 240;
					field1284[field1294] = arg0;
					field1281[field1294] = arg3;
					field1282[field1294] = arg1;
					field1294++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method478() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1473) {
			field1114 = false;
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

		if (field1411) {
			field1114 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1424) {
			field1114 = false;
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

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method479(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method469(var2, arg0);
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

	@ObfuscatedName("client.k(I)V")
	public final void method480() {
		class57.field866.method103();
		class57.field867.method103();
		class59.field909.method103();
		class60.field956.method103();
		class60.field957.method103();
		class27.field440.method103();
		class68.field1029.method103();
	}

	@ObfuscatedName("client.a(Ld;Z)Z")
	public final boolean method481(class4 arg0) {
		int var2 = arg0.field65;
		if (field1346 == 2) {
			if (var2 == 201) {
				field1246 = true;
				field1313 = false;
				field1293 = true;
				field1292 = "";
				field1154 = 1;
				field1111 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1246 = true;
				field1313 = false;
				field1293 = true;
				field1292 = "";
				field1154 = 2;
				field1111 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1259 = 250;
			return true;
		}

		if (var2 == 501) {
			field1246 = true;
			field1313 = false;
			field1293 = true;
			field1292 = "";
			field1154 = 4;
			field1111 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1246 = true;
			field1313 = false;
			field1293 = true;
			field1292 = "";
			field1154 = 5;
			field1111 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1197[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field978 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field978) {
							var5 = 0;
						}
					}

					if (!class64.field979[var5].field985 && class64.field979[var5].field980 == var3 + (field1106 ? 0 : 7)) {
						break;
					}
				}

				field1197[var3] = var5;
				field1064 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1357[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1356[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1356[var6].length) {
					var8 = 0;
				}
			}

			field1357[var6] = var8;
			field1064 = true;
		}

		if (var2 == 324 && !field1106) {
			field1106 = true;
			method454();
		}

		if (var2 == 325 && field1106) {
			field1106 = false;
			method454();
		}

		if (var2 == 326) {
			field1203.method218(145);
			field1203.method219(field1106 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1203.method219(field1197[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1203.method219(field1357[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1452 = !field1452;
		}

		if (var2 >= 601 && var2 <= 612) {
			method432();

			if (field1128.length() > 0) {
				field1203.method218(85);
				field1203.method225(class51.method300(field1128));
				field1203.method219(var2 - 601);
				field1203.method219(field1452 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method482() {
		if (field1315 == null) {
			field10 = null;
			field1275 = null;
			field1273 = null;
			field1272 = null;
			field1274 = null;
			field1414 = null;
			field1415 = null;
			field1416 = null;
			field1318 = new class43(128, method11(), 265);
			class33.method155();
			field1319 = new class43(128, method11(), 265);
			class33.method155();
			field1315 = new class43(509, method11(), 171);
			class33.method155();
			field1316 = new class43(360, method11(), 132);
			class33.method155();
			field1317 = new class43(360, method11(), 200);
			class33.method155();
			field1320 = new class43(202, method11(), 238);
			class33.method155();
			field1321 = new class43(203, method11(), 238);
			class33.method155();
			field1322 = new class43(74, method11(), 94);
			class33.method155();
			field1323 = new class43(75, method11(), 94);
			class33.method155();

			if (field1456 != null) {
				method551();
				method449();
			}

			field1296 = true;
		}
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method483(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;I)V")
	public final void method484(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1162 != -1) {
			field1161 = arg1;
			field23 = 0;
		}

		if (field1095 == -1) {
			field1246 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1090[var4] = field1090[var4 - 1];
			field1091[var4] = field1091[var4 - 1];
			field1092[var4] = field1092[var4 - 1];
		}

		field1090[0] = arg2;
		field1091[0] = arg0;
		field1092[0] = arg1;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method485(String arg0) {
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

	@ObfuscatedName("client.m(I)V")
	public final void method486() {
		field1114 = false;
		while (field1065) {
			field1114 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1477 = null;
		field1478 = null;
		field1062 = null;
		field1441 = null;
		field1442 = null;
		field1443 = null;
		field1444 = null;
		field1145 = null;
		field1146 = null;
		field1429 = null;
		field1430 = null;
		field1461 = null;
		field1462 = null;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method487(boolean arg0) {
		if (field1342.field360 >> 7 == field1216 && field1342.field361 >> 7 == field1217) {
			field1216 = 0;
			field1413++;
			if (field1413 > 122) {
				field1413 = 0;
				field1203.method218(110);
				field1203.method219(62);
			}
		}

		int var2 = field1083;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1342;
				var5 = field1081 << 14;
			} else {
				var4 = field1082[field1084[var3]];
				var5 = field1084[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1310 && field1083 > 50 || field1083 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1136 < var4.field426 || field1136 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1361[var6][var7] == field1276) {
								continue;
							}

							field1361[var6][var7] = field1276;
						}

						var4.field425 = method532(var4.field360, field1350, var4.field361);
						field1311.method61(var4.field363, var4.field362, var4.field361, var4.field360, var5, 60, field1350, var4, var4.field425);
					} else {
						var4.field436 = false;
						var4.field425 = method532(var4.field360, field1350, var4.field361);
						field1311.method62(var5, var4.field432, var4, var4.field435, field1350, 60, var4.field433, var4.field425, var4.field361, var4.field362, var4.field434, var4.field360);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method488(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1329 = "";
				field1330 = "Connecting to server...";
				method507(true);
			}

			field1379 = new class5(method500(field1308 + 43594), this);
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1203.field622 = 0;
			field1203.method219(14);
			field1203.method219(var6);
			field1379.method42(2, 0, field1203.field621);

			for (int var7 = 0; var7 < 8; var7++) {
				field1379.method39();
			}

			int var8 = field1379.method39();
			int var9 = var8;

			if (var8 == 0) {
				field1379.method41(field1179.field621, 0, 8);
				field1179.field622 = 0;
				field1458 = field1179.method235();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1458 >> 32), (int) field1458 };
				field1203.field622 = 0;
				field1203.method219(10);
				field1203.method223(var10[0]);
				field1203.method223(var10[1]);
				field1203.method223(var10[2]);
				field1203.method223(var10[3]);
				field1203.method223(signlink.uid);
				field1203.method226(arg0);
				field1203.method226(arg1);
				field1203.method244(field1406, field1410);
				field1127.field622 = 0;

				if (arg2) {
					field1127.method219(18);
				} else {
					field1127.method219(16);
				}

				field1127.method219(field1203.field622 + 36 + 1 + 1 + 2);
				field1127.method219(255);
				field1127.method220(297);
				field1127.method219(field1310 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field1127.method223(field1222[var11]);
				}

				field1127.method227(0, field1203.field621, field1203.field622);
				field1203.field626 = new class49(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field1073 = new class49(var10);
				field1379.method42(field1127.field622, 0, field1127.field621);
				var8 = field1379.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method488(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1297 = field1379.method39();
				field1353 = field1379.method39() == 1;
				field1144 = 0L;
				field1214 = 0;
				field1198.field871 = 0;
				field14 = true;
				field1176 = true;
				field1263 = true;
				field1203.field622 = 0;
				field1179.field622 = 0;
				field1256 = -1;
				field1069 = -1;
				field1070 = -1;
				field1071 = -1;
				field1255 = 0;
				field1257 = 0;
				field1453 = 0;
				field1259 = 0;
				field1368 = 0;
				field1294 = 0;
				field1201 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field1092[var13] = null;
				}

				field1234 = 0;
				field1285 = 0;
				field1417 = 0;
				field1445 = 0;
				field1151 = (int) (Math.random() * 100.0D) - 50;
				field1398 = (int) (Math.random() * 110.0D) - 55;
				field1364 = (int) (Math.random() * 80.0D) - 40;
				field1336 = (int) (Math.random() * 120.0D) - 60;
				field1120 = (int) (Math.random() * 30.0D) - 20;
				field1426 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1355 = 0;
				field1196 = -1;
				field1216 = 0;
				field1217 = 0;
				field1083 = 0;
				field1174 = 0;

				for (int var14 = 0; var14 < field1080; var14++) {
					field1082[var14] = null;
					field1087[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field1173[var15] = null;
				}

				field1342 = field1082[field1081] = new class27();
				field1097.method252();
				field1159.method252();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field1137[var16][var17][var18] = null;
						}
					}
				}

				field1363 = new class41();
				field1346 = 0;
				field1345 = 0;
				field1162 = -1;
				field1095 = -1;
				field1412 = -1;
				field1407 = -1;
				field1335 = -1;
				field1449 = false;
				field1247 = 3;
				field1313 = false;
				field1201 = false;
				field1293 = false;
				field1161 = null;
				field1133 = 0;
				field1422 = -1;
				field1106 = true;
				method454();

				for (int var19 = 0; var19 < 5; var19++) {
					field1357[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field1102[var20] = null;
					field1103[var20] = false;
				}

				field1125 = 0;
				field1377 = 0;
				field1122 = 0;
				field1232 = 0;
				field1118 = 0;
				field1419 = 0;
				field1129 = 0;
				field1460 = 0;
				field1088 = 0;
				method502();
			} else if (var8 == 3) {
				field1329 = "";
				field1330 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1329 = "Your account has been disabled.";
				field1330 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1329 = "Your account is already logged in.";
				field1330 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1329 = "RuneScape has been updated!";
				field1330 = "Please reload this page.";
			} else if (var8 == 7) {
				field1329 = "This world is full.";
				field1330 = "Please use a different world.";
			} else if (var8 == 8) {
				field1329 = "Unable to connect.";
				field1330 = "Login server offline.";
			} else if (var8 == 9) {
				field1329 = "Login limit exceeded.";
				field1330 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1329 = "Unable to connect.";
				field1330 = "Bad session id.";
			} else if (var8 == 11) {
				field1330 = "Login server rejected session.";
				field1330 = "Please try again.";
			} else if (var8 == 12) {
				field1329 = "You need a members account to login to this world.";
				field1330 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1329 = "Could not complete login.";
				field1330 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1329 = "The server is being updated.";
				field1330 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1263 = true;
				field1203.field622 = 0;
				field1179.field622 = 0;
				field1256 = -1;
				field1069 = -1;
				field1070 = -1;
				field1071 = -1;
				field1255 = 0;
				field1257 = 0;
				field1453 = 0;
				field1294 = 0;
				field1201 = false;
				field1373 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1329 = "Login attempts exceeded.";
				field1330 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1329 = "You are standing in a members-only area.";
				field1330 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1329 = "Invalid loginserver requested";
				field1330 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field1379.method39(); var21 >= 0; var21--) {
					field1329 = "You have only just left another world";
					field1330 = "Your profile will be transferred in: " + var21 + " seconds";
					method507(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method488(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field1329 = "Unexpected server response";
				field1330 = "Please try using a different world.";
			} else if (var9 != 0) {
				field1329 = "No response from server";
				field1330 = "Please try using a different world.";
			} else if (field1130 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field1130++;
				method488(arg0, arg1, arg2);
			} else {
				field1329 = "No response from loginserver";
				field1330 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field1329 = "";
			field1330 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method489(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1383[field1294] = "Remove @whi@" + arg0.field97;
				field1283[field1294] = 884;
				field1294++;
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

		field1383[field1294] = "Remove @whi@" + field1341[var2];
		field1283[field1294] = 513;
		field1294++;
		field1383[field1294] = "Message @whi@" + field1341[var2];
		field1283[field1294] = 902;
		field1294++;
		return true;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method490() {
		for (class32 var1 = (class32) field1159.method248(); var1 != null; var1 = (class32) field1159.method250()) {
			if (field1350 != var1.field557 || var1.field563) {
				var1.method106();
			} else if (field1136 >= var1.field556) {
				var1.method151(field1300);

				if (var1.field563) {
					var1.method106();
				} else {
					field1311.method61(false, 0, var1.field559, var1.field558, -1, 60, var1.field557, var1, var1.field560);
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method491() {
		if (field1310 && field1417 == 2 && class3.field33 != field1350) {
			field1274.method258();
			field1108.method202("Loading - please wait.", 0, 257, 151);
			field1108.method202("Loading - please wait.", 0xFFFFFF, 256, 150);
			field1274.method259(4, 4, field9);
			field1417 = 1;
			field1373 = System.currentTimeMillis();
		}

		if (field1417 == 1) {
			int var1 = method492();
			if (var1 != 0 && System.currentTimeMillis() - field1373 > 360000L) {
				signlink.reporterror(field1139 + " glcfb " + field1458 + "," + var1 + "," + field1310 + "," + field1093[0] + "," + field1472.method280() + "," + field1350 + "," + field1454 + "," + field1455);
				field1373 = System.currentTimeMillis();
			}
		}

		if (field1417 == 2 && field1350 != field1196) {
			field1196 = field1350;
			method466(field1350);
		}
	}

	@ObfuscatedName("client.l(Z)I")
	public final int method492() {
		for (int var1 = 0; var1 < field1074.length; var1++) {
			if (field1074[var1] == null && field1339[var1] != -1) {
				return -1;
			}

			if (field1380[var1] == null && field1340[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1074.length; var3++) {
			byte[] var4 = field1380[var3];
			if (var4 != null) {
				int var5 = (field1338[var3] >> 8) * 64 - field1240;
				int var6 = (field1338[var3] & 0xFF) * 64 - field1241;
				var2 &= class3.method16(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1117) {
			return -4;
		} else {
			field1417 = 2;
			class3.field33 = field1350;
			method462();
			field1203.method218(81);
			return 0;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public void method493() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1115);

		if (field1472 != null) {
			System.out.println("Od-cycle:" + field1472.field748);
		}

		System.out.println("loop-cycle:" + field1136);
		System.out.println("draw-cycle:" + field1138);
		System.out.println("ptype:" + field1256);
		System.out.println("psize:" + field1255);

		if (field1379 != null) {
			field1379.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.b(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.a(ILlb;ZILab;)V")
	public final void method494(int arg0, class38 arg1, int arg2, class27 arg3) {
		if ((arg0 & 0x1) == 1) {
			int var5 = arg1.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg1.method238(var5, var6, 0);
			field1087[arg2] = var7;
			arg3.method116(var7);
		}

		if ((arg0 & 0x2) == 2) {
			int var8 = arg1.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.field388 == var8) {
				arg3.field392 = 0;
			}

			int var9 = arg1.method229();
			if (arg3.field388 == var8 && var8 != -1) {
				int var10 = class66.field997[var8].field1011;
				if (var10 == 1) {
					arg3.field389 = 0;
					arg3.field390 = 0;
					arg3.field391 = var9;
					arg3.field392 = 0;
				}

				if (var10 == 2) {
					arg3.field392 = 0;
				}
			} else if (var8 == -1 || arg3.field388 == -1 || class66.field997[var8].field1005 >= class66.field997[arg3.field388].field1005) {
				arg3.field388 = var8;
				arg3.field389 = 0;
				arg3.field390 = 0;
				arg3.field391 = var9;
				arg3.field392 = 0;
				arg3.field414 = arg3.field409;
			}
		}

		if ((arg0 & 0x4) == 4) {
			arg3.field382 = arg1.method231();
			if (arg3.field382 == 0xFFFF) {
				arg3.field382 = -1;
			}
		}

		if ((arg0 & 0x8) == 8) {
			arg3.field372 = arg1.method236();
			if (arg3.field372.charAt(0) == '~') {
				arg3.field372 = arg3.field372.substring(1);
				method484(arg3.field416, arg3.field372, 2);
			} else if (field1342 == arg3) {
				method484(arg3.field416, arg3.field372, 2);
			}

			arg3.field374 = 0;
			arg3.field375 = 0;
			arg3.field373 = 150;
		}

		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg1.method229();
			int var12 = arg1.method229();
			arg3.method114(field1136, var11, var12);
			arg3.field379 = field1136 + 300;
			arg3.field380 = arg1.method229();
			arg3.field381 = arg1.method229();
		}

		if ((arg0 & 0x20) == 0x20) {
			arg3.field383 = arg1.method231();
			arg3.field384 = arg1.method231();
		}

		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg1.method231();
			int var14 = arg1.method229();
			int var15 = arg1.method229();
			int var16 = arg1.field622;

			if (arg3.field416 != null && arg3.field417) {
				long var17 = class51.method300(arg3.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1408; var20++) {
						if (field1360[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1314 == 0) {
					try {
						String var21 = class52.method306(var15, arg1);
						var21 = class71.method401(var21);
						arg3.field372 = var21;
						arg3.field374 = var13 >> 8;
						arg3.field375 = var13 & 0xFF;
						arg3.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method484("@cr2@" + arg3.field416, var21, 1);
						} else if (var14 == 1) {
							method484("@cr1@" + arg3.field416, var21, 1);
						} else {
							method484(arg3.field416, var21, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field622 = var15 + var16;
		}

		if ((arg0 & 0x100) == 0x100) {
			arg3.field393 = arg1.method231();
			int var23 = arg1.method234();
			arg3.field397 = var23 >> 16;
			arg3.field396 = (var23 & 0xFFFF) + field1136;
			arg3.field394 = 0;
			arg3.field395 = 0;

			if (arg3.field396 > field1136) {
				arg3.field394 = -1;
			}

			if (arg3.field393 == 0xFFFF) {
				arg3.field393 = -1;
			}
		}

		if ((arg0 & 0x200) == 0x200) {
			arg3.field398 = arg1.method229();
			arg3.field400 = arg1.method229();
			arg3.field399 = arg1.method229();
			arg3.field401 = arg1.method229();
			arg3.field402 = arg1.method231() + field1136;
			arg3.field403 = arg1.method231() + field1136;
			arg3.field404 = arg1.method229();
			arg3.method112();
		}

		if ((arg0 & 0x400) == 0x400) {
			int var24 = arg1.method229();
			int var25 = arg1.method229();
			arg3.method114(field1136, var24, var25);
			arg3.field379 = field1136 + 300;
			arg3.field380 = arg1.method229();
			arg3.field381 = arg1.method229();
		}
	}

	@ObfuscatedName("client.c(ILlb;I)V")
	public final void method495(class38 arg0, int arg1) {
		field1177 = 0;
		field1085 = 0;
		method472(arg1, arg0);
		method513(arg1, arg0);
		method464(arg1, arg0);

		for (int var3 = 0; var3 < field1177; var3++) {
			int var4 = field1178[var3];
			if (field1136 != field1173[var4].field405) {
				field1173[var4].field415 = null;
				field1173[var4] = null;
			}
		}

		if (arg0.field622 != arg1) {
			signlink.reporterror(field1139 + " size mismatch in getnpcpos - pos:" + arg0.field622 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1174; var5++) {
			if (field1173[field1175[var5]] == null) {
				signlink.reporterror(field1139 + " null entry in npc list - pos:" + var5 + " size:" + field1174);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method496() {
		if (field1304 == 0) {
			field1383[0] = "Cancel";
			field1283[0] = 1106;
			field1294 = 1;
			method555();
			field1431 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1412 == -1) {
					method508();
				} else {
					method542(0, class4.field56[field1412], 4, 4, field17, field18);
				}
			}

			if (field1440 != field1431) {
				field1440 = field1431;
			}

			field1431 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1407 != -1) {
					method542(0, class4.field56[field1407], 205, 553, field17, field18);
				} else if (field1359[field1247] != -1) {
					method542(0, class4.field56[field1359[field1247]], 205, 553, field17, field18);
				}
			}

			if (field1431 != field1233) {
				field1405 = true;
				field1233 = field1431;
			}

			field1431 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1095 != -1) {
					method542(0, class4.field56[field1095], 357, 17, field17, field18);
				} else if (field18 < 434 && field17 < 426) {
					method501(field17 - 17, field18 - 357);
				}
			}

			if (field1095 != -1 && field1431 != field1299) {
				field1246 = true;
				field1299 = field1431;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1294 - 1; var2++) {
					if (field1283[var2] < 1000 && field1283[var2 + 1] > 1000) {
						String var3 = field1383[var2];
						field1383[var2] = field1383[var2 + 1];
						field1383[var2 + 1] = var3;
						int var4 = field1283[var2];
						field1283[var2] = field1283[var2 + 1];
						field1283[var2 + 1] = var4;
						int var5 = field1281[var2];
						field1281[var2] = field1281[var2 + 1];
						field1281[var2 + 1] = var5;
						int var6 = field1282[var2];
						field1282[var2] = field1282[var2 + 1];
						field1282[var2 + 1] = var6;
						int var7 = field1284[var2];
						field1284[var2] = field1284[var2 + 1];
						field1284[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLy;)V")
	public final void method497(int arg0, class25 arg1) {
		method498(arg1.field360, arg0, arg1.field361);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method498(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method532(arg0, field1350, arg2) - arg1;
			arg0 -= field1204;
			var4 -= field1205;
			arg2 -= field1206;
			int var5 = class31.field551[field1207];
			int var6 = class31.field552[field1207];
			int var7 = class31.field551[field1208];
			int var8 = class31.field552[field1208];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1075 = (var9 << 9) / arg2 + class34.field579;
				field1076 = (var11 << 9) / arg2 + class34.field580;
			} else {
				field1075 = -1;
				field1076 = -1;
			}
		} else {
			field1075 = -1;
			field1076 = -1;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method499() {
		short var1 = 256;

		if (field1450 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1450 > 768) {
					field1441[var2] = method483(field1442[var2], field1443[var2], 1024 - field1450);
				} else if (field1450 > 256) {
					field1441[var2] = field1443[var2];
				} else {
					field1441[var2] = method483(field1443[var2], field1442[var2], 256 - field1450);
				}
			}
		} else if (field1451 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1451 > 768) {
					field1441[var3] = method483(field1442[var3], field1444[var3], 1024 - field1451);
				} else if (field1451 > 256) {
					field1441[var3] = field1444[var3];
				} else {
					field1441[var3] = method483(field1444[var3], field1442[var3], 256 - field1451);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1441[var4] = field1442[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1318.field655[var5] = field1461.field597[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1101[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1429[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1441[var12];
					int var15 = field1318.field655[var7];
					field1318.field655[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1318.method259(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1319.field655[var16] = field1462.field597[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1101[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1429[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1441[var23];
					int var26 = field1319.field655[var18];
					field1319.field655[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1319.method259(637, 0, field9);
	}

	@ObfuscatedName("client.q(I)Ljava/net/Socket;")
	public final Socket method500(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(III)V")
	public final void method501(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1092[var4] != null) {
				int var5 = field1090[var4];
				int var6 = field1349 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1091[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1126 == 0 || field1126 == 1 && method514(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1342.field416)) {
						if (field1297 >= 1) {
							field1383[field1294] = "Report abuse @whi@" + var7;
							field1283[field1294] = 524;
							field1294++;
						}

						field1383[field1294] = "Add ignore @whi@" + var7;
						field1283[field1294] = 47;
						field1294++;
						field1383[field1294] = "Add friend @whi@" + var7;
						field1283[field1294] = 605;
						field1294++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1131 == 0 && (var5 == 7 || field1459 == 0 || field1459 == 1 && method514(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1297 >= 1) {
							field1383[field1294] = "Report abuse @whi@" + var7;
							field1283[field1294] = 524;
							field1294++;
						}

						field1383[field1294] = "Add ignore @whi@" + var7;
						field1283[field1294] = 47;
						field1294++;
						field1383[field1294] = "Add friend @whi@" + var7;
						field1283[field1294] = 605;
						field1294++;
					}

					var3++;
				}

				if (var5 == 4 && (field1397 == 0 || field1397 == 1 && method514(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1383[field1294] = "Accept trade @whi@" + var7;
						field1283[field1294] = 507;
						field1294++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1131 == 0 && field1459 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1397 == 0 || field1397 == 1 && method514(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1383[field1294] = "Accept challenge @whi@" + var7;
						field1283[field1294] = 957;
						field1294++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method502() {
		if (field1275 == null) {
			method486();
			field10 = null;
			field1315 = null;
			field1316 = null;
			field1317 = null;
			field1318 = null;
			field1319 = null;
			field1320 = null;
			field1321 = null;
			field1322 = null;
			field1323 = null;
			field1275 = new class43(479, method11(), 96);
			field1273 = new class43(172, method11(), 156);
			class33.method155();
			field1261.method199(0, 0);
			field1272 = new class43(190, method11(), 261);
			field1274 = new class43(512, method11(), 334);
			class33.method155();
			field1414 = new class43(496, method11(), 50);
			field1415 = new class43(269, method11(), 37);
			field1416 = new class43(249, method11(), 45);
			field1296 = true;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method503() {
		try {
			if (field1379 != null) {
				field1379.method38();
			}
		} catch (Exception var2) {
		}

		field1379 = null;
		field1263 = false;
		field1271 = 0;
		field1139 = "";
		field1140 = "";
		method480();
		field1311.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1119[var1].method359();
		}

		System.gc();
		method562();
		field1079 = -1;
		field1155 = -1;
		field1239 = 0;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method504() {
		if (field1131 != 0) {
			class37 var1 = field1108;
			int var2 = 0;
			if (field1453 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1092[var3] != null) {
					int var4 = field1090[var3];
					String var5 = field1091[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1459 == 0 || field1459 == 1 && method514(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206(var7, "From", 0, var8);
						var1.method206(var7 - 1, "From", 0xFFFF, var8);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1220[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1220[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var7, var5 + ": " + field1092[var3], 0, var11);
						var1.method206(var7 - 1, var5 + ": " + field1092[var3], 0xFFFF, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1459 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(var9, field1092[var3], 0, 4);
						var1.method206(var9 - 1, field1092[var3], 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1459 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206(var10, "To " + var5 + ": " + field1092[var3], 0, 4);
						var1.method206(var10 - 1, "To " + var5 + ": " + field1092[var3], 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method505(int arg0) {
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

	@ObfuscatedName("client.s(I)V")
	public final void method506() {
		if (field1294 >= 2 || field1234 != 0 || field1285 != 0) {
			String var1;
			if (field1234 == 1 && field1294 < 2) {
				var1 = "Use " + field1238 + " with...";
			} else if (field1285 == 1 && field1294 < 2) {
				var1 = field1288 + "...";
			} else {
				var1 = field1383[field1294 - 1];
			}

			if (field1294 > 2) {
				var1 = var1 + "@whi@ / " + (field1294 - 2) + " more options";
			}

			field1109.method211(var1, field1136 / 1000, 15, true, 0xFFFFFF, 4);
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method507(boolean arg0) {
		method482();
		field1317.method258();
		field1477.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1271 == 0) {
			int var4 = var3 / 2 + 80;
			field1107.method203(var4, var2 / 2, field1472.field733, 0x75A9A9, true);
			int var5 = var3 / 2 - 20;
			field1109.method203(var5, var2 / 2, "Welcome to RuneScape", 0xFFFF00, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1478.method199(var6 - 73, var7 - 20);
			field1109.method203(var7 + 5, var6, "New User", 0xFFFFFF, true);
			int var8 = var2 / 2 + 80;
			field1478.method199(var8 - 73, var7 - 20);
			field1109.method203(var7 + 5, var8, "Existing User", 0xFFFFFF, true);
		}

		if (field1271 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1329.length() > 0) {
				field1109.method203(var9 - 15, var2 / 2, field1329, 0xFFFF00, true);
				field1109.method203(var9, var2 / 2, field1330, 0xFFFF00, true);
				var9 += 30;
			} else {
				field1109.method203(var9 - 7, var2 / 2, field1330, 0xFFFF00, true);
				var9 += 30;
			}

			field1109.method210("Username: " + field1139 + (field1436 == 0 & field1136 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, true, var2 / 2 - 90);
			var9 += 15;
			field1109.method210("Password: " + class51.method305(field1140) + (field1436 == 1 & field1136 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var9, true, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1478.method199(var10 - 73, var11 - 20);
				field1109.method203(var11 + 5, var10, "Login", 0xFFFFFF, true);
				int var12 = var2 / 2 + 80;
				field1478.method199(var12 - 73, var11 - 20);
				field1109.method203(var11 + 5, var12, "Cancel", 0xFFFFFF, true);
			}
		}

		if (field1271 == 3) {
			field1109.method203(var3 / 2 - 60, var2 / 2, "Create a free account", 0xFFFF00, true);
			int var13 = var3 / 2 - 35;
			field1109.method203(var13, var2 / 2, "To create a new account you need to", 0xFFFFFF, true);
			var13 += 15;
			field1109.method203(var13, var2 / 2, "go back to the main RuneScape webpage", 0xFFFFFF, true);
			var13 += 15;
			field1109.method203(var13, var2 / 2, "and choose the red 'create account'", 0xFFFFFF, true);
			var13 += 15;
			field1109.method203(var13, var2 / 2, "button at the top right of that page.", 0xFFFFFF, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1478.method199(var14 - 73, var15 - 20);
			field1109.method203(var15 + 5, var14, "Cancel", 0xFFFFFF, true);
		}

		field1317.method259(202, 171, field9);

		if (field1296) {
			field1296 = false;
			field1315.method259(128, 0, field9);
			field1316.method259(202, 371, field9);
			field1320.method259(0, 265, field9);
			field1321.method259(562, 265, field9);
			field1322.method259(128, 171, field9);
			field1323.method259(562, 171, field9);
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method508() {
		if (field1234 == 0 && field1285 == 0) {
			field1383[field1294] = "Walk here";
			field1283[field1294] = 718;
			field1281[field1294] = field17;
			field1282[field1294] = field18;
			field1294++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field549; var2++) {
			int var3 = class31.field550[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1311.method80(field1350, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field863 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1234 == 1) {
						field1383[field1294] = "Use " + field1238 + " with @cya@" + var8.field832;
						field1283[field1294] = 810;
						field1284[field1294] = var3;
						field1281[field1294] = var4;
						field1282[field1294] = var5;
						field1294++;
					} else if (field1285 != 1) {
						if (var8.field848 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field848[var9] != null) {
									field1383[field1294] = var8.field848[var9] + " @cya@" + var8.field832;

									if (var9 == 0) {
										field1283[field1294] = 625;
									}

									if (var9 == 1) {
										field1283[field1294] = 721;
									}

									if (var9 == 2) {
										field1283[field1294] = 743;
									}

									if (var9 == 3) {
										field1283[field1294] = 357;
									}

									if (var9 == 4) {
										field1283[field1294] = 1071;
									}

									field1284[field1294] = var3;
									field1281[field1294] = var4;
									field1282[field1294] = var5;
									field1294++;
								}
							}
						}

						field1383[field1294] = "Examine @cya@" + var8.field832;
						field1283[field1294] = 1381;
						field1284[field1294] = var8.field829 << 14;
						field1281[field1294] = var4;
						field1282[field1294] = var5;
						field1294++;
					} else if ((field1287 & 0x4) == 4) {
						field1383[field1294] = field1288 + " @cya@" + var8.field832;
						field1283[field1294] = 899;
						field1284[field1294] = var3;
						field1281[field1294] = var4;
						field1282[field1294] = var5;
						field1294++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1173[var7];
					if (var10.field415.field883 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1174; var11++) {
							class26 var12 = field1173[field1175[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field883 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method477(field1175[var11], var5, var12.field415, var4);
							}
						}

						for (int var13 = 0; var13 < field1083; var13++) {
							class27 var14 = field1082[field1084[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method433(var14, field1084[var13], var5, var4);
							}
						}
					}

					method477(var7, var5, var10.field415, var4);
				}

				if (var6 == 0) {
					class27 var15 = field1082[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1174; var16++) {
							class26 var17 = field1173[field1175[var16]];
							if (var17 != null && var17.field415.field883 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method477(field1175[var16], var5, var17.field415, var4);
							}
						}

						for (int var18 = 0; var18 < field1083; var18++) {
							class27 var19 = field1082[field1084[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method433(var19, field1084[var18], var5, var4);
							}
						}
					}

					method433(var15, var7, var5, var4);
				}

				if (var6 == 3) {
					class41 var20 = field1137[field1350][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1234 == 1) {
								field1383[field1294] = "Use " + field1238 + " with @lre@" + var22.field918;
								field1283[field1294] = 111;
								field1284[field1294] = var21.field455;
								field1281[field1294] = var4;
								field1282[field1294] = var5;
								field1294++;
							} else if (field1285 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field932 != null && var22.field932[var23] != null) {
										field1383[field1294] = var22.field932[var23] + " @lre@" + var22.field918;

										if (var23 == 0) {
											field1283[field1294] = 139;
										}

										if (var23 == 1) {
											field1283[field1294] = 778;
										}

										if (var23 == 2) {
											field1283[field1294] = 617;
										}

										if (var23 == 3) {
											field1283[field1294] = 224;
										}

										if (var23 == 4) {
											field1283[field1294] = 662;
										}

										field1284[field1294] = var21.field455;
										field1281[field1294] = var4;
										field1282[field1294] = var5;
										field1294++;
									} else if (var23 == 2) {
										field1383[field1294] = "Take @lre@" + var22.field918;
										field1283[field1294] = 617;
										field1284[field1294] = var21.field455;
										field1281[field1294] = var4;
										field1282[field1294] = var5;
										field1294++;
									}
								}

								field1383[field1294] = "Examine @lre@" + var22.field918;
								field1283[field1294] = 1152;
								field1284[field1294] = var21.field455;
								field1281[field1294] = var4;
								field1282[field1294] = var5;
								field1294++;
							} else if ((field1287 & 0x1) == 1) {
								field1383[field1294] = field1288 + " @lre@" + var22.field918;
								field1283[field1294] = 370;
								field1284[field1294] = var21.field455;
								field1281[field1294] = var4;
								field1282[field1294] = var5;
								field1294++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method509(long arg0) {
		if (arg0 != 0L) {
			if (field1345 >= 100 && field1348 != 1) {
				method484("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field1345 >= 200) {
				method484("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1345; var4++) {
					if (field1061[var4] == arg0) {
						method484("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1408; var5++) {
					if (field1360[var5] == arg0) {
						method484("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field1342.field416)) {
					field1341[field1345] = var3;
					field1061[field1345] = arg0;
					field1253[field1345] = 0;
					field1345++;
					field1405 = true;
					field1203.method218(221);
					field1203.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method510(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method510(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method511(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1145.length; var3++) {
			field1145[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1145[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1146[var9] = (field1145[var9 - 1] + field1145[var9 + 1] + field1145[var9 - 128] + field1145[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1145;
			field1145 = field1146;
			field1146 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field607; var12++) {
				for (int var13 = 0; var13 < arg0.field606; var13++) {
					if (arg0.field604[var11++] != 0) {
						int var14 = var13 + arg0.field608 + 16;
						int var15 = var12 + arg0.field609 + 16;
						int var16 = (var15 << 7) + var14;
						field1145[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method512() {
		field1065 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1114) {
				field1115++;
				method518();
				method518();
				method499();
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

		field1065 = false;
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method513(int arg0, class38 arg1) {
		while (arg1.field623 + 21 < arg0 * 8) {
			int var3 = arg1.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1173[var3] == null) {
				field1173[var3] = new class26();
			}

			class26 var4 = field1173[var3];
			field1175[field1174++] = var3;
			var4.field405 = field1136;
			var4.field415 = class59.method341(arg1.method240(12));
			var4.field364 = var4.field415.field883;
			var4.field408 = var4.field415.field905;
			var4.field367 = var4.field415.field887;
			var4.field368 = var4.field415.field888;
			var4.field369 = var4.field415.field889;
			var4.field370 = var4.field415.field890;
			var4.field365 = var4.field415.field886;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(var7 == 1, field1342.field410[0] + var5, field1342.field411[0] + var6);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1086[field1085++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method514(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1345; var2++) {
			if (arg0.equalsIgnoreCase(field1341[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1342.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIILd;)V")
	public final void method515(int arg0, int arg1, int arg2, class4 arg3) {
		if (arg3.field63 == 0 && arg3.field78 != null && (!arg3.field77 || field1440 == arg3.field61 || field1233 == arg3.field61 || field1299 == arg3.field61)) {
			int var5 = class33.field569;
			int var6 = class33.field567;
			int var7 = class33.field570;
			int var8 = class33.field568;
			class33.method154(arg3.field67 + arg0, arg0, arg3.field66 + arg2, arg2);
			int var9 = arg3.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field79[var10] + arg2;
				int var12 = arg3.field80[var10] + arg0 - arg1;
				class4 var13 = class4.field56[arg3.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method475(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method515(var12, var13.field76, var11, var13);

					if (var13.field75 > var13.field67) {
						method453(var13.field75, var13.field67, var13.field66 + var11, var12, var13.field76);
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
									if (var17 > class33.field569 - 32 && var17 < class33.field570 && var18 > class33.field567 - 32 && var18 < class33.field568 || field1304 != 0 && field1303 == var14) {
										int var22 = 0;
										if (field1234 == 1 && field1235 == var14 && field1236 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var13.field58[var14], var21, var22);
										if (var23 != null) {
											if (field1304 != 0 && field1303 == var14 && field1302 == var13.field61) {
												var19 = field17 - field1305;
												var20 = field18 - field1306;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1403 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < class33.field567 && arg3.field76 > 0) {
													int var24 = (class33.field567 - var18 - var20) * field1300 / 3;
													if (var24 > field1300 * 10) {
														var24 = field1300 * 10;
													}

													if (var24 > arg3.field76) {
														var24 = arg3.field76;
													}

													arg3.field76 -= var24;
													field1306 += var24;
												}

												if (var18 + var20 + 32 > class33.field568 && arg3.field76 < arg3.field75 - arg3.field67) {
													int var25 = (var18 + var20 + 32 - class33.field568) * field1300 / 3;
													if (var25 > field1300 * 10) {
														var25 = field1300 * 10;
													}

													if (var25 > arg3.field75 - arg3.field67 - arg3.field76) {
														var25 = arg3.field75 - arg3.field67 - arg3.field76;
													}

													arg3.field76 += var25;
													field1306 -= var25;
												}
											} else if (field1252 != 0 && field1251 == var14 && field1250 == var13.field61) {
												var23.method188(var17, 128, var18);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field602 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1107.method206(var18 + var20 + 10, method559(var26), 0, var17 + var19 + 1);
												field1107.method206(var18 + var20 + 9, method559(var26), 0xFFFF00, var17 + var19);
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
						if (field1299 == var13.field61 || field1233 == var13.field61 || field1440 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method479(var13)) {
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
								class33.method157(var29, var12, var13.field67, var11, var13.field66);
							} else {
								class33.method158(var29, var13.field66, var13.field67, var11, var12);
							}
						} else if (var13.field93) {
							class33.method156(var13.field66, var12, 256 - (var13.field68 & 0xFF), var29, var11, var13.field67);
						} else {
							class33.method159(256 - (var13.field68 & 0xFF), var13.field67, var13.field66, var29, var11, var12);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1299 == var13.field61 || field1233 == var13.field61 || field1440 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method479(var13)) {
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

						if (var13.field64 == 6 && field1449) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class33.field565 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field618 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method476(method469(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method476(method469(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method476(method469(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method476(method469(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method476(method469(4, var13)) + var31.substring(var39 + 2);
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
								var30.method203(var34, var13.field66 / 2 + var11, var41, var33, var13.field95);
							} else {
								var30.method210(var41, var33, var34, var13.field95, var11);
							}

							var34 += var30.field618;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method479(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method186(var11, var12);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field579;
						int var44 = class34.field580;
						class34.field579 = var13.field66 / 2 + var11;
						class34.field580 = var13.field67 / 2 + var12;
						int var45 = class34.field583[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field584[var13.field112] * var13.field111 >> 16;
						boolean var47 = method479(var13);
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
							class66 var50 = class66.field997[var48];
							var49 = var13.method34(var50.field999[var13.field59], var50.field1000[var13.field59], var47);
						}

						if (var49 != null) {
							var49.method146(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class34.field579 = var43;
						class34.field580 = var44;
					} else if (var13.field63 == 7) {
						class37 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method348(var13.field57[var52] - 1);
									String var56 = var55.field918;
									if (var55.field929 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method505(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var58, var13.field66 / 2 + var57, var56, var13.field99, var13.field95);
									} else {
										var51.method210(var56, var13.field99, var58, var13.field95, var57);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var8, var6, var7, var5);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIIZI)Z")
	public final boolean method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1289[var14][var15] = 0;
				field1221[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg10;
		field1289[arg2][arg10] = 99;
		field1221[arg2][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1148[var18] = arg2;
		int var35 = var18 + 1;
		field1149[var18] = arg10;
		boolean var20 = false;
		int var21 = field1148.length;
		int[][] var22 = field1119[field1350].field964;
		while (var35 != var19) {
			var16 = field1148[var19];
			var17 = field1149[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field1119[field1350].method368(var17, var16, arg5, arg1, arg0, arg3 - 1)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field1119[field1350].method369(var16, arg0, arg5, arg1, var17, arg3 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg4 != 0 && field1119[field1350].method370(arg0, arg6, arg8, arg4, var17, var16, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field1221[var16][var17] + 1;
			if (var16 > 0 && field1289[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1289[var16 - 1][var17] = 2;
				field1221[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1289[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1289[var16 + 1][var17] = 8;
				field1221[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1289[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1289[var16][var17 - 1] = 1;
				field1221[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1289[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1289[var16][var17 + 1] = 4;
				field1221[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1289[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1289[var16 - 1][var17 - 1] = 3;
				field1221[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1289[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1289[var16 + 1][var17 - 1] = 9;
				field1221[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1289[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1289[var16 - 1][var17 + 1] = 6;
				field1221[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1289[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1289[var16 + 1][var17 + 1] = 12;
				field1221[var16 + 1][var17 + 1] = var23;
			}
		}

		field1277 = 0;
		if (!var20) {
			if (arg9) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1221[var26][var27] < var24) {
								var24 = field1221[var26][var27];
								var16 = var26;
								var17 = var27;
								field1277 = 1;
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
		field1148[var28] = var16;
		int var36 = var28 + 1;
		field1149[var28] = var17;
		int var29;
		int var30 = var29 = field1289[var16][var17];
		while (arg2 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1148[var36] = var16;
				field1149[var36++] = var17;
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

			var30 = field1289[var16][var17];
		}

		if (var36 <= 0) {
			if (arg7 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1148[var36];
		int var33 = field1149[var36];

		if (arg7 == 0) {
			field1203.method218(141);
			field1203.method219(var31 + var31 + 3);
		}

		if (arg7 == 1) {
			field1203.method218(196);
			field1203.method219(var31 + var31 + 3 + 14);
		}

		if (arg7 == 2) {
			field1203.method218(70);
			field1203.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1203.method219(1);
		} else {
			field1203.method219(0);
		}

		field1203.method220(field1240 + var32);
		field1203.method220(field1241 + var33);
		field1216 = field1148[0];
		field1217 = field1149[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1203.method219(field1148[var36] - var32);
			field1203.method219(field1149[var36] - var33);
		}

		return true;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method517(boolean arg0) {
		for (int var2 = 0; var2 < field1174; var2++) {
			class26 var3 = field1173[field1175[var2]];
			int var4 = (field1175[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field901 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1361[var5][var6] == field1276) {
							continue;
						}

						field1361[var5][var6] = field1276;
					}

					field1311.method61(var3.field363, var3.field362, var3.field361, var3.field360, var4, (var3.field364 - 1) * 64 + 60, field1350, var3, method532(var3.field360, field1350, var3.field361));
				}
			}
		}
	}

	public final void init() {
		field1307 = Integer.parseInt(getParameter("nodeid"));
		field1308 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method471();
		} else {
			method452();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1309 = false;
		} else {
			field1309 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.u(I)V")
	public final void method518() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1429[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1429[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1430[var10] = (field1429[var10 - 1] + field1429[var10 + 1] + field1429[var10 - 128] + field1429[var10 + 128]) / 4;
			}
		}

		field1278 += 128;
		if (field1278 > field1145.length) {
			field1278 -= field1145.length;
			int var11 = (int) (Math.random() * 12.0D);
			method511(field1062[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1430[var14 + 128] - field1145[field1278 + var14 & field1145.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1429[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1101[var16] = field1101[var16 + 1];
		}

		field1101[var1 - 1] = (int) (Math.sin(field1136 / 14.0D) * 16.0D + Math.sin(field1136 / 15.0D) * 14.0D + Math.sin(field1136 / 16.0D) * 12.0D);

		if (field1450 > 0) {
			field1450 -= 4;
		}

		if (field1451 > 0) {
			field1451 -= 4;
		}

		if (field1450 == 0 && field1451 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1450 = 1024;
			}

			if (var17 == 1) {
				field1451 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method519(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method519(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method479(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field997[var8];
					var6.field60 += arg0;
					while (var6.field60 > var9.method382(var6.field59)) {
						var6.field60 -= var9.method382(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field998) {
							var6.field59 -= var9.field1002;
							if (var6.field59 < 0 || var6.field59 >= var9.field998) {
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

	@ObfuscatedName("client.v(I)V")
	public final void method520() {
		int var1 = 5;
		field1222[8] = 0;
		int var2 = 0;
		while (field1222[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method437("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 297);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field621, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1222[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1222[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1222[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1222[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1222[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1222[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1222[8] == 0) {
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

				field1153 = !field1153;
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method521() {
		while (true) {
			class39 var1 = field1472.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field634 == 0) {
				class31.method124(var1.field636, var1.field635);

				if ((field1472.method277(var1.field635) & 0x62) != 0) {
					field1405 = true;

					if (field1095 != -1) {
						field1246 = true;
					}
				}
			}

			if (var1.field634 == 1 && var1.field636 != null) {
				class7.method45(var1.field636);
			}

			if (var1.field634 == 2 && field1155 == var1.field635 && var1.field636 != null) {
				method524(var1.field636, field1156);
			}

			if (var1.field634 == 3 && field1417 == 1) {
				for (int var2 = 0; var2 < field1074.length; var2++) {
					if (field1339[var2] == var1.field635) {
						field1074[var2] = var1.field636;

						if (var1.field636 == null) {
							field1339[var2] = -1;
						}

						break;
					}

					if (field1340[var2] == var1.field635) {
						field1380[var2] = var1.field636;

						if (var1.field636 == null) {
							field1340[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field634 == 93 && field1472.method276(var1.field635)) {
				class3.method17(new class38(var1.field636), field1472);
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method522() {
		if (field1368 == 2) {
			method498((field1466 - field1240 << 7) + field1469, field1468 * 2, (field1467 - field1241 << 7) + field1470);

			if (field1075 > -1 && field1136 % 20 < 10) {
				field1298[2].method186(field1075 - 12, field1076 - 28);
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method523() {
		int var1 = field1109.method204("Choose Option");
		for (int var2 = 0; var2 < field1294; var2++) {
			int var3 = field1109.method204(field1383[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1294 * 15 + 21;
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

			field1201 = true;
			field1387 = 0;
			field1388 = var5;
			field1389 = var6;
			field1390 = var1;
			field1391 = field1294 * 15 + 22;
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

			field1201 = true;
			field1387 = 1;
			field1388 = var7;
			field1389 = var8;
			field1390 = var1;
			field1391 = field1294 * 15 + 22;
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

			field1201 = true;
			field1387 = 2;
			field1388 = var9;
			field1389 = var10;
			field1390 = var1;
			field1391 = field1294 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method524(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(Lnb;I)V")
	public final void method525(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field640 == 0) {
			var2 = field1311.method76(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 1) {
			var2 = field1311.method77(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 2) {
			var2 = field1311.method78(arg0.field639, arg0.field641, arg0.field642);
		}

		if (arg0.field640 == 3) {
			var2 = field1311.method79(arg0.field639, arg0.field641, arg0.field642);
		}

		if (var2 != 0) {
			int var6 = field1311.method80(arg0.field639, arg0.field641, arg0.field642, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field643 = var3;
		arg0.field645 = var4;
		arg0.field644 = var5;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1363.method248(); var11 != null; var11 = (class40) field1363.method250()) {
			if (var11.field639 == arg7 && var11.field641 == arg8 && var11.field642 == arg1 && var11.field640 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field639 = arg7;
			var10.field640 = arg0;
			var10.field641 = arg8;
			var10.field642 = arg1;
			method525(var10);
			field1363.method245(var10);
		}

		var10.field646 = arg2;
		var10.field648 = arg6;
		var10.field647 = arg3;
		var10.field649 = arg5;
		var10.field650 = arg4;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method527() {
		for (int var1 = -1; var1 < field1083; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1081;
			} else {
				var2 = field1084[var1];
			}

			class27 var3 = field1082[var2];
			if (var3 != null) {
				method442(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method528() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1359[0] != -1) {
				field1405 = true;
				field1247 = 0;
				field1219 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1359[1] != -1) {
				field1405 = true;
				field1247 = 1;
				field1219 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1359[2] != -1) {
				field1405 = true;
				field1247 = 2;
				field1219 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1359[3] != -1) {
				field1405 = true;
				field1247 = 3;
				field1219 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1359[4] != -1) {
				field1405 = true;
				field1247 = 4;
				field1219 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1359[5] != -1) {
				field1405 = true;
				field1247 = 5;
				field1219 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1359[6] != -1) {
				field1405 = true;
				field1247 = 6;
				field1219 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1359[7] != -1) {
				field1405 = true;
				field1247 = 7;
				field1219 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1359[8] != -1) {
				field1405 = true;
				field1247 = 8;
				field1219 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1359[9] != -1) {
				field1405 = true;
				field1247 = 9;
				field1219 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1359[10] != -1) {
				field1405 = true;
				field1247 = 10;
				field1219 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1359[11] != -1) {
				field1405 = true;
				field1247 = 11;
				field1219 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1359[12] != -1) {
				field1405 = true;
				field1247 = 12;
				field1219 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1359[13] != -1) {
				field1405 = true;
				field1247 = 13;
				field1219 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;Ljava/lang/String;II)Lxb;")
	public final class50 method529(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1093[0] != null) {
				var6 = field1093[0].method291(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1147.reset();
			field1147.update(var6);
			int var8 = (int) field1147.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class50(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg3, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method437(arg1 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class38 var16 = new class38(var15);
				var16.field622 = 3;
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
						method13(arg3, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1093[0] != null) {
						field1093[0].method292(arg0, var6.length, var6);
					}
				} catch (Exception var28) {
					field1093[0] = null;
				}

				if (var6 != null) {
					field1147.reset();
					field1147.update(var6);
					int var23 = (int) field1147.getValue();
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
						method13(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg3, var11 + " - Retrying in " + var25);
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

				field1153 = !field1153;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.a(Llb;IZ)V")
	public final void method530(class38 arg0, int arg1) {
		while (arg0.field623 + 10 < arg1 * 8) {
			int var3 = arg0.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1082[var3] == null) {
				field1082[var3] = new class27();
				if (field1087[var3] != null) {
					field1082[var3].method116(field1087[var3]);
				}
			}

			field1084[field1083++] = var3;
			class27 var4 = field1082[var3];
			var4.field405 = field1136;
			int var5 = arg0.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method240(1);
			var4.method110(var7 == 1, field1342.field410[0] + var5, field1342.field411[0] + var6);
			int var8 = arg0.method240(1);
			if (var8 == 1) {
				field1086[field1085++] = var3;
			}
		}

		arg0.method241();
	}

	@ObfuscatedName("client.y(I)V")
	public final void method531() {
		if (field1355 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1426 + field1336 & 0x7FF;
				int var4 = class34.field583[var3];
				int var5 = class34.field584[var3];
				var4 = (field1120 + 256) * var4 >> 8;
				var5 = (field1120 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1342.field360 + var6 >> 7;
				int var9 = field1342.field361 - var7 >> 7;
				boolean var10 = method516(var9, var8, field1342.field410[0], 0, 0, 0, 0, 1, 0, true, field1342.field411[0]);
				if (var10) {
					field1203.method219(var1);
					field1203.method219(var2);
					field1203.method220(field1426);
					field1203.method219(57);
					field1203.method219(field1336);
					field1203.method219(field1120);
					field1203.method219(89);
					field1203.method220(field1342.field360);
					field1203.method220(field1342.field361);
					field1203.method219(field1277);
					field1203.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method532(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field1132[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1386[var6][var4][var5] + field1386[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1386[var6][var4][var5 + 1] + field1386[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method533() {
		field1163 = 0;
		for (int var1 = -1; var1 < field1174 + field1083; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1342;
			} else if (var1 < field1083) {
				var2 = field1082[field1084[var1]];
			} else {
				var2 = field1173[field1175[var1 - field1083]];
			}

			if (var2 != null && var2.method113()) {
				if (var2 instanceof class26) {
					class59 var3 = ((class26) var2).field415;
					if (var3.field906 != null) {
						var3 = var3.method345();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field1083) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field904 >= 0 && var7.field904 < field1298.length) {
						method497(var2.field406 + 15, var2);

						if (field1075 > -1) {
							field1298[var7.field904].method186(field1075 - 12, field1076 - 30);
						}
					}

					if (field1368 == 1 && field1175[var1 - field1083] == field1244 && field1136 % 20 < 10) {
						method497(var2.field406 + 15, var2);

						if (field1075 > -1) {
							field1298[2].method186(field1075 - 12, field1076 - 28);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method497(var2.field406 + 15, var2);

						if (field1075 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1298[var6].method186(field1075 - 12, field1076 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1368 == 10 && field1084[var1] == field1409) {
						method497(var2.field406 + 15, var2);

						if (field1075 > -1) {
							field1298[7].method186(field1075 - 12, field1076 - var4);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1083 || field1126 == 0 || field1126 == 3 || field1126 == 1 && method514(((class27) var2).field416))) {
					method497(var2.field406, var2);

					if (field1075 > -1 && field1163 < field1164) {
						field1168[field1163] = field1109.method205(var2.field372) / 2;
						field1167[field1163] = field1109.field618;
						field1165[field1163] = field1075;
						field1166[field1163] = field1076;
						field1169[field1163] = var2.field374;
						field1170[field1163] = var2.field375;
						field1171[field1163] = var2.field373;
						field1172[field1163++] = var2.field372;

						if (field1420 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1167[field1163] += 10;
							field1166[field1163] += 5;
						}

						if (field1420 == 0 && var2.field375 == 4) {
							field1168[field1163] = 60;
						}

						if (field1420 == 0 && var2.field375 == 5) {
							field1167[field1163] += 5;
						}
					}
				}

				if (var2.field379 > field1136) {
					method497(var2.field406 + 15, var2);

					if (field1075 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(0xFF00, field1076 - 3, 5, field1075 - 15, var8);
						class33.method157(0xFF0000, field1076 - 3, 5, field1075 + var8 - 15, 30 - var8);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1136) {
						method497(var2.field406 / 2, var2);

						if (field1075 > -1) {
							if (var9 == 1) {
								field1076 -= 20;
							}

							if (var9 == 2) {
								field1075 -= 15;
								field1076 -= 10;
							}

							if (var9 == 3) {
								field1075 += 15;
								field1076 -= 10;
							}

							field1134[var2.field377[var9]].method186(field1075 - 12, field1076 - 12);
							field1107.method202(String.valueOf(var2.field376[var9]), 0, field1075, field1076 + 4);
							field1107.method202(String.valueOf(var2.field376[var9]), 0xFFFFFF, field1075 - 1, field1076 + 3);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1163; var10++) {
			int var11 = field1165[var10];
			int var12 = field1166[var10];
			int var13 = field1168[var10];
			int var14 = field1167[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1166[var16] - field1167[var16] && var12 - var14 < field1166[var16] + 2 && var11 - var13 < field1168[var16] + field1165[var16] && var11 + var13 > field1165[var16] - field1168[var16] && field1166[var16] - field1167[var16] < var12) {
						var12 = field1166[var16] - field1167[var16];
						var15 = true;
					}
				}
			}

			field1075 = field1165[var10];
			field1076 = field1166[var10] = var12;
			String var17 = field1172[var10];
			if (field1420 == 0) {
				int var18 = 0xFFFF00;
				if (field1169[var10] < 6) {
					var18 = field1378[field1169[var10]];
				}

				if (field1169[var10] == 6) {
					var18 = field1276 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1169[var10] == 7) {
					var18 = field1276 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1169[var10] == 8) {
					var18 = field1276 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1169[var10] == 9) {
					int var19 = 150 - field1171[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1169[var10] == 10) {
					int var20 = 150 - field1171[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1169[var10] == 11) {
					int var21 = 150 - field1171[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1170[var10] == 0) {
					field1109.method202(var17, 0, field1075, field1076 + 1);
					field1109.method202(var17, var18, field1075, field1076);
				}

				if (field1170[var10] == 1) {
					field1109.method207(var17, field1076 + 1, field1075, field1276, 0);
					field1109.method207(var17, field1076, field1075, field1276, var18);
				}

				if (field1170[var10] == 2) {
					field1109.method208(var17, 0, field1276, field1076 + 1, field1075);
					field1109.method208(var17, var18, field1276, field1076, field1075);
				}

				if (field1170[var10] == 3) {
					field1109.method209(0, field1075, var17, field1076 + 1, field1276, 150 - field1171[var10]);
					field1109.method209(var18, field1075, var17, field1076, field1276, 150 - field1171[var10]);
				}

				if (field1170[var10] == 4) {
					int var22 = field1109.method205(var17);
					int var23 = (150 - field1171[var10]) * (var22 + 100) / 150;
					class33.method154(334, 0, field1075 + 50, field1075 - 50);
					field1109.method206(field1076 + 1, var17, 0, field1075 + 50 - var23);
					field1109.method206(field1076, var17, var18, field1075 + 50 - var23);
					class33.method153();
				}

				if (field1170[var10] == 5) {
					int var24 = 150 - field1171[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(field1076 + 5, field1076 - field1109.field618 - 1, 512, 0);
					field1109.method202(var17, 0, field1075, field1076 + var25 + 1);
					field1109.method202(var17, var18, field1075, field1076 + var25);
					class33.method153();
				}
			} else {
				field1109.method202(var17, 0, field1075, field1076 + 1);
				field1109.method202(var17, 0xFFFF00, field1075, field1076);
			}
		}
	}

	@ObfuscatedName("client.a(IILib;I)V")
	public final void method534(int arg0, int arg1, class35 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1426 + field1336 & 0x7FF;
			int var6 = class31.field551[var5];
			int var7 = class31.field552[var5];
			var6 = var6 * 256 / (field1120 + 256);
			var7 = var7 * 256 / (field1120 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1434.method191(20, 15, 20, 15, 256, var12 + 94 + 4 - 10, var10, 83 - var13 - 20);
		} else {
			method431(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.a(IZLlb;)V")
	public final void method535(int arg0, class38 arg1) {
		int var3 = arg1.method240(8);
		if (var3 < field1083) {
			for (int var4 = var3; var4 < field1083; var4++) {
				field1178[field1177++] = field1084[var4];
			}
		}

		if (var3 > field1083) {
			signlink.reporterror(field1139 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1083 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1084[var5];
			class27 var7 = field1082[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1084[field1083++] = var6;
				var7.field405 = field1136;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1084[field1083++] = var6;
					var7.field405 = field1136;
					field1086[field1085++] = var6;
				} else if (var9 == 1) {
					field1084[field1083++] = var6;
					var7.field405 = field1136;
					int var10 = arg1.method240(3);
					var7.method111(false, var10);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1086[field1085++] = var6;
					}
				} else if (var9 == 2) {
					field1084[field1083++] = var6;
					var7.field405 = field1136;
					int var12 = arg1.method240(3);
					var7.method111(true, var12);
					int var13 = arg1.method240(3);
					var7.method111(true, var13);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1086[field1085++] = var6;
					}
				} else if (var9 == 3) {
					field1178[field1177++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method536(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1311.method80(field1350, arg3, arg2, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1229++;
		if (field1229 > 1086) {
			field1229 = 0;
			field1203.method218(170);
			field1203.method219(0);
			int var9 = field1203.field622;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method220(16791);
			}

			field1203.method219(254);
			field1203.method220((int) (Math.random() * 65536.0D));
			field1203.method220(16128);
			field1203.method220(52610);
			field1203.method220((int) (Math.random() * 65536.0D));
			field1203.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1203.method220(35025);
			}

			field1203.method220(46628);
			field1203.method219((int) (Math.random() * 256.0D));
			field1203.method228(field1203.field622 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var10 = class57.method330(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.field836;
				var12 = var10.field837;
			} else {
				var11 = var10.field837;
				var12 = var10.field836;
			}

			int var13 = var10.field859;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			method516(arg2, arg3, field1342.field410[0], 0, var12, 0, var13, 2, var11, false, field1342.field411[0]);
		} else {
			method516(arg2, arg3, field1342.field410[0], var7 + 1, 0, var8, 0, 2, 0, false, field1342.field411[0]);
		}

		field1331 = field24;
		field1332 = field25;
		field1334 = 2;
		field1333 = 0;
		field1203.method218(arg1);
		field1203.method220(field1240 + arg3);
		field1203.method220(field1241 + arg2);
		field1203.method220(var5);
		return true;
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method537() {
		if (field1417 == 2) {
			for (class40 var1 = (class40) field1363.method248(); var1 != null; var1 = (class40) field1363.method250()) {
				if (var1.field650 > 0) {
					var1.field650--;
				}

				if (var1.field650 != 0) {
					if (var1.field649 > 0) {
						var1.field649--;
					}

					if (var1.field649 == 0 && var1.field641 >= 1 && var1.field642 >= 1 && var1.field641 <= 102 && var1.field642 <= 102 && (var1.field646 < 0 || class3.method30(var1.field648, var1.field646))) {
						method459(var1.field640, var1.field648, var1.field646, var1.field639, var1.field641, var1.field647, var1.field642);
						var1.field649 = -1;

						if (var1.field646 == var1.field643 && var1.field643 == -1) {
							var1.method106();
						} else if (var1.field646 == var1.field643 && var1.field647 == var1.field644 && var1.field648 == var1.field645) {
							var1.method106();
						}
					}
				} else if (var1.field643 < 0 || class3.method30(var1.field645, var1.field643)) {
					method459(var1.field640, var1.field645, var1.field643, var1.field639, var1.field641, var1.field644, var1.field642);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.s(Z)V")
	public final void method538() {
		field1276++;
		method487(true);
		method517(true);
		method487(false);
		method517(false);
		method455();
		method490();

		if (!field1094) {
			int var1 = field1425;
			if (field1457 / 256 > var1) {
				var1 = field1457 / 256;
			}

			if (field1438[4] && field1418[4] + 128 > var1) {
				var1 = field1418[4] + 128;
			}

			int var2 = field1426 + field1364 & 0x7FF;
			method450(method532(field1342.field360, field1350, field1342.field361) - 50, var1 * 3 + 600, var1, var2, field1370, field1369);
		}

		int var3;
		if (field1094) {
			var3 = method545();
		} else {
			var3 = method544();
		}

		int var4 = field1204;
		int var5 = field1205;
		int var6 = field1206;
		int var7 = field1207;
		int var8 = field1208;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1438[var9]) {
				int var10 = (int) (Math.random() * (field1374[var9] * 2 + 1) + Math.sin(field1230[var9] / 100.0D * field1366[var9]) * field1418[var9] - field1374[var9]);
				if (var9 == 0) {
					field1204 += var10;
				}

				if (var9 == 1) {
					field1205 += var10;
				}

				if (var9 == 2) {
					field1206 += var10;
				}

				if (var9 == 3) {
					field1208 = field1208 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1207 += var10;
					if (field1207 < 128) {
						field1207 = 128;
					}

					if (field1207 > 383) {
						field1207 = 383;
					}
				}
			}
		}

		int var11 = class34.field594;
		class31.field546 = true;
		class31.field549 = 0;
		class31.field547 = field17 - 4;
		class31.field548 = field18 - 4;
		class33.method155();
		field1311.method89(field1205, field1207, field1206, field1208, field1204, var3);
		field1311.method64();
		method533();
		method522();
		method552(var11);
		method549();
		field1274.method259(4, 4, field9);
		field1204 = var4;
		field1205 = var5;
		field1206 = var6;
		field1207 = var7;
		field1208 = var8;
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1311.method76(arg3, arg0, arg4);
		if (var6 != 0) {
			int var7 = field1311.method80(arg3, arg0, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field1218.field597;
			int var12 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method330(var13);
			if (var14.field850 == -1) {
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
				class36 var15 = field1291[var14.field850];
				if (var15 != null) {
					int var16 = (var14.field836 * 4 - var15.field606) / 2;
					int var17 = (var14.field837 * 4 - var15.field607) / 2;
					var15.method199(arg0 * 4 + var16 + 48, (104 - arg4 - var14.field837) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1311.method78(arg3, arg0, arg4);
		if (var18 != 0) {
			int var19 = field1311.method80(arg3, arg0, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field850 != -1) {
				class36 var24 = field1291[var23.field850];
				if (var24 != null) {
					int var25 = (var23.field836 * 4 - var24.field606) / 2;
					int var26 = (var23.field837 * 4 - var24.field607) / 2;
					var24.method199(arg0 * 4 + var25 + 48, (104 - arg4 - var23.field837) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1218.field597;
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

		int var30 = field1311.method79(arg3, arg0, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field850 != -1) {
				class36 var33 = field1291[var32.field850];
				if (var33 != null) {
					int var34 = (var32.field836 * 4 - var33.field606) / 2;
					int var35 = (var32.field837 * 4 - var33.field607) / 2;
					var33.method199(arg0 * 4 + var34 + 48, (104 - arg4 - var32.field837) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method540() {
		for (class40 var1 = (class40) field1363.method248(); var1 != null; var1 = (class40) field1363.method250()) {
			if (var1.field650 == -1) {
				var1.field649 = 0;
				method525(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.t(Z)V")
	public final void method541() {
		for (int var1 = 0; var1 < field1445; var1++) {
			if (field1135[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1096[var1] != field1325 || field1432[var1] != field1435) {
						class38 var3 = class55.method319(field1432[var1], field1096[var1]);
						if (System.currentTimeMillis() + var3.field622 / 22 > field1078 / 22 + field1116) {
							field1078 = var3.field622;
							field1116 = System.currentTimeMillis();

							if (method550(var3.field622, var3.field621)) {
								field1325 = field1096[var1];
								field1435 = field1432[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method558()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1135[var1] != -5) {
					field1135[var1] = -5;
				} else {
					field1445--;
					for (int var5 = var1; var5 < field1445; var5++) {
						field1096[var5] = field1096[var5 + 1];
						field1432[var5] = field1432[var5 + 1];
						field1135[var5] = field1135[var5 + 1];
					}

					var1--;
				}
			} else {
				field1135[var1]--;
			}
		}

		if (field1239 > 0) {
			field1239 -= 20;
			if (field1239 < 0) {
				field1239 = 0;
			}

			if (field1239 == 0 && field1104 && !field1310) {
				field1155 = field1079;
				field1156 = true;
				field1472.method279(2, field1155);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;BIIII)V")
	public final void method542(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field63 == 0 && arg1.field78 != null && !arg1.field77 && (arg4 >= arg3 && arg5 >= arg2 && arg4 <= arg1.field66 + arg3 && arg5 <= arg1.field67 + arg2)) {
			int var7 = arg1.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field79[var8] + arg3;
				int var10 = arg1.field80[var8] + arg2 - arg0;
				class4 var11 = class4.field56[arg1.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1431 = var11.field74;
					} else {
						field1431 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method542(var11.field76, var11, var10, var9, arg4, arg5);

					if (var11.field75 > var11.field67) {
						method467(var10, true, var11.field67, var11, arg5, var11.field75, arg4, var11.field66 + var9);
					}
				} else {
					if (var11.field64 == 1 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method489(var11);
						}

						if (!var12) {
							field1383[field1294] = var11.field117;
							field1283[field1294] = 231;
							field1282[field1294] = var11.field61;
							field1294++;
						}
					}

					if (var11.field64 == 2 && field1285 == 0 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1383[field1294] = var13 + " @gre@" + var11.field115;
						field1283[field1294] = 274;
						field1282[field1294] = var11.field61;
						field1294++;
					}

					if (var11.field64 == 3 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1383[field1294] = "Close";
						field1283[field1294] = 737;
						field1282[field1294] = var11.field61;
						field1294++;
					}

					if (var11.field64 == 4 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1383[field1294] = var11.field117;
						field1283[field1294] = 435;
						field1282[field1294] = var11.field61;
						field1294++;
					}

					if (var11.field64 == 5 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1383[field1294] = var11.field117;
						field1283[field1294] = 225;
						field1282[field1294] = var11.field61;
						field1294++;
					}

					if (var11.field64 == 6 && !field1449 && arg4 >= var9 && arg5 >= var10 && arg4 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1383[field1294] = var11.field117;
						field1283[field1294] = 997;
						field1282[field1294] = var11.field61;
						field1294++;
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

								if (arg4 >= var17 && arg5 >= var18 && arg4 < var17 + 32 && arg5 < var18 + 32) {
									field1141 = var14;
									field1142 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1234 == 1 && var11.field84) {
											if (field1236 != var11.field61 || field1235 != var14) {
												field1383[field1294] = "Use " + field1238 + " with @lre@" + var19.field918;
												field1283[field1294] = 398;
												field1284[field1294] = var19.field916;
												field1281[field1294] = var14;
												field1282[field1294] = var11.field61;
												field1294++;
											}
										} else if (field1285 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field933 != null && var19.field933[var20] != null) {
														field1383[field1294] = var19.field933[var20] + " @lre@" + var19.field918;

														if (var20 == 3) {
															field1283[field1294] = 681;
														}

														if (var20 == 4) {
															field1283[field1294] = 100;
														}

														field1284[field1294] = var19.field916;
														field1281[field1294] = var14;
														field1282[field1294] = var11.field61;
														field1294++;
													} else if (var20 == 4) {
														field1383[field1294] = "Drop @lre@" + var19.field918;
														field1283[field1294] = 100;
														field1284[field1294] = var19.field916;
														field1281[field1294] = var14;
														field1282[field1294] = var11.field61;
														field1294++;
													}
												}
											}

											if (var11.field85) {
												field1383[field1294] = "Use @lre@" + var19.field918;
												field1283[field1294] = 102;
												field1284[field1294] = var19.field916;
												field1281[field1294] = var14;
												field1282[field1294] = var11.field61;
												field1294++;
											}

											if (var11.field84 && var19.field933 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field933[var21] != null) {
														field1383[field1294] = var19.field933[var21] + " @lre@" + var19.field918;

														if (var21 == 0) {
															field1283[field1294] = 694;
														}

														if (var21 == 1) {
															field1283[field1294] = 962;
														}

														if (var21 == 2) {
															field1283[field1294] = 795;
														}

														field1284[field1294] = var19.field916;
														field1281[field1294] = var14;
														field1282[field1294] = var11.field61;
														field1294++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1383[field1294] = var11.field92[var22] + " @lre@" + var19.field918;

														if (var22 == 0) {
															field1283[field1294] = 582;
														}

														if (var22 == 1) {
															field1283[field1294] = 113;
														}

														if (var22 == 2) {
															field1283[field1294] = 555;
														}

														if (var22 == 3) {
															field1283[field1294] = 331;
														}

														if (var22 == 4) {
															field1283[field1294] = 354;
														}

														field1284[field1294] = var19.field916;
														field1281[field1294] = var14;
														field1282[field1294] = var11.field61;
														field1294++;
													}
												}
											}

											field1383[field1294] = "Examine @lre@" + var19.field918;
											field1283[field1294] = 1328;
											field1284[field1294] = var19.field916;
											field1281[field1294] = var14;
											field1282[field1294] = var11.field61;
											field1294++;
										} else if ((field1287 & 0x10) == 0x10) {
											field1383[field1294] = field1288 + " @lre@" + var19.field918;
											field1283[field1294] = 563;
											field1284[field1294] = var19.field916;
											field1281[field1294] = var14;
											field1282[field1294] = var11.field61;
											field1294++;
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
	public final void method543() {
		int var1 = field1388;
		int var2 = field1389;
		int var3 = field1390;
		int var4 = field1391;
		int var5 = 0x5D5447;
		class33.method157(var5, var2, var4, var1, var3);
		class33.method157(0, var2 + 1, 16, var1 + 1, var3 - 2);
		class33.method158(0, var3 - 2, var4 - 19, var1 + 1, var2 + 18);
		field1109.method206(var2 + 14, "Choose Option", var5, var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field1387 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1387 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1387 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1294; var8++) {
			int var9 = (field1294 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1109.method210(field1383[var8], var10, var9, true, var1 + 3);
		}
	}

	@ObfuscatedName("client.C(I)I")
	public final int method544() {
		int var1 = 3;
		if (field1207 < 310) {
			int var2 = field1204 >> 7;
			int var3 = field1206 >> 7;
			int var4 = field1342.field360 >> 7;
			int var5 = field1342.field361 >> 7;

			if ((field1132[field1350][var2][var3] & 0x4) != 0) {
				var1 = field1350;
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

					if ((field1132[field1350][var2][var3] & 0x4) != 0) {
						var1 = field1350;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1132[field1350][var2][var3] & 0x4) != 0) {
							var1 = field1350;
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

					if ((field1132[field1350][var2][var3] & 0x4) != 0) {
						var1 = field1350;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1132[field1350][var2][var3] & 0x4) != 0) {
							var1 = field1350;
						}
					}
				}
			}
		}

		if ((field1132[field1350][field1342.field360 >> 7][field1342.field361 >> 7] & 0x4) != 0) {
			var1 = field1350;
		}

		return var1;
	}

	@ObfuscatedName("client.D(I)I")
	public final int method545() {
		int var1 = method532(field1204, field1350, field1206);
		if (var1 - field1205 < 800 && (field1132[field1350][field1204 >> 7][field1206 >> 7] & 0x4) != 0) {
			return field1350;
		}

		return 3;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method546() {
		if (field1271 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1271 = 3;
				field1436 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1329 = "";
				field1330 = "Enter your username & password.";
				field1271 = 2;
				field1436 = 0;
			}
		} else if (field1271 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1436 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1436 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1130 = 0;
				method488(field1139, field1140, false);

				if (field1263) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1271 = 0;
				field1139 = "";
				field1140 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1324.length(); var10++) {
					if (var8 == field1324.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1436 == 0) {
					if (var8 == 8 && field1139.length() > 0) {
						field1139 = field1139.substring(0, field1139.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1436 = 1;
					}

					if (var9) {
						field1139 = field1139 + (char) var8;
					}

					if (field1139.length() > 12) {
						field1139 = field1139.substring(0, 12);
					}
				} else if (field1436 == 1) {
					if (var8 == 8 && field1140.length() > 0) {
						field1140 = field1140.substring(0, field1140.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1436 = 0;
					}

					if (var9) {
						field1140 = field1140 + (char) var8;
					}

					if (field1140.length() > 20) {
						field1140 = field1140.substring(0, 20);
					}
				}
			}
		} else if (field1271 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1271 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method547(int arg0, int arg1) {
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

	@ObfuscatedName("client.k(B)V")
	public final void method548() {
		int var1 = field1223 * 128 + 64;
		int var2 = field1224 * 128 + 64;
		int var3 = method532(var1, field1350, var2) - field1225;

		if (field1204 < var1) {
			field1204 += (var1 - field1204) * field1227 / 1000 + field1226;
			if (field1204 > var1) {
				field1204 = var1;
			}
		}

		if (field1204 > var1) {
			field1204 -= (field1204 - var1) * field1227 / 1000 + field1226;
			if (field1204 < var1) {
				field1204 = var1;
			}
		}

		if (field1205 < var3) {
			field1205 += (var3 - field1205) * field1227 / 1000 + field1226;
			if (field1205 > var3) {
				field1205 = var3;
			}
		}

		if (field1205 > var3) {
			field1205 -= (field1205 - var3) * field1227 / 1000 + field1226;
			if (field1205 < var3) {
				field1205 = var3;
			}
		}

		if (field1206 < var2) {
			field1206 += (var2 - field1206) * field1227 / 1000 + field1226;
			if (field1206 > var2) {
				field1206 = var2;
			}
		}

		if (field1206 > var2) {
			field1206 -= (field1206 - var2) * field1227 / 1000 + field1226;
			if (field1206 < var2) {
				field1206 = var2;
			}
		}

		int var4 = field1209 * 128 + 64;
		int var5 = field1210 * 128 + 64;
		int var6 = method532(var4, field1350, var5) - field1211;
		int var7 = var4 - field1204;
		int var8 = var6 - field1205;
		int var9 = var5 - field1206;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1207 < var11) {
			field1207 += (var11 - field1207) * field1213 / 1000 + field1212;
			if (field1207 > var11) {
				field1207 = var11;
			}
		}

		if (field1207 > var11) {
			field1207 -= (field1207 - var11) * field1213 / 1000 + field1212;
			if (field1207 < var11) {
				field1207 = var11;
			}
		}

		int var13 = var12 - field1208;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1208 += field1213 * var13 / 1000 + field1212;
			field1208 &= 0x7FF;
		}

		if (var13 < 0) {
			field1208 -= -var13 * field1213 / 1000 + field1212;
			field1208 &= 0x7FF;
		}

		int var14 = var12 - field1208;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1208 = var12;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method549() {
		method504();

		if (field1334 == 1) {
			field1063[field1333 / 100].method186(field1331 - 8 - 4, field1332 - 8 - 4);
		}

		if (field1334 == 2) {
			field1063[field1333 / 100 + 4].method186(field1331 - 8 - 4, field1332 - 8 - 4);
			field1158++;
			if (field1158 > 57) {
				field1158 = 0;
				field1203.method218(34);
			}
		}

		if (field1335 != -1) {
			method519(field1300, field1335);
			method515(0, 0, 0, class4.field56[field1335]);
		}

		if (field1412 != -1) {
			method519(field1300, field1412);
			method515(0, 0, 0, class4.field56[field1412]);
		}

		method554();

		if (!field1201) {
			method496();
			method506();
		} else if (field1387 == 0) {
			method543();
		}

		if (field1133 == 1) {
			field1298[1].method186(472, 296);
		}

		if (field1404) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1108.method201(var1, var3, var2, "Fps:" + field5);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1310) {
				int var7 = 0xFF0000;
			}

			field1108.method201(var1, 0xFFFF00, var2, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field1453 != 0) {
			int var8 = field1453 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1108.method206(329, "System update in: " + var9 + ":0" + var8, 0xFFFF00, 4);
			} else {
				field1108.method206(329, "System update in: " + var9 + ":" + var8, 0xFFFF00, 4);
			}
		}
	}

	@ObfuscatedName("client.a(BI[B)Z")
	public final boolean method550(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method551() {
		byte[] var1 = field1456.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1318.method258();
		var2.method184(0, 0);
		field1319.method258();
		var2.method184(-637, 0);
		field1315.method258();
		var2.method184(-128, 0);
		field1316.method258();
		var2.method184(-202, -371);
		field1317.method258();
		var2.method184(-202, -171);
		field1320.method258();
		var2.method184(0, -265);
		field1321.method258();
		var2.method184(-562, -265);
		field1322.method258();
		var2.method184(-128, -171);
		field1323.method258();
		var2.method184(-562, -171);
		int[] var3 = new int[var2.field598];
		for (int var4 = 0; var4 < var2.field599; var4++) {
			for (int var5 = 0; var5 < var2.field598; var5++) {
				var3[var5] = var2.field597[var2.field598 * var4 + var2.field598 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field598; var6++) {
				var2.field597[var2.field598 * var4 + var6] = var3[var6];
			}
		}

		field1318.method258();
		var2.method184(382, 0);
		field1319.method258();
		var2.method184(-255, 0);
		field1315.method258();
		var2.method184(254, 0);
		field1316.method258();
		var2.method184(180, -371);
		field1317.method258();
		var2.method184(180, -171);
		field1320.method258();
		var2.method184(382, -265);
		field1321.method258();
		var2.method184(-180, -265);
		field1322.method258();
		var2.method184(254, -171);
		field1323.method258();
		var2.method184(-180, -171);
		class35 var7 = new class35(field1456, "logo", 0);
		field1315.method258();
		var7.method186(382 - var7.field598 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method552(int arg0) {
		if (!field1310) {
			if (class34.field593[17] >= arg0) {
				class36 var2 = class34.field587[17];
				int var3 = var2.field607 * var2.field606 - 1;
				int var4 = field1300 * var2.field606 * 2;
				byte[] var5 = var2.field604;
				byte[] var6 = field1181;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field604 = var6;
				field1181 = var5;
				class34.method171(17);
			}

			if (class34.field593[24] >= arg0) {
				class36 var8 = class34.field587[24];
				int var9 = var8.field607 * var8.field606 - 1;
				int var10 = field1300 * var8.field606 * 2;
				byte[] var11 = var8.field604;
				byte[] var12 = field1181;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field604 = var12;
				field1181 = var11;
				class34.method171(24);
			}

			if (class34.field593[34] >= arg0) {
				class36 var14 = class34.field587[34];
				int var15 = var14.field607 * var14.field606 - 1;
				int var16 = field1300 * var14.field606 * 2;
				byte[] var17 = var14.field604;
				byte[] var18 = field1181;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field604 = var18;
				field1181 = var17;
				class34.method171(34);
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

	@ObfuscatedName("client.a(JI)V")
	public final void method553(long arg0) {
		if (arg0 != 0L) {
			if (field1408 >= 100) {
				method484("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1408; var4++) {
					if (field1360[var4] == arg0) {
						method484("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1345; var5++) {
					if (field1061[var5] == arg0) {
						method484("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field1360[field1408++] = arg0;
				field1405 = true;
				field1203.method218(158);
				field1203.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.u(Z)V")
	public final void method554() {
		field1314 = 0;
		int var1 = (field1342.field360 >> 7) + field1240;
		int var2 = (field1342.field361 >> 7) + field1241;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1314 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1314 = 1;
		}

		if (field1314 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1314 = 0;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method555() {
		if (field1131 != 0) {
			int var1 = 0;
			if (field1453 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1092[var2] != null) {
					int var3 = field1090[var2];
					String var4 = field1091[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1459 == 0 || field1459 == 1 && method514(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1108.method204("From:  " + var4 + field1092[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1297 >= 1) {
									field1383[field1294] = "Report abuse @whi@" + var4;
									field1283[field1294] = 2524;
									field1294++;
								}

								field1383[field1294] = "Add ignore @whi@" + var4;
								field1283[field1294] = 2047;
								field1294++;
								field1383[field1294] = "Add friend @whi@" + var4;
								field1283[field1294] = 2605;
								field1294++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1459 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Z")
	public final boolean method556(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1283[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.n(B)Z")
	public final boolean method557() {
		if (field1379 == null) {
			return false;
		}

		try {
			int var1 = field1379.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1256 == -1) {
				field1379.method41(field1179.field621, 0, 1);
				field1256 = field1179.field621[0] & 0xFF;
				if (field1073 != null) {
					field1256 = field1256 - field1073.method295() & 0xFF;
				}

				field1255 = class61.field959[field1256];
				var1--;
			}

			if (field1255 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1379.method41(field1179.field621, 0, 1);
				field1255 = field1179.field621[0] & 0xFF;
				var1--;
			}

			if (field1255 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1379.method41(field1179.field621, 0, 2);
				field1179.field622 = 0;
				field1255 = field1179.method231();
				var1 -= 2;
			}

			if (var1 < field1255) {
				return false;
			}

			field1179.field622 = 0;
			field1379.method41(field1179.field621, 0, field1255);
			field1257 = 0;
			field1071 = field1070;
			field1070 = field1069;
			field1069 = field1256;

			if (field1256 == 55) {
				field1368 = field1179.method229();
				if (field1368 == 1) {
					field1244 = field1179.method231();
				}

				if (field1368 >= 2 && field1368 <= 6) {
					if (field1368 == 2) {
						field1469 = 64;
						field1470 = 64;
					}

					if (field1368 == 3) {
						field1469 = 0;
						field1470 = 64;
					}

					if (field1368 == 4) {
						field1469 = 128;
						field1470 = 64;
					}

					if (field1368 == 5) {
						field1469 = 64;
						field1470 = 0;
					}

					if (field1368 == 6) {
						field1469 = 64;
						field1470 = 128;
					}

					field1368 = 2;
					field1466 = field1179.method231();
					field1467 = field1179.method231();
					field1468 = field1179.method229();
				}

				if (field1368 == 10) {
					field1409 = field1179.method231();
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 130) {
				int var2 = field1179.method231();
				int var3 = field1179.method232();
				int var4 = field1179.method232();
				class4 var5 = class4.field56[var2];
				var5.field69 = var3;
				var5.field70 = var4;
				field1256 = -1;
				return true;
			}

			if (field1256 == 118) {
				field1346 = field1179.method229();
				field1405 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 236) {
				int var6 = field1179.method231();
				method510(var6);

				if (field1407 != -1) {
					field1407 = -1;
					field1405 = true;
					field1219 = true;
				}

				if (field1095 != -1) {
					field1095 = -1;
					field1246 = true;
				}

				if (field1313) {
					field1313 = false;
					field1246 = true;
				}

				field1412 = var6;
				field1449 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 38) {
				int var7 = field1179.method231();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (field1079 != var7 && field1104 && !field1310 && field1239 == 0) {
					field1155 = var7;
					field1156 = true;
					field1472.method279(2, field1155);
				}

				field1079 = var7;
				field1256 = -1;
				return true;
			}

			if (field1256 == 183) {
				int var8 = field1179.method231();
				int var9 = field1179.method231();
				if (field1104 && !field1310) {
					field1155 = var8;
					field1156 = false;
					field1472.method279(2, field1155);
					field1239 = var9;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 228) {
				field1453 = field1179.method231() * 30;
				field1256 = -1;
				return true;
			}

			if (field1256 == 131) {
				field1355 = field1179.method229();
				field1256 = -1;
				return true;
			}

			if (field1256 == 241) {
				field1094 = true;
				field1209 = field1179.method229();
				field1210 = field1179.method229();
				field1211 = field1179.method231();
				field1212 = field1179.method229();
				field1213 = field1179.method229();
				if (field1213 >= 100) {
					int var10 = field1209 * 128 + 64;
					int var11 = field1210 * 128 + 64;
					int var12 = method532(var10, field1350, var11) - field1211;
					int var13 = var10 - field1204;
					int var14 = var12 - field1205;
					int var15 = var11 - field1206;
					int var16 = (int) Math.sqrt(var13 * var13 + var15 * var15);
					field1207 = (int) (Math.atan2(var14, var16) * 325.949D) & 0x7FF;
					field1208 = (int) (Math.atan2(var13, var15) * -325.949D) & 0x7FF;

					if (field1207 < 128) {
						field1207 = 128;
					}

					if (field1207 > 383) {
						field1207 = 383;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 224) {
				long var17 = field1179.method235();
				int var19 = field1179.method234();
				int var20 = field1179.method229();
				boolean var21 = false;
				for (int var22 = 0; var22 < 100; var22++) {
					if (field1382[var22] == var19) {
						var21 = true;
						break;
					}
				}

				if (var20 <= 1) {
					for (int var23 = 0; var23 < field1408; var23++) {
						if (field1360[var23] == var17) {
							var21 = true;
							break;
						}
					}
				}

				if (!var21 && field1314 == 0) {
					try {
						field1382[field1375] = var19;
						field1375 = (field1375 + 1) % 100;
						String var24 = class52.method306(field1255 - 13, field1179);
						var24 = class71.method401(var24);
						if (var20 == 2 || var20 == 3) {
							method484("@cr2@" + class51.method304(class51.method301(var17)), var24, 7);
						} else if (var20 == 1) {
							method484("@cr1@" + class51.method304(class51.method301(var17)), var24, 7);
						} else {
							method484(class51.method304(class51.method301(var17)), var24, 3);
						}
					} catch (Exception var166) {
						signlink.reporterror("cde1");
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 51) {
				int var26 = field1179.method231();
				boolean var27 = field1179.method229() == 1;
				class4.field56[var26].field77 = var27;
				field1256 = -1;
				return true;
			}

			if (field1256 == 7) {
				int var28 = field1179.method231();
				int var29 = field1179.method231();
				class4.field56[var28].field105 = 2;
				class4.field56[var28].field106 = var29;
				field1256 = -1;
				return true;
			}

			if (field1256 == 188) {
				field1405 = true;
				int var30 = field1179.method231();
				class4 var31 = class4.field56[var30];
				int var32 = field1179.method231();
				for (int var33 = 0; var33 < var32; var33++) {
					var31.field57[var33] = field1179.method231();
					int var34 = field1179.method229();
					if (var34 == 255) {
						var34 = field1179.method234();
					}

					var31.field58[var33] = var34;
				}

				for (int var35 = var32; var35 < var31.field57.length; var35++) {
					var31.field57[var35] = 0;
					var31.field58[var35] = 0;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 149) {
				long var36 = field1179.method235();
				int var38 = field1179.method229();
				String var39 = class51.method304(class51.method301(var36));
				for (int var40 = 0; var40 < field1345; var40++) {
					if (field1061[var40] == var36) {
						if (field1253[var40] != var38) {
							field1253[var40] = var38;
							field1405 = true;

							if (var38 > 0) {
								method484("", var39 + " has logged in.", 5);
							}

							if (var38 == 0) {
								method484("", var39 + " has logged out.", 5);
							}
						}

						var39 = null;
						break;
					}
				}

				if (var39 != null && field1345 < 200) {
					field1061[field1345] = var36;
					field1341[field1345] = var39;
					field1253[field1345] = var38;
					field1345++;
					field1405 = true;
				}

				boolean var41 = false;
				while (!var41) {
					var41 = true;
					for (int var42 = 0; var42 < field1345 - 1; var42++) {
						if (field1253[var42] != field1307 && field1253[var42 + 1] == field1307 || field1253[var42] == 0 && field1253[var42 + 1] != 0) {
							int var43 = field1253[var42];
							field1253[var42] = field1253[var42 + 1];
							field1253[var42 + 1] = var43;
							String var44 = field1341[var42];
							field1341[var42] = field1341[var42 + 1];
							field1341[var42 + 1] = var44;
							long var45 = field1061[var42];
							field1061[var42] = field1061[var42 + 1];
							field1061[var42 + 1] = var45;
							field1405 = true;
							var41 = false;
						}
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 108) {
				field1446 = field1179.method229();
				field1447 = field1179.method229();

				while (field1179.field622 < field1255) {
					int var47 = field1179.method229();
					method457(var47, field1179);
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 83) {
				field1216 = 0;
				field1256 = -1;
				return true;
			}

			if (field1256 == 44) {
				field1446 = field1179.method229();
				field1447 = field1179.method229();
				for (int var48 = field1446; var48 < field1446 + 8; var48++) {
					for (int var49 = field1447; var49 < field1447 + 8; var49++) {
						if (field1137[field1350][var48][var49] != null) {
							field1137[field1350][var48][var49] = null;
							method470(var48, var49);
						}
					}
				}

				for (class40 var50 = (class40) field1363.method248(); var50 != null; var50 = (class40) field1363.method250()) {
					if (var50.field641 >= field1446 && var50.field641 < field1446 + 8 && var50.field642 >= field1447 && var50.field642 < field1447 + 8 && field1350 == var50.field639) {
						var50.field650 = 0;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 214) {
				int var51 = field1179.method231();
				int var52 = field1179.method231();
				int var53 = var52 >> 10 & 0x1F;
				int var54 = var52 >> 5 & 0x1F;
				int var55 = var52 & 0x1F;
				class4.field56[var51].field99 = (var55 << 3) + (var53 << 19) + (var54 << 11);
				field1256 = -1;
				return true;
			}

			if (field1256 == 9) {
				int var56 = field1179.method232();
				field1162 = var56;
				field1246 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 13) {
				field1405 = true;
				int var57 = field1179.method231();
				class4 var58 = class4.field56[var57];
				while (field1179.field622 < field1255) {
					int var59 = field1179.method243();
					int var60 = field1179.method231();
					int var61 = field1179.method229();
					if (var61 == 255) {
						var61 = field1179.method234();
					}

					if (var59 >= 0 && var59 < var58.field57.length) {
						var58.field57[var59] = var60;
						var58.field58[var59] = var61;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 3) {
				field1247 = field1179.method229();
				field1405 = true;
				field1219 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 85) {
				int var62 = field1179.method231();
				int var63 = field1179.method231();
				class4 var64 = class4.field56[var62];
				if (var64 != null && var64.field63 == 0) {
					if (var63 < 0) {
						var63 = 0;
					}

					if (var63 > var64.field75 - var64.field67) {
						var63 = var64.field75 - var64.field67;
					}

					var64.field76 = var63;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 181) {
				field1422 = field1179.method229();
				if (field1422 == field1247) {
					if (field1422 == 3) {
						field1247 = 1;
					} else {
						field1247 = 3;
					}

					field1405 = true;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 81) {
				int var65 = field1179.method231();
				int var66 = field1179.method231();
				int var67 = field1179.method231();
				int var68 = field1179.method231();
				class4.field56[var65].field112 = var66;
				class4.field56[var65].field113 = var67;
				class4.field56[var65].field111 = var68;
				field1256 = -1;
				return true;
			}

			if (field1256 == 151) {
				field1405 = true;
				int var69 = field1179.method229();
				int var70 = field1179.method234();
				int var71 = field1179.method229();
				field1123[var69] = var70;
				field1471[var69] = var71;
				field1301[var69] = 1;
				for (int var72 = 0; var72 < 98; var72++) {
					if (var70 >= field1290[var72]) {
						field1301[var69] = var72 + 2;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 185) {
				int var73 = field1179.method231();
				int var74 = field1179.method231();
				class4.field56[var73].field105 = 1;
				class4.field56[var73].field106 = var74;
				field1256 = -1;
				return true;
			}

			if (field1256 == 245) {
				int var75 = field1179.method231();
				int var76 = field1179.method231();

				if (field1095 != -1) {
					field1095 = -1;
					field1246 = true;
				}

				if (field1313) {
					field1313 = false;
					field1246 = true;
				}

				field1412 = var75;
				field1407 = var76;
				field1405 = true;
				field1219 = true;
				field1449 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 195) {
				method495(field1179, field1255);
				field1256 = -1;
				return true;
			}

			if (field1256 == 77) {
				int var77 = field1179.method231();
				method510(var77);

				if (field1407 != -1) {
					field1407 = -1;
					field1405 = true;
					field1219 = true;
				}

				field1095 = var77;
				field1246 = true;
				field1412 = -1;
				field1449 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 238) {
				String var78 = field1179.method236();
				if (var78.endsWith(":tradereq:")) {
					String var79 = var78.substring(0, var78.indexOf(":"));
					long var80 = class51.method300(var79);
					boolean var82 = false;
					for (int var83 = 0; var83 < field1408; var83++) {
						if (field1360[var83] == var80) {
							var82 = true;
							break;
						}
					}

					if (!var82 && field1314 == 0) {
						method484(var79, "wishes to trade with you.", 4);
					}
				} else if (var78.endsWith(":duelreq:")) {
					String var84 = var78.substring(0, var78.indexOf(":"));
					long var85 = class51.method300(var84);
					boolean var87 = false;
					for (int var88 = 0; var88 < field1408; var88++) {
						if (field1360[var88] == var85) {
							var87 = true;
							break;
						}
					}

					if (!var87 && field1314 == 0) {
						method484(var84, "wishes to duel with you.", 8);
					}
				} else if (var78.endsWith(":chalreq:")) {
					String var89 = var78.substring(0, var78.indexOf(":"));
					long var90 = class51.method300(var89);
					boolean var92 = false;
					for (int var93 = 0; var93 < field1408; var93++) {
						if (field1360[var93] == var90) {
							var92 = true;
							break;
						}
					}

					if (!var92 && field1314 == 0) {
						String var94 = var78.substring(var78.indexOf(":") + 1, var78.length() - 9);
						method484(var89, var94, 8);
					}
				} else {
					method484("", var78, 0);
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 33) {
				field1433 = field1179.method231();
				field1348 = field1179.method229();
				field1256 = -1;
				return true;
			}

			if (field1256 == 75) {
				method503();
				field1256 = -1;
				return false;
			}

			if (field1256 == 153) {
				int var95 = field1179.method231();
				int var96 = field1179.method231();
				int var97 = field1179.method231();

				if (var96 == 0xFFFF) {
					class4.field56[var95].field105 = 0;
					field1256 = -1;
					return true;
				}

				class60 var98 = class60.method348(var96);
				class4.field56[var95].field105 = 4;
				class4.field56[var95].field106 = var96;
				class4.field56[var95].field112 = var98.field923;
				class4.field56[var95].field113 = var98.field924;
				class4.field56[var95].field111 = var98.field922 * 100 / var97;
				field1256 = -1;
				return true;
			}

			if (field1256 == 105) {
				field1408 = field1255 / 8;
				for (int var99 = 0; var99 < field1408; var99++) {
					field1360[var99] = field1179.method235();
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 111) {
				for (int var100 = 0; var100 < field1082.length; var100++) {
					if (field1082[var100] != null) {
						field1082[var100].field388 = -1;
					}
				}

				for (int var101 = 0; var101 < field1173.length; var101++) {
					if (field1173[var101] != null) {
						field1173[var101].field388 = -1;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 222 || field1256 == 253 || field1256 == 191 || field1256 == 137 || field1256 == 193 || field1256 == 30 || field1256 == 53 || field1256 == 147 || field1256 == 2 || field1256 == 211 || field1256 == 136) {
				method457(field1256, field1179);
				field1256 = -1;
				return true;
			}

			if (field1256 == 98) {
				int var102 = field1179.method229();
				int var103 = field1179.method229();
				String var104 = field1179.method236();
				if (var102 >= 1 && var102 <= 5) {
					if (var104.equalsIgnoreCase("null")) {
						var104 = null;
					}

					field1102[var102 - 1] = var104;
					field1103[var102 - 1] = var103 == 0;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 22) {
				field1446 = field1179.method229();
				field1447 = field1179.method229();
				field1256 = -1;
				return true;
			}

			if (field1256 == 145) {
				int var105 = field1179.method231();
				int var106 = field1179.method234();
				field1393[var105] = var106;

				if (field1394[var105] != var106) {
					field1394[var105] = var106;
					method465(var105);
					field1405 = true;

					if (field1162 != -1) {
						field1246 = true;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 186) {
				int var107 = field1179.method231();
				int var108 = field1179.method232();
				class4 var109 = class4.field56[var107];
				var109.field109 = var108;

				if (var108 == -1) {
					var109.field59 = 0;
					var109.field60 = 0;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 156) {
				if (field1247 == 12) {
					field1405 = true;
				}

				field1448 = field1179.method232();
				field1256 = -1;
				return true;
			}

			if (field1256 == 92) {
				int var110 = field1179.method229();
				int var111 = field1179.method229();
				int var112 = field1179.method229();
				int var113 = field1179.method229();
				field1438[var110] = true;
				field1374[var110] = var111;
				field1418[var110] = var112;
				field1230[var110] = var113;
				field1366[var110] = 0;
				field1256 = -1;
				return true;
			}

			if (field1256 == 212) {
				if (field1407 != -1) {
					field1407 = -1;
					field1405 = true;
					field1219 = true;
				}

				if (field1095 != -1) {
					field1095 = -1;
					field1246 = true;
				}

				if (field1313) {
					field1313 = false;
					field1246 = true;
				}

				field1412 = -1;
				field1449 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 206) {
				field1126 = field1179.method229();
				field1459 = field1179.method229();
				field1397 = field1179.method229();
				field1254 = true;
				field1246 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 170) {
				int var114 = field1179.method231();
				int var115 = field1179.method231();
				if (field1454 == var114 && field1455 == var115 && field1417 == 2) {
					field1256 = -1;
					return true;
				}

				field1454 = var114;
				field1455 = var115;
				field1240 = (field1454 - 6) * 8;
				field1241 = (field1455 - 6) * 8;
				field1347 = false;
				if ((field1454 / 8 == 48 || field1454 / 8 == 49) && field1455 / 8 == 48) {
					field1347 = true;
				}

				if (field1454 / 8 == 48 && field1455 / 8 == 148) {
					field1347 = true;
				}

				field1417 = 1;
				field1373 = System.currentTimeMillis();
				field1274.method258();
				field1108.method202("Loading - please wait.", 0, 257, 151);
				field1108.method202("Loading - please wait.", 0xFFFFFF, 256, 150);
				field1274.method259(4, 4, field9);
				int var116 = 0;
				for (int var117 = (field1454 - 6) / 8; var117 <= (field1454 + 6) / 8; var117++) {
					for (int var118 = (field1455 - 6) / 8; var118 <= (field1455 + 6) / 8; var118++) {
						var116++;
					}
				}

				field1074 = new byte[var116][];
				field1380 = new byte[var116][];
				field1338 = new int[var116];
				field1339 = new int[var116];
				field1340 = new int[var116];
				int var119 = 0;
				for (int var120 = (field1454 - 6) / 8; var120 <= (field1454 + 6) / 8; var120++) {
					for (int var121 = (field1455 - 6) / 8; var121 <= (field1455 + 6) / 8; var121++) {
						field1338[var119] = (var120 << 8) + var121;

						if (field1347 && (var121 == 49 || var121 == 149 || var121 == 147 || var120 == 50 || var120 == 49 && var121 == 47)) {
							field1339[var119] = -1;
							field1340[var119] = -1;
							var119++;
						} else {
							int var122 = field1339[var119] = field1472.method274(var121, var120, 0);
							if (var122 != -1) {
								field1472.method279(3, var122);
							}

							int var123 = field1340[var119] = field1472.method274(var121, var120, 1);
							if (var123 != -1) {
								field1472.method279(3, var123);
							}

							var119++;
						}
					}
				}

				int var124 = field1240 - field1242;
				int var125 = field1241 - field1243;
				field1242 = field1240;
				field1243 = field1241;

				for (int var126 = 0; var126 < 16384; var126++) {
					class26 var127 = field1173[var126];
					if (var127 != null) {
						for (int var128 = 0; var128 < 10; var128++) {
							var127.field410[var128] -= var124;
							var127.field411[var128] -= var125;
						}

						var127.field360 -= var124 * 128;
						var127.field361 -= var125 * 128;
					}
				}

				for (int var129 = 0; var129 < field1080; var129++) {
					class27 var130 = field1082[var129];
					if (var130 != null) {
						for (int var131 = 0; var131 < 10; var131++) {
							var130.field410[var131] -= var124;
							var130.field411[var131] -= var125;
						}

						var130.field360 -= var124 * 128;
						var130.field361 -= var125 * 128;
					}
				}

				field1117 = true;
				byte var132 = 0;
				byte var133 = 104;
				byte var134 = 1;
				if (var124 < 0) {
					var132 = 103;
					var133 = -1;
					var134 = -1;
				}

				byte var135 = 0;
				byte var136 = 104;
				byte var137 = 1;
				if (var125 < 0) {
					var135 = 103;
					var136 = -1;
					var137 = -1;
				}

				for (int var138 = var132; var138 != var133; var138 += var134) {
					for (int var139 = var135; var139 != var136; var139 += var137) {
						int var140 = var124 + var138;
						int var141 = var125 + var139;
						for (int var142 = 0; var142 < 4; var142++) {
							if (var140 >= 0 && var141 >= 0 && var140 < 104 && var141 < 104) {
								field1137[var142][var138][var139] = field1137[var142][var140][var141];
							} else {
								field1137[var142][var138][var139] = null;
							}
						}
					}
				}

				for (class40 var143 = (class40) field1363.method248(); var143 != null; var143 = (class40) field1363.method250()) {
					var143.field641 -= var124;
					var143.field642 -= var125;
					if (var143.field641 < 0 || var143.field642 < 0 || var143.field641 >= 104 || var143.field642 >= 104) {
						var143.method106();
					}
				}

				if (field1216 != 0) {
					field1216 -= var124;
					field1217 -= var125;
				}

				field1094 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 141) {
				int var144 = field1179.method231();
				int var145 = field1179.method229();

				if (var144 == 0xFFFF) {
					var144 = -1;
				}

				field1359[var145] = var144;
				field1405 = true;
				field1219 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 226) {
				for (int var146 = 0; var146 < field1394.length; var146++) {
					if (field1394[var146] != field1393[var146]) {
						field1394[var146] = field1393[var146];
						method465(var146);
						field1405 = true;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 138) {
				field1094 = false;

				for (int var147 = 0; var147 < 5; var147++) {
					field1438[var147] = false;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 196) {
				method434(field1179, field1255);
				field1117 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 62) {
				field1293 = false;
				field1313 = true;
				field1202 = "";
				field1246 = true;
				field1256 = -1;
				return true;
			}

			if (field1256 == 246) {
				int var148 = field1179.method232();
				if (var148 >= 0) {
					method510(var148);
				}

				field1335 = var148;
				field1256 = -1;
				return true;
			}

			if (field1256 == 19) {
				field1133 = field1179.method229();
				field1256 = -1;
				return true;
			}

			if (field1256 == 204) {
				int var149 = field1179.method231();
				class4 var150 = class4.field56[var149];
				for (int var151 = 0; var151 < var150.field57.length; var151++) {
					var150.field57[var151] = -1;
					var150.field57[var151] = 0;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 94) {
				int var152 = field1179.method231();
				class4.field56[var152].field105 = 3;

				if (field1342.field438 == null) {
					class4.field56[var152].field106 = (field1342.field420[11] << 5) + (field1342.field420[8] << 10) + (field1342.field420[0] << 15) + (field1342.field421[0] << 25) + (field1342.field421[4] << 20) + field1342.field420[1];
				} else {
					class4.field56[var152].field106 = (int) (field1342.field438.field880 + 0x12345678L);
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 213) {
				int var153 = field1179.method231();
				byte var154 = field1179.method230();
				field1393[var153] = var154;

				if (field1394[var153] != var154) {
					field1394[var153] = var154;
					method465(var153);
					field1405 = true;

					if (field1162 != -1) {
						field1246 = true;
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 119) {
				field1245 = field1179.method234();
				field1280 = field1179.method231();
				field1200 = field1179.method229();
				field1396 = field1179.method231();
				field1269 = field1179.method229();
				if (field1245 != 0 && field1412 == -1) {
					signlink.dnslookup(class51.method303(field1245));
					method432();
					short var155 = 650;
					if (field1200 != 201 || field1269 == 1) {
						var155 = 655;
					}

					field1128 = "";
					field1452 = false;

					for (int var156 = 0; var156 < class4.field56.length; var156++) {
						if (class4.field56[var156] != null && class4.field56[var156].field65 == var155) {
							field1412 = class4.field56[var156].field62;
							break;
						}
					}
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 27) {
				if (field1247 == 12) {
					field1405 = true;
				}

				field1180 = field1179.method229();
				field1256 = -1;
				return true;
			}

			if (field1256 == 237) {
				int var157 = field1179.method231();
				method510(var157);

				if (field1095 != -1) {
					field1095 = -1;
					field1246 = true;
				}

				if (field1313) {
					field1313 = false;
					field1246 = true;
				}

				field1407 = var157;
				field1405 = true;
				field1219 = true;
				field1412 = -1;
				field1449 = false;
				field1256 = -1;
				return true;
			}

			if (field1256 == 45) {
				int var158 = field1179.method231();
				int var159 = field1179.method229();
				int var160 = field1179.method231();
				if (field1362 && !field1310 && field1445 < 50) {
					field1096[field1445] = var158;
					field1432[field1445] = var159;
					field1135[field1445] = class55.field791[var158] + var160;
					field1445++;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 115) {
				field1094 = true;
				field1223 = field1179.method229();
				field1224 = field1179.method229();
				field1225 = field1179.method231();
				field1226 = field1179.method229();
				field1227 = field1179.method229();
				if (field1227 >= 100) {
					field1204 = field1223 * 128 + 64;
					field1206 = field1224 * 128 + 64;
					field1205 = method532(field1204, field1350, field1206) - field1225;
				}

				field1256 = -1;
				return true;
			}

			if (field1256 == 169) {
				int var161 = field1179.method231();
				String var162 = field1179.method236();
				class4.field56[var161].field97 = var162;

				if (field1359[field1247] == class4.field56[var161].field62) {
					field1405 = true;
				}

				field1256 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1256 + "," + field1255 + " - " + field1070 + "," + field1071);
			method503();
		} catch (IOException var167) {
			method435();
		} catch (Exception var168) {
			String var164 = "T2 - " + field1256 + "," + field1070 + "," + field1071 + " - " + field1255 + "," + (field1342.field410[0] + field1240) + "," + (field1342.field411[0] + field1241) + " - ";
			for (int var165 = 0; var165 < field1255 && var165 < 50; var165++) {
				var164 = var164 + field1179.field621[var165] + ",";
			}

			signlink.reporterror(var164);
			method503();
		}

		return true;
	}

	@ObfuscatedName("client.F(I)Z")
	public final boolean method558() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1424 && !field1473 && !field1411) {
			field1136++;

			if (field1263) {
				method436();
			} else {
				method546();
			}

			method521();
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1124) {
			field1424 = true;
		} else {
			field1124 = true;
			boolean var1 = false;
			String var2 = method461();
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
						field1093[var3] = new class48(signlink.cache_idx[var3], signlink.cache_dat, 500000, var3 + 1);
					}
				}

				try {
					method520();
					field1456 = method529(1, "title", "title screen", 25, field1222[1]);
					field1107 = new class37(false, "p11_full", field1456);
					field1108 = new class37(false, "p12_full", field1456);
					field1109 = new class37(false, "b12_full", field1456);
					field1110 = new class37(true, "q8_full", field1456);
					method551();
					method449();
					class50 var4 = method529(2, "config", "config", 30, field1222[2]);
					class50 var5 = method529(3, "interface", "interface", 35, field1222[3]);
					class50 var6 = method529(4, "media", "2d graphics", 40, field1222[4]);
					class50 var7 = method529(6, "textures", "textures", 45, field1222[6]);
					class50 var8 = method529(7, "wordenc", "chat system", 50, field1222[7]);
					class50 var9 = method529(8, "sounds", "sound effects", 55, field1222[8]);
					field1132 = new byte[4][104][104];
					field1386 = new int[4][105][105];
					field1311 = new class18(field1386, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1119[var10] = new class62(104, 104);
					}

					field1218 = new class35(512, 512);
					class50 var11 = method529(5, "versionlist", "update list", 60, field1222[5]);
					method13(60, "Connecting to update server");
					field1472 = new class47();
					field1472.method270(var11, this);
					class7.method44(field1472.method273());
					class31.method123(field1472.method272(0), field1472);

					if (!field1310) {
						field1155 = 0;
						try {
							field1155 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1156 = true;
						field1472.method279(2, field1155);

						while (field1472.method280() > 0) {
							method521();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1472.field739 > 3) {
								method485("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1472.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1472.method279(1, var13);
					}

					while (field1472.method280() > 0) {
						int var14 = var12 - field1472.method280();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method521();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1472.field739 > 3) {
							method485("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1472.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1472.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1472.method279(0, var16);
						}
					}

					int var18 = field1472.method280();
					while (field1472.method280() > 0) {
						int var19 = var18 - field1472.method280();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method521();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1093[0] != null) {
						method13(75, "Requesting maps");
						field1472.method279(3, field1472.method274(48, 47, 0));
						field1472.method279(3, field1472.method274(48, 47, 1));
						field1472.method279(3, field1472.method274(48, 48, 0));
						field1472.method279(3, field1472.method274(48, 48, 1));
						field1472.method279(3, field1472.method274(48, 49, 0));
						field1472.method279(3, field1472.method274(48, 49, 1));
						field1472.method279(3, field1472.method274(47, 47, 0));
						field1472.method279(3, field1472.method274(47, 47, 1));
						field1472.method279(3, field1472.method274(47, 48, 0));
						field1472.method279(3, field1472.method274(47, 48, 1));
						field1472.method279(3, field1472.method274(148, 48, 0));
						field1472.method279(3, field1472.method274(148, 48, 1));
						int var20 = field1472.method280();
						while (field1472.method280() > 0) {
							int var21 = var20 - field1472.method280();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method521();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1472.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1472.method277(var23);
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
							field1472.method282(var23, var25, 0);
						}
					}

					field1472.method275(field1309);

					if (!field1310) {
						int var26 = field1472.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1472.method278(var27)) {
								field1472.method282(var27, (byte) 1, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1260 = new class36(var6, "invback", 0);
					field1262 = new class36(var6, "chatback", 0);
					field1261 = new class36(var6, "mapback", 0);
					field1474 = new class36(var6, "backbase1", 0);
					field1475 = new class36(var6, "backbase2", 0);
					field1476 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1384[var28] = new class36(var6, "sideicons", var28);
					}

					field1312 = new class35(var6, "compass", 0);
					field1434 = new class35(var6, "mapedge", 0);
					field1434.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1291[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1072[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1134[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1298[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1112 = new class35(var6, "mapmarker", 0);
					field1113 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1063[var33] = new class35(var6, "cross", var33);
					}

					field1479 = new class35(var6, "mapdots", 0);
					field1480 = new class35(var6, "mapdots", 1);
					field1481 = new class35(var6, "mapdots", 2);
					field1482 = new class35(var6, "mapdots", 3);
					field1351 = new class36(var6, "scrollbar", 0);
					field1352 = new class36(var6, "scrollbar", 1);
					field1182 = new class36(var6, "redstone1", 0);
					field1183 = new class36(var6, "redstone2", 0);
					field1184 = new class36(var6, "redstone3", 0);
					field1185 = new class36(var6, "redstone1", 0);
					field1185.method196();
					field1186 = new class36(var6, "redstone2", 0);
					field1186.method196();
					field1264 = new class36(var6, "redstone1", 0);
					field1264.method197();
					field1265 = new class36(var6, "redstone2", 0);
					field1265.method197();
					field1266 = new class36(var6, "redstone3", 0);
					field1266.method197();
					field1267 = new class36(var6, "redstone1", 0);
					field1267.method196();
					field1267.method197();
					field1268 = new class36(var6, "redstone2", 0);
					field1268.method196();
					field1268.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1220[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1187 = new class43(var35.field598, method11(), var35.field599);
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1188 = new class43(var36.field598, method11(), var36.field599);
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1189 = new class43(var37.field598, method11(), var37.field599);
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1190 = new class43(var38.field598, method11(), var38.field599);
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1191 = new class43(var39.field598, method11(), var39.field599);
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1192 = new class43(var40.field598, method11(), var40.field599);
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1193 = new class43(var41.field598, method11(), var41.field599);
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1194 = new class43(var42.field598, method11(), var42.field599);
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1195 = new class43(var43.field598, method11(), var43.field599);
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1072[var48] != null) {
							field1072[var48].method182(var44 + var47, var45 + var47, var46 + var47);
						}

						if (field1291[var48] != null) {
							field1291[var48].method198(var44 + var47, var45 + var47, var46 + var47);
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
					class60.field915 = field1309;

					if (!field1310) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1107, field1108, field1109, field1110 };
					class4.method32(var6, var5, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1261.field604[field1261.field606 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1437[var52] = var53;
						field1228[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1261.field604[field1261.field606 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1465[var56 - 5] = var57 - 25;
						field1392[var56 - 5] = var58 - var57;
					}

					class34.method166(96, 479);
					field1326 = class34.field585;
					class34.method166(261, 190);
					field1327 = class34.field585;
					class34.method166(334, 512);
					field1328 = class34.field585;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field583[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(500, var60, 334, 800, 512);
					class71.method391(var8);
					field1198 = new class58(this);
					method12(field1198, 10);
					class28.field441 = this;
					class57.field822 = this;
					class59.field874 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1160 + " " + field1100);
					field1473 = true;
				}
			} else {
				field1411 = true;
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public static final String method559(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.v(Z)V")
	public final void method560() {
		if (field1304 == 0) {
			int var1 = field23;
			if (field1285 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1201) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1387 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1387 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1387 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1388 - 10 || var2 > field1390 + field1388 + 10 || var3 < field1389 - 10 || var3 > field1391 + field1389 + 10) {
						field1201 = false;

						if (field1387 == 1) {
							field1405 = true;
						}

						if (field1387 == 2) {
							field1246 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1388;
					int var5 = field1389;
					int var6 = field1390;
					int var7 = field24;
					int var8 = field25;
					if (field1387 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1387 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1387 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1294; var10++) {
						int var11 = (field1294 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method429(var9);
					}

					field1201 = false;

					if (field1387 == 1) {
						field1405 = true;
					}

					if (field1387 == 2) {
						field1246 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1294 > 0) {
					int var12 = field1283[field1294 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1281[field1294 - 1];
						int var14 = field1282[field1294 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1150 = false;
							field1403 = 0;
							field1302 = var14;
							field1303 = var13;
							field1304 = 2;
							field1305 = field24;
							field1306 = field25;

							if (class4.field56[var14].field62 == field1412) {
								field1304 = 1;
							}

							if (class4.field56[var14].field62 == field1095) {
								field1304 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1143 == 1 || method556(field1294 - 1)) && field1294 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1294 > 0) {
					method429(field1294 - 1);
				}

				if (var1 != 2 || field1294 <= 0) {
					return;
				}

				method523();
			}
		}
	}

	@ObfuscatedName("client.d(ILlb;I)V")
	public final void method561(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(1);
		if (var3 != 0) {
			int var4 = arg1.method240(2);
			if (var4 == 0) {
				field1086[field1085++] = field1081;
			} else if (var4 == 1) {
				int var5 = arg1.method240(3);
				field1342.method111(false, var5);
				int var6 = arg1.method240(1);
				if (var6 == 1) {
					field1086[field1085++] = field1081;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method240(3);
				field1342.method111(true, var7);
				int var8 = arg1.method240(3);
				field1342.method111(true, var8);
				int var9 = arg1.method240(1);
				if (var9 == 1) {
					field1086[field1085++] = field1081;
				}
			} else if (var4 == 3) {
				field1350 = arg1.method240(2);
				int var10 = arg1.method240(7);
				int var11 = arg1.method240(7);
				int var12 = arg1.method240(1);
				field1342.method110(var12 == 1, var10, var11);
				int var13 = arg1.method240(1);
				if (var13 == 1) {
					field1086[field1085++] = field1081;
				}
			}
		}
	}

	public final void run() {
		if (field1395) {
			method512();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method562() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1290[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1464[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
