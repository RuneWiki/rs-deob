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
	public int field1074;

	@ObfuscatedName("client.bb")
	public int field1075;

	@ObfuscatedName("client.cb")
	public class35[] field1076 = new class35[8];

	@ObfuscatedName("client.db")
	public class38 field1077 = class38.method217(1);

	@ObfuscatedName("client.eb")
	public String field1078;

	@ObfuscatedName("client.gb")
	public long field1079;

	@ObfuscatedName("client.hb")
	public class41 field1080 = new class41();

	@ObfuscatedName("client.jb")
	public int[] field1081;

	@ObfuscatedName("client.kb")
	public int[] field1082;

	@ObfuscatedName("client.lb")
	public int[] field1083;

	@ObfuscatedName("client.mb")
	public static BigInteger field1084 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.nb")
	public class43 field1085;

	@ObfuscatedName("client.ob")
	public class43 field1086;

	@ObfuscatedName("client.pb")
	public class43 field1087;

	@ObfuscatedName("client.qb")
	public static class27 field1088;

	@ObfuscatedName("client.rb")
	public int field1089;

	@ObfuscatedName("client.sb")
	public int field1090 = 1;

	@ObfuscatedName("client.tb")
	public int[] field1091 = new int[50];

	@ObfuscatedName("client.vb")
	public int field1092 = -1;

	@ObfuscatedName("client.xb")
	public static int field1093;

	@ObfuscatedName("client.yb")
	public int field1094;

	@ObfuscatedName("client.zb")
	public int field1095 = 128;

	@ObfuscatedName("client.ac")
	public boolean[] field1117 = new boolean[5];

	@ObfuscatedName("client.bc")
	public static int field1118;

	@ObfuscatedName("client.cc")
	public int field1119;

	@ObfuscatedName("client.dc")
	public int field1120;

	@ObfuscatedName("client.ec")
	public boolean field1121 = true;

	@ObfuscatedName("client.gc")
	public class48[] field1122 = new class48[5];

	@ObfuscatedName("client.hc")
	public int field1123;

	@ObfuscatedName("client.ic")
	public byte[][][] field1124;

	@ObfuscatedName("client.jc")
	public int field1125 = 3;

	@ObfuscatedName("client.kc")
	public class26[] field1126 = new class26[16384];

	@ObfuscatedName("client.lc")
	public int field1127;

	@ObfuscatedName("client.mc")
	public int[] field1128 = new int[16384];

	@ObfuscatedName("client.nc")
	public boolean field1129 = false;

	@ObfuscatedName("client.oc")
	public int field1130;

	@ObfuscatedName("client.pc")
	public int field1131 = 50;

	@ObfuscatedName("client.qc")
	public int[] field1132 = new int[field1131];

	@ObfuscatedName("client.rc")
	public int[] field1133 = new int[field1131];

	@ObfuscatedName("client.sc")
	public int[] field1134 = new int[field1131];

	@ObfuscatedName("client.K")
	public int field1060 = -1;

	@ObfuscatedName("client.N")
	public int[] field1062 = new int[50];

	@ObfuscatedName("client.P")
	public int field1064 = -1;

	@ObfuscatedName("client.Q")
	public String[] field1065 = new String[5];

	@ObfuscatedName("client.R")
	public boolean[] field1066 = new boolean[5];

	@ObfuscatedName("client.W")
	public int[] field1070 = new int[1000];

	@ObfuscatedName("client.X")
	public int[] field1071 = new int[1000];

	@ObfuscatedName("client.Eb")
	public boolean field1099 = false;

	@ObfuscatedName("client.Gb")
	public final int[] field1100 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Hb")
	public boolean field1101 = false;

	@ObfuscatedName("client.Ib")
	public int[] field1102 = new int[100];

	@ObfuscatedName("client.Jb")
	public String[] field1103 = new String[100];

	@ObfuscatedName("client.Kb")
	public String[] field1104 = new String[100];

	@ObfuscatedName("client.Mb")
	public boolean field1106 = false;

	@ObfuscatedName("client.Ub")
	public class35[] field1113 = new class35[1000];

	@ObfuscatedName("client.Vb")
	public int[] field1114 = new int[33];

	@ObfuscatedName("client.Xb")
	public String field1115 = "";

	@ObfuscatedName("client.Yb")
	public String field1116 = "";

	@ObfuscatedName("client.tc")
	public int[] field1135 = new int[field1131];

	@ObfuscatedName("client.uc")
	public int[] field1136 = new int[field1131];

	@ObfuscatedName("client.vc")
	public int[] field1137 = new int[field1131];

	@ObfuscatedName("client.wc")
	public int[] field1138 = new int[field1131];

	@ObfuscatedName("client.xc")
	public String[] field1139 = new String[field1131];

	@ObfuscatedName("client.Dc")
	public int field1142 = -1;

	@ObfuscatedName("client.Jc")
	public int[] field1148 = new int[4000];

	@ObfuscatedName("client.Kc")
	public int[] field1149 = new int[4000];

	@ObfuscatedName("client.Mc")
	public class41[][][] field1151 = new class41[4][104][104];

	@ObfuscatedName("client.Tc")
	public int[] field1158 = new int[class67.field1012];

	@ObfuscatedName("client.bd")
	public int field1166 = 2;

	@ObfuscatedName("client.cd")
	public boolean field1167 = true;

	@ObfuscatedName("client.dd")
	public boolean field1168 = false;

	@ObfuscatedName("client.jd")
	public long[] field1174 = new long[200];

	@ObfuscatedName("client.ld")
	public int field1176 = 2048;

	@ObfuscatedName("client.md")
	public int field1177 = 2047;

	@ObfuscatedName("client.nd")
	public class27[] field1178 = new class27[field1176];

	@ObfuscatedName("client.pd")
	public int[] field1180 = new int[field1176];

	@ObfuscatedName("client.rd")
	public int[] field1182 = new int[field1176];

	@ObfuscatedName("client.sd")
	public class38[] field1183 = new class38[field1176];

	@ObfuscatedName("client.td")
	public int field1184 = -1;

	@ObfuscatedName("client.yd")
	public boolean field1189 = false;

	@ObfuscatedName("client.Ad")
	public boolean field1191 = false;

	@ObfuscatedName("client.Id")
	public boolean field1198 = false;

	@ObfuscatedName("client.Jd")
	public class38 field1199 = class38.method217(1);

	@ObfuscatedName("client.Qd")
	public int[] field1204 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Yd")
	public String field1211 = "";

	@ObfuscatedName("client.ae")
	public int field1213 = -1;

	@ObfuscatedName("client.be")
	public int field1214 = -1;

	@ObfuscatedName("client.ke")
	public String field1222 = "";

	@ObfuscatedName("client.le")
	public String field1223 = "";

	@ObfuscatedName("client.oe")
	public int field1226 = 2;

	@ObfuscatedName("client.xe")
	public CRC32 field1233 = new CRC32();

	@ObfuscatedName("client.Ce")
	public boolean field1238 = false;

	@ObfuscatedName("client.Se")
	public int[] field1251 = new int[9];

	@ObfuscatedName("client.Te")
	public int[] field1252 = new int[5];

	@ObfuscatedName("client.Ue")
	public int[][] field1253 = new int[104][104];

	@ObfuscatedName("client.We")
	public String[] field1255 = new String[200];

	@ObfuscatedName("client.hf")
	public int field1265 = 0x766654;

	@ObfuscatedName("client.qf")
	public int[] field1272 = new int[151];

	@ObfuscatedName("client.tf")
	public class36[] field1275 = new class36[13];

	@ObfuscatedName("client.uf")
	public boolean field1276 = true;

	@ObfuscatedName("client.Af")
	public boolean field1282 = false;

	@ObfuscatedName("client.Bf")
	public boolean field1283 = false;

	@ObfuscatedName("client.Cf")
	public boolean field1284 = false;

	@ObfuscatedName("client.Hf")
	public boolean field1287 = false;

	@ObfuscatedName("client.Jf")
	public int field1289 = -1;

	@ObfuscatedName("client.Uf")
	public int field1300 = -1;

	@ObfuscatedName("client.Xf")
	public class41 field1303 = new class41();

	@ObfuscatedName("client.Yf")
	public int[] field1304 = new int[7];

	@ObfuscatedName("client.Zf")
	public String field1305 = "";

	@ObfuscatedName("client.bg")
	public int field1307 = 2;

	@ObfuscatedName("client.dg")
	public int[] field1309 = new int[1000];

	@ObfuscatedName("client.jg")
	public boolean field1315 = false;

	@ObfuscatedName("client.ng")
	public int field1319 = -1;

	@ObfuscatedName("client.tg")
	public boolean field1325 = false;

	@ObfuscatedName("client.wg")
	public class35[] field1328 = new class35[20];

	@ObfuscatedName("client.xg")
	public int[] field1329 = new int[2000];

	@ObfuscatedName("client.zg")
	public String field1330 = "";

	@ObfuscatedName("client.Ag")
	public int[] field1331 = new int[5];

	@ObfuscatedName("client.Dg")
	public int[] field1334 = new int[5];

	@ObfuscatedName("client.Eg")
	public long[] field1335 = new long[100];

	@ObfuscatedName("client.Fg")
	public int[] field1336 = new int[5];

	@ObfuscatedName("client.Gg")
	public class4 field1337 = new class4();

	@ObfuscatedName("client.Tg")
	public class36[] field1348 = new class36[100];

	@ObfuscatedName("client.Xg")
	public boolean field1351 = false;

	@ObfuscatedName("client.Yg")
	public int[] field1352 = new int[2000];

	@ObfuscatedName("client.ah")
	public int[] field1354 = new int[class67.field1012];

	@ObfuscatedName("client.bh")
	public boolean field1355 = false;

	@ObfuscatedName("client.ch")
	public class36[] field1356 = new class36[2];

	@ObfuscatedName("client.gh")
	public boolean field1359 = true;

	@ObfuscatedName("client.hh")
	public int[] field1360 = new int[256];

	@ObfuscatedName("client.jh")
	public byte[] field1361 = new byte[16384];

	@ObfuscatedName("client.oh")
	public int field1366 = 0x23201B;

	@ObfuscatedName("client.th")
	public boolean field1370 = true;

	@ObfuscatedName("client.uh")
	public boolean field1371 = false;

	@ObfuscatedName("client.vh")
	public int[] field1372 = new int[33];

	@ObfuscatedName("client.yh")
	public int field1375 = 1;

	@ObfuscatedName("client.zh")
	public int field1376 = -1;

	@ObfuscatedName("client.Ah")
	public int[] field1377 = new int[500];

	@ObfuscatedName("client.Bh")
	public int[] field1378 = new int[500];

	@ObfuscatedName("client.Ch")
	public int[] field1379 = new int[500];

	@ObfuscatedName("client.Dh")
	public int[] field1380 = new int[500];

	@ObfuscatedName("client.Eh")
	public int[] field1381 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Fh")
	public class35[] field1382 = new class35[20];

	@ObfuscatedName("client.Hh")
	public int field1384 = -1;

	@ObfuscatedName("client.Jh")
	public int[] field1386 = new int[5];

	@ObfuscatedName("client.Kh")
	public final int field1387 = 100;

	@ObfuscatedName("client.Lh")
	public int[] field1388 = new int[100];

	@ObfuscatedName("client.Mh")
	public class38 field1389 = class38.method217(1);

	@ObfuscatedName("client.Ph")
	public class41 field1392 = new class41();

	@ObfuscatedName("client.ci")
	public int[][] field1403 = new int[104][104];

	@ObfuscatedName("client.di")
	public int[][] field1404 = new int[104][104];

	@ObfuscatedName("client.hi")
	public boolean field1407 = false;

	@ObfuscatedName("client.oi")
	public int field1413 = 78;

	@ObfuscatedName("client.yi")
	public boolean field1422 = false;

	@ObfuscatedName("client.Ai")
	public String[] field1424 = new String[500];

	@ObfuscatedName("client.Bi")
	public int[] field1425 = new int[200];

	@ObfuscatedName("client.Ci")
	public String field1426 = "";

	@ObfuscatedName("client.Di")
	public int[] field1427 = new int[151];

	@ObfuscatedName("client.Hi")
	public int field1430 = 0x332D25;

	@ObfuscatedName("client.Ii")
	public int field1431 = -1;

	@ObfuscatedName("client.Ji")
	public boolean field1432 = false;

	@ObfuscatedName("client.Ki")
	public int field1433 = -1;

	@ObfuscatedName("client.Li")
	public class62[] field1434 = new class62[4];

	@ObfuscatedName("client.Pi")
	public boolean field1438 = false;

	@ObfuscatedName("client.Qi")
	public int[] field1439 = new int[50];

	@ObfuscatedName("client.ij")
	public int field1457 = 0x4D4233;

	@ObfuscatedName("client.nj")
	public boolean field1461 = false;

	@ObfuscatedName("client.oj")
	public class35[] field1462 = new class35[100];

	@ObfuscatedName("client.vj")
	public boolean field1469 = false;

	@ObfuscatedName("client.xj")
	public String field1471 = "";

	@ObfuscatedName("client.yj")
	public boolean field1472 = false;

	@ObfuscatedName("client.Ij")
	public int[] field1480 = new int[class67.field1012];

	@ObfuscatedName("client.Md")
	public static int field1200 = 10;

	@ObfuscatedName("client.Od")
	public static boolean field1202 = true;

	@ObfuscatedName("client.Be")
	public static String field1237 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ve")
	public static final int[] field1254 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.rf")
	public static final int[][] field1273 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.qh")
	public static int[] field1367 = new int[99];

	@ObfuscatedName("client.gi")
	public static BigInteger field1406 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.lj")
	public static int[] field1459 = new int[32];

	@ObfuscatedName("client.M")
	public static int field1061;

	@ObfuscatedName("client.O")
	public int field1063;

	@ObfuscatedName("client.T")
	public int field1067;

	@ObfuscatedName("client.U")
	public int field1068;

	@ObfuscatedName("client.V")
	public int field1069;

	@ObfuscatedName("client.Y")
	public int field1072;

	@ObfuscatedName("client.Z")
	public int field1073;

	@ObfuscatedName("client.Ab")
	public int field1096;

	@ObfuscatedName("client.Bb")
	public int field1097;

	@ObfuscatedName("client.Cb")
	public int field1098;

	@ObfuscatedName("client.Lb")
	public int field1105;

	@ObfuscatedName("client.Nb")
	public int field1107;

	@ObfuscatedName("client.Ob")
	public int field1108;

	@ObfuscatedName("client.Pb")
	public int field1109;

	@ObfuscatedName("client.Qb")
	public int field1110;

	@ObfuscatedName("client.Rb")
	public int field1111;

	@ObfuscatedName("client.Sb")
	public int field1112;

	@ObfuscatedName("client.Ac")
	public int field1141;

	@ObfuscatedName("client.Ec")
	public int field1143;

	@ObfuscatedName("client.Fc")
	public int field1144;

	@ObfuscatedName("client.Gc")
	public int field1145;

	@ObfuscatedName("client.Hc")
	public int field1146;

	@ObfuscatedName("client.Ic")
	public int field1147;

	@ObfuscatedName("client.Lc")
	public int field1150;

	@ObfuscatedName("client.Nc")
	public static int field1152;

	@ObfuscatedName("client.Oc")
	public int field1153;

	@ObfuscatedName("client.Pc")
	public int field1154;

	@ObfuscatedName("client.Qc")
	public int field1155;

	@ObfuscatedName("client.Rc")
	public int field1156;

	@ObfuscatedName("client.Uc")
	public static int field1159;

	@ObfuscatedName("client.Vc")
	public int field1160;

	@ObfuscatedName("client.Wc")
	public int field1161;

	@ObfuscatedName("client.Xc")
	public int field1162;

	@ObfuscatedName("client.Zc")
	public int field1164;

	@ObfuscatedName("client.ad")
	public int field1165;

	@ObfuscatedName("client.ed")
	public int field1169;

	@ObfuscatedName("client.fd")
	public int field1170;

	@ObfuscatedName("client.gd")
	public int field1171;

	@ObfuscatedName("client.hd")
	public int field1172;

	@ObfuscatedName("client.id")
	public int field1173;

	@ObfuscatedName("client.od")
	public int field1179;

	@ObfuscatedName("client.qd")
	public int field1181;

	@ObfuscatedName("client.ud")
	public static int field1185;

	@ObfuscatedName("client.wd")
	public int field1187;

	@ObfuscatedName("client.xd")
	public int field1188;

	@ObfuscatedName("client.zd")
	public static int field1190;

	@ObfuscatedName("client.Fd")
	public int field1196;

	@ObfuscatedName("client.Gd")
	public int field1197;

	@ObfuscatedName("client.Nd")
	public static int field1201;

	@ObfuscatedName("client.Rd")
	public static int field1205;

	@ObfuscatedName("client.Sd")
	public int field1206;

	@ObfuscatedName("client.Zd")
	public static int field1212;

	@ObfuscatedName("client.ce")
	public int field1215;

	@ObfuscatedName("client.de")
	public int field1216;

	@ObfuscatedName("client.ee")
	public int field1217;

	@ObfuscatedName("client.fe")
	public int field1218;

	@ObfuscatedName("client.he")
	public int field1220;

	@ObfuscatedName("client.ie")
	public static int field1221;

	@ObfuscatedName("client.ne")
	public int field1225;

	@ObfuscatedName("client.qe")
	public int field1227;

	@ObfuscatedName("client.re")
	public int field1228;

	@ObfuscatedName("client.se")
	public int field1229;

	@ObfuscatedName("client.te")
	public int field1230;

	@ObfuscatedName("client.ue")
	public int field1231;

	@ObfuscatedName("client.Me")
	public int field1248;

	@ObfuscatedName("client.Oe")
	public static int field1249;

	@ObfuscatedName("client.Xe")
	public int field1256;

	@ObfuscatedName("client.Ye")
	public int field1257;

	@ObfuscatedName("client.af")
	public int field1258;

	@ObfuscatedName("client.bf")
	public int field1259;

	@ObfuscatedName("client.cf")
	public int field1260;

	@ObfuscatedName("client.df")
	public int field1261;

	@ObfuscatedName("client.ef")
	public int field1262;

	@ObfuscatedName("client.ff")
	public int field1263;

	@ObfuscatedName("client.gf")
	public int field1264;

	@ObfuscatedName("client.jf")
	public int field1266;

	@ObfuscatedName("client.vf")
	public int field1277;

	@ObfuscatedName("client.wf")
	public int field1278;

	@ObfuscatedName("client.xf")
	public int field1279;

	@ObfuscatedName("client.zf")
	public int field1281;

	@ObfuscatedName("client.If")
	public int field1288;

	@ObfuscatedName("client.Kf")
	public int field1290;

	@ObfuscatedName("client.Lf")
	public int field1291;

	@ObfuscatedName("client.Mf")
	public int field1292;

	@ObfuscatedName("client.Nf")
	public int field1293;

	@ObfuscatedName("client.Tf")
	public int field1299;

	@ObfuscatedName("client.Vf")
	public int field1301;

	@ObfuscatedName("client.Wf")
	public int field1302;

	@ObfuscatedName("client.ag")
	public int field1306;

	@ObfuscatedName("client.cg")
	public int field1308;

	@ObfuscatedName("client.eg")
	public int field1310;

	@ObfuscatedName("client.fg")
	public int field1311;

	@ObfuscatedName("client.gg")
	public int field1312;

	@ObfuscatedName("client.hg")
	public int field1313;

	@ObfuscatedName("client.ig")
	public int field1314;

	@ObfuscatedName("client.mg")
	public int field1318;

	@ObfuscatedName("client.og")
	public int field1320;

	@ObfuscatedName("client.pg")
	public int field1321;

	@ObfuscatedName("client.qg")
	public int field1322;

	@ObfuscatedName("client.rg")
	public int field1323;

	@ObfuscatedName("client.sg")
	public int field1324;

	@ObfuscatedName("client.Bg")
	public int field1332;

	@ObfuscatedName("client.Ig")
	public int field1338;

	@ObfuscatedName("client.Zg")
	public static int field1353;

	@ObfuscatedName("client.kh")
	public static int field1362;

	@ObfuscatedName("client.nh")
	public int field1365;

	@ObfuscatedName("client.rh")
	public static int field1368;

	@ObfuscatedName("client.sh")
	public int field1369;

	@ObfuscatedName("client.wh")
	public int field1373;

	@ObfuscatedName("client.xh")
	public int field1374;

	@ObfuscatedName("client.Gh")
	public int field1383;

	@ObfuscatedName("client.Sh")
	public static int field1394;

	@ObfuscatedName("client.Th")
	public int field1395;

	@ObfuscatedName("client.Uh")
	public int field1396;

	@ObfuscatedName("client.Wh")
	public int field1398;

	@ObfuscatedName("client.Yh")
	public int field1399;

	@ObfuscatedName("client.Zh")
	public int field1400;

	@ObfuscatedName("client.ai")
	public int field1401;

	@ObfuscatedName("client.bi")
	public int field1402;

	@ObfuscatedName("client.fi")
	public int field1405;

	@ObfuscatedName("client.ji")
	public int field1408;

	@ObfuscatedName("client.ki")
	public int field1409;

	@ObfuscatedName("client.li")
	public int field1410;

	@ObfuscatedName("client.mi")
	public int field1411;

	@ObfuscatedName("client.ni")
	public int field1412;

	@ObfuscatedName("client.pi")
	public int field1414;

	@ObfuscatedName("client.qi")
	public int field1415;

	@ObfuscatedName("client.ri")
	public int field1416;

	@ObfuscatedName("client.si")
	public int field1417;

	@ObfuscatedName("client.ti")
	public int field1418;

	@ObfuscatedName("client.ui")
	public int field1419;

	@ObfuscatedName("client.vi")
	public int field1420;

	@ObfuscatedName("client.wi")
	public int field1421;

	@ObfuscatedName("client.zi")
	public static int field1423;

	@ObfuscatedName("client.Fi")
	public int field1428;

	@ObfuscatedName("client.Gi")
	public int field1429;

	@ObfuscatedName("client.Mi")
	public int field1435;

	@ObfuscatedName("client.Ni")
	public int field1436;

	@ObfuscatedName("client.Oi")
	public int field1437;

	@ObfuscatedName("client.jj")
	public int field1458;

	@ObfuscatedName("client.mj")
	public int field1460;

	@ObfuscatedName("client.pj")
	public int field1463;

	@ObfuscatedName("client.zj")
	public int field1473;

	@ObfuscatedName("client.Aj")
	public int field1474;

	@ObfuscatedName("client.Bj")
	public int field1475;

	@ObfuscatedName("client.Cj")
	public int field1476;

	@ObfuscatedName("client.Dj")
	public int field1477;

	@ObfuscatedName("client.Fj")
	public static int field1478;

	@ObfuscatedName("client.Hj")
	public static int field1479;

	@ObfuscatedName("client.Bd")
	public long field1192;

	@ObfuscatedName("client.me")
	public long field1224;

	@ObfuscatedName("client.Re")
	public long field1250;

	@ObfuscatedName("client.qj")
	public long field1464;

	@ObfuscatedName("client.lh")
	public class18 field1363;

	@ObfuscatedName("client.yc")
	public class35 field1140;

	@ObfuscatedName("client.Td")
	public class35 field1207;

	@ObfuscatedName("client.Ud")
	public class35 field1208;

	@ObfuscatedName("client.Vd")
	public class35 field1209;

	@ObfuscatedName("client.Wd")
	public class35 field1210;

	@ObfuscatedName("client.kg")
	public class35 field1316;

	@ObfuscatedName("client.lg")
	public class35 field1317;

	@ObfuscatedName("client.eh")
	public class35 field1357;

	@ObfuscatedName("client.fh")
	public class35 field1358;

	@ObfuscatedName("client.mh")
	public class35 field1364;

	@ObfuscatedName("client.Vh")
	public class35 field1397;

	@ObfuscatedName("client.Ri")
	public class35 field1440;

	@ObfuscatedName("client.Si")
	public class35 field1441;

	@ObfuscatedName("client.Cd")
	public class36 field1193;

	@ObfuscatedName("client.Dd")
	public class36 field1194;

	@ObfuscatedName("client.Ed")
	public class36 field1195;

	@ObfuscatedName("client.Je")
	public class36 field1245;

	@ObfuscatedName("client.Ke")
	public class36 field1246;

	@ObfuscatedName("client.Le")
	public class36 field1247;

	@ObfuscatedName("client.kf")
	public class36 field1267;

	@ObfuscatedName("client.lf")
	public class36 field1268;

	@ObfuscatedName("client.mf")
	public class36 field1269;

	@ObfuscatedName("client.nf")
	public class36 field1270;

	@ObfuscatedName("client.of")
	public class36 field1271;

	@ObfuscatedName("client.Vg")
	public class36 field1349;

	@ObfuscatedName("client.Wg")
	public class36 field1350;

	@ObfuscatedName("client.Nh")
	public class36 field1390;

	@ObfuscatedName("client.Oh")
	public class36 field1391;

	@ObfuscatedName("client.Ti")
	public class36 field1442;

	@ObfuscatedName("client.Ui")
	public class36 field1443;

	@ObfuscatedName("client.Vi")
	public class36 field1444;

	@ObfuscatedName("client.Wi")
	public class36 field1445;

	@ObfuscatedName("client.Xi")
	public class36 field1446;

	@ObfuscatedName("client.Pf")
	public class37 field1295;

	@ObfuscatedName("client.Qf")
	public class37 field1296;

	@ObfuscatedName("client.Rf")
	public class37 field1297;

	@ObfuscatedName("client.Sf")
	public class37 field1298;

	@ObfuscatedName("client.Fe")
	public class43 field1241;

	@ObfuscatedName("client.Ge")
	public class43 field1242;

	@ObfuscatedName("client.He")
	public class43 field1243;

	@ObfuscatedName("client.Ie")
	public class43 field1244;

	@ObfuscatedName("client.Jg")
	public class43 field1339;

	@ObfuscatedName("client.Kg")
	public class43 field1340;

	@ObfuscatedName("client.Lg")
	public class43 field1341;

	@ObfuscatedName("client.Mg")
	public class43 field1342;

	@ObfuscatedName("client.Ng")
	public class43 field1343;

	@ObfuscatedName("client.Og")
	public class43 field1344;

	@ObfuscatedName("client.Pg")
	public class43 field1345;

	@ObfuscatedName("client.Qg")
	public class43 field1346;

	@ObfuscatedName("client.Rg")
	public class43 field1347;

	@ObfuscatedName("client.Zi")
	public class43 field1448;

	@ObfuscatedName("client.aj")
	public class43 field1449;

	@ObfuscatedName("client.bj")
	public class43 field1450;

	@ObfuscatedName("client.cj")
	public class43 field1451;

	@ObfuscatedName("client.dj")
	public class43 field1452;

	@ObfuscatedName("client.ej")
	public class43 field1453;

	@ObfuscatedName("client.fj")
	public class43 field1454;

	@ObfuscatedName("client.gj")
	public class43 field1455;

	@ObfuscatedName("client.hj")
	public class43 field1456;

	@ObfuscatedName("client.ve")
	public class47 field1232;

	@ObfuscatedName("client.vd")
	public class49 field1186;

	@ObfuscatedName("client.Ef")
	public class50 field1285;

	@ObfuscatedName("client.Cg")
	public class58 field1333;

	@ObfuscatedName("client.Ff")
	public class5 field1286;

	@ObfuscatedName("client.Yc")
	public String field1163;

	@ObfuscatedName("client.ge")
	public String field1219;

	@ObfuscatedName("client.Qh")
	public String field1393;

	@ObfuscatedName("client.yf")
	public Socket field1280;

	@ObfuscatedName("client.kd")
	public static boolean field1175;

	@ObfuscatedName("client.Pd")
	public static boolean field1203;

	@ObfuscatedName("client.Of")
	public static boolean field1294;

	@ObfuscatedName("client.Yi")
	public static boolean field1447;

	@ObfuscatedName("client.ye")
	public int[] field1234;

	@ObfuscatedName("client.ze")
	public int[] field1235;

	@ObfuscatedName("client.Ae")
	public int[] field1236;

	@ObfuscatedName("client.De")
	public int[] field1239;

	@ObfuscatedName("client.Ee")
	public int[] field1240;

	@ObfuscatedName("client.ug")
	public int[] field1326;

	@ObfuscatedName("client.vg")
	public int[] field1327;

	@ObfuscatedName("client.rj")
	public int[] field1465;

	@ObfuscatedName("client.sj")
	public int[] field1466;

	@ObfuscatedName("client.tj")
	public int[] field1467;

	@ObfuscatedName("client.uj")
	public int[] field1468;

	@ObfuscatedName("client.wj")
	public class36[] field1470;

	@ObfuscatedName("client.sf")
	public byte[][] field1274;

	@ObfuscatedName("client.Ih")
	public byte[][] field1385;

	@ObfuscatedName("client.Sc")
	public int[][][] field1157;

	@ObfuscatedName("client.a(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1286 != null) {
				field1286.method38();
			}
		} catch (Exception var1) {
		}

		field1286 = null;
		method532();

		if (field1333 != null) {
			field1333.field868 = false;
		}

		field1333 = null;
		field1232.method271();
		field1232 = null;
		field1077 = null;
		field1199 = null;
		field1389 = null;
		field1081 = null;
		field1385 = null;
		field1274 = null;
		field1082 = null;
		field1083 = null;
		field1157 = null;
		field1124 = null;
		field1363 = null;
		field1434 = null;
		field1403 = null;
		field1253 = null;
		field1148 = null;
		field1149 = null;
		field1361 = null;
		field1241 = null;
		field1242 = null;
		field1243 = null;
		field1244 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1339 = null;
		field1340 = null;
		field1341 = null;
		field1342 = null;
		field1343 = null;
		field1344 = null;
		field1345 = null;
		field1346 = null;
		field1347 = null;
		field1193 = null;
		field1194 = null;
		field1195 = null;
		field1245 = null;
		field1246 = null;
		field1247 = null;
		field1275 = null;
		field1267 = null;
		field1268 = null;
		field1269 = null;
		field1270 = null;
		field1271 = null;
		field1442 = null;
		field1443 = null;
		field1444 = null;
		field1445 = null;
		field1446 = null;
		field1364 = null;
		field1382 = null;
		field1328 = null;
		field1076 = null;
		field1207 = null;
		field1208 = null;
		field1209 = null;
		field1210 = null;
		field1348 = null;
		field1462 = null;
		field1404 = null;
		field1178 = null;
		field1180 = null;
		field1182 = null;
		field1183 = null;
		field1309 = null;
		field1126 = null;
		field1128 = null;
		field1151 = null;
		field1392 = null;
		field1303 = null;
		field1080 = null;
		field1377 = null;
		field1378 = null;
		field1379 = null;
		field1380 = null;
		field1424 = null;
		field1352 = null;
		field1070 = null;
		field1071 = null;
		field1113 = null;
		field1397 = null;
		field1255 = null;
		field1174 = null;
		field1425 = null;
		field1451 = null;
		field1452 = null;
		field1448 = null;
		field1449 = null;
		field1450 = null;
		field1453 = null;
		field1454 = null;
		field1455 = null;
		field1456 = null;
		method442();
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

	@ObfuscatedName("client.e(I)V")
	public final void method429() {
		if (field1203 && field1429 == 2 && class3.field33 != field1301) {
			field1243.method258();
			field1296.method202(257, 0, "Loading - please wait.", 151);
			field1296.method202(256, 0xFFFFFF, "Loading - please wait.", 150);
			field1243.method259(4, 4, field9);
			field1429 = 1;
			field1224 = System.currentTimeMillis();
		}

		if (field1429 == 1) {
			int var1 = method430();
			if (var1 != 0 && System.currentTimeMillis() - field1224 > 360000L) {
				signlink.reporterror(field1222 + " glcfb " + field1250 + "," + var1 + "," + field1203 + "," + field1122[0] + "," + field1232.method280() + "," + field1301 + "," + field1310 + "," + field1311);
				field1224 = System.currentTimeMillis();
			}
		}

		if (field1429 == 2 && field1319 != field1301) {
			field1319 = field1301;
			method527(field1301);
		}
	}

	@ObfuscatedName("client.f(I)I")
	public final int method430() {
		for (int var1 = 0; var1 < field1385.length; var1++) {
			if (field1385[var1] == null && field1082[var1] != -1) {
				return -1;
			}

			if (field1274[var1] == null && field1083[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1385.length; var3++) {
			byte[] var4 = field1274[var3];
			if (var4 != null) {
				int var5 = (field1081[var3] >> 8) * 64 - field1072;
				int var6 = (field1081[var3] & 0xFF) * 64 - field1073;
				var2 &= class3.method16(var6, var5, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1282) {
			return -4;
		} else {
			field1429 = 2;
			class3.field33 = field1301;
			method458();
			field1077.method218(218);
			return 0;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method431() {
		class57.field865.method103();
		class57.field866.method103();
		class59.field908.method103();
		class60.field955.method103();
		class60.field956.method103();
		class27.field440.method103();
		class68.field1028.method103();
	}

	@ObfuscatedName("client.h(I)V")
	public void method432() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1458);

		if (field1232 != null) {
			System.out.println("Od-cycle:" + field1232.field747);
		}

		System.out.println("loop-cycle:" + field1118);
		System.out.println("draw-cycle:" + field1185);
		System.out.println("ptype:" + field1144);
		System.out.println("psize:" + field1143);

		if (field1286 != null) {
			field1286.method43();
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

	@ObfuscatedName("client.i(I)Ljava/lang/String;")
	public final String method433() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.j(I)V")
	public final void method434() {
		if (field1302 != 0) {
			class37 var1 = field1296;
			int var2 = 0;
			if (field1414 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1104[var3] != null) {
					int var4 = field1102[var3];
					String var5 = field1103[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1338 == 0 || field1338 == 1 && method517(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method206(var7, 0, var8, "From");
						var1.method206(var7 - 1, 0xFFFF, var8, "From");
						int var11 = var8 + var1.method204("From ");
						if (var6 == 1) {
							field1356[0].method199(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1356[1].method199(var11, var7 - 12);
							var11 += 14;
						}

						var1.method206(var7, 0, var11, var5 + ": " + field1104[var3]);
						var1.method206(var7 - 1, 0xFFFF, var11, var5 + ": " + field1104[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1338 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method206(var9, 0, 4, field1104[var3]);
						var1.method206(var9 - 1, 0xFFFF, 4, field1104[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1338 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method206(var10, 0, 4, "To " + var5 + ": " + field1104[var3]);
						var1.method206(var10 - 1, 0xFFFF, 4, "To " + var5 + ": " + field1104[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Z)V")
	public final void method13(int arg0, String arg1) {
		field1141 = arg0;
		field1393 = arg1;
		method547();

		if (field1285 == null) {
			super.method13(arg0, arg1);
		} else {
			field1450.method258();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1297.method202(var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			class33.method158(34, var6, 0x8C1111, 304, var3 / 2 - 152);
			class33.method158(32, var6 + 1, 0, 302, var3 / 2 - 151);
			class33.method157(0x8C1111, 30, arg0 * 3, var3 / 2 - 150, var6 + 2);
			class33.method157(0, 30, 300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150), var6 + 2);
			field1297.method202(var3 / 2, 0xFFFFFF, arg1, var4 / 2 + 5 - var5);
			field1450.method259(171, 202, field9);

			if (field1461) {
				field1461 = false;

				if (!field1198) {
					field1451.method259(0, 0, field9);
					field1452.method259(0, 637, field9);
				}

				field1448.method259(0, 128, field9);
				field1449.method259(371, 202, field9);
				field1453.method259(265, 0, field9);
				field1454.method259(265, 562, field9);
				field1455.method259(171, 128, field9);
				field1456.method259(171, 562, field9);
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method435() {
		if (field1215 == 0 && field1160 == 0) {
			field1424[field1299] = "Walk here";
			field1379[field1299] = 718;
			field1377[field1299] = field17;
			field1378[field1299] = field18;
			field1299++;
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

				if (var6 == 2 && field1363.method80(field1301, var4, var5, var3) >= 0) {
					class57 var8 = class57.method330(var7);
					if (var8.field862 != null) {
						var8 = var8.method338();
					}

					if (var8 == null) {
						continue;
					}

					if (field1215 == 1) {
						field1424[field1299] = "Use " + field1219 + " with @cya@" + var8.field831;
						field1379[field1299] = 810;
						field1380[field1299] = var3;
						field1377[field1299] = var4;
						field1378[field1299] = var5;
						field1299++;
					} else if (field1160 != 1) {
						if (var8.field847 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field847[var9] != null) {
									field1424[field1299] = var8.field847[var9] + " @cya@" + var8.field831;

									if (var9 == 0) {
										field1379[field1299] = 625;
									}

									if (var9 == 1) {
										field1379[field1299] = 721;
									}

									if (var9 == 2) {
										field1379[field1299] = 743;
									}

									if (var9 == 3) {
										field1379[field1299] = 357;
									}

									if (var9 == 4) {
										field1379[field1299] = 1071;
									}

									field1380[field1299] = var3;
									field1377[field1299] = var4;
									field1378[field1299] = var5;
									field1299++;
								}
							}
						}

						field1424[field1299] = "Examine @cya@" + var8.field831;
						field1379[field1299] = 1381;
						field1380[field1299] = var8.field828 << 14;
						field1377[field1299] = var4;
						field1378[field1299] = var5;
						field1299++;
					} else if ((field1162 & 0x4) == 4) {
						field1424[field1299] = field1163 + " @cya@" + var8.field831;
						field1379[field1299] = 899;
						field1380[field1299] = var3;
						field1377[field1299] = var4;
						field1378[field1299] = var5;
						field1299++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1126[var7];
					if (var10.field415.field882 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1127; var11++) {
							class26 var12 = field1126[field1128[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field882 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method501(var12.field415, field1128[var11], var5, var4);
							}
						}

						for (int var13 = 0; var13 < field1179; var13++) {
							class27 var14 = field1178[field1180[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method562(var5, var4, field1180[var13], var14);
							}
						}
					}

					method501(var10.field415, var7, var5, var4);
				}

				if (var6 == 0) {
					class27 var15 = field1178[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1127; var16++) {
							class26 var17 = field1126[field1128[var16]];
							if (var17 != null && var17.field415.field882 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method501(var17.field415, field1128[var16], var5, var4);
							}
						}

						for (int var18 = 0; var18 < field1179; var18++) {
							class27 var19 = field1178[field1180[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method562(var5, var4, field1180[var18], var19);
							}
						}
					}

					method562(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					class41 var20 = field1151[field1301][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method249(); var21 != null; var21 = (class29) var20.method251()) {
							class60 var22 = class60.method348(var21.field455);
							if (field1215 == 1) {
								field1424[field1299] = "Use " + field1219 + " with @lre@" + var22.field917;
								field1379[field1299] = 111;
								field1380[field1299] = var21.field455;
								field1377[field1299] = var4;
								field1378[field1299] = var5;
								field1299++;
							} else if (field1160 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field931 != null && var22.field931[var23] != null) {
										field1424[field1299] = var22.field931[var23] + " @lre@" + var22.field917;

										if (var23 == 0) {
											field1379[field1299] = 139;
										}

										if (var23 == 1) {
											field1379[field1299] = 778;
										}

										if (var23 == 2) {
											field1379[field1299] = 617;
										}

										if (var23 == 3) {
											field1379[field1299] = 224;
										}

										if (var23 == 4) {
											field1379[field1299] = 662;
										}

										field1380[field1299] = var21.field455;
										field1377[field1299] = var4;
										field1378[field1299] = var5;
										field1299++;
									} else if (var23 == 2) {
										field1424[field1299] = "Take @lre@" + var22.field917;
										field1379[field1299] = 617;
										field1380[field1299] = var21.field455;
										field1377[field1299] = var4;
										field1378[field1299] = var5;
										field1299++;
									}
								}

								field1424[field1299] = "Examine @lre@" + var22.field917;
								field1379[field1299] = 1152;
								field1380[field1299] = var21.field455;
								field1377[field1299] = var4;
								field1378[field1299] = var5;
								field1299++;
							} else if ((field1162 & 0x1) == 1) {
								field1424[field1299] = field1163 + " @lre@" + var22.field917;
								field1379[field1299] = 370;
								field1380[field1299] = var21.field455;
								field1377[field1299] = var4;
								field1378[field1299] = var5;
								field1299++;
							}
						}
					}
				}
			}
		}
	}

	public final void run() {
		if (field1129) {
			method480();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method436() {
		class18.field258 = true;
		class34.field573 = true;
		field1203 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method437() {
		if (field1429 == 2) {
			for (class40 var1 = (class40) field1392.method248(); var1 != null; var1 = (class40) field1392.method250()) {
				if (var1.field649 > 0) {
					var1.field649--;
				}

				if (var1.field649 != 0) {
					if (var1.field648 > 0) {
						var1.field648--;
					}

					if (var1.field648 == 0 && var1.field640 >= 1 && var1.field641 >= 1 && var1.field640 <= 102 && var1.field641 <= 102 && (var1.field645 < 0 || class3.method30(var1.field647, var1.field645))) {
						method461(var1.field639, var1.field647, var1.field641, var1.field646, var1.field645, var1.field638, var1.field640);
						var1.field648 = -1;

						if (var1.field645 == var1.field642 && var1.field642 == -1) {
							var1.method106();
						} else if (var1.field645 == var1.field642 && var1.field646 == var1.field643 && var1.field647 == var1.field644) {
							var1.method106();
						}
					}
				} else if (var1.field642 < 0 || class3.method30(var1.field644, var1.field642)) {
					method461(var1.field639, var1.field644, var1.field641, var1.field643, var1.field642, var1.field638, var1.field640);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method438() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1283) {
			field1198 = false;
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

		if (field1189) {
			field1198 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1432) {
			field1198 = false;
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

	@ObfuscatedName("client.n(I)V")
	public final void method439() {
		for (class30 var1 = (class30) field1303.method248(); var1 != null; var1 = (class30) field1303.method250()) {
			if (field1301 != var1.field458 || field1118 > var1.field464) {
				var1.method106();
			} else if (field1118 >= var1.field463) {
				if (var1.field467 > 0) {
					class26 var2 = field1126[var1.field467 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method120(field1118, method510(var2.field360, var2.field361, var1.field458) - var1.field462, var2.field361, var2.field360);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class27 var4;
					if (field1142 == var3) {
						var4 = field1088;
					} else {
						var4 = field1178[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method120(field1118, method510(var4.field360, var4.field361, var1.field458) - var1.field462, var4.field361, var4.field360);
					}
				}

				var1.method121(field1279);
				field1363.method61(false, field1301, (int) var1.field470, 60, -1, var1, (int) var1.field471, var1.field477, (int) var1.field469);
			}
		}

		field1159++;
		if (field1159 > 1174) {
			field1159 = 0;
			field1077.method218(63);
			field1077.method219(0);
			int var5 = field1077.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method220(11499);
			}

			field1077.method220(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method219(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method219(94);
			}

			field1077.method220(51693);
			field1077.method219(16);
			field1077.method220(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method219(65);
			}

			field1077.method219((int) (Math.random() * 256.0D));
			field1077.method220(22990);
			field1077.method228(field1077.field621 - var5);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method440(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1300 != -1) {
			field1078 = arg1;
			field23 = 0;
		}

		if (field1064 == -1) {
			field1469 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1102[var4] = field1102[var4 - 1];
			field1103[var4] = field1103[var4 - 1];
			field1104[var4] = field1104[var4 - 1];
		}

		field1102[0] = arg2;
		field1103[0] = arg0;
		field1104[0] = arg1;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method9() {
		if (field1432 || field1283 || field1189) {
			method438();
		} else {
			field1185++;

			if (field1099) {
				method450();
			} else {
				method457(false);
			}

			field1428 = 0;
		}
	}

	@ObfuscatedName("client.a(Ld;I)V")
	public final void method441(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1110 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1110 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1110 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1109;
				if (field1110 != 2) {
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
					arg0.field97 = field1255[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1109;
			if (field1110 != 2) {
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
				if (field1425[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1425[var2] == field1200) {
					arg0.field97 = "@gre@World-" + (field1425[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1425[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1109;
			if (field1110 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1110 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1110 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1373;
				if (field1110 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method304(class51.method301(field1335[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1373 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1118 / 40.0D) * 256.0D) & 0x7FF;

			if (field1325) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1304[var7];
					if (var8 >= 0 && !class64.field978[var8].method377()) {
						return;
					}
				}

				field1325 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1304[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field978[var12].method378();
					}
				}

				class31 var13 = new class31(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1334[var14] != 0) {
						var13.method140(field1273[var14][0], field1273[var14][field1334[var14]]);

						if (var14 == 1) {
							var13.method140(field1254[0], field1254[field1334[var14]]);
						}
					}
				}

				var13.method133();
				var13.method134(class66.field996[field1088.field365].field998[0]);
				var13.method143(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field1440 == null) {
				field1440 = arg0.field103;
				field1441 = arg0.field104;
			}

			if (field1359) {
				arg0.field103 = field1441;
			} else {
				arg0.field103 = field1440;
			}
		} else if (var2 == 325) {
			if (field1440 == null) {
				field1440 = arg0.field103;
				field1441 = arg0.field104;
			}

			if (field1359) {
				arg0.field103 = field1440;
			} else {
				arg0.field103 = field1441;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1471;
			if (field1118 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1206 < 1) {
				arg0.field97 = "";
			} else if (field1101) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1318 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1266 == 0) {
					var15 = "earlier today";
				} else if (field1266 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1266 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1383 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1383 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1383 > 1) {
				arg0.field97 = field1383 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1476 == 201) {
				if (field1156 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1476 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1476 == 0) {
					var16 = "Earlier today";
				} else if (field1476 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1476 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1476 == 201) {
				if (field1156 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1476 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1476 == 201) {
				if (field1156 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1476 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method442() {
		field1198 = false;
		while (field1238) {
			field1198 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1349 = null;
		field1350 = null;
		field1470 = null;
		field1465 = null;
		field1466 = null;
		field1467 = null;
		field1468 = null;
		field1326 = null;
		field1327 = null;
		field1239 = null;
		field1240 = null;
		field1357 = null;
		field1358 = null;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method443() {
		for (int var1 = 0; var1 < field1127; var1++) {
			int var2 = field1128[var1];
			class26 var3 = field1126[var2];
			if (var3 != null) {
				method444(var3.field415.field882, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILy;)V")
	public final void method444(int arg0, class25 arg1) {
		if (arg1.field360 < 128 || arg1.field361 < 128 || arg1.field360 >= 13184 || arg1.field361 >= 13184) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (field1088 == arg1 && (arg1.field360 < 1536 || arg1.field361 < 1536 || arg1.field360 >= 11776 || arg1.field361 >= 11776)) {
			arg1.field388 = -1;
			arg1.field393 = -1;
			arg1.field402 = 0;
			arg1.field403 = 0;
			arg1.field360 = arg1.field410[0] * 128 + arg1.field364 * 64;
			arg1.field361 = arg1.field411[0] * 128 + arg1.field364 * 64;
			arg1.method112();
		}

		if (arg1.field402 > field1118) {
			method445(arg1);
		} else if (arg1.field403 >= field1118) {
			method446(arg1);
		} else {
			method447(arg1);
		}

		method448(arg1);
		method449(arg1);
	}

	@ObfuscatedName("client.a(ILy;)V")
	public final void method445(class25 arg0) {
		int var2 = arg0.field402 - field1118;
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
	public final void method446(class25 arg0) {
		if (field1118 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field996[arg0.field388].method382(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1118 - arg0.field402;
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

	@ObfuscatedName("client.a(Ly;I)V")
	public final void method447(class25 arg0) {
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

	@ObfuscatedName("client.b(Ly;I)V")
	public final void method448(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1126[arg0.field382];
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
				if (field1142 == var5) {
					var5 = field1177;
				}

				class27 var6 = field1178[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1072 - field1072) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1073 - field1073) * 64;
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

	@ObfuscatedName("client.a(BLy;)V")
	public final void method449(class25 arg0) {
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

		if (arg0.field393 != -1 && field1118 >= arg0.field396) {
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
			if (var4.field1008 == 1 && arg0.field414 > 0 && arg0.field402 <= field1118 && arg0.field403 < field1118) {
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

	@ObfuscatedName("client.c(B)V")
	public final void method450() {
		if (field1461) {
			field1461 = false;
			field1339.method259(4, 0, field9);
			field1340.method259(357, 0, field9);
			field1341.method259(4, 722, field9);
			field1342.method259(205, 743, field9);
			field1343.method259(0, 0, field9);
			field1344.method259(4, 516, field9);
			field1345.method259(205, 516, field9);
			field1346.method259(357, 496, field9);
			field1347.method259(338, 0, field9);
			field1422 = true;
			field1469 = true;
			field1191 = true;
			field1355 = true;

			if (field1429 != 2) {
				field1243.method259(4, 4, field9);
				field1242.method259(4, 550, field9);
			}
		}

		if (field1429 == 2) {
			method536();
		}

		if (field1371 && field1260 == 1) {
			field1422 = true;
		}

		if (field1289 != -1) {
			boolean var1 = method557(field1279, field1289);
			if (var1) {
				field1422 = true;
			}
		}

		if (field1402 == 2) {
			field1422 = true;
		}

		if (field1419 == 2) {
			field1422 = true;
		}

		if (field1422) {
			method534();
			field1422 = false;
		}

		if (field1064 == -1) {
			field1337.field76 = field1413 - field1248 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method473(field1413, 0, field18 - 357, field17 - 17, 77, field1337, false, 463);
			}

			int var2 = field1413 - field1337.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1413 - 77) {
				var2 = field1413 - 77;
			}

			if (field1248 != var2) {
				field1248 = var2;
				field1469 = true;
			}
		}

		if (field1064 != -1) {
			boolean var3 = method557(field1279, field1064);
			if (var3) {
				field1469 = true;
			}
		}

		if (field1402 == 3) {
			field1469 = true;
		}

		if (field1419 == 3) {
			field1469 = true;
		}

		if (field1078 != null) {
			field1469 = true;
		}

		if (field1371 && field1260 == 2) {
			field1469 = true;
		}

		if (field1469) {
			method550();
			field1469 = false;
		}

		if (field1429 == 2) {
			method500();
			field1242.method259(4, 550, field9);
		}

		if (field1431 != -1) {
			field1191 = true;
		}

		if (field1191) {
			if (field1431 != -1 && field1431 == field1125) {
				field1431 = -1;
				field1077.method218(53);
				field1077.method219(field1125);
			}

			field1191 = false;
			field1087.method258();
			field1247.method199(0, 0);

			if (field1289 == -1) {
				if (field1204[field1125] != -1) {
					if (field1125 == 0) {
						field1267.method199(22, 10);
					}

					if (field1125 == 1) {
						field1268.method199(54, 8);
					}

					if (field1125 == 2) {
						field1268.method199(82, 8);
					}

					if (field1125 == 3) {
						field1269.method199(110, 8);
					}

					if (field1125 == 4) {
						field1271.method199(153, 8);
					}

					if (field1125 == 5) {
						field1271.method199(181, 8);
					}

					if (field1125 == 6) {
						field1270.method199(209, 9);
					}
				}

				if (field1204[0] != -1 && (field1431 != 0 || field1118 % 20 < 10)) {
					field1275[0].method199(29, 13);
				}

				if (field1204[1] != -1 && (field1431 != 1 || field1118 % 20 < 10)) {
					field1275[1].method199(53, 11);
				}

				if (field1204[2] != -1 && (field1431 != 2 || field1118 % 20 < 10)) {
					field1275[2].method199(82, 11);
				}

				if (field1204[3] != -1 && (field1431 != 3 || field1118 % 20 < 10)) {
					field1275[3].method199(115, 12);
				}

				if (field1204[4] != -1 && (field1431 != 4 || field1118 % 20 < 10)) {
					field1275[4].method199(153, 13);
				}

				if (field1204[5] != -1 && (field1431 != 5 || field1118 % 20 < 10)) {
					field1275[5].method199(180, 11);
				}

				if (field1204[6] != -1 && (field1431 != 6 || field1118 % 20 < 10)) {
					field1275[6].method199(208, 13);
				}
			}

			field1087.method259(160, 516, field9);
			field1086.method258();
			field1246.method199(0, 0);

			if (field1289 == -1) {
				if (field1204[field1125] != -1) {
					if (field1125 == 7) {
						field1442.method199(42, 0);
					}

					if (field1125 == 8) {
						field1443.method199(74, 0);
					}

					if (field1125 == 9) {
						field1443.method199(102, 0);
					}

					if (field1125 == 10) {
						field1444.method199(130, 1);
					}

					if (field1125 == 11) {
						field1446.method199(173, 0);
					}

					if (field1125 == 12) {
						field1446.method199(201, 0);
					}

					if (field1125 == 13) {
						field1445.method199(229, 0);
					}
				}

				if (field1204[8] != -1 && (field1431 != 8 || field1118 % 20 < 10)) {
					field1275[7].method199(74, 2);
				}

				if (field1204[9] != -1 && (field1431 != 9 || field1118 % 20 < 10)) {
					field1275[8].method199(102, 3);
				}

				if (field1204[10] != -1 && (field1431 != 10 || field1118 % 20 < 10)) {
					field1275[9].method199(137, 4);
				}

				if (field1204[11] != -1 && (field1431 != 11 || field1118 % 20 < 10)) {
					field1275[10].method199(174, 2);
				}

				if (field1204[12] != -1 && (field1431 != 12 || field1118 % 20 < 10)) {
					field1275[11].method199(201, 2);
				}

				if (field1204[13] != -1 && (field1431 != 13 || field1118 % 20 < 10)) {
					field1275[12].method199(226, 2);
				}
			}

			field1086.method259(466, 496, field9);
			field1243.method258();
		}

		if (field1355) {
			field1355 = false;
			field1085.method258();
			field1245.method199(0, 0);
			field1296.method203(55, true, 0xFFFFFF, "Public chat", 28);

			if (field1067 == 0) {
				field1296.method203(55, true, 0xFF00, "On", 41);
			}

			if (field1067 == 1) {
				field1296.method203(55, true, 0xFFFF00, "Friends", 41);
			}

			if (field1067 == 2) {
				field1296.method203(55, true, 0xFF0000, "Off", 41);
			}

			if (field1067 == 3) {
				field1296.method203(55, true, 0xFFFF, "Hide", 41);
			}

			field1296.method203(184, true, 0xFFFFFF, "Private chat", 28);

			if (field1338 == 0) {
				field1296.method203(184, true, 0xFF00, "On", 41);
			}

			if (field1338 == 1) {
				field1296.method203(184, true, 0xFFFF00, "Friends", 41);
			}

			if (field1338 == 2) {
				field1296.method203(184, true, 0xFF0000, "Off", 41);
			}

			field1296.method203(324, true, 0xFFFFFF, "Trade/compete", 28);

			if (field1220 == 0) {
				field1296.method203(324, true, 0xFF00, "On", 41);
			}

			if (field1220 == 1) {
				field1296.method203(324, true, 0xFFFF00, "Friends", 41);
			}

			if (field1220 == 2) {
				field1296.method203(324, true, 0xFF0000, "Off", 41);
			}

			field1296.method203(458, true, 0xFFFFFF, "Report abuse", 33);
			field1085.method259(453, 0, field9);
			field1243.method258();
		}

		field1279 = 0;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method451() {
		for (class32 var1 = (class32) field1080.method248(); var1 != null; var1 = (class32) field1080.method250()) {
			if (field1301 != var1.field556 || var1.field562) {
				var1.method106();
			} else if (field1118 >= var1.field555) {
				var1.method151(field1279);

				if (var1.field562) {
					var1.method106();
				} else {
					field1363.method61(false, var1.field556, var1.field558, 60, -1, var1, var1.field559, 0, var1.field557);
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method452() {
		if (field1147 > 0) {
			method554();
		} else {
			field1243.method258();
			field1296.method202(257, 0, "Connection lost", 144);
			field1296.method202(256, 0xFFFFFF, "Connection lost", 143);
			field1296.method202(257, 0, "Please wait - attempting to reestablish", 159);
			field1296.method202(256, 0xFFFFFF, "Please wait - attempting to reestablish", 158);
			field1243.method259(4, 4, field9);
			field1105 = 0;
			field1395 = 0;
			class5 var1 = field1286;
			field1099 = false;
			method490(field1222, field1223, true);

			if (!field1099) {
				method554();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILnb;)V")
	public final void method453(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field639 == 0) {
			var2 = field1363.method76(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 1) {
			var2 = field1363.method77(arg0.field640, arg0.field641, arg0.field638);
		}

		if (arg0.field639 == 2) {
			var2 = field1363.method78(arg0.field638, arg0.field640, arg0.field641);
		}

		if (arg0.field639 == 3) {
			var2 = field1363.method79(arg0.field638, arg0.field640, arg0.field641);
		}

		if (var2 != 0) {
			int var6 = field1363.method80(arg0.field638, arg0.field640, arg0.field641, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field642 = var3;
		arg0.field644 = var4;
		arg0.field643 = var5;
	}

	@ObfuscatedName("client.a(IIILjava/lang/String;Ljava/lang/String;I)Lxb;")
	public final class50 method454(int arg0, int arg1, String arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1122[0] != null) {
				var6 = field1122[0].method291(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1233.reset();
			field1233.update(var6);
			int var8 = (int) field1233.getValue();
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
			method13(arg0, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method463(arg2 + arg1);
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
						method13(arg0, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1122[0] != null) {
						field1122[0].method292(var6.length, arg4, var6);
					}
				} catch (Exception var28) {
					field1122[0] = null;
				}

				if (var6 != null) {
					field1233.reset();
					field1233.update(var6);
					int var23 = (int) field1233.getValue();
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
						method13(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg0, var11 + " - Retrying in " + var25);
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

				field1287 = !field1287;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method455(int arg0, class38 arg1) {
		while (arg1.field622 + 21 < arg0 * 8) {
			int var3 = arg1.method240(14);
			if (var3 == 16383) {
				break;
			}

			if (field1126[var3] == null) {
				field1126[var3] = new class26();
			}

			class26 var4 = field1126[var3];
			field1128[field1127++] = var3;
			var4.field405 = field1118;
			var4.field415 = class59.method341(arg1.method240(12));
			var4.field364 = var4.field415.field882;
			var4.field408 = var4.field415.field904;
			var4.field367 = var4.field415.field886;
			var4.field368 = var4.field415.field887;
			var4.field369 = var4.field415.field888;
			var4.field370 = var4.field415.field889;
			var4.field365 = var4.field415.field885;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(field1088.field410[0] + var5, var7 == 1, field1088.field411[0] + var6);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1182[field1181++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.d(B)V")
	public final void method456() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1067 = (field1067 + 1) % 4;
				field1355 = true;
				field1469 = true;
				field1077.method218(158);
				field1077.method219(field1067);
				field1077.method219(field1338);
				field1077.method219(field1220);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1338 = (field1338 + 1) % 3;
				field1355 = true;
				field1469 = true;
				field1077.method218(158);
				field1077.method219(field1067);
				field1077.method219(field1338);
				field1077.method219(field1220);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1220 = (field1220 + 1) % 3;
				field1355 = true;
				field1469 = true;
				field1077.method218(158);
				field1077.method219(field1067);
				field1077.method219(field1338);
				field1077.method219(field1220);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1092 == -1) {
					method482();
					field1471 = "";
					field1101 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1184 = field1092 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method440("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method457(boolean arg0) {
		method547();
		field1450.method258();
		field1349.method199(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1281 == 0) {
			int var4 = var3 / 2 + 80;
			field1295.method203(var2 / 2, true, 0x75A9A9, field1232.field732, var4);
			int var5 = var3 / 2 - 20;
			field1297.method203(var2 / 2, true, 0xFFFF00, "Welcome to RuneScape", var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1350.method199(var6 - 73, var7 - 20);
			field1297.method203(var6, true, 0xFFFFFF, "New User", var7 + 5);
			int var8 = var2 / 2 + 80;
			field1350.method199(var8 - 73, var7 - 20);
			field1297.method203(var8, true, 0xFFFFFF, "Existing User", var7 + 5);
		}

		if (field1281 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1115.length() > 0) {
				field1297.method203(var2 / 2, true, 0xFFFF00, field1115, var9 - 15);
				field1297.method203(var2 / 2, true, 0xFFFF00, field1116, var9);
				var9 += 30;
			} else {
				field1297.method203(var2 / 2, true, 0xFFFF00, field1116, var9 - 7);
				var9 += 30;
			}

			field1297.method210(0xFFFFFF, var2 / 2 - 90, true, var9, "Username: " + field1222 + (field1155 == 0 & field1118 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field1297.method210(0xFFFFFF, var2 / 2 - 88, true, var9, "Password: " + class51.method305(field1223) + (field1155 == 1 & field1118 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1350.method199(var10 - 73, var11 - 20);
				field1297.method203(var10, true, 0xFFFFFF, "Login", var11 + 5);
				int var12 = var2 / 2 + 80;
				field1350.method199(var12 - 73, var11 - 20);
				field1297.method203(var12, true, 0xFFFFFF, "Cancel", var11 + 5);
			}
		}

		if (field1281 == 3) {
			field1297.method203(var2 / 2, true, 0xFFFF00, "Create a free account", var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field1297.method203(var2 / 2, true, 0xFFFFFF, "To create a new account you need to", var13);
			var13 += 15;
			field1297.method203(var2 / 2, true, 0xFFFFFF, "go back to the main RuneScape webpage", var13);
			var13 += 15;
			field1297.method203(var2 / 2, true, 0xFFFFFF, "and choose the red 'create account'", var13);
			var13 += 15;
			field1297.method203(var2 / 2, true, 0xFFFFFF, "button at the top right of that page.", var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1350.method199(var14 - 73, var15 - 20);
			field1297.method203(var14, true, 0xFFFFFF, "Cancel", var15 + 5);
		}

		field1450.method259(171, 202, field9);

		if (field1461) {
			field1461 = false;
			field1448.method259(0, 128, field9);
			field1449.method259(371, 202, field9);
			field1453.method259(265, 0, field9);
			field1454.method259(265, 562, field9);
			field1455.method259(171, 128, field9);
			field1456.method259(171, 562, field9);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method458() {
		try {
			field1319 = -1;
			field1080.method252();
			field1303.method252();
			class34.method167();
			method431();
			field1363.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1434[var1].method359();
			}

			System.gc();
			class3 var2 = new class3(field1124, 104, 104, field1157);
			int var3 = field1385.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1081[var4] >> 8;
				int var6 = field1081[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1363.method51(field1301);
			} else {
				field1363.method51(0);
			}

			field1077.method218(146);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1081[var7] >> 8) * 64 - field1072;
				int var9 = (field1081[var7] & 0xFF) * 64 - field1073;
				byte[] var10 = field1385[var7];
				if (var10 != null) {
					var2.method15(var10, var9, (field1311 - 6) * 8, (field1310 - 6) * 8, var8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1081[var11] >> 8) * 64 - field1072;
				int var13 = (field1081[var11] & 0xFF) * 64 - field1073;
				byte[] var14 = field1385[var11];
				if (var14 == null && field1311 < 800) {
					var2.method14(64, var12, 64, var13);
				}
			}

			field1077.method218(146);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1274[var15];
				if (var16 != null) {
					int var17 = (field1081[var15] >> 8) * 64 - field1072;
					int var18 = (field1081[var15] & 0xFF) * 64 - field1073;
					var2.method18(field1363, var16, var17, var18, field1434);
				}
			}

			field1077.method218(146);
			var2.method20(field1434, field1363);
			field1243.method258();
			field1077.method218(146);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method511(var19, var20);
				}
			}

			method531();
		} catch (Exception var33) {
		}

		class57.field865.method103();

		if (field1203 && signlink.cache_dat != null) {
			int var22 = field1232.method272(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1232.method277(var23);
				if ((var24 & 0x79) == 0) {
					class31.method125(var23);
				}
			}
		}

		System.gc();
		class34.method168(20);
		field1232.method283();
		int var25 = (field1310 - 6) / 8 - 1;
		int var26 = (field1310 + 6) / 8 + 1;
		int var27 = (field1311 - 6) / 8 - 1;
		int var28 = (field1311 + 6) / 8 + 1;
		if (field1351) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1232.method274(0, var30, var29);
					if (var31 != -1) {
						field1232.method284(var31, 3);
					}

					int var32 = field1232.method274(1, var30, var29);
					if (var32 != -1) {
						field1232.method284(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method459(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1373; var3++) {
				if (field1335[var3] == arg0) {
					field1373--;
					field1422 = true;

					for (int var4 = var3; var4 < field1373; var4++) {
						field1335[var4] = field1335[var4 + 1];
					}

					field1077.method218(228);
					field1077.method225(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = class31.field550[var7];
			int var13 = class31.field551[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field550[var8];
			int var16 = class31.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1169 = arg2 - var9;
		field1170 = arg4 - var10;
		field1171 = arg3 - var11;
		field1172 = arg5;
		field1173 = arg0;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
			if (field1203 && field1301 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field1363.method76(arg5, arg6, arg2);
			}

			if (arg0 == 1) {
				var8 = field1363.method77(arg6, arg2, arg5);
			}

			if (arg0 == 2) {
				var8 = field1363.method78(arg5, arg6, arg2);
			}

			if (arg0 == 3) {
				var8 = field1363.method79(arg5, arg6, arg2);
			}

			if (var8 != 0) {
				int var12 = field1363.method80(arg5, arg6, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field1363.method67(arg6, arg2, arg5);
					class57 var16 = class57.method330(var13);
					if (var16.field837) {
						field1434[arg5].method364(arg6, arg2, var14, var15, var16.field838);
					}
				}

				if (arg0 == 1) {
					field1363.method68(arg2, arg6, arg5);
				}

				if (arg0 == 2) {
					field1363.method69(arg2, arg5, arg6);
					class57 var17 = class57.method330(var13);
					if (var17.field835 + arg6 > 103 || var17.field835 + arg2 > 103 || var17.field836 + arg6 > 103 || var17.field836 + arg2 > 103) {
						return;
					}

					if (var17.field837) {
						field1434[arg5].method365(var17.field835, var17.field836, arg2, var15, var17.field838, arg6);
					}
				}

				if (arg0 == 3) {
					field1363.method70(arg2, arg6, arg5);
					class57 var18 = class57.method330(var13);
					if (var18.field837 && var18.field839) {
						field1434[arg5].method367(arg2, arg6);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field1124[1][arg6][arg2] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				class3.method31(var19, arg5, field1157, arg1, field1434[arg5], arg6, arg3, field1363, arg4, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method462() {
		if (field1419 == 0) {
			int var1 = field23;
			if (field1160 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1371) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1260 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1260 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1260 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1261 - 10 || var2 > field1263 + field1261 + 10 || var3 < field1262 - 10 || var3 > field1264 + field1262 + 10) {
						field1371 = false;

						if (field1260 == 1) {
							field1422 = true;
						}

						if (field1260 == 2) {
							field1469 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1261;
					int var5 = field1262;
					int var6 = field1263;
					int var7 = field24;
					int var8 = field25;
					if (field1260 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1260 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1260 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1299; var10++) {
						int var11 = (field1299 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method543(var9);
					}

					field1371 = false;

					if (field1260 == 1) {
						field1422 = true;
					}

					if (field1260 == 2) {
						field1469 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1299 > 0) {
					int var12 = field1379[field1299 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1377[field1299 - 1];
						int var14 = field1378[field1299 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1407 = false;
							field1094 = 0;
							field1417 = var14;
							field1418 = var13;
							field1419 = 2;
							field1420 = field24;
							field1421 = field25;

							if (class4.field56[var14].field62 == field1092) {
								field1419 = 1;
							}

							if (class4.field56[var14].field62 == field1064) {
								field1419 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1196 == 1 || method502(field1299 - 1)) && field1299 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1299 > 0) {
					method543(field1299 - 1);
				}

				if (var1 != 2 || field1299 <= 0) {
					return;
				}

				method513();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method463(String arg0) throws IOException {
		if (field1287) {
			if (field1280 != null) {
				try {
					field1280.close();
				} catch (Exception var4) {
				}

				field1280 = null;
			}

			field1280 = method485(43595);
			field1280.setSoTimeout(10000);
			InputStream var2 = field1280.getInputStream();
			OutputStream var3 = field1280.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1294) {
			field1432 = true;
		} else {
			field1294 = true;
			boolean var1 = false;
			String var2 = method433();
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
						field1122[var3] = new class48(signlink.cache_dat, 500000, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					method481();
					field1285 = method454(25, field1251[1], "title", "title screen", 1);
					field1295 = new class37(false, "p11_full", field1285);
					field1296 = new class37(false, "p12_full", field1285);
					field1297 = new class37(false, "b12_full", field1285);
					field1298 = new class37(true, "q8_full", field1285);
					method471();
					method494();
					class50 var4 = method454(30, field1251[2], "config", "config", 2);
					class50 var5 = method454(35, field1251[3], "interface", "interface", 3);
					class50 var6 = method454(40, field1251[4], "media", "2d graphics", 4);
					class50 var7 = method454(45, field1251[6], "textures", "textures", 6);
					class50 var8 = method454(50, field1251[7], "wordenc", "chat system", 7);
					class50 var9 = method454(55, field1251[8], "sounds", "sound effects", 8);
					field1124 = new byte[4][104][104];
					field1157 = new int[4][105][105];
					field1363 = new class18(field1157, 104, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field1434[var10] = new class62(104, 104);
					}

					field1397 = new class35(512, 512);
					class50 var11 = method454(60, field1251[5], "versionlist", "update list", 5);
					method13(60, "Connecting to update server");
					field1232 = new class47();
					field1232.method270(var11, this);
					class7.method44(field1232.method273());
					class31.method123(field1232.method272(0), field1232);

					if (!field1203) {
						field1369 = 0;
						try {
							field1369 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1370 = true;
						field1232.method279(2, field1369);

						while (field1232.method280() > 0) {
							method497();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1232.field738 > 3) {
								method504("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1232.method272(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1232.method279(1, var13);
					}

					while (field1232.method280() > 0) {
						int var14 = var12 - field1232.method280();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method497();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1232.field738 > 3) {
							method504("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1232.method272(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1232.method277(var16);
						if ((var17 & 0x1) != 0) {
							field1232.method279(0, var16);
						}
					}

					int var18 = field1232.method280();
					while (field1232.method280() > 0) {
						int var19 = var18 - field1232.method280();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method497();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1122[0] != null) {
						method13(75, "Requesting maps");
						field1232.method279(3, field1232.method274(0, 48, 47));
						field1232.method279(3, field1232.method274(1, 48, 47));
						field1232.method279(3, field1232.method274(0, 48, 48));
						field1232.method279(3, field1232.method274(1, 48, 48));
						field1232.method279(3, field1232.method274(0, 48, 49));
						field1232.method279(3, field1232.method274(1, 48, 49));
						field1232.method279(3, field1232.method274(0, 47, 47));
						field1232.method279(3, field1232.method274(1, 47, 47));
						field1232.method279(3, field1232.method274(0, 47, 48));
						field1232.method279(3, field1232.method274(1, 47, 48));
						field1232.method279(3, field1232.method274(0, 148, 48));
						field1232.method279(3, field1232.method274(1, 148, 48));
						int var20 = field1232.method280();
						while (field1232.method280() > 0) {
							int var21 = var20 - field1232.method280();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method497();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1232.method272(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1232.method277(var23);
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
							field1232.method282(var25, 0, var23);
						}
					}

					field1232.method275(field1202);

					if (!field1203) {
						int var26 = field1232.method272(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1232.method278(var27)) {
								field1232.method282((byte) 1, 2, var27);
							}
						}
					}

					method13(80, "Unpacking media");
					field1193 = new class36(var6, "invback", 0);
					field1195 = new class36(var6, "chatback", 0);
					field1194 = new class36(var6, "mapback", 0);
					field1245 = new class36(var6, "backbase1", 0);
					field1246 = new class36(var6, "backbase2", 0);
					field1247 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1275[var28] = new class36(var6, "sideicons", var28);
					}

					field1364 = new class35(var6, "compass", 0);
					field1140 = new class35(var6, "mapedge", 0);
					field1140.method183();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1348[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1462[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1382[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1328[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1316 = new class35(var6, "mapmarker", 0);
					field1317 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1076[var33] = new class35(var6, "cross", var33);
					}

					field1207 = new class35(var6, "mapdots", 0);
					field1208 = new class35(var6, "mapdots", 1);
					field1209 = new class35(var6, "mapdots", 2);
					field1210 = new class35(var6, "mapdots", 3);
					field1390 = new class36(var6, "scrollbar", 0);
					field1391 = new class36(var6, "scrollbar", 1);
					field1267 = new class36(var6, "redstone1", 0);
					field1268 = new class36(var6, "redstone2", 0);
					field1269 = new class36(var6, "redstone3", 0);
					field1270 = new class36(var6, "redstone1", 0);
					field1270.method196();
					field1271 = new class36(var6, "redstone2", 0);
					field1271.method196();
					field1442 = new class36(var6, "redstone1", 0);
					field1442.method197();
					field1443 = new class36(var6, "redstone2", 0);
					field1443.method197();
					field1444 = new class36(var6, "redstone3", 0);
					field1444.method197();
					field1445 = new class36(var6, "redstone1", 0);
					field1445.method196();
					field1445.method197();
					field1446 = new class36(var6, "redstone2", 0);
					field1446.method196();
					field1446.method197();

					for (int var34 = 0; var34 < 2; var34++) {
						field1356[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1339 = new class43(method11(), var35.field597, var35.field598);
					var35.method184(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1340 = new class43(method11(), var36.field597, var36.field598);
					var36.method184(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1341 = new class43(method11(), var37.field597, var37.field598);
					var37.method184(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1342 = new class43(method11(), var38.field597, var38.field598);
					var38.method184(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1343 = new class43(method11(), var39.field597, var39.field598);
					var39.method184(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1344 = new class43(method11(), var40.field597, var40.field598);
					var40.method184(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1345 = new class43(method11(), var41.field597, var41.field598);
					var41.method184(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1346 = new class43(method11(), var42.field597, var42.field598);
					var42.method184(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1347 = new class43(method11(), var43.field597, var43.field598);
					var43.method184(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1462[var48] != null) {
							field1462[var48].method182(var46 + var47, var45 + var47, var44 + var47);
						}

						if (field1348[var48] != null) {
							field1348[var48].method198(var46 + var47, var45 + var47, var44 + var47);
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
					class60.field914 = field1202;

					if (!field1203) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method299("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method318(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1295, field1296, field1297, field1298 };
					class4.method32(var5, var51, var6);
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

						field1372[var52] = var53;
						field1114[var52] = var54 - var53;
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

						field1272[var56 - 5] = var57 - 25;
						field1427[var56 - 5] = var58 - var57;
					}

					class34.method166(479, 96);
					field1234 = class34.field584;
					class34.method166(190, 261);
					field1235 = class34.field584;
					class34.method166(512, 334);
					field1236 = class34.field584;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field582[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(334, var60, 500, 800, 512);
					class71.method391(var8);
					field1333 = new class58(this);
					method12(field1333, 10);
					class28.field441 = this;
					class57.field821 = this;
					class59.field873 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1393 + " " + field1141);
					field1283 = true;
				}
			} else {
				field1189 = true;
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method464(int arg0, int arg1) {
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
	public static final void method465() {
		class18.field258 = false;
		class34.field573 = false;
		field1203 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method466() {
		for (int var1 = -1; var1 < field1179; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1177;
			} else {
				var2 = field1180[var1];
			}

			class27 var3 = field1178[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1127; var4++) {
			int var5 = field1128[var4];
			class26 var6 = field1126[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;III)V")
	public final void method467(int arg0, class4 arg1, int arg2, int arg3) {
		if (arg1.field63 == 0 && arg1.field78 != null && (!arg1.field77 || field1164 == arg1.field61 || field1187 == arg1.field61 || field1108 == arg1.field61)) {
			int var5 = class33.field568;
			int var6 = class33.field566;
			int var7 = class33.field569;
			int var8 = class33.field567;
			class33.method154(arg1.field67 + arg0, arg1.field66 + arg2, arg2, arg0);
			int var9 = arg1.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field79[var10] + arg2;
				int var12 = arg1.field80[var10] + arg0 - arg3;
				class4 var13 = class4.field56[arg1.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method441(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method467(var12, var13, var11, var13.field76);

					if (var13.field75 > var13.field67) {
						method508(var13.field67, var12, var13.field75, var13.field66 + var11, var13.field76);
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
									if (var17 > class33.field568 - 32 && var17 < class33.field569 && var18 > class33.field566 - 32 && var18 < class33.field567 || field1419 != 0 && field1418 == var14) {
										int var22 = 0;
										if (field1215 == 1 && field1216 == var14 && field1217 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method354(var21, var13.field58[var14], var22);
										if (var23 != null) {
											if (field1419 != 0 && field1418 == var14 && field1417 == var13.field61) {
												var19 = field17 - field1420;
												var20 = field18 - field1421;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1094 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method188(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < class33.field566 && arg1.field76 > 0) {
													int var24 = (class33.field566 - var18 - var20) * field1279 / 3;
													if (var24 > field1279 * 10) {
														var24 = field1279 * 10;
													}

													if (var24 > arg1.field76) {
														var24 = arg1.field76;
													}

													arg1.field76 -= var24;
													field1421 += var24;
												}

												if (var18 + var20 + 32 > class33.field567 && arg1.field76 < arg1.field75 - arg1.field67) {
													int var25 = (var18 + var20 + 32 - class33.field567) * field1279 / 3;
													if (var25 > field1279 * 10) {
														var25 = field1279 * 10;
													}

													if (var25 > arg1.field75 - arg1.field67 - arg1.field76) {
														var25 = arg1.field75 - arg1.field67 - arg1.field76;
													}

													arg1.field76 += var25;
													field1421 -= var25;
												}
											} else if (field1402 != 0 && field1401 == var14 && field1400 == var13.field61) {
												var23.method188(var18, 128, var17);
											} else {
												var23.method186(var17, var18);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1295.method206(var18 + var20 + 10, 0, var17 + var19 + 1, method483(var26));
												field1295.method206(var18 + var20 + 9, 0xFFFF00, var17 + var19, method483(var26));
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
						if (field1108 == var13.field61 || field1187 == var13.field61 || field1164 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method505(var13)) {
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
								class33.method157(var29, var13.field67, var13.field66, var11, var12);
							} else {
								class33.method158(var13.field67, var12, var29, var13.field66, var11);
							}
						} else if (var13.field93) {
							class33.method156(var29, var13.field67, var13.field66, var11, var12, 256 - (var13.field68 & 0xFF));
						} else {
							class33.method159(var13.field66, var13.field67, var29, var12, 256 - (var13.field68 & 0xFF), var11);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1108 == var13.field61 || field1187 == var13.field61 || field1164 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method505(var13)) {
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

						if (var13.field64 == 6 && field1284) {
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

									var31 = var31.substring(0, var35) + method535(method474(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method535(method474(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method535(method474(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method535(method474(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method535(method474(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method203(var13.field66 / 2 + var11, var13.field95, var33, var41, var34);
							} else {
								var30.method210(var33, var11, var13.field95, var34, var41);
							}

							var34 += var30.field617;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method505(var13)) {
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
						boolean var47 = method505(var13);
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
										var56 = var56 + " x" + method477(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method203(var13.field66 / 2 + var57, var13.field95, var13.field99, var56, var58);
									} else {
										var51.method210(var13.field99, var57, var13.field95, var58, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method154(var8, var7, var5, var6);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method468() {
		field1423++;
		if (field1423 > 192) {
			field1423 = 0;
			field1077.method218(57);
			field1077.method219(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1092 != -1 && field1184 == field1092) {
						break;
					}

					if (field1315) {
						if (var1 >= 32 && var1 <= 122 && field1305.length() < 80) {
							field1305 = field1305 + (char) var1;
							field1469 = true;
						}

						if (var1 == 8 && field1305.length() > 0) {
							field1305 = field1305.substring(0, field1305.length() - 1);
							field1469 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1315 = false;
							field1469 = true;

							if (field1365 == 1) {
								long var2 = class51.method300(field1305);
								method549(var2);
							}

							if (field1365 == 2 && field1109 > 0) {
								long var4 = class51.method300(field1305);
								method521(var4);
							}

							if (field1365 == 3 && field1305.length() > 0) {
								field1077.method218(236);
								field1077.method219(0);
								int var6 = field1077.field621;
								field1077.method225(field1464);
								class52.method307(field1077, field1305);
								field1077.method228(field1077.field621 - var6);
								field1305 = class52.method308(field1305);
								field1305 = class71.method401(field1305);
								method440(class51.method304(class51.method301(field1464)), field1305, 6);

								if (field1338 == 2) {
									field1338 = 1;
									field1355 = true;
									field1077.method218(158);
									field1077.method219(field1067);
									field1077.method219(field1338);
									field1077.method219(field1220);
								}
							}

							if (field1365 == 4 && field1373 < 100) {
								long var7 = class51.method300(field1305);
								method548(var7);
							}

							if (field1365 == 5 && field1373 > 0) {
								long var9 = class51.method300(field1305);
								method459(var9);
							}
						}
					} else if (field1106) {
						if (var1 >= 48 && var1 <= 57 && field1330.length() < 10) {
							field1330 = field1330 + (char) var1;
							field1469 = true;
						}

						if (var1 == 8 && field1330.length() > 0) {
							field1330 = field1330.substring(0, field1330.length() - 1);
							field1469 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1330.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1330);
								} catch (Exception var18) {
								}

								field1077.method218(12);
								field1077.method223(var11);
							}

							field1106 = false;
							field1469 = true;
						}
					} else if (field1064 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1211.length() < 80) {
							field1211 = field1211 + (char) var1;
							field1469 = true;
						}

						if (var1 == 8 && field1211.length() > 0) {
							field1211 = field1211.substring(0, field1211.length() - 1);
							field1469 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1211.length() > 0) {
							if (field1206 == 2) {
								if (field1211.equals("::clientdrop")) {
									method452();
								}

								if (field1211.equals("::lag")) {
									method432();
								}

								if (field1211.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1232.method272(2); var12++) {
										field1232.method282((byte) 1, 2, var12);
									}
								}

								if (field1211.equals("::fpson")) {
									field1447 = true;
								}

								if (field1211.equals("::fpsoff")) {
									field1447 = false;
								}
							}

							if (field1211.startsWith("::")) {
								field1077.method218(95);
								field1077.method219(field1211.length() - 1);
								field1077.method226(field1211.substring(2));
							} else {
								String var13 = field1211.toLowerCase();
								byte var14 = 0;
								if (var13.startsWith("yellow:")) {
									var14 = 0;
									field1211 = field1211.substring(7);
								} else if (var13.startsWith("red:")) {
									var14 = 1;
									field1211 = field1211.substring(4);
								} else if (var13.startsWith("green:")) {
									var14 = 2;
									field1211 = field1211.substring(6);
								} else if (var13.startsWith("cyan:")) {
									var14 = 3;
									field1211 = field1211.substring(5);
								} else if (var13.startsWith("purple:")) {
									var14 = 4;
									field1211 = field1211.substring(7);
								} else if (var13.startsWith("white:")) {
									var14 = 5;
									field1211 = field1211.substring(6);
								} else if (var13.startsWith("flash1:")) {
									var14 = 6;
									field1211 = field1211.substring(7);
								} else if (var13.startsWith("flash2:")) {
									var14 = 7;
									field1211 = field1211.substring(7);
								} else if (var13.startsWith("flash3:")) {
									var14 = 8;
									field1211 = field1211.substring(7);
								} else if (var13.startsWith("glow1:")) {
									var14 = 9;
									field1211 = field1211.substring(6);
								} else if (var13.startsWith("glow2:")) {
									var14 = 10;
									field1211 = field1211.substring(6);
								} else if (var13.startsWith("glow3:")) {
									var14 = 11;
									field1211 = field1211.substring(6);
								}

								String var15 = field1211.toLowerCase();
								byte var16 = 0;
								if (var15.startsWith("wave:")) {
									var16 = 1;
									field1211 = field1211.substring(5);
								} else if (var15.startsWith("wave2:")) {
									var16 = 2;
									field1211 = field1211.substring(6);
								} else if (var15.startsWith("shake:")) {
									var16 = 3;
									field1211 = field1211.substring(6);
								} else if (var15.startsWith("scroll:")) {
									var16 = 4;
									field1211 = field1211.substring(7);
								} else if (var15.startsWith("slide:")) {
									var16 = 5;
									field1211 = field1211.substring(6);
								}

								field1077.method218(29);
								field1077.method219(0);
								int var17 = field1077.field621;
								field1077.method219(var14);
								field1077.method219(var16);
								class52.method307(field1077, field1211);
								field1077.method228(field1077.field621 - var17);
								field1211 = class52.method308(field1211);
								field1211 = class71.method401(field1211);
								field1088.field372 = field1211;
								field1088.field374 = var14;
								field1088.field375 = var16;
								field1088.field373 = 150;

								if (field1206 == 2) {
									method440("@cr2@" + field1088.field416, field1088.field372, 2);
								} else if (field1206 == 1) {
									method440("@cr1@" + field1088.field416, field1088.field372, 2);
								} else {
									method440(field1088.field416, field1088.field372, 2);
								}

								if (field1067 == 2) {
									field1067 = 3;
									field1355 = true;
									field1077.method218(158);
									field1077.method219(field1067);
									field1077.method219(field1338);
									field1077.method219(field1220);
								}
							}

							field1211 = "";
							field1469 = true;
						}
					}
				}

				if (var1 == 8 && field1471.length() > 0) {
					field1471 = field1471.substring(0, field1471.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1471.length() < 12) {
				field1471 = field1471 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(Llb;ZI)V")
	public final void method469(class38 arg0, int arg1) {
		int var3 = arg0.method240(8);
		if (var3 < field1179) {
			for (int var4 = var3; var4 < field1179; var4++) {
				field1309[field1308++] = field1180[var4];
			}
		}

		if (var3 > field1179) {
			signlink.reporterror(field1222 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1179 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1180[var5];
			class27 var7 = field1178[var6];
			int var8 = arg0.method240(1);
			if (var8 == 0) {
				field1180[field1179++] = var6;
				var7.field405 = field1118;
			} else {
				int var9 = arg0.method240(2);
				if (var9 == 0) {
					field1180[field1179++] = var6;
					var7.field405 = field1118;
					field1182[field1181++] = var6;
				} else if (var9 == 1) {
					field1180[field1179++] = var6;
					var7.field405 = field1118;
					int var10 = arg0.method240(3);
					var7.method111(var10, false);
					int var11 = arg0.method240(1);
					if (var11 == 1) {
						field1182[field1181++] = var6;
					}
				} else if (var9 == 2) {
					field1180[field1179++] = var6;
					var7.field405 = field1118;
					int var12 = arg0.method240(3);
					var7.method111(var12, true);
					int var13 = arg0.method240(3);
					var7.method111(var13, true);
					int var14 = arg0.method240(1);
					if (var14 == 1) {
						field1182[field1181++] = var6;
					}
				} else if (var9 == 3) {
					field1309[field1308++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method470() {
		field1130 = 0;
		for (int var1 = -1; var1 < field1179 + field1127; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1088;
			} else if (var1 < field1179) {
				var2 = field1178[field1180[var1]];
			} else {
				var2 = field1126[field1128[var1 - field1179]];
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

				if (var1 >= field1179) {
					class59 var7 = ((class26) var2).field415;
					if (var7.field903 >= 0 && var7.field903 < field1328.length) {
						method538(var2.field406 + 15, var2);

						if (field1213 > -1) {
							field1328[var7.field903].method186(field1213 - 12, field1214 - 30);
						}
					}

					if (field1288 == 1 && field1128[var1 - field1179] == field1068 && field1118 % 20 < 10) {
						method538(var2.field406 + 15, var2);

						if (field1213 > -1) {
							field1328[2].method186(field1213 - 12, field1214 - 28);
						}
					}
				} else {
					int var4 = 30;
					class27 var5 = (class27) var2;
					if (var5.field419 != 0) {
						method538(var2.field406 + 15, var2);

						if (field1213 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field419 & 1 << var6) != 0) {
									field1328[var6].method186(field1213 - 12, field1214 - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1288 == 10 && field1180[var1] == field1477) {
						method538(var2.field406 + 15, var2);

						if (field1213 > -1) {
							field1328[7].method186(field1213 - 12, field1214 - var4);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1179 || field1067 == 0 || field1067 == 3 || field1067 == 1 && method517(((class27) var2).field416))) {
					method538(var2.field406, var2);

					if (field1213 > -1 && field1130 < field1131) {
						field1135[field1130] = field1297.method205(var2.field372) / 2;
						field1134[field1130] = field1297.field617;
						field1132[field1130] = field1213;
						field1133[field1130] = field1214;
						field1136[field1130] = var2.field374;
						field1137[field1130] = var2.field375;
						field1138[field1130] = var2.field373;
						field1139[field1130++] = var2.field372;

						if (field1111 == 0 && var2.field375 >= 1 && var2.field375 <= 3) {
							field1134[field1130] += 10;
							field1133[field1130] += 5;
						}

						if (field1111 == 0 && var2.field375 == 4) {
							field1135[field1130] = 60;
						}

						if (field1111 == 0 && var2.field375 == 5) {
							field1134[field1130] += 5;
						}
					}
				}

				if (var2.field379 > field1118) {
					method538(var2.field406 + 15, var2);

					if (field1213 > -1) {
						int var8 = var2.field380 * 30 / var2.field381;
						if (var8 > 30) {
							var8 = 30;
						}

						class33.method157(0xFF00, 5, var8, field1213 - 15, field1214 - 3);
						class33.method157(0xFF0000, 5, 30 - var8, field1213 - 15 + var8, field1214 - 3);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field378[var9] > field1118) {
						method538(var2.field406 / 2, var2);

						if (field1213 > -1) {
							if (var9 == 1) {
								field1214 -= 20;
							}

							if (var9 == 2) {
								field1213 -= 15;
								field1214 -= 10;
							}

							if (var9 == 3) {
								field1213 += 15;
								field1214 -= 10;
							}

							field1382[var2.field377[var9]].method186(field1213 - 12, field1214 - 12);
							field1295.method202(field1213, 0, String.valueOf(var2.field376[var9]), field1214 + 4);
							field1295.method202(field1213 - 1, 0xFFFFFF, String.valueOf(var2.field376[var9]), field1214 + 3);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field1130; var10++) {
			int var11 = field1132[var10];
			int var12 = field1133[var10];
			int var13 = field1135[var10];
			int var14 = field1134[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1133[var16] - field1134[var16] && var12 - var14 < field1133[var16] + 2 && var11 - var13 < field1135[var16] + field1132[var16] && var11 + var13 > field1132[var16] - field1135[var16] && field1133[var16] - field1134[var16] < var12) {
						var12 = field1133[var16] - field1134[var16];
						var15 = true;
					}
				}
			}

			field1213 = field1132[var10];
			field1214 = field1133[var10] = var12;
			String var17 = field1139[var10];
			if (field1111 == 0) {
				int var18 = 0xFFFF00;
				if (field1136[var10] < 6) {
					var18 = field1381[field1136[var10]];
				}

				if (field1136[var10] == 6) {
					var18 = field1463 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1136[var10] == 7) {
					var18 = field1463 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1136[var10] == 8) {
					var18 = field1463 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1136[var10] == 9) {
					int var19 = 150 - field1138[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field1136[var10] == 10) {
					int var20 = 150 - field1138[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field1136[var10] == 11) {
					int var21 = 150 - field1138[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field1137[var10] == 0) {
					field1297.method202(field1213, 0, var17, field1214 + 1);
					field1297.method202(field1213, var18, var17, field1214);
				}

				if (field1137[var10] == 1) {
					field1297.method207(field1463, 0, field1213, field1214 + 1, var17);
					field1297.method207(field1463, var18, field1213, field1214, var17);
				}

				if (field1137[var10] == 2) {
					field1297.method208(field1214 + 1, var17, field1213, field1463, 0);
					field1297.method208(field1214, var17, field1213, field1463, var18);
				}

				if (field1137[var10] == 3) {
					field1297.method209(150 - field1138[var10], field1463, var17, 0, field1214 + 1, field1213);
					field1297.method209(150 - field1138[var10], field1463, var17, var18, field1214, field1213);
				}

				if (field1137[var10] == 4) {
					int var22 = field1297.method205(var17);
					int var23 = (150 - field1138[var10]) * (var22 + 100) / 150;
					class33.method154(334, field1213 + 50, field1213 - 50, 0);
					field1297.method206(field1214 + 1, 0, field1213 + 50 - var23, var17);
					field1297.method206(field1214, var18, field1213 + 50 - var23, var17);
					class33.method153();
				}

				if (field1137[var10] == 5) {
					int var24 = 150 - field1138[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					class33.method154(field1214 + 5, 512, 0, field1214 - field1297.field617 - 1);
					field1297.method202(field1213, 0, var17, field1214 + var25 + 1);
					field1297.method202(field1213, var18, var17, field1214 + var25);
					class33.method153();
				}
			} else {
				field1297.method202(field1213, 0, var17, field1214 + 1);
				field1297.method202(field1213, 0xFFFF00, var17, field1214);
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method471() {
		byte[] var1 = field1285.method299("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1451.method258();
		var2.method184(0, 0);
		field1452.method258();
		var2.method184(-637, 0);
		field1448.method258();
		var2.method184(-128, 0);
		field1449.method258();
		var2.method184(-202, -371);
		field1450.method258();
		var2.method184(-202, -171);
		field1453.method258();
		var2.method184(0, -265);
		field1454.method258();
		var2.method184(-562, -265);
		field1455.method258();
		var2.method184(-128, -171);
		field1456.method258();
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

		field1451.method258();
		var2.method184(382, 0);
		field1452.method258();
		var2.method184(-255, 0);
		field1448.method258();
		var2.method184(254, 0);
		field1449.method258();
		var2.method184(180, -371);
		field1450.method258();
		var2.method184(180, -171);
		field1453.method258();
		var2.method184(382, -265);
		field1454.method258();
		var2.method184(-180, -265);
		field1455.method258();
		var2.method184(254, -171);
		field1456.method258();
		var2.method184(-180, -171);
		class35 var7 = new class35(field1285, "logo", 0);
		field1448.method258();
		var7.method186(382 - var7.field597 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public final void method472(int arg0, class38 arg1) {
		field1308 = 0;
		field1181 = 0;
		method537(arg1, arg0);
		method469(arg1, arg0);
		method528(arg0, arg1);
		method541(arg0, arg1);

		for (int var3 = 0; var3 < field1308; var3++) {
			int var4 = field1309[var3];
			if (field1118 != field1178[var4].field405) {
				field1178[var4] = null;
			}
		}

		if (arg1.field621 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field621 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1179; var5++) {
			if (field1178[field1180[var5]] == null) {
				signlink.reporterror(field1222 + " null entry in pl list - pos:" + var5 + " size:" + field1179);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIILd;ZI)V")
	public final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5, boolean arg6, int arg7) {
		if (field1168) {
			field1188 = 32;
		} else {
			field1188 = 0;
		}

		field1168 = false;
		if (arg3 >= arg7 && arg3 < arg7 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
			arg5.field76 -= field1428 * 4;

			if (arg6) {
				field1422 = true;
				return;
			}
		} else if (arg3 >= arg7 && arg3 < arg7 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
			arg5.field76 += field1428 * 4;

			if (arg6) {
				field1422 = true;
				return;
			}
		} else if (arg3 >= arg7 - field1188 && arg3 < arg7 + field1188 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && field1428 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg1 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg5.field76 = (arg0 - arg4) * var10 / var11;

			if (arg6) {
				field1422 = true;
			}

			field1168 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(BLd;I)I")
	public final int method474(class4 arg0, int arg1) {
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
					var8 = field1354[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1480[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1158[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field909 && (!class60.method348(var11).field930 || field1202)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1352[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1367[field1480[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1352[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1088.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1012; var13++) {
						if (class67.field1014[var13]) {
							var8 += field1480[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field909 && (!class60.method348(var15).field930 || field1202)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1123;
				}

				if (var7 == 12) {
					var8 = field1398;
				}

				if (var7 == 13) {
					int var17 = field1352[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1030[var19];
					int var21 = var20.field1032;
					int var22 = var20.field1033;
					int var23 = var20.field1034;
					int var24 = field1459[var23 - var22];
					var8 = field1352[var21] >> var22 & var24;
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
					var8 = (field1088.field360 >> 7) + field1072;
				}

				if (var7 == 19) {
					var8 = (field1088.field361 >> 7) + field1073;
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

	@ObfuscatedName("client.a(IIIIIIIZII)V")
	public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1392.method248(); var11 != null; var11 = (class40) field1392.method250()) {
			if (var11.field638 == arg4 && var11.field640 == arg3 && var11.field641 == arg2 && var11.field639 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field638 = arg4;
			var10.field639 = arg0;
			var10.field640 = arg3;
			var10.field641 = arg2;
			method453(var10);
			field1392.method245(var10);
		}

		var10.field645 = arg5;
		var10.field647 = arg1;
		var10.field646 = arg7;
		var10.field648 = arg6;
		var10.field649 = arg8;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method10() {
		field1461 = true;
	}

	@ObfuscatedName("client.a(BILlb;)V")
	public final void method476(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1181; var3++) {
			int var4 = field1182[var3];
			class26 var5 = field1126[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method229();
				int var8 = arg1.method229();
				var5.method114(var7, var8, field1118);
				var5.field379 = field1118 + 300;
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
				var5.method114(var12, var13, field1118);
				var5.field379 = field1118 + 300;
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
				var5.field396 = (var14 & 0xFFFF) + field1118;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1118) {
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

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method477(int arg0) {
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

	@ObfuscatedName("client.a(BLlb;I)V")
	public final void method478(class38 arg0, int arg1) {
		if (arg1 == 99 || arg1 == 131) {
			int var3 = arg0.method229();
			int var4 = (var3 >> 4 & 0x7) + field1258;
			int var5 = (var3 & 0x7) + field1259;
			int var6 = arg0.method229();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1100[var7];
			int var10;
			if (arg1 == 131) {
				var10 = -1;
			} else {
				var10 = arg0.method231();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method475(var9, var7, var5, var4, field1301, var10, 0, var8, -1);
			}
		} else if (arg1 == 82) {
			int var11 = arg0.method229();
			int var12 = (var11 >> 4 & 0x7) + field1258;
			int var13 = (var11 & 0x7) + field1259;
			int var14 = arg0.method229();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1100[var15];
			int var18 = arg0.method231();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1157[field1301][var12][var13];
				int var20 = field1157[field1301][var12 + 1][var13];
				int var21 = field1157[field1301][var12 + 1][var13 + 1];
				int var22 = field1157[field1301][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1363.method72(var13, field1301, var12);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(var24, var19, false, var22, var18, 2, var21, var16 + 4, var20);
							var23.field255 = new class28(var24, var19, false, var22, var18, 2, var21, var16 + 1 & 0x3, var20);
						} else {
							var23.field254 = new class28(var24, var19, false, var22, var18, var15, var21, var16, var20);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1363.method73(var13, field1301, var12);
					if (var25 != null) {
						var25.field147 = new class28(var25.field148 >> 14 & 0x7FFF, var19, false, var22, var18, 4, var21, 0, var20);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1363.method74(var13, field1301, var12);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var26.field247 >> 14 & 0x7FFF, var19, false, var22, var18, var15, var21, var16, var20);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1363.method75(field1301, var12, var13);
					if (var27 != null) {
						var27.field178 = new class28(var27.field179 >> 14 & 0x7FFF, var19, false, var22, var18, 22, var21, var16, var20);
					}
				}
			}
		} else if (arg1 == 42) {
			int var28 = arg0.method229();
			int var29 = (var28 >> 4 & 0x7) + field1258;
			int var30 = (var28 & 0x7) + field1259;
			int var31 = arg0.method231();
			int var32 = arg0.method231();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1151[field1301][var29][var30] == null) {
					field1151[field1301][var29][var30] = new class41();
				}

				field1151[field1301][var29][var30].method245(var33);
				method511(var29, var30);
			}
		} else if (arg1 == 139) {
			int var34 = arg0.method229();
			int var35 = (var34 >> 4 & 0x7) + field1258;
			int var36 = (var34 & 0x7) + field1259;
			int var37 = arg0.method231();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1151[field1301][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method248(); var39 != null; var39 = (class29) var38.method250()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method106();
							break;
						}
					}

					if (var38.method248() == null) {
						field1151[field1301][var35][var36] = null;
					}

					method511(var35, var36);
				}
			}
		} else if (arg1 == 164) {
			int var40 = arg0.method229();
			int var41 = (var40 >> 4 & 0x7) + field1258;
			int var42 = (var40 & 0x7) + field1259;
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
				class30 var53 = new class30(method510(var41, var42, field1301) - var47, var52, var51, var45, var41, field1301, var46, var48, var42, field1118 + var50, field1118 + var49);
				var53.method120(field1118 + var49, method510(var43, var44, field1301) - var48, var44, var43);
				field1303.method245(var53);
			}
		} else if (arg1 == 127) {
			int var54 = arg0.method229();
			int var55 = (var54 >> 4 & 0x7) + field1258;
			int var56 = (var54 & 0x7) + field1259;
			int var57 = arg0.method231();
			int var58 = arg0.method229();
			int var59 = arg0.method231();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(method510(var55, var56, field1301) - var58, var56, field1118, var59, field1301, var55, var57);
				field1080.method245(var60);
			}
		} else if (arg1 == 138) {
			int var61 = arg0.method229();
			int var62 = (var61 >> 4 & 0x7) + field1258;
			int var63 = (var61 & 0x7) + field1259;
			int var64 = arg0.method231();
			int var65 = arg0.method231();
			int var66 = arg0.method231();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1142 != var66) {
				class29 var67 = new class29();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1151[field1301][var62][var63] == null) {
					field1151[field1301][var62][var63] = new class41();
				}

				field1151[field1301][var62][var63].method245(var67);
				method511(var62, var63);
			}
		} else {
			if (arg1 == 91) {
				int var68 = arg0.method229();
				int var69 = (var68 >> 4 & 0x7) + field1258;
				int var70 = (var68 & 0x7) + field1259;
				int var71 = arg0.method229();
				int var72 = var71 >> 2;
				int var73 = var71 & 0x3;
				int var74 = field1100[var72];
				int var75 = arg0.method231();
				int var76 = arg0.method231();
				int var77 = arg0.method231();
				int var78 = arg0.method231();
				byte var79 = arg0.method230();
				byte var80 = arg0.method230();
				byte var81 = arg0.method230();
				byte var82 = arg0.method230();
				class27 var83;
				if (field1142 == var78) {
					var83 = field1088;
				} else {
					var83 = field1178[var78];
				}

				if (var83 != null) {
					class57 var84 = class57.method330(var75);
					int var85 = field1157[field1301][var69][var70];
					int var86 = field1157[field1301][var69 + 1][var70];
					int var87 = field1157[field1301][var69 + 1][var70 + 1];
					int var88 = field1157[field1301][var69][var70 + 1];
					class31 var89 = var84.method336(var72, var73, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method475(var74, 0, var70, var69, field1301, -1, var76 + 1, 0, var77 + 1);
						var83.field426 = field1118 + var76;
						var83.field427 = field1118 + var77;
						var83.field431 = var89;
						int var90 = var84.field835;
						int var91 = var84.field836;
						if (var73 == 1 || var73 == 3) {
							var90 = var84.field836;
							var91 = var84.field835;
						}

						var83.field428 = var69 * 128 + var90 * 64;
						var83.field430 = var70 * 128 + var91 * 64;
						var83.field429 = method510(var83.field428, var83.field430, field1301);

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
				int var95 = (var94 >> 4 & 0x7) + field1258;
				int var96 = (var94 & 0x7) + field1259;
				int var97 = arg0.method231();
				int var98 = arg0.method231();
				int var99 = arg0.method231();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					class41 var100 = field1151[field1301][var95][var96];
					if (var100 != null) {
						for (class29 var101 = (class29) var100.method248(); var101 != null; var101 = (class29) var100.method250()) {
							if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
								var101.field456 = var99;
								break;
							}
						}

						method511(var95, var96);
					}
				}
			} else if (arg1 == 196) {
				int var102 = arg0.method229();
				int var103 = (var102 >> 4 & 0x7) + field1258;
				int var104 = (var102 & 0x7) + field1259;
				int var105 = arg0.method231();
				int var106 = arg0.method229();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field1088.field410[0] >= var103 - var107 && field1088.field410[0] <= var103 + var107 && field1088.field411[0] >= var104 - var107 && field1088.field411[0] <= var104 + var107 && field1276 && !field1203 && field1332 < 50) {
					field1439[field1332] = var105;
					field1091[field1332] = var108;
					field1062[field1332] = class55.field790[var105];
					field1332++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method479() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1239[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1239[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1240[var10] = (field1239[var10 - 1] + field1239[var10 + 1] + field1239[var10 - 128] + field1239[var10 + 128]) / 4;
			}
		}

		field1256 += 128;
		if (field1256 > field1326.length) {
			field1256 -= field1326.length;
			int var11 = (int) (Math.random() * 12.0D);
			method524(field1470[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1240[var14 + 128] - field1326[field1256 + var14 & field1326.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1239[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1360[var16] = field1360[var16 + 1];
		}

		field1360[var1 - 1] = (int) (Math.sin(field1118 / 14.0D) * 16.0D + Math.sin(field1118 / 15.0D) * 14.0D + Math.sin(field1118 / 16.0D) * 12.0D);

		if (field1119 > 0) {
			field1119 -= 4;
		}

		if (field1120 > 0) {
			field1120 -= 4;
		}

		if (field1119 == 0 && field1120 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1119 = 1024;
			}

			if (var17 == 1) {
				field1120 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method480() {
		field1238 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1198) {
				field1458++;
				method479();
				method479();
				method489();
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

		field1238 = false;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method481() {
		int var1 = 5;
		field1251[8] = 0;
		int var2 = 0;
		while (field1251[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method463("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 295);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field620, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1251[var6] = var5.method234();
				}

				int var7 = var5.method234();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1251[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1251[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1251[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1251[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1251[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1251[8] == 0) {
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

				field1287 = !field1287;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method482() {
		field1077.method218(84);

		if (field1289 != -1) {
			field1289 = -1;
			field1422 = true;
			field1284 = false;
			field1191 = true;
		}

		if (field1064 != -1) {
			field1064 = -1;
			field1469 = true;
			field1284 = false;
		}

		field1092 = -1;
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String method483(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.w(I)Z")
	public final boolean method484() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method485(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IIIIZIIIIIZI)Z")
	public final boolean method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1403[var14][var15] = 0;
				field1253[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg8;
		field1403[arg6][arg8] = 99;
		field1253[arg6][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1148[var18] = arg6;
		int var35 = var18 + 1;
		field1149[var18] = arg8;
		boolean var20 = false;
		int var21 = field1148.length;
		int[][] var22 = field1434[field1301].field963;
		while (var35 != var19) {
			var16 = field1148[var19];
			var17 = field1149[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}

			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && field1434[field1301].method368(arg2, var17, var16, arg4 - 1, arg1, arg7)) {
					var20 = true;
					break;
				}

				if (arg4 < 10 && field1434[field1301].method369(var16, arg7, arg4 - 1, arg2, var17, arg1)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg5 != 0 && field1434[field1301].method370(var17, arg5, var16, arg1, arg3, arg10, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field1253[var16][var17] + 1;
			if (var16 > 0 && field1403[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1403[var16 - 1][var17] = 2;
				field1253[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1403[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1403[var16 + 1][var17] = 8;
				field1253[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1403[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1403[var16][var17 - 1] = 1;
				field1253[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1403[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1403[var16][var17 + 1] = 4;
				field1253[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1403[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1403[var16 - 1][var17 - 1] = 3;
				field1253[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1403[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1403[var16 + 1][var17 - 1] = 9;
				field1253[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1403[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16 - 1;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1403[var16 - 1][var17 + 1] = 6;
				field1253[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1403[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1148[var35] = var16 + 1;
				field1149[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1403[var16 + 1][var17 + 1] = 12;
				field1253[var16 + 1][var17 + 1] = var23;
			}
		}

		field1416 = 0;
		if (!var20) {
			if (arg9) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg2 - var25; var27 <= arg2 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1253[var26][var27] < var24) {
								var24 = field1253[var26][var27];
								var16 = var26;
								var17 = var27;
								field1416 = 1;
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
		int var30 = var29 = field1403[var16][var17];
		while (arg6 != var16 || arg8 != var17) {
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

			var30 = field1403[var16][var17];
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
		int var32 = field1148[var36];
		int var33 = field1149[var36];

		if (arg0 == 0) {
			field1077.method218(201);
			field1077.method219(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field1077.method218(77);
			field1077.method219(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field1077.method218(41);
			field1077.method219(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1077.method219(1);
		} else {
			field1077.method219(0);
		}

		field1077.method220(field1072 + var32);
		field1077.method220(field1073 + var33);
		field1395 = field1148[0];
		field1396 = field1149[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1077.method219(field1148[var36] - var32);
			field1077.method219(field1149[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(Ld;I)Z")
	public final boolean method487(class4 arg0) {
		int var2 = arg0.field65;
		if (field1110 == 2) {
			if (var2 == 201) {
				field1469 = true;
				field1106 = false;
				field1315 = true;
				field1305 = "";
				field1365 = 1;
				field1426 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1469 = true;
				field1106 = false;
				field1315 = true;
				field1305 = "";
				field1365 = 2;
				field1426 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1147 = 250;
			return true;
		}

		if (var2 == 501) {
			field1469 = true;
			field1106 = false;
			field1315 = true;
			field1305 = "";
			field1365 = 4;
			field1426 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1469 = true;
			field1106 = false;
			field1315 = true;
			field1305 = "";
			field1365 = 5;
			field1426 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1304[var3];
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

					if (!class64.field978[var5].field984 && class64.field978[var5].field979 == var3 + (field1359 ? 0 : 7)) {
						break;
					}
				}

				field1304[var3] = var5;
				field1325 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1334[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1273[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1273[var6].length) {
					var8 = 0;
				}
			}

			field1334[var6] = var8;
			field1325 = true;
		}

		if (var2 == 324 && !field1359) {
			field1359 = true;
			method546();
		}

		if (var2 == 325 && field1359) {
			field1359 = false;
			method546();
		}

		if (var2 == 326) {
			field1077.method218(169);
			field1077.method219(field1359 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1077.method219(field1304[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1077.method219(field1334[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1101 = !field1101;
		}

		if (var2 >= 601 && var2 <= 612) {
			method482();

			if (field1471.length() > 0) {
				field1077.method218(91);
				field1077.method225(class51.method300(field1471));
				field1077.method219(var2 - 601);
				field1077.method219(field1101 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method488() {
		if (field1105 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1165 + field1096 & 0x7FF;
				int var4 = class34.field582[var3];
				int var5 = class34.field583[var3];
				var4 = (field1374 + 256) * var4 >> 8;
				var5 = (field1374 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1088.field360 + var6 >> 7;
				int var9 = field1088.field361 - var7 >> 7;
				boolean var10 = method486(1, var8, var9, 0, 0, 0, field1088.field410[0], 0, field1088.field411[0], true, 0);
				if (var10) {
					field1077.method219(var1);
					field1077.method219(var2);
					field1077.method220(field1096);
					field1077.method219(57);
					field1077.method219(field1165);
					field1077.method219(field1374);
					field1077.method219(89);
					field1077.method220(field1088.field360);
					field1077.method220(field1088.field361);
					field1077.method219(field1416);
					field1077.method219(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method489() {
		short var1 = 256;

		if (field1119 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1119 > 768) {
					field1465[var2] = method530(field1467[var2], 1024 - field1119, field1466[var2]);
				} else if (field1119 > 256) {
					field1465[var2] = field1467[var2];
				} else {
					field1465[var2] = method530(field1466[var2], 256 - field1119, field1467[var2]);
				}
			}
		} else if (field1120 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1120 > 768) {
					field1465[var3] = method530(field1468[var3], 1024 - field1120, field1466[var3]);
				} else if (field1120 > 256) {
					field1465[var3] = field1468[var3];
				} else {
					field1465[var3] = method530(field1466[var3], 256 - field1120, field1468[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1465[var4] = field1466[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1451.field654[var5] = field1357.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1360[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1239[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1465[var12];
					int var15 = field1451.field654[var7];
					field1451.field654[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1451.method259(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1452.field654[var16] = field1358.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1360[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1239[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1465[var23];
					int var26 = field1452.field654[var18];
					field1452.field654[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1452.method259(0, 637, field9);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method490(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1115 = "";
				field1116 = "Connecting to server...";
				method457(true);
			}

			field1286 = new class5(this, method485(field1201 + 43594));
			long var4 = class51.method300(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1077.field621 = 0;
			field1077.method219(14);
			field1077.method219(var6);
			field1286.method42(2, 0, field1077.field620);

			for (int var7 = 0; var7 < 8; var7++) {
				field1286.method39();
			}

			int var8 = field1286.method39();
			if (var8 == 0) {
				field1286.method41(field1389.field620, 0, 8);
				field1389.field621 = 0;
				field1250 = field1389.method235();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1250 >> 32), (int) field1250 };
				field1077.field621 = 0;
				field1077.method219(10);
				field1077.method223(var9[0]);
				field1077.method223(var9[1]);
				field1077.method223(var9[2]);
				field1077.method223(var9[3]);
				field1077.method223(signlink.uid);
				field1077.method226(arg0);
				field1077.method226(arg1);
				field1077.method244(field1084, field1406);
				field1199.field621 = 0;

				if (arg2) {
					field1199.method219(18);
				} else {
					field1199.method219(16);
				}

				field1199.method219(field1077.field621 + 36 + 1 + 1 + 2);
				field1199.method219(255);
				field1199.method220(295);
				field1199.method219(field1203 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1199.method223(field1251[var10]);
				}

				field1199.method227(field1077.field621, 0, field1077.field620);
				field1077.field625 = new class49(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1186 = new class49(var9);
				field1286.method42(field1199.field621, 0, field1199.field620);
				var8 = field1286.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method490(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1206 = field1286.method39();
				field1175 = field1286.method39() == 1;
				field1079 = 0L;
				field1257 = 0;
				field1333.field870 = 0;
				field14 = true;
				field1121 = true;
				field1099 = true;
				field1077.field621 = 0;
				field1389.field621 = 0;
				field1144 = -1;
				field1473 = -1;
				field1474 = -1;
				field1475 = -1;
				field1143 = 0;
				field1145 = 0;
				field1414 = 0;
				field1147 = 0;
				field1288 = 0;
				field1299 = 0;
				field1371 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1104[var12] = null;
				}

				field1215 = 0;
				field1160 = 0;
				field1429 = 0;
				field1332 = 0;
				field1306 = (int) (Math.random() * 100.0D) - 50;
				field1225 = (int) (Math.random() * 110.0D) - 55;
				field1089 = (int) (Math.random() * 80.0D) - 40;
				field1165 = (int) (Math.random() * 120.0D) - 60;
				field1374 = (int) (Math.random() * 30.0D) - 20;
				field1096 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1105 = 0;
				field1319 = -1;
				field1395 = 0;
				field1396 = 0;
				field1179 = 0;
				field1127 = 0;

				for (int var13 = 0; var13 < field1176; var13++) {
					field1178[var13] = null;
					field1183[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1126[var14] = null;
				}

				field1088 = field1178[field1177] = new class27();
				field1303.method252();
				field1080.method252();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1151[var15][var16][var17] = null;
						}
					}
				}

				field1392 = new class41();
				field1110 = 0;
				field1109 = 0;
				field1300 = -1;
				field1064 = -1;
				field1092 = -1;
				field1289 = -1;
				field1433 = -1;
				field1284 = false;
				field1125 = 3;
				field1106 = false;
				field1371 = false;
				field1315 = false;
				field1078 = null;
				field1415 = 0;
				field1431 = -1;
				field1359 = true;
				method546();

				for (int var18 = 0; var18 < 5; var18++) {
					field1334[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1065[var19] = null;
					field1066[var19] = false;
				}

				field1212 = 0;
				field1221 = 0;
				field1394 = 0;
				field1353 = 0;
				field1190 = 0;
				field1061 = 0;
				field1479 = 0;
				field1478 = 0;
				field1362 = 0;
				method556();
			} else if (var8 == 3) {
				field1115 = "";
				field1116 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1115 = "Your account has been disabled.";
				field1116 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1115 = "Your account is already logged in.";
				field1116 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1115 = "RuneScape has been updated!";
				field1116 = "Please reload this page.";
			} else if (var8 == 7) {
				field1115 = "This world is full.";
				field1116 = "Please use a different world.";
			} else if (var8 == 8) {
				field1115 = "Unable to connect.";
				field1116 = "Login server offline.";
			} else if (var8 == 9) {
				field1115 = "Login limit exceeded.";
				field1116 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1115 = "Unable to connect.";
				field1116 = "Bad session id.";
			} else if (var8 == 11) {
				field1116 = "Login server rejected session.";
				field1116 = "Please try again.";
			} else if (var8 == 12) {
				field1115 = "You need a members account to login to this world.";
				field1116 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1115 = "Could not complete login.";
				field1116 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1115 = "The server is being updated.";
				field1116 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1099 = true;
				field1077.field621 = 0;
				field1389.field621 = 0;
				field1144 = -1;
				field1473 = -1;
				field1474 = -1;
				field1475 = -1;
				field1143 = 0;
				field1145 = 0;
				field1414 = 0;
				field1299 = 0;
				field1371 = false;
				field1224 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1115 = "Login attempts exceeded.";
				field1116 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1115 = "You are standing in a members-only area.";
				field1116 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1115 = "Invalid loginserver requested";
				field1116 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1286.method39(); var20 >= 0; var20--) {
					field1115 = "You have only just left another world";
					field1116 = "Your profile will be transferred in: " + var20 + " seconds";
					method457(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method490(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1115 = "No response from server";
				field1116 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1115 = "Unexpected server response";
				field1116 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1115 = "";
			field1116 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method491() {
		if (field1288 == 2) {
			method539(field1410 * 2, (field1409 - field1073 << 7) + field1412, (field1408 - field1072 << 7) + field1411);

			if (field1213 > -1 && field1118 % 20 < 10) {
				field1328[2].method186(field1213 - 12, field1214 - 28);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method492() {
		if (field1302 != 0) {
			int var1 = 0;
			if (field1414 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1104[var2] != null) {
					int var3 = field1102[var2];
					String var4 = field1103[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1338 == 0 || field1338 == 1 && method517(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1296.method204("From:  " + var4 + field1104[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1206 >= 1) {
									field1424[field1299] = "Report abuse @whi@" + var4;
									field1379[field1299] = 2524;
									field1299++;
								}

								field1424[field1299] = "Add ignore @whi@" + var4;
								field1379[field1299] = 2047;
								field1299++;
								field1424[field1299] = "Add friend @whi@" + var4;
								field1379[field1299] = 2605;
								field1299++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1338 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method493(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method494() {
		field1349 = new class36(field1285, "titlebox", 0);
		field1350 = new class36(field1285, "titlebutton", 0);
		field1470 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1470[var2] = new class36(field1285, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1470[var3] = new class36(field1285, "runes", (var3 & 0x3) + 12);
			}
		}

		field1357 = new class35(128, 265);
		field1358 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1357.field596[var4] = field1451.field654[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1358.field596[var5] = field1452.field654[var5];
		}

		field1466 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1466[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1466[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1466[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1466[var9 + 192] = 0xFFFFFF;
		}

		field1467 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1467[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1467[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1467[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1467[var13 + 192] = 0xFFFFFF;
		}

		field1468 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1468[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1468[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1468[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1468[var17 + 192] = 0xFFFFFF;
		}

		field1465 = new int[256];
		field1326 = new int[32768];
		field1327 = new int[32768];
		method524(null);
		field1239 = new int[32768];
		field1240 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1198) {
			field1129 = true;
			field1198 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method495(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method495(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method496() {
		for (int var1 = -1; var1 < field1179; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1177;
			} else {
				var2 = field1180[var1];
			}

			class27 var3 = field1178[var2];
			if (var3 != null) {
				method444(1, var3);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method497() {
		while (true) {
			class39 var1 = field1232.method281();
			if (var1 == null) {
				return;
			}

			if (var1.field633 == 0) {
				class31.method124(var1.field634, var1.field635);

				if ((field1232.method277(var1.field634) & 0x62) != 0) {
					field1422 = true;

					if (field1064 != -1) {
						field1469 = true;
					}
				}
			}

			if (var1.field633 == 1 && var1.field635 != null) {
				class7.method45(var1.field635);
			}

			if (var1.field633 == 2 && field1369 == var1.field634 && var1.field635 != null) {
				method516(field1370, var1.field635);
			}

			if (var1.field633 == 3 && field1429 == 1) {
				for (int var2 = 0; var2 < field1385.length; var2++) {
					if (field1082[var2] == var1.field634) {
						field1385[var2] = var1.field635;

						if (var1.field635 == null) {
							field1082[var2] = -1;
						}

						break;
					}

					if (field1083[var2] == var1.field634) {
						field1274[var2] = var1.field635;

						if (var1.field635 == null) {
							field1083[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field633 == 93 && field1232.method276(var1.field634)) {
				class3.method17(field1232, new class38(var1.field635));
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method498(int arg0) {
		int var2 = class70.field1039[arg0].field1047;
		if (var2 != 0) {
			int var3 = field1352[arg0];
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
				field1461 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1167;

				if (var3 == 0) {
					method542(field1167, 0);
					field1167 = true;
				}

				if (var3 == 1) {
					method542(field1167, -400);
					field1167 = true;
				}

				if (var3 == 2) {
					method542(field1167, -800);
					field1167 = true;
				}

				if (var3 == 3) {
					method542(field1167, -1200);
					field1167 = true;
				}

				if (var3 == 4) {
					field1167 = false;
				}

				if (field1167 != var4 && !field1203) {
					if (field1167) {
						field1369 = field1376;
						field1370 = true;
						field1232.method279(2, field1369);
					} else {
						method532();
					}

					field1314 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1276 = true;
					method559(0);
				}

				if (var3 == 1) {
					field1276 = true;
					method559(-400);
				}

				if (var3 == 2) {
					field1276 = true;
					method559(-800);
				}

				if (var3 == 3) {
					field1276 = true;
					method559(-1200);
				}

				if (var3 == 4) {
					field1276 = false;
				}
			}

			if (var2 == 5) {
				field1196 = var3;
			}

			if (var2 == 6) {
				field1111 = var3;
			}

			if (var2 == 8) {
				field1302 = var3;
				field1469 = true;
			}

			if (var2 == 9) {
				field1197 = var3;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method499() {
		for (int var1 = 0; var1 < field1332; var1++) {
			if (field1062[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1439[var1] != field1384 || field1091[var1] != field1060) {
						class38 var3 = class55.method319(field1091[var1], field1439[var1]);
						if (System.currentTimeMillis() + var3.field621 / 22 > field1278 / 22 + field1192) {
							field1278 = var3.field621;
							field1192 = System.currentTimeMillis();

							if (method493(var3.field621, var3.field620)) {
								field1384 = field1439[var1];
								field1060 = field1091[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method484()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1062[var1] != -5) {
					field1062[var1] = -5;
				} else {
					field1332--;
					for (int var5 = var1; var5 < field1332; var5++) {
						field1439[var5] = field1439[var5 + 1];
						field1091[var5] = field1091[var5 + 1];
						field1062[var5] = field1062[var5 + 1];
					}

					var1--;
				}
			} else {
				field1062[var1]--;
			}
		}

		if (field1314 > 0) {
			field1314 -= 20;
			if (field1314 < 0) {
				field1314 = 0;
			}

			if (field1314 == 0 && field1167 && !field1203) {
				field1369 = field1376;
				field1370 = true;
				field1232.method279(2, field1369);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method500() {
		field1242.method258();

		if (field1105 == 2) {
			byte[] var1 = field1194.field603;
			int[] var2 = class33.field563;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1364.method190(33, 25, 256, 33, 25, field1114, 0, 0, field1372, field1096);
			field1243.method258();
		} else {
			int var5 = field1165 + field1096 & 0x7FF;
			int var6 = field1088.field360 / 32 + 48;
			int var7 = 464 - field1088.field361 / 32;
			field1397.method190(146, var7, field1374 + 256, 151, var6, field1427, 25, 5, field1272, var5);
			field1364.method190(33, 25, 256, 33, 25, field1114, 0, 0, field1372, field1096);

			for (int var8 = 0; var8 < field1069; var8++) {
				int var9 = field1070[var8] * 4 + 2 - field1088.field360 / 32;
				int var10 = field1071[var8] * 4 + 2 - field1088.field361 / 32;
				method520(var9, field1113[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1151[field1301][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1088.field360 / 32;
						int var15 = var12 * 4 + 2 - field1088.field361 / 32;
						method520(var14, field1207, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field1127; var16++) {
				class26 var17 = field1126[field1128[var16]];
				if (var17 != null && var17.method113()) {
					class59 var18 = var17.field415;
					if (var18.field905 != null) {
						var18 = var18.method345();
					}

					if (var18 != null && var18.field896) {
						int var19 = var17.field360 / 32 - field1088.field360 / 32;
						int var20 = var17.field361 / 32 - field1088.field361 / 32;
						method520(var19, field1208, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field1179; var21++) {
				class27 var22 = field1178[field1180[var21]];
				if (var22 != null && var22.method113()) {
					int var23 = var22.field360 / 32 - field1088.field360 / 32;
					int var24 = var22.field361 / 32 - field1088.field361 / 32;
					boolean var25 = false;
					long var26 = class51.method300(var22.field416);
					for (int var28 = 0; var28 < field1109; var28++) {
						if (field1174[var28] == var26 && field1425[var28] != 0) {
							var25 = true;
							break;
						}
					}

					if (field1088.field439 != 0 && var22.field439 != 0) {
						if (field1088.field439 == var22.field439) {
							var25 = true;
						} else {
							var25 = false;
						}
					}

					if (var25) {
						method520(var23, field1210, var24);
					} else {
						method520(var23, field1209, var24);
					}
				}
			}

			if (field1288 != 0 && field1118 % 20 < 10) {
				if (field1288 == 1 && field1068 >= 0 && field1068 < field1126.length) {
					class26 var29 = field1126[field1068];
					if (var29 != null) {
						int var30 = var29.field360 / 32 - field1088.field360 / 32;
						int var31 = var29.field361 / 32 - field1088.field361 / 32;
						method523(field1317, var31, var30);
					}
				}

				if (field1288 == 2) {
					int var32 = (field1408 - field1072) * 4 + 2 - field1088.field360 / 32;
					int var33 = (field1409 - field1073) * 4 + 2 - field1088.field361 / 32;
					method523(field1317, var33, var32);
				}

				if (field1288 == 10 && field1477 >= 0 && field1477 < field1178.length) {
					class27 var34 = field1178[field1477];
					if (var34 != null) {
						int var35 = var34.field360 / 32 - field1088.field360 / 32;
						int var36 = var34.field361 / 32 - field1088.field361 / 32;
						method523(field1317, var36, var35);
					}
				}
			}

			if (field1395 != 0) {
				int var37 = field1395 * 4 + 2 - field1088.field360 / 32;
				int var38 = field1396 * 4 + 2 - field1088.field361 / 32;
				method520(var37, field1316, var38);
			}

			class33.method157(0xFFFFFF, 3, 3, 97, 78);
			field1243.method258();
		}
	}

	@ObfuscatedName("client.a(Lgc;IIZI)V")
	public final void method501(class59 arg0, int arg1, int arg2, int arg3) {
		if (field1299 < 400) {
			if (arg0.field905 != null) {
				arg0 = arg0.method345();
			}

			if (arg0 != null) {
				String var5 = arg0.field880;
				if (arg0.field897 != 0) {
					var5 = var5 + method464(field1088.field422, arg0.field897) + " (level-" + arg0.field897 + ")";
				}

				if (field1215 == 1) {
					field1424[field1299] = "Use " + field1219 + " with @yel@" + var5;
					field1379[field1299] = 829;
					field1380[field1299] = arg1;
					field1377[field1299] = arg3;
					field1378[field1299] = arg2;
					field1299++;
				} else if (field1160 != 1) {
					if (arg0.field892 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field892[var6] != null && !arg0.field892[var6].equalsIgnoreCase("attack")) {
								field1424[field1299] = arg0.field892[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field1379[field1299] = 242;
								}

								if (var6 == 1) {
									field1379[field1299] = 209;
								}

								if (var6 == 2) {
									field1379[field1299] = 309;
								}

								if (var6 == 3) {
									field1379[field1299] = 852;
								}

								if (var6 == 4) {
									field1379[field1299] = 793;
								}

								field1380[field1299] = arg1;
								field1377[field1299] = arg3;
								field1378[field1299] = arg2;
								field1299++;
							}
						}
					}

					if (arg0.field892 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field892[var7] != null && arg0.field892[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field897 > field1088.field422) {
									var8 = 2000;
								}

								field1424[field1299] = arg0.field892[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field1379[field1299] = var8 + 242;
								}

								if (var7 == 1) {
									field1379[field1299] = var8 + 209;
								}

								if (var7 == 2) {
									field1379[field1299] = var8 + 309;
								}

								if (var7 == 3) {
									field1379[field1299] = var8 + 852;
								}

								if (var7 == 4) {
									field1379[field1299] = var8 + 793;
								}

								field1380[field1299] = arg1;
								field1377[field1299] = arg3;
								field1378[field1299] = arg2;
								field1299++;
							}
						}
					}

					field1424[field1299] = "Examine @yel@" + var5;
					field1379[field1299] = 1714;
					field1380[field1299] = arg1;
					field1377[field1299] = arg3;
					field1378[field1299] = arg2;
					field1299++;
				} else if ((field1162 & 0x2) == 2) {
					field1424[field1299] = field1163 + " @yel@" + var5;
					field1379[field1299] = 240;
					field1380[field1299] = arg1;
					field1377[field1299] = arg3;
					field1378[field1299] = arg2;
					field1299++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method502(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1379[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method503() {
		int var1 = field1261;
		int var2 = field1262;
		int var3 = field1263;
		int var4 = field1264;
		int var5 = 0x5D5447;
		class33.method157(var5, var4, var3, var1, var2);
		class33.method157(0, 16, var3 - 2, var1 + 1, var2 + 1);
		class33.method158(var4 - 19, var2 + 18, 0, var3 - 2, var1 + 1);
		field1297.method206(var2 + 14, var5, var1 + 3, "Choose Option");
		int var6 = field17;
		int var7 = field18;
		if (field1260 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1260 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1260 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1299; var8++) {
			int var9 = (field1299 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1297.method210(var10, var1 + 3, true, var9, field1424[var8]);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method7() {
		if (!field1432 && !field1283 && !field1189) {
			field1118++;

			if (field1099) {
				method540();
			} else {
				method533();
			}

			method497();
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method504(String arg0) {
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

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method505(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method474(arg0, var2);
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

	@ObfuscatedName("client.c(III)V")
	public final void method506(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1104[var4] != null) {
				int var5 = field1102[var4];
				int var6 = field1248 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1103[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1067 == 0 || field1067 == 1 && method517(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1088.field416)) {
						if (field1206 >= 1) {
							field1424[field1299] = "Report abuse @whi@" + var7;
							field1379[field1299] = 524;
							field1299++;
						}

						field1424[field1299] = "Add ignore @whi@" + var7;
						field1379[field1299] = 47;
						field1299++;
						field1424[field1299] = "Add friend @whi@" + var7;
						field1379[field1299] = 605;
						field1299++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1302 == 0 && (var5 == 7 || field1338 == 0 || field1338 == 1 && method517(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1206 >= 1) {
							field1424[field1299] = "Report abuse @whi@" + var7;
							field1379[field1299] = 524;
							field1299++;
						}

						field1424[field1299] = "Add ignore @whi@" + var7;
						field1379[field1299] = 47;
						field1299++;
						field1424[field1299] = "Add friend @whi@" + var7;
						field1379[field1299] = 605;
						field1299++;
					}

					var3++;
				}

				if (var5 == 4 && (field1220 == 0 || field1220 == 1 && method517(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1424[field1299] = "Accept trade @whi@" + var7;
						field1379[field1299] = 507;
						field1299++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1302 == 0 && field1338 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1220 == 0 || field1220 == 1 && method517(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1424[field1299] = "Accept challenge @whi@" + var7;
						field1379[field1299] = 957;
						field1299++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)Z")
	public final boolean method507() {
		if (field1286 == null) {
			return false;
		}

		try {
			int var1 = field1286.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1144 == -1) {
				field1286.method41(field1389.field620, 0, 1);
				field1144 = field1389.field620[0] & 0xFF;
				if (field1186 != null) {
					field1144 = field1144 - field1186.method295() & 0xFF;
				}

				field1143 = class61.field958[field1144];
				var1--;
			}

			if (field1143 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1286.method41(field1389.field620, 0, 1);
				field1143 = field1389.field620[0] & 0xFF;
				var1--;
			}

			if (field1143 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1286.method41(field1389.field620, 0, 2);
				field1389.field621 = 0;
				field1143 = field1389.method231();
				var1 -= 2;
			}

			if (var1 < field1143) {
				return false;
			}

			field1389.field621 = 0;
			field1286.method41(field1389.field620, 0, field1143);
			field1145 = 0;
			field1475 = field1474;
			field1474 = field1473;
			field1473 = field1144;

			if (field1144 == 89) {
				field1472 = true;
				field1227 = field1389.method229();
				field1228 = field1389.method229();
				field1229 = field1389.method231();
				field1230 = field1389.method229();
				field1231 = field1389.method229();
				if (field1231 >= 100) {
					field1169 = field1227 * 128 + 64;
					field1171 = field1228 * 128 + 64;
					field1170 = method510(field1169, field1171, field1301) - field1229;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 20) {
				field1067 = field1389.method229();
				field1338 = field1389.method229();
				field1220 = field1389.method229();
				field1355 = true;
				field1469 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 140) {
				method472(field1143, field1389);
				field1282 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 38) {
				int var2 = field1389.method231();
				int var3 = field1389.method231();
				class4.field56[var2].field105 = 1;
				class4.field56[var2].field106 = var3;
				field1144 = -1;
				return true;
			}

			if (field1144 == 90) {
				int var4 = field1389.method231();
				if (var4 == 0xFFFF) {
					var4 = -1;
				}

				if (field1376 != var4 && field1167 && !field1203 && field1314 == 0) {
					field1369 = var4;
					field1370 = true;
					field1232.method279(2, field1369);
				}

				field1376 = var4;
				field1144 = -1;
				return true;
			}

			if (field1144 == 84) {
				int var5 = field1389.method231();
				int var6 = field1389.method231();
				if (field1167 && !field1203) {
					field1369 = var5;
					field1370 = false;
					field1232.method279(2, field1369);
					field1314 = var6;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 10) {
				field1472 = true;
				field1320 = field1389.method229();
				field1321 = field1389.method229();
				field1322 = field1389.method231();
				field1323 = field1389.method229();
				field1324 = field1389.method229();
				if (field1324 >= 100) {
					int var7 = field1320 * 128 + 64;
					int var8 = field1321 * 128 + 64;
					int var9 = method510(var7, var8, field1301) - field1322;
					int var10 = var7 - field1169;
					int var11 = var9 - field1170;
					int var12 = var8 - field1171;
					int var13 = (int) Math.sqrt(var10 * var10 + var12 * var12);
					field1172 = (int) (Math.atan2(var11, var13) * 325.949D) & 0x7FF;
					field1173 = (int) (Math.atan2(var10, var12) * -325.949D) & 0x7FF;

					if (field1172 < 128) {
						field1172 = 128;
					}

					if (field1172 > 383) {
						field1172 = 383;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 29) {
				int var14 = field1389.method232();
				field1300 = var14;
				field1469 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 106) {
				long var15 = field1389.method235();
				int var17 = field1389.method229();
				String var18 = class51.method304(class51.method301(var15));
				for (int var19 = 0; var19 < field1109; var19++) {
					if (field1174[var19] == var15) {
						if (field1425[var19] != var17) {
							field1425[var19] = var17;
							field1422 = true;

							if (var17 > 0) {
								method440("", var18 + " has logged in.", 5);
							}

							if (var17 == 0) {
								method440("", var18 + " has logged out.", 5);
							}
						}

						var18 = null;
						break;
					}
				}

				if (var18 != null && field1109 < 200) {
					field1174[field1109] = var15;
					field1255[field1109] = var18;
					field1425[field1109] = var17;
					field1109++;
					field1422 = true;
				}

				boolean var20 = false;
				while (!var20) {
					var20 = true;
					for (int var21 = 0; var21 < field1109 - 1; var21++) {
						if (field1425[var21] != field1200 && field1425[var21 + 1] == field1200 || field1425[var21] == 0 && field1425[var21 + 1] != 0) {
							int var22 = field1425[var21];
							field1425[var21] = field1425[var21 + 1];
							field1425[var21 + 1] = var22;
							String var23 = field1255[var21];
							field1255[var21] = field1255[var21 + 1];
							field1255[var21 + 1] = var23;
							long var24 = field1174[var21];
							field1174[var21] = field1174[var21 + 1];
							field1174[var21 + 1] = var24;
							field1422 = true;
							var20 = false;
						}
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 108) {
				int var26 = field1389.method231();
				class4.field56[var26].field105 = 3;

				if (field1088.field438 == null) {
					class4.field56[var26].field106 = (field1088.field420[11] << 5) + (field1088.field420[8] << 10) + (field1088.field420[0] << 15) + (field1088.field421[0] << 25) + (field1088.field421[4] << 20) + field1088.field420[1];
				} else {
					class4.field56[var26].field106 = (int) (field1088.field438.field879 + 0x12345678L);
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 13) {
				int var27 = field1389.method231();
				String var28 = field1389.method236();
				class4.field56[var27].field97 = var28;

				if (field1204[field1125] == class4.field56[var27].field62) {
					field1422 = true;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 79) {
				field1110 = field1389.method229();
				field1422 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 163) {
				int var29 = field1389.method231();
				int var30 = field1389.method231();
				class4 var31 = class4.field56[var29];
				if (var31 != null && var31.field63 == 0) {
					if (var30 < 0) {
						var30 = 0;
					}

					if (var30 > var31.field75 - var31.field67) {
						var30 = var31.field75 - var31.field67;
					}

					var31.field76 = var30;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 195) {
				field1395 = 0;
				field1144 = -1;
				return true;
			}

			if (field1144 == 50) {
				field1125 = field1389.method229();
				field1422 = true;
				field1191 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 191) {
				int var32 = field1389.method231();
				method495(var32);

				if (field1289 != -1) {
					field1289 = -1;
					field1422 = true;
					field1191 = true;
				}

				if (field1064 != -1) {
					field1064 = -1;
					field1469 = true;
				}

				if (field1106) {
					field1106 = false;
					field1469 = true;
				}

				field1092 = var32;
				field1284 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 53) {
				int var33 = field1389.method229();
				int var34 = field1389.method229();
				String var35 = field1389.method236();
				if (var33 >= 1 && var33 <= 5) {
					if (var35.equalsIgnoreCase("null")) {
						var35 = null;
					}

					field1065[var33 - 1] = var35;
					field1066[var33 - 1] = var34 == 0;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 171) {
				field1431 = field1389.method229();
				if (field1431 == field1125) {
					if (field1431 == 3) {
						field1125 = 1;
					} else {
						field1125 = 3;
					}

					field1422 = true;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 40) {
				int var36 = field1389.method231();
				int var37 = field1389.method231();
				if (field1310 == var36 && field1311 == var37 && field1429 == 2) {
					field1144 = -1;
					return true;
				}

				field1310 = var36;
				field1311 = var37;
				field1072 = (field1310 - 6) * 8;
				field1073 = (field1311 - 6) * 8;
				field1351 = false;
				if ((field1310 / 8 == 48 || field1310 / 8 == 49) && field1311 / 8 == 48) {
					field1351 = true;
				}

				if (field1310 / 8 == 48 && field1311 / 8 == 148) {
					field1351 = true;
				}

				field1429 = 1;
				field1224 = System.currentTimeMillis();
				field1243.method258();
				field1296.method202(257, 0, "Loading - please wait.", 151);
				field1296.method202(256, 0xFFFFFF, "Loading - please wait.", 150);
				field1243.method259(4, 4, field9);
				int var38 = 0;
				for (int var39 = (field1310 - 6) / 8; var39 <= (field1310 + 6) / 8; var39++) {
					for (int var40 = (field1311 - 6) / 8; var40 <= (field1311 + 6) / 8; var40++) {
						var38++;
					}
				}

				field1385 = new byte[var38][];
				field1274 = new byte[var38][];
				field1081 = new int[var38];
				field1082 = new int[var38];
				field1083 = new int[var38];
				int var41 = 0;
				for (int var42 = (field1310 - 6) / 8; var42 <= (field1310 + 6) / 8; var42++) {
					for (int var43 = (field1311 - 6) / 8; var43 <= (field1311 + 6) / 8; var43++) {
						field1081[var41] = (var42 << 8) + var43;

						if (field1351 && (var43 == 49 || var43 == 149 || var43 == 147 || var42 == 50 || var42 == 49 && var43 == 47)) {
							field1082[var41] = -1;
							field1083[var41] = -1;
							var41++;
						} else {
							int var44 = field1082[var41] = field1232.method274(0, var43, var42);
							if (var44 != -1) {
								field1232.method279(3, var44);
							}

							int var45 = field1083[var41] = field1232.method274(1, var43, var42);
							if (var45 != -1) {
								field1232.method279(3, var45);
							}

							var41++;
						}
					}
				}

				int var46 = field1072 - field1074;
				int var47 = field1073 - field1075;
				field1074 = field1072;
				field1075 = field1073;

				for (int var48 = 0; var48 < 16384; var48++) {
					class26 var49 = field1126[var48];
					if (var49 != null) {
						for (int var50 = 0; var50 < 10; var50++) {
							var49.field410[var50] -= var46;
							var49.field411[var50] -= var47;
						}

						var49.field360 -= var46 * 128;
						var49.field361 -= var47 * 128;
					}
				}

				for (int var51 = 0; var51 < field1176; var51++) {
					class27 var52 = field1178[var51];
					if (var52 != null) {
						for (int var53 = 0; var53 < 10; var53++) {
							var52.field410[var53] -= var46;
							var52.field411[var53] -= var47;
						}

						var52.field360 -= var46 * 128;
						var52.field361 -= var47 * 128;
					}
				}

				field1282 = true;
				byte var54 = 0;
				byte var55 = 104;
				byte var56 = 1;
				if (var46 < 0) {
					var54 = 103;
					var55 = -1;
					var56 = -1;
				}

				byte var57 = 0;
				byte var58 = 104;
				byte var59 = 1;
				if (var47 < 0) {
					var57 = 103;
					var58 = -1;
					var59 = -1;
				}

				for (int var60 = var54; var60 != var55; var60 += var56) {
					for (int var61 = var57; var61 != var58; var61 += var59) {
						int var62 = var46 + var60;
						int var63 = var47 + var61;
						for (int var64 = 0; var64 < 4; var64++) {
							if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
								field1151[var64][var60][var61] = field1151[var64][var62][var63];
							} else {
								field1151[var64][var60][var61] = null;
							}
						}
					}
				}

				for (class40 var65 = (class40) field1392.method248(); var65 != null; var65 = (class40) field1392.method250()) {
					var65.field640 -= var46;
					var65.field641 -= var47;
					if (var65.field640 < 0 || var65.field641 < 0 || var65.field640 >= 104 || var65.field641 >= 104) {
						var65.method106();
					}
				}

				if (field1395 != 0) {
					field1395 -= var46;
					field1396 -= var47;
				}

				field1472 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 87) {
				int var66 = field1389.method231();
				method495(var66);

				if (field1064 != -1) {
					field1064 = -1;
					field1469 = true;
				}

				if (field1106) {
					field1106 = false;
					field1469 = true;
				}

				field1289 = var66;
				field1422 = true;
				field1191 = true;
				field1092 = -1;
				field1284 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 59) {
				String var67 = field1389.method236();
				if (var67.endsWith(":tradereq:")) {
					String var68 = var67.substring(0, var67.indexOf(":"));
					long var69 = class51.method300(var68);
					boolean var71 = false;
					for (int var72 = 0; var72 < field1373; var72++) {
						if (field1335[var72] == var69) {
							var71 = true;
							break;
						}
					}

					if (!var71 && field1063 == 0) {
						method440(var68, "wishes to trade with you.", 4);
					}
				} else if (var67.endsWith(":duelreq:")) {
					String var73 = var67.substring(0, var67.indexOf(":"));
					long var74 = class51.method300(var73);
					boolean var76 = false;
					for (int var77 = 0; var77 < field1373; var77++) {
						if (field1335[var77] == var74) {
							var76 = true;
							break;
						}
					}

					if (!var76 && field1063 == 0) {
						method440(var73, "wishes to duel with you.", 8);
					}
				} else if (var67.endsWith(":chalreq:")) {
					String var78 = var67.substring(0, var67.indexOf(":"));
					long var79 = class51.method300(var78);
					boolean var81 = false;
					for (int var82 = 0; var82 < field1373; var82++) {
						if (field1335[var82] == var79) {
							var81 = true;
							break;
						}
					}

					if (!var81 && field1063 == 0) {
						String var83 = var67.substring(var67.indexOf(":") + 1, var67.length() - 9);
						method440(var78, var83, 8);
					}
				} else {
					method440("", var67, 0);
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 77) {
				field1373 = field1143 / 8;
				for (int var84 = 0; var84 < field1373; var84++) {
					field1335[var84] = field1389.method235();
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 213) {
				field1288 = field1389.method229();
				if (field1288 == 1) {
					field1068 = field1389.method231();
				}

				if (field1288 >= 2 && field1288 <= 6) {
					if (field1288 == 2) {
						field1411 = 64;
						field1412 = 64;
					}

					if (field1288 == 3) {
						field1411 = 0;
						field1412 = 64;
					}

					if (field1288 == 4) {
						field1411 = 128;
						field1412 = 64;
					}

					if (field1288 == 5) {
						field1411 = 64;
						field1412 = 0;
					}

					if (field1288 == 6) {
						field1411 = 64;
						field1412 = 128;
					}

					field1288 = 2;
					field1408 = field1389.method231();
					field1409 = field1389.method231();
					field1410 = field1389.method229();
				}

				if (field1288 == 10) {
					field1477 = field1389.method231();
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 237) {
				int var85 = field1389.method231();
				int var86 = field1389.method231();
				int var87 = var86 >> 10 & 0x1F;
				int var88 = var86 >> 5 & 0x1F;
				int var89 = var86 & 0x1F;
				class4.field56[var85].field99 = (var89 << 3) + (var87 << 19) + (var88 << 11);
				field1144 = -1;
				return true;
			}

			if (field1144 == 65) {
				field1258 = field1389.method229();
				field1259 = field1389.method229();
				field1144 = -1;
				return true;
			}

			if (field1144 == 194) {
				field1415 = field1389.method229();
				field1144 = -1;
				return true;
			}

			if (field1144 == 220) {
				int var90 = field1389.method231();
				int var91 = field1389.method231();
				class4.field56[var90].field105 = 2;
				class4.field56[var90].field106 = var91;
				field1144 = -1;
				return true;
			}

			if (field1144 == 165) {
				if (field1289 != -1) {
					field1289 = -1;
					field1422 = true;
					field1191 = true;
				}

				if (field1064 != -1) {
					field1064 = -1;
					field1469 = true;
				}

				if (field1106) {
					field1106 = false;
					field1469 = true;
				}

				field1092 = -1;
				field1284 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 133) {
				int var92 = field1389.method231();
				int var93 = field1389.method232();
				class4 var94 = class4.field56[var92];
				var94.field109 = var93;

				if (var93 == -1) {
					var94.field59 = 0;
					var94.field60 = 0;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 14) {
				if (field1125 == 12) {
					field1422 = true;
				}

				field1398 = field1389.method232();
				field1144 = -1;
				return true;
			}

			if (field1144 == 67) {
				method522(field1389, field1143);
				field1144 = -1;
				return true;
			}

			if (field1144 == 22) {
				int var95 = field1389.method231();
				int var96 = field1389.method232();
				int var97 = field1389.method232();
				class4 var98 = class4.field56[var95];
				var98.field69 = var96;
				var98.field70 = var97;
				field1144 = -1;
				return true;
			}

			if (field1144 == 103) {
				int var99 = field1389.method232();
				if (var99 >= 0) {
					method495(var99);
				}

				field1433 = var99;
				field1144 = -1;
				return true;
			}

			if (field1144 == 115) {
				int var100 = field1389.method231();
				int var101 = field1389.method231();
				int var102 = field1389.method231();

				if (var101 == 0xFFFF) {
					class4.field56[var100].field105 = 0;
					field1144 = -1;
					return true;
				}

				class60 var103 = class60.method348(var101);
				class4.field56[var100].field105 = 4;
				class4.field56[var100].field106 = var101;
				class4.field56[var100].field112 = var103.field922;
				class4.field56[var100].field113 = var103.field923;
				class4.field56[var100].field111 = var103.field921 * 100 / var102;
				field1144 = -1;
				return true;
			}

			if (field1144 == 110) {
				int var104 = field1389.method231();
				method495(var104);

				if (field1289 != -1) {
					field1289 = -1;
					field1422 = true;
					field1191 = true;
				}

				field1064 = var104;
				field1469 = true;
				field1092 = -1;
				field1284 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 196 || field1144 == 193 || field1144 == 91 || field1144 == 138 || field1144 == 127 || field1144 == 164 || field1144 == 139 || field1144 == 42 || field1144 == 82 || field1144 == 131 || field1144 == 99) {
				method478(field1389, field1144);
				field1144 = -1;
				return true;
			}

			if (field1144 == 219) {
				field1472 = false;

				for (int var105 = 0; var105 < 5; var105++) {
					field1117[var105] = false;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 247) {
				int var106 = field1389.method231();
				int var107 = field1389.method229();

				if (var106 == 0xFFFF) {
					var106 = -1;
				}

				field1204[var107] = var106;
				field1422 = true;
				field1191 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 214) {
				int var108 = field1389.method231();
				int var109 = field1389.method234();
				field1329[var108] = var109;

				if (field1352[var108] != var109) {
					field1352[var108] = var109;
					method498(var108);
					field1422 = true;

					if (field1300 != -1) {
						field1469 = true;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 85) {
				field1142 = field1389.method231();
				field1277 = field1389.method229();
				field1144 = -1;
				return true;
			}

			if (field1144 == 24) {
				if (field1125 == 12) {
					field1422 = true;
				}

				field1123 = field1389.method229();
				field1144 = -1;
				return true;
			}

			if (field1144 == 125) {
				field1258 = field1389.method229();
				field1259 = field1389.method229();
				for (int var110 = field1258; var110 < field1258 + 8; var110++) {
					for (int var111 = field1259; var111 < field1259 + 8; var111++) {
						if (field1151[field1301][var110][var111] != null) {
							field1151[field1301][var110][var111] = null;
							method511(var110, var111);
						}
					}
				}

				for (class40 var112 = (class40) field1392.method248(); var112 != null; var112 = (class40) field1392.method250()) {
					if (var112.field640 >= field1258 && var112.field640 < field1258 + 8 && var112.field641 >= field1259 && var112.field641 < field1259 + 8 && field1301 == var112.field638) {
						var112.field649 = 0;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 142) {
				field1258 = field1389.method229();
				field1259 = field1389.method229();

				while (field1389.field621 < field1143) {
					int var113 = field1389.method229();
					method478(field1389, var113);
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 224) {
				method554();
				field1144 = -1;
				return false;
			}

			if (field1144 == 1) {
				field1414 = field1389.method231() * 30;
				field1144 = -1;
				return true;
			}

			if (field1144 == 68) {
				field1318 = field1389.method234();
				field1266 = field1389.method231();
				field1476 = field1389.method229();
				field1383 = field1389.method231();
				field1156 = field1389.method229();
				if (field1318 != 0 && field1092 == -1) {
					signlink.dnslookup(class51.method303(field1318));
					method482();
					short var114 = 650;
					if (field1476 != 201 || field1156 == 1) {
						var114 = 655;
					}

					field1471 = "";
					field1101 = false;

					for (int var115 = 0; var115 < class4.field56.length; var115++) {
						if (class4.field56[var115] != null && class4.field56[var115].field65 == var114) {
							field1092 = class4.field56[var115].field62;
							break;
						}
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 111) {
				int var116 = field1389.method231();
				int var117 = field1389.method231();

				if (field1064 != -1) {
					field1064 = -1;
					field1469 = true;
				}

				if (field1106) {
					field1106 = false;
					field1469 = true;
				}

				field1092 = var116;
				field1289 = var117;
				field1422 = true;
				field1191 = true;
				field1284 = false;
				field1144 = -1;
				return true;
			}

			if (field1144 == 7) {
				field1315 = false;
				field1106 = true;
				field1330 = "";
				field1469 = true;
				field1144 = -1;
				return true;
			}

			if (field1144 == 232) {
				field1422 = true;
				int var118 = field1389.method231();
				class4 var119 = class4.field56[var118];
				int var120 = field1389.method231();
				for (int var121 = 0; var121 < var120; var121++) {
					var119.field57[var121] = field1389.method231();
					int var122 = field1389.method229();
					if (var122 == 255) {
						var122 = field1389.method234();
					}

					var119.field58[var121] = var122;
				}

				for (int var123 = var120; var123 < var119.field57.length; var123++) {
					var119.field57[var123] = 0;
					var119.field58[var123] = 0;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 74) {
				long var124 = field1389.method235();
				int var126 = field1389.method234();
				int var127 = field1389.method229();
				boolean var128 = false;
				for (int var129 = 0; var129 < 100; var129++) {
					if (field1388[var129] == var126) {
						var128 = true;
						break;
					}
				}

				if (var127 <= 1) {
					for (int var130 = 0; var130 < field1373; var130++) {
						if (field1335[var130] == var124) {
							var128 = true;
							break;
						}
					}
				}

				if (!var128 && field1063 == 0) {
					try {
						field1388[field1150] = var126;
						field1150 = (field1150 + 1) % 100;
						String var131 = class52.method306(field1389, field1143 - 13);
						var131 = class71.method401(var131);
						if (var127 == 2 || var127 == 3) {
							method440("@cr2@" + class51.method304(class51.method301(var124)), var131, 7);
						} else if (var127 == 1) {
							method440("@cr1@" + class51.method304(class51.method301(var124)), var131, 7);
						} else {
							method440(class51.method304(class51.method301(var124)), var131, 3);
						}
					} catch (Exception var162) {
						signlink.reporterror("cde1");
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 154) {
				int var133 = field1389.method231();
				int var134 = field1389.method229();
				int var135 = field1389.method231();
				if (field1276 && !field1203 && field1332 < 50) {
					field1439[field1332] = var133;
					field1091[field1332] = var134;
					field1062[field1332] = class55.field790[var133] + var135;
					field1332++;
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 246) {
				int var136 = field1389.method229();
				int var137 = field1389.method229();
				int var138 = field1389.method229();
				int var139 = field1389.method229();
				field1117[var136] = true;
				field1252[var136] = var137;
				field1336[var136] = var138;
				field1331[var136] = var139;
				field1386[var136] = 0;
				field1144 = -1;
				return true;
			}

			if (field1144 == 81) {
				field1422 = true;
				int var140 = field1389.method231();
				class4 var141 = class4.field56[var140];
				while (field1389.field621 < field1143) {
					int var142 = field1389.method243();
					int var143 = field1389.method231();
					int var144 = field1389.method229();
					if (var144 == 255) {
						var144 = field1389.method234();
					}

					if (var142 >= 0 && var142 < var141.field57.length) {
						var141.field57[var142] = var143;
						var141.field58[var142] = var144;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 23) {
				int var145 = field1389.method231();
				boolean var146 = field1389.method229() == 1;
				class4.field56[var145].field77 = var146;
				field1144 = -1;
				return true;
			}

			if (field1144 == 3) {
				field1422 = true;
				int var147 = field1389.method229();
				int var148 = field1389.method234();
				int var149 = field1389.method229();
				field1158[var147] = var148;
				field1354[var147] = var149;
				field1480[var147] = 1;
				for (int var150 = 0; var150 < 98; var150++) {
					if (var148 >= field1367[var150]) {
						field1480[var147] = var150 + 2;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 159) {
				for (int var151 = 0; var151 < field1352.length; var151++) {
					if (field1352[var151] != field1329[var151]) {
						field1352[var151] = field1329[var151];
						method498(var151);
						field1422 = true;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 182) {
				int var152 = field1389.method231();
				byte var153 = field1389.method230();
				field1329[var152] = var153;

				if (field1352[var152] != var153) {
					field1352[var152] = var153;
					method498(var152);
					field1422 = true;

					if (field1300 != -1) {
						field1469 = true;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 151) {
				for (int var154 = 0; var154 < field1178.length; var154++) {
					if (field1178[var154] != null) {
						field1178[var154].field388 = -1;
					}
				}

				for (int var155 = 0; var155 < field1126.length; var155++) {
					if (field1126[var155] != null) {
						field1126[var155].field388 = -1;
					}
				}

				field1144 = -1;
				return true;
			}

			if (field1144 == 153) {
				field1105 = field1389.method229();
				field1144 = -1;
				return true;
			}

			if (field1144 == 126) {
				int var156 = field1389.method231();
				class4 var157 = class4.field56[var156];
				for (int var158 = 0; var158 < var157.field57.length; var158++) {
					var157.field57[var158] = -1;
					var157.field57[var158] = 0;
				}

				field1144 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1144 + "," + field1143 + " - " + field1474 + "," + field1475);
			method554();
		} catch (IOException var163) {
			method452();
		} catch (Exception var164) {
			String var160 = "T2 - " + field1144 + "," + field1474 + "," + field1475 + " - " + field1143 + "," + (field1088.field410[0] + field1072) + "," + (field1088.field411[0] + field1073) + " - ";
			for (int var161 = 0; var161 < field1143 && var161 < 50; var161++) {
				var160 = var160 + field1389.field620[var161] + ",";
			}

			signlink.reporterror(var160);
			method554();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1390.method199(arg3, arg1);
		field1391.method199(arg3, arg0 + arg1 - 16);
		class33.method157(field1366, arg0 - 32, 16, arg3, arg1 + 16);
		int var6 = (arg0 - 32) * arg0 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg4 / (arg2 - arg0);
		class33.method157(field1457, var6, 16, arg3, arg1 + var7 + 16);
		class33.method162(arg3, arg1 + var7 + 16, field1265, var6);
		class33.method162(arg3 + 1, arg1 + 16 + var7, field1265, var6);
		class33.method160(arg3, field1265, arg1 + var7 + 16, 16);
		class33.method160(arg3, field1265, arg1 + var7 + 17, 16);
		class33.method162(arg3 + 15, arg1 + 16 + var7, field1430, var6);
		class33.method162(arg3 + 14, arg1 + 17 + var7, field1430, var6 - 1);
		class33.method160(arg3, field1430, arg1 + var7 + var6 + 15, 16);
		class33.method160(arg3 + 1, field1430, arg1 + var7 + var6 + 14, 15);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method509() {
		if (field1299 >= 2 || field1215 != 0 || field1160 != 0) {
			String var1;
			if (field1215 == 1 && field1299 < 2) {
				var1 = "Use " + field1219 + " with...";
			} else if (field1160 == 1 && field1299 < 2) {
				var1 = field1163 + "...";
			} else {
				var1 = field1424[field1299 - 1];
			}

			if (field1299 > 2) {
				var1 = var1 + "@whi@ / " + (field1299 - 2) + " more options";
			}

			field1297.method211(4, 0xFFFFFF, var1, field1118 / 1000, 15, true);
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method510(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1124[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field1157[var6][var4][var5] + field1157[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1157[var6][var4][var5 + 1] + field1157[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method511(int arg0, int arg1) {
		class41 var3 = field1151[field1301][arg0][arg1];
		if (var3 == null) {
			field1363.method71(field1301, arg0, arg1);
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
			field1363.method57(var5, arg1, method510(arg0 * 128 + 64, arg1 * 128 + 64, field1301), var10, var9, field1301, var12, arg0);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method512() {
		int var1 = field1227 * 128 + 64;
		int var2 = field1228 * 128 + 64;
		int var3 = method510(var1, var2, field1301) - field1229;

		if (field1169 < var1) {
			field1169 += (var1 - field1169) * field1231 / 1000 + field1230;
			if (field1169 > var1) {
				field1169 = var1;
			}
		}

		if (field1169 > var1) {
			field1169 -= (field1169 - var1) * field1231 / 1000 + field1230;
			if (field1169 < var1) {
				field1169 = var1;
			}
		}

		if (field1170 < var3) {
			field1170 += (var3 - field1170) * field1231 / 1000 + field1230;
			if (field1170 > var3) {
				field1170 = var3;
			}
		}

		if (field1170 > var3) {
			field1170 -= (field1170 - var3) * field1231 / 1000 + field1230;
			if (field1170 < var3) {
				field1170 = var3;
			}
		}

		if (field1171 < var2) {
			field1171 += (var2 - field1171) * field1231 / 1000 + field1230;
			if (field1171 > var2) {
				field1171 = var2;
			}
		}

		if (field1171 > var2) {
			field1171 -= (field1171 - var2) * field1231 / 1000 + field1230;
			if (field1171 < var2) {
				field1171 = var2;
			}
		}

		int var4 = field1320 * 128 + 64;
		int var5 = field1321 * 128 + 64;
		int var6 = method510(var4, var5, field1301) - field1322;
		int var7 = var4 - field1169;
		int var8 = var6 - field1170;
		int var9 = var5 - field1171;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1172 < var11) {
			field1172 += (var11 - field1172) * field1324 / 1000 + field1323;
			if (field1172 > var11) {
				field1172 = var11;
			}
		}

		if (field1172 > var11) {
			field1172 -= (field1172 - var11) * field1324 / 1000 + field1323;
			if (field1172 < var11) {
				field1172 = var11;
			}
		}

		int var13 = var12 - field1173;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1173 += field1324 * var13 / 1000 + field1323;
			field1173 &= 0x7FF;
		}

		if (var13 < 0) {
			field1173 -= -var13 * field1324 / 1000 + field1323;
			field1173 &= 0x7FF;
		}

		int var14 = var12 - field1173;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1173 = var12;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method513() {
		int var1 = field1297.method204("Choose Option");
		for (int var2 = 0; var2 < field1299; var2++) {
			int var3 = field1297.method204(field1424[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1299 * 15 + 21;
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

			field1371 = true;
			field1260 = 0;
			field1261 = var5;
			field1262 = var6;
			field1263 = var1;
			field1264 = field1299 * 15 + 22;
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

			field1371 = true;
			field1260 = 1;
			field1261 = var7;
			field1262 = var8;
			field1263 = var1;
			field1264 = field1299 * 15 + 22;
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

			field1371 = true;
			field1260 = 2;
			field1261 = var9;
			field1262 = var10;
			field1263 = var1;
			field1264 = field1299 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public final void method514(class38 arg0, int arg1) {
		arg0.method239();
		int var3 = arg0.method240(8);
		if (var3 < field1127) {
			for (int var4 = var3; var4 < field1127; var4++) {
				field1309[field1308++] = field1128[var4];
			}
		}

		if (var3 > field1127) {
			signlink.reporterror(field1222 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1127 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1128[var5];
			class26 var7 = field1126[var6];
			int var8 = arg0.method240(1);
			if (var8 == 0) {
				field1128[field1127++] = var6;
				var7.field405 = field1118;
			} else {
				int var9 = arg0.method240(2);
				if (var9 == 0) {
					field1128[field1127++] = var6;
					var7.field405 = field1118;
					field1182[field1181++] = var6;
				} else if (var9 == 1) {
					field1128[field1127++] = var6;
					var7.field405 = field1118;
					int var10 = arg0.method240(3);
					var7.method111(var10, false);
					int var11 = arg0.method240(1);
					if (var11 == 1) {
						field1182[field1181++] = var6;
					}
				} else if (var9 == 2) {
					field1128[field1127++] = var6;
					var7.field405 = field1118;
					int var12 = arg0.method240(3);
					var7.method111(var12, true);
					int var13 = arg0.method240(3);
					var7.method111(var13, true);
					int var14 = arg0.method240(1);
					if (var14 == 1) {
						field1182[field1181++] = var6;
					}
				} else if (var9 == 3) {
					field1309[field1308++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1363.method76(arg2, arg3, arg1);
		if (var6 != 0) {
			int var7 = field1363.method80(arg2, arg3, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field1397.field596;
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
				class36 var15 = field1348[var14.field849];
				if (var15 != null) {
					int var16 = (var14.field835 * 4 - var15.field605) / 2;
					int var17 = (var14.field836 * 4 - var15.field606) / 2;
					var15.method199(arg3 * 4 + var16 + 48, (104 - arg1 - var14.field836) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1363.method78(arg2, arg3, arg1);
		if (var18 != 0) {
			int var19 = field1363.method80(arg2, arg3, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method330(var22);
			if (var23.field849 != -1) {
				class36 var24 = field1348[var23.field849];
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

				int[] var28 = field1397.field596;
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

		int var30 = field1363.method79(arg2, arg3, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method330(var31);
			if (var32.field849 != -1) {
				class36 var33 = field1348[var32.field849];
				if (var33 != null) {
					int var34 = (var32.field835 * 4 - var33.field605) / 2;
					int var35 = (var32.field836 * 4 - var33.field606) / 2;
					var33.method199(arg3 * 4 + var34 + 48, (104 - arg1 - var32.field836) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method516(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 295);

			if (arg0.length == 5) {
				field1200 = Integer.parseInt(arg0[0]);
				field1201 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method436();
				} else if (arg0[2].equals("highmem")) {
					method465();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1202 = false;
				} else if (arg0[3].equals("members")) {
					field1202 = true;
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

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method517(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1109; var2++) {
			if (arg0.equalsIgnoreCase(field1255[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1088.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Llb;ZIILab;)V")
	public final void method518(class38 arg0, int arg1, int arg2, class27 arg3) {
		if ((arg2 & 0x1) == 1) {
			int var5 = arg0.method229();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg0.method238(var6, var5, 0);
			field1183[arg1] = var7;
			arg3.method116(var7);
		}

		if ((arg2 & 0x2) == 2) {
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

		if ((arg2 & 0x4) == 4) {
			arg3.field382 = arg0.method231();
			if (arg3.field382 == 0xFFFF) {
				arg3.field382 = -1;
			}
		}

		if ((arg2 & 0x8) == 8) {
			arg3.field372 = arg0.method236();
			if (arg3.field372.charAt(0) == '~') {
				arg3.field372 = arg3.field372.substring(1);
				method440(arg3.field416, arg3.field372, 2);
			} else if (field1088 == arg3) {
				method440(arg3.field416, arg3.field372, 2);
			}

			arg3.field374 = 0;
			arg3.field375 = 0;
			arg3.field373 = 150;
		}

		if ((arg2 & 0x10) == 0x10) {
			int var11 = arg0.method229();
			int var12 = arg0.method229();
			arg3.method114(var11, var12, field1118);
			arg3.field379 = field1118 + 300;
			arg3.field380 = arg0.method229();
			arg3.field381 = arg0.method229();
		}

		if ((arg2 & 0x20) == 0x20) {
			arg3.field383 = arg0.method231();
			arg3.field384 = arg0.method231();
		}

		if ((arg2 & 0x40) == 0x40) {
			int var13 = arg0.method231();
			int var14 = arg0.method229();
			int var15 = arg0.method229();
			int var16 = arg0.field621;

			if (arg3.field416 != null && arg3.field417) {
				long var17 = class51.method300(arg3.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1373; var20++) {
						if (field1335[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1063 == 0) {
					try {
						String var21 = class52.method306(arg0, var15);
						var21 = class71.method401(var21);
						arg3.field372 = var21;
						arg3.field374 = var13 >> 8;
						arg3.field375 = var13 & 0xFF;
						arg3.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method440("@cr2@" + arg3.field416, var21, 1);
						} else if (var14 == 1) {
							method440("@cr1@" + arg3.field416, var21, 1);
						} else {
							method440(arg3.field416, var21, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field621 = var15 + var16;
		}

		if ((arg2 & 0x100) == 0x100) {
			arg3.field393 = arg0.method231();
			int var23 = arg0.method234();
			arg3.field397 = var23 >> 16;
			arg3.field396 = (var23 & 0xFFFF) + field1118;
			arg3.field394 = 0;
			arg3.field395 = 0;

			if (arg3.field396 > field1118) {
				arg3.field394 = -1;
			}

			if (arg3.field393 == 0xFFFF) {
				arg3.field393 = -1;
			}
		}

		if ((arg2 & 0x200) == 0x200) {
			arg3.field398 = arg0.method229();
			arg3.field400 = arg0.method229();
			arg3.field399 = arg0.method229();
			arg3.field401 = arg0.method229();
			arg3.field402 = arg0.method231() + field1118;
			arg3.field403 = arg0.method231() + field1118;
			arg3.field404 = arg0.method229();
			arg3.method112();
		}

		if ((arg2 & 0x400) == 0x400) {
			int var24 = arg0.method229();
			int var25 = arg0.method229();
			arg3.method114(var24, var25, field1118);
			arg3.field379 = field1118 + 300;
			arg3.field380 = arg0.method229();
			arg3.field381 = arg0.method229();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method519() {
		method434();

		if (field1293 == 1) {
			field1076[field1292 / 100].method186(field1290 - 8 - 4, field1291 - 8 - 4);
		}

		if (field1293 == 2) {
			field1076[field1292 / 100 + 4].method186(field1290 - 8 - 4, field1291 - 8 - 4);
			field1368++;
			if (field1368 > 57) {
				field1368 = 0;
				field1077.method218(254);
			}
		}

		if (field1433 != -1) {
			method557(field1279, field1433);
			method467(0, class4.field56[field1433], 0, 0);
		}

		if (field1092 != -1) {
			method557(field1279, field1092);
			method467(0, class4.field56[field1092], 0, 0);
		}

		method545();

		if (!field1371) {
			method544();
			method509();
		} else if (field1260 == 0) {
			method503();
		}

		if (field1415 == 1) {
			field1328[1].method186(472, 296);
		}

		if (field1447) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field1296.method201(var2, var3, var1, "Fps:" + field5);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field1203) {
				int var7 = 0xFF0000;
			}

			field1296.method201(var2, 0xFFFF00, var1, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field1414 != 0) {
			int var8 = field1414 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field1296.method206(329, 0xFFFF00, 4, "System update in: " + var9 + ":0" + var8);
			} else {
				field1296.method206(329, 0xFFFF00, 4, "System update in: " + var9 + ":" + var8);
			}
		}
	}

	@ObfuscatedName("client.a(ILib;II)V")
	public final void method520(int arg0, class35 arg1, int arg2) {
		int var4 = field1165 + field1096 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field550[var4];
			int var7 = class31.field551[var4];
			var6 = var6 * 256 / (field1374 + 256);
			var7 = var7 * 256 / (field1374 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method192(var8 + 94 + 4 - arg1.field601 / 2, 83 - var9 - arg1.field602 / 2 - 4, field1194);
			} else {
				arg1.method186(var8 + 94 + 4 - arg1.field601 / 2, 83 - var9 - arg1.field602 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method521(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1109; var3++) {
				if (field1174[var3] == arg0) {
					field1109--;
					field1422 = true;

					for (int var4 = var3; var4 < field1109; var4++) {
						field1255[var4] = field1255[var4 + 1];
						field1425[var4] = field1425[var4 + 1];
						field1174[var4] = field1174[var4 + 1];
					}

					field1077.method218(214);
					field1077.method225(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLlb;I)V")
	public final void method522(class38 arg0, int arg1) {
		field1308 = 0;
		field1181 = 0;
		method514(arg0, arg1);
		method455(arg1, arg0);
		method476(arg1, arg0);

		for (int var3 = 0; var3 < field1308; var3++) {
			int var4 = field1309[var3];
			if (field1118 != field1126[var4].field405) {
				field1126[var4].field415 = null;
				field1126[var4] = null;
			}
		}

		if (arg0.field621 != arg1) {
			signlink.reporterror(field1222 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1127; var5++) {
			if (field1126[field1128[var5]] == null) {
				signlink.reporterror(field1222 + " null entry in npc list - pos:" + var5 + " size:" + field1127);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Lib;III)V")
	public final void method523(class35 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1165 + field1096 & 0x7FF;
			int var6 = class31.field550[var5];
			int var7 = class31.field551[var5];
			var6 = var6 * 256 / (field1374 + 256);
			var7 = var7 * 256 / (field1374 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1140.method191(15, 15, 20, 256, var10, var12 + 94 + 4 - 10, 83 - var13 - 20, 20);
		} else {
			method520(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public final void method524(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1326.length; var3++) {
			field1326[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1326[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1327[var9] = (field1326[var9 - 1] + field1326[var9 + 1] + field1326[var9 - 128] + field1326[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1326;
			field1326 = field1327;
			field1327 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1326[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)I")
	public final int method525() {
		int var1 = 3;
		if (field1172 < 310) {
			int var2 = field1169 >> 7;
			int var3 = field1171 >> 7;
			int var4 = field1088.field360 >> 7;
			int var5 = field1088.field361 >> 7;

			if ((field1124[field1301][var2][var3] & 0x4) != 0) {
				var1 = field1301;
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

					if ((field1124[field1301][var2][var3] & 0x4) != 0) {
						var1 = field1301;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1124[field1301][var2][var3] & 0x4) != 0) {
							var1 = field1301;
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

					if ((field1124[field1301][var2][var3] & 0x4) != 0) {
						var1 = field1301;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1124[field1301][var2][var3] & 0x4) != 0) {
							var1 = field1301;
						}
					}
				}
			}
		}

		if ((field1124[field1301][field1088.field360 >> 7][field1088.field361 >> 7] & 0x4) != 0) {
			var1 = field1301;
		}

		return var1;
	}

	@ObfuscatedName("client.H(I)I")
	public final int method526() {
		int var1 = method510(field1169, field1171, field1301);
		if (var1 - field1170 < 800 && (field1124[field1301][field1169 >> 7][field1171 >> 7] & 0x4) != 0) {
			return field1301;
		}

		return 3;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method527(int arg0) {
		int[] var2 = field1397.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1124[arg0][var7][var5] & 0x18) == 0) {
					field1363.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1124[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1363.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1397.method181();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1124[arg0][var11][var10] & 0x18) == 0) {
					method515(var8, var10, arg0, var11, var9);
				}

				if (arg0 < 3 && (field1124[arg0 + 1][var11][var10] & 0x8) != 0) {
					method515(var8, var10, arg0 + 1, var11, var9);
				}
			}
		}

		field1243.method258();
		field1069 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1363.method79(field1301, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method330(var14).field848;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1434[field1301].field963;
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

						field1113[field1069] = field1462[var15];
						field1070[field1069] = var16;
						field1071[field1069] = var17;
						field1069++;
					}
				}
			}
		}

		field1152++;
		if (field1152 > 112) {
			field1152 = 0;
			field1077.method218(39);
			field1077.method219(50);
		}
	}

	@ObfuscatedName("client.a(IZLlb;)V")
	public final void method528(int arg0, class38 arg1) {
		while (arg1.field622 + 10 < arg0 * 8) {
			int var3 = arg1.method240(11);
			if (var3 == 2047) {
				break;
			}

			if (field1178[var3] == null) {
				field1178[var3] = new class27();
				if (field1183[var3] != null) {
					field1178[var3].method116(field1183[var3]);
				}
			}

			field1180[field1179++] = var3;
			class27 var4 = field1178[var3];
			var4.field405 = field1118;
			int var5 = arg1.method240(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method240(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method240(1);
			var4.method110(field1088.field410[0] + var5, var7 == 1, field1088.field411[0] + var6);
			int var8 = arg1.method240(1);
			if (var8 == 1) {
				field1182[field1181++] = var3;
			}
		}

		arg1.method241();
	}

	@ObfuscatedName("client.h(B)V")
	public final void method529() {
		try {
			int var1 = field1088.field360 + field1306;
			int var2 = field1088.field361 + field1225;
			if (field1435 - var1 < -500 || field1435 - var1 > 500 || field1436 - var2 < -500 || field1436 - var2 > 500) {
				field1435 = var1;
				field1436 = var2;
			}

			if (field1435 != var1) {
				field1435 += (var1 - field1435) / 16;
			}

			if (field1436 != var2) {
				field1436 += (var2 - field1436) / 16;
			}

			if (field27[1] == 1) {
				field1097 += (-field1097 - 24) / 2;
			} else if (field27[2] == 1) {
				field1097 += (24 - field1097) / 2;
			} else {
				field1097 /= 2;
			}

			if (field27[3] == 1) {
				field1098 += (12 - field1098) / 2;
			} else if (field27[4] == 1) {
				field1098 += (-field1098 - 12) / 2;
			} else {
				field1098 /= 2;
			}

			field1096 = field1097 / 2 + field1096 & 0x7FF;
			field1095 += field1098 / 2;
			if (field1095 < 128) {
				field1095 = 128;
			}

			if (field1095 > 383) {
				field1095 = 383;
			}

			int var3 = field1435 >> 7;
			int var4 = field1436 >> 7;
			int var5 = method510(field1435, field1436, field1301);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1301;
						if (var9 < 3 && (field1124[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1157[var9][var7][var8];
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

			if (var11 > field1112) {
				field1112 += (var11 - field1112) / 24;
			} else if (var11 < field1112) {
				field1112 += (var11 - field1112) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1088.field360 + "," + field1088.field361 + "," + field1435 + "," + field1436 + "," + field1310 + "," + field1311 + "," + field1072 + "," + field1073);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method530(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method531() {
		for (class40 var1 = (class40) field1392.method248(); var1 != null; var1 = (class40) field1392.method250()) {
			if (var1.field649 == -1) {
				var1.field648 = 0;
				method453(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method532() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.j(B)V")
	public final void method533() {
		if (field1281 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1281 = 3;
				field1155 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1115 = "";
				field1116 = "Enter your username & password.";
				field1281 = 2;
				field1155 = 0;
			}
		} else if (field1281 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1155 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1155 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method490(field1222, field1223, false);

				if (field1099) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1281 = 0;
				field1222 = "";
				field1223 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1237.length(); var10++) {
					if (var8 == field1237.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1155 == 0) {
					if (var8 == 8 && field1222.length() > 0) {
						field1222 = field1222.substring(0, field1222.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1155 = 1;
					}

					if (var9) {
						field1222 = field1222 + (char) var8;
					}

					if (field1222.length() > 12) {
						field1222 = field1222.substring(0, 12);
					}
				} else if (field1155 == 1) {
					if (var8 == 8 && field1223.length() > 0) {
						field1223 = field1223.substring(0, field1223.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1155 = 0;
					}

					if (var9) {
						field1223 = field1223 + (char) var8;
					}

					if (field1223.length() > 20) {
						field1223 = field1223.substring(0, 20);
					}
				}
			}
		} else if (field1281 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1281 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method534() {
		field1241.method258();
		class34.field584 = field1235;
		field1193.method199(0, 0);

		if (field1289 != -1) {
			method467(0, class4.field56[field1289], 0, 0);
		} else if (field1204[field1125] != -1) {
			method467(0, class4.field56[field1204[field1125]], 0, 0);
		}

		if (field1371 && field1260 == 1) {
			method503();
		}

		field1241.method259(205, 553, field9);
		field1243.method258();
		class34.field584 = field1236;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method535(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.I(I)V")
	public final void method536() {
		field1463++;
		method555(true);
		method560(true);
		method555(false);
		method560(false);
		method439();
		method451();

		if (!field1472) {
			int var1 = field1095;
			if (field1112 / 256 > var1) {
				var1 = field1112 / 256;
			}

			if (field1117[4] && field1336[4] + 128 > var1) {
				var1 = field1336[4] + 128;
			}

			int var2 = field1096 + field1089 & 0x7FF;
			method460(var2, var1 * 3 + 600, field1435, field1436, method510(field1088.field360, field1088.field361, field1301) - 50, var1);
		}

		int var3;
		if (field1472) {
			var3 = method526();
		} else {
			var3 = method525();
		}

		int var4 = field1169;
		int var5 = field1170;
		int var6 = field1171;
		int var7 = field1172;
		int var8 = field1173;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1117[var9]) {
				int var10 = (int) (Math.random() * (field1252[var9] * 2 + 1) + Math.sin(field1331[var9] / 100.0D * field1386[var9]) * field1336[var9] - field1252[var9]);
				if (var9 == 0) {
					field1169 += var10;
				}

				if (var9 == 1) {
					field1170 += var10;
				}

				if (var9 == 2) {
					field1171 += var10;
				}

				if (var9 == 3) {
					field1173 = field1173 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1172 += var10;
					if (field1172 < 128) {
						field1172 = 128;
					}

					if (field1172 > 383) {
						field1172 = 383;
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
		field1363.method89(field1169, field1172, field1171, var3, field1173, field1170);
		field1363.method64();
		method470();
		method491();
		method561(var11);
		method519();
		field1243.method259(4, 4, field9);
		field1169 = var4;
		field1170 = var5;
		field1171 = var6;
		field1172 = var7;
		field1173 = var8;
	}

	@ObfuscatedName("client.a(Llb;BI)V")
	public final void method537(class38 arg0, int arg1) {
		arg0.method239();
		int var3 = arg0.method240(1);
		if (var3 != 0) {
			int var4 = arg0.method240(2);
			if (var4 == 0) {
				field1182[field1181++] = field1177;
			} else if (var4 == 1) {
				int var5 = arg0.method240(3);
				field1088.method111(var5, false);
				int var6 = arg0.method240(1);
				if (var6 == 1) {
					field1182[field1181++] = field1177;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method240(3);
				field1088.method111(var7, true);
				int var8 = arg0.method240(3);
				field1088.method111(var8, true);
				int var9 = arg0.method240(1);
				if (var9 == 1) {
					field1182[field1181++] = field1177;
				}
			} else if (var4 == 3) {
				field1301 = arg0.method240(2);
				int var10 = arg0.method240(7);
				int var11 = arg0.method240(7);
				int var12 = arg0.method240(1);
				field1088.method110(var10, var12 == 1, var11);
				int var13 = arg0.method240(1);
				if (var13 == 1) {
					field1182[field1181++] = field1177;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILy;B)V")
	public final void method538(int arg0, class25 arg1) {
		method539(arg0, arg1.field361, arg1.field360);
	}

	@ObfuscatedName("client.a(ZIII)V")
	public final void method539(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method510(arg2, arg1, field1301) - arg0;
			arg2 -= field1169;
			var4 -= field1170;
			arg1 -= field1171;
			int var5 = class31.field550[field1172];
			int var6 = class31.field551[field1172];
			int var7 = class31.field550[field1173];
			int var8 = class31.field551[field1173];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field1213 = (var9 << 9) / arg1 + class34.field578;
				field1214 = (var11 << 9) / arg1 + class34.field579;
			} else {
				field1213 = -1;
				field1214 = -1;
			}
		} else {
			field1213 = -1;
			field1214 = -1;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method540() {
		if (field1414 > 1) {
			field1414--;
		}

		if (field1147 > 0) {
			field1147--;
		}

		for (int var1 = 0; var1 < 5 && method507(); var1++) {
		}

		if (field1099) {
			synchronized (field1333.field869) {
				if (!field1175) {
					field1333.field870 = 0;
				} else if (field23 != 0 || field1333.field870 >= 40) {
					field1077.method218(1);
					field1077.method219(0);
					int var3 = field1077.field621;
					int var4 = 0;
					for (int var5 = 0; var5 < field1333.field870 && var3 - field1077.field621 < 240; var5++) {
						var4++;
						int var6 = field1333.field872[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1333.field871[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1333.field872[var5] == -1 && field1333.field871[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1312 != var7 || field1313 != var6) {
							int var9 = var7 - field1312;
							field1312 = var7;
							int var10 = var6 - field1313;
							field1313 = var6;

							if (field1257 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1077.method220((field1257 << 12) + (var9 << 6) + var10);
								field1257 = 0;
							} else if (field1257 < 8) {
								field1077.method222((field1257 << 19) + var8 + 0x800000);
								field1257 = 0;
							} else {
								field1077.method223((field1257 << 19) + var8 - 0x40000000);
								field1257 = 0;
							}
						} else if (field1257 < 2047) {
							field1257++;
						}
					}

					field1077.method228(field1077.field621 - var3);

					if (var4 >= field1333.field870) {
						field1333.field870 = 0;
					} else {
						field1333.field870 -= var4;
						for (int var11 = 0; var11 < field1333.field870; var11++) {
							field1333.field871[var11] = field1333.field871[var4 + var11];
							field1333.field872[var11] = field1333.field872[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1079) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1079 = field26;
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
				field1077.method218(131);
				field1077.method223((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1437 > 0) {
				field1437--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1438 = true;
			}

			if (field1438 && field1437 <= 0) {
				field1437 = 20;
				field1438 = false;
				field1077.method218(65);
				field1077.method220(field1095);
				field1077.method220(field1096);
			}

			if (field14 && !field1121) {
				field1121 = true;
				field1077.method218(60);
				field1077.method219(1);
			}

			if (!field14 && field1121) {
				field1121 = false;
				field1077.method218(60);
				field1077.method219(0);
			}

			method429();
			method437();
			method499();
			field1145++;
			if (field1145 > 750) {
				method452();
			}

			method496();
			method443();
			method466();
			field1279++;

			if (field1293 != 0) {
				field1292 += 20;
				if (field1292 >= 400) {
					field1293 = 0;
				}
			}

			if (field1402 != 0) {
				field1399++;
				if (field1399 >= 15) {
					if (field1402 == 2) {
						field1422 = true;
					}

					if (field1402 == 3) {
						field1469 = true;
					}

					field1402 = 0;
				}
			}

			if (field1419 != 0) {
				field1094++;

				if (field17 > field1420 + 5 || field17 < field1420 - 5 || field18 > field1421 + 5 || field18 < field1421 - 5) {
					field1407 = true;
				}

				if (field16 == 0) {
					if (field1419 == 2) {
						field1422 = true;
					}

					if (field1419 == 3) {
						field1469 = true;
					}

					field1419 = 0;

					if (field1407 && field1094 >= 5) {
						field1154 = -1;
						method544();

						if (field1417 == field1154 && field1418 != field1153) {
							class4 var19 = class4.field56[field1417];
							byte var20 = 0;
							if (field1197 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1153] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1418;
								int var22 = field1153;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1418;
								int var24 = field1153;
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
								var19.method33(field1418, field1153);
							}

							field1077.method218(28);
							field1077.method220(field1417);
							field1077.method220(field1418);
							field1077.method220(field1153);
							field1077.method219(var20);
						}
					} else if ((field1196 == 1 || method502(field1299 - 1)) && field1299 > 2) {
						method513();
					} else if (field1299 > 0) {
						method543(field1299 - 1);
					}

					field1399 = 10;
					field23 = 0;
				}
			}

			field1205++;
			if (field1205 > 62) {
				field1205 = 0;
				field1077.method218(153);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method486(0, var25, var26, 0, 0, 0, field1088.field410[0], 0, field1088.field411[0], true, 0);
				class18.field292 = -1;

				if (var27) {
					field1290 = field24;
					field1291 = field25;
					field1293 = 1;
					field1292 = 0;
				}
			}

			if (field23 == 1 && field1078 != null) {
				field1078 = null;
				field1469 = true;
				field23 = 0;
			}

			method462();
			method488();
			method552();
			method456();

			if (field16 == 1 || field23 == 1) {
				field1428++;
			}

			if (field1429 == 2) {
				method529();
			}

			if (field1429 == 2 && field1472) {
				method512();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1386[var28]++;
			}

			method468();
			field15++;
			if (field15 > 4500) {
				field1147 = 250;
				field15 -= 500;
				field1077.method218(36);
			}

			field1107++;
			if (field1107 > 500) {
				field1107 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1306 += field1307;
				}

				if ((var29 & 0x2) == 2) {
					field1225 += field1226;
				}

				if ((var29 & 0x4) == 4) {
					field1089 += field1090;
				}
			}

			if (field1306 < -50) {
				field1307 = 2;
			}

			if (field1306 > 50) {
				field1307 = -2;
			}

			if (field1225 < -55) {
				field1226 = 2;
			}

			if (field1225 > 55) {
				field1226 = -2;
			}

			if (field1089 < -40) {
				field1090 = 1;
			}

			if (field1089 > 40) {
				field1090 = -1;
			}

			field1460++;
			if (field1460 > 500) {
				field1460 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1165 += field1166;
				}

				if ((var30 & 0x2) == 2) {
					field1374 += field1375;
				}
			}

			if (field1165 < -60) {
				field1166 = 2;
			}

			if (field1165 > 60) {
				field1166 = -2;
			}

			if (field1374 < -20) {
				field1375 = 1;
			}

			if (field1374 > 10) {
				field1375 = -1;
			}

			field1146++;
			if (field1146 > 50) {
				field1077.method218(146);
			}

			try {
				if (field1286 != null && field1077.field621 > 0) {
					field1286.method42(field1077.field621, 0, field1077.field620);
					field1077.field621 = 0;
					field1146 = 0;
				}
			} catch (IOException var32) {
				method452();
			} catch (Exception var33) {
				method554();
			}
		}
	}

	@ObfuscatedName("client.b(IBLlb;)V")
	public final void method541(int arg0, class38 arg1) {
		for (int var3 = 0; var3 < field1181; var3++) {
			int var4 = field1182[var3];
			class27 var5 = field1178[var4];
			int var6 = arg1.method229();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method229() << 8;
			}

			method518(arg1, var4, var6, var5);
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method542(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method543(int arg0) {
		if (arg0 >= 0) {
			if (field1106) {
				field1106 = false;
				field1469 = true;
			}

			int var2 = field1377[arg0];
			int var3 = field1378[arg0];
			int var4 = field1379[arg0];
			int var5 = field1380[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 899 && method558(156, var5, var3, var2)) {
				field1077.method220(field1161);
			}

			if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
				if (var4 == 113) {
					field1077.method218(105);
				}

				if (var4 == 555) {
					field1077.method218(86);
				}

				if (var4 == 354) {
					field1077.method218(255);
				}

				if (var4 == 582) {
					if ((var5 & 0x3) == 0) {
						field1061++;
					}

					if (field1061 >= 133) {
						field1077.method218(134);
						field1077.method220(6118);
					}

					field1077.method218(202);
				}

				if (var4 == 331) {
					field1077.method218(112);
				}

				field1077.method220(var5);
				field1077.method220(var2);
				field1077.method220(var3);
				field1399 = 0;
				field1400 = var3;
				field1401 = var2;
				field1402 = 2;
				if (class4.field56[var3].field62 == field1092) {
					field1402 = 1;
				}

				if (class4.field56[var3].field62 == field1064) {
					field1402 = 3;
				}
			}

			if (var4 == 625) {
				method558(85, var5, var3, var2);
			}

			if (var4 == 1328) {
				class60 var6 = class60.method348(var5);
				class4 var7 = class4.field56[var3];
				String var8;
				if (var7 != null && var7.field58[var2] >= 100000) {
					var8 = var7.field58[var2] + " x " + var6.field917;
				} else if (var6.field918 == null) {
					var8 = "It's a " + var6.field917 + ".";
				} else {
					var8 = new String(var6.field918);
				}

				method440("", var8, 0);
			}

			if (var4 == 829) {
				class26 var9 = field1126[var5];
				if (var9 != null) {
					method486(2, var9.field410[0], var9.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
					field1290 = field24;
					field1291 = field25;
					field1293 = 2;
					field1292 = 0;
					field1077.method218(120);
					field1077.method220(var5);
					field1077.method220(field1218);
					field1077.method220(field1216);
					field1077.method220(field1217);
				}
			}

			if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
				class26 var10 = field1126[var5];
				if (var10 != null) {
					method486(2, var10.field410[0], var10.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
					field1290 = field24;
					field1291 = field25;
					field1293 = 2;
					field1292 = 0;

					if (var4 == 852) {
						field1077.method218(50);
					}

					if (var4 == 793) {
						field1077.method218(196);
					}

					if (var4 == 242) {
						field1077.method218(138);
					}

					if (var4 == 209) {
						field1077.method218(64);
					}

					if (var4 == 309) {
						field1077.method218(99);
					}

					field1077.method220(var5);
				}
			}

			if (var4 == 435) {
				field1077.method218(107);
				field1077.method220(var3);
				class4 var11 = class4.field56[var3];
				if (var11.field71 != null && var11.field71[0][0] == 5) {
					int var12 = var11.field71[0][1];
					field1352[var12] = 1 - field1352[var12];
					method498(var12);
					field1422 = true;
				}
			}

			if (var4 == 231) {
				class4 var13 = class4.field56[var3];
				boolean var14 = true;
				if (var13.field65 > 0) {
					var14 = method487(var13);
				}

				if (var14) {
					field1077.method218(107);
					field1077.method220(var3);
				}
			}

			if (var4 == 810 && method558(111, var5, var3, var2)) {
				field1077.method220(field1218);
				field1077.method220(field1216);
				field1077.method220(field1217);
			}

			if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
				class27 var15 = field1178[var5];
				if (var15 != null) {
					method486(2, var15.field410[0], var15.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
					field1290 = field24;
					field1291 = field25;
					field1293 = 2;
					field1292 = 0;

					if (var4 == 185) {
						field1077.method218(89);
					}

					if (var4 == 27) {
						field1077.method218(123);
					}

					if (var4 == 639) {
						field1353++;
						if (field1353 >= 52) {
							field1077.method218(210);
							field1077.method219(131);
						}

						field1077.method218(38);
					}

					if (var4 == 499) {
						field1077.method218(124);
					}

					if (var4 == 387) {
						field1190 += var5;
						if (field1190 >= 66) {
							field1077.method218(246);
							field1077.method219(154);
						}

						field1077.method218(171);
					}

					field1077.method220(var5);
				}
			}

			if (var4 == 1381) {
				int var16 = var5 >> 14 & 0x7FFF;
				class57 var17 = class57.method330(var16);
				String var18;
				if (var17.field832 == null) {
					var18 = "It's a " + var17.field831 + ".";
				} else {
					var18 = new String(var17.field832);
				}

				method440("", var18, 0);
			}

			if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
				String var19 = field1424[arg0];
				int var20 = var19.indexOf("@whi@");
				if (var20 != -1) {
					long var21 = class51.method300(var19.substring(var20 + 5).trim());
					if (var4 == 605) {
						method549(var21);
					}

					if (var4 == 47) {
						method548(var21);
					}

					if (var4 == 513) {
						method521(var21);
					}

					if (var4 == 884) {
						method459(var21);
					}
				}
			}

			if (var4 == 274) {
				class4 var23 = class4.field56[var3];
				field1160 = 1;
				field1161 = var3;
				field1162 = var23.field116;
				field1215 = 0;
				field1422 = true;
				String var24 = var23.field114;
				if (var24.indexOf(" ") != -1) {
					var24 = var24.substring(0, var24.indexOf(" "));
				}

				String var25 = var23.field114;
				if (var25.indexOf(" ") != -1) {
					var25 = var25.substring(var25.indexOf(" ") + 1);
				}

				field1163 = var24 + " " + var23.field115 + " " + var25;

				if (field1162 == 16) {
					field1422 = true;
					field1125 = 3;
					field1191 = true;
				}
			} else {
				if (var4 == 1152) {
					class60 var26 = class60.method348(var5);
					String var27;
					if (var26.field918 == null) {
						var27 = "It's a " + var26.field917 + ".";
					} else {
						var27 = new String(var26.field918);
					}

					method440("", var27, 0);
				}

				if (var4 == 1714) {
					class26 var28 = field1126[var5];
					if (var28 != null) {
						class59 var29 = var28.field415;
						if (var29.field905 != null) {
							var29 = var29.method345();
						}

						if (var29 != null) {
							String var30;
							if (var29.field881 == null) {
								var30 = "It's a " + var29.field880 + ".";
							} else {
								var30 = new String(var29.field881);
							}

							method440("", var30, 0);
						}
					}
				}

				if (var4 == 743) {
					field1221++;
					if (field1221 >= 124) {
						field1077.method218(129);
						field1077.method220(37954);
					}

					method558(250, var5, var3, var2);
				}

				if (var4 == 737) {
					method482();
				}

				if (var4 == 240) {
					class26 var31 = field1126[var5];
					if (var31 != null) {
						method486(2, var31.field410[0], var31.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
						field1290 = field24;
						field1291 = field25;
						field1293 = 2;
						field1292 = 0;
						field1077.method218(58);
						field1077.method220(var5);
						field1077.method220(field1161);
					}
				}

				if (var4 == 102) {
					field1215 = 1;
					field1216 = var2;
					field1217 = var3;
					field1218 = var5;
					field1219 = class60.method348(var5).field917;
					field1160 = 0;
					field1422 = true;
				} else {
					if (var4 == 357) {
						method558(172, var5, var3, var2);
					}

					if (var4 == 1071) {
						method558(165, var5, var3, var2);
					}

					if (var4 == 225) {
						field1077.method218(107);
						field1077.method220(var3);
						class4 var32 = class4.field56[var3];
						if (var32.field71 != null && var32.field71[0][0] == 5) {
							int var33 = var32.field71[0][1];
							if (field1352[var33] != var32.field73[0]) {
								field1352[var33] = var32.field73[0];
								method498(var33);
								field1422 = true;
							}
						}
					}

					if (var4 == 275) {
						class27 var34 = field1178[var5];
						if (var34 != null) {
							method486(2, var34.field410[0], var34.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
							field1290 = field24;
							field1291 = field25;
							field1293 = 2;
							field1292 = 0;
							field1077.method218(15);
							field1077.method220(var5);
							field1077.method220(field1218);
							field1077.method220(field1216);
							field1077.method220(field1217);
						}
					}

					if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
						boolean var35 = method486(2, var2, var3, 0, 0, 0, field1088.field410[0], 0, field1088.field411[0], false, 0);
						if (!var35) {
							method486(2, var2, var3, 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
						}

						field1290 = field24;
						field1291 = field25;
						field1293 = 2;
						field1292 = 0;

						if (var4 == 778) {
							field1077.method218(52);
						}

						if (var4 == 139) {
							if ((var2 & 0x3) == 0) {
								field1479++;
							}

							if (field1479 >= 123) {
								field1077.method218(20);
								field1077.method223(0);
							}

							field1077.method218(122);
						}

						if (var4 == 662) {
							field1394 += field1073;
							if (field1394 >= 118) {
								field1077.method218(100);
								field1077.method223(0);
							}

							field1077.method218(222);
						}

						if (var4 == 224) {
							field1478 += var3;
							if (field1478 >= 75) {
								field1077.method218(198);
								field1077.method219(19);
							}

							field1077.method218(251);
						}

						if (var4 == 617) {
							field1077.method218(170);
						}

						field1077.method220(field1072 + var2);
						field1077.method220(field1073 + var3);
						field1077.method220(var5);
					}

					if (var4 == 131) {
						class27 var37 = field1178[var5];
						if (var37 != null) {
							method486(2, var37.field410[0], var37.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
							field1290 = field24;
							field1291 = field25;
							field1293 = 2;
							field1292 = 0;
							field1077.method218(189);
							field1077.method220(var5);
							field1077.method220(field1161);
						}
					}

					if (var4 == 563) {
						field1077.method218(47);
						field1077.method220(var5);
						field1077.method220(var2);
						field1077.method220(var3);
						field1077.method220(field1161);
						field1399 = 0;
						field1400 = var3;
						field1401 = var2;
						field1402 = 2;
						if (class4.field56[var3].field62 == field1092) {
							field1402 = 1;
						}

						if (class4.field56[var3].field62 == field1064) {
							field1402 = 3;
						}
					}

					if (var4 == 370) {
						boolean var38 = method486(2, var2, var3, 0, 0, 0, field1088.field410[0], 0, field1088.field411[0], false, 0);
						if (!var38) {
							method486(2, var2, var3, 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
						}

						field1290 = field24;
						field1291 = field25;
						field1293 = 2;
						field1292 = 0;
						field1077.method218(46);
						field1077.method220(field1072 + var2);
						field1077.method220(field1073 + var3);
						field1077.method220(var5);
						field1077.method220(field1161);
					}

					if (var4 == 902) {
						String var40 = field1424[arg0];
						int var41 = var40.indexOf("@whi@");
						if (var41 != -1) {
							long var42 = class51.method300(var40.substring(var41 + 5).trim());
							int var44 = -1;
							for (int var45 = 0; var45 < field1109; var45++) {
								if (field1174[var45] == var42) {
									var44 = var45;
									break;
								}
							}

							if (var44 != -1 && field1425[var44] > 0) {
								field1469 = true;
								field1106 = false;
								field1315 = true;
								field1305 = "";
								field1365 = 3;
								field1464 = field1174[var44];
								field1426 = "Enter message to send to " + field1255[var44];
							}
						}
					}

					if (var4 == 721) {
						field1212 += var3;
						if (field1212 >= 139) {
							field1077.method218(73);
							field1077.method223(0);
						}

						method558(187, var5, var3, var2);
					}

					if (var4 == 524) {
						String var46 = field1424[arg0];
						int var47 = var46.indexOf("@whi@");
						if (var47 != -1) {
							if (field1092 == -1) {
								method482();
								field1471 = var46.substring(var47 + 5).trim();
								field1101 = false;

								for (int var48 = 0; var48 < class4.field56.length; var48++) {
									if (class4.field56[var48] != null && class4.field56[var48].field65 == 600) {
										field1184 = field1092 = class4.field56[var48].field62;
										break;
									}
								}
							} else {
								method440("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}

					if (var4 == 718) {
						if (field1371) {
							field1363.method88(var2 - 4, var3 - 4);
						} else {
							field1363.method88(field24 - 4, field25 - 4);
						}
					}

					if (var4 == 398) {
						field1077.method218(93);
						field1077.method220(var5);
						field1077.method220(var2);
						field1077.method220(var3);
						field1077.method220(field1218);
						field1077.method220(field1216);
						field1077.method220(field1217);
						field1399 = 0;
						field1400 = var3;
						field1401 = var2;
						field1402 = 2;
						if (class4.field56[var3].field62 == field1092) {
							field1402 = 1;
						}

						if (class4.field56[var3].field62 == field1064) {
							field1402 = 3;
						}
					}

					if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
						if (var4 == 681) {
							field1362++;
							if (field1362 >= 116) {
								field1077.method218(252);
								field1077.method222(0xC6A439);
							}

							field1077.method218(76);
						}

						if (var4 == 694) {
							field1077.method218(88);
						}

						if (var4 == 962) {
							field1077.method218(149);
						}

						if (var4 == 100) {
							field1077.method218(215);
						}

						if (var4 == 795) {
							field1077.method218(219);
						}

						field1077.method220(var5);
						field1077.method220(var2);
						field1077.method220(var3);
						field1399 = 0;
						field1400 = var3;
						field1401 = var2;
						field1402 = 2;
						if (class4.field56[var3].field62 == field1092) {
							field1402 = 1;
						}

						if (class4.field56[var3].field62 == field1064) {
							field1402 = 3;
						}
					}

					if (var4 == 507 || var4 == 957) {
						String var49 = field1424[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							var49 = var49.substring(var50 + 5).trim();
							String var51 = class51.method304(class51.method301(class51.method300(var49)));
							boolean var52 = false;
							for (int var53 = 0; var53 < field1179; var53++) {
								class27 var54 = field1178[field1180[var53]];
								if (var54 != null && var54.field416 != null && var54.field416.equalsIgnoreCase(var51)) {
									method486(2, var54.field410[0], var54.field411[0], 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);

									if (var4 == 507) {
										field1190 += var5;
										if (field1190 >= 66) {
											field1077.method218(246);
											field1077.method219(154);
										}

										field1077.method218(171);
									}

									if (var4 == 957) {
										field1353++;
										if (field1353 >= 52) {
											field1077.method218(210);
											field1077.method219(131);
										}

										field1077.method218(38);
									}

									field1077.method220(field1180[var53]);
									var52 = true;
									break;
								}
							}

							if (!var52) {
								method440("", "Unable to find " + var51, 0);
							}
						}
					}

					if (var4 == 111) {
						boolean var55 = method486(2, var2, var3, 0, 0, 0, field1088.field410[0], 0, field1088.field411[0], false, 0);
						if (!var55) {
							method486(2, var2, var3, 1, 0, 1, field1088.field410[0], 0, field1088.field411[0], false, 0);
						}

						field1290 = field24;
						field1291 = field25;
						field1293 = 2;
						field1292 = 0;
						field1077.method218(59);
						field1077.method220(field1072 + var2);
						field1077.method220(field1073 + var3);
						field1077.method220(var5);
						field1077.method220(field1218);
						field1077.method220(field1216);
						field1077.method220(field1217);
					}

					if (var4 == 997 && !field1284) {
						field1077.method218(27);
						field1077.method220(var3);
						field1284 = true;
					}

					field1215 = 0;
					field1160 = 0;
					field1422 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method544() {
		if (field1419 == 0) {
			field1424[0] = "Cancel";
			field1379[0] = 1106;
			field1299 = 1;
			method492();
			field1405 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1092 == -1) {
					method435();
				} else {
					method553(0, 4, class4.field56[field1092], field17, 4, field18);
				}
			}

			if (field1405 != field1164) {
				field1164 = field1405;
			}

			field1405 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1289 != -1) {
					method553(0, 553, class4.field56[field1289], field17, 205, field18);
				} else if (field1204[field1125] != -1) {
					method553(0, 553, class4.field56[field1204[field1125]], field17, 205, field18);
				}
			}

			if (field1405 != field1187) {
				field1422 = true;
				field1187 = field1405;
			}

			field1405 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1064 != -1) {
					method553(0, 17, class4.field56[field1064], field17, 357, field18);
				} else if (field18 < 434 && field17 < 426) {
					method506(field17 - 17, field18 - 357);
				}
			}

			if (field1064 != -1 && field1405 != field1108) {
				field1469 = true;
				field1108 = field1405;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1299 - 1; var2++) {
					if (field1379[var2] < 1000 && field1379[var2 + 1] > 1000) {
						String var3 = field1424[var2];
						field1424[var2] = field1424[var2 + 1];
						field1424[var2 + 1] = var3;
						int var4 = field1379[var2];
						field1379[var2] = field1379[var2 + 1];
						field1379[var2 + 1] = var4;
						int var5 = field1377[var2];
						field1377[var2] = field1377[var2 + 1];
						field1377[var2 + 1] = var5;
						int var6 = field1378[var2];
						field1378[var2] = field1378[var2 + 1];
						field1378[var2 + 1] = var6;
						int var7 = field1380[var2];
						field1380[var2] = field1380[var2 + 1];
						field1380[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method545() {
		field1063 = 0;
		int var1 = (field1088.field360 >> 7) + field1072;
		int var2 = (field1088.field361 >> 7) + field1073;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1063 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1063 = 1;
		}

		if (field1063 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1063 = 0;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method546() {
		field1325 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1304[var1] = -1;
			for (int var2 = 0; var2 < class64.field977; var2++) {
				if (!class64.field978[var2].field984 && class64.field978[var2].field979 == var1 + (field1359 ? 0 : 7)) {
					field1304[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method547() {
		if (field1448 == null) {
			field10 = null;
			field1244 = null;
			field1242 = null;
			field1241 = null;
			field1243 = null;
			field1085 = null;
			field1086 = null;
			field1087 = null;
			field1451 = new class43(method11(), 128, 265);
			class33.method155();
			field1452 = new class43(method11(), 128, 265);
			class33.method155();
			field1448 = new class43(method11(), 509, 171);
			class33.method155();
			field1449 = new class43(method11(), 360, 132);
			class33.method155();
			field1450 = new class43(method11(), 360, 200);
			class33.method155();
			field1453 = new class43(method11(), 202, 238);
			class33.method155();
			field1454 = new class43(method11(), 203, 238);
			class33.method155();
			field1455 = new class43(method11(), 74, 94);
			class33.method155();
			field1456 = new class43(method11(), 75, 94);
			class33.method155();

			if (field1285 != null) {
				method471();
				method494();
			}

			field1461 = true;
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method548(long arg0) {
		if (arg0 != 0L) {
			if (field1373 >= 100) {
				method440("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1373; var4++) {
					if (field1335[var4] == arg0) {
						method440("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1109; var5++) {
					if (field1174[var5] == arg0) {
						method440("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field1335[field1373++] = arg0;
				field1422 = true;
				field1077.method218(32);
				field1077.method225(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method549(long arg0) {
		if (arg0 != 0L) {
			if (field1109 >= 100 && field1277 != 1) {
				method440("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field1109 >= 200) {
				method440("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = class51.method304(class51.method301(arg0));
				for (int var4 = 0; var4 < field1109; var4++) {
					if (field1174[var4] == arg0) {
						method440("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1373; var5++) {
					if (field1335[var5] == arg0) {
						method440("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field1088.field416)) {
					field1255[field1109] = var3;
					field1174[field1109] = arg0;
					field1425[field1109] = 0;
					field1109++;
					field1422 = true;
					field1077.method218(176);
					field1077.method225(arg0);
				}
			}
		}
	}

	public final void init() {
		field1200 = Integer.parseInt(getParameter("nodeid"));
		field1201 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method436();
		} else {
			method465();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1202 = false;
		} else {
			field1202 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.K(I)V")
	public final void method550() {
		field1244.method258();
		class34.field584 = field1234;
		field1195.method199(0, 0);

		if (field1315) {
			field1297.method202(239, 0, field1426, 40);
			field1297.method202(239, 128, field1305 + "*", 60);
		} else if (field1106) {
			field1297.method202(239, 0, "Enter amount:", 40);
			field1297.method202(239, 128, field1330 + "*", 60);
		} else if (field1078 != null) {
			field1297.method202(239, 0, field1078, 40);
			field1297.method202(239, 128, "Click to continue", 60);
		} else if (field1064 != -1) {
			method467(0, class4.field56[field1064], 0, 0);
		} else if (field1300 == -1) {
			class37 var1 = field1296;
			int var2 = 0;
			class33.method154(77, 463, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1104[var3] != null) {
					int var4 = field1102[var3];
					int var5 = field1248 + 70 - var2 * 14;
					String var6 = field1103[var3];
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
							var1.method206(var5, 0, 4, field1104[var3]);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1067 == 0 || field1067 == 1 && method517(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1356[0].method199(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1356[1].method199(var8, var5 - 12);
								var8 += 14;
							}

							var1.method206(var5, 0, var8, var6 + ":");
							var8 += var1.method204(var6) + 8;
							var1.method206(var5, 255, var8, field1104[var3]);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1302 == 0 && (var4 == 7 || field1338 == 0 || field1338 == 1 && method517(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method206(var5, 0, var9, "From");
							int var11 = var9 + var1.method204("From ");
							if (var7 == 1) {
								field1356[0].method199(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1356[1].method199(var11, var5 - 12);
								var11 += 14;
							}

							var1.method206(var5, 0, var11, var6 + ":");
							var11 += var1.method204(var6) + 8;
							var1.method206(var5, 0x800000, var11, field1104[var3]);
						}

						var2++;
					}

					if (var4 == 4 && (field1220 == 0 || field1220 == 1 && method517(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, 0x800080, 4, var6 + " " + field1104[var3]);
						}

						var2++;
					}

					if (var4 == 5 && field1302 == 0 && field1338 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, 0x800000, 4, field1104[var3]);
						}

						var2++;
					}

					if (var4 == 6 && field1302 == 0 && field1338 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, 0, 4, "To " + var6 + ":");
							var1.method206(var5, 0x800000, var1.method204("To " + var6) + 12, field1104[var3]);
						}

						var2++;
					}

					if (var4 == 8 && (field1220 == 0 || field1220 == 1 && method517(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method206(var5, 0x7E3200, 4, var6 + " " + field1104[var3]);
						}

						var2++;
					}
				}
			}

			class33.method153();
			field1413 = var2 * 14 + 7;
			if (field1413 < 78) {
				field1413 = 78;
			}

			method508(77, 0, field1413, 463, field1413 - field1248 - 77);
			String var10;
			if (field1088 == null || field1088.field416 == null) {
				var10 = class51.method304(field1222);
			} else {
				var10 = field1088.field416;
			}

			var1.method206(90, 0, 4, var10 + ":");
			var1.method206(90, 255, var1.method204(var10 + ": ") + 6, field1211 + "*");
			class33.method160(0, 0, 77, 479);
		} else {
			method467(0, class4.field56[field1300], 0, 0);
		}

		if (field1371 && field1260 == 2) {
			method503();
		}

		field1244.method259(357, 17, field9);
		field1243.method258();
		class34.field584 = field1236;
	}

	@ObfuscatedName("client.c(Ld;I)Z")
	public final boolean method551(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1424[field1299] = "Remove @whi@" + arg0.field97;
				field1379[field1299] = 884;
				field1299++;
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

		field1424[field1299] = "Remove @whi@" + field1255[var2];
		field1379[field1299] = 513;
		field1299++;
		field1424[field1299] = "Message @whi@" + field1255[var2];
		field1379[field1299] = 902;
		field1299++;
		return true;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method552() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1204[0] != -1) {
				field1422 = true;
				field1125 = 0;
				field1191 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1204[1] != -1) {
				field1422 = true;
				field1125 = 1;
				field1191 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1204[2] != -1) {
				field1422 = true;
				field1125 = 2;
				field1191 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1204[3] != -1) {
				field1422 = true;
				field1125 = 3;
				field1191 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1204[4] != -1) {
				field1422 = true;
				field1125 = 4;
				field1191 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1204[5] != -1) {
				field1422 = true;
				field1125 = 5;
				field1191 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1204[6] != -1) {
				field1422 = true;
				field1125 = 6;
				field1191 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1204[7] != -1) {
				field1422 = true;
				field1125 = 7;
				field1191 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1204[8] != -1) {
				field1422 = true;
				field1125 = 8;
				field1191 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1204[9] != -1) {
				field1422 = true;
				field1125 = 9;
				field1191 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1204[10] != -1) {
				field1422 = true;
				field1125 = 10;
				field1191 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1204[11] != -1) {
				field1422 = true;
				field1125 = 11;
				field1191 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1204[12] != -1) {
				field1422 = true;
				field1125 = 12;
				field1191 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1204[13] != -1) {
				field1422 = true;
				field1125 = 13;
				field1191 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public final void method553(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
		if (arg2.field63 == 0 && arg2.field78 != null && !arg2.field77 && (arg3 >= arg1 && arg5 >= arg4 && arg3 <= arg2.field66 + arg1 && arg5 <= arg2.field67 + arg4)) {
			int var7 = arg2.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field79[var8] + arg1;
				int var10 = arg2.field80[var8] + arg4 - arg0;
				class4 var11 = class4.field56[arg2.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1405 = var11.field74;
					} else {
						field1405 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method553(var11.field76, var9, var11, arg3, var10, arg5);

					if (var11.field75 > var11.field67) {
						method473(var11.field75, var10, arg5, arg3, var11.field67, var11, true, var11.field66 + var9);
					}
				} else {
					if (var11.field64 == 1 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method551(var11);
						}

						if (!var12) {
							field1424[field1299] = var11.field117;
							field1379[field1299] = 231;
							field1378[field1299] = var11.field61;
							field1299++;
						}
					}

					if (var11.field64 == 2 && field1160 == 0 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1424[field1299] = var13 + " @gre@" + var11.field115;
						field1379[field1299] = 274;
						field1378[field1299] = var11.field61;
						field1299++;
					}

					if (var11.field64 == 3 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1424[field1299] = "Close";
						field1379[field1299] = 737;
						field1378[field1299] = var11.field61;
						field1299++;
					}

					if (var11.field64 == 4 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1424[field1299] = var11.field117;
						field1379[field1299] = 435;
						field1378[field1299] = var11.field61;
						field1299++;
					}

					if (var11.field64 == 5 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1424[field1299] = var11.field117;
						field1379[field1299] = 225;
						field1378[field1299] = var11.field61;
						field1299++;
					}

					if (var11.field64 == 6 && !field1284 && arg3 >= var9 && arg5 >= var10 && arg3 < var11.field66 + var9 && arg5 < var11.field67 + var10) {
						field1424[field1299] = var11.field117;
						field1379[field1299] = 997;
						field1378[field1299] = var11.field61;
						field1299++;
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

								if (arg3 >= var17 && arg5 >= var18 && arg3 < var17 + 32 && arg5 < var18 + 32) {
									field1153 = var14;
									field1154 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method348(var11.field57[var14] - 1);
										if (field1215 == 1 && var11.field84) {
											if (field1217 != var11.field61 || field1216 != var14) {
												field1424[field1299] = "Use " + field1219 + " with @lre@" + var19.field917;
												field1379[field1299] = 398;
												field1380[field1299] = var19.field915;
												field1377[field1299] = var14;
												field1378[field1299] = var11.field61;
												field1299++;
											}
										} else if (field1160 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field932 != null && var19.field932[var20] != null) {
														field1424[field1299] = var19.field932[var20] + " @lre@" + var19.field917;

														if (var20 == 3) {
															field1379[field1299] = 681;
														}

														if (var20 == 4) {
															field1379[field1299] = 100;
														}

														field1380[field1299] = var19.field915;
														field1377[field1299] = var14;
														field1378[field1299] = var11.field61;
														field1299++;
													} else if (var20 == 4) {
														field1424[field1299] = "Drop @lre@" + var19.field917;
														field1379[field1299] = 100;
														field1380[field1299] = var19.field915;
														field1377[field1299] = var14;
														field1378[field1299] = var11.field61;
														field1299++;
													}
												}
											}

											if (var11.field85) {
												field1424[field1299] = "Use @lre@" + var19.field917;
												field1379[field1299] = 102;
												field1380[field1299] = var19.field915;
												field1377[field1299] = var14;
												field1378[field1299] = var11.field61;
												field1299++;
											}

											if (var11.field84 && var19.field932 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field932[var21] != null) {
														field1424[field1299] = var19.field932[var21] + " @lre@" + var19.field917;

														if (var21 == 0) {
															field1379[field1299] = 694;
														}

														if (var21 == 1) {
															field1379[field1299] = 962;
														}

														if (var21 == 2) {
															field1379[field1299] = 795;
														}

														field1380[field1299] = var19.field915;
														field1377[field1299] = var14;
														field1378[field1299] = var11.field61;
														field1299++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1424[field1299] = var11.field92[var22] + " @lre@" + var19.field917;

														if (var22 == 0) {
															field1379[field1299] = 582;
														}

														if (var22 == 1) {
															field1379[field1299] = 113;
														}

														if (var22 == 2) {
															field1379[field1299] = 555;
														}

														if (var22 == 3) {
															field1379[field1299] = 331;
														}

														if (var22 == 4) {
															field1379[field1299] = 354;
														}

														field1380[field1299] = var19.field915;
														field1377[field1299] = var14;
														field1378[field1299] = var11.field61;
														field1299++;
													}
												}
											}

											field1424[field1299] = "Examine @lre@" + var19.field917;
											field1379[field1299] = 1328;
											field1380[field1299] = var19.field915;
											field1377[field1299] = var14;
											field1378[field1299] = var11.field61;
											field1299++;
										} else if ((field1162 & 0x10) == 0x10) {
											field1424[field1299] = field1163 + " @lre@" + var19.field917;
											field1379[field1299] = 563;
											field1380[field1299] = var19.field915;
											field1377[field1299] = var14;
											field1378[field1299] = var11.field61;
											field1299++;
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

	@ObfuscatedName("client.n(B)V")
	public final void method554() {
		try {
			if (field1286 != null) {
				field1286.method38();
			}
		} catch (Exception var2) {
		}

		field1286 = null;
		field1099 = false;
		field1281 = 0;
		field1222 = "";
		field1223 = "";
		method431();
		field1363.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1434[var1].method359();
		}

		System.gc();
		method532();
		field1376 = -1;
		field1369 = -1;
		field1314 = 0;
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method555(boolean arg0) {
		if (field1088.field360 >> 7 == field1395 && field1088.field361 >> 7 == field1396) {
			field1395 = 0;
			field1249++;
			if (field1249 > 122) {
				field1249 = 0;
				field1077.method218(174);
				field1077.method219(62);
			}
		}

		int var2 = field1179;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1088;
				var5 = field1177 << 14;
			} else {
				var4 = field1178[field1180[var3]];
				var5 = field1180[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1203 && field1179 > 50 || field1179 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1118 < var4.field426 || field1118 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1404[var6][var7] == field1463) {
								continue;
							}

							field1404[var6][var7] = field1463;
						}

						var4.field425 = method510(var4.field360, var4.field361, field1301);
						field1363.method61(var4.field363, field1301, var4.field361, 60, var5, var4, var4.field425, var4.field362, var4.field360);
					} else {
						var4.field436 = false;
						var4.field425 = method510(var4.field360, var4.field361, field1301);
						field1363.method62(var5, var4, var4.field434, field1301, var4.field425, 60, var4.field433, var4.field361, var4.field435, var4.field360, var4.field362, var4.field432);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method556() {
		if (field1244 == null) {
			method442();
			field10 = null;
			field1448 = null;
			field1449 = null;
			field1450 = null;
			field1451 = null;
			field1452 = null;
			field1453 = null;
			field1454 = null;
			field1455 = null;
			field1456 = null;
			field1244 = new class43(method11(), 479, 96);
			field1242 = new class43(method11(), 172, 156);
			class33.method155();
			field1194.method199(0, 0);
			field1241 = new class43(method11(), 190, 261);
			field1243 = new class43(method11(), 512, 334);
			class33.method155();
			field1085 = new class43(method11(), 496, 50);
			field1086 = new class43(method11(), 269, 37);
			field1087 = new class43(method11(), 249, 45);
			field1461 = true;
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean method557(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg1];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method557(arg0, var6.field61);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method505(var6);
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1201 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IBIII)Z")
	public final boolean method558(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg1 >> 14 & 0x7FFF;
		int var6 = field1363.method80(field1301, arg3, arg2, arg1);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1093++;
		if (field1093 > 1086) {
			field1093 = 0;
			field1077.method218(162);
			field1077.method219(0);
			int var9 = field1077.field621;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method220(16791);
			}

			field1077.method219(254);
			field1077.method220((int) (Math.random() * 65536.0D));
			field1077.method220(16128);
			field1077.method220(52610);
			field1077.method220((int) (Math.random() * 65536.0D));
			field1077.method220(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1077.method220(35025);
			}

			field1077.method220(46628);
			field1077.method219((int) (Math.random() * 256.0D));
			field1077.method228(field1077.field621 - var9);
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

			method486(2, arg3, arg2, var11, 0, var12, field1088.field410[0], 0, field1088.field411[0], false, var13);
		} else {
			method486(2, arg3, arg2, 0, var7 + 1, 0, field1088.field410[0], var8, field1088.field411[0], false, 0);
		}

		field1290 = field24;
		field1291 = field25;
		field1293 = 2;
		field1292 = 0;
		field1077.method218(arg0);
		field1077.method220(field1072 + arg3);
		field1077.method220(field1073 + arg2);
		field1077.method220(var5);
		return true;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method559(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method560(boolean arg0) {
		for (int var2 = 0; var2 < field1127; var2++) {
			class26 var3 = field1126[field1128[var2]];
			int var4 = (field1128[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field900 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1404[var5][var6] == field1463) {
							continue;
						}

						field1404[var5][var6] = field1463;
					}

					field1363.method61(var3.field363, field1301, var3.field361, (var3.field364 - 1) * 64 + 60, var4, var3, method510(var3.field360, var3.field361, field1301), var3.field362, var3.field360);
				}
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method561(int arg0) {
		if (!field1203) {
			if (class34.field592[17] >= arg0) {
				class36 var2 = class34.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1279 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1361;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1361 = var5;
				class34.method171(17);
			}

			if (class34.field592[24] >= arg0) {
				class36 var8 = class34.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1279 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1361;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1361 = var11;
				class34.method171(24);
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

	@ObfuscatedName("client.a(BIIILab;)V")
	public final void method562(int arg0, int arg1, int arg2, class27 arg3) {
		if (field1088 != arg3 && field1299 < 400) {
			String var5;
			if (arg3.field423 == 0) {
				var5 = arg3.field416 + method464(field1088.field422, arg3.field422) + " (level-" + arg3.field422 + ")";
			} else {
				var5 = arg3.field416 + " (skill-" + arg3.field423 + ")";
			}

			if (field1215 == 1) {
				field1424[field1299] = "Use " + field1219 + " with @whi@" + var5;
				field1379[field1299] = 275;
				field1380[field1299] = arg2;
				field1377[field1299] = arg1;
				field1378[field1299] = arg0;
				field1299++;
			} else if (field1160 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1065[var6] != null) {
						field1424[field1299] = field1065[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1065[var6].equalsIgnoreCase("attack")) {
							if (arg3.field422 > field1088.field422) {
								var7 = 2000;
							}

							if (field1088.field439 != 0 && arg3.field439 != 0) {
								if (field1088.field439 == arg3.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1066[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1379[field1299] = var7 + 639;
						}

						if (var6 == 1) {
							field1379[field1299] = var7 + 499;
						}

						if (var6 == 2) {
							field1379[field1299] = var7 + 27;
						}

						if (var6 == 3) {
							field1379[field1299] = var7 + 387;
						}

						if (var6 == 4) {
							field1379[field1299] = var7 + 185;
						}

						field1380[field1299] = arg2;
						field1377[field1299] = arg1;
						field1378[field1299] = arg0;
						field1299++;
					}
				}
			} else if ((field1162 & 0x8) == 8) {
				field1424[field1299] = field1163 + " @whi@" + var5;
				field1379[field1299] = 131;
				field1380[field1299] = arg2;
				field1377[field1299] = arg1;
				field1378[field1299] = arg0;
				field1299++;
			}

			for (int var8 = 0; var8 < field1299; var8++) {
				if (field1379[var8] == 718) {
					field1424[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1367[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1459[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
