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
	public boolean field1074 = false;

	@ObfuscatedName("client.bb")
	public int field1075;

	@ObfuscatedName("client.cb")
	public class35[] field1076 = new class35[100];

	@ObfuscatedName("client.db")
	public int[] field1077 = new int[500];

	@ObfuscatedName("client.eb")
	public int[] field1078 = new int[500];

	@ObfuscatedName("client.fb")
	public int[] field1079 = new int[500];

	@ObfuscatedName("client.gb")
	public int[] field1080 = new int[500];

	@ObfuscatedName("client.hb")
	public int field1081;

	@ObfuscatedName("client.jb")
	public class36[] field1082 = new class36[2];

	@ObfuscatedName("client.kb")
	public class36 field1083;

	@ObfuscatedName("client.lb")
	public class36 field1084;

	@ObfuscatedName("client.mb")
	public class36 field1085;

	@ObfuscatedName("client.nb")
	public class36 field1086;

	@ObfuscatedName("client.ob")
	public class36 field1087;

	@ObfuscatedName("client.pb")
	public int field1088;

	@ObfuscatedName("client.qb")
	public int field1089;

	@ObfuscatedName("client.rb")
	public int field1090;

	@ObfuscatedName("client.sb")
	public int field1091 = 78;

	@ObfuscatedName("client.tb")
	public int[] field1092 = new int[151];

	@ObfuscatedName("client.ub")
	public static int field1093;

	@ObfuscatedName("client.vb")
	public int[][][] field1094;

	@ObfuscatedName("client.xb")
	public int[][][] field1095 = new int[4][13][13];

	@ObfuscatedName("client.yb")
	public static int field1096;

	@ObfuscatedName("client.ac")
	public boolean[] field1121 = new boolean[5];

	@ObfuscatedName("client.bc")
	public int field1122 = 0x4D4233;

	@ObfuscatedName("client.cc")
	public int field1123;

	@ObfuscatedName("client.dc")
	public int field1124 = 2;

	@ObfuscatedName("client.ec")
	public class48[] field1125 = new class48[5];

	@ObfuscatedName("client.fc")
	public int field1126;

	@ObfuscatedName("client.gc")
	public int field1127 = 0x332D25;

	@ObfuscatedName("client.ic")
	public int field1128;

	@ObfuscatedName("client.kc")
	public int field1129;

	@ObfuscatedName("client.lc")
	public int field1130;

	@ObfuscatedName("client.mc")
	public boolean field1131 = false;

	@ObfuscatedName("client.nc")
	public int[][] field1132 = new int[104][104];

	@ObfuscatedName("client.oc")
	public class41[][][] field1133 = new class41[4][104][104];

	@ObfuscatedName("client.pc")
	public long[] field1134 = new long[200];

	@ObfuscatedName("client.qc")
	public int field1135;

	@ObfuscatedName("client.rc")
	public int field1136;

	@ObfuscatedName("client.sc")
	public int field1137;

	@ObfuscatedName("client.M")
	public int field1061 = -1;

	@ObfuscatedName("client.X")
	public final int[] field1071 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Y")
	public int field1072 = -1;

	@ObfuscatedName("client.Z")
	public int[] field1073 = new int[2000];

	@ObfuscatedName("client.Fb")
	public class38 field1102 = class38.method217(1);

	@ObfuscatedName("client.Gb")
	public boolean field1103 = false;

	@ObfuscatedName("client.Qb")
	public int field1111 = 1;

	@ObfuscatedName("client.Rb")
	public String[] field1112 = new String[200];

	@ObfuscatedName("client.Tb")
	public int[] field1114 = new int[50];

	@ObfuscatedName("client.Ub")
	public int[] field1115 = new int[class67.field1013];

	@ObfuscatedName("client.Zb")
	public String[] field1120 = new String[5];

	@ObfuscatedName("client.Cc")
	public boolean field1146 = true;

	@ObfuscatedName("client.Fc")
	public int[] field1148 = new int[50];

	@ObfuscatedName("client.Gc")
	public boolean field1149 = false;

	@ObfuscatedName("client.Hc")
	public String field1150 = "";

	@ObfuscatedName("client.Ic")
	public class62[] field1151 = new class62[4];

	@ObfuscatedName("client.Vc")
	public boolean field1164 = false;

	@ObfuscatedName("client.ed")
	public int field1172 = -1;

	@ObfuscatedName("client.jd")
	public class4 field1177 = new class4();

	@ObfuscatedName("client.kd")
	public CRC32 field1178 = new CRC32();

	@ObfuscatedName("client.ld")
	public int[] field1179 = new int[9];

	@ObfuscatedName("client.md")
	public int field1180 = -1;

	@ObfuscatedName("client.nd")
	public int field1181 = -1;

	@ObfuscatedName("client.rd")
	public boolean field1185 = false;

	@ObfuscatedName("client.vd")
	public boolean field1189 = false;

	@ObfuscatedName("client.xd")
	public boolean field1190 = false;

	@ObfuscatedName("client.Ad")
	public int[] field1193 = new int[1000];

	@ObfuscatedName("client.Bd")
	public int[] field1194 = new int[1000];

	@ObfuscatedName("client.Dd")
	public String field1195 = "";

	@ObfuscatedName("client.Ed")
	public int field1196 = 0x766654;

	@ObfuscatedName("client.Gd")
	public boolean field1198 = false;

	@ObfuscatedName("client.Kd")
	public boolean[] field1200 = new boolean[5];

	@ObfuscatedName("client.Nd")
	public int[] field1202 = new int[100];

	@ObfuscatedName("client.Od")
	public String[] field1203 = new String[100];

	@ObfuscatedName("client.Pd")
	public String[] field1204 = new String[100];

	@ObfuscatedName("client.Vd")
	public class35[] field1210 = new class35[20];

	@ObfuscatedName("client.ce")
	public boolean field1217 = false;

	@ObfuscatedName("client.ee")
	public int field1219 = 0x23201B;

	@ObfuscatedName("client.fe")
	public int[] field1220 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.he")
	public int field1222 = -1;

	@ObfuscatedName("client.pe")
	public class41 field1230 = new class41();

	@ObfuscatedName("client.Fe")
	public boolean field1246 = true;

	@ObfuscatedName("client.He")
	public boolean field1248 = false;

	@ObfuscatedName("client.Je")
	public int[] field1250 = new int[1000];

	@ObfuscatedName("client.cf")
	public int field1269 = 3;

	@ObfuscatedName("client.df")
	public int field1270 = -1;

	@ObfuscatedName("client.ff")
	public int field1272 = 128;

	@ObfuscatedName("client.kf")
	public int[] field1276 = new int[5];

	@ObfuscatedName("client.of")
	public int field1280 = 1;

	@ObfuscatedName("client.Df")
	public int[] field1292 = new int[4000];

	@ObfuscatedName("client.Ef")
	public int[] field1293 = new int[4000];

	@ObfuscatedName("client.Kf")
	public boolean field1299 = false;

	@ObfuscatedName("client.Lf")
	public int[] field1300 = new int[5];

	@ObfuscatedName("client.Mf")
	public int[] field1301 = new int[class67.field1013];

	@ObfuscatedName("client.Pf")
	public int field1303 = 2;

	@ObfuscatedName("client.bg")
	public class35[] field1315 = new class35[1000];

	@ObfuscatedName("client.fg")
	public class35[] field1319 = new class35[20];

	@ObfuscatedName("client.hg")
	public int[] field1320 = new int[7];

	@ObfuscatedName("client.jg")
	public int[] field1321 = new int[5];

	@ObfuscatedName("client.pg")
	public int[][] field1327 = new int[104][104];

	@ObfuscatedName("client.wg")
	public int[] field1334 = new int[33];

	@ObfuscatedName("client.xg")
	public class36[] field1335 = new class36[100];

	@ObfuscatedName("client.yg")
	public String[] field1336 = new String[500];

	@ObfuscatedName("client.Mg")
	public boolean field1346 = true;

	@ObfuscatedName("client.Ng")
	public int[] field1347 = new int[151];

	@ObfuscatedName("client.Qg")
	public boolean field1350 = false;

	@ObfuscatedName("client.Rg")
	public int[] field1351 = new int[5];

	@ObfuscatedName("client.Vg")
	public class38 field1354 = class38.method217(1);

	@ObfuscatedName("client.Wg")
	public String field1355 = "";

	@ObfuscatedName("client.Xg")
	public int[] field1356 = new int[256];

	@ObfuscatedName("client.ch")
	public final int field1361 = 100;

	@ObfuscatedName("client.dh")
	public int[] field1362 = new int[100];

	@ObfuscatedName("client.fh")
	public String field1364 = "";

	@ObfuscatedName("client.gh")
	public String field1365 = "";

	@ObfuscatedName("client.mh")
	public class38 field1371 = class38.method217(1);

	@ObfuscatedName("client.rh")
	public int field1375 = 50;

	@ObfuscatedName("client.sh")
	public int[] field1376 = new int[field1375];

	@ObfuscatedName("client.th")
	public int[] field1377 = new int[field1375];

	@ObfuscatedName("client.uh")
	public int[] field1378 = new int[field1375];

	@ObfuscatedName("client.vh")
	public int[] field1379 = new int[field1375];

	@ObfuscatedName("client.wh")
	public int[] field1380 = new int[field1375];

	@ObfuscatedName("client.xh")
	public int[] field1381 = new int[field1375];

	@ObfuscatedName("client.yh")
	public int[] field1382 = new int[field1375];

	@ObfuscatedName("client.zh")
	public String[] field1383 = new String[field1375];

	@ObfuscatedName("client.Eh")
	public boolean field1388 = true;

	@ObfuscatedName("client.Jh")
	public boolean field1392 = false;

	@ObfuscatedName("client.Lh")
	public boolean field1394 = true;

	@ObfuscatedName("client.Mh")
	public int field1395 = -1;

	@ObfuscatedName("client.Nh")
	public class41 field1396 = new class41();

	@ObfuscatedName("client.Qh")
	public int[] field1398 = new int[200];

	@ObfuscatedName("client.Rh")
	public int[] field1399 = new int[class67.field1013];

	@ObfuscatedName("client.Th")
	public boolean field1401 = false;

	@ObfuscatedName("client.di")
	public int[] field1407 = new int[33];

	@ObfuscatedName("client.fi")
	public class41 field1408 = new class41();

	@ObfuscatedName("client.gi")
	public boolean field1409 = false;

	@ObfuscatedName("client.ji")
	public int[] field1411 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.li")
	public boolean field1413 = false;

	@ObfuscatedName("client.mi")
	public String field1414 = "";

	@ObfuscatedName("client.ni")
	public String field1415 = "";

	@ObfuscatedName("client.oi")
	public int field1416 = -1;

	@ObfuscatedName("client.pi")
	public int field1417 = -1;

	@ObfuscatedName("client.qi")
	public class36[] field1418 = new class36[13];

	@ObfuscatedName("client.vi")
	public int field1423 = 2;

	@ObfuscatedName("client.wi")
	public boolean field1424 = false;

	@ObfuscatedName("client.yi")
	public boolean field1426 = false;

	@ObfuscatedName("client.zi")
	public int[][] field1427 = new int[104][104];

	@ObfuscatedName("client.Bi")
	public boolean field1429 = false;

	@ObfuscatedName("client.Ci")
	public int field1430 = 2048;

	@ObfuscatedName("client.Di")
	public int field1431 = 2047;

	@ObfuscatedName("client.Ei")
	public class27[] field1432 = new class27[field1430];

	@ObfuscatedName("client.Gi")
	public int[] field1434 = new int[field1430];

	@ObfuscatedName("client.Ii")
	public int[] field1436 = new int[field1430];

	@ObfuscatedName("client.Ji")
	public class38[] field1437 = new class38[field1430];

	@ObfuscatedName("client.Wi")
	public boolean field1447 = false;

	@ObfuscatedName("client.Xi")
	public int[] field1448 = new int[5];

	@ObfuscatedName("client.jj")
	public boolean field1458 = false;

	@ObfuscatedName("client.lj")
	public String field1460 = "";

	@ObfuscatedName("client.mj")
	public String field1461 = "";

	@ObfuscatedName("client.oj")
	public int field1462 = -1;

	@ObfuscatedName("client.qj")
	public class35[] field1464 = new class35[8];

	@ObfuscatedName("client.tj")
	public byte[] field1466 = new byte[16384];

	@ObfuscatedName("client.vj")
	public boolean field1468 = false;

	@ObfuscatedName("client.xj")
	public int[] field1469 = new int[50];

	@ObfuscatedName("client.yj")
	public int field1470 = -1;

	@ObfuscatedName("client.zj")
	public int field1471 = -1;

	@ObfuscatedName("client.Cj")
	public boolean field1473 = false;

	@ObfuscatedName("client.Dj")
	public boolean field1474 = false;

	@ObfuscatedName("client.Ej")
	public int[] field1475 = new int[2000];

	@ObfuscatedName("client.Fj")
	public class26[] field1476 = new class26[16384];

	@ObfuscatedName("client.Hj")
	public int[] field1478 = new int[16384];

	@ObfuscatedName("client.Ij")
	public long[] field1479 = new long[100];

	@ObfuscatedName("client.Lj")
	public int field1482 = -1;

	@ObfuscatedName("client.Nb")
	public static BigInteger field1109 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Yc")
	public static String field1166 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.tg")
	public static int[] field1331 = new int[99];

	@ObfuscatedName("client.Hg")
	public static int[] field1343 = new int[32];

	@ObfuscatedName("client.Ug")
	public static BigInteger field1353 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ih")
	public static int field1367 = 10;

	@ObfuscatedName("client.kh")
	public static boolean field1369 = true;

	@ObfuscatedName("client.ai")
	public static final int[][] field1405 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Aj")
	public static final int[] field1472 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Db")
	public int field1100;

	@ObfuscatedName("client.Hb")
	public int field1104;

	@ObfuscatedName("client.Ib")
	public int field1105;

	@ObfuscatedName("client.Pb")
	public int field1110;

	@ObfuscatedName("client.Sb")
	public int field1113;

	@ObfuscatedName("client.Vb")
	public static int field1116;

	@ObfuscatedName("client.Wb")
	public int field1117;

	@ObfuscatedName("client.Yb")
	public int field1119;

	@ObfuscatedName("client.tc")
	public int field1138;

	@ObfuscatedName("client.uc")
	public int field1139;

	@ObfuscatedName("client.vc")
	public int field1140;

	@ObfuscatedName("client.Dc")
	public static int field1147;

	@ObfuscatedName("client.Oc")
	public int field1157;

	@ObfuscatedName("client.Pc")
	public int field1158;

	@ObfuscatedName("client.Qc")
	public int field1159;

	@ObfuscatedName("client.Rc")
	public int field1160;

	@ObfuscatedName("client.Sc")
	public int field1161;

	@ObfuscatedName("client.Tc")
	public int field1162;

	@ObfuscatedName("client.Wc")
	public int field1165;

	@ObfuscatedName("client.Zc")
	public int field1167;

	@ObfuscatedName("client.ad")
	public int field1168;

	@ObfuscatedName("client.bd")
	public int field1169;

	@ObfuscatedName("client.cd")
	public int field1170;

	@ObfuscatedName("client.dd")
	public int field1171;

	@ObfuscatedName("client.gd")
	public int field1174;

	@ObfuscatedName("client.hd")
	public int field1175;

	@ObfuscatedName("client.id")
	public int field1176;

	@ObfuscatedName("client.od")
	public int field1182;

	@ObfuscatedName("client.pd")
	public int field1183;

	@ObfuscatedName("client.qd")
	public int field1184;

	@ObfuscatedName("client.sd")
	public static int field1186;

	@ObfuscatedName("client.yd")
	public int field1191;

	@ObfuscatedName("client.zd")
	public int field1192;

	@ObfuscatedName("client.Fd")
	public int field1197;

	@ObfuscatedName("client.Sd")
	public static int field1207;

	@ObfuscatedName("client.Td")
	public static int field1208;

	@ObfuscatedName("client.ae")
	public static int field1215;

	@ObfuscatedName("client.de")
	public static int field1218;

	@ObfuscatedName("client.ge")
	public int field1221;

	@ObfuscatedName("client.ie")
	public int field1223;

	@ObfuscatedName("client.je")
	public int field1224;

	@ObfuscatedName("client.ke")
	public int field1225;

	@ObfuscatedName("client.me")
	public static int field1227;

	@ObfuscatedName("client.ne")
	public int field1228;

	@ObfuscatedName("client.oe")
	public int field1229;

	@ObfuscatedName("client.qe")
	public int field1231;

	@ObfuscatedName("client.re")
	public int field1232;

	@ObfuscatedName("client.se")
	public static int field1233;

	@ObfuscatedName("client.ye")
	public int field1239;

	@ObfuscatedName("client.ze")
	public int field1240;

	@ObfuscatedName("client.Ae")
	public int field1241;

	@ObfuscatedName("client.Be")
	public int field1242;

	@ObfuscatedName("client.Ce")
	public int field1243;

	@ObfuscatedName("client.Ee")
	public int field1245;

	@ObfuscatedName("client.Ie")
	public int field1249;

	@ObfuscatedName("client.Ke")
	public int field1251;

	@ObfuscatedName("client.Le")
	public int field1252;

	@ObfuscatedName("client.Me")
	public int field1253;

	@ObfuscatedName("client.Ne")
	public int field1254;

	@ObfuscatedName("client.Oe")
	public int field1255;

	@ObfuscatedName("client.Pe")
	public int field1256;

	@ObfuscatedName("client.Qe")
	public int field1257;

	@ObfuscatedName("client.Re")
	public int field1258;

	@ObfuscatedName("client.Se")
	public int field1259;

	@ObfuscatedName("client.Ue")
	public int field1261;

	@ObfuscatedName("client.We")
	public int field1263;

	@ObfuscatedName("client.Xe")
	public int field1264;

	@ObfuscatedName("client.Ye")
	public int field1265;

	@ObfuscatedName("client.Ze")
	public int field1266;

	@ObfuscatedName("client.af")
	public int field1267;

	@ObfuscatedName("client.bf")
	public int field1268;

	@ObfuscatedName("client.ef")
	public int field1271;

	@ObfuscatedName("client.gf")
	public int field1273;

	@ObfuscatedName("client.hf")
	public int field1274;

	@ObfuscatedName("client.jf")
	public int field1275;

	@ObfuscatedName("client.lf")
	public int field1277;

	@ObfuscatedName("client.mf")
	public int field1278;

	@ObfuscatedName("client.nf")
	public int field1279;

	@ObfuscatedName("client.pf")
	public static int field1281;

	@ObfuscatedName("client.zf")
	public static int field1289;

	@ObfuscatedName("client.Af")
	public static int field1290;

	@ObfuscatedName("client.Bf")
	public int field1291;

	@ObfuscatedName("client.Ff")
	public int field1294;

	@ObfuscatedName("client.Gf")
	public int field1295;

	@ObfuscatedName("client.Hf")
	public int field1296;

	@ObfuscatedName("client.If")
	public int field1297;

	@ObfuscatedName("client.Jf")
	public int field1298;

	@ObfuscatedName("client.Of")
	public int field1302;

	@ObfuscatedName("client.Zf")
	public int field1313;

	@ObfuscatedName("client.ag")
	public int field1314;

	@ObfuscatedName("client.cg")
	public int field1316;

	@ObfuscatedName("client.kg")
	public int field1322;

	@ObfuscatedName("client.lg")
	public int field1323;

	@ObfuscatedName("client.mg")
	public int field1324;

	@ObfuscatedName("client.ng")
	public int field1325;

	@ObfuscatedName("client.og")
	public int field1326;

	@ObfuscatedName("client.qg")
	public int field1328;

	@ObfuscatedName("client.zg")
	public int field1337;

	@ObfuscatedName("client.Ag")
	public int field1338;

	@ObfuscatedName("client.Kg")
	public int field1344;

	@ObfuscatedName("client.Lg")
	public int field1345;

	@ObfuscatedName("client.Og")
	public int field1348;

	@ObfuscatedName("client.Pg")
	public int field1349;

	@ObfuscatedName("client.Tg")
	public int field1352;

	@ObfuscatedName("client.bh")
	public static int field1360;

	@ObfuscatedName("client.eh")
	public int field1363;

	@ObfuscatedName("client.hh")
	public int field1366;

	@ObfuscatedName("client.jh")
	public static int field1368;

	@ObfuscatedName("client.nh")
	public static int field1372;

	@ObfuscatedName("client.qh")
	public int field1374;

	@ObfuscatedName("client.Gh")
	public int field1390;

	@ObfuscatedName("client.Kh")
	public int field1393;

	@ObfuscatedName("client.Oh")
	public int field1397;

	@ObfuscatedName("client.ci")
	public int field1406;

	@ObfuscatedName("client.hi")
	public int field1410;

	@ObfuscatedName("client.ki")
	public int field1412;

	@ObfuscatedName("client.ri")
	public int field1419;

	@ObfuscatedName("client.si")
	public int field1420;

	@ObfuscatedName("client.ti")
	public int field1421;

	@ObfuscatedName("client.ui")
	public int field1422;

	@ObfuscatedName("client.Ai")
	public static int field1428;

	@ObfuscatedName("client.Fi")
	public int field1433;

	@ObfuscatedName("client.Hi")
	public int field1435;

	@ObfuscatedName("client.Mi")
	public int field1438;

	@ObfuscatedName("client.Ni")
	public int field1439;

	@ObfuscatedName("client.Oi")
	public int field1440;

	@ObfuscatedName("client.Pi")
	public int field1441;

	@ObfuscatedName("client.Ri")
	public int field1442;

	@ObfuscatedName("client.Si")
	public int field1443;

	@ObfuscatedName("client.Ti")
	public int field1444;

	@ObfuscatedName("client.Ui")
	public int field1445;

	@ObfuscatedName("client.Vi")
	public int field1446;

	@ObfuscatedName("client.aj")
	public int field1449;

	@ObfuscatedName("client.bj")
	public static int field1450;

	@ObfuscatedName("client.cj")
	public int field1451;

	@ObfuscatedName("client.dj")
	public int field1452;

	@ObfuscatedName("client.ej")
	public int field1453;

	@ObfuscatedName("client.gj")
	public int field1455;

	@ObfuscatedName("client.hj")
	public int field1456;

	@ObfuscatedName("client.ij")
	public int field1457;

	@ObfuscatedName("client.kj")
	public int field1459;

	@ObfuscatedName("client.uj")
	public int field1467;

	@ObfuscatedName("client.Gj")
	public int field1477;

	@ObfuscatedName("client.Jj")
	public int field1480;

	@ObfuscatedName("client.Kj")
	public int field1481;

	@ObfuscatedName("client.Nj")
	public int field1484;

	@ObfuscatedName("client.Eb")
	public long field1101;

	@ObfuscatedName("client.uf")
	public long field1286;

	@ObfuscatedName("client.oh")
	public long field1373;

	@ObfuscatedName("client.Sh")
	public long field1400;

	@ObfuscatedName("client.Mj")
	public long field1483;

	@ObfuscatedName("client.xi")
	public class18 field1425;

	@ObfuscatedName("client.Qd")
	public static class27 field1205;

	@ObfuscatedName("client.Jb")
	public class35 field1106;

	@ObfuscatedName("client.Kb")
	public class35 field1107;

	@ObfuscatedName("client.td")
	public class35 field1187;

	@ObfuscatedName("client.ud")
	public class35 field1188;

	@ObfuscatedName("client.Hd")
	public class35 field1199;

	@ObfuscatedName("client.le")
	public class35 field1226;

	@ObfuscatedName("client.te")
	public class35 field1234;

	@ObfuscatedName("client.ue")
	public class35 field1235;

	@ObfuscatedName("client.ve")
	public class35 field1236;

	@ObfuscatedName("client.we")
	public class35 field1237;

	@ObfuscatedName("client.xe")
	public class35 field1238;

	@ObfuscatedName("client.rg")
	public class35 field1329;

	@ObfuscatedName("client.sg")
	public class35 field1330;

	@ObfuscatedName("client.rj")
	public class35 field1465;

	@ObfuscatedName("client.wc")
	public class36 field1141;

	@ObfuscatedName("client.xc")
	public class36 field1142;

	@ObfuscatedName("client.yc")
	public class36 field1143;

	@ObfuscatedName("client.zc")
	public class36 field1144;

	@ObfuscatedName("client.Ac")
	public class36 field1145;

	@ObfuscatedName("client.xf")
	public class36 field1287;

	@ObfuscatedName("client.yf")
	public class36 field1288;

	@ObfuscatedName("client.dg")
	public class36 field1317;

	@ObfuscatedName("client.eg")
	public class36 field1318;

	@ObfuscatedName("client.Cg")
	public class36 field1339;

	@ObfuscatedName("client.Dg")
	public class36 field1340;

	@ObfuscatedName("client.Eg")
	public class36 field1341;

	@ObfuscatedName("client.Uh")
	public class36 field1402;

	@ObfuscatedName("client.Vh")
	public class36 field1403;

	@ObfuscatedName("client.Wh")
	public class36 field1404;

	@ObfuscatedName("client.Wd")
	public class37 field1211;

	@ObfuscatedName("client.Xd")
	public class37 field1212;

	@ObfuscatedName("client.Yd")
	public class37 field1213;

	@ObfuscatedName("client.Zd")
	public class37 field1214;

	@ObfuscatedName("client.O")
	public class43 field1062;

	@ObfuscatedName("client.P")
	public class43 field1063;

	@ObfuscatedName("client.Q")
	public class43 field1064;

	@ObfuscatedName("client.R")
	public class43 field1065;

	@ObfuscatedName("client.S")
	public class43 field1066;

	@ObfuscatedName("client.T")
	public class43 field1067;

	@ObfuscatedName("client.U")
	public class43 field1068;

	@ObfuscatedName("client.V")
	public class43 field1069;

	@ObfuscatedName("client.W")
	public class43 field1070;

	@ObfuscatedName("client.qf")
	public class43 field1282;

	@ObfuscatedName("client.rf")
	public class43 field1283;

	@ObfuscatedName("client.sf")
	public class43 field1284;

	@ObfuscatedName("client.tf")
	public class43 field1285;

	@ObfuscatedName("client.Qf")
	public class43 field1304;

	@ObfuscatedName("client.Rf")
	public class43 field1305;

	@ObfuscatedName("client.Sf")
	public class43 field1306;

	@ObfuscatedName("client.Tf")
	public class43 field1307;

	@ObfuscatedName("client.Uf")
	public class43 field1308;

	@ObfuscatedName("client.Vf")
	public class43 field1309;

	@ObfuscatedName("client.Wf")
	public class43 field1310;

	@ObfuscatedName("client.Xf")
	public class43 field1311;

	@ObfuscatedName("client.Yf")
	public class43 field1312;

	@ObfuscatedName("client.Yg")
	public class43 field1357;

	@ObfuscatedName("client.Zg")
	public class43 field1358;

	@ObfuscatedName("client.ah")
	public class43 field1359;

	@ObfuscatedName("client.Mb")
	public class47 field1108;

	@ObfuscatedName("client.Ge")
	public class49 field1247;

	@ObfuscatedName("client.Fh")
	public class50 field1389;

	@ObfuscatedName("client.Ud")
	public class58 field1209;

	@ObfuscatedName("client.Md")
	public class5 field1201;

	@ObfuscatedName("client.fd")
	public String field1173;

	@ObfuscatedName("client.Te")
	public String field1260;

	@ObfuscatedName("client.Fg")
	public String field1342;

	@ObfuscatedName("client.fj")
	public String field1454;

	@ObfuscatedName("client.Xb")
	public Socket field1118;

	@ObfuscatedName("client.be")
	public static boolean field1216;

	@ObfuscatedName("client.De")
	public static boolean field1244;

	@ObfuscatedName("client.lh")
	public static boolean field1370;

	@ObfuscatedName("client.Hh")
	public static boolean field1391;

	@ObfuscatedName("client.Ab")
	public int[] field1097;

	@ObfuscatedName("client.Bb")
	public int[] field1098;

	@ObfuscatedName("client.Cb")
	public int[] field1099;

	@ObfuscatedName("client.Jc")
	public int[] field1152;

	@ObfuscatedName("client.Kc")
	public int[] field1153;

	@ObfuscatedName("client.Lc")
	public int[] field1154;

	@ObfuscatedName("client.Mc")
	public int[] field1155;

	@ObfuscatedName("client.Nc")
	public int[] field1156;

	@ObfuscatedName("client.ug")
	public int[] field1332;

	@ObfuscatedName("client.vg")
	public int[] field1333;

	@ObfuscatedName("client.Ah")
	public int[] field1384;

	@ObfuscatedName("client.Bh")
	public int[] field1385;

	@ObfuscatedName("client.Ch")
	public int[] field1386;

	@ObfuscatedName("client.Dh")
	public int[] field1387;

	@ObfuscatedName("client.Uc")
	public class36[] field1163;

	@ObfuscatedName("client.Rd")
	public byte[][] field1206;

	@ObfuscatedName("client.Ve")
	public byte[][] field1262;

	@ObfuscatedName("client.pj")
	public byte[][][] field1463;

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1368 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method429(class38 arg0, int arg1) {
		field1249 = 0;
		field1435 = 0;
		method443(arg1, arg0);
		method477(arg1, arg0);
		method508(arg1, arg0);

		for (int var3 = 0; var3 < field1249; var3++) {
			int var4 = field1250[var3];
			if (field1116 != field1476[var4].field405) {
				field1476[var4].field415 = null;
				field1476[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1460 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1477; var5++) {
			if (field1476[field1478[var5]] == null) {
				signlink.reporterror(field1460 + " null entry in npc list - pos:" + var5 + " size:" + field1477);
				throw new RuntimeException("eek");
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a([BIB)Z")
	public final boolean method430(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method431(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method432() {
		try {
			field1180 = -1;
			field1396.method252();
			field1408.method252();
			class34.method167();
			method541();
			field1425.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1151[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(field1094, 104, 104, field1463);
			int var3 = field1206.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1097[var4] >> 8;
				int var6 = field1097[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1425.method51(field1366);
			} else {
				field1425.method51(0);
			}

			field1102.method218(62);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1097[var7] >> 8) * 64 - field1157;
				int var9 = (field1097[var7] & 0xFF) * 64 - field1158;
				byte[] var10 = field1206[var7];
				if (var10 != null) {
					var2.method15(var9, (field1162 - 6) * 8, var8, (field1161 - 6) * 8, var10);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1097[var11] >> 8) * 64 - field1157;
				int var13 = (field1097[var11] & 0xFF) * 64 - field1158;
				byte[] var14 = field1206[var11];
				if (var14 == null && field1162 < 800) {
					var2.method14(var13, 64, 64, var12);
				}
			}

			field1102.method218(62);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1262[var15];
				if (var16 != null) {
					int var17 = (field1097[var15] >> 8) * 64 - field1157;
					int var18 = (field1097[var15] & 0xFF) * 64 - field1158;
					var2.method18(var16, var18, field1151, field1425, var17);
				}
			}

			field1102.method218(62);
			var2.method20(field1425, field1151);
			field1284.method258();
			field1102.method218(62);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method516(var19, var20);
				}
			}

			method521();
		} catch (Exception var33) {
		}

		class57.field866.method103();

		if (field1370 && signlink.cache_dat != null) {
			int var22 = field1108.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1108.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1108.method283();
		int var25 = (field1161 - 6) / 8 - 1;
		int var26 = (field1161 + 6) / 8 + 1;
		int var27 = (field1162 - 6) / 8 - 1;
		int var28 = (field1162 + 6) / 8 + 1;
		if (field1429) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1108.method274(var29, var30, 0);
					if (var31 != -1) {
						field1108.method284(3, var31);
					}

					int var32 = field1108.method274(var29, var30, 1);
					if (var32 != -1) {
						field1108.method284(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method433(boolean arg0) {
		for (int var2 = 0; var2 < field1477; var2++) {
			class26 var3 = field1476[field1478[var2]];
			int var4 = (field1478[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field901 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1427[var5][var6] == field1277) {
							continue;
						}

						field1427[var5][var6] = field1277;
					}

					field1425.method61((var3.field364 - 1) * 64 + 60, var3.field361, var3.field360, method513(field1366, var3.field360, var3.field361), var3, var3.field362, var3.field363, field1366, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method434() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.e(B)Z")
	public final boolean method435() {
		if (field1201 == null) {
			return false;
		}

		try {
			int var1 = field1201.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1295 == -1) {
				field1201.method41(field1354.field620, 0, 1);
				field1295 = field1354.field620[0] & 0xFF;
				if (field1247 != null) {
					field1295 = field1295 - field1247.method295() & 0xFF;
				}

				field1294 = class61.field959[field1295];
				var1--;
			}

			if (field1294 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1201.method41(field1354.field620, 0, 1);
				field1294 = field1354.field620[0] & 0xFF;
				var1--;
			}

			if (field1294 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1201.method41(field1354.field620, 0, 2);
				field1354.field621 = 0;
				field1294 = field1354.method231();
				var1 -= 2;
			}

			if (var1 < field1294) {
				return false;
			}

			field1354.field621 = 0;
			field1201.method41(field1354.field620, 0, field1294);
			field1296 = 0;
			field1176 = field1175;
			field1175 = field1174;
			field1174 = field1295;

			if (field1295 == 162) {
				field1232 = field1354.method229();
				field1295 = -1;
				return true;
			}

			if (field1295 == 24) {
				int var2 = field1354.method229();
				int var3 = field1354.method229();
				String var4 = field1354.method236();
				if (var2 >= 1 && var2 <= 5) {
					if (var4.equalsIgnoreCase("null")) {
						var4 = null;
					}

					field1120[var2 - 1] = var4;
					field1121[var2 - 1] = var3 == 0;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 231) {
				field1113 = field1354.method229();
				if (field1113 == 1) {
					field1484 = field1354.method231();
				}

				if (field1113 >= 2 && field1113 <= 6) {
					if (field1113 == 2) {
						field1242 = 64;
						field1243 = 64;
					}

					if (field1113 == 3) {
						field1242 = 0;
						field1243 = 64;
					}

					if (field1113 == 4) {
						field1242 = 128;
						field1243 = 64;
					}

					if (field1113 == 5) {
						field1242 = 64;
						field1243 = 0;
					}

					if (field1113 == 6) {
						field1242 = 64;
						field1243 = 128;
					}

					field1113 = 2;
					field1239 = field1354.method231();
					field1240 = field1354.method231();
					field1241 = field1354.method229();
				}

				if (field1113 == 10) {
					field1117 = field1354.method231();
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 18) {
				long var5 = field1354.method235();
				int var7 = field1354.method229();
				String var8 = class51.method304(class51.method301(var5));
				for (int var9 = 0; var9 < field1182; var9++) {
					if (field1134[var9] == var5) {
						if (field1398[var9] != var7) {
							field1398[var9] = var7;
							field1164 = true;

							if (var7 > 0) {
								method519(5, var8 + " has logged in.", "");
							}

							if (var7 == 0) {
								method519(5, var8 + " has logged out.", "");
							}
						}

						var8 = null;
						break;
					}
				}

				if (var8 != null && field1182 < 200) {
					field1134[field1182] = var5;
					field1112[field1182] = var8;
					field1398[field1182] = var7;
					field1182++;
					field1164 = true;
				}

				boolean var10 = false;
				while (!var10) {
					var10 = true;
					for (int var11 = 0; var11 < field1182 - 1; var11++) {
						if (field1398[var11] != field1367 && field1398[var11 + 1] == field1367 || field1398[var11] == 0 && field1398[var11 + 1] != 0) {
							int var12 = field1398[var11];
							field1398[var11] = field1398[var11 + 1];
							field1398[var11 + 1] = var12;
							String var13 = field1112[var11];
							field1112[var11] = field1112[var11 + 1];
							field1112[var11 + 1] = var13;
							long var14 = field1134[var11];
							field1134[var11] = field1134[var11 + 1];
							field1134[var11 + 1] = var14;
							field1164 = true;
							var10 = false;
						}
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 116) {
				int var16 = field1354.method231();
				int var17 = field1354.method229();
				int var18 = field1354.method231();
				if (field1346 && !field1370 && field1328 < 50) {
					field1114[field1328] = var16;
					field1469[field1328] = var17;
					field1148[field1328] = class55.field790[var16] + var18;
					field1328++;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 179) {
				field1410 = field1354.method229();
				field1245 = field1354.method229();
				field1349 = field1354.method229();
				field1447 = true;
				field1392 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 36) {
				int var19 = field1354.method231();
				int var20 = field1354.method231();
				int var21 = field1354.method231();
				int var22 = field1354.method231();
				class4.field56[var19].field112 = var20;
				class4.field56[var19].field113 = var21;
				class4.field56[var19].field111 = var22;
				field1295 = -1;
				return true;
			}

			if (field1295 == 249) {
				int var23 = field1354.method231();
				int var24 = field1354.method231();
				class4 var25 = class4.field56[var23];
				if (var25 != null && var25.field63 == 0) {
					if (var24 < 0) {
						var24 = 0;
					}

					if (var24 > var25.field75 - var25.field67) {
						var24 = var25.field75 - var25.field67;
					}

					var25.field76 = var24;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 101) {
				field1337 = field1294 / 8;
				for (int var26 = 0; var26 < field1337; var26++) {
					field1479[var26] = field1354.method235();
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 185) {
				int var27 = field1354.method231();
				String var28 = field1354.method236();
				class4.field56[var27].field97 = var28;

				if (field1411[field1269] == class4.field56[var27].field62) {
					field1164 = true;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 217) {
				field1164 = true;
				int var29 = field1354.method229();
				int var30 = field1354.method234();
				int var31 = field1354.method229();
				field1301[var29] = var30;
				field1115[var29] = var31;
				field1399[var29] = 1;
				for (int var32 = 0; var32 < 98; var32++) {
					if (var30 >= field1331[var32]) {
						field1399[var29] = var32 + 2;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 206) {
				field1164 = true;
				int var33 = field1354.method231();
				class4 var34 = class4.field56[var33];
				while (field1354.field621 < field1294) {
					int var35 = field1354.method243();
					int var36 = field1354.method231();
					int var37 = field1354.method229();
					if (var37 == 255) {
						var37 = field1354.method234();
					}

					if (var35 >= 0 && var35 < var34.field57.length) {
						var34.field57[var35] = var36;
						var34.field58[var35] = var37;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 120) {
				int var38 = field1354.method231();
				method551(var38);

				if (field1061 != -1) {
					field1061 = -1;
					field1164 = true;
					field1409 = true;
				}

				field1181 = var38;
				field1392 = true;
				field1072 = -1;
				field1474 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 229) {
				method450();
				field1295 = -1;
				return false;
			}

			if (field1295 == 159) {
				field1316 = field1354.method229();
				field1295 = -1;
				return true;
			}

			if (field1295 == 69) {
				long var39 = field1354.method235();
				int var41 = field1354.method234();
				int var42 = field1354.method229();
				boolean var43 = false;
				for (int var44 = 0; var44 < 100; var44++) {
					if (field1362[var44] == var41) {
						var43 = true;
						break;
					}
				}

				if (var42 <= 1) {
					for (int var45 = 0; var45 < field1337; var45++) {
						if (field1479[var45] == var39) {
							var43 = true;
							break;
						}
					}
				}

				if (!var43 && field1165 == 0) {
					try {
						field1362[field1271] = var41;
						field1271 = (field1271 + 1) % 100;
						String var46 = class52.method306(field1354, field1294 - 13);
						if (var42 != 3) {
							var46 = class71.method401(var46);
						}

						if (var42 == 2 || var42 == 3) {
							method519(7, var46, "@cr2@" + class51.method304(class51.method301(var39)));
						} else if (var42 == 1) {
							method519(7, var46, "@cr1@" + class51.method304(class51.method301(var39)));
						} else {
							method519(3, var46, class51.method304(class51.method301(var39)));
						}
					} catch (Exception var170) {
						signlink.reporterror("cde1");
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 58) {
				method429(field1354, field1294);
				field1295 = -1;
				return true;
			}

			if (field1295 == 239 || field1295 == 74) {
				int var48 = field1354.method231();
				int var49 = field1354.method231();

				if (field1295 == 74) {
					field1354.method239();

					for (int var50 = 0; var50 < 4; var50++) {
						for (int var51 = 0; var51 < 13; var51++) {
							for (int var52 = 0; var52 < 13; var52++) {
								int var53 = field1354.method240(1);
								if (var53 == 1) {
									field1095[var50][var51][var52] = field1354.method240(26);
								} else {
									field1095[var50][var51][var52] = -1;
								}
							}
						}
					}

					field1354.method241();
				}

				if (field1161 == var48 && field1162 == var49 && field1128 == 2) {
					field1295 = -1;
					return true;
				}

				field1161 = var48;
				field1162 = var49;
				field1157 = (field1161 - 6) * 8;
				field1158 = (field1162 - 6) * 8;
				field1429 = false;
				if ((field1161 / 8 == 48 || field1161 / 8 == 49) && field1162 / 8 == 48) {
					field1429 = true;
				}

				if (field1161 / 8 == 48 && field1162 / 8 == 148) {
					field1429 = true;
				}

				field1128 = 1;
				field1286 = System.currentTimeMillis();
				field1284.method258();
				field1212.method202("Loading - please wait.", 151, 0, 257);
				field1212.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
				field1284.method259(field9, 4, 4);

				if (field1295 == 239) {
					int var54 = 0;
					for (int var55 = (field1161 - 6) / 8; var55 <= (field1161 + 6) / 8; var55++) {
						for (int var56 = (field1162 - 6) / 8; var56 <= (field1162 + 6) / 8; var56++) {
							var54++;
						}
					}

					field1206 = new byte[var54][];
					field1262 = new byte[var54][];
					field1097 = new int[var54];
					field1098 = new int[var54];
					field1099 = new int[var54];
					int var57 = 0;
					for (int var58 = (field1161 - 6) / 8; var58 <= (field1161 + 6) / 8; var58++) {
						for (int var59 = (field1162 - 6) / 8; var59 <= (field1162 + 6) / 8; var59++) {
							field1097[var57] = (var58 << 8) + var59;

							if (field1429 && (var59 == 49 || var59 == 149 || var59 == 147 || var58 == 50 || var58 == 49 && var59 == 47)) {
								field1098[var57] = -1;
								field1099[var57] = -1;
								var57++;
							} else {
								int var60 = field1098[var57] = field1108.method274(var58, var59, 0);
								if (var60 != -1) {
									field1108.method279(3, var60);
								}

								int var61 = field1099[var57] = field1108.method274(var58, var59, 1);
								if (var61 != -1) {
									field1108.method279(3, var61);
								}

								var57++;
							}
						}
					}
				}

				int var62 = field1157 - field1159;
				int var63 = field1158 - field1160;
				field1159 = field1157;
				field1160 = field1158;

				for (int var64 = 0; var64 < 16384; var64++) {
					class26 var65 = field1476[var64];
					if (var65 != null) {
						for (int var66 = 0; var66 < 10; var66++) {
							var65.field410[var66] -= var62;
							var65.field411[var66] -= var63;
						}

						var65.field360 -= var62 * 128;
						var65.field361 -= var63 * 128;
					}
				}

				for (int var67 = 0; var67 < field1430; var67++) {
					class27 var68 = field1432[var67];
					if (var68 != null) {
						for (int var69 = 0; var69 < 10; var69++) {
							var68.field410[var69] -= var62;
							var68.field411[var69] -= var63;
						}

						var68.field360 -= var62 * 128;
						var68.field361 -= var63 * 128;
					}
				}

				field1074 = true;
				byte var70 = 0;
				byte var71 = 104;
				byte var72 = 1;
				if (var62 < 0) {
					var70 = 103;
					var71 = -1;
					var72 = -1;
				}

				byte var73 = 0;
				byte var74 = 104;
				byte var75 = 1;
				if (var63 < 0) {
					var73 = 103;
					var74 = -1;
					var75 = -1;
				}

				for (int var76 = var70; var76 != var71; var76 += var72) {
					for (int var77 = var73; var77 != var74; var77 += var75) {
						int var78 = var62 + var76;
						int var79 = var63 + var77;
						for (int var80 = 0; var80 < 4; var80++) {
							if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
								field1133[var80][var76][var77] = field1133[var80][var78][var79];
							} else {
								field1133[var80][var76][var77] = null;
							}
						}
					}
				}

				for (class40 var81 = (class40) field1230.method248(); var81 != null; var81 = (class40) field1230.method250()) {
					var81.field640 -= var62;
					var81.field641 -= var63;
					if (var81.field640 < 0 || var81.field641 < 0 || var81.field640 >= 104 || var81.field641 >= 104) {
						var81.method106();
					}
				}

				if (field1224 != 0) {
					field1224 -= var62;
					field1225 -= var63;
				}

				field1473 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 242) {
				field1480 = field1354.method229();
				field1481 = field1354.method229();
				for (int var82 = field1480; var82 < field1480 + 8; var82++) {
					for (int var83 = field1481; var83 < field1481 + 8; var83++) {
						if (field1133[field1366][var82][var83] != null) {
							field1133[field1366][var82][var83] = null;
							method516(var82, var83);
						}
					}
				}

				for (class40 var84 = (class40) field1230.method248(); var84 != null; var84 = (class40) field1230.method250()) {
					if (var84.field640 >= field1480 && var84.field640 < field1480 + 8 && var84.field641 >= field1481 && var84.field641 < field1481 + 8 && field1366 == var84.field638) {
						var84.field649 = 0;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 228) {
				field1480 = field1354.method229();
				field1481 = field1354.method229();
				field1295 = -1;
				return true;
			}

			if (field1295 == 27) {
				int var85 = field1354.method231();
				int var86 = field1354.method231();
				class4.field56[var85].field105 = 1;
				class4.field56[var85].field106 = var86;
				field1295 = -1;
				return true;
			}

			if (field1295 == 247) {
				field1270 = field1354.method229();
				if (field1270 == field1269) {
					if (field1270 == 3) {
						field1269 = 1;
					} else {
						field1269 = 3;
					}

					field1164 = true;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 213) {
				int var87 = field1354.method231();
				class4.field56[var87].field105 = 3;

				if (field1205.field438 == null) {
					class4.field56[var87].field106 = (field1205.field420[11] << 5) + (field1205.field420[8] << 10) + (field1205.field420[0] << 15) + (field1205.field421[0] << 25) + (field1205.field421[4] << 20) + field1205.field420[1];
				} else {
					class4.field56[var87].field106 = (int) (field1205.field438.field880 + 0x12345678L);
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 19 || field1295 == 197 || field1295 == 35 || field1295 == 14 || field1295 == 45 || field1295 == 192 || field1295 == 76 || field1295 == 7 || field1295 == 188 || field1295 == 237 || field1295 == 142) {
				method503(field1354, field1295);
				field1295 = -1;
				return true;
			}

			if (field1295 == 111) {
				field1269 = field1354.method229();
				field1164 = true;
				field1409 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 156) {
				int var88 = field1354.method231();
				int var89 = field1354.method229();

				if (var88 == 0xFFFF) {
					var88 = -1;
				}

				field1411[var89] = var88;
				field1164 = true;
				field1409 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 189) {
				int var90 = field1354.method231();
				class4 var91 = class4.field56[var90];
				for (int var92 = 0; var92 < var91.field57.length; var92++) {
					var91.field57[var92] = -1;
					var91.field57[var92] = 0;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 236) {
				int var93 = field1354.method231();
				int var94 = field1354.method231();
				int var95 = var94 >> 10 & 0x1F;
				int var96 = var94 >> 5 & 0x1F;
				int var97 = var94 & 0x1F;
				class4.field56[var93].field99 = (var97 << 3) + (var95 << 19) + (var96 << 11);
				field1295 = -1;
				return true;
			}

			if (field1295 == 16) {
				int var98 = field1354.method231();
				method551(var98);

				if (field1061 != -1) {
					field1061 = -1;
					field1164 = true;
					field1409 = true;
				}

				if (field1181 != -1) {
					field1181 = -1;
					field1392 = true;
				}

				if (field1426) {
					field1426 = false;
					field1392 = true;
				}

				field1072 = var98;
				field1474 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 34) {
				field1224 = 0;
				field1295 = -1;
				return true;
			}

			if (field1295 == 44) {
				field1390 = field1354.method234();
				field1449 = field1354.method231();
				field1223 = field1354.method229();
				field1344 = field1354.method231();
				field1104 = field1354.method229();
				if (field1390 != 0 && field1072 == -1) {
					signlink.dnslookup(class51.method303(field1390));
					method536();
					short var99 = 650;
					if (field1223 != 201 || field1104 == 1) {
						var99 = 655;
					}

					field1195 = "";
					field1299 = false;

					for (int var100 = 0; var100 < class4.field56.length; var100++) {
						if (class4.field56[var100] != null && class4.field56[var100].field65 == var99) {
							field1072 = class4.field56[var100].field62;
							break;
						}
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 136) {
				for (int var101 = 0; var101 < field1073.length; var101++) {
					if (field1475[var101] != field1073[var101]) {
						field1073[var101] = field1475[var101];
						method453(var101);
						field1164 = true;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 31) {
				int var102 = field1354.method231();
				if (var102 == 0xFFFF) {
					var102 = -1;
				}

				if (field1470 != var102 && field1246 && !field1370 && field1278 == 0) {
					field1393 = var102;
					field1394 = true;
					field1108.method279(2, field1393);
				}

				field1470 = var102;
				field1295 = -1;
				return true;
			}

			if (field1295 == 218) {
				int var103 = field1354.method231();
				int var104 = field1354.method231();
				if (field1246 && !field1370) {
					field1393 = var103;
					field1394 = false;
					field1108.method279(2, field1393);
					field1278 = var104;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 235) {
				field1164 = true;
				int var105 = field1354.method231();
				class4 var106 = class4.field56[var105];
				int var107 = field1354.method231();
				for (int var108 = 0; var108 < var107; var108++) {
					var106.field57[var108] = field1354.method231();
					int var109 = field1354.method229();
					if (var109 == 255) {
						var109 = field1354.method234();
					}

					var106.field58[var108] = var109;
				}

				for (int var110 = var107; var110 < var106.field57.length; var110++) {
					var106.field57[var110] = 0;
					var106.field58[var110] = 0;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 167) {
				int var111 = field1354.method231();
				int var112 = field1354.method232();
				class4 var113 = class4.field56[var111];
				var113.field109 = var112;

				if (var112 == -1) {
					var113.field59 = 0;
					var113.field60 = 0;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 169) {
				int var114 = field1354.method231();
				byte var115 = field1354.method230();
				field1475[var114] = var115;

				if (field1073[var114] != var115) {
					field1073[var114] = var115;
					method453(var114);
					field1164 = true;

					if (field1172 != -1) {
						field1392 = true;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 66) {
				int var116 = field1354.method231();
				method551(var116);

				if (field1181 != -1) {
					field1181 = -1;
					field1392 = true;
				}

				if (field1426) {
					field1426 = false;
					field1392 = true;
				}

				field1061 = var116;
				field1164 = true;
				field1409 = true;
				field1072 = -1;
				field1474 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 214) {
				if (field1269 == 12) {
					field1164 = true;
				}

				field1126 = field1354.method232();
				field1295 = -1;
				return true;
			}

			if (field1295 == 109) {
				field1480 = field1354.method229();
				field1481 = field1354.method229();

				while (field1354.field621 < field1294) {
					int var117 = field1354.method229();
					method503(field1354, var117);
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 221) {
				int var118 = field1354.method231();
				int var119 = field1354.method234();
				field1475[var118] = var119;

				if (field1073[var118] != var119) {
					field1073[var118] = var119;
					method453(var118);
					field1164 = true;

					if (field1172 != -1) {
						field1392 = true;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 89) {
				int var120 = field1354.method231();
				int var121 = field1354.method232();
				int var122 = field1354.method232();
				class4 var123 = class4.field56[var120];
				var123.field69 = var121;
				var123.field70 = var122;
				field1295 = -1;
				return true;
			}

			if (field1295 == 176) {
				field1140 = field1354.method231() * 30;
				field1295 = -1;
				return true;
			}

			if (field1295 == 107) {
				int var124 = field1354.method232();
				field1172 = var124;
				field1392 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 122) {
				method447(field1354, field1294);
				field1074 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 139) {
				int var125 = field1354.method231();
				int var126 = field1354.method231();
				class4.field56[var125].field105 = 2;
				class4.field56[var125].field106 = var126;
				field1295 = -1;
				return true;
			}

			if (field1295 == 220) {
				field1473 = true;
				field1135 = field1354.method229();
				field1136 = field1354.method229();
				field1137 = field1354.method231();
				field1138 = field1354.method229();
				field1139 = field1354.method229();
				if (field1139 >= 100) {
					field1167 = field1135 * 128 + 64;
					field1169 = field1136 * 128 + 64;
					field1168 = method513(field1366, field1167, field1169) - field1137;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 148) {
				for (int var127 = 0; var127 < field1432.length; var127++) {
					if (field1432[var127] != null) {
						field1432[var127].field388 = -1;
					}
				}

				for (int var128 = 0; var128 < field1476.length; var128++) {
					if (field1476[var128] != null) {
						field1476[var128].field388 = -1;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 127) {
				field1473 = false;

				for (int var129 = 0; var129 < 5; var129++) {
					field1200[var129] = false;
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 22) {
				field1482 = field1354.method231();
				field1397 = field1354.method229();
				field1295 = -1;
				return true;
			}

			if (field1295 == 143) {
				int var130 = field1354.method231();
				int var131 = field1354.method231();
				int var132 = field1354.method231();

				if (var131 == 0xFFFF) {
					class4.field56[var130].field105 = 0;
					field1295 = -1;
					return true;
				}

				class60 var133 = class60.method348(var131);
				class4.field56[var130].field105 = 4;
				class4.field56[var130].field106 = var131;
				class4.field56[var130].field112 = var133.field923;
				class4.field56[var130].field113 = var133.field924;
				class4.field56[var130].field111 = var133.field922 * 100 / var132;
				field1295 = -1;
				return true;
			}

			if (field1295 == 124) {
				field1473 = true;
				field1442 = field1354.method229();
				field1443 = field1354.method229();
				field1444 = field1354.method231();
				field1445 = field1354.method229();
				field1446 = field1354.method229();
				if (field1446 >= 100) {
					int var134 = field1442 * 128 + 64;
					int var135 = field1443 * 128 + 64;
					int var136 = method513(field1366, var134, var135) - field1444;
					int var137 = var134 - field1167;
					int var138 = var136 - field1168;
					int var139 = var135 - field1169;
					int var140 = (int) Math.sqrt(var137 * var137 + var139 * var139);
					field1170 = (int) (Math.atan2(var138, var140) * 325.949D) & 0x7FF;
					field1171 = (int) (Math.atan2(var137, var139) * -325.949D) & 0x7FF;

					if (field1170 < 128) {
						field1170 = 128;
					}

					if (field1170 > 383) {
						field1170 = 383;
					}
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 121) {
				int var141 = field1354.method231();
				int var142 = field1354.method231();

				if (field1181 != -1) {
					field1181 = -1;
					field1392 = true;
				}

				if (field1426) {
					field1426 = false;
					field1392 = true;
				}

				field1072 = var141;
				field1061 = var142;
				field1164 = true;
				field1409 = true;
				field1474 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 195) {
				if (field1061 != -1) {
					field1061 = -1;
					field1164 = true;
					field1409 = true;
				}

				if (field1181 != -1) {
					field1181 = -1;
					field1392 = true;
				}

				if (field1426) {
					field1426 = false;
					field1392 = true;
				}

				field1072 = -1;
				field1474 = false;
				field1295 = -1;
				return true;
			}

			if (field1295 == 244) {
				String var143 = field1354.method236();
				if (var143.endsWith(":tradereq:")) {
					String var144 = var143.substring(0, var143.indexOf(":"));
					long var145 = class51.method300(var144);
					boolean var147 = false;
					for (int var148 = 0; var148 < field1337; var148++) {
						if (field1479[var148] == var145) {
							var147 = true;
							break;
						}
					}

					if (!var147 && field1165 == 0) {
						method519(4, "wishes to trade with you.", var144);
					}
				} else if (var143.endsWith(":duelreq:")) {
					String var149 = var143.substring(0, var143.indexOf(":"));
					long var150 = class51.method300(var149);
					boolean var152 = false;
					for (int var153 = 0; var153 < field1337; var153++) {
						if (field1479[var153] == var150) {
							var152 = true;
							break;
						}
					}

					if (!var152 && field1165 == 0) {
						method519(8, "wishes to duel with you.", var149);
					}
				} else if (var143.endsWith(":chalreq:")) {
					String var154 = var143.substring(0, var143.indexOf(":"));
					long var155 = class51.method300(var154);
					boolean var157 = false;
					for (int var158 = 0; var158 < field1337; var158++) {
						if (field1479[var158] == var155) {
							var157 = true;
							break;
						}
					}

					if (!var157 && field1165 == 0) {
						String var159 = var143.substring(var143.indexOf(":") + 1, var143.length() - 9);
						method519(8, var159, var154);
					}
				} else {
					method519(0, var143, "");
				}

				field1295 = -1;
				return true;
			}

			if (field1295 == 234) {
				int var160 = field1354.method229();
				int var161 = field1354.method229();
				int var162 = field1354.method229();
				int var163 = field1354.method229();
				field1200[var160] = true;
				field1300[var160] = var161;
				field1276[var160] = var162;
				field1448[var160] = var163;
				field1321[var160] = 0;
				field1295 = -1;
				return true;
			}

			if (field1295 == 42) {
				field1424 = false;
				field1426 = true;
				field1364 = "";
				field1392 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 132) {
				int var164 = field1354.method232();
				if (var164 >= 0) {
					method551(var164);
				}

				field1471 = var164;
				field1295 = -1;
				return true;
			}

			if (field1295 == 47) {
				if (field1269 == 12) {
					field1164 = true;
				}

				field1191 = field1354.method229();
				field1295 = -1;
				return true;
			}

			if (field1295 == 224) {
				field1183 = field1354.method229();
				field1164 = true;
				field1295 = -1;
				return true;
			}

			if (field1295 == 180) {
				int var165 = field1354.method231();
				boolean var166 = field1354.method229() == 1;
				class4.field56[var165].field77 = var166;
				field1295 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1295 + "," + field1294 + " - " + field1175 + "," + field1176);
			method450();
		} catch (IOException var171) {
			method526();
		} catch (Exception var172) {
			String var168 = "T2 - " + field1295 + "," + field1175 + "," + field1176 + " - " + field1294 + "," + (field1205.field410[0] + field1157) + "," + (field1205.field411[0] + field1158) + " - ";
			for (int var169 = 0; var169 < field1294 && var169 < 50; var169++) {
				var168 = var168 + field1354.field620[var169] + ",";
			}

			signlink.reporterror(var168);
			method450();
		}

		return true;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method436(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1182; var3++) {
				if (field1134[var3] == arg0) {
					field1182--;
					field1164 = true;

					for (int var4 = var3; var4 < field1182; var4++) {
						field1112[var4] = field1112[var4 + 1];
						field1398[var4] = field1398[var4 + 1];
						field1134[var4] = field1134[var4 + 1];
					}

					field1102.method218(22);
					field1102.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = class31.field550[var7];
			int var13 = class31.field551[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field550[var8];
			int var16 = class31.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1167 = arg3 - var9;
		field1168 = arg4 - var10;
		field1169 = arg1 - var11;
		field1170 = arg0;
		field1171 = arg2;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method438() {
		for (class32 var1 = (class32) field1396.method248(); var1 != null; var1 = (class32) field1396.method250()) {
			if (field1366 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1116 >= var1.field555) {
				var1.method151(field1184);

				if (var1.field562) {
					var1.method106();
				} else {
					field1425.method61(60, var1.field558, var1.field557, var1.field559, var1, 0, false, var1.field556, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method439(int arg0, int arg1) {
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

	public final void run() {
		if (field1350) {
			method534();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13("Starting up", 20);

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1244) {
			field1217 = true;
		} else {
			field1244 = true;
			boolean var1 = false;
			String var2 = method469();
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
						field1125[var3] = new class48(signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, 500000);
					}
				}

				try {
					method562();
					field1389 = method502("title", "title screen", 1, field1179[1], 25);
					field1211 = new class37(field1389, false, "p11_full");
					field1212 = new class37(field1389, false, "p12_full");
					field1213 = new class37(field1389, false, "b12_full");
					field1214 = new class37(field1389, true, "q8_full");
					method470();
					method441();
					class50 var4 = method502("config", "config", 2, field1179[2], 30);
					class50 var5 = method502("interface", "interface", 3, field1179[3], 35);
					class50 var6 = method502("media", "2d graphics", 4, field1179[4], 40);
					class50 var7 = method502("textures", "textures", 6, field1179[6], 45);
					class50 var8 = method502("wordenc", "chat system", 7, field1179[7], 50);
					class50 var9 = method502("sounds", "sound effects", 8, field1179[8], 55);
					field1463 = new byte[4][104][104];
					field1094 = new int[4][105][105];
					field1425 = new class18(field1094, 104, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field1151[var10] = new class62(104, 104);
					}

					field1226 = new class35(512, 512);
					class50 var11 = method502("versionlist", "update list", 5, field1179[5], 60);
					method13("Connecting to update server", 60);
					field1108 = new class47();
					field1108.method270(var11, this);
					class7.method44(field1108.method273());
					class31.method123(field1108.method272(0), field1108);

					if (!field1370) {
						field1393 = 0;
						try {
							field1393 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1394 = true;
						field1108.method279(2, field1393);

						while (field1108.method280() > 0) {
							method452();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1108.field738 > 3) {
								method511("ondemand");
								return;
							}
						}
					}

					method13("Requesting animations", 65);
					int var12 = field1108.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1108.method279(1, var13);
					}

					while (field1108.method280() > 0) {
						int var14 = var12 - field1108.method280();
						if (var14 > 0) {
							method13("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method452();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1108.field738 > 3) {
							method511("ondemand");
							return;
						}
					}

					method13("Requesting models", 70);
					int var15 = field1108.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1108.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1108.method279(0, var16);
						}
					}

					int var18 = field1108.method280();
					while (field1108.method280() > 0) {
						int var19 = var18 - field1108.method280();
						if (var19 > 0) {
							method13("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method452();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1125[0] != null) {
						method13("Requesting maps", 75);
						field1108.method279(3, field1108.method274(47, 48, 0));
						field1108.method279(3, field1108.method274(47, 48, 1));
						field1108.method279(3, field1108.method274(48, 48, 0));
						field1108.method279(3, field1108.method274(48, 48, 1));
						field1108.method279(3, field1108.method274(49, 48, 0));
						field1108.method279(3, field1108.method274(49, 48, 1));
						field1108.method279(3, field1108.method274(47, 47, 0));
						field1108.method279(3, field1108.method274(47, 47, 1));
						field1108.method279(3, field1108.method274(48, 47, 0));
						field1108.method279(3, field1108.method274(48, 47, 1));
						field1108.method279(3, field1108.method274(48, 148, 0));
						field1108.method279(3, field1108.method274(48, 148, 1));
						int var20 = field1108.method280();
						while (field1108.method280() > 0) {
							int var21 = var20 - field1108.method280();
							if (var21 > 0) {
								method13("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method452();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1108.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1108.method277(var23);
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
							field1108.method282(var25, 0, var23);
						}
					}

					field1108.method275(field1369);

					if (!field1370) {
						int var26 = field1108.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1108.method278(var27)) {
								field1108.method282((byte) 1, 2, var27);
							}
						}
					}

					method13("Unpacking media", 80);
					field1339 = new class36(var6, "invback", 0);
					field1341 = new class36(var6, "chatback", 0);
					field1340 = new class36(var6, "mapback", 0);
					field1402 = new class36(var6, "backbase1", 0);
					field1403 = new class36(var6, "backbase2", 0);
					field1404 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1418[var28] = new class36(var6, "sideicons", var28);
					}

					field1465 = new class35(var6, "compass", 0);
					field1199 = new class35(var6, "mapedge", 0);
					field1199.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1335[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1076[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1210[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1319[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1329 = new class35(var6, "mapmarker", 0);
					field1330 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1464[var33] = new class35(var6, "cross", var33);
					}

					field1234 = new class35(var6, "mapdots", 0);
					field1235 = new class35(var6, "mapdots", 1);
					field1236 = new class35(var6, "mapdots", 2);
					field1237 = new class35(var6, "mapdots", 3);
					field1238 = new class35(var6, "mapdots", 4);
					field1317 = new class36(var6, "scrollbar", 0);
					field1318 = new class36(var6, "scrollbar", 1);
					field1141 = new class36(var6, "redstone1", 0);
					field1142 = new class36(var6, "redstone2", 0);
					field1143 = new class36(var6, "redstone3", 0);
					field1144 = new class36(var6, "redstone1", 0);
					field1144.method196();
					field1145 = new class36(var6, "redstone2", 0);
					field1145.method196();
					field1083 = new class36(var6, "redstone1", 0);
					field1083.method197();
					field1084 = new class36(var6, "redstone2", 0);
					field1084.method197();
					field1085 = new class36(var6, "redstone3", 0);
					field1085.method197();
					field1086 = new class36(var6, "redstone1", 0);
					field1086.method196();
					field1086.method197();
					field1087 = new class36(var6, "redstone2", 0);
					field1087.method196();
					field1087.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1082[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1062 = new class43(var35.field597, var35.field598, method11());
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1063 = new class43(var36.field597, var36.field598, method11());
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1064 = new class43(var37.field597, var37.field598, method11());
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1065 = new class43(var38.field597, var38.field598, method11());
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1066 = new class43(var39.field597, var39.field598, method11());
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1067 = new class43(var40.field597, var40.field598, method11());
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1068 = new class43(var41.field597, var41.field598, method11());
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1069 = new class43(var42.field597, var42.field598, method11());
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1070 = new class43(var43.field597, var43.field598, method11());
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1076[var48] != null) {
							field1076[var48].method182(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field1335[var48] != null) {
							field1335[var48].method198(var44 + var47, var46 + var47, var45 + var47);
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
					class60.field915 = field1369;

					if (!field1370) {
						method13("Unpacking sounds", 90);
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13("Unpacking interfaces", 95);
					class37[] var51 = new class37[] { field1211, field1212, field1213, field1214 };
					class4.method32(var51, var5, var6);
					method13("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1340.field603[field1340.field605 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1407[var52] = var53;
						field1334[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1340.field603[field1340.field605 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1092[var56 - 5] = var57 - 25;
						field1347[var56 - 5] = var58 - var57;
					}

					class34.method166(479, 96);
					field1154 = class34.field584;
					class34.method166(190, 261);
					field1155 = class34.field584;
					class34.method166(512, 334);
					field1156 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(var60, 500, 334, 800, 512);
					class71.method391(var8);
					field1209 = new class58(this);
					method12(field1209, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field874 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1342 + " " + field1081);
					field1103 = true;
				}
			} else {
				field1185 = true;
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method440() {
		field1360++;
		if (field1360 > 192) {
			field1360 = 0;
			field1102.method218(166);
			field1102.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1072 != -1 && field1462 == field1072) {
						break;
					}

					if (field1424) {
						if (var1 >= 32 && var1 <= 122 && field1365.length() < 80) {
							field1365 = field1365 + (char) var1;
							field1392 = true;
						}

						if (var1 == 8 && field1365.length() > 0) {
							field1365 = field1365.substring(0, field1365.length() - 1);
							field1392 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1424 = false;
							field1392 = true;

							if (field1100 == 1) {
								long var2 = class51.method300(field1365);
								method518(var2);
							}

							if (field1100 == 2 && field1182 > 0) {
								long var4 = class51.method300(field1365);
								method436(var4);
							}

							if (field1100 == 3 && field1365.length() > 0) {
								field1102.method218(165);
								field1102.method219(0);
								int var6 = field1102.field621;
								field1102.method225(field1101);
								class52.method307(field1102, field1365);
								field1102.method228(field1102.field621 - var6);
								field1365 = class52.method308(field1365);
								field1365 = class71.method401(field1365);
								method519(6, field1365, class51.method304(class51.method301(field1101)));

								if (field1245 == 2) {
									field1245 = 1;
									field1447 = true;
									field1102.method218(215);
									field1102.method219(field1410);
									field1102.method219(field1245);
									field1102.method219(field1349);
								}
							}

							if (field1100 == 4 && field1337 < 100) {
								long var7 = class51.method300(field1365);
								method524(var7);
							}

							if (field1100 == 5 && field1337 > 0) {
								long var9 = class51.method300(field1365);
								method468(var9);
							}
						}
					} else if (field1426) {
						if (var1 >= 48 && var1 <= 57 && field1364.length() < 10) {
							field1364 = field1364 + (char) var1;
							field1392 = true;
						}

						if (var1 == 8 && field1364.length() > 0) {
							field1364 = field1364.substring(0, field1364.length() - 1);
							field1392 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1364.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1364);
								} catch (Exception var18) {
								}

								field1102.method218(112);
								field1102.method223(var11);
							}

							field1426 = false;
							field1392 = true;
						}
					} else if (field1181 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1355.length() < 80) {
							field1355 = field1355 + (char) var1;
							field1392 = true;
						}

						if (var1 == 8 && field1355.length() > 0) {
							field1355 = field1355.substring(0, field1355.length() - 1);
							field1392 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1355.length() > 0) {
							if (field1263 == 2) {
								if (field1355.equals("::clientdrop")) {
									method526();
								}

								if (field1355.equals("::lag")) {
									method456();
								}

								if (field1355.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1108.method272(2); var12++) {
										field1108.method282((byte) 1, 2, var12);
									}
								}

								if (field1355.equals("::fpson")) {
									field1391 = true;
								}

								if (field1355.equals("::fpsoff")) {
									field1391 = false;
								}
							}

							if (field1355.startsWith("::")) {
								field1102.method218(78);
								field1102.method219(field1355.length() - 1);
								field1102.method226(field1355.substring(2));
							} else {
								String var13 = field1355.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1355 = field1355.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1355 = field1355.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1355 = field1355.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1355 = field1355.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1355 = field1355.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1355 = field1355.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1355 = field1355.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1355 = field1355.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1355 = field1355.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1355 = field1355.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1355 = field1355.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1355 = field1355.substring(6);
								}

								String var15 = field1355.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1355 = field1355.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1355 = field1355.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1355 = field1355.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1355 = field1355.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1355 = field1355.substring(6);
								}

								field1102.method218(233);
								field1102.method219(0);
								int var17 = field1102.field621;
								field1102.method219(var14);
								field1102.method219(var16);
								class52.method307(field1102, field1355);
								field1102.method228(field1102.field621 - var17);
								field1355 = class52.method308(field1355);
								field1355 = class71.method401(field1355);
								field1205.field372 = field1355;
								field1205.field374 = var14;
								field1205.field375 = var16;
								field1205.field373 = 150;

								if (field1263 == 2) {
									method519(2, field1205.field372, "@cr2@" + field1205.field416);
								} else if (field1263 == 1) {
									method519(2, field1205.field372, "@cr1@" + field1205.field416);
								} else {
									method519(2, field1205.field372, field1205.field416);
								}

								if (field1410 == 2) {
									field1410 = 3;
									field1447 = true;
									field1102.method218(215);
									field1102.method219(field1410);
									field1102.method219(field1245);
									field1102.method219(field1349);
								}
							}

							field1355 = "";
							field1392 = true;
						}
					}
				}

				if (var1 == 8 && field1195.length() > 0) {
					field1195 = field1195.substring(0, field1195.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1195.length() < 12) {
				field1195 = field1195 + (char) var1;
			}
		}
	}

	public final void init() {
		field1367 = Integer.parseInt(getParameter("nodeid"));
		field1368 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method478();
		} else {
			method520();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1369 = false;
		} else {
			field1369 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.g(I)V")
	public final void method441() {
		field1287 = new class36(field1389, "titlebox", 0);
		field1288 = new class36(field1389, "titlebutton", 0);
		field1163 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1163[var2] = new class36(field1389, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1163[var3] = new class36(field1389, "runes", (var3 & 0x3) + 12);
			}
		}

		field1187 = new class35(128, 265);
		field1188 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1187.field596[var4] = field1307.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1188.field596[var5] = field1308.field654[var5];
		}

		field1385 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1385[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1385[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1385[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1385[var9 + 192] = 0xFFFFFF;
		}

		field1386 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1386[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1386[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1386[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1386[var13 + 192] = 0xFFFFFF;
		}

		field1387 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1387[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1387[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1387[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1387[var17 + 192] = 0xFFFFFF;
		}

		field1384 = new int[256];
		field1152 = new int[32768];
		field1153 = new int[32768];
		method472(null);
		field1332 = new int[32768];
		field1333 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1468) {
			field1350 = true;
			field1468 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method442(int arg0) {
		if (arg0 >= 0) {
			if (field1426) {
				field1426 = false;
				field1392 = true;
			}

			int var2 = field1077[arg0];
			int var3 = field1078[arg0];
			int var4 = field1079[arg0];
			int var5 = field1080[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 357) {
				method451(var2, var3, 123, var5);
			}

			if (var4 == 563) {
				field1102.method218(216);
				field1102.method220(var5);
				field1102.method220(var2);
				field1102.method220(var3);
				field1102.method220(field1452);
				field1438 = 0;
				field1439 = var3;
				field1440 = var2;
				field1441 = 2;
				if (class4.field56[var3].field62 == field1072) {
					field1441 = 1;
				}

				if (class4.field56[var3].field62 == field1181) {
					field1441 = 3;
				}
			}

			if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
				boolean var6 = method510(field1205.field411[0], 0, 0, 0, false, 2, field1205.field410[0], var2, 0, var3, 0);
				if (!var6) {
					method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var2, 1, var3, 0);
				}

				field1323 = field24;
				field1324 = field25;
				field1326 = 2;
				field1325 = 0;

				if (var4 == 617) {
					field1102.method218(66);
				}

				if (var4 == 778) {
					field1102.method218(203);
				}

				if (var4 == 139) {
					if ((var2 & 0x3) == 0) {
						field1218++;
					}

					if (field1218 >= 123) {
						field1102.method218(237);
						field1102.method223(0);
					}

					field1102.method218(21);
				}

				if (var4 == 224) {
					field1207 += var3;
					if (field1207 >= 75) {
						field1102.method218(184);
						field1102.method219(19);
					}

					field1102.method218(204);
				}

				if (var4 == 662) {
					field1450 += field1158;
					if (field1450 >= 118) {
						field1102.method218(122);
						field1102.method223(0);
					}

					field1102.method218(205);
				}

				field1102.method220(field1157 + var2);
				field1102.method220(field1158 + var3);
				field1102.method220(var5);
			}

			if (var4 == 625) {
				method451(var2, var3, 97, var5);
			}

			if (var4 == 1071) {
				method451(var2, var3, 246, var5);
			}

			if (var4 == 743) {
				field1208++;
				if (field1208 >= 124) {
					field1102.method218(201);
					field1102.method220(37954);
				}

				method451(var2, var3, 142, var5);
			}

			if (var4 == 997 && !field1474) {
				field1102.method218(239);
				field1102.method220(var3);
				field1474 = true;
			}

			if (var4 == 275) {
				class27 var8 = field1432[var5];
				if (var8 != null) {
					method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var8.field410[0], 1, var8.field411[0], 0);
					field1323 = field24;
					field1324 = field25;
					field1326 = 2;
					field1325 = 0;
					field1102.method218(242);
					field1102.method220(var5);
					field1102.method220(field1259);
					field1102.method220(field1257);
					field1102.method220(field1258);
				}
			}

			if (var4 == 274) {
				class4 var9 = class4.field56[var3];
				field1451 = 1;
				field1452 = var3;
				field1453 = var9.field116;
				field1256 = 0;
				field1164 = true;
				String var10 = var9.field114;
				if (var10.indexOf(" ") != -1) {
					var10 = var10.substring(0, var10.indexOf(" "));
				}

				String var11 = var9.field114;
				if (var11.indexOf(" ") != -1) {
					var11 = var11.substring(var11.indexOf(" ") + 1);
				}

				field1454 = var10 + " " + var9.field115 + " " + var11;

				if (field1453 == 16) {
					field1164 = true;
					field1269 = 3;
					field1409 = true;
				}
			} else {
				if (var4 == 507 || var4 == 957) {
					String var12 = field1336[arg0];
					int var13 = var12.indexOf("@whi@");
					if (var13 != -1) {
						var12 = var12.substring(var13 + 5).trim();
						String var14 = class51.method304(class51.method301(class51.method300(var12)));
						boolean var15 = false;
						for (int var16 = 0; var16 < field1433; var16++) {
							class27 var17 = field1432[field1434[var16]];
							if (var17 != null && var17.field416 != null && var17.field416.equalsIgnoreCase(var14)) {
								method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var17.field410[0], 1, var17.field411[0], 0);

								if (var4 == 507) {
									field1281 += var5;
									if (field1281 >= 66) {
										field1102.method218(244);
										field1102.method219(154);
									}

									field1102.method218(183);
								}

								if (var4 == 957) {
									field1290++;
									if (field1290 >= 52) {
										field1102.method218(206);
										field1102.method219(131);
									}

									field1102.method218(230);
								}

								field1102.method220(field1434[var16]);
								var15 = true;
								break;
							}
						}

						if (!var15) {
							method519(0, "Unable to find " + var14, "");
						}
					}
				}

				if (var4 == 435) {
					field1102.method218(100);
					field1102.method220(var3);
					class4 var18 = class4.field56[var3];
					if (var18.field71 != null && var18.field71[0][0] == 5) {
						int var19 = var18.field71[0][1];
						field1073[var19] = 1 - field1073[var19];
						method453(var19);
						field1164 = true;
					}
				}

				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var20 = field1476[var5];
					if (var20 != null) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var20.field410[0], 1, var20.field411[0], 0);
						field1323 = field24;
						field1324 = field25;
						field1326 = 2;
						field1325 = 0;

						if (var4 == 242) {
							field1102.method218(70);
						}

						if (var4 == 852) {
							field1102.method218(17);
						}

						if (var4 == 793) {
							field1102.method218(149);
						}

						if (var4 == 309) {
							field1102.method218(106);
						}

						if (var4 == 209) {
							field1102.method218(45);
						}

						field1102.method220(var5);
					}
				}

				if (var4 == 524) {
					String var21 = field1336[arg0];
					int var22 = var21.indexOf("@whi@");
					if (var22 != -1) {
						if (field1072 == -1) {
							method536();
							field1195 = var21.substring(var22 + 5).trim();
							field1299 = false;

							for (int var23 = 0; var23 < class4.field56.length; var23++) {
								if (class4.field56[var23] != null && class4.field56[var23].field65 == 600) {
									field1462 = field1072 = class4.field56[var23].field62;
									break;
								}
							}
						} else {
							method519(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 737) {
					method536();
				}

				if (var4 == 398) {
					field1102.method218(241);
					field1102.method220(var5);
					field1102.method220(var2);
					field1102.method220(var3);
					field1102.method220(field1259);
					field1102.method220(field1257);
					field1102.method220(field1258);
					field1438 = 0;
					field1439 = var3;
					field1440 = var2;
					field1441 = 2;
					if (class4.field56[var3].field62 == field1072) {
						field1441 = 1;
					}

					if (class4.field56[var3].field62 == field1181) {
						field1441 = 3;
					}
				}

				if (var4 == 240) {
					class26 var24 = field1476[var5];
					if (var24 != null) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var24.field410[0], 1, var24.field411[0], 0);
						field1323 = field24;
						field1324 = field25;
						field1326 = 2;
						field1325 = 0;
						field1102.method218(127);
						field1102.method220(var5);
						field1102.method220(field1452);
					}
				}

				if (var4 == 1714) {
					class26 var25 = field1476[var5];
					if (var25 != null) {
						class59 var26 = var25.field415;
						if (var26.field906 != null) {
							var26 = var26.method345();
						}

						if (var26 != null) {
							String var27;
							if (var26.field882 == null) {
								var27 = "It's a " + var26.field881 + ".";
							} else {
								var27 = new String(var26.field882);
							}

							method519(0, var27, "");
						}
					}
				}

				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 100) {
						field1102.method218(243);
					}

					if (var4 == 962) {
						field1102.method218(52);
					}

					if (var4 == 694) {
						field1102.method218(67);
					}

					if (var4 == 681) {
						field1289++;
						if (field1289 >= 116) {
							field1102.method218(214);
							field1102.method222(0xC6A439);
						}

						field1102.method218(155);
					}

					if (var4 == 795) {
						field1102.method218(195);
					}

					field1102.method220(var5);
					field1102.method220(var2);
					field1102.method220(var3);
					field1438 = 0;
					field1439 = var3;
					field1440 = var2;
					field1441 = 2;
					if (class4.field56[var3].field62 == field1072) {
						field1441 = 1;
					}

					if (class4.field56[var3].field62 == field1181) {
						field1441 = 3;
					}
				}

				if (var4 == 902) {
					String var28 = field1336[arg0];
					int var29 = var28.indexOf("@whi@");
					if (var29 != -1) {
						long var30 = class51.method300(var28.substring(var29 + 5).trim());
						int var32 = -1;
						for (int var33 = 0; var33 < field1182; var33++) {
							if (field1134[var33] == var30) {
								var32 = var33;
								break;
							}
						}

						if (var32 != -1 && field1398[var32] > 0) {
							field1392 = true;
							field1426 = false;
							field1424 = true;
							field1365 = "";
							field1100 = 3;
							field1101 = field1134[var32];
							field1150 = "Enter message to send to " + field1112[var32];
						}
					}
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					class27 var34 = field1432[var5];
					if (var34 != null) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var34.field410[0], 1, var34.field411[0], 0);
						field1323 = field24;
						field1324 = field25;
						field1326 = 2;
						field1325 = 0;

						if (var4 == 185) {
							field1102.method218(54);
						}

						if (var4 == 387) {
							field1281 += var5;
							if (field1281 >= 66) {
								field1102.method218(244);
								field1102.method219(154);
							}

							field1102.method218(183);
						}

						if (var4 == 639) {
							field1290++;
							if (field1290 >= 52) {
								field1102.method218(206);
								field1102.method219(131);
							}

							field1102.method218(230);
						}

						if (var4 == 499) {
							field1102.method218(147);
						}

						if (var4 == 27) {
							field1102.method218(27);
						}

						field1102.method220(var5);
					}
				}

				if (var4 == 1328) {
					class60 var35 = class60.method348(var5);
					class4 var36 = class4.field56[var3];
					String var37;
					if (var36 != null && var36.field58[var2] >= 100000) {
						var37 = var36.field58[var2] + " x " + var35.field918;
					} else if (var35.field919 == null) {
						var37 = "It's a " + var35.field918 + ".";
					} else {
						var37 = new String(var35.field919);
					}

					method519(0, var37, "");
				}

				if (var4 == 718) {
					if (field1401) {
						field1425.method88(var3 - 4, var2 - 4);
					} else {
						field1425.method88(field25 - 4, field24 - 4);
					}
				}

				if (var4 == 131) {
					class27 var38 = field1432[var5];
					if (var38 != null) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var38.field410[0], 1, var38.field411[0], 0);
						field1323 = field24;
						field1324 = field25;
						field1326 = 2;
						field1325 = 0;
						field1102.method218(218);
						field1102.method220(var5);
						field1102.method220(field1452);
					}
				}

				if (var4 == 1152) {
					class60 var39 = class60.method348(var5);
					String var40;
					if (var39.field919 == null) {
						var40 = "It's a " + var39.field918 + ".";
					} else {
						var40 = new String(var39.field919);
					}

					method519(0, var40, "");
				}

				if (var4 == 721) {
					field1233 += var3;
					if (field1233 >= 139) {
						field1102.method218(59);
						field1102.method223(0);
					}

					method451(var2, var3, 139, var5);
				}

				if (var4 == 1381) {
					int var41 = var5 >> 14 & 0x7FFF;
					class57 var42 = class57.method330(var41);
					String var43;
					if (var42.field833 == null) {
						var43 = "It's a " + var42.field832 + ".";
					} else {
						var43 = new String(var42.field833);
					}

					method519(0, var43, "");
				}

				if (var4 == 370) {
					boolean var44 = method510(field1205.field411[0], 0, 0, 0, false, 2, field1205.field410[0], var2, 0, var3, 0);
					if (!var44) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var2, 1, var3, 0);
					}

					field1323 = field24;
					field1324 = field25;
					field1326 = 2;
					field1325 = 0;
					field1102.method218(144);
					field1102.method220(field1157 + var2);
					field1102.method220(field1158 + var3);
					field1102.method220(var5);
					field1102.method220(field1452);
				}

				if (var4 == 231) {
					class4 var46 = class4.field56[var3];
					boolean var47 = true;
					if (var46.field65 > 0) {
						var47 = method458(var46);
					}

					if (var47) {
						field1102.method218(100);
						field1102.method220(var3);
					}
				}

				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var48 = field1336[arg0];
					int var49 = var48.indexOf("@whi@");
					if (var49 != -1) {
						long var50 = class51.method300(var48.substring(var49 + 5).trim());
						if (var4 == 605) {
							method518(var50);
						}

						if (var4 == 47) {
							method524(var50);
						}

						if (var4 == 513) {
							method436(var50);
						}

						if (var4 == 884) {
							method468(var50);
						}
					}
				}

				if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
					if (var4 == 113) {
						field1102.method218(25);
					}

					if (var4 == 331) {
						field1102.method218(210);
					}

					if (var4 == 582) {
						if ((var5 & 0x3) == 0) {
							field1186++;
						}

						if (field1186 >= 133) {
							field1102.method218(30);
							field1102.method220(6118);
						}

						field1102.method218(103);
					}

					if (var4 == 555) {
						field1102.method218(85);
					}

					if (var4 == 354) {
						field1102.method218(198);
					}

					field1102.method220(var5);
					field1102.method220(var2);
					field1102.method220(var3);
					field1438 = 0;
					field1439 = var3;
					field1440 = var2;
					field1441 = 2;
					if (class4.field56[var3].field62 == field1072) {
						field1441 = 1;
					}

					if (class4.field56[var3].field62 == field1181) {
						field1441 = 3;
					}
				}

				if (var4 == 829) {
					class26 var52 = field1476[var5];
					if (var52 != null) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var52.field410[0], 1, var52.field411[0], 0);
						field1323 = field24;
						field1324 = field25;
						field1326 = 2;
						field1325 = 0;
						field1102.method218(150);
						field1102.method220(var5);
						field1102.method220(field1259);
						field1102.method220(field1257);
						field1102.method220(field1258);
					}
				}

				if (var4 == 899 && method451(var2, var3, 167, var5)) {
					field1102.method220(field1452);
				}

				if (var4 == 111) {
					boolean var53 = method510(field1205.field411[0], 0, 0, 0, false, 2, field1205.field410[0], var2, 0, var3, 0);
					if (!var53) {
						method510(field1205.field411[0], 0, 0, 1, false, 2, field1205.field410[0], var2, 1, var3, 0);
					}

					field1323 = field24;
					field1324 = field25;
					field1326 = 2;
					field1325 = 0;
					field1102.method218(176);
					field1102.method220(field1157 + var2);
					field1102.method220(field1158 + var3);
					field1102.method220(var5);
					field1102.method220(field1259);
					field1102.method220(field1257);
					field1102.method220(field1258);
				}

				if (var4 == 225) {
					field1102.method218(100);
					field1102.method220(var3);
					class4 var55 = class4.field56[var3];
					if (var55.field71 != null && var55.field71[0][0] == 5) {
						int var56 = var55.field71[0][1];
						if (field1073[var56] != var55.field73[0]) {
							field1073[var56] = var55.field73[0];
							method453(var56);
							field1164 = true;
						}
					}
				}

				if (var4 == 102) {
					field1256 = 1;
					field1257 = var2;
					field1258 = var3;
					field1259 = var5;
					field1260 = class60.method348(var5).field918;
					field1451 = 0;
					field1164 = true;
				} else {
					if (var4 == 810 && method451(var2, var3, 9, var5)) {
						field1102.method220(field1259);
						field1102.method220(field1257);
						field1102.method220(field1258);
					}

					field1256 = 0;
					field1451 = 0;
					field1164 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method443(int arg0, class38 arg1) {
		arg1.method239();
		int var3 = arg1.method240(8);
		if (var3 < field1477) {
			for (int var4 = var3; var4 < field1477; var4++) {
				field1250[field1249++] = field1478[var4];
			}
		}

		if (var3 > field1477) {
			signlink.reporterror(field1460 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1477 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1478[var5];
			class26 var7 = field1476[var6];
			int var8 = arg1.method240(1);
			if (var8 == 0) {
				field1478[field1477++] = var6;
				var7.field405 = field1116;
			} else {
				int var9 = arg1.method240(2);
				if (var9 == 0) {
					field1478[field1477++] = var6;
					var7.field405 = field1116;
					field1436[field1435++] = var6;
				} else if (var9 == 1) {
					field1478[field1477++] = var6;
					var7.field405 = field1116;
					int var10 = arg1.method240(3);
					var7.method111(var10, false);
					int var11 = arg1.method240(1);
					if (var11 == 1) {
						field1436[field1435++] = var6;
					}
				} else if (var9 == 2) {
					field1478[field1477++] = var6;
					var7.field405 = field1116;
					int var12 = arg1.method240(3);
					var7.method111(var12, true);
					int var13 = arg1.method240(3);
					var7.method111(var13, true);
					int var14 = arg1.method240(1);
					if (var14 == 1) {
						field1436[field1435++] = var6;
					}
				} else if (var9 == 3) {
					field1250[field1249++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method444() {
		field1277++;
		method474(true);
		method433(true);
		method474(false);
		method433(false);
		method473();
		method438();

		if (!field1473) {
			int var1 = field1272;
			if (field1338 / 256 > var1) {
				var1 = field1338 / 256;
			}

			if (field1200[4] && field1276[4] + 128 > var1) {
				var1 = field1276[4] + 128;
			}

			int var2 = field1279 + field1273 & 0x7FF;
			method437(var1, field1456, var2, field1455, method513(field1366, field1205.field360, field1205.field361) - 50, var1 * 3 + 600);
		}

		int var3;
		if (field1473) {
			var3 = method560();
		} else {
			var3 = method559();
		}

		int var4 = field1167;
		int var5 = field1168;
		int var6 = field1169;
		int var7 = field1170;
		int var8 = field1171;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1200[var9]) {
				int var10 = (int) (Math.random() * (field1300[var9] * 2 + 1) + Math.sin(field1448[var9] / 100.0D * field1321[var9]) * field1276[var9] - field1300[var9]);
				if (var9 == 0) {
					field1167 += var10;
				}

				if (var9 == 1) {
					field1168 += var10;
				}

				if (var9 == 2) {
					field1169 += var10;
				}

				if (var9 == 3) {
					field1171 = field1171 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1170 += var10;
					if (field1170 < 128) {
						field1170 = 128;
					}

					if (field1170 > 383) {
						field1170 = 383;
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
		field1425.method89(field1169, var3, field1167, field1170, field1171, field1168);
		field1425.method64();
		method555();
		method540();
		method464(var11);
		method548();
		field1284.method259(field9, 4, 4);
		field1167 = var4;
		field1168 = var5;
		field1169 = var6;
		field1170 = var7;
		field1171 = var8;
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method445(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1182; var2++) {
			if (arg0.equalsIgnoreCase(field1112[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1205.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method446() {
		short var1 = 256;

		if (field1089 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1089 > 768) {
					field1384[var2] = method532(field1386[var2], 1024 - field1089, field1385[var2]);
				} else if (field1089 > 256) {
					field1384[var2] = field1386[var2];
				} else {
					field1384[var2] = method532(field1385[var2], 256 - field1089, field1386[var2]);
				}
			}
		} else if (field1090 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1090 > 768) {
					field1384[var3] = method532(field1387[var3], 1024 - field1090, field1385[var3]);
				} else if (field1090 > 256) {
					field1384[var3] = field1387[var3];
				} else {
					field1384[var3] = method532(field1385[var3], 256 - field1090, field1387[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1384[var4] = field1385[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1307.field654[var5] = field1187.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1356[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1332[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1384[var12];
					int var15 = field1307.field654[var7];
					field1307.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1307.method259(field9, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1308.field654[var16] = field1188.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1356[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1332[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1384[var23];
					int var26 = field1308.field654[var18];
					field1308.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1308.method259(field9, 0, 637);
	}

	@ObfuscatedName("client.a(ZLlb;I)V")
	public final void method447(class38 arg0, int arg1) {
		field1249 = 0;
		field1435 = 0;
		method488(arg0, arg1);
		method552(arg0, arg1);
		method449(arg1, arg0);
		method471(arg0, arg1);

		for (int var3 = 0; var3 < field1249; var3++) {
			int var4 = field1250[var3];
			if (field1116 != field1432[var4].field405) {
				field1432[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1433; var5++) {
			if (field1432[field1434[var5]] == null) {
				signlink.reporterror(field1460 + " null entry in pl list - pos:" + var5 + " size:" + field1433);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method448(String arg0) throws IOException {
		if (field1189) {
			if (field1118 != null) {
				try {
					field1118.close();
				} catch (Exception var4) {
				}

				field1118 = null;
			}

			field1118 = method545(43595);
			field1118.setSoTimeout(10000);
			InputStream var2 = field1118.getInputStream();
			OutputStream var3 = field1118.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public final void method449(int arg0, class38 arg1) {
		while (arg1.field622 + 10 < arg0 * 8) {
			int var3 = arg1.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1432[var3] == null) {
				field1432[var3] = new class27();
				if (field1437[var3] != null) {
					field1432[var3].method116(field1437[var3]);
				}
			}

			field1434[field1433++] = var3;
			class27 var4 = field1432[var3];
			var4.field405 = field1116;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(field1205.field411[0] + var6, var7 == 1, field1205.field410[0] + var5);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1436[field1435++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method450() {
		try {
			if (field1201 != null) {
				field1201.method38();
			}
		} catch (Exception var2) {
		}

		field1201 = null;
		field1413 = false;
		field1119 = 0;
		field1460 = "";
		field1461 = "";
		method541();
		field1425.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1151[var1].method359();
		}

		System.gc();
		method434();
		field1470 = -1;
		field1393 = -1;
		field1278 = 0;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method451(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = field1425.method80(field1366, arg0, arg1, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1096++;
		if (field1096 > 1086) {
			field1096 = 0;
			field1102.method218(46);
			field1102.method219(0);
			int var9 = field1102.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method220(16791);
			}

			field1102.method219(254);
			field1102.method220((int) (Math.random() * 65536.0D));
			field1102.method220(16128);
			field1102.method220(52610);
			field1102.method220((int) (Math.random() * 65536.0D));
			field1102.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method220(35025);
			}

			field1102.method220(46628);
			field1102.method219((int) (Math.random() * 256.0D));
			field1102.method228(field1102.field621 - var9);
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

			method510(field1205.field411[0], 0, var13, var11, false, 2, field1205.field410[0], arg0, var12, arg1, 0);
		} else {
			method510(field1205.field411[0], var8, 0, 0, false, 2, field1205.field410[0], arg0, 0, arg1, var7 + 1);
		}

		field1323 = field24;
		field1324 = field25;
		field1326 = 2;
		field1325 = 0;
		field1102.method218(arg2);
		field1102.method220(field1157 + arg0);
		field1102.method220(field1158 + arg1);
		field1102.method220(var5);
		return true;
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

	@ObfuscatedName("client.i(I)V")
	public final void method452() {
		while (true) {
			class39 var1 = field1108.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field635, var1.field634);

				if ((field1108.method277(var1.field634) & 0x62) != 0) {
					field1164 = true;

					if (field1181 != -1) {
						field1392 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1393 == var1.field634 && var1.field635 != null) {
				method476(field1394, var1.field635);
			}

			if (var1.field633 == 3 && field1128 == 1) {
				for (int var2 = 0; var2 < field1206.length; var2++) {
					if (field1098[var2] == var1.field634) {
						field1206[var2] = var1.field635;

						if (var1.field635 == null) {
							field1098[var2] = -1;
						}

						break;
					}

					if (field1099[var2] == var1.field634) {
						field1262[var2] = var1.field635;

						if (var1.field635 == null) {
							field1099[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1108.method276(var1.field634)) {
				class3.method17(field1108, new class38(var1.field635));
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method453(int arg0) {
		int var2 = class70.field1040[arg0].field1048;
		if (var2 != 0) {
			int var3 = field1073[arg0];
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
				field1198 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1246;

				if (var3 == 0) {
					method431(0, field1246);
					field1246 = true;
				}

				if (var3 == 1) {
					method431(-400, field1246);
					field1246 = true;
				}

				if (var3 == 2) {
					method431(-800, field1246);
					field1246 = true;
				}

				if (var3 == 3) {
					method431(-1200, field1246);
					field1246 = true;
				}

				if (var3 == 4) {
					field1246 = false;
				}

				if (field1246 != var4 && !field1370) {
					if (field1246) {
						field1393 = field1470;
						field1394 = true;
						field1108.method279(2, field1393);
					} else {
						method434();
					}

					field1278 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1346 = true;
					method496(0);
				}

				if (var3 == 1) {
					field1346 = true;
					method496(-400);
				}

				if (var3 == 2) {
					field1346 = true;
					method496(-800);
				}

				if (var3 == 3) {
					field1346 = true;
					method496(-1200);
				}

				if (var3 == 4) {
					field1346 = false;
				}
			}

			if (var2 == 5) {
				field1261 = var3;
			}

			if (var2 == 6) {
				field1467 = var3;
			}

			if (var2 == 8) {
				field1130 = var3;
				field1392 = true;
			}

			if (var2 == 9) {
				field1421 = var3;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method454() {
		for (int var1 = -1; var1 < field1433; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1431;
			} else {
				var2 = field1434[var1];
			}

			class27 var3 = field1432[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1477; var4++) {
			int var5 = field1478[var4];
			class26 var6 = field1476[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method455() {
		if (field1130 != 0) {
			int var1 = 0;
			if (field1140 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1204[var2] != null) {
					int var3 = field1202[var2];
					String var4 = field1203[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1245 == 0 || field1245 == 1 && method445(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1212.method204("From:  " + var4 + field1204[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1263 >= 1) {
									field1336[field1221] = "Report abuse @whi@" + var4;
									field1079[field1221] = 2524;
									field1221++;
								}

								field1336[field1221] = "Add ignore @whi@" + var4;
								field1079[field1221] = 2047;
								field1221++;
								field1336[field1221] = "Add friend @whi@" + var4;
								field1079[field1221] = 2605;
								field1221++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1245 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public void method456() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1322);

		if (field1108 != null) {
			System.out.println("Od-cycle:" + field1108.field747);
		}

		System.out.println("loop-cycle:" + field1116);
		System.out.println("draw-cycle:" + field1147);
		System.out.println("ptype:" + field1295);
		System.out.println("psize:" + field1294);

		if (field1201 != null) {
			field1201.method43();
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

	@ObfuscatedName("client.a(IBIIIIIIII)V")
	public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1230.method248(); var11 != null; var11 = (class40) field1230.method250()) {
			if (var11.field638 == arg5 && var11.field640 == arg1 && var11.field641 == arg6 && var11.field639 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg5;
			var10.field639 = arg0;
			var10.field640 = arg1;
			var10.field641 = arg6;
			method463(var10);
			field1230.method245(var10);
		}

		var10.field645 = arg2;
		var10.field647 = arg7;
		var10.field646 = arg4;
		var10.field648 = arg8;
		var10.field649 = arg3;
	}

	@ObfuscatedName("client.a(ZLd;)Z")
	public final boolean method458(class4 arg0) {
		int var2 = arg0.field65;
		if (field1183 == 2) {
			if (var2 == 201) {
				field1392 = true;
				field1426 = false;
				field1424 = true;
				field1365 = "";
				field1100 = 1;
				field1150 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1392 = true;
				field1426 = false;
				field1424 = true;
				field1365 = "";
				field1100 = 2;
				field1150 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1298 = 250;
			return true;
		}

		if (var2 == 501) {
			field1392 = true;
			field1426 = false;
			field1424 = true;
			field1365 = "";
			field1100 = 4;
			field1150 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1392 = true;
			field1426 = false;
			field1424 = true;
			field1365 = "";
			field1100 = 5;
			field1150 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1320[var3];
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

					if (!class64.field979[var5].field985 && class64.field979[var5].field980 == var3 + (field1388 ? 0 : 7)) {
						break;
					}
				}

				field1320[var3] = var5;
				field1248 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1351[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1405[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1405[var6].length) {
					var8 = 0;
				}
			}

			field1351[var6] = var8;
			field1248 = true;
		}

		if (var2 == 324 && !field1388) {
			field1388 = true;
			method550();
		}

		if (var2 == 325 && field1388) {
			field1388 = false;
			method550();
		}

		if (var2 == 326) {
			field1102.method218(247);
			field1102.method219(field1388 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1102.method219(field1320[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1102.method219(field1351[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1299 = !field1299;
		}

		if (var2 >= 601 && var2 <= 612) {
			method536();

			if (field1195.length() > 0) {
				field1102.method218(217);
				field1102.method225(class51.method300(field1195));
				field1102.method219(var2 - 601);
				field1102.method219(field1299 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method459() {
		try {
			int var1 = field1205.field360 + field1123;
			int var2 = field1205.field361 + field1302;
			if (field1455 - var1 < -500 || field1455 - var1 > 500 || field1456 - var2 < -500 || field1456 - var2 > 500) {
				field1455 = var1;
				field1456 = var2;
			}

			if (field1455 != var1) {
				field1455 += (var1 - field1455) / 16;
			}

			if (field1456 != var2) {
				field1456 += (var2 - field1456) / 16;
			}

			if (field27[1] == 1) {
				field1274 += (-field1274 - 24) / 2;
			} else if (field27[2] == 1) {
				field1274 += (24 - field1274) / 2;
			} else {
				field1274 /= 2;
			}

			if (field27[3] == 1) {
				field1275 += (12 - field1275) / 2;
			} else if (field27[4] == 1) {
				field1275 += (-field1275 - 12) / 2;
			} else {
				field1275 /= 2;
			}

			field1273 = field1274 / 2 + field1273 & 0x7FF;
			field1272 += field1275 / 2;
			if (field1272 < 128) {
				field1272 = 128;
			}

			if (field1272 > 383) {
				field1272 = 383;
			}

			int var3 = field1455 >> 7;
			int var4 = field1456 >> 7;
			int var5 = method513(field1366, field1455, field1456);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1366;
						if (var9 < 3 && (field1463[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1094[var9][var7][var8];
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

			if (var11 > field1338) {
				field1338 += (var11 - field1338) / 24;
			} else if (var11 < field1338) {
				field1338 += (var11 - field1338) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1205.field360 + "," + field1205.field361 + "," + field1455 + "," + field1456 + "," + field1161 + "," + field1162 + "," + field1157 + "," + field1158);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method460(int arg0) {
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

	@ObfuscatedName("client.g(B)V")
	public final void method461() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1411[0] != -1) {
				field1164 = true;
				field1269 = 0;
				field1409 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1411[1] != -1) {
				field1164 = true;
				field1269 = 1;
				field1409 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1411[2] != -1) {
				field1164 = true;
				field1269 = 2;
				field1409 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1411[3] != -1) {
				field1164 = true;
				field1269 = 3;
				field1409 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1411[4] != -1) {
				field1164 = true;
				field1269 = 4;
				field1409 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1411[5] != -1) {
				field1164 = true;
				field1269 = 5;
				field1409 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1411[6] != -1) {
				field1164 = true;
				field1269 = 6;
				field1409 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1411[7] != -1) {
				field1164 = true;
				field1269 = 7;
				field1409 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1411[8] != -1) {
				field1164 = true;
				field1269 = 8;
				field1409 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1411[9] != -1) {
				field1164 = true;
				field1269 = 9;
				field1409 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1411[10] != -1) {
				field1164 = true;
				field1269 = 10;
				field1409 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1411[11] != -1) {
				field1164 = true;
				field1269 = 11;
				field1409 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1411[12] != -1) {
				field1164 = true;
				field1269 = 12;
				field1409 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1411[13] != -1) {
				field1164 = true;
				field1269 = 13;
				field1409 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.e(Z)Z")
	public final boolean method462() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ILnb;)V")
	public final void method463(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1425.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1425.method77(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 2) {
			var2 = field1425.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1425.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1425.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method464(int arg0) {
		if (!field1370) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1184 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1466;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1466 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1184 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1466;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1466 = var11;
				class34.method171(24);
			}

			if (class34.field592[34] >= arg0) {
				class36 var14 = class34.field586[34];
				int var15 = var14.field606 * var14.field605 - 1;
				int var16 = field1184 * var14.field605 * 2;
				byte[] var17 = var14.field603;
				byte[] var18 = field1466;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field603 = var18;
				field1466 = var17;
				class34.method171(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIBIILd;)V")
	public final void method465(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class4 arg7) {
		if (field1131) {
			field1314 = 32;
		} else {
			field1314 = 0;
		}

		field1131 = false;
		if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg6 && arg1 < arg6 + 16) {
			arg7.field76 -= field1412 * 4;

			if (arg2) {
				field1164 = true;
				return;
			}
		} else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg3 + arg6 - 16 && arg1 < arg3 + arg6) {
			arg7.field76 += field1412 * 4;

			if (arg2) {
				field1164 = true;
				return;
			}
		} else if (arg0 >= arg4 - field1314 && arg0 < arg4 + field1314 + 16 && arg1 >= arg6 + 16 && arg1 < arg3 + arg6 - 16 && field1412 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg6 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg7.field76 = (arg5 - arg3) * var10 / var11;

			if (arg2) {
				field1164 = true;
			}

			field1131 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method466() {
		if (field1370 && field1128 == 2 && class3.field33 != field1366) {
			field1284.method258();
			field1212.method202("Loading - please wait.", 151, 0, 257);
			field1212.method202("Loading - please wait.", 150, 0xFFFFFF, 256);
			field1284.method259(field9, 4, 4);
			field1128 = 1;
			field1286 = System.currentTimeMillis();
		}

		if (field1128 == 1) {
			int var1 = method467();
			if (var1 != 0 && System.currentTimeMillis() - field1286 > 360000L) {
				signlink.reporterror(field1460 + " glcfb " + field1400 + "," + var1 + "," + field1370 + "," + field1125[0] + "," + field1108.method280() + "," + field1366 + "," + field1161 + "," + field1162);
				field1286 = System.currentTimeMillis();
			}
		}

		if (field1128 == 2 && field1366 != field1180) {
			field1180 = field1366;
			method514(field1366);
		}
	}

	@ObfuscatedName("client.h(B)I")
	public final int method467() {
		for (int var1 = 0; var1 < field1206.length; var1++) {
			if (field1206[var1] == null && field1098[var1] != -1) {
				return -1;
			}

			if (field1262[var1] == null && field1099[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1206.length; var3++) {
			byte[] var4 = field1262[var3];
			if (var4 != null) {
				int var5 = (field1097[var3] >> 8) * 64 - field1157;
				int var6 = (field1097[var3] & 0xFF) * 64 - field1158;
				var2 &= class3.method16(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1074) {
			return -4;
		} else {
			field1128 = 2;
			class3.field33 = field1366;
			method432();
			field1102.method218(98);
			return 0;
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method468(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1337; var3++) {
				if (field1479[var3] == arg0) {
					field1337--;
					field1164 = true;

					for (int var4 = var3; var4 < field1337; var4++) {
						field1479[var4] = field1479[var4 + 1];
					}

					field1102.method218(180);
					field1102.method225(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)Ljava/lang/String;")
	public final String method469() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method470() {
		byte[] var1 = field1389.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1307.method258();
		var2.method184(0, 0);
		field1308.method258();
		var2.method184(0, -637);
		field1304.method258();
		var2.method184(0, -128);
		field1305.method258();
		var2.method184(-371, -202);
		field1306.method258();
		var2.method184(-171, -202);
		field1309.method258();
		var2.method184(-265, 0);
		field1310.method258();
		var2.method184(-265, -562);
		field1311.method258();
		var2.method184(-171, -128);
		field1312.method258();
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

		field1307.method258();
		var2.method184(0, 382);
		field1308.method258();
		var2.method184(0, -255);
		field1304.method258();
		var2.method184(0, 254);
		field1305.method258();
		var2.method184(-371, 180);
		field1306.method258();
		var2.method184(-171, 180);
		field1309.method258();
		var2.method184(-265, 382);
		field1310.method258();
		var2.method184(-265, -180);
		field1311.method258();
		var2.method184(-171, 254);
		field1312.method258();
		var2.method184(-171, -180);
		class35 var7 = new class35(field1389, "logo", 0);
		field1304.method258();
		var7.method186(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Llb;IZ)V")
	public final void method471(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1435; var3++) {
			int var4 = field1436[var3];
			class27 var5 = field1432[var4];
			int var6 = arg0.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method229() << 8;
			}

			method556(var6, arg0, var5, var4);
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method472(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1152.length; var3++) {
			field1152[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1152[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1153[var9] = (field1152[var9 - 1] + field1152[var9 + 1] + field1152[var9 - 128] + field1152[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1152;
			field1152 = field1153;
			field1153 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1152[var16] = 0;
					}
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

	@ObfuscatedName("client.m(I)V")
	public final void method473() {
		for (class30 var1 = (class30) field1408.method248(); var1 != null; var1 = (class30) field1408.method250()) {
			if (field1366 != var1.field458 || field1116 > var1.field464) {
				var1.method106();
			} else if (field1116 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1476[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(var2.field361, field1116, method513(var1.field458, var2.field360, var2.field361) - var1.field462, var2.field360);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1482 == var3) {
						var4 = field1205;
					} else {
						var4 = field1432[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(var4.field361, field1116, method513(var1.field458, var4.field360, var4.field361) - var1.field462, var4.field360);
					}
				}

				var1.method121(field1184);
				field1425.method61(60, (int) var1.field470, (int) var1.field469, (int) var1.field471, var1, var1.field477, false, field1366, -1);
			}
		}

		field1093++;
		if (field1093 > 1174) {
			field1093 = 0;
			field1102.method218(179);
			field1102.method219(0);
			int var5 = field1102.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method220(11499);
			}

			field1102.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method219(94);
			}

			field1102.method220(51693);
			field1102.method219(16);
			field1102.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1102.method219(65);
			}

			field1102.method219((int) (Math.random() * 256.0D));
			field1102.method220(22990);
			field1102.method228(field1102.field621 - var5);
		}
	}

	@ObfuscatedName("client.b(ZB)V")
	public final void method474(boolean arg0) {
		if (field1205.field360 >> 7 == field1224 && field1205.field361 >> 7 == field1225) {
			field1224 = 0;
			field1428++;
			if (field1428 > 122) {
				field1428 = 0;
				field1102.method218(168);
				field1102.method219(62);
			}
		}

		int var2 = field1433;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1205;
				var5 = field1431 << 14;
			} else {
				var4 = field1432[field1434[var3]];
				var5 = field1434[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1370 && field1433 > 50 || field1433 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1116 < var4.field426 || field1116 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1427[var6][var7] == field1277) {
								continue;
							}

							field1427[var6][var7] = field1277;
						}

						var4.field425 = method513(field1366, var4.field360, var4.field361);
						field1425.method61(60, var4.field361, var4.field360, var4.field425, var4, var4.field362, var4.field363, field1366, var5);
					} else {
						var4.field436 = false;
						var4.field425 = method513(field1366, var4.field360, var4.field361);
						field1425.method62(var4.field434, var4.field425, var4.field432, var4.field433, var4.field435, 60, var5, var4.field361, var4, field1366, var4.field360, var4.field362);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method475() {
		field1165 = 0;
		int var1 = (field1205.field360 >> 7) + field1157;
		int var2 = (field1205.field361 >> 7) + field1158;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1165 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1165 = 1;
		}

		if (field1165 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1165 = 0;
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method476(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public final void method477(int arg0, class38 arg1) {
		while (arg1.field622 + 21 < arg0 * 8) {
			int var3 = arg1.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1476[var3] == null) {
				field1476[var3] = new class26();
			}

			class26 var4 = field1476[var3];
			field1478[field1477++] = var3;
			var4.field405 = field1116;
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
			var4.method110(field1205.field411[0] + var6, var7 == 1, field1205.field410[0] + var5);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1436[field1435++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.i(B)V")
	public static final void method478() {
		class18.field258 = true;
		class34.field573 = true;
		field1370 = true;
		class3.field32 = true;
		class57.field822 = true;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method479() {
		for (int var1 = 0; var1 < field1477; var1++) {
			int var2 = field1478[var1];
			class26 var3 = field1476[var2];
			if (var3 != null) {
				method480(var3.field415.field883, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILy;B)V")
	public final void method480(int arg0, class25 arg1) {
		if (arg1.field360 < 128 || arg1.field361 < 128 || arg1.field360 >= 13184 || arg1.field361 >= 13184) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (field1205 == arg1 && (arg1.field360 < 1536 || arg1.field361 < 1536 || arg1.field360 >= 11776 || arg1.field361 >= 11776)) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (arg1.field402 > field1116) {
			method481(arg1);
		} else if (arg1.field403 >= field1116) {
			method482(arg1);
		} else {
			method483(arg1);
		}

		method484(arg1);
		method485(arg1);
	}

	@ObfuscatedName("client.a(ILy;)V")
	public final void method481(class25 arg0) {
		int var2 = arg0.field402 - field1116;
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

	@ObfuscatedName("client.b(ILy;)V")
	public final void method482(class25 arg0) {
		if (field1116 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field997[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1116 - arg0.field402;
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
	public final void method483(class25 arg0) {
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

	@ObfuscatedName("client.a(Ly;I)V")
	public final void method484(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1476[arg0.field382];
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
				if (field1482 == var5) {
					var5 = field1431;
				}

				class27 var6 = field1432[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1157 - field1157) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1158 - field1158) * 64;
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

	@ObfuscatedName("client.b(Ly;I)V")
	public final void method485(class25 arg0) {
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

		if (arg0.field393 != -1 && field1116 >= arg0.field396) {
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
			if (var4.field1009 == 1 && arg0.field414 > 0 && arg0.field402 <= field1116 && arg0.field403 < field1116) {
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

	@ObfuscatedName("client.j(B)V")
	public final void method486() {
		if (field1198) {
			field1198 = false;
			field1062.method259(field9, 4, 0);
			field1063.method259(field9, 357, 0);
			field1064.method259(field9, 4, 722);
			field1065.method259(field9, 205, 743);
			field1066.method259(field9, 0, 0);
			field1067.method259(field9, 4, 516);
			field1068.method259(field9, 205, 516);
			field1069.method259(field9, 357, 496);
			field1070.method259(field9, 338, 0);
			field1164 = true;
			field1392 = true;
			field1409 = true;
			field1447 = true;

			if (field1128 != 2) {
				field1284.method259(field9, 4, 4);
				field1283.method259(field9, 4, 550);
			}
		}

		if (field1128 == 2) {
			method444();
		}

		if (field1401 && field1264 == 1) {
			field1164 = true;
		}

		if (field1061 != -1) {
			boolean var1 = method517(field1184, field1061);
			if (var1) {
				field1164 = true;
			}
		}

		if (field1441 == 2) {
			field1164 = true;
		}

		if (field1253 == 2) {
			field1164 = true;
		}

		if (field1164) {
			method489();
			field1164 = false;
		}

		if (field1181 == -1) {
			field1177.field76 = field1091 - field1352 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method465(field17 - 17, field18 - 357, false, 77, 463, field1091, 0, field1177);
			}

			int var2 = field1091 - field1177.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1091 - 77) {
				var2 = field1091 - 77;
			}

			if (field1352 != var2) {
				field1352 = var2;
				field1392 = true;
			}
		}

		if (field1181 != -1) {
			boolean var3 = method517(field1184, field1181);
			if (var3) {
				field1392 = true;
			}
		}

		if (field1441 == 3) {
			field1392 = true;
		}

		if (field1253 == 3) {
			field1392 = true;
		}

		if (field1173 != null) {
			field1392 = true;
		}

		if (field1401 && field1264 == 2) {
			field1392 = true;
		}

		if (field1392) {
			method557();
			field1392 = false;
		}

		if (field1128 == 2) {
			method501();
			field1283.method259(field9, 4, 550);
		}

		if (field1270 != -1) {
			field1409 = true;
		}

		if (field1409) {
			if (field1270 != -1 && field1270 == field1269) {
				field1270 = -1;
				field1102.method218(83);
				field1102.method219(field1269);
			}

			field1409 = false;
			field1359.method258();
			field1404.method199(0, 0);

			if (field1061 == -1) {
				if (field1411[field1269] != -1) {
					if (field1269 == 0) {
						field1141.method199(22, 10);
					}

					if (field1269 == 1) {
						field1142.method199(54, 8);
					}

					if (field1269 == 2) {
						field1142.method199(82, 8);
					}

					if (field1269 == 3) {
						field1143.method199(110, 8);
					}

					if (field1269 == 4) {
						field1145.method199(153, 8);
					}

					if (field1269 == 5) {
						field1145.method199(181, 8);
					}

					if (field1269 == 6) {
						field1144.method199(209, 9);
					}
				}

				if (field1411[0] != -1 && (field1270 != 0 || field1116 % 20 < 10)) {
					field1418[0].method199(29, 13);
				}

				if (field1411[1] != -1 && (field1270 != 1 || field1116 % 20 < 10)) {
					field1418[1].method199(53, 11);
				}

				if (field1411[2] != -1 && (field1270 != 2 || field1116 % 20 < 10)) {
					field1418[2].method199(82, 11);
				}

				if (field1411[3] != -1 && (field1270 != 3 || field1116 % 20 < 10)) {
					field1418[3].method199(115, 12);
				}

				if (field1411[4] != -1 && (field1270 != 4 || field1116 % 20 < 10)) {
					field1418[4].method199(153, 13);
				}

				if (field1411[5] != -1 && (field1270 != 5 || field1116 % 20 < 10)) {
					field1418[5].method199(180, 11);
				}

				if (field1411[6] != -1 && (field1270 != 6 || field1116 % 20 < 10)) {
					field1418[6].method199(208, 13);
				}
			}

			field1359.method259(field9, 160, 516);
			field1358.method258();
			field1403.method199(0, 0);

			if (field1061 == -1) {
				if (field1411[field1269] != -1) {
					if (field1269 == 7) {
						field1083.method199(42, 0);
					}

					if (field1269 == 8) {
						field1084.method199(74, 0);
					}

					if (field1269 == 9) {
						field1084.method199(102, 0);
					}

					if (field1269 == 10) {
						field1085.method199(130, 1);
					}

					if (field1269 == 11) {
						field1087.method199(173, 0);
					}

					if (field1269 == 12) {
						field1087.method199(201, 0);
					}

					if (field1269 == 13) {
						field1086.method199(229, 0);
					}
				}

				if (field1411[8] != -1 && (field1270 != 8 || field1116 % 20 < 10)) {
					field1418[7].method199(74, 2);
				}

				if (field1411[9] != -1 && (field1270 != 9 || field1116 % 20 < 10)) {
					field1418[8].method199(102, 3);
				}

				if (field1411[10] != -1 && (field1270 != 10 || field1116 % 20 < 10)) {
					field1418[9].method199(137, 4);
				}

				if (field1411[11] != -1 && (field1270 != 11 || field1116 % 20 < 10)) {
					field1418[10].method199(174, 2);
				}

				if (field1411[12] != -1 && (field1270 != 12 || field1116 % 20 < 10)) {
					field1418[11].method199(201, 2);
				}

				if (field1411[13] != -1 && (field1270 != 13 || field1116 % 20 < 10)) {
					field1418[12].method199(226, 2);
				}
			}

			field1358.method259(field9, 466, 496);
			field1284.method258();
		}

		if (field1447) {
			field1447 = false;
			field1357.method258();
			field1402.method199(0, 0);
			field1212.method203(55, 0xFFFFFF, "Public chat", 28, true);

			if (field1410 == 0) {
				field1212.method203(55, 0xFF00, "On", 41, true);
			}

			if (field1410 == 1) {
				field1212.method203(55, 0xFFFF00, "Friends", 41, true);
			}

			if (field1410 == 2) {
				field1212.method203(55, 0xFF0000, "Off", 41, true);
			}

			if (field1410 == 3) {
				field1212.method203(55, 0xFFFF, "Hide", 41, true);
			}

			field1212.method203(184, 0xFFFFFF, "Private chat", 28, true);

			if (field1245 == 0) {
				field1212.method203(184, 0xFF00, "On", 41, true);
			}

			if (field1245 == 1) {
				field1212.method203(184, 0xFFFF00, "Friends", 41, true);
			}

			if (field1245 == 2) {
				field1212.method203(184, 0xFF0000, "Off", 41, true);
			}

			field1212.method203(324, 0xFFFFFF, "Trade/compete", 28, true);

			if (field1349 == 0) {
				field1212.method203(324, 0xFF00, "On", 41, true);
			}

			if (field1349 == 1) {
				field1212.method203(324, 0xFFFF00, "Friends", 41, true);
			}

			if (field1349 == 2) {
				field1212.method203(324, 0xFF0000, "Off", 41, true);
			}

			field1212.method203(458, 0xFFFFFF, "Report abuse", 33, true);
			field1357.method259(field9, 453, 0);
			field1284.method258();
		}

		field1184 = 0;
	}

	@ObfuscatedName("client.a(IILd;II)V")
	public final void method487(int arg0, int arg1, class4 arg2, int arg3) {
		if (arg2.field63 == 0 && arg2.field78 != null && (!arg2.field77 || field1348 == arg2.field61 || field1129 == arg2.field61 || field1313 == arg2.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg0, arg1, arg2.field67 + arg0, arg2.field66 + arg1);
			int var9 = arg2.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field79[var10] + arg1;
				int var12 = arg2.field80[var10] + arg0 - arg3;
				class4 var13 = class4.field56[arg2.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method515(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method487(var12, var11, var13, var13.field76);

					if (var13.field75 > var13.field67) {
						method528(var12, var13.field75, var13.field76, var13.field66 + var11, var13.field67);
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
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1253 != 0 && field1252 == var14) {
										int var22 = 0;
										if (field1256 == 1 && field1257 == var14 && field1258 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var21, var13.field58[var14], var22);
										if (var23 != null) {
											if (field1253 != 0 && field1252 == var14 && field1251 == var13.field61) {
												var19 = field17 - field1254;
												var20 = field18 - field1255;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1345 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(128, var17 + var19, var18 + var20);

												if (var18 + var20 < class33.field566 && arg2.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1184 / 3;
													if (var24 > field1184 * 10) {
														var24 = field1184 * 10;
													}

													if (var24 > arg2.field76) {
														var24 = arg2.field76;
													}

													arg2.field76 -= var24;
													field1255 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg2.field76 < arg2.field75 - arg2.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1184 / 3;
													if (var25 > field1184 * 10) {
														var25 = field1184 * 10;
													}

													if (var25 > arg2.field75 - arg2.field67 - arg2.field76) {
														var25 = arg2.field75 - arg2.field67 - arg2.field76;
													}

													arg2.field76 += var25;
													field1255 -= var25;
												}
											} else if (field1441 != 0 && field1440 == var14 && field1439 == var13.field61) {
												var23.method188(128, var17, var18);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1211.method206(method549(var26), 0, var18 + var20 + 10, var17 + 1 + var19);
												field1211.method206(method549(var26), 0xFFFF00, var18 + var20 + 9, var17 + var19);
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
						if (field1313 == var13.field61 || field1129 == var13.field61 || field1348 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method495(var13)) {
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
								class33.method158(var13.field66, var12, var11, var13.field67, var29);
							}
						} else if (var13.field93) {
							class33.method156(var12, var11, 256 - (var13.field68 & 0xFF), var29, var13.field66, var13.field67);
						} else {
							class33.method159(var29, var13.field66, var13.field67, var12, var11, 256 - (var13.field68 & 0xFF));
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1313 == var13.field61 || field1129 == var13.field61 || field1348 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method495(var13)) {
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

						if (var13.field64 == 6 && field1474) {
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

									var31 = var31.substring(0, var35) + method523(method535(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method523(method535(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method523(method535(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method523(method535(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method523(method535(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method203(var13.field66 / 2 + var11, var33, var41, var34, var13.field95);
							} else {
								var30.method210(var11, var33, var41, var13.field95, var34);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method495(var13)) {
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
						boolean var47 = method495(var13);
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
							var49 = var13.method34(var50.field999[var13.field59], var47, var50.field1000[var13.field59]);
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
										var56 = var56 + " x" + method460(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var13.field66 / 2 + var57, var13.field99, var56, var58, var13.field95);
									} else {
										var51.method210(var57, var13.field99, var56, var13.field95, var58);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var6, var5, var8, var7);
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method488(class38 arg0, int arg1) {
		arg0.method239();
		int var3 = arg0.method240(1);
		if (var3 != 0) {
			int var4 = arg0.method240(2);
			if (var4 == 0) {
				field1436[field1435++] = field1431;
			} else if (var4 == 1) {
				int var5 = arg0.method240(3);
				field1205.method111(var5, false);
				int var6 = arg0.method240(1);
				if (var6 == 1) {
					field1436[field1435++] = field1431;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method240(3);
				field1205.method111(var7, true);
				int var8 = arg0.method240(3);
				field1205.method111(var8, true);
				int var9 = arg0.method240(1);
				if (var9 == 1) {
					field1436[field1435++] = field1431;
				}
			} else if (var4 == 3) {
				field1366 = arg0.method240(2);
				int var10 = arg0.method240(7);
				int var11 = arg0.method240(7);
				int var12 = arg0.method240(1);
				field1205.method110(var11, var12 == 1, var10);
				int var13 = arg0.method240(1);
				if (var13 == 1) {
					field1436[field1435++] = field1431;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method489() {
		field1282.method258();
		class34.field584 = field1155;
		field1339.method199(0, 0);

		if (field1061 != -1) {
			method487(0, 0, class4.field56[field1061], 0);
		} else if (field1411[field1269] != -1) {
			method487(0, 0, class4.field56[field1411[field1269]], 0);
		}

		if (field1401 && field1264 == 1) {
			method512();
		}

		field1282.method259(field9, 205, 553);
		field1284.method258();
		class34.field584 = field1156;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method490() {
		int var1 = field1213.method204("Choose Option");
		for (int var2 = 0; var2 < field1221; var2++) {
			int var3 = field1213.method204(field1336[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1221 * 15 + 21;
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

			field1401 = true;
			field1264 = 0;
			field1265 = var5;
			field1266 = var6;
			field1267 = var1;
			field1268 = field1221 * 15 + 22;
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

			field1401 = true;
			field1264 = 1;
			field1265 = var7;
			field1266 = var8;
			field1267 = var1;
			field1268 = field1221 * 15 + 22;
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

			field1401 = true;
			field1264 = 2;
			field1265 = var9;
			field1266 = var10;
			field1267 = var1;
			field1268 = field1221 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ZLy;I)V")
	public final void method491(class25 arg0, int arg1) {
		method492(arg0.field361, arg0.field360, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method492(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method513(field1366, arg1, arg0) - arg2;
			arg1 -= field1167;
			var4 -= field1168;
			arg0 -= field1169;
			int var5 = class31.field550[field1170];
			int var6 = class31.field551[field1170];
			int var7 = class31.field550[field1171];
			int var8 = class31.field551[field1171];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1416 = (var9 << 9) / arg0 + class34.field578;
				field1417 = (var11 << 9) / arg0 + class34.field579;
			} else {
				field1416 = -1;
				field1417 = -1;
			}
		} else {
			field1416 = -1;
			field1417 = -1;
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method493(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1204[var4] != null) {
				int var5 = field1202[var4];
				int var6 = field1352 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1203[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1410 == 0 || field1410 == 1 && method445(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1205.field416)) {
						if (field1263 >= 1) {
							field1336[field1221] = "Report abuse @whi@" + var7;
							field1079[field1221] = 524;
							field1221++;
						}

						field1336[field1221] = "Add ignore @whi@" + var7;
						field1079[field1221] = 47;
						field1221++;
						field1336[field1221] = "Add friend @whi@" + var7;
						field1079[field1221] = 605;
						field1221++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1130 == 0 && (var5 == 7 || field1245 == 0 || field1245 == 1 && method445(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1263 >= 1) {
							field1336[field1221] = "Report abuse @whi@" + var7;
							field1079[field1221] = 524;
							field1221++;
						}

						field1336[field1221] = "Add ignore @whi@" + var7;
						field1079[field1221] = 47;
						field1221++;
						field1336[field1221] = "Add friend @whi@" + var7;
						field1079[field1221] = 605;
						field1221++;
					}

					var3++;
				}

				if (var5 == 4 && (field1349 == 0 || field1349 == 1 && method445(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1336[field1221] = "Accept trade @whi@" + var7;
						field1079[field1221] = 507;
						field1221++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1130 == 0 && field1245 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1349 == 0 || field1349 == 1 && method445(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1336[field1221] = "Accept challenge @whi@" + var7;
						field1079[field1221] = 957;
						field1221++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method494() {
		field1468 = false;
		while (field1149) {
			field1468 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1287 = null;
		field1288 = null;
		field1163 = null;
		field1384 = null;
		field1385 = null;
		field1386 = null;
		field1387 = null;
		field1152 = null;
		field1153 = null;
		field1332 = null;
		field1333 = null;
		field1187 = null;
		field1188 = null;
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public final boolean method495(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method535(arg0, var2);
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

	@ObfuscatedName("client.c(I)V")
	public final void method10() {
		field1198 = true;
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method496(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method497() {
		for (int var1 = 0; var1 < field1328; var1++) {
			if (field1148[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1114[var1] != field1395 || field1469[var1] != field1222) {
						class38 var3 = class55.method319(field1469[var1], field1114[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1459 / 22 + field1483) {
							field1459 = var3.field621;
							field1483 = System.currentTimeMillis();

							if (method430(var3.field620, var3.field621)) {
								field1395 = field1114[var1];
								field1222 = field1469[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method462()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1148[var1] != -5) {
					field1148[var1] = -5;
				} else {
					field1328--;
					for (int var5 = var1; var5 < field1328; var5++) {
						field1114[var5] = field1114[var5 + 1];
						field1469[var5] = field1469[var5 + 1];
						field1148[var5] = field1148[var5 + 1];
					}

					var1--;
				}
			} else {
				field1148[var1]--;
			}
		}

		if (field1278 > 0) {
			field1278 -= 20;
			if (field1278 < 0) {
				field1278 = 0;
			}

			if (field1278 == 0 && field1246 && !field1370) {
				field1393 = field1470;
				field1394 = true;
				field1108.method279(2, field1393);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1201 != null) {
				field1201.method38();
			}
		} catch (Exception var1) {
		}

		field1201 = null;
		method434();

		if (field1209 != null) {
			field1209.field869 = false;
		}

		field1209 = null;
		field1108.method271();
		field1108 = null;
		field1102 = null;
		field1371 = null;
		field1354 = null;
		field1097 = null;
		field1206 = null;
		field1262 = null;
		field1098 = null;
		field1099 = null;
		field1094 = null;
		field1463 = null;
		field1425 = null;
		field1151 = null;
		field1327 = null;
		field1132 = null;
		field1292 = null;
		field1293 = null;
		field1466 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1285 = null;
		field1357 = null;
		field1358 = null;
		field1359 = null;
		field1062 = null;
		field1063 = null;
		field1064 = null;
		field1065 = null;
		field1066 = null;
		field1067 = null;
		field1068 = null;
		field1069 = null;
		field1070 = null;
		field1339 = null;
		field1340 = null;
		field1341 = null;
		field1402 = null;
		field1403 = null;
		field1404 = null;
		field1418 = null;
		field1141 = null;
		field1142 = null;
		field1143 = null;
		field1144 = null;
		field1145 = null;
		field1083 = null;
		field1084 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1465 = null;
		field1210 = null;
		field1319 = null;
		field1464 = null;
		field1234 = null;
		field1235 = null;
		field1236 = null;
		field1237 = null;
		field1238 = null;
		field1335 = null;
		field1076 = null;
		field1427 = null;
		field1432 = null;
		field1434 = null;
		field1436 = null;
		field1437 = null;
		field1250 = null;
		field1476 = null;
		field1478 = null;
		field1133 = null;
		field1230 = null;
		field1408 = null;
		field1396 = null;
		field1077 = null;
		field1078 = null;
		field1079 = null;
		field1080 = null;
		field1336 = null;
		field1073 = null;
		field1193 = null;
		field1194 = null;
		field1315 = null;
		field1226 = null;
		field1112 = null;
		field1134 = null;
		field1398 = null;
		field1307 = null;
		field1308 = null;
		field1304 = null;
		field1305 = null;
		field1306 = null;
		field1309 = null;
		field1310 = null;
		field1311 = null;
		field1312 = null;
		method494();
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

	@ObfuscatedName("client.s(I)V")
	public final void method498() {
		if (field1140 > 1) {
			field1140--;
		}

		if (field1298 > 0) {
			field1298--;
		}

		for (int var1 = 0; var1 < 5 && method435(); var1++) {
		}

		if (field1413) {
			synchronized (field1209.field870) {
				if (!field1216) {
					field1209.field871 = 0;
				} else if (field23 != 0 || field1209.field871 >= 40) {
					field1102.method218(94);
					field1102.method219(0);
					int var3 = field1102.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1209.field871 && var3 - field1102.field621 < 240; var5++) {
						var4++;
						int var6 = field1209.field873[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1209.field872[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1209.field873[var5] == -1 && field1209.field872[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1228 != var7 || field1229 != var6) {
							int var9 = var7 - field1228;
							field1228 = var7;
							int var10 = var6 - field1229;
							field1229 = var6;

							if (field1088 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1102.method220((field1088 << 12) + (var9 << 6) + var10);
								field1088 = 0;
							} else if (field1088 < 8) {
								field1102.method222((field1088 << 19) + var8 + 0x800000);
								field1088 = 0;
							} else {
								field1102.method223((field1088 << 19) + var8 - 0x40000000);
								field1088 = 0;
							}
						} else if (field1088 < 2047) {
							field1088++;
						}
					}

					field1102.method228(field1102.field621 - var3);

					if (var4 >= field1209.field871) {
						field1209.field871 = 0;
					} else {
						field1209.field871 -= var4;
						for (int var11 = 0; var11 < field1209.field871; var11++) {
							field1209.field872[var11] = field1209.field872[var4 + var11];
							field1209.field873[var11] = field1209.field873[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1373) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1373 = field26;
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
				field1102.method218(238);
				field1102.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1457 > 0) {
				field1457--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1458 = true;
			}

			if (field1458 && field1457 <= 0) {
				field1457 = 20;
				field1458 = false;
				field1102.method218(212);
				field1102.method220(field1272);
				field1102.method220(field1273);
			}

			if (field14 && !field1146) {
				field1146 = true;
				field1102.method218(11);
				field1102.method219(1);
			}

			if (!field14 && field1146) {
				field1146 = false;
				field1102.method218(11);
				field1102.method219(0);
			}

			method466();
			method561();
			method497();
			field1296++;
			if (field1296 > 750) {
				method526();
			}

			method529();
			method479();
			method454();
			field1184++;

			if (field1326 != 0) {
				field1325 += 20;
				if (field1325 >= 400) {
					field1326 = 0;
				}
			}

			if (field1441 != 0) {
				field1438++;
				if (field1438 >= 15) {
					if (field1441 == 2) {
						field1164 = true;
					}

					if (field1441 == 3) {
						field1392 = true;
					}

					field1441 = 0;
				}
			}

			if (field1253 != 0) {
				field1345++;

				if (field17 > field1254 + 5 || field17 < field1254 - 5 || field18 > field1255 + 5 || field18 < field1255 - 5) {
					field1190 = true;
				}

				if (field16 == 0) {
					if (field1253 == 2) {
						field1164 = true;
					}

					if (field1253 == 3) {
						field1392 = true;
					}

					field1253 = 0;

					if (field1190 && field1345 >= 5) {
						field1420 = -1;
						method504();

						if (field1420 == field1251 && field1419 != field1252) {
							class4 var19 = class4.field56[field1251];
							byte var20 = 0;
							if (field1421 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1419] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1252;
								int var22 = field1419;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1252;
								int var24 = field1419;
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
								var19.method33(field1419, field1252);
							}

							field1102.method218(126);
							field1102.method220(field1251);
							field1102.method220(field1252);
							field1102.method220(field1419);
							field1102.method219(var20);
						}
					} else if ((field1261 == 1 || method542(field1221 - 1)) && field1221 > 2) {
						method490();
					} else if (field1221 > 0) {
						method442(field1221 - 1);
					}

					field1438 = 10;
					field23 = 0;
				}
			}

			field1215++;
			if (field1215 > 62) {
				field1215 = 0;
				field1102.method218(87);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method510(field1205.field411[0], 0, 0, 0, true, 0, field1205.field410[0], var25, 0, var26, 0);
				class18.field292 = -1;

				if (var27) {
					field1323 = field24;
					field1324 = field25;
					field1326 = 1;
					field1325 = 0;
				}
			}

			if (field23 == 1 && field1173 != null) {
				field1173 = null;
				field1392 = true;
				field23 = 0;
			}

			method533();
			method547();
			method461();
			method499();

			if (field16 == 1 || field23 == 1) {
				field1412++;
			}

			if (field1128 == 2) {
				method459();
			}

			if (field1128 == 2 && field1473) {
				method543();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1321[var28]++;
			}

			method440();
			field15++;
			if (field15 > 4500) {
				field1298 = 250;
				field15 -= 500;
				field1102.method218(194);
			}

			field1291++;
			if (field1291 > 500) {
				field1291 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1123 += field1124;
				}

				if ((var29 & 0x2) == 2) {
					field1302 += field1303;
				}

				if ((var29 & 0x4) == 4) {
					field1279 += field1280;
				}
			}

			if (field1123 < -50) {
				field1124 = 2;
			}

			if (field1123 > 50) {
				field1124 = -2;
			}

			if (field1302 < -55) {
				field1303 = 2;
			}

			if (field1302 > 55) {
				field1303 = -2;
			}

			if (field1279 < -40) {
				field1280 = 1;
			}

			if (field1279 > 40) {
				field1280 = -1;
			}

			field1197++;
			if (field1197 > 500) {
				field1197 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1422 += field1423;
				}

				if ((var30 & 0x2) == 2) {
					field1110 += field1111;
				}
			}

			if (field1422 < -60) {
				field1423 = 2;
			}

			if (field1422 > 60) {
				field1423 = -2;
			}

			if (field1110 < -20) {
				field1111 = 1;
			}

			if (field1110 > 10) {
				field1111 = -1;
			}

			field1297++;
			if (field1297 > 50) {
				field1102.method218(62);
			}

			try {
				if (field1201 != null && field1102.field621 > 0) {
					field1201.method42(field1102.field620, 0, field1102.field621);
					field1102.field621 = 0;
					field1297 = 0;
				}
			} catch (IOException var32) {
				method526();
			} catch (Exception var33) {
				method450();
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method499() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1410 = (field1410 + 1) % 4;
				field1447 = true;
				field1392 = true;
				field1102.method218(215);
				field1102.method219(field1410);
				field1102.method219(field1245);
				field1102.method219(field1349);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1245 = (field1245 + 1) % 3;
				field1447 = true;
				field1392 = true;
				field1102.method218(215);
				field1102.method219(field1410);
				field1102.method219(field1245);
				field1102.method219(field1349);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1349 = (field1349 + 1) % 3;
				field1447 = true;
				field1392 = true;
				field1102.method218(215);
				field1102.method219(field1410);
				field1102.method219(field1245);
				field1102.method219(field1349);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1072 == -1) {
					method536();
					field1195 = "";
					field1299 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1462 = field1072 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method519(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lib;IBI)V")
	public final void method500(class35 arg0, int arg1, int arg2) {
		int var4 = field1422 + field1273 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1110 + 256);
			var7 = var7 * 256 / (field1110 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method192(field1340, 83 - var9 - arg0.field602 / 2 - 4, var8 + 94 - arg0.field601 / 2 + 4);
			} else {
				arg0.method186(var8 + 94 + 4 - arg0.field601 / 2, 83 - var9 - arg0.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method501() {
		field1283.method258();

		if (field1232 == 2) {
			byte[] var1 = field1340.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1465.method190(0, 25, 0, field1334, 33, 25, field1407, 33, field1273, 256);
			field1284.method258();
		} else {
			int var5 = field1422 + field1273 & 0x7FF;
			int var6 = field1205.field360 / 32 + 48;
			int var7 = 464 - field1205.field361 / 32;
			field1226.method190(25, var7, 5, field1347, 146, var6, field1092, 151, var5, field1110 + 256);
			field1465.method190(0, 25, 0, field1334, 33, 25, field1407, 33, field1273, 256);

			for (int var8 = 0; var8 < field1192; var8++) {
				int var9 = field1193[var8] * 4 + 2 - field1205.field360 / 32;
				int var10 = field1194[var8] * 4 + 2 - field1205.field361 / 32;
				method500(field1315[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1133[field1366][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1205.field360 / 32;
						int var15 = var12 * 4 + 2 - field1205.field361 / 32;
						method500(field1234, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field1477; var16++) {
				class26 var17 = field1476[field1478[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field906 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field897) {
						int var19 = var17.field360 / 32 - field1205.field360 / 32;
						int var20 = var17.field361 / 32 - field1205.field361 / 32;
						method500(field1235, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field1433; var21++) {
				class27 var22 = field1432[field1434[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1205.field360 / 32;
					int var24 = var22.field361 / 32 - field1205.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1182; var28++) {
						if (field1134[var28] == var26 && field1398[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field1205.field439 != 0 && var22.field439 != 0 && field1205.field439 == var22.field439) {
						var29 = true;
					}

					if (var25) {
						method500(field1237, var23, var24);
					} else if (var29) {
						method500(field1238, var23, var24);
					} else {
						method500(field1236, var23, var24);
					}
				}
			}

			if (field1113 != 0 && field1116 % 20 < 10) {
				if (field1113 == 1 && field1484 >= 0 && field1484 < field1476.length) {
					class26 var30 = field1476[field1484];
					if (var30 != null) {
						int var31 = var30.field360 / 32 - field1205.field360 / 32;
						int var32 = var30.field361 / 32 - field1205.field361 / 32;
						method522(var32, field1330, var31);
					}
				}

				if (field1113 == 2) {
					int var33 = (field1239 - field1157) * 4 + 2 - field1205.field360 / 32;
					int var34 = (field1240 - field1158) * 4 + 2 - field1205.field361 / 32;
					method522(var34, field1330, var33);
				}

				if (field1113 == 10 && field1117 >= 0 && field1117 < field1432.length) {
					class27 var35 = field1432[field1117];
					if (var35 != null) {
						int var36 = var35.field360 / 32 - field1205.field360 / 32;
						int var37 = var35.field361 / 32 - field1205.field361 / 32;
						method522(var37, field1330, var36);
					}
				}
			}

			if (field1224 != 0) {
				int var38 = field1224 * 4 + 2 - field1205.field360 / 32;
				int var39 = field1225 * 4 + 2 - field1205.field361 / 32;
				method500(field1329, var38, var39);
			}

			class33.method157(97, 3, 0xFFFFFF, 78, 3);
			field1284.method258();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IIII)Lxb;")
	public final class50 method502(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1125[0] != null) {
				var6 = field1125[0].method291(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1178.reset();
			field1178.update(var6);
			int var8 = (int) field1178.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class50(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13("Requesting " + arg1, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method448(arg0 + arg3);
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
						method13("Loading " + arg1 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1125[0] != null) {
						field1125[0].method292(arg2, var6, var6.length);
					}
				} catch (Exception var28) {
					field1125[0] = null;
				}

				if (var6 != null) {
					field1178.reset();
					field1178.update(var6);
					int var23 = (int) field1178.getValue();
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
						method13("Game updated - please reload page", arg4);
						var25 = 10;
					} else {
						method13(var11 + " - Retrying in " + var25, arg4);
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

				field1189 = !field1189;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.b(Llb;IZ)V")
	public final void method503(class38 arg0, int arg1) {
		if (arg1 == 142 || arg1 == 237) {
			int var3 = arg0.method229();
			int var4 = (var3 >> 4 & 0x7) + field1480;
			int var5 = (var3 & 0x7) + field1481;
			int var6 = arg0.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1071[var7];
			int var10;
			if (arg1 == 237) {
				var10 = -1;
			} else {
				var10 = arg0.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method457(var9, var4, var10, -1, var8, field1366, var5, var7, 0);
			}
		} else if (arg1 == 188) {
			int var11 = arg0.method229();
			int var12 = (var11 >> 4 & 0x7) + field1480;
			int var13 = (var11 & 0x7) + field1481;
			int var14 = arg0.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1071[var15];
			int var18 = arg0.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1094[field1366][var12][var13];
				int var20 = field1094[field1366][var12 + 1][var13];
				int var21 = field1094[field1366][var12 + 1][var13 + 1];
				int var22 = field1094[field1366][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1425.method72(var13, field1366, var12);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var18, var21, var19, false, var16 + 4, var20, 2, var22, var24);
							var23.field255 = new class28(var18, var21, var19, false, var16 + 1 & 0x3, var20, 2, var22, var24);
						} else {
							var23.field254 = new class28(var18, var21, var19, false, var16, var20, var15, var22, var24);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1425.method73(var12, var13, field1366);
					if (var25 != null) {
						var25.field147 = new class28(var18, var21, var19, false, 0, var20, 4, var22, var25.field148 >> 14 & 0x7FFF);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1425.method74(var12, field1366, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var18, var21, var19, false, var16, var20, var15, var22, var26.field247 >> 14 & 0x7FFF);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1425.method75(field1366, var13, var12);
					if (var27 != null) {
						var27.field178 = new class28(var18, var21, var19, false, var16, var20, 22, var22, var27.field179 >> 14 & 0x7FFF);
					}
				}
			}
		} else if (arg1 == 7) {
			int var28 = arg0.method229();
			int var29 = (var28 >> 4 & 0x7) + field1480;
			int var30 = (var28 & 0x7) + field1481;
			int var31 = arg0.method231();
			int var32 = arg0.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1133[field1366][var29][var30] == null) {
					field1133[field1366][var29][var30] = new class41();
				}

				field1133[field1366][var29][var30].method245(var33);
				method516(var29, var30);
			}
		} else if (arg1 == 76) {
			int var34 = arg0.method229();
			int var35 = (var34 >> 4 & 0x7) + field1480;
			int var36 = (var34 & 0x7) + field1481;
			int var37 = arg0.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1133[field1366][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1133[field1366][var35][var36] = null;
					}

					method516(var35, var36);
				}
			}
		} else if (arg1 == 192) {
			int var40 = arg0.method229();
			int var41 = (var40 >> 4 & 0x7) + field1480;
			int var42 = (var40 & 0x7) + field1481;
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
				class30 var53 = new class30(field1116 + var50, var41, var52, method513(field1366, var41, var42) - var47, field1366, var45, var51, var48, var46, var42, field1116 + var49);
				var53.method120(var44, field1116 + var49, method513(field1366, var43, var44) - var48, var43);
				field1408.method245(var53);
			}
		} else if (arg1 == 45) {
			int var54 = arg0.method229();
			int var55 = (var54 >> 4 & 0x7) + field1480;
			int var56 = (var54 & 0x7) + field1481;
			int var57 = arg0.method231();
			int var58 = arg0.method229();
			int var59 = arg0.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var55, var57, method513(field1366, var55, var56) - var58, field1366, field1116, var56, var59);
				field1396.method245(var60);
			}
		} else if (arg1 == 14) {
			int var61 = arg0.method229();
			int var62 = (var61 >> 4 & 0x7) + field1480;
			int var63 = (var61 & 0x7) + field1481;
			int var64 = arg0.method231();
			int var65 = arg0.method231();
			int var66 = arg0.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1482 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1133[field1366][var62][var63] == null) {
					field1133[field1366][var62][var63] = new class41();
				}

				field1133[field1366][var62][var63].method245(var67);
				method516(var62, var63);
			}
		} else {
			if (arg1 == 35) {
				int var68 = arg0.method229();
				int var69 = (var68 >> 4 & 0x7) + field1480;
				int var70 = (var68 & 0x7) + field1481;
				int var71 = arg0.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1071[var72];
				int var75 = arg0.method231();
				int var76 = arg0.method231();
				int var77 = arg0.method231();
				int var78 = arg0.method231();
				byte var79 = arg0.method230();
				byte var80 = arg0.method230();
				byte var81 = arg0.method230();
				byte var82 = arg0.method230();
				class27 var83;
				if (field1482 == var78) {
					var83 = field1205;
				} else {
					var83 = field1432[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1094[field1366][var69][var70];
					int var86 = field1094[field1366][var69 + 1][var70];
					int var87 = field1094[field1366][var69 + 1][var70 + 1];
					int var88 = field1094[field1366][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method457(var74, var69, -1, var77 + 1, 0, field1366, var70, 0, var76 + 1);
						var83.field426 = field1116 + var76;
						var83.field427 = field1116 + var77;
						var83.field431 = var89;
						int var90 = var84.field836;
						int var91 = var84.field837;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field837;
							var91 = var84.field836;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method513(field1366, var83.field428, var83.field430);

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

			if (arg1 == 197) {
				int var94 = arg0.method229();
				int var95 = (var94 >> 4 & 0x7) + field1480;
				int var96 = (var94 & 0x7) + field1481;
				int var97 = arg0.method231();
				int var98 = arg0.method231();
				int var99 = arg0.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1133[field1366][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method516(var95, var96);
					}
				}
			} else if (arg1 == 19) {
				int var102 = arg0.method229();
				int var103 = (var102 >> 4 & 0x7) + field1480;
				int var104 = (var102 & 0x7) + field1481;
				int var105 = arg0.method231();
				int var106 = arg0.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1205.field410[0] >= var103 - var107 && field1205.field410[0] <= var103 + var107 && field1205.field411[0] >= var104 - var107 && field1205.field411[0] <= var104 + var107 && field1346 && !field1370 && field1328 < 50) {
					field1114[field1328] = var105;
					field1469[field1328] = var108;
					field1148[field1328] = class55.field790[var105];
					field1328++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method504() {
		if (field1253 == 0) {
			field1336[0] = "Cancel";
			field1079[0] = 1106;
			field1221 = 1;
			method455();
			field1075 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1072 == -1) {
					method558();
				} else {
					method509(4, field17, field18, 0, class4.field56[field1072], 4);
				}
			}

			if (field1348 != field1075) {
				field1348 = field1075;
			}

			field1075 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1061 != -1) {
					method509(553, field17, field18, 0, class4.field56[field1061], 205);
				} else if (field1411[field1269] != -1) {
					method509(553, field17, field18, 0, class4.field56[field1411[field1269]], 205);
				}
			}

			if (field1129 != field1075) {
				field1164 = true;
				field1129 = field1075;
			}

			field1075 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1181 != -1) {
					method509(17, field17, field18, 0, class4.field56[field1181], 357);
				} else if (field18 < 434 && field17 < 426) {
					method493(field18 - 357, field17 - 17);
				}
			}

			if (field1181 != -1 && field1313 != field1075) {
				field1392 = true;
				field1313 = field1075;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1221 - 1; var2++) {
					if (field1079[var2] < 1000 && field1079[var2 + 1] > 1000) {
						String var3 = field1336[var2];
						field1336[var2] = field1336[var2 + 1];
						field1336[var2 + 1] = var3;
						int var4 = field1079[var2];
						field1079[var2] = field1079[var2 + 1];
						field1079[var2 + 1] = var4;
						int var5 = field1077[var2];
						field1077[var2] = field1077[var2 + 1];
						field1077[var2 + 1] = var5;
						int var6 = field1078[var2];
						field1078[var2] = field1078[var2 + 1];
						field1078[var2 + 1] = var6;
						int var7 = field1080[var2];
						field1080[var2] = field1080[var2 + 1];
						field1080[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method505() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1332[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1332[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1333[var10] = (field1332[var10 - 1] + field1332[var10 + 1] + field1332[var10 - 128] + field1332[var10 + 128]) / 4;
			}
		}

		field1231 += 128;
		if (field1231 > field1152.length) {
			field1231 -= field1152.length;
			int var11 = (int) (Math.random() * 12.0D);
			method472(field1163[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1333[var14 + 128] - field1152[field1231 + var14 & field1152.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1332[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1356[var16] = field1356[var16 + 1];
		}

		field1356[var1 - 1] = (int) (Math.sin(field1116 / 14.0D) * 16.0D + Math.sin(field1116 / 15.0D) * 14.0D + Math.sin(field1116 / 16.0D) * 12.0D);

		if (field1089 > 0) {
			field1089 -= 4;
		}

		if (field1090 > 0) {
			field1090 -= 4;
		}

		if (field1089 == 0 && field1090 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1089 = 1024;
			}

			if (var17 == 1) {
				field1090 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg3 >= 1 && arg2 <= 102 && arg3 <= 102) {
			if (field1370 && field1366 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field1425.method76(arg1, arg2, arg3);
			}

			if (arg4 == 1) {
				var8 = field1425.method77(arg1, arg2, arg3);
			}

			if (arg4 == 2) {
				var8 = field1425.method78(arg1, arg2, arg3);
			}

			if (arg4 == 3) {
				var8 = field1425.method79(arg1, arg2, arg3);
			}

			if (var8 != 0) {
				int var12 = field1425.method80(arg1, arg2, arg3, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field1425.method67(arg3, arg2, arg1);
					class57 var16 = class57.method330(var13);
					if (var16.field838) {
						field1151[arg1].method364(var16.field839, var15, arg3, var14, arg2);
					}
				}

				if (arg4 == 1) {
					field1425.method68(arg1, arg3, arg2);
				}

				if (arg4 == 2) {
					field1425.method69(arg3, arg2, arg1);
					class57 var17 = class57.method330(var13);
					if (var17.field836 + arg2 > 103 || var17.field836 + arg3 > 103 || var17.field837 + arg2 > 103 || var17.field837 + arg3 > 103) {
						return;
					}

					if (var17.field838) {
						field1151[arg1].method365(var17.field837, var17.field839, var17.field836, var15, arg3, arg2);
					}
				}

				if (arg4 == 3) {
					field1425.method70(arg2, arg3, arg1);
					class57 var18 = class57.method330(var13);
					if (var18.field838 && var18.field840) {
						field1151[arg1].method367(arg2, arg3);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field1463[1][arg2][arg3] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				class3.method31(field1151[arg1], arg1, arg0, arg6, var19, field1094, arg2, arg3, arg5, field1425);
				return;
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method507() {
		if (field1119 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1119 = 3;
				field1363 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1414 = "";
				field1415 = "Enter your username & password.";
				field1119 = 2;
				field1363 = 0;
			}
		} else if (field1119 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1363 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1363 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1105 = 0;
				method553(field1460, field1461, false);

				if (field1413) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1119 = 0;
				field1460 = "";
				field1461 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1166.length(); var10++) {
					if (var8 == field1166.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1363 == 0) {
					if (var8 == 8 && field1460.length() > 0) {
						field1460 = field1460.substring(0, field1460.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1363 = 1;
					}

					if (var9) {
						field1460 = field1460 + (char) var8;
					}

					if (field1460.length() > 12) {
						field1460 = field1460.substring(0, 12);
					}
				} else if (field1363 == 1) {
					if (var8 == 8 && field1461.length() > 0) {
						field1461 = field1461.substring(0, field1461.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1363 = 0;
					}

					if (var9) {
						field1461 = field1461 + (char) var8;
					}

					if (field1461.length() > 20) {
						field1461 = field1461.substring(0, 20);
					}
				}
			}
		} else if (field1119 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1119 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZLlb;)V")
	public final void method508(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1435; var3++) {
			int var4 = field1436[var3];
			class26 var5 = field1476[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method229();
				int var8 = arg1.method229();
				var5.method114(var8, field1116, var7);
				var5.field379 = field1116 + 300;
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
				var5.method114(var13, field1116, var12);
				var5.field379 = field1116 + 300;
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
				var5.field396 = (var14 & 0xFFFF) + field1116;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1116) {
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

	@ObfuscatedName("client.a(IIIIILd;I)V")
	public final void method509(int arg0, int arg1, int arg2, int arg3, class4 arg4, int arg5) {
		if (arg4.field63 == 0 && arg4.field78 != null && !arg4.field77 && (arg1 >= arg0 && arg2 >= arg5 && arg1 <= arg4.field66 + arg0 && arg2 <= arg4.field67 + arg5)) {
			int var7 = arg4.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg4.field79[var8] + arg0;
				int var10 = arg4.field80[var8] + arg5 - arg3;
				class4 var11 = class4.field56[arg4.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1075 = var11.field74;
					} else {
						field1075 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method509(var9, arg1, arg2, var11.field76, var11, var10);

					if (var11.field75 > var11.field67) {
						method465(arg1, arg2, true, var11.field67, var11.field66 + var9, var11.field75, var10, var11);
					}
				} else {
					if (var11.field64 == 1 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method525(var11);
						}

						if (!var12) {
							field1336[field1221] = var11.field117;
							field1079[field1221] = 231;
							field1078[field1221] = var11.field61;
							field1221++;
						}
					}

					if (var11.field64 == 2 && field1451 == 0 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1336[field1221] = var13 + " @gre@" + var11.field115;
						field1079[field1221] = 274;
						field1078[field1221] = var11.field61;
						field1221++;
					}

					if (var11.field64 == 3 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1336[field1221] = "Close";
						field1079[field1221] = 737;
						field1078[field1221] = var11.field61;
						field1221++;
					}

					if (var11.field64 == 4 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1336[field1221] = var11.field117;
						field1079[field1221] = 435;
						field1078[field1221] = var11.field61;
						field1221++;
					}

					if (var11.field64 == 5 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1336[field1221] = var11.field117;
						field1079[field1221] = 225;
						field1078[field1221] = var11.field61;
						field1221++;
					}

					if (var11.field64 == 6 && !field1474 && arg1 >= var9 && arg2 >= var10 && arg1 < var11.field66 + var9 && arg2 < var11.field67 + var10) {
						field1336[field1221] = var11.field117;
						field1079[field1221] = 997;
						field1078[field1221] = var11.field61;
						field1221++;
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

								if (arg1 >= var17 && arg2 >= var18 && arg1 < var17 + 32 && arg2 < var18 + 32) {
									field1419 = var14;
									field1420 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1256 == 1 && var11.field84) {
											if (field1258 != var11.field61 || field1257 != var14) {
												field1336[field1221] = "Use " + field1260 + " with @lre@" + var19.field918;
												field1079[field1221] = 398;
												field1080[field1221] = var19.field916;
												field1077[field1221] = var14;
												field1078[field1221] = var11.field61;
												field1221++;
											}
										} else if (field1451 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field933 != null && var19.field933[var20] != null) {
														field1336[field1221] = var19.field933[var20] + " @lre@" + var19.field918;

														if (var20 == 3) {
															field1079[field1221] = 681;
														}

														if (var20 == 4) {
															field1079[field1221] = 100;
														}

														field1080[field1221] = var19.field916;
														field1077[field1221] = var14;
														field1078[field1221] = var11.field61;
														field1221++;
													} else if (var20 == 4) {
														field1336[field1221] = "Drop @lre@" + var19.field918;
														field1079[field1221] = 100;
														field1080[field1221] = var19.field916;
														field1077[field1221] = var14;
														field1078[field1221] = var11.field61;
														field1221++;
													}
												}
											}

											if (var11.field85) {
												field1336[field1221] = "Use @lre@" + var19.field918;
												field1079[field1221] = 102;
												field1080[field1221] = var19.field916;
												field1077[field1221] = var14;
												field1078[field1221] = var11.field61;
												field1221++;
											}

											if (var11.field84 && var19.field933 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field933[var21] != null) {
														field1336[field1221] = var19.field933[var21] + " @lre@" + var19.field918;

														if (var21 == 0) {
															field1079[field1221] = 694;
														}

														if (var21 == 1) {
															field1079[field1221] = 962;
														}

														if (var21 == 2) {
															field1079[field1221] = 795;
														}

														field1080[field1221] = var19.field916;
														field1077[field1221] = var14;
														field1078[field1221] = var11.field61;
														field1221++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1336[field1221] = var11.field92[var22] + " @lre@" + var19.field918;

														if (var22 == 0) {
															field1079[field1221] = 582;
														}

														if (var22 == 1) {
															field1079[field1221] = 113;
														}

														if (var22 == 2) {
															field1079[field1221] = 555;
														}

														if (var22 == 3) {
															field1079[field1221] = 331;
														}

														if (var22 == 4) {
															field1079[field1221] = 354;
														}

														field1080[field1221] = var19.field916;
														field1077[field1221] = var14;
														field1078[field1221] = var11.field61;
														field1221++;
													}
												}
											}

											field1336[field1221] = "Examine @lre@" + var19.field918;
											field1079[field1221] = 1328;
											field1080[field1221] = var19.field916;
											field1077[field1221] = var14;
											field1078[field1221] = var11.field61;
											field1221++;
										} else if ((field1453 & 0x10) == 0x10) {
											field1336[field1221] = field1454 + " @lre@" + var19.field918;
											field1079[field1221] = 563;
											field1080[field1221] = var19.field916;
											field1077[field1221] = var14;
											field1078[field1221] = var11.field61;
											field1221++;
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

	@ObfuscatedName("client.a(IIIIIZIIIIII)Z")
	public final boolean method510(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1327[var14][var15] = 0;
				field1132[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg0;
		field1327[arg6][arg0] = 99;
		field1132[arg6][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1292[var18] = arg6;
		int var35 = var18 + 1;
		field1293[var18] = arg0;
		boolean var20 = false;
		int var21 = field1292.length;
		int[][] var22 = field1151[field1366].field964;
		while (var35 != var19) {
			var16 = field1292[var19];
			var17 = field1293[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field1151[field1366].method368(arg1, arg9, arg7, arg10 - 1, var17, var16)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field1151[field1366].method369(arg10 - 1, var17, arg9, arg7, var16, arg1)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg8 != 0 && field1151[field1366].method370(arg8, arg7, arg2, arg9, var16, var17, arg3)) {
				var20 = true;
				break;
			}

			int var23 = field1132[var16][var17] + 1;
			if (var16 > 0 && field1327[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1292[var35] = var16 - 1;
				field1293[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1327[var16 - 1][var17] = 2;
				field1132[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1327[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1292[var35] = var16 + 1;
				field1293[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1327[var16 + 1][var17] = 8;
				field1132[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1327[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1292[var35] = var16;
				field1293[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1327[var16][var17 - 1] = 1;
				field1132[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1327[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1292[var35] = var16;
				field1293[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1327[var16][var17 + 1] = 4;
				field1132[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1327[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1292[var35] = var16 - 1;
				field1293[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1327[var16 - 1][var17 - 1] = 3;
				field1132[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1327[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1292[var35] = var16 + 1;
				field1293[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1327[var16 + 1][var17 - 1] = 9;
				field1132[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1327[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1292[var35] = var16 - 1;
				field1293[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1327[var16 - 1][var17 + 1] = 6;
				field1132[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1327[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1292[var35] = var16 + 1;
				field1293[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1327[var16 + 1][var17 + 1] = 12;
				field1132[var16 + 1][var17 + 1] = var23;
			}
		}

		field1406 = 0;
		if (!var20) {
			if (arg4) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1132[var26][var27] < var24) {
								var24 = field1132[var26][var27];
								var16 = var26;
								var17 = var27;
								field1406 = 1;
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
		field1292[var28] = var16;
		int var36 = var28 + 1;
		field1293[var28] = var17;
		int var29;
		int var30 = var29 = field1327[var16][var17];
		while (arg6 != var16 || arg0 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1292[var36] = var16;
				field1293[var36++] = var17;
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

			var30 = field1327[var16][var17];
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
		int var32 = field1292[var36];
		int var33 = field1293[var36];

		if (arg5 == 0) {
			field1102.method218(102);
			field1102.method219(var31 + var31 + 3);
		}

		if (arg5 == 1) {
			field1102.method218(170);
			field1102.method219(var31 + var31 + 3 + 14);
		}

		if (arg5 == 2) {
			field1102.method218(15);
			field1102.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1102.method219(1);
		} else {
			field1102.method219(0);
		}

		field1102.method220(field1157 + var32);
		field1102.method220(field1158 + var33);
		field1224 = field1292[0];
		field1225 = field1293[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1102.method219(field1292[var36] - var32);
			field1102.method219(field1293[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method511(String arg0) {
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

	@ObfuscatedName("client.m(B)V")
	public final void method512() {
		int var1 = field1265;
		int var2 = field1266;
		int var3 = field1267;
		int var4 = field1268;
		int var5 = 0x5D5447;
		class33.method157(var1, var3, var5, var2, var4);
		class33.method157(var1 + 1, var3 - 2, 0, var2 + 1, 16);
		class33.method158(var3 - 2, var2 + 18, var1 + 1, var4 - 19, 0);
		field1213.method206("Choose Option", var5, var2 + 14, var1 + 3);
		int var6 = field17;
		int var7 = field18;
		if (field1264 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1264 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1264 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1221; var8++) {
			int var9 = (field1221 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1213.method210(var1 + 3, var10, field1336[var8], true, var9);
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method513(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field1463[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1094[var6][var4][var5] + field1094[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1094[var6][var4][var5 + 1] + field1094[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method514(int arg0) {
		int[] var2 = field1226.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1463[arg0][var7][var5] & 0x18) == 0) {
					field1425.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1463[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1425.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1226.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1463[arg0][var11][var10] & 0x18) == 0) {
					method544(var11, var9, var8, var10, arg0);
				}

				if (arg0 < 3 && (field1463[arg0 + 1][var11][var10] & 0x8) != 0) {
					method544(var11, var9, var8, var10, arg0 + 1);
				}
			}
		}

		field1284.method258();
		field1192 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1425.method79(field1366, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field849;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1151[field1366].field964;
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

						field1315[field1192] = field1076[var15];
						field1193[field1192] = var16;
						field1194[field1192] = var17;
						field1192++;
					}
				}
			}
		}

		field1227++;
		if (field1227 > 112) {
			field1227 = 0;
			field1102.method218(65);
			field1102.method219(50);
		}
	}

	@ObfuscatedName("client.b(BLd;)V")
	public final void method515(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1183 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1183 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1183 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1182;
				if (field1183 != 2) {
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
					arg0.field97 = field1112[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1182;
			if (field1183 != 2) {
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
				if (field1398[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1398[var2] == field1367) {
					arg0.field97 = "@gre@World-" + (field1398[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1398[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1182;
			if (field1183 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1183 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1183 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1337;
				if (field1183 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1479[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1337 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1116 / 40.0D) * 256.0D) & 0x7FF;

			if (field1248) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1320[var7];
					if (var8 >= 0 && !class64.field979[var8].method377()) {
						return;
					}
				}

				field1248 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1320[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field979[var12].method378();
					}
				}

				class31 var13 = new class31(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1351[var14] != 0) {
						var13.method140(field1405[var14][0], field1405[var14][field1351[var14]]);

						if (var14 == 1) {
							var13.method140(field1472[0], field1472[field1351[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field997[field1205.field365].field999[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field1106 == null) {
				field1106 = arg0.field103;
				field1107 = arg0.field104;
			}

			if (field1388) {
				arg0.field103 = field1107;
			} else {
				arg0.field103 = field1106;
			}
		} else if (var2 == 325) {
			if (field1106 == null) {
				field1106 = arg0.field103;
				field1107 = arg0.field104;
			}

			if (field1388) {
				arg0.field103 = field1106;
			} else {
				arg0.field103 = field1107;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1195;
			if (field1116 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1263 < 1) {
				arg0.field97 = "";
			} else if (field1299) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1390 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1449 == 0) {
					var15 = "earlier today";
				} else if (field1449 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1449 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1344 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1344 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1344 > 1) {
				arg0.field97 = field1344 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1223 == 201) {
				if (field1104 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1223 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1223 == 0) {
					var16 = "Earlier today";
				} else if (field1223 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1223 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1223 == 201) {
				if (field1104 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1223 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1223 == 201) {
				if (field1104 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1223 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method516(int arg0, int arg1) {
		class41 var3 = field1133[field1366][arg0][arg1];
		if (var3 == null) {
			field1425.method71(field1366, arg0, arg1);
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
			field1425.method57(var5, var12, method513(field1366, arg0 * 128 + 64, arg1 * 128 + 64), var9, arg0, arg1, field1366, var10);
		}
	}

	@ObfuscatedName("client.e(III)Z")
	public final boolean method517(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method517(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method495(var6);
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

	@ObfuscatedName("client.a(JZ)V")
	public final void method518(long arg0) {
		if (arg0 != 0L) {
			if (field1182 >= 100 && field1397 != 1) {
				method519(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field1182 >= 200) {
				method519(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1182; var4++) {
					if (field1134[var4] == arg0) {
						method519(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1337; var5++) {
					if (field1479[var5] == arg0) {
						method519(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field1205.field416)) {
					field1112[field1182] = var3;
					field1134[field1182] = arg0;
					field1398[field1182] = 0;
					field1182++;
					field1164 = true;
					field1102.method218(72);
					field1102.method225(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;Ljava/lang/String;)V")
	public final void method519(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1172 != -1) {
			field1173 = arg1;
			field23 = 0;
		}

		if (field1181 == -1) {
			field1392 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1202[var4] = field1202[var4 - 1];
			field1203[var4] = field1203[var4 - 1];
			field1204[var4] = field1204[var4 - 1];
		}

		field1202[0] = arg0;
		field1203[0] = arg2;
		field1204[0] = arg1;
	}

	@ObfuscatedName("client.v(I)V")
	public static final void method520() {
		class18.field258 = false;
		class34.field573 = false;
		field1370 = false;
		class3.field32 = false;
		class57.field822 = false;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method521() {
		for (class40 var1 = (class40) field1230.method248(); var1 != null; var1 = (class40) field1230.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method463(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.a(BILib;I)V")
	public final void method522(int arg0, class35 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1422 + field1273 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1110 + 256);
			var7 = var7 * 256 / (field1110 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1199.method191(15, 15, 256, var12 + 94 + 4 - 10, 83 - var13 - 20, 20, 20, var10);
		} else {
			method500(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public final String method523(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(JZ)V")
	public final void method524(long arg0) {
		if (arg0 != 0L) {
			if (field1337 >= 100) {
				method519(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1337; var4++) {
					if (field1479[var4] == arg0) {
						method519(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1182; var5++) {
					if (field1134[var5] == arg0) {
						method519(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field1479[field1337++] = arg0;
				field1164 = true;
				field1102.method218(131);
				field1102.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;Z)Z")
	public final boolean method525(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1336[field1221] = "Remove @whi@" + arg0.field97;
				field1079[field1221] = 884;
				field1221++;
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

		field1336[field1221] = "Remove @whi@" + field1112[var2];
		field1079[field1221] = 513;
		field1221++;
		field1336[field1221] = "Message @whi@" + field1112[var2];
		field1079[field1221] = 902;
		field1221++;
		return true;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method526() {
		if (field1298 > 0) {
			method450();
		} else {
			field1284.method258();
			field1212.method202("Connection lost", 144, 0, 257);
			field1212.method202("Connection lost", 143, 0xFFFFFF, 256);
			field1212.method202("Please wait - attempting to reestablish", 159, 0, 257);
			field1212.method202("Please wait - attempting to reestablish", 158, 0xFFFFFF, 256);
			field1284.method259(field9, 4, 4);
			field1232 = 0;
			field1224 = 0;
			class5 var1 = field1201;
			field1413 = false;
			field1105 = 0;
			method553(field1460, field1461, true);

			if (!field1413) {
				method450();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 303);

			if (arg0.length == 5) {
				field1367 = Integer.parseInt(arg0[0]);
				field1368 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method478();
				} else if (arg0[2].equals("highmem")) {
					method520();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1369 = false;
				} else if (arg0[3].equals("members")) {
					field1369 = true;
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

	@ObfuscatedName("client.a(IZIILgc;)V")
	public final void method527(int arg0, int arg1, int arg2, class59 arg3) {
		if (field1221 < 400) {
			if (arg3.field906 != null) {
				arg3 = arg3.method345();
			}

			if (arg3 != null) {
				String var5 = arg3.field881;
				if (arg3.field898 != 0) {
					var5 = var5 + method439(field1205.field422, arg3.field898) + " (level-" + arg3.field898 + ")";
				}

				if (field1256 == 1) {
					field1336[field1221] = "Use " + field1260 + " with @yel@" + var5;
					field1079[field1221] = 829;
					field1080[field1221] = arg0;
					field1077[field1221] = arg2;
					field1078[field1221] = arg1;
					field1221++;
				} else if (field1451 != 1) {
					if (arg3.field893 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field893[var6] != null && !arg3.field893[var6].equalsIgnoreCase("attack")) {
								field1336[field1221] = arg3.field893[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1079[field1221] = 242;
								}

								if (var6 == 1) {
									field1079[field1221] = 209;
								}

								if (var6 == 2) {
									field1079[field1221] = 309;
								}

								if (var6 == 3) {
									field1079[field1221] = 852;
								}

								if (var6 == 4) {
									field1079[field1221] = 793;
								}

								field1080[field1221] = arg0;
								field1077[field1221] = arg2;
								field1078[field1221] = arg1;
								field1221++;
							}
						}
					}

					if (arg3.field893 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field893[var7] != null && arg3.field893[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field898 > field1205.field422) {
									var8 = 2000;
								}

								field1336[field1221] = arg3.field893[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1079[field1221] = var8 + 242;
								}

								if (var7 == 1) {
									field1079[field1221] = var8 + 209;
								}

								if (var7 == 2) {
									field1079[field1221] = var8 + 309;
								}

								if (var7 == 3) {
									field1079[field1221] = var8 + 852;
								}

								if (var7 == 4) {
									field1079[field1221] = var8 + 793;
								}

								field1080[field1221] = arg0;
								field1077[field1221] = arg2;
								field1078[field1221] = arg1;
								field1221++;
							}
						}
					}

					field1336[field1221] = "Examine @yel@" + var5;
					field1079[field1221] = 1714;
					field1080[field1221] = arg0;
					field1077[field1221] = arg2;
					field1078[field1221] = arg1;
					field1221++;
				} else if ((field1453 & 0x2) == 2) {
					field1336[field1221] = field1454 + " @yel@" + var5;
					field1079[field1221] = 240;
					field1080[field1221] = arg0;
					field1077[field1221] = arg2;
					field1078[field1221] = arg1;
					field1221++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1317.method199(arg3, arg0);
		field1318.method199(arg3, arg0 + arg4 - 16);
		class33.method157(arg3, 16, field1219, arg0 + 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
		class33.method157(arg3, 16, field1122, arg0 + var7 + 16, var6);
		class33.method162(arg3, field1196, var6, arg0 + var7 + 16);
		class33.method162(arg3 + 1, field1196, var6, arg0 + var7 + 16);
		class33.method160(field1196, 16, arg3, arg0 + var7 + 16);
		class33.method160(field1196, 16, arg3, arg0 + var7 + 17);
		class33.method162(arg3 + 15, field1127, var6, arg0 + var7 + 16);
		class33.method162(arg3 + 14, field1127, var6 - 1, arg0 + 17 + var7);
		class33.method160(field1127, 16, arg3, arg0 + var7 + var6 + 15);
		class33.method160(field1127, 15, arg3 + 1, arg0 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method529() {
		for (int var1 = -1; var1 < field1433; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1431;
			} else {
				var2 = field1434[var1];
			}

			class27 var3 = field1432[var2];
			if (var3 != null) {
				method480(1, var3);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method530() {
		if (field1130 != 0) {
			class37 var1 = field1212;
			int var2 = 0;
			if (field1140 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1204[var3] != null) {
					int var4 = field1202[var3];
					String var5 = field1203[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1245 == 0 || field1245 == 1 && method445(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206("From", 0, var7, var8);
						var1.method206("From", 0xFFFF, var7 - 1, var8);
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1082[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1082[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var5 + ": " + field1204[var3], 0, var7, var11);
						var1.method206(var5 + ": " + field1204[var3], 0xFFFF, var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1245 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(field1204[var3], 0, var9, 4);
						var1.method206(field1204[var3], 0xFFFF, var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1245 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206("To " + var5 + ": " + field1204[var3], 0, var10, 4);
						var1.method206("To " + var5 + ": " + field1204[var3], 0xFFFF, var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method531() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1103) {
			field1468 = false;
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

		if (field1185) {
			field1468 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1217) {
			field1468 = false;
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

	@ObfuscatedName("client.b(BIII)I")
	public final int method532(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method533() {
		if (field1253 == 0) {
			int var1 = field23;
			if (field1451 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1401) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1264 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1264 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1264 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1265 - 10 || var2 > field1267 + field1265 + 10 || var3 < field1266 - 10 || var3 > field1268 + field1266 + 10) {
						field1401 = false;

						if (field1264 == 1) {
							field1164 = true;
						}

						if (field1264 == 2) {
							field1392 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1265;
					int var5 = field1266;
					int var6 = field1267;
					int var7 = field24;
					int var8 = field25;
					if (field1264 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1264 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1264 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1221; var10++) {
						int var11 = (field1221 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method442(var9);
					}

					field1401 = false;

					if (field1264 == 1) {
						field1164 = true;
					}

					if (field1264 == 2) {
						field1392 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1221 > 0) {
					int var12 = field1079[field1221 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1077[field1221 - 1];
						int var14 = field1078[field1221 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1190 = false;
							field1345 = 0;
							field1251 = var14;
							field1252 = var13;
							field1253 = 2;
							field1254 = field24;
							field1255 = field25;

							if (class4.field56[var14].field62 == field1072) {
								field1253 = 1;
							}

							if (class4.field56[var14].field62 == field1181) {
								field1253 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1261 == 1 || method542(field1221 - 1)) && field1221 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1221 > 0) {
					method442(field1221 - 1);
				}

				if (var1 != 2 || field1221 <= 0) {
					return;
				}

				method490();
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method534() {
		field1149 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1468) {
				field1322++;
				method505();
				method505();
				method446();
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

		field1149 = false;
	}

	@ObfuscatedName("client.a(Ld;II)I")
	public final int method535(class4 arg0, int arg1) {
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
					var8 = field1115[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1399[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1301[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field910 && (!class60.method348(var11).field931 || field1369)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1073[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1331[field1399[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1073[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1205.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1013; var13++) {
						if (class67.field1015[var13]) {
							var8 += field1399[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field910 && (!class60.method348(var15).field931 || field1369)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1191;
				}

				if (var7 == 12) {
					var8 = field1126;
				}

				if (var7 == 13) {
					int var17 = field1073[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1031[var19];
					int var21 = var20.field1033;
					int var22 = var20.field1034;
					int var23 = var20.field1035;
					int var24 = field1343[var23 - var22];
					var8 = field1073[var21] >> var22 & var24;
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
					var8 = (field1205.field360 >> 7) + field1157;
				}

				if (var7 == 19) {
					var8 = (field1205.field361 >> 7) + field1158;
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

	@ObfuscatedName("client.z(I)V")
	public final void method536() {
		field1102.method218(153);

		if (field1061 != -1) {
			field1061 = -1;
			field1164 = true;
			field1474 = false;
			field1409 = true;
		}

		if (field1181 != -1) {
			field1181 = -1;
			field1392 = true;
			field1474 = false;
		}

		field1072 = -1;
	}

	@ObfuscatedName("client.a(ILab;III)V")
	public final void method537(int arg0, class27 arg1, int arg2, int arg3) {
		if (field1205 != arg1 && field1221 < 400) {
			String var5;
			if (arg1.field423 == 0) {
				var5 = arg1.field416 + method439(field1205.field422, arg1.field422) + " (level-" + arg1.field422 + ")";
			} else {
				var5 = arg1.field416 + " (skill-" + arg1.field423 + ")";
			}

			if (field1256 == 1) {
				field1336[field1221] = "Use " + field1260 + " with @whi@" + var5;
				field1079[field1221] = 275;
				field1080[field1221] = arg0;
				field1077[field1221] = arg3;
				field1078[field1221] = arg2;
				field1221++;
			} else if (field1451 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1120[var6] != null) {
						field1336[field1221] = field1120[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1120[var6].equalsIgnoreCase("attack")) {
							if (arg1.field422 > field1205.field422) {
								var7 = 2000;
							}

							if (field1205.field439 != 0 && arg1.field439 != 0) {
								if (field1205.field439 == arg1.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1121[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1079[field1221] = var7 + 639;
						}

						if (var6 == 1) {
							field1079[field1221] = var7 + 499;
						}

						if (var6 == 2) {
							field1079[field1221] = var7 + 27;
						}

						if (var6 == 3) {
							field1079[field1221] = var7 + 387;
						}

						if (var6 == 4) {
							field1079[field1221] = var7 + 185;
						}

						field1080[field1221] = arg0;
						field1077[field1221] = arg3;
						field1078[field1221] = arg2;
						field1221++;
					}
				}
			} else if ((field1453 & 0x8) == 8) {
				field1336[field1221] = field1454 + " @whi@" + var5;
				field1079[field1221] = 131;
				field1080[field1221] = arg0;
				field1077[field1221] = arg3;
				field1078[field1221] = arg2;
				field1221++;
			}

			for (int var8 = 0; var8 < field1221; var8++) {
				if (field1079[var8] == 718) {
					field1336[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method538(boolean arg0) {
		method539();
		field1306.method258();
		field1287.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1119 == 0) {
			int var4 = var3 / 2 + 80;
			field1211.method203(var2 / 2, 0x75A9A9, field1108.field732, var4, true);
			int var5 = var3 / 2 - 20;
			field1213.method203(var2 / 2, 0xFFFF00, "Welcome to RuneScape", var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1288.method199(var6 - 73, var7 - 20);
			field1213.method203(var6, 0xFFFFFF, "New User", var7 + 5, true);
			int var8 = var2 / 2 + 80;
			field1288.method199(var8 - 73, var7 - 20);
			field1213.method203(var8, 0xFFFFFF, "Existing User", var7 + 5, true);
		}

		if (field1119 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1414.length() > 0) {
				field1213.method203(var2 / 2, 0xFFFF00, field1414, var9 - 15, true);
				field1213.method203(var2 / 2, 0xFFFF00, field1415, var9, true);
				var9 += 30;
			} else {
				field1213.method203(var2 / 2, 0xFFFF00, field1415, var9 - 7, true);
				var9 += 30;
			}

			field1213.method210(var2 / 2 - 90, 0xFFFFFF, "Username: " + field1460 + (field1363 == 0 & field1116 % 40 < 20 ? "@yel@|" : ""), true, var9);
			var9 += 15;
			field1213.method210(var2 / 2 - 88, 0xFFFFFF, "Password: " + class51.method305(field1461) + (field1363 == 1 & field1116 % 40 < 20 ? "@yel@|" : ""), true, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1288.method199(var10 - 73, var11 - 20);
				field1213.method203(var10, 0xFFFFFF, "Login", var11 + 5, true);
				int var12 = var2 / 2 + 80;
				field1288.method199(var12 - 73, var11 - 20);
				field1213.method203(var12, 0xFFFFFF, "Cancel", var11 + 5, true);
			}
		}

		if (field1119 == 3) {
			field1213.method203(var2 / 2, 0xFFFF00, "Create a free account", var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			field1213.method203(var2 / 2, 0xFFFFFF, "To create a new account you need to", var13, true);
			var13 += 15;
			field1213.method203(var2 / 2, 0xFFFFFF, "go back to the main RuneScape webpage", var13, true);
			var13 += 15;
			field1213.method203(var2 / 2, 0xFFFFFF, "and choose the red 'create account'", var13, true);
			var13 += 15;
			field1213.method203(var2 / 2, 0xFFFFFF, "button at the top right of that page.", var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1288.method199(var14 - 73, var15 - 20);
			field1213.method203(var14, 0xFFFFFF, "Cancel", var15 + 5, true);
		}

		field1306.method259(field9, 171, 202);

		if (field1198) {
			field1198 = false;
			field1304.method259(field9, 0, 128);
			field1305.method259(field9, 371, 202);
			field1309.method259(field9, 265, 0);
			field1310.method259(field9, 265, 562);
			field1311.method259(field9, 171, 128);
			field1312.method259(field9, 171, 562);
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method539() {
		if (field1304 == null) {
			field10 = null;
			field1285 = null;
			field1283 = null;
			field1282 = null;
			field1284 = null;
			field1357 = null;
			field1358 = null;
			field1359 = null;
			field1307 = new class43(128, 265, method11());
			class33.method155();
			field1308 = new class43(128, 265, method11());
			class33.method155();
			field1304 = new class43(509, 171, method11());
			class33.method155();
			field1305 = new class43(360, 132, method11());
			class33.method155();
			field1306 = new class43(360, 200, method11());
			class33.method155();
			field1309 = new class43(202, 238, method11());
			class33.method155();
			field1310 = new class43(203, 238, method11());
			class33.method155();
			field1311 = new class43(74, 94, method11());
			class33.method155();
			field1312 = new class43(75, 94, method11());
			class33.method155();

			if (field1389 != null) {
				method470();
				method441();
			}

			field1198 = true;
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method540() {
		if (field1113 == 2) {
			method492((field1240 - field1158 << 7) + field1243, (field1239 - field1157 << 7) + field1242, field1241 * 2);

			if (field1416 > -1 && field1116 % 20 < 10) {
				field1319[2].method186(field1416 - 12, field1417 - 28);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method541() {
		class57.field866.method103();
		class57.field867.method103();
		class59.field909.method103();
		class60.field956.method103();
		class60.field957.method103();
		class27.field440.method103();
		class68.field1029.method103();
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method542(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1079[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method543() {
		int var1 = field1135 * 128 + 64;
		int var2 = field1136 * 128 + 64;
		int var3 = method513(field1366, var1, var2) - field1137;

		if (field1167 < var1) {
			field1167 += (var1 - field1167) * field1139 / 1000 + field1138;
			if (field1167 > var1) {
				field1167 = var1;
			}
		}

		if (field1167 > var1) {
			field1167 -= (field1167 - var1) * field1139 / 1000 + field1138;
			if (field1167 < var1) {
				field1167 = var1;
			}
		}

		if (field1168 < var3) {
			field1168 += (var3 - field1168) * field1139 / 1000 + field1138;
			if (field1168 > var3) {
				field1168 = var3;
			}
		}

		if (field1168 > var3) {
			field1168 -= (field1168 - var3) * field1139 / 1000 + field1138;
			if (field1168 < var3) {
				field1168 = var3;
			}
		}

		if (field1169 < var2) {
			field1169 += (var2 - field1169) * field1139 / 1000 + field1138;
			if (field1169 > var2) {
				field1169 = var2;
			}
		}

		if (field1169 > var2) {
			field1169 -= (field1169 - var2) * field1139 / 1000 + field1138;
			if (field1169 < var2) {
				field1169 = var2;
			}
		}

		int var4 = field1442 * 128 + 64;
		int var5 = field1443 * 128 + 64;
		int var6 = method513(field1366, var4, var5) - field1444;
		int var7 = var4 - field1167;
		int var8 = var6 - field1168;
		int var9 = var5 - field1169;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1170 < var11) {
			field1170 += (var11 - field1170) * field1446 / 1000 + field1445;
			if (field1170 > var11) {
				field1170 = var11;
			}
		}

		if (field1170 > var11) {
			field1170 -= (field1170 - var11) * field1446 / 1000 + field1445;
			if (field1170 < var11) {
				field1170 = var11;
			}
		}

		int var13 = var12 - field1171;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1171 += field1446 * var13 / 1000 + field1445;
			field1171 &= 0x7FF;
		}

		if (var13 < 0) {
			field1171 -= -var13 * field1446 / 1000 + field1445;
			field1171 &= 0x7FF;
		}

		int var14 = var12 - field1171;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1171 = var12;
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field1217 || field1103 || field1185) {
			method531();
		} else {
			field1147++;

			if (field1413) {
				method486();
			} else {
				method538(false);
			}

			field1412 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method544(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1425.method76(arg4, arg0, arg3);
		if (var6 != 0) {
			int var7 = field1425.method80(arg4, arg0, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field1226.field596;
			int var12 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
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
				class36 var15 = field1335[var14.field850];
				if (var15 != null) {
					int var16 = (var14.field836 * 4 - var15.field605) / 2;
					int var17 = (var14.field837 * 4 - var15.field606) / 2;
					var15.method199(arg0 * 4 + var16 + 48, (104 - arg3 - var14.field837) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1425.method78(arg4, arg0, arg3);
		if (var18 != 0) {
			int var19 = field1425.method80(arg4, arg0, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field850 != -1) {
				class36 var24 = field1335[var23.field850];
				if (var24 != null) {
					int var25 = (var23.field836 * 4 - var24.field605) / 2;
					int var26 = (var23.field837 * 4 - var24.field606) / 2;
					var24.method199(arg0 * 4 + var25 + 48, (104 - arg3 - var23.field837) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1226.field596;
				int var29 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field1425.method79(arg4, arg0, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field850 != -1) {
				class36 var33 = field1335[var32.field850];
				if (var33 != null) {
					int var34 = (var32.field836 * 4 - var33.field605) / 2;
					int var35 = (var32.field837 * 4 - var33.field606) / 2;
					var33.method199(arg0 * 4 + var34 + 48, (104 - arg3 - var32.field837) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method13(String arg0, int arg1) {
		field1081 = arg1;
		field1342 = arg0;
		method539();

		if (field1389 == null) {
			super.method13(arg0, arg1);
		} else {
			field1306.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1213.method202("RuneScape is loading - please wait...", var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(304, var6, var3 / 2 - 152, 34, 0x8C1111);
			class33.method158(302, var6 + 1, var3 / 2 - 151, 32, 0);
			class33.method157(var3 / 2 - 150, arg1 * 3, 0x8C1111, var6 + 2, 30);
			class33.method157(arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 0, var6 + 2, 30);
			field1213.method202(arg0, var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2);
			field1306.method259(field9, 171, 202);

			if (field1198) {
				field1198 = false;

				if (!field1468) {
					field1307.method259(field9, 0, 0);
					field1308.method259(field9, 0, 637);
				}

				field1304.method259(field9, 0, 128);
				field1305.method259(field9, 371, 202);
				field1309.method259(field9, 265, 0);
				field1310.method259(field9, 265, 562);
				field1311.method259(field9, 171, 128);
				field1312.method259(field9, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.B(I)Ljava/net/Socket;")
	public final Socket method545(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.C(I)V")
	public final void method546() {
		if (field1221 >= 2 || field1256 != 0 || field1451 != 0) {
			String var1;
			if (field1256 == 1 && field1221 < 2) {
				var1 = "Use " + field1260 + " with...";
			} else if (field1451 == 1 && field1221 < 2) {
				var1 = field1454 + "...";
			} else {
				var1 = field1336[field1221 - 1];
			}

			if (field1221 > 2) {
				var1 = var1 + "@whi@ / " + (field1221 - 2) + " more options";
			}

			field1213.method211(15, 0xFFFFFF, var1, field1116 / 1000, true, 4);
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method547() {
		if (field1232 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1422 + field1273 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1110 + 256) * var4 >> 8;
				var5 = (field1110 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1205.field360 + var6 >> 7;
				int var9 = field1205.field361 - var7 >> 7;
				boolean var10 = method510(field1205.field411[0], 0, 0, 0, true, 1, field1205.field410[0], var8, 0, var9, 0);
				if (var10) {
					field1102.method219(var1);
					field1102.method219(var2);
					field1102.method220(field1273);
					field1102.method219(57);
					field1102.method219(field1422);
					field1102.method219(field1110);
					field1102.method219(89);
					field1102.method220(field1205.field360);
					field1102.method220(field1205.field361);
					field1102.method219(field1406);
					field1102.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method548() {
		method530();

		if (field1326 == 1) {
			field1464[field1325 / 100].method186(field1323 - 8 - 4, field1324 - 8 - 4);
		}

		if (field1326 == 2) {
			field1464[field1325 / 100 + 4].method186(field1323 - 8 - 4, field1324 - 8 - 4);
			field1372++;
			if (field1372 > 57) {
				field1372 = 0;
				field1102.method218(19);
			}
		}

		if (field1471 != -1) {
			method517(field1184, field1471);
			method487(0, 0, class4.field56[field1471], 0);
		}

		if (field1072 != -1) {
			method517(field1184, field1072);
			method487(0, 0, class4.field56[field1072], 0);
		}

		method475();

		if (!field1401) {
			method504();
			method546();
		} else if (field1264 == 0) {
			method512();
		}

		if (field1316 == 1) {
			field1319[1].method186(472, 296);
		}

		if (field1391) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1212.method201(var2, var1, var3, "Fps:" + field5);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1370) {
				int var7 = 0xFF0000;
			}

			field1212.method201(var2, var1, 0xFFFF00, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field1140 != 0) {
			int var8 = field1140 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1212.method206("System update in: " + var9 + ":0" + var8, 0xFFFF00, 329, 4);
			} else {
				field1212.method206("System update in: " + var9 + ":" + var8, 0xFFFF00, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method549(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.r(B)V")
	public final void method550() {
		field1248 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1320[var1] = -1;
			for (int var2 = 0; var2 < class64.field978; var2++) {
				if (!class64.field979[var2].field985 && class64.field979[var2].field980 == var1 + (field1388 ? 0 : 7)) {
					field1320[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method551(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method551(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void method552(class38 arg0, int arg1) {
		int var3 = arg0.method240(8);
		if (var3 < field1433) {
			for (int var4 = var3; var4 < field1433; var4++) {
				field1250[field1249++] = field1434[var4];
			}
		}

		if (var3 > field1433) {
			signlink.reporterror(field1460 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1433 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1434[var5];
			class27 var7 = field1432[var6];
			int var8 = arg0.method240(1);
			if (var8 == 0) {
				field1434[field1433++] = var6;
				var7.field405 = field1116;
			} else {
				int var9 = arg0.method240(2);
				if (var9 == 0) {
					field1434[field1433++] = var6;
					var7.field405 = field1116;
					field1436[field1435++] = var6;
				} else if (var9 == 1) {
					field1434[field1433++] = var6;
					var7.field405 = field1116;
					int var10 = arg0.method240(3);
					var7.method111(var10, false);
					int var11 = arg0.method240(1);
					if (var11 == 1) {
						field1436[field1435++] = var6;
					}
				} else if (var9 == 2) {
					field1434[field1433++] = var6;
					var7.field405 = field1116;
					int var12 = arg0.method240(3);
					var7.method111(var12, true);
					int var13 = arg0.method240(3);
					var7.method111(var13, true);
					int var14 = arg0.method240(1);
					if (var14 == 1) {
						field1436[field1435++] = var6;
					}
				} else if (var9 == 3) {
					field1250[field1249++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method553(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1414 = "";
				field1415 = "Connecting to server...";
				method538(true);
			}

			field1201 = new class5(method545(field1368 + 43594), this);
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1102.field621 = 0;
			field1102.method219(14);
			field1102.method219(var6);
			field1201.method42(field1102.field620, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field1201.method39();
			}

			int var8 = field1201.method39();
			int var9 = var8;

			if (var8 == 0) {
				field1201.method41(field1354.field620, 0, 8);
				field1354.field621 = 0;
				field1400 = field1354.method235();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1400 >> 32), (int) field1400 };
				field1102.field621 = 0;
				field1102.method219(10);
				field1102.method223(var10[0]);
				field1102.method223(var10[1]);
				field1102.method223(var10[2]);
				field1102.method223(var10[3]);
				field1102.method223(signlink.uid);
				field1102.method226(arg0);
				field1102.method226(arg1);
				field1102.method244(field1353, field1109);
				field1371.field621 = 0;

				if (arg2) {
					field1371.method219(18);
				} else {
					field1371.method219(16);
				}

				field1371.method219(field1102.field621 + 36 + 1 + 1 + 2);
				field1371.method219(255);
				field1371.method220(303);
				field1371.method219(field1370 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field1371.method223(field1179[var11]);
				}

				field1371.method227(field1102.field621, 0, field1102.field620);
				field1102.field625 = new class49(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field1247 = new class49(var10);
				field1201.method42(field1371.field620, 0, field1371.field621);
				var8 = field1201.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method553(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1263 = field1201.method39();
				field1216 = field1201.method39() == 1;
				field1373 = 0L;
				field1088 = 0;
				field1209.field871 = 0;
				field14 = true;
				field1146 = true;
				field1413 = true;
				field1102.field621 = 0;
				field1354.field621 = 0;
				field1295 = -1;
				field1174 = -1;
				field1175 = -1;
				field1176 = -1;
				field1294 = 0;
				field1296 = 0;
				field1140 = 0;
				field1298 = 0;
				field1113 = 0;
				field1221 = 0;
				field1401 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field1204[var13] = null;
				}

				field1256 = 0;
				field1451 = 0;
				field1128 = 0;
				field1328 = 0;
				field1123 = (int) (Math.random() * 100.0D) - 50;
				field1302 = (int) (Math.random() * 110.0D) - 55;
				field1279 = (int) (Math.random() * 80.0D) - 40;
				field1422 = (int) (Math.random() * 120.0D) - 60;
				field1110 = (int) (Math.random() * 30.0D) - 20;
				field1273 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1232 = 0;
				field1180 = -1;
				field1224 = 0;
				field1225 = 0;
				field1433 = 0;
				field1477 = 0;

				for (int var14 = 0; var14 < field1430; var14++) {
					field1432[var14] = null;
					field1437[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field1476[var15] = null;
				}

				field1205 = field1432[field1431] = new class27();
				field1408.method252();
				field1396.method252();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field1133[var16][var17][var18] = null;
						}
					}
				}

				field1230 = new class41();
				field1183 = 0;
				field1182 = 0;
				field1172 = -1;
				field1181 = -1;
				field1072 = -1;
				field1061 = -1;
				field1471 = -1;
				field1474 = false;
				field1269 = 3;
				field1426 = false;
				field1401 = false;
				field1424 = false;
				field1173 = null;
				field1316 = 0;
				field1270 = -1;
				field1388 = true;
				method550();

				for (int var19 = 0; var19 < 5; var19++) {
					field1351[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field1120[var20] = null;
					field1121[var20] = false;
				}

				field1233 = 0;
				field1208 = 0;
				field1450 = 0;
				field1290 = 0;
				field1281 = 0;
				field1186 = 0;
				field1218 = 0;
				field1207 = 0;
				field1289 = 0;
				method554();
			} else if (var8 == 3) {
				field1414 = "";
				field1415 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1414 = "Your account has been disabled.";
				field1415 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1414 = "Your account is already logged in.";
				field1415 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1414 = "RuneScape has been updated!";
				field1415 = "Please reload this page.";
			} else if (var8 == 7) {
				field1414 = "This world is full.";
				field1415 = "Please use a different world.";
			} else if (var8 == 8) {
				field1414 = "Unable to connect.";
				field1415 = "Login server offline.";
			} else if (var8 == 9) {
				field1414 = "Login limit exceeded.";
				field1415 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1414 = "Unable to connect.";
				field1415 = "Bad session id.";
			} else if (var8 == 11) {
				field1415 = "Login server rejected session.";
				field1415 = "Please try again.";
			} else if (var8 == 12) {
				field1414 = "You need a members account to login to this world.";
				field1415 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1414 = "Could not complete login.";
				field1415 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1414 = "The server is being updated.";
				field1415 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1413 = true;
				field1102.field621 = 0;
				field1354.field621 = 0;
				field1295 = -1;
				field1174 = -1;
				field1175 = -1;
				field1176 = -1;
				field1294 = 0;
				field1296 = 0;
				field1140 = 0;
				field1221 = 0;
				field1401 = false;
				field1286 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1414 = "Login attempts exceeded.";
				field1415 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1414 = "You are standing in a members-only area.";
				field1415 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1414 = "Invalid loginserver requested";
				field1415 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field1201.method39(); var21 >= 0; var21--) {
					field1414 = "You have only just left another world";
					field1415 = "Your profile will be transferred in: " + var21 + " seconds";
					method538(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method553(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field1414 = "Unexpected server response";
				field1415 = "Please try using a different world.";
			} else if (var9 != 0) {
				field1414 = "No response from server";
				field1415 = "Please try using a different world.";
			} else if (field1105 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field1105++;
				method553(arg0, arg1, arg2);
			} else {
				field1414 = "No response from loginserver";
				field1415 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field1414 = "";
			field1415 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method554() {
		if (field1285 == null) {
			method494();
			field10 = null;
			field1304 = null;
			field1305 = null;
			field1306 = null;
			field1307 = null;
			field1308 = null;
			field1309 = null;
			field1310 = null;
			field1311 = null;
			field1312 = null;
			field1285 = new class43(479, 96, method11());
			field1283 = new class43(172, 156, method11());
			class33.method155();
			field1340.method199(0, 0);
			field1282 = new class43(190, 261, method11());
			field1284 = new class43(512, 334, method11());
			class33.method155();
			field1357 = new class43(496, 50, method11());
			field1358 = new class43(269, 37, method11());
			field1359 = new class43(249, 45, method11());
			field1198 = true;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method555() {
		field1374 = 0;
		for (int var1 = -1; var1 < field1477 + field1433; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1205;
			} else if (var1 < field1433) {
				var2 = field1432[field1434[var1]];
			} else {
				var2 = field1476[field1478[var1 - field1433]];
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

				if (var1 >= field1433) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field904 >= 0 && var7.field904 < field1319.length) {
						method491(var2, var2.field406 + 15);

						if (field1416 > -1) {
							field1319[var7.field904].method186(field1416 - 12, field1417 - 30);
						}
					}

					if (field1113 == 1 && field1478[var1 - field1433] == field1484 && field1116 % 20 < 10) {
						method491(var2, var2.field406 + 15);

						if (field1416 > -1) {
							field1319[2].method186(field1416 - 12, field1417 - 28);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method491(var2, var2.field406 + 15);

						if (field1416 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1319[var6].method186(field1416 - 12, field1417 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1113 == 10 && field1434[var1] == field1117) {
						method491(var2, var2.field406 + 15);

						if (field1416 > -1) {
							field1319[7].method186(field1416 - 12, field1417 - var4);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1433 || field1410 == 0 || field1410 == 3 || field1410 == 1 && method445(((class27) var2).field416))) {
					method491(var2, var2.field406);

					if (field1416 > -1 && field1374 < field1375) {
						field1379[field1374] = field1213.method205(var2.field372) / 2;
						field1378[field1374] = field1213.field617;
						field1376[field1374] = field1416;
						field1377[field1374] = field1417;
						field1380[field1374] = var2.field374;
						field1381[field1374] = var2.field375;
						field1382[field1374] = var2.field373;
						field1383[field1374++] = var2.field372;

						if (field1467 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1378[field1374] += 10;
							field1377[field1374] += 5;
						}

						if (field1467 == 0 && var2.field375 == 4) {
							field1379[field1374] = 60;
						}

						if (field1467 == 0 && var2.field375 == 5) {
							field1378[field1374] += 5;
						}
					}
				}

				if (var2.field379 > field1116) {
					method491(var2, var2.field406 + 15);

					if (field1416 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(field1416 - 15, var8, 0xFF00, field1417 - 3, 5);
						class33.method157(field1416 + var8 - 15, 30 - var8, 0xFF0000, field1417 - 3, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1116) {
						method491(var2, var2.field406 / 2);

						if (field1416 > -1) {
							if (var9 == 1) {
								field1417 -= 20;
							}

							if (var9 == 2) {
								field1416 -= 15;
								field1417 -= 10;
							}

							if (var9 == 3) {
								field1416 += 15;
								field1417 -= 10;
							}

							field1210[var2.field377[var9]].method186(field1416 - 12, field1417 - 12);
							field1211.method202(String.valueOf(var2.field376[var9]), field1417 + 4, 0, field1416);
							field1211.method202(String.valueOf(var2.field376[var9]), field1417 + 3, 0xFFFFFF, field1416 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1374; var10++) {
			int var11 = field1376[var10];
			int var12 = field1377[var10];
			int var13 = field1379[var10];
			int var14 = field1378[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1377[var16] - field1378[var16] && var12 - var14 < field1377[var16] + 2 && var11 - var13 < field1379[var16] + field1376[var16] && var11 + var13 > field1376[var16] - field1379[var16] && field1377[var16] - field1378[var16] < var12) {
						var12 = field1377[var16] - field1378[var16];
						var15 = true;
					}
				}
			}

			field1416 = field1376[var10];
			field1417 = field1377[var10] = var12;
			String var17 = field1383[var10];
			if (field1467 == 0) {
				int var18 = 0xFFFF00;
				if (field1380[var10] < 6) {
					var18 = field1220[field1380[var10]];
				}

				if (field1380[var10] == 6) {
					var18 = field1277 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1380[var10] == 7) {
					var18 = field1277 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1380[var10] == 8) {
					var18 = field1277 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1380[var10] == 9) {
					int var19 = 150 - field1382[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1380[var10] == 10) {
					int var20 = 150 - field1382[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1380[var10] == 11) {
					int var21 = 150 - field1382[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1381[var10] == 0) {
					field1213.method202(var17, field1417 + 1, 0, field1416);
					field1213.method202(var17, field1417, var18, field1416);
				}

				if (field1381[var10] == 1) {
					field1213.method207(var17, 0, field1416, field1277, field1417 + 1);
					field1213.method207(var17, var18, field1416, field1277, field1417);
				}

				if (field1381[var10] == 2) {
					field1213.method208(field1277, var17, 0, field1417 + 1, field1416);
					field1213.method208(field1277, var17, var18, field1417, field1416);
				}

				if (field1381[var10] == 3) {
					field1213.method209(field1417 + 1, field1416, 150 - field1382[var10], 0, var17, field1277);
					field1213.method209(field1417, field1416, 150 - field1382[var10], var18, var17, field1277);
				}

				if (field1381[var10] == 4) {
					int var22 = field1213.method205(var17);
					int var23 = (150 - field1382[var10]) * (var22 + 100) / 150;
					class33.method154(0, field1416 - 50, 334, field1416 + 50);
					field1213.method206(var17, 0, field1417 + 1, field1416 + 50 - var23);
					field1213.method206(var17, var18, field1417, field1416 + 50 - var23);
					class33.method153();
				}

				if (field1381[var10] == 5) {
					int var24 = 150 - field1382[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(field1417 - field1213.field617 - 1, 0, field1417 + 5, 512);
					field1213.method202(var17, field1417 + var25 + 1, 0, field1416);
					field1213.method202(var17, field1417 + var25, var18, field1416);
					class33.method153();
				}
			} else {
				field1213.method202(var17, field1417 + 1, 0, field1416);
				field1213.method202(var17, field1417, 0xFFFF00, field1416);
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;Lab;IZ)V")
	public final void method556(int arg0, class38 arg1, class27 arg2, int arg3) {
		if ((arg0 & 0x1) == 1) {
			int var5 = arg1.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg1.method238(0, var5, var6);
			field1437[arg3] = var7;
			arg2.method116(var7);
		}

		if ((arg0 & 0x2) == 2) {
			int var8 = arg1.method231();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field388 == var8) {
				arg2.field392 = 0;
			}

			int var9 = arg1.method229();
			if (arg2.field388 == var8 && var8 != -1) {
				int var10 = class66.field997[var8].field1011;
				if (var10 == 1) {
					arg2.field389 = 0;
					arg2.field390 = 0;
					arg2.field391 = var9;
					arg2.field392 = 0;
				}

				if (var10 == 2) {
					arg2.field392 = 0;
				}
			} else if (var8 == -1 || arg2.field388 == -1 || class66.field997[var8].field1005 >= class66.field997[arg2.field388].field1005) {
				arg2.field388 = var8;
				arg2.field389 = 0;
				arg2.field390 = 0;
				arg2.field391 = var9;
				arg2.field392 = 0;
				arg2.field414 = arg2.field409;
			}
		}

		if ((arg0 & 0x4) == 4) {
			arg2.field382 = arg1.method231();
			if (arg2.field382 == 0xFFFF) {
				arg2.field382 = -1;
			}
		}

		if ((arg0 & 0x8) == 8) {
			arg2.field372 = arg1.method236();
			if (arg2.field372.charAt(0) == '~') {
				arg2.field372 = arg2.field372.substring(1);
				method519(2, arg2.field372, arg2.field416);
			} else if (field1205 == arg2) {
				method519(2, arg2.field372, arg2.field416);
			}

			arg2.field374 = 0;
			arg2.field375 = 0;
			arg2.field373 = 150;
		}

		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg1.method229();
			int var12 = arg1.method229();
			arg2.method114(var12, field1116, var11);
			arg2.field379 = field1116 + 300;
			arg2.field380 = arg1.method229();
			arg2.field381 = arg1.method229();
		}

		if ((arg0 & 0x20) == 0x20) {
			arg2.field383 = arg1.method231();
			arg2.field384 = arg1.method231();
		}

		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg1.method231();
			int var14 = arg1.method229();
			int var15 = arg1.method229();
			int var16 = arg1.field621;

			if (arg2.field416 != null && arg2.field417) {
				long var17 = class51.method300(arg2.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1337; var20++) {
						if (field1479[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1165 == 0) {
					try {
						String var21 = class52.method306(arg1, var15);
						var21 = class71.method401(var21);
						arg2.field372 = var21;
						arg2.field374 = var13 >> 8;
						arg2.field375 = var13 & 0xFF;
						arg2.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method519(1, var21, "@cr2@" + arg2.field416);
						} else if (var14 == 1) {
							method519(1, var21, "@cr1@" + arg2.field416);
						} else {
							method519(2, var21, arg2.field416);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field621 = var15 + var16;
		}

		if ((arg0 & 0x100) == 0x100) {
			arg2.field393 = arg1.method231();
			int var23 = arg1.method234();
			arg2.field397 = var23 >> 16;
			arg2.field396 = (var23 & 0xFFFF) + field1116;
			arg2.field394 = 0;
			arg2.field395 = 0;

			if (arg2.field396 > field1116) {
				arg2.field394 = -1;
			}

			if (arg2.field393 == 0xFFFF) {
				arg2.field393 = -1;
			}
		}

		if ((arg0 & 0x200) == 0x200) {
			arg2.field398 = arg1.method229();
			arg2.field400 = arg1.method229();
			arg2.field399 = arg1.method229();
			arg2.field401 = arg1.method229();
			arg2.field402 = arg1.method231() + field1116;
			arg2.field403 = arg1.method231() + field1116;
			arg2.field404 = arg1.method229();
			arg2.method112();
		}

		if ((arg0 & 0x400) == 0x400) {
			int var24 = arg1.method229();
			int var25 = arg1.method229();
			arg2.method114(var25, field1116, var24);
			arg2.field379 = field1116 + 300;
			arg2.field380 = arg1.method229();
			arg2.field381 = arg1.method229();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method557() {
		field1285.method258();
		class34.field584 = field1154;
		field1341.method199(0, 0);

		if (field1424) {
			field1213.method202(field1150, 40, 0, 239);
			field1213.method202(field1365 + "*", 60, 128, 239);
		} else if (field1426) {
			field1213.method202("Enter amount:", 40, 0, 239);
			field1213.method202(field1364 + "*", 60, 128, 239);
		} else if (field1173 != null) {
			field1213.method202(field1173, 40, 0, 239);
			field1213.method202("Click to continue", 60, 128, 239);
		} else if (field1181 != -1) {
			method487(0, 0, class4.field56[field1181], 0);
		} else if (field1172 == -1) {
			class37 var1 = field1212;
			int var2 = 0;
			class33.method154(0, 0, 77, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1204[var3] != null) {
					int var4 = field1202[var3];
					int var5 = field1352 + 70 - var2 * 14;
					String var6 = field1203[var3];
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
							var1.method206(field1204[var3], 0, var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1410 == 0 || field1410 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1082[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1082[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var6 + ":", 0, var5, var8);
							var8 += var1.method204(var6) + 8;
							var1.method206(field1204[var3], 255, var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1130 == 0 && (var4 == 7 || field1245 == 0 || field1245 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206("From", 0, var5, var9);
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1082[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1082[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var6 + ":", 0, var5, var11);
							var11 += var1.method204(var6) + 8;
							var1.method206(field1204[var3], 0x800000, var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field1349 == 0 || field1349 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1204[var3], 0x800080, var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field1130 == 0 && field1245 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(field1204[var3], 0x800000, var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field1130 == 0 && field1245 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206("To " + var6 + ":", 0, var5, 4);
							var1.method206(field1204[var3], 0x800000, var5, var1.method204("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field1349 == 0 || field1349 == 1 && method445(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var6 + " " + field1204[var3], 0x7E3200, var5, 4);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1091 = var2 * 14 + 7;
			if (field1091 < 78) {
				field1091 = 78;
			}

			method528(0, field1091, field1091 - field1352 - 77, 463, 77);
			String var10;
			if (field1205 == null || field1205.field416 == null) {
				var10 = class51.method304(field1460);
			} else {
				var10 = field1205.field416;
			}

			var1.method206(var10 + ":", 0, 90, 4);
			var1.method206(field1355 + "*", 255, 90, var1.method204(var10 + ": ") + 6);
			class33.method160(0, 479, 0, 77);
		} else {
			method487(0, 0, class4.field56[field1172], 0);
		}

		if (field1401 && field1264 == 2) {
			method512();
		}

		field1285.method259(field9, 357, 17);
		field1284.method258();
		class34.field584 = field1156;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method558() {
		if (field1256 == 0 && field1451 == 0) {
			field1336[field1221] = "Walk here";
			field1079[field1221] = 718;
			field1077[field1221] = field17;
			field1078[field1221] = field18;
			field1221++;
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

				if (var6 == 2 && field1425.method80(field1366, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field863 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1256 == 1) {
						field1336[field1221] = "Use " + field1260 + " with @cya@" + var8.field832;
						field1079[field1221] = 810;
						field1080[field1221] = var3;
						field1077[field1221] = var4;
						field1078[field1221] = var5;
						field1221++;
					} else if (field1451 != 1) {
						if (var8.field848 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field848[var9] != null) {
									field1336[field1221] = var8.field848[var9] + " @cya@" + var8.field832;

									if (var9 == 0) {
										field1079[field1221] = 625;
									}

									if (var9 == 1) {
										field1079[field1221] = 721;
									}

									if (var9 == 2) {
										field1079[field1221] = 743;
									}

									if (var9 == 3) {
										field1079[field1221] = 357;
									}

									if (var9 == 4) {
										field1079[field1221] = 1071;
									}

									field1080[field1221] = var3;
									field1077[field1221] = var4;
									field1078[field1221] = var5;
									field1221++;
								}
							}
						}

						field1336[field1221] = "Examine @cya@" + var8.field832;
						field1079[field1221] = 1381;
						field1080[field1221] = var8.field829 << 14;
						field1077[field1221] = var4;
						field1078[field1221] = var5;
						field1221++;
					} else if ((field1453 & 0x4) == 4) {
						field1336[field1221] = field1454 + " @cya@" + var8.field832;
						field1079[field1221] = 899;
						field1080[field1221] = var3;
						field1077[field1221] = var4;
						field1078[field1221] = var5;
						field1221++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1476[var7];
					if (var10.field415.field883 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1477; var11++) {
							class26 var12 = field1476[field1478[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field883 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method527(field1478[var11], var5, var4, var12.field415);
							}
						}

						for (int var13 = 0; var13 < field1433; var13++) {
							class27 var14 = field1432[field1434[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method537(field1434[var13], var14, var5, var4);
							}
						}
					}

					method527(var7, var5, var4, var10.field415);
				}

				if (var6 == 0) {
					class27 var15 = field1432[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1477; var16++) {
							class26 var17 = field1476[field1478[var16]];
							if (var17 != null && var17.field415.field883 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method527(field1478[var16], var5, var4, var17.field415);
							}
						}

						for (int var18 = 0; var18 < field1433; var18++) {
							class27 var19 = field1432[field1434[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method537(field1434[var18], var19, var5, var4);
							}
						}
					}

					method537(var7, var15, var5, var4);
				}

				if (var6 == 3) {
					class41 var20 = field1133[field1366][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1256 == 1) {
								field1336[field1221] = "Use " + field1260 + " with @lre@" + var22.field918;
								field1079[field1221] = 111;
								field1080[field1221] = var21.field455;
								field1077[field1221] = var4;
								field1078[field1221] = var5;
								field1221++;
							} else if (field1451 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field932 != null && var22.field932[var23] != null) {
										field1336[field1221] = var22.field932[var23] + " @lre@" + var22.field918;

										if (var23 == 0) {
											field1079[field1221] = 139;
										}

										if (var23 == 1) {
											field1079[field1221] = 778;
										}

										if (var23 == 2) {
											field1079[field1221] = 617;
										}

										if (var23 == 3) {
											field1079[field1221] = 224;
										}

										if (var23 == 4) {
											field1079[field1221] = 662;
										}

										field1080[field1221] = var21.field455;
										field1077[field1221] = var4;
										field1078[field1221] = var5;
										field1221++;
									} else if (var23 == 2) {
										field1336[field1221] = "Take @lre@" + var22.field918;
										field1079[field1221] = 617;
										field1080[field1221] = var21.field455;
										field1077[field1221] = var4;
										field1078[field1221] = var5;
										field1221++;
									}
								}

								field1336[field1221] = "Examine @lre@" + var22.field918;
								field1079[field1221] = 1152;
								field1080[field1221] = var21.field455;
								field1077[field1221] = var4;
								field1078[field1221] = var5;
								field1221++;
							} else if ((field1453 & 0x1) == 1) {
								field1336[field1221] = field1454 + " @lre@" + var22.field918;
								field1079[field1221] = 370;
								field1080[field1221] = var21.field455;
								field1077[field1221] = var4;
								field1078[field1221] = var5;
								field1221++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)I")
	public final int method559() {
		int var1 = 3;
		if (field1170 < 310) {
			int var2 = field1167 >> 7;
			int var3 = field1169 >> 7;
			int var4 = field1205.field360 >> 7;
			int var5 = field1205.field361 >> 7;

			if ((field1463[field1366][var2][var3] & 0x4) != 0) {
				var1 = field1366;
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

					if ((field1463[field1366][var2][var3] & 0x4) != 0) {
						var1 = field1366;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1463[field1366][var2][var3] & 0x4) != 0) {
							var1 = field1366;
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

					if ((field1463[field1366][var2][var3] & 0x4) != 0) {
						var1 = field1366;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1463[field1366][var2][var3] & 0x4) != 0) {
							var1 = field1366;
						}
					}
				}
			}
		}

		if ((field1463[field1366][field1205.field360 >> 7][field1205.field361 >> 7] & 0x4) != 0) {
			var1 = field1366;
		}

		return var1;
	}

	@ObfuscatedName("client.s(B)I")
	public final int method560() {
		int var1 = method513(field1366, field1167, field1169);
		if (var1 - field1168 < 800 && (field1463[field1366][field1167 >> 7][field1169 >> 7] & 0x4) != 0) {
			return field1366;
		}

		return 3;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method7() {
		if (!field1217 && !field1103 && !field1185) {
			field1116++;

			if (field1413) {
				method498();
			} else {
				method507();
			}

			method452();
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method561() {
		if (field1128 == 2) {
			for (class40 var1 = (class40) field1230.method248(); var1 != null; var1 = (class40) field1230.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field647, var1.field645))) {
						method506(var1.field645, var1.field638, var1.field640, var1.field641, var1.field639, var1.field647, var1.field646);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field644, var1.field642)) {
					method506(var1.field642, var1.field638, var1.field640, var1.field641, var1.field639, var1.field644, var1.field643);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.t(B)V")
	public final void method562() {
		int var1 = 5;
		field1179[8] = 0;
		int var2 = 0;
		while (field1179[8] == 0) {
			String var3 = "Unknown problem";
			method13("Connecting to web server", 20);

			try {
				DataInputStream var4 = method448("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 303);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1179[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1179[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1179[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1179[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1179[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1179[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1179[8] == 0) {
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

				field1189 = !field1189;
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1331[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1343[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
