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
	public boolean field1077 = false;

	@ObfuscatedName("client.cb")
	public class18 field1078;

	@ObfuscatedName("client.db")
	public int[] field1079 = new int[151];

	@ObfuscatedName("client.eb")
	public int field1080;

	@ObfuscatedName("client.fb")
	public int field1081;

	@ObfuscatedName("client.gb")
	public int field1082 = -1;

	@ObfuscatedName("client.hb")
	public boolean field1083 = true;

	@ObfuscatedName("client.jb")
	public static int field1084;

	@ObfuscatedName("client.kb")
	public class35 field1085;

	@ObfuscatedName("client.lb")
	public class35 field1086;

	@ObfuscatedName("client.mb")
	public int field1087;

	@ObfuscatedName("client.nb")
	public class36 field1088;

	@ObfuscatedName("client.ob")
	public class36 field1089;

	@ObfuscatedName("client.pb")
	public boolean field1090 = false;

	@ObfuscatedName("client.qb")
	public class41 field1091 = new class41();

	@ObfuscatedName("client.rb")
	public int field1092;

	@ObfuscatedName("client.tb")
	public int field1093;

	@ObfuscatedName("client.ub")
	public int field1094 = 1;

	@ObfuscatedName("client.vb")
	public String field1095 = "";

	@ObfuscatedName("client.wb")
	public int field1096;

	@ObfuscatedName("client.xb")
	public int field1097;

	@ObfuscatedName("client.yb")
	public int field1098;

	@ObfuscatedName("client.zb")
	public int field1099;

	@ObfuscatedName("client.ac")
	public int field1125 = 2048;

	@ObfuscatedName("client.bc")
	public int field1126 = 2047;

	@ObfuscatedName("client.cc")
	public class27[] field1127 = new class27[field1125];

	@ObfuscatedName("client.dc")
	public int field1128;

	@ObfuscatedName("client.ec")
	public int[] field1129 = new int[field1125];

	@ObfuscatedName("client.fc")
	public int field1130;

	@ObfuscatedName("client.gc")
	public int[] field1131 = new int[field1125];

	@ObfuscatedName("client.hc")
	public class38[] field1132 = new class38[field1125];

	@ObfuscatedName("client.ic")
	public int[] field1133 = new int[33];

	@ObfuscatedName("client.kc")
	public int[] field1134;

	@ObfuscatedName("client.lc")
	public int[] field1135;

	@ObfuscatedName("client.mc")
	public int[] field1136;

	@ObfuscatedName("client.oc")
	public int[][] field1137 = new int[104][104];

	@ObfuscatedName("client.pc")
	public int field1138;

	@ObfuscatedName("client.qc")
	public int field1139;

	@ObfuscatedName("client.rc")
	public int field1140;

	@ObfuscatedName("client.sc")
	public class35[] field1141 = new class35[100];

	@ObfuscatedName("client.K")
	public String field1061 = "";

	@ObfuscatedName("client.Y")
	public int[] field1075 = new int[2000];

	@ObfuscatedName("client.Z")
	public boolean field1076 = true;

	@ObfuscatedName("client.Ab")
	public int field1100 = -1;

	@ObfuscatedName("client.Jb")
	public boolean field1109 = false;

	@ObfuscatedName("client.Kb")
	public class38 field1110 = class38.method217(1);

	@ObfuscatedName("client.Nb")
	public int[] field1112 = new int[50];

	@ObfuscatedName("client.Ob")
	public boolean field1113 = false;

	@ObfuscatedName("client.Pb")
	public String field1114 = "";

	@ObfuscatedName("client.Qb")
	public String field1115 = "";

	@ObfuscatedName("client.Rb")
	public int[] field1116 = new int[5];

	@ObfuscatedName("client.Yb")
	public boolean field1123 = false;

	@ObfuscatedName("client.vc")
	public int field1143 = 2;

	@ObfuscatedName("client.wc")
	public int field1144 = -1;

	@ObfuscatedName("client.xc")
	public int[] field1145 = new int[2000];

	@ObfuscatedName("client.yc")
	public int field1146 = -1;

	@ObfuscatedName("client.zc")
	public int[] field1147 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ec")
	public int field1151 = -1;

	@ObfuscatedName("client.Fc")
	public int field1152 = -1;

	@ObfuscatedName("client.Hc")
	public int[] field1154 = new int[1000];

	@ObfuscatedName("client.Kc")
	public int field1156 = -1;

	@ObfuscatedName("client.Lc")
	public class38 field1157 = class38.method217(1);

	@ObfuscatedName("client.Rc")
	public int field1163 = -1;

	@ObfuscatedName("client.Uc")
	public boolean field1165 = false;

	@ObfuscatedName("client.Vc")
	public CRC32 field1166 = new CRC32();

	@ObfuscatedName("client.Wc")
	public int[] field1167 = new int[100];

	@ObfuscatedName("client.Xc")
	public String[] field1168 = new String[100];

	@ObfuscatedName("client.Yc")
	public String[] field1169 = new String[100];

	@ObfuscatedName("client.bd")
	public String field1172 = "";

	@ObfuscatedName("client.ed")
	public int field1174 = 128;

	@ObfuscatedName("client.kd")
	public int field1179 = 2;

	@ObfuscatedName("client.ld")
	public int[] field1180 = new int[256];

	@ObfuscatedName("client.sd")
	public int[] field1186 = new int[50];

	@ObfuscatedName("client.wd")
	public boolean field1190 = false;

	@ObfuscatedName("client.Ad")
	public String[] field1194 = new String[200];

	@ObfuscatedName("client.Kd")
	public class36[] field1202 = new class36[13];

	@ObfuscatedName("client.Nd")
	public boolean field1205 = false;

	@ObfuscatedName("client.Od")
	public boolean field1206 = false;

	@ObfuscatedName("client.Rd")
	public int[] field1209 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Sd")
	public int[] field1210 = new int[500];

	@ObfuscatedName("client.Td")
	public int[] field1211 = new int[500];

	@ObfuscatedName("client.Ud")
	public int[] field1212 = new int[500];

	@ObfuscatedName("client.Vd")
	public int[] field1213 = new int[500];

	@ObfuscatedName("client.Xd")
	public class38 field1215 = class38.method217(1);

	@ObfuscatedName("client.ke")
	public boolean field1227 = false;

	@ObfuscatedName("client.me")
	public int field1229 = -1;

	@ObfuscatedName("client.ne")
	public byte[] field1230 = new byte[16384];

	@ObfuscatedName("client.pe")
	public boolean field1231 = false;

	@ObfuscatedName("client.se")
	public final int field1232 = 100;

	@ObfuscatedName("client.te")
	public int[] field1233 = new int[100];

	@ObfuscatedName("client.xe")
	public String field1237 = "";

	@ObfuscatedName("client.Ge")
	public int[] field1245 = new int[9];

	@ObfuscatedName("client.Ie")
	public boolean field1246 = false;

	@ObfuscatedName("client.Qe")
	public int field1254 = -1;

	@ObfuscatedName("client.Ue")
	public long[] field1257 = new long[100];

	@ObfuscatedName("client.Ye")
	public int field1260 = 0x332D25;

	@ObfuscatedName("client.cf")
	public boolean field1264 = false;

	@ObfuscatedName("client.ef")
	public boolean field1265 = false;

	@ObfuscatedName("client.gf")
	public boolean field1266 = false;

	@ObfuscatedName("client.jf")
	public int field1267 = 78;

	@ObfuscatedName("client.pf")
	public class41[][][] field1272 = new class41[4][104][104];

	@ObfuscatedName("client.Af")
	public int[][][] field1282 = new int[4][13][13];

	@ObfuscatedName("client.Cf")
	public boolean field1284 = true;

	@ObfuscatedName("client.Ef")
	public int[] field1286 = new int[5];

	@ObfuscatedName("client.Lf")
	public int[] field1291 = new int[4000];

	@ObfuscatedName("client.Mf")
	public int[] field1292 = new int[4000];

	@ObfuscatedName("client.Rf")
	public int[][] field1295 = new int[104][104];

	@ObfuscatedName("client.Tf")
	public int[] field1297 = new int[class67.field1013];

	@ObfuscatedName("client.cg")
	public boolean field1306 = false;

	@ObfuscatedName("client.eg")
	public int field1308 = -1;

	@ObfuscatedName("client.gg")
	public boolean field1310 = false;

	@ObfuscatedName("client.ig")
	public String field1311 = "";

	@ObfuscatedName("client.jg")
	public String field1312 = "";

	@ObfuscatedName("client.ng")
	public boolean field1316 = false;

	@ObfuscatedName("client.Cg")
	public int[] field1330 = new int[1000];

	@ObfuscatedName("client.Dg")
	public int[] field1331 = new int[1000];

	@ObfuscatedName("client.Jg")
	public int field1337 = 0x4D4233;

	@ObfuscatedName("client.Lg")
	public int[] field1338 = new int[33];

	@ObfuscatedName("client.Og")
	public int[] field1339 = new int[5];

	@ObfuscatedName("client.Rg")
	public int field1342 = 50;

	@ObfuscatedName("client.Sg")
	public int[] field1343 = new int[field1342];

	@ObfuscatedName("client.Tg")
	public int[] field1344 = new int[field1342];

	@ObfuscatedName("client.Ug")
	public int[] field1345 = new int[field1342];

	@ObfuscatedName("client.Vg")
	public int[] field1346 = new int[field1342];

	@ObfuscatedName("client.Wg")
	public int[] field1347 = new int[field1342];

	@ObfuscatedName("client.Xg")
	public int[] field1348 = new int[field1342];

	@ObfuscatedName("client.Yg")
	public int[] field1349 = new int[field1342];

	@ObfuscatedName("client.Zg")
	public String[] field1350 = new String[field1342];

	@ObfuscatedName("client.ah")
	public int[] field1351 = new int[50];

	@ObfuscatedName("client.bh")
	public String[] field1352 = new String[5];

	@ObfuscatedName("client.ch")
	public boolean[] field1353 = new boolean[5];

	@ObfuscatedName("client.eh")
	public class35[] field1354 = new class35[1000];

	@ObfuscatedName("client.kh")
	public boolean field1360 = true;

	@ObfuscatedName("client.lh")
	public class48[] field1361 = new class48[5];

	@ObfuscatedName("client.nh")
	public boolean field1363 = false;

	@ObfuscatedName("client.oh")
	public class36[] field1364 = new class36[2];

	@ObfuscatedName("client.ph")
	public class36[] field1365 = new class36[100];

	@ObfuscatedName("client.yh")
	public class35[] field1373 = new class35[8];

	@ObfuscatedName("client.Ch")
	public int[] field1376 = new int[151];

	@ObfuscatedName("client.Gh")
	public int[] field1379 = new int[class67.field1013];

	@ObfuscatedName("client.Hh")
	public class35[] field1380 = new class35[20];

	@ObfuscatedName("client.Yh")
	public int field1393 = -1;

	@ObfuscatedName("client.ai")
	public int[][] field1395 = new int[104][104];

	@ObfuscatedName("client.bi")
	public String field1396 = "";

	@ObfuscatedName("client.ci")
	public long[] field1397 = new long[200];

	@ObfuscatedName("client.fi")
	public boolean field1398 = false;

	@ObfuscatedName("client.li")
	public boolean[] field1401 = new boolean[5];

	@ObfuscatedName("client.ni")
	public int field1403 = 0x23201B;

	@ObfuscatedName("client.pi")
	public class26[] field1405 = new class26[16384];

	@ObfuscatedName("client.ri")
	public int[] field1407 = new int[16384];

	@ObfuscatedName("client.wi")
	public class62[] field1411 = new class62[4];

	@ObfuscatedName("client.xi")
	public int[] field1412 = new int[class67.field1013];

	@ObfuscatedName("client.zi")
	public class41 field1414 = new class41();

	@ObfuscatedName("client.Ai")
	public class4 field1415 = new class4();

	@ObfuscatedName("client.Bi")
	public boolean field1416 = false;

	@ObfuscatedName("client.Fi")
	public boolean field1418 = false;

	@ObfuscatedName("client.Gi")
	public int[] field1419 = new int[7];

	@ObfuscatedName("client.Mi")
	public int[] field1424 = new int[200];

	@ObfuscatedName("client.Oi")
	public int[] field1425 = new int[5];

	@ObfuscatedName("client.fj")
	public boolean field1441 = false;

	@ObfuscatedName("client.gj")
	public int field1442 = -1;

	@ObfuscatedName("client.kj")
	public int field1445 = 1;

	@ObfuscatedName("client.mj")
	public class35[] field1446 = new class35[20];

	@ObfuscatedName("client.xj")
	public final int[] field1457 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.yj")
	public int[] field1458 = new int[5];

	@ObfuscatedName("client.Bj")
	public class41 field1461 = new class41();

	@ObfuscatedName("client.Cj")
	public int field1462 = -1;

	@ObfuscatedName("client.Dj")
	public int field1463 = 0x766654;

	@ObfuscatedName("client.Kj")
	public int field1470 = 2;

	@ObfuscatedName("client.Mj")
	public int field1471 = 3;

	@ObfuscatedName("client.Nj")
	public boolean field1472 = false;

	@ObfuscatedName("client.Rj")
	public boolean field1476 = false;

	@ObfuscatedName("client.Sj")
	public boolean field1477 = true;

	@ObfuscatedName("client.bk")
	public String[] field1484 = new String[500];

	@ObfuscatedName("client.Mc")
	public static int field1158 = 10;

	@ObfuscatedName("client.Oc")
	public static boolean field1160 = true;

	@ObfuscatedName("client.yd")
	public static int[] field1192 = new int[32];

	@ObfuscatedName("client.Te")
	public static final int[][] field1256 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.We")
	public static int[] field1259 = new int[99];

	@ObfuscatedName("client.zf")
	public static String field1281 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.ii")
	public static final int[] field1400 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.mi")
	public static BigInteger field1402 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Pi")
	public static BigInteger field1426 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.R")
	public int field1068;

	@ObfuscatedName("client.S")
	public int field1069;

	@ObfuscatedName("client.T")
	public int field1070;

	@ObfuscatedName("client.U")
	public int field1071;

	@ObfuscatedName("client.V")
	public int field1072;

	@ObfuscatedName("client.W")
	public int field1073;

	@ObfuscatedName("client.X")
	public int field1074;

	@ObfuscatedName("client.Bb")
	public static int field1101;

	@ObfuscatedName("client.Ib")
	public int field1108;

	@ObfuscatedName("client.Mb")
	public int field1111;

	@ObfuscatedName("client.Sb")
	public int field1117;

	@ObfuscatedName("client.Tb")
	public int field1118;

	@ObfuscatedName("client.Ub")
	public int field1119;

	@ObfuscatedName("client.Vb")
	public int field1120;

	@ObfuscatedName("client.Wb")
	public int field1121;

	@ObfuscatedName("client.Xb")
	public int field1122;

	@ObfuscatedName("client.Zb")
	public static int field1124;

	@ObfuscatedName("client.uc")
	public int field1142;

	@ObfuscatedName("client.Bc")
	public int field1148;

	@ObfuscatedName("client.Gc")
	public int field1153;

	@ObfuscatedName("client.Nc")
	public static int field1159;

	@ObfuscatedName("client.Qc")
	public int field1162;

	@ObfuscatedName("client.Tc")
	public static int field1164;

	@ObfuscatedName("client.fd")
	public int field1175;

	@ObfuscatedName("client.gd")
	public int field1176;

	@ObfuscatedName("client.hd")
	public int field1177;

	@ObfuscatedName("client.jd")
	public int field1178;

	@ObfuscatedName("client.md")
	public int field1181;

	@ObfuscatedName("client.od")
	public int field1183;

	@ObfuscatedName("client.rd")
	public int field1185;

	@ObfuscatedName("client.td")
	public static int field1187;

	@ObfuscatedName("client.ud")
	public static int field1188;

	@ObfuscatedName("client.xd")
	public int field1191;

	@ObfuscatedName("client.zd")
	public int field1193;

	@ObfuscatedName("client.Dd")
	public int field1197;

	@ObfuscatedName("client.Ed")
	public int field1198;

	@ObfuscatedName("client.Fd")
	public int field1199;

	@ObfuscatedName("client.Id")
	public int field1200;

	@ObfuscatedName("client.Jd")
	public int field1201;

	@ObfuscatedName("client.Ld")
	public int field1203;

	@ObfuscatedName("client.Md")
	public int field1204;

	@ObfuscatedName("client.Wd")
	public static int field1214;

	@ObfuscatedName("client.Yd")
	public int field1216;

	@ObfuscatedName("client.je")
	public int field1226;

	@ObfuscatedName("client.le")
	public static int field1228;

	@ObfuscatedName("client.ye")
	public int field1238;

	@ObfuscatedName("client.ze")
	public int field1239;

	@ObfuscatedName("client.Ae")
	public int field1240;

	@ObfuscatedName("client.Be")
	public int field1241;

	@ObfuscatedName("client.Ce")
	public int field1242;

	@ObfuscatedName("client.Ee")
	public int field1243;

	@ObfuscatedName("client.Je")
	public int field1247;

	@ObfuscatedName("client.Ke")
	public int field1248;

	@ObfuscatedName("client.Le")
	public int field1249;

	@ObfuscatedName("client.Me")
	public int field1250;

	@ObfuscatedName("client.Ne")
	public int field1251;

	@ObfuscatedName("client.Re")
	public int field1255;

	@ObfuscatedName("client.Ve")
	public int field1258;

	@ObfuscatedName("client.Ze")
	public int field1261;

	@ObfuscatedName("client.qf")
	public int field1273;

	@ObfuscatedName("client.tf")
	public int field1276;

	@ObfuscatedName("client.uf")
	public int field1277;

	@ObfuscatedName("client.vf")
	public int field1278;

	@ObfuscatedName("client.wf")
	public int field1279;

	@ObfuscatedName("client.xf")
	public int field1280;

	@ObfuscatedName("client.Bf")
	public int field1283;

	@ObfuscatedName("client.Df")
	public int field1285;

	@ObfuscatedName("client.Ff")
	public static int field1287;

	@ObfuscatedName("client.If")
	public static int field1289;

	@ObfuscatedName("client.Kf")
	public int field1290;

	@ObfuscatedName("client.Nf")
	public int field1293;

	@ObfuscatedName("client.Qf")
	public int field1294;

	@ObfuscatedName("client.Sf")
	public int field1296;

	@ObfuscatedName("client.Uf")
	public int field1298;

	@ObfuscatedName("client.Vf")
	public int field1299;

	@ObfuscatedName("client.Wf")
	public int field1300;

	@ObfuscatedName("client.Xf")
	public int field1301;

	@ObfuscatedName("client.dg")
	public int field1307;

	@ObfuscatedName("client.fg")
	public static int field1309;

	@ObfuscatedName("client.kg")
	public int field1313;

	@ObfuscatedName("client.lg")
	public int field1314;

	@ObfuscatedName("client.mg")
	public int field1315;

	@ObfuscatedName("client.xg")
	public int field1326;

	@ObfuscatedName("client.yg")
	public int field1327;

	@ObfuscatedName("client.zg")
	public static int field1328;

	@ObfuscatedName("client.Bg")
	public int field1329;

	@ObfuscatedName("client.Eg")
	public int field1332;

	@ObfuscatedName("client.Fg")
	public int field1333;

	@ObfuscatedName("client.Ig")
	public static int field1336;

	@ObfuscatedName("client.Qg")
	public int field1341;

	@ObfuscatedName("client.fh")
	public int field1355;

	@ObfuscatedName("client.gh")
	public int field1356;

	@ObfuscatedName("client.hh")
	public int field1357;

	@ObfuscatedName("client.ih")
	public int field1358;

	@ObfuscatedName("client.jh")
	public int field1359;

	@ObfuscatedName("client.rh")
	public int field1367;

	@ObfuscatedName("client.th")
	public int field1368;

	@ObfuscatedName("client.uh")
	public int field1369;

	@ObfuscatedName("client.vh")
	public int field1370;

	@ObfuscatedName("client.xh")
	public int field1372;

	@ObfuscatedName("client.zh")
	public int field1374;

	@ObfuscatedName("client.Ah")
	public int field1375;

	@ObfuscatedName("client.Ih")
	public static int field1381;

	@ObfuscatedName("client.Nh")
	public int field1385;

	@ObfuscatedName("client.Ph")
	public static int field1386;

	@ObfuscatedName("client.Wh")
	public int field1392;

	@ObfuscatedName("client.Zh")
	public int field1394;

	@ObfuscatedName("client.gi")
	public static int field1399;

	@ObfuscatedName("client.oi")
	public int field1404;

	@ObfuscatedName("client.qi")
	public int field1406;

	@ObfuscatedName("client.yi")
	public int field1413;

	@ObfuscatedName("client.Ei")
	public int field1417;

	@ObfuscatedName("client.Qi")
	public int field1427;

	@ObfuscatedName("client.Ri")
	public int field1428;

	@ObfuscatedName("client.Si")
	public int field1429;

	@ObfuscatedName("client.Ti")
	public int field1430;

	@ObfuscatedName("client.Ui")
	public int field1431;

	@ObfuscatedName("client.Vi")
	public static int field1432;

	@ObfuscatedName("client.Yi")
	public int field1435;

	@ObfuscatedName("client.ej")
	public int field1440;

	@ObfuscatedName("client.ij")
	public int field1443;

	@ObfuscatedName("client.jj")
	public int field1444;

	@ObfuscatedName("client.nj")
	public int field1447;

	@ObfuscatedName("client.oj")
	public int field1448;

	@ObfuscatedName("client.pj")
	public int field1449;

	@ObfuscatedName("client.qj")
	public int field1450;

	@ObfuscatedName("client.rj")
	public int field1451;

	@ObfuscatedName("client.sj")
	public int field1452;

	@ObfuscatedName("client.tj")
	public int field1453;

	@ObfuscatedName("client.uj")
	public int field1454;

	@ObfuscatedName("client.vj")
	public int field1455;

	@ObfuscatedName("client.wj")
	public int field1456;

	@ObfuscatedName("client.Aj")
	public int field1460;

	@ObfuscatedName("client.Ej")
	public int field1464;

	@ObfuscatedName("client.Fj")
	public int field1465;

	@ObfuscatedName("client.Gj")
	public int field1466;

	@ObfuscatedName("client.Hj")
	public int field1467;

	@ObfuscatedName("client.Ij")
	public int field1468;

	@ObfuscatedName("client.Jj")
	public int field1469;

	@ObfuscatedName("client.Oj")
	public int field1473;

	@ObfuscatedName("client.Pj")
	public int field1474;

	@ObfuscatedName("client.Uj")
	public int field1478;

	@ObfuscatedName("client.Vj")
	public int field1479;

	@ObfuscatedName("client.Wj")
	public int field1480;

	@ObfuscatedName("client.Xj")
	public int field1481;

	@ObfuscatedName("client.Yj")
	public static int field1482;

	@ObfuscatedName("client.Qd")
	public long field1208;

	@ObfuscatedName("client.Hf")
	public long field1288;

	@ObfuscatedName("client.qh")
	public long field1366;

	@ObfuscatedName("client.Dh")
	public long field1377;

	@ObfuscatedName("client.Xi")
	public long field1434;

	@ObfuscatedName("client.Pd")
	public static class27 field1207;

	@ObfuscatedName("client.Cb")
	public class35 field1102;

	@ObfuscatedName("client.Db")
	public class35 field1103;

	@ObfuscatedName("client.Eb")
	public class35 field1104;

	@ObfuscatedName("client.Fb")
	public class35 field1105;

	@ObfuscatedName("client.Gb")
	public class35 field1106;

	@ObfuscatedName("client.Dc")
	public class35 field1150;

	@ObfuscatedName("client.dd")
	public class35 field1173;

	@ObfuscatedName("client.Oe")
	public class35 field1252;

	@ObfuscatedName("client.Pe")
	public class35 field1253;

	@ObfuscatedName("client.rf")
	public class35 field1274;

	@ObfuscatedName("client.sf")
	public class35 field1275;

	@ObfuscatedName("client.Qj")
	public class35 field1475;

	@ObfuscatedName("client.M")
	public class36 field1063;

	@ObfuscatedName("client.N")
	public class36 field1064;

	@ObfuscatedName("client.O")
	public class36 field1065;

	@ObfuscatedName("client.P")
	public class36 field1066;

	@ObfuscatedName("client.Q")
	public class36 field1067;

	@ObfuscatedName("client.Zc")
	public class36 field1170;

	@ObfuscatedName("client.ad")
	public class36 field1171;

	@ObfuscatedName("client.ue")
	public class36 field1234;

	@ObfuscatedName("client.ve")
	public class36 field1235;

	@ObfuscatedName("client.we")
	public class36 field1236;

	@ObfuscatedName("client.Jh")
	public class36 field1382;

	@ObfuscatedName("client.Kh")
	public class36 field1383;

	@ObfuscatedName("client.Lh")
	public class36 field1384;

	@ObfuscatedName("client.Rh")
	public class36 field1387;

	@ObfuscatedName("client.Sh")
	public class36 field1388;

	@ObfuscatedName("client.Th")
	public class36 field1389;

	@ObfuscatedName("client.Uh")
	public class36 field1390;

	@ObfuscatedName("client.Vh")
	public class36 field1391;

	@ObfuscatedName("client.lf")
	public class37 field1268;

	@ObfuscatedName("client.mf")
	public class37 field1269;

	@ObfuscatedName("client.nf")
	public class37 field1270;

	@ObfuscatedName("client.of")
	public class37 field1271;

	@ObfuscatedName("client.Zd")
	public class43 field1217;

	@ObfuscatedName("client.ae")
	public class43 field1218;

	@ObfuscatedName("client.be")
	public class43 field1219;

	@ObfuscatedName("client.ce")
	public class43 field1220;

	@ObfuscatedName("client.de")
	public class43 field1221;

	@ObfuscatedName("client.ee")
	public class43 field1222;

	@ObfuscatedName("client.fe")
	public class43 field1223;

	@ObfuscatedName("client.ge")
	public class43 field1224;

	@ObfuscatedName("client.he")
	public class43 field1225;

	@ObfuscatedName("client.Zf")
	public class43 field1303;

	@ObfuscatedName("client.ag")
	public class43 field1304;

	@ObfuscatedName("client.bg")
	public class43 field1305;

	@ObfuscatedName("client.og")
	public class43 field1317;

	@ObfuscatedName("client.pg")
	public class43 field1318;

	@ObfuscatedName("client.qg")
	public class43 field1319;

	@ObfuscatedName("client.rg")
	public class43 field1320;

	@ObfuscatedName("client.sg")
	public class43 field1321;

	@ObfuscatedName("client.tg")
	public class43 field1322;

	@ObfuscatedName("client.ug")
	public class43 field1323;

	@ObfuscatedName("client.vg")
	public class43 field1324;

	@ObfuscatedName("client.wg")
	public class43 field1325;

	@ObfuscatedName("client.aj")
	public class43 field1436;

	@ObfuscatedName("client.bj")
	public class43 field1437;

	@ObfuscatedName("client.cj")
	public class43 field1438;

	@ObfuscatedName("client.dj")
	public class43 field1439;

	@ObfuscatedName("client.nd")
	public class47 field1182;

	@ObfuscatedName("client.Jc")
	public class49 field1155;

	@ObfuscatedName("client.L")
	public class50 field1062;

	@ObfuscatedName("client.Cd")
	public class58 field1196;

	@ObfuscatedName("client.zj")
	public class5 field1459;

	@ObfuscatedName("client.Yf")
	public String field1302;

	@ObfuscatedName("client.Pg")
	public String field1340;

	@ObfuscatedName("client.wh")
	public String field1371;

	@ObfuscatedName("client.Eh")
	public String field1378;

	@ObfuscatedName("client.qd")
	public Socket field1184;

	@ObfuscatedName("client.Pc")
	public static boolean field1161;

	@ObfuscatedName("client.vd")
	public static boolean field1189;

	@ObfuscatedName("client.Bd")
	public static boolean field1195;

	@ObfuscatedName("client.Wi")
	public static boolean field1433;

	@ObfuscatedName("client.af")
	public int[] field1262;

	@ObfuscatedName("client.bf")
	public int[] field1263;

	@ObfuscatedName("client.Gg")
	public int[] field1334;

	@ObfuscatedName("client.Hg")
	public int[] field1335;

	@ObfuscatedName("client.si")
	public int[] field1408;

	@ObfuscatedName("client.ti")
	public int[] field1409;

	@ObfuscatedName("client.ui")
	public int[] field1410;

	@ObfuscatedName("client.Ii")
	public int[] field1420;

	@ObfuscatedName("client.Ji")
	public int[] field1421;

	@ObfuscatedName("client.Ki")
	public int[] field1422;

	@ObfuscatedName("client.Li")
	public int[] field1423;

	@ObfuscatedName("client.Cc")
	public class36[] field1149;

	@ObfuscatedName("client.Fe")
	public byte[][] field1244;

	@ObfuscatedName("client.mh")
	public byte[][] field1362;

	@ObfuscatedName("client.Hb")
	public byte[][][] field1107;

	@ObfuscatedName("client.ak")
	public int[][][] field1483;

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method429(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1197; var2++) {
			if (arg0.equalsIgnoreCase(field1194[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1207.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method430(int arg0) {
		if (arg0 >= 0) {
			if (field1190) {
				field1190 = false;
				field1165 = true;
			}

			int var2 = field1210[arg0];
			int var3 = field1211[arg0];
			int var4 = field1212[arg0];
			int var5 = field1213[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 899 && method500(var5, var3, var2, 167)) {
				field1110.method220(field1369);
			}

			if (var4 == 1071) {
				method500(var5, var3, var2, 246);
			}

			if (var4 == 718) {
				if (field1416) {
					field1078.method88(var3 - 4, var2 - 4);
				} else {
					field1078.method88(field25 - 4, field24 - 4);
				}
			}

			if (var4 == 357) {
				method500(var5, var3, var2, 123);
			}

			if (var4 == 810 && method500(var5, var3, var2, 9)) {
				field1110.method220(field1301);
				field1110.method220(field1299);
				field1110.method220(field1300);
			}

			if (var4 == 737) {
				method457();
			}

			if (var4 == 274) {
				class4 var6 = class4.field56[var3];
				field1368 = 1;
				field1369 = var3;
				field1370 = var6.field116;
				field1298 = 0;
				field1206 = true;
				String var7 = var6.field114;
				if (var7.indexOf(" ") != -1) {
					var7 = var7.substring(0, var7.indexOf(" "));
				}

				String var8 = var6.field114;
				if (var8.indexOf(" ") != -1) {
					var8 = var8.substring(var8.indexOf(" ") + 1);
				}

				field1371 = var7 + " " + var6.field115 + " " + var8;

				if (field1370 == 16) {
					field1206 = true;
					field1471 = 3;
					field1310 = true;
				}
			} else {
				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 694) {
						field1110.method218(67);
					}

					if (var4 == 681) {
						field1386++;
						if (field1386 >= 116) {
							field1110.method218(214);
							field1110.method222(0xC6A439);
						}

						field1110.method218(155);
					}

					if (var4 == 100) {
						field1110.method218(243);
					}

					if (var4 == 795) {
						field1110.method218(195);
					}

					if (var4 == 962) {
						field1110.method218(52);
					}

					field1110.method220(var5);
					field1110.method220(var2);
					field1110.method220(var3);
					field1478 = 0;
					field1479 = var3;
					field1480 = var2;
					field1481 = 2;
					if (class4.field56[var3].field62 == field1156) {
						field1481 = 1;
					}

					if (class4.field56[var3].field62 == field1393) {
						field1481 = 3;
					}
				}

				if (var4 == 1328) {
					class60 var9 = class60.method348(var5);
					class4 var10 = class4.field56[var3];
					String var11;
					if (var10 != null && var10.field58[var2] >= 100000) {
						var11 = var10.field58[var2] + " x " + var9.field918;
					} else if (var9.field919 == null) {
						var11 = "It's a " + var9.field918 + ".";
					} else {
						var11 = new String(var9.field919);
					}

					method503(0, var11, "");
				}

				if (var4 == 524) {
					String var12 = field1484[arg0];
					int var13 = var12.indexOf("@whi@");
					if (var13 != -1) {
						if (field1156 == -1) {
							method457();
							field1237 = var12.substring(var13 + 5).trim();
							field1472 = false;

							for (int var14 = 0; var14 < class4.field56.length; var14++) {
								if (class4.field56[var14] != null && class4.field56[var14].field65 == 600) {
									field1254 = field1156 = class4.field56[var14].field62;
									break;
								}
							}
						} else {
							method503(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 743) {
					field1328++;
					if (field1328 >= 124) {
						field1110.method218(201);
						field1110.method220(37954);
					}

					method500(var5, var3, var2, 142);
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var15 = field1127[var5];
					if (var15 != null) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var15.field411[0], 2, var15.field410[0], 1, field1207.field411[0]);
						field1096 = field24;
						field1097 = field25;
						field1099 = 2;
						field1098 = 0;

						if (var4 == 387) {
							field1101 += var5;
							if (field1101 >= 66) {
								field1110.method218(244);
								field1110.method219(154);
							}

							field1110.method218(183);
						}

						if (var4 == 499) {
							field1110.method218(147);
						}

						if (var4 == 639) {
							field1124++;
							if (field1124 >= 52) {
								field1110.method218(206);
								field1110.method219(131);
							}

							field1110.method218(230);
						}

						if (var4 == 185) {
							field1110.method218(54);
						}

						if (var4 == 27) {
							field1110.method218(27);
						}

						field1110.method220(var5);
					}
				}

				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var16 = field1405[var5];
					if (var16 != null) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var16.field411[0], 2, var16.field410[0], 1, field1207.field411[0]);
						field1096 = field24;
						field1097 = field25;
						field1099 = 2;
						field1098 = 0;

						if (var4 == 309) {
							field1110.method218(106);
						}

						if (var4 == 793) {
							field1110.method218(149);
						}

						if (var4 == 242) {
							field1110.method218(70);
						}

						if (var4 == 209) {
							field1110.method218(45);
						}

						if (var4 == 852) {
							field1110.method218(17);
						}

						field1110.method220(var5);
					}
				}

				if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
					boolean var17 = method535(field1207.field410[0], 0, 0, 0, false, 0, var3, 2, var2, 0, field1207.field411[0]);
					if (!var17) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var3, 2, var2, 1, field1207.field411[0]);
					}

					field1096 = field24;
					field1097 = field25;
					field1099 = 2;
					field1098 = 0;

					if (var4 == 778) {
						field1110.method218(203);
					}

					if (var4 == 139) {
						if ((var2 & 0x3) == 0) {
							field1482++;
						}

						if (field1482 >= 123) {
							field1110.method218(237);
							field1110.method223(0);
						}

						field1110.method218(21);
					}

					if (var4 == 224) {
						field1336 += var3;
						if (field1336 >= 75) {
							field1110.method218(184);
							field1110.method219(19);
						}

						field1110.method218(204);
					}

					if (var4 == 662) {
						field1287 += field1357;
						if (field1287 >= 118) {
							field1110.method218(122);
							field1110.method223(0);
						}

						field1110.method218(205);
					}

					if (var4 == 617) {
						field1110.method218(66);
					}

					field1110.method220(field1356 + var2);
					field1110.method220(field1357 + var3);
					field1110.method220(var5);
				}

				if (var4 == 240) {
					class26 var19 = field1405[var5];
					if (var19 != null) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var19.field411[0], 2, var19.field410[0], 1, field1207.field411[0]);
						field1096 = field24;
						field1097 = field25;
						field1099 = 2;
						field1098 = 0;
						field1110.method218(127);
						field1110.method220(var5);
						field1110.method220(field1369);
					}
				}

				if (var4 == 398) {
					field1110.method218(241);
					field1110.method220(var5);
					field1110.method220(var2);
					field1110.method220(var3);
					field1110.method220(field1301);
					field1110.method220(field1299);
					field1110.method220(field1300);
					field1478 = 0;
					field1479 = var3;
					field1480 = var2;
					field1481 = 2;
					if (class4.field56[var3].field62 == field1156) {
						field1481 = 1;
					}

					if (class4.field56[var3].field62 == field1393) {
						field1481 = 3;
					}
				}

				if (var4 == 1152) {
					class60 var20 = class60.method348(var5);
					String var21;
					if (var20.field919 == null) {
						var21 = "It's a " + var20.field918 + ".";
					} else {
						var21 = new String(var20.field919);
					}

					method503(0, var21, "");
				}

				if (var4 == 275) {
					class27 var22 = field1127[var5];
					if (var22 != null) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var22.field411[0], 2, var22.field410[0], 1, field1207.field411[0]);
						field1096 = field24;
						field1097 = field25;
						field1099 = 2;
						field1098 = 0;
						field1110.method218(242);
						field1110.method220(var5);
						field1110.method220(field1301);
						field1110.method220(field1299);
						field1110.method220(field1300);
					}
				}

				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var23 = field1484[arg0];
					int var24 = var23.indexOf("@whi@");
					if (var24 != -1) {
						long var25 = class51.method300(var23.substring(var24 + 5).trim());
						if (var4 == 605) {
							method494(var25);
						}

						if (var4 == 47) {
							method522(var25);
						}

						if (var4 == 513) {
							method547(var25);
						}

						if (var4 == 884) {
							method492(var25);
						}
					}
				}

				if (var4 == 829) {
					class26 var27 = field1405[var5];
					if (var27 != null) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var27.field411[0], 2, var27.field410[0], 1, field1207.field411[0]);
						field1096 = field24;
						field1097 = field25;
						field1099 = 2;
						field1098 = 0;
						field1110.method218(150);
						field1110.method220(var5);
						field1110.method220(field1301);
						field1110.method220(field1299);
						field1110.method220(field1300);
					}
				}

				if (var4 == 997 && !field1231) {
					field1110.method218(239);
					field1110.method220(var3);
					field1231 = true;
				}

				if (var4 == 111) {
					boolean var28 = method535(field1207.field410[0], 0, 0, 0, false, 0, var3, 2, var2, 0, field1207.field411[0]);
					if (!var28) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var3, 2, var2, 1, field1207.field411[0]);
					}

					field1096 = field24;
					field1097 = field25;
					field1099 = 2;
					field1098 = 0;
					field1110.method218(176);
					field1110.method220(field1356 + var2);
					field1110.method220(field1357 + var3);
					field1110.method220(var5);
					field1110.method220(field1301);
					field1110.method220(field1299);
					field1110.method220(field1300);
				}

				if (var4 == 225) {
					field1110.method218(100);
					field1110.method220(var3);
					class4 var30 = class4.field56[var3];
					if (var30.field71 != null && var30.field71[0][0] == 5) {
						int var31 = var30.field71[0][1];
						if (field1075[var31] != var30.field73[0]) {
							field1075[var31] = var30.field73[0];
							method495(var31);
							field1206 = true;
						}
					}
				}

				if (var4 == 370) {
					boolean var32 = method535(field1207.field410[0], 0, 0, 0, false, 0, var3, 2, var2, 0, field1207.field411[0]);
					if (!var32) {
						method535(field1207.field410[0], 0, 1, 0, false, 0, var3, 2, var2, 1, field1207.field411[0]);
					}

					field1096 = field24;
					field1097 = field25;
					field1099 = 2;
					field1098 = 0;
					field1110.method218(144);
					field1110.method220(field1356 + var2);
					field1110.method220(field1357 + var3);
					field1110.method220(var5);
					field1110.method220(field1369);
				}

				if (var4 == 1381) {
					int var34 = var5 >> 14 & 0x7FFF;
					class57 var35 = class57.method330(var34);
					String var36;
					if (var35.field833 == null) {
						var36 = "It's a " + var35.field832 + ".";
					} else {
						var36 = new String(var35.field833);
					}

					method503(0, var36, "");
				}

				if (var4 == 625) {
					method500(var5, var3, var2, 97);
				}

				if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
					if (var4 == 582) {
						if ((var5 & 0x3) == 0) {
							field1289++;
						}

						if (field1289 >= 133) {
							field1110.method218(30);
							field1110.method220(6118);
						}

						field1110.method218(103);
					}

					if (var4 == 354) {
						field1110.method218(198);
					}

					if (var4 == 113) {
						field1110.method218(25);
					}

					if (var4 == 555) {
						field1110.method218(85);
					}

					if (var4 == 331) {
						field1110.method218(210);
					}

					field1110.method220(var5);
					field1110.method220(var2);
					field1110.method220(var3);
					field1478 = 0;
					field1479 = var3;
					field1480 = var2;
					field1481 = 2;
					if (class4.field56[var3].field62 == field1156) {
						field1481 = 1;
					}

					if (class4.field56[var3].field62 == field1393) {
						field1481 = 3;
					}
				}

				if (var4 == 902) {
					String var37 = field1484[arg0];
					int var38 = var37.indexOf("@whi@");
					if (var38 != -1) {
						long var39 = class51.method300(var37.substring(var38 + 5).trim());
						int var41 = -1;
						for (int var42 = 0; var42 < field1197; var42++) {
							if (field1397[var42] == var39) {
								var41 = var42;
								break;
							}
						}

						if (var41 != -1 && field1424[var41] > 0) {
							field1165 = true;
							field1190 = false;
							field1363 = true;
							field1396 = "";
							field1367 = 3;
							field1366 = field1397[var41];
							field1061 = "Enter message to send to " + field1194[var41];
						}
					}
				}

				if (var4 == 231) {
					class4 var43 = class4.field56[var3];
					boolean var44 = true;
					if (var43.field65 > 0) {
						var44 = method554(var43);
					}

					if (var44) {
						field1110.method218(100);
						field1110.method220(var3);
					}
				}

				if (var4 == 507 || var4 == 957) {
					String var45 = field1484[arg0];
					int var46 = var45.indexOf("@whi@");
					if (var46 != -1) {
						var45 = var45.substring(var46 + 5).trim();
						String var47 = class51.method304(class51.method301(class51.method300(var45)));
						boolean var48 = false;
						for (int var49 = 0; var49 < field1128; var49++) {
							class27 var50 = field1127[field1129[var49]];
							if (var50 != null && var50.field416 != null && var50.field416.equalsIgnoreCase(var47)) {
								method535(field1207.field410[0], 0, 1, 0, false, 0, var50.field411[0], 2, var50.field410[0], 1, field1207.field411[0]);

								if (var4 == 507) {
									field1101 += var5;
									if (field1101 >= 66) {
										field1110.method218(244);
										field1110.method219(154);
									}

									field1110.method218(183);
								}

								if (var4 == 957) {
									field1124++;
									if (field1124 >= 52) {
										field1110.method218(206);
										field1110.method219(131);
									}

									field1110.method218(230);
								}

								field1110.method220(field1129[var49]);
								var48 = true;
								break;
							}
						}

						if (!var48) {
							method503(0, "Unable to find " + var47, "");
						}
					}
				}

				if (var4 == 102) {
					field1298 = 1;
					field1299 = var2;
					field1300 = var3;
					field1301 = var5;
					field1302 = class60.method348(var5).field918;
					field1368 = 0;
					field1206 = true;
				} else {
					if (var4 == 721) {
						field1309 += var3;
						if (field1309 >= 139) {
							field1110.method218(59);
							field1110.method223(0);
						}

						method500(var5, var3, var2, 139);
					}

					if (var4 == 435) {
						field1110.method218(100);
						field1110.method220(var3);
						class4 var51 = class4.field56[var3];
						if (var51.field71 != null && var51.field71[0][0] == 5) {
							int var52 = var51.field71[0][1];
							field1075[var52] = 1 - field1075[var52];
							method495(var52);
							field1206 = true;
						}
					}

					if (var4 == 1714) {
						class26 var53 = field1405[var5];
						if (var53 != null) {
							class59 var54 = var53.field415;
							if (var54.field906 != null) {
								var54 = var54.method345();
							}

							if (var54 != null) {
								String var55;
								if (var54.field882 == null) {
									var55 = "It's a " + var54.field881 + ".";
								} else {
									var55 = new String(var54.field882);
								}

								method503(0, var55, "");
							}
						}
					}

					if (var4 == 563) {
						field1110.method218(216);
						field1110.method220(var5);
						field1110.method220(var2);
						field1110.method220(var3);
						field1110.method220(field1369);
						field1478 = 0;
						field1479 = var3;
						field1480 = var2;
						field1481 = 2;
						if (class4.field56[var3].field62 == field1156) {
							field1481 = 1;
						}

						if (class4.field56[var3].field62 == field1393) {
							field1481 = 3;
						}
					}

					if (var4 == 131) {
						class27 var56 = field1127[var5];
						if (var56 != null) {
							method535(field1207.field410[0], 0, 1, 0, false, 0, var56.field411[0], 2, var56.field410[0], 1, field1207.field411[0]);
							field1096 = field24;
							field1097 = field25;
							field1099 = 2;
							field1098 = 0;
							field1110.method218(218);
							field1110.method220(var5);
							field1110.method220(field1369);
						}
					}

					field1298 = 0;
					field1368 = 0;
					field1206 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
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

		field1238 = arg3 - var9;
		field1239 = arg1 - var10;
		field1240 = arg5 - var11;
		field1241 = arg0;
		field1242 = arg4;
	}

	@ObfuscatedName("client.b(III)V")
	public final void method432(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1169[var4] != null) {
				int var5 = field1167[var4];
				int var6 = field1243 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1168[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1404 == 0 || field1404 == 1 && method429(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1207.field416)) {
						if (field1460 >= 1) {
							field1484[field1443] = "Report abuse @whi@" + var7;
							field1212[field1443] = 524;
							field1443++;
						}

						field1484[field1443] = "Add ignore @whi@" + var7;
						field1212[field1443] = 47;
						field1443++;
						field1484[field1443] = "Add friend @whi@" + var7;
						field1212[field1443] = 605;
						field1443++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1392 == 0 && (var5 == 7 || field1199 == 0 || field1199 == 1 && method429(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1460 >= 1) {
							field1484[field1443] = "Report abuse @whi@" + var7;
							field1212[field1443] = 524;
							field1443++;
						}

						field1484[field1443] = "Add ignore @whi@" + var7;
						field1212[field1443] = 47;
						field1443++;
						field1484[field1443] = "Add friend @whi@" + var7;
						field1212[field1443] = 605;
						field1443++;
					}

					var3++;
				}

				if (var5 == 4 && (field1290 == 0 || field1290 == 1 && method429(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1484[field1443] = "Accept trade @whi@" + var7;
						field1212[field1443] = 507;
						field1443++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1392 == 0 && field1199 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1290 == 0 || field1290 == 1 && method429(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1484[field1443] = "Accept challenge @whi@" + var7;
						field1212[field1443] = 957;
						field1443++;
					}

					var3++;
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

	@ObfuscatedName("client.a(IIII)I")
	public final int method433(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.e(I)I")
	public final int method434() {
		int var1 = 3;
		if (field1241 < 310) {
			int var2 = field1238 >> 7;
			int var3 = field1240 >> 7;
			int var4 = field1207.field360 >> 7;
			int var5 = field1207.field361 >> 7;

			if ((field1107[field1285][var2][var3] & 0x4) != 0) {
				var1 = field1285;
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

					if ((field1107[field1285][var2][var3] & 0x4) != 0) {
						var1 = field1285;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1107[field1285][var2][var3] & 0x4) != 0) {
							var1 = field1285;
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

					if ((field1107[field1285][var2][var3] & 0x4) != 0) {
						var1 = field1285;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1107[field1285][var2][var3] & 0x4) != 0) {
							var1 = field1285;
						}
					}
				}
			}
		}

		if ((field1107[field1285][field1207.field360 >> 7][field1207.field361 >> 7] & 0x4) != 0) {
			var1 = field1285;
		}

		return var1;
	}

	@ObfuscatedName("client.f(I)I")
	public final int method435() {
		int var1 = method513(field1240, field1238, field1285);
		if (var1 - field1239 < 800 && (field1107[field1285][field1238 >> 7][field1240 >> 7] & 0x4) != 0) {
			return field1285;
		}

		return 3;
	}

	@ObfuscatedName("client.a(Lnb;I)V")
	public final void method436(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1078.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1078.method77(arg0.field641, arg0.field640, arg0.field638);
		}

		if (arg0.field639 == 2) {
			var2 = field1078.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1078.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1078.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.a(BLjb;)V")
	public final void method437(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1334.length; var3++) {
			field1334[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1334[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1335[var9] = (field1334[var9 - 1] + field1334[var9 + 1] + field1334[var9 - 128] + field1334[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1334;
			field1334 = field1335;
			field1335 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1334[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lib;III)V")
	public final void method438(class35 arg0, int arg1, int arg2) {
		int var4 = field1178 + field1175 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1444 + 256);
			var7 = var7 * 256 / (field1444 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method192(field1235, var8 + 94 + 4 - arg0.field601 / 2, 83 - var9 - arg0.field602 / 2 - 4);
			} else {
				arg0.method186(83 - var9 - arg0.field602 / 2 - 4, var8 + 94 - arg0.field601 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method439() {
		if (field1217 == null) {
			field10 = null;
			field1439 = null;
			field1437 = null;
			field1436 = null;
			field1438 = null;
			field1303 = null;
			field1304 = null;
			field1305 = null;
			field1220 = new class43(128, 265, method11());
			class33.method155();
			field1221 = new class43(128, 265, method11());
			class33.method155();
			field1217 = new class43(509, 171, method11());
			class33.method155();
			field1218 = new class43(360, 132, method11());
			class33.method155();
			field1219 = new class43(360, 200, method11());
			class33.method155();
			field1222 = new class43(202, 238, method11());
			class33.method155();
			field1223 = new class43(203, 238, method11());
			class33.method155();
			field1224 = new class43(74, 94, method11());
			class33.method155();
			field1225 = new class43(75, 94, method11());
			class33.method155();

			if (field1062 != null) {
				method455();
				method480();
			}

			field1109 = true;
		}
	}

	public final void run() {
		if (field1113) {
			method496();
		} else {
			super.run();
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZILlb;)V")
	public final void method440(int arg0, class38 arg1) {
		if (arg0 == 142 || arg0 == 237) {
			int var3 = arg1.method229();
			int var4 = (var3 >> 4 & 0x7) + field1080;
			int var5 = (var3 & 0x7) + field1081;
			int var6 = arg1.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1457[var7];
			int var10;
			if (arg0 == 237) {
				var10 = -1;
			} else {
				var10 = arg1.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method562(0, var4, var9, var7, var5, var10, -1, var8, field1285);
			}
		} else if (arg0 == 188) {
			int var11 = arg1.method229();
			int var12 = (var11 >> 4 & 0x7) + field1080;
			int var13 = (var11 & 0x7) + field1081;
			int var14 = arg1.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1457[var15];
			int var18 = arg1.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1483[field1285][var12][var13];
				int var20 = field1483[field1285][var12 + 1][var13];
				int var21 = field1483[field1285][var12 + 1][var13 + 1];
				int var22 = field1483[field1285][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1078.method72(field1285, var12, var13);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var24, 2, var22, var20, var18, var16 + 4, var19, var21, false);
							var23.field255 = new class28(var24, 2, var22, var20, var18, var16 + 1 & 0x3, var19, var21, false);
						} else {
							var23.field254 = new class28(var24, var15, var22, var20, var18, var16, var19, var21, false);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1078.method73(field1285, var12, var13);
					if (var25 != null) {
						var25.field147 = new class28(var25.field148 >> 14 & 0x7FFF, 4, var22, var20, var18, 0, var19, var21, false);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1078.method74(var12, var13, field1285);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var26.field247 >> 14 & 0x7FFF, var15, var22, var20, var18, var16, var19, var21, false);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1078.method75(var13, field1285, var12);
					if (var27 != null) {
						var27.field178 = new class28(var27.field179 >> 14 & 0x7FFF, 22, var22, var20, var18, var16, var19, var21, false);
					}
				}
			}
		} else if (arg0 == 7) {
			int var28 = arg1.method229();
			int var29 = (var28 >> 4 & 0x7) + field1080;
			int var30 = (var28 & 0x7) + field1081;
			int var31 = arg1.method231();
			int var32 = arg1.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1272[field1285][var29][var30] == null) {
					field1272[field1285][var29][var30] = new class41();
				}

				field1272[field1285][var29][var30].method245(var33);
				method470(var29, var30);
			}
		} else if (arg0 == 76) {
			int var34 = arg1.method229();
			int var35 = (var34 >> 4 & 0x7) + field1080;
			int var36 = (var34 & 0x7) + field1081;
			int var37 = arg1.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1272[field1285][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1272[field1285][var35][var36] = null;
					}

					method470(var35, var36);
				}
			}
		} else if (arg0 == 192) {
			int var40 = arg1.method229();
			int var41 = (var40 >> 4 & 0x7) + field1080;
			int var42 = (var40 & 0x7) + field1081;
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
				class30 var53 = new class30(var52, field1285, var51, var48, var41, field1214 + var50, field1214 + var49, var46, method513(var42, var41, field1285) - var47, var42, var45);
				var53.method120(var43, field1214 + var49, method513(var44, var43, field1285) - var48, var44);
				field1461.method245(var53);
			}
		} else if (arg0 == 45) {
			int var54 = arg1.method229();
			int var55 = (var54 >> 4 & 0x7) + field1080;
			int var56 = (var54 & 0x7) + field1081;
			int var57 = arg1.method231();
			int var58 = arg1.method229();
			int var59 = arg1.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var57, field1214, field1285, var56, var59, method513(var56, var55, field1285) - var58, var55);
				field1091.method245(var60);
			}
		} else if (arg0 == 14) {
			int var61 = arg1.method229();
			int var62 = (var61 >> 4 & 0x7) + field1080;
			int var63 = (var61 & 0x7) + field1081;
			int var64 = arg1.method231();
			int var65 = arg1.method231();
			int var66 = arg1.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1144 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1272[field1285][var62][var63] == null) {
					field1272[field1285][var62][var63] = new class41();
				}

				field1272[field1285][var62][var63].method245(var67);
				method470(var62, var63);
			}
		} else {
			if (arg0 == 35) {
				int var68 = arg1.method229();
				int var69 = (var68 >> 4 & 0x7) + field1080;
				int var70 = (var68 & 0x7) + field1081;
				int var71 = arg1.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1457[var72];
				int var75 = arg1.method231();
				int var76 = arg1.method231();
				int var77 = arg1.method231();
				int var78 = arg1.method231();
				byte var79 = arg1.method230();
				byte var80 = arg1.method230();
				byte var81 = arg1.method230();
				byte var82 = arg1.method230();
				class27 var83;
				if (field1144 == var78) {
					var83 = field1207;
				} else {
					var83 = field1127[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1483[field1285][var69][var70];
					int var86 = field1483[field1285][var69 + 1][var70];
					int var87 = field1483[field1285][var69 + 1][var70 + 1];
					int var88 = field1483[field1285][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method562(var76 + 1, var69, var74, 0, var70, -1, var77 + 1, 0, field1285);
						var83.field426 = field1214 + var76;
						var83.field427 = field1214 + var77;
						var83.field431 = var89;
						int var90 = var84.field836;
						int var91 = var84.field837;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field837;
							var91 = var84.field836;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method513(var83.field430, var83.field428, field1285);

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

			if (arg0 == 197) {
				int var94 = arg1.method229();
				int var95 = (var94 >> 4 & 0x7) + field1080;
				int var96 = (var94 & 0x7) + field1081;
				int var97 = arg1.method231();
				int var98 = arg1.method231();
				int var99 = arg1.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1272[field1285][var95][var96];
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
			} else if (arg0 == 19) {
				int var102 = arg1.method229();
				int var103 = (var102 >> 4 & 0x7) + field1080;
				int var104 = (var102 & 0x7) + field1081;
				int var105 = arg1.method231();
				int var106 = arg1.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1207.field410[0] >= var103 - var107 && field1207.field410[0] <= var103 + var107 && field1207.field411[0] >= var104 - var107 && field1207.field411[0] <= var104 + var107 && field1477 && !field1161 && field1255 < 50) {
					field1186[field1255] = var105;
					field1112[field1255] = var108;
					field1351[field1255] = class55.field790[var105];
					field1255++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method441() {
		if (field1148 > 1) {
			field1148--;
		}

		if (field1468 > 0) {
			field1468--;
		}

		for (int var1 = 0; var1 < 5 && method530(); var1++) {
		}

		if (field1418) {
			synchronized (field1196.field870) {
				if (!field1195) {
					field1196.field871 = 0;
				} else if (field23 != 0 || field1196.field871 >= 40) {
					field1110.method218(94);
					field1110.method219(0);
					int var3 = field1110.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1196.field871 && var3 - field1110.field621 < 240; var5++) {
						var4++;
						int var6 = field1196.field873[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1196.field872[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1196.field873[var5] == -1 && field1196.field872[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1138 != var7 || field1139 != var6) {
							int var9 = var7 - field1138;
							field1138 = var7;
							int var10 = var6 - field1139;
							field1139 = var6;

							if (field1333 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1110.method220((field1333 << 12) + (var9 << 6) + var10);
								field1333 = 0;
							} else if (field1333 < 8) {
								field1110.method222((field1333 << 19) + var8 + 0x800000);
								field1333 = 0;
							} else {
								field1110.method223((field1333 << 19) + var8 - 0x40000000);
								field1333 = 0;
							}
						} else if (field1333 < 2047) {
							field1333++;
						}
					}

					field1110.method228(field1110.field621 - var3);

					if (var4 >= field1196.field871) {
						field1196.field871 = 0;
					} else {
						field1196.field871 -= var4;
						for (int var11 = 0; var11 < field1196.field871; var11++) {
							field1196.field872[var11] = field1196.field872[var4 + var11];
							field1196.field873[var11] = field1196.field873[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1434) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1434 = field26;
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
				field1110.method218(238);
				field1110.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1315 > 0) {
				field1315--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1316 = true;
			}

			if (field1316 && field1315 <= 0) {
				field1315 = 20;
				field1316 = false;
				field1110.method218(212);
				field1110.method220(field1174);
				field1110.method220(field1175);
			}

			if (field14 && !field1360) {
				field1360 = true;
				field1110.method218(11);
				field1110.method219(1);
			}

			if (!field14 && field1360) {
				field1360 = false;
				field1110.method218(11);
				field1110.method219(0);
			}

			method504();
			method491();
			method501();
			field1466++;
			if (field1466 > 750) {
				method446();
			}

			method512();
			method537();
			method449();
			field1087++;

			if (field1099 != 0) {
				field1098 += 20;
				if (field1098 >= 400) {
					field1099 = 0;
				}
			}

			if (field1481 != 0) {
				field1478++;
				if (field1478 >= 15) {
					if (field1481 == 2) {
						field1206 = true;
					}

					if (field1481 == 3) {
						field1165 = true;
					}

					field1481 = 0;
				}
			}

			if (field1451 != 0) {
				field1375++;

				if (field17 > field1452 + 5 || field17 < field1452 - 5 || field18 > field1453 + 5 || field18 < field1453 - 5) {
					field1306 = true;
				}

				if (field16 == 0) {
					if (field1451 == 2) {
						field1206 = true;
					}

					if (field1451 == 3) {
						field1165 = true;
					}

					field1451 = 0;

					if (field1306 && field1375 >= 5) {
						field1448 = -1;
						method497();

						if (field1449 == field1448 && field1450 != field1447) {
							class4 var19 = class4.field56[field1449];
							byte var20 = 0;
							if (field1069 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1447] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1450;
								int var22 = field1447;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1450;
								int var24 = field1447;
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
								var19.method33(field1450, field1447);
							}

							field1110.method218(126);
							field1110.method220(field1449);
							field1110.method220(field1450);
							field1110.method220(field1447);
							field1110.method219(var20);
						}
					} else if ((field1121 == 1 || method525(field1443 - 1)) && field1443 > 2) {
						method479();
					} else if (field1443 > 0) {
						method430(field1443 - 1);
					}

					field1478 = 10;
					field23 = 0;
				}
			}

			field1399++;
			if (field1399 > 62) {
				field1399 = 0;
				field1110.method218(87);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method535(field1207.field410[0], 0, 0, 0, true, 0, var26, 0, var25, 0, field1207.field411[0]);
				class18.field292 = -1;

				if (var27) {
					field1096 = field24;
					field1097 = field25;
					field1099 = 1;
					field1098 = 0;
				}
			}

			if (field23 == 1 && field1378 != null) {
				field1378 = null;
				field1165 = true;
				field23 = 0;
			}

			method476();
			method523();
			method508();
			method549();

			if (field16 == 1 || field23 == 1) {
				field1456++;
			}

			if (field1216 == 2) {
				method528();
			}

			if (field1216 == 2 && field1205) {
				method450();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1286[var28]++;
			}

			method472();
			field15++;
			if (field15 > 4500) {
				field1468 = 250;
				field15 -= 500;
				field1110.method218(194);
			}

			field1193++;
			if (field1193 > 500) {
				field1193 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1142 += field1143;
				}

				if ((var29 & 0x2) == 2) {
					field1469 += field1470;
				}

				if ((var29 & 0x4) == 4) {
					field1093 += field1094;
				}
			}

			if (field1142 < -50) {
				field1143 = 2;
			}

			if (field1142 > 50) {
				field1143 = -2;
			}

			if (field1469 < -55) {
				field1470 = 2;
			}

			if (field1469 > 55) {
				field1470 = -2;
			}

			if (field1093 < -40) {
				field1094 = 1;
			}

			if (field1093 > 40) {
				field1094 = -1;
			}

			field1108++;
			if (field1108 > 500) {
				field1108 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1178 += field1179;
				}

				if ((var30 & 0x2) == 2) {
					field1444 += field1445;
				}
			}

			if (field1178 < -60) {
				field1179 = 2;
			}

			if (field1178 > 60) {
				field1179 = -2;
			}

			if (field1444 < -20) {
				field1445 = 1;
			}

			if (field1444 > 10) {
				field1445 = -1;
			}

			field1467++;
			if (field1467 > 50) {
				field1110.method218(62);
			}

			try {
				if (field1459 != null && field1110.field621 > 0) {
					field1459.method42(field1110.field620, field1110.field621, 0);
					field1110.field621 = 0;
					field1467 = 0;
				}
			} catch (IOException var32) {
				method446();
			} catch (Exception var33) {
				method468();
			}
		}
	}

	@ObfuscatedName("client.a(Lgc;IIII)V")
	public final void method442(class59 arg0, int arg1, int arg2, int arg3) {
		if (field1443 < 400) {
			if (arg0.field906 != null) {
				arg0 = arg0.method345();
			}

			if (arg0 != null) {
				String var5 = arg0.field881;
				if (arg0.field898 != 0) {
					var5 = var5 + method533(field1207.field422, arg0.field898) + " (level-" + arg0.field898 + ")";
				}

				if (field1298 == 1) {
					field1484[field1443] = "Use " + field1302 + " with @yel@" + var5;
					field1212[field1443] = 829;
					field1213[field1443] = arg2;
					field1210[field1443] = arg3;
					field1211[field1443] = arg1;
					field1443++;
				} else if (field1368 != 1) {
					if (arg0.field893 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field893[var6] != null && !arg0.field893[var6].equalsIgnoreCase("attack")) {
								field1484[field1443] = arg0.field893[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1212[field1443] = 242;
								}

								if (var6 == 1) {
									field1212[field1443] = 209;
								}

								if (var6 == 2) {
									field1212[field1443] = 309;
								}

								if (var6 == 3) {
									field1212[field1443] = 852;
								}

								if (var6 == 4) {
									field1212[field1443] = 793;
								}

								field1213[field1443] = arg2;
								field1210[field1443] = arg3;
								field1211[field1443] = arg1;
								field1443++;
							}
						}
					}

					if (arg0.field893 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field893[var7] != null && arg0.field893[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field898 > field1207.field422) {
									var8 = 2000;
								}

								field1484[field1443] = arg0.field893[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1212[field1443] = var8 + 242;
								}

								if (var7 == 1) {
									field1212[field1443] = var8 + 209;
								}

								if (var7 == 2) {
									field1212[field1443] = var8 + 309;
								}

								if (var7 == 3) {
									field1212[field1443] = var8 + 852;
								}

								if (var7 == 4) {
									field1212[field1443] = var8 + 793;
								}

								field1213[field1443] = arg2;
								field1210[field1443] = arg3;
								field1211[field1443] = arg1;
								field1443++;
							}
						}
					}

					field1484[field1443] = "Examine @yel@" + var5;
					field1212[field1443] = 1714;
					field1213[field1443] = arg2;
					field1210[field1443] = arg3;
					field1211[field1443] = arg1;
					field1443++;
				} else if ((field1370 & 0x2) == 2) {
					field1484[field1443] = field1371 + " @yel@" + var5;
					field1212[field1443] = 240;
					field1213[field1443] = arg2;
					field1210[field1443] = arg3;
					field1211[field1443] = arg1;
					field1443++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method443(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1130; var3++) {
			int var4 = field1131[var3];
			class26 var5 = field1405[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method229();
				int var8 = arg0.method229();
				var5.method114(var7, var8, field1214);
				var5.field379 = field1214 + 300;
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
				var5.method114(var12, var13, field1214);
				var5.field379 = field1214 + 300;
				var5.field380 = arg0.method229();
				var5.field381 = arg0.method229();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method341(arg0.method231());
				var5.field364 = var5.field415.field883;
				var5.field408 = var5.field415.field905;
				var5.field367 = var5.field415.field887;
				var5.field368 = var5.field415.field888;
				var5.field369 = var5.field415.field889;
				var5.field370 = var5.field415.field890;
				var5.field365 = var5.field415.field886;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg0.method231();
				int var14 = arg0.method234();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1214;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1214) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method444() {
		if (field1298 == 0 && field1368 == 0) {
			field1484[field1443] = "Walk here";
			field1212[field1443] = 718;
			field1210[field1443] = field17;
			field1211[field1443] = field18;
			field1443++;
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

				if (var6 == 2 && field1078.method80(field1285, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field863 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1298 == 1) {
						field1484[field1443] = "Use " + field1302 + " with @cya@" + var8.field832;
						field1212[field1443] = 810;
						field1213[field1443] = var3;
						field1210[field1443] = var4;
						field1211[field1443] = var5;
						field1443++;
					} else if (field1368 != 1) {
						if (var8.field848 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field848[var9] != null) {
									field1484[field1443] = var8.field848[var9] + " @cya@" + var8.field832;

									if (var9 == 0) {
										field1212[field1443] = 625;
									}

									if (var9 == 1) {
										field1212[field1443] = 721;
									}

									if (var9 == 2) {
										field1212[field1443] = 743;
									}

									if (var9 == 3) {
										field1212[field1443] = 357;
									}

									if (var9 == 4) {
										field1212[field1443] = 1071;
									}

									field1213[field1443] = var3;
									field1210[field1443] = var4;
									field1211[field1443] = var5;
									field1443++;
								}
							}
						}

						field1484[field1443] = "Examine @cya@" + var8.field832;
						field1212[field1443] = 1381;
						field1213[field1443] = var8.field829 << 14;
						field1210[field1443] = var4;
						field1211[field1443] = var5;
						field1443++;
					} else if ((field1370 & 0x4) == 4) {
						field1484[field1443] = field1371 + " @cya@" + var8.field832;
						field1212[field1443] = 899;
						field1213[field1443] = var3;
						field1210[field1443] = var4;
						field1211[field1443] = var5;
						field1443++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1405[var7];
					if (var10.field415.field883 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1406; var11++) {
							class26 var12 = field1405[field1407[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field883 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method442(var12.field415, var5, field1407[var11], var4);
							}
						}

						for (int var13 = 0; var13 < field1128; var13++) {
							class27 var14 = field1127[field1129[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method469(var5, var4, field1129[var13], var14);
							}
						}
					}

					method442(var10.field415, var5, var7, var4);
				}

				if (var6 == 0) {
					class27 var15 = field1127[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1406; var16++) {
							class26 var17 = field1405[field1407[var16]];
							if (var17 != null && var17.field415.field883 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method442(var17.field415, var5, field1407[var16], var4);
							}
						}

						for (int var18 = 0; var18 < field1128; var18++) {
							class27 var19 = field1127[field1129[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method469(var5, var4, field1129[var18], var19);
							}
						}
					}

					method469(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					class41 var20 = field1272[field1285][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1298 == 1) {
								field1484[field1443] = "Use " + field1302 + " with @lre@" + var22.field918;
								field1212[field1443] = 111;
								field1213[field1443] = var21.field455;
								field1210[field1443] = var4;
								field1211[field1443] = var5;
								field1443++;
							} else if (field1368 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field932 != null && var22.field932[var23] != null) {
										field1484[field1443] = var22.field932[var23] + " @lre@" + var22.field918;

										if (var23 == 0) {
											field1212[field1443] = 139;
										}

										if (var23 == 1) {
											field1212[field1443] = 778;
										}

										if (var23 == 2) {
											field1212[field1443] = 617;
										}

										if (var23 == 3) {
											field1212[field1443] = 224;
										}

										if (var23 == 4) {
											field1212[field1443] = 662;
										}

										field1213[field1443] = var21.field455;
										field1210[field1443] = var4;
										field1211[field1443] = var5;
										field1443++;
									} else if (var23 == 2) {
										field1484[field1443] = "Take @lre@" + var22.field918;
										field1212[field1443] = 617;
										field1213[field1443] = var21.field455;
										field1210[field1443] = var4;
										field1211[field1443] = var5;
										field1443++;
									}
								}

								field1484[field1443] = "Examine @lre@" + var22.field918;
								field1212[field1443] = 1152;
								field1213[field1443] = var21.field455;
								field1210[field1443] = var4;
								field1211[field1443] = var5;
								field1443++;
							} else if ((field1370 & 0x1) == 1) {
								field1484[field1443] = field1371 + " @lre@" + var22.field918;
								field1212[field1443] = 370;
								field1213[field1443] = var21.field455;
								field1210[field1443] = var4;
								field1211[field1443] = var5;
								field1443++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1088.method199(arg1, arg0);
		field1089.method199(arg1 + arg4 - 16, arg0);
		class33.method157(arg0, 16, field1403, arg1 + 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		class33.method157(arg0, 16, field1337, arg1 + var7 + 16, var6);
		class33.method162(var6, field1463, arg1 + var7 + 16, arg0);
		class33.method162(var6, field1463, arg1 + var7 + 16, arg0 + 1);
		class33.method160(arg1 + var7 + 16, 16, arg0, field1463);
		class33.method160(arg1 + var7 + 17, 16, arg0, field1463);
		class33.method162(var6, field1260, arg1 + var7 + 16, arg0 + 15);
		class33.method162(var6 - 1, field1260, arg1 + var7 + 17, arg0 + 14);
		class33.method160(arg1 + var7 + var6 + 15, 16, arg0, field1260);
		class33.method160(arg1 + var7 + var6 + 14, 15, arg0 + 1, field1260);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method446() {
		if (field1468 > 0) {
			method468();
		} else {
			field1438.method258();
			field1269.method202(0, 144, 257, "Connection lost");
			field1269.method202(0xFFFFFF, 143, 256, "Connection lost");
			field1269.method202(0, 159, 257, "Please wait - attempting to reestablish");
			field1269.method202(0xFFFFFF, 158, 256, "Please wait - attempting to reestablish");
			field1438.method259(4, 4, field9);
			field1326 = 0;
			field1473 = 0;
			class5 var1 = field1459;
			field1418 = false;
			field1296 = 0;
			method521(field1114, field1115, true);

			if (!field1418) {
				method468();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(Ld;IIII)V")
	public final void method447(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field63 == 0 && arg0.field78 != null && (!arg0.field77 || field1226 == arg0.field61 || field1140 == arg0.field61 || field1261 == arg0.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg1, arg0.field67 + arg3, arg0.field66 + arg1, arg3);
			int var9 = arg0.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field79[var10] + arg1;
				int var12 = arg0.field80[var10] + arg3 - arg2;
				class4 var13 = class4.field56[arg0.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method559(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method447(var13, var11, var13.field76, var12);

					if (var13.field75 > var13.field67) {
						method445(var13.field66 + var11, var12, var13.field76, var13.field75, var13.field67);
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
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1451 != 0 && field1450 == var14) {
										int var22 = 0;
										if (field1298 == 1 && field1299 == var14 && field1300 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var21, var13.field58[var14], var22);
										if (var23 != null) {
											if (field1451 != 0 && field1450 == var14 && field1449 == var13.field61) {
												var19 = field17 - field1452;
												var20 = field18 - field1453;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1375 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < class33.field566 && arg0.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1087 / 3;
													if (var24 > field1087 * 10) {
														var24 = field1087 * 10;
													}

													if (var24 > arg0.field76) {
														var24 = arg0.field76;
													}

													arg0.field76 -= var24;
													field1453 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg0.field76 < arg0.field75 - arg0.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1087 / 3;
													if (var25 > field1087 * 10) {
														var25 = field1087 * 10;
													}

													if (var25 > arg0.field75 - arg0.field67 - arg0.field76) {
														var25 = arg0.field75 - arg0.field67 - arg0.field76;
													}

													arg0.field76 += var25;
													field1453 -= var25;
												}
											} else if (field1481 != 0 && field1480 == var14 && field1479 == var13.field61) {
												var23.method188(var17, var18, 128);
											} else {
												var23.method186(var18, var17);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1268.method206(var17 + var19 + 1, method477(var26), 0, var18 + var20 + 10);
												field1268.method206(var17 + var19, method477(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class35 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method186(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1261 == var13.field61 || field1140 == var13.field61 || field1226 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method519(var13)) {
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
								class33.method157(var11, var13.field66, var29, var12, var13.field67);
							} else {
								class33.method158(var29, var11, var12, var13.field66, var13.field67);
							}
						} else if (var13.field93) {
							class33.method156(var13.field67, var12, var13.field66, var11, 256 - (var13.field68 & 0xFF), var29);
						} else {
							class33.method159(256 - (var13.field68 & 0xFF), var13.field66, var12, var11, var29, var13.field67);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1261 == var13.field61 || field1140 == var13.field61 || field1226 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method519(var13)) {
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

						if (var13.field64 == 6 && field1231) {
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

									var31 = var31.substring(0, var35) + method520(method448(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method520(method448(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method520(method448(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method520(method448(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method520(method448(4, var13)) + var31.substring(var39 + 2);
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
								var30.method203(var34, var33, var13.field95, var13.field66 / 2 + var11, var41);
							} else {
								var30.method210(var41, var11, var13.field95, var34, var33);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method519(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method186(var12, var11);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field578;
						int var44 = class34.field579;
						class34.field578 = var13.field66 / 2 + var11;
						class34.field579 = var13.field67 / 2 + var12;
						int var45 = class34.field582[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field583[var13.field112] * var13.field111 >> 16;
						boolean var47 = method519(var13);
						int var48;
						if (var47) {
							var48 = var13.field110;
						} else {
							var48 = var13.field109;
						}

						class31 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, var47, -1);
						} else {
							class66 var50 = class66.field997[var48];
							var49 = var13.method34(var50.field1000[var13.field59], var47, var50.field999[var13.field59]);
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
									String var56 = var55.field918;
									if (var55.field929 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method478(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var58, var13.field99, var13.field95, var13.field66 / 2 + var57, var56);
									} else {
										var51.method210(var56, var57, var13.field95, var58, var13.field99);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var5, var8, var7, var6);
		}
	}

	@ObfuscatedName("client.a(IZLd;)I")
	public final int method448(int arg0, class4 arg1) {
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
					var8 = field1297[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1412[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1379[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field910 && (!class60.method348(var11).field931 || field1160)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1075[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1259[field1412[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1075[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1207.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1013; var13++) {
						if (class67.field1015[var13]) {
							var8 += field1412[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field910 && (!class60.method348(var15).field931 || field1160)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1307;
				}

				if (var7 == 12) {
					var8 = field1183;
				}

				if (var7 == 13) {
					int var17 = field1075[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1031[var19];
					int var21 = var20.field1033;
					int var22 = var20.field1034;
					int var23 = var20.field1035;
					int var24 = field1192[var23 - var22];
					var8 = field1075[var21] >> var22 & var24;
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
					var8 = (field1207.field360 >> 7) + field1356;
				}

				if (var7 == 19) {
					var8 = (field1207.field361 >> 7) + field1357;
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

	@ObfuscatedName("client.i(I)V")
	public final void method449() {
		for (int var1 = -1; var1 < field1128; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1126;
			} else {
				var2 = field1129[var1];
			}

			class27 var3 = field1127[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1406; var4++) {
			int var5 = field1407[var4];
			class26 var6 = field1405[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method450() {
		int var1 = field1247 * 128 + 64;
		int var2 = field1248 * 128 + 64;
		int var3 = method513(var2, var1, field1285) - field1249;

		if (field1238 < var1) {
			field1238 += (var1 - field1238) * field1251 / 1000 + field1250;
			if (field1238 > var1) {
				field1238 = var1;
			}
		}

		if (field1238 > var1) {
			field1238 -= (field1238 - var1) * field1251 / 1000 + field1250;
			if (field1238 < var1) {
				field1238 = var1;
			}
		}

		if (field1239 < var3) {
			field1239 += (var3 - field1239) * field1251 / 1000 + field1250;
			if (field1239 > var3) {
				field1239 = var3;
			}
		}

		if (field1239 > var3) {
			field1239 -= (field1239 - var3) * field1251 / 1000 + field1250;
			if (field1239 < var3) {
				field1239 = var3;
			}
		}

		if (field1240 < var2) {
			field1240 += (var2 - field1240) * field1251 / 1000 + field1250;
			if (field1240 > var2) {
				field1240 = var2;
			}
		}

		if (field1240 > var2) {
			field1240 -= (field1240 - var2) * field1251 / 1000 + field1250;
			if (field1240 < var2) {
				field1240 = var2;
			}
		}

		int var4 = field1070 * 128 + 64;
		int var5 = field1071 * 128 + 64;
		int var6 = method513(var5, var4, field1285) - field1072;
		int var7 = var4 - field1238;
		int var8 = var6 - field1239;
		int var9 = var5 - field1240;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1241 < var11) {
			field1241 += (var11 - field1241) * field1074 / 1000 + field1073;
			if (field1241 > var11) {
				field1241 = var11;
			}
		}

		if (field1241 > var11) {
			field1241 -= (field1241 - var11) * field1074 / 1000 + field1073;
			if (field1241 < var11) {
				field1241 = var11;
			}
		}

		int var13 = var12 - field1242;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1242 += field1074 * var13 / 1000 + field1073;
			field1242 &= 0x7FF;
		}

		if (var13 < 0) {
			field1242 -= -var13 * field1074 / 1000 + field1073;
			field1242 &= 0x7FF;
		}

		int var14 = var12 - field1242;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1242 = var12;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method451() {
		try {
			field1100 = -1;
			field1091.method252();
			field1461.method252();
			class34.method167();
			method466();
			field1078.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1411[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(104, 104, field1483, field1107);
			int var3 = field1244.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1134[var4] >> 8;
				int var6 = field1134[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1078.method51(field1285);
			} else {
				field1078.method51(0);
			}

			field1110.method218(62);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1134[var7] >> 8) * 64 - field1356;
				int var9 = (field1134[var7] & 0xFF) * 64 - field1357;
				byte[] var10 = field1244[var7];
				if (var10 != null) {
					var2.method15(var10, var9, var8, (field1200 - 6) * 8, (field1201 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1134[var11] >> 8) * 64 - field1356;
				int var13 = (field1134[var11] & 0xFF) * 64 - field1357;
				byte[] var14 = field1244[var11];
				if (var14 == null && field1201 < 800) {
					var2.method14(var12, 64, 64, var13);
				}
			}

			field1110.method218(62);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1362[var15];
				if (var16 != null) {
					int var17 = (field1134[var15] >> 8) * 64 - field1356;
					int var18 = (field1134[var15] & 0xFF) * 64 - field1357;
					var2.method18(field1078, var16, var18, field1411, var17);
				}
			}

			field1110.method218(62);
			var2.method20(field1411, field1078);
			field1438.method258();
			field1110.method218(62);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method470(var19, var20);
				}
			}

			method484();
		} catch (Exception var33) {
		}

		class57.field866.method103();

		if (field1161 && signlink.cache_dat != null) {
			int var22 = field1182.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1182.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1182.method283();
		int var25 = (field1200 - 6) / 8 - 1;
		int var26 = (field1200 + 6) / 8 + 1;
		int var27 = (field1201 - 6) / 8 - 1;
		int var28 = (field1201 + 6) / 8 + 1;
		if (field1398) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1182.method274(0, var29, var30);
					if (var31 != -1) {
						field1182.method284(var31, 3);
					}

					int var32 = field1182.method274(1, var29, var30);
					if (var32 != -1) {
						field1182.method284(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method452() {
		field1181 = 0;
		int var1 = (field1207.field360 >> 7) + field1356;
		int var2 = (field1207.field361 >> 7) + field1357;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1181 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1181 = 1;
		}

		if (field1181 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1181 = 0;
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method453(boolean arg0) {
		if (field1207.field360 >> 7 == field1473 && field1207.field361 >> 7 == field1474) {
			field1473 = 0;
			field1381++;
			if (field1381 > 122) {
				field1381 = 0;
				field1110.method218(168);
				field1110.method219(62);
			}
		}

		int var2 = field1128;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1207;
				var5 = field1126 << 14;
			} else {
				var4 = field1127[field1129[var3]];
				var5 = field1129[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1161 && field1128 > 50 || field1128 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1214 < var4.field426 || field1214 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1295[var6][var7] == field1191) {
								continue;
							}

							field1295[var6][var7] = field1191;
						}

						var4.field425 = method513(var4.field361, var4.field360, field1285);
						field1078.method61(var4.field362, 60, var4.field425, var4.field363, var4, field1285, var4.field361, var5, var4.field360);
					} else {
						var4.field436 = false;
						var4.field425 = method513(var4.field361, var4.field360, field1285);
						field1078.method62(var4.field434, var4, var4.field425, var4.field361, var4.field432, var4.field360, var5, var4.field433, var4.field435, 60, field1285, var4.field362);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method454(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(1);
		if (var3 != 0) {
			int var4 = arg1.method240(2);
			if (var4 == 0) {
				field1131[field1130++] = field1126;
			} else if (var4 == 1) {
				int var5 = arg1.method240(3);
				field1207.method111(false, var5);
				int var6 = arg1.method240(1);
				if (var6 == 1) {
					field1131[field1130++] = field1126;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method240(3);
				field1207.method111(true, var7);
				int var8 = arg1.method240(3);
				field1207.method111(true, var8);
				int var9 = arg1.method240(1);
				if (var9 == 1) {
					field1131[field1130++] = field1126;
				}
			} else if (var4 == 3) {
				field1285 = arg1.method240(2);
				int var10 = arg1.method240(7);
				int var11 = arg1.method240(7);
				int var12 = arg1.method240(1);
				field1207.method110(var11, var12 == 1, var10);
				int var13 = arg1.method240(1);
				if (var13 == 1) {
					field1131[field1130++] = field1126;
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
				return new URL("http://127.0.0.1:" + (field1159 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.l(I)V")
	public final void method455() {
		byte[] var1 = field1062.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1220.method258();
		var2.method184(0, 0);
		field1221.method258();
		var2.method184(-637, 0);
		field1217.method258();
		var2.method184(-128, 0);
		field1218.method258();
		var2.method184(-202, -371);
		field1219.method258();
		var2.method184(-202, -171);
		field1222.method258();
		var2.method184(0, -265);
		field1223.method258();
		var2.method184(-562, -265);
		field1224.method258();
		var2.method184(-128, -171);
		field1225.method258();
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

		field1220.method258();
		var2.method184(382, 0);
		field1221.method258();
		var2.method184(-255, 0);
		field1217.method258();
		var2.method184(254, 0);
		field1218.method258();
		var2.method184(180, -371);
		field1219.method258();
		var2.method184(180, -171);
		field1222.method258();
		var2.method184(382, -265);
		field1223.method258();
		var2.method184(-180, -265);
		field1224.method258();
		var2.method184(254, -171);
		field1225.method258();
		var2.method184(-180, -171);
		class35 var7 = new class35(field1062, "logo", 0);
		field1217.method258();
		var7.method186(18, 382 - var7.field597 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.m(I)V")
	public static final void method456() {
		class18.field258 = true;
		class34.field573 = true;
		field1161 = true;
		class3.field32 = true;
		class57.field822 = true;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method457() {
		field1110.method218(153);

		if (field1229 != -1) {
			field1229 = -1;
			field1206 = true;
			field1231 = false;
			field1310 = true;
		}

		if (field1393 != -1) {
			field1393 = -1;
			field1165 = true;
			field1231 = false;
		}

		field1156 = -1;
	}

	@ObfuscatedName("client.a(IIILib;)V")
	public final void method458(int arg0, int arg1, class35 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1178 + field1175 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1444 + 256);
			var7 = var7 * 256 / (field1444 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1173.method191(15, 15, 256, 20, var12 + 94 + 4 - 10, 20, var10, 83 - var13 - 20);
		} else {
			method438(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method459() {
		while (true) {
			class39 var1 = field1182.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field635, var1.field634);

				if ((field1182.method277(var1.field634) & 0x62) != 0) {
					field1206 = true;

					if (field1393 != -1) {
						field1165 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1283 == var1.field634 && var1.field635 != null) {
				method527(var1.field635, field1284);
			}

			if (var1.field633 == 3 && field1216 == 1) {
				for (int var2 = 0; var2 < field1244.length; var2++) {
					if (field1135[var2] == var1.field634) {
						field1244[var2] = var1.field635;

						if (var1.field635 == null) {
							field1135[var2] = -1;
						}

						break;
					}

					if (field1136[var2] == var1.field634) {
						field1362[var2] = var1.field635;

						if (var1.field635 == null) {
							field1136[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1182.method276(var1.field634)) {
				class3.method17(field1182, new class38(var1.field635));
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 300);

			if (arg0.length == 5) {
				field1158 = Integer.parseInt(arg0[0]);
				field1159 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method456();
				} else if (arg0[2].equals("highmem")) {
					method509();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1160 = false;
				} else if (arg0[3].equals("members")) {
					field1160 = true;
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

	@ObfuscatedName("client.n(I)V")
	public final void method460() {
		if (field1439 == null) {
			method561();
			field10 = null;
			field1217 = null;
			field1218 = null;
			field1219 = null;
			field1220 = null;
			field1221 = null;
			field1222 = null;
			field1223 = null;
			field1224 = null;
			field1225 = null;
			field1439 = new class43(479, 96, method11());
			field1437 = new class43(172, 156, method11());
			class33.method155();
			field1235.method199(0, 0);
			field1436 = new class43(190, 261, method11());
			field1438 = new class43(512, 334, method11());
			class33.method155();
			field1303 = new class43(496, 50, method11());
			field1304 = new class43(269, 37, method11());
			field1305 = new class43(249, 45, method11());
			field1109 = true;
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public final void method461(class38 arg0, int arg1) {
		field1153 = 0;
		field1130 = 0;
		method454(arg1, arg0);
		method516(arg0, arg1);
		method467(arg1, arg0);
		method526(arg0, arg1);

		for (int var3 = 0; var3 < field1153; var3++) {
			int var4 = field1154[var3];
			if (field1214 != field1127[var4].field405) {
				field1127[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1128; var5++) {
			if (field1127[field1129[var5]] == null) {
				signlink.reporterror(field1114 + " null entry in pl list - pos:" + var5 + " size:" + field1128);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a([BIB)Z")
	public final boolean method462(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1078.method76(arg0, arg4, arg1);
		if (var6 != 0) {
			int var7 = field1078.method80(arg0, arg4, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field1475.field596;
			int var12 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
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
				class36 var15 = field1365[var14.field850];
				if (var15 != null) {
					int var16 = (var14.field836 * 4 - var15.field605) / 2;
					int var17 = (var14.field837 * 4 - var15.field606) / 2;
					var15.method199((104 - arg1 - var14.field837) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1078.method78(arg0, arg4, arg1);
		if (var18 != 0) {
			int var19 = field1078.method80(arg0, arg4, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field850 != -1) {
				class36 var24 = field1365[var23.field850];
				if (var24 != null) {
					int var25 = (var23.field836 * 4 - var24.field605) / 2;
					int var26 = (var23.field837 * 4 - var24.field606) / 2;
					var24.method199((104 - arg1 - var23.field837) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1475.field596;
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

		int var30 = field1078.method79(arg0, arg4, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field850 != -1) {
				class36 var33 = field1365[var32.field850];
				if (var33 != null) {
					int var34 = (var32.field836 * 4 - var33.field605) / 2;
					int var35 = (var32.field837 * 4 - var33.field606) / 2;
					var33.method199((104 - arg1 - var32.field837) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method464() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1459 != null) {
				field1459.method38();
			}
		} catch (Exception var1) {
		}

		field1459 = null;
		method464();

		if (field1196 != null) {
			field1196.field869 = false;
		}

		field1196 = null;
		field1182.method271();
		field1182 = null;
		field1110 = null;
		field1157 = null;
		field1215 = null;
		field1134 = null;
		field1244 = null;
		field1362 = null;
		field1135 = null;
		field1136 = null;
		field1483 = null;
		field1107 = null;
		field1078 = null;
		field1411 = null;
		field1395 = null;
		field1137 = null;
		field1291 = null;
		field1292 = null;
		field1230 = null;
		field1436 = null;
		field1437 = null;
		field1438 = null;
		field1439 = null;
		field1303 = null;
		field1304 = null;
		field1305 = null;
		field1317 = null;
		field1318 = null;
		field1319 = null;
		field1320 = null;
		field1321 = null;
		field1322 = null;
		field1323 = null;
		field1324 = null;
		field1325 = null;
		field1234 = null;
		field1235 = null;
		field1236 = null;
		field1382 = null;
		field1383 = null;
		field1384 = null;
		field1202 = null;
		field1387 = null;
		field1388 = null;
		field1389 = null;
		field1390 = null;
		field1391 = null;
		field1063 = null;
		field1064 = null;
		field1065 = null;
		field1066 = null;
		field1067 = null;
		field1150 = null;
		field1380 = null;
		field1446 = null;
		field1373 = null;
		field1102 = null;
		field1103 = null;
		field1104 = null;
		field1105 = null;
		field1106 = null;
		field1365 = null;
		field1141 = null;
		field1295 = null;
		field1127 = null;
		field1129 = null;
		field1131 = null;
		field1132 = null;
		field1154 = null;
		field1405 = null;
		field1407 = null;
		field1272 = null;
		field1414 = null;
		field1461 = null;
		field1091 = null;
		field1210 = null;
		field1211 = null;
		field1212 = null;
		field1213 = null;
		field1484 = null;
		field1075 = null;
		field1330 = null;
		field1331 = null;
		field1354 = null;
		field1475 = null;
		field1194 = null;
		field1397 = null;
		field1424 = null;
		field1220 = null;
		field1221 = null;
		field1217 = null;
		field1218 = null;
		field1219 = null;
		field1222 = null;
		field1223 = null;
		field1224 = null;
		field1225 = null;
		method561();
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

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
			if (field1161 && field1285 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field1078.method76(arg4, arg2, arg5);
			}

			if (arg6 == 1) {
				var8 = field1078.method77(arg5, arg2, arg4);
			}

			if (arg6 == 2) {
				var8 = field1078.method78(arg4, arg2, arg5);
			}

			if (arg6 == 3) {
				var8 = field1078.method79(arg4, arg2, arg5);
			}

			if (var8 != 0) {
				int var12 = field1078.method80(arg4, arg2, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field1078.method67(arg4, arg2, arg5);
					class57 var16 = class57.method330(var13);
					if (var16.field838) {
						field1411[arg4].method364(arg2, arg5, var16.field839, var15, var14);
					}
				}

				if (arg6 == 1) {
					field1078.method68(arg4, arg5, arg2);
				}

				if (arg6 == 2) {
					field1078.method69(arg4, arg2, arg5);
					class57 var17 = class57.method330(var13);
					if (var17.field836 + arg2 > 103 || var17.field836 + arg5 > 103 || var17.field837 + arg2 > 103 || var17.field837 + arg5 > 103) {
						return;
					}

					if (var17.field838) {
						field1411[arg4].method365(var17.field839, arg2, var17.field837, var17.field836, arg5, var15);
					}
				}

				if (arg6 == 3) {
					field1078.method70(arg4, arg2, arg5);
					class57 var18 = class57.method330(var13);
					if (var18.field838 && var18.field840) {
						field1411[arg4].method367(arg2, arg5);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field1107[1][arg2][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				class3.method31(arg1, field1483, field1411[arg4], arg3, arg5, field1078, arg4, var19, arg0, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method466() {
		class57.field866.method103();
		class57.field867.method103();
		class59.field909.method103();
		class60.field956.method103();
		class60.field957.method103();
		class27.field440.method103();
		class68.field1029.method103();
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method467(int arg0, class38 arg1) {
		while (arg1.field622 + 10 < arg0 * 8) {
			int var3 = arg1.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1127[var3] == null) {
				field1127[var3] = new class27();
				if (field1132[var3] != null) {
					field1127[var3].method116(field1132[var3]);
				}
			}

			field1129[field1128++] = var3;
			class27 var4 = field1127[var3];
			var4.field405 = field1214;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(field1207.field411[0] + var6, var7 == 1, field1207.field410[0] + var5);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1131[field1130++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method468() {
		try {
			if (field1459 != null) {
				field1459.method38();
			}
		} catch (Exception var2) {
		}

		field1459 = null;
		field1418 = false;
		field1185 = 0;
		field1114 = "";
		field1115 = "";
		method466();
		field1078.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1411[var1].method359();
		}

		System.gc();
		method464();
		field1442 = -1;
		field1283 = -1;
		field1327 = 0;
	}

	@ObfuscatedName("client.a(IIILab;I)V")
	public final void method469(int arg0, int arg1, int arg2, class27 arg3) {
		if (field1207 != arg3 && field1443 < 400) {
			String var5;
			if (arg3.field423 == 0) {
				var5 = arg3.field416 + method533(field1207.field422, arg3.field422) + " (level-" + arg3.field422 + ")";
			} else {
				var5 = arg3.field416 + " (skill-" + arg3.field423 + ")";
			}

			if (field1298 == 1) {
				field1484[field1443] = "Use " + field1302 + " with @whi@" + var5;
				field1212[field1443] = 275;
				field1213[field1443] = arg2;
				field1210[field1443] = arg1;
				field1211[field1443] = arg0;
				field1443++;
			} else if (field1368 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1352[var6] != null) {
						field1484[field1443] = field1352[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1352[var6].equalsIgnoreCase("attack")) {
							if (arg3.field422 > field1207.field422) {
								var7 = 2000;
							}

							if (field1207.field439 != 0 && arg3.field439 != 0) {
								if (field1207.field439 == arg3.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1353[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1212[field1443] = var7 + 639;
						}

						if (var6 == 1) {
							field1212[field1443] = var7 + 499;
						}

						if (var6 == 2) {
							field1212[field1443] = var7 + 27;
						}

						if (var6 == 3) {
							field1212[field1443] = var7 + 387;
						}

						if (var6 == 4) {
							field1212[field1443] = var7 + 185;
						}

						field1213[field1443] = arg2;
						field1210[field1443] = arg1;
						field1211[field1443] = arg0;
						field1443++;
					}
				}
			} else if ((field1370 & 0x8) == 8) {
				field1484[field1443] = field1371 + " @whi@" + var5;
				field1212[field1443] = 131;
				field1213[field1443] = arg2;
				field1210[field1443] = arg1;
				field1211[field1443] = arg0;
				field1443++;
			}

			for (int var8 = 0; var8 < field1443; var8++) {
				if (field1212[var8] == 718) {
					field1484[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method470(int arg0, int arg1) {
		class41 var3 = field1272[field1285][arg0][arg1];
		if (var3 == null) {
			field1078.method71(field1285, arg0, arg1);
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
			field1078.method57(var10, var12, var9, method513(arg1 * 128 + 64, arg0 * 128 + 64, field1285), arg0, var5, field1285, arg1);
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method471(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method472() {
		field1187++;
		if (field1187 > 192) {
			field1187 = 0;
			field1110.method218(166);
			field1110.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1156 != -1 && field1254 == field1156) {
						break;
					}

					if (field1363) {
						if (var1 >= 32 && var1 <= 122 && field1396.length() < 80) {
							field1396 = field1396 + (char) var1;
							field1165 = true;
						}

						if (var1 == 8 && field1396.length() > 0) {
							field1396 = field1396.substring(0, field1396.length() - 1);
							field1165 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1363 = false;
							field1165 = true;

							if (field1367 == 1) {
								long var2 = class51.method300(field1396);
								method494(var2);
							}

							if (field1367 == 2 && field1197 > 0) {
								long var4 = class51.method300(field1396);
								method547(var4);
							}

							if (field1367 == 3 && field1396.length() > 0) {
								field1110.method218(165);
								field1110.method219(0);
								int var6 = field1110.field621;
								field1110.method225(field1366);
								class52.method307(field1110, field1396);
								field1110.method228(field1110.field621 - var6);
								field1396 = class52.method308(field1396);
								field1396 = class71.method401(field1396);
								method503(6, field1396, class51.method304(class51.method301(field1366)));

								if (field1199 == 2) {
									field1199 = 1;
									field1090 = true;
									field1110.method218(215);
									field1110.method219(field1404);
									field1110.method219(field1199);
									field1110.method219(field1290);
								}
							}

							if (field1367 == 4 && field1372 < 100) {
								long var7 = class51.method300(field1396);
								method522(var7);
							}

							if (field1367 == 5 && field1372 > 0) {
								long var9 = class51.method300(field1396);
								method492(var9);
							}
						}
					} else if (field1190) {
						if (var1 >= 48 && var1 <= 57 && field1172.length() < 10) {
							field1172 = field1172 + (char) var1;
							field1165 = true;
						}

						if (var1 == 8 && field1172.length() > 0) {
							field1172 = field1172.substring(0, field1172.length() - 1);
							field1165 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1172.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1172);
								} catch (Exception var18) {
								}

								field1110.method218(112);
								field1110.method223(var11);
							}

							field1190 = false;
							field1165 = true;
						}
					} else if (field1393 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1095.length() < 80) {
							field1095 = field1095 + (char) var1;
							field1165 = true;
						}

						if (var1 == 8 && field1095.length() > 0) {
							field1095 = field1095.substring(0, field1095.length() - 1);
							field1165 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1095.length() > 0) {
							if (field1460 == 2) {
								if (field1095.equals("::clientdrop")) {
									method446();
								}

								if (field1095.equals("::lag")) {
									method473();
								}

								if (field1095.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1182.method272(2); var12++) {
										field1182.method282((byte) 1, var12, 2);
									}
								}

								if (field1095.equals("::fpson")) {
									field1433 = true;
								}

								if (field1095.equals("::fpsoff")) {
									field1433 = false;
								}
							}

							if (field1095.startsWith("::")) {
								field1110.method218(78);
								field1110.method219(field1095.length() - 1);
								field1110.method226(field1095.substring(2));
							} else {
								String var13 = field1095.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1095 = field1095.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1095 = field1095.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1095 = field1095.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1095 = field1095.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1095 = field1095.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1095 = field1095.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1095 = field1095.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1095 = field1095.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1095 = field1095.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1095 = field1095.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1095 = field1095.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1095 = field1095.substring(6);
								}

								String var15 = field1095.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1095 = field1095.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1095 = field1095.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1095 = field1095.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1095 = field1095.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1095 = field1095.substring(6);
								}

								field1110.method218(233);
								field1110.method219(0);
								int var17 = field1110.field621;
								field1110.method219(var14);
								field1110.method219(var16);
								class52.method307(field1110, field1095);
								field1110.method228(field1110.field621 - var17);
								field1095 = class52.method308(field1095);
								field1095 = class71.method401(field1095);
								field1207.field372 = field1095;
								field1207.field374 = var14;
								field1207.field375 = var16;
								field1207.field373 = 150;

								if (field1460 == 2) {
									method503(2, field1207.field372, "@cr2@" + field1207.field416);
								} else if (field1460 == 1) {
									method503(2, field1207.field372, "@cr1@" + field1207.field416);
								} else {
									method503(2, field1207.field372, field1207.field416);
								}

								if (field1404 == 2) {
									field1404 = 3;
									field1090 = true;
									field1110.method218(215);
									field1110.method219(field1404);
									field1110.method219(field1199);
									field1110.method219(field1290);
								}
							}

							field1095 = "";
							field1165 = true;
						}
					}
				}

				if (var1 == 8 && field1237.length() > 0) {
					field1237 = field1237.substring(0, field1237.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1237.length() < 12) {
				field1237 = field1237 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public void method473() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1355);

		if (field1182 != null) {
			System.out.println("Od-cycle:" + field1182.field747);
		}

		System.out.println("loop-cycle:" + field1214);
		System.out.println("draw-cycle:" + field1164);
		System.out.println("ptype:" + field1465);
		System.out.println("psize:" + field1464);

		if (field1459 != null) {
			field1459.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method474() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1077) {
			field1266 = false;
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

		if (field1264) {
			field1266 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1246) {
			field1266 = false;
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

	@ObfuscatedName("client.a(BIILd;III)V")
	public final void method475(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
		if (arg2.field63 == 0 && arg2.field78 != null && !arg2.field77 && (arg4 >= arg1 && arg3 >= arg0 && arg4 <= arg2.field66 + arg1 && arg3 <= arg2.field67 + arg0)) {
			int var7 = arg2.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field79[var8] + arg1;
				int var10 = arg2.field80[var8] + arg0 - arg5;
				class4 var11 = class4.field56[arg2.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1092 = var11.field74;
					} else {
						field1092 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method475(var10, var9, var11, arg3, arg4, var11.field76);

					if (var11.field75 > var11.field67) {
						method506(arg3, arg4, var11, var10, var11.field67, true, var11.field66 + var9, var11.field75);
					}
				} else {
					if (var11.field64 == 1 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method515(var11);
						}

						if (!var12) {
							field1484[field1443] = var11.field117;
							field1212[field1443] = 231;
							field1211[field1443] = var11.field61;
							field1443++;
						}
					}

					if (var11.field64 == 2 && field1368 == 0 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1484[field1443] = var13 + " @gre@" + var11.field115;
						field1212[field1443] = 274;
						field1211[field1443] = var11.field61;
						field1443++;
					}

					if (var11.field64 == 3 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1484[field1443] = "Close";
						field1212[field1443] = 737;
						field1211[field1443] = var11.field61;
						field1443++;
					}

					if (var11.field64 == 4 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1484[field1443] = var11.field117;
						field1212[field1443] = 435;
						field1211[field1443] = var11.field61;
						field1443++;
					}

					if (var11.field64 == 5 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1484[field1443] = var11.field117;
						field1212[field1443] = 225;
						field1211[field1443] = var11.field61;
						field1443++;
					}

					if (var11.field64 == 6 && !field1231 && arg4 >= var9 && arg3 >= var10 && arg4 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1484[field1443] = var11.field117;
						field1212[field1443] = 997;
						field1211[field1443] = var11.field61;
						field1443++;
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

								if (arg4 >= var17 && arg3 >= var18 && arg4 < var17 + 32 && arg3 < var18 + 32) {
									field1447 = var14;
									field1448 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1298 == 1 && var11.field84) {
											if (field1300 != var11.field61 || field1299 != var14) {
												field1484[field1443] = "Use " + field1302 + " with @lre@" + var19.field918;
												field1212[field1443] = 398;
												field1213[field1443] = var19.field916;
												field1210[field1443] = var14;
												field1211[field1443] = var11.field61;
												field1443++;
											}
										} else if (field1368 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field933 != null && var19.field933[var20] != null) {
														field1484[field1443] = var19.field933[var20] + " @lre@" + var19.field918;

														if (var20 == 3) {
															field1212[field1443] = 681;
														}

														if (var20 == 4) {
															field1212[field1443] = 100;
														}

														field1213[field1443] = var19.field916;
														field1210[field1443] = var14;
														field1211[field1443] = var11.field61;
														field1443++;
													} else if (var20 == 4) {
														field1484[field1443] = "Drop @lre@" + var19.field918;
														field1212[field1443] = 100;
														field1213[field1443] = var19.field916;
														field1210[field1443] = var14;
														field1211[field1443] = var11.field61;
														field1443++;
													}
												}
											}

											if (var11.field85) {
												field1484[field1443] = "Use @lre@" + var19.field918;
												field1212[field1443] = 102;
												field1213[field1443] = var19.field916;
												field1210[field1443] = var14;
												field1211[field1443] = var11.field61;
												field1443++;
											}

											if (var11.field84 && var19.field933 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field933[var21] != null) {
														field1484[field1443] = var19.field933[var21] + " @lre@" + var19.field918;

														if (var21 == 0) {
															field1212[field1443] = 694;
														}

														if (var21 == 1) {
															field1212[field1443] = 962;
														}

														if (var21 == 2) {
															field1212[field1443] = 795;
														}

														field1213[field1443] = var19.field916;
														field1210[field1443] = var14;
														field1211[field1443] = var11.field61;
														field1443++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1484[field1443] = var11.field92[var22] + " @lre@" + var19.field918;

														if (var22 == 0) {
															field1212[field1443] = 582;
														}

														if (var22 == 1) {
															field1212[field1443] = 113;
														}

														if (var22 == 2) {
															field1212[field1443] = 555;
														}

														if (var22 == 3) {
															field1212[field1443] = 331;
														}

														if (var22 == 4) {
															field1212[field1443] = 354;
														}

														field1213[field1443] = var19.field916;
														field1210[field1443] = var14;
														field1211[field1443] = var11.field61;
														field1443++;
													}
												}
											}

											field1484[field1443] = "Examine @lre@" + var19.field918;
											field1212[field1443] = 1328;
											field1213[field1443] = var19.field916;
											field1210[field1443] = var14;
											field1211[field1443] = var11.field61;
											field1443++;
										} else if ((field1370 & 0x10) == 0x10) {
											field1484[field1443] = field1371 + " @lre@" + var19.field918;
											field1212[field1443] = 563;
											field1213[field1443] = var19.field916;
											field1210[field1443] = var14;
											field1211[field1443] = var11.field61;
											field1443++;
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

	@ObfuscatedName("client.q(I)V")
	public final void method476() {
		if (field1451 == 0) {
			int var1 = field23;
			if (field1368 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1416) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1427 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1427 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1427 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1428 - 10 || var2 > field1430 + field1428 + 10 || var3 < field1429 - 10 || var3 > field1431 + field1429 + 10) {
						field1416 = false;

						if (field1427 == 1) {
							field1206 = true;
						}

						if (field1427 == 2) {
							field1165 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1428;
					int var5 = field1429;
					int var6 = field1430;
					int var7 = field24;
					int var8 = field25;
					if (field1427 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1427 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1427 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1443; var10++) {
						int var11 = (field1443 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method430(var9);
					}

					field1416 = false;

					if (field1427 == 1) {
						field1206 = true;
					}

					if (field1427 == 2) {
						field1165 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1443 > 0) {
					int var12 = field1212[field1443 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1210[field1443 - 1];
						int var14 = field1211[field1443 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1306 = false;
							field1375 = 0;
							field1449 = var14;
							field1450 = var13;
							field1451 = 2;
							field1452 = field24;
							field1453 = field25;

							if (class4.field56[var14].field62 == field1156) {
								field1451 = 1;
							}

							if (class4.field56[var14].field62 == field1393) {
								field1451 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1121 == 1 || method525(field1443 - 1)) && field1443 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1443 > 0) {
					method430(field1443 - 1);
				}

				if (var1 != 2 || field1443 <= 0) {
					return;
				}

				method479();
			}
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public static final String method477(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method478(int arg0) {
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

	@ObfuscatedName("client.r(I)V")
	public final void method479() {
		int var1 = field1270.method204("Choose Option");
		for (int var2 = 0; var2 < field1443; var2++) {
			int var3 = field1270.method204(field1484[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1443 * 15 + 21;
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

			field1416 = true;
			field1427 = 0;
			field1428 = var5;
			field1429 = var6;
			field1430 = var1;
			field1431 = field1443 * 15 + 22;
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

			field1416 = true;
			field1427 = 1;
			field1428 = var7;
			field1429 = var8;
			field1430 = var1;
			field1431 = field1443 * 15 + 22;
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

			field1416 = true;
			field1427 = 2;
			field1428 = var9;
			field1429 = var10;
			field1430 = var1;
			field1431 = field1443 * 15 + 22;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method480() {
		field1170 = new class36(field1062, "titlebox", 0);
		field1171 = new class36(field1062, "titlebutton", 0);
		field1149 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1149[var2] = new class36(field1062, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1149[var3] = new class36(field1062, "runes", (var3 & 0x3) + 12);
			}
		}

		field1274 = new class35(128, 265);
		field1275 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1274.field596[var4] = field1220.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1275.field596[var5] = field1221.field654[var5];
		}

		field1421 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1421[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1421[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1421[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1421[var9 + 192] = 0xFFFFFF;
		}

		field1422 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1422[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1422[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1422[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1422[var13 + 192] = 0xFFFFFF;
		}

		field1423 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1423[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1423[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1423[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1423[var17 + 192] = 0xFFFFFF;
		}

		field1420 = new int[256];
		field1334 = new int[32768];
		field1335 = new int[32768];
		method437(null);
		field1262 = new int[32768];
		field1263 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1266) {
			field1113 = true;
			field1266 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method9() {
		if (field1246 || field1077 || field1264) {
			method474();
		} else {
			field1164++;

			if (field1418) {
				method544();
			} else {
				method536(false);
			}

			field1456 = 0;
		}
	}

	@ObfuscatedName("client.a(IILy;)V")
	public final void method481(int arg0, class25 arg1) {
		method482(arg0, arg1.field361, arg1.field360);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method482(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method513(arg1, arg2, field1285) - arg0;
			arg2 -= field1238;
			var4 -= field1239;
			arg1 -= field1240;
			int var5 = class31.field550[field1241];
			int var6 = class31.field551[field1241];
			int var7 = class31.field550[field1242];
			int var8 = class31.field551[field1242];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field1151 = (var9 << 9) / arg1 + class34.field578;
				field1152 = (var11 << 9) / arg1 + class34.field579;
			} else {
				field1151 = -1;
				field1152 = -1;
			}
		} else {
			field1151 = -1;
			field1152 = -1;
		}
	}

	@ObfuscatedName("client.a(ILab;Llb;II)V")
	public final void method483(class27 arg0, class38 arg1, int arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg1.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg1.method238(var5, 0, var6);
			field1132[arg2] = var7;
			arg0.method116(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg1.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg0.field388 == var8) {
				arg0.field392 = 0;
			}

			int var9 = arg1.method229();
			if (arg0.field388 == var8 && var8 != -1) {
				int var10 = class66.field997[var8].field1011;
				if (var10 == 1) {
					arg0.field389 = 0;
					arg0.field390 = 0;
					arg0.field391 = var9;
					arg0.field392 = 0;
				}

				if (var10 == 2) {
					arg0.field392 = 0;
				}
			} else if (var8 == -1 || arg0.field388 == -1 || class66.field997[var8].field1005 >= class66.field997[arg0.field388].field1005) {
				arg0.field388 = var8;
				arg0.field389 = 0;
				arg0.field390 = 0;
				arg0.field391 = var9;
				arg0.field392 = 0;
				arg0.field414 = arg0.field409;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg0.field382 = arg1.method231();
			if (arg0.field382 == 0xFFFF) {
				arg0.field382 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg0.field372 = arg1.method236();
			if (arg0.field372.charAt(0) == '~') {
				arg0.field372 = arg0.field372.substring(1);
				method503(2, arg0.field372, arg0.field416);
			} else if (field1207 == arg0) {
				method503(2, arg0.field372, arg0.field416);
			}

			arg0.field374 = 0;
			arg0.field375 = 0;
			arg0.field373 = 150;
		}

		if ((arg3 & 0x10) == 0x10) {
			int var11 = arg1.method229();
			int var12 = arg1.method229();
			arg0.method114(var11, var12, field1214);
			arg0.field379 = field1214 + 300;
			arg0.field380 = arg1.method229();
			arg0.field381 = arg1.method229();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg0.field383 = arg1.method231();
			arg0.field384 = arg1.method231();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var13 = arg1.method231();
			int var14 = arg1.method229();
			int var15 = arg1.method229();
			int var16 = arg1.field621;

			if (arg0.field416 != null && arg0.field417) {
				long var17 = class51.method300(arg0.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1372; var20++) {
						if (field1257[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1181 == 0) {
					try {
						String var21 = class52.method306(arg1, var15);
						var21 = class71.method401(var21);
						arg0.field372 = var21;
						arg0.field374 = var13 >> 8;
						arg0.field375 = var13 & 0xFF;
						arg0.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method503(1, var21, "@cr2@" + arg0.field416);
						} else if (var14 == 1) {
							method503(1, var21, "@cr1@" + arg0.field416);
						} else {
							method503(2, var21, arg0.field416);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field621 = var15 + var16;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg0.field393 = arg1.method231();
			int var23 = arg1.method234();
			arg0.field397 = var23 >> 16;
			arg0.field396 = (var23 & 0xFFFF) + field1214;
			arg0.field394 = 0;
			arg0.field395 = 0;

			if (arg0.field396 > field1214) {
				arg0.field394 = -1;
			}

			if (arg0.field393 == 0xFFFF) {
				arg0.field393 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg0.field398 = arg1.method229();
			arg0.field400 = arg1.method229();
			arg0.field399 = arg1.method229();
			arg0.field401 = arg1.method229();
			arg0.field402 = arg1.method231() + field1214;
			arg0.field403 = arg1.method231() + field1214;
			arg0.field404 = arg1.method229();
			arg0.method112();
		}

		if ((arg3 & 0x400) == 0x400) {
			int var24 = arg1.method229();
			int var25 = arg1.method229();
			arg0.method114(var24, var25, field1214);
			arg0.field379 = field1214 + 300;
			arg0.field380 = arg1.method229();
			arg0.field381 = arg1.method229();
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method484() {
		for (class40 var1 = (class40) field1414.method248(); var1 != null; var1 = (class40) field1414.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method436(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method485() {
		if (field1413 == 2) {
			method482(field1278 * 2, (field1277 - field1357 << 7) + field1280, (field1276 - field1356 << 7) + field1279);

			if (field1151 > -1 && field1214 % 20 < 10) {
				field1446[2].method186(field1152 - 28, field1151 - 12);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method486() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1262[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1262[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1263[var10] = (field1262[var10 - 1] + field1262[var10 + 1] + field1262[var10 - 128] + field1262[var10 + 128]) / 4;
			}
		}

		field1374 += 128;
		if (field1374 > field1334.length) {
			field1374 -= field1334.length;
			int var11 = (int) (Math.random() * 12.0D);
			method437(field1149[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1263[var14 + 128] - field1334[field1374 + var14 & field1334.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1262[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1180[var16] = field1180[var16 + 1];
		}

		field1180[var1 - 1] = (int) (Math.sin(field1214 / 14.0D) * 16.0D + Math.sin(field1214 / 15.0D) * 14.0D + Math.sin(field1214 / 16.0D) * 12.0D);

		if (field1203 > 0) {
			field1203 -= 4;
		}

		if (field1204 > 0) {
			field1204 -= 4;
		}

		if (field1203 == 0 && field1204 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1203 = 1024;
			}

			if (var17 == 1) {
				field1204 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method487() {
		field1191++;
		method453(true);
		method534(true);
		method453(false);
		method534(false);
		method556();
		method511();

		if (!field1205) {
			int var1 = field1174;
			if (field1435 / 256 > var1) {
				var1 = field1435 / 256;
			}

			if (field1401[4] && field1425[4] + 128 > var1) {
				var1 = field1425[4] + 128;
			}

			int var2 = field1175 + field1093 & 0x7FF;
			method431(var1, method513(field1207.field361, field1207.field360, field1285) - 50, var1 * 3 + 600, field1313, var2, field1314);
		}

		int var3;
		if (field1205) {
			var3 = method435();
		} else {
			var3 = method434();
		}

		int var4 = field1238;
		int var5 = field1239;
		int var6 = field1240;
		int var7 = field1241;
		int var8 = field1242;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1401[var9]) {
				int var10 = (int) (Math.random() * (field1339[var9] * 2 + 1) + Math.sin(field1116[var9] / 100.0D * field1286[var9]) * field1425[var9] - field1339[var9]);
				if (var9 == 0) {
					field1238 += var10;
				}

				if (var9 == 1) {
					field1239 += var10;
				}

				if (var9 == 2) {
					field1240 += var10;
				}

				if (var9 == 3) {
					field1242 = field1242 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1241 += var10;
					if (field1241 < 128) {
						field1241 = 128;
					}

					if (field1241 > 383) {
						field1241 = 383;
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
		field1078.method89(field1240, field1238, field1239, field1241, var3, field1242);
		field1078.method64();
		method548();
		method485();
		method488(var11);
		method499();
		field1438.method259(4, 4, field9);
		field1238 = var4;
		field1239 = var5;
		field1240 = var6;
		field1241 = var7;
		field1242 = var8;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method488(int arg0) {
		if (!field1161) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1087 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1230;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1230 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1087 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1230;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1230 = var11;
				class34.method171(24);
			}

			if (class34.field592[34] >= arg0) {
				class36 var14 = class34.field586[34];
				int var15 = var14.field606 * var14.field605 - 1;
				int var16 = field1087 * var14.field605 * 2;
				byte[] var17 = var14.field603;
				byte[] var18 = field1230;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field603 = var18;
				field1230 = var17;
				class34.method171(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.t(I)Ljava/lang/String;")
	public final String method489() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method490(String arg0) {
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

	@ObfuscatedName("client.j(B)V")
	public final void method491() {
		if (field1216 == 2) {
			for (class40 var1 = (class40) field1414.method248(); var1 != null; var1 = (class40) field1414.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field645, var1.field647))) {
						method465(var1.field646, var1.field645, var1.field640, var1.field647, var1.field638, var1.field641, var1.field639);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field642, var1.field644)) {
					method465(var1.field643, var1.field642, var1.field640, var1.field644, var1.field638, var1.field641, var1.field639);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method492(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1372; var3++) {
				if (field1257[var3] == arg0) {
					field1372--;
					field1206 = true;

					for (int var4 = var3; var4 < field1372; var4++) {
						field1257[var4] = field1257[var4 + 1];
					}

					field1110.method218(180);
					field1110.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method493() {
		int var1 = field1428;
		int var2 = field1429;
		int var3 = field1430;
		int var4 = field1431;
		int var5 = 0x5D5447;
		class33.method157(var1, var3, var5, var2, var4);
		class33.method157(var1 + 1, var3 - 2, 0, var2 + 1, 16);
		class33.method158(0, var1 + 1, var2 + 18, var3 - 2, var4 - 19);
		field1270.method206(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field17;
		int var7 = field18;
		if (field1427 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1427 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1427 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1443; var8++) {
			int var9 = (field1443 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1270.method210(field1484[var8], var1 + 3, true, var9, var10);
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method494(long arg0) {
		if (arg0 != 0L) {
			if (field1197 >= 100 && field1258 != 1) {
				method503(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field1197 >= 200) {
				method503(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1197; var4++) {
					if (field1397[var4] == arg0) {
						method503(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1372; var5++) {
					if (field1257[var5] == arg0) {
						method503(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field1207.field416)) {
					field1194[field1197] = var3;
					field1397[field1197] = arg0;
					field1424[field1197] = 0;
					field1197++;
					field1206 = true;
					field1110.method218(72);
					field1110.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method495(int arg0) {
		int var2 = class70.field1040[arg0].field1048;
		if (var2 != 0) {
			int var3 = field1075[arg0];
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
				field1109 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1083;

				if (var3 == 0) {
					method471(field1083, 0);
					field1083 = true;
				}

				if (var3 == 1) {
					method471(field1083, -400);
					field1083 = true;
				}

				if (var3 == 2) {
					method471(field1083, -800);
					field1083 = true;
				}

				if (var3 == 3) {
					method471(field1083, -1200);
					field1083 = true;
				}

				if (var3 == 4) {
					field1083 = false;
				}

				if (field1083 != var4 && !field1161) {
					if (field1083) {
						field1283 = field1442;
						field1284 = true;
						field1182.method279(2, field1283);
					} else {
						method464();
					}

					field1327 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1477 = true;
					method553(0);
				}

				if (var3 == 1) {
					field1477 = true;
					method553(-400);
				}

				if (var3 == 2) {
					field1477 = true;
					method553(-800);
				}

				if (var3 == 3) {
					field1477 = true;
					method553(-1200);
				}

				if (var3 == 4) {
					field1477 = false;
				}
			}

			if (var2 == 5) {
				field1121 = var3;
			}

			if (var2 == 6) {
				field1162 = var3;
			}

			if (var2 == 8) {
				field1392 = var3;
				field1165 = true;
			}

			if (var2 == 9) {
				field1069 = var3;
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method496() {
		field1441 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1266) {
				field1355++;
				method486();
				method486();
				method558();
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

		field1441 = false;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field1109 = true;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method497() {
		if (field1451 == 0) {
			field1484[0] = "Cancel";
			field1212[0] = 1106;
			field1443 = 1;
			method502();
			field1092 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1156 == -1) {
					method444();
				} else {
					method475(4, 4, class4.field56[field1156], field18, field17, 0);
				}
			}

			if (field1226 != field1092) {
				field1226 = field1092;
			}

			field1092 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1229 != -1) {
					method475(205, 553, class4.field56[field1229], field18, field17, 0);
				} else if (field1209[field1471] != -1) {
					method475(205, 553, class4.field56[field1209[field1471]], field18, field17, 0);
				}
			}

			if (field1140 != field1092) {
				field1206 = true;
				field1140 = field1092;
			}

			field1092 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1393 != -1) {
					method475(357, 17, class4.field56[field1393], field18, field17, 0);
				} else if (field18 < 434 && field17 < 426) {
					method432(field18 - 357, field17 - 17);
				}
			}

			if (field1393 != -1 && field1261 != field1092) {
				field1165 = true;
				field1261 = field1092;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1443 - 1; var2++) {
					if (field1212[var2] < 1000 && field1212[var2 + 1] > 1000) {
						String var3 = field1484[var2];
						field1484[var2] = field1484[var2 + 1];
						field1484[var2 + 1] = var3;
						int var4 = field1212[var2];
						field1212[var2] = field1212[var2 + 1];
						field1212[var2 + 1] = var4;
						int var5 = field1210[var2];
						field1210[var2] = field1210[var2 + 1];
						field1210[var2 + 1] = var5;
						int var6 = field1211[var2];
						field1211[var2] = field1211[var2 + 1];
						field1211[var2 + 1] = var6;
						int var7 = field1213[var2];
						field1213[var2] = field1213[var2 + 1];
						field1213[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method498() {
		if (field1392 != 0) {
			class37 var1 = field1269;
			int var2 = 0;
			if (field1148 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1169[var3] != null) {
					int var4 = field1167[var3];
					String var5 = field1168[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1199 == 0 || field1199 == 1 && method429(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206(var8, "From", 0, var7);
						var1.method206(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1364[0].method199(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field1364[1].method199(var7 - 12, var11);
							var11 += 14;
						}

						var1.method206(var11, var5 + ": " + field1169[var3], 0, var7);
						var1.method206(var11, var5 + ": " + field1169[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1199 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(4, field1169[var3], 0, var9);
						var1.method206(4, field1169[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1199 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206(4, "To " + var5 + ": " + field1169[var3], 0, var10);
						var1.method206(4, "To " + var5 + ": " + field1169[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method499() {
		method498();

		if (field1099 == 1) {
			field1373[field1098 / 100].method186(field1097 - 8 - 4, field1096 - 8 - 4);
		}

		if (field1099 == 2) {
			field1373[field1098 / 100 + 4].method186(field1097 - 8 - 4, field1096 - 8 - 4);
			field1084++;
			if (field1084 > 57) {
				field1084 = 0;
				field1110.method218(19);
			}
		}

		if (field1462 != -1) {
			method507(field1087, field1462);
			method447(class4.field56[field1462], 0, 0, 0);
		}

		if (field1156 != -1) {
			method507(field1087, field1156);
			method447(class4.field56[field1156], 0, 0, 0);
		}

		method452();

		if (!field1416) {
			method497();
			method524();
		} else if (field1427 == 0) {
			method493();
		}

		if (field1440 == 1) {
			field1446[1].method186(296, 472);
		}

		if (field1433) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1269.method201("Fps:" + field5, var2, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1161) {
				int var7 = 0xFF0000;
			}

			field1269.method201("Mem:" + var5 + "k", var2, var1, 0xFFFF00);
			var2 += 15;
		}

		if (field1148 != 0) {
			int var8 = field1148 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1269.method206(4, "System update in: " + var9 + ":0" + var8, 0xFFFF00, 329);
			} else {
				field1269.method206(4, "System update in: " + var9 + ":" + var8, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.a(IIIZI)Z")
	public final boolean method500(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1078.method80(field1285, arg2, arg1, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1188++;
		if (field1188 > 1086) {
			field1188 = 0;
			field1110.method218(46);
			field1110.method219(0);
			int var9 = field1110.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method220(16791);
			}

			field1110.method219(254);
			field1110.method220((int) (Math.random() * 65536.0D));
			field1110.method220(16128);
			field1110.method220(52610);
			field1110.method220((int) (Math.random() * 65536.0D));
			field1110.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method220(35025);
			}

			field1110.method220(46628);
			field1110.method219((int) (Math.random() * 256.0D));
			field1110.method228(field1110.field621 - var9);
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

			method535(field1207.field410[0], var13, var11, 0, false, 0, arg1, 2, arg2, var12, field1207.field411[0]);
		} else {
			method535(field1207.field410[0], 0, 0, var8, false, var7 + 1, arg1, 2, arg2, 0, field1207.field411[0]);
		}

		field1096 = field24;
		field1097 = field25;
		field1099 = 2;
		field1098 = 0;
		field1110.method218(arg3);
		field1110.method220(field1356 + arg2);
		field1110.method220(field1357 + arg1);
		field1110.method220(var5);
		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method501() {
		for (int var1 = 0; var1 < field1255; var1++) {
			if (field1351[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1186[var1] != field1146 || field1112[var1] != field1082) {
						class38 var3 = class55.method319(field1186[var1], field1112[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1332 / 22 + field1288) {
							field1332 = var3.field621;
							field1288 = System.currentTimeMillis();

							if (method462(var3.field620, var3.field621)) {
								field1146 = field1186[var1];
								field1082 = field1112[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method552()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1351[var1] != -5) {
					field1351[var1] = -5;
				} else {
					field1255--;
					for (int var5 = var1; var5 < field1255; var5++) {
						field1186[var5] = field1186[var5 + 1];
						field1112[var5] = field1112[var5 + 1];
						field1351[var5] = field1351[var5 + 1];
					}

					var1--;
				}
			} else {
				field1351[var1]--;
			}
		}

		if (field1327 > 0) {
			field1327 -= 20;
			if (field1327 < 0) {
				field1327 = 0;
			}

			if (field1327 == 0 && field1083 && !field1161) {
				field1283 = field1442;
				field1284 = true;
				field1182.method279(2, field1283);
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method502() {
		if (field1392 != 0) {
			int var1 = 0;
			if (field1148 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1169[var2] != null) {
					int var3 = field1167[var2];
					String var4 = field1168[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1199 == 0 || field1199 == 1 && method429(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1269.method204("From:  " + var4 + field1169[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1460 >= 1) {
									field1484[field1443] = "Report abuse @whi@" + var4;
									field1212[field1443] = 2524;
									field1443++;
								}

								field1484[field1443] = "Add ignore @whi@" + var4;
								field1212[field1443] = 2047;
								field1443++;
								field1484[field1443] = "Add friend @whi@" + var4;
								field1212[field1443] = 2605;
								field1443++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1199 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;Ljava/lang/String;)V")
	public final void method503(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1308 != -1) {
			field1378 = arg1;
			field23 = 0;
		}

		if (field1393 == -1) {
			field1165 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1167[var4] = field1167[var4 - 1];
			field1168[var4] = field1168[var4 - 1];
			field1169[var4] = field1169[var4 - 1];
		}

		field1167[0] = arg0;
		field1168[0] = arg2;
		field1169[0] = arg1;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method504() {
		if (field1161 && field1216 == 2 && class3.field33 != field1285) {
			field1438.method258();
			field1269.method202(0, 151, 257, "Loading - please wait.");
			field1269.method202(0xFFFFFF, 150, 256, "Loading - please wait.");
			field1438.method259(4, 4, field9);
			field1216 = 1;
			field1377 = System.currentTimeMillis();
		}

		if (field1216 == 1) {
			int var1 = method505();
			if (var1 != 0 && System.currentTimeMillis() - field1377 > 360000L) {
				signlink.reporterror(field1114 + " glcfb " + field1208 + "," + var1 + "," + field1161 + "," + field1361[0] + "," + field1182.method280() + "," + field1285 + "," + field1200 + "," + field1201);
				field1377 = System.currentTimeMillis();
			}
		}

		if (field1216 == 2 && field1285 != field1100) {
			field1100 = field1285;
			method557(field1285);
		}
	}

	@ObfuscatedName("client.y(I)I")
	public final int method505() {
		for (int var1 = 0; var1 < field1244.length; var1++) {
			if (field1244[var1] == null && field1135[var1] != -1) {
				return -1;
			}

			if (field1362[var1] == null && field1136[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1244.length; var3++) {
			byte[] var4 = field1362[var3];
			if (var4 != null) {
				int var5 = (field1134[var3] >> 8) * 64 - field1356;
				int var6 = (field1134[var3] & 0xFF) * 64 - field1357;
				var2 &= class3.method16(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1227) {
			return -4;
		} else {
			field1216 = 2;
			class3.field33 = field1285;
			method451();
			field1110.method218(98);
			return 0;
		}
	}

	@ObfuscatedName("client.a(BIILd;IIZII)V")
	public final void method506(int arg0, int arg1, class4 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (field1123) {
			field1120 = 32;
		} else {
			field1120 = 0;
		}

		field1123 = false;
		if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
			arg2.field76 -= field1456 * 4;

			if (arg5) {
				field1206 = true;
				return;
			}
		} else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg3 + arg4 - 16 && arg0 < arg3 + arg4) {
			arg2.field76 += field1456 * 4;

			if (arg5) {
				field1206 = true;
				return;
			}
		} else if (arg1 >= arg6 - field1120 && arg1 < arg6 + field1120 + 16 && arg0 >= arg3 + 16 && arg0 < arg3 + arg4 - 16 && field1456 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg3 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg2.field76 = (arg7 - arg4) * var10 / var11;

			if (arg5) {
				field1206 = true;
			}

			field1123 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method507(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method507(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method519(var6);
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

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field1246 && !field1077 && !field1264) {
			field1214++;

			if (field1418) {
				method441();
			} else {
				method514();
			}

			method459();
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method508() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1209[0] != -1) {
				field1206 = true;
				field1471 = 0;
				field1310 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1209[1] != -1) {
				field1206 = true;
				field1471 = 1;
				field1310 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1209[2] != -1) {
				field1206 = true;
				field1471 = 2;
				field1310 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1209[3] != -1) {
				field1206 = true;
				field1471 = 3;
				field1310 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1209[4] != -1) {
				field1206 = true;
				field1471 = 4;
				field1310 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1209[5] != -1) {
				field1206 = true;
				field1471 = 5;
				field1310 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1209[6] != -1) {
				field1206 = true;
				field1471 = 6;
				field1310 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1209[7] != -1) {
				field1206 = true;
				field1471 = 7;
				field1310 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1209[8] != -1) {
				field1206 = true;
				field1471 = 8;
				field1310 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1209[9] != -1) {
				field1206 = true;
				field1471 = 9;
				field1310 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1209[10] != -1) {
				field1206 = true;
				field1471 = 10;
				field1310 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1209[11] != -1) {
				field1206 = true;
				field1471 = 11;
				field1310 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1209[12] != -1) {
				field1206 = true;
				field1471 = 12;
				field1310 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1209[13] != -1) {
				field1206 = true;
				field1471 = 13;
				field1310 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public static final void method509() {
		class18.field258 = false;
		class34.field573 = false;
		field1161 = false;
		class3.field32 = false;
		class57.field822 = false;
	}

	@ObfuscatedName("client.a(ZI)V")
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

	@ObfuscatedName("client.A(I)V")
	public final void method511() {
		for (class32 var1 = (class32) field1091.method248(); var1 != null; var1 = (class32) field1091.method250()) {
			if (field1285 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1214 >= var1.field555) {
				var1.method151(field1087);

				if (var1.field562) {
					var1.method106();
				} else {
					field1078.method61(0, 60, var1.field559, false, var1, var1.field556, var1.field558, -1, var1.field557);
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method512() {
		for (int var1 = -1; var1 < field1128; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1126;
			} else {
				var2 = field1129[var1];
			}

			class27 var3 = field1127[var2];
			if (var3 != null) {
				method538(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method513(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1107[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field1483[var6][var4][var5] + field1483[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1483[var6][var4][var5 + 1] + field1483[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method514() {
		if (field1185 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1185 = 3;
				field1385 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1311 = "";
				field1312 = "Enter your username & password.";
				field1185 = 2;
				field1385 = 0;
			}
		} else if (field1185 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1385 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1385 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1296 = 0;
				method521(field1114, field1115, false);

				if (field1418) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1185 = 0;
				field1114 = "";
				field1115 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1281.length(); var10++) {
					if (var8 == field1281.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1385 == 0) {
					if (var8 == 8 && field1114.length() > 0) {
						field1114 = field1114.substring(0, field1114.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1385 = 1;
					}

					if (var9) {
						field1114 = field1114 + (char) var8;
					}

					if (field1114.length() > 12) {
						field1114 = field1114.substring(0, 12);
					}
				} else if (field1385 == 1) {
					if (var8 == 8 && field1115.length() > 0) {
						field1115 = field1115.substring(0, field1115.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1385 = 0;
					}

					if (var9) {
						field1115 = field1115 + (char) var8;
					}

					if (field1115.length() > 20) {
						field1115 = field1115.substring(0, 20);
					}
				}
			}
		} else if (field1185 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1185 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method515(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1484[field1443] = "Remove @whi@" + arg0.field97;
				field1212[field1443] = 884;
				field1443++;
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

		field1484[field1443] = "Remove @whi@" + field1194[var2];
		field1212[field1443] = 513;
		field1443++;
		field1484[field1443] = "Message @whi@" + field1194[var2];
		field1212[field1443] = 902;
		field1443++;
		return true;
	}

	@ObfuscatedName("client.a(BLlb;I)V")
	public final void method516(class38 arg0, int arg1) {
		int var3 = arg0.method240(8);
		if (var3 < field1128) {
			for (int var4 = var3; var4 < field1128; var4++) {
				field1154[field1153++] = field1129[var4];
			}
		}

		if (var3 > field1128) {
			signlink.reporterror(field1114 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1128 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1129[var5];
			class27 var7 = field1127[var6];
			int var8 = arg0.method240(1);
			if (var8 == 0) {
				field1129[field1128++] = var6;
				var7.field405 = field1214;
			} else {
				int var9 = arg0.method240(2);
				if (var9 == 0) {
					field1129[field1128++] = var6;
					var7.field405 = field1214;
					field1131[field1130++] = var6;
				} else if (var9 == 1) {
					field1129[field1128++] = var6;
					var7.field405 = field1214;
					int var10 = arg0.method240(3);
					var7.method111(false, var10);
					int var11 = arg0.method240(1);
					if (var11 == 1) {
						field1131[field1130++] = var6;
					}
				} else if (var9 == 2) {
					field1129[field1128++] = var6;
					var7.field405 = field1214;
					int var12 = arg0.method240(3);
					var7.method111(true, var12);
					int var13 = arg0.method240(3);
					var7.method111(true, var13);
					int var14 = arg0.method240(1);
					if (var14 == 1) {
						field1131[field1130++] = var6;
					}
				} else if (var9 == 3) {
					field1154[field1153++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method517() {
		field1265 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1419[var1] = -1;
			for (int var2 = 0; var2 < class64.field978; var2++) {
				if (!class64.field979[var2].field985 && class64.field979[var2].field980 == var1 + (field1076 ? 0 : 7)) {
					field1419[var1] = var2;
					break;
				}
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;ILjava/lang/String;II)Lxb;")
	public final class50 method518(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1361[0] != null) {
				var6 = field1361[0].method291(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1166.reset();
			field1166.update(var6);
			int var8 = (int) field1166.getValue();
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
				DataInputStream var14 = method531(arg0 + arg4);
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
						method13(arg3, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1361[0] != null) {
						field1361[0].method292(var6.length, var6, arg1);
					}
				} catch (Exception var28) {
					field1361[0] = null;
				}

				if (var6 != null) {
					field1166.reset();
					field1166.update(var6);
					int var23 = (int) field1166.getValue();
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

				field1476 = !field1476;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method519(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method448(var2, arg0);
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

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method520(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method521(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1311 = "";
				field1312 = "Connecting to server...";
				method536(true);
			}

			field1459 = new class5(method560(field1159 + 43594), this);
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1110.field621 = 0;
			field1110.method219(14);
			field1110.method219(var6);
			field1459.method42(field1110.field620, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field1459.method39();
			}

			int var8 = field1459.method39();
			int var9 = var8;

			if (var8 == 0) {
				field1459.method41(field1215.field620, 0, 8);
				field1215.field621 = 0;
				field1208 = field1215.method235();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1208 >> 32), (int) field1208 };
				field1110.field621 = 0;
				field1110.method219(10);
				field1110.method223(var10[0]);
				field1110.method223(var10[1]);
				field1110.method223(var10[2]);
				field1110.method223(var10[3]);
				field1110.method223(signlink.uid);
				field1110.method226(arg0);
				field1110.method226(arg1);
				field1110.method244(field1426, field1402);
				field1157.field621 = 0;

				if (arg2) {
					field1157.method219(18);
				} else {
					field1157.method219(16);
				}

				field1157.method219(field1110.field621 + 36 + 1 + 1 + 2);
				field1157.method219(255);
				field1157.method220(300);
				field1157.method219(field1161 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field1157.method223(field1245[var11]);
				}

				field1157.method227(0, field1110.field620, field1110.field621);
				field1110.field625 = new class49(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field1155 = new class49(var10);
				field1459.method42(field1157.field620, field1157.field621, 0);
				var8 = field1459.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method521(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1460 = field1459.method39();
				field1195 = field1459.method39() == 1;
				field1434 = 0L;
				field1333 = 0;
				field1196.field871 = 0;
				field14 = true;
				field1360 = true;
				field1418 = true;
				field1110.field621 = 0;
				field1215.field621 = 0;
				field1465 = -1;
				field1117 = -1;
				field1118 = -1;
				field1119 = -1;
				field1464 = 0;
				field1466 = 0;
				field1148 = 0;
				field1468 = 0;
				field1413 = 0;
				field1443 = 0;
				field1416 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field1169[var13] = null;
				}

				field1298 = 0;
				field1368 = 0;
				field1216 = 0;
				field1255 = 0;
				field1142 = (int) (Math.random() * 100.0D) - 50;
				field1469 = (int) (Math.random() * 110.0D) - 55;
				field1093 = (int) (Math.random() * 80.0D) - 40;
				field1178 = (int) (Math.random() * 120.0D) - 60;
				field1444 = (int) (Math.random() * 30.0D) - 20;
				field1175 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1326 = 0;
				field1100 = -1;
				field1473 = 0;
				field1474 = 0;
				field1128 = 0;
				field1406 = 0;

				for (int var14 = 0; var14 < field1125; var14++) {
					field1127[var14] = null;
					field1132[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field1405[var15] = null;
				}

				field1207 = field1127[field1126] = new class27();
				field1461.method252();
				field1091.method252();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field1272[var16][var17][var18] = null;
						}
					}
				}

				field1414 = new class41();
				field1198 = 0;
				field1197 = 0;
				field1308 = -1;
				field1393 = -1;
				field1156 = -1;
				field1229 = -1;
				field1462 = -1;
				field1231 = false;
				field1471 = 3;
				field1190 = false;
				field1416 = false;
				field1363 = false;
				field1378 = null;
				field1440 = 0;
				field1163 = -1;
				field1076 = true;
				method517();

				for (int var19 = 0; var19 < 5; var19++) {
					field1458[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field1352[var20] = null;
					field1353[var20] = false;
				}

				field1309 = 0;
				field1328 = 0;
				field1287 = 0;
				field1124 = 0;
				field1101 = 0;
				field1289 = 0;
				field1482 = 0;
				field1336 = 0;
				field1386 = 0;
				method460();
			} else if (var8 == 3) {
				field1311 = "";
				field1312 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1311 = "Your account has been disabled.";
				field1312 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1311 = "Your account is already logged in.";
				field1312 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1311 = "RuneScape has been updated!";
				field1312 = "Please reload this page.";
			} else if (var8 == 7) {
				field1311 = "This world is full.";
				field1312 = "Please use a different world.";
			} else if (var8 == 8) {
				field1311 = "Unable to connect.";
				field1312 = "Login server offline.";
			} else if (var8 == 9) {
				field1311 = "Login limit exceeded.";
				field1312 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1311 = "Unable to connect.";
				field1312 = "Bad session id.";
			} else if (var8 == 11) {
				field1312 = "Login server rejected session.";
				field1312 = "Please try again.";
			} else if (var8 == 12) {
				field1311 = "You need a members account to login to this world.";
				field1312 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1311 = "Could not complete login.";
				field1312 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1311 = "The server is being updated.";
				field1312 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1418 = true;
				field1110.field621 = 0;
				field1215.field621 = 0;
				field1465 = -1;
				field1117 = -1;
				field1118 = -1;
				field1119 = -1;
				field1464 = 0;
				field1466 = 0;
				field1148 = 0;
				field1443 = 0;
				field1416 = false;
				field1377 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1311 = "Login attempts exceeded.";
				field1312 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1311 = "You are standing in a members-only area.";
				field1312 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1311 = "Invalid loginserver requested";
				field1312 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field1459.method39(); var21 >= 0; var21--) {
					field1311 = "You have only just left another world";
					field1312 = "Your profile will be transferred in: " + var21 + " seconds";
					method536(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method521(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field1311 = "Unexpected server response";
				field1312 = "Please try using a different world.";
			} else if (var9 != 0) {
				field1311 = "No response from server";
				field1312 = "Please try using a different world.";
			} else if (field1296 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field1296++;
				method521(arg0, arg1, arg2);
			} else {
				field1311 = "No response from loginserver";
				field1312 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field1311 = "";
			field1312 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method522(long arg0) {
		if (arg0 != 0L) {
			if (field1372 >= 100) {
				method503(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1372; var4++) {
					if (field1257[var4] == arg0) {
						method503(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1197; var5++) {
					if (field1397[var5] == arg0) {
						method503(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field1257[field1372++] = arg0;
				field1206 = true;
				field1110.method218(131);
				field1110.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method523() {
		if (field1326 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1178 + field1175 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1444 + 256) * var4 >> 8;
				var5 = (field1444 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1207.field360 + var6 >> 7;
				int var9 = field1207.field361 - var7 >> 7;
				boolean var10 = method535(field1207.field410[0], 0, 0, 0, true, 0, var9, 1, var8, 0, field1207.field411[0]);
				if (var10) {
					field1110.method219(var1);
					field1110.method219(var2);
					field1110.method220(field1175);
					field1110.method219(57);
					field1110.method219(field1178);
					field1110.method219(field1444);
					field1110.method219(89);
					field1110.method220(field1207.field360);
					field1110.method220(field1207.field361);
					field1110.method219(field1394);
					field1110.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method524() {
		if (field1443 >= 2 || field1298 != 0 || field1368 != 0) {
			String var1;
			if (field1298 == 1 && field1443 < 2) {
				var1 = "Use " + field1302 + " with...";
			} else if (field1368 == 1 && field1443 < 2) {
				var1 = field1371 + "...";
			} else {
				var1 = field1484[field1443 - 1];
			}

			if (field1443 > 2) {
				var1 = var1 + "@whi@ / " + (field1443 - 2) + " more options";
			}

			field1270.method211(field1214 / 1000, 0xFFFFFF, 15, var1, true, 4);
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method525(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1212[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public final void method526(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1130; var3++) {
			int var4 = field1131[var3];
			class27 var5 = field1127[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method229() << 8;
			}

			method483(var5, arg0, var4, var6);
		}
	}

	@ObfuscatedName("client.a(B[BZ)V")
	public final void method527(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method528() {
		try {
			int var1 = field1207.field360 + field1142;
			int var2 = field1207.field361 + field1469;
			if (field1313 - var1 < -500 || field1313 - var1 > 500 || field1314 - var2 < -500 || field1314 - var2 > 500) {
				field1313 = var1;
				field1314 = var2;
			}

			if (field1313 != var1) {
				field1313 += (var1 - field1313) / 16;
			}

			if (field1314 != var2) {
				field1314 += (var2 - field1314) / 16;
			}

			if (field27[1] == 1) {
				field1176 += (-field1176 - 24) / 2;
			} else if (field27[2] == 1) {
				field1176 += (24 - field1176) / 2;
			} else {
				field1176 /= 2;
			}

			if (field27[3] == 1) {
				field1177 += (12 - field1177) / 2;
			} else if (field27[4] == 1) {
				field1177 += (-field1177 - 12) / 2;
			} else {
				field1177 /= 2;
			}

			field1175 = field1176 / 2 + field1175 & 0x7FF;
			field1174 += field1177 / 2;
			if (field1174 < 128) {
				field1174 = 128;
			}

			if (field1174 > 383) {
				field1174 = 383;
			}

			int var3 = field1313 >> 7;
			int var4 = field1314 >> 7;
			int var5 = method513(field1314, field1313, field1285);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1285;
						if (var9 < 3 && (field1107[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1483[var9][var7][var8];
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

			if (var11 > field1435) {
				field1435 += (var11 - field1435) / 24;
			} else if (var11 < field1435) {
				field1435 += (var11 - field1435) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1207.field360 + "," + field1207.field361 + "," + field1313 + "," + field1314 + "," + field1200 + "," + field1201 + "," + field1356 + "," + field1357);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method529() {
		field1436.method258();
		class34.field584 = field1409;
		field1234.method199(0, 0);

		if (field1229 != -1) {
			method447(class4.field56[field1229], 0, 0, 0);
		} else if (field1209[field1471] != -1) {
			method447(class4.field56[field1209[field1471]], 0, 0, 0);
		}

		if (field1416 && field1427 == 1) {
			method493();
		}

		field1436.method259(205, 553, field9);
		field1438.method258();
		class34.field584 = field1410;
	}

	@ObfuscatedName("client.F(I)Z")
	public final boolean method530() {
		if (field1459 == null) {
			return false;
		}

		try {
			int var1 = field1459.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1465 == -1) {
				field1459.method41(field1215.field620, 0, 1);
				field1465 = field1215.field620[0] & 0xFF;
				if (field1155 != null) {
					field1465 = field1465 - field1155.method295() & 0xFF;
				}

				field1464 = class61.field959[field1465];
				var1--;
			}

			if (field1464 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1459.method41(field1215.field620, 0, 1);
				field1464 = field1215.field620[0] & 0xFF;
				var1--;
			}

			if (field1464 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1459.method41(field1215.field620, 0, 2);
				field1215.field621 = 0;
				field1464 = field1215.method231();
				var1 -= 2;
			}

			if (var1 < field1464) {
				return false;
			}

			field1215.field621 = 0;
			field1459.method41(field1215.field620, 0, field1464);
			field1466 = 0;
			field1119 = field1118;
			field1118 = field1117;
			field1117 = field1465;

			if (field1465 == 242) {
				field1080 = field1215.method229();
				field1081 = field1215.method229();
				for (int var2 = field1080; var2 < field1080 + 8; var2++) {
					for (int var3 = field1081; var3 < field1081 + 8; var3++) {
						if (field1272[field1285][var2][var3] != null) {
							field1272[field1285][var2][var3] = null;
							method470(var2, var3);
						}
					}
				}

				for (class40 var4 = (class40) field1414.method248(); var4 != null; var4 = (class40) field1414.method250()) {
					if (var4.field640 >= field1080 && var4.field640 < field1080 + 8 && var4.field641 >= field1081 && var4.field641 < field1081 + 8 && field1285 == var4.field638) {
						var4.field649 = 0;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 185) {
				int var5 = field1215.method231();
				String var6 = field1215.method236();
				class4.field56[var5].field97 = var6;

				if (field1209[field1471] == class4.field56[var5].field62) {
					field1206 = true;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 213) {
				int var7 = field1215.method231();
				class4.field56[var7].field105 = 3;

				if (field1207.field438 == null) {
					class4.field56[var7].field106 = (field1207.field420[11] << 5) + (field1207.field420[8] << 10) + (field1207.field420[0] << 15) + (field1207.field421[0] << 25) + (field1207.field421[4] << 20) + field1207.field420[1];
				} else {
					class4.field56[var7].field106 = (int) (field1207.field438.field880 + 0x12345678L);
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 122) {
				method461(field1215, field1464);
				field1227 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 116) {
				int var8 = field1215.method231();
				int var9 = field1215.method229();
				int var10 = field1215.method231();
				if (field1477 && !field1161 && field1255 < 50) {
					field1186[field1255] = var8;
					field1112[field1255] = var9;
					field1351[field1255] = class55.field790[var8] + var10;
					field1255++;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 167) {
				int var11 = field1215.method231();
				int var12 = field1215.method232();
				class4 var13 = class4.field56[var11];
				var13.field109 = var12;

				if (var12 == -1) {
					var13.field59 = 0;
					var13.field60 = 0;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 214) {
				if (field1471 == 12) {
					field1206 = true;
				}

				field1183 = field1215.method232();
				field1465 = -1;
				return true;
			}

			if (field1465 == 44) {
				field1455 = field1215.method234();
				field1417 = field1215.method231();
				field1273 = field1215.method229();
				field1293 = field1215.method231();
				field1122 = field1215.method229();
				if (field1455 != 0 && field1156 == -1) {
					signlink.dnslookup(class51.method303(field1455));
					method457();
					short var14 = 650;
					if (field1273 != 201 || field1122 == 1) {
						var14 = 655;
					}

					field1237 = "";
					field1472 = false;

					for (int var15 = 0; var15 < class4.field56.length; var15++) {
						if (class4.field56[var15] != null && class4.field56[var15].field65 == var14) {
							field1156 = class4.field56[var15].field62;
							break;
						}
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 236) {
				int var16 = field1215.method231();
				int var17 = field1215.method231();
				int var18 = var17 >> 10 & 0x1F;
				int var19 = var17 >> 5 & 0x1F;
				int var20 = var17 & 0x1F;
				class4.field56[var16].field99 = (var20 << 3) + (var18 << 19) + (var19 << 11);
				field1465 = -1;
				return true;
			}

			if (field1465 == 235) {
				field1206 = true;
				int var21 = field1215.method231();
				class4 var22 = class4.field56[var21];
				int var23 = field1215.method231();
				for (int var24 = 0; var24 < var23; var24++) {
					var22.field57[var24] = field1215.method231();
					int var25 = field1215.method229();
					if (var25 == 255) {
						var25 = field1215.method234();
					}

					var22.field58[var24] = var25;
				}

				for (int var26 = var23; var26 < var22.field57.length; var26++) {
					var22.field57[var26] = 0;
					var22.field58[var26] = 0;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 217) {
				field1206 = true;
				int var27 = field1215.method229();
				int var28 = field1215.method234();
				int var29 = field1215.method229();
				field1379[var27] = var28;
				field1297[var27] = var29;
				field1412[var27] = 1;
				for (int var30 = 0; var30 < 98; var30++) {
					if (var28 >= field1259[var30]) {
						field1412[var27] = var30 + 2;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 107) {
				int var31 = field1215.method232();
				field1308 = var31;
				field1165 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 18) {
				long var32 = field1215.method235();
				int var34 = field1215.method229();
				String var35 = class51.method304(class51.method301(var32));
				for (int var36 = 0; var36 < field1197; var36++) {
					if (field1397[var36] == var32) {
						if (field1424[var36] != var34) {
							field1424[var36] = var34;
							field1206 = true;

							if (var34 > 0) {
								method503(5, var35 + " has logged in.", "");
							}

							if (var34 == 0) {
								method503(5, var35 + " has logged out.", "");
							}
						}

						var35 = null;
						break;
					}
				}

				if (var35 != null && field1197 < 200) {
					field1397[field1197] = var32;
					field1194[field1197] = var35;
					field1424[field1197] = var34;
					field1197++;
					field1206 = true;
				}

				boolean var37 = false;
				while (!var37) {
					var37 = true;
					for (int var38 = 0; var38 < field1197 - 1; var38++) {
						if (field1424[var38] != field1158 && field1424[var38 + 1] == field1158 || field1424[var38] == 0 && field1424[var38 + 1] != 0) {
							int var39 = field1424[var38];
							field1424[var38] = field1424[var38 + 1];
							field1424[var38 + 1] = var39;
							String var40 = field1194[var38];
							field1194[var38] = field1194[var38 + 1];
							field1194[var38 + 1] = var40;
							long var41 = field1397[var38];
							field1397[var38] = field1397[var38 + 1];
							field1397[var38 + 1] = var41;
							field1206 = true;
							var37 = false;
						}
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 127) {
				field1205 = false;

				for (int var43 = 0; var43 < 5; var43++) {
					field1401[var43] = false;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 27) {
				int var44 = field1215.method231();
				int var45 = field1215.method231();
				class4.field56[var44].field105 = 1;
				class4.field56[var44].field106 = var45;
				field1465 = -1;
				return true;
			}

			if (field1465 == 124) {
				field1205 = true;
				field1070 = field1215.method229();
				field1071 = field1215.method229();
				field1072 = field1215.method231();
				field1073 = field1215.method229();
				field1074 = field1215.method229();
				if (field1074 >= 100) {
					int var46 = field1070 * 128 + 64;
					int var47 = field1071 * 128 + 64;
					int var48 = method513(var47, var46, field1285) - field1072;
					int var49 = var46 - field1238;
					int var50 = var48 - field1239;
					int var51 = var47 - field1240;
					int var52 = (int) Math.sqrt(var49 * var49 + var51 * var51);
					field1241 = (int) (Math.atan2(var50, var52) * 325.949D) & 0x7FF;
					field1242 = (int) (Math.atan2(var49, var51) * -325.949D) & 0x7FF;

					if (field1241 < 128) {
						field1241 = 128;
					}

					if (field1241 > 383) {
						field1241 = 383;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 89) {
				int var53 = field1215.method231();
				int var54 = field1215.method232();
				int var55 = field1215.method232();
				class4 var56 = class4.field56[var53];
				var56.field69 = var54;
				var56.field70 = var55;
				field1465 = -1;
				return true;
			}

			if (field1465 == 22) {
				field1144 = field1215.method231();
				field1258 = field1215.method229();
				field1465 = -1;
				return true;
			}

			if (field1465 == 239 || field1465 == 74) {
				int var57 = field1215.method231();
				int var58 = field1215.method231();

				if (field1465 == 74) {
					field1215.method239();

					for (int var59 = 0; var59 < 4; var59++) {
						for (int var60 = 0; var60 < 13; var60++) {
							for (int var61 = 0; var61 < 13; var61++) {
								int var62 = field1215.method240(1);
								if (var62 == 1) {
									field1282[var59][var60][var61] = field1215.method240(26);
								} else {
									field1282[var59][var60][var61] = -1;
								}
							}
						}
					}

					field1215.method241();
				}

				if (field1200 == var57 && field1201 == var58 && field1216 == 2) {
					field1465 = -1;
					return true;
				}

				field1200 = var57;
				field1201 = var58;
				field1356 = (field1200 - 6) * 8;
				field1357 = (field1201 - 6) * 8;
				field1398 = false;
				if ((field1200 / 8 == 48 || field1200 / 8 == 49) && field1201 / 8 == 48) {
					field1398 = true;
				}

				if (field1200 / 8 == 48 && field1201 / 8 == 148) {
					field1398 = true;
				}

				field1216 = 1;
				field1377 = System.currentTimeMillis();
				field1438.method258();
				field1269.method202(0, 151, 257, "Loading - please wait.");
				field1269.method202(0xFFFFFF, 150, 256, "Loading - please wait.");
				field1438.method259(4, 4, field9);

				if (field1465 == 239) {
					int var63 = 0;
					for (int var64 = (field1200 - 6) / 8; var64 <= (field1200 + 6) / 8; var64++) {
						for (int var65 = (field1201 - 6) / 8; var65 <= (field1201 + 6) / 8; var65++) {
							var63++;
						}
					}

					field1244 = new byte[var63][];
					field1362 = new byte[var63][];
					field1134 = new int[var63];
					field1135 = new int[var63];
					field1136 = new int[var63];
					int var66 = 0;
					for (int var67 = (field1200 - 6) / 8; var67 <= (field1200 + 6) / 8; var67++) {
						for (int var68 = (field1201 - 6) / 8; var68 <= (field1201 + 6) / 8; var68++) {
							field1134[var66] = (var67 << 8) + var68;

							if (field1398 && (var68 == 49 || var68 == 149 || var68 == 147 || var67 == 50 || var67 == 49 && var68 == 47)) {
								field1135[var66] = -1;
								field1136[var66] = -1;
								var66++;
							} else {
								int var69 = field1135[var66] = field1182.method274(0, var67, var68);
								if (var69 != -1) {
									field1182.method279(3, var69);
								}

								int var70 = field1136[var66] = field1182.method274(1, var67, var68);
								if (var70 != -1) {
									field1182.method279(3, var70);
								}

								var66++;
							}
						}
					}
				}

				int var71 = field1356 - field1358;
				int var72 = field1357 - field1359;
				field1358 = field1356;
				field1359 = field1357;

				for (int var73 = 0; var73 < 16384; var73++) {
					class26 var74 = field1405[var73];
					if (var74 != null) {
						for (int var75 = 0; var75 < 10; var75++) {
							var74.field410[var75] -= var71;
							var74.field411[var75] -= var72;
						}

						var74.field360 -= var71 * 128;
						var74.field361 -= var72 * 128;
					}
				}

				for (int var76 = 0; var76 < field1125; var76++) {
					class27 var77 = field1127[var76];
					if (var77 != null) {
						for (int var78 = 0; var78 < 10; var78++) {
							var77.field410[var78] -= var71;
							var77.field411[var78] -= var72;
						}

						var77.field360 -= var71 * 128;
						var77.field361 -= var72 * 128;
					}
				}

				field1227 = true;
				byte var79 = 0;
				byte var80 = 104;
				byte var81 = 1;
				if (var71 < 0) {
					var79 = 103;
					var80 = -1;
					var81 = -1;
				}

				byte var82 = 0;
				byte var83 = 104;
				byte var84 = 1;
				if (var72 < 0) {
					var82 = 103;
					var83 = -1;
					var84 = -1;
				}

				for (int var85 = var79; var85 != var80; var85 += var81) {
					for (int var86 = var82; var86 != var83; var86 += var84) {
						int var87 = var71 + var85;
						int var88 = var72 + var86;
						for (int var89 = 0; var89 < 4; var89++) {
							if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
								field1272[var89][var85][var86] = field1272[var89][var87][var88];
							} else {
								field1272[var89][var85][var86] = null;
							}
						}
					}
				}

				for (class40 var90 = (class40) field1414.method248(); var90 != null; var90 = (class40) field1414.method250()) {
					var90.field640 -= var71;
					var90.field641 -= var72;
					if (var90.field640 < 0 || var90.field641 < 0 || var90.field640 >= 104 || var90.field641 >= 104) {
						var90.method106();
					}
				}

				if (field1473 != 0) {
					field1473 -= var71;
					field1474 -= var72;
				}

				field1205 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 109) {
				field1080 = field1215.method229();
				field1081 = field1215.method229();

				while (field1215.field621 < field1464) {
					int var91 = field1215.method229();
					method440(var91, field1215);
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 31) {
				int var92 = field1215.method231();
				if (var92 == 0xFFFF) {
					var92 = -1;
				}

				if (field1442 != var92 && field1083 && !field1161 && field1327 == 0) {
					field1283 = var92;
					field1284 = true;
					field1182.method279(2, field1283);
				}

				field1442 = var92;
				field1465 = -1;
				return true;
			}

			if (field1465 == 218) {
				int var93 = field1215.method231();
				int var94 = field1215.method231();
				if (field1083 && !field1161) {
					field1283 = var93;
					field1284 = false;
					field1182.method279(2, field1283);
					field1327 = var94;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 139) {
				int var95 = field1215.method231();
				int var96 = field1215.method231();
				class4.field56[var95].field105 = 2;
				class4.field56[var95].field106 = var96;
				field1465 = -1;
				return true;
			}

			if (field1465 == 24) {
				int var97 = field1215.method229();
				int var98 = field1215.method229();
				String var99 = field1215.method236();
				if (var97 >= 1 && var97 <= 5) {
					if (var99.equalsIgnoreCase("null")) {
						var99 = null;
					}

					field1352[var97 - 1] = var99;
					field1353[var97 - 1] = var98 == 0;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 132) {
				int var100 = field1215.method232();
				if (var100 >= 0) {
					method510(var100);
				}

				field1462 = var100;
				field1465 = -1;
				return true;
			}

			if (field1465 == 58) {
				method532(field1215, field1464);
				field1465 = -1;
				return true;
			}

			if (field1465 == 162) {
				field1326 = field1215.method229();
				field1465 = -1;
				return true;
			}

			if (field1465 == 169) {
				int var101 = field1215.method231();
				byte var102 = field1215.method230();
				field1145[var101] = var102;

				if (field1075[var101] != var102) {
					field1075[var101] = var102;
					method495(var101);
					field1206 = true;

					if (field1308 != -1) {
						field1165 = true;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 148) {
				for (int var103 = 0; var103 < field1127.length; var103++) {
					if (field1127[var103] != null) {
						field1127[var103].field388 = -1;
					}
				}

				for (int var104 = 0; var104 < field1405.length; var104++) {
					if (field1405[var104] != null) {
						field1405[var104].field388 = -1;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 19 || field1465 == 197 || field1465 == 35 || field1465 == 14 || field1465 == 45 || field1465 == 192 || field1465 == 76 || field1465 == 7 || field1465 == 188 || field1465 == 237 || field1465 == 142) {
				method440(field1465, field1215);
				field1465 = -1;
				return true;
			}

			if (field1465 == 120) {
				int var105 = field1215.method231();
				method510(var105);

				if (field1229 != -1) {
					field1229 = -1;
					field1206 = true;
					field1310 = true;
				}

				field1393 = var105;
				field1165 = true;
				field1156 = -1;
				field1231 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 244) {
				String var106 = field1215.method236();
				if (var106.endsWith(":tradereq:")) {
					String var107 = var106.substring(0, var106.indexOf(":"));
					long var108 = class51.method300(var107);
					boolean var110 = false;
					for (int var111 = 0; var111 < field1372; var111++) {
						if (field1257[var111] == var108) {
							var110 = true;
							break;
						}
					}

					if (!var110 && field1181 == 0) {
						method503(4, "wishes to trade with you.", var107);
					}
				} else if (var106.endsWith(":duelreq:")) {
					String var112 = var106.substring(0, var106.indexOf(":"));
					long var113 = class51.method300(var112);
					boolean var115 = false;
					for (int var116 = 0; var116 < field1372; var116++) {
						if (field1257[var116] == var113) {
							var115 = true;
							break;
						}
					}

					if (!var115 && field1181 == 0) {
						method503(8, "wishes to duel with you.", var112);
					}
				} else if (var106.endsWith(":chalreq:")) {
					String var117 = var106.substring(0, var106.indexOf(":"));
					long var118 = class51.method300(var117);
					boolean var120 = false;
					for (int var121 = 0; var121 < field1372; var121++) {
						if (field1257[var121] == var118) {
							var120 = true;
							break;
						}
					}

					if (!var120 && field1181 == 0) {
						String var122 = var106.substring(var106.indexOf(":") + 1, var106.length() - 9);
						method503(8, var122, var117);
					}
				} else {
					method503(0, var106, "");
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 34) {
				field1473 = 0;
				field1465 = -1;
				return true;
			}

			if (field1465 == 101) {
				field1372 = field1464 / 8;
				for (int var123 = 0; var123 < field1372; var123++) {
					field1257[var123] = field1215.method235();
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 66) {
				int var124 = field1215.method231();
				method510(var124);

				if (field1393 != -1) {
					field1393 = -1;
					field1165 = true;
				}

				if (field1190) {
					field1190 = false;
					field1165 = true;
				}

				field1229 = var124;
				field1206 = true;
				field1310 = true;
				field1156 = -1;
				field1231 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 229) {
				method468();
				field1465 = -1;
				return false;
			}

			if (field1465 == 69) {
				long var125 = field1215.method235();
				int var127 = field1215.method234();
				int var128 = field1215.method229();
				boolean var129 = false;
				for (int var130 = 0; var130 < 100; var130++) {
					if (field1233[var130] == var127) {
						var129 = true;
						break;
					}
				}

				if (var128 <= 1) {
					for (int var131 = 0; var131 < field1372; var131++) {
						if (field1257[var131] == var125) {
							var129 = true;
							break;
						}
					}
				}

				if (!var129 && field1181 == 0) {
					try {
						field1233[field1068] = var127;
						field1068 = (field1068 + 1) % 100;
						String var132 = class52.method306(field1215, field1464 - 13);
						if (var128 != 3) {
							var132 = class71.method401(var132);
						}

						if (var128 == 2 || var128 == 3) {
							method503(7, var132, "@cr2@" + class51.method304(class51.method301(var125)));
						} else if (var128 == 1) {
							method503(7, var132, "@cr1@" + class51.method304(class51.method301(var125)));
						} else {
							method503(3, var132, class51.method304(class51.method301(var125)));
						}
					} catch (Exception var170) {
						signlink.reporterror("cde1");
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 176) {
				field1148 = field1215.method231() * 30;
				field1465 = -1;
				return true;
			}

			if (field1465 == 156) {
				int var134 = field1215.method231();
				int var135 = field1215.method229();

				if (var134 == 0xFFFF) {
					var134 = -1;
				}

				field1209[var135] = var134;
				field1206 = true;
				field1310 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 224) {
				field1198 = field1215.method229();
				field1206 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 42) {
				field1363 = false;
				field1190 = true;
				field1172 = "";
				field1165 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 195) {
				if (field1229 != -1) {
					field1229 = -1;
					field1206 = true;
					field1310 = true;
				}

				if (field1393 != -1) {
					field1393 = -1;
					field1165 = true;
				}

				if (field1190) {
					field1190 = false;
					field1165 = true;
				}

				field1156 = -1;
				field1231 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 228) {
				field1080 = field1215.method229();
				field1081 = field1215.method229();
				field1465 = -1;
				return true;
			}

			if (field1465 == 221) {
				int var136 = field1215.method231();
				int var137 = field1215.method234();
				field1145[var136] = var137;

				if (field1075[var136] != var137) {
					field1075[var136] = var137;
					method495(var136);
					field1206 = true;

					if (field1308 != -1) {
						field1165 = true;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 111) {
				field1471 = field1215.method229();
				field1206 = true;
				field1310 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 180) {
				int var138 = field1215.method231();
				boolean var139 = field1215.method229() == 1;
				class4.field56[var138].field77 = var139;
				field1465 = -1;
				return true;
			}

			if (field1465 == 36) {
				int var140 = field1215.method231();
				int var141 = field1215.method231();
				int var142 = field1215.method231();
				int var143 = field1215.method231();
				class4.field56[var140].field112 = var141;
				class4.field56[var140].field113 = var142;
				class4.field56[var140].field111 = var143;
				field1465 = -1;
				return true;
			}

			if (field1465 == 159) {
				field1440 = field1215.method229();
				field1465 = -1;
				return true;
			}

			if (field1465 == 249) {
				int var144 = field1215.method231();
				int var145 = field1215.method231();
				class4 var146 = class4.field56[var144];
				if (var146 != null && var146.field63 == 0) {
					if (var145 < 0) {
						var145 = 0;
					}

					if (var145 > var146.field75 - var146.field67) {
						var145 = var146.field75 - var146.field67;
					}

					var146.field76 = var145;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 234) {
				int var147 = field1215.method229();
				int var148 = field1215.method229();
				int var149 = field1215.method229();
				int var150 = field1215.method229();
				field1401[var147] = true;
				field1339[var147] = var148;
				field1425[var147] = var149;
				field1116[var147] = var150;
				field1286[var147] = 0;
				field1465 = -1;
				return true;
			}

			if (field1465 == 179) {
				field1404 = field1215.method229();
				field1199 = field1215.method229();
				field1290 = field1215.method229();
				field1090 = true;
				field1165 = true;
				field1465 = -1;
				return true;
			}

			if (field1465 == 16) {
				int var151 = field1215.method231();
				method510(var151);

				if (field1229 != -1) {
					field1229 = -1;
					field1206 = true;
					field1310 = true;
				}

				if (field1393 != -1) {
					field1393 = -1;
					field1165 = true;
				}

				if (field1190) {
					field1190 = false;
					field1165 = true;
				}

				field1156 = var151;
				field1231 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 231) {
				field1413 = field1215.method229();
				if (field1413 == 1) {
					field1294 = field1215.method231();
				}

				if (field1413 >= 2 && field1413 <= 6) {
					if (field1413 == 2) {
						field1279 = 64;
						field1280 = 64;
					}

					if (field1413 == 3) {
						field1279 = 0;
						field1280 = 64;
					}

					if (field1413 == 4) {
						field1279 = 128;
						field1280 = 64;
					}

					if (field1413 == 5) {
						field1279 = 64;
						field1280 = 0;
					}

					if (field1413 == 6) {
						field1279 = 64;
						field1280 = 128;
					}

					field1413 = 2;
					field1276 = field1215.method231();
					field1277 = field1215.method231();
					field1278 = field1215.method229();
				}

				if (field1413 == 10) {
					field1454 = field1215.method231();
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 143) {
				int var152 = field1215.method231();
				int var153 = field1215.method231();
				int var154 = field1215.method231();

				if (var153 == 0xFFFF) {
					class4.field56[var152].field105 = 0;
					field1465 = -1;
					return true;
				}

				class60 var155 = class60.method348(var153);
				class4.field56[var152].field105 = 4;
				class4.field56[var152].field106 = var153;
				class4.field56[var152].field112 = var155.field923;
				class4.field56[var152].field113 = var155.field924;
				class4.field56[var152].field111 = var155.field922 * 100 / var154;
				field1465 = -1;
				return true;
			}

			if (field1465 == 136) {
				for (int var156 = 0; var156 < field1075.length; var156++) {
					if (field1145[var156] != field1075[var156]) {
						field1075[var156] = field1145[var156];
						method495(var156);
						field1206 = true;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 220) {
				field1205 = true;
				field1247 = field1215.method229();
				field1248 = field1215.method229();
				field1249 = field1215.method231();
				field1250 = field1215.method229();
				field1251 = field1215.method229();
				if (field1251 >= 100) {
					field1238 = field1247 * 128 + 64;
					field1240 = field1248 * 128 + 64;
					field1239 = method513(field1240, field1238, field1285) - field1249;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 206) {
				field1206 = true;
				int var157 = field1215.method231();
				class4 var158 = class4.field56[var157];
				while (field1215.field621 < field1464) {
					int var159 = field1215.method243();
					int var160 = field1215.method231();
					int var161 = field1215.method229();
					if (var161 == 255) {
						var161 = field1215.method234();
					}

					if (var159 >= 0 && var159 < var158.field57.length) {
						var158.field57[var159] = var160;
						var158.field58[var159] = var161;
					}
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 189) {
				int var162 = field1215.method231();
				class4 var163 = class4.field56[var162];
				for (int var164 = 0; var164 < var163.field57.length; var164++) {
					var163.field57[var164] = -1;
					var163.field57[var164] = 0;
				}

				field1465 = -1;
				return true;
			}

			if (field1465 == 121) {
				int var165 = field1215.method231();
				int var166 = field1215.method231();

				if (field1393 != -1) {
					field1393 = -1;
					field1165 = true;
				}

				if (field1190) {
					field1190 = false;
					field1165 = true;
				}

				field1156 = var165;
				field1229 = var166;
				field1206 = true;
				field1310 = true;
				field1231 = false;
				field1465 = -1;
				return true;
			}

			if (field1465 == 47) {
				if (field1471 == 12) {
					field1206 = true;
				}

				field1307 = field1215.method229();
				field1465 = -1;
				return true;
			}

			if (field1465 == 247) {
				field1163 = field1215.method229();
				if (field1471 == field1163) {
					if (field1163 == 3) {
						field1471 = 1;
					} else {
						field1471 = 3;
					}

					field1206 = true;
				}

				field1465 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1465 + "," + field1464 + " - " + field1118 + "," + field1119);
			method468();
		} catch (IOException var171) {
			method446();
		} catch (Exception var172) {
			String var168 = "T2 - " + field1465 + "," + field1118 + "," + field1119 + " - " + field1464 + "," + (field1207.field410[0] + field1356) + "," + (field1207.field411[0] + field1357) + " - ";
			for (int var169 = 0; var169 < field1464 && var169 < 50; var169++) {
				var168 = var168 + field1215.field620[var169] + ",";
			}

			signlink.reporterror(var168);
			method468();
		}

		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method531(String arg0) throws IOException {
		if (field1476) {
			if (field1184 != null) {
				try {
					field1184.close();
				} catch (Exception var4) {
				}

				field1184 = null;
			}

			field1184 = method560(43595);
			field1184.setSoTimeout(10000);
			InputStream var2 = field1184.getInputStream();
			OutputStream var3 = field1184.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.c(Llb;II)V")
	public final void method532(class38 arg0, int arg1) {
		field1153 = 0;
		field1130 = 0;
		method551(arg1, arg0);
		method555(arg1, arg0);
		method443(arg0, arg1);

		for (int var3 = 0; var3 < field1153; var3++) {
			int var4 = field1154[var3];
			if (field1214 != field1405[var4].field405) {
				field1405[var4].field415 = null;
				field1405[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1114 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1406; var5++) {
			if (field1405[field1407[var5]] == null) {
				signlink.reporterror(field1114 + " null entry in npc list - pos:" + var5 + " size:" + field1406);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZI)Ljava/lang/String;")
	public static final String method533(int arg0, int arg1) {
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

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1189) {
			field1246 = true;
		} else {
			field1189 = true;
			boolean var1 = false;
			String var2 = method489();
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
						field1361[var3] = new class48(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method550();
					field1062 = method518("title", 1, "title screen", 25, field1245[1]);
					field1268 = new class37("p11_full", field1062, false);
					field1269 = new class37("p12_full", field1062, false);
					field1270 = new class37("b12_full", field1062, false);
					field1271 = new class37("q8_full", field1062, true);
					method455();
					method480();
					class50 var4 = method518("config", 2, "config", 30, field1245[2]);
					class50 var5 = method518("interface", 3, "interface", 35, field1245[3]);
					class50 var6 = method518("media", 4, "2d graphics", 40, field1245[4]);
					class50 var7 = method518("textures", 6, "textures", 45, field1245[6]);
					class50 var8 = method518("wordenc", 7, "chat system", 50, field1245[7]);
					class50 var9 = method518("sounds", 8, "sound effects", 55, field1245[8]);
					field1107 = new byte[4][104][104];
					field1483 = new int[4][105][105];
					field1078 = new class18(104, 4, field1483, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1411[var10] = new class62(104, 104);
					}

					field1475 = new class35(512, 512);
					class50 var11 = method518("versionlist", 5, "update list", 60, field1245[5]);
					method13(60, "Connecting to update server");
					field1182 = new class47();
					field1182.method270(var11, this);
					class7.method44(field1182.method273());
					class31.method123(field1182.method272(0), field1182);

					if (!field1161) {
						field1283 = 0;
						try {
							field1283 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1284 = true;
						field1182.method279(2, field1283);

						while (field1182.method280() > 0) {
							method459();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1182.field738 > 3) {
								method490("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1182.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1182.method279(1, var13);
					}

					while (field1182.method280() > 0) {
						int var14 = var12 - field1182.method280();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method459();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1182.field738 > 3) {
							method490("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1182.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1182.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1182.method279(0, var16);
						}
					}

					int var18 = field1182.method280();
					while (field1182.method280() > 0) {
						int var19 = var18 - field1182.method280();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method459();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1361[0] != null) {
						method13(75, "Requesting maps");
						field1182.method279(3, field1182.method274(0, 47, 48));
						field1182.method279(3, field1182.method274(1, 47, 48));
						field1182.method279(3, field1182.method274(0, 48, 48));
						field1182.method279(3, field1182.method274(1, 48, 48));
						field1182.method279(3, field1182.method274(0, 49, 48));
						field1182.method279(3, field1182.method274(1, 49, 48));
						field1182.method279(3, field1182.method274(0, 47, 47));
						field1182.method279(3, field1182.method274(1, 47, 47));
						field1182.method279(3, field1182.method274(0, 48, 47));
						field1182.method279(3, field1182.method274(1, 48, 47));
						field1182.method279(3, field1182.method274(0, 48, 148));
						field1182.method279(3, field1182.method274(1, 48, 148));
						int var20 = field1182.method280();
						while (field1182.method280() > 0) {
							int var21 = var20 - field1182.method280();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method459();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1182.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1182.method277(var23);
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
							field1182.method282(var25, var23, 0);
						}
					}

					field1182.method275(field1160);

					if (!field1161) {
						int var26 = field1182.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1182.method278(var27)) {
								field1182.method282((byte) 1, var27, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1234 = new class36(var6, "invback", 0);
					field1236 = new class36(var6, "chatback", 0);
					field1235 = new class36(var6, "mapback", 0);
					field1382 = new class36(var6, "backbase1", 0);
					field1383 = new class36(var6, "backbase2", 0);
					field1384 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1202[var28] = new class36(var6, "sideicons", var28);
					}

					field1150 = new class35(var6, "compass", 0);
					field1173 = new class35(var6, "mapedge", 0);
					field1173.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1365[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1141[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1380[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1446[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1085 = new class35(var6, "mapmarker", 0);
					field1086 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1373[var33] = new class35(var6, "cross", var33);
					}

					field1102 = new class35(var6, "mapdots", 0);
					field1103 = new class35(var6, "mapdots", 1);
					field1104 = new class35(var6, "mapdots", 2);
					field1105 = new class35(var6, "mapdots", 3);
					field1106 = new class35(var6, "mapdots", 4);
					field1088 = new class36(var6, "scrollbar", 0);
					field1089 = new class36(var6, "scrollbar", 1);
					field1387 = new class36(var6, "redstone1", 0);
					field1388 = new class36(var6, "redstone2", 0);
					field1389 = new class36(var6, "redstone3", 0);
					field1390 = new class36(var6, "redstone1", 0);
					field1390.method196();
					field1391 = new class36(var6, "redstone2", 0);
					field1391.method196();
					field1063 = new class36(var6, "redstone1", 0);
					field1063.method197();
					field1064 = new class36(var6, "redstone2", 0);
					field1064.method197();
					field1065 = new class36(var6, "redstone3", 0);
					field1065.method197();
					field1066 = new class36(var6, "redstone1", 0);
					field1066.method196();
					field1066.method197();
					field1067 = new class36(var6, "redstone2", 0);
					field1067.method196();
					field1067.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1364[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1317 = new class43(var35.field597, var35.field598, method11());
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1318 = new class43(var36.field597, var36.field598, method11());
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1319 = new class43(var37.field597, var37.field598, method11());
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1320 = new class43(var38.field597, var38.field598, method11());
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1321 = new class43(var39.field597, var39.field598, method11());
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1322 = new class43(var40.field597, var40.field598, method11());
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1323 = new class43(var41.field597, var41.field598, method11());
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1324 = new class43(var42.field597, var42.field598, method11());
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1325 = new class43(var43.field597, var43.field598, method11());
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1141[var48] != null) {
							field1141[var48].method182(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field1365[var48] != null) {
							field1365[var48].method198(var46 + var47, var44 + var47, var45 + var47);
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
					class60.field915 = field1160;

					if (!field1161) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1268, field1269, field1270, field1271 };
					class4.method32(var5, var6, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1235.field603[field1235.field605 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1133[var52] = var53;
						field1338[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1235.field603[field1235.field605 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1376[var56 - 5] = var57 - 25;
						field1079[var56 - 5] = var58 - var57;
					}

					class34.method166(479, 96);
					field1408 = class34.field584;
					class34.method166(190, 261);
					field1409 = class34.field584;
					class34.method166(512, 334);
					field1410 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(500, 800, 334, 512, var60);
					class71.method391(var8);
					field1196 = new class58(this);
					method12(field1196, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field874 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1340 + " " + field1111);
					field1077 = true;
				}
			} else {
				field1264 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method534(boolean arg0) {
		for (int var2 = 0; var2 < field1406; var2++) {
			class26 var3 = field1405[field1407[var2]];
			int var4 = (field1407[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field901 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1295[var5][var6] == field1191) {
							continue;
						}

						field1295[var5][var6] = field1191;
					}

					field1078.method61(var3.field362, (var3.field364 - 1) * 64 + 60, method513(var3.field361, var3.field360, field1285), var3.field363, var3, field1285, var3.field361, var4, var3.field360);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZIIIIBII)Z")
	public final boolean method535(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1395[var14][var15] = 0;
				field1137[var14][var15] = 99999999;
			}
		}

		int var16 = arg0;
		int var17 = arg10;
		field1395[arg0][arg10] = 99;
		field1137[arg0][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1291[var18] = arg0;
		int var35 = var18 + 1;
		field1292[var18] = arg10;
		boolean var20 = false;
		int var21 = field1291.length;
		int[][] var22 = field1411[field1285].field964;
		while (var35 != var19) {
			var16 = field1291[var19];
			var17 = field1292[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg6 == var17) {
				var20 = true;
				break;
			}

			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && field1411[field1285].method368(var16, arg3, var17, arg5 - 1, arg6, arg8)) {
					var20 = true;
					break;
				}

				if (arg5 < 10 && field1411[field1285].method369(var16, arg5 - 1, var17, arg6, arg3, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg9 != 0 && field1411[field1285].method370(var16, arg1, arg8, arg6, arg9, arg2, var17)) {
				var20 = true;
				break;
			}

			int var23 = field1137[var16][var17] + 1;
			if (var16 > 0 && field1395[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1291[var35] = var16 - 1;
				field1292[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1395[var16 - 1][var17] = 2;
				field1137[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1395[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1291[var35] = var16 + 1;
				field1292[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1395[var16 + 1][var17] = 8;
				field1137[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1395[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1291[var35] = var16;
				field1292[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1395[var16][var17 - 1] = 1;
				field1137[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1395[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1291[var35] = var16;
				field1292[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1395[var16][var17 + 1] = 4;
				field1137[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1395[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1291[var35] = var16 - 1;
				field1292[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1395[var16 - 1][var17 - 1] = 3;
				field1137[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1395[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1291[var35] = var16 + 1;
				field1292[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1395[var16 + 1][var17 - 1] = 9;
				field1137[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1395[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1291[var35] = var16 - 1;
				field1292[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1395[var16 - 1][var17 + 1] = 6;
				field1137[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1395[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1291[var35] = var16 + 1;
				field1292[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1395[var16 + 1][var17 + 1] = 12;
				field1137[var16 + 1][var17 + 1] = var23;
			}
		}

		field1394 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg6 - var25; var27 <= arg6 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1137[var26][var27] < var24) {
								var24 = field1137[var26][var27];
								var16 = var26;
								var17 = var27;
								field1394 = 1;
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
		field1291[var28] = var16;
		int var36 = var28 + 1;
		field1292[var28] = var17;
		int var29;
		int var30 = var29 = field1395[var16][var17];
		while (arg0 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1291[var36] = var16;
				field1292[var36++] = var17;
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

			var30 = field1395[var16][var17];
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
		int var32 = field1291[var36];
		int var33 = field1292[var36];

		if (arg7 == 0) {
			field1110.method218(102);
			field1110.method219(var31 + var31 + 3);
		}

		if (arg7 == 1) {
			field1110.method218(170);
			field1110.method219(var31 + var31 + 3 + 14);
		}

		if (arg7 == 2) {
			field1110.method218(15);
			field1110.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1110.method219(1);
		} else {
			field1110.method219(0);
		}

		field1110.method220(field1356 + var32);
		field1110.method220(field1357 + var33);
		field1473 = field1291[0];
		field1474 = field1292[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1110.method219(field1291[var36] - var32);
			field1110.method219(field1292[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method536(boolean arg0) {
		method439();
		field1219.method258();
		field1170.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1185 == 0) {
			int var4 = var3 / 2 + 80;
			field1268.method203(var4, 0x75A9A9, true, var2 / 2, field1182.field732);
			int var5 = var3 / 2 - 20;
			field1270.method203(var5, 0xFFFF00, true, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1171.method199(var7 - 20, var6 - 73);
			field1270.method203(var7 + 5, 0xFFFFFF, true, var6, "New User");
			int var8 = var2 / 2 + 80;
			field1171.method199(var7 - 20, var8 - 73);
			field1270.method203(var7 + 5, 0xFFFFFF, true, var8, "Existing User");
		}

		if (field1185 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1311.length() > 0) {
				field1270.method203(var9 - 15, 0xFFFF00, true, var2 / 2, field1311);
				field1270.method203(var9, 0xFFFF00, true, var2 / 2, field1312);
				var9 += 30;
			} else {
				field1270.method203(var9 - 7, 0xFFFF00, true, var2 / 2, field1312);
				var9 += 30;
			}

			field1270.method210("Username: " + field1114 + (field1385 == 0 & field1214 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, true, var9, 0xFFFFFF);
			var9 += 15;
			field1270.method210("Password: " + class51.method305(field1115) + (field1385 == 1 & field1214 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, true, var9, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1171.method199(var11 - 20, var10 - 73);
				field1270.method203(var11 + 5, 0xFFFFFF, true, var10, "Login");
				int var12 = var2 / 2 + 80;
				field1171.method199(var11 - 20, var12 - 73);
				field1270.method203(var11 + 5, 0xFFFFFF, true, var12, "Cancel");
			}
		}

		if (field1185 == 3) {
			field1270.method203(var3 / 2 - 60, 0xFFFF00, true, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field1270.method203(var13, 0xFFFFFF, true, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field1270.method203(var13, 0xFFFFFF, true, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field1270.method203(var13, 0xFFFFFF, true, var2 / 2, "and choose the red 'create account'");
			var13 += 15;
			field1270.method203(var13, 0xFFFFFF, true, var2 / 2, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1171.method199(var15 - 20, var14 - 73);
			field1270.method203(var15 + 5, 0xFFFFFF, true, var14, "Cancel");
		}

		field1219.method259(171, 202, field9);

		if (field1109) {
			field1109 = false;
			field1217.method259(0, 128, field9);
			field1218.method259(371, 202, field9);
			field1222.method259(265, 0, field9);
			field1223.method259(265, 562, field9);
			field1224.method259(171, 128, field9);
			field1225.method259(171, 562, field9);
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method537() {
		for (int var1 = 0; var1 < field1406; var1++) {
			int var2 = field1407[var1];
			class26 var3 = field1405[var2];
			if (var3 != null) {
				method538(var3, var3.field415.field883);
			}
		}
	}

	@ObfuscatedName("client.a(Ly;II)V")
	public final void method538(class25 arg0, int arg1) {
		if (arg0.field360 < 128 || arg0.field361 < 128 || arg0.field360 >= 13184 || arg0.field361 >= 13184) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (field1207 == arg0 && (arg0.field360 < 1536 || arg0.field361 < 1536 || arg0.field360 >= 11776 || arg0.field361 >= 11776)) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (arg0.field402 > field1214) {
			method539(arg0);
		} else if (arg0.field403 >= field1214) {
			method540(arg0);
		} else {
			method541(arg0);
		}

		method542(arg0);
		method543(arg0);
	}

	@ObfuscatedName("client.a(ZLy;)V")
	public final void method539(class25 arg0) {
		int var2 = arg0.field402 - field1214;
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
	public final void method540(class25 arg0) {
		if (field1214 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field997[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1214 - arg0.field402;
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

	@ObfuscatedName("client.a(Ly;Z)V")
	public final void method541(class25 arg0) {
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

	@ObfuscatedName("client.b(ZLy;)V")
	public final void method542(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1405[arg0.field382];
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
				if (field1144 == var5) {
					var5 = field1126;
				}

				class27 var6 = field1127[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1356 - field1356) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1357 - field1357) * 64;
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

	@ObfuscatedName("client.c(ZLy;)V")
	public final void method543(class25 arg0) {
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

		if (arg0.field393 != -1 && field1214 >= arg0.field396) {
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
			if (var4.field1009 == 1 && arg0.field414 > 0 && arg0.field402 <= field1214 && arg0.field403 < field1214) {
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

	@ObfuscatedName("client.H(I)V")
	public final void method544() {
		if (field1109) {
			field1109 = false;
			field1317.method259(4, 0, field9);
			field1318.method259(357, 0, field9);
			field1319.method259(4, 722, field9);
			field1320.method259(205, 743, field9);
			field1321.method259(0, 0, field9);
			field1322.method259(4, 516, field9);
			field1323.method259(205, 516, field9);
			field1324.method259(357, 496, field9);
			field1325.method259(338, 0, field9);
			field1206 = true;
			field1165 = true;
			field1310 = true;
			field1090 = true;

			if (field1216 != 2) {
				field1438.method259(4, 4, field9);
				field1437.method259(4, 550, field9);
			}
		}

		if (field1216 == 2) {
			method487();
		}

		if (field1416 && field1427 == 1) {
			field1206 = true;
		}

		if (field1229 != -1) {
			boolean var1 = method507(field1087, field1229);
			if (var1) {
				field1206 = true;
			}
		}

		if (field1481 == 2) {
			field1206 = true;
		}

		if (field1451 == 2) {
			field1206 = true;
		}

		if (field1206) {
			method529();
			field1206 = false;
		}

		if (field1393 == -1) {
			field1415.field76 = field1267 - field1243 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method506(field18 - 357, field17 - 17, field1415, 0, 77, false, 463, field1267);
			}

			int var2 = field1267 - field1415.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1267 - 77) {
				var2 = field1267 - 77;
			}

			if (field1243 != var2) {
				field1243 = var2;
				field1165 = true;
			}
		}

		if (field1393 != -1) {
			boolean var3 = method507(field1087, field1393);
			if (var3) {
				field1165 = true;
			}
		}

		if (field1481 == 3) {
			field1165 = true;
		}

		if (field1451 == 3) {
			field1165 = true;
		}

		if (field1378 != null) {
			field1165 = true;
		}

		if (field1416 && field1427 == 2) {
			field1165 = true;
		}

		if (field1165) {
			method546();
			field1165 = false;
		}

		if (field1216 == 2) {
			method545();
			field1437.method259(4, 550, field9);
		}

		if (field1163 != -1) {
			field1310 = true;
		}

		if (field1310) {
			if (field1163 != -1 && field1471 == field1163) {
				field1163 = -1;
				field1110.method218(83);
				field1110.method219(field1471);
			}

			field1310 = false;
			field1305.method258();
			field1384.method199(0, 0);

			if (field1229 == -1) {
				if (field1209[field1471] != -1) {
					if (field1471 == 0) {
						field1387.method199(10, 22);
					}

					if (field1471 == 1) {
						field1388.method199(8, 54);
					}

					if (field1471 == 2) {
						field1388.method199(8, 82);
					}

					if (field1471 == 3) {
						field1389.method199(8, 110);
					}

					if (field1471 == 4) {
						field1391.method199(8, 153);
					}

					if (field1471 == 5) {
						field1391.method199(8, 181);
					}

					if (field1471 == 6) {
						field1390.method199(9, 209);
					}
				}

				if (field1209[0] != -1 && (field1163 != 0 || field1214 % 20 < 10)) {
					field1202[0].method199(13, 29);
				}

				if (field1209[1] != -1 && (field1163 != 1 || field1214 % 20 < 10)) {
					field1202[1].method199(11, 53);
				}

				if (field1209[2] != -1 && (field1163 != 2 || field1214 % 20 < 10)) {
					field1202[2].method199(11, 82);
				}

				if (field1209[3] != -1 && (field1163 != 3 || field1214 % 20 < 10)) {
					field1202[3].method199(12, 115);
				}

				if (field1209[4] != -1 && (field1163 != 4 || field1214 % 20 < 10)) {
					field1202[4].method199(13, 153);
				}

				if (field1209[5] != -1 && (field1163 != 5 || field1214 % 20 < 10)) {
					field1202[5].method199(11, 180);
				}

				if (field1209[6] != -1 && (field1163 != 6 || field1214 % 20 < 10)) {
					field1202[6].method199(13, 208);
				}
			}

			field1305.method259(160, 516, field9);
			field1304.method258();
			field1383.method199(0, 0);

			if (field1229 == -1) {
				if (field1209[field1471] != -1) {
					if (field1471 == 7) {
						field1063.method199(0, 42);
					}

					if (field1471 == 8) {
						field1064.method199(0, 74);
					}

					if (field1471 == 9) {
						field1064.method199(0, 102);
					}

					if (field1471 == 10) {
						field1065.method199(1, 130);
					}

					if (field1471 == 11) {
						field1067.method199(0, 173);
					}

					if (field1471 == 12) {
						field1067.method199(0, 201);
					}

					if (field1471 == 13) {
						field1066.method199(0, 229);
					}
				}

				if (field1209[8] != -1 && (field1163 != 8 || field1214 % 20 < 10)) {
					field1202[7].method199(2, 74);
				}

				if (field1209[9] != -1 && (field1163 != 9 || field1214 % 20 < 10)) {
					field1202[8].method199(3, 102);
				}

				if (field1209[10] != -1 && (field1163 != 10 || field1214 % 20 < 10)) {
					field1202[9].method199(4, 137);
				}

				if (field1209[11] != -1 && (field1163 != 11 || field1214 % 20 < 10)) {
					field1202[10].method199(2, 174);
				}

				if (field1209[12] != -1 && (field1163 != 12 || field1214 % 20 < 10)) {
					field1202[11].method199(2, 201);
				}

				if (field1209[13] != -1 && (field1163 != 13 || field1214 % 20 < 10)) {
					field1202[12].method199(2, 226);
				}
			}

			field1304.method259(466, 496, field9);
			field1438.method258();
		}

		if (field1090) {
			field1090 = false;
			field1303.method258();
			field1382.method199(0, 0);
			field1269.method203(28, 0xFFFFFF, true, 55, "Public chat");

			if (field1404 == 0) {
				field1269.method203(41, 0xFF00, true, 55, "On");
			}

			if (field1404 == 1) {
				field1269.method203(41, 0xFFFF00, true, 55, "Friends");
			}

			if (field1404 == 2) {
				field1269.method203(41, 0xFF0000, true, 55, "Off");
			}

			if (field1404 == 3) {
				field1269.method203(41, 0xFFFF, true, 55, "Hide");
			}

			field1269.method203(28, 0xFFFFFF, true, 184, "Private chat");

			if (field1199 == 0) {
				field1269.method203(41, 0xFF00, true, 184, "On");
			}

			if (field1199 == 1) {
				field1269.method203(41, 0xFFFF00, true, 184, "Friends");
			}

			if (field1199 == 2) {
				field1269.method203(41, 0xFF0000, true, 184, "Off");
			}

			field1269.method203(28, 0xFFFFFF, true, 324, "Trade/compete");

			if (field1290 == 0) {
				field1269.method203(41, 0xFF00, true, 324, "On");
			}

			if (field1290 == 1) {
				field1269.method203(41, 0xFFFF00, true, 324, "Friends");
			}

			if (field1290 == 2) {
				field1269.method203(41, 0xFF0000, true, 324, "Off");
			}

			field1269.method203(33, 0xFFFFFF, true, 458, "Report abuse");
			field1303.method259(453, 0, field9);
			field1438.method258();
		}

		field1087 = 0;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method545() {
		field1437.method258();

		if (field1326 == 2) {
			byte[] var1 = field1235.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1150.method190(256, field1175, 33, field1338, 0, field1133, 33, 25, 25, 0);
			field1438.method258();
		} else {
			int var5 = field1178 + field1175 & 0x7FF;
			int var6 = field1207.field360 / 32 + 48;
			int var7 = 464 - field1207.field361 / 32;
			field1475.method190(field1444 + 256, var5, 151, field1079, 25, field1376, 146, var7, var6, 5);
			field1150.method190(256, field1175, 33, field1338, 0, field1133, 33, 25, 25, 0);

			for (int var8 = 0; var8 < field1329; var8++) {
				int var9 = field1330[var8] * 4 + 2 - field1207.field360 / 32;
				int var10 = field1331[var8] * 4 + 2 - field1207.field361 / 32;
				method438(field1354[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1272[field1285][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1207.field360 / 32;
						int var15 = var12 * 4 + 2 - field1207.field361 / 32;
						method438(field1102, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field1406; var16++) {
				class26 var17 = field1405[field1407[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field906 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field897) {
						int var19 = var17.field360 / 32 - field1207.field360 / 32;
						int var20 = var17.field361 / 32 - field1207.field361 / 32;
						method438(field1103, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field1128; var21++) {
				class27 var22 = field1127[field1129[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1207.field360 / 32;
					int var24 = var22.field361 / 32 - field1207.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1197; var28++) {
						if (field1397[var28] == var26 && field1424[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field1207.field439 != 0 && var22.field439 != 0 && field1207.field439 == var22.field439) {
						var29 = true;
					}

					if (var25) {
						method438(field1105, var23, var24);
					} else if (var29) {
						method438(field1106, var23, var24);
					} else {
						method438(field1104, var23, var24);
					}
				}
			}

			if (field1413 != 0 && field1214 % 20 < 10) {
				if (field1413 == 1 && field1294 >= 0 && field1294 < field1405.length) {
					class26 var30 = field1405[field1294];
					if (var30 != null) {
						int var31 = var30.field360 / 32 - field1207.field360 / 32;
						int var32 = var30.field361 / 32 - field1207.field361 / 32;
						method458(var32, var31, field1086);
					}
				}

				if (field1413 == 2) {
					int var33 = (field1276 - field1356) * 4 + 2 - field1207.field360 / 32;
					int var34 = (field1277 - field1357) * 4 + 2 - field1207.field361 / 32;
					method458(var34, var33, field1086);
				}

				if (field1413 == 10 && field1454 >= 0 && field1454 < field1127.length) {
					class27 var35 = field1127[field1454];
					if (var35 != null) {
						int var36 = var35.field360 / 32 - field1207.field360 / 32;
						int var37 = var35.field361 / 32 - field1207.field361 / 32;
						method458(var37, var36, field1086);
					}
				}
			}

			if (field1473 != 0) {
				int var38 = field1473 * 4 + 2 - field1207.field360 / 32;
				int var39 = field1474 * 4 + 2 - field1207.field361 / 32;
				method438(field1085, var38, var39);
			}

			class33.method157(97, 3, 0xFFFFFF, 78, 3);
			field1438.method258();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method546() {
		field1439.method258();
		class34.field584 = field1408;
		field1236.method199(0, 0);

		if (field1363) {
			field1270.method202(0, 40, 239, field1061);
			field1270.method202(128, 60, 239, field1396 + "*");
		} else if (field1190) {
			field1270.method202(0, 40, 239, "Enter amount:");
			field1270.method202(128, 60, 239, field1172 + "*");
		} else if (field1378 != null) {
			field1270.method202(0, 40, 239, field1378);
			field1270.method202(128, 60, 239, "Click to continue");
		} else if (field1393 != -1) {
			method447(class4.field56[field1393], 0, 0, 0);
		} else if (field1308 == -1) {
			class37 var1 = field1269;
			int var2 = 0;
			class33.method154(0, 77, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1169[var3] != null) {
					int var4 = field1167[var3];
					int var5 = field1243 + 70 - var2 * 14;
					String var6 = field1168[var3];
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
							var1.method206(4, field1169[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1404 == 0 || field1404 == 1 && method429(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1364[0].method199(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field1364[1].method199(var5 - 12, var8);
								var8 += 14;
							}

							var1.method206(var8, var6 + ":", 0, var5);
							var8 += var1.method204(var6) + 8;
							var1.method206(var8, field1169[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1392 == 0 && (var4 == 7 || field1199 == 0 || field1199 == 1 && method429(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206(var9, "From", 0, var5);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1364[0].method199(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field1364[1].method199(var5 - 12, var11);
								var11 += 14;
							}

							var1.method206(var11, var6 + ":", 0, var5);
							var11 += var1.method204(var6) + 8;
							var1.method206(var11, field1169[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field1290 == 0 || field1290 == 1 && method429(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(4, var6 + " " + field1169[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field1392 == 0 && field1199 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(4, field1169[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field1392 == 0 && field1199 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(4, "To " + var6 + ":", 0, var5);
							var1.method206(var1.method204("To " + var6) + 12, field1169[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field1290 == 0 || field1290 == 1 && method429(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(4, var6 + " " + field1169[var3], 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1267 = var2 * 14 + 7;
			if (field1267 < 78) {
				field1267 = 78;
			}

			method445(463, 0, field1267 - field1243 - 77, field1267, 77);
			String var10;
			if (field1207 == null || field1207.field416 == null) {
				var10 = class51.method304(field1114);
			} else {
				var10 = field1207.field416;
			}

			var1.method206(4, var10 + ":", 0, 90);
			var1.method206(var1.method204(var10 + ": ") + 6, field1095 + "*", 255, 90);
			class33.method160(77, 479, 0, 0);
		} else {
			method447(class4.field56[field1308], 0, 0, 0);
		}

		if (field1416 && field1427 == 2) {
			method493();
		}

		field1439.method259(357, 17, field9);
		field1438.method258();
		class34.field584 = field1410;
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method547(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1197; var3++) {
				if (field1397[var3] == arg0) {
					field1197--;
					field1206 = true;

					for (int var4 = var3; var4 < field1197; var4++) {
						field1194[var4] = field1194[var4 + 1];
						field1424[var4] = field1424[var4 + 1];
						field1397[var4] = field1397[var4 + 1];
					}

					field1110.method218(22);
					field1110.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method548() {
		field1341 = 0;
		for (int var1 = -1; var1 < field1406 + field1128; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1207;
			} else if (var1 < field1128) {
				var2 = field1127[field1129[var1]];
			} else {
				var2 = field1405[field1407[var1 - field1128]];
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

				if (var1 >= field1128) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field904 >= 0 && var7.field904 < field1446.length) {
						method481(var2.field406 + 15, var2);

						if (field1151 > -1) {
							field1446[var7.field904].method186(field1152 - 30, field1151 - 12);
						}
					}

					if (field1413 == 1 && field1407[var1 - field1128] == field1294 && field1214 % 20 < 10) {
						method481(var2.field406 + 15, var2);

						if (field1151 > -1) {
							field1446[2].method186(field1152 - 28, field1151 - 12);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method481(var2.field406 + 15, var2);

						if (field1151 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1446[var6].method186(field1152 - var4, field1151 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1413 == 10 && field1129[var1] == field1454) {
						method481(var2.field406 + 15, var2);

						if (field1151 > -1) {
							field1446[7].method186(field1152 - var4, field1151 - 12);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1128 || field1404 == 0 || field1404 == 3 || field1404 == 1 && method429(((class27) var2).field416))) {
					method481(var2.field406, var2);

					if (field1151 > -1 && field1341 < field1342) {
						field1346[field1341] = field1270.method205(var2.field372) / 2;
						field1345[field1341] = field1270.field617;
						field1343[field1341] = field1151;
						field1344[field1341] = field1152;
						field1347[field1341] = var2.field374;
						field1348[field1341] = var2.field375;
						field1349[field1341] = var2.field373;
						field1350[field1341++] = var2.field372;

						if (field1162 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1345[field1341] += 10;
							field1344[field1341] += 5;
						}

						if (field1162 == 0 && var2.field375 == 4) {
							field1346[field1341] = 60;
						}

						if (field1162 == 0 && var2.field375 == 5) {
							field1345[field1341] += 5;
						}
					}
				}

				if (var2.field379 > field1214) {
					method481(var2.field406 + 15, var2);

					if (field1151 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(field1151 - 15, var8, 0xFF00, field1152 - 3, 5);
						class33.method157(field1151 + var8 - 15, 30 - var8, 0xFF0000, field1152 - 3, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1214) {
						method481(var2.field406 / 2, var2);

						if (field1151 > -1) {
							if (var9 == 1) {
								field1152 -= 20;
							}

							if (var9 == 2) {
								field1151 -= 15;
								field1152 -= 10;
							}

							if (var9 == 3) {
								field1151 += 15;
								field1152 -= 10;
							}

							field1380[var2.field377[var9]].method186(field1152 - 12, field1151 - 12);
							field1268.method202(0, field1152 + 4, field1151, String.valueOf(var2.field376[var9]));
							field1268.method202(0xFFFFFF, field1152 + 3, field1151 - 1, String.valueOf(var2.field376[var9]));
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1341; var10++) {
			int var11 = field1343[var10];
			int var12 = field1344[var10];
			int var13 = field1346[var10];
			int var14 = field1345[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1344[var16] - field1345[var16] && var12 - var14 < field1344[var16] + 2 && var11 - var13 < field1346[var16] + field1343[var16] && var11 + var13 > field1343[var16] - field1346[var16] && field1344[var16] - field1345[var16] < var12) {
						var12 = field1344[var16] - field1345[var16];
						var15 = true;
					}
				}
			}

			field1151 = field1343[var10];
			field1152 = field1344[var10] = var12;
			String var17 = field1350[var10];
			if (field1162 == 0) {
				int var18 = 0xFFFF00;
				if (field1347[var10] < 6) {
					var18 = field1147[field1347[var10]];
				}

				if (field1347[var10] == 6) {
					var18 = field1191 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1347[var10] == 7) {
					var18 = field1191 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1347[var10] == 8) {
					var18 = field1191 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1347[var10] == 9) {
					int var19 = 150 - field1349[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1347[var10] == 10) {
					int var20 = 150 - field1349[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1347[var10] == 11) {
					int var21 = 150 - field1349[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1348[var10] == 0) {
					field1270.method202(0, field1152 + 1, field1151, var17);
					field1270.method202(var18, field1152, field1151, var17);
				}

				if (field1348[var10] == 1) {
					field1270.method207(0, var17, field1152 + 1, field1151, field1191);
					field1270.method207(var18, var17, field1152, field1151, field1191);
				}

				if (field1348[var10] == 2) {
					field1270.method208(field1152 + 1, 0, field1151, var17, field1191);
					field1270.method208(field1152, var18, field1151, var17, field1191);
				}

				if (field1348[var10] == 3) {
					field1270.method209(150 - field1349[var10], field1152 + 1, field1151, field1191, var17, 0);
					field1270.method209(150 - field1349[var10], field1152, field1151, field1191, var17, var18);
				}

				if (field1348[var10] == 4) {
					int var22 = field1270.method205(var17);
					int var23 = (150 - field1349[var10]) * (var22 + 100) / 150;
					class33.method154(field1151 - 50, 334, field1151 + 50, 0);
					field1270.method206(field1151 + 50 - var23, var17, 0, field1152 + 1);
					field1270.method206(field1151 + 50 - var23, var17, var18, field1152);
					class33.method153();
				}

				if (field1348[var10] == 5) {
					int var24 = 150 - field1349[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(0, field1152 + 5, 512, field1152 - field1270.field617 - 1);
					field1270.method202(0, field1152 + var25 + 1, field1151, var17);
					field1270.method202(var18, field1152 + var25, field1151, var17);
					class33.method153();
				}
			} else {
				field1270.method202(0, field1152 + 1, field1151, var17);
				field1270.method202(0xFFFF00, field1152, field1151, var17);
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method549() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1404 = (field1404 + 1) % 4;
				field1090 = true;
				field1165 = true;
				field1110.method218(215);
				field1110.method219(field1404);
				field1110.method219(field1199);
				field1110.method219(field1290);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1199 = (field1199 + 1) % 3;
				field1090 = true;
				field1165 = true;
				field1110.method218(215);
				field1110.method219(field1404);
				field1110.method219(field1199);
				field1110.method219(field1290);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1290 = (field1290 + 1) % 3;
				field1090 = true;
				field1165 = true;
				field1110.method218(215);
				field1110.method219(field1404);
				field1110.method219(field1199);
				field1110.method219(field1290);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1156 == -1) {
					method457();
					field1237 = "";
					field1472 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1254 = field1156 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method503(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method550() {
		int var1 = 5;
		field1245[8] = 0;
		int var2 = 0;
		while (field1245[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method531("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 300);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1245[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1245[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1245[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1245[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1245[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1245[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1245[8] == 0) {
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

				field1476 = !field1476;
			}
		}
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public final void method551(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1406) {
			for (int var4 = var3; var4 < field1406; var4++) {
				field1154[field1153++] = field1407[var4];
			}
		}

		if (var3 > field1406) {
			signlink.reporterror(field1114 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1406 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1407[var5];
			class26 var7 = field1405[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1407[field1406++] = var6;
				var7.field405 = field1214;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1407[field1406++] = var6;
					var7.field405 = field1214;
					field1131[field1130++] = var6;
				} else if (var9 == 1) {
					field1407[field1406++] = var6;
					var7.field405 = field1214;
					int var10 = arg1.method240(3);
					var7.method111(false, var10);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1131[field1130++] = var6;
					}
				} else if (var9 == 2) {
					field1407[field1406++] = var6;
					var7.field405 = field1214;
					int var12 = arg1.method240(3);
					var7.method111(true, var12);
					int var13 = arg1.method240(3);
					var7.method111(true, var13);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1131[field1130++] = var6;
					}
				} else if (var9 == 3) {
					field1154[field1153++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)Z")
	public final boolean method552() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method553(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public final boolean method554(class4 arg0) {
		int var2 = arg0.field65;
		if (field1198 == 2) {
			if (var2 == 201) {
				field1165 = true;
				field1190 = false;
				field1363 = true;
				field1396 = "";
				field1367 = 1;
				field1061 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1165 = true;
				field1190 = false;
				field1363 = true;
				field1396 = "";
				field1367 = 2;
				field1061 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1468 = 250;
			return true;
		}

		if (var2 == 501) {
			field1165 = true;
			field1190 = false;
			field1363 = true;
			field1396 = "";
			field1367 = 4;
			field1061 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1165 = true;
			field1190 = false;
			field1363 = true;
			field1396 = "";
			field1367 = 5;
			field1061 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1419[var3];
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

					if (!class64.field979[var5].field985 && class64.field979[var5].field980 == var3 + (field1076 ? 0 : 7)) {
						break;
					}
				}

				field1419[var3] = var5;
				field1265 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1458[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1256[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1256[var6].length) {
					var8 = 0;
				}
			}

			field1458[var6] = var8;
			field1265 = true;
		}

		if (var2 == 324 && !field1076) {
			field1076 = true;
			method517();
		}

		if (var2 == 325 && field1076) {
			field1076 = false;
			method517();
		}

		if (var2 == 326) {
			field1110.method218(247);
			field1110.method219(field1076 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1110.method219(field1419[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1110.method219(field1458[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1472 = !field1472;
		}

		if (var2 >= 601 && var2 <= 612) {
			method457();

			if (field1237.length() > 0) {
				field1110.method218(217);
				field1110.method225(class51.method300(field1237));
				field1110.method219(var2 - 601);
				field1110.method219(field1472 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public final void method555(int arg0, class38 arg1) {
		while (arg1.field622 + 21 < arg0 * 8) {
			int var3 = arg1.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1405[var3] == null) {
				field1405[var3] = new class26();
			}

			class26 var4 = field1405[var3];
			field1407[field1406++] = var3;
			var4.field405 = field1214;
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
			var4.method110(field1207.field411[0] + var6, var7 == 1, field1207.field410[0] + var5);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1131[field1130++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.q(B)V")
	public final void method556() {
		for (class30 var1 = (class30) field1461.method248(); var1 != null; var1 = (class30) field1461.method250()) {
			if (field1285 != var1.field458 || field1214 > var1.field464) {
				var1.method106();
			} else if (field1214 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1405[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(var2.field360, field1214, method513(var2.field361, var2.field360, var1.field458) - var1.field462, var2.field361);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1144 == var3) {
						var4 = field1207;
					} else {
						var4 = field1127[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(var4.field360, field1214, method513(var4.field361, var4.field360, var1.field458) - var1.field462, var4.field361);
					}
				}

				var1.method121(field1087);
				field1078.method61(var1.field477, 60, (int) var1.field471, false, var1, field1285, (int) var1.field470, -1, (int) var1.field469);
			}
		}

		field1432++;
		if (field1432 > 1174) {
			field1432 = 0;
			field1110.method218(179);
			field1110.method219(0);
			int var5 = field1110.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method220(11499);
			}

			field1110.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method219(94);
			}

			field1110.method220(51693);
			field1110.method219(16);
			field1110.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1110.method219(65);
			}

			field1110.method219((int) (Math.random() * 256.0D));
			field1110.method220(22990);
			field1110.method228(field1110.field621 - var5);
		}
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method557(int arg0) {
		int[] var2 = field1475.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1107[arg0][var7][var5] & 0x18) == 0) {
					field1078.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1107[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1078.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1475.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1107[arg0][var11][var10] & 0x18) == 0) {
					method463(arg0, var10, var9, var8, var11);
				}

				if (arg0 < 3 && (field1107[arg0 + 1][var11][var10] & 0x8) != 0) {
					method463(arg0 + 1, var10, var9, var8, var11);
				}
			}
		}

		field1438.method258();
		field1329 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1078.method79(field1285, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field849;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1411[field1285].field964;
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

						field1354[field1329] = field1141[var15];
						field1330[field1329] = var16;
						field1331[field1329] = var17;
						field1329++;
					}
				}
			}
		}

		field1228++;
		if (field1228 > 112) {
			field1228 = 0;
			field1110.method218(65);
			field1110.method219(50);
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method558() {
		short var1 = 256;

		if (field1203 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1203 > 768) {
					field1420[var2] = method433(field1422[var2], field1421[var2], 1024 - field1203);
				} else if (field1203 > 256) {
					field1420[var2] = field1422[var2];
				} else {
					field1420[var2] = method433(field1421[var2], field1422[var2], 256 - field1203);
				}
			}
		} else if (field1204 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1204 > 768) {
					field1420[var3] = method433(field1423[var3], field1421[var3], 1024 - field1204);
				} else if (field1204 > 256) {
					field1420[var3] = field1423[var3];
				} else {
					field1420[var3] = method433(field1421[var3], field1423[var3], 256 - field1204);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1420[var4] = field1421[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1220.field654[var5] = field1274.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1180[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1262[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1420[var12];
					int var15 = field1220.field654[var7];
					field1220.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1220.method259(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1221.field654[var16] = field1275.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1180[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1262[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1420[var23];
					int var26 = field1221.field654[var18];
					field1221.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1221.method259(0, 637, field9);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;B)V")
	public final void method13(int arg0, String arg1) {
		field1111 = arg0;
		field1340 = arg1;
		method439();

		if (field1062 == null) {
			super.method13(arg0, arg1);
		} else {
			field1219.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1270.method202(0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(0x8C1111, var3 / 2 - 152, var6, 304, 34);
			class33.method158(0, var3 / 2 - 151, var6 + 1, 302, 32);
			class33.method157(var3 / 2 - 150, arg0 * 3, 0x8C1111, var6 + 2, 30);
			class33.method157(arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 0, var6 + 2, 30);
			field1270.method202(0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2, arg1);
			field1219.method259(171, 202, field9);

			if (field1109) {
				field1109 = false;

				if (!field1266) {
					field1220.method259(0, 0, field9);
					field1221.method259(0, 637, field9);
				}

				field1217.method259(0, 128, field9);
				field1218.method259(371, 202, field9);
				field1222.method259(265, 0, field9);
				field1223.method259(265, 562, field9);
				field1224.method259(171, 128, field9);
				field1225.method259(171, 562, field9);
			}
		}
	}

	@ObfuscatedName("client.b(ILd;)V")
	public final void method559(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1198 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1198 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1198 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1197;
				if (field1198 != 2) {
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
					arg0.field97 = field1194[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1197;
			if (field1198 != 2) {
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
				if (field1424[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1424[var2] == field1158) {
					arg0.field97 = "@gre@World-" + (field1424[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1424[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1197;
			if (field1198 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1198 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1198 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1372;
				if (field1198 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1257[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1372 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1214 / 40.0D) * 256.0D) & 0x7FF;

			if (field1265) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1419[var7];
					if (var8 >= 0 && !class64.field979[var8].method377()) {
						return;
					}
				}

				field1265 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1419[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field979[var12].method378();
					}
				}

				class31 var13 = new class31(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1458[var14] != 0) {
						var13.method140(field1256[var14][0], field1256[var14][field1458[var14]]);

						if (var14 == 1) {
							var13.method140(field1400[0], field1400[field1458[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field997[field1207.field365].field999[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field1252 == null) {
				field1252 = arg0.field103;
				field1253 = arg0.field104;
			}

			if (field1076) {
				arg0.field103 = field1253;
			} else {
				arg0.field103 = field1252;
			}
		} else if (var2 == 325) {
			if (field1252 == null) {
				field1252 = arg0.field103;
				field1253 = arg0.field104;
			}

			if (field1076) {
				arg0.field103 = field1252;
			} else {
				arg0.field103 = field1253;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1237;
			if (field1214 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1460 < 1) {
				arg0.field97 = "";
			} else if (field1472) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1455 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1417 == 0) {
					var15 = "earlier today";
				} else if (field1417 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1417 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1293 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1293 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1293 > 1) {
				arg0.field97 = field1293 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1273 == 201) {
				if (field1122 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1273 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1273 == 0) {
					var16 = "Earlier today";
				} else if (field1273 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1273 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1273 == 201) {
				if (field1122 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1273 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1273 == 201) {
				if (field1122 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1273 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.M(I)Ljava/net/Socket;")
	public final Socket method560(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.N(I)V")
	public final void method561() {
		field1266 = false;
		while (field1441) {
			field1266 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1170 = null;
		field1171 = null;
		field1149 = null;
		field1420 = null;
		field1421 = null;
		field1422 = null;
		field1423 = null;
		field1334 = null;
		field1335 = null;
		field1262 = null;
		field1263 = null;
		field1274 = null;
		field1275 = null;
	}

	public final void init() {
		field1158 = Integer.parseInt(getParameter("nodeid"));
		field1159 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method456();
		} else {
			method509();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1160 = false;
		} else {
			field1160 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.a(IIIIIIIIZI)V")
	public final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1414.method248(); var11 != null; var11 = (class40) field1414.method250()) {
			if (var11.field638 == arg8 && var11.field640 == arg1 && var11.field641 == arg4 && var11.field639 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg8;
			var10.field639 = arg2;
			var10.field640 = arg1;
			var10.field641 = arg4;
			method436(var10);
			field1414.method245(var10);
		}

		var10.field645 = arg5;
		var10.field647 = arg3;
		var10.field646 = arg7;
		var10.field648 = arg0;
		var10.field649 = arg6;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1192[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1259[var3] = var2 / 4;
		}
	}
}
