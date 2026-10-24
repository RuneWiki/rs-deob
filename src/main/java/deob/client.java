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
	public int[] field1065 = new int[field1064];

	@ObfuscatedName("client.bb")
	public int[] field1066 = new int[field1064];

	@ObfuscatedName("client.cb")
	public int[] field1067 = new int[field1064];

	@ObfuscatedName("client.db")
	public int[] field1068 = new int[field1064];

	@ObfuscatedName("client.eb")
	public int[] field1069 = new int[field1064];

	@ObfuscatedName("client.fb")
	public int[] field1070 = new int[field1064];

	@ObfuscatedName("client.gb")
	public int[] field1071 = new int[field1064];

	@ObfuscatedName("client.hb")
	public String[] field1072 = new String[field1064];

	@ObfuscatedName("client.ib")
	public int field1073;

	@ObfuscatedName("client.kb")
	public class62[] field1074 = new class62[4];

	@ObfuscatedName("client.lb")
	public boolean field1075 = false;

	@ObfuscatedName("client.mb")
	public long field1076;

	@ObfuscatedName("client.nb")
	public int field1077;

	@ObfuscatedName("client.ob")
	public int field1078;

	@ObfuscatedName("client.pb")
	public int field1079;

	@ObfuscatedName("client.rb")
	public int field1080;

	@ObfuscatedName("client.sb")
	public int field1081;

	@ObfuscatedName("client.tb")
	public class43 field1082;

	@ObfuscatedName("client.ub")
	public class43 field1083;

	@ObfuscatedName("client.vb")
	public class43 field1084;

	@ObfuscatedName("client.wb")
	public class43 field1085;

	@ObfuscatedName("client.xb")
	public class43 field1086;

	@ObfuscatedName("client.yb")
	public class43 field1087;

	@ObfuscatedName("client.zb")
	public class43 field1088;

	@ObfuscatedName("client.ac")
	public class35 field1113;

	@ObfuscatedName("client.bc")
	public static class27 field1114;

	@ObfuscatedName("client.cc")
	public static int field1115;

	@ObfuscatedName("client.dc")
	public int field1116;

	@ObfuscatedName("client.ec")
	public int[][] field1117 = new int[104][104];

	@ObfuscatedName("client.fc")
	public class35 field1118;

	@ObfuscatedName("client.gc")
	public class35 field1119;

	@ObfuscatedName("client.hc")
	public class35 field1120;

	@ObfuscatedName("client.ic")
	public class35 field1121;

	@ObfuscatedName("client.jc")
	public int field1122;

	@ObfuscatedName("client.kc")
	public byte[] field1123 = new byte[16384];

	@ObfuscatedName("client.lc")
	public int field1124 = -1;

	@ObfuscatedName("client.mc")
	public int field1125 = -1;

	@ObfuscatedName("client.nc")
	public boolean field1126 = false;

	@ObfuscatedName("client.oc")
	public int[] field1127 = new int[5];

	@ObfuscatedName("client.qc")
	public int field1128;

	@ObfuscatedName("client.rc")
	public int field1129;

	@ObfuscatedName("client.sc")
	public int[] field1130 = new int[5];

	@ObfuscatedName("client.J")
	public String field1049 = "";

	@ObfuscatedName("client.N")
	public int field1053 = -1;

	@ObfuscatedName("client.O")
	public boolean field1054 = false;

	@ObfuscatedName("client.Q")
	public boolean field1056 = false;

	@ObfuscatedName("client.R")
	public boolean field1057 = true;

	@ObfuscatedName("client.U")
	public String field1059 = "";

	@ObfuscatedName("client.Z")
	public int field1064 = 50;

	@ObfuscatedName("client.Eb")
	public class41 field1092 = new class41();

	@ObfuscatedName("client.Fb")
	public int field1093 = 0x766654;

	@ObfuscatedName("client.Gb")
	public boolean field1094 = true;

	@ObfuscatedName("client.Lb")
	public int field1099 = 2;

	@ObfuscatedName("client.Nb")
	public class35[] field1100 = new class35[20];

	@ObfuscatedName("client.Ob")
	public int[][] field1101 = new int[104][104];

	@ObfuscatedName("client.Wb")
	public int[] field1109 = new int[7];

	@ObfuscatedName("client.tc")
	public boolean field1131 = false;

	@ObfuscatedName("client.Bc")
	public boolean field1139 = false;

	@ObfuscatedName("client.Oc")
	public int[] field1150 = new int[50];

	@ObfuscatedName("client.Wc")
	public int field1156 = 1;

	@ObfuscatedName("client.dd")
	public String field1161 = "";

	@ObfuscatedName("client.ed")
	public String field1162 = "";

	@ObfuscatedName("client.ld")
	public final int[] field1168 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.md")
	public int[] field1169 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.od")
	public int[] field1170 = new int[33];

	@ObfuscatedName("client.pd")
	public String field1171 = "";

	@ObfuscatedName("client.rd")
	public int field1173 = 2048;

	@ObfuscatedName("client.sd")
	public int field1174 = 2047;

	@ObfuscatedName("client.td")
	public class27[] field1175 = new class27[field1173];

	@ObfuscatedName("client.vd")
	public int[] field1177 = new int[field1173];

	@ObfuscatedName("client.xd")
	public int[] field1179 = new int[field1173];

	@ObfuscatedName("client.yd")
	public class38[] field1180 = new class38[field1173];

	@ObfuscatedName("client.Cd")
	public int field1184 = 0x23201B;

	@ObfuscatedName("client.Dd")
	public boolean field1185 = false;

	@ObfuscatedName("client.Sd")
	public int[][] field1199 = new int[104][104];

	@ObfuscatedName("client.Td")
	public int field1200 = -1;

	@ObfuscatedName("client.Wd")
	public int[] field1202 = new int[class67.field1001];

	@ObfuscatedName("client.ce")
	public CRC32 field1207 = new CRC32();

	@ObfuscatedName("client.ie")
	public boolean field1213 = false;

	@ObfuscatedName("client.ne")
	public boolean field1218 = false;

	@ObfuscatedName("client.qe")
	public int[] field1219 = new int[33];

	@ObfuscatedName("client.re")
	public int field1220 = -1;

	@ObfuscatedName("client.ve")
	public String[] field1224 = new String[500];

	@ObfuscatedName("client.we")
	public long[] field1225 = new long[200];

	@ObfuscatedName("client.Ce")
	public class35[] field1231 = new class35[8];

	@ObfuscatedName("client.Je")
	public int field1238 = -1;

	@ObfuscatedName("client.Te")
	public class41 field1248 = new class41();

	@ObfuscatedName("client.Ue")
	public boolean field1249 = false;

	@ObfuscatedName("client.Ze")
	public class36[] field1254 = new class36[100];

	@ObfuscatedName("client.af")
	public int[] field1255 = new int[class67.field1001];

	@ObfuscatedName("client.cf")
	public int[] field1257 = new int[50];

	@ObfuscatedName("client.ff")
	public int field1260 = 3;

	@ObfuscatedName("client.mf")
	public class38 field1266 = class38.method213(1);

	@ObfuscatedName("client.of")
	public int[] field1267 = new int[class67.field1001];

	@ObfuscatedName("client.vf")
	public int[] field1274 = new int[50];

	@ObfuscatedName("client.Cf")
	public int field1280 = 78;

	@ObfuscatedName("client.Ef")
	public boolean field1282 = true;

	@ObfuscatedName("client.Ff")
	public int[] field1283 = new int[100];

	@ObfuscatedName("client.Gf")
	public String[] field1284 = new String[100];

	@ObfuscatedName("client.Hf")
	public String[] field1285 = new String[100];

	@ObfuscatedName("client.Jf")
	public int field1287 = 2;

	@ObfuscatedName("client.Mf")
	public class38 field1290 = class38.method213(1);

	@ObfuscatedName("client.Nf")
	public boolean field1291 = false;

	@ObfuscatedName("client.Qf")
	public int field1294 = 2;

	@ObfuscatedName("client.Tf")
	public class36[] field1297 = new class36[13];

	@ObfuscatedName("client.Vf")
	public int[] field1299 = new int[1000];

	@ObfuscatedName("client.Wf")
	public int[] field1300 = new int[1000];

	@ObfuscatedName("client.Yf")
	public int field1302 = 1;

	@ObfuscatedName("client.ag")
	public int[] field1303 = new int[5];

	@ObfuscatedName("client.bg")
	public int field1304 = -1;

	@ObfuscatedName("client.cg")
	public int field1305 = 0x4D4233;

	@ObfuscatedName("client.hg")
	public boolean field1310 = false;

	@ObfuscatedName("client.kg")
	public int[] field1313 = new int[151];

	@ObfuscatedName("client.pg")
	public boolean field1317 = false;

	@ObfuscatedName("client.qg")
	public boolean field1318 = false;

	@ObfuscatedName("client.sg")
	public boolean field1320 = false;

	@ObfuscatedName("client.vg")
	public class35[] field1323 = new class35[20];

	@ObfuscatedName("client.Lg")
	public int field1338 = 0x332D25;

	@ObfuscatedName("client.Mg")
	public class36[] field1339 = new class36[2];

	@ObfuscatedName("client.Ng")
	public boolean field1340 = false;

	@ObfuscatedName("client.Og")
	public String[] field1341 = new String[200];

	@ObfuscatedName("client.Qg")
	public boolean field1343 = false;

	@ObfuscatedName("client.Rg")
	public String field1344 = "";

	@ObfuscatedName("client.oh")
	public boolean field1367 = true;

	@ObfuscatedName("client.zh")
	public String[] field1376 = new String[5];

	@ObfuscatedName("client.Ah")
	public boolean[] field1377 = new boolean[5];

	@ObfuscatedName("client.Dh")
	public int[] field1378 = new int[5];

	@ObfuscatedName("client.Kh")
	public boolean field1385 = false;

	@ObfuscatedName("client.Ph")
	public int[] field1389 = new int[2000];

	@ObfuscatedName("client.Qh")
	public boolean field1390 = false;

	@ObfuscatedName("client.Rh")
	public class38 field1391 = class38.method213(1);

	@ObfuscatedName("client.Xh")
	public int[] field1397 = new int[2000];

	@ObfuscatedName("client.Yh")
	public class48[] field1398 = new class48[5];

	@ObfuscatedName("client.Zh")
	public class35[] field1399 = new class35[100];

	@ObfuscatedName("client.ai")
	public int field1400 = 128;

	@ObfuscatedName("client.fi")
	public int[] field1405 = new int[1000];

	@ObfuscatedName("client.ii")
	public boolean field1408 = false;

	@ObfuscatedName("client.ji")
	public String field1409 = "";

	@ObfuscatedName("client.ki")
	public String field1410 = "";

	@ObfuscatedName("client.li")
	public int field1411 = -1;

	@ObfuscatedName("client.mi")
	public int field1412 = -1;

	@ObfuscatedName("client.ni")
	public int field1413 = -1;

	@ObfuscatedName("client.oi")
	public boolean field1414 = false;

	@ObfuscatedName("client.pi")
	public class26[] field1415 = new class26[16384];

	@ObfuscatedName("client.ri")
	public int[] field1417 = new int[16384];

	@ObfuscatedName("client.si")
	public int[] field1418 = new int[500];

	@ObfuscatedName("client.ti")
	public int[] field1419 = new int[500];

	@ObfuscatedName("client.ui")
	public int[] field1420 = new int[500];

	@ObfuscatedName("client.vi")
	public int[] field1421 = new int[500];

	@ObfuscatedName("client.wi")
	public int[] field1422 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.xi")
	public class41 field1423 = new class41();

	@ObfuscatedName("client.zi")
	public int[] field1425 = new int[5];

	@ObfuscatedName("client.Ai")
	public boolean[] field1426 = new boolean[5];

	@ObfuscatedName("client.Bi")
	public final int field1427 = 100;

	@ObfuscatedName("client.Ci")
	public int[] field1428 = new int[100];

	@ObfuscatedName("client.Di")
	public int field1429 = -1;

	@ObfuscatedName("client.Ei")
	public long[] field1430 = new long[100];

	@ObfuscatedName("client.Ki")
	public boolean field1436 = true;

	@ObfuscatedName("client.Li")
	public class4 field1437 = new class4();

	@ObfuscatedName("client.Ni")
	public int[] field1439 = new int[9];

	@ObfuscatedName("client.Oi")
	public class41[][][] field1440 = new class41[4][104][104];

	@ObfuscatedName("client.Pi")
	public String field1441 = "";

	@ObfuscatedName("client.Ri")
	public class35[] field1442 = new class35[1000];

	@ObfuscatedName("client.Si")
	public int field1443 = -1;

	@ObfuscatedName("client.Wi")
	public int field1447 = -1;

	@ObfuscatedName("client.Xi")
	public int field1448 = -1;

	@ObfuscatedName("client.Yi")
	public boolean field1449 = false;

	@ObfuscatedName("client.hj")
	public boolean field1456 = false;

	@ObfuscatedName("client.nj")
	public int[] field1462 = new int[256];

	@ObfuscatedName("client.oj")
	public boolean field1463 = false;

	@ObfuscatedName("client.pj")
	public int[] field1464 = new int[200];

	@ObfuscatedName("client.qj")
	public boolean field1465 = false;

	@ObfuscatedName("client.rj")
	public int[] field1466 = new int[4000];

	@ObfuscatedName("client.sj")
	public int[] field1467 = new int[4000];

	@ObfuscatedName("client.tj")
	public int[] field1468 = new int[151];

	@ObfuscatedName("client.L")
	public static BigInteger field1051 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.S")
	public static BigInteger field1058 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Dc")
	public static int field1141 = 10;

	@ObfuscatedName("client.Fc")
	public static boolean field1143 = true;

	@ObfuscatedName("client.Bd")
	public static int[] field1183 = new int[99];

	@ObfuscatedName("client.te")
	public static final int[][] field1222 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Qe")
	public static final int[] field1245 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.wg")
	public static String field1324 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.kj")
	public static int[] field1459 = new int[32];

	@ObfuscatedName("client.K")
	public int field1050;

	@ObfuscatedName("client.M")
	public int field1052;

	@ObfuscatedName("client.P")
	public int field1055;

	@ObfuscatedName("client.W")
	public static int field1061;

	@ObfuscatedName("client.X")
	public static int field1062;

	@ObfuscatedName("client.Y")
	public int field1063;

	@ObfuscatedName("client.Db")
	public int field1091;

	@ObfuscatedName("client.Hb")
	public static int field1095;

	@ObfuscatedName("client.Kb")
	public int field1098;

	@ObfuscatedName("client.Rb")
	public int field1104;

	@ObfuscatedName("client.Sb")
	public int field1105;

	@ObfuscatedName("client.Tb")
	public int field1106;

	@ObfuscatedName("client.Ub")
	public int field1107;

	@ObfuscatedName("client.Vb")
	public static int field1108;

	@ObfuscatedName("client.Yb")
	public int field1111;

	@ObfuscatedName("client.Zb")
	public int field1112;

	@ObfuscatedName("client.uc")
	public static int field1132;

	@ObfuscatedName("client.vc")
	public int field1133;

	@ObfuscatedName("client.wc")
	public int field1134;

	@ObfuscatedName("client.xc")
	public int field1135;

	@ObfuscatedName("client.yc")
	public int field1136;

	@ObfuscatedName("client.zc")
	public int field1137;

	@ObfuscatedName("client.Ac")
	public int field1138;

	@ObfuscatedName("client.Cc")
	public int field1140;

	@ObfuscatedName("client.Ec")
	public static int field1142;

	@ObfuscatedName("client.Hc")
	public int field1145;

	@ObfuscatedName("client.Ic")
	public static int field1146;

	@ObfuscatedName("client.Jc")
	public int field1147;

	@ObfuscatedName("client.Kc")
	public int field1148;

	@ObfuscatedName("client.Mc")
	public int field1149;

	@ObfuscatedName("client.Pc")
	public int field1151;

	@ObfuscatedName("client.Qc")
	public int field1152;

	@ObfuscatedName("client.Rc")
	public int field1153;

	@ObfuscatedName("client.Sc")
	public int field1154;

	@ObfuscatedName("client.Vc")
	public int field1155;

	@ObfuscatedName("client.Xc")
	public int field1157;

	@ObfuscatedName("client.Yc")
	public int field1158;

	@ObfuscatedName("client.bd")
	public static int field1160;

	@ObfuscatedName("client.hd")
	public int field1165;

	@ObfuscatedName("client.jd")
	public int field1167;

	@ObfuscatedName("client.ud")
	public int field1176;

	@ObfuscatedName("client.wd")
	public int field1178;

	@ObfuscatedName("client.zd")
	public int field1181;

	@ObfuscatedName("client.Ad")
	public static int field1182;

	@ObfuscatedName("client.Ed")
	public int field1186;

	@ObfuscatedName("client.Fd")
	public int field1187;

	@ObfuscatedName("client.Gd")
	public int field1188;

	@ObfuscatedName("client.Hd")
	public int field1189;

	@ObfuscatedName("client.Nd")
	public int field1195;

	@ObfuscatedName("client.Od")
	public int field1196;

	@ObfuscatedName("client.Pd")
	public int field1197;

	@ObfuscatedName("client.Xd")
	public int field1203;

	@ObfuscatedName("client.je")
	public static int field1214;

	@ObfuscatedName("client.ke")
	public int field1215;

	@ObfuscatedName("client.le")
	public int field1216;

	@ObfuscatedName("client.me")
	public int field1217;

	@ObfuscatedName("client.ue")
	public int field1223;

	@ObfuscatedName("client.xe")
	public int field1226;

	@ObfuscatedName("client.ye")
	public int field1227;

	@ObfuscatedName("client.ze")
	public int field1228;

	@ObfuscatedName("client.Ae")
	public static int field1229;

	@ObfuscatedName("client.De")
	public int field1232;

	@ObfuscatedName("client.Ee")
	public int field1233;

	@ObfuscatedName("client.Fe")
	public int field1234;

	@ObfuscatedName("client.Ge")
	public int field1235;

	@ObfuscatedName("client.He")
	public int field1236;

	@ObfuscatedName("client.Ie")
	public int field1237;

	@ObfuscatedName("client.Ke")
	public int field1239;

	@ObfuscatedName("client.Le")
	public int field1240;

	@ObfuscatedName("client.Me")
	public int field1241;

	@ObfuscatedName("client.Ne")
	public int field1242;

	@ObfuscatedName("client.Oe")
	public int field1243;

	@ObfuscatedName("client.Re")
	public static int field1246;

	@ObfuscatedName("client.Se")
	public int field1247;

	@ObfuscatedName("client.df")
	public int field1258;

	@ObfuscatedName("client.ef")
	public int field1259;

	@ObfuscatedName("client.gf")
	public int field1261;

	@ObfuscatedName("client.hf")
	public int field1262;

	@ObfuscatedName("client.jf")
	public int field1263;

	@ObfuscatedName("client.kf")
	public int field1264;

	@ObfuscatedName("client.qf")
	public int field1269;

	@ObfuscatedName("client.rf")
	public int field1270;

	@ObfuscatedName("client.sf")
	public int field1271;

	@ObfuscatedName("client.tf")
	public int field1272;

	@ObfuscatedName("client.uf")
	public int field1273;

	@ObfuscatedName("client.xf")
	public int field1275;

	@ObfuscatedName("client.Af")
	public int field1278;

	@ObfuscatedName("client.Df")
	public static int field1281;

	@ObfuscatedName("client.If")
	public int field1286;

	@ObfuscatedName("client.Kf")
	public int field1288;

	@ObfuscatedName("client.Lf")
	public static int field1289;

	@ObfuscatedName("client.Of")
	public int field1292;

	@ObfuscatedName("client.Pf")
	public int field1293;

	@ObfuscatedName("client.Rf")
	public int field1295;

	@ObfuscatedName("client.Sf")
	public int field1296;

	@ObfuscatedName("client.Uf")
	public int field1298;

	@ObfuscatedName("client.Xf")
	public int field1301;

	@ObfuscatedName("client.ig")
	public int field1311;

	@ObfuscatedName("client.jg")
	public int field1312;

	@ObfuscatedName("client.rg")
	public int field1319;

	@ObfuscatedName("client.Pg")
	public int field1342;

	@ObfuscatedName("client.Sg")
	public int field1345;

	@ObfuscatedName("client.Tg")
	public int field1346;

	@ObfuscatedName("client.Ug")
	public int field1347;

	@ObfuscatedName("client.Vg")
	public int field1348;

	@ObfuscatedName("client.Wg")
	public int field1349;

	@ObfuscatedName("client.Xg")
	public int field1350;

	@ObfuscatedName("client.Yg")
	public int field1351;

	@ObfuscatedName("client.Zg")
	public static int field1352;

	@ObfuscatedName("client.fh")
	public int field1358;

	@ObfuscatedName("client.gh")
	public int field1359;

	@ObfuscatedName("client.hh")
	public int field1360;

	@ObfuscatedName("client.ih")
	public int field1361;

	@ObfuscatedName("client.jh")
	public int field1362;

	@ObfuscatedName("client.lh")
	public int field1364;

	@ObfuscatedName("client.mh")
	public int field1365;

	@ObfuscatedName("client.rh")
	public static int field1370;

	@ObfuscatedName("client.th")
	public int field1371;

	@ObfuscatedName("client.vh")
	public int field1372;

	@ObfuscatedName("client.Eh")
	public int field1379;

	@ObfuscatedName("client.Fh")
	public int field1380;

	@ObfuscatedName("client.Gh")
	public int field1381;

	@ObfuscatedName("client.Hh")
	public int field1382;

	@ObfuscatedName("client.Ih")
	public int field1383;

	@ObfuscatedName("client.Jh")
	public int field1384;

	@ObfuscatedName("client.Oh")
	public int field1388;

	@ObfuscatedName("client.Vh")
	public int field1395;

	@ObfuscatedName("client.bi")
	public int field1401;

	@ObfuscatedName("client.ci")
	public int field1402;

	@ObfuscatedName("client.di")
	public int field1403;

	@ObfuscatedName("client.ei")
	public int field1404;

	@ObfuscatedName("client.gi")
	public int field1406;

	@ObfuscatedName("client.hi")
	public int field1407;

	@ObfuscatedName("client.qi")
	public int field1416;

	@ObfuscatedName("client.yi")
	public static int field1424;

	@ObfuscatedName("client.Fi")
	public int field1431;

	@ObfuscatedName("client.Gi")
	public int field1432;

	@ObfuscatedName("client.Hi")
	public int field1433;

	@ObfuscatedName("client.Ii")
	public int field1434;

	@ObfuscatedName("client.Ji")
	public int field1435;

	@ObfuscatedName("client.Mi")
	public int field1438;

	@ObfuscatedName("client.Ti")
	public int field1444;

	@ObfuscatedName("client.Ui")
	public int field1445;

	@ObfuscatedName("client.Vi")
	public int field1446;

	@ObfuscatedName("client.Zi")
	public int field1450;

	@ObfuscatedName("client.aj")
	public int field1451;

	@ObfuscatedName("client.ij")
	public int field1457;

	@ObfuscatedName("client.jj")
	public static int field1458;

	@ObfuscatedName("client.lj")
	public int field1460;

	@ObfuscatedName("client.bf")
	public long field1256;

	@ObfuscatedName("client.pf")
	public long field1268;

	@ObfuscatedName("client.nh")
	public long field1366;

	@ObfuscatedName("client.mj")
	public long field1461;

	@ObfuscatedName("client.ah")
	public class18 field1353;

	@ObfuscatedName("client.Zc")
	public class35 field1159;

	@ObfuscatedName("client.eg")
	public class35 field1307;

	@ObfuscatedName("client.fg")
	public class35 field1308;

	@ObfuscatedName("client.tg")
	public class35 field1321;

	@ObfuscatedName("client.ug")
	public class35 field1322;

	@ObfuscatedName("client.Mh")
	public class35 field1386;

	@ObfuscatedName("client.Nh")
	public class35 field1387;

	@ObfuscatedName("client.Wh")
	public class35 field1396;

	@ObfuscatedName("client.Pb")
	public class36 field1102;

	@ObfuscatedName("client.Qb")
	public class36 field1103;

	@ObfuscatedName("client.Id")
	public class36 field1190;

	@ObfuscatedName("client.Jd")
	public class36 field1191;

	@ObfuscatedName("client.Kd")
	public class36 field1192;

	@ObfuscatedName("client.Ld")
	public class36 field1193;

	@ObfuscatedName("client.Md")
	public class36 field1194;

	@ObfuscatedName("client.Yd")
	public class36 field1204;

	@ObfuscatedName("client.Zd")
	public class36 field1205;

	@ObfuscatedName("client.ae")
	public class36 field1206;

	@ObfuscatedName("client.de")
	public class36 field1208;

	@ObfuscatedName("client.ee")
	public class36 field1209;

	@ObfuscatedName("client.fe")
	public class36 field1210;

	@ObfuscatedName("client.ge")
	public class36 field1211;

	@ObfuscatedName("client.he")
	public class36 field1212;

	@ObfuscatedName("client.bh")
	public class36 field1354;

	@ObfuscatedName("client.ch")
	public class36 field1355;

	@ObfuscatedName("client.dh")
	public class36 field1356;

	@ObfuscatedName("client.ph")
	public class36 field1368;

	@ObfuscatedName("client.qh")
	public class36 field1369;

	@ObfuscatedName("client.dj")
	public class37 field1452;

	@ObfuscatedName("client.ej")
	public class37 field1453;

	@ObfuscatedName("client.fj")
	public class37 field1454;

	@ObfuscatedName("client.gj")
	public class37 field1455;

	@ObfuscatedName("client.Ab")
	public class43 field1089;

	@ObfuscatedName("client.Bb")
	public class43 field1090;

	@ObfuscatedName("client.lg")
	public class43 field1314;

	@ObfuscatedName("client.mg")
	public class43 field1315;

	@ObfuscatedName("client.ng")
	public class43 field1316;

	@ObfuscatedName("client.xg")
	public class43 field1325;

	@ObfuscatedName("client.yg")
	public class43 field1326;

	@ObfuscatedName("client.zg")
	public class43 field1327;

	@ObfuscatedName("client.Ag")
	public class43 field1328;

	@ObfuscatedName("client.Bg")
	public class43 field1329;

	@ObfuscatedName("client.Cg")
	public class43 field1330;

	@ObfuscatedName("client.Dg")
	public class43 field1331;

	@ObfuscatedName("client.Eg")
	public class43 field1332;

	@ObfuscatedName("client.Fg")
	public class43 field1333;

	@ObfuscatedName("client.Gg")
	public class43 field1334;

	@ObfuscatedName("client.Hg")
	public class43 field1335;

	@ObfuscatedName("client.Ig")
	public class43 field1336;

	@ObfuscatedName("client.Jg")
	public class43 field1337;

	@ObfuscatedName("client.Bf")
	public class47 field1279;

	@ObfuscatedName("client.Ud")
	public class49 field1201;

	@ObfuscatedName("client.eh")
	public class50 field1357;

	@ObfuscatedName("client.Xb")
	public class58 field1110;

	@ObfuscatedName("client.se")
	public class5 field1221;

	@ObfuscatedName("client.Qd")
	public String field1198;

	@ObfuscatedName("client.Be")
	public String field1230;

	@ObfuscatedName("client.lf")
	public String field1265;

	@ObfuscatedName("client.yf")
	public String field1276;

	@ObfuscatedName("client.id")
	public Socket field1166;

	@ObfuscatedName("client.V")
	public static boolean field1060;

	@ObfuscatedName("client.Gc")
	public static boolean field1144;

	@ObfuscatedName("client.qd")
	public static boolean field1172;

	@ObfuscatedName("client.Ib")
	public int[] field1096;

	@ObfuscatedName("client.Jb")
	public int[] field1097;

	@ObfuscatedName("client.fd")
	public int[] field1163;

	@ObfuscatedName("client.gd")
	public int[] field1164;

	@ObfuscatedName("client.Ve")
	public int[] field1250;

	@ObfuscatedName("client.We")
	public int[] field1251;

	@ObfuscatedName("client.Xe")
	public int[] field1252;

	@ObfuscatedName("client.Ye")
	public int[] field1253;

	@ObfuscatedName("client.wh")
	public int[] field1373;

	@ObfuscatedName("client.xh")
	public int[] field1374;

	@ObfuscatedName("client.yh")
	public int[] field1375;

	@ObfuscatedName("client.Sh")
	public int[] field1392;

	@ObfuscatedName("client.Th")
	public int[] field1393;

	@ObfuscatedName("client.Uh")
	public int[] field1394;

	@ObfuscatedName("client.dg")
	public class36[] field1306;

	@ObfuscatedName("client.zf")
	public byte[][] field1277;

	@ObfuscatedName("client.kh")
	public byte[][] field1363;

	@ObfuscatedName("client.Pe")
	public byte[][][] field1244;

	@ObfuscatedName("client.gg")
	public int[][][] field1309;

	@ObfuscatedName("client.a(ZIIIIIILd;B)V")
	public final void method423(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class4 arg7) {
		if (field1075) {
			field1140 = 32;
		} else {
			field1140 = 0;
		}

		field1075 = false;
		if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
			arg7.field76 -= field1311 * 4;

			if (arg0) {
				field1385 = true;
				return;
			}
		} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 + arg3 - 16 && arg6 < arg1 + arg3) {
			arg7.field76 += field1311 * 4;

			if (arg0) {
				field1385 = true;
				return;
			}
		} else if (arg2 >= arg4 - field1140 && arg2 < arg4 + field1140 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg3 - 16 && field1311 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg1 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg7.field76 = (arg5 - arg3) * var10 / var11;

			if (arg0) {
				field1385 = true;
			}

			field1075 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(ILd;)V")
	public final void method424(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1081 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1081 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1081 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1080;
				if (field1081 != 2) {
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
			int var4 = field1080;
			if (field1081 != 2) {
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
				if (field1464[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1464[var2] == field1141) {
					arg0.field97 = "@gre@World-" + (field1464[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1464[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1080;
			if (field1081 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field1081 == 0) {
				arg0.field97 = "Loading ignore list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1081 == 0) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var6 = field1148;
				if (field1081 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field97 = "";
					arg0.field64 = 0;
				} else {
					arg0.field97 = class51.method300(class51.method297(field1430[var2]));
					arg0.field64 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field75 = field1148 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1160 / 40.0D) * 256.0D) & 0x7FF;

			if (field1463) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field1109[var7];
					if (var8 >= 0 && !class64.field965[var8].method371()) {
						return;
					}
				}

				field1463 = false;
				class31[] var9 = new class31[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field1109[var11];
					if (var12 >= 0) {
						var9[var10++] = class64.field965[var12].method372();
					}
				}

				class31 var13 = new class31(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field1130[var14] != 0) {
						var13.method139(field1222[var14][0], field1222[var14][field1130[var14]]);

						if (var14 == 1) {
							var13.method139(field1245[0], field1245[field1130[var14]]);
						}
					}
				}

				var13.method132();
				var13.method133(class66.field985[field1114.field365].field987[0]);
				var13.method142(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field1321 == null) {
				field1321 = arg0.field103;
				field1322 = arg0.field104;
			}

			if (field1282) {
				arg0.field103 = field1322;
			} else {
				arg0.field103 = field1321;
			}
		} else if (var2 == 325) {
			if (field1321 == null) {
				field1321 = arg0.field103;
				field1322 = arg0.field104;
			}

			if (field1282) {
				arg0.field103 = field1321;
			} else {
				arg0.field103 = field1322;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1171;
			if (field1160 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1278 < 1) {
				arg0.field97 = "";
			} else if (field1456) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1050 == 0) {
				arg0.field97 = "";
			} else {
				String var15;
				if (field1223 == 0) {
					var15 = "earlier today";
				} else if (field1223 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field1223 + " days ago";
				}

				arg0.field97 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1288 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1288 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1288 > 1) {
				arg0.field97 = field1288 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1116 == 201) {
				if (field1438 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1116 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field1116 == 0) {
					var16 = "Earlier today";
				} else if (field1116 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field1116 + " days ago";
				}

				arg0.field97 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1116 == 201) {
				if (field1438 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1116 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1116 == 201) {
				if (field1438 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1116 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean method425(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method540(arg0, var2);
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

	@ObfuscatedName("client.b(Z)V")
	public final void method426() {
		if (field1165 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1401 + field1293 & 0x7FF;
				int var4 = class34.field578[var3];
				int var5 = class34.field579[var3];
				var4 = (field1155 + 256) * var4 >> 8;
				var5 = (field1155 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1114.field360 + var6 >> 7;
				int var9 = field1114.field361 - var7 >> 7;
				boolean var10 = method508(true, 0, field1114.field411[0], 0, field1114.field410[0], 0, var8, 0, var9, 0, 1);
				if (var10) {
					field1266.method215(var1);
					field1266.method215(var2);
					field1266.method216(field1401);
					field1266.method215(57);
					field1266.method215(field1293);
					field1266.method215(field1155);
					field1266.method215(89);
					field1266.method216(field1114.field360);
					field1266.method216(field1114.field361);
					field1266.method215(field1345);
					field1266.method215(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method427() {
		field1370++;
		if (field1370 > 192) {
			field1370 = 0;
			field1266.method214(230);
			field1266.method215(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method5();
					if (var1 == -1) {
						return;
					}

					if (field1429 != -1 && field1443 == field1429) {
						break;
					}

					if (field1056) {
						if (var1 >= 32 && var1 <= 122 && field1059.length() < 80) {
							field1059 = field1059 + (char) var1;
							field1213 = true;
						}

						if (var1 == 8 && field1059.length() > 0) {
							field1059 = field1059.substring(0, field1059.length() - 1);
							field1213 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field1056 = false;
							field1213 = true;

							if (field1129 == 1) {
								long var2 = class51.method296(field1059);
								method443(var2);
							}

							if (field1129 == 2 && field1080 > 0) {
								long var4 = class51.method296(field1059);
								method448(var4);
							}

							if (field1129 == 3 && field1059.length() > 0) {
								field1266.method214(139);
								field1266.method215(0);
								int var6 = field1266.field617;
								field1266.method221(field1268);
								class52.method304(field1059, field1266);
								field1266.method224(field1266.field617 - var6);
								field1059 = class51.method301(field1059);
								field1059 = class71.method395(field1059);
								method544(class51.method300(class51.method297(field1268)), field1059, 6);

								if (field1346 == 2) {
									field1346 = 1;
									field1126 = true;
									field1266.method214(154);
									field1266.method215(field1460);
									field1266.method215(field1346);
									field1266.method215(field1105);
								}
							}

							if (field1129 == 4 && field1148 < 100) {
								long var7 = class51.method296(field1059);
								method543(var7);
							}

							if (field1129 == 5 && field1148 > 0) {
								long var9 = class51.method296(field1059);
								method531(var9);
							}
						}
					} else if (field1449) {
						if (var1 >= 48 && var1 <= 57 && field1049.length() < 10) {
							field1049 = field1049 + (char) var1;
							field1213 = true;
						}

						if (var1 == 8 && field1049.length() > 0) {
							field1049 = field1049.substring(0, field1049.length() - 1);
							field1213 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field1049.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field1049);
								} catch (Exception var16) {
								}

								field1266.method214(102);
								field1266.method219(var11);
							}

							field1449 = false;
							field1213 = true;
						}
					} else if (field1413 == -1) {
						if (var1 >= 32 && var1 <= 122 && field1441.length() < 80) {
							field1441 = field1441 + (char) var1;
							field1213 = true;
						}

						if (var1 == 8 && field1441.length() > 0) {
							field1441 = field1441.substring(0, field1441.length() - 1);
							field1213 = true;
						}

						if ((var1 == 13 || var1 == 10) && field1441.length() > 0) {
							if (field1278 == 2) {
								if (field1441.equals("::clientdrop")) {
									method510();
								}

								if (field1441.equals("::lag")) {
									method435();
								}

								if (field1441.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field1279.method268(2); var12++) {
										field1279.method278(var12, (byte) 1, 2);
									}
								}
							}

							if (field1441.startsWith("::")) {
								field1266.method214(224);
								field1266.method215(field1441.length() - 1);
								field1266.method222(field1441.substring(2));
							} else {
								byte var13 = 0;
								if (field1441.startsWith("yellow:")) {
									var13 = 0;
									field1441 = field1441.substring(7);
								}

								if (field1441.startsWith("red:")) {
									var13 = 1;
									field1441 = field1441.substring(4);
								}

								if (field1441.startsWith("green:")) {
									var13 = 2;
									field1441 = field1441.substring(6);
								}

								if (field1441.startsWith("cyan:")) {
									var13 = 3;
									field1441 = field1441.substring(5);
								}

								if (field1441.startsWith("purple:")) {
									var13 = 4;
									field1441 = field1441.substring(7);
								}

								if (field1441.startsWith("white:")) {
									var13 = 5;
									field1441 = field1441.substring(6);
								}

								if (field1441.startsWith("flash1:")) {
									var13 = 6;
									field1441 = field1441.substring(7);
								}

								if (field1441.startsWith("flash2:")) {
									var13 = 7;
									field1441 = field1441.substring(7);
								}

								if (field1441.startsWith("flash3:")) {
									var13 = 8;
									field1441 = field1441.substring(7);
								}

								if (field1441.startsWith("glow1:")) {
									var13 = 9;
									field1441 = field1441.substring(6);
								}

								if (field1441.startsWith("glow2:")) {
									var13 = 10;
									field1441 = field1441.substring(6);
								}

								if (field1441.startsWith("glow3:")) {
									var13 = 11;
									field1441 = field1441.substring(6);
								}

								byte var14 = 0;
								if (field1441.startsWith("wave:")) {
									var14 = 1;
									field1441 = field1441.substring(5);
								}

								if (field1441.startsWith("scroll:")) {
									var14 = 2;
									field1441 = field1441.substring(7);
								}

								field1266.method214(253);
								field1266.method215(0);
								int var15 = field1266.field617;
								field1266.method215(var13);
								field1266.method215(var14);
								class52.method304(field1441, field1266);
								field1266.method224(field1266.field617 - var15);
								field1441 = class51.method301(field1441);
								field1441 = class71.method395(field1441);
								field1114.field372 = field1441;
								field1114.field374 = var13;
								field1114.field375 = var14;
								field1114.field373 = 150;

								if (field1278 == 2) {
									method544("@cr2@" + field1114.field416, field1114.field372, 2);
								} else if (field1278 == 1) {
									method544("@cr1@" + field1114.field416, field1114.field372, 2);
								} else {
									method544(field1114.field416, field1114.field372, 2);
								}

								if (field1460 == 2) {
									field1460 = 3;
									field1126 = true;
									field1266.method214(154);
									field1266.method215(field1460);
									field1266.method215(field1346);
									field1266.method215(field1105);
								}
							}

							field1441 = "";
							field1213 = true;
						}
					}
				}

				if (var1 == 8 && field1171.length() > 0) {
					field1171 = field1171.substring(0, field1171.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field1171.length() < 12) {
				field1171 = field1171 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(I[BZ)V")
	public final void method428(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void method429(int arg0, class38 arg1) {
		while (arg1.field618 + 10 < arg0 * 8) {
			int var3 = arg1.method236(11);
			if (var3 == 2047) {
				break;
			}

			if (field1175[var3] == null) {
				field1175[var3] = new class27();
				if (field1180[var3] != null) {
					field1175[var3].method116(field1180[var3]);
				}
			}

			field1177[field1176++] = var3;
			class27 var4 = field1175[var3];
			var4.field405 = field1160;
			int var5 = arg1.method236(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method236(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method236(1);
			var4.method110(field1114.field410[0] + var5, var7 == 1, field1114.field411[0] + var6);
			int var8 = arg1.method236(1);
			if (var8 == 1) {
				field1179[field1178++] = var3;
			}
		}

		arg1.method237();
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method430(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1080; var2++) {
			if (arg0.equalsIgnoreCase(field1341[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1114.field416)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class40 var10 = null;
		for (class40 var11 = (class40) field1423.method244(); var11 != null; var11 = (class40) field1423.method246()) {
			if (var11.field634 == arg5 && var11.field636 == arg4 && var11.field637 == arg7 && var11.field635 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class40();
			var10.field634 = arg5;
			var10.field635 = arg6;
			var10.field636 = arg4;
			var10.field637 = arg7;
			method516(var10);
			field1423.method241(var10);
		}

		var10.field641 = arg8;
		var10.field643 = arg3;
		var10.field642 = arg2;
		var10.field644 = arg1;
		var10.field645 = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method432(String arg0) throws IOException {
		if (field1139) {
			if (field1166 != null) {
				try {
					field1166.close();
				} catch (Exception var4) {
				}

				field1166 = null;
			}

			field1166 = method512(43595);
			field1166.setSoTimeout(10000);
			InputStream var2 = field1166.getInputStream();
			OutputStream var3 = field1166.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method433() {
		field1326.method254();

		if (field1165 == 2) {
			byte[] var1 = field1205.field599;
			int[] var2 = class33.field559;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field1159.method189(33, 25, field1170, 25, field1219, 0, 33, 256, 0, field1401);
			field1327.method254();
		} else {
			int var5 = field1401 + field1293 & 0x7FF;
			int var6 = field1114.field360 / 32 + 48;
			int var7 = 464 - field1114.field361 / 32;
			field1113.method189(146, var6, field1313, var7, field1468, 5, 151, field1155 + 256, 25, var5);
			field1159.method189(33, 25, field1170, 25, field1219, 0, 33, 256, 0, field1401);

			for (int var8 = 0; var8 < field1298; var8++) {
				int var9 = field1299[var8] * 4 + 2 - field1114.field360 / 32;
				int var10 = field1300[var8] * 4 + 2 - field1114.field361 / 32;
				method553(field1442[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class41 var13 = field1440[field1138][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field1114.field360 / 32;
						int var15 = var12 * 4 + 2 - field1114.field361 / 32;
						method553(field1118, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field1416; var16++) {
				class26 var17 = field1415[field1417[var16]];
				if (var17 != null && var17.method113() && var17.field415.field886) {
					int var18 = var17.field360 / 32 - field1114.field360 / 32;
					int var19 = var17.field361 / 32 - field1114.field361 / 32;
					method553(field1119, var18, var19);
				}
			}

			for (int var20 = 0; var20 < field1176; var20++) {
				class27 var21 = field1175[field1177[var20]];
				if (var21 != null && var21.method113()) {
					int var22 = var21.field360 / 32 - field1114.field360 / 32;
					int var23 = var21.field361 / 32 - field1114.field361 / 32;
					boolean var24 = false;
					long var25 = class51.method296(var21.field416);
					for (int var27 = 0; var27 < field1080; var27++) {
						if (field1225[var27] == var25 && field1464[var27] != 0) {
							var24 = true;
							break;
						}
					}

					if (field1114.field439 != 0 && var21.field439 != 0) {
						if (field1114.field439 == var21.field439) {
							var24 = true;
						} else {
							var24 = false;
						}
					}

					if (var24) {
						method553(field1121, var22, var23);
					} else {
						method553(field1120, var22, var23);
					}
				}
			}

			if (field1226 != 0 && field1160 % 20 < 10) {
				if (field1226 == 1 && field1145 >= 0 && field1145 < field1415.length) {
					class26 var28 = field1415[field1145];
					if (var28 != null) {
						int var29 = var28.field360 / 32 - field1114.field360 / 32;
						int var30 = var28.field361 / 32 - field1114.field361 / 32;
						method514(var30, field1387, var29);
					}
				}

				if (field1226 == 2) {
					int var31 = (field1133 - field1186) * 4 + 2 - field1114.field360 / 32;
					int var32 = (field1134 - field1187) * 4 + 2 - field1114.field361 / 32;
					method514(var32, field1387, var31);
				}

				if (field1226 == 10 && field1457 >= 0 && field1457 < field1175.length) {
					class27 var33 = field1175[field1457];
					if (var33 != null) {
						int var34 = var33.field360 / 32 - field1114.field360 / 32;
						int var35 = var33.field361 / 32 - field1114.field361 / 32;
						method514(var35, field1387, var34);
					}
				}
			}

			if (field1111 != 0) {
				int var36 = field1111 * 4 + 2 - field1114.field360 / 32;
				int var37 = field1112 * 4 + 2 - field1114.field361 / 32;
				method553(field1386, var36, var37);
			}

			class33.method156(97, 0xFFFFFF, 3, 3, 78);
			field1327.method254();
		}
	}

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public final String method434() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(B)V")
	public void method435() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1228);

		if (field1279 != null) {
			System.out.println("Od-cycle:" + field1279.field743);
		}

		System.out.println("loop-cycle:" + field1160);
		System.out.println("draw-cycle:" + field1146);
		System.out.println("ptype:" + field1233);
		System.out.println("psize:" + field1232);

		if (field1221 != null) {
			field1221.method43();
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

	@ObfuscatedName("client.h(I)V")
	public final void method436() {
		if (field1128 != 0) {
			int var1 = 0;
			if (field1444 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1285[var2] != null) {
					int var3 = field1283[var2];
					String var4 = field1284[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1346 == 0 || field1346 == 1 && method430(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1453.method202("From:  " + var4 + field1285[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1278 >= 1) {
									field1224[field1091] = "Report abuse @whi@" + var4;
									field1420[field1091] = 2524;
									field1091++;
								}

								field1224[field1091] = "Add ignore @whi@" + var4;
								field1420[field1091] = 2047;
								field1091++;
								field1224[field1091] = "Add friend @whi@" + var4;
								field1420[field1091] = 2605;
								field1091++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1346 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method437(int arg0) {
		int var2 = class70.field1028[arg0].field1036;
		if (var2 != 0) {
			int var3 = field1389[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class34.method172(0.9D);
				}

				if (var3 == 2) {
					class34.method172(0.8D);
				}

				if (var3 == 3) {
					class34.method172(0.7D);
				}

				if (var3 == 4) {
					class34.method172(0.6D);
				}

				class60.field943.method103();
				field1343 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1094;

				if (var3 == 0) {
					method524(0, field1094);
					field1094 = true;
				}

				if (var3 == 1) {
					method524(-400, field1094);
					field1094 = true;
				}

				if (var3 == 2) {
					method524(-800, field1094);
					field1094 = true;
				}

				if (var3 == 3) {
					method524(-1200, field1094);
					field1094 = true;
				}

				if (var3 == 4) {
					field1094 = false;
				}

				if (field1094 != var4 && !field1144) {
					if (field1094) {
						field1435 = field1125;
						field1436 = true;
						field1279.method275(2, field1435);
					} else {
						method460();
					}

					field1052 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1367 = true;
					method534(0);
				}

				if (var3 == 1) {
					field1367 = true;
					method534(-400);
				}

				if (var3 == 2) {
					field1367 = true;
					method534(-800);
				}

				if (var3 == 3) {
					field1367 = true;
					method534(-1200);
				}

				if (var3 == 4) {
					field1367 = false;
				}
			}

			if (var2 == 5) {
				field1388 = var3;
			}

			if (var2 == 6) {
				field1395 = var3;
			}

			if (var2 == 8) {
				field1128 = var3;
				field1213 = true;
			}

			if (var2 == 9) {
				field1258 = var3;
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method438() {
		if (field1329 == null) {
			field10 = null;
			field1328 = null;
			field1326 = null;
			field1325 = null;
			field1327 = null;
			field1314 = null;
			field1315 = null;
			field1316 = null;
			field1332 = new class43(265, 128, method11());
			class33.method154();
			field1333 = new class43(265, 128, method11());
			class33.method154();
			field1329 = new class43(171, 509, method11());
			class33.method154();
			field1330 = new class43(132, 360, method11());
			class33.method154();
			field1331 = new class43(200, 360, method11());
			class33.method154();
			field1334 = new class43(238, 202, method11());
			class33.method154();
			field1335 = new class43(238, 203, method11());
			class33.method154();
			field1336 = new class43(94, 74, method11());
			class33.method154();
			field1337 = new class43(94, 75, method11());
			class33.method154();

			if (field1357 != null) {
				method526();
				method507();
			}

			field1343 = true;
		}
	}

	@ObfuscatedName("client.a(BILlb;)V")
	public final void method439(int arg0, class38 arg1) {
		while (arg1.field618 + 21 < arg0 * 8) {
			int var3 = arg1.method236(14);
			if (var3 == 16383) {
				break;
			}

			if (field1415[var3] == null) {
				field1415[var3] = new class26();
			}

			class26 var4 = field1415[var3];
			field1417[field1416++] = var3;
			var4.field405 = field1160;
			var4.field415 = class59.method336(arg1.method236(11));
			var4.field364 = var4.field415.field872;
			var4.field408 = var4.field415.field894;
			var4.field367 = var4.field415.field876;
			var4.field368 = var4.field415.field877;
			var4.field369 = var4.field415.field878;
			var4.field370 = var4.field415.field879;
			var4.field365 = var4.field415.field875;
			int var5 = arg1.method236(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method236(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method236(1);
			var4.method110(field1114.field410[0] + var5, var7 == 1, field1114.field411[0] + var6);
			int var8 = arg1.method236(1);
			if (var8 == 1) {
				field1179[field1178++] = var3;
			}
		}

		arg1.method237();
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method440() {
		if (field1128 != 0) {
			class37 var1 = field1453;
			int var2 = 0;
			if (field1444 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1285[var3] != null) {
					int var4 = field1283[var3];
					String var5 = field1284[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1346 == 0 || field1346 == 1 && method430(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method204(var8, "From", var7, 0);
						var1.method204(var8, "From", var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method202("From ");
						if (var6 == 1) {
							field1339[0].method198(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field1339[1].method198(var11, var7 - 12);
							var11 += 14;
						}

						var1.method204(var11, var5 + ": " + field1285[var3], var7, 0);
						var1.method204(var11, var5 + ": " + field1285[var3], var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1346 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method204(4, field1285[var3], var9, 0);
						var1.method204(4, field1285[var3], var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1346 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method204(4, "To " + var5 + ": " + field1285[var3], var10, 0);
						var1.method204(4, "To " + var5 + ": " + field1285[var3], var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method441() {
		for (int var1 = -1; var1 < field1176; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1174;
			} else {
				var2 = field1177[var1];
			}

			class27 var3 = field1175[var2];
			if (var3 != null) {
				method450(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void method442(int arg0, class38 arg1) {
		if (arg0 == 138 || arg0 == 173) {
			int var3 = arg1.method225();
			int var4 = (var3 >> 4 & 0x7) + field1106;
			int var5 = (var3 & 0x7) + field1107;
			int var6 = arg1.method225();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1168[var7];
			int var10;
			if (arg0 == 173) {
				var10 = -1;
			} else {
				var10 = arg1.method227();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method431(-1, 0, var8, var7, var4, field1138, var9, var5, var10);
			}
		} else if (arg0 == 48) {
			int var11 = arg1.method225();
			int var12 = (var11 >> 4 & 0x7) + field1106;
			int var13 = (var11 & 0x7) + field1107;
			int var14 = arg1.method225();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1168[var15];
			int var18 = arg1.method227();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1309[field1138][var12][var13];
				int var20 = field1309[field1138][var12 + 1][var13];
				int var21 = field1309[field1138][var12 + 1][var13 + 1];
				int var22 = field1309[field1138][var12][var13 + 1];
				if (var17 == 0) {
					class17 var23 = field1353.method72(field1138, var12, var13);
					if (var23 != null) {
						int var24 = var23.field256 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field254 = new class28(2, var19, var22, var21, var20, var18, false, var16 + 4, var24);
							var23.field255 = new class28(2, var19, var22, var21, var20, var18, false, var16 + 1 & 0x3, var24);
						} else {
							var23.field254 = new class28(var15, var19, var22, var21, var20, var18, false, var16, var24);
						}
					}
				}

				if (var17 == 1) {
					class8 var25 = field1353.method73(var12, field1138, var13);
					if (var25 != null) {
						var25.field147 = new class28(4, var19, var22, var21, var20, var18, false, 0, var25.field148 >> 14 & 0x7FFF);
					}
				}

				if (var17 == 2) {
					class16 var26 = field1353.method74(var12, field1138, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field239 = new class28(var15, var19, var22, var21, var20, var18, false, var16, var26.field247 >> 14 & 0x7FFF);
					}
				}

				if (var17 == 3) {
					class10 var27 = field1353.method75(var13, var12, field1138);
					if (var27 != null) {
						var27.field178 = new class28(22, var19, var22, var21, var20, var18, false, var16, var27.field179 >> 14 & 0x7FFF);
					}
				}
			}
		} else if (arg0 == 81) {
			int var28 = arg1.method225();
			int var29 = (var28 >> 4 & 0x7) + field1106;
			int var30 = (var28 & 0x7) + field1107;
			int var31 = arg1.method227();
			int var32 = arg1.method227();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class29 var33 = new class29();
				var33.field451 = var31;
				var33.field452 = var32;

				if (field1440[field1138][var29][var30] == null) {
					field1440[field1138][var29][var30] = new class41();
				}

				field1440[field1138][var29][var30].method241(var33);
				method517(var29, var30);
			}
		} else if (arg0 == 52) {
			int var34 = arg1.method225();
			int var35 = (var34 >> 4 & 0x7) + field1106;
			int var36 = (var34 & 0x7) + field1107;
			int var37 = arg1.method227();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class41 var38 = field1440[field1138][var35][var36];
				if (var38 != null) {
					for (class29 var39 = (class29) var38.method244(); var39 != null; var39 = (class29) var38.method246()) {
						if ((var37 & 0x7FFF) == var39.field451) {
							var39.method106();
							break;
						}
					}

					if (var38.method244() == null) {
						field1440[field1138][var35][var36] = null;
					}

					method517(var35, var36);
				}
			}
		} else if (arg0 == 107) {
			int var40 = arg1.method225();
			int var41 = (var40 >> 4 & 0x7) + field1106;
			int var42 = (var40 & 0x7) + field1107;
			int var43 = var41 + arg1.method226();
			int var44 = var42 + arg1.method226();
			int var45 = arg1.method228();
			int var46 = arg1.method227();
			int var47 = arg1.method225() * 4;
			int var48 = arg1.method225() * 4;
			int var49 = arg1.method227();
			int var50 = arg1.method227();
			int var51 = arg1.method225();
			int var52 = arg1.method225();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class30 var53 = new class30(field1160 + var49, var51, var42, var48, method474(var42, var41, field1138) - var47, var52, var41, field1160 + var50, var45, var46, field1138);
				var53.method119(var44, var43, method474(var44, var43, field1138) - var48, field1160 + var49);
				field1248.method241(var53);
			}
		} else if (arg0 == 85) {
			int var54 = arg1.method225();
			int var55 = (var54 >> 4 & 0x7) + field1106;
			int var56 = (var54 & 0x7) + field1107;
			int var57 = arg1.method227();
			int var58 = arg1.method225();
			int var59 = arg1.method227();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class32 var60 = new class32(var57, field1138, var56, method474(var56, var55, field1138) - var58, field1160, var55, var59);
				field1092.method241(var60);
			}
		} else if (arg0 == 219) {
			int var61 = arg1.method225();
			int var62 = (var61 >> 4 & 0x7) + field1106;
			int var63 = (var61 & 0x7) + field1107;
			int var64 = arg1.method227();
			int var65 = arg1.method227();
			int var66 = arg1.method227();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1304 != var66) {
				class29 var67 = new class29();
				var67.field451 = var64;
				var67.field452 = var65;

				if (field1440[field1138][var62][var63] == null) {
					field1440[field1138][var62][var63] = new class41();
				}

				field1440[field1138][var62][var63].method241(var67);
				method517(var62, var63);
			}
		} else if (arg0 == 176) {
			int var68 = arg1.method225();
			int var69 = (var68 >> 4 & 0x7) + field1106;
			int var70 = (var68 & 0x7) + field1107;
			int var71 = arg1.method225();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1168[var72];
			int var75 = arg1.method227();
			int var76 = arg1.method227();
			int var77 = arg1.method227();
			int var78 = arg1.method227();
			byte var79 = arg1.method226();
			byte var80 = arg1.method226();
			byte var81 = arg1.method226();
			byte var82 = arg1.method226();
			class27 var83;
			if (field1304 == var78) {
				var83 = field1114;
			} else {
				var83 = field1175[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method326(var75);
				int var85 = field1309[field1138][var69][var70];
				int var86 = field1309[field1138][var69 + 1][var70];
				int var87 = field1309[field1138][var69 + 1][var70 + 1];
				int var88 = field1309[field1138][var69][var70 + 1];
				class31 var89 = var84.method332(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method431(var77 + 1, var76 + 1, 0, 0, var69, field1138, var74, var70, -1);
					var83.field426 = field1160 + var76;
					var83.field427 = field1160 + var77;
					var83.field431 = var89;
					int var90 = var84.field829;
					int var91 = var84.field830;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field830;
						var91 = var84.field829;
					}

					var83.field428 = var69 * 128 + var90 * 64;
					var83.field430 = var70 * 128 + var91 * 64;
					var83.field429 = method474(var83.field430, var83.field428, field1138);

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
		} else if (arg0 == 95) {
			int var94 = arg1.method225();
			int var95 = (var94 >> 4 & 0x7) + field1106;
			int var96 = (var94 & 0x7) + field1107;
			int var97 = arg1.method227();
			int var98 = arg1.method227();
			int var99 = arg1.method227();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class41 var100 = field1440[field1138][var95][var96];
				if (var100 != null) {
					for (class29 var101 = (class29) var100.method244(); var101 != null; var101 = (class29) var100.method246()) {
						if ((var97 & 0x7FFF) == var101.field451 && var101.field452 == var98) {
							var101.field452 = var99;
							break;
						}
					}

					method517(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method443(long arg0) {
		if (arg0 != 0L) {
			if (field1080 >= 100 && field1384 != 1) {
				method544("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field1080 >= 200) {
				method544("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = class51.method300(class51.method297(arg0));
				for (int var4 = 0; var4 < field1080; var4++) {
					if (field1225[var4] == arg0) {
						method544("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1148; var5++) {
					if (field1430[var5] == arg0) {
						method544("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field1114.field416)) {
					field1341[field1080] = var3;
					field1225[field1080] = arg0;
					field1464[field1080] = 0;
					field1080++;
					field1385 = true;
					field1266.method214(13);
					field1266.method221(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method444() {
		try {
			int var1 = field1114.field360 + field1098;
			int var2 = field1114.field361 + field1286;
			if (field1215 - var1 < -500 || field1215 - var1 > 500 || field1216 - var2 < -500 || field1216 - var2 > 500) {
				field1215 = var1;
				field1216 = var2;
			}

			if (field1215 != var1) {
				field1215 += (var1 - field1215) / 16;
			}

			if (field1216 != var2) {
				field1216 += (var2 - field1216) / 16;
			}

			if (field27[1] == 1) {
				field1402 += (-field1402 - 24) / 2;
			} else if (field27[2] == 1) {
				field1402 += (24 - field1402) / 2;
			} else {
				field1402 /= 2;
			}

			if (field27[3] == 1) {
				field1403 += (12 - field1403) / 2;
			} else if (field27[4] == 1) {
				field1403 += (-field1403 - 12) / 2;
			} else {
				field1403 /= 2;
			}

			field1401 = field1402 / 2 + field1401 & 0x7FF;
			field1400 += field1403 / 2;
			if (field1400 < 128) {
				field1400 = 128;
			}

			if (field1400 > 383) {
				field1400 = 383;
			}

			int var3 = field1215 >> 7;
			int var4 = field1216 >> 7;
			int var5 = method474(field1216, field1215, field1138);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1138;
						if (var9 < 3 && (field1244[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1309[var9][var7][var8];
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

			if (var11 > field1158) {
				field1158 += (var11 - field1158) / 24;
			} else if (var11 < field1158) {
				field1158 += (var11 - field1158) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1114.field360 + "," + field1114.field361 + "," + field1215 + "," + field1216 + "," + field1406 + "," + field1407 + "," + field1186 + "," + field1187);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method445() {
		if (field1226 == 2) {
			method486((field1134 - field1187 << 7) + field1137, field1135 * 2, (field1133 - field1186 << 7) + field1136);

			if (field1447 > -1 && field1160 % 20 < 10) {
				field1323[2].method185(field1447 - 12, field1448 - 28);
			}
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method446(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(Ld;IIIIZI)V")
	public final void method447(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field63 == 0 && arg0.field78 != null && !arg0.field77 && (arg2 >= arg1 && arg3 >= arg5 && arg2 <= arg0.field66 + arg1 && arg3 <= arg0.field67 + arg5)) {
			int var7 = arg0.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field79[var8] + arg1;
				int var10 = arg0.field80[var8] + arg5 - arg4;
				class4 var11 = class4.field56[arg0.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1292 = var11.field74;
					} else {
						field1292 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method447(var11, var9, arg2, arg3, var11.field76, var10);

					if (var11.field75 > var11.field67) {
						method423(true, var10, arg2, var11.field67, var11.field66 + var9, var11.field75, arg3, var11);
					}
				} else {
					if (var11.field64 == 1 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method527(var11);
						}

						if (!var12) {
							field1224[field1091] = var11.field117;
							field1420[field1091] = 231;
							field1419[field1091] = var11.field61;
							field1091++;
						}
					}

					if (var11.field64 == 2 && field1195 == 0 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1224[field1091] = var13 + " @gre@" + var11.field115;
						field1420[field1091] = 274;
						field1419[field1091] = var11.field61;
						field1091++;
					}

					if (var11.field64 == 3 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1224[field1091] = "Close";
						field1420[field1091] = 737;
						field1419[field1091] = var11.field61;
						field1091++;
					}

					if (var11.field64 == 4 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1224[field1091] = var11.field117;
						field1420[field1091] = 435;
						field1419[field1091] = var11.field61;
						field1091++;
					}

					if (var11.field64 == 5 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1224[field1091] = var11.field117;
						field1420[field1091] = 225;
						field1419[field1091] = var11.field61;
						field1091++;
					}

					if (var11.field64 == 6 && !field1320 && arg2 >= var9 && arg3 >= var10 && arg2 < var11.field66 + var9 && arg3 < var11.field67 + var10) {
						field1224[field1091] = var11.field117;
						field1420[field1091] = 997;
						field1419[field1091] = var11.field61;
						field1091++;
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

								if (arg2 >= var17 && arg3 >= var18 && arg2 < var17 + 32 && arg3 < var18 + 32) {
									field1364 = var14;
									field1365 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method342(var11.field57[var14] - 1);
										if (field1261 == 1 && var11.field84) {
											if (field1263 != var11.field61 || field1262 != var14) {
												field1224[field1091] = "Use " + field1265 + " with @lre@" + var19.field904;
												field1420[field1091] = 398;
												field1421[field1091] = var19.field902;
												field1418[field1091] = var14;
												field1419[field1091] = var11.field61;
												field1091++;
											}
										} else if (field1195 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field919 != null && var19.field919[var20] != null) {
														field1224[field1091] = var19.field919[var20] + " @lre@" + var19.field904;

														if (var20 == 3) {
															field1420[field1091] = 681;
														}

														if (var20 == 4) {
															field1420[field1091] = 100;
														}

														field1421[field1091] = var19.field902;
														field1418[field1091] = var14;
														field1419[field1091] = var11.field61;
														field1091++;
													} else if (var20 == 4) {
														field1224[field1091] = "Drop @lre@" + var19.field904;
														field1420[field1091] = 100;
														field1421[field1091] = var19.field902;
														field1418[field1091] = var14;
														field1419[field1091] = var11.field61;
														field1091++;
													}
												}
											}

											if (var11.field85) {
												field1224[field1091] = "Use @lre@" + var19.field904;
												field1420[field1091] = 102;
												field1421[field1091] = var19.field902;
												field1418[field1091] = var14;
												field1419[field1091] = var11.field61;
												field1091++;
											}

											if (var11.field84 && var19.field919 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field919[var21] != null) {
														field1224[field1091] = var19.field919[var21] + " @lre@" + var19.field904;

														if (var21 == 0) {
															field1420[field1091] = 694;
														}

														if (var21 == 1) {
															field1420[field1091] = 962;
														}

														if (var21 == 2) {
															field1420[field1091] = 795;
														}

														field1421[field1091] = var19.field902;
														field1418[field1091] = var14;
														field1419[field1091] = var11.field61;
														field1091++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1224[field1091] = var11.field92[var22] + " @lre@" + var19.field904;

														if (var22 == 0) {
															field1420[field1091] = 582;
														}

														if (var22 == 1) {
															field1420[field1091] = 113;
														}

														if (var22 == 2) {
															field1420[field1091] = 555;
														}

														if (var22 == 3) {
															field1420[field1091] = 331;
														}

														if (var22 == 4) {
															field1420[field1091] = 354;
														}

														field1421[field1091] = var19.field902;
														field1418[field1091] = var14;
														field1419[field1091] = var11.field61;
														field1091++;
													}
												}
											}

											field1224[field1091] = "Examine @lre@" + var19.field904;
											field1420[field1091] = 1328;
											field1421[field1091] = var19.field902;
											field1418[field1091] = var14;
											field1419[field1091] = var11.field61;
											field1091++;
										} else if ((field1197 & 0x10) == 0x10) {
											field1224[field1091] = field1198 + " @lre@" + var19.field904;
											field1420[field1091] = 563;
											field1421[field1091] = var19.field902;
											field1418[field1091] = var14;
											field1419[field1091] = var11.field61;
											field1091++;
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

	@ObfuscatedName("client.a(JI)V")
	public final void method448(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1080; var3++) {
				if (field1225[var3] == arg0) {
					field1080--;
					field1385 = true;

					for (int var4 = var3; var4 < field1080; var4++) {
						field1341[var4] = field1341[var4 + 1];
						field1464[var4] = field1464[var4 + 1];
						field1225[var4] = field1225[var4 + 1];
					}

					field1266.method214(106);
					field1266.method221(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method449() {
		for (int var1 = 0; var1 < field1416; var1++) {
			int var2 = field1417[var1];
			class26 var3 = field1415[var2];
			if (var3 != null) {
				method450(var3, var3.field415.field872);
			}
		}
	}

	@ObfuscatedName("client.a(Ly;IZ)V")
	public final void method450(class25 arg0, int arg1) {
		if (arg0.field360 < 128 || arg0.field361 < 128 || arg0.field360 >= 13184 || arg0.field361 >= 13184) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (field1114 == arg0 && (arg0.field360 < 1536 || arg0.field361 < 1536 || arg0.field360 >= 11776 || arg0.field361 >= 11776)) {
			arg0.field388 = -1;
			arg0.field393 = -1;
			arg0.field402 = 0;
			arg0.field403 = 0;
			arg0.field360 = arg0.field410[0] * 128 + arg0.field364 * 64;
			arg0.field361 = arg0.field411[0] * 128 + arg0.field364 * 64;
			arg0.method112();
		}

		if (arg0.field402 > field1160) {
			method451(arg0);
		} else if (arg0.field403 >= field1160) {
			method452(arg0);
		} else {
			method453(arg0);
		}

		method454(arg0);
		method455(arg0);
	}

	@ObfuscatedName("client.a(Ly;B)V")
	public final void method451(class25 arg0) {
		int var2 = arg0.field402 - field1160;
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
	public final void method452(class25 arg0) {
		if (field1160 == arg0.field403 || arg0.field388 == -1 || arg0.field391 != 0 || arg0.field390 + 1 > class66.field985[arg0.field388].method376(arg0.field389)) {
			int var2 = arg0.field403 - arg0.field402;
			int var3 = field1160 - arg0.field402;
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
	public final void method453(class25 arg0) {
		arg0.field385 = arg0.field365;
		if (arg0.field409 == 0) {
			arg0.field413 = 0;
		} else {
			if (arg0.field388 != -1 && arg0.field391 == 0) {
				class66 var2 = class66.field985[arg0.field388];
				if (arg0.field414 > 0 && var2.field997 == 0) {
					arg0.field413++;
					return;
				}

				if (arg0.field414 <= 0 && var2.field998 == 0) {
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

	@ObfuscatedName("client.a(ILy;)V")
	public final void method454(class25 arg0) {
		if (arg0.field408 != 0) {
			if (arg0.field382 != -1 && arg0.field382 < 32768) {
				class26 var2 = field1415[arg0.field382];
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
				if (field1304 == var5) {
					var5 = field1174;
				}

				class27 var6 = field1175[var5];
				if (var6 != null) {
					int var7 = arg0.field360 - var6.field360;
					int var8 = arg0.field361 - var6.field361;
					if (var7 != 0 || var8 != 0) {
						arg0.field407 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field383 != 0 || arg0.field384 != 0) && (arg0.field409 == 0 || arg0.field413 > 0)) {
				int var9 = arg0.field360 - (arg0.field383 - field1186 - field1186) * 64;
				int var10 = arg0.field361 - (arg0.field384 - field1187 - field1187) * 64;
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

	@ObfuscatedName("client.b(Ly;B)V")
	public final void method455(class25 arg0) {
		arg0.field363 = false;

		if (arg0.field385 != -1) {
			class66 var2 = class66.field985[arg0.field385];
			arg0.field387++;
			if (arg0.field386 < var2.field986 && arg0.field387 > var2.method376(arg0.field386)) {
				arg0.field387 = 0;
				arg0.field386++;
			}

			if (arg0.field386 >= var2.field986) {
				arg0.field387 = 0;
				arg0.field386 = 0;
			}
		}

		if (arg0.field393 != -1 && field1160 >= arg0.field396) {
			if (arg0.field394 < 0) {
				arg0.field394 = 0;
			}

			class66 var3 = class68.field1005[arg0.field393].field1009;
			arg0.field395++;
			while (arg0.field394 < var3.field986 && arg0.field395 > var3.method376(arg0.field394)) {
				arg0.field395 -= var3.method376(arg0.field394);
				arg0.field394++;
			}

			if (arg0.field394 >= var3.field986 && (arg0.field394 < 0 || arg0.field394 >= var3.field986)) {
				arg0.field393 = -1;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 <= 1) {
			class66 var4 = class66.field985[arg0.field388];
			if (var4.field997 == 1 && arg0.field414 > 0 && arg0.field402 <= field1160 && arg0.field403 < field1160) {
				arg0.field391 = 1;
				return;
			}
		}

		if (arg0.field388 != -1 && arg0.field391 == 0) {
			class66 var5 = class66.field985[arg0.field388];
			arg0.field390++;
			while (arg0.field389 < var5.field986 && arg0.field390 > var5.method376(arg0.field389)) {
				arg0.field390 -= var5.method376(arg0.field389);
				arg0.field389++;
			}

			if (arg0.field389 >= var5.field986) {
				arg0.field389 -= var5.field990;
				arg0.field392++;
				if (arg0.field392 >= var5.field996) {
					arg0.field388 = -1;
				}

				if (arg0.field389 < 0 || arg0.field389 >= var5.field986) {
					arg0.field388 = -1;
				}
			}

			arg0.field363 = var5.field992;
		}

		if (arg0.field391 > 0) {
			arg0.field391--;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method456() {
		if (field1343) {
			field1343 = false;
			field1082.method255(field9, 0, 4);
			field1083.method255(field9, 0, 357);
			field1084.method255(field9, 722, 4);
			field1085.method255(field9, 743, 205);
			field1086.method255(field9, 0, 0);
			field1087.method255(field9, 516, 4);
			field1088.method255(field9, 516, 205);
			field1089.method255(field9, 496, 357);
			field1090.method255(field9, 0, 338);
			field1385 = true;
			field1213 = true;
			field1131 = true;
			field1126 = true;

			if (field1312 != 2) {
				field1327.method255(field9, 4, 4);
				field1326.method255(field9, 550, 4);
			}
		}

		if (field1312 == 2) {
			method530();
		}

		if (field1340 && field1269 == 1) {
			field1385 = true;
		}

		if (field1411 != -1) {
			boolean var1 = method509(field1411, field1147);
			if (var1) {
				field1385 = true;
			}
		}

		if (field1434 == 2) {
			field1385 = true;
		}

		if (field1349 == 2) {
			field1385 = true;
		}

		if (field1385) {
			method462();
			field1385 = false;
		}

		if (field1413 == -1) {
			field1437.field76 = field1280 - field1295 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method423(false, 0, field17 - 17, 77, 463, field1280, field18 - 357, field1437);
			}

			int var2 = field1280 - field1437.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1280 - 77) {
				var2 = field1280 - 77;
			}

			if (field1295 != var2) {
				field1295 = var2;
				field1213 = true;
			}
		}

		if (field1413 != -1) {
			boolean var3 = method509(field1413, field1147);
			if (var3) {
				field1213 = true;
			}
		}

		if (field1434 == 3) {
			field1213 = true;
		}

		if (field1349 == 3) {
			field1213 = true;
		}

		if (field1276 != null) {
			field1213 = true;
		}

		if (field1340 && field1269 == 2) {
			field1213 = true;
		}

		if (field1213) {
			method541();
			field1213 = false;
		}

		if (field1312 == 2) {
			method433();
			field1326.method255(field9, 550, 4);
		}

		if (field1200 != -1) {
			field1131 = true;
		}

		if (field1131) {
			if (field1200 != -1 && field1260 == field1200) {
				field1200 = -1;
				field1266.method214(94);
				field1266.method215(field1260);
			}

			field1131 = false;
			field1316.method254();
			field1356.method198(0, 0);

			if (field1411 == -1) {
				if (field1169[field1260] != -1) {
					if (field1260 == 0) {
						field1208.method198(22, 10);
					}

					if (field1260 == 1) {
						field1209.method198(54, 8);
					}

					if (field1260 == 2) {
						field1209.method198(82, 8);
					}

					if (field1260 == 3) {
						field1210.method198(110, 8);
					}

					if (field1260 == 4) {
						field1212.method198(153, 8);
					}

					if (field1260 == 5) {
						field1212.method198(181, 8);
					}

					if (field1260 == 6) {
						field1211.method198(209, 9);
					}
				}

				if (field1169[0] != -1 && (field1200 != 0 || field1160 % 20 < 10)) {
					field1297[0].method198(29, 13);
				}

				if (field1169[1] != -1 && (field1200 != 1 || field1160 % 20 < 10)) {
					field1297[1].method198(53, 11);
				}

				if (field1169[2] != -1 && (field1200 != 2 || field1160 % 20 < 10)) {
					field1297[2].method198(82, 11);
				}

				if (field1169[3] != -1 && (field1200 != 3 || field1160 % 20 < 10)) {
					field1297[3].method198(115, 12);
				}

				if (field1169[4] != -1 && (field1200 != 4 || field1160 % 20 < 10)) {
					field1297[4].method198(153, 13);
				}

				if (field1169[5] != -1 && (field1200 != 5 || field1160 % 20 < 10)) {
					field1297[5].method198(180, 11);
				}

				if (field1169[6] != -1 && (field1200 != 6 || field1160 % 20 < 10)) {
					field1297[6].method198(208, 13);
				}
			}

			field1316.method255(field9, 516, 160);
			field1315.method254();
			field1355.method198(0, 0);

			if (field1411 == -1) {
				if (field1169[field1260] != -1) {
					if (field1260 == 7) {
						field1190.method198(42, 0);
					}

					if (field1260 == 8) {
						field1191.method198(74, 0);
					}

					if (field1260 == 9) {
						field1191.method198(102, 0);
					}

					if (field1260 == 10) {
						field1192.method198(130, 1);
					}

					if (field1260 == 11) {
						field1194.method198(173, 0);
					}

					if (field1260 == 12) {
						field1194.method198(201, 0);
					}

					if (field1260 == 13) {
						field1193.method198(229, 0);
					}
				}

				if (field1169[8] != -1 && (field1200 != 8 || field1160 % 20 < 10)) {
					field1297[7].method198(74, 2);
				}

				if (field1169[9] != -1 && (field1200 != 9 || field1160 % 20 < 10)) {
					field1297[8].method198(102, 3);
				}

				if (field1169[10] != -1 && (field1200 != 10 || field1160 % 20 < 10)) {
					field1297[9].method198(137, 4);
				}

				if (field1169[11] != -1 && (field1200 != 11 || field1160 % 20 < 10)) {
					field1297[10].method198(174, 2);
				}

				if (field1169[12] != -1 && (field1200 != 12 || field1160 % 20 < 10)) {
					field1297[11].method198(201, 2);
				}

				if (field1169[13] != -1 && (field1200 != 13 || field1160 % 20 < 10)) {
					field1297[12].method198(226, 2);
				}
			}

			field1315.method255(field9, 496, 466);
			field1327.method254();
		}

		if (field1126) {
			field1126 = false;
			field1314.method254();
			field1354.method198(0, 0);
			field1453.method201(true, 28, "Public chat", 55, 0xFFFFFF);

			if (field1460 == 0) {
				field1453.method201(true, 41, "On", 55, 0xFF00);
			}

			if (field1460 == 1) {
				field1453.method201(true, 41, "Friends", 55, 0xFFFF00);
			}

			if (field1460 == 2) {
				field1453.method201(true, 41, "Off", 55, 0xFF0000);
			}

			if (field1460 == 3) {
				field1453.method201(true, 41, "Hide", 55, 0xFFFF);
			}

			field1453.method201(true, 28, "Private chat", 184, 0xFFFFFF);

			if (field1346 == 0) {
				field1453.method201(true, 41, "On", 184, 0xFF00);
			}

			if (field1346 == 1) {
				field1453.method201(true, 41, "Friends", 184, 0xFFFF00);
			}

			if (field1346 == 2) {
				field1453.method201(true, 41, "Off", 184, 0xFF0000);
			}

			field1453.method201(true, 28, "Trade/compete", 324, 0xFFFFFF);

			if (field1105 == 0) {
				field1453.method201(true, 41, "On", 324, 0xFF00);
			}

			if (field1105 == 1) {
				field1453.method201(true, 41, "Friends", 324, 0xFFFF00);
			}

			if (field1105 == 2) {
				field1453.method201(true, 41, "Off", 324, 0xFF0000);
			}

			field1453.method201(true, 33, "Report abuse", 458, 0xFFFFFF);
			field1314.method255(field9, 0, 453);
			field1327.method254();
		}

		field1147 = 0;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method457() {
		field1063 = 0;
		for (int var1 = -1; var1 < field1416 + field1176; var1++) {
			class25 var2;
			if (var1 == -1) {
				var2 = field1114;
			} else if (var1 < field1176) {
				var2 = field1175[field1177[var1]];
			} else {
				var2 = field1415[field1417[var1 - field1176]];
			}

			if (var2 != null && var2.method113()) {
				if (var1 >= field1176) {
					class59 var6 = ((class26) var2).field415;
					if (var6.field893 >= 0 && var6.field893 < field1323.length) {
						method485(var2.field406 + 15, var2);

						if (field1447 > -1) {
							field1323[var6.field893].method185(field1447 - 12, field1448 - 30);
						}
					}

					if (field1226 == 1 && field1417[var1 - field1176] == field1145 && field1160 % 20 < 10) {
						method485(var2.field406 + 15, var2);

						if (field1447 > -1) {
							field1323[2].method185(field1447 - 12, field1448 - 28);
						}
					}
				} else {
					int var3 = 30;
					class27 var4 = (class27) var2;
					if (var4.field419 != 0) {
						method485(var2.field406 + 15, var2);

						if (field1447 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field419 & 1 << var5) != 0) {
									field1323[var5].method185(field1447 - 12, field1448 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1226 == 10 && field1177[var1] == field1457) {
						method485(var2.field406 + 15, var2);

						if (field1447 > -1) {
							field1323[7].method185(field1447 - 12, field1448 - var3);
						}
					}
				}

				if (var2.field372 != null && (var1 >= field1176 || field1460 == 0 || field1460 == 3 || field1460 == 1 && method430(((class27) var2).field416))) {
					method485(var2.field406, var2);

					if (field1447 > -1 && field1063 < field1064) {
						field1068[field1063] = field1454.method203(var2.field372) / 2;
						field1067[field1063] = field1454.field613;
						field1065[field1063] = field1447;
						field1066[field1063] = field1448;
						field1069[field1063] = var2.field374;
						field1070[field1063] = var2.field375;
						field1071[field1063] = var2.field373;
						field1072[field1063++] = var2.field372;

						if (field1395 == 0 && var2.field375 == 1) {
							field1067[field1063] += 10;
							field1066[field1063] += 5;
						}

						if (field1395 == 0 && var2.field375 == 2) {
							field1068[field1063] = 60;
						}
					}
				}

				if (var2.field379 > field1160) {
					method485(var2.field406 + 15, var2);

					if (field1447 > -1) {
						int var7 = var2.field380 * 30 / var2.field381;
						if (var7 > 30) {
							var7 = 30;
						}

						class33.method156(field1447 - 15, 0xFF00, 5, var7, field1448 - 3);
						class33.method156(field1447 + var7 - 15, 0xFF0000, 5, 30 - var7, field1448 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field378[var8] > field1160) {
						method485(var2.field406 / 2, var2);

						if (field1447 > -1) {
							if (var8 == 1) {
								field1448 -= 20;
							}

							if (var8 == 2) {
								field1447 -= 15;
								field1448 -= 10;
							}

							if (var8 == 3) {
								field1447 += 15;
								field1448 -= 10;
							}

							field1100[var2.field377[var8]].method185(field1447 - 12, field1448 - 12);
							field1452.method200(field1447, 0, String.valueOf(var2.field376[var8]), field1448 + 4);
							field1452.method200(field1447 - 1, 0xFFFFFF, String.valueOf(var2.field376[var8]), field1448 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1063; var9++) {
			int var10 = field1065[var9];
			int var11 = field1066[var9];
			int var12 = field1068[var9];
			int var13 = field1067[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1066[var15] - field1067[var15] && var11 - var13 < field1066[var15] + 2 && var10 - var12 < field1068[var15] + field1065[var15] && var10 + var12 > field1065[var15] - field1068[var15] && field1066[var15] - field1067[var15] < var11) {
						var11 = field1066[var15] - field1067[var15];
						var14 = true;
					}
				}
			}

			field1447 = field1065[var9];
			field1448 = field1066[var9] = var11;
			String var16 = field1072[var9];
			if (field1395 == 0) {
				int var17 = 0xFFFF00;
				if (field1069[var9] < 6) {
					var17 = field1422[field1069[var9]];
				}

				if (field1069[var9] == 6) {
					var17 = field1275 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1069[var9] == 7) {
					var17 = field1275 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1069[var9] == 8) {
					var17 = field1275 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1069[var9] == 9) {
					int var18 = 150 - field1071[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1069[var9] == 10) {
					int var19 = 150 - field1071[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1069[var9] == 11) {
					int var20 = 150 - field1071[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1070[var9] == 0) {
					field1454.method200(field1447, 0, var16, field1448 + 1);
					field1454.method200(field1447, var17, var16, field1448);
				}

				if (field1070[var9] == 1) {
					field1454.method205(0, var16, field1275, field1448 + 1, field1447);
					field1454.method205(var17, var16, field1275, field1448, field1447);
				}

				if (field1070[var9] == 2) {
					int var21 = field1454.method203(var16);
					int var22 = (150 - field1071[var9]) * (var21 + 100) / 150;
					class33.method153(0, field1447 - 50, field1447 + 50, 334);
					field1454.method204(field1447 + 50 - var22, var16, field1448 + 1, 0);
					field1454.method204(field1447 + 50 - var22, var16, field1448, var17);
					class33.method152();
				}
			} else {
				field1454.method200(field1447, 0, var16, field1448 + 1);
				field1454.method200(field1447, 0xFFFF00, var16, field1448);
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method458() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1408) {
			field1310 = false;
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

		if (field1054) {
			field1310 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1291) {
			field1310 = false;
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

	@ObfuscatedName("client.f(Z)V")
	public final void method459() {
		field1310 = false;
		while (field1318) {
			field1310 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1102 = null;
		field1103 = null;
		field1306 = null;
		field1250 = null;
		field1251 = null;
		field1252 = null;
		field1253 = null;
		field1096 = null;
		field1097 = null;
		field1163 = null;
		field1164 = null;
		field1307 = null;
		field1308 = null;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method460() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(Ljb;I)V")
	public final void method461(class36 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1096.length; var3++) {
			field1096[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1096[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1097[var9] = (field1096[var9 - 1] + field1096[var9 + 1] + field1096[var9 - 128] + field1096[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1096;
			field1096 = field1097;
			field1097 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field602; var12++) {
				for (int var13 = 0; var13 < arg0.field601; var13++) {
					if (arg0.field599[var11++] != 0) {
						int var14 = var13 + arg0.field603 + 16;
						int var15 = var12 + arg0.field604 + 16;
						int var16 = (var15 << 7) + var14;
						field1096[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method462() {
		field1325.method254();
		class34.field580 = field1374;
		field1204.method198(0, 0);

		if (field1411 != -1) {
			method555(class4.field56[field1411], 0, 0, 0);
		} else if (field1169[field1260] != -1) {
			method555(class4.field56[field1169[field1260]], 0, 0, 0);
		}

		if (field1340 && field1269 == 1) {
			method498();
		}

		field1325.method255(field9, 553, 205);
		field1327.method254();
		class34.field580 = field1375;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method463() {
		int var1 = 5;
		field1439[8] = 0;
		int var2 = 0;
		while (field1439[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method432("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 282);
				class38 var5 = new class38(new byte[40]);
				var4.readFully(var5.field616, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field1439[var6] = var5.method230();
				}

				int var7 = var5.method230();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field1439[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field1439[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field1439[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field1439[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field1439[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field1439[8] == 0) {
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

				field1139 = !field1139;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1142 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
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

	@ObfuscatedName("client.a(IIII)I")
	public final int method465(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method466() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1163[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1163[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1164[var10] = (field1163[var10 - 1] + field1163[var10 + 1] + field1163[var10 - 128] + field1163[var10 + 128]) / 4;
			}
		}

		field1237 += 128;
		if (field1237 > field1096.length) {
			field1237 -= field1096.length;
			int var11 = (int) (Math.random() * 12.0D);
			method461(field1306[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1164[var14 + 128] - field1096[field1237 + var14 & field1096.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1163[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1462[var16] = field1462[var16 + 1];
		}

		field1462[var1 - 1] = (int) (Math.sin(field1160 / 14.0D) * 16.0D + Math.sin(field1160 / 15.0D) * 14.0D + Math.sin(field1160 / 16.0D) * 12.0D);

		if (field1445 > 0) {
			field1445 -= 4;
		}

		if (field1446 > 0) {
			field1446 -= 4;
		}

		if (field1445 == 0 && field1446 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1445 = 1024;
			}

			if (var17 == 1) {
				field1446 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method467() {
		for (int var1 = 0; var1 < field1157; var1++) {
			if (field1150[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1274[var1] != field1412 || field1257[var1] != field1238) {
						class38 var3 = class55.method315(field1274[var1], field1257[var1]);
						if (System.currentTimeMillis() + var3.field617 / 22 > field1319 / 22 + field1461) {
							field1319 = var3.field617;
							field1461 = System.currentTimeMillis();

							if (method446(var3.field616, var3.field617)) {
								field1412 = field1274[var1];
								field1238 = field1257[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method519()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1150[var1] != -5) {
					field1150[var1] = -5;
				} else {
					field1157--;
					for (int var5 = var1; var5 < field1157; var5++) {
						field1274[var5] = field1274[var5 + 1];
						field1257[var5] = field1257[var5 + 1];
						field1150[var5] = field1150[var5 + 1];
					}

					var1--;
				}
			} else {
				field1150[var1]--;
			}
		}

		if (field1052 > 0) {
			field1052 -= 20;
			if (field1052 < 0) {
				field1052 = 0;
			}

			if (field1052 == 0 && field1094 && !field1144) {
				field1435 = field1125;
				field1436 = true;
				field1279.method275(2, field1435);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public final void method468(class38 arg0, int arg1) {
		arg0.method235();
		int var3 = arg0.method236(1);
		if (var3 != 0) {
			int var4 = arg0.method236(2);
			if (var4 == 0) {
				field1179[field1178++] = field1174;
			} else if (var4 == 1) {
				int var5 = arg0.method236(3);
				field1114.method111(var5, false);
				int var6 = arg0.method236(1);
				if (var6 == 1) {
					field1179[field1178++] = field1174;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method236(3);
				field1114.method111(var7, true);
				int var8 = arg0.method236(3);
				field1114.method111(var8, true);
				int var9 = arg0.method236(1);
				if (var9 == 1) {
					field1179[field1178++] = field1174;
				}
			} else if (var4 == 3) {
				field1138 = arg0.method236(2);
				int var10 = arg0.method236(7);
				int var11 = arg0.method236(7);
				int var12 = arg0.method236(1);
				field1114.method110(var10, var12 == 1, var11);
				int var13 = arg0.method236(1);
				if (var13 == 1) {
					field1179[field1178++] = field1174;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method469() {
		if (field1144 && field1312 == 2 && class3.field33 != field1138) {
			field1327.method254();
			field1453.method200(257, 0, "Loading - please wait.", 151);
			field1453.method200(256, 0xFFFFFF, "Loading - please wait.", 150);
			field1327.method255(field9, 4, 4);
			field1312 = 1;
			field1366 = System.currentTimeMillis();
		}

		if (field1312 == 1) {
			int var1 = method470();
			if (var1 != 0 && System.currentTimeMillis() - field1366 > 360000L) {
				signlink.reporterror(field1409 + " glcfb " + field1256 + "," + var1 + "," + field1144 + "," + field1398[0] + "," + field1279.method276() + "," + field1138 + "," + field1406 + "," + field1407);
				field1366 = System.currentTimeMillis();
			}
		}

		if (field1312 == 2 && field1138 != field1053) {
			field1053 = field1138;
			method505(field1138);
		}
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method470() {
		for (int var1 = 0; var1 < field1363.length; var1++) {
			if (field1363[var1] == null && field1393[var1] != -1) {
				return -1;
			}

			if (field1277[var1] == null && field1394[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1363.length; var3++) {
			byte[] var4 = field1277[var3];
			if (var4 != null) {
				int var5 = (field1392[var3] >> 8) * 64 - field1186;
				int var6 = (field1392[var3] & 0xFF) * 64 - field1187;
				var2 &= class3.method16(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1249) {
			return -4;
		} else {
			field1312 = 2;
			class3.field33 = field1138;
			method549();
			field1266.method214(214);
			return 0;
		}
	}

	@ObfuscatedName("client.a(Llb;ILab;II)V")
	public final void method471(class38 arg0, int arg1, class27 arg2, int arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg0.method225();
			byte[] var6 = new byte[var5];
			class38 var7 = new class38(var6);
			arg0.method234(0, var5, var6);
			field1180[arg3] = var7;
			arg2.method116(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg0.method227();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.field388 == var8) {
				arg2.field392 = 0;
			}

			int var9 = arg0.method225();
			if (arg2.field388 == var8 && var8 != -1) {
				int var10 = class66.field985[var8].field999;
				if (var10 == 1) {
					arg2.field389 = 0;
					arg2.field390 = 0;
					arg2.field391 = var9;
					arg2.field392 = 0;
				}

				if (var10 == 2) {
					arg2.field392 = 0;
				}
			} else if (var8 == -1 || arg2.field388 == -1 || class66.field985[var8].field993 >= class66.field985[arg2.field388].field993) {
				arg2.field388 = var8;
				arg2.field389 = 0;
				arg2.field390 = 0;
				arg2.field391 = var9;
				arg2.field392 = 0;
				arg2.field414 = arg2.field409;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg2.field382 = arg0.method227();
			if (arg2.field382 == 0xFFFF) {
				arg2.field382 = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg2.field372 = arg0.method232();
			arg2.field374 = 0;
			arg2.field375 = 0;
			arg2.field373 = 150;
			method544(arg2.field416, arg2.field372, 2);
		}

		if ((arg1 & 0x10) == 0x10) {
			int var11 = arg0.method225();
			int var12 = arg0.method225();
			arg2.method114(var11, var12, field1160);
			arg2.field379 = field1160 + 300;
			arg2.field380 = arg0.method225();
			arg2.field381 = arg0.method225();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg2.field383 = arg0.method227();
			arg2.field384 = arg0.method227();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var13 = arg0.method227();
			int var14 = arg0.method225();
			int var15 = arg0.method225();
			int var16 = arg0.field617;

			if (arg2.field416 != null && arg2.field417) {
				long var17 = class51.method296(arg2.field416);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1148; var20++) {
						if (field1430[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1259 == 0) {
					try {
						String var21 = class52.method303(var15, arg0);
						var21 = class71.method395(var21);
						arg2.field372 = var21;
						arg2.field374 = var13 >> 8;
						arg2.field375 = var13 & 0xFF;
						arg2.field373 = 150;

						if (var14 == 2 || var14 == 3) {
							method544("@cr2@" + arg2.field416, var21, 1);
						} else if (var14 == 1) {
							method544("@cr1@" + arg2.field416, var21, 1);
						} else {
							method544(arg2.field416, var21, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field617 = var15 + var16;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg2.field393 = arg0.method227();
			int var23 = arg0.method230();
			arg2.field397 = var23 >> 16;
			arg2.field396 = (var23 & 0xFFFF) + field1160;
			arg2.field394 = 0;
			arg2.field395 = 0;

			if (arg2.field396 > field1160) {
				arg2.field394 = -1;
			}

			if (arg2.field393 == 0xFFFF) {
				arg2.field393 = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg2.field398 = arg0.method225();
			arg2.field400 = arg0.method225();
			arg2.field399 = arg0.method225();
			arg2.field401 = arg0.method225();
			arg2.field402 = arg0.method227() + field1160;
			arg2.field403 = arg0.method227() + field1160;
			arg2.field404 = arg0.method225();
			arg2.method112();
		}

		if ((arg1 & 0x400) == 0x400) {
			int var24 = arg0.method225();
			int var25 = arg0.method225();
			arg2.method114(var24, var25, field1160);
			arg2.field379 = field1160 + 300;
			arg2.field380 = arg0.method225();
			arg2.field381 = arg0.method225();
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1060) {
			field1291 = true;
		} else {
			field1060 = true;
			boolean var1 = false;
			String var2 = method434();
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
						field1398[var3] = new class48(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method463();
					field1357 = method473(1, "title", field1439[1], "title screen", 25);
					field1452 = new class37(field1357, false, "p11_full");
					field1453 = new class37(field1357, false, "p12_full");
					field1454 = new class37(field1357, false, "b12_full");
					field1455 = new class37(field1357, true, "q8_full");
					method526();
					method507();
					class50 var4 = method473(2, "config", field1439[2], "config", 30);
					class50 var5 = method473(3, "interface", field1439[3], "interface", 35);
					class50 var6 = method473(4, "media", field1439[4], "2d graphics", 40);
					class50 var7 = method473(6, "textures", field1439[6], "textures", 45);
					class50 var8 = method473(7, "wordenc", field1439[7], "chat system", 50);
					class50 var9 = method473(8, "sounds", field1439[8], "sound effects", 55);
					field1244 = new byte[4][104][104];
					field1309 = new int[4][105][105];
					field1353 = new class18(104, 4, field1309, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field1074[var10] = new class62(104, 104);
					}

					field1113 = new class35(512, 512);
					class50 var11 = method473(5, "versionlist", field1439[5], "update list", 60);
					method13(60, "Connecting to update server");
					field1279 = new class47();
					field1279.method266(var11, this);
					class7.method44(field1279.method269());
					class31.method122(field1279.method268(0), field1279);

					if (!field1144) {
						field1435 = 0;
						try {
							field1435 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field1436 = true;
						field1279.method275(2, field1435);

						while (field1279.method276() > 0) {
							method552();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field1279.field734 > 3) {
								method491("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field1279.method268(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field1279.method275(1, var13);
					}

					while (field1279.method276() > 0) {
						int var14 = var12 - field1279.method276();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method552();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field1279.field734 > 3) {
							method491("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field1279.method268(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field1279.method273(var16);
						if ((var17 & 0x1) != 0) {
							field1279.method275(0, var16);
						}
					}

					int var18 = field1279.method276();
					while (field1279.method276() > 0) {
						int var19 = var18 - field1279.method276();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method552();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field1398[0] != null) {
						method13(75, "Requesting maps");
						field1279.method275(3, field1279.method270(0, 47, 48));
						field1279.method275(3, field1279.method270(1, 47, 48));
						field1279.method275(3, field1279.method270(0, 48, 48));
						field1279.method275(3, field1279.method270(1, 48, 48));
						field1279.method275(3, field1279.method270(0, 49, 48));
						field1279.method275(3, field1279.method270(1, 49, 48));
						field1279.method275(3, field1279.method270(0, 47, 47));
						field1279.method275(3, field1279.method270(1, 47, 47));
						field1279.method275(3, field1279.method270(0, 48, 47));
						field1279.method275(3, field1279.method270(1, 48, 47));
						field1279.method275(3, field1279.method270(0, 48, 148));
						field1279.method275(3, field1279.method270(1, 48, 148));
						int var20 = field1279.method276();
						while (field1279.method276() > 0) {
							int var21 = var20 - field1279.method276();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method552();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field1279.method268(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field1279.method273(var23);
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
							field1279.method278(var23, var25, 0);
						}
					}

					field1279.method271(field1143);

					if (!field1144) {
						int var26 = field1279.method268(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field1279.method274(var27)) {
								field1279.method278(var27, (byte) 1, 2);
							}
						}
					}

					method13(80, "Unpacking media");
					field1204 = new class36(var6, "invback", 0);
					field1206 = new class36(var6, "chatback", 0);
					field1205 = new class36(var6, "mapback", 0);
					field1354 = new class36(var6, "backbase1", 0);
					field1355 = new class36(var6, "backbase2", 0);
					field1356 = new class36(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field1297[var28] = new class36(var6, "sideicons", var28);
					}

					field1159 = new class35(var6, "compass", 0);
					field1396 = new class35(var6, "mapedge", 0);
					field1396.method182();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field1254[var29] = new class36(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field1399[var30] = new class35(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field1100[var31] = new class35(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field1323[var32] = new class35(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field1386 = new class35(var6, "mapmarker", 0);
					field1387 = new class35(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field1231[var33] = new class35(var6, "cross", var33);
					}

					field1118 = new class35(var6, "mapdots", 0);
					field1119 = new class35(var6, "mapdots", 1);
					field1120 = new class35(var6, "mapdots", 2);
					field1121 = new class35(var6, "mapdots", 3);
					field1368 = new class36(var6, "scrollbar", 0);
					field1369 = new class36(var6, "scrollbar", 1);
					field1208 = new class36(var6, "redstone1", 0);
					field1209 = new class36(var6, "redstone2", 0);
					field1210 = new class36(var6, "redstone3", 0);
					field1211 = new class36(var6, "redstone1", 0);
					field1211.method195();
					field1212 = new class36(var6, "redstone2", 0);
					field1212.method195();
					field1190 = new class36(var6, "redstone1", 0);
					field1190.method196();
					field1191 = new class36(var6, "redstone2", 0);
					field1191.method196();
					field1192 = new class36(var6, "redstone3", 0);
					field1192.method196();
					field1193 = new class36(var6, "redstone1", 0);
					field1193.method195();
					field1193.method196();
					field1194 = new class36(var6, "redstone2", 0);
					field1194.method195();
					field1194.method196();

					for (int var34 = 0; var34 < 2; var34++) {
						field1339[var34] = new class36(var6, "mod_icons", var34);
					}

					class35 var35 = new class35(var6, "backleft1", 0);
					field1082 = new class43(var35.field594, var35.field593, method11());
					var35.method183(0, 0);
					class35 var36 = new class35(var6, "backleft2", 0);
					field1083 = new class43(var36.field594, var36.field593, method11());
					var36.method183(0, 0);
					class35 var37 = new class35(var6, "backright1", 0);
					field1084 = new class43(var37.field594, var37.field593, method11());
					var37.method183(0, 0);
					class35 var38 = new class35(var6, "backright2", 0);
					field1085 = new class43(var38.field594, var38.field593, method11());
					var38.method183(0, 0);
					class35 var39 = new class35(var6, "backtop1", 0);
					field1086 = new class43(var39.field594, var39.field593, method11());
					var39.method183(0, 0);
					class35 var40 = new class35(var6, "backvmid1", 0);
					field1087 = new class43(var40.field594, var40.field593, method11());
					var40.method183(0, 0);
					class35 var41 = new class35(var6, "backvmid2", 0);
					field1088 = new class43(var41.field594, var41.field593, method11());
					var41.method183(0, 0);
					class35 var42 = new class35(var6, "backvmid3", 0);
					field1089 = new class43(var42.field594, var42.field593, method11());
					var42.method183(0, 0);
					class35 var43 = new class35(var6, "backhmid2", 0);
					field1090 = new class43(var43.field594, var43.field593, method11());
					var43.method183(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field1399[var48] != null) {
							field1399[var48].method181(var45 + var47, var46 + var47, var44 + var47);
						}

						if (field1254[var48] != null) {
							field1254[var48].method197(var45 + var47, var46 + var47, var44 + var47);
						}
					}

					method13(83, "Unpacking textures");
					class34.method168(var7);
					class34.method172(0.8D);
					class34.method167(20);
					method13(86, "Unpacking config");
					class66.method375(var4);
					class57.method324(var4);
					class63.method365(var4);
					class60.method340(var4);
					class59.method334(var4);
					class64.method369(var4);
					class68.method378(var4);
					class70.method383(var4);
					class69.method381(var4);
					class60.field901 = field1143;

					if (!field1144) {
						method13(90, "Unpacking sounds");
						byte[] var49 = var9.method295("sounds.dat", null);
						class38 var50 = new class38(var49);
						class55.method314(var50);
					}

					method13(95, "Unpacking interfaces");
					class37[] var51 = new class37[] { field1452, field1453, field1454, field1455 };
					class4.method32(var5, var6, var51);
					method13(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field1205.field599[field1205.field601 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field1219[var52] = var53;
						field1170[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field1205.field599[field1205.field601 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field1468[var56 - 5] = var57 - 25;
						field1313[var56 - 5] = var58 - var57;
					}

					class34.method165(479, 96);
					field1373 = class34.field580;
					class34.method165(190, 261);
					field1374 = class34.field580;
					class34.method165(512, 334);
					field1375 = class34.field580;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = class34.field578[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					class18.method86(334, var60, 512, 500, 800);
					class71.method385(var8);
					field1110 = new class58(this);
					method12(field1110, 10);
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field1230 + " " + field1372);
					field1408 = true;
				}
			} else {
				field1054 = true;
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method472(boolean arg0) {
		method438();
		field1331.method254();
		field1102.method198(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1167 == 0) {
			int var4 = var3 / 2 + 80;
			field1452.method201(true, var4, field1279.field728, var2 / 2, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field1454.method201(true, var5, "Welcome to RuneScape", var2 / 2, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1103.method198(var6 - 73, var7 - 20);
			field1454.method201(true, var7 + 5, "New User", var6, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field1103.method198(var8 - 73, var7 - 20);
			field1454.method201(true, var7 + 5, "Existing User", var8, 0xFFFFFF);
		}

		if (field1167 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1161.length() > 0) {
				field1454.method201(true, var9 - 15, field1161, var2 / 2, 0xFFFF00);
				field1454.method201(true, var9, field1162, var2 / 2, 0xFFFF00);
				var9 += 30;
			} else {
				field1454.method201(true, var9 - 7, field1162, var2 / 2, 0xFFFF00);
				var9 += 30;
			}

			field1454.method206(var9, var2 / 2 - 90, true, 0xFFFFFF, "Username: " + field1409 + (field1073 == 0 & field1160 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field1454.method206(var9, var2 / 2 - 88, true, 0xFFFFFF, "Password: " + class51.method302(field1410) + (field1073 == 1 & field1160 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1103.method198(var10 - 73, var11 - 20);
				field1454.method201(true, var11 + 5, "Login", var10, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field1103.method198(var12 - 73, var11 - 20);
				field1454.method201(true, var11 + 5, "Cancel", var12, 0xFFFFFF);
			}
		}

		if (field1167 == 3) {
			field1454.method201(true, var3 / 2 - 60, "Create a free account", var2 / 2, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field1454.method201(true, var13, "To create a new account you need to", var2 / 2, 0xFFFFFF);
			var13 += 15;
			field1454.method201(true, var13, "go back to the main RuneScape webpage", var2 / 2, 0xFFFFFF);
			var13 += 15;
			field1454.method201(true, var13, "and choose the red 'create account'", var2 / 2, 0xFFFFFF);
			var13 += 15;
			field1454.method201(true, var13, "button at the top right of that page.", var2 / 2, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1103.method198(var14 - 73, var15 - 20);
			field1454.method201(true, var15 + 5, "Cancel", var14, 0xFFFFFF);
		}

		field1331.method255(field9, 202, 171);

		if (field1343) {
			field1343 = false;
			field1329.method255(field9, 128, 0);
			field1330.method255(field9, 202, 371);
			field1334.method255(field9, 0, 265);
			field1335.method255(field9, 562, 265);
			field1336.method255(field9, 128, 171);
			field1337.method255(field9, 562, 171);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)Lxb;")
	public final class50 method473(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1398[0] != null) {
				var6 = field1398[0].method287(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field1207.reset();
			field1207.update(var6);
			int var8 = (int) field1207.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class50(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg4, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method432(arg1 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class38 var16 = new class38(var15);
				var16.field617 = 3;
				int var17 = var16.method229() + 6;
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
						method13(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1398[0] != null) {
						field1398[0].method288(var6, arg0, var6.length);
					}
				} catch (Exception var28) {
					field1398[0] = null;
				}

				if (var6 != null) {
					field1207.reset();
					field1207.update(var6);
					int var23 = (int) field1207.getValue();
					if (arg2 != var23) {
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

				field1139 = !field1139;
			}
		}

		return new class50(var6);
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method474(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field1244[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field1309[var6][var4][var5] + field1309[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1309[var6][var4][var5 + 1] + field1309[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method475(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 >> 14 & 0x7FFF;
		int var6 = field1353.method80(field1138, arg1, arg3, arg2);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1289++;
		if (field1289 > 1086) {
			field1289 = 0;
			field1266.method214(149);
			field1266.method215(0);
			int var9 = field1266.field617;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method216(16791);
			}

			field1266.method215(254);
			field1266.method216((int) (Math.random() * 65536.0D));
			field1266.method216(16128);
			field1266.method216(52610);
			field1266.method216((int) (Math.random() * 65536.0D));
			field1266.method216(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method216(35025);
			}

			field1266.method216(46628);
			field1266.method215((int) (Math.random() * 256.0D));
			field1266.method224(field1266.field617 - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var10 = class57.method326(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.field829;
				var12 = var10.field830;
			} else {
				var11 = var10.field830;
				var12 = var10.field829;
			}

			int var13 = var10.field852;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			method508(false, var13, field1114.field411[0], var11, field1114.field410[0], 0, arg1, var12, arg3, 0, 2);
		} else {
			method508(false, 0, field1114.field411[0], 0, field1114.field410[0], var7 + 1, arg1, 0, arg3, var8, 2);
		}

		field1151 = field24;
		field1152 = field25;
		field1154 = 2;
		field1153 = 0;
		field1266.method214(arg0);
		field1266.method216(field1186 + arg1);
		field1266.method216(field1187 + arg3);
		field1266.method216(var5);
		return true;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field1372 = arg0;
		field1230 = arg1;
		method438();

		if (field1357 == null) {
			super.method13(arg0, arg1);
		} else {
			field1331.method254();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1454.method200(var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			class33.method157(304, 0x8C1111, 34, var6, var3 / 2 - 152);
			class33.method157(302, 0, 32, var6 + 1, var3 / 2 - 151);
			class33.method156(var3 / 2 - 150, 0x8C1111, 30, arg0 * 3, var6 + 2);
			class33.method156(arg0 * 3 + var3 / 2 - 150, 0, 30, 300 - arg0 * 3, var6 + 2);
			field1454.method200(var3 / 2, 0xFFFFFF, arg1, var4 / 2 + 5 - var5);
			field1331.method255(field9, 202, 171);

			if (field1343) {
				field1343 = false;

				if (!field1310) {
					field1332.method255(field9, 0, 0);
					field1333.method255(field9, 637, 0);
				}

				field1329.method255(field9, 128, 0);
				field1330.method255(field9, 202, 371);
				field1334.method255(field9, 0, 265);
				field1335.method255(field9, 562, 265);
				field1336.method255(field9, 128, 171);
				field1337.method255(field9, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method476() {
		field1266.method214(51);

		if (field1411 != -1) {
			field1411 = -1;
			field1385 = true;
			field1320 = false;
			field1131 = true;
		}

		if (field1413 != -1) {
			field1413 = -1;
			field1213 = true;
			field1320 = false;
		}

		field1429 = -1;
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void method477(class38 arg0, int arg1) {
		arg0.method235();
		int var3 = arg0.method236(8);
		if (var3 < field1416) {
			for (int var4 = var3; var4 < field1416; var4++) {
				field1405[field1404++] = field1417[var4];
			}
		}

		if (var3 > field1416) {
			signlink.reporterror(field1409 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1416 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1417[var5];
			class26 var7 = field1415[var6];
			int var8 = arg0.method236(1);
			if (var8 == 0) {
				field1417[field1416++] = var6;
				var7.field405 = field1160;
			} else {
				int var9 = arg0.method236(2);
				if (var9 == 0) {
					field1417[field1416++] = var6;
					var7.field405 = field1160;
					field1179[field1178++] = var6;
				} else if (var9 == 1) {
					field1417[field1416++] = var6;
					var7.field405 = field1160;
					int var10 = arg0.method236(3);
					var7.method111(var10, false);
					int var11 = arg0.method236(1);
					if (var11 == 1) {
						field1179[field1178++] = var6;
					}
				} else if (var9 == 2) {
					field1417[field1416++] = var6;
					var7.field405 = field1160;
					int var12 = arg0.method236(3);
					var7.method111(var12, true);
					int var13 = arg0.method236(3);
					var7.method111(var13, true);
					int var14 = arg0.method236(1);
					if (var14 == 1) {
						field1179[field1178++] = var6;
					}
				} else if (var9 == 3) {
					field1405[field1404++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method478() {
		if (field1328 == null) {
			method459();
			field10 = null;
			field1329 = null;
			field1330 = null;
			field1331 = null;
			field1332 = null;
			field1333 = null;
			field1334 = null;
			field1335 = null;
			field1336 = null;
			field1337 = null;
			field1328 = new class43(96, 479, method11());
			field1326 = new class43(156, 172, method11());
			class33.method154();
			field1205.method198(0, 0);
			field1325 = new class43(261, 190, method11());
			field1327 = new class43(334, 512, method11());
			class33.method154();
			field1314 = new class43(50, 496, method11());
			field1315 = new class43(37, 269, method11());
			field1316 = new class43(45, 249, method11());
			field1343 = true;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method479() {
		try {
			if (field1221 != null) {
				field1221.method38();
			}
		} catch (Exception var2) {
		}

		field1221 = null;
		field1390 = false;
		field1167 = 0;
		field1409 = "";
		field1410 = "";
		method503();
		field1353.method50();

		for (int var1 = 0; var1 < 4; var1++) {
			field1074[var1].method353();
		}

		System.gc();
		method460();
		field1125 = -1;
		field1435 = -1;
		field1052 = 0;
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public final void method480(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1178; var3++) {
			int var4 = field1179[var3];
			class26 var5 = field1415[var4];
			int var6 = arg0.method225();
			if ((var6 & 0x1) == 1) {
				int var7 = arg0.method225();
				int var8 = arg0.method225();
				var5.method114(var7, var8, field1160);
				var5.field379 = field1160 + 300;
				var5.field380 = arg0.method225();
				var5.field381 = arg0.method225();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg0.method227();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field388 == var9) {
					var5.field392 = 0;
				}

				int var10 = arg0.method225();
				if (var5.field388 == var9 && var9 != -1) {
					int var11 = class66.field985[var9].field999;
					if (var11 == 1) {
						var5.field389 = 0;
						var5.field390 = 0;
						var5.field391 = var10;
						var5.field392 = 0;
					}

					if (var11 == 2) {
						var5.field392 = 0;
					}
				} else if (var9 == -1 || var5.field388 == -1 || class66.field985[var9].field993 >= class66.field985[var5.field388].field993) {
					var5.field388 = var9;
					var5.field389 = 0;
					var5.field390 = 0;
					var5.field391 = var10;
					var5.field392 = 0;
					var5.field414 = var5.field409;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field382 = arg0.method227();
				if (var5.field382 == 0xFFFF) {
					var5.field382 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field372 = arg0.method232();
				var5.field373 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.method225();
				int var13 = arg0.method225();
				var5.method114(var12, var13, field1160);
				var5.field379 = field1160 + 300;
				var5.field380 = arg0.method225();
				var5.field381 = arg0.method225();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field415 = class59.method336(arg0.method227());
				var5.field364 = var5.field415.field872;
				var5.field408 = var5.field415.field894;
				var5.field367 = var5.field415.field876;
				var5.field368 = var5.field415.field877;
				var5.field369 = var5.field415.field878;
				var5.field370 = var5.field415.field879;
				var5.field365 = var5.field415.field875;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field393 = arg0.method227();
				int var14 = arg0.method230();
				var5.field397 = var14 >> 16;
				var5.field396 = (var14 & 0xFFFF) + field1160;
				var5.field394 = 0;
				var5.field395 = 0;

				if (var5.field396 > field1160) {
					var5.field394 = -1;
				}

				if (var5.field393 == 0xFFFF) {
					var5.field393 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field383 = arg0.method227();
				var5.field384 = arg0.method227();
			}
		}
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method481() {
		int var1 = 3;
		if (field1361 < 310) {
			int var2 = field1358 >> 7;
			int var3 = field1360 >> 7;
			int var4 = field1114.field360 >> 7;
			int var5 = field1114.field361 >> 7;

			if ((field1244[field1138][var2][var3] & 0x4) != 0) {
				var1 = field1138;
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

					if ((field1244[field1138][var2][var3] & 0x4) != 0) {
						var1 = field1138;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1244[field1138][var2][var3] & 0x4) != 0) {
							var1 = field1138;
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

					if ((field1244[field1138][var2][var3] & 0x4) != 0) {
						var1 = field1138;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1244[field1138][var2][var3] & 0x4) != 0) {
							var1 = field1138;
						}
					}
				}
			}
		}

		if ((field1244[field1138][field1114.field360 >> 7][field1114.field361 >> 7] & 0x4) != 0) {
			var1 = field1138;
		}

		return var1;
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method482() {
		int var1 = method474(field1360, field1358, field1138);
		if (var1 - field1359 < 800 && (field1244[field1138][field1358 >> 7][field1360 >> 7] & 0x4) != 0) {
			return field1138;
		}

		return 3;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method483() {
		for (class32 var1 = (class32) field1092.method244(); var1 != null; var1 = (class32) field1092.method246()) {
			if (field1138 != var1.field552 || var1.field558) {
				var1.method106();
			} else if (field1160 >= var1.field551) {
				var1.method150(field1147);

				if (var1.field558) {
					var1.method106();
				} else {
					field1353.method61(var1.field555, var1.field553, 0, var1.field552, var1, -1, false, 60, var1.field554);
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method484(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(IBLy;)V")
	public final void method485(int arg0, class25 arg1) {
		method486(arg1.field361, arg0, arg1.field360);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method486(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method474(arg0, arg2, field1138) - arg1;
			arg2 -= field1358;
			var4 -= field1359;
			arg0 -= field1360;
			int var5 = class31.field546[field1361];
			int var6 = class31.field547[field1361];
			int var7 = class31.field546[field1362];
			int var8 = class31.field547[field1362];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field1447 = (var9 << 9) / arg0 + class34.field574;
				field1448 = (var11 << 9) / arg0 + class34.field575;
			} else {
				field1447 = -1;
				field1448 = -1;
			}
		} else {
			field1447 = -1;
			field1448 = -1;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method487() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1460 = (field1460 + 1) % 4;
				field1126 = true;
				field1213 = true;
				field1266.method214(154);
				field1266.method215(field1460);
				field1266.method215(field1346);
				field1266.method215(field1105);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1346 = (field1346 + 1) % 3;
				field1126 = true;
				field1213 = true;
				field1266.method214(154);
				field1266.method215(field1460);
				field1266.method215(field1346);
				field1266.method215(field1105);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1105 = (field1105 + 1) % 3;
				field1126 = true;
				field1213 = true;
				field1266.method214(154);
				field1266.method215(field1460);
				field1266.method215(field1346);
				field1266.method215(field1105);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field1429 == -1) {
					method476();
					field1171 = "";
					field1456 = false;

					for (int var1 = 0; var1 < class4.field56.length; var1++) {
						if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
							field1443 = field1429 = class4.field56[var1].field62;
							return;
						}
					}

					return;
				}

				method544("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method488() {
		if (field1349 == 0) {
			int var1 = field23;
			if (field1195 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1340) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1269 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1269 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1269 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1270 - 10 || var2 > field1272 + field1270 + 10 || var3 < field1271 - 10 || var3 > field1273 + field1271 + 10) {
						field1340 = false;

						if (field1269 == 1) {
							field1385 = true;
						}

						if (field1269 == 2) {
							field1213 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1270;
					int var5 = field1271;
					int var6 = field1272;
					int var7 = field24;
					int var8 = field25;
					if (field1269 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1269 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1269 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1091; var10++) {
						int var11 = (field1091 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method546(var9);
					}

					field1340 = false;

					if (field1269 == 1) {
						field1385 = true;
					}

					if (field1269 == 2) {
						field1213 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1091 > 0) {
					int var12 = field1420[field1091 - 1];
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = field1418[field1091 - 1];
						int var14 = field1419[field1091 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1317 = false;
							field1371 = 0;
							field1347 = var14;
							field1348 = var13;
							field1349 = 2;
							field1350 = field24;
							field1351 = field25;

							if (class4.field56[var14].field62 == field1429) {
								field1349 = 1;
							}

							if (class4.field56[var14].field62 == field1413) {
								field1349 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1388 == 1 || method496(field1091 - 1)) && field1091 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1091 > 0) {
					method546(field1091 - 1);
				}

				if (var1 != 2 || field1091 <= 0) {
					return;
				}

				method554();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg1 >= 1 && arg0 <= 102 && arg1 <= 102) {
			if (field1144 && field1138 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field1353.method76(arg2, arg0, arg1);
			}

			if (arg4 == 1) {
				var8 = field1353.method77(arg2, arg0, arg1);
			}

			if (arg4 == 2) {
				var8 = field1353.method78(arg2, arg0, arg1);
			}

			if (arg4 == 3) {
				var8 = field1353.method79(arg2, arg0, arg1);
			}

			if (var8 != 0) {
				int var12 = field1353.method80(arg2, arg0, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field1353.method67(arg1, arg0, arg2);
					class57 var16 = class57.method326(var13);
					if (var16.field831) {
						field1074[arg2].method358(arg1, arg0, var15, var14, var16.field832);
					}
				}

				if (arg4 == 1) {
					field1353.method68(arg0, arg2, arg1);
				}

				if (arg4 == 2) {
					field1353.method69(arg1, arg2, arg0);
					class57 var17 = class57.method326(var13);
					if (var17.field829 + arg0 > 103 || var17.field829 + arg1 > 103 || var17.field830 + arg0 > 103 || var17.field830 + arg1 > 103) {
						return;
					}

					if (var17.field831) {
						field1074[arg2].method359(var17.field830, arg1, var17.field829, arg0, var15, var17.field832);
					}
				}

				if (arg4 == 3) {
					field1353.method70(arg1, arg2, arg0);
					class57 var18 = class57.method326(var13);
					if (var18.field831 && var18.field833) {
						field1074[arg2].method361(arg0, arg1);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field1244[1][arg0][arg1] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				class3.method31(arg0, var19, field1309, arg1, arg3, field1353, arg5, field1074[arg2], arg2, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Llb;II)V")
	public final void method490(class38 arg0, int arg1) {
		field1404 = 0;
		field1178 = 0;
		method477(arg0, arg1);
		method439(arg1, arg0);
		method480(arg0, arg1);

		for (int var3 = 0; var3 < field1404; var3++) {
			int var4 = field1405[var3];
			if (field1160 != field1415[var4].field405) {
				field1415[var4].field415 = null;
				field1415[var4] = null;
			}
		}

		if (arg0.field617 != arg1) {
			signlink.reporterror(field1409 + " size mismatch in getnpcpos - pos:" + arg0.field617 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1416; var5++) {
			if (field1415[field1417[var5]] == null) {
				signlink.reporterror(field1409 + " null entry in npc list - pos:" + var5 + " size:" + field1416);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method491(String arg0) {
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

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 282);

			if (arg0.length == 5) {
				field1141 = Integer.parseInt(arg0[0]);
				field1142 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method536();
				} else if (arg0[2].equals("highmem")) {
					method501();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1143 = false;
				} else if (arg0[3].equals("members")) {
					field1143 = true;
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

	@ObfuscatedName("client.v(I)V")
	public final void method492() {
		if (field1261 == 0 && field1195 == 0) {
			field1224[field1091] = "Walk here";
			field1420[field1091] = 718;
			field1418[field1091] = field17;
			field1419[field1091] = field18;
			field1091++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class31.field544; var2++) {
			int var3 = class31.field545[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1353.method80(field1138, var4, var5, var3) >= 0) {
					class57 var8 = class57.method326(var7);
					if (field1261 == 1) {
						field1224[field1091] = "Use " + field1265 + " with @cya@" + var8.field825;
						field1420[field1091] = 810;
						field1421[field1091] = var3;
						field1418[field1091] = var4;
						field1419[field1091] = var5;
						field1091++;
					} else if (field1195 != 1) {
						if (var8.field841 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field841[var9] != null) {
									field1224[field1091] = var8.field841[var9] + " @cya@" + var8.field825;

									if (var9 == 0) {
										field1420[field1091] = 625;
									}

									if (var9 == 1) {
										field1420[field1091] = 721;
									}

									if (var9 == 2) {
										field1420[field1091] = 743;
									}

									if (var9 == 3) {
										field1420[field1091] = 357;
									}

									if (var9 == 4) {
										field1420[field1091] = 1071;
									}

									field1421[field1091] = var3;
									field1418[field1091] = var4;
									field1419[field1091] = var5;
									field1091++;
								}
							}
						}

						field1224[field1091] = "Examine @cya@" + var8.field825;
						field1420[field1091] = 1381;
						field1421[field1091] = var3;
						field1418[field1091] = var4;
						field1419[field1091] = var5;
						field1091++;
					} else if ((field1197 & 0x4) == 4) {
						field1224[field1091] = field1198 + " @cya@" + var8.field825;
						field1420[field1091] = 899;
						field1421[field1091] = var3;
						field1418[field1091] = var4;
						field1419[field1091] = var5;
						field1091++;
					}
				}

				if (var6 == 1) {
					class26 var10 = field1415[var7];
					if (var10.field415.field872 == 1 && (var10.field360 & 0x7F) == 0x40 && (var10.field361 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1416; var11++) {
							class26 var12 = field1415[field1417[var11]];
							if (var12 != null && var10 != var12 && var12.field415.field872 == 1 && var10.field360 == var12.field360 && var10.field361 == var12.field361) {
								method529(var5, field1417[var11], var12.field415, var4);
							}
						}

						for (int var13 = 0; var13 < field1176; var13++) {
							class27 var14 = field1175[field1177[var13]];
							if (var14 != null && var10.field360 == var14.field360 && var10.field361 == var14.field361) {
								method495(var4, field1177[var13], var5, var14);
							}
						}
					}

					method529(var5, var7, var10.field415, var4);
				}

				if (var6 == 0) {
					class27 var15 = field1175[var7];
					if ((var15.field360 & 0x7F) == 0x40 && (var15.field361 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field1416; var16++) {
							class26 var17 = field1415[field1417[var16]];
							if (var17 != null && var17.field415.field872 == 1 && var15.field360 == var17.field360 && var15.field361 == var17.field361) {
								method529(var5, field1417[var16], var17.field415, var4);
							}
						}

						for (int var18 = 0; var18 < field1176; var18++) {
							class27 var19 = field1175[field1177[var18]];
							if (var19 != null && var15 != var19 && var15.field360 == var19.field360 && var15.field361 == var19.field361) {
								method495(var4, field1177[var18], var5, var19);
							}
						}
					}

					method495(var4, var7, var5, var15);
				}

				if (var6 == 3) {
					class41 var20 = field1440[field1138][var4][var5];
					if (var20 != null) {
						for (class29 var21 = (class29) var20.method245(); var21 != null; var21 = (class29) var20.method247()) {
							class60 var22 = class60.method342(var21.field451);
							if (field1261 == 1) {
								field1224[field1091] = "Use " + field1265 + " with @lre@" + var22.field904;
								field1420[field1091] = 111;
								field1421[field1091] = var21.field451;
								field1418[field1091] = var4;
								field1419[field1091] = var5;
								field1091++;
							} else if (field1195 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field918 != null && var22.field918[var23] != null) {
										field1224[field1091] = var22.field918[var23] + " @lre@" + var22.field904;

										if (var23 == 0) {
											field1420[field1091] = 139;
										}

										if (var23 == 1) {
											field1420[field1091] = 778;
										}

										if (var23 == 2) {
											field1420[field1091] = 617;
										}

										if (var23 == 3) {
											field1420[field1091] = 224;
										}

										if (var23 == 4) {
											field1420[field1091] = 662;
										}

										field1421[field1091] = var21.field451;
										field1418[field1091] = var4;
										field1419[field1091] = var5;
										field1091++;
									} else if (var23 == 2) {
										field1224[field1091] = "Take @lre@" + var22.field904;
										field1420[field1091] = 617;
										field1421[field1091] = var21.field451;
										field1418[field1091] = var4;
										field1419[field1091] = var5;
										field1091++;
									}
								}

								field1224[field1091] = "Examine @lre@" + var22.field904;
								field1420[field1091] = 1152;
								field1421[field1091] = var21.field451;
								field1418[field1091] = var4;
								field1419[field1091] = var5;
								field1091++;
							} else if ((field1197 & 0x1) == 1) {
								field1224[field1091] = field1198 + " @lre@" + var22.field904;
								field1420[field1091] = 370;
								field1421[field1091] = var21.field451;
								field1418[field1091] = var4;
								field1419[field1091] = var5;
								field1091++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method493() {
		if (field1312 == 2) {
			for (class40 var1 = (class40) field1423.method244(); var1 != null; var1 = (class40) field1423.method246()) {
				if (var1.field645 > 0) {
					var1.field645--;
				}

				if (var1.field645 != 0) {
					if (var1.field644 > 0) {
						var1.field644--;
					}

					if (var1.field644 == 0 && var1.field636 >= 1 && var1.field637 >= 1 && var1.field636 <= 102 && var1.field637 <= 102 && (var1.field641 < 0 || class3.method30(var1.field641, var1.field643))) {
						method489(var1.field636, var1.field637, var1.field634, var1.field641, var1.field635, var1.field643, var1.field642);
						var1.field644 = -1;

						if (var1.field641 == var1.field638 && var1.field638 == -1) {
							var1.method106();
						} else if (var1.field641 == var1.field638 && var1.field642 == var1.field639 && var1.field643 == var1.field640) {
							var1.method106();
						}
					}
				} else if (var1.field638 < 0 || class3.method30(var1.field638, var1.field640)) {
					method489(var1.field636, var1.field637, var1.field634, var1.field638, var1.field635, var1.field640, var1.field639);
					var1.method106();
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method494() {
		for (class40 var1 = (class40) field1423.method244(); var1 != null; var1 = (class40) field1423.method246()) {
			if (var1.field645 == -1) {
				var1.field644 = 0;
				method516(var1);
			} else {
				var1.method106();
			}
		}
	}

	@ObfuscatedName("client.a(IIBILab;)V")
	public final void method495(int arg0, int arg1, int arg2, class27 arg3) {
		if (field1114 != arg3 && field1091 < 400) {
			String var5;
			if (arg3.field423 == 0) {
				var5 = arg3.field416 + method464(field1114.field422, arg3.field422) + " (level-" + arg3.field422 + ")";
			} else {
				var5 = arg3.field416 + " (skill-" + arg3.field423 + ")";
			}

			if (field1261 == 1) {
				field1224[field1091] = "Use " + field1265 + " with @whi@" + var5;
				field1420[field1091] = 275;
				field1421[field1091] = arg1;
				field1418[field1091] = arg0;
				field1419[field1091] = arg2;
				field1091++;
			} else if (field1195 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field1376[var6] != null) {
						field1224[field1091] = field1376[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field1376[var6].equalsIgnoreCase("attack")) {
							if (arg3.field422 > field1114.field422) {
								var7 = 2000;
							}

							if (field1114.field439 != 0 && arg3.field439 != 0) {
								if (field1114.field439 == arg3.field439) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field1377[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field1420[field1091] = var7 + 639;
						}

						if (var6 == 1) {
							field1420[field1091] = var7 + 499;
						}

						if (var6 == 2) {
							field1420[field1091] = var7 + 27;
						}

						if (var6 == 3) {
							field1420[field1091] = var7 + 387;
						}

						if (var6 == 4) {
							field1420[field1091] = var7 + 185;
						}

						field1421[field1091] = arg1;
						field1418[field1091] = arg0;
						field1419[field1091] = arg2;
						field1091++;
					}
				}
			} else if ((field1197 & 0x8) == 8) {
				field1224[field1091] = field1198 + " @whi@" + var5;
				field1420[field1091] = 131;
				field1421[field1091] = arg1;
				field1418[field1091] = arg0;
				field1419[field1091] = arg2;
				field1091++;
			}

			for (int var8 = 0; var8 < field1091; var8++) {
				if (field1420[var8] == 718) {
					field1224[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method496(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1420[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.j(B)Z")
	public final boolean method497() {
		if (field1221 == null) {
			return false;
		}

		try {
			int var1 = field1221.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1233 == -1) {
				field1221.method41(field1290.field616, 0, 1);
				field1233 = field1290.field616[0] & 0xFF;
				if (field1201 != null) {
					field1233 = field1233 - field1201.method291() & 0xFF;
				}

				field1232 = class61.field945[field1233];
				var1--;
			}

			if (field1232 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1221.method41(field1290.field616, 0, 1);
				field1232 = field1290.field616[0] & 0xFF;
				var1--;
			}

			if (field1232 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1221.method41(field1290.field616, 0, 2);
				field1290.field617 = 0;
				field1232 = field1290.method227();
				var1 -= 2;
			}

			if (var1 < field1232) {
				return false;
			}

			field1290.field617 = 0;
			field1221.method41(field1290.field616, 0, field1232);
			field1234 = 0;
			field1079 = field1078;
			field1078 = field1077;
			field1077 = field1233;

			if (field1233 == 130) {
				int var2 = field1290.method228();
				field1124 = var2;
				field1213 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 90) {
				field1200 = field1290.method225();
				if (field1260 == field1200) {
					if (field1200 == 3) {
						field1260 = 1;
					} else {
						field1260 = 3;
					}

					field1385 = true;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 64) {
				int var3 = field1290.method225();
				int var4 = field1290.method225();
				int var5 = field1290.method225();
				int var6 = field1290.method225();
				field1426[var3] = true;
				field1378[var3] = var4;
				field1127[var3] = var5;
				field1425[var3] = var6;
				field1303[var3] = 0;
				field1233 = -1;
				return true;
			}

			if (field1233 == 142) {
				int var7 = field1290.method227();
				int var8 = field1290.method227();
				class4.field56[var7].field105 = 2;
				class4.field56[var7].field106 = var8;
				field1233 = -1;
				return true;
			}

			if (field1233 == 158) {
				int var9 = field1290.method227();
				int var10 = field1290.method227();

				if (field1413 != -1) {
					field1413 = -1;
					field1213 = true;
				}

				if (field1449) {
					field1449 = false;
					field1213 = true;
				}

				field1429 = var9;
				field1411 = var10;
				field1385 = true;
				field1131 = true;
				field1320 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 106) {
				field1385 = true;
				int var11 = field1290.method227();
				class4 var12 = class4.field56[var11];
				int var13 = field1290.method225();
				for (int var14 = 0; var14 < var13; var14++) {
					var12.field57[var14] = field1290.method227();
					int var15 = field1290.method225();
					if (var15 == 255) {
						var15 = field1290.method230();
					}

					var12.field58[var14] = var15;
				}

				for (int var16 = var13; var16 < var12.field57.length; var16++) {
					var12.field57[var16] = 0;
					var12.field58[var16] = 0;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 23) {
				int var17 = field1290.method227();
				if (var17 == 0xFFFF) {
					var17 = -1;
				}

				if (field1125 != var17 && field1094 && !field1144 && field1052 == 0) {
					field1435 = var17;
					field1436 = true;
					field1279.method275(2, field1435);
				}

				field1125 = var17;
				field1233 = -1;
				return true;
			}

			if (field1233 == 15) {
				int var18 = field1290.method227();
				int var19 = field1290.method227();
				if (field1094 && !field1144) {
					field1435 = var18;
					field1436 = false;
					field1279.method275(2, field1435);
					field1052 = var19;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 77) {
				int var20 = field1290.method227();
				int var21 = field1290.method228();
				int var22 = field1290.method228();
				class4 var23 = class4.field56[var20];
				var23.field69 = var21;
				var23.field70 = var22;
				field1233 = -1;
				return true;
			}

			if (field1233 == 153) {
				field1106 = field1290.method225();
				field1107 = field1290.method225();
				for (int var24 = field1106; var24 < field1106 + 8; var24++) {
					for (int var25 = field1107; var25 < field1107 + 8; var25++) {
						if (field1440[field1138][var24][var25] != null) {
							field1440[field1138][var24][var25] = null;
							method517(var24, var25);
						}
					}
				}

				for (class40 var26 = (class40) field1423.method244(); var26 != null; var26 = (class40) field1423.method246()) {
					if (var26.field636 >= field1106 && var26.field636 < field1106 + 8 && var26.field637 >= field1107 && var26.field637 < field1107 + 8 && field1138 == var26.field634) {
						var26.field645 = 0;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 171) {
				if (field1411 != -1) {
					field1411 = -1;
					field1385 = true;
					field1131 = true;
				}

				if (field1413 != -1) {
					field1413 = -1;
					field1213 = true;
				}

				if (field1449) {
					field1449 = false;
					field1213 = true;
				}

				field1429 = -1;
				field1320 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 161) {
				String var27 = field1290.method232();
				if (var27.endsWith(":tradereq:")) {
					String var28 = var27.substring(0, var27.indexOf(":"));
					long var29 = class51.method296(var28);
					boolean var31 = false;
					for (int var32 = 0; var32 < field1148; var32++) {
						if (field1430[var32] == var29) {
							var31 = true;
							break;
						}
					}

					if (!var31 && field1259 == 0) {
						method544(var28, "wishes to trade with you.", 4);
					}
				} else if (var27.endsWith(":duelreq:")) {
					String var33 = var27.substring(0, var27.indexOf(":"));
					long var34 = class51.method296(var33);
					boolean var36 = false;
					for (int var37 = 0; var37 < field1148; var37++) {
						if (field1430[var37] == var34) {
							var36 = true;
							break;
						}
					}

					if (!var36 && field1259 == 0) {
						method544(var33, "wishes to duel with you.", 8);
					}
				} else if (var27.endsWith(":chalreq:")) {
					String var38 = var27.substring(0, var27.indexOf(":"));
					long var39 = class51.method296(var38);
					boolean var41 = false;
					for (int var42 = 0; var42 < field1148; var42++) {
						if (field1430[var42] == var39) {
							var41 = true;
							break;
						}
					}

					if (!var41 && field1259 == 0) {
						String var43 = var27.substring(var27.indexOf(":") + 1, var27.length() - 9);
						method544(var38, var43, 8);
					}
				} else {
					method544("", var27, 0);
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 129) {
				int var44 = field1290.method227();
				int var45 = field1290.method227();
				class4.field56[var44].field105 = 1;
				class4.field56[var44].field106 = var45;
				field1233 = -1;
				return true;
			}

			if (field1233 == 231) {
				int var46 = field1290.method227();
				int var47 = field1290.method227();
				if (field1406 == var46 && field1407 == var47 && field1312 == 2) {
					field1233 = -1;
					return true;
				}

				field1406 = var46;
				field1407 = var47;
				field1186 = (field1406 - 6) * 8;
				field1187 = (field1407 - 6) * 8;
				field1414 = false;
				if ((field1406 / 8 == 48 || field1406 / 8 == 49) && field1407 / 8 == 48) {
					field1414 = true;
				}

				if (field1406 / 8 == 48 && field1407 / 8 == 148) {
					field1414 = true;
				}

				field1312 = 1;
				field1366 = System.currentTimeMillis();
				field1327.method254();
				field1453.method200(257, 0, "Loading - please wait.", 151);
				field1453.method200(256, 0xFFFFFF, "Loading - please wait.", 150);
				field1327.method255(field9, 4, 4);
				int var48 = 0;
				for (int var49 = (field1406 - 6) / 8; var49 <= (field1406 + 6) / 8; var49++) {
					for (int var50 = (field1407 - 6) / 8; var50 <= (field1407 + 6) / 8; var50++) {
						var48++;
					}
				}

				field1363 = new byte[var48][];
				field1277 = new byte[var48][];
				field1392 = new int[var48];
				field1393 = new int[var48];
				field1394 = new int[var48];
				int var51 = 0;
				for (int var52 = (field1406 - 6) / 8; var52 <= (field1406 + 6) / 8; var52++) {
					for (int var53 = (field1407 - 6) / 8; var53 <= (field1407 + 6) / 8; var53++) {
						field1392[var51] = (var52 << 8) + var53;

						if (field1414 && (var53 == 49 || var53 == 149 || var53 == 147 || var52 == 50 || var52 == 49 && var53 == 47)) {
							field1393[var51] = -1;
							field1394[var51] = -1;
							var51++;
						} else {
							int var54 = field1393[var51] = field1279.method270(0, var52, var53);
							if (var54 != -1) {
								field1279.method275(3, var54);
							}

							int var55 = field1394[var51] = field1279.method270(1, var52, var53);
							if (var55 != -1) {
								field1279.method275(3, var55);
							}

							var51++;
						}
					}
				}

				int var56 = field1186 - field1188;
				int var57 = field1187 - field1189;
				field1188 = field1186;
				field1189 = field1187;

				for (int var58 = 0; var58 < 16384; var58++) {
					class26 var59 = field1415[var58];
					if (var59 != null) {
						for (int var60 = 0; var60 < 10; var60++) {
							var59.field410[var60] -= var56;
							var59.field411[var60] -= var57;
						}

						var59.field360 -= var56 * 128;
						var59.field361 -= var57 * 128;
					}
				}

				for (int var61 = 0; var61 < field1173; var61++) {
					class27 var62 = field1175[var61];
					if (var62 != null) {
						for (int var63 = 0; var63 < 10; var63++) {
							var62.field410[var63] -= var56;
							var62.field411[var63] -= var57;
						}

						var62.field360 -= var56 * 128;
						var62.field361 -= var57 * 128;
					}
				}

				field1249 = true;
				byte var64 = 0;
				byte var65 = 104;
				byte var66 = 1;
				if (var56 < 0) {
					var64 = 103;
					var65 = -1;
					var66 = -1;
				}

				byte var67 = 0;
				byte var68 = 104;
				byte var69 = 1;
				if (var57 < 0) {
					var67 = 103;
					var68 = -1;
					var69 = -1;
				}

				for (int var70 = var64; var70 != var65; var70 += var66) {
					for (int var71 = var67; var71 != var68; var71 += var69) {
						int var72 = var56 + var70;
						int var73 = var57 + var71;
						for (int var74 = 0; var74 < 4; var74++) {
							if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
								field1440[var74][var70][var71] = field1440[var74][var72][var73];
							} else {
								field1440[var74][var70][var71] = null;
							}
						}
					}
				}

				for (class40 var75 = (class40) field1423.method244(); var75 != null; var75 = (class40) field1423.method246()) {
					var75.field636 -= var56;
					var75.field637 -= var57;
					if (var75.field636 < 0 || var75.field637 < 0 || var75.field636 >= 104 || var75.field637 >= 104) {
						var75.method106();
					}
				}

				if (field1111 != 0) {
					field1111 -= var56;
					field1112 -= var57;
				}

				field1185 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 192) {
				int var76 = field1290.method227();
				class4.field56[var76].field105 = 3;

				if (field1114.field438 == null) {
					class4.field56[var76].field106 = (field1114.field420[8] << 6) + (field1114.field420[0] << 12) + (field1114.field421[0] << 24) + (field1114.field421[4] << 18) + field1114.field420[11];
				} else {
					class4.field56[var76].field106 = (int) (field1114.field438.field869 + 0x12345678L);
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 167) {
				method504(field1232, field1290);
				field1249 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 17) {
				int var77 = field1290.method225();
				int var78 = field1290.method225();
				String var79 = field1290.method232();
				if (var77 >= 1 && var77 <= 5) {
					if (var79.equalsIgnoreCase("null")) {
						var79 = null;
					}

					field1376[var77 - 1] = var79;
					field1377[var77 - 1] = var78 == 0;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 240) {
				int var80 = field1290.method228();
				if (var80 >= 0) {
					method556(var80);
				}

				field1220 = var80;
				field1233 = -1;
				return true;
			}

			if (field1233 == 203) {
				int var81 = field1290.method227();
				byte var82 = field1290.method226();
				field1397[var81] = var82;

				if (field1389[var81] != var82) {
					field1389[var81] = var82;
					method437(var81);
					field1385 = true;

					if (field1124 != -1) {
						field1213 = true;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 245) {
				int var83 = field1290.method227();
				int var84 = field1290.method230();
				field1397[var83] = var84;

				if (field1389[var83] != var84) {
					field1389[var83] = var84;
					method437(var83);
					field1385 = true;

					if (field1124 != -1) {
						field1213 = true;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 156) {
				field1226 = field1290.method225();
				if (field1226 == 1) {
					field1145 = field1290.method227();
				}

				if (field1226 >= 2 && field1226 <= 6) {
					if (field1226 == 2) {
						field1136 = 64;
						field1137 = 64;
					}

					if (field1226 == 3) {
						field1136 = 0;
						field1137 = 64;
					}

					if (field1226 == 4) {
						field1136 = 128;
						field1137 = 64;
					}

					if (field1226 == 5) {
						field1136 = 64;
						field1137 = 0;
					}

					if (field1226 == 6) {
						field1136 = 64;
						field1137 = 128;
					}

					field1226 = 2;
					field1133 = field1290.method227();
					field1134 = field1290.method227();
					field1135 = field1290.method225();
				}

				if (field1226 == 10) {
					field1457 = field1290.method227();
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 227) {
				int var85 = field1290.method227();
				class4 var86 = class4.field56[var85];
				for (int var87 = 0; var87 < var86.field57.length; var87++) {
					var86.field57[var87] = -1;
					var86.field57[var87] = 0;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 134) {
				int var88 = field1290.method227();
				int var89 = field1290.method228();
				class4 var90 = class4.field56[var88];
				var90.field109 = var89;

				if (var89 == -1) {
					var90.field59 = 0;
					var90.field60 = 0;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 233) {
				field1185 = true;
				field1239 = field1290.method225();
				field1240 = field1290.method225();
				field1241 = field1290.method227();
				field1242 = field1290.method225();
				field1243 = field1290.method225();
				if (field1243 >= 100) {
					int var91 = field1239 * 128 + 64;
					int var92 = field1240 * 128 + 64;
					int var93 = method474(var92, var91, field1138) - field1241;
					int var94 = var91 - field1358;
					int var95 = var93 - field1359;
					int var96 = var92 - field1360;
					int var97 = (int) Math.sqrt(var94 * var94 + var96 * var96);
					field1361 = (int) (Math.atan2(var95, var97) * 325.949D) & 0x7FF;
					field1362 = (int) (Math.atan2(var94, var96) * -325.949D) & 0x7FF;

					if (field1361 < 128) {
						field1361 = 128;
					}

					if (field1361 > 383) {
						field1361 = 383;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 210) {
				field1056 = false;
				field1449 = true;
				field1049 = "";
				field1213 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 195) {
				field1106 = field1290.method225();
				field1107 = field1290.method225();

				while (field1290.field617 < field1232) {
					int var98 = field1290.method225();
					method442(var98, field1290);
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 105) {
				field1385 = true;
				int var99 = field1290.method225();
				int var100 = field1290.method230();
				int var101 = field1290.method225();
				field1202[var99] = var100;
				field1267[var99] = var101;
				field1255[var99] = 1;
				for (int var102 = 0; var102 < 98; var102++) {
					if (var100 >= field1183[var102]) {
						field1255[var99] = var102 + 2;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 114) {
				field1460 = field1290.method225();
				field1346 = field1290.method225();
				field1105 = field1290.method225();
				field1126 = true;
				field1213 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 235) {
				long var103 = field1290.method231();
				int var105 = field1290.method230();
				int var106 = field1290.method225();
				boolean var107 = false;
				for (int var108 = 0; var108 < 100; var108++) {
					if (field1428[var108] == var105) {
						var107 = true;
						break;
					}
				}

				if (var106 <= 1) {
					for (int var109 = 0; var109 < field1148; var109++) {
						if (field1430[var109] == var103) {
							var107 = true;
							break;
						}
					}
				}

				if (!var107 && field1259 == 0) {
					try {
						field1428[field1247] = var105;
						field1247 = (field1247 + 1) % 100;
						String var110 = class52.method303(field1232 - 13, field1290);
						var110 = class71.method395(var110);
						if (var106 == 2 || var106 == 3) {
							method544("@cr2@" + class51.method300(class51.method297(var103)), var110, 7);
						} else if (var106 == 1) {
							method544("@cr1@" + class51.method300(class51.method297(var103)), var110, 7);
						} else {
							method544(class51.method300(class51.method297(var103)), var110, 3);
						}
					} catch (Exception var162) {
						signlink.reporterror("cde1");
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 183) {
				int var112 = field1290.method227();
				int var113 = field1290.method227();
				int var114 = var113 >> 10 & 0x1F;
				int var115 = var113 >> 5 & 0x1F;
				int var116 = var113 & 0x1F;
				class4.field56[var112].field99 = (var116 << 3) + (var114 << 19) + (var115 << 11);
				field1233 = -1;
				return true;
			}

			if (field1233 == 10) {
				int var117 = field1290.method227();
				boolean var118 = field1290.method225() == 1;
				class4.field56[var117].field77 = var118;
				field1233 = -1;
				return true;
			}

			if (field1233 == 194) {
				field1165 = field1290.method225();
				field1233 = -1;
				return true;
			}

			if (field1233 == 89) {
				field1444 = field1290.method227() * 30;
				field1233 = -1;
				return true;
			}

			if (field1233 == 190) {
				for (int var119 = 0; var119 < field1389.length; var119++) {
					if (field1397[var119] != field1389[var119]) {
						field1389[var119] = field1397[var119];
						method437(var119);
						field1385 = true;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 32) {
				field1106 = field1290.method225();
				field1107 = field1290.method225();
				field1233 = -1;
				return true;
			}

			if (field1233 == 247) {
				long var120 = field1290.method231();
				int var122 = field1290.method225();
				String var123 = class51.method300(class51.method297(var120));
				for (int var124 = 0; var124 < field1080; var124++) {
					if (field1225[var124] == var120) {
						if (field1464[var124] != var122) {
							field1464[var124] = var122;
							field1385 = true;

							if (var122 > 0) {
								method544("", var123 + " has logged in.", 5);
							}

							if (var122 == 0) {
								method544("", var123 + " has logged out.", 5);
							}
						}

						var123 = null;
						break;
					}
				}

				if (var123 != null && field1080 < 200) {
					field1225[field1080] = var120;
					field1341[field1080] = var123;
					field1464[field1080] = var122;
					field1080++;
					field1385 = true;
				}

				boolean var125 = false;
				while (!var125) {
					var125 = true;
					for (int var126 = 0; var126 < field1080 - 1; var126++) {
						if (field1464[var126] != field1141 && field1464[var126 + 1] == field1141 || field1464[var126] == 0 && field1464[var126 + 1] != 0) {
							int var127 = field1464[var126];
							field1464[var126] = field1464[var126 + 1];
							field1464[var126 + 1] = var127;
							String var128 = field1341[var126];
							field1341[var126] = field1341[var126 + 1];
							field1341[var126 + 1] = var128;
							long var129 = field1225[var126];
							field1225[var126] = field1225[var126 + 1];
							field1225[var126 + 1] = var129;
							field1385 = true;
							var125 = false;
						}
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 200) {
				field1185 = true;
				field1379 = field1290.method225();
				field1380 = field1290.method225();
				field1381 = field1290.method227();
				field1382 = field1290.method225();
				field1383 = field1290.method225();
				if (field1383 >= 100) {
					field1358 = field1379 * 128 + 64;
					field1360 = field1380 * 128 + 64;
					field1359 = method474(field1360, field1358, field1138) - field1381;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 215) {
				int var131 = field1290.method227();
				int var132 = field1290.method225();

				if (var131 == 0xFFFF) {
					var131 = -1;
				}

				field1169[var132] = var131;
				field1385 = true;
				field1131 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 115) {
				field1111 = 0;
				field1233 = -1;
				return true;
			}

			if (field1233 == 44) {
				int var133 = field1290.method227();
				String var134 = field1290.method232();
				class4.field56[var133].field97 = var134;

				if (field1169[field1260] == class4.field56[var133].field62) {
					field1385 = true;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 166) {
				int var135 = field1290.method227();
				method556(var135);

				if (field1411 != -1) {
					field1411 = -1;
					field1385 = true;
					field1131 = true;
				}

				field1413 = var135;
				field1213 = true;
				field1429 = -1;
				field1320 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 91) {
				field1050 = field1290.method230();
				field1223 = field1290.method227();
				field1116 = field1290.method225();
				field1288 = field1290.method227();
				field1438 = field1290.method225();
				if (field1050 != 0 && field1429 == -1) {
					signlink.dnslookup(class51.method299(field1050));
					method476();
					short var136 = 650;
					if (field1116 != 201 || field1438 == 1) {
						var136 = 655;
					}

					field1171 = "";
					field1456 = false;

					for (int var137 = 0; var137 < class4.field56.length; var137++) {
						if (class4.field56[var137] != null && class4.field56[var137].field65 == var136) {
							field1429 = class4.field56[var137].field62;
							break;
						}
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 133) {
				field1304 = field1290.method227();
				field1384 = field1290.method225();
				field1233 = -1;
				return true;
			}

			if (field1233 == 207) {
				field1181 = field1290.method225();
				field1233 = -1;
				return true;
			}

			if (field1233 == 172) {
				field1385 = true;
				int var138 = field1290.method227();
				class4 var139 = class4.field56[var138];
				while (field1290.field617 < field1232) {
					int var140 = field1290.method225();
					int var141 = field1290.method227();
					int var142 = field1290.method225();
					if (var142 == 255) {
						var142 = field1290.method230();
					}

					if (var140 >= 0 && var140 < var139.field57.length) {
						var139.field57[var140] = var141;
						var139.field58[var140] = var142;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 88) {
				method479();
				field1233 = -1;
				return false;
			}

			if (field1233 == 241) {
				field1260 = field1290.method225();
				field1385 = true;
				field1131 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 28) {
				int var143 = field1290.method227();
				int var144 = field1290.method227();
				int var145 = field1290.method227();

				if (var144 == 0xFFFF) {
					class4.field56[var143].field105 = 0;
					field1233 = -1;
					return true;
				}

				class60 var146 = class60.method342(var144);
				class4.field56[var143].field105 = 4;
				class4.field56[var143].field106 = var144;
				class4.field56[var143].field112 = var146.field909;
				class4.field56[var143].field113 = var146.field910;
				class4.field56[var143].field111 = var146.field908 * 100 / var145;
				field1233 = -1;
				return true;
			}

			if (field1233 == 211) {
				int var147 = field1290.method227();
				method556(var147);

				if (field1411 != -1) {
					field1411 = -1;
					field1385 = true;
					field1131 = true;
				}

				if (field1413 != -1) {
					field1413 = -1;
					field1213 = true;
				}

				if (field1449) {
					field1449 = false;
					field1213 = true;
				}

				field1429 = var147;
				field1320 = false;
				field1233 = -1;
				return true;
			}

			if (field1233 == 101) {
				field1185 = false;

				for (int var148 = 0; var148 < 5; var148++) {
					field1426[var148] = false;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 3) {
				field1148 = field1232 / 8;
				for (int var149 = 0; var149 < field1148; var149++) {
					field1430[var149] = field1290.method231();
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 47) {
				for (int var150 = 0; var150 < field1175.length; var150++) {
					if (field1175[var150] != null) {
						field1175[var150].field388 = -1;
					}
				}

				for (int var151 = 0; var151 < field1415.length; var151++) {
					if (field1415[var151] != null) {
						field1415[var151].field388 = -1;
					}
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 67) {
				if (field1260 == 12) {
					field1385 = true;
				}

				field1296 = field1290.method228();
				field1233 = -1;
				return true;
			}

			if (field1233 == 95 || field1233 == 176 || field1233 == 219 || field1233 == 85 || field1233 == 107 || field1233 == 52 || field1233 == 81 || field1233 == 48 || field1233 == 173 || field1233 == 138) {
				method442(field1233, field1290);
				field1233 = -1;
				return true;
			}

			if (field1233 == 54) {
				int var152 = field1290.method227();
				int var153 = field1290.method227();
				class4 var154 = class4.field56[var152];
				if (var154 != null && var154.field63 == 0) {
					if (var153 < 0) {
						var153 = 0;
					}

					if (var153 > var154.field75 - var154.field67) {
						var153 = var154.field75 - var154.field67;
					}

					var154.field76 = var153;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 83) {
				if (field1260 == 12) {
					field1385 = true;
				}

				field1203 = field1290.method225();
				field1233 = -1;
				return true;
			}

			if (field1233 == 197) {
				method490(field1290, field1232);
				field1233 = -1;
				return true;
			}

			if (field1233 == 185) {
				field1081 = field1290.method225();
				field1385 = true;
				field1233 = -1;
				return true;
			}

			if (field1233 == 34) {
				int var155 = field1290.method227();
				int var156 = field1290.method225();
				int var157 = field1290.method227();
				if (field1367 && !field1144 && field1157 < 50) {
					field1274[field1157] = var155;
					field1257[field1157] = var156;
					field1150[field1157] = class55.field785[var155] + var157;
					field1157++;
				}

				field1233 = -1;
				return true;
			}

			if (field1233 == 16) {
				int var158 = field1290.method227();
				method556(var158);

				if (field1413 != -1) {
					field1413 = -1;
					field1213 = true;
				}

				if (field1449) {
					field1449 = false;
					field1213 = true;
				}

				field1411 = var158;
				field1385 = true;
				field1131 = true;
				field1429 = -1;
				field1320 = false;
				field1233 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1233 + "," + field1232 + " - " + field1078 + "," + field1079);
			method479();
		} catch (IOException var163) {
			method510();
		} catch (Exception var164) {
			String var160 = "T2 - " + field1233 + "," + field1078 + "," + field1079 + " - " + field1232 + "," + (field1114.field410[0] + field1186) + "," + (field1114.field411[0] + field1187) + " - ";
			for (int var161 = 0; var161 < field1232 && var161 < 50; var161++) {
				var160 = var160 + field1290.field616[var161] + ",";
			}

			signlink.reporterror(var160);
			method479();
		}

		return true;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method498() {
		int var1 = field1270;
		int var2 = field1271;
		int var3 = field1272;
		int var4 = field1273;
		int var5 = 0x5D5447;
		class33.method156(var1, var5, var4, var3, var2);
		class33.method156(var1 + 1, 0, 16, var3 - 2, var2 + 1);
		class33.method157(var3 - 2, 0, var4 - 19, var2 + 18, var1 + 1);
		field1454.method204(var1 + 3, "Choose Option", var2 + 14, var5);
		int var6 = field17;
		int var7 = field18;
		if (field1269 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1269 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1269 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1091; var8++) {
			int var9 = (field1091 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1454.method206(var9, var1 + 3, true, var10, field1224[var8]);
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method499() {
		if (field1349 == 0) {
			field1224[0] = "Cancel";
			field1420[0] = 1106;
			field1091 = 1;
			method436();
			field1292 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1429 == -1) {
					method492();
				} else {
					method447(class4.field56[field1429], 4, field17, field18, 0, 4);
				}
			}

			if (field1292 != field1122) {
				field1122 = field1292;
			}

			field1292 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1411 != -1) {
					method447(class4.field56[field1411], 553, field17, field18, 0, 205);
				} else if (field1169[field1260] != -1) {
					method447(class4.field56[field1169[field1260]], 553, field17, field18, 0, 205);
				}
			}

			if (field1292 != field1104) {
				field1385 = true;
				field1104 = field1292;
			}

			field1292 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1413 != -1) {
					method447(class4.field56[field1413], 17, field17, field18, 0, 357);
				} else if (field18 < 434 && field17 < 426) {
					method500(field18 - 357, field17 - 17);
				}
			}

			if (field1413 != -1 && field1292 != field1149) {
				field1213 = true;
				field1149 = field1292;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1091 - 1; var2++) {
					if (field1420[var2] < 1000 && field1420[var2 + 1] > 1000) {
						String var3 = field1224[var2];
						field1224[var2] = field1224[var2 + 1];
						field1224[var2 + 1] = var3;
						int var4 = field1420[var2];
						field1420[var2] = field1420[var2 + 1];
						field1420[var2 + 1] = var4;
						int var5 = field1418[var2];
						field1418[var2] = field1418[var2 + 1];
						field1418[var2 + 1] = var5;
						int var6 = field1419[var2];
						field1419[var2] = field1419[var2 + 1];
						field1419[var2 + 1] = var6;
						int var7 = field1421[var2];
						field1421[var2] = field1421[var2 + 1];
						field1421[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method500(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1285[var4] != null) {
				int var5 = field1283[var4];
				int var6 = field1295 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1284[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1460 == 0 || field1460 == 1 && method430(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field1114.field416)) {
						if (field1278 >= 1) {
							field1224[field1091] = "Report abuse @whi@" + var7;
							field1420[field1091] = 524;
							field1091++;
						}

						field1224[field1091] = "Add ignore @whi@" + var7;
						field1420[field1091] = 47;
						field1091++;
						field1224[field1091] = "Add friend @whi@" + var7;
						field1420[field1091] = 605;
						field1091++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1128 == 0 && (var5 == 7 || field1346 == 0 || field1346 == 1 && method430(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field1278 >= 1) {
							field1224[field1091] = "Report abuse @whi@" + var7;
							field1420[field1091] = 524;
							field1091++;
						}

						field1224[field1091] = "Add ignore @whi@" + var7;
						field1420[field1091] = 47;
						field1091++;
						field1224[field1091] = "Add friend @whi@" + var7;
						field1420[field1091] = 605;
						field1091++;
					}

					var3++;
				}

				if (var5 == 4 && (field1105 == 0 || field1105 == 1 && method430(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1224[field1091] = "Accept trade @whi@" + var7;
						field1420[field1091] = 507;
						field1091++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1128 == 0 && field1346 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1105 == 0 || field1105 == 1 && method430(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field1224[field1091] = "Accept challenge @whi@" + var7;
						field1420[field1091] = 957;
						field1091++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public static final void method501() {
		class18.field258 = false;
		class34.field569 = false;
		field1144 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1368.method198(arg2, arg1);
		field1369.method198(arg2, arg1 + arg4 - 16);
		class33.method156(arg2, field1184, arg4 - 32, 16, arg1 + 16);
		int var6 = (arg4 - 32) * arg4 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
		class33.method156(arg2, field1305, var6, 16, arg1 + var7 + 16);
		class33.method161(var6, arg2, arg1 + var7 + 16, field1093);
		class33.method161(var6, arg2 + 1, arg1 + 16 + var7, field1093);
		class33.method159(arg1 + var7 + 16, field1093, 16, arg2);
		class33.method159(arg1 + var7 + 17, field1093, 16, arg2);
		class33.method161(var6, arg2 + 15, arg1 + 16 + var7, field1338);
		class33.method161(var6 - 1, arg2 + 14, arg1 + var7 + 17, field1338);
		class33.method159(arg1 + var7 + var6 + 15, field1338, 16, arg2);
		class33.method159(arg1 + var7 + var6 + 14, field1338, 15, arg2 + 1);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method503() {
		class57.field856.method103();
		class57.field857.method103();
		class59.field895.method103();
		class60.field942.method103();
		class60.field943.method103();
		class27.field440.method103();
		class68.field1017.method103();
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public final void method504(int arg0, class38 arg1) {
		field1404 = 0;
		field1178 = 0;
		method468(arg1, arg0);
		method511(arg1, arg0);
		method429(arg0, arg1);
		method525(arg1, arg0);

		for (int var3 = 0; var3 < field1404; var3++) {
			int var4 = field1405[var3];
			if (field1160 != field1175[var4].field405) {
				field1175[var4] = null;
			}
		}

		if (arg1.field617 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field617 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1176; var5++) {
			if (field1175[field1177[var5]] == null) {
				signlink.reporterror(field1409 + " null entry in pl list - pos:" + var5 + " size:" + field1176);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method505(int arg0) {
		int[] var2 = field1113.field592;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1244[arg0][var7][var5] & 0x18) == 0) {
					field1353.method85(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1244[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1353.method85(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1113.method180();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1244[arg0][var11][var10] & 0x18) == 0) {
					method528(var8, var10, var11, var9, arg0);
				}

				if (arg0 < 3 && (field1244[arg0 + 1][var11][var10] & 0x8) != 0) {
					method528(var8, var10, var11, var9, arg0 + 1);
				}
			}
		}

		field1327.method254();
		field1298 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1353.method79(field1138, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method326(var14).field842;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1074[field1138].field950;
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

						field1442[field1298] = field1399[var15];
						field1299[field1298] = var16;
						field1300[field1298] = var17;
						field1298++;
					}
				}
			}
		}

		field1458++;
		if (field1458 > 112) {
			field1458 = 0;
			field1266.method214(52);
			field1266.method215(50);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method506() {
		short var1 = 256;

		if (field1445 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1445 > 768) {
					field1250[var2] = method465(field1252[var2], field1251[var2], 1024 - field1445);
				} else if (field1445 > 256) {
					field1250[var2] = field1252[var2];
				} else {
					field1250[var2] = method465(field1251[var2], field1252[var2], 256 - field1445);
				}
			}
		} else if (field1446 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1446 > 768) {
					field1250[var3] = method465(field1253[var3], field1251[var3], 1024 - field1446);
				} else if (field1446 > 256) {
					field1250[var3] = field1253[var3];
				} else {
					field1250[var3] = method465(field1251[var3], field1253[var3], 256 - field1446);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1250[var4] = field1251[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1332.field650[var5] = field1307.field592[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1462[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1163[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1250[var12];
					int var15 = field1332.field650[var7];
					field1332.field650[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1332.method255(field9, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1333.field650[var16] = field1308.field592[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1462[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1163[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1250[var23];
					int var26 = field1333.field650[var18];
					field1333.field650[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1333.method255(field9, 637, 0);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method507() {
		field1102 = new class36(field1357, "titlebox", 0);
		field1103 = new class36(field1357, "titlebutton", 0);
		field1306 = new class36[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field1306[var2] = new class36(field1357, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field1306[var3] = new class36(field1357, "runes", (var3 & 0x3) + 12);
			}
		}

		field1307 = new class35(128, 265);
		field1308 = new class35(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field1307.field592[var4] = field1332.field650[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1308.field592[var5] = field1333.field650[var5];
		}

		field1251 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field1251[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1251[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field1251[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1251[var9 + 192] = 0xFFFFFF;
		}

		field1252 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field1252[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1252[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field1252[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1252[var13 + 192] = 0xFFFFFF;
		}

		field1253 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field1253[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1253[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field1253[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field1253[var17 + 192] = 0xFFFFFF;
		}

		field1250 = new int[256];
		field1096 = new int[32768];
		field1097 = new int[32768];
		method461(null);
		field1163 = new int[32768];
		field1164 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field1310) {
			field1465 = true;
			field1310 = true;
			method12(this, 2);
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIIZ)Z")
	public final boolean method508(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1117[var14][var15] = 0;
				field1101[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg2;
		field1117[arg4][arg2] = 99;
		field1101[arg4][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1466[var18] = arg4;
		int var35 = var18 + 1;
		field1467[var18] = arg2;
		boolean var20 = false;
		int var21 = field1466.length;
		int[][] var22 = field1074[field1138].field950;
		while (var35 != var19) {
			var16 = field1466[var19];
			var17 = field1467[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && field1074[field1138].method362(var17, arg9, arg8, var16, arg6, arg5 - 1)) {
					var20 = true;
					break;
				}

				if (arg5 < 10 && field1074[field1138].method363(var16, var17, arg5 - 1, arg8, arg6, arg9)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg7 != 0 && field1074[field1138].method364(arg6, var16, arg8, arg3, var17, arg1, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field1101[var16][var17] + 1;
			if (var16 > 0 && field1117[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1466[var35] = var16 - 1;
				field1467[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17] = 2;
				field1101[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1117[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1466[var35] = var16 + 1;
				field1467[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17] = 8;
				field1101[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1117[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1466[var35] = var16;
				field1467[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16][var17 - 1] = 1;
				field1101[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1117[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1466[var35] = var16;
				field1467[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16][var17 + 1] = 4;
				field1101[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1117[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1466[var35] = var16 - 1;
				field1467[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17 - 1] = 3;
				field1101[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1117[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1466[var35] = var16 + 1;
				field1467[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17 - 1] = 9;
				field1101[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1117[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1466[var35] = var16 - 1;
				field1467[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17 + 1] = 6;
				field1101[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1117[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1466[var35] = var16 + 1;
				field1467[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17 + 1] = 12;
				field1101[var16 + 1][var17 + 1] = var23;
			}
		}

		field1345 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1101[var26][var27] < var24) {
								var24 = field1101[var26][var27];
								var16 = var26;
								var17 = var27;
								field1345 = 1;
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
		field1466[var28] = var16;
		int var36 = var28 + 1;
		field1467[var28] = var17;
		int var29;
		int var30 = var29 = field1117[var16][var17];
		while (arg4 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1466[var36] = var16;
				field1467[var36++] = var17;
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

			var30 = field1117[var16][var17];
		}

		if (var36 <= 0) {
			if (arg10 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field1466[var36];
		int var33 = field1467[var36];

		if (arg10 == 0) {
			field1266.method214(207);
			field1266.method215(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field1266.method214(86);
			field1266.method215(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field1266.method214(138);
			field1266.method215(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1266.method215(1);
		} else {
			field1266.method215(0);
		}

		field1266.method216(field1186 + var32);
		field1266.method216(field1187 + var33);
		field1111 = field1466[0];
		field1112 = field1467[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1266.method215(field1466[var36] - var32);
			field1266.method215(field1467[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.e(III)Z")
	public final boolean method509(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg0];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method509(var6.field61, arg1);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method425(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field985[var8];
					var6.field60 += arg1;
					while (var6.field60 > var9.method376(var6.field59)) {
						var6.field60 -= var9.method376(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field986) {
							var6.field59 -= var9.field990;
							if (var6.field59 < 0 || var6.field59 >= var9.field986) {
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

	@ObfuscatedName("client.a(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1221 != null) {
				field1221.method38();
			}
		} catch (Exception var1) {
		}

		field1221 = null;
		method460();

		if (field1110 != null) {
			field1110.field859 = false;
		}

		field1110 = null;
		field1279.method267();
		field1279 = null;
		field1266 = null;
		field1391 = null;
		field1290 = null;
		field1392 = null;
		field1363 = null;
		field1277 = null;
		field1393 = null;
		field1394 = null;
		field1309 = null;
		field1244 = null;
		field1353 = null;
		field1074 = null;
		field1117 = null;
		field1101 = null;
		field1466 = null;
		field1467 = null;
		field1123 = null;
		field1325 = null;
		field1326 = null;
		field1327 = null;
		field1328 = null;
		field1314 = null;
		field1315 = null;
		field1316 = null;
		field1082 = null;
		field1083 = null;
		field1084 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1088 = null;
		field1089 = null;
		field1090 = null;
		field1204 = null;
		field1205 = null;
		field1206 = null;
		field1354 = null;
		field1355 = null;
		field1356 = null;
		field1297 = null;
		field1208 = null;
		field1209 = null;
		field1210 = null;
		field1211 = null;
		field1212 = null;
		field1190 = null;
		field1191 = null;
		field1192 = null;
		field1193 = null;
		field1194 = null;
		field1159 = null;
		field1100 = null;
		field1323 = null;
		field1231 = null;
		field1118 = null;
		field1119 = null;
		field1120 = null;
		field1121 = null;
		field1254 = null;
		field1399 = null;
		field1199 = null;
		field1175 = null;
		field1177 = null;
		field1179 = null;
		field1180 = null;
		field1405 = null;
		field1415 = null;
		field1417 = null;
		field1440 = null;
		field1423 = null;
		field1248 = null;
		field1092 = null;
		field1418 = null;
		field1419 = null;
		field1420 = null;
		field1421 = null;
		field1224 = null;
		field1389 = null;
		field1299 = null;
		field1300 = null;
		field1442 = null;
		field1113 = null;
		field1341 = null;
		field1225 = null;
		field1464 = null;
		field1332 = null;
		field1333 = null;
		field1329 = null;
		field1330 = null;
		field1331 = null;
		field1334 = null;
		field1335 = null;
		field1336 = null;
		field1337 = null;
		method459();
		class57.method325();
		class59.method335();
		class60.method341();
		class63.field952 = null;
		class64.field965 = null;
		class4.field56 = null;
		class65.field972 = null;
		class66.field985 = null;
		class68.field1005 = null;
		class68.field1017 = null;
		class70.field1028 = null;
		field10 = null;
		class27.field440 = null;
		class34.method163();
		class18.method49();
		class31.method121();
		class7.method46();
		System.gc();
	}

	@ObfuscatedName("client.k(B)V")
	public final void method510() {
		if (field1236 > 0) {
			method479();
		} else {
			field1327.method254();
			field1453.method200(257, 0, "Connection lost", 144);
			field1453.method200(256, 0xFFFFFF, "Connection lost", 143);
			field1453.method200(257, 0, "Please wait - attempting to reestablish", 159);
			field1453.method200(256, 0xFFFFFF, "Please wait - attempting to reestablish", 158);
			field1327.method255(field9, 4, 4);
			field1165 = 0;
			field1111 = 0;
			class5 var1 = field1221;
			field1390 = false;
			method542(field1409, field1410, true);

			if (!field1390) {
				method479();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BLlb;I)V")
	public final void method511(class38 arg0, int arg1) {
		int var3 = arg0.method236(8);
		if (var3 < field1176) {
			for (int var4 = var3; var4 < field1176; var4++) {
				field1405[field1404++] = field1177[var4];
			}
		}

		if (var3 > field1176) {
			signlink.reporterror(field1409 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1176 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1177[var5];
			class27 var7 = field1175[var6];
			int var8 = arg0.method236(1);
			if (var8 == 0) {
				field1177[field1176++] = var6;
				var7.field405 = field1160;
			} else {
				int var9 = arg0.method236(2);
				if (var9 == 0) {
					field1177[field1176++] = var6;
					var7.field405 = field1160;
					field1179[field1178++] = var6;
				} else if (var9 == 1) {
					field1177[field1176++] = var6;
					var7.field405 = field1160;
					int var10 = arg0.method236(3);
					var7.method111(var10, false);
					int var11 = arg0.method236(1);
					if (var11 == 1) {
						field1179[field1178++] = var6;
					}
				} else if (var9 == 2) {
					field1177[field1176++] = var6;
					var7.field405 = field1160;
					int var12 = arg0.method236(3);
					var7.method111(var12, true);
					int var13 = arg0.method236(3);
					var7.method111(var13, true);
					int var14 = arg0.method236(1);
					if (var14 == 1) {
						field1179[field1178++] = var6;
					}
				} else if (var9 == 3) {
					field1405[field1404++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)Ljava/net/Socket;")
	public final Socket method512(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IBIIIII)V")
	public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = class31.field546[var7];
			int var13 = class31.field547[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class31.field546[var8];
			int var16 = class31.field547[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1358 = arg5 - var9;
		field1359 = arg3 - var10;
		field1360 = arg0 - var11;
		field1361 = arg1;
		field1362 = arg4;
	}

	@ObfuscatedName("client.a(ILib;IB)V")
	public final void method514(int arg0, class35 arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1401 + field1293 & 0x7FF;
			int var6 = class31.field546[var5];
			int var7 = class31.field547[var5];
			var6 = var6 * 256 / (field1155 + 256);
			var7 = var7 * 256 / (field1155 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1396.method190(20, var10, var12 + 94 + 4 - 10, 15, 15, 83 - var13 - 20, 20, 256);
		} else {
			method553(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method515(boolean arg0) {
		for (int var2 = 0; var2 < field1416; var2++) {
			class26 var3 = field1415[field1417[var2]];
			int var4 = (field1417[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method113() && var3.field415.field890 == arg0) {
				int var5 = var3.field360 >> 7;
				int var6 = var3.field361 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field364 == 1 && (var3.field360 & 0x7F) == 0x40 && (var3.field361 & 0x7F) == 0x40) {
						if (field1199[var5][var6] == field1275) {
							continue;
						}

						field1199[var5][var6] = field1275;
					}

					field1353.method61(method474(var3.field361, var3.field360, field1138), var3.field360, var3.field362, field1138, var3, var4, var3.field363, (var3.field364 - 1) * 64 + 60, var3.field361);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lnb;I)V")
	public final void method516(class40 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field635 == 0) {
			var2 = field1353.method76(arg0.field634, arg0.field636, arg0.field637);
		}

		if (arg0.field635 == 1) {
			var2 = field1353.method77(arg0.field634, arg0.field636, arg0.field637);
		}

		if (arg0.field635 == 2) {
			var2 = field1353.method78(arg0.field634, arg0.field636, arg0.field637);
		}

		if (arg0.field635 == 3) {
			var2 = field1353.method79(arg0.field634, arg0.field636, arg0.field637);
		}

		if (var2 != 0) {
			int var6 = field1353.method80(arg0.field634, arg0.field636, arg0.field637, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field638 = var3;
		arg0.field640 = var4;
		arg0.field639 = var5;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method517(int arg0, int arg1) {
		class41 var3 = field1440[field1138][arg0][arg1];
		if (var3 == null) {
			field1353.method71(field1138, arg0, arg1);
		} else {
			int var4 = -99999999;
			class29 var5 = null;
			for (class29 var6 = (class29) var3.method244(); var6 != null; var6 = (class29) var3.method246()) {
				class60 var7 = class60.method342(var6.field451);
				int var8 = var7.field916;
				if (var7.field915) {
					var8 = (var6.field452 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method242(var5);
			class29 var9 = null;
			class29 var10 = null;
			for (class29 var11 = (class29) var3.method244(); var11 != null; var11 = (class29) var3.method246()) {
				if (var5.field451 != var11.field451 && var9 == null) {
					var9 = var11;
				}

				if (var5.field451 != var11.field451 && var9.field451 != var11.field451 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1353.method57(arg0, field1138, method474(arg1 * 128 + 64, arg0 * 128 + 64, field1138), var12, arg1, var5, var9, var10);
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method518() {
		int var1 = field1379 * 128 + 64;
		int var2 = field1380 * 128 + 64;
		int var3 = method474(var2, var1, field1138) - field1381;

		if (field1358 < var1) {
			field1358 += (var1 - field1358) * field1383 / 1000 + field1382;
			if (field1358 > var1) {
				field1358 = var1;
			}
		}

		if (field1358 > var1) {
			field1358 -= (field1358 - var1) * field1383 / 1000 + field1382;
			if (field1358 < var1) {
				field1358 = var1;
			}
		}

		if (field1359 < var3) {
			field1359 += (var3 - field1359) * field1383 / 1000 + field1382;
			if (field1359 > var3) {
				field1359 = var3;
			}
		}

		if (field1359 > var3) {
			field1359 -= (field1359 - var3) * field1383 / 1000 + field1382;
			if (field1359 < var3) {
				field1359 = var3;
			}
		}

		if (field1360 < var2) {
			field1360 += (var2 - field1360) * field1383 / 1000 + field1382;
			if (field1360 > var2) {
				field1360 = var2;
			}
		}

		if (field1360 > var2) {
			field1360 -= (field1360 - var2) * field1383 / 1000 + field1382;
			if (field1360 < var2) {
				field1360 = var2;
			}
		}

		int var4 = field1239 * 128 + 64;
		int var5 = field1240 * 128 + 64;
		int var6 = method474(var5, var4, field1138) - field1241;
		int var7 = var4 - field1358;
		int var8 = var6 - field1359;
		int var9 = var5 - field1360;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1361 < var11) {
			field1361 += (var11 - field1361) * field1243 / 1000 + field1242;
			if (field1361 > var11) {
				field1361 = var11;
			}
		}

		if (field1361 > var11) {
			field1361 -= (field1361 - var11) * field1243 / 1000 + field1242;
			if (field1361 < var11) {
				field1361 = var11;
			}
		}

		int var13 = var12 - field1362;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1362 += field1243 * var13 / 1000 + field1242;
			field1362 &= 0x7FF;
		}

		if (var13 < 0) {
			field1362 -= -var13 * field1243 / 1000 + field1242;
			field1362 &= 0x7FF;
		}

		int var14 = var12 - field1362;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1362 = var12;
		}
	}

	@ObfuscatedName("client.l(B)Z")
	public final boolean method519() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method520(int arg0) {
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
	public final void method521() {
		field1318 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1310) {
				field1228++;
				method466();
				method466();
				method506();
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

		field1318 = false;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method522() {
		for (class30 var1 = (class30) field1248.method244(); var1 != null; var1 = (class30) field1248.method246()) {
			if (field1138 != var1.field454 || field1160 > var1.field460) {
				var1.method106();
			} else if (field1160 >= var1.field459) {
				if (var1.field463 > 0) {
					class26 var2 = field1415[var1.field463 - 1];
					if (var2 != null && var2.field360 >= 0 && var2.field360 < 13312 && var2.field361 >= 0 && var2.field361 < 13312) {
						var1.method119(var2.field361, var2.field360, method474(var2.field361, var2.field360, var1.field454) - var1.field458, field1160);
					}
				}

				if (var1.field463 < 0) {
					int var3 = -var1.field463 - 1;
					class27 var4;
					if (field1304 == var3) {
						var4 = field1114;
					} else {
						var4 = field1175[var3];
					}

					if (var4 != null && var4.field360 >= 0 && var4.field360 < 13312 && var4.field361 >= 0 && var4.field361 < 13312) {
						var1.method119(var4.field361, var4.field360, method474(var4.field361, var4.field360, var1.field454) - var1.field458, field1160);
					}
				}

				var1.method120(field1147);
				field1353.method61((int) var1.field467, (int) var1.field465, var1.field473, field1138, var1, -1, false, 60, (int) var1.field466);
			}
		}

		field1281++;
		if (field1281 > 1174) {
			field1281 = 0;
			field1266.method214(12);
			field1266.method215(0);
			int var5 = field1266.field617;

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method216(11499);
			}

			field1266.method216(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method215(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method215(94);
			}

			field1266.method216(51693);
			field1266.method215(16);
			field1266.method216(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1266.method215(65);
			}

			field1266.method215((int) (Math.random() * 256.0D));
			field1266.method216(22990);
			field1266.method224(field1266.field617 - var5);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method9() {
		if (field1291 || field1408 || field1054) {
			method458();
		} else {
			field1146++;

			if (field1390) {
				method456();
			} else {
				method472(false);
			}

			field1311 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method523() {
		method440();

		if (field1154 == 1) {
			field1231[field1153 / 100].method185(field1151 - 8 - 4, field1152 - 8 - 4);
		}

		if (field1154 == 2) {
			field1231[field1153 / 100 + 4].method185(field1151 - 8 - 4, field1152 - 8 - 4);
			field1424++;
			if (field1424 > 57) {
				field1424 = 0;
				field1266.method214(100);
			}
		}

		if (field1220 != -1) {
			method509(field1220, field1147);
			method555(class4.field56[field1220], 0, 0, 0);
		}

		if (field1429 != -1) {
			method509(field1429, field1147);
			method555(class4.field56[field1429], 0, 0, 0);
		}

		method532();

		if (!field1340) {
			method499();
			method551();
		} else if (field1269 == 0) {
			method498();
		}

		if (field1181 == 1) {
			field1323[1].method185(472, 296);
		}

		if (field1444 != 0) {
			int var1 = field1444 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				field1453.method204(4, "System update in: " + var2 + ":0" + var1, 329, 0xFFFF00);
			} else {
				field1453.method204(4, "System update in: " + var2 + ":" + var1, 329, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method524(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	public final void init() {
		field1141 = Integer.parseInt(getParameter("nodeid"));
		field1142 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method536();
		} else {
			method501();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1143 = false;
		} else {
			field1143 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.d(Llb;II)V")
	public final void method525(class38 arg0, int arg1) {
		for (int var3 = 0; var3 < field1178; var3++) {
			int var4 = field1179[var3];
			class27 var5 = field1175[var4];
			int var6 = arg0.method225();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.method225() << 8;
			}

			method471(arg0, var6, var5, var4);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method526() {
		byte[] var1 = field1357.method295("title.dat", null);
		class35 var2 = new class35(var1, this);
		field1332.method254();
		var2.method183(0, 0);
		field1333.method254();
		var2.method183(0, -637);
		field1329.method254();
		var2.method183(0, -128);
		field1330.method254();
		var2.method183(-371, -202);
		field1331.method254();
		var2.method183(-171, -202);
		field1334.method254();
		var2.method183(-265, 0);
		field1335.method254();
		var2.method183(-265, -562);
		field1336.method254();
		var2.method183(-171, -128);
		field1337.method254();
		var2.method183(-171, -562);
		int[] var3 = new int[var2.field593];
		for (int var4 = 0; var4 < var2.field594; var4++) {
			for (int var5 = 0; var5 < var2.field593; var5++) {
				var3[var5] = var2.field592[var2.field593 * var4 + var2.field593 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field593; var6++) {
				var2.field592[var2.field593 * var4 + var6] = var3[var6];
			}
		}

		field1332.method254();
		var2.method183(0, 382);
		field1333.method254();
		var2.method183(0, -255);
		field1329.method254();
		var2.method183(0, 254);
		field1330.method254();
		var2.method183(-371, 180);
		field1331.method254();
		var2.method183(-171, 180);
		field1334.method254();
		var2.method183(-265, 382);
		field1335.method254();
		var2.method183(-265, -180);
		field1336.method254();
		var2.method183(-171, 254);
		field1337.method254();
		var2.method183(-171, -180);
		class35 var7 = new class35(field1357, "logo", 0);
		field1329.method254();
		var7.method185(382 - var7.field593 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(Ld;B)Z")
	public final boolean method527(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1224[field1091] = "Remove @whi@" + arg0.field97;
				field1420[field1091] = 884;
				field1091++;
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

		field1224[field1091] = "Remove @whi@" + field1341[var2];
		field1420[field1091] = 513;
		field1091++;
		field1224[field1091] = "Message @whi@" + field1341[var2];
		field1420[field1091] = 902;
		field1091++;
		return true;
	}

	@ObfuscatedName("client.a(IZIIII)V")
	public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1353.method76(arg4, arg2, arg1);
		if (var6 != 0) {
			int var7 = field1353.method80(arg4, arg2, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field1113.field592;
			int var12 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method326(var13);
			if (var14.field843 == -1) {
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
				class36 var15 = field1254[var14.field843];
				if (var15 != null) {
					int var16 = (var14.field829 * 4 - var15.field601) / 2;
					int var17 = (var14.field830 * 4 - var15.field602) / 2;
					var15.method198(arg2 * 4 + var16 + 48, (104 - arg1 - var14.field830) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field1353.method78(arg4, arg2, arg1);
		if (var18 != 0) {
			int var19 = field1353.method80(arg4, arg2, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method326(var22);
			if (var23.field843 != -1) {
				class36 var24 = field1254[var23.field843];
				if (var24 != null) {
					int var25 = (var23.field829 * 4 - var24.field601) / 2;
					int var26 = (var23.field830 * 4 - var24.field602) / 2;
					var24.method198(arg2 * 4 + var25 + 48, (104 - arg1 - var23.field830) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1113.field592;
				int var29 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field1353.method79(arg4, arg2, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method326(var31);
			if (var32.field843 != -1) {
				class36 var33 = field1254[var32.field843];
				if (var33 != null) {
					int var34 = (var32.field829 * 4 - var33.field601) / 2;
					int var35 = (var32.field830 * 4 - var33.field602) / 2;
					var33.method198(arg2 * 4 + var34 + 48, (104 - arg1 - var32.field830) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field1291 && !field1408 && !field1054) {
			field1160++;

			if (field1390) {
				method545();
			} else {
				method547();
			}

			method552();
		}
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public final void method529(int arg0, int arg1, class59 arg2, int arg3) {
		if (field1091 < 400) {
			String var5 = arg2.field870;
			if (arg2.field887 != 0) {
				var5 = var5 + method464(field1114.field422, arg2.field887) + " (level-" + arg2.field887 + ")";
			}

			if (field1261 == 1) {
				field1224[field1091] = "Use " + field1265 + " with @yel@" + var5;
				field1420[field1091] = 829;
				field1421[field1091] = arg1;
				field1418[field1091] = arg3;
				field1419[field1091] = arg0;
				field1091++;
			} else if (field1195 != 1) {
				if (arg2.field882 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.field882[var6] != null && !arg2.field882[var6].equalsIgnoreCase("attack")) {
							field1224[field1091] = arg2.field882[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1420[field1091] = 242;
							}

							if (var6 == 1) {
								field1420[field1091] = 209;
							}

							if (var6 == 2) {
								field1420[field1091] = 309;
							}

							if (var6 == 3) {
								field1420[field1091] = 852;
							}

							if (var6 == 4) {
								field1420[field1091] = 793;
							}

							field1421[field1091] = arg1;
							field1418[field1091] = arg3;
							field1419[field1091] = arg0;
							field1091++;
						}
					}
				}

				if (arg2.field882 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.field882[var7] != null && arg2.field882[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.field887 > field1114.field422) {
								var8 = 2000;
							}

							field1224[field1091] = arg2.field882[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1420[field1091] = var8 + 242;
							}

							if (var7 == 1) {
								field1420[field1091] = var8 + 209;
							}

							if (var7 == 2) {
								field1420[field1091] = var8 + 309;
							}

							if (var7 == 3) {
								field1420[field1091] = var8 + 852;
							}

							if (var7 == 4) {
								field1420[field1091] = var8 + 793;
							}

							field1421[field1091] = arg1;
							field1418[field1091] = arg3;
							field1419[field1091] = arg0;
							field1091++;
						}
					}
				}

				field1224[field1091] = "Examine @yel@" + var5;
				field1420[field1091] = 1714;
				field1421[field1091] = arg1;
				field1418[field1091] = arg3;
				field1419[field1091] = arg0;
				field1091++;
			} else if ((field1197 & 0x2) == 2) {
				field1224[field1091] = field1198 + " @yel@" + var5;
				field1420[field1091] = 240;
				field1421[field1091] = arg1;
				field1418[field1091] = arg3;
				field1419[field1091] = arg0;
				field1091++;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method530() {
		field1275++;
		method548(true);
		method515(true);
		method548(false);
		method515(false);
		method522();
		method483();

		if (!field1185) {
			int var1 = field1400;
			if (field1158 / 256 > var1) {
				var1 = field1158 / 256;
			}

			if (field1426[4] && field1127[4] + 128 > var1) {
				var1 = field1127[4] + 128;
			}

			int var2 = field1401 + field1301 & 0x7FF;
			method513(field1216, var1, var1 * 3 + 600, method474(field1114.field361, field1114.field360, field1138) - 50, var2, field1215);
		}

		int var3;
		if (field1185) {
			var3 = method482();
		} else {
			var3 = method481();
		}

		int var4 = field1358;
		int var5 = field1359;
		int var6 = field1360;
		int var7 = field1361;
		int var8 = field1362;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field1426[var9]) {
				int var10 = (int) (Math.random() * (field1378[var9] * 2 + 1) + Math.sin(field1425[var9] / 100.0D * field1303[var9]) * field1127[var9] - field1378[var9]);
				if (var9 == 0) {
					field1358 += var10;
				}

				if (var9 == 1) {
					field1359 += var10;
				}

				if (var9 == 2) {
					field1360 += var10;
				}

				if (var9 == 3) {
					field1362 = field1362 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field1361 += var10;
					if (field1361 < 128) {
						field1361 = 128;
					}

					if (field1361 > 383) {
						field1361 = 383;
					}
				}
			}
		}

		int var11 = class34.field589;
		class31.field541 = true;
		class31.field544 = 0;
		class31.field542 = field17 - 4;
		class31.field543 = field18 - 4;
		class33.method154();
		field1353.method89(field1361, field1362, field1359, field1358, field1360, var3);
		field1353.method64();
		method457();
		method445();
		method537(var11);
		method523();
		field1327.method255(field9, 4, 4);
		field1358 = var4;
		field1359 = var5;
		field1360 = var6;
		field1361 = var7;
		field1362 = var8;
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method531(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1148; var3++) {
				if (field1430[var3] == arg0) {
					field1148--;
					field1385 = true;

					for (int var4 = var3; var4 < field1148; var4++) {
						field1430[var4] = field1430[var4 + 1];
					}

					field1266.method214(101);
					field1266.method221(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method532() {
		field1259 = 0;
		int var1 = (field1114.field360 >> 7) + field1186;
		int var2 = (field1114.field361 >> 7) + field1187;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1259 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1259 = 1;
		}

		if (field1259 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1259 = 0;
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method533(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.f(II)V")
	public final void method534(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method535(class4 arg0) {
		int var2 = arg0.field65;
		if (field1081 == 2) {
			if (var2 == 201) {
				field1213 = true;
				field1449 = false;
				field1056 = true;
				field1059 = "";
				field1129 = 1;
				field1344 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1213 = true;
				field1449 = false;
				field1056 = true;
				field1059 = "";
				field1129 = 2;
				field1344 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1236 = 250;
			return true;
		}

		if (var2 == 501) {
			field1213 = true;
			field1449 = false;
			field1056 = true;
			field1059 = "";
			field1129 = 4;
			field1344 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1213 = true;
			field1449 = false;
			field1056 = true;
			field1059 = "";
			field1129 = 5;
			field1344 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1109[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field964 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field964) {
							var5 = 0;
						}
					}

					if (!class64.field965[var5].field971 && class64.field965[var5].field966 == var3 + (field1282 ? 0 : 7)) {
						break;
					}
				}

				field1109[var3] = var5;
				field1463 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1130[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1222[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1222[var6].length) {
					var8 = 0;
				}
			}

			field1130[var6] = var8;
			field1463 = true;
		}

		if (var2 == 324 && !field1282) {
			field1282 = true;
			method539();
		}

		if (var2 == 325 && field1282) {
			field1282 = false;
			method539();
		}

		if (var2 == 326) {
			field1266.method214(125);
			field1266.method215(field1282 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1266.method215(field1109[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1266.method215(field1130[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1456 = !field1456;
		}

		if (var2 >= 601 && var2 <= 612) {
			method476();

			if (field1171.length() > 0) {
				field1266.method214(137);
				field1266.method221(class51.method296(field1171));
				field1266.method215(var2 - 601);
				field1266.method215(field1456 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.G(I)V")
	public static final void method536() {
		class18.field258 = true;
		class34.field569 = true;
		field1144 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method537(int arg0) {
		if (!field1144) {
			if (class34.field588[17] >= arg0) {
				class36 var2 = class34.field582[17];
				int var3 = var2.field602 * var2.field601 - 1;
				int var4 = field1147 * var2.field601 * 2;
				byte[] var5 = var2.field599;
				byte[] var6 = field1123;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field599 = var6;
				field1123 = var5;
				class34.method170(17);
			}

			if (class34.field588[24] >= arg0) {
				class36 var8 = class34.field582[24];
				int var9 = var8.field602 * var8.field601 - 1;
				int var10 = field1147 * var8.field601 * 2;
				byte[] var11 = var8.field599;
				byte[] var12 = field1123;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field599 = var12;
				field1123 = var11;
				class34.method170(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method538() {
		for (int var1 = -1; var1 < field1176; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1174;
			} else {
				var2 = field1177[var1];
			}

			class27 var3 = field1175[var2];
			if (var3 != null && var3.field373 > 0) {
				var3.field373--;
				if (var3.field373 == 0) {
					var3.field372 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1416; var4++) {
			int var5 = field1417[var4];
			class26 var6 = field1415[var5];
			if (var6 != null && var6.field373 > 0) {
				var6.field373--;
				if (var6.field373 == 0) {
					var6.field372 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method539() {
		field1463 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1109[var1] = -1;
			for (int var2 = 0; var2 < class64.field964; var2++) {
				if (!class64.field965[var2].field971 && class64.field965[var2].field966 == var1 + (field1282 ? 0 : 7)) {
					field1109[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;II)I")
	public final int method540(class4 arg0, int arg1) {
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
					var8 = field1267[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field1255[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field1202[var3[var5++]];
				}

				if (var7 == 4) {
					class4 var10 = class4.field56[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < class60.field896 && (!class60.method342(var11).field917 || field1143)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field58[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field1389[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field1183[field1255[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field1389[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field1114.field422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < class67.field1001; var13++) {
						if (class67.field1003[var13]) {
							var8 += field1255[var13];
						}
					}
				}

				if (var7 == 10) {
					class4 var14 = class4.field56[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < class60.field896 && (!class60.method342(var15).field917 || field1143)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field1203;
				}

				if (var7 == 12) {
					var8 = field1296;
				}

				if (var7 == 13) {
					int var17 = field1389[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					class69 var20 = class69.field1019[var19];
					int var21 = var20.field1021;
					int var22 = var20.field1022;
					int var23 = var20.field1023;
					int var24 = field1459[var23 - var22];
					var8 = field1389[var21] >> var22 & var24;
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
					var8 = (field1114.field360 >> 7) + field1186;
				}

				if (var7 == 19) {
					var8 = (field1114.field361 >> 7) + field1187;
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

	@ObfuscatedName("client.m(B)V")
	public final void method541() {
		field1328.method254();
		class34.field580 = field1373;
		field1206.method198(0, 0);

		if (field1056) {
			field1454.method200(239, 0, field1344, 40);
			field1454.method200(239, 128, field1059 + "*", 60);
		} else if (field1449) {
			field1454.method200(239, 0, "Enter amount:", 40);
			field1454.method200(239, 128, field1049 + "*", 60);
		} else if (field1276 != null) {
			field1454.method200(239, 0, field1276, 40);
			field1454.method200(239, 128, "Click to continue", 60);
		} else if (field1413 != -1) {
			method555(class4.field56[field1413], 0, 0, 0);
		} else if (field1124 == -1) {
			class37 var1 = field1453;
			int var2 = 0;
			class33.method153(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1285[var3] != null) {
					int var4 = field1283[var3];
					int var5 = field1295 + 70 - var2 * 14;
					String var6 = field1284[var3];
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
							var1.method204(4, field1285[var3], var5, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1460 == 0 || field1460 == 1 && method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1339[0].method198(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field1339[1].method198(var8, var5 - 12);
								var8 += 14;
							}

							var1.method204(var8, var6 + ":", var5, 0);
							var8 += var1.method202(var6) + 8;
							var1.method204(var8, field1285[var3], var5, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1128 == 0 && (var4 == 7 || field1346 == 0 || field1346 == 1 && method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method204(var9, "From", var5, 0);
							int var11 = var9 + var1.method202("From ");
							if (var7 == 1) {
								field1339[0].method198(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field1339[1].method198(var11, var5 - 12);
								var11 += 14;
							}

							var1.method204(var11, var6 + ":", var5, 0);
							var11 += var1.method202(var6) + 8;
							var1.method204(var11, field1285[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1105 == 0 || field1105 == 1 && method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method204(4, var6 + " " + field1285[var3], var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1128 == 0 && field1346 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method204(4, field1285[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1128 == 0 && field1346 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method204(4, "To " + var6 + ":", var5, 0);
							var1.method204(var1.method202("To " + var6) + 12, field1285[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1105 == 0 || field1105 == 1 && method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method204(4, var6 + " " + field1285[var3], var5, 0x7E3200);
						}

						var2++;
					}
				}
			}

			class33.method152();
			field1280 = var2 * 14 + 7;
			if (field1280 < 78) {
				field1280 = 78;
			}

			method502(field1280, 0, 463, field1280 - field1295 - 77, 77);
			String var10;
			if (field1114 == null || field1114.field416 == null) {
				var10 = class51.method300(field1409);
			} else {
				var10 = field1114.field416;
			}

			var1.method204(4, var10 + ":", 90, 0);
			var1.method204(var1.method202(var10 + ": ") + 6, field1441 + "*", 90, 255);
			class33.method159(77, 0, 479, 0);
		} else {
			method555(class4.field56[field1124], 0, 0, 0);
		}

		if (field1340 && field1269 == 2) {
			method498();
		}

		field1328.method255(field9, 17, 357);
		field1327.method254();
		class34.field580 = field1375;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method542(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1161 = "";
				field1162 = "Connecting to server...";
				method472(true);
			}

			field1221 = new class5(this, method512(field1142 + 43594));
			long var4 = class51.method296(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1266.field617 = 0;
			field1266.method215(14);
			field1266.method215(var6);
			field1221.method42(0, field1266.field616, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field1221.method39();
			}

			int var8 = field1221.method39();
			if (var8 == 0) {
				field1221.method41(field1290.field616, 0, 8);
				field1290.field617 = 0;
				field1256 = field1290.method231();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1256 >> 32), (int) field1256 };
				field1266.field617 = 0;
				field1266.method215(10);
				field1266.method219(var9[0]);
				field1266.method219(var9[1]);
				field1266.method219(var9[2]);
				field1266.method219(var9[3]);
				field1266.method219(signlink.uid);
				field1266.method222(arg0);
				field1266.method222(arg1);
				field1266.method240(field1058, field1051);
				field1391.field617 = 0;

				if (arg2) {
					field1391.method215(18);
				} else {
					field1391.method215(16);
				}

				field1391.method215(field1266.field617 + 36 + 1 + 1 + 2);
				field1391.method215(255);
				field1391.method216(282);
				field1391.method215(field1144 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1391.method219(field1439[var10]);
				}

				field1391.method223(field1266.field616, 0, field1266.field617);
				field1266.field621 = new class49(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1201 = new class49(var9);
				field1221.method42(0, field1391.field616, field1391.field617);
				var8 = field1221.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				method542(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1278 = field1221.method39();
				field1172 = field1221.method39() == 1;
				field1076 = 0L;
				field1227 = 0;
				field1110.field861 = 0;
				field14 = true;
				field1057 = true;
				field1390 = true;
				field1266.field617 = 0;
				field1290.field617 = 0;
				field1233 = -1;
				field1077 = -1;
				field1078 = -1;
				field1079 = -1;
				field1232 = 0;
				field1234 = 0;
				field1444 = 0;
				field1236 = 0;
				field1226 = 0;
				field1091 = 0;
				field1340 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1285[var12] = null;
				}

				field1261 = 0;
				field1195 = 0;
				field1312 = 0;
				field1157 = 0;
				field1098 = (int) (Math.random() * 100.0D) - 50;
				field1286 = (int) (Math.random() * 110.0D) - 55;
				field1301 = (int) (Math.random() * 80.0D) - 40;
				field1293 = (int) (Math.random() * 120.0D) - 60;
				field1155 = (int) (Math.random() * 30.0D) - 20;
				field1401 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1165 = 0;
				field1053 = -1;
				field1111 = 0;
				field1112 = 0;
				field1176 = 0;
				field1416 = 0;

				for (int var13 = 0; var13 < field1173; var13++) {
					field1175[var13] = null;
					field1180[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1415[var14] = null;
				}

				field1114 = field1175[field1174] = new class27();
				field1248.method248();
				field1092.method248();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1440[var15][var16][var17] = null;
						}
					}
				}

				field1423 = new class41();
				field1081 = 0;
				field1080 = 0;
				field1124 = -1;
				field1413 = -1;
				field1429 = -1;
				field1411 = -1;
				field1220 = -1;
				field1320 = false;
				field1260 = 3;
				field1449 = false;
				field1340 = false;
				field1056 = false;
				field1276 = null;
				field1181 = 0;
				field1200 = -1;
				field1282 = true;
				method539();

				for (int var18 = 0; var18 < 5; var18++) {
					field1130[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					field1376[var19] = null;
					field1377[var19] = false;
				}

				field1115 = 0;
				field1246 = 0;
				field1061 = 0;
				field1352 = 0;
				field1108 = 0;
				field1214 = 0;
				field1062 = 0;
				field1182 = 0;
				field1095 = 0;
				method478();
			} else if (var8 == 3) {
				field1161 = "";
				field1162 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1161 = "Your account has been disabled.";
				field1162 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1161 = "Your account is already logged in.";
				field1162 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1161 = "RuneScape has been updated!";
				field1162 = "Please reload this page.";
			} else if (var8 == 7) {
				field1161 = "This world is full.";
				field1162 = "Please use a different world.";
			} else if (var8 == 8) {
				field1161 = "Unable to connect.";
				field1162 = "Login server offline.";
			} else if (var8 == 9) {
				field1161 = "Login limit exceeded.";
				field1162 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1161 = "Unable to connect.";
				field1162 = "Bad session id.";
			} else if (var8 == 11) {
				field1162 = "Login server rejected session.";
				field1162 = "Please try again.";
			} else if (var8 == 12) {
				field1161 = "You need a members account to login to this world.";
				field1162 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1161 = "Could not complete login.";
				field1162 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1161 = "The server is being updated.";
				field1162 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1390 = true;
				field1266.field617 = 0;
				field1290.field617 = 0;
				field1233 = -1;
				field1077 = -1;
				field1078 = -1;
				field1079 = -1;
				field1232 = 0;
				field1234 = 0;
				field1444 = 0;
				field1091 = 0;
				field1340 = false;
				field1366 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1161 = "Login attempts exceeded.";
				field1162 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1161 = "You are standing in a members-only area.";
				field1162 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1161 = "Invalid loginserver requested";
				field1162 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = field1221.method39(); var20 >= 0; var20--) {
					field1161 = "You have only just left another world";
					field1162 = "Your profile will be transferred in: " + var20 + " seconds";
					method472(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				method542(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1161 = "No response from server";
				field1162 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1161 = "Unexpected server response";
				field1162 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1161 = "";
			field1162 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method543(long arg0) {
		if (arg0 != 0L) {
			if (field1148 >= 100) {
				method544("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = class51.method300(class51.method297(arg0));
				for (int var4 = 0; var4 < field1148; var4++) {
					if (field1430[var4] == arg0) {
						method544("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field1080; var5++) {
					if (field1225[var5] == arg0) {
						method544("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field1430[field1148++] = arg0;
				field1385 = true;
				field1266.method214(255);
				field1266.method221(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;I)V")
	public final void method544(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field1124 != -1) {
			field1276 = arg1;
			field23 = 0;
		}

		if (field1413 == -1) {
			field1213 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1283[var4] = field1283[var4 - 1];
			field1284[var4] = field1284[var4 - 1];
			field1285[var4] = field1285[var4 - 1];
		}

		field1283[0] = arg2;
		field1284[0] = arg0;
		field1285[0] = arg1;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method545() {
		if (field1444 > 1) {
			field1444--;
		}

		if (field1236 > 0) {
			field1236--;
		}

		for (int var1 = 0; var1 < 5 && method497(); var1++) {
		}

		if (field1390) {
			synchronized (field1110.field860) {
				if (!field1172) {
					field1110.field861 = 0;
				} else if (field23 != 0 || field1110.field861 >= 40) {
					field1266.method214(222);
					field1266.method215(0);
					int var3 = field1266.field617;
					int var4 = 0;
					for (int var5 = 0; var5 < field1110.field861 && var3 - field1266.field617 < 240; var5++) {
						var4++;
						int var6 = field1110.field863[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field1110.field862[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field1110.field863[var5] == -1 && field1110.field862[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field1450 != var7 || field1451 != var6) {
							int var9 = var7 - field1450;
							field1450 = var7;
							int var10 = var6 - field1451;
							field1451 = var6;

							if (field1227 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field1266.method216((field1227 << 12) + (var9 << 6) + var10);
								field1227 = 0;
							} else if (field1227 < 8) {
								field1266.method218((field1227 << 19) + var8 + 0x800000);
								field1227 = 0;
							} else {
								field1266.method219((field1227 << 19) + var8 - 0x40000000);
								field1227 = 0;
							}
						} else if (field1227 < 2047) {
							field1227++;
						}
					}

					field1266.method224(field1266.field617 - var3);

					if (var4 >= field1110.field861) {
						field1110.field861 = 0;
					} else {
						field1110.field861 -= var4;
						for (int var11 = 0; var11 < field1110.field861; var11++) {
							field1110.field862[var11] = field1110.field862[var4 + var11];
							field1110.field863[var11] = field1110.field863[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field1076) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field1076 = field26;
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
				field1266.method214(20);
				field1266.method219((var17 << 19) + (var18 << 20) + var16);
			}

			if (field1217 > 0) {
				field1217--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field1218 = true;
			}

			if (field1218 && field1217 <= 0) {
				field1217 = 20;
				field1218 = false;
				field1266.method214(53);
				field1266.method216(field1400);
				field1266.method216(field1401);
			}

			if (field14 && !field1057) {
				field1057 = true;
				field1266.method214(73);
				field1266.method215(1);
			}

			if (!field14 && field1057) {
				field1057 = false;
				field1266.method214(73);
				field1266.method215(0);
			}

			method469();
			method493();
			method467();
			field1234++;
			if (field1234 > 750) {
				method510();
			}

			method441();
			method449();
			method538();
			field1147++;

			if (field1154 != 0) {
				field1153 += 20;
				if (field1153 >= 400) {
					field1154 = 0;
				}
			}

			if (field1434 != 0) {
				field1431++;
				if (field1431 >= 15) {
					if (field1434 == 2) {
						field1385 = true;
					}

					if (field1434 == 3) {
						field1213 = true;
					}

					field1434 = 0;
				}
			}

			if (field1349 != 0) {
				field1371++;

				if (field17 > field1350 + 5 || field17 < field1350 - 5 || field18 > field1351 + 5 || field18 < field1351 - 5) {
					field1317 = true;
				}

				if (field16 == 0) {
					if (field1349 == 2) {
						field1385 = true;
					}

					if (field1349 == 3) {
						field1213 = true;
					}

					field1349 = 0;

					if (field1317 && field1371 >= 5) {
						field1365 = -1;
						method499();

						if (field1365 == field1347 && field1364 != field1348) {
							class4 var19 = class4.field56[field1347];
							byte var20 = 0;
							if (field1258 == 1 && var19.field65 == 206) {
								var20 = 1;
							}

							if (var19.field57[field1364] <= 0) {
								var20 = 0;
							}

							if (var19.field86) {
								int var21 = field1348;
								int var22 = field1364;
								var19.field57[var22] = var19.field57[var21];
								var19.field58[var22] = var19.field58[var21];
								var19.field57[var21] = -1;
								var19.field58[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field1348;
								int var24 = field1364;
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
								var19.method33(field1348, field1364);
							}

							field1266.method214(93);
							field1266.method216(field1347);
							field1266.method216(field1348);
							field1266.method216(field1364);
							field1266.method215(var20);
						}
					} else if ((field1388 == 1 || method496(field1091 - 1)) && field1091 > 2) {
						method554();
					} else if (field1091 > 0) {
						method546(field1091 - 1);
					}

					field1431 = 10;
					field23 = 0;
				}
			}

			field1132++;
			if (field1132 > 62) {
				field1132 = 0;
				field1266.method214(89);
			}

			if (class18.field292 != -1) {
				int var25 = class18.field292;
				int var26 = class18.field293;
				boolean var27 = method508(true, 0, field1114.field411[0], 0, field1114.field410[0], 0, var25, 0, var26, 0, 0);
				class18.field292 = -1;

				if (var27) {
					field1151 = field24;
					field1152 = field25;
					field1154 = 1;
					field1153 = 0;
				}
			}

			if (field23 == 1 && field1276 != null) {
				field1276 = null;
				field1213 = true;
				field23 = 0;
			}

			method488();
			method426();
			method550();
			method487();

			if (field16 == 1 || field23 == 1) {
				field1311++;
			}

			if (field1312 == 2) {
				method444();
			}

			if (field1312 == 2 && field1185) {
				method518();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field1303[var28]++;
			}

			method427();
			field15++;
			if (field15 > 4500) {
				field1236 = 250;
				field15 -= 500;
				field1266.method214(209);
			}

			field1055++;
			if (field1055 > 500) {
				field1055 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field1098 += field1099;
				}

				if ((var29 & 0x2) == 2) {
					field1286 += field1287;
				}

				if ((var29 & 0x4) == 4) {
					field1301 += field1302;
				}
			}

			if (field1098 < -50) {
				field1099 = 2;
			}

			if (field1098 > 50) {
				field1099 = -2;
			}

			if (field1286 < -55) {
				field1287 = 2;
			}

			if (field1286 > 55) {
				field1287 = -2;
			}

			if (field1301 < -40) {
				field1302 = 1;
			}

			if (field1301 > 40) {
				field1302 = -1;
			}

			field1342++;
			if (field1342 > 500) {
				field1342 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field1293 += field1294;
				}

				if ((var30 & 0x2) == 2) {
					field1155 += field1156;
				}
			}

			if (field1293 < -60) {
				field1294 = 2;
			}

			if (field1293 > 60) {
				field1294 = -2;
			}

			if (field1155 < -20) {
				field1156 = 1;
			}

			if (field1155 > 10) {
				field1156 = -1;
			}

			field1235++;
			if (field1235 > 50) {
				field1266.method214(120);
			}

			try {
				if (field1221 != null && field1266.field617 > 0) {
					field1221.method42(0, field1266.field616, field1266.field617);
					field1266.field617 = 0;
					field1235 = 0;
				}
			} catch (IOException var32) {
				method510();
			} catch (Exception var33) {
				method479();
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method546(int arg0) {
		if (arg0 >= 0) {
			if (field1449) {
				field1449 = false;
				field1213 = true;
			}

			int var2 = field1418[arg0];
			int var3 = field1419[arg0];
			int var4 = field1420[arg0];
			int var5 = field1421[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 1381) {
				int var6 = var5 >> 14 & 0x7FFF;
				class57 var7 = class57.method326(var6);
				String var8;
				if (var7.field826 == null) {
					var8 = "It's a " + var7.field825 + ".";
				} else {
					var8 = new String(var7.field826);
				}

				method544("", var8, 0);
			}

			if (var4 == 111) {
				boolean var9 = method508(false, 0, field1114.field411[0], 0, field1114.field410[0], 0, var2, 0, var3, 0, 2);
				if (!var9) {
					method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var2, 1, var3, 0, 2);
				}

				field1151 = field24;
				field1152 = field25;
				field1154 = 2;
				field1153 = 0;
				field1266.method214(39);
				field1266.method216(field1186 + var2);
				field1266.method216(field1187 + var3);
				field1266.method216(var5);
				field1266.method216(field1264);
				field1266.method216(field1262);
				field1266.method216(field1263);
			}

			if (var4 == 718) {
				if (field1340) {
					field1353.method88(var3 - 4, var2 - 4);
				} else {
					field1353.method88(field25 - 4, field24 - 4);
				}
			}

			if (var4 == 507 || var4 == 957) {
				String var11 = field1224[arg0];
				int var12 = var11.indexOf("@whi@");
				if (var12 != -1) {
					var11 = var11.substring(var12 + 5).trim();
					String var13 = class51.method300(class51.method297(class51.method296(var11)));
					boolean var14 = false;
					for (int var15 = 0; var15 < field1176; var15++) {
						class27 var16 = field1175[field1177[var15]];
						if (var16 != null && var16.field416 != null && var16.field416.equalsIgnoreCase(var13)) {
							method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var16.field410[0], 1, var16.field411[0], 0, 2);

							if (var4 == 507) {
								field1108 += var5;
								if (field1108 >= 66) {
									field1266.method214(235);
									field1266.method215(154);
								}

								field1266.method214(98);
							}

							if (var4 == 957) {
								field1352++;
								if (field1352 >= 52) {
									field1266.method214(80);
									field1266.method215(131);
								}

								field1266.method214(109);
							}

							field1266.method216(field1177[var15]);
							var14 = true;
							break;
						}
					}

					if (!var14) {
						method544("", "Unable to find " + var13, 0);
					}
				}
			}

			if (var4 == 899 && method475(213, var2, var5, var3)) {
				field1266.method216(field1196);
			}

			if (var4 == 1714) {
				class26 var17 = field1415[var5];
				if (var17 != null) {
					String var18;
					if (var17.field415.field871 == null) {
						var18 = "It's a " + var17.field415.field870 + ".";
					} else {
						var18 = new String(var17.field415.field871);
					}

					method544("", var18, 0);
				}
			}

			if (var4 == 435) {
				field1266.method214(9);
				field1266.method216(var3);
				class4 var19 = class4.field56[var3];
				if (var19.field71 != null && var19.field71[0][0] == 5) {
					int var20 = var19.field71[0][1];
					field1389[var20] = 1 - field1389[var20];
					method437(var20);
					field1385 = true;
				}
			}

			if (var4 == 225) {
				field1266.method214(9);
				field1266.method216(var3);
				class4 var21 = class4.field56[var3];
				if (var21.field71 != null && var21.field71[0][0] == 5) {
					int var22 = var21.field71[0][1];
					if (field1389[var22] != var21.field73[0]) {
						field1389[var22] = var21.field73[0];
						method437(var22);
						field1385 = true;
					}
				}
			}

			if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
				if (var4 == 113) {
					field1266.method214(82);
				}

				if (var4 == 331) {
					field1266.method214(179);
				}

				if (var4 == 354) {
					field1266.method214(46);
				}

				if (var4 == 582) {
					if ((var5 & 0x3) == 0) {
						field1214++;
					}

					if (field1214 >= 133) {
						field1266.method214(250);
						field1266.method216(6118);
					}

					field1266.method214(74);
				}

				if (var4 == 555) {
					field1266.method214(239);
				}

				field1266.method216(var5);
				field1266.method216(var2);
				field1266.method216(var3);
				field1431 = 0;
				field1432 = var3;
				field1433 = var2;
				field1434 = 2;
				if (class4.field56[var3].field62 == field1429) {
					field1434 = 1;
				}

				if (class4.field56[var3].field62 == field1413) {
					field1434 = 3;
				}
			}

			if (var4 == 357) {
				method475(157, var2, var5, var3);
			}

			if (var4 == 1152) {
				class60 var23 = class60.method342(var5);
				String var24;
				if (var23.field905 == null) {
					var24 = "It's a " + var23.field904 + ".";
				} else {
					var24 = new String(var23.field905);
				}

				method544("", var24, 0);
			}

			if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
				boolean var25 = method508(false, 0, field1114.field411[0], 0, field1114.field410[0], 0, var2, 0, var3, 0, 2);
				if (!var25) {
					method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var2, 1, var3, 0, 2);
				}

				field1151 = field24;
				field1152 = field25;
				field1154 = 2;
				field1153 = 0;

				if (var4 == 617) {
					field1266.method214(108);
				}

				if (var4 == 224) {
					field1182 += var3;
					if (field1182 >= 75) {
						field1266.method214(0);
						field1266.method215(19);
					}

					field1266.method214(62);
				}

				if (var4 == 139) {
					if ((var2 & 0x3) == 0) {
						field1062++;
					}

					if (field1062 >= 123) {
						field1266.method214(25);
						field1266.method219(0);
					}

					field1266.method214(247);
				}

				if (var4 == 778) {
					field1266.method214(169);
				}

				if (var4 == 662) {
					field1061 += field1187;
					if (field1061 >= 118) {
						field1266.method214(41);
						field1266.method219(0);
					}

					field1266.method214(117);
				}

				field1266.method216(field1186 + var2);
				field1266.method216(field1187 + var3);
				field1266.method216(var5);
			}

			if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
				class27 var27 = field1175[var5];
				if (var27 != null) {
					method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var27.field410[0], 1, var27.field411[0], 0, 2);
					field1151 = field24;
					field1152 = field25;
					field1154 = 2;
					field1153 = 0;

					if (var4 == 499) {
						field1266.method214(166);
					}

					if (var4 == 185) {
						field1266.method214(174);
					}

					if (var4 == 27) {
						field1266.method214(196);
					}

					if (var4 == 387) {
						field1108 += var5;
						if (field1108 >= 66) {
							field1266.method214(235);
							field1266.method215(154);
						}

						field1266.method214(98);
					}

					if (var4 == 639) {
						field1352++;
						if (field1352 >= 52) {
							field1266.method214(80);
							field1266.method215(131);
						}

						field1266.method214(109);
					}

					field1266.method216(var5);
				}
			}

			if (var4 == 625) {
				method475(215, var2, var5, var3);
			}

			if (var4 == 810 && method475(60, var2, var5, var3)) {
				field1266.method216(field1264);
				field1266.method216(field1262);
				field1266.method216(field1263);
			}

			if (var4 == 274) {
				class4 var28 = class4.field56[var3];
				field1195 = 1;
				field1196 = var3;
				field1197 = var28.field116;
				field1261 = 0;
				field1385 = true;
				String var29 = var28.field114;
				if (var29.indexOf(" ") != -1) {
					var29 = var29.substring(0, var29.indexOf(" "));
				}

				String var30 = var28.field114;
				if (var30.indexOf(" ") != -1) {
					var30 = var30.substring(var30.indexOf(" ") + 1);
				}

				field1198 = var29 + " " + var28.field115 + " " + var30;

				if (field1197 == 16) {
					field1385 = true;
					field1260 = 3;
					field1131 = true;
				}
			} else {
				if (var4 == 997 && !field1320) {
					field1266.method214(72);
					field1266.method216(var3);
					field1320 = true;
				}

				if (var4 == 829) {
					class26 var31 = field1415[var5];
					if (var31 != null) {
						method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var31.field410[0], 1, var31.field411[0], 0, 2);
						field1151 = field24;
						field1152 = field25;
						field1154 = 2;
						field1153 = 0;
						field1266.method214(150);
						field1266.method216(var5);
						field1266.method216(field1264);
						field1266.method216(field1262);
						field1266.method216(field1263);
					}
				}

				if (var4 == 1328) {
					class60 var32 = class60.method342(var5);
					class4 var33 = class4.field56[var3];
					String var34;
					if (var33 != null && var33.field58[var2] >= 100000) {
						var34 = var33.field58[var2] + " x " + var32.field904;
					} else if (var32.field905 == null) {
						var34 = "It's a " + var32.field904 + ".";
					} else {
						var34 = new String(var32.field905);
					}

					method544("", var34, 0);
				}

				if (var4 == 902) {
					String var35 = field1224[arg0];
					int var36 = var35.indexOf("@whi@");
					if (var36 != -1) {
						long var37 = class51.method296(var35.substring(var36 + 5).trim());
						int var39 = -1;
						for (int var40 = 0; var40 < field1080; var40++) {
							if (field1225[var40] == var37) {
								var39 = var40;
								break;
							}
						}

						if (var39 != -1 && field1464[var39] > 0) {
							field1213 = true;
							field1449 = false;
							field1056 = true;
							field1059 = "";
							field1129 = 3;
							field1268 = field1225[var39];
							field1344 = "Enter message to send to " + field1341[var39];
						}
					}
				}

				if (var4 == 743) {
					field1246++;
					if (field1246 >= 124) {
						field1266.method214(201);
						field1266.method216(37954);
					}

					method475(187, var2, var5, var3);
				}

				if (var4 == 524) {
					String var41 = field1224[arg0];
					int var42 = var41.indexOf("@whi@");
					if (var42 != -1) {
						if (field1429 == -1) {
							method476();
							field1171 = var41.substring(var42 + 5).trim();
							field1456 = false;

							for (int var43 = 0; var43 < class4.field56.length; var43++) {
								if (class4.field56[var43] != null && class4.field56[var43].field65 == 600) {
									field1443 = field1429 = class4.field56[var43].field62;
									break;
								}
							}
						} else {
							method544("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
					String var44 = field1224[arg0];
					int var45 = var44.indexOf("@whi@");
					if (var45 != -1) {
						long var46 = class51.method296(var44.substring(var45 + 5).trim());
						if (var4 == 605) {
							method443(var46);
						}

						if (var4 == 47) {
							method543(var46);
						}

						if (var4 == 513) {
							method448(var46);
						}

						if (var4 == 884) {
							method531(var46);
						}
					}
				}

				if (var4 == 398) {
					field1266.method214(136);
					field1266.method216(var5);
					field1266.method216(var2);
					field1266.method216(var3);
					field1266.method216(field1264);
					field1266.method216(field1262);
					field1266.method216(field1263);
					field1431 = 0;
					field1432 = var3;
					field1433 = var2;
					field1434 = 2;
					if (class4.field56[var3].field62 == field1429) {
						field1434 = 1;
					}

					if (class4.field56[var3].field62 == field1413) {
						field1434 = 3;
					}
				}

				if (var4 == 231) {
					class4 var48 = class4.field56[var3];
					boolean var49 = true;
					if (var48.field65 > 0) {
						var49 = method535(var48);
					}

					if (var49) {
						field1266.method214(9);
						field1266.method216(var3);
					}
				}

				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					class26 var50 = field1415[var5];
					if (var50 != null) {
						method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var50.field410[0], 1, var50.field411[0], 0, 2);
						field1151 = field24;
						field1152 = field25;
						field1154 = 2;
						field1153 = 0;

						if (var4 == 242) {
							field1266.method214(236);
						}

						if (var4 == 793) {
							field1266.method214(189);
						}

						if (var4 == 209) {
							field1266.method214(233);
						}

						if (var4 == 852) {
							field1266.method214(147);
						}

						if (var4 == 309) {
							field1266.method214(223);
						}

						field1266.method216(var5);
					}
				}

				if (var4 == 102) {
					field1261 = 1;
					field1262 = var2;
					field1263 = var3;
					field1264 = var5;
					field1265 = class60.method342(var5).field904;
					field1195 = 0;
					field1385 = true;
				} else {
					if (var4 == 275) {
						class27 var51 = field1175[var5];
						if (var51 != null) {
							method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var51.field410[0], 1, var51.field411[0], 0, 2);
							field1151 = field24;
							field1152 = field25;
							field1154 = 2;
							field1153 = 0;
							field1266.method214(36);
							field1266.method216(var5);
							field1266.method216(field1264);
							field1266.method216(field1262);
							field1266.method216(field1263);
						}
					}

					if (var4 == 131) {
						class27 var52 = field1175[var5];
						if (var52 != null) {
							method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var52.field410[0], 1, var52.field411[0], 0, 2);
							field1151 = field24;
							field1152 = field25;
							field1154 = 2;
							field1153 = 0;
							field1266.method214(240);
							field1266.method216(var5);
							field1266.method216(field1196);
						}
					}

					if (var4 == 563) {
						field1266.method214(135);
						field1266.method216(var5);
						field1266.method216(var2);
						field1266.method216(var3);
						field1266.method216(field1196);
						field1431 = 0;
						field1432 = var3;
						field1433 = var2;
						field1434 = 2;
						if (class4.field56[var3].field62 == field1429) {
							field1434 = 1;
						}

						if (class4.field56[var3].field62 == field1413) {
							field1434 = 3;
						}
					}

					if (var4 == 737) {
						method476();
					}

					if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
						if (var4 == 681) {
							field1095++;
							if (field1095 >= 116) {
								field1266.method214(24);
								field1266.method218(0xC6A439);
							}

							field1266.method214(216);
						}

						if (var4 == 694) {
							field1266.method214(185);
						}

						if (var4 == 962) {
							field1266.method214(2);
						}

						if (var4 == 100) {
							field1266.method214(42);
						}

						if (var4 == 795) {
							field1266.method214(123);
						}

						field1266.method216(var5);
						field1266.method216(var2);
						field1266.method216(var3);
						field1431 = 0;
						field1432 = var3;
						field1433 = var2;
						field1434 = 2;
						if (class4.field56[var3].field62 == field1429) {
							field1434 = 1;
						}

						if (class4.field56[var3].field62 == field1413) {
							field1434 = 3;
						}
					}

					if (var4 == 1071) {
						method475(127, var2, var5, var3);
					}

					if (var4 == 240) {
						class26 var53 = field1415[var5];
						if (var53 != null) {
							method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var53.field410[0], 1, var53.field411[0], 0, 2);
							field1151 = field24;
							field1152 = field25;
							field1154 = 2;
							field1153 = 0;
							field1266.method214(181);
							field1266.method216(var5);
							field1266.method216(field1196);
						}
					}

					if (var4 == 721) {
						field1115 += var3;
						if (field1115 >= 139) {
							field1266.method214(219);
							field1266.method219(0);
						}

						method475(103, var2, var5, var3);
					}

					if (var4 == 370) {
						boolean var54 = method508(false, 0, field1114.field411[0], 0, field1114.field410[0], 0, var2, 0, var3, 0, 2);
						if (!var54) {
							method508(false, 0, field1114.field411[0], 1, field1114.field410[0], 0, var2, 1, var3, 0, 2);
						}

						field1151 = field24;
						field1152 = field25;
						field1154 = 2;
						field1153 = 0;
						field1266.method214(91);
						field1266.method216(field1186 + var2);
						field1266.method216(field1187 + var3);
						field1266.method216(var5);
						field1266.method216(field1196);
					}

					field1261 = 0;
					field1195 = 0;
					field1385 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method547() {
		if (field1167 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1167 = 3;
				field1073 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1161 = "";
				field1162 = "Enter your username & password.";
				field1167 = 2;
				field1073 = 0;
			}
		} else if (field1167 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1073 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1073 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method542(field1409, field1410, false);

				if (field1390) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1167 = 0;
				field1409 = "";
				field1410 = "";
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

				if (field1073 == 0) {
					if (var8 == 8 && field1409.length() > 0) {
						field1409 = field1409.substring(0, field1409.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1073 = 1;
					}

					if (var9) {
						field1409 = field1409 + (char) var8;
					}

					if (field1409.length() > 12) {
						field1409 = field1409.substring(0, 12);
					}
				} else if (field1073 == 1) {
					if (var8 == 8 && field1410.length() > 0) {
						field1410 = field1410.substring(0, field1410.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1073 = 0;
					}

					if (var9) {
						field1410 = field1410 + (char) var8;
					}

					if (field1410.length() > 20) {
						field1410 = field1410.substring(0, 20);
					}
				}
			}
		} else if (field1167 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1167 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method548(boolean arg0) {
		if (field1114.field360 >> 7 == field1111 && field1114.field361 >> 7 == field1112) {
			field1111 = 0;
			field1229++;
			if (field1229 > 122) {
				field1229 = 0;
				field1266.method214(188);
				field1266.method215(62);
			}
		}

		int var2 = field1176;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class27 var4;
			int var5;
			if (arg0) {
				var4 = field1114;
				var5 = field1174 << 14;
			} else {
				var4 = field1175[field1177[var3]];
				var5 = field1177[var3] << 14;
			}

			if (var4 != null && var4.method113()) {
				var4.field436 = false;
				if ((field1144 && field1176 > 50 || field1176 > 200) && !arg0 && var4.field385 == var4.field365) {
					var4.field436 = true;
				}

				int var6 = var4.field360 >> 7;
				int var7 = var4.field361 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field431 == null || field1160 < var4.field426 || field1160 >= var4.field427) {
						if ((var4.field360 & 0x7F) == 0x40 && (var4.field361 & 0x7F) == 0x40) {
							if (field1199[var6][var7] == field1275) {
								continue;
							}

							field1199[var6][var7] = field1275;
						}

						var4.field425 = method474(var4.field361, var4.field360, field1138);
						field1353.method61(var4.field425, var4.field360, var4.field362, field1138, var4, var5, var4.field363, 60, var4.field361);
					} else {
						var4.field436 = false;
						var4.field425 = method474(var4.field361, var4.field360, field1138);
						field1353.method62(var4.field362, var5, var4.field435, var4.field432, var4.field425, 60, var4.field434, var4, var4.field361, field1138, var4.field433, var4.field360);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method549() {
		try {
			field1053 = -1;
			field1092.method248();
			field1248.method248();
			class34.method166();
			method503();
			field1353.method50();

			for (int var1 = 0; var1 < 4; var1++) {
				field1074[var1].method353();
			}

			System.gc();
			class3 var2 = new class3(field1309, field1244, 104, 104);
			int var3 = field1363.length;
			class3.field32 = class18.field258;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1392[var4] >> 8;
				int var6 = field1392[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1353.method51(field1138);
			} else {
				field1353.method51(0);
			}

			field1266.method214(120);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1392[var7] >> 8) * 64 - field1186;
				int var9 = (field1392[var7] & 0xFF) * 64 - field1187;
				byte[] var10 = field1363[var7];
				if (var10 != null) {
					var2.method15((field1406 - 6) * 8, var10, var8, (field1407 - 6) * 8, var9);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1392[var11] >> 8) * 64 - field1186;
				int var13 = (field1392[var11] & 0xFF) * 64 - field1187;
				byte[] var14 = field1363[var11];
				if (var14 == null && field1407 < 800) {
					var2.method14(var12, 64, 64, var13);
				}
			}

			field1266.method214(120);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1277[var15];
				if (var16 != null) {
					int var17 = (field1392[var15] >> 8) * 64 - field1186;
					int var18 = (field1392[var15] & 0xFF) * 64 - field1187;
					var2.method18(var17, var18, field1074, field1353, var16);
				}
			}

			field1266.method214(120);
			var2.method20(field1353, field1074);
			field1327.method254();
			field1266.method214(120);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method517(var19, var20);
				}
			}

			method494();
		} catch (Exception var33) {
		}

		class57.field856.method103();

		if (field1144 && signlink.cache_dat != null) {
			int var22 = field1279.method268(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1279.method273(var23);
				if ((var24 & 0x79) == 0) {
					class31.method124(var23);
				}
			}
		}

		System.gc();
		class34.method167(20);
		field1279.method279();
		int var25 = (field1406 - 6) / 8 - 1;
		int var26 = (field1406 + 6) / 8 + 1;
		int var27 = (field1407 - 6) / 8 - 1;
		int var28 = (field1407 + 6) / 8 + 1;
		if (field1414) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1279.method270(0, var29, var30);
					if (var31 != -1) {
						field1279.method280(3, var31);
					}

					int var32 = field1279.method270(1, var29, var30);
					if (var32 != -1) {
						field1279.method280(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field1343 = true;
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

	public final void run() {
		if (field1465) {
			method521();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method550() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1169[0] != -1) {
				field1385 = true;
				field1260 = 0;
				field1131 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1169[1] != -1) {
				field1385 = true;
				field1260 = 1;
				field1131 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1169[2] != -1) {
				field1385 = true;
				field1260 = 2;
				field1131 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1169[3] != -1) {
				field1385 = true;
				field1260 = 3;
				field1131 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1169[4] != -1) {
				field1385 = true;
				field1260 = 4;
				field1131 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1169[5] != -1) {
				field1385 = true;
				field1260 = 5;
				field1131 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1169[6] != -1) {
				field1385 = true;
				field1260 = 6;
				field1131 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1169[7] != -1) {
				field1385 = true;
				field1260 = 7;
				field1131 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1169[8] != -1) {
				field1385 = true;
				field1260 = 8;
				field1131 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1169[9] != -1) {
				field1385 = true;
				field1260 = 9;
				field1131 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1169[10] != -1) {
				field1385 = true;
				field1260 = 10;
				field1131 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1169[11] != -1) {
				field1385 = true;
				field1260 = 11;
				field1131 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1169[12] != -1) {
				field1385 = true;
				field1260 = 12;
				field1131 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1169[13] != -1) {
				field1385 = true;
				field1260 = 13;
				field1131 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method551() {
		if (field1091 >= 2 || field1261 != 0 || field1195 != 0) {
			String var1;
			if (field1261 == 1 && field1091 < 2) {
				var1 = "Use " + field1265 + " with...";
			} else if (field1195 == 1 && field1091 < 2) {
				var1 = field1198 + "...";
			} else {
				var1 = field1224[field1091 - 1];
			}

			if (field1091 > 2) {
				var1 = var1 + "@whi@ / " + (field1091 - 2) + " more options";
			}

			field1454.method207(var1, 0xFFFFFF, 15, true, field1160 / 1000, 4);
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method552() {
		while (true) {
			class39 var1 = field1279.method277();
			if (var1 == null) {
				return;
			}

			if (var1.field629 == 0) {
				class31.method123(var1.field630, var1.field631);

				if ((field1279.method273(var1.field630) & 0x62) != 0) {
					field1385 = true;

					if (field1413 != -1) {
						field1213 = true;
					}
				}
			}

			if (var1.field629 == 1 && var1.field631 != null) {
				class7.method45(var1.field631);
			}

			if (var1.field629 == 2 && field1435 == var1.field630 && var1.field631 != null) {
				method428(var1.field631, field1436);
			}

			if (var1.field629 == 3 && field1312 == 1) {
				for (int var2 = 0; var2 < field1363.length; var2++) {
					if (field1393[var2] == var1.field630) {
						field1363[var2] = var1.field631;

						if (var1.field631 == null) {
							field1393[var2] = -1;
						}

						break;
					}

					if (field1394[var2] == var1.field630) {
						field1277[var2] = var1.field631;

						if (var1.field631 == null) {
							field1394[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field629 == 93 && field1279.method272(var1.field630)) {
				class3.method17(new class38(var1.field631), field1279);
			}
		}
	}

	@ObfuscatedName("client.a(Lib;III)V")
	public final void method553(class35 arg0, int arg1, int arg2) {
		int var4 = field1401 + field1293 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = class31.field546[var4];
			int var7 = class31.field547[var4];
			var6 = var6 * 256 / (field1155 + 256);
			var7 = var7 * 256 / (field1155 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method191(var8 + 94 + 4 - arg0.field597 / 2, 83 - var9 - arg0.field598 / 2 - 4, field1205);
			} else {
				arg0.method185(var8 + 94 + 4 - arg0.field597 / 2, 83 - var9 - arg0.field598 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method554() {
		int var1 = field1454.method202("Choose Option");
		for (int var2 = 0; var2 < field1091; var2++) {
			int var3 = field1454.method202(field1224[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1091 * 15 + 21;
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

			field1340 = true;
			field1269 = 0;
			field1270 = var5;
			field1271 = var6;
			field1272 = var1;
			field1273 = field1091 * 15 + 22;
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

			field1340 = true;
			field1269 = 1;
			field1270 = var7;
			field1271 = var8;
			field1272 = var1;
			field1273 = field1091 * 15 + 22;
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

			field1340 = true;
			field1269 = 2;
			field1270 = var9;
			field1271 = var10;
			field1272 = var1;
			field1273 = field1091 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Ld;IIII)V")
	public final void method555(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field63 == 0 && arg0.field78 != null && (!arg0.field77 || field1122 == arg0.field61 || field1104 == arg0.field61 || field1149 == arg0.field61)) {
			int var5 = class33.field564;
			int var6 = class33.field562;
			int var7 = class33.field565;
			int var8 = class33.field563;
			class33.method153(arg2, arg3, arg0.field66 + arg3, arg0.field67 + arg2);
			int var9 = arg0.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field79[var10] + arg3;
				int var12 = arg0.field80[var10] + arg2 - arg1;
				class4 var13 = class4.field56[arg0.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method424(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method555(var13, var13.field76, var12, var11);

					if (var13.field75 > var13.field67) {
						method502(var13.field75, var12, var13.field66 + var11, var13.field76, var13.field67);
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
									if (var17 > class33.field564 - 32 && var17 < class33.field565 && var18 > class33.field562 - 32 && var18 < class33.field563 || field1349 != 0 && field1348 == var14) {
										int var22 = 0;
										if (field1261 == 1 && field1262 == var14 && field1263 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class35 var23 = class60.method348(var13.field58[var14], var21, var22);
										if (var23 != null) {
											if (field1349 != 0 && field1348 == var14 && field1347 == var13.field61) {
												var19 = field17 - field1350;
												var20 = field18 - field1351;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1371 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method187(128, var17 + var19, var18 + var20);

												if (var18 + var20 < class33.field562 && arg0.field76 > 0) {
													int var24 = (class33.field562 - var18 - var20) * field1147 / 3;
													if (var24 > field1147 * 10) {
														var24 = field1147 * 10;
													}

													if (var24 > arg0.field76) {
														var24 = arg0.field76;
													}

													arg0.field76 -= var24;
													field1351 += var24;
												}

												if (var18 + var20 + 32 > class33.field563 && arg0.field76 < arg0.field75 - arg0.field67) {
													int var25 = (var18 + var20 + 32 - class33.field563) * field1147 / 3;
													if (var25 > field1147 * 10) {
														var25 = field1147 * 10;
													}

													if (var25 > arg0.field75 - arg0.field67 - arg0.field76) {
														var25 = arg0.field75 - arg0.field67 - arg0.field76;
													}

													arg0.field76 += var25;
													field1351 -= var25;
												}
											} else if (field1434 != 0 && field1433 == var14 && field1432 == var13.field61) {
												var23.method187(128, var17, var18);
											} else {
												var23.method185(var17, var18);
											}

											if (var23.field597 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1452.method204(var17 + var19 + 1, method484(var26), var18 + var20 + 10, 0);
												field1452.method204(var17 + var19, method484(var26), var18 + var20 + 9, 0xFFFF00);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class35 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method185(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1149 == var13.field61 || field1104 == var13.field61 || field1122 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method425(var13)) {
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
								class33.method156(var11, var29, var13.field67, var13.field66, var12);
							} else {
								class33.method157(var13.field66, var29, var13.field67, var12, var11);
							}
						} else if (var13.field93) {
							class33.method155(256 - (var13.field68 & 0xFF), var13.field66, var29, var11, var13.field67, var12);
						} else {
							class33.method158(256 - (var13.field68 & 0xFF), var29, var12, var11, var13.field66, var13.field67);
						}
					} else if (var13.field63 == 4) {
						class37 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1149 == var13.field61 || field1104 == var13.field61 || field1122 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method425(var13)) {
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

						if (var13.field64 == 6 && field1320) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class33.field560 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field613 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method533(method540(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method533(method540(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method533(method540(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method533(method540(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method533(method540(var13, 4)) + var31.substring(var39 + 2);
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
								var30.method201(var13.field95, var34, var41, var13.field66 / 2 + var11, var33);
							} else {
								var30.method206(var34, var11, var13.field95, var33, var41);
							}

							var34 += var30.field613;
						}
					} else if (var13.field63 == 5) {
						class35 var42;
						if (method425(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method185(var11, var12);
						}
					} else if (var13.field63 == 6) {
						int var43 = class34.field574;
						int var44 = class34.field575;
						class34.field574 = var13.field66 / 2 + var11;
						class34.field575 = var13.field67 / 2 + var12;
						int var45 = class34.field578[var13.field112] * var13.field111 >> 16;
						int var46 = class34.field579[var13.field112] * var13.field111 >> 16;
						boolean var47 = method425(var13);
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
							class66 var50 = class66.field985[var48];
							var49 = var13.method34(var50.field987[var13.field59], var50.field988[var13.field59], var47);
						}

						if (var49 != null) {
							var49.method145(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class34.field574 = var43;
						class34.field575 = var44;
					} else if (var13.field63 == 7) {
						class37 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method342(var13.field57[var52] - 1);
									String var56 = var55.field904;
									if (var55.field915 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method520(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method201(var13.field95, var58, var56, var13.field66 / 2 + var57, var13.field99);
									} else {
										var51.method206(var58, var57, var13.field95, var13.field99, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class33.method153(var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method556(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method556(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1183[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field1459[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
