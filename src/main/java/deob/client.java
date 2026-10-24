package deob;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class client extends class1 {

	@ObfuscatedName("client.ab")
	public int field1047;

	@ObfuscatedName("client.bb")
	public int field1048;

	@ObfuscatedName("client.cb")
	public int field1049;

	@ObfuscatedName("client.db")
	public int field1050;

	@ObfuscatedName("client.eb")
	public int field1051;

	@ObfuscatedName("client.fb")
	public int[] field1052 = new int[class67.field993];

	@ObfuscatedName("client.gb")
	public int field1053;

	@ObfuscatedName("client.hb")
	public int field1054;

	@ObfuscatedName("client.ib")
	public int field1055;

	@ObfuscatedName("client.jb")
	public int field1056;

	@ObfuscatedName("client.kb")
	public boolean field1057 = false;

	@ObfuscatedName("client.lb")
	public class37 field1058;

	@ObfuscatedName("client.mb")
	public class37 field1059;

	@ObfuscatedName("client.nb")
	public static int field1060;

	@ObfuscatedName("client.ob")
	public boolean field1061 = false;

	@ObfuscatedName("client.pb")
	public boolean field1062 = false;

	@ObfuscatedName("client.qb")
	public int field1063;

	@ObfuscatedName("client.rb")
	public int[] field1064 = new int[1000];

	@ObfuscatedName("client.sb")
	public int field1065;

	@ObfuscatedName("client.tb")
	public int[] field1066 = new int[2000];

	@ObfuscatedName("client.ub")
	public class62[] field1067 = new class62[4];

	@ObfuscatedName("client.vb")
	public static int field1068;

	@ObfuscatedName("client.wb")
	public int field1069;

	@ObfuscatedName("client.xb")
	public int field1070;

	@ObfuscatedName("client.yb")
	public class36 field1071;

	@ObfuscatedName("client.zb")
	public long field1072;

	@ObfuscatedName("client.bc")
	public int field1094 = -1;

	@ObfuscatedName("client.dc")
	public boolean field1095 = false;

	@ObfuscatedName("client.ec")
	public int field1096;

	@ObfuscatedName("client.fc")
	public int field1097;

	@ObfuscatedName("client.gc")
	public int[] field1098 = new int[class67.field993];

	@ObfuscatedName("client.hc")
	public class37 field1099;

	@ObfuscatedName("client.ic")
	public class37 field1100;

	@ObfuscatedName("client.jc")
	public class37 field1101;

	@ObfuscatedName("client.kc")
	public class37 field1102;

	@ObfuscatedName("client.lc")
	public class37 field1103;

	@ObfuscatedName("client.mc")
	public boolean field1104 = false;

	@ObfuscatedName("client.nc")
	public int field1105;

	@ObfuscatedName("client.oc")
	public int field1106;

	@ObfuscatedName("client.qc")
	public int field1107 = -1;

	@ObfuscatedName("client.rc")
	public int field1108 = -1;

	@ObfuscatedName("client.sc")
	public class42 field1109 = new class42();

	@ObfuscatedName("client.W")
	public int field1044 = 3;

	@ObfuscatedName("client.Y")
	public boolean field1045 = false;

	@ObfuscatedName("client.Bb")
	public int field1074 = 2;

	@ObfuscatedName("client.Hb")
	public int[] field1079 = new int[5];

	@ObfuscatedName("client.Kb")
	public int[] field1082 = new int[50];

	@ObfuscatedName("client.Pb")
	public byte[] field1087 = new byte[16384];

	@ObfuscatedName("client.Rb")
	public String field1088 = "";

	@ObfuscatedName("client.Sb")
	public String field1089 = "";

	@ObfuscatedName("client.Ub")
	public class36[] field1090 = new class36[20];

	@ObfuscatedName("client.Yb")
	public boolean field1092 = false;

	@ObfuscatedName("client.zc")
	public String field1115 = "";

	@ObfuscatedName("client.Dc")
	public int[][] field1117 = new int[104][104];

	@ObfuscatedName("client.Tc")
	public int field1130 = -1;

	@ObfuscatedName("client.wd")
	public class39 field1159 = class39.method226(1);

	@ObfuscatedName("client.xd")
	public int field1160 = 2048;

	@ObfuscatedName("client.yd")
	public int field1161 = 2047;

	@ObfuscatedName("client.zd")
	public class28[] field1162 = new class28[field1160];

	@ObfuscatedName("client.Bd")
	public int[] field1164 = new int[field1160];

	@ObfuscatedName("client.Dd")
	public int[] field1166 = new int[field1160];

	@ObfuscatedName("client.Ed")
	public class39[] field1167 = new class39[field1160];

	@ObfuscatedName("client.Kd")
	public class4 field1171 = new class4();

	@ObfuscatedName("client.Md")
	public boolean field1172 = false;

	@ObfuscatedName("client.Wd")
	public String[] field1182 = new String[500];

	@ObfuscatedName("client.Xd")
	public class36[] field1183 = new class36[20];

	@ObfuscatedName("client.Yd")
	public int[] field1184 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.be")
	public boolean[] field1187 = new boolean[5];

	@ObfuscatedName("client.ie")
	public int[] field1194 = new int[50];

	@ObfuscatedName("client.le")
	public class42 field1196 = new class42();

	@ObfuscatedName("client.me")
	public class37[] field1197 = new class37[50];

	@ObfuscatedName("client.ne")
	public boolean field1198 = true;

	@ObfuscatedName("client.oe")
	public int field1199 = 128;

	@ObfuscatedName("client.te")
	public boolean field1204 = false;

	@ObfuscatedName("client.ye")
	public boolean field1208 = false;

	@ObfuscatedName("client.Ae")
	public int field1210 = 0x766654;

	@ObfuscatedName("client.Ce")
	public class49[] field1212 = new class49[5];

	@ObfuscatedName("client.De")
	public boolean field1213 = false;

	@ObfuscatedName("client.Me")
	public int[] field1221 = new int[256];

	@ObfuscatedName("client.Pe")
	public boolean field1224 = false;

	@ObfuscatedName("client.Qe")
	public String field1225 = "";

	@ObfuscatedName("client.Re")
	public String field1226 = "";

	@ObfuscatedName("client.Te")
	public int field1228 = -1;

	@ObfuscatedName("client.Ue")
	public int field1229 = -1;

	@ObfuscatedName("client.Ve")
	public boolean field1230 = false;

	@ObfuscatedName("client.We")
	public boolean field1231 = false;

	@ObfuscatedName("client.Xe")
	public int field1232 = -1;

	@ObfuscatedName("client.Ye")
	public int field1233 = 0x332D25;

	@ObfuscatedName("client.Ze")
	public long[] field1234 = new long[100];

	@ObfuscatedName("client.af")
	public class39 field1235 = class39.method226(1);

	@ObfuscatedName("client.cf")
	public int field1237 = 1;

	@ObfuscatedName("client.jf")
	public int[] field1243 = new int[151];

	@ObfuscatedName("client.wf")
	public class37[] field1256 = new class37[13];

	@ObfuscatedName("client.Df")
	public int[][] field1263 = new int[104][104];

	@ObfuscatedName("client.Ef")
	public int[] field1264 = new int[200];

	@ObfuscatedName("client.Ff")
	public class42[][][] field1265 = new class42[4][104][104];

	@ObfuscatedName("client.Kf")
	public int field1269 = 2;

	@ObfuscatedName("client.Rf")
	public int field1274 = -1;

	@ObfuscatedName("client.Tf")
	public boolean field1276 = false;

	@ObfuscatedName("client.Yf")
	public int[] field1281 = new int[500];

	@ObfuscatedName("client.Zf")
	public int[] field1282 = new int[500];

	@ObfuscatedName("client.ag")
	public int[] field1283 = new int[500];

	@ObfuscatedName("client.bg")
	public int[] field1284 = new int[500];

	@ObfuscatedName("client.dg")
	public int field1286 = -1;

	@ObfuscatedName("client.eg")
	public class27[] field1287 = new class27[16384];

	@ObfuscatedName("client.gg")
	public int[] field1289 = new int[16384];

	@ObfuscatedName("client.ig")
	public CRC32 field1291 = new CRC32();

	@ObfuscatedName("client.mg")
	public long[] field1294 = new long[200];

	@ObfuscatedName("client.sg")
	public int[] field1299 = new int[class67.field993];

	@ObfuscatedName("client.tg")
	public int[] field1300 = new int[33];

	@ObfuscatedName("client.ug")
	public boolean field1301 = false;

	@ObfuscatedName("client.Ag")
	public int[] field1307 = new int[5];

	@ObfuscatedName("client.Dg")
	public final int field1308 = 100;

	@ObfuscatedName("client.Eg")
	public int[] field1309 = new int[100];

	@ObfuscatedName("client.Gg")
	public String[] field1311 = new String[200];

	@ObfuscatedName("client.Ig")
	public int[] field1313 = new int[1000];

	@ObfuscatedName("client.Jg")
	public int[] field1314 = new int[1000];

	@ObfuscatedName("client.Lg")
	public int field1316 = -1;

	@ObfuscatedName("client.Ng")
	public String field1318 = "";

	@ObfuscatedName("client.Ug")
	public int field1325 = 2;

	@ObfuscatedName("client.Yg")
	public int field1329 = 50;

	@ObfuscatedName("client.Zg")
	public int[] field1330 = new int[field1329];

	@ObfuscatedName("client.ah")
	public int[] field1331 = new int[field1329];

	@ObfuscatedName("client.bh")
	public int[] field1332 = new int[field1329];

	@ObfuscatedName("client.ch")
	public int[] field1333 = new int[field1329];

	@ObfuscatedName("client.dh")
	public int[] field1334 = new int[field1329];

	@ObfuscatedName("client.eh")
	public int[] field1335 = new int[field1329];

	@ObfuscatedName("client.fh")
	public int[] field1336 = new int[field1329];

	@ObfuscatedName("client.gh")
	public String[] field1337 = new String[field1329];

	@ObfuscatedName("client.hh")
	public boolean field1338 = false;

	@ObfuscatedName("client.ih")
	public int field1339 = -1;

	@ObfuscatedName("client.jh")
	public int field1340 = 0x4D4233;

	@ObfuscatedName("client.kh")
	public int[] field1341 = new int[33];

	@ObfuscatedName("client.qh")
	public int[] field1347 = new int[9];

	@ObfuscatedName("client.vh")
	public boolean field1352 = true;

	@ObfuscatedName("client.xh")
	public boolean field1353 = true;

	@ObfuscatedName("client.zh")
	public int field1355 = -1;

	@ObfuscatedName("client.Fh")
	public String field1361 = "";

	@ObfuscatedName("client.Gh")
	public int[] field1362 = new int[7];

	@ObfuscatedName("client.Hh")
	public int[] field1363 = new int[4000];

	@ObfuscatedName("client.Ih")
	public int[] field1364 = new int[4000];

	@ObfuscatedName("client.Ph")
	public int[] field1371 = new int[50];

	@ObfuscatedName("client.Rh")
	public int[] field1372 = new int[5];

	@ObfuscatedName("client.mi")
	public boolean field1388 = false;

	@ObfuscatedName("client.oi")
	public boolean field1389 = false;

	@ObfuscatedName("client.pi")
	public int[] field1390 = new int[5];

	@ObfuscatedName("client.ri")
	public int[] field1391 = new int[151];

	@ObfuscatedName("client.si")
	public boolean field1392 = false;

	@ObfuscatedName("client.zi")
	public String field1396 = "";

	@ObfuscatedName("client.Bi")
	public class36[] field1397 = new class36[50];

	@ObfuscatedName("client.Ci")
	public int[] field1398 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ki")
	public class42 field1405 = new class42();

	@ObfuscatedName("client.Ni")
	public class37[] field1407 = new class37[2];

	@ObfuscatedName("client.Si")
	public int field1412 = 1;

	@ObfuscatedName("client.Ti")
	public boolean field1413 = false;

	@ObfuscatedName("client.Ui")
	public final int[] field1414 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Xi")
	public int[] field1416 = new int[2000];

	@ObfuscatedName("client.bj")
	public boolean field1419 = false;

	@ObfuscatedName("client.cj")
	public boolean field1420 = false;

	@ObfuscatedName("client.fj")
	public class36[] field1423 = new class36[1000];

	@ObfuscatedName("client.gj")
	public boolean field1424 = true;

	@ObfuscatedName("client.ij")
	public boolean field1426 = false;

	@ObfuscatedName("client.jj")
	public int[] field1427 = new int[100];

	@ObfuscatedName("client.kj")
	public String[] field1428 = new String[100];

	@ObfuscatedName("client.lj")
	public String[] field1429 = new String[100];

	@ObfuscatedName("client.nj")
	public int[] field1430 = new int[5];

	@ObfuscatedName("client.oj")
	public int field1431 = -1;

	@ObfuscatedName("client.qj")
	public String field1432 = "";

	@ObfuscatedName("client.uj")
	public class36[] field1436 = new class36[8];

	@ObfuscatedName("client.wj")
	public int field1437 = 78;

	@ObfuscatedName("client.zj")
	public int[][] field1439 = new int[104][104];

	@ObfuscatedName("client.Bj")
	public int field1440 = -1;

	@ObfuscatedName("client.Fj")
	public class39 field1444 = class39.method226(1);

	@ObfuscatedName("client.Lj")
	public int field1449 = 0x23201B;

	@ObfuscatedName("client.Gb")
	public static final int[] field1078 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.vd")
	public static BigInteger field1158 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Nd")
	public static int field1173 = 10;

	@ObfuscatedName("client.Pd")
	public static boolean field1175 = true;

	@ObfuscatedName("client.Xf")
	public static final int[][] field1280 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.lg")
	public static int[] field1293 = new int[32];

	@ObfuscatedName("client.Mg")
	public static String field1317 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.oh")
	public static int[] field1345 = new int[99];

	@ObfuscatedName("client.yi")
	public static BigInteger field1395 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.R")
	public int field1039;

	@ObfuscatedName("client.S")
	public int field1040;

	@ObfuscatedName("client.T")
	public int field1041;

	@ObfuscatedName("client.U")
	public int field1042;

	@ObfuscatedName("client.V")
	public int field1043;

	@ObfuscatedName("client.Z")
	public int field1046;

	@ObfuscatedName("client.Ab")
	public int field1073;

	@ObfuscatedName("client.Cb")
	public int field1075;

	@ObfuscatedName("client.Db")
	public int field1076;

	@ObfuscatedName("client.Fb")
	public int field1077;

	@ObfuscatedName("client.Ib")
	public int field1080;

	@ObfuscatedName("client.Jb")
	public int field1081;

	@ObfuscatedName("client.Ob")
	public int field1086;

	@ObfuscatedName("client.Zb")
	public int field1093;

	@ObfuscatedName("client.tc")
	public int field1110;

	@ObfuscatedName("client.uc")
	public int field1111;

	@ObfuscatedName("client.xc")
	public int field1113;

	@ObfuscatedName("client.yc")
	public static int field1114;

	@ObfuscatedName("client.Bc")
	public int field1116;

	@ObfuscatedName("client.Fc")
	public int field1118;

	@ObfuscatedName("client.Gc")
	public int field1119;

	@ObfuscatedName("client.Ic")
	public static int field1120;

	@ObfuscatedName("client.Jc")
	public int field1121;

	@ObfuscatedName("client.Kc")
	public int field1122;

	@ObfuscatedName("client.Lc")
	public int field1123;

	@ObfuscatedName("client.Mc")
	public int field1124;

	@ObfuscatedName("client.Nc")
	public int field1125;

	@ObfuscatedName("client.Pc")
	public int field1126;

	@ObfuscatedName("client.Qc")
	public int field1127;

	@ObfuscatedName("client.Rc")
	public int field1128;

	@ObfuscatedName("client.Sc")
	public int field1129;

	@ObfuscatedName("client.dd")
	public int field1140;

	@ObfuscatedName("client.ed")
	public int field1141;

	@ObfuscatedName("client.fd")
	public int field1142;

	@ObfuscatedName("client.gd")
	public int field1143;

	@ObfuscatedName("client.hd")
	public int field1144;

	@ObfuscatedName("client.kd")
	public int field1147;

	@ObfuscatedName("client.ld")
	public static int field1148;

	@ObfuscatedName("client.Ad")
	public int field1163;

	@ObfuscatedName("client.Cd")
	public int field1165;

	@ObfuscatedName("client.Hd")
	public int field1169;

	@ObfuscatedName("client.Id")
	public int field1170;

	@ObfuscatedName("client.Od")
	public static int field1174;

	@ObfuscatedName("client.Zd")
	public int field1185;

	@ObfuscatedName("client.ae")
	public static int field1186;

	@ObfuscatedName("client.ce")
	public int field1188;

	@ObfuscatedName("client.de")
	public int field1189;

	@ObfuscatedName("client.ee")
	public int field1190;

	@ObfuscatedName("client.fe")
	public int field1191;

	@ObfuscatedName("client.ge")
	public int field1192;

	@ObfuscatedName("client.he")
	public static int field1193;

	@ObfuscatedName("client.ke")
	public int field1195;

	@ObfuscatedName("client.pe")
	public int field1200;

	@ObfuscatedName("client.qe")
	public int field1201;

	@ObfuscatedName("client.re")
	public int field1202;

	@ObfuscatedName("client.se")
	public int field1203;

	@ObfuscatedName("client.ue")
	public static int field1205;

	@ObfuscatedName("client.Fe")
	public int field1215;

	@ObfuscatedName("client.Le")
	public int field1220;

	@ObfuscatedName("client.Se")
	public int field1227;

	@ObfuscatedName("client.bf")
	public int field1236;

	@ObfuscatedName("client.ef")
	public int field1239;

	@ObfuscatedName("client.ff")
	public int field1240;

	@ObfuscatedName("client.gf")
	public int field1241;

	@ObfuscatedName("client.hf")
	public int field1242;

	@ObfuscatedName("client.lf")
	public static int field1245;

	@ObfuscatedName("client.mf")
	public int field1246;

	@ObfuscatedName("client.nf")
	public static int field1247;

	@ObfuscatedName("client.qf")
	public int field1250;

	@ObfuscatedName("client.rf")
	public int field1251;

	@ObfuscatedName("client.sf")
	public int field1252;

	@ObfuscatedName("client.tf")
	public int field1253;

	@ObfuscatedName("client.uf")
	public int field1254;

	@ObfuscatedName("client.vf")
	public int field1255;

	@ObfuscatedName("client.yf")
	public int field1258;

	@ObfuscatedName("client.zf")
	public int field1259;

	@ObfuscatedName("client.Gf")
	public int field1266;

	@ObfuscatedName("client.If")
	public int field1267;

	@ObfuscatedName("client.Jf")
	public int field1268;

	@ObfuscatedName("client.Lf")
	public static int field1270;

	@ObfuscatedName("client.Pf")
	public int field1273;

	@ObfuscatedName("client.Sf")
	public static int field1275;

	@ObfuscatedName("client.Uf")
	public static int field1277;

	@ObfuscatedName("client.Vf")
	public static int field1278;

	@ObfuscatedName("client.cg")
	public int field1285;

	@ObfuscatedName("client.fg")
	public int field1288;

	@ObfuscatedName("client.hg")
	public int field1290;

	@ObfuscatedName("client.jg")
	public int field1292;

	@ObfuscatedName("client.vg")
	public int field1302;

	@ObfuscatedName("client.wg")
	public int field1303;

	@ObfuscatedName("client.xg")
	public int field1304;

	@ObfuscatedName("client.yg")
	public int field1305;

	@ObfuscatedName("client.zg")
	public int field1306;

	@ObfuscatedName("client.Hg")
	public int field1312;

	@ObfuscatedName("client.Kg")
	public int field1315;

	@ObfuscatedName("client.Sg")
	public int field1323;

	@ObfuscatedName("client.Tg")
	public int field1324;

	@ObfuscatedName("client.Vg")
	public int field1326;

	@ObfuscatedName("client.Wg")
	public int field1327;

	@ObfuscatedName("client.Xg")
	public int field1328;

	@ObfuscatedName("client.lh")
	public int field1342;

	@ObfuscatedName("client.mh")
	public int field1343;

	@ObfuscatedName("client.nh")
	public int field1344;

	@ObfuscatedName("client.ph")
	public int field1346;

	@ObfuscatedName("client.rh")
	public int field1348;

	@ObfuscatedName("client.yh")
	public int field1354;

	@ObfuscatedName("client.Ah")
	public static int field1356;

	@ObfuscatedName("client.Bh")
	public int field1357;

	@ObfuscatedName("client.Jh")
	public int field1365;

	@ObfuscatedName("client.Kh")
	public int field1366;

	@ObfuscatedName("client.Lh")
	public int field1367;

	@ObfuscatedName("client.Mh")
	public int field1368;

	@ObfuscatedName("client.Nh")
	public int field1369;

	@ObfuscatedName("client.Oh")
	public int field1370;

	@ObfuscatedName("client.bi")
	public int field1378;

	@ObfuscatedName("client.ci")
	public int field1379;

	@ObfuscatedName("client.di")
	public int field1380;

	@ObfuscatedName("client.ei")
	public int field1381;

	@ObfuscatedName("client.fi")
	public int field1382;

	@ObfuscatedName("client.gi")
	public int field1383;

	@ObfuscatedName("client.hi")
	public int field1384;

	@ObfuscatedName("client.ji")
	public int field1386;

	@ObfuscatedName("client.ki")
	public int field1387;

	@ObfuscatedName("client.ti")
	public int field1393;

	@ObfuscatedName("client.ui")
	public int field1394;

	@ObfuscatedName("client.Ei")
	public int field1399;

	@ObfuscatedName("client.Fi")
	public int field1400;

	@ObfuscatedName("client.Gi")
	public int field1401;

	@ObfuscatedName("client.Hi")
	public int field1402;

	@ObfuscatedName("client.Oi")
	public int field1408;

	@ObfuscatedName("client.Pi")
	public int field1409;

	@ObfuscatedName("client.Qi")
	public int field1410;

	@ObfuscatedName("client.Ri")
	public int field1411;

	@ObfuscatedName("client.Wi")
	public static int field1415;

	@ObfuscatedName("client.Zi")
	public static int field1417;

	@ObfuscatedName("client.aj")
	public int field1418;

	@ObfuscatedName("client.rj")
	public int field1433;

	@ObfuscatedName("client.sj")
	public int field1434;

	@ObfuscatedName("client.tj")
	public int field1435;

	@ObfuscatedName("client.Wb")
	public long field1091;

	@ObfuscatedName("client.we")
	public long field1206;

	@ObfuscatedName("client.ii")
	public long field1385;

	@ObfuscatedName("client.ej")
	public long field1422;

	@ObfuscatedName("client.xf")
	public class19 field1257;

	@ObfuscatedName("client.ai")
	public static class28 field1377;

	@ObfuscatedName("client.Ee")
	public class36 field1214;

	@ObfuscatedName("client.Ge")
	public class36 field1216;

	@ObfuscatedName("client.He")
	public class36 field1217;

	@ObfuscatedName("client.Ie")
	public class36 field1218;

	@ObfuscatedName("client.Je")
	public class36 field1219;

	@ObfuscatedName("client.Ne")
	public class36 field1222;

	@ObfuscatedName("client.Oe")
	public class36 field1223;

	@ObfuscatedName("client.of")
	public class36 field1248;

	@ObfuscatedName("client.pf")
	public class36 field1249;

	@ObfuscatedName("client.ng")
	public class36 field1295;

	@ObfuscatedName("client.og")
	public class36 field1296;

	@ObfuscatedName("client.xj")
	public class36 field1438;

	@ObfuscatedName("client.Rd")
	public class37 field1177;

	@ObfuscatedName("client.Sd")
	public class37 field1178;

	@ObfuscatedName("client.Td")
	public class37 field1179;

	@ObfuscatedName("client.Ud")
	public class37 field1180;

	@ObfuscatedName("client.Vd")
	public class37 field1181;

	@ObfuscatedName("client.pg")
	public class37 field1297;

	@ObfuscatedName("client.qg")
	public class37 field1298;

	@ObfuscatedName("client.sh")
	public class37 field1349;

	@ObfuscatedName("client.th")
	public class37 field1350;

	@ObfuscatedName("client.uh")
	public class37 field1351;

	@ObfuscatedName("client.Cj")
	public class37 field1441;

	@ObfuscatedName("client.Dj")
	public class37 field1442;

	@ObfuscatedName("client.Ej")
	public class37 field1443;

	@ObfuscatedName("client.Og")
	public class38 field1319;

	@ObfuscatedName("client.Pg")
	public class38 field1320;

	@ObfuscatedName("client.Qg")
	public class38 field1321;

	@ObfuscatedName("client.Rg")
	public class38 field1322;

	@ObfuscatedName("client.Uc")
	public class44 field1131;

	@ObfuscatedName("client.Vc")
	public class44 field1132;

	@ObfuscatedName("client.Wc")
	public class44 field1133;

	@ObfuscatedName("client.Xc")
	public class44 field1134;

	@ObfuscatedName("client.Yc")
	public class44 field1135;

	@ObfuscatedName("client.Zc")
	public class44 field1136;

	@ObfuscatedName("client.ad")
	public class44 field1137;

	@ObfuscatedName("client.bd")
	public class44 field1138;

	@ObfuscatedName("client.cd")
	public class44 field1139;

	@ObfuscatedName("client.md")
	public class44 field1149;

	@ObfuscatedName("client.nd")
	public class44 field1150;

	@ObfuscatedName("client.od")
	public class44 field1151;

	@ObfuscatedName("client.pd")
	public class44 field1152;

	@ObfuscatedName("client.qd")
	public class44 field1153;

	@ObfuscatedName("client.rd")
	public class44 field1154;

	@ObfuscatedName("client.sd")
	public class44 field1155;

	@ObfuscatedName("client.td")
	public class44 field1156;

	@ObfuscatedName("client.ud")
	public class44 field1157;

	@ObfuscatedName("client.Ch")
	public class44 field1358;

	@ObfuscatedName("client.Dh")
	public class44 field1359;

	@ObfuscatedName("client.Eh")
	public class44 field1360;

	@ObfuscatedName("client.Th")
	public class44 field1373;

	@ObfuscatedName("client.Uh")
	public class44 field1374;

	@ObfuscatedName("client.Vh")
	public class44 field1375;

	@ObfuscatedName("client.Wh")
	public class44 field1376;

	@ObfuscatedName("client.xe")
	public class48 field1207;

	@ObfuscatedName("client.vc")
	public class50 field1112;

	@ObfuscatedName("client.Mi")
	public class51 field1406;

	@ObfuscatedName("client.Ji")
	public class58 field1404;

	@ObfuscatedName("client.jd")
	public class5 field1146;

	@ObfuscatedName("client.id")
	public String field1145;

	@ObfuscatedName("client.df")
	public String field1238;

	@ObfuscatedName("client.kf")
	public String field1244;

	@ObfuscatedName("client.Ii")
	public String field1403;

	@ObfuscatedName("client.Qd")
	public static boolean field1176;

	@ObfuscatedName("client.ze")
	public static boolean field1209;

	@ObfuscatedName("client.dj")
	public static boolean field1421;

	@ObfuscatedName("client.P")
	public int[] field1037;

	@ObfuscatedName("client.Q")
	public int[] field1038;

	@ObfuscatedName("client.Lb")
	public int[] field1083;

	@ObfuscatedName("client.Mb")
	public int[] field1084;

	@ObfuscatedName("client.Nb")
	public int[] field1085;

	@ObfuscatedName("client.Af")
	public int[] field1260;

	@ObfuscatedName("client.Bf")
	public int[] field1261;

	@ObfuscatedName("client.Cf")
	public int[] field1262;

	@ObfuscatedName("client.Mf")
	public int[] field1271;

	@ObfuscatedName("client.Nf")
	public int[] field1272;

	@ObfuscatedName("client.Gj")
	public int[] field1445;

	@ObfuscatedName("client.Hj")
	public int[] field1446;

	@ObfuscatedName("client.Ij")
	public int[] field1447;

	@ObfuscatedName("client.Jj")
	public int[] field1448;

	@ObfuscatedName("client.Fg")
	public class37[] field1310;

	@ObfuscatedName("client.Wf")
	public byte[][] field1279;

	@ObfuscatedName("client.hj")
	public byte[][] field1425;

	@ObfuscatedName("client.Be")
	public byte[][][] field1211;

	@ObfuscatedName("client.Fd")
	public int[][][] field1168;

	@ObfuscatedName("client.a(BI)V")
	public final void method431(int arg0) {
		int[] var2 = field1071.field596;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field1211[arg0][var7][var5] & 0x18) == 0) {
					field1257.method99(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field1211[arg0 + 1][var7][var5] & 0x8) != 0) {
					field1257.method99(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field1071.method194();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field1211[arg0][var11][var10] & 0x18) == 0) {
					method462(var11, var9, var8, arg0, var10);
				}

				if (arg0 < 3 && (field1211[arg0 + 1][var11][var10] & 0x8) != 0) {
					method462(var11, var9, var8, arg0 + 1, var10);
				}
			}
		}

		field1375.method268();
		field1312 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field1257.method93(field1080, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = class57.method334(var14).field837;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field1067[field1080].field943;
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

						field1423[field1312] = field1397[var15];
						field1313[field1312] = var16;
						field1314[field1312] = var17;
						field1312++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method432() {
		if (field1131 == null) {
			field10 = null;
			field1376 = null;
			field1374 = null;
			field1373 = null;
			field1375 = null;
			field1358 = null;
			field1359 = null;
			field1360 = null;
			field1134 = new class44(method11(), 128, 265);
			class34.method168();
			field1135 = new class44(method11(), 128, 265);
			class34.method168();
			field1131 = new class44(method11(), 509, 171);
			class34.method168();
			field1132 = new class44(method11(), 360, 132);
			class34.method168();
			field1133 = new class44(method11(), 360, 200);
			class34.method168();
			field1136 = new class44(method11(), 202, 238);
			class34.method168();
			field1137 = new class44(method11(), 203, 238);
			class34.method168();
			field1138 = new class44(method11(), 74, 94);
			class34.method168();
			field1139 = new class44(method11(), 75, 94);
			class34.method168();

			if (field1406 != null) {
				method530();
				method560();
			}

			field1419 = true;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method433() {
		try {
			field1339 = -1;
			field1405.method262();
			field1196.method262();
			class35.method180();
			method460();
			field1257.method64();

			for (int var1 = 0; var1 < 4; var1++) {
				field1067[var1].method361();
			}

			System.gc();
			class3 var2 = new class3(field1211, 104, 104, field1168);
			int var3 = field1425.length;
			class3.field32 = class19.field266;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = field1260[var4] >> 8;
				int var6 = field1260[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					class3.field32 = false;
				}
			}

			if (class3.field32) {
				field1257.method65(field1080);
			} else {
				field1257.method65(0);
			}

			field1235.method228(139);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (field1260[var7] >> 8) * 64 - field1302;
				int var9 = (field1260[var7] & 0xFF) * 64 - field1303;
				byte[] var10 = field1425[var7];
				if (var10 != null) {
					var2.method15(var9, var10, var8, (field1393 - 6) * 8, (field1394 - 6) * 8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (field1260[var11] >> 8) * 64 - field1302;
				int var13 = (field1260[var11] & 0xFF) * 64 - field1303;
				byte[] var14 = field1425[var11];
				if (var14 == null && field1394 < 800) {
					var2.method14(var13, 64, var12, 64);
				}
			}

			field1235.method228(139);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = field1279[var15];
				if (var16 != null) {
					int var17 = (field1260[var15] >> 8) * 64 - field1302;
					int var18 = (field1260[var15] & 0xFF) * 64 - field1303;
					var2.method18(field1067, field1257, var16, var18, var17);
				}
			}

			field1235.method228(139);
			var2.method20(field1257, field1067);
			field1375.method268();
			field1235.method228(139);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					method527(var19, var20);
				}
			}

			method539();
		} catch (Exception var33) {
		}

		class57.field851.method117();

		if (field1176 && signlink.cache_dat != null) {
			int var22 = field1207.method282(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = field1207.method287(var23);
				if ((var24 & 0x79) == 0) {
					class32.method138(var23);
				}
			}
		}

		System.gc();
		class35.method181(20);
		field1207.method293();
		int var25 = (field1393 - 6) / 8 - 1;
		int var26 = (field1393 + 6) / 8 + 1;
		int var27 = (field1394 - 6) / 8 - 1;
		int var28 = (field1394 + 6) / 8 + 1;
		if (field1213) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = field1207.method284(var29, var30, 0);
					if (var31 != -1) {
						field1207.method294(3, var31);
					}

					int var32 = field1207.method284(var29, var30, 1);
					if (var32 != -1) {
						field1207.method294(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method434() {
		if (field1176 && field1105 == 2 && class3.field33 != field1080) {
			field1375.method268();
			field1320.method214(0, "Loading - please wait.", 151, 257);
			field1320.method214(0xFFFFFF, "Loading - please wait.", 150, 256);
			field1375.method269(4, field9, 4);
			field1105 = 1;
			field1072 = System.currentTimeMillis();
		}

		if (field1105 == 1) {
			int var1 = method435();
			if (var1 != 0 && System.currentTimeMillis() - field1072 > 360000L) {
				signlink.reporterror(field1088 + " glcfb " + field1385 + "," + var1 + "," + field1176 + "," + field1212[0] + "," + field1207.method290() + "," + field1080 + "," + field1393 + "," + field1394);
				field1072 = System.currentTimeMillis();
			}
		}

		if (field1105 == 2 && field1339 != field1080) {
			field1339 = field1080;
			method431(field1080);
		}
	}

	@ObfuscatedName("client.d(B)I")
	public final int method435() {
		for (int var1 = 0; var1 < field1425.length; var1++) {
			if (field1425[var1] == null && field1261[var1] != -1) {
				return -1;
			}

			if (field1279[var1] == null && field1262[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field1425.length; var3++) {
			byte[] var4 = field1279[var3];
			if (var4 != null) {
				int var5 = (field1260[var3] >> 8) * 64 - field1302;
				int var6 = (field1260[var3] & 0xFF) * 64 - field1303;
				var2 &= class3.method16(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field1092) {
			return -4;
		} else {
			field1105 = 2;
			class3.field33 = field1080;
			method433();
			field1235.method228(232);
			return 0;
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method436(boolean arg0) {
		if (field1377.field368 >> 7 == field1069 && field1377.field369 >> 7 == field1070) {
			field1069 = 0;
		}

		int var2 = field1163;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			class28 var4;
			int var5;
			if (arg0) {
				var4 = field1377;
				var5 = field1161 << 14;
			} else {
				var4 = field1162[field1164[var3]];
				var5 = field1164[var3] << 14;
			}

			if (var4 != null && var4.method127()) {
				var4.field442 = false;
				if ((field1176 && field1163 > 50 || field1163 > 200) && !arg0 && var4.field393 == var4.field373) {
					var4.field442 = true;
				}

				int var6 = var4.field368 >> 7;
				int var7 = var4.field369 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field437 == null || field1060 < var4.field432 || field1060 >= var4.field433) {
						if ((var4.field368 & 0x7F) == 0x40 && (var4.field369 & 0x7F) == 0x40) {
							if (field1439[var6][var7] == field1342) {
								continue;
							}

							field1439[var6][var7] = field1342;
						}

						var4.field431 = method501(field1080, var4.field368, var4.field369);
						field1257.method75(var4, var4.field431, field1080, var5, var4.field368, 60, var4.field369, var4.field370, var4.field371);
					} else {
						var4.field442 = false;
						var4.field431 = method501(field1080, var4.field368, var4.field369);
						field1257.method76(var4.field370, var4.field368, var4, var4.field438, var4.field431, var4.field440, field1080, 60, var4.field439, var4.field369, var4.field441, var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method437() {
		for (class33 var1 = (class33) field1405.method258(); var1 != null; var1 = (class33) field1405.method260()) {
			if (field1080 != var1.field556 || var1.field562) {
				var1.method120();
			} else if (field1060 >= var1.field555) {
				var1.method164(field1315);

				if (var1.field562) {
					var1.method120();
				} else {
					field1257.method75(var1, var1.field559, var1.field556, -1, var1.field557, 60, var1.field558, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method438() {
		method507();

		if (field1129 == 1) {
			field1436[field1128 / 100].method199(field1127 - 8 - 4, field1126 - 8 - 4);
		}

		if (field1129 == 2) {
			field1436[field1128 / 100 + 4].method199(field1127 - 8 - 4, field1126 - 8 - 4);
		}

		if (field1229 != -1) {
			method515(field1229, field1315);
			method526(class4.field56[field1229], 0, 0, 0);
		}

		if (field1246 > 0) {
			int var1 = 302 - (int) Math.abs(Math.sin(field1246 / 10.0D) * 10.0D);
			for (int var2 = 0; var2 < 30; var2++) {
				int var3 = (30 - var2) * 16;
				class34.method174(var1 + var2, 0xFFFF00, field1246, 256 - var3 / 2, var3);
			}
		}

		if (field1274 != -1) {
			method515(field1274, field1315);
			method526(class4.field56[field1274], 0, 0, 0);
		}

		method531();

		if (!field1413) {
			method478();
			method506();
		} else if (field1366 == 0) {
			method449();
		}

		if (field1348 == 1) {
			if (field1285 > 0 || field1266 == 1) {
				field1090[1].method199(258, 472);
			} else {
				field1090[1].method199(296, 472);
			}
		}

		if (field1285 > 0) {
			field1090[0].method199(296, 472);
			field1320.method214(0xFFFF00, "Level: " + field1285, 329, 484);
		}

		if (field1266 == 1) {
			field1090[6].method199(296, 472);
			field1320.method214(0xFFFF00, "Arena", 329, 484);
		}

		if (field1111 != 0) {
			int var4 = field1111 / 50;
			int var5 = var4 / 60;
			var4 %= 60;
			if (var4 < 10) {
				field1320.method217(4, "System update in: " + var5 + ":0" + var4, 329, 0xFFFF00);
			} else {
				field1320.method217(4, "System update in: " + var5 + ":" + var4, 329, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method439() {
		field1235.method228(125);

		if (field1440 != -1) {
			field1440 = -1;
			field1057 = true;
			field1392 = false;
			field1338 = true;
		}

		if (field1130 != -1) {
			field1130 = -1;
			field1224 = true;
			field1392 = false;
		}

		field1274 = -1;
	}

	@ObfuscatedName("client.a(IBIILbb;)V")
	public final void method440(int arg0, int arg1, int arg2, class28 arg3) {
		if (field1377 != arg3 && field1147 < 400) {
			String var5 = arg3.field423 + method523(arg3.field429, field1377.field429) + " (level-" + arg3.field429 + ")";
			if (field1399 == 1) {
				field1182[field1147] = "Use " + field1403 + " with @whi@" + var5;
				field1283[field1147] = 367;
				field1284[field1147] = arg1;
				field1281[field1147] = arg0;
				field1282[field1147] = arg2;
				field1147++;
			} else if (field1142 != 1) {
				field1182[field1147] = "Follow @whi@" + var5;
				field1283[field1147] = 1544;
				field1284[field1147] = arg1;
				field1281[field1147] = arg0;
				field1282[field1147] = arg2;
				field1147++;
				if (field1106 == 0) {
					field1182[field1147] = "Trade with @whi@" + var5;
					field1283[field1147] = 1373;
					field1284[field1147] = arg1;
					field1281[field1147] = arg0;
					field1282[field1147] = arg2;
					field1147++;
				}

				if (field1285 > 0) {
					field1182[field1147] = "Attack @whi@" + var5;

					if (field1377.field429 >= arg3.field429) {
						field1283[field1147] = 151;
					} else {
						field1283[field1147] = 2151;
					}

					field1284[field1147] = arg1;
					field1281[field1147] = arg0;
					field1282[field1147] = arg2;
					field1147++;
				}

				if (field1266 == 1) {
					field1182[field1147] = "Fight @whi@" + var5;
					field1283[field1147] = 151;
					field1284[field1147] = arg1;
					field1281[field1147] = arg0;
					field1282[field1147] = arg2;
					field1147++;
				}

				if (field1266 == 2) {
					field1182[field1147] = "Duel-with @whi@" + var5;
					field1283[field1147] = 1101;
					field1284[field1147] = arg1;
					field1281[field1147] = arg0;
					field1282[field1147] = arg2;
					field1147++;
				}
			} else if ((field1144 & 0x8) == 8) {
				field1182[field1147] = field1145 + " @whi@" + var5;
				field1283[field1147] = 651;
				field1284[field1147] = arg1;
				field1281[field1147] = arg0;
				field1282[field1147] = arg2;
				field1147++;
			}

			for (int var6 = 0; var6 < field1147; var6++) {
				if (field1283[var6] == 660) {
					field1182[var6] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method441() {
		for (int var1 = -1; var1 < field1163; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1161;
			} else {
				var2 = field1164[var1];
			}

			class28 var3 = field1162[var2];
			if (var3 != null) {
				method493(var3, 1);
			}
		}

		field1277++;
		if (field1277 > 1406) {
			field1277 = 0;
			field1235.method228(54);
			field1235.method229(0);
			int var4 = field1235.field623;
			field1235.method229(162);
			field1235.method229(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1235.method229(84);
			}

			field1235.method230(31824);
			field1235.method230(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				field1235.method229(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field1235.method229(134);
			}

			field1235.method229(100);
			field1235.method229(94);
			field1235.method230(35521);
			field1235.method238(field1235.field623 - var4);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method442() {
		field1061 = false;
		while (field1062) {
			field1061 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field1058 = null;
		field1059 = null;
		field1310 = null;
		field1445 = null;
		field1446 = null;
		field1447 = null;
		field1448 = null;
		field1271 = null;
		field1272 = null;
		field1037 = null;
		field1038 = null;
		field1222 = null;
		field1223 = null;
	}

	@ObfuscatedName("client.a(ZLd;)Z")
	public final boolean method443(class4 arg0) {
		int var2 = arg0.field65;
		if (field1410 == 2) {
			if (var2 == 201) {
				field1224 = true;
				field1095 = false;
				field1276 = true;
				field1318 = "";
				field1195 = 1;
				field1115 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field1224 = true;
				field1095 = false;
				field1276 = true;
				field1318 = "";
				field1195 = 2;
				field1115 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field1043 = 250;
			return true;
		}

		if (var2 == 501) {
			field1224 = true;
			field1095 = false;
			field1276 = true;
			field1318 = "";
			field1195 = 4;
			field1115 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field1224 = true;
			field1095 = false;
			field1276 = true;
			field1318 = "";
			field1195 = 5;
			field1115 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field1362[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = class64.field957 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= class64.field957) {
							var5 = 0;
						}
					}

					if (!class64.field958[var5].field964 && class64.field958[var5].field959 == var3 + (field1424 ? 0 : 7)) {
						break;
					}
				}

				field1362[var3] = var5;
				field1231 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field1079[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field1280[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field1280[var6].length) {
					var8 = 0;
				}
			}

			field1079[var6] = var8;
			field1231 = true;
		}

		if (var2 == 324 && !field1424) {
			field1424 = true;
			method456();
		}

		if (var2 == 325 && field1424) {
			field1424 = false;
			method456();
		}

		if (var2 == 326) {
			field1235.method228(124);
			field1235.method229(field1424 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field1235.method229(field1362[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field1235.method229(field1079[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field1104 = !field1104;
		}

		if (var2 >= 601 && var2 <= 612) {
			method439();

			if (field1432.length() > 0) {
				field1235.method228(102);
				field1235.method235(class52.method310(field1432));
				field1235.method229(var2 - 601);
				field1235.method229(field1104 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method444(int arg0) {
		if (!field1176) {
			if (class35.field592[17] >= arg0) {
				class37 var2 = class35.field586[17];
				int var3 = var2.field606 * var2.field605 - 1;
				int var4 = field1315 * var2.field605 * 2;
				byte[] var5 = var2.field603;
				byte[] var6 = field1087;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field603 = var6;
				field1087 = var5;
				class35.method184(17);
			}

			if (class35.field592[24] >= arg0) {
				class37 var8 = class35.field586[24];
				int var9 = var8.field606 * var8.field605 - 1;
				int var10 = field1315 * var8.field605 * 2;
				byte[] var11 = var8.field603;
				byte[] var12 = field1087;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field603 = var12;
				field1087 = var11;
				class35.method184(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method445() {
		field1342++;
		method436(true);
		method504(true);
		method436(false);
		method504(false);
		method455();
		method437();

		if (!field1388) {
			int var1 = field1199;
			if (field1365 / 256 > var1) {
				var1 = field1365 / 256;
			}

			if (field1187[4] && field1430[4] + 128 > var1) {
				var1 = field1430[4] + 128;
			}

			int var2 = field1411 + field1200 & 0x7FF;
			method511(field1075, var2, field1076, method501(field1080, field1377.field368, field1377.field369) - 50, var1 * 3 + 600, var1);
			field1356++;
			if (field1356 > 1802) {
				field1356 = 0;
				field1235.method228(180);
				field1235.method229(0);
				int var3 = field1235.field623;
				field1235.method230(29711);
				field1235.method229(70);
				field1235.method229((int) (Math.random() * 256.0D));
				field1235.method229(242);
				field1235.method229(186);
				field1235.method229(39);
				field1235.method229(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					field1235.method229(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field1235.method230(57856);
				}

				field1235.method230((int) (Math.random() * 65536.0D));
				field1235.method238(field1235.field623 - var3);
			}
		}

		int var4;
		if (field1388) {
			var4 = method518();
		} else {
			var4 = method517();
		}

		int var5 = field1121;
		int var6 = field1122;
		int var7 = field1123;
		int var8 = field1124;
		int var9 = field1125;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field1187[var10]) {
				int var11 = (int) (Math.random() * (field1372[var10] * 2 + 1) + Math.sin(field1307[var10] / 100.0D * field1390[var10]) * field1430[var10] - field1372[var10]);
				if (var10 == 0) {
					field1121 += var11;
				}

				if (var10 == 1) {
					field1122 += var11;
				}

				if (var10 == 2) {
					field1123 += var11;
				}

				if (var10 == 3) {
					field1125 = field1125 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field1124 += var11;
					if (field1124 < 128) {
						field1124 = 128;
					}

					if (field1124 > 383) {
						field1124 = 383;
					}
				}
			}
		}

		int var12 = class35.field593;
		class32.field545 = true;
		class32.field548 = 0;
		class32.field546 = field17 - 4;
		class32.field547 = field18 - 4;
		class34.method168();
		field1257.method103(field1121, var4, field1122, field1125, field1123, field1124);
		field1257.method78();
		method550();
		method561();
		method444(var12);
		method438();
		field1375.method269(4, field9, 4);
		field1121 = var5;
		field1122 = var6;
		field1123 = var7;
		field1124 = var8;
		field1125 = var9;
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method446(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field1283[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.f(Z)Z")
	public final boolean method447() {
		if (field1146 == null) {
			return false;
		}

		try {
			int var1 = field1146.method40();
			if (var1 == 0) {
				return false;
			}

			if (field1040 == -1) {
				field1146.method41(field1444.field622, 0, 1);
				field1040 = field1444.field622[0] & 0xFF;
				if (field1112 != null) {
					field1040 = field1040 - field1112.method305() & 0xFF;
				}

				field1039 = class61.field938[field1040];
				var1--;
			}

			if (field1039 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field1146.method41(field1444.field622, 0, 1);
				field1039 = field1444.field622[0] & 0xFF;
				var1--;
			}

			if (field1039 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field1146.method41(field1444.field622, 0, 2);
				field1444.field623 = 0;
				field1039 = field1444.method241();
				var1 -= 2;
			}

			if (var1 < field1039) {
				return false;
			}

			field1444.field623 = 0;
			field1146.method41(field1444.field622, 0, field1039);
			field1041 = 0;
			field1435 = field1434;
			field1434 = field1433;
			field1433 = field1040;

			if (field1040 == 75) {
				if (field1440 != -1) {
					field1440 = -1;
					field1057 = true;
					field1338 = true;
				}

				if (field1130 != -1) {
					field1130 = -1;
					field1224 = true;
				}

				if (field1095) {
					field1095 = false;
					field1224 = true;
				}

				field1274 = -1;
				field1392 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 211) {
				int var2 = field1444.method241();
				int var3 = field1444.method241();
				int var4 = field1444.method241();
				class60 var5 = class60.method350(var3);
				class4.field56[var2].field105 = 4;
				class4.field56[var2].field106 = var3;
				class4.field56[var2].field112 = var5.field903;
				class4.field56[var2].field113 = var5.field904;
				class4.field56[var2].field111 = var5.field902 * 100 / var4;
				field1040 = -1;
				return true;
			}

			if (field1040 == 170) {
				int var6 = field1444.method241();
				int var7 = field1444.method241();
				int var8 = var7 >> 10 & 0x1F;
				int var9 = var7 >> 5 & 0x1F;
				int var10 = var7 & 0x1F;
				class4.field56[var6].field99 = (var10 << 3) + (var8 << 19) + (var9 << 11);
				field1040 = -1;
				return true;
			}

			if (field1040 == 253) {
				int var11 = field1444.method242();
				field1286 = var11;
				field1224 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 214) {
				field1267 = field1444.method239();
				if (field1267 == 1) {
					field1220 = field1444.method241();
				}

				if (field1267 >= 2 && field1267 <= 6) {
					if (field1267 == 2) {
						field1191 = 64;
						field1192 = 64;
					}

					if (field1267 == 3) {
						field1191 = 0;
						field1192 = 64;
					}

					if (field1267 == 4) {
						field1191 = 128;
						field1192 = 64;
					}

					if (field1267 == 5) {
						field1191 = 64;
						field1192 = 0;
					}

					if (field1267 == 6) {
						field1191 = 64;
						field1192 = 128;
					}

					field1267 = 2;
					field1188 = field1444.method241();
					field1189 = field1444.method241();
					field1190 = field1444.method239();
				}

				if (field1267 == 10) {
					field1242 = field1444.method241();
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 196) {
				field1239 = field1444.method239();
				field1240 = field1444.method239();

				while (field1444.field623 < field1039) {
					int var12 = field1444.method239();
					method508(var12, field1444);
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 220) {
				field1379 = field1039 / 8;
				for (int var13 = 0; var13 < field1379; var13++) {
					field1234[var13] = field1444.method245();
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 149) {
				int var14 = field1444.method241();
				int var15 = field1444.method241();
				class4 var16 = class4.field56[var14];
				if (var16 != null && var16.field63 == 0) {
					if (var15 < 0) {
						var15 = 0;
					}

					if (var15 > var16.field75 - var16.field67) {
						var15 = var16.field75 - var16.field67;
					}

					var16.field76 = var15;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 147) {
				field1348 = field1444.method239();
				field1040 = -1;
				return true;
			}

			if (field1040 == 217) {
				field1044 = field1444.method239();
				field1057 = true;
				field1338 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 228) {
				long var17 = field1444.method245();
				int var19 = field1444.method244();
				int var20 = field1444.method239();
				boolean var21 = false;
				for (int var22 = 0; var22 < 100; var22++) {
					if (field1309[var22] == var19) {
						var21 = true;
						break;
					}
				}

				if (var20 <= 1) {
					for (int var23 = 0; var23 < field1379; var23++) {
						if (field1234[var23] == var17) {
							var21 = true;
							break;
						}
					}
				}

				if (!var21 && field1106 == 0) {
					try {
						field1309[field1387] = var19;
						field1387 = (field1387 + 1) % 100;
						String var24 = class53.method317(field1444, field1039 - 13);
						var24 = class71.method403(var24);
						if (var20 == 2 || var20 == 3) {
							method454(7, var24, "@cr2@" + class52.method314(class52.method311(var17)));
						} else if (var20 == 1) {
							method454(7, var24, "@cr1@" + class52.method314(class52.method311(var17)));
						} else {
							method454(3, var24, class52.method314(class52.method311(var17)));
						}
					} catch (Exception var154) {
						signlink.reporterror("cde1");
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 251) {
				method491(field1444, field1039);
				field1040 = -1;
				return true;
			}

			if (field1040 == 233) {
				field1388 = false;

				for (int var26 = 0; var26 < 5; var26++) {
					field1187[var26] = false;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 20) {
				field1276 = false;
				field1095 = true;
				field1361 = "";
				field1224 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 157) {
				int var27 = field1444.method239();
				int var28 = field1444.method239();
				int var29 = field1444.method239();
				int var30 = field1444.method239();
				field1187[var27] = true;
				field1372[var27] = var28;
				field1430[var27] = var29;
				field1307[var27] = var30;
				field1390[var27] = 0;
				field1040 = -1;
				return true;
			}

			if (field1040 == 1) {
				int var31 = field1444.method242();
				if (var31 >= 0) {
					method535(var31);
				}

				field1229 = var31;
				field1040 = -1;
				return true;
			}

			if (field1040 == 26) {
				int var32 = field1444.method241();
				class4.field56[var32].field105 = 3;
				class4.field56[var32].field106 = (field1377.field427[8] << 6) + (field1377.field427[0] << 12) + (field1377.field428[0] << 24) + (field1377.field428[4] << 18) + field1377.field427[11];
				field1040 = -1;
				return true;
			}

			if (field1040 == 23) {
				field1239 = field1444.method239();
				field1240 = field1444.method239();
				for (int var33 = field1239; var33 < field1239 + 8; var33++) {
					for (int var34 = field1240; var34 < field1240 + 8; var34++) {
						if (field1265[field1080][var33][var34] != null) {
							field1265[field1080][var33][var34] = null;
							method527(var33, var34);
						}
					}
				}

				for (class41 var35 = (class41) field1109.method258(); var35 != null; var35 = (class41) field1109.method260()) {
					if (var35.field642 >= field1239 && var35.field642 < field1239 + 8 && var35.field643 >= field1240 && var35.field643 < field1240 + 8 && field1080 == var35.field640) {
						var35.field651 = 0;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 9) {
				long var36 = field1444.method245();
				int var38 = field1444.method239();
				String var39 = class52.method314(class52.method311(var36));
				for (int var40 = 0; var40 < field1409; var40++) {
					if (field1294[var40] == var36) {
						if (field1264[var40] != var38) {
							field1264[var40] = var38;
							field1057 = true;

							if (var38 > 0) {
								method454(5, var39 + " has logged in.", "");
							}

							if (var38 == 0) {
								method454(5, var39 + " has logged out.", "");
							}
						}

						var39 = null;
						break;
					}
				}

				if (var39 != null && field1409 < 200) {
					field1294[field1409] = var36;
					field1311[field1409] = var39;
					field1264[field1409] = var38;
					field1409++;
					field1057 = true;
				}

				boolean var41 = false;
				while (!var41) {
					var41 = true;
					for (int var42 = 0; var42 < field1409 - 1; var42++) {
						if (field1264[var42] != field1173 && field1264[var42 + 1] == field1173 || field1264[var42] == 0 && field1264[var42 + 1] != 0) {
							int var43 = field1264[var42];
							field1264[var42] = field1264[var42 + 1];
							field1264[var42 + 1] = var43;
							String var44 = field1311[var42];
							field1311[var42] = field1311[var42 + 1];
							field1311[var42 + 1] = var44;
							long var45 = field1294[var42];
							field1294[var42] = field1294[var42 + 1];
							field1294[var42 + 1] = var45;
							field1057 = true;
							var41 = false;
						}
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 120) {
				int var47 = field1444.method241();
				String var48 = field1444.method246();
				class4.field56[var47].field97 = var48;

				if (field1398[field1044] == class4.field56[var47].field62) {
					field1057 = true;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 124) {
				class39 var49 = class6.method47();
				if (var49 != null) {
					field1235.method228(253);
					field1235.method230(var49.field623);
					field1235.method237(var49.field622, 0, var49.field623);
					var49.method227();
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 200) {
				field1431 = field1444.method239();
				if (field1431 == field1044) {
					if (field1431 == 3) {
						field1044 = 1;
					} else {
						field1044 = 3;
					}

					field1057 = true;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 80) {
				int var50 = field1444.method241();
				class4 var51 = class4.field56[var50];
				for (int var52 = 0; var52 < var51.field57.length; var52++) {
					var51.field57[var52] = -1;
					var51.field57[var52] = 0;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 143) {
				int var53 = field1444.method241();
				int var54 = field1444.method239();

				if (var53 == 0xFFFF) {
					var53 = -1;
				}

				field1398[var54] = var53;
				field1057 = true;
				field1338 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 156) {
				int var55 = field1444.method241();
				int var56 = field1444.method241();

				if (field1130 != -1) {
					field1130 = -1;
					field1224 = true;
				}

				if (field1095) {
					field1095 = false;
					field1224 = true;
				}

				field1274 = var55;
				field1440 = var56;
				field1057 = true;
				field1338 = true;
				field1392 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 48) {
				int var57 = field1444.method241();
				if (var57 == 0xFFFF) {
					var57 = -1;
				}

				if (field1316 != var57 && field1352 && !field1176 && field1273 == 0) {
					field1203 = var57;
					field1204 = true;
					field1207.method289(2, field1203);
				}

				field1316 = var57;
				field1040 = -1;
				return true;
			}

			if (field1040 == 131) {
				int var58 = field1444.method241();
				int var59 = field1444.method241();
				if (field1352 && !field1176) {
					field1203 = var58;
					field1204 = false;
					field1207.method289(2, field1203);
					field1273 = var59;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 237) {
				field1246 = 255;
				field1040 = -1;
				return true;
			}

			if (field1040 == 103) {
				field1111 = field1444.method241() * 30;
				field1040 = -1;
				return true;
			}

			if (field1040 == 248) {
				field1069 = 0;
				field1040 = -1;
				return true;
			}

			if (field1040 == 106 || field1040 == 125 || field1040 == 31 || field1040 == 82 || field1040 == 146 || field1040 == 174 || field1040 == 38 || field1040 == 117 || field1040 == 112 || field1040 == 84) {
				method508(field1040, field1444);
				field1040 = -1;
				return true;
			}

			if (field1040 == 66) {
				int var60 = field1444.method241();
				byte var61 = field1444.method240();
				field1416[var60] = var61;

				if (field1066[var60] != var61) {
					field1066[var60] = var61;
					method541(var60);
					field1057 = true;

					if (field1286 != -1) {
						field1224 = true;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 145) {
				field1057 = true;
				int var62 = field1444.method241();
				class4 var63 = class4.field56[var62];
				int var64 = field1444.method239();
				for (int var65 = 0; var65 < var64; var65++) {
					var63.field57[var65] = field1444.method241();
					int var66 = field1444.method239();
					if (var66 == 255) {
						var66 = field1444.method244();
					}

					var63.field58[var65] = var66;
				}

				for (int var67 = var64; var67 < var63.field57.length; var67++) {
					var63.field57[var67] = 0;
					var63.field58[var67] = 0;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 183) {
				int var68 = field1444.method241();
				method535(var68);

				if (field1440 != -1) {
					field1440 = -1;
					field1057 = true;
					field1338 = true;
				}

				field1130 = var68;
				field1224 = true;
				field1274 = -1;
				field1392 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 11) {
				int var69 = field1444.method241();
				int var70 = field1444.method241();
				class4.field56[var69].field105 = 1;
				class4.field56[var69].field106 = var70;
				field1040 = -1;
				return true;
			}

			if (field1040 == 19) {
				class6.method44();
				field1040 = -1;
				return true;
			}

			if (field1040 == 154) {
				field1410 = field1444.method239();
				field1057 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 101) {
				if (field1044 == 12) {
					field1057 = true;
				}

				field1215 = field1444.method242();
				field1040 = -1;
				return true;
			}

			if (field1040 == 70) {
				int var71 = field1444.method241();
				int var72 = field1444.method244();
				field1416[var71] = var72;

				if (field1066[var71] != var72) {
					field1066[var71] = var72;
					method541(var71);
					field1057 = true;

					if (field1286 != -1) {
						field1224 = true;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 44) {
				int var73 = field1444.method241();
				int var74 = field1444.method241();
				class4.field56[var73].field105 = 2;
				class4.field56[var73].field106 = var74;
				field1040 = -1;
				return true;
			}

			if (field1040 == 108) {
				field1094 = field1444.method241();
				field1065 = field1444.method239();
				field1040 = -1;
				return true;
			}

			if (field1040 == 29) {
				method469();
				field1040 = -1;
				return false;
			}

			if (field1040 == 74) {
				int var75 = field1444.method241();
				int var76 = field1444.method241();
				if (field1393 == var75 && field1394 == var76 && field1105 == 2) {
					field1040 = -1;
					return true;
				}

				field1393 = var75;
				field1394 = var76;
				field1302 = (field1393 - 6) * 8;
				field1303 = (field1394 - 6) * 8;
				field1213 = false;
				if ((field1393 / 8 == 48 || field1393 / 8 == 49) && field1394 / 8 == 48) {
					field1213 = true;
				}

				if (field1393 / 8 == 48 && field1394 / 8 == 148) {
					field1213 = true;
				}

				field1105 = 1;
				field1072 = System.currentTimeMillis();
				field1375.method268();
				field1320.method214(0, "Loading - please wait.", 151, 257);
				field1320.method214(0xFFFFFF, "Loading - please wait.", 150, 256);
				field1375.method269(4, field9, 4);
				int var77 = 0;
				for (int var78 = (field1393 - 6) / 8; var78 <= (field1393 + 6) / 8; var78++) {
					for (int var79 = (field1394 - 6) / 8; var79 <= (field1394 + 6) / 8; var79++) {
						var77++;
					}
				}

				field1425 = new byte[var77][];
				field1279 = new byte[var77][];
				field1260 = new int[var77];
				field1261 = new int[var77];
				field1262 = new int[var77];
				int var80 = 0;
				for (int var81 = (field1393 - 6) / 8; var81 <= (field1393 + 6) / 8; var81++) {
					for (int var82 = (field1394 - 6) / 8; var82 <= (field1394 + 6) / 8; var82++) {
						field1260[var80] = (var81 << 8) + var82;

						if (field1213 && (var82 == 49 || var82 == 149 || var82 == 147 || var81 == 50 || var81 == 49 && var82 == 47)) {
							field1261[var80] = -1;
							field1262[var80] = -1;
							var80++;
						} else {
							int var83 = field1261[var80] = field1207.method284(var81, var82, 0);
							if (var83 != -1) {
								field1207.method289(3, var83);
							}

							int var84 = field1262[var80] = field1207.method284(var81, var82, 1);
							if (var84 != -1) {
								field1207.method289(3, var84);
							}

							var80++;
						}
					}
				}

				int var85 = field1302 - field1304;
				int var86 = field1303 - field1305;
				field1304 = field1302;
				field1305 = field1303;

				for (int var87 = 0; var87 < 16384; var87++) {
					class27 var88 = field1287[var87];
					if (var88 != null) {
						for (int var89 = 0; var89 < 10; var89++) {
							var88.field417[var89] -= var85;
							var88.field418[var89] -= var86;
						}

						var88.field368 -= var85 * 128;
						var88.field369 -= var86 * 128;
					}
				}

				for (int var90 = 0; var90 < field1160; var90++) {
					class28 var91 = field1162[var90];
					if (var91 != null) {
						for (int var92 = 0; var92 < 10; var92++) {
							var91.field417[var92] -= var85;
							var91.field418[var92] -= var86;
						}

						var91.field368 -= var85 * 128;
						var91.field369 -= var86 * 128;
					}
				}

				field1092 = true;
				byte var93 = 0;
				byte var94 = 104;
				byte var95 = 1;
				if (var85 < 0) {
					var93 = 103;
					var94 = -1;
					var95 = -1;
				}

				byte var96 = 0;
				byte var97 = 104;
				byte var98 = 1;
				if (var86 < 0) {
					var96 = 103;
					var97 = -1;
					var98 = -1;
				}

				for (int var99 = var93; var99 != var94; var99 += var95) {
					for (int var100 = var96; var100 != var97; var100 += var98) {
						int var101 = var85 + var99;
						int var102 = var86 + var100;
						for (int var103 = 0; var103 < 4; var103++) {
							if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
								field1265[var103][var99][var100] = field1265[var103][var101][var102];
							} else {
								field1265[var103][var99][var100] = null;
							}
						}
					}
				}

				for (class41 var104 = (class41) field1109.method258(); var104 != null; var104 = (class41) field1109.method260()) {
					var104.field642 -= var85;
					var104.field643 -= var86;
					if (var104.field642 < 0 || var104.field643 < 0 || var104.field642 >= 104 || var104.field643 >= 104) {
						var104.method120();
					}
				}

				if (field1069 != 0) {
					field1069 -= var85;
					field1070 -= var86;
				}

				field1388 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 223) {
				int var105 = field1444.method241();
				int var106 = field1444.method242();
				int var107 = field1444.method242();
				class4 var108 = class4.field56[var105];
				var108.field69 = var106;
				var108.field70 = var107;
				field1040 = -1;
				return true;
			}

			if (field1040 == 144) {
				field1241 = field1444.method239();
				field1292 = field1444.method239();
				field1378 = field1444.method239();
				field1420 = true;
				field1224 = true;
				field1040 = -1;
				return true;
			}

			if (field1040 == 114) {
				field1057 = true;
				int var109 = field1444.method241();
				class4 var110 = class4.field56[var109];
				while (field1444.field623 < field1039) {
					int var111 = field1444.method239();
					int var112 = field1444.method241();
					int var113 = field1444.method239();
					if (var113 == 255) {
						var113 = field1444.method244();
					}

					if (var111 >= 0 && var111 < var110.field57.length) {
						var110.field57[var111] = var112;
						var110.field58[var111] = var113;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 90) {
				for (int var114 = 0; var114 < field1066.length; var114++) {
					if (field1416[var114] != field1066[var114]) {
						field1066[var114] = field1416[var114];
						method541(var114);
						field1057 = true;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 199) {
				int var115 = field1444.method241();
				int var116 = field1444.method239();
				int var117 = field1444.method241();
				if (field1198 && !field1176 && field1169 < 50) {
					field1371[field1169] = var115;
					field1194[field1169] = var116;
					field1082[field1169] = class55.field782[var115] + var117;
					field1169++;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 192) {
				field1388 = true;
				field1047 = field1444.method239();
				field1048 = field1444.method239();
				field1049 = field1444.method241();
				field1050 = field1444.method239();
				field1051 = field1444.method239();
				if (field1051 >= 100) {
					int var118 = field1047 * 128 + 64;
					int var119 = field1048 * 128 + 64;
					int var120 = method501(field1080, var118, var119) - field1049;
					int var121 = var118 - field1121;
					int var122 = var120 - field1122;
					int var123 = var119 - field1123;
					int var124 = (int) Math.sqrt(var121 * var121 + var123 * var123);
					field1124 = (int) (Math.atan2(var122, var124) * 325.949D) & 0x7FF;
					field1125 = (int) (Math.atan2(var121, var123) * -325.949D) & 0x7FF;

					if (field1124 < 128) {
						field1124 = 128;
					}

					if (field1124 > 383) {
						field1124 = 383;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 213) {
				int var125 = field1444.method241();
				int var126 = field1444.method242();
				class4 var127 = class4.field56[var125];
				var127.field109 = var126;

				if (var126 == -1) {
					var127.field59 = 0;
					var127.field60 = 0;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 55) {
				field1239 = field1444.method239();
				field1240 = field1444.method239();
				field1040 = -1;
				return true;
			}

			if (field1040 == 0) {
				String var128 = field1444.method246();
				if (var128.endsWith(":tradereq:")) {
					String var129 = var128.substring(0, var128.indexOf(":"));
					long var130 = class52.method310(var129);
					boolean var132 = false;
					for (int var133 = 0; var133 < field1379; var133++) {
						if (field1234[var133] == var130) {
							var132 = true;
							break;
						}
					}

					if (!var132 && field1106 == 0) {
						method454(4, "wishes to trade with you.", var129);
					}
				} else if (var128.endsWith(":duelreq:")) {
					String var134 = var128.substring(0, var128.indexOf(":"));
					long var135 = class52.method310(var134);
					boolean var137 = false;
					for (int var138 = 0; var138 < field1379; var138++) {
						if (field1234[var138] == var135) {
							var137 = true;
							break;
						}
					}

					if (!var137 && field1106 == 0) {
						method454(8, "wishes to duel with you.", var134);
					}
				} else {
					method454(0, var128, "");
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 100) {
				field1388 = true;
				field1380 = field1444.method239();
				field1381 = field1444.method239();
				field1382 = field1444.method241();
				field1383 = field1444.method239();
				field1384 = field1444.method239();
				if (field1384 >= 100) {
					field1121 = field1380 * 128 + 64;
					field1123 = field1381 * 128 + 64;
					field1122 = method501(field1080, field1121, field1123) - field1382;
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 25) {
				int var139 = field1444.method241();
				boolean var140 = field1444.method239() == 1;
				class4.field56[var139].field77 = var140;
				field1040 = -1;
				return true;
			}

			if (field1040 == 209) {
				int var141 = field1444.method241();
				method535(var141);

				if (field1440 != -1) {
					field1440 = -1;
					field1057 = true;
					field1338 = true;
				}

				if (field1130 != -1) {
					field1130 = -1;
					field1224 = true;
				}

				if (field1095) {
					field1095 = false;
					field1224 = true;
				}

				field1274 = var141;
				field1392 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 126) {
				for (int var142 = 0; var142 < field1162.length; var142++) {
					if (field1162[var142] != null) {
						field1162[var142].field396 = -1;
					}
				}

				for (int var143 = 0; var143 < field1287.length; var143++) {
					if (field1287[var143] != null) {
						field1287[var143].field396 = -1;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 42) {
				if (field1044 == 12) {
					field1057 = true;
				}

				field1077 = field1444.method239();
				field1040 = -1;
				return true;
			}

			if (field1040 == 104) {
				method500(field1039, field1444);
				field1092 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 56) {
				field1057 = true;
				int var144 = field1444.method239();
				int var145 = field1444.method244();
				int var146 = field1444.method239();
				field1299[var144] = var145;
				field1098[var144] = var146;
				field1052[var144] = 1;
				for (int var147 = 0; var147 < 98; var147++) {
					if (var145 >= field1345[var147]) {
						field1052[var144] = var147 + 2;
					}
				}

				field1040 = -1;
				return true;
			}

			if (field1040 == 134) {
				int var148 = field1444.method241();
				method535(var148);

				if (field1130 != -1) {
					field1130 = -1;
					field1224 = true;
				}

				if (field1095) {
					field1095 = false;
					field1224 = true;
				}

				field1440 = var148;
				field1057 = true;
				field1338 = true;
				field1274 = -1;
				field1392 = false;
				field1040 = -1;
				return true;
			}

			if (field1040 == 105) {
				field1255 = field1444.method244();
				field1116 = field1444.method241();
				field1408 = field1444.method239();
				field1081 = field1444.method241();
				field1258 = field1444.method239();
				if (field1255 != 0 && field1274 == -1) {
					signlink.dnslookup(class52.method313(field1255));
					method439();
					short var149 = 650;
					if (field1408 != 201 || field1258 == 1) {
						var149 = 655;
					}

					field1432 = "";
					field1104 = false;

					for (int var150 = 0; var150 < class4.field56.length; var150++) {
						if (class4.field56[var150] != null && class4.field56[var150].field65 == var149) {
							field1274 = class4.field56[var150].field62;
							break;
						}
					}
				}

				field1040 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field1040 + "," + field1039 + " - " + field1434 + "," + field1435);
			method469();
		} catch (IOException var155) {
			method556();
		} catch (Exception var156) {
			String var152 = "T2 - " + field1040 + "," + field1434 + "," + field1435 + " - " + field1039 + "," + (field1377.field417[0] + field1302) + "," + (field1377.field418[0] + field1303) + " - ";
			for (int var153 = 0; var153 < field1039 && var153 < 50; var153++) {
				var152 = var152 + field1444.field622[var153] + ",";
			}

			signlink.reporterror(var152);
			method469();
		}

		return true;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method448() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field1172) {
			field1061 = false;
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

		if (field1426) {
			field1061 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field1389) {
			field1061 = false;
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

	@ObfuscatedName("client.i(I)V")
	public final void method449() {
		int var1 = field1367;
		int var2 = field1368;
		int var3 = field1369;
		int var4 = field1370;
		int var5 = 0x5D5447;
		class34.method170(var2, var1, var5, var3, var4);
		class34.method170(var2 + 1, var1 + 1, 0, var3 - 2, 16);
		class34.method171(0, var2 + 18, var3 - 2, var4 - 19, var1 + 1);
		field1321.method217(var1 + 3, "Choose Option", var2 + 14, var5);
		int var6 = field17;
		int var7 = field18;
		if (field1366 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field1366 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field1366 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field1147; var8++) {
			int var9 = (field1147 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field1321.method219(field1182[var8], var9, var1 + 3, var10, true);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method450(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.f(B)V")
	public static final void method451() {
		class19.field266 = false;
		class35.field573 = false;
		field1176 = false;
		class3.field32 = false;
	}

	@ObfuscatedName("client.j(I)Z")
	public final boolean method452() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IBIZIIIIIIII)Z")
	public final boolean method453(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field1117[var14][var15] = 0;
				field1263[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg7;
		field1117[arg6][arg7] = 99;
		field1263[arg6][arg7] = 0;
		byte var18 = 0;
		int var19 = 0;
		field1363[var18] = arg6;
		int var35 = var18 + 1;
		field1364[var18] = arg7;
		boolean var20 = false;
		int var21 = field1363.length;
		int[][] var22 = field1067[field1080].field943;
		while (var35 != var19) {
			var16 = field1363[var19];
			var17 = field1364[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field1067[field1080].method370(arg3 - 1, arg0, arg8, var17, arg10, var16)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field1067[field1080].method371(arg0, arg3 - 1, var17, arg10, var16, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg1 != 0 && field1067[field1080].method372(arg1, arg0, arg5, arg8, var17, arg4, var16)) {
				var20 = true;
				break;
			}

			int var23 = field1263[var16][var17] + 1;
			if (var16 > 0 && field1117[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field1363[var35] = var16 - 1;
				field1364[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17] = 2;
				field1263[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field1117[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field1363[var35] = var16 + 1;
				field1364[var35] = var17;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17] = 8;
				field1263[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field1117[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1363[var35] = var16;
				field1364[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16][var17 - 1] = 1;
				field1263[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field1117[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1363[var35] = var16;
				field1364[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16][var17 + 1] = 4;
				field1263[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field1117[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1363[var35] = var16 - 1;
				field1364[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17 - 1] = 3;
				field1263[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field1117[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field1363[var35] = var16 + 1;
				field1364[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17 - 1] = 9;
				field1263[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field1117[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1363[var35] = var16 - 1;
				field1364[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 - 1][var17 + 1] = 6;
				field1263[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field1117[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field1363[var35] = var16 + 1;
				field1364[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field1117[var16 + 1][var17 + 1] = 12;
				field1263[var16 + 1][var17 + 1] = var23;
			}
		}

		field1118 = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field1263[var26][var27] < var24) {
								var24 = field1263[var26][var27];
								var16 = var26;
								var17 = var27;
								field1118 = 1;
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
		field1363[var28] = var16;
		int var36 = var28 + 1;
		field1364[var28] = var17;
		int var29;
		int var30 = var29 = field1117[var16][var17];
		while (arg6 != var16 || arg7 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field1363[var36] = var16;
				field1364[var36++] = var17;
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
		int var32 = field1363[var36];
		int var33 = field1364[var36];

		if (arg9 == 0) {
			field1235.method228(215);
			field1235.method229(var31 + var31 + 3);
		}

		if (arg9 == 1) {
			field1235.method228(84);
			field1235.method229(var31 + var31 + 3 + 14);
		}

		if (arg9 == 2) {
			field1235.method228(252);
			field1235.method229(var31 + var31 + 3);
		}

		if (field27[5] == 1) {
			field1235.method229(1);
		} else {
			field1235.method229(0);
		}

		field1235.method230(field1302 + var32);
		field1235.method230(field1303 + var33);
		field1069 = field1363[0];
		field1070 = field1364[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field1235.method229(field1363[var36] - var32);
			field1235.method229(field1364[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method454(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field1286 != -1) {
			field1244 = arg1;
			field23 = 0;
		}

		if (field1130 == -1) {
			field1224 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field1427[var4] = field1427[var4 - 1];
			field1428[var4] = field1428[var4 - 1];
			field1429[var4] = field1429[var4 - 1];
		}

		field1427[0] = arg0;
		field1428[0] = arg2;
		field1429[0] = arg1;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method455() {
		for (class31 var1 = (class31) field1196.method258(); var1 != null; var1 = (class31) field1196.method260()) {
			if (field1080 != var1.field458 || field1060 > var1.field464) {
				var1.method120();
			} else if (field1060 >= var1.field463) {
				if (var1.field467 > 0) {
					class27 var2 = field1287[var1.field467 - 1];
					if (var2 != null && var2.field368 >= 0 && var2.field368 < 13312 && var2.field369 >= 0 && var2.field369 < 13312) {
						var1.method133(field1060, var2.field368, var2.field369, method501(var1.field458, var2.field368, var2.field369) - var1.field462);
					}
				}

				if (var1.field467 < 0) {
					int var3 = -var1.field467 - 1;
					class28 var4;
					if (field1094 == var3) {
						var4 = field1377;
					} else {
						var4 = field1162[var3];
					}

					if (var4 != null && var4.field368 >= 0 && var4.field368 < 13312 && var4.field369 >= 0 && var4.field369 < 13312) {
						var1.method133(field1060, var4.field368, var4.field369, method501(var1.field458, var4.field368, var4.field369) - var1.field462);
					}
				}

				var1.method134(field1315);
				field1257.method75(var1, (int) var1.field471, field1080, -1, (int) var1.field469, 60, (int) var1.field470, var1.field477, false);
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method456() {
		field1231 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field1362[var1] = -1;
			for (int var2 = 0; var2 < class64.field957; var2++) {
				if (!class64.field958[var2].field964 && class64.field958[var2].field959 == var1 + (field1424 ? 0 : 7)) {
					field1362[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method457(long arg0) {
		if (arg0 != 0L) {
			if (field1409 >= 100 && field1065 != 1) {
				method454(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field1409 >= 200) {
				method454(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1409; var4++) {
					if (field1294[var4] == arg0) {
						method454(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1379; var5++) {
					if (field1234[var5] == arg0) {
						method454(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field1377.field423)) {
					field1311[field1409] = var3;
					field1294[field1409] = arg0;
					field1264[field1409] = 0;
					field1409++;
					field1057 = true;
					field1235.method228(218);
					field1235.method235(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method458() {
		if (field1323 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1323 = 3;
				field1346 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field1225 = "";
				field1226 = "Enter your username & password.";
				field1323 = 2;
				field1346 = 0;
			}
		} else if (field1323 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1346 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field1346 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				method509(field1088, field1089, false);

				if (field1301) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field1323 = 0;
				field1088 = "";
				field1089 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field1317.length(); var10++) {
					if (var8 == field1317.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field1346 == 0) {
					if (var8 == 8 && field1088.length() > 0) {
						field1088 = field1088.substring(0, field1088.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1346 = 1;
					}

					if (var9) {
						field1088 = field1088 + (char) var8;
					}

					if (field1088.length() > 12) {
						field1088 = field1088.substring(0, 12);
					}
				} else if (field1346 == 1) {
					if (var8 == 8 && field1089.length() > 0) {
						field1089 = field1089.substring(0, field1089.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field1346 = 0;
					}

					if (var9) {
						field1089 = field1089 + (char) var8;
					}

					if (field1089.length() > 20) {
						field1089 = field1089.substring(0, 20);
					}
				}
			}
		} else if (field1323 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field1323 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method459(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field1209) {
			field1389 = true;
		} else {
			field1209 = true;
			boolean var1 = false;
			String var2 = method554();
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

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field1212[var3] = new class49(500000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					int var4 = 5;
					field1347[8] = 0;
					while (field1347[8] == 0) {
						method13("Connecting to web server", 20);

						try {
							DataInputStream var5 = method450("crc" + (int) (Math.random() * 9.9999999E7D));
							class39 var6 = new class39(new byte[36]);
							var5.readFully(var6.field622, 0, 36);

							for (int var7 = 0; var7 < 9; var7++) {
								field1347[var7] = var6.method244();
							}

							var5.close();
						} catch (IOException var80) {
							for (int var8 = var4; var8 > 0; var8--) {
								method13("Error loading - Will retry in " + var8 + " secs.", 10);

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

					field1406 = method466(1, field1347[1], "title", 25, "title screen");
					field1319 = new class38(field1406, "p11");
					field1320 = new class38(field1406, "p12");
					field1321 = new class38(field1406, "b12");
					field1322 = new class38(field1406, "q8");
					method530();
					method560();
					class51 var9 = method466(2, field1347[2], "config", 30, "config");
					class51 var10 = method466(3, field1347[3], "interface", 35, "interface");
					class51 var11 = method466(4, field1347[4], "media", 40, "2d graphics");
					class51 var12 = method466(6, field1347[6], "textures", 45, "textures");
					class51 var13 = method466(7, field1347[7], "wordenc", 50, "chat system");
					class51 var14 = method466(8, field1347[8], "sounds", 55, "sound effects");
					field1211 = new byte[4][104][104];
					field1168 = new int[4][105][105];
					field1257 = new class19(104, field1168, 4, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						field1067[var15] = new class62(104, 104);
					}

					field1071 = new class36(512, 512);
					class51 var16 = method466(5, field1347[5], "versionlist", 60, "update list");
					method13("Connecting to update server", 60);
					field1207 = new class48();
					field1207.method280(var16, this);
					class8.method58(field1207.method283());
					class32.method136(field1207.method282(0), field1207);

					if (!field1176) {
						field1203 = 0;
						field1204 = false;
						field1207.method289(2, field1203);

						while (field1207.method290() > 0) {
							method521();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}
						}
					}

					method13("Requesting animations", 65);
					int var17 = field1207.method282(1);
					for (int var18 = 0; var18 < var17; var18++) {
						field1207.method289(1, var18);
					}

					while (field1207.method290() > 0) {
						int var19 = var17 - field1207.method290();
						if (var19 > 0) {
							method13("Loading animations - " + var19 * 100 / var17 + "%", 65);
						}

						method521();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}
					}

					method13("Requesting models", 70);
					int var20 = field1207.method282(0);
					for (int var21 = 0; var21 < var20; var21++) {
						int var22 = field1207.method287(var21);
						if ((var22 & 0x1) != 0) {
							field1207.method289(0, var21);
						}
					}

					int var23 = field1207.method290();
					while (field1207.method290() > 0) {
						int var24 = var23 - field1207.method290();
						if (var24 > 0) {
							method13("Loading models - " + var24 * 100 / var23 + "%", 70);
						}

						method521();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field1212[0] != null) {
						method13("Requesting maps", 75);
						field1207.method289(3, field1207.method284(47, 48, 0));
						field1207.method289(3, field1207.method284(47, 48, 1));
						field1207.method289(3, field1207.method284(48, 48, 0));
						field1207.method289(3, field1207.method284(48, 48, 1));
						field1207.method289(3, field1207.method284(49, 48, 0));
						field1207.method289(3, field1207.method284(49, 48, 1));
						field1207.method289(3, field1207.method284(47, 47, 0));
						field1207.method289(3, field1207.method284(47, 47, 1));
						field1207.method289(3, field1207.method284(48, 47, 0));
						field1207.method289(3, field1207.method284(48, 47, 1));
						field1207.method289(3, field1207.method284(48, 148, 0));
						field1207.method289(3, field1207.method284(48, 148, 1));
						int var25 = field1207.method290();
						while (field1207.method290() > 0) {
							int var26 = var25 - field1207.method290();
							if (var26 > 0) {
								method13("Loading maps - " + var26 * 100 / var25 + "%", 75);
							}

							method521();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var27 = field1207.method282(0);
					for (int var28 = 0; var28 < var27; var28++) {
						int var29 = field1207.method287(var28);
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
							field1207.method292(var30, var28, 0);
						}
					}

					field1207.method285(field1175);

					if (!field1176) {
						int var31 = field1207.method282(2);
						for (int var32 = 1; var32 < var31; var32++) {
							if (field1207.method288(var32)) {
								field1207.method292((byte) 1, var32, 2);
							}
						}
					}

					method13("Unpacking media", 80);
					field1441 = new class37(var11, "invback", 0);
					field1443 = new class37(var11, "chatback", 0);
					field1442 = new class37(var11, "mapback", 0);
					field1349 = new class37(var11, "backbase1", 0);
					field1350 = new class37(var11, "backbase2", 0);
					field1351 = new class37(var11, "backhmid1", 0);

					for (int var33 = 0; var33 < 13; var33++) {
						field1256[var33] = new class37(var11, "sideicons", var33);
					}

					field1214 = new class36(var11, "compass", 0);
					field1438 = new class36(var11, "mapedge", 0);
					field1438.method196();

					try {
						for (int var34 = 0; var34 < 50; var34++) {
							field1197[var34] = new class37(var11, "mapscene", var34);
						}
					} catch (Exception var79) {
					}

					try {
						for (int var35 = 0; var35 < 50; var35++) {
							field1397[var35] = new class36(var11, "mapfunction", var35);
						}
					} catch (Exception var78) {
					}

					try {
						for (int var36 = 0; var36 < 20; var36++) {
							field1183[var36] = new class36(var11, "hitmarks", var36);
						}
					} catch (Exception var77) {
					}

					try {
						for (int var37 = 0; var37 < 20; var37++) {
							field1090[var37] = new class36(var11, "headicons", var37);
						}
					} catch (Exception var76) {
					}

					field1295 = new class36(var11, "mapmarker", 0);
					field1296 = new class36(var11, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field1436[var38] = new class36(var11, "cross", var38);
					}

					field1216 = new class36(var11, "mapdots", 0);
					field1217 = new class36(var11, "mapdots", 1);
					field1218 = new class36(var11, "mapdots", 2);
					field1219 = new class36(var11, "mapdots", 3);
					field1297 = new class37(var11, "scrollbar", 0);
					field1298 = new class37(var11, "scrollbar", 1);
					field1177 = new class37(var11, "redstone1", 0);
					field1178 = new class37(var11, "redstone2", 0);
					field1179 = new class37(var11, "redstone3", 0);
					field1180 = new class37(var11, "redstone1", 0);
					field1180.method209();
					field1181 = new class37(var11, "redstone2", 0);
					field1181.method209();
					field1099 = new class37(var11, "redstone1", 0);
					field1099.method210();
					field1100 = new class37(var11, "redstone2", 0);
					field1100.method210();
					field1101 = new class37(var11, "redstone3", 0);
					field1101.method210();
					field1102 = new class37(var11, "redstone1", 0);
					field1102.method209();
					field1102.method210();
					field1103 = new class37(var11, "redstone2", 0);
					field1103.method209();
					field1103.method210();

					for (int var39 = 0; var39 < 2; var39++) {
						field1407[var39] = new class37(var11, "mod_icons", var39);
					}

					class36 var40 = new class36(var11, "backleft1", 0);
					field1149 = new class44(method11(), var40.field597, var40.field598);
					var40.method197(0, 0);
					class36 var41 = new class36(var11, "backleft2", 0);
					field1150 = new class44(method11(), var41.field597, var41.field598);
					var41.method197(0, 0);
					class36 var42 = new class36(var11, "backright1", 0);
					field1151 = new class44(method11(), var42.field597, var42.field598);
					var42.method197(0, 0);
					class36 var43 = new class36(var11, "backright2", 0);
					field1152 = new class44(method11(), var43.field597, var43.field598);
					var43.method197(0, 0);
					class36 var44 = new class36(var11, "backtop1", 0);
					field1153 = new class44(method11(), var44.field597, var44.field598);
					var44.method197(0, 0);
					class36 var45 = new class36(var11, "backvmid1", 0);
					field1154 = new class44(method11(), var45.field597, var45.field598);
					var45.method197(0, 0);
					class36 var46 = new class36(var11, "backvmid2", 0);
					field1155 = new class44(method11(), var46.field597, var46.field598);
					var46.method197(0, 0);
					class36 var47 = new class36(var11, "backvmid3", 0);
					field1156 = new class44(method11(), var47.field597, var47.field598);
					var47.method197(0, 0);
					class36 var48 = new class36(var11, "backhmid2", 0);
					field1157 = new class44(method11(), var48.field597, var48.field598);
					var48.method197(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 50; var53++) {
						if (field1397[var53] != null) {
							field1397[var53].method195(var50 + var52, var51 + var52, var49 + var52);
						}

						if (field1197[var53] != null) {
							field1197[var53].method211(var50 + var52, var51 + var52, var49 + var52);
						}
					}

					method13("Unpacking textures", 83);
					class35.method182(var12);
					class35.method186(0.8D);
					class35.method181(20);
					method13("Unpacking config", 86);
					class66.method383(var9);
					class57.method332(var9);
					class63.method373(var9);
					class60.method348(var9);
					class59.method342(var9);
					class64.method377(var9);
					class68.method386(var9);
					class70.method391(var9);
					class69.method389(var9);
					class60.field895 = field1175;

					if (!field1176) {
						method13("Unpacking sounds", 90);
						byte[] var54 = var14.method309("sounds.dat", null);
						class39 var55 = new class39(var54);
						class55.method322(var55);
					}

					method13("Unpacking interfaces", 95);
					class38[] var56 = new class38[] { field1319, field1320, field1321, field1322 };
					class4.method32(var56, var10, var11);
					method13("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field1442.field603[field1442.field605 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field1341[var57] = var58;
						field1300[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field1442.field603[field1442.field605 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field1243[var61 - 5] = var62 - 25;
						field1391[var61 - 5] = var63 - var62;
					}

					class35.method179(479, 96);
					field1083 = class35.field584;
					class35.method179(190, 261);
					field1084 = class35.field584;
					class35.method179(512, 334);
					field1085 = class35.field584;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = class35.field582[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					class19.method100(512, var65, 500, 334, 800);
					class71.method393(var13);
					field1404 = new class58(this);
				} catch (Exception var81) {
					signlink.reporterror("loaderror " + field1238 + " " + field1141);
					field1172 = true;
				}
			} else {
				field1426 = true;
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method460() {
		class57.field851.method117();
		class57.field852.method117();
		class59.field889.method117();
		class60.field935.method117();
		class60.field936.method117();
		class28.field444.method117();
		class68.field1009.method117();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method461() {
		if (field1227 != 0) {
			int var1 = 0;
			if (field1111 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field1429[var2] != null) {
					int var3 = field1427[var2];
					String var4 = field1428[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field1292 == 0 || field1292 == 1 && method480(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field1320.method216("From:  " + var4 + field1429[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field1140 >= 1) {
									field1182[field1147] = "Report abuse @whi@" + var4;
									field1283[field1147] = 2034;
									field1147++;
								}

								field1182[field1147] = "Add ignore @whi@" + var4;
								field1283[field1147] = 2436;
								field1147++;
								field1182[field1147] = "Add friend @whi@" + var4;
								field1283[field1147] = 2406;
								field1147++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field1292 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field1257.method90(arg3, arg0, arg4);
		if (var6 != 0) {
			int var7 = field1257.method94(arg3, arg0, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field1071.field596;
			int var12 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			class57 var14 = class57.method334(var13);
			if (var14.field838 == -1) {
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
				class37 var15 = field1197[var14.field838];
				if (var15 != null) {
					int var16 = (var14.field824 * 4 - var15.field605) / 2;
					int var17 = (var14.field825 * 4 - var15.field606) / 2;
					var15.method212((104 - arg4 - var14.field825) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field1257.method92(arg3, arg0, arg4);
		if (var18 != 0) {
			int var19 = field1257.method94(arg3, arg0, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			class57 var23 = class57.method334(var22);
			if (var23.field838 != -1) {
				class37 var24 = field1197[var23.field838];
				if (var24 != null) {
					int var25 = (var23.field824 * 4 - var24.field605) / 2;
					int var26 = (var23.field825 * 4 - var24.field606) / 2;
					var24.method212((104 - arg4 - var23.field825) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field1071.field596;
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

		int var30 = field1257.method93(arg3, arg0, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			class57 var32 = class57.method334(var31);
			if (var32.field838 != -1) {
				class37 var33 = field1197[var32.field838];
				if (var33 != null) {
					int var34 = (var32.field824 * 4 - var33.field605) / 2;
					int var35 = (var32.field825 * 4 - var33.field606) / 2;
					var33.method212((104 - arg4 - var32.field825) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBZ)V")
	public final void method463(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILmb;B)V")
	public final void method464(int arg0, class39 arg1) {
		arg1.method249();
		int var3 = arg1.method250(1);
		if (var3 != 0) {
			int var4 = arg1.method250(2);
			if (var4 == 0) {
				field1166[field1165++] = field1161;
			} else if (var4 == 1) {
				int var5 = arg1.method250(3);
				field1377.method125(var5, false);
				int var6 = arg1.method250(1);
				if (var6 == 1) {
					field1166[field1165++] = field1161;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method250(3);
				field1377.method125(var7, true);
				int var8 = arg1.method250(3);
				field1377.method125(var8, true);
				int var9 = arg1.method250(1);
				if (var9 == 1) {
					field1166[field1165++] = field1161;
				}
			} else if (var4 == 3) {
				field1080 = arg1.method250(2);
				int var10 = arg1.method250(7);
				int var11 = arg1.method250(7);
				int var12 = arg1.method250(1);
				field1377.method124(var12 == 1, var11, var10);
				int var13 = arg1.method250(1);
				if (var13 == 1) {
					field1166[field1165++] = field1161;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method10() {
		field1419 = true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method465() {
		if (field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field1268 + field1200 & 0x7FF;
				int var4 = class35.field582[var3];
				int var5 = class35.field583[var3];
				var4 = (field1236 + 256) * var4 >> 8;
				var5 = (field1236 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field1377.field368 + var6 >> 7;
				int var9 = field1377.field369 - var7 >> 7;
				boolean var10 = method453(var8, 0, true, 0, 0, 0, field1377.field417[0], field1377.field418[0], var9, 1, 0);
				if (var10) {
					field1235.method229(var1);
					field1235.method229(var2);
					field1235.method230(field1200);
					field1235.method229(57);
					field1235.method229(field1268);
					field1235.method229(field1236);
					field1235.method229(89);
					field1235.method230(field1377.field368);
					field1235.method230(field1377.field369);
					field1235.method229(field1118);
					field1235.method229(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)Lyb;")
	public final class51 method466(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field1212[0] != null) {
				var6 = field1212[0].method301(arg0);
			}
		} catch (Exception var28) {
		}

		if (var6 != null) {
			field1291.reset();
			field1291.update(var6);
			int var8 = (int) field1291.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new class51(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13("Requesting " + arg4, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method450(arg2 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				class39 var16 = new class39(var15);
				var16.field623 = 3;
				int var17 = var16.method243() + 6;
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
						method13("Loading " + arg4 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field1212[0] != null) {
						field1212[0].method302(var6.length, arg0, var6);
					}
				} catch (Exception var27) {
					field1212[0] = null;
				}

				if (var6 != null) {
					field1291.reset();
					field1291.update(var6);
					int var23 = (int) field1291.getValue();
					if (arg1 != var23) {
						var6 = null;
						var10++;
						var11 = "Checksum error: " + var23;
					}
				}
			} catch (IOException var29) {
				if (var11.equals("Unknown error")) {
					var11 = "Connection error";
				}

				var6 = null;
			} catch (NullPointerException var30) {
				var11 = "Null error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var31) {
				var11 = "Bounds error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var32) {
				var11 = "Unexpected error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			}

			if (var6 == null) {
				for (int var24 = var7; var24 > 0; var24--) {
					if (var10 >= 3) {
						method13("Game updated - please reload page", arg3);
						var24 = 10;
					} else {
						method13(var11 + " - Retrying in " + var24, arg3);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var26) {
					}
				}

				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}
			}
		}

		return new class51(var6);
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method467() {
		if (field1399 == 0 && field1142 == 0) {
			field1182[field1147] = "Walk here";
			field1283[field1147] = 660;
			field1281[field1147] = field17;
			field1282[field1147] = field18;
			field1147++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < class32.field548; var2++) {
			int var3 = class32.field549[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field1257.method94(field1080, var4, var5, var3) >= 0) {
					class57 var8 = class57.method334(var7);
					if (field1399 == 1) {
						field1182[field1147] = "Use " + field1403 + " with @cya@" + var8.field820;
						field1283[field1147] = 450;
						field1284[field1147] = var3;
						field1281[field1147] = var4;
						field1282[field1147] = var5;
						field1147++;
					} else if (field1142 != 1) {
						if (var8.field836 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field836[var9] != null) {
									field1182[field1147] = var8.field836[var9] + " @cya@" + var8.field820;

									if (var9 == 0) {
										field1283[field1147] = 285;
									}

									if (var9 == 1) {
										field1283[field1147] = 504;
									}

									if (var9 == 2) {
										field1283[field1147] = 364;
									}

									if (var9 == 3) {
										field1283[field1147] = 581;
									}

									if (var9 == 4) {
										field1283[field1147] = 1501;
									}

									field1284[field1147] = var3;
									field1281[field1147] = var4;
									field1282[field1147] = var5;
									field1147++;
								}
							}
						}

						field1182[field1147] = "Examine @cya@" + var8.field820;
						field1283[field1147] = 1175;
						field1284[field1147] = var3;
						field1281[field1147] = var4;
						field1282[field1147] = var5;
						field1147++;
					} else if ((field1144 & 0x4) == 4) {
						field1182[field1147] = field1145 + " @cya@" + var8.field820;
						field1283[field1147] = 55;
						field1284[field1147] = var3;
						field1281[field1147] = var4;
						field1282[field1147] = var5;
						field1147++;
					}
				}

				if (var6 == 1) {
					class27 var10 = field1287[var7];
					if (var10.field422.field867 == 1 && (var10.field368 & 0x7F) == 0x40 && (var10.field369 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field1288; var11++) {
							class27 var12 = field1287[field1289[var11]];
							if (var12 != null && var10 != var12 && var12.field422.field867 == 1 && var10.field368 == var12.field368 && var10.field369 == var12.field369) {
								method536(var12.field422, field1289[var11], var4, var5);
							}
						}
					}

					method536(var10.field422, var7, var4, var5);
				}

				if (var6 == 0) {
					class28 var13 = field1162[var7];
					if ((var13.field368 & 0x7F) == 0x40 && (var13.field369 & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < field1288; var14++) {
							class27 var15 = field1287[field1289[var14]];
							if (var15 != null && var15.field422.field867 == 1 && var13.field368 == var15.field368 && var13.field369 == var15.field369) {
								method536(var15.field422, field1289[var14], var4, var5);
							}
						}

						for (int var16 = 0; var16 < field1163; var16++) {
							class28 var17 = field1162[field1164[var16]];
							if (var17 != null && var13 != var17 && var13.field368 == var17.field368 && var13.field369 == var17.field369) {
								method440(var4, field1164[var16], var5, var17);
							}
						}
					}

					method440(var4, var7, var5, var13);
				}

				if (var6 == 3) {
					class42 var18 = field1265[field1080][var4][var5];
					if (var18 != null) {
						for (class30 var19 = (class30) var18.method259(); var19 != null; var19 = (class30) var18.method261()) {
							class60 var20 = class60.method350(var19.field455);
							if (field1399 == 1) {
								field1182[field1147] = "Use " + field1403 + " with @lre@" + var20.field898;
								field1283[field1147] = 217;
								field1284[field1147] = var19.field455;
								field1281[field1147] = var4;
								field1282[field1147] = var5;
								field1147++;
							} else if (field1142 != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.field912 != null && var20.field912[var21] != null) {
										field1182[field1147] = var20.field912[var21] + " @lre@" + var20.field898;

										if (var21 == 0) {
											field1283[field1147] = 224;
										}

										if (var21 == 1) {
											field1283[field1147] = 993;
										}

										if (var21 == 2) {
											field1283[field1147] = 99;
										}

										if (var21 == 3) {
											field1283[field1147] = 746;
										}

										if (var21 == 4) {
											field1283[field1147] = 877;
										}

										field1284[field1147] = var19.field455;
										field1281[field1147] = var4;
										field1282[field1147] = var5;
										field1147++;
									} else if (var21 == 2) {
										field1182[field1147] = "Take @lre@" + var20.field898;
										field1283[field1147] = 99;
										field1284[field1147] = var19.field455;
										field1281[field1147] = var4;
										field1282[field1147] = var5;
										field1147++;
									}
								}

								field1182[field1147] = "Examine @lre@" + var20.field898;
								field1283[field1147] = 1102;
								field1284[field1147] = var19.field455;
								field1281[field1147] = var4;
								field1282[field1147] = var5;
								field1147++;
							} else if ((field1144 & 0x1) == 1) {
								field1182[field1147] = field1145 + " @lre@" + var20.field898;
								field1283[field1147] = 965;
								field1284[field1147] = var19.field455;
								field1281[field1147] = var4;
								field1282[field1147] = var5;
								field1147++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class41 var10 = null;
		for (class41 var11 = (class41) field1109.method258(); var11 != null; var11 = (class41) field1109.method260()) {
			if (var11.field640 == arg0 && var11.field642 == arg7 && var11.field643 == arg2 && var11.field641 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new class41();
			var10.field640 = arg0;
			var10.field641 = arg6;
			var10.field642 = arg7;
			var10.field643 = arg2;
			method503(var10);
			field1109.method255(var10);
		}

		var10.field647 = arg8;
		var10.field649 = arg1;
		var10.field648 = arg5;
		var10.field650 = arg3;
		var10.field651 = arg4;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method469() {
		try {
			if (field1146 != null) {
				field1146.method38();
			}
		} catch (Exception var2) {
		}

		field1146 = null;
		field1301 = false;
		field1323 = 0;
		field1088 = "";
		field1089 = "";
		class6.method45();
		method460();
		field1257.method64();

		for (int var1 = 0; var1 < 4; var1++) {
			field1067[var1].method361();
		}

		System.gc();
		method559();
		field1316 = -1;
		field1203 = -1;
		field1273 = 0;
	}

	public final void run() {
		if (field1208) {
			method487();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method470(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method471() {
		int var1 = field1380 * 128 + 64;
		int var2 = field1381 * 128 + 64;
		int var3 = method501(field1080, var1, var2) - field1382;

		if (field1121 < var1) {
			field1121 += (var1 - field1121) * field1384 / 1000 + field1383;
			if (field1121 > var1) {
				field1121 = var1;
			}
		}

		if (field1121 > var1) {
			field1121 -= (field1121 - var1) * field1384 / 1000 + field1383;
			if (field1121 < var1) {
				field1121 = var1;
			}
		}

		if (field1122 < var3) {
			field1122 += (var3 - field1122) * field1384 / 1000 + field1383;
			if (field1122 > var3) {
				field1122 = var3;
			}
		}

		if (field1122 > var3) {
			field1122 -= (field1122 - var3) * field1384 / 1000 + field1383;
			if (field1122 < var3) {
				field1122 = var3;
			}
		}

		if (field1123 < var2) {
			field1123 += (var2 - field1123) * field1384 / 1000 + field1383;
			if (field1123 > var2) {
				field1123 = var2;
			}
		}

		if (field1123 > var2) {
			field1123 -= (field1123 - var2) * field1384 / 1000 + field1383;
			if (field1123 < var2) {
				field1123 = var2;
			}
		}

		int var4 = field1047 * 128 + 64;
		int var5 = field1048 * 128 + 64;
		int var6 = method501(field1080, var4, var5) - field1049;
		int var7 = var4 - field1121;
		int var8 = var6 - field1122;
		int var9 = var5 - field1123;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field1124 < var11) {
			field1124 += (var11 - field1124) * field1051 / 1000 + field1050;
			if (field1124 > var11) {
				field1124 = var11;
			}
		}

		if (field1124 > var11) {
			field1124 -= (field1124 - var11) * field1051 / 1000 + field1050;
			if (field1124 < var11) {
				field1124 = var11;
			}
		}

		int var13 = var12 - field1125;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field1125 += field1051 * var13 / 1000 + field1050;
			field1125 &= 0x7FF;
		}

		if (var13 < 0) {
			field1125 -= -var13 * field1051 / 1000 + field1050;
			field1125 &= 0x7FF;
		}

		int var14 = var12 - field1125;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field1125 = var12;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method472() {
		field1373.method268();
		class35.field584 = field1084;
		field1441.method212(0, 0);

		if (field1440 != -1) {
			method526(class4.field56[field1440], 0, 0, 0);
		} else if (field1398[field1044] != -1) {
			method526(class4.field56[field1398[field1044]], 0, 0, 0);
		}

		if (field1413 && field1366 == 1) {
			method449();
		}

		field1373.method269(553, field9, 205);
		field1375.method268();
		class35.field584 = field1085;
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

	@ObfuscatedName("client.a(ILmb;Z)V")
	public final void method473(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1165; var3++) {
			int var4 = field1166[var3];
			class28 var5 = field1162[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.method239() << 8;
			}

			method532(var4, var5, arg1, var6);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method474() {
		short var1 = 256;

		if (field1326 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1326 > 768) {
					field1445[var2] = method481(field1447[var2], field1446[var2], 1024 - field1326);
				} else if (field1326 > 256) {
					field1445[var2] = field1447[var2];
				} else {
					field1445[var2] = method481(field1446[var2], field1447[var2], 256 - field1326);
				}
			}
		} else if (field1327 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1327 > 768) {
					field1445[var3] = method481(field1448[var3], field1446[var3], 1024 - field1327);
				} else if (field1327 > 256) {
					field1445[var3] = field1448[var3];
				} else {
					field1445[var3] = method481(field1446[var3], field1448[var3], 256 - field1327);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field1445[var4] = field1446[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field1134.field656[var5] = field1222.field596[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field1221[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field1037[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field1445[var12];
					int var15 = field1134.field656[var7];
					field1134.field656[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field1134.method269(0, field9, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field1135.field656[var16] = field1223.field596[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field1221[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field1037[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field1445[var23];
					int var26 = field1135.field656[var18];
					field1135.field656[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field1135.method269(637, field9, 0);
	}

	@ObfuscatedName("client.a(IILz;)V")
	public final void method475(int arg0, class26 arg1) {
		method476(arg0, arg1.field368, arg1.field369);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method476(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method501(field1080, arg1, arg2) - arg0;
			arg1 -= field1121;
			var4 -= field1122;
			arg2 -= field1123;
			int var5 = class32.field550[field1124];
			int var6 = class32.field551[field1124];
			int var7 = class32.field550[field1125];
			int var8 = class32.field551[field1125];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field1107 = (var9 << 9) / arg2 + class35.field578;
				field1108 = (var11 << 9) / arg2 + class35.field579;
			} else {
				field1107 = -1;
				field1108 = -1;
			}
		} else {
			field1107 = -1;
			field1108 = -1;
		}
	}

	@ObfuscatedName("client.a(IIBIIIII)V")
	public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
			if (field1176 && field1080 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field1257.method90(arg3, arg6, arg2);
			}

			if (arg5 == 1) {
				var8 = field1257.method91(arg2, arg3, arg6);
			}

			if (arg5 == 2) {
				var8 = field1257.method92(arg3, arg6, arg2);
			}

			if (arg5 == 3) {
				var8 = field1257.method93(arg3, arg6, arg2);
			}

			if (var8 != 0) {
				int var12 = field1257.method94(arg3, arg6, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field1257.method81(arg2, arg6, arg3);
					class57 var16 = class57.method334(var13);
					if (var16.field826) {
						field1067[arg3].method366(arg6, arg2, var15, var16.field827, var14);
					}
				}

				if (arg5 == 1) {
					field1257.method82(arg2, arg6, arg3);
				}

				if (arg5 == 2) {
					field1257.method83(arg2, arg6, arg3);
					class57 var17 = class57.method334(var13);
					if (var17.field824 + arg6 > 103 || var17.field824 + arg2 > 103 || var17.field825 + arg6 > 103 || var17.field825 + arg2 > 103) {
						return;
					}

					if (var17.field826) {
						field1067[arg3].method367(var17.field824, var17.field827, arg6, arg2, var15, var17.field825);
					}
				}

				if (arg5 == 3) {
					field1257.method84(arg2, arg3, arg6);
					class57 var18 = class57.method334(var13);
					if (var18.field826 && var18.field828) {
						field1067[arg3].method369(arg2, arg6);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field1211[1][arg6][arg2] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				class3.method31(field1067[arg3], field1257, arg3, arg2, arg6, var19, field1168, arg0, arg1, arg4);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method13(String arg0, int arg1) {
		field1141 = arg1;
		field1238 = arg0;
		method432();

		if (field1406 == null) {
			super.method13(arg0, arg1);
		} else {
			field1133.method268();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field1321.method214(0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			class34.method171(0x8C1111, var6, 304, 34, var3 / 2 - 152);
			class34.method171(0, var6 + 1, 302, 32, var3 / 2 - 151);
			class34.method170(var6 + 2, var3 / 2 - 150, 0x8C1111, arg1 * 3, 30);
			class34.method170(var6 + 2, arg1 * 3 + (var3 / 2 - 150), 0, 300 - arg1 * 3, 30);
			field1321.method214(0xFFFFFF, arg0, var4 / 2 + 5 - var5, var3 / 2);
			field1133.method269(202, field9, 171);

			if (field1419) {
				field1419 = false;

				if (!field1061) {
					field1134.method269(0, field9, 0);
					field1135.method269(637, field9, 0);
				}

				field1131.method269(128, field9, 0);
				field1132.method269(202, field9, 371);
				field1136.method269(0, field9, 265);
				field1137.method269(562, field9, 265);
				field1138.method269(128, field9, 171);
				field1139.method269(562, field9, 171);
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field1389 || field1172 || field1426) {
			method448();
		} else {
			field1278++;

			if (field1301) {
				method499();
			} else {
				method545(false);
			}

			field1110 = 0;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method478() {
		if (field1252 == 0) {
			field1182[0] = "Cancel";
			field1283[0] = 1252;
			field1147 = 1;
			method461();
			field1113 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field1274 == -1) {
					method467();
				} else {
					method516(0, field18, 4, 4, field17, class4.field56[field1274]);
				}
			}

			if (field1113 != field1093) {
				field1093 = field1113;
			}

			field1113 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field1440 != -1) {
					method516(0, field18, 553, 205, field17, class4.field56[field1440]);
				} else if (field1398[field1044] != -1) {
					method516(0, field18, 553, 205, field17, class4.field56[field1398[field1044]]);
				}
			}

			if (field1113 != field1086) {
				field1057 = true;
				field1086 = field1113;
			}

			field1113 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field1130 != -1) {
					method516(0, field18, 17, 357, field17, class4.field56[field1130]);
				} else if (field18 < 434 && field17 < 426) {
					method552(field17 - 17, field18 - 357);
				}
			}

			if (field1130 != -1 && field1343 != field1113) {
				field1224 = true;
				field1343 = field1113;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field1147 - 1; var2++) {
					if (field1283[var2] < 1000 && field1283[var2 + 1] > 1000) {
						String var3 = field1182[var2];
						field1182[var2] = field1182[var2 + 1];
						field1182[var2 + 1] = var3;
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

	@ObfuscatedName("client.r(I)V")
	public final void method479() {
		if (field1376 == null) {
			method442();
			field10 = null;
			field1131 = null;
			field1132 = null;
			field1133 = null;
			field1134 = null;
			field1135 = null;
			field1136 = null;
			field1137 = null;
			field1138 = null;
			field1139 = null;
			field1376 = new class44(method11(), 479, 96);
			field1374 = new class44(method11(), 172, 156);
			class34.method168();
			field1442.method212(0, 0);
			field1373 = new class44(method11(), 190, 261);
			field1375 = new class44(method11(), 512, 334);
			class34.method168();
			field1358 = new class44(method11(), 496, 50);
			field1359 = new class44(method11(), 269, 37);
			field1360 = new class44(method11(), 249, 45);
			field1419 = true;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field1174 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method480(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field1409; var2++) {
			if (arg0.equalsIgnoreCase(field1311[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field1377.field423)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method481(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method482(int arg0, class39 arg1) {
		while (arg1.field624 + 21 < arg0 * 8) {
			int var3 = arg1.method250(14);
			if (var3 == 16383) {
				break;
			}

			if (field1287[var3] == null) {
				field1287[var3] = new class27();
			}

			class27 var4 = field1287[var3];
			field1289[field1288++] = var3;
			var4.field413 = field1060;
			var4.field422 = class59.method344(arg1.method250(11));
			var4.field372 = var4.field422.field867;
			var4.field375 = var4.field422.field871;
			var4.field376 = var4.field422.field872;
			var4.field377 = var4.field422.field873;
			var4.field378 = var4.field422.field874;
			var4.field373 = var4.field422.field870;
			int var5 = arg1.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.method124(false, field1377.field418[0] + var6, field1377.field417[0] + var5);
			int var7 = arg1.method250(1);
			if (var7 == 1) {
				field1166[field1165++] = var3;
			}
		}

		arg1.method251();
	}

	@ObfuscatedName("client.h(B)V")
	public final void method483() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field1274 != -1 && field1355 == field1274) {
				if (var1 == 8 && field1432.length() > 0) {
					field1432 = field1432.substring(0, field1432.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field1432.length() < 12) {
					field1432 = field1432 + (char) var1;
				}
			} else if (field1276) {
				if (var1 >= 32 && var1 <= 122 && field1318.length() < 80) {
					field1318 = field1318 + (char) var1;
					field1224 = true;
				}

				if (var1 == 8 && field1318.length() > 0) {
					field1318 = field1318.substring(0, field1318.length() - 1);
					field1224 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field1276 = false;
					field1224 = true;

					if (field1195 == 1) {
						long var2 = class52.method310(field1318);
						method457(var2);
					}

					if (field1195 == 2 && field1409 > 0) {
						long var4 = class52.method310(field1318);
						method502(var4);
					}

					if (field1195 == 3 && field1318.length() > 0) {
						field1235.method228(217);
						field1235.method229(0);
						int var6 = field1235.field623;
						field1235.method235(field1091);
						class53.method318(field1318, field1235);
						field1235.method238(field1235.field623 - var6);
						field1318 = class52.method315(field1318);
						field1318 = class71.method403(field1318);
						method454(6, field1318, class52.method314(class52.method311(field1091)));

						if (field1292 == 2) {
							field1292 = 1;
							field1420 = true;
							field1235.method228(94);
							field1235.method229(field1241);
							field1235.method229(field1292);
							field1235.method229(field1378);
						}
					}

					if (field1195 == 4 && field1379 < 100) {
						long var7 = class52.method310(field1318);
						method490(var7);
					}

					if (field1195 == 5 && field1379 > 0) {
						long var9 = class52.method310(field1318);
						method512(var9);
					}
				}
			} else if (field1095) {
				if (var1 >= 48 && var1 <= 57 && field1361.length() < 10) {
					field1361 = field1361 + (char) var1;
					field1224 = true;
				}

				if (var1 == 8 && field1361.length() > 0) {
					field1361 = field1361.substring(0, field1361.length() - 1);
					field1224 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field1361.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field1361);
						} catch (Exception var16) {
						}

						field1235.method228(19);
						field1235.method233(var11);
					}

					field1095 = false;
					field1224 = true;
				}
			} else if (field1130 == -1) {
				if (var1 >= 32 && var1 <= 122 && field1396.length() < 80) {
					field1396 = field1396 + (char) var1;
					field1224 = true;
				}

				if (var1 == 8 && field1396.length() > 0) {
					field1396 = field1396.substring(0, field1396.length() - 1);
					field1224 = true;
				}

				if ((var1 == 13 || var1 == 10) && field1396.length() > 0) {
					if (field1140 == 2) {
						if (field1396.equals("::clientdrop")) {
							method556();
						}

						if (field1396.equals("::lag")) {
							method549();
						}

						if (field1396.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field1207.method282(2); var12++) {
								field1207.method292((byte) 1, var12, 2);
							}
						}
					}

					if (field1396.startsWith("::")) {
						field1235.method228(92);
						field1235.method229(field1396.length() - 1);
						field1235.method236(field1396.substring(2));
					} else {
						byte var13 = 0;
						if (field1396.startsWith("yellow:")) {
							var13 = 0;
							field1396 = field1396.substring(7);
						}

						if (field1396.startsWith("red:")) {
							var13 = 1;
							field1396 = field1396.substring(4);
						}

						if (field1396.startsWith("green:")) {
							var13 = 2;
							field1396 = field1396.substring(6);
						}

						if (field1396.startsWith("cyan:")) {
							var13 = 3;
							field1396 = field1396.substring(5);
						}

						if (field1396.startsWith("purple:")) {
							var13 = 4;
							field1396 = field1396.substring(7);
						}

						if (field1396.startsWith("white:")) {
							var13 = 5;
							field1396 = field1396.substring(6);
						}

						if (field1396.startsWith("flash1:")) {
							var13 = 6;
							field1396 = field1396.substring(7);
						}

						if (field1396.startsWith("flash2:")) {
							var13 = 7;
							field1396 = field1396.substring(7);
						}

						if (field1396.startsWith("flash3:")) {
							var13 = 8;
							field1396 = field1396.substring(7);
						}

						if (field1396.startsWith("glow1:")) {
							var13 = 9;
							field1396 = field1396.substring(6);
						}

						if (field1396.startsWith("glow2:")) {
							var13 = 10;
							field1396 = field1396.substring(6);
						}

						if (field1396.startsWith("glow3:")) {
							var13 = 11;
							field1396 = field1396.substring(6);
						}

						byte var14 = 0;
						if (field1396.startsWith("wave:")) {
							var14 = 1;
							field1396 = field1396.substring(5);
						}

						if (field1396.startsWith("scroll:")) {
							var14 = 2;
							field1396 = field1396.substring(7);
						}

						field1235.method228(87);
						field1235.method229(0);
						int var15 = field1235.field623;
						field1235.method229(var13);
						field1235.method229(var14);
						class53.method318(field1396, field1235);
						field1235.method238(field1235.field623 - var15);
						field1396 = class52.method315(field1396);
						field1396 = class71.method403(field1396);
						field1377.field380 = field1396;
						field1377.field382 = var13;
						field1377.field383 = var14;
						field1377.field381 = 150;

						if (field1140 == 2) {
							method454(2, field1377.field380, "@cr2@" + field1377.field423);
						} else if (field1140 == 1) {
							method454(2, field1377.field380, "@cr1@" + field1377.field423);
						} else {
							method454(2, field1377.field380, field1377.field423);
						}

						if (field1241 == 2) {
							field1241 = 3;
							field1420 = true;
							field1235.method228(94);
							field1235.method229(field1241);
							field1235.method229(field1292);
							field1235.method229(field1378);
						}
					}

					field1396 = "";
					field1224 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method484() {
		for (int var1 = -1; var1 < field1163; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field1161;
			} else {
				var2 = field1164[var1];
			}

			class28 var3 = field1162[var2];
			if (var3 != null && var3.field381 > 0) {
				var3.field381--;
				if (var3.field381 == 0) {
					var3.field380 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field1288; var4++) {
			int var5 = field1289[var4];
			class27 var6 = field1287[var5];
			if (var6 != null && var6.field381 > 0) {
				var6.field381--;
				if (var6.field381 == 0) {
					var6.field380 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;B)I")
	public final int method485(int arg0, class4 arg1) {
		if (arg1.field71 == null || arg0 >= arg1.field71.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field71[arg0];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += field1098[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += field1052[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += field1299[var3[var5++]];
				}

				if (var6 == 4) {
					class4 var7 = class4.field56[var3[var5++]];
					int var8 = var3[var5++];
					if (var8 >= 0 && var8 < class60.field890 && (!class60.method350(var8).field911 || field1175)) {
						for (int var9 = 0; var9 < var7.field57.length; var9++) {
							if (var8 + 1 == var7.field57[var9]) {
								var4 += var7.field58[var9];
							}
						}
					}
				}

				if (var6 == 5) {
					var4 += field1066[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += field1345[field1052[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += field1066[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += field1377.field429;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < class67.field993; var10++) {
						if (class67.field995[var10]) {
							var4 += field1052[var10];
						}
					}
				}

				if (var6 == 10) {
					class4 var11 = class4.field56[var3[var5++]];
					int var12 = var3[var5++] + 1;
					if (var12 >= 0 && var12 < class60.field890 && (!class60.method350(var12).field911 || field1175)) {
						for (int var13 = 0; var13 < var11.field57.length; var13++) {
							if (var11.field57[var13] == var12) {
								var4 += 999999999;
								break;
							}
						}
					}
				}

				if (var6 == 11) {
					var4 += field1077;
				}

				if (var6 == 12) {
					var4 += field1215;
				}

				if (var6 == 13) {
					int var14 = field1066[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}

				if (var6 == 14) {
					int var16 = var3[var5++];
					class69 var17 = class69.field1011[var16];
					int var18 = var17.field1013;
					int var19 = var17.field1014;
					int var20 = var17.field1015;
					int var21 = field1293[var20 - var19];
					var4 += field1066[var18] >> var19 & var21;
				}
			}
		} catch (Exception var22) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(BLd;)V")
	public final void method486(class4 arg0) {
		int var2 = arg0.field65;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field1410 == 0) {
				arg0.field97 = "Loading friend list";
				arg0.field64 = 0;
			} else if (var2 == 1 && field1410 == 1) {
				arg0.field97 = "Connecting to friendserver";
				arg0.field64 = 0;
			} else if (var2 == 2 && field1410 != 2) {
				arg0.field97 = "Please wait...";
				arg0.field64 = 0;
			} else {
				int var3 = field1409;
				if (field1410 != 2) {
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
					arg0.field97 = field1311[var2];
					arg0.field64 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field1409;
			if (field1410 != 2) {
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
				if (field1264[var2] == 0) {
					arg0.field97 = "@red@Offline";
				} else if (field1264[var2] == field1173) {
					arg0.field97 = "@gre@World-" + (field1264[var2] - 9);
				} else {
					arg0.field97 = "@yel@World-" + (field1264[var2] - 9);
				}

				arg0.field64 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field1409;
			if (field1410 != 2) {
				var5 = 0;
			}

			arg0.field75 = var5 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= field1379) {
				arg0.field97 = "";
				arg0.field64 = 0;
			} else {
				arg0.field97 = class52.method314(class52.method311(field1234[var2]));
				arg0.field64 = 1;
			}
		} else if (var2 == 503) {
			arg0.field75 = field1379 * 15 + 20;
			if (arg0.field75 <= arg0.field67) {
				arg0.field75 = arg0.field67 + 1;
			}
		} else if (var2 == 327) {
			arg0.field112 = 150;
			arg0.field113 = (int) (Math.sin(field1060 / 40.0D) * 256.0D) & 0x7FF;

			if (field1231) {
				for (int var6 = 0; var6 < 7; var6++) {
					int var7 = field1362[var6];
					if (var7 >= 0 && !class64.field958[var7].method379()) {
						return;
					}
				}

				field1231 = false;
				class32[] var8 = new class32[7];
				int var9 = 0;
				for (int var10 = 0; var10 < 7; var10++) {
					int var11 = field1362[var10];
					if (var11 >= 0) {
						var8[var9++] = class64.field958[var11].method380();
					}
				}

				class32 var12 = new class32(var9, var8);
				for (int var13 = 0; var13 < 5; var13++) {
					if (field1079[var13] != 0) {
						var12.method153(field1280[var13][0], field1280[var13][field1079[var13]]);

						if (var13 == 1) {
							var12.method153(field1078[0], field1078[field1079[var13]]);
						}
					}
				}

				var12.method146();
				var12.method147(class66.field978[field1377.field373].field980[0]);
				var12.method156(64, 850, -30, -50, -30, true);
				arg0.field105 = 5;
				arg0.field106 = 0;
				class4.method36(0, var12, 5);
			}
		} else if (var2 == 324) {
			if (field1248 == null) {
				field1248 = arg0.field103;
				field1249 = arg0.field104;
			}

			if (field1424) {
				arg0.field103 = field1249;
			} else {
				arg0.field103 = field1248;
			}
		} else if (var2 == 325) {
			if (field1248 == null) {
				field1248 = arg0.field103;
				field1249 = arg0.field104;
			}

			if (field1424) {
				arg0.field103 = field1248;
			} else {
				arg0.field103 = field1249;
			}
		} else if (var2 == 600) {
			arg0.field97 = field1432;
			if (field1060 % 20 < 10) {
				arg0.field97 = arg0.field97 + "|";
			} else {
				arg0.field97 = arg0.field97 + " ";
			}
		} else if (var2 == 613) {
			if (field1140 < 1) {
				arg0.field97 = "";
			} else if (field1104) {
				arg0.field99 = 0xFF0000;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field99 = 0xFFFFFF;
				arg0.field97 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field1255 == 0) {
				arg0.field97 = "";
			} else {
				String var14;
				if (field1116 == 0) {
					var14 = "earlier today";
				} else if (field1116 == 1) {
					var14 = "yesterday";
				} else {
					var14 = field1116 + " days ago";
				}

				arg0.field97 = "You last logged in " + var14 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field1081 == 0) {
				arg0.field97 = "0 unread messages";
				arg0.field99 = 0xFFFF00;
			}

			if (field1081 == 1) {
				arg0.field97 = "1 unread message";
				arg0.field99 = 0xFF00;
			}

			if (field1081 > 1) {
				arg0.field97 = field1081 + " unread messages";
				arg0.field99 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field1408 == 201) {
				if (field1258 == 1) {
					arg0.field97 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field97 = "";
				}
			} else if (field1408 == 200) {
				arg0.field97 = "You have not yet set any password recovery questions.";
			} else {
				String var15;
				if (field1408 == 0) {
					var15 = "Earlier today";
				} else if (field1408 == 1) {
					var15 = "Yesterday";
				} else {
					var15 = field1408 + " days ago";
				}

				arg0.field97 = var15 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field1408 == 201) {
				if (field1258 == 1) {
					arg0.field97 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field97 = "";
				}
			} else if (field1408 == 200) {
				arg0.field97 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field97 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field1408 == 201) {
				if (field1258 == 1) {
					arg0.field97 = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					arg0.field97 = "";
				}
			} else if (field1408 == 200) {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field97 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method487() {
		field1062 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field1061) {
				field1386++;
				method538();
				method538();
				method474();
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

		field1062 = false;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method488() {
		for (int var1 = 0; var1 < field1169; var1++) {
			if (field1082[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field1371[var1] != field1232 || field1194[var1] != field1228) {
						class39 var3 = class55.method323(field1371[var1], field1194[var1]);
						if (System.currentTimeMillis() + var3.field623 / 22 > field1185 / 22 + field1206) {
							field1185 = var3.field623;
							field1206 = System.currentTimeMillis();

							if (method557(var3.field623, var3.field622)) {
								field1232 = field1371[var1];
								field1228 = field1194[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method452()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field1082[var1] != -5) {
					field1082[var1] = -5;
				} else {
					field1169--;
					for (int var5 = var1; var5 < field1169; var5++) {
						field1371[var5] = field1371[var5 + 1];
						field1194[var5] = field1194[var5 + 1];
						field1082[var5] = field1082[var5 + 1];
					}

					var1--;
				}
			} else {
				field1082[var1]--;
			}
		}

		if (field1273 > 0) {
			field1273 -= 20;
			if (field1273 < 0) {
				field1273 = 0;
			}

			if (field1273 == 0 && field1352 && !field1176) {
				field1203 = field1316;
				field1204 = false;
				field1207.method289(2, field1203);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method489() {
		try {
			int var1 = field1377.field368 + field1324;
			int var2 = field1377.field369 + field1073;
			if (field1075 - var1 < -500 || field1075 - var1 > 500 || field1076 - var2 < -500 || field1076 - var2 > 500) {
				field1075 = var1;
				field1076 = var2;
			}

			if (field1075 != var1) {
				field1075 += (var1 - field1075) / 16;
			}

			if (field1076 != var2) {
				field1076 += (var2 - field1076) / 16;
			}

			if (field27[1] == 1) {
				field1201 += (-field1201 - 24) / 2;
			} else if (field27[2] == 1) {
				field1201 += (24 - field1201) / 2;
			} else {
				field1201 /= 2;
			}

			if (field27[3] == 1) {
				field1202 += (12 - field1202) / 2;
			} else if (field27[4] == 1) {
				field1202 += (-field1202 - 12) / 2;
			} else {
				field1202 /= 2;
			}

			field1200 = field1201 / 2 + field1200 & 0x7FF;
			field1199 += field1202 / 2;
			if (field1199 < 128) {
				field1199 = 128;
			}

			if (field1199 > 383) {
				field1199 = 383;
			}

			int var3 = field1075 >> 7;
			int var4 = field1076 >> 7;
			int var5 = method501(field1080, field1075, field1076);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field1080;
						if (var9 < 3 && (field1211[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field1168[var9][var7][var8];
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

			if (var11 > field1365) {
				field1365 += (var11 - field1365) / 24;
			} else if (var11 < field1365) {
				field1365 += (var11 - field1365) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1377.field368 + "," + field1377.field369 + "," + field1075 + "," + field1076 + "," + field1393 + "," + field1394 + "," + field1302 + "," + field1303);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method490(long arg0) {
		if (arg0 != 0L) {
			if (field1379 >= 100) {
				method454(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = class52.method314(class52.method311(arg0));
				for (int var4 = 0; var4 < field1379; var4++) {
					if (field1234[var4] == arg0) {
						method454(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field1409; var5++) {
					if (field1294[var5] == arg0) {
						method454(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field1234[field1379++] = arg0;
				field1057 = true;
				field1235.method228(185);
				field1235.method235(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method491(class39 arg0, int arg1) {
		field1063 = 0;
		field1165 = 0;
		method529(arg0, arg1);
		method482(arg1, arg0);
		method562(arg1, arg0);

		for (int var3 = 0; var3 < field1063; var3++) {
			int var4 = field1064[var3];
			if (field1060 != field1287[var4].field413) {
				field1287[var4].field422 = null;
				field1287[var4] = null;
			}
		}

		if (arg0.field623 != arg1) {
			signlink.reporterror(field1088 + " size mismatch in getnpcpos - pos:" + arg0.field623 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1288; var5++) {
			if (field1287[field1289[var5]] == null) {
				signlink.reporterror(field1088 + " null entry in npc list - pos:" + var5 + " size:" + field1288);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method492() {
		for (int var1 = 0; var1 < field1288; var1++) {
			int var2 = field1289[var1];
			class27 var3 = field1287[var2];
			if (var3 != null) {
				method493(var3, var3.field422.field867);
			}
		}
	}

	@ObfuscatedName("client.a(ILz;I)V")
	public final void method493(class26 arg0, int arg1) {
		if (arg0.field368 < 128 || arg0.field369 < 128 || arg0.field368 >= 13184 || arg0.field369 >= 13184) {
			arg0.field396 = -1;
			arg0.field401 = -1;
			arg0.field410 = 0;
			arg0.field411 = 0;
			arg0.field368 = arg0.field417[0] * 128 + arg0.field372 * 64;
			arg0.field369 = arg0.field418[0] * 128 + arg0.field372 * 64;
			arg0.method126();
		}

		if (field1377 == arg0 && (arg0.field368 < 1536 || arg0.field369 < 1536 || arg0.field368 >= 11776 || arg0.field369 >= 11776)) {
			arg0.field396 = -1;
			arg0.field401 = -1;
			arg0.field410 = 0;
			arg0.field411 = 0;
			arg0.field368 = arg0.field417[0] * 128 + arg0.field372 * 64;
			arg0.field369 = arg0.field418[0] * 128 + arg0.field372 * 64;
			arg0.method126();
		}

		if (arg0.field410 > field1060) {
			method494(arg0);
		} else if (arg0.field411 >= field1060) {
			method495(arg0);
		} else {
			method496(arg0);
		}

		method497(arg0);
		method498(arg0);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method494(class26 arg0) {
		int var2 = arg0.field410 - field1060;
		int var3 = arg0.field406 * 128 + arg0.field372 * 64;
		int var4 = arg0.field408 * 128 + arg0.field372 * 64;
		arg0.field368 += (var3 - arg0.field368) / var2;
		arg0.field369 += (var4 - arg0.field369) / var2;
		arg0.field420 = 0;

		if (arg0.field412 == 0) {
			arg0.field415 = 1024;
		}

		if (arg0.field412 == 1) {
			arg0.field415 = 1536;
		}

		if (arg0.field412 == 2) {
			arg0.field415 = 0;
		}

		if (arg0.field412 == 3) {
			arg0.field415 = 512;
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method495(class26 arg0) {
		if (field1060 == arg0.field411 || arg0.field396 == -1 || arg0.field399 != 0 || arg0.field398 + 1 > class66.field978[arg0.field396].method384(arg0.field397)) {
			int var2 = arg0.field411 - arg0.field410;
			int var3 = field1060 - arg0.field410;
			int var4 = arg0.field406 * 128 + arg0.field372 * 64;
			int var5 = arg0.field408 * 128 + arg0.field372 * 64;
			int var6 = arg0.field407 * 128 + arg0.field372 * 64;
			int var7 = arg0.field409 * 128 + arg0.field372 * 64;
			arg0.field368 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field369 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field420 = 0;

		if (arg0.field412 == 0) {
			arg0.field415 = 1024;
		}

		if (arg0.field412 == 1) {
			arg0.field415 = 1536;
		}

		if (arg0.field412 == 2) {
			arg0.field415 = 0;
		}

		if (arg0.field412 == 3) {
			arg0.field415 = 512;
		}

		arg0.field370 = arg0.field415;
	}

	@ObfuscatedName("client.b(ILz;)V")
	public final void method496(class26 arg0) {
		arg0.field393 = arg0.field373;
		if (arg0.field416 == 0) {
			arg0.field420 = 0;
		} else {
			if (arg0.field396 != -1 && arg0.field399 == 0) {
				class66 var2 = class66.field978[arg0.field396];
				if (arg0.field421 > 0 && var2.field990 == 0) {
					arg0.field420++;
					return;
				}

				if (arg0.field421 <= 0 && var2.field991 == 0) {
					arg0.field420++;
					return;
				}
			}

			int var3 = arg0.field368;
			int var4 = arg0.field369;
			int var5 = arg0.field417[arg0.field416 - 1] * 128 + arg0.field372 * 64;
			int var6 = arg0.field418[arg0.field416 - 1] * 128 + arg0.field372 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field415 = 1280;
					} else if (var4 > var6) {
						arg0.field415 = 1792;
					} else {
						arg0.field415 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field415 = 768;
					} else if (var4 > var6) {
						arg0.field415 = 256;
					} else {
						arg0.field415 = 512;
					}
				} else if (var4 < var6) {
					arg0.field415 = 1024;
				} else {
					arg0.field415 = 0;
				}

				int var7 = arg0.field415 - arg0.field370 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field376;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field375;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field378;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field377;
				}

				if (var8 == -1) {
					var8 = arg0.field375;
				}

				arg0.field393 = var8;
				int var9 = 4;
				if (arg0.field415 != arg0.field370 && arg0.field390 == -1) {
					var9 = 2;
				}

				if (arg0.field416 > 2) {
					var9 = 6;
				}

				if (arg0.field416 > 3) {
					var9 = 8;
				}

				if (arg0.field420 > 0 && arg0.field416 > 1) {
					var9 = 8;
					arg0.field420--;
				}

				if (arg0.field419[arg0.field416 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field393 == arg0.field375 && arg0.field379 != -1) {
					arg0.field393 = arg0.field379;
				}

				if (var3 < var5) {
					arg0.field368 += var9;
					if (arg0.field368 > var5) {
						arg0.field368 = var5;
					}
				} else if (var3 > var5) {
					arg0.field368 -= var9;
					if (arg0.field368 < var5) {
						arg0.field368 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field369 += var9;
					if (arg0.field369 > var6) {
						arg0.field369 = var6;
					}
				} else if (var4 > var6) {
					arg0.field369 -= var9;
					if (arg0.field369 < var6) {
						arg0.field369 = var6;
					}
				}

				if (arg0.field368 == var5 && arg0.field369 == var6) {
					arg0.field416--;

					if (arg0.field421 > 0) {
						arg0.field421--;
						return;
					}
				}
			} else {
				arg0.field368 = var5;
				arg0.field369 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLz;)V")
	public final void method497(class26 arg0) {
		if (arg0.field390 != -1 && arg0.field390 < 32768) {
			class27 var2 = field1287[arg0.field390];
			if (var2 != null) {
				int var3 = arg0.field368 - var2.field368;
				int var4 = arg0.field369 - var2.field369;
				if (var3 != 0 || var4 != 0) {
					arg0.field415 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.field390 >= 32768) {
			int var5 = arg0.field390 - 32768;
			if (field1094 == var5) {
				var5 = field1161;
			}

			class28 var6 = field1162[var5];
			if (var6 != null) {
				int var7 = arg0.field368 - var6.field368;
				int var8 = arg0.field369 - var6.field369;
				if (var7 != 0 || var8 != 0) {
					arg0.field415 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.field391 != 0 || arg0.field392 != 0) && (arg0.field416 == 0 || arg0.field420 > 0)) {
			int var9 = arg0.field368 - (arg0.field391 - field1302 - field1302) * 64;
			int var10 = arg0.field369 - (arg0.field392 - field1303 - field1303) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field415 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.field391 = 0;
			arg0.field392 = 0;
		}

		int var11 = arg0.field415 - arg0.field370 & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.field370 = arg0.field415;
			} else if (var11 > 1024) {
				arg0.field370 -= 32;
			} else {
				arg0.field370 += 32;
			}

			arg0.field370 &= 0x7FF;
			if (arg0.field393 == arg0.field373 && arg0.field415 != arg0.field370) {
				if (arg0.field374 != -1) {
					arg0.field393 = arg0.field374;
					return;
				}

				arg0.field393 = arg0.field375;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method498(class26 arg0) {
		arg0.field371 = false;

		if (arg0.field393 != -1) {
			class66 var2 = class66.field978[arg0.field393];
			arg0.field395++;
			if (arg0.field394 < var2.field979 && arg0.field395 > var2.method384(arg0.field394)) {
				arg0.field395 = 0;
				arg0.field394++;
			}

			if (arg0.field394 >= var2.field979) {
				arg0.field395 = 0;
				arg0.field394 = 0;
			}
		}

		if (arg0.field401 != -1 && field1060 >= arg0.field404) {
			if (arg0.field402 < 0) {
				arg0.field402 = 0;
			}

			class66 var3 = class68.field997[arg0.field401].field1001;
			arg0.field403++;
			while (arg0.field402 < var3.field979 && arg0.field403 > var3.method384(arg0.field402)) {
				arg0.field403 -= var3.method384(arg0.field402);
				arg0.field402++;
			}

			if (arg0.field402 >= var3.field979 && (arg0.field402 < 0 || arg0.field402 >= var3.field979)) {
				arg0.field401 = -1;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 <= 1) {
			class66 var4 = class66.field978[arg0.field396];
			if (var4.field990 == 1 && arg0.field421 > 0 && arg0.field410 <= field1060 && arg0.field411 < field1060) {
				arg0.field399 = 1;
				return;
			}
		}

		if (arg0.field396 != -1 && arg0.field399 == 0) {
			class66 var5 = class66.field978[arg0.field396];
			arg0.field398++;
			while (arg0.field397 < var5.field979 && arg0.field398 > var5.method384(arg0.field397)) {
				arg0.field398 -= var5.method384(arg0.field397);
				arg0.field397++;
			}

			if (arg0.field397 >= var5.field979) {
				arg0.field397 -= var5.field983;
				arg0.field400++;
				if (arg0.field400 >= var5.field989) {
					arg0.field396 = -1;
				}

				if (arg0.field397 < 0 || arg0.field397 >= var5.field979) {
					arg0.field396 = -1;
				}
			}

			arg0.field371 = var5.field985;
		}

		if (arg0.field399 > 0) {
			arg0.field399--;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method499() {
		if (field1419) {
			field1419 = false;
			field1149.method269(0, field9, 4);
			field1150.method269(0, field9, 357);
			field1151.method269(722, field9, 4);
			field1152.method269(743, field9, 205);
			field1153.method269(0, field9, 0);
			field1154.method269(516, field9, 4);
			field1155.method269(516, field9, 205);
			field1156.method269(496, field9, 357);
			field1157.method269(0, field9, 338);
			field1057 = true;
			field1224 = true;
			field1338 = true;
			field1420 = true;

			if (field1105 != 2) {
				field1375.method269(4, field9, 4);
				field1374.method269(550, field9, 4);
			}
		}

		if (field1105 == 2) {
			method445();
		}

		if (field1413 && field1366 == 1) {
			field1057 = true;
		}

		if (field1440 != -1) {
			boolean var1 = method515(field1440, field1315);
			if (var1) {
				field1057 = true;
			}
		}

		if (field1056 == 2) {
			field1057 = true;
		}

		if (field1252 == 2) {
			field1057 = true;
		}

		if (field1057) {
			method472();
			field1057 = false;
		}

		if (field1130 == -1) {
			field1171.field76 = field1437 - field1259 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method533(false, 463, 0, field1437, field1171, field18 - 357, field17 - 17, 77);
			}

			int var2 = field1437 - field1171.field76 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field1437 - 77) {
				var2 = field1437 - 77;
			}

			if (field1259 != var2) {
				field1259 = var2;
				field1224 = true;
			}
		}

		if (field1130 != -1) {
			boolean var3 = method515(field1130, field1315);
			if (var3) {
				field1224 = true;
			}
		}

		if (field1056 == 3) {
			field1224 = true;
		}

		if (field1252 == 3) {
			field1224 = true;
		}

		if (field1244 != null) {
			field1224 = true;
		}

		if (field1413 && field1366 == 2) {
			field1224 = true;
		}

		if (field1224) {
			method525();
			field1224 = false;
		}

		if (field1105 == 2) {
			method548();
			field1374.method269(550, field9, 4);
		}

		if (field1431 != -1) {
			field1338 = true;
		}

		if (field1338) {
			if (field1431 != -1 && field1431 == field1044) {
				field1431 = -1;
				field1235.method228(171);
				field1235.method229(field1044);
			}

			field1338 = false;
			field1360.method268();
			field1351.method212(0, 0);

			if (field1440 == -1) {
				if (field1398[field1044] != -1) {
					if (field1044 == 0) {
						field1177.method212(10, 22);
					}

					if (field1044 == 1) {
						field1178.method212(8, 54);
					}

					if (field1044 == 2) {
						field1178.method212(8, 82);
					}

					if (field1044 == 3) {
						field1179.method212(8, 110);
					}

					if (field1044 == 4) {
						field1181.method212(8, 153);
					}

					if (field1044 == 5) {
						field1181.method212(8, 181);
					}

					if (field1044 == 6) {
						field1180.method212(9, 209);
					}
				}

				if (field1398[0] != -1 && (field1431 != 0 || field1060 % 20 < 10)) {
					field1256[0].method212(13, 29);
				}

				if (field1398[1] != -1 && (field1431 != 1 || field1060 % 20 < 10)) {
					field1256[1].method212(11, 53);
				}

				if (field1398[2] != -1 && (field1431 != 2 || field1060 % 20 < 10)) {
					field1256[2].method212(11, 82);
				}

				if (field1398[3] != -1 && (field1431 != 3 || field1060 % 20 < 10)) {
					field1256[3].method212(12, 115);
				}

				if (field1398[4] != -1 && (field1431 != 4 || field1060 % 20 < 10)) {
					field1256[4].method212(13, 153);
				}

				if (field1398[5] != -1 && (field1431 != 5 || field1060 % 20 < 10)) {
					field1256[5].method212(11, 180);
				}

				if (field1398[6] != -1 && (field1431 != 6 || field1060 % 20 < 10)) {
					field1256[6].method212(13, 208);
				}
			}

			field1360.method269(516, field9, 160);
			field1359.method268();
			field1350.method212(0, 0);

			if (field1440 == -1) {
				if (field1398[field1044] != -1) {
					if (field1044 == 7) {
						field1099.method212(0, 42);
					}

					if (field1044 == 8) {
						field1100.method212(0, 74);
					}

					if (field1044 == 9) {
						field1100.method212(0, 102);
					}

					if (field1044 == 10) {
						field1101.method212(1, 130);
					}

					if (field1044 == 11) {
						field1103.method212(0, 173);
					}

					if (field1044 == 12) {
						field1103.method212(0, 201);
					}

					if (field1044 == 13) {
						field1102.method212(0, 229);
					}
				}

				if (field1398[8] != -1 && (field1431 != 8 || field1060 % 20 < 10)) {
					field1256[7].method212(2, 74);
				}

				if (field1398[9] != -1 && (field1431 != 9 || field1060 % 20 < 10)) {
					field1256[8].method212(3, 102);
				}

				if (field1398[10] != -1 && (field1431 != 10 || field1060 % 20 < 10)) {
					field1256[9].method212(4, 137);
				}

				if (field1398[11] != -1 && (field1431 != 11 || field1060 % 20 < 10)) {
					field1256[10].method212(2, 174);
				}

				if (field1398[12] != -1 && (field1431 != 12 || field1060 % 20 < 10)) {
					field1256[11].method212(2, 201);
				}

				if (field1398[13] != -1 && (field1431 != 13 || field1060 % 20 < 10)) {
					field1256[12].method212(2, 226);
				}
			}

			field1359.method269(496, field9, 466);
			field1375.method268();
		}

		if (field1420) {
			field1420 = false;
			field1358.method268();
			field1349.method212(0, 0);
			field1320.method215(55, 0xFFFFFF, true, 28, "Public chat");

			if (field1241 == 0) {
				field1320.method215(55, 0xFF00, true, 41, "On");
			}

			if (field1241 == 1) {
				field1320.method215(55, 0xFFFF00, true, 41, "Friends");
			}

			if (field1241 == 2) {
				field1320.method215(55, 0xFF0000, true, 41, "Off");
			}

			if (field1241 == 3) {
				field1320.method215(55, 0xFFFF, true, 41, "Hide");
			}

			field1320.method215(184, 0xFFFFFF, true, 28, "Private chat");

			if (field1292 == 0) {
				field1320.method215(184, 0xFF00, true, 41, "On");
			}

			if (field1292 == 1) {
				field1320.method215(184, 0xFFFF00, true, 41, "Friends");
			}

			if (field1292 == 2) {
				field1320.method215(184, 0xFF0000, true, 41, "Off");
			}

			field1320.method215(324, 0xFFFFFF, true, 28, "Trade/duel");

			if (field1378 == 0) {
				field1320.method215(324, 0xFF00, true, 41, "On");
			}

			if (field1378 == 1) {
				field1320.method215(324, 0xFFFF00, true, 41, "Friends");
			}

			if (field1378 == 2) {
				field1320.method215(324, 0xFF0000, true, 41, "Off");
			}

			field1320.method215(458, 0xFFFFFF, true, 33, "Report abuse");
			field1358.method269(0, field9, 453);
			field1375.method268();
		}

		field1315 = 0;
	}

	@ObfuscatedName("client.b(IZLmb;)V")
	public final void method500(int arg0, class39 arg1) {
		field1063 = 0;
		field1165 = 0;
		method464(arg0, arg1);
		method540(arg0, arg1);
		method555(arg1, arg0);
		method473(arg0, arg1);

		for (int var3 = 0; var3 < field1063; var3++) {
			int var4 = field1064[var3];
			if (field1060 != field1162[var4].field413) {
				field1162[var4] = null;
			}
		}

		if (arg1.field623 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field623 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field1163; var5++) {
			if (field1162[field1164[var5]] == null) {
				signlink.reporterror(field1088 + " null entry in pl list - pos:" + var5 + " size:" + field1163);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method501(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field1211[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field1168[var6][var4][var5] + field1168[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field1168[var6][var4][var5 + 1] + field1168[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method502(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1409; var3++) {
				if (field1294[var3] == arg0) {
					field1409--;
					field1057 = true;

					for (int var4 = var3; var4 < field1409; var4++) {
						field1311[var4] = field1311[var4 + 1];
						field1264[var4] = field1264[var4 + 1];
						field1294[var4] = field1294[var4 + 1];
					}

					field1235.method228(157);
					field1235.method235(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method503(class41 arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field641 == 0) {
			var2 = field1257.method90(arg0.field640, arg0.field642, arg0.field643);
		}

		if (arg0.field641 == 1) {
			var2 = field1257.method91(arg0.field643, arg0.field640, arg0.field642);
		}

		if (arg0.field641 == 2) {
			var2 = field1257.method92(arg0.field640, arg0.field642, arg0.field643);
		}

		if (arg0.field641 == 3) {
			var2 = field1257.method93(arg0.field640, arg0.field642, arg0.field643);
		}

		if (var2 != 0) {
			int var6 = field1257.method94(arg0.field640, arg0.field642, arg0.field643, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field644 = var3;
		arg0.field646 = var4;
		arg0.field645 = var5;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method504(boolean arg0) {
		for (int var2 = 0; var2 < field1288; var2++) {
			class27 var3 = field1287[field1289[var2]];
			int var4 = (field1289[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method127() && var3.field422.field885 == arg0) {
				int var5 = var3.field368 >> 7;
				int var6 = var3.field369 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field372 == 1 && (var3.field368 & 0x7F) == 0x40 && (var3.field369 & 0x7F) == 0x40) {
						if (field1439[var5][var6] == field1342) {
							continue;
						}

						field1439[var5][var6] = field1342;
					}

					field1257.method75(var3, method501(field1080, var3.field368, var3.field369), field1080, var4, var3.field368, (var3.field372 - 1) * 64 + 60, var3.field369, var3.field370, var3.field371);
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method505(int arg0) {
		if (arg0 >= 0) {
			if (field1095) {
				field1095 = false;
				field1224 = true;
			}

			int var2 = field1281[arg0];
			int var3 = field1282[arg0];
			int var4 = field1283[arg0];
			int var5 = field1284[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 265) {
				class27 var6 = field1287[var5];
				if (var6 != null) {
					method453(var6.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var6.field418[0], 2, 0);
					field1126 = field24;
					field1127 = field25;
					field1129 = 2;
					field1128 = 0;
					field1235.method228(250);
					field1235.method230(var5);
					field1235.method230(field1143);
				}
			}

			if (var4 == 651) {
				class28 var7 = field1162[var5];
				if (var7 != null) {
					method453(var7.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var7.field418[0], 2, 0);
					field1126 = field24;
					field1127 = field25;
					field1129 = 2;
					field1128 = 0;
					field1235.method228(230);
					field1235.method230(var5);
					field1235.method230(field1143);
				}
			}

			if (var4 == 465) {
				field1235.method228(21);
				field1235.method230(var3);
				class4 var8 = class4.field56[var3];
				if (var8.field71 != null && var8.field71[0][0] == 5) {
					int var9 = var8.field71[0][1];
					field1066[var9] = 1 - field1066[var9];
					method541(var9);
					field1057 = true;
				}
			}

			if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
				boolean var10 = method453(var2, 0, false, 0, 0, 0, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				if (!var10) {
					method453(var2, 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				}

				field1126 = field24;
				field1127 = field25;
				field1129 = 2;
				field1128 = 0;

				if (var4 == 993) {
					field1235.method228(206);
				}

				if (var4 == 877) {
					field1235.method228(55);
				}

				if (var4 == 224) {
					field1235.method228(110);
				}

				if (var4 == 746) {
					field1235.method228(25);
				}

				if (var4 == 99) {
					field1235.method228(121);
				}

				field1235.method230(field1302 + var2);
				field1235.method230(field1303 + var3);
				field1235.method230(var5);
			}

			if (var4 == 44 && !field1392) {
				field1235.method228(96);
				field1235.method230(var3);
				field1392 = true;
			}

			if (var4 == 965) {
				boolean var12 = method453(var2, 0, false, 0, 0, 0, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				if (!var12) {
					method453(var2, 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				}

				field1126 = field24;
				field1127 = field25;
				field1129 = 2;
				field1128 = 0;
				field1235.method228(158);
				field1235.method230(field1302 + var2);
				field1235.method230(field1303 + var3);
				field1235.method230(var5);
				field1235.method230(field1143);
			}

			if (var4 == 581) {
				if ((var5 & 0x3) == 0) {
					field1186++;
				}

				if (field1186 >= 99) {
					field1235.method228(222);
					field1235.method233(0);
				}

				method510(var5, var2, 41, var3);
			}

			if (var4 == 951) {
				class4 var14 = class4.field56[var3];
				boolean var15 = true;
				if (var14.field65 > 0) {
					var15 = method443(var14);
				}

				if (var15) {
					field1235.method228(21);
					field1235.method230(var3);
				}
			}

			if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
				String var16 = field1182[arg0];
				int var17 = var16.indexOf("@whi@");
				if (var17 != -1) {
					long var18 = class52.method310(var16.substring(var17 + 5).trim());
					if (var4 == 406) {
						method457(var18);
					}

					if (var4 == 436) {
						method490(var18);
					}

					if (var4 == 557) {
						method502(var18);
					}

					if (var4 == 556) {
						method512(var18);
					}
				}
			}

			if (var4 == 391) {
				field1235.method228(72);
				field1235.method230(var5);
				field1235.method230(var2);
				field1235.method230(var3);
				field1235.method230(field1143);
				field1053 = 0;
				field1054 = var3;
				field1055 = var2;
				field1056 = 2;
				if (class4.field56[var3].field62 == field1274) {
					field1056 = 1;
				}

				if (class4.field56[var3].field62 == field1130) {
					field1056 = 3;
				}
			}

			if (var4 == 34) {
				String var20 = field1182[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					method439();
					field1432 = var20.substring(var21 + 5).trim();
					field1104 = false;

					for (int var22 = 0; var22 < class4.field56.length; var22++) {
						if (class4.field56[var22] != null && class4.field56[var22].field65 == 600) {
							field1355 = field1274 = class4.field56[var22].field62;
							break;
						}
					}
				}
			}

			if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
				class27 var23 = field1287[var5];
				if (var23 != null) {
					method453(var23.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var23.field418[0], 2, 0);
					field1126 = field24;
					field1127 = field25;
					field1129 = 2;
					field1128 = 0;

					if (var4 == 542) {
						field1235.method228(133);
					}

					if (var4 == 963) {
						field1235.method228(6);
					}

					if (var4 == 728) {
						field1235.method228(223);
					}

					if (var4 == 6) {
						if ((var5 & 0x3) == 0) {
							field1193++;
						}

						if (field1193 >= 124) {
							field1235.method228(69);
							field1235.method233(0);
						}

						field1235.method228(106);
					}

					if (var4 == 245) {
						if ((var5 & 0x3) == 0) {
							field1068++;
						}

						if (field1068 >= 85) {
							field1235.method228(61);
							field1235.method230(39596);
						}

						field1235.method228(201);
					}

					field1235.method230(var5);
				}
			}

			if (var4 == 679) {
				String var24 = field1182[arg0];
				int var25 = var24.indexOf("@whi@");
				if (var25 != -1) {
					long var26 = class52.method310(var24.substring(var25 + 5).trim());
					int var28 = -1;
					for (int var29 = 0; var29 < field1409; var29++) {
						if (field1294[var29] == var26) {
							var28 = var29;
							break;
						}
					}

					if (var28 != -1 && field1264[var28] > 0) {
						field1224 = true;
						field1095 = false;
						field1276 = true;
						field1318 = "";
						field1195 = 3;
						field1091 = field1294[var28];
						field1115 = "Enter message to send to " + field1311[var28];
					}
				}
			}

			if (var4 == 1773) {
				class60 var30 = class60.method350(var5);
				class4 var31 = class4.field56[var3];
				String var32;
				if (var31 != null && var31.field58[var2] >= 100000) {
					var32 = var31.field58[var2] + " x " + var30.field898;
				} else if (var30.field899 == null) {
					var32 = "It's a " + var30.field898 + ".";
				} else {
					var32 = new String(var30.field899);
				}

				method454(0, var32, "");
			}

			if (var4 == 367) {
				class28 var33 = field1162[var5];
				if (var33 != null) {
					method453(var33.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var33.field418[0], 2, 0);
					field1126 = field24;
					field1127 = field25;
					field1129 = 2;
					field1128 = 0;
					field1235.method228(143);
					field1235.method230(var5);
					field1235.method230(field1402);
					field1235.method230(field1400);
					field1235.method230(field1401);
				}
			}

			if (var4 == 660) {
				if (field1413) {
					field1257.method102(var2 - 4, var3 - 4);
				} else {
					field1257.method102(field24 - 4, field25 - 4);
				}
			}

			if (var4 == 1607) {
				class27 var34 = field1287[var5];
				if (var34 != null) {
					String var35;
					if (var34.field422.field866 == null) {
						var35 = "It's a " + var34.field422.field865 + ".";
					} else {
						var35 = new String(var34.field422.field866);
					}

					method454(0, var35, "");
				}
			}

			if (var4 == 900) {
				class27 var36 = field1287[var5];
				if (var36 != null) {
					method453(var36.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var36.field418[0], 2, 0);
					field1126 = field24;
					field1127 = field25;
					field1129 = 2;
					field1128 = 0;
					field1235.method228(247);
					field1235.method230(var5);
					field1235.method230(field1402);
					field1235.method230(field1400);
					field1235.method230(field1401);
				}
			}

			if (var4 == 55 && method510(var5, var2, 175, var3)) {
				field1235.method230(field1143);
			}

			if (var4 == 217) {
				boolean var37 = method453(var2, 0, false, 0, 0, 0, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				if (!var37) {
					method453(var2, 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var3, 2, 0);
				}

				field1126 = field24;
				field1127 = field25;
				field1129 = 2;
				field1128 = 0;
				field1235.method228(23);
				field1235.method230(field1302 + var2);
				field1235.method230(field1303 + var3);
				field1235.method230(var5);
				field1235.method230(field1402);
				field1235.method230(field1400);
				field1235.method230(field1401);
			}

			if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
				if (var4 == 596) {
					field1235.method228(181);
				}

				if (var4 == 22) {
					field1235.method228(168);
				}

				if (var4 == 892) {
					if ((var2 & 0x3) == 0) {
						field1247++;
					}

					if (field1247 >= 130) {
						field1235.method228(193);
						field1235.method229(177);
					}

					field1235.method228(134);
				}

				if (var4 == 602) {
					field1235.method228(82);
				}

				if (var4 == 415) {
					if ((var3 & 0x3) == 0) {
						field1148++;
					}

					if (field1148 >= 55) {
						field1235.method228(104);
						field1235.method233(0);
					}

					field1235.method228(30);
				}

				field1235.method230(var5);
				field1235.method230(var2);
				field1235.method230(var3);
				field1053 = 0;
				field1054 = var3;
				field1055 = var2;
				field1056 = 2;
				if (class4.field56[var3].field62 == field1274) {
					field1056 = 1;
				}

				if (class4.field56[var3].field62 == field1130) {
					field1056 = 3;
				}
			}

			if (var4 == 1102) {
				class60 var39 = class60.method350(var5);
				String var40;
				if (var39.field899 == null) {
					var40 = "It's a " + var39.field898 + ".";
				} else {
					var40 = new String(var39.field899);
				}

				method454(0, var40, "");
			}

			if (var4 == 947) {
				method439();
			}

			if (var4 == 450 && method510(var5, var2, 8, var3)) {
				field1235.method230(field1402);
				field1235.method230(field1400);
				field1235.method230(field1401);
			}

			if (var4 == 1175) {
				int var41 = var5 >> 14 & 0x7FFF;
				class57 var42 = class57.method334(var41);
				String var43;
				if (var42.field821 == null) {
					var43 = "It's a " + var42.field820 + ".";
				} else {
					var43 = new String(var42.field821);
				}

				method454(0, var43, "");
			}

			if (var4 == 188) {
				field1399 = 1;
				field1400 = var2;
				field1401 = var3;
				field1402 = var5;
				field1403 = class60.method350(var5).field898;
				field1142 = 0;
				field1057 = true;
			} else {
				if (var4 == 285) {
					method510(var5, var2, 7, var3);
				}

				if (var4 == 930) {
					class4 var44 = class4.field56[var3];
					field1142 = 1;
					field1143 = var3;
					field1144 = var44.field116;
					field1399 = 0;
					field1057 = true;
					String var45 = var44.field114;
					if (var45.indexOf(" ") != -1) {
						var45 = var45.substring(0, var45.indexOf(" "));
					}

					String var46 = var44.field114;
					if (var46.indexOf(" ") != -1) {
						var46 = var46.substring(var46.indexOf(" ") + 1);
					}

					field1145 = var45 + " " + var44.field115 + " " + var46;

					if (field1144 == 16) {
						field1057 = true;
						field1044 = 3;
						field1338 = true;
					}
				} else {
					if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
						class28 var47 = field1162[var5];
						if (var47 != null) {
							method453(var47.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var47.field418[0], 2, 0);
							field1126 = field24;
							field1127 = field25;
							field1129 = 2;
							field1128 = 0;

							if (var4 == 1544) {
								field1235.method228(184);
							}

							if (var4 == 1101) {
								field1235.method228(220);
							}

							if (var4 == 151) {
								field1415++;
								if (field1415 >= 90) {
									field1235.method228(162);
									field1235.method230(31114);
								}

								field1235.method228(239);
							}

							if (var4 == 1373) {
								field1235.method228(234);
							}

							field1235.method230(var5);
						}
					}

					if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
						if (var4 == 347) {
							field1235.method228(68);
						}

						if (var4 == 478) {
							if ((var2 & 0x3) == 0) {
								field1417++;
							}

							if (field1417 >= 90) {
								field1235.method228(62);
							}

							field1235.method228(101);
						}

						if (var4 == 405) {
							field1114 += var5;
							if (field1114 >= 97) {
								field1235.method228(131);
								field1235.method232(0xE42D58);
							}

							field1235.method228(154);
						}

						if (var4 == 422) {
							field1235.method228(177);
						}

						if (var4 == 38) {
							field1235.method228(196);
						}

						field1235.method230(var5);
						field1235.method230(var2);
						field1235.method230(var3);
						field1053 = 0;
						field1054 = var3;
						field1055 = var2;
						field1056 = 2;
						if (class4.field56[var3].field62 == field1274) {
							field1056 = 1;
						}

						if (class4.field56[var3].field62 == field1130) {
							field1056 = 3;
						}
					}

					if (var4 == 881) {
						field1235.method228(130);
						field1235.method230(var5);
						field1235.method230(var2);
						field1235.method230(var3);
						field1235.method230(field1402);
						field1235.method230(field1400);
						field1235.method230(field1401);
						field1053 = 0;
						field1054 = var3;
						field1055 = var2;
						field1056 = 2;
						if (class4.field56[var3].field62 == field1274) {
							field1056 = 1;
						}

						if (class4.field56[var3].field62 == field1130) {
							field1056 = 3;
						}
					}

					if (var4 == 504) {
						method510(var5, var2, 105, var3);
					}

					if (var4 == 364) {
						method510(var5, var2, 192, var3);
					}

					if (var4 == 903 || var4 == 363) {
						String var48 = field1182[arg0];
						int var49 = var48.indexOf("@whi@");
						if (var49 != -1) {
							var48 = var48.substring(var49 + 5).trim();
							String var50 = class52.method314(class52.method311(class52.method310(var48)));
							boolean var51 = false;
							for (int var52 = 0; var52 < field1163; var52++) {
								class28 var53 = field1162[field1164[var52]];
								if (var53 != null && var53.field423 != null && var53.field423.equalsIgnoreCase(var50)) {
									method453(var53.field417[0], 1, false, 0, 0, 1, field1377.field417[0], field1377.field418[0], var53.field418[0], 2, 0);

									if (var4 == 903) {
										field1235.method228(234);
									}

									if (var4 == 363) {
										field1235.method228(220);
									}

									field1235.method230(field1164[var52]);
									var51 = true;
									break;
								}
							}

							if (!var51) {
								method454(0, "Unable to find " + var50, "");
							}
						}
					}

					if (var4 == 960) {
						field1235.method228(21);
						field1235.method230(var3);
						class4 var54 = class4.field56[var3];
						if (var54.field71 != null && var54.field71[0][0] == 5) {
							int var55 = var54.field71[0][1];
							if (field1066[var55] != var54.field73[0]) {
								field1066[var55] = var54.field73[0];
								method541(var55);
								field1057 = true;
							}
						}
					}

					if (var4 == 1501) {
						field1245 += field1303;
						if (field1245 >= 92) {
							field1235.method228(91);
							field1235.method233(0);
						}

						method510(var5, var2, 169, var3);
					}

					field1399 = 0;
					field1142 = 0;
					field1057 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method506() {
		if (field1147 >= 2 || field1399 != 0 || field1142 != 0) {
			String var1;
			if (field1399 == 1 && field1147 < 2) {
				var1 = "Use " + field1403 + " with...";
			} else if (field1142 == 1 && field1147 < 2) {
				var1 = field1145 + "...";
			} else {
				var1 = field1182[field1147 - 1];
			}

			if (field1147 > 2) {
				var1 = var1 + "@whi@ / " + (field1147 - 2) + " more options";
			}

			field1321.method220(true, 4, 15, 0xFFFFFF, field1060 / 1000, var1);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method507() {
		if (field1227 != 0) {
			class38 var1 = field1320;
			int var2 = 0;
			if (field1111 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1429[var3] != null) {
					int var4 = field1427[var3];
					String var5 = field1428[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1292 == 0 || field1292 == 1 && method480(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method217(var8, "From", var7, 0);
						var1.method217(var8, "From", var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method216("From ");
						if (var6 == 1) {
							field1407[0].method212(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field1407[1].method212(var7 - 12, var11);
							var11 += 14;
						}

						var1.method217(var11, var5 + ": " + field1429[var3], var7, 0);
						var1.method217(var11, var5 + ": " + field1429[var3], var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field1292 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method217(4, field1429[var3], var9, 0);
						var1.method217(4, field1429[var3], var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field1292 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method217(4, "To " + var5 + ": " + field1429[var3], var10, 0);
						var1.method217(4, "To " + var5 + ": " + field1429[var3], var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field1146 != null) {
				field1146.method38();
			}
		} catch (Exception var1) {
		}

		field1146 = null;
		method559();

		if (field1404 != null) {
			field1404.field854 = false;
		}

		field1404 = null;
		field1207.method281();
		field1207 = null;
		field1235 = null;
		field1159 = null;
		field1444 = null;
		field1260 = null;
		field1425 = null;
		field1279 = null;
		field1261 = null;
		field1262 = null;
		field1168 = null;
		field1211 = null;
		field1257 = null;
		field1067 = null;
		field1117 = null;
		field1263 = null;
		field1363 = null;
		field1364 = null;
		field1087 = null;
		field1373 = null;
		field1374 = null;
		field1375 = null;
		field1376 = null;
		field1358 = null;
		field1359 = null;
		field1360 = null;
		field1149 = null;
		field1150 = null;
		field1151 = null;
		field1152 = null;
		field1153 = null;
		field1154 = null;
		field1155 = null;
		field1156 = null;
		field1157 = null;
		field1441 = null;
		field1442 = null;
		field1443 = null;
		field1349 = null;
		field1350 = null;
		field1351 = null;
		field1256 = null;
		field1177 = null;
		field1178 = null;
		field1179 = null;
		field1180 = null;
		field1181 = null;
		field1099 = null;
		field1100 = null;
		field1101 = null;
		field1102 = null;
		field1103 = null;
		field1214 = null;
		field1183 = null;
		field1090 = null;
		field1436 = null;
		field1216 = null;
		field1217 = null;
		field1218 = null;
		field1219 = null;
		field1197 = null;
		field1397 = null;
		field1439 = null;
		field1162 = null;
		field1164 = null;
		field1166 = null;
		field1167 = null;
		field1064 = null;
		field1287 = null;
		field1289 = null;
		field1265 = null;
		field1109 = null;
		field1196 = null;
		field1405 = null;
		field1281 = null;
		field1282 = null;
		field1283 = null;
		field1284 = null;
		field1182 = null;
		field1066 = null;
		field1313 = null;
		field1314 = null;
		field1423 = null;
		field1071 = null;
		field1311 = null;
		field1294 = null;
		field1264 = null;
		field1134 = null;
		field1135 = null;
		field1131 = null;
		field1132 = null;
		field1133 = null;
		field1136 = null;
		field1137 = null;
		field1138 = null;
		field1139 = null;
		method442();
		class57.method333();
		class59.method343();
		class60.method349();
		class63.field945 = null;
		class64.field958 = null;
		class4.field56 = null;
		class65.field965 = null;
		class66.field978 = null;
		class68.field997 = null;
		class68.field1009 = null;
		class70.field1017 = null;
		field10 = null;
		class28.field444 = null;
		class35.method177();
		class19.method63();
		class32.method135();
		class8.method60();
		System.gc();
	}

	@ObfuscatedName("client.b(ILmb;Z)V")
	public final void method508(int arg0, class39 arg1) {
		if (arg0 == 84 || arg0 == 112) {
			int var3 = arg1.method239();
			int var4 = (var3 >> 4 & 0x7) + field1239;
			int var5 = (var3 & 0x7) + field1240;
			int var6 = arg1.method239();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1414[var7];
			int var10;
			if (arg0 == 112) {
				var10 = -1;
			} else {
				var10 = arg1.method241();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method468(field1080, var7, var5, 0, -1, var8, var9, var4, var10);
			}
		} else if (arg0 == 117) {
			int var11 = arg1.method239();
			int var12 = (var11 >> 4 & 0x7) + field1239;
			int var13 = (var11 & 0x7) + field1240;
			int var14 = arg1.method239();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1414[var15];
			int var18 = arg1.method241();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = field1168[field1080][var12][var13];
				int var20 = field1168[field1080][var12 + 1][var13];
				int var21 = field1168[field1080][var12 + 1][var13 + 1];
				int var22 = field1168[field1080][var12][var13 + 1];
				if (var17 == 0) {
					class18 var23 = field1257.method86(var13, field1080, var12);
					if (var23 != null) {
						int var24 = var23.field264 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field262 = new class29(var21, var16 + 4, var24, var20, var19, 2, false, var22, var18);
							var23.field263 = new class29(var21, var16 + 1 & 0x3, var24, var20, var19, 2, false, var22, var18);
						} else {
							var23.field262 = new class29(var21, var16, var24, var20, var19, var15, false, var22, var18);
						}
					}
				}

				if (var17 == 1) {
					class9 var25 = field1257.method87(var12, field1080, var13);
					if (var25 != null) {
						var25.field155 = new class29(var21, 0, var25.field156 >> 14 & 0x7FFF, var20, var19, 4, false, var22, var18);
					}
				}

				if (var17 == 2) {
					class17 var26 = field1257.method88(var12, field1080, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.field247 = new class29(var21, var16, var26.field255 >> 14 & 0x7FFF, var20, var19, var15, false, var22, var18);
					}
				}

				if (var17 == 3) {
					class11 var27 = field1257.method89(field1080, var12, var13);
					if (var27 != null) {
						var27.field186 = new class29(var21, var16, var27.field187 >> 14 & 0x7FFF, var20, var19, 22, false, var22, var18);
					}
				}
			}
		} else if (arg0 == 38) {
			int var28 = arg1.method239();
			int var29 = (var28 >> 4 & 0x7) + field1239;
			int var30 = (var28 & 0x7) + field1240;
			int var31 = arg1.method241();
			int var32 = arg1.method241();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				class30 var33 = new class30();
				var33.field455 = var31;
				var33.field456 = var32;

				if (field1265[field1080][var29][var30] == null) {
					field1265[field1080][var29][var30] = new class42();
				}

				field1265[field1080][var29][var30].method255(var33);
				method527(var29, var30);
			}
		} else if (arg0 == 174) {
			int var34 = arg1.method239();
			int var35 = (var34 >> 4 & 0x7) + field1239;
			int var36 = (var34 & 0x7) + field1240;
			int var37 = arg1.method241();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				class42 var38 = field1265[field1080][var35][var36];
				if (var38 != null) {
					for (class30 var39 = (class30) var38.method258(); var39 != null; var39 = (class30) var38.method260()) {
						if ((var37 & 0x7FFF) == var39.field455) {
							var39.method120();
							break;
						}
					}

					if (var38.method258() == null) {
						field1265[field1080][var35][var36] = null;
					}

					method527(var35, var36);
				}
			}
		} else if (arg0 == 146) {
			int var40 = arg1.method239();
			int var41 = (var40 >> 4 & 0x7) + field1239;
			int var42 = (var40 & 0x7) + field1240;
			int var43 = var41 + arg1.method240();
			int var44 = var42 + arg1.method240();
			int var45 = arg1.method242();
			int var46 = arg1.method241();
			int var47 = arg1.method239() * 4;
			int var48 = arg1.method239() * 4;
			int var49 = arg1.method241();
			int var50 = arg1.method241();
			int var51 = arg1.method239();
			int var52 = arg1.method239();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				class31 var53 = new class31(field1060 + var49, field1080, var52, field1060 + var50, var48, var41, var51, var42, var45, var46, method501(field1080, var41, var42) - var47);
				var53.method133(field1060 + var49, var43, var44, method501(field1080, var43, var44) - var48);
				field1196.method255(var53);
			}
		} else if (arg0 == 82) {
			int var54 = arg1.method239();
			int var55 = (var54 >> 4 & 0x7) + field1239;
			int var56 = (var54 & 0x7) + field1240;
			int var57 = arg1.method241();
			int var58 = arg1.method239();
			int var59 = arg1.method241();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				class33 var60 = new class33(field1080, var57, field1060, method501(field1080, var55, var56) - var58, var55, var56, var59);
				field1405.method255(var60);
			}
		} else if (arg0 == 31) {
			int var61 = arg1.method239();
			int var62 = (var61 >> 4 & 0x7) + field1239;
			int var63 = (var61 & 0x7) + field1240;
			int var64 = arg1.method241();
			int var65 = arg1.method241();
			int var66 = arg1.method241();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && field1094 != var66) {
				class30 var67 = new class30();
				var67.field455 = var64;
				var67.field456 = var65;

				if (field1265[field1080][var62][var63] == null) {
					field1265[field1080][var62][var63] = new class42();
				}

				field1265[field1080][var62][var63].method255(var67);
				method527(var62, var63);
			}
		} else if (arg0 == 125) {
			int var68 = arg1.method239();
			int var69 = (var68 >> 4 & 0x7) + field1239;
			int var70 = (var68 & 0x7) + field1240;
			int var71 = arg1.method239();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = field1414[var72];
			int var75 = arg1.method241();
			int var76 = arg1.method241();
			int var77 = arg1.method241();
			int var78 = arg1.method241();
			byte var79 = arg1.method240();
			byte var80 = arg1.method240();
			byte var81 = arg1.method240();
			byte var82 = arg1.method240();
			class28 var83;
			if (field1094 == var78) {
				var83 = field1377;
			} else {
				var83 = field1162[var78];
			}

			if (var83 != null) {
				class57 var84 = class57.method334(var75);
				int var85 = field1168[field1080][var69][var70];
				int var86 = field1168[field1080][var69 + 1][var70];
				int var87 = field1168[field1080][var69 + 1][var70 + 1];
				int var88 = field1168[field1080][var69][var70 + 1];
				class32 var89 = var84.method340(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					method468(field1080, 0, var70, var76 + 1, var77 + 1, 0, var74, var69, -1);
					var83.field432 = field1060 + var76;
					var83.field433 = field1060 + var77;
					var83.field437 = var89;
					int var90 = var84.field824;
					int var91 = var84.field825;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.field825;
						var91 = var84.field824;
					}

					var83.field434 = var69 * 128 + var90 * 64;
					var83.field436 = var70 * 128 + var91 * 64;
					var83.field435 = method501(field1080, var83.field434, var83.field436);

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

					var83.field438 = var69 + var79;
					var83.field440 = var69 + var81;
					var83.field439 = var70 + var80;
					var83.field441 = var70 + var82;
				}
			}
		} else if (arg0 == 106) {
			int var94 = arg1.method239();
			int var95 = (var94 >> 4 & 0x7) + field1239;
			int var96 = (var94 & 0x7) + field1240;
			int var97 = arg1.method241();
			int var98 = arg1.method241();
			int var99 = arg1.method241();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				class42 var100 = field1265[field1080][var95][var96];
				if (var100 != null) {
					for (class30 var101 = (class30) var100.method258(); var101 != null; var101 = (class30) var100.method260()) {
						if ((var97 & 0x7FFF) == var101.field455 && var101.field456 == var98) {
							var101.field456 = var99;
							break;
						}
					}

					method527(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method509(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field1225 = "";
				field1226 = "Connecting to server...";
				method545(true);
			}

			field1146 = new class5(method519(field1174 + 43594), this);
			long var4 = class52.method310(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field1235.field623 = 0;
			field1235.method229(14);
			field1235.method229(var6);
			field1146.method42(field1235.field622, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field1146.method39();
			}

			int var8 = field1146.method39();
			if (var8 == 0) {
				field1146.method41(field1444.field622, 0, 8);
				field1444.field623 = 0;
				field1385 = field1444.method245();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1385 >> 32), (int) field1385 };
				field1235.field623 = 0;
				field1235.method229(10);
				field1235.method233(var9[0]);
				field1235.method233(var9[1]);
				field1235.method233(var9[2]);
				field1235.method233(var9[3]);
				field1235.method233(signlink.uid);
				field1235.method236(arg0);
				field1235.method236(arg1);
				field1235.method254(field1158, field1395);
				field1159.field623 = 0;

				if (arg2) {
					field1159.method229(18);
				} else {
					field1159.method229(16);
				}

				field1159.method229(field1235.field623 + 36 + 1 + 1);
				field1159.method229(252);
				field1159.method229(field1176 ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					field1159.method233(field1347[var10]);
				}

				field1159.method237(field1235.field622, 0, field1235.field623);
				field1235.field627 = new class50(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				field1112 = new class50(var9);
				field1146.method42(field1159.field622, 0, field1159.field623);
				var8 = field1146.method39();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var20) {
				}

				method509(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1140 = field1146.method39();
				field1421 = field1146.method39() == 1;
				class6.method45();
				field1422 = 0L;
				field1306 = 0;
				field1404.field856 = 0;
				field14 = true;
				field1353 = true;
				field1301 = true;
				field1235.field623 = 0;
				field1444.field623 = 0;
				field1040 = -1;
				field1433 = -1;
				field1434 = -1;
				field1435 = -1;
				field1039 = 0;
				field1041 = 0;
				field1111 = 0;
				field1043 = 0;
				field1267 = 0;
				field1246 = 0;
				field1147 = 0;
				field1413 = false;
				field15 = 0;

				for (int var12 = 0; var12 < 100; var12++) {
					field1429[var12] = null;
				}

				field1399 = 0;
				field1142 = 0;
				field1105 = 0;
				field1169 = 0;
				field1324 = (int) (Math.random() * 100.0D) - 50;
				field1073 = (int) (Math.random() * 110.0D) - 55;
				field1411 = (int) (Math.random() * 80.0D) - 40;
				field1268 = (int) (Math.random() * 120.0D) - 60;
				field1236 = (int) (Math.random() * 30.0D) - 20;
				field1200 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field1339 = -1;
				field1069 = 0;
				field1070 = 0;
				field1163 = 0;
				field1288 = 0;

				for (int var13 = 0; var13 < field1160; var13++) {
					field1162[var13] = null;
					field1167[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					field1287[var14] = null;
				}

				field1377 = field1162[field1161] = new class28();
				field1196.method262();
				field1405.method262();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1265[var15][var16][var17] = null;
						}
					}
				}

				field1109 = new class42();
				field1410 = 0;
				field1409 = 0;
				field1286 = -1;
				field1130 = -1;
				field1274 = -1;
				field1440 = -1;
				field1229 = -1;
				field1392 = false;
				field1044 = 3;
				field1095 = false;
				field1413 = false;
				field1276 = false;
				field1244 = null;
				field1348 = 0;
				field1431 = -1;
				field1424 = true;
				method456();

				for (int var18 = 0; var18 < 5; var18++) {
					field1079[var18] = 0;
				}

				field1186 = 0;
				field1193 = 0;
				field1114 = 0;
				field1068 = 0;
				field1417 = 0;
				field1245 = 0;
				field1148 = 0;
				field1415 = 0;
				field1247 = 0;
				method479();
			} else if (var8 == 3) {
				field1225 = "";
				field1226 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1225 = "Your account has been disabled.";
				field1226 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1225 = "Your account is already logged in.";
				field1226 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1225 = "RuneScape has been updated!";
				field1226 = "Please reload this page.";
			} else if (var8 == 7) {
				field1225 = "This world is full.";
				field1226 = "Please use a different world.";
			} else if (var8 == 8) {
				field1225 = "Unable to connect.";
				field1226 = "Login server offline.";
			} else if (var8 == 9) {
				field1225 = "Login limit exceeded.";
				field1226 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1225 = "Unable to connect.";
				field1226 = "Bad session id.";
			} else if (var8 == 11) {
				field1226 = "Login server rejected session.";
				field1226 = "Please try again.";
			} else if (var8 == 12) {
				field1225 = "You need a members account to login to this world.";
				field1226 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1225 = "Could not complete login.";
				field1226 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1225 = "The server is being updated.";
				field1226 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field1301 = true;
				field1235.field623 = 0;
				field1444.field623 = 0;
				field1040 = -1;
				field1433 = -1;
				field1434 = -1;
				field1435 = -1;
				field1039 = 0;
				field1041 = 0;
				field1111 = 0;
				field1147 = 0;
				field1413 = false;
				field1072 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1225 = "Login attempts exceeded.";
				field1226 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1225 = "You are standing in a members-only area.";
				field1226 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1225 = "Invalid loginserver requested";
				field1226 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var19 = field1146.method39(); var19 >= 0; var19--) {
					field1225 = "You have only just left another world";
					field1226 = "Your profile will be transfered in: " + var19 + " seconds";
					method545(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var21) {
					}
				}

				method509(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1225 = "No response from server";
				field1226 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1225 = "Unexpected server response";
				field1226 = "Please try using a different world.";
			}
		} catch (IOException var22) {
			field1225 = "";
			field1226 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method510(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = field1257.method94(field1080, arg1, arg3, arg0);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			class57 var9 = class57.method334(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field824;
				var11 = var9.field825;
			} else {
				var10 = var9.field825;
				var11 = var9.field824;
			}

			int var12 = var9.field847;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			method453(arg1, var11, false, 0, var12, var10, field1377.field417[0], field1377.field418[0], arg3, 2, 0);
		} else {
			method453(arg1, 0, false, var7 + 1, 0, 0, field1377.field417[0], field1377.field418[0], arg3, 2, var8);
		}

		field1126 = field24;
		field1127 = field25;
		field1129 = 2;
		field1128 = 0;
		field1235.method228(arg2);
		field1235.method230(field1302 + arg1);
		field1235.method230(field1303 + arg3);
		field1235.method230(var5);
		return true;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = class32.field550[var7];
			int var13 = class32.field551[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = class32.field550[var8];
			int var16 = class32.field551[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field1121 = arg0 - var9;
		field1122 = arg3 - var10;
		field1123 = arg2 - var11;
		field1124 = arg5;
		field1125 = arg1;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(JZ)V")
	public final void method512(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field1379; var3++) {
				if (field1234[var3] == arg0) {
					field1379--;
					field1057 = true;

					for (int var4 = var3; var4 < field1379; var4++) {
						field1234[var4] = field1234[var4 + 1];
					}

					field1235.method228(74);
					field1235.method235(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method513(class4 arg0) {
		if (arg0.field72 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field72.length; var2++) {
			int var3 = method485(var2, arg0);
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

	@ObfuscatedName("client.a(IIILjb;)V")
	public final void method514(int arg0, int arg1, class36 arg2) {
		int var4 = field1268 + field1200 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = class32.field550[var4];
			int var7 = class32.field551[var4];
			var6 = var6 * 256 / (field1236 + 256);
			var7 = var7 * 256 / (field1236 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method205(var8 + 94 + 4 - arg2.field601 / 2, 83 - var9 - arg2.field602 / 2 - 4, field1442);
			} else {
				arg2.method199(83 - var9 - arg2.field602 / 2 - 4, var8 + 94 - arg2.field601 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)Z")
	public final boolean method515(int arg0, int arg1) {
		boolean var3 = false;
		class4 var4 = class4.field56[arg0];
		for (int var5 = 0; var5 < var4.field78.length && var4.field78[var5] != -1; var5++) {
			class4 var6 = class4.field56[var4.field78[var5]];
			if (var6.field63 == 1) {
				var3 |= method515(var6.field61, arg1);
			}

			if (var6.field63 == 6 && (var6.field109 != -1 || var6.field110 != -1)) {
				boolean var7 = method513(var6);
				int var8;
				if (var7) {
					var8 = var6.field110;
				} else {
					var8 = var6.field109;
				}

				if (var8 != -1) {
					class66 var9 = class66.field978[var8];
					var6.field60 += arg1;
					while (var6.field60 > var9.method384(var6.field59)) {
						var6.field60 -= var9.method384(var6.field59) + 1;
						var6.field59++;
						if (var6.field59 >= var9.field979) {
							var6.field59 -= var9.field983;
							if (var6.field59 < 0 || var6.field59 >= var9.field979) {
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

	@ObfuscatedName("client.a(IIIIIILd;)V")
	public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, class4 arg5) {
		if (arg5.field63 == 0 && arg5.field78 != null && !arg5.field77 && (arg4 >= arg2 && arg1 >= arg3 && arg4 <= arg5.field66 + arg2 && arg1 <= arg5.field67 + arg3)) {
			int var7 = arg5.field78.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg5.field79[var8] + arg2;
				int var10 = arg5.field80[var8] + arg3 - arg0;
				class4 var11 = class4.field56[arg5.field78[var8]];
				var9 += var11.field69;
				var10 += var11.field70;
				if ((var11.field74 >= 0 || var11.field101 != 0) && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
					if (var11.field74 >= 0) {
						field1113 = var11.field74;
					} else {
						field1113 = var11.field61;
					}
				}

				if (var11.field63 == 0) {
					method516(var11.field76, arg1, var9, var10, arg4, var11);

					if (var11.field75 > var11.field67) {
						method533(true, var11.field66 + var9, var10, var11.field75, var11, arg1, arg4, var11.field67);
					}
				} else {
					if (var11.field64 == 1 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						boolean var12 = false;
						if (var11.field65 != 0) {
							var12 = method537(var11);
						}

						if (!var12) {
							field1182[field1147] = var11.field117;
							field1283[field1147] = 951;
							field1282[field1147] = var11.field61;
							field1147++;
						}
					}

					if (var11.field64 == 2 && field1142 == 0 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						String var13 = var11.field114;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field1182[field1147] = var13 + " @gre@" + var11.field115;
						field1283[field1147] = 930;
						field1282[field1147] = var11.field61;
						field1147++;
					}

					if (var11.field64 == 3 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						field1182[field1147] = "Close";
						field1283[field1147] = 947;
						field1282[field1147] = var11.field61;
						field1147++;
					}

					if (var11.field64 == 4 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						field1182[field1147] = var11.field117;
						field1283[field1147] = 465;
						field1282[field1147] = var11.field61;
						field1147++;
					}

					if (var11.field64 == 5 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						field1182[field1147] = var11.field117;
						field1283[field1147] = 960;
						field1282[field1147] = var11.field61;
						field1147++;
					}

					if (var11.field64 == 6 && !field1392 && arg4 >= var9 && arg1 >= var10 && arg4 < var11.field66 + var9 && arg1 < var11.field67 + var10) {
						field1182[field1147] = var11.field117;
						field1283[field1147] = 44;
						field1282[field1147] = var11.field61;
						field1147++;
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

								if (arg4 >= var17 && arg1 >= var18 && arg4 < var17 + 32 && arg1 < var18 + 32) {
									field1096 = var14;
									field1097 = var11.field61;

									if (var11.field57[var14] > 0) {
										class60 var19 = class60.method350(var11.field57[var14] - 1);
										if (field1399 == 1 && var11.field84) {
											if (field1401 != var11.field61 || field1400 != var14) {
												field1182[field1147] = "Use " + field1403 + " with @lre@" + var19.field898;
												field1283[field1147] = 881;
												field1284[field1147] = var19.field896;
												field1281[field1147] = var14;
												field1282[field1147] = var11.field61;
												field1147++;
											}
										} else if (field1142 != 1 || !var11.field84) {
											if (var11.field84) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field913 != null && var19.field913[var20] != null) {
														field1182[field1147] = var19.field913[var20] + " @lre@" + var19.field898;

														if (var20 == 3) {
															field1283[field1147] = 478;
														}

														if (var20 == 4) {
															field1283[field1147] = 347;
														}

														field1284[field1147] = var19.field896;
														field1281[field1147] = var14;
														field1282[field1147] = var11.field61;
														field1147++;
													} else if (var20 == 4) {
														field1182[field1147] = "Drop @lre@" + var19.field898;
														field1283[field1147] = 347;
														field1284[field1147] = var19.field896;
														field1281[field1147] = var14;
														field1282[field1147] = var11.field61;
														field1147++;
													}
												}
											}

											if (var11.field85) {
												field1182[field1147] = "Use @lre@" + var19.field898;
												field1283[field1147] = 188;
												field1284[field1147] = var19.field896;
												field1281[field1147] = var14;
												field1282[field1147] = var11.field61;
												field1147++;
											}

											if (var11.field84 && var19.field913 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field913[var21] != null) {
														field1182[field1147] = var19.field913[var21] + " @lre@" + var19.field898;

														if (var21 == 0) {
															field1283[field1147] = 405;
														}

														if (var21 == 1) {
															field1283[field1147] = 38;
														}

														if (var21 == 2) {
															field1283[field1147] = 422;
														}

														field1284[field1147] = var19.field896;
														field1281[field1147] = var14;
														field1282[field1147] = var11.field61;
														field1147++;
													}
												}
											}

											if (var11.field92 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field92[var22] != null) {
														field1182[field1147] = var11.field92[var22] + " @lre@" + var19.field898;

														if (var22 == 0) {
															field1283[field1147] = 602;
														}

														if (var22 == 1) {
															field1283[field1147] = 596;
														}

														if (var22 == 2) {
															field1283[field1147] = 22;
														}

														if (var22 == 3) {
															field1283[field1147] = 892;
														}

														if (var22 == 4) {
															field1283[field1147] = 415;
														}

														field1284[field1147] = var19.field896;
														field1281[field1147] = var14;
														field1282[field1147] = var11.field61;
														field1147++;
													}
												}
											}

											field1182[field1147] = "Examine @lre@" + var19.field898;
											field1283[field1147] = 1773;
											field1284[field1147] = var19.field896;
											field1281[field1147] = var14;
											field1282[field1147] = var11.field61;
											field1147++;
										} else if ((field1144 & 0x10) == 0x10) {
											field1182[field1147] = field1145 + " @lre@" + var19.field898;
											field1283[field1147] = 391;
											field1284[field1147] = var19.field896;
											field1281[field1147] = var14;
											field1282[field1147] = var11.field61;
											field1147++;
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

	@ObfuscatedName("client.l(Z)I")
	public final int method517() {
		int var1 = 3;
		if (field1124 < 310) {
			int var2 = field1121 >> 7;
			int var3 = field1123 >> 7;
			int var4 = field1377.field368 >> 7;
			int var5 = field1377.field369 >> 7;

			if ((field1211[field1080][var2][var3] & 0x4) != 0) {
				var1 = field1080;
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

					if ((field1211[field1080][var2][var3] & 0x4) != 0) {
						var1 = field1080;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field1211[field1080][var2][var3] & 0x4) != 0) {
							var1 = field1080;
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

					if ((field1211[field1080][var2][var3] & 0x4) != 0) {
						var1 = field1080;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field1211[field1080][var2][var3] & 0x4) != 0) {
							var1 = field1080;
						}
					}
				}
			}
		}

		if ((field1211[field1080][field1377.field368 >> 7][field1377.field369 >> 7] & 0x4) != 0) {
			var1 = field1080;
		}

		return var1;
	}

	@ObfuscatedName("client.w(I)I")
	public final int method518() {
		int var1 = method501(field1080, field1121, field1123);
		if (var1 - field1122 < 800 && (field1211[field1080][field1121 >> 7][field1123 >> 7] & 0x4) != 0) {
			return field1080;
		}

		return 3;
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method519(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.l(B)V")
	public final void method520() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field1241 = (field1241 + 1) % 4;
				field1420 = true;
				field1224 = true;
				field1235.method228(94);
				field1235.method229(field1241);
				field1235.method229(field1292);
				field1235.method229(field1378);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field1292 = (field1292 + 1) % 3;
				field1420 = true;
				field1224 = true;
				field1235.method228(94);
				field1235.method229(field1241);
				field1235.method229(field1292);
				field1235.method229(field1378);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field1378 = (field1378 + 1) % 3;
				field1420 = true;
				field1224 = true;
				field1235.method228(94);
				field1235.method229(field1241);
				field1235.method229(field1292);
				field1235.method229(field1378);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				method439();
				field1432 = "";
				field1104 = false;

				for (int var1 = 0; var1 < class4.field56.length; var1++) {
					if (class4.field56[var1] != null && class4.field56[var1].field65 == 600) {
						field1355 = field1274 = class4.field56[var1].field62;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method521() {
		while (true) {
			class40 var1 = field1207.method291();
			if (var1 == null) {
				return;
			}

			if (var1.field635 == 0) {
				class32.method137(var1.field637, var1.field636);

				if ((field1207.method287(var1.field636) & 0x62) != 0) {
					field1057 = true;

					if (field1130 != -1) {
						field1224 = true;
					}
				}
			}

			if (var1.field635 == 1 && var1.field637 != null) {
				class8.method59(var1.field637);
			}

			if (var1.field635 == 2 && field1203 == var1.field636 && var1.field637 != null) {
				method470(var1.field637, field1204);
			}

			if (var1.field635 == 3 && field1105 == 1) {
				for (int var2 = 0; var2 < field1425.length; var2++) {
					if (field1261[var2] == var1.field636) {
						field1425[var2] = var1.field637;

						if (var1.field637 == null) {
							field1261[var2] = -1;
						}

						break;
					}

					if (field1262[var2] == var1.field636) {
						field1279[var2] = var1.field637;

						if (var1.field637 == null) {
							field1262[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field635 == 93 && field1207.method286(var1.field636)) {
				class3.method17(field1207, new class39(var1.field637));
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;III)V")
	public final void method522(class36 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field1268 + field1200 & 0x7FF;
			int var6 = class32.field550[var5];
			int var7 = class32.field551[var5];
			var6 = var6 * 256 / (field1236 + 256);
			var7 = var7 * 256 / (field1236 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field1438.method204(83 - var13 - 20, 15, var12 + 94 + 4 - 10, 20, 20, var10, 15, 256);
		} else {
			method514(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.a(IBI)Ljava/lang/String;")
	public static final String method523(int arg0, int arg1) {
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

	@ObfuscatedName("client.y(I)V")
	public static final void method524() {
		class19.field266 = true;
		class35.field573 = true;
		field1176 = true;
		class3.field32 = true;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method525() {
		field1376.method268();
		class35.field584 = field1083;
		field1443.method212(0, 0);

		if (field1276) {
			field1321.method214(0, field1115, 40, 239);
			field1321.method214(128, field1318 + "*", 60, 239);
		} else if (field1095) {
			field1321.method214(0, "Enter amount:", 40, 239);
			field1321.method214(128, field1361 + "*", 60, 239);
		} else if (field1244 != null) {
			field1321.method214(0, field1244, 40, 239);
			field1321.method214(128, "Click to continue", 60, 239);
		} else if (field1130 != -1) {
			method526(class4.field56[field1130], 0, 0, 0);
		} else if (field1286 == -1) {
			class38 var1 = field1320;
			int var2 = 0;
			class34.method167(463, 0, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field1429[var3] != null) {
					int var4 = field1427[var3];
					int var5 = field1259 + 70 - var2 * 14;
					String var6 = field1428[var3];
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
							var1.method217(4, field1429[var3], var5, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1241 == 0 || field1241 == 1 && method480(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field1407[0].method212(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field1407[1].method212(var5 - 12, var8);
								var8 += 14;
							}

							var1.method217(var8, var6 + ":", var5, 0);
							var8 += var1.method216(var6) + 8;
							var1.method217(var8, field1429[var3], var5, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field1227 == 0 && (var4 == 7 || field1292 == 0 || field1292 == 1 && method480(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method217(var9, "From", var5, 0);
							int var11 = var9 + var1.method216("From ");
							if (var7 == 1) {
								field1407[0].method212(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field1407[1].method212(var5 - 12, var11);
								var11 += 14;
							}

							var1.method217(var11, var6 + ":", var5, 0);
							var11 += var1.method216(var6) + 8;
							var1.method217(var11, field1429[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field1378 == 0 || field1378 == 1 && method480(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(4, var6 + " " + field1429[var3], var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field1227 == 0 && field1292 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(4, field1429[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field1227 == 0 && field1292 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(4, "To " + var6 + ":", var5, 0);
							var1.method217(var1.method216("To " + var6) + 12, field1429[var3], var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field1378 == 0 || field1378 == 1 && method480(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method217(4, var6 + " " + field1429[var3], var5, 0x7E3200);
						}

						var2++;
					}
				}
			}

			class34.method166();
			field1437 = var2 * 14 + 7;
			if (field1437 < 78) {
				field1437 = 78;
			}

			method558(0, 77, 463, field1437 - field1259 - 77, field1437);
			String var10;
			if (field1377 == null || field1377.field423 == null) {
				var10 = class52.method314(field1088);
			} else {
				var10 = field1377.field423;
			}

			var1.method217(4, var10 + ":", 90, 0);
			var1.method217(var1.method216(var10 + ": ") + 6, field1396 + "*", 90, 255);
			class34.method173(0, 0, 479, 77);
		} else {
			method526(class4.field56[field1286], 0, 0, 0);
		}

		if (field1413 && field1366 == 2) {
			method449();
		}

		field1376.method269(17, field9, 357);
		field1375.method268();
		class35.field584 = field1085;
	}

	@ObfuscatedName("client.a(Ld;IIII)V")
	public final void method526(class4 arg0, int arg1, int arg2, int arg3) {
		if (arg0.field63 == 0 && arg0.field78 != null && (!arg0.field77 || field1093 == arg0.field61 || field1086 == arg0.field61 || field1343 == arg0.field61)) {
			int var5 = class34.field568;
			int var6 = class34.field566;
			int var7 = class34.field569;
			int var8 = class34.field567;
			class34.method167(arg0.field66 + arg1, arg1, arg3, arg0.field67 + arg3);
			int var9 = arg0.field78.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field79[var10] + arg1;
				int var12 = arg0.field80[var10] + arg3 - arg2;
				class4 var13 = class4.field56[arg0.field78[var10]];
				var11 += var13.field69;
				var12 += var13.field70;

				if (var13.field65 > 0) {
					method486(var13);
				}

				if (var13.field63 == 0) {
					if (var13.field76 > var13.field75 - var13.field67) {
						var13.field76 = var13.field75 - var13.field67;
					}

					if (var13.field76 < 0) {
						var13.field76 = 0;
					}

					method526(var13, var11, var13.field76, var12);

					if (var13.field75 > var13.field67) {
						method558(var12, var13.field67, var13.field66 + var11, var13.field76, var13.field75);
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
									if (var17 > class34.field568 - 32 && var17 < class34.field569 && var18 > class34.field566 - 32 && var18 < class34.field567 || field1252 != 0 && field1251 == var14) {
										int var22 = 0;
										if (field1399 == 1 && field1400 == var14 && field1401 == var13.field61) {
											var22 = 0xFFFFFF;
										}

										class36 var23 = class60.method356(var22, var13.field58[var14], var21);
										if (var23 != null) {
											if (field1252 != 0 && field1251 == var14 && field1250 == var13.field61) {
												var19 = field17 - field1253;
												var20 = field18 - field1254;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field1354 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method201(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < class34.field566 && arg0.field76 > 0) {
													int var24 = (class34.field566 - var18 - var20) * field1315 / 3;
													if (var24 > field1315 * 10) {
														var24 = field1315 * 10;
													}

													if (var24 > arg0.field76) {
														var24 = arg0.field76;
													}

													arg0.field76 -= var24;
													field1254 += var24;
												}

												if (var18 + var20 + 32 > class34.field567 && arg0.field76 < arg0.field75 - arg0.field67) {
													int var25 = (var18 + var20 + 32 - class34.field567) * field1315 / 3;
													if (var25 > field1315 * 10) {
														var25 = field1315 * 10;
													}

													if (var25 > arg0.field75 - arg0.field67 - arg0.field76) {
														var25 = arg0.field75 - arg0.field67 - arg0.field76;
													}

													arg0.field76 += var25;
													field1254 -= var25;
												}
											} else if (field1056 != 0 && field1055 == var14 && field1054 == var13.field61) {
												var23.method201(var17, var18, 128);
											} else {
												var23.method199(var18, var17);
											}

											if (var23.field601 == 33 || var13.field58[var14] != 1) {
												int var26 = var13.field58[var14];
												field1319.method217(var17 + var19 + 1, method459(var26), var18 + var20 + 10, 0);
												field1319.method217(var17 + var19, method459(var26), var18 + var20 + 9, 0xFFFF00);
											}
										}
									}
								} else if (var13.field89 != null && var14 < 20) {
									class36 var27 = var13.field89[var14];
									if (var27 != null) {
										var27.method199(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field63 == 3) {
						boolean var28 = false;
						if (field1343 == var13.field61 || field1086 == var13.field61 || field1093 == var13.field61) {
							var28 = true;
						}

						int var29;
						if (method513(var13)) {
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
								class34.method170(var12, var11, var29, var13.field66, var13.field67);
							} else {
								class34.method171(var29, var12, var13.field66, var13.field67, var11);
							}
						} else if (var13.field93) {
							class34.method169(256 - (var13.field68 & 0xFF), var13.field67, var13.field66, var12, var11, var29);
						} else {
							class34.method172(var13.field67, var12, var13.field66, var29, 256 - (var13.field68 & 0xFF), var11);
						}
					} else if (var13.field63 == 4) {
						class38 var30 = var13.field96;
						String var31 = var13.field97;
						boolean var32 = false;
						if (field1343 == var13.field61 || field1086 == var13.field61 || field1093 == var13.field61) {
							var32 = true;
						}

						int var33;
						if (method513(var13)) {
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

						if (var13.field64 == 6 && field1392) {
							var31 = "Please wait...";
							var33 = var13.field99;
						}

						if (class34.field564 == 479) {
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

									var31 = var31.substring(0, var35) + method546(method485(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method546(method485(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method546(method485(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method546(method485(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method546(method485(4, var13)) + var31.substring(var39 + 2);
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
								var30.method215(var13.field66 / 2 + var11, var33, var13.field95, var34, var41);
							} else {
								var30.method219(var41, var34, var11, var33, var13.field95);
							}

							var34 += var30.field618;
						}
					} else if (var13.field63 == 5) {
						class36 var42;
						if (method513(var13)) {
							var42 = var13.field104;
						} else {
							var42 = var13.field103;
						}

						if (var42 != null) {
							var42.method199(var12, var11);
						}
					} else if (var13.field63 == 6) {
						int var43 = class35.field578;
						int var44 = class35.field579;
						class35.field578 = var13.field66 / 2 + var11;
						class35.field579 = var13.field67 / 2 + var12;
						int var45 = class35.field582[var13.field112] * var13.field111 >> 16;
						int var46 = class35.field583[var13.field112] * var13.field111 >> 16;
						boolean var47 = method513(var13);
						int var48;
						if (var47) {
							var48 = var13.field110;
						} else {
							var48 = var13.field109;
						}

						class32 var49;
						if (var48 == -1) {
							var49 = var13.method34(-1, -1, var47);
						} else {
							class66 var50 = class66.field978[var48];
							var49 = var13.method34(var50.field980[var13.field59], var50.field981[var13.field59], var47);
						}

						if (var49 != null) {
							var49.method159(0, var13.field113, 0, var13.field112, 0, var45, var46);
						}

						class35.field578 = var43;
						class35.field579 = var44;
					} else if (var13.field63 == 7) {
						class38 var51 = var13.field96;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field67; var53++) {
							for (int var54 = 0; var54 < var13.field66; var54++) {
								if (var13.field57[var52] > 0) {
									class60 var55 = class60.method350(var13.field57[var52] - 1);
									String var56 = var55.field898;
									if (var55.field909 || var13.field58[var52] != 1) {
										var56 = var56 + " x" + method534(var13.field58[var52]);
									}

									int var57 = (var13.field87 + 115) * var54 + var11;
									int var58 = (var13.field88 + 12) * var53 + var12;
									if (var13.field94) {
										var51.method215(var13.field66 / 2 + var57, var13.field99, var13.field95, var58, var56);
									} else {
										var51.method219(var56, var58, var57, var13.field99, var13.field95);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			class34.method167(var7, var5, var6, var8);
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method527(int arg0, int arg1) {
		class42 var3 = field1265[field1080][arg0][arg1];
		if (var3 == null) {
			field1257.method85(field1080, arg0, arg1);
		} else {
			int var4 = -99999999;
			class30 var5 = null;
			for (class30 var6 = (class30) var3.method258(); var6 != null; var6 = (class30) var3.method260()) {
				class60 var7 = class60.method350(var6.field455);
				int var8 = var7.field910;
				if (var7.field909) {
					var8 = (var6.field456 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method256(var5);
			class30 var9 = null;
			class30 var10 = null;
			for (class30 var11 = (class30) var3.method258(); var11 != null; var11 = (class30) var3.method260()) {
				if (var5.field455 != var11.field455 && var9 == null) {
					var9 = var11;
				}

				if (var5.field455 != var11.field455 && var9.field455 != var11.field455 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field1257.method71(field1080, var12, var9, var5, arg0, var10, arg1, method501(field1080, arg0 * 128 + 64, arg1 * 128 + 64));
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method528() {
		if (field1252 == 0) {
			int var1 = field23;
			if (field1142 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field1413) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field1366 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field1366 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field1366 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field1367 - 10 || var2 > field1369 + field1367 + 10 || var3 < field1368 - 10 || var3 > field1370 + field1368 + 10) {
						field1413 = false;

						if (field1366 == 1) {
							field1057 = true;
						}

						if (field1366 == 2) {
							field1224 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field1367;
					int var5 = field1368;
					int var6 = field1369;
					int var7 = field24;
					int var8 = field25;
					if (field1366 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field1366 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field1366 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field1147; var10++) {
						int var11 = (field1147 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method505(var9);
					}

					field1413 = false;

					if (field1366 == 1) {
						field1057 = true;
					}

					if (field1366 == 2) {
						field1224 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field1147 > 0) {
					int var12 = field1283[field1147 - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188 || var12 == 1773) {
						int var13 = field1281[field1147 - 1];
						int var14 = field1282[field1147 - 1];
						class4 var15 = class4.field56[var14];
						if (var15.field83 || var15.field86) {
							field1230 = false;
							field1354 = 0;
							field1250 = var14;
							field1251 = var13;
							field1252 = 2;
							field1253 = field24;
							field1254 = field25;

							if (class4.field56[var14].field62 == field1274) {
								field1252 = 1;
							}

							if (class4.field56[var14].field62 == field1130) {
								field1252 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field1046 == 1 || method446(field1147 - 1)) && field1147 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field1147 > 0) {
					method505(field1147 - 1);
				}

				if (var1 != 2 || field1147 <= 0) {
					return;
				}

				method544();
			}
		}
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method529(class39 arg0, int arg1) {
		arg0.method249();
		int var3 = arg0.method250(8);
		if (var3 < field1288) {
			for (int var4 = var3; var4 < field1288; var4++) {
				field1064[field1063++] = field1289[var4];
			}
		}

		if (var3 > field1288) {
			signlink.reporterror(field1088 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field1288 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1289[var5];
			class27 var7 = field1287[var6];
			int var8 = arg0.method250(1);
			if (var8 == 0) {
				field1289[field1288++] = var6;
				var7.field413 = field1060;
			} else {
				int var9 = arg0.method250(2);
				if (var9 == 0) {
					field1289[field1288++] = var6;
					var7.field413 = field1060;
					field1166[field1165++] = var6;
				} else if (var9 == 1) {
					field1289[field1288++] = var6;
					var7.field413 = field1060;
					int var10 = arg0.method250(3);
					var7.method125(var10, false);
					int var11 = arg0.method250(1);
					if (var11 == 1) {
						field1166[field1165++] = var6;
					}
				} else if (var9 == 2) {
					field1289[field1288++] = var6;
					var7.field413 = field1060;
					int var12 = arg0.method250(3);
					var7.method125(var12, true);
					int var13 = arg0.method250(3);
					var7.method125(var13, true);
					int var14 = arg0.method250(1);
					if (var14 == 1) {
						field1166[field1165++] = var6;
					}
				} else if (var9 == 3) {
					field1064[field1063++] = var6;
				}
			}
		}
	}

	public final void init() {
		field1173 = Integer.parseInt(getParameter("nodeid"));
		field1174 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method524();
		} else {
			method451();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1175 = false;
		} else {
			field1175 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method530() {
		byte[] var1 = field1406.method309("title.dat", null);
		class36 var2 = new class36(var1, this);
		field1134.method268();
		var2.method197(0, 0);
		field1135.method268();
		var2.method197(0, -637);
		field1131.method268();
		var2.method197(0, -128);
		field1132.method268();
		var2.method197(-371, -202);
		field1133.method268();
		var2.method197(-171, -202);
		field1136.method268();
		var2.method197(-265, 0);
		field1137.method268();
		var2.method197(-265, -562);
		field1138.method268();
		var2.method197(-171, -128);
		field1139.method268();
		var2.method197(-171, -562);
		int[] var3 = new int[var2.field597];
		for (int var4 = 0; var4 < var2.field598; var4++) {
			for (int var5 = 0; var5 < var2.field597; var5++) {
				var3[var5] = var2.field596[var2.field597 * var4 + var2.field597 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field597; var6++) {
				var2.field596[var2.field597 * var4 + var6] = var3[var6];
			}
		}

		field1134.method268();
		var2.method197(0, 382);
		field1135.method268();
		var2.method197(0, -255);
		field1131.method268();
		var2.method197(0, 254);
		field1132.method268();
		var2.method197(-371, 180);
		field1133.method268();
		var2.method197(-171, 180);
		field1136.method268();
		var2.method197(-265, 382);
		field1137.method268();
		var2.method197(-265, -180);
		field1138.method268();
		var2.method197(-171, 254);
		field1139.method268();
		var2.method197(-171, -180);
		class36 var7 = new class36(field1406, "logo", 0);
		field1131.method268();
		var7.method199(18, 382 - var7.field597 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method531() {
		int var1 = (field1377.field368 >> 7) + field1302;
		int var2 = (field1377.field369 >> 7) + field1303;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			field1285 = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			field1285 = (var2 - 9920) / 8 + 1;
		} else {
			field1285 = 0;
		}

		field1266 = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				field1266 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				field1266 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				field1266 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				field1266 = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				field1266 = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				field1266 = 1;
			}
		}

		if (field1266 == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			field1266 = 2;
		}

		field1106 = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field1106 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field1106 = 1;
		}

		if (field1106 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field1106 = 0;
		}
	}

	@ObfuscatedName("client.a(ILbb;BLmb;I)V")
	public final void method532(int arg0, class28 arg1, class39 arg2, int arg3) {
		if ((arg3 & 0x1) == 1) {
			int var5 = arg2.method239();
			byte[] var6 = new byte[var5];
			class39 var7 = new class39(var6);
			arg2.method248(0, var6, var5);
			field1167[arg0] = var7;
			arg1.method130(var7);
		}

		if ((arg3 & 0x2) == 2) {
			int var8 = arg2.method241();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg1.field396 == var8) {
				arg1.field400 = 0;
			}

			int var9 = arg2.method239();
			if (arg1.field396 == var8 && var8 != -1) {
				int var10 = class66.field978[var8].field992;
				if (var10 == 1) {
					arg1.field397 = 0;
					arg1.field398 = 0;
					arg1.field399 = var9;
					arg1.field400 = 0;
				}

				if (var10 == 2) {
					arg1.field400 = 0;
				}
			} else if (var8 == -1 || arg1.field396 == -1 || class66.field978[var8].field986 >= class66.field978[arg1.field396].field986) {
				arg1.field396 = var8;
				arg1.field397 = 0;
				arg1.field398 = 0;
				arg1.field399 = var9;
				arg1.field400 = 0;
				arg1.field421 = arg1.field416;
			}
		}

		if ((arg3 & 0x4) == 4) {
			arg1.field390 = arg2.method241();
			if (arg1.field390 == 0xFFFF) {
				arg1.field390 = -1;
			}
		}

		if ((arg3 & 0x8) == 8) {
			arg1.field380 = arg2.method246();
			arg1.field382 = 0;
			arg1.field383 = 0;
			arg1.field381 = 150;
			method454(2, arg1.field380, arg1.field423);
		}

		if ((arg3 & 0x10) == 0x10) {
			int var11 = arg2.method239();
			int var12 = arg2.method239();
			arg1.method128(var12, var11);
			arg1.field387 = field1060 + 300;
			arg1.field388 = arg2.method239();
			arg1.field389 = arg2.method239();
		}

		if ((arg3 & 0x20) == 0x20) {
			arg1.field391 = arg2.method241();
			arg1.field392 = arg2.method241();
		}

		if ((arg3 & 0x40) == 0x40) {
			int var13 = arg2.method241();
			int var14 = arg2.method239();
			int var15 = arg2.method239();
			int var16 = arg2.field623;

			if (arg1.field423 != null && arg1.field424) {
				long var17 = class52.method310(arg1.field423);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field1379; var20++) {
						if (field1234[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field1106 == 0) {
					try {
						String var21 = class53.method317(arg2, var15);
						var21 = class71.method403(var21);
						arg1.field380 = var21;
						arg1.field382 = var13 >> 8;
						arg1.field383 = var13 & 0xFF;
						arg1.field381 = 150;

						if (var14 == 2 || var14 == 3) {
							method454(1, var21, "@cr2@" + arg1.field423);
						} else if (var14 == 1) {
							method454(1, var21, "@cr1@" + arg1.field423);
						} else {
							method454(2, var21, arg1.field423);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field623 = var15 + var16;
		}

		if ((arg3 & 0x100) == 0x100) {
			arg1.field401 = arg2.method241();
			int var23 = arg2.method244();
			arg1.field405 = var23 >> 16;
			arg1.field404 = (var23 & 0xFFFF) + field1060;
			arg1.field402 = 0;
			arg1.field403 = 0;

			if (arg1.field404 > field1060) {
				arg1.field402 = -1;
			}

			if (arg1.field401 == 0xFFFF) {
				arg1.field401 = -1;
			}
		}

		if ((arg3 & 0x200) == 0x200) {
			arg1.field406 = arg2.method239();
			arg1.field408 = arg2.method239();
			arg1.field407 = arg2.method239();
			arg1.field409 = arg2.method239();
			arg1.field410 = arg2.method241() + field1060;
			arg1.field411 = arg2.method241() + field1060;
			arg1.field412 = arg2.method239();
			arg1.method126();
		}

		if ((arg3 & 0x400) == 0x400) {
			int var24 = arg2.method239();
			int var25 = arg2.method239();
			arg1.method128(var25, var24);
			arg1.field387 = field1060 + 300;
			arg1.field388 = arg2.method239();
			arg1.field389 = arg2.method239();
		}
	}

	@ObfuscatedName("client.a(ZIIIILd;III)V")
	public final void method533(boolean arg0, int arg1, int arg2, int arg3, class4 arg4, int arg5, int arg6, int arg7) {
		if (field1045) {
			field1170 = 32;
		} else {
			field1170 = 0;
		}

		field1045 = false;
		if (arg6 >= arg1 && arg6 < arg1 + 16 && arg5 >= arg2 && arg5 < arg2 + 16) {
			arg4.field76 -= field1110 * 4;

			if (arg0) {
				field1057 = true;
				return;
			}
		} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg5 >= arg2 + arg7 - 16 && arg5 < arg2 + arg7) {
			arg4.field76 += field1110 * 4;

			if (arg0) {
				field1057 = true;
				return;
			}
		} else if (arg6 >= arg1 - field1170 && arg6 < arg1 + field1170 + 16 && arg5 >= arg2 + 16 && arg5 < arg2 + arg7 - 16 && field1110 > 0) {
			int var9 = (arg7 - 32) * arg7 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg2 - var9 / 2 - 16;
			int var11 = arg7 - var9 - 32;
			arg4.field76 = (arg3 - arg7) * var10 / var11;

			if (arg0) {
				field1057 = true;
			}

			field1045 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method534(int arg0) {
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

	@ObfuscatedName("client.a(ZI)V")
	public final void method535(int arg0) {
		class4 var2 = class4.field56[arg0];
		for (int var3 = 0; var3 < var2.field78.length && var2.field78[var3] != -1; var3++) {
			class4 var4 = class4.field56[var2.field78[var3]];
			if (var4.field63 == 1) {
				method535(var4.field61);
			}

			var4.field59 = 0;
			var4.field60 = 0;
		}
	}

	@ObfuscatedName("client.a(Lgc;IIII)V")
	public final void method536(class59 arg0, int arg1, int arg2, int arg3) {
		if (field1147 < 400) {
			String var5 = arg0.field865;
			if (arg0.field882 != 0) {
				var5 = var5 + method523(arg0.field882, field1377.field429) + " (level-" + arg0.field882 + ")";
			}

			if (field1399 == 1) {
				field1182[field1147] = "Use " + field1403 + " with @yel@" + var5;
				field1283[field1147] = 900;
				field1284[field1147] = arg1;
				field1281[field1147] = arg2;
				field1282[field1147] = arg3;
				field1147++;
			} else if (field1142 != 1) {
				if (arg0.field877 != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.field877[var6] != null && !arg0.field877[var6].equalsIgnoreCase("attack")) {
							field1182[field1147] = arg0.field877[var6] + " @yel@" + var5;

							if (var6 == 0) {
								field1283[field1147] = 728;
							}

							if (var6 == 1) {
								field1283[field1147] = 542;
							}

							if (var6 == 2) {
								field1283[field1147] = 6;
							}

							if (var6 == 3) {
								field1283[field1147] = 963;
							}

							if (var6 == 4) {
								field1283[field1147] = 245;
							}

							field1284[field1147] = arg1;
							field1281[field1147] = arg2;
							field1282[field1147] = arg3;
							field1147++;
						}
					}
				}

				if (arg0.field877 != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.field877[var7] != null && arg0.field877[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.field882 > field1377.field429) {
								var8 = 2000;
							}

							field1182[field1147] = arg0.field877[var7] + " @yel@" + var5;

							if (var7 == 0) {
								field1283[field1147] = var8 + 728;
							}

							if (var7 == 1) {
								field1283[field1147] = var8 + 542;
							}

							if (var7 == 2) {
								field1283[field1147] = var8 + 6;
							}

							if (var7 == 3) {
								field1283[field1147] = var8 + 963;
							}

							if (var7 == 4) {
								field1283[field1147] = var8 + 245;
							}

							field1284[field1147] = arg1;
							field1281[field1147] = arg2;
							field1282[field1147] = arg3;
							field1147++;
						}
					}
				}

				field1182[field1147] = "Examine @yel@" + var5;
				field1283[field1147] = 1607;
				field1284[field1147] = arg1;
				field1281[field1147] = arg2;
				field1282[field1147] = arg3;
				field1147++;
			} else if ((field1144 & 0x2) == 2) {
				field1182[field1147] = field1145 + " @yel@" + var5;
				field1283[field1147] = 265;
				field1284[field1147] = arg1;
				field1281[field1147] = arg2;
				field1282[field1147] = arg3;
				field1147++;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method537(class4 arg0) {
		int var2 = arg0.field65;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field1182[field1147] = "Remove @whi@" + arg0.field97;
				field1283[field1147] = 556;
				field1147++;
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

		field1182[field1147] = "Remove @whi@" + field1311[var2];
		field1283[field1147] = 557;
		field1147++;
		field1182[field1147] = "Message @whi@" + field1311[var2];
		field1283[field1147] = 679;
		field1147++;
		return true;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method538() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field1037[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field1037[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field1038[var10] = (field1037[var10 - 1] + field1037[var10 + 1] + field1037[var10 - 128] + field1037[var10 + 128]) / 4;
			}
		}

		field1344 += 128;
		if (field1344 > field1271.length) {
			field1344 -= field1271.length;
			int var11 = (int) (Math.random() * 12.0D);
			method553(field1310[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field1038[var14 + 128] - field1271[field1344 + var14 & field1271.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field1037[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field1221[var16] = field1221[var16 + 1];
		}

		field1221[var1 - 1] = (int) (Math.sin(field1060 / 14.0D) * 16.0D + Math.sin(field1060 / 15.0D) * 14.0D + Math.sin(field1060 / 16.0D) * 12.0D);

		if (field1326 > 0) {
			field1326 -= 4;
		}

		if (field1327 > 0) {
			field1327 -= 4;
		}

		if (field1326 == 0 && field1327 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field1326 = 1024;
			}

			if (var17 == 1) {
				field1327 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method539() {
		for (class41 var1 = (class41) field1109.method258(); var1 != null; var1 = (class41) field1109.method260()) {
			if (var1.field651 == -1) {
				var1.field650 = 0;
				method503(var1);
			} else {
				var1.method120();
			}
		}
	}

	@ObfuscatedName("client.a(BILmb;)V")
	public final void method540(int arg0, class39 arg1) {
		int var3 = arg1.method250(8);
		if (var3 < field1163) {
			for (int var4 = var3; var4 < field1163; var4++) {
				field1064[field1063++] = field1164[var4];
			}
		}

		if (var3 > field1163) {
			signlink.reporterror(field1088 + " Too many players");
			throw new RuntimeException("eek");
		}

		field1163 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1164[var5];
			class28 var7 = field1162[var6];
			int var8 = arg1.method250(1);
			if (var8 == 0) {
				field1164[field1163++] = var6;
				var7.field413 = field1060;
			} else {
				int var9 = arg1.method250(2);
				if (var9 == 0) {
					field1164[field1163++] = var6;
					var7.field413 = field1060;
					field1166[field1165++] = var6;
				} else if (var9 == 1) {
					field1164[field1163++] = var6;
					var7.field413 = field1060;
					int var10 = arg1.method250(3);
					var7.method125(var10, false);
					int var11 = arg1.method250(1);
					if (var11 == 1) {
						field1166[field1165++] = var6;
					}
				} else if (var9 == 2) {
					field1164[field1163++] = var6;
					var7.field413 = field1060;
					int var12 = arg1.method250(3);
					var7.method125(var12, true);
					int var13 = arg1.method250(3);
					var7.method125(var13, true);
					int var14 = arg1.method250(1);
					if (var14 == 1) {
						field1166[field1165++] = var6;
					}
				} else if (var9 == 3) {
					field1064[field1063++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method541(int arg0) {
		int var2 = class70.field1017[arg0].field1025;
		if (var2 != 0) {
			int var3 = field1066[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					class35.method186(0.9D);
				}

				if (var3 == 2) {
					class35.method186(0.8D);
				}

				if (var3 == 3) {
					class35.method186(0.7D);
				}

				if (var3 == 4) {
					class35.method186(0.6D);
				}

				class60.field936.method117();
				field1419 = true;
			}

			if (var2 == 3) {
				boolean var4 = field1352;

				if (var3 == 0) {
					method463(0, field1352);
					field1352 = true;
				}

				if (var3 == 1) {
					method463(-400, field1352);
					field1352 = true;
				}

				if (var3 == 2) {
					method463(-800, field1352);
					field1352 = true;
				}

				if (var3 == 3) {
					method463(-1200, field1352);
					field1352 = true;
				}

				if (var3 == 4) {
					field1352 = false;
				}

				if (field1352 != var4 && !field1176) {
					if (field1352) {
						field1203 = field1316;
						field1204 = false;
						field1207.method289(2, field1203);
					} else {
						method559();
					}

					field1273 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field1198 = true;
					method542(0);
				}

				if (var3 == 1) {
					field1198 = true;
					method542(-400);
				}

				if (var3 == 2) {
					field1198 = true;
					method542(-800);
				}

				if (var3 == 3) {
					field1198 = true;
					method542(-1200);
				}

				if (var3 == 4) {
					field1198 = false;
				}
			}

			if (var2 == 5) {
				field1046 = var3;
			}

			if (var2 == 6) {
				field1119 = var3;
			}

			if (var2 == 8) {
				field1227 = var3;
				field1224 = true;
			}

			if (var2 == 9) {
				field1290 = var3;
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method542(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method543() {
		if (field1111 > 1) {
			field1111--;
		}

		if (field1043 > 0) {
			field1043--;
		}

		if (field1246 > 0) {
			field1246 -= 2;
		}

		for (int var1 = 0; var1 < 5 && method447(); var1++) {
		}

		if (field1301) {
			method434();
			method547();
			method488();
			class39 var2 = class6.method46();
			if (var2 != null) {
				field1235.method228(253);
				field1235.method230(var2.field623);
				field1235.method237(var2.field622, 0, var2.field623);
				var2.method227();
			}

			field1041++;
			if (field1041 > 750) {
				method556();
			}

			method441();
			method492();
			method484();
			field1315++;

			if (field1129 != 0) {
				field1128 += 20;
				if (field1128 >= 400) {
					field1129 = 0;
				}
			}

			if (field1056 != 0) {
				field1053++;
				if (field1053 >= 15) {
					if (field1056 == 2) {
						field1057 = true;
					}

					if (field1056 == 3) {
						field1224 = true;
					}

					field1056 = 0;
				}
			}

			if (field1252 != 0) {
				field1354++;

				if (field17 > field1253 + 5 || field17 < field1253 - 5 || field18 > field1254 + 5 || field18 < field1254 - 5) {
					field1230 = true;
				}

				if (field16 == 0) {
					if (field1252 == 2) {
						field1057 = true;
					}

					if (field1252 == 3) {
						field1224 = true;
					}

					field1252 = 0;

					if (field1230 && field1354 >= 5) {
						field1097 = -1;
						method478();

						if (field1250 == field1097 && field1251 != field1096) {
							class4 var3 = class4.field56[field1250];
							byte var4 = 0;
							if (field1290 == 1 && var3.field65 == 206) {
								var4 = 1;
							}

							if (var3.field57[field1096] <= 0) {
								var4 = 0;
							}

							if (var3.field86) {
								int var5 = field1251;
								int var6 = field1096;
								var3.field57[var6] = var3.field57[var5];
								var3.field58[var6] = var3.field58[var5];
								var3.field57[var5] = -1;
								var3.field58[var5] = 0;
							} else if (var4 == 1) {
								int var7 = field1251;
								int var8 = field1096;
								while (var7 != var8) {
									if (var7 > var8) {
										var3.method33(var7 - 1, var7);
										var7--;
									} else if (var7 < var8) {
										var3.method33(var7 + 1, var7);
										var7++;
									}
								}
							} else {
								var3.method33(field1096, field1251);
							}

							field1235.method228(199);
							field1235.method230(field1250);
							field1235.method230(field1251);
							field1235.method230(field1096);
							field1235.method229(var4);
						}
					} else if ((field1046 == 1 || method446(field1147 - 1)) && field1147 > 2) {
						method544();
					} else if (field1147 > 0) {
						method505(field1147 - 1);
					}

					field1053 = 10;
					field23 = 0;
				}
			}

			field1205++;
			if (field1205 > 127) {
				field1205 = 0;
				field1235.method228(56);
				field1235.method232(0x4C2B2C);
			}

			if (class19.field300 != -1) {
				int var9 = class19.field300;
				int var10 = class19.field301;
				boolean var11 = method453(var9, 0, true, 0, 0, 0, field1377.field417[0], field1377.field418[0], var10, 0, 0);
				class19.field300 = -1;

				if (var11) {
					field1126 = field24;
					field1127 = field25;
					field1129 = 1;
					field1128 = 0;
				}
			}

			if (field23 == 1 && field1244 != null) {
				field1244 = null;
				field1224 = true;
				field23 = 0;
			}

			method528();
			method465();
			method551();
			method520();

			if (field16 == 1 || field23 == 1) {
				field1110++;
			}

			if (field1105 == 2) {
				method489();
			}

			if (field1105 == 2 && field1388) {
				method471();
			}

			for (int var12 = 0; var12 < 5; var12++) {
				field1390[var12]++;
			}

			method483();
			field15++;
			if (field15 > 4500) {
				field1043 = 250;
				field15 -= 500;
				field1235.method228(17);
			}

			field1357++;
			if (field1357 > 500) {
				field1357 = 0;
				int var13 = (int) (Math.random() * 8.0D);
				if ((var13 & 0x1) == 1) {
					field1324 += field1325;
				}

				if ((var13 & 0x2) == 2) {
					field1073 += field1074;
				}

				if ((var13 & 0x4) == 4) {
					field1411 += field1412;
				}
			}

			if (field1324 < -50) {
				field1325 = 2;
			}

			if (field1324 > 50) {
				field1325 = -2;
			}

			if (field1073 < -55) {
				field1074 = 2;
			}

			if (field1073 > 55) {
				field1074 = -2;
			}

			if (field1411 < -40) {
				field1412 = 1;
			}

			if (field1411 > 40) {
				field1412 = -1;
			}

			field1418++;
			if (field1418 > 500) {
				field1418 = 0;
				int var14 = (int) (Math.random() * 8.0D);
				if ((var14 & 0x1) == 1) {
					field1268 += field1269;
				}

				if ((var14 & 0x2) == 2) {
					field1236 += field1237;
				}
			}

			if (field1268 < -60) {
				field1269 = 2;
			}

			if (field1268 > 60) {
				field1269 = -2;
			}

			if (field1236 < -20) {
				field1237 = 1;
			}

			if (field1236 > 10) {
				field1237 = -1;
			}

			field1275++;
			if (field1275 > 110) {
				field1275 = 0;
				field1235.method228(219);
				field1235.method233(0);
			}

			field1042++;
			if (field1042 > 50) {
				field1235.method228(139);
			}

			try {
				if (field1146 != null && field1235.field623 > 0) {
					field1146.method42(field1235.field622, 0, field1235.field623);
					field1235.field623 = 0;
					field1042 = 0;
				}
			} catch (IOException var16) {
				method556();
			} catch (Exception var17) {
				method469();
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method544() {
		int var1 = field1321.method216("Choose Option");
		for (int var2 = 0; var2 < field1147; var2++) {
			int var3 = field1321.method216(field1182[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field1147 * 15 + 21;
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

			field1413 = true;
			field1366 = 0;
			field1367 = var5;
			field1368 = var6;
			field1369 = var1;
			field1370 = field1147 * 15 + 22;
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

			field1413 = true;
			field1366 = 1;
			field1367 = var7;
			field1368 = var8;
			field1369 = var1;
			field1370 = field1147 * 15 + 22;
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

			field1413 = true;
			field1366 = 2;
			field1367 = var9;
			field1368 = var10;
			field1369 = var1;
			field1370 = field1147 * 15 + 22;
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method545(boolean arg0) {
		method432();
		field1133.method268();
		field1058.method212(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field1323 == 0) {
			int var4 = var3 / 2 + 80;
			field1319.method215(var2 / 2, 0x75A9A9, true, var4, field1207.field734);
			int var5 = var3 / 2 - 20;
			field1321.method215(var2 / 2, 0xFFFF00, true, var5, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field1059.method212(var7 - 20, var6 - 73);
			field1321.method215(var6, 0xFFFFFF, true, var7 + 5, "New user");
			int var8 = var2 / 2 + 80;
			field1059.method212(var7 - 20, var8 - 73);
			field1321.method215(var8, 0xFFFFFF, true, var7 + 5, "Existing User");
		}

		if (field1323 == 2) {
			int var9 = var3 / 2 - 40;
			if (field1225.length() > 0) {
				field1321.method215(var2 / 2, 0xFFFF00, true, var9 - 15, field1225);
				field1321.method215(var2 / 2, 0xFFFF00, true, var9, field1226);
				var9 += 30;
			} else {
				field1321.method215(var2 / 2, 0xFFFF00, true, var9 - 7, field1226);
				var9 += 30;
			}

			field1321.method219("Username: " + field1088 + (field1346 == 0 & field1060 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 90, 0xFFFFFF, true);
			var9 += 15;
			field1321.method219("Password: " + class52.method316(field1089) + (field1346 == 1 & field1060 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 88, 0xFFFFFF, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field1059.method212(var11 - 20, var10 - 73);
				field1321.method215(var10, 0xFFFFFF, true, var11 + 5, "Login");
				int var12 = var2 / 2 + 80;
				field1059.method212(var11 - 20, var12 - 73);
				field1321.method215(var12, 0xFFFFFF, true, var11 + 5, "Cancel");
			}
		}

		if (field1323 == 3) {
			field1321.method215(var2 / 2, 0xFFFF00, true, var3 / 2 - 60, "Create a free account");
			int var13 = var3 / 2 - 35;
			field1321.method215(var2 / 2, 0xFFFFFF, true, var13, "To create a new account you need to");
			var13 += 15;
			field1321.method215(var2 / 2, 0xFFFFFF, true, var13, "go back to the main RuneScape webpage");
			var13 += 15;
			field1321.method215(var2 / 2, 0xFFFFFF, true, var13, "and choose the red 'create account'");
			var13 += 15;
			field1321.method215(var2 / 2, 0xFFFFFF, true, var13, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field1059.method212(var15 - 20, var14 - 73);
			field1321.method215(var14, 0xFFFFFF, true, var15 + 5, "Cancel");
		}

		field1133.method269(202, field9, 171);

		if (field1419) {
			field1419 = false;
			field1131.method269(128, field9, 0);
			field1132.method269(202, field9, 371);
			field1136.method269(0, field9, 265);
			field1137.method269(562, field9, 265);
			field1138.method269(128, field9, 171);
			field1139.method269(562, field9, 171);
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public final String method546(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.F(I)V")
	public final void method547() {
		if (field1105 == 2) {
			for (class41 var1 = (class41) field1109.method258(); var1 != null; var1 = (class41) field1109.method260()) {
				if (var1.field651 > 0) {
					var1.field651--;
				}

				if (var1.field651 != 0) {
					if (var1.field650 > 0) {
						var1.field650--;
					}

					if (var1.field650 == 0 && var1.field642 >= 1 && var1.field643 >= 1 && var1.field642 <= 102 && var1.field643 <= 102 && (var1.field647 < 0 || class3.method30(var1.field647, var1.field649))) {
						method477(var1.field647, var1.field649, var1.field643, var1.field640, var1.field648, var1.field641, var1.field642);
						var1.field650 = -1;

						if (var1.field647 == var1.field644 && var1.field644 == -1) {
							var1.method120();
						} else if (var1.field647 == var1.field644 && var1.field648 == var1.field645 && var1.field649 == var1.field646) {
							var1.method120();
						}
					}
				} else if (var1.field644 < 0 || class3.method30(var1.field644, var1.field646)) {
					method477(var1.field644, var1.field646, var1.field643, var1.field640, var1.field645, var1.field641, var1.field642);
					var1.method120();
				}
			}

			field1270++;
			if (field1270 > 85) {
				field1270 = 0;
				field1235.method228(211);
				return;
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method548() {
		field1374.method268();
		int var1 = field1268 + field1200 & 0x7FF;
		int var2 = field1377.field368 / 32 + 48;
		int var3 = 464 - field1377.field369 / 32;
		field1071.method203(5, var2, field1243, 151, 146, var3, var1, 25, field1236 + 256, field1391);
		field1214.method203(0, 25, field1341, 33, 33, 25, field1200, 0, 256, field1300);

		for (int var4 = 0; var4 < field1312; var4++) {
			int var5 = field1313[var4] * 4 + 2 - field1377.field368 / 32;
			int var6 = field1314[var4] * 4 + 2 - field1377.field369 / 32;
			method514(var6, var5, field1423[var4]);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				class42 var9 = field1265[field1080][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - field1377.field368 / 32;
					int var11 = var8 * 4 + 2 - field1377.field369 / 32;
					method514(var11, var10, field1216);
				}
			}
		}

		for (int var12 = 0; var12 < field1288; var12++) {
			class27 var13 = field1287[field1289[var12]];
			if (var13 != null && var13.method127() && var13.field422.field881) {
				int var14 = var13.field368 / 32 - field1377.field368 / 32;
				int var15 = var13.field369 / 32 - field1377.field369 / 32;
				method514(var15, var14, field1217);
			}
		}

		for (int var16 = 0; var16 < field1163; var16++) {
			class28 var17 = field1162[field1164[var16]];
			if (var17 != null && var17.method127()) {
				int var18 = var17.field368 / 32 - field1377.field368 / 32;
				int var19 = var17.field369 / 32 - field1377.field369 / 32;
				boolean var20 = false;
				long var21 = class52.method310(var17.field423);
				for (int var23 = 0; var23 < field1409; var23++) {
					if (field1294[var23] == var21 && field1264[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					method514(var19, var18, field1219);
				} else {
					method514(var19, var18, field1218);
				}
			}
		}

		if (field1267 != 0 && field1060 % 20 < 10) {
			if (field1267 == 1 && field1220 >= 0 && field1220 < field1287.length) {
				class27 var24 = field1287[field1220];
				if (var24 != null) {
					int var25 = var24.field368 / 32 - field1377.field368 / 32;
					int var26 = var24.field369 / 32 - field1377.field369 / 32;
					method522(field1296, var25, var26);
				}
			}

			if (field1267 == 2) {
				int var27 = (field1188 - field1302) * 4 + 2 - field1377.field368 / 32;
				int var28 = (field1189 - field1303) * 4 + 2 - field1377.field369 / 32;
				method522(field1296, var27, var28);
			}

			if (field1267 == 10 && field1242 >= 0 && field1242 < field1162.length) {
				class28 var29 = field1162[field1242];
				if (var29 != null) {
					int var30 = var29.field368 / 32 - field1377.field368 / 32;
					int var31 = var29.field369 / 32 - field1377.field369 / 32;
					method522(field1296, var30, var31);
				}
			}
		}

		if (field1069 != 0) {
			int var32 = field1069 * 4 + 2 - field1377.field368 / 32;
			int var33 = field1070 * 4 + 2 - field1377.field369 / 32;
			method514(var33, var32, field1295);
		}

		class34.method170(78, 97, 0xFFFFFF, 3, 3);
		field1375.method268();
	}

	@ObfuscatedName("client.G(I)V")
	public void method549() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1386);

		if (field1207 != null) {
			System.out.println("Od-cycle:" + field1207.field748);
		}

		System.out.println("loop-cycle:" + field1060);
		System.out.println("draw-cycle:" + field1278);
		System.out.println("ptype:" + field1040);
		System.out.println("psize:" + field1039);

		if (field1146 != null) {
			field1146.method43();
		}

		field6 = true;
	}

	@ObfuscatedName("client.c(Z)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method7() {
		if (!field1389 && !field1172 && !field1426) {
			field1060++;

			if (field1301) {
				method543();
			} else {
				method458();
			}

			method521();
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method550() {
		field1328 = 0;
		for (int var1 = -1; var1 < field1288 + field1163; var1++) {
			class26 var2;
			if (var1 == -1) {
				var2 = field1377;
			} else if (var1 < field1163) {
				var2 = field1162[field1164[var1]];
			} else {
				var2 = field1287[field1289[var1 - field1163]];
			}

			if (var2 != null && var2.method127()) {
				if (var1 >= field1163) {
					class59 var6 = ((class27) var2).field422;
					if (var6.field888 >= 0 && var6.field888 < field1090.length) {
						method475(var2.field414 + 15, var2);

						if (field1107 > -1) {
							field1090[var6.field888].method199(field1108 - 30, field1107 - 12);
						}
					}

					if (field1267 == 1 && field1289[var1 - field1163] == field1220 && field1060 % 20 < 10) {
						method475(var2.field414 + 15, var2);

						if (field1107 > -1) {
							field1090[2].method199(field1108 - 28, field1107 - 12);
						}
					}
				} else {
					int var3 = 30;
					class28 var4 = (class28) var2;
					if (var4.field426 != 0) {
						method475(var2.field414 + 15, var2);

						if (field1107 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.field426 & 1 << var5) != 0) {
									field1090[var5].method199(field1108 - var3, field1107 - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field1267 == 10 && field1164[var1] == field1242) {
						method475(var2.field414 + 15, var2);

						if (field1107 > -1) {
							field1090[7].method199(field1108 - var3, field1107 - 12);
						}
					}
				}

				if (var2.field380 != null && (var1 >= field1163 || field1241 == 0 || field1241 == 3 || field1241 == 1 && method480(((class28) var2).field423))) {
					method475(var2.field414, var2);

					if (field1107 > -1 && field1328 < field1329) {
						field1333[field1328] = field1321.method216(var2.field380) / 2;
						field1332[field1328] = field1321.field618;
						field1330[field1328] = field1107;
						field1331[field1328] = field1108;
						field1334[field1328] = var2.field382;
						field1335[field1328] = var2.field383;
						field1336[field1328] = var2.field381;
						field1337[field1328++] = var2.field380;

						if (field1119 == 0 && var2.field383 == 1) {
							field1332[field1328] += 10;
							field1331[field1328] += 5;
						}

						if (field1119 == 0 && var2.field383 == 2) {
							field1333[field1328] = 60;
						}
					}
				}

				if (var2.field387 > field1060) {
					method475(var2.field414 + 15, var2);

					if (field1107 > -1) {
						int var7 = var2.field388 * 30 / var2.field389;
						if (var7 > 30) {
							var7 = 30;
						}

						class34.method170(field1108 - 3, field1107 - 15, 0xFF00, var7, 5);
						class34.method170(field1108 - 3, field1107 - 15 + var7, 0xFF0000, 30 - var7, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field386[var8] > field1060) {
						method475(var2.field414 / 2, var2);

						if (field1107 > -1) {
							if (var8 == 1) {
								field1108 -= 20;
							}

							if (var8 == 2) {
								field1107 -= 15;
								field1108 -= 10;
							}

							if (var8 == 3) {
								field1107 += 15;
								field1108 -= 10;
							}

							field1183[var2.field385[var8]].method199(field1108 - 12, field1107 - 12);
							field1319.method214(0, String.valueOf(var2.field384[var8]), field1108 + 4, field1107);
							field1319.method214(0xFFFFFF, String.valueOf(var2.field384[var8]), field1108 + 3, field1107 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field1328; var9++) {
			int var10 = field1330[var9];
			int var11 = field1331[var9];
			int var12 = field1333[var9];
			int var13 = field1332[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1331[var15] - field1332[var15] && var11 - var13 < field1331[var15] + 2 && var10 - var12 < field1333[var15] + field1330[var15] && var10 + var12 > field1330[var15] - field1333[var15] && field1331[var15] - field1332[var15] < var11) {
						var11 = field1331[var15] - field1332[var15];
						var14 = true;
					}
				}
			}

			field1107 = field1330[var9];
			field1108 = field1331[var9] = var11;
			String var16 = field1337[var9];
			if (field1119 == 0) {
				int var17 = 0xFFFF00;
				if (field1334[var9] < 6) {
					var17 = field1184[field1334[var9]];
				}

				if (field1334[var9] == 6) {
					var17 = field1342 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field1334[var9] == 7) {
					var17 = field1342 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field1334[var9] == 8) {
					var17 = field1342 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field1334[var9] == 9) {
					int var18 = 150 - field1336[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field1334[var9] == 10) {
					int var19 = 150 - field1336[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field1334[var9] == 11) {
					int var20 = 150 - field1336[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field1335[var9] == 0) {
					field1321.method214(0, var16, field1108 + 1, field1107);
					field1321.method214(var17, var16, field1108, field1107);
				}

				if (field1335[var9] == 1) {
					field1321.method218(field1107, field1108 + 1, 0, field1342, var16);
					field1321.method218(field1107, field1108, var17, field1342, var16);
				}

				if (field1335[var9] == 2) {
					int var21 = field1321.method216(var16);
					int var22 = (150 - field1336[var9]) * (var21 + 100) / 150;
					class34.method167(field1107 + 50, field1107 - 50, 0, 334);
					field1321.method217(field1107 + 50 - var22, var16, field1108 + 1, 0);
					field1321.method217(field1107 + 50 - var22, var16, field1108, var17);
					class34.method166();
				}
			} else {
				field1321.method214(0, var16, field1108 + 1, field1107);
				field1321.method214(0xFFFF00, var16, field1108, field1107);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method551() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field1398[0] != -1) {
				field1057 = true;
				field1044 = 0;
				field1338 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field1398[1] != -1) {
				field1057 = true;
				field1044 = 1;
				field1338 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field1398[2] != -1) {
				field1057 = true;
				field1044 = 2;
				field1338 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field1398[3] != -1) {
				field1057 = true;
				field1044 = 3;
				field1338 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field1398[4] != -1) {
				field1057 = true;
				field1044 = 4;
				field1338 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field1398[5] != -1) {
				field1057 = true;
				field1044 = 5;
				field1338 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field1398[6] != -1) {
				field1057 = true;
				field1044 = 6;
				field1338 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field1398[7] != -1) {
				field1057 = true;
				field1044 = 7;
				field1338 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field1398[8] != -1) {
				field1057 = true;
				field1044 = 8;
				field1338 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field1398[9] != -1) {
				field1057 = true;
				field1044 = 9;
				field1338 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field1398[10] != -1) {
				field1057 = true;
				field1044 = 10;
				field1338 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field1398[11] != -1) {
				field1057 = true;
				field1044 = 11;
				field1338 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field1398[12] != -1) {
				field1057 = true;
				field1044 = 12;
				field1338 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field1398[13] != -1) {
				field1057 = true;
				field1044 = 13;
				field1338 = true;
			}

			field1120++;
			if (field1120 > 150) {
				field1120 = 0;
				field1235.method228(16);
				field1235.method229(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method552(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1429[var4] != null) {
				int var5 = field1427[var4];
				int var6 = field1259 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field1428[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1241 == 0 || field1241 == 1 && method480(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1377.field423)) {
						if (field1140 >= 1) {
							field1182[field1147] = "Report abuse @whi@" + var7;
							field1283[field1147] = 34;
							field1147++;
						}

						field1182[field1147] = "Add ignore @whi@" + var7;
						field1283[field1147] = 436;
						field1147++;
						field1182[field1147] = "Add friend @whi@" + var7;
						field1283[field1147] = 406;
						field1147++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field1227 == 0 && (var5 == 7 || field1292 == 0 || field1292 == 1 && method480(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field1140 >= 1) {
							field1182[field1147] = "Report abuse @whi@" + var7;
							field1283[field1147] = 34;
							field1147++;
						}

						field1182[field1147] = "Add ignore @whi@" + var7;
						field1283[field1147] = 436;
						field1147++;
						field1182[field1147] = "Add friend @whi@" + var7;
						field1283[field1147] = 406;
						field1147++;
					}

					var3++;
				}

				if (var5 == 4 && (field1378 == 0 || field1378 == 1 && method480(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1182[field1147] = "Accept trade @whi@" + var7;
						field1283[field1147] = 903;
						field1147++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field1227 == 0 && field1292 < 2) {
					var3++;
				}

				if (var5 == 8 && (field1378 == 0 || field1378 == 1 && method480(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field1182[field1147] = "Accept duel @whi@" + var7;
						field1283[field1147] = 363;
						field1147++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;I)V")
	public final void method553(class37 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field1271.length; var3++) {
			field1271[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field1271[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field1272[var9] = (field1271[var9 - 1] + field1271[var9 + 1] + field1271[var9 - 128] + field1271[var9 + 128]) / 4;
				}
			}

			int[] var10 = field1271;
			field1271 = field1272;
			field1272 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field606; var12++) {
				for (int var13 = 0; var13 < arg0.field605; var13++) {
					if (arg0.field603[var11++] != 0) {
						int var14 = var13 + arg0.field607 + 16;
						int var15 = var12 + arg0.field608 + 16;
						int var16 = (var15 << 7) + var14;
						field1271[var16] = 0;
					}
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 252);

			if (arg0.length == 5) {
				field1173 = Integer.parseInt(arg0[0]);
				field1174 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method524();
				} else if (arg0[2].equals("highmem")) {
					method451();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field1175 = false;
				} else if (arg0[3].equals("members")) {
					field1175 = true;
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

	@ObfuscatedName("client.I(I)Ljava/lang/String;")
	public final String method554() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void method555(class39 arg0, int arg1) {
		while (arg0.field624 + 10 < arg1 * 8) {
			int var3 = arg0.method250(11);
			if (var3 == 2047) {
				break;
			}

			if (field1162[var3] == null) {
				field1162[var3] = new class28();
				if (field1167[var3] != null) {
					field1162[var3].method130(field1167[var3]);
				}
			}

			field1164[field1163++] = var3;
			class28 var4 = field1162[var3];
			var4.field413 = field1060;
			int var5 = arg0.method250(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method250(1);
			var4.method124(var7 == 1, field1377.field418[0] + var6, field1377.field417[0] + var5);
			int var8 = arg0.method250(1);
			if (var8 == 1) {
				field1166[field1165++] = var3;
			}
		}

		arg0.method251();
	}

	@ObfuscatedName("client.J(I)V")
	public final void method556() {
		if (field1043 > 0) {
			method469();
		} else {
			field1375.method268();
			field1320.method214(0, "Connection lost", 144, 257);
			field1320.method214(0xFFFFFF, "Connection lost", 143, 256);
			field1320.method214(0, "Please wait - attempting to reestablish", 159, 257);
			field1320.method214(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
			field1375.method269(4, field9, 4);
			field1069 = 0;
			class5 var1 = field1146;
			field1301 = false;
			method509(field1088, field1089, true);

			if (!field1301) {
				method469();
			}

			try {
				var1.method38();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BI[B)Z")
	public final boolean method557(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(ZIIIII)V")
	public final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field1297.method212(arg0, arg2);
		field1298.method212(arg0 + arg1 - 16, arg2);
		class34.method170(arg0 + 16, arg2, field1449, 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg3 / (arg4 - arg1);
		class34.method170(arg0 + var7 + 16, arg2, field1340, 16, var6);
		class34.method175(var6, field1210, arg0 + var7 + 16, arg2);
		class34.method175(var6, field1210, arg0 + var7 + 16, arg2 + 1);
		class34.method173(field1210, arg2, 16, arg0 + var7 + 16);
		class34.method173(field1210, arg2, 16, arg0 + var7 + 17);
		class34.method175(var6, field1233, arg0 + var7 + 16, arg2 + 15);
		class34.method175(var6 - 1, field1233, arg0 + var7 + 17, arg2 + 14);
		class34.method173(field1233, arg2, 16, arg0 + var7 + var6 + 15);
		class34.method173(field1233, arg2 + 1, 15, arg0 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method559() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.K(I)V")
	public final void method560() {
		field1058 = new class37(field1406, "titlebox", 0);
		field1059 = new class37(field1406, "titlebutton", 0);
		field1310 = new class37[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field1310[var1] = new class37(field1406, "runes", var1);
		}

		field1222 = new class36(128, 265);
		field1223 = new class36(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field1222.field596[var2] = field1134.field656[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field1223.field596[var3] = field1135.field656[var3];
		}

		field1446 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field1446[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field1446[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field1446[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field1446[var7 + 192] = 0xFFFFFF;
		}

		field1447 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field1447[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field1447[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field1447[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field1447[var11 + 192] = 0xFFFFFF;
		}

		field1448 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field1448[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field1448[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field1448[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field1448[var15 + 192] = 0xFFFFFF;
		}

		field1445 = new int[256];
		field1271 = new int[32768];
		field1272 = new int[32768];
		method553(null);
		field1037 = new int[32768];
		field1038 = new int[32768];
		method13("Connecting to fileserver", 10);

		if (!field1061) {
			field1208 = true;
			field1061 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method561() {
		if (field1267 == 2) {
			method476(field1190 * 2, (field1188 - field1302 << 7) + field1191, (field1189 - field1303 << 7) + field1192);

			if (field1107 > -1 && field1060 % 20 < 10) {
				field1090[2].method199(field1108 - 28, field1107 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method562(int arg0, class39 arg1) {
		for (int var3 = 0; var3 < field1165; var3++) {
			int var4 = field1166[var3];
			class27 var5 = field1287[var4];
			int var6 = arg1.method239();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.method239();
				int var8 = arg1.method239();
				var5.method128(var8, var7);
				var5.field387 = field1060 + 300;
				var5.field388 = arg1.method239();
				var5.field389 = arg1.method239();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.method241();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.field396 == var9) {
					var5.field400 = 0;
				}

				int var10 = arg1.method239();
				if (var5.field396 == var9 && var9 != -1) {
					int var11 = class66.field978[var9].field992;
					if (var11 == 1) {
						var5.field397 = 0;
						var5.field398 = 0;
						var5.field399 = var10;
						var5.field400 = 0;
					}

					if (var11 == 2) {
						var5.field400 = 0;
					}
				} else if (var9 == -1 || var5.field396 == -1 || class66.field978[var9].field986 >= class66.field978[var5.field396].field986) {
					var5.field396 = var9;
					var5.field397 = 0;
					var5.field398 = 0;
					var5.field399 = var10;
					var5.field400 = 0;
					var5.field421 = var5.field416;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.field390 = arg1.method241();
				if (var5.field390 == 0xFFFF) {
					var5.field390 = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.field380 = arg1.method246();
				var5.field381 = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.method239();
				int var13 = arg1.method239();
				var5.method128(var13, var12);
				var5.field387 = field1060 + 300;
				var5.field388 = arg1.method239();
				var5.field389 = arg1.method239();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.field422 = class59.method344(arg1.method241());
				var5.field372 = var5.field422.field867;
				var5.field375 = var5.field422.field871;
				var5.field376 = var5.field422.field872;
				var5.field377 = var5.field422.field873;
				var5.field378 = var5.field422.field874;
				var5.field373 = var5.field422.field870;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.field401 = arg1.method241();
				int var14 = arg1.method244();
				var5.field405 = var14 >> 16;
				var5.field404 = (var14 & 0xFFFF) + field1060;
				var5.field402 = 0;
				var5.field403 = 0;

				if (var5.field404 > field1060) {
					var5.field402 = -1;
				}

				if (var5.field401 == 0xFFFF) {
					var5.field401 = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.field391 = arg1.method241();
				var5.field392 = arg1.method241();
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1293[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1345[var3] = var2 / 4;
		}
	}
}
